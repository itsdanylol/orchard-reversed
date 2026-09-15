package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lIlIlIlI(double x, double y, double width, double height, double distanceSq, long f) {
   private final double I;
   private final double l;
   private final long II;
   private final double Il;
   private final double lI;
   private final double ll;

   public double I() {
      return this.ll;
   }

   public double l() {
      return this.I;
   }

   private lIlIlIlI(double x, double y, double width, double height, double distanceSq, long f) {
      this.Il = x;
      this.ll = y;
      this.lI = width;
      this.I = height;
      this.l = distanceSq;
      this.II = f;
   }

   public double ll() {
      return this.l;
   }
}
