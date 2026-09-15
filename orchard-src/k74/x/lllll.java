package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lllll(double x, double y, double width, double height, double distanceSq, double healthPercent, double alpha) {
   private final double I;
   private final double l;
   private final double II;
   private final double Il;
   private final double lI;
   private final double ll;
   private final double III;

   public double I() {
      return this.ll;
   }

   public double l() {
      return this.I;
   }

   public double II() {
      return this.lI;
   }

   lllll Il(double var1, double var3, double var5, double var7) {
      return new lllll(var1, var3, var5, var7, this.ll, this.lI, this.Il);
   }

   public double lI() {
      return this.l;
   }

   public double ll() {
      return this.II;
   }

   public double III() {
      return this.Il;
   }

   private lllll(double x, double y, double width, double height, double distanceSq, double healthPercent, double alpha) {
      this.l = x;
      this.I = y;
      this.III = width;
      this.II = height;
      this.ll = distanceSq;
      this.lI = healthPercent;
      this.Il = alpha;
   }

   public double IIl() {
      return this.III;
   }
}
