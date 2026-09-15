package k74.y;

import k74.x.IIIIIIlII;
import k74.x.IIIIIllII;
import k74.x.IIll;
import k74.x.IIllIIIII;
import k74.x.IIlllIIlI;
import k74.x.IlIIIIl;
import k74.x.IlIlIll;
import k74.x.IlIlllI;
import k74.x.lIIlIll;
import k74.x.lIIllII;
import k74.x.llIlII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public abstract class lIIIlIl {
   @Unique
   private int I;

   @Inject(
      method = {"method_2918"},
      at = {@At("HEAD")}
   )
   private void I(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      if (IIll.IlI()) {
         this.I++;
      }
   }

   @Inject(
      method = {"method_2896"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void l(class_746 var1, class_1268 var2, class_3965 var3, CallbackInfoReturnable<class_1269> var4) {
      if (IIll.IlI()) {
         this.I++;
      }

      IIIIIllII var5 = IIIIIllII.III();
      if (var5 != null) {
         IlIIIIl var6 = var5.II().IIlIlIl();
         if (var6 != null && var6.lll(class_310.method_1551())) {
            this.IIl();
            var4.setReturnValue(class_1269.field_5814);
         } else {
            lIIlIll var7 = var5.II().lllII(lIIlIll.class);
            if (var7 != null && var7.I(class_310.method_1551(), var3)) {
               this.IIl();
               var4.setReturnValue(class_1269.field_5814);
            } else {
               IIllIIIII var8 = var5.II().IllIll();
               if (var8 != null) {
                  var8.Ill(class_310.method_1551(), var2, var3);
               }

               llIlII var9 = var5.II().IIIlllI();
               if (var9 != null) {
                  var9.IllII(class_310.method_1551(), var2, var3);
               }

               IlIlIll var10 = var5.II().IlIIIII();
               if (var10 != null && (var8 == null || !var8.l())) {
                  var10.Illl(class_310.method_1551(), var2, var3);
               }

               IlIlllI var11 = var5.II().IlIlI();
               if (var11 != null && !var11.IIIlI()) {
                  var11.lll(class_310.method_1551(), var2, var3);
               }

               IIIIIIlII var12 = var5.II().IIllII();
               if (var12 != null) {
                  var12.ll(class_310.method_1551(), var2, var3);
               }

               IIlllIIlI var13 = var5.II().lllI();
               if (var13 != null && var13.IIIIlIl()) {
                  if (var13.lll(class_310.method_1551())) {
                     this.IIl();
                     var4.setReturnValue(class_1269.field_5814);
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_2896"},
      at = {@At("RETURN")}
   )
   private void II(class_746 var1, class_1268 var2, class_3965 var3, CallbackInfoReturnable<class_1269> var4) {
      this.IIl();
      IIIIIllII var5 = IIIIIllII.III();
      if (var5 != null) {
         IIllIIIII var6 = var5.II().IllIll();
         if (var6 != null) {
            var6.III(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         IlIlIll var7 = var5.II().IlIIIII();
         if (var7 != null) {
            var7.IlII(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         llIlII var8 = var5.II().IIIlllI();
         if (var8 != null) {
            var8.IIlII(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         IIIIIIlII var9 = var5.II().IIllII();
         if (var9 != null) {
            var9.lIIII(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         IlIlllI var10 = var5.II().IlIlI();
         if (var10 != null) {
            var10.ll(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }
      }
   }

   @Inject(
      method = {"method_2918"},
      at = {@At("RETURN")}
   )
   private void Il(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      this.IIl();
   }

   @Inject(
      method = {"method_2919"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void lI(class_1657 var1, class_1268 var2, CallbackInfoReturnable<class_1269> var3) {
      if (IIll.IlI()) {
         this.I++;
      }

      IIIIIllII var4 = IIIIIllII.III();
      if (var4 != null) {
         IlIIIIl var5 = var4.II().IIlIlIl();
         if (var5 != null && var5.lll(class_310.method_1551())) {
            this.IIl();
            var3.setReturnValue(class_1269.field_5814);
         }
      }
   }

   @Inject(
      method = {"method_2911"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ll(CallbackInfo var1) {
      if (IIll.llIIlI()) {
         var1.cancel();
      }
   }

   @Inject(
      method = {"method_2910"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void III(class_2338 var1, class_2350 var2, CallbackInfoReturnable<Boolean> var3) {
      IIIIIllII var4 = IIIIIllII.III();
      if (var4 != null) {
         lIIllII var5 = var4.II().lllII(lIIllII.class);
         boolean var6 = var5 != null && var5.IlIl(class_310.method_1551(), var1, var2);
         IlIIIIl var7 = var4.II().IIlIlIl();
         if (var7 != null && var7.lll(class_310.method_1551())) {
            var3.setReturnValue(false);
         } else if (var6) {
            var3.setReturnValue(false);
         } else {
            IIlllIIlI var8 = var4.II().lllI();
            if (var8 != null) {
               if (var8.llI(var1, var2)) {
                  var3.setReturnValue(true);
               }
            }
         }
      }
   }

   @Unique
   private void IIl() {
      if (this.I > 0) {
         this.I--;
         IIll.lIl();
      }
   }

   @Inject(
      method = {"method_2919"},
      at = {@At("RETURN")}
   )
   private void IlI(class_1657 var1, class_1268 var2, CallbackInfoReturnable<class_1269> var3) {
      this.IIl();
      IIIIIllII var4 = IIIIIllII.III();
      if (var4 != null) {
         IIIIIIlII var5 = var4.II().IIllII();
         if (var5 != null) {
            var5.IllIl(class_310.method_1551(), var2, (class_1269)var3.getReturnValue());
         }
      }
   }
}
