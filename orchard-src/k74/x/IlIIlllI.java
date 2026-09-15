package k74.x;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record IlIIlllI(List<class_243> a, boolean b, class_1297 c) {
   private final class_1297 I;
   private final List<class_243> l;
   private final boolean II;

   private IlIIlllI(List<class_243> a, boolean b, class_1297 c) {
      this.l = a;
      this.II = b;
      this.I = c;
   }
}
