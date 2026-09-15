package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record lIIl(class_1297 a, class_243 b, double c) {
   private final double I;
   private final class_243 l;
   private final class_1297 II;

   public class_1297 I() {
      return this.II;
   }

   private lIIl(class_1297 a, class_243 b, double c) {
      this.II = a;
      this.l = b;
      this.I = c;
   }

   public double II() {
      return this.I;
   }
}
