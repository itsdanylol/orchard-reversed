package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lIIIlllI {
   I,
   l;

   private static final Object[] III;
   private static final String[] ll;
   private static final int[] lI;
   private static final lIIIlllI[] II;
   private final IIIlIlIl Il;

   @Override
   public String toString() {
      return this.Il.llIl();
   }

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ 1065031448] ^ var1 ^ var0;
      var2 -= 25667;
      var2 -= 43081;
      var2 ^= 38569;
      var2 ^= 13359;
      var2 += 37119;
      var2 -= 39257;
      var2 += 41772;
      var2 += 56437;
      return var2 ^ 41053;
   }

   private static lIIIlllI[] I() {
      return new lIIIlllI[]{l, I};
   }

   private lIIIlllI(IIIlIlIl var3) {
      this.Il = var3;
   }

   private static String II(int var0, int var1) {
      int var3 = var0 ^ -1946270260;
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])III[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         III[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -444422954;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 137;
            case 1 -> 165;
            case 2 -> 208;
            case 3 -> 32;
            case 4 -> 233;
            case 5 -> 131;
            case 6 -> 96;
            case 7 -> 254;
            case 8 -> 208;
            case 9 -> 230;
            case 10 -> 68;
            case 11 -> 30;
            case 12 -> 82;
            case 13 -> 196;
            case 14 -> 169;
            case 15 -> 242;
            case 16 -> 138;
            case 17 -> 5;
            case 18 -> 138;
            case 19 -> 34;
            case 20 -> 26;
            case 21 -> 221;
            case 22 -> 221;
            case 23 -> 97;
            case 24 -> 96;
            case 25 -> 2;
            case 26 -> 209;
            case 27 -> 220;
            case 28 -> 38;
            case 29 -> 201;
            case 30 -> 24;
            case 31 -> 24;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = 1202597791;
      char[] var9 = "\u1addᫀ".toCharArray();
      String var8 = "簥糂籨簉糂籴籭籲糂糨糙籾粨粱糡簕糃粽糞米糕\ue64d\ue682\ue653\ue640\ue6bc\ue67c\ue644\ue618";
      short var7 = 6856;
      int var10000 = var9.length;
      byte var14 = -1;
      String[] var10 = new String[var10000];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            ll = var10;
            III = new Object[var10.length];
            int var23 = 0;
            int var10001 = 0;
            lI = new int[11];
            byte[] var10002 = "Ißg\u0011%HÅ!ÔgÐñ4Â+\u001eíí³5´Boó \u0081\u000bn¿VK\u0004|Äsþ,\u0015\u0018×)3çÇ".getBytes("ISO-8859-1");

            int var56;
            do {
               lI[var23] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -501740778;
               var23 += 1;
               var56 = var10001 + 4;
               var10001 += 4;
            } while (var56 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = II(-1946270260, var18 ^ -1808321139)).length();
            int var2 = l(1065031448, var18 ^ -753742700);
            int var20 = -1;

            label102:
            while (true) {
               var23 = l(1065031449, var18 ^ -1081774445);
               String var28 = var3.substring(++var20, var20 + var2);
               byte var40 = -1;

               while (true) {
                  label97: {
                     char[] var58 = var28.toCharArray();
                     int var70 = var58.length;
                     int var6 = 0;
                     var56 = var23;
                     var45 = var58;
                     var10001 = var70;
                     char[] var82;
                     int var89;
                     if (var70 <= 1) {
                        var82 = var58;
                        var70 = var23;
                        var89 = var6;
                     } else {
                        var56 = var23;
                        var10001 = var70;
                        if (var70 <= var6) {
                           break label97;
                        }

                        var82 = var58;
                        var70 = var23;
                        var89 = var6;
                     }

                     while (true) {
                        var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % l(1065031451, var18 ^ -1374715731)) {
                           case 0 -> l(1065031452, var18 ^ 1998592176);
                           case 1 -> l(1065031453, var18 ^ 781173836);
                           case 2 -> l(1065031454, var18 ^ 978100445);
                           case 3 -> l(1065031455, var18 ^ 630976107);
                           case 4 -> l(1065031440, var18 ^ -435562382);
                           case 5 -> l(1065031441, var18 ^ -1227309674);
                           default -> l(1065031442, var18 ^ -1275182404);
                        });
                        var6++;
                        if (var56 == 0) {
                           var89 = var56;
                           var82 = var45;
                           var70 = var56;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var82 = var45;
                           var70 = var56;
                           var89 = var6;
                        }
                     }
                  }

                  String var63 = new String(var45).intern();
                  switch (var40) {
                     case 0:
                        var0[var4++] = var63;
                        if ((var20 += var2) >= var5) {
                           l = new lIIIlllI(IlIIllIII.Ill(var0[2]));
                           I = new lIIIlllI(IlIIllIII.Ill(var0[1]));
                           II = I();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var63;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label102;
                        }

                        var5 = (var3 = II(-1946270259, var18 ^ 235151805)).length();
                        var2 = 4;
                        var20 = -1;
                  }

                  var23 = l(1065031450, var18 ^ 1319794079);
                  var28 = var3.substring(++var20, var20 + var2);
                  var40 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 133;
                  case 1 -> 118;
                  case 2 -> 172;
                  case 3 -> 104;
                  case 4 -> 19;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }
}
