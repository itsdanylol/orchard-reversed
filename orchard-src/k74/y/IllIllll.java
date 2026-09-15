package k74.y;

import k74.x.IIIIIllII;
import k74.x.IIIIllIll;
import k74.x.lIIlllI;
import k74.x.lIIlllll;
import k74.x.llllllll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11659;
import net.minecraft.class_12152;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_759.class})
public abstract class IllIllll {
   @Unique
   private float I;
   @Unique
   private boolean l;
   @Shadow
   private class_1799 field_4048;
   @Shadow
   private class_1799 field_4047;
   @Shadow
   private float field_4052;
   @Shadow
   private float field_4043;
   @Unique
   private float II;

   @Inject(
      method = {"method_3228"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_759;method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"
      )},
      require = 1
   )
   private void I(
      class_742 var1,
      float var2,
      float var3,
      class_1268 var4,
      float var5,
      class_1799 var6,
      float var7,
      class_4587 var8,
      class_11659 var9,
      int var10,
      CallbackInfo var11
   ) {
      IIIIllIll.l(var1, var4, var6, var2, var5, var8);
   }

   @Redirect(
      method = {"method_3228"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_759;method_65816(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V"
      ),
      require = 1
   )
   private void l(
      class_759 var1,
      float var2,
      class_4587 var3,
      int var4,
      class_1306 var5,
      class_742 var6,
      float var7,
      float var8,
      class_1268 var9,
      float var10,
      class_1799 var11,
      float var12,
      class_4587 var13,
      class_11659 var14,
      int var15
   ) {
      if (!IIIIllIll.Il(var9)) {
         this.ilovcats$invokeSwingArm(var2, var3, var4, var5);
      }
   }

   @Inject(
      method = {"method_3228"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void II(
      class_742 var1,
      float var2,
      float var3,
      class_1268 var4,
      float var5,
      class_1799 var6,
      float var7,
      class_4587 var8,
      class_11659 var9,
      int var10,
      CallbackInfo var11
   ) {
      if (!IIIIllIll.lI(var1, var4)) {
         var11.cancel();
      }
   }

   @Invoker("method_65816")
   protected abstract void ilovcats$invokeSwingArm(float var1, class_4587 var2, int var3, class_1306 var4);

   @Inject(
      method = {"method_3220"},
      at = {@At("TAIL")},
      require = 0
   )
   private void Il(CallbackInfo var1) {
      lIIlllll var2 = IIIIllIll.I();
      if (var2 == null || !var2.IIIIlIl()) {
         this.ll();
      } else if (!this.l) {
         this.ll();
      } else {
         this.I = this.lI(this.I, this.field_4043, var2.IIIll(class_1268.field_5808));
         this.II = this.lI(this.II, this.field_4052, var2.IIIll(class_1268.field_5810));
         class_310 var3 = class_310.method_1551();
         if (var2.IIIlI(class_1268.field_5808)) {
            this.I = 1.0F;
            if (var3 != null && var3.field_1724 != null) {
               this.field_4047 = var3.field_1724.method_6047();
            }
         }

         if (var2.IIIlI(class_1268.field_5810)) {
            this.II = 1.0F;
            if (var3 != null && var3.field_1724 != null) {
               this.field_4048 = var3.field_1724.method_6079();
            }
         }

         this.field_4043 = this.I;
         this.field_4052 = this.II;
      }
   }

   @Unique
   private float lI(float var1, float var2, float var3) {
      if (var3 <= 0.0F) {
         return var2;
      } else {
         float var4 = class_3532.method_15363(1.0F - var3 * 0.82F, 0.16F, 1.0F);
         return var1 + (var2 - var1) * var4;
      }
   }

   @Unique
   private void ll() {
      this.l = true;
      this.I = this.field_4043;
      this.II = this.field_4052;
   }

   @Redirect(
      method = {"method_3228"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_12152;method_75391(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V"
      ),
      require = 1
   )
   private void III(
      float var1,
      class_4587 var2,
      int var3,
      class_1306 var4,
      class_742 var5,
      float var6,
      float var7,
      class_1268 var8,
      float var9,
      class_1799 var10,
      float var11,
      class_4587 var12,
      class_11659 var13,
      int var14
   ) {
      if (!IIIIllIll.Il(var8)) {
         class_12152.method_75391(var1, var2, var3, var4);
      }
   }

   @ModifyVariable(
      method = {"method_3228"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 1
   )
   private float IIl(float var1) {
      IIIIIllII var2 = IIIIIllII.III();
      if (var2 != null && var2.II() != null) {
         llllllll var3 = lIIlllI.I();
         return var3 == llllllll.Il ? var1 : lIIlllI.Il(var3, 1.0F);
      } else {
         return var1;
      }
   }
}
