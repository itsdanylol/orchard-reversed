package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record IlIIIIlII(class_2338 ai, class_243 aj, class_3965 ak) {
   private final class_2338 I;
   private final class_3965 l;
   private final class_243 II;

   private IlIIIIlII(class_2338 ai, class_243 aj, class_3965 ak) {
      this.I = ai;
      this.II = aj;
      this.l = ak;
   }

   public class_3965 I() {
      return this.l;
   }

   public class_2338 l() {
      return this.I;
   }
}
