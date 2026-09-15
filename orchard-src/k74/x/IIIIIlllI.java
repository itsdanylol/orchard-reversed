package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIIIIlllI {
   I,
   II;

   private static final Object[] III;
   private static final IIIIIlllI[] l;
   private static final int[] lI;
   private static final String[] ll;
   private final IIIlIlIl Il;

   private IIIIIlllI(IIIlIlIl var3) {
      this.Il = var3;
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ -955319441] ^ var1 ^ var0;
      var2 += 14148;
      var2 ^= 28182;
      var2 -= 25492;
      var2 -= 34129;
      var2 ^= 64514;
      var2 ^= 32886;
      var2 += 11902;
      return var2 - 15317;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -815970270;
      int var10 = 0;
      String[] var9 = new String[2];
      int var8 = "\u000f쒻籰쓗ﱌ앫㱝씇뱑씇ﱅ쟷㱲엫籐윏\u000f폔\u0d11틄贵툀촢폠촣퉴촯텈贓펈䴵턴".length();
      int var11 = 0;
      short var12 = 16102;
      String var7 = "\u000f쒻籰쓗ﱌ앫㱝씇뱑씇ﱅ쟷㱲엫籐윏\u000f폔\u0d11틄贵툀촢폠촣퉴촯텈贓펈䴵턴";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      int var10000 = 0;
      lI = new int[12];
      int var10001 = 0;
      byte[] var10002 = "Ò.Zhu°>\u0005\u008f9lÀ8\u0098Tcªùð\u009a0\u0003\u009c\bé+¡\u007f\u008a¡×\u008dI)]E\u0018í£3\u0089Å\u001c\u0007\u0087ñ(\u0084"
         .getBytes("ISO-8859-1");

      int var52;
      do {
         lI[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1553189433;
         var10000 += 1;
         var52 = var10001 + 4;
         var10001 += 4;
      } while (var52 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(611113934, var17 ^ -1981859716)).length();
      int var2 = II(-955319441, var17 ^ -2031165474);
      int var19 = -1;

      label91:
      while (true) {
         var10000 = II(-955319442, var17 ^ 561035837);
         String var24 = var3.substring(++var19, var19 + var2);
         byte var36 = -1;

         while (true) {
            label86: {
               char[] var54 = var24.toCharArray();
               int var66 = var54.length;
               int var6 = 0;
               var52 = var10000;
               var41 = var54;
               var10001 = var66;
               char[] var78;
               int var85;
               if (var66 <= 1) {
                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               } else {
                  var52 = var10000;
                  var10001 = var66;
                  if (var66 <= var6) {
                     break label86;
                  }

                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               }

               while (true) {
                  var78[var85] = (char)(var78[var85] ^ var66 ^ switch (var6 % II(-955319445, var17 ^ -29788865)) {
                     case 0 -> II(-955319446, var17 ^ 1690494403);
                     case 1 -> II(-955319447, var17 ^ -1108682583);
                     case 2 -> II(-955319448, var17 ^ -564046939);
                     case 3 -> II(-955319449, var17 ^ 501864768);
                     case 4 -> II(-955319450, var17 ^ 1278027772);
                     case 5 -> II(-955319451, var17 ^ -586914355);
                     default -> II(-955319452, var17 ^ -751808155);
                  });
                  var6++;
                  if (var52 == 0) {
                     var85 = var52;
                     var78 = var41;
                     var66 = var52;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var78 = var41;
                     var66 = var52;
                     var85 = var6;
                  }
               }
            }

            String var59 = new String(var41).intern();
            switch (var36) {
               case 0:
                  var0[var4++] = var59;
                  if ((var19 += var2) >= var5) {
                     I = new IIIIIlllI(IlIIllIII.Ill(var0[0]));
                     II = new IIIIIlllI(IlIIllIII.Ill(var0[3]));
                     l = l();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var59;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label91;
                  }

                  var5 = (var3 = Il(611113935, var17 ^ 1280405457)).length();
                  var2 = II(-955319443, var17 ^ -604378782);
                  var19 = -1;
            }

            var10000 = II(-955319444, var17 ^ 1817760214);
            var24 = var3.substring(++var19, var19 + var2);
            var36 = 0;
         }
      }
   }

   public IIIlIlIl I() {
      return this.Il;
   }

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ 611113934;
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])III[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         III[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -942665096;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 126;
            case 1 -> 227;
            case 2 -> 124;
            case 3 -> 48;
            case 4 -> 14;
            case 5 -> 1;
            case 6 -> 0;
            case 7 -> 35;
            case 8 -> 57;
            case 9 -> 120;
            case 10 -> 165;
            case 11 -> 226;
            case 12 -> 109;
            case 13 -> 57;
            case 14 -> 168;
            case 15 -> 26;
            case 16 -> 57;
            case 17 -> 246;
            case 18 -> 44;
            case 19 -> 16;
            case 20 -> 35;
            case 21 -> 47;
            case 22 -> 111;
            case 23 -> 64;
            case 24 -> 14;
            case 25 -> 143;
            case 26 -> 115;
            case 27 -> 130;
            case 28 -> 111;
            case 29 -> 55;
            case 30 -> 47;
            case 31 -> 28;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static IIIIIlllI[] l() {
      return new IIIIIlllI[]{I, II};
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }
}
