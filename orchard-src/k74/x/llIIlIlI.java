package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public record llIIlIlI(class_243 a, float b, float c, float d, float e) {
   private final float I;
   private final float l;
   private final class_243 II;
   private final float Il;
   private final float lI;

   public llIIlIlI(class_243 a, float b, float c, float d, float e) {
      this.II = a;
      this.Il = b;
      this.I = c;
      this.lI = d;
      this.l = e;
   }

   public float I() {
      return this.lI;
   }

   public float l() {
      return this.I;
   }

   public float II() {
      return this.l;
   }

   public class_243 Il() {
      return this.II;
   }

   public float lI() {
      return this.Il;
   }
}
