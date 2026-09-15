package k74.x;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import javax.sound.sampled.Clip;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
public final class llIIl extends IlIIIIIIl {
   private long II;
   private final IIlIII Il;
   private final IllIII<IlIll> I;
   private static final String[] lllI;
   private long lI;
   private long ll;
   private int III;
   private static final long IIl = 6000L;
   private final Random IlI;
   private int Ill;
   private final IlIIl lII;
   private static final IIIlIlIl lIl;
   private final Clip[] llI;
   private static final IIIlIlIl lll;
   private static final IIIlIlIl IIII;
   private static final IIIlIlIl IIIl;
   private static final IIIlIlIl IIlI;
   private class_1657 IIll;
   private static final int[] llIl;
   private static final Object[] llll;
   private static final long IlII = 1200L;
   private int IlIl;
   private static final IIIlIlIl IllI;
   private static final IIIlIlIl Illl;
   private static final IIIlIlIl lIII;
   private static final IIIlIlIl lIIl;
   private static final long lIlI = 2500L;
   private static final IIIlIlIl lIll;
   private static final double llII = 484.0;

   private void I(int var1, double var2) {
      CompletableFuture.runAsync(this::Il);
   }

   private static String lII(short var0, int var1, int var2) {
      int var3 = var1 ^ 36729;
      char[] var4 = lllI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])llll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         llll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 12103;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '跑';
         var10 -= 64100;
         var10 -= 63402;
         var10 ^= 50103;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int Ill(int var0, int var1) {
      int var2 = llIl[var0 ^ -704617954] ^ var1 ^ var0;
      var2 ^= 48928;
      var2 -= 57353;
      var2 ^= 31472;
      var2 += 52376;
      var2 ^= 30959;
      var2 ^= 2313;
      return var2 ^ 9084;
   }

   @Override
   public void lllIlI(class_1297 param1, byte param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual k74/x/llIIl.IIIIlIl ()Z
      // 004: ifne 00c
      // 007: return
      // 008: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00b: athrow
      // 00c: iload 2
      // 00d: bipush 3
      // 00e: if_icmpeq 02b
      // 011: iload 2
      // 012: ldc -704617954
      // 014: ldc 560371871
      // 016: ldc 1640828953
      // 018: ixor
      // 019: invokestatic k74/x/llIIl.Ill (II)I
      // 01c: if_icmpeq 02b
      // 01f: goto 026
      // 022: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: return
      // 027: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 02a: athrow
      // 02b: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 02e: astore 3
      // 02f: aload 3
      // 030: ifnull 076
      // 033: aload 3
      // 034: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 037: ifnull 076
      // 03a: goto 041
      // 03d: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: aload 3
      // 042: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 045: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 048: ifeq 076
      // 04b: goto 052
      // 04e: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 051: athrow
      // 052: aload 3
      // 053: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 056: invokevirtual net/minecraft/class_746.method_29504 ()Z
      // 059: ifne 076
      // 05c: goto 063
      // 05f: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: aload 3
      // 064: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 067: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 06a: fconst_0
      // 06b: fcmpg
      // 06c: ifgt 07b
      // 06f: goto 076
      // 072: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 075: athrow
      // 076: return
      // 077: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 07a: athrow
      // 07b: aload 1
      // 07c: instanceof net/minecraft/class_1657
      // 07f: ifeq 121
      // 082: aload 1
      // 083: checkcast net/minecraft/class_1657
      // 086: astore 4
      // 088: aload 0
      // 089: aload 4
      // 08b: invokevirtual k74/x/llIIl.II (Lnet/minecraft/class_1657;)Z
      // 08e: ifne 121
      // 091: invokestatic java/lang/System.currentTimeMillis ()J
      // 094: lstore 5
      // 096: aload 4
      // 098: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 09b: aload 0
      // 09c: getfield k74/x/llIIl.Ill I
      // 09f: if_icmpne 0bf
      // 0a2: lload 5
      // 0a4: aload 0
      // 0a5: getfield k74/x/llIIl.lI J
      // 0a8: lsub
      // 0a9: ldc2_w 6000
      // 0ac: lcmp
      // 0ad: ifge 0bf
      // 0b0: goto 0b7
      // 0b3: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b6: athrow
      // 0b7: bipush 1
      // 0b8: goto 0c0
      // 0bb: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0be: athrow
      // 0bf: bipush 0
      // 0c0: istore 7
      // 0c2: aload 4
      // 0c4: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 0c7: aload 0
      // 0c8: getfield k74/x/llIIl.III I
      // 0cb: if_icmpne 0d6
      // 0ce: bipush 1
      // 0cf: goto 0d7
      // 0d2: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: bipush 0
      // 0d7: istore 8
      // 0d9: aload 3
      // 0da: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0dd: aload 4
      // 0df: invokevirtual net/minecraft/class_746.method_5858 (Lnet/minecraft/class_1297;)D
      // 0e2: ldc2_w 484.0
      // 0e5: dcmpg
      // 0e6: ifgt 0f1
      // 0e9: bipush 1
      // 0ea: goto 0f2
      // 0ed: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: bipush 0
      // 0f2: istore 9
      // 0f4: iload 7
      // 0f6: ifne 105
      // 0f9: iload 8
      // 0fb: ifeq 121
      // 0fe: goto 105
      // 101: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: iload 9
      // 107: ifeq 121
      // 10a: goto 111
      // 10d: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 110: athrow
      // 111: aload 0
      // 112: aload 4
      // 114: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 117: invokevirtual k74/x/llIIl.l (I)V
      // 11a: goto 121
      // 11d: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 120: athrow
      // 121: return
   }

   private void l(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic java/lang/System.currentTimeMillis ()J
      // 03: lstore 2
      // 04: iload 1
      // 05: ldc -704617972
      // 07: ldc 1373990340
      // 09: ldc -1761857305
      // 0b: ixor
      // 0c: invokestatic k74/x/llIIl.Ill (II)I
      // 0f: if_icmpeq 3a
      // 12: aload 0
      // 13: getfield k74/x/llIIl.IlIl I
      // 16: iload 1
      // 17: if_icmpne 3a
      // 1a: goto 21
      // 1d: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: lload 2
      // 22: aload 0
      // 23: getfield k74/x/llIIl.ll J
      // 26: lsub
      // 27: ldc2_w 2500
      // 2a: lcmp
      // 2b: ifge 3a
      // 2e: goto 35
      // 31: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 34: athrow
      // 35: return
      // 36: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: lload 2
      // 3b: aload 0
      // 3c: getfield k74/x/llIIl.II J
      // 3f: lsub
      // 40: ldc2_w 1200
      // 43: lcmp
      // 44: ifge 4c
      // 47: return
      // 48: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: aload 0
      // 4d: iload 1
      // 4e: putfield k74/x/llIIl.IlIl I
      // 51: aload 0
      // 52: lload 2
      // 53: putfield k74/x/llIIl.ll J
      // 56: aload 0
      // 57: lload 2
      // 58: putfield k74/x/llIIl.II J
      // 5b: aload 0
      // 5c: getfield k74/x/llIIl.Il Lk74/x/IIlIII;
      // 5f: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 62: checkcast java/lang/Double
      // 65: invokevirtual java/lang/Double.doubleValue ()D
      // 68: dstore 4
      // 6a: dload 4
      // 6c: dconst_0
      // 6d: dcmpg
      // 6e: ifgt 76
      // 71: return
      // 72: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: aload 0
      // 77: getfield k74/x/llIIl.I Lk74/x/IllIII;
      // 7a: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 7d: checkcast k74/x/IlIll
      // 80: invokevirtual k74/x/IlIll.ordinal ()I
      // 83: tableswitch 33 0 4 63 47 51 55 59
      // a4: new java/lang/MatchException
      // a7: dup
      // a8: aconst_null
      // a9: aconst_null
      // aa: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // ad: athrow
      // ae: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // b1: athrow
      // b2: bipush 0
      // b3: goto ca
      // b6: bipush 1
      // b7: goto ca
      // ba: bipush 2
      // bb: goto ca
      // be: bipush 3
      // bf: goto ca
      // c2: aload 0
      // c3: getfield k74/x/llIIl.IlI Ljava/util/Random;
      // c6: bipush 4
      // c7: invokevirtual java/util/Random.nextInt (I)I
      // ca: istore 6
      // cc: aload 0
      // cd: iload 6
      // cf: dload 4
      // d1: invokevirtual k74/x/llIIl.I (ID)V
      // d4: return
   }

   private boolean II(class_1657 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 21
      // 08: aload 2
      // 09: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c: ifnull 21
      // 0f: goto 16
      // 12: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 1
      // 17: ifnonnull 27
      // 1a: goto 21
      // 1d: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: bipush 1
      // 22: ireturn
      // 23: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 26: athrow
      // 27: aload 1
      // 28: aload 2
      // 29: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2c: if_acmpeq 44
      // 2f: aload 1
      // 30: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 33: aload 2
      // 34: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 37: invokevirtual net/minecraft/class_746.method_5628 ()I
      // 3a: if_icmpne 4a
      // 3d: goto 44
      // 40: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 43: athrow
      // 44: bipush 1
      // 45: ireturn
      // 46: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: aload 1
      // 4b: invokestatic k74/x/IIlllIlll.II (Lnet/minecraft/class_1657;)Z
      // 4e: ireturn
   }

   private void Il(int param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: getfield k74/x/llIIl.llI [Ljavax/sound/sampled/Clip;
      // 004: iload 1
      // 005: aaload
      // 006: astore 4
      // 008: aload 4
      // 00a: ifnull 01e
      // 00d: aload 4
      // 00f: invokeinterface javax/sound/sampled/Clip.isOpen ()Z 1
      // 014: ifne 0bc
      // 017: goto 01e
      // 01a: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01d: athrow
      // 01e: aload 0
      // 01f: iload 1
      // 020: invokevirtual k74/x/llIIl.III (I)Ljava/io/InputStream;
      // 023: astore 5
      // 025: aload 5
      // 027: ifnull 090
      // 02a: new java/io/BufferedInputStream
      // 02d: dup
      // 02e: aload 5
      // 030: invokespecial java/io/BufferedInputStream.<init> (Ljava/io/InputStream;)V
      // 033: invokestatic javax/sound/sampled/AudioSystem.getAudioInputStream (Ljava/io/InputStream;)Ljavax/sound/sampled/AudioInputStream;
      // 036: astore 6
      // 038: invokestatic javax/sound/sampled/AudioSystem.getClip ()Ljavax/sound/sampled/Clip;
      // 03b: astore 4
      // 03d: aload 4
      // 03f: aload 6
      // 041: invokeinterface javax/sound/sampled/Clip.open (Ljavax/sound/sampled/AudioInputStream;)V 2
      // 046: aload 0
      // 047: getfield k74/x/llIIl.llI [Ljavax/sound/sampled/Clip;
      // 04a: dup
      // 04b: astore 7
      // 04d: monitorenter
      // 04e: aload 0
      // 04f: getfield k74/x/llIIl.llI [Ljavax/sound/sampled/Clip;
      // 052: iload 1
      // 053: aload 4
      // 055: aastore
      // 056: aload 7
      // 058: monitorexit
      // 059: goto 064
      // 05c: astore 8
      // 05e: aload 7
      // 060: monitorexit
      // 061: aload 8
      // 063: athrow
      // 064: aload 6
      // 066: ifnull 090
      // 069: aload 6
      // 06b: invokevirtual javax/sound/sampled/AudioInputStream.close ()V
      // 06e: goto 090
      // 071: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 074: athrow
      // 075: astore 7
      // 077: aload 6
      // 079: ifnull 08d
      // 07c: aload 6
      // 07e: invokevirtual javax/sound/sampled/AudioInputStream.close ()V
      // 081: goto 08d
      // 084: astore 8
      // 086: aload 7
      // 088: aload 8
      // 08a: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 08d: aload 7
      // 08f: athrow
      // 090: aload 5
      // 092: ifnull 0bc
      // 095: aload 5
      // 097: invokevirtual java/io/InputStream.close ()V
      // 09a: goto 0bc
      // 09d: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a0: athrow
      // 0a1: astore 6
      // 0a3: aload 5
      // 0a5: ifnull 0b9
      // 0a8: aload 5
      // 0aa: invokevirtual java/io/InputStream.close ()V
      // 0ad: goto 0b9
      // 0b0: astore 7
      // 0b2: aload 6
      // 0b4: aload 7
      // 0b6: invokevirtual java/lang/Throwable.addSuppressed (Ljava/lang/Throwable;)V
      // 0b9: aload 6
      // 0bb: athrow
      // 0bc: aload 4
      // 0be: ifnull 14e
      // 0c1: aload 4
      // 0c3: invokeinterface javax/sound/sampled/Clip.isOpen ()Z 1
      // 0c8: ifeq 14e
      // 0cb: goto 0d2
      // 0ce: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: aload 4
      // 0d4: invokeinterface javax/sound/sampled/Clip.isRunning ()Z 1
      // 0d9: ifeq 0f1
      // 0dc: goto 0e3
      // 0df: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e2: athrow
      // 0e3: aload 4
      // 0e5: invokeinterface javax/sound/sampled/Clip.stop ()V 1
      // 0ea: goto 0f1
      // 0ed: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f0: athrow
      // 0f1: aload 4
      // 0f3: bipush 0
      // 0f4: invokeinterface javax/sound/sampled/Clip.setFramePosition (I)V 2
      // 0f9: aload 4
      // 0fb: getstatic javax/sound/sampled/FloatControl$Type.MASTER_GAIN Ljavax/sound/sampled/FloatControl$Type;
      // 0fe: invokeinterface javax/sound/sampled/Clip.isControlSupported (Ljavax/sound/sampled/Control$Type;)Z 2
      // 103: ifeq 147
      // 106: aload 4
      // 108: getstatic javax/sound/sampled/FloatControl$Type.MASTER_GAIN Ljavax/sound/sampled/FloatControl$Type;
      // 10b: invokeinterface javax/sound/sampled/Clip.getControl (Ljavax/sound/sampled/Control$Type;)Ljavax/sound/sampled/Control; 2
      // 110: checkcast javax/sound/sampled/FloatControl
      // 113: astore 5
      // 115: ldc2_w 1.0E-4
      // 118: dload 2
      // 119: ldc2_w 100.0
      // 11c: ddiv
      // 11d: invokestatic java/lang/Math.max (DD)D
      // 120: d2f
      // 121: fstore 6
      // 123: fload 6
      // 125: f2d
      // 126: invokestatic java/lang/Math.log10 (D)D
      // 129: ldc2_w 20.0
      // 12c: dmul
      // 12d: d2f
      // 12e: fstore 7
      // 130: aload 5
      // 132: aload 5
      // 134: invokevirtual javax/sound/sampled/FloatControl.getMinimum ()F
      // 137: aload 5
      // 139: invokevirtual javax/sound/sampled/FloatControl.getMaximum ()F
      // 13c: fload 7
      // 13e: invokestatic java/lang/Math.min (FF)F
      // 141: invokestatic java/lang/Math.max (FF)F
      // 144: invokevirtual javax/sound/sampled/FloatControl.setValue (F)V
      // 147: aload 4
      // 149: invokeinterface javax/sound/sampled/Clip.start ()V 1
      // 14e: goto 153
      // 151: astore 4
      // 153: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 2112558765;
      short var12 = 31798;
      String[] var10000 = new String[2];
      int var11 = 0;
      String[] var9 = var10000;
      int var8 = "_㰑뱍⪑葌⦱汌⥑摏㑱ﱍ⠑瑍㎑届㿱둏㶑ᱍ㰑뱍⪑葌⦱汌⥑摏㗱ᑏ⦱챏㞱\udc4d㓱ъ㗑\ue44c⥱ﱏ㻑届⠱汊㗱ⱊ㶱葌㶑챏㛱\ue44d⢱\uf44d㇑ొ㿱㑊⪑鑊㑑瑌㒑\u0c4f⠱鑍⧱\uec4a㈱둍㾑瑌㑱摍㜑鱌㚱鱊⥑ᱍ㓱ъ㗑䱍⠱ﱏ⥑摏㑱쑍㰱瑍ゑ届ゑ㑊⪑\u0099荀倣脀倡踀졞葀ꠣ軠뀣磡\ue823紡䡟賠뀣躀†莀⁞蒀\uf05e聠頣螠怣葠ꀣ轠뀣笁頡蕠ᠡ筁퀣軀ᠣ蘀ꠠ螀ꀣ贀耣膀堡芀렡管堣肀†蝠砡蝠桞肠젠穡\uf021谀쁞賀ဣ穁倣臠\ud823蘠࡞蹀쀣蹀\uf021膠㡞篁ဣ茀䠠螠怣賠怡聠†腠ࠡ耠⠣禁ࠠ軠栠蛀\ue823蝀\ue05e筡砣軠\uf821跀ᡞ蒠†艠頣紡倠磡校跠怠膀校菀恞砡ဣ腠類蓀䀠藀\uf021筡ဠ穁렡蕠ꀡ蒀퀣芠쀣蒀ࠣ蒠䡟轠젠篡ᠠ笁\ud820舀ꀠ蓠頣碁衞輀"
         .length();
      String var7 = "_㰑뱍⪑葌⦱汌⥑摏㑱ﱍ⠑瑍㎑届㿱둏㶑ᱍ㰑뱍⪑葌⦱汌⥑摏㗱ᑏ⦱챏㞱\udc4d㓱ъ㗑\ue44c⥱ﱏ㻑届⠱汊㗱ⱊ㶱葌㶑챏㛱\ue44d⢱\uf44d㇑ొ㿱㑊⪑鑊㑑瑌㒑\u0c4f⠱鑍⧱\uec4a㈱둍㾑瑌㑱摍㜑鱌㚱鱊⥑ᱍ㓱ъ㗑䱍⠱ﱏ⥑摏㑱쑍㰱瑍ゑ届ゑ㑊⪑\u0099荀倣脀倡踀졞葀ꠣ軠뀣磡\ue823紡䡟賠뀣躀†莀⁞蒀\uf05e聠頣螠怣葠ꀣ轠뀣笁頡蕠ᠡ筁퀣軀ᠣ蘀ꠠ螀ꀣ贀耣膀堡芀렡管堣肀†蝠砡蝠桞肠젠穡\uf021谀쁞賀ဣ穁倣臠\ud823蘠࡞蹀쀣蹀\uf021膠㡞篁ဣ茀䠠螠怣賠怡聠†腠ࠡ耠⠣禁ࠠ軠栠蛀\ue823蝀\ue05e筡砣軠\uf821跀ᡞ蒠†艠頣紡倠磡校跠怠膀校菀恞砡ဣ腠類蓀䀠藀\uf021筡ဠ穁렡蕠ꀡ蒀퀣芠쀣蒀ࠣ蒠䡟轠젠篡ᠠ笁\ud820舀ꀠ蓠頣碁衞輀";
      int var10 = 0;

      do {
         char var13 = var7.charAt(var11);
         char[] var20 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;
         char[] var14 = var20;

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

      lllI = var9;
      llll = new Object[var9.length];
      llIl = new int[25];
      byte var21 = 0;
      int var10001 = 0;
      byte[] var10002 = "çãT§\u008a\u0091\u0017z.®\bF²\u009bå§p*û\u009e«7ªAâS\u001b\u0084ÐßhõiA\u0018RD\u0004\u00008\u0010\u0080#Ö1\\·\u0004ºÃ{Hº5\u001f/\u009b\u0084!Z\u000eêkË\u000fzG3õ/v~àQ\u0080ì\u001aÇ\u0015=1ðfð}qÌ7x\u001c=lÊ©¡\u001db \u000bw"
         .getBytes("ISO-8859-1");

      int var54;
      do {
         llIl[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1900600344;
         var21 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var0 = new String[Ill(-704617953, var17 ^ 1345511393)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lII((short)10865, 36729, var17 ^ -494189584)).length();
      int var2 = Ill(-704617956, var17 ^ -200425252);
      int var19 = -1;

      label94:
      while (true) {
         int var22 = Ill(-704617955, var17 ^ 1748512500);
         String var26 = var3.substring(++var19, var19 + var2);
         byte var38 = -1;

         while (true) {
            label89: {
               char[] var56 = var26.toCharArray();
               int var68 = var56.length;
               int var6 = 0;
               var54 = var22;
               var43 = var56;
               var10001 = var68;
               char[] var80;
               int var87;
               if (var68 <= 1) {
                  var80 = var56;
                  var68 = var22;
                  var87 = var6;
               } else {
                  var54 = var22;
                  var10001 = var68;
                  if (var68 <= var6) {
                     break label89;
                  }

                  var80 = var56;
                  var68 = var22;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % Ill(-704617960, var17 ^ 955306231)) {
                     case 0 -> Ill(-704617959, var17 ^ 175940506);
                     case 1 -> Ill(-704617962, var17 ^ -1276980453);
                     case 2 -> Ill(-704617961, var17 ^ -1633170576);
                     case 3 -> Ill(-704617964, var17 ^ -903615679);
                     case 4 -> Ill(-704617963, var17 ^ -335578058);
                     case 5 -> Ill(-704617966, var17 ^ 1616949295);
                     default -> Ill(-704617965, var17 ^ 1620497836);
                  });
                  var6++;
                  if (var54 == 0) {
                     var87 = var54;
                     var80 = var43;
                     var68 = var54;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var80 = var43;
                     var68 = var54;
                     var87 = var6;
                  }
               }
            }

            String var61 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var0[var4++] = var61;
                  if ((var19 += var2) >= var5) {
                     Illl = IlIIllIII.Ill(var0[4]);
                     IIII = IlIIllIII.Ill(var0[Ill(-704617968, var17 ^ 1093134796)]);
                     lIII = IlIIllIII.Ill(var0[Ill(-704617967, var17 ^ -733372238)]);
                     lIll = IlIIllIII.Ill(var0[Ill(-704617970, var17 ^ -707162180)]);
                     IllI = IlIIllIII.Ill(var0[3]);
                     lIIl = IlIIllIII.Ill(var0[Ill(-704617969, var17 ^ 797752602)]);
                     IIIl = IlIIllIII.Ill(var0[1]);
                     lIl = IlIIllIII.Ill(var0[2]);
                     lll = IlIIllIII.Ill(var0[5]);
                     IIlI = IlIIllIII.Ill(var0[0]);
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var61;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label94;
                  }

                  var5 = (var3 = lII((short)19307, 36728, var17 ^ 237524448)).length();
                  var2 = Ill(-704617958, var17 ^ -1433848934);
                  var19 = -1;
            }

            var22 = Ill(-704617957, var17 ^ 1905549653);
            var26 = var3.substring(++var19, var19 + var2);
            var38 = 0;
         }
      }
   }

   @Override
   public void IlIlI(class_1297 var1) {
      try {
         if (!this.IIIIlIl()) {
            return;
         }
      } catch (MatchException var4) {
         throw ll(var4);
      }

      if (var1 instanceof class_1657 var2) {
         try {
            if (!this.II(var2)) {
               this.Ill = var2.method_5628();
               this.lI = System.currentTimeMillis();
            }
         } catch (MatchException var3) {
            throw ll(var3);
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void lI() {
      String[] var10000 = llIllIlI.IIlII();
      Clip[] var2 = this.llI;
      synchronized (this.llI){} // $VF: monitorenter 
      String[] var1 = var10000;

      try {
         int var3 = 0;

         while (var3 < this.llI.length) {
            Clip var4 = this.llI[var3];
            if (var4 != null) {
               try {
                  try {
                     if (var4.isRunning()) {
                        var4.stop();
                     }
                  } catch (Throwable var10) {
                     throw ll(var10);
                  }

                  var4.close();
               } catch (Throwable var11) {
               }

               this.llI[var3] = null;
            }

            var3++;
            if (var1 == null) {
               break;
            }
         }

         // $VF: monitorexit
      } finally {
         // $VF: monitorexit
      }
   }

   private static Throwable ll(Throwable var0) {
      return var0;
   }

   private InputStream III(int var1) {
      try {
         label26: {
            Path var2 = this.IIl(var1);

            try {
               if (var2 == null || !Files.isRegularFile(var2)) {
                  break label26;
               }
            } catch (Throwable var6) {
               throw ll(var6);
            }

            return Files.newInputStream(var2);
         }
      } catch (Throwable var7) {
      }

      ClassLoader var10000 = llIIl.class.getClassLoader();
      String var10001 = lll.llIl();
      int var10002 = var1 + 1;
      String var5 = IIlI.llIl();
      int var4 = var10002;
      String var3 = var10001;
      return var10000.getResourceAsStream(var3 + var4 + var5);
   }

   @Override
   public void llIl() {
      this.IIll = null;
      this.III = Ill(-704617971, -610528542 ^ -434906607);
      this.Ill = Ill(-704617974, -610528542 ^ -853235237);
      this.lI = 0L;
      this.IlIl = Ill(-704617973, -610528542 ^ -2119892195);
      this.ll = 0L;
      this.II = 0L;
      this.lI();
   }

   public llIIl(IlIIl var1) {
      super(Illl, lllIIlIl.IlI, IIII);
      this.I = this.IllIIll(new IllIII<>(lIII, IlIll.class, IlIll.l));
      this.Il = this.IllIIll(new IIlIII(lIll, 100.0, 0.0, 100.0, 5.0).IIIl(IllI));
      this.IlI = new Random();
      this.llI = new Clip[4];
      this.III = Ill(-704617976, -175404744 ^ -1428199009);
      this.Ill = Ill(-704617975, -175404744 ^ 409662959);
      this.lI = 0L;
      this.IlIl = Ill(-704617978, -175404744 ^ -1327276150);
      this.ll = 0L;
      this.II = 0L;
      this.lII = var1;
   }

   @Override
   public void IIlIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic k74/x/llIllIlI.IIlII ()[Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: invokevirtual k74/x/llIIl.IIIIlIl ()Z
      // 008: ifne 010
      // 00b: return
      // 00c: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00f: athrow
      // 010: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 013: astore 2
      // 014: aload 2
      // 015: ifnull 05b
      // 018: aload 2
      // 019: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01c: ifnull 05b
      // 01f: goto 026
      // 022: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 025: athrow
      // 026: aload 2
      // 027: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 02a: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 02d: ifeq 05b
      // 030: goto 037
      // 033: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 036: athrow
      // 037: aload 2
      // 038: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 03b: invokevirtual net/minecraft/class_746.method_29504 ()Z
      // 03e: ifne 05b
      // 041: goto 048
      // 044: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 047: athrow
      // 048: aload 2
      // 049: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 04c: invokevirtual net/minecraft/class_746.method_6032 ()F
      // 04f: fconst_0
      // 050: fcmpg
      // 051: ifgt 060
      // 054: goto 05b
      // 057: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05a: athrow
      // 05b: return
      // 05c: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 05f: athrow
      // 060: aload 0
      // 061: getfield k74/x/llIIl.lII Lk74/x/IlIIl;
      // 064: ifnonnull 06f
      // 067: aconst_null
      // 068: goto 076
      // 06b: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 06e: athrow
      // 06f: aload 0
      // 070: getfield k74/x/llIIl.lII Lk74/x/IlIIl;
      // 073: invokevirtual k74/x/IlIIl.lIII ()Lnet/minecraft/class_1309;
      // 076: astore 3
      // 077: aload 3
      // 078: instanceof net/minecraft/class_1657
      // 07b: ifeq 0a7
      // 07e: aload 3
      // 07f: checkcast net/minecraft/class_1657
      // 082: astore 4
      // 084: aload 0
      // 085: aload 4
      // 087: invokevirtual k74/x/llIIl.II (Lnet/minecraft/class_1657;)Z
      // 08a: ifne 0a7
      // 08d: aload 0
      // 08e: aload 4
      // 090: putfield k74/x/llIIl.IIll Lnet/minecraft/class_1657;
      // 093: aload 0
      // 094: aload 4
      // 096: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 099: putfield k74/x/llIIl.III I
      // 09c: aload 1
      // 09d: ifnonnull 117
      // 0a0: goto 0a7
      // 0a3: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield k74/x/llIIl.IIll Lnet/minecraft/class_1657;
      // 0ab: ifnull 117
      // 0ae: goto 0b5
      // 0b1: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b4: athrow
      // 0b5: aload 0
      // 0b6: getfield k74/x/llIIl.IIll Lnet/minecraft/class_1657;
      // 0b9: invokevirtual net/minecraft/class_1657.method_5805 ()Z
      // 0bc: ifeq 0ea
      // 0bf: goto 0c6
      // 0c2: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: getfield k74/x/llIIl.IIll Lnet/minecraft/class_1657;
      // 0ca: invokevirtual net/minecraft/class_1657.method_29504 ()Z
      // 0cd: ifne 0ea
      // 0d0: goto 0d7
      // 0d3: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: getfield k74/x/llIIl.IIll Lnet/minecraft/class_1657;
      // 0db: invokevirtual net/minecraft/class_1657.method_6032 ()F
      // 0de: fconst_0
      // 0df: fcmpg
      // 0e0: ifgt 112
      // 0e3: goto 0ea
      // 0e6: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e9: athrow
      // 0ea: aload 2
      // 0eb: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0ee: aload 0
      // 0ef: getfield k74/x/llIIl.IIll Lnet/minecraft/class_1657;
      // 0f2: invokevirtual net/minecraft/class_746.method_5858 (Lnet/minecraft/class_1297;)D
      // 0f5: ldc2_w 484.0
      // 0f8: dcmpg
      // 0f9: ifgt 112
      // 0fc: goto 103
      // 0ff: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 102: athrow
      // 103: aload 0
      // 104: aload 0
      // 105: getfield k74/x/llIIl.III I
      // 108: invokevirtual k74/x/llIIl.l (I)V
      // 10b: goto 112
      // 10e: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 111: athrow
      // 112: aload 0
      // 113: aconst_null
      // 114: putfield k74/x/llIIl.IIll Lnet/minecraft/class_1657;
      // 117: aload 0
      // 118: getfield k74/x/llIIl.lII Lk74/x/IlIIl;
      // 11b: ifnonnull 126
      // 11e: aconst_null
      // 11f: goto 12d
      // 122: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 125: athrow
      // 126: aload 0
      // 127: getfield k74/x/llIIl.lII Lk74/x/IlIIl;
      // 12a: invokevirtual k74/x/IlIIl.l ()Lnet/minecraft/class_1309;
      // 12d: astore 4
      // 12f: aload 4
      // 131: instanceof net/minecraft/class_1657
      // 134: ifeq 1b0
      // 137: aload 4
      // 139: checkcast net/minecraft/class_1657
      // 13c: astore 5
      // 13e: aload 0
      // 13f: aload 5
      // 141: invokevirtual k74/x/llIIl.II (Lnet/minecraft/class_1657;)Z
      // 144: ifne 1b0
      // 147: aload 5
      // 149: invokevirtual net/minecraft/class_1657.method_5805 ()Z
      // 14c: ifeq 176
      // 14f: goto 156
      // 152: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 155: athrow
      // 156: aload 5
      // 158: invokevirtual net/minecraft/class_1657.method_29504 ()Z
      // 15b: ifne 176
      // 15e: goto 165
      // 161: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 164: athrow
      // 165: aload 5
      // 167: invokevirtual net/minecraft/class_1657.method_6032 ()F
      // 16a: fconst_0
      // 16b: fcmpg
      // 16c: ifgt 1b0
      // 16f: goto 176
      // 172: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 175: athrow
      // 176: invokestatic java/lang/System.currentTimeMillis ()J
      // 179: lstore 6
      // 17b: lload 6
      // 17d: aload 0
      // 17e: getfield k74/x/llIIl.lI J
      // 181: lsub
      // 182: ldc2_w 6000
      // 185: lcmp
      // 186: ifge 1b0
      // 189: aload 2
      // 18a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18d: aload 5
      // 18f: invokevirtual net/minecraft/class_746.method_5858 (Lnet/minecraft/class_1297;)D
      // 192: ldc2_w 484.0
      // 195: dcmpg
      // 196: ifgt 1b0
      // 199: goto 1a0
      // 19c: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19f: athrow
      // 1a0: aload 0
      // 1a1: aload 5
      // 1a3: invokevirtual net/minecraft/class_1657.method_5628 ()I
      // 1a6: invokevirtual k74/x/llIIl.l (I)V
      // 1a9: goto 1b0
      // 1ac: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1af: athrow
      // 1b0: return
   }

   private Path IIl(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 24
      // 08: aload 2
      // 09: invokevirtual k74/x/IIIIIllII.ll ()Lk74/x/IlllIlI;
      // 0c: ifnull 24
      // 0f: goto 16
      // 12: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: aload 2
      // 17: invokevirtual k74/x/IIIIIllII.ll ()Lk74/x/IlllIlI;
      // 1a: invokevirtual k74/x/IlllIlI.IIII ()Ljava/nio/file/Path;
      // 1d: goto 25
      // 20: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23: athrow
      // 24: aconst_null
      // 25: astore 3
      // 26: aload 3
      // 27: ifnull 7f
      // 2a: aload 3
      // 2b: invokeinterface java/nio/file/Path.getParent ()Ljava/nio/file/Path; 1
      // 30: ifnull 7f
      // 33: goto 3a
      // 36: invokestatic k74/x/llIIl.ll (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 39: athrow
      // 3a: aload 3
      // 3b: invokeinterface java/nio/file/Path.getParent ()Ljava/nio/file/Path; 1
      // 40: getstatic k74/x/llIIl.lIIl Lk74/x/IIIlIlIl;
      // 43: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 46: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 4b: getstatic k74/x/llIIl.IIIl Lk74/x/IIIlIlIl;
      // 4e: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 51: iload 1
      // 52: bipush 1
      // 53: iadd
      // 54: getstatic k74/x/llIIl.lIl Lk74/x/IIIlIlIl;
      // 57: invokevirtual k74/x/IIIlIlIl.llIl ()Ljava/lang/String;
      // 5a: astore 6
      // 5c: istore 5
      // 5e: astore 4
      // 60: new java/lang/StringBuilder
      // 63: dup
      // 64: invokespecial java/lang/StringBuilder.<init> ()V
      // 67: aload 4
      // 69: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 6c: iload 5
      // 6e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 71: aload 6
      // 73: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 76: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 79: invokeinterface java/nio/file/Path.resolve (Ljava/lang/String;)Ljava/nio/file/Path; 2
      // 7e: areturn
      // 7f: goto 83
      // 82: astore 2
      // 83: aconst_null
      // 84: areturn
   }
}
