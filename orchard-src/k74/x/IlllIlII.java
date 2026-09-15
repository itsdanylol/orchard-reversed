package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10055;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class IlllIlII {
   private static boolean II;
   private static float Il;
   private static float lI;
   private static boolean ll;
   private static float III;
   private static int IIl;
   private static float IlI;
   private static float Ill;
   private static boolean lII;
   private static float lIl;
   private static final float llI = 176.0F;
   private static final int[] llllI = new int[23];
   public static final int lll = 175;
   public static final int IIII = 200;
   private static boolean IIIl;
   private static final int IIlI = 3;
   public static final int IIll = 300;
   private static float IlII;
   private static int IlIl;
   private static int IllI;
   public static final int Illl = 50;
   private static final double lIII = 0.095;
   private static int lIIl;
   private static final IIIll lIlI;
   public static final int lIll = 400;
   private static float l;
   private static int llII;
   private static int llIl;
   private static boolean lllI;
   private static float llll;
   public static final int IIIII = 150;
   private static float IIIIl;
   private static float IIIlI;
   private static boolean IIIll;
   private static float IIlII;
   private static boolean IIlIl;
   private static boolean IIllI;
   private static int IIlll;
   public static final int IlIII = 250;
   private static long IlIIl;
   public static final int IlIlI = 300;
   public static final int IlIll = 100;
   private static final float IllII = 179.0F;
   private static boolean IllIl;
   private static boolean IlllI;
   private static final double Illll = 0.035;
   private static float lIIII;
   private static final double I = 0.1;
   private static boolean lIIIl;
   private static int lIIlI;
   private static float lIIll;
   private static int lIlII;
   private static float lIlIl;
   private static boolean lIllI;
   private static boolean lIlll;
   private static long llIII;
   private static float llIIl;
   private static boolean llIlI;
   private static IIIll llIll;
   private static int lllII;
   private static float lllIl;

   public static void I(class_310 var0, float var1, float var2) {
      lIIl(var0, var1, var2);
   }

   private static float[] II(class_310 param0, float param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.lI (Lnet/minecraft/class_310;)F
      // 04: fstore 5
      // 06: fload 5
      // 08: invokestatic java/lang/Float.isFinite (F)Z
      // 0b: ifeq 1c
      // 0e: fload 5
      // 10: fconst_0
      // 11: fcmpg
      // 12: ifgt 34
      // 15: goto 1c
      // 18: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b: athrow
      // 1c: bipush 2
      // 1d: newarray 6
      // 1f: dup
      // 20: bipush 0
      // 21: fload 3
      // 22: fastore
      // 23: dup
      // 24: bipush 1
      // 25: fload 4
      // 27: ldc -90.0
      // 29: ldc 90.0
      // 2b: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 2e: fastore
      // 2f: areturn
      // 30: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 33: athrow
      // 34: fload 3
      // 35: fload 1
      // 36: fsub
      // 37: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 3a: fstore 6
      // 3c: fload 4
      // 3e: ldc -90.0
      // 40: ldc 90.0
      // 42: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 45: fload 2
      // 46: fsub
      // 47: fstore 7
      // 49: fload 1
      // 4a: fload 6
      // 4c: fload 5
      // 4e: fdiv
      // 4f: invokestatic java/lang/Math.round (F)I
      // 52: i2f
      // 53: fload 5
      // 55: fmul
      // 56: fadd
      // 57: fstore 8
      // 59: fload 2
      // 5a: fload 7
      // 5c: fload 5
      // 5e: fdiv
      // 5f: invokestatic java/lang/Math.round (F)I
      // 62: i2f
      // 63: fload 5
      // 65: fmul
      // 66: fadd
      // 67: fstore 9
      // 69: bipush 2
      // 6a: newarray 6
      // 6c: dup
      // 6d: bipush 0
      // 6e: fload 1
      // 6f: fload 8
      // 71: fload 1
      // 72: fsub
      // 73: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 76: fadd
      // 77: fastore
      // 78: dup
      // 79: bipush 1
      // 7a: fload 9
      // 7c: ldc -90.0
      // 7e: ldc 90.0
      // 80: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 83: fastore
      // 84: areturn
   }

   private static float Il(float param0, float param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: ifeq 2a
      // 04: fload 0
      // 05: invokestatic java/lang/Math.abs (F)F
      // 08: fconst_0
      // 09: fcmpl
      // 0a: ifle 2a
      // 0d: goto 14
      // 10: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: fload 0
      // 15: invokestatic java/lang/Math.abs (F)F
      // 18: fload 1
      // 19: fcmpg
      // 1a: ifge 2a
      // 1d: goto 24
      // 20: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: fconst_0
      // 25: freturn
      // 26: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 29: athrow
      // 2a: fload 0
      // 2b: fload 1
      // 2c: fdiv
      // 2d: invokestatic java/lang/Math.round (F)I
      // 30: i2f
      // 31: fload 1
      // 32: fmul
      // 33: freturn
   }

   private static float lI(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 12
      // 04: aload 0
      // 05: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: fconst_0
      // 13: freturn
      // 14: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 1c: invokevirtual net/minecraft/class_315.method_42495 ()Lnet/minecraft/class_7172;
      // 1f: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
      // 22: checkcast java/lang/Double
      // 25: invokevirtual java/lang/Double.doubleValue ()D
      // 28: dstore 1
      // 29: dload 1
      // 2a: ldc2_w 0.6
      // 2d: dmul
      // 2e: ldc2_w 0.2
      // 31: dadd
      // 32: dstore 3
      // 33: dload 3
      // 34: dload 3
      // 35: dmul
      // 36: dload 3
      // 37: dmul
      // 38: ldc2_w 8.0
      // 3b: dmul
      // 3c: ldc2_w 0.15
      // 3f: dmul
      // 40: dstore 5
      // 42: dload 5
      // 44: d2f
      // 45: invokestatic java/lang/Float.isFinite (F)Z
      // 48: ifeq 55
      // 4b: dload 5
      // 4d: d2f
      // 4e: goto 56
      // 51: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 54: athrow
      // 55: fconst_0
      // 56: freturn
   }

   private static double ll(double var0) {
      double var2 = Math.floor(var0);
      return class_3532.method_15350(var0, var2 + 0.08, var2 + 0.92);
   }

   public static boolean III() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IlllIlII.IIlIl Z
      // 03: ifne 13
      // 06: getstatic k74/x/IlllIlII.lIlll Z
      // 09: ifeq 1b
      // 0c: goto 13
      // 0f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: bipush 1
      // 14: goto 1c
      // 17: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
   }

   private static void IIl() {
      IIlIl = false;
      llIll = null;
      lIllI = false;
      IIIll = false;
      lllI = false;
      IIllI = false;
      ll = false;
      lIIIl = false;
      lII = false;
      IllIl = false;
      llIlI = false;
   }

   private static float IlI(float var0, float var1) {
      return var1 + llIII(var0 - var1);
   }

   private static float[] Ill(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IlllIlII.IIIl Z
      // 03: ifeq 3a
      // 06: getstatic k74/x/IlllIlII.IIIlI F
      // 09: invokestatic java/lang/Float.isFinite (F)Z
      // 0c: ifeq 3a
      // 0f: goto 16
      // 12: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: getstatic k74/x/IlllIlII.III F
      // 19: invokestatic java/lang/Float.isFinite (F)Z
      // 1c: ifeq 3a
      // 1f: goto 26
      // 22: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: bipush 2
      // 27: newarray 6
      // 29: dup
      // 2a: bipush 0
      // 2b: getstatic k74/x/IlllIlII.IIIlI F
      // 2e: fastore
      // 2f: dup
      // 30: bipush 1
      // 31: getstatic k74/x/IlllIlII.III F
      // 34: fastore
      // 35: areturn
      // 36: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 39: athrow
      // 3a: aload 0
      // 3b: ifnull 6f
      // 3e: aload 0
      // 3f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 42: ifnull 6f
      // 45: goto 4c
      // 48: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4b: athrow
      // 4c: bipush 2
      // 4d: newarray 6
      // 4f: dup
      // 50: bipush 0
      // 51: aload 0
      // 52: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 55: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 58: fastore
      // 59: dup
      // 5a: bipush 1
      // 5b: aload 0
      // 5c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5f: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 62: ldc -90.0
      // 64: ldc 90.0
      // 66: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 69: fastore
      // 6a: areturn
      // 6b: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6e: athrow
      // 6f: bipush 2
      // 70: newarray 6
      // 72: dup
      // 73: bipush 0
      // 74: fconst_0
      // 75: fastore
      // 76: dup
      // 77: bipush 1
      // 78: fconst_0
      // 79: fastore
      // 7a: areturn
   }

   public static boolean lII() {
      return IIlIl;
   }

   private static RuntimeException lIl(RuntimeException var0) {
      return var0;
   }

   private static float[] llI(class_310 param0, float param1, float param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.lI (Lnet/minecraft/class_310;)F
      // 04: fstore 5
      // 06: fload 5
      // 08: invokestatic java/lang/Float.isFinite (F)Z
      // 0b: ifeq 1c
      // 0e: fload 5
      // 10: fconst_0
      // 11: fcmpg
      // 12: ifgt 3b
      // 15: goto 1c
      // 18: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b: athrow
      // 1c: bipush 2
      // 1d: newarray 6
      // 1f: dup
      // 20: bipush 0
      // 21: fload 1
      // 22: fload 3
      // 23: fload 1
      // 24: fsub
      // 25: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 28: fadd
      // 29: fastore
      // 2a: dup
      // 2b: bipush 1
      // 2c: fload 4
      // 2e: ldc -90.0
      // 30: ldc 90.0
      // 32: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 35: fastore
      // 36: areturn
      // 37: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3a: athrow
      // 3b: fload 3
      // 3c: fload 1
      // 3d: fsub
      // 3e: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 41: getstatic k74/x/IlllIlII.Ill F
      // 44: fadd
      // 45: fstore 6
      // 47: fload 4
      // 49: ldc -90.0
      // 4b: ldc 90.0
      // 4d: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 50: fload 2
      // 51: fsub
      // 52: getstatic k74/x/IlllIlII.lllIl F
      // 55: fadd
      // 56: fstore 7
      // 58: fload 6
      // 5a: fload 5
      // 5c: fdiv
      // 5d: f2i
      // 5e: istore 8
      // 60: fload 7
      // 62: fload 5
      // 64: fdiv
      // 65: f2i
      // 66: istore 9
      // 68: iload 8
      // 6a: i2f
      // 6b: fload 5
      // 6d: fmul
      // 6e: fstore 10
      // 70: iload 9
      // 72: i2f
      // 73: fload 5
      // 75: fmul
      // 76: fstore 11
      // 78: fload 6
      // 7a: fload 10
      // 7c: fsub
      // 7d: putstatic k74/x/IlllIlII.Ill F
      // 80: fload 7
      // 82: fload 11
      // 84: fsub
      // 85: putstatic k74/x/IlllIlII.lllIl F
      // 88: bipush 2
      // 89: newarray 6
      // 8b: dup
      // 8c: bipush 0
      // 8d: fload 1
      // 8e: fload 10
      // 90: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 93: fadd
      // 94: fastore
      // 95: dup
      // 96: bipush 1
      // 97: fload 2
      // 98: fload 11
      // 9a: fadd
      // 9b: ldc -90.0
      // 9d: ldc 90.0
      // 9f: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // a2: fastore
      // a3: areturn
   }

   public static float lll(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 04: ifeq 14
      // 07: getstatic k74/x/IlllIlII.IllIl Z
      // 0a: ifne 1b
      // 0d: goto 14
      // 10: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: ldc NaN
      // 16: freturn
      // 17: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: putstatic k74/x/IlllIlII.IllIl Z
      // 1f: getstatic k74/x/IlllIlII.lI F
      // 22: freturn
   }

   public static boolean IIII(class_310 var0, int var1, float var2, float var3, IIIll var4) {
      return IIllll(var0, var1, var2, var3, var4, false, true, false, false);
   }

   public static void IIIl(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIllllI.II ()Z
      // 03: ifeq 0b
      // 06: return
      // 07: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0a: athrow
      // 0b: getstatic k74/x/IlllIlII.lIlll Z
      // 0e: ifne 16
      // 11: return
      // 12: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: aload 0
      // 17: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 1a: ifeq 2e
      // 1d: aload 0
      // 1e: getstatic k74/x/IlllIlII.lIlIl F
      // 21: getstatic k74/x/IlllIlII.l F
      // 24: invokestatic k74/x/IlllIlII.lIIl (Lnet/minecraft/class_310;FF)V
      // 27: goto 2e
      // 2a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d: athrow
      // 2e: bipush 0
      // 2f: putstatic k74/x/IlllIlII.lIlll Z
      // 32: getstatic k74/x/IlllIlII.lllI Z
      // 35: ifeq 70
      // 38: getstatic k74/x/IlllIlII.IIllI Z
      // 3b: ifne 70
      // 3e: goto 45
      // 41: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 44: athrow
      // 45: aload 0
      // 46: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 49: ifeq 70
      // 4c: goto 53
      // 4f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 52: athrow
      // 53: bipush 1
      // 54: putstatic k74/x/IlllIlII.IIllI Z
      // 57: aload 0
      // 58: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5b: getfield net/minecraft/class_746.field_6012 I
      // 5e: bipush 1
      // 5f: iadd
      // 60: putstatic k74/x/IlllIlII.lIIlI I
      // 63: bipush 0
      // 64: putstatic k74/x/IlllIlII.ll Z
      // 67: bipush 0
      // 68: putstatic k74/x/IlllIlII.llIlI Z
      // 6b: return
      // 6c: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 6f: athrow
      // 70: invokestatic k74/x/IlllIlII.IIl ()V
      // 73: return
   }

   private static long IIlI(long var0) {
      var0 ^= var0 >>> IlIllI(-899198811, 521458404 ^ -1163042663);
      var0 *= -4658895280553007687L;
      var0 ^= var0 >>> IlIllI(-899198812, 521458404 ^ -2081724221);
      var0 *= -7723592293110705685L;
      return var0 ^ var0 >>> IlIllI(-899198809, 521458404 ^ -661663561);
   }

   private static float[] IIll(class_243 var0, class_243 var1) {
      double var2 = var1.field_1352 - var0.field_1352;
      double var4 = var1.field_1351 - var0.field_1351;
      double var6 = var1.field_1350 - var0.field_1350;
      double var8 = Math.sqrt(var2 * var2 + var6 * var6);

      float var10000;
      label17: {
         try {
            if (var8 < 1.0E-4) {
               var10000 = 0.0F;
               break label17;
            }
         } catch (RuntimeException var12) {
            throw lIl(var12);
         }

         var10000 = (float)(Math.toDegrees(Math.atan2(var6, var2)) - 90.0);
      }

      float var10 = var10000;
      float var11 = class_3532.method_15363((float)(-Math.toDegrees(Math.atan2(var4, Math.max(var8, 1.0E-4)))), -90.0F, 90.0F);
      return new float[]{var10, var11};
   }

   public static boolean IlII(class_310 var0, int var1, float var2, float var3, IIIll var4) {
      try {
         if (!lIIIl()) {
            return false;
         }
      } catch (RuntimeException var5) {
         throw lIl(var5);
      }

      return IIllll(var0, var1, IllI(var0, var2), var3, var4, false, true, true, false);
   }

   public static float IlIl() {
      return llIIl;
   }

   private static float IllI(class_310 var0, float var1) {
      float var2 = lI(var0);

      label39: {
         try {
            if (Float.isFinite(var2) && !(var2 <= 0.0F)) {
               break label39;
            }
         } catch (RuntimeException var9) {
            throw lIl(var9);
         }

         var2 = 0.15F;
      }

      llIII++;
      if (!Float.isNaN(IIIIl)) {
         float var3 = Math.abs(class_3532.method_15393(var1 - IIIIl));
         if (var3 < var2 * 2.5F) {
            long var4 = IIlI(llIII * -7046029254386353131L + 2246822507L);
            int var6 = 2 + (int)(Math.abs(var4) % 3L);

            float var10000;
            label27: {
               try {
                  if ((var4 & 16L) != 0L) {
                     var10000 = 1.0F;
                     break label27;
                  }
               } catch (RuntimeException var8) {
                  throw lIl(var8);
               }

               var10000 = -1.0F;
            }

            float var7 = var10000;
            var1 += var7 * var6 * var2;
         }
      }

      IIIIl = var1;
      return var1;
   }

   public static boolean Illl(class_310 var0, class_1297 var1, double var2) {
      return l(var0, var1, var2);
   }

   public static float[] lIII(class_310 param0, class_243 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 04: ifeq 12
      // 07: aload 1
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: aconst_null
      // 13: areturn
      // 14: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 1f: aload 1
      // 20: invokestatic k74/x/IlllIlII.IIll (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)[F
      // 23: astore 2
      // 24: aload 1
      // 25: getfield net/minecraft/class_243.field_1352 D
      // 28: aload 0
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 2f: dsub
      // 30: dstore 3
      // 31: aload 1
      // 32: getfield net/minecraft/class_243.field_1350 D
      // 35: aload 0
      // 36: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 39: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 3c: dsub
      // 3d: dstore 5
      // 3f: dload 3
      // 40: dload 3
      // 41: dmul
      // 42: dload 5
      // 44: dload 5
      // 46: dmul
      // 47: dadd
      // 48: invokestatic java/lang/Math.sqrt (D)D
      // 4b: ldc2_w 1.0E-4
      // 4e: dcmpg
      // 4f: ifge 60
      // 52: aload 0
      // 53: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 56: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 59: goto 63
      // 5c: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5f: athrow
      // 60: aload 2
      // 61: bipush 0
      // 62: faload
      // 63: fstore 7
      // 65: aload 0
      // 66: aload 0
      // 67: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 6a: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 6d: aload 0
      // 6e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 71: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 74: fload 7
      // 76: aload 2
      // 77: bipush 1
      // 78: faload
      // 79: invokestatic k74/x/IlllIlII.II (Lnet/minecraft/class_310;FFFF)[F
      // 7c: areturn
   }

   private static void lIIl(class_310 var0, float var1, float var2) {
      try {
         if (!IlIlIl(var0)) {
            return;
         }
      } catch (RuntimeException var6) {
         throw lIl(var6);
      }

      class_746 var3 = var0.field_1724;
      float[] var4 = llIIl(var0, var1, var2);

      try {
         if (var4 == null) {
            return;
         }
      } catch (RuntimeException var5) {
         throw lIl(var5);
      }

      var1 = var4[0];
      var2 = var4[1];
      var3.method_36456(var1);
      var3.method_36457(var2);
      var3.field_3932 = var1;
      var3.field_3931 = var1;
      var3.field_3916 = var2;
      var3.field_3914 = var2;
      k74.x.IIll.lIlIlI(var0, var1);
   }

   private static void lIlI(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IlllIlII.ll Z
      // 03: ifne 26
      // 06: getstatic k74/x/IlllIlII.IlII F
      // 09: invokestatic java/lang/Float.isFinite (F)Z
      // 0c: ifeq 26
      // 0f: goto 16
      // 12: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: getstatic k74/x/IlllIlII.IIlII F
      // 19: invokestatic java/lang/Float.isFinite (F)Z
      // 1c: ifne 2b
      // 1f: goto 26
      // 22: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: return
      // 27: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: invokestatic k74/x/IlllIlII.Ill (Lnet/minecraft/class_310;)[F
      // 2f: astore 1
      // 30: aload 0
      // 31: aload 1
      // 32: bipush 0
      // 33: faload
      // 34: aload 1
      // 35: bipush 1
      // 36: faload
      // 37: getstatic k74/x/IlllIlII.IlII F
      // 3a: aload 1
      // 3b: bipush 0
      // 3c: faload
      // 3d: invokestatic k74/x/IlllIlII.IlI (FF)F
      // 40: getstatic k74/x/IlllIlII.IIlII F
      // 43: invokestatic k74/x/IlllIlII.llI (Lnet/minecraft/class_310;FFFF)[F
      // 46: astore 2
      // 47: aload 2
      // 48: bipush 0
      // 49: faload
      // 4a: putstatic k74/x/IlllIlII.IlII F
      // 4d: aload 2
      // 4e: bipush 1
      // 4f: faload
      // 50: putstatic k74/x/IlllIlII.IIlII F
      // 53: bipush 1
      // 54: putstatic k74/x/IlllIlII.ll Z
      // 57: return
   }

   private static float lIll(float param0, float param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: fload 1
      // 01: fconst_0
      // 02: fcmpl
      // 03: ifeq 26
      // 06: fload 0
      // 07: fconst_0
      // 08: fcmpl
      // 09: ifeq 26
      // 0c: goto 13
      // 0f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: fload 0
      // 14: invokestatic java/lang/Math.signum (F)F
      // 17: fload 1
      // 18: invokestatic java/lang/Math.signum (F)F
      // 1b: fcmpl
      // 1c: ifne 2c
      // 1f: goto 26
      // 22: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: fload 0
      // 27: freturn
      // 28: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: fload 1
      // 2d: invokestatic java/lang/Math.signum (F)F
      // 30: ldc_w 360.0
      // 33: fload 0
      // 34: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 37: invokestatic java/lang/Math.abs (F)F
      // 3a: fsub
      // 3b: fmul
      // 3c: freturn
   }

   public static boolean llII(class_310 param0, class_10055 param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 12
      // 04: aload 0
      // 05: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 08: ifne 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 1c: invokevirtual net/minecraft/class_315.method_31044 ()Lnet/minecraft/class_5498;
      // 1f: invokevirtual net/minecraft/class_5498.method_31034 ()Z
      // 22: ifeq 2b
      // 25: bipush 0
      // 26: ireturn
      // 27: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a: athrow
      // 2b: aload 0
      // 2c: invokestatic k74/x/IlllIlII.lIIlI (Lnet/minecraft/class_310;)Z
      // 2f: ifne 3d
      // 32: aload 0
      // 33: aload 1
      // 34: fload 2
      // 35: invokestatic k74/x/IlllIlII.llllI (Lnet/minecraft/class_310;Lnet/minecraft/class_10055;F)Z
      // 38: ireturn
      // 39: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 41: getfield net/minecraft/class_746.field_6012 I
      // 44: getstatic k74/x/IlllIlII.lIlII I
      // 47: if_icmpne 57
      // 4a: fload 2
      // 4b: fconst_0
      // 4c: fconst_1
      // 4d: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 50: goto 58
      // 53: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 56: athrow
      // 57: fconst_1
      // 58: fstore 3
      // 59: aload 1
      // 5a: fload 3
      // 5b: getstatic k74/x/IlllIlII.llll F
      // 5e: getstatic k74/x/IlllIlII.llIIl F
      // 61: invokestatic net/minecraft/class_3532.method_17821 (FFF)F
      // 64: putfield net/minecraft/class_10055.field_53446 F
      // 67: aload 1
      // 68: fconst_0
      // 69: putfield net/minecraft/class_10055.field_53447 F
      // 6c: aload 1
      // 6d: fload 3
      // 6e: getstatic k74/x/IlllIlII.lIl F
      // 71: getstatic k74/x/IlllIlII.IlI F
      // 74: invokestatic net/minecraft/class_3532.method_16439 (FFF)F
      // 77: putfield net/minecraft/class_10055.field_53448 F
      // 7a: bipush 1
      // 7b: ireturn
   }

   public static void llIl(class_2596<?> param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: instanceof net/minecraft/class_2828
      // 04: ifeq 13
      // 07: aload 0
      // 08: checkcast net/minecraft/class_2828
      // 0b: astore 1
      // 0c: aload 1
      // 0d: invokevirtual net/minecraft/class_2828.method_36172 ()Z
      // 10: ifne 18
      // 13: return
      // 14: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 1b: astore 2
      // 1c: aload 2
      // 1d: invokestatic k74/x/IlllIlII.IlIlII (Lnet/minecraft/class_310;)Z
      // 20: ifne 28
      // 23: return
      // 24: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 27: athrow
      // 28: aload 2
      // 29: invokestatic k74/x/IlllIlII.Ill (Lnet/minecraft/class_310;)[F
      // 2c: astore 3
      // 2d: aload 3
      // 2e: bipush 0
      // 2f: faload
      // 30: fstore 4
      // 32: aload 3
      // 33: bipush 1
      // 34: faload
      // 35: fstore 5
      // 37: aload 1
      // 38: fload 4
      // 3a: invokevirtual net/minecraft/class_2828.method_12271 (F)F
      // 3d: putstatic k74/x/IlllIlII.IIIlI F
      // 40: aload 1
      // 41: fload 5
      // 43: invokevirtual net/minecraft/class_2828.method_12270 (F)F
      // 46: ldc -90.0
      // 48: ldc 90.0
      // 4a: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 4d: putstatic k74/x/IlllIlII.III F
      // 50: getstatic k74/x/IlllIlII.IIIlI F
      // 53: invokestatic java/lang/Float.isFinite (F)Z
      // 56: ifeq 71
      // 59: getstatic k74/x/IlllIlII.III F
      // 5c: invokestatic java/lang/Float.isFinite (F)Z
      // 5f: ifeq 71
      // 62: goto 69
      // 65: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 68: athrow
      // 69: bipush 1
      // 6a: goto 72
      // 6d: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 70: athrow
      // 71: bipush 0
      // 72: putstatic k74/x/IlllIlII.IIIl Z
      // 75: return
   }

   public static boolean lllI(class_310 var0, int var1, float var2, float var3, IIIll var4) {
      return IIllll(var0, var1, var2, var3, var4, true, true, false, false);
   }

   public static boolean llll(class_310 var0, int var1, IIIll var2) {
      try {
         if (!IlIlIl(var0)) {
            return false;
         }
      } catch (RuntimeException var5) {
         throw lIl(var5);
      }

      boolean var3 = IIllll(var0, var1, var0.field_1724.method_36454(), var0.field_1724.method_36455(), var2, false, false, true, false);

      try {
         if (var3) {
            lIIIl = true;
         }

         return var3;
      } catch (RuntimeException var4) {
         throw lIl(var4);
      }
   }

   public static boolean IIIII(class_310 param0, int param1, class_243 param2, IIIll param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 04: ifeq 12
      // 07: aload 2
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 1f: aload 2
      // 20: invokestatic k74/x/IlllIlII.IIll (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)[F
      // 23: astore 4
      // 25: aload 0
      // 26: iload 1
      // 27: aload 4
      // 29: bipush 0
      // 2a: faload
      // 2b: aload 4
      // 2d: bipush 1
      // 2e: faload
      // 2f: aload 3
      // 30: invokestatic k74/x/IlllIlII.llIlI (Lnet/minecraft/class_310;IFFLk74/x/IIIll;)Z
      // 33: ireturn
   }

   public static boolean IIIIl(class_310 var0, int var1, float var2, float var3) {
      if (IlIlIl(var0)) {
         var2 = IlI(var2, var0.field_1724.method_36454());
      }

      return IIllll(var0, var1, var2, var3, lIlI, false, false, false, false);
   }

   private static boolean IIIlI() {
      return true;
   }

   public static boolean IIIll(class_310 var0, int var1, float var2, float var3, IIIll var4) {
      return IIllll(var0, var1, var2, var3, var4, false, true, false, false);
   }

   private static boolean IIlII(class_310 param0, class_1297 param1, float param2, float param3, class_243 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 04: ifeq 1e
      // 07: aload 1
      // 08: ifnull 1e
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: aload 4
      // 14: ifnonnull 24
      // 17: goto 1e
      // 1a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 0
      // 25: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 28: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 2b: astore 5
      // 2d: aload 5
      // 2f: aload 4
      // 31: invokevirtual net/minecraft/class_243.method_1022 (Lnet/minecraft/class_243;)D
      // 34: ldc2_w 0.25
      // 37: dadd
      // 38: ldc2_w 0.25
      // 3b: invokestatic java/lang/Math.max (DD)D
      // 3e: dstore 6
      // 40: aload 5
      // 42: fload 2
      // 43: fload 3
      // 44: invokestatic k74/x/IlllIlII.IlIIll (FF)Lnet/minecraft/class_243;
      // 47: dload 6
      // 49: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 4c: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 4f: astore 8
      // 51: aload 1
      // 52: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
      // 55: ldc2_w 0.1
      // 58: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 5b: aload 5
      // 5d: aload 8
      // 5f: invokevirtual net/minecraft/class_238.method_992 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Ljava/util/Optional;
      // 62: invokevirtual java/util/Optional.isPresent ()Z
      // 65: ireturn
   }

   public static void IIlIl(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllI.II ()Z
      // 003: ifeq 00b
      // 006: return
      // 007: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 00a: athrow
      // 00b: getstatic k74/x/IlllIlII.lIlll Z
      // 00e: ifeq 034
      // 011: aload 0
      // 012: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 015: ifeq 030
      // 018: goto 01f
      // 01b: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01e: athrow
      // 01f: aload 0
      // 020: getstatic k74/x/IlllIlII.lIlIl F
      // 023: getstatic k74/x/IlllIlII.l F
      // 026: invokestatic k74/x/IlllIlII.lIIl (Lnet/minecraft/class_310;FF)V
      // 029: goto 030
      // 02c: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02f: athrow
      // 030: bipush 0
      // 031: putstatic k74/x/IlllIlII.lIlll Z
      // 034: getstatic k74/x/IlllIlII.IIlIl Z
      // 037: ifne 03f
      // 03a: return
      // 03b: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03e: athrow
      // 03f: aload 0
      // 040: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 043: ifne 04e
      // 046: invokestatic k74/x/IlllIlII.IIl ()V
      // 049: return
      // 04a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 052: getfield net/minecraft/class_746.field_6012 I
      // 055: istore 1
      // 056: iload 1
      // 057: getstatic k74/x/IlllIlII.lIIlI I
      // 05a: if_icmpge 062
      // 05d: return
      // 05e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 061: athrow
      // 062: iload 1
      // 063: getstatic k74/x/IlllIlII.lIIlI I
      // 066: if_icmple 08b
      // 069: getstatic k74/x/IlllIlII.llIlI Z
      // 06c: ifeq 087
      // 06f: goto 076
      // 072: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 075: athrow
      // 076: aload 0
      // 077: getstatic k74/x/IlllIlII.lIIII F
      // 07a: getstatic k74/x/IlllIlII.Il F
      // 07d: invokestatic k74/x/IlllIlII.lIIl (Lnet/minecraft/class_310;FF)V
      // 080: goto 087
      // 083: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 086: athrow
      // 087: invokestatic k74/x/IlllIlII.IIl ()V
      // 08a: return
      // 08b: getstatic k74/x/IlllIlII.lIIIl Z
      // 08e: ifeq 09c
      // 091: invokestatic k74/x/IlllIlII.IlIIlI ()V
      // 094: invokestatic k74/x/IlllIlII.IIl ()V
      // 097: return
      // 098: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0a0: astore 2
      // 0a1: getstatic k74/x/IlllIlII.llIlI Z
      // 0a4: ifeq 0ba
      // 0a7: getstatic k74/x/IlllIlII.lIIII F
      // 0aa: putstatic k74/x/IlllIlII.lIlIl F
      // 0ad: getstatic k74/x/IlllIlII.Il F
      // 0b0: putstatic k74/x/IlllIlII.l F
      // 0b3: goto 0c8
      // 0b6: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b9: athrow
      // 0ba: aload 2
      // 0bb: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 0be: putstatic k74/x/IlllIlII.lIlIl F
      // 0c1: aload 2
      // 0c2: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 0c5: putstatic k74/x/IlllIlII.l F
      // 0c8: aload 0
      // 0c9: invokestatic k74/x/IlllIlII.lIlI (Lnet/minecraft/class_310;)V
      // 0cc: aload 2
      // 0cd: getstatic k74/x/IlllIlII.IlII F
      // 0d0: invokevirtual net/minecraft/class_746.method_36456 (F)V
      // 0d3: aload 2
      // 0d4: getstatic k74/x/IlllIlII.IIlII F
      // 0d7: invokevirtual net/minecraft/class_746.method_36457 (F)V
      // 0da: aload 2
      // 0db: getstatic k74/x/IlllIlII.lIlIl F
      // 0de: putfield net/minecraft/class_746.field_3932 F
      // 0e1: aload 2
      // 0e2: getstatic k74/x/IlllIlII.lIlIl F
      // 0e5: putfield net/minecraft/class_746.field_3931 F
      // 0e8: aload 2
      // 0e9: getstatic k74/x/IlllIlII.l F
      // 0ec: putfield net/minecraft/class_746.field_3916 F
      // 0ef: aload 2
      // 0f0: getstatic k74/x/IlllIlII.l F
      // 0f3: putfield net/minecraft/class_746.field_3914 F
      // 0f6: aload 0
      // 0f7: getstatic k74/x/IlllIlII.IlII F
      // 0fa: getstatic k74/x/IlllIlII.IIlII F
      // 0fd: invokestatic k74/x/IlllIlII.lIllI (Lnet/minecraft/class_310;FF)V
      // 100: getstatic k74/x/IlllIlII.lIllI Z
      // 103: ifeq 13e
      // 106: aload 2
      // 107: instanceof k74/y/IIlllllll
      // 10a: ifeq 13e
      // 10d: goto 114
      // 110: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 113: athrow
      // 114: aload 2
      // 115: checkcast k74/y/IIlllllll
      // 118: astore 3
      // 119: aload 3
      // 11a: aload 2
      // 11b: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 11e: invokeinterface k74/y/IIlllllll.m3x$setLastXClient (D)V 3
      // 123: aload 3
      // 124: aload 2
      // 125: invokevirtual net/minecraft/class_746.method_23318 ()D
      // 128: invokeinterface k74/y/IIlllllll.m3x$setLastYClient (D)V 3
      // 12d: aload 3
      // 12e: aload 2
      // 12f: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 132: invokeinterface k74/y/IIlllllll.m3x$setLastZClient (D)V 3
      // 137: aload 3
      // 138: bipush 0
      // 139: invokeinterface k74/y/IIlllllll.m3x$setTicksSinceLastPositionPacketSent (I)V 2
      // 13e: getstatic k74/x/IlllIlII.lllI Z
      // 141: ifeq 151
      // 144: getstatic k74/x/IlllIlII.IIllI Z
      // 147: ifeq 15b
      // 14a: goto 151
      // 14d: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 150: athrow
      // 151: invokestatic k74/x/IlllIlII.IlIIlI ()V
      // 154: goto 15b
      // 157: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15a: athrow
      // 15b: bipush 1
      // 15c: putstatic k74/x/IlllIlII.lIlll Z
      // 15f: return
   }

   public static boolean IIllI(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIllllI.II ()Z
      // 03: ifeq 0c
      // 06: bipush 0
      // 07: ireturn
      // 08: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b: athrow
      // 0c: getstatic k74/x/IlllIlII.llIlI Z
      // 0f: ifeq 20
      // 12: aload 0
      // 13: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 16: ifne 26
      // 19: goto 20
      // 1c: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: aload 0
      // 27: getstatic k74/x/IlllIlII.lIIII F
      // 2a: getstatic k74/x/IlllIlII.Il F
      // 2d: invokestatic k74/x/IlllIlII.lIIl (Lnet/minecraft/class_310;FF)V
      // 30: bipush 1
      // 31: ireturn
   }

   public static int IIlll() {
      try {
         if (IIlIl) {
            return IlIl;
         }
      } catch (RuntimeException var0) {
         throw lIl(var0);
      }

      return IlIllI(-899198810, -1429666666 ^ -517932661);
   }

   public static float[] IlIII(class_310 var0) {
      try {
         if (!IlIlIl(var0)) {
            return null;
         }
      } catch (RuntimeException var2) {
         throw lIl(var2);
      }

      float[] var1 = Ill(var0);
      return new float[]{var1[0], var1[1]};
   }

   public static I IlIIl(class_310 param0, float param1, float param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 2e
      // 04: aload 0
      // 05: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 08: ifnull 2e
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: fload 1
      // 13: invokestatic java/lang/Float.isFinite (F)Z
      // 16: ifeq 2e
      // 19: goto 20
      // 1c: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: fload 2
      // 21: invokestatic java/lang/Float.isFinite (F)Z
      // 24: ifne 3c
      // 27: goto 2e
      // 2a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d: athrow
      // 2e: new k74/x/I
      // 31: dup
      // 32: fload 1
      // 33: fload 2
      // 34: invokespecial k74/x/I.<init> (FF)V
      // 37: areturn
      // 38: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3b: athrow
      // 3c: aload 0
      // 3d: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 40: invokevirtual net/minecraft/class_315.method_42495 ()Lnet/minecraft/class_7172;
      // 43: invokevirtual net/minecraft/class_7172.method_41753 ()Ljava/lang/Object;
      // 46: checkcast java/lang/Double
      // 49: invokevirtual java/lang/Double.doubleValue ()D
      // 4c: d2f
      // 4d: ldc_w 0.6
      // 50: fmul
      // 51: ldc_w 0.2
      // 54: fadd
      // 55: fstore 4
      // 57: fload 4
      // 59: fload 4
      // 5b: fmul
      // 5c: fload 4
      // 5e: fmul
      // 5f: ldc_w 1.2
      // 62: fmul
      // 63: fstore 5
      // 65: fload 5
      // 67: invokestatic java/lang/Float.isFinite (F)Z
      // 6a: ifeq 7b
      // 6d: fload 5
      // 6f: fconst_0
      // 70: fcmpg
      // 71: ifgt 89
      // 74: goto 7b
      // 77: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7a: athrow
      // 7b: new k74/x/I
      // 7e: dup
      // 7f: fload 1
      // 80: fload 2
      // 81: invokespecial k74/x/I.<init> (FF)V
      // 84: areturn
      // 85: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 88: athrow
      // 89: fload 1
      // 8a: fload 5
      // 8c: iload 3
      // 8d: invokestatic k74/x/IlllIlII.Il (FFZ)F
      // 90: fstore 6
      // 92: fload 2
      // 93: fload 5
      // 95: iload 3
      // 96: invokestatic k74/x/IlllIlII.Il (FFZ)F
      // 99: fstore 7
      // 9b: new k74/x/I
      // 9e: dup
      // 9f: fload 6
      // a1: fload 7
      // a3: invokespecial k74/x/I.<init> (FF)V
      // a6: areturn
   }

   private static double IlIlI(long var0) {
      double var2 = (var0 >>> IlIllI(-899198815, 460130675 ^ -560464179)) * 1.110223E-16F;
      double var4 = 0.035 + 0.06 * Math.abs(var2 * 2.0 - 1.0);

      try {
         if ((var0 & 1L) == 0L) {
            return var4;
         }
      } catch (RuntimeException var6) {
         throw lIl(var6);
      }

      return -var4;
   }

   public static boolean IlIll(class_310 param0, class_3965 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlII (Lnet/minecraft/class_310;)Z
      // 04: ifeq 2d
      // 07: getstatic k74/x/IlllIlII.IIIl Z
      // 0a: ifeq 2d
      // 0d: goto 14
      // 10: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: aload 1
      // 15: ifnull 2d
      // 18: goto 1f
      // 1b: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: aload 0
      // 20: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 23: ifnonnull 33
      // 26: goto 2d
      // 29: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
      // 2f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: aload 0
      // 34: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 37: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 3a: astore 3
      // 3b: dconst_0
      // 3c: aload 0
      // 3d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 40: invokevirtual net/minecraft/class_746.method_55754 ()D
      // 43: ldc2_w 0.05
      // 46: dsub
      // 47: invokestatic java/lang/Math.max (DD)D
      // 4a: dstore 4
      // 4c: aload 3
      // 4d: getstatic k74/x/IlllIlII.IIIlI F
      // 50: getstatic k74/x/IlllIlII.III F
      // 53: invokestatic k74/x/IlllIlII.IlIIll (FF)Lnet/minecraft/class_243;
      // 56: dload 4
      // 58: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 5b: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 5e: astore 6
      // 60: aload 0
      // 61: aload 0
      // 62: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 65: aload 3
      // 66: aload 6
      // 68: invokestatic k74/x/IIll.lIIIlll (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_3965;
      // 6b: astore 7
      // 6d: aload 7
      // 6f: ifnull c0
      // 72: aload 7
      // 74: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 77: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 7a: if_acmpne c0
      // 7d: goto 84
      // 80: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 83: athrow
      // 84: aload 7
      // 86: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 89: aload 1
      // 8a: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 8d: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 90: ifeq c0
      // 93: goto 9a
      // 96: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 99: athrow
      // 9a: iload 2
      // 9b: ifeq b8
      // 9e: goto a5
      // a1: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a4: athrow
      // a5: aload 7
      // a7: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // aa: aload 1
      // ab: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // ae: if_acmpne c0
      // b1: goto b8
      // b4: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // b7: athrow
      // b8: bipush 1
      // b9: goto c1
      // bc: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // bf: athrow
      // c0: bipush 0
      // c1: ireturn
   }

   public static boolean IllII(class_310 param0, class_10055 param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 12
      // 04: aload 0
      // 05: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 08: ifne 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: fload 2
      // 1b: invokestatic k74/x/IlllIlII.llII (Lnet/minecraft/class_310;Lnet/minecraft/class_10055;F)Z
      // 1e: pop
      // 1f: bipush 1
      // 20: ireturn
   }

   public static boolean IllIl(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IlllIlII.IIlIl Z
      // 03: ifeq 21
      // 06: getstatic k74/x/IlllIlII.IIIll Z
      // 09: ifeq 21
      // 0c: goto 13
      // 0f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: aload 0
      // 14: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 17: ifne 27
      // 1a: goto 21
      // 1d: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 26: athrow
      // 27: aload 0
      // 28: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2b: getfield net/minecraft/class_746.field_6012 I
      // 2e: istore 1
      // 2f: iload 1
      // 30: getstatic k74/x/IlllIlII.lIIlI I
      // 33: if_icmpge 3c
      // 36: bipush 0
      // 37: ireturn
      // 38: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3b: athrow
      // 3c: getstatic k74/x/IlllIlII.llIlI Z
      // 3f: ifeq 53
      // 42: aload 0
      // 43: getstatic k74/x/IlllIlII.lIIII F
      // 46: getstatic k74/x/IlllIlII.Il F
      // 49: invokestatic k74/x/IlllIlII.lIIl (Lnet/minecraft/class_310;FF)V
      // 4c: goto 53
      // 4f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 52: athrow
      // 53: iload 1
      // 54: getstatic k74/x/IlllIlII.lIIlI I
      // 57: if_icmple 63
      // 5a: invokestatic k74/x/IlllIlII.IIl ()V
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 62: athrow
      // 63: aload 0
      // 64: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 67: astore 2
      // 68: getstatic k74/x/IlllIlII.llIlI Z
      // 6b: ifne 87
      // 6e: aload 2
      // 6f: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 72: putstatic k74/x/IlllIlII.lIIII F
      // 75: aload 2
      // 76: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 79: putstatic k74/x/IlllIlII.Il F
      // 7c: bipush 1
      // 7d: putstatic k74/x/IlllIlII.llIlI Z
      // 80: goto 87
      // 83: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 86: athrow
      // 87: aload 0
      // 88: invokestatic k74/x/IlllIlII.lIlI (Lnet/minecraft/class_310;)V
      // 8b: aload 0
      // 8c: getstatic k74/x/IlllIlII.IlII F
      // 8f: getstatic k74/x/IlllIlII.IIlII F
      // 92: invokestatic k74/x/IlllIlII.llIIl (Lnet/minecraft/class_310;FF)[F
      // 95: astore 3
      // 96: aload 3
      // 97: ifnull ad
      // 9a: aload 3
      // 9b: bipush 0
      // 9c: faload
      // 9d: putstatic k74/x/IlllIlII.IlII F
      // a0: aload 3
      // a1: bipush 1
      // a2: faload
      // a3: putstatic k74/x/IlllIlII.IIlII F
      // a6: goto ad
      // a9: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ac: athrow
      // ad: aload 2
      // ae: getstatic k74/x/IlllIlII.IlII F
      // b1: invokevirtual net/minecraft/class_746.method_36456 (F)V
      // b4: aload 2
      // b5: getstatic k74/x/IlllIlII.IIlII F
      // b8: invokevirtual net/minecraft/class_746.method_36457 (F)V
      // bb: aload 2
      // bc: getstatic k74/x/IlllIlII.lIIII F
      // bf: putfield net/minecraft/class_746.field_3932 F
      // c2: aload 2
      // c3: getstatic k74/x/IlllIlII.lIIII F
      // c6: putfield net/minecraft/class_746.field_3931 F
      // c9: aload 2
      // ca: getstatic k74/x/IlllIlII.Il F
      // cd: putfield net/minecraft/class_746.field_3916 F
      // d0: aload 2
      // d1: getstatic k74/x/IlllIlII.Il F
      // d4: putfield net/minecraft/class_746.field_3914 F
      // d7: bipush 1
      // d8: ireturn
   }

   private static boolean IlllI(class_310 var0, int var1, float var2, float var3, IIIll var4) {
      return IIllll(var0, var1, var2, var3, var4, false, true, false, true);
   }

   public static boolean Illll(class_310 param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 04: ifne 0d
      // 07: bipush 0
      // 08: ireturn
      // 09: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c: athrow
      // 0d: aload 0
      // 0e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 11: iload 2
      // 12: invokevirtual net/minecraft/class_638.method_8469 (I)Lnet/minecraft/class_1297;
      // 15: astore 3
      // 16: aload 3
      // 17: ifnull 32
      // 1a: aload 0
      // 1b: iload 1
      // 1c: aload 3
      // 1d: invokestatic k74/x/IlllIlII.IIllII (Lnet/minecraft/class_310;ILnet/minecraft/class_1297;)Z
      // 20: ifeq 32
      // 23: goto 2a
      // 26: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 29: athrow
      // 2a: bipush 1
      // 2b: goto 33
      // 2e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
   }

   public static boolean lIIII(class_310 param0, class_3965 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 26
      // 04: aload 1
      // 05: ifnull 26
      // 08: goto 0f
      // 0b: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: aload 0
      // 10: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 13: astore 4
      // 15: aload 4
      // 17: instanceof net/minecraft/class_3965
      // 1a: ifeq 26
      // 1d: aload 4
      // 1f: checkcast net/minecraft/class_3965
      // 22: astore 3
      // 23: goto 28
      // 26: bipush 0
      // 27: ireturn
      // 28: aload 3
      // 29: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 2c: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 2f: if_acmpne 43
      // 32: aload 1
      // 33: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 36: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 39: if_acmpeq 49
      // 3c: goto 43
      // 3f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42: athrow
      // 43: bipush 0
      // 44: ireturn
      // 45: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: aload 3
      // 4a: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 4d: aload 1
      // 4e: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 51: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 54: ifne 5d
      // 57: bipush 0
      // 58: ireturn
      // 59: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5c: athrow
      // 5d: iload 2
      // 5e: ifeq 73
      // 61: aload 3
      // 62: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 65: aload 1
      // 66: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 69: if_acmpne 7b
      // 6c: goto 73
      // 6f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 72: athrow
      // 73: bipush 1
      // 74: goto 7c
      // 77: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7a: athrow
      // 7b: bipush 0
      // 7c: ireturn
   }

   private static boolean lIIIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IlllIlII.lllIl ()Z
      // 03: ifne 1b
      // 06: invokestatic k74/x/IIll.IIlllll ()Z
      // 09: ifne 1b
      // 0c: goto 13
      // 0f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: bipush 1
      // 14: goto 1c
      // 17: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
   }

   public static boolean lIIlI(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 04: ifeq 14
      // 07: getstatic k74/x/IlllIlII.II Z
      // 0a: ifne 1a
      // 0d: goto 14
      // 10: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: bipush 0
      // 15: ireturn
      // 16: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1e: getfield net/minecraft/class_746.field_6012 I
      // 21: getstatic k74/x/IlllIlII.IllI I
      // 24: if_icmple 3f
      // 27: bipush 0
      // 28: putstatic k74/x/IlllIlII.II Z
      // 2b: bipush 1
      // 2c: putstatic k74/x/IlllIlII.IlllI Z
      // 2f: aload 0
      // 30: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 33: getfield net/minecraft/class_746.field_6012 I
      // 36: putstatic k74/x/IlllIlII.lllII I
      // 39: bipush 0
      // 3a: ireturn
      // 3b: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3e: athrow
      // 3f: bipush 1
      // 40: ireturn
   }

   public static void lIIll() {
      int var0 = -1505362319;
      IIlIl = false;
      llIll = null;
      lIllI = false;
      IIIll = false;
      lllI = false;
      IIllI = false;
      ll = false;
      lIIIl = false;
      lII = false;
      llIlI = false;
      lIlll = false;
      II = false;
      IlllI = false;
      lllII = IlIllI(-899198816, var0 ^ -1987804038);
      IllI = IlIllI(-899198813, var0 ^ -618766299);
      lIlII = IlIllI(-899198814, var0 ^ -559269020);
      llll = Float.NaN;
      lIl = Float.NaN;
      llII = IlIllI(-899198803, var0 ^ -1861535621);
      lIIl = 0;
      IllIl = false;
      IIIl = false;
      IIIlI = 0.0F;
      III = 0.0F;
      Ill = 0.0F;
      lllIl = 0.0F;
      IIIIl = Float.NaN;
      lIIll = 0.0F;
      IIlll = IlIllI(-899198804, var0 ^ 1260601474);
   }

   private static int IlIllI(int var0, int var1) {
      int var2 = llllI[var0 ^ -899198811] ^ var1 ^ var0;
      var2 += 26733;
      var2 ^= 30629;
      var2 += 21959;
      var2 ^= 6646;
      var2 ^= 1580;
      var2 ^= 28613;
      return var2 - 4901;
   }

   public static boolean lIlII(class_310 var0, Object var1, int var2, float var3, float var4, IIIll var5, lIllllII var6) {
      boolean var7 = IIII(var0, var2, var3, var4, var5);

      try {
         if (var6 != null) {
            var6.I(var7);
         }

         return var7;
      } catch (RuntimeException var8) {
         throw lIl(var8);
      }
   }

   private static boolean lIlIl() {
      return true;
   }

   private static void lIllI(class_310 param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 04: ifne 0c
      // 07: return
      // 08: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b: athrow
      // 0c: getstatic k74/x/IlllIlII.II Z
      // 0f: ifeq 2e
      // 12: aload 0
      // 13: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 16: getfield net/minecraft/class_746.field_6012 I
      // 19: getstatic k74/x/IlllIlII.IllI I
      // 1c: if_icmpgt 2e
      // 1f: goto 26
      // 22: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: bipush 1
      // 27: goto 2f
      // 2a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d: athrow
      // 2e: bipush 0
      // 2f: istore 3
      // 30: iload 3
      // 31: ifeq 3e
      // 34: getstatic k74/x/IlllIlII.llIIl F
      // 37: goto 45
      // 3a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: aload 0
      // 3f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 42: getfield net/minecraft/class_746.field_6283 F
      // 45: putstatic k74/x/IlllIlII.llll F
      // 48: iload 3
      // 49: ifeq 56
      // 4c: getstatic k74/x/IlllIlII.IlI F
      // 4f: goto 5d
      // 52: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 55: athrow
      // 56: aload 0
      // 57: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5a: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 5d: putstatic k74/x/IlllIlII.lIl F
      // 60: fload 1
      // 61: putstatic k74/x/IlllIlII.llIIl F
      // 64: fload 2
      // 65: ldc -90.0
      // 67: ldc 90.0
      // 69: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 6c: putstatic k74/x/IlllIlII.IlI F
      // 6f: aload 0
      // 70: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 73: getfield net/minecraft/class_746.field_6012 I
      // 76: putstatic k74/x/IlllIlII.lIlII I
      // 79: aload 0
      // 7a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7d: getfield net/minecraft/class_746.field_6012 I
      // 80: bipush 3
      // 81: iadd
      // 82: putstatic k74/x/IlllIlII.IllI I
      // 85: bipush 1
      // 86: putstatic k74/x/IlllIlII.II Z
      // 89: bipush 0
      // 8a: putstatic k74/x/IlllIlII.IlllI Z
      // 8d: ldc_w -899198801
      // 90: ldc_w 780556714
      // 93: ldc_w 1565144779
      // 96: ixor
      // 97: invokestatic k74/x/IlllIlII.IlIllI (II)I
      // 9a: putstatic k74/x/IlllIlII.lllII I
      // 9d: return
   }

   public static boolean lIlll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IlllIlII.IIlIl Z
      // 03: ifeq 1b
      // 06: getstatic k74/x/IlllIlII.IIIll Z
      // 09: ifeq 1b
      // 0c: goto 13
      // 0f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: bipush 1
      // 14: goto 1c
      // 17: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
   }

   private IlllIlII() {
   }

   static float llIII(float param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: fload 0
      // 01: invokestatic java/lang/Float.isFinite (F)Z
      // 04: ifne 0d
      // 07: fload 0
      // 08: freturn
      // 09: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c: athrow
      // 0d: fload 0
      // 0e: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 11: fstore 1
      // 12: fload 0
      // 13: invokestatic java/lang/Math.abs (F)F
      // 16: fstore 2
      // 17: fload 2
      // 18: ldc 176.0
      // 1a: fcmpl
      // 1b: iflt 33
      // 1e: fload 2
      // 1f: ldc_w 184.0
      // 22: fcmpg
      // 23: ifgt 33
      // 26: goto 2d
      // 29: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2c: athrow
      // 2d: fload 0
      // 2e: freturn
      // 2f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 32: athrow
      // 33: fload 1
      // 34: invokestatic java/lang/Math.abs (F)F
      // 37: ldc_w 179.999
      // 3a: fcmpl
      // 3b: iflt 58
      // 3e: fload 0
      // 3f: fconst_0
      // 40: fcmpl
      // 41: ifeq 58
      // 44: goto 4b
      // 47: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4a: athrow
      // 4b: fload 1
      // 4c: invokestatic java/lang/Math.abs (F)F
      // 4f: fload 0
      // 50: invokestatic java/lang/Math.copySign (FF)F
      // 53: freturn
      // 54: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 57: athrow
      // 58: fload 1
      // 59: freturn
   }

   public static float[] llIIl(class_310 param0, float param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: fload 1
      // 01: invokestatic java/lang/Float.isFinite (F)Z
      // 04: ifeq 15
      // 07: fload 2
      // 08: invokestatic java/lang/Float.isFinite (F)Z
      // 0b: ifne 1b
      // 0e: goto 15
      // 11: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: aconst_null
      // 16: areturn
      // 17: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokestatic k74/x/IlllIlII.Ill (Lnet/minecraft/class_310;)[F
      // 1f: astore 3
      // 20: aload 3
      // 21: bipush 0
      // 22: faload
      // 23: fload 1
      // 24: aload 3
      // 25: bipush 0
      // 26: faload
      // 27: fsub
      // 28: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 2b: fadd
      // 2c: fstore 4
      // 2e: aload 0
      // 2f: aload 3
      // 30: bipush 0
      // 31: faload
      // 32: aload 3
      // 33: bipush 1
      // 34: faload
      // 35: fload 4
      // 37: fload 2
      // 38: invokestatic k74/x/IlllIlII.llI (Lnet/minecraft/class_310;FFFF)[F
      // 3b: areturn
   }

   public static boolean llIlI(class_310 var0, int var1, float var2, float var3, IIIll var4) {
      return IIllll(var0, var1, var2, var3, var4, false, true, false, false);
   }

   static synchronized class_243 llIll(class_243 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: ifnonnull 00a
      // 004: aconst_null
      // 005: areturn
      // 006: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 009: athrow
      // 00a: getstatic k74/x/IlllIlII.IlIIl J
      // 00d: lconst_1
      // 00e: ladd
      // 00f: dup2
      // 010: putstatic k74/x/IlllIlII.IlIIl J
      // 013: lstore 1
      // 014: aload 0
      // 015: getfield net/minecraft/class_243.field_1352 D
      // 018: invokestatic java/lang/Double.doubleToLongBits (D)J
      // 01b: aload 0
      // 01c: getfield net/minecraft/class_243.field_1351 D
      // 01f: invokestatic java/lang/Double.doubleToLongBits (D)J
      // 022: ldc_w -899198796
      // 025: ldc_w -923543430
      // 028: ldc_w -758246008
      // 02b: ixor
      // 02c: invokestatic k74/x/IlllIlII.IlIllI (II)I
      // 02f: invokestatic java/lang/Long.rotateLeft (JI)J
      // 032: lxor
      // 033: aload 0
      // 034: getfield net/minecraft/class_243.field_1350 D
      // 037: invokestatic java/lang/Double.doubleToLongBits (D)J
      // 03a: ldc_w -899198793
      // 03d: ldc_w -923543430
      // 040: ldc_w 289642915
      // 043: ixor
      // 044: invokestatic k74/x/IlllIlII.IlIllI (II)I
      // 047: invokestatic java/lang/Long.rotateLeft (JI)J
      // 04a: lxor
      // 04b: lload 1
      // 04c: ldc2_w -7046029254386353131
      // 04f: lmul
      // 050: lxor
      // 051: invokestatic k74/x/IlllIlII.IIlI (J)J
      // 054: lstore 3
      // 055: aload 0
      // 056: getfield net/minecraft/class_243.field_1352 D
      // 059: aload 0
      // 05a: getfield net/minecraft/class_243.field_1352 D
      // 05d: invokestatic java/lang/Math.floor (D)D
      // 060: dsub
      // 061: dstore 5
      // 063: aload 0
      // 064: getfield net/minecraft/class_243.field_1351 D
      // 067: aload 0
      // 068: getfield net/minecraft/class_243.field_1351 D
      // 06b: invokestatic java/lang/Math.floor (D)D
      // 06e: dsub
      // 06f: dstore 7
      // 071: aload 0
      // 072: getfield net/minecraft/class_243.field_1350 D
      // 075: aload 0
      // 076: getfield net/minecraft/class_243.field_1350 D
      // 079: invokestatic java/lang/Math.floor (D)D
      // 07c: dsub
      // 07d: dstore 9
      // 07f: dload 5
      // 081: dconst_1
      // 082: dload 5
      // 084: dsub
      // 085: invokestatic java/lang/Math.min (DD)D
      // 088: dstore 11
      // 08a: dload 7
      // 08c: dconst_1
      // 08d: dload 7
      // 08f: dsub
      // 090: invokestatic java/lang/Math.min (DD)D
      // 093: dstore 13
      // 095: dload 9
      // 097: dconst_1
      // 098: dload 9
      // 09a: dsub
      // 09b: invokestatic java/lang/Math.min (DD)D
      // 09e: dstore 15
      // 0a0: lload 3
      // 0a1: invokestatic k74/x/IlllIlII.IlIlI (J)D
      // 0a4: dstore 17
      // 0a6: lload 3
      // 0a7: ldc2_w 7146057691288625177
      // 0aa: ladd
      // 0ab: invokestatic k74/x/IlllIlII.IIlI (J)J
      // 0ae: invokestatic k74/x/IlllIlII.IlIlI (J)D
      // 0b1: dstore 19
      // 0b3: dload 11
      // 0b5: dload 13
      // 0b7: dcmpg
      // 0b8: ifgt 0ee
      // 0bb: dload 11
      // 0bd: dload 15
      // 0bf: dcmpg
      // 0c0: ifgt 0ee
      // 0c3: goto 0ca
      // 0c6: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c9: athrow
      // 0ca: new net/minecraft/class_243
      // 0cd: dup
      // 0ce: aload 0
      // 0cf: getfield net/minecraft/class_243.field_1352 D
      // 0d2: aload 0
      // 0d3: getfield net/minecraft/class_243.field_1351 D
      // 0d6: dload 17
      // 0d8: dadd
      // 0d9: invokestatic k74/x/IlllIlII.ll (D)D
      // 0dc: aload 0
      // 0dd: getfield net/minecraft/class_243.field_1350 D
      // 0e0: dload 19
      // 0e2: dadd
      // 0e3: invokestatic k74/x/IlllIlII.ll (D)D
      // 0e6: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 0e9: areturn
      // 0ea: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0ed: athrow
      // 0ee: dload 13
      // 0f0: dload 15
      // 0f2: dcmpg
      // 0f3: ifgt 11a
      // 0f6: new net/minecraft/class_243
      // 0f9: dup
      // 0fa: aload 0
      // 0fb: getfield net/minecraft/class_243.field_1352 D
      // 0fe: dload 17
      // 100: dadd
      // 101: invokestatic k74/x/IlllIlII.ll (D)D
      // 104: aload 0
      // 105: getfield net/minecraft/class_243.field_1351 D
      // 108: aload 0
      // 109: getfield net/minecraft/class_243.field_1350 D
      // 10c: dload 19
      // 10e: dadd
      // 10f: invokestatic k74/x/IlllIlII.ll (D)D
      // 112: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 115: areturn
      // 116: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 119: athrow
      // 11a: new net/minecraft/class_243
      // 11d: dup
      // 11e: aload 0
      // 11f: getfield net/minecraft/class_243.field_1352 D
      // 122: dload 17
      // 124: dadd
      // 125: invokestatic k74/x/IlllIlII.ll (D)D
      // 128: aload 0
      // 129: getfield net/minecraft/class_243.field_1351 D
      // 12c: dload 19
      // 12e: dadd
      // 12f: invokestatic k74/x/IlllIlII.ll (D)D
      // 132: aload 0
      // 133: getfield net/minecraft/class_243.field_1350 D
      // 136: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 139: areturn
   }

   static float lllII(float param0, int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: fload 0
      // 01: invokestatic k74/x/IlllIlII.llIII (F)F
      // 04: fstore 2
      // 05: fload 2
      // 06: invokestatic java/lang/Float.isFinite (F)Z
      // 09: ifne 12
      // 0c: fload 2
      // 0d: freturn
      // 0e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: iload 1
      // 13: getstatic k74/x/IlllIlII.IIlll I
      // 16: if_icmpeq 28
      // 19: iload 1
      // 1a: putstatic k74/x/IlllIlII.IIlll I
      // 1d: fconst_0
      // 1e: putstatic k74/x/IlllIlII.lIIll F
      // 21: goto 28
      // 24: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 27: athrow
      // 28: fload 2
      // 29: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 2c: invokestatic java/lang/Math.abs (F)F
      // 2f: fstore 3
      // 30: getstatic k74/x/IlllIlII.lIIll F
      // 33: fconst_0
      // 34: fcmpl
      // 35: ifeq 56
      // 38: fload 3
      // 39: ldc 176.0
      // 3b: fcmpl
      // 3c: iflt 52
      // 3f: goto 46
      // 42: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 45: athrow
      // 46: fload 2
      // 47: getstatic k74/x/IlllIlII.lIIll F
      // 4a: invokestatic k74/x/IlllIlII.lIll (FF)F
      // 4d: freturn
      // 4e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 51: athrow
      // 52: fconst_0
      // 53: putstatic k74/x/IlllIlII.lIIll F
      // 56: fload 3
      // 57: ldc 179.0
      // 59: fcmpl
      // 5a: iflt 80
      // 5d: fload 2
      // 5e: fconst_0
      // 5f: fcmpg
      // 60: ifge 74
      // 63: goto 6a
      // 66: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 69: athrow
      // 6a: ldc_w -1.0
      // 6d: goto 75
      // 70: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 73: athrow
      // 74: fconst_1
      // 75: putstatic k74/x/IlllIlII.lIIll F
      // 78: fload 2
      // 79: getstatic k74/x/IlllIlII.lIIll F
      // 7c: invokestatic k74/x/IlllIlII.lIll (FF)F
      // 7f: freturn
      // 80: fload 2
      // 81: freturn
   }

   public static boolean lllIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IlllIlII.IIlIl Z
      // 03: ifne 13
      // 06: getstatic k74/x/IlllIlII.lIlll Z
      // 09: ifeq 1b
      // 0c: goto 13
      // 0f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 12: athrow
      // 13: bipush 1
      // 14: goto 1c
      // 17: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
   }

   private static boolean llllI(class_310 param0, class_10055 param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IlllIlII.IlllI Z
      // 03: ifeq 1a
      // 06: aload 0
      // 07: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0a: getfield net/minecraft/class_746.field_6012 I
      // 0d: getstatic k74/x/IlllIlII.lllII I
      // 10: if_icmple 24
      // 13: goto 1a
      // 16: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: bipush 0
      // 1b: putstatic k74/x/IlllIlII.IlllI Z
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: fload 2
      // 25: fconst_0
      // 26: fconst_1
      // 27: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 2a: fstore 3
      // 2b: aload 1
      // 2c: getfield net/minecraft/class_10055.field_53446 F
      // 2f: fstore 4
      // 31: aload 1
      // 32: getfield net/minecraft/class_10055.field_53447 F
      // 35: fstore 5
      // 37: aload 1
      // 38: getfield net/minecraft/class_10055.field_53448 F
      // 3b: fstore 6
      // 3d: aload 1
      // 3e: fload 3
      // 3f: getstatic k74/x/IlllIlII.llIIl F
      // 42: fload 4
      // 44: invokestatic net/minecraft/class_3532.method_17821 (FFF)F
      // 47: putfield net/minecraft/class_10055.field_53446 F
      // 4a: aload 1
      // 4b: fload 3
      // 4c: fconst_0
      // 4d: fload 5
      // 4f: invokestatic net/minecraft/class_3532.method_17821 (FFF)F
      // 52: putfield net/minecraft/class_10055.field_53447 F
      // 55: aload 1
      // 56: fload 3
      // 57: getstatic k74/x/IlllIlII.IlI F
      // 5a: fload 6
      // 5c: invokestatic net/minecraft/class_3532.method_16439 (FFF)F
      // 5f: putfield net/minecraft/class_10055.field_53448 F
      // 62: bipush 1
      // 63: ireturn
   }

   public static boolean lllll() {
      return lII;
   }

   public static boolean IIIIII(class_310 var0) {
      return false;
   }

   public static llIIlIlI IIIIIl(class_310 param0, class_1297 param1, float param2, float param3, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 6
      // 005: aload 0
      // 006: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 009: ifeq 033
      // 00c: aload 1
      // 00d: ifnull 033
      // 010: goto 017
      // 013: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 016: athrow
      // 017: fload 2
      // 018: invokestatic java/lang/Float.isFinite (F)Z
      // 01b: ifeq 033
      // 01e: goto 025
      // 021: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 024: athrow
      // 025: fload 3
      // 026: invokestatic java/lang/Float.isFinite (F)Z
      // 029: ifne 039
      // 02c: goto 033
      // 02f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 032: athrow
      // 033: aconst_null
      // 034: areturn
      // 035: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 03d: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 040: astore 7
      // 042: aload 1
      // 043: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
      // 046: dload 4
      // 048: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 04b: astore 8
      // 04d: bipush 2
      // 04e: newarray 7
      // 050: dup
      // 051: bipush 0
      // 052: aload 8
      // 054: getfield net/minecraft/class_238.field_1323 D
      // 057: dastore
      // 058: dup
      // 059: bipush 1
      // 05a: aload 8
      // 05c: getfield net/minecraft/class_238.field_1320 D
      // 05f: dastore
      // 060: astore 9
      // 062: bipush 2
      // 063: newarray 7
      // 065: dup
      // 066: bipush 0
      // 067: aload 8
      // 069: getfield net/minecraft/class_238.field_1322 D
      // 06c: dastore
      // 06d: dup
      // 06e: bipush 1
      // 06f: aload 8
      // 071: getfield net/minecraft/class_238.field_1325 D
      // 074: dastore
      // 075: astore 10
      // 077: bipush 2
      // 078: newarray 7
      // 07a: dup
      // 07b: bipush 0
      // 07c: aload 8
      // 07e: getfield net/minecraft/class_238.field_1321 D
      // 081: dastore
      // 082: dup
      // 083: bipush 1
      // 084: aload 8
      // 086: getfield net/minecraft/class_238.field_1324 D
      // 089: dastore
      // 08a: astore 11
      // 08c: aconst_null
      // 08d: astore 12
      // 08f: fconst_0
      // 090: fstore 13
      // 092: fconst_0
      // 093: fstore 14
      // 095: fconst_0
      // 096: fstore 15
      // 098: fconst_0
      // 099: fstore 16
      // 09b: ldc2_w Infinity
      // 09e: dstore 17
      // 0a0: ldc2_w Infinity
      // 0a3: dstore 19
      // 0a5: aload 9
      // 0a7: astore 21
      // 0a9: aload 21
      // 0ab: arraylength
      // 0ac: istore 22
      // 0ae: bipush 0
      // 0af: istore 23
      // 0b1: iload 23
      // 0b3: iload 22
      // 0b5: if_icmpge 1af
      // 0b8: aload 21
      // 0ba: iload 23
      // 0bc: daload
      // 0bd: dstore 24
      // 0bf: aload 10
      // 0c1: astore 26
      // 0c3: aload 26
      // 0c5: arraylength
      // 0c6: istore 27
      // 0c8: bipush 0
      // 0c9: istore 28
      // 0cb: iload 28
      // 0cd: iload 27
      // 0cf: if_icmpge 1a7
      // 0d2: aload 26
      // 0d4: iload 28
      // 0d6: daload
      // 0d7: dstore 29
      // 0d9: aload 11
      // 0db: astore 31
      // 0dd: aload 31
      // 0df: arraylength
      // 0e0: istore 32
      // 0e2: bipush 0
      // 0e3: istore 33
      // 0e5: iload 33
      // 0e7: iload 32
      // 0e9: if_icmpge 19f
      // 0ec: aload 31
      // 0ee: iload 33
      // 0f0: daload
      // 0f1: dstore 34
      // 0f3: new net/minecraft/class_243
      // 0f6: dup
      // 0f7: dload 24
      // 0f9: dload 29
      // 0fb: dload 34
      // 0fd: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 100: astore 36
      // 102: aload 7
      // 104: aload 36
      // 106: invokestatic k74/x/IlllIlII.IIll (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)[F
      // 109: astore 37
      // 10b: aload 37
      // 10d: bipush 0
      // 10e: faload
      // 10f: fload 2
      // 110: fsub
      // 111: invokestatic k74/x/IlllIlII.llIII (F)F
      // 114: fstore 38
      // 116: aload 37
      // 118: bipush 1
      // 119: faload
      // 11a: ldc -90.0
      // 11c: ldc 90.0
      // 11e: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 121: fload 3
      // 122: ldc -90.0
      // 124: ldc 90.0
      // 126: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 129: fsub
      // 12a: fstore 39
      // 12c: fload 38
      // 12e: invokestatic java/lang/Math.abs (F)F
      // 131: fload 39
      // 133: invokestatic java/lang/Math.abs (F)F
      // 136: fadd
      // 137: f2d
      // 138: dstore 40
      // 13a: aload 36
      // 13c: aload 7
      // 13e: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 141: dstore 42
      // 143: dload 40
      // 145: dload 17
      // 147: dcmpg
      // 148: iflt 170
      // 14b: dload 40
      // 14d: dload 17
      // 14f: dsub
      // 150: invokestatic java/lang/Math.abs (D)D
      // 153: ldc2_w 1.0E-6
      // 156: dcmpg
      // 157: ifgt 197
      // 15a: goto 161
      // 15d: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 160: athrow
      // 161: dload 42
      // 163: dload 19
      // 165: dcmpg
      // 166: ifge 197
      // 169: goto 170
      // 16c: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16f: athrow
      // 170: dload 40
      // 172: dstore 17
      // 174: dload 42
      // 176: dstore 19
      // 178: aload 36
      // 17a: astore 12
      // 17c: aload 37
      // 17e: bipush 0
      // 17f: faload
      // 180: fstore 13
      // 182: aload 37
      // 184: bipush 1
      // 185: faload
      // 186: ldc -90.0
      // 188: ldc 90.0
      // 18a: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 18d: fstore 14
      // 18f: fload 38
      // 191: fstore 15
      // 193: fload 39
      // 195: fstore 16
      // 197: iinc 33 1
      // 19a: aload 6
      // 19c: ifnull 0e5
      // 19f: iinc 28 1
      // 1a2: aload 6
      // 1a4: ifnull 0cb
      // 1a7: iinc 23 1
      // 1aa: aload 6
      // 1ac: ifnull 0b1
      // 1af: aload 12
      // 1b1: ifnonnull 1bc
      // 1b4: aconst_null
      // 1b5: goto 1cd
      // 1b8: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1bb: athrow
      // 1bc: new k74/x/llIIlIlI
      // 1bf: dup
      // 1c0: aload 12
      // 1c2: fload 13
      // 1c4: fload 14
      // 1c6: fload 15
      // 1c8: fload 16
      // 1ca: invokespecial k74/x/llIIlIlI.<init> (Lnet/minecraft/class_243;FFFF)V
      // 1cd: areturn
   }

   public static float IIIIlI() {
      return IlI;
   }

   public static boolean IIIIll(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 11
      // 04: getstatic k74/x/IlllIlII.IIlIl Z
      // 07: ifne 17
      // 0a: goto 11
      // 0d: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10: athrow
      // 11: bipush 0
      // 12: ireturn
      // 13: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16: athrow
      // 17: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 1a: astore 1
      // 1b: aload 1
      // 1c: ifnull 30
      // 1f: aload 1
      // 20: getstatic k74/x/IlllIlII.lIlIl F
      // 23: getstatic k74/x/IlllIlII.l F
      // 26: invokestatic k74/x/IlllIlII.lIIl (Lnet/minecraft/class_310;FF)V
      // 29: goto 30
      // 2c: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f: athrow
      // 30: invokestatic k74/x/IlllIlII.IIl ()V
      // 33: bipush 1
      // 34: ireturn
   }

   public static boolean IIIlII(class_310 param0, int param1, class_243 param2, IIIll param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 04: ifeq 12
      // 07: aload 2
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: invokestatic k74/x/IlllIlII.lIIIl ()Z
      // 1b: ifne 24
      // 1e: bipush 0
      // 1f: ireturn
      // 20: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: aload 2
      // 25: invokestatic k74/x/IlllIlII.llIll (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 28: astore 4
      // 2a: aload 0
      // 2b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2e: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 31: aload 4
      // 33: invokestatic k74/x/IlllIlII.IIll (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)[F
      // 36: astore 5
      // 38: aload 5
      // 3a: bipush 0
      // 3b: aload 0
      // 3c: aload 5
      // 3e: bipush 0
      // 3f: faload
      // 40: invokestatic k74/x/IlllIlII.IllI (Lnet/minecraft/class_310;F)F
      // 43: fastore
      // 44: aload 0
      // 45: iload 1
      // 46: aload 5
      // 48: bipush 0
      // 49: faload
      // 4a: aload 5
      // 4c: bipush 1
      // 4d: faload
      // 4e: aload 3
      // 4f: invokestatic k74/x/IlllIlII.IlllI (Lnet/minecraft/class_310;IFFLk74/x/IIIll;)Z
      // 52: ireturn
   }

   public static boolean IIIlIl(class_310 var0, int var1, class_2338 var2, IIIll var3) {
      try {
         if (var2 == null) {
            return false;
         }
      } catch (RuntimeException var4) {
         throw lIl(var4);
      }

      return IIIII(var0, var1, class_243.method_24953(var2), var3);
   }

   public static boolean IIIllI(class_310 param0, int param1, float param2, float param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlII (Lnet/minecraft/class_310;)Z
      // 04: ifeq 3e
      // 07: fload 2
      // 08: invokestatic java/lang/Float.isFinite (F)Z
      // 0b: ifeq 3e
      // 0e: goto 15
      // 11: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: fload 3
      // 16: invokestatic java/lang/Float.isFinite (F)Z
      // 19: ifeq 3e
      // 1c: goto 23
      // 1f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 22: athrow
      // 23: getstatic k74/x/IlllIlII.IIlIl Z
      // 26: ifeq 44
      // 29: goto 30
      // 2c: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2f: athrow
      // 30: iload 1
      // 31: getstatic k74/x/IlllIlII.IlIl I
      // 34: if_icmpge 44
      // 37: goto 3e
      // 3a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: ireturn
      // 40: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 43: athrow
      // 44: aload 0
      // 45: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 48: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 4b: fstore 4
      // 4d: fload 2
      // 4e: fload 4
      // 50: invokestatic k74/x/IlllIlII.IlI (FF)F
      // 53: fstore 5
      // 55: fload 3
      // 56: ldc -90.0
      // 58: ldc 90.0
      // 5a: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 5d: fstore 6
      // 5f: aload 0
      // 60: iload 1
      // 61: fload 5
      // 63: fload 6
      // 65: getstatic k74/x/IlllIlII.lIlI Lk74/x/IIIll;
      // 68: bipush 0
      // 69: bipush 1
      // 6a: bipush 0
      // 6b: bipush 0
      // 6c: invokestatic k74/x/IlllIlII.IIllll (Lnet/minecraft/class_310;IFFLk74/x/IIIll;ZZZZ)Z
      // 6f: ireturn
   }

   private static boolean IIIlll(class_310 var0, int var1) {
      return IlIlII(var0);
   }

   public static boolean IIlIII(class_310 var0, int var1, float var2, float var3) {
      return IIIll(var0, var1, var2, var3, IlllIlII::IIIlI);
   }

   private static lllllIIl IIlIIl(class_310 param0, class_1297 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 04: ifeq 3d
      // 07: aload 1
      // 08: ifnull 3d
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: aload 1
      // 13: aload 0
      // 14: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 17: if_acmpeq 3d
      // 1a: goto 21
      // 1d: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: aload 1
      // 22: invokevirtual net/minecraft/class_1297.method_5805 ()Z
      // 25: ifeq 3d
      // 28: goto 2f
      // 2b: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e: athrow
      // 2f: aload 1
      // 30: invokevirtual net/minecraft/class_1297.method_31481 ()Z
      // 33: ifeq 43
      // 36: goto 3d
      // 39: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3c: athrow
      // 3d: aconst_null
      // 3e: areturn
      // 3f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42: athrow
      // 43: aload 0
      // 44: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 47: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 4a: fstore 3
      // 4b: aload 0
      // 4c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4f: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 52: ldc -90.0
      // 54: ldc 90.0
      // 56: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 59: fstore 4
      // 5b: aload 0
      // 5c: aload 1
      // 5d: fload 3
      // 5e: fload 4
      // 60: ldc2_w 0.1
      // 63: invokestatic k74/x/IlllIlII.IIIIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;FFD)Lk74/x/llIIlIlI;
      // 66: astore 5
      // 68: aload 5
      // 6a: ifnonnull 73
      // 6d: aconst_null
      // 6e: areturn
      // 6f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 72: athrow
      // 73: aload 0
      // 74: aload 1
      // 75: aload 5
      // 77: invokevirtual k74/x/llIIlIlI.lI ()F
      // 7a: aload 5
      // 7c: invokevirtual k74/x/llIIlIlI.l ()F
      // 7f: aload 5
      // 81: invokevirtual k74/x/llIIlIlI.Il ()Lnet/minecraft/class_243;
      // 84: invokestatic k74/x/IlllIlII.IIlII (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;FFLnet/minecraft/class_243;)Z
      // 87: istore 6
      // 89: aload 5
      // 8b: invokevirtual k74/x/llIIlIlI.I ()F
      // 8e: iload 2
      // 8f: invokestatic k74/x/IlllIlII.lllII (FI)F
      // 92: fstore 7
      // 94: aload 0
      // 95: fload 7
      // 97: aload 5
      // 99: invokevirtual k74/x/llIIlIlI.II ()F
      // 9c: iload 6
      // 9e: invokestatic k74/x/IlllIlII.IlIIl (Lnet/minecraft/class_310;FFZ)Lk74/x/I;
      // a1: astore 8
      // a3: fload 3
      // a4: aload 8
      // a6: invokevirtual k74/x/I.l ()F
      // a9: fadd
      // aa: fload 3
      // ab: invokestatic k74/x/IlllIlII.IlI (FF)F
      // ae: fstore 9
      // b0: fload 4
      // b2: aload 8
      // b4: invokevirtual k74/x/I.I ()F
      // b7: fadd
      // b8: ldc -90.0
      // ba: ldc 90.0
      // bc: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // bf: fstore 10
      // c1: new k74/x/lllllIIl
      // c4: dup
      // c5: aload 5
      // c7: invokevirtual k74/x/llIIlIlI.Il ()Lnet/minecraft/class_243;
      // ca: fload 9
      // cc: fload 10
      // ce: fload 9
      // d0: fload 3
      // d1: fsub
      // d2: invokestatic k74/x/IlllIlII.llIII (F)F
      // d5: fload 10
      // d7: fload 4
      // d9: fsub
      // da: aload 5
      // dc: invokevirtual k74/x/llIIlIlI.I ()F
      // df: aload 5
      // e1: invokevirtual k74/x/llIIlIlI.II ()F
      // e4: invokespecial k74/x/lllllIIl.<init> (Lnet/minecraft/class_243;FFFFFF)V
      // e7: areturn
   }

   public static boolean IIlIlI(class_310 var0, class_3965 var1) {
      return lIIII(var0, var1, false);
   }

   public static float IIlIll() {
      try {
         if (llIlI) {
            return lIIII;
         }
      } catch (RuntimeException var0) {
         throw lIl(var0);
      }

      return lIlIl;
   }

   public static boolean IIllII(class_310 param0, int param1, class_1297 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlllIlII.IlIlII (Lnet/minecraft/class_310;)Z
      // 04: ifeq 22
      // 07: getstatic k74/x/IlllIlII.IIlIl Z
      // 0a: ifeq 28
      // 0d: goto 14
      // 10: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 13: athrow
      // 14: iload 1
      // 15: getstatic k74/x/IlllIlII.IlIl I
      // 18: if_icmpge 28
      // 1b: goto 22
      // 1e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 21: athrow
      // 22: bipush 0
      // 23: ireturn
      // 24: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 27: athrow
      // 28: ldc_w -899198794
      // 2b: ldc_w -970140195
      // 2e: ldc_w -2103417199
      // 31: ixor
      // 32: invokestatic k74/x/IlllIlII.IlIllI (II)I
      // 35: iload 1
      // 36: imul
      // 37: aload 2
      // 38: ifnonnull 43
      // 3b: bipush -1
      // 3c: goto 47
      // 3f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 42: athrow
      // 43: aload 2
      // 44: invokevirtual net/minecraft/class_1297.method_5628 ()I
      // 47: iadd
      // 48: istore 3
      // 49: aload 0
      // 4a: aload 2
      // 4b: iload 3
      // 4c: invokestatic k74/x/IlllIlII.IIlIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;I)Lk74/x/lllllIIl;
      // 4f: astore 4
      // 51: aload 4
      // 53: ifnonnull 5c
      // 56: bipush 0
      // 57: ireturn
      // 58: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5b: athrow
      // 5c: bipush 1
      // 5d: putstatic k74/x/IlllIlII.IllIl Z
      // 60: aload 4
      // 62: invokevirtual k74/x/lllllIIl.Il ()F
      // 65: putstatic k74/x/IlllIlII.lI F
      // 68: aload 0
      // 69: aload 4
      // 6b: invokevirtual k74/x/lllllIIl.ll ()F
      // 6e: aload 4
      // 70: invokevirtual k74/x/lllllIIl.I ()F
      // 73: invokestatic k74/x/IlllIlII.lIllI (Lnet/minecraft/class_310;FF)V
      // 76: bipush 1
      // 77: ireturn
   }

   public static boolean IIllIl(class_310 var0, int var1, float var2, float var3, IIIll var4) {
      return IlllI(var0, var1, var2, var3, var4);
   }

   public static boolean IIlllI(class_310 var0, int var1, class_1297 var2, IIIll var3) {
      try {
         if (var2 == null) {
            return false;
         }
      } catch (RuntimeException var4) {
         throw lIl(var4);
      }

      return IIIII(var0, var1, var2.method_33571(), var3);
   }

   private static boolean IIllll(
      class_310 param0, int param1, float param2, float param3, IIIll param4, boolean param5, boolean param6, boolean param7, boolean param8
   ) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokestatic k74/x/IlllIlII.IlIlIl (Lnet/minecraft/class_310;)Z
      // 004: ifeq 02f
      // 007: aload 4
      // 009: ifnull 02f
      // 00c: goto 013
      // 00f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 012: athrow
      // 013: fload 2
      // 014: invokestatic java/lang/Float.isFinite (F)Z
      // 017: ifeq 02f
      // 01a: goto 021
      // 01d: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 020: athrow
      // 021: fload 3
      // 022: invokestatic java/lang/Float.isFinite (F)Z
      // 025: ifne 035
      // 028: goto 02f
      // 02b: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02e: athrow
      // 02f: bipush 0
      // 030: ireturn
      // 031: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 034: athrow
      // 035: getstatic k74/x/IlllIlII.llIlI Z
      // 038: ifne 048
      // 03b: getstatic k74/x/IlllIlII.lIlll Z
      // 03e: ifeq 04e
      // 041: goto 048
      // 044: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 047: athrow
      // 048: bipush 0
      // 049: ireturn
      // 04a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 04d: athrow
      // 04e: getstatic k74/x/IlllIlII.IIlIl Z
      // 051: ifeq 082
      // 054: getstatic k74/x/IlllIlII.lllI Z
      // 057: ifeq 082
      // 05a: goto 061
      // 05d: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 060: athrow
      // 061: getstatic k74/x/IlllIlII.IIllI Z
      // 064: ifne 07c
      // 067: goto 06e
      // 06a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06d: athrow
      // 06e: iload 1
      // 06f: getstatic k74/x/IlllIlII.IlIl I
      // 072: if_icmpgt 082
      // 075: goto 07c
      // 078: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 07b: athrow
      // 07c: bipush 0
      // 07d: ireturn
      // 07e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 081: athrow
      // 082: aload 0
      // 083: iload 1
      // 084: invokestatic k74/x/IlllIlII.IIIlll (Lnet/minecraft/class_310;I)Z
      // 087: ifne 090
      // 08a: bipush 0
      // 08b: ireturn
      // 08c: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08f: athrow
      // 090: aload 0
      // 091: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 094: getfield net/minecraft/class_746.field_6012 I
      // 097: bipush 1
      // 098: iadd
      // 099: istore 9
      // 09b: getstatic k74/x/IlllIlII.IIlIl Z
      // 09e: ifeq 0c4
      // 0a1: getstatic k74/x/IlllIlII.lIIlI I
      // 0a4: iload 9
      // 0a6: if_icmpne 0c4
      // 0a9: goto 0b0
      // 0ac: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0af: athrow
      // 0b0: iload 1
      // 0b1: getstatic k74/x/IlllIlII.IlIl I
      // 0b4: if_icmpgt 0c4
      // 0b7: goto 0be
      // 0ba: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0bd: athrow
      // 0be: bipush 0
      // 0bf: ireturn
      // 0c0: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: invokestatic k74/x/IlllIlII.Ill (Lnet/minecraft/class_310;)[F
      // 0c8: astore 10
      // 0ca: ldc_w -899198799
      // 0cd: ldc_w 2043443846
      // 0d0: ldc_w -1775413381
      // 0d3: ixor
      // 0d4: invokestatic k74/x/IlllIlII.IlIllI (II)I
      // 0d7: iload 1
      // 0d8: imul
      // 0d9: aload 4
      // 0db: invokeinterface k74/x/IIIll.getClass ()Ljava/lang/Class; 1
      // 0e0: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 0e3: iadd
      // 0e4: istore 11
      // 0e6: bipush 1
      // 0e7: putstatic k74/x/IlllIlII.IIlIl Z
      // 0ea: iload 9
      // 0ec: putstatic k74/x/IlllIlII.lIIlI I
      // 0ef: iload 1
      // 0f0: putstatic k74/x/IlllIlII.IlIl I
      // 0f3: aload 10
      // 0f5: bipush 0
      // 0f6: faload
      // 0f7: fload 2
      // 0f8: aload 10
      // 0fa: bipush 0
      // 0fb: faload
      // 0fc: fsub
      // 0fd: iload 11
      // 0ff: invokestatic k74/x/IlllIlII.lllII (FI)F
      // 102: fadd
      // 103: putstatic k74/x/IlllIlII.IlII F
      // 106: fload 3
      // 107: ldc -90.0
      // 109: ldc 90.0
      // 10b: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 10e: putstatic k74/x/IlllIlII.IIlII F
      // 111: aload 4
      // 113: putstatic k74/x/IlllIlII.llIll Lk74/x/IIIll;
      // 116: iload 5
      // 118: putstatic k74/x/IlllIlII.lIllI Z
      // 11b: iload 6
      // 11d: putstatic k74/x/IlllIlII.IIIll Z
      // 120: iload 8
      // 122: putstatic k74/x/IlllIlII.lllI Z
      // 125: iload 8
      // 127: ifeq 174
      // 12a: getstatic k74/x/IlllIlII.IIIl Z
      // 12d: ifeq 174
      // 130: goto 137
      // 133: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 136: athrow
      // 137: getstatic k74/x/IlllIlII.IlII F
      // 13a: aload 10
      // 13c: bipush 0
      // 13d: faload
      // 13e: fsub
      // 13f: invokestatic net/minecraft/class_3532.method_15393 (F)F
      // 142: invokestatic java/lang/Math.abs (F)F
      // 145: ldc_w 0.001
      // 148: fcmpg
      // 149: ifgt 174
      // 14c: goto 153
      // 14f: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 152: athrow
      // 153: getstatic k74/x/IlllIlII.IIlII F
      // 156: aload 10
      // 158: bipush 1
      // 159: faload
      // 15a: fsub
      // 15b: invokestatic java/lang/Math.abs (F)F
      // 15e: ldc_w 0.001
      // 161: fcmpg
      // 162: ifgt 174
      // 165: goto 16c
      // 168: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16b: athrow
      // 16c: bipush 1
      // 16d: goto 175
      // 170: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 173: athrow
      // 174: bipush 0
      // 175: putstatic k74/x/IlllIlII.IIllI Z
      // 178: bipush 0
      // 179: putstatic k74/x/IlllIlII.ll Z
      // 17c: bipush 0
      // 17d: putstatic k74/x/IlllIlII.llIlI Z
      // 180: bipush 1
      // 181: ireturn
   }

   public static boolean IlIIII(class_310 var0, int var1, float var2, float var3, IIIll var4) {
      return IIllll(var0, var1, var2, var3, var4, false, true, true, false);
   }

   private static boolean IlIIIl(IIIll var0) {
      k74.x.IIll.IlIllIl();

      boolean var1;
      try {
         var1 = var0.a();
      } finally {
         k74.x.IIll.lIII();
      }

      return var1;
   }

   private static void IlIIlI() {
      IIIll var0 = llIll;

      try {
         llIll = null;
         if (var0 == null) {
            return;
         }
      } catch (RuntimeException var8) {
         throw lIl(var8);
      }

      lII = true;

      try {
         IlIIIl(var0);
      } catch (RuntimeException var6) {
      } finally {
         lII = false;
      }
   }

   private static class_243 IlIIll(float var0, float var1) {
      float var2 = -var0 * (float) (Math.PI / 180.0);
      float var3 = var1 * (float) (Math.PI / 180.0);
      float var4 = class_3532.method_15374(var2);
      float var5 = class_3532.method_15362(var2);
      float var6 = class_3532.method_15362(var3);
      float var7 = class_3532.method_15374(var3);
      return new class_243(var4 * var6, -var7, var5 * var6);
   }

   private static boolean IlIlII(class_310 var0) {
      try {
         if (!IlIlIl(var0)) {
            llII = IlIllI(-899198800, 495548116 ^ -193739477);
            lIIl = 0;
            IIl();
            lIlll = false;
            II = false;
            return false;
         }
      } catch (RuntimeException var3) {
         throw lIl(var3);
      }

      int var1 = System.identityHashCode(var0.field_1724);

      try {
         if (lIIl != var1) {
            lIIl = var1;
            llII = IlIllI(-899198797, 495548116 ^ 732409638);
            IIl();
            lIlll = false;
            II = false;
         }

         return true;
      } catch (RuntimeException var2) {
         throw lIl(var2);
      }
   }

   private static boolean IlIlIl(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIllllI.II ()Z
      // 03: ifeq 0f
      // 06: invokestatic k74/x/IlllIlII.lIIll ()V
      // 09: bipush 0
      // 0a: ireturn
      // 0b: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: aload 0
      // 10: ifnull 56
      // 13: aload 0
      // 14: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 17: ifnull 56
      // 1a: goto 21
      // 1d: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: aload 0
      // 22: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 25: ifnull 56
      // 28: goto 2f
      // 2b: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2e: athrow
      // 2f: aload 0
      // 30: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 33: ifnull 56
      // 36: goto 3d
      // 39: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 41: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 44: ifeq 56
      // 47: goto 4e
      // 4a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4d: athrow
      // 4e: bipush 1
      // 4f: goto 57
      // 52: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 55: athrow
      // 56: bipush 0
      // 57: istore 1
      // 58: iload 1
      // 59: ifne 65
      // 5c: invokestatic k74/x/IlllIlII.lIIll ()V
      // 5f: bipush 0
      // 60: ireturn
      // 61: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 64: athrow
      // 65: aload 0
      // 66: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 69: invokevirtual net/minecraft/class_746.method_5628 ()I
      // 6c: istore 2
      // 6d: aload 0
      // 6e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 71: invokestatic java/lang/System.identityHashCode (Ljava/lang/Object;)I
      // 74: istore 3
      // 75: getstatic k74/x/IlllIlII.llIl I
      // 78: ifne 89
      // 7b: iload 2
      // 7c: putstatic k74/x/IlllIlII.IIl I
      // 7f: iload 3
      // 80: putstatic k74/x/IlllIlII.llIl I
      // 83: bipush 1
      // 84: ireturn
      // 85: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 88: athrow
      // 89: iload 2
      // 8a: getstatic k74/x/IlllIlII.IIl I
      // 8d: if_icmpne 9e
      // 90: iload 3
      // 91: getstatic k74/x/IlllIlII.llIl I
      // 94: if_icmpeq af
      // 97: goto 9e
      // 9a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 9d: athrow
      // 9e: iload 2
      // 9f: putstatic k74/x/IlllIlII.IIl I
      // a2: iload 3
      // a3: putstatic k74/x/IlllIlII.llIl I
      // a6: invokestatic k74/x/IlllIlII.lIIll ()V
      // a9: bipush 0
      // aa: ireturn
      // ab: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // ae: athrow
      // af: bipush 1
      // b0: ireturn
   }

   static {
      int var0 = 156051703;
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "\u0099ä%¡ ¢-éûÆ\u0095\u008a÷´ihù§cÅ\u0093\u009cîxÁ\u0006\n$Ä²Qd\u008b\u0013RtQ;*\u008cÏ\u0091û\u001dA¿\u009dM\u008dSÏ\u009c\u0013p\u0007&U\u0098\u0002²A-R_\u000eµul&`YråíÖkxÑ$\u0084Ó¼º2U§'\u009c\u008asM\u0092"
         .getBytes("ISO-8859-1");

      int var15;
      do {
         llllI[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -163916102;
         var10000 += 1;
         var15 = var10001 + 4;
         var10001 += 4;
      } while (var15 < var10002.length);

      llII = IlIllI(-899198802, var0 ^ -189849145);
      lIIlI = IlIllI(-899198807, var0 ^ 943944465);
      lllII = IlIllI(-899198808, var0 ^ -1503609942);
      lIlII = IlIllI(-899198805, var0 ^ -527909315);
      IllI = IlIllI(-899198806, var0 ^ -197267759);
      IIl = -1;
      llIl = 0;
      IIIIl = Float.NaN;
      IIlll = IlIllI(-899198795, var0 ^ -1146762755);
      lIlI = IlllIlII::lIlIl;
   }

   public static boolean l(class_310 param0, class_1297 param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokestatic k74/x/IlllIlII.IlIlII (Lnet/minecraft/class_310;)Z
      // 004: ifeq 065
      // 007: getstatic k74/x/IlllIlII.IIIl Z
      // 00a: ifeq 065
      // 00d: goto 014
      // 010: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 013: athrow
      // 014: aload 1
      // 015: ifnull 065
      // 018: goto 01f
      // 01b: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 01e: athrow
      // 01f: aload 1
      // 020: aload 0
      // 021: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 024: if_acmpeq 065
      // 027: goto 02e
      // 02a: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 02d: athrow
      // 02e: aload 1
      // 02f: invokevirtual net/minecraft/class_1297.method_5805 ()Z
      // 032: ifeq 065
      // 035: goto 03c
      // 038: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 03b: athrow
      // 03c: aload 1
      // 03d: invokevirtual net/minecraft/class_1297.method_31481 ()Z
      // 040: ifne 065
      // 043: goto 04a
      // 046: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 049: athrow
      // 04a: dload 2
      // 04b: invokestatic java/lang/Double.isFinite (D)Z
      // 04e: ifeq 065
      // 051: goto 058
      // 054: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 057: athrow
      // 058: dload 2
      // 059: dconst_0
      // 05a: dcmpg
      // 05b: ifgt 06b
      // 05e: goto 065
      // 061: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 064: athrow
      // 065: bipush 0
      // 066: ireturn
      // 067: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 06a: athrow
      // 06b: aload 0
      // 06c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 06f: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 072: astore 4
      // 074: aload 1
      // 075: invokevirtual net/minecraft/class_1297.method_5829 ()Lnet/minecraft/class_238;
      // 078: astore 5
      // 07a: aload 5
      // 07c: ldc2_w 0.1
      // 07f: aload 1
      // 080: invokevirtual net/minecraft/class_1297.method_5871 ()F
      // 083: f2d
      // 084: invokestatic java/lang/Math.max (DD)D
      // 087: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 08a: astore 6
      // 08c: aload 6
      // 08e: aload 4
      // 090: invokevirtual net/minecraft/class_238.method_1006 (Lnet/minecraft/class_243;)Z
      // 093: ifeq 09c
      // 096: bipush 1
      // 097: ireturn
      // 098: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 09b: athrow
      // 09c: aload 4
      // 09e: getstatic k74/x/IlllIlII.IIIlI F
      // 0a1: getstatic k74/x/IlllIlII.III F
      // 0a4: invokestatic k74/x/IlllIlII.IlIIll (FF)Lnet/minecraft/class_243;
      // 0a7: dload 2
      // 0a8: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0ab: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0ae: astore 7
      // 0b0: aload 6
      // 0b2: aload 4
      // 0b4: aload 7
      // 0b6: invokevirtual net/minecraft/class_238.method_992 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Ljava/util/Optional;
      // 0b9: aconst_null
      // 0ba: invokevirtual java/util/Optional.orElse (Ljava/lang/Object;)Ljava/lang/Object;
      // 0bd: checkcast net/minecraft/class_243
      // 0c0: astore 8
      // 0c2: aload 8
      // 0c4: ifnonnull 0cd
      // 0c7: bipush 0
      // 0c8: ireturn
      // 0c9: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0cc: athrow
      // 0cd: aload 0
      // 0ce: aload 0
      // 0cf: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0d2: aload 4
      // 0d4: aload 8
      // 0d6: invokestatic k74/x/IIll.lIIIlll (Lnet/minecraft/class_310;Lnet/minecraft/class_1297;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_3965;
      // 0d9: astore 9
      // 0db: aload 9
      // 0dd: ifnull 112
      // 0e0: aload 9
      // 0e2: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 0e5: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
      // 0e8: if_acmpeq 112
      // 0eb: goto 0f2
      // 0ee: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0f1: athrow
      // 0f2: aload 4
      // 0f4: aload 9
      // 0f6: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 0f9: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 0fc: ldc2_w 1.0E-6
      // 0ff: dadd
      // 100: aload 4
      // 102: aload 8
      // 104: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 107: dcmpl
      // 108: iflt 11a
      // 10b: goto 112
      // 10e: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 111: athrow
      // 112: bipush 1
      // 113: goto 11b
      // 116: invokestatic k74/x/IlllIlII.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 119: athrow
      // 11a: bipush 0
      // 11b: ireturn
   }
}
