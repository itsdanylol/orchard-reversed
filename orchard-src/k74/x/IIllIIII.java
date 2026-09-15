package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record IIllIIII(double a_, double ba, double bb, double bc, double bd, double be) {
   private final double I;
   private final double l;
   private final double II;
   private final double Il;
   private static final IIllIIII lI = new IIllIIII(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private final double ll;
   private final double III;

   public double I() {
      return this.Il;
   }

   public IIllIIII(double a_, double ba, double bb, double bc, double bd, double be) {
      this.III = a_;
      this.l = ba;
      this.II = bb;
      this.ll = bc;
      this.I = bd;
      this.Il = be;
   }

   public double l() {
      return this.ll;
   }

   public boolean II() {
      return this.II > 0.0 && this.ll > 0.0;
   }

   public double Il() {
      return this.III;
   }

   public double lI() {
      return this.II;
   }

   public double ll() {
      return this.I;
   }

   public double III() {
      return this.l;
   }
}
