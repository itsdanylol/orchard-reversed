package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;

@Environment(EnvType.CLIENT)
final class llll {
   private final class_2596<?> I;

   private llll(class_2596<?> var1) {
      this.I = var1;
   }

   @Override
   public int hashCode() {
      return System.identityHashCode(this.I);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof llll var2 && this.I == var2.I;
   }
}
