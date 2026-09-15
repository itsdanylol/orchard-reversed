package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIIIllII {
   l,
   Il;
   private static final IlIIIllII[] I;
   private final IIIlIlIl II;
   private static final Object[] III;
   private static final String[] ll;
   private static final int[] lI;

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ 989503343] ^ var1 ^ var0;
      var2 ^= 65471;
      var2 ^= 19528;
      var2 ^= 3540;
      var2 ^= 32971;
      var2 ^= 35451;
      var2 += 24974;
      var2 -= 9140;
      var2 -= 20201;
      var2 -= 15959;
      return var2 ^ 4783;
   }

   public static IlIIIllII I(String var0) {
      return Enum.valueOf(IlIIIllII.class, var0);
   }

   @Override
   public String toString() {
      return this.II.llIl();
   }

   private IlIIIllII(IIIlIlIl var3) {
      this.II = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -1607432971;
      String[] var9 = new String[2];
      int var10001 = "\b꼫쫪굥訐깰䪤꿎䨦\b﮺侻滑ཌྷ塀\u0ff2ﮯ콷".length();
      short var12 = 22097;
      int var11 = 0;
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\b꼫쫪굥訐깰䪤꿎䨦\b﮺侻滑ཌྷ塀\u0ff2ﮯ콷";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 1;
               case 1 -> 84;
               case 2 -> 159;
               case 3 -> 166;
               case 4 -> 138;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
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
      lI = new int[10];
      byte[] var10002 = "ôÓ\u0014@ AP\u00adk\u0012#\u0084Ê«ºi7e6·ç)V\u0016\u008aÜ\u008f@Ùý\u0091¼¹Ò\u009c:\u0000b2Ñ".getBytes("ISO-8859-1");

      int var55;
      do {
         lI[var21] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ -2046660187;
         var21 += 1;
         var55 = var24 + 4;
         var24 += 4;
      } while (var55 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il((byte)-118, (short)-28825, (short)29222, (short)24529, (char)'\uec65', -934676228, (byte)-84)).length();
      char var2 = 3;
      int var19 = -1;

      label100:
      while (true) {
         var21 = II(989503343, var17 ^ -400840459);
         String var27 = var3.substring(++var19, var19 + var2);
         byte var39 = -1;

         while (true) {
            label95: {
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
                     break label95;
                  }

                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % II(989503341, var17 ^ 2010816292)) {
                     case 0 -> II(989503340, var17 ^ -698153322);
                     case 1 -> II(989503339, var17 ^ 732793314);
                     case 2 -> II(989503338, var17 ^ -69080385);
                     case 3 -> II(989503337, var17 ^ -1777060895);
                     case 4 -> II(989503336, var17 ^ -986370770);
                     case 5 -> II(989503335, var17 ^ -1525013640);
                     default -> II(989503334, var17 ^ 480939423);
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
                     l = new IlIIIllII(IlIIllIII.Ill(var0[1]));
                     Il = new IlIIIllII(IlIIllIII.Ill(var0[3]));
                     I = l();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var62;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label100;
                  }

                  var5 = (var3 = Il((byte)98, (short)-3636, (short)-10152, (short)-21859, '\ue753', -934676227, 6)).length();
                  var2 = 3;
                  var19 = -1;
            }

            var21 = II(989503342, var17 ^ 1015671865);
            var27 = var3.substring(++var19, var19 + var2);
            var39 = 0;
         }
      }
   }

   private static IlIIIllII[] l() {
      return new IlIIIllII[]{l, Il};
   }

   private static String Il(byte var0, short var1, short var2, short var3, char var4, int var5, byte var6) {
      int var11 = var5 ^ -934676228;
      char[] var10 = ll[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])III[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         III[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 40058;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 7) {
            default -> 224;
            case 1 -> 145;
            case 2 -> 218;
            case 3 -> 190;
            case 4 -> 249;
            case 5 -> 114;
            case 6 -> 184;
         } ^ 60961 ^ var6 ^ var4 ^ var2 ^ var8 ^ var1 ^ var0 ^ var5 ^ var3);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }
}
