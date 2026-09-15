package k74.y;

import k74.x.IIllllI;
import k74.x.IlIIIIII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2535;
import net.minecraft.class_2720;
import net.minecraft.class_2856;
import net.minecraft.class_310;
import net.minecraft.class_8673;
import net.minecraft.class_2856.class_2857;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_8673.class})
public abstract class IlIlIIlII {
   @Shadow
   @Final
   protected class_2535 field_45589;
   @Shadow
   @Final
   protected class_310 field_45588;

   @Inject(
      method = {"method_52784"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void I(class_2720 var1, CallbackInfo var2) {
      if (IlIIIIII.llll()) {
         if (!IlIIIIII.llI(var1.comp_2158())) {
            var2.cancel();
            IlIIIIII.llIl(var1.comp_2159(), this::l);
         }
      }
   }

   private void l(class_2720 var1, Boolean var2) {
      this.field_45588.execute(this::II);
   }

   private void II(class_2720 var1, Boolean var2) {
      if (!IIllllI.II() && this.field_45589.method_10758()) {
         if (!IlIIIIII.llll()) {
            this.method_52784(var1);
         } else if (var2 && IlIIIIII.IIlI(var1.comp_2159())) {
            IlIIIIII.IIII(var1.comp_2158());
            this.method_52784(var1);
         } else {
            this.field_45589.method_10743(new class_2856(var1.comp_2158(), class_2857.field_47667));
            IlIIIIII.III(var1.comp_2159());
         }
      }
   }

   @Shadow
   public abstract void method_52784(class_2720 var1);
}
