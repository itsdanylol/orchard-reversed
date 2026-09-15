package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record IlIlIIIIl(class_2338 aH, class_243 aI, class_3965 aJ) {
   private final class_3965 I;
   private final class_2338 l;
   private final class_243 II;

   public class_2338 I() {
      return this.l;
   }

   private IlIlIIIIl(class_2338 aH, class_243 aI, class_3965 aJ) {
      this.l = aH;
      this.II = aI;
      this.I = aJ;
   }

   public class_243 l() {
      return this.II;
   }

   public class_3965 II() {
      return this.I;
   }
}
