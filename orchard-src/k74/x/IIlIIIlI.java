package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIlIIIlI(IlIIIIlII ad, int ae, int af, float ag, float ah) {
   private final float I;
   private final int l;
   private final float II;
   private final int Il;
   private final IlIIIIlII lI;

   public float I() {
      return this.II;
   }

   private IIlIIIlI(IlIIIIlII ad, int ae, int af, float ag, float ah) {
      this.lI = ad;
      this.l = ae;
      this.Il = af;
      this.I = ag;
      this.II = ah;
   }

   public IlIIIIlII II() {
      return this.lI;
   }

   public float lI() {
      return this.I;
   }
}
