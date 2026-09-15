package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIIIIlIl(double a, long b) {
   private final long I;
   private final double l;

   public double I() {
      return this.l;
   }

   public long l() {
      return this.I;
   }

   private IIIIIIlIl(double a, long b) {
      this.l = a;
      this.I = b;
   }
}
