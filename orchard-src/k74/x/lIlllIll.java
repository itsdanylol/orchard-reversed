package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class lIlllIll {
   static final double I = 20.0;
   private static final double l = 1.0E9;
   private static final long II = 250000000L;
   private long Il;

   private long I(double var1, double var3) {
      double var5 = Math.max(0.1, Math.min(20.0, var1));
      double var7 = Math.max(var5, Math.min(20.0, var3));
      double var9 = var5 == var7 ? var5 : ThreadLocalRandom.current().nextDouble(var5, var7);
      return Math.max(1L, Math.round(1.0E9 / var9));
   }

   void l() {
      this.Il = 0L;
   }

   boolean II() {
      long var1 = System.nanoTime();
      return this.Il <= 0L || var1 >= this.Il;
   }

   void Il(double var1, double var3) {
      long var5 = System.nanoTime();
      long var7 = this.Il > 0L && var5 - this.Il <= 250000000L ? this.Il : var5;
      this.Il = var7 + this.I(var1, var3);
   }
}
