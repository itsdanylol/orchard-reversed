package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIIllIlI {
   I,
   II;

   private static final IlIIllIlI[] l;
   private static final Object[] III;
   private static final int[] lI;
   private final IIIlIlIl Il;
   private static final String[] ll;

   public static IlIIllIlI I(String var0) {
      return Enum.valueOf(IlIIllIlI.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = -2063049545;
      char[] var15 = "شش".toCharArray();
      String var14 = "\uf20f\uf247\uf2f0\uf2b1\uf296\uf2a0\uf2f0\uf27e\uf29a\uf2e7\uf2d0\uf209\uf264\uf2fd\uf231샎삝쀲쁥쁅쁤쀶삧쀹쁌쀁샔삻쁵삔";
      byte var20 = -1;
      short var13 = 1595;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            ll = var16;
            III = new Object[var16.length];
            int var9 = -2059659113;
            byte[] var7 = "\u009eÙ\u001bÑ\u0007êå6\b\u0018\u000fòÒ1v\u0099\u0088Íy`v¨Å\u001386LZ\u0016RÜkSÚ\u008e£NóÖÍúöõ@".getBytes("ISO-8859-1");
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
            int var5 = (var3 = Il(6619, -156737656, 4433, -861723659, 2)).length();
            int var2 = II(-1766909032, var24 ^ -138564580);
            int var26 = -1;

            label100:
            while (true) {
               int var29 = II(-1766909031, var24 ^ 1854823806);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label95: {
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
                           break label95;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(-1766909028, var24 ^ -508965298)) {
                           case 0 -> II(-1766909027, var24 ^ 533495135);
                           case 1 -> 1;
                           case 2 -> II(-1766909026, var24 ^ 1364390922);
                           case 3 -> II(-1766909025, var24 ^ 2134271033);
                           case 4 -> II(-1766909040, var24 ^ 985544282);
                           case 5 -> II(-1766909039, var24 ^ 664232434);
                           default -> II(-1766909038, var24 ^ -1819131162);
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
                           I = new IlIIllIlI(IlIIllIII.Ill(var0[3]));
                           II = new IlIIllIlI(IlIIllIII.Ill(var0[1]));
                           l = l();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var50;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label100;
                        }

                        var5 = (var3 = Il((short)-21434, -997599667, (short)-8066, -861723660, (byte)-78)).length();
                        var2 = II(-1766909030, var24 ^ 1635563581);
                        var26 = -1;
                  }

                  var29 = II(-1766909029, var24 ^ -1152004507);
                  var10001 = var3.substring(++var26, var26 + var2);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 9;
                  case 1 -> 179;
                  case 2 -> 65;
                  case 3 -> 83;
                  case 4 -> 225;
                  case 5 -> 232;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static String Il(short var0, int var1, short var2, int var3, byte var4) {
      int var9 = var3 ^ -861723659;
      char[] var8 = ll[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])III[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         III[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 18279;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ var7 ^ switch (var7 % 18) {
            default -> 230;
            case 1 -> 63;
            case 2 -> 78;
            case 3 -> 6;
            case 4 -> 132;
            case 5 -> 142;
            case 6 -> 89;
            case 7 -> 21;
            case 8 -> 99;
            case 9 -> 35;
            case 10 -> 200;
            case 11 -> 49;
            case 12 -> 188;
            case 13 -> 194;
            case 14 -> 148;
            case 15 -> 31;
            case 16 -> 68;
            case 17 -> 103;
         } ^ var0 ^ var4 ^ var3 ^ var2 ^ var6 ^ var1);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   private static IlIIllIlI[] l() {
      return new IlIIllIlI[]{I, II};
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ -1766909032] ^ var1 ^ var0;
      var2 += 28079;
      var2 -= 62026;
      var2 ^= 19370;
      var2 -= 9407;
      var2 += 10632;
      var2 ^= 64913;
      var2 ^= 22153;
      var2 ^= 42830;
      var2 -= 6754;
      return var2 + 63737;
   }

   private IlIIllIlI(IIIlIlIl var3) {
      this.Il = var3;
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }
}
