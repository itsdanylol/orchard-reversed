package k74.y;

import k74.x.IIIIIIlI;
import k74.x.IlIlIIlll;
import k74.x.IllIll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1657.class})
public abstract class IIlIl {
   @Inject(
      method = {"method_5476"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void I(CallbackInfoReturnable<class_2561> var1) {
      class_1657 var2 = (class_1657)this;
      class_2561 var3 = IllIll.Il(var2.method_7334(), (class_2561)var1.getReturnValue());
      var1.setReturnValue(IlIlIIlll.IIII(var2, IIIIIIlI.lII(var2, var3)));
   }

   @Inject(
      method = {"method_5477"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void l(CallbackInfoReturnable<class_2561> var1) {
      class_1657 var2 = (class_1657)this;
      class_2561 var3 = IllIll.Il(var2.method_7334(), (class_2561)var1.getReturnValue());
      var1.setReturnValue(IlIlIIlll.IIII(var2, IIIIIIlI.lII(var2, var3)));
   }
}
