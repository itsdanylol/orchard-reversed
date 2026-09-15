package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
enum IIlIlIIlI {
   @Override
   float l(float var1) {
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   @Override
   float I(float var1) {
      return class_3532.method_15374(this.l(var1) * (float) Math.PI);
   }

   private IIlIlIIlI(String var3) {
   }
}
