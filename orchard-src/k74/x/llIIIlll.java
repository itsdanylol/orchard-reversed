package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_2350.class_2351;

@Environment(EnvType.CLIENT)
public final class llIIIlll {
   private static final int[] II;
   private static final double I = 1.05;
   private static final int l = 6;

   public static class_243 I(class_1937 var0, class_243 var1, double var2) {
      if (var0 != null && var1 != null) {
         double var4 = l(var0, var1.field_1352, var1.field_1351, var1.field_1350, var2);
         return var4 != Double.NEGATIVE_INFINITY && var1.field_1351 < var4 ? new class_243(var1.field_1352, var4, var1.field_1350) : var1;
      } else {
         return var1;
      }
   }

   private llIIIlll() {
   }

   private static int lI(int var0, int var1) {
      int var2 = II[var0 ^ 2094906844] ^ var1 ^ var0;
      var2 ^= 32221;
      var2 ^= 57099;
      var2 -= 41069;
      var2 -= 26261;
      var2 += 18360;
      var2 += 33610;
      var2 -= 1199;
      var2 ^= 9206;
      return var2 + 10571;
   }

   static {
      int var2 = 363565191;
      byte[] var0 = "L\u008dú$".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      II = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         II[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);
   }

   public static double l(class_1937 var0, double var1, double var3, double var5, double var7) {
      double var9 = Math.max(0.0, var7 - 0.05);
      double var11 = Double.NEGATIVE_INFINITY;
      var11 = Math.max(var11, Il(var0, var1, var3, var5));
      var11 = Math.max(var11, Il(var0, var1 - var9, var3, var5 - var9));
      var11 = Math.max(var11, Il(var0, var1 - var9, var3, var5 + var9));
      var11 = Math.max(var11, Il(var0, var1 + var9, var3, var5 - var9));
      return Math.max(var11, Il(var0, var1 + var9, var3, var5 + var9));
   }

   public static class_243 II(class_1937 var0, class_1309 var1, class_243 var2, class_243 var3, double var4) {
      if (var0 != null && var1 != null && var3 != null) {
         double var6 = l(var0, var3.field_1352, var3.field_1351, var3.field_1350, var1.method_17681() / 2.0F);
         if (Double.isFinite(var6) && var6 != Double.NEGATIVE_INFINITY) {
            double var8 = var6 - var3.field_1351;
            if (var8 <= 0.0 || var4 > 0.08) {
               return var3;
            } else if (var8 <= 0.2) {
               return new class_243(var3.field_1352, var6, var3.field_1350);
            } else {
               return var8 <= 0.45 && var2 != null && Math.abs(var2.field_1351 - var6) <= 0.3 && var4 <= 0.02
                  ? new class_243(var3.field_1352, var6, var3.field_1350)
                  : var3;
            }
         } else {
            return var3;
         }
      } else {
         return var3;
      }
   }

   private static double Il(class_1937 var0, double var1, double var3, double var5) {
      int var8 = class_3532.method_15357(var3 + 1.0);
      String[] var10000 = IIllllIl.IIIIl();
      double var9 = Double.NEGATIVE_INFINITY;
      String[] var7 = var10000;
      int var11 = 0;

      while (var11 < lI(2094906844, 403867311 ^ 1038731002)) {
         class_2338 var12 = class_2338.method_49637(var1, var8 - var11, var5);
         class_2680 var13 = var0.method_8320(var12);
         class_265 var14 = var13.method_26220(var0, var12);
         if (!var14.method_1110()) {
            double var15 = var12.method_10264() + var14.method_1105(class_2351.field_11052);
            if (var15 <= var3 + 1.05) {
               var9 = Math.max(var9, var15);
            }
         }

         var11++;
         if (var7 != null) {
            break;
         }
      }

      return var9;
   }
}
