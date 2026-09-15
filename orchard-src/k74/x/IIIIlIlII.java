package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIIIlIlII {
   I,
   l;

   private static final String[] ll;
   private static final Object[] III;
   private static final IIIIlIlII[] II;
   private static final int[] lI;
   private final IIIlIlIl Il;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = 1074868434;
      byte var20 = -1;
      char[] var15 = "㛺㛦".toCharArray();
      String var14 = "蒬蒠蓇萞蒄葐蒙蒕葬萞葞蓑葿葋蒖葛蓊連遱逗邯逊郻遍進郂郚郦遯郩";
      short var13 = 14059;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            ll = var16;
            III = new Object[var16.length];
            int var9 = -1415253488;
            byte[] var7 = "5-g§\u0084$ï\u0087ÚH\"\u0018\\\u000f\u001dg\u0095í\u008fÉ:3÷µ\r&\u0003\u0099\u009a\u0087\u008eÿ\u0081¢áDmY×Ùô£¥t¢ôV\u0000"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            lI = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               lI[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il(1604906801, 31237, (byte)-58)).length();
            int var2 = II(-1425827973, var24 ^ 1973139097);
            int var26 = -1;

            label102:
            while (true) {
               int var29 = II(-1425827974, var24 ^ -997048721);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label97: {
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
                           break label97;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(-1425827969, var24 ^ -715432208)) {
                           case 0 -> II(-1425827970, var24 ^ 2055546428);
                           case 1 -> II(-1425827971, var24 ^ 1301336738);
                           case 2 -> II(-1425827972, var24 ^ -634298569);
                           case 3 -> II(-1425827981, var24 ^ -1055641497);
                           case 4 -> II(-1425827982, var24 ^ 770639379);
                           case 5 -> II(-1425827983, var24 ^ -1273662286);
                           default -> II(-1425827984, var24 ^ -498956492);
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
                           l = new IIIIlIlII(IlIIllIII.Ill(var0[1]));
                           I = new IIIIlIlII(IlIIllIII.Ill(var0[0]));
                           II = I();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var50;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label102;
                        }

                        var5 = (var3 = Il(1604906800, (short)-28391, 39)).length();
                        var2 = II(-1425827975, var24 ^ -1694567642);
                        var26 = -1;
                  }

                  var29 = II(-1425827976, var24 ^ 481938556);
                  var10001 = var3.substring(++var26, var26 + var2);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 101;
                  case 1 -> 47;
                  case 2 -> 68;
                  case 3 -> 24;
                  case 4 -> 230;
                  case 5 -> 118;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ -1425827973] ^ var1 ^ var0;
      var2 -= 17268;
      var2 -= 62894;
      var2 ^= 53412;
      var2 ^= 47368;
      var2 ^= 15045;
      var2 += 7724;
      var2 += 50802;
      return var2 + 862;
   }

   private static String Il(int var0, short var1, byte var2) {
      int var7 = var0 ^ 1604906801;
      char[] var6 = ll[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])III[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         III[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 31689;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ switch (var5 % 17) {
            default -> 241;
            case 1 -> 130;
            case 2 -> 180;
            case 3 -> 117;
            case 4 -> 29;
            case 5 -> 125;
            case 6 -> 174;
            case 7 -> 183;
            case 8 -> 92;
            case 9 -> 59;
            case 10 -> 202;
            case 11 -> 231;
            case 12 -> 100;
            case 13 -> 26;
            case 14 -> 138;
            case 15 -> 69;
            case 16 -> 88;
         } ^ var0 ^ var4 ^ var1 ^ var2);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }

   private static IIIIlIlII[] I() {
      return new IIIIlIlII[]{l, I};
   }

   private IIIIlIlII(IIIlIlIl var3) {
      this.Il = var3;
   }

   public static IIIIlIlII l(String var0) {
      return Enum.valueOf(IIIIlIlII.class, var0);
   }
}
