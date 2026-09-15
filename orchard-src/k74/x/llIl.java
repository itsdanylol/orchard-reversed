package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record llIl(class_243 a, long b) {
   private final class_243 I;
   private final long l;

   private llIl(class_243 a, long b) {
      this.I = a;
      this.l = b;
   }
}
