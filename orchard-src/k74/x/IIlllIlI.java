package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;

@Environment(EnvType.CLIENT)
record IIlllIlI(String a, int b, int c) {
   private final String I;
   private final int l;
   private final int II;

   public int I() {
      return this.l;
   }

   public int l() {
      return this.II;
   }

   public String II() {
      return this.I;
   }

   boolean Il(class_1799 var1) {
      return this.l == var1.method_7947() && this.I.equals(var1.method_7909().toString());
   }

   private IIlllIlI(String a, int b, int c) {
      this.I = a;
      this.l = b;
      this.II = c;
   }
}
