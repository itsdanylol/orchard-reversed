package k74.y;

import java.util.List;
import k74.x.IlIIIIII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2477;
import net.minecraft.class_2588;
import net.minecraft.class_5348;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_2588.class})
public abstract class IlIlIlIll {
   @Shadow
   private List<class_5348> field_11877;
   @Shadow
   @Final
   private String field_11876;
   @Shadow
   private class_2477 field_25317;

   @Inject(
      method = {"method_11025"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void I(CallbackInfo var1) {
      if (IlIIIIII.llll()) {
         if (!IlIIIIII.I(this.field_11876)) {
            class_2477 var2 = class_2477.method_10517();
            if (this.field_25317 != var2) {
               this.field_25317 = var2;
               this.field_11877 = List.of(class_5348.method_29430(this.field_11876));
            }

            IlIIIIII.ll(this.field_11876);
            var1.cancel();
         }
      }
   }
}
