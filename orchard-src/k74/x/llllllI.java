package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record llllllI(String a, IIIlIlIl b, IIIlIlIl c, double d, double e, double f) {
   private final IIIlIlIl I;
   private final double l;
   private final double II;
   private final String Il;
   private final IIIlIlIl lI;
   private final double ll;

   public IIIlIlIl I() {
      return this.lI;
   }

   public double l() {
      return this.II;
   }

   public IIIlIlIl II() {
      return this.I;
   }

   public double Il() {
      return this.ll;
   }

   public String lI() {
      return this.Il;
   }

   public double ll() {
      return this.l;
   }

   private llllllI(String a, IIIlIlIl b, IIIlIlIl c, double d, double e, double f) {
      this.Il = a;
      this.I = b;
      this.lI = c;
      this.II = d;
      this.l = e;
      this.ll = f;
   }
}
