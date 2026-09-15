package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lllIllI {
   I,
   l,
   II,
   lI,
   ll;

   private static final int[] III;
   private static final Object[] IlI;
   private static final lllIllI[] Il;
   private static final String[] IIl;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -45213965;
      short var18 = 28805;
      int var16 = 0;
      int var17 = 0;
      String[] var15 = new String[2];
      int var14 = "-뻸\u0be4뽠䯱뼨诿뒬\u0be3빰䯹빔诲뼸\u0b4a븀쯥뽨䯩뻸\u0be4뽠䯱뼨쯿뒘诮빤௶빐䯁뽔䯩뻸\u0be4뽠䯱뼨ு뒤诮빤௶빐䯁뽔\u0010镫㥟锓祖閻㥝铏祙闳륌骋拏骃祜铧㦪".length();
      String var13 = "-뻸\u0be4뽠䯱뼨诿뒬\u0be3빰䯹빔诲뼸\u0b4a븀쯥뽨䯩뻸\u0be4뽠䯱뼨쯿뒘诮빤௶빐䯁뽔䯩뻸\u0be4뽠䯱뼨ு뒤诮빤௶빐䯁뽔\u0010镫㥟锓祖閻㥝铏祙闳륌骋拏骃祜铧㦪";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIl = var15;
      IlI = new Object[var15.length];
      int var9 = -2134398686;
      byte[] var7 = "îYXÏ2CI[A\u001dIõñ\u0004\u0089\fyêrãeÑãYN·õ\f\foó\u0013\u00ad\u009c¶|\u0082\u008d\u0019\u0013".getBytes("ISO-8859-1");
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
      int var5 = (var3 = Il('魶', var23 ^ 178992626, (short)21196)).length();
      int var2 = II(39429798, var23 ^ 1853260008);
      int var25 = -1;

      label90:
      while (true) {
         int var10000 = II(39429799, var23 ^ -1301484340);
         String var10001 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label85: {
               char[] var42 = var10001.toCharArray();
               int var10004 = var42.length;
               int var6 = 0;
               int var45 = var10000;
               var38 = var42;
               int var32 = var10004;
               char[] var54;
               int var10006;
               if (var10004 <= 1) {
                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var45 = var10000;
                  var32 = var10004;
                  if (var10004 <= var6) {
                     break label85;
                  }

                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % II(39429797, var23 ^ 1898664226)) {
                     case 0 -> 3;
                     case 1 -> II(39429794, var23 ^ -104474958);
                     case 2 -> II(39429795, var23 ^ -436320567);
                     case 3 -> II(39429792, var23 ^ -828887769);
                     case 4 -> II(39429793, var23 ^ -1941940575);
                     case 5 -> II(39429806, var23 ^ 766710297);
                     default -> II(39429807, var23 ^ 44219605);
                  });
                  var6++;
                  if (var45 == 0) {
                     var10006 = var45;
                     var54 = var38;
                     var10004 = var45;
                  } else {
                     if (var32 <= var6) {
                        break;
                     }

                     var54 = var38;
                     var10004 = var45;
                     var10006 = var6;
                  }
               }
            }

            String var47 = new String(var38).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var47;
                  if ((var25 += var2) >= var5) {
                     I = new lllIllI();
                     ll = new lllIllI();
                     II = new lllIllI();
                     lI = new lllIllI();
                     l = new lllIllI();
                     Il = l();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var47;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label90;
                  }

                  var5 = (var3 = Il('魷', var23 ^ 451887634, (short)'鬗')).length();
                  var2 = II(39429796, var23 ^ -1053650466);
                  var25 = -1;
            }

            var10000 = 5;
            var10001 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   public static lllIllI I(String var0) {
      return Enum.valueOf(lllIllI.class, var0);
   }

   private static String Il(char var0, int var1, short var2) {
      int var3 = var0 ^ '魶';
      char[] var4 = IIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 30668;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 4096;
         var10 += 22831;
         var10 -= 34481;
         var10 ^= 48336;
         var10 += 36808;
         var10 += 48712;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int II(int var0, int var1) {
      int var2 = III[var0 ^ 39429798] ^ var1 ^ var0;
      var2 -= 43831;
      var2 ^= 29048;
      var2 ^= 31555;
      var2 -= 8574;
      var2 += 6868;
      var2 -= 1534;
      var2 ^= 17889;
      return var2 + 46454;
   }

   private static lllIllI[] l() {
      return new lllIllI[]{I, ll, II, lI, l};
   }
}
