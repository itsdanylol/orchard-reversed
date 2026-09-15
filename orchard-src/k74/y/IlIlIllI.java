package k74.y;

import k74.x.IIIIIllII;
import k74.x.IlIIIl;
import k74.x.lIIlllI;
import k74.x.lIlI;
import k74.x.llllllll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class IlIlIllI {
   @Unique
   private llllllll I = llllllll.Il;
   @Unique
   private int l;
   @Unique
   private static final int II = 3;
   @Unique
   private float Il;
   @Unique
   private static final int lI = 1;
   @Unique
   private static final int ll = 2;
   @Unique
   private static final int III = 0;
   @Unique
   private float IIl;

   @Inject(
      method = {"method_5872"},
      at = {@At("TAIL")}
   )
   private void I(double var1, double var3, CallbackInfo var5) {
      if (this.l != 0) {
         class_1297 var6 = (class_1297)this;
         class_310 var7 = class_310.method_1551();
         IIIIIllII var8 = IIIIIllII.III();

         try {
            if (var6 != var7.field_1724) {
               return;
            }

            float var9 = var6.method_36454();
            float var10 = var6.method_36455();
            if (var8 != null && this.l == 1) {
               lIlI var15 = var8.II().IIlllll();
               if (var15 != null) {
                  var15.llI(this.IIl, this.Il, var9, var10);
               }
            } else if (var8 != null && this.l == 2) {
               IlIIIl var11 = var8.II().IlIlIll();
               if (var11 != null) {
                  var11.IlIIIl(this.IIl, this.Il, var9, var10);
               }
            } else if (this.l == 3) {
               lIIlllI.III(this.I, this.IIl, this.Il, var9, var10);
            }
         } finally {
            if (var6 == var7.field_1724) {
               var6.method_36456(this.IIl);
               var6.method_36457(this.Il);
            }

            this.l = 0;
            this.I = llllllll.Il;
         }
      }
   }

   @Inject(
      method = {"method_5872"},
      at = {@At("HEAD")}
   )
   private void l(double var1, double var3, CallbackInfo var5) {
      this.l = 0;
      this.I = llllllll.Il;
      IIIIIllII var6 = IIIIIllII.III();
      class_1297 var7 = (class_1297)this;
      class_310 var8 = class_310.method_1551();
      if (var6 != null && var7 == var8.field_1724) {
         lIlI var9 = var6.II().IIlllll();
         IlIIIl var10 = var6.II().IlIlIll();
         llllllll var11 = lIIlllI.I();
         if (var9 != null && var9.IIIIlIl()) {
            this.l = 1;
         } else if (var10 != null && var10.lllI()) {
            this.l = 2;
         } else {
            if (var11 == llllllll.Il) {
               return;
            }

            this.l = 3;
            this.I = var11;
         }

         this.IIl = var7.method_36454();
         this.Il = var7.method_36455();
      }
   }
}
