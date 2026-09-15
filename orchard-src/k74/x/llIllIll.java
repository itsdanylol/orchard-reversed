package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;

@Environment(EnvType.CLIENT)
record llIllIll(int a, int b, float c, class_1799 d) {
   private final float I;
   private final int l;
   private final int II;
   private final class_1799 Il;

   public class_1799 I() {
      return this.Il;
   }

   public float l() {
      return this.I;
   }

   private llIllIll(int a, int b, float c, class_1799 d) {
      this.l = a;
      this.II = b;
      this.I = c;
      this.Il = d;
   }

   public int Il() {
      return this.l;
   }
}
