package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIIIlll(IIIlIlIl a, IIIlIlIl b, double c, double d, double e) {
   private final IIIlIlIl I;
   private final double l;
   private final IIIlIlIl II;
   private final double Il;
   private final double lI;

   private IIIIIlll(IIIlIlIl a, IIIlIlIl b, double c, double d, double e) {
      this.II = a;
      this.I = b;
      this.l = c;
      this.Il = d;
      this.lI = e;
   }

   public IIIlIlIl I() {
      return this.II;
   }

   public IIIlIlIl II() {
      return this.I;
   }

   public double Il() {
      return this.lI;
   }

   public double lI() {
      return this.Il;
   }
}
