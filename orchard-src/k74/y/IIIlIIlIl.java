package k74.y;

import io.netty.channel.ChannelHandlerContext;
import k74.x.IlIIIIII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_2535.class})
public abstract class IIIlIIlIl {
   @Inject(
      method = {"method_10770(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")}
   )
   private void I(ChannelHandlerContext var1, class_2596<?> var2, CallbackInfo var3) {
      IlIIIIII.IIll(var2);
   }

   @Inject(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void l(class_2596<?> var1, CallbackInfo var2) {
      if (IlIIIIII.lIll(var1)) {
         var2.cancel();
      }
   }

   @ModifyVariable(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private class_2596<?> II(class_2596<?> var1) {
      return IlIIIIII.lII(var1);
   }
}
