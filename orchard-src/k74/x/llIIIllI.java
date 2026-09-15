package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum llIIIllI {
   II,
   Il;
   private final IIIlIlIl I;
   private static final llIIIllI[] l;
   private static final int[] lI;
   private static final Object[] III;
   private static final String[] ll;

   private static llIIIllI[] I() {
      return new llIIIllI[]{Il, II};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -743200133;
      short var12 = 14417;
      String[] var9 = new String[2];
      int var10 = 0;
      int var10001 = "\n騽\ue96c阓ꥷ馬鄝餽륬靳\u1977\u0011\ue88f深\ue041\uedea\ue87e떂\ue48f䷱\ue1a1巨\ue7de\ue581\ue2cf淳\ue3a1ᷫ\ue39e".length();
      int var11 = 0;
      int var8 = var10001;
      String var7 = "\n騽\ue96c阓ꥷ馬鄝餽륬靳\u1977\u0011\ue88f深\ue041\uedea\ue87e떂\ue48f䷱\ue1a1巨\ue7de\ue581\ue2cf淳\ue3a1ᷫ\ue39e";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 122;
               case 1 -> 137;
               case 2 -> 20;
               case 3 -> 146;
               case 4 -> 75;
               case 5 -> 250;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      int var21 = 0;
      int var24 = 0;
      lI = new int[11];
      byte[] var10002 = "\u0083ÕRÕåUãziÆÚT/\u00951Ã8×\"\u0015\u007fC~ò@yÙv[\"\u0018|¡\u0098ö\u0001O\u008d;Ý§\u0091&\u0080".getBytes("ISO-8859-1");

      int var55;
      do {
         lI[var21] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ 1869226442;
         var21 += 1;
         var55 = var24 + 4;
         var24 += 4;
      } while (var55 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(247366635, (short)18441, (byte)-30, 103088911, 28685)).length();
      int var2 = 5;
      int var19 = -1;

      label102:
      while (true) {
         var21 = II(-1716767607, var17 ^ -1499414843);
         String var27 = var3.substring(++var19, var19 + var2);
         byte var39 = -1;

         while (true) {
            label97: {
               char[] var57 = var27.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var21;
               var44 = var57;
               var24 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               } else {
                  var55 = var21;
                  var24 = var69;
                  if (var69 <= var6) {
                     break label97;
                  }

                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % II(-1716767606, var17 ^ 182508980)) {
                     case 0 -> II(-1716767603, var17 ^ 497208894);
                     case 1 -> II(-1716767604, var17 ^ 1513525997);
                     case 2 -> II(-1716767601, var17 ^ 1695298922);
                     case 3 -> II(-1716767602, var17 ^ 2119693390);
                     case 4 -> II(-1716767615, var17 ^ -2064835619);
                     case 5 -> II(-1716767616, var17 ^ 1794692698);
                     default -> II(-1716767613, var17 ^ -2098935058);
                  });
                  var6++;
                  if (var55 == 0) {
                     var88 = var55;
                     var81 = var44;
                     var69 = var55;
                  } else {
                     if (var24 <= var6) {
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
                  if ((var19 += var2) >= var5) {
                     Il = new llIIIllI(IlIIllIII.Ill(var0[3]));
                     II = new llIIIllI(IlIIllIII.Ill(var0[2]));
                     l = I();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var62;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label102;
                  }

                  var5 = (var3 = Il(247366634, (short)-14728, (byte)17, 150055064, '㧧')).length();
                  var2 = II(-1716767608, var17 ^ -1071640796);
                  var19 = -1;
            }

            var21 = II(-1716767605, var17 ^ 1286813219);
            var27 = var3.substring(++var19, var19 + var2);
            var39 = 0;
         }
      }
   }

   private static String Il(int var0, short var1, byte var2, int var3, char var4) {
      int var9 = var0 ^ 247366635;
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
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 3375;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ var7 ^ var1 ^ var2 ^ var0 ^ var4 ^ var3 ^ var6);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   @Override
   public String toString() {
      return this.I.llIl();
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ -1716767607] ^ var1 ^ var0;
      var2 -= 56938;
      var2 ^= 20173;
      var2 += 8040;
      var2 += 970;
      var2 += 32016;
      return var2 + 9622;
   }

   public static llIIIllI l(String var0) {
      return Enum.valueOf(llIIIllI.class, var0);
   }

   private llIIIllI(IIIlIlIl var3) {
      this.I = var3;
   }
}
