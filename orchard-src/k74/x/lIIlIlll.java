package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lIIlIlll {
   l,
   II,
   Il,
   lI,
   ll,
   III,
   IIl;
   private static final lIIlIlll[] I;
   private static final int[] IlI;
   private static final Object[] lII;
   private static final String[] Ill;

   private static lIIlIlll[] I() {
      lIIlIlll[] var10000 = new lIIlIlll[II(1636370932, 705682502 ^ 8661497)];
      var10000[0] = II;
      var10000[1] = Il;
      var10000[2] = l;
      var10000[3] = III;
      var10000[4] = lI;
      var10000[5] = IIl;
      var10000[II(1636370933, 705682502 ^ 1198151181)] = ll;
      return var10000;
   }

   public static lIIlIlll l(String var0) {
      return Enum.valueOf(lIIlIlll.class, var0);
   }

   private static int II(int var0, int var1) {
      int var2 = IlI[var0 ^ 1636370932] ^ var1 ^ var0;
      var2 -= 21177;
      var2 += 29110;
      var2 += 27895;
      var2 -= 5552;
      var2 -= 31021;
      var2 -= 28070;
      var2 += 55880;
      var2 -= 17157;
      return var2 + 49498;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 1667105864;
      int var8 = "B䱂쇼䱴\ue1ce侚\ue124亀\ue188侦䇹乩\ue188俏ꅩ䶂ꇼ䱔솒䱊섥䳨\ue1dd修\ue1f7乹\ue180住셤夢Ǻ丼ꆒ䶺脣䵘ǜ伮ꇳ佹憆仧\ue163夒\ue1fa乬憑䷊愠䵘\ue187䶶\ue1f4俑\u218f丟셤俚䇹䱔憖䱊ꅹ伐膀仞\ue1f9\u0014罥崲翓絚緽編羧絆籩ﴰ籮鵆緈綠翕ᴸ繃ﵜ翅差"
         .length();
      int var11 = 0;
      short var12 = 26742;
      int var10 = 0;
      String var7 = "B䱂쇼䱴\ue1ce侚\ue124亀\ue188侦䇹乩\ue188俏ꅩ䶂ꇼ䱔솒䱊섥䳨\ue1dd修\ue1f7乹\ue180住셤夢Ǻ丼ꆒ䶺脣䵘ǜ伮ꇳ佹憆仧\ue163夒\ue1fa乬憑䷊愠䵘\ue187䶶\ue1f4俑\u218f丟셤俚䇹䱔憖䱊ꅹ伐膀仞\ue1f9\u0014罥崲翓絚緽編羧絆籩ﴰ籮鵆緈綠翕ᴸ繃ﵜ翅差";
      String[] var9 = new String[2];

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 186;
               case 1 -> 198;
               case 2 -> 204;
               case 3 -> 169;
               case 4 -> 178;
               case 5 -> 31;
               case 6 -> 80;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      Ill = var9;
      lII = new Object[var9.length];
      IlI = new int[17];
      int var21 = 0;
      int var24 = 0;
      byte[] var34 = "G,ÜS\u0000Â£§)ù(k/v\u009ez\u0013Dh&~\u008c»\u0088å½Ù\u000bÍîh` ëT\u009a\r\u001bfi\u0019?7AÙrz\u0002\u000e1äx\b\u0081ì\u008aJS\u0010¶,ROÍ@\"\u001eZ"
         .getBytes("ISO-8859-1");

      int var56;
      do {
         IlI[var21] = ((var34[var24] & 255) << 24 | (var34[var24 + 1] & 255) << 16 | (var34[var24 + 2] & 255) << 8 | var34[var24 + 3] & 255) ^ -204392479;
         var21 += 1;
         var56 = var24 + 4;
         var24 += 4;
      } while (var56 < var34.length);

      String[] var0 = new String[II(1636370934, var17 ^ 654312909)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(var17 ^ 1074617746, 'ഁ', 24335)).length();
      int var2 = II(1636370935, var17 ^ 563067943);
      int var19 = -1;

      label103:
      while (true) {
         var21 = II(1636370928, var17 ^ 498944527);
         String var27 = var3.substring(++var19, var19 + var2);
         byte var40 = -1;

         while (true) {
            label98: {
               char[] var58 = var27.toCharArray();
               int var70 = var58.length;
               int var6 = 0;
               var56 = var21;
               var45 = var58;
               var24 = var70;
               char[] var82;
               int var89;
               if (var70 <= 1) {
                  var82 = var58;
                  var70 = var21;
                  var89 = var6;
               } else {
                  var56 = var21;
                  var24 = var70;
                  if (var70 <= var6) {
                     break label98;
                  }

                  var82 = var58;
                  var70 = var21;
                  var89 = var6;
               }

               while (true) {
                  var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % II(1636370931, var17 ^ -1021884989)) {
                     case 0 -> II(1636370940, var17 ^ -1374521695);
                     case 1 -> II(1636370941, var17 ^ 65160232);
                     case 2 -> II(1636370942, var17 ^ 398857546);
                     case 3 -> II(1636370943, var17 ^ -678733755);
                     case 4 -> II(1636370936, var17 ^ 13157903);
                     case 5 -> II(1636370937, var17 ^ 108580557);
                     default -> II(1636370938, var17 ^ 1152004838);
                  });
                  var6++;
                  if (var56 == 0) {
                     var89 = var56;
                     var82 = var45;
                     var70 = var56;
                  } else {
                     if (var24 <= var6) {
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
                  if ((var19 += var2) >= var5) {
                     II = new lIIlIlll();
                     Il = new lIIlIlll();
                     l = new lIIlIlll();
                     III = new lIIlIlll();
                     lI = new lIIlIlll();
                     IIl = new lIIlIlll();
                     ll = new lIIlIlll();
                     I = I();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var63;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label103;
                  }

                  var5 = (var3 = Il(var17 ^ 974222791, '鵯', 24334)).length();
                  var2 = II(1636370929, var17 ^ 1886755281);
                  var19 = -1;
            }

            var21 = II(1636370930, var17 ^ -347800814);
            var27 = var3.substring(++var19, var19 + var2);
            var40 = 0;
         }
      }
   }

   private static String Il(int var0, char var1, int var2) {
      int var3 = var2 ^ 24335;
      char[] var4 = Ill[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lII[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lII[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 11389;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 28290;
         var10 ^= 28991;
         var10 += 9202;
         var10 -= 51131;
         var10 += 9467;
         var10 += 28744;
         var10 -= 35694;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }
}
