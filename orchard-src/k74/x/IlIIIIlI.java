package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record IlIIIIlI(class_2338 bl, class_243 bm, class_3965 bn) {
   private final class_2338 I;
   private final class_243 l;
   private final class_3965 II;

   private IlIIIIlI(class_2338 bl, class_243 bm, class_3965 bn) {
      this.I = bl;
      this.l = bm;
      this.II = bn;
   }
}
