package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lllIIlll(double a, double b) {
   private final double I;
   private final double l;

   public double I() {
      return this.l;
   }

   public double l() {
      return this.I;
   }

   private lllIIlll(double a, double b) {
      this.l = a;
      this.I = b;
   }
}
