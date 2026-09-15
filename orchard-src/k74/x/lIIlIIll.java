package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record lIIlIIll(class_2338 a, class_2338 b, float c, float d) {
   private final float I;
   private final class_2338 l;
   private final float II;
   private final class_2338 Il;

   public float I() {
      return this.II;
   }

   public class_2338 II() {
      return this.Il;
   }

   private lIIlIIll(class_2338 a, class_2338 b, float c, float d) {
      this.l = a;
      this.Il = b;
      this.II = c;
      this.I = d;
   }

   public float Il() {
      return this.I;
   }
}
