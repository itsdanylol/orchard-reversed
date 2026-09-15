package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record llllIllI(long a, Object b) {
   private final Object I;
   private final long l;

   public long I() {
      return this.l;
   }

   public Object l() {
      return this.I;
   }

   public boolean II() {
      return this.l > 0L && this.I != null;
   }

   public llllIllI(long a, Object b) {
      this.l = a;
      this.I = b;
   }
}
