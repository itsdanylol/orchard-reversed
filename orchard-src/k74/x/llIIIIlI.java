package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record llIIIIlI(float a, float b) {
   private static final llIIIIlI I = new llIIIIlI(0.0F, 0.0F);
   private final float l;
   private final float II;

   private boolean I() {
      return Math.abs(this.II) > 1.0E-4F || Math.abs(this.l) > 1.0E-4F;
   }

   llIIIIlI(float a, float b) {
      this.II = a;
      this.l = b;
   }

   public float l() {
      return this.II;
   }

   public float II() {
      return this.l;
   }
}
