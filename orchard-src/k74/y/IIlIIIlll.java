package k74.y;

import k74.x.IIIIIllII;
import k74.x.IlIIIl;
import k74.x.lIIlllI;
import k74.x.lIlI;
import k74.x.llllllll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_5134;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_4184.class})
public abstract class IIlIIIlll {
   @Shadow
   private boolean field_18719;

   @Shadow
   protected abstract void method_19325(float var1, float var2);

   @Shadow
   protected abstract void method_19324(float var1, float var2, float var3);

   @Inject(
      method = {"method_19321"},
      at = {@At("TAIL")}
   )
   private void I(class_1937 var1, class_1297 var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      IIIIIllII var7 = IIIIIllII.III();
      if (var7 != null) {
         lIlI var8 = var7.II().IIlllll();
         if (var8 != null && var8.III(var2)) {
            this.field_18719 = false;
            this.method_19322(var8.ll(var5));
            this.method_19325(var8.Ill(var5), var8.IIl(var5));
         } else {
            float var9 = 0.0F;
            float var10 = 0.0F;
            boolean var11 = false;
            IlIIIl var12 = var7.II().IlIlIll();
            if (var12 != null && var12.lIIII(var2)) {
               var9 = var12.IIIl(var5);
               var10 = var12.Il(var5);
               var11 = true;
            } else {
               llllllll var13 = lIIlllI.I();
               if (lIIlllI.l(var13, var2)) {
                  var9 = lIIlllI.II(var13, var5);
                  var10 = lIIlllI.Il(var13, var5);
                  var11 = true;
               }
            }

            if (var11) {
               this.method_19322(var2.method_5836(var5));
               float var21 = var9;
               float var14 = var10;
               if (var4) {
                  var21 = var9 + 180.0F;
                  var14 = -var10;
               }

               this.method_19325(var21, var14);
               if (var3) {
                  float var15 = 1.0F;
                  float var16 = 4.0F;
                  if (var2 instanceof class_1309 var17) {
                     var15 = var17.method_55693();
                     var16 = (float)var17.method_45325(class_5134.field_59674);
                  }

                  float var22 = var15;
                  float var18 = var16;
                  if (var2.method_5765() && var2.method_5854() instanceof class_1309 var19) {
                     var22 = var19.method_55693();
                     var18 = (float)var19.method_45325(class_5134.field_59674);
                  }

                  this.method_19324(-this.method_19318(Math.max(var15 * var16, var22 * var18)), 0.0F, 0.0F);
               }
            }
         }
      }
   }

   @Shadow
   protected abstract void method_19322(class_243 var1);

   @Shadow
   protected abstract float method_19318(float var1);
}
