package k74.y;

import k74.x.IIIIIllII;
import k74.x.IlIlIIllI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_1671;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin({class_1671.class})
public abstract class IlIIIlII {
   @Redirect(
      method = {"method_5773"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1309;method_5720()Lnet/minecraft/class_243;"
      ),
      require = 0
   )
   private class_243 I(class_1309 var1) {
      IIIIIllII var2 = IIIIIllII.III();
      if (var2 != null && var2.II() != null) {
         IlIlIIllI var3 = var2.II().IIIIlll();
         return var3 == null ? var1.method_5720() : var3.l(var1);
      } else {
         return var1.method_5720();
      }
   }
}
