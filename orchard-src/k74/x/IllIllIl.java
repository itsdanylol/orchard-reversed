package k74.x;

public final class IllIllIl {
   public static final double I = 3.0;
   public static final double l = 2.35;

   public static IlIIlIllI I(double var0, boolean var2, boolean var3, boolean var4) {
      return l(var0, var2, var3, var4, 2.35, 3.0, true);
   }

   public static IlIIlIllI l(double var0, boolean var2, boolean var3, boolean var4, double var5, double var7, boolean var9) {
      return II(var0, var2, var3, var4, var4, var5, var7, var7, var9);
   }

   public static IlIIlIllI II(double var0, boolean var2, boolean var3, boolean var4, boolean var5, double var6, double var8, double var10, boolean var12) {
      if (Double.isFinite(var0) && !(var0 < 0.0)) {
         double var13 = Double.isFinite(var6) && var6 >= 0.0 ? var6 : 2.35;
         double var15 = Double.isFinite(var8) && var8 >= 0.0 ? Math.max(var13, var8) : Math.max(var13, 3.0);
         double var17 = Double.isFinite(var10) && var10 >= 0.0 ? Math.max(var15, var10) : var15;
         if (var2) {
            return new IlIIlIllI(false, false, var12 && var3);
         } else {
            boolean var19 = var0 > var13;
            boolean var20 = var19 && var0 > var15 && var4;
            boolean var21 = var19 && var0 > var17 && var5;
            return new IlIIlIllI(var19, var20 || var21, var21 && var3);
         }
      } else {
         return IlIIlIllI.l;
      }
   }

   private IllIllIl() {
   }

   public static boolean Il(boolean var0, boolean var1, boolean var2) {
      return var0 && !var1 && !var2;
   }
}
