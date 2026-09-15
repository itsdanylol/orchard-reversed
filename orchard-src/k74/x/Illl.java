package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record Illl(String a, String b) {
   private final String I;
   private final String l;

   private Illl(String a, String b) {
      this.I = a;
      this.l = b;
   }
}
