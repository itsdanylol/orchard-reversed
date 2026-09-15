package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;
import net.minecraft.class_327;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class lllIIII {
   private static final int[] IIIll;
   private static final IIIlIlIl I;
   private static final int II = -12235944;
   private static final IIIlIlIl Il;
   private static final IIIlIlIl lI;
   private static final int ll = -11249303;
   private class_327 III;
   private static final IIIlIlIl IIl;
   private static final double IlI = 8.0;
   private static final IIIlIlIl Ill;
   private static final IIIlIlIl lII;
   private static final Object[] IIlIl;
   private static final IIIlIlIl lIl;
   private static final IIIlIlIl llI;
   private static final int lll = -13289148;
   static final int IIII = 25;
   private static final String[] IIIl;
   static final IIIlIlIl IIlI;
   private static final String[] IIlII;
   private static final String[] IIll;
   private static final int IlII = -1071503824;
   private static final double IlIl = 8.0;
   private IIIlIIII IllI;
   private static final IIIlIlIl Illl;
   private static final double lIII = 14.0;
   private static final IIIlIlIl l;
   private static final IIIlIlIl lIIl;
   private static final IIIlIlIl lIlI;
   private class_332 lIll;
   private static final double llII = 21.0;
   static final int llIl = 112;
   private static final llIlIlll lllI;
   private static final IIIlIlIl llll;
   static final int IIIII = 10;
   private static final IIIlIlIl IIIIl;
   private static final double IIIlI = 4.0;

   void I(double var1, double var3, double var5, IIllIIl var7, boolean var8, double var9) {
      int var11 = (int)Math.round(IIIllI(var9, 0.0, 1.0) * 255.0);

      try {
         if (var11 <= 0) {
            return;
         }
      } catch (MatchException var16) {
         throw lllIl(var16);
      }

      Color var10000;
      label66: {
         try {
            if (var7.lII() == null) {
               var10000 = this.IllI.lIlll();
               break label66;
            }
         } catch (MatchException var20) {
            throw lllIl(var20);
         }

         var10000 = var7.lII();
      }

      Color var12 = var10000;

      label58: {
         try {
            if (var7.l() == null) {
               var10000 = this.IllI.lIIII();
               break label58;
            }
         } catch (MatchException var19) {
            throw lllIl(var19);
         }

         var10000 = var7.l();
      }

      Color var13 = var10000;

      label50: {
         try {
            if (var8) {
               var22 = var11;
               break label50;
            }
         } catch (MatchException var18) {
            throw lllIl(var18);
         }

         var22 = (int)Math.round(var11 * 0.56);
      }

      int var14 = var22;

      label42: {
         try {
            if (var8) {
               var23 = IlI(this.IllI.lllll(), var14);
               break label42;
            }
         } catch (MatchException var17) {
            throw lllIl(var17);
         }

         var23 = this.IIIIlI(var14);
      }

      int var15 = var23;
      IlIIlllIl.llIl(this.lIll, var1 - 1.0, var3 - 1.0, var5 + 2.0, var5 + 2.0, 8.0, var15);
      IlIIlllIl.lllIII(this.lIll, var1, var3, var5, var5, 7.0, IlI(var12, var11), IlI(var13, var11));
   }

   private void l(double var1, double var3, double var5, String var7) {
      this.llIlI(var1, var3, var5, var7, 1.0);
   }

   private static String IlIIIl(char var0, char var1, int var2, int var3) {
      int var8 = var3 ^ -63467123;
      char[] var7 = IIlII[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])IIlIl[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         IIlIl[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 28688;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 13) {
            default -> 195;
            case 1 -> 18;
            case 2 -> 220;
            case 3 -> 204;
            case 4 -> 200;
            case 5 -> 252;
            case 6 -> 96;
            case 7 -> 217;
            case 8 -> 68;
            case 9 -> 90;
            case 10 -> 141;
            case 11 -> 23;
            case 12 -> 37;
         } ^ var6 ^ var5 ^ var0 ^ var1 ^ var3 ^ var2);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   void II(IIIlIlIl var1, double var2, double var4, double var6, int var8) {
      this.IIIl(this.lIlll(var1, var6), var2, var4, var8);
   }

   int Il() {
      return IlI(this.IllI.lllll(), IlIIII(-240972484, -880950298 ^ -799981769));
   }

   void lI(double param1, double param3, double param5, double param7, double param9, IIllIIl param11, boolean param12, double param13) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: dload 13
      // 002: dconst_0
      // 003: dconst_1
      // 004: invokestatic k74/x/lllIIII.IIIllI (DDD)D
      // 007: ldc2_w 255.0
      // 00a: dmul
      // 00b: invokestatic java/lang/Math.round (D)J
      // 00e: l2i
      // 00f: istore 15
      // 011: iload 15
      // 013: ifle 040
      // 016: dload 5
      // 018: dconst_0
      // 019: dcmpg
      // 01a: ifle 040
      // 01d: goto 024
      // 020: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 023: athrow
      // 024: dload 7
      // 026: dconst_0
      // 027: dcmpg
      // 028: ifle 040
      // 02b: goto 032
      // 02e: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 031: athrow
      // 032: dload 9
      // 034: dconst_0
      // 035: dcmpg
      // 036: ifgt 045
      // 039: goto 040
      // 03c: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03f: athrow
      // 040: return
      // 041: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 044: athrow
      // 045: ldc2_w 5.5
      // 048: dstore 16
      // 04a: aload 0
      // 04b: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 04e: dload 1
      // 04f: dload 3
      // 050: dload 5
      // 052: dload 7
      // 054: dload 16
      // 056: aload 0
      // 057: iload 15
      // 059: invokevirtual k74/x/lllIIII.IlIIl (I)I
      // 05c: invokestatic k74/x/IlIIlllIl.llIl (Lnet/minecraft/class_332;DDDDDI)V
      // 05f: aload 0
      // 060: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 063: dload 1
      // 064: dload 3
      // 065: dload 5
      // 067: dload 7
      // 069: dload 16
      // 06b: iload 12
      // 06d: ifeq 08a
      // 070: aload 0
      // 071: iload 15
      // 073: ldc -240972483
      // 075: ldc 1523663398
      // 077: ldc -786992802
      // 079: ixor
      // 07a: invokestatic k74/x/lllIIII.IlIIII (II)I
      // 07d: invokestatic java/lang/Math.min (II)I
      // 080: invokevirtual k74/x/lllIIII.lIIlI (I)I
      // 083: goto 096
      // 086: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 089: athrow
      // 08a: aload 0
      // 08b: iload 15
      // 08d: i2d
      // 08e: ldc2_w 0.62
      // 091: dmul
      // 092: d2i
      // 093: invokevirtual k74/x/lllIIII.IIIIlI (I)I
      // 096: invokestatic k74/x/IlIIlllIl.l (Lnet/minecraft/class_332;DDDDDI)V
      // 099: ldc2_w 2.0
      // 09c: dstore 18
      // 09e: dconst_1
      // 09f: dload 9
      // 0a1: dload 18
      // 0a3: dsub
      // 0a4: dload 7
      // 0a6: dload 18
      // 0a8: ldc2_w 2.0
      // 0ab: dmul
      // 0ac: dsub
      // 0ad: invokestatic java/lang/Math.min (DD)D
      // 0b0: invokestatic java/lang/Math.max (DD)D
      // 0b3: dstore 20
      // 0b5: aload 11
      // 0b7: invokevirtual k74/x/IIllIIl.lII ()Ljava/awt/Color;
      // 0ba: ifnonnull 0cb
      // 0bd: aload 0
      // 0be: getfield k74/x/lllIIII.IllI Lk74/x/IIIlIIII;
      // 0c1: invokevirtual k74/x/IIIlIIII.lIlll ()Ljava/awt/Color;
      // 0c4: goto 0d0
      // 0c7: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ca: athrow
      // 0cb: aload 11
      // 0cd: invokevirtual k74/x/IIllIIl.lII ()Ljava/awt/Color;
      // 0d0: astore 22
      // 0d2: aload 11
      // 0d4: invokevirtual k74/x/IIllIIl.l ()Ljava/awt/Color;
      // 0d7: ifnonnull 0e8
      // 0da: aload 0
      // 0db: getfield k74/x/lllIIII.IllI Lk74/x/IIIlIIII;
      // 0de: invokevirtual k74/x/IIIlIIII.lIIII ()Ljava/awt/Color;
      // 0e1: goto 0ed
      // 0e4: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e7: athrow
      // 0e8: aload 11
      // 0ea: invokevirtual k74/x/IIllIIl.l ()Ljava/awt/Color;
      // 0ed: astore 23
      // 0ef: aload 0
      // 0f0: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 0f3: dload 1
      // 0f4: dload 18
      // 0f6: dadd
      // 0f7: dload 3
      // 0f8: dload 18
      // 0fa: dadd
      // 0fb: dconst_1
      // 0fc: dload 5
      // 0fe: dload 18
      // 100: ldc2_w 2.0
      // 103: dmul
      // 104: dsub
      // 105: invokestatic java/lang/Math.max (DD)D
      // 108: dload 20
      // 10a: ldc2_w 4.0
      // 10d: aload 22
      // 10f: iload 15
      // 111: invokestatic k74/x/lllIIII.IlI (Ljava/awt/Color;I)I
      // 114: aload 23
      // 116: iload 15
      // 118: invokestatic k74/x/lllIIII.IlI (Ljava/awt/Color;I)I
      // 11b: invokestatic k74/x/IlIIlllIl.lllIII (Lnet/minecraft/class_332;DDDDDII)V
      // 11e: return
   }

   int ll() {
      return IlI(this.IllI.lIlll(), IlIIII(-240972482, -126600974 ^ -863210945));
   }

   void III(double var1, double var3, double var5, double var7, double var9, String var11, double var12) {
      double var14 = IIIllI(Math.min(var7, var9), 0.0, 1.0);
      double var16 = IIIllI(Math.max(var7, var9), 0.0, 1.0);
      double var18 = var3 + 21.0;
      double var20 = var18 - 4.0;
      double var22 = 4.0;
      double var24 = 7.0;
      double var26 = IIlIll(var1, var5, var14);
      double var28 = IIlIll(var1, var5, var16);
      double var30 = var26 - var24;
      double var32 = Math.max(8.0, var28 + var24 - var30);
      int var34 = this.ll();
      int var35 = this.IIlllI();
      IlIIlllIl.llIl(this.lIll, var1, var20, var5, 8.0, var22, IlIIII(-240972481, 1133380493 ^ 1680847178));
      IlIIlllIl.lllIII(this.lIll, var30, var20, var32, 8.0, var22, var34, var35);
      double var36 = var18 - 4.0;
      double var38 = var26 - var24;
      IlIIlllIl.llIl(this.lIll, var38, var36, 14.0, 8.0, 4.0, -1);
      IlIIlllIl.l(this.lIll, var38, var36, 14.0, 8.0, 4.0, IlIIII(-240972488, 1133380493 ^ 516836014));
      double var40 = var28 - var24;
      IlIIlllIl.llIl(this.lIll, var40, var36, 14.0, 8.0, 4.0, -1);
      IlIIlllIl.l(this.lIll, var40, var36, 14.0, 8.0, 4.0, IlIIII(-240972487, 1133380493 ^ 516368861));
      this.llIlI(var1, var3, var5, var11, var12);
   }

   int IIl(int var1) {
      return IlI(IIll(this.IllI.IIl(), this.IllI.lllll(), 0.055), var1);
   }

   static int IlI(Color var0, int var1) {
      int var4 = -378912585;

      Color var10000;
      label17: {
         try {
            if (var0 == null) {
               var10000 = Color.WHITE;
               break label17;
            }
         } catch (MatchException var5) {
            throw lllIl(var5);
         }

         var10000 = var0;
      }

      Color var2 = var10000;
      int var3 = Math.max(0, Math.min(IlIIII(-240972486, var4 ^ 1728483000), var1));
      return var3 << IlIIII(-240972485, var4 ^ 1187594951)
         | (var2.getRed() & IlIIII(-240972492, var4 ^ -388020696)) << IlIIII(-240972491, var4 ^ 371412515)
         | (var2.getGreen() & IlIIII(-240972490, var4 ^ 895466177)) << IlIIII(-240972489, var4 ^ -245999160)
         | var2.getBlue() & IlIIII(-240972496, var4 ^ -966811829);
   }

   int Ill() {
      return IlI(this.IllI.IIIl(), IlIIII(-240972495, 245471513 ^ -463793343));
   }

   void lII(double var1, double var3, double var5, double var7, boolean var9, boolean var10) {
      this.lIll(var1, var3, var5, var7, var9, var10, 1.0);
   }

   void lIl(class_332 var1, class_327 var2, IIIlIIII var3) {
      this.lIll = var1;
      this.III = var2;
      this.IllI = var3;
   }

   void llI(String param1, double param2, double param4, int param6, double param7) {
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
      // 05: invokevirtual java/lang/String.isBlank ()Z
      // 08: ifeq 17
      // 0b: goto 12
      // 0e: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: return
      // 13: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: dload 7
      // 19: dconst_1
      // 1a: dcmpl
      // 1b: ifne 2d
      // 1e: aload 0
      // 1f: aload 1
      // 20: dload 2
      // 21: dload 4
      // 23: iload 6
      // 25: invokevirtual k74/x/lllIIII.IIIIll (Ljava/lang/String;DDI)V
      // 28: return
      // 29: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 31: invokestatic k74/x/IlIIlllIl.IIllll (Lnet/minecraft/class_332;)V
      // 34: aload 0
      // 35: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 38: dload 2
      // 39: dload 4
      // 3b: invokestatic k74/x/IlIIlllIl.IlIIlI (Lnet/minecraft/class_332;DD)V
      // 3e: aload 0
      // 3f: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 42: dload 7
      // 44: dload 7
      // 46: invokestatic k74/x/IlIIlllIl.llIIIl (Lnet/minecraft/class_332;DD)V
      // 49: aload 0
      // 4a: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 4d: aload 0
      // 4e: getfield k74/x/lllIIII.III Lnet/minecraft/class_327;
      // 51: aload 1
      // 52: dconst_0
      // 53: dconst_0
      // 54: iload 6
      // 56: invokestatic k74/x/IlIIlllIl.IIll (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDI)V
      // 59: aload 0
      // 5a: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 5d: invokestatic k74/x/IlIIlllIl.lIIIll (Lnet/minecraft/class_332;)V
      // 60: goto 6f
      // 63: astore 9
      // 65: aload 0
      // 66: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 69: invokestatic k74/x/IlIIlllIl.lIIIll (Lnet/minecraft/class_332;)V
      // 6c: aload 9
      // 6e: athrow
      // 6f: return
   }

   private void lll(int[] var1, int var2) {
      var1[0] += this.Illl(lIIIl(var2));
   }

   private static class_2960 IIII(IIIlIlIl var0) {
      String var10000 = IlIIllIII.Ill(llII(IlIIII(-240972494, 1180024802 ^ 1632119629), IlIIII(-240972493, 1180024802 ^ 323534989))).llIl();
      String var10001 = IIllII();
      String var10002 = var0.llIl();
      String var3 = IlIIllIII.lI(llII(IlIIII(-240972500, 1180024802 ^ 2037550420), IlIIII(-240972499, 1180024802 ^ -251364991)));
      String var2 = var10002;
      String var1 = var10001;
      return class_2960.method_60655(var10000, var1 + var2 + var3);
   }

   void IIIl(IIIlIlIl param1, double param2, double param4, int param6) {
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
      // 05: invokevirtual k74/x/IIIlIlIl.lI ()Z
      // 08: ifeq 17
      // 0b: goto 12
      // 0e: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: return
      // 13: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: getstatic k74/x/lllIIII.lllI Lk74/x/llIlIlll;
      // 1a: aload 1
      // 1b: invokevirtual k74/x/llIlIlll.equals (Ljava/lang/Object;)Z
      // 1e: ifeq 2c
      // 21: aload 0
      // 22: invokevirtual k74/x/lllIIII.ll ()I
      // 25: goto 2e
      // 28: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2b: athrow
      // 2c: iload 6
      // 2e: istore 7
      // 30: bipush 1
      // 31: newarray 7
      // 33: dup
      // 34: bipush 0
      // 35: dload 2
      // 36: dastore
      // 37: astore 8
      // 39: aload 1
      // 3a: aload 0
      // 3b: aload 8
      // 3d: dload 4
      // 3f: iload 7
      // 41: invokedynamic accept (Lk74/x/lllIIII;[DDI)Ljava/util/function/IntConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)V, k74/x/lllIIII.IllIl ([DDII)V, (I)V ]
      // 46: invokevirtual k74/x/IIIlIlIl.IIII (Ljava/util/function/IntConsumer;)V
      // 49: return
   }

   void IIlI(double var1, double var3, double var5, double var7, String var9, boolean var10) {
      this.lllll(var1, var3, var5, var7, var9, var10, 1.0);
   }

   static Color IIll(Color var0, Color var1, double var2) {
      double var4 = IIIllI(var2, 0.0, 1.0);

      Color var10000;
      label31: {
         try {
            if (var0 == null) {
               var10000 = Color.WHITE;
               break label31;
            }
         } catch (MatchException var9) {
            throw lllIl(var9);
         }

         var10000 = var0;
      }

      Color var6 = var10000;

      label23: {
         try {
            if (var1 == null) {
               var10000 = Color.WHITE;
               break label23;
            }
         } catch (MatchException var8) {
            throw lllIl(var8);
         }

         var10000 = var1;
      }

      Color var7 = var10000;
      return new Color(
         (int)Math.round(var6.getRed() + (var7.getRed() - var6.getRed()) * var4),
         (int)Math.round(var6.getGreen() + (var7.getGreen() - var6.getGreen()) * var4),
         (int)Math.round(var6.getBlue() + (var7.getBlue() - var6.getBlue()) * var4),
         (int)Math.round(var6.getAlpha() + (var7.getAlpha() - var6.getAlpha()) * var4)
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 2018992630;
      int var11 = 0;
      short var12 = 19901;
      int var10 = 0;
      String[] var9 = new String[2];
      int var8 = "ęケ팱㏕録゙匸㎩錨㉕팵㌽匌㍉ጠ㌩팂ㆁ팗㍁匔㊕ጯきጵ㎹匾ㅹ錍㏵ጅ㎩ጸ㍕팿ゅ팎ァጲ㍩팹〉錍㇅ጾめ錤ㆭ匃ネ錮㈡匟」ጪ㈁錈㇁錴㏍팹ㄉ錛〡匄㈽錑㌕匬㉭팣㇕ጂㄡ팀ㅭጭヹ錑ㅁ匈㊭ጟぁ팆㌅ጭㄹጫ㎥팥ス팶ㄙ錚ㇱ匳㎵匓す팞ㇵ匋チ錡㌥錞ㆽ팄㉑匿㈝팀ら팤ォ錇キ팎㉉ጮ〝ጜぱ錰㌹ጬろ팾㈅ጝ㇕팧ㅱ匐ㄍ錭ふ匦ㆽጡ㍡ግㆅጻㅹ팔㈍匝㋵錶㍡팥㈍匈ドጎ㊭錕㏹錻㎝팟㋭錰ㅍ팾㊉錯ㅕ錼ぽ匯㉑錨㈭匳㏙ጷどጤ】팣㏉팊㋁匋ベ錥㍁匿ㅹጊㇱጨ㍑匧〽匸ぱ팑ㇵ팳㍩ጢ㏹錭㌉팣ソጵ㊡区㏅ጼ㊑錵ベ팋㆙匭きጎ\u31ed팕ㆭ팏ㅕጳ㍝팿ㆵ팄㌭팻ゥጧヽ錊㌍匥㉹팠㋍匿〡錔ㄹ錛㎅匘㋁팲㏁팓ぉ錘㗉퍛㚉鍲㓉፲㘩卩㔙ፕ㛹퍉㖉鍈㗝ፋ㟑퍬㗽퍲㑱鍳㞉퍜㔽\u0015ࢯ\uf095࠻\uf0b8এ\uf0a0ࢧ낖\u0bd3낝௳낷\u0adf낒ଇるळ炰ࡗ炷१"
         .length();
      String var7 = "ęケ팱㏕録゙匸㎩錨㉕팵㌽匌㍉ጠ㌩팂ㆁ팗㍁匔㊕ጯきጵ㎹匾ㅹ錍㏵ጅ㎩ጸ㍕팿ゅ팎ァጲ㍩팹〉錍㇅ጾめ錤ㆭ匃ネ錮㈡匟」ጪ㈁錈㇁錴㏍팹ㄉ錛〡匄㈽錑㌕匬㉭팣㇕ጂㄡ팀ㅭጭヹ錑ㅁ匈㊭ጟぁ팆㌅ጭㄹጫ㎥팥ス팶ㄙ錚ㇱ匳㎵匓す팞ㇵ匋チ錡㌥錞ㆽ팄㉑匿㈝팀ら팤ォ錇キ팎㉉ጮ〝ጜぱ錰㌹ጬろ팾㈅ጝ㇕팧ㅱ匐ㄍ錭ふ匦ㆽጡ㍡ግㆅጻㅹ팔㈍匝㋵錶㍡팥㈍匈ドጎ㊭錕㏹錻㎝팟㋭錰ㅍ팾㊉錯ㅕ錼ぽ匯㉑錨㈭匳㏙ጷどጤ】팣㏉팊㋁匋ベ錥㍁匿ㅹጊㇱጨ㍑匧〽匸ぱ팑ㇵ팳㍩ጢ㏹錭㌉팣ソጵ㊡区㏅ጼ㊑錵ベ팋㆙匭きጎ\u31ed팕ㆭ팏ㅕጳ㍝팿ㆵ팄㌭팻ゥጧヽ錊㌍匥㉹팠㋍匿〡錔ㄹ錛㎅匘㋁팲㏁팓ぉ錘㗉퍛㚉鍲㓉፲㘩卩㔙ፕ㛹퍉㖉鍈㗝ፋ㟑퍬㗽퍲㑱鍳㞉퍜㔽\u0015ࢯ\uf095࠻\uf0b8এ\uf0a0ࢧ낖\u0bd3낝௳낷\u0adf낒ଇるळ炰ࡗ炷१";

      do {
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIlII = var9;
      IIlIl = new Object[var9.length];
      int var10000 = 0;
      int var10001 = 0;
      IIIll = new int[357];
      byte[] var10002 = "\u0007ø\u0080ÿ\u0097\u0012O´(,6á\nuáêd\u00944Üd\u009dW®\u0092¸²'³w~ä\u001daz¹ã\u009dr\u0016Àá\u0086R\u0004èd·3á£Þö.özÄ6(ÚIÉ6sÜ\f\u008d®«\u0085º¥\u0095Ö\u0005a\u0094dò\u0001ë\u009a\u000eÃO8væ~\u0002%\u0087+úÎOj¹\b\u001eä\tUmÎ\u001a[\r¸XÚä\u0015lÝ\r78tF*Ø«¶\u0010\u0083\\wh\u0012\u0098\u001fu¾{gêx\u0085AÛç\u008eE»M\u0015ë\u0000\n\u0013dâ¬¼\u0087\u000fþ%3\\ï\u001b\u0011ø4\u008b\u007f\u0088x»õi÷yÑ\u007fQê'_d\nVBÒ,Êê\u001d/v\u009aµ¿áç?Î£\u0015\u0017÷ \u0014á\u0007\u0013©\u001f±Î5Ed]\u007f\u0095í&§qÿG\u0003\u0099\u009aØ\u001cÏ\u0012\u0001¿×ò\u001fG8ÛÛx´\u008a\u0098põgÔâÈ\u0019\u008b\u001e\u0081\u00ad\u0099þ:s¿.¿\u0010Êü\u0003ÏÅð9é¡\u0004\u0013j\u0085\u0006\u008a×&rFKÃ\u0092\u008bÙ7¨xU\u0096aV+2LúTÜ=ñEº\u0019\u001a\u0010\u0098¸EYñ(\u0085\u0090|\rL\u0007\u000f\u0017°\u008ce?Â%\u0018/\u0095qa\u0090È\u0091aQFf\u0090Ñüm\u000fQ\u0082\u0019\u0012jeªbÝ\u000bZX|÷®wú\u0086¼\u0092T\u0087\u0005ïªl3ñä!¶\u009c°\rÐ·f\u0085êãhü¿Ã/\u000ffx\\\u0088\u0015JÂù\u009c\u008d\u00120Þ)§\u0097.\u008a\u0001  @äÙ¸Ò ¹/%\u001aXK\u0010ñ/v\u0080Í8 ã\u0019\u0003¥\u0017\u008aù»M\u009a}_¡\f\u000e£ÖàIüÕ\u0006ËÎ_Ë¶þvâW18\u0099:\u008bÊ~¨u\u0095v\fÖÔÏ\u0010Kã>MHÎï\u007fS\u0092\u0095\u009b\u0011_T\u0014\u000ebt\u009c\u000bB\u0089h\u0092§87\u0007X\u001cf\u00ad\u0092°`á¸IWÉÀ\u0002\\r\u0095F=\b\f$\u0004Y\u008cãÀì£P\u008ek¾\u0089\u008f\u0018\u0004\u0082\u0089Á¦\u0086å$\u0082©^>SèÁ\u008e÷éD±8\u0087ºûS~98Oc\u0088\u000e\u0002!Ü%\u0019ÚU+\u009aî&XH\u0015Ël T\u0097Xré\u0084CÜ\u0018\u0090¨\u0093þfd.¹¨{?Ë\u001ez¥Î£<,j\u008b\u009f-\f\u0016~\u0001÷áC\u009fyT§*`¨Fú\u009a\u0088o\u0099ëj\u001b\u0094ÕÈíW²U\u0006<\u0002>º%²\u0084&ÿ\u001f+ÖCC\u001d\u0089ï\u0010 àJ©q\u0003{Îqì¤áÅ\u000f\b;X8:k>¥¥\u009dòà\u001aa\u008cv\u0083\u001c$\bÖènx\u000bäpH/Ì\"ôÇhðî\u000b6\u008d\u0093z¤ëÈÑï\u0084MÔ\u0086eÍ\u009ba\u000bÄ\u008bÔQP¸µ°\u0015\u0090¿÷\u00938\u008f3ôF]ÓHFÏ\u0081/gÒ\n\u0082;åi\u0002ÒkaÃZ|»cÉï\u0096ù®\u0011¶\u0087\u0094Y\u009fØâíä¤\u0015U\u0087¥Uj¦åxïçÊ\u009d\u0011Oú\u00ad}o=T²Ì\u009cèá¹wü\u0099áoÊ\u008cH\u008b\u001dtü\u0088&l\u009f\u00910Tw\u000b¤çì¢¢§µÓ½\\\u0089c¾n÷î$\u008a\u0091e[7¼ÑxFN\u001aÞ\u009d{,\u001f\u009c;ý\u0080Ã\u009e%56\u0013@Èp\n|xæ\u0016\u0014oý\"û\u001f\u008fÒÃ¶\u001dt¥°YWù\u000ecyÂî\fl\u009aßplè¶]×Ë\u009c\u001f§^hi \u0010»æ\u0002ô¶\u0092rckÑ\u0083÷å:\u0002\"\u000bÁ\u0015i\u0014NûµhÒ\fIùè\u00822\u00917ÒK»Â\u008e4\n\u001cÉ\u0089ÔÈ<ö\u008fè~ºñ+¹\u00176'~\\G=²\u001d\u001b®CàurO\u0094é\u0005ÞBÑ/\u0081@ß\u009a\u0001\u009e³/0\u000e\u0087\u0099\u0082§\u000b\bíEóÃZ¤Ú\u0011 ùCRosÁÔ²\u0089°òÛ]=®W\\\u001fI ·Å\u001f\u001f\u0003æTZ!èõ-Ê}øñëq³ ¤\u008b)¢·\\:¹T\u0019\u000f®.ÂHá*WyðåT\u008edÍ@%9eÅ¾zªáz\u009ff¦èöè\u0090%HÑUòBkþÏªH\u009c\u0004á\u0098È\u0094\u008e`\u009eQn}\u0082\u008b´U#t,G\u0087|\u0098OY,\u00ad¶ð;/qÃa\u0080\u001e\u008e\u0017t\u0012\ròædpwf|¸ü'Õ39úþ?Ï¶´7\u008a8¸³xb@Áëz4,â\u0088ïQg\u001f\u009eB\u0088ô'A\u0088\u0096dÌÛ\u0012ÁÈc¿Ç]¿x*.\u0001>Z«ÑÃ\u008eÕ\u001fÊ\u0089ÔX¡\u0088\u0014?\u008a\\çLÏ³§[\u0016\u0005\u0001µ\u0083Ïe\u0094è,rXù§\u0095\u009f\u0005÷l÷\b\u0011\u001báÔø\u0089~\t¥´\u008ex\u0015\u001c.kt\u0018_®Øù?_ý\rÜ\u009e¡\r¼\t×Ò3\u0010_\u0085\u00adï\u0084fa\u0094ê¹\u0096Çsá¤á\u0017\u0018\u008d$âE]i¹gwQ\u00946S\u009a\u0015\u0014ïè q\u0007\fiM9ïÜ&?-F\u0015\u008c\u008aÚÈ\u0080¦\u001bû(\r\u0001¡?;\u0083Fß5«,¹nV-ÀIèÍ\u000boÄñáD\u0090ð-\u0007Ê\u0097\u001e\rNÎ³\u0084Ï¬¢È\u0080ï¯Ù\u0099ãÖÿ\u009aô"
         .getBytes("ISO-8859-1");

      int var52;
      do {
         IIIll[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -310946654;
         var10000 += 1;
         var52 = var10001 + 4;
         var10001 += 4;
      } while (var52 < var10002.length);

      String[] var5 = new String[IlIIII(-240972498, var17 ^ -246081534)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IlIIIl('\uf8ba', (char)'\ude2b', 215154673, -63467123)).length();
      int var1 = IlIIII(-240972497, var17 ^ -253235673);
      int var19 = -1;

      label93:
      while (true) {
         var10000 = IlIIII(-240972504, var17 ^ -1894182004);
         String var24 = var2.substring(++var19, var19 + var1);
         byte var36 = -1;

         while (true) {
            label88: {
               char[] var54 = var24.toCharArray();
               int var66 = var54.length;
               int var6 = 0;
               var52 = var10000;
               var41 = var54;
               var10001 = var66;
               char[] var78;
               int var85;
               if (var66 <= 1) {
                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               } else {
                  var52 = var10000;
                  var10001 = var66;
                  if (var66 <= var6) {
                     break label88;
                  }

                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               }

               while (true) {
                  var78[var85] = (char)(var78[var85] ^ var66 ^ switch (var6 % IlIIII(-240972508, var17 ^ 238687238)) {
                     case 0 -> IlIIII(-240972507, var17 ^ -2138420868);
                     case 1 -> IlIIII(-240972506, var17 ^ -1432795262);
                     case 2 -> IlIIII(-240972505, var17 ^ -589576270);
                     case 3 -> IlIIII(-240972512, var17 ^ 1911537959);
                     case 4 -> IlIIII(-240972511, var17 ^ 1404790896);
                     case 5 -> IlIIII(-240972510, var17 ^ 1314633448);
                     default -> IlIIII(-240972509, var17 ^ 1946173716);
                  });
                  var6++;
                  if (var52 == 0) {
                     var85 = var52;
                     var78 = var41;
                     var66 = var52;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var78 = var41;
                     var66 = var52;
                     var85 = var6;
                  }
               }
            }

            String var59 = new String(var41).intern();
            switch (var36) {
               case 0:
                  var5[var3++] = var59;
                  if ((var19 += var1) >= var4) {
                     IIIl = var5;
                     IIll = new String[IlIIII(-240972501, var17 ^ 1333383977)];
                     lllI = llIlIlll.I(IlIIllIII.Ill(llII(IlIIII(-240972516, var17 ^ -210877004), IlIIII(-240972515, var17 ^ -289215887))));
                     lI = IlIIllIII.Ill(llII(IlIIII(-240972514, var17 ^ 1896111007), IlIIII(-240972513, var17 ^ -1083952010)));
                     lII = IlIIllIII.Ill(llII(IlIIII(-240972520, var17 ^ 540133499), IlIIII(-240972519, var17 ^ -1686727621)));
                     lIIl = IlIIllIII.Ill(llII(IlIIII(-240972518, var17 ^ 2043699475), IlIIII(-240972517, var17 ^ 1803390781)));
                     Illl = IlIIllIII.Ill(llII(IlIIII(-240972524, var17 ^ -946616690), IlIIII(-240972523, var17 ^ -1665691675)));
                     I = IlIIllIII.Ill(llII(IlIIII(-240972522, var17 ^ 319055454), IlIIII(-240972521, var17 ^ 225738437)));
                     IIl = IlIIllIII.Ill(llII(IlIIII(-240972528, var17 ^ -466799375), IlIIII(-240972527, var17 ^ -1005024656)));
                     llll = IlIIllIII.Ill(llII(IlIIII(-240972526, var17 ^ -642846364), IlIIII(-240972525, var17 ^ 1902239448)));
                     Ill = IlIIllIII.Ill(llII(IlIIII(-240972532, var17 ^ 29975138), IlIIII(-240972531, var17 ^ -2084789355)));
                     l = IlIIllIII.Ill(llII(IlIIII(-240972530, var17 ^ -1905579481), IlIIII(-240972529, var17 ^ 1885488705)));
                     llI = IlIIllIII.Ill(llII(IlIIII(-240972536, var17 ^ 845376630), IlIIII(-240972535, var17 ^ -1371957170)));
                     lIlI = IlIIllIII.Ill(llII(IlIIII(-240972534, var17 ^ -454478867), IlIIII(-240972533, var17 ^ -1007516232)));
                     IIIIl = IlIIllIII.Ill(llII(IlIIII(-240972540, var17 ^ -1729804433), IlIIII(-240972539, var17 ^ 2018259800)));
                     lIl = IlIIllIII.Ill(llII(IlIIII(-240972538, var17 ^ 615198635), IlIIII(-240972537, var17 ^ 599496740)));
                     Il = IlIIllIII.Ill(llII(IlIIII(-240972544, var17 ^ -473409774), IlIIII(-240972543, var17 ^ 343280790)));
                     IIlI = IlIIllIII.Ill(llII(IlIIII(-240972542, var17 ^ 2041890638), IlIIII(-240972541, var17 ^ 2046958690)));
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var59;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label93;
                  }

                  var4 = (var2 = IlIIIl((char)'쁼', 20683, 250660747, -63467124)).length();
                  var1 = IlIIII(-240972503, var17 ^ 733703054);
                  var19 = -1;
            }

            var10000 = IlIIII(-240972502, var17 ^ 444676407);
            var24 = var2.substring(++var19, var19 + var1);
            var36 = 0;
         }
      }
   }

   void IlII(double var1, double var3, double var5, double var7, String var9, double var10) {
      this.lllll(var1, var3, var5, var7, var9, true, var10);
   }

   void IlIl(double var1, double var3, double var5, double var7, String var9, boolean var10, double var11) {
      int var10000;
      label28: {
         try {
            if (var10) {
               var10000 = IlIIII(-240972420, -1527028078 ^ -1185889986);
               break label28;
            }
         } catch (MatchException var30) {
            throw lllIl(var30);
         }

         var10000 = IlIIII(-240972419, -1527028078 ^ 1772426158);
      }

      int var13 = var10000;
      int var14 = IlIIII(-240972418, -1527028078 ^ -1149719691);
      byte var15 = -1;

      try {
         if (var11 == 1.0) {
            IlIIlllIl.IIlIII(this.lIll, this.III, var9, var1, var3, var5, var7, false, var13, var14, var15);
            return;
         }
      } catch (MatchException var29) {
         throw lllIl(var29);
      }

      double var16 = Math.min(4.5, var7 * 0.5);
      IlIIlllIl.llIl(this.lIll, var1, var3, var5, var7, var16, var14);
      IlIIlllIl.llIl(this.lIll, var1 + 1.0, var3 + 1.0, var5 - 2.0, var7 - 2.0, Math.max(1.0, var16 - 1.0), var13);
      double var18 = 8.0;
      double var20 = Math.max(0.0, var5 - var18 * 2.0) / var11;
      String var22 = IlIIlllIl.llIIl(this.III, var9, var20);
      double var23 = this.Illl(var22) * var11;
      double var25 = var1 + (var5 - var23) * 0.5;
      double var27 = var3 + (var7 - IlIIlllIl.IlIlIl(this.III) * var11) * 0.5;
      this.llI(var22, var25, var27, var15, var11);
   }

   int IllI(IIIlIlIl param1) {
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
      // 05: invokevirtual k74/x/IIIlIlIl.lllI ()Z
      // 08: ifeq 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: bipush 1
      // 19: newarray 10
      // 1b: dup
      // 1c: bipush 0
      // 1d: bipush 0
      // 1e: iastore
      // 1f: astore 2
      // 20: aload 1
      // 21: aload 0
      // 22: aload 2
      // 23: invokedynamic accept (Lk74/x/lllIIII;[I)Ljava/util/function/IntConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)V, k74/x/lllIIII.lll ([II)V, (I)V ]
      // 28: invokevirtual k74/x/IIIlIlIl.IIII (Ljava/util/function/IntConsumer;)V
      // 2b: aload 2
      // 2c: bipush 0
      // 2d: iaload
      // 2e: ireturn
   }

   int Illl(String param1) {
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
      // 05: invokevirtual java/lang/String.isEmpty ()Z
      // 08: ifeq 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield k74/x/lllIIII.III Lnet/minecraft/class_327;
      // 1c: aload 1
      // 1d: invokestatic k74/x/IlIIlllIl.IIl (Lnet/minecraft/class_327;Ljava/lang/String;)I
      // 20: ireturn
   }

   void lIII(class_2960 var1, double var2, double var4, double var6, int var8) {
      IlIIlllIl.lIlll(this.lIll, var1, var2, var4, var6, var6, IlIIII(-240972417, -310617162 ^ 26332911), IlIIII(-240972424, -310617162 ^ -172274228), var8);
   }

   void lIIl(double var1, double var3, double var5, double var7, String var9) {
      this.lllll(var1, var3, var5, var7, var9, true, 1.0);
   }

   private double lIlI(double var1, double var3) {
      return var1 + Math.max(0.0, (var3 - IlIIlllIl.IlIlIl(this.III)) * 0.5);
   }

   void lIll(double var1, double var3, double var5, double var7, boolean var9, boolean var10, double var11) {
      double var13 = IIIllI(var11, 0.0, 1.0);
      int var15 = (int)(255.0 * var13);

      int var10000;
      label21: {
         try {
            if (var9) {
               var10000 = IlIIII(-240972423, -58133022 ^ 429127378);
               break label21;
            }
         } catch (MatchException var18) {
            throw lllIl(var18);
         }

         var10000 = IlIIII(-240972422, -58133022 ^ 1831853008);
      }

      int var16 = lIllI(var10000, var15);
      IlIIlllIl.llIl(this.lIll, var1, var3, var5, var7 - 2.0, 5.5, var16);
      if (var10) {
         int var17 = (int)(220.0 * var13);
         IlIIlllIl.llIl(this.lIll, var1 + 1.5, var3 + 6.0, 2.0, Math.max(2.0, var7 - 14.0), 1.0, lIllI(this.ll(), var17));
      }
   }

   private static String llII(int var0, int var1) {
      int var9 = -610406758;
      int var2 = (var0 ^ IlIIII(-240972421, var9 ^ -1438807151)) & IlIIII(-240972428, var9 ^ 1865476202);
      if (IIll[var2] == null) {
         char[] var3 = IIIl[var2].toCharArray();

         int var4 = switch (var3[0] & IlIIII(-240972427, var9 ^ -1507870257)) {
            case 0 -> IlIIII(-240972426, var9 ^ -1951152507);
            case 1 -> IlIIII(-240972425, var9 ^ -88549535);
            case 2 -> IlIIII(-240972432, var9 ^ -564952501);
            case 3 -> IlIIII(-240972431, var9 ^ 2131545069);
            case 4 -> IlIIII(-240972430, var9 ^ -271842633);
            case 5 -> IlIIII(-240972429, var9 ^ -905604041);
            case 6 -> IlIIII(-240972436, var9 ^ -788979754);
            case 7 -> IlIIII(-240972435, var9 ^ -125061610);
            case 8 -> IlIIII(-240972434, var9 ^ -388177035);
            case 9 -> IlIIII(-240972433, var9 ^ 1468072668);
            case 10 -> IlIIII(-240972440, var9 ^ -1777338881);
            case 11 -> IlIIII(-240972439, var9 ^ 381025961);
            case 12 -> IlIIII(-240972438, var9 ^ -1765045261);
            case 13 -> IlIIII(-240972437, var9 ^ -1389610930);
            case 14 -> IlIIII(-240972444, var9 ^ 440584670);
            case 15 -> IlIIII(-240972443, var9 ^ -1145160655);
            case 16 -> IlIIII(-240972442, var9 ^ 1036988115);
            case 17 -> IlIIII(-240972441, var9 ^ -1815177718);
            case 18 -> IlIIII(-240972448, var9 ^ 1831182597);
            case 19 -> IlIIII(-240972447, var9 ^ 594027621);
            case 20 -> IlIIII(-240972446, var9 ^ 2000962285);
            case 21 -> IlIIII(-240972445, var9 ^ -1580435309);
            case 22 -> IlIIII(-240972452, var9 ^ -1347080911);
            case 23 -> IlIIII(-240972451, var9 ^ -398003060);
            case 24 -> IlIIII(-240972450, var9 ^ -1681815629);
            case 25 -> IlIIII(-240972449, var9 ^ 95424265);
            case 26 -> IlIIII(-240972456, var9 ^ -713470531);
            case 27 -> IlIIII(-240972455, var9 ^ 1625210016);
            case 28 -> IlIIII(-240972454, var9 ^ -957762604);
            case 29 -> IlIIII(-240972453, var9 ^ 596650944);
            case 30 -> IlIIII(-240972460, var9 ^ -403653171);
            case 31 -> IlIIII(-240972459, var9 ^ -586032774);
            case 32 -> IlIIII(-240972458, var9 ^ 912712798);
            case 33 -> IlIIII(-240972457, var9 ^ 175223657);
            case 34 -> IlIIII(-240972464, var9 ^ -565561710);
            case 35 -> IlIIII(-240972463, var9 ^ 1303390595);
            case 36 -> IlIIII(-240972462, var9 ^ 1563741670);
            case 37 -> 4;
            case 38 -> IlIIII(-240972461, var9 ^ -884526680);
            case 39 -> IlIIII(-240972468, var9 ^ 654339995);
            case 40 -> 1;
            case 41 -> IlIIII(-240972467, var9 ^ -1048421321);
            case 42 -> IlIIII(-240972466, var9 ^ 218066365);
            case 43 -> IlIIII(-240972465, var9 ^ 622764696);
            case 44 -> IlIIII(-240972472, var9 ^ 1584601398);
            case 45 -> IlIIII(-240972471, var9 ^ -1176377718);
            case 46 -> IlIIII(-240972470, var9 ^ -1320860308);
            case 47 -> IlIIII(-240972469, var9 ^ 140106003);
            case 48 -> IlIIII(-240972476, var9 ^ -117122229);
            case 49 -> IlIIII(-240972475, var9 ^ 674676766);
            case 50 -> IlIIII(-240972474, var9 ^ 1389527944);
            case 51 -> IlIIII(-240972473, var9 ^ -1822581579);
            case 52 -> IlIIII(-240972480, var9 ^ -1277847275);
            case 53 -> IlIIII(-240972479, var9 ^ 1310785627);
            case 54 -> IlIIII(-240972478, var9 ^ -8481498);
            case 55 -> IlIIII(-240972477, var9 ^ -617660887);
            case 56 -> IlIIII(-240972356, var9 ^ 1999205300);
            case 57 -> IlIIII(-240972355, var9 ^ -1910613504);
            case 58 -> IlIIII(-240972354, var9 ^ -988421647);
            case 59 -> IlIIII(-240972353, var9 ^ -2123064611);
            case 60 -> IlIIII(-240972360, var9 ^ -481440978);
            case 61 -> IlIIII(-240972359, var9 ^ 612990579);
            case 62 -> IlIIII(-240972358, var9 ^ -1748502251);
            case 63 -> IlIIII(-240972357, var9 ^ 1321634322);
            case 64 -> IlIIII(-240972364, var9 ^ 1170232120);
            case 65 -> IlIIII(-240972363, var9 ^ 1101838006);
            case 66 -> IlIIII(-240972362, var9 ^ 1847045436);
            case 67 -> IlIIII(-240972361, var9 ^ 797449308);
            case 68 -> IlIIII(-240972368, var9 ^ 772612718);
            case 69 -> IlIIII(-240972367, var9 ^ 1089694044);
            case 70 -> IlIIII(-240972366, var9 ^ -1183798351);
            case 71 -> IlIIII(-240972365, var9 ^ -1530815117);
            case 72 -> IlIIII(-240972372, var9 ^ -426395762);
            case 73 -> IlIIII(-240972371, var9 ^ 488421749);
            case 74 -> IlIIII(-240972370, var9 ^ 695192269);
            case 75 -> IlIIII(-240972369, var9 ^ -763167201);
            case 76 -> IlIIII(-240972376, var9 ^ -1814115664);
            case 77 -> IlIIII(-240972375, var9 ^ 785240405);
            case 78 -> IlIIII(-240972374, var9 ^ -539411945);
            case 79 -> IlIIII(-240972373, var9 ^ 959444817);
            case 80 -> IlIIII(-240972380, var9 ^ 2128734521);
            case 81 -> IlIIII(-240972379, var9 ^ 207087685);
            case 82 -> IlIIII(-240972378, var9 ^ 166375177);
            case 83 -> IlIIII(-240972377, var9 ^ -1379791769);
            case 84 -> IlIIII(-240972384, var9 ^ -882905744);
            case 85 -> IlIIII(-240972383, var9 ^ 816369766);
            case 86 -> IlIIII(-240972382, var9 ^ -1105382331);
            case 87 -> IlIIII(-240972381, var9 ^ -1478372099);
            case 88 -> IlIIII(-240972388, var9 ^ 1572994356);
            case 89 -> IlIIII(-240972387, var9 ^ 740526437);
            case 90 -> IlIIII(-240972386, var9 ^ 310476351);
            case 91 -> IlIIII(-240972385, var9 ^ 1964807325);
            case 92 -> IlIIII(-240972392, var9 ^ -982046499);
            case 93 -> IlIIII(-240972391, var9 ^ 1976415640);
            case 94 -> IlIIII(-240972390, var9 ^ -664648443);
            case 95 -> IlIIII(-240972389, var9 ^ -2074862746);
            case 96 -> IlIIII(-240972396, var9 ^ -680954915);
            case 97 -> IlIIII(-240972395, var9 ^ 1849200784);
            case 98 -> IlIIII(-240972394, var9 ^ 154697654);
            case 99 -> IlIIII(-240972393, var9 ^ 646749502);
            case 100 -> IlIIII(-240972400, var9 ^ -65951200);
            case 101 -> IlIIII(-240972399, var9 ^ -1401473274);
            case 102 -> IlIIII(-240972398, var9 ^ 1522234335);
            case 103 -> IlIIII(-240972397, var9 ^ -1496980150);
            case 104 -> IlIIII(-240972404, var9 ^ -613573826);
            case 105 -> IlIIII(-240972403, var9 ^ 791145420);
            case 106 -> IlIIII(-240972402, var9 ^ 590994397);
            case 107 -> IlIIII(-240972401, var9 ^ 191588238);
            case 108 -> IlIIII(-240972408, var9 ^ -1346798348);
            case 109 -> IlIIII(-240972407, var9 ^ -238812678);
            case 110 -> IlIIII(-240972406, var9 ^ 1671584664);
            case 111 -> IlIIII(-240972405, var9 ^ 684580636);
            case 112 -> IlIIII(-240972412, var9 ^ 1093427094);
            case 113 -> IlIIII(-240972411, var9 ^ -1505602034);
            case 114 -> IlIIII(-240972410, var9 ^ 320389780);
            case 115 -> IlIIII(-240972409, var9 ^ 1928955684);
            case 116 -> IlIIII(-240972416, var9 ^ 2025717852);
            case 117 -> IlIIII(-240972415, var9 ^ 1215981148);
            case 118 -> IlIIII(-240972414, var9 ^ -1701127473);
            case 119 -> IlIIII(-240972413, var9 ^ 147373512);
            case 120 -> IlIIII(-240972292, var9 ^ 356716854);
            case 121 -> IlIIII(-240972291, var9 ^ 572559373);
            case 122 -> IlIIII(-240972290, var9 ^ -1406643932);
            case 123 -> IlIIII(-240972289, var9 ^ -1141706701);
            case 124 -> IlIIII(-240972296, var9 ^ 685730454);
            case 125 -> IlIIII(-240972295, var9 ^ -687925811);
            case 126 -> IlIIII(-240972294, var9 ^ -1630123139);
            case 127 -> IlIIII(-240972293, var9 ^ 715994900);
            case 128 -> IlIIII(-240972300, var9 ^ -1831979220);
            case 129 -> IlIIII(-240972299, var9 ^ -1376815404);
            case 130 -> IlIIII(-240972298, var9 ^ 682514723);
            case 131 -> IlIIII(-240972297, var9 ^ -704222995);
            case 132 -> IlIIII(-240972304, var9 ^ -1171869765);
            case 133 -> IlIIII(-240972303, var9 ^ 1971654272);
            case 134 -> IlIIII(-240972302, var9 ^ 653321463);
            case 135 -> IlIIII(-240972301, var9 ^ 1588133068);
            case 136 -> IlIIII(-240972308, var9 ^ 1258363203);
            case 137 -> IlIIII(-240972307, var9 ^ -1279976650);
            case 138 -> IlIIII(-240972306, var9 ^ -1412037718);
            case 139 -> IlIIII(-240972305, var9 ^ -1824613907);
            case 140 -> IlIIII(-240972312, var9 ^ 547696750);
            case 141 -> IlIIII(-240972311, var9 ^ 1627144641);
            case 142 -> IlIIII(-240972310, var9 ^ -1681854300);
            case 143 -> IlIIII(-240972309, var9 ^ -1447133749);
            case 144 -> IlIIII(-240972316, var9 ^ 1306064471);
            case 145 -> IlIIII(-240972315, var9 ^ -252361931);
            case 146 -> IlIIII(-240972314, var9 ^ -2130212820);
            case 147 -> IlIIII(-240972313, var9 ^ 1513275018);
            case 148 -> IlIIII(-240972320, var9 ^ 1534226087);
            case 149 -> IlIIII(-240972319, var9 ^ 81246050);
            case 150 -> IlIIII(-240972318, var9 ^ -245706206);
            case 151 -> IlIIII(-240972317, var9 ^ -1220284454);
            case 152 -> IlIIII(-240972324, var9 ^ 559908697);
            case 153 -> IlIIII(-240972323, var9 ^ 980117543);
            case 154 -> IlIIII(-240972322, var9 ^ 1218138461);
            case 155 -> IlIIII(-240972321, var9 ^ -633522214);
            case 156 -> IlIIII(-240972328, var9 ^ -1642173593);
            case 157 -> IlIIII(-240972327, var9 ^ -1540337212);
            case 158 -> IlIIII(-240972326, var9 ^ -886765238);
            case 159 -> IlIIII(-240972325, var9 ^ -1222280581);
            case 160 -> IlIIII(-240972332, var9 ^ -1700898333);
            case 161 -> IlIIII(-240972331, var9 ^ -655438713);
            case 162 -> IlIIII(-240972330, var9 ^ -1360428054);
            case 163 -> IlIIII(-240972329, var9 ^ 558589830);
            case 164 -> IlIIII(-240972336, var9 ^ 1429991717);
            case 165 -> IlIIII(-240972335, var9 ^ 382362824);
            case 166 -> IlIIII(-240972334, var9 ^ -45371324);
            case 167 -> IlIIII(-240972333, var9 ^ 106756611);
            case 168 -> IlIIII(-240972340, var9 ^ -1984813321);
            case 169 -> IlIIII(-240972339, var9 ^ 356899588);
            case 170 -> IlIIII(-240972338, var9 ^ 801874018);
            case 171 -> IlIIII(-240972337, var9 ^ -258222042);
            case 172 -> IlIIII(-240972344, var9 ^ 96970674);
            case 173 -> IlIIII(-240972343, var9 ^ -612361525);
            case 174 -> IlIIII(-240972342, var9 ^ 259351660);
            case 175 -> IlIIII(-240972341, var9 ^ 792144041);
            case 176 -> 2;
            case 177 -> IlIIII(-240972348, var9 ^ -319781860);
            case 178 -> IlIIII(-240972347, var9 ^ -533213515);
            case 179 -> IlIIII(-240972346, var9 ^ -84176907);
            case 180 -> IlIIII(-240972345, var9 ^ 1762292413);
            case 181 -> IlIIII(-240972352, var9 ^ -1257896282);
            case 182 -> IlIIII(-240972351, var9 ^ -1030238194);
            case 183 -> IlIIII(-240972350, var9 ^ -389491845);
            case 184 -> IlIIII(-240972349, var9 ^ 1565003171);
            case 185 -> IlIIII(-240972740, var9 ^ -394682959);
            case 186 -> IlIIII(-240972739, var9 ^ 1590375470);
            case 187 -> IlIIII(-240972738, var9 ^ -811280801);
            case 188 -> IlIIII(-240972737, var9 ^ 68368291);
            case 189 -> IlIIII(-240972744, var9 ^ -689345930);
            case 190 -> IlIIII(-240972743, var9 ^ -1792614329);
            case 191 -> IlIIII(-240972742, var9 ^ 335223765);
            case 192 -> IlIIII(-240972741, var9 ^ 898813506);
            case 193 -> IlIIII(-240972748, var9 ^ 1763626690);
            case 194 -> IlIIII(-240972747, var9 ^ -1897323396);
            case 195 -> IlIIII(-240972746, var9 ^ -665415397);
            case 196 -> IlIIII(-240972745, var9 ^ -1827425398);
            case 197 -> IlIIII(-240972752, var9 ^ 845436981);
            case 198 -> IlIIII(-240972751, var9 ^ 1069054399);
            case 199 -> IlIIII(-240972750, var9 ^ 1953052273);
            case 200 -> IlIIII(-240972749, var9 ^ -286579223);
            case 201 -> IlIIII(-240972756, var9 ^ -34552085);
            case 202 -> IlIIII(-240972755, var9 ^ -924336977);
            case 203 -> IlIIII(-240972754, var9 ^ -1884767786);
            case 204 -> IlIIII(-240972753, var9 ^ -1095141769);
            case 205 -> IlIIII(-240972760, var9 ^ 1227710207);
            case 206 -> IlIIII(-240972759, var9 ^ -495913175);
            case 207 -> IlIIII(-240972758, var9 ^ 2033400133);
            case 208 -> IlIIII(-240972757, var9 ^ -1109986112);
            case 209 -> IlIIII(-240972764, var9 ^ 801078023);
            case 210 -> IlIIII(-240972763, var9 ^ -503233848);
            case 211 -> IlIIII(-240972762, var9 ^ 889976898);
            case 212 -> IlIIII(-240972761, var9 ^ 149150670);
            case 213 -> IlIIII(-240972768, var9 ^ -1012397067);
            case 214 -> IlIIII(-240972767, var9 ^ 1405612616);
            case 215 -> IlIIII(-240972766, var9 ^ -1775767744);
            case 216 -> IlIIII(-240972765, var9 ^ 1291700219);
            case 217 -> 3;
            case 218 -> IlIIII(-240972772, var9 ^ -1285172094);
            case 219 -> IlIIII(-240972771, var9 ^ -1143874335);
            case 220 -> IlIIII(-240972770, var9 ^ -337369953);
            case 221 -> IlIIII(-240972769, var9 ^ -60366104);
            case 222 -> IlIIII(-240972776, var9 ^ -1496740361);
            case 223 -> IlIIII(-240972775, var9 ^ -801275709);
            case 224 -> IlIIII(-240972774, var9 ^ 900724260);
            case 225 -> IlIIII(-240972773, var9 ^ -1339035720);
            case 226 -> IlIIII(-240972780, var9 ^ 997082972);
            case 227 -> IlIIII(-240972779, var9 ^ -21795572);
            case 228 -> IlIIII(-240972778, var9 ^ 150939371);
            case 229 -> IlIIII(-240972777, var9 ^ 1299262418);
            case 230 -> IlIIII(-240972784, var9 ^ -1087646744);
            case 231 -> IlIIII(-240972783, var9 ^ 741582445);
            case 232 -> IlIIII(-240972782, var9 ^ 633437397);
            case 233 -> IlIIII(-240972781, var9 ^ -1604973254);
            case 234 -> 5;
            case 235 -> IlIIII(-240972788, var9 ^ 1337832657);
            case 236 -> IlIIII(-240972787, var9 ^ 1340078016);
            case 237 -> IlIIII(-240972786, var9 ^ 475747218);
            case 238 -> IlIIII(-240972785, var9 ^ -1527360077);
            case 239 -> IlIIII(-240972792, var9 ^ 2016524534);
            case 240 -> IlIIII(-240972791, var9 ^ -965228157);
            case 241 -> IlIIII(-240972790, var9 ^ 378150353);
            case 242 -> IlIIII(-240972789, var9 ^ -662496346);
            case 243 -> IlIIII(-240972796, var9 ^ -1612178744);
            case 244 -> 0;
            case 245 -> IlIIII(-240972795, var9 ^ -121385471);
            case 246 -> IlIIII(-240972794, var9 ^ -1954143802);
            case 247 -> IlIIII(-240972793, var9 ^ -1671457024);
            case 248 -> IlIIII(-240972800, var9 ^ 1925864461);
            case 249 -> IlIIII(-240972799, var9 ^ 1403109148);
            case 250 -> IlIIII(-240972798, var9 ^ -1615841925);
            case 251 -> IlIIII(-240972797, var9 ^ 1481401755);
            case 252 -> IlIIII(-240972676, var9 ^ 809599569);
            case 253 -> IlIIII(-240972675, var9 ^ 647850830);
            case 254 -> IlIIII(-240972674, var9 ^ -1186973771);
            default -> IlIIII(-240972673, var9 ^ 1227982728);
         };
         int var5 = (var1 & IlIIII(-240972680, var9 ^ -383588376)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IlIIII(-240972679, var9 ^ -1729731576)) >>> IlIIII(-240972678, var9 ^ -132747502)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IlIIII(-240972677, var9 ^ 467088126);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IlIIII(-240972684, var9 ^ 2067809326);
            }
         }

         IIll[var2] = new String(var3).intern();
      }

      return IIll[var2];
   }

   void llIl(double var1, double var3, int var5) {
      this.IlIlI(IIII(lIIl), var1, var3, 14.0, var5);
   }

   void lllI(double var1, double var3, double var5, double var7, IIIlIlIl var9, boolean var10, double var11) {
      IIIlIlIl var10000;
      label44: {
         try {
            if (var9 == null) {
               var10000 = IlIIllIII.lII("");
               break label44;
            }
         } catch (MatchException var34) {
            throw lllIl(var34);
         }

         var10000 = var9;
      }

      IIIlIlIl var13 = var10000;

      label36: {
         try {
            if (var10) {
               var35 = IlIIII(-240972683, -322257545 ^ 1011562472);
               break label36;
            }
         } catch (MatchException var33) {
            throw lllIl(var33);
         }

         var35 = IlIIII(-240972682, -322257545 ^ -1564189204);
      }

      int var14 = var35;
      int var15 = IlIIII(-240972681, -322257545 ^ 1860064485);
      byte var16 = -1;
      double var17 = Math.min(IlIIlllIl.IlIllI(), var7 * 0.5);
      IlIIlllIl.llIl(this.lIll, var1, var3, var5, var7, var17, var14);
      IlIIlllIl.l(this.lIll, var1, var3, var5, var7, var17, var15);
      double var19 = IlIIlllIl.IIIllI();

      label28: {
         try {
            if (var11 <= 0.0) {
               var36 = 1.0;
               break label28;
            }
         } catch (MatchException var32) {
            throw lllIl(var32);
         }

         var36 = var11;
      }

      double var21 = var36;
      double var23 = Math.max(0.0, var5 - var19 * 2.0) / var21;
      IIIlIlIl var25 = this.lIlll(var13, var23);
      double var26 = this.IllI(var25) * var21;
      double var28 = var1 + (var5 - var26) * 0.5;
      double var30 = var3 + (var7 - IlIIlllIl.IlIlIl(this.III) * var21) * 0.5;
      this.Illll(var25, var28, var30, var16, var21);
   }

   void llll(int var1, int var2, double var3) {
   }

   void IIIII(IlIlll var1, double var2, double var4, double var6, double var8, boolean var10) {
      int var10000;
      label56: {
         try {
            if (var10) {
               var10000 = IlIIII(-240972688, 889708795 ^ 1079068165);
               break label56;
            }
         } catch (MatchException var28) {
            throw lllIl(var28);
         }

         var10000 = IlIIII(-240972687, 889708795 ^ 1913099033);
      }

      int var11 = var10000;

      label48: {
         try {
            if (var10) {
               var10000 = this.Il();
               break label48;
            }
         } catch (MatchException var27) {
            throw lllIl(var27);
         }

         var10000 = this.IIlIlI();
      }

      int var12 = var10000;
      double var15 = var4 + Math.max(0.0, (var8 - var8) * 0.5);
      IlIIlllIl.llIl(this.lIll, var2, var15, var6, var8, IlIIlllIl.IlIllI(), var11);
      double var17 = 14.0;
      double var19 = IlIIlllIl.IIIllI();
      IIIlIlIl var21 = this.lIlll(var1.II(), Math.max(0.0, var6 - var17 - var19 - IlIIlllIl.IIIllI() * 2.0));
      double var22 = var17 + var19 + this.IllI(var21);
      double var24 = var2 + Math.max(IlIIlllIl.IIIllI(), (var6 - var22) * 0.5);

      IIIlIlIl var10001;
      label40: {
         label39: {
            label38: {
               label37: {
                  try {
                     var30 = this;
                     switch (IIIIIIIl.l[var1.ordinal()]) {
                        case 1:
                           var10001 = llI;
                           break label40;
                        case 2:
                           break label39;
                        case 3:
                           break label38;
                        case 4:
                           break label37;
                     }
                  } catch (MatchException var26) {
                     throw lllIl(var26);
                  }

                  var10001 = lIlI;
                  break label40;
               }

               var10001 = Il;
               break label40;
            }

            var10001 = lIl;
            break label40;
         }

         var10001 = IIIIl;
      }

      var30.IlIlI(IIII(var10001), var24, var15 + (var8 - var17) * 0.5, var17, var12);
      this.IIIl(var21, var24 + var17 + var19, this.lIlI(var15, var8), var12);
   }

   void IIIIl(double var1, double var3, int var5) {
      this.IlIlI(IIII(IIlI), var1, var3, 14.0, var5);
   }

   void IIIlI(String var1, double var2, double var4, double var6, int var8, double var9) {
      double var11 = var6 / var9;
      this.llI(this.IIlIIl(var1, var11), var2, var4, var8, var9);
   }

   void IIIll(double param1, double param3, double param5, double param7, String param9, String param10, double param11, double param13) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w -240972686
      // 03: ldc_w -1456513047
      // 06: ldc_w -940910251
      // 09: ixor
      // 0a: invokestatic k74/x/lllIIII.IlIIII (II)I
      // 0d: istore 15
      // 0f: ldc2_w 4.0
      // 12: dload 7
      // 14: ldc2_w 0.5
      // 17: dmul
      // 18: invokestatic java/lang/Math.min (DD)D
      // 1b: dstore 16
      // 1d: aload 0
      // 1e: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 21: dload 1
      // 22: dload 3
      // 23: dload 5
      // 25: dload 7
      // 27: dload 16
      // 29: iload 15
      // 2b: invokestatic k74/x/IlIIlllIl.llIl (Lnet/minecraft/class_332;DDDDDI)V
      // 2e: dconst_1
      // 2f: dconst_1
      // 30: dconst_0
      // 31: dconst_1
      // 32: dload 11
      // 34: invokestatic java/lang/Math.min (DD)D
      // 37: invokestatic java/lang/Math.max (DD)D
      // 3a: dsub
      // 3b: ldc2_w 3.0
      // 3e: invokestatic java/lang/Math.pow (DD)D
      // 41: dsub
      // 42: dstore 18
      // 44: aload 0
      // 45: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 48: dload 1
      // 49: dload 3
      // 4a: dload 1
      // 4b: dload 5
      // 4d: dadd
      // 4e: dload 3
      // 4f: dload 7
      // 51: dadd
      // 52: dconst_0
      // 53: invokestatic k74/x/IlIIlllIl.Ill (Lnet/minecraft/class_332;DDDDD)V
      // 56: aload 9
      // 58: ifnull 8c
      // 5b: aload 9
      // 5d: invokevirtual java/lang/String.isBlank ()Z
      // 60: ifne 8c
      // 63: dload 18
      // 65: dconst_1
      // 66: dcmpg
      // 67: ifge 8c
      // 6a: goto 71
      // 6d: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 70: athrow
      // 71: aload 0
      // 72: aload 9
      // 74: dload 1
      // 75: dload 3
      // 76: dload 7
      // 78: dload 18
      // 7a: dmul
      // 7b: dsub
      // 7c: dload 5
      // 7e: dload 7
      // 80: dload 13
      // 82: invokevirtual k74/x/lllIIII.lIIII (Ljava/lang/String;DDDDD)V
      // 85: goto 8c
      // 88: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8b: athrow
      // 8c: aload 0
      // 8d: aload 10
      // 8f: dload 1
      // 90: dload 3
      // 91: dload 7
      // 93: dconst_1
      // 94: dload 18
      // 96: dsub
      // 97: dmul
      // 98: dadd
      // 99: dload 5
      // 9b: dload 7
      // 9d: dload 13
      // 9f: invokevirtual k74/x/lllIIII.lIIII (Ljava/lang/String;DDDDD)V
      // a2: aload 0
      // a3: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // a6: invokestatic k74/x/IlIIlllIl.IlllII (Lnet/minecraft/class_332;)V
      // a9: goto b8
      // ac: astore 20
      // ae: aload 0
      // af: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // b2: invokestatic k74/x/IlIIlllIl.IlllII (Lnet/minecraft/class_332;)V
      // b5: aload 20
      // b7: athrow
      // b8: return
   }

   int IIlII(int var1) {
      return IlI(this.IllI.lIIII(), var1);
   }

   void IIlIl(String var1, double var2, double var4, double var6, int var8) {
      this.IIIIll(this.IIlIIl(var1, var6), var2, var4, var8);
   }

   int IIllI() {
      return IlI(this.IllI.IIl(), IlIIII(-240972685, -1587724306 ^ -522126347));
   }

   int IIlll(int var1) {
      return IlI(IIll(this.IllI.IIl(), this.IllI.lIlll(), 0.18), var1);
   }

   void IlIII(IlIlll var1, double var2, double var4, int var6) {
      lllIIII var10000;
      IIIlIlIl var10001;
      label28: {
         label27: {
            label26: {
               label25: {
                  try {
                     var10000 = this;
                     switch (IIIIIIIl.l[var1.ordinal()]) {
                        case 1:
                           var10001 = lIl;
                           break label28;
                        case 2:
                           break label27;
                        case 3:
                           break label26;
                        case 4:
                           break label25;
                     }
                  } catch (MatchException var7) {
                     throw lllIl(var7);
                  }

                  var10001 = lIlI;
                  break label28;
               }

               var10001 = Il;
               break label28;
            }

            var10001 = lIl;
            break label28;
         }

         var10001 = IIIIl;
      }

      var10000.IlIlI(IIII(var10001), var2, var4, 14.0, var6);
   }

   int IlIIl(int var1) {
      return IlI(IIll(this.IllI.IIIl(), this.IllI.IIl(), 0.72), var1);
   }

   void IlIlI(class_2960 var1, double var2, double var4, double var6, int var8) {
      IlIIlllIl.IIIl(this.lIll, var1, var2, var4, var6, var6, var8);
   }

   void IlIll(double var1, double var3, double var5, double var7, String var9, boolean var10) {
      this.IlIl(var1, var3, var5, var7, var9, var10, 1.0);
   }

   private void IllII(boolean[] var1, int[] var2, int var3, double var4, int[] var6, int var7) {
      try {
         if (!var1[0]) {
            return;
         }
      } catch (MatchException var10) {
         throw lllIl(var10);
      }

      int var8 = this.Illl(lIIIl(var7));

      try {
         if (var2[0] + var8 + var3 > var4) {
            var1[0] = false;
            return;
         }
      } catch (MatchException var9) {
         throw lllIl(var9);
      }

      var2[0] += var8;
      var6[0]++;
   }

   private void IllIl(double[] var1, double var2, int var4, int var5) {
      String var6 = lIIIl(var5);
      IlIIlllIl.IIll(this.lIll, this.III, var6, var1[0], var2, var4);
      var1[0] += this.Illl(var6);
   }

   void IlllI(double var1, double var3, double var5, boolean var7, boolean var8) {
      this.lII(var1, var3, var5, 25.0, var7, var8);
   }

   void Illll(IIIlIlIl param1, double param2, double param4, int param6, double param7) {
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
      // 05: invokevirtual k74/x/IIIlIlIl.lI ()Z
      // 08: ifeq 17
      // 0b: goto 12
      // 0e: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: return
      // 13: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: dload 7
      // 19: dconst_1
      // 1a: dcmpl
      // 1b: ifne 2d
      // 1e: aload 0
      // 1f: aload 1
      // 20: dload 2
      // 21: dload 4
      // 23: iload 6
      // 25: invokevirtual k74/x/lllIIII.IIIl (Lk74/x/IIIlIlIl;DDI)V
      // 28: return
      // 29: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 31: invokestatic k74/x/IlIIlllIl.IIllll (Lnet/minecraft/class_332;)V
      // 34: aload 0
      // 35: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 38: dload 2
      // 39: dload 4
      // 3b: invokestatic k74/x/IlIIlllIl.IlIIlI (Lnet/minecraft/class_332;DD)V
      // 3e: aload 0
      // 3f: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 42: dload 7
      // 44: dload 7
      // 46: invokestatic k74/x/IlIIlllIl.llIIIl (Lnet/minecraft/class_332;DD)V
      // 49: aload 0
      // 4a: aload 1
      // 4b: dconst_0
      // 4c: dconst_0
      // 4d: iload 6
      // 4f: invokevirtual k74/x/lllIIII.IIIl (Lk74/x/IIIlIlIl;DDI)V
      // 52: aload 0
      // 53: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 56: invokestatic k74/x/IlIIlllIl.lIIIll (Lnet/minecraft/class_332;)V
      // 59: goto 68
      // 5c: astore 9
      // 5e: aload 0
      // 5f: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 62: invokestatic k74/x/IlIIlllIl.lIIIll (Lnet/minecraft/class_332;)V
      // 65: aload 9
      // 67: athrow
      // 68: return
   }

   private void lIIII(String var1, double var2, double var4, double var6, double var8, double var10) {
      double var12 = 8.0;
      String var14 = IlIIlllIl.llIIl(this.III, var1, Math.max(0.0, var6 - var12 * 2.0) / var10);
      double var15 = var2 + (var6 - this.Illl(var14) * var10) * 0.5;
      double var17 = var4 + (var8 - IlIIlllIl.IlIlIl(this.III) * var10) * 0.5;
      this.llI(var14, var15, var17, -1, var10);
   }

   private static String lIIIl(int var0) {
      return new String(Character.toChars(var0));
   }

   int lIIlI(int var1) {
      return IlI(this.IllI.lIlll(), var1);
   }

   public void lIIll(int var1, int var2) {
   }

   void lIlII(IIIlIlIl var1, double var2, double var4, int var6, double var7) {
      IIIlIlIl var9 = this.lIlll(var1, var7);
      this.IIIl(var9, var2 - this.IllI(var9) * 0.5, var4, var6);
   }

   void lIlIl(double var1, double var3, boolean var5) {
      class_332 var10000;
      double var10001;
      double var10002;
      boolean var10003;
      int var10004;
      label16: {
         try {
            var10000 = this.lIll;
            var10001 = var1;
            var10002 = var3;
            var10003 = var5;
            if (var5) {
               var10004 = IlIIII(-240972692, -1119991862 ^ 704513791);
               break label16;
            }
         } catch (MatchException var6) {
            throw lllIl(var6);
         }

         var10004 = IlIIII(-240972691, -1119991862 ^ 222639672);
      }

      IlIIlllIl.llIII(var10000, var10001, var10002, var10003, var10004, -1);
   }

   static int lIllI(int var0, int var1) {
      int var2 = Math.max(0, Math.min(IlIIII(-240972690, -1229984471 ^ 1167274020), var1));
      return var2 << IlIIII(-240972689, -1229984471 ^ -1384646236) | var0 & IlIIII(-240972696, -1229984471 ^ -1835768971);
   }

   IIIlIlIl lIlll(IIIlIlIl param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1f
      // 04: aload 1
      // 05: invokevirtual k74/x/IIIlIlIl.lllI ()Z
      // 08: ifne 1f
      // 0b: goto 12
      // 0e: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: dload 2
      // 13: dconst_0
      // 14: dcmpg
      // 15: ifgt 2a
      // 18: goto 1f
      // 1b: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e: athrow
      // 1f: ldc_w ""
      // 22: invokestatic k74/x/IlIIllIII.lII (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 25: areturn
      // 26: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 29: athrow
      // 2a: aload 0
      // 2b: aload 1
      // 2c: invokevirtual k74/x/lllIIII.IllI (Lk74/x/IIIlIlIl;)I
      // 2f: i2d
      // 30: dload 2
      // 31: dcmpg
      // 32: ifgt 3b
      // 35: aload 1
      // 36: areturn
      // 37: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getstatic k74/x/lllIIII.lI Lk74/x/IIIlIlIl;
      // 3f: invokevirtual k74/x/lllIIII.IllI (Lk74/x/IIIlIlIl;)I
      // 42: istore 4
      // 44: bipush 1
      // 45: newarray 10
      // 47: dup
      // 48: bipush 0
      // 49: bipush 0
      // 4a: iastore
      // 4b: astore 5
      // 4d: bipush 1
      // 4e: newarray 10
      // 50: dup
      // 51: bipush 0
      // 52: bipush 0
      // 53: iastore
      // 54: astore 6
      // 56: bipush 1
      // 57: newarray 4
      // 59: dup
      // 5a: bipush 0
      // 5b: bipush 1
      // 5c: bastore
      // 5d: astore 7
      // 5f: aload 1
      // 60: aload 0
      // 61: aload 7
      // 63: aload 6
      // 65: iload 4
      // 67: dload 2
      // 68: aload 5
      // 6a: invokedynamic accept (Lk74/x/lllIIII;[Z[IID[I)Ljava/util/function/IntConsumer; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (I)V, k74/x/lllIIII.IllII ([Z[IID[II)V, (I)V ]
      // 6f: invokevirtual k74/x/IIIlIlIl.IIII (Ljava/util/function/IntConsumer;)V
      // 72: aload 1
      // 73: aload 5
      // 75: bipush 0
      // 76: iaload
      // 77: invokevirtual k74/x/IIIlIlIl.lII (I)Lk74/x/IIIlIlIl;
      // 7a: getstatic k74/x/lllIIII.lI Lk74/x/IIIlIlIl;
      // 7d: invokevirtual k74/x/IIIlIlIl.IIll (Lk74/x/IIIlIlIl;)Lk74/x/IIIlIlIl;
      // 80: areturn
   }

   void llIII(double var1, double var3, int var5) {
      this.IlIlI(IIII(lII), var1, var3, 14.0, var5);
   }

   private static int IlIIII(int var0, int var1) {
      int var2 = IIIll[var0 ^ -240972484] ^ var1 ^ var0;
      var2 += 18016;
      var2 += 40550;
      var2 ^= 27559;
      var2 -= 62383;
      var2 ^= 56631;
      var2 ^= 6123;
      var2 ^= 26252;
      return var2 ^ 49805;
   }

   void llIIl(String var1, double var2, double var4, int var6, double var7) {
      String var9 = this.IIlIIl(var1, var7);
      this.IIIIll(var9, var2 - this.Illl(var9) * 0.5, var4, var6);
   }

   private void llIlI(double param1, double param3, double param5, String param7, double param8) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 7
      // 02: ifnull 14
      // 05: aload 7
      // 07: invokevirtual java/lang/String.isBlank ()Z
      // 0a: ifeq 19
      // 0d: goto 14
      // 10: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 13: athrow
      // 14: return
      // 15: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 18: athrow
      // 19: ldc2_w 14.0
      // 1c: dload 5
      // 1e: ldc2_w 4.0
      // 21: dsub
      // 22: invokestatic java/lang/Math.max (DD)D
      // 25: dload 8
      // 27: ddiv
      // 28: dstore 10
      // 2a: aload 0
      // 2b: aload 7
      // 2d: dload 10
      // 2f: invokevirtual k74/x/lllIIII.IIlIII (Ljava/lang/String;D)Ljava/lang/String;
      // 32: astore 12
      // 34: aload 0
      // 35: aload 12
      // 37: invokevirtual k74/x/lllIIII.Illl (Ljava/lang/String;)I
      // 3a: i2d
      // 3b: dload 8
      // 3d: dmul
      // 3e: dstore 13
      // 40: dload 3
      // 41: ldc2_w 24.0
      // 44: aload 0
      // 45: getfield k74/x/lllIIII.III Lnet/minecraft/class_327;
      // 48: invokestatic k74/x/IlIIlllIl.IlIlIl (Lnet/minecraft/class_327;)D
      // 4b: dload 8
      // 4d: dmul
      // 4e: dsub
      // 4f: ldc2_w 0.5
      // 52: dmul
      // 53: dadd
      // 54: dstore 15
      // 56: aload 0
      // 57: aload 12
      // 59: dload 1
      // 5a: dload 5
      // 5c: dadd
      // 5d: dload 13
      // 5f: dsub
      // 60: dload 15
      // 62: bipush -1
      // 63: dload 8
      // 65: invokevirtual k74/x/lllIIII.llI (Ljava/lang/String;DDID)V
      // 68: return
   }

   void llIll(double var1, double var3, double var5, double var7, boolean var9) {
      this.IIllIl(var1, var3, var5, var7, var9, 1.0);
   }

   void lllII(double var1, double var3, double var5, double var7, double var9, String var11) {
      this.III(var1, var3, var5, var7, var9, var11, 1.0);
   }

   private static MatchException lllIl(MatchException var0) {
      return var0;
   }

   void llllI(double var1, double var3, double var5, IIllIIl var7, boolean var8) {
      this.I(var1, var3, var5, var7, var8, 1.0);
   }

   void lllll(double var1, double var3, double var5, double var7, String var9, boolean var10, double var11) {
      double var13 = IIIllI(var7, 0.0, 1.0);
      double var15 = var3 + 21.0;
      double var17 = var15 - 4.0;
      double var19 = 4.0;
      double var21 = 7.0;
      double var23 = var1 + IIIllI(var5 * var13, var21, Math.max(var21, var5 - var21));
      int var25 = this.ll();
      int var26 = this.IIlllI();
      IlIIlllIl.llIl(this.lIll, var1, var17, var5, 8.0, var19, IlIIII(-240972695, 199773593 ^ 420567543));
      if (var10) {
         double var27 = Math.max(8.0, Math.min(var5, var23 - var1 + var21));
         IlIIlllIl.lllIII(this.lIll, var1, var17, var27, 8.0, var19, var25, var26);
      }

      double var31 = var23 - var21;
      double var29 = var15 - 4.0;
      IlIIlllIl.llIl(this.lIll, var31, var29, 14.0, 8.0, 4.0, -1);
      IlIIlllIl.l(this.lIll, var31, var29, 14.0, 8.0, 4.0, IlIIII(-240972694, 199773593 ^ -1095308292));
      this.llIlI(var1, var3, var5, var9, var11);
   }

   void IIIIII(double var1, double var3, double var5, double var7, IIIlIlIl var9, boolean var10) {
      this.lllI(var1, var3, var5, var7, var9, var10, 1.0);
   }

   int IIIIIl(IIllIIl var1, double var2, double var4, int var6) {
      int var7 = (int)Math.round(IIIllI(var6, 0.0, 255.0));

      try {
         if (var7 <= 0) {
            return 0;
         }
      } catch (MatchException var8) {
         throw lllIl(var8);
      }

      return IlI(this.IllI.lllll(), var7);
   }

   int IIIIlI(int var1) {
      return IlI(IIll(this.IllI.IIl(), this.IllI.llII(), 0.32), var1);
   }

   void IIIIll(String param1, double param2, double param4, int param6) {
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
      // 05: invokevirtual java/lang/String.isBlank ()Z
      // 08: ifeq 17
      // 0b: goto 12
      // 0e: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: return
      // 13: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: getstatic k74/x/lllIIII.lllI Lk74/x/llIlIlll;
      // 1a: aload 1
      // 1b: invokevirtual k74/x/llIlIlll.equals (Ljava/lang/Object;)Z
      // 1e: ifeq 2c
      // 21: aload 0
      // 22: invokevirtual k74/x/lllIIII.ll ()I
      // 25: goto 2e
      // 28: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2b: athrow
      // 2c: iload 6
      // 2e: istore 7
      // 30: aload 0
      // 31: getfield k74/x/lllIIII.lIll Lnet/minecraft/class_332;
      // 34: aload 0
      // 35: getfield k74/x/lllIIII.III Lnet/minecraft/class_327;
      // 38: aload 1
      // 39: dload 2
      // 3a: dload 4
      // 3c: iload 7
      // 3e: invokestatic k74/x/IlIIlllIl.IIll (Lnet/minecraft/class_332;Lnet/minecraft/class_327;Ljava/lang/String;DDI)V
      // 41: return
   }

   void IIIlII(lllIIlIl var1, double var2, double var4, int var6) {
      lllIIII var10000;
      IIIlIlIl var10001;
      label36: {
         label35: {
            label34: {
               label33: {
                  label32: {
                     label31: {
                        try {
                           var10000 = this;
                           switch (IIIIIIIl.I[var1.ordinal()]) {
                              case 1:
                                 break label35;
                              case 2:
                                 break label34;
                              case 3:
                                 break label33;
                              case 4:
                                 break label32;
                              case 5:
                                 break label31;
                              case 6:
                                 break;
                              default:
                                 throw new MatchException(null, null);
                           }
                        } catch (MatchException var7) {
                           throw lllIl(var7);
                        }

                        var10001 = lIlI;
                        break label36;
                     }

                     var10001 = llI;
                     break label36;
                  }

                  var10001 = l;
                  break label36;
               }

               var10001 = Ill;
               break label36;
            }

            var10001 = llll;
            break label36;
         }

         var10001 = IIl;
      }

      var10000.IlIlI(IIII(var10001), var2, var4, 14.0, var6);
   }

   void IIIlIl(double var1, double var3, boolean var5, int var6) {
      lllIIII var10000;
      IIIlIlIl var10001;
      label16: {
         try {
            var10000 = this;
            if (var5) {
               var10001 = I;
               break label16;
            }
         } catch (MatchException var7) {
            throw lllIl(var7);
         }

         var10001 = Illl;
      }

      var10000.IlIlI(IIII(var10001), var1, var3, 14.0, var6);
   }

   lllIIII() {
   }

   static double IIIllI(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   void IIIlll(IIIlIlIl var1, double var2, double var4, double var6, int var8, double var9) {
      double var11 = var6 / var9;
      this.Illll(this.lIlll(var1, var11), var2, var4, var8, var9);
   }

   private String IIlIII(String param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 4
      // 005: aload 1
      // 006: ifnull 029
      // 009: aload 1
      // 00a: invokevirtual java/lang/String.isEmpty ()Z
      // 00d: ifne 029
      // 010: goto 017
      // 013: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 016: athrow
      // 017: aload 0
      // 018: aload 1
      // 019: invokevirtual k74/x/lllIIII.Illl (Ljava/lang/String;)I
      // 01c: i2d
      // 01d: dload 2
      // 01e: dcmpg
      // 01f: ifgt 040
      // 022: goto 029
      // 025: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 028: athrow
      // 029: aload 1
      // 02a: ifnonnull 03e
      // 02d: goto 034
      // 030: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 033: athrow
      // 034: ldc_w ""
      // 037: goto 03f
      // 03a: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03d: athrow
      // 03e: aload 1
      // 03f: areturn
      // 040: aload 1
      // 041: invokevirtual java/lang/String.length ()I
      // 044: istore 5
      // 046: iload 5
      // 048: ifle 0c1
      // 04b: aload 1
      // 04c: iload 5
      // 04e: invokevirtual java/lang/String.codePointBefore (I)I
      // 051: istore 6
      // 053: iload 6
      // 055: invokestatic java/lang/Character.isDigit (I)Z
      // 058: ifne 0c1
      // 05b: iload 6
      // 05d: ldc_w -240972693
      // 060: ldc_w 2142362321
      // 063: ldc_w -473711140
      // 066: ixor
      // 067: invokestatic k74/x/lllIIII.IlIIII (II)I
      // 06a: if_icmpeq 0c1
      // 06d: goto 074
      // 070: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 073: athrow
      // 074: iload 6
      // 076: ldc_w -240972700
      // 079: ldc_w 2142362321
      // 07c: ldc_w 1265149892
      // 07f: ixor
      // 080: invokestatic k74/x/lllIIII.IlIIII (II)I
      // 083: if_icmpeq 0c1
      // 086: goto 08d
      // 089: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 08c: athrow
      // 08d: iload 6
      // 08f: ldc_w -240972699
      // 092: ldc_w 2142362321
      // 095: ldc_w 1549673836
      // 098: ixor
      // 099: invokestatic k74/x/lllIIII.IlIIII (II)I
      // 09c: if_icmpne 0b2
      // 09f: goto 0a6
      // 0a2: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a5: athrow
      // 0a6: aload 4
      // 0a8: ifnull 0c1
      // 0ab: goto 0b2
      // 0ae: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b1: athrow
      // 0b2: iload 5
      // 0b4: iload 6
      // 0b6: invokestatic java/lang/Character.charCount (I)I
      // 0b9: isub
      // 0ba: istore 5
      // 0bc: aload 4
      // 0be: ifnull 046
      // 0c1: iload 5
      // 0c3: ifle 0d6
      // 0c6: iload 5
      // 0c8: aload 1
      // 0c9: invokevirtual java/lang/String.length ()I
      // 0cc: if_icmplt 0e1
      // 0cf: goto 0d6
      // 0d2: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d5: athrow
      // 0d6: aload 0
      // 0d7: aload 1
      // 0d8: dload 2
      // 0d9: invokevirtual k74/x/lllIIII.IIlIIl (Ljava/lang/String;D)Ljava/lang/String;
      // 0dc: areturn
      // 0dd: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e0: athrow
      // 0e1: aload 1
      // 0e2: iload 5
      // 0e4: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 0e7: astore 6
      // 0e9: aload 0
      // 0ea: aload 6
      // 0ec: invokevirtual k74/x/lllIIII.Illl (Ljava/lang/String;)I
      // 0ef: i2d
      // 0f0: dstore 7
      // 0f2: dload 7
      // 0f4: dload 2
      // 0f5: dcmpl
      // 0f6: iflt 104
      // 0f9: aload 0
      // 0fa: aload 1
      // 0fb: dload 2
      // 0fc: invokevirtual k74/x/lllIIII.IIlIIl (Ljava/lang/String;D)Ljava/lang/String;
      // 0ff: areturn
      // 100: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 103: athrow
      // 104: aload 0
      // 105: aload 1
      // 106: bipush 0
      // 107: iload 5
      // 109: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 10c: dconst_0
      // 10d: dload 2
      // 10e: dload 7
      // 110: dsub
      // 111: invokestatic java/lang/Math.max (DD)D
      // 114: invokevirtual k74/x/lllIIII.IIlIIl (Ljava/lang/String;D)Ljava/lang/String;
      // 117: astore 9
      // 119: aload 9
      // 11b: invokevirtual java/lang/String.isBlank ()Z
      // 11e: ifeq 12a
      // 121: aload 6
      // 123: goto 146
      // 126: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 129: athrow
      // 12a: aload 9
      // 12c: aload 6
      // 12e: astore 11
      // 130: astore 10
      // 132: new java/lang/StringBuilder
      // 135: dup
      // 136: invokespecial java/lang/StringBuilder.<init> ()V
      // 139: aload 10
      // 13b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 13e: aload 11
      // 140: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 143: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 146: areturn
   }

   String IIlIIl(String param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 03: astore 4
      // 05: aload 1
      // 06: ifnull 17
      // 09: aload 1
      // 0a: invokevirtual java/lang/String.isEmpty ()Z
      // 0d: ifeq 1f
      // 10: goto 17
      // 13: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: ldc_w ""
      // 1a: areturn
      // 1b: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 1
      // 21: invokevirtual k74/x/lllIIII.Illl (Ljava/lang/String;)I
      // 24: i2d
      // 25: dload 2
      // 26: dcmpg
      // 27: ifgt 30
      // 2a: aload 1
      // 2b: areturn
      // 2c: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2f: athrow
      // 30: ldc_w -240972698
      // 33: ldc_w -1759296958
      // 36: ldc_w -1422044085
      // 39: ixor
      // 3a: invokestatic k74/x/lllIIII.IlIIII (II)I
      // 3d: ldc_w -240972697
      // 40: ldc_w -1759296958
      // 43: ldc_w -848893105
      // 46: ixor
      // 47: invokestatic k74/x/lllIIII.IlIIII (II)I
      // 4a: invokestatic k74/x/lllIIII.llII (II)Ljava/lang/String;
      // 4d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 50: astore 5
      // 52: aload 0
      // 53: aload 5
      // 55: invokevirtual k74/x/lllIIII.Illl (Ljava/lang/String;)I
      // 58: istore 6
      // 5a: new java/lang/StringBuilder
      // 5d: dup
      // 5e: aload 1
      // 5f: invokevirtual java/lang/String.length ()I
      // 62: invokespecial java/lang/StringBuilder.<init> (I)V
      // 65: astore 7
      // 67: bipush 0
      // 68: istore 8
      // 6a: iload 8
      // 6c: aload 1
      // 6d: invokevirtual java/lang/String.length ()I
      // 70: if_icmpge ce
      // 73: aload 7
      // 75: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 78: aload 1
      // 79: iload 8
      // 7b: invokevirtual java/lang/String.charAt (I)C
      // 7e: istore 11
      // 80: astore 10
      // 82: new java/lang/StringBuilder
      // 85: dup
      // 86: invokespecial java/lang/StringBuilder.<init> ()V
      // 89: aload 10
      // 8b: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 8e: iload 11
      // 90: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // 93: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 96: astore 9
      // 98: aload 0
      // 99: aload 9
      // 9b: invokevirtual k74/x/lllIIII.Illl (Ljava/lang/String;)I
      // 9e: iload 6
      // a0: iadd
      // a1: i2d
      // a2: dload 2
      // a3: dcmpl
      // a4: ifle b3
      // a7: aload 4
      // a9: ifnull ce
      // ac: goto b3
      // af: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b2: athrow
      // b3: aload 7
      // b5: aload 1
      // b6: iload 8
      // b8: invokevirtual java/lang/String.charAt (I)C
      // bb: invokevirtual java/lang/StringBuilder.append (C)Ljava/lang/StringBuilder;
      // be: pop
      // bf: iinc 8 1
      // c2: aload 4
      // c4: ifnull 6a
      // c7: goto ce
      // ca: invokestatic k74/x/lllIIII.lllIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // cd: athrow
      // ce: aload 7
      // d0: aload 5
      // d2: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // d5: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // d8: areturn
   }

   int IIlIlI() {
      return IlI(this.IllI.llII(), IlIIII(-240972704, 1068755943 ^ -483492189));
   }

   private static double IIlIll(double var0, double var2, double var4) {
      double var6 = 7.0;
      return var0 + IIIllI(var2 * var4, var6, Math.max(var6, var2 - var6));
   }

   private static String IIllII() {
      return IlIIllIII.lI(llII(IlIIII(-240972703, -720798290 ^ 1028457596), IlIIII(-240972702, -720798290 ^ -681158620)));
   }

   void IIllIl(double var1, double var3, double var5, double var7, boolean var9, double var10) {
      int var18 = -1844787853;
      double var12 = IIIllI(var10, 0.0, 1.0);
      int var14 = (int)(80.0 * var12);
      IlIIlllIl.lll(this.lIll, var1, var3, var5, var7, 10.0, var14 << IlIIII(-240972701, var18 ^ -1546030552), 6.0, 3, 0.4);
      int var15 = (int)(255.0 * var12);

      int var10000;
      label17: {
         try {
            IlIIlllIl.llIl(this.lIll, var1, var3, var5, var7, 10.0, lIllI(IlIIII(-240972708, var18 ^ 1878106422), var15));
            if (var9) {
               var10000 = IlIIII(-240972707, var18 ^ -1038670809);
               break label17;
            }
         } catch (MatchException var19) {
            throw lllIl(var19);
         }

         var10000 = IlIIII(-240972706, var18 ^ -749301846);
      }

      int var16 = var10000;
      IlIIlllIl.l(this.lIll, var1, var3, var5, var7, 10.0, lIllI(var16, var15));
      int var17 = (int)(22.0 * var12);
      IlIIlllIl.l(this.lIll, var1 + 1.0, var3 + 1.0, var5 - 2.0, var7 - 2.0, 9.0, lIllI(IlIIII(-240972705, var18 ^ 537333469), var17));
   }

   int IIlllI() {
      return IlI(this.IllI.lIIII(), IlIIII(-240972712, 840312528 ^ -130170514));
   }

   int IIllll(int var1) {
      return IlI(this.IllI.lIlI(), var1);
   }
}
