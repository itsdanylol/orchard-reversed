package k74.y;

import k74.x.IIIIIllII;
import k74.x.lIIIlll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1799.class})
public abstract class IlIlIlIlI {
   @Inject(
      method = {"method_7965"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void I(CallbackInfoReturnable<Integer> var1) {
      class_310 var2 = class_310.method_1551();
      IIIIIllII var3 = IIIIIllII.III();
      if (var2.field_1724 != null && var3 != null && var3.II() != null) {
         lIIIlll var4 = var3.II().lllII(lIIIlll.class);
         class_1799 var5 = (class_1799)this;
         if (var4 != null && var4.IIIIlIl() && var5.method_31574(class_1802.field_8301)) {
            var1.setReturnValue(0);
         }
      }
   }
}
