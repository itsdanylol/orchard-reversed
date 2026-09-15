package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
record IlIlIllll(class_746 a, int b, int c, int d) {
   private final int I;
   private final int l;
   private final class_746 II;
   private final int Il;

   public int I() {
      return this.l;
   }

   public int l() {
      return this.Il;
   }

   public int II() {
      return this.I;
   }

   private IlIlIllll(class_746 a, int b, int c, int d) {
      this.II = a;
      this.l = b;
      this.I = c;
      this.Il = d;
   }

   public class_746 Il() {
      return this.II;
   }
}
