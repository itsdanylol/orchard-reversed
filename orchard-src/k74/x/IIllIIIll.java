package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIllIIIll(String a, int b, int c) {
   private final String I;
   private final int l;
   private final int II;

   public int I() {
      return this.l;
   }

   public String l() {
      return this.I;
   }

   IIllIIIll(String a, int b, int c) {
      this.I = a;
      this.l = b;
      this.II = c;
   }
}
