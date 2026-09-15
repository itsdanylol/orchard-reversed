package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_745;

@Environment(EnvType.CLIENT)
record IIllIIIlI(class_745 a, long b, double x, double y, double z, float f) {
   private final double I;
   private final double l;
   private final double II;
   private final float Il;
   private final class_745 lI;
   private final long ll;

   public float I() {
      return this.Il;
   }

   public long l() {
      return this.ll;
   }

   public double II() {
      return this.I;
   }

   public class_745 Il() {
      return this.lI;
   }

   public double lI() {
      return this.l;
   }

   public double ll() {
      return this.II;
   }

   private IIllIIIlI(class_745 a, long b, double x, double y, double z, float f) {
      this.lI = a;
      this.ll = b;
      this.l = x;
      this.I = y;
      this.II = z;
      this.Il = f;
   }
}
