package k74.y;

import com.mojang.authlib.GameProfile;
import k74.x.IllIll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_640.class})
public abstract class IIIllII {
   @Shadow
   @Final
   private GameProfile field_3741;

   @Inject(
      method = {"method_52810"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void I(CallbackInfoReturnable<Object> var1) {
      Object var2 = IllIll.lI(this.field_3741);
      if (var2 != null) {
         var1.setReturnValue(var2);
      }
   }
}
