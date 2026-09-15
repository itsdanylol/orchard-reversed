package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
final class IIIIIIll {
   private long I;
   private boolean l;
   private long II;
   private static final double Il = 4096.0;
   private long lI;

   public void I(class_243 var1) {
      if (!lI(var1)) {
         this.ll();
      } else {
         this.lI = Math.round(var1.field_1352 * 4096.0);
         this.I = Math.round(var1.field_1351 * 4096.0);
         this.II = Math.round(var1.field_1350 * 4096.0);
         this.l = true;
      }
   }

   public class_243 l() {
      return !this.l ? null : new class_243(this.lI / 4096.0, this.I / 4096.0, this.II / 4096.0);
   }

   public class_243 II(long var1, long var3, long var5) {
      if (!this.l) {
         return null;
      } else {
         this.lI += var1;
         this.I += var3;
         this.II += var5;
         return this.l();
      }
   }

   public boolean Il() {
      return this.l;
   }

   private static boolean lI(class_243 var0) {
      return var0 != null && Double.isFinite(var0.field_1352) && Double.isFinite(var0.field_1351) && Double.isFinite(var0.field_1350);
   }

   public void ll() {
      this.lI = 0L;
      this.I = 0L;
      this.II = 0L;
      this.l = false;
   }

   public class_243 III(class_243 var1) {
      this.I(var1);
      return this.l();
   }
}
