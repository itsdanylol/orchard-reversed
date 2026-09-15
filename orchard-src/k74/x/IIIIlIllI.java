package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIIlIllI(int aF, IIIIll aG) {
   private final int I;
   private final IIIIll l;

   private IIIIlIllI(int aF, IIIIll aG) {
      this.I = aF;
      this.l = aG;
   }

   public IIIIll I() {
      return this.l;
   }

   public int l() {
      return this.I;
   }
}
