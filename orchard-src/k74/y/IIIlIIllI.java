package k74.y;

import k74.x.IIlllIlII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_7172;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_765.class})
public abstract class IIIlIIllI {
   @Inject(
      method = {"method_42596"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void I(class_1309 var1, float var2, float var3, CallbackInfoReturnable<Float> var4) {
      if (IIlllIlII.I()) {
         var4.setReturnValue(0.0F);
      }
   }

   @Redirect(
      method = {"method_3313"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_7172;method_41753()Ljava/lang/Object;",
         ordinal = 2
      ),
      require = 0
   )
   private Object l(class_7172<?> var1) {
      Object var2 = var1.method_41753();
      return IIlllIlII.I() && var2 instanceof Double ? 16.0 : var2;
   }
}
