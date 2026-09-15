package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIlIllIlI {
   l,
   II;

   private final IIIlIlIl I;
   private static final int[] lI;
   private static final Object[] III;
   private static final IIlIllIlI[] Il;
   private static final String[] ll;

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ 1903226747] ^ var1 ^ var0;
      var2 += 43078;
      var2 -= 55100;
      var2 ^= 18075;
      var2 ^= 22869;
      var2 += 18846;
      var2 += 33525;
      var2 += 9515;
      var2 ^= 22802;
      return var2 ^ 51048;
   }

   private static String Il(int var0, int var1, char var2) {
      int var3 = var2 ^ '\ueee5';
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])III[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         III[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 31767;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 26230;
         var10 ^= 38491;
         var10 ^= 38991;
         var10 += 60241;
         var10 += 56072;
         var10 -= 3173;
         var10 ^= 27588;
         var10 += 31449;
         var10 ^= 48048;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static IIlIllIlI I(String var0) {
      return Enum.valueOf(IIlIllIlI.class, var0);
   }

   private IIlIllIlI(IIIlIlIl var3) {
      this.I = var3;
   }

   private static IIlIllIlI[] l() {
      return new IIlIllIlI[]{II, l};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = 1093077997;
      String var14 = "ᶾ᷋ᶿ᷺᷋ᴋ᷀ᶫ᷀ᶪᵶᷪᶣᶤ㖟㖜㔧㔴㔔㖆㕜㚘㗎㔴㕭㔤㔣㔴㔶";
      short var13 = 31012;
      char[] var15 = "礪礫".toCharArray();
      String[] var10000 = new String[var15.length];
      byte var20 = -1;
      String[] var16 = var10000;

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            ll = var16;
            III = new Object[var16.length];
            int var9 = -1993252375;
            byte[] var7 = "GÈùª*\u008cû¶L\u008eí\u009b¹O¶\u0099ç\u0096kZdË¥ÿ²5úgé\u0088cB\u009bW<Ê\u001dxÎ;M,\u009dù".getBytes("ISO-8859-1");
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
            int var5 = (var3 = Il(26634, var24 ^ -1987155892, '\ueee5')).length();
            int var2 = II(1903226747, var24 ^ 22126245);
            int var26 = -1;

            label96:
            while (true) {
               int var30 = II(1903226746, var24 ^ 1813355606);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label91: {
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
                           break label91;
                        }

                        var58 = var46;
                        var10004 = var30;
                        var10006 = var6;
                     }

                     while (true) {
                        var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % II(1903226751, var24 ^ -1592849338)) {
                           case 0 -> II(1903226750, var24 ^ 575848983);
                           case 1 -> II(1903226749, var24 ^ -190014088);
                           case 2 -> II(1903226748, var24 ^ -1357839263);
                           case 3 -> II(1903226739, var24 ^ -573678622);
                           case 4 -> II(1903226738, var24 ^ 1541515726);
                           case 5 -> 2;
                           default -> II(1903226737, var24 ^ 196475422);
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
                           II = new IIlIllIlI(IlIIllIII.Ill(var0[0]));
                           l = new IIlIllIlI(IlIIllIII.Ill(var0[3]));
                           Il = l();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var51;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label96;
                        }

                        var5 = (var3 = Il(48273, var24 ^ 365521445, '\ueee4')).length();
                        var2 = II(1903226745, var24 ^ 169314944);
                        var26 = -1;
                  }

                  var30 = II(1903226744, var24 ^ -2698878);
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
               short var23 = switch (var22 % 5) {
                  default -> 95;
                  case 1 -> 178;
                  case 2 -> 249;
                  case 3 -> 225;
                  case 4 -> 224;
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
      return this.I.llIl();
   }
}
