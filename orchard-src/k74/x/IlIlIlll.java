package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record IlIlIlll(IIllIllI a, int b, class_2338 c) {
   private final class_2338 I;
   private final int l;
   private final IIllIllI II;

   public IIllIllI I() {
      return this.II;
   }

   private IlIlIlll(IIllIllI a, int b, class_2338 c) {
      this.II = a;
      this.l = b;
      this.I = c;
   }

   public class_2338 II() {
      return this.I;
   }
}
