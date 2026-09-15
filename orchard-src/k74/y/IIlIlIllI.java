package k74.y;

import k74.x.IIIIIllII;
import k74.x.IIIIlIIII;
import k74.x.IIIIllIII;
import k74.x.IIll;
import k74.x.IIllIlIlI;
import k74.x.IIlllIll;
import k74.x.IIllllI;
import k74.x.IlIIIIl;
import k74.x.IlIlIIII;
import k74.x.IlIlIIllI;
import k74.x.IlllIlII;
import k74.x.IlllIll;
import k74.x.lIIIllII;
import k74.x.lIIIllIl;
import k74.x.lIIlIllI;
import k74.x.lIIlllIl;
import k74.x.lIlI;
import k74.x.lIllIIII;
import k74.x.llIllIlI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10185;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_744;
import net.minecraft.class_746;
import net.minecraft.class_3675.class_306;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_746.class})
public abstract class IIlIlIllI {
   @Shadow
   public class_744 field_3913;
   @Unique
   private boolean I;
   @Unique
   private boolean l;
   @Unique
   private boolean II;
   @Unique
   private boolean Il;
   @Unique
   private float lI;
   @Unique
   private boolean ll;
   @Unique
   private boolean III;
   @Unique
   private boolean IIl;
   @Unique
   private boolean IlI;
   @Unique
   private float Ill;
   @Unique
   private boolean lII;
   @Unique
   private boolean lIl;
   @Unique
   private boolean llI;
   @Unique
   private boolean lll;
   @Unique
   private boolean IIII;
   @Unique
   private boolean IIIl;
   @Unique
   private boolean IIlI;
   @Unique
   private boolean IIll;
   @Unique
   private boolean IlII;
   @Unique
   private boolean IlIl;
   @Unique
   private boolean IllI;
   @Unique
   private boolean Illl;
   @Unique
   private boolean lIII;
   @Unique
   private boolean lIIl;

   @Inject(
      method = {"method_6007"},
      at = {@At("TAIL")},
      require = 0
   )
   private void I(CallbackInfo var1) {
      if (!IIllllI.II()) {
         class_310 var2 = class_310.method_1551();
         IlllIlII.IIllI(var2);
      }
   }

   @Unique
   private void l(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         this.llI(var1, var1.field_1690.field_1894);
         this.llI(var1, var1.field_1690.field_1881);
         this.llI(var1, var1.field_1690.field_1913);
         this.llI(var1, var1.field_1690.field_1849);
         this.llI(var1, var1.field_1690.field_1867);
         this.llI(var1, var1.field_1690.field_1832);
         this.llI(var1, var1.field_1690.field_1903);
      }
   }

   @Unique
   private void II(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         IIIIIllII var2 = IIIIIllII.III();
         this.IIlI(var2, var1, var1.field_1690.field_1894);
         this.IIlI(var2, var1, var1.field_1690.field_1881);
         this.IIlI(var2, var1, var1.field_1690.field_1913);
         this.IIlI(var2, var1, var1.field_1690.field_1849);
         this.IIlI(var2, var1, var1.field_1690.field_1867);
         this.IIlI(var2, var1, var1.field_1690.field_1832);
         this.IIlI(var2, var1, var1.field_1690.field_1903);
      }
   }

   @Unique
   private void Il(class_310 var1, IIIIIllII var2) {
      if (!this.IllI) {
         if (var1 != null && var1.field_1724 != null && var1.field_1690 != null && var2 != null) {
            if (var2.II() == null || var2.II().IIIllI() == null || !var2.II().IIIllI().llI()) {
               if (!var1.field_1724.method_5624() && var1.field_1724.method_5805() && !var1.field_1724.method_5715() && !var1.field_1724.method_6115()) {
                  IIlllIll var3 = var2.II().IllIII();
                  boolean var4 = var3 != null && var3.II(var1);
                  lIllIIII var5 = var2.II().IIIIll();
                  boolean var6 = var5 != null && var5.Il();
                  boolean var7 = this.II || var1.field_1690.field_1867.method_1434() || k74.x.IIll.IlIllll(var1, var1.field_1690.field_1867);
                  if (var4 || var6 || var7) {
                     if (var4 || var1.field_1690.field_1894.method_1434() && !var1.field_1690.field_1881.method_1434()) {
                        var1.field_1724.method_5728(true);
                     }
                  }
               }
            }
         }
      }
   }

   private void lI(class_310 var1, double var2) {
      if (var1 != null && var1.field_1690 != null && !(var2 >= 0.999)) {
         float var4 = (this.Illl ? 1.0F : 0.0F) - (this.IlIl ? 1.0F : 0.0F);
         float var5 = (this.III ? 1.0F : 0.0F) - (this.lII ? 1.0F : 0.0F);
         float var6 = class_3532.method_15355(var4 * var4 + var5 * var5);
         if (!(var6 <= 1.0E-4F)) {
            if (var6 > 1.0F) {
               var4 /= var6;
               var5 /= var6;
            }

            float var7 = (float)var2;
            this.lI = var4 * var7;
            this.Ill = var5 * var7;
            this.IIII = true;
         }
      }
   }

   @Unique
   private void ll(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         this.Illl = this.lIl(var1, var1.field_1690.field_1894);
         this.IlIl = this.lIl(var1, var1.field_1690.field_1881);
         this.III = this.lIl(var1, var1.field_1690.field_1913);
         this.lII = this.lIl(var1, var1.field_1690.field_1849);
      }
   }

   @Unique
   private void III(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         IIIIIllII var2 = IIIIIllII.III();
         lIIIllIl var3 = var2 != null && var2.II() != null ? var2.II().IIIllI() : null;
         boolean var4 = var3 != null && var3.llI();
         this.Illl = !var4 && this.lIII(var1, var1.field_1690.field_1894);
         this.IlIl = var4 ? var3.IIIl() == IlllIll.l || this.lIII(var1, var1.field_1690.field_1881) : this.lIII(var1, var1.field_1690.field_1881);
         this.III = this.lIII(var1, var1.field_1690.field_1913);
         this.lII = this.lIII(var1, var1.field_1690.field_1849);
      }
   }

   @Unique
   private void IIl(class_310 var1, float var2) {
      float var3 = ((class_746)this).method_36454();
      lIIlllIl var4 = llIllIlI.IlIl(this.Illl, this.IlIl, this.III, this.lII, var3, var2);
      if (var4.I() != 0.0F || var4.l() != 0.0F) {
         this.IIIl(var1, var4.I(), var4.l());
      }
   }

   @Inject(
      method = {"method_6007"},
      at = {@At("HEAD")},
      require = 0
   )
   private void IlI(CallbackInfo var1) {
      this.IllI = false;
      if (!IIllllI.II()) {
         IIIIIllII var2 = IIIIIllII.III();
         if (var2 != null) {
            class_310 var3 = class_310.method_1551();
            if (var3.field_1690 != null) {
               if (lIIIllII.IlII(var3)) {
                  this.II(var3);
               }

               boolean var4 = var3.field_1755 instanceof lIIlIllI var5 && var5.IIlllll();
               boolean var23 = var3.field_1755 != null && !var4;
               if (this.IIl && !var23) {
                  this.l(var3);
               }

               this.IIl = var23;
               if (var23) {
                  this.IllI(var3);
               } else {
                  if (var4 && !lIIIllII.Il(var3)) {
                     this.l(var3);
                  }

                  this.Il = false;
                  this.IlI = false;
                  this.IIII = false;
                  this.lI = 0.0F;
                  this.Ill = 0.0F;
                  this.lIIl = false;
                  this.IIlI = false;
                  this.l = false;
                  this.ll = false;
                  this.IIll = false;
                  this.IlII = false;
                  this.I = false;
                  lIIIllIl var24 = var2.II() != null ? var2.II().IIIllI() : null;
                  boolean var7 = var24 != null && var24.llI();
                  this.Illl = !var7 && this.lIII(var3, var3.field_1690.field_1894);
                  this.IlIl = var7 ? var24.IIIl() == IlllIll.l || this.lIII(var3, var3.field_1690.field_1881) : this.lIII(var3, var3.field_1690.field_1881);
                  this.III = this.lIII(var3, var3.field_1690.field_1913);
                  this.lII = this.lIII(var3, var3.field_1690.field_1849);
                  this.II = !var7 && this.lIII(var3, var3.field_1690.field_1867);
                  this.lll = this.lIII(var3, var3.field_1690.field_1832);
                  this.lIII = this.lIII(var3, var3.field_1690.field_1903);
                  lIlI var8 = var2.II().IIlllll();
                  if (var8 != null && var8.IIIIlIl()) {
                     this.IIII(var2, var3, var3.field_1690.field_1894, false);
                     this.IIII(var2, var3, var3.field_1690.field_1881, false);
                     this.IIII(var2, var3, var3.field_1690.field_1913, false);
                     this.IIII(var2, var3, var3.field_1690.field_1849, false);
                     this.IIII(var2, var3, var3.field_1690.field_1867, false);
                     this.IIII(var2, var3, var3.field_1690.field_1832, false);
                     this.IIII(var2, var3, var3.field_1690.field_1903, false);
                     if (this.field_3913 != null) {
                        k74.x.IIll.IllIlll(this.field_3913, 0.0F, 0.0F);
                     }

                     this.Il = true;
                  }

                  lIllIIII var9 = var2.II().IIIIll();
                  if (var9 != null && var9.Il()) {
                     this.IIII(var2, var3, var3.field_1690.field_1867, true);
                     this.Il = true;
                  }

                  IIIIllIII var10 = var2.II().IIIIlI();
                  if (var10 != null) {
                     var10.l(var3, var10.I(var3));
                  }

                  IIlllIll var11 = var2.II().IllIII();
                  if (var11 != null && var11.lI(var3)) {
                     this.IIII(var2, var3, var3.field_1690.field_1903, true);
                     this.Il = true;
                  }

                  if (var11 != null && var11.II(var3)) {
                     this.IIII(var2, var3, var3.field_1690.field_1867, true);
                     this.Il = true;
                  }

                  IIllIlIlI var12 = var2.II().III();
                  if (var12 != null && var12.Ill(var3)) {
                     this.IIII(var2, var3, var3.field_1690.field_1903, true);
                     this.Il = true;
                  }

                  IIIIlIIII var13 = var2.II().IllIlI();
                  boolean var14 = var13 != null && var13.Il(var3);
                  if (var14) {
                     this.IIII(var2, var3, var3.field_1690.field_1832, true);
                     this.lI(var3, var13.ll(var3));
                     this.Il = true;
                  }

                  if (var13 != null && var13.lIl(var3)) {
                     this.IIII(var2, var3, var3.field_1690.field_1867, false);
                     this.Il = true;
                  }

                  IlIlIIllI var15 = var2.II().IIIIlll();
                  boolean var16 = var15 != null && var15.I();
                  boolean var17 = var15 != null && var15.III();
                  boolean var18 = var15 != null && var15.ll();
                  boolean var19 = IlllIlII.lIlll();
                  boolean var20 = (var16 || var19) && IlllIlII.IllIl(var3);
                  if (!var7 && !this.IIII && var20 && (var17 || var19 && !var18)) {
                     this.III(var3);
                     this.IIl(var3, IlllIlII.IIlIll());
                  }

                  float var21 = IlllIlII.lll(var3);
                  if (!var7 && !this.IIII && Float.isFinite(var21) && !var18) {
                     this.III(var3);
                     this.lII(var3, var21);
                  }

                  if (lIIIllII.Illl(var3)) {
                     this.Illl = this.lIl(var3, var3.field_1690.field_1894);
                     this.IlIl = this.lIl(var3, var3.field_1690.field_1881);
                     this.III = this.lIl(var3, var3.field_1690.field_1913);
                     this.lII = this.lIl(var3, var3.field_1690.field_1849);
                     this.II = this.lIl(var3, var3.field_1690.field_1867);
                     this.lll = this.lIl(var3, var3.field_1690.field_1832);
                     this.lIII = this.lIl(var3, var3.field_1690.field_1903);
                     this.IIII(var2, var3, var3.field_1690.field_1894, false);
                     this.IIII(var2, var3, var3.field_1690.field_1881, false);
                     this.IIII(var2, var3, var3.field_1690.field_1913, false);
                     this.IIII(var2, var3, var3.field_1690.field_1849, false);
                     this.IIII(var2, var3, var3.field_1690.field_1867, false);
                     this.IIII(var2, var3, var3.field_1690.field_1832, false);
                     this.IIII(var2, var3, var3.field_1690.field_1903, false);
                     if (this.field_3913 != null) {
                        k74.x.IIll.IllIlll(this.field_3913, 0.0F, 0.0F);
                     }

                     this.Il = true;
                  }

                  lIIIllII.lIlI(var3);
                  IlIIIIl var22 = var2.II().IIlIlIl();
                  if (var22 != null && var22.lll(var3)) {
                     lIIIllII.lII(var3);
                  }

                  if (lIIIllII.II(var3)) {
                     this.IIIl = this.lIl(var3, var3.field_1690.field_1886);
                     this.lIl = this.lIl(var3, var3.field_1690.field_1904);
                     var3.field_1690.field_1886.method_23481(false);
                     var3.field_1690.field_1904.method_23481(false);
                     this.llI = true;
                     this.Il = true;
                  }

                  this.IllI = var2.II().lllIlI() != null && var2.II().lllIlI().lIlIl(var3) || var2.II().lIIIII() != null && var2.II().lIIIII().lIIlI(var3);
                  if (this.IllI) {
                     this.IIII(var2, var3, var3.field_1690.field_1867, false);
                     this.Il = true;
                  }
               }
            }
         }
      }
   }

   @Inject(
      method = {"method_5773"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_3136()V"
      )},
      require = 0
   )
   private void Ill(CallbackInfo var1) {
      if (!IIllllI.II()) {
         class_310 var2 = class_310.method_1551();
         k74.x.IIll.IIll(var2);
         IIIIIllII var3 = IIIIIllII.III();
         if (var3 != null) {
            IlIIIIl var4 = var3.II().IIlIlIl();
            if (var4 != null) {
               var4.IlII(var2);
            }
         }

         IlllIlII.IIlIl(var2);
      }
   }

   @Unique
   private void lII(class_310 var1, float var2) {
      float var3 = ((class_746)this).method_36454();
      lIIlllIl var4 = llIllIlI.IlIl(this.Illl, this.IlIl, this.III, this.lII, var3 + var2, var3);
      if (var4.I() != 0.0F || var4.l() != 0.0F) {
         this.IIIl(var1, var4.I(), var4.l());
      }
   }

   @Unique
   private boolean lIl(class_310 var1, class_304 var2) {
      return var2 != null && k74.x.IIll.IlIllll(var1, var2);
   }

   @Unique
   private void llI(class_310 var1, class_304 var2) {
      if (var2 != null) {
         boolean var3 = this.lIl(var1, var2);
         var2.method_23481(var3);
         class_306 var4 = k74.x.IIll.lllII(var2);
         if (!k74.x.IIll.IIlll(var4)) {
            class_304.method_1416(var4, var3);
         }
      }
   }

   @Inject(
      method = {"method_6007"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_1156;method_4909(Lnet/minecraft/class_744;)V"
      )},
      require = 0
   )
   private void lll(CallbackInfo var1) {
      if (!IIllllI.II()) {
         class_310 var2 = class_310.method_1551();
         if (var2.field_1690 != null) {
            boolean var3 = var2.field_1755 instanceof lIIlIllI var4 && var4.IIlllll();
            if (var2.field_1755 != null && !var3) {
               this.IllI(var2);
            } else {
               this.IlIl(var2);
               if (this.IllI && var2.field_1724 != null) {
                  if (this.field_3913 != null) {
                     class_10185 var6 = this.field_3913.field_54155;
                     this.field_3913.field_54155 = new class_10185(
                        var6.comp_3159(), var6.comp_3160(), var6.comp_3161(), var6.comp_3162(), var6.comp_3163(), var6.comp_3164(), false
                     );
                  }

                  var2.field_1724.method_5728(false);
               }
            }
         }
      }
   }

   @Unique
   private void IIII(IIIIIllII var1, class_310 var2, class_304 var3, boolean var4) {
      if (var2.field_1690 != null) {
         if (var3 == var2.field_1690.field_1894) {
            this.lIIl = true;
         } else if (var3 == var2.field_1690.field_1881) {
            this.IIlI = true;
         } else if (var3 == var2.field_1690.field_1913) {
            this.l = true;
         } else if (var3 == var2.field_1690.field_1849) {
            this.ll = true;
         } else if (var3 == var2.field_1690.field_1867) {
            this.IIll = true;
         } else if (var3 == var2.field_1690.field_1832) {
            this.IlII = true;
         } else if (var3 == var2.field_1690.field_1903) {
            this.I = true;
         }
      }

      IlIlIIII var5 = IlIlIIII.llI();
      if (var5 != null) {
         var5.ll(this, var2, var3, var4);
      } else {
         var3.method_23481(var4);
      }
   }

   @Unique
   private void IIIl(class_310 var1, float var2, float var3) {
      if (var1 != null && var1.field_1690 != null) {
         this.lI = var2;
         this.Ill = var3;
         this.IIII = true;
         IIIIIllII var4 = IIIIIllII.III();
         this.IIII(var4, var1, var1.field_1690.field_1894, var2 > 0.0F);
         this.IIII(var4, var1, var1.field_1690.field_1881, var2 < 0.0F);
         this.IIII(var4, var1, var1.field_1690.field_1913, var3 > 0.0F);
         this.IIII(var4, var1, var1.field_1690.field_1849, var3 < 0.0F);
         this.Il = true;
      }
   }

   @Unique
   private void IIlI(IIIIIllII var1, class_310 var2, class_304 var3) {
      IlIlIIII var4 = IlIlIIII.llI();
      if (var4 != null) {
         var4.IIII(this, var2, var3);
      } else {
         var3.method_23481(this.lIl(var2, var3));
      }
   }

   @Inject(
      method = {"method_48300"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void IIll(CallbackInfoReturnable<Boolean> var1) {
      if (!IIllllI.II() && IIIIIllII.III() != null && this.IllI) {
         var1.setReturnValue(false);
      }
   }

   @Inject(
      method = {"method_5773"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_746;method_3136()V",
         shift = Shift.AFTER
      )},
      require = 0
   )
   private void IlII(CallbackInfo var1) {
      if (!IIllllI.II()) {
         class_310 var2 = class_310.method_1551();
         k74.x.IIll.IIIIIIl();
         IlllIlII.IIIl(var2);
         lIIIllII.Ill(var2);
         IIIIIllII var3 = IIIIIllII.III();
         if (var3 != null) {
            var3.II().IIIIII(var2);
         }
      }
   }

   @Unique
   private void IlIl(class_310 var1) {
      if (var1 != null && var1.field_1690 != null && (this.Il || this.IIII)) {
         if (this.IIII && this.field_3913 != null) {
            k74.x.IIll.IllIlll(this.field_3913, this.lI, this.Ill);
         }

         IIIIIllII var2 = IIIIIllII.III();
         lIIIllIl var3 = var2 != null && var2.II() != null ? var2.II().IIIllI() : null;
         boolean var4 = var3 != null && var3.llI();
         boolean var5 = this.Il;
         if (var5) {
            if (!lIIIllII.Il(var1)) {
               if (this.lIIl && !var4) {
                  this.IIlI(var2, var1, var1.field_1690.field_1894);
               }

               if (this.IIlI && !var4) {
                  this.IIlI(var2, var1, var1.field_1690.field_1881);
               }

               if (this.l) {
                  this.IIlI(var2, var1, var1.field_1690.field_1913);
               }

               if (this.ll) {
                  this.IIlI(var2, var1, var1.field_1690.field_1849);
               }

               if (this.IIll && !var4) {
                  this.IIlI(var2, var1, var1.field_1690.field_1867);
               }

               if (this.IlII) {
                  this.IIlI(var2, var1, var1.field_1690.field_1832);
               }
            }

            if (this.I) {
               this.IIlI(var2, var1, var1.field_1690.field_1903);
            }
         }

         if (this.llI) {
            var1.field_1690.field_1886.method_23481(this.IIIl);
            var1.field_1690.field_1904.method_23481(this.lIl);
            this.llI = false;
         }

         if (var2 != null && var5 && !lIIIllII.Il(var1) && !var4) {
            this.Il(var1, var2);
         }

         this.Il = false;
         this.IIII = false;
      }
   }

   @Unique
   private void IllI(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         var1.field_1690.field_1894.method_23481(false);
         var1.field_1690.field_1881.method_23481(false);
         var1.field_1690.field_1913.method_23481(false);
         var1.field_1690.field_1849.method_23481(false);
         var1.field_1690.field_1867.method_23481(false);
         var1.field_1690.field_1832.method_23481(false);
         var1.field_1690.field_1903.method_23481(false);
         if (this.field_3913 != null) {
            this.field_3913.field_54155 = new class_10185(false, false, false, false, false, false, false);
            k74.x.IIll.IllIlll(this.field_3913, 0.0F, 0.0F);
         }
      }
   }

   @Inject(
      method = {"method_6007"},
      at = {@At("TAIL")},
      require = 0
   )
   private void Illl(CallbackInfo var1) {
      if (!IIllllI.II()) {
         class_310 var2 = class_310.method_1551();
         this.IlIl(var2);
         IIIIIllII var3 = IIIIIllII.III();
         if (var3 != null) {
            class_746 var4 = (class_746)this;
            if (var2.field_1724 != null) {
               IIlllIll var5 = var3.II().IllIII();
               if (var5 != null && var5.IIl() && !var4.method_24828()) {
                  class_243 var6 = var4.method_18798();
                  double var7 = Math.sqrt(var6.field_1352 * var6.field_1352 + var6.field_1350 * var6.field_1350);
                  if (var7 > 0.001) {
                     float var9 = var5.lII();
                     float var10 = (float)Math.toDegrees(Math.atan2(-var6.field_1352, var6.field_1350));
                     float var11 = class_3532.method_15393(var9 - var10);
                     class_243 var12 = new class_243(var6.field_1352, 0.0, var6.field_1350).method_1024(-((float)Math.toRadians(var11)));
                     var4.method_18800(var12.field_1352, var6.field_1351, var12.field_1350);
                  }
               }

               k74.x.IIll.lIlIlI(var2, var4.method_36454());
            }
         }
      }
   }

   @Unique
   private boolean lIII(class_310 var1, class_304 var2) {
      IlIlIIII var3 = IlIlIIII.llI();
      return var3 == null ? this.lIl(var1, var2) : var3.lll(var1, var2);
   }
}
