package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIllIllII(float a, float b) {
   private final float I;
   private final float l;

   private IIllIllII(float a, float b) {
      this.l = a;
      this.I = b;
   }
}
