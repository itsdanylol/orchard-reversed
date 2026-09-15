package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIllIllI(double a, double b) {
   private final double I;
   private final double l;

   public double I() {
      return this.l;
   }

   private IIIllIllI(double a, double b) {
      this.l = a;
      this.I = b;
   }

   public double l() {
      return this.I;
   }
}
