package k74.y;

import k74.x.IIIIIllII;
import k74.x.IIIIlIlll;
import k74.x.IIIIllIII;
import k74.x.IlIIIIl;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_2616;
import net.minecraft.class_2663;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_742;
import net.minecraft.class_8143;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_634.class})
public abstract class llIlIIll {
   @Inject(
      method = {"method_11148"},
      at = {@At("TAIL")}
   )
   private void I(class_2663 var1, CallbackInfo var2) {
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1687 != null) {
            class_1297 var5 = var1.method_11469(var4.field_1687);
            if (var5 != null && var3.II() != null) {
               var3.II().IIIlIII(var5, var1.method_11470());
            }

            if (var1.method_11470() == 35) {
               if (var4.field_1724 != null && var5 != null && var5.method_5628() == var4.field_1724.method_5628()) {
                  IlIIIIl var6 = var3.II().IIlIlIl();
                  if (var6 != null) {
                     var6.Illl();
                  }
               }

               IIIIlIlll var8 = var3.II().lll();
               if (var8 != null && var8.IIIIlIl() && var5 instanceof class_742 var7) {
                  var8.ll(var7);
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_45729"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void l(String var1, CallbackInfo var2) {
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null && var3.II() != null && var3.II().lIllll(var1)) {
         var2.cancel();
      }
   }

   @Inject(
      method = {"method_11160"},
      at = {@At("HEAD")}
   )
   private void II(class_2616 var1, CallbackInfo var2) {
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null && var3.II() != null) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1687 != null) {
            class_1297 var5 = var4.field_1687.method_8469(var1.method_11269());
            if (var5 != null) {
               var3.II().lIIIlI(var5, var1.method_11267());
            }
         }
      }
   }

   @Inject(
      method = {"method_49034"},
      at = {@At("TAIL")}
   )
   private void Il(class_8143 var1, CallbackInfo var2) {
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null && var3.II() != null) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1724 != null && var4.field_1687 != null && var1.comp_1267() == var4.field_1724.method_5628()) {
            IIIIllIII var5 = var3.II().IIIIlI();
            if (var5 != null && var5.IIIIlIl()) {
               var5.lI(var1.method_49071(var4.field_1687));
            }
         }
      }
   }
}
