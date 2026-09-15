package k74.x;

import com.sun.jna.Library;
import com.sun.jna.Native;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
interface IIIIIlIlI extends Library {
   Object[] Ill;
   int I = 8;
   IIIIIlIlI l;
   int II = 4;
   int[] IIl;
   String[] IlI;
   int Il = 2;
   int lI = 16;
   String ll;
   String[] III;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var12 = -653950841;
      String var2 = "ፈ眨ᅭ鸾ᖏ┧ꏧ\uf0b5";
      char[] var3 = "\b".toCharArray();
      byte var8 = -1;
      short var1 = 1787;
      String[] var4 = new String[var3.length];

      while (true) {
         int var5 = 0;
         char var6 = 0;
         char var7 = '\u0000';
         if (var8 == 0) {
            IlI = var4;
            Ill = new Object[var4.length];
            IIl = new int[12];
            int var14 = 0;
            int var10001 = 0;
            byte[] var10002 = "÷ÀöyáW\u009b¡H\u009f\u0088$8o¬O%¹Ê¡\u001aY\u0080\u0010Ù\u0011©ó9ºØ\u0096ü\u001b¼êø\u0012h,\u0088EQÉ\u0085líK"
               .getBytes("ISO-8859-1");

            int var37;
            do {
               IIl[var14] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 44348195;
               var14 += 1;
               var37 = var10001 + 4;
               var10001 += 4;
            } while (var37 < var10002.length);

            var14 = Il(-197404648, var12 ^ -665186127);
            char[] var38 = lI(13860, 1165449735, (byte)-83).toCharArray();
            int var49 = var38.length;
            int var0 = 0;
            var37 = var14;
            char[] var28 = var38;
            var10001 = var49;
            char[] var58;
            int var65;
            if (var49 <= 1) {
               var58 = var38;
               var49 = var14;
               var65 = var0;
            } else {
               var37 = var14;
               var10001 = var49;
               if (var49 <= var0) {
                  String var42 = new String(var38).intern();
                  byte var22 = -1;
                  ll = var42;
                  III = new String[1];
                  l();
                  l = (IIIIIlIlI)Native.load(IlIIllIII.lI(III[0]), IIIIIlIlI.class);
                  return;
               }

               var58 = var38;
               var49 = var14;
               var65 = var0;
            }

            while (true) {
               var58[var65] = (char)(var58[var65] ^ var49 ^ switch (var0 % Il(-197404647, var12 ^ -825400599)) {
                  case 0 -> Il(-197404646, var12 ^ 1728409291);
                  case 1 -> Il(-197404645, var12 ^ 401951410);
                  case 2 -> Il(-197404644, var12 ^ 170077214);
                  case 3 -> Il(-197404643, var12 ^ 901998290);
                  case 4 -> Il(-197404642, var12 ^ -158642407);
                  case 5 -> Il(-197404641, var12 ^ 371204488);
                  default -> Il(-197404656, var12 ^ -746497473);
               });
               var0++;
               if (var37 == 0) {
                  var65 = var37;
                  var58 = var28;
                  var49 = var37;
               } else {
                  if (var10001 <= var0) {
                     String var41 = new String(var28).intern();
                     byte var21 = -1;
                     ll = var41;
                     III = new String[1];
                     l();
                     l = (IIIIIlIlI)Native.load(IlIIllIII.lI(III[0]), IIIIIlIlI.class);
                     return;
                  }

                  var58 = var28;
                  var49 = var37;
                  var65 = var0;
               }
            }
         }

         do {
            var7 = var3[var5];
            char[] var9 = var2.substring(var6, var6 + var7).toCharArray();
            int var10 = 0;

            do {
               short var11 = switch (var10 % 5) {
                  default -> 14;
                  case 1 -> 176;
                  case 2 -> 105;
                  case 3 -> 225;
                  case 4 -> 135;
               };
               var9[var10] = (char)(var9[var10] ^ var11 ^ var1);
            } while (++var10 < var9.length);

            var4[var5] = new String(var9).intern();
            var6 += var7;
         } while (++var5 < var3.length);

         var8 = 0;
      }
   }

   private static String lI(char var0, int var1, byte var2) {
      int var7 = var1 ^ 1165449735;
      char[] var6 = IlI[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])Ill[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         Ill[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 39152;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ switch (var5 % 18) {
            default -> 116;
            case 1 -> 50;
            case 2 -> 134;
            case 3 -> 15;
            case 4 -> 20;
            case 5 -> 92;
            case 6 -> 104;
            case 7 -> 66;
            case 8 -> 56;
            case 9 -> 38;
            case 10 -> 30;
            case 11 -> 27;
            case 12 -> 80;
            case 13 -> 3;
            case 14 -> 1;
            case 15 -> 185;
            case 16 -> 190;
            case 17 -> 84;
         } ^ var5 ^ 4177 ^ var0 ^ var4 ^ var1 ^ var2);
      }

      return new String(var6).intern();
   }

   static int Il(int var0, int var1) {
      int var2 = IIl[var0 ^ -197404648] ^ var1 ^ var0;
      var2 ^= 56755;
      var2 -= 33659;
      var2 -= 12172;
      var2 ^= 572;
      var2 ^= 62003;
      var2 ^= 61709;
      var2 ^= 15855;
      var2 += 35848;
      return var2 - 44243;
   }

   void I(int var1, int var2, int var3, int var4, int var5);

   static void l() {
      III[0] = II(ll.toCharArray(), 98772L, Il(-197404655, -2043853927 ^ -816754748));
   }

   static String II(char[] var0, long var1, int var3) {
      int var4 = Il(-197404654, -1690983033 ^ -726053234) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & Il(-197404653, -1690983033 ^ -389665183);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
