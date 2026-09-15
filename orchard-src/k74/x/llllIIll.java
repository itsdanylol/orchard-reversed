package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum llllIIll {
   I,
   l,
   Il,
   ll;
   private static final Object[] IlI;
   private final IIIlIlIl II;
   private static final String[] IIl;
   private static final int[] III;
   private static final llllIIll[] lI;

   private static llllIIll[] I() {
      return new llllIIll[]{l, Il, ll, I};
   }

   private static int l(int var0, int var1) {
      int var2 = III[var0 ^ 1508199446] ^ var1 ^ var0;
      var2 ^= 20376;
      var2 ^= 1141;
      var2 += 758;
      var2 -= 10135;
      var2 -= 39074;
      var2 += 2032;
      var2 ^= 37179;
      return var2 + 40459;
   }

   private static String II(int var0, int var1) {
      int var3 = var0 ^ -1820675718;
      char[] var4 = IIl[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IlI[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IlI[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -194634879;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 40;
            case 1 -> 63;
            case 2 -> 102;
            case 3 -> 50;
            case 4 -> 85;
            case 5 -> 151;
            case 6 -> 46;
            case 7 -> 177;
            case 8 -> 145;
            case 9 -> 41;
            case 10 -> 22;
            case 11 -> 12;
            case 12 -> 224;
            case 13 -> 8;
            case 14 -> 212;
            case 15 -> 86;
            case 16 -> 61;
            case 17 -> 80;
            case 18 -> 237;
            case 19 -> 128;
            case 20 -> 242;
            case 21 -> 179;
            case 22 -> 135;
            case 23 -> 9;
            case 24 -> 206;
            case 25 -> 113;
            case 26 -> 46;
            case 27 -> 104;
            case 28 -> 210;
            case 29 -> 78;
            case 30 -> 216;
            case 31 -> 55;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private llllIIll(IIIlIlIl var3) {
      this.II = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 1353912857;
      int var17 = 0;
      int var16 = 0;
      int var14 = "3\u2072⢀↲䢄ₒꢘ⋚䢓⚺⢇⁂ꢊ⟚⢌◲袈〉䢃☊ꢖ┊䢕☊䢃⚂袆ℂ좀⓲䢄❲\ue88f⁚袃⇢梅\u2062\ue899⍢⢔⚪䢈⅂袌◺梃❂ꢎ⋒ꢈ⚚\u000e䪄鄨䮤儬䫬ᄳ䬼넸䲜焮䤼\uf123䴄\uf121".length();
      String var13 = "3\u2072⢀↲䢄ₒꢘ⋚䢓⚺⢇⁂ꢊ⟚⢌◲袈〉䢃☊ꢖ┊䢕☊䢃⚂袆ℂ좀⓲䢄❲\ue88f⁚袃⇢梅\u2062\ue899⍢⢔⚪䢈⅂袌◺梃❂ꢎ⋒ꢈ⚚\u000e䪄鄨䮤儬䫬ᄳ䬼넸䲜焮䤼\uf123䴄\uf121";
      short var18 = 9619;
      String[] var15 = new String[2];

      do {
         char var19 = var13.charAt(var17);
         String var10000 = var13.substring(var17 + 1, var17 + 1 + var19);
         int var21 = 0;
         char[] var20 = var10000.toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << '\r') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> '\r') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIl = var15;
      IlI = new Object[var15.length];
      int var9 = -870592572;
      byte[] var7 = "·\u0094\u008f»Ð9\u0081¬\u0085§rvãe¹\u0083:¿q\u008c\u0000¿=j\u0003\u0084AFá\u009c\u007f\u008b\tÊ\u0083ø\u0005¿}ÁÜß\u0000nýýÈRÚxà\u0019\u0006\u009aýÒ"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      III = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         III[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[l(1508199446, var23 ^ 1926886276)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(-1820675718, var23 ^ -1496959760)).length();
      int var2 = l(1508199447, var23 ^ 359988626);
      int var25 = -1;

      label90:
      while (true) {
         int var27 = l(1508199444, var23 ^ 1089077286);
         String var10001 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label85: {
               char[] var43 = var10001.toCharArray();
               int var10004 = var43.length;
               int var6 = 0;
               int var46 = var27;
               var39 = var43;
               int var33 = var10004;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var43;
                  var10004 = var27;
                  var10006 = var6;
               } else {
                  var46 = var27;
                  var33 = var10004;
                  if (var10004 <= var6) {
                     break label85;
                  }

                  var55 = var43;
                  var10004 = var27;
                  var10006 = var6;
               }

               while (true) {
                  var55[var10006] = (char)(var55[var10006] ^ var10004 ^ switch (var6 % l(1508199442, var23 ^ -913996)) {
                     case 0 -> l(1508199443, var23 ^ -973975614);
                     case 1 -> l(1508199440, var23 ^ -959892511);
                     case 2 -> l(1508199441, var23 ^ 617680143);
                     case 3 -> l(1508199454, var23 ^ -863505988);
                     case 4 -> l(1508199455, var23 ^ -1057878185);
                     case 5 -> l(1508199452, var23 ^ 429028065);
                     default -> l(1508199453, var23 ^ 951106087);
                  });
                  var6++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var55 = var39;
                     var10004 = var46;
                  } else {
                     if (var33 <= var6) {
                        break;
                     }

                     var55 = var39;
                     var10004 = var46;
                     var10006 = var6;
                  }
               }
            }

            String var48 = new String(var39).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var48;
                  if ((var25 += var2) >= var5) {
                     l = new llllIIll(IlIIllIII.Ill(var0[l(1508199450, var23 ^ 523607081)]));
                     Il = new llllIIll(IlIIllIII.Ill(var0[1]));
                     ll = new llllIIll(IlIIllIII.Ill(var0[3]));
                     I = new llllIIll(IlIIllIII.Ill(var0[5]));
                     lI = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var48;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label90;
                  }

                  var5 = (var3 = II(-1820675717, var23 ^ 1804535305)).length();
                  var2 = 5;
                  var25 = -1;
            }

            var27 = l(1508199445, var23 ^ 640207808);
            var10001 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   @Override
   public String toString() {
      return this.II.llIl();
   }
}
