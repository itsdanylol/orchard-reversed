package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIIlIIll(boolean moving, boolean closeToEdge, boolean safeToRelease, double directionX, double directionZ, double distance) {
   private final double I;
   private final double l;
   private final boolean II;
   private final double Il;
   private final boolean lI;
   private final boolean ll;

   public double I() {
      return this.l;
   }

   public double l() {
      return this.I;
   }

   public boolean II() {
      return this.ll;
   }

   static IIIIlIIll Il() {
      return new IIIIlIIll(false, false, true, 0.0, 0.0, 0.0);
   }

   IIIIlIIll(boolean moving, boolean closeToEdge, boolean safeToRelease, double directionX, double directionZ, double distance) {
      this.lI = moving;
      this.II = closeToEdge;
      this.ll = safeToRelease;
      this.Il = directionX;
      this.l = directionZ;
      this.I = distance;
   }

   public double lI() {
      return this.Il;
   }

   public boolean ll() {
      return this.lI;
   }

   public boolean III() {
      return this.II;
   }
}
