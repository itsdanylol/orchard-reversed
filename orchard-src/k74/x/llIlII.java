package k74.x;

import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;

@Environment(EnvType.CLIENT)
public final class llIlII extends IlIIIIIIl {
   private lIIlIlll II;
   private int Il;
   private boolean lI;
   private final lIlllIl ll;
   private static final int[] IlIll;
   private int III;
   private static final String[] I;
   private final Map<class_2338, Long> IIl;
   private boolean IlI;
   private boolean Ill;
   private int lII;
   private long lIl;
   private long llI;
   private int lll;
   private static final int IIII = 12;
   private final lIlllIl IIIl;
   private int IIlI;
   private final IIlIII IIll;
   private final lIlllIl IlII;
   private static final String[] IlIl;
   private int IllI;
   private int Illl;
   private long lIII;
   private boolean lIIl;
   private class_3965 lIlI;
   private int lIll;
   private Object llII;
   private final lllIIlII llIl;
   private static final Object[] IllIl;
   private static final String[] IllII;
   private final IIlIII lllI;
   private int llll;
   private class_2338 IIIII;
   private class_2338 IIIIl;
   private long IIIlI;
   private int IIIll;
   private static final long IIlII = 5000L;
   private int IIlIl;
   private class_3965 IIllI;
   private static final double IIlll = 0.8;
   private final lllIIlII IlIII;
   private class_2338 IlIIl;
   private class_3965 IlIlI;

   private boolean I(class_310 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/llIlII.IlIIl Lnet/minecraft/class_2338;
      // 04: ifnull 2e
      // 07: aload 1
      // 08: ifnull 2e
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 16: ifnull 2e
      // 19: goto 20
      // 1c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 24: ifnonnull 34
      // 27: goto 2e
      // 2a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: bipush 0
      // 2f: ireturn
      // 30: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 33: athrow
      // 34: aload 1
      // 35: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 38: getfield net/minecraft/class_746.field_6012 I
      // 3b: aload 0
      // 3c: getfield k74/x/llIlII.IIIll I
      // 3f: if_icmpgt 5d
      // 42: aload 1
      // 43: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 46: aload 0
      // 47: getfield k74/x/llIlII.IlIIl Lnet/minecraft/class_2338;
      // 4a: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 4d: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 50: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 53: ifne 67
      // 56: goto 5d
      // 59: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5c: athrow
      // 5d: aload 0
      // 5e: invokevirtual k74/x/llIlII.lllI ()V
      // 61: bipush 0
      // 62: ireturn
      // 63: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 66: athrow
      // 67: invokestatic k74/x/IIll.IllllI ()J
      // 6a: lstore 3
      // 6b: lload 3
      // 6c: aload 0
      // 6d: getfield k74/x/llIlII.lIl J
      // 70: lcmp
      // 71: ifeq 8c
      // 74: aload 0
      // 75: lload 3
      // 76: putfield k74/x/llIlII.lIl J
      // 79: aload 0
      // 7a: aload 1
      // 7b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 7e: getfield net/minecraft/class_746.field_6012 I
      // 81: bipush 1
      // 82: iadd
      // 83: putfield k74/x/llIlII.IIlI I
      // 86: bipush 0
      // 87: ireturn
      // 88: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8b: athrow
      // 8c: iload 2
      // 8d: ifne b4
      // 90: aload 1
      // 91: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 94: getfield net/minecraft/class_746.field_6012 I
      // 97: aload 0
      // 98: getfield k74/x/llIlII.IIlI I
      // 9b: if_icmplt b4
      // 9e: goto a5
      // a1: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a4: athrow
      // a5: aload 0
      // a6: aload 1
      // a7: invokevirtual k74/x/llIlII.IllIl (Lnet/minecraft/class_310;)Z
      // aa: ifeq ba
      // ad: goto b4
      // b0: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b3: athrow
      // b4: bipush 0
      // b5: ireturn
      // b6: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b9: athrow
      // ba: aload 0
      // bb: getfield k74/x/llIlII.IlIIl Lnet/minecraft/class_2338;
      // be: astore 5
      // c0: aload 0
      // c1: aload 0
      // c2: getfield k74/x/llIlII.IlIlI Lnet/minecraft/class_3965;
      // c5: putfield k74/x/llIlII.lIlI Lnet/minecraft/class_3965;
      // c8: aload 0
      // c9: aload 1
      // ca: aload 5
      // cc: aload 0
      // cd: aload 1
      // ce: aload 5
      // d0: invokevirtual k74/x/llIlII.lIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)I
      // d3: invokevirtual k74/x/llIlII.Il (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;I)Z
      // d6: ifne df
      // d9: bipush 0
      // da: ireturn
      // db: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // de: athrow
      // df: aload 0
      // e0: invokevirtual k74/x/llIlII.lllI ()V
      // e3: bipush 1
      // e4: ireturn
   }

   @Override
   public void IlIII() {
      this.lI();
      this.Ill = false;
      this.lI = false;
      this.IIl.clear();
      this.IIIII = null;
      this.lll = lIIlI(1680977553, 1707947484 ^ 24260199);
      this.llII = null;
   }

   private static String lIIll(int var0, char var1, int var2) {
      int var3 = var1 ^ 20886;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 17905;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '셛';
         var10 -= 16753;
         var10 ^= 17871;
         var10 -= 8004;
         var10 += 31199;
         var10 -= 16437;
         var10 ^= 58014;
         var10 -= 21264;
         var10 ^= 62285;
         var10 -= 3691;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private class_3965 II(class_310 var1) {
      if (var1 != null && var1.field_1765 instanceof class_3965 var2) {
         try {
            if (var2.method_17783() == class_240.field_1332) {
               return var2;
            }
         } catch (MatchException var4) {
            throw lll(var4);
         }
      }

      return null;
   }

   private boolean Il(class_310 param1, class_2338 param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 004: ifnull 026
      // 007: aload 0
      // 008: aload 1
      // 009: invokevirtual k74/x/llIlII.IllIl (Lnet/minecraft/class_310;)Z
      // 00c: ifne 026
      // 00f: goto 016
      // 012: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 015: athrow
      // 016: aload 0
      // 017: aload 1
      // 018: aload 2
      // 019: invokevirtual k74/x/llIlII.IlIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 01c: ifne 02c
      // 01f: goto 026
      // 022: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 025: athrow
      // 026: bipush 0
      // 027: ireturn
      // 028: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02b: athrow
      // 02c: aload 1
      // 02d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 030: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 033: invokestatic k74/x/IIll.IIlII (Lnet/minecraft/class_1661;)I
      // 036: istore 4
      // 038: aload 0
      // 039: aload 1
      // 03a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 03d: iload 4
      // 03f: invokevirtual k74/x/llIlII.IllI (Lnet/minecraft/class_1657;I)I
      // 042: istore 5
      // 044: iload 5
      // 046: bipush -1
      // 047: if_icmpne 050
      // 04a: bipush 0
      // 04b: ireturn
      // 04c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 04f: athrow
      // 050: aload 0
      // 051: getfield k74/x/llIlII.IIll Lk74/x/IIlIII;
      // 054: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 057: checkcast java/lang/Double
      // 05a: invokevirtual java/lang/Double.doubleValue ()D
      // 05d: d2i
      // 05e: istore 6
      // 060: bipush 1
      // 061: bipush 4
      // 062: iload 6
      // 064: invokestatic java/lang/Math.min (II)I
      // 067: invokestatic java/lang/Math.max (II)I
      // 06a: istore 6
      // 06c: bipush 0
      // 06d: iload 6
      // 06f: bipush 0
      // 070: iload 3
      // 071: invokestatic java/lang/Math.max (II)I
      // 074: isub
      // 075: invokestatic java/lang/Math.max (II)I
      // 078: istore 7
      // 07a: aload 0
      // 07b: getfield k74/x/llIlII.IlIII Lk74/x/lllIIlII;
      // 07e: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 081: checkcast java/lang/Boolean
      // 084: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 087: ifeq 0a0
      // 08a: iload 7
      // 08c: ifgt 0a0
      // 08f: goto 096
      // 092: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 095: athrow
      // 096: aload 0
      // 097: aload 1
      // 098: invokevirtual k74/x/llIlII.IIIl (Lnet/minecraft/class_310;)Z
      // 09b: ireturn
      // 09c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 09f: athrow
      // 0a0: iload 7
      // 0a2: ifle 0b7
      // 0a5: aload 0
      // 0a6: aload 1
      // 0a7: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0aa: getstatic net/minecraft/class_1802.field_8801 Lnet/minecraft/class_1792;
      // 0ad: invokevirtual k74/x/llIlII.Illl (Lnet/minecraft/class_1657;Lnet/minecraft/class_1792;)I
      // 0b0: goto 0b8
      // 0b3: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b6: athrow
      // 0b7: bipush -1
      // 0b8: istore 8
      // 0ba: iload 7
      // 0bc: ifle 0d2
      // 0bf: iload 8
      // 0c1: bipush -1
      // 0c2: if_icmpne 0d2
      // 0c5: goto 0cc
      // 0c8: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0cb: athrow
      // 0cc: bipush 0
      // 0cd: ireturn
      // 0ce: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d1: athrow
      // 0d2: aload 0
      // 0d3: aload 2
      // 0d4: ifnonnull 0df
      // 0d7: aconst_null
      // 0d8: goto 0e3
      // 0db: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0de: athrow
      // 0df: aload 2
      // 0e0: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 0e3: putfield k74/x/llIlII.IIIIl Lnet/minecraft/class_2338;
      // 0e6: aload 0
      // 0e7: iload 8
      // 0e9: putfield k74/x/llIlII.IIlIl I
      // 0ec: aload 0
      // 0ed: iload 5
      // 0ef: putfield k74/x/llIlII.llll I
      // 0f2: aload 0
      // 0f3: iload 4
      // 0f5: putfield k74/x/llIlII.III I
      // 0f8: aload 0
      // 0f9: iload 7
      // 0fb: putfield k74/x/llIlII.Il I
      // 0fe: aload 0
      // 0ff: invokestatic java/lang/System.currentTimeMillis ()J
      // 102: putfield k74/x/llIlII.IIIlI J
      // 105: aload 1
      // 106: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 109: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 10c: invokestatic k74/x/IIll.lIIIIlI (Lnet/minecraft/class_304;)V
      // 10f: aload 0
      // 110: bipush 1
      // 111: putfield k74/x/llIlII.lI Z
      // 114: aload 0
      // 115: getstatic k74/x/lIIlIlll.Il Lk74/x/lIIlIlll;
      // 118: invokevirtual k74/x/llIlII.IIl (Lk74/x/lIIlIlll;)V
      // 11b: aload 0
      // 11c: aload 1
      // 11d: invokespecial k74/x/llIlII.IlII (Lnet/minecraft/class_310;)V
      // 120: bipush 1
      // 121: ireturn
   }

   private void lI() {
      this.II = lIIlIlll.II;
      this.Ill = false;
      this.IIlIl = -1;
      this.llll = -1;
      this.III = -1;
      this.Il = 0;
      this.lIII = 0L;
      this.IIIIl = null;
      this.lIlI = null;
      this.IlI = false;
      this.lIll = -1;
      this.lII = lIIlI(1680977552, -1991626499 ^ 1415303427);
      this.lIIl = false;
      this.IllI = lIIlI(1680977555, -1991626499 ^ -1881783590);
      this.IIllI = null;
      this.lllI();
   }

   private class_3965 ll(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual k74/x/llIlII.II (Lnet/minecraft/class_310;)Lnet/minecraft/class_3965;
      // 05: astore 3
      // 06: aload 3
      // 07: ifnull 22
      // 0a: aload 2
      // 0b: aload 3
      // 0c: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 0f: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 12: ifeq 22
      // 15: goto 1c
      // 18: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1b: athrow
      // 1c: aload 3
      // 1d: areturn
      // 1e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21: athrow
      // 22: new net/minecraft/class_3965
      // 25: dup
      // 26: aload 2
      // 27: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 2a: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 2d: aload 2
      // 2e: bipush 0
      // 2f: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
      // 32: areturn
   }

   @Override
   public void llIIII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: invokevirtual k74/x/llIlII.IIIIlIl ()Z
      // 008: ifeq 02a
      // 00b: aload 1
      // 00c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 00f: ifnull 02a
      // 012: goto 019
      // 015: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 018: athrow
      // 019: aload 1
      // 01a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01d: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 020: ifne 033
      // 023: goto 02a
      // 026: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 029: athrow
      // 02a: aload 0
      // 02b: invokevirtual k74/x/llIlII.llI ()V
      // 02e: return
      // 02f: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 032: athrow
      // 033: aload 0
      // 034: aload 1
      // 035: invokevirtual k74/x/llIlII.lIIII (Lnet/minecraft/class_310;)V
      // 038: aload 0
      // 039: aload 1
      // 03a: invokevirtual k74/x/llIlII.Illll (Lnet/minecraft/class_310;)V
      // 03d: aload 0
      // 03e: aload 1
      // 03f: invokevirtual k74/x/llIlII.lIl (Lnet/minecraft/class_310;)V
      // 042: aload 1
      // 043: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 046: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 049: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 04c: istore 3
      // 04d: aload 0
      // 04e: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 051: getstatic k74/x/lIIlIlll.II Lk74/x/lIIlIlll;
      // 054: if_acmpne 0bf
      // 057: aload 0
      // 058: getfield k74/x/llIlII.Ill Z
      // 05b: ifne 0bf
      // 05e: goto 065
      // 061: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 064: athrow
      // 065: aload 0
      // 066: getfield k74/x/llIlII.lI Z
      // 069: ifne 0bf
      // 06c: goto 073
      // 06f: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 072: athrow
      // 073: aload 0
      // 074: aload 1
      // 075: invokevirtual k74/x/llIlII.II (Lnet/minecraft/class_310;)Lnet/minecraft/class_3965;
      // 078: astore 4
      // 07a: aload 4
      // 07c: ifnull 0bf
      // 07f: aload 0
      // 080: aload 1
      // 081: aload 4
      // 083: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 086: invokevirtual k74/x/llIlII.IlIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 089: ifeq 0bf
      // 08c: goto 093
      // 08f: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 092: athrow
      // 093: aload 4
      // 095: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 098: astore 5
      // 09a: aload 0
      // 09b: aload 4
      // 09d: putfield k74/x/llIlII.lIlI Lnet/minecraft/class_3965;
      // 0a0: aload 0
      // 0a1: aload 1
      // 0a2: aload 5
      // 0a4: aload 0
      // 0a5: aload 1
      // 0a6: aload 5
      // 0a8: invokevirtual k74/x/llIlII.lIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)I
      // 0ab: invokevirtual k74/x/llIlII.Il (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;I)Z
      // 0ae: ifeq 0bf
      // 0b1: aload 0
      // 0b2: invokevirtual k74/x/llIlII.lllI ()V
      // 0b5: aload 0
      // 0b6: aload 1
      // 0b7: invokevirtual k74/x/llIlII.IlII (Lnet/minecraft/class_310;)V
      // 0ba: return
      // 0bb: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 0c3: getstatic k74/x/lIIlIlll.II Lk74/x/lIIlIlll;
      // 0c6: if_acmpne 0de
      // 0c9: aload 0
      // 0ca: aload 1
      // 0cb: iload 3
      // 0cc: invokevirtual k74/x/llIlII.I (Lnet/minecraft/class_310;Z)Z
      // 0cf: ifeq 0de
      // 0d2: goto 0d9
      // 0d5: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d8: athrow
      // 0d9: return
      // 0da: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0dd: athrow
      // 0de: aload 0
      // 0df: aload 1
      // 0e0: invokevirtual k74/x/llIlII.IllIl (Lnet/minecraft/class_310;)Z
      // 0e3: ifeq 112
      // 0e6: aload 0
      // 0e7: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 0ea: getstatic k74/x/lIIlIlll.II Lk74/x/lIIlIlll;
      // 0ed: if_acmpeq 107
      // 0f0: goto 0f7
      // 0f3: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: invokevirtual k74/x/llIlII.lI ()V
      // 0fb: aload 0
      // 0fc: bipush 1
      // 0fd: putfield k74/x/llIlII.Ill Z
      // 100: goto 107
      // 103: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 106: athrow
      // 107: aload 1
      // 108: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 10b: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 10e: invokestatic k74/x/IIll.lIIIIlI (Lnet/minecraft/class_304;)V
      // 111: return
      // 112: aload 0
      // 113: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 116: getstatic k74/x/lIIlIlll.II Lk74/x/lIIlIlll;
      // 119: if_acmpeq 12a
      // 11c: aload 1
      // 11d: invokestatic k74/x/IIll.IlIll (Lnet/minecraft/class_310;)V
      // 120: aload 0
      // 121: aload 1
      // 122: invokevirtual k74/x/llIlII.IlII (Lnet/minecraft/class_310;)V
      // 125: return
      // 126: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 129: athrow
      // 12a: aload 0
      // 12b: getfield k74/x/llIlII.Ill Z
      // 12e: ifne 13f
      // 131: aload 0
      // 132: getfield k74/x/llIlII.lI Z
      // 135: ifeq 16e
      // 138: goto 13f
      // 13b: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 13e: athrow
      // 13f: iload 3
      // 140: ifne 15f
      // 143: goto 14a
      // 146: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 149: athrow
      // 14a: aload 0
      // 14b: bipush 0
      // 14c: putfield k74/x/llIlII.Ill Z
      // 14f: aload 0
      // 150: bipush 0
      // 151: putfield k74/x/llIlII.lI Z
      // 154: aload 2
      // 155: ifnull 16e
      // 158: goto 15f
      // 15b: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15e: athrow
      // 15f: aload 1
      // 160: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 163: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 166: invokestatic k74/x/IIll.lIIIIlI (Lnet/minecraft/class_304;)V
      // 169: return
      // 16a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16d: athrow
      // 16e: return
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      this.Illll(var1);
      this.lIl(var1);
   }

   @Override
   public void llIl() {
      this.lI();
      this.Ill = false;
      this.lI = false;
      this.Illl = 0;
      this.IIl.clear();
      this.IIIII = null;
      this.lll = lIIlI(1680977554, 1659416023 ^ -599751275);
      this.llII = null;
   }

   private static boolean III(class_310 param0, class_3965 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IIll.IlIll (Lnet/minecraft/class_310;)V
      // 04: aload 0
      // 05: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 08: aload 1
      // 09: invokestatic k74/x/IIll.IlIIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
      // 0c: astore 2
      // 0d: aload 2
      // 0e: ifnull 29
      // 11: aload 2
      // 12: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 17: ifeq 29
      // 1a: goto 21
      // 1d: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 20: athrow
      // 21: bipush 1
      // 22: goto 2a
      // 25: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: bipush 0
      // 2a: ireturn
   }

   private void IIl(lIIlIlll var1) {
      this.II = var1;
      this.llI = System.currentTimeMillis();
      this.lIII = this.IlllI(var1);
   }

   private void Ill(class_310 var1, class_3965 var2) {
      this.lIIl = true;
      this.IllI = var1.field_1724.field_6012 + lIIlI(1680977557, -1124388216 ^ 1104767783);
      this.IIllI = var2;
      this.IIl(lIIlIlll.IIl);
   }

   private void lII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 3b
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 3b
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 3b
      // 19: goto 20
      // 1c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1765 Lnet/minecraft/class_239;
      // 24: astore 3
      // 25: aload 3
      // 26: instanceof net/minecraft/class_3965
      // 29: ifeq 3b
      // 2c: aload 3
      // 2d: checkcast net/minecraft/class_3965
      // 30: astore 2
      // 31: aload 2
      // 32: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 35: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 38: if_acmpeq 40
      // 3b: return
      // 3c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3f: athrow
      // 40: aload 0
      // 41: aload 1
      // 42: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 45: aload 2
      // 46: invokevirtual k74/x/llIlII.IllII (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)V
      // 49: return
   }

   public void lIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/llIlII.IIIII Lnet/minecraft/class_2338;
      // 04: ifnull 2e
      // 07: aload 1
      // 08: ifnull 2e
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 16: ifnull 2e
      // 19: goto 20
      // 1c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 24: ifnonnull 33
      // 27: goto 2e
      // 2a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: return
      // 2f: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 32: athrow
      // 33: aload 1
      // 34: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 37: aload 0
      // 38: getfield k74/x/llIlII.IIIII Lnet/minecraft/class_2338;
      // 3b: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 3e: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 41: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 44: ifeq c4
      // 47: aload 0
      // 48: getfield k74/x/llIlII.IIIII Lnet/minecraft/class_2338;
      // 4b: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 4e: astore 2
      // 4f: aload 0
      // 50: getfield k74/x/llIlII.IIl Ljava/util/Map;
      // 53: aload 2
      // 54: invokestatic java/lang/System.currentTimeMillis ()J
      // 57: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 5a: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 5f: pop
      // 60: aload 0
      // 61: aconst_null
      // 62: putfield k74/x/llIlII.IIIII Lnet/minecraft/class_2338;
      // 65: aload 0
      // 66: ldc_w 1680977556
      // 69: ldc_w -1430650672
      // 6c: ldc_w -233638078
      // 6f: ixor
      // 70: invokestatic k74/x/llIlII.lIIlI (II)I
      // 73: putfield k74/x/llIlII.lll I
      // 76: aload 0
      // 77: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 7a: getstatic k74/x/lIIlIlll.II Lk74/x/lIIlIlll;
      // 7d: if_acmpne c3
      // 80: aload 0
      // 81: aload 2
      // 82: putfield k74/x/llIlII.IlIIl Lnet/minecraft/class_2338;
      // 85: aload 0
      // 86: aload 0
      // 87: aload 1
      // 88: aload 2
      // 89: invokevirtual k74/x/llIlII.ll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Lnet/minecraft/class_3965;
      // 8c: putfield k74/x/llIlII.IlIlI Lnet/minecraft/class_3965;
      // 8f: aload 0
      // 90: aload 1
      // 91: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 94: getfield net/minecraft/class_746.field_6012 I
      // 97: bipush 1
      // 98: iadd
      // 99: putfield k74/x/llIlII.IIlI I
      // 9c: aload 0
      // 9d: aload 1
      // 9e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // a1: getfield net/minecraft/class_746.field_6012 I
      // a4: ldc_w 1680977559
      // a7: ldc_w -1430650672
      // aa: ldc_w 332139207
      // ad: ixor
      // ae: invokestatic k74/x/llIlII.lIIlI (II)I
      // b1: iadd
      // b2: putfield k74/x/llIlII.IIIll I
      // b5: aload 0
      // b6: invokestatic k74/x/IIll.IllllI ()J
      // b9: putfield k74/x/llIlII.lIl J
      // bc: goto c3
      // bf: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c2: athrow
      // c3: return
      // c4: aload 1
      // c5: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // c8: getfield net/minecraft/class_746.field_6012 I
      // cb: aload 0
      // cc: getfield k74/x/llIlII.lll I
      // cf: if_icmple ef
      // d2: aload 0
      // d3: aconst_null
      // d4: putfield k74/x/llIlII.IIIII Lnet/minecraft/class_2338;
      // d7: aload 0
      // d8: ldc_w 1680977558
      // db: ldc_w -1430650672
      // de: ldc_w -945278242
      // e1: ixor
      // e2: invokestatic k74/x/llIlII.lIIlI (II)I
      // e5: putfield k74/x/llIlII.lll I
      // e8: goto ef
      // eb: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // ee: athrow
      // ef: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = 1432748534;
      byte var20 = -1;
      String var14 = "眕瑨睒瓟璋礞磌瑙睖癢碲磲琩矷砙瓙祣瞡璛礒砇眢秨礜琮矛瓶癢瑯磾璇碠磑璴禗瑝癖琷眄琒瓴禖礻祬硕睺璒硵琤璑睪秡祽祮磹矸眬璷砐硴眍礕砂璩硌礙癙磗瓠璵砮碎砒碷瓻磄砅磒禫矱璭礎碌瞮璋硷磮磫矡琯璳璟砚瓟祾祣瞺碎磀睮眂琦璌琋砨砨硌祢癗碻瞠璮秤碁瞼矅砆硓祣琺睸矂砌睪眻矽睢祢睜睈璾祢瓽矇眯瓐秫瞣砃矛琻秡眃眊秗瑓硕癭碷碿秘礑研璤瓔琻禬矏秄砽硃硎秕矄磪禒秩琷睹碠硌琘硊矽磂瑑睮環硝祢礻磜睾瓥瓀碱琨琺硛璱瑦硬璍瑖砘睶砋矍睲確睡秡瑦琢眍瑚璆瓱瓝硫砝琥硰璂瓙矂社禁秈瓞秧禉磵禆磁癣祸琽睵禀瓳瞈砧琠禬祮督璾硌琯睶碽禲礕瓖琲璆琳磜琑硈祣秕璐眉瓘禗璐璅瑕瓱璺砅瑦秗琦睗睅瘗蝴蜛衵蒃蠧裝蓤蟤蓾萝襾裝衆裲蠁蝺袍萣蠃螶裒蒽蓰袱裁";
      char[] var15 = "č\u0019".toCharArray();
      short var13 = 17652;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            IllII = var16;
            IllIl = new Object[var16.length];
            int var9 = 709819341;
            byte[] var7 = "U?\fÕì\u0091ö\u00917\u001ceK\u008f(?/L¢NÁi(àù\bö\u001dG\\\u0092%ggMù\u00872éL@\f\u0096ç»\u000eÚ\u00832m\u008b\n\u001btC^f3Mè¨\u001dxº7ä±j=I4\u0080í;\u00ad\u0003õ*±\u009c\u009d¸-öáßb\u0092%N3\u00ad\u0013¶à\u009aQn¾\u0000÷®Ã£\u0089=\r8Îð4ª\u009câ\u008c\u0091Ïh'm¾â²\u0018}Á\u008e\u009c\u001f¨K¹o³+Â\u001aÓKjô\u009cÈüÂ\u009dz8îØ_\u0084è\u009f}Èr-ç*%?©þ\u00906\u0099ÏÄÑ\u001dnûP¹\tGSJ°,íó\u0017\u0004Ò\u001eP\u0081ÜÆVHÌ\u009aÌ¬\u0095Ç¿ä$\u001b±\u009d\u0081\u009f%#s®N©\rãû%ù%È^\u001c')æsm&|Ï\u009fh\u0089K~}\u009a \u0019¯¬ñìèÿ\n5ôâ\u0012\u0087.\u0012~\u0093\u0083 \u0082ùÞ_©xz`Ti_²\u008d\u0011\u008d\u009aH\u0001>\f\f=ó\u0093\u008a\tL©æ\u000b\nr=om&¡\u001d²7Ä,=\u0092,a½¾1ÆÇe!Æ,ßóÊE\"\u008f)Ê\u0082W\u0081^SÇ¦nàôÔ2\u0005M÷B\u001f\u009bë.\u0096\u009cÿú\u0082eàc\u009dTë1ä$\u009fÃ©\u001e-Î¥h°$\t«\u0016£\fJZ3È±^a-\u008e\u000bYùÑ<\u0085ZCDìØYÈ%\u0014*\u008a\u0004Âóª°ÂÂ&ÎAjTE\u0085\u0016\u0011©\u0003-»%ßA#x[ÈWV£åíÊ£\u0017¶\u0093Ìí\bOÓÕÓ¡\u0084cÎeÓ\u001dt\u0085ÂþÓ6ÃJú\n&Å\u008b/wîèb\nÅØ¿J?¢\u0007¾\u0007·=Å\u0091Tm\u0018¼J@xð¼,|i½@h/xÍ¬\u000bÅQ{\u008fd-V~Üã4\u0005?&<9YwW¸]\u0096¤ü\u001c\u000b0T4\u008eÔ\u0004 gÕ\u0011\u008aô¨\u0016\u0093ýêÂÜ\u0086Ð6Á\u0091\n|<ºâñj)þTÇ© z\u001aAÍ÷Ûµþ¥¬\u0080Ü\u009aÖ\u008eQó[È\u0082q2\u0013â\u0089\u009euÓ\u0015\u0007ü\u001b1f´R\u008e]í|Çd®¸®»Èì>£\u0015ß\u0001ô$\u001b\u008eåFLWçâ\u0097\u0004,ââÖ\u000e%xÛÓU±ÇdÓ\u0018\u001cï\u0017Ä¹t3\u0000¨j\tí\u0013â\u0098\u0004\r®³\u009dI¬1\u0096ñ\u008dº\u0095Q\u009f\u0091\u001e\u00ad\u0019±íM×,(§¦\u001dá æÔZà$²R\u009ajG\u0006_\u009d)0¯\u0006$*éëR×\u008fR20ûâ Z\u0080õ\u0014o\u0098\u0092/k¤\nèfµ\u0087¼Ô\u0098×}\u0018u^ìbDå@°7GòBz\u0019PT»P\u0000¸y\u0091>\rWÛX\u001cÅ\fO\u0099\u001a\u0006Í\u0088ëu_¶¡´ÛH\u0094\u0091(üD\u0011\u0007úeÅ\u001eÄXR@\u0081ßÙðüe~Ê/mÝÈ´?T¦¬Ïc3kç\r!Z-Ü\u0003dò\u00869}Ïó\u007fjwõ\u0080Ð\u009eî\u009a\u000eÏo\u0018å]p\u0013\u0080çkÎ;\u008c\u0090äõ÷ä7\u0017)ÂPmºS\u001f\u000bVÞâÂ\u001aK=\u008dt>.q\u0013¾úu;ýÞ¢gL\u009dä\u0088Ã\r&D_5bÄ&&$Þ\u0016\u008dãC(û¯$òàTØ|6¥QÍ°\u0088¤È\u0004ò{¾ð\u0013\u0095\u000b÷¡Ì\u0083Ü`ññH\u009e¬1V>q}Ú«\u0010\u00ad\u009cî?ä`£·\u008eÊB|\u0080±u! º¸\u009dEsð÷hy\u009dWw\ro-h\u001a\u0005\u001bÛ Æ÷ß$1\u0006<\u001cÔzXL]<\nôaÃö\u0080fMLð\u0011\u001c]fç&÷,\r7Û\u0096¶ôÑKÏÚ`Ê*Ü\u0082,\u0090ÚOp)Q\u0081¦íàPG¢)PÏB\u0015²±x2òµ!%[K\u0004$È¶X£E\u0081\u009cÚ_Ïûùø{$?-àx¡\u0092ïDÙ8¬G)í¾ÞN²\u0012\"ëûbÂÆn\u0083ÔúD´wèK\u0087\u0095\u000f\u0016*ÉB¡\\¢\u009d\u0091¦«=\u0003çMÀË*«Sv\u0007°pü\t\u001eîí´\u0089\u0013\u0082t{õ\u0093ºÕ\u0097c!\u0003é>xÊ\u008c\u0006|\u001c½¯\u0091¸ËÍ¿»\u008a\u009el\u0019\u009bØ\u0088·\u001døÏR\u000f\u009f±\u0095@\u0093ù\u0084P ·òÚÄ\u0092,^\u0019Û!a\u0010U\u001d+¸êð\u0015kÆ#v\u00925[¹\u001f*a@\u00175\u000fÈÆ4a\u001e\u0003ò\u0012j\u0005m#£\u008eÚr[õÍ[\u001a\u00926\u009f\u001fë+\u001f`¾!oC%Æ\u007flÈ\u000eæ^iõ\u0090Q\u000e\u00adU\u001cUÃ\u001a\u0006Çcúr×8\u0012Í%Yö\u0014örµ\"V²\u001fú\u0007m]xgÖï&\b\u0005\u00980;\u001cÁ\u0093d©®\u0014|\u007fLù\u008f\u008c\u0082\u000f,±=%,§\u0084"
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

            String[] var5 = new String[lIIlI(1680977538, var24 ^ -833123802)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lIIll(41282, '冖', var24 ^ 201226517)).length();
            int var1 = lIIlI(1680977541, var24 ^ 1556865117);
            int var26 = -1;

            label95:
            while (true) {
               int var29 = lIIlI(1680977540, var24 ^ 998541178);
               String var10001 = var2.substring(++var26, var26 + var1);
               byte var10002 = -1;

               while (true) {
                  label90: {
                     char[] var45 = var10001.toCharArray();
                     int var10004 = var45.length;
                     int var6 = 0;
                     int var48 = var29;
                     var41 = var45;
                     int var35 = var10004;
                     char[] var57;
                     int var10006;
                     if (var10004 <= 1) {
                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     } else {
                        var48 = var29;
                        var35 = var10004;
                        if (var10004 <= var6) {
                           break label90;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lIIlI(1680977542, var24 ^ 1376160967)) {
                           case 0 -> lIIlI(1680977545, var24 ^ -1973938810);
                           case 1 -> lIIlI(1680977544, var24 ^ 1243985214);
                           case 2 -> lIIlI(1680977547, var24 ^ -638898584);
                           case 3 -> lIIlI(1680977546, var24 ^ 349355991);
                           case 4 -> lIIlI(1680977549, var24 ^ 107644067);
                           case 5 -> lIIlI(1680977548, var24 ^ -1933477092);
                           default -> lIIlI(1680977551, var24 ^ 106171680);
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
                        if ((var26 += var1) >= var4) {
                           I = var5;
                           IlIl = new String[lIIlI(1680977543, var24 ^ -1428833363)];
                           return;
                        }

                        var1 = var2.charAt(var26);
                        break;
                     default:
                        var5[var3++] = var50;
                        if ((var26 += var1) < var4) {
                           var1 = var2.charAt(var26);
                           continue label95;
                        }

                        var4 = (var2 = lIIll(21972, '冗', var24 ^ 790388957)).length();
                        var1 = 4;
                        var26 = -1;
                  }

                  var29 = 1;
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
                  default -> 90;
                  case 1 -> 225;
                  case 2 -> 71;
                  case 3 -> 110;
                  case 4 -> 24;
                  case 5 -> 237;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private void llI() {
      this.II = lIIlIlll.II;
      this.Ill = false;
      this.lI = false;
      this.IIlIl = -1;
      this.llll = -1;
      this.III = -1;
      this.Il = 0;
      this.lIII = 0L;
      this.IIIIl = null;
      this.lIlI = null;
      this.IlI = false;
      this.lIll = -1;
      this.lII = lIIlI(1680977561, -1087447846 ^ -370986437);
      this.lIIl = false;
      this.IllI = lIIlI(1680977560, -1087447846 ^ -1136162819);
      this.IIllI = null;
      this.lllI();
   }

   private static MatchException lll(MatchException var0) {
      return var0;
   }

   public boolean IIII() {
      try {
         if (this.II != lIIlIlll.II) {
            return true;
         }
      } catch (MatchException var1) {
         throw lll(var1);
      }

      return false;
   }

   private boolean IIIl(class_310 param1) {
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
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 1
      // 19: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 1c: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 1f: invokestatic k74/x/IIll.lIIIIlI (Lnet/minecraft/class_304;)V
      // 22: aload 0
      // 23: bipush 1
      // 24: putfield k74/x/llIlII.Ill Z
      // 27: bipush 1
      // 28: ireturn
   }

   @Override
   public void IlllII(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w -302185327
      // 03: istore 2
      // 04: aload 0
      // 05: aload 1
      // 06: invokespecial k74/x/IlIIIIIIl.IlllII (Lcom/google/gson/JsonObject;)V
      // 09: aload 0
      // 0a: aload 1
      // 0b: ldc_w 1680977563
      // 0e: iload 2
      // 0f: ldc_w 1357533364
      // 12: ixor
      // 13: invokestatic k74/x/llIlII.lIIlI (II)I
      // 16: ldc_w 1680977562
      // 19: iload 2
      // 1a: ldc_w 1386565263
      // 1d: ixor
      // 1e: invokestatic k74/x/llIlII.lIIlI (II)I
      // 21: invokestatic k74/x/llIlII.l (II)Ljava/lang/String;
      // 24: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 27: bipush 1
      // 28: anewarray 566
      // 2b: dup
      // 2c: bipush 0
      // 2d: aload 0
      // 2e: getfield k74/x/llIlII.IlII Lk74/x/lIlllIl;
      // 31: aastore
      // 32: invokevirtual k74/x/llIlII.IIIlIIl (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lk74/x/lIlllIl;)V
      // 35: aload 0
      // 36: aload 1
      // 37: ldc_w 1680977565
      // 3a: iload 2
      // 3b: ldc_w 838319485
      // 3e: ixor
      // 3f: invokestatic k74/x/llIlII.lIIlI (II)I
      // 42: ldc_w 1680977564
      // 45: iload 2
      // 46: ldc_w 675267987
      // 49: ixor
      // 4a: invokestatic k74/x/llIlII.lIIlI (II)I
      // 4d: invokestatic k74/x/llIlII.l (II)Ljava/lang/String;
      // 50: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 53: bipush 1
      // 54: anewarray 566
      // 57: dup
      // 58: bipush 0
      // 59: aload 0
      // 5a: getfield k74/x/llIlII.IlII Lk74/x/lIlllIl;
      // 5d: aastore
      // 5e: invokevirtual k74/x/llIlII.IIIlIIl (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lk74/x/lIlllIl;)V
      // 61: aload 0
      // 62: aload 1
      // 63: ldc_w 1680977567
      // 66: iload 2
      // 67: ldc_w 1865506765
      // 6a: ixor
      // 6b: invokestatic k74/x/llIlII.lIIlI (II)I
      // 6e: ldc_w 1680977566
      // 71: iload 2
      // 72: ldc_w 1091008132
      // 75: ixor
      // 76: invokestatic k74/x/llIlII.lIIlI (II)I
      // 79: invokestatic k74/x/llIlII.l (II)Ljava/lang/String;
      // 7c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 7f: bipush 1
      // 80: anewarray 566
      // 83: dup
      // 84: bipush 0
      // 85: aload 0
      // 86: getfield k74/x/llIlII.IlII Lk74/x/lIlllIl;
      // 89: aastore
      // 8a: invokevirtual k74/x/llIlII.IIIlIIl (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lk74/x/lIlllIl;)V
      // 8d: aload 0
      // 8e: aload 1
      // 8f: ldc_w 1680977537
      // 92: iload 2
      // 93: ldc_w -1194468013
      // 96: ixor
      // 97: invokestatic k74/x/llIlII.lIIlI (II)I
      // 9a: ldc_w 1680977536
      // 9d: iload 2
      // 9e: ldc_w 357094398
      // a1: ixor
      // a2: invokestatic k74/x/llIlII.lIIlI (II)I
      // a5: invokestatic k74/x/llIlII.l (II)Ljava/lang/String;
      // a8: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // ab: bipush 1
      // ac: anewarray 566
      // af: dup
      // b0: bipush 0
      // b1: aload 0
      // b2: getfield k74/x/llIlII.IlII Lk74/x/lIlllIl;
      // b5: aastore
      // b6: invokevirtual k74/x/llIlII.IIIlIIl (Lcom/google/gson/JsonObject;Ljava/lang/String;[Lk74/x/lIlllIl;)V
      // b9: aload 0
      // ba: getfield k74/x/llIlII.IlII Lk74/x/lIlllIl;
      // bd: invokevirtual k74/x/lIlllIl.IIlI ()D
      // c0: ldc2_w 55.0
      // c3: dcmpl
      // c4: ifne f5
      // c7: aload 0
      // c8: getfield k74/x/llIlII.IlII Lk74/x/lIlllIl;
      // cb: invokevirtual k74/x/lIlllIl.IlI ()D
      // ce: ldc2_w 60.0
      // d1: dcmpl
      // d2: ifne f5
      // d5: goto dc
      // d8: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // db: athrow
      // dc: aload 0
      // dd: getfield k74/x/llIlII.IlII Lk74/x/lIlllIl;
      // e0: bipush 2
      // e1: newarray 7
      // e3: dup
      // e4: bipush 0
      // e5: dconst_0
      // e6: dastore
      // e7: dup
      // e8: bipush 1
      // e9: dconst_0
      // ea: dastore
      // eb: invokevirtual k74/x/lIlllIl.III ([D)V
      // ee: goto f5
      // f1: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // f4: athrow
      // f5: return
   }

   private int IIlI(class_1657 param1) {
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
      // 03: ldc_w 1680977539
      // 06: ldc_w -1423991299
      // 09: ldc_w 556960115
      // 0c: ixor
      // 0d: invokestatic k74/x/llIlII.lIIlI (II)I
      // 10: if_icmpge 35
      // 13: aload 0
      // 14: aload 1
      // 15: invokevirtual net/minecraft/class_1657.method_31548 ()Lnet/minecraft/class_1661;
      // 18: iload 2
      // 19: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 1c: invokevirtual k74/x/llIlII.IIlll (Lnet/minecraft/class_1799;)Z
      // 1f: ifeq 2f
      // 22: goto 29
      // 25: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: iload 2
      // 2a: ireturn
      // 2b: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2e: athrow
      // 2f: iinc 2 1
      // 32: goto 02
      // 35: bipush -1
      // 36: ireturn
   }

   private boolean IIll(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 04: astore 3
      // 05: aload 0
      // 06: getfield k74/x/llIlII.IIl Ljava/util/Map;
      // 09: aload 3
      // 0a: invokeinterface java/util/Map.containsKey (Ljava/lang/Object;)Z 2
      // 0f: ifne 18
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 1
      // 19: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1c: ifnull 37
      // 1f: aload 1
      // 20: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 23: aload 3
      // 24: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 27: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 2a: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 2d: ifne 48
      // 30: goto 37
      // 33: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 36: athrow
      // 37: aload 0
      // 38: getfield k74/x/llIlII.IIl Ljava/util/Map;
      // 3b: aload 3
      // 3c: invokeinterface java/util/Map.remove (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 41: pop
      // 42: bipush 0
      // 43: ireturn
      // 44: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 47: athrow
      // 48: bipush 1
      // 49: ireturn
   }

   private void IlII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 2
      // 004: aload 0
      // 005: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 008: getstatic k74/x/lIIlIlll.II Lk74/x/lIIlIlll;
      // 00b: if_acmpne 013
      // 00e: return
      // 00f: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 012: athrow
      // 013: aload 1
      // 014: ifnull 033
      // 017: aload 1
      // 018: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01b: ifnull 033
      // 01e: goto 025
      // 021: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 024: athrow
      // 025: aload 1
      // 026: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 029: ifnonnull 03c
      // 02c: goto 033
      // 02f: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 032: athrow
      // 033: aload 0
      // 034: invokevirtual k74/x/llIlII.lI ()V
      // 037: return
      // 038: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03b: athrow
      // 03c: invokestatic java/lang/System.currentTimeMillis ()J
      // 03f: lstore 3
      // 040: lload 3
      // 041: aload 0
      // 042: getfield k74/x/llIlII.IIIlI J
      // 045: lsub
      // 046: ldc2_w 5000
      // 049: lcmp
      // 04a: ifle 056
      // 04d: aload 0
      // 04e: invokevirtual k74/x/llIlII.lI ()V
      // 051: return
      // 052: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 055: athrow
      // 056: aload 0
      // 057: getfield k74/x/llIlII.IlI Z
      // 05a: ifeq 067
      // 05d: aload 0
      // 05e: aload 1
      // 05f: invokevirtual k74/x/llIlII.IIIll (Lnet/minecraft/class_310;)V
      // 062: return
      // 063: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 066: athrow
      // 067: aload 0
      // 068: getfield k74/x/llIlII.lIIl Z
      // 06b: ifeq 078
      // 06e: aload 0
      // 06f: aload 1
      // 070: invokevirtual k74/x/llIlII.lIlI (Lnet/minecraft/class_310;)V
      // 073: return
      // 074: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 077: athrow
      // 078: lload 3
      // 079: aload 0
      // 07a: getfield k74/x/llIlII.llI J
      // 07d: lsub
      // 07e: lstore 5
      // 080: aload 0
      // 081: getfield k74/x/llIlII.lIII J
      // 084: lstore 7
      // 086: aload 0
      // 087: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 08a: invokevirtual k74/x/lIIlIlll.ordinal ()I
      // 08d: tableswitch 206 1 6 39 55 86 117 148 179
      // 0b4: aload 0
      // 0b5: aload 1
      // 0b6: invokespecial k74/x/llIlII.IIIII (Lnet/minecraft/class_310;)V
      // 0b9: aload 2
      // 0ba: ifnull 15b
      // 0bd: goto 0c4
      // 0c0: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c3: athrow
      // 0c4: lload 5
      // 0c6: lload 7
      // 0c8: lcmp
      // 0c9: iflt 15b
      // 0cc: goto 0d3
      // 0cf: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d2: athrow
      // 0d3: aload 0
      // 0d4: aload 1
      // 0d5: invokevirtual k74/x/llIlII.lIll (Lnet/minecraft/class_310;)V
      // 0d8: aload 2
      // 0d9: ifnull 15b
      // 0dc: goto 0e3
      // 0df: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e2: athrow
      // 0e3: lload 5
      // 0e5: lload 7
      // 0e7: lcmp
      // 0e8: iflt 15b
      // 0eb: goto 0f2
      // 0ee: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f1: athrow
      // 0f2: aload 0
      // 0f3: aload 1
      // 0f4: invokevirtual k74/x/llIlII.lIll (Lnet/minecraft/class_310;)V
      // 0f7: aload 2
      // 0f8: ifnull 15b
      // 0fb: goto 102
      // 0fe: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 101: athrow
      // 102: lload 5
      // 104: lload 7
      // 106: lcmp
      // 107: iflt 15b
      // 10a: goto 111
      // 10d: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 110: athrow
      // 111: aload 0
      // 112: aload 1
      // 113: invokevirtual k74/x/llIlII.lIll (Lnet/minecraft/class_310;)V
      // 116: aload 2
      // 117: ifnull 15b
      // 11a: goto 121
      // 11d: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 120: athrow
      // 121: lload 5
      // 123: lload 7
      // 125: lcmp
      // 126: iflt 15b
      // 129: goto 130
      // 12c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 12f: athrow
      // 130: aload 0
      // 131: aload 1
      // 132: invokevirtual k74/x/llIlII.lIll (Lnet/minecraft/class_310;)V
      // 135: aload 2
      // 136: ifnull 15b
      // 139: goto 140
      // 13c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 13f: athrow
      // 140: lload 5
      // 142: lload 7
      // 144: lcmp
      // 145: iflt 15b
      // 148: goto 14f
      // 14b: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14e: athrow
      // 14f: aload 0
      // 150: aload 1
      // 151: invokevirtual k74/x/llIlII.lIII (Lnet/minecraft/class_310;)V
      // 154: goto 15b
      // 157: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15a: athrow
      // 15b: return
   }

   @Override
   public String IlllIl() {
      return "";
   }

   private static int lIIlI(int var0, int var1) {
      int var2 = IlIll[var0 ^ 1680977553] ^ var1 ^ var0;
      var2 += 9102;
      var2 += 31514;
      var2 ^= 23530;
      var2 -= 25549;
      var2 -= 34461;
      var2 ^= 32775;
      var2 += 39678;
      var2 += 32833;
      var2 += 57481;
      return var2 - 19593;
   }

   private boolean IlIl(class_310 param1, class_2338 param2) {
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
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: ifnull 35
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 2
      // 13: ifnull 35
      // 16: goto 1d
      // 19: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: aload 1
      // 1e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 21: aload 2
      // 22: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 25: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 28: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 2b: ifne 3b
      // 2e: goto 35
      // 31: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 34: athrow
      // 35: bipush 0
      // 36: ireturn
      // 37: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a: athrow
      // 3b: aload 0
      // 3c: getfield k74/x/llIlII.llIl Lk74/x/lllIIlII;
      // 3f: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 42: checkcast java/lang/Boolean
      // 45: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 48: ifne 51
      // 4b: bipush 1
      // 4c: ireturn
      // 4d: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 50: athrow
      // 51: aload 2
      // 52: aload 0
      // 53: getfield k74/x/llIlII.IIIII Lnet/minecraft/class_2338;
      // 56: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 59: ifne 6e
      // 5c: aload 2
      // 5d: aload 0
      // 5e: getfield k74/x/llIlII.IlIIl Lnet/minecraft/class_2338;
      // 61: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 64: ifeq 74
      // 67: goto 6e
      // 6a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6d: athrow
      // 6e: bipush 1
      // 6f: ireturn
      // 70: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 73: athrow
      // 74: aload 0
      // 75: aload 1
      // 76: aload 2
      // 77: invokevirtual k74/x/llIlII.IIll (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 7a: ireturn
   }

   private int IllI(class_1657 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/llIlII.lllI Lk74/x/IIlIII;
      // 04: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 07: checkcast java/lang/Double
      // 0a: invokevirtual java/lang/Double.doubleValue ()D
      // 0d: invokestatic java/lang/Math.round (D)J
      // 10: l2i
      // 11: bipush 1
      // 12: isub
      // 13: istore 3
      // 14: iload 3
      // 15: iflt 38
      // 18: aload 0
      // 19: aload 1
      // 1a: invokevirtual net/minecraft/class_1657.method_31548 ()Lnet/minecraft/class_1661;
      // 1d: iload 3
      // 1e: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 21: invokevirtual k74/x/llIlII.IIlll (Lnet/minecraft/class_1799;)Z
      // 24: ifeq 36
      // 27: goto 2e
      // 2a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: iload 3
      // 2f: goto 37
      // 32: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 35: athrow
      // 36: bipush -1
      // 37: ireturn
      // 38: aload 0
      // 39: aload 1
      // 3a: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
      // 3d: invokevirtual k74/x/llIlII.Illl (Lnet/minecraft/class_1657;Lnet/minecraft/class_1792;)I
      // 40: istore 4
      // 42: iload 4
      // 44: bipush -1
      // 45: if_icmpeq 4f
      // 48: iload 4
      // 4a: ireturn
      // 4b: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4e: athrow
      // 4f: aload 1
      // 50: invokevirtual net/minecraft/class_1657.method_31548 ()Lnet/minecraft/class_1661;
      // 53: iload 2
      // 54: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 57: astore 5
      // 59: aload 0
      // 5a: aload 5
      // 5c: invokevirtual k74/x/llIlII.IIlll (Lnet/minecraft/class_1799;)Z
      // 5f: ifeq 68
      // 62: iload 2
      // 63: ireturn
      // 64: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 67: athrow
      // 68: aload 0
      // 69: aload 1
      // 6a: getstatic net/minecraft/class_1802.field_23141 Lnet/minecraft/class_1792;
      // 6d: invokevirtual k74/x/llIlII.Illl (Lnet/minecraft/class_1657;Lnet/minecraft/class_1792;)I
      // 70: istore 6
      // 72: iload 6
      // 74: bipush -1
      // 75: if_icmpeq 7f
      // 78: iload 6
      // 7a: ireturn
      // 7b: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7e: athrow
      // 7f: aload 0
      // 80: aload 1
      // 81: invokevirtual k74/x/llIlII.IIlI (Lnet/minecraft/class_1657;)I
      // 84: istore 7
      // 86: iload 7
      // 88: bipush -1
      // 89: if_icmpeq 95
      // 8c: iload 7
      // 8e: goto 96
      // 91: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 94: athrow
      // 95: iload 2
      // 96: ireturn
   }

   private int Illl(class_1657 param1, class_1792 param2) {
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
      // 03: ldc_w 1680977550
      // 06: ldc_w -1650307415
      // 09: ldc_w -307444288
      // 0c: ixor
      // 0d: invokestatic k74/x/llIlII.lIIlI (II)I
      // 10: if_icmpge 35
      // 13: aload 1
      // 14: invokevirtual net/minecraft/class_1657.method_31548 ()Lnet/minecraft/class_1661;
      // 17: iload 3
      // 18: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 1b: aload 2
      // 1c: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 1f: ifeq 2f
      // 22: goto 29
      // 25: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: iload 3
      // 2a: ireturn
      // 2b: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2e: athrow
      // 2f: iinc 3 1
      // 32: goto 02
      // 35: bipush -1
      // 36: ireturn
   }

   private void lIII(class_310 var1) {
      this.lI();
   }

   private static String l(int var0, int var1) {
      int var9 = -274101234;
      int var2 = (var0 ^ lIIlI(1680977585, var9 ^ -161249601)) & lIIlI(1680977584, var9 ^ 318593370);
      if (IlIl[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & lIIlI(1680977587, var9 ^ -1922893129)) {
            case 0 -> lIIlI(1680977586, var9 ^ -1025416110);
            case 1 -> lIIlI(1680977589, var9 ^ -1017929667);
            case 2 -> lIIlI(1680977588, var9 ^ -2039079868);
            case 3 -> lIIlI(1680977591, var9 ^ -1051438290);
            case 4 -> lIIlI(1680977590, var9 ^ 1942925863);
            case 5 -> lIIlI(1680977593, var9 ^ 1635804712);
            case 6 -> lIIlI(1680977592, var9 ^ 1756389365);
            case 7 -> lIIlI(1680977595, var9 ^ -1892354437);
            case 8 -> lIIlI(1680977594, var9 ^ 244355416);
            case 9 -> lIIlI(1680977597, var9 ^ 224600081);
            case 10 -> lIIlI(1680977596, var9 ^ -1277521999);
            case 11 -> lIIlI(1680977599, var9 ^ -1942501335);
            case 12 -> lIIlI(1680977598, var9 ^ -2098213227);
            case 13 -> 3;
            case 14 -> lIIlI(1680977569, var9 ^ -1833739134);
            case 15 -> lIIlI(1680977568, var9 ^ -873584831);
            case 16 -> lIIlI(1680977571, var9 ^ 2050107783);
            case 17 -> lIIlI(1680977570, var9 ^ -541672002);
            case 18 -> lIIlI(1680977573, var9 ^ 763879055);
            case 19 -> lIIlI(1680977572, var9 ^ 1405772684);
            case 20 -> lIIlI(1680977575, var9 ^ -1492363148);
            case 21 -> lIIlI(1680977574, var9 ^ 1108259294);
            case 22 -> lIIlI(1680977577, var9 ^ 759479590);
            case 23 -> lIIlI(1680977576, var9 ^ -1850281853);
            case 24 -> lIIlI(1680977579, var9 ^ 358082273);
            case 25 -> lIIlI(1680977578, var9 ^ -30394623);
            case 26 -> lIIlI(1680977581, var9 ^ -1346015232);
            case 27 -> lIIlI(1680977580, var9 ^ 1411149699);
            case 28 -> lIIlI(1680977583, var9 ^ 1286518424);
            case 29 -> lIIlI(1680977582, var9 ^ 549067552);
            case 30 -> lIIlI(1680977617, var9 ^ -590328310);
            case 31 -> lIIlI(1680977616, var9 ^ -145626587);
            case 32 -> lIIlI(1680977619, var9 ^ 172017614);
            case 33 -> lIIlI(1680977618, var9 ^ -751299269);
            case 34 -> lIIlI(1680977621, var9 ^ 371762849);
            case 35 -> lIIlI(1680977620, var9 ^ 1377069942);
            case 36 -> lIIlI(1680977623, var9 ^ -736046027);
            case 37 -> lIIlI(1680977622, var9 ^ -1205693819);
            case 38 -> lIIlI(1680977625, var9 ^ 1665594710);
            case 39 -> lIIlI(1680977624, var9 ^ -13360514);
            case 40 -> lIIlI(1680977627, var9 ^ -1710906108);
            case 41 -> lIIlI(1680977626, var9 ^ 1917330736);
            case 42 -> lIIlI(1680977629, var9 ^ 1877958559);
            case 43 -> lIIlI(1680977628, var9 ^ 2146415633);
            case 44 -> lIIlI(1680977631, var9 ^ -1377575606);
            case 45 -> lIIlI(1680977630, var9 ^ -788508040);
            case 46 -> lIIlI(1680977601, var9 ^ 162055742);
            case 47 -> lIIlI(1680977600, var9 ^ -1718618638);
            case 48 -> lIIlI(1680977603, var9 ^ -1426216658);
            case 49 -> lIIlI(1680977602, var9 ^ 333372052);
            case 50 -> lIIlI(1680977605, var9 ^ -977095106);
            case 51 -> lIIlI(1680977604, var9 ^ -1026137719);
            case 52 -> lIIlI(1680977607, var9 ^ 1003092763);
            case 53 -> lIIlI(1680977606, var9 ^ 180529501);
            case 54 -> lIIlI(1680977609, var9 ^ 2058771208);
            case 55 -> 4;
            case 56 -> lIIlI(1680977608, var9 ^ 1074026062);
            case 57 -> lIIlI(1680977611, var9 ^ 916045001);
            case 58 -> lIIlI(1680977610, var9 ^ -180406260);
            case 59 -> lIIlI(1680977613, var9 ^ 343124174);
            case 60 -> lIIlI(1680977612, var9 ^ -277349959);
            case 61 -> lIIlI(1680977615, var9 ^ -803028695);
            case 62 -> lIIlI(1680977614, var9 ^ -1894441503);
            case 63 -> lIIlI(1680977649, var9 ^ 493712385);
            case 64 -> lIIlI(1680977648, var9 ^ 132234659);
            case 65 -> lIIlI(1680977651, var9 ^ 1956879504);
            case 66 -> lIIlI(1680977650, var9 ^ -1383913424);
            case 67 -> lIIlI(1680977653, var9 ^ -1676716682);
            case 68 -> lIIlI(1680977652, var9 ^ 880661928);
            case 69 -> lIIlI(1680977655, var9 ^ 1211642369);
            case 70 -> lIIlI(1680977654, var9 ^ 1938994623);
            case 71 -> lIIlI(1680977657, var9 ^ 520807271);
            case 72 -> lIIlI(1680977656, var9 ^ -1770074613);
            case 73 -> lIIlI(1680977659, var9 ^ -1144759642);
            case 74 -> lIIlI(1680977658, var9 ^ 1235159814);
            case 75 -> lIIlI(1680977661, var9 ^ -1289627902);
            case 76 -> lIIlI(1680977660, var9 ^ -1946535234);
            case 77 -> lIIlI(1680977663, var9 ^ 1038613874);
            case 78 -> lIIlI(1680977662, var9 ^ 1130175882);
            case 79 -> lIIlI(1680977633, var9 ^ -1594186030);
            case 80 -> lIIlI(1680977632, var9 ^ 349409937);
            case 81 -> lIIlI(1680977635, var9 ^ -1683835779);
            case 82 -> lIIlI(1680977634, var9 ^ -1329466780);
            case 83 -> 0;
            case 84 -> lIIlI(1680977637, var9 ^ -1678694425);
            case 85 -> lIIlI(1680977636, var9 ^ 1636540272);
            case 86 -> lIIlI(1680977639, var9 ^ 1503569642);
            case 87 -> lIIlI(1680977638, var9 ^ -813828596);
            case 88 -> lIIlI(1680977641, var9 ^ -496772281);
            case 89 -> lIIlI(1680977640, var9 ^ -1365920577);
            case 90 -> lIIlI(1680977643, var9 ^ 932501743);
            case 91 -> lIIlI(1680977642, var9 ^ 1901157845);
            case 92 -> lIIlI(1680977645, var9 ^ 1441579342);
            case 93 -> lIIlI(1680977644, var9 ^ -783434437);
            case 94 -> lIIlI(1680977647, var9 ^ 552958825);
            case 95 -> lIIlI(1680977646, var9 ^ 1528217318);
            case 96 -> lIIlI(1680977425, var9 ^ 1735452576);
            case 97 -> lIIlI(1680977424, var9 ^ -428603844);
            case 98 -> lIIlI(1680977427, var9 ^ -1573547232);
            case 99 -> lIIlI(1680977426, var9 ^ 169678437);
            case 100 -> lIIlI(1680977429, var9 ^ 1518993322);
            case 101 -> lIIlI(1680977428, var9 ^ 1336108096);
            case 102 -> lIIlI(1680977431, var9 ^ 1220175201);
            case 103 -> lIIlI(1680977430, var9 ^ -1661657433);
            case 104 -> lIIlI(1680977433, var9 ^ 1760037235);
            case 105 -> lIIlI(1680977432, var9 ^ 571812472);
            case 106 -> lIIlI(1680977435, var9 ^ -1354518130);
            case 107 -> lIIlI(1680977434, var9 ^ 183382441);
            case 108 -> lIIlI(1680977437, var9 ^ 607377924);
            case 109 -> lIIlI(1680977436, var9 ^ -1443746419);
            case 110 -> 2;
            case 111 -> lIIlI(1680977439, var9 ^ -75163478);
            case 112 -> lIIlI(1680977438, var9 ^ -989915637);
            case 113 -> lIIlI(1680977409, var9 ^ -1385017304);
            case 114 -> lIIlI(1680977408, var9 ^ 790334420);
            case 115 -> lIIlI(1680977411, var9 ^ -675811937);
            case 116 -> lIIlI(1680977410, var9 ^ 1261333730);
            case 117 -> lIIlI(1680977413, var9 ^ 1867459790);
            case 118 -> lIIlI(1680977412, var9 ^ -797671960);
            case 119 -> lIIlI(1680977415, var9 ^ -1722991047);
            case 120 -> lIIlI(1680977414, var9 ^ -258846492);
            case 121 -> lIIlI(1680977417, var9 ^ 1619690835);
            case 122 -> lIIlI(1680977416, var9 ^ 1608368072);
            case 123 -> lIIlI(1680977419, var9 ^ -791880132);
            case 124 -> lIIlI(1680977418, var9 ^ 164526790);
            case 125 -> lIIlI(1680977421, var9 ^ 1510308528);
            case 126 -> lIIlI(1680977420, var9 ^ -2010661628);
            case 127 -> lIIlI(1680977423, var9 ^ -2047161052);
            case 128 -> lIIlI(1680977422, var9 ^ -1722987690);
            case 129 -> lIIlI(1680977457, var9 ^ 1120308274);
            case 130 -> lIIlI(1680977456, var9 ^ -413291658);
            case 131 -> lIIlI(1680977459, var9 ^ -163343982);
            case 132 -> lIIlI(1680977458, var9 ^ 1305149577);
            case 133 -> lIIlI(1680977461, var9 ^ 1401367445);
            case 134 -> lIIlI(1680977460, var9 ^ 394635875);
            case 135 -> lIIlI(1680977463, var9 ^ -1348197745);
            case 136 -> lIIlI(1680977462, var9 ^ 263588157);
            case 137 -> lIIlI(1680977465, var9 ^ -214947407);
            case 138 -> lIIlI(1680977464, var9 ^ 335459425);
            case 139 -> lIIlI(1680977467, var9 ^ -108032712);
            case 140 -> lIIlI(1680977466, var9 ^ 2127514833);
            case 141 -> lIIlI(1680977469, var9 ^ -1106433440);
            case 142 -> lIIlI(1680977468, var9 ^ -1002184823);
            case 143 -> lIIlI(1680977471, var9 ^ 28619069);
            case 144 -> lIIlI(1680977470, var9 ^ -248529887);
            case 145 -> lIIlI(1680977441, var9 ^ -1211973022);
            case 146 -> lIIlI(1680977440, var9 ^ -780426597);
            case 147 -> lIIlI(1680977443, var9 ^ -1513408499);
            case 148 -> lIIlI(1680977442, var9 ^ -555971370);
            case 149 -> lIIlI(1680977445, var9 ^ -960777031);
            case 150 -> lIIlI(1680977444, var9 ^ -98340811);
            case 151 -> lIIlI(1680977447, var9 ^ -340908849);
            case 152 -> lIIlI(1680977446, var9 ^ -956373700);
            case 153 -> lIIlI(1680977449, var9 ^ 729249011);
            case 154 -> lIIlI(1680977448, var9 ^ 449632438);
            case 155 -> lIIlI(1680977451, var9 ^ 1768843795);
            case 156 -> lIIlI(1680977450, var9 ^ 607176785);
            case 157 -> lIIlI(1680977453, var9 ^ -445016011);
            case 158 -> lIIlI(1680977452, var9 ^ 666412597);
            case 159 -> lIIlI(1680977455, var9 ^ 166903963);
            case 160 -> lIIlI(1680977454, var9 ^ -1692018733);
            case 161 -> lIIlI(1680977489, var9 ^ 1143952794);
            case 162 -> lIIlI(1680977488, var9 ^ -1252210693);
            case 163 -> lIIlI(1680977491, var9 ^ -6468609);
            case 164 -> lIIlI(1680977490, var9 ^ -893863861);
            case 165 -> lIIlI(1680977493, var9 ^ 439918527);
            case 166 -> lIIlI(1680977492, var9 ^ 1005356786);
            case 167 -> lIIlI(1680977495, var9 ^ 108779712);
            case 168 -> lIIlI(1680977494, var9 ^ -2114950273);
            case 169 -> lIIlI(1680977497, var9 ^ 995578601);
            case 170 -> lIIlI(1680977496, var9 ^ 871649490);
            case 171 -> lIIlI(1680977499, var9 ^ 1635597619);
            case 172 -> lIIlI(1680977498, var9 ^ -1857379418);
            case 173 -> lIIlI(1680977501, var9 ^ -1188775210);
            case 174 -> lIIlI(1680977500, var9 ^ 1945473984);
            case 175 -> lIIlI(1680977503, var9 ^ -1397775977);
            case 176 -> lIIlI(1680977502, var9 ^ -1847924963);
            case 177 -> lIIlI(1680977473, var9 ^ 702289963);
            case 178 -> lIIlI(1680977472, var9 ^ -1060699394);
            case 179 -> lIIlI(1680977475, var9 ^ -1857650629);
            case 180 -> lIIlI(1680977474, var9 ^ 56199169);
            case 181 -> lIIlI(1680977477, var9 ^ -1186835024);
            case 182 -> lIIlI(1680977476, var9 ^ -759595861);
            case 183 -> lIIlI(1680977479, var9 ^ -1446138074);
            case 184 -> lIIlI(1680977478, var9 ^ 2011940899);
            case 185 -> lIIlI(1680977481, var9 ^ -461732077);
            case 186 -> lIIlI(1680977480, var9 ^ 150434421);
            case 187 -> lIIlI(1680977483, var9 ^ 1147315624);
            case 188 -> lIIlI(1680977482, var9 ^ 706199234);
            case 189 -> lIIlI(1680977485, var9 ^ 1301766789);
            case 190 -> lIIlI(1680977484, var9 ^ 1708410524);
            case 191 -> lIIlI(1680977487, var9 ^ 962921974);
            case 192 -> lIIlI(1680977486, var9 ^ -689269426);
            case 193 -> 1;
            case 194 -> lIIlI(1680977521, var9 ^ 443985233);
            case 195 -> lIIlI(1680977520, var9 ^ -1710244344);
            case 196 -> lIIlI(1680977523, var9 ^ -2143349375);
            case 197 -> lIIlI(1680977522, var9 ^ 486630339);
            case 198 -> lIIlI(1680977525, var9 ^ 2061203501);
            case 199 -> lIIlI(1680977524, var9 ^ -2041205498);
            case 200 -> lIIlI(1680977527, var9 ^ 266608753);
            case 201 -> lIIlI(1680977526, var9 ^ -85876920);
            case 202 -> lIIlI(1680977529, var9 ^ 630680454);
            case 203 -> lIIlI(1680977528, var9 ^ -886935570);
            case 204 -> lIIlI(1680977531, var9 ^ -1834332959);
            case 205 -> lIIlI(1680977530, var9 ^ -1344745394);
            case 206 -> lIIlI(1680977533, var9 ^ -233255402);
            case 207 -> lIIlI(1680977532, var9 ^ 794051177);
            case 208 -> lIIlI(1680977535, var9 ^ 1317275495);
            case 209 -> 5;
            case 210 -> lIIlI(1680977534, var9 ^ 1640886334);
            case 211 -> lIIlI(1680977505, var9 ^ -374910312);
            case 212 -> lIIlI(1680977504, var9 ^ 581511601);
            case 213 -> lIIlI(1680977507, var9 ^ 2131305122);
            case 214 -> lIIlI(1680977506, var9 ^ -1016272771);
            case 215 -> lIIlI(1680977509, var9 ^ -1455300110);
            case 216 -> lIIlI(1680977508, var9 ^ 157195673);
            case 217 -> lIIlI(1680977511, var9 ^ 1933673167);
            case 218 -> lIIlI(1680977510, var9 ^ 1173534905);
            case 219 -> lIIlI(1680977513, var9 ^ -1443449646);
            case 220 -> lIIlI(1680977512, var9 ^ 1477805092);
            case 221 -> lIIlI(1680977515, var9 ^ 611440578);
            case 222 -> lIIlI(1680977514, var9 ^ 1646488684);
            case 223 -> lIIlI(1680977517, var9 ^ -1646323662);
            case 224 -> lIIlI(1680977516, var9 ^ 325410972);
            case 225 -> lIIlI(1680977519, var9 ^ 1114963643);
            case 226 -> lIIlI(1680977518, var9 ^ 2027861897);
            case 227 -> lIIlI(1680977809, var9 ^ 1777471322);
            case 228 -> lIIlI(1680977808, var9 ^ -1426533967);
            case 229 -> lIIlI(1680977811, var9 ^ -2075567292);
            case 230 -> lIIlI(1680977810, var9 ^ -2102675759);
            case 231 -> lIIlI(1680977813, var9 ^ -2073630222);
            case 232 -> lIIlI(1680977812, var9 ^ 262684543);
            case 233 -> lIIlI(1680977815, var9 ^ -1099309522);
            case 234 -> lIIlI(1680977814, var9 ^ 2004442675);
            case 235 -> lIIlI(1680977817, var9 ^ 1268459704);
            case 236 -> lIIlI(1680977816, var9 ^ 1826303173);
            case 237 -> lIIlI(1680977819, var9 ^ 2071124607);
            case 238 -> lIIlI(1680977818, var9 ^ 2061578136);
            case 239 -> lIIlI(1680977821, var9 ^ -43247587);
            case 240 -> lIIlI(1680977820, var9 ^ -2072619427);
            case 241 -> lIIlI(1680977823, var9 ^ -1479417486);
            case 242 -> lIIlI(1680977822, var9 ^ 1627683235);
            case 243 -> lIIlI(1680977793, var9 ^ -4491677);
            case 244 -> lIIlI(1680977792, var9 ^ -2028915158);
            case 245 -> lIIlI(1680977795, var9 ^ 2009343994);
            case 246 -> lIIlI(1680977794, var9 ^ 278629354);
            case 247 -> lIIlI(1680977797, var9 ^ -1244464327);
            case 248 -> lIIlI(1680977796, var9 ^ -1740170668);
            case 249 -> lIIlI(1680977799, var9 ^ -1536348720);
            case 250 -> lIIlI(1680977798, var9 ^ -1235083821);
            case 251 -> lIIlI(1680977801, var9 ^ 1363129340);
            case 252 -> lIIlI(1680977800, var9 ^ 478727597);
            case 253 -> lIIlI(1680977803, var9 ^ -1011335400);
            case 254 -> lIIlI(1680977802, var9 ^ 1663729297);
            default -> lIIlI(1680977805, var9 ^ -1629310091);
         };
         int var5 = (var1 & lIIlI(1680977804, var9 ^ 224368332)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIlI(1680977807, var9 ^ -785738911)) >>> lIIlI(1680977806, var9 ^ -1329320210)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIlI(1680977841, var9 ^ 1303110970);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIlI(1680977840, var9 ^ -1413862507);
            }
         }

         IlIl[var2] = new String(var3).intern();
      }

      return IlIl[var2];
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
      // 00: aload 0
      // 01: invokevirtual k74/x/llIlII.IIIIlIl ()Z
      // 04: ifeq 4d
      // 07: aload 1
      // 08: ifnull 4d
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 16: ifnull 4d
      // 19: goto 20
      // 1c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 24: ifnull 4d
      // 27: goto 2e
      // 2a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: aload 1
      // 2f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 32: ifnull 4d
      // 35: goto 3c
      // 38: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3b: athrow
      // 3c: aload 1
      // 3d: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 40: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 43: ifnonnull 52
      // 46: goto 4d
      // 49: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4c: athrow
      // 4d: return
      // 4e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 51: athrow
      // 52: aload 0
      // 53: aload 1
      // 54: invokevirtual k74/x/llIlII.lIl (Lnet/minecraft/class_310;)V
      // 57: aload 1
      // 58: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 5b: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 5e: invokevirtual net/minecraft/class_304.method_1434 ()Z
      // 61: ifne 78
      // 64: aload 1
      // 65: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 68: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 6b: invokestatic k74/x/IIll.IIIIIlI (Lnet/minecraft/class_304;)I
      // 6e: ifle 84
      // 71: goto 78
      // 74: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 77: athrow
      // 78: aload 0
      // 79: aload 1
      // 7a: invokevirtual k74/x/llIlII.lII (Lnet/minecraft/class_310;)V
      // 7d: goto 84
      // 80: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 83: athrow
      // 84: return
   }

   private int lIIl(class_310 param1, class_2338 param2) {
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
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 2
      // 13: ifnonnull 23
      // 16: goto 1d
      // 19: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
      // 1f: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: aload 1
      // 24: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 27: aload 2
      // 28: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 2b: astore 3
      // 2c: aload 3
      // 2d: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 30: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 33: ifne 3c
      // 36: bipush 0
      // 37: ireturn
      // 38: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3b: athrow
      // 3c: aload 3
      // 3d: getstatic net/minecraft/class_4969.field_23153 Lnet/minecraft/class_2758;
      // 40: invokevirtual net/minecraft/class_2680.method_11654 (Lnet/minecraft/class_2769;)Ljava/lang/Comparable;
      // 43: checkcast java/lang/Integer
      // 46: invokevirtual java/lang/Integer.intValue ()I
      // 49: ireturn
   }

   private void lIlI(class_310 param1) {
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
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 2e
      // 19: goto 20
      // 1c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield k74/x/llIlII.IIIIl Lnet/minecraft/class_2338;
      // 24: ifnonnull 37
      // 27: goto 2e
      // 2a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: aload 0
      // 2f: invokevirtual k74/x/llIlII.lI ()V
      // 32: return
      // 33: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 36: athrow
      // 37: aload 1
      // 38: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 3b: aload 0
      // 3c: getfield k74/x/llIlII.IIIIl Lnet/minecraft/class_2338;
      // 3f: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 42: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 45: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 48: ifne b8
      // 4b: aload 0
      // 4c: getfield k74/x/llIlII.IIllI Lnet/minecraft/class_3965;
      // 4f: astore 2
      // 50: aload 0
      // 51: bipush 0
      // 52: putfield k74/x/llIlII.lIIl Z
      // 55: aload 0
      // 56: ldc_w 1680977843
      // 59: ldc_w -109848465
      // 5c: ldc_w 1603333920
      // 5f: ixor
      // 60: invokestatic k74/x/llIlII.lIIlI (II)I
      // 63: putfield k74/x/llIlII.IllI I
      // 66: aload 0
      // 67: aconst_null
      // 68: putfield k74/x/llIlII.IIllI Lnet/minecraft/class_3965;
      // 6b: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 6e: astore 3
      // 6f: aload 2
      // 70: ifnull b0
      // 73: aload 3
      // 74: ifnull b0
      // 77: goto 7e
      // 7a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7d: athrow
      // 7e: aload 3
      // 7f: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 82: ifnull b0
      // 85: goto 8c
      // 88: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8b: athrow
      // 8c: aload 3
      // 8d: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 90: invokevirtual k74/x/lIIIlIlI.IllIll ()Lk74/x/IIllIIIII;
      // 93: ifnull b0
      // 96: goto 9d
      // 99: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 9c: athrow
      // 9d: aload 3
      // 9e: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // a1: invokevirtual k74/x/lIIIlIlI.IllIll ()Lk74/x/IIllIIIII;
      // a4: aload 1
      // a5: aload 2
      // a6: invokevirtual k74/x/IIllIIIII.ll (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)V
      // a9: goto b0
      // ac: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // af: athrow
      // b0: aload 0
      // b1: getstatic k74/x/lIIlIlll.ll Lk74/x/lIIlIlll;
      // b4: invokevirtual k74/x/llIlII.IIl (Lk74/x/lIIlIlll;)V
      // b7: return
      // b8: aload 1
      // b9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // bc: getfield net/minecraft/class_746.field_6012 I
      // bf: aload 0
      // c0: getfield k74/x/llIlII.IllI I
      // c3: if_icmple ef
      // c6: aload 0
      // c7: bipush 0
      // c8: putfield k74/x/llIlII.lIIl Z
      // cb: aload 0
      // cc: ldc_w 1680977842
      // cf: ldc_w -109848465
      // d2: ldc_w 567129832
      // d5: ixor
      // d6: invokestatic k74/x/llIlII.lIIlI (II)I
      // d9: putfield k74/x/llIlII.IllI I
      // dc: aload 0
      // dd: aconst_null
      // de: putfield k74/x/llIlII.IIllI Lnet/minecraft/class_3965;
      // e1: aload 0
      // e2: getstatic k74/x/lIIlIlll.lI Lk74/x/lIIlIlll;
      // e5: invokevirtual k74/x/llIlII.IIl (Lk74/x/lIIlIlll;)V
      // e8: goto ef
      // eb: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // ee: athrow
      // ef: return
   }

   private void lIll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 1
      // 002: invokevirtual k74/x/llIlII.lIIIl (Lnet/minecraft/class_310;)Lnet/minecraft/class_3965;
      // 005: astore 2
      // 006: aload 2
      // 007: ifnonnull 00f
      // 00a: return
      // 00b: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 00e: athrow
      // 00f: aload 0
      // 010: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 013: getstatic k74/x/lIIlIlll.Il Lk74/x/lIIlIlll;
      // 016: if_acmpne 047
      // 019: aload 0
      // 01a: getfield k74/x/llIlII.Il I
      // 01d: ifgt 047
      // 020: goto 027
      // 023: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 026: athrow
      // 027: aload 0
      // 028: aload 1
      // 029: aload 2
      // 02a: aload 0
      // 02b: getfield k74/x/llIlII.llll I
      // 02e: invokevirtual k74/x/llIlII.IIIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;I)Z
      // 031: ifne 040
      // 034: goto 03b
      // 037: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03a: athrow
      // 03b: return
      // 03c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03f: athrow
      // 040: aload 0
      // 041: aload 1
      // 042: aload 2
      // 043: invokevirtual k74/x/llIlII.Ill (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)V
      // 046: return
      // 047: aload 0
      // 048: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 04b: getstatic k74/x/lIIlIlll.Il Lk74/x/lIIlIlll;
      // 04e: if_acmpeq 073
      // 051: aload 0
      // 052: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 055: getstatic k74/x/lIIlIlll.l Lk74/x/lIIlIlll;
      // 058: if_acmpeq 073
      // 05b: goto 062
      // 05e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 061: athrow
      // 062: aload 0
      // 063: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 066: getstatic k74/x/lIIlIlll.III Lk74/x/lIIlIlll;
      // 069: if_acmpne 0ea
      // 06c: goto 073
      // 06f: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 072: athrow
      // 073: aload 0
      // 074: getfield k74/x/llIlII.Il I
      // 077: ifgt 097
      // 07a: goto 081
      // 07d: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 080: athrow
      // 081: aload 1
      // 082: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 085: getfield net/minecraft/class_315.field_1904 Lnet/minecraft/class_304;
      // 088: invokestatic k74/x/IIll.lIIIIlI (Lnet/minecraft/class_304;)V
      // 08b: aload 0
      // 08c: getstatic k74/x/lIIlIlll.lI Lk74/x/lIIlIlll;
      // 08f: invokevirtual k74/x/llIlII.IIl (Lk74/x/lIIlIlll;)V
      // 092: return
      // 093: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 096: athrow
      // 097: aload 0
      // 098: aload 1
      // 099: aload 0
      // 09a: getfield k74/x/llIlII.IIIIl Lnet/minecraft/class_2338;
      // 09d: invokevirtual k74/x/llIlII.lIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)I
      // 0a0: istore 3
      // 0a1: aload 0
      // 0a2: aload 1
      // 0a3: aload 2
      // 0a4: aload 0
      // 0a5: getfield k74/x/llIlII.IIlIl I
      // 0a8: invokevirtual k74/x/llIlII.IIIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;I)Z
      // 0ab: ifne 0b3
      // 0ae: return
      // 0af: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b2: athrow
      // 0b3: aload 0
      // 0b4: bipush 1
      // 0b5: putfield k74/x/llIlII.IlI Z
      // 0b8: aload 0
      // 0b9: bipush 4
      // 0ba: bipush 0
      // 0bb: iload 3
      // 0bc: invokestatic java/lang/Math.max (II)I
      // 0bf: bipush 1
      // 0c0: iadd
      // 0c1: invokestatic java/lang/Math.min (II)I
      // 0c4: putfield k74/x/llIlII.lIll I
      // 0c7: aload 0
      // 0c8: aload 1
      // 0c9: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0cc: getfield net/minecraft/class_746.field_6012 I
      // 0cf: ldc_w 1680977845
      // 0d2: ldc_w -424231269
      // 0d5: ldc_w -617556791
      // 0d8: ixor
      // 0d9: invokestatic k74/x/llIlII.lIIlI (II)I
      // 0dc: iadd
      // 0dd: putfield k74/x/llIlII.lII I
      // 0e0: aload 0
      // 0e1: getstatic k74/x/lIIlIlll.III Lk74/x/lIIlIlll;
      // 0e4: invokevirtual k74/x/llIlII.IIl (Lk74/x/lIIlIlll;)V
      // 0e7: goto 124
      // 0ea: aload 0
      // 0eb: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 0ee: getstatic k74/x/lIIlIlll.lI Lk74/x/lIIlIlll;
      // 0f1: if_acmpeq 105
      // 0f4: aload 0
      // 0f5: getfield k74/x/llIlII.II Lk74/x/lIIlIlll;
      // 0f8: getstatic k74/x/lIIlIlll.IIl Lk74/x/lIIlIlll;
      // 0fb: if_acmpne 124
      // 0fe: goto 105
      // 101: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 104: athrow
      // 105: aload 0
      // 106: aload 1
      // 107: aload 2
      // 108: aload 0
      // 109: getfield k74/x/llIlII.llll I
      // 10c: invokevirtual k74/x/llIlII.IIIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;I)Z
      // 10f: ifne 11e
      // 112: goto 119
      // 115: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 118: athrow
      // 119: return
      // 11a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11d: athrow
      // 11e: aload 0
      // 11f: aload 1
      // 120: aload 2
      // 121: invokevirtual k74/x/llIlII.Ill (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)V
      // 124: return
   }

   private long llII(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();

      try {
         if (var2 == var4) {
            return Math.max(0L, Math.round(var2 * 0.8));
         }
      } catch (MatchException var6) {
         throw lll(var6);
      }

      return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4) * 0.8));
   }

   private void lllI() {
      this.IlIIl = null;
      this.IlIlI = null;
      this.IIlI = lIIlI(1680977844, 886846168 ^ -1191987925);
      this.IIIll = lIIlI(1680977847, 886846168 ^ -829318357);
      this.lIl = 0L;
   }

   private void IIIII(class_310 var1) {
      label16: {
         try {
            if (this.Il > 0) {
               this.IIl(lIIlIlll.l);
               break label16;
            }
         } catch (MatchException var2) {
            throw lll(var2);
         }

         this.IIl(lIIlIlll.lI);
      }

      this.lIll(var1);
   }

   private boolean IIIIl(int param1) {
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
      // 05: ifnull 50
      // 08: aload 2
      // 09: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0c: ifnull 50
      // 0f: goto 16
      // 12: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15: athrow
      // 16: iload 1
      // 17: iflt 50
      // 1a: goto 21
      // 1d: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 20: athrow
      // 21: iload 1
      // 22: ldc_w 1680977846
      // 25: ldc_w 999786077
      // 28: ldc_w 9042954
      // 2b: ixor
      // 2c: invokestatic k74/x/llIlII.lIIlI (II)I
      // 2f: if_icmpge 50
      // 32: goto 39
      // 35: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 38: athrow
      // 39: aload 2
      // 3a: invokestatic k74/x/IIll.lIIlI (Lnet/minecraft/class_310;)I
      // 3d: iload 1
      // 3e: if_icmpeq 50
      // 41: goto 48
      // 44: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 47: athrow
      // 48: bipush 1
      // 49: goto 51
      // 4c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4f: athrow
      // 50: bipush 0
      // 51: ireturn
   }

   private boolean IIIlI(class_310 param1, class_3965 param2, int param3) {
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
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 16: ifnull 4e
      // 19: goto 20
      // 1c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 2
      // 21: ifnull 4e
      // 24: goto 2b
      // 27: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2a: athrow
      // 2b: iload 3
      // 2c: iflt 4e
      // 2f: goto 36
      // 32: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 35: athrow
      // 36: iload 3
      // 37: ldc_w 1680977849
      // 3a: ldc_w 1140972853
      // 3d: ldc_w 1851343811
      // 40: ixor
      // 41: invokestatic k74/x/llIlII.lIIlI (II)I
      // 44: if_icmplt 54
      // 47: goto 4e
      // 4a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4d: athrow
      // 4e: bipush 0
      // 4f: ireturn
      // 50: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 53: athrow
      // 54: aload 1
      // 55: aload 0
      // 56: iload 3
      // 57: aload 1
      // 58: aload 2
      // 59: invokedynamic getAsBoolean (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/llIlII.III (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;)Z, ()Z ]
      // 5e: invokestatic k74/x/IIll.Illl (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // 61: ireturn
   }

   private void IIIll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ifnull 02e
      // 004: aload 1
      // 005: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 008: ifnull 02e
      // 00b: goto 012
      // 00e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 011: athrow
      // 012: aload 1
      // 013: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 016: ifnull 02e
      // 019: goto 020
      // 01c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield k74/x/llIlII.IIIIl Lnet/minecraft/class_2338;
      // 024: ifnonnull 037
      // 027: goto 02e
      // 02a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02d: athrow
      // 02e: aload 0
      // 02f: invokevirtual k74/x/llIlII.lI ()V
      // 032: return
      // 033: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 036: athrow
      // 037: aload 1
      // 038: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 03b: aload 0
      // 03c: getfield k74/x/llIlII.IIIIl Lnet/minecraft/class_2338;
      // 03f: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 042: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 045: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 048: ifne 054
      // 04b: aload 0
      // 04c: invokevirtual k74/x/llIlII.lI ()V
      // 04f: return
      // 050: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 053: athrow
      // 054: aload 0
      // 055: aload 1
      // 056: aload 0
      // 057: getfield k74/x/llIlII.IIIIl Lnet/minecraft/class_2338;
      // 05a: invokevirtual k74/x/llIlII.lIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)I
      // 05d: istore 2
      // 05e: iload 2
      // 05f: aload 0
      // 060: getfield k74/x/llIlII.lIll I
      // 063: if_icmplt 0c9
      // 066: aload 0
      // 067: bipush 0
      // 068: putfield k74/x/llIlII.IlI Z
      // 06b: aload 0
      // 06c: bipush -1
      // 06d: putfield k74/x/llIlII.lIll I
      // 070: aload 0
      // 071: ldc_w 1680977848
      // 074: ldc_w -1110045343
      // 077: ldc_w -1850813324
      // 07a: ixor
      // 07b: invokestatic k74/x/llIlII.lIIlI (II)I
      // 07e: putfield k74/x/llIlII.lII I
      // 081: aload 0
      // 082: bipush 0
      // 083: aload 0
      // 084: getfield k74/x/llIlII.Il I
      // 087: bipush 1
      // 088: isub
      // 089: invokestatic java/lang/Math.max (II)I
      // 08c: putfield k74/x/llIlII.Il I
      // 08f: aload 0
      // 090: aload 0
      // 091: getfield k74/x/llIlII.Il I
      // 094: ifle 0a8
      // 097: goto 09e
      // 09a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 09d: athrow
      // 09e: getstatic k74/x/lIIlIlll.III Lk74/x/lIIlIlll;
      // 0a1: goto 0c5
      // 0a4: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a7: athrow
      // 0a8: aload 0
      // 0a9: getfield k74/x/llIlII.IlIII Lk74/x/lllIIlII;
      // 0ac: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0af: checkcast java/lang/Boolean
      // 0b2: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0b5: ifeq 0c2
      // 0b8: getstatic k74/x/lIIlIlll.ll Lk74/x/lIIlIlll;
      // 0bb: goto 0c5
      // 0be: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c1: athrow
      // 0c2: getstatic k74/x/lIIlIlll.lI Lk74/x/lIIlIlll;
      // 0c5: invokevirtual k74/x/llIlII.IIl (Lk74/x/lIIlIlll;)V
      // 0c8: return
      // 0c9: aload 1
      // 0ca: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0cd: getfield net/minecraft/class_746.field_6012 I
      // 0d0: aload 0
      // 0d1: getfield k74/x/llIlII.lII I
      // 0d4: if_icmple 100
      // 0d7: aload 0
      // 0d8: bipush 0
      // 0d9: putfield k74/x/llIlII.IlI Z
      // 0dc: aload 0
      // 0dd: bipush -1
      // 0de: putfield k74/x/llIlII.lIll I
      // 0e1: aload 0
      // 0e2: ldc_w 1680977851
      // 0e5: ldc_w -1110045343
      // 0e8: ldc_w -2083935568
      // 0eb: ixor
      // 0ec: invokestatic k74/x/llIlII.lIIlI (II)I
      // 0ef: putfield k74/x/llIlII.lII I
      // 0f2: aload 0
      // 0f3: getstatic k74/x/lIIlIlll.III Lk74/x/lIIlIlll;
      // 0f6: invokevirtual k74/x/llIlII.IIl (Lk74/x/lIIlIlll;)V
      // 0f9: goto 100
      // 0fc: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ff: athrow
      // 100: return
   }

   public void IIlII(class_310 param1, class_1268 param2, class_3965 param3, class_1269 param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/llIlII.IIIIlIl ()Z
      // 04: ifeq 12
      // 07: aload 1
      // 08: ifnonnull 17
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: return
      // 13: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: aload 0
      // 18: aload 1
      // 19: invokevirtual k74/x/llIlII.lIl (Lnet/minecraft/class_310;)V
      // 1c: return
   }

   private static boolean IIllI(class_310 var0, class_2338 var1) {
      try {
         if (!var0.field_1687.method_8320(var1).method_27852(class_2246.field_23152)) {
            return true;
         }
      } catch (MatchException var2) {
         throw lll(var2);
      }

      return false;
   }

   @Override
   public String IlIIl() {
      int var14 = -1109655929;
      long var1 = Math.round(this.IlII.IIlI() * 0.8);
      long var3 = Math.round(this.IlII.IlI() * 0.8);

      try {
         if (var1 == var3) {
            String var8 = IlIIllIII.lI(l(lIIlI(1680977850, var14 ^ 1288287672), lIIlI(1680977853, var14 ^ 1551575998)));
            return var1 + var8;
         }
      } catch (MatchException var15) {
         throw lll(var15);
      }

      String var10001 = IlIIllIII.lI(l(lIIlI(1680977852, var14 ^ -694231425), lIIlI(1680977855, var14 ^ 1380166370)));
      String var13 = IlIIllIII.lI(l(lIIlI(1680977854, var14 ^ 1833572681), lIIlI(1680977825, var14 ^ 669188943)));
      String var10 = var10001;
      return var1 + var10 + var3 + var13;
   }

   public llIlII() {
      int var1 = -279788231;
      super(
         IlIIllIII.Ill(l(lIIlI(1680977824, var1 ^ 1270395350), lIIlI(1680977827, var1 ^ 675351551))),
         lllIIlIl.I,
         IlIIllIII.Ill(l(lIIlI(1680977826, var1 ^ -406036994), lIIlI(1680977829, var1 ^ 516167889)))
      );
      this.IIll = this.IllIIll(new IIlIII(IlIIllIII.Ill(l(lIIlI(1680977828, var1 ^ -1776991236), lIIlI(1680977831, var1 ^ 1087575838))), 1.0, 1.0, 4.0, 1.0));
      this.IlII = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(l(lIIlI(1680977830, var1 ^ 886446805), lIIlI(1680977833, var1 ^ -44180678))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(l(lIIlI(1680977832, var1 ^ 86424231), lIIlI(1680977835, var1 ^ 1145103508))))
      );
      this.IIIl = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(l(lIIlI(1680977834, var1 ^ 1094212750), lIIlI(1680977837, var1 ^ 1047299591))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(l(lIIlI(1680977836, var1 ^ 502706567), lIIlI(1680977839, var1 ^ 840621289))))
      );
      this.ll = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(l(lIIlI(1680977838, var1 ^ 12223057), lIIlI(1680977873, var1 ^ 266185225))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(l(lIIlI(1680977872, var1 ^ 1116124318), lIIlI(1680977875, var1 ^ 1477816713))))
      );
      this.lllI = this.IllIIll(new IIlIII(IlIIllIII.Ill(l(lIIlI(1680977874, var1 ^ 738480022), lIIlI(1680977877, var1 ^ -1812589538))), 0.0, 0.0, 9.0, 1.0));
      this.IlIII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(l(lIIlI(1680977876, var1 ^ 1243940187), lIIlI(1680977879, var1 ^ 2089152419))), false));
      this.llIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(l(lIIlI(1680977878, var1 ^ -1529603355), lIIlI(1680977881, var1 ^ 649349803))), true));
      this.II = lIIlIlll.II;
      this.Ill = false;
      this.lI = false;
      this.III = -1;
      this.IIlIl = -1;
      this.llll = -1;
      this.Il = 0;
      this.lIII = 0L;
      this.Illl = 0;
      this.lIll = -1;
      this.lII = lIIlI(1680977880, var1 ^ -119875962);
      this.IllI = lIIlI(1680977883, var1 ^ -286666788);
      this.IIl = new HashMap<>();
      this.lll = lIIlI(1680977882, var1 ^ 1303804594);
      this.IIlI = lIIlI(1680977885, var1 ^ -894522281);
      this.IIIll = lIIlI(1680977884, var1 ^ 660430744);
   }

   private boolean IIlll(class_1799 param1) {
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
      // 05: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 08: ifne 23
      // 0b: goto 12
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getstatic net/minecraft/class_1802.field_8801 Lnet/minecraft/class_1792;
      // 16: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 19: ifne 2b
      // 1c: goto 23
      // 1f: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: bipush 1
      // 24: goto 2c
      // 27: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2a: athrow
      // 2b: bipush 0
      // 2c: ireturn
   }

   public void IllII(class_310 param1, class_1268 param2, class_3965 param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: invokevirtual k74/x/llIlII.IIIIlIl ()Z
      // 004: ifeq 06d
      // 007: aload 1
      // 008: ifnull 06d
      // 00b: goto 012
      // 00e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 011: athrow
      // 012: aload 1
      // 013: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 016: ifnull 06d
      // 019: goto 020
      // 01c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 01f: athrow
      // 020: aload 1
      // 021: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 024: ifnull 06d
      // 027: goto 02e
      // 02a: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02d: athrow
      // 02e: aload 2
      // 02f: ifnull 06d
      // 032: goto 039
      // 035: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 038: athrow
      // 039: aload 3
      // 03a: ifnull 06d
      // 03d: goto 044
      // 040: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 043: athrow
      // 044: aload 3
      // 045: invokevirtual net/minecraft/class_3965.method_17783 ()Lnet/minecraft/class_239$class_240;
      // 048: getstatic net/minecraft/class_239$class_240.field_1332 Lnet/minecraft/class_239$class_240;
      // 04b: if_acmpne 06d
      // 04e: goto 055
      // 051: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 054: athrow
      // 055: aload 1
      // 056: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 059: aload 2
      // 05a: invokevirtual net/minecraft/class_746.method_5998 (Lnet/minecraft/class_1268;)Lnet/minecraft/class_1799;
      // 05d: getstatic net/minecraft/class_1802.field_23141 Lnet/minecraft/class_1792;
      // 060: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 063: ifne 072
      // 066: goto 06d
      // 069: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 06c: athrow
      // 06d: return
      // 06e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 071: athrow
      // 072: aload 3
      // 073: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 076: astore 4
      // 078: aload 1
      // 079: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 07c: aload 4
      // 07e: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 081: astore 5
      // 083: aload 5
      // 085: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 088: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 08b: ifeq 093
      // 08e: return
      // 08f: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 092: athrow
      // 093: aload 5
      // 095: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 098: ifeq 0a4
      // 09b: aload 4
      // 09d: goto 0ad
      // 0a0: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a3: athrow
      // 0a4: aload 4
      // 0a6: aload 3
      // 0a7: invokevirtual net/minecraft/class_3965.method_17780 ()Lnet/minecraft/class_2350;
      // 0aa: invokevirtual net/minecraft/class_2338.method_10093 (Lnet/minecraft/class_2350;)Lnet/minecraft/class_2338;
      // 0ad: astore 6
      // 0af: aload 1
      // 0b0: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0b3: aload 6
      // 0b5: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0b8: invokevirtual net/minecraft/class_2680.method_45474 ()Z
      // 0bb: ifne 0d7
      // 0be: aload 1
      // 0bf: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 0c2: aload 6
      // 0c4: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0c7: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 0ca: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 0cd: ifeq 10f
      // 0d0: goto 0d7
      // 0d3: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d6: athrow
      // 0d7: aload 0
      // 0d8: aload 6
      // 0da: invokevirtual net/minecraft/class_2338.method_10062 ()Lnet/minecraft/class_2338;
      // 0dd: putfield k74/x/llIlII.IIIII Lnet/minecraft/class_2338;
      // 0e0: aload 0
      // 0e1: aload 1
      // 0e2: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0e5: getfield net/minecraft/class_746.field_6012 I
      // 0e8: ldc_w 1680977887
      // 0eb: ldc_w -1398193887
      // 0ee: ldc_w 302376480
      // 0f1: ixor
      // 0f2: invokestatic k74/x/llIlII.lIIlI (II)I
      // 0f5: iadd
      // 0f6: putfield k74/x/llIlII.lll I
      // 0f9: aload 0
      // 0fa: bipush 0
      // 0fb: putfield k74/x/llIlII.Ill Z
      // 0fe: aload 0
      // 0ff: bipush 0
      // 100: putfield k74/x/llIlII.lI Z
      // 103: aload 0
      // 104: aload 1
      // 105: invokevirtual k74/x/llIlII.lIl (Lnet/minecraft/class_310;)V
      // 108: goto 10f
      // 10b: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 10e: athrow
      // 10f: return
   }

   private boolean IllIl(class_310 var1) {
      return lIIIllII.ll(var1);
   }

   private long IlllI(lIIlIlll param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getstatic k74/x/lIIlIlll.II Lk74/x/lIIlIlll;
      // 04: if_acmpeq 15
      // 07: aload 1
      // 08: getstatic k74/x/lIIlIlll.Il Lk74/x/lIIlIlll;
      // 0b: if_acmpne 1b
      // 0e: goto 15
      // 11: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: lconst_0
      // 16: lreturn
      // 17: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual k74/x/lIIlIlll.ordinal ()I
      // 1f: tableswitch 41 0 6 63 63 55 59 55 59 59
      // 48: new java/lang/MatchException
      // 4b: dup
      // 4c: aconst_null
      // 4d: aconst_null
      // 4e: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 51: athrow
      // 52: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 55: athrow
      // 56: aconst_null
      // 57: goto 62
      // 5a: aconst_null
      // 5b: goto 62
      // 5e: aload 0
      // 5f: getfield k74/x/llIlII.IlII Lk74/x/lIlllIl;
      // 62: astore 2
      // 63: aload 1
      // 64: getstatic k74/x/lIIlIlll.l Lk74/x/lIIlIlll;
      // 67: if_acmpne 96
      // 6a: aload 0
      // 6b: aload 0
      // 6c: getfield k74/x/llIlII.IIIl Lk74/x/lIlllIl;
      // 6f: invokevirtual k74/x/llIlII.llII (Lk74/x/lIlllIl;)J
      // 72: aload 0
      // 73: aload 0
      // 74: getfield k74/x/llIlII.IIlIl I
      // 77: invokevirtual k74/x/llIlII.IIIIl (I)Z
      // 7a: ifeq 93
      // 7d: goto 84
      // 80: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 83: athrow
      // 84: aload 0
      // 85: aload 0
      // 86: getfield k74/x/llIlII.IlII Lk74/x/lIlllIl;
      // 89: invokevirtual k74/x/llIlII.llII (Lk74/x/lIlllIl;)J
      // 8c: goto 94
      // 8f: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 92: athrow
      // 93: lconst_0
      // 94: ladd
      // 95: lreturn
      // 96: aload 1
      // 97: getstatic k74/x/lIIlIlll.III Lk74/x/lIIlIlll;
      // 9a: if_acmpne aa
      // 9d: aload 0
      // 9e: aload 0
      // 9f: getfield k74/x/llIlII.IIIl Lk74/x/lIlllIl;
      // a2: invokevirtual k74/x/llIlII.llII (Lk74/x/lIlllIl;)J
      // a5: lreturn
      // a6: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a9: athrow
      // aa: aload 1
      // ab: getstatic k74/x/lIIlIlll.lI Lk74/x/lIIlIlll;
      // ae: if_acmpne dd
      // b1: aload 0
      // b2: aload 0
      // b3: getfield k74/x/llIlII.ll Lk74/x/lIlllIl;
      // b6: invokevirtual k74/x/llIlII.llII (Lk74/x/lIlllIl;)J
      // b9: aload 0
      // ba: aload 0
      // bb: getfield k74/x/llIlII.llll I
      // be: invokevirtual k74/x/llIlII.IIIIl (I)Z
      // c1: ifeq da
      // c4: goto cb
      // c7: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // ca: athrow
      // cb: aload 0
      // cc: aload 0
      // cd: getfield k74/x/llIlII.IlII Lk74/x/lIlllIl;
      // d0: invokevirtual k74/x/llIlII.llII (Lk74/x/lIlllIl;)J
      // d3: goto db
      // d6: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d9: athrow
      // da: lconst_0
      // db: ladd
      // dc: lreturn
      // dd: aload 2
      // de: ifnonnull e9
      // e1: lconst_0
      // e2: goto ee
      // e5: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // e8: athrow
      // e9: aload 0
      // ea: aload 2
      // eb: invokevirtual k74/x/llIlII.llII (Lk74/x/lIlllIl;)J
      // ee: lreturn
   }

   private void Illll(class_310 param1) {
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
      // 05: goto 10
      // 08: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b: athrow
      // 0c: aload 1
      // 0d: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 10: astore 2
      // 11: aload 2
      // 12: aload 0
      // 13: getfield k74/x/llIlII.llII Ljava/lang/Object;
      // 16: if_acmpeq 42
      // 19: aload 0
      // 1a: getfield k74/x/llIlII.IIl Ljava/util/Map;
      // 1d: invokeinterface java/util/Map.clear ()V 1
      // 22: aload 0
      // 23: aconst_null
      // 24: putfield k74/x/llIlII.IIIII Lnet/minecraft/class_2338;
      // 27: aload 0
      // 28: ldc_w 1680977886
      // 2b: ldc_w 488328713
      // 2e: ldc_w 163053484
      // 31: ixor
      // 32: invokestatic k74/x/llIlII.lIIlI (II)I
      // 35: putfield k74/x/llIlII.lll I
      // 38: aload 0
      // 39: aload 2
      // 3a: putfield k74/x/llIlII.llII Ljava/lang/Object;
      // 3d: return
      // 3e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 41: athrow
      // 42: aload 1
      // 43: ifnull 67
      // 46: aload 1
      // 47: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 4a: ifnull 67
      // 4d: goto 54
      // 50: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 53: athrow
      // 54: aload 0
      // 55: getfield k74/x/llIlII.IIl Ljava/util/Map;
      // 58: invokeinterface java/util/Map.isEmpty ()Z 1
      // 5d: ifeq 6c
      // 60: goto 67
      // 63: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 66: athrow
      // 67: return
      // 68: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6b: athrow
      // 6c: aload 0
      // 6d: getfield k74/x/llIlII.IIl Ljava/util/Map;
      // 70: invokeinterface java/util/Map.keySet ()Ljava/util/Set; 1
      // 75: aload 1
      // 76: invokedynamic test (Lnet/minecraft/class_310;)Ljava/util/function/Predicate; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;)Z, k74/x/llIlII.IIllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z, (Lnet/minecraft/class_2338;)Z ]
      // 7b: invokeinterface java/util/Set.removeIf (Ljava/util/function/Predicate;)Z 2
      // 80: pop
      // 81: return
   }

   private void lIIII(class_310 var1) {
      int var2 = System.identityHashCode(var1.field_1724);

      try {
         if (this.Illl == var2) {
            return;
         }
      } catch (MatchException var3) {
         throw lll(var3);
      }

      this.Illl = var2;
      this.llI();
   }

   @Override
   public String IllIlI() {
      return super.IllIlI();
   }

   private class_3965 lIIIl(class_310 param1) {
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
      // 0e: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aconst_null
      // 13: areturn
      // 14: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: aload 0
      // 19: aload 1
      // 1a: invokevirtual k74/x/llIlII.II (Lnet/minecraft/class_310;)Lnet/minecraft/class_3965;
      // 1d: astore 2
      // 1e: aload 2
      // 1f: ifnull 6b
      // 22: aload 0
      // 23: getfield k74/x/llIlII.IIIIl Lnet/minecraft/class_2338;
      // 26: ifnull 6b
      // 29: goto 30
      // 2c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2f: athrow
      // 30: aload 0
      // 31: getfield k74/x/llIlII.IIIIl Lnet/minecraft/class_2338;
      // 34: aload 2
      // 35: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 38: invokevirtual net/minecraft/class_2338.equals (Ljava/lang/Object;)Z
      // 3b: ifeq 6b
      // 3e: goto 45
      // 41: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 44: athrow
      // 45: aload 1
      // 46: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 49: aload 2
      // 4a: invokevirtual net/minecraft/class_3965.method_17777 ()Lnet/minecraft/class_2338;
      // 4d: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 50: getstatic net/minecraft/class_2246.field_23152 Lnet/minecraft/class_2248;
      // 53: invokevirtual net/minecraft/class_2680.method_27852 (Lnet/minecraft/class_2248;)Z
      // 56: ifeq 6b
      // 59: goto 60
      // 5c: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5f: athrow
      // 60: aload 0
      // 61: aload 2
      // 62: putfield k74/x/llIlII.lIlI Lnet/minecraft/class_3965;
      // 65: aload 2
      // 66: areturn
      // 67: invokestatic k74/x/llIlII.lll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6a: athrow
      // 6b: aconst_null
      // 6c: areturn
   }
}
