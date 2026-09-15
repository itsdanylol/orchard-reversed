import java.io.*;
import java.net.*;
import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;

public class ObfDump {
   static ClassLoader loader;
   static Method strTransform;
   static Map<String, Class<?>> loaded = new HashMap<>();
   static Set<String> failedInit = new HashSet<>();
   static int ok = 0, fail = 0;
   static Map<String, Object> lazyVars = new HashMap<>();

   public static void main(String[] args) throws Exception {
      String jarPath = args[0], callsPath = args[1];
      loader = new URLClassLoader(new URL[]{ new File(jarPath).toURI().toURL() }, ObfDump.class.getClassLoader());
      try {
         Class<?> strUtil = Class.forName("k74.x.IlIIllIII", true, loader);
         for (Method m : strUtil.getDeclaredMethods()) {
            if (Modifier.isStatic(m.getModifiers()) && m.getParameterCount() == 1 && m.getParameterTypes()[0] == String.class && m.getReturnType() == String.class && m.getName().equals("lI")) {
               m.setAccessible(true);
               strTransform = m;
               break;
            }
         }
      } catch (Throwable t) {
         System.out.println("!! IlIIllIII init failed: " + t);
      }

      for (String ln : Files.readAllLines(Paths.get(callsPath))) {
         String[] p = ln.split("\t", 4);
         if (p.length < 4) continue;
         String cls = p[0].replace('/', '.'), meth = p[1], varstr = p[2], expr = p[3];
         String fqcn = "k74." + cls;
         Class<?> c = getClass(fqcn);
         if (c == null) { System.out.println("LOADFAIL " + fqcn); fail++; continue; }
         lazyVars.clear();
         if (!varstr.isEmpty()) {
            for (String kv : varstr.split("\\|")) {
               int tilde = kv.indexOf('~');
               if (tilde > 0) lazyVars.put(kv.substring(0, tilde), kv.substring(tilde+1));
            }
         }
         try {
            Object r = evalExpr(expr, null, fqcn);
            if (r instanceof String s) {
               String out = s;
               if (strTransform != null) out = (String) strTransform.invoke(null, s);
               System.out.println("[" + cls + "." + meth + "] => " + out);
               ok++;
            } else {
               fail++;
            }
         } catch (Throwable t) {
            Throwable cur = t instanceof InvocationTargetException it && it.getCause() != null ? it.getCause() : t;
            System.out.println("EVALFAIL " + fqcn + "." + meth + " :: " + ' ' + " -> " + cur);
            fail++;
         }
      }
      System.out.println("done ok=" + ok + " fail=" + fail + " loaded=" + loaded.size());
   }

   static Class<?> getClass(String fqcn) {
      if (loaded.containsKey(fqcn)) return loaded.get(fqcn);
      if (failedInit.contains(fqcn)) return null;
      try {
         Class<?> c = Class.forName(fqcn, true, loader);
         loaded.put(fqcn, c);
         return c;
      } catch (Throwable t) {
         failedInit.add(fqcn);
         return null;
      }
   }

   // varTable maps var name -> expression text (lazy, memoized)
   static Integer evalVar(String name, String fqcn) {
      if (lazyVars.containsKey(name)) {
         Object o = lazyVars.get(name);
         lazyVars.remove(name);
         String expr = (o instanceof String) ? (String) o : null;
         try {
            Object r = evalExpr(expr, null, fqcn);
            if (r instanceof Integer i) return i;
            if (r instanceof Number n) return n.intValue();
            if (r instanceof Character ch) return (int) ch;
         } catch (Throwable t) {}
      }
      return null;
   }

   // expr: int | long N | cast | varN | A ^ B | A + B | fn(args) | FIELD[expr]
   static Object evalExpr(String s, Integer[] idxOut, String fqcn) {
      s = s.trim();
      if (s.isEmpty()) return null;
      int depth = 0;
      for (int i = s.length()-1; i >= 0; i--) {
         char c = s.charAt(i);
         if (c == ')') depth++;
         else if (c == '(') depth--;
         else if (depth == 0 && (c == '^' || c == '+')) {
            Object l = evalExpr(s.substring(0, i), null, fqcn);
            Object r = evalExpr(s.substring(i+1), null, fqcn);
            if (l instanceof Integer li && r instanceof Integer ri) {
               return (c == '^') ? (li ^ ri) : (li + ri);
            }
            return null;
         }
      }
      // array/field index: NAME[expr] or NAME[expr][expr]
      int br = s.indexOf('[');
      if (br > 0 && s.endsWith("]")) {
         String base = s.substring(0, br).trim();
         if (base.matches("[A-Za-z_$][\\w$]*")) {
            String inner = s.substring(br+1, s.length()-1);
            Object arr = getStaticField(fqcn, base);
            if (arr != null) {
               Integer idx = evalIdx(inner, fqcn);
               if (idx != null) {
                  if (arr instanceof Object[] a && idx >= 0 && idx < a.length) return a[idx];
                  if (arr instanceof int[] a2 && idx >= 0 && idx < a2.length) return a2[idx];
                  if (arr instanceof byte[][] a3 && idx >= 0 && idx < a3.length) return a3[idx];
               }
            }
            return null;
         }
         return null;
      }
      if (s.startsWith("(byte)")) { Object v = evalExpr(s.substring(6), null, fqcn); return v instanceof Number n ? n.byteValue() : null; }
      if (s.startsWith("(short)")) { Object v = evalExpr(s.substring(7), null, fqcn); return v instanceof Number n ? n.shortValue() : null; }
      if (s.startsWith("(char)")) { Object v = evalExpr(s.substring(6), null, fqcn); return v instanceof Number n ? (char) n.intValue() : null; }
      if (s.startsWith("(int)")) { Object v = evalExpr(s.substring(5), null, fqcn); return v instanceof Number n ? n.intValue() : null; }
      if (s.startsWith("(long)")) { Object v = evalExpr(s.substring(6), null, fqcn); return v instanceof Number n ? n.longValue() : null; }
      if (s.startsWith("(") && s.endsWith(")") && balanced(s, 0)) return evalExpr(s.substring(1, s.length()-1), null, fqcn);
      if (s.matches("-?\\d+L?")) {
         s = s.replace("L", "");
         return Integer.parseInt(s);
      }
      if (s.startsWith("'") && s.endsWith("'") && s.length() >= 3) {
         String ch = s.substring(1, s.length()-1);
         if (ch.startsWith("\\")) {
            if (ch.length() > 2 && ch.charAt(1) == 'u') {
               try { return (int)(char) Integer.parseInt(ch.substring(2), 16); } catch (Throwable t) { return null; }
            }
            return (int) ch.charAt(0);
         }
         return (int) ch.charAt(0);
      }
      if (s.matches("var\\d+")) return evalVar(s, fqcn);
      int p0 = s.indexOf('(');
      if (p0 > 0 && s.endsWith(")") && s.charAt(0) != '(') {
         String fn = s.substring(0, p0).trim();
         String argsrc = s.substring(p0+1, s.length()-1);
         List<String> parts = splitArgs(argsrc);
         Object target = null;
         String clsName = fqcn;
         String methName = fn;
         int dot = fn.indexOf('.');
         if (dot > 0) {
            String fq = fn.substring(0, dot);
            if (fq.startsWith("k74.")) {
               clsName = fq;
               methName = fn.substring(dot+1);
            } else return null;
         }
         Object[] vals = new Object[parts.size()];
         boolean allInt = true;
         for (int i = 0; i < parts.size(); i++) {
            Object v = evalExpr(parts.get(i), null, fqcn);
            if (!(v instanceof Integer)) allInt = false;
            vals[i] = v;
         }
         if (allInt) {
            Object r = invokeStatic(clsName, methName, vals);
            // handle .toCharArray() postfix chains
            return r;
         }
         return null;
      }
      // method call with char[] first param + toCharArray() chain: skip complex
      return null;
   }

   static Integer evalIdx(String s, String fqcn) {
      s = s.trim();
      // may contain nested calls
      int p0 = s.indexOf('(');
      if (p0 > 0 && s.endsWith(")")) {
         try {
            Object r = evalExpr(s, null, fqcn);
            if (r instanceof Integer i) return i;
         } catch (Throwable t) { return null; }
         return null;
      }
      if (s.matches("-?\\d+")) return Integer.parseInt(s);
      return null;
   }

   static Object getStaticField(String fqcn, String name) {
      Class<?> c = getClass(fqcn);
      if (c == null) return null;
      try {
         Field f = c.getDeclaredField(name);
         f.setAccessible(true);
         return f.get(null);
      } catch (Throwable t) {
         return null;
      }
   }

   static boolean balanced(String s, int from) {
      int d = 0;
      for (int i = from; i < s.length(); i++) {
         char c = s.charAt(i);
         if (c == '(') d++;
         else if (c == ')') { d--; if (d == 0) return i == s.length()-1; }
      }
      return false;
   }

   static List<String> splitArgs(String s) {
      List<String> parts = new ArrayList<>();
      int d = 0; StringBuilder cur = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
         if (c == '(') d++;
         if (c == ')') d--;
         if (c == ',' && d == 0) { parts.add(cur.toString()); cur.setLength(0); }
         else cur.append(c);
      }
      String last = cur.toString();
      if (!last.trim().isEmpty() || !parts.isEmpty()) parts.add(last);
      return parts;
   }

   static Object invokeStatic(String fqcn, String fn, Object[] vals) {
      Class<?> c = getClass(fqcn);
      if (c == null) throw new RuntimeException("no class " + fqcn);
      for (Method m : c.getDeclaredMethods()) {
         if (m.getName().equals(fn) && Modifier.isStatic(m.getModifiers()) && m.getParameterCount() == vals.length) {
            try {
               m.setAccessible(true);
               return m.invoke(null, coerce(vals, m.getParameterTypes()));
            } catch (Throwable t) {
               Throwable r = t instanceof InvocationTargetException it && it.getCause() != null ? it.getCause() : t;
               throw new RuntimeException(r);
            }
         }
      }
      throw new RuntimeException("no method " + fqcn + "." + fn + "/" + vals.length);
   }

   static Object[] coerce(Object[] vals, Class<?>[] types) {
      Object[] out = new Object[vals.length];
      for (int i = 0; i < vals.length; i++) {
         Object v = vals[i];
         Class<?> t = types[i];
         if (v == null) { out[i] = null; continue; }
         if (t == int.class) out[i] = ((Number)v).intValue();
         else if (t == long.class) out[i] = ((Number)v).longValue();
         else if (t == byte.class) out[i] = ((Number)v).byteValue();
         else if (t == short.class) out[i] = ((Number)v).shortValue();
         else if (t == char.class) out[i] = (char) ((Number)v).intValue();
         else out[i] = v;
      }
      return out;
   }
}
