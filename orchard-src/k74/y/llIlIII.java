package k74.y;

import k74.x.IlIIIIII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_6628;
import net.minecraft.class_7965;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_6628.class})
public abstract class llIlIII {
   @Inject(
      method = {"method_51796"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void I(CallbackInfoReturnable<class_7965> var1) {
      if (IlIIIIII.llll()) {
         var1.setReturnValue(class_7965.field_41434);
      }
   }
}
