package k74.x;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class IIIlllIIl extends IlIIIIIIl {
   private static final int[] Illl;
   private static final String[] II;
   private static final Object[] lIIl;
   private long Il;
   private static final IIIlIlIl lI;
   private static final String[] ll;
   private static final IIIllIIl III;
   private final lllIIlII IIl;
   private static final double IlI = 0.9;
   private final Map<Long, Double> Ill;
   private static final IIIlIlIl lII;
   private final IIlIII lIl;
   private class_2960 llI;
   private static final IIIlIlIl lll;
   private static final float IIII = 1000.0F;
   private final IllIII<lIllIllI> IIIl;
   private static final double IIlI = 0.28;
   private class_2960 IIll;
   private class_2960 I;
   private final lllIIlII IlII;
   private static final String[] lIII;
   private static final double IlIl = 1.14;
   private static final IIIlIlIl IllI;

   private String I(IIIlIlI param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: ldc -358183518
      // 02: istore 7
      // 04: aload 1
      // 05: invokevirtual k74/x/IIIlIlI.I ()Ljava/lang/String;
      // 08: astore 2
      // 09: aload 1
      // 0a: invokevirtual k74/x/IIIlIlI.II ()Ljava/lang/String;
      // 0d: astore 3
      // 0e: aload 3
      // 0f: ifnull 20
      // 12: aload 3
      // 13: invokevirtual java/lang/String.isBlank ()Z
      // 16: ifeq 36
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1f: athrow
      // 20: aload 2
      // 21: ifnonnull 34
      // 24: goto 2b
      // 27: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 2a: athrow
      // 2b: ldc ""
      // 2d: goto 35
      // 30: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 33: athrow
      // 34: aload 2
      // 35: areturn
      // 36: aload 2
      // 37: ifnull 48
      // 3a: aload 2
      // 3b: invokevirtual java/lang/String.isBlank ()Z
      // 3e: ifeq 4e
      // 41: goto 48
      // 44: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 47: athrow
      // 48: aload 3
      // 49: areturn
      // 4a: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 4d: athrow
      // 4e: aload 2
      // 4f: aload 2
      // 50: ldc 2106594760
      // 52: iload 7
      // 54: ldc 1512894057
      // 56: ixor
      // 57: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // 5a: ldc 2106594761
      // 5c: iload 7
      // 5e: ldc -1412738770
      // 60: ixor
      // 61: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // 64: invokestatic k74/x/IIIlllIIl.IlII (II)Ljava/lang/String;
      // 67: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 6a: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 6d: ifne 98
      // 70: aload 2
      // 71: ldc 2106594762
      // 73: iload 7
      // 75: ldc 1537313830
      // 77: ixor
      // 78: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // 7b: ldc 2106594763
      // 7d: iload 7
      // 7f: ldc -1832701402
      // 81: ixor
      // 82: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // 85: invokestatic k74/x/IIIlllIIl.IlII (II)Ljava/lang/String;
      // 88: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 8b: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 8e: ifeq b9
      // 91: goto 98
      // 94: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 97: athrow
      // 98: ldc 2106594764
      // 9a: iload 7
      // 9c: ldc -423989124
      // 9e: ixor
      // 9f: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // a2: ldc 2106594765
      // a4: iload 7
      // a6: ldc 665028457
      // a8: ixor
      // a9: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // ac: invokestatic k74/x/IIIlllIIl.IlII (II)Ljava/lang/String;
      // af: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // b2: goto d3
      // b5: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // b8: athrow
      // b9: ldc 2106594766
      // bb: iload 7
      // bd: ldc -330380257
      // bf: ixor
      // c0: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // c3: ldc 2106594767
      // c5: iload 7
      // c7: ldc 86316237
      // c9: ixor
      // ca: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // cd: invokestatic k74/x/IIIlllIIl.IlII (II)Ljava/lang/String;
      // d0: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // d3: aload 3
      // d4: astore 6
      // d6: astore 5
      // d8: astore 4
      // da: new java/lang/StringBuilder
      // dd: dup
      // de: invokespecial java/lang/StringBuilder.<init> ()V
      // e1: aload 4
      // e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // e6: aload 5
      // e8: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // eb: aload 6
      // ed: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // f0: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // f3: areturn
   }

   private void l(class_332 var1, class_327 var2, IIIlIlI var3, double var4, double var6, double var8, double var10) {
      int var12 = (int)Math.round(255.0 * var10);
      int var13 = IIIlllII.l(this.II(var3).getRGB(), var12);
      if (var3.Ill() == IIIIllI.I) {
         class_2960 var16 = this.llI;
         if (var16 == null) {
            var16 = llI(lII);
            this.llI = var16;
         }

         IlIIlllIl.IIIl(var1, var16, var4, var6, var8, var8, var13);
      } else {
         class_2960 var14 = this.llII(var3);
         if (var14 != null) {
            int var15 = IIIlllII.l(-1, var12);
            IlIIlllIl.lIllI(var1, var14, var4, var6, var8, var8, var15);
         } else {
            IlIIlllIl.lIIll(var1, var2, var3.Ill().l(), var4 - 1.0, var6 - 1.0, var8 + 2.0, var8 + 2.0, var13);
         }
      }
   }

   private Color II(IIIlIlI var1) {
      return var1.Ill().I();
   }

   private double Il(double var1) {
      return Math.max(0.0, Math.min(1.0, var1));
   }

   private IllIlll lI(class_327 var1, IIIlIlI var2, lIllIllI var3, int var4) {
      double var5 = this.lIlI(var1, var2.I(), 1.14);

      class_327 var10000;
      String var10001;
      label60: {
         try {
            var10000 = var1;
            if (var2.I() == null) {
               var10001 = "";
               break label60;
            }
         } catch (IllegalStateException var16) {
            throw IllII(var16);
         }

         var10001 = var2.I();
      }

      double var7 = IlIIlllIl.IIl(var10000, var10001);

      label52: {
         try {
            var10000 = var1;
            if (var2.II() == null) {
               var10001 = "";
               break label52;
            }
         } catch (IllegalStateException var15) {
            throw IllII(var15);
         }

         var10001 = var2.II();
      }

      double var9 = IlIIlllIl.IIl(var10000, var10001);
      double var11 = Math.max(136.0, var4 - 12.0);

      try {
         switch (var3) {
            case I:
               break;
            case lI:
               return new IllIlll(Math.min(var11, IlIIlllIl.IIl(var1, this.I(var2)) + 8.0), 16.0);
            default:
               throw new MatchException(null, null);
         }
      } catch (IllegalStateException var14) {
         throw IllII(var14);
      }

      try {
         if (this.IlII.IllI()) {
            return new IllIlll(Math.max(118.0, Math.min(var11, var5 + 37.0)), 30.0);
         }
      } catch (IllegalStateException var13) {
         throw IllII(var13);
      }

      return new IllIlll(Math.max(136.0, Math.min(var11, Math.max(var7, var9) + 37.0)), 30.0);
   }

   private void ll(class_332 var1, class_310 var2, IIIlIlI var3, IllIlll var4, double var5, double var7, double var9) {
      Boolean var11 = IlIIlllIl.llI(true);

      try {
         this.Ill(var1, var2.field_1772, var3, var4, var5, var7, var9);
      } finally {
         IlIIlllIl.lIllIl(var11);
      }
   }

   private void III(class_332 param1, class_327 param2, String param3, double param4, double param6, int param8, double param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: ifnull 12
      // 04: aload 3
      // 05: invokevirtual java/lang/String.isBlank ()Z
      // 08: ifeq 17
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 11: athrow
      // 12: return
      // 13: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 16: athrow
      // 17: dload 9
      // 19: dconst_1
      // 1a: dsub
      // 1b: invokestatic java/lang/Math.abs (D)D
      // 1e: ldc2_w 0.001
      // 21: dcmpg
      // 22: ifge 36
      // 25: aload 1
      // 26: aload 2
      // 27: aload 3
      // 28: dload 4
      // 2a: dload 6
      // 2c: iload 8
      // 2e: invokestatic k74/x/IlIIlllIl.IIll (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDI)V
      // 31: return
      // 32: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 35: athrow
      // 36: aload 1
      // 37: invokestatic k74/x/IlIIlllIl.IIllll (Lnet/minecraft/class_332;)V
      // 3a: aload 1
      // 3b: dload 4
      // 3d: dload 6
      // 3f: invokestatic k74/x/IlIIlllIl.IlIIlI (Lnet/minecraft/class_332;DD)V
      // 42: aload 1
      // 43: dload 9
      // 45: dload 9
      // 47: invokestatic k74/x/IlIIlllIl.llIIIl (Lnet/minecraft/class_332;DD)V
      // 4a: aload 1
      // 4b: aload 2
      // 4c: aload 3
      // 4d: dconst_0
      // 4e: dconst_0
      // 4f: iload 8
      // 51: invokestatic k74/x/IlIIlllIl.IIll (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDI)V
      // 54: aload 1
      // 55: invokestatic k74/x/IlIIlllIl.lIIIll (Lnet/minecraft/class_332;)V
      // 58: return
   }

   private double IIl(class_327 var1, double var2) {
      return 9.0 * var2;
   }

   private void Ill(class_332 param1, class_327 param2, IIIlIlI param3, IllIlll param4, double param5, double param7, double param9) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 2106594752
      // 003: ldc_w 1136211043
      // 006: ldc_w 580074836
      // 009: ixor
      // 00a: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // 00d: invokestatic k74/x/IIIlIllII.lII (I)I
      // 010: dload 9
      // 012: invokestatic k74/x/IllllllI.III (ID)I
      // 015: istore 11
      // 017: ldc_w 2106594753
      // 01a: ldc_w 1136211043
      // 01d: ldc_w -326352881
      // 020: ixor
      // 021: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // 024: invokestatic k74/x/IIIlIllII.IIII (I)I
      // 027: dload 9
      // 029: invokestatic k74/x/IllllllI.III (ID)I
      // 02c: istore 12
      // 02e: ldc_w 2106594754
      // 031: ldc_w 1136211043
      // 034: ldc_w -174930556
      // 037: ixor
      // 038: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // 03b: invokestatic k74/x/IIIlIllII.lII (I)I
      // 03e: dload 9
      // 040: invokestatic k74/x/IllllllI.III (ID)I
      // 043: istore 13
      // 045: dload 5
      // 047: ldc2_w 29.0
      // 04a: dadd
      // 04b: dstore 14
      // 04d: aload 1
      // 04e: getstatic k74/x/IIIlllIIl.III Lk74/x/IIIllIIl;
      // 051: dload 5
      // 053: dload 7
      // 055: aload 4
      // 057: invokevirtual k74/x/IllIlll.I ()D
      // 05a: aload 4
      // 05c: invokevirtual k74/x/IllIlll.l ()D
      // 05f: bipush 0
      // 060: dload 9
      // 062: invokestatic k74/x/IIIlIllII.Ill (Lnet/minecraft/class_332;Lk74/x/IIIllIIl;DDDDZD)V
      // 065: aload 0
      // 066: aload 1
      // 067: aload 2
      // 068: aload 3
      // 069: dload 5
      // 06b: ldc2_w 10.0
      // 06e: dadd
      // 06f: dload 7
      // 071: aload 4
      // 073: invokevirtual k74/x/IllIlll.l ()D
      // 076: ldc2_w 12.0
      // 079: dsub
      // 07a: ldc2_w 0.5
      // 07d: dmul
      // 07e: dadd
      // 07f: ldc2_w 12.0
      // 082: dload 9
      // 084: invokevirtual k74/x/IIIlllIIl.l (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Lk74/x/IIIlIlI;DDDD)V
      // 087: aload 3
      // 088: invokevirtual k74/x/IIIlIlI.II ()Ljava/lang/String;
      // 08b: astore 16
      // 08d: aload 0
      // 08e: getfield k74/x/IIIlllIIl.IlII Lk74/x/lllIIlII;
      // 091: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 094: checkcast java/lang/Boolean
      // 097: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 09a: ifne 0b8
      // 09d: aload 16
      // 09f: ifnull 0b8
      // 0a2: goto 0a9
      // 0a5: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0a8: athrow
      // 0a9: aload 16
      // 0ab: invokevirtual java/lang/String.isBlank ()Z
      // 0ae: ifeq 135
      // 0b1: goto 0b8
      // 0b4: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: aload 2
      // 0ba: ldc2_w 1.14
      // 0bd: invokevirtual k74/x/IIIlllIIl.IIl (Lnet/minecraft/class_327;D)D
      // 0c0: dstore 17
      // 0c2: aload 0
      // 0c3: aload 2
      // 0c4: aload 3
      // 0c5: invokevirtual k74/x/IIIlIlI.I ()Ljava/lang/String;
      // 0c8: ldc2_w 1.14
      // 0cb: invokevirtual k74/x/IIIlllIIl.lIlI (Lnet/minecraft/class_327;Ljava/lang/String;D)D
      // 0ce: dstore 19
      // 0d0: dconst_0
      // 0d1: aload 4
      // 0d3: invokevirtual k74/x/IllIlll.I ()D
      // 0d6: ldc2_w 37.0
      // 0d9: dsub
      // 0da: invokestatic java/lang/Math.max (DD)D
      // 0dd: dstore 21
      // 0df: dload 14
      // 0e1: dconst_0
      // 0e2: dload 21
      // 0e4: dload 19
      // 0e6: dsub
      // 0e7: ldc2_w 0.5
      // 0ea: dmul
      // 0eb: invokestatic java/lang/Math.max (DD)D
      // 0ee: dadd
      // 0ef: dstore 23
      // 0f1: dload 7
      // 0f3: aload 4
      // 0f5: invokevirtual k74/x/IllIlll.l ()D
      // 0f8: dload 17
      // 0fa: dsub
      // 0fb: ldc2_w 2.0
      // 0fe: ddiv
      // 0ff: dadd
      // 100: dstore 25
      // 102: dload 19
      // 104: dload 21
      // 106: dcmpl
      // 107: ifle 121
      // 10a: aload 0
      // 10b: aload 1
      // 10c: aload 2
      // 10d: aload 3
      // 10e: invokevirtual k74/x/IIIlIlI.I ()Ljava/lang/String;
      // 111: dload 14
      // 113: dload 25
      // 115: dload 21
      // 117: iload 11
      // 119: invokevirtual k74/x/IIIlllIIl.IlIl (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDDI)V
      // 11c: return
      // 11d: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 120: athrow
      // 121: aload 0
      // 122: aload 1
      // 123: aload 2
      // 124: aload 3
      // 125: invokevirtual k74/x/IIIlIlI.I ()Ljava/lang/String;
      // 128: dload 23
      // 12a: dload 25
      // 12c: iload 11
      // 12e: ldc2_w 1.14
      // 131: invokevirtual k74/x/IIIlllIIl.III (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDID)V
      // 134: return
      // 135: aload 0
      // 136: aload 1
      // 137: aload 2
      // 138: aload 3
      // 139: invokevirtual k74/x/IIIlIlI.I ()Ljava/lang/String;
      // 13c: dload 14
      // 13e: dload 7
      // 140: ldc2_w 4.0
      // 143: dadd
      // 144: aload 4
      // 146: invokevirtual k74/x/IllIlll.I ()D
      // 149: ldc2_w 37.0
      // 14c: dsub
      // 14d: iload 11
      // 14f: invokevirtual k74/x/IIIlllIIl.IlIl (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDDI)V
      // 152: aload 0
      // 153: aload 1
      // 154: aload 2
      // 155: aload 3
      // 156: invokevirtual k74/x/IIIlIlI.II ()Ljava/lang/String;
      // 159: dload 14
      // 15b: dload 7
      // 15d: ldc2_w 17.0
      // 160: dadd
      // 161: aload 4
      // 163: invokevirtual k74/x/IllIlll.I ()D
      // 166: ldc2_w 37.0
      // 169: dsub
      // 16a: iload 12
      // 16c: invokevirtual k74/x/IIIlllIIl.IlIl (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDDI)V
      // 16f: return
   }

   private void lII(class_332 var1, double var2, double var4, IllIlll var6, double var7, Runnable var9) {
      double var10 = var2 + var6.I() * 0.5;
      double var12 = var4 + var6.l() * 0.5;
      IIlIlIlIl.lll(var1);

      try {
         IIlIlIlIl.Illll(var1, var10, var12);
         IIlIlIlIl.Il(var1, var7, var7);
         IIlIlIlIl.Illll(var1, -var10, -var12);
         var9.run();
      } finally {
         IIlIlIlIl.lI(var1);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 967717106;
      int var10001 = "Č甼\u171e灜缟揜뜞糼ꜚ掜会秼\uef1f扜⼛皜伞秜㜚湜\u1718旜䜚玼伜澼윚翜眝籼鼟穼뜝篜霜筼ꜚ灼真攜真擜弚眜윘殜\uef1b惜\ue719纜\u171a潼༜粼\ue71e磼✟篜ꜞ摜眞於漟涼漝瓜Ἒ敜꼟砼眜瞼眝紜\ue71a拜꼞瞜\uf71c漜缛摜Ἕ櫼霟抜霛戼圙漜㜜榜\u171b矜\uef1b珜輙揼뼞棜？络霞搼✛猼\udf19暼\u171d禜켙瞜伞璼⼟玼輚煼㼝櫜꼙榜朘窼ܛ掼ꜘ掜蜟粼윚悜？畜朝纼\udf1e於弜瘼蜛戜✞汜圛朜켙押眞缼\uef1a汼\ue71d橜\udf1d梼켟泜会粜？毼\u171b惜䜜槼輞棼䜘慜眘灼漟縜眝犼望磼\u171c篜\ue71a獜漞爼뼛掼蜞睜윙汜꼚羜켚杜圜琼뼘扼\uef19敜꼟篜霘氼\u171a洜漚歜⼝缼＜繼鼛恜蜞於\u1f1e焜真澜㜙検ܟ磼㼛栜缛眜꼚扼䜘懜缜楜꼜紼켙缜漝歜\ue71e瓜圝玼霟愼㜚猼朝果霝惜켘氜眜烜윛嚜鼖䒼霗妼鼐噼鼔咼圕凼㼗\u0015鬇觢與쇦觧臣葧䇡鳇\ue1e5鿧\ue9e5龇懧鳧䧢貧ꇡ蘧釤逇"
         .length();
      int var11 = 0;
      int var8 = var10001;
      String var7 = "Č甼\u171e灜缟揜뜞糼ꜚ掜会秼\uef1f扜⼛皜伞秜㜚湜\u1718旜䜚玼伜澼윚翜眝籼鼟穼뜝篜霜筼ꜚ灼真攜真擜弚眜윘殜\uef1b惜\ue719纜\u171a潼༜粼\ue71e磼✟篜ꜞ摜眞於漟涼漝瓜Ἒ敜꼟砼眜瞼眝紜\ue71a拜꼞瞜\uf71c漜缛摜Ἕ櫼霟抜霛戼圙漜㜜榜\u171b矜\uef1b珜輙揼뼞棜？络霞搼✛猼\udf19暼\u171d禜켙瞜伞璼⼟玼輚煼㼝櫜꼙榜朘窼ܛ掼ꜘ掜蜟粼윚悜？畜朝纼\udf1e於弜瘼蜛戜✞汜圛朜켙押眞缼\uef1a汼\ue71d橜\udf1d梼켟泜会粜？毼\u171b惜䜜槼輞棼䜘慜眘灼漟縜眝犼望磼\u171c篜\ue71a獜漞爼뼛掼蜞睜윙汜꼚羜켚杜圜琼뼘扼\uef19敜꼟篜霘氼\u171a洜漚歜⼝缼＜繼鼛恜蜞於\u1f1e焜真澜㜙検ܟ磼㼛栜缛眜꼚扼䜘懜缜楜꼜紼켙缜漝歜\ue71e瓜圝玼霟愼㜚猼朝果霝惜켘氜眜烜윛嚜鼖䒼霗妼鼐噼鼔咼圕凼㼗\u0015鬇觢與쇦觧臣葧䇡鳇\ue1e5鿧\ue9e5龇懧鳧䧢貧ꇡ蘧釤逇";
      String[] var9 = new String[2];
      short var12 = 4257;
      int var10 = 0;

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      lIII = var9;
      lIIl = new Object[var9.length];
      int var20 = 0;
      int var24 = 0;
      Illl = new int[310];
      byte[] var10002 = "}¢\u008d4\u008cEº,|/ïcµM[ûÁ4\u0013:\u0000-\u0000\u008dËÀ¯Z\"«ÚÉ¬\u0002cbb\u001d\u001e\u0010{\u0003\u009b°Ã¬D6÷¼:34M\u0000\u008dp\u0012±½\n\u0083\u000f7ÄfÞöNb(\u0096\u009e\u0096÷\u0094côq\u001d\u0017\u0089\u0093 ö\u0099ÿ)X!\u0081Ã\u001clõ\u001cZD²·ûvîàpã\u0088zmöØ>Ã¸Idåv#&»'Iº¨î\u0001%~v\u0087ì\u008e\tí¢@4£\u008b¿=¸¡Ë\u001bEÕÆ5¤5Oî\u001au\u009aó6@v8|*,ÎÓ,Ùs\u0093?D\u008fãêþ;þ>\u009dx\u009c£ª\u000bu#\u0000Ý\u001a\u00ad0ýÏÎ×g\u0003\u00adáÕqô:áU\u0094lÒ\u008eðàf-4Xk\u0085ãï\u0003ºS°«&\u001f\u0011GÝ?\u009båÎ\u0092µæ\u0098|cB\u0098åÌl5\u000f\u000bxFÝNÛéþÕíó\u0014òtì?âf\u0011á\u0019\u0007\u0080\u008a\u008e\u008dÍªð]dîö> ¾\u0003\u0002,\u0082Ê\u0007\u0098Q\u0016BÙÄ±\u0090øqWÂ=7cü\fÎ÷`Ìx_Øí\u009br«\u000e\n\t7Å\u0090H6HRvÞl¡Ê\u007fù¿Âss½\u0012\u000fØ3®ÛX\u0010\u0092ÀÂ°i5÷@Ö³\u0083\u0092ÑP}}\b\u009b\u0095Ò¦Ö%\u0094¿SA]\u008d)Zö{7\u0086N\u0097F[Zkõººµ\u0013ª(èÌº²èÊÔÅ\u0002\u0096/I\u00824iP`¥½\u008eãB\u0091:ï8®Ý$K\u009f,jp\u0095ò«GgÝäà»ÎIË\u001d¼n&¥;\u0093é¸fê0²´m] \u00876Ûl|áG«æ·>u\\´:bC9÷ä3\u0094Û\u0080a\u0017\u0091ªÞ\u009cB]×ëÁÛ(Ù\u009fz\r'(6ôÐÞÿ\u0081_Ù\u0003i\u0085k\u0082§À\u001f\\auK¬)W]~B¹£Ôßi§\u0088\u0011KµF\u009dN]çås\u008eÛ¿á0¬\u0001fÄuM\u0095Ç¤\u0088\u009d] \u001774v'ÉRë¥\u0098Ûää;Ü\u008e4m¦ðpC\u001ec\u0018bÇ\u0000\u0090ntoP\rBvs^¸\f\u0018m\u009a\u001c\u0012FU\u0018T¨,\u001d1\u007f÷Í\u0004üá\u0093ùRkÃ`níæ\u0083'·Ô)öF³\u0080ù\u000f\b\u0003 ôëâ¨¼~ê\u0005ô ø5®÷u\u001c\u0083é\u009e\u0086\u0099ï\u0004\u00064¾ý\u000eAÃ0/\u007f#.\ré\u008fÙ\u0091e!¢>oÃ\u0000\u0090ýcü\u0092¢¬\u0010µ\u000e\u008d¯Ö¢*Wÿb(`°Í\u0002û5\u0001J´¦ÙÂòàõ\u0092 \"Å\u0082\u001a_í+oNV!qù\u0013Yr\u0013\u0089\u007fWy\u0091\u0098\u001côï¼°y_Za¶e5\u0090®Z0S&ñæ\u0014\u0092ñ\u0095sd}Þ\u0095eÏY\u009büu\u0095Ûá\u00ad¦ I¾zCÈ\u001e\u001fÛ3ÍUpXl\u0090`Ð\b+úOÐÖ\u009a\u009fée(s\u0006\u008a\u0085¶]¿EÒÌ©\u009a½-\u007f>\u0086\u0016\r\u009dp\u008c\u0014_nç·º\u0085:¯\u0095³\fØÙÞêÒçA\u009cM1\u001b\u0082ë-=i\u007f\u0015\u0007»\u0002ü;PO\\ÆÝÁÅq92¢)'\u0086Ê\u001b-¬à Kð\u0083C\u0088\u0013hõ\u0012\u0006mÐ\r\u009flÁ\u0098ú\u0093\u0002Ï<Áí\u001f$Nä¡\u009a+¥x@\\Ñ#\b¹íDÛ\u0019t_¢t\u0000I±ÁÕO\u0095\u0014J\u008b~\u0083\u0097×ùA?bF\u009aµJ\u0019ò*¾2\u0082®.\u0003I\u0088·lj¨\u0088\u0019Ôû\u0092ß)¾Ç»ìx¯\u008a\u008eæ\u0019°DD[qXB%õ7\u0089[-G\u000f%`\u009c\u008dr52\u009a+\u0093\u0001\u0097\u0013¼þ\u001bÊ\u0011ø8\u0019v3wÉõjtÉï¼\u0013¿È\u001bç\u0000~6Â\u009aû\"N\u009a\u0001\u0081¿#\u0094\u008d\u0004\u001dúýç \u0006¶k\u0089\u0002°x\u0014\u009dr$ímï\u009d*\u008cI\u00120\u008f¬þåR\u008e\u0089mé·luhé\u0083ü\u009a\u009bÇ¸Z>Ò\u0084t=\u008f·á\u0002ö\u0018pLXÊ\u001fyÜ¿\u0015\u0081\u0006\u0002¢é}@¥Y©Z2\"F©[\u008e\u009b{%¤\u0001=¼pü«·{\u0013\u0018nýÀ\u00048\u008cµë©å\u0006Ñj~è\u009ay%\u0002\u001c´\u0090\u0099OAúàp\u008dÓ3ñÎ#uL\u0014ÍN$1ª~\u0097àq¬E;óì dÊ\u001f_t\u0096\u008f\u009e7\u0091\u001b\u0083ç\u001bý\u0096\u0012Ø\u0091\u0003\u009dx\u00836¯©"
         .getBytes("ISO-8859-1");

      int var55;
      do {
         Illl[var20] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ -1330060729;
         var20 += 1;
         var55 = var24 + 4;
         var24 += 4;
      } while (var55 < var10002.length);

      String[] var5 = new String[Illll(2106594772, var17 ^ 926815946)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIIII((byte)52, -1938247548, 37, 7090, -2132015081, (short)-10028)).length();
      int var1 = Illll(2106594773, var17 ^ 300973230);
      int var19 = -1;

      label92:
      while (true) {
         var20 = Illll(2106594774, var17 ^ 1335956722);
         String var27 = var2.substring(++var19, var19 + var1);
         byte var39 = -1;

         while (true) {
            label87: {
               char[] var57 = var27.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var20;
               var44 = var57;
               var24 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var20;
                  var88 = var6;
               } else {
                  var55 = var20;
                  var24 = var69;
                  if (var69 <= var6) {
                     break label87;
                  }

                  var81 = var57;
                  var69 = var20;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % Illll(2106594794, var17 ^ -1263338493)) {
                     case 0 -> Illll(2106594795, var17 ^ 1270605627);
                     case 1 -> Illll(2106594796, var17 ^ 1067260126);
                     case 2 -> Illll(2106594797, var17 ^ 850655588);
                     case 3 -> Illll(2106594798, var17 ^ -1150793949);
                     case 4 -> Illll(2106594799, var17 ^ 1853188887);
                     case 5 -> Illll(2106594784, var17 ^ -2101468274);
                     default -> Illll(2106594785, var17 ^ -666333578);
                  });
                  var6++;
                  if (var55 == 0) {
                     var88 = var55;
                     var81 = var44;
                     var69 = var55;
                  } else {
                     if (var24 <= var6) {
                        break;
                     }

                     var81 = var44;
                     var69 = var55;
                     var88 = var6;
                  }
               }
            }

            String var62 = new String(var44).intern();
            switch (var39) {
               case 0:
                  var5[var3++] = var62;
                  if ((var19 += var1) >= var4) {
                     II = var5;
                     ll = new String[Illll(2106594793, var17 ^ 2056237617)];
                     var20 = Illll(2106594786, var17 ^ 771050752);
                     III = IIIllIIl.II;
                     lll = IlIIllIII.Ill(IlII(var20, Illll(2106594787, var17 ^ -1341544251)));
                     lI = IlIIllIII.Ill(IlII(Illll(2106594788, var17 ^ 180166669), Illll(2106594789, var17 ^ 1778292220)));
                     IllI = IlIIllIII.Ill(IlII(Illll(2106594790, var17 ^ 1586342683), Illll(2106594791, var17 ^ -195346508)));
                     lII = IlIIllIII.Ill(IlII(Illll(2106594808, var17 ^ -998567448), Illll(2106594809, var17 ^ 601958058)));
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var62;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label92;
                  }

                  var4 = (var2 = lIIII((byte)-33, -1938247547, 15, (short)25154, 1777160125, (short)-14823)).length();
                  var1 = Illll(2106594775, var17 ^ 1550343811);
                  var19 = -1;
            }

            var20 = Illll(2106594792, var17 ^ -1963926875);
            var27 = var2.substring(++var19, var19 + var1);
            var39 = 0;
         }
      }
   }

   public IIIlllIIl(IlIIl var1) {
      int var2 = -1526359561;
      super(
         IlIIllIII.Ill(IlII(Illll(2106594755, var2 ^ -1417596116), Illll(2106594756, var2 ^ 1617829137))),
         lllIIlIl.II,
         IlIIllIII.Ill(IlII(Illll(2106594757, var2 ^ 1549825934), Illll(2106594758, var2 ^ -406795394)))
      );
      this.IIIl = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IlII(Illll(2106594759, var2 ^ 1655601197), Illll(2106594776, var2 ^ 1404344090))), lIllIllI.class, lIllIllI.lI)
      );
      this.IlII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IlII(Illll(2106594777, var2 ^ 642736028), Illll(2106594778, var2 ^ -155477522))), false));
      this.lIl = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IlII(Illll(2106594779, var2 ^ 198772226), Illll(2106594780, var2 ^ 2141486646))), 2.0, 1.0, 10.0, 0.5)
            .IIIl(IlIIllIII.Ill(IlII(Illll(2106594781, var2 ^ -1632335832), Illll(2106594782, var2 ^ 806119342))))
      );
      this.IIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IlII(Illll(2106594783, var2 ^ 1950450180), Illll(2106594768, var2 ^ 845766828))), true));
      this.Ill = new HashMap<>();
      this.IlII.lIlI(this::lll);
      this.IlIllIl(true);
   }

   private double lIl(IIIlIlI var1, long var2, long var4) {
      return this.lllI((double)(var2 - var1.IlI()) / var4);
   }

   @Override
   public void llIl() {
      IlIlIllII.l().lI();
      this.Ill.clear();
      this.Il = 0L;
   }

   private static class_2960 llI(IIIlIlIl var0) {
      return class_2960.method_60655(lll.llIl(), var0.llIl());
   }

   private boolean lll() {
      try {
         if (this.IIIl.IllI() == lIllIllI.lI) {
            return true;
         }
      } catch (IllegalStateException var1) {
         throw IllII(var1);
      }

      return false;
   }

   private void IIII(class_332 var1, class_327 var2, IIIlIlI var3, IllIlll var4, double var5, double var7, double var9) {
      double var10000;
      label38: {
         try {
            if (var4.l() * var9 <= 6.0) {
               var10000 = 0.0;
               break label38;
            }
         } catch (IllegalStateException var18) {
            throw IllII(var18);
         }

         var10000 = var4.l() * var9;
      }

      double var11 = var10000;

      try {
         if (var11 <= 0.0) {
            return;
         }
      } catch (IllegalStateException var17) {
         throw IllII(var17);
      }

      double var13 = var7 + var4.l() - var11;
      int var15 = IIIlllII.l(Illll(2106594769, 196162716 ^ 1022342453), (int)Math.round(255.0 * Math.max(0.0, var9 - 0.5)));

      try {
         this.IIIll(var1, var5, var13, var4.I(), var11, var9);
         if ((var15 >>> Illll(2106594770, 196162716 ^ -1233464433) & Illll(2106594771, 196162716 ^ -1418754327)) > 0) {
            IlIIlllIl.lIIll(var1, var2, this.I(var3), var5, var13, var4.I(), var11, var15);
         }
      } catch (IllegalStateException var16) {
         throw IllII(var16);
      }
   }

   private long IIIl(IIIlIlI var1) {
      return var1.ll();
   }

   private static String lIIII(byte var0, int var1, byte var2, short var3, int var4, short var5) {
      int var10 = var1 ^ -1938247548;
      char[] var9 = lIII[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])lIIl[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         lIIl[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 51087;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 11) {
            default -> 105;
            case 1 -> 36;
            case 2 -> 145;
            case 3 -> 127;
            case 4 -> 24;
            case 5 -> 47;
            case 6 -> 221;
            case 7 -> 112;
            case 8 -> 38;
            case 9 -> 147;
            case 10 -> 17;
         } ^ var8 ^ 38607 ^ var4 ^ var5 ^ var7 ^ var0 ^ var2 ^ var1 ^ var3);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   private static int Illll(int var0, int var1) {
      int var2 = Illl[var0 ^ 2106594760] ^ var1 ^ var0;
      var2 ^= 48699;
      var2 -= 2164;
      var2 -= 10119;
      var2 -= 7047;
      var2 ^= 52221;
      var2 ^= 61784;
      return var2 + 7736;
   }

   private double IIlI(IIIlIlI var1, long var2, long var4) {
      double var6 = this.lIl(var1, var2, var4);
      double var8 = this.lIll(var1, var2, var4);
      return (0.9 + 0.1 * var6) * (0.96 + 0.04 * var8);
   }

   private void IIll(class_332 param1, class_310 param2, List<IIIlIlI> param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 1
      // 001: invokestatic k74/x/IIlIlIlIl.lll (Lnet/minecraft/class_332;)V
      // 004: aload 1
      // 005: dconst_0
      // 006: dconst_0
      // 007: ldc2_w 1000.0
      // 00a: invokestatic k74/x/IIlIlIlIl.lIIlI (Lnet/minecraft/class_332;DDD)V
      // 00d: aload 0
      // 00e: getfield k74/x/IIIlllIIl.IIIl Lk74/x/IllIII;
      // 011: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 014: checkcast k74/x/lIllIllI
      // 017: astore 5
      // 019: invokestatic java/lang/System.currentTimeMillis ()J
      // 01c: lstore 6
      // 01e: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 021: aload 0
      // 022: lload 6
      // 024: invokevirtual k74/x/IIIlllIIl.IllIl (J)D
      // 027: dstore 8
      // 029: astore 4
      // 02b: dconst_0
      // 02c: dstore 10
      // 02e: aload 2
      // 02f: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 032: invokevirtual net/minecraft/class_1041.method_4486 ()I
      // 035: istore 12
      // 037: aload 2
      // 038: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 03b: invokevirtual net/minecraft/class_1041.method_4502 ()I
      // 03e: istore 13
      // 040: new java/util/HashSet
      // 043: dup
      // 044: invokespecial java/util/HashSet.<init> ()V
      // 047: astore 14
      // 049: aload 3
      // 04a: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 04f: astore 15
      // 051: aload 15
      // 053: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 058: ifeq 1e2
      // 05b: aload 15
      // 05d: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 062: checkcast k74/x/IIIlIlI
      // 065: astore 16
      // 067: aload 0
      // 068: aload 16
      // 06a: lload 6
      // 06c: aload 5
      // 06e: invokevirtual k74/x/lIllIllI.I ()J
      // 071: invokevirtual k74/x/IIIlllIIl.IIIIl (Lk74/x/IIIlIlI;JJ)D
      // 074: dstore 17
      // 076: dload 17
      // 078: ldc2_w 0.01
      // 07b: dcmpg
      // 07c: ifgt 08b
      // 07f: aload 4
      // 081: ifnull 051
      // 084: goto 08b
      // 087: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 08a: athrow
      // 08b: aload 0
      // 08c: aload 16
      // 08e: invokevirtual k74/x/IIIlllIIl.IIIl (Lk74/x/IIIlIlI;)J
      // 091: lstore 19
      // 093: aload 14
      // 095: lload 19
      // 097: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 09a: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 09f: pop
      // 0a0: aload 0
      // 0a1: aload 2
      // 0a2: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 0a5: aload 16
      // 0a7: aload 5
      // 0a9: iload 12
      // 0ab: invokevirtual k74/x/IIIlllIIl.lI (Lnet/minecraft/class_327;Lk74/x/IIIlIlI;Lk74/x/lIllIllI;I)Lk74/x/IllIlll;
      // 0ae: astore 21
      // 0b0: aload 0
      // 0b1: aload 16
      // 0b3: lload 6
      // 0b5: aload 5
      // 0b7: invokevirtual k74/x/lIllIllI.I ()J
      // 0ba: invokevirtual k74/x/IIIlllIIl.lIl (Lk74/x/IIIlIlI;JJ)D
      // 0bd: dstore 22
      // 0bf: iload 13
      // 0c1: i2d
      // 0c2: dload 10
      // 0c4: ldc2_w 18.0
      // 0c7: dadd
      // 0c8: aload 21
      // 0ca: invokevirtual k74/x/IllIlll.l ()D
      // 0cd: dadd
      // 0ce: dsub
      // 0cf: dstore 24
      // 0d1: aload 0
      // 0d2: lload 19
      // 0d4: dload 24
      // 0d6: dload 17
      // 0d8: dload 8
      // 0da: invokevirtual k74/x/IIIlllIIl.lIIl (JDDD)D
      // 0dd: dstore 26
      // 0df: aload 0
      // 0e0: aload 16
      // 0e2: lload 6
      // 0e4: aload 5
      // 0e6: invokevirtual k74/x/lIllIllI.I ()J
      // 0e9: invokevirtual k74/x/IIIlllIIl.IIlI (Lk74/x/IIIlIlI;JJ)D
      // 0ec: dstore 30
      // 0ee: aload 5
      // 0f0: invokevirtual k74/x/lIllIllI.ordinal ()I
      // 0f3: lookupswitch 145 2 0 25 1 85
      // 10c: iload 12
      // 10e: i2d
      // 10f: aload 21
      // 111: invokevirtual k74/x/IllIlll.I ()D
      // 114: dsub
      // 115: ldc2_w 5.0
      // 118: dsub
      // 119: dconst_1
      // 11a: dload 22
      // 11c: dsub
      // 11d: ldc2_w 34.0
      // 120: dmul
      // 121: dadd
      // 122: dstore 28
      // 124: aload 0
      // 125: aload 1
      // 126: dload 28
      // 128: dload 26
      // 12a: aload 21
      // 12c: dload 30
      // 12e: aload 0
      // 12f: aload 1
      // 130: aload 2
      // 131: aload 16
      // 133: aload 21
      // 135: dload 28
      // 137: dload 26
      // 139: dload 17
      // 13b: invokedynamic run (Lk74/x/IIIlllIIl;Lnet/minecraft/class_332;Lnet/minecraft/class_310;Lk74/x/IIIlIlI;Lk74/x/IllIlll;DDD)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, k74/x/IIIlllIIl.ll (Lnet/minecraft/class_332;Lnet/minecraft/class_310;Lk74/x/IIIlIlI;Lk74/x/IllIlll;DDD)V, ()V ]
      // 140: invokevirtual k74/x/IIIlllIIl.lII (Lnet/minecraft/class_332;DDLk74/x/IllIlll;DLjava/lang/Runnable;)V
      // 143: aload 4
      // 145: ifnull 1cd
      // 148: iload 12
      // 14a: i2d
      // 14b: aload 21
      // 14d: invokevirtual k74/x/IllIlll.I ()D
      // 150: dsub
      // 151: ldc2_w 5.0
      // 154: dsub
      // 155: dconst_1
      // 156: dload 22
      // 158: dsub
      // 159: ldc2_w 20.0
      // 15c: dmul
      // 15d: dadd
      // 15e: dstore 28
      // 160: aload 0
      // 161: aload 1
      // 162: dload 28
      // 164: dload 26
      // 166: aload 21
      // 168: dload 30
      // 16a: aload 0
      // 16b: aload 1
      // 16c: aload 2
      // 16d: aload 16
      // 16f: aload 21
      // 171: dload 28
      // 173: dload 26
      // 175: dload 17
      // 177: invokedynamic run (Lk74/x/IIIlllIIl;Lnet/minecraft/class_332;Lnet/minecraft/class_310;Lk74/x/IIIlIlI;Lk74/x/IllIlll;DDD)Ljava/lang/Runnable; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()V, k74/x/IIIlllIIl.IIIII (Lnet/minecraft/class_332;Lnet/minecraft/class_310;Lk74/x/IIIlIlI;Lk74/x/IllIlll;DDD)V, ()V ]
      // 17c: invokevirtual k74/x/IIIlllIIl.lII (Lnet/minecraft/class_332;DDLk74/x/IllIlll;DLjava/lang/Runnable;)V
      // 17f: aload 4
      // 181: ifnull 1cd
      // 184: new java/lang/IllegalStateException
      // 187: dup
      // 188: ldc_w 2106594810
      // 18b: ldc_w 902793214
      // 18e: ldc_w 422713538
      // 191: ixor
      // 192: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // 195: ldc_w 2106594811
      // 198: ldc_w 902793214
      // 19b: ldc_w -1039755814
      // 19e: ixor
      // 19f: invokestatic k74/x/IIIlllIIl.Illll (II)I
      // 1a2: invokestatic k74/x/IIIlllIIl.IlII (II)Ljava/lang/String;
      // 1a5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1a8: aload 5
      // 1aa: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 1ad: astore 34
      // 1af: astore 33
      // 1b1: new java/lang/StringBuilder
      // 1b4: dup
      // 1b5: invokespecial java/lang/StringBuilder.<init> ()V
      // 1b8: aload 33
      // 1ba: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1bd: aload 34
      // 1bf: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1c2: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1c5: invokespecial java/lang/IllegalStateException.<init> (Ljava/lang/String;)V
      // 1c8: athrow
      // 1c9: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1cc: athrow
      // 1cd: dload 10
      // 1cf: aload 21
      // 1d1: invokevirtual k74/x/IllIlll.l ()D
      // 1d4: aload 5
      // 1d6: invokevirtual k74/x/lIllIllI.Il ()D
      // 1d9: dadd
      // 1da: dadd
      // 1db: dstore 10
      // 1dd: aload 4
      // 1df: ifnull 051
      // 1e2: aload 0
      // 1e3: getfield k74/x/IIIlllIIl.Ill Ljava/util/Map;
      // 1e6: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 1eb: aload 14
      // 1ed: invokedynamic test (Ljava/util/Set;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IIIlllIIl.IIlII (Ljava/util/Set;Ljava/lang/Long;)Z, (Ljava/lang/Long;)Z ]
      // 1f2: invokeinterface java/util/Set.removeIf (Ljava/util/function/Predicate;)Z 2
      // 1f7: pop
      // 1f8: aload 1
      // 1f9: invokestatic k74/x/IIlIlIlIl.lI (Lnet/minecraft/class_332;)V
      // 1fc: goto 208
      // 1ff: astore 32
      // 201: aload 1
      // 202: invokestatic k74/x/IIlIlIlIl.lI (Lnet/minecraft/class_332;)V
      // 205: aload 32
      // 207: athrow
      // 208: return
   }

   private static String IlII(int var0, int var1) {
      int var9 = -1544275479;
      int var2 = (var0 ^ Illll(2106594812, var9 ^ 34494912)) & Illll(2106594813, var9 ^ -1900315720);
      if (ll[var2] == null) {
         char[] var3 = II[var2].toCharArray();

         int var4 = switch (var3[0] & Illll(2106594814, var9 ^ 918017644)) {
            case 0 -> Illll(2106594815, var9 ^ -2116030944);
            case 1 -> Illll(2106594800, var9 ^ -562596456);
            case 2 -> Illll(2106594801, var9 ^ 2140899691);
            case 3 -> Illll(2106594802, var9 ^ -180773551);
            case 4 -> Illll(2106594803, var9 ^ -616902886);
            case 5 -> Illll(2106594804, var9 ^ 228510848);
            case 6 -> Illll(2106594805, var9 ^ -1565498435);
            case 7 -> Illll(2106594806, var9 ^ 1705252116);
            case 8 -> Illll(2106594807, var9 ^ 537378274);
            case 9 -> Illll(2106594696, var9 ^ -1154375492);
            case 10 -> 3;
            case 11 -> Illll(2106594697, var9 ^ -1666662514);
            case 12 -> Illll(2106594698, var9 ^ -1933949519);
            case 13 -> Illll(2106594699, var9 ^ 2010895140);
            case 14 -> Illll(2106594700, var9 ^ -531522038);
            case 15 -> Illll(2106594701, var9 ^ -1635698835);
            case 16 -> 5;
            case 17 -> Illll(2106594702, var9 ^ -1729989409);
            case 18 -> Illll(2106594703, var9 ^ 1843296858);
            case 19 -> Illll(2106594688, var9 ^ -1529099214);
            case 20 -> Illll(2106594689, var9 ^ 2023656843);
            case 21 -> Illll(2106594690, var9 ^ -548623449);
            case 22 -> Illll(2106594691, var9 ^ 958294384);
            case 23 -> Illll(2106594692, var9 ^ 220223668);
            case 24 -> Illll(2106594693, var9 ^ -1715692892);
            case 25 -> Illll(2106594694, var9 ^ 822393276);
            case 26 -> Illll(2106594695, var9 ^ 477584769);
            case 27 -> Illll(2106594712, var9 ^ 1743491573);
            case 28 -> Illll(2106594713, var9 ^ 652876733);
            case 29 -> 1;
            case 30 -> Illll(2106594714, var9 ^ 402798727);
            case 31 -> Illll(2106594715, var9 ^ -1532776624);
            case 32 -> Illll(2106594716, var9 ^ -1397807151);
            case 33 -> Illll(2106594717, var9 ^ 2094238819);
            case 34 -> Illll(2106594718, var9 ^ -1073280095);
            case 35 -> Illll(2106594719, var9 ^ -65235299);
            case 36 -> Illll(2106594704, var9 ^ 132752255);
            case 37 -> Illll(2106594705, var9 ^ -1200629765);
            case 38 -> Illll(2106594706, var9 ^ -1081332849);
            case 39 -> Illll(2106594707, var9 ^ 1715978715);
            case 40 -> Illll(2106594708, var9 ^ -938838519);
            case 41 -> Illll(2106594709, var9 ^ -779152083);
            case 42 -> 0;
            case 43 -> Illll(2106594710, var9 ^ -470479152);
            case 44 -> Illll(2106594711, var9 ^ 367776268);
            case 45 -> Illll(2106594728, var9 ^ -107344108);
            case 46 -> Illll(2106594729, var9 ^ 86634190);
            case 47 -> Illll(2106594730, var9 ^ -607125920);
            case 48 -> Illll(2106594731, var9 ^ -2045710600);
            case 49 -> Illll(2106594732, var9 ^ -2045345217);
            case 50 -> Illll(2106594733, var9 ^ 1816820141);
            case 51 -> Illll(2106594734, var9 ^ -320324230);
            case 52 -> Illll(2106594735, var9 ^ 242871864);
            case 53 -> Illll(2106594720, var9 ^ -1918975336);
            case 54 -> Illll(2106594721, var9 ^ -2115700019);
            case 55 -> Illll(2106594722, var9 ^ 1251462322);
            case 56 -> Illll(2106594723, var9 ^ 78431005);
            case 57 -> Illll(2106594724, var9 ^ -979684362);
            case 58 -> Illll(2106594725, var9 ^ -1975718017);
            case 59 -> Illll(2106594726, var9 ^ 655838777);
            case 60 -> Illll(2106594727, var9 ^ 16445768);
            case 61 -> Illll(2106594744, var9 ^ -46797804);
            case 62 -> Illll(2106594745, var9 ^ -2064849839);
            case 63 -> Illll(2106594746, var9 ^ 58848062);
            case 64 -> Illll(2106594747, var9 ^ 1476870141);
            case 65 -> Illll(2106594748, var9 ^ -1885603770);
            case 66 -> Illll(2106594749, var9 ^ -639491187);
            case 67 -> Illll(2106594750, var9 ^ -622448176);
            case 68 -> Illll(2106594751, var9 ^ 1462480939);
            case 69 -> Illll(2106594736, var9 ^ -100150166);
            case 70 -> Illll(2106594737, var9 ^ 2035153181);
            case 71 -> Illll(2106594738, var9 ^ -224523876);
            case 72 -> Illll(2106594739, var9 ^ -2061662036);
            case 73 -> Illll(2106594740, var9 ^ -1220334369);
            case 74 -> Illll(2106594741, var9 ^ 1240752847);
            case 75 -> Illll(2106594742, var9 ^ -1107121250);
            case 76 -> Illll(2106594743, var9 ^ 822433203);
            case 77 -> Illll(2106594632, var9 ^ -340274002);
            case 78 -> Illll(2106594633, var9 ^ -1362950014);
            case 79 -> Illll(2106594634, var9 ^ 462944443);
            case 80 -> Illll(2106594635, var9 ^ 964766388);
            case 81 -> Illll(2106594636, var9 ^ -679509977);
            case 82 -> Illll(2106594637, var9 ^ 125557936);
            case 83 -> Illll(2106594638, var9 ^ 627642944);
            case 84 -> Illll(2106594639, var9 ^ 545371313);
            case 85 -> Illll(2106594624, var9 ^ 491949499);
            case 86 -> Illll(2106594625, var9 ^ -1880294912);
            case 87 -> Illll(2106594626, var9 ^ 135799183);
            case 88 -> Illll(2106594627, var9 ^ -82055105);
            case 89 -> Illll(2106594628, var9 ^ -209586674);
            case 90 -> Illll(2106594629, var9 ^ 1508385447);
            case 91 -> 4;
            case 92 -> Illll(2106594630, var9 ^ -1483818807);
            case 93 -> Illll(2106594631, var9 ^ -167266411);
            case 94 -> Illll(2106594648, var9 ^ 1426119356);
            case 95 -> Illll(2106594649, var9 ^ 58369656);
            case 96 -> Illll(2106594650, var9 ^ 767702272);
            case 97 -> Illll(2106594651, var9 ^ 203118242);
            case 98 -> Illll(2106594652, var9 ^ 11025521);
            case 99 -> Illll(2106594653, var9 ^ 1671307389);
            case 100 -> Illll(2106594654, var9 ^ 811882702);
            case 101 -> Illll(2106594655, var9 ^ 54939485);
            case 102 -> Illll(2106594640, var9 ^ 680086669);
            case 103 -> Illll(2106594641, var9 ^ -957329814);
            case 104 -> Illll(2106594642, var9 ^ 288070408);
            case 105 -> Illll(2106594643, var9 ^ -1841446742);
            case 106 -> Illll(2106594644, var9 ^ 1018664955);
            case 107 -> Illll(2106594645, var9 ^ 3256902);
            case 108 -> Illll(2106594646, var9 ^ 1231782024);
            case 109 -> Illll(2106594647, var9 ^ -1734678671);
            case 110 -> Illll(2106594664, var9 ^ -1747755810);
            case 111 -> Illll(2106594665, var9 ^ 1311291552);
            case 112 -> Illll(2106594666, var9 ^ -966775423);
            case 113 -> Illll(2106594667, var9 ^ 1797846107);
            case 114 -> Illll(2106594668, var9 ^ 1534239099);
            case 115 -> Illll(2106594669, var9 ^ 1918877032);
            case 116 -> Illll(2106594670, var9 ^ -398083198);
            case 117 -> Illll(2106594671, var9 ^ 1760094720);
            case 118 -> Illll(2106594656, var9 ^ 1620938840);
            case 119 -> Illll(2106594657, var9 ^ 1101232003);
            case 120 -> Illll(2106594658, var9 ^ 1664474285);
            case 121 -> Illll(2106594659, var9 ^ -4623645);
            case 122 -> Illll(2106594660, var9 ^ 1353947084);
            case 123 -> Illll(2106594661, var9 ^ -31377629);
            case 124 -> Illll(2106594662, var9 ^ -58787667);
            case 125 -> Illll(2106594663, var9 ^ -606938860);
            case 126 -> Illll(2106594680, var9 ^ -1199669617);
            case 127 -> Illll(2106594681, var9 ^ -1849787244);
            case 128 -> Illll(2106594682, var9 ^ -569290349);
            case 129 -> Illll(2106594683, var9 ^ 1541216727);
            case 130 -> Illll(2106594684, var9 ^ -939158330);
            case 131 -> Illll(2106594685, var9 ^ -1909866158);
            case 132 -> Illll(2106594686, var9 ^ 1276761117);
            case 133 -> Illll(2106594687, var9 ^ 825326934);
            case 134 -> Illll(2106594672, var9 ^ 545945068);
            case 135 -> Illll(2106594673, var9 ^ -1748039056);
            case 136 -> Illll(2106594674, var9 ^ 2102733827);
            case 137 -> Illll(2106594675, var9 ^ 390974334);
            case 138 -> Illll(2106594676, var9 ^ -1707873650);
            case 139 -> Illll(2106594677, var9 ^ 394463505);
            case 140 -> Illll(2106594678, var9 ^ -658939596);
            case 141 -> Illll(2106594679, var9 ^ -1064934157);
            case 142 -> Illll(2106594568, var9 ^ 1210954479);
            case 143 -> Illll(2106594569, var9 ^ -64108960);
            case 144 -> Illll(2106594570, var9 ^ 178358791);
            case 145 -> Illll(2106594571, var9 ^ 185797284);
            case 146 -> Illll(2106594572, var9 ^ -1834367270);
            case 147 -> Illll(2106594573, var9 ^ -1888358315);
            case 148 -> Illll(2106594574, var9 ^ 660745230);
            case 149 -> Illll(2106594575, var9 ^ -1497215760);
            case 150 -> Illll(2106594560, var9 ^ 1561396817);
            case 151 -> Illll(2106594561, var9 ^ 917553972);
            case 152 -> Illll(2106594562, var9 ^ -1093370028);
            case 153 -> Illll(2106594563, var9 ^ 554467912);
            case 154 -> Illll(2106594564, var9 ^ -248172045);
            case 155 -> Illll(2106594565, var9 ^ 500881854);
            case 156 -> Illll(2106594566, var9 ^ -662573971);
            case 157 -> Illll(2106594567, var9 ^ -1139737269);
            case 158 -> Illll(2106594584, var9 ^ -739169352);
            case 159 -> Illll(2106594585, var9 ^ -389392049);
            case 160 -> Illll(2106594586, var9 ^ 508576285);
            case 161 -> Illll(2106594587, var9 ^ 3924458);
            case 162 -> Illll(2106594588, var9 ^ -337183890);
            case 163 -> Illll(2106594589, var9 ^ -573534545);
            case 164 -> Illll(2106594590, var9 ^ -1338604362);
            case 165 -> Illll(2106594591, var9 ^ 792730020);
            case 166 -> Illll(2106594576, var9 ^ 1969143152);
            case 167 -> Illll(2106594577, var9 ^ 1404382149);
            case 168 -> Illll(2106594578, var9 ^ 1768379904);
            case 169 -> Illll(2106594579, var9 ^ 1435245518);
            case 170 -> Illll(2106594580, var9 ^ -1476291213);
            case 171 -> Illll(2106594581, var9 ^ 535127252);
            case 172 -> Illll(2106594582, var9 ^ 1207685706);
            case 173 -> Illll(2106594583, var9 ^ 1978793960);
            case 174 -> Illll(2106594600, var9 ^ 1318560694);
            case 175 -> Illll(2106594601, var9 ^ 760496176);
            case 176 -> Illll(2106594602, var9 ^ -1680977873);
            case 177 -> Illll(2106594603, var9 ^ -1093547111);
            case 178 -> Illll(2106594604, var9 ^ -1354453386);
            case 179 -> Illll(2106594605, var9 ^ 1813211241);
            case 180 -> Illll(2106594606, var9 ^ -2084343581);
            case 181 -> Illll(2106594607, var9 ^ -1971466569);
            case 182 -> Illll(2106594592, var9 ^ -878439268);
            case 183 -> Illll(2106594593, var9 ^ -1073783047);
            case 184 -> Illll(2106594594, var9 ^ -2087153715);
            case 185 -> Illll(2106594595, var9 ^ 444854611);
            case 186 -> Illll(2106594596, var9 ^ 1855317268);
            case 187 -> Illll(2106594597, var9 ^ -1147944501);
            case 188 -> Illll(2106594598, var9 ^ 609692195);
            case 189 -> Illll(2106594599, var9 ^ -116675163);
            case 190 -> Illll(2106594616, var9 ^ 1371411042);
            case 191 -> Illll(2106594617, var9 ^ -610906828);
            case 192 -> Illll(2106594618, var9 ^ 1147298227);
            case 193 -> Illll(2106594619, var9 ^ -1057859688);
            case 194 -> Illll(2106594620, var9 ^ -429180758);
            case 195 -> Illll(2106594621, var9 ^ -967554321);
            case 196 -> Illll(2106594622, var9 ^ -1790014460);
            case 197 -> Illll(2106594623, var9 ^ -803475631);
            case 198 -> Illll(2106594608, var9 ^ 376692281);
            case 199 -> Illll(2106594609, var9 ^ -2000296781);
            case 200 -> Illll(2106594610, var9 ^ 713500046);
            case 201 -> Illll(2106594611, var9 ^ 754557809);
            case 202 -> Illll(2106594612, var9 ^ -410551828);
            case 203 -> Illll(2106594613, var9 ^ 1643721732);
            case 204 -> Illll(2106594614, var9 ^ -475110998);
            case 205 -> Illll(2106594615, var9 ^ -185088095);
            case 206 -> Illll(2106594504, var9 ^ -103814707);
            case 207 -> Illll(2106594505, var9 ^ 1964393618);
            case 208 -> Illll(2106594506, var9 ^ 1455760587);
            case 209 -> Illll(2106594507, var9 ^ 420848331);
            case 210 -> Illll(2106594508, var9 ^ 437631006);
            case 211 -> Illll(2106594509, var9 ^ 2103680352);
            case 212 -> Illll(2106594510, var9 ^ -1982059311);
            case 213 -> Illll(2106594511, var9 ^ -1404654215);
            case 214 -> Illll(2106594496, var9 ^ 541479766);
            case 215 -> Illll(2106594497, var9 ^ -771767855);
            case 216 -> Illll(2106594498, var9 ^ 1791078349);
            case 217 -> Illll(2106594499, var9 ^ -1988340756);
            case 218 -> Illll(2106594500, var9 ^ 89478447);
            case 219 -> Illll(2106594501, var9 ^ 382259086);
            case 220 -> Illll(2106594502, var9 ^ 1244741390);
            case 221 -> Illll(2106594503, var9 ^ -201924930);
            case 222 -> Illll(2106594520, var9 ^ 2095896625);
            case 223 -> Illll(2106594521, var9 ^ -1875310704);
            case 224 -> Illll(2106594522, var9 ^ -407782159);
            case 225 -> Illll(2106594523, var9 ^ 44646242);
            case 226 -> Illll(2106594524, var9 ^ -316616706);
            case 227 -> Illll(2106594525, var9 ^ -1453061941);
            case 228 -> Illll(2106594526, var9 ^ -1135073570);
            case 229 -> Illll(2106594527, var9 ^ -513035178);
            case 230 -> Illll(2106594512, var9 ^ -1731975842);
            case 231 -> Illll(2106594513, var9 ^ 907430422);
            case 232 -> Illll(2106594514, var9 ^ -1302117859);
            case 233 -> Illll(2106594515, var9 ^ 1759442899);
            case 234 -> Illll(2106594516, var9 ^ 329052213);
            case 235 -> Illll(2106594517, var9 ^ -947493467);
            case 236 -> Illll(2106594518, var9 ^ 678760109);
            case 237 -> Illll(2106594519, var9 ^ -173574336);
            case 238 -> Illll(2106594536, var9 ^ 1877077667);
            case 239 -> Illll(2106594537, var9 ^ -1837636126);
            case 240 -> Illll(2106594538, var9 ^ 2110012425);
            case 241 -> Illll(2106594539, var9 ^ -1361547459);
            case 242 -> Illll(2106594540, var9 ^ -617087386);
            case 243 -> Illll(2106594541, var9 ^ 1745698252);
            case 244 -> Illll(2106594542, var9 ^ -2042221457);
            case 245 -> Illll(2106594543, var9 ^ 1824581240);
            case 246 -> Illll(2106594528, var9 ^ -141355837);
            case 247 -> 2;
            case 248 -> Illll(2106594529, var9 ^ -1901274995);
            case 249 -> Illll(2106594530, var9 ^ 1563270100);
            case 250 -> Illll(2106594531, var9 ^ 462438809);
            case 251 -> Illll(2106594532, var9 ^ 553149597);
            case 252 -> Illll(2106594533, var9 ^ 273396456);
            case 253 -> Illll(2106594534, var9 ^ -1030132622);
            case 254 -> Illll(2106594535, var9 ^ -2105788904);
            default -> Illll(2106594552, var9 ^ 1904419269);
         };
         int var5 = (var1 & Illll(2106594553, var9 ^ -515742439)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Illll(2106594554, var9 ^ 1969139856)) >>> Illll(2106594555, var9 ^ -1823849151)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Illll(2106594556, var9 ^ -2109451);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Illll(2106594557, var9 ^ -303366875);
            }
         }

         ll[var2] = new String(var3).intern();
      }

      return ll[var2];
   }

   @Override
   public void llll(class_332 param1, int param2, int param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03: astore 5
      // 05: aload 5
      // 07: invokevirtual net/minecraft/class_310.method_22683 ()Lnet/minecraft/class_1041;
      // 0a: ifnull 1c
      // 0d: aload 5
      // 0f: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 12: ifnonnull 21
      // 15: goto 1c
      // 18: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1b: athrow
      // 1c: return
      // 1d: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 20: athrow
      // 21: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 24: astore 6
      // 26: invokestatic k74/x/IlIlIllII.l ()Lk74/x/IlIlIllII;
      // 29: invokevirtual k74/x/IlIlIllII.Il ()Ljava/util/List;
      // 2c: astore 7
      // 2e: aload 7
      // 30: invokeinterface java/util/List.isEmpty ()Z 1
      // 35: ifeq 3d
      // 38: return
      // 39: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: aload 1
      // 3f: aload 5
      // 41: aload 7
      // 43: invokevirtual k74/x/IIIlllIIl.IIll (Lnet/minecraft/class_332;Lnet/minecraft/class_310;Ljava/util/List;)V
      // 46: return
   }

   private void IlIl(class_332 param1, class_327 param2, String param3, double param4, double param6, double param8, int param10) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: ifnull 20
      // 04: aload 3
      // 05: invokevirtual java/lang/String.isBlank ()Z
      // 08: ifne 20
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 11: athrow
      // 12: dload 8
      // 14: dconst_0
      // 15: dcmpg
      // 16: ifgt 25
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 1f: athrow
      // 20: return
      // 21: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 24: athrow
      // 25: aload 1
      // 26: aload 2
      // 27: aload 2
      // 28: aload 3
      // 29: dload 8
      // 2b: invokestatic k74/x/IlIIlllIl.llIIl (Lnet/minecraft/class_327;Ljava/lang/String;D)Ljava/lang/String;
      // 2e: dload 4
      // 30: dload 6
      // 32: iload 10
      // 34: invokestatic k74/x/IlIIlllIl.IIll (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDI)V
      // 37: return
   }

   private double IllI(double var1) {
      return k74.x.IlllIII.I(var1);
   }

   private void Illl(class_332 var1, class_327 var2, IIIlIlI var3, IllIlll var4, double var5, double var7, long var9, boolean var11) {
      Color var12 = this.II(var3);
      int var13 = var12.getRGB();
      double var14 = 12.0;
      double var16 = var5 + 3.0;
      double var18 = var7 + (var4.l() - var14) / 2.0;
      double var20 = var5 + 18.0;
      double var22 = var4.I() * this.IIllI(var3, var9);
      double var24 = var5 + var4.I() - var22;
      IIIlIllII.llI(var1, III, var5, var7, var4.I(), var4.l(), false);
      this.l(var1, var2, var3, var16, var18, var14, 1.0);
      double var26 = var7 + 3.0;
      double var28 = var7 + var4.l() - 3.0 - this.IIl(var2, 0.9);

      try {
         this.III(var1, var2, var3.I(), var20, var26, -1, 1.14);
         this.III(var1, var2, var3.II(), var20, var28, -1, 0.9);
         if (var11) {
            IlIIlllIl.llIl(var1, var24, var7 + var4.l() - 1.0, var22, 1.0, 1.0, var13);
            return;
         }
      } catch (IllegalStateException var30) {
         throw IllII(var30);
      }

      IlIIlllIl.Il(var1, var24, var7 + var4.l() - 1.0, var5 + var4.I(), var7 + var4.l(), var13);
   }

   public boolean lIII() {
      return this.IIl.IllI();
   }

   private double lIIl(long var1, double var3, double var5, double var7) {
      Double var9 = this.Ill.get(var1);
      if (var9 == null) {
         double var10 = 18.0 * (1.0 - var5);
         var9 = var3 + var10;
      }

      double var12 = class_3532.method_16436(class_3532.method_15350(var7, 0.0, 1.0), var9, var3);
      this.Ill.put(var1, var12);
      return var12;
   }

   private double lIlI(class_327 var1, String var2, double var3) {
      class_327 var10000;
      try {
         var10000 = var1;
         if (var2 == null) {
            return IlIIlllIl.IIl(var1, "") * var3;
         }
      } catch (IllegalStateException var5) {
         throw IllII(var5);
      }

      return IlIIlllIl.IIl(var10000, var2) * var3;
   }

   private double lIll(IIIlIlI var1, long var2, long var4) {
      return this.IllI((double)(var1.Il() - var2) / var4);
   }

   private class_2960 llII(IIIlIlI var1) {
      return switch (IIllllIII.I[var1.Ill().ordinal()]) {
         case 1 -> {
            class_2960 var4 = this.IIll;
            if (var4 == null) {
               var4 = llI(lI);
               this.IIll = var4;
            }

            yield var4;
         }
         case 2 -> {
            class_2960 var3 = this.I;
            if (var3 == null) {
               var3 = llI(IllI);
               this.I = var3;
            }

            yield var3;
         }
         case 3 -> {
            class_2960 var2 = this.llI;
            if (var2 == null) {
               var2 = llI(lII);
               this.llI = var2;
            }

            yield var2;
         }
         default -> null;
      };
   }

   @Override
   public void IIlIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03: astore 1
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 19
      // 0b: aload 1
      // 0c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0f: ifnonnull 26
      // 12: goto 19
      // 15: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 18: athrow
      // 19: invokestatic k74/x/IlIlIllII.l ()Lk74/x/IlIlIllII;
      // 1c: invokevirtual k74/x/IlIlIllII.lI ()V
      // 1f: goto 26
      // 22: invokestatic k74/x/IIIlllIIl.IllII (Ljava/lang/IllegalStateException;)Ljava/lang/IllegalStateException;
      // 25: athrow
      // 26: return
   }

   private double lllI(double var1) {
      return k74.x.IlllIII.II(var1);
   }

   private void IIIII(class_332 var1, class_310 var2, IIIlIlI var3, IllIlll var4, double var5, double var7, double var9) {
      Boolean var11 = IlIIlllIl.llI(true);

      try {
         this.IIII(var1, var2.field_1772, var3, var4, var5, var7, var9);
      } finally {
         IlIIlllIl.lIllIl(var11);
      }
   }

   private double IIIIl(IIIlIlI var1, long var2, long var4) {
      double var6 = this.lIl(var1, var2, var4);
      double var8 = this.lIll(var1, var2, var4);
      return Math.min(var6, var8);
   }

   public lIllIllI IIIlI() {
      return this.IIIl.IllI();
   }

   private void IIIll(class_332 var1, double var2, double var4, double var6, double var8, double var10) {
      IIIlIllII.Ill(var1, III, var2, var4, var6, var8, false, var10);
   }

   private static boolean IIlII(Set var0, Long var1) {
      try {
         if (!var0.contains(var1)) {
            return true;
         }
      } catch (IllegalStateException var2) {
         throw IllII(var2);
      }

      return false;
   }

   private double IIllI(IIIlIlI var1, long var2) {
      return this.Il((double)(var1.Il() - var2) / Math.max(1L, var1.lII()));
   }

   public boolean IIlll() {
      return false;
   }

   private static IllegalStateException IllII(IllegalStateException var0) {
      return var0;
   }

   private double IllIl(long var1) {
      try {
         if (this.Il == 0L) {
            this.Il = var1;
            return 1.0;
         }
      } catch (IllegalStateException var5) {
         throw IllII(var5);
      }

      long var3 = Math.max(1L, Math.min(80L, var1 - this.Il));
      this.Il = var1;
      return k74.x.IlllIII.l(0.28, var3 / 1000.0);
   }

   public long IlllI() {
      return Math.max(250L, Math.round(this.lIl.IllI() * 1000.0));
   }
}
