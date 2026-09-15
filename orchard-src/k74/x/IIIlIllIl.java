package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;
import net.minecraft.class_5251;

@Environment(EnvType.CLIENT)
public final class IIIlIllIl {
   private static final int[] I = new int[13];

   private static boolean I(String var0) {
      int var4 = 1429860641;
      if (var0.length() != lI(-1427492960, var4 ^ -854920242)) {
         return false;
      } else {
         for (int var1 = 0; var1 < lI(-1427492959, var4 ^ -2087773036); var1++) {
            char var2 = var0.charAt(var1);
            boolean var3 = var2 >= lI(-1427492958, var4 ^ -438038489) && var2 <= lI(-1427492957, var4 ^ 1708877756)
               || var2 >= lI(-1427492956, var4 ^ -237217823) && var2 <= lI(-1427492955, var4 ^ -1276999010)
               || var2 >= lI(-1427492954, var4 ^ -1770105333) && var2 <= lI(-1427492953, var4 ^ -1024663818);
            if (!var3) {
               return false;
            }
         }

         return true;
      }
   }

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "ÜX°Þ\u0092Ý_\u0085ô¶S\u001ft\u0089%\\à\u008e\u0016n¢°Ëk\u0087,\u0014æÓ¾\u009c!úu\"qt§~\u0006\u0085_\u008e·\bÓ²c\u0098¿\u0097\r"
         .getBytes("ISO-8859-1");

      int var14;
      do {
         I[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -293399871;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);
   }

   public static class_2561 l(String var0) {
      int var10 = 2036756623;
      class_5250 var2 = class_2561.method_43473();
      String[] var10000 = IIllllIl.IIIIl();
      StringBuilder var3 = new StringBuilder();
      String[] var1 = var10000;
      class_2583 var4 = class_2583.field_24360;
      int var5 = 0;

      while (var5 < var0.length()) {
         char var6 = var0.charAt(var5);
         if (var6 == lI(-1427492952, var10 ^ -948379417) && var5 + 1 < var0.length()) {
            if (!var3.isEmpty()) {
               var2.method_10852(class_2561.method_43470(var3.toString()).method_10862(var4));
               var3.setLength(0);
            }

            String var7;
            char var8;
            if ((var8 = var0.charAt(var5 + 1)) == lI(-1427492951, var10 ^ 1235926164)
               && var5 + lI(-1427492950, var10 ^ -1202566142) < var0.length()
               && I(var7 = var0.substring(var5 + 2, var5 + lI(-1427492949, var10 ^ 903770324)))) {
               int var9 = Integer.parseInt(var7, lI(-1427492948, var10 ^ -1515039307));
               var4 = var4.method_27703(class_5251.method_27717(var9));
               var5 += 8;
               if (var1 == null) {
                  continue;
               }
            }

            class_124 var12 = Il(var8);
            if (var12 != null) {
               label72: {
                  if (var12 == class_124.field_1070) {
                     var4 = class_2583.field_24360;
                     if (var1 == null) {
                        break label72;
                     }
                  }

                  if (var12.method_543()) {
                     var4 = var4.method_27703(class_5251.method_27718(var12));
                     var4 = var4.method_10982(false).method_10978(false).method_30938(false).method_36140(false).method_36141(false);
                     if (var1 == null) {
                        break label72;
                     }
                  }

                  var4 = II(var4, var12);
               }

               var5 += 2;
               if (var1 == null) {
                  continue;
               }
            }
         }

         var3.append(var6);
         var5++;
         if (var1 != null) {
            break;
         }
      }

      if (!var3.isEmpty()) {
         var2.method_10852(class_2561.method_43470(var3.toString()).method_10862(var4));
      }

      return var2;
   }

   private IIIlIllIl() {
   }

   private static class_2583 II(class_2583 var0, class_124 var1) {
      return switch (IIIlIII.I[var1.ordinal()]) {
         case 1 -> var0.method_10982(true);
         case 2 -> var0.method_10978(true);
         case 3 -> var0.method_30938(true);
         case 4 -> var0.method_36140(true);
         case 5 -> var0.method_36141(true);
         default -> var0;
      };
   }

   private static int lI(int var0, int var1) {
      int var2 = I[var0 ^ -1427492960] ^ var1 ^ var0;
      var2 -= 16338;
      var2 -= 46275;
      var2 += 59381;
      var2 -= 11504;
      var2 ^= 33635;
      var2 -= 63455;
      var2 ^= 39543;
      var2 -= 20807;
      var2 -= 59970;
      return var2 - 2340;
   }

   private static class_124 Il(char var0) {
      var0 = Character.toLowerCase(var0);

      return switch (var0) {
         case '0' -> class_124.field_1074;
         case '1' -> class_124.field_1058;
         case '2' -> class_124.field_1077;
         case '3' -> class_124.field_1062;
         case '4' -> class_124.field_1079;
         case '5' -> class_124.field_1064;
         case '6' -> class_124.field_1065;
         case '7' -> class_124.field_1080;
         case '8' -> class_124.field_1063;
         case '9' -> class_124.field_1078;
         default -> null;
         case 'a' -> class_124.field_1060;
         case 'b' -> class_124.field_1075;
         case 'c' -> class_124.field_1061;
         case 'd' -> class_124.field_1076;
         case 'e' -> class_124.field_1054;
         case 'f' -> class_124.field_1068;
         case 'k' -> class_124.field_1051;
         case 'l' -> class_124.field_1067;
         case 'm' -> class_124.field_1055;
         case 'n' -> class_124.field_1073;
         case 'o' -> class_124.field_1056;
         case 'r' -> class_124.field_1070;
      };
   }
}
