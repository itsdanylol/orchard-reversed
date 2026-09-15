package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record IIIlIIIII(double a6, double a7, double a8, double a9) {
   private final double I;
   private final double l;
   private final double II;
   private final double Il;

   public double I() {
      return this.l;
   }

   public double l() {
      return this.Il;
   }

   public IIIlIIIII(double a6, double a7, double a8, double a9) {
      this.Il = a6;
      this.l = a7;
      this.I = a8;
      this.II = a9;
   }

   public double II() {
      return this.I;
   }

   public double Il() {
      return this.II;
   }
}
