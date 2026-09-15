package k74.y;

import k74.x.IIIIIllII;
import k74.x.lIIIlll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1774;
import net.minecraft.class_1799;
import net.minecraft.class_1838;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin({class_1774.class})
public abstract class IIIIIIIIl {
   @Redirect(
      method = {"method_7884"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1799;method_7934(I)V"
      )
   )
   private void I(class_1799 var1, int var2, class_1838 var3) {
      IIIIIllII var4 = IIIIIllII.III();
      lIIIlll var5 = var4 != null && var4.II() != null ? var4.II().lllII(lIIIlll.class) : null;
      if (!var3.method_8045().method_8608() || var5 == null || !var5.IIIIlIl()) {
         var1.method_7934(var2);
      }
   }
}
