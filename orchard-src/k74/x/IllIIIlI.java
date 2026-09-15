package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IllIIIlI {
   l,
   II,
   lI;
   private static final int[] ll;
   private static final Object[] IIl;
   private final IIIlIlIl I;
   private static final String[] III;
   private static final IllIIIlI[] Il;

   private static String lI(byte var0, short var1, int var2) {
      int var7 = var2 ^ 1242315450;
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
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 42019;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ switch (var5 % 17) {
            default -> 184;
            case 1 -> 147;
            case 2 -> 219;
            case 3 -> 159;
            case 4 -> 141;
            case 5 -> 170;
            case 6 -> 157;
            case 7 -> 1;
            case 8 -> 59;
            case 9 -> 64;
            case 10 -> 110;
            case 11 -> 88;
            case 12 -> 136;
            case 13 -> 116;
            case 14 -> 237;
            case 15 -> 93;
            case 16 -> 177;
         } ^ var4 ^ var0 ^ var2 ^ var1);
      }

      return new String(var6).intern();
   }

   private static int Il(int var0, int var1) {
      int var2 = ll[var0 ^ 1222726372] ^ var1 ^ var0;
      var2 += 41786;
      var2 += 27305;
      var2 ^= 4194;
      var2 ^= 52246;
      var2 -= 38707;
      var2 ^= 47224;
      return var2 - 35167;
   }

   public static IllIIIlI I(String var0) {
      return Enum.valueOf(IllIIIlI.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 1335419356;
      String[] var9 = new String[2];
      int var11 = 0;
      int var10 = 0;
      int var10001 = "\u001d勑뇢冈퇹吾셩喕⅍幆煀壼酆别憘嗁퇮咸퇹坾煮唥ᅂ囆腏岬ᅃ夻↙寁\u000f\uf760큄\uf7e9ၞ\uf15f\uf0c9\uf434烨ﴷ胣ﲝ惠\uf34a\uf038\uf7c0".length();
      short var12 = 9939;
      int var8 = var10001;
      String var7 = "\u001d勑뇢冈퇹吾셩喕⅍幆煀壼酆别憘嗁퇮咸퇹坾煮唥ᅂ囆腏岬ᅃ夻↙寁\u000f\uf760큄\uf7e9ၞ\uf15f\uf0c9\uf434烨ﴷ胣ﲝ惠\uf34a\uf038\uf7c0";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 16;
               case 1 -> 183;
               case 2 -> 25;
               case 3 -> 173;
               case 4 -> 31;
               case 5 -> 58;
               case 6 -> 196;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      III = var9;
      IIl = new Object[var9.length];
      int var21 = 0;
      int var24 = 0;
      ll = new int[12];
      byte[] var10002 = "<AEô\u0003\u0007`7ò>f!{éD~¯\u001b\u0001¸Í\u001cöè.)frêD\\Û+FnÌ\u0091u\u0090ò\u0091>\u0085óÃk×<".getBytes("ISO-8859-1");

      int var55;
      do {
         ll[var21] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ 1764202586;
         var21 += 1;
         var55 = var24 + 4;
         var24 += 4;
      } while (var55 < var10002.length);

      String[] var0 = new String[Il(1222726372, var17 ^ -1377802025)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lI((byte)29, (short)-5375, 1242315450)).length();
      int var2 = 4;
      int var19 = -1;

      label104:
      while (true) {
         var21 = Il(1222726373, var17 ^ -1834595049);
         String var27 = var3.substring(++var19, var19 + var2);
         byte var39 = -1;

         while (true) {
            label99: {
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
                     break label99;
                  }

                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % Il(1222726368, var17 ^ 1052388508)) {
                     case 0 -> Il(1222726369, var17 ^ 1555946475);
                     case 1 -> Il(1222726370, var17 ^ -1081587049);
                     case 2 -> Il(1222726371, var17 ^ 2078634037);
                     case 3 -> Il(1222726380, var17 ^ -1159249355);
                     case 4 -> Il(1222726381, var17 ^ 13941771);
                     case 5 -> Il(1222726382, var17 ^ 10463290);
                     default -> Il(1222726383, var17 ^ 1389034462);
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
                     lI = new IllIIIlI(IlIIllIII.Ill(var0[4]));
                     II = new IllIIIlI(IlIIllIII.Ill(var0[2]));
                     l = new IllIIIlI(IlIIllIII.Ill(var0[3]));
                     Il = II();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var62;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label104;
                  }

                  var5 = (var3 = lI((byte)-75, 3716, 1242315451)).length();
                  var2 = Il(1222726374, var17 ^ 1671383810);
                  var19 = -1;
            }

            var21 = Il(1222726375, var17 ^ -364353379);
            var27 = var3.substring(++var19, var19 + var2);
            var39 = 0;
         }
      }
   }

   public IIIlIlIl l() {
      return this.I;
   }

   @Override
   public String toString() {
      return this.I.llIl();
   }

   private IllIIIlI(IIIlIlIl var3) {
      this.I = var3;
   }

   private static IllIIIlI[] II() {
      return new IllIIIlI[]{lI, II, l};
   }
}
