package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record IIllIIlII(int a, class_243 b, float c, double d, double e, double f, double g) {
   private final class_243 I;
   private final double l;
   private final double II;
   private final float Il;
   private final int lI;
   private final double ll;
   private final double III;

   public double I() {
      return this.III;
   }

   public class_243 l() {
      return this.I;
   }

   public double Il() {
      return this.ll;
   }

   private IIllIIlII(int a, class_243 b, float c, double d, double e, double f, double g) {
      this.lI = a;
      this.I = b;
      this.Il = c;
      this.II = d;
      this.III = e;
      this.l = f;
      this.ll = g;
   }

   public double ll() {
      return this.l;
   }

   public float III() {
      return this.Il;
   }
}
