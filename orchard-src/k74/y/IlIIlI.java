package k74.y;

import k74.x.IIll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_746;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin({class_759.class})
public abstract class IlIIlI {
   @Redirect(
      method = {"method_33303"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_6047()Lnet/minecraft/class_1799;"
      )
   )
   private static class_1799 I(class_746 var0) {
      return IIll.llIlII(var0);
   }

   @Redirect(
      method = {"method_3220"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_6047()Lnet/minecraft/class_1799;"
      )
   )
   private class_1799 l(class_746 var1) {
      return IIll.llIlII(var1);
   }
}
