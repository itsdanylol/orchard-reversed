package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record lIlII(class_2338 a, class_2338 b, class_243 c) {
   private final class_2338 I;
   private final class_2338 l;
   private final class_243 II;

   public class_2338 I() {
      return this.l;
   }

   public class_243 l() {
      return this.II;
   }

   public class_2338 II() {
      return this.I;
   }

   private lIlII(class_2338 a, class_2338 b, class_243 c) {
      this.I = a;
      this.l = b;
      this.II = c;
   }
}
