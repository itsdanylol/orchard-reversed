package k74.x;

public record IlIlIlIl(String a, boolean b, double visibility, double easedVisibility, double y, double width, double targetWidth, int h) {
   private final int I;
   private final double l;
   private final double II;
   private final double Il;
   private final String lI;
   private final double ll;
   private final boolean III;
   private final double IIl;

   public double I(double var1, double var3) {
      return (IIIlIIlII.lIl(var1) + IIIlIIlII.lIl(var3)) * this.Il;
   }

   public IlIlIlIl(String a, boolean b, double visibility, double easedVisibility, double y, double width, double targetWidth, int h) {
      this.lI = a;
      this.III = b;
      this.l = visibility;
      this.Il = easedVisibility;
      this.II = y;
      this.ll = width;
      this.IIl = targetWidth;
      this.I = h;
   }

   public boolean l() {
      return this.III;
   }

   public double II() {
      return this.l;
   }

   public double Il() {
      return this.IIl;
   }

   public int lI() {
      return this.I;
   }

   public String ll() {
      return this.lI;
   }

   public double III() {
      return this.ll;
   }

   public double IIl() {
      return this.Il;
   }

   public double IlI() {
      return this.II;
   }
}
