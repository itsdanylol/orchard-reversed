package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIIllIIl {
   I,
   II;

   private static final int[] lI;
   private static final String[] ll;
   private static final Object[] III;
   private static final IlIIllIIl[] l;
   private final IIIlIlIl Il;

   private static String Il(int var0, byte var1, byte var2, char var3, int var4, int var5) {
      int var10 = var0 ^ -703367620;
      char[] var9 = ll[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])III[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         III[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 59988;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 10) {
            default -> 128;
            case 1 -> 181;
            case 2 -> 153;
            case 3 -> 128;
            case 4 -> 32;
            case 5 -> 27;
            case 6 -> 227;
            case 7 -> 73;
            case 8 -> 111;
            case 9 -> 114;
         } ^ var8 ^ 38431 ^ var0 ^ var1 ^ var3 ^ var4 ^ var7 ^ var5 ^ var2);
      }

      return new String(var9).intern();
   }

   private static IlIIllIIl[] I() {
      return new IlIIllIIl[]{II, I};
   }

   private IlIIllIIl(IIIlIlIl var3) {
      this.Il = var3;
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ -513626878] ^ var1 ^ var0;
      var2 -= 40071;
      var2 += 11576;
      var2 += 52046;
      var2 -= 16856;
      var2 ^= 39201;
      var2 += 14654;
      var2 -= 38465;
      return var2 + 58890;
   }

   public static IlIIllIIl l(String var0) {
      return Enum.valueOf(IlIIllIIl.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = -1728467200;
      String var8 = "汽沗氧汷沛沯汮氅泸泼氆汻氓泣沒沴民⟇✒➳⟮✶✲⟡⟫❩❣➿⟓⟾";
      char[] var9 = "\u0011\r".toCharArray();
      short var7 = 30378;
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            ll = var10;
            III = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            lI = new int[12];
            byte[] var10002 = "\u0098\u0086µ\f\u009cU)@ÆÿÇGø\u008e}vzý\u0015÷úÃ!ø\"\u0019\u0013Â·\u0093¾Ç\u0086ß;\u000fñ{(éKÌ¹{±\u000f&,"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               lI[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1515867671;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il(-703367620, (byte)-38, (byte)112, (char)'葷', -1637295240, -722308789)).length();
            int var2 = II(-513626878, var18 ^ -1152920290);
            int var20 = -1;

            label104:
            while (true) {
               var22 = II(-513626877, var18 ^ -1080799554);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var39 = -1;

               while (true) {
                  label99: {
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
                           break label99;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % II(-513626874, var18 ^ 1497134562)) {
                           case 0 -> II(-513626873, var18 ^ -654162423);
                           case 1 -> II(-513626876, var18 ^ 30962699);
                           case 2 -> II(-513626875, var18 ^ -1806509802);
                           case 3 -> II(-513626870, var18 ^ -1524737275);
                           case 4 -> II(-513626869, var18 ^ -759542011);
                           case 5 -> II(-513626872, var18 ^ 1745739475);
                           default -> II(-513626871, var18 ^ -1831976575);
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
                           II = new IlIIllIIl(IlIIllIII.Ill(var0[0]));
                           I = new IlIIllIIl(IlIIllIII.Ill(var0[1]));
                           l = I();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var62;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label104;
                        }

                        var5 = (var3 = Il(-703367619, (byte)-8, (byte)80, (char)'욕', -1631941447, -452513873)).length();
                        var2 = II(-513626880, var18 ^ -448880359);
                        var20 = -1;
                  }

                  var22 = II(-513626879, var18 ^ -615572794);
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
                  default -> 201;
                  case 1 -> 54;
                  case 2 -> 152;
                  case 3 -> 182;
                  case 4 -> 230;
                  case 5 -> 150;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }
}
