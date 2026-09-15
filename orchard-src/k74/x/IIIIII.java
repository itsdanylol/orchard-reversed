package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIIII(long a, lIlllII b, int c) {
   private final int I;
   private final long l;
   private final lIlllII II;

   public lIlllII I() {
      return this.II;
   }

   private IIIIII(long a, lIlllII b, int c) {
      this.l = a;
      this.II = b;
      this.I = c;
   }

   public int l() {
      return this.I;
   }

   public long II() {
      return this.l;
   }
}
