package k74.y;

import com.mojang.blaze3d.platform.GLX;
import k74.x.IlIIllIII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

@Environment(EnvType.CLIENT)
@Mixin({GLX.class})
public abstract class lIIllIIl {
   @Redirect(
      method = {"_getCpuInfo"},
      remap = false,
      require = 0,
      at = @At(
         value = "INVOKE",
         target = "Loshi/hardware/HardwareAbstractionLayer;getProcessor()Loshi/hardware/CentralProcessor;",
         remap = false
      )
   )
   private static CentralProcessor I(HardwareAbstractionLayer var0) {
      String var1 = System.getProperty(IlIIllIII.lI("l4cakhhaVQ=="), "").toLowerCase();
      if (var1.contains(IlIIllIII.lI("j51a"))) {
         throw new IllegalStateException(IlIIllIII.lI("q59djAleXhvXP5ZXC9zJjdi7Z7QwF3MsokiOTArBxw=="));
      } else {
         return var0.getProcessor();
      }
   }
}
