package k74.y;

import k74.x.IlIllI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_9779.class_9781;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_9781.class})
public abstract class IlIlllll {
   @Shadow
   private float field_51958;

   @Inject(
      method = {"method_60639(J)I"},
      at = {@At(
         value = "FIELD",
         target = "Lnet/minecraft/class_9779$class_9781;field_51962:J",
         opcode = 181
      )}
   )
   private void I(long var1, CallbackInfoReturnable<Integer> var3) {
      float var4 = IlIllI.IIII();
      if (var4 != 1.0F) {
         this.field_51958 *= var4;
      }
   }
}
