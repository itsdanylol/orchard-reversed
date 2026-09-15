package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record IlIIlIlII(class_2338 aO, class_2338 aP, class_243 aQ, class_3965 aR) {
   private final class_243 I;
   private final class_2338 l;
   private final class_2338 II;
   private final class_3965 Il;

   public class_3965 I() {
      return this.Il;
   }

   public class_243 II() {
      return this.I;
   }

   private IlIIlIlII(class_2338 aO, class_2338 aP, class_243 aQ, class_3965 aR) {
      this.l = aO;
      this.II = aP;
      this.I = aQ;
      this.Il = aR;
   }

   public class_2338 Il() {
      return this.II;
   }
}
