package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIIIlIII(double x, double y, double w, double h, IllllIlI e, llllIIII f) {
   private final double I;
   private final double l;
   private final llllIIII II;
   private final double Il;
   private final IllllIlI lI;
   private final double ll;

   public double I() {
      return this.ll;
   }

   public llllIIII l() {
      return this.II;
   }

   public double II() {
      return this.Il;
   }

   public double Il() {
      return this.I;
   }

   public double lI() {
      return this.l;
   }

   public IllllIlI ll() {
      return this.lI;
   }

   private IIIIIlIII(double x, double y, double w, double h, IllllIlI e, llllIIII f) {
      this.Il = x;
      this.l = y;
      this.I = w;
      this.ll = h;
      this.lI = e;
      this.II = f;
   }

   boolean III(double var1, double var3) {
      return var1 >= this.Il && var1 <= this.Il + this.I && var3 >= this.l && var3 <= this.l + this.ll;
   }
}
