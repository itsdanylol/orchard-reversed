package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_238;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public record IlIIIIlIl(double x, double y, double z, long d, double width, double height) {
   private final double I;
   private final long l;
   private final double II;
   private final double Il;
   private final double lI;
   private final double ll;
   private static final double III = 0.1;

   public double I() {
      return this.ll;
   }

   public double l() {
      return this.Il;
   }

   public class_238 II() {
      double var1 = this.ll * 0.5;
      return new class_238(this.I - var1, this.II, this.lI - var1, this.I + var1, this.II + this.Il, this.lI + var1);
   }

   public IlIIIIlIl(double x, double y, double z, long d, double width, double height) {
      width = Math.max(0.1, width);
      height = Math.max(0.1, height);
      this.I = x;
      this.II = y;
      this.lI = z;
      this.l = d;
      this.ll = width;
      this.Il = height;
   }

   public double Il() {
      return this.II;
   }

   public long lI() {
      return this.l;
   }

   public IlIIIIlIl ll(IlIIIIlIl var1, long var2) {
      if (var1 != null && var1.l != this.l) {
         double var4 = var1.l - this.l;
         double var6 = Math.max(0.0, Math.min(1.0, (var2 - this.l) / var4));
         return new IlIIIIlIl(
            Ill(this.I, var1.I, var6), Ill(this.II, var1.II, var6), Ill(this.lI, var1.lI, var6), var2, Ill(this.ll, var1.ll, var6), Ill(this.Il, var1.Il, var6)
         );
      } else {
         return this;
      }
   }

   public class_243 III() {
      return new class_243(this.I, this.II, this.lI);
   }

   public double IIl() {
      return this.lI;
   }

   public double IlI() {
      return this.I;
   }

   private static double Ill(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }
}
