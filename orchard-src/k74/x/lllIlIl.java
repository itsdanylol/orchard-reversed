package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;

@Environment(EnvType.CLIENT)
record lllIlIl(String a, int count, int clickedAtTick) {
   private final int I;
   private final int l;
   private final String II;

   public int I() {
      return this.l;
   }

   public String l() {
      return this.II;
   }

   public int II() {
      return this.I;
   }

   boolean Il(class_1799 var1) {
      return this.I == var1.method_7947() && this.II.equals(var1.method_7909().toString());
   }

   private lllIlIl(String a, int count, int clickedAtTick) {
      this.II = a;
      this.I = count;
      this.l = clickedAtTick;
   }
}
