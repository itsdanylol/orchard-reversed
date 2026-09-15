package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IlIIIlIlI {
   l,
   II;

   private static final IlIIIlIlI[] I;
   private static final int[] Il;
   private static final Object[] ll;
   private static final String[] lI;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -1562227722;
      short var12 = 32350;
      String[] var9 = new String[1];
      int var11 = 0;
      int var8 = "\u0010祺궫硹굣紝贡砊\uedba窣䶋竅趷縦굺窺බ".length();
      String var7 = "\u0010祺궫硹굣紝贡砊\uedba窣䶋竅趷縦굺窺බ";
      int var10 = 0;

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 81;
               case 1 -> 64;
               case 2 -> 106;
               case 3 -> 158;
               case 4 -> 86;
               case 5 -> 221;
               case 6 -> 129;
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
      int var21 = 0;
      int var10001 = 0;
      Il = new int[10];
      byte[] var10002 = "Ãë>È¾\u0013é!<î\u0093\u008dz ÞÃ\u0013±=\u009e=¥5²v÷Ã»BW·\u001b\u009eêð\u0007\u0006\u0006òÃ".getBytes("ISO-8859-1");

      int var44;
      do {
         Il[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -12145667;
         var21 += 1;
         var44 = var10001 + 4;
         var10001 += 4;
      } while (var44 < var10002.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il((byte)23, 1436225318, (short)-25739, 1213838054, (short)-10308, '\ue6b9', (short)7852)).length();
      int var2 = II(862647715, var17 ^ 1390046586);
      int var1 = -1;

      while (true) {
         label88: {
            var21 = II(862647714, var17 ^ 790804505);
            char[] var45 = var3.substring(++var1, var1 + var2).toCharArray();
            int var55 = var45.length;
            int var6 = 0;
            var44 = var21;
            var34 = var45;
            var10001 = var55;
            char[] var64;
            int var71;
            if (var55 <= 1) {
               var64 = var45;
               var55 = var21;
               var71 = var6;
            } else {
               var44 = var21;
               var10001 = var55;
               if (var55 <= var6) {
                  break label88;
               }

               var64 = var45;
               var55 = var21;
               var71 = var6;
            }

            while (true) {
               var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % II(862647713, var17 ^ -1377845186)) {
                  case 0 -> II(862647712, var17 ^ -342782113);
                  case 1 -> II(862647719, var17 ^ -2105512785);
                  case 2 -> II(862647718, var17 ^ -1399561089);
                  case 3 -> II(862647717, var17 ^ -406416743);
                  case 4 -> II(862647716, var17 ^ -748231111);
                  case 5 -> II(862647723, var17 ^ 266051990);
                  default -> II(862647722, var17 ^ -1757961404);
               });
               var6++;
               if (var44 == 0) {
                  var71 = var44;
                  var64 = var34;
                  var55 = var44;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var64 = var34;
                  var55 = var44;
                  var71 = var6;
               }
            }
         }

         String var48 = new String(var34).intern();
         byte var28 = -1;
         var0[var4++] = var48;
         if ((var1 += var2) >= var5) {
            II = new IlIIIlIlI();
            l = new IlIIIlIlI();
            I = l();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static String Il(byte var0, int var1, short var2, int var3, short var4, char var5, short var6) {
      int var11 = var3 ^ 1213838054;
      char[] var10 = lI[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])ll[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         ll[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 5795;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 18) {
            default -> 188;
            case 1 -> 155;
            case 2 -> 158;
            case 3 -> 58;
            case 4 -> 113;
            case 5 -> 85;
            case 6 -> 133;
            case 7 -> 204;
            case 8 -> 144;
            case 9 -> 146;
            case 10 -> 148;
            case 11 -> 217;
            case 12 -> 109;
            case 13 -> 109;
            case 14 -> 207;
            case 15 -> 107;
            case 16 -> 195;
            case 17 -> 164;
         } ^ 51520 ^ var8 ^ var1 ^ var0 ^ var5 ^ var3 ^ var2 ^ var6 ^ var4);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   public static IlIIIlIlI I(String var0) {
      return Enum.valueOf(IlIIIlIlI.class, var0);
   }

   private static int II(int var0, int var1) {
      int var2 = Il[var0 ^ 862647715] ^ var1 ^ var0;
      var2 += 53213;
      var2 ^= 7438;
      var2 += 29193;
      var2 -= 18177;
      var2 ^= 52903;
      return var2 ^ 64160;
   }

   private static IlIIIlIlI[] l() {
      return new IlIIIlIlI[]{II, l};
   }
}
