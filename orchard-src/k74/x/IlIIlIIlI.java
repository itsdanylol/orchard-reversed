package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlIIlIIlI(int a, double b) {
   private final int I;
   private final double l;

   private boolean II(IlIIlIIlI var1) {
      return var1 == null || this.I > var1.I || this.I == var1.I && this.l < var1.l;
   }

   private IlIIlIIlI(int a, double b) {
      this.I = a;
      this.l = b;
   }
}
