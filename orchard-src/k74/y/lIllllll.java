package k74.y;

import k74.x.IIIIIllII;
import k74.x.IllIll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_338.class})
public abstract class lIllllll {
   @ModifyVariable(
      method = {"method_1812"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0,
      require = 0
   )
   private class_2561 I(class_2561 var1) {
      return IllIll.II(var1);
   }

   @Inject(
      method = {"method_1812"},
      at = {@At("HEAD")},
      require = 0
   )
   private void l(class_2561 var1, CallbackInfo var2) {
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null && var3.II() != null && var1 != null) {
         var3.II().IIIlI(var1.getString());
      }
   }
}
