package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum llllIlIl {
   l,
   Il,
   lI;

   private static final llllIlIl[] I;
   private final IIIlIlIl II;
   private static final int[] ll;
   private static final Object[] IIl;
   private static final String[] III;

   private static int l(int var0, int var1) {
      int var2 = ll[var0 ^ -1227497629] ^ var1 ^ var0;
      var2 += 20955;
      var2 ^= 62648;
      var2 -= 20369;
      var2 -= 30337;
      var2 ^= 26639;
      var2 ^= 64836;
      var2 += 40966;
      var2 += 14548;
      var2 += 19439;
      return var2 + 10518;
   }

   private static llllIlIl[] I() {
      return new llllIlIl[]{lI, l, Il};
   }

   private llllIlIl(IIIlIlIl var3) {
      this.II = var3;
   }

   @Override
   public String toString() {
      return this.II.llIl();
   }

   private static String II(char var0, short var1, byte var2, int var3, short var4, int var5, int var6) {
      int var11 = var3 ^ -186735089;
      char[] var10 = III[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])IIl[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         IIl[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 57369;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 23) {
            default -> 48;
            case 1 -> 115;
            case 2 -> 232;
            case 3 -> 177;
            case 4 -> 13;
            case 5 -> 204;
            case 6 -> 176;
            case 7 -> 103;
            case 8 -> 255;
            case 9 -> 58;
            case 10 -> 54;
            case 11 -> 98;
            case 12 -> 42;
            case 13 -> 151;
            case 14 -> 218;
            case 15 -> 253;
            case 16 -> 122;
            case 17 -> 31;
            case 18 -> 107;
            case 19 -> 129;
            case 20 -> 45;
            case 21 -> 236;
            case 22 -> 200;
         } ^ var9 ^ 10776 ^ var8 ^ var3 ^ var6 ^ var0 ^ var4 ^ var1 ^ var5 ^ var2);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 1031471531;
      int var10001 = "$棼籬晬Ⱡ泬䱢拌Ɑ柌౫汜ﱩ槼Ᵽ柼\uec66歜౪椌ﱠ潌豥暬\uec6d栬걣枬ﱯ撜걣滬\u0c65湼뱬沼㱨\u000e있\uf8c2좘㣎쌸㣏콈磂쮘飇안ꣂ셨죋".length();
      short var18 = 19403;
      int var14 = var10001;
      String var13 = "$棼籬晬Ⱡ泬䱢拌Ɑ柌౫汜ﱩ槼Ᵽ柼\uec66歜౪椌ﱠ潌豥暬\uec6d栬걣枬ﱯ撜걣滬\u0c65湼뱬沼㱨\u000e있\uf8c2좘㣎쌸㣏콈磂쮘飇안ꣂ셨죋";
      String[] var10000 = new String[2];
      int var17 = 0;
      String[] var15 = var10000;
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10001 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << '\f') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> '\f') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      III = var15;
      IIl = new Object[var15.length];
      int var9 = 1821986388;
      byte[] var7 = "\u0093\tbI\u008fì\u008ab\u001býP<Í¯£[\u0094Pú)X\"ù(ûêh\u0018\u001a+<\u0088Å\u0089|\u0080ü\u0095\n\u0082\u0086ýèYc¹\u008då"
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

      String[] var0 = new String[l(-1227497629, var23 ^ -1950141122)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II((char)'鳭', 5961, 100, -186735089, (short)-2998, 1657619613, 1074288229)).length();
      int var2 = 5;
      int var25 = -1;

      label90:
      while (true) {
         int var27 = l(-1227497630, var23 ^ -1759060682);
         String var30 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label85: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var27;
               var41 = var45;
               var10001 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var27;
                  var10006 = var6;
               } else {
                  var48 = var27;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label85;
                  }

                  var57 = var45;
                  var10004 = var27;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % l(-1227497625, var23 ^ -1936020157)) {
                     case 0 -> l(-1227497626, var23 ^ 1088990821);
                     case 1 -> l(-1227497627, var23 ^ -484425918);
                     case 2 -> l(-1227497628, var23 ^ 48327670);
                     case 3 -> l(-1227497621, var23 ^ -582800470);
                     case 4 -> l(-1227497622, var23 ^ -463515136);
                     case 5 -> l(-1227497623, var23 ^ -1640517419);
                     default -> l(-1227497624, var23 ^ 2071190221);
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
                     lI = new llllIlIl(IlIIllIII.Ill(var0[2]));
                     l = new llllIlIl(IlIIllIII.Ill(var0[1]));
                     Il = new llllIlIl(IlIIllIII.Ill(var0[3]));
                     I = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var50;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label90;
                  }

                  var5 = (var3 = II('맢', (short)19610, 8, -186735090, (short)-18840, 463317929, -795816094)).length();
                  var2 = l(-1227497631, var23 ^ 53938000);
                  var25 = -1;
            }

            var27 = l(-1227497632, var23 ^ -714738611);
            var30 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }
}
