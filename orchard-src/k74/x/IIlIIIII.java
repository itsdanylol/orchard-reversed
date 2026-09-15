package k74.x;

import java.util.ArrayDeque;
import java.util.regex.Pattern;

public final class IIlIIIII {
   private static final String[] I;
   private static final double II = 3.0;
   public static final double Il = 12.0;
   public static final double lI = 2.75;
   private long ll;
   public static final int III = 5;
   private static final int[] lllI;
   private double IIl;
   private static final Object[] IIIII;
   private double IlI;
   private long Ill = Long.MIN_VALUE;
   private static final double lII = 2.0;
   private double lIl;
   private double llI = Double.NaN;
   public static final int lll = 40;
   private final ArrayDeque<Long> IIII;
   private static final Pattern IIIl;
   private static final int IIlI = 2;
   public static final int l = 3;
   private static final int IIll = 3;
   private static final String[] llll;
   private double IlII;
   private static final double IlIl = 0.35;
   private int IllI;
   private static final String[] Illl;
   private static String[] lIII;
   private int lIIl;
   private static final int lIlI = 20;
   private double lIll;
   private static final double llII = 0.5;
   private int llIl;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = lll(1191946189, -786047374 ^ -1952118793) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lll(1191946188, -786047374 ^ 1404356321);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public static boolean l(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 20
      // 04: getstatic k74/x/IIlIIIII.IIIl Ljava/util/regex/Pattern;
      // 07: aload 0
      // 08: invokevirtual java/util/regex/Pattern.matcher (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
      // 0b: invokevirtual java/util/regex/Matcher.matches ()Z
      // 0e: ifeq 20
      // 11: goto 18
      // 14: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 17: athrow
      // 18: bipush 1
      // 19: goto 21
      // 1c: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
   }

   private static IllegalArgumentException II(IllegalArgumentException var0) {
      return var0;
   }

   private boolean Il(long var1) {
      String[] var3 = IIllllIl.IIIIl();

      while (!this.IIII.isEmpty()) {
         try {
            if (var1 - this.IIII.peekFirst() <= 40L) {
               break;
            }

            this.IIII.removeFirst();
            if (var3 != null) {
               break;
            }
         } catch (IllegalArgumentException var5) {
            throw II(var5);
         }
      }

      try {
         this.IIII.addLast(var1);
         if (this.IIII.size() >= 3) {
            return true;
         }
      } catch (IllegalArgumentException var4) {
         throw II(var4);
      }

      return false;
   }

   public IIlIIIII() {
      this.ll = Long.MIN_VALUE;
      this.IIII = new ArrayDeque<>();
   }

   public IlIlIIlIl lI(IllIlllI param1, IlII param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 3
      // 004: aload 1
      // 005: ifnonnull 01c
      // 008: new java/lang/IllegalArgumentException
      // 00b: dup
      // 00c: getstatic k74/x/IIlIIIII.lIII [Ljava/lang/String;
      // 00f: bipush 1
      // 010: aaload
      // 011: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 014: invokespecial java/lang/IllegalArgumentException.<init> (Ljava/lang/String;)V
      // 017: athrow
      // 018: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 01b: athrow
      // 01c: aload 2
      // 01d: ifnonnull 02a
      // 020: getstatic k74/x/IlII.III Lk74/x/IlII;
      // 023: goto 02b
      // 026: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 029: athrow
      // 02a: aload 2
      // 02b: astore 4
      // 02d: aload 1
      // 02e: invokevirtual k74/x/IllIlllI.lII ()J
      // 031: aload 0
      // 032: getfield k74/x/IIlIIIII.Ill J
      // 035: lcmp
      // 036: ifne 048
      // 039: aload 0
      // 03a: aload 4
      // 03c: aload 1
      // 03d: invokevirtual k74/x/IllIlllI.lII ()J
      // 040: invokevirtual k74/x/IIlIIIII.IIl (Lk74/x/IlII;J)Lk74/x/IlIlIIlIl;
      // 043: areturn
      // 044: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 047: athrow
      // 048: aload 1
      // 049: invokevirtual k74/x/IllIlllI.lII ()J
      // 04c: aload 0
      // 04d: getfield k74/x/IIlIIIII.Ill J
      // 050: lcmp
      // 051: ifge 05f
      // 054: aload 0
      // 055: invokevirtual k74/x/IIlIIIII.IlI ()V
      // 058: goto 05f
      // 05b: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 05e: athrow
      // 05f: aload 0
      // 060: getfield k74/x/IIlIIIII.Ill J
      // 063: ldc2_w -9223372036854775808
      // 066: lcmp
      // 067: ifeq 072
      // 06a: bipush 1
      // 06b: goto 073
      // 06e: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 071: athrow
      // 072: bipush 0
      // 073: istore 5
      // 075: iload 5
      // 077: ifeq 08a
      // 07a: aload 1
      // 07b: invokevirtual k74/x/IllIlllI.lII ()J
      // 07e: aload 0
      // 07f: getfield k74/x/IIlIIIII.Ill J
      // 082: lsub
      // 083: goto 08b
      // 086: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 089: athrow
      // 08a: lconst_1
      // 08b: lstore 6
      // 08d: ldc2_w 0.35
      // 090: lconst_1
      // 091: lload 6
      // 093: invokestatic java/lang/Math.max (JJ)J
      // 096: ldc2_w 40
      // 099: invokestatic java/lang/Math.min (JJ)J
      // 09c: l2d
      // 09d: dmul
      // 09e: dstore 8
      // 0a0: aload 0
      // 0a1: dconst_0
      // 0a2: aload 0
      // 0a3: getfield k74/x/IIlIIIII.lIl D
      // 0a6: dload 8
      // 0a8: dsub
      // 0a9: invokestatic java/lang/Math.max (DD)D
      // 0ac: putfield k74/x/IIlIIIII.lIl D
      // 0af: aload 0
      // 0b0: dconst_0
      // 0b1: aload 0
      // 0b2: getfield k74/x/IIlIIIII.lIll D
      // 0b5: dload 8
      // 0b7: dsub
      // 0b8: invokestatic java/lang/Math.max (DD)D
      // 0bb: putfield k74/x/IIlIIIII.lIll D
      // 0be: iload 5
      // 0c0: ifeq 0d9
      // 0c3: lload 6
      // 0c5: lconst_1
      // 0c6: lcmp
      // 0c7: ifne 0d9
      // 0ca: goto 0d1
      // 0cd: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d0: athrow
      // 0d1: bipush 1
      // 0d2: goto 0da
      // 0d5: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0d8: athrow
      // 0d9: bipush 0
      // 0da: istore 10
      // 0dc: iload 10
      // 0de: ifeq 111
      // 0e1: aload 1
      // 0e2: invokestatic k74/x/IIlIIIII.ll (Lk74/x/IllIlllI;)Z
      // 0e5: ifeq 111
      // 0e8: goto 0ef
      // 0eb: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 0ee: athrow
      // 0ef: aload 0
      // 0f0: getfield k74/x/IIlIIIII.IIl D
      // 0f3: aload 0
      // 0f4: getfield k74/x/IIlIIIII.IlI D
      // 0f7: aload 0
      // 0f8: getfield k74/x/IIlIIIII.IlII D
      // 0fb: aload 1
      // 0fc: invokevirtual k74/x/IllIlllI.Ill ()D
      // 0ff: aload 1
      // 100: invokevirtual k74/x/IllIlllI.lI ()D
      // 103: aload 1
      // 104: invokevirtual k74/x/IllIlllI.llI ()D
      // 107: invokestatic k74/x/IIlIIIII.Ill (DDDDDD)D
      // 10a: goto 114
      // 10d: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 110: athrow
      // 111: ldc2_w NaN
      // 114: dstore 11
      // 116: iload 10
      // 118: ifeq 140
      // 11b: aload 1
      // 11c: invokevirtual k74/x/IllIlllI.ll ()Z
      // 11f: ifne 140
      // 122: goto 129
      // 125: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 128: athrow
      // 129: dload 11
      // 12b: invokestatic java/lang/Double.isFinite (D)Z
      // 12e: ifeq 140
      // 131: goto 138
      // 134: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 137: athrow
      // 138: bipush 1
      // 139: goto 141
      // 13c: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 13f: athrow
      // 140: bipush 0
      // 141: istore 13
      // 143: iload 13
      // 145: ifeq 15e
      // 148: aload 1
      // 149: invokevirtual k74/x/IllIlllI.IIl ()Z
      // 14c: ifeq 15e
      // 14f: goto 156
      // 152: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 155: athrow
      // 156: bipush 1
      // 157: goto 15f
      // 15a: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 15d: athrow
      // 15e: bipush 0
      // 15f: istore 14
      // 161: aload 1
      // 162: invokevirtual k74/x/IllIlllI.lII ()J
      // 165: aload 0
      // 166: getfield k74/x/IIlIIIII.ll J
      // 169: lcmp
      // 16a: ifgt 175
      // 16d: bipush 1
      // 16e: goto 176
      // 171: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 174: athrow
      // 175: bipush 0
      // 176: istore 15
      // 178: bipush 0
      // 179: istore 16
      // 17b: iload 13
      // 17d: ifeq 1b9
      // 180: dload 11
      // 182: ldc2_w 12.0
      // 185: dcmpl
      // 186: iflt 1b9
      // 189: goto 190
      // 18c: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 18f: athrow
      // 190: aload 0
      // 191: aload 1
      // 192: invokevirtual k74/x/IllIlllI.lII ()J
      // 195: ldc2_w 5
      // 198: ladd
      // 199: putfield k74/x/IIlIIIII.ll J
      // 19c: bipush 1
      // 19d: istore 15
      // 19f: aload 0
      // 1a0: bipush 0
      // 1a1: putfield k74/x/IIlIIIII.llIl I
      // 1a4: aload 1
      // 1a5: invokevirtual k74/x/IllIlllI.IIl ()Z
      // 1a8: ifeq 22f
      // 1ab: aload 0
      // 1ac: aload 1
      // 1ad: invokevirtual k74/x/IllIlllI.lII ()J
      // 1b0: invokevirtual k74/x/IIlIIIII.Il (J)Z
      // 1b3: istore 16
      // 1b5: aload 3
      // 1b6: ifnull 22f
      // 1b9: aload 0
      // 1ba: getfield k74/x/IIlIIIII.llI D
      // 1bd: invokestatic java/lang/Double.isFinite (D)Z
      // 1c0: ifeq 1e3
      // 1c3: goto 1ca
      // 1c6: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1c9: athrow
      // 1ca: ldc2_w 0.5
      // 1cd: dconst_0
      // 1ce: aload 0
      // 1cf: getfield k74/x/IIlIIIII.llI D
      // 1d2: invokestatic java/lang/Math.max (DD)D
      // 1d5: ldc2_w 0.25
      // 1d8: dmul
      // 1d9: invokestatic java/lang/Math.min (DD)D
      // 1dc: goto 1e4
      // 1df: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e2: athrow
      // 1e3: dconst_0
      // 1e4: dstore 17
      // 1e6: ldc2_w 2.75
      // 1e9: dload 17
      // 1eb: dadd
      // 1ec: dstore 19
      // 1ee: iload 14
      // 1f0: ifeq 223
      // 1f3: iload 15
      // 1f5: ifne 223
      // 1f8: goto 1ff
      // 1fb: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1fe: athrow
      // 1ff: dload 11
      // 201: dload 19
      // 203: dcmpl
      // 204: iflt 223
      // 207: goto 20e
      // 20a: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 20d: athrow
      // 20e: aload 0
      // 20f: dup
      // 210: getfield k74/x/IIlIIIII.llIl I
      // 213: bipush 1
      // 214: iadd
      // 215: putfield k74/x/IIlIIIII.llIl I
      // 218: aload 3
      // 219: ifnull 22f
      // 21c: goto 223
      // 21f: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 222: athrow
      // 223: aload 0
      // 224: bipush 0
      // 225: putfield k74/x/IIlIIIII.llIl I
      // 228: goto 22f
      // 22b: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 22e: athrow
      // 22f: aload 1
      // 230: invokevirtual k74/x/IllIlllI.lIl ()Z
      // 233: ifeq 24c
      // 236: aload 1
      // 237: invokevirtual k74/x/IllIlllI.IIl ()Z
      // 23a: ifeq 24c
      // 23d: goto 244
      // 240: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 243: athrow
      // 244: bipush 1
      // 245: goto 24d
      // 248: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 24b: athrow
      // 24c: bipush 0
      // 24d: istore 17
      // 24f: aload 1
      // 250: invokevirtual k74/x/IllIlllI.IlI ()Z
      // 253: ifeq 26c
      // 256: aload 1
      // 257: invokevirtual k74/x/IllIlllI.IIl ()Z
      // 25a: ifeq 26c
      // 25d: goto 264
      // 260: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 263: athrow
      // 264: bipush 1
      // 265: goto 26d
      // 268: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 26b: athrow
      // 26c: bipush 0
      // 26d: istore 18
      // 26f: aload 0
      // 270: iload 17
      // 272: ifeq 292
      // 275: iload 10
      // 277: ifeq 28e
      // 27a: goto 281
      // 27d: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 280: athrow
      // 281: aload 0
      // 282: getfield k74/x/IIlIIIII.IllI I
      // 285: bipush 1
      // 286: iadd
      // 287: goto 293
      // 28a: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 28d: athrow
      // 28e: bipush 1
      // 28f: goto 293
      // 292: bipush 0
      // 293: putfield k74/x/IIlIIIII.IllI I
      // 296: aload 0
      // 297: iload 18
      // 299: ifeq 2b9
      // 29c: iload 10
      // 29e: ifeq 2b5
      // 2a1: goto 2a8
      // 2a4: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2a7: athrow
      // 2a8: aload 0
      // 2a9: getfield k74/x/IIlIIIII.lIIl I
      // 2ac: bipush 1
      // 2ad: iadd
      // 2ae: goto 2ba
      // 2b1: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b4: athrow
      // 2b5: bipush 1
      // 2b6: goto 2ba
      // 2b9: bipush 0
      // 2ba: putfield k74/x/IIlIIIII.lIIl I
      // 2bd: aload 0
      // 2be: getfield k74/x/IIlIIIII.IllI I
      // 2c1: bipush 3
      // 2c2: if_icmplt 2cd
      // 2c5: bipush 1
      // 2c6: goto 2ce
      // 2c9: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2cc: athrow
      // 2cd: bipush 0
      // 2ce: istore 19
      // 2d0: aload 0
      // 2d1: getfield k74/x/IIlIIIII.lIIl I
      // 2d4: ldc 1191946191
      // 2d6: ldc -408637089
      // 2d8: ldc -1786413844
      // 2da: ixor
      // 2db: invokestatic k74/x/IIlIIIII.lll (II)I
      // 2de: if_icmplt 2e9
      // 2e1: bipush 1
      // 2e2: goto 2ea
      // 2e5: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2e8: athrow
      // 2e9: bipush 0
      // 2ea: istore 20
      // 2ec: aload 0
      // 2ed: getfield k74/x/IIlIIIII.llIl I
      // 2f0: bipush 2
      // 2f1: if_icmplt 2fc
      // 2f4: bipush 1
      // 2f5: goto 2fd
      // 2f8: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2fb: athrow
      // 2fc: bipush 0
      // 2fd: istore 21
      // 2ff: aload 1
      // 300: invokevirtual k74/x/IllIlllI.II ()Z
      // 303: ifeq 455
      // 306: aload 1
      // 307: invokevirtual k74/x/IllIlllI.l ()Z
      // 30a: ifne 327
      // 30d: goto 314
      // 310: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 313: athrow
      // 314: aload 0
      // 315: dup
      // 316: getfield k74/x/IIlIIIII.lIl D
      // 319: ldc2_w 1.25
      // 31c: dadd
      // 31d: putfield k74/x/IIlIIIII.lIl D
      // 320: goto 327
      // 323: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 326: athrow
      // 327: aload 1
      // 328: invokevirtual k74/x/IllIlllI.I ()Z
      // 32b: ifne 341
      // 32e: aload 0
      // 32f: dup
      // 330: getfield k74/x/IIlIIIII.lIl D
      // 333: ldc2_w 1.5
      // 336: dadd
      // 337: putfield k74/x/IIlIIIII.lIl D
      // 33a: goto 341
      // 33d: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 340: athrow
      // 341: aload 1
      // 342: invokevirtual k74/x/IllIlllI.III ()Z
      // 345: ifeq 35b
      // 348: aload 0
      // 349: dup
      // 34a: getfield k74/x/IIlIIIII.lIl D
      // 34d: ldc2_w 2.0
      // 350: dadd
      // 351: putfield k74/x/IIlIIIII.lIl D
      // 354: goto 35b
      // 357: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 35a: athrow
      // 35b: iload 19
      // 35d: ifeq 373
      // 360: aload 0
      // 361: dup
      // 362: getfield k74/x/IIlIIIII.lIll D
      // 365: ldc2_w 0.8
      // 368: dadd
      // 369: putfield k74/x/IIlIIIII.lIll D
      // 36c: goto 373
      // 36f: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 372: athrow
      // 373: iload 20
      // 375: ifeq 38b
      // 378: aload 0
      // 379: dup
      // 37a: getfield k74/x/IIlIIIII.lIll D
      // 37d: ldc2_w 1.2
      // 380: dadd
      // 381: putfield k74/x/IIlIIIII.lIll D
      // 384: goto 38b
      // 387: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 38a: athrow
      // 38b: iload 21
      // 38d: ifeq 3a3
      // 390: aload 0
      // 391: dup
      // 392: getfield k74/x/IIlIIIII.lIll D
      // 395: ldc2_w 2.5
      // 398: dadd
      // 399: putfield k74/x/IIlIIIII.lIll D
      // 39c: goto 3a3
      // 39f: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3a2: athrow
      // 3a3: iload 16
      // 3a5: ifeq 3bb
      // 3a8: aload 0
      // 3a9: dup
      // 3aa: getfield k74/x/IIlIIIII.lIll D
      // 3ad: ldc2_w 2.5
      // 3b0: dadd
      // 3b1: putfield k74/x/IIlIIIII.lIll D
      // 3b4: goto 3bb
      // 3b7: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3ba: athrow
      // 3bb: aload 1
      // 3bc: invokevirtual k74/x/IllIlllI.l ()Z
      // 3bf: ifeq 3f5
      // 3c2: aload 1
      // 3c3: invokevirtual k74/x/IllIlllI.I ()Z
      // 3c6: ifeq 3f5
      // 3c9: goto 3d0
      // 3cc: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3cf: athrow
      // 3d0: aload 1
      // 3d1: invokevirtual k74/x/IllIlllI.III ()Z
      // 3d4: ifne 3f5
      // 3d7: goto 3de
      // 3da: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3dd: athrow
      // 3de: aload 0
      // 3df: dconst_0
      // 3e0: aload 0
      // 3e1: getfield k74/x/IIlIIIII.lIl D
      // 3e4: ldc2_w 3.0
      // 3e7: dsub
      // 3e8: invokestatic java/lang/Math.max (DD)D
      // 3eb: putfield k74/x/IIlIIIII.lIl D
      // 3ee: goto 3f5
      // 3f1: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 3f4: athrow
      // 3f5: iload 17
      // 3f7: ifne 436
      // 3fa: iload 18
      // 3fc: ifne 436
      // 3ff: goto 406
      // 402: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 405: athrow
      // 406: iload 16
      // 408: ifne 436
      // 40b: goto 412
      // 40e: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 411: athrow
      // 412: iload 14
      // 414: ifeq 42e
      // 417: goto 41e
      // 41a: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 41d: athrow
      // 41e: dload 11
      // 420: ldc2_w 2.75
      // 423: dcmpg
      // 424: ifge 436
      // 427: goto 42e
      // 42a: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 42d: athrow
      // 42e: bipush 1
      // 42f: goto 437
      // 432: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 435: athrow
      // 436: bipush 0
      // 437: istore 22
      // 439: iload 22
      // 43b: ifeq 455
      // 43e: aload 0
      // 43f: dconst_0
      // 440: aload 0
      // 441: getfield k74/x/IIlIIIII.lIll D
      // 444: ldc2_w 2.0
      // 447: dsub
      // 448: invokestatic java/lang/Math.max (DD)D
      // 44b: putfield k74/x/IIlIIIII.lIll D
      // 44e: goto 455
      // 451: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 454: athrow
      // 455: aload 0
      // 456: aload 0
      // 457: getfield k74/x/IIlIIIII.lIl D
      // 45a: aload 4
      // 45c: invokevirtual k74/x/IlII.l ()D
      // 45f: ldc2_w 2.0
      // 462: dmul
      // 463: invokestatic java/lang/Math.min (DD)D
      // 466: putfield k74/x/IIlIIIII.lIl D
      // 469: aload 0
      // 46a: aload 0
      // 46b: getfield k74/x/IIlIIIII.lIll D
      // 46e: aload 4
      // 470: invokevirtual k74/x/IlII.I ()D
      // 473: ldc2_w 2.0
      // 476: dmul
      // 477: invokestatic java/lang/Math.min (DD)D
      // 47a: putfield k74/x/IIlIIIII.lIll D
      // 47d: aload 0
      // 47e: aload 1
      // 47f: invokevirtual k74/x/IllIlllI.lII ()J
      // 482: putfield k74/x/IIlIIIII.Ill J
      // 485: aload 1
      // 486: invokestatic k74/x/IIlIIIII.ll (Lk74/x/IllIlllI;)Z
      // 489: ifeq 4ab
      // 48c: aload 0
      // 48d: aload 1
      // 48e: invokevirtual k74/x/IllIlllI.Ill ()D
      // 491: putfield k74/x/IIlIIIII.IIl D
      // 494: aload 0
      // 495: aload 1
      // 496: invokevirtual k74/x/IllIlllI.lI ()D
      // 499: putfield k74/x/IIlIIIII.IlI D
      // 49c: aload 0
      // 49d: aload 1
      // 49e: invokevirtual k74/x/IllIlllI.llI ()D
      // 4a1: putfield k74/x/IIlIIIII.IlII D
      // 4a4: goto 4ab
      // 4a7: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4aa: athrow
      // 4ab: aload 0
      // 4ac: aload 1
      // 4ad: invokevirtual k74/x/IllIlllI.Il ()D
      // 4b0: invokestatic java/lang/Double.isFinite (D)Z
      // 4b3: ifeq 4c5
      // 4b6: dconst_0
      // 4b7: aload 1
      // 4b8: invokevirtual k74/x/IllIlllI.Il ()D
      // 4bb: invokestatic java/lang/Math.max (DD)D
      // 4be: goto 4c8
      // 4c1: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 4c4: athrow
      // 4c5: ldc2_w NaN
      // 4c8: putfield k74/x/IIlIIIII.llI D
      // 4cb: aload 0
      // 4cc: aload 4
      // 4ce: aload 1
      // 4cf: invokevirtual k74/x/IllIlllI.lII ()J
      // 4d2: invokevirtual k74/x/IIlIIIII.IIl (Lk74/x/IlII;J)Lk74/x/IlIlIIlIl;
      // 4d5: areturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = 1400065176;
      String var14 = "ႝ멢ꥳꞭ夀㳘깣ܠ焌仄嗸ⴷ湱眡믐ੵ㞲ꕿ╔韓䂹괋ꘕ廂ꢑ\uf20fכֿ\ue91c糷ኋ\udb75삻왖";
      char[] var15 = "㤉".toCharArray();
      short var13 = 14632;
      String[] var10000 = new String[var15.length];
      byte var20 = -1;
      String[] var16 = var10000;

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            llll = var16;
            IIIII = new Object[var16.length];
            int var9 = 24862921;
            byte[] var7 = "×Øðö;\u001e#{Ë®÷W\\\t°¡2)\u000e×jD\u009fr\r\u0007\u009d\u001a\u0092I\u0081q\u0000í\u0006¿\u0005*-×q]2fÿ\u001dK§£IJ0øñy +\u000e\u0007\u009d\u001bªÕm»»&^æw\u0017S±ï°lJÄN/Ýmm\u008b¹§3Q\tÐ%\u0003Èû\u0097A¨ÂÓÊÚík?Î³¿\u008aÐ)WJAÂÌÿ\u0004Ò×ðTw%¹oñ¸Ò¤1~ÚÍ6á´Ð¸V\u0014t¿qE§³cà:vòQ Oû\u00adg¤î\u0017ä\bÁ\u008cm+³\u0089É·\u0019<2iCP\t+gö.ýôÐ\u008d\u0086Z\u0088\\¡\u0003¿\u008fd§»>\u0098\u0011\u0094Ã\u0005GÔ\u0012~0\u007fútg\u0007\u0007Ú=kÌ&¸fÕ/bBÛu\u0001\u0014³)ÌP\fP»´\u0012F\u0006ØÃ\u0015\u0001Ñë\u0081Àßï8wL\u0013\n\u00ad\u0012ç\u0083Bî¹&\u0086G6éNOÆR\u0099ÁÖÓ÷&M\u0094ð×\u0090Ê1Q\b\u0004¨' 1T[°»\u0003S\u009dúp7ç\u0012:\u009bt`ä>_\u007füÚ\u009b\u0085\"\u009a\n\u0081å@\u0002\u001b\bûDHBÃf¤ÜMköä¦¶é\u0093:×\u001bê\u0011£\u0090þØ\u0018v^¼Eóò\t\u0096A'\"µ\u0081&1¨5Ì\u007f\\\u0089\u001b\u001c_q3.M\u0019:x\u0083\u0001F\u0099Ï;ò7RN^bn\u0010\u009asä_\u0097u¹¨kA\u009cþÅí\u00ad\u0091=±Õ\u0017X´ªO-ßu$O3\u0001MÔ^5,[ÓP1j5)«Mrjã\u008bî\u000e(\u0013íþÞÄ¥SÍÛ\u0017\u0005ïICw2T÷\u0097B\u0002;¼O\u0004DÍú¢zÂ\u0092VtÏ\u009a\u008d\u008ae\u009f\r@\u0085ûèu>Ýð1\u0088\u0012¹ãö\br\u008eI)2\u0095÷ÐJô1Vb\u0091 Îì\u0011ø8IjY\u0080E\u0096\u009fË_nÂ#r³\u009d¹\u0084\u0001\u0002yQZsvN?\u0099\u001a\u009a\u0084àH-øzæ©\u0005Õ\u001d\u0000\u0098\u0095\u0001 :\u007fîí/o\t4$Z°çGG\u0089H\u0094\u0001ý¤\u009cs\u0098ì\u001fLæ©´n~_8}ÛF£b$\u00842õrY\n\u008d-E·\"\u00ad×j\u0005[\u0083}¨ \u0095±\u0013í¤\u0095\rbWôi§\u0094\b\u001bâÆç¹9Á~üÇðA[7N\nù¦ÍÉY\u0084)ÔK48ÏÓ\u001d\u0002\u0081*¹¶\tYFì\u0006çx{åe\u008c\n\"\u0017×ß\rªß^#Ì\u00ad\u001dbÒD\u008e*Ý¬eÌ\u0083\u0090F\u0001}Kj\u001fÓ\u009dUz(\u007f\u0085hÖ\u001f\u0095G\u008f»\u0091\u0013Ú s£\u008a§\u0090\u0093|\u009cE§\u0003ûJ\u008bæ\u0019½£\u0007\u001c\u0011u@³%ôFçÞÁÑ«~Bì\u009a$ÏÝ\"A\u001f·£vÜ¬\u0012\u008f\u0018\u0087c!ÞZë\u0084fÀZ< \u0089\u0003n Ïò\u0007U5<%(\u000eD\u008a êÇ1\u009e7½4\u009e\u0016Ì\u0005Øå{\"½Þr\r\u0011\u007f\u0094ßNþ 5FUÊßºKèvZQ¾\u000f\u0081i6SL\u0004\u0006\u009eT\u0016wà¯´\u0081C\u0098Û+\u0012\u0015Æ\u0015\u0086-\u0000d VKè\u0080\fí\u007f\t¦%ó¡§·(¯ø<\"G\u008cy«n¡\bINò?\u0016¾M04E3\u0016 iA\u0082\u000f\u001d}ôÈ\u0019&\u0080öj\\\u000f\u0096\u000bçãß\u001f0^u\u0097ÉµÆ¶¨º\u0080ò\u0019#·\u0005ù4DøÅÊÇ¢\u007f\u0005\u0003ÆÝN±øò¿\u0019\u0004iºüNC\u009aó¯\\ÌÂ7\"è»´\u0016iÊ`\u0010Õ°\u0018B\u0007o\u000e¼d\u001a8C[Ôo5wô_:\u008aL(qqA*\f\u0013yñ\u00ad~\u008dø|X\u00888¸I FjR¶\u000b! \u0013k\u0000\u0013SÞxUGòç\u008a³%*\u000bfXøG\nàÎ~ëêçIÎH\u008c$\u009f\u0085¨\"\u000fÓ«\u0092snÞi\u0098\u0011\u0017\u0090\u009f#R\u001dG\u0014\u0095Æb\u0019Ö"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            lllI = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               lllI[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var5 = new String[2];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IIII(1103301776, var24 ^ -388812844)).length();
            int var1 = lll(1191946190, var24 ^ -1225406760);
            int var0 = -1;

            while (true) {
               char[] var10002;
               label82: {
                  int var29 = lll(1191946185, var24 ^ -657098521);
                  char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                  int var10004 = var10003.length;
                  int var6 = 0;
                  int var35 = var29;
                  var10002 = var10003;
                  int var30 = var10004;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var10004 = var29;
                     var10006 = var6;
                  } else {
                     var35 = var29;
                     var30 = var10004;
                     if (var10004 <= var6) {
                        break label82;
                     }

                     var10005 = var10003;
                     var10004 = var29;
                     var10006 = var6;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % lll(1191946184, var24 ^ -2135365346)) {
                        case 0 -> lll(1191946187, var24 ^ -402920649);
                        case 1 -> lll(1191946186, var24 ^ 2025191201);
                        case 2 -> lll(1191946181, var24 ^ -367955805);
                        case 3 -> lll(1191946180, var24 ^ -271164510);
                        case 4 -> 5;
                        case 5 -> lll(1191946183, var24 ^ -1683930049);
                        default -> lll(1191946182, var24 ^ 367082828);
                     });
                     var6++;
                     if (var35 == 0) {
                        var10006 = var35;
                        var10005 = var10002;
                        var10004 = var35;
                     } else {
                        if (var30 <= var6) {
                           break;
                        }

                        var10005 = var10002;
                        var10004 = var35;
                        var10006 = var6;
                     }
                  }
               }

               String var37 = new String(var10002).intern();
               byte var32 = -1;
               var5[var3++] = var37;
               if ((var0 += var1) >= var4) {
                  I = var5;
                  Illl = new String[2];
                  lIII = new String[2];
                  lIl();
                  IIIl = Pattern.compile(IlIIllIII.lI(lIII[0]));
                  return;
               }

               var1 = var2.charAt(var0);
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 66;
                  case 1 -> 47;
                  case 2 -> 78;
                  case 3 -> 218;
                  case 4 -> 180;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static boolean ll(IllIlllI param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IllIlllI.Ill ()D
      // 04: invokestatic java/lang/Double.isFinite (D)Z
      // 07: ifeq 34
      // 0a: aload 0
      // 0b: invokevirtual k74/x/IllIlllI.lI ()D
      // 0e: invokestatic java/lang/Double.isFinite (D)Z
      // 11: ifeq 34
      // 14: goto 1b
      // 17: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual k74/x/IllIlllI.llI ()D
      // 1f: invokestatic java/lang/Double.isFinite (D)Z
      // 22: ifeq 34
      // 25: goto 2c
      // 28: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 2b: athrow
      // 2c: bipush 1
      // 2d: goto 35
      // 30: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 33: athrow
      // 34: bipush 0
      // 35: ireturn
   }

   public static boolean III(long param0, long param2, long param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: lload 4
      // 02: lconst_0
      // 03: lcmp
      // 04: iflt 1f
      // 07: lload 0
      // 08: lload 2
      // 09: lsub
      // 0a: lload 4
      // 0c: lcmp
      // 0d: ifle 1f
      // 10: goto 17
      // 13: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 20
      // 1b: invokestatic k74/x/IIlIIIII.II (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
   }

   private static String IIII(int var0, int var1) {
      int var3 = var0 ^ 1103301776;
      char[] var4 = llll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIIII[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIIII[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 453578755;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 188;
            case 1 -> 34;
            case 2 -> 67;
            case 3 -> 116;
            case 4 -> 133;
            case 5 -> 109;
            case 6 -> 164;
            case 7 -> 102;
            case 8 -> 67;
            case 9 -> 223;
            case 10 -> 196;
            case 11 -> 167;
            case 12 -> 177;
            case 13 -> 75;
            case 14 -> 29;
            case 15 -> 32;
            case 16 -> 175;
            case 17 -> 238;
            case 18 -> 19;
            case 19 -> 154;
            case 20 -> 172;
            case 21 -> 75;
            case 22 -> 40;
            case 23 -> 175;
            case 24 -> 151;
            case 25 -> 242;
            case 26 -> 241;
            case 27 -> 12;
            case 28 -> 91;
            case 29 -> 216;
            case 30 -> 201;
            case 31 -> 118;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int lll(int var0, int var1) {
      int var2 = lllI[var0 ^ 1191946189] ^ var1 ^ var0;
      var2 -= 24479;
      var2 += 43301;
      var2 ^= 54768;
      var2 += 34584;
      var2 -= 45806;
      var2 += 12626;
      return var2 - 38912;
   }

   private IlIlIIlIl IIl(IlII var1, long var2) {
      int var10000;
      label35: {
         try {
            if (this.ll < var2) {
               var10000 = 0;
               break label35;
            }
         } catch (IllegalArgumentException var6) {
            throw II(var6);
         }

         var10000 = (int)Math.min(2147483647L, this.ll - var2);
      }

      int var4 = var10000;

      IlIlIIlIl var10001;
      double var10002;
      double var10003;
      boolean var10004;
      label27: {
         label26: {
            try {
               var7 = new IlIlIIlIl;
               var10001 = var7;
               var10002 = this.lIl;
               var10003 = this.lIll;
               if (this.lIl >= var1.l() && this.lIll >= var1.I()) {
                  break label26;
               }
            } catch (IllegalArgumentException var5) {
               throw II(var5);
            }

            var10004 = false;
            break label27;
         }

         var10004 = true;
      }

      var10001./* $VF: Unable to resugar constructor */<init>(var10002, var10003, var10004, var4);
      return var7;
   }

   public void IlI() {
      this.lIl = 0.0;
      this.lIll = 0.0;
      this.Ill = Long.MIN_VALUE;
      this.llI = Double.NaN;
      this.ll = Long.MIN_VALUE;
      this.IIII.clear();
      this.IllI = 0;
      this.lIIl = 0;
      this.llIl = 0;
   }

   private static double Ill(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = var6 - var0;
      double var14 = var8 - var2;
      double var16 = var10 - var4;
      return Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
   }

   private static String lII(int var0, int var1) {
      int var9 = 2049795511;
      int var2 = (var0 ^ lll(1191946177, var9 ^ 1626024198)) & lll(1191946176, var9 ^ -995350797);
      if (Illl[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & lll(1191946179, var9 ^ -391358003)) {
            case 0 -> lll(1191946178, var9 ^ -670529024);
            case 1 -> lll(1191946205, var9 ^ 2014935488);
            case 2 -> lll(1191946204, var9 ^ 634734793);
            case 3 -> lll(1191946207, var9 ^ 1917710221);
            case 4 -> lll(1191946206, var9 ^ -1989799821);
            case 5 -> lll(1191946201, var9 ^ 516895316);
            case 6 -> lll(1191946200, var9 ^ 2047175701);
            case 7 -> lll(1191946203, var9 ^ -898467094);
            case 8 -> lll(1191946202, var9 ^ 190433377);
            case 9 -> lll(1191946197, var9 ^ 1801489605);
            case 10 -> lll(1191946196, var9 ^ 424621237);
            case 11 -> lll(1191946199, var9 ^ 219275391);
            case 12 -> lll(1191946198, var9 ^ 327878699);
            case 13 -> lll(1191946193, var9 ^ -2107599886);
            case 14 -> lll(1191946192, var9 ^ -948926215);
            case 15 -> lll(1191946195, var9 ^ -1747617209);
            case 16 -> lll(1191946194, var9 ^ -1403787327);
            case 17 -> lll(1191946221, var9 ^ 1737695504);
            case 18 -> lll(1191946220, var9 ^ 244629013);
            case 19 -> lll(1191946223, var9 ^ 320473516);
            case 20 -> lll(1191946222, var9 ^ -1222824149);
            case 21 -> lll(1191946217, var9 ^ 1678851201);
            case 22 -> lll(1191946216, var9 ^ -103502402);
            case 23 -> lll(1191946219, var9 ^ -470965236);
            case 24 -> lll(1191946218, var9 ^ -1543065144);
            case 25 -> lll(1191946213, var9 ^ 665493181);
            case 26 -> lll(1191946212, var9 ^ -1366692354);
            case 27 -> lll(1191946215, var9 ^ 169166581);
            case 28 -> lll(1191946214, var9 ^ -238347138);
            case 29 -> lll(1191946209, var9 ^ -896976819);
            case 30 -> lll(1191946208, var9 ^ -312497263);
            case 31 -> lll(1191946211, var9 ^ 1310983665);
            case 32 -> lll(1191946210, var9 ^ -1627169772);
            case 33 -> lll(1191946237, var9 ^ 1288108119);
            case 34 -> lll(1191946236, var9 ^ -46510532);
            case 35 -> lll(1191946239, var9 ^ 10950770);
            case 36 -> lll(1191946238, var9 ^ -774082759);
            case 37 -> lll(1191946233, var9 ^ 970340401);
            case 38 -> lll(1191946232, var9 ^ -998743483);
            case 39 -> lll(1191946235, var9 ^ 260368316);
            case 40 -> lll(1191946234, var9 ^ 378355196);
            case 41 -> lll(1191946229, var9 ^ 416767606);
            case 42 -> lll(1191946228, var9 ^ 1888195402);
            case 43 -> lll(1191946231, var9 ^ -806165258);
            case 44 -> lll(1191946230, var9 ^ -773564067);
            case 45 -> lll(1191946225, var9 ^ 12017209);
            case 46 -> lll(1191946224, var9 ^ 673423248);
            case 47 -> lll(1191946227, var9 ^ 748300494);
            case 48 -> lll(1191946226, var9 ^ -794234214);
            case 49 -> lll(1191946125, var9 ^ 606149900);
            case 50 -> lll(1191946124, var9 ^ 2055526906);
            case 51 -> lll(1191946127, var9 ^ -179629621);
            case 52 -> lll(1191946126, var9 ^ 99665515);
            case 53 -> lll(1191946121, var9 ^ 359770260);
            case 54 -> lll(1191946120, var9 ^ -1909018644);
            case 55 -> lll(1191946123, var9 ^ 1399352970);
            case 56 -> lll(1191946122, var9 ^ -878250131);
            case 57 -> lll(1191946117, var9 ^ -476902454);
            case 58 -> lll(1191946116, var9 ^ 1931041844);
            case 59 -> lll(1191946119, var9 ^ 1582837577);
            case 60 -> lll(1191946118, var9 ^ 615540020);
            case 61 -> lll(1191946113, var9 ^ -1211974713);
            case 62 -> lll(1191946112, var9 ^ -1663196314);
            case 63 -> 4;
            case 64 -> lll(1191946115, var9 ^ 1478983037);
            case 65 -> lll(1191946114, var9 ^ -920405335);
            case 66 -> lll(1191946141, var9 ^ -1044818076);
            case 67 -> lll(1191946140, var9 ^ -2014700255);
            case 68 -> lll(1191946143, var9 ^ -1526299775);
            case 69 -> lll(1191946142, var9 ^ -1470841938);
            case 70 -> 3;
            case 71 -> lll(1191946137, var9 ^ 1967901937);
            case 72 -> lll(1191946136, var9 ^ 347714830);
            case 73 -> lll(1191946139, var9 ^ 1613930798);
            case 74 -> 1;
            case 75 -> lll(1191946138, var9 ^ -606862875);
            case 76 -> lll(1191946133, var9 ^ -2041467397);
            case 77 -> lll(1191946132, var9 ^ 1440970832);
            case 78 -> lll(1191946135, var9 ^ 1982036294);
            case 79 -> 2;
            case 80 -> lll(1191946134, var9 ^ 1805095901);
            case 81 -> lll(1191946129, var9 ^ -1624554400);
            case 82 -> lll(1191946128, var9 ^ -1663865759);
            case 83 -> lll(1191946131, var9 ^ -1900321458);
            case 84 -> lll(1191946130, var9 ^ 1084430835);
            case 85 -> lll(1191946157, var9 ^ 211397972);
            case 86 -> lll(1191946156, var9 ^ -1846804043);
            case 87 -> lll(1191946159, var9 ^ -1380792897);
            case 88 -> lll(1191946158, var9 ^ 670943480);
            case 89 -> lll(1191946153, var9 ^ 2047489278);
            case 90 -> 5;
            case 91 -> lll(1191946152, var9 ^ 1599904376);
            case 92 -> lll(1191946155, var9 ^ 1848861329);
            case 93 -> lll(1191946154, var9 ^ 380962693);
            case 94 -> lll(1191946149, var9 ^ 1777169080);
            case 95 -> lll(1191946148, var9 ^ -1232727994);
            case 96 -> 0;
            case 97 -> lll(1191946151, var9 ^ -1024488557);
            case 98 -> lll(1191946150, var9 ^ -158464979);
            case 99 -> lll(1191946145, var9 ^ -1819069132);
            case 100 -> lll(1191946144, var9 ^ -368504196);
            case 101 -> lll(1191946147, var9 ^ -1455303637);
            case 102 -> lll(1191946146, var9 ^ -846574378);
            case 103 -> lll(1191946173, var9 ^ 1031576388);
            case 104 -> lll(1191946172, var9 ^ -1871739828);
            case 105 -> lll(1191946175, var9 ^ -968026263);
            case 106 -> lll(1191946174, var9 ^ -1265628290);
            case 107 -> lll(1191946169, var9 ^ 1423990052);
            case 108 -> lll(1191946168, var9 ^ 2146261902);
            case 109 -> lll(1191946171, var9 ^ 240712978);
            case 110 -> lll(1191946170, var9 ^ 19925400);
            case 111 -> lll(1191946165, var9 ^ 205050451);
            case 112 -> lll(1191946164, var9 ^ -1505930659);
            case 113 -> lll(1191946167, var9 ^ 1180284893);
            case 114 -> lll(1191946166, var9 ^ -41963640);
            case 115 -> lll(1191946161, var9 ^ 1269884461);
            case 116 -> lll(1191946160, var9 ^ 900345112);
            case 117 -> lll(1191946163, var9 ^ -1970573965);
            case 118 -> lll(1191946162, var9 ^ 879891867);
            case 119 -> lll(1191946061, var9 ^ -218874397);
            case 120 -> lll(1191946060, var9 ^ -479415414);
            case 121 -> lll(1191946063, var9 ^ 999953925);
            case 122 -> lll(1191946062, var9 ^ -1709040975);
            case 123 -> lll(1191946057, var9 ^ 1550385358);
            case 124 -> lll(1191946056, var9 ^ 25242959);
            case 125 -> lll(1191946059, var9 ^ 1578883910);
            case 126 -> lll(1191946058, var9 ^ -1042608461);
            case 127 -> lll(1191946053, var9 ^ -1328279147);
            case 128 -> lll(1191946052, var9 ^ 1522058681);
            case 129 -> lll(1191946055, var9 ^ 602567234);
            case 130 -> lll(1191946054, var9 ^ -1186662658);
            case 131 -> lll(1191946049, var9 ^ 381640486);
            case 132 -> lll(1191946048, var9 ^ 1453588319);
            case 133 -> lll(1191946051, var9 ^ -1135824176);
            case 134 -> lll(1191946050, var9 ^ -1398052090);
            case 135 -> lll(1191946077, var9 ^ -1726826273);
            case 136 -> lll(1191946076, var9 ^ -2077550845);
            case 137 -> lll(1191946079, var9 ^ -1033897033);
            case 138 -> lll(1191946078, var9 ^ -1338330127);
            case 139 -> lll(1191946073, var9 ^ -1891305928);
            case 140 -> lll(1191946072, var9 ^ -1378090875);
            case 141 -> lll(1191946075, var9 ^ -1099359910);
            case 142 -> lll(1191946074, var9 ^ -1584997517);
            case 143 -> lll(1191946069, var9 ^ 919602860);
            case 144 -> lll(1191946068, var9 ^ 1318001401);
            case 145 -> lll(1191946071, var9 ^ -519075653);
            case 146 -> lll(1191946070, var9 ^ -956703639);
            case 147 -> lll(1191946065, var9 ^ 1803733648);
            case 148 -> lll(1191946064, var9 ^ -800064563);
            case 149 -> lll(1191946067, var9 ^ -826275649);
            case 150 -> lll(1191946066, var9 ^ -1442460860);
            case 151 -> lll(1191946093, var9 ^ -666855011);
            case 152 -> lll(1191946092, var9 ^ 2057018965);
            case 153 -> lll(1191946095, var9 ^ 1063628642);
            case 154 -> lll(1191946094, var9 ^ -1735061010);
            case 155 -> lll(1191946089, var9 ^ 973378201);
            case 156 -> lll(1191946088, var9 ^ -1708755449);
            case 157 -> lll(1191946091, var9 ^ -2003408975);
            case 158 -> lll(1191946090, var9 ^ 280976796);
            case 159 -> lll(1191946085, var9 ^ -384046677);
            case 160 -> lll(1191946084, var9 ^ -1696287842);
            case 161 -> lll(1191946087, var9 ^ 618275899);
            case 162 -> lll(1191946086, var9 ^ -1506912852);
            case 163 -> lll(1191946081, var9 ^ -730496926);
            case 164 -> lll(1191946080, var9 ^ 1769800007);
            case 165 -> lll(1191946083, var9 ^ 252658332);
            case 166 -> lll(1191946082, var9 ^ 300339680);
            case 167 -> lll(1191946109, var9 ^ 504248929);
            case 168 -> lll(1191946108, var9 ^ 1077025149);
            case 169 -> lll(1191946111, var9 ^ -1092012779);
            case 170 -> lll(1191946110, var9 ^ 272566808);
            case 171 -> lll(1191946105, var9 ^ -337782045);
            case 172 -> lll(1191946104, var9 ^ 364759665);
            case 173 -> lll(1191946107, var9 ^ 1276759653);
            case 174 -> lll(1191946106, var9 ^ 419572797);
            case 175 -> lll(1191946101, var9 ^ 1225117463);
            case 176 -> lll(1191946100, var9 ^ -1086449096);
            case 177 -> lll(1191946103, var9 ^ -1067903667);
            case 178 -> lll(1191946102, var9 ^ 633070288);
            case 179 -> lll(1191946097, var9 ^ -994160997);
            case 180 -> lll(1191946096, var9 ^ -2096006546);
            case 181 -> lll(1191946099, var9 ^ -2059042454);
            case 182 -> lll(1191946098, var9 ^ 302588269);
            case 183 -> lll(1191945997, var9 ^ 792230772);
            case 184 -> lll(1191945996, var9 ^ 511712878);
            case 185 -> lll(1191945999, var9 ^ 1946233244);
            case 186 -> lll(1191945998, var9 ^ 1873858633);
            case 187 -> lll(1191945993, var9 ^ 1153531553);
            case 188 -> lll(1191945992, var9 ^ -1723212875);
            case 189 -> lll(1191945995, var9 ^ 66610041);
            case 190 -> lll(1191945994, var9 ^ 1252077978);
            case 191 -> lll(1191945989, var9 ^ 206592066);
            case 192 -> lll(1191945988, var9 ^ -157385998);
            case 193 -> lll(1191945991, var9 ^ -840510129);
            case 194 -> lll(1191945990, var9 ^ 694513169);
            case 195 -> lll(1191945985, var9 ^ -199267534);
            case 196 -> lll(1191945984, var9 ^ -714188182);
            case 197 -> lll(1191945987, var9 ^ 651787540);
            case 198 -> lll(1191945986, var9 ^ 500191957);
            case 199 -> lll(1191946013, var9 ^ -1137278811);
            case 200 -> lll(1191946012, var9 ^ 1023568457);
            case 201 -> lll(1191946015, var9 ^ -1771536156);
            case 202 -> lll(1191946014, var9 ^ -2008405510);
            case 203 -> lll(1191946009, var9 ^ -1843638019);
            case 204 -> lll(1191946008, var9 ^ -1433138159);
            case 205 -> lll(1191946011, var9 ^ -945503765);
            case 206 -> lll(1191946010, var9 ^ -707412441);
            case 207 -> lll(1191946005, var9 ^ 1998789705);
            case 208 -> lll(1191946004, var9 ^ 411651494);
            case 209 -> lll(1191946007, var9 ^ 95934870);
            case 210 -> lll(1191946006, var9 ^ -1010401360);
            case 211 -> lll(1191946001, var9 ^ -2008358938);
            case 212 -> lll(1191946000, var9 ^ 786257610);
            case 213 -> lll(1191946003, var9 ^ -430833993);
            case 214 -> lll(1191946002, var9 ^ 1955262472);
            case 215 -> lll(1191946029, var9 ^ -8382293);
            case 216 -> lll(1191946028, var9 ^ -1173802547);
            case 217 -> lll(1191946031, var9 ^ -873786945);
            case 218 -> lll(1191946030, var9 ^ -55254609);
            case 219 -> lll(1191946025, var9 ^ -208266698);
            case 220 -> lll(1191946024, var9 ^ -721275384);
            case 221 -> lll(1191946027, var9 ^ 1101873832);
            case 222 -> lll(1191946026, var9 ^ 929711809);
            case 223 -> lll(1191946021, var9 ^ 1129592087);
            case 224 -> lll(1191946020, var9 ^ -868985822);
            case 225 -> lll(1191946023, var9 ^ 545079522);
            case 226 -> lll(1191946022, var9 ^ -1646802581);
            case 227 -> lll(1191946017, var9 ^ 1986324509);
            case 228 -> lll(1191946016, var9 ^ 2032315861);
            case 229 -> lll(1191946019, var9 ^ -535471376);
            case 230 -> lll(1191946018, var9 ^ -135878893);
            case 231 -> lll(1191946045, var9 ^ 157679029);
            case 232 -> lll(1191946044, var9 ^ -962487878);
            case 233 -> lll(1191946047, var9 ^ -1928091770);
            case 234 -> lll(1191946046, var9 ^ 2092653266);
            case 235 -> lll(1191946041, var9 ^ 2036208100);
            case 236 -> lll(1191946040, var9 ^ 1498542155);
            case 237 -> lll(1191946043, var9 ^ 257976367);
            case 238 -> lll(1191946042, var9 ^ 723118897);
            case 239 -> lll(1191946037, var9 ^ -1436008562);
            case 240 -> lll(1191946036, var9 ^ 370296703);
            case 241 -> lll(1191946039, var9 ^ -993177592);
            case 242 -> lll(1191946038, var9 ^ -1481087025);
            case 243 -> lll(1191946033, var9 ^ -1737084873);
            case 244 -> lll(1191946032, var9 ^ -1269432270);
            case 245 -> lll(1191946035, var9 ^ 1240364906);
            case 246 -> lll(1191946034, var9 ^ -1293716058);
            case 247 -> lll(1191945933, var9 ^ -790909015);
            case 248 -> lll(1191945932, var9 ^ -1120950624);
            case 249 -> lll(1191945935, var9 ^ -1691720003);
            case 250 -> lll(1191945934, var9 ^ -1979574129);
            case 251 -> lll(1191945929, var9 ^ -1860938647);
            case 252 -> lll(1191945928, var9 ^ 1672558066);
            case 253 -> lll(1191945931, var9 ^ -789479246);
            case 254 -> lll(1191945930, var9 ^ -1763333019);
            default -> lll(1191945925, var9 ^ 1225882558);
         };
         int var5 = (var1 & lll(1191945924, var9 ^ -926677073)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lll(1191945927, var9 ^ 2069347994)) >>> lll(1191945926, var9 ^ -1119243095)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lll(1191945921, var9 ^ -1972627490);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lll(1191945920, var9 ^ -415376645);
            }
         }

         Illl[var2] = new String(var3).intern();
      }

      return Illl[var2];
   }

   private static void lIl() {
      int var0 = 212671913;
      lIII[0] = I(lII(lll(1191945923, var0 ^ -1758606975), lll(1191945922, var0 ^ 659644970)).toCharArray(), 76591L, lll(1191945949, var0 ^ -1108549463));
      lIII[1] = I(lII(lll(1191945948, var0 ^ 633157990), lll(1191945951, var0 ^ 1469766574)).toCharArray(), 62627L, lll(1191945950, var0 ^ -309127614));
   }

   public IlIlIIlIl llI(IlII var1) {
      IIlIIIII var10000;
      try {
         var10000 = this;
         if (var1 == null) {
            return this.IIl(k74.x.IlII.III, this.Ill);
         }
      } catch (IllegalArgumentException var2) {
         throw II(var2);
      }

      return var10000.IIl(var1, this.Ill);
   }
}
