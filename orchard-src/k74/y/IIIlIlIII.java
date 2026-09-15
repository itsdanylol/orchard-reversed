package k74.y;

import k74.x.IIll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1661.class})
public abstract class IIIlIlIII {
   @Inject(
      method = {"method_7391"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void I(CallbackInfoReturnable<class_1799> var1) {
      class_1661 var2 = (class_1661)this;
      int var3 = IIll.IIIlIl(var2);
      int var4 = ((IIlllIlIl)var2).ilovcats$getSelectedSlot();
      if (var3 >= 0 && var3 < 9 && var3 != var4) {
         var1.setReturnValue(var2.method_5438(var3));
      }
   }
}
