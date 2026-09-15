package k74.x;

import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;

@Environment(EnvType.CLIENT)
record llIlllI(Predicate<class_2596<?>> a, Consumer<class_2596<?>> b, Predicate<class_2596<?>> as) {
   private final Predicate<class_2596<?>> I;
   private final Consumer<class_2596<?>> l;
   private final Predicate<class_2596<?>> II;

   public Consumer<class_2596<?>> I() {
      return this.l;
   }

   private llIlllI(Predicate<class_2596<?>> a, Consumer<class_2596<?>> b, Predicate<class_2596<?>> as) {
      this.II = a;
      this.l = b;
      this.I = as;
   }

   public Predicate<class_2596<?>> l() {
      return this.I;
   }
}
