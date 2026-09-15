package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record IlIlIlIIl(class_243 position, class_243 initialVelocity, IlIlllIl c) {
   private final class_243 I;
   private final class_243 l;
   private final IlIlllIl II;

   public IlIlllIl I() {
      return this.II;
   }

   private IlIlIlIIl(class_243 position, class_243 initialVelocity, IlIlllIl c) {
      this.l = position;
      this.I = initialVelocity;
      this.II = c;
   }

   public class_243 l() {
      return this.I;
   }

   public class_243 II() {
      return this.l;
   }
}
