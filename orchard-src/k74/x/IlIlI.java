package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlIlI(long a, IIIlllIlI b, int c) {
   private final IIIlllIlI I;
   private final int l;
   private final long II;

   public int I() {
      return this.l;
   }

   public long l() {
      return this.II;
   }

   private IlIlI(long a, IIIlllIlI b, int c) {
      this.II = a;
      this.I = b;
      this.l = c;
   }

   public IIIlllIlI II() {
      return this.I;
   }
}
