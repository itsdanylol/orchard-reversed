package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIlIlII(IIIIlIl a, IlIIIllIl f, int g, boolean h) {
   private final IIIIlIl I;
   private final int l;
   private final boolean II;
   private final IlIIIllIl Il;

   public boolean I() {
      return this.II;
   }

   public IlIIIllIl l() {
      return this.Il;
   }

   public IIIIlIl II() {
      return this.I;
   }

   private IIIlIlII(IIIIlIl a, IlIIIllIl f, int g, boolean h) {
      this.I = a;
      this.Il = f;
      this.l = g;
      this.II = h;
   }

   public int Il() {
      return this.l;
   }
}
