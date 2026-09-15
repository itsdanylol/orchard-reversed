package k74.y;

import k74.x.IlIIIIII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.ClientBrandRetriever;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({ClientBrandRetriever.class})
public abstract class IlIIlIl {
   @Inject(
      method = {"getClientModName"},
      at = {@At("HEAD")},
      cancellable = true,
      remap = false
   )
   private static void I(CallbackInfoReturnable<String> var0) {
      if (IlIIIIII.IIIlI()) {
         var0.setReturnValue(IlIIIIII.IlI());
      }
   }
}
