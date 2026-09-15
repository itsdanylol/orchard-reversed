package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lIIllIlI {
   l,
   II;

   private static final int[] lI;
   private static final String[] ll;
   private static final lIIllIlI[] I;
   private static final Object[] III;
   private final IIIlIlIl Il;

   private lIIllIlI(IIIlIlIl var3) {
      this.Il = var3;
   }

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ -1918362971] ^ var1 ^ var0;
      var2 ^= 3389;
      var2 -= 31310;
      var2 += 26479;
      var2 ^= 64357;
      var2 -= 53801;
      var2 += 57521;
      var2 ^= 56492;
      var2 += 57077;
      var2 ^= 38523;
      return var2 + 34121;
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -569544695;
      short var12 = 29433;
      int var8 = "\u000fᢞトḥ倨᳂냿ᩆす᳕\uf03bΏ\uf00bᶬ킏Ḿ\u000f넌頻뛟\uda88땸멝년\u1af2랷骖뚹窬됾﨡땜".length();
      int var11 = 0;
      String var7 = "\u000fᢞトḥ倨᳂냿ᩆす᳕\uf03bΏ\uf00bᶬ킏Ḿ\u000f넌頻뛟\uda88땸멝년\u1af2랷骖뚹窬됾﨡땜";
      int var10 = 0;
      String[] var9 = new String[2];

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 34;
               case 1 -> 177;
               case 2 -> 73;
               case 3 -> 95;
               case 4 -> 110;
               case 5 -> 144;
               case 6 -> 234;
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

      ll = var9;
      III = new Object[var9.length];
      int var21 = 0;
      lI = new int[12];
      int var10001 = 0;
      byte[] var10002 = "iá\u000b\u0091\u0080-È\u0093\u007f\u001f×«\u0080¸ÕNK>z\u0003¬þ\u0091\u0019\u0080cj£\u0084SªÝ\u0005´êR1Æ!JÌõ\t\u001c¸\u0095ýh"
         .getBytes("ISO-8859-1");

      int var54;
      do {
         lI[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1618408946;
         var21 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(-1267892936, var17 ^ -104046971)).length();
      int var2 = l(-1918362971, var17 ^ 1513237089);
      int var19 = -1;

      label105:
      while (true) {
         var21 = l(-1918362972, var17 ^ -1275139678);
         String var26 = var3.substring(++var19, var19 + var2);
         byte var38 = -1;

         while (true) {
            label100: {
               char[] var56 = var26.toCharArray();
               int var68 = var56.length;
               int var6 = 0;
               var54 = var21;
               var43 = var56;
               var10001 = var68;
               char[] var80;
               int var87;
               if (var68 <= 1) {
                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               } else {
                  var54 = var21;
                  var10001 = var68;
                  if (var68 <= var6) {
                     break label100;
                  }

                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % l(-1918362975, var17 ^ 2028821480)) {
                     case 0 -> l(-1918362976, var17 ^ -1624396151);
                     case 1 -> l(-1918362973, var17 ^ -1280291950);
                     case 2 -> l(-1918362974, var17 ^ -1216309932);
                     case 3 -> l(-1918362963, var17 ^ 912771852);
                     case 4 -> l(-1918362964, var17 ^ 34932607);
                     case 5 -> l(-1918362961, var17 ^ -14276536);
                     default -> l(-1918362962, var17 ^ -1958290280);
                  });
                  var6++;
                  if (var54 == 0) {
                     var87 = var54;
                     var80 = var43;
                     var68 = var54;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var80 = var43;
                     var68 = var54;
                     var87 = var6;
                  }
               }
            }

            String var61 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var0[var4++] = var61;
                  if ((var19 += var2) >= var5) {
                     l = new lIIllIlI(IlIIllIII.Ill(var0[1]));
                     II = new lIIllIlI(IlIIllIII.Ill(var0[2]));
                     I = I();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var61;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label105;
                  }

                  var5 = (var3 = II(-1267892935, var17 ^ -1393922669)).length();
                  var2 = l(-1918362969, var17 ^ 1288500907);
                  var19 = -1;
            }

            var21 = l(-1918362970, var17 ^ -1284773168);
            var26 = var3.substring(++var19, var19 + var2);
            var38 = 0;
         }
      }
   }

   private static String II(int var0, int var1) {
      int var3 = var0 ^ -1267892936;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2078158003;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 32;
            case 1 -> 134;
            case 2 -> 228;
            case 3 -> 210;
            case 4 -> 168;
            case 5 -> 60;
            case 6 -> 34;
            case 7 -> 204;
            case 8 -> 191;
            case 9 -> 195;
            case 10 -> 128;
            case 11 -> 49;
            case 12 -> 224;
            case 13 -> 120;
            case 14 -> 227;
            case 15 -> 60;
            case 16 -> 54;
            case 17 -> 24;
            case 18 -> 165;
            case 19 -> 196;
            case 20 -> 246;
            case 21 -> 239;
            case 22 -> 137;
            case 23 -> 125;
            case 24 -> 205;
            case 25 -> 23;
            case 26 -> 194;
            case 27 -> 168;
            case 28 -> 25;
            case 29 -> 216;
            case 30 -> 64;
            case 31 -> 137;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static lIIllIlI[] I() {
      return new lIIllIlI[]{l, II};
   }
}
