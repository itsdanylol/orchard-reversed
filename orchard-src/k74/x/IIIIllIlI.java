package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1267;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

@Environment(EnvType.CLIENT)
public final class IIIIllIlI {
   public static float I(class_1309 var0, class_243 var1, float var2) {
      try {
         float var3 = ll(var0, var1, var2);

         try {
            if (Float.isFinite(var3)) {
               return var3;
            }
         } catch (RuntimeException var4) {
            throw IIl(var4);
         }

         return Float.POSITIVE_INFINITY;
      } catch (LinkageError | RuntimeException var5) {
         return Float.POSITIVE_INFINITY;
      }
   }

   private static float l(float var0, class_1267 var1) {
      try {
         if (var1 == class_1267.field_5801) {
            return 0.0F;
         }
      } catch (RuntimeException var4) {
         throw IIl(var4);
      }

      try {
         if (var1 == class_1267.field_5805) {
            return Math.min(var0 * 0.5F + 1.0F, var0);
         }
      } catch (RuntimeException var2) {
         throw IIl(var2);
      }

      try {
         if (var1 == class_1267.field_5807) {
            return var0 * 1.5F;
         }
      } catch (RuntimeException var3) {
         throw IIl(var3);
      }

      return var0;
   }

   static boolean II(class_243 param0, class_243 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 1a
      // 04: aload 1
      // 05: ifnull 1a
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: aload 2
      // 10: ifnonnull 20
      // 13: goto 1a
      // 16: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: bipush 0
      // 1b: ireturn
      // 1c: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield net/minecraft/class_243.field_1352 D
      // 24: aload 0
      // 25: getfield net/minecraft/class_243.field_1351 D
      // 28: aload 0
      // 29: getfield net/minecraft/class_243.field_1350 D
      // 2c: aload 1
      // 2d: getfield net/minecraft/class_243.field_1352 D
      // 30: aload 1
      // 31: getfield net/minecraft/class_243.field_1351 D
      // 34: aload 1
      // 35: getfield net/minecraft/class_243.field_1350 D
      // 38: aload 2
      // 39: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 3c: i2d
      // 3d: aload 2
      // 3e: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 41: i2d
      // 42: aload 2
      // 43: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 46: i2d
      // 47: aload 2
      // 48: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 4b: i2d
      // 4c: dconst_1
      // 4d: dadd
      // 4e: aload 2
      // 4f: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 52: i2d
      // 53: dconst_1
      // 54: dadd
      // 55: aload 2
      // 56: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 59: i2d
      // 5a: dconst_1
      // 5b: dadd
      // 5c: invokestatic k74/x/llIllIlI.lIl (DDDDDDDDDDDD)Z
      // 5f: ireturn
   }

   private static boolean Il(class_310 param0, class_243 param1, class_243 param2, class_1297 param3, class_2338 param4, class_2338 param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 5
      // 02: ifnull 1c
      // 05: aload 2
      // 06: aload 1
      // 07: aload 5
      // 09: invokestatic k74/x/IIIIllIlI.II (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Z
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 20: new net/minecraft/class_3959
      // 23: dup
      // 24: aload 2
      // 25: aload 1
      // 26: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
      // 29: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 2c: aload 3
      // 2d: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 30: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 33: astore 6
      // 35: aload 6
      // 37: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 3a: getstatic net/minecraft/class_239$class_240.field_1333 Lnet/minecraft/class_239$class_240;
      // 3d: if_acmpne 46
      // 40: bipush 1
      // 41: ireturn
      // 42: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 45: athrow
      // 46: aload 4
      // 48: ifnull 67
      // 4b: aload 6
      // 4d: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 50: aload 4
      // 52: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 55: ifeq 67
      // 58: goto 5f
      // 5b: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 5e: athrow
      // 5f: bipush 1
      // 60: goto 68
      // 63: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 66: athrow
      // 67: bipush 0
      // 68: ireturn
   }

   public static float lI(class_1309 param0, class_2338 param1, class_2338 param2, class_243 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 0f
      // 04: aload 1
      // 05: ifnonnull 15
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: fconst_0
      // 10: freturn
      // 11: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 18: astore 4
      // 1a: aload 4
      // 1c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1f: ifnonnull 28
      // 22: fconst_0
      // 23: freturn
      // 24: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 27: athrow
      // 28: aload 1
      // 29: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 2c: astore 5
      // 2e: aload 0
      // 2f: invokevirtual net/minecraft/class_1309.method_73189 ()Lnet/minecraft/class_243;
      // 32: astore 6
      // 34: aload 3
      // 35: ifnonnull 41
      // 38: aload 6
      // 3a: goto 42
      // 3d: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 40: athrow
      // 41: aload 3
      // 42: astore 7
      // 44: aload 0
      // 45: invokevirtual net/minecraft/class_1309.method_5829 ()Lnet/minecraft/class_238;
      // 48: aload 7
      // 4a: aload 6
      // 4c: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 4f: invokevirtual net/minecraft/class_238.method_997 (Lnet/minecraft/class_243;)Lnet/minecraft/class_238;
      // 52: astore 8
      // 54: ldc 10.0
      // 56: fstore 9
      // 58: aload 7
      // 5a: aload 5
      // 5c: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 5f: invokestatic java/lang/Math.sqrt (D)D
      // 62: fload 9
      // 64: f2d
      // 65: ddiv
      // 66: dstore 10
      // 68: dload 10
      // 6a: dconst_1
      // 6b: dcmpl
      // 6c: ifle 75
      // 6f: fconst_0
      // 70: freturn
      // 71: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 74: athrow
      // 75: aload 5
      // 77: aload 8
      // 79: aload 0
      // 7a: aload 1
      // 7b: aload 2
      // 7c: invokestatic k74/x/IIIIllIlI.III (Lnet/minecraft/class_243;Lnet/minecraft/class_238;Lnet/minecraft/class_1297;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)F
      // 7f: fstore 12
      // 81: dconst_1
      // 82: dload 10
      // 84: dsub
      // 85: fload 12
      // 87: f2d
      // 88: dmul
      // 89: dstore 13
      // 8b: dload 13
      // 8d: dload 13
      // 8f: dmul
      // 90: dload 13
      // 92: dadd
      // 93: ldc2_w 0.5
      // 96: dmul
      // 97: ldc2_w 7.0
      // 9a: dmul
      // 9b: fload 9
      // 9d: f2d
      // 9e: dmul
      // 9f: dconst_1
      // a0: dadd
      // a1: d2f
      // a2: fstore 15
      // a4: fload 15
      // a6: aload 4
      // a8: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // ab: invokevirtual net/minecraft/class_638.method_8407 ()Lnet/minecraft/class_1267;
      // ae: invokestatic k74/x/IIIIllIlI.l (FLnet/minecraft/class_1267;)F
      // b1: fstore 15
      // b3: aload 0
      // b4: invokevirtual net/minecraft/class_1309.method_6096 ()I
      // b7: i2f
      // b8: fstore 16
      // ba: aload 0
      // bb: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // be: invokevirtual net/minecraft/class_1309.method_5996 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1324;
      // c1: ifnonnull cc
      // c4: fconst_0
      // c5: goto d4
      // c8: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // cb: athrow
      // cc: aload 0
      // cd: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // d0: invokevirtual net/minecraft/class_1309.method_45325 (Lnet/minecraft/class_6880;)D
      // d3: d2f
      // d4: fstore 17
      // d6: fconst_2
      // d7: fload 17
      // d9: ldc 4.0
      // db: fdiv
      // dc: fadd
      // dd: fstore 18
      // df: fload 16
      // e1: fload 15
      // e3: fload 18
      // e5: fdiv
      // e6: fsub
      // e7: fload 16
      // e9: ldc 0.2
      // eb: fmul
      // ec: ldc 20.0
      // ee: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // f1: fstore 19
      // f3: fload 15
      // f5: fconst_1
      // f6: fload 19
      // f8: ldc 25.0
      // fa: fdiv
      // fb: fsub
      // fc: fmul
      // fd: freturn
   }

   public static float ll(class_1309 param0, class_243 param1, float param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 0f
      // 04: aload 1
      // 05: ifnonnull 15
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: fconst_0
      // 10: freturn
      // 11: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 18: astore 3
      // 19: aload 3
      // 1a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1d: ifnonnull 26
      // 20: fconst_0
      // 21: freturn
      // 22: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: fload 2
      // 27: fconst_2
      // 28: fmul
      // 29: fstore 4
      // 2b: aload 0
      // 2c: invokevirtual net/minecraft/class_1309.method_73189 ()Lnet/minecraft/class_243;
      // 2f: aload 1
      // 30: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 33: invokestatic java/lang/Math.sqrt (D)D
      // 36: fload 4
      // 38: f2d
      // 39: ddiv
      // 3a: dstore 5
      // 3c: dload 5
      // 3e: dconst_1
      // 3f: dcmpl
      // 40: ifle 49
      // 43: fconst_0
      // 44: freturn
      // 45: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: dconst_1
      // 4a: dload 5
      // 4c: dsub
      // 4d: dstore 7
      // 4f: dload 7
      // 51: dload 7
      // 53: dmul
      // 54: dload 7
      // 56: dadd
      // 57: ldc2_w 0.5
      // 5a: dmul
      // 5b: ldc2_w 7.0
      // 5e: dmul
      // 5f: fload 4
      // 61: f2d
      // 62: dmul
      // 63: dconst_1
      // 64: dadd
      // 65: d2f
      // 66: fstore 9
      // 68: fload 9
      // 6a: aload 3
      // 6b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 6e: invokevirtual net/minecraft/class_638.method_8407 ()Lnet/minecraft/class_1267;
      // 71: invokestatic k74/x/IIIIllIlI.l (FLnet/minecraft/class_1267;)F
      // 74: fstore 9
      // 76: aload 0
      // 77: invokevirtual net/minecraft/class_1309.method_6096 ()I
      // 7a: i2f
      // 7b: fstore 10
      // 7d: aload 0
      // 7e: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // 81: invokevirtual net/minecraft/class_1309.method_5996 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1324;
      // 84: ifnonnull 8f
      // 87: fconst_0
      // 88: goto 97
      // 8b: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 8e: athrow
      // 8f: aload 0
      // 90: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // 93: invokevirtual net/minecraft/class_1309.method_45325 (Lnet/minecraft/class_6880;)D
      // 96: d2f
      // 97: fstore 11
      // 99: fconst_2
      // 9a: fload 11
      // 9c: ldc 4.0
      // 9e: fdiv
      // 9f: fadd
      // a0: fstore 12
      // a2: fload 10
      // a4: fload 9
      // a6: fload 12
      // a8: fdiv
      // a9: fsub
      // aa: fload 10
      // ac: ldc 0.2
      // ae: fmul
      // af: ldc 20.0
      // b1: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // b4: fstore 13
      // b6: fload 9
      // b8: fconst_1
      // b9: fload 13
      // bb: ldc 25.0
      // bd: fdiv
      // be: fsub
      // bf: fmul
      // c0: freturn
   }

   private IIIIllIlI() {
   }

   private static float III(class_243 param0, class_238 param1, class_1297 param2, class_2338 param3, class_2338 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 6
      // 008: astore 5
      // 00a: aload 0
      // 00b: ifnull 033
      // 00e: aload 1
      // 00f: ifnull 033
      // 012: goto 019
      // 015: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 018: athrow
      // 019: aload 2
      // 01a: ifnull 033
      // 01d: goto 024
      // 020: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 023: athrow
      // 024: aload 6
      // 026: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 029: ifnonnull 039
      // 02c: goto 033
      // 02f: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 032: athrow
      // 033: fconst_0
      // 034: freturn
      // 035: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 038: athrow
      // 039: dconst_1
      // 03a: aload 1
      // 03b: invokevirtual net/minecraft/class_238.method_17939 ()D
      // 03e: ldc2_w 2.0
      // 041: dmul
      // 042: dconst_1
      // 043: dadd
      // 044: ddiv
      // 045: dstore 7
      // 047: dconst_1
      // 048: aload 1
      // 049: invokevirtual net/minecraft/class_238.method_17940 ()D
      // 04c: ldc2_w 2.0
      // 04f: dmul
      // 050: dconst_1
      // 051: dadd
      // 052: ddiv
      // 053: dstore 9
      // 055: dconst_1
      // 056: aload 1
      // 057: invokevirtual net/minecraft/class_238.method_17941 ()D
      // 05a: ldc2_w 2.0
      // 05d: dmul
      // 05e: dconst_1
      // 05f: dadd
      // 060: ddiv
      // 061: dstore 11
      // 063: dload 7
      // 065: dconst_0
      // 066: dcmpg
      // 067: iflt 086
      // 06a: dload 9
      // 06c: dconst_0
      // 06d: dcmpg
      // 06e: iflt 086
      // 071: goto 078
      // 074: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 077: athrow
      // 078: dload 11
      // 07a: dconst_0
      // 07b: dcmpg
      // 07c: ifge 08c
      // 07f: goto 086
      // 082: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 085: athrow
      // 086: fconst_0
      // 087: freturn
      // 088: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 08b: athrow
      // 08c: dconst_1
      // 08d: dconst_1
      // 08e: dload 7
      // 090: ddiv
      // 091: invokestatic java/lang/Math.floor (D)D
      // 094: dload 7
      // 096: dmul
      // 097: dsub
      // 098: ldc2_w 0.5
      // 09b: dmul
      // 09c: dstore 13
      // 09e: dconst_1
      // 09f: dconst_1
      // 0a0: dload 11
      // 0a2: ddiv
      // 0a3: invokestatic java/lang/Math.floor (D)D
      // 0a6: dload 11
      // 0a8: dmul
      // 0a9: dsub
      // 0aa: ldc2_w 0.5
      // 0ad: dmul
      // 0ae: dstore 15
      // 0b0: bipush 0
      // 0b1: istore 17
      // 0b3: bipush 0
      // 0b4: istore 18
      // 0b6: dconst_0
      // 0b7: dstore 19
      // 0b9: dload 19
      // 0bb: dconst_1
      // 0bc: dcmpg
      // 0bd: ifgt 14a
      // 0c0: dconst_0
      // 0c1: dstore 21
      // 0c3: dload 21
      // 0c5: dconst_1
      // 0c6: dcmpg
      // 0c7: ifgt 13e
      // 0ca: dconst_0
      // 0cb: dstore 23
      // 0cd: dload 23
      // 0cf: dconst_1
      // 0d0: dcmpg
      // 0d1: ifgt 132
      // 0d4: new net/minecraft/class_243
      // 0d7: dup
      // 0d8: dload 19
      // 0da: aload 1
      // 0db: getfield net/minecraft/class_238.field_1323 D
      // 0de: aload 1
      // 0df: getfield net/minecraft/class_238.field_1320 D
      // 0e2: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
      // 0e5: dload 13
      // 0e7: dadd
      // 0e8: dload 21
      // 0ea: aload 1
      // 0eb: getfield net/minecraft/class_238.field_1322 D
      // 0ee: aload 1
      // 0ef: getfield net/minecraft/class_238.field_1325 D
      // 0f2: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
      // 0f5: dload 23
      // 0f7: aload 1
      // 0f8: getfield net/minecraft/class_238.field_1321 D
      // 0fb: aload 1
      // 0fc: getfield net/minecraft/class_238.field_1324 D
      // 0ff: invokestatic net/minecraft/class_3532.method_16436 (DDD)D
      // 102: dload 15
      // 104: dadd
      // 105: invokespecial net/minecraft/class_243.<init> (DDD)V
      // 108: astore 25
      // 10a: aload 6
      // 10c: aload 25
      // 10e: aload 0
      // 10f: aload 2
      // 110: aload 3
      // 111: aload 4
      // 113: invokestatic k74/x/IIIIllIlI.Il (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_1297;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Z
      // 116: ifeq 123
      // 119: iinc 17 1
      // 11c: goto 123
      // 11f: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 122: athrow
      // 123: iinc 18 1
      // 126: dload 23
      // 128: dload 11
      // 12a: dadd
      // 12b: dstore 23
      // 12d: aload 5
      // 12f: ifnull 0cd
      // 132: dload 21
      // 134: dload 9
      // 136: dadd
      // 137: dstore 21
      // 139: aload 5
      // 13b: ifnull 0c3
      // 13e: dload 19
      // 140: dload 7
      // 142: dadd
      // 143: dstore 19
      // 145: aload 5
      // 147: ifnull 0b9
      // 14a: iload 18
      // 14c: ifne 157
      // 14f: fconst_0
      // 150: goto 15e
      // 153: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 156: athrow
      // 157: iload 17
      // 159: i2f
      // 15a: iload 18
      // 15c: i2f
      // 15d: fdiv
      // 15e: freturn
   }

   private static RuntimeException IIl(RuntimeException var0) {
      return var0;
   }

   public static float IlI(class_1309 var0, class_243 var1, float var2) {
      return lII(var0, var1, var2, null);
   }

   private static float Ill(class_243 var0, class_238 var1, class_1297 var2) {
      class_310 var3 = class_310.method_1551();

      try {
         if (var3.field_1687 == null) {
            return 0.0F;
         }
      } catch (RuntimeException var26) {
         throw IIl(var26);
      }

      double var4 = 1.0 / (var1.method_17939() * 2.0 + 1.0);
      double var6 = 1.0 / (var1.method_17940() * 2.0 + 1.0);
      double var8 = 1.0 / (var1.method_17941() * 2.0 + 1.0);
      double var10 = (1.0 - Math.floor(1.0 / var4) * var4) * 0.5;
      double var12 = (1.0 - Math.floor(1.0 / var8) * var8) * 0.5;
      int var14 = 0;
      int var15 = 0;

      for (double var16 = 0.0; var16 <= 1.0; var16 += var4) {
         for (double var18 = 0.0; var18 <= 1.0; var18 += var6) {
            for (double var20 = 0.0; var20 <= 1.0; var20 += var8) {
               class_243 var22 = new class_243(
                  class_3532.method_16436(var16, var1.field_1323, var1.field_1320) + var10,
                  class_3532.method_16436(var18, var1.field_1322, var1.field_1325),
                  class_3532.method_16436(var20, var1.field_1321, var1.field_1324) + var12
               );
               class_3965 var23 = var3.field_1687.method_17742(new class_3959(var22, var0, class_3960.field_17558, class_242.field_1348, var2));

               try {
                  if (var23.method_17783() == class_240.field_1333) {
                     var14++;
                  }
               } catch (RuntimeException var25) {
                  throw IIl(var25);
               }

               var15++;
            }
         }
      }

      try {
         if (var15 == 0) {
            return 0.0F;
         }
      } catch (RuntimeException var24) {
         throw IIl(var24);
      }

      return (float)var14 / var15;
   }

   public static float lII(class_1309 param0, class_243 param1, float param2, class_2338 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 0f
      // 04: aload 1
      // 05: ifnonnull 15
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: fconst_0
      // 10: freturn
      // 11: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 18: astore 4
      // 1a: aload 4
      // 1c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1f: ifnonnull 28
      // 22: fconst_0
      // 23: freturn
      // 24: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 27: athrow
      // 28: aload 0
      // 29: invokevirtual net/minecraft/class_1309.method_73189 ()Lnet/minecraft/class_243;
      // 2c: astore 5
      // 2e: aload 0
      // 2f: invokevirtual net/minecraft/class_1309.method_5829 ()Lnet/minecraft/class_238;
      // 32: astore 6
      // 34: fload 2
      // 35: fconst_2
      // 36: fmul
      // 37: fstore 7
      // 39: aload 5
      // 3b: aload 1
      // 3c: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 3f: invokestatic java/lang/Math.sqrt (D)D
      // 42: fload 7
      // 44: f2d
      // 45: ddiv
      // 46: dstore 8
      // 48: dload 8
      // 4a: dconst_1
      // 4b: dcmpl
      // 4c: ifle 55
      // 4f: fconst_0
      // 50: freturn
      // 51: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 54: athrow
      // 55: aload 3
      // 56: ifnonnull 67
      // 59: aload 1
      // 5a: aload 6
      // 5c: aload 0
      // 5d: invokestatic k74/x/IIIIllIlI.Ill (Lnet/minecraft/class_243;Lnet/minecraft/class_238;Lnet/minecraft/class_1297;)F
      // 60: goto 70
      // 63: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 66: athrow
      // 67: aload 1
      // 68: aload 6
      // 6a: aload 0
      // 6b: aconst_null
      // 6c: aload 3
      // 6d: invokestatic k74/x/IIIIllIlI.III (Lnet/minecraft/class_243;Lnet/minecraft/class_238;Lnet/minecraft/class_1297;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)F
      // 70: fstore 10
      // 72: dconst_1
      // 73: dload 8
      // 75: dsub
      // 76: fload 10
      // 78: f2d
      // 79: dmul
      // 7a: dstore 11
      // 7c: dload 11
      // 7e: dload 11
      // 80: dmul
      // 81: dload 11
      // 83: dadd
      // 84: ldc2_w 0.5
      // 87: dmul
      // 88: ldc2_w 7.0
      // 8b: dmul
      // 8c: fload 7
      // 8e: f2d
      // 8f: dmul
      // 90: dconst_1
      // 91: dadd
      // 92: d2f
      // 93: fstore 13
      // 95: fload 13
      // 97: aload 4
      // 99: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 9c: invokevirtual net/minecraft/class_638.method_8407 ()Lnet/minecraft/class_1267;
      // 9f: invokestatic k74/x/IIIIllIlI.l (FLnet/minecraft/class_1267;)F
      // a2: fstore 13
      // a4: aload 0
      // a5: invokevirtual net/minecraft/class_1309.method_6096 ()I
      // a8: i2f
      // a9: fstore 14
      // ab: aload 0
      // ac: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // af: invokevirtual net/minecraft/class_1309.method_5996 (Lnet/minecraft/class_6880;)Lnet/minecraft/class_1324;
      // b2: ifnonnull bd
      // b5: fconst_0
      // b6: goto c5
      // b9: invokestatic k74/x/IIIIllIlI.IIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // bc: athrow
      // bd: aload 0
      // be: getstatic net/minecraft/class_5134.field_23725 Lnet/minecraft/class_6880;
      // c1: invokevirtual net/minecraft/class_1309.method_45325 (Lnet/minecraft/class_6880;)D
      // c4: d2f
      // c5: fstore 15
      // c7: fconst_2
      // c8: fload 15
      // ca: ldc 4.0
      // cc: fdiv
      // cd: fadd
      // ce: fstore 16
      // d0: fload 14
      // d2: fload 13
      // d4: fload 16
      // d6: fdiv
      // d7: fsub
      // d8: fload 14
      // da: ldc 0.2
      // dc: fmul
      // dd: ldc 20.0
      // df: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // e2: fstore 17
      // e4: fload 13
      // e6: fconst_1
      // e7: fload 17
      // e9: ldc 25.0
      // eb: fdiv
      // ec: fsub
      // ed: fmul
      // ee: freturn
   }
}
