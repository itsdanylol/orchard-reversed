package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record lllllIIl(class_243 w, float x, float y, float z, float aa, float ab, float ac) {
   private final float I;
   private final float l;
   private final float II;
   private final class_243 Il;
   private final float lI;
   private final float ll;
   private final float III;

   public float I() {
      return this.III;
   }

   public float l() {
      return this.I;
   }

   public float Il() {
      return this.lI;
   }

   public class_243 lI() {
      return this.Il;
   }

   public float III() {
      return this.l;
   }

   private lllllIIl(class_243 w, float x, float y, float z, float aa, float ab, float ac) {
      this.Il = w;
      this.ll = x;
      this.III = y;
      this.lI = z;
      this.I = aa;
      this.l = ab;
      this.II = ac;
   }
}
