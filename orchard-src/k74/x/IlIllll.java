package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlIllll(double x, double y, double w, double h) {
   private final double I;
   private final double l;
   private final double II;
   private final double Il;

   private IlIllll(double x, double y, double w, double h) {
      this.II = x;
      this.Il = y;
      this.I = w;
      this.l = h;
   }

   public double I() {
      return this.l;
   }

   public double l() {
      return this.Il;
   }

   public double II() {
      return this.I;
   }

   public double Il() {
      return this.II;
   }
}
