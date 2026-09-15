package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lIIlIIIl {
   I,
   l,
   II,
   ll;
   private static final Object[] IlI;
   private static final String[] IIl;
   private static final int[] III;
   private final IIIlIlIl Il;
   private static final lIIlIIIl[] lI;

   private static lIIlIIIl[] I() {
      return new lIIlIIIl[]{ll, l, II, I};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 989502484;
      String[] var10002 = new String[2];
      int var17 = 0;
      String[] var15 = var10002;
      int var10001 = "2綞솜緽\ue197篋\ue136篒䇰繾懋碾膐繽䆏箛ℶ笺쇭紾臊簶膒禽\ue185篳ℨ繲懻筆⇅罞䆂砝䆀砫ꄿ緊Ǳ綮Ǐ竮膈筅憚經愭砲懵籮䇑\u0010\uf8fe授\uf8ed쎆ﰫ挤ﺪ쏮冷쏛ﳞ䎊\uf895掗﹋茣".length();
      int var16 = 0;
      int var14 = var10001;
      String var13 = "2綞솜緽\ue197篋\ue136篒䇰繾懋碾膐繽䆏箛ℶ笺쇭紾臊簶膒禽\ue185篳ℨ繲懻筆⇅罞䆂砝䆀砫ꄿ緊Ǳ綮Ǐ竮膈筅憚經愭砲懵籮䇑\u0010\uf8fe授\uf8ed쎆ﰫ挤ﺪ쏮冷쏛ﳞ䎊\uf895掗﹋茣";
      short var18 = 22089;

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var38 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var38 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 214;
               case 1 -> 98;
               case 2 -> 13;
               case 3 -> 102;
               case 4 -> 51;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIl = var15;
      IlI = new Object[var15.length];
      int var9 = -1716311446;
      byte[] var7 = "·Övû\u001exâhK.Í¨h B\u0016\u009a\r|4\nnºN\u0087Óy\u008e\u0082\u009e\u008b)\u0017 §5.\r\u00adiBi¡ø+'þz\\\u0081áwTs(¤"
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

      String[] var0 = new String[II(-2105705394, var23 ^ -1763545006)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il((byte)126, 377011224, (byte)-120, (char)'釆', 828833193)).length();
      int var2 = 4;
      int var25 = -1;

      label99:
      while (true) {
         int var28 = II(-2105705393, var23 ^ 1062004555);
         String var31 = var3.substring(++var25, var25 + var2);
         byte var39 = -1;

         while (true) {
            label94: {
               char[] var48 = var31.toCharArray();
               int var10004 = var48.length;
               int var6 = 0;
               int var51 = var28;
               var44 = var48;
               var10001 = var10004;
               char[] var60;
               int var10006;
               if (var10004 <= 1) {
                  var60 = var48;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var51 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label94;
                  }

                  var60 = var48;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var60[var10006] = (char)(var60[var10006] ^ var10004 ^ switch (var6 % II(-2105705398, var23 ^ -1153860966)) {
                     case 0 -> II(-2105705397, var23 ^ 727366911);
                     case 1 -> II(-2105705400, var23 ^ -1494778747);
                     case 2 -> II(-2105705399, var23 ^ -1549103721);
                     case 3 -> II(-2105705402, var23 ^ 907321932);
                     case 4 -> II(-2105705401, var23 ^ 255436830);
                     case 5 -> II(-2105705404, var23 ^ 1667081401);
                     default -> II(-2105705403, var23 ^ 169081647);
                  });
                  var6++;
                  if (var51 == 0) {
                     var10006 = var51;
                     var60 = var44;
                     var10004 = var51;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var60 = var44;
                     var10004 = var51;
                     var10006 = var6;
                  }
               }
            }

            String var53 = new String(var44).intern();
            switch (var39) {
               case 0:
                  var0[var4++] = var53;
                  if ((var25 += var2) >= var5) {
                     ll = new lIIlIIIl(IlIIllIII.Ill(var0[0]));
                     l = new lIIlIIIl(IlIIllIII.Ill(var0[1]));
                     II = new lIIlIIIl(IlIIllIII.Ill(var0[3]));
                     I = new lIIlIIIl(IlIIllIII.Ill(var0[2]));
                     lI = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var53;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label99;
                  }

                  var5 = (var3 = Il(67, 189200883, 35, 15177, 828833192)).length();
                  var2 = II(-2105705396, var23 ^ 1780140800);
                  var25 = -1;
            }

            var28 = II(-2105705395, var23 ^ 1234453673);
            var31 = var3.substring(++var25, var25 + var2);
            var39 = 0;
         }
      }
   }

   private lIIlIIIl(IIIlIlIl var3) {
      this.Il = var3;
   }

   private static String Il(byte var0, int var1, byte var2, char var3, int var4) {
      int var9 = var4 ^ 828833193;
      char[] var8 = IIl[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])IlI[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         IlI[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 29473;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ switch (var7 % 18) {
            default -> 94;
            case 1 -> 110;
            case 2 -> 94;
            case 3 -> 16;
            case 4 -> 128;
            case 5 -> 243;
            case 6 -> 171;
            case 7 -> 22;
            case 8 -> 125;
            case 9 -> 118;
            case 10 -> 223;
            case 11 -> 83;
            case 12 -> 10;
            case 13 -> 240;
            case 14 -> 160;
            case 15 -> 224;
            case 16 -> 137;
            case 17 -> 249;
         } ^ var0 ^ var3 ^ var6 ^ var4 ^ var1 ^ var2);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   private static int II(int var0, int var1) {
      int var2 = III[var0 ^ -2105705394] ^ var1 ^ var0;
      var2 ^= 41992;
      var2 ^= 13695;
      var2 -= 37753;
      var2 += 29516;
      var2 -= 48441;
      var2 += 40399;
      var2 -= 33549;
      return var2 + 25790;
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }

   public static lIIlIIIl l(String var0) {
      return Enum.valueOf(lIIlIIIl.class, var0);
   }
}
