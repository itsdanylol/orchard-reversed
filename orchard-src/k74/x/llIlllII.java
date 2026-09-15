package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum llIlllII {
   l,
   Il;
   private static final Object[] III;
   private static final String[] ll;
   private static final llIlllII[] I;
   private static final int[] lI;
   private final IIIlIlIl II;

   private static String lI(int var0, int var1) {
      int var3 = var0 ^ 325761587;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 897851381;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 138;
            case 1 -> 229;
            case 2 -> 118;
            case 3 -> 38;
            case 4 -> 16;
            case 5 -> 9;
            case 6 -> 11;
            case 7 -> 179;
            case 8 -> 210;
            case 9 -> 22;
            case 10 -> 189;
            case 11 -> 50;
            case 12 -> 252;
            case 13 -> 23;
            case 14 -> 214;
            case 15 -> 237;
            case 16 -> 52;
            case 17 -> 23;
            case 18 -> 70;
            case 19 -> 40;
            case 20 -> 199;
            case 21 -> 28;
            case 22 -> 82;
            case 23 -> 139;
            case 24 -> 135;
            case 25 -> 83;
            case 26 -> 242;
            case 27 -> 103;
            case 28 -> 86;
            case 29 -> 111;
            case 30 -> 140;
            case 31 -> 130;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public static llIlllII I(String var0) {
      return Enum.valueOf(llIlllII.class, var0);
   }

   private static llIlllII[] l() {
      return new llIlllII[]{Il, l};
   }

   private static int Il(int var0, int var1) {
      int var2 = lI[var0 ^ -2038788540] ^ var1 ^ var0;
      var2 -= 47602;
      var2 += 2374;
      var2 += 26930;
      var2 -= 53586;
      var2 -= 25324;
      var2 += 34483;
      var2 -= 43678;
      var2 ^= 28949;
      var2 -= 41387;
      return var2 + 63002;
   }

   private llIlllII(IIIlIlIl var3) {
      this.II = var3;
   }

   public IIIlIlIl II() {
      return this.II;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = -1881031010;
      String var8 = "\ue2d2\ue2ce\ue2ec\ue2d6\ue20d\ue2d0\ue22d\ue2f6\ue212\ue2b2\ue2b7\ue2bc\ue2d5\ue242\ue23a\ue243\ue23c㜌㝄㜺㜗㞃㜫㟦㜫㞏㜠";
      byte var14 = -1;
      char[] var9 = "ᚦᚽ".toCharArray();
      short var7 = 5815;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            ll = var10;
            III = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            lI = new int[11];
            byte[] var10002 = "Ô\u0082\u0012éS\f\u0084Øb\u00053¤ZMfûJ×\u0095\u008a\u00ad\u0000\u0097%F\u008d4â$lª±¯×Ã<u\u000f2ºvD\u0016\u008a"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               lI[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1630013873;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = lI(325761587, var18 ^ 975079513)).length();
            int var2 = Il(-2038788540, var18 ^ -1137684051);
            int var20 = -1;

            label102:
            while (true) {
               var22 = Il(-2038788539, var18 ^ 1002358782);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var39 = -1;

               while (true) {
                  label97: {
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
                           break label97;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % Il(-2038788537, var18 ^ 855582115)) {
                           case 0 -> Il(-2038788544, var18 ^ 577099388);
                           case 1 -> Il(-2038788543, var18 ^ -978136008);
                           case 2 -> Il(-2038788542, var18 ^ 775911381);
                           case 3 -> Il(-2038788541, var18 ^ 1289677245);
                           case 4 -> Il(-2038788532, var18 ^ -949649396);
                           case 5 -> Il(-2038788531, var18 ^ 498956135);
                           default -> Il(-2038788530, var18 ^ 519460284);
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
                           Il = new llIlllII(IlIIllIII.Ill(var0[0]));
                           l = new llIlllII(IlIIllIII.Ill(var0[1]));
                           I = l();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var62;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label102;
                        }

                        var5 = (var3 = lI(325761586, var18 ^ -272304880)).length();
                        var2 = 4;
                        var20 = -1;
                  }

                  var22 = Il(-2038788538, var18 ^ 179794065);
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
                  default -> 222;
                  case 1 -> 139;
                  case 2 -> 66;
                  case 3 -> 34;
                  case 4 -> 198;
                  case 5 -> 120;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   @Override
   public String toString() {
      return this.II.llIl();
   }
}
