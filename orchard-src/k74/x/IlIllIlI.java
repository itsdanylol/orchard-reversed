package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlIllIlI(String aL, int aM, String a, double b, double c, double d, double e) {
   private final double I;
   private final double l;
   private final double II;
   private final String Il;
   private final int lI;
   private final String ll;
   private final double III;

   public String l() {
      return this.Il;
   }

   public double II() {
      return this.III;
   }

   public double Il() {
      return this.II;
   }

   public String lI() {
      return this.ll;
   }

   public int ll() {
      return this.lI;
   }

   public double III() {
      return this.l;
   }

   private IlIllIlI(String aL, int aM, String a, double b, double c, double d, double e) {
      this.ll = aL;
      this.lI = aM;
      this.Il = a;
      this.I = b;
      this.III = c;
      this.II = d;
      this.l = e;
   }
}
