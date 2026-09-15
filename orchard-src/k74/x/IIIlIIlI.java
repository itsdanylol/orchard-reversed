package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record IIIlIIlI(class_2338 aS, double aT, double aU) {
   private final double I;
   private final double l;
   private final class_2338 II;

   public class_2338 I() {
      return this.II;
   }

   public double l() {
      return this.I;
   }

   private IIIlIIlI(class_2338 aS, double aT, double aU) {
      this.II = aS;
      this.I = aT;
      this.l = aU;
   }

   public double II() {
      return this.l;
   }
}
