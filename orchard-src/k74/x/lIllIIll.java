package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record lIllIIll(double x, double y, double distanceSq) {
   private final double I;
   private final double l;
   private final double II;

   public double I() {
      return this.II;
   }

   public double l() {
      return this.I;
   }

   public double II() {
      return this.l;
   }

   public lIllIIll(double x, double y, double distanceSq) {
      this.II = x;
      this.l = y;
      this.I = distanceSq;
   }
}
