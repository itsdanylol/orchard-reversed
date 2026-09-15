package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lllIl {
   I,
   l;

   private static final int[] lI;
   private static final Object[] III;
   private static final lllIl[] II;
   private final IIIlIlIl Il;
   private static final String[] ll;

   @Override
   public String toString() {
      return this.Il.llIl();
   }

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ 580338784] ^ var1 ^ var0;
      var2 ^= 28849;
      var2 ^= 12429;
      var2 -= 20615;
      var2 += 31830;
      var2 ^= 64968;
      var2 += 21961;
      var2 += 40416;
      var2 -= 48269;
      var2 ^= 28978;
      return var2 + 27382;
   }

   private static String II(char var0, int var1, int var2, char var3, byte var4, int var5, short var6) {
      int var11 = var1 ^ 1394232364;
      char[] var10 = ll[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])III[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         III[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 48611;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 27) {
            default -> 181;
            case 1 -> 78;
            case 2 -> 171;
            case 3 -> 7;
            case 4 -> 236;
            case 5 -> 121;
            case 6 -> 253;
            case 7 -> 140;
            case 8 -> 11;
            case 9 -> 51;
            case 10 -> 218;
            case 11 -> 221;
            case 12 -> 109;
            case 13 -> 172;
            case 14 -> 216;
            case 15 -> 119;
            case 16 -> 109;
            case 17 -> 19;
            case 18 -> 26;
            case 19 -> 69;
            case 20 -> 13;
            case 21 -> 59;
            case 22 -> 154;
            case 23 -> 43;
            case 24 -> 249;
            case 25 -> 248;
            case 26 -> 148;
         } ^ 42312 ^ var9 ^ var1 ^ var5 ^ var8 ^ var4 ^ var6 ^ var0 ^ var3 ^ var2);
      }

      return new String(var10).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = 325531952;
      char[] var9 = "\u000e\u0015".toCharArray();
      short var7 = 8660;
      byte var14 = -1;
      String var8 = "㽵㿰㾵㿅㼈㾿㽗㾶㿬㾾㼌㽝㼦㽤˺ɹȗɥʐȖˎȟȁȱ˺ːʴʚ˷ȭȃˉȔȚȞ";
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            ll = var10;
            III = new Object[var10.length];
            int var22 = 0;
            lI = new int[12];
            int var10001 = 0;
            byte[] var10002 = "d\u0083É¡Ì\u0093Gá\u00958\b\u001dz\u0097\u0081^áõÀ\u0014\u000f\u0094\u0093ZAøÆrOÀ¿9\u0006R$¨÷i\u0007Îf\u0004\u001d\nßfÁ1"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               lI[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1117792444;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = II('⊱', 1394232364, 1116026917, 28778, (byte)-80, 1175109857, (short)13114)).length();
            int var2 = l(580338784, var18 ^ 399705972);
            int var20 = -1;

            label103:
            while (true) {
               var22 = l(580338785, var18 ^ -1077704531);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var39 = -1;

               while (true) {
                  label98: {
                     char[] var57 = var27.toCharArray();
                     int var69 = var57.length;
                     int var6 = 0;
                     var55 = var22;
                     var44 = var57;
                     var10001 = var69;
                     char[] var81;
                     int var88;
                     if (var69 <= 1) {
                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     } else {
                        var55 = var22;
                        var10001 = var69;
                        if (var69 <= var6) {
                           break label98;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % l(580338788, var18 ^ -1834676424)) {
                           case 0 -> l(580338789, var18 ^ 2093243829);
                           case 1 -> l(580338790, var18 ^ 849873155);
                           case 2 -> l(580338791, var18 ^ 1016098847);
                           case 3 -> l(580338792, var18 ^ 1963125307);
                           case 4 -> l(580338793, var18 ^ -2076587829);
                           case 5 -> l(580338794, var18 ^ 357880800);
                           default -> l(580338795, var18 ^ -1405743548);
                        });
                        var6++;
                        if (var55 == 0) {
                           var88 = var55;
                           var81 = var44;
                           var69 = var55;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var81 = var44;
                           var69 = var55;
                           var88 = var6;
                        }
                     }
                  }

                  String var62 = new String(var44).intern();
                  switch (var39) {
                     case 0:
                        var0[var4++] = var62;
                        if ((var20 += var2) >= var5) {
                           I = new lllIl(IlIIllIII.Ill(var0[3]));
                           l = new lllIl(IlIIllIII.Ill(var0[2]));
                           II = I();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var62;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label103;
                        }

                        var5 = (var3 = II('\uf107', 1394232365, 2133594638, 'ﶶ', (byte)124, -2026695032, (short)21350)).length();
                        var2 = l(580338786, var18 ^ -429340986);
                        var20 = -1;
                  }

                  var22 = l(580338787, var18 ^ 164056595);
                  var27 = var3.substring(++var20, var20 + var2);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 6;
                  case 1 -> 97;
                  case 2 -> 253;
                  case 3 -> 115;
                  case 4 -> 76;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private lllIl(IIIlIlIl var3) {
      this.Il = var3;
   }

   private static lllIl[] I() {
      return new lllIl[]{I, l};
   }
}
