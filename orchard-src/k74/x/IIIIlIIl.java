package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
record IIIIlIIl(class_746 a, llllIllI b) {
   private final class_746 I;
   private final llllIllI l;

   public llllIllI I() {
      return this.l;
   }

   private IIIIlIIl(class_746 a, llllIllI b) {
      this.I = a;
      this.l = b;
   }

   public class_746 l() {
      return this.I;
   }
}
