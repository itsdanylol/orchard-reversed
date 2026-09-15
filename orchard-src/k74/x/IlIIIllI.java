package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIIIllI {
   II,
   Il,
   lI;
   private final IIIlIlIl I;
   private static final IlIIIllI[] l;
   private static final String[] III;
   private static final Object[] IIl;
   private static final int[] ll;

   @Override
   public String toString() {
      return this.I.llIl();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = -536607201;
      String var14 = "彑弙忹彃彾忳徣律形徸忇彄引引忓式弥忠很徉弯忋忰弇彬彚徯彍阄陇隨阉陴隨隂雉阑雄隯陒陜";
      char[] var15 = "ẟẎ".toCharArray();
      short var13 = 7811;
      String[] var10000 = new String[var15.length];
      byte var20 = -1;
      String[] var16 = var10000;

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            III = var16;
            IIl = new Object[var16.length];
            int var9 = 134129933;
            byte[] var7 = "F§æÛ^H\u0087mN'\f*Âð¸@\u007f\u0015k\u0098Å\u009dü¨\u0010éå\u009d\u0019\u000fÊôï-\u0091hm\u0017Çi®\u0090å$ö\u001b\u0083("
               .getBytes("ISO-8859-1");
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

            String[] var0 = new String[l(-1550612450, var24 ^ -47055158)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = II('천', (byte)106, 2108845481)).length();
            int var2 = 4;
            int var26 = -1;

            label102:
            while (true) {
               int var30 = l(-1550612449, var24 ^ -438395228);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label97: {
                     char[] var46 = var10001.toCharArray();
                     int var10004 = var46.length;
                     int var6 = 0;
                     int var49 = var30;
                     var42 = var46;
                     int var36 = var10004;
                     char[] var58;
                     int var10006;
                     if (var10004 <= 1) {
                        var58 = var46;
                        var10004 = var30;
                        var10006 = var6;
                     } else {
                        var49 = var30;
                        var36 = var10004;
                        if (var10004 <= var6) {
                           break label97;
                        }

                        var58 = var46;
                        var10004 = var30;
                        var10006 = var6;
                     }

                     while (true) {
                        var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % l(-1550612454, var24 ^ -998018162)) {
                           case 0 -> l(-1550612453, var24 ^ 2114708823);
                           case 1 -> l(-1550612456, var24 ^ -1417675245);
                           case 2 -> l(-1550612455, var24 ^ -1566976686);
                           case 3 -> l(-1550612458, var24 ^ 1421576324);
                           case 4 -> l(-1550612457, var24 ^ -696131907);
                           case 5 -> l(-1550612460, var24 ^ 352779555);
                           default -> l(-1550612459, var24 ^ 1301126309);
                        });
                        var6++;
                        if (var49 == 0) {
                           var10006 = var49;
                           var58 = var42;
                           var10004 = var49;
                        } else {
                           if (var36 <= var6) {
                              break;
                           }

                           var58 = var42;
                           var10004 = var49;
                           var10006 = var6;
                        }
                     }
                  }

                  String var51 = new String(var42).intern();
                  switch (var10002) {
                     case 0:
                        var0[var4++] = var51;
                        if ((var26 += var2) >= var5) {
                           II = new IlIIIllI(IlIIllIII.Ill(var0[4]));
                           lI = new IlIIIllI(IlIIllIII.Ill(var0[2]));
                           Il = new IlIIIllI(IlIIllIII.Ill(var0[3]));
                           l = I();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var51;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label102;
                        }

                        var5 = (var3 = II('逸', (byte)-113, 2108845480)).length();
                        var2 = l(-1550612452, var24 ^ -172944321);
                        var26 = -1;
                  }

                  var30 = l(-1550612451, var24 ^ 2036769157);
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
                  default -> 126;
                  case 1 -> 228;
                  case 2 -> 45;
                  case 3 -> 19;
                  case 4 -> 18;
                  case 5 -> 67;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private IlIIIllI(IIIlIlIl var3) {
      this.I = var3;
   }

   private static IlIIIllI[] I() {
      return new IlIIIllI[]{II, lI, Il};
   }

   private static int l(int var0, int var1) {
      int var2 = ll[var0 ^ -1550612450] ^ var1 ^ var0;
      var2 += 44919;
      var2 ^= 34213;
      var2 ^= 51282;
      var2 += 3890;
      var2 ^= 16165;
      var2 ^= 34312;
      var2 += 15528;
      return var2 + 47014;
   }

   private static String II(char var0, byte var1, int var2) {
      int var7 = var2 ^ 2108845481;
      char[] var6 = III[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])IIl[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         IIl[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 11814;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ switch (var5 % 4) {
            default -> 116;
            case 1 -> 228;
            case 2 -> 206;
            case 3 -> 111;
         } ^ var5 ^ 53926 ^ var1 ^ var4 ^ var2 ^ var0);
      }

      return new String(var6).intern();
   }
}
