package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIIIIIl {
   I,
   l,
   Il;

   private static final int[] ll;
   private final IIIlIlIl II;
   private static final Object[] IIl;
   private static final String[] III;
   private static final IIIIIIl[] lI;

   private static String II(char var0, short var1, int var2) {
      int var3 = var0 ^ 24358;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 1438;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '뾍';
         var10 ^= 37431;
         var10 ^= 44512;
         var10 += 46371;
         var10 += 52713;
         var10 += 34138;
         var10 ^= 56504;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.II.llIl();
   }

   private static IIIIIIl[] I() {
      return new IIIIIIl[]{I, Il, l};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = -1395707158;
      char[] var9 = "ฬ\u0e3d".toCharArray();
      byte var14 = -1;
      short var7 = 3632;
      String var8 = "쳛찤찹축챲쳾첔찾챙챙찇쳫쵽찊챘챌찕쳫쵠챧챜챫챆쵋쳓챷찒챿䳰䳷䲝䳗䳰䰶䳦䲶䲽䳪䲇䰰䱁";
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            III = var10;
            IIl = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            ll = new int[12];
            byte[] var10002 = "QGi\u0097\b¼zC]\u00816ÛñI4\u0019}\u0000\u009f^Ð \u009a}@®NW\u0086îÔßNH^=Erå\u0094\u0007\u000b\u0015:Ý9¡D".getBytes("ISO-8859-1");

            int var55;
            do {
               ll[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1083956695;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var0 = new String[l(-1837846694, var18 ^ 795318639)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = II('弦', (short)16639, var18 ^ -798422924)).length();
            int var2 = l(-1837846693, var18 ^ 1989970572);
            int var20 = -1;

            label103:
            while (true) {
               var22 = l(-1837846696, var18 ^ 597804633);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var39 = -1;

               while (true) {
                  label98: {
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
                           break label98;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % l(-1837846690, var18 ^ 52457379)) {
                           case 0 -> l(-1837846689, var18 ^ -1367315740);
                           case 1 -> l(-1837846692, var18 ^ 1049542366);
                           case 2 -> l(-1837846691, var18 ^ -120707991);
                           case 3 -> l(-1837846702, var18 ^ 812166683);
                           case 4 -> l(-1837846701, var18 ^ 995235146);
                           case 5 -> l(-1837846704, var18 ^ 2032920009);
                           default -> l(-1837846703, var18 ^ -1558622176);
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
                           I = new IIIIIIl(IlIIllIII.Ill(var0[3]));
                           Il = new IIIIIIl(IlIIllIII.Ill(var0[5]));
                           l = new IIIIIIl(IlIIllIII.Ill(var0[0]));
                           lI = I();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var62;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label103;
                        }

                        var5 = (var3 = II('弧', (short)13807, var18 ^ 618940569)).length();
                        var2 = 4;
                        var20 = -1;
                  }

                  var22 = l(-1837846695, var18 ^ -1888893743);
                  var27 = var3.substring(++var20, var20 + var2);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 41;
                  case 1 -> 132;
                  case 2 -> 175;
                  case 3 -> 197;
                  case 4 -> 182;
                  case 5 -> 29;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static int l(int var0, int var1) {
      int var2 = ll[var0 ^ -1837846694] ^ var1 ^ var0;
      var2 -= 9279;
      var2 += 33317;
      var2 ^= 17315;
      var2 += 29279;
      var2 -= 58146;
      var2 += 54452;
      var2 -= 51203;
      return var2 ^ 59666;
   }

   private IIIIIIl(IIIlIlIl var3) {
      this.II = var3;
   }
}
