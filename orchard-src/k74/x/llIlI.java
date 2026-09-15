package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record llIlI(double minX, double minY, double maxX, double maxY) {
   private final double I;
   private final double l;
   private final double II;
   private final double Il;

   private llIlI(double minX, double minY, double maxX, double maxY) {
      this.l = minX;
      this.I = minY;
      this.II = maxX;
      this.Il = maxY;
   }
}
