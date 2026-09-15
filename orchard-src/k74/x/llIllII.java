package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum llIllII {
   I,
   l;

   private static final String[] lI;
   private static final int[] Il;
   private static final Object[] ll;
   private static final llIllII[] II;

   private static String Il(byte var0, int var1, int var2, int var3, byte var4, short var5) {
      int var10 = var2 ^ 602807165;
      char[] var9 = lI[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])ll[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         ll[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 20035;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 6) {
            default -> 150;
            case 1 -> 62;
            case 2 -> 54;
            case 3 -> 115;
            case 4 -> 228;
            case 5 -> 96;
         } ^ var8 ^ 2002 ^ var4 ^ var5 ^ var3 ^ var1 ^ var2 ^ var7 ^ var0);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   public static llIllII I(String var0) {
      return Enum.valueOf(llIllII.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 103879210;
      short var12 = 10281;
      int var8 = "\tᙼ듄ላ瓱ᕃ钬ᝢ\uf4e0ፙ".length();
      String var7 = "\tᙼ듄ላ瓱ᕃ钬ᝢ\uf4e0ፙ";
      int var10 = 0;
      String[] var9 = new String[1];
      int var11 = 0;

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 169;
               case 1 -> 140;
               case 2 -> 142;
               case 3 -> 178;
               case 4 -> 142;
               case 5 -> 238;
               case 6 -> 71;
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

      lI = var9;
      ll = new Object[var9.length];
      int var20 = 0;
      int var10001 = 0;
      Il = new int[9];
      byte[] var10002 = "\\÷\u0081³\"ªIyÏx\u0004Ì\u001a\u009eÚ)Ëo\u008c*LÓ?ùË\u0086ÔéHr\\²04ó\u009e".getBytes("ISO-8859-1");

      int var43;
      do {
         Il[var20] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 452275596;
         var20 += 1;
         var43 = var10001 + 4;
         var10001 += 4;
      } while (var43 < var10002.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il((byte)73, -666520281, 602807165, -2052182388, 38, (short)31931)).length();
      char var2 = 3;
      int var1 = -1;

      while (true) {
         label89: {
            var20 = II(-575078892, var17 ^ 1651828459);
            char[] var44 = var3.substring(++var1, var1 + var2).toCharArray();
            int var54 = var44.length;
            int var6 = 0;
            var43 = var20;
            var33 = var44;
            var10001 = var54;
            char[] var63;
            int var70;
            if (var54 <= 1) {
               var63 = var44;
               var54 = var20;
               var70 = var6;
            } else {
               var43 = var20;
               var10001 = var54;
               if (var54 <= var6) {
                  break label89;
               }

               var63 = var44;
               var54 = var20;
               var70 = var6;
            }

            while (true) {
               var63[var70] = (char)(var63[var70] ^ var54 ^ switch (var6 % II(-575078891, var17 ^ 472457716)) {
                  case 0 -> II(-575078890, var17 ^ -235181007);
                  case 1 -> II(-575078889, var17 ^ 605928802);
                  case 2 -> II(-575078896, var17 ^ -169024324);
                  case 3 -> II(-575078895, var17 ^ 1917868365);
                  case 4 -> II(-575078894, var17 ^ -184173563);
                  case 5 -> II(-575078893, var17 ^ 1995521015);
                  default -> II(-575078884, var17 ^ 246912213);
               });
               var6++;
               if (var43 == 0) {
                  var70 = var43;
                  var63 = var33;
                  var54 = var43;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var63 = var33;
                  var54 = var43;
                  var70 = var6;
               }
            }
         }

         String var47 = new String(var33).intern();
         byte var27 = -1;
         var0[var4++] = var47;
         if ((var1 += var2) >= var5) {
            I = new llIllII();
            l = new llIllII();
            II = l();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static int II(int var0, int var1) {
      int var2 = Il[var0 ^ -575078892] ^ var1 ^ var0;
      var2 += 42040;
      var2 += 4527;
      var2 ^= 59667;
      var2 ^= 60420;
      var2 -= 37104;
      var2 += 17405;
      var2 += 63256;
      var2 -= 10659;
      var2 += 2123;
      return var2 ^ 58104;
   }

   private static llIllII[] l() {
      return new llIllII[]{I, l};
   }
}
