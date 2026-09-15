package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record Illlll(int a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
   private final double I;
   private final double l;
   private final double II;
   private final double Il;
   private final int lI;
   private final double ll;
   private final double III;
   private final double IIl;
   private final double IlI;
   private final double Ill;

   public double I() {
      return this.IIl;
   }

   private Illlll(int a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
      this.lI = a;
      this.IlI = b;
      this.I = c;
      this.l = d;
      this.II = e;
      this.Ill = f;
      this.III = g;
      this.ll = h;
      this.Il = i;
      this.IIl = j;
   }

   public double l() {
      return this.II;
   }

   public double II() {
      return this.Il;
   }

   public int Il() {
      return this.lI;
   }

   public double lI() {
      return this.Ill;
   }

   public double ll() {
      return this.IlI;
   }

   boolean III() {
      return this.II > this.I && this.Ill > this.l && this.Il > this.III && this.IIl > this.ll;
   }

   public double IIl() {
      return this.l;
   }

   public double IlI() {
      return this.I;
   }

   public double Ill() {
      return this.III;
   }

   public double lII() {
      return this.ll;
   }
}
