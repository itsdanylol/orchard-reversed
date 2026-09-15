package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lllIllII {
   I,
   l,
   II,
   Il;

   private static final int[] ll;
   private static final String[] III;
   private static final Object[] IIl;
   private static final lllIllII[] lI;

   private static int II(int var0, int var1) {
      int var2 = ll[var0 ^ 455198882] ^ var1 ^ var0;
      var2 -= 46436;
      var2 += 47364;
      var2 += 22851;
      var2 += 49304;
      var2 -= 44413;
      var2 += 27850;
      var2 += 23657;
      return var2 ^ 45048;
   }

   public static lllIllII I(String var0) {
      return Enum.valueOf(lllIllII.class, var0);
   }

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ 1764360428;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 557066721;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 63;
            case 1 -> 54;
            case 2 -> 211;
            case 3 -> 34;
            case 4 -> 87;
            case 5 -> 143;
            case 6 -> 19;
            case 7 -> 179;
            case 8 -> 229;
            case 9 -> 42;
            case 10 -> 15;
            case 11 -> 252;
            case 12 -> 94;
            case 13 -> 21;
            case 14 -> 228;
            case 15 -> 236;
            case 16 -> 143;
            case 17 -> 187;
            case 18 -> 77;
            case 19 -> 72;
            case 20 -> 153;
            case 21 -> 67;
            case 22 -> 76;
            case 23 -> 9;
            case 24 -> 184;
            case 25 -> 178;
            case 26 -> 99;
            case 27 -> 13;
            case 28 -> 211;
            case 29 -> 219;
            case 30 -> 6;
            case 31 -> 114;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static lllIllII[] l() {
      return new lllIllII[]{Il, I, II, l};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 1954463702;
      short var12 = 2971;
      int var11 = 0;
      int var10 = 0;
      int var8 = "\u001a恝ᘉ払ᘇ悹혦悅阧揑嘚惁阣愱ᘝ挕혼捉혧惽嘑拙嘛慙阐戙嘰 뺼쯥벐诪빔쯊븤ொ뵤௳븄诌뾘\u0be2뷀쯐밼쯉뿔䯨뱀쯠뾸쯤볨쯃븸䯢뱸\u0bd9븤诽".length();
      String var7 = "\u001a恝ᘉ払ᘇ悹혦悅阧揑嘚惁阣愱ᘝ挕혼捉혧惽嘑拙嘛慙阐戙嘰 뺼쯥벐诪빔쯊븤ொ뵤௳븄诌뾘\u0be2뷀쯐밼쯉뿔䯨뱀쯠뾸쯤볨쯃븸䯢뱸\u0bd9븤诽";
      String[] var9 = new String[2];

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      III = var9;
      IIl = new Object[var9.length];
      ll = new int[11];
      int var10000 = 0;
      int var10001 = 0;
      byte[] var10002 = "\u001aM\u0014îÛ1¦(º\u0003Õq¶Ç^v\u0006¹ðh\u009a!±G*m\u007fØ!\u0013\r\u00adqO'9ëdF§und`".getBytes("ISO-8859-1");

      int var52;
      do {
         ll[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1660725701;
         var10000 += 1;
         var52 = var10001 + 4;
         var10001 += 4;
      } while (var52 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(1764360428, var17 ^ 2082271874)).length();
      int var2 = II(455198882, var17 ^ 401490789);
      int var19 = -1;

      label92:
      while (true) {
         var10000 = II(455198883, var17 ^ -695012871);
         String var24 = var3.substring(++var19, var19 + var2);
         byte var36 = -1;

         while (true) {
            label87: {
               char[] var54 = var24.toCharArray();
               int var66 = var54.length;
               int var6 = 0;
               var52 = var10000;
               var41 = var54;
               var10001 = var66;
               char[] var78;
               int var85;
               if (var66 <= 1) {
                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               } else {
                  var52 = var10000;
                  var10001 = var66;
                  if (var66 <= var6) {
                     break label87;
                  }

                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               }

               while (true) {
                  var78[var85] = (char)(var78[var85] ^ var66 ^ switch (var6 % II(455198886, var17 ^ 186296301)) {
                     case 0 -> II(455198887, var17 ^ -1753028952);
                     case 1 -> II(455198884, var17 ^ 667822115);
                     case 2 -> II(455198885, var17 ^ 749754980);
                     case 3 -> II(455198890, var17 ^ 2095870187);
                     case 4 -> II(455198891, var17 ^ -423161416);
                     case 5 -> 5;
                     default -> II(455198888, var17 ^ 2026714042);
                  });
                  var6++;
                  if (var52 == 0) {
                     var85 = var52;
                     var78 = var41;
                     var66 = var52;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var78 = var41;
                     var66 = var52;
                     var85 = var6;
                  }
               }
            }

            String var59 = new String(var41).intern();
            switch (var36) {
               case 0:
                  var0[var4++] = var59;
                  if ((var19 += var2) >= var5) {
                     Il = new lllIllII();
                     I = new lllIllII();
                     II = new lllIllII();
                     l = new lllIllII();
                     lI = l();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var59;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = Il(1764360429, var17 ^ 201241291)).length();
                  var2 = II(455198880, var17 ^ -1214217589);
                  var19 = -1;
            }

            var10000 = II(455198881, var17 ^ -1151071895);
            var24 = var3.substring(++var19, var19 + var2);
            var36 = 0;
         }
      }
   }
}
