import java.io.*;
import java.net.*;
import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;

public class FieldDump {
   public static void main(String[] args) throws Exception {
      URLClassLoader stubL = new URLClassLoader(new URL[]{
         new File("C:\\Users\\dany1\\AppData\\Local\\Temp\\opencode\\stubs").toURI().toURL(),
         new File("C:\\Users\\dany1\\AppData\\Local\\Temp\\opencode\\gson.jar").toURI().toURL(),
         new File("C:\\Users\\dany1\\AppData\\Local\\Temp\\opencode\\slf4j.jar").toURI().toURL() }, FieldDump.class.getClassLoader());
      URLClassLoader l = new URLClassLoader(new URL[]{ new File("C:\\Users\\dany1\\Downloads\\orchard-1.21.11.jar").toURI().toURL() }, stubL);

      String[] targets = args.length > 0 ? args : new String[]{ "k74.x.lIlIl", "k74.x.IIIllIIII", "k74.x.lIllllI", "k74.x.IlIIIIIIl", "k74.x.lllIlIII", "k74.x.llIlIlIl", "k74.x.IlIIIIII" };
      for (String fq : targets) {
         System.out.println("=== " + fq);
         try {
            Class<?> c = Class.forName(fq, true, l);
            for (Field f : c.getDeclaredFields()) {
               f.setAccessible(true);
               if (!Modifier.isStatic(f.getModifiers())) continue;
               Object v = f.get(null);
               if (v == null) continue;
               if (v instanceof String s) {
                  if (s.length() < 400 && !s.matches("[^\\x20-\\x7E\\u00A0-\\uFFFF]*")) {
                     String ascii = s.replaceAll("[^\\x20-\\x7E]", ".");
                     System.out.println("  " + f.getName() + " (String) => " + ascii);
                  }
               } else if (v.getClass().getName().contains("IIIlIlIl")) {
                  try {
                     Method llIl = v.getClass().getMethod("llIl");
                     llIl.setAccessible(true);
                     Object r = llIl.invoke(v);
                     if (r instanceof String s2) System.out.println("  " + f.getName() + " (lazy) => " + s2.replaceAll("[^\\x20-\\x7E]", "."));
                  } catch (Throwable t) { System.out.println("  " + f.getName() + " (lazy) ERR " + t); }
               } else if (v instanceof String[] sa) {
                  System.out.println("  " + f.getName() + " (String[" + sa.length + "])");
                  for (int i = 0; i < Math.min(sa.length, 20); i++) {
                     String s = sa[i] == null ? "null" : sa[i].replaceAll("[^\\x20-\\x7E]", ".");
                     System.out.println("    [" + i + "] " + s);
                  }
               } else if (v instanceof byte[][] baa) {
                  System.out.println("  " + f.getName() + " (byte[][] " + baa.length + ")");
               }
            }
         } catch (Throwable t) {
            Throwable cur = t; StringBuilder ch = new StringBuilder(); int d = 0;
            while (cur != null && d < 4) { ch.append(" | ").append(cur.getClass().getSimpleName()); cur = cur.getCause(); d++; }
            System.out.println("  ERR" + ch);
         }
      }
   }
}
