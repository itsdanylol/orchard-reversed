package k74.x;

import com.google.gson.JsonObject;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1661;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;

@Environment(EnvType.CLIENT)
public final class IIIllIl extends IlIIIIIIl {
   private static final int[] IIlIIl;
   private static final double II = 0.99;
   private static final double Il = 20.25;
   private float lI;
   private static final int ll = 9;
   private long III;
   private class_1268 IIl;
   private static final Object[] IIlIll;
   private final lIlllIl IlI;
   private int Ill;
   private static final double lII = 1.6;
   private int lIl;
   private static final double llI = 0.125;
   private class_2338 lll;
   private class_2338 IIII;
   private float IIIl;
   private static final double IIlI = 0.2;
   private float IIll;
   private int IlII;
   private float IlIl;
   private static final long IllI = 3000L;
   private int Illl;
   private boolean lIII;
   private final lllIIlII lIIl;
   private IIlIlIlll lIlI;
   private final IIlIII lIll;
   private static final int llII = 70;
   private static final int llIl = 10;
   private static final double lllI = 3.15;
   private final IlIIlll llll;
   private float IIIII;
   private static final double IIIIl = 0.08;
   private static final long IIIlI = 50L;
   private static final double IIIll = 0.0;
   private IIIIll IIlII;
   private class_2338 IIlIl;
   private int IIllI;
   private static final double IIlll = 0.58;
   private final IllIII<IlIIllIIl> IlIII;
   private IIlIlIlll IlIIl;
   private boolean IlIlI;
   private static final double IlIll = 1.0;
   private int IllII;
   private static final double IllIl = 0.0;
   private static final int IlllI = 2;
   private static final double Illll = 0.22;
   private float lIIII;
   private float lIIIl;
   private static final double lIIlI = 0.0625;
   private static final String[] lIIll;
   private int lIlII;
   private IIlIlIII lIlIl;
   private static final double lIllI = 0.38;
   private static final double lIlll = 0.05;
   private static final long llIII = 50L;
   private static final String[] IIlIlI;
   private int llIIl;
   private final IllIII<IlIIIllI> llIlI;
   private static final double llIll = 4.5;
   private static final String[] lllII;
   private static final int lllIl = 6;
   private static final IIIlIlIl llllI;
   private final lllIIlII lllll;
   private int IIIIII;
   private boolean IIIIIl;
   private final IIlIII IIIIlI;
   private final lllIIlII IIIIll;
   private float IIIlII;
   private static final long IIIlIl = 2500L;
   private long IIIllI;
   private static final IIIlIlIl IIIlll;
   private final IlIIIllll I;
   private static final int IIlIII = 1;

   private boolean I(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 004: ifnull 00d
      // 007: bipush 0
      // 008: ireturn
      // 009: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 00c: athrow
      // 00d: aload 1
      // 00e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 011: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 014: astore 2
      // 015: aload 0
      // 016: aload 2
      // 017: invokevirtual k74/x/IIIllIl.llIlI (Lnet/minecraft/class_1661;)Lk74/x/IIIIlIllI;
      // 01a: astore 3
      // 01b: aload 0
      // 01c: aload 2
      // 01d: invokevirtual k74/x/IIIllIl.lIllI (Lnet/minecraft/class_1661;)I
      // 020: istore 4
      // 022: aload 0
      // 023: aload 2
      // 024: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
      // 027: invokevirtual k74/x/IIIllIl.Illlll (Lnet/minecraft/class_1661;Lnet/minecraft/class_1792;)I
      // 02a: istore 5
      // 02c: aload 0
      // 02d: aload 1
      // 02e: invokevirtual k74/x/IIIllIl.lIlII (Lnet/minecraft/class_310;)Lk74/x/IIllllIll;
      // 031: astore 6
      // 033: aload 3
      // 034: ifnull 05b
      // 037: iload 4
      // 039: iflt 05b
      // 03c: goto 043
      // 03f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 042: athrow
      // 043: iload 5
      // 045: iflt 05b
      // 048: goto 04f
      // 04b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 04e: athrow
      // 04f: aload 6
      // 051: ifnonnull 061
      // 054: goto 05b
      // 057: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 05a: athrow
      // 05b: bipush 0
      // 05c: ireturn
      // 05d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 060: athrow
      // 061: aload 0
      // 062: aload 1
      // 063: aload 6
      // 065: invokevirtual k74/x/IIllllIll.I ()Lnet/minecraft/class_1799;
      // 068: invokevirtual k74/x/IIIllIl.IlIIll (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;)Lk74/x/lIIlIIll;
      // 06b: astore 7
      // 06d: aload 7
      // 06f: ifnull 08b
      // 072: aload 0
      // 073: aload 1
      // 074: aload 7
      // 076: invokevirtual k74/x/lIIlIIll.l ()Lnet/minecraft/class_2338;
      // 079: aload 7
      // 07b: invokevirtual k74/x/lIIlIIll.II ()Lnet/minecraft/class_2338;
      // 07e: invokevirtual k74/x/IIIllIl.IIlIII (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Z
      // 081: ifne 091
      // 084: goto 08b
      // 087: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 08a: athrow
      // 08b: bipush 0
      // 08c: ireturn
      // 08d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 090: athrow
      // 091: aload 1
      // 092: aload 0
      // 093: aload 7
      // 095: invokevirtual k74/x/lIIlIIll.l ()Lnet/minecraft/class_2338;
      // 098: invokevirtual k74/x/IIIllIl.IIlII (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 09b: invokestatic k74/x/IlllIlII.lIII (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 09e: astore 8
      // 0a0: aload 1
      // 0a1: aload 0
      // 0a2: aload 7
      // 0a4: invokevirtual k74/x/lIIlIIll.II ()Lnet/minecraft/class_2338;
      // 0a7: invokevirtual k74/x/IIIllIl.IIIlI (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 0aa: invokestatic k74/x/IlllIlII.lIII (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 0ad: astore 9
      // 0af: aload 1
      // 0b0: aload 0
      // 0b1: aload 7
      // 0b3: invokevirtual k74/x/lIIlIIll.II ()Lnet/minecraft/class_2338;
      // 0b6: invokevirtual k74/x/IIIllIl.llIll (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 0b9: invokestatic k74/x/IlllIlII.lIII (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 0bc: astore 10
      // 0be: aload 8
      // 0c0: ifnull 0db
      // 0c3: aload 9
      // 0c5: ifnull 0db
      // 0c8: goto 0cf
      // 0cb: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ce: athrow
      // 0cf: aload 10
      // 0d1: ifnonnull 0e1
      // 0d4: goto 0db
      // 0d7: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0da: athrow
      // 0db: bipush 0
      // 0dc: ireturn
      // 0dd: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e0: athrow
      // 0e1: aload 0
      // 0e2: aload 2
      // 0e3: invokestatic k74/x/IIll.IIlII (Lnet/minecraft/class_1661;)I
      // 0e6: putfield k74/x/IIIllIl.lIl I
      // 0e9: aload 0
      // 0ea: aload 3
      // 0eb: invokevirtual k74/x/IIIIlIllI.l ()I
      // 0ee: putfield k74/x/IIIllIl.Illl I
      // 0f1: aload 0
      // 0f2: aload 3
      // 0f3: invokevirtual k74/x/IIIIlIllI.I ()Lk74/x/IIIIll;
      // 0f6: putfield k74/x/IIIllIl.IIlII Lk74/x/IIIIll;
      // 0f9: aload 0
      // 0fa: iload 4
      // 0fc: putfield k74/x/IIIllIl.IlII I
      // 0ff: aload 0
      // 100: iload 5
      // 102: putfield k74/x/IIIllIl.llIIl I
      // 105: aload 0
      // 106: aload 0
      // 107: getfield k74/x/IIIllIl.lIIl Lk74/x/lllIIlII;
      // 10a: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 10d: checkcast java/lang/Boolean
      // 110: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 113: ifeq 12e
      // 116: aload 0
      // 117: aload 2
      // 118: invokevirtual k74/x/IIIllIl.IlllIIl (Lnet/minecraft/class_1661;)I
      // 11b: bipush 2
      // 11c: if_icmplt 12e
      // 11f: goto 126
      // 122: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 125: athrow
      // 126: bipush 2
      // 127: goto 12f
      // 12a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 12d: athrow
      // 12e: bipush 1
      // 12f: putfield k74/x/IIIllIl.IIIIII I
      // 132: aload 0
      // 133: bipush 0
      // 134: putfield k74/x/IIIllIl.lIlII I
      // 137: aload 0
      // 138: aload 6
      // 13a: invokevirtual k74/x/IIllllIll.II ()I
      // 13d: putfield k74/x/IIIllIl.Ill I
      // 140: aload 0
      // 141: aload 6
      // 143: invokevirtual k74/x/IIllllIll.l ()Lnet/minecraft/class_1268;
      // 146: putfield k74/x/IIIllIl.IIl Lnet/minecraft/class_1268;
      // 149: aload 0
      // 14a: aload 7
      // 14c: invokevirtual k74/x/lIIlIIll.l ()Lnet/minecraft/class_2338;
      // 14f: putfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 152: aload 0
      // 153: aload 7
      // 155: invokevirtual k74/x/lIIlIIll.II ()Lnet/minecraft/class_2338;
      // 158: putfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 15b: aload 0
      // 15c: aload 8
      // 15e: bipush 0
      // 15f: faload
      // 160: putfield k74/x/IIIllIl.IIIII F
      // 163: aload 0
      // 164: aload 8
      // 166: bipush 1
      // 167: faload
      // 168: putfield k74/x/IIIllIl.IIll F
      // 16b: aload 0
      // 16c: aload 9
      // 16e: bipush 0
      // 16f: faload
      // 170: putfield k74/x/IIIllIl.lIIIl F
      // 173: aload 0
      // 174: aload 9
      // 176: bipush 1
      // 177: faload
      // 178: putfield k74/x/IIIllIl.IIIlII F
      // 17b: aload 0
      // 17c: aload 10
      // 17e: bipush 0
      // 17f: faload
      // 180: putfield k74/x/IIIllIl.IIIl F
      // 183: aload 0
      // 184: aload 10
      // 186: bipush 1
      // 187: faload
      // 188: putfield k74/x/IIIllIl.lIIII F
      // 18b: aload 0
      // 18c: aload 7
      // 18e: invokevirtual k74/x/lIIlIIll.I ()F
      // 191: putfield k74/x/IIIllIl.IlIl F
      // 194: aload 0
      // 195: aload 7
      // 197: invokevirtual k74/x/lIIlIIll.Il ()F
      // 19a: putfield k74/x/IIIllIl.lI F
      // 19d: aload 0
      // 19e: getstatic k74/x/IIlIlIlll.II Lk74/x/IIlIlIlll;
      // 1a1: putfield k74/x/IIIllIl.lIlI Lk74/x/IIlIlIlll;
      // 1a4: aload 0
      // 1a5: invokestatic java/lang/System.currentTimeMillis ()J
      // 1a8: putfield k74/x/IIIllIl.IIIllI J
      // 1ab: aload 0
      // 1ac: aload 0
      // 1ad: getfield k74/x/IIIllIl.IIIllI J
      // 1b0: lconst_0
      // 1b1: aload 0
      // 1b2: getstatic k74/x/IIlIlIlll.II Lk74/x/IIlIlIlll;
      // 1b5: invokevirtual k74/x/IIIllIl.lIIlIl (Lk74/x/IIlIlIlll;)J
      // 1b8: ldc2_w 50
      // 1bb: lsub
      // 1bc: invokestatic java/lang/Math.max (JJ)J
      // 1bf: ladd
      // 1c0: putfield k74/x/IIIllIl.III J
      // 1c3: bipush 1
      // 1c4: ireturn
   }

   private void II(class_310 param1, IIlIlIlll param2, IIlIlIlll param3, float param4, float param5, class_3965 param6, BooleanSupplier param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield k74/x/IIIllIl.IlIII Lk74/x/IllIII;
      // 004: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 007: getstatic k74/x/IlIIllIIl.I Lk74/x/IlIIllIIl;
      // 00a: if_acmpne 087
      // 00d: aload 0
      // 00e: aload 2
      // 00f: putfield k74/x/IIIllIl.IlIIl Lk74/x/IIlIlIlll;
      // 012: aload 0
      // 013: aload 1
      // 014: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 017: getfield net/minecraft/class_746.field_6012 I
      // 01a: bipush 2
      // 01b: iadd
      // 01c: putfield k74/x/IIIllIl.IllII I
      // 01f: aload 1
      // 020: aload 6
      // 022: invokestatic k74/x/IlllIlII.IIlIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 025: istore 8
      // 027: aload 1
      // 028: ldc_w -1756496854
      // 02b: ldc_w 1294337567
      // 02e: ldc_w 261867275
      // 031: ixor
      // 032: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 035: iload 8
      // 037: ifeq 048
      // 03a: aload 1
      // 03b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 03e: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 041: goto 04a
      // 044: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 047: athrow
      // 048: fload 4
      // 04a: iload 8
      // 04c: ifeq 05d
      // 04f: aload 1
      // 050: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 053: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 056: goto 05f
      // 059: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 05c: athrow
      // 05d: fload 5
      // 05f: aload 0
      // 060: aload 1
      // 061: aload 2
      // 062: aload 3
      // 063: aload 7
      // 065: invokedynamic a (Lk74/x/IIIllIl;Lnet/minecraft/class_310;Lk74/x/IIlIlIlll;Lk74/x/IIlIlIlll;Ljava/util/function/BooleanSupplier;)Lk74/x/IIIll; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIl.Illllll (Lnet/minecraft/class_310;Lk74/x/IIlIlIlll;Lk74/x/IIlIlIlll;Ljava/util/function/BooleanSupplier;)Z, ()Z ]
      // 06a: invokestatic k74/x/IlllIlII.IlII (Lnet/minecraft/class_310;IFFLk74/x/IIIll;)Z
      // 06d: istore 9
      // 06f: iload 9
      // 071: ifne 086
      // 074: aload 0
      // 075: invokevirtual k74/x/IIIllIl.IIllI ()V
      // 078: aload 0
      // 079: invokestatic java/lang/System.currentTimeMillis ()J
      // 07c: putfield k74/x/IIIllIl.III J
      // 07f: goto 086
      // 082: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 085: athrow
      // 086: return
      // 087: aload 1
      // 088: aload 6
      // 08a: invokestatic k74/x/IlllIlII.IIlIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 08d: istore 8
      // 08f: iload 8
      // 091: ifeq 09c
      // 094: fconst_0
      // 095: goto 0b3
      // 098: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 09b: athrow
      // 09c: aload 0
      // 09d: getfield k74/x/IIIllIl.I Lk74/x/IlIIIllll;
      // 0a0: aload 1
      // 0a1: aload 6
      // 0a3: aload 0
      // 0a4: getfield k74/x/IIIllIl.IIIIlI Lk74/x/IIlIII;
      // 0a7: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 0aa: checkcast java/lang/Double
      // 0ad: invokevirtual java/lang/Double.floatValue ()F
      // 0b0: invokevirtual k74/x/IlIIIllll.IIIllII (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;F)F
      // 0b3: fstore 9
      // 0b5: invokestatic java/lang/System.currentTimeMillis ()J
      // 0b8: lstore 10
      // 0ba: iload 8
      // 0bc: ifne 0e4
      // 0bf: fload 9
      // 0c1: ldc_w 0.5
      // 0c4: fcmpg
      // 0c5: ifle 0e4
      // 0c8: goto 0cf
      // 0cb: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ce: athrow
      // 0cf: lload 10
      // 0d1: aload 0
      // 0d2: getfield k74/x/IIIllIl.IIIllI J
      // 0d5: lsub
      // 0d6: ldc2_w 1500
      // 0d9: lcmp
      // 0da: iflt 125
      // 0dd: goto 0e4
      // 0e0: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e3: athrow
      // 0e4: iload 8
      // 0e6: ifne 0ff
      // 0e9: goto 0f0
      // 0ec: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ef: athrow
      // 0f0: aload 1
      // 0f1: fload 4
      // 0f3: fload 5
      // 0f5: invokestatic k74/x/IIll.IIIIIll (Lnet/minecraft/class_310;FF)V
      // 0f8: goto 0ff
      // 0fb: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: aload 1
      // 101: invokevirtual k74/x/IIIllIl.IIIIll (Lnet/minecraft/class_310;)V
      // 104: aload 0
      // 105: aload 7
      // 107: invokevirtual k74/x/IIIllIl.lIIIIIl (Ljava/util/function/BooleanSupplier;)Z
      // 10a: ifeq 11a
      // 10d: aload 0
      // 10e: aload 3
      // 10f: aload 1
      // 110: invokevirtual k74/x/IIIllIl.IIlll (Lk74/x/IIlIlIlll;Lnet/minecraft/class_310;)V
      // 113: goto 125
      // 116: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 119: athrow
      // 11a: aload 0
      // 11b: invokestatic java/lang/System.currentTimeMillis ()J
      // 11e: ldc2_w 50
      // 121: ladd
      // 122: putfield k74/x/IIIllIl.III J
      // 125: return
   }

   private boolean Il(class_310 param1) {
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
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield k74/x/IIIllIl.lllll Lk74/x/lllIIlII;
      // 1c: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 1f: checkcast java/lang/Boolean
      // 22: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 25: ifne 36
      // 28: aload 1
      // 29: aload 0
      // 2a: getstatic k74/x/lllIII.I Lk74/x/lllIII;
      // 2d: invokestatic k74/x/IIll.lllIl (Lnet/minecraft/class_310;Ljava/lang/Object;Lk74/x/lllIII;)V
      // 30: bipush 1
      // 31: ireturn
      // 32: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 35: athrow
      // 36: aload 0
      // 37: getfield k74/x/IIIllIl.lIl I
      // 3a: iflt 58
      // 3d: aload 0
      // 3e: getfield k74/x/IIIllIl.lIl I
      // 41: ldc_w -1756496853
      // 44: ldc_w 2102205062
      // 47: ldc_w -1218908843
      // 4a: ixor
      // 4b: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 4e: if_icmplt 66
      // 51: goto 58
      // 54: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 57: athrow
      // 58: aload 1
      // 59: aload 0
      // 5a: getstatic k74/x/lllIII.II Lk74/x/lllIII;
      // 5d: invokestatic k74/x/IIll.lllIl (Lnet/minecraft/class_310;Ljava/lang/Object;Lk74/x/lllIII;)V
      // 60: bipush 1
      // 61: ireturn
      // 62: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 65: athrow
      // 66: aload 1
      // 67: aload 0
      // 68: aload 0
      // 69: getfield k74/x/IIIllIl.lIl I
      // 6c: invokestatic k74/x/IIll.llIllI (Lnet/minecraft/class_310;Ljava/lang/Object;I)V
      // 6f: bipush 1
      // 70: ireturn
   }

   private IlIlIIIIl lI(class_310 param1, class_2338 param2, class_2338 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 4
      // 005: aload 1
      // 006: ifnull 030
      // 009: aload 1
      // 00a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 00d: ifnull 030
      // 010: goto 017
      // 013: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 016: athrow
      // 017: aload 1
      // 018: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 01b: ifnull 030
      // 01e: goto 025
      // 021: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 024: athrow
      // 025: aload 2
      // 026: ifnonnull 036
      // 029: goto 030
      // 02c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02f: athrow
      // 030: aconst_null
      // 031: areturn
      // 032: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 035: athrow
      // 036: aload 0
      // 037: aload 2
      // 038: invokevirtual k74/x/IIIllIl.lllI (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 03b: astore 5
      // 03d: aload 1
      // 03e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 041: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // 044: astore 6
      // 046: aload 5
      // 048: getfield net/minecraft/class_243.field_1352 D
      // 04b: aload 1
      // 04c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 04f: invokevirtual net/minecraft/class_746.method_23317 ()D
      // 052: dsub
      // 053: dstore 7
      // 055: aload 5
      // 057: getfield net/minecraft/class_243.field_1350 D
      // 05a: aload 1
      // 05b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 05e: invokevirtual net/minecraft/class_746.method_23321 ()D
      // 061: dsub
      // 062: dstore 9
      // 064: dload 7
      // 066: dload 9
      // 068: invokestatic k74/x/IIIllIl.IlllllI (DD)Lnet/minecraft/class_2350;
      // 06b: astore 11
      // 06d: dload 7
      // 06f: invokestatic java/lang/Math.abs (D)D
      // 072: dload 9
      // 074: invokestatic java/lang/Math.abs (D)D
      // 077: dcmpl
      // 078: iflt 099
      // 07b: dload 9
      // 07d: dconst_0
      // 07e: dcmpl
      // 07f: ifle 093
      // 082: goto 089
      // 085: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 088: athrow
      // 089: getstatic net/minecraft/class_2350.field_11035 Lnet/minecraft/class_2350;
      // 08c: goto 0ad
      // 08f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 092: athrow
      // 093: getstatic net/minecraft/class_2350.field_11043 Lnet/minecraft/class_2350;
      // 096: goto 0ad
      // 099: dload 7
      // 09b: dconst_0
      // 09c: dcmpl
      // 09d: ifle 0aa
      // 0a0: getstatic net/minecraft/class_2350.field_11034 Lnet/minecraft/class_2350;
      // 0a3: goto 0ad
      // 0a6: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a9: athrow
      // 0aa: getstatic net/minecraft/class_2350.field_11039 Lnet/minecraft/class_2350;
      // 0ad: astore 12
      // 0af: dload 7
      // 0b1: invokestatic java/lang/Math.abs (D)D
      // 0b4: ldc2_w 0.3
      // 0b7: dcmpl
      // 0b8: ifle 0d6
      // 0bb: dload 9
      // 0bd: invokestatic java/lang/Math.abs (D)D
      // 0c0: ldc2_w 0.3
      // 0c3: dcmpl
      // 0c4: ifle 0d6
      // 0c7: goto 0ce
      // 0ca: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0cd: athrow
      // 0ce: bipush 1
      // 0cf: goto 0d7
      // 0d2: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d5: athrow
      // 0d6: bipush 0
      // 0d7: istore 13
      // 0d9: new java/util/ArrayList
      // 0dc: dup
      // 0dd: invokespecial java/util/ArrayList.<init> ()V
      // 0e0: astore 14
      // 0e2: aload 14
      // 0e4: aload 6
      // 0e6: aload 11
      // 0e8: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 0eb: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 0f0: pop
      // 0f1: aload 14
      // 0f3: aload 6
      // 0f5: aload 11
      // 0f7: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 0fa: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 0fd: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 102: pop
      // 103: iload 13
      // 105: ifeq 15b
      // 108: aload 14
      // 10a: aload 6
      // 10c: aload 11
      // 10e: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 111: aload 12
      // 113: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 116: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 11b: pop
      // 11c: aload 14
      // 11e: aload 6
      // 120: aload 11
      // 122: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 125: aload 12
      // 127: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 12a: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 12d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 132: pop
      // 133: aload 14
      // 135: aload 6
      // 137: aload 12
      // 139: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 13c: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 141: pop
      // 142: aload 14
      // 144: aload 6
      // 146: aload 12
      // 148: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 14b: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 14e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 153: pop
      // 154: goto 15b
      // 157: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15a: athrow
      // 15b: aload 14
      // 15d: aload 6
      // 15f: aload 11
      // 161: bipush 2
      // 162: invokevirtual net/minecraft/class_2338.method_10079 (Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2338;
      // 165: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 16a: pop
      // 16b: aload 14
      // 16d: aload 6
      // 16f: aload 11
      // 171: bipush 2
      // 172: invokevirtual net/minecraft/class_2338.method_10079 (Lnet/minecraft/class_2350;I)Lnet/minecraft/class_2338;
      // 175: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 178: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 17d: pop
      // 17e: aload 11
      // 180: invokevirtual net/minecraft/class_2350.method_10153 ()Lnet/minecraft/class_2350;
      // 183: astore 15
      // 185: aload 14
      // 187: aload 2
      // 188: aload 15
      // 18a: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 18d: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 192: pop
      // 193: aload 14
      // 195: aload 2
      // 196: aload 15
      // 198: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 19b: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 19e: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1a3: pop
      // 1a4: iload 13
      // 1a6: ifeq 1c6
      // 1a9: aload 14
      // 1ab: aload 2
      // 1ac: aload 15
      // 1ae: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 1b1: aload 12
      // 1b3: invokevirtual net/minecraft/class_2350.method_10153 ()Lnet/minecraft/class_2350;
      // 1b6: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 1b9: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 1be: pop
      // 1bf: goto 1c6
      // 1c2: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c5: athrow
      // 1c6: aload 0
      // 1c7: aload 1
      // 1c8: invokevirtual k74/x/IIIllIl.ll (Lnet/minecraft/class_310;)Lnet/minecraft/class_1799;
      // 1cb: astore 16
      // 1cd: aload 0
      // 1ce: aload 16
      // 1d0: invokevirtual k74/x/IIIllIl.IlllI (Lnet/minecraft/class_1799;)Z
      // 1d3: ifne 1f1
      // 1d6: aload 0
      // 1d7: aload 1
      // 1d8: invokevirtual k74/x/IIIllIl.lIlII (Lnet/minecraft/class_310;)Lk74/x/IIllllIll;
      // 1db: astore 17
      // 1dd: aload 17
      // 1df: ifnull 1ee
      // 1e2: aload 17
      // 1e4: invokevirtual k74/x/IIllllIll.I ()Lnet/minecraft/class_1799;
      // 1e7: goto 1ef
      // 1ea: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1ed: athrow
      // 1ee: aconst_null
      // 1ef: astore 16
      // 1f1: aload 16
      // 1f3: ifnull 203
      // 1f6: aload 0
      // 1f7: aload 16
      // 1f9: invokevirtual k74/x/IIIllIl.IlIIIl (Lnet/minecraft/class_1799;)Lk74/x/lIIIII;
      // 1fc: goto 204
      // 1ff: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 202: athrow
      // 203: aconst_null
      // 204: astore 17
      // 206: aload 1
      // 207: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 20a: aload 5
      // 20c: ldc_w 11.5
      // 20f: aconst_null
      // 210: invokestatic k74/x/IIIIllIlI.lII (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;FLnet/minecraft/class_2338;)F
      // 213: fstore 18
      // 215: aconst_null
      // 216: astore 19
      // 218: ldc_w Infinity
      // 21b: fstore 20
      // 21d: aload 1
      // 21e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 221: invokevirtual net/minecraft/class_746.method_5829 ()Lnet/minecraft/class_238;
      // 224: astore 21
      // 226: new net/minecraft/class_238
      // 229: dup
      // 22a: aload 2
      // 22b: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 22e: ldc2_w 0.5
      // 231: ldc2_w 0.5
      // 234: ldc2_w 0.5
      // 237: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
      // 23a: astore 22
      // 23c: aload 3
      // 23d: ifnull 24f
      // 240: new net/minecraft/class_238
      // 243: dup
      // 244: aload 3
      // 245: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 248: goto 250
      // 24b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 24e: athrow
      // 24f: aconst_null
      // 250: astore 23
      // 252: aload 14
      // 254: invokeinterface java/util/List.iterator ()Ljava/util/Iterator; 1
      // 259: astore 24
      // 25b: aload 24
      // 25d: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 262: ifeq 393
      // 265: aload 24
      // 267: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 26c: checkcast net/minecraft/class_2338
      // 26f: astore 25
      // 271: aload 25
      // 273: aload 2
      // 274: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 277: ifne 25b
      // 27a: aload 3
      // 27b: ifnull 29a
      // 27e: aload 25
      // 280: aload 3
      // 281: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 284: ifeq 29a
      // 287: goto 28e
      // 28a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28d: athrow
      // 28e: aload 4
      // 290: ifnull 25b
      // 293: goto 29a
      // 296: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 299: athrow
      // 29a: aload 0
      // 29b: aload 1
      // 29c: aload 25
      // 29e: invokevirtual k74/x/IIIllIl.IIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 2a1: ifne 2b0
      // 2a4: aload 4
      // 2a6: ifnull 25b
      // 2a9: goto 2b0
      // 2ac: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2af: athrow
      // 2b0: new net/minecraft/class_238
      // 2b3: dup
      // 2b4: aload 25
      // 2b6: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 2b9: astore 26
      // 2bb: aload 26
      // 2bd: aload 21
      // 2bf: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
      // 2c2: ifne 25b
      // 2c5: aload 26
      // 2c7: aload 22
      // 2c9: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
      // 2cc: ifne 25b
      // 2cf: aload 23
      // 2d1: ifnull 2f1
      // 2d4: aload 26
      // 2d6: aload 23
      // 2d8: invokevirtual net/minecraft/class_238.method_994 (Lnet/minecraft/class_238;)Z
      // 2db: ifeq 2f1
      // 2de: goto 2e5
      // 2e1: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2e4: athrow
      // 2e5: aload 4
      // 2e7: ifnull 25b
      // 2ea: goto 2f1
      // 2ed: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2f0: athrow
      // 2f1: aload 1
      // 2f2: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 2f5: aconst_null
      // 2f6: aload 26
      // 2f8: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IIIllIl.IIIl (Lnet/minecraft/class_1297;)Z, (Lnet/minecraft/class_1297;)Z ]
      // 2fd: invokevirtual net/minecraft/class_638.method_8333 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;Ljava/util/function/Predicate;)Ljava/util/List;
      // 300: invokeinterface java/util/List.isEmpty ()Z 1
      // 305: ifne 314
      // 308: aload 4
      // 30a: ifnull 25b
      // 30d: goto 314
      // 310: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 313: athrow
      // 314: aload 0
      // 315: aload 1
      // 316: aload 25
      // 318: invokevirtual k74/x/IIIllIl.IlIlll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Lk74/x/IlIlIIIIl;
      // 31b: astore 27
      // 31d: aload 27
      // 31f: ifnonnull 32e
      // 322: aload 4
      // 324: ifnull 25b
      // 327: goto 32e
      // 32a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 32d: athrow
      // 32e: aload 17
      // 330: ifnull 35b
      // 333: aload 0
      // 334: aload 1
      // 335: aload 17
      // 337: aload 0
      // 338: getfield k74/x/IIIllIl.IlIl F
      // 33b: aload 0
      // 33c: getfield k74/x/IIIllIl.lI F
      // 33f: aload 25
      // 341: aload 2
      // 342: invokevirtual k74/x/IIIllIl.IlII (Lnet/minecraft/class_310;Lk74/x/lIIIII;FFLnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Z
      // 345: ifeq 35b
      // 348: goto 34f
      // 34b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 34e: athrow
      // 34f: aload 4
      // 351: ifnull 25b
      // 354: goto 35b
      // 357: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 35a: athrow
      // 35b: aload 1
      // 35c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 35f: aload 5
      // 361: ldc_w 11.5
      // 364: aload 25
      // 366: invokestatic k74/x/IIIIllIlI.lII (Lnet/minecraft/class_1309;Lnet/minecraft/class_243;FLnet/minecraft/class_2338;)F
      // 369: fstore 28
      // 36b: fload 18
      // 36d: fload 28
      // 36f: fsub
      // 370: ldc_w 0.25
      // 373: fcmpl
      // 374: iflt 38e
      // 377: fload 28
      // 379: fload 20
      // 37b: fcmpg
      // 37c: ifge 38e
      // 37f: goto 386
      // 382: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 385: athrow
      // 386: fload 28
      // 388: fstore 20
      // 38a: aload 27
      // 38c: astore 19
      // 38e: aload 4
      // 390: ifnull 25b
      // 393: aload 19
      // 395: areturn
   }

   private class_1799 ll(class_310 param1) {
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
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnonnull 1a
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 15: areturn
      // 16: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 19: athrow
      // 1a: aload 0
      // 1b: getfield k74/x/IIIllIl.IIl Lnet/minecraft/class_1268;
      // 1e: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
      // 21: if_acmpne 30
      // 24: aload 1
      // 25: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 28: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 2b: areturn
      // 2c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield k74/x/IIIllIl.Ill I
      // 34: iflt 52
      // 37: aload 0
      // 38: getfield k74/x/IIIllIl.Ill I
      // 3b: ldc_w -1756496856
      // 3e: ldc_w 786712086
      // 41: ldc_w -939967638
      // 44: ixor
      // 45: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 48: if_icmplt 5a
      // 4b: goto 52
      // 4e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 51: athrow
      // 52: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 55: areturn
      // 56: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 59: athrow
      // 5a: aload 1
      // 5b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 61: aload 0
      // 62: getfield k74/x/IIIllIl.Ill I
      // 65: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 68: areturn
   }

   private boolean III(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 0
      // 02: putfield k74/x/IIIllIl.IIIIIl Z
      // 05: aload 0
      // 06: ldc_w -1756496855
      // 09: ldc_w -41348541
      // 0c: ldc_w -716154305
      // 0f: ixor
      // 10: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 13: putfield k74/x/IIIllIl.IIllI I
      // 16: aload 0
      // 17: aload 1
      // 18: invokevirtual k74/x/IIIllIl.lIlIlI (Lnet/minecraft/class_310;)Z
      // 1b: ifeq 44
      // 1e: aload 0
      // 1f: aload 1
      // 20: aload 0
      // 21: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 24: invokevirtual k74/x/IIIllIl.lll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 27: ifeq 44
      // 2a: goto 31
      // 2d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: aload 0
      // 32: aload 1
      // 33: aload 0
      // 34: getfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 37: invokevirtual k74/x/IIIllIl.lIIIIII (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 3a: ifne 4f
      // 3d: goto 44
      // 40: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 43: athrow
      // 44: aload 0
      // 45: aload 1
      // 46: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 49: bipush 0
      // 4a: ireturn
      // 4b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4e: athrow
      // 4f: aload 0
      // 50: aload 1
      // 51: invokevirtual k74/x/IIIllIl.lIlI (Lnet/minecraft/class_310;)Z
      // 54: istore 2
      // 55: iload 2
      // 56: ifeq 68
      // 59: aload 0
      // 5a: getstatic k74/x/IIlIlIlll.ll Lk74/x/IIlIlIlll;
      // 5d: aload 1
      // 5e: invokevirtual k74/x/IIIllIl.IIlll (Lk74/x/IIlIlIlll;Lnet/minecraft/class_310;)V
      // 61: goto 6d
      // 64: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 67: athrow
      // 68: aload 0
      // 69: aload 1
      // 6a: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 6d: iload 2
      // 6e: ireturn
   }

   @Override
   public boolean IIIlIII() {
      return this.IIllIII();
   }

   private class_243 IIl(class_2338 var1) {
      return this.IIlII(var1).method_1023(0.0, 0.0625, 0.0);
   }

   private boolean Ill(class_310 var1) {
      return this.lllll(var1);
   }

   @Override
   public void IIlIl() {
   }

   private boolean lII(class_1661 param1, int param2, IIIIll param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 32
      // 04: iload 2
      // 05: iflt 32
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: iload 2
      // 10: ldc_w -1756496850
      // 13: ldc_w 23638093
      // 16: ldc_w 1441369734
      // 19: ixor
      // 1a: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 1d: if_icmpge 32
      // 20: goto 27
      // 23: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: aload 3
      // 28: ifnonnull 38
      // 2b: goto 32
      // 2e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
      // 34: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 37: athrow
      // 38: aload 1
      // 39: iload 2
      // 3a: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 3d: astore 4
      // 3f: aload 3
      // 40: getstatic k74/x/IIIIll.I Lk74/x/IIIIll;
      // 43: if_acmpne 55
      // 46: aload 4
      // 48: getstatic net/minecraft/class_1802.field_8884 Lnet/minecraft/class_1792;
      // 4b: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 4e: goto 5d
      // 51: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 54: athrow
      // 55: aload 4
      // 57: getstatic net/minecraft/class_1802.field_8187 Lnet/minecraft/class_1792;
      // 5a: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 5d: ireturn
   }

   private boolean lIl(class_310 var1, int var2, class_3965 var3) {
      return k74.x.IIll.lllIII(var1, this, var2, this::IlIIII);
   }

   private boolean llI(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 2b
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 2b
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 2b
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 2
      // 21: ifnonnull 31
      // 24: goto 2b
      // 27: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
      // 2d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: aload 1
      // 32: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 35: aload 2
      // 36: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 39: astore 3
      // 3a: aload 1
      // 3b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3e: aload 2
      // 3f: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 42: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 45: astore 4
      // 47: aload 3
      // 48: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 4b: ifne 5c
      // 4e: aload 3
      // 4f: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 52: ifeq e0
      // 55: goto 5c
      // 58: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5b: athrow
      // 5c: aload 4
      // 5e: ifnull e0
      // 61: goto 68
      // 64: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 67: athrow
      // 68: aload 4
      // 6a: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 6d: ifne e0
      // 70: goto 77
      // 73: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 76: athrow
      // 77: aload 4
      // 79: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 7c: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 7f: ifeq e0
      // 82: goto 89
      // 85: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 88: athrow
      // 89: aload 4
      // 8b: aload 1
      // 8c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 8f: aload 2
      // 90: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 93: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 96: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 99: ifne e0
      // 9c: goto a3
      // 9f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a2: athrow
      // a3: aload 1
      // a4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a7: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // aa: aload 0
      // ab: aload 2
      // ac: invokevirtual k74/x/IIIllIl.IIlII (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // af: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // b2: ldc2_w 20.25
      // b5: dcmpg
      // b6: ifgt e0
      // b9: goto c0
      // bc: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // bf: athrow
      // c0: aload 0
      // c1: aload 1
      // c2: aload 0
      // c3: aload 2
      // c4: invokevirtual k74/x/IIIllIl.IIl (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // c7: aload 2
      // c8: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // cb: invokevirtual k74/x/IIIllIl.IlllIll (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Z
      // ce: ifeq e0
      // d1: goto d8
      // d4: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d7: athrow
      // d8: bipush 1
      // d9: goto e1
      // dc: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // df: athrow
      // e0: bipush 0
      // e1: ireturn
   }

   private boolean lll(class_310 var1, class_2338 var2) {
      try {
         if (this.lllIl(var1, var2) >= 1) {
            return true;
         }
      } catch (MatchException var3) {
         throw IllIIl(var3);
      }

      return false;
   }

   private double IIII(class_243 param1, class_243 param2, class_243 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1a
      // 04: aload 2
      // 05: ifnull 1a
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: aload 3
      // 10: ifnonnull 22
      // 13: goto 1a
      // 16: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 19: athrow
      // 1a: ldc2_w Infinity
      // 1d: dreturn
      // 1e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21: athrow
      // 22: aload 2
      // 23: aload 1
      // 24: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 27: astore 4
      // 29: aload 4
      // 2b: invokevirtual net/minecraft/class_243.method_1027 ()D
      // 2e: dstore 5
      // 30: dload 5
      // 32: ldc2_w 1.0E-7
      // 35: dcmpg
      // 36: ifge 43
      // 39: aload 1
      // 3a: aload 3
      // 3b: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 3e: dreturn
      // 3f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 42: athrow
      // 43: aload 3
      // 44: aload 1
      // 45: invokevirtual net/minecraft/class_243.method_1020 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 48: aload 4
      // 4a: invokevirtual net/minecraft/class_243.method_1026 (Lnet/minecraft/class_243;)D
      // 4d: dload 5
      // 4f: ddiv
      // 50: dstore 7
      // 52: dconst_0
      // 53: dconst_1
      // 54: dload 7
      // 56: invokestatic java/lang/Math.min (DD)D
      // 59: invokestatic java/lang/Math.max (DD)D
      // 5c: dstore 7
      // 5e: aload 1
      // 5f: aload 4
      // 61: dload 7
      // 63: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 66: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 69: aload 3
      // 6a: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 6d: dreturn
   }

   private static boolean IIIl(class_1297 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual net/minecraft/class_1297.method_5805 ()Z
      // 04: ifeq 1d
      // 07: aload 0
      // 08: invokevirtual net/minecraft/class_1297.method_31481 ()Z
      // 0b: ifne 1d
      // 0e: goto 15
      // 11: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: bipush 1
      // 16: goto 1e
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
   }

   private boolean IIlI(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 64
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: ifnull 64
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 2
      // 13: ifnull 64
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: aload 1
      // 1e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 21: aload 2
      // 22: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 25: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 28: ifne 5c
      // 2b: goto 32
      // 2e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 31: athrow
      // 32: aload 1
      // 33: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 36: aload 2
      // 37: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 3a: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 3d: ifne 5c
      // 40: goto 47
      // 43: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 46: athrow
      // 47: aload 1
      // 48: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 4b: aload 2
      // 4c: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 4f: invokestatic k74/x/IIll.lIIlIl (Lnet/minecraft/class_2680;)Z
      // 52: ifeq 64
      // 55: goto 5c
      // 58: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5b: athrow
      // 5c: bipush 1
      // 5d: goto 65
      // 60: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 63: athrow
      // 64: bipush 0
      // 65: ireturn
   }

   private class_243 IIll(class_310 var1, float var2, float var3) {
      float var4 = var2 * (float) (Math.PI / 180.0);
      float var5 = var3 * (float) (Math.PI / 180.0);
      float var6 = class_3532.method_15362(var5);
      float var7 = class_3532.method_15374(var5);
      float var8 = class_3532.method_15362(var4);
      float var9 = class_3532.method_15374(var4);
      class_243 var10 = new class_243(-var9 * var6, -var7, var8 * var6);
      return var1.field_1724.method_33571().method_1019(var10.method_1021(5.0));
   }

   private boolean IlII(class_310 param1, lIIIII param2, float param3, float param4, class_2338 param5, class_2338 param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ifnull 035
      // 004: aload 1
      // 005: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 008: ifnull 035
      // 00b: goto 012
      // 00e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 011: athrow
      // 012: aload 2
      // 013: ifnull 035
      // 016: goto 01d
      // 019: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 01c: athrow
      // 01d: aload 5
      // 01f: ifnull 035
      // 022: goto 029
      // 025: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 028: athrow
      // 029: aload 6
      // 02b: ifnonnull 03b
      // 02e: goto 035
      // 031: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 034: athrow
      // 035: bipush 0
      // 036: ireturn
      // 037: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03a: athrow
      // 03b: new net/minecraft/class_238
      // 03e: dup
      // 03f: aload 5
      // 041: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 044: ldc2_w 0.2
      // 047: invokevirtual net/minecraft/class_238.method_1014 (D)Lnet/minecraft/class_238;
      // 04a: astore 7
      // 04c: new net/minecraft/class_238
      // 04f: dup
      // 050: aload 6
      // 052: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 055: ldc2_w 0.5
      // 058: ldc2_w 0.5
      // 05b: ldc2_w 0.5
      // 05e: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
      // 061: astore 8
      // 063: aload 1
      // 064: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 067: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 06a: astore 9
      // 06c: aload 0
      // 06d: fload 3
      // 06e: fload 4
      // 070: invokevirtual k74/x/IIIllIl.IllllI (FF)Lnet/minecraft/class_243;
      // 073: aload 2
      // 074: invokevirtual k74/x/lIIIII.l ()D
      // 077: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 07a: aload 1
      // 07b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 07e: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
      // 081: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 084: astore 10
      // 086: bipush 0
      // 087: istore 11
      // 089: iload 11
      // 08b: ldc_w -1756496849
      // 08e: ldc_w 709616910
      // 091: ldc_w 356281436
      // 094: ixor
      // 095: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 098: if_icmpge 107
      // 09b: aload 9
      // 09d: aload 10
      // 09f: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0a2: astore 12
      // 0a4: aload 8
      // 0a6: aload 9
      // 0a8: aload 12
      // 0aa: invokevirtual net/minecraft/class_238.method_992 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Ljava/util/Optional;
      // 0ad: invokevirtual java/util/Optional.isPresent ()Z
      // 0b0: ifeq 0b9
      // 0b3: bipush 0
      // 0b4: ireturn
      // 0b5: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b8: athrow
      // 0b9: aload 7
      // 0bb: aload 9
      // 0bd: aload 12
      // 0bf: invokevirtual net/minecraft/class_238.method_992 (Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Ljava/util/Optional;
      // 0c2: invokevirtual java/util/Optional.isPresent ()Z
      // 0c5: ifeq 0ce
      // 0c8: bipush 1
      // 0c9: ireturn
      // 0ca: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0cd: athrow
      // 0ce: aload 12
      // 0d0: astore 9
      // 0d2: aload 10
      // 0d4: aload 2
      // 0d5: invokevirtual k74/x/lIIIII.I ()D
      // 0d8: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0db: dconst_0
      // 0dc: aload 2
      // 0dd: invokevirtual k74/x/lIIIII.II ()D
      // 0e0: dconst_0
      // 0e1: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
      // 0e4: astore 10
      // 0e6: aload 9
      // 0e8: getfield net/minecraft/class_243.field_1351 D
      // 0eb: aload 1
      // 0ec: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0ef: invokevirtual net/minecraft/class_638.method_31607 ()I
      // 0f2: i2d
      // 0f3: ldc2_w 20.0
      // 0f6: dsub
      // 0f7: dcmpg
      // 0f8: ifge 101
      // 0fb: bipush 0
      // 0fc: ireturn
      // 0fd: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 100: athrow
      // 101: iinc 11 1
      // 104: goto 089
      // 107: bipush 0
      // 108: ireturn
   }

   private boolean IlIl(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 2b
      // 04: aload 1
      // 05: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 08: ifne 2b
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
      // 16: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 19: ifeq 2b
      // 1c: goto 23
      // 1f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: bipush 1
      // 24: goto 2c
      // 27: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
   }

   private class_3965 IllI(class_2338 var1) {
      return new class_3965(this.IIIlI(var1), class_2350.field_11036, var1.method_10074(), false);
   }

   private class_3965 Illl(class_310 param1, class_243 param2, class_243 param3) {
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
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aconst_null
      // 13: areturn
      // 14: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 1
      // 19: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1c: new net/minecraft/class_3959
      // 1f: dup
      // 20: aload 2
      // 21: aload 3
      // 22: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
      // 25: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 28: aload 1
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 2f: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 32: areturn
   }

   private void lIII() {
      this.lIlI = IIlIlIlll.I;
      this.lll = null;
      this.IIII = null;
      this.lIl = -1;
      this.Illl = -1;
      this.IIlII = k74.x.IIIIll.I;
      this.IlII = -1;
      this.llIIl = -1;
      this.IIlIl = null;
      this.IIIIII = 1;
      this.lIlII = 0;
      this.Ill = -1;
      this.IIl = class_1268.field_5808;
      this.IIIllI = 0L;
      this.III = 0L;
      this.IIIII = 0.0F;
      this.IIll = 0.0F;
      this.lIIIl = 0.0F;
      this.IIIlII = 0.0F;
      this.IIIl = 0.0F;
      this.lIIII = 0.0F;
      this.IlIl = 0.0F;
      this.lI = 0.0F;
      this.IIllI();
      this.IIIIIl = false;
      this.IIllI = lIIIlII(-1756496852, 1000221163 ^ 899507248);
      this.lIlIl = null;
      this.llll.l();
   }

   private void lIIl(class_310 var1) {
      try {
         if (this.Il(var1)) {
            this.lIII();
            this.lIIIII();
            return;
         }
      } catch (MatchException var2) {
         throw IllIIl(var2);
      }

      this.lIlI = IIlIlIlll.ll;
      this.IIIllI = System.currentTimeMillis();
      this.III = this.IIIllI;
   }

   private boolean lIlI(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 20
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 20
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 25: athrow
      // 26: aload 0
      // 27: getfield k74/x/IIIllIl.IIl Lnet/minecraft/class_1268;
      // 2a: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 2d: if_acmpne 4f
      // 30: aload 0
      // 31: aload 1
      // 32: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 35: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 38: aload 0
      // 39: getfield k74/x/IIIllIl.Ill I
      // 3c: invokevirtual k74/x/IIIllIl.IllllIl (Lnet/minecraft/class_1661;I)Z
      // 3f: ifne 4f
      // 42: goto 49
      // 45: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 48: athrow
      // 49: bipush 0
      // 4a: ireturn
      // 4b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4e: athrow
      // 4f: aload 0
      // 50: getfield k74/x/IIIllIl.IIl Lnet/minecraft/class_1268;
      // 53: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
      // 56: if_acmpne 6e
      // 59: aload 0
      // 5a: aload 1
      // 5b: invokevirtual k74/x/IIIllIl.IIIIll (Lnet/minecraft/class_310;)V
      // 5e: aload 0
      // 5f: aload 0
      // 60: aload 1
      // 61: invokedynamic getAsBoolean (Lk74/x/IIIllIl;Lnet/minecraft/class_310;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIl.IIlIll (Lnet/minecraft/class_310;)Z, ()Z ]
      // 66: invokevirtual k74/x/IIIllIl.lIIIIIl (Ljava/util/function/BooleanSupplier;)Z
      // 69: ireturn
      // 6a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6d: athrow
      // 6e: aload 1
      // 6f: aload 0
      // 70: aload 0
      // 71: getfield k74/x/IIIllIl.Ill I
      // 74: aload 0
      // 75: aload 1
      // 76: invokedynamic getAsBoolean (Lk74/x/IIIllIl;Lnet/minecraft/class_310;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIl.IIIlll (Lnet/minecraft/class_310;)Z, ()Z ]
      // 7b: invokestatic k74/x/IIll.lllIII (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // 7e: ireturn
   }

   private boolean lIll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual k74/x/IIIllIl.IlIlIl (Lnet/minecraft/class_310;)I
      // 05: iflt 27
      // 08: aload 0
      // 09: aload 1
      // 0a: aload 0
      // 0b: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 0e: aload 0
      // 0f: getfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 12: invokevirtual k74/x/IIIllIl.lI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Lk74/x/IlIlIIIIl;
      // 15: ifnull 27
      // 18: goto 1f
      // 1b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e: athrow
      // 1f: bipush 1
      // 20: goto 28
      // 23: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: bipush 0
      // 28: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1719114050;
      int var16 = 0;
      String[] var15 = new String[2];
      int var10001 = "ğ何쥷䨊\ue1dc埋ㇺ岕酰妊吏尋뇽帕若垊針嗋뇽嗕ᅴ僪槙䗋秽媵奰䢪㧘䭫ᇾ䙵쥰噪觘䱋䧹䪵ꅴ䱊\ue1da幋击亵ॳ䕊懜䏋\uf1f9宵慵䯪쇝嵋䧽徵⥰崊\uf1dc姫ㇼ庵亮䭊⧝䘋粒嶵奴䳪\ue1dc䣋臼倵텷弪㇙埫秺卵ꥲ嬊ꇟ嗫\ue1f8䦵饴忪燛喋ǹ動륰奪쇙䀋짽巕ॲ嚪⇙嘋쇺幕㥴䰊姝婫ꧼ䕕⥵䬪쇘妋\ue9f9嫵奲孊駝䢋맸岕\ue171姪懜享⧺墵襱䬪䧟䄫ᇾ卵酷僪퇛䊫᧼䌵ŷ䥪燞䔫᧾岕ॵ庪য়䕫刺䕕ᅲ俊짛䑋짹䰵텱届᧙劋\uf1fa嗵奷倊맜䚫퇽䚵ᅲ娊凚䗋뇼䴕ⅳ劊針䔫\ue9ff嚕酶䰪姚型맸妵䅷唊꧘宋뇸䪕襲䧊\uf1dd䐫㧺䂕\uf173噊燝妋⇾䃕襷䰊䇞尫懽宕셱埊⧙䶋\uf1ff埵셴䭊觛䀫\ud9fc張楳傊⇛嚋⧼䟕䅳囊㧛儋맸墕녵䳪觛寫쇿倵奰䥊ǜ婋姹倕饳䨊租䙋秿嵕ㅰ䦊㧜䑋ꧼ䇕\ud970僪\ud9da唋姺䢕⥲䴊㇘䩋꧹䔕ᥰ䈊ꇟ䵋ㇽ䢵ㅲ䃊姘媫笠丵\ue971寊租孋\u0015鵩陀贶컬饷웍襉幁裶\udeee蕗\ue6cc齩噆誖껭腗廉蟉♇鞶"
         .length();
      int var17 = 0;
      int var14 = var10001;
      String var13 = "ğ何쥷䨊\ue1dc埋ㇺ岕酰妊吏尋뇽帕若垊針嗋뇽嗕ᅴ僪槙䗋秽媵奰䢪㧘䭫ᇾ䙵쥰噪觘䱋䧹䪵ꅴ䱊\ue1da幋击亵ॳ䕊懜䏋\uf1f9宵慵䯪쇝嵋䧽徵⥰崊\uf1dc姫ㇼ庵亮䭊⧝䘋粒嶵奴䳪\ue1dc䣋臼倵텷弪㇙埫秺卵ꥲ嬊ꇟ嗫\ue1f8䦵饴忪燛喋ǹ動륰奪쇙䀋짽巕ॲ嚪⇙嘋쇺幕㥴䰊姝婫ꧼ䕕⥵䬪쇘妋\ue9f9嫵奲孊駝䢋맸岕\ue171姪懜享⧺墵襱䬪䧟䄫ᇾ卵酷僪퇛䊫᧼䌵ŷ䥪燞䔫᧾岕ॵ庪য়䕫刺䕕ᅲ俊짛䑋짹䰵텱届᧙劋\uf1fa嗵奷倊맜䚫퇽䚵ᅲ娊凚䗋뇼䴕ⅳ劊針䔫\ue9ff嚕酶䰪姚型맸妵䅷唊꧘宋뇸䪕襲䧊\uf1dd䐫㧺䂕\uf173噊燝妋⇾䃕襷䰊䇞尫懽宕셱埊⧙䶋\uf1ff埵셴䭊觛䀫\ud9fc張楳傊⇛嚋⧼䟕䅳囊㧛儋맸墕녵䳪觛寫쇿倵奰䥊ǜ婋姹倕饳䨊租䙋秿嵕ㅰ䦊㧜䑋ꧼ䇕\ud970僪\ud9da唋姺䢕⥲䴊㇘䩋꧹䔕ᥰ䈊ꇟ䵋ㇽ䢵ㅲ䃊姘媫笠丵\ue971寊租孋\u0015鵩陀贶컬饷웍襉幁裶\udeee蕗\ue6cc齩噆誖껭腗廉蟉♇鞶";
      short var18 = 30974;

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 83;
               case 1 -> 230;
               case 2 -> 172;
               case 3 -> 75;
               case 4 -> 109;
               case 5 -> 104;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIlIlI = var15;
      IIlIll = new Object[var15.length];
      int var9 = -2075347530;
      byte[] var7 = "®C7\u0019&ë\u001c\u001a\u0005ã\u0096¶D'£º¸\u007fÕ\u0007Ó\u0089`ìbý¦\u0018,þ\u008b\u009c\u0015ô\u0014°<\u0083\u008eÄ^\u001d3Ôÿð¢\u0017\u0011:9W\u001a\u008b\u008bdÍ\fNF½\u001bªóA|û=}\u001eê\u009cÀÔÖ\u0096´ \u00077ÏPÃ:ÏÇ©>Ñv\u009eíUövÞ>£\u001ee \u0083\u0083°¹ßÚÒöÒ \u0091\u0085K\u0006²5Þ\u001bá4f5\u0017\u009eüÍÚ\u0095\u009e\u0091\f±\u0000\u0097ÙÁ\u0019äsdüÓç\u008fî:\u0091P¢¨ûÇ\u009cØð ·ÄÙ\u0014ã\u0085k,\u0019\u0080µ+[\u009cë\u0095rs®6÷\u007fó©\u000b\u0095Á®nEü|C\u0000#¿íKßùv×\u008cK¼qä,×6çHÇ·æ\u0085pèH)\u0092·r\u0013\u0089ò+À\u001f\t~á\u0082Q\u00adUÉ\u009e¯ÈÇ4ÁI\u0081;tFUóÅ\bÙ©Â#\u008f\u008f¥\u009e\u0091\u0018þ~®\u0091û\u00adBI\u00906\u001d§k~)×#=ºõ\\!\u00853Ï\rK\r5¶$Ì\u001aà\u009b`,\u009e\\N?P=lìTB§`Wº\u0014%\u009b\u001c%y)´\u0013kR\u0005ã\u001c\u0014®ñÙ\u0007\u0082¤² Ê¦\u001bÿ¡³\u0013fÿ2ÓþØ¯#*\u0019\u0013Ýôó¨ö\u0099ZJ\u007frr:\u000e\u0011{D-Õ\u009bªgöÅAÛ@+²MÃë³\u0014\u0085o®½¿³ZÈ]Gâmcw\u0014\u009cS\u009b¢iÓb¯X\u008b\u0004cÝP[$<\u000f\u0004:\u0002¥×(\u009f÷¸\u008cV¾^Í3UÜì²kòW\t~\u009dÿ\u0093ÕÏ ã\u0086n\u001a«\u008bÌn:\u001d¬Ò ðÉ\u0083\u0085\u0080¢Þ\u001e£âÑ?*j\"\u00adrØ\u0082J\bK\u0086\u0018\u0006Õü\u0080¶fñ\n\u0007}IQÌ'5I\u009b5-\b¢X®¾¨tÇMe\u0011ó8®ï\u0016\u0090áàÕ{îBÓÛ5¡\u0085ì¥5\u0087¾FáÔ¯ä©¡22\u0087ð§?Y[\u0001liþ\u0000 \u0085\u0005üÂù]C\u001d\u001cH¯\u008e2²\u001bõ\bÑÖQjñ¹\u0091êqÑ$\u0005æIcé¸\u0006ùu&Ë»>'D'ÿÍêÚ\u008b\u001c¯FEÀ\u0097Ùí{±¸ÿ\u0090\u008b\u0003LÀ\u0017\u0019üÆ\u008dô´\u0099ò\u009aúx¼/\u0084à¢Tæ\u009f¾\"\u0007¾\u0086¶¿\u0087W\u001d\"æ\u0005ô²:úx] Z\u001eò¯-éðúxçu\u0081[Fß«(ÄÕ#\u000e\u0097&)4X\u001d\u00ad)\\<9w4\u0017\u008d\u0012á\u0096Ã\u0087!d$µaxG\u009fs9A\t\u0082\\!`|X]vue\u0089\u0082ö (öÔ\u009bßB\u0080¢¬ò\u009dû\u008c\u0081\u0081ãA?\u0018U0kú¸\u0084°\r~\u0011\u000ebªý\u0014¹\u0010Nd\u001etÿ\u0096ô*h\u0088dë¿è<4\u008e<ß/í|e\u00946K¾O\u0001éavvÂeÛ[Ì¦Z\u0086w Uæ0\u009b\u001fÆyÖ\u0003Ç{òö±/^!§b\u0089[\u0000L1\t÷ª=\b\u009cFîj¤¥Å¥Y\u0001¶\u0010Këè\u0011\u0005Ý+÷ZqÃ\u0007¸\u0016pÝT5µúØLr \u0088Y,EHÃî\u0090!!XÐ;m5Y³7±ü\u000f:»d»Çy&eé6X%@hyRîhôàµom~\u0094\u0013ü\u0097\u000b\u0011~Ø+FQ\u00057\u001bk¶·_I]'²jþéZ$\u0097P2'È1£\u0083oÅ\u0014õ1ÚJ\u0000à®îc6\u000b\u0003úºgowVÅº.~µØ\u009eñúã\f^Ç©\u009d¨ýV£\t3Õ|\u0003ìC\u00858X)OV\u0007¸u\u0080¥\u001aÑH\u0011»³`»óus\u0084¬i<\\\u001f£\u009c\u0018ELÏ>Y\u0016°Pl\u0081¬M\u001bh\u008f\u0088`\u001aÌ\u001eR\u0002w\u0012È\u0087\u0092ª|õ\u0005Ðþ\u001aÇÑ8±\u001e\u0082\u0082\u0096\u0092@f\n>:#U%\u0011cdÕ\"À^\u0012\b4¨ñ\u001eLñ\u008e.a$¥Ö\u0092\u0082¶\u008cs\u0099Ñ±Ú\u0095\u0088Ç· \u0016æ\u008dj\"YW:Ý\u0097\"\u000e\u0007ß§Ì:Ç¼\u001c;\u008e \u0018\u009d\u000eÕ/)\u0012\u0005;«l;¿¾ \u0092\u0019*o#µ\u0018¼\fX?½æö,Ì,ÐDrl\n8\b\u000bN\u0001OV,Î#¨\u000b\"\u007f,²\u001b\\[Å\u0010ð\u0014¡æ\u0092X\tnq5áà¡§}\u0000PöeèÞÃ_öÌ¿\u009aß*\u001eÃ#\u001enk´h$\r\u0087·Vå\u000eôÈ)1\u001fi¡,Â¦MÆZ:\u009d\u0012\u009ai]-!È¨«zL\\.l\u001d\u0096ïÕ6v\u0089ë\u0007r»c»Í@é\u001dU\u001c\f\u001eÿ\u0007Q´hu\u0010é¬7Bñq\u0000ûÎ\u009b\u009eK,0/B[\u0096\tJÿÑT\u0091DÃ÷\u0098þË\u0013>"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IIlIIl = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IIlIIl[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lIIIlII(-1756496836, var23 ^ -1543498874)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIIIllI(-505018885, var23 ^ 1979792195)).length();
      int var1 = lIIIlII(-1756496835, var23 ^ 545323958);
      int var25 = -1;

      label99:
      while (true) {
         int var28 = lIIIlII(-1756496846, var23 ^ 1272287605);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label94: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var28;
               var41 = var45;
               var10001 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var48 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label94;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lIIIlII(-1756496842, var23 ^ -264401954)) {
                     case 0 -> lIIIlII(-1756496841, var23 ^ 1084789992);
                     case 1 -> lIIIlII(-1756496844, var23 ^ 1091615250);
                     case 2 -> lIIIlII(-1756496843, var23 ^ -343261047);
                     case 3 -> lIIIlII(-1756496886, var23 ^ -521666102);
                     case 4 -> lIIIlII(-1756496885, var23 ^ -998893357);
                     case 5 -> lIIIlII(-1756496888, var23 ^ -1267764043);
                     default -> lIIIlII(-1756496887, var23 ^ 294280398);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var10001 <= var6) {
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
                     lllII = var5;
                     lIIll = new String[lIIIlII(-1756496847, var23 ^ -2086392329)];
                     llllI = IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496882, var23 ^ 90696676), lIIIlII(-1756496881, var23 ^ 634712069)));
                     IIIlll = IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496884, var23 ^ 1293224320), lIIIlII(-1756496883, var23 ^ -1438770828)));
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label99;
                  }

                  var4 = (var2 = lIIIllI(-505018886, var23 ^ -1865126411)).length();
                  var1 = lIIIlII(-1756496845, var23 ^ -705360158);
                  var25 = -1;
            }

            var28 = lIIIlII(-1756496848, var23 ^ -861317222);
            var30 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private void llII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 0
      // 03: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 06: invokevirtual k74/x/IIIllIl.lll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 09: ifeq 1f
      // 0c: aload 0
      // 0d: aload 1
      // 0e: aload 0
      // 0f: getfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 12: invokevirtual k74/x/IIIllIl.lIIIIII (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 15: ifne 29
      // 18: goto 1f
      // 1b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 1
      // 21: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 24: return
      // 25: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: aload 0
      // 2a: aload 1
      // 2b: invokevirtual k74/x/IIIllIl.IlIlIl (Lnet/minecraft/class_310;)I
      // 2e: istore 2
      // 2f: aload 0
      // 30: aload 1
      // 31: aload 0
      // 32: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 35: aload 0
      // 36: getfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 39: invokevirtual k74/x/IIIllIl.lI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;)Lk74/x/IlIlIIIIl;
      // 3c: astore 3
      // 3d: iload 2
      // 3e: iflt 4c
      // 41: aload 3
      // 42: ifnonnull 5e
      // 45: goto 4c
      // 48: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aconst_null
      // 4e: putfield k74/x/IIIllIl.IIlIl Lnet/minecraft/class_2338;
      // 51: aload 0
      // 52: getstatic k74/x/IIlIlIlll.IlI Lk74/x/IIlIlIlll;
      // 55: aload 1
      // 56: invokevirtual k74/x/IIIllIl.IIlll (Lk74/x/IIlIlIlll;Lnet/minecraft/class_310;)V
      // 59: return
      // 5a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5d: athrow
      // 5e: aload 0
      // 5f: aload 3
      // 60: invokevirtual k74/x/IlIlIIIIl.I ()Lnet/minecraft/class_2338;
      // 63: putfield k74/x/IIIllIl.IIlIl Lnet/minecraft/class_2338;
      // 66: aload 0
      // 67: aload 1
      // 68: iload 2
      // 69: invokevirtual k74/x/IIIllIl.IllIl (Lnet/minecraft/class_310;I)Z
      // 6c: ifne 74
      // 6f: return
      // 70: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 73: athrow
      // 74: aload 1
      // 75: aload 3
      // 76: invokevirtual k74/x/IlIlIIIIl.l ()Lnet/minecraft/class_243;
      // 79: invokestatic k74/x/IlllIlII.lIII (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 7c: astore 4
      // 7e: aload 4
      // 80: ifnull 8e
      // 83: aload 4
      // 85: bipush 0
      // 86: faload
      // 87: goto 95
      // 8a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8d: athrow
      // 8e: aload 1
      // 8f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 92: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 95: fstore 5
      // 97: aload 4
      // 99: ifnull a7
      // 9c: aload 4
      // 9e: bipush 1
      // 9f: faload
      // a0: goto ae
      // a3: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a6: athrow
      // a7: aload 1
      // a8: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // ab: invokevirtual net/minecraft/class_746.method_36455 ()F
      // ae: fstore 6
      // b0: aload 3
      // b1: invokevirtual k74/x/IlIlIIIIl.II ()Lnet/minecraft/class_3965;
      // b4: astore 7
      // b6: aload 0
      // b7: aload 1
      // b8: getstatic k74/x/IIlIlIlll.Ill Lk74/x/IIlIlIlll;
      // bb: getstatic k74/x/IIlIlIlll.IlI Lk74/x/IIlIlIlll;
      // be: fload 5
      // c0: fload 6
      // c2: aload 7
      // c4: aload 0
      // c5: aload 1
      // c6: iload 2
      // c7: aload 7
      // c9: invokedynamic getAsBoolean (Lk74/x/IIIllIl;Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIl.IllIII (Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Z, ()Z ]
      // ce: invokevirtual k74/x/IIIllIl.II (Lnet/minecraft/class_310;Lk74/x/IIlIlIlll;Lk74/x/IIlIlIlll;FFLnet/minecraft/class_3965;Ljava/util/function/BooleanSupplier;)V
      // d1: return
   }

   private class_243 lllI(class_2338 var1) {
      return new class_243(var1.method_10263() + 0.5, var1.method_10264() + 0.38, var1.method_10260() + 0.5);
   }

   private class_2338[] IIIII(class_2338 var1, class_2350 var2) {
      class_2350 var3 = var2.method_10153();
      return new class_2338[]{
         var1.method_10093(var3), var1.method_10093(var3).method_10093(var3), var1.method_10093(var3.method_10170()), var1.method_10093(var3.method_10160())
      };
   }

   private void IIIIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield k74/x/IIIllIl.IlIII Lk74/x/IllIII;
      // 004: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 007: getstatic k74/x/IlIIllIIl.I Lk74/x/IlIIllIIl;
      // 00a: if_acmpne 08a
      // 00d: aload 0
      // 00e: getstatic k74/x/IIlIlIlll.Il Lk74/x/IIlIlIlll;
      // 011: putfield k74/x/IIIllIl.IlIIl Lk74/x/IIlIlIlll;
      // 014: aload 0
      // 015: aload 1
      // 016: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 019: getfield net/minecraft/class_746.field_6012 I
      // 01c: bipush 2
      // 01d: iadd
      // 01e: putfield k74/x/IIIllIl.IllII I
      // 021: aload 1
      // 022: aload 0
      // 023: aload 0
      // 024: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 027: invokevirtual k74/x/IIIllIl.llIII (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 02a: invokestatic k74/x/IlllIlII.IIlIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 02d: istore 2
      // 02e: aload 1
      // 02f: ldc_w -1756496851
      // 032: ldc_w -869050338
      // 035: ldc_w 204678536
      // 038: ixor
      // 039: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 03c: iload 2
      // 03d: ifeq 04e
      // 040: aload 1
      // 041: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 044: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 047: goto 052
      // 04a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 04d: athrow
      // 04e: aload 0
      // 04f: getfield k74/x/IIIllIl.IIIl F
      // 052: iload 2
      // 053: ifeq 064
      // 056: aload 1
      // 057: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 05a: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 05d: goto 068
      // 060: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 063: athrow
      // 064: aload 0
      // 065: getfield k74/x/IIIllIl.lIIII F
      // 068: aload 0
      // 069: aload 1
      // 06a: invokedynamic a (Lk74/x/IIIllIl;Lnet/minecraft/class_310;)Lk74/x/IIIll; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIl.Ill (Lnet/minecraft/class_310;)Z, ()Z ]
      // 06f: invokestatic k74/x/IlllIlII.IlII (Lnet/minecraft/class_310;IFFLk74/x/IIIll;)Z
      // 072: istore 3
      // 073: iload 3
      // 074: ifne 089
      // 077: aload 0
      // 078: invokevirtual k74/x/IIIllIl.IIllI ()V
      // 07b: aload 0
      // 07c: invokestatic java/lang/System.currentTimeMillis ()J
      // 07f: putfield k74/x/IIIllIl.III J
      // 082: goto 089
      // 085: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 088: athrow
      // 089: return
      // 08a: aload 1
      // 08b: aload 0
      // 08c: aload 0
      // 08d: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 090: invokevirtual k74/x/IIIllIl.llIII (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 093: invokestatic k74/x/IlllIlII.IIlIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z
      // 096: istore 2
      // 097: iload 2
      // 098: ifeq 0a3
      // 09b: fconst_0
      // 09c: goto 0c0
      // 09f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a2: athrow
      // 0a3: aload 0
      // 0a4: getfield k74/x/IIIllIl.I Lk74/x/IlIIIllll;
      // 0a7: aload 1
      // 0a8: aload 0
      // 0a9: aload 0
      // 0aa: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 0ad: invokevirtual k74/x/IIIllIl.llIII (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 0b0: aload 0
      // 0b1: getfield k74/x/IIIllIl.IIIIlI Lk74/x/IIlIII;
      // 0b4: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 0b7: checkcast java/lang/Double
      // 0ba: invokevirtual java/lang/Double.floatValue ()F
      // 0bd: invokevirtual k74/x/IlIIIllll.IIIllII (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;F)F
      // 0c0: fstore 3
      // 0c1: invokestatic java/lang/System.currentTimeMillis ()J
      // 0c4: lstore 4
      // 0c6: iload 2
      // 0c7: ifne 0ee
      // 0ca: fload 3
      // 0cb: ldc_w 0.5
      // 0ce: fcmpg
      // 0cf: ifle 0ee
      // 0d2: goto 0d9
      // 0d5: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d8: athrow
      // 0d9: lload 4
      // 0db: aload 0
      // 0dc: getfield k74/x/IIIllIl.IIIllI J
      // 0df: lsub
      // 0e0: ldc2_w 1500
      // 0e3: lcmp
      // 0e4: iflt 166
      // 0e7: goto 0ee
      // 0ea: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: getstatic k74/x/IIlIlIlll.Il Lk74/x/IIlIlIlll;
      // 0f2: putfield k74/x/IIIllIl.IlIIl Lk74/x/IIlIlIlll;
      // 0f5: aload 0
      // 0f6: aload 1
      // 0f7: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0fa: getfield net/minecraft/class_746.field_6012 I
      // 0fd: bipush 2
      // 0fe: iadd
      // 0ff: putfield k74/x/IIIllIl.IllII I
      // 102: aload 1
      // 103: ldc_w -1756496862
      // 106: ldc_w -869050338
      // 109: ldc_w 892975787
      // 10c: ixor
      // 10d: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 110: iload 2
      // 111: ifeq 129
      // 114: goto 11b
      // 117: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11a: athrow
      // 11b: aload 1
      // 11c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 11f: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 122: goto 12d
      // 125: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 128: athrow
      // 129: aload 0
      // 12a: getfield k74/x/IIIllIl.IIIl F
      // 12d: iload 2
      // 12e: ifeq 13f
      // 131: aload 1
      // 132: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 135: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 138: goto 143
      // 13b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 13e: athrow
      // 13f: aload 0
      // 140: getfield k74/x/IIIllIl.lIIII F
      // 143: aload 0
      // 144: aload 1
      // 145: invokedynamic a (Lk74/x/IIIllIl;Lnet/minecraft/class_310;)Lk74/x/IIIll; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIl.llIIl (Lnet/minecraft/class_310;)Z, ()Z ]
      // 14a: invokestatic k74/x/IlllIlII.IlII (Lnet/minecraft/class_310;IFFLk74/x/IIIll;)Z
      // 14d: istore 6
      // 14f: iload 6
      // 151: ifne 166
      // 154: aload 0
      // 155: invokevirtual k74/x/IIIllIl.IIllI ()V
      // 158: aload 0
      // 159: invokestatic java/lang/System.currentTimeMillis ()J
      // 15c: putfield k74/x/IIIllIl.III J
      // 15f: goto 166
      // 162: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 165: athrow
      // 166: return
   }

   private class_243 IIIlI(class_2338 var1) {
      return class_243.method_24955(var1);
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private lIIlIIll IIIll(class_310 var1, lIIIII var2, float var3, float var4) {
      if (var1.field_1765 instanceof class_3965 var6) {
         try {
            if (var6.method_17783() == class_240.field_1332) {
               return this.IIllIl(var1, var2, var6, var3, var4);
            }
         } catch (MatchException var8) {
            throw IllIIl(var8);
         }
      }

      try {
         return null;
      } catch (MatchException var7) {
         throw IllIIl(var7);
      }
   }

   private class_243 IIlII(class_2338 var1) {
      return class_243.method_24955(var1);
   }

   private void IIllI() {
      this.IlIIl = IIlIlIlll.I;
      this.IllII = lIIIlII(-1756496861, 1325065636 ^ 512196780);
   }

   private void IIlll(IIlIlIlll param1, class_310 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aconst_null
      // 02: putfield k74/x/IIIllIl.lIlIl Lk74/x/IIlIlIII;
      // 05: aload 0
      // 06: getfield k74/x/IIIllIl.llll Lk74/x/IlIIlll;
      // 09: invokevirtual k74/x/IlIIlll.l ()V
      // 0c: aload 1
      // 0d: getstatic k74/x/IIlIlIlll.ll Lk74/x/IIlIlIlll;
      // 10: if_acmpeq 41
      // 13: aload 1
      // 14: getstatic k74/x/IIlIlIlll.I Lk74/x/IIlIlIlll;
      // 17: if_acmpeq 41
      // 1a: goto 21
      // 1d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 20: athrow
      // 21: aload 0
      // 22: getfield k74/x/IIIllIl.lIlI Lk74/x/IIlIlIlll;
      // 25: getstatic k74/x/IIlIlIlll.I Lk74/x/IIlIlIlll;
      // 28: if_acmpeq 41
      // 2b: goto 32
      // 2e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 31: athrow
      // 32: aload 2
      // 33: aload 0
      // 34: getstatic k74/x/lllIII.I Lk74/x/lllIII;
      // 37: invokestatic k74/x/IIll.lllIl (Lnet/minecraft/class_310;Ljava/lang/Object;Lk74/x/lllIII;)V
      // 3a: goto 41
      // 3d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 40: athrow
      // 41: aload 0
      // 42: aload 1
      // 43: putfield k74/x/IIIllIl.lIlI Lk74/x/IIlIlIlll;
      // 46: invokestatic java/lang/System.currentTimeMillis ()J
      // 49: lstore 3
      // 4a: aload 0
      // 4b: lload 3
      // 4c: putfield k74/x/IIIllIl.IIIllI J
      // 4f: aload 0
      // 50: lload 3
      // 51: lconst_0
      // 52: aload 0
      // 53: aload 1
      // 54: invokevirtual k74/x/IIIllIl.lIIlIl (Lk74/x/IIlIlIlll;)J
      // 57: ldc2_w 50
      // 5a: lsub
      // 5b: invokestatic java/lang/Math.max (JJ)J
      // 5e: ladd
      // 5f: putfield k74/x/IIIllIl.III J
      // 62: return
   }

   private void IllII() {
      this.IIllI();
      this.III = System.currentTimeMillis() + 50L;
   }

   private boolean IllIl(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 35
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 35
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: iload 2
      // 13: iflt 35
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: iload 2
      // 1e: ldc_w -1756496864
      // 21: ldc_w -1649609289
      // 24: ldc_w 793718177
      // 27: ixor
      // 28: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 2b: if_icmplt 40
      // 2e: goto 35
      // 31: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 3a: bipush 0
      // 3b: ireturn
      // 3c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3f: athrow
      // 40: aload 0
      // 41: aload 1
      // 42: iload 2
      // 43: invokevirtual k74/x/IIIllIl.IllllII (Lnet/minecraft/class_310;I)Z
      // 46: ireturn
   }

   private boolean IlllI(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 31
      // 04: aload 1
      // 05: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 08: ifne 31
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 16: instanceof net/minecraft/class_1764
      // 19: ifeq 31
      // 1c: goto 23
      // 1f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: aload 1
      // 24: invokestatic net/minecraft/class_1764.method_7781 (Lnet/minecraft/class_1799;)Z
      // 27: ifne 37
      // 2a: goto 31
      // 2d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
      // 33: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 36: athrow
      // 37: aload 1
      // 38: getstatic net/minecraft/class_9334.field_49649 Lnet/minecraft/class_9331;
      // 3b: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 3e: checkcast net/minecraft/class_9278
      // 41: astore 2
      // 42: aload 2
      // 43: ifnull 6d
      // 46: aload 2
      // 47: invokevirtual net/minecraft/class_9278.method_57442 ()Z
      // 4a: ifne 6d
      // 4d: goto 54
      // 50: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 53: athrow
      // 54: aload 2
      // 55: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
      // 58: invokevirtual net/minecraft/class_9278.method_57438 (Lnet/minecraft/class_1792;)Z
      // 5b: ifne 6d
      // 5e: goto 65
      // 61: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 64: athrow
      // 65: bipush 1
      // 66: goto 6e
      // 69: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6c: athrow
      // 6d: bipush 0
      // 6e: ireturn
   }

   private boolean Illll(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 2b
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 2b
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 2b
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 2
      // 21: ifnonnull 31
      // 24: goto 2b
      // 27: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
      // 2d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: aload 1
      // 32: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 35: aload 2
      // 36: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 39: astore 3
      // 3a: aload 1
      // 3b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3e: aload 2
      // 3f: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 42: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 45: astore 4
      // 47: aload 3
      // 48: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 4b: ifne 5c
      // 4e: aload 3
      // 4f: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 52: ifeq e0
      // 55: goto 5c
      // 58: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5b: athrow
      // 5c: aload 4
      // 5e: ifnull e0
      // 61: goto 68
      // 64: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 67: athrow
      // 68: aload 4
      // 6a: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 6d: ifne e0
      // 70: goto 77
      // 73: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 76: athrow
      // 77: aload 4
      // 79: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 7c: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 7f: ifeq e0
      // 82: goto 89
      // 85: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 88: athrow
      // 89: aload 4
      // 8b: aload 1
      // 8c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 8f: aload 2
      // 90: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 93: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 96: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 99: ifne e0
      // 9c: goto a3
      // 9f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a2: athrow
      // a3: aload 1
      // a4: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a7: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // aa: aload 0
      // ab: aload 2
      // ac: invokevirtual k74/x/IIIllIl.IIIlI (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // af: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // b2: ldc2_w 20.25
      // b5: dcmpg
      // b6: ifgt e0
      // b9: goto c0
      // bc: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // bf: athrow
      // c0: aload 0
      // c1: aload 1
      // c2: aload 0
      // c3: aload 2
      // c4: invokevirtual k74/x/IIIllIl.IlIlII (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // c7: aload 2
      // c8: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // cb: invokevirtual k74/x/IIIllIl.IlllIll (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Z
      // ce: ifeq e0
      // d1: goto d8
      // d4: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d7: athrow
      // d8: bipush 1
      // d9: goto e1
      // dc: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // df: athrow
      // e0: bipush 0
      // e1: ireturn
   }

   private double lIIII(class_243 param1, class_243 param2, class_243 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: ifnonnull 0c
      // 04: ldc2_w NaN
      // 07: dreturn
      // 08: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b: athrow
      // 0c: aload 2
      // 0d: getfield net/minecraft/class_243.field_1352 D
      // 10: aload 1
      // 11: getfield net/minecraft/class_243.field_1352 D
      // 14: dsub
      // 15: dstore 4
      // 17: aload 2
      // 18: getfield net/minecraft/class_243.field_1351 D
      // 1b: aload 1
      // 1c: getfield net/minecraft/class_243.field_1351 D
      // 1f: dsub
      // 20: dstore 6
      // 22: aload 2
      // 23: getfield net/minecraft/class_243.field_1350 D
      // 26: aload 1
      // 27: getfield net/minecraft/class_243.field_1350 D
      // 2a: dsub
      // 2b: dstore 8
      // 2d: dload 4
      // 2f: invokestatic java/lang/Math.abs (D)D
      // 32: dstore 10
      // 34: dload 6
      // 36: invokestatic java/lang/Math.abs (D)D
      // 39: dstore 12
      // 3b: dload 8
      // 3d: invokestatic java/lang/Math.abs (D)D
      // 40: dstore 14
      // 42: dload 10
      // 44: dload 12
      // 46: dcmpl
      // 47: iflt 7a
      // 4a: dload 10
      // 4c: dload 14
      // 4e: dcmpl
      // 4f: iflt 7a
      // 52: goto 59
      // 55: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 58: athrow
      // 59: dload 10
      // 5b: ldc2_w 1.0E-7
      // 5e: dcmpl
      // 5f: ifle 7a
      // 62: goto 69
      // 65: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 68: athrow
      // 69: aload 3
      // 6a: getfield net/minecraft/class_243.field_1352 D
      // 6d: aload 1
      // 6e: getfield net/minecraft/class_243.field_1352 D
      // 71: dsub
      // 72: dload 4
      // 74: ddiv
      // 75: dreturn
      // 76: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 79: athrow
      // 7a: dload 12
      // 7c: dload 10
      // 7e: dcmpl
      // 7f: iflt b2
      // 82: dload 12
      // 84: dload 14
      // 86: dcmpl
      // 87: iflt b2
      // 8a: goto 91
      // 8d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 90: athrow
      // 91: dload 12
      // 93: ldc2_w 1.0E-7
      // 96: dcmpl
      // 97: ifle b2
      // 9a: goto a1
      // 9d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a0: athrow
      // a1: aload 3
      // a2: getfield net/minecraft/class_243.field_1351 D
      // a5: aload 1
      // a6: getfield net/minecraft/class_243.field_1351 D
      // a9: dsub
      // aa: dload 6
      // ac: ddiv
      // ad: dreturn
      // ae: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b1: athrow
      // b2: dload 14
      // b4: ldc2_w 1.0E-7
      // b7: dcmpl
      // b8: ifle cc
      // bb: aload 3
      // bc: getfield net/minecraft/class_243.field_1350 D
      // bf: aload 1
      // c0: getfield net/minecraft/class_243.field_1350 D
      // c3: dsub
      // c4: dload 8
      // c6: ddiv
      // c7: dreturn
      // c8: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // cb: athrow
      // cc: ldc2_w NaN
      // cf: dreturn
   }

   private boolean lIIIl(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 42
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 42
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 2
      // 13: ifnull 42
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: aload 1
      // 1e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 21: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 24: aload 0
      // 25: aload 2
      // 26: invokevirtual k74/x/IIIllIl.llIll (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 29: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 2c: ldc2_w 20.25
      // 2f: dcmpg
      // 30: ifgt 42
      // 33: goto 3a
      // 36: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 43
      // 3e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
   }

   private void lIIlI(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 0
      // 03: getfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 06: invokevirtual k74/x/IIIllIl.llI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 09: ifeq 4b
      // 0c: aload 0
      // 0d: aload 1
      // 0e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 11: aload 0
      // 12: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 15: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 18: invokevirtual k74/x/IIIllIl.llIIlI (Lnet/minecraft/class_2680;)Z
      // 1b: ifeq 4b
      // 1e: goto 25
      // 21: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 24: athrow
      // 25: aload 0
      // 26: aload 1
      // 27: aload 0
      // 28: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 2b: invokevirtual k74/x/IIIllIl.lll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 2e: ifeq 4b
      // 31: goto 38
      // 34: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 37: athrow
      // 38: aload 0
      // 39: aload 1
      // 3a: aload 0
      // 3b: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 3e: invokevirtual k74/x/IIIllIl.lIIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 41: ifne 55
      // 44: goto 4b
      // 47: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4a: athrow
      // 4b: aload 0
      // 4c: aload 1
      // 4d: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 50: return
      // 51: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 54: athrow
      // 55: aload 0
      // 56: aload 1
      // 57: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5a: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 5d: aload 0
      // 5e: getfield k74/x/IIIllIl.Illl I
      // 61: aload 0
      // 62: getfield k74/x/IIIllIl.IIlII Lk74/x/IIIIll;
      // 65: invokevirtual k74/x/IIIllIl.lII (Lnet/minecraft/class_1661;ILk74/x/IIIIll;)Z
      // 68: ifeq 7e
      // 6b: aload 0
      // 6c: aload 1
      // 6d: aload 0
      // 6e: getfield k74/x/IIIllIl.Illl I
      // 71: invokevirtual k74/x/IIIllIl.IllIl (Lnet/minecraft/class_310;I)Z
      // 74: ifne 83
      // 77: goto 7e
      // 7a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7d: athrow
      // 7e: return
      // 7f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 82: athrow
      // 83: aload 0
      // 84: aload 0
      // 85: getfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 88: invokevirtual k74/x/IIIllIl.lIlll (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 8b: astore 2
      // 8c: aload 0
      // 8d: aload 1
      // 8e: getstatic k74/x/IIlIlIlll.l Lk74/x/IIlIlIlll;
      // 91: getstatic k74/x/IIlIlIlll.III Lk74/x/IIlIlIlll;
      // 94: aload 0
      // 95: getfield k74/x/IIIllIl.IIIII F
      // 98: aload 0
      // 99: getfield k74/x/IIIllIl.IIll F
      // 9c: aload 2
      // 9d: aload 0
      // 9e: aload 1
      // 9f: aload 2
      // a0: invokedynamic getAsBoolean (Lk74/x/IIIllIl;Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIl.IIIllI (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z, ()Z ]
      // a5: invokevirtual k74/x/IIIllIl.II (Lnet/minecraft/class_310;Lk74/x/IIlIlIlll;Lk74/x/IIlIlIlll;FFLnet/minecraft/class_3965;Ljava/util/function/BooleanSupplier;)V
      // a8: return
   }

   private boolean lIIll(class_3965 param1, class_243 param2, class_243 param3, double param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual k74/x/IIIllIl.IlIllI (Lnet/minecraft/class_3965;)Z
      // 05: ifne 0e
      // 08: bipush 0
      // 09: ireturn
      // 0a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d: athrow
      // 0e: aload 0
      // 0f: aload 2
      // 10: aload 3
      // 11: aload 1
      // 12: invokevirtual net/minecraft/class_3965.method_17784 ()Lnet/minecraft/class_243;
      // 15: invokevirtual k74/x/IIIllIl.lIIII (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)D
      // 18: dstore 6
      // 1a: dload 6
      // 1c: invokestatic java/lang/Double.isNaN (D)Z
      // 1f: ifne 31
      // 22: dload 6
      // 24: dload 4
      // 26: dcmpg
      // 27: ifge 39
      // 2a: goto 31
      // 2d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: bipush 1
      // 32: goto 3a
      // 35: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 38: athrow
      // 39: bipush 0
      // 3a: ireturn
   }

   private IIllllIll lIlII(class_310 param1) {
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
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aconst_null
      // 13: areturn
      // 14: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 1
      // 19: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 1f: astore 2
      // 20: aload 2
      // 21: invokestatic k74/x/IIll.IIlII (Lnet/minecraft/class_1661;)I
      // 24: istore 3
      // 25: aload 1
      // 26: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 29: invokevirtual net/minecraft/class_746.method_6047 ()Lnet/minecraft/class_1799;
      // 2c: astore 4
      // 2e: aload 0
      // 2f: aload 4
      // 31: invokevirtual k74/x/IIIllIl.IlllI (Lnet/minecraft/class_1799;)Z
      // 34: ifeq 49
      // 37: new k74/x/IIllllIll
      // 3a: dup
      // 3b: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 3e: iload 3
      // 3f: aload 4
      // 41: invokespecial k74/x/IIllllIll.<init> (Lnet/minecraft/class_1268;ILnet/minecraft/class_1799;)V
      // 44: areturn
      // 45: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 48: athrow
      // 49: aload 1
      // 4a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4d: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 50: astore 5
      // 52: aload 0
      // 53: aload 5
      // 55: invokevirtual k74/x/IIIllIl.IlllI (Lnet/minecraft/class_1799;)Z
      // 58: ifeq 6d
      // 5b: new k74/x/IIllllIll
      // 5e: dup
      // 5f: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
      // 62: bipush -1
      // 63: aload 5
      // 65: invokespecial k74/x/IIllllIll.<init> (Lnet/minecraft/class_1268;ILnet/minecraft/class_1799;)V
      // 68: areturn
      // 69: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6c: athrow
      // 6d: bipush 0
      // 6e: istore 6
      // 70: iload 6
      // 72: ldc_w -1756496863
      // 75: ldc_w 817245336
      // 78: ldc_w 599287116
      // 7b: ixor
      // 7c: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 7f: if_icmpge ac
      // 82: aload 2
      // 83: iload 6
      // 85: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 88: astore 7
      // 8a: aload 0
      // 8b: aload 7
      // 8d: invokevirtual k74/x/IIIllIl.IlllI (Lnet/minecraft/class_1799;)Z
      // 90: ifeq a6
      // 93: new k74/x/IIllllIll
      // 96: dup
      // 97: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 9a: iload 6
      // 9c: aload 7
      // 9e: invokespecial k74/x/IIllllIll.<init> (Lnet/minecraft/class_1268;ILnet/minecraft/class_1799;)V
      // a1: areturn
      // a2: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a5: athrow
      // a6: iinc 6 1
      // a9: goto 70
      // ac: aconst_null
      // ad: areturn
   }

   private void lIlIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield k74/x/IIIllIl.IIIIIl Z
      // 004: ifeq 00c
      // 007: return
      // 008: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 00b: athrow
      // 00c: aload 0
      // 00d: aload 1
      // 00e: invokevirtual k74/x/IIIllIl.lIlIlI (Lnet/minecraft/class_310;)Z
      // 011: ifeq 03a
      // 014: aload 0
      // 015: aload 1
      // 016: aload 0
      // 017: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 01a: invokevirtual k74/x/IIIllIl.lll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 01d: ifeq 03a
      // 020: goto 027
      // 023: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 026: athrow
      // 027: aload 0
      // 028: aload 1
      // 029: aload 0
      // 02a: getfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 02d: invokevirtual k74/x/IIIllIl.lIIIIII (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 030: ifne 044
      // 033: goto 03a
      // 036: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 039: athrow
      // 03a: aload 0
      // 03b: aload 1
      // 03c: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 03f: return
      // 040: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 043: athrow
      // 044: aload 0
      // 045: aload 1
      // 046: invokevirtual k74/x/IIIllIl.IIllll (Lnet/minecraft/class_310;)Z
      // 049: ifne 056
      // 04c: aload 0
      // 04d: aload 1
      // 04e: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 051: return
      // 052: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 055: athrow
      // 056: aload 0
      // 057: getfield k74/x/IIIllIl.IIl Lnet/minecraft/class_1268;
      // 05a: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 05d: if_acmpne 078
      // 060: aload 0
      // 061: aload 1
      // 062: aload 0
      // 063: getfield k74/x/IIIllIl.Ill I
      // 066: invokevirtual k74/x/IIIllIl.IllIl (Lnet/minecraft/class_310;I)Z
      // 069: ifne 078
      // 06c: goto 073
      // 06f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 072: athrow
      // 073: return
      // 074: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 077: athrow
      // 078: aload 0
      // 079: getfield k74/x/IIIllIl.IlIII Lk74/x/IllIII;
      // 07c: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 07f: getstatic k74/x/IlIIllIIl.I Lk74/x/IlIIllIIl;
      // 082: if_acmpne 0e1
      // 085: aload 0
      // 086: bipush 1
      // 087: putfield k74/x/IIIllIl.IIIIIl Z
      // 08a: aload 0
      // 08b: aload 1
      // 08c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08f: getfield net/minecraft/class_746.field_6012 I
      // 092: bipush 1
      // 093: iadd
      // 094: putfield k74/x/IIIllIl.IIllI I
      // 097: aload 1
      // 098: ldc_w -1756496858
      // 09b: ldc_w 974330437
      // 09e: ldc_w -942156525
      // 0a1: ixor
      // 0a2: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 0a5: aload 0
      // 0a6: getfield k74/x/IIIllIl.IlIl F
      // 0a9: aload 0
      // 0aa: getfield k74/x/IIIllIl.lI F
      // 0ad: aload 0
      // 0ae: aload 1
      // 0af: invokedynamic a (Lk74/x/IIIllIl;Lnet/minecraft/class_310;)Lk74/x/IIIll; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIl.lIIllI (Lnet/minecraft/class_310;)Z, ()Z ]
      // 0b4: invokestatic k74/x/IlllIlII.IIII (Lnet/minecraft/class_310;IFFLk74/x/IIIll;)Z
      // 0b7: istore 2
      // 0b8: iload 2
      // 0b9: ifne 0e0
      // 0bc: aload 0
      // 0bd: bipush 0
      // 0be: putfield k74/x/IIIllIl.IIIIIl Z
      // 0c1: aload 0
      // 0c2: ldc_w -1756496857
      // 0c5: ldc_w 974330437
      // 0c8: ldc_w 1281784553
      // 0cb: ixor
      // 0cc: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 0cf: putfield k74/x/IIIllIl.IIllI I
      // 0d2: aload 0
      // 0d3: invokestatic java/lang/System.currentTimeMillis ()J
      // 0d6: putfield k74/x/IIIllIl.III J
      // 0d9: goto 0e0
      // 0dc: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0df: athrow
      // 0e0: return
      // 0e1: aload 0
      // 0e2: getfield k74/x/IIIllIl.I Lk74/x/IlIIIllll;
      // 0e5: aload 1
      // 0e6: aload 0
      // 0e7: aload 1
      // 0e8: aload 0
      // 0e9: getfield k74/x/IIIllIl.IlIl F
      // 0ec: aload 0
      // 0ed: getfield k74/x/IIIllIl.lI F
      // 0f0: invokevirtual k74/x/IIIllIl.IIll (Lnet/minecraft/class_310;FF)Lnet/minecraft/class_243;
      // 0f3: aload 0
      // 0f4: getfield k74/x/IIIllIl.IIIIlI Lk74/x/IIlIII;
      // 0f7: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 0fa: checkcast java/lang/Double
      // 0fd: invokevirtual java/lang/Double.floatValue ()F
      // 100: invokevirtual k74/x/IlIIIllll.llllII (Lnet/minecraft/class_310;Lnet/minecraft/class_243;F)F
      // 103: fstore 2
      // 104: invokestatic java/lang/System.currentTimeMillis ()J
      // 107: lstore 3
      // 108: fload 2
      // 109: ldc_w 0.5
      // 10c: fcmpg
      // 10d: ifle 124
      // 110: lload 3
      // 111: aload 0
      // 112: getfield k74/x/IIIllIl.IIIllI J
      // 115: lsub
      // 116: ldc2_w 1500
      // 119: lcmp
      // 11a: iflt 142
      // 11d: goto 124
      // 120: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 123: athrow
      // 124: aload 0
      // 125: aload 1
      // 126: invokevirtual k74/x/IIIllIl.lIIIll (Lnet/minecraft/class_310;)Z
      // 129: istore 5
      // 12b: iload 5
      // 12d: ifne 13a
      // 130: aload 0
      // 131: aload 1
      // 132: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 135: return
      // 136: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 139: athrow
      // 13a: aload 0
      // 13b: getstatic k74/x/IIlIlIlll.ll Lk74/x/IIlIlIlll;
      // 13e: aload 1
      // 13f: invokevirtual k74/x/IIIllIl.IIlll (Lk74/x/IIlIlIlll;Lnet/minecraft/class_310;)V
      // 142: return
   }

   private int lIllI(class_1661 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: iload 2
      // 03: ldc_w -1756496860
      // 06: ldc_w -670155170
      // 09: ldc_w -100885538
      // 0c: ixor
      // 0d: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 10: if_icmpge 62
      // 13: aload 1
      // 14: iload 2
      // 15: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 18: astore 3
      // 19: aload 3
      // 1a: getstatic net/minecraft/class_1802.field_8129 Lnet/minecraft/class_1792;
      // 1d: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 20: ifne 56
      // 23: aload 3
      // 24: getstatic net/minecraft/class_1802.field_8848 Lnet/minecraft/class_1792;
      // 27: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 2a: ifne 56
      // 2d: goto 34
      // 30: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 33: athrow
      // 34: aload 3
      // 35: getstatic net/minecraft/class_1802.field_8211 Lnet/minecraft/class_1792;
      // 38: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 3b: ifne 56
      // 3e: goto 45
      // 41: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 44: athrow
      // 45: aload 3
      // 46: getstatic net/minecraft/class_1802.field_8655 Lnet/minecraft/class_1792;
      // 49: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 4c: ifeq 5c
      // 4f: goto 56
      // 52: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 55: athrow
      // 56: iload 2
      // 57: ireturn
      // 58: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5b: athrow
      // 5c: iinc 2 1
      // 5f: goto 02
      // 62: bipush -1
      // 63: ireturn
   }

   private class_3965 lIlll(class_2338 var1) {
      return new class_3965(this.IIlII(var1), class_2350.field_11036, var1.method_10074(), false);
   }

   private static String lIIIllI(int var0, int var1) {
      int var3 = var0 ^ -505018885;
      char[] var4 = IIlIlI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIlIll[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIlIll[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1141708149;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 147;
            case 1 -> 121;
            case 2 -> 76;
            case 3 -> 18;
            case 4 -> 125;
            case 5 -> 92;
            case 6 -> 233;
            case 7 -> 179;
            case 8 -> 4;
            case 9 -> 169;
            case 10 -> 68;
            case 11 -> 205;
            case 12 -> 121;
            case 13 -> 144;
            case 14 -> 161;
            case 15 -> 5;
            case 16 -> 67;
            case 17 -> 191;
            case 18 -> 217;
            case 19 -> 74;
            case 20 -> 49;
            case 21 -> 243;
            case 22 -> 138;
            case 23 -> 152;
            case 24 -> 165;
            case 25 -> 156;
            case 26 -> 155;
            case 27 -> 134;
            case 28 -> 9;
            case 29 -> 77;
            case 30 -> 184;
            case 31 -> 185;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private class_3965 llIII(class_2338 var1) {
      try {
         if (var1 == null) {
            return null;
         }
      } catch (MatchException var2) {
         throw IllIIl(var2);
      }

      return new class_3965(this.llIll(var1), class_2350.field_11036, var1, false);
   }

   private boolean llIIl(class_310 var1) {
      return this.lllll(var1);
   }

   private IIIIlIllI llIlI(class_1661 var1) {
      int var2 = this.Illlll(var1, class_1802.field_8884);
      int var3 = this.Illlll(var1, class_1802.field_8187);

      label86: {
         label87: {
            try {
               switch ((IlIIIllI)this.llIlI.IllI()) {
                  case II:
                     break;
                  case Il:
                     break label87;
                  case lI:
                     break label86;
                  default:
                     throw new MatchException(null, null);
               }
            } catch (MatchException var8) {
               throw IllIIl(var8);
            }

            try {
               if (var2 < 0) {
                  return null;
               }
            } catch (MatchException var7) {
               throw IllIIl(var7);
            }

            return new IIIIlIllI(var2, k74.x.IIIIll.I);
         }

         try {
            if (var3 < 0) {
               return null;
            }
         } catch (MatchException var6) {
            throw IllIIl(var6);
         }

         return new IIIIlIllI(var3, k74.x.IIIIll.l);
      }

      try {
         if (var2 >= 0) {
            return new IIIIlIllI(var2, k74.x.IIIIll.I);
         }
      } catch (MatchException var5) {
         throw IllIIl(var5);
      }

      try {
         if (var3 < 0) {
            return null;
         }
      } catch (MatchException var4) {
         throw IllIIl(var4);
      }

      return new IIIIlIllI(var3, k74.x.IIIIll.l);
   }

   private class_243 llIll(class_2338 var1) {
      return class_243.method_24955(var1).method_1031(0.0, 0.125, 0.0);
   }

   private static boolean lllII(class_310 var0) {
      return k74.x.IIll.IllIIll(var0, class_1268.field_5808);
   }

   private int lllIl(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1d
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: ifnull 1d
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 2
      // 13: ifnonnull 23
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
      // 1f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: new net/minecraft/class_238
      // 26: dup
      // 27: aload 2
      // 28: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 2b: ldc2_w 0.75
      // 2e: ldc2_w 0.6
      // 31: ldc2_w 0.75
      // 34: invokevirtual net/minecraft/class_238.method_1009 (DDD)Lnet/minecraft/class_238;
      // 37: astore 3
      // 38: aload 1
      // 39: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3c: aconst_null
      // 3d: aload 3
      // 3e: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IIIllIl.lIIlll (Lnet/minecraft/class_1297;)Z, (Lnet/minecraft/class_1297;)Z ]
      // 43: invokevirtual net/minecraft/class_638.method_8333 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;Ljava/util/function/Predicate;)Ljava/util/List;
      // 46: invokeinterface java/util/List.size ()I 1
      // 4b: ireturn
   }

   private boolean llllI(class_310 var1, class_3965 var2) {
      return this.lIl(var1, this.IlII, var2);
   }

   private boolean lllll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIl.lIlI Lk74/x/IIlIlIlll;
      // 04: getstatic k74/x/IIlIlIlll.Il Lk74/x/IIlIlIlll;
      // 07: if_acmpne 39
      // 0a: aload 0
      // 0b: aload 1
      // 0c: aload 0
      // 0d: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 10: invokevirtual k74/x/IIIllIl.lIlIll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 13: ifeq 39
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 1
      // 1f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 22: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 25: aload 0
      // 26: getfield k74/x/IIIllIl.llIIl I
      // 29: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 2c: invokevirtual k74/x/IIIllIl.IlIl (Lnet/minecraft/class_1799;)Z
      // 2f: ifne 43
      // 32: goto 39
      // 35: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual k74/x/IIIllIl.IllII ()V
      // 3d: bipush 0
      // 3e: ireturn
      // 3f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 42: athrow
      // 43: aload 0
      // 44: invokevirtual k74/x/IIIllIl.IIllI ()V
      // 47: aload 0
      // 48: aload 1
      // 49: aload 0
      // 4a: getfield k74/x/IIIllIl.llIIl I
      // 4d: aload 0
      // 4e: aload 0
      // 4f: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 52: invokevirtual k74/x/IIIllIl.llIII (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 55: invokevirtual k74/x/IIIllIl.lIl (Lnet/minecraft/class_310;ILnet/minecraft/class_3965;)Z
      // 58: istore 2
      // 59: iload 2
      // 5a: ifeq 76
      // 5d: aload 0
      // 5e: dup
      // 5f: getfield k74/x/IIIllIl.lIlII I
      // 62: bipush 1
      // 63: iadd
      // 64: putfield k74/x/IIIllIl.lIlII I
      // 67: aload 0
      // 68: getstatic k74/x/IIlIlIlll.IIl Lk74/x/IIlIlIlll;
      // 6b: aload 1
      // 6c: invokevirtual k74/x/IIIllIl.IIlll (Lk74/x/IIlIlIlll;Lnet/minecraft/class_310;)V
      // 6f: goto 7a
      // 72: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 75: athrow
      // 76: aload 0
      // 77: invokevirtual k74/x/IIIllIl.IllII ()V
      // 7a: iload 2
      // 7b: ireturn
   }

   private boolean IIIIII(class_310 param1, IIlIlIlll param2, IIlIlIlll param3, BooleanSupplier param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIl.lIlI Lk74/x/IIlIlIlll;
      // 04: aload 2
      // 05: if_acmpne 17
      // 08: aload 0
      // 09: getfield k74/x/IIIllIl.IlIIl Lk74/x/IIlIlIlll;
      // 0c: aload 2
      // 0d: if_acmpeq 1d
      // 10: goto 17
      // 13: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: bipush 0
      // 18: ireturn
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: invokevirtual k74/x/IIIllIl.IIllI ()V
      // 21: aload 0
      // 22: aload 1
      // 23: invokevirtual k74/x/IIIllIl.IIIIll (Lnet/minecraft/class_310;)V
      // 26: aload 0
      // 27: aload 4
      // 29: invokevirtual k74/x/IIIllIl.lIIIIIl (Ljava/util/function/BooleanSupplier;)Z
      // 2c: istore 5
      // 2e: iload 5
      // 30: ifeq 40
      // 33: aload 0
      // 34: aload 3
      // 35: aload 1
      // 36: invokevirtual k74/x/IIIllIl.IIlll (Lk74/x/IIlIlIlll;Lnet/minecraft/class_310;)V
      // 39: goto 4b
      // 3c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3f: athrow
      // 40: aload 0
      // 41: invokestatic java/lang/System.currentTimeMillis ()J
      // 44: ldc2_w 50
      // 47: ladd
      // 48: putfield k74/x/IIIllIl.III J
      // 4b: iload 5
      // 4d: ireturn
   }

   private class_2338[] IIIIIl(class_3965 var1, class_2350 var2) {
      class_2338 var3 = var1.method_17777();
      class_2350 var4 = var1.method_17780();

      try {
         if (var4 == class_2350.field_11036) {
            return new class_2338[]{var3.method_10084(), var3.method_10093(var2).method_10084(), var3.method_10093(var2.method_10153()).method_10084()};
         }
      } catch (MatchException var5) {
         throw IllIIl(var5);
      }

      try {
         if (var4.method_10166().method_10179()) {
            return new class_2338[]{var3.method_10093(var4), var3.method_10084(), var3.method_10093(var2).method_10084()};
         }
      } catch (MatchException var6) {
         throw IllIIl(var6);
      }

      return new class_2338[]{var3.method_10084()};
   }

   private double[] IIIIlI(double param1, double param3, double param5, double param7, double param9, double param11) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 3
      // 01: invokestatic java/lang/Math.abs (D)D
      // 04: ldc2_w 1.0E-7
      // 07: dcmpg
      // 08: ifge 3d
      // 0b: dload 1
      // 0c: dload 5
      // 0e: dcmpl
      // 0f: iflt 3b
      // 12: goto 19
      // 15: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 18: athrow
      // 19: dload 1
      // 1a: dload 7
      // 1c: dcmpg
      // 1d: ifgt 3b
      // 20: goto 27
      // 23: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: bipush 2
      // 28: newarray 7
      // 2a: dup
      // 2b: bipush 0
      // 2c: dload 9
      // 2e: dastore
      // 2f: dup
      // 30: bipush 1
      // 31: dload 11
      // 33: dastore
      // 34: goto 3c
      // 37: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a: athrow
      // 3b: aconst_null
      // 3c: areturn
      // 3d: dload 5
      // 3f: dload 1
      // 40: dsub
      // 41: dload 3
      // 42: ddiv
      // 43: dstore 13
      // 45: dload 7
      // 47: dload 1
      // 48: dsub
      // 49: dload 3
      // 4a: ddiv
      // 4b: dstore 15
      // 4d: dload 13
      // 4f: dload 15
      // 51: dcmpl
      // 52: ifle 61
      // 55: dload 13
      // 57: dstore 17
      // 59: dload 15
      // 5b: dstore 13
      // 5d: dload 17
      // 5f: dstore 15
      // 61: dload 9
      // 63: dload 13
      // 65: invokestatic java/lang/Math.max (DD)D
      // 68: dstore 9
      // 6a: dload 11
      // 6c: dload 15
      // 6e: invokestatic java/lang/Math.min (DD)D
      // 71: dstore 11
      // 73: dload 9
      // 75: dload 11
      // 77: dcmpg
      // 78: ifgt 8f
      // 7b: bipush 2
      // 7c: newarray 7
      // 7e: dup
      // 7f: bipush 0
      // 80: dload 9
      // 82: dastore
      // 83: dup
      // 84: bipush 1
      // 85: dload 11
      // 87: dastore
      // 88: goto 90
      // 8b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8e: athrow
      // 8f: aconst_null
      // 90: areturn
   }

   private void IIIIll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 23
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 08: ifnull 23
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 16: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 19: ifnonnull 28
      // 1c: goto 23
      // 1f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: return
      // 24: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 27: athrow
      // 28: aload 1
      // 29: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 2c: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 2f: invokestatic k74/x/IIll.lIIIIlI (Lnet/minecraft/class_304;)V
      // 32: aload 1
      // 33: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 36: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 39: bipush 0
      // 3a: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 3d: return
   }

   private lIIlIIll IIIlII(class_310 var1, lIIIII var2, class_2338 var3, class_2338 var4, float var5, float var6) {
      try {
         if (!this.lIlIIl(var3, var4)) {
            return null;
         }
      } catch (MatchException var8) {
         throw IllIIl(var8);
      }

      try {
         if (!this.IIlIII(var1, var3, var4)) {
            return null;
         }
      } catch (MatchException var10) {
         throw IllIIl(var10);
      }

      float[] var7 = this.lIIIIlI(var1, var2, var3, var4, var5, var6);

      try {
         if (var7 == null) {
            return null;
         }
      } catch (MatchException var9) {
         throw IllIIl(var9);
      }

      return new lIIlIIll(var3.method_10062(), var4.method_10062(), var7[0], var7[1]);
   }

   private boolean IIIlIl(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 43
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 43
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 43
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: iload 2
      // 21: iflt 43
      // 24: goto 2b
      // 27: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2a: athrow
      // 2b: iload 2
      // 2c: ldc_w -1756496859
      // 2f: ldc_w -1076728354
      // 32: ldc_w -298373910
      // 35: ixor
      // 36: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 39: if_icmplt 49
      // 3c: goto 43
      // 3f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 42: athrow
      // 43: bipush 0
      // 44: ireturn
      // 45: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 48: athrow
      // 49: aload 1
      // 4a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4d: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 50: iload 2
      // 51: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 54: astore 3
      // 55: aload 3
      // 56: ifnull 7f
      // 59: aload 3
      // 5a: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 5d: ifne 7f
      // 60: goto 67
      // 63: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 66: athrow
      // 67: aload 3
      // 68: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 6b: astore 5
      // 6d: aload 5
      // 6f: instanceof net/minecraft/class_1747
      // 72: ifeq 7f
      // 75: aload 5
      // 77: checkcast net/minecraft/class_1747
      // 7a: astore 4
      // 7c: goto 81
      // 7f: bipush 0
      // 80: ireturn
      // 81: aload 4
      // 83: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
      // 86: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
      // 89: astore 5
      // 8b: aload 5
      // 8d: ifnull c0
      // 90: aload 5
      // 92: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 95: ifne c0
      // 98: goto 9f
      // 9b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 9e: athrow
      // 9f: aload 5
      // a1: aload 1
      // a2: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // a5: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
      // a8: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // ab: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // ae: ifne c0
      // b1: goto b8
      // b4: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b7: athrow
      // b8: bipush 1
      // b9: goto c1
      // bc: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // bf: athrow
      // c0: bipush 0
      // c1: ireturn
   }

   private boolean IIIllI(class_310 var1, class_3965 var2) {
      return this.lIl(var1, this.Illl, var2);
   }

   private boolean IIIlll(class_310 var1) {
      this.IIIIll(var1);
      return this.lIIIIIl(IIIllIl::lllII);
   }

   private boolean IIlIII(class_310 param1, class_2338 param2, class_2338 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 2
      // 03: invokevirtual k74/x/IIIllIl.llI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 06: ifeq 31
      // 09: aload 0
      // 0a: aload 1
      // 0b: aload 3
      // 0c: invokevirtual k74/x/IIIllIl.Illll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 0f: ifeq 31
      // 12: goto 19
      // 15: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: aload 3
      // 1c: invokevirtual k74/x/IIIllIl.lIIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 1f: ifeq 31
      // 22: goto 29
      // 25: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: bipush 1
      // 2a: goto 32
      // 2d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
   }

   private boolean IIlIIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIl.IlIIl Lk74/x/IIlIlIlll;
      // 04: getstatic k74/x/IIlIlIlll.I Lk74/x/IIlIlIlll;
      // 07: if_acmpeq 30
      // 0a: aload 1
      // 0b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e: getfield net/minecraft/class_746.field_6012 I
      // 11: aload 0
      // 12: getfield k74/x/IIIllIl.IllII I
      // 15: if_icmpgt 25
      // 18: goto 1f
      // 1b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e: athrow
      // 1f: bipush 1
      // 20: ireturn
      // 21: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 24: athrow
      // 25: aload 0
      // 26: invokevirtual k74/x/IIIllIl.IIllI ()V
      // 29: aload 0
      // 2a: invokestatic java/lang/System.currentTimeMillis ()J
      // 2d: putfield k74/x/IIIllIl.III J
      // 30: aload 0
      // 31: getfield k74/x/IIIllIl.IIIIIl Z
      // 34: ifeq 6f
      // 37: aload 1
      // 38: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3b: getfield net/minecraft/class_746.field_6012 I
      // 3e: aload 0
      // 3f: getfield k74/x/IIIllIl.IIllI I
      // 42: if_icmpgt 52
      // 45: goto 4c
      // 48: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4b: athrow
      // 4c: bipush 1
      // 4d: ireturn
      // 4e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 51: athrow
      // 52: aload 0
      // 53: bipush 0
      // 54: putfield k74/x/IIIllIl.IIIIIl Z
      // 57: aload 0
      // 58: ldc_w -1756496838
      // 5b: ldc_w 1928481751
      // 5e: ldc_w 1601198911
      // 61: ixor
      // 62: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 65: putfield k74/x/IIIllIl.IIllI I
      // 68: aload 0
      // 69: invokestatic java/lang/System.currentTimeMillis ()J
      // 6c: putfield k74/x/IIIllIl.III J
      // 6f: bipush 0
      // 70: ireturn
   }

   private void IIlIlI(class_310 param1) {
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
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnonnull 17
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: return
      // 13: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: aload 0
      // 18: getfield k74/x/IIIllIl.lllll Lk74/x/lllIIlII;
      // 1b: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 1e: checkcast java/lang/Boolean
      // 21: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 24: ifne 34
      // 27: aload 1
      // 28: aload 0
      // 29: getstatic k74/x/lllIII.I Lk74/x/lllIII;
      // 2c: invokestatic k74/x/IIll.lllIl (Lnet/minecraft/class_310;Ljava/lang/Object;Lk74/x/lllIII;)V
      // 2f: return
      // 30: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 33: athrow
      // 34: aload 0
      // 35: getfield k74/x/IIIllIl.lIl I
      // 38: iflt 56
      // 3b: aload 0
      // 3c: getfield k74/x/IIIllIl.lIl I
      // 3f: ldc_w -1756496837
      // 42: ldc_w 553885502
      // 45: ldc_w -1327260037
      // 48: ixor
      // 49: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 4c: if_icmplt 63
      // 4f: goto 56
      // 52: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 55: athrow
      // 56: aload 1
      // 57: aload 0
      // 58: getstatic k74/x/lllIII.II Lk74/x/lllIII;
      // 5b: invokestatic k74/x/IIll.lllIl (Lnet/minecraft/class_310;Ljava/lang/Object;Lk74/x/lllIII;)V
      // 5e: return
      // 5f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 62: athrow
      // 63: aload 1
      // 64: aload 0
      // 65: aload 0
      // 66: getfield k74/x/IIIllIl.lIl I
      // 69: invokestatic k74/x/IIll.llIllI (Lnet/minecraft/class_310;Ljava/lang/Object;I)V
      // 6c: return
   }

   private boolean IIlIll(class_310 var1) {
      return k74.x.IIll.IllIIll(var1, this.IIl);
   }

   private void IIllII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 0
      // 03: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 06: invokevirtual k74/x/IIIllIl.lll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 09: ifne 16
      // 0c: aload 0
      // 0d: aload 1
      // 0e: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 11: return
      // 12: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: aload 0
      // 19: getfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 1c: invokevirtual k74/x/IIIllIl.lIIIIII (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 1f: ifne 47
      // 22: invokestatic java/lang/System.currentTimeMillis ()J
      // 25: lstore 2
      // 26: lload 2
      // 27: aload 0
      // 28: getfield k74/x/IIIllIl.IIIllI J
      // 2b: lsub
      // 2c: ldc2_w 2500
      // 2f: lcmp
      // 30: ifgt 41
      // 33: aload 0
      // 34: lload 2
      // 35: ldc2_w 50
      // 38: ladd
      // 39: putfield k74/x/IIIllIl.III J
      // 3c: return
      // 3d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 40: athrow
      // 41: aload 0
      // 42: aload 1
      // 43: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 46: return
      // 47: aload 0
      // 48: getfield k74/x/IIIllIl.IIIIll Lk74/x/lllIIlII;
      // 4b: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 4e: checkcast java/lang/Boolean
      // 51: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 54: ifeq 75
      // 57: aload 0
      // 58: aload 1
      // 59: invokevirtual k74/x/IIIllIl.lIll (Lnet/minecraft/class_310;)Z
      // 5c: ifeq 75
      // 5f: goto 66
      // 62: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 65: athrow
      // 66: aload 0
      // 67: getstatic k74/x/IIlIlIlll.Ill Lk74/x/IIlIlIlll;
      // 6a: aload 1
      // 6b: invokevirtual k74/x/IIIllIl.IIlll (Lk74/x/IIlIlIlll;Lnet/minecraft/class_310;)V
      // 6e: goto 7d
      // 71: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 74: athrow
      // 75: aload 0
      // 76: getstatic k74/x/IIlIlIlll.IlI Lk74/x/IIlIlIlll;
      // 79: aload 1
      // 7a: invokevirtual k74/x/IIIllIl.IIlll (Lk74/x/IIlIlIlll;Lnet/minecraft/class_310;)V
      // 7d: return
   }

   private lIIlIIll IIllIl(class_310 param1, lIIIII param2, class_3965 param3, float param4, float param5) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 3
      // 01: ifnull 15
      // 04: aload 3
      // 05: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 08: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 0b: if_acmpeq 1b
      // 0e: goto 15
      // 11: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: aconst_null
      // 16: areturn
      // 17: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: fload 4
      // 1e: invokevirtual k74/x/IIIllIl.IlIIlI (F)Lnet/minecraft/class_2350;
      // 21: astore 6
      // 23: aload 0
      // 24: aload 3
      // 25: aload 6
      // 27: invokevirtual k74/x/IIIllIl.IIIIIl (Lnet/minecraft/class_3965;Lnet/minecraft/class_2350;)[Lnet/minecraft/class_2338;
      // 2a: astore 7
      // 2c: aload 7
      // 2e: arraylength
      // 2f: istore 8
      // 31: bipush 0
      // 32: istore 9
      // 34: iload 9
      // 36: iload 8
      // 38: if_icmpge 8a
      // 3b: aload 7
      // 3d: iload 9
      // 3f: aaload
      // 40: astore 10
      // 42: aload 0
      // 43: aload 10
      // 45: aload 6
      // 47: invokevirtual k74/x/IIIllIl.IIIII (Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)[Lnet/minecraft/class_2338;
      // 4a: astore 11
      // 4c: aload 11
      // 4e: arraylength
      // 4f: istore 12
      // 51: bipush 0
      // 52: istore 13
      // 54: iload 13
      // 56: iload 12
      // 58: if_icmpge 84
      // 5b: aload 11
      // 5d: iload 13
      // 5f: aaload
      // 60: astore 14
      // 62: aload 0
      // 63: aload 1
      // 64: aload 2
      // 65: aload 14
      // 67: aload 10
      // 69: fload 4
      // 6b: fload 5
      // 6d: invokevirtual k74/x/IIIllIl.IIIlII (Lnet/minecraft/class_310;Lk74/x/lIIIII;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)Lk74/x/lIIlIIll;
      // 70: astore 15
      // 72: aload 15
      // 74: ifnull 7e
      // 77: aload 15
      // 79: areturn
      // 7a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7d: athrow
      // 7e: iinc 13 1
      // 81: goto 54
      // 84: iinc 9 1
      // 87: goto 34
      // 8a: aconst_null
      // 8b: areturn
   }

   private int IIlllI(class_1661 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: iload 2
      // 03: ldc_w -1756496840
      // 06: ldc_w -892518480
      // 09: ldc_w -421068036
      // 0c: ixor
      // 0d: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 10: if_icmpge 32
      // 13: aload 0
      // 14: aload 1
      // 15: iload 2
      // 16: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 19: invokevirtual k74/x/IIIllIl.IlllI (Lnet/minecraft/class_1799;)Z
      // 1c: ifeq 2c
      // 1f: goto 26
      // 22: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 25: athrow
      // 26: iload 2
      // 27: ireturn
      // 28: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2b: athrow
      // 2c: iinc 2 1
      // 2f: goto 02
      // 32: bipush -1
      // 33: ireturn
   }

   private boolean IIllll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 2e
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 2e
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 0
      // 13: getfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 16: ifnull 2e
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 24: ifnonnull 34
      // 27: goto 2e
      // 2a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: bipush 0
      // 2f: ireturn
      // 30: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 33: athrow
      // 34: aload 0
      // 35: aload 1
      // 36: invokevirtual k74/x/IIIllIl.ll (Lnet/minecraft/class_310;)Lnet/minecraft/class_1799;
      // 39: astore 2
      // 3a: aload 0
      // 3b: aload 2
      // 3c: invokevirtual k74/x/IIIllIl.IlllI (Lnet/minecraft/class_1799;)Z
      // 3f: ifne 48
      // 42: bipush 0
      // 43: ireturn
      // 44: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 47: athrow
      // 48: aload 0
      // 49: aload 2
      // 4a: invokevirtual k74/x/IIIllIl.IlIIIl (Lnet/minecraft/class_1799;)Lk74/x/lIIIII;
      // 4d: astore 3
      // 4e: aload 0
      // 4f: aload 1
      // 50: aload 3
      // 51: aload 0
      // 52: getfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 55: aload 0
      // 56: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 59: aload 0
      // 5a: getfield k74/x/IIIllIl.IlIl F
      // 5d: aload 0
      // 5e: getfield k74/x/IIIllIl.lI F
      // 61: invokevirtual k74/x/IIIllIl.lIIIIlI (Lnet/minecraft/class_310;Lk74/x/lIIIII;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)[F
      // 64: astore 4
      // 66: aload 4
      // 68: ifnonnull 71
      // 6b: bipush 0
      // 6c: ireturn
      // 6d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 70: athrow
      // 71: aload 0
      // 72: aload 4
      // 74: bipush 0
      // 75: faload
      // 76: putfield k74/x/IIIllIl.IlIl F
      // 79: aload 0
      // 7a: aload 4
      // 7c: bipush 1
      // 7d: faload
      // 7e: putfield k74/x/IIIllIl.lI F
      // 81: aload 0
      // 82: aload 1
      // 83: aload 3
      // 84: aload 0
      // 85: getfield k74/x/IIIllIl.lll Lnet/minecraft/class_2338;
      // 88: aload 0
      // 89: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 8c: aload 0
      // 8d: getfield k74/x/IIIllIl.IlIl F
      // 90: aload 0
      // 91: getfield k74/x/IIIllIl.lI F
      // 94: invokevirtual k74/x/IIIllIl.lIIIlI (Lnet/minecraft/class_310;Lk74/x/lIIIII;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)Z
      // 97: ireturn
   }

   private boolean IlIIII(class_310 var1, class_3965 var2) {
      this.IIIIll(var1);
      return this.lIIIIIl(IIIllIl::lIIIIl);
   }

   private lIIIII IlIIIl(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 0c
      // 04: aconst_null
      // 05: goto 16
      // 08: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b: athrow
      // 0c: aload 1
      // 0d: getstatic net/minecraft/class_9334.field_49649 Lnet/minecraft/class_9331;
      // 10: invokevirtual net/minecraft/class_1799.method_58694 (Lnet/minecraft/class_9331;)Ljava/lang/Object;
      // 13: checkcast net/minecraft/class_9278
      // 16: astore 2
      // 17: aload 2
      // 18: ifnull 34
      // 1b: aload 2
      // 1c: getstatic net/minecraft/class_1802.field_8639 Lnet/minecraft/class_1792;
      // 1f: invokevirtual net/minecraft/class_9278.method_57438 (Lnet/minecraft/class_1792;)Z
      // 22: ifeq 34
      // 25: goto 2c
      // 28: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: goto 35
      // 30: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 33: athrow
      // 34: bipush 0
      // 35: istore 3
      // 36: iload 3
      // 37: ifeq 4f
      // 3a: new k74/x/lIIIII
      // 3d: dup
      // 3e: ldc2_w 1.6
      // 41: ldc2_w 0.99
      // 44: dconst_0
      // 45: invokespecial k74/x/lIIIII.<init> (DDD)V
      // 48: goto 5f
      // 4b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4e: athrow
      // 4f: new k74/x/lIIIII
      // 52: dup
      // 53: ldc2_w 3.15
      // 56: ldc2_w 0.99
      // 59: ldc2_w 0.05
      // 5c: invokespecial k74/x/lIIIII.<init> (DDD)V
      // 5f: areturn
   }

   private class_2350 IlIIlI(float var1) {
      return class_2350.method_10150(var1);
   }

   private lIIlIIll IlIIll(class_310 param1, class_1799 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ifnull 020
      // 004: aload 1
      // 005: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 008: ifnull 020
      // 00b: goto 012
      // 00e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 011: athrow
      // 012: aload 1
      // 013: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 016: ifnonnull 026
      // 019: goto 020
      // 01c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 01f: athrow
      // 020: aconst_null
      // 021: areturn
      // 022: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 025: athrow
      // 026: aload 0
      // 027: aload 2
      // 028: invokevirtual k74/x/IIIllIl.IlIIIl (Lnet/minecraft/class_1799;)Lk74/x/lIIIII;
      // 02b: astore 3
      // 02c: aload 1
      // 02d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 030: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 033: fstore 4
      // 035: aload 1
      // 036: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 039: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 03c: fstore 5
      // 03e: aload 0
      // 03f: aload 1
      // 040: aload 3
      // 041: fload 4
      // 043: fload 5
      // 045: invokevirtual k74/x/IIIllIl.IIIll (Lnet/minecraft/class_310;Lk74/x/lIIIII;FF)Lk74/x/lIIlIIll;
      // 048: astore 6
      // 04a: aload 6
      // 04c: ifnull 056
      // 04f: aload 6
      // 051: areturn
      // 052: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 055: athrow
      // 056: aload 1
      // 057: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 05a: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 05d: astore 7
      // 05f: aload 0
      // 060: fload 4
      // 062: fload 5
      // 064: invokevirtual k74/x/IIIllIl.IllllI (FF)Lnet/minecraft/class_243;
      // 067: aload 3
      // 068: invokevirtual k74/x/lIIIII.l ()D
      // 06b: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 06e: aload 1
      // 06f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 072: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
      // 075: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 078: astore 8
      // 07a: aconst_null
      // 07b: astore 9
      // 07d: bipush 0
      // 07e: istore 10
      // 080: iload 10
      // 082: ldc_w -1756496839
      // 085: ldc_w 321596398
      // 088: ldc_w 1274398065
      // 08b: ixor
      // 08c: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 08f: if_icmpge 165
      // 092: aload 7
      // 094: aload 8
      // 096: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 099: astore 11
      // 09b: aload 0
      // 09c: aload 1
      // 09d: aload 7
      // 09f: aload 11
      // 0a1: invokevirtual k74/x/IIIllIl.Illl (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_3965;
      // 0a4: astore 12
      // 0a6: bipush 1
      // 0a7: istore 13
      // 0a9: iload 13
      // 0ab: ldc_w -1756496834
      // 0ae: ldc_w 321596398
      // 0b1: ldc_w 814023439
      // 0b4: ixor
      // 0b5: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 0b8: if_icmpgt 112
      // 0bb: iload 13
      // 0bd: i2d
      // 0be: ldc2_w 10.0
      // 0c1: ddiv
      // 0c2: dstore 14
      // 0c4: aload 7
      // 0c6: aload 11
      // 0c8: dload 14
      // 0ca: invokevirtual net/minecraft/class_243.method_35590 (Lnet/minecraft/class_243;D)Lnet/minecraft/class_243;
      // 0cd: astore 16
      // 0cf: aload 16
      // 0d1: invokestatic net/minecraft/class_2338.method_49638 (Lnet/minecraft/class_2374;)Lnet/minecraft/class_2338;
      // 0d4: astore 17
      // 0d6: aload 9
      // 0d8: ifnull 108
      // 0db: aload 9
      // 0dd: aload 17
      // 0df: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 0e2: ifne 108
      // 0e5: goto 0ec
      // 0e8: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0eb: athrow
      // 0ec: aload 0
      // 0ed: aload 1
      // 0ee: aload 3
      // 0ef: aload 9
      // 0f1: aload 17
      // 0f3: fload 4
      // 0f5: fload 5
      // 0f7: invokevirtual k74/x/IIIllIl.IIIlII (Lnet/minecraft/class_310;Lk74/x/lIIIII;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)Lk74/x/lIIlIIll;
      // 0fa: astore 18
      // 0fc: aload 18
      // 0fe: ifnull 108
      // 101: aload 18
      // 103: areturn
      // 104: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 107: athrow
      // 108: aload 17
      // 10a: astore 9
      // 10c: iinc 13 1
      // 10f: goto 0a9
      // 112: aload 0
      // 113: aload 12
      // 115: invokevirtual k74/x/IIIllIl.IlIllI (Lnet/minecraft/class_3965;)Z
      // 118: ifeq 12c
      // 11b: aload 0
      // 11c: aload 1
      // 11d: aload 3
      // 11e: aload 12
      // 120: fload 4
      // 122: fload 5
      // 124: invokevirtual k74/x/IIIllIl.IIllIl (Lnet/minecraft/class_310;Lk74/x/lIIIII;Lnet/minecraft/class_3965;FF)Lk74/x/lIIlIIll;
      // 127: astore 13
      // 129: aload 13
      // 12b: areturn
      // 12c: aload 11
      // 12e: astore 7
      // 130: aload 8
      // 132: aload 3
      // 133: invokevirtual k74/x/lIIIII.I ()D
      // 136: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 139: dconst_0
      // 13a: aload 3
      // 13b: invokevirtual k74/x/lIIIII.II ()D
      // 13e: dconst_0
      // 13f: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
      // 142: astore 8
      // 144: aload 7
      // 146: getfield net/minecraft/class_243.field_1351 D
      // 149: aload 1
      // 14a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 14d: invokevirtual net/minecraft/class_638.method_31607 ()I
      // 150: i2d
      // 151: ldc2_w 20.0
      // 154: dsub
      // 155: dcmpg
      // 156: ifge 15f
      // 159: aconst_null
      // 15a: areturn
      // 15b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15e: athrow
      // 15f: iinc 10 1
      // 162: goto 080
      // 165: aconst_null
      // 166: areturn
   }

   private class_243 IlIlII(class_2338 var1) {
      return this.IIIlI(var1).method_1023(0.0, 0.0625, 0.0);
   }

   private int IlIlIl(class_310 param1) {
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
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: bipush -1
      // 13: ireturn
      // 14: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield k74/x/IIIllIl.lIll Lk74/x/IIlIII;
      // 1c: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 1f: checkcast java/lang/Double
      // 22: invokevirtual java/lang/Double.doubleValue ()D
      // 25: invokestatic java/lang/Math.round (D)J
      // 28: l2i
      // 29: bipush 1
      // 2a: isub
      // 2b: istore 2
      // 2c: aload 0
      // 2d: aload 1
      // 2e: iload 2
      // 2f: invokevirtual k74/x/IIIllIl.IIIlIl (Lnet/minecraft/class_310;I)Z
      // 32: ifeq 3d
      // 35: iload 2
      // 36: goto 3e
      // 39: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3c: athrow
      // 3d: bipush -1
      // 3e: ireturn
   }

   @Override
   public void IllIll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: invokevirtual k74/x/IIIllIl.lIIlII (Lnet/minecraft/class_310;)Z
      // 005: ifne 015
      // 008: aload 0
      // 009: invokevirtual k74/x/IIIllIl.lIII ()V
      // 00c: aload 0
      // 00d: invokevirtual k74/x/IIIllIl.lIIIII ()V
      // 010: return
      // 011: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 014: athrow
      // 015: aload 0
      // 016: getfield k74/x/IIIllIl.lIlI Lk74/x/IIlIlIlll;
      // 019: getstatic k74/x/IIlIlIlll.I Lk74/x/IIlIlIlll;
      // 01c: if_acmpne 0a3
      // 01f: aload 0
      // 020: invokevirtual k74/x/IIIllIl.IIllIII ()Z
      // 023: ifeq 081
      // 026: goto 02d
      // 029: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02c: athrow
      // 02d: aload 1
      // 02e: aload 0
      // 02f: invokevirtual k74/x/IIIllIl.IlIIlII ()Lnet/minecraft/class_3675$class_306;
      // 032: invokestatic k74/x/IIll.IIIllll (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 035: istore 2
      // 036: iload 2
      // 037: ifeq 050
      // 03a: aload 0
      // 03b: getfield k74/x/IIIllIl.IlIlI Z
      // 03e: ifne 050
      // 041: goto 048
      // 044: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 047: athrow
      // 048: bipush 1
      // 049: goto 051
      // 04c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 04f: athrow
      // 050: bipush 0
      // 051: istore 3
      // 052: aload 0
      // 053: iload 2
      // 054: putfield k74/x/IIIllIl.IlIlI Z
      // 057: iload 2
      // 058: ifne 067
      // 05b: aload 0
      // 05c: bipush 0
      // 05d: putfield k74/x/IIIllIl.lIII Z
      // 060: goto 067
      // 063: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 066: athrow
      // 067: iload 3
      // 068: ifeq 079
      // 06b: aload 0
      // 06c: getfield k74/x/IIIllIl.lIII Z
      // 06f: ifeq 07e
      // 072: goto 079
      // 075: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 078: athrow
      // 079: return
      // 07a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 07d: athrow
      // 07e: goto 08d
      // 081: aload 0
      // 082: getfield k74/x/IIIllIl.lIII Z
      // 085: ifeq 08d
      // 088: return
      // 089: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 08c: athrow
      // 08d: aload 0
      // 08e: bipush 1
      // 08f: putfield k74/x/IIIllIl.lIII Z
      // 092: aload 0
      // 093: aload 1
      // 094: invokevirtual k74/x/IIIllIl.I (Lnet/minecraft/class_310;)Z
      // 097: ifne 0a3
      // 09a: aload 0
      // 09b: invokevirtual k74/x/IIIllIl.lIIIII ()V
      // 09e: return
      // 09f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a2: athrow
      // 0a3: bipush 0
      // 0a4: istore 2
      // 0a5: iload 2
      // 0a6: ldc_w -1756496833
      // 0a9: ldc_w 1205125405
      // 0ac: ldc_w 1693287373
      // 0af: ixor
      // 0b0: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 0b3: if_icmpge 1a4
      // 0b6: invokestatic java/lang/System.currentTimeMillis ()J
      // 0b9: lstore 3
      // 0ba: lload 3
      // 0bb: aload 0
      // 0bc: getfield k74/x/IIIllIl.IIIllI J
      // 0bf: lsub
      // 0c0: ldc2_w 3000
      // 0c3: lcmp
      // 0c4: ifle 0d1
      // 0c7: aload 0
      // 0c8: aload 1
      // 0c9: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 0cc: return
      // 0cd: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d0: athrow
      // 0d1: aload 0
      // 0d2: aload 1
      // 0d3: invokevirtual k74/x/IIIllIl.IIlIIl (Lnet/minecraft/class_310;)Z
      // 0d6: ifne 0e9
      // 0d9: lload 3
      // 0da: aload 0
      // 0db: getfield k74/x/IIIllIl.III J
      // 0de: lcmp
      // 0df: ifge 0ee
      // 0e2: goto 0e9
      // 0e5: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e8: athrow
      // 0e9: return
      // 0ea: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ed: athrow
      // 0ee: aload 0
      // 0ef: getfield k74/x/IIIllIl.lIlI Lk74/x/IIlIlIlll;
      // 0f2: astore 5
      // 0f4: aload 5
      // 0f6: invokevirtual k74/x/IIlIlIlll.ordinal ()I
      // 0f9: tableswitch 134 0 8 134 71 79 87 51 63 95 103 111
      // 12c: aload 0
      // 12d: aload 1
      // 12e: invokevirtual k74/x/IIIllIl.lIIlI (Lnet/minecraft/class_310;)V
      // 131: goto 17f
      // 134: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 137: athrow
      // 138: aload 0
      // 139: aload 1
      // 13a: invokevirtual k74/x/IIIllIl.IIllII (Lnet/minecraft/class_310;)V
      // 13d: goto 17f
      // 140: aload 0
      // 141: aload 1
      // 142: invokevirtual k74/x/IIIllIl.llIlll (Lnet/minecraft/class_310;)V
      // 145: goto 17f
      // 148: aload 0
      // 149: aload 1
      // 14a: invokevirtual k74/x/IIIllIl.llIlIl (Lnet/minecraft/class_310;)V
      // 14d: goto 17f
      // 150: aload 0
      // 151: aload 1
      // 152: invokevirtual k74/x/IIIllIl.lIllII (Lnet/minecraft/class_310;)V
      // 155: goto 17f
      // 158: aload 0
      // 159: aload 1
      // 15a: invokevirtual k74/x/IIIllIl.llII (Lnet/minecraft/class_310;)V
      // 15d: goto 17f
      // 160: aload 0
      // 161: aload 1
      // 162: invokevirtual k74/x/IIIllIl.lIlIl (Lnet/minecraft/class_310;)V
      // 165: goto 17f
      // 168: aload 0
      // 169: aload 1
      // 16a: invokevirtual k74/x/IIIllIl.Il (Lnet/minecraft/class_310;)Z
      // 16d: ifeq 17f
      // 170: aload 0
      // 171: invokevirtual k74/x/IIIllIl.lIII ()V
      // 174: aload 0
      // 175: invokevirtual k74/x/IIIllIl.lIIIII ()V
      // 178: goto 17f
      // 17b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17e: athrow
      // 17f: aload 0
      // 180: getfield k74/x/IIIllIl.lIlI Lk74/x/IIlIlIlll;
      // 183: aload 5
      // 185: if_acmpeq 199
      // 188: aload 0
      // 189: getfield k74/x/IIIllIl.lIlI Lk74/x/IIlIlIlll;
      // 18c: getstatic k74/x/IIlIlIlll.I Lk74/x/IIlIlIlll;
      // 18f: if_acmpne 19e
      // 192: goto 199
      // 195: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 198: athrow
      // 199: return
      // 19a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 19d: athrow
      // 19e: iinc 2 1
      // 1a1: goto 0a5
      // 1a4: return
   }

   private static int lIIIlII(int var0, int var1) {
      int var2 = IIlIIl[var0 ^ -1756496854] ^ var1 ^ var0;
      var2 ^= 53304;
      var2 -= 14141;
      var2 ^= 17709;
      var2 ^= 53834;
      var2 ^= 27943;
      var2 ^= 23967;
      var2 ^= 5418;
      var2 -= 42900;
      var2 += 65012;
      return var2 + 8143;
   }

   private boolean IlIllI(class_3965 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1d
      // 04: aload 1
      // 05: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 08: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 0b: if_acmpne 1d
      // 0e: goto 15
      // 11: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: bipush 1
      // 16: goto 1e
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
   }

   @Override
   public void llIl() {
      this.IIlIlI(class_310.method_1551());
      this.lIII = false;
      this.IlIlI = false;
      this.lIII();
      this.I.lIIl();
   }

   private IlIlIIIIl IlIlll(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: aload 2
      // 003: invokevirtual k74/x/IIIllIl.IIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 006: ifeq 028
      // 009: aload 1
      // 00a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 00d: aconst_null
      // 00e: new net/minecraft/class_238
      // 011: dup
      // 012: aload 2
      // 013: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 016: invokevirtual net/minecraft/class_638.method_8335 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;)Ljava/util/List;
      // 019: invokeinterface java/util/List.isEmpty ()Z 1
      // 01e: ifne 02e
      // 021: goto 028
      // 024: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 027: athrow
      // 028: aconst_null
      // 029: areturn
      // 02a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02d: athrow
      // 02e: ldc_w -1756496894
      // 031: ldc_w -913918497
      // 034: ldc_w 832297831
      // 037: ixor
      // 038: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 03b: anewarray 488
      // 03e: dup
      // 03f: bipush 0
      // 040: getstatic net/minecraft/class_2350.field_11033 Lnet/minecraft/class_2350;
      // 043: aastore
      // 044: dup
      // 045: bipush 1
      // 046: getstatic net/minecraft/class_2350.field_11043 Lnet/minecraft/class_2350;
      // 049: aastore
      // 04a: dup
      // 04b: bipush 2
      // 04c: getstatic net/minecraft/class_2350.field_11035 Lnet/minecraft/class_2350;
      // 04f: aastore
      // 050: dup
      // 051: bipush 3
      // 052: getstatic net/minecraft/class_2350.field_11039 Lnet/minecraft/class_2350;
      // 055: aastore
      // 056: dup
      // 057: bipush 4
      // 058: getstatic net/minecraft/class_2350.field_11034 Lnet/minecraft/class_2350;
      // 05b: aastore
      // 05c: dup
      // 05d: bipush 5
      // 05e: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 061: aastore
      // 062: astore 3
      // 063: aload 3
      // 064: astore 4
      // 066: aload 4
      // 068: arraylength
      // 069: istore 5
      // 06b: bipush 0
      // 06c: istore 6
      // 06e: iload 6
      // 070: iload 5
      // 072: if_icmpge 114
      // 075: aload 4
      // 077: iload 6
      // 079: aaload
      // 07a: astore 7
      // 07c: aload 2
      // 07d: aload 7
      // 07f: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 082: astore 8
      // 084: aload 1
      // 085: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 088: aload 8
      // 08a: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 08d: astore 9
      // 08f: aload 9
      // 091: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 094: ifne 10e
      // 097: aload 9
      // 099: aload 1
      // 09a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 09d: aload 8
      // 09f: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 0a2: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 0a5: ifeq 0b6
      // 0a8: goto 0af
      // 0ab: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ae: athrow
      // 0af: goto 10e
      // 0b2: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b5: athrow
      // 0b6: aload 7
      // 0b8: invokevirtual net/minecraft/class_2350.method_10153 ()Lnet/minecraft/class_2350;
      // 0bb: astore 10
      // 0bd: aload 8
      // 0bf: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 0c2: aload 10
      // 0c4: invokevirtual net/minecraft/class_2350.method_62675 ()Lnet/minecraft/class_2382;
      // 0c7: invokestatic net/minecraft/class_243.method_24954 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 0ca: ldc2_w 0.5
      // 0cd: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 0d0: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 0d3: astore 11
      // 0d5: aload 1
      // 0d6: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0d9: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 0dc: aload 11
      // 0de: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 0e1: ldc2_w 20.25
      // 0e4: dcmpl
      // 0e5: ifle 0ef
      // 0e8: goto 10e
      // 0eb: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ee: athrow
      // 0ef: new k74/x/IlIlIIIIl
      // 0f2: dup
      // 0f3: aload 2
      // 0f4: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 0f7: aload 11
      // 0f9: new net/minecraft/class_3965
      // 0fc: dup
      // 0fd: aload 11
      // 0ff: aload 10
      // 101: aload 8
      // 103: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 106: bipush 0
      // 107: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
      // 10a: invokespecial k74/x/IlIlIIIIl.<init> (Lnet/minecraft/class_2338;Lnet/minecraft/class_243;Lnet/minecraft/class_3965;)V
      // 10d: areturn
      // 10e: iinc 6 1
      // 111: goto 06e
      // 114: aconst_null
      // 115: areturn
   }

   private boolean IllIII(class_310 var1, int var2, class_3965 var3) {
      return this.lIl(var1, var2, var3);
   }

   private static MatchException IllIIl(MatchException var0) {
      return var0;
   }

   private class_243 IllllI(float var1, float var2) {
      double var3 = Math.toRadians(var1);
      double var5 = Math.toRadians(var2);
      double var7 = Math.cos(var5);
      return new class_243(-Math.sin(var3) * var7, -Math.sin(var5), Math.cos(var3) * var7).method_1029();
   }

   private int Illlll(class_1661 param1, class_1792 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: iload 3
      // 03: ldc_w -1756496893
      // 06: ldc_w 167525817
      // 09: ldc_w -920955155
      // 0c: ixor
      // 0d: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 10: if_icmpge 32
      // 13: aload 1
      // 14: iload 3
      // 15: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 18: aload 2
      // 19: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 1c: ifeq 2c
      // 1f: goto 26
      // 22: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 25: athrow
      // 26: iload 3
      // 27: ireturn
      // 28: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2b: athrow
      // 2c: iinc 3 1
      // 2f: goto 02
      // 32: bipush -1
      // 33: ireturn
   }

   private void lIIIII() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: bipush 0
      // 02: putfield k74/x/IIIllIl.lIII Z
      // 05: aload 0
      // 06: invokevirtual k74/x/IIIllIl.IIllIII ()Z
      // 09: ifne 26
      // 0c: aload 0
      // 0d: invokevirtual k74/x/IIIllIl.IIIIlIl ()Z
      // 10: ifeq 26
      // 13: goto 1a
      // 16: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 19: athrow
      // 1a: aload 0
      // 1b: bipush 0
      // 1c: invokevirtual k74/x/IIIllIl.IlIllIl (Z)V
      // 1f: goto 26
      // 22: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 25: athrow
      // 26: return
   }

   private static boolean lIIIIl(class_310 var0, class_3965 var1) {
      return k74.x.IIll.IlIIII(var0, var1);
   }

   private boolean lIIIlI(class_310 var1, lIIIII var2, class_2338 var3, class_2338 var4, float var5, float var6) {
      try {
         if (!Double.isNaN(this.llIIll(var1, var2, var3, var4, var5, var6))) {
            return true;
         }
      } catch (MatchException var7) {
         throw IllIIl(var7);
      }

      return false;
   }

   private boolean lIIIll(class_310 var1) {
      k74.x.IIll.IIIIIll(var1, this.IlIl, this.lI);
      return this.lIlI(var1);
   }

   private boolean lIIlII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 44
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 44
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 44
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 24: ifnull 44
      // 27: goto 2e
      // 2a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: aload 1
      // 2f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 32: ifnull 44
      // 35: goto 3c
      // 38: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3b: athrow
      // 3c: bipush 1
      // 3d: goto 45
      // 40: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 43: athrow
      // 44: bipush 0
      // 45: ireturn
   }

   private long lIIlIl(IIlIlIlll var1) {
      return 50L;
   }

   @Override
   public void IlllII(JsonObject var1) {
      super.IlllII(var1);
      this.IIIIIIl(var1, llllI.llIl());
      this.IIIlIIl(var1, IIIlll.llIl(), new lIlllIl[]{this.IlI});
      this.IIIlIIl(
         var1, IlIIllIII.lI(IlllIlI(lIIIlII(-1756496896, 1780567462 ^ 1383818885), lIIIlII(-1756496895, 1780567462 ^ 330128262))), new lIlllIl[]{this.IlI}
      );
   }

   private boolean lIIllI(class_310 var1) {
      return this.III(var1);
   }

   private static boolean lIIlll(class_1297 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: instanceof net/minecraft/class_1701
      // 04: ifeq 1d
      // 07: aload 0
      // 08: invokevirtual net/minecraft/class_1297.method_31481 ()Z
      // 0b: ifne 1d
      // 0e: goto 15
      // 11: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: bipush 1
      // 16: goto 1e
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
   }

   private boolean lIlIII(class_3965 var1) {
      return this.IlIllI(var1);
   }

   private boolean lIlIIl(class_2338 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 21
      // 04: aload 2
      // 05: ifnull 21
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: aload 1
      // 10: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 13: aload 2
      // 14: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 17: if_icmpeq 27
      // 1a: goto 21
      // 1d: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 20: athrow
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: aload 1
      // 28: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 2b: aload 2
      // 2c: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 2f: isub
      // 30: invokestatic java/lang/Math.abs (I)I
      // 33: istore 3
      // 34: aload 1
      // 35: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 38: aload 2
      // 39: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 3c: isub
      // 3d: invokestatic java/lang/Math.abs (I)I
      // 40: istore 4
      // 42: iload 3
      // 43: iload 4
      // 45: iadd
      // 46: bipush 1
      // 47: if_icmpne 52
      // 4a: bipush 1
      // 4b: goto 53
      // 4e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
   }

   private boolean lIlIlI(class_310 param1) {
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
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 0
      // 19: getfield k74/x/IIIllIl.IIl Lnet/minecraft/class_1268;
      // 1c: getstatic net/minecraft/class_1268.field_5810 Lnet/minecraft/class_1268;
      // 1f: if_acmpne 32
      // 22: aload 0
      // 23: aload 1
      // 24: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 27: invokevirtual net/minecraft/class_746.method_6079 ()Lnet/minecraft/class_1799;
      // 2a: invokevirtual k74/x/IIIllIl.IlllI (Lnet/minecraft/class_1799;)Z
      // 2d: ireturn
      // 2e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 31: athrow
      // 32: aload 0
      // 33: aload 1
      // 34: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 37: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 3a: aload 0
      // 3b: getfield k74/x/IIIllIl.Ill I
      // 3e: invokevirtual k74/x/IIIllIl.IllllIl (Lnet/minecraft/class_1661;I)Z
      // 41: ireturn
   }

   private boolean lIlIll(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 4b
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: ifnull 4b
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 2
      // 13: ifnull 4b
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aload 1
      // 1f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 22: aload 2
      // 23: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 26: invokevirtual k74/x/IIIllIl.llIIlI (Lnet/minecraft/class_2680;)Z
      // 29: ifeq 4b
      // 2c: goto 33
      // 2f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 32: athrow
      // 33: aload 0
      // 34: aload 1
      // 35: aload 2
      // 36: invokevirtual k74/x/IIIllIl.lIIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 39: ifeq 4b
      // 3c: goto 43
      // 3f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 42: athrow
      // 43: bipush 1
      // 44: goto 4c
      // 47: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
   }

   @Override
   public void IlIII() {
      this.lIII = false;
      this.IlIlI = false;
      this.lIII();
      this.I.IIIIIII();
   }

   @Override
   public boolean llllIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIl.lIII Z
      // 04: ifne 40
      // 07: aload 0
      // 08: getfield k74/x/IIIllIl.IlIlI Z
      // 0b: ifne 40
      // 0e: goto 15
      // 11: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: aload 0
      // 16: invokevirtual k74/x/IIIllIl.IIllIII ()Z
      // 19: ifeq 48
      // 1c: goto 23
      // 1f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: aload 1
      // 24: ifnull 48
      // 27: goto 2e
      // 2a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: aload 1
      // 2f: aload 0
      // 30: invokevirtual k74/x/IIIllIl.IlIIlII ()Lnet/minecraft/class_3675$class_306;
      // 33: invokestatic k74/x/IIll.IIIllll (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 36: ifeq 48
      // 39: goto 40
      // 3c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3f: athrow
      // 40: bipush 1
      // 41: goto 49
      // 44: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 47: athrow
      // 48: bipush 0
      // 49: ireturn
   }

   private void lIllII(class_310 var1) {
      try {
         if (!this.llIIlI(var1.field_1687.method_8320(this.IIII))) {
            this.lIIl(var1);
            return;
         }
      } catch (MatchException var6) {
         throw IllIIl(var6);
      }

      int var2 = this.lllIl(var1, this.IIII);

      try {
         if (var2 < this.lIlII) {
            this.III = System.currentTimeMillis() + 50L;
            return;
         }
      } catch (MatchException var4) {
         throw IllIIl(var4);
      }

      if (this.lIlII < this.IIIIII) {
         int var3 = this.Illlll(var1.field_1724.method_31548(), class_1802.field_8069);

         try {
            if (var3 < 0) {
               this.IIlll(IIlIlIlll.l, var1);
               return;
            }
         } catch (MatchException var5) {
            throw IllIIl(var5);
         }

         this.llIIl = var3;
         this.IIlll(IIlIlIlll.Il, var1);
      } else {
         this.IIlll(IIlIlIlll.l, var1);
      }
   }

   private long lIllIl(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();

      try {
         if (var2 >= var4) {
            return Math.max(0L, Math.round(var2));
         }
      } catch (MatchException var6) {
         throw IllIIl(var6);
      }

      return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   boolean lIlllI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIl.lIII Z
      // 04: ifeq 20
      // 07: aload 0
      // 08: getfield k74/x/IIIllIl.lIlI Lk74/x/IIlIlIlll;
      // 0b: getstatic k74/x/IIlIlIlll.I Lk74/x/IIlIlIlll;
      // 0e: if_acmpeq 20
      // 11: goto 18
      // 14: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: bipush 1
      // 19: goto 21
      // 1c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
   }

   private boolean llIIlI(class_2680 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 50
      // 04: aload 1
      // 05: getstatic net/minecraft/class_2246.field_10167 Lnet/minecraft/class_2248;
      // 08: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0b: ifne 48
      // 0e: goto 15
      // 11: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: aload 1
      // 16: getstatic net/minecraft/class_2246.field_10425 Lnet/minecraft/class_2248;
      // 19: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 1c: ifne 48
      // 1f: goto 26
      // 22: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 25: athrow
      // 26: aload 1
      // 27: getstatic net/minecraft/class_2246.field_10025 Lnet/minecraft/class_2248;
      // 2a: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 2d: ifne 48
      // 30: goto 37
      // 33: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 36: athrow
      // 37: aload 1
      // 38: getstatic net/minecraft/class_2246.field_10546 Lnet/minecraft/class_2248;
      // 3b: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 3e: ifeq 50
      // 41: goto 48
      // 44: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 47: athrow
      // 48: bipush 1
      // 49: goto 51
      // 4c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4f: athrow
      // 50: bipush 0
      // 51: ireturn
   }

   private double llIIll(class_310 param1, lIIIII param2, class_2338 param3, class_2338 param4, float param5, float param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ifnull 042
      // 004: aload 1
      // 005: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 008: ifnull 042
      // 00b: goto 012
      // 00e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 011: athrow
      // 012: aload 1
      // 013: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 016: ifnull 042
      // 019: goto 020
      // 01c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 01f: athrow
      // 020: aload 2
      // 021: ifnull 042
      // 024: goto 02b
      // 027: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02a: athrow
      // 02b: aload 3
      // 02c: ifnull 042
      // 02f: goto 036
      // 032: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 035: athrow
      // 036: aload 4
      // 038: ifnonnull 04a
      // 03b: goto 042
      // 03e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 041: athrow
      // 042: ldc2_w NaN
      // 045: dreturn
      // 046: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 049: athrow
      // 04a: aload 1
      // 04b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 04e: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 051: astore 7
      // 053: aload 0
      // 054: fload 5
      // 056: fload 6
      // 058: invokevirtual k74/x/IIIllIl.IllllI (FF)Lnet/minecraft/class_243;
      // 05b: aload 2
      // 05c: invokevirtual k74/x/lIIIII.l ()D
      // 05f: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 062: aload 1
      // 063: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 066: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
      // 069: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 06c: astore 8
      // 06e: bipush 0
      // 06f: istore 9
      // 071: aload 0
      // 072: aload 4
      // 074: invokevirtual k74/x/IIIllIl.lllI (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 077: astore 10
      // 079: bipush 0
      // 07a: istore 11
      // 07c: iload 11
      // 07e: ldc_w -1756496890
      // 081: ldc_w 1918202639
      // 084: ldc_w -1470306965
      // 087: ixor
      // 088: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 08b: if_icmpge 1cb
      // 08e: aload 7
      // 090: aload 8
      // 092: invokevirtual net/minecraft/class_243.method_1019 (Lnet/minecraft/class_243;)Lnet/minecraft/class_243;
      // 095: astore 12
      // 097: aload 0
      // 098: aload 1
      // 099: aload 7
      // 09b: aload 12
      // 09d: invokevirtual k74/x/IIIllIl.Illl (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_3965;
      // 0a0: astore 13
      // 0a2: aload 0
      // 0a3: aload 7
      // 0a5: aload 12
      // 0a7: aload 3
      // 0a8: ldc2_w 0.08
      // 0ab: dconst_0
      // 0ac: dconst_1
      // 0ad: invokevirtual k74/x/IIIllIl.l (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;DDD)D
      // 0b0: dstore 14
      // 0b2: aload 0
      // 0b3: aload 7
      // 0b5: aload 12
      // 0b7: aload 4
      // 0b9: ldc2_w 0.08
      // 0bc: ldc2_w 0.22
      // 0bf: ldc2_w 0.58
      // 0c2: invokevirtual k74/x/IIIllIl.l (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;DDD)D
      // 0c5: dstore 16
      // 0c7: aload 0
      // 0c8: getfield k74/x/IIIllIl.IIlIl Lnet/minecraft/class_2338;
      // 0cb: ifnonnull 0d8
      // 0ce: ldc2_w NaN
      // 0d1: goto 0e9
      // 0d4: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d7: athrow
      // 0d8: aload 0
      // 0d9: aload 7
      // 0db: aload 12
      // 0dd: aload 0
      // 0de: getfield k74/x/IIIllIl.IIlIl Lnet/minecraft/class_2338;
      // 0e1: ldc2_w 0.2
      // 0e4: dconst_0
      // 0e5: dconst_1
      // 0e6: invokevirtual k74/x/IIIllIl.l (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;DDD)D
      // 0e9: dstore 18
      // 0eb: dload 16
      // 0ed: invokestatic java/lang/Double.isNaN (D)Z
      // 0f0: ifne 165
      // 0f3: aload 0
      // 0f4: aload 13
      // 0f6: aload 7
      // 0f8: aload 12
      // 0fa: dload 16
      // 0fc: invokevirtual k74/x/IIIllIl.lIIll (Lnet/minecraft/class_3965;Lnet/minecraft/class_243;Lnet/minecraft/class_243;D)Z
      // 0ff: ifne 127
      // 102: goto 109
      // 105: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 108: athrow
      // 109: dload 18
      // 10b: invokestatic java/lang/Double.isNaN (D)Z
      // 10e: ifne 12f
      // 111: goto 118
      // 114: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 117: athrow
      // 118: dload 18
      // 11a: dload 16
      // 11c: dcmpg
      // 11d: ifgt 12f
      // 120: goto 127
      // 123: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 126: athrow
      // 127: ldc2_w NaN
      // 12a: dreturn
      // 12b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 12e: athrow
      // 12f: iload 9
      // 131: ifne 15a
      // 134: dload 14
      // 136: invokestatic java/lang/Double.isNaN (D)Z
      // 139: ifne 152
      // 13c: goto 143
      // 13f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 142: athrow
      // 143: dload 14
      // 145: dload 16
      // 147: dcmpl
      // 148: ifle 15a
      // 14b: goto 152
      // 14e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 151: athrow
      // 152: ldc2_w NaN
      // 155: dreturn
      // 156: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 159: athrow
      // 15a: aload 0
      // 15b: aload 7
      // 15d: aload 12
      // 15f: aload 10
      // 161: invokevirtual k74/x/IIIllIl.IIII (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)D
      // 164: dreturn
      // 165: dload 14
      // 167: invokestatic java/lang/Double.isNaN (D)Z
      // 16a: ifne 170
      // 16d: bipush 1
      // 16e: istore 9
      // 170: dload 18
      // 172: invokestatic java/lang/Double.isNaN (D)Z
      // 175: ifeq 188
      // 178: aload 0
      // 179: aload 13
      // 17b: invokevirtual k74/x/IIIllIl.lIlIII (Lnet/minecraft/class_3965;)Z
      // 17e: ifeq 190
      // 181: goto 188
      // 184: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 187: athrow
      // 188: ldc2_w NaN
      // 18b: dreturn
      // 18c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 18f: athrow
      // 190: aload 12
      // 192: astore 7
      // 194: aload 8
      // 196: aload 2
      // 197: invokevirtual k74/x/lIIIII.I ()D
      // 19a: invokevirtual net/minecraft/class_243.method_1021 (D)Lnet/minecraft/class_243;
      // 19d: dconst_0
      // 19e: aload 2
      // 19f: invokevirtual k74/x/lIIIII.II ()D
      // 1a2: dconst_0
      // 1a3: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
      // 1a6: astore 8
      // 1a8: aload 7
      // 1aa: getfield net/minecraft/class_243.field_1351 D
      // 1ad: aload 1
      // 1ae: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1b1: invokevirtual net/minecraft/class_638.method_31607 ()I
      // 1b4: i2d
      // 1b5: ldc2_w 20.0
      // 1b8: dsub
      // 1b9: dcmpg
      // 1ba: ifge 1c5
      // 1bd: ldc2_w NaN
      // 1c0: dreturn
      // 1c1: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c4: athrow
      // 1c5: iinc 11 1
      // 1c8: goto 07c
      // 1cb: ldc2_w NaN
      // 1ce: dreturn
   }

   private int llIlII(lIlllIl var1) {
      return Math.max(0, (int)Math.ceil(this.lIllIl(var1) / 50.0));
   }

   private void llIlIl(class_310 var1) {
      try {
         if (!this.lIIIl(var1, this.IIII)) {
            this.lIIl(var1);
            return;
         }
      } catch (MatchException var4) {
         throw IllIIl(var4);
      }

      if (!this.llIIlI(var1.field_1687.method_8320(this.IIII))) {
         long var2 = System.currentTimeMillis();

         try {
            if (var2 - this.IIIllI <= 2500L) {
               this.III = var2 + 50L;
               return;
            }
         } catch (MatchException var5) {
            throw IllIIl(var5);
         }

         this.lIIl(var1);
      } else {
         try {
            if (!this.IllIl(var1, this.llIIl)) {
               return;
            }
         } catch (MatchException var6) {
            throw IllIIl(var6);
         }

         this.IIIIl(var1);
      }
   }

   private boolean llIllI() {
      try {
         if (this.IlIII.IllI() == IlIIllIIl.II) {
            return true;
         }
      } catch (MatchException var1) {
         throw IllIIl(var1);
      }

      return false;
   }

   private void llIlll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: aload 0
      // 03: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 06: invokevirtual k74/x/IIIllIl.Illll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 09: ifeq 1f
      // 0c: aload 0
      // 0d: aload 1
      // 0e: aload 0
      // 0f: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 12: invokevirtual k74/x/IIIllIl.lIIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 15: ifne 29
      // 18: goto 1f
      // 1b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e: athrow
      // 1f: aload 0
      // 20: aload 1
      // 21: invokevirtual k74/x/IIIllIl.lIIl (Lnet/minecraft/class_310;)V
      // 24: return
      // 25: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: aload 0
      // 2a: aload 1
      // 2b: aload 0
      // 2c: getfield k74/x/IIIllIl.IlII I
      // 2f: invokevirtual k74/x/IIIllIl.IllIl (Lnet/minecraft/class_310;I)Z
      // 32: ifne 3a
      // 35: return
      // 36: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 39: athrow
      // 3a: aload 0
      // 3b: aload 0
      // 3c: getfield k74/x/IIIllIl.IIII Lnet/minecraft/class_2338;
      // 3f: invokevirtual k74/x/IIIllIl.IllI (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 42: astore 2
      // 43: aload 0
      // 44: aload 1
      // 45: getstatic k74/x/IIlIlIlll.II Lk74/x/IIlIlIlll;
      // 48: getstatic k74/x/IIlIlIlll.Il Lk74/x/IIlIlIlll;
      // 4b: aload 0
      // 4c: getfield k74/x/IIIllIl.lIIIl F
      // 4f: aload 0
      // 50: getfield k74/x/IIIllIl.IIIlII F
      // 53: aload 2
      // 54: aload 0
      // 55: aload 1
      // 56: aload 2
      // 57: invokedynamic getAsBoolean (Lk74/x/IIIllIl;Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIl.llllI (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z, ()Z ]
      // 5c: invokevirtual k74/x/IIIllIl.II (Lnet/minecraft/class_310;Lk74/x/IIlIlIlll;Lk74/x/IIlIlIlll;FFLnet/minecraft/class_3965;Ljava/util/function/BooleanSupplier;)V
      // 5f: return
   }

   private double l(class_243 var1, class_243 var2, class_2338 var3, double var4, double var6, double var8) {
      double var10 = var3.method_10263() - var4;
      double var12 = var3.method_10263() + 1.0 + var4;
      double var14 = var3.method_10264() + var6 - var4;
      double var16 = var3.method_10264() + var8 + var4;
      double var18 = var3.method_10260() - var4;
      double var20 = var3.method_10260() + 1.0 + var4;
      double var22 = var2.field_1352 - var1.field_1352;
      double var24 = var2.field_1351 - var1.field_1351;
      double var26 = var2.field_1350 - var1.field_1350;
      double var28 = 0.0;
      double var30 = 1.0;
      double[] var32 = this.IIIIlI(var1.field_1352, var22, var10, var12, var28, var30);

      try {
         if (var32 == null) {
            return Double.NaN;
         }
      } catch (MatchException var35) {
         throw IllIIl(var35);
      }

      var28 = var32[0];
      var30 = var32[1];
      var32 = this.IIIIlI(var1.field_1351, var24, var14, var16, var28, var30);

      try {
         if (var32 == null) {
            return Double.NaN;
         }
      } catch (MatchException var34) {
         throw IllIIl(var34);
      }

      var28 = var32[0];
      var30 = var32[1];
      var32 = this.IIIIlI(var1.field_1350, var26, var18, var20, var28, var30);

      try {
         if (var32 == null) {
            return Double.NaN;
         }
      } catch (MatchException var33) {
         throw IllIIl(var33);
      }

      return var32[0];
   }

   private int IlllIIl(class_1661 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < lIIIlII(-1756496889, -1527506854 ^ -520001922); var3++) {
         class_1799 var4 = var1.method_5438(var3);
         if (var4.method_31574(class_1802.field_8069)) {
            var2 += var4.method_7947();
         }
      }

      return var2;
   }

   private static String IlllIlI(int var0, int var1) {
      int var9 = 1327320808;
      int var2 = (var0 ^ lIIIlII(-1756496892, var9 ^ -227361578)) & lIIIlII(-1756496891, var9 ^ 543139106);
      if (lIIll[var2] == null) {
         char[] var3 = lllII[var2].toCharArray();

         int var4 = switch (var3[0] & lIIIlII(-1756496870, var9 ^ 470741953)) {
            case 0 -> lIIIlII(-1756496869, var9 ^ 1519743201);
            case 1 -> lIIIlII(-1756496872, var9 ^ -396372772);
            case 2 -> lIIIlII(-1756496871, var9 ^ -1892381081);
            case 3 -> lIIIlII(-1756496866, var9 ^ -349957963);
            case 4 -> 5;
            case 5 -> lIIIlII(-1756496865, var9 ^ 647188692);
            case 6 -> lIIIlII(-1756496868, var9 ^ -1972301845);
            case 7 -> lIIIlII(-1756496867, var9 ^ -1335208582);
            case 8 -> lIIIlII(-1756496878, var9 ^ 1677504045);
            case 9 -> lIIIlII(-1756496877, var9 ^ 1113713068);
            case 10 -> lIIIlII(-1756496880, var9 ^ -165009861);
            case 11 -> lIIIlII(-1756496879, var9 ^ 1797557358);
            case 12 -> lIIIlII(-1756496874, var9 ^ -362636254);
            case 13 -> lIIIlII(-1756496873, var9 ^ -441038023);
            case 14 -> lIIIlII(-1756496876, var9 ^ -1422257839);
            case 15 -> lIIIlII(-1756496875, var9 ^ -2140394874);
            case 16 -> lIIIlII(-1756496790, var9 ^ 1030930431);
            case 17 -> lIIIlII(-1756496789, var9 ^ -582142795);
            case 18 -> lIIIlII(-1756496792, var9 ^ 245493389);
            case 19 -> lIIIlII(-1756496791, var9 ^ -1778507888);
            case 20 -> lIIIlII(-1756496786, var9 ^ -573935681);
            case 21 -> lIIIlII(-1756496785, var9 ^ -1638313977);
            case 22 -> lIIIlII(-1756496788, var9 ^ -2107205893);
            case 23 -> lIIIlII(-1756496787, var9 ^ -1364678655);
            case 24 -> lIIIlII(-1756496798, var9 ^ 365393083);
            case 25 -> lIIIlII(-1756496797, var9 ^ 1131993243);
            case 26 -> lIIIlII(-1756496800, var9 ^ 1035990704);
            case 27 -> lIIIlII(-1756496799, var9 ^ -203502647);
            case 28 -> lIIIlII(-1756496794, var9 ^ -140435520);
            case 29 -> lIIIlII(-1756496793, var9 ^ -195449770);
            case 30 -> lIIIlII(-1756496796, var9 ^ 956276164);
            case 31 -> lIIIlII(-1756496795, var9 ^ -1973966050);
            case 32 -> lIIIlII(-1756496774, var9 ^ -236561533);
            case 33 -> lIIIlII(-1756496773, var9 ^ -1219671741);
            case 34 -> lIIIlII(-1756496776, var9 ^ -1537146394);
            case 35 -> lIIIlII(-1756496775, var9 ^ -2094457141);
            case 36 -> lIIIlII(-1756496770, var9 ^ 1547834955);
            case 37 -> lIIIlII(-1756496769, var9 ^ -987985310);
            case 38 -> lIIIlII(-1756496772, var9 ^ 1564153673);
            case 39 -> lIIIlII(-1756496771, var9 ^ -1980060828);
            case 40 -> lIIIlII(-1756496782, var9 ^ 1460670483);
            case 41 -> lIIIlII(-1756496781, var9 ^ 985263455);
            case 42 -> lIIIlII(-1756496784, var9 ^ -778986208);
            case 43 -> lIIIlII(-1756496783, var9 ^ -1298596780);
            case 44 -> lIIIlII(-1756496778, var9 ^ 1987580627);
            case 45 -> lIIIlII(-1756496777, var9 ^ 1428612231);
            case 46 -> lIIIlII(-1756496780, var9 ^ -473429297);
            case 47 -> lIIIlII(-1756496779, var9 ^ 1611142725);
            case 48 -> lIIIlII(-1756496822, var9 ^ 646714968);
            case 49 -> lIIIlII(-1756496821, var9 ^ 475062830);
            case 50 -> lIIIlII(-1756496824, var9 ^ -22783444);
            case 51 -> lIIIlII(-1756496823, var9 ^ -1063996968);
            case 52 -> lIIIlII(-1756496818, var9 ^ -260564348);
            case 53 -> lIIIlII(-1756496817, var9 ^ 1887508440);
            case 54 -> lIIIlII(-1756496820, var9 ^ 686277865);
            case 55 -> lIIIlII(-1756496819, var9 ^ -206005005);
            case 56 -> lIIIlII(-1756496830, var9 ^ -1394113795);
            case 57 -> lIIIlII(-1756496829, var9 ^ 104107518);
            case 58 -> lIIIlII(-1756496832, var9 ^ 1415261004);
            case 59 -> lIIIlII(-1756496831, var9 ^ 498952268);
            case 60 -> lIIIlII(-1756496826, var9 ^ -163624058);
            case 61 -> lIIIlII(-1756496825, var9 ^ -938348657);
            case 62 -> lIIIlII(-1756496828, var9 ^ -578921734);
            case 63 -> lIIIlII(-1756496827, var9 ^ 1982601302);
            case 64 -> lIIIlII(-1756496806, var9 ^ 630046086);
            case 65 -> lIIIlII(-1756496805, var9 ^ 674223749);
            case 66 -> lIIIlII(-1756496808, var9 ^ -1102091575);
            case 67 -> lIIIlII(-1756496807, var9 ^ 1395270798);
            case 68 -> lIIIlII(-1756496802, var9 ^ 591488595);
            case 69 -> lIIIlII(-1756496801, var9 ^ 95299);
            case 70 -> lIIIlII(-1756496804, var9 ^ -1987470759);
            case 71 -> lIIIlII(-1756496803, var9 ^ -784647439);
            case 72 -> lIIIlII(-1756496814, var9 ^ -1415044233);
            case 73 -> lIIIlII(-1756496813, var9 ^ -1523170177);
            case 74 -> lIIIlII(-1756496816, var9 ^ 361056583);
            case 75 -> lIIIlII(-1756496815, var9 ^ -1533088156);
            case 76 -> lIIIlII(-1756496810, var9 ^ 1875152295);
            case 77 -> lIIIlII(-1756496809, var9 ^ 953587096);
            case 78 -> lIIIlII(-1756496812, var9 ^ 29034897);
            case 79 -> lIIIlII(-1756496811, var9 ^ 194478063);
            case 80 -> lIIIlII(-1756496726, var9 ^ -957197067);
            case 81 -> lIIIlII(-1756496725, var9 ^ 218934966);
            case 82 -> lIIIlII(-1756496728, var9 ^ 1107521770);
            case 83 -> lIIIlII(-1756496727, var9 ^ 1302424535);
            case 84 -> lIIIlII(-1756496722, var9 ^ -1774050786);
            case 85 -> lIIIlII(-1756496721, var9 ^ 114704331);
            case 86 -> lIIIlII(-1756496724, var9 ^ -452824783);
            case 87 -> lIIIlII(-1756496723, var9 ^ 1196038442);
            case 88 -> lIIIlII(-1756496734, var9 ^ -1855698779);
            case 89 -> lIIIlII(-1756496733, var9 ^ -1665467170);
            case 90 -> lIIIlII(-1756496736, var9 ^ -813016177);
            case 91 -> lIIIlII(-1756496735, var9 ^ -2090418800);
            case 92 -> lIIIlII(-1756496730, var9 ^ 1629157610);
            case 93 -> 0;
            case 94 -> lIIIlII(-1756496729, var9 ^ -1090523299);
            case 95 -> lIIIlII(-1756496732, var9 ^ 768677368);
            case 96 -> lIIIlII(-1756496731, var9 ^ 1458271753);
            case 97 -> lIIIlII(-1756496710, var9 ^ -225883690);
            case 98 -> lIIIlII(-1756496709, var9 ^ 839502280);
            case 99 -> lIIIlII(-1756496712, var9 ^ -2014953032);
            case 100 -> lIIIlII(-1756496711, var9 ^ -1073086349);
            case 101 -> lIIIlII(-1756496706, var9 ^ 1519812893);
            case 102 -> lIIIlII(-1756496705, var9 ^ 417177568);
            case 103 -> lIIIlII(-1756496708, var9 ^ -2078512593);
            case 104 -> lIIIlII(-1756496707, var9 ^ 2036901028);
            case 105 -> lIIIlII(-1756496718, var9 ^ -442079418);
            case 106 -> lIIIlII(-1756496717, var9 ^ 2047787933);
            case 107 -> lIIIlII(-1756496720, var9 ^ 454834011);
            case 108 -> lIIIlII(-1756496719, var9 ^ -1599113028);
            case 109 -> lIIIlII(-1756496714, var9 ^ -1172341206);
            case 110 -> lIIIlII(-1756496713, var9 ^ 1465334857);
            case 111 -> lIIIlII(-1756496716, var9 ^ 957996901);
            case 112 -> lIIIlII(-1756496715, var9 ^ -1939388588);
            case 113 -> lIIIlII(-1756496758, var9 ^ -150657081);
            case 114 -> lIIIlII(-1756496757, var9 ^ -2115762549);
            case 115 -> lIIIlII(-1756496760, var9 ^ 358367051);
            case 116 -> lIIIlII(-1756496759, var9 ^ -1094623596);
            case 117 -> lIIIlII(-1756496754, var9 ^ 1464966435);
            case 118 -> lIIIlII(-1756496753, var9 ^ -608303201);
            case 119 -> lIIIlII(-1756496756, var9 ^ -1122956657);
            case 120 -> lIIIlII(-1756496755, var9 ^ 1242783686);
            case 121 -> lIIIlII(-1756496766, var9 ^ 1150695698);
            case 122 -> lIIIlII(-1756496765, var9 ^ -449047796);
            case 123 -> lIIIlII(-1756496768, var9 ^ 1731631890);
            case 124 -> lIIIlII(-1756496767, var9 ^ 885363106);
            case 125 -> lIIIlII(-1756496762, var9 ^ -67234466);
            case 126 -> lIIIlII(-1756496761, var9 ^ -2129562);
            case 127 -> lIIIlII(-1756496764, var9 ^ -1745603264);
            case 128 -> lIIIlII(-1756496763, var9 ^ 1114990092);
            case 129 -> lIIIlII(-1756496742, var9 ^ -2105041765);
            case 130 -> lIIIlII(-1756496741, var9 ^ -1029963814);
            case 131 -> lIIIlII(-1756496744, var9 ^ -790955760);
            case 132 -> lIIIlII(-1756496743, var9 ^ 566199963);
            case 133 -> lIIIlII(-1756496738, var9 ^ -541334249);
            case 134 -> lIIIlII(-1756496737, var9 ^ -695849945);
            case 135 -> lIIIlII(-1756496740, var9 ^ 1430490913);
            case 136 -> lIIIlII(-1756496739, var9 ^ 2004384483);
            case 137 -> lIIIlII(-1756496750, var9 ^ 591467753);
            case 138 -> lIIIlII(-1756496749, var9 ^ 1041773580);
            case 139 -> lIIIlII(-1756496752, var9 ^ 570483871);
            case 140 -> lIIIlII(-1756496751, var9 ^ -1145665466);
            case 141 -> lIIIlII(-1756496746, var9 ^ 1499151548);
            case 142 -> lIIIlII(-1756496745, var9 ^ -1365399233);
            case 143 -> lIIIlII(-1756496748, var9 ^ -1052162774);
            case 144 -> lIIIlII(-1756496747, var9 ^ 452195938);
            case 145 -> lIIIlII(-1756496662, var9 ^ -1114159163);
            case 146 -> lIIIlII(-1756496661, var9 ^ 1472844011);
            case 147 -> lIIIlII(-1756496664, var9 ^ -955770277);
            case 148 -> lIIIlII(-1756496663, var9 ^ -1613285881);
            case 149 -> lIIIlII(-1756496658, var9 ^ 2093765999);
            case 150 -> lIIIlII(-1756496657, var9 ^ -965243299);
            case 151 -> lIIIlII(-1756496660, var9 ^ 497854070);
            case 152 -> lIIIlII(-1756496659, var9 ^ -1030369633);
            case 153 -> lIIIlII(-1756496670, var9 ^ -969350196);
            case 154 -> lIIIlII(-1756496669, var9 ^ 96026256);
            case 155 -> lIIIlII(-1756496672, var9 ^ 62276600);
            case 156 -> lIIIlII(-1756496671, var9 ^ 956071430);
            case 157 -> lIIIlII(-1756496666, var9 ^ 1977646965);
            case 158 -> 4;
            case 159 -> lIIIlII(-1756496665, var9 ^ 1360336558);
            case 160 -> lIIIlII(-1756496668, var9 ^ -37617464);
            case 161 -> lIIIlII(-1756496667, var9 ^ 716748860);
            case 162 -> 2;
            case 163 -> lIIIlII(-1756496646, var9 ^ -1830137977);
            case 164 -> lIIIlII(-1756496645, var9 ^ -1628751460);
            case 165 -> lIIIlII(-1756496648, var9 ^ 1300824439);
            case 166 -> lIIIlII(-1756496647, var9 ^ 1715921272);
            case 167 -> lIIIlII(-1756496642, var9 ^ 368309182);
            case 168 -> lIIIlII(-1756496641, var9 ^ 1274199493);
            case 169 -> lIIIlII(-1756496644, var9 ^ -2011897338);
            case 170 -> lIIIlII(-1756496643, var9 ^ 1625562603);
            case 171 -> lIIIlII(-1756496654, var9 ^ -750849111);
            case 172 -> lIIIlII(-1756496653, var9 ^ 370769858);
            case 173 -> lIIIlII(-1756496656, var9 ^ -775737954);
            case 174 -> 1;
            case 175 -> lIIIlII(-1756496655, var9 ^ -1884884753);
            case 176 -> lIIIlII(-1756496650, var9 ^ 1299416758);
            case 177 -> lIIIlII(-1756496649, var9 ^ -80503568);
            case 178 -> lIIIlII(-1756496652, var9 ^ -1766192353);
            case 179 -> lIIIlII(-1756496651, var9 ^ 304068362);
            case 180 -> lIIIlII(-1756496694, var9 ^ 411501557);
            case 181 -> lIIIlII(-1756496693, var9 ^ -624566887);
            case 182 -> lIIIlII(-1756496696, var9 ^ -1782873375);
            case 183 -> 3;
            case 184 -> lIIIlII(-1756496695, var9 ^ -879039798);
            case 185 -> lIIIlII(-1756496690, var9 ^ -887662348);
            case 186 -> lIIIlII(-1756496689, var9 ^ -863058251);
            case 187 -> lIIIlII(-1756496692, var9 ^ -1340133193);
            case 188 -> lIIIlII(-1756496691, var9 ^ -1298309058);
            case 189 -> lIIIlII(-1756496702, var9 ^ -441271015);
            case 190 -> lIIIlII(-1756496701, var9 ^ -1199042901);
            case 191 -> lIIIlII(-1756496704, var9 ^ -55903569);
            case 192 -> lIIIlII(-1756496703, var9 ^ 294209227);
            case 193 -> lIIIlII(-1756496698, var9 ^ -104386724);
            case 194 -> lIIIlII(-1756496697, var9 ^ -1849397338);
            case 195 -> lIIIlII(-1756496700, var9 ^ 6342750);
            case 196 -> lIIIlII(-1756496699, var9 ^ -1223256510);
            case 197 -> lIIIlII(-1756496678, var9 ^ -370976640);
            case 198 -> lIIIlII(-1756496677, var9 ^ 1300270705);
            case 199 -> lIIIlII(-1756496680, var9 ^ -1608973750);
            case 200 -> lIIIlII(-1756496679, var9 ^ -862654110);
            case 201 -> lIIIlII(-1756496674, var9 ^ 432920878);
            case 202 -> lIIIlII(-1756496673, var9 ^ 2071811697);
            case 203 -> lIIIlII(-1756496676, var9 ^ 1089463939);
            case 204 -> lIIIlII(-1756496675, var9 ^ 176033031);
            case 205 -> lIIIlII(-1756496686, var9 ^ -180310354);
            case 206 -> lIIIlII(-1756496685, var9 ^ 1990179717);
            case 207 -> lIIIlII(-1756496688, var9 ^ -530145918);
            case 208 -> lIIIlII(-1756496687, var9 ^ -1968378328);
            case 209 -> lIIIlII(-1756496682, var9 ^ 462829817);
            case 210 -> lIIIlII(-1756496681, var9 ^ -1187844617);
            case 211 -> lIIIlII(-1756496684, var9 ^ 407951550);
            case 212 -> lIIIlII(-1756496683, var9 ^ 1352059725);
            case 213 -> lIIIlII(-1756496598, var9 ^ 260736406);
            case 214 -> lIIIlII(-1756496597, var9 ^ -1136641423);
            case 215 -> lIIIlII(-1756496600, var9 ^ -424708599);
            case 216 -> lIIIlII(-1756496599, var9 ^ -84601316);
            case 217 -> lIIIlII(-1756496594, var9 ^ -815655510);
            case 218 -> lIIIlII(-1756496593, var9 ^ -1198836108);
            case 219 -> lIIIlII(-1756496596, var9 ^ -1007061541);
            case 220 -> lIIIlII(-1756496595, var9 ^ -236858562);
            case 221 -> lIIIlII(-1756496606, var9 ^ 1801729697);
            case 222 -> lIIIlII(-1756496605, var9 ^ -552158144);
            case 223 -> lIIIlII(-1756496608, var9 ^ 1576624567);
            case 224 -> lIIIlII(-1756496607, var9 ^ -1689082024);
            case 225 -> lIIIlII(-1756496602, var9 ^ 561327057);
            case 226 -> lIIIlII(-1756496601, var9 ^ -974551274);
            case 227 -> lIIIlII(-1756496604, var9 ^ -2135515959);
            case 228 -> lIIIlII(-1756496603, var9 ^ -1064866601);
            case 229 -> lIIIlII(-1756496582, var9 ^ 1673374614);
            case 230 -> lIIIlII(-1756496581, var9 ^ -1756670093);
            case 231 -> lIIIlII(-1756496584, var9 ^ -284018810);
            case 232 -> lIIIlII(-1756496583, var9 ^ -1027138495);
            case 233 -> lIIIlII(-1756496578, var9 ^ 828445325);
            case 234 -> lIIIlII(-1756496577, var9 ^ -797284303);
            case 235 -> lIIIlII(-1756496580, var9 ^ 2037789045);
            case 236 -> lIIIlII(-1756496579, var9 ^ 339981038);
            case 237 -> lIIIlII(-1756496590, var9 ^ 780764167);
            case 238 -> lIIIlII(-1756496589, var9 ^ -187079640);
            case 239 -> lIIIlII(-1756496592, var9 ^ -2115125713);
            case 240 -> lIIIlII(-1756496591, var9 ^ 70229159);
            case 241 -> lIIIlII(-1756496586, var9 ^ 536838738);
            case 242 -> lIIIlII(-1756496585, var9 ^ 66790641);
            case 243 -> lIIIlII(-1756496588, var9 ^ 1993116965);
            case 244 -> lIIIlII(-1756496587, var9 ^ -1495788821);
            case 245 -> lIIIlII(-1756496630, var9 ^ -1738799119);
            case 246 -> lIIIlII(-1756496629, var9 ^ 838505374);
            case 247 -> lIIIlII(-1756496632, var9 ^ -2141806163);
            case 248 -> lIIIlII(-1756496631, var9 ^ -1346664913);
            case 249 -> lIIIlII(-1756496626, var9 ^ 1159042399);
            case 250 -> lIIIlII(-1756496625, var9 ^ -1892418068);
            case 251 -> lIIIlII(-1756496628, var9 ^ -806773141);
            case 252 -> lIIIlII(-1756496627, var9 ^ -1465010089);
            case 253 -> lIIIlII(-1756496638, var9 ^ -170956715);
            case 254 -> lIIIlII(-1756496637, var9 ^ 199787523);
            default -> lIIIlII(-1756496640, var9 ^ -1890468563);
         };
         int var5 = (var1 & lIIIlII(-1756496639, var9 ^ -131683851)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIIlII(-1756496634, var9 ^ 1220362896)) >>> lIIIlII(-1756496633, var9 ^ -68498823)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIIlII(-1756496636, var9 ^ -1778230879);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIIlII(-1756496635, var9 ^ 77510993);
            }
         }

         lIIll[var2] = new String(var3).intern();
      }

      return lIIll[var2];
   }

   public IIIllIl() {
      int var1 = -335611799;
      super(
         IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496614, var1 ^ 245016171), lIIIlII(-1756496613, var1 ^ 1000390249))),
         lllIIlIl.I,
         IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496616, var1 ^ 1197838748), lIIIlII(-1756496615, var1 ^ -432252165)))
      );
      this.IlIII = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496610, var1 ^ -1768621917), lIIIlII(-1756496609, var1 ^ 588100653))), IlIIllIIl.class, IlIIllIIl.I)
      );
      this.llIlI = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496612, var1 ^ -1374011342), lIIIlII(-1756496611, var1 ^ -819360541))), IlIIIllI.class, IlIIIllI.Il)
      );
      this.IIIIlI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496622, var1 ^ -1856085385), lIIIlII(-1756496621, var1 ^ -1588766109))), 50.0, 1.0, 100.0, 1.0)
            .lIlI(this::llIllI)
      );
      this.I = new IlIIIllll();
      this.IlI = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496624, var1 ^ -1033741271), lIIIlII(-1756496623, var1 ^ 1851623399))), 45.0, 45.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496618, var1 ^ 811066826), lIIIlII(-1756496617, var1 ^ 1264366323))))
      );
      this.lllll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496620, var1 ^ -446062237), lIIIlII(-1756496619, var1 ^ 829828887))), true));
      this.IIIIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496534, var1 ^ -7473751), lIIIlII(-1756496533, var1 ^ -1127390069))), false));
      this.lIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496536, var1 ^ -441822532), lIIIlII(-1756496535, var1 ^ 436190864))), false));
      this.lIll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IlllIlI(lIIIlII(-1756496530, var1 ^ 1284979667), lIIIlII(-1756496529, var1 ^ 290668783))), 9.0, 1.0, 9.0, 1.0)
            .lIlI(this.IIIIll::IllI)
      );
      this.lIlI = IIlIlIlll.I;
      this.lIl = -1;
      this.Illl = -1;
      this.IIlII = k74.x.IIIIll.I;
      this.IlII = -1;
      this.llIIl = -1;
      this.IIIIII = 1;
      this.lIlII = 0;
      this.Ill = -1;
      this.IIl = class_1268.field_5808;
      this.IlIIl = IIlIlIlll.I;
      this.IllII = lIIIlII(-1756496532, var1 ^ 1987121681);
      this.IIllI = lIIIlII(-1756496531, var1 ^ 1234930848);
      this.llll = new IlIIlll();
   }

   private boolean IlllIll(class_310 param1, class_243 param2, class_2338 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 36
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 36
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 36
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 2
      // 21: ifnull 36
      // 24: goto 2b
      // 27: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2a: athrow
      // 2b: aload 3
      // 2c: ifnonnull 3c
      // 2f: goto 36
      // 32: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 35: athrow
      // 36: bipush 0
      // 37: ireturn
      // 38: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3b: athrow
      // 3c: aload 1
      // 3d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 40: new net/minecraft/class_3959
      // 43: dup
      // 44: aload 1
      // 45: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 48: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 4b: aload 2
      // 4c: getstatic net/minecraft/class_3959$class_3960.field_17559 Lnet/minecraft/class_3959$class_3960;
      // 4f: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 52: aload 1
      // 53: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 56: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 59: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 5c: astore 4
      // 5e: aload 4
      // 60: ifnull 7e
      // 63: aload 4
      // 65: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 68: aload 3
      // 69: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 6c: ifeq 7e
      // 6f: goto 76
      // 72: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 75: athrow
      // 76: bipush 1
      // 77: goto 7f
      // 7a: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7d: athrow
      // 7e: bipush 0
      // 7f: ireturn
   }

   private boolean IllllII(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 35
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 35
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: iload 2
      // 13: iflt 35
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: iload 2
      // 1e: ldc_w -1756496542
      // 21: ldc_w 1302441712
      // 24: ldc_w -1922077902
      // 27: ixor
      // 28: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 2b: if_icmplt 3b
      // 2e: goto 35
      // 31: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 34: athrow
      // 35: bipush 0
      // 36: ireturn
      // 37: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield k74/x/IIIllIl.llll Lk74/x/IlIIlll;
      // 3f: iload 2
      // 40: invokevirtual k74/x/IlIIlll.II (I)Z
      // 43: ifne 82
      // 46: aload 1
      // 47: invokestatic k74/x/IIll.lIIlI (Lnet/minecraft/class_310;)I
      // 4a: iload 2
      // 4b: if_icmpeq 5d
      // 4e: goto 55
      // 51: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5e
      // 59: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5c: athrow
      // 5d: bipush 0
      // 5e: istore 3
      // 5f: iload 3
      // 60: ifeq 72
      // 63: aload 0
      // 64: aload 0
      // 65: getfield k74/x/IIIllIl.IlI Lk74/x/lIlllIl;
      // 68: invokevirtual k74/x/IIIllIl.lIllIl (Lk74/x/lIlllIl;)J
      // 6b: goto 73
      // 6e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 71: athrow
      // 72: lconst_0
      // 73: lstore 4
      // 75: aload 0
      // 76: getfield k74/x/IIIllIl.llll Lk74/x/IlIIlll;
      // 79: iload 2
      // 7a: invokestatic java/lang/System.currentTimeMillis ()J
      // 7d: lload 4
      // 7f: invokevirtual k74/x/IlIIlll.Il (IJJ)V
      // 82: aload 0
      // 83: getfield k74/x/IIIllIl.llll Lk74/x/IlIIlll;
      // 86: iload 2
      // 87: invokestatic java/lang/System.currentTimeMillis ()J
      // 8a: invokevirtual k74/x/IlIIlll.I (IJ)Z
      // 8d: ireturn
   }

   private boolean IllllIl(class_1661 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 42
      // 04: iload 2
      // 05: iflt 42
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: iload 2
      // 10: ldc_w -1756496541
      // 13: ldc_w -1786297941
      // 16: ldc_w 586130016
      // 19: ixor
      // 1a: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 1d: if_icmpge 42
      // 20: goto 27
      // 23: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: aload 0
      // 28: aload 1
      // 29: iload 2
      // 2a: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 2d: invokevirtual k74/x/IIIllIl.IlllI (Lnet/minecraft/class_1799;)Z
      // 30: ifeq 42
      // 33: goto 3a
      // 36: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 39: athrow
      // 3a: bipush 1
      // 3b: goto 43
      // 3e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 41: athrow
      // 42: bipush 0
      // 43: ireturn
   }

   private static class_2350 IlllllI(double param0, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: dload 0
      // 01: invokestatic java/lang/Math.abs (D)D
      // 04: dload 2
      // 05: invokestatic java/lang/Math.abs (D)D
      // 08: dcmpl
      // 09: iflt 27
      // 0c: dload 0
      // 0d: dconst_0
      // 0e: dcmpl
      // 0f: iflt 23
      // 12: goto 19
      // 15: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 18: athrow
      // 19: getstatic net/minecraft/class_2350.field_11034 Lnet/minecraft/class_2350;
      // 1c: goto 26
      // 1f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: getstatic net/minecraft/class_2350.field_11039 Lnet/minecraft/class_2350;
      // 26: areturn
      // 27: dload 2
      // 28: dconst_0
      // 29: dcmpl
      // 2a: iflt 37
      // 2d: getstatic net/minecraft/class_2350.field_11035 Lnet/minecraft/class_2350;
      // 30: goto 3a
      // 33: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 36: athrow
      // 37: getstatic net/minecraft/class_2350.field_11043 Lnet/minecraft/class_2350;
      // 3a: areturn
   }

   private boolean Illllll(class_310 var1, IIlIlIlll var2, IIlIlIlll var3, BooleanSupplier var4) {
      return this.IIIIII(var1, var2, var3, var4);
   }

   private boolean lIIIIII(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1d
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: ifnull 1d
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 2
      // 13: ifnonnull 23
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
      // 1f: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: aload 1
      // 24: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 27: aload 2
      // 28: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 2b: astore 3
      // 2c: aload 3
      // 2d: getstatic net/minecraft/class_2246.field_10036 Lnet/minecraft/class_2248;
      // 30: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 33: ifne 58
      // 36: aload 3
      // 37: getstatic net/minecraft/class_2246.field_22089 Lnet/minecraft/class_2248;
      // 3a: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 3d: ifne 58
      // 40: goto 47
      // 43: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 46: athrow
      // 47: aload 3
      // 48: getstatic net/minecraft/class_2246.field_10164 Lnet/minecraft/class_2248;
      // 4b: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 4e: ifeq 60
      // 51: goto 58
      // 54: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 57: athrow
      // 58: bipush 1
      // 59: goto 61
      // 5c: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5f: athrow
      // 60: bipush 0
      // 61: ireturn
   }

   private boolean lIIIIIl(BooleanSupplier var1) {
      boolean var2 = k74.x.IIll.IlI();

      boolean var3;
      try {
         var3 = var1.getAsBoolean();
      } finally {
         try {
            if (var2) {
               k74.x.IIll.lIl();
            }
         } catch (MatchException var8) {
            throw IllIIl(var8);
         }
      }

      return var3;
   }

   private float[] lIIIIlI(class_310 param1, lIIIII param2, class_2338 param3, class_2338 param4, float param5, float param6) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ifnull 034
      // 004: aload 1
      // 005: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 008: ifnull 034
      // 00b: goto 012
      // 00e: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 011: athrow
      // 012: aload 2
      // 013: ifnull 034
      // 016: goto 01d
      // 019: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 01c: athrow
      // 01d: aload 3
      // 01e: ifnull 034
      // 021: goto 028
      // 024: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 027: athrow
      // 028: aload 4
      // 02a: ifnonnull 03a
      // 02d: goto 034
      // 030: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 033: athrow
      // 034: aconst_null
      // 035: areturn
      // 036: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 039: athrow
      // 03a: aload 0
      // 03b: aload 4
      // 03d: invokevirtual k74/x/IIIllIl.lllI (Lnet/minecraft/class_2338;)Lnet/minecraft/class_243;
      // 040: astore 7
      // 042: aload 1
      // 043: aload 7
      // 045: invokestatic k74/x/IlllIlII.lIII (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 048: astore 8
      // 04a: aload 8
      // 04c: ifnonnull 055
      // 04f: aconst_null
      // 050: areturn
      // 051: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 054: athrow
      // 055: aload 8
      // 057: bipush 0
      // 058: faload
      // 059: fstore 9
      // 05b: aload 8
      // 05d: bipush 1
      // 05e: faload
      // 05f: fstore 10
      // 061: bipush 2
      // 062: newarray 6
      // 064: dup
      // 065: bipush 0
      // 066: fload 5
      // 068: fastore
      // 069: dup
      // 06a: bipush 1
      // 06b: fload 9
      // 06d: fastore
      // 06e: astore 11
      // 070: ldc_w -1756496544
      // 073: ldc_w 68103911
      // 076: ldc_w 388010225
      // 079: ixor
      // 07a: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 07d: newarray 6
      // 07f: dup
      // 080: bipush 0
      // 081: fload 6
      // 083: fastore
      // 084: dup
      // 085: bipush 1
      // 086: fload 10
      // 088: fastore
      // 089: dup
      // 08a: bipush 2
      // 08b: fload 10
      // 08d: fconst_1
      // 08e: fadd
      // 08f: fastore
      // 090: dup
      // 091: bipush 3
      // 092: fload 10
      // 094: fconst_2
      // 095: fadd
      // 096: fastore
      // 097: dup
      // 098: bipush 4
      // 099: fload 10
      // 09b: fconst_1
      // 09c: fsub
      // 09d: fastore
      // 09e: dup
      // 09f: bipush 5
      // 0a0: fload 10
      // 0a2: fconst_2
      // 0a3: fsub
      // 0a4: fastore
      // 0a5: dup
      // 0a6: ldc_w -1756496543
      // 0a9: ldc_w 68103911
      // 0ac: ldc_w -1405996081
      // 0af: ixor
      // 0b0: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 0b3: fload 10
      // 0b5: ldc_w 3.5
      // 0b8: fadd
      // 0b9: fastore
      // 0ba: dup
      // 0bb: ldc_w -1756496538
      // 0be: ldc_w 68103911
      // 0c1: ldc_w 372954971
      // 0c4: ixor
      // 0c5: invokestatic k74/x/IIIllIl.lIIIlII (II)I
      // 0c8: fload 10
      // 0ca: ldc_w 3.5
      // 0cd: fsub
      // 0ce: fastore
      // 0cf: astore 12
      // 0d1: aconst_null
      // 0d2: astore 13
      // 0d4: ldc2_w Infinity
      // 0d7: dstore 14
      // 0d9: aload 0
      // 0da: aload 1
      // 0db: aload 2
      // 0dc: aload 3
      // 0dd: aload 4
      // 0df: fload 5
      // 0e1: fload 6
      // 0e3: invokevirtual k74/x/IIIllIl.llIIll (Lnet/minecraft/class_310;Lk74/x/lIIIII;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)D
      // 0e6: dstore 16
      // 0e8: dload 16
      // 0ea: invokestatic java/lang/Double.isNaN (D)Z
      // 0ed: ifne 102
      // 0f0: bipush 2
      // 0f1: newarray 6
      // 0f3: dup
      // 0f4: bipush 0
      // 0f5: fload 5
      // 0f7: fastore
      // 0f8: dup
      // 0f9: bipush 1
      // 0fa: fload 6
      // 0fc: fastore
      // 0fd: areturn
      // 0fe: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 101: athrow
      // 102: aload 11
      // 104: astore 18
      // 106: aload 18
      // 108: arraylength
      // 109: istore 19
      // 10b: bipush 0
      // 10c: istore 20
      // 10e: iload 20
      // 110: iload 19
      // 112: if_icmpge 17b
      // 115: aload 18
      // 117: iload 20
      // 119: faload
      // 11a: fstore 21
      // 11c: aload 12
      // 11e: astore 22
      // 120: aload 22
      // 122: arraylength
      // 123: istore 23
      // 125: bipush 0
      // 126: istore 24
      // 128: iload 24
      // 12a: iload 23
      // 12c: if_icmpge 175
      // 12f: aload 22
      // 131: iload 24
      // 133: faload
      // 134: fstore 25
      // 136: aload 0
      // 137: aload 1
      // 138: aload 2
      // 139: aload 3
      // 13a: aload 4
      // 13c: fload 21
      // 13e: fload 25
      // 140: invokevirtual k74/x/IIIllIl.llIIll (Lnet/minecraft/class_310;Lk74/x/lIIIII;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)D
      // 143: dstore 26
      // 145: dload 26
      // 147: invokestatic java/lang/Double.isNaN (D)Z
      // 14a: ifne 16f
      // 14d: dload 26
      // 14f: dload 14
      // 151: dcmpg
      // 152: ifge 16f
      // 155: goto 15c
      // 158: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15b: athrow
      // 15c: dload 26
      // 15e: dstore 14
      // 160: bipush 2
      // 161: newarray 6
      // 163: dup
      // 164: bipush 0
      // 165: fload 21
      // 167: fastore
      // 168: dup
      // 169: bipush 1
      // 16a: fload 25
      // 16c: fastore
      // 16d: astore 13
      // 16f: iinc 24 1
      // 172: goto 128
      // 175: iinc 20 1
      // 178: goto 10e
      // 17b: ldc2_w -4.0
      // 17e: dstore 18
      // 180: dload 18
      // 182: ldc2_w 4.001
      // 185: dcmpg
      // 186: ifgt 1f4
      // 189: ldc2_w -8.0
      // 18c: dstore 20
      // 18e: dload 20
      // 190: ldc2_w 10.001
      // 193: dcmpg
      // 194: ifgt 1eb
      // 197: fload 9
      // 199: f2d
      // 19a: dload 18
      // 19c: dadd
      // 19d: d2f
      // 19e: fstore 22
      // 1a0: fload 10
      // 1a2: f2d
      // 1a3: dload 20
      // 1a5: dadd
      // 1a6: d2f
      // 1a7: fstore 23
      // 1a9: aload 0
      // 1aa: aload 1
      // 1ab: aload 2
      // 1ac: aload 3
      // 1ad: aload 4
      // 1af: fload 22
      // 1b1: fload 23
      // 1b3: invokevirtual k74/x/IIIllIl.llIIll (Lnet/minecraft/class_310;Lk74/x/lIIIII;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)D
      // 1b6: dstore 24
      // 1b8: dload 24
      // 1ba: invokestatic java/lang/Double.isNaN (D)Z
      // 1bd: ifne 1e2
      // 1c0: dload 24
      // 1c2: dload 14
      // 1c4: dcmpg
      // 1c5: ifge 1e2
      // 1c8: goto 1cf
      // 1cb: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1ce: athrow
      // 1cf: dload 24
      // 1d1: dstore 14
      // 1d3: bipush 2
      // 1d4: newarray 6
      // 1d6: dup
      // 1d7: bipush 0
      // 1d8: fload 22
      // 1da: fastore
      // 1db: dup
      // 1dc: bipush 1
      // 1dd: fload 23
      // 1df: fastore
      // 1e0: astore 13
      // 1e2: dload 20
      // 1e4: dconst_1
      // 1e5: dadd
      // 1e6: dstore 20
      // 1e8: goto 18e
      // 1eb: dload 18
      // 1ed: dconst_1
      // 1ee: dadd
      // 1ef: dstore 18
      // 1f1: goto 180
      // 1f4: aload 13
      // 1f6: ifnull 282
      // 1f9: aload 13
      // 1fb: bipush 0
      // 1fc: faload
      // 1fd: fstore 18
      // 1ff: aload 13
      // 201: bipush 1
      // 202: faload
      // 203: fstore 19
      // 205: ldc2_w -1.0
      // 208: dstore 20
      // 20a: dload 20
      // 20c: ldc2_w 1.001
      // 20f: dcmpg
      // 210: ifgt 282
      // 213: ldc2_w -1.0
      // 216: dstore 22
      // 218: dload 22
      // 21a: ldc2_w 1.001
      // 21d: dcmpg
      // 21e: ifgt 277
      // 221: fload 18
      // 223: f2d
      // 224: dload 20
      // 226: dadd
      // 227: d2f
      // 228: fstore 24
      // 22a: fload 19
      // 22c: f2d
      // 22d: dload 22
      // 22f: dadd
      // 230: d2f
      // 231: fstore 25
      // 233: aload 0
      // 234: aload 1
      // 235: aload 2
      // 236: aload 3
      // 237: aload 4
      // 239: fload 24
      // 23b: fload 25
      // 23d: invokevirtual k74/x/IIIllIl.llIIll (Lnet/minecraft/class_310;Lk74/x/lIIIII;Lnet/minecraft/class_2338;Lnet/minecraft/class_2338;FF)D
      // 240: dstore 26
      // 242: dload 26
      // 244: invokestatic java/lang/Double.isNaN (D)Z
      // 247: ifne 26c
      // 24a: dload 26
      // 24c: dload 14
      // 24e: dcmpg
      // 24f: ifge 26c
      // 252: goto 259
      // 255: invokestatic k74/x/IIIllIl.IllIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 258: athrow
      // 259: dload 26
      // 25b: dstore 14
      // 25d: bipush 2
      // 25e: newarray 6
      // 260: dup
      // 261: bipush 0
      // 262: fload 24
      // 264: fastore
      // 265: dup
      // 266: bipush 1
      // 267: fload 25
      // 269: fastore
      // 26a: astore 13
      // 26c: dload 22
      // 26e: ldc2_w 0.25
      // 271: dadd
      // 272: dstore 22
      // 274: goto 218
      // 277: dload 20
      // 279: ldc2_w 0.25
      // 27c: dadd
      // 27d: dstore 20
      // 27f: goto 20a
      // 282: aload 13
      // 284: areturn
   }
}
