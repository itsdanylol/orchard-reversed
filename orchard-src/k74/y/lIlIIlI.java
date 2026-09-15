package k74.y;

import java.util.HashMap;
import java.util.Map;
import k74.x.IIIIIIlI;
import k74.x.IlIlIIlll;
import k74.x.IllIll;
import k74.x.lIIlI;
import k74.x.lllIIll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_355;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_355.class})
public abstract class lIlIIlI {
   @Unique
   private final Map<String, class_640> I = new HashMap<>();

   @Shadow
   public abstract class_2561 method_1918(class_640 var1);

   @Inject(
      method = {"method_1919"},
      at = {@At("RETURN")}
   )
   private void I(CallbackInfo var1) {
      lIIlI.I();
   }

   @Inject(
      method = {"method_1918"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void l(class_640 var1, CallbackInfoReturnable<class_2561> var2) {
      class_2561 var3 = IlIlIIlll.lll(var1, (class_2561)var2.getReturnValue());
      var3 = IllIll.III(var1, var3);
      class_2561 var4 = IIIIIIlI.l(var1, var3);
      if (var4 != null) {
         this.I.put(var4.getString(), var1);
      }

      var2.setReturnValue(var4);
   }

   @Inject(
      method = {"method_1919"},
      at = {@At("HEAD")}
   )
   private void II(CallbackInfo var1) {
      this.I.clear();
      lIIlI.l();
   }

   @Redirect(
      method = {"method_1919"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_332;drawTextWithShadow(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;III)I"
      )
   )
   private int Il(class_332 var1, class_327 var2, class_2561 var3, int var4, int var5, int var6) {
      class_640 var7 = this.I.remove(var3.getString());
      int var8 = lllIIll.IIlI(var1, var7, var2, var4, var5);
      lIIlI.lI(var4 - 10, var5 - 1, var4 + var8 + var2.method_27525(var3) + 110, var5 + 8);
      var1.method_27535(var2, var3, var4 + var8, var5, var6);
      return 0;
   }
}
