package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlllIlll(double t, double u, boolean v) {
   private final boolean I;
   private final double l;
   private final double II;

   private IlllIlll(double t, double u, boolean v) {
      this.l = t;
      this.II = u;
      this.I = v;
   }

   public double I() {
      return this.l;
   }

   public double l() {
      return this.II;
   }

   public boolean II() {
      return this.I;
   }
}
