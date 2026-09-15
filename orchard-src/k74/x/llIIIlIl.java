package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record llIIIlIl(Object a, int b, int c, long d, long e, IlllII f) {
   private final long I;
   private final IlllII l;
   private final int II;
   private final long Il;
   private final int lI;
   private final Object ll;

   public IlllII I() {
      return this.l;
   }

   public long l() {
      return this.Il;
   }

   llIIIlIl(Object a, int b, int c, long d, long e, IlllII f) {
      this.ll = a;
      this.II = b;
      this.lI = c;
      this.Il = d;
      this.I = e;
      this.l = f;
   }

   public long II() {
      return this.I;
   }

   public int Il() {
      return this.lI;
   }

   public int lI() {
      return this.II;
   }
}
