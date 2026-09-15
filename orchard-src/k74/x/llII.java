package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record llII(long a, String b) {
   private final String I;
   private final long l;

   private llII(long a, String b) {
      this.l = a;
      this.I = b;
   }
}
