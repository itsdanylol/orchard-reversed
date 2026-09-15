package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIlIlll(float a, float at) {
   private final float I;
   private final float l;

   public float I() {
      return this.l;
   }

   private IIlIlll(float a, float at) {
      this.l = a;
      this.I = at;
   }

   public float l() {
      return this.I;
   }
}
