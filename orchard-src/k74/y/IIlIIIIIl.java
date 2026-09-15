package k74.y;

import k74.x.IIIlIlll;
import k74.x.IlIIIlI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_897.class})
public abstract class IIlIIIIIl {
   @Inject(
      method = {"method_3921"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void I(class_1297 var1, double var2, CallbackInfoReturnable<Boolean> var4) {
      if (IIIlIlll.II(var1) || IlIIIlI.lIIl(var1)) {
         var4.setReturnValue(false);
      }
   }
}
