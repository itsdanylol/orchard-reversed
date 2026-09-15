package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
enum IIlIIllII {
   private IIlIIllII(String var3) {
   }

   @Override
   float I(float var1) {
      return class_3532.method_15374(class_3532.method_15355(var1) * (float) Math.PI);
   }
}
