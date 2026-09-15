package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lIlllIlI {
   l,
   Il,
   lI,
   ll,
   IIl;
   private static final lIlllIlI[] I;
   private static final Object[] lII;
   private final int II;
   private final boolean III;
   private static final String[] Ill;
   private static final int[] IlI;

   private static int II(int var0, int var1) {
      int var2 = IlI[var0 ^ -1184192879] ^ var1 ^ var0;
      var2 -= 50232;
      var2 -= 40148;
      var2 ^= 712;
      var2 ^= 38937;
      var2 -= 39438;
      var2 ^= 45579;
      return var2 + 64720;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 1824587050;
      int var16 = 0;
      int var10001 = "\u0013콀馒훨⦾퉎㧡쟓燴튁ᅹ퍭凾푔ℤ썀즐팈榻\ud86e\u0015᪲\ue527º洋ќ쵕ὡ畀ȳ緎ѿ鵋દඑၒ\ued24ź\ue50d\u0e3c\udd55ᡡ".length();
      int var17 = 0;
      short var18 = 6993;
      String[] var15 = new String[2];
      int var14 = var10001;
      String var13 = "\u0013콀馒훨⦾퉎㧡쟓燴튁ᅹ퍭凾푔ℤ썀즐팈榻\ud86e\u0015᪲\ue527º洋ќ쵕ὡ畀ȳ緎ѿ鵋દඑၒ\ued24ź\ue50d\u0e3c\udd55ᡡ";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 70;
               case 1 -> 39;
               case 2 -> 206;
               case 3 -> 11;
               case 4 -> 72;
               case 5 -> 82;
               case 6 -> 149;
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

      Ill = var15;
      lII = new Object[var15.length];
      int var9 = -817041323;
      byte[] var7 = "*ªµïÓHßÕàÍ00ï\u001cÁ\u000f§\u0014v½í1J\fb\u0019ÐsÛ\u009e7õ¿Ñä\u0089±`\u008a\u00919*8ã".getBytes("ISO-8859-1");
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

      String[] var0 = new String[5];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(-1296126433, var23 ^ 2088893071)).length();
      int var2 = 5;
      int var25 = -1;

      label100:
      while (true) {
         int var28 = II(-1184192879, var23 ^ 810429521);
         String var30 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label95: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var28;
               var41 = var45;
               var10001 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var48 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label95;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(-1184192878, var23 ^ -168273851)) {
                     case 0 -> II(-1184192875, var23 ^ -1108283636);
                     case 1 -> II(-1184192876, var23 ^ -136981627);
                     case 2 -> II(-1184192873, var23 ^ 2029865238);
                     case 3 -> II(-1184192874, var23 ^ -1048924450);
                     case 4 -> II(-1184192871, var23 ^ -1523221194);
                     case 5 -> II(-1184192872, var23 ^ -1417407508);
                     default -> II(-1184192869, var23 ^ 600744350);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var10001 <= var6) {
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
                  if ((var25 += var2) >= var5) {
                     IIl = new lIlllIlI(0, true);
                     ll = new lIlllIlI(1, true);
                     Il = new lIlllIlI(2, true);
                     lI = new lIlllIlI(3, false);
                     l = new lIlllIlI(4, false);
                     I = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var50;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label100;
                  }

                  var5 = (var3 = Il(-1296126434, var23 ^ -369034388)).length();
                  var2 = II(-1184192880, var23 ^ -911456602);
                  var25 = -1;
            }

            var28 = II(-1184192877, var23 ^ -97932891);
            var30 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ -1296126433;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 650802504;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 128;
            case 1 -> 121;
            case 2 -> 32;
            case 3 -> 12;
            case 4 -> 81;
            case 5 -> 249;
            case 6 -> 215;
            case 7 -> 153;
            case 8 -> 6;
            case 9 -> 72;
            case 10 -> 91;
            case 11 -> 86;
            case 12 -> 78;
            case 13 -> 244;
            case 14 -> 136;
            case 15 -> 88;
            case 16 -> 64;
            case 17 -> 165;
            case 18 -> 64;
            case 19 -> 251;
            case 20 -> 174;
            case 21 -> 12;
            case 22 -> 30;
            case 23 -> 136;
            case 24 -> 14;
            case 25 -> 56;
            case 26 -> 89;
            case 27 -> 2;
            case 28 -> 145;
            case 29 -> 204;
            case 30 -> 133;
            case 31 -> 21;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static lIlllIlI[] I() {
      return new lIlllIlI[]{IIl, ll, Il, lI, l};
   }

   private lIlllIlI(int var3, boolean var4) {
      this.II = var3;
      this.III = var4;
   }

   public static lIlllIlI l(String var0) {
      return Enum.valueOf(lIlllIlI.class, var0);
   }
}
