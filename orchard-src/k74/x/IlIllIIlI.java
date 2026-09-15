package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record IlIllIIlI(double a, double b, double c) {
   private final double I;
   private final double l;
   private final double II;

   public double l() {
      return this.II;
   }

   public double II() {
      return this.l;
   }

   public IlIllIIlI(double a, double b, double c) {
      this.l = a;
      this.II = b;
      this.I = c;
   }
}
