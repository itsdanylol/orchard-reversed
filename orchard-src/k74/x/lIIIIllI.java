package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lIIIIllI {
   I,
   II,
   Il;

   private static final lIIIIllI[] l;
   private static final Object[] III;
   private static final int[] lI;
   private static final String[] ll;

   private static String Il(short var0, int var1, byte var2, short var3) {
      int var8 = var1 ^ 542357443;
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
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 53165;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 25) {
            default -> 178;
            case 1 -> 143;
            case 2 -> 44;
            case 3 -> 23;
            case 4 -> 90;
            case 5 -> 149;
            case 6 -> 148;
            case 7 -> 183;
            case 8 -> 95;
            case 9 -> 153;
            case 10 -> 161;
            case 11 -> 60;
            case 12 -> 136;
            case 13 -> 249;
            case 14 -> 231;
            case 15 -> 185;
            case 16 -> 40;
            case 17 -> 152;
            case 18 -> 97;
            case 19 -> 117;
            case 20 -> 238;
            case 21 -> 229;
            case 22 -> 113;
            case 23 -> 7;
            case 24 -> 57;
         } ^ var6 ^ var0 ^ var5 ^ var2 ^ var3 ^ var1);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = -1146886317;
      byte var14 = -1;
      String var8 = "俁伸俽侘侚俽伡佦俊佞侅俵伡佫伥例侷伸侲";
      char[] var9 = "\u0d99".toCharArray();
      short var7 = 3466;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            ll = var10;
            III = new Object[var10.length];
            int var21 = 0;
            int var10001 = 0;
            byte[] var10002 = "\\ù¯O¼ÖÕÉklÀ?ì;sÿYÅ9vR?\u009eÆ\"1Ceú[\u008eÂb\u008e\u0091\u0093".getBytes("ISO-8859-1");
            lI = new int[9];

            int var44;
            do {
               lI[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 2101136572;
               var21 += 1;
               var44 = var10001 + 4;
               var10001 += 4;
            } while (var44 < var10002.length);

            String[] var0 = new String[3];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il((short)-15253, 542357443, (byte)-54, (short)1989)).length();
            char var2 = 4;
            int var1 = -1;

            while (true) {
               label87: {
                  var21 = II(135196976, var18 ^ 1838646979);
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
                        break label87;
                     }

                     var64 = var45;
                     var55 = var21;
                     var71 = var6;
                  }

                  while (true) {
                     var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % II(135196977, var18 ^ -1917256651)) {
                        case 0 -> II(135196978, var18 ^ 1510140304);
                        case 1 -> II(135196979, var18 ^ -581608908);
                        case 2 -> II(135196980, var18 ^ 1756041450);
                        case 3 -> II(135196981, var18 ^ 1666299671);
                        case 4 -> II(135196982, var18 ^ 325020339);
                        case 5 -> II(135196983, var18 ^ -885676382);
                        default -> II(135196984, var18 ^ 1407236098);
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
                  Il = new lIIIIllI();
                  II = new lIIIIllI();
                  I = new lIIIIllI();
                  l = l();
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 86;
                  case 1 -> 189;
                  case 2 -> 160;
                  case 3 -> 178;
                  case 4 -> 192;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ 135196976] ^ var1 ^ var0;
      var2 ^= 54906;
      var2 ^= 27078;
      var2 += 57265;
      var2 -= 15007;
      var2 += 40581;
      var2 -= 65392;
      return var2 + 28482;
   }

   public static lIIIIllI I(String var0) {
      return Enum.valueOf(lIIIIllI.class, var0);
   }

   private static lIIIIllI[] l() {
      return new lIIIIllI[]{Il, II, I};
   }
}
