package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IlIIllll {
   l,
   II;

   private static final IlIIllll[] I;
   private static final String[] ll;
   private static final int[] lI;
   private static final Object[] III;
   private final IIIlIlIl Il;

   private static IlIIllll[] I() {
      return new IlIIllll[]{l, II};
   }

   public static IlIIllll l(String var0) {
      return Enum.valueOf(IlIIllll.class, var0);
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ -1617465948] ^ var1 ^ var0;
      var2 += 52125;
      var2 += 34435;
      var2 ^= 45101;
      var2 += 59690;
      var2 -= 36360;
      var2 ^= 63590;
      return var2 - 52105;
   }

   private static String Il(int var0, byte var1, int var2, int var3) {
      int var8 = var2 ^ 112440732;
      char[] var7 = ll[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])III[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         III[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 53353;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ var6 ^ var3 ^ var1 ^ var2 ^ var5 ^ var0);
      }

      return new String(var7).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 1736173801;
      int var11 = 0;
      short var12 = 19113;
      String[] var9 = new String[2];
      int var8 = "\u000eﾁ끾ﯡ졼\uf8e1\ue07e\uf841\uf87e嬨灼︡衾ﭡ|\u000f䬾ޓ䷞羑䳾ޓ䑾\ue793䊾자䝞徒䷾ꞑ䠞".length();
      int var10 = 0;
      String var7 = "\u000eﾁ끾ﯡ졼\uf8e1\ue07e\uf841\uf87e嬨灼︡衾ﭡ|\u000f䬾ޓ䷞羑䳾ޓ䑾\ue793䊾자䝞徒䷾ꞑ䠞";

      do {
         char var13 = var7.charAt(var11);
         String var10000 = var7.substring(var11 + 1, var11 + 1 + var13);
         int var15 = 0;
         char[] var14 = var10000.toCharArray();

         do {
            char var16 = var14[var15];
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
      int var20 = 0;
      int var10001 = 0;
      lI = new int[11];
      byte[] var10002 = "\u001aü{\u008d.\u0084\r\u008bb:$\u0090\u0001\u0019\u009f\rG\u0088\u0085¯Ö×Y\u008e¤\u0000\u0083Ç\u000f)Á8Fdcùá\u0098\u0007\u008eèr\u0018<"
         .getBytes("ISO-8859-1");

      int var53;
      do {
         lI[var20] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1794831541;
         var20 += 1;
         var53 = var10001 + 4;
         var10001 += 4;
      } while (var53 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(-1644936619, (byte)14, 112440732, -833003488)).length();
      int var2 = 5;
      int var19 = -1;

      label93:
      while (true) {
         var20 = II(-1617465948, var17 ^ -1997806686);
         String var25 = var3.substring(++var19, var19 + var2);
         byte var37 = -1;

         while (true) {
            label88: {
               char[] var55 = var25.toCharArray();
               int var67 = var55.length;
               int var6 = 0;
               var53 = var20;
               var42 = var55;
               var10001 = var67;
               char[] var79;
               int var86;
               if (var67 <= 1) {
                  var79 = var55;
                  var67 = var20;
                  var86 = var6;
               } else {
                  var53 = var20;
                  var10001 = var67;
                  if (var67 <= var6) {
                     break label88;
                  }

                  var79 = var55;
                  var67 = var20;
                  var86 = var6;
               }

               while (true) {
                  var79[var86] = (char)(var79[var86] ^ var67 ^ switch (var6 % II(-1617465945, var17 ^ -1827797039)) {
                     case 0 -> II(-1617465952, var17 ^ -710992425);
                     case 1 -> II(-1617465951, var17 ^ 1153483097);
                     case 2 -> II(-1617465950, var17 ^ 907484075);
                     case 3 -> II(-1617465949, var17 ^ -1656858206);
                     case 4 -> II(-1617465940, var17 ^ -730596576);
                     case 5 -> II(-1617465939, var17 ^ 1938792258);
                     default -> II(-1617465938, var17 ^ 2053472279);
                  });
                  var6++;
                  if (var53 == 0) {
                     var86 = var53;
                     var79 = var42;
                     var67 = var53;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var79 = var42;
                     var67 = var53;
                     var86 = var6;
                  }
               }
            }

            String var60 = new String(var42).intern();
            switch (var37) {
               case 0:
                  var0[var4++] = var60;
                  if ((var19 += var2) >= var5) {
                     l = new IlIIllll(IlIIllIII.Ill(var0[3]));
                     II = new IlIIllll(IlIIllIII.Ill(var0[1]));
                     I = I();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var60;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label93;
                  }

                  var5 = (var3 = Il(2109317621, (byte)-60, 112440733, 651854263)).length();
                  var2 = II(-1617465947, var17 ^ -1131178682);
                  var19 = -1;
            }

            var20 = II(-1617465946, var17 ^ -265438141);
            var25 = var3.substring(++var19, var19 + var2);
            var37 = 0;
         }
      }
   }

   private IlIIllll(IIIlIlIl var3) {
      this.Il = var3;
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }
}
