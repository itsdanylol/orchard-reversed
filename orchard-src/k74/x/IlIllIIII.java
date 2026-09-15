package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record IlIllIIII(double x, double y, float c) {
   private final double I;
   private final float l;
   private final double II;

   public float I() {
      return this.l;
   }

   public double l() {
      return this.II;
   }

   public IlIllIIII(double x, double y, float c) {
      this.I = x;
      this.II = y;
      this.l = c;
   }

   public double II() {
      return this.I;
   }
}
