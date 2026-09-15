package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record lIIllI(boolean a, boolean b) {
   private final boolean I;
   private final boolean l;
   private static final lIIllI II = new lIIllI(false, false);

   public lIIllI(boolean a, boolean b) {
      this.l = a;
      this.I = b;
   }

   public boolean l() {
      return !this.l && !this.I;
   }

   private lIIllI II(boolean var1, boolean var2) {
      return new lIIllI(this.l || var1, this.I || var2);
   }

   public boolean Il() {
      return this.l;
   }
}
