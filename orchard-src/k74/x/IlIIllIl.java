package k74.x;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;

@Environment(EnvType.CLIENT)
record IlIIllIl(class_2960 a, double b, double c, float d, double e, double f, double g, Map<Integer, Illlll> h, Illlll i) {
   private final double I;
   private final double l;
   private final double II;
   private final class_2960 Il;
   private final Map<Integer, Illlll> lI;
   private final Illlll ll;
   private final double III;
   private final float IIl;
   private final double IlI;

   private IlIIllIl(class_2960 a, double b, double c, float d, double e, double f, double g, Map<Integer, Illlll> h, Illlll i) {
      this.Il = a;
      this.III = b;
      this.I = c;
      this.IIl = d;
      this.II = e;
      this.IlI = f;
      this.l = g;
      this.lI = h;
      this.ll = i;
   }

   public double I() {
      return this.IlI;
   }

   public class_2960 l() {
      return this.Il;
   }

   public Map<Integer, Illlll> II() {
      return this.lI;
   }

   public double Il() {
      return this.II;
   }

   public double lI() {
      return this.III;
   }

   public double III() {
      return this.I;
   }

   public double IlI() {
      return this.l;
   }
}
