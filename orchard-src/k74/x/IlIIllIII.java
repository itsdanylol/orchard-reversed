package k74.x;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.function.IntConsumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IlIIllIII {
   private static final Set<lIllIll> I;
   private static int[] l;
   private static volatile boolean II;
   private static final SecureRandom Il;
   private static final int[] ll;
   private static final byte[] lI;

   private static boolean I(byte var0) {
      return (var0 & Illl(-1748809086, 1759081305 ^ 1367833800)) == Illl(-1748809085, 1759081305 ^ -589425694);
   }

   public static IIIlIlIl l(Object var0) {
      if (var0 instanceof IIIlIlIl var6) {
         return var6;
      } else {
         try {
            if (var0 == null) {
               return IIIlIlIl.II;
            }
         } catch (Exception var5) {
            throw IIl(var5);
         }

         String var1 = var0.toString();

         try {
            if (var1.isEmpty()) {
               return IIIlIlIl.II;
            }
         } catch (Exception var3) {
            throw IIl(var3);
         }

         if (II(var1)) {
            try {
               return Ill(var1);
            } catch (Exception var4) {
            }
         }

         return IIIlIlIl.Il(var1);
      }
   }

   public static boolean II(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc -233649833
      // 02: istore 6
      // 04: aload 0
      // 05: ifnull 16
      // 08: aload 0
      // 09: invokevirtual java/lang/String.isEmpty ()Z
      // 0c: ifeq 1c
      // 0f: goto 16
      // 12: invokestatic k74/x/IlIIllIII.IIl (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic k74/x/IlIIllIII.IIl (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1b: athrow
      // 1c: invokestatic java/util/Base64.getDecoder ()Ljava/util/Base64$Decoder;
      // 1f: aload 0
      // 20: invokevirtual java/util/Base64$Decoder.decode (Ljava/lang/String;)[B
      // 23: astore 1
      // 24: aload 1
      // 25: arraylength
      // 26: ifne 2b
      // 29: bipush 0
      // 2a: ireturn
      // 2b: bipush 0
      // 2c: istore 2
      // 2d: iload 2
      // 2e: aload 1
      // 2f: arraylength
      // 30: if_icmpge 54
      // 33: aload 1
      // 34: iload 2
      // 35: dup2
      // 36: baload
      // 37: getstatic k74/x/IlIIllIII.lI [B
      // 3a: iload 2
      // 3b: ldc -1748809088
      // 3d: iload 6
      // 3f: ldc -791664407
      // 41: ixor
      // 42: invokestatic k74/x/IlIIllIII.Illl (II)I
      // 45: iand
      // 46: baload
      // 47: ixor
      // 48: i2b
      // 49: bastore
      // 4a: iinc 2 1
      // 4d: goto 2d
      // 50: invokestatic k74/x/IlIIllIII.IIl (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 53: athrow
      // 54: getstatic java/nio/charset/StandardCharsets.UTF_8 Ljava/nio/charset/Charset;
      // 57: invokevirtual java/nio/charset/Charset.newDecoder ()Ljava/nio/charset/CharsetDecoder;
      // 5a: getstatic java/nio/charset/CodingErrorAction.REPORT Ljava/nio/charset/CodingErrorAction;
      // 5d: invokevirtual java/nio/charset/CharsetDecoder.onMalformedInput (Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;
      // 60: getstatic java/nio/charset/CodingErrorAction.REPORT Ljava/nio/charset/CodingErrorAction;
      // 63: invokevirtual java/nio/charset/CharsetDecoder.onUnmappableCharacter (Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;
      // 66: astore 2
      // 67: aload 2
      // 68: aload 1
      // 69: invokestatic java/nio/ByteBuffer.wrap ([B)Ljava/nio/ByteBuffer;
      // 6c: invokevirtual java/nio/charset/CharsetDecoder.decode (Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;
      // 6f: astore 3
      // 70: aload 3
      // 71: invokevirtual java/nio/CharBuffer.length ()I
      // 74: ifne 79
      // 77: bipush 0
      // 78: ireturn
      // 79: bipush 0
      // 7a: istore 4
      // 7c: iload 4
      // 7e: aload 3
      // 7f: invokevirtual java/nio/CharBuffer.length ()I
      // 82: if_icmpge f5
      // 85: aload 3
      // 86: iload 4
      // 88: invokevirtual java/nio/CharBuffer.charAt (I)C
      // 8b: istore 5
      // 8d: iload 5
      // 8f: ldc -1748809087
      // 91: iload 6
      // 93: ldc -2006543897
      // 95: ixor
      // 96: invokestatic k74/x/IlIIllIII.Illl (II)I
      // 99: if_icmpeq ed
      // 9c: iload 5
      // 9e: invokestatic java/lang/Character.isISOControl (C)Z
      // a1: ifeq ef
      // a4: goto ab
      // a7: invokestatic k74/x/IlIIllIII.IIl (Ljava/lang/Exception;)Ljava/lang/Exception;
      // aa: athrow
      // ab: iload 5
      // ad: ldc -1748809082
      // af: iload 6
      // b1: ldc -1199189859
      // b3: ixor
      // b4: invokestatic k74/x/IlIIllIII.Illl (II)I
      // b7: if_icmpeq ef
      // ba: goto c1
      // bd: invokestatic k74/x/IlIIllIII.IIl (Ljava/lang/Exception;)Ljava/lang/Exception;
      // c0: athrow
      // c1: iload 5
      // c3: ldc -1748809081
      // c5: iload 6
      // c7: ldc 1022754573
      // c9: ixor
      // ca: invokestatic k74/x/IlIIllIII.Illl (II)I
      // cd: if_icmpeq ef
      // d0: goto d7
      // d3: invokestatic k74/x/IlIIllIII.IIl (Ljava/lang/Exception;)Ljava/lang/Exception;
      // d6: athrow
      // d7: iload 5
      // d9: ldc -1748809084
      // db: iload 6
      // dd: ldc 1603795370
      // df: ixor
      // e0: invokestatic k74/x/IlIIllIII.Illl (II)I
      // e3: if_icmpeq ef
      // e6: goto ed
      // e9: invokestatic k74/x/IlIIllIII.IIl (Ljava/lang/Exception;)Ljava/lang/Exception;
      // ec: athrow
      // ed: bipush 0
      // ee: ireturn
      // ef: iinc 4 1
      // f2: goto 7c
      // f5: bipush 1
      // f6: ireturn
      // f7: astore 1
      // f8: bipush 0
      // f9: ireturn
   }

   private static IIIlIlIl Il(String var0) {
      byte[] var1 = Base64.getDecoder().decode(var0);

      IIIlIlIl var6;
      try {
         for (int var2 = 0; var2 < var1.length; var2++) {
            var1[var2] ^= lI[var2 & Illl(-1748809083, 803885441 ^ -364491301)];
         }

         var6 = IIIlIlIl.lIl(var1);
      } finally {
         Arrays.fill(var1, (byte)0);
      }

      return var6;
   }

   private IlIIllIII() {
   }

   public static String lI(String var0) {
      return !II && var0 != null && !var0.isEmpty() ? Ill(var0).llIl() : "";
   }

   private static int ll(byte[] var0, int var1, int var2) {
      int var3 = 0;

      for (int var4 = var1; var4 < var2; var3++) {
         var4 += IIlI(var0, var4, var2);
      }

      return var3;
   }

   private static void III(byte[] var0, int var1, int var2, IntConsumer var3) {
      int var8 = -131244669;
      int var4 = var1;

      while (var4 < var2) {
         int var5 = IIlI(var0, var4, var2);
         int var6 = var0[var4] & Illl(-1748809078, var8 ^ -624472506);
         int var7;
         if (var5 == 1) {
            var7 = var6 < Illl(-1748809077, var8 ^ -1225486322) ? var6 : Illl(-1748809080, var8 ^ -79471999);
         } else if (var5 == 2) {
            var7 = (var6 & Illl(-1748809079, var8 ^ -2080033730)) << Illl(-1748809074, var8 ^ -1531167677)
               | var0[var4 + 1] & Illl(-1748809073, var8 ^ -385480637);
         } else if (var5 == 3) {
            var7 = (var6 & Illl(-1748809076, var8 ^ -1477520588)) << Illl(-1748809075, var8 ^ 521398771)
               | (var0[var4 + 1] & Illl(-1748809070, var8 ^ 123259218)) << Illl(-1748809069, var8 ^ -461689372)
               | var0[var4 + 2] & Illl(-1748809072, var8 ^ 1081715888);
         } else {
            var7 = (var6 & Illl(-1748809071, var8 ^ -101120247)) << Illl(-1748809066, var8 ^ 233713722)
               | (var0[var4 + 1] & Illl(-1748809065, var8 ^ 68693915)) << Illl(-1748809068, var8 ^ 2037997102)
               | (var0[var4 + 2] & Illl(-1748809067, var8 ^ -625994479)) << Illl(-1748809062, var8 ^ 1276706816)
               | var0[var4 + 3] & Illl(-1748809061, var8 ^ -1353500981);
         }

         var3.accept(var7);
         var4 += var5;
      }
   }

   private static Exception IIl(Exception var0) {
      return var0;
   }

   private static byte[] IlI() {
      int var0 = Illl(-1748809064, 1782551636 ^ 400069029);
      byte[] var1 = new byte[Illl(-1748809063, 1782551636 ^ -403536163)];

      for (int var2 = 0; var2 < var1.length; var2++) {
         var0 = var0 * Illl(-1748809058, 1782551636 ^ 1849311415) + 1;
         var1[var2] = (byte)(var0 >> Illl(-1748809057, 1782551636 ^ 241292660));
      }

      return var1;
   }

   public static IIIlIlIl Ill(String var0) {
      return !II && var0 != null && !var0.isEmpty() ? Il(var0) : IIIlIlIl.II;
   }

   static {
      int var2 = -1900486334;
      byte[] var0 = "ßØãôR\u0081\u008f\u001fÄD\f\u008a\u009cñµ\u008b¬\u0011ôÍ(aÛWK\u0003Ý÷#*ñkÄlÿë¨_\"!åëê0\u009a®\u0084°º\u0017\u008cË÷\u00ad¸+¹Ec\u008f\u0001¸Yv\u0019óy'úÐ\u009dq^Ò\u001cÇçR·\u0097\u0013E\u0080¦\u001a³\u009fëgÒî²Ä\u001b¥cR²°\u009c±ø\u0086·>¥´ókKÿ§\u001c'\u0092O\u0082Ø¬0¯®ýþH/¸ FÃ*7+<n2EX\u0089\u0093¨Æ\u009c\u007f\u007f\u0015\u0081%\u000bGàÂ \u001d\u0097\u0095\u001eë«a²þ?ÍkÂÙß50<i\u0017|jöòôûªÊ¼¦\u0012±v\u0016/\u009bcûV"
         .getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      ll = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         ll[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);

      int[] var10000 = new int[4];
      lI = IlI();
      Il = new SecureRandom();
      I = Collections.newSetFromMap(new WeakHashMap<>());
      lll(var10000);
      II = false;
   }

   public static IIIlIlIl lII(String var0) {
      return IIIlIlIl.Il(var0);
   }

   private static int lIl(byte[] var0, int var1) {
      int var2 = 0;

      for (int var3 = var1; var2 < var0.length && var3 > 0; var3--) {
         var2 += IIlI(var0, var2, var0.length);
      }

      return var2;
   }

   private static int Illl(int var0, int var1) {
      int var2 = ll[var0 ^ -1748809086] ^ var1 ^ var0;
      var2 ^= 57449;
      var2 ^= 7676;
      var2 += 32438;
      var2 ^= 5022;
      var2 -= 48519;
      var2 ^= 39596;
      var2 += 61758;
      var2 += 13440;
      return var2 + 58277;
   }

   public static void llI() {
      String[] var10000 = IIllllIl.IIIIl();
      II = true;
      String[] var0 = var10000;
      synchronized (I) {
         for (lIllIll var3 : I) {
            if (var3 != null) {
               var3.I();
            }

            if (var0 != null) {
               break;
            }
         }

         I.clear();
      }

      Arrays.fill(lI, (byte)0);
   }

   public static void lll(int[] var0) {
      l = var0;
   }

   private static boolean IIII(int var0, int var1) {
      if (var0 == var1) {
         return true;
      } else {
         int var2 = Character.toUpperCase(var0);
         int var3 = Character.toUpperCase(var1);
         return var2 == var3 || Character.toLowerCase(var2) == Character.toLowerCase(var3);
      }
   }

   public static int[] IIIl() {
      return l;
   }

   private static int IIlI(byte[] var0, int var1, int var2) {
      int var5 = -96463557;
      int var3 = var0[var1] & Illl(-1748809060, var5 ^ -1285028611);
      if (var3 < Illl(-1748809059, var5 ^ 1424573089)) {
         return 1;
      } else if (var3 >= Illl(-1748809054, var5 ^ 1510331223) && var3 <= Illl(-1748809053, var5 ^ 939169646) && var1 + 1 < var2 && I(var0[var1 + 1])) {
         return 2;
      } else {
         if (var3 >= Illl(-1748809056, var5 ^ 1503555791)
            && var3 <= Illl(-1748809055, var5 ^ -1275042383)
            && var1 + 2 < var2
            && I(var0[var1 + 1])
            && I(var0[var1 + 2])) {
            int var4 = var0[var1 + 1] & Illl(-1748809050, var5 ^ 1674803228);
            if ((var3 != Illl(-1748809049, var5 ^ 394336665) || var4 >= Illl(-1748809052, var5 ^ 1021013261))
               && (var3 != Illl(-1748809051, var5 ^ 36524629) || var4 <= Illl(-1748809046, var5 ^ -1372011176))) {
               return 3;
            }
         }

         if (var3 >= Illl(-1748809045, var5 ^ 1996759064)
            && var3 <= Illl(-1748809048, var5 ^ 704038281)
            && var1 + 3 < var2
            && I(var0[var1 + 1])
            && I(var0[var1 + 2])
            && I(var0[var1 + 3])) {
            int var6 = var0[var1 + 1] & Illl(-1748809047, var5 ^ 196776896);
            if ((var3 != Illl(-1748809042, var5 ^ -298712472) || var6 >= Illl(-1748809041, var5 ^ -696623951))
               && (var3 != Illl(-1748809044, var5 ^ -1380913205) || var6 <= Illl(-1748809043, var5 ^ -2019229196))) {
               return 4;
            }
         }

         return 1;
      }
   }

   public static long IIll(String var0) {
      String[] var10000 = IIllllIl.IIIIl();
      long var2 = -3750763034362895579L;
      String[] var1 = var10000;
      if (var0 == null) {
         return var2;
      } else {
         int var4 = 0;

         while (var4 < var0.length()) {
            int var5 = var0.codePointAt(var4);
            var2 ^= Character.toLowerCase(var5);
            var2 *= 1099511628211L;
            var4 += Character.charCount(var5);
            if (var1 != null) {
               break;
            }
         }

         return var2;
      }
   }

   private static int IlII(CharSequence var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.length(); var1++) {
         int var3 = Character.codePointAt(var0, var2);
         var2 += Character.charCount(var3);
      }

      return var1;
   }

   public static long IlIl(String var0) {
      String[] var10000 = IIllllIl.IIIIl();
      long var2 = -3750763034362895579L;
      String[] var1 = var10000;
      if (var0 == null) {
         return var2;
      } else {
         int var4 = 0;

         while (var4 < var0.length()) {
            int var5 = var0.codePointAt(var4);
            var2 ^= var5;
            var2 *= 1099511628211L;
            var4 += Character.charCount(var5);
            if (var1 != null) {
               break;
            }
         }

         return var2;
      }
   }

   public static boolean IllI() {
      return II;
   }
}
