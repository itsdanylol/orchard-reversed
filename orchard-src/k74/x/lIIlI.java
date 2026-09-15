package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class lIIlI {
   private static double I;
   private static double l;
   private static boolean II;
   private static final long Il = 250L;
   private static double lI;
   private static boolean ll;
   private static long III;
   private static double IIl;

   public static void I() {
      ll = false;
      if (II) {
         III = System.currentTimeMillis();
      }
   }

   private lIIlI() {
   }

   public static void l() {
      ll = true;
      II = false;
      l = Double.POSITIVE_INFINITY;
      IIl = Double.POSITIVE_INFINITY;
      I = Double.NEGATIVE_INFINITY;
      lI = Double.NEGATIVE_INFINITY;
   }

   private static boolean II(class_310 var0) {
      if (II && var0 != null && var0.field_1690 != null && var0.field_1690.field_1907 != null) {
         return System.currentTimeMillis() - III > 250L ? false : var0.field_1690.field_1907.method_1434() || IIll.IlIllll(var0, var0.field_1690.field_1907);
      } else {
         return false;
      }
   }

   public static boolean Il(class_310 var0, IIIIIlII var1) {
      if (II(var0) && var1 != null) {
         double var2 = 2.0;
         double var4 = var1.lll();
         double var6 = var1.ll();
         double var8 = var4 + var1.IIllI();
         double var10 = var6 + var1.IIIl();
         return var8 > l - var2 && var4 < I + var2 && var10 > IIl - var2 && var6 < lI + var2;
      } else {
         return false;
      }
   }

   public static void lI(int var0, int var1, int var2, int var3) {
      if (ll) {
         int var4 = Math.min(var0, var2);
         int var5 = Math.max(var0, var2);
         int var6 = Math.min(var1, var3);
         int var7 = Math.max(var1, var3);
         if (var5 > var4 && var7 > var6) {
            l = Math.min(l, (double)var4);
            IIl = Math.min(IIl, (double)var6);
            I = Math.max(I, (double)var5);
            lI = Math.max(lI, (double)var7);
            II = true;
         }
      }
   }
}
