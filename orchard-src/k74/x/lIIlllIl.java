package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record lIIlllIl(float a3, float a4) {
   private final float I;
   private final float l;

   public float I() {
      return this.l;
   }

   public float l() {
      return this.I;
   }

   public lIIlllIl(float a3, float a4) {
      this.l = a3;
      this.I = a4;
   }
}
