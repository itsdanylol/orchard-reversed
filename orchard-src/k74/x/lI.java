package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lI {
   I,
   l;

   private static final int[] Il;
   private static final Object[] ll;
   private static final String[] lI;
   private static final lI[] II;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = -387295079;
      char[] var9 = "昑".toCharArray();
      String var8 = "籡籉肻籊胙腑脊籼糫胀糏胓肧耯簕籹胰";
      short var7 = 26112;
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            lI = var10;
            ll = new Object[var10.length];
            int var21 = 0;
            int var10001 = 0;
            Il = new int[10];
            byte[] var10002 = "á\u0002\n¤\u001f.Õ}b6)Eä\u0085Ò½ôX(\u0019\u007fÉï1\u0007.¾¹\u0083\u0098e{)¼V¼ã\u007f\u0086\u0000".getBytes("ISO-8859-1");

            int var44;
            do {
               Il[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 886325397;
               var21 += 1;
               var44 = var10001 + 4;
               var10001 += 4;
            } while (var44 < var10002.length);

            String[] var0 = new String[2];
            int var4 = 0;
            String var3;
            int var5 = (var3 = II(479, '끮', var18 ^ -43101197)).length();
            int var2 = l(-1704793975, var18 ^ -1486900073);
            int var1 = -1;

            while (true) {
               label86: {
                  var21 = l(-1704793976, var18 ^ 1500736472);
                  char[] var45 = var3.substring(++var1, var1 + var2).toCharArray();
                  int var55 = var45.length;
                  int var6 = 0;
                  var44 = var21;
                  var34 = var45;
                  var10001 = var55;
                  char[] var64;
                  int var71;
                  if (var55 <= 1) {
                     var64 = var45;
                     var55 = var21;
                     var71 = var6;
                  } else {
                     var44 = var21;
                     var10001 = var55;
                     if (var55 <= var6) {
                        break label86;
                     }

                     var64 = var45;
                     var55 = var21;
                     var71 = var6;
                  }

                  while (true) {
                     var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % l(-1704793973, var18 ^ 611030899)) {
                        case 0 -> l(-1704793974, var18 ^ -1562874822);
                        case 1 -> l(-1704793971, var18 ^ -1308256618);
                        case 2 -> l(-1704793972, var18 ^ 966022911);
                        case 3 -> l(-1704793969, var18 ^ 1098057519);
                        case 4 -> l(-1704793970, var18 ^ -976889043);
                        case 5 -> l(-1704793983, var18 ^ 1877077812);
                        default -> l(-1704793984, var18 ^ -1524482150);
                     });
                     var6++;
                     if (var44 == 0) {
                        var71 = var44;
                        var64 = var34;
                        var55 = var44;
                     } else {
                        if (var10001 <= var6) {
                           break;
                        }

                        var64 = var34;
                        var55 = var44;
                        var71 = var6;
                     }
                  }
               }

               String var48 = new String(var34).intern();
               byte var28 = -1;
               var0[var4++] = var48;
               if ((var1 += var2) >= var5) {
                  l = new lI();
                  I = new lI();
                  II = I();
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 108;
                  case 1 -> 52;
                  case 2 -> 107;
                  case 3 -> 234;
                  case 4 -> 4;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static lI[] I() {
      return new lI[]{l, I};
   }

   private static int l(int var0, int var1) {
      int var2 = Il[var0 ^ -1704793975] ^ var1 ^ var0;
      var2 ^= 5397;
      var2 -= 58879;
      var2 ^= 39791;
      var2 ^= 11939;
      var2 ^= 32368;
      var2 += 21848;
      var2 -= 25345;
      var2 += 18175;
      var2 ^= 51030;
      return var2 - 12338;
   }

   private static String II(int var0, char var1, int var2) {
      int var3 = var1 ^ '끮';
      char[] var4 = lI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])ll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         ll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 16279;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 11393;
         var10 += 57535;
         var10 ^= 41532;
         var10 += 36782;
         var10 ^= 23193;
         var10 ^= 14373;
         var10 -= 7216;
         var10 ^= 16067;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }
}
