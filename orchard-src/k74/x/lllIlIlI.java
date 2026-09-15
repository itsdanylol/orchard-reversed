package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2248;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record lllIlIlI(class_2338 a, class_2248 b) {
   private final class_2338 I;
   private final class_2248 l;

   public class_2248 I() {
      return this.l;
   }

   public class_2338 l() {
      return this.I;
   }

   private lllIlIlI(class_2338 a, class_2248 b) {
      this.I = a;
      this.l = b;
   }
}
