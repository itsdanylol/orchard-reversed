package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
enum lIllIII {
   @Override
   float I(float var1) {
      return class_3532.method_15374(this.l(var1) * (float) Math.PI);
   }

   private lIllIII(String var3) {
   }

   @Override
   float l(float var1) {
      return 1.0F - (float)Math.pow(1.0F - var1, 2.4);
   }
}
