package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record llllIl(double a, double b, double c, double d) {
   private final double I;
   private final double l;
   private final double II;
   private final double Il;

   private llllIl(double a, double b, double c, double d) {
      this.II = a;
      this.Il = b;
      this.I = c;
      this.l = d;
   }

   public double I() {
      return this.l;
   }

   public double l() {
      return this.I;
   }

   private static llllIl Il(double var0, double var2, double var4, double var6) {
      return new llllIl(Math.min(var0, var4), Math.min(var2, var6), Math.max(var0, var4), Math.max(var2, var6));
   }

   public double lI() {
      return this.Il;
   }

   private llllIl ll(llllIl var1) {
      return new llllIl(Math.max(this.II, var1.II), Math.max(this.Il, var1.Il), Math.min(this.I, var1.I), Math.min(this.l, var1.l));
   }
}
