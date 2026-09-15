package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IlllIll {
   l,
   Il;
   private final IIIlIlIl I;
   private static final String[] ll;
   private static final Object[] III;
   private static final IlllIll[] II;
   private static final int[] lI;

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ 1770951946] ^ var1 ^ var0;
      var2 ^= 62863;
      var2 ^= 45092;
      var2 += 54717;
      var2 -= 40581;
      var2 ^= 38936;
      var2 -= 44894;
      var2 -= 63116;
      var2 += 8126;
      var2 -= 10206;
      return var2 + 47966;
   }

   public static IlllIll I(String var0) {
      return Enum.valueOf(IlllIll.class, var0);
   }

   private static String Il(int var0, short var1, int var2) {
      int var3 = var0 ^ 28660;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 22048;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 28263;
         var10 -= 64858;
         var10 += 12809;
         var10 += 53482;
         var10 -= 41966;
         var10 -= 28924;
         var10 += 39284;
         var10 += 5614;
         var10 += 3156;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -703079677;
      String[] var10001 = new String[2];
      int var11 = 0;
      String[] var9 = var10001;
      short var12 = 9065;
      int var10 = 0;
      int var8 = "\u000e逧㬓槅묌霐̻霒쫒鉙䩷鞧銄阱樦\u000eᱼ췰Й䷨ˋ䗞ᢩ㷉Ƃ뵯\u187c\ue59dᷪᴽ".length();
      String var7 = "\u000e逧㬓槅묌霐̻霒쫒鉙䩷鞧銄阱樦\u000eᱼ췰Й䷨ˋ䗞ᢩ㷉Ƃ뵯\u187c\ue59dᷪᴽ";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 200;
               case 1 -> 246;
               case 2 -> 109;
               case 3 -> 232;
               case 4 -> 159;
               case 5 -> 222;
               case 6 -> 61;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      lI = new int[10];
      int var21 = 0;
      byte var24 = 0;
      byte[] var10002 = "ÒÌæ°ªc_óf{ÇÁ±\u009ee{çxè$Ãò\u0011»Ñ®\u007f_Z\u0084³·iúÁWû¶xÕ".getBytes("ISO-8859-1");

      int var55;
      do {
         lI[var21] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ -507564978;
         var21 += 1;
         var55 = var24 + 4;
         var24 += 4;
      } while (var55 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(28660, (short)29009, var17 ^ 2111364202)).length();
      char var2 = 5;
      int var19 = -1;

      label102:
      while (true) {
         var21 = II(1770951946, var17 ^ -1930759431);
         String var27 = var3.substring(++var19, var19 + var2);
         byte var39 = -1;

         while (true) {
            label97: {
               char[] var57 = var27.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var21;
               var44 = var57;
               int var32 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               } else {
                  var55 = var21;
                  var32 = var69;
                  if (var69 <= var6) {
                     break label97;
                  }

                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % II(1770951944, var17 ^ 945673052)) {
                     case 0 -> II(1770951945, var17 ^ -273125055);
                     case 1 -> II(1770951950, var17 ^ -1184957327);
                     case 2 -> II(1770951951, var17 ^ -1647049266);
                     case 3 -> II(1770951948, var17 ^ -1886884898);
                     case 4 -> II(1770951949, var17 ^ 77766749);
                     case 5 -> II(1770951938, var17 ^ 937219389);
                     default -> II(1770951939, var17 ^ -1517261695);
                  });
                  var6++;
                  if (var55 == 0) {
                     var88 = var55;
                     var81 = var44;
                     var69 = var55;
                  } else {
                     if (var32 <= var6) {
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
                     Il = new IlllIll(IlIIllIII.Ill(var0[3]));
                     l = new IlllIll(IlIIllIII.Ill(var0[1]));
                     II = l();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var62;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label102;
                  }

                  var5 = (var3 = Il(28661, (short)'\ue32f', var17 ^ 186560949)).length();
                  var2 = 5;
                  var19 = -1;
            }

            var21 = II(1770951947, var17 ^ -196785235);
            var27 = var3.substring(++var19, var19 + var2);
            var39 = 0;
         }
      }
   }

   private IlllIll(IIIlIlIl var3) {
      this.I = var3;
   }

   private static IlllIll[] l() {
      return new IlllIll[]{Il, l};
   }

   @Override
   public String toString() {
      return this.I.llIl();
   }
}
