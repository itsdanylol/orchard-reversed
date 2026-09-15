package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;

@Environment(EnvType.CLIENT)
record lIlIIll(class_2561 a, boolean b) {
   private final boolean I;
   private final class_2561 l;

   public class_2561 I() {
      return this.l;
   }

   private lIlIIll(class_2561 a, boolean b) {
      this.l = a;
      this.I = b;
   }

   public boolean l() {
      return this.I;
   }
}
