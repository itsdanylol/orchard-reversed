package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum llIllIl {
   I,
   l,
   II;

   private static final Object[] III;
   private static final int[] lI;
   private static final llIllIl[] Il;
   private static final String[] ll;

   private static llIllIl[] I() {
      return new llIllIl[]{l, II, I};
   }

   private static String Il(char var0, int var1, int var2) {
      int var3 = var1 ^ 57088;
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])III[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         III[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 23284;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '멮';
         var10 -= 43638;
         var10 -= 40921;
         var10 += 42399;
         var10 += 6787;
         var10 += 54147;
         var10 += 63893;
         var10 += 11221;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = 676796097;
      short var13 = 16314;
      byte var20 = -1;
      char[] var15 = "\u0013".toCharArray();
      String var14 = "㰌㲃㱆㳛㰵㲋㰽㲮㲖㰇㳌㰒㰖㲏㲗㰽㳞㰒㰖";
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            ll = var16;
            III = new Object[var16.length];
            int var9 = -780089784;
            byte[] var7 = "\u000f#\\P*I¤éÄ§hãrâ%Ø\u0087T\u008d\u0092Ï\u0081Ì¨£\u0000m \u00ad\t\u0012\u0015\u001fè\"\fºW¢S".getBytes("ISO-8859-1");
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

            String[] var0 = new String[3];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il('䘸', 57088, var24 ^ -1132134123)).length();
            int var2 = II(-1278710360, var24 ^ 1161591267);
            int var1 = -1;

            while (true) {
               char[] var10002;
               label84: {
                  int var28 = II(-1278710359, var24 ^ 1616282102);
                  char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
                  int var10004 = var10003.length;
                  int var6 = 0;
                  int var34 = var28;
                  var10002 = var10003;
                  int var29 = var10004;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var10004 = var28;
                     var10006 = var6;
                  } else {
                     var34 = var28;
                     var29 = var10004;
                     if (var10004 <= var6) {
                        break label84;
                     }

                     var10005 = var10003;
                     var10004 = var28;
                     var10006 = var6;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % II(-1278710358, var24 ^ -1900524101)) {
                        case 0 -> II(-1278710357, var24 ^ 956104877);
                        case 1 -> II(-1278710356, var24 ^ -850679605);
                        case 2 -> II(-1278710355, var24 ^ -2053183012);
                        case 3 -> II(-1278710354, var24 ^ -383825787);
                        case 4 -> II(-1278710353, var24 ^ -417974436);
                        case 5 -> II(-1278710368, var24 ^ 1442252575);
                        default -> II(-1278710367, var24 ^ -263682267);
                     });
                     var6++;
                     if (var34 == 0) {
                        var10006 = var34;
                        var10005 = var10002;
                        var10004 = var34;
                     } else {
                        if (var29 <= var6) {
                           break;
                        }

                        var10005 = var10002;
                        var10004 = var34;
                        var10006 = var6;
                     }
                  }
               }

               String var36 = new String(var10002).intern();
               byte var31 = -1;
               var0[var4++] = var36;
               if ((var1 += var2) >= var5) {
                  l = new llIllIl();
                  II = new llIllIl();
                  I = new llIllIl();
                  Il = I();
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 46;
                  case 1 -> 177;
                  case 2 -> 81;
                  case 3 -> 29;
                  case 4 -> 10;
                  case 5 -> 11;
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
      int var2 = lI[var0 ^ -1278710360] ^ var1 ^ var0;
      var2 -= 13359;
      var2 -= 35472;
      var2 += 44697;
      var2 ^= 37826;
      var2 ^= 64305;
      var2 -= 37915;
      return var2 ^ 19596;
   }

   public static llIllIl l(String var0) {
      return Enum.valueOf(llIllIl.class, var0);
   }
}
