package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIIIll(int a0, int a1, int a2) {
   private final int I;
   private final int l;
   private final int II;

   public int I() {
      return this.II;
   }

   public int l() {
      return this.I;
   }

   public int II() {
      return this.l;
   }

   private IIIIIll(int a0, int a1, int a2) {
      this.l = a0;
      this.II = a1;
      this.I = a2;
   }
}
