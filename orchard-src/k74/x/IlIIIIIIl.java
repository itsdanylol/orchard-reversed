package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_2596;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import net.minecraft.class_3675.class_306;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public abstract class IlIIIIIIl {
   private volatile boolean IlIllII;
   private final boolean IlIllIl;
   private static final String[] IlIlllI;
   private volatile long IlIllll;
   private class_306 IllIIII;
   private boolean IllIIIl;
   private static final Logger IllIIlI;
   private boolean IllIIll;
   private List<Object> IllIlII;
   private boolean IllIlIl;
   private final IIIlIlIl l;
   private static final long IllIllI;
   private static String IllIlll;
   private static final long IlllIII;
   private static final String[] IlllIIl;
   private final lllIIlIl IlllIlI;
   private class_306 IlllIll;
   private static final String[] lIIIIlI;
   private final IIIlIlIl IllllII;
   private static final Object[] lIIIIll;
   private static final long IllllIl;
   private final List<IIllllIl<?>> IlllllI = new ArrayList<>();
   private static final int[] lIIIIII;
   private boolean Illllll;

   public int lIllll() {
      return 0;
   }

   private static Object llllll(Object var0) {
      if (var0 instanceof double[] var6) {
         return var6.clone();
      } else if (var0 instanceof int[] var5) {
         return var5.clone();
      } else if (var0 instanceof long[] var4) {
         return var4.clone();
      } else if (var0 instanceof byte[] var3) {
         return var3.clone();
      } else if (var0 instanceof Object[] var2) {
         return var2.clone();
      } else {
         return var0 instanceof List var1 ? new ArrayList(var1) : var0;
      }
   }

   public JsonObject IlIll() {
      int var6 = 1627261693;
      JsonObject var1 = new JsonObject();
      var1.addProperty(IlIIllIII.lI(IlIlIIl(lIIIIll(-1172184947, var6 ^ 195650926), lIIIIll(-1172184948, var6 ^ 1966538007))), this.IllIIll);
      JsonElement var2 = IIll.IIIlIll(this.IllIIII);

      try {
         if (var2 != null) {
            var1.add(IlIIllIII.lI(IlIlIIl(lIIIIll(-1172184945, var6 ^ -968679578), lIIIIll(-1172184946, var6 ^ -1883888621))), var2);
         }
      } catch (RuntimeException var8) {
         throw IIlllII(var8);
      }

      JsonObject var3 = new JsonObject();

      for (IIllllIl var5 : this.IlllllI) {
         if (!(var5 instanceof IlIllIII) && var5.lllI()) {
            try {
               if (!llIllIlI.ll(var5.IllI(), var5.IlIl())) {
                  continue;
               }
            } catch (RuntimeException var7) {
               throw IIlllII(var7);
            }

            var3.add(IIIIllI(var5.l()), var5.IIl());
         }
      }

      var1.add(IlIIllIII.lI(IlIlIIl(lIIIIll(-1172184951, var6 ^ -238886098), lIIIIll(-1172184952, var6 ^ 439033034))), var3);
      return var1;
   }

   private boolean IIIIIII(IIllllIl<?> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1e
      // 04: aload 1
      // 05: invokevirtual k74/x/IIllllIl.l ()J
      // 08: getstatic k74/x/IlIIIIIIl.IlllIII J
      // 0b: lcmp
      // 0c: ifne 1e
      // 0f: goto 16
      // 12: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: bipush 1
      // 17: goto 1f
      // 1a: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
   }

   protected final void IIIIIIl(JsonObject param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IlIIIIIIl.IIllIII ()Z
      // 04: ifne 45
      // 07: aload 1
      // 08: ifnull 45
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: aload 2
      // 13: ifnull 45
      // 16: goto 1d
      // 19: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: aload 1
      // 1e: ldc -1172184949
      // 20: ldc -153245261
      // 22: ldc -2062436423
      // 24: ixor
      // 25: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 28: ldc -1172184950
      // 2a: ldc -153245261
      // 2c: ldc -1079396072
      // 2e: ixor
      // 2f: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 32: invokestatic k74/x/IlIIIIIIl.IlIlIIl (II)Ljava/lang/String;
      // 35: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 38: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 3b: ifne 4a
      // 3e: goto 45
      // 41: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 44: athrow
      // 45: return
      // 46: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 49: athrow
      // 4a: aload 1
      // 4b: ldc -1172184955
      // 4d: ldc -153245261
      // 4f: ldc 19953673
      // 51: ixor
      // 52: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 55: ldc -1172184956
      // 57: ldc -153245261
      // 59: ldc 1761009779
      // 5b: ixor
      // 5c: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 5f: invokestatic k74/x/IlIIIIIIl.IlIlIIl (II)Ljava/lang/String;
      // 62: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 65: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 68: astore 3
      // 69: aload 2
      // 6a: invokestatic k74/x/IlIIllIII.IlIl (Ljava/lang/String;)J
      // 6d: lstore 4
      // 6f: aload 3
      // 70: lload 4
      // 72: invokestatic k74/x/IlIIIIIIl.IIllIlI (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 75: astore 6
      // 77: aload 6
      // 79: ifnull 8c
      // 7c: aload 0
      // 7d: aload 6
      // 7f: invokestatic k74/x/IIll.IIIlII (Lcom/google/gson/JsonElement;)Lnet/minecraft/class_3675$class_306;
      // 82: putfield k74/x/IlIIIIIIl.IllIIII Lnet/minecraft/class_3675$class_306;
      // 85: goto 8c
      // 88: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8b: athrow
      // 8c: return
   }

   public void llIIII(class_310 var1) {
   }

   public String IllIlI() {
      return this.IIIlIlI();
   }

   public void llIl() {
   }

   private boolean IIIIIlI(boolean var1) {
      boolean var2 = this.IIIIlIl();

      try {
         if (var1 == var2) {
            return true;
         }
      } catch (RuntimeException var24) {
         throw IIlllII(var24);
      }

      if (var2) {
         try {
            this.IlIII();
            return true;
         } catch (LinkageError | RuntimeException var21) {
            this.IIlIlIl();
            this.IllIIlI(1, var21);

            try {
               this.llIl();
            } catch (LinkageError | RuntimeException var19) {
               this.IllIIlI(2, var19);
            } finally {
               this.IIlIlll(class_310.method_1551());
            }

            return false;
         }
      } else {
         try {
            this.llIl();
         } catch (LinkageError | RuntimeException var22) {
            this.IIlIlIl();
            this.IllIIlI(2, var22);
         } finally {
            this.IIlIlll(class_310.method_1551());
         }

         return true;
      }
   }

   protected void IIIIIll() {
      IlIlIllII.l()
         .IlI(
            IIIIllI.Il,
            IlIIllIII.lI(IlIlIIl(lIIIIll(-1172184953, -1667839762 ^ -2020514947), lIIIIll(-1172184954, -1667839762 ^ 1937781129))),
            this.IlIIIll(),
            3200L
         );
   }

   public void IllIll(class_310 var1) {
   }

   private static int lIIIIll(int var0, int var1) {
      int var2 = lIIIIII[var0 ^ -1172184947] ^ var1 ^ var0;
      var2 += 49930;
      var2 += 45353;
      var2 ^= 52783;
      var2 -= 29577;
      var2 ^= 58206;
      var2 += 20126;
      var2 ^= 52781;
      var2 ^= 53117;
      return var2 - 13125;
   }

   public void llll(class_332 var1, int var2, int var3, float var4) {
   }

   final void IIIIlII() {
      if (!this.IllIIIl) {
         this.IllIlII = new ArrayList<>(this.IlllllI.size());

         for (IIllllIl var2 : this.IlllllI) {
            this.IllIlII.add(llllll(var2.IllI()));
         }

         this.IlllIll = this.IllIIII;
         this.IllIlIl = this.IllIIll;
         this.IllIIIl = true;
      }
   }

   public boolean IIIIlIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlIIIIIIl.IllIIll Z
      // 04: ifne 15
      // 07: aload 0
      // 08: getfield k74/x/IlIIIIIIl.Illllll Z
      // 0b: ifeq 1d
      // 0e: goto 15
      // 11: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: bipush 1
      // 16: goto 1e
      // 19: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
   }

   static String IIIIllI(long var0) {
      int var10000 = lIIIIll(-1172184959, 1228362566 ^ 399599141);
      String var2 = Long.toUnsignedString(var0, lIIIIll(-1172184960, 1228362566 ^ 767608533));
      String var3 = IlIIllIII.lI(IlIlIIl(var10000, lIIIIll(-1172184957, 1228362566 ^ -2009627179)))
         .substring(0, lIIIIll(-1172184958, 1228362566 ^ -1206367296) - var2.length());
      return var3 + var2;
   }

   public void IlllII(JsonObject var1) {
      int var6 = -1923710014;
      this.IllIIII = class_3675.field_16237;

      for (IIllllIl var3 : this.IlllllI) {
         if (!(var3 instanceof IlIllIII)) {
            try {
               if (!var3.lllI()) {
                  continue;
               }
            } catch (RuntimeException var11) {
               throw IIlllII(var11);
            }

            var3.Illl();
         }
      }

      try {
         if (var1.has(IlIIllIII.lI(IlIlIIl(lIIIIll(-1172184931, var6 ^ -427983727), lIIIIll(-1172184932, var6 ^ -1707725785))))) {
            this.IllIIII = IIll.IIIlII(var1.get(IlIIllIII.lI(IlIlIIl(lIIIIll(-1172184929, var6 ^ -1171561076), lIIIIll(-1172184930, var6 ^ -1938370123)))));
         }
      } catch (RuntimeException var8) {
         throw IIlllII(var8);
      }

      try {
         if (!var1.has(IlIIllIII.lI(IlIlIIl(lIIIIll(-1172184935, var6 ^ -600559436), lIIIIll(-1172184936, var6 ^ 706241533))))) {
            return;
         }
      } catch (RuntimeException var10) {
         throw IIlllII(var10);
      }

      JsonObject var12 = var1.getAsJsonObject(IlIIllIII.lI(IlIlIIl(lIIIIll(-1172184933, var6 ^ -1680065659), lIIIIll(-1172184934, var6 ^ 1994478697))));

      for (IIllllIl var4 : this.IlllllI) {
         if (!(var4 instanceof IlIllIII)) {
            try {
               if (!var4.lllI()) {
                  continue;
               }
            } catch (RuntimeException var9) {
               throw IIlllII(var9);
            }

            JsonElement var5 = IIllIlI(var12, var4.l());

            try {
               if (var5 != null) {
                  var4.ll(var5);
               }
            } catch (RuntimeException var7) {
               throw IIlllII(var7);
            }
         }
      }
   }

   public String IlllIl() {
      return this.IlIIl();
   }

   public boolean llllIl(class_310 var1) {
      return false;
   }

   public boolean IIIIlll(double var1, double var3, int var5) {
      return false;
   }

   protected IlIIIIIIl(Object var1, lllIIlIl var2, Object var3) {
      this(var1, var2, var3, true);
   }

   public boolean IIIlIII() {
      return false;
   }

   protected final void IIIlIIl(JsonObject param1, String param2, lIlllIl... param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 48
      // 04: aload 2
      // 05: ifnull 48
      // 08: goto 0f
      // 0b: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: aload 3
      // 10: ifnull 48
      // 13: goto 1a
      // 16: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: aload 1
      // 1b: ldc_w -1172184939
      // 1e: ldc_w 1092955272
      // 21: ldc_w -4952381
      // 24: ixor
      // 25: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 28: ldc_w -1172184940
      // 2b: ldc_w 1092955272
      // 2e: ldc_w 1454960020
      // 31: ixor
      // 32: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 35: invokestatic k74/x/IlIIIIIIl.IlIlIIl (II)Ljava/lang/String;
      // 38: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 3b: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 3e: ifne 4d
      // 41: goto 48
      // 44: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 47: athrow
      // 48: return
      // 49: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4c: athrow
      // 4d: aload 1
      // 4e: ldc_w -1172184937
      // 51: ldc_w 1092955272
      // 54: ldc_w 654679136
      // 57: ixor
      // 58: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 5b: ldc_w -1172184938
      // 5e: ldc_w 1092955272
      // 61: ldc_w 1477478304
      // 64: ixor
      // 65: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 68: invokestatic k74/x/IlIIIIIIl.IlIlIIl (II)Ljava/lang/String;
      // 6b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 6e: invokevirtual com/google/gson/JsonObject.getAsJsonObject (Ljava/lang/String;)Lcom/google/gson/JsonObject;
      // 71: astore 4
      // 73: aload 4
      // 75: aload 2
      // 76: invokestatic k74/x/IlIIllIII.IlIl (Ljava/lang/String;)J
      // 79: invokestatic k74/x/IlIIIIIIl.IIllIlI (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // 7c: astore 5
      // 7e: aload 5
      // 80: ifnonnull 88
      // 83: return
      // 84: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 87: athrow
      // 88: aload 3
      // 89: astore 6
      // 8b: aload 6
      // 8d: arraylength
      // 8e: istore 7
      // 90: bipush 0
      // 91: istore 8
      // 93: iload 8
      // 95: iload 7
      // 97: if_icmpge ce
      // 9a: aload 6
      // 9c: iload 8
      // 9e: aaload
      // 9f: astore 9
      // a1: aload 9
      // a3: ifnull c8
      // a6: aload 4
      // a8: aload 9
      // aa: invokevirtual k74/x/lIlllIl.l ()J
      // ad: invokestatic k74/x/IlIIIIIIl.IIIllll (Lcom/google/gson/JsonObject;J)Lcom/google/gson/JsonElement;
      // b0: ifnonnull c8
      // b3: goto ba
      // b6: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b9: athrow
      // ba: aload 9
      // bc: aload 5
      // be: invokevirtual k74/x/lIlllIl.ll (Lcom/google/gson/JsonElement;)V
      // c1: goto c8
      // c4: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // c7: athrow
      // c8: iinc 8 1
      // cb: goto 93
      // ce: return
   }

   public void lllllI(class_1297 var1) {
   }

   public String IIIlIlI() {
      return this.IllllII.llIl();
   }

   public void IIIlIll(class_1297 var1, int var2) {
   }

   public void llllII(class_2596<?> var1) {
   }

   static void IIIllII(JsonObject var0, long var1) {
      try {
         if (var0 == null) {
            return;
         }
      } catch (RuntimeException var7) {
         throw IIlllII(var7);
      }

      var0.remove(IIIIllI(var1));
      ArrayList var3 = new ArrayList();

      for (String var5 : var0.keySet()) {
         try {
            if (IlIIllIII.IlIl(var5) == var1) {
               var3.add(var5);
            }
         } catch (RuntimeException var6) {
            throw IIlllII(var6);
         }
      }

      for (String var9 : var3) {
         var0.remove(var9);
      }
   }

   public void IIIllIl(class_2596<?> var1) {
   }

   protected IlIIIIIIl(Object var1, lllIIlIl var2, Object var3, boolean var4) {
      this.IlllIll = class_3675.field_16237;
      this.IllIIII = class_3675.field_16237;
      this.IllllII = IlIIllIII.l(var1);
      this.IlllIlI = var2;
      this.l = IlIIllIII.l(var3);
      this.IlIllIl = var4;
      this.IllIIll = !var4;
   }

   public static String IIIlllI() {
      return IllIlll;
   }

   static JsonElement IIIllll(JsonObject var0, long var1) {
      try {
         if (var0 == null) {
            return null;
         }
      } catch (RuntimeException var8) {
         throw IIlllII(var8);
      }

      String var3 = IIIIllI(var1);

      try {
         if (var0.has(var3)) {
            return var0.get(var3);
         }
      } catch (RuntimeException var7) {
         throw IIlllII(var7);
      }

      for (Entry var5 : var0.entrySet()) {
         try {
            if (IlIIllIII.IlIl((String)var5.getKey()) == var1) {
               return (JsonElement)var5.getValue();
            }
         } catch (RuntimeException var6) {
            throw IIlllII(var6);
         }
      }

      return null;
   }

   public void IlI(lIIlIl var1) {
   }

   protected IlIIIIIIl(String var1, lllIIlIl var2, String var3) {
      this(var1, var2, var3, true);
   }

   public IIIlIlIl IIlIIII() {
      return this.IllllII;
   }

   public void IIlIIIl() {
      String[] var1 = IIllllIl.IIIIl();
      if (this.IllIIIl) {
         int var9 = Math.min(this.IlllllI.size(), this.IllIlII.size());
         int var10 = 0;

         while (var10 < var9) {
            IIllllIl var4 = this.IlllllI.get(var10);

            try {
               if (!(var4 instanceof IlIllIII)) {
                  IIllIll(var4, this.IllIlII.get(var10));
               }
            } catch (RuntimeException var6) {
               throw IIlllII(var6);
            }

            var10++;
            if (var1 != null) {
               break;
            }
         }

         var10 = var9;

         while (var10 < this.IlllllI.size()) {
            IIllllIl var12 = this.IlllllI.get(var10);

            try {
               if (!(var12 instanceof IlIllIII)) {
                  var12.Illl();
               }
            } catch (RuntimeException var5) {
               throw IIlllII(var5);
            }

            var10++;
            if (var1 != null) {
               break;
            }
         }

         this.IlIllll(this.IlllIll);
         this.IlIllIl(this.IllIlIl);
      } else {
         for (IIllllIl var3 : this.IlllllI) {
            try {
               if (var3 instanceof IlIllIII && var1 == null) {
                  continue;
               }
            } catch (RuntimeException var8) {
               throw IIlllII(var8);
            }

            var3.Illl();
            if (var1 != null) {
               break;
            }
         }

         IlIIIIIIl var10000;
         boolean var10001;
         label69: {
            try {
               this.IlIllll(class_3675.field_16237);
               var10000 = this;
               if (!this.IlIllIl) {
                  var10001 = true;
                  break label69;
               }
            } catch (RuntimeException var7) {
               throw IIlllII(var7);
            }

            var10001 = false;
         }

         var10000.IlIllIl(var10001);
      }
   }

   public void IIlIIlI() {
      IlIIIIIIl var10000;
      boolean var10001;
      label16: {
         try {
            var10000 = this;
            if (!this.IllIIll) {
               var10001 = true;
               break label16;
            }
         } catch (RuntimeException var1) {
            throw IIlllII(var1);
         }

         var10001 = false;
      }

      var10000.IlIllIl(var10001);
   }

   public boolean IIlIIll() {
      return this.IlIllIl;
   }

   public void IIlIlII() {
      try {
         this.IllIIll = false;
         this.Illllll = false;
         this.IllIIII = class_3675.field_16237;
         this.IlllIll = class_3675.field_16237;
         this.IlllllI.clear();
         if (this.IllIlII != null) {
            this.IllIlII.clear();
            this.IllIlII = null;
         }
      } catch (RuntimeException var1) {
         throw IIlllII(var1);
      }
   }

   private synchronized void IIlIlIl() {
      this.IlIllII = true;
      this.IlIllll++;
   }

   public boolean IIlIllI(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 0a
      // 04: bipush 0
      // 05: ireturn
      // 06: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09: athrow
      // 0a: aload 0
      // 0b: invokevirtual k74/x/IlIIIIIIl.IIIlIII ()Z
      // 0e: ifeq 49
      // 11: aload 0
      // 12: invokevirtual k74/x/IlIIIIIIl.IIllIII ()Z
      // 15: ifeq 49
      // 18: goto 1f
      // 1b: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: aload 1
      // 20: aload 0
      // 21: invokevirtual k74/x/IlIIIIIIl.IlIIlII ()Lnet/minecraft/class_3675$class_306;
      // 24: invokestatic k74/x/IIll.IIIllll (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 27: ifeq 49
      // 2a: goto 31
      // 2d: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 30: athrow
      // 31: aload 1
      // 32: aload 0
      // 33: invokevirtual k74/x/IlIIIIIIl.IlIIlII ()Lnet/minecraft/class_3675$class_306;
      // 36: invokestatic k74/x/IIll.lIlllI (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 39: ifeq 49
      // 3c: goto 43
      // 3f: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42: athrow
      // 43: bipush 1
      // 44: ireturn
      // 45: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: aload 0
      // 4a: getfield k74/x/IlIIIIIIl.IlllllI Ljava/util/List;
      // 4d: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 52: astore 2
      // 53: aload 2
      // 54: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 59: ifeq ae
      // 5c: aload 2
      // 5d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 62: checkcast k74/x/IIllllIl
      // 65: astore 3
      // 66: aload 3
      // 67: instanceof k74/x/lIllIlII
      // 6a: ifeq ab
      // 6d: aload 3
      // 6e: checkcast k74/x/lIllIlII
      // 71: astore 4
      // 73: aload 4
      // 75: invokevirtual k74/x/lIllIlII.IllI ()Ljava/lang/Object;
      // 78: checkcast net/minecraft/class_3675$class_306
      // 7b: astore 5
      // 7d: aload 5
      // 7f: invokestatic k74/x/IIll.IIlll (Lnet/minecraft/class_3675$class_306;)Z
      // 82: ifne ab
      // 85: aload 1
      // 86: aload 5
      // 88: invokestatic k74/x/IIll.IIIllll (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 8b: ifeq ab
      // 8e: goto 95
      // 91: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 94: athrow
      // 95: aload 1
      // 96: aload 5
      // 98: invokestatic k74/x/IIll.lIlllI (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 9b: ifeq ab
      // 9e: goto a5
      // a1: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a4: athrow
      // a5: bipush 1
      // a6: ireturn
      // a7: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // aa: athrow
      // ab: goto 53
      // ae: bipush 0
      // af: ireturn
   }

   private void IIlIlll(class_310 var1) {
      try {
         IIll.lllIl(var1, this, lllIII.II);
      } catch (LinkageError | RuntimeException var3) {
         this.IIlIlIl();
         this.IllIIlI(3, var3);
      }
   }

   public boolean IIllIII() {
      try {
         if (!IIll.IIlll(this.IllIIII)) {
            return true;
         }
      } catch (RuntimeException var1) {
         throw IIlllII(var1);
      }

      return false;
   }

   public IIIlIlIl IIllIIl() {
      return this.IllllII;
   }

   static JsonElement IIllIlI(JsonObject param0, long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnonnull 0a
      // 04: aconst_null
      // 05: areturn
      // 06: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09: athrow
      // 0a: lload 1
      // 0b: invokestatic k74/x/IlIIIIIIl.IIIIllI (J)Ljava/lang/String;
      // 0e: astore 3
      // 0f: aload 0
      // 10: aload 3
      // 11: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 14: astore 4
      // 16: new java/util/ArrayList
      // 19: dup
      // 1a: invokespecial java/util/ArrayList.<init> ()V
      // 1d: astore 5
      // 1f: aload 0
      // 20: invokevirtual com/google/gson/JsonObject.entrySet ()Ljava/util/Set;
      // 23: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 28: astore 6
      // 2a: aload 6
      // 2c: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 31: ifeq 8b
      // 34: aload 6
      // 36: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 3b: checkcast java/util/Map$Entry
      // 3e: astore 7
      // 40: aload 7
      // 42: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 47: checkcast java/lang/String
      // 4a: astore 8
      // 4c: aload 3
      // 4d: aload 8
      // 4f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 52: ifne 88
      // 55: aload 8
      // 57: invokestatic k74/x/IlIIllIII.IlIl (Ljava/lang/String;)J
      // 5a: lload 1
      // 5b: lcmp
      // 5c: ifne 88
      // 5f: goto 66
      // 62: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 65: athrow
      // 66: aload 4
      // 68: ifnonnull 7e
      // 6b: goto 72
      // 6e: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 71: athrow
      // 72: aload 7
      // 74: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 79: checkcast com/google/gson/JsonElement
      // 7c: astore 4
      // 7e: aload 5
      // 80: aload 8
      // 82: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 87: pop
      // 88: goto 2a
      // 8b: aload 4
      // 8d: ifnull 9e
      // 90: aload 0
      // 91: aload 3
      // 92: aload 4
      // 94: invokevirtual com/google/gson/JsonObject.add (Ljava/lang/String;Lcom/google/gson/JsonElement;)V
      // 97: goto 9e
      // 9a: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9d: athrow
      // 9e: aload 5
      // a0: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // a5: astore 6
      // a7: aload 6
      // a9: invokeinterface java/util/Iterator.hasNext ()Z 1
      // ae: ifeq c7
      // b1: aload 6
      // b3: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // b8: checkcast java/lang/String
      // bb: astore 7
      // bd: aload 0
      // be: aload 7
      // c0: invokevirtual com/google/gson/JsonObject.remove (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // c3: pop
      // c4: goto a7
      // c7: aload 4
      // c9: areturn
   }

   protected boolean lllIII() {
      return true;
   }

   private static void IIllIll(IIllllIl var0, Object var1) {
      var0.Il(llllll(var1));
   }

   public void lllIll(class_2596<?> var1) {
   }

   private static RuntimeException IIlllII(RuntimeException var0) {
      return var0;
   }

   public String IIlllIl() {
      return null;
   }

   public long IIllllI() {
      return this.IllllII.I();
   }

   public IIIlIlIl IIlllll() {
      return IIIlll.I(this.IIllIIl(), this.l);
   }

   public void IlIII() {
   }

   public void IlIIIII(class_2596<?> var1) {
   }

   public String IlIIl() {
      return "";
   }

   public void lllIIl(class_310 var1) {
   }

   final boolean IlIIIIl() {
      return this.IlIllII;
   }

   private void IlIIIlI(class_310 param1, boolean param2, long param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlIIIIIIl.IlIllII Z
      // 04: ifeq 17
      // 07: aload 0
      // 08: getfield k74/x/IlIIIIIIl.IlIllll J
      // 0b: lload 3
      // 0c: lcmp
      // 0d: ifeq 1c
      // 10: goto 17
      // 13: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16: athrow
      // 17: return
      // 18: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b: athrow
      // 1c: iload 2
      // 1d: ifeq 30
      // 20: aload 0
      // 21: invokevirtual k74/x/IlIIIIIIl.llIl ()V
      // 24: goto 30
      // 27: astore 5
      // 29: aload 0
      // 2a: bipush 2
      // 2b: aload 5
      // 2d: invokevirtual k74/x/IlIIIIIIl.IllIIlI (ILjava/lang/Throwable;)V
      // 30: aload 0
      // 31: aload 1
      // 32: invokevirtual k74/x/IlIIIIIIl.IIlIlll (Lnet/minecraft/class_310;)V
      // 35: aload 0
      // 36: invokevirtual k74/x/IlIIIIIIl.IllIllI ()V
      // 39: return
   }

   public void IIlIl() {
   }

   protected IlIIIIIIl(String var1, lllIIlIl var2, String var3, boolean var4) {
      this((Object)var1, var2, (Object)var3, var4);
   }

   public String IlIIIll() {
      String var10000 = this.IllIlI();
      String var10001 = IlIIllIII.lI(IlIlIIl(lIIIIll(-1172184943, 1944315237 ^ 543444006), lIIIIll(-1172184944, 1944315237 ^ 593726910)));
      String var10002 = lIllllI.III().l();
      String var4 = IlIIllIII.lI(IlIlIIl(lIIIIll(-1172184941, 1944315237 ^ -641836282), lIIIIll(-1172184942, 1944315237 ^ 999691280)));
      String var3 = var10002;
      String var2 = var10001;
      String var1 = var10000;
      return var1 + var2 + var3 + var4;
   }

   public class_306 IlIIlII() {
      return this.IllIIII;
   }

   public String IlIIlIl() {
      return this.IIlllll().llIl();
   }

   public boolean IlIIllI() {
      return true;
   }

   public List<IIllllIl<?>> llIIIl() {
      ArrayList var1 = new ArrayList(this.IlllllI.size());

      for (IIllllIl var3 : this.IlllllI) {
         try {
            if (!var3.lIll()) {
               continue;
            }
         } catch (RuntimeException var5) {
            throw IIlllII(var5);
         }

         try {
            if (this.IllIIIl(var3)) {
               continue;
            }
         } catch (RuntimeException var4) {
            throw IIlllII(var4);
         }

         var1.add(var3);
      }

      var1.sort(Comparator.comparingInt(this::IlIIlll));
      return Collections.unmodifiableList(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1012067353;
      short var18 = 5896;
      int var17 = 0;
      int var14 = "\u0005뱁톹먁憷볡\u0094\uf317럲ｧ韺\uf837䟿\uf867߶\uf1d7\uf7f7\uf0f7矹\uf777矲\uf447\uf7f3\uf8f7柼ﶷ㟾ﻷ韶\uf787埼\uf1d7柿\uf807߳益韽ￗ矵覆矿輪韲\uf747៲\uf657䟲不矹\uf347柴\ufe67㟼\uf0d7埰ﻧퟲ驪럸\uf837ꟾ\uf2e7\u17fe\uf077ߵ\uf887\ue7f8ﺇ䟰\uf817\ue7f5ﱷ柼\uf297㟵\uf227埾\uf297\uf7f4\uf387\ue7faﬧ㟱ﹷퟻ︗柶\uf737⟼\uf827柸\uf167柾\uf157럻\uf107럱ﶷ埰\uf2b7㟲ﷇ蟵\uf8b7柳\ufae7矼\uf837\ue7fc盛⟶ﳗ럹７⟾\uf5d7埱\ufde7\uf7fbﭗ柿\uf627\uf7f5難⟴\uf237៵\uf387㟲\uf407埸\uf567\ua7f1\uf267\ud7fe\uf7a7\ue7f8\uf737韼ｷ럷７ퟰ\uf007矰\uf297\ud7fd\uf667ꟿ\ufff7ꟺ\uf647៲\uf137韴5䏂ቅ䰒鉏䣂ꉆ䣲퉄互㉆䥢艇侲鉅䭲뉊䡲剆䄲㉂䶒\uf243䱢剋䦢㉉䯒㉄䟒ቄ䯒㉇䋒䉁䯢\ue24a䊲뉎䚲䉎䚲뉋䕲ቌ乒㉊䑒ቊ䲂艂䮲쉉䜲"
         .length();
      String[] var15 = new String[3];
      int var16 = 0;
      String var13 = "\u0005뱁톹먁憷볡\u0094\uf317럲ｧ韺\uf837䟿\uf867߶\uf1d7\uf7f7\uf0f7矹\uf777矲\uf447\uf7f3\uf8f7柼ﶷ㟾ﻷ韶\uf787埼\uf1d7柿\uf807߳益韽ￗ矵覆矿輪韲\uf747៲\uf657䟲不矹\uf347柴\ufe67㟼\uf0d7埰ﻧퟲ驪럸\uf837ꟾ\uf2e7\u17fe\uf077ߵ\uf887\ue7f8ﺇ䟰\uf817\ue7f5ﱷ柼\uf297㟵\uf227埾\uf297\uf7f4\uf387\ue7faﬧ㟱ﹷퟻ︗柶\uf737⟼\uf827柸\uf167柾\uf157럻\uf107럱ﶷ埰\uf2b7㟲ﷇ蟵\uf8b7柳\ufae7矼\uf837\ue7fc盛⟶ﳗ럹７⟾\uf5d7埱\ufde7\uf7fbﭗ柿\uf627\uf7f5難⟴\uf237៵\uf387㟲\uf407埸\uf567\ua7f1\uf267\ud7fe\uf7a7\ue7f8\uf737韼ｷ럷７ퟰ\uf007矰\uf297\ud7fd\uf667ꟿ\ufff7ꟺ\uf647៲\uf137韴5䏂ቅ䰒鉏䣂ꉆ䣲퉄互㉆䥢艇侲鉅䭲뉊䡲剆䄲㉂䶒\uf243䱢剋䦢㉉䯒㉄䟒ቄ䯒㉇䋒䉁䯢\ue24a䊲뉎䚲䉎䚲뉋䕲ቌ乒㉊䑒ቊ䲂艂䮲쉉䜲";

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10001 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << '\f') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> '\f') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lIIIIlI = var15;
      lIIIIll = new Object[var15.length];
      int var9 = -447517997;
      byte[] var7 = "4%¹ÃµG\u0087\u009fùÏÃíOÇ\n·ÎN?\u0098%§³\u0083,¾ÈC\u0016\u0006µ\u001d¨\u009f\u0007ýÁYìxDu}¼O\u0099ÎZ\u0001\u0094ãGÄ{Vz\u009er|¹Q£Û\u008a4Y)\u0012H\u0012=Ïh\u000f0(¡¯v>\u000e\u0010e/ø<_\u0007Iøn\u001e¤År\ráã\u0094\u001cHïd´9Rf½FG\u000e\u0082\fõxÔð\u000fPãõ/h\u000f\u0017\u0007\u001d;9×\u001a1«ÛÌ\u009a&êÁßVX\u0000ÏBæ\u008cã²\u0082Ø¼\u008cïý\u0013×¶~\u008aFbÉíç\u009dgãÍLb>·EñÞº2»jå¬Ä÷\bß\u0012öKÄJä\u0094p$Ø$\u0092)a\u0014½kæ\u001f¶M\u008e²\u0003=\u0081;ßÛ/B¹ÑA·\u0082¢;¿Xp\u0016My°©)Þî¦\u0087=\u0084\u0001\u0012ÎAç\u008d6:û\u0087\u0093\u0089$ê\rÿB\u0000ß\u0002\u000e\u001ap$öocì\u009dA\u000e\\óWýÃÇU\u0083N\u008e-\u0018îÏP\"\u009dÓûv\u0081\"äü`3G\"ÓíiÕ¼ôDß\u009f1f\u0089\u0018ü4·ò\u0010ý&¨ì\u0019æ_J9Ü÷¨o\u0088òþg÷VÌ¤ó\u0016D+B´\u0005Zåôs\u009f\u001b±Ý§\u0011;²\u0011ÔðH\u0089ÌØQÅ\t\u009eS¿±bsd*Øö\u0082Úõ\u0000¡òN\u0005Ç°ÂÇ\u008a_\u0011FE\u0095¤Îü\u009f\u0094\u0013`ÚJ\u0082mÊH@!Ïpø\t0Ý\u0007À\u0097´®îlôàè'Ê\tÂèN0(3jJWÚ\u009c]d\u001eÛ¡j,óè÷³\u0016pº\u008eÕ¢7ô\u0082\f\u0017«äÒÞÆ¹Ôù´í5H\u0093\u0001Ã¹NJl{ç®ÙlX¸^\u009c×µN\u008d\u0090!îþåÐèÕ¹êäÊ\u0016|bè¼Iûï \u008eÎq\u0089ø\u000eº\u0016XÍiì²\u0005LÃú^\u0006\r>\u0006\u0011 T\u0003«¾\u0097]wÈ\u001d¿\\2¢\u0096ÄÛr´\u0005\u0083Ö=z¥\u0019å±Á¸©§òdÏ\u000bëvY\u008füêÉÈìûí\"¹\u007f0úp³ãw#\u0094\u009b°ÿÞS\fW3\u008b<>5]øùÿÜü8¯ûò¢QÆx\tâ\u0000/Y\u001amÂo¬èE¸Á£\tóÏ±¢\u0086æ\u0083\u00194ÃÑ¬\u009fò\r\u0017D\u0085\u001bèf\u0000U¬RÖ\r\u0015\u0000\u0092o\u0086ðeúà\u008fâIN\u0018\u0002²\u0000âÏ¢\u0082\u0090K\u0094A\u0097A\u0017\u0014X¹Wy\nxÍéJ4R\u0010G\u001d\u009c\u008a\u0091Ïof¿ÐèÙ8\u001eÅ©8Î\u0015\u009bôE\u0088h,\b%\u0018Z»Í8äv'ï¾\u0096\u0015»\u0091\u009fê2(\u0007 ÿ¯\u00115ÙÜ-?ñ3tõgÍ/\u0091A!ÎkF&\u000f/töðÈ¦\u0097,n{Õ\u0004bHZO»b»Ûòg\u0013\u0087 \u0016\u009a±\u000búd9Å_aþî\u0011J´ÄYÑ [¸ÜvÙø\u00030ÜÃHÌD\u0088\u0012·\u0085\u0096\u001e÷\u0084d®\u0013P\u0010>Bp}o~E:ÅfÂÈ¢\u0087¹\u0081ÁÛø?s\r\u0007Lpä\u0006Ù\u0014\u0014¤ítF1\u008d?/\u0010h\u000e\u0010\u000bø\u001a\u008eW5©\u0013ª\u000eí²Ø]#el4k®°R.\u0098ÌN\u0015\u0094Ý\u0084\"\u0007´l_\u008ahv\u008ch\u00057Ó\u0088rÕIì\u0003Ô¦\u0005\\ï\fk\u0080Hìx½\u0094Ð*¾?åßi\u0081ôÆ\u009eù\u0012  hÂëU;r\u0083\u0087\u009deLÃvþVy'\u000fûÝ}×_óXM\"!Gr<¾\u0088¬BZ²L\u0098\u008b\u0082ç\u0090;\u00ad\u0086D\n¨¸\u0094ÛJ8°ö½WÀxí\u00961Ö0\u009bùTîx\u008c\"\fÒª4å·E\u001cXãQ§WJæ\u0013\u0090Ö5{TÊ\u0081=ý¦.[\u0083Â\u001fµ³¯\u0081ïPÃKÏ+¸µ*Vß'GlÊ§\b¥»ÃÏ\u001d½a÷Ã»]\u0083C\u0007\u0017Î\u00adOÿ\u0085l\u008f\u009cQ/à\u0085\u0003¼ñl!ZÅ\u0011\u0000zx³û(\u008d|\u008a!\u0095ë\u001ed~÷ô\u0004Ø×\u0002Ï¹\u0091¯ éÝ\u0004E\fCêX\u001f$á¼Ì½ê\u0080i!½\u0013Dxò(@\u001f' §ÕÍxÙ\u0006ü\u0000ÉÍ.9\u0097\u0097éM×øµ´õTC¦H\u0087\u0019¨r ÔÇ\u0019òî\u008e\u009c\u0094Ô)ô\u009b\u009fFd\tN_^iÄúwZ¶ÎGP'\u009c\u009c\u009arØox[F§\nìl\bwò÷\u009aTßÁþ\u0001Å\r\u009fCÛ"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lIIIIII = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lIIIIII[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lIIIIll(-1172184915, var23 ^ 1526123027)];
      int var3 = 0;
      String var10000 = lIIIlIl(1205251558, (short)-28846, 850800261, 7609);
      String var2;
      int var4 = (var2 = lIIIlIl(1205251559, (short)-1577, -695033457, (char)'耹')).length();
      IlIlIII(var10000);
      int var1 = 4;
      int var25 = -1;

      label90:
      while (true) {
         int var27 = 5;
         String var30 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label85: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var27;
               var41 = var45;
               int var35 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var27;
                  var10006 = var6;
               } else {
                  var48 = var27;
                  var35 = var10004;
                  if (var10004 <= var6) {
                     break label85;
                  }

                  var57 = var45;
                  var10004 = var27;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lIIIIll(-1172184919, var23 ^ 566713389)) {
                     case 0 -> lIIIIll(-1172184920, var23 ^ -777846363);
                     case 1 -> lIIIIll(-1172184917, var23 ^ -271700678);
                     case 2 -> lIIIIll(-1172184918, var23 ^ -1265129662);
                     case 3 -> lIIIIll(-1172184923, var23 ^ 625154348);
                     case 4 -> lIIIIll(-1172184924, var23 ^ -2068005338);
                     case 5 -> lIIIIll(-1172184921, var23 ^ -1368539671);
                     default -> lIIIIll(-1172184922, var23 ^ -731633428);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var35 <= var6) {
                        break;
                     }

                     var57 = var41;
                     var10004 = var48;
                     var10006 = var6;
                  }
               }
            }

            String var50 = new String(var41).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var50;
                  if ((var25 += var1) >= var4) {
                     IlllIIl = var5;
                     IlIlllI = new String[lIIIIll(-1172184914, var23 ^ 897175790)];
                     int var29 = lIIIIll(-1172184927, var23 ^ 653098738);
                     IllIIlI = LoggerFactory.getLogger(IlIIIIIIl.class);
                     IlllIII = IlIIllIII.Ill(IlIlIIl(var29, lIIIIll(-1172184928, var23 ^ -2037554191))).I();
                     IllIllI = IlIIllIII.Ill(IlIlIIl(lIIIIll(-1172184925, var23 ^ -1811884175), lIIIIll(-1172184926, var23 ^ -686046161))).I();
                     IllllIl = IlIIllIII.Ill(IlIlIIl(lIIIIll(-1172184899, var23 ^ 145744166), lIIIIll(-1172184900, var23 ^ 1202725702))).I();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label90;
                  }

                  var4 = (var2 = lIIIlIl(1205251556, (short)-12931, 638074505, 28796)).length();
                  var1 = lIIIIll(-1172184916, var23 ^ -923135164);
                  var25 = -1;
            }

            var27 = lIIIIll(-1172184913, var23 ^ 1170939508);
            var30 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private int IlIIlll(IIllllIl var1) {
      try {
         if (this.IIIIIII((IIllllIl<?>)var1)) {
            return 1;
         }
      } catch (RuntimeException var2) {
         throw IIlllII(var2);
      }

      return 0;
   }

   public static void IlIlIII(String var0) {
      IllIlll = var0;
   }

   private static String lIIIlIl(int var0, short var1, int var2, char var3) {
      int var8 = var0 ^ 1205251558;
      char[] var7 = lIIIIlI[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])lIIIIll[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         lIIIIll[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 16510;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 4) {
            default -> 185;
            case 1 -> 252;
            case 2 -> 219;
            case 3 -> 55;
         } ^ 39677 ^ var3 ^ var1 ^ var0 ^ var5 ^ var2);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   private static String IlIlIIl(int var0, int var1) {
      int var9 = 2104741275;
      int var2 = (var0 ^ lIIIIll(-1172184897, var9 ^ 918319165)) & lIIIIll(-1172184898, var9 ^ -1035451629);
      if (IlIlllI[var2] == null) {
         char[] var3 = IlllIIl[var2].toCharArray();

         int var4 = switch (var3[0] & lIIIIll(-1172184903, var9 ^ 1878800411)) {
            case 0 -> lIIIIll(-1172184904, var9 ^ -434054056);
            case 1 -> lIIIIll(-1172184901, var9 ^ -1622749025);
            case 2 -> lIIIIll(-1172184902, var9 ^ 1786619606);
            case 3 -> lIIIIll(-1172184907, var9 ^ 1655141610);
            case 4 -> lIIIIll(-1172184908, var9 ^ -1870220162);
            case 5 -> lIIIIll(-1172184905, var9 ^ -199104012);
            case 6 -> lIIIIll(-1172184906, var9 ^ 1522697067);
            case 7 -> lIIIIll(-1172184911, var9 ^ -818854222);
            case 8 -> lIIIIll(-1172184912, var9 ^ 1355365797);
            case 9 -> lIIIIll(-1172184909, var9 ^ 1517063774);
            case 10 -> lIIIIll(-1172184910, var9 ^ 938670667);
            case 11 -> lIIIIll(-1172184883, var9 ^ -585103898);
            case 12 -> lIIIIll(-1172184884, var9 ^ -946921057);
            case 13 -> lIIIIll(-1172184881, var9 ^ -1298339821);
            case 14 -> lIIIIll(-1172184882, var9 ^ -1661903568);
            case 15 -> lIIIIll(-1172184887, var9 ^ -1979530024);
            case 16 -> lIIIIll(-1172184888, var9 ^ -2005120589);
            case 17 -> lIIIIll(-1172184885, var9 ^ -253236766);
            case 18 -> lIIIIll(-1172184886, var9 ^ -1914858749);
            case 19 -> lIIIIll(-1172184891, var9 ^ 646546825);
            case 20 -> lIIIIll(-1172184892, var9 ^ 956523106);
            case 21 -> lIIIIll(-1172184889, var9 ^ -1696738140);
            case 22 -> lIIIIll(-1172184890, var9 ^ -1272267117);
            case 23 -> lIIIIll(-1172184895, var9 ^ -1725916225);
            case 24 -> lIIIIll(-1172184896, var9 ^ -1149889004);
            case 25 -> 1;
            case 26 -> lIIIIll(-1172184893, var9 ^ -381094452);
            case 27 -> lIIIIll(-1172184894, var9 ^ 551137051);
            case 28 -> 0;
            case 29 -> lIIIIll(-1172184867, var9 ^ -1004972012);
            case 30 -> lIIIIll(-1172184868, var9 ^ -467406131);
            case 31 -> lIIIIll(-1172184865, var9 ^ -1300761172);
            case 32 -> lIIIIll(-1172184866, var9 ^ -1173859443);
            case 33 -> lIIIIll(-1172184871, var9 ^ 2030834741);
            case 34 -> lIIIIll(-1172184872, var9 ^ -155340443);
            case 35 -> lIIIIll(-1172184869, var9 ^ -2028275108);
            case 36 -> lIIIIll(-1172184870, var9 ^ 1122285088);
            case 37 -> lIIIIll(-1172184875, var9 ^ 2062433459);
            case 38 -> lIIIIll(-1172184876, var9 ^ -869533876);
            case 39 -> lIIIIll(-1172184873, var9 ^ 1412685661);
            case 40 -> lIIIIll(-1172184874, var9 ^ 418814657);
            case 41 -> lIIIIll(-1172184879, var9 ^ 1649306766);
            case 42 -> lIIIIll(-1172184880, var9 ^ -1177166409);
            case 43 -> lIIIIll(-1172184877, var9 ^ 1596322984);
            case 44 -> lIIIIll(-1172184878, var9 ^ 2081246288);
            case 45 -> lIIIIll(-1172184851, var9 ^ 441434916);
            case 46 -> lIIIIll(-1172184852, var9 ^ 1470109077);
            case 47 -> lIIIIll(-1172184849, var9 ^ -1737840070);
            case 48 -> lIIIIll(-1172184850, var9 ^ 559977262);
            case 49 -> lIIIIll(-1172184855, var9 ^ -1121628631);
            case 50 -> lIIIIll(-1172184856, var9 ^ -1338684188);
            case 51 -> lIIIIll(-1172184853, var9 ^ -63933763);
            case 52 -> lIIIIll(-1172184854, var9 ^ -724577340);
            case 53 -> lIIIIll(-1172184859, var9 ^ 493401034);
            case 54 -> lIIIIll(-1172184860, var9 ^ 865334930);
            case 55 -> lIIIIll(-1172184857, var9 ^ 903400742);
            case 56 -> lIIIIll(-1172184858, var9 ^ 521621387);
            case 57 -> lIIIIll(-1172184863, var9 ^ -171152419);
            case 58 -> lIIIIll(-1172184864, var9 ^ -1977246267);
            case 59 -> lIIIIll(-1172184861, var9 ^ -1176379676);
            case 60 -> lIIIIll(-1172184862, var9 ^ -1210845363);
            case 61 -> lIIIIll(-1172184835, var9 ^ 709628175);
            case 62 -> lIIIIll(-1172184836, var9 ^ 1735512723);
            case 63 -> lIIIIll(-1172184833, var9 ^ -368344180);
            case 64 -> lIIIIll(-1172184834, var9 ^ -900406279);
            case 65 -> lIIIIll(-1172184839, var9 ^ 54115204);
            case 66 -> lIIIIll(-1172184840, var9 ^ 608954463);
            case 67 -> lIIIIll(-1172184837, var9 ^ -1788082938);
            case 68 -> lIIIIll(-1172184838, var9 ^ 1689341686);
            case 69 -> lIIIIll(-1172184843, var9 ^ -1508332416);
            case 70 -> lIIIIll(-1172184844, var9 ^ -1314407981);
            case 71 -> lIIIIll(-1172184841, var9 ^ 1093186221);
            case 72 -> lIIIIll(-1172184842, var9 ^ 1349460922);
            case 73 -> lIIIIll(-1172184847, var9 ^ 588961734);
            case 74 -> lIIIIll(-1172184848, var9 ^ 138866297);
            case 75 -> lIIIIll(-1172184845, var9 ^ 401177465);
            case 76 -> lIIIIll(-1172184846, var9 ^ 893603129);
            case 77 -> lIIIIll(-1172185075, var9 ^ 853511028);
            case 78 -> lIIIIll(-1172185076, var9 ^ -1401487557);
            case 79 -> lIIIIll(-1172185073, var9 ^ 1743347570);
            case 80 -> lIIIIll(-1172185074, var9 ^ -1273777284);
            case 81 -> lIIIIll(-1172185079, var9 ^ -1858273769);
            case 82 -> lIIIIll(-1172185080, var9 ^ -604882635);
            case 83 -> lIIIIll(-1172185077, var9 ^ -857778941);
            case 84 -> lIIIIll(-1172185078, var9 ^ 1984008364);
            case 85 -> lIIIIll(-1172185083, var9 ^ -1439228743);
            case 86 -> lIIIIll(-1172185084, var9 ^ -2117229243);
            case 87 -> lIIIIll(-1172185081, var9 ^ 421818421);
            case 88 -> lIIIIll(-1172185082, var9 ^ -662908431);
            case 89 -> lIIIIll(-1172185087, var9 ^ -1487266696);
            case 90 -> lIIIIll(-1172185088, var9 ^ 1816050126);
            case 91 -> lIIIIll(-1172185085, var9 ^ 2047698517);
            case 92 -> lIIIIll(-1172185086, var9 ^ -703301873);
            case 93 -> lIIIIll(-1172185059, var9 ^ 1375989015);
            case 94 -> lIIIIll(-1172185060, var9 ^ 353631275);
            case 95 -> lIIIIll(-1172185057, var9 ^ -12158138);
            case 96 -> lIIIIll(-1172185058, var9 ^ 663729228);
            case 97 -> lIIIIll(-1172185063, var9 ^ -1428383107);
            case 98 -> lIIIIll(-1172185064, var9 ^ 1828772238);
            case 99 -> lIIIIll(-1172185061, var9 ^ -777505761);
            case 100 -> lIIIIll(-1172185062, var9 ^ -507432362);
            case 101 -> lIIIIll(-1172185067, var9 ^ 621213707);
            case 102 -> lIIIIll(-1172185068, var9 ^ 566734491);
            case 103 -> lIIIIll(-1172185065, var9 ^ 794645898);
            case 104 -> lIIIIll(-1172185066, var9 ^ -1510547269);
            case 105 -> lIIIIll(-1172185071, var9 ^ -223994349);
            case 106 -> lIIIIll(-1172185072, var9 ^ 529574222);
            case 107 -> lIIIIll(-1172185069, var9 ^ -1740127457);
            case 108 -> lIIIIll(-1172185070, var9 ^ -737359305);
            case 109 -> lIIIIll(-1172185043, var9 ^ 2138693907);
            case 110 -> lIIIIll(-1172185044, var9 ^ -993278898);
            case 111 -> lIIIIll(-1172185041, var9 ^ 1902179778);
            case 112 -> lIIIIll(-1172185042, var9 ^ -893681518);
            case 113 -> lIIIIll(-1172185047, var9 ^ 899220182);
            case 114 -> lIIIIll(-1172185048, var9 ^ 1907218220);
            case 115 -> lIIIIll(-1172185045, var9 ^ -922773999);
            case 116 -> lIIIIll(-1172185046, var9 ^ 1527737120);
            case 117 -> lIIIIll(-1172185051, var9 ^ 1030808916);
            case 118 -> lIIIIll(-1172185052, var9 ^ -1813577715);
            case 119 -> lIIIIll(-1172185049, var9 ^ -585250710);
            case 120 -> lIIIIll(-1172185050, var9 ^ 1601129605);
            case 121 -> lIIIIll(-1172185055, var9 ^ -1670888308);
            case 122 -> lIIIIll(-1172185056, var9 ^ -911754276);
            case 123 -> lIIIIll(-1172185053, var9 ^ -1527414797);
            case 124 -> lIIIIll(-1172185054, var9 ^ 884290460);
            case 125 -> lIIIIll(-1172185027, var9 ^ -843571454);
            case 126 -> lIIIIll(-1172185028, var9 ^ 1466878167);
            case 127 -> lIIIIll(-1172185025, var9 ^ -1153379763);
            case 128 -> lIIIIll(-1172185026, var9 ^ 80156941);
            case 129 -> lIIIIll(-1172185031, var9 ^ 1959250701);
            case 130 -> lIIIIll(-1172185032, var9 ^ 1175145382);
            case 131 -> lIIIIll(-1172185029, var9 ^ -1244459905);
            case 132 -> lIIIIll(-1172185030, var9 ^ -978994166);
            case 133 -> lIIIIll(-1172185035, var9 ^ -451184416);
            case 134 -> lIIIIll(-1172185036, var9 ^ 843159341);
            case 135 -> lIIIIll(-1172185033, var9 ^ 1718524804);
            case 136 -> lIIIIll(-1172185034, var9 ^ -271120824);
            case 137 -> lIIIIll(-1172185039, var9 ^ 575672376);
            case 138 -> lIIIIll(-1172185040, var9 ^ 69413993);
            case 139 -> lIIIIll(-1172185037, var9 ^ 751596301);
            case 140 -> lIIIIll(-1172185038, var9 ^ -1171119792);
            case 141 -> lIIIIll(-1172185011, var9 ^ -1663120921);
            case 142 -> lIIIIll(-1172185012, var9 ^ -1680275301);
            case 143 -> lIIIIll(-1172185009, var9 ^ -1458966027);
            case 144 -> lIIIIll(-1172185010, var9 ^ 2070424479);
            case 145 -> lIIIIll(-1172185015, var9 ^ -1507195918);
            case 146 -> lIIIIll(-1172185016, var9 ^ -1784330236);
            case 147 -> lIIIIll(-1172185013, var9 ^ -1086005368);
            case 148 -> lIIIIll(-1172185014, var9 ^ -1158903310);
            case 149 -> lIIIIll(-1172185019, var9 ^ -882526537);
            case 150 -> lIIIIll(-1172185020, var9 ^ 664485484);
            case 151 -> lIIIIll(-1172185017, var9 ^ -2103512898);
            case 152 -> lIIIIll(-1172185018, var9 ^ -860507234);
            case 153 -> lIIIIll(-1172185023, var9 ^ -2077350794);
            case 154 -> lIIIIll(-1172185024, var9 ^ 1696821970);
            case 155 -> lIIIIll(-1172185021, var9 ^ 637286270);
            case 156 -> lIIIIll(-1172185022, var9 ^ 515361734);
            case 157 -> lIIIIll(-1172184995, var9 ^ 1441641029);
            case 158 -> lIIIIll(-1172184996, var9 ^ 1273100749);
            case 159 -> lIIIIll(-1172184993, var9 ^ -1185869301);
            case 160 -> lIIIIll(-1172184994, var9 ^ -842971670);
            case 161 -> lIIIIll(-1172184999, var9 ^ -1601146831);
            case 162 -> lIIIIll(-1172185000, var9 ^ -415602511);
            case 163 -> lIIIIll(-1172184997, var9 ^ 358450056);
            case 164 -> lIIIIll(-1172184998, var9 ^ 1547623497);
            case 165 -> lIIIIll(-1172185003, var9 ^ -494138737);
            case 166 -> lIIIIll(-1172185004, var9 ^ -1852841039);
            case 167 -> lIIIIll(-1172185001, var9 ^ 82514803);
            case 168 -> lIIIIll(-1172185002, var9 ^ 814434077);
            case 169 -> lIIIIll(-1172185007, var9 ^ 1354770633);
            case 170 -> lIIIIll(-1172185008, var9 ^ -1242491885);
            case 171 -> lIIIIll(-1172185005, var9 ^ 635801463);
            case 172 -> lIIIIll(-1172185006, var9 ^ -397011242);
            case 173 -> lIIIIll(-1172184979, var9 ^ -753748070);
            case 174 -> lIIIIll(-1172184980, var9 ^ -2133040011);
            case 175 -> lIIIIll(-1172184977, var9 ^ -376133357);
            case 176 -> lIIIIll(-1172184978, var9 ^ -1882088973);
            case 177 -> lIIIIll(-1172184983, var9 ^ -1813343395);
            case 178 -> lIIIIll(-1172184984, var9 ^ 1507656632);
            case 179 -> lIIIIll(-1172184981, var9 ^ -1314879333);
            case 180 -> lIIIIll(-1172184982, var9 ^ -1418498980);
            case 181 -> lIIIIll(-1172184987, var9 ^ -366179238);
            case 182 -> lIIIIll(-1172184988, var9 ^ 146205659);
            case 183 -> lIIIIll(-1172184985, var9 ^ 156828775);
            case 184 -> lIIIIll(-1172184986, var9 ^ 854814618);
            case 185 -> lIIIIll(-1172184991, var9 ^ -1793885572);
            case 186 -> lIIIIll(-1172184992, var9 ^ 1227828195);
            case 187 -> lIIIIll(-1172184989, var9 ^ -501555622);
            case 188 -> lIIIIll(-1172184990, var9 ^ 1544274610);
            case 189 -> lIIIIll(-1172184963, var9 ^ 619554665);
            case 190 -> lIIIIll(-1172184964, var9 ^ -1254233557);
            case 191 -> lIIIIll(-1172184961, var9 ^ -426933210);
            case 192 -> lIIIIll(-1172184962, var9 ^ 1083852937);
            case 193 -> lIIIIll(-1172184967, var9 ^ -1425976878);
            case 194 -> lIIIIll(-1172184968, var9 ^ -84869225);
            case 195 -> lIIIIll(-1172184965, var9 ^ -1607968710);
            case 196 -> lIIIIll(-1172184966, var9 ^ -2051923764);
            case 197 -> lIIIIll(-1172184971, var9 ^ -1702020738);
            case 198 -> lIIIIll(-1172184972, var9 ^ 1431520722);
            case 199 -> lIIIIll(-1172184969, var9 ^ 1874042743);
            case 200 -> 4;
            case 201 -> lIIIIll(-1172184970, var9 ^ 1595447207);
            case 202 -> lIIIIll(-1172184975, var9 ^ 1886995301);
            case 203 -> lIIIIll(-1172184976, var9 ^ 1967625101);
            case 204 -> lIIIIll(-1172184973, var9 ^ -1748519514);
            case 205 -> 5;
            case 206 -> lIIIIll(-1172184974, var9 ^ 1621673752);
            case 207 -> lIIIIll(-1172184691, var9 ^ 812201943);
            case 208 -> lIIIIll(-1172184692, var9 ^ -312148142);
            case 209 -> lIIIIll(-1172184689, var9 ^ 864519004);
            case 210 -> lIIIIll(-1172184690, var9 ^ -785536280);
            case 211 -> lIIIIll(-1172184695, var9 ^ 944259509);
            case 212 -> lIIIIll(-1172184696, var9 ^ -2061740609);
            case 213 -> lIIIIll(-1172184693, var9 ^ -1967791154);
            case 214 -> lIIIIll(-1172184694, var9 ^ 1294545686);
            case 215 -> lIIIIll(-1172184699, var9 ^ -1992981210);
            case 216 -> lIIIIll(-1172184700, var9 ^ 542713870);
            case 217 -> lIIIIll(-1172184697, var9 ^ 1581062735);
            case 218 -> lIIIIll(-1172184698, var9 ^ 1850769766);
            case 219 -> lIIIIll(-1172184703, var9 ^ -1925427852);
            case 220 -> lIIIIll(-1172184704, var9 ^ -163072465);
            case 221 -> lIIIIll(-1172184701, var9 ^ -1960828258);
            case 222 -> lIIIIll(-1172184702, var9 ^ -1321884952);
            case 223 -> lIIIIll(-1172184675, var9 ^ 2017773073);
            case 224 -> lIIIIll(-1172184676, var9 ^ -1069389867);
            case 225 -> lIIIIll(-1172184673, var9 ^ 507796442);
            case 226 -> lIIIIll(-1172184674, var9 ^ -1627909786);
            case 227 -> lIIIIll(-1172184679, var9 ^ 1890647917);
            case 228 -> lIIIIll(-1172184680, var9 ^ -1318019911);
            case 229 -> lIIIIll(-1172184677, var9 ^ -232813902);
            case 230 -> lIIIIll(-1172184678, var9 ^ 1628334544);
            case 231 -> lIIIIll(-1172184683, var9 ^ -2026236723);
            case 232 -> lIIIIll(-1172184684, var9 ^ -1484278230);
            case 233 -> lIIIIll(-1172184681, var9 ^ -177045575);
            case 234 -> lIIIIll(-1172184682, var9 ^ -60101642);
            case 235 -> lIIIIll(-1172184687, var9 ^ -1182666378);
            case 236 -> 2;
            case 237 -> lIIIIll(-1172184688, var9 ^ -651700287);
            case 238 -> lIIIIll(-1172184685, var9 ^ 306615418);
            case 239 -> lIIIIll(-1172184686, var9 ^ -48833079);
            case 240 -> lIIIIll(-1172184659, var9 ^ -1728887424);
            case 241 -> lIIIIll(-1172184660, var9 ^ -2048908651);
            case 242 -> lIIIIll(-1172184657, var9 ^ 1630780741);
            case 243 -> lIIIIll(-1172184658, var9 ^ 1570119963);
            case 244 -> 3;
            case 245 -> lIIIIll(-1172184663, var9 ^ -826573102);
            case 246 -> lIIIIll(-1172184664, var9 ^ -172023931);
            case 247 -> lIIIIll(-1172184661, var9 ^ -44510296);
            case 248 -> lIIIIll(-1172184662, var9 ^ -1524233816);
            case 249 -> lIIIIll(-1172184667, var9 ^ -583612223);
            case 250 -> lIIIIll(-1172184668, var9 ^ -462908450);
            case 251 -> lIIIIll(-1172184665, var9 ^ -1876363245);
            case 252 -> lIIIIll(-1172184666, var9 ^ 1762284039);
            case 253 -> lIIIIll(-1172184671, var9 ^ 2075624144);
            case 254 -> lIIIIll(-1172184672, var9 ^ 1972217444);
            default -> lIIIIll(-1172184669, var9 ^ 451343543);
         };
         int var5 = (var1 & lIIIIll(-1172184670, var9 ^ 1399033941)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIIIll(-1172184643, var9 ^ -200633343)) >>> lIIIIll(-1172184644, var9 ^ -1684338968)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIIIll(-1172184641, var9 ^ -2103349928);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIIIll(-1172184642, var9 ^ 663248427);
            }
         }

         IlIlllI[var2] = new String(var3).intern();
      }

      return IlIlllI[var2];
   }

   public void IlIlI(class_1297 var1) {
   }

   public void lllIlI(class_1297 var1, byte var2) {
   }

   private void IlIlIlI() {
      IIIIIllII var1 = IIIIIllII.III();

      try {
         if (var1 != null) {
            var1.lll();
         }
      } catch (RuntimeException var2) {
         throw IIlllII(var2);
      }
   }

   public final void IlIlIll(boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlIIIIIIl.IlIllIl Z
      // 04: ifeq 16
      // 07: aload 0
      // 08: getfield k74/x/IlIIIIIIl.Illllll Z
      // 0b: iload 1
      // 0c: if_icmpne 1b
      // 0f: goto 16
      // 12: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: return
      // 17: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual k74/x/IlIIIIIIl.IIIIlIl ()Z
      // 1f: istore 2
      // 20: aload 0
      // 21: getfield k74/x/IlIIIIIIl.Illllll Z
      // 24: istore 3
      // 25: iload 1
      // 26: ifeq 35
      // 29: aload 0
      // 2a: bipush 0
      // 2b: putfield k74/x/IlIIIIIIl.IlIllII Z
      // 2e: goto 35
      // 31: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 34: athrow
      // 35: aload 0
      // 36: iload 1
      // 37: putfield k74/x/IlIIIIIIl.Illllll Z
      // 3a: aload 0
      // 3b: iload 2
      // 3c: invokevirtual k74/x/IlIIIIIIl.IIIIIlI (Z)Z
      // 3f: ifne 4e
      // 42: aload 0
      // 43: iload 3
      // 44: putfield k74/x/IlIIIIIIl.Illllll Z
      // 47: goto 4e
      // 4a: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4d: athrow
      // 4e: return
   }

   public String IlIllII() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IlIIIIIIl.IllIlI ()Ljava/lang/String;
      // 04: astore 1
      // 05: aload 0
      // 06: invokevirtual k74/x/IlIIIIIIl.IlllIl ()Ljava/lang/String;
      // 09: astore 2
      // 0a: aload 2
      // 0b: ifnull 1c
      // 0e: aload 2
      // 0f: invokevirtual java/lang/String.isBlank ()Z
      // 12: ifeq 22
      // 15: goto 1c
      // 18: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b: athrow
      // 1c: aload 1
      // 1d: areturn
      // 1e: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 21: athrow
      // 22: aload 1
      // 23: ldc_w -1172184647
      // 26: ldc_w -315397409
      // 29: ldc_w 2080828800
      // 2c: ixor
      // 2d: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 30: ldc_w -1172184648
      // 33: ldc_w -315397409
      // 36: ldc_w -786218977
      // 39: ixor
      // 3a: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 3d: invokestatic k74/x/IlIIIIIIl.IlIlIIl (II)Ljava/lang/String;
      // 40: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 43: aload 2
      // 44: ldc_w -1172184645
      // 47: ldc_w -315397409
      // 4a: ldc_w 1781449272
      // 4d: ixor
      // 4e: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 51: ldc_w -1172184646
      // 54: ldc_w -315397409
      // 57: ldc_w -186216965
      // 5a: ixor
      // 5b: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 5e: invokestatic k74/x/IlIIIIIIl.IlIlIIl (II)Ljava/lang/String;
      // 61: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 64: astore 6
      // 66: astore 5
      // 68: astore 4
      // 6a: astore 3
      // 6b: new java/lang/StringBuilder
      // 6e: dup
      // 6f: invokespecial java/lang/StringBuilder.<init> ()V
      // 72: aload 3
      // 73: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 76: aload 4
      // 78: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 7b: aload 5
      // 7d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 80: aload 6
      // 82: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 85: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 88: areturn
   }

   public void IlIllIl(boolean var1) {
      try {
         if (!this.IlIllIl) {
            this.IllIIll = true;
            return;
         }
      } catch (RuntimeException var9) {
         throw IIlllII(var9);
      }

      try {
         if (this.IllIIll == var1) {
            return;
         }
      } catch (RuntimeException var7) {
         throw IIlllII(var7);
      }

      if (var1) {
         this.IlIllII = false;

         try {
            if (!this.IlIIllI()) {
               this.IIIIIll();
               return;
            }

            if (!this.lllIII()) {
               return;
            }
         } catch (LinkageError | RuntimeException var6) {
            this.IIlIlIl();
            this.IllIIlI(0, var6);
            return;
         }
      }

      boolean var2 = this.IIIIlIl();
      boolean var3 = this.IllIIll;

      try {
         this.IllIIll = var1;
         if (!this.IIIIIlI(var2)) {
            this.IllIIll = var3;
            return;
         }
      } catch (RuntimeException var8) {
         throw IIlllII(var8);
      }

      try {
         IlIlIllII.l().IIl(this, var1);
      } catch (LinkageError | RuntimeException var5) {
         this.IllIIlI(5, var5);
      }

      this.IllIllI();
   }

   final synchronized void IlIlllI(int var1, Throwable var2) {
      try {
         if (this.IlIllII) {
            return;
         }
      } catch (RuntimeException var12) {
         throw IIlllII(var12);
      }

      this.IlIllII = true;
      long var3 = ++this.IlIllll;

      try {
         this.IllIIlI(var1, var2);
         if (!this.IlIllIl) {
            return;
         }
      } catch (RuntimeException var11) {
         throw IIlllII(var11);
      }

      boolean var5 = this.IIIIlIl();
      this.IllIIll = false;
      this.Illllll = false;
      class_310 var6 = class_310.method_1551();
      Runnable var7 = this::IllIlll;

      label53: {
         try {
            if (var6 == null || var6.method_18854()) {
               break label53;
            }
         } catch (RuntimeException var10) {
            throw IIlllII(var10);
         }

         try {
            var6.execute(var7);
         } catch (LinkageError | RuntimeException var9) {
            this.IllIIlI(3, var9);
            this.IllIllI();
         }

         return;
      }

      var7.run();
   }

   public void IlIllll(class_306 var1) {
      class_306 var10000;
      label28: {
         try {
            if (var1 == null) {
               var10000 = class_3675.field_16237;
               break label28;
            }
         } catch (RuntimeException var4) {
            throw IIlllII(var4);
         }

         var10000 = var1;
      }

      class_306 var2 = var10000;

      try {
         if (Objects.equals(this.IllIIII, var2)) {
            return;
         }
      } catch (RuntimeException var3) {
         throw IIlllII(var3);
      }

      this.IllIIII = var2;
      this.IlIlIlI();
   }

   public void IllIIII(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlIIIIIIl.IlIllIl Z
      // 04: ifeq 40
      // 07: aload 1
      // 08: ifnull 40
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: aload 1
      // 13: ldc_w -1172184651
      // 16: ldc_w -1826980282
      // 19: ldc_w -1604264278
      // 1c: ixor
      // 1d: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 20: ldc_w -1172184652
      // 23: ldc_w -1826980282
      // 26: ldc_w -1005637919
      // 29: ixor
      // 2a: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 2d: invokestatic k74/x/IlIIIIIIl.IlIlIIl (II)Ljava/lang/String;
      // 30: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 33: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 36: ifne 45
      // 39: goto 40
      // 3c: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3f: athrow
      // 40: return
      // 41: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 44: athrow
      // 45: aload 1
      // 46: ldc_w -1172184649
      // 49: ldc_w -1826980282
      // 4c: ldc_w 227977449
      // 4f: ixor
      // 50: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 53: ldc_w -1172184650
      // 56: ldc_w -1826980282
      // 59: ldc_w 1040862418
      // 5c: ixor
      // 5d: invokestatic k74/x/IlIIIIIIl.lIIIIll (II)I
      // 60: invokestatic k74/x/IlIIIIIIl.IlIlIIl (II)Ljava/lang/String;
      // 63: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 66: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 69: invokevirtual com/google/gson/JsonElement.getAsBoolean ()Z
      // 6c: istore 2
      // 6d: iload 2
      // 6e: ifeq 89
      // 71: aload 0
      // 72: invokevirtual k74/x/IlIIIIIIl.IlIIllI ()Z
      // 75: ifne 89
      // 78: goto 7f
      // 7b: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7e: athrow
      // 7f: aload 0
      // 80: bipush 0
      // 81: putfield k74/x/IlIIIIIIl.IllIIll Z
      // 84: return
      // 85: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 88: athrow
      // 89: aload 0
      // 8a: iload 2
      // 8b: invokevirtual k74/x/IlIIIIIIl.IlIllIl (Z)V
      // 8e: return
   }

   private boolean IllIIIl(IIllllIl<?> param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: instanceof k74/x/IIIIIlII
      // 04: ifne 0d
      // 07: bipush 0
      // 08: ireturn
      // 09: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c: athrow
      // 0d: aload 1
      // 0e: invokevirtual k74/x/IIllllIl.l ()J
      // 11: lstore 2
      // 12: lload 2
      // 13: getstatic k74/x/IlIIIIIIl.IllIllI J
      // 16: lcmp
      // 17: ifeq 29
      // 1a: lload 2
      // 1b: getstatic k74/x/IlIIIIIIl.IllllIl J
      // 1e: lcmp
      // 1f: ifne 31
      // 22: goto 29
      // 25: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 28: athrow
      // 29: bipush 1
      // 2a: goto 32
      // 2d: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
   }

   private void IllIIlI(int var1, Throwable var2) {
   }

   protected <T extends IIllllIl<?>> T IllIIll(T var1) {
      this.IlllllI.add(var1);
      return (T)var1;
   }

   public lllIIlIl IllIlII() {
      return this.IlllIlI;
   }

   public final boolean IllIlIl(class_306 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 12
      // 04: aload 1
      // 05: invokestatic k74/x/IIll.IIlll (Lnet/minecraft/class_3675$class_306;)Z
      // 08: ifeq 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield k74/x/IlIIIIIIl.IlllllI Ljava/util/List;
      // 1c: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 21: astore 2
      // 22: aload 2
      // 23: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 28: ifeq 65
      // 2b: aload 2
      // 2c: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 31: checkcast k74/x/IIllllIl
      // 34: astore 3
      // 35: aload 3
      // 36: instanceof k74/x/lIllIlII
      // 39: ifeq 62
      // 3c: aload 3
      // 3d: checkcast k74/x/lIllIlII
      // 40: astore 4
      // 42: aload 1
      // 43: aload 4
      // 45: invokevirtual k74/x/lIllIlII.IllI ()Ljava/lang/Object;
      // 48: invokevirtual net/minecraft/class_3675$class_306.equals (Ljava/lang/Object;)Z
      // 4b: ifeq 62
      // 4e: aload 3
      // 4f: invokevirtual k74/x/IIllllIl.lIll ()Z
      // 52: ifeq 62
      // 55: goto 5c
      // 58: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5b: athrow
      // 5c: bipush 1
      // 5d: ireturn
      // 5e: invokestatic k74/x/IlIIIIIIl.IIlllII (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 61: athrow
      // 62: goto 22
      // 65: bipush 0
      // 66: ireturn
   }

   private void IllIllI() {
      try {
         this.IlIlIlI();
      } catch (LinkageError | RuntimeException var2) {
         this.IllIIlI(4, var2);
      }
   }

   private void IllIlll(class_310 var1, boolean var2, long var3) {
      this.IlIIIlI(var1, var2, var3);
   }

   static void IlllIII(JsonObject var0, long var1, JsonElement var3) {
      try {
         if (var0 != null) {
            var0.add(IIIIllI(var1), var3);
         }
      } catch (RuntimeException var4) {
         throw IIlllII(var4);
      }
   }
}
