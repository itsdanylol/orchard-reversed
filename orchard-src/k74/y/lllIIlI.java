package k74.y;

import k74.x.IIIIIllII;
import k74.x.lll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1747;
import net.minecraft.class_1750;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1747.class})
public abstract class lllIIlI {
   @Inject(
      method = {"method_7709"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void I(class_1750 var1, class_2680 var2, CallbackInfoReturnable<Boolean> var3) {
      IIIIIllII var4 = IIIIIllII.III();
      if (var4 != null && var4.II() != null) {
         lll var5 = var4.II().lIIIll();
         boolean var6 = var5 != null && var5.IIIIlIl();
         if (var6) {
            var3.setReturnValue(!this.method_20360() || var2.method_26184(var1.method_8045(), var1.method_8037()));
         }
      }
   }

   @Shadow
   protected abstract boolean method_20360();
}
