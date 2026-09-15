package k74.y;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MinecraftServer.class})
public class lIlIIII {
   @Inject(
      at = {@At("HEAD")},
      method = {"loadLevel"}
   )
   private void I(CallbackInfo var1) {
   }
}
