package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlIIlllII(lIIIIII a, boolean b, int c) {
   private final boolean I;
   private final lIIIIII l;
   private final int II;

   public lIIIIII I() {
      return this.l;
   }

   public boolean l() {
      return this.I;
   }

   private IlIIlllII II(int var1) {
      return new IlIIlllII(this.l, this.I, var1);
   }

   public int Il() {
      return this.II;
   }

   private IlIIlllII(lIIIIII a, boolean b, int c) {
      this.l = a;
      this.I = b;
      this.II = c;
   }
}
