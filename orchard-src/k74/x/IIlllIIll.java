package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;

@Environment(EnvType.CLIENT)
record IIlllIIll(class_1309 a, IIIllIlll b, double c, double d, float e) {
   private final double I;
   private final IIIllIlll l;
   private final double II;
   private final float Il;
   private final class_1309 lI;

   public IIIllIlll I() {
      return this.l;
   }

   public double l() {
      return this.I;
   }

   public float II() {
      return this.Il;
   }

   private IIlllIIll(class_1309 a, IIIllIlll b, double c, double d, float e) {
      this.lI = a;
      this.l = b;
      this.II = c;
      this.I = d;
      this.Il = e;
   }

   public double Il() {
      return this.II;
   }
}
