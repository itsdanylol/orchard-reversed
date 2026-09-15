package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
final class lIllIlll {
   private float I;
   private float l;
   private final float II;
   private float Il;
   private float lI;
   private float ll;

   private lIllIlll(float var1, float var2, float var3, float var4, float var5, IIIIllIl var6) {
      this.II = var1;
      this.Il = var2;
      this.ll = var3;
      this.lI = var4;
      this.I = var1 * var4;
      this.l = this.I * var5;
   }

   private float I() {
      float var1 = this.I <= 1.0E-4F ? 1.0F : class_3532.method_15363(this.l / this.I, 0.0F, 1.0F);
      float var2 = var1 * var1 * (3.0F - 2.0F * var1);
      return class_3532.method_16439(var2, this.Il, this.ll);
   }
}
