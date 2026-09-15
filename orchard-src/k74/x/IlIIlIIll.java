package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlIIlIIll(boolean a, double supportRatio, double leadingSupportRatio) {
   private final double I;
   private final boolean l;
   private final double II;

   private IlIIlIIll(boolean a, double supportRatio, double leadingSupportRatio) {
      this.l = a;
      this.I = supportRatio;
      this.II = leadingSupportRatio;
   }

   private boolean I() {
      return this.l && this.I >= 0.74 && this.II >= 0.65;
   }

   public double l() {
      return this.II;
   }

   public double II() {
      return this.I;
   }

   public boolean Il() {
      return this.l;
   }
}
