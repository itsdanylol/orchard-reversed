package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIIIll {
   I,
   l;

   private static final Object[] ll;
   private static final int[] Il;
   private static final IIIIll[] II;
   private static final String[] lI;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = 1533285398;
      String var14 = "\uf003\uf093\uf02f\uf0f3\uf0a7\uf01a\uf02c\uf0aa\uf006\uf099";
      byte var20 = -1;
      char[] var15 = "\n".toCharArray();
      short var13 = 3774;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            lI = var16;
            ll = new Object[var16.length];
            int var9 = 245003858;
            byte[] var7 = "M*\u0091¢xQ\u0015d*\u0099¯ý\u0018fö\u0082ÞÄZ\u009c\u0080vd\u0019ä\u001aÀ¿»\u001c8\u001a·¢þ¸".getBytes("ISO-8859-1");
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
            int var5 = (var3 = II(11338, (byte)-82, -327055034)).length();
            char var2 = 4;
            int var1 = -1;

            while (true) {
               char[] var10002;
               label84: {
                  int var28 = l(-417488490, var24 ^ -3546611);
                  char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
                  int var10004 = var10003.length;
                  int var6 = 0;
                  int var34 = var28;
                  var10002 = var10003;
                  int var29 = var10004;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var10004 = var28;
                     var10006 = var6;
                  } else {
                     var34 = var28;
                     var29 = var10004;
                     if (var10004 <= var6) {
                        break label84;
                     }

                     var10005 = var10003;
                     var10004 = var28;
                     var10006 = var6;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % l(-417488489, var24 ^ -894277920)) {
                        case 0 -> l(-417488492, var24 ^ -1736778663);
                        case 1 -> l(-417488491, var24 ^ -1434090048);
                        case 2 -> l(-417488494, var24 ^ 1814505768);
                        case 3 -> l(-417488493, var24 ^ 848631645);
                        case 4 -> l(-417488496, var24 ^ 1459204943);
                        case 5 -> l(-417488495, var24 ^ 167725893);
                        default -> l(-417488482, var24 ^ 88182092);
                     });
                     var6++;
                     if (var34 == 0) {
                        var10006 = var34;
                        var10005 = var10002;
                        var10004 = var34;
                     } else {
                        if (var29 <= var6) {
                           break;
                        }

                        var10005 = var10002;
                        var10004 = var34;
                        var10006 = var6;
                     }
                  }
               }

               String var36 = new String(var10002).intern();
               byte var31 = -1;
               var0[var4++] = var36;
               if ((var1 += var2) >= var5) {
                  I = new IIIIll();
                  l = new IIIIll();
                  II = I();
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 181;
                  case 1 -> 7;
                  case 2 -> 157;
                  case 3 -> 103;
                  case 4 -> 97;
                  case 5 -> 166;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static String II(short var0, byte var1, int var2) {
      int var7 = var2 ^ -327055034;
      char[] var6 = lI[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])ll[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         ll[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 12254;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ 11306 ^ var1 ^ var4 ^ var0 ^ var2);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   private static int l(int var0, int var1) {
      int var2 = Il[var0 ^ -417488490] ^ var1 ^ var0;
      var2 -= 8359;
      var2 += 18955;
      var2 ^= 52994;
      var2 ^= 20886;
      var2 ^= 22737;
      var2 ^= 61687;
      var2 ^= 40890;
      return var2 ^ 28852;
   }

   private static IIIIll[] I() {
      return new IIIIll[]{I, l};
   }
}
