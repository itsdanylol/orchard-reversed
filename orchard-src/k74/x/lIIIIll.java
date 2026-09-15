package k74.x;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lIIIIll(List<Integer> a, int b) {
   private final List<Integer> I;
   private final int l;

   boolean l() {
      return !this.I.isEmpty();
   }

   private lIIIIll(List<Integer> a, int b) {
      this.I = a;
      this.l = b;
   }

   public int II() {
      return this.l;
   }

   boolean Il() {
      return this.l > 0;
   }

   int lI() {
      return this.I.get(ThreadLocalRandom.current().nextInt(this.I.size()));
   }
}
