package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record IIIllIIIl(class_243 a, float yaw, float pitch, float yawDelta, float pitchDelta, float rawYawDelta, float rawPitchDelta) {
   private final float I;
   private final class_243 l;
   private final float II;
   private final float Il;
   private final float lI;
   private final float ll;
   private final float III;

   private IIIllIIIl(class_243 a, float yaw, float pitch, float yawDelta, float pitchDelta, float rawYawDelta, float rawPitchDelta) {
      this.l = a;
      this.I = yaw;
      this.ll = pitch;
      this.II = yawDelta;
      this.Il = pitchDelta;
      this.III = rawYawDelta;
      this.lI = rawPitchDelta;
   }

   public float l() {
      return this.ll;
   }

   public float II() {
      return this.III;
   }

   public float Il() {
      return this.II;
   }

   public float lI() {
      return this.Il;
   }

   public float ll() {
      return this.lI;
   }

   public class_243 III() {
      return this.l;
   }
}
