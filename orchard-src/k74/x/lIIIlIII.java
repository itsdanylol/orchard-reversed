package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record lIIIlIII(boolean a, int b) {
   private static final lIIIlIII I = new lIIIlIII(false, 0);
   private final boolean l;
   private final int II;

   public boolean I() {
      return this.l;
   }

   public lIIIlIII(boolean a, int b) {
      this.l = a;
      this.II = b;
   }

   public int l() {
      return this.II;
   }
}
