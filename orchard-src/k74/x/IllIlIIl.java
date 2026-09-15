package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IllIlIIl(double x1, double y1, double x2, double y2, int e) {
   private final int I;
   private final double l;
   private final double II;
   private final double Il;
   private final double lI;

   public double l() {
      return this.Il;
   }

   public double Il() {
      return this.lI;
   }

   public double lI() {
      return this.l;
   }

   private IllIlIIl(double x1, double y1, double x2, double y2, int e) {
      this.l = x1;
      this.lI = y1;
      this.II = x2;
      this.Il = y2;
      this.I = e;
   }
}
