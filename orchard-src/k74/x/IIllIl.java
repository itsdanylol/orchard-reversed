package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIllIl {
   I,
   l,
   II;

   private final IIIlIlIl Il;
   private static final Object[] IIl;
   private static final int[] ll;
   private static final String[] III;
   private static final IIllIl[] lI;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 1802173643;
      String[] var15 = new String[2];
      int var10001 = "Gꬋ㪀꧋㪥ꡋ㪭ꡋ盛꩗㪾\uaa37㪽\uaa3f몈ꩃ몑ꤓ몝ꯓ華\uabef蝹ꨯ窠꥟漢ꬓ몋ꡟ㪐ꤓ몯ꩃ窊ꢛ몾ꦷ益ꡋ窪꯫窧꭛瘝\uaacf慎ꯛ窔ꣳ窄ꭷ節ꮛ節ꯋ㪩ꢛ突ꬳ㪞ꦛ慠ꣷ㪱ꮣ廙ꢓ㪩꧷謁꧗\u000f炣\uf73c爫真珃뜜珓㜌煳뜚灯眅灧\uf728瀣".length();
      int var17 = 0;
      int var14 = var10001;
      int var16 = 0;
      String var13 = "Gꬋ㪀꧋㪥ꡋ㪭ꡋ盛꩗㪾\uaa37㪽\uaa3f몈ꩃ몑ꤓ몝ꯓ華\uabef蝹ꨯ窠꥟漢ꬓ몋ꡟ㪐ꤓ몯ꩃ窊ꢛ몾ꦷ益ꡋ窪꯫窧꭛瘝\uaacf慎ꯛ窔ꣳ窄ꭷ節ꮛ節ꯋ㪩ꢛ突ꬳ㪞ꦛ慠ꣷ㪱ꮣ廙ꢓ㪩꧷謁꧗\u000f炣\uf73c爫真珃뜜珓㜌煳뜚灯眅灧\uf728瀣";
      short var18 = 13358;

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

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

      III = var15;
      IIl = new Object[var15.length];
      int var9 = -563796681;
      byte[] var7 = "ºS·¡ßYSt9N¬Jóm¯\u0094Ù\u007fÆ7\ry\u001aÈ\u000fÄ¢R\u008bQÿx\u0096\u0019ÿ\u0017\u0086MÀ¹I=´A°NlÊ\u008a\u0087V\u0003".getBytes("ISO-8859-1");
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

      String[] var0 = new String[Il(643669923, var23 ^ 688006369)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lI(1827658412, var23 ^ 1854588521)).length();
      int var2 = Il(643669922, var23 ^ 1275642311);
      int var25 = -1;

      label90:
      while (true) {
         int var10000 = Il(643669921, var23 ^ -1440792924);
         String var28 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label85: {
               char[] var43 = var28.toCharArray();
               int var10004 = var43.length;
               int var6 = 0;
               int var46 = var10000;
               var39 = var43;
               var10001 = var10004;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var43;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var46 = var10000;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label85;
                  }

                  var55 = var43;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var55[var10006] = (char)(var55[var10006] ^ var10004 ^ switch (var6 % Il(643669926, var23 ^ -1641510516)) {
                     case 0 -> Il(643669925, var23 ^ -1667944203);
                     case 1 -> Il(643669924, var23 ^ 402681302);
                     case 2 -> Il(643669931, var23 ^ 88632755);
                     case 3 -> Il(643669930, var23 ^ 354178018);
                     case 4 -> Il(643669929, var23 ^ -630446417);
                     case 5 -> Il(643669928, var23 ^ 589299307);
                     default -> Il(643669935, var23 ^ 433505514);
                  });
                  var6++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var55 = var39;
                     var10004 = var46;
                  } else {
                     if (var10001 <= var6) {
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
                     l = new IIllIl(IlIIllIII.Ill(var0[1]));
                     I = new IIllIl(IlIIllIII.Ill(var0[2]));
                     II = new IIllIl(IlIIllIII.Ill(var0[0]));
                     lI = II();
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

                  var5 = (var3 = lI(1827658413, var23 ^ 1477545139)).length();
                  var2 = Il(643669920, var23 ^ 1614560470);
                  var25 = -1;
            }

            var10000 = Il(643669927, var23 ^ 1244550273);
            var28 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private IIllIl(IIIlIlIl var3) {
      this.Il = var3;
   }

   private static int Il(int var0, int var1) {
      int var2 = ll[var0 ^ 643669923] ^ var1 ^ var0;
      var2 -= 37368;
      var2 ^= 37373;
      var2 -= 61525;
      var2 ^= 49533;
      var2 ^= 1069;
      var2 -= 29275;
      var2 -= 15909;
      var2 += 4448;
      var2 -= 40047;
      return var2 ^ 60480;
   }

   public IIIlIlIl I() {
      return this.Il;
   }

   public static IIllIl l(String var0) {
      return Enum.valueOf(IIllIl.class, var0);
   }

   private static String lI(int var0, int var1) {
      int var3 = var0 ^ 1827658412;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1362395967;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 148;
            case 1 -> 72;
            case 2 -> 1;
            case 3 -> 130;
            case 4 -> 17;
            case 5 -> 207;
            case 6 -> 4;
            case 7 -> 251;
            case 8 -> 238;
            case 9 -> 222;
            case 10 -> 133;
            case 11 -> 240;
            case 12 -> 238;
            case 13 -> 5;
            case 14 -> 232;
            case 15 -> 58;
            case 16 -> 16;
            case 17 -> 96;
            case 18 -> 166;
            case 19 -> 199;
            case 20 -> 184;
            case 21 -> 128;
            case 22 -> 148;
            case 23 -> 254;
            case 24 -> 112;
            case 25 -> 110;
            case 26 -> 154;
            case 27 -> 48;
            case 28 -> 80;
            case 29 -> 63;
            case 30 -> 98;
            case 31 -> 182;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static IIllIl[] II() {
      return new IIllIl[]{l, I, II};
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }
}
