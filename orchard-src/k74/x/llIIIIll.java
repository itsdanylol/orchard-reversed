package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record llIIIIll(double minX, double minY, double maxX, double maxY) {
   private final double I;
   private final double l;
   private final double II;
   private final double Il;

   public double I() {
      return (this.II + this.I) * 0.5;
   }

   public double l() {
      return (this.Il + this.l) * 0.5;
   }

   public double Il() {
      return this.I - this.II;
   }

   public double lI() {
      return this.Il;
   }

   public double ll() {
      return this.l - this.Il;
   }

   public double III() {
      return this.l;
   }

   public double IIl() {
      return this.I;
   }

   public llIIIIll(double minX, double minY, double maxX, double maxY) {
      this.II = minX;
      this.Il = minY;
      this.I = maxX;
      this.l = maxY;
   }
}
