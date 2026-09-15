package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IllIIlll(int slot, double b, int preference) {
   private final int I;
   private final double l;
   private final int II;

   public int I() {
      return this.II;
   }

   public int l() {
      return this.I;
   }

   boolean II(IllIIlll var1) {
      if (this.l > var1.l + 1.0E-4) {
         return true;
      } else {
         return Math.abs(this.l - var1.l) <= 1.0E-4 && this.II > var1.II ? true : Math.abs(this.l - var1.l) <= 1.0E-4 && this.II == var1.II && this.I < var1.I;
      }
   }

   private IllIIlll(int slot, double b, int preference) {
      this.I = slot;
      this.l = b;
      this.II = preference;
   }

   public double Il() {
      return this.l;
   }
}
