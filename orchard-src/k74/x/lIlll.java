package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record lIlll(boolean a, Integer b) {
   private static final lIlll I = new lIlll(false, null);
   private final Integer l;
   private final boolean II;

   public lIlll(boolean a, Integer b) {
      this.II = a;
      this.l = b;
   }

   public Integer I() {
      return this.l;
   }

   public boolean l() {
      return this.II;
   }
}
