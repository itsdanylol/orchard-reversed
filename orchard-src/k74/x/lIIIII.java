package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lIIIII(double a, double b, double c) {
   private final double I;
   private final double l;
   private final double II;

   public double I() {
      return this.l;
   }

   public double l() {
      return this.II;
   }

   private lIIIII(double a, double b, double c) {
      this.II = a;
      this.l = b;
      this.I = c;
   }

   public double II() {
      return this.I;
   }
}
