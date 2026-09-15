package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum Illllll {
   l,
   Il;
   private static final Object[] III;
   private static final Illllll[] I;
   private static final String[] ll;
   private final IIIlIlIl II;
   private static final int[] lI;

   @Override
   public String toString() {
      return this.II.llIl();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 380803442;
      int var10001 = "\u0010湥⌢悍玙琅歔獨댶洐뭾暩ፔ縥诞箥䬡\u0011ퟘ屍\udbd0퓷촘\u243a엕둛\uddadⰒ\ud954氺져벱쐘ⱏ\udb50".length();
      int var16 = 0;
      int var14 = var10001;
      int var17 = 0;
      String[] var15 = new String[2];
      String var13 = "\u0010湥⌢悍玙琅歔獨댶洐뭾暩ፔ縥诞箥䬡\u0011ퟘ屍\udbd0퓷촘\u243a엕둛\uddadⰒ\ud954氺져벱쐘ⱏ\udb50";
      short var18 = 28970;

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 171;
               case 1 -> 190;
               case 2 -> 227;
               case 3 -> 7;
               case 4 -> 203;
               case 5 -> 203;
               case 6 -> 70;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      ll = var15;
      III = new Object[var15.length];
      int var9 = -263845865;
      byte[] var7 = "Ì\n\bå¨\u000b\u0088¥hÜÝ8\u0092bñé²\u008b>\u0006\t;\u0096\u0082\u0010\u0088\u0017ôgÊl÷0ÒÌ\u001f§\u0099ö'ø«_ßàÈ9\u0085"
         .getBytes("ISO-8859-1");
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

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(-1638204251, var23 ^ 1263128759)).length();
      int var2 = l(1569507380, var23 ^ -2004078255);
      int var25 = -1;

      label101:
      while (true) {
         int var28 = l(1569507381, var23 ^ -326259828);
         String var31 = var3.substring(++var25, var25 + var2);
         byte var38 = -1;

         while (true) {
            label96: {
               char[] var47 = var31.toCharArray();
               int var10004 = var47.length;
               int var6 = 0;
               int var50 = var28;
               var43 = var47;
               var10001 = var10004;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var47;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var50 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label96;
                  }

                  var59 = var47;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var59[var10006] = (char)(var59[var10006] ^ var10004 ^ switch (var6 % l(1569507376, var23 ^ -166918217)) {
                     case 0 -> l(1569507377, var23 ^ 1304278268);
                     case 1 -> l(1569507378, var23 ^ 1410217162);
                     case 2 -> l(1569507379, var23 ^ 592203292);
                     case 3 -> l(1569507388, var23 ^ 1951723104);
                     case 4 -> l(1569507389, var23 ^ -484454604);
                     case 5 -> l(1569507390, var23 ^ -1137869552);
                     default -> l(1569507391, var23 ^ -1538385232);
                  });
                  var6++;
                  if (var50 == 0) {
                     var10006 = var50;
                     var59 = var43;
                     var10004 = var50;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var59 = var43;
                     var10004 = var50;
                     var10006 = var6;
                  }
               }
            }

            String var52 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var0[var4++] = var52;
                  if ((var25 += var2) >= var5) {
                     Il = new Illllll(IlIIllIII.Ill(var0[2]));
                     l = new Illllll(IlIIllIII.Ill(var0[0]));
                     I = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var52;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label101;
                  }

                  var5 = (var3 = II(-1638204252, var23 ^ -1494177674)).length();
                  var2 = l(1569507382, var23 ^ 744154234);
                  var25 = -1;
            }

            var28 = l(1569507383, var23 ^ -689649425);
            var31 = var3.substring(++var25, var25 + var2);
            var38 = 0;
         }
      }
   }

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ 1569507380] ^ var1 ^ var0;
      var2 ^= 44164;
      var2 += 29808;
      var2 += 16805;
      var2 += 49049;
      var2 ^= 51802;
      var2 -= 33901;
      var2 -= 43051;
      var2 ^= 5984;
      return var2 + 45867;
   }

   private Illllll(IIIlIlIl var3) {
      this.II = var3;
   }

   private static String II(int var0, int var1) {
      int var3 = var0 ^ -1638204251;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -647911148;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 187;
            case 1 -> 29;
            case 2 -> 183;
            case 3 -> 40;
            case 4 -> 85;
            case 5 -> 121;
            case 6 -> 80;
            case 7 -> 48;
            case 8 -> 140;
            case 9 -> 92;
            case 10 -> 130;
            case 11 -> 66;
            case 12 -> 28;
            case 13 -> 192;
            case 14 -> 76;
            case 15 -> 81;
            case 16 -> 228;
            case 17 -> 49;
            case 18 -> 210;
            case 19 -> 52;
            case 20 -> 179;
            case 21 -> 219;
            case 22 -> 119;
            case 23 -> 98;
            case 24 -> 122;
            case 25 -> 251;
            case 26 -> 126;
            case 27 -> 76;
            case 28 -> 226;
            case 29 -> 26;
            case 30 -> 43;
            case 31 -> 163;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static Illllll[] I() {
      return new Illllll[]{Il, l};
   }
}
