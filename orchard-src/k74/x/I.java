package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record I(float a, float b) {
   private final float I;
   private final float l;

   public I(float a, float b) {
      this.l = a;
      this.I = b;
   }
}
