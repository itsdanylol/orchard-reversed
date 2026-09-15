package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlIlII(IIIlIlIl a, int b) {
   private final int I;
   private final IIIlIlIl l;

   public IIIlIlIl I() {
      return this.l;
   }

   private IlIlII(IIIlIlIl a, int b) {
      this.l = a;
      this.I = b;
   }

   public int l() {
      return this.I;
   }
}
