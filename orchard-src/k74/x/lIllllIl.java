package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lIllllIl(double a, double b, double c, double d, int e) {
   private final double I;
   private final double l;
   private final double II;
   private final int Il;
   private final double lI;

   private lIllllIl(double a, double b, double c, double d, int e) {
      this.II = a;
      this.lI = b;
      this.l = c;
      this.I = d;
      this.Il = e;
   }

   public double I() {
      return this.II;
   }

   public double l() {
      return this.lI;
   }

   private boolean II() {
      return this.Il > 0 && this.lI > this.II && this.I > this.l;
   }

   public double lI() {
      return this.l;
   }

   public double ll() {
      return this.I;
   }
}
