package k74.y;

import k74.x.IIIIIllII;
import k74.x.IlIlIIII;
import k74.x.lIIIllIl;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_743;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_743.class})
public abstract class llIIIlI extends class_744 {
   @Shadow
   private class_315 field_3902;

   @Inject(
      method = {"method_3129"},
      at = {@At("TAIL")},
      require = 0
   )
   private void I(CallbackInfo var1) {
      IIIIIllII var2 = IIIIIllII.III();
      if (var2 != null) {
         lIIIllIl var3 = var2.II().IIIllI();
         if (var3 != null) {
            var3.IIII(class_310.method_1551(), this);
         }

         IlIlIIII var4 = IlIlIIII.llI();
         if (var4 != null) {
            var4.l(this.field_3902, this);
         }
      }
   }
}
