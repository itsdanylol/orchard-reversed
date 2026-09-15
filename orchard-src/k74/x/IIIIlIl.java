package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record IIIIlIl(class_2338 a, class_243 b, class_2338 c, class_2350 d, class_243 e, double f) {
   private final class_2338 I;
   private final class_243 l;
   private final class_2350 II;
   private final double Il;
   private final class_2338 lI;
   private final class_243 ll;

   public class_243 I() {
      return this.ll;
   }

   public class_243 l() {
      return this.l != null ? this.l : this.ll;
   }

   public class_2338 Il() {
      return this.lI;
   }

   private IIIIlIl(class_2338 a, class_243 b, class_2338 c, class_2350 d, class_243 e, double f) {
      this.lI = a;
      this.ll = b;
      this.I = c;
      this.II = d;
      this.l = e;
      this.Il = f;
   }

   public class_243 lI() {
      return this.l;
   }

   public class_2338 ll() {
      return this.I;
   }

   public double III() {
      return this.Il;
   }
}
