package k74.x;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class IIIIIIlII extends IlIIIIIIl {
   private final lIlllIl II;
   private IIIIlIl Il;
   private int lI;
   private static final class_2350[] ll;
   private final IIlIII III;
   private static final int IIl = 120;
   private class_1268 IlI;
   private static final double Ill = 20.25;
   private long lII;
   private static final double lIl = 4.5;
   private int llI;
   private boolean lll;
   private final Map<class_2338, Integer> IIII;
   private static final int IIIl = 2;
   private static final int[] IlIll;
   private class_2338 IIlI;
   private lIlllII IIll;
   private final lIlllIl IlII;
   private Object IlIl;
   private long IllI;
   private int Illl;
   private static final String[] IllII;
   private final IllIII<llIIIII> lIII;
   private static final Object[] IllIl;
   private static final String[] lIIl;
   private static final double lIlI = 0.01;
   private static final double lIll = 3.0;
   private int llII;
   private final IllIII<IIIIIIl> llIl;
   private static final double lllI = 9.0;
   private long llll;
   private final IlIIIllll I;
   private IIIIII IIIII;
   private boolean IIIIl;
   private int IIIlI;
   private IlIIIllIl IIIll;
   private static final int IIlII = 2;
   private static final String[] IIlIl;
   private long IIllI;
   private int IIlll;
   private int IlIII;
   private final lllIIlII IlIIl;
   private final IllIII<IlIIllIlI> IlIlI;

   @Override
   public void IIlIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 006: astore 2
      // 007: astore 1
      // 008: aload 0
      // 009: aload 2
      // 00a: invokevirtual k74/x/IIIIIIlII.IIIll (Lnet/minecraft/class_310;)Z
      // 00d: ifeq 01e
      // 010: aload 2
      // 011: invokestatic k74/x/lIIIllII.ll (Lnet/minecraft/class_310;)Z
      // 014: ifeq 023
      // 017: goto 01e
      // 01a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 01d: athrow
      // 01e: return
      // 01f: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 022: athrow
      // 023: aload 0
      // 024: aload 2
      // 025: invokevirtual k74/x/IIIIIIlII.lllI (Lnet/minecraft/class_310;)Z
      // 028: ifeq 030
      // 02b: return
      // 02c: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02f: athrow
      // 030: aload 0
      // 031: getfield k74/x/IIIIIIlII.IIll Lk74/x/lIlllII;
      // 034: ifnull 041
      // 037: aload 0
      // 038: aload 2
      // 039: invokevirtual k74/x/IIIIIIlII.lIlII (Lnet/minecraft/class_310;)V
      // 03c: return
      // 03d: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 040: athrow
      // 041: aload 0
      // 042: getfield k74/x/IIIIIIlII.IIIIl Z
      // 045: ifeq 10a
      // 048: aload 0
      // 049: getfield k74/x/IIIIIIlII.Il Lk74/x/IIIIlIl;
      // 04c: ifnull 064
      // 04f: goto 056
      // 052: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 055: athrow
      // 056: aload 0
      // 057: getfield k74/x/IIIIIIlII.IIIll Lk74/x/IlIIIllIl;
      // 05a: ifnonnull 06e
      // 05d: goto 064
      // 060: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 063: athrow
      // 064: aload 0
      // 065: bipush 0
      // 066: putfield k74/x/IIIIIIlII.IIIIl Z
      // 069: return
      // 06a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 06d: athrow
      // 06e: aload 0
      // 06f: aload 2
      // 070: aload 0
      // 071: getfield k74/x/IIIIIIlII.Il Lk74/x/IIIIlIl;
      // 074: invokevirtual k74/x/IIIIIIlII.Il (Lnet/minecraft/class_310;Lk74/x/IIIIlIl;)Z
      // 077: istore 3
      // 078: iload 3
      // 079: ifeq 084
      // 07c: fconst_0
      // 07d: goto 0a0
      // 080: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 083: athrow
      // 084: aload 0
      // 085: getfield k74/x/IIIIIIlII.I Lk74/x/IlIIIllll;
      // 088: aload 2
      // 089: aload 0
      // 08a: getfield k74/x/IIIIIIlII.Il Lk74/x/IIIIlIl;
      // 08d: invokevirtual k74/x/IIIIlIl.I ()Lnet/minecraft/class_243;
      // 090: aload 0
      // 091: getfield k74/x/IIIIIIlII.III Lk74/x/IIlIII;
      // 094: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 097: checkcast java/lang/Double
      // 09a: invokevirtual java/lang/Double.floatValue ()F
      // 09d: invokevirtual k74/x/IlIIIllll.llllII (Lnet/minecraft/class_310;Lnet/minecraft/class_243;F)F
      // 0a0: fstore 4
      // 0a2: invokestatic java/lang/System.currentTimeMillis ()J
      // 0a5: lstore 5
      // 0a7: iload 3
      // 0a8: ifne 0cf
      // 0ab: fload 4
      // 0ad: ldc 0.5
      // 0af: fcmpg
      // 0b0: ifle 0cf
      // 0b3: goto 0ba
      // 0b6: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b9: athrow
      // 0ba: lload 5
      // 0bc: aload 0
      // 0bd: getfield k74/x/IIIIIIlII.llll J
      // 0c0: lsub
      // 0c1: ldc2_w 1500
      // 0c4: lcmp
      // 0c5: iflt 109
      // 0c8: goto 0cf
      // 0cb: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ce: athrow
      // 0cf: aload 0
      // 0d0: bipush 0
      // 0d1: putfield k74/x/IIIIIIlII.IIIIl Z
      // 0d4: new k74/x/lIlllII
      // 0d7: dup
      // 0d8: aload 0
      // 0d9: getfield k74/x/IIIIIIlII.Il Lk74/x/IIIIlIl;
      // 0dc: aload 0
      // 0dd: getfield k74/x/IIIIIIlII.IIIll Lk74/x/IlIIIllIl;
      // 0e0: aload 0
      // 0e1: getfield k74/x/IIIIIIlII.IIlll I
      // 0e4: aload 0
      // 0e5: getfield k74/x/IIIIIIlII.IIIlI I
      // 0e8: aload 0
      // 0e9: getfield k74/x/IIIIIIlII.lll Z
      // 0ec: bipush 0
      // 0ed: invokespecial k74/x/lIlllII.<init> (Lk74/x/IIIIlIl;Lk74/x/IlIIIllIl;IIZI)V
      // 0f0: astore 7
      // 0f2: aload 0
      // 0f3: aload 2
      // 0f4: aload 7
      // 0f6: invokevirtual k74/x/IIIIIIlII.l (Lnet/minecraft/class_310;Lk74/x/lIlllII;)Z
      // 0f9: ifne 109
      // 0fc: aload 0
      // 0fd: aload 7
      // 0ff: putfield k74/x/IIIIIIlII.IIll Lk74/x/lIlllII;
      // 102: goto 109
      // 105: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 108: athrow
      // 109: return
      // 10a: aload 0
      // 10b: aload 2
      // 10c: invokevirtual k74/x/IIIIIIlII.llIll (Lnet/minecraft/class_310;)V
      // 10f: aload 0
      // 110: aload 2
      // 111: invokevirtual k74/x/IIIIIIlII.lIlIl (Lnet/minecraft/class_310;)V
      // 114: aload 0
      // 115: aload 2
      // 116: invokevirtual k74/x/IIIIIIlII.Illll (Lnet/minecraft/class_310;)V
      // 119: aload 0
      // 11a: getfield k74/x/IIIIIIlII.Illl I
      // 11d: iflt 125
      // 120: return
      // 121: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 124: athrow
      // 125: aload 0
      // 126: aload 2
      // 127: invokevirtual k74/x/IIIIIIlII.IIIII (Lnet/minecraft/class_310;)Lk74/x/IIIlIlII;
      // 12a: astore 3
      // 12b: aload 3
      // 12c: ifnonnull 134
      // 12f: return
      // 130: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 133: athrow
      // 134: aload 3
      // 135: invokevirtual k74/x/IIIlIlII.II ()Lk74/x/IIIIlIl;
      // 138: astore 4
      // 13a: aload 3
      // 13b: invokevirtual k74/x/IIIlIlII.Il ()I
      // 13e: istore 5
      // 140: aload 2
      // 141: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 144: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 147: invokestatic k74/x/IIll.IIlII (Lnet/minecraft/class_1661;)I
      // 14a: istore 6
      // 14c: aload 0
      // 14d: aload 2
      // 14e: iload 5
      // 150: invokevirtual k74/x/IIIIIIlII.llII (Lnet/minecraft/class_310;I)Z
      // 153: ifne 15b
      // 156: return
      // 157: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15a: athrow
      // 15b: invokestatic java/lang/System.currentTimeMillis ()J
      // 15e: lstore 7
      // 160: aload 0
      // 161: getfield k74/x/IIIIIIlII.lI I
      // 164: iload 5
      // 166: if_icmpne 17f
      // 169: lload 7
      // 16b: aload 0
      // 16c: getfield k74/x/IIIIIIlII.IIllI J
      // 16f: lcmp
      // 170: ifge 17f
      // 173: goto 17a
      // 176: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 179: athrow
      // 17a: return
      // 17b: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17e: athrow
      // 17f: aload 0
      // 180: aload 2
      // 181: iload 5
      // 183: aload 3
      // 184: invokevirtual k74/x/IIIlIlII.l ()Lk74/x/IlIIIllIl;
      // 187: invokevirtual k74/x/IIIIIIlII.llIIl (Lnet/minecraft/class_310;ILk74/x/IlIIIllIl;)Z
      // 18a: ifeq 19b
      // 18d: aload 2
      // 18e: invokestatic k74/x/IIll.IllIl (Lnet/minecraft/class_310;)I
      // 191: ifle 1a0
      // 194: goto 19b
      // 197: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 19a: athrow
      // 19b: return
      // 19c: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: getfield k74/x/IIIIIIlII.IlIlI Lk74/x/IllIII;
      // 1a4: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 1a7: getstatic k74/x/IlIIllIlI.I Lk74/x/IlIIllIlI;
      // 1aa: if_acmpne 1e6
      // 1ad: aload 0
      // 1ae: aload 4
      // 1b0: putfield k74/x/IIIIIIlII.Il Lk74/x/IIIIlIl;
      // 1b3: aload 0
      // 1b4: aload 3
      // 1b5: invokevirtual k74/x/IIIlIlII.l ()Lk74/x/IlIIIllIl;
      // 1b8: putfield k74/x/IIIIIIlII.IIIll Lk74/x/IlIIIllIl;
      // 1bb: aload 0
      // 1bc: aload 3
      // 1bd: invokevirtual k74/x/IIIlIlII.I ()Z
      // 1c0: putfield k74/x/IIIIIIlII.lll Z
      // 1c3: aload 0
      // 1c4: iload 6
      // 1c6: putfield k74/x/IIIIIIlII.IIlll I
      // 1c9: aload 0
      // 1ca: iload 5
      // 1cc: putfield k74/x/IIIIIIlII.IIIlI I
      // 1cf: aload 0
      // 1d0: bipush 1
      // 1d1: putfield k74/x/IIIIIIlII.IIIIl Z
      // 1d4: aload 0
      // 1d5: invokestatic java/lang/System.currentTimeMillis ()J
      // 1d8: putfield k74/x/IIIIIIlII.llll J
      // 1db: aload 1
      // 1dc: ifnull 215
      // 1df: goto 1e6
      // 1e2: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e5: athrow
      // 1e6: new k74/x/lIlllII
      // 1e9: dup
      // 1ea: aload 4
      // 1ec: aload 3
      // 1ed: invokevirtual k74/x/IIIlIlII.l ()Lk74/x/IlIIIllIl;
      // 1f0: iload 6
      // 1f2: iload 5
      // 1f4: aload 3
      // 1f5: invokevirtual k74/x/IIIlIlII.I ()Z
      // 1f8: bipush 0
      // 1f9: invokespecial k74/x/lIlllII.<init> (Lk74/x/IIIIlIl;Lk74/x/IlIIIllIl;IIZI)V
      // 1fc: astore 9
      // 1fe: aload 0
      // 1ff: aload 2
      // 200: aload 9
      // 202: invokevirtual k74/x/IIIIIIlII.l (Lnet/minecraft/class_310;Lk74/x/lIlllII;)Z
      // 205: ifne 215
      // 208: aload 0
      // 209: aload 9
      // 20b: putfield k74/x/IIIIIIlII.IIll Lk74/x/lIlllII;
      // 20e: goto 215
      // 211: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 214: athrow
      // 215: return
   }

   private void I(class_310 param1) {
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
      // 05: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 08: ifnonnull 17
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: return
      // 13: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: aload 1
      // 18: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 1b: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 1e: bipush 0
      // 1f: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 22: aload 1
      // 23: bipush 4
      // 24: invokestatic k74/x/IIlllIllI.IlII (Lnet/minecraft/class_310;I)V
      // 27: return
   }

   private boolean II(class_310 var1, long var2, lIlllII var4) {
      return this.llIII(var1, var2, var4);
   }

   private boolean Il(class_310 var1, IIIIlIl var2) {
      return IlllIlII.IIlIlI(var1, this.IIl(var2));
   }

   private int lI(lIlllIl var1) {
      long var2 = this.Ill(var1);
      return (int)Math.max(0L, (var2 + 25L) / 50L);
   }

   public void ll(class_310 param1, class_1268 param2, class_3965 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IIIIIIlII.lIII ()V
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual k74/x/IIIIIIlII.IIIll (Lnet/minecraft/class_310;)Z
      // 09: ifeq 22
      // 0c: aload 2
      // 0d: ifnull 22
      // 10: goto 17
      // 13: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: aload 3
      // 18: ifnonnull 27
      // 1b: goto 22
      // 1e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21: athrow
      // 22: return
      // 23: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: aload 0
      // 28: aload 1
      // 29: invokevirtual k74/x/IIIIIIlII.llIll (Lnet/minecraft/class_310;)V
      // 2c: aload 1
      // 2d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 30: aload 2
      // 31: invokevirtual net/minecraft/class_746.method_5998 (Lnet/minecraft/class_1268;)Lnet/minecraft/class_1799;
      // 34: astore 4
      // 36: aload 4
      // 38: ifnull 5f
      // 3b: aload 4
      // 3d: getstatic net/minecraft/class_1802.field_8705 Lnet/minecraft/class_1792;
      // 40: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 43: ifne 64
      // 46: goto 4d
      // 49: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4c: athrow
      // 4d: aload 4
      // 4f: getstatic net/minecraft/class_1802.field_8187 Lnet/minecraft/class_1792;
      // 52: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 55: ifne 64
      // 58: goto 5f
      // 5b: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5e: athrow
      // 5f: return
      // 60: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 63: athrow
      // 64: aload 3
      // 65: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 68: astore 5
      // 6a: aload 1
      // 6b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 6e: aload 5
      // 70: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 73: astore 6
      // 75: aload 6
      // 77: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 7a: ifeq 86
      // 7d: aload 5
      // 7f: goto 8f
      // 82: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 85: athrow
      // 86: aload 5
      // 88: aload 3
      // 89: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 8c: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 8f: astore 7
      // 91: aload 0
      // 92: aload 7
      // 94: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 97: putfield k74/x/IIIIIIlII.IIlI Lnet/minecraft/class_2338;
      // 9a: aload 0
      // 9b: aload 2
      // 9c: putfield k74/x/IIIIIIlII.IlI Lnet/minecraft/class_1268;
      // 9f: aload 0
      // a0: aload 1
      // a1: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a4: getfield net/minecraft/class_746.field_6012 I
      // a7: putfield k74/x/IIIIIIlII.llI I
      // aa: return
   }

   private lIlllII III(class_310 param1, lIlllII param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 32
      // 04: aload 2
      // 05: invokevirtual k74/x/lIlllII.Il ()Z
      // 08: ifeq 32
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 2
      // 13: invokevirtual k74/x/lIlllII.III ()Lk74/x/IlIIIllIl;
      // 16: getstatic k74/x/IlIIIllIl.I Lk74/x/IlIIIllIl;
      // 19: if_acmpne 32
      // 1c: goto 23
      // 1f: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: aload 0
      // 24: aload 1
      // 25: invokevirtual k74/x/IIIIIIlII.IIIll (Lnet/minecraft/class_310;)Z
      // 28: ifne 38
      // 2b: goto 32
      // 2e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 31: athrow
      // 32: aconst_null
      // 33: areturn
      // 34: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 37: athrow
      // 38: aload 0
      // 39: aload 1
      // 3a: invokevirtual k74/x/IIIIIIlII.Illl (Lnet/minecraft/class_310;)I
      // 3d: istore 3
      // 3e: iload 3
      // 3f: ifge 48
      // 42: aconst_null
      // 43: areturn
      // 44: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 47: athrow
      // 48: aload 2
      // 49: invokevirtual k74/x/lIlllII.lI ()Lk74/x/IIIIlIl;
      // 4c: astore 4
      // 4e: aload 0
      // 4f: aload 1
      // 50: aload 4
      // 52: invokevirtual k74/x/IIIIlIl.Il ()Lnet/minecraft/class_2338;
      // 55: aload 4
      // 57: invokevirtual k74/x/IIIIlIl.III ()D
      // 5a: invokevirtual k74/x/IIIIIIlII.IIll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;D)Lk74/x/IIIIlIl;
      // 5d: astore 5
      // 5f: aload 5
      // 61: ifnonnull 6a
      // 64: aconst_null
      // 65: areturn
      // 66: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 69: athrow
      // 6a: new k74/x/lIlllII
      // 6d: dup
      // 6e: aload 5
      // 70: getstatic k74/x/IlIIIllIl.II Lk74/x/IlIIIllIl;
      // 73: aload 2
      // 74: invokevirtual k74/x/lIlllII.II ()I
      // 77: iload 3
      // 78: bipush 0
      // 79: bipush 0
      // 7a: invokespecial k74/x/lIlllII.<init> (Lk74/x/IIIIlIl;Lk74/x/IlIIIllIl;IIZI)V
      // 7d: areturn
   }

   private class_3965 IIl(IIIIlIl param1) {
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
      // 05: invokevirtual k74/x/IIIIlIl.ll ()Lnet/minecraft/class_2338;
      // 08: ifnull 20
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: invokevirtual k74/x/IIIIlIl.II ()Lnet/minecraft/class_2350;
      // 16: ifnonnull 28
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aconst_null
      // 21: goto 3c
      // 24: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 27: athrow
      // 28: new net/minecraft/class_3965
      // 2b: dup
      // 2c: aload 1
      // 2d: invokevirtual k74/x/IIIIlIl.I ()Lnet/minecraft/class_243;
      // 30: aload 1
      // 31: invokevirtual k74/x/IIIIlIl.II ()Lnet/minecraft/class_2350;
      // 34: aload 1
      // 35: invokevirtual k74/x/IIIIlIl.ll ()Lnet/minecraft/class_2338;
      // 38: bipush 0
      // 39: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
      // 3c: areturn
   }

   private long Ill(lIlllIl var1) {
      try {
         if (var1 == null) {
            return 0L;
         }
      } catch (MatchException var7) {
         throw IIIl(var7);
      }

      double var2 = var1.IIlI();
      double var4 = var1.IlI();

      try {
         if (var2 >= var4) {
            return Math.round(var2);
         }
      } catch (MatchException var6) {
         throw IIIl(var6);
      }

      return Math.round(ThreadLocalRandom.current().nextDouble(var2, var4));
   }

   private void lII(class_310 param1, int param2) {
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
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: iload 2
      // 13: iflt 35
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: iload 2
      // 1e: ldc_w -876739418
      // 21: ldc_w 182706294
      // 24: ldc_w -1387348207
      // 27: ixor
      // 28: invokestatic k74/x/IIIIIIlII.llllI (II)I
      // 2b: if_icmplt 3a
      // 2e: goto 35
      // 31: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 34: athrow
      // 35: return
      // 36: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 39: athrow
      // 3a: aload 1
      // 3b: aload 0
      // 3c: getstatic k74/x/lllIII.II Lk74/x/lllIII;
      // 3f: invokestatic k74/x/IIll.lllIl (Lnet/minecraft/class_310;Ljava/lang/Object;Lk74/x/lllIII;)V
      // 42: aload 1
      // 43: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 46: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 49: invokestatic k74/x/IIll.IIlII (Lnet/minecraft/class_1661;)I
      // 4c: istore 3
      // 4d: iload 3
      // 4e: iload 2
      // 4f: if_icmpne 57
      // 52: return
      // 53: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 56: athrow
      // 57: aload 1
      // 58: aload 0
      // 59: iload 2
      // 5a: bipush 0
      // 5b: bipush 1
      // 5c: invokestatic k74/x/IIll.llII (Lnet/minecraft/class_310;Ljava/lang/Object;IIZ)Lk74/x/IIlIlIII;
      // 5f: pop
      // 60: return
   }

   private boolean lIl(class_310 param1, lIlllII param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 12
      // 04: aload 2
      // 05: invokevirtual k74/x/lIlllII.lI ()Lk74/x/IIIIlIl;
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: aload 2
      // 1b: invokevirtual k74/x/lIlllII.l ()I
      // 1e: aload 2
      // 1f: invokevirtual k74/x/lIlllII.III ()Lk74/x/IlIIIllIl;
      // 22: invokevirtual k74/x/IIIIIIlII.lIll (Lnet/minecraft/class_310;ILk74/x/IlIIIllIl;)Z
      // 25: ifne 2e
      // 28: bipush 0
      // 29: ireturn
      // 2a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: aload 1
      // 2f: invokestatic k74/x/IIll.lIIlI (Lnet/minecraft/class_310;)I
      // 32: aload 2
      // 33: invokevirtual k74/x/lIlllII.l ()I
      // 36: if_icmpne 44
      // 39: aload 0
      // 3a: aload 1
      // 3b: aload 2
      // 3c: invokevirtual k74/x/IIIIIIlII.lIlll (Lnet/minecraft/class_310;Lk74/x/lIlllII;)Z
      // 3f: ireturn
      // 40: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 43: athrow
      // 44: aload 1
      // 45: aload 0
      // 46: aload 2
      // 47: invokevirtual k74/x/lIlllII.l ()I
      // 4a: aload 0
      // 4b: aload 1
      // 4c: aload 2
      // 4d: invokedynamic getAsBoolean (Lk74/x/IIIIIIlII;Lnet/minecraft/class_310;Lk74/x/lIlllII;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIIIIlII.IIIIl (Lnet/minecraft/class_310;Lk74/x/lIlllII;)Z, ()Z ]
      // 52: invokestatic k74/x/IIll.lllIII (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // 55: ireturn
   }

   private boolean llI(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 12
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 1
      // 19: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1c: aload 2
      // 1d: invokevirtual net/minecraft/class_638.method_8316 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3610;
      // 20: astore 3
      // 21: aload 3
      // 22: ifnull 3b
      // 25: aload 3
      // 26: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 29: ifne 3b
      // 2c: goto 33
      // 2f: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 32: athrow
      // 33: bipush 1
      // 34: goto 3c
      // 37: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a: athrow
      // 3b: bipush 0
      // 3c: ireturn
   }

   private class_243 lll(class_243 param1, class_2350 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 0f
      // 04: aload 2
      // 05: ifnonnull 15
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: aload 1
      // 10: areturn
      // 11: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: aload 1
      // 16: aload 2
      // 17: invokevirtual net/minecraft/class_2350.method_10148 ()I
      // 1a: i2d
      // 1b: ldc2_w 0.01
      // 1e: dmul
      // 1f: aload 2
      // 20: invokevirtual net/minecraft/class_2350.method_10164 ()I
      // 23: i2d
      // 24: ldc2_w 0.01
      // 27: dmul
      // 28: aload 2
      // 29: invokevirtual net/minecraft/class_2350.method_10165 ()I
      // 2c: i2d
      // 2d: ldc2_w 0.01
      // 30: dmul
      // 31: invokevirtual net/minecraft/class_243.method_1023 (DDD)Lnet/minecraft/class_243;
      // 34: areturn
   }

   private boolean IIII(class_310 param1, IIIIlIl param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: invokevirtual k74/x/IIIIIIlII.IIIll (Lnet/minecraft/class_310;)Z
      // 005: ifeq 0c3
      // 008: aload 2
      // 009: ifnull 0c3
      // 00c: goto 013
      // 00f: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 012: athrow
      // 013: aload 2
      // 014: invokevirtual k74/x/IIIIlIl.ll ()Lnet/minecraft/class_2338;
      // 017: ifnull 0c3
      // 01a: goto 021
      // 01d: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 020: athrow
      // 021: aload 2
      // 022: invokevirtual k74/x/IIIIlIl.II ()Lnet/minecraft/class_2350;
      // 025: ifnull 0c3
      // 028: goto 02f
      // 02b: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02e: athrow
      // 02f: aload 2
      // 030: invokevirtual k74/x/IIIIlIl.lI ()Lnet/minecraft/class_243;
      // 033: ifnull 0c3
      // 036: goto 03d
      // 039: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03c: athrow
      // 03d: aload 2
      // 03e: invokevirtual k74/x/IIIIlIl.I ()Lnet/minecraft/class_243;
      // 041: ifnull 0c3
      // 044: goto 04b
      // 047: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 04a: athrow
      // 04b: aload 2
      // 04c: invokevirtual k74/x/IIIIlIl.ll ()Lnet/minecraft/class_2338;
      // 04f: aload 2
      // 050: invokevirtual k74/x/IIIIlIl.II ()Lnet/minecraft/class_2350;
      // 053: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 056: aload 2
      // 057: invokevirtual k74/x/IIIIlIl.Il ()Lnet/minecraft/class_2338;
      // 05a: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 05d: ifeq 0c3
      // 060: goto 067
      // 063: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 066: athrow
      // 067: aload 0
      // 068: aload 1
      // 069: aload 2
      // 06a: invokevirtual k74/x/IIIIlIl.Il ()Lnet/minecraft/class_2338;
      // 06d: invokevirtual k74/x/IIIIIIlII.IIllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 070: ifeq 0c3
      // 073: goto 07a
      // 076: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 079: athrow
      // 07a: aload 1
      // 07b: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 07e: aload 2
      // 07f: invokevirtual k74/x/IIIIlIl.Il ()Lnet/minecraft/class_2338;
      // 082: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 085: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 088: ifeq 0c3
      // 08b: goto 092
      // 08e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 091: athrow
      // 092: aload 0
      // 093: aload 1
      // 094: aload 2
      // 095: invokevirtual k74/x/IIIIlIl.ll ()Lnet/minecraft/class_2338;
      // 098: aload 1
      // 099: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 09c: aload 2
      // 09d: invokevirtual k74/x/IIIIlIl.ll ()Lnet/minecraft/class_2338;
      // 0a0: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0a3: invokevirtual k74/x/IIIIIIlII.IIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_2680;)Z
      // 0a6: ifeq 0c3
      // 0a9: goto 0b0
      // 0ac: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0af: athrow
      // 0b0: aload 0
      // 0b1: aload 1
      // 0b2: aload 2
      // 0b3: invokevirtual k74/x/IIIIlIl.Il ()Lnet/minecraft/class_2338;
      // 0b6: invokevirtual k74/x/IIIIIIlII.lIIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 0b9: ifeq 0c9
      // 0bc: goto 0c3
      // 0bf: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c2: athrow
      // 0c3: bipush 0
      // 0c4: ireturn
      // 0c5: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c8: athrow
      // 0c9: ldc2_w 20.25
      // 0cc: invokestatic java/lang/Math.sqrt (D)D
      // 0cf: aload 1
      // 0d0: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0d3: invokevirtual net/minecraft/class_746.method_55754 ()D
      // 0d6: invokestatic java/lang/Math.min (DD)D
      // 0d9: dstore 3
      // 0da: aload 1
      // 0db: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0de: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 0e1: aload 2
      // 0e2: invokevirtual k74/x/IIIIlIl.I ()Lnet/minecraft/class_243;
      // 0e5: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 0e8: dload 3
      // 0e9: dload 3
      // 0ea: dmul
      // 0eb: dcmpl
      // 0ec: ifle 0f5
      // 0ef: bipush 0
      // 0f0: ireturn
      // 0f1: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f4: athrow
      // 0f5: aload 1
      // 0f6: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0f9: new net/minecraft/class_3959
      // 0fc: dup
      // 0fd: aload 1
      // 0fe: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 101: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 104: aload 2
      // 105: invokevirtual k74/x/IIIIlIl.lI ()Lnet/minecraft/class_243;
      // 108: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
      // 10b: getstatic net/minecraft/class_3959$class_242.field_1348 Lnet/minecraft/class_3959$class_242;
      // 10e: aload 1
      // 10f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 112: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 115: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 118: astore 5
      // 11a: aload 5
      // 11c: aload 2
      // 11d: invokevirtual k74/x/IIIIlIl.ll ()Lnet/minecraft/class_2338;
      // 120: aload 2
      // 121: invokevirtual k74/x/IIIIlIl.II ()Lnet/minecraft/class_2350;
      // 124: invokestatic k74/x/IIIIIIlII.IllI (Lnet/minecraft/class_3965;Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z
      // 127: ireturn
   }

   private static MatchException IIIl(MatchException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1467588939;
      String var14 = "ּԊֽֆ\u05fcԨըׇ֝վՄؠԱிԳڐ\u05cfشբլל՝תק۞ஸԈ۟ԫ\u0b8dք׳ժۖօՠղןەךזؿۧձۿڧ׳ஃ֖ل\u0530ո֕խۼֱԽڠٶٌԆխ۩ա،\u0b8c՜גۼ׆ՖழڨٙլڳԪஈՊִՙԧظօּԉଐԟԪկսٚ՚ڔ֕קଝԘՠ۔\u05f8טבקՅԊՂ֬Ծ֮ଗۧ\u0558ٔ։כՒ՞ԓزՎԮՐմՅפԂԖաչ֑عԁְ֧ׅ֥իۦնՀՁஊ׆ଧٖԽՌ\u0bbbשամ֥ۛٻ\u05cdՌ֡ԆۭԧծգԔ챈첐챹챎쳚쳺첺찍찋춰챙찢췙촎\uda16첀쳛찀챐쳩찷췦첔챺찱첡챂첆찓챯쳀쳎챝";
      char[] var15 = "¤!".toCharArray();
      short var13 = 31876;
      String[] var10000 = new String[var15.length];
      byte var20 = -1;
      String[] var16 = var10000;

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            IllII = var16;
            IllIl = new Object[var16.length];
            int var9 = 1495142207;
            byte[] var7 = "ÊòªÒä¥\u001dW\u001d%Á\u001eGÞ;dN\u000e¶Ï\b\"\u00ad1À´\u009b<åV9\u0088IúàÓô(»\u0010Óõ\u0006\u009fÿ\u009aub[l\u0005w$zBå\u0099 G]{-Ù2UÄkt^\u0089Á\u000eK@|F\u0095xÂ§û*ÒB\u00ad_Åi\"ü]¥`=}5?Ý¥Ð<ë¨@â;ÿ·P÷\tÜ\u009aâ|´\u0097\u0018Î$Ã[\u009e¤*#6/r\u000eüöUZûXS\u0004¸\u0096\u001f\u0000,Çaæ\u008a0¦ùJI%LëzñÐ\u009c\u00adeën/à\u008b<\u0090\u0006.\bd*ñúä\u001fÑÊ£\u0001¦½\u000e\u001ea\u0003K¸j_N\u00879@goòÐÁ\u00ad%þÑ%¨ZÅ!\u000b\u0087³$\u001aLc×Ð±GJã\u0002Ö\u0093\u0015ã1[\u008eÐR\u0093ïZ\u0018U7O÷g¤Gç\"ë©Ë6ådZ¬xÇv\u008bxvY\u0091\u00911)«ò¸\u0092\u0006I±a¦\u008a©\u0001\u0007v4\u0099\u0018W@\u001e\u0093^J-\u0005Ãó}°ö3k\u0004U\u0092_g~ì«(~ÓK!\u007fÍ\u001dY\u00adç\\Öû!o:Å&\u001cY7PP£¾°¤kÊºð¸\u00897W \u0005\u001cY\u0096\tx@è+mÊ\u0014«\u0099\u001dJ\u001bh\u0085¤ÇÑSOí\u0099\u008bÝXâð\u00ad\u008b|\nÂ\u00196\u0091\u00ad\u0082\u0019K\u0004(åh®9\u001e\u001e \u0005k\u0082\u0019Ú¥áA>ç\\¡iH\u0090*wI»æ\u0089j%½v}Ê\u0017\u0082ÓèNT1³}³z³µ\u0087þ\u0087§]\u0085\u0080\u000f\u009fLßÜ=+/»Gr/,)iEo\u0099\u0095¹ãå\u001a\u0003È_Ë\u0003ô\u0019\u007f\u008d¿©ûVomP\u0096\"uU+Õ\u008bä\u008a>©°¬^þaèÒÊÂ*WuÌOuÙ\u0013\b5éCÝ\u009b?x\u007fÝø\u008c²háÔT&ãUÿe¹#sã\u0004B\u008fK¬&ã$sYäV»÷F¦\u0014UdæB\u0083\u0092\u0017vßkXº\u008d\u001b¢üKª0<P\u007fübÜä\u0095\u009c\u0093OO\u0086\u00ad¸\u000fxÛçéh \u0086\u008a\u0090¹^<ñ\u008f`\u0011Â\u007fC³ò\u0089QuZD_ìù¨\u0011\u0096y\u0004E\u001c\u009a\u0099Kq¥0Û¿\u0001Lhúx\u001fí\u0006õý3\u0099¥x\u0086ô´Õ²h<]\u0017½\u0095`~¼ûýj\u008e\"Åi(\u001aXS\u0095\u0097ï\nJ82l»R.õÄR«~\u000f\u00114çøY)½6)¾\u00ad\u008d¿T´\rqIívô\u0097çÌ@\u0004_¼Q\u0095\u0007Yc3\u0096ùáPE0)S\r@Á=}Sø\u0018qtd¸ð·\u009a\u008d½\u0083©å[id³½>\u0004µ\u009d¯Å¦\u0007&\u001d\u0088\u008bTOÖÕÐQ\\\u0082ºWæâ\u000fE=\u008bÊfßcçmüR\u0016Ù3¶%B(`A\u0017Y#Ôo\u009eH\u00ad\u0091'9\fåÞNÞXã\u008cÞç\":\u009cÃ\u0090ð£p\u0080Ò\u0085ºÕð)!¾¬\u0015Gv´¡\u0092H\u001fÔhF\u0004äêw\u008f[x\u0018¿¬×ÿÑ\u009b^@\u0018e5Ë\u0013Z(ìF\u009aá\u007f?îº{\u001f\u0002eÙð8hë\u0082\u0016]ÒæÕ\f-È#Õ\n±\u0093µã¥QqÿJ\tm\u001f8õG{ý\u0001\\¦\u008b\u0000\u0084Ï&\u0098\u00898z_²àäãô6ló\t]×\u008dß?ÒôÛ\u001d\t-\u0014«êäò\u0000kø\u0015u\u009b\u0002Z2H\u0000`S\u001fS,Ø\u001e\f9ÊÓ|\u0004 «\u0096Ü\u0003 \u000b\u008c/\t]U÷\u001dÜ\u0013Úë¦°?ëü\u001ejW~¥\u0083\u000fVH\u0081ÕÒìszo\u00864TøxDþ\u0012ý÷AN_\u00ad,»9\u0090öC\u000fR\u0097\u0090BË\u0004®ÿü\u0089\u0005\u0092ö\u009aÙ¡«úf\u009e{ÈÊ\u001a\u0080µC-\u0019¸Áû¹Åø\u0015\u009a\u0007ñ\u000fºè\u009cßùbÍN\u00adMé÷¢ÿ9jÍ÷ä\u009büé.ö\u0088øn£iãs\u009f\u0092íÎ\u0011Î4ëË\u0097V\u0092\\\u008céÈò'ju¬\u0013Æª+bìJì\u008a?0ü¨EÚÿ\u001f\u0007ÜBÅ÷\u008e|@á«\u0087ðQi\u0080\u0001Ç`\u0019\u0005\u008b²\u008f©×½\nÁRÑ\u0099,\u0081¤éú¨rÿ\t\u0094ÔÇ_\u007fÉ´Èì°,ÊÌE|]½zÑaÎq<\u0015\u0088°°~´xQîK"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            IlIll = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               IlIll[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var5 = new String[llllI(-876739410, var24 ^ -1943843903)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lllll('㯱', var24 ^ 1589473530, 3016)).length();
            int var1 = llllI(-876739409, var24 ^ 837882034);
            int var26 = -1;

            label98:
            while (true) {
               int var30 = 2;
               String var10001 = var2.substring(++var26, var26 + var1);
               byte var10002 = -1;

               while (true) {
                  label93: {
                     char[] var46 = var10001.toCharArray();
                     int var10004 = var46.length;
                     int var6 = 0;
                     int var49 = var30;
                     var42 = var46;
                     int var36 = var10004;
                     char[] var58;
                     int var10006;
                     if (var10004 <= 1) {
                        var58 = var46;
                        var10004 = var30;
                        var10006 = var6;
                     } else {
                        var49 = var30;
                        var36 = var10004;
                        if (var10004 <= var6) {
                           break label93;
                        }

                        var58 = var46;
                        var10004 = var30;
                        var10006 = var6;
                     }

                     while (true) {
                        var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % llllI(-876739413, var24 ^ -509351442)) {
                           case 0 -> 1;
                           case 1 -> llllI(-876739416, var24 ^ 1559882823);
                           case 2 -> llllI(-876739415, var24 ^ -1091276227);
                           case 3 -> llllI(-876739402, var24 ^ -1877098438);
                           case 4 -> llllI(-876739401, var24 ^ -1689228708);
                           case 5 -> llllI(-876739404, var24 ^ -1902520567);
                           default -> llllI(-876739403, var24 ^ 1352755461);
                        });
                        var6++;
                        if (var49 == 0) {
                           var10006 = var49;
                           var58 = var42;
                           var10004 = var49;
                        } else {
                           if (var36 <= var6) {
                              break;
                           }

                           var58 = var42;
                           var10004 = var49;
                           var10006 = var6;
                        }
                     }
                  }

                  String var51 = new String(var42).intern();
                  switch (var10002) {
                     case 0:
                        var5[var3++] = var51;
                        if ((var26 += var1) >= var4) {
                           IIlIl = var5;
                           lIIl = new String[llllI(-876739414, var24 ^ -1632260511)];
                           ll = new class_2350[]{
                              class_2350.field_11033, class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034
                           };
                           return;
                        }

                        var1 = var2.charAt(var26);
                        break;
                     default:
                        var5[var3++] = var51;
                        if ((var26 += var1) < var4) {
                           var1 = var2.charAt(var26);
                           continue label98;
                        }

                        var4 = (var2 = lllll('씷', var24 ^ -383711315, 3017)).length();
                        var1 = llllI(-876739412, var24 ^ 372026762);
                        var26 = -1;
                  }

                  var30 = llllI(-876739411, var24 ^ 977526499);
                  var10001 = var2.substring(++var26, var26 + var1);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 121;
                  case 1 -> 222;
                  case 2 -> 115;
                  case 3 -> 55;
                  case 4 -> 234;
                  case 5 -> 211;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private boolean IIlI(class_310 param1, class_2338 param2, class_2680 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 2b
      // 04: aload 3
      // 05: ifnull 2b
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: aload 3
      // 10: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 13: ifne 2b
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: aload 3
      // 1e: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 21: ifeq 31
      // 24: goto 2b
      // 27: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
      // 2d: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: aload 3
      // 32: aload 1
      // 33: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 36: aload 2
      // 37: invokevirtual net/minecraft/class_2680.method_26212 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Z
      // 3a: ifeq 6c
      // 3d: aload 3
      // 3e: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 41: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 44: ifeq 6c
      // 47: goto 4e
      // 4a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4d: athrow
      // 4e: aload 3
      // 4f: aload 1
      // 50: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 53: aload 2
      // 54: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 57: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 5a: ifne 6c
      // 5d: goto 64
      // 60: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 63: athrow
      // 64: bipush 1
      // 65: goto 6d
      // 68: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6b: athrow
      // 6c: bipush 0
      // 6d: ireturn
   }

   private static int llllI(int var0, int var1) {
      int var2 = IlIll[var0 ^ -876739418] ^ var1 ^ var0;
      var2 -= 24357;
      var2 += 40255;
      var2 -= 35970;
      var2 -= 57354;
      var2 += 58056;
      var2 ^= 11924;
      var2 -= 19091;
      return var2 + 44678;
   }

   private static String lllll(char var0, int var1, int var2) {
      int var3 = var2 ^ 3016;
      char[] var4 = IllII[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IllIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IllIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 17657;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 21088;
         var10 += 61944;
         var10 ^= 33987;
         var10 += 37516;
         var10 += 38987;
         var10 -= 44878;
         var10 += 18058;
         var10 ^= 557;
         var10 ^= 40269;
         var10 += 44682;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private IIIIlIl IIll(class_310 var1, class_2338 var2, double var3) {
      try {
         if (this.lIIIl(var1, var2)) {
            return null;
         }
      } catch (MatchException var17) {
         throw IIIl(var17);
      }

      for (class_2350 var8 : ll) {
         class_2338 var9 = var2.method_10093(var8);
         class_2680 var10 = var1.field_1687.method_8320(var9);

         try {
            if (!this.IIlI(var1, var9, var10)) {
               continue;
            }
         } catch (MatchException var16) {
            throw IIIl(var16);
         }

         class_2350 var11 = var8.method_10153();
         class_243 var12 = class_243.method_24953(var9).method_1031(var11.method_10148() * 0.5, var11.method_10164() * 0.5, var11.method_10165() * 0.5);
         class_243 var13 = this.lll(var12, var11);
         IIIIlIl var14 = new IIIIlIl(var2.method_10062(), var12, var9.method_10062(), var11, var13, var3);

         try {
            if (this.IIII(var1, var14)) {
               return var14;
            }
         } catch (MatchException var15) {
            throw IIIl(var15);
         }
      }

      return null;
   }

   private void IlII(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIIIIlII.IlIIl Lk74/x/lllIIlII;
      // 04: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 07: checkcast java/lang/Boolean
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: ifeq 4c
      // 10: aload 1
      // 11: ifnull 4c
      // 14: goto 1b
      // 17: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a: athrow
      // 1b: aload 1
      // 1c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1f: ifnull 4c
      // 22: goto 29
      // 25: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: iload 2
      // 2a: iflt 4c
      // 2d: goto 34
      // 30: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 33: athrow
      // 34: iload 2
      // 35: ldc_w -876739417
      // 38: ldc_w 36569453
      // 3b: ldc_w -1948980850
      // 3e: ixor
      // 3f: invokestatic k74/x/IIIIIIlII.llllI (II)I
      // 42: if_icmplt 5b
      // 45: goto 4c
      // 48: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: bipush -1
      // 4e: putfield k74/x/IIIIIIlII.Illl I
      // 51: aload 0
      // 52: bipush 0
      // 53: putfield k74/x/IIIIIIlII.IlIII I
      // 56: return
      // 57: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5a: athrow
      // 5b: aload 0
      // 5c: iload 2
      // 5d: putfield k74/x/IIIIIIlII.Illl I
      // 60: aload 0
      // 61: aload 1
      // 62: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 65: getfield net/minecraft/class_746.field_6012 I
      // 68: bipush 1
      // 69: iadd
      // 6a: putfield k74/x/IIIIIIlII.IlIII I
      // 6d: return
   }

   private boolean IlIl() {
      try {
         if (this.IlIlI.IllI() == IlIIllIlI.I) {
            return true;
         }
      } catch (MatchException var1) {
         throw IIIl(var1);
      }

      return false;
   }

   static boolean IllI(class_3965 param0, class_2338 param1, class_2350 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 3e
      // 04: aload 0
      // 05: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 08: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 0b: if_acmpne 3e
      // 0e: goto 15
      // 11: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: aload 0
      // 16: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 19: aload 1
      // 1a: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 1d: ifeq 3e
      // 20: goto 27
      // 23: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: aload 0
      // 28: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 2b: aload 2
      // 2c: if_acmpne 3e
      // 2f: goto 36
      // 32: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3f
      // 3a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: ireturn
   }

   private int Illl(class_310 param1) {
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
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnonnull 26
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: bipush -1
      // 21: ireturn
      // 22: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 25: athrow
      // 26: bipush 0
      // 27: istore 2
      // 28: iload 2
      // 29: ldc_w -876739420
      // 2c: ldc_w -808254220
      // 2f: ldc_w -1079431075
      // 32: ixor
      // 33: invokestatic k74/x/IIIIIIlII.llllI (II)I
      // 36: if_icmpge 5a
      // 39: aload 1
      // 3a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3d: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 40: iload 2
      // 41: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 44: astore 3
      // 45: aload 0
      // 46: aload 1
      // 47: aload 3
      // 48: invokevirtual k74/x/IIIIIIlII.lIllI (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;)Z
      // 4b: ifeq 54
      // 4e: iload 2
      // 4f: ireturn
      // 50: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 53: athrow
      // 54: iinc 2 1
      // 57: goto 28
      // 5a: bipush -1
      // 5b: ireturn
   }

   private void lIII() {
      this.IIlI = null;
      this.IlI = null;
      this.llI = llllI(-876739419, 544575385 ^ -1963704028);
   }

   private static boolean lIIl(class_1297 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual net/minecraft/class_1297.method_7325 ()Z
      // 04: ifne 2b
      // 07: aload 0
      // 08: instanceof net/minecraft/class_1309
      // 0b: ifne 23
      // 0e: goto 15
      // 11: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: aload 0
      // 16: invokevirtual net/minecraft/class_1297.method_5863 ()Z
      // 19: ifeq 2b
      // 1c: goto 23
      // 1f: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: bipush 1
      // 24: goto 2c
      // 27: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
   }

   private IIIlIlII lIlI(class_310 param1, class_2338 param2, class_243 param3, double param4, int param6, int param7) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 6
      // 02: iflt 39
      // 05: aload 0
      // 06: aload 1
      // 07: aload 2
      // 08: aload 3
      // 09: dload 4
      // 0b: invokevirtual k74/x/IIIIIIlII.IlllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_243;D)Lk74/x/IIIIlIl;
      // 0e: astore 8
      // 10: aload 8
      // 12: ifnull 39
      // 15: new k74/x/IIIlIlII
      // 18: dup
      // 19: aload 8
      // 1b: getstatic k74/x/IlIIIllIl.I Lk74/x/IlIIIllIl;
      // 1e: iload 6
      // 20: iload 7
      // 22: iflt 34
      // 25: goto 2c
      // 28: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: goto 35
      // 30: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 33: athrow
      // 34: bipush 0
      // 35: invokespecial k74/x/IIIlIlII.<init> (Lk74/x/IIIIlIl;Lk74/x/IlIIIllIl;IZ)V
      // 38: areturn
      // 39: iload 7
      // 3b: iflt 4e
      // 3e: aload 0
      // 3f: aload 1
      // 40: aload 2
      // 41: invokevirtual k74/x/IIIIIIlII.lIIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 44: ifeq 54
      // 47: goto 4e
      // 4a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4d: athrow
      // 4e: aconst_null
      // 4f: areturn
      // 50: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 53: athrow
      // 54: aload 0
      // 55: aload 1
      // 56: aload 2
      // 57: dload 4
      // 59: invokevirtual k74/x/IIIIIIlII.IIll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;D)Lk74/x/IIIIlIl;
      // 5c: astore 8
      // 5e: aload 8
      // 60: ifnonnull 6b
      // 63: aconst_null
      // 64: goto 7a
      // 67: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6a: athrow
      // 6b: new k74/x/IIIlIlII
      // 6e: dup
      // 6f: aload 8
      // 71: getstatic k74/x/IlIIIllIl.II Lk74/x/IlIIIllIl;
      // 74: iload 7
      // 76: bipush 0
      // 77: invokespecial k74/x/IIIlIlII.<init> (Lk74/x/IIIIlIl;Lk74/x/IlIIIllIl;IZ)V
      // 7a: areturn
   }

   @Override
   public void IlIII() {
      this.llIll(class_310.method_1551());
      this.IllI = 0L;
      this.IIllI = 0L;
      this.lI = -1;
      this.Illl = -1;
      this.IlIII = 0;
      this.lII++;
      this.IIIII = null;
      this.IIll = null;
      this.I.IIIIIII();
      this.IIIIl = false;
      this.Il = null;
      this.IIIll = null;
      this.lll = false;
      this.IIlll = -1;
      this.IIIlI = -1;
      this.lIII();
   }

   private boolean lIll(class_310 param1, int param2, IlIIIllIl param3) {
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
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: iload 2
      // 13: iflt 35
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: iload 2
      // 1e: ldc_w -876739422
      // 21: ldc_w 1665100303
      // 24: ldc_w 1080961393
      // 27: ixor
      // 28: invokestatic k74/x/IIIIIIlII.llllI (II)I
      // 2b: if_icmplt 3b
      // 2e: goto 35
      // 31: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 34: athrow
      // 35: bipush 0
      // 36: ireturn
      // 37: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a: athrow
      // 3b: aload 1
      // 3c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 3f: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 42: iload 2
      // 43: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 46: astore 4
      // 48: aload 3
      // 49: invokevirtual k74/x/IlIIIllIl.ordinal ()I
      // 4c: lookupswitch 28 2 0 42 1 53
      // 68: new java/lang/MatchException
      // 6b: dup
      // 6c: aconst_null
      // 6d: aconst_null
      // 6e: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 71: athrow
      // 72: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 75: athrow
      // 76: aload 4
      // 78: getstatic net/minecraft/class_1802.field_8550 Lnet/minecraft/class_1792;
      // 7b: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 7e: goto 88
      // 81: aload 0
      // 82: aload 1
      // 83: aload 4
      // 85: invokevirtual k74/x/IIIIIIlII.lIllI (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;)Z
      // 88: ireturn
   }

   private boolean llII(class_310 param1, int param2) {
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
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: iload 2
      // 13: iflt 35
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: iload 2
      // 1e: ldc_w -876739421
      // 21: ldc_w 683457854
      // 24: ldc_w 1304552895
      // 27: ixor
      // 28: invokestatic k74/x/IIIIIIlII.llllI (II)I
      // 2b: if_icmplt 3b
      // 2e: goto 35
      // 31: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 34: athrow
      // 35: bipush 0
      // 36: ireturn
      // 37: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a: athrow
      // 3b: invokestatic java/lang/System.currentTimeMillis ()J
      // 3e: lstore 3
      // 3f: aload 0
      // 40: getfield k74/x/IIIIIIlII.lI I
      // 43: iload 2
      // 44: if_icmpeq 86
      // 47: aload 1
      // 48: invokestatic k74/x/IIll.lIIlI (Lnet/minecraft/class_310;)I
      // 4b: iload 2
      // 4c: if_icmpeq 5e
      // 4f: goto 56
      // 52: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 55: athrow
      // 56: bipush 1
      // 57: goto 5f
      // 5a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5d: athrow
      // 5e: bipush 0
      // 5f: istore 5
      // 61: aload 0
      // 62: iload 2
      // 63: putfield k74/x/IIIIIIlII.lI I
      // 66: aload 0
      // 67: lload 3
      // 68: iload 5
      // 6a: ifeq 7c
      // 6d: aload 0
      // 6e: aload 0
      // 6f: getfield k74/x/IIIIIIlII.II Lk74/x/lIlllIl;
      // 72: invokevirtual k74/x/IIIIIIlII.Ill (Lk74/x/lIlllIl;)J
      // 75: goto 7d
      // 78: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7b: athrow
      // 7c: lconst_0
      // 7d: ladd
      // 7e: putfield k74/x/IIIIIIlII.IllI J
      // 81: aload 0
      // 82: lconst_0
      // 83: putfield k74/x/IIIIIIlII.IIllI J
      // 86: lload 3
      // 87: aload 0
      // 88: getfield k74/x/IIIIIIlII.IllI J
      // 8b: lcmp
      // 8c: ifge 95
      // 8f: bipush 0
      // 90: ireturn
      // 91: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 94: athrow
      // 95: aload 0
      // 96: getfield k74/x/IIIIIIlII.IIllI J
      // 99: lconst_0
      // 9a: lcmp
      // 9b: ifne b3
      // 9e: aload 0
      // 9f: lload 3
      // a0: aload 0
      // a1: aload 0
      // a2: getfield k74/x/IIIIIIlII.IlII Lk74/x/lIlllIl;
      // a5: invokevirtual k74/x/IIIIIIlII.Ill (Lk74/x/lIlllIl;)J
      // a8: ladd
      // a9: putfield k74/x/IIIIIIlII.IIllI J
      // ac: goto b3
      // af: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b2: athrow
      // b3: lload 3
      // b4: aload 0
      // b5: getfield k74/x/IIIIIIlII.IIllI J
      // b8: lcmp
      // b9: iflt c4
      // bc: bipush 1
      // bd: goto c5
      // c0: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c3: athrow
      // c4: bipush 0
      // c5: ireturn
   }

   private boolean lllI(class_310 var1) {
      IIIIII var2 = this.IIIII;

      try {
         if (var2 == null) {
            return false;
         }
      } catch (MatchException var4) {
         throw IIIl(var4);
      }

      try {
         if (var1.field_1724.field_6012 < var2.l()) {
            return true;
         }
      } catch (MatchException var6) {
         throw IIIl(var6);
      }

      this.IIIII = null;
      this.lII++;
      lIlllII var3 = var2.I();

      try {
         if (var3.I() >= 2) {
            this.llIlI(var1, var3.II());
            return true;
         }
      } catch (MatchException var5) {
         throw IIIl(var5);
      }

      this.IIll = var3.ll(var3.I() + 1);
      return false;
   }

   private IIIlIlII IIIII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: getfield k74/x/IIIIIIlII.lIII Lk74/x/IllIII;
      // 008: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 00b: getstatic k74/x/llIIIII.II Lk74/x/llIIIII;
      // 00e: if_acmpeq 019
      // 011: bipush 1
      // 012: goto 01a
      // 015: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 018: athrow
      // 019: bipush 0
      // 01a: istore 3
      // 01b: aload 0
      // 01c: getfield k74/x/IIIIIIlII.lIII Lk74/x/IllIII;
      // 01f: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 022: getstatic k74/x/llIIIII.I Lk74/x/llIIIII;
      // 025: if_acmpeq 030
      // 028: bipush 1
      // 029: goto 031
      // 02c: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02f: athrow
      // 030: bipush 0
      // 031: istore 4
      // 033: iload 3
      // 034: ifeq 046
      // 037: aload 0
      // 038: aload 1
      // 039: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 03c: invokevirtual k74/x/IIIIIIlII.lIIlI (Lnet/minecraft/class_746;)I
      // 03f: goto 047
      // 042: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 045: athrow
      // 046: bipush -1
      // 047: istore 5
      // 049: iload 4
      // 04b: ifeq 05a
      // 04e: aload 0
      // 04f: aload 1
      // 050: invokevirtual k74/x/IIIIIIlII.Illl (Lnet/minecraft/class_310;)I
      // 053: goto 05b
      // 056: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 059: athrow
      // 05a: bipush -1
      // 05b: istore 6
      // 05d: iload 5
      // 05f: ifge 074
      // 062: iload 6
      // 064: ifge 074
      // 067: goto 06e
      // 06a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 06d: athrow
      // 06e: aconst_null
      // 06f: areturn
      // 070: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 073: athrow
      // 074: aload 1
      // 075: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 078: invokevirtual net/minecraft/class_746.method_24515 ()Lnet/minecraft/class_2338;
      // 07b: astore 7
      // 07d: new net/minecraft/class_2338$class_2339
      // 080: dup
      // 081: invokespecial net/minecraft/class_2338$class_2339.<init> ()V
      // 084: astore 8
      // 086: ldc2_w 3.0
      // 089: invokestatic java/lang/Math.ceil (D)D
      // 08c: d2i
      // 08d: istore 9
      // 08f: aconst_null
      // 090: astore 10
      // 092: iload 9
      // 094: ineg
      // 095: istore 11
      // 097: iload 11
      // 099: iload 9
      // 09b: if_icmpgt 187
      // 09e: iload 9
      // 0a0: ineg
      // 0a1: istore 12
      // 0a3: iload 12
      // 0a5: iload 9
      // 0a7: if_icmpgt 180
      // 0aa: iload 9
      // 0ac: ineg
      // 0ad: istore 13
      // 0af: iload 13
      // 0b1: iload 9
      // 0b3: if_icmpgt 179
      // 0b6: aload 8
      // 0b8: aload 7
      // 0ba: invokevirtual net/minecraft/class_2338.method_10263 ()I
      // 0bd: iload 12
      // 0bf: iadd
      // 0c0: aload 7
      // 0c2: invokevirtual net/minecraft/class_2338.method_10264 ()I
      // 0c5: iload 11
      // 0c7: iadd
      // 0c8: aload 7
      // 0ca: invokevirtual net/minecraft/class_2338.method_10260 ()I
      // 0cd: iload 13
      // 0cf: iadd
      // 0d0: invokevirtual net/minecraft/class_2338$class_2339.method_10103 (III)Lnet/minecraft/class_2338$class_2339;
      // 0d3: pop
      // 0d4: aload 8
      // 0d6: invokevirtual net/minecraft/class_2338$class_2339.method_10062 ()Lnet/minecraft/class_2338;
      // 0d9: astore 14
      // 0db: aload 0
      // 0dc: aload 1
      // 0dd: aload 14
      // 0df: invokevirtual k74/x/IIIIIIlII.IIllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 0e2: ifne 0f0
      // 0e5: aload 2
      // 0e6: ifnull 172
      // 0e9: goto 0f0
      // 0ec: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ef: athrow
      // 0f0: aload 14
      // 0f2: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 0f5: astore 15
      // 0f7: aload 0
      // 0f8: aload 1
      // 0f9: invokevirtual k74/x/IIIIIIlII.IllII (Lnet/minecraft/class_310;)Lnet/minecraft/class_243;
      // 0fc: aload 15
      // 0fe: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 101: dstore 16
      // 103: dload 16
      // 105: ldc2_w 9.0
      // 108: dcmpl
      // 109: ifgt 172
      // 10c: aload 1
      // 10d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 110: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 113: aload 15
      // 115: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 118: ldc2_w 20.25
      // 11b: dcmpl
      // 11c: ifle 131
      // 11f: goto 126
      // 122: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 125: athrow
      // 126: aload 2
      // 127: ifnull 172
      // 12a: goto 131
      // 12d: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 130: athrow
      // 131: aload 0
      // 132: aload 1
      // 133: aload 14
      // 135: aload 15
      // 137: dload 16
      // 139: iload 5
      // 13b: iload 6
      // 13d: invokevirtual k74/x/IIIIIIlII.lIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;Lnet/minecraft/class_243;DII)Lk74/x/IIIlIlII;
      // 140: astore 18
      // 142: aload 18
      // 144: ifnull 172
      // 147: aload 10
      // 149: ifnull 16e
      // 14c: goto 153
      // 14f: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 152: athrow
      // 153: aload 18
      // 155: invokevirtual k74/x/IIIlIlII.II ()Lk74/x/IIIIlIl;
      // 158: invokevirtual k74/x/IIIIlIl.III ()D
      // 15b: aload 10
      // 15d: invokevirtual k74/x/IIIlIlII.II ()Lk74/x/IIIIlIl;
      // 160: invokevirtual k74/x/IIIIlIl.III ()D
      // 163: dcmpg
      // 164: ifge 172
      // 167: goto 16e
      // 16a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16d: athrow
      // 16e: aload 18
      // 170: astore 10
      // 172: iinc 13 1
      // 175: aload 2
      // 176: ifnull 0af
      // 179: iinc 12 1
      // 17c: aload 2
      // 17d: ifnull 0a3
      // 180: iinc 11 1
      // 183: aload 2
      // 184: ifnull 097
      // 187: aload 10
      // 189: areturn
   }

   private boolean IIIIl(class_310 var1, lIlllII var2) {
      return this.lIlll(var1, var2);
   }

   private boolean IIIlI(class_310 param1, IIIIlIl param2, int param3) {
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
      // 03: invokevirtual k74/x/IIIIIIlII.IIII (Lnet/minecraft/class_310;Lk74/x/IIIIlIl;)Z
      // 06: ifne 0f
      // 09: bipush 0
      // 0a: ireturn
      // 0b: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: aload 0
      // 10: aload 1
      // 11: iload 3
      // 12: getstatic k74/x/IlIIIllIl.II Lk74/x/IlIIIllIl;
      // 15: invokevirtual k74/x/IIIIIIlII.lIll (Lnet/minecraft/class_310;ILk74/x/IlIIIllIl;)Z
      // 18: ifne 21
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 20: athrow
      // 21: aload 0
      // 22: aload 1
      // 23: invokevirtual k74/x/IIIIIIlII.I (Lnet/minecraft/class_310;)V
      // 26: aload 1
      // 27: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 2a: aload 0
      // 2b: aload 2
      // 2c: invokevirtual k74/x/IIIIIIlII.IIl (Lk74/x/IIIIlIl;)Lnet/minecraft/class_3965;
      // 2f: invokestatic k74/x/IIll.IlIIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
      // 32: astore 4
      // 34: aload 4
      // 36: ifnull 52
      // 39: aload 4
      // 3b: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 40: ifeq 52
      // 43: goto 4a
      // 46: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 49: athrow
      // 4a: bipush 1
      // 4b: goto 53
      // 4e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 51: athrow
      // 52: bipush 0
      // 53: ireturn
   }

   private boolean IIIll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 88
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 88
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 88
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 24: ifnull 88
      // 27: goto 2e
      // 2a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: aload 1
      // 2f: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 32: ifnonnull 88
      // 35: goto 3c
      // 38: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3b: athrow
      // 3c: aload 1
      // 3d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 40: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 43: ifeq 88
      // 46: goto 4d
      // 49: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4c: athrow
      // 4d: aload 1
      // 4e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 51: invokevirtual net/minecraft/class_746.method_6115 ()Z
      // 54: ifne 88
      // 57: goto 5e
      // 5a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5d: athrow
      // 5e: aload 1
      // 5f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 62: invokevirtual net/minecraft/class_746.method_6039 ()Z
      // 65: ifne 88
      // 68: goto 6f
      // 6b: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6e: athrow
      // 6f: aload 1
      // 70: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 73: invokestatic k74/x/IIll.IIlI (Lnet/minecraft/class_1309;)Z
      // 76: ifne 88
      // 79: goto 80
      // 7c: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7f: athrow
      // 80: bipush 1
      // 81: goto 89
      // 84: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 87: athrow
      // 88: bipush 0
      // 89: ireturn
   }

   private boolean IIlII(int param1, class_310 param2, Entry param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 1
      // 01: aload 3
      // 02: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 07: checkcast java/lang/Integer
      // 0a: invokevirtual java/lang/Integer.intValue ()I
      // 0d: isub
      // 0e: ldc_w -876739424
      // 11: ldc_w -1191022925
      // 14: ldc_w 350815147
      // 17: ixor
      // 18: invokestatic k74/x/IIIIIIlII.llllI (II)I
      // 1b: if_icmpgt 36
      // 1e: aload 0
      // 1f: aload 2
      // 20: aload 3
      // 21: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 26: checkcast net/minecraft/class_2338
      // 29: invokevirtual k74/x/IIIIIIlII.llI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 2c: ifne 3e
      // 2f: goto 36
      // 32: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3f
      // 3a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: ireturn
   }

   private boolean IIllI(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 18
      // 04: aload 0
      // 05: getfield k74/x/IIIIIIlII.IIII Ljava/util/Map;
      // 08: aload 2
      // 09: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0e: ifeq 1e
      // 11: goto 18
      // 14: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: bipush 0
      // 19: ireturn
      // 1a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1d: athrow
      // 1e: aload 1
      // 1f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 22: aload 2
      // 23: invokevirtual net/minecraft/class_638.method_8316 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_3610;
      // 26: astore 3
      // 27: aload 3
      // 28: ifnull 39
      // 2b: aload 3
      // 2c: invokevirtual net/minecraft/class_3610.method_15771 ()Z
      // 2f: ifne 3f
      // 32: goto 39
      // 35: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 38: athrow
      // 39: bipush 0
      // 3a: ireturn
      // 3b: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3e: athrow
      // 3f: aload 0
      // 40: getfield k74/x/IIIIIIlII.llIl Lk74/x/IllIII;
      // 43: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 46: checkcast k74/x/IIIIIIl
      // 49: invokevirtual k74/x/IIIIIIl.ordinal ()I
      // 4c: tableswitch 28 0 2 52 42 62
      // 68: new java/lang/MatchException
      // 6b: dup
      // 6c: aconst_null
      // 6d: aconst_null
      // 6e: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 71: athrow
      // 72: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 75: athrow
      // 76: aload 3
      // 77: getstatic net/minecraft/class_3612.field_15910 Lnet/minecraft/class_3609;
      // 7a: invokevirtual net/minecraft/class_3610.method_39360 (Lnet/minecraft/class_3611;)Z
      // 7d: goto ae
      // 80: aload 3
      // 81: getstatic net/minecraft/class_3612.field_15908 Lnet/minecraft/class_3609;
      // 84: invokevirtual net/minecraft/class_3610.method_39360 (Lnet/minecraft/class_3611;)Z
      // 87: goto ae
      // 8a: aload 3
      // 8b: getstatic net/minecraft/class_3612.field_15910 Lnet/minecraft/class_3609;
      // 8e: invokevirtual net/minecraft/class_3610.method_39360 (Lnet/minecraft/class_3611;)Z
      // 91: ifne a5
      // 94: aload 3
      // 95: getstatic net/minecraft/class_3612.field_15908 Lnet/minecraft/class_3609;
      // 98: invokevirtual net/minecraft/class_3610.method_39360 (Lnet/minecraft/class_3611;)Z
      // 9b: ifeq ad
      // 9e: goto a5
      // a1: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a4: athrow
      // a5: bipush 1
      // a6: goto ae
      // a9: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // ac: athrow
      // ad: bipush 0
      // ae: ireturn
   }

   private void IIlll(class_310 param1, class_1268 param2, class_1269 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIIIIlII.IIlI Lnet/minecraft/class_2338;
      // 04: astore 4
      // 06: aload 0
      // 07: getfield k74/x/IIIIIIlII.IlI Lnet/minecraft/class_1268;
      // 0a: astore 5
      // 0c: aload 4
      // 0e: ifnull 29
      // 11: aload 2
      // 12: ifnull 29
      // 15: goto 1c
      // 18: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1b: athrow
      // 1c: aload 2
      // 1d: aload 5
      // 1f: if_acmpeq 2e
      // 22: goto 29
      // 25: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: return
      // 2a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: aload 0
      // 2f: getfield k74/x/IIIIIIlII.llI I
      // 32: istore 6
      // 34: aload 0
      // 35: invokevirtual k74/x/IIIIIIlII.lIII ()V
      // 38: aload 0
      // 39: aload 1
      // 3a: invokevirtual k74/x/IIIIIIlII.IIIll (Lnet/minecraft/class_310;)Z
      // 3d: ifeq 90
      // 40: aload 3
      // 41: ifnull 90
      // 44: goto 4b
      // 47: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4a: athrow
      // 4b: aload 3
      // 4c: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 51: ifeq 90
      // 54: goto 5b
      // 57: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5a: athrow
      // 5b: aload 1
      // 5c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5f: getfield net/minecraft/class_746.field_6012 I
      // 62: iload 6
      // 64: isub
      // 65: iflt 90
      // 68: goto 6f
      // 6b: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6e: athrow
      // 6f: aload 1
      // 70: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 73: getfield net/minecraft/class_746.field_6012 I
      // 76: iload 6
      // 78: isub
      // 79: ldc_w -876739423
      // 7c: ldc_w -533275620
      // 7f: ldc_w 1748963367
      // 82: ixor
      // 83: invokestatic k74/x/IIIIIIlII.llllI (II)I
      // 86: if_icmple 95
      // 89: goto 90
      // 8c: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8f: athrow
      // 90: return
      // 91: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 94: athrow
      // 95: aload 0
      // 96: getfield k74/x/IIIIIIlII.IIII Ljava/util/Map;
      // 99: aload 4
      // 9b: aload 1
      // 9c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 9f: getfield net/minecraft/class_746.field_6012 I
      // a2: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // a5: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // aa: pop
      // ab: return
   }

   private class_243 IllII(class_310 var1) {
      return new class_243(var1.field_1724.method_23317(), var1.field_1724.method_23318(), var1.field_1724.method_23321());
   }

   public void IllIl(class_310 var1, class_1268 var2, class_1269 var3) {
      this.IIlll(var1, var2, var3);
   }

   private IIIIlIl IlllI(class_310 var1, class_2338 var2, class_243 var3, double var4) {
      try {
         if (this.lIIll(var1, var3, var2)) {
            return new IIIIlIl(var2.method_10062(), var3, null, null, null, var4);
         }
      } catch (MatchException var6) {
         throw IIIl(var6);
      }

      return null;
   }

   private void Illll(class_310 var1) {
      try {
         if (this.Illl < 0) {
            return;
         }
      } catch (MatchException var3) {
         throw IIIl(var3);
      }

      try {
         if (var1.field_1724.field_6012 < this.IlIII) {
            return;
         }
      } catch (MatchException var4) {
         throw IIIl(var4);
      }

      int var2 = this.Illl;
      this.Illl = -1;
      this.IlIII = 0;
      this.lII(var1, var2);
   }

   private boolean l(class_310 param1, lIlllII param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 2
      // 001: ifnonnull 00c
      // 004: aconst_null
      // 005: goto 010
      // 008: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 00b: athrow
      // 00c: aload 2
      // 00d: invokevirtual k74/x/lIlllII.lI ()Lk74/x/IIIIlIl;
      // 010: astore 3
      // 011: aload 3
      // 012: ifnull 06e
      // 015: aload 0
      // 016: aload 1
      // 017: aload 3
      // 018: invokevirtual k74/x/IIIIlIl.Il ()Lnet/minecraft/class_2338;
      // 01b: invokevirtual k74/x/IIIIIIlII.IIllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 01e: ifeq 06e
      // 021: goto 028
      // 024: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 027: athrow
      // 028: aload 2
      // 029: invokevirtual k74/x/lIlllII.III ()Lk74/x/IlIIIllIl;
      // 02c: getstatic k74/x/IlIIIllIl.II Lk74/x/IlIIIllIl;
      // 02f: if_acmpne 049
      // 032: goto 039
      // 035: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 038: athrow
      // 039: aload 0
      // 03a: aload 1
      // 03b: aload 3
      // 03c: invokevirtual k74/x/IIIIIIlII.IIII (Lnet/minecraft/class_310;Lk74/x/IIIIlIl;)Z
      // 03f: ifeq 06e
      // 042: goto 049
      // 045: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 048: athrow
      // 049: aload 0
      // 04a: aload 1
      // 04b: aload 2
      // 04c: invokevirtual k74/x/lIlllII.l ()I
      // 04f: aload 2
      // 050: invokevirtual k74/x/lIlllII.III ()Lk74/x/IlIIIllIl;
      // 053: invokevirtual k74/x/IIIIIIlII.llIIl (Lnet/minecraft/class_310;ILk74/x/IlIIIllIl;)Z
      // 056: ifeq 06e
      // 059: goto 060
      // 05c: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 05f: athrow
      // 060: aload 1
      // 061: invokestatic k74/x/IIll.IllIl (Lnet/minecraft/class_310;)I
      // 064: ifle 074
      // 067: goto 06e
      // 06a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 06d: athrow
      // 06e: bipush 0
      // 06f: ireturn
      // 070: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 073: athrow
      // 074: aload 0
      // 075: aload 1
      // 076: aload 3
      // 077: invokevirtual k74/x/IIIIIIlII.Il (Lnet/minecraft/class_310;Lk74/x/IIIIlIl;)Z
      // 07a: istore 4
      // 07c: iload 4
      // 07e: ifeq 096
      // 081: aload 1
      // 082: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 085: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 088: fstore 5
      // 08a: aload 1
      // 08b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08e: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 091: fstore 6
      // 093: goto 0b7
      // 096: aload 1
      // 097: aload 3
      // 098: invokevirtual k74/x/IIIIlIl.I ()Lnet/minecraft/class_243;
      // 09b: invokestatic k74/x/IlllIlII.lIII (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 09e: astore 7
      // 0a0: aload 7
      // 0a2: ifnonnull 0ab
      // 0a5: bipush 0
      // 0a6: ireturn
      // 0a7: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0aa: athrow
      // 0ab: aload 7
      // 0ad: bipush 0
      // 0ae: faload
      // 0af: fstore 5
      // 0b1: aload 7
      // 0b3: bipush 1
      // 0b4: faload
      // 0b5: fstore 6
      // 0b7: aload 0
      // 0b8: dup
      // 0b9: getfield k74/x/IIIIIIlII.lII J
      // 0bc: lconst_1
      // 0bd: ladd
      // 0be: dup2_x1
      // 0bf: putfield k74/x/IIIIIIlII.lII J
      // 0c2: lstore 7
      // 0c4: aload 1
      // 0c5: ldc_w -876739406
      // 0c8: ldc_w 1562770449
      // 0cb: ldc_w -883893423
      // 0ce: ixor
      // 0cf: invokestatic k74/x/IIIIIIlII.llllI (II)I
      // 0d2: fload 5
      // 0d4: fload 6
      // 0d6: aload 0
      // 0d7: aload 1
      // 0d8: lload 7
      // 0da: aload 2
      // 0db: invokedynamic a (Lk74/x/IIIIIIlII;Lnet/minecraft/class_310;JLk74/x/lIlllII;)Lk74/x/IIIll; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIIIIlII.II (Lnet/minecraft/class_310;JLk74/x/lIlllII;)Z, ()Z ]
      // 0e0: invokestatic k74/x/IlllIlII.IlII (Lnet/minecraft/class_310;IFFLk74/x/IIIll;)Z
      // 0e3: istore 9
      // 0e5: iload 9
      // 0e7: ifne 0fa
      // 0ea: aload 0
      // 0eb: dup
      // 0ec: getfield k74/x/IIIIIIlII.lII J
      // 0ef: lconst_1
      // 0f0: ladd
      // 0f1: putfield k74/x/IIIIIIlII.lII J
      // 0f4: bipush 0
      // 0f5: ireturn
      // 0f6: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f9: athrow
      // 0fa: aload 0
      // 0fb: new k74/x/IIIIII
      // 0fe: dup
      // 0ff: lload 7
      // 101: aload 2
      // 102: aload 1
      // 103: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 106: getfield net/minecraft/class_746.field_6012 I
      // 109: bipush 2
      // 10a: iadd
      // 10b: invokespecial k74/x/IIIIII.<init> (JLk74/x/lIlllII;I)V
      // 10e: putfield k74/x/IIIIIIlII.IIIII Lk74/x/IIIIII;
      // 111: bipush 1
      // 112: ireturn
   }

   public void lIIII(class_310 var1, class_1268 var2, class_3965 var3, class_1269 var4) {
      try {
         if (var4 == class_1269.field_5811) {
            return;
         }
      } catch (MatchException var5) {
         throw IIIl(var5);
      }

      this.IIlll(var1, var2, var4);
   }

   @Override
   public void llIl() {
      class_310 var1 = class_310.method_1551();

      class_310 var10000;
      IIIIIIlII var10001;
      lllIII var10002;
      label17: {
         try {
            this.lII++;
            this.IIIII = null;
            this.IIll = null;
            var10000 = var1;
            var10001 = this;
            if (this.IlIIl.IllI()) {
               var10002 = lllIII.II;
               break label17;
            }
         } catch (MatchException var2) {
            throw IIIl(var2);
         }

         var10002 = lllIII.I;
      }

      k74.x.IIll.lllIl(var10000, var10001, var10002);
      this.IllI = 0L;
      this.IIllI = 0L;
      this.lI = -1;
      this.Illl = -1;
      this.IlIII = 0;
      this.I.lIIl();
      this.IIIIl = false;
      this.Il = null;
      this.IIIll = null;
      this.lll = false;
      this.IIlll = -1;
      this.IIIlI = -1;
      this.lIII();
   }

   public IIIIIIlII() {
      int var1 = -20400383;
      super(
         IlIIllIII.Ill(lllIl(llllI(-876739405, var1 ^ -1053295213), llllI(-876739408, var1 ^ 1318359395))),
         lllIIlIl.IlI,
         IlIIllIII.Ill(lllIl(llllI(-876739407, var1 ^ 206915016), llllI(-876739394, var1 ^ 1404396535)))
      );
      this.llIl = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(lllIl(llllI(-876739393, var1 ^ 1350799531), llllI(-876739396, var1 ^ -1907161488))), IIIIIIl.class, IIIIIIl.l)
      );
      this.lIII = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(lllIl(llllI(-876739395, var1 ^ 1017065774), llllI(-876739398, var1 ^ -158672452))), llIIIII.class, llIIIII.I)
      );
      this.IlIlI = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(lllIl(llllI(-876739397, var1 ^ -76482855), llllI(-876739400, var1 ^ -1355599991))), IlIIllIlI.class, IlIIllIlI.II)
      );
      this.III = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lllIl(llllI(-876739399, var1 ^ 1179324113), llllI(-876739450, var1 ^ -510057929))), 50.0, 1.0, 100.0, 1.0).lIlI(this::IlIl)
      );
      this.I = new IlIIIllll();
      this.IIlll = -1;
      this.IIIlI = -1;
      this.II = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(lllIl(llllI(-876739449, var1 ^ 959628177), llllI(-876739452, var1 ^ 1064045708))), 55.0, 60.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(lllIl(llllI(-876739451, var1 ^ 1936200721), llllI(-876739454, var1 ^ -227449246))))
      );
      this.IlII = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(lllIl(llllI(-876739453, var1 ^ -896437630), llllI(-876739456, var1 ^ 1227101928))), 10.0, 25.0, 0.0, 500.0, 5.0)
            .Ill(IlIIllIII.Ill(lllIl(llllI(-876739455, var1 ^ -1648843650), llllI(-876739442, var1 ^ 159621858))))
      );
      this.IlIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lllIl(llllI(-876739441, var1 ^ -1931279286), llllI(-876739444, var1 ^ 1783016891))), true));
      this.IIII = new HashMap<>();
      this.llI = llllI(-876739443, var1 ^ 963033108);
      this.lI = -1;
      this.Illl = -1;
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
      // 01: ifnull 1d
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: ifnull 1d
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 2
      // 13: ifnonnull 23
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: ireturn
      // 1f: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: new net/minecraft/class_238
      // 26: dup
      // 27: aload 2
      // 28: invokespecial net/minecraft/class_238.<init> (Lnet/minecraft/class_2338;)V
      // 2b: astore 3
      // 2c: aload 1
      // 2d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 30: aconst_null
      // 31: aload 3
      // 32: invokedynamic test ()Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IIIIIIlII.lIIl (Lnet/minecraft/class_1297;)Z, (Lnet/minecraft/class_1297;)Z ]
      // 37: invokevirtual net/minecraft/class_638.method_8333 (Lnet/minecraft/class_1297;Lnet/minecraft/class_238;Ljava/util/function/Predicate;)Ljava/util/List;
      // 3a: invokeinterface java/util/List.isEmpty ()Z 1
      // 3f: ifne 4a
      // 42: bipush 1
      // 43: goto 4b
      // 46: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 49: athrow
      // 4a: bipush 0
      // 4b: ireturn
   }

   private int lIIlI(class_746 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 0a
      // 04: bipush -1
      // 05: ireturn
      // 06: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 09: athrow
      // 0a: bipush 0
      // 0b: istore 2
      // 0c: iload 2
      // 0d: ldc_w -876739446
      // 10: ldc_w -2106518578
      // 13: ldc_w -251712268
      // 16: ixor
      // 17: invokestatic k74/x/IIIIIIlII.llllI (II)I
      // 1a: if_icmpge 47
      // 1d: aload 1
      // 1e: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 21: iload 2
      // 22: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 25: astore 3
      // 26: aload 3
      // 27: ifnull 41
      // 2a: aload 3
      // 2b: getstatic net/minecraft/class_1802.field_8550 Lnet/minecraft/class_1792;
      // 2e: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 31: ifeq 41
      // 34: goto 3b
      // 37: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a: athrow
      // 3b: iload 2
      // 3c: ireturn
      // 3d: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 40: athrow
      // 41: iinc 2 1
      // 44: goto 0c
      // 47: bipush -1
      // 48: ireturn
   }

   private boolean lIIll(class_310 param1, class_243 param2, class_2338 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 0f
      // 04: aload 3
      // 05: ifnonnull 15
      // 08: goto 0f
      // 0b: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: bipush 0
      // 10: ireturn
      // 11: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: aload 1
      // 16: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 19: new net/minecraft/class_3959
      // 1c: dup
      // 1d: aload 1
      // 1e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 21: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 24: aload 2
      // 25: getstatic net/minecraft/class_3959$class_3960.field_17558 Lnet/minecraft/class_3959$class_3960;
      // 28: getstatic net/minecraft/class_3959$class_242.field_1347 Lnet/minecraft/class_3959$class_242;
      // 2b: aload 1
      // 2c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2f: invokespecial net/minecraft/class_3959.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_3959$class_3960;Lnet/minecraft/class_3959$class_242;Lnet/minecraft/class_1297;)V
      // 32: invokevirtual net/minecraft/class_638.method_17742 (Lnet/minecraft/class_3959;)Lnet/minecraft/class_3965;
      // 35: astore 4
      // 37: aload 4
      // 39: ifnull 57
      // 3c: aload 4
      // 3e: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 41: aload 3
      // 42: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 45: ifeq 57
      // 48: goto 4f
      // 4b: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4e: athrow
      // 4f: bipush 1
      // 50: goto 58
      // 53: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 56: athrow
      // 57: bipush 0
      // 58: ireturn
   }

   private void lIlII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIIIIlII.IIll Lk74/x/lIlllII;
      // 04: astore 2
      // 05: aload 2
      // 06: ifnonnull 0e
      // 09: return
      // 0a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d: athrow
      // 0e: aload 0
      // 0f: aload 1
      // 10: aload 2
      // 11: invokevirtual k74/x/lIlllII.lI ()Lk74/x/IIIIlIl;
      // 14: invokevirtual k74/x/IIIIlIl.Il ()Lnet/minecraft/class_2338;
      // 17: invokevirtual k74/x/IIIIIIlII.IIllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 1a: ifne 30
      // 1d: aload 0
      // 1e: aconst_null
      // 1f: putfield k74/x/IIIIIIlII.IIll Lk74/x/lIlllII;
      // 22: aload 0
      // 23: aload 1
      // 24: aload 2
      // 25: invokevirtual k74/x/lIlllII.II ()I
      // 28: invokevirtual k74/x/IIIIIIlII.llIlI (Lnet/minecraft/class_310;I)V
      // 2b: return
      // 2c: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2f: athrow
      // 30: aload 0
      // 31: aload 1
      // 32: aload 2
      // 33: invokevirtual k74/x/lIlllII.l ()I
      // 36: invokevirtual k74/x/IIIIIIlII.llII (Lnet/minecraft/class_310;I)Z
      // 39: ifne 41
      // 3c: return
      // 3d: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 40: athrow
      // 41: aload 0
      // 42: aload 1
      // 43: aload 2
      // 44: invokevirtual k74/x/lIlllII.l ()I
      // 47: aload 2
      // 48: invokevirtual k74/x/lIlllII.III ()Lk74/x/IlIIIllIl;
      // 4b: invokevirtual k74/x/IIIIIIlII.lIll (Lnet/minecraft/class_310;ILk74/x/IlIIIllIl;)Z
      // 4e: ifne 64
      // 51: aload 0
      // 52: aconst_null
      // 53: putfield k74/x/IIIIIIlII.IIll Lk74/x/lIlllII;
      // 56: aload 0
      // 57: aload 1
      // 58: aload 2
      // 59: invokevirtual k74/x/lIlllII.II ()I
      // 5c: invokevirtual k74/x/IIIIIIlII.llIlI (Lnet/minecraft/class_310;I)V
      // 5f: return
      // 60: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 63: athrow
      // 64: aload 0
      // 65: aload 1
      // 66: aload 2
      // 67: invokevirtual k74/x/lIlllII.l ()I
      // 6a: aload 2
      // 6b: invokevirtual k74/x/lIlllII.III ()Lk74/x/IlIIIllIl;
      // 6e: invokevirtual k74/x/IIIIIIlII.llIIl (Lnet/minecraft/class_310;ILk74/x/IlIIIllIl;)Z
      // 71: ifeq 82
      // 74: aload 1
      // 75: invokestatic k74/x/IIll.IllIl (Lnet/minecraft/class_310;)I
      // 78: ifle 87
      // 7b: goto 82
      // 7e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 81: athrow
      // 82: return
      // 83: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 86: athrow
      // 87: aload 0
      // 88: aload 1
      // 89: aload 2
      // 8a: invokevirtual k74/x/IIIIIIlII.l (Lnet/minecraft/class_310;Lk74/x/lIlllII;)Z
      // 8d: ifeq 9c
      // 90: aload 0
      // 91: aconst_null
      // 92: putfield k74/x/IIIIIIlII.IIll Lk74/x/lIlllII;
      // 95: goto 9c
      // 98: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 9b: athrow
      // 9c: return
   }

   private void lIlIl(class_310 param1) {
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
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: return
      // 13: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: aload 1
      // 18: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b: getfield net/minecraft/class_746.field_6012 I
      // 1e: istore 2
      // 1f: aload 0
      // 20: getfield k74/x/IIIIIIlII.IIII Ljava/util/Map;
      // 23: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 28: aload 0
      // 29: iload 2
      // 2a: aload 1
      // 2b: invokedynamic test (Lk74/x/IIIIIIlII;ILnet/minecraft/class_310;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/IIIIIIlII.IIlII (ILnet/minecraft/class_310;Ljava/util/Map$Entry;)Z, (Ljava/util/Map$Entry;)Z ]
      // 30: invokeinterface java/util/Set.removeIf (Ljava/util/function/Predicate;)Z 2
      // 35: pop
      // 36: return
   }

   private boolean lIllI(class_310 param1, class_1799 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 1b
      // 04: aload 2
      // 05: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 08: astore 4
      // 0a: aload 4
      // 0c: instanceof net/minecraft/class_1747
      // 0f: ifeq 1b
      // 12: aload 4
      // 14: checkcast net/minecraft/class_1747
      // 17: astore 3
      // 18: goto 1d
      // 1b: bipush 0
      // 1c: ireturn
      // 1d: aload 3
      // 1e: invokevirtual net/minecraft/class_1747.method_7711 ()Lnet/minecraft/class_2248;
      // 21: invokevirtual net/minecraft/class_2248.method_9564 ()Lnet/minecraft/class_2680;
      // 24: astore 4
      // 26: aload 4
      // 28: ifnull 6d
      // 2b: aload 4
      // 2d: invokevirtual net/minecraft/class_2680.method_26215 ()Z
      // 30: ifne 6d
      // 33: goto 3a
      // 36: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 39: athrow
      // 3a: aload 4
      // 3c: invokevirtual net/minecraft/class_2680.method_26227 ()Lnet/minecraft/class_3610;
      // 3f: invokevirtual net/minecraft/class_3610.method_15769 ()Z
      // 42: ifeq 6d
      // 45: goto 4c
      // 48: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4b: athrow
      // 4c: aload 4
      // 4e: aload 1
      // 4f: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 52: getstatic net/minecraft/class_2338.field_10980 Lnet/minecraft/class_2338;
      // 55: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 58: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 5b: ifne 6d
      // 5e: goto 65
      // 61: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 64: athrow
      // 65: bipush 1
      // 66: goto 6e
      // 69: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6c: athrow
      // 6d: bipush 0
      // 6e: ireturn
   }

   private boolean lIlll(class_310 var1, lIlllII var2) {
      try {
         switch (var2.III()) {
            case I:
               return this.lllII(var1, var2.lI(), var2.l());
            case II:
               return this.IIIlI(var1, var2.lI(), var2.l());
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var3) {
         throw IIIl(var3);
      }
   }

   private boolean llIII(class_310 param1, long param2, lIlllII param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIIIIlII.IIIII Lk74/x/IIIIII;
      // 04: astore 5
      // 06: aload 5
      // 08: ifnull 1c
      // 0b: aload 5
      // 0d: invokevirtual k74/x/IIIIII.II ()J
      // 10: lload 2
      // 11: lcmp
      // 12: ifeq 22
      // 15: goto 1c
      // 18: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21: athrow
      // 22: aload 0
      // 23: aconst_null
      // 24: putfield k74/x/IIIIIIlII.IIIII Lk74/x/IIIIII;
      // 27: aload 0
      // 28: aconst_null
      // 29: putfield k74/x/IIIIIIlII.IIll Lk74/x/lIlllII;
      // 2c: aload 0
      // 2d: aload 1
      // 2e: aload 4
      // 30: invokevirtual k74/x/IIIIIIlII.lIl (Lnet/minecraft/class_310;Lk74/x/lIlllII;)Z
      // 33: istore 6
      // 35: iload 6
      // 37: ifeq 53
      // 3a: aload 0
      // 3b: getfield k74/x/IIIIIIlII.IIII Ljava/util/Map;
      // 3e: aload 4
      // 40: invokevirtual k74/x/lIlllII.lI ()Lk74/x/IIIIlIl;
      // 43: invokevirtual k74/x/IIIIlIl.Il ()Lnet/minecraft/class_2338;
      // 46: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 4b: pop
      // 4c: goto 53
      // 4f: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 52: athrow
      // 53: iload 6
      // 55: ifne 72
      // 58: aload 0
      // 59: aload 1
      // 5a: aload 4
      // 5c: invokevirtual k74/x/IIIIIIlII.III (Lnet/minecraft/class_310;Lk74/x/lIlllII;)Lk74/x/lIlllII;
      // 5f: astore 7
      // 61: aload 7
      // 63: ifnull 72
      // 66: aload 0
      // 67: aload 7
      // 69: putfield k74/x/IIIIIIlII.IIll Lk74/x/lIlllII;
      // 6c: bipush 0
      // 6d: ireturn
      // 6e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 71: athrow
      // 72: aload 0
      // 73: aload 1
      // 74: aload 4
      // 76: invokevirtual k74/x/lIlllII.II ()I
      // 79: invokevirtual k74/x/IIIIIIlII.llIlI (Lnet/minecraft/class_310;I)V
      // 7c: iload 6
      // 7e: ireturn
   }

   private boolean llIIl(class_310 param1, int param2, IlIIIllIl param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 4e
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 4e
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: iload 2
      // 13: iflt 4e
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: iload 2
      // 1e: ldc_w -876739445
      // 21: ldc_w 1152987317
      // 24: ldc_w 675313699
      // 27: ixor
      // 28: invokestatic k74/x/IIIIIIlII.llllI (II)I
      // 2b: if_icmpge 4e
      // 2e: goto 35
      // 31: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 34: athrow
      // 35: aload 0
      // 36: aload 1
      // 37: iload 2
      // 38: aload 3
      // 39: invokevirtual k74/x/IIIIIIlII.lIll (Lnet/minecraft/class_310;ILk74/x/IlIIIllIl;)Z
      // 3c: ifeq 4e
      // 3f: goto 46
      // 42: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 45: athrow
      // 46: bipush 1
      // 47: goto 4f
      // 4a: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4d: athrow
      // 4e: bipush 0
      // 4f: ireturn
   }

   private void llIlI(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: getfield k74/x/IIIIIIlII.lII J
      // 05: lconst_1
      // 06: ladd
      // 07: putfield k74/x/IIIIIIlII.lII J
      // 0a: aload 0
      // 0b: aconst_null
      // 0c: putfield k74/x/IIIIIIlII.IIIII Lk74/x/IIIIII;
      // 0f: aload 0
      // 10: aconst_null
      // 11: putfield k74/x/IIIIIIlII.IIll Lk74/x/lIlllII;
      // 14: aload 0
      // 15: lconst_0
      // 16: putfield k74/x/IIIIIIlII.IllI J
      // 19: aload 0
      // 1a: lconst_0
      // 1b: putfield k74/x/IIIIIIlII.IIllI J
      // 1e: aload 0
      // 1f: bipush -1
      // 20: putfield k74/x/IIIIIIlII.lI I
      // 23: aload 0
      // 24: getfield k74/x/IIIIIIlII.IlIIl Lk74/x/lllIIlII;
      // 27: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 2a: checkcast java/lang/Boolean
      // 2d: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 30: ifne 4a
      // 33: aload 0
      // 34: bipush -1
      // 35: putfield k74/x/IIIIIIlII.Illl I
      // 38: aload 0
      // 39: bipush 0
      // 3a: putfield k74/x/IIIIIIlII.IlIII I
      // 3d: aload 1
      // 3e: aload 0
      // 3f: getstatic k74/x/lllIII.I Lk74/x/lllIII;
      // 42: invokestatic k74/x/IIll.lllIl (Lnet/minecraft/class_310;Ljava/lang/Object;Lk74/x/lllIII;)V
      // 45: return
      // 46: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 49: athrow
      // 4a: iload 2
      // 4b: iflt 66
      // 4e: iload 2
      // 4f: ldc_w -876739448
      // 52: ldc_w -1966854636
      // 55: ldc_w -101001020
      // 58: ixor
      // 59: invokestatic k74/x/IIIIIIlII.llllI (II)I
      // 5c: if_icmplt 7d
      // 5f: goto 66
      // 62: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 65: athrow
      // 66: aload 0
      // 67: bipush -1
      // 68: putfield k74/x/IIIIIIlII.Illl I
      // 6b: aload 0
      // 6c: bipush 0
      // 6d: putfield k74/x/IIIIIIlII.IlIII I
      // 70: aload 1
      // 71: aload 0
      // 72: getstatic k74/x/lllIII.II Lk74/x/lllIII;
      // 75: invokestatic k74/x/IIll.lllIl (Lnet/minecraft/class_310;Ljava/lang/Object;Lk74/x/lllIII;)V
      // 78: return
      // 79: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7c: athrow
      // 7d: aload 0
      // 7e: aload 1
      // 7f: iload 2
      // 80: invokevirtual k74/x/IIIIIIlII.IlII (Lnet/minecraft/class_310;I)V
      // 83: return
   }

   private void llIll(class_310 param1) {
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
      // 0e: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: return
      // 13: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: aload 1
      // 18: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1b: invokevirtual net/minecraft/class_746.hashCode ()I
      // 1e: istore 2
      // 1f: aload 1
      // 20: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 23: astore 3
      // 24: iload 2
      // 25: aload 0
      // 26: getfield k74/x/IIIIIIlII.llII I
      // 29: if_icmpne 3b
      // 2c: aload 3
      // 2d: aload 0
      // 2e: getfield k74/x/IIIIIIlII.IlIl Ljava/lang/Object;
      // 31: if_acmpeq 86
      // 34: goto 3b
      // 37: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: iload 2
      // 3d: putfield k74/x/IIIIIIlII.llII I
      // 40: aload 0
      // 41: aload 3
      // 42: putfield k74/x/IIIIIIlII.IlIl Ljava/lang/Object;
      // 45: aload 0
      // 46: getfield k74/x/IIIIIIlII.IIII Ljava/util/Map;
      // 49: invokeinterface java/util/Map.clear ()V 1
      // 4e: aload 0
      // 4f: lconst_0
      // 50: putfield k74/x/IIIIIIlII.IllI J
      // 53: aload 0
      // 54: lconst_0
      // 55: putfield k74/x/IIIIIIlII.IIllI J
      // 58: aload 0
      // 59: bipush -1
      // 5a: putfield k74/x/IIIIIIlII.lI I
      // 5d: aload 0
      // 5e: bipush -1
      // 5f: putfield k74/x/IIIIIIlII.Illl I
      // 62: aload 0
      // 63: bipush 0
      // 64: putfield k74/x/IIIIIIlII.IlIII I
      // 67: aload 0
      // 68: dup
      // 69: getfield k74/x/IIIIIIlII.lII J
      // 6c: lconst_1
      // 6d: ladd
      // 6e: putfield k74/x/IIIIIIlII.lII J
      // 71: aload 0
      // 72: aconst_null
      // 73: putfield k74/x/IIIIIIlII.IIIII Lk74/x/IIIIII;
      // 76: aload 0
      // 77: aconst_null
      // 78: putfield k74/x/IIIIIIlII.IIll Lk74/x/lIlllII;
      // 7b: aload 0
      // 7c: invokevirtual k74/x/IIIIIIlII.lIII ()V
      // 7f: goto 86
      // 82: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 85: athrow
      // 86: return
   }

   private boolean lllII(class_310 param1, IIIIlIl param2, int param3) {
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
      // 03: invokevirtual k74/x/IIIIlIl.I ()Lnet/minecraft/class_243;
      // 06: aload 2
      // 07: invokevirtual k74/x/IIIIlIl.Il ()Lnet/minecraft/class_2338;
      // 0a: invokevirtual k74/x/IIIIIIlII.lIIll (Lnet/minecraft/class_310;Lnet/minecraft/class_243;Lnet/minecraft/class_2338;)Z
      // 0d: ifne 16
      // 10: bipush 0
      // 11: ireturn
      // 12: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15: athrow
      // 16: aload 0
      // 17: aload 1
      // 18: iload 3
      // 19: getstatic k74/x/IlIIIllIl.I Lk74/x/IlIIIllIl;
      // 1c: invokevirtual k74/x/IIIIIIlII.lIll (Lnet/minecraft/class_310;ILk74/x/IlIIIllIl;)Z
      // 1f: ifne 28
      // 22: bipush 0
      // 23: ireturn
      // 24: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 27: athrow
      // 28: aload 0
      // 29: aload 1
      // 2a: invokevirtual k74/x/IIIIIIlII.I (Lnet/minecraft/class_310;)V
      // 2d: aload 1
      // 2e: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 31: invokestatic k74/x/IIll.IlIlIll (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;
      // 34: astore 4
      // 36: aload 4
      // 38: ifnull 54
      // 3b: aload 4
      // 3d: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 42: ifeq 54
      // 45: goto 4c
      // 48: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4b: athrow
      // 4c: bipush 1
      // 4d: goto 55
      // 50: invokestatic k74/x/IIIIIIlII.IIIl (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 53: athrow
      // 54: bipush 0
      // 55: ireturn
   }

   private static String lllIl(int var0, int var1) {
      int var9 = 539320085;
      int var2 = (var0 ^ llllI(-876739447, var9 ^ 183472031)) & llllI(-876739434, var9 ^ 901573273);
      if (lIIl[var2] == null) {
         char[] var3 = IIlIl[var2].toCharArray();

         int var4 = switch (var3[0] & llllI(-876739433, var9 ^ 579369790)) {
            case 0 -> llllI(-876739436, var9 ^ -530623245);
            case 1 -> llllI(-876739435, var9 ^ 1758655420);
            case 2 -> llllI(-876739438, var9 ^ 1819356227);
            case 3 -> llllI(-876739437, var9 ^ 1767958193);
            case 4 -> llllI(-876739440, var9 ^ -1700128717);
            case 5 -> llllI(-876739439, var9 ^ 127510734);
            case 6 -> llllI(-876739426, var9 ^ -563131803);
            case 7 -> llllI(-876739425, var9 ^ 385120569);
            case 8 -> llllI(-876739428, var9 ^ -560598170);
            case 9 -> llllI(-876739427, var9 ^ 407758186);
            case 10 -> llllI(-876739430, var9 ^ 719253150);
            case 11 -> llllI(-876739429, var9 ^ 1871774467);
            case 12 -> llllI(-876739432, var9 ^ 2074070778);
            case 13 -> llllI(-876739431, var9 ^ -519934533);
            case 14 -> llllI(-876739354, var9 ^ -972890998);
            case 15 -> llllI(-876739353, var9 ^ -588539031);
            case 16 -> 3;
            case 17 -> llllI(-876739356, var9 ^ -427290205);
            case 18 -> llllI(-876739355, var9 ^ 1261640693);
            case 19 -> llllI(-876739358, var9 ^ -336591921);
            case 20 -> llllI(-876739357, var9 ^ 1242340788);
            case 21 -> llllI(-876739360, var9 ^ 1429072238);
            case 22 -> llllI(-876739359, var9 ^ -568008494);
            case 23 -> llllI(-876739346, var9 ^ 1220106819);
            case 24 -> llllI(-876739345, var9 ^ -41117398);
            case 25 -> llllI(-876739348, var9 ^ 1227831464);
            case 26 -> llllI(-876739347, var9 ^ 704923028);
            case 27 -> llllI(-876739350, var9 ^ 1694792240);
            case 28 -> llllI(-876739349, var9 ^ 1812292723);
            case 29 -> llllI(-876739352, var9 ^ 349654285);
            case 30 -> llllI(-876739351, var9 ^ -1686009744);
            case 31 -> llllI(-876739338, var9 ^ 2009042733);
            case 32 -> llllI(-876739337, var9 ^ 340655027);
            case 33 -> llllI(-876739340, var9 ^ -289137921);
            case 34 -> llllI(-876739339, var9 ^ 649073540);
            case 35 -> llllI(-876739342, var9 ^ -168583612);
            case 36 -> llllI(-876739341, var9 ^ -310397194);
            case 37 -> llllI(-876739344, var9 ^ -613166806);
            case 38 -> llllI(-876739343, var9 ^ -1521367856);
            case 39 -> llllI(-876739330, var9 ^ 1506882455);
            case 40 -> llllI(-876739329, var9 ^ 123847164);
            case 41 -> llllI(-876739332, var9 ^ -373458897);
            case 42 -> 1;
            case 43 -> llllI(-876739331, var9 ^ 43463669);
            case 44 -> llllI(-876739334, var9 ^ -1876801367);
            case 45 -> llllI(-876739333, var9 ^ -521022108);
            case 46 -> llllI(-876739336, var9 ^ -1889297374);
            case 47 -> llllI(-876739335, var9 ^ -520571929);
            case 48 -> llllI(-876739386, var9 ^ 1230130224);
            case 49 -> llllI(-876739385, var9 ^ -482102165);
            case 50 -> llllI(-876739388, var9 ^ -310394616);
            case 51 -> llllI(-876739387, var9 ^ 1419775851);
            case 52 -> llllI(-876739390, var9 ^ 205802921);
            case 53 -> llllI(-876739389, var9 ^ -334241158);
            case 54 -> llllI(-876739392, var9 ^ 1728963405);
            case 55 -> llllI(-876739391, var9 ^ -1410088731);
            case 56 -> llllI(-876739378, var9 ^ -267593961);
            case 57 -> llllI(-876739377, var9 ^ 1526233780);
            case 58 -> llllI(-876739380, var9 ^ 53385376);
            case 59 -> llllI(-876739379, var9 ^ 818532411);
            case 60 -> 2;
            case 61 -> llllI(-876739382, var9 ^ -117614625);
            case 62 -> llllI(-876739381, var9 ^ -366530797);
            case 63 -> llllI(-876739384, var9 ^ 1122362816);
            case 64 -> llllI(-876739383, var9 ^ -1857584752);
            case 65 -> llllI(-876739370, var9 ^ -163718765);
            case 66 -> llllI(-876739369, var9 ^ 1632879406);
            case 67 -> llllI(-876739372, var9 ^ 585318344);
            case 68 -> llllI(-876739371, var9 ^ -1365265639);
            case 69 -> llllI(-876739374, var9 ^ -2061147704);
            case 70 -> llllI(-876739373, var9 ^ -1184639652);
            case 71 -> llllI(-876739376, var9 ^ -221031845);
            case 72 -> llllI(-876739375, var9 ^ 571996549);
            case 73 -> llllI(-876739362, var9 ^ 1863318544);
            case 74 -> llllI(-876739361, var9 ^ -1729016281);
            case 75 -> llllI(-876739364, var9 ^ 1943214719);
            case 76 -> llllI(-876739363, var9 ^ 327469935);
            case 77 -> llllI(-876739366, var9 ^ -1615828214);
            case 78 -> llllI(-876739365, var9 ^ 437216980);
            case 79 -> llllI(-876739368, var9 ^ 950254065);
            case 80 -> llllI(-876739367, var9 ^ 2022959499);
            case 81 -> llllI(-876739546, var9 ^ -700067222);
            case 82 -> llllI(-876739545, var9 ^ -1870518589);
            case 83 -> llllI(-876739548, var9 ^ 630947686);
            case 84 -> llllI(-876739547, var9 ^ 1805254588);
            case 85 -> llllI(-876739550, var9 ^ 683903690);
            case 86 -> llllI(-876739549, var9 ^ -1367414619);
            case 87 -> llllI(-876739552, var9 ^ 114724070);
            case 88 -> llllI(-876739551, var9 ^ 1762259825);
            case 89 -> llllI(-876739538, var9 ^ 465657110);
            case 90 -> llllI(-876739537, var9 ^ -345047226);
            case 91 -> llllI(-876739540, var9 ^ -1422382605);
            case 92 -> llllI(-876739539, var9 ^ 1510766048);
            case 93 -> llllI(-876739542, var9 ^ 364914482);
            case 94 -> llllI(-876739541, var9 ^ -276373101);
            case 95 -> llllI(-876739544, var9 ^ 2101803540);
            case 96 -> llllI(-876739543, var9 ^ -1323796891);
            case 97 -> llllI(-876739530, var9 ^ -656000744);
            case 98 -> llllI(-876739529, var9 ^ 50071342);
            case 99 -> llllI(-876739532, var9 ^ 1107456479);
            case 100 -> llllI(-876739531, var9 ^ -1542289069);
            case 101 -> llllI(-876739534, var9 ^ -940961631);
            case 102 -> llllI(-876739533, var9 ^ 1904944508);
            case 103 -> llllI(-876739536, var9 ^ 1555617423);
            case 104 -> llllI(-876739535, var9 ^ -24632367);
            case 105 -> llllI(-876739522, var9 ^ 941682390);
            case 106 -> llllI(-876739521, var9 ^ -1585249837);
            case 107 -> llllI(-876739524, var9 ^ -620515641);
            case 108 -> llllI(-876739523, var9 ^ 1373647864);
            case 109 -> llllI(-876739526, var9 ^ 1021286775);
            case 110 -> llllI(-876739525, var9 ^ -226761273);
            case 111 -> llllI(-876739528, var9 ^ -1224559273);
            case 112 -> llllI(-876739527, var9 ^ 1267684503);
            case 113 -> llllI(-876739578, var9 ^ -723528724);
            case 114 -> llllI(-876739577, var9 ^ -1177649198);
            case 115 -> llllI(-876739580, var9 ^ 625407859);
            case 116 -> llllI(-876739579, var9 ^ -252720585);
            case 117 -> llllI(-876739582, var9 ^ -243182075);
            case 118 -> llllI(-876739581, var9 ^ -1017614474);
            case 119 -> llllI(-876739584, var9 ^ 1700852536);
            case 120 -> llllI(-876739583, var9 ^ -655538480);
            case 121 -> llllI(-876739570, var9 ^ 121805038);
            case 122 -> llllI(-876739569, var9 ^ -165116706);
            case 123 -> llllI(-876739572, var9 ^ -1993866924);
            case 124 -> llllI(-876739571, var9 ^ 1114349136);
            case 125 -> llllI(-876739574, var9 ^ -1255964557);
            case 126 -> llllI(-876739573, var9 ^ 2069042402);
            case 127 -> llllI(-876739576, var9 ^ -1060766383);
            case 128 -> llllI(-876739575, var9 ^ 1074521070);
            case 129 -> llllI(-876739562, var9 ^ 999177762);
            case 130 -> llllI(-876739561, var9 ^ -2126860749);
            case 131 -> llllI(-876739564, var9 ^ -248824625);
            case 132 -> llllI(-876739563, var9 ^ 337221921);
            case 133 -> llllI(-876739566, var9 ^ -1264846232);
            case 134 -> llllI(-876739565, var9 ^ 2102655410);
            case 135 -> llllI(-876739568, var9 ^ 230397920);
            case 136 -> llllI(-876739567, var9 ^ 511881820);
            case 137 -> llllI(-876739554, var9 ^ 958271773);
            case 138 -> llllI(-876739553, var9 ^ -85973898);
            case 139 -> llllI(-876739556, var9 ^ -825012238);
            case 140 -> llllI(-876739555, var9 ^ 605952424);
            case 141 -> llllI(-876739558, var9 ^ 1937645554);
            case 142 -> llllI(-876739557, var9 ^ -490796014);
            case 143 -> llllI(-876739560, var9 ^ 1801920884);
            case 144 -> llllI(-876739559, var9 ^ 422935751);
            case 145 -> llllI(-876739482, var9 ^ -1658063493);
            case 146 -> llllI(-876739481, var9 ^ -148026216);
            case 147 -> llllI(-876739484, var9 ^ 1111463847);
            case 148 -> llllI(-876739483, var9 ^ -2028178121);
            case 149 -> llllI(-876739486, var9 ^ -1441311266);
            case 150 -> llllI(-876739485, var9 ^ 1537448446);
            case 151 -> llllI(-876739488, var9 ^ 1748533826);
            case 152 -> llllI(-876739487, var9 ^ 208532342);
            case 153 -> llllI(-876739474, var9 ^ -1726663668);
            case 154 -> llllI(-876739473, var9 ^ -521433847);
            case 155 -> llllI(-876739476, var9 ^ 1100968970);
            case 156 -> llllI(-876739475, var9 ^ -1826469751);
            case 157 -> llllI(-876739478, var9 ^ -1818391659);
            case 158 -> llllI(-876739477, var9 ^ -776390284);
            case 159 -> llllI(-876739480, var9 ^ -301323987);
            case 160 -> llllI(-876739479, var9 ^ -926908512);
            case 161 -> llllI(-876739466, var9 ^ 1683690730);
            case 162 -> llllI(-876739465, var9 ^ 1480449278);
            case 163 -> llllI(-876739468, var9 ^ -320282210);
            case 164 -> llllI(-876739467, var9 ^ -1726812231);
            case 165 -> llllI(-876739470, var9 ^ -1450123679);
            case 166 -> llllI(-876739469, var9 ^ 369275604);
            case 167 -> llllI(-876739472, var9 ^ -508734191);
            case 168 -> llllI(-876739471, var9 ^ -702223801);
            case 169 -> llllI(-876739458, var9 ^ 676290839);
            case 170 -> llllI(-876739457, var9 ^ 391267847);
            case 171 -> llllI(-876739460, var9 ^ -677652773);
            case 172 -> llllI(-876739459, var9 ^ -1547644252);
            case 173 -> llllI(-876739462, var9 ^ 1327460468);
            case 174 -> llllI(-876739461, var9 ^ 1964130728);
            case 175 -> llllI(-876739464, var9 ^ 1529313313);
            case 176 -> llllI(-876739463, var9 ^ -1737062409);
            case 177 -> llllI(-876739514, var9 ^ 1857003588);
            case 178 -> llllI(-876739513, var9 ^ -556840496);
            case 179 -> llllI(-876739516, var9 ^ 470504867);
            case 180 -> llllI(-876739515, var9 ^ 1142404798);
            case 181 -> llllI(-876739518, var9 ^ -1203908037);
            case 182 -> llllI(-876739517, var9 ^ 1277562641);
            case 183 -> llllI(-876739520, var9 ^ 1308518041);
            case 184 -> llllI(-876739519, var9 ^ -705457725);
            case 185 -> llllI(-876739506, var9 ^ 315116279);
            case 186 -> llllI(-876739505, var9 ^ -1366384643);
            case 187 -> llllI(-876739508, var9 ^ -1099697044);
            case 188 -> llllI(-876739507, var9 ^ -1062890088);
            case 189 -> llllI(-876739510, var9 ^ -1180584163);
            case 190 -> llllI(-876739509, var9 ^ 1617821963);
            case 191 -> llllI(-876739512, var9 ^ -1450661282);
            case 192 -> 4;
            case 193 -> 5;
            case 194 -> llllI(-876739511, var9 ^ -1250960352);
            case 195 -> llllI(-876739498, var9 ^ 1327537143);
            case 196 -> llllI(-876739497, var9 ^ 1293613745);
            case 197 -> llllI(-876739500, var9 ^ 508981660);
            case 198 -> llllI(-876739499, var9 ^ 1094935388);
            case 199 -> llllI(-876739502, var9 ^ 830376541);
            case 200 -> llllI(-876739501, var9 ^ -609834317);
            case 201 -> llllI(-876739504, var9 ^ 1190561273);
            case 202 -> llllI(-876739503, var9 ^ 271539483);
            case 203 -> llllI(-876739490, var9 ^ -1855360875);
            case 204 -> llllI(-876739489, var9 ^ -339044970);
            case 205 -> llllI(-876739492, var9 ^ -1318797202);
            case 206 -> llllI(-876739491, var9 ^ 870263082);
            case 207 -> llllI(-876739494, var9 ^ 456272644);
            case 208 -> llllI(-876739493, var9 ^ -1617504208);
            case 209 -> llllI(-876739496, var9 ^ 586981231);
            case 210 -> llllI(-876739495, var9 ^ -1258099348);
            case 211 -> llllI(-876739162, var9 ^ 1602706628);
            case 212 -> llllI(-876739161, var9 ^ 52758210);
            case 213 -> llllI(-876739164, var9 ^ -163366781);
            case 214 -> llllI(-876739163, var9 ^ 242612987);
            case 215 -> llllI(-876739166, var9 ^ -583507114);
            case 216 -> llllI(-876739165, var9 ^ -477800614);
            case 217 -> llllI(-876739168, var9 ^ 1223188178);
            case 218 -> llllI(-876739167, var9 ^ -1797586944);
            case 219 -> llllI(-876739154, var9 ^ 736415807);
            case 220 -> llllI(-876739153, var9 ^ -2023740495);
            case 221 -> llllI(-876739156, var9 ^ 240628222);
            case 222 -> llllI(-876739155, var9 ^ -1937698111);
            case 223 -> llllI(-876739158, var9 ^ -1251004232);
            case 224 -> llllI(-876739157, var9 ^ -1133178605);
            case 225 -> llllI(-876739160, var9 ^ -777694531);
            case 226 -> llllI(-876739159, var9 ^ -2144074089);
            case 227 -> llllI(-876739146, var9 ^ -1534260877);
            case 228 -> llllI(-876739145, var9 ^ 1947231944);
            case 229 -> llllI(-876739148, var9 ^ -1444849887);
            case 230 -> llllI(-876739147, var9 ^ 1670128502);
            case 231 -> llllI(-876739150, var9 ^ 601473772);
            case 232 -> llllI(-876739149, var9 ^ 1055209843);
            case 233 -> llllI(-876739152, var9 ^ -2090113467);
            case 234 -> llllI(-876739151, var9 ^ -1498334027);
            case 235 -> llllI(-876739138, var9 ^ -551147968);
            case 236 -> llllI(-876739137, var9 ^ -2054648051);
            case 237 -> llllI(-876739140, var9 ^ 953596854);
            case 238 -> llllI(-876739139, var9 ^ -414070719);
            case 239 -> llllI(-876739142, var9 ^ 127279522);
            case 240 -> llllI(-876739141, var9 ^ 2105934746);
            case 241 -> llllI(-876739144, var9 ^ -1752845152);
            case 242 -> llllI(-876739143, var9 ^ -1858572604);
            case 243 -> llllI(-876739194, var9 ^ -1022956768);
            case 244 -> llllI(-876739193, var9 ^ -419603556);
            case 245 -> llllI(-876739196, var9 ^ 620407354);
            case 246 -> llllI(-876739195, var9 ^ 761507336);
            case 247 -> llllI(-876739198, var9 ^ -720436);
            case 248 -> llllI(-876739197, var9 ^ -261068183);
            case 249 -> llllI(-876739200, var9 ^ -1662810182);
            case 250 -> llllI(-876739199, var9 ^ -376221010);
            case 251 -> llllI(-876739186, var9 ^ 1065722337);
            case 252 -> llllI(-876739185, var9 ^ -1715603690);
            case 253 -> llllI(-876739188, var9 ^ -2066849647);
            case 254 -> 0;
            default -> llllI(-876739187, var9 ^ -44670658);
         };
         int var5 = (var1 & llllI(-876739190, var9 ^ 134674271)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & llllI(-876739189, var9 ^ -933967315)) >>> llllI(-876739192, var9 ^ 1011269121)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & llllI(-876739191, var9 ^ -37039019);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & llllI(-876739178, var9 ^ 892028085);
            }
         }

         lIIl[var2] = new String(var3).intern();
      }

      return lIIl[var2];
   }
}
