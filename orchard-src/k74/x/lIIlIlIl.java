package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lIIlIlIl {
   I,
   l,
   Il,
   lI;

   private static final int[] III;
   private static final Object[] IlI;
   private static final String[] IIl;
   private final IIIlIlIl II;
   private static final lIIlIlIl[] ll;

   private lIIlIlIl(IIIlIlIl var3) {
      this.II = var3;
   }

   private static int l(int var0, int var1) {
      int var2 = III[var0 ^ 1503679200] ^ var1 ^ var0;
      var2 ^= 52565;
      var2 += 18248;
      var2 -= 50643;
      var2 -= 21017;
      var2 ^= 18196;
      var2 -= 18044;
      var2 ^= 20904;
      return var2 - 3213;
   }

   private static lIIlIlIl[] I() {
      return new lIIlIlIl[]{lI, l, I, Il};
   }

   private static String II(int var0, char var1, int var2) {
      int var3 = var0 ^ 38190;
      char[] var4 = IIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 22312;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 'ﳆ';
         var10 -= 44257;
         var10 += 63181;
         var10 += 1486;
         var10 -= 44297;
         var10 ^= 60189;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = -1042384927;
      short var13 = 28060;
      byte var20 = -1;
      char[] var15 = "涶涐".toCharArray();
      String var14 = "\uef83\uef9e\uef21\uef4a\uef02\ueff6\uefa0\uefc0\uef21\uef56\uef6b\uefe5\uefb3\uefd6\uef6e\uef64\uef7f\uefe9\uef84\uefda\uef0f\uef5b\uef00\uf006\ueffe\uf03d\uef26\uef53\uef75\ueff2\uef86\uf03e\uef05\uef55\uef2b\uefa4\uef9c\ueff1\uef27\uf0b5\uef62\uefba氓氬沱泯沼汮氂氩沰泣沒汃";
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            IIl = var16;
            IlI = new Object[var16.length];
            int var9 = 227451526;
            byte[] var7 = "\u007f\u0098ÝFpÇtde¸\u009aTë4Àªi8y\u00193Ý[\u008bOø\u0080\u0095\\¡Â_«D\u0014:\u009dm\u009c\"\u0096.ÅýÛ\"1±>hr<,\bèc"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            III = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               III[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[l(1503679200, var24 ^ -362208571)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = II(38190, '㣽', var24 ^ -816172374)).length();
            int var2 = l(1503679201, var24 ^ -449410074);
            int var26 = -1;

            label101:
            while (true) {
               int var29 = l(1503679202, var24 ^ -263625336);
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
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % l(1503679204, var24 ^ -53901665)) {
                           case 0 -> l(1503679205, var24 ^ -1507023856);
                           case 1 -> l(1503679206, var24 ^ -636911759);
                           case 2 -> l(1503679207, var24 ^ -917488137);
                           case 3 -> l(1503679208, var24 ^ 1052109702);
                           case 4 -> l(1503679209, var24 ^ 144466478);
                           case 5 -> l(1503679210, var24 ^ 64961100);
                           default -> l(1503679211, var24 ^ 1322503723);
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
                           lI = new lIIlIlIl(IlIIllIII.Ill(var0[0]));
                           l = new lIIlIlIl(IlIIllIII.Ill(var0[2]));
                           I = new lIIlIlIl(IlIIllIII.Ill(var0[5]));
                           Il = new lIIlIlIl(IlIIllIII.Ill(var0[3]));
                           ll = I();
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

                        var5 = (var3 = II(38191, 'ￎ', var24 ^ -1930555584)).length();
                        var2 = 5;
                        var26 = -1;
                  }

                  var29 = l(1503679203, var24 ^ 2126856010);
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
                  default -> 104;
                  case 1 -> 61;
                  case 2 -> 255;
                  case 3 -> 178;
                  case 4 -> 219;
                  case 5 -> 14;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   @Override
   public String toString() {
      return this.II.llIl();
   }
}
