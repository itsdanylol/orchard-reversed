package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIlIIlI {
   I,
   l,
   lI;
   private static final String[] III;
   private static final int[] ll;
   private final IIIlIlIl II;
   private static final Object[] IIl;
   private static final IlIlIIlI[] Il;

   @Override
   public String toString() {
      return this.II.llIl();
   }

   private static int II(int var0, int var1) {
      int var2 = ll[var0 ^ -1007458169] ^ var1 ^ var0;
      var2 ^= 8614;
      var2 -= 6747;
      var2 ^= 1734;
      var2 ^= 15806;
      var2 += 64563;
      var2 += 33512;
      var2 += 49580;
      return var2 + 47977;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = 1505219178;
      short var13 = 32043;
      char[] var15 = ",\r".toCharArray();
      String var14 = "ꉑꉀꈱ鱗ꊥ鲖鰫ꉴꗭꗑ鲇ꋛ鰓ꉜ鱢鱈ꊡ鲭ꉎ鰞ꈖꗑ鲇ꋛ鰓ꉜ鱢ꈸꊀꋎꉇ鰃ꈂ鱌鳺ꋺ鰁ꉧ鰭ꈗꕋ鲜鰊ꉛ茎ﲶ茪ﳚﶭ莵茠茬ﴐ荳ﶭ莩ﲜ";
      byte var20 = -1;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            III = var16;
            IIl = new Object[var16.length];
            int var9 = 1305534605;
            byte[] var7 = "\u0007a\tZ:\u009c\u00024a»çßm\u0004þ±áz\u000b\u0012e2»]w,\u001a \u0083ù\u008a ûù~:É£\u0082e÷Fq7ìYpB".getBytes("ISO-8859-1");
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

            String[] var0 = new String[II(-1007458169, var24 ^ 789062037)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il('\u175f', '䨋', var24 ^ 1015393489)).length();
            int var2 = II(-1007458170, var24 ^ 318057224);
            int var26 = -1;

            label101:
            while (true) {
               int var29 = II(-1007458171, var24 ^ 1238549900);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label96: {
                     char[] var45 = var10001.toCharArray();
                     int var10004 = var45.length;
                     int var6 = 0;
                     int var48 = var29;
                     var41 = var45;
                     int var35 = var10004;
                     char[] var57;
                     int var10006;
                     if (var10004 <= 1) {
                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     } else {
                        var48 = var29;
                        var35 = var10004;
                        if (var10004 <= var6) {
                           break label96;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(-1007458173, var24 ^ -921492518)) {
                           case 0 -> II(-1007458174, var24 ^ 1297846853);
                           case 1 -> II(-1007458175, var24 ^ 1598372095);
                           case 2 -> II(-1007458176, var24 ^ -1416584307);
                           case 3 -> II(-1007458161, var24 ^ -745513915);
                           case 4 -> II(-1007458162, var24 ^ -506811577);
                           case 5 -> II(-1007458163, var24 ^ -550546626);
                           default -> II(-1007458164, var24 ^ -1003466191);
                        });
                        var6++;
                        if (var48 == 0) {
                           var10006 = var48;
                           var57 = var41;
                           var10004 = var48;
                        } else {
                           if (var35 <= var6) {
                              break;
                           }

                           var57 = var41;
                           var10004 = var48;
                           var10006 = var6;
                        }
                     }
                  }

                  String var50 = new String(var41).intern();
                  switch (var10002) {
                     case 0:
                        var0[var4++] = var50;
                        if ((var26 += var2) >= var5) {
                           l = new IlIlIIlI(IlIIllIII.Ill(var0[5]));
                           I = new IlIlIIlI(IlIIllIII.Ill(var0[0]));
                           lI = new IlIlIIlI(IlIIllIII.Ill(var0[3]));
                           Il = l();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var50;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label101;
                        }

                        var5 = (var3 = Il('\ue355', '䨊', var24 ^ -1414667627)).length();
                        var2 = 4;
                        var26 = -1;
                  }

                  var29 = II(-1007458172, var24 ^ 1164827812);
                  var10001 = var3.substring(++var26, var26 + var2);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 10;
                  case 1 -> 24;
                  case 2 -> 124;
                  case 3 -> 76;
                  case 4 -> 219;
                  case 5 -> 150;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   public static IlIlIIlI I(String var0) {
      return Enum.valueOf(IlIlIIlI.class, var0);
   }

   private IlIlIIlI(IIIlIlIl var3) {
      this.II = var3;
   }

   private static String Il(char var0, char var1, int var2) {
      int var3 = var1 ^ 18955;
      char[] var4 = III[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 23565;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 15054;
         var10 ^= 1655;
         var10 += 33775;
         var10 ^= 39931;
         var10 -= 50757;
         var10 ^= 44751;
         var10 -= 26699;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static IlIlIIlI[] l() {
      return new IlIlIIlI[]{l, I, lI};
   }
}
