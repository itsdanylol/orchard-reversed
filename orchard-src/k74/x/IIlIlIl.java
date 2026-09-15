package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record IIlIlIl(class_2338 a, double b) {
   private final class_2338 I;
   private final double l;

   public double I() {
      return this.l;
   }

   private IIlIlIl(class_2338 a, double b) {
      this.I = a;
      this.l = b;
   }

   public class_2338 l() {
      return this.I;
   }
}
