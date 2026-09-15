package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlIIlIIII(Color a, Color b) {
   private final Color I;
   private final Color l;

   public Color I() {
      return this.l;
   }

   public Color l() {
      return this.I;
   }

   private IlIIlIIII(Color a, Color b) {
      this.l = a;
      this.I = b;
   }
}
