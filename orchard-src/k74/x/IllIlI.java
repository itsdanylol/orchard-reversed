package k74.x;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class IllIlI<K> {
   private static final long I = 175L;
   private static final double l = 80.0;
   private static final double II = 90.0;
   private final Map<K, lIlIlIlI> Il = new HashMap<>();
   private static final double lI = 72.0;

   public void I(Set<K> var1) {
      if (var1 != null && !var1.isEmpty()) {
         this.Il.keySet().removeIf(IllIlI::ll);
      } else {
         this.Il.clear();
      }
   }

   public void l() {
      this.Il.clear();
   }

   public llIIIIll II(K var1, llIIIIll var2, double var3) {
      if (var1 != null && var2 != null) {
         double var5 = var2.Il();
         double var7 = var2.ll();
         if (Double.isFinite(var2.II()) && Double.isFinite(var2.lI()) && Double.isFinite(var5) && Double.isFinite(var7)) {
            long var9 = System.currentTimeMillis();
            lIlIlIlI var11 = this.Il.get(var1);
            if (var11 != null && !this.Il(var11, var2, var3, var9)) {
               double var12 = var2.II() - var11.Il;
               double var14 = var2.lI() - var11.ll;
               double var16 = var5 - var11.lI;
               double var18 = var7 - var11.I;
               double var20 = class_3532.method_15350(0.46 + Math.hypot(var12, var14) / 60.0, 0.46, 0.84);
               double var22 = var11.Il + var12 * var20;
               double var24 = var11.ll + var14 * var20;
               double var26 = var11.lI + var16 * var20;
               double var28 = var11.I + var18 * var20;
               this.Il.put((K)var1, new lIlIlIlI(var22, var24, var26, var28, var3, var9));
               return new llIIIIll(var22, var24, var22 + Math.max(1.0, var26), var24 + Math.max(1.0, var28));
            } else {
               this.Il.put((K)var1, new lIlIlIlI(var2.II(), var2.lI(), var5, var7, var3, var9));
               return var2;
            }
         } else {
            return var2;
         }
      } else {
         return var2;
      }
   }

   private boolean Il(lIlIlIlI var1, llIIIIll var2, double var3, long var5) {
      double var7 = var2.II() - var1.Il;
      double var9 = var2.lI() - var1.ll;
      return !Double.isFinite(var1.lI)
         || !Double.isFinite(var1.I)
         || var7 * var7 + var9 * var9 > 8100.0
         || Math.abs(var2.Il() - var1.lI) > 80.0
         || Math.abs(var2.ll() - var1.I) > 80.0
         || var5 - var1.II > 175L
         || lI(var1.l, var3) > 1.8;
   }

   private static double lI(double var0, double var2) {
      return Double.isFinite(var0) && Double.isFinite(var2) && !(var0 <= 0.0) && !(var2 <= 0.0)
         ? Math.max(var0, var2) / Math.max(1.0, Math.min(var0, var2))
         : 1.0;
   }

   private static boolean ll(Set var0, Object var1) {
      return !var0.contains(var1);
   }

   private boolean III(lIlIlIlI var1, double var2, double var4, double var6, long var8) {
      double var10 = var2 - var1.Il;
      double var12 = var4 - var1.ll;
      return var10 * var10 + var12 * var12 > 5184.0 || var8 - var1.II > 175L || lI(var1.l, var6) > 1.8;
   }

   public lIllIIll IIl(K var1, double var2, double var4, double var6) {
      if (var1 != null && Double.isFinite(var2) && Double.isFinite(var4)) {
         long var8 = System.currentTimeMillis();
         lIlIlIlI var10 = this.Il.get(var1);
         if (var10 != null && !this.III(var10, var2, var4, var6, var8)) {
            double var11 = var2 - var10.Il;
            double var13 = var4 - var10.ll;
            double var15 = class_3532.method_15350(0.42 + Math.hypot(var11, var13) / 55.0, 0.42, 0.82);
            double var17 = var10.Il + var11 * var15;
            double var19 = var10.ll + var13 * var15;
            this.Il.put((K)var1, new lIlIlIlI(var17, var19, Double.NaN, Double.NaN, var6, var8));
            return new lIllIIll(var17, var19, var6);
         } else {
            this.Il.put((K)var1, new lIlIlIlI(var2, var4, Double.NaN, Double.NaN, var6, var8));
            return new lIllIIll(var2, var4, var6);
         }
      } else {
         return new lIllIIll(var2, var4, var6);
      }
   }
}
