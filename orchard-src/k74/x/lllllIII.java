package k74.x;

import java.util.HashSet;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class lllllIII {
   private final Set<Integer> I = new HashSet<>();

   private lllllIII() {
   }

   void I(int var1) {
      this.I.add(var1);
   }

   boolean l(int var1) {
      return this.I.contains(var1);
   }

   boolean II() {
      return !this.I.isEmpty();
   }
}
