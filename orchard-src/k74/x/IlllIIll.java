package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record IlllIIll(class_2338 a, class_243 b, class_3965 c) {
   private final class_243 I;
   private final class_3965 l;
   private final class_2338 II;

   private IlllIIll(class_2338 a, class_243 b, class_3965 c) {
      this.II = a;
      this.I = b;
      this.l = c;
   }

   public class_2338 l() {
      return this.II;
   }

   public class_3965 II() {
      return this.l;
   }
}
