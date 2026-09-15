package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum llllllll {
   I,
   II,
   Il;
   private static final llllllll[] l;
   private static final int[] lI;
   private static final String[] ll;
   private static final Object[] III;

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ -1254004697;
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])III[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         III[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1871863912;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 146;
            case 1 -> 194;
            case 2 -> 186;
            case 3 -> 84;
            case 4 -> 211;
            case 5 -> 94;
            case 6 -> 152;
            case 7 -> 3;
            case 8 -> 204;
            case 9 -> 160;
            case 10 -> 138;
            case 11 -> 183;
            case 12 -> 20;
            case 13 -> 153;
            case 14 -> 10;
            case 15 -> 186;
            case 16 -> 53;
            case 17 -> 80;
            case 18 -> 2;
            case 19 -> 193;
            case 20 -> 30;
            case 21 -> 68;
            case 22 -> 31;
            case 23 -> 63;
            case 24 -> 4;
            case 25 -> 158;
            case 26 -> 217;
            case 27 -> 84;
            case 28 -> 57;
            case 29 -> 91;
            case 30 -> 24;
            case 31 -> 174;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ 1298074417] ^ var1 ^ var0;
      var2 += 15815;
      var2 += 11398;
      var2 ^= 2486;
      var2 -= 30832;
      var2 -= 57005;
      var2 ^= 32628;
      return var2 + 4548;
   }

   public static llllllll I(String var0) {
      return Enum.valueOf(llllllll.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 92515117;
      int var11 = 0;
      int var8 = "\u0018⁺ꨤ☚郞ℚ\uda28▊﨨Ⓤ\uea21↪騣Ⳛ먢⮚娢⨚㨩⮪㨠Ⱊ\u0a29⠪먫".length();
      String var7 = "\u0018⁺ꨤ☚郞ℚ\uda28▊﨨Ⓤ\uea21↪騣Ⳛ먢⮚娢⨚㨩⮪㨠Ⱊ\u0a29⠪먫";
      int var10 = 0;
      String[] var10000 = new String[1];
      short var12 = 17201;
      String[] var9 = var10000;

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << '\f') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> '\f') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      byte var19 = 0;
      lI = new int[10];
      int var10001 = 0;
      byte[] var10002 = "GV\u0016\u0001\u0092>\u0090såÜ+ÿþt±µ\f\u0099èí\u0084\u0001QÚo\u0097\u0086k25\u0003\fò\u0099v\u0000W\u009ey\u0010"
         .getBytes("ISO-8859-1");

      int var42;
      do {
         lI[var19] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 763482920;
         var19 += 1;
         var42 = var10001 + 4;
         var10001 += 4;
      } while (var42 < var10002.length);

      String[] var0 = new String[3];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(-1254004697, var17 ^ 136752724)).length();
      int var2 = II(1298074417, var17 ^ 571151006);
      int var1 = -1;

      while (true) {
         label78: {
            int var20 = II(1298074416, var17 ^ -144468878);
            char[] var43 = var3.substring(++var1, var1 + var2).toCharArray();
            int var53 = var43.length;
            int var6 = 0;
            var42 = var20;
            var32 = var43;
            var10001 = var53;
            char[] var62;
            int var69;
            if (var53 <= 1) {
               var62 = var43;
               var53 = var20;
               var69 = var6;
            } else {
               var42 = var20;
               var10001 = var53;
               if (var53 <= var6) {
                  break label78;
               }

               var62 = var43;
               var53 = var20;
               var69 = var6;
            }

            while (true) {
               var62[var69] = (char)(var62[var69] ^ var53 ^ switch (var6 % II(1298074419, var17 ^ -2139017380)) {
                  case 0 -> II(1298074418, var17 ^ -1691765526);
                  case 1 -> II(1298074421, var17 ^ 1774513590);
                  case 2 -> II(1298074420, var17 ^ -514042554);
                  case 3 -> II(1298074423, var17 ^ 181043796);
                  case 4 -> II(1298074422, var17 ^ 1466435480);
                  case 5 -> II(1298074425, var17 ^ -1748733440);
                  default -> II(1298074424, var17 ^ 851672450);
               });
               var6++;
               if (var42 == 0) {
                  var69 = var42;
                  var62 = var32;
                  var53 = var42;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var62 = var32;
                  var53 = var42;
                  var69 = var6;
               }
            }
         }

         String var46 = new String(var32).intern();
         byte var26 = -1;
         var0[var4++] = var46;
         if ((var1 += var2) >= var5) {
            Il = new llllllll();
            II = new llllllll();
            I = new llllllll();
            l = l();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static llllllll[] l() {
      return new llllllll[]{Il, II, I};
   }
}
