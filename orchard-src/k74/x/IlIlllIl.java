package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlIlllIl(double gravity, double drag, double waterDrag, double underwaterGravity, boolean e, lIIIIIIl f) {
   private final double I;
   private final double l;
   private final boolean II;
   private final double Il;
   private final lIIIIIIl lI;
   private final double ll;

   private IlIlllIl(double gravity, double drag, double waterDrag, double underwaterGravity, boolean e, lIIIIIIl f) {
      this.Il = gravity;
      this.l = drag;
      this.ll = waterDrag;
      this.I = underwaterGravity;
      this.II = e;
      this.lI = f;
   }

   public boolean I() {
      return this.II;
   }

   public lIIIIIIl l() {
      return this.lI;
   }

   public double II() {
      return this.Il;
   }

   public double Il() {
      return this.l;
   }

   public double lI() {
      return this.I;
   }
}
