package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIIlIIl {
   l,
   II;

   private static final Object[] III;
   private static final String[] ll;
   private static final IIIlIIl[] I;
   private static final int[] lI;
   private final IIIlIlIl Il;

   public static IIIlIIl I(String var0) {
      return Enum.valueOf(IIIlIIl.class, var0);
   }

   private static IIIlIIl[] l() {
      return new IIIlIIl[]{II, l};
   }

   private static String Il(int var0, int var1, short var2) {
      int var3 = var1 ^ 16582;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 5153;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '꾎';
         var10 += 22141;
         var10 += 55065;
         var10 ^= 41614;
         var10 += 64594;
         var10 -= 58803;
         var10 += 53135;
         var10 -= 11189;
         var10 -= 39491;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -1472494218;
      int var16 = 0;
      short var18 = 17060;
      String[] var15 = new String[2];
      int var10001 = "\u0011ﳶ⺻\uea52꿊ｆ\uefc1Ｂ⿈ﳶ⿌ﳾ\uefcfﰞ⿴ﰂ⺡\uea66\r닳㬨뵇㬫늟﬩놧笪늋\ufbd2뵓㯕뵿".length();
      int var17 = 0;
      int var14 = var10001;
      String var13 = "\u0011ﳶ⺻\uea52꿊ｆ\uefc1Ｂ⿈ﳶ⿌ﳾ\uefcfﰞ⿴ﰂ⺡\uea66\r닳㬨뵇㬫늟﬩놧笪늋\ufbd2뵓㯕뵿";

      do {
         char var19 = var13.charAt(var17);
         char[] var10000 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;
         char[] var20 = var10000;

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      ll = var15;
      III = new Object[var15.length];
      int var9 = -430811505;
      byte[] var7 = "´\u0083¦Kl§y/\u0099_¤\u0097/ù\u0089%YÿgÌÑJ]Bº\u008c[\u0015:p.Ï\u007f}\u0006(÷)\u008cy¥Rº(ÒEú¨".getBytes("ISO-8859-1");
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
      int var5 = (var3 = Il(var23 ^ 1063516014, 16582, (short)'ꮀ')).length();
      int var2 = II(563207892, var23 ^ 612719228);
      int var25 = -1;

      label91:
      while (true) {
         int var27 = II(563207893, var23 ^ -56523490);
         String var29 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label86: {
               char[] var44 = var29.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var27;
               var40 = var44;
               var10001 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var27;
                  var10006 = var6;
               } else {
                  var47 = var27;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label86;
                  }

                  var56 = var44;
                  var10004 = var27;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % II(563207888, var23 ^ -906388484)) {
                     case 0 -> II(563207889, var23 ^ 1095540758);
                     case 1 -> II(563207890, var23 ^ 713729775);
                     case 2 -> II(563207891, var23 ^ -1435053256);
                     case 3 -> II(563207900, var23 ^ -277087290);
                     case 4 -> II(563207901, var23 ^ 1731162553);
                     case 5 -> II(563207902, var23 ^ 894715870);
                     default -> II(563207903, var23 ^ 1111689018);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var56 = var40;
                     var10004 = var47;
                     var10006 = var6;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var49;
                  if ((var25 += var2) >= var5) {
                     II = new IIIlIIl(IlIIllIII.Ill(var0[1]));
                     l = new IIIlIIl(IlIIllIII.Ill(var0[0]));
                     I = l();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var49;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label91;
                  }

                  var5 = (var3 = Il(var23 ^ 438339362, 16583, (short)24337)).length();
                  var2 = II(563207894, var23 ^ 156850504);
                  var25 = -1;
            }

            var27 = II(563207895, var23 ^ -1073777542);
            var29 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ 563207892] ^ var1 ^ var0;
      var2 -= 16609;
      var2 += 58748;
      var2 ^= 12756;
      var2 += 45789;
      var2 -= 26443;
      return var2 + 4117;
   }

   private IIIlIIl(IIIlIlIl var3) {
      this.Il = var3;
   }
}
