package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1799;

@Environment(EnvType.CLIENT)
record IIllllIll(class_1268 a, int b, class_1799 c) {
   private final int I;
   private final class_1799 l;
   private final class_1268 II;

   public class_1799 I() {
      return this.l;
   }

   public class_1268 l() {
      return this.II;
   }

   private IIllllIll(class_1268 a, int b, class_1799 c) {
      this.II = a;
      this.I = b;
      this.l = c;
   }

   public int II() {
      return this.I;
   }
}
