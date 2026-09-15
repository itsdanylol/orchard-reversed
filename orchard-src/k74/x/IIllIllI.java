package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIllIllI {
   I,
   l,
   II,
   lI;
   private static final String[] III;
   private static final Object[] IIl;
   private static final int[] ll;
   private static final IIllIllI[] Il;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = 1698094991;
      byte var20 = -1;
      char[] var15 = "\f\u0016".toCharArray();
      String var14 = "텣텦퇹턢퇫턧텑턹텁톚턛턴\uea8d\uea8e\uea06\ueacb\uea15\uea95\ueac3\ueabc\ueae1\uea70\uea9b\ueae8\uea57\ueab4\uea8e\uea40\uea23\uea8b\uea15\uea8c\uea56\uea09";
      short var13 = 5357;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            III = var16;
            IIl = new Object[var16.length];
            int var9 = -2034940363;
            byte[] var7 = "1\u008aêGJ°~\u0006(_ S\u008bjs}fgöz\u009eJ\u008cRè\u0001\u001b£b\u008a\u000e^W\u009dPªl`Çij\u00ad~ê".getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            ll = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               ll[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il(1157067486, var24 ^ -1504723332)).length();
            int var2 = 5;
            int var26 = -1;

            label99:
            while (true) {
               int var29 = II(1349381393, var24 ^ -2107297396);
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
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(1349381394, var24 ^ 948283614)) {
                           case 0 -> II(1349381397, var24 ^ -712495689);
                           case 1 -> II(1349381396, var24 ^ 765809522);
                           case 2 -> II(1349381399, var24 ^ 1542373447);
                           case 3 -> II(1349381398, var24 ^ -781855324);
                           case 4 -> II(1349381401, var24 ^ -462255305);
                           case 5 -> II(1349381400, var24 ^ -544269144);
                           default -> II(1349381403, var24 ^ -649944608);
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
                           II = new IIllIllI();
                           l = new IIllIllI();
                           I = new IIllIllI();
                           lI = new IIllIllI();
                           Il = I();
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

                        var5 = (var3 = Il(1157067487, var24 ^ -1647649433)).length();
                        var2 = II(1349381392, var24 ^ -111172261);
                        var26 = -1;
                  }

                  var29 = II(1349381395, var24 ^ -1682931849);
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
               short var23 = switch (var22 % 6) {
                  default -> 158;
                  case 1 -> 126;
                  case 2 -> 23;
                  case 3 -> 228;
                  case 4 -> 205;
                  case 5 -> 74;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ 1157067486;
      char[] var4 = III[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1607329234;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 245;
            case 1 -> 98;
            case 2 -> 192;
            case 3 -> 224;
            case 4 -> 127;
            case 5 -> 58;
            case 6 -> 211;
            case 7 -> 51;
            case 8 -> 110;
            case 9 -> 74;
            case 10 -> 152;
            case 11 -> 124;
            case 12 -> 43;
            case 13 -> 82;
            case 14 -> 71;
            case 15 -> 105;
            case 16 -> 76;
            case 17 -> 35;
            case 18 -> 8;
            case 19 -> 21;
            case 20 -> 215;
            case 21 -> 56;
            case 22 -> 186;
            case 23 -> 141;
            case 24 -> 44;
            case 25 -> 194;
            case 26 -> 235;
            case 27 -> 157;
            case 28 -> 212;
            case 29 -> 104;
            case 30 -> 206;
            case 31 -> 58;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int II(int var0, int var1) {
      int var2 = ll[var0 ^ 1349381393] ^ var1 ^ var0;
      var2 ^= 50570;
      var2 -= 12600;
      var2 += 46790;
      var2 ^= 44471;
      var2 -= 59148;
      var2 -= 23195;
      return var2 - 7178;
   }

   private static IIllIllI[] I() {
      return new IIllIllI[]{II, l, I, lI};
   }

   public static IIllIllI l(String var0) {
      return Enum.valueOf(IIllIllI.class, var0);
   }
}
