package k74.y;

import k74.x.IIIIIllII;
import k74.x.lIIlllll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public abstract class llIllIIl {
   @Inject(
      method = {"method_6028"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void I(CallbackInfoReturnable<Integer> var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 == this) {
         IIIIIllII var3 = IIIIIllII.III();
         if (var3 != null) {
            lIIlllll var4 = var3.II().IIIl();
            if (var4 != null && var4.IIlI()) {
               var1.setReturnValue(var4.IIIIl((Integer)var1.getReturnValue()));
            }
         }
      }
   }
}
