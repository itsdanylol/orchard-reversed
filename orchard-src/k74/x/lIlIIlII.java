package k74.x;

import java.util.function.BooleanSupplier;

public final class lIlIIlII {
   public static final float I = 0.12F;
   public static final double l = 0.25;
   private static final int[] Il = new int[1];
   public static final double II = 0.02;

   public static double I(double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16) {
      double var18 = Math.max(var6 - var0, Math.max(0.0, var0 - var12));
      double var20 = Math.max(var8 - var2, Math.max(0.0, var2 - var14));
      double var22 = Math.max(var10 - var4, Math.max(0.0, var4 - var16));
      return var18 * var18 + var20 * var20 + var22 * var22;
   }

   public static float l(double var0, boolean var2) {
      float var3 = (float)IIII(var0 / 100.0, 0.0, 1.0);
      return var2 ? Math.min(var3, 0.12F) : var3;
   }

   public static double II(double var0, double var2, double var4) {
      return Double.isFinite(var0) && Double.isFinite(var2) && Double.isFinite(var4) && !(var2 <= 1.0E-4) && !(var4 <= 0.0)
         ? IIII(var0 / var2, 0.0, Math.min(0.25, var4))
         : 0.0;
   }

   public static boolean Il(boolean var0, boolean var1) {
      return var0 && !var1;
   }

   private lIlIIlII() {
   }

   public static double lI(double var0, int var2, int var3, double var4, double var6) {
      double var8 = Math.max(0.0, var0);
      double var10 = 5.0 + lII(var8) + var8 * 0.5 * Math.max(0, var3);
      double var12 = Math.max(0.0, var4);
      double var14 = 2.0 + Math.max(0.0, var6) / 4.0;
      double var16 = IIII(var12 - var10 / var14, var12 * 0.2, 20.0) / 25.0;
      var16 = IIII(var16 - 0.15 * Math.max(0, var2), 0.0, 1.0);
      return var10 * (1.0 - var16);
   }

   private static double ll(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24
   ) {
      return I(var2 - var8 * var0, var4 - var10 * var0, var6 - var12 * var0, var14, var16, var18, var20, var22, var24);
   }

   public static double III(double var0) {
      return Math.max(0.0, var0 - 0.02);
   }

   public static double IIl(double var0, double var2) {
      double var4 = Math.max(0.0, var0);
      if (var2 > 0.0) {
         return 0.0;
      } else {
         return var2 > -0.5 && var4 > 1.0 ? 1.0 : var4;
      }
   }

   public static boolean IlI(double var0, double var2) {
      return var0 > Math.max(0.0, var2);
   }

   public static boolean Ill(IllIIllI var0, IllIIllI var1, double var2) {
      if (var0 == null) {
         return false;
      } else if (var1 == null) {
         return true;
      } else {
         int var4 = var0.II().compareTo(var1.II());
         if (var4 != 0) {
            return var4 > 0;
         } else if (var0.lI() != var1.lI()) {
            return var0.lI();
         } else {
            double var5 = Math.max(0.0, var2);
            return var0.I() + var5 < var1.I();
         }
      }
   }

   public static double lII(double var0) {
      double var2 = Math.max(0.0, var0);
      if (var2 <= 3.0) {
         return 4.0 * var2;
      } else {
         return var2 <= 8.0 ? 12.0 + 2.0 * (var2 - 3.0) : 22.0 + (var2 - 8.0);
      }
   }

   public static boolean lIl(IllIIllI var0, IllIIllI var1) {
      if (var0 == null) {
         return false;
      } else if (var1 == null) {
         return true;
      } else {
         int var2 = var0.II().compareTo(var1.II());
         if (var2 != 0) {
            return var2 > 0;
         } else if (var0.lI() != var1.lI()) {
            return var0.lI();
         } else {
            int var3 = Double.compare(var0.I(), var1.I());
            if (var3 != 0) {
               return var3 < 0;
            } else {
               int var4 = Double.compare(var0.ll(), var1.ll());
               if (var4 != 0) {
                  return var4 < 0;
               } else {
                  int var5 = Double.compare(var0.Il(), var1.Il());
                  return var5 != 0 ? var5 < 0 : var0.l() < var1.l();
               }
            }
         }
      }
   }

   public static boolean llI(boolean var0, BooleanSupplier var1) {
      return var0 ? true : var1 != null && var1.getAsBoolean();
   }

   private static int IIll(int var0, int var1) {
      int var2 = Il[var0 ^ 1494317355] ^ var1 ^ var0;
      var2 += 55481;
      var2 += 47067;
      var2 += 56992;
      var2 += 764;
      var2 ^= 6621;
      var2 += 40914;
      var2 ^= 51114;
      return var2 + 45433;
   }

   public static boolean lll(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22,
      double var24
   ) {
      double var27 = Math.max(0.0, var24);
      double var29 = var27 * var27;
      String[] var10000 = IIllllIl.IIIIl();
      double var31 = 0.0;
      String[] var26 = var10000;
      double var33 = 1.0;
      int var35 = 0;

      while (var35 < IIll(1494317355, 862280290 ^ 62518751)) {
         label26: {
            double var36 = (var31 * 2.0 + var33) / 3.0;
            double var38 = (var31 + var33 * 2.0) / 3.0;
            double var40 = ll(var36, var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22);
            double var42 = ll(var38, var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22);
            if (var40 <= var42) {
               var33 = var38;
               if (var26 == null) {
                  break label26;
               }
            }

            var31 = var36;
         }

         var35++;
         if (var26 != null) {
            break;
         }
      }

      double var44 = (var31 + var33) * 0.5;
      return Math.min(
            ll(0.0, var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22),
            Math.min(
               ll(var44, var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22),
               ll(1.0, var0, var2, var4, var6, var8, var10, var12, var14, var16, var18, var20, var22)
            )
         )
         <= var29;
   }

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "Qm\u008f\u0081".getBytes("ISO-8859-1");

      int var14;
      do {
         Il[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -950261843;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);
   }

   private static double IIII(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static double IIIl(double var0, double var2, double var4) {
      double var6 = Math.min(var0, var2);
      double var8 = Math.max(var0, var2);
      return var6 + (var8 - var6) * IIII(var4, 0.0, 1.0);
   }

   public static lIlIIIlI IIlI(boolean var0, boolean var1, boolean var2) {
      if (!var0) {
         return lIlIIIlI.l;
      } else if (var1) {
         return lIlIIIlI.III;
      } else {
         return var2 ? lIlIIIlI.lI : lIlIIIlI.I;
      }
   }
}
