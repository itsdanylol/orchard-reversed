package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIlllIlI(IIlIlI a, int b) {
   private final IIlIlI I;
   private final int l;

   private IIIlllIlI(IIlIlI a, int b) {
      this.I = a;
      this.l = b;
   }

   private IIIlllIlI II(int var1) {
      return new IIIlllIlI(this.I, var1);
   }
}
