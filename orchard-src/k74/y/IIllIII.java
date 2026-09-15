package k74.y;

import k74.x.IIIIIIlI;
import k74.x.IIIlIlll;
import k74.x.IlIIIlI;
import k74.x.IlIlIIlll;
import k74.x.IllIll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class IIllIII {
   @Inject(
      method = {"method_5756"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void I(class_1657 var1, CallbackInfoReturnable<Boolean> var2) {
      class_1297 var3 = (class_1297)this;
      if (IIIlIlll.I(var3)) {
         var2.setReturnValue(true);
      }
   }

   @Inject(
      method = {"method_5477"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void l(CallbackInfoReturnable<class_2561> var1) {
      class_1297 var2 = (class_1297)this;
      if (var2 instanceof class_1657 var3) {
         class_2561 var4 = IllIll.Il(var3.method_7334(), (class_2561)var1.getReturnValue());
         var1.setReturnValue(IlIlIIlll.IIII(var3, IIIIIIlI.lII(var3, var4)));
      }
   }

   @Inject(
      method = {"method_5733"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void II(CallbackInfoReturnable<Boolean> var1) {
      class_1297 var2 = (class_1297)this;
      if (IIIlIlll.II(var2) || IlIIIlI.lIIl(var2)) {
         var1.setReturnValue(false);
      }
   }

   @Inject(
      method = {"method_5476"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void Il(CallbackInfoReturnable<class_2561> var1) {
      class_1297 var2 = (class_1297)this;
      if (var2 instanceof class_1657 var3) {
         class_2561 var4 = IllIll.Il(var3.method_7334(), (class_2561)var1.getReturnValue());
         var1.setReturnValue(IlIlIIlll.IIII(var3, IIIIIIlI.lII(var3, var4)));
      }
   }
}
