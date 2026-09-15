package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lllIIIIl(String a, String b, boolean c) {
   private final String I;
   private final boolean l;
   private final String II;

   public boolean I() {
      return this.l;
   }

   public String l() {
      return this.I;
   }

   private lllIIIIl(String a, String b, boolean c) {
      this.I = a;
      this.II = b;
      this.l = c;
   }
}
