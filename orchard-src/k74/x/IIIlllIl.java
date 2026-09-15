package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record IIIlllIl(class_2338 a, double b, double c) {
   private final class_2338 I;
   private final double l;
   private final double II;

   private IIIlllIl(class_2338 a, double b, double c) {
      this.I = a;
      this.II = b;
      this.l = c;
   }

   public double I() {
      return this.II;
   }

   public class_2338 II() {
      return this.I;
   }
}
