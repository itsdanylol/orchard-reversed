package k74.y;

import k74.x.IIIIIllII;
import k74.x.lIIIIIII;
import k74.x.lIIIIlIl;
import k74.x.lIIIlIlI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_312.class})
public abstract class IIIllll {
   @Shadow
   private double field_1787;
   @Shadow
   private double field_1789;

   @Inject(
      method = {"method_55793"},
      at = {@At("HEAD")}
   )
   private void I(CallbackInfo var1) {
      IIIIIllII var2 = IIIIIllII.III();
      if (var2 != null) {
         lIIIlIlI var3 = var2.II();
         if (var3 != null) {
            lIIIIlIl var4 = var3.IlIII();
            if (var4 != null) {
               var4.IIIl(this.field_1789, this.field_1787);
            }

            lIIIIIII var5 = var3.llll();
            if (var5 != null && var5.l()) {
               float var6 = var5.lI();
               this.field_1789 *= var6;
               this.field_1787 *= var6;
            }
         }
      }
   }
}
