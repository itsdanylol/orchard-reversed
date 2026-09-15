package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIIIIlIl {
   lI,
   ll,
   IIl;
   private static final String[] Ill;
   private static final IIIIIlIl[] I;
   private static final Object[] lII;
   private final IIIlIlIl l;
   private final double II;
   private static final int[] IlI;
   private final double Il;
   private final double III;

   public static IIIIIlIl I(String var0) {
      return Enum.valueOf(IIIIIlIl.class, var0);
   }

   private static int ll(int var0, int var1) {
      int var2 = IlI[var0 ^ -1677977435] ^ var1 ^ var0;
      var2 -= 43052;
      var2 += 32617;
      var2 -= 7426;
      var2 ^= 49701;
      var2 -= 11840;
      var2 += 44889;
      var2 ^= 26696;
      var2 -= 36679;
      var2 += 16557;
      return var2 - 40941;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 1831301986;
      int var17 = 0;
      int var16 = 0;
      int var10001 = "\u0018峼䗕巬ס嶈䗚徰䗢忨䗻廔엂岌ע彬藠忠䗐峸엸嵘藸尸䗁\u0011졝岒즽岡좥\udc9a쮱岫쭩岧쨍岗직鲮쫙岪쪍".length();
      String[] var15 = new String[2];
      int var14 = var10001;
      String var13 = "\u0018峼䗕巬ס嶈䗚徰䗢忨䗻廔엂岌ע彬藠忠䗐峸엸嵘藸尸䗁\u0011졝岒즽岡좥\udc9a쮱岫쭩岧쨍岗직鲮쫙岪쪍";
      short var18 = 26949;

      do {
         char var19 = var13.charAt(var17);
         String var10000 = var13.substring(var17 + 1, var17 + 1 + var19);
         int var21 = 0;
         char[] var20 = var10000.toCharArray();

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

      Ill = var15;
      lII = new Object[var15.length];
      int var9 = -549524618;
      byte[] var7 = "r¤è÷\u001ao(ÇK@0mªë\u0085\u0016\u001a\u009e´{ONv\u0086ßXÔ¥{Ý%\u0006\u00045gK\u0019Ê\u0093\u001bK\r¥þÛï^ó".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IlI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IlI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[ll(-1677977435, var23 ^ 1530946824)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = III(-1617179866, var23 ^ 1118510203)).length();
      int var2 = 4;
      int var25 = -1;

      label91:
      while (true) {
         int var27 = ll(-1677977436, var23 ^ 864789881);
         String var29 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label86: {
               char[] var44 = var29.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var27;
               var40 = var44;
               var10001 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var27;
                  var10006 = var6;
               } else {
                  var47 = var27;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label86;
                  }

                  var56 = var44;
                  var10004 = var27;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % ll(-1677977439, var23 ^ 863648131)) {
                     case 0 -> ll(-1677977440, var23 ^ 1722481649);
                     case 1 -> ll(-1677977437, var23 ^ -155428455);
                     case 2 -> ll(-1677977438, var23 ^ 1379511402);
                     case 3 -> ll(-1677977427, var23 ^ 768732718);
                     case 4 -> ll(-1677977428, var23 ^ 808328925);
                     case 5 -> ll(-1677977425, var23 ^ 1659447531);
                     default -> ll(-1677977426, var23 ^ -234106080);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var56 = var40;
                     var10004 = var47;
                     var10006 = var6;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var49;
                  if ((var25 += var2) >= var5) {
                     lI = new IIIIIlIl(IlIIllIII.Ill(var0[4]), 0.88, 0.72, 1.0);
                     IIl = new IIIIIlIl(IlIIllIII.Ill(var0[3]), 0.58, 0.38, 0.72);
                     ll = new IIIIIlIl(IlIIllIII.Ill(var0[5]), 0.24, 0.0, 0.38);
                     I = II();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var49;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label91;
                  }

                  var5 = (var3 = III(-1617179865, var23 ^ 669657066)).length();
                  var2 = ll(-1677977433, var23 ^ 1654963598);
                  var25 = -1;
            }

            var27 = ll(-1677977434, var23 ^ -2096166720);
            var29 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private static String III(int var0, int var1) {
      int var3 = var0 ^ -1617179866;
      char[] var4 = Ill[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])lII[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         lII[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1559203361;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 172;
            case 1 -> 211;
            case 2 -> 174;
            case 3 -> 82;
            case 4 -> 207;
            case 5 -> 241;
            case 6 -> 103;
            case 7 -> 88;
            case 8 -> 59;
            case 9 -> 33;
            case 10 -> 25;
            case 11 -> 156;
            case 12 -> 165;
            case 13 -> 91;
            case 14 -> 26;
            case 15 -> 34;
            case 16 -> 86;
            case 17 -> 183;
            case 18 -> 210;
            case 19 -> 35;
            case 20 -> 164;
            case 21 -> 93;
            case 22 -> 155;
            case 23 -> 227;
            case 24 -> 233;
            case 25 -> 233;
            case 26 -> 229;
            case 27 -> 48;
            case 28 -> 79;
            case 29 -> 201;
            case 30 -> 231;
            case 31 -> 86;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   double l() {
      return this.II;
   }

   private IIIIIlIl(IIIlIlIl var3, double var4, double var6, double var8) {
      this.l = var3;
      this.II = var4;
      this.III = var6;
      this.Il = var8;
   }

   private static IIIIIlIl[] II() {
      return new IIIIIlIl[]{lI, IIl, ll};
   }

   double Il() {
      return this.Il;
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   double lI() {
      return this.III;
   }
}
