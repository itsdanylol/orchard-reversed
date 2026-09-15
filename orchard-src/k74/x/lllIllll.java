package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lllIllll {
   l,
   Il;
   private static final lllIllll[] I;
   private final IIIlIlIl II;
   private static final int[] lI;
   private static final String[] ll;
   private static final Object[] III;

   private lllIllll(IIIlIlIl var3) {
      this.II = var3;
   }

   private static lllIllll[] I() {
      return new lllIllll[]{l, Il};
   }

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ -1669469337;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1441538770;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 134;
            case 1 -> 142;
            case 2 -> 119;
            case 3 -> 225;
            case 4 -> 203;
            case 5 -> 206;
            case 6 -> 118;
            case 7 -> 163;
            case 8 -> 56;
            case 9 -> 157;
            case 10 -> 13;
            case 11 -> 82;
            case 12 -> 89;
            case 13 -> 73;
            case 14 -> 240;
            case 15 -> 206;
            case 16 -> 173;
            case 17 -> 75;
            case 18 -> 197;
            case 19 -> 253;
            case 20 -> 223;
            case 21 -> 92;
            case 22 -> 221;
            case 23 -> 174;
            case 24 -> 3;
            case 25 -> 141;
            case 26 -> 193;
            case 27 -> 32;
            case 28 -> 235;
            case 29 -> 164;
            case 30 -> 78;
            case 31 -> 100;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.II.llIl();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = 1323935168;
      char[] var9 = "\u000f\u000f".toCharArray();
      short var7 = 22559;
      String var8 = "㺰㺬㸓㻁㸻㻕㸚㻧㹐㺷㻞㹛㹖㹃㻥ⱵⱲⲎⰷ⳪ⰶⳀⰨ⳧ⰷⱿⲎⳭⲁⱱ";
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            ll = var10;
            III = new Object[var10.length];
            lI = new int[11];
            int var22 = 0;
            int var10001 = 0;
            byte[] var10002 = "W3\u00844èâP±\u009cæ\"\u001c\u009b¥\u0087¦\u0000A\u0099AUûIwÔÓ\u0002À\u008aSä'\u0084]í¨£pÂ¸{&*9".getBytes("ISO-8859-1");

            int var55;
            do {
               lI[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -14009545;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il(-1669469337, var18 ^ 2022487950)).length();
            int var2 = II(184694616, var18 ^ 302890086);
            int var20 = -1;

            label99:
            while (true) {
               var22 = II(184694617, var18 ^ -1378064170);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var39 = -1;

               while (true) {
                  label94: {
                     char[] var57 = var27.toCharArray();
                     int var69 = var57.length;
                     int var6 = 0;
                     var55 = var22;
                     var44 = var57;
                     var10001 = var69;
                     char[] var81;
                     int var88;
                     if (var69 <= 1) {
                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     } else {
                        var55 = var22;
                        var10001 = var69;
                        if (var69 <= var6) {
                           break label94;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % II(184694619, var18 ^ -560219332)) {
                           case 0 -> II(184694620, var18 ^ 1165993436);
                           case 1 -> II(184694621, var18 ^ 281375079);
                           case 2 -> II(184694622, var18 ^ -1846723881);
                           case 3 -> II(184694623, var18 ^ -814883724);
                           case 4 -> II(184694608, var18 ^ -1050421791);
                           case 5 -> II(184694609, var18 ^ -431031569);
                           default -> II(184694610, var18 ^ 1041764977);
                        });
                        var6++;
                        if (var55 == 0) {
                           var88 = var55;
                           var81 = var44;
                           var69 = var55;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var81 = var44;
                           var69 = var55;
                           var88 = var6;
                        }
                     }
                  }

                  String var62 = new String(var44).intern();
                  switch (var39) {
                     case 0:
                        var0[var4++] = var62;
                        if ((var20 += var2) >= var5) {
                           l = new lllIllll(IlIIllIII.Ill(var0[3]));
                           Il = new lllIllll(IlIIllIII.Ill(var0[0]));
                           I = I();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var62;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label99;
                        }

                        var5 = (var3 = Il(-1669469338, var18 ^ 1778574898)).length();
                        var2 = II(184694618, var18 ^ -640147834);
                        var20 = -1;
                  }

                  var22 = 4;
                  var27 = var3.substring(++var20, var20 + var2);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 237;
                  case 1 -> 175;
                  case 2 -> 179;
                  case 3 -> 198;
                  case 4 -> 104;
                  case 5 -> 191;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ 184694616] ^ var1 ^ var0;
      var2 += 41167;
      var2 -= 35433;
      var2 ^= 45665;
      var2 += 62558;
      var2 -= 16940;
      var2 += 19316;
      var2 += 20210;
      return var2 ^ 26258;
   }

   public static lllIllll l(String var0) {
      return Enum.valueOf(lllIllll.class, var0);
   }
}
