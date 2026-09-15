package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIlllIIII(double a, double b, double c, double d) {
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

   public double II() {
      return this.I;
   }

   private IIlllIIII(double a, double b, double c, double d) {
      this.Il = a;
      this.l = b;
      this.I = c;
      this.II = d;
   }

   public double Il() {
      return this.II;
   }
}
