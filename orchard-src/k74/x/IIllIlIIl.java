package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
record IIllIlIIl(class_1657 a, double b, double c, double d, double e) {
   private final class_1657 I;
   private final double l;
   private final double II;
   private final double Il;
   private final double lI;

   public double I() {
      return this.lI;
   }

   public double II() {
      return this.Il;
   }

   public double Il() {
      return this.II;
   }

   public class_1657 lI() {
      return this.I;
   }

   private IIllIlIIl(class_1657 a, double b, double c, double d, double e) {
      this.I = a;
      this.lI = b;
      this.Il = c;
      this.II = d;
      this.l = e;
   }
}
