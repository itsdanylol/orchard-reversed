package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lIIlIIl(double x, double y, int c) {
   private final double I;
   private final double l;
   private final int II;

   public int I() {
      return this.II;
   }

   private lIIlIIl(double x, double y, int c) {
      this.I = x;
      this.l = y;
      this.II = c;
   }

   public double l() {
      return this.I;
   }

   public double II() {
      return this.l;
   }
}
