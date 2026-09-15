package k74.x;

public record IIlIllI(double x, double y, double width, double height, double radius, double stroke) {
   private final double I;
   private final double l;
   private final double II;
   private final double Il;
   private final double lI;
   private final double ll;
   private static final IIlIllI III = new IIlIllI(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);

   public double I() {
      return this.Il;
   }

   public IIlIllI(double x, double y, double width, double height, double radius, double stroke) {
      this.Il = x;
      this.ll = y;
      this.I = width;
      this.II = height;
      this.l = radius;
      this.lI = stroke;
   }

   public double l() {
      return this.lI;
   }

   public double II() {
      return this.I;
   }

   public double Il() {
      return this.II;
   }

   public double lI() {
      return this.ll;
   }

   public double ll() {
      return this.l;
   }

   public boolean III() {
      return this.I > 0.0 && this.II > 0.0;
   }
}
