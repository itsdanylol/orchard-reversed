package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIlIlII(Object a, long b) {
   private final Object I;
   private final long l;

   public long I() {
      return this.l;
   }

   public Object l() {
      return this.I;
   }

   private IIlIlII(Object a, long b) {
      this.I = a;
      this.l = b;
   }
}
