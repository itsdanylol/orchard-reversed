package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lIIlIlI(int q, float r, float s) {
   private final float I;
   private final float l;
   private final int II;

   public float I() {
      return this.l;
   }

   public float l() {
      return this.I;
   }

   private lIIlIlI(int q, float r, float s) {
      this.II = q;
      this.I = r;
      this.l = s;
   }
}
