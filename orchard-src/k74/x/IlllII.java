package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlllII {
   I,
   l,
   II,
   lI,
   ll;
   private static final int[] III;
   private static final Object[] IlI;
   private static final String[] IIl;
   private static final IlllII[] Il;

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ -235771108;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1846945739;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 148;
            case 1 -> 159;
            case 2 -> 113;
            case 3 -> 174;
            case 4 -> 165;
            case 5 -> 71;
            case 6 -> 70;
            case 7 -> 197;
            case 8 -> 44;
            case 9 -> 155;
            case 10 -> 6;
            case 11 -> 190;
            case 12 -> 41;
            case 13 -> 225;
            case 14 -> 48;
            case 15 -> 61;
            case 16 -> 141;
            case 17 -> 37;
            case 18 -> 30;
            case 19 -> 33;
            case 20 -> 243;
            case 21 -> 13;
            case 22 -> 66;
            case 23 -> 91;
            case 24 -> 202;
            case 25 -> 112;
            case 26 -> 145;
            case 27 -> 161;
            case 28 -> 70;
            case 29 -> 28;
            case 30 -> 218;
            case 31 -> 24;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public static IlllII I(String var0) {
      return Enum.valueOf(IlllII.class, var0);
   }

   private static IlllII[] l() {
      return new IlllII[]{I, II, ll, lI, l};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = -1745388037;
      byte var20 = -1;
      char[] var15 = "\u001d#".toCharArray();
      String var14 = "垼圗坥坏坝圏埳埓培坍场圂圇國埬圼坈圩埼埶埗垜坐垠圿圯圠垲垎7\u0089äÒÁ\u0093bE{Ç¤¦Ã\u008ai\u0099\u008c¹qN9%Ç\u001d\u009dÐ\u0094Z![\\)\u001dÒB";
      short var13 = 21609;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            IIl = var16;
            IlI = new Object[var16.length];
            int var9 = -1277745041;
            byte[] var7 = "\u009f\u001cd\u001a*¥«ß´\u0003¤\u0095_1ËL\u001bï\\l\u0017¦\u001bÑ[Ö\rÐ®'+uÃ#>±\u009fÎ_ö-6yXð\u0002\u000e\u001d"
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

            String[] var0 = new String[5];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il(-235771108, var24 ^ -316534513)).length();
            int var2 = II(1708981927, var24 ^ -555678326);
            int var26 = -1;

            label99:
            while (true) {
               int var29 = II(1708981926, var24 ^ 1800981108);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label94: {
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
                           break label94;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(1708981923, var24 ^ 1511144939)) {
                           case 0 -> II(1708981922, var24 ^ 1448836013);
                           case 1 -> II(1708981921, var24 ^ 439053717);
                           case 2 -> II(1708981920, var24 ^ -270906613);
                           case 3 -> II(1708981935, var24 ^ -2099355967);
                           case 4 -> II(1708981934, var24 ^ -567066722);
                           case 5 -> II(1708981933, var24 ^ 1825249502);
                           default -> II(1708981932, var24 ^ -1308660118);
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
                        var0[var4++] = var50;
                        if ((var26 += var2) >= var5) {
                           I = new IlllII();
                           II = new IlllII();
                           ll = new IlllII();
                           lI = new IlllII();
                           l = new IlllII();
                           Il = l();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var50;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label99;
                        }

                        var5 = (var3 = Il(-235771107, var24 ^ -1162775520)).length();
                        var2 = II(1708981925, var24 ^ -167852773);
                        var26 = -1;
                  }

                  var29 = II(1708981924, var24 ^ 516729593);
                  var10001 = var3.substring(++var26, var26 + var2);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 144;
                  case 1 -> 10;
                  case 2 -> 162;
                  case 3 -> 82;
                  case 4 -> 122;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static int II(int var0, int var1) {
      int var2 = III[var0 ^ 1708981927] ^ var1 ^ var0;
      var2 ^= 12915;
      var2 -= 61269;
      var2 -= 7031;
      var2 += 18345;
      var2 += 28025;
      var2 -= 51353;
      var2 -= 10752;
      return var2 ^ 45191;
   }
}
