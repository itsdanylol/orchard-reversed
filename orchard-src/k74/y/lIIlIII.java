package k74.y;

import k74.x.IIIIIllII;
import k74.x.IIlIIlIII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_268;
import net.minecraft.class_269;
import net.minecraft.class_5900;
import net.minecraft.class_634;
import net.minecraft.class_5900.class_5901;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_634.class})
public abstract class lIIlIII {
   @Inject(
      method = {"method_11136"},
      at = {@At("TAIL")},
      require = 1
   )
   private void I(class_2626 var1, CallbackInfo var2) {
      this.Il(var1);
   }

   @Redirect(
      method = {"method_11099"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_269;method_1157(Ljava/lang/String;Lnet/minecraft/class_268;)V"
      )
   )
   private void l(class_269 var1, String var2, class_268 var3) {
      if (var1 != null && var3 != null && var1.method_1164(var2) == var3) {
         try {
            var1.method_1157(var2, var3);
         } catch (IllegalStateException var5) {
         }
      }
   }

   @Inject(
      method = {"method_11100"},
      at = {@At("TAIL")},
      require = 1
   )
   private void II(class_2637 var1, CallbackInfo var2) {
      this.Il(var1);
   }

   @Unique
   private void Il(class_2596<?> var1) {
      IIIIIllII var2 = IIIIIllII.III();
      IIlIIlIII var3 = var2 != null && var2.II() != null ? var2.II().lIIIIl() : null;
      if (var3 != null && var3.IIlIlI()) {
         var3.lllIll(var1);
      }
   }

   @Inject(
      method = {"method_11099"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void lI(class_5900 var1, CallbackInfo var2) {
      if (var1 != null && var1.method_34176() != class_5901.field_29155) {
         class_269 var3 = ((class_634)this).method_55823();
         if (var3 == null || var3.method_1153(var1.method_34177()) == null) {
            var2.cancel();
         }
      }
   }
}
