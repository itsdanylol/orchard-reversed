package k74.y;

import k74.x.IIIIIllII;
import k74.x.IIll;
import k74.x.IlIIIIl;
import k74.x.lIIlllII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public abstract class IIIIIlIll {
   @Inject(
      method = {"method_2918"},
      at = {@At("TAIL")}
   )
   private void I(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      IIll.lIllI();
      IIIIIllII var4 = IIIIIllII.III();
      if (var4 != null) {
         var4.II().IIIlIl(var2);
      }
   }

   @Inject(
      method = {"method_2918"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void l(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      IIIIIllII var4 = IIIIIllII.III();
      if (var4 != null) {
         IlIIIIl var5 = var4.II().IIlIlIl();
         if (var5 != null && var5.lll(class_310.method_1551())) {
            var3.cancel();
            return;
         }

         lIIlllII var6 = var4.II().llIl();
         if (var6 != null && var6.IIIIlIl() && !IIll.IllIll() && var2 instanceof class_1309 var7) {
            var6.II(class_310.method_1551(), var7);
         }

         var4.II().IIIIl(var2);
      }
   }
}
