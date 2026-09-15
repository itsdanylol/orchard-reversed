package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlIIllllI(IIIlIlIl a, IIIlIlIl b) {
   private final IIIlIlIl I;
   private final IIIlIlIl l;

   public IIIlIlIl I() {
      return this.l;
   }

   public IIIlIlIl l() {
      return this.I;
   }

   private IlIIllllI(IIIlIlIl a, IIIlIlIl b) {
      this.l = a;
      this.I = b;
   }
}
