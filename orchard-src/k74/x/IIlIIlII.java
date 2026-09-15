package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIlIIlII {
   I,
   II;

   private static final int[] Il;
   private static final IIlIIlII[] l;
   private static final Object[] ll;
   private static final String[] lI;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -1544771506;
      String[] var10001 = new String[1];
      int var16 = 0;
      short var18 = 22652;
      int var17 = 0;
      String[] var15 = var10001;
      int var14 = "\bㅗ䷞ㇷ鷒䨗㗌囗䷌".length();
      String var13 = "\bㅗ䷞ㇷ鷒䨗㗌囗䷌";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lI = var15;
      ll = new Object[var15.length];
      int var9 = 1376958228;
      byte[] var7 = "¶Ük÷@ø\u000exT+ò\u008f\u000fw®\u008axÍbº\u007fFn/0`}\nÒ6#R\u0090Pb\u0015".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      Il = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         Il[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(var23 ^ -1961565952, '\uef74', '뒋')).length();
      char var2 = 4;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label72: {
            int var10000 = l(-1008873584, var23 ^ 2063625654);
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var32 = var10000;
            var10002 = var10003;
            int var27 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            } else {
               var32 = var10000;
               var27 = var10004;
               if (var10004 <= var6) {
                  break label72;
               }

               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % l(-1008873583, var23 ^ -1927018357)) {
                  case 0 -> l(-1008873582, var23 ^ -1711803364);
                  case 1 -> l(-1008873581, var23 ^ -1028937513);
                  case 2 -> l(-1008873580, var23 ^ -1257151444);
                  case 3 -> l(-1008873579, var23 ^ -1298503514);
                  case 4 -> l(-1008873578, var23 ^ -37979307);
                  case 5 -> l(-1008873577, var23 ^ 535438653);
                  default -> l(-1008873576, var23 ^ 1569481848);
               });
               var6++;
               if (var32 == 0) {
                  var10006 = var32;
                  var10005 = var10002;
                  var10004 = var32;
               } else {
                  if (var27 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var32;
                  var10006 = var6;
               }
            }
         }

         String var34 = new String(var10002).intern();
         byte var29 = -1;
         var0[var4++] = var34;
         if ((var1 += var2) >= var5) {
            II = new IIlIIlII();
            I = new IIlIIlII();
            l = I();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static String II(int var0, char var1, char var2) {
      int var3 = var2 ^ '뒋';
      char[] var4 = lI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])ll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         ll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 5473;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 3742;
         var10 ^= 4198;
         var10 -= 48867;
         var10 += 5699;
         var10 ^= 63684;
         var10 ^= 50775;
         var10 -= 64568;
         var10 += 11559;
         var10 ^= 59001;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static IIlIIlII[] I() {
      return new IIlIIlII[]{II, I};
   }

   private static int l(int var0, int var1) {
      int var2 = Il[var0 ^ -1008873584] ^ var1 ^ var0;
      var2 += 63723;
      var2 += 26566;
      var2 -= 22180;
      var2 += 49605;
      var2 -= 61209;
      return var2 - 45802;
   }
}
