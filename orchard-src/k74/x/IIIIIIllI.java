package k74.x;

import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11909;

@Environment(EnvType.CLIENT)
final class IIIIIIllI {
   private final List<IlIllll> I;
   private final List<IIIIIlIII> l = new ArrayList<>();

   void I(double var1, double var3, double var5, double var7, IllllIlI var9) {
      this.lI(var1, var3, var5, var7, var9, null);
   }

   IIIIIIllI() {
      this.I = new ArrayList<>();
   }

   void l(double var1, double var3, double var5, double var7) {
      if (!(var5 <= 0.0) && !(var7 <= 0.0)) {
         this.I.add(new IlIllll(var1, var3, var5, var7));
      } else {
         this.I.add(new IlIllll(0.0, 0.0, 0.0, 0.0));
      }
   }

   boolean II(class_11909 var1, boolean var2) {
      String[] var3 = IIllllIl.IIIIl();
      int var4 = this.l.size() - 1;

      while (var4 >= 0) {
         IIIIIlIII var5 = this.l.get(var4);
         if (var5.lI != null && var5.III(var1.comp_4798(), var1.comp_4799()) && var5.lI.I(var1, var2)) {
            return true;
         }

         var4--;
         if (var3 != null) {
            break;
         }
      }

      return false;
   }

   boolean Il(double var1, double var3, double var5, double var7) {
      String[] var9 = IIllllIl.IIIIl();
      int var10 = this.l.size() - 1;

      while (var10 >= 0) {
         IIIIIlIII var11 = this.l.get(var10);
         if (var11.II != null && var11.III(var1, var3) && var11.II.I(var1, var3, var5, var7)) {
            return true;
         }

         var10--;
         if (var9 != null) {
            break;
         }
      }

      return false;
   }

   void lI(double var1, double var3, double var5, double var7, IllllIlI var9, llllIIII var10) {
      String[] var11 = IIllllIl.IIIIl();
      if (!(var5 <= 0.0) && !(var7 <= 0.0)) {
         double var12 = var1;
         double var14 = var3;
         double var16 = var5;
         double var18 = var7;

         for (IlIllll var21 : this.I) {
            double var22 = Math.max(var12, var21.II);
            double var24 = Math.max(var14, var21.Il);
            double var26 = Math.min(var12 + var16, var21.II + var21.I);
            double var28 = Math.min(var14 + var18, var21.Il + var21.l);
            var12 = var22;
            var14 = var24;
            var16 = var26 - var22;
            var18 = var28 - var24;
            if (var16 <= 0.0 || var18 <= 0.0) {
               return;
            }

            if (var11 != null) {
               break;
            }
         }

         this.l.add(new IIIIIlIII(var12, var14, var16, var18, var9, var10));
         return;
      }
   }

   void ll() {
      if (!this.I.isEmpty()) {
         this.I.remove(this.I.size() - 1);
      }
   }

   void III() {
      this.l.clear();
   }
}
