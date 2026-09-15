package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIIIl {
   II,
   Il;
   private static final int[] lI;
   private static final IIIIl[] I;
   private final IIIlIlIl l;
   private static final String[] ll;
   private static final Object[] III;

   private IIIIl(IIIlIlIl var3) {
      this.l = var3;
   }

   private static String Il(int var0, short var1, char var2) {
      int var3 = var2 ^ 28438;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 25730;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '念';
         var10 ^= 256;
         var10 -= 61624;
         var10 -= 32973;
         var10 -= 656;
         var10 += 61233;
         var10 -= 40821;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ -1314182216] ^ var1 ^ var0;
      var2 += 49013;
      var2 -= 41157;
      var2 ^= 47360;
      var2 -= 33468;
      var2 -= 40977;
      var2 += 9948;
      var2 ^= 63310;
      var2 += 60245;
      return var2 + 2907;
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -1430435643;
      int var17 = 0;
      String[] var15 = new String[2];
      int var16 = 0;
      int var14 = "\u0010⡲額⭦塮⥸堰⤦룸⢱飗⭷堗⠐ᢖ⠺塇\u0012ᔧ䲿\u17eb䳞ᕵ\uec8fᜓ氈ټ걼ᓊ\uececᑕ豦ᐷ泰ᑫ쳚".length();
      String var13 = "\u0010⡲額⭦塮⥸堰⤦룸⢱飗⭷堗⠐ᢖ⠺塇\u0012ᔧ䲿\u17eb䳞ᕵ\uec8fᜓ氈ټ걼ᓊ\uececᑕ豦ᐷ泰ᑫ쳚";
      short var18 = 17499;

      do {
         char var10000 = var13.charAt(var17);
         int var21 = 0;
         char var19 = var10000;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 84;
               case 1 -> 239;
               case 2 -> 120;
               case 3 -> 193;
               case 4 -> 190;
               case 5 -> 150;
               case 6 -> 48;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      ll = var15;
      III = new Object[var15.length];
      int var9 = -82219362;
      byte[] var7 = "Bü\u0011\u0083\u0000\u0082\u000bBÐ+\u009d\u009e\u0018\u0097ó»ÖglÑ£ßÊ°Úb\u0097íL\u0014À°æûÍñÔæÕ²\u0019\u000f{£".getBytes("ISO-8859-1");
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
      int var5 = (var3 = Il(var23 ^ -2012403648, (short)13858, '漖')).length();
      int var2 = II(-1314182216, var23 ^ -1561118662);
      int var25 = -1;

      label100:
      while (true) {
         int var29 = II(-1314182215, var23 ^ -527621530);
         String var10001 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label95: {
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
                     break label95;
                  }

                  var57 = var45;
                  var10004 = var29;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(-1314182213, var23 ^ -124200447)) {
                     case 0 -> II(-1314182212, var23 ^ 912803142);
                     case 1 -> II(-1314182211, var23 ^ 1137763111);
                     case 2 -> II(-1314182210, var23 ^ 980270869);
                     case 3 -> II(-1314182209, var23 ^ -1407457202);
                     case 4 -> II(-1314182224, var23 ^ 116712564);
                     case 5 -> II(-1314182223, var23 ^ 887749642);
                     default -> II(-1314182222, var23 ^ -117419475);
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
                  if ((var25 += var2) >= var5) {
                     Il = new IIIIl(IlIIllIII.Ill(var0[3]));
                     II = new IIIIl(IlIIllIII.Ill(var0[1]));
                     I = l();
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

                  var5 = (var3 = Il(var23 ^ 1580362157, (short)'藃', '漗')).length();
                  var2 = 5;
                  var25 = -1;
            }

            var29 = II(-1314182214, var23 ^ 807712113);
            var10001 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   public static IIIIl I(String var0) {
      return Enum.valueOf(IIIIl.class, var0);
   }

   private static IIIIl[] l() {
      return new IIIIl[]{Il, II};
   }
}
