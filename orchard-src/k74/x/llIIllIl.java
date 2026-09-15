package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum llIIllIl {
   l,
   II,
   Il;

   private static final llIIllIl[] I;
   private static final Object[] IIl;
   private static final int[] ll;
   private static final String[] III;
   private final IIIlIlIl lI;

   private static int II(int var0, int var1) {
      int var2 = ll[var0 ^ 2121287743] ^ var1 ^ var0;
      var2 -= 57474;
      var2 -= 20990;
      var2 ^= 64436;
      var2 ^= 41147;
      var2 ^= 51772;
      var2 ^= 9751;
      var2 -= 48091;
      return var2 - 23914;
   }

   private static String Il(int var0, int var1, short var2, short var3, byte var4, short var5) {
      int var10 = var1 ^ 1266085498;
      char[] var9 = III[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])IIl[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         IIl[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 58589;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ var8 ^ var1 ^ var0 ^ var5 ^ var3 ^ var4 ^ var7 ^ var2);
      }

      return new String(var9).intern();
   }

   private llIIllIl(IIIlIlIl var3) {
      this.lI = var3;
   }

   private static llIIllIl[] I() {
      return new llIIllIl[]{l, II, Il};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 404425212;
      int var17 = 0;
      int var10001 = "\u001c㕢뉬㝻쉵㔯舦ㅬ\uf24dㅴ銛も䉬㋻ታ㚿ꈡ㐜퉊㜤ʝ㎢ቭ㐋鉲㎿䈦㍬前\r❀⁾┩灦⌝4➞遞₦䂉⁀쁻⁙".length();
      short var18 = 21024;
      String[] var15 = new String[2];
      int var16 = 0;
      int var14 = var10001;
      String var13 = "\u001c㕢뉬㝻쉵㔯舦ㅬ\uf24dㅴ銛も䉬㋻ታ㚿ꈡ㐜퉊㜤ʝ㎢ቭ㐋鉲㎿䈦㍬前\r❀⁾┩灦⌝4➞遞₦䂉⁀쁻⁙";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 16;
               case 1 -> 94;
               case 2 -> 121;
               case 3 -> 70;
               case 4 -> 173;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      III = var15;
      IIl = new Object[var15.length];
      int var9 = 337337789;
      byte[] var7 = "R1þ\u0093\u0093g\u001eøÎe\u009b\t\u000e\u001c/,ð8Ýá\u0005º)2j|Å#\"³»\"\u0019Ac½s8w\n¥ãET".getBytes("ISO-8859-1");
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

      String[] var0 = new String[II(2121287743, var23 ^ 541262338)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(-1505298663, 1266085498, 2350, 7137, (byte)-56, (short)12146)).length();
      char var2 = 4;
      int var25 = -1;

      label97:
      while (true) {
         int var28 = II(2121287742, var23 ^ -518659457);
         String var30 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label92: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var28;
               var41 = var45;
               var10001 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var48 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label92;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(2121287740, var23 ^ 2087637945)) {
                     case 0 -> II(2121287739, var23 ^ -2109071200);
                     case 1 -> II(2121287738, var23 ^ 2009650566);
                     case 2 -> II(2121287737, var23 ^ 403585083);
                     case 3 -> II(2121287736, var23 ^ 1354844033);
                     case 4 -> II(2121287735, var23 ^ 1798545148);
                     case 5 -> II(2121287734, var23 ^ 21662607);
                     default -> II(2121287733, var23 ^ -678316014);
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
                     l = new llIIllIl(IlIIllIII.Ill(var0[1]));
                     II = new llIIllIl(IlIIllIII.Ill(var0[2]));
                     Il = new llIIllIl(IlIIllIII.Ill(var0[5]));
                     I = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var50;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label97;
                  }

                  var5 = (var3 = Il(245612796, 1266085499, 18367, (short)-6344, 100, 29713)).length();
                  var2 = 4;
                  var25 = -1;
            }

            var28 = II(2121287741, var23 ^ -1139317134);
            var30 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   @Override
   public String toString() {
      return this.lI.llIl();
   }

   public static llIIllIl l(String var0) {
      return Enum.valueOf(llIIllIl.class, var0);
   }
}
