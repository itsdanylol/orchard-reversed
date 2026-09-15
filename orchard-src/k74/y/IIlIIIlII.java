package k74.y;

import k74.x.IIIIIllII;
import k74.x.IIlIIlIl;
import k74.x.IIll;
import k74.x.IIllIIlll;
import k74.x.IIllllI;
import k74.x.IlllIlII;
import k74.x.lIIIlIll;
import k74.x.lIIIllII;
import k74.x.lllIlllI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_239;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_310.class})
public abstract class IIlIIIlII {
   @Unique
   private boolean I;
   @Unique
   private class_239 l;

   @Inject(
      method = {"method_1508"},
      at = {@At("TAIL")}
   )
   private void I(CallbackInfo var1) {
      if (!IIllllI.II()) {
         IIIIIllII var2 = IIIIIllII.III();
         if (var2 != null) {
            var2.II().IlIlIIl(class_310.method_1551());
         }
      }
   }

   @Unique
   private void l(class_310 var1) {
      if (this.I) {
         if (var1 != null) {
            var1.field_1765 = this.l;
         }

         this.l = null;
         this.I = false;
      }
   }

   @Inject(
      method = {"method_1583"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void II(CallbackInfo var1) {
      if (!IIllllI.II()) {
         class_310 var2 = class_310.method_1551();
         if (IIll.IIllIIl() || !lIIIllII.ll(var2) && !IIll.IIlllll() && !IlllIlII.III()) {
            if (IIll.IIIIII(var2)) {
               var1.cancel();
            }
         } else {
            var1.cancel();
         }
      }
   }

   @Inject(
      method = {"method_1574"},
      at = {@At("HEAD")}
   )
   private void Il(CallbackInfo var1) {
      if (!IIllllI.II()) {
         IIlIIlIl.IllIll();
      }
   }

   @Inject(
      method = {"method_1583"},
      at = {@At("RETURN")}
   )
   private void lI(CallbackInfo var1) {
      if (!IIllllI.II()) {
         IIIIIllII var2 = IIIIIllII.III();
         if (var2 != null && var2.II() != null) {
            lllIlllI var3 = var2.II().lllII(lllIlllI.class);
            if (var3 != null) {
               var3.Il(class_310.method_1551());
            }
         }
      }
   }

   @Inject(
      method = {"method_1536"},
      at = {@At("RETURN")}
   )
   private void ll(CallbackInfoReturnable<Boolean> var1) {
      class_310 var2 = class_310.method_1551();
      this.l(var2);
   }

   @Inject(
      method = {"method_1490"},
      at = {@At("HEAD")}
   )
   private void III(CallbackInfo var1) {
      if (!IIllllI.II()) {
         IIIIIllII var2 = IIIIIllII.III();
         if (var2 != null) {
            var2.l();
         }
      }
   }

   @Inject(
      method = {"method_1536"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void IIl(CallbackInfoReturnable<Boolean> var1) {
      if (!IIllllI.II()) {
         class_310 var2 = class_310.method_1551();
         if (var2 != null) {
            this.l(var2);
            IIIIIllII var3 = IIIIIllII.III();
            if (IIll.IIllIII() || IIll.IIllIIl() || !lIIIllII.ll(var2) && !IIll.IIlllll() && !IlllIlII.III()) {
               if (!IIll.IIllIII() && IIll.IIIIII(var2)) {
                  var1.setReturnValue(false);
               } else if (var3 != null && var3.II() != null) {
                  class_3966 var4 = this.Ill(var2, var3);
                  if (var4 != null) {
                     this.l = var2.field_1765;
                     this.I = true;
                     var2.field_1765 = var4;
                  }

                  if (var2.field_1765 instanceof class_3966 var5 && IIll.lIIIll(var2, var5.method_17782())) {
                     IIll.lllIlI(var2);
                     var1.setReturnValue(false);
                  } else {
                     if (!IIll.IIllIII()) {
                        lIIIlIll var7 = var3.II().IlIIlII();
                        if (var7 != null && var7.Il(var2)) {
                           var1.setReturnValue(false);
                           return;
                        }
                     }
                  }
               }
            } else {
               var1.setReturnValue(false);
            }
         }
      }
   }

   @Inject(
      method = {"method_1508"},
      at = {@At("HEAD")}
   )
   private void IlI(CallbackInfo var1) {
      if (!IIllllI.II()) {
         IIIIIllII var2 = IIIIIllII.III();
         if (var2 != null) {
            class_310 var3 = class_310.method_1551();
            IIllIIlll var4 = var2.II().lIllII();
            if (var4 != null) {
               var4.IIlI(var3);
            }

            if (var2.II().IIlllll() != null && var2.II().IIlllll().IIIIlIl() && var3 != null && var3.field_1690 != null) {
               class_304 var5 = var3.field_1690.field_1824;
               if (var5 != null) {
                  IIll.lIIIIlI(var5);
                  var5.method_23481(false);
               }
            }

            if (var3 != null && var3.field_1690 != null) {
               IIll.llllI(var3);
               if (!IIll.IIllIIl() && (lIIIllII.ll(var3) || IIll.IIlllll() || IlllIlII.III())) {
                  if (var3.field_1690.field_1886 != null) {
                     IIll.lIIIIlI(var3.field_1690.field_1886);
                     var3.field_1690.field_1886.method_23481(false);
                  }

                  if (var3.field_1690.field_1904 != null) {
                     IIll.lIIIIlI(var3.field_1690.field_1904);
                     var3.field_1690.field_1904.method_23481(false);
                  }
               }
            }

            if (var2.II() != null) {
               var2.II().llllIl(var3);
               var2.II().IIlll(var3);
            }

            var2.II().l(class_310.method_1551());
            if (var4 != null) {
               var4.IIlI(var3);
            }

            if (var3 != null && var3.field_1690 != null) {
               if (IIll.IIIIII(var3)) {
                  if (var3.field_1690.field_1886 != null) {
                     IIll.lIIIIlI(var3.field_1690.field_1886);
                     var3.field_1690.field_1886.method_23481(false);
                  }

                  if (var3.field_1690.field_1904 != null) {
                     IIll.lIIIIlI(var3.field_1690.field_1904);
                     var3.field_1690.field_1904.method_23481(false);
                  }
               } else if (var3.field_1755 == null && !lIIIllII.ll(var3) && !IIll.IIlllll() && !IlllIlII.III()) {
                  if (var3.field_1690.field_1886 != null && !var3.field_1690.field_1886.method_1434() && IIll.IlIllll(var3, var3.field_1690.field_1886)) {
                     var3.field_1690.field_1886.method_23481(true);
                  }

                  if (var3.field_1690.field_1904 != null && !var3.field_1690.field_1904.method_1434() && IIll.IlIllll(var3, var3.field_1690.field_1904)) {
                     var3.field_1690.field_1904.method_23481(true);
                  }
               }
            }
         }
      }
   }

   @Unique
   private class_3966 Ill(class_310 var1, IIIIIllII var2) {
      return var1 != null && var2 != null && var2.II() != null ? null : null;
   }
}
