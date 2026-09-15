package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IllIIll(double x, double y, double width, double height, int e) {
   private final double I;
   private final double l;
   private final double II;
   private final int Il;
   private final double lI;

   public int I() {
      return this.Il;
   }

   public double l() {
      return this.II;
   }

   public double II() {
      return this.I;
   }

   public double Il() {
      return this.l;
   }

   private IllIIll(double x, double y, double width, double height, int e) {
      this.II = x;
      this.I = y;
      this.l = width;
      this.lI = height;
      this.Il = e;
   }
}
