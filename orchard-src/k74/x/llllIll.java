package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record llllIll(float yaw, float pitch) {
   private final float I;
   private final float l;

   private llllIll(float yaw, float pitch) {
      this.I = yaw;
      this.l = pitch;
   }

   public float I() {
      return this.l;
   }

   public float l() {
      return this.I;
   }
}
