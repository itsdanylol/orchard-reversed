package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IllIIlI {
   I,
   II;
   private static final String[] lI;
   private static final IllIIlI[] l;
   private static final int[] Il;
   private static final Object[] ll;

   private static int II(int var0, int var1) {
      int var2 = Il[var0 ^ 1980569464] ^ var1 ^ var0;
      var2 += 24989;
      var2 ^= 16062;
      var2 += 61812;
      var2 -= 6199;
      var2 += 64156;
      return var2 ^ 42994;
   }

   public static IllIIlI I(String var0) {
      return Enum.valueOf(IllIIlI.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = -1530653968;
      short var7 = 24584;
      String var8 = "낙냫냝낔끑낃뀭낭끉뀤냠낪";
      char[] var9 = "\f".toCharArray();
      int var10000 = var9.length;
      byte var14 = -1;
      String[] var10 = new String[var10000];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            lI = var10;
            ll = new Object[var10.length];
            int var22 = 0;
            Il = new int[9];
            int var10001 = 0;
            byte[] var10002 = "{\u0019w~Z'k\u0002a\u0096Iàv\u0091'$\u009a~dhü(\u00835áaæÍ\u0082\u0089QB\u008d1\u0093\u0012".getBytes("ISO-8859-1");

            int var45;
            do {
               Il[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1492375120;
               var22 += 1;
               var45 = var10001 + 4;
               var10001 += 4;
            } while (var45 < var10002.length);

            String[] var0 = new String[2];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il(-116256831, var18 ^ -2056978302)).length();
            char var2 = 4;
            int var1 = -1;

            while (true) {
               label85: {
                  var22 = II(1980569464, var18 ^ 249376162);
                  char[] var46 = var3.substring(++var1, var1 + var2).toCharArray();
                  int var56 = var46.length;
                  int var6 = 0;
                  var45 = var22;
                  var35 = var46;
                  var10001 = var56;
                  char[] var65;
                  int var72;
                  if (var56 <= 1) {
                     var65 = var46;
                     var56 = var22;
                     var72 = var6;
                  } else {
                     var45 = var22;
                     var10001 = var56;
                     if (var56 <= var6) {
                        break label85;
                     }

                     var65 = var46;
                     var56 = var22;
                     var72 = var6;
                  }

                  while (true) {
                     var65[var72] = (char)(var65[var72] ^ var56 ^ switch (var6 % II(1980569465, var18 ^ 803418590)) {
                        case 0 -> II(1980569466, var18 ^ 340923178);
                        case 1 -> II(1980569467, var18 ^ 55934773);
                        case 2 -> II(1980569468, var18 ^ -273007591);
                        case 3 -> II(1980569469, var18 ^ -1980966081);
                        case 4 -> II(1980569470, var18 ^ -1801077148);
                        case 5 -> II(1980569471, var18 ^ -145945668);
                        default -> II(1980569456, var18 ^ -118109343);
                     });
                     var6++;
                     if (var45 == 0) {
                        var72 = var45;
                        var65 = var35;
                        var56 = var45;
                     } else {
                        if (var10001 <= var6) {
                           break;
                        }

                        var65 = var35;
                        var56 = var45;
                        var72 = var6;
                     }
                  }
               }

               String var49 = new String(var35).intern();
               byte var29 = -1;
               var0[var4++] = var49;
               if ((var1 += var2) >= var5) {
                  I = new IllIIlI();
                  II = new IllIIlI();
                  l = l();
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 91;
                  case 1 -> 58;
                  case 2 -> 9;
                  case 3 -> 2;
                  case 4 -> 173;
                  case 5 -> 60;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ -116256831;
      char[] var4 = lI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])ll[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         ll[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1781987449;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 141;
            case 1 -> 207;
            case 2 -> 186;
            case 3 -> 159;
            case 4 -> 230;
            case 5 -> 228;
            case 6 -> 100;
            case 7 -> 240;
            case 8 -> 84;
            case 9 -> 4;
            case 10 -> 52;
            case 11 -> 246;
            case 12 -> 37;
            case 13 -> 67;
            case 14 -> 239;
            case 15 -> 178;
            case 16 -> 241;
            case 17 -> 139;
            case 18 -> 38;
            case 19 -> 212;
            case 20 -> 255;
            case 21 -> 104;
            case 22 -> 255;
            case 23 -> 195;
            case 24 -> 94;
            case 25 -> 112;
            case 26 -> 149;
            case 27 -> 191;
            case 28 -> 135;
            case 29 -> 5;
            case 30 -> 160;
            case 31 -> 240;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static IllIIlI[] l() {
      return new IllIIlI[]{I, II};
   }
}
