package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIllI(float a, float b) {
   private final float I;
   private final float l;

   private IIIllI(float a, float b) {
      this.l = a;
      this.I = b;
   }

   public float I() {
      return this.l;
   }

   public float l() {
      return this.I;
   }
}
