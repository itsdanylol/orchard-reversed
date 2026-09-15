package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIlIllIIl(int a, int b, double c, double d) {
   private final int I;
   private final int l;
   private final double II;
   private final double Il;

   public double I() {
      return this.II;
   }

   public double l() {
      return this.Il;
   }

   private IIlIllIIl(int a, int b, double c, double d) {
      this.l = a;
      this.I = b;
      this.II = c;
      this.Il = d;
   }

   double II(double var1) {
      return this.II > 0.0 ? var1 / this.II : var1;
   }

   public int Il() {
      return this.I;
   }

   public int lI() {
      return this.l;
   }

   double ll(double var1) {
      return this.Il > 0.0 ? var1 / this.Il : var1;
   }
}
