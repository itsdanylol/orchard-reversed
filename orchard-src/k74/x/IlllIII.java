package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IlllIII {
   public static double I(double var0) {
      double var2 = ll(var0);
      return var2 * var2 * var2 * (var2 * (var2 * 6.0 - 15.0) + 10.0);
   }

   public static double l(double var0, double var2) {
      double var4 = ll(var0);
      double var6 = Math.max(0.0, Math.min(8.0, var2 * 60.0));
      return 1.0 - Math.pow(1.0 - var4, var6);
   }

   public static double II(double var0) {
      double var2 = ll(var0) - 1.0;
      return 1.0 + var2 * var2 * (2.70158 * var2 + 1.70158);
   }

   public static double Il(double var0) {
      double var2 = ll(var0);
      return var2 >= 1.0 ? 1.0 : 1.0 - Math.pow(2.0, -10.0 * var2);
   }

   public static double lI(double var0, double var2, double var4, double var6) {
      return var0 + (var2 - var0) * l(var4, var6);
   }

   private IlllIII() {
   }

   public static double ll(double var0) {
      return Math.max(0.0, Math.min(1.0, var0));
   }

   public static double III(double var0) {
      double var2 = ll(var0);
      return var2 < 0.5 ? 4.0 * var2 * var2 * var2 : 1.0 - Math.pow(-2.0 * var2 + 2.0, 3.0) * 0.5;
   }

   public static double IIl(double var0) {
      double var2 = 1.0 - ll(var0);
      return 1.0 - var2 * var2 * var2;
   }
}
