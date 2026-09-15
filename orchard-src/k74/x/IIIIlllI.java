package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIIlllI(int a, IIIIIlIl b) {
   private final IIIIIlIl I;
   private final int l;

   public int I() {
      return this.l;
   }

   private IIIIlllI(int a, IIIIIlIl b) {
      this.l = a;
      this.I = b;
   }

   public IIIIIlIl l() {
      return this.I;
   }
}
