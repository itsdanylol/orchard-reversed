package k74.x;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class IIIlIIlII {
   private static final double I = 5.0E-4;
   private long l;
   private final Map<String, IlIlIIll> II = new LinkedHashMap<>();
   private static final double Il = 210.0;
   private static final double lI = 0.05;
   private static final double ll = 28.0;
   private static final double III = 26.0;
   private static final double IIl = 0.008333333333333333;
   private lIllIIl IlI = lIllIIl.Il();
   private static final double Ill = 0.96;
   private static final double lII = 240.0;

   private static double I(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   private static double l(double var0, double var2, double var4, double var6) {
      if (!(var6 <= 0.0) && var0 != var2) {
         double var8 = var6 * 60.0;
         double var10 = 1.0 - Math.pow(1.0 - I(var4, 0.0, 1.0), var8);
         return var0 + (var2 - var0) * var10;
      } else {
         return var0;
      }
   }

   private static int II(IlIlIIll var0) {
      return var0.lI;
   }

   private static llIlll Il(double var0, double var2, double var4, double var6, double var8, double var10) {
      if (var6 <= 0.0) {
         return new llIlll(var0, var2);
      } else {
         int var12 = Math.max(1, (int)Math.ceil(var6 / 0.008333333333333333));
         double var13 = var6 / var12;
         double var15 = var0;
         double var17 = var2;

         for (int var19 = 0; var19 < var12; var19++) {
            double var20 = (var4 - var15) * var8 - var17 * var10;
            var17 += var20 * var13;
            var15 += var17 * var13;
         }

         return Math.abs(var4 - var15) < 5.0E-4 && Math.abs(var17) < 0.005 ? new llIlll(var4, 0.0) : new llIlll(var15, var17);
      }
   }

   private static double lI(double var0) {
      double var2 = 1.0 - I(var0, 0.0, 1.0);
      return 1.0 - var2 * var2 * var2;
   }

   public lIllIIl ll(List<IIl> var1, double var2, double var4, double var6, long var8) {
      double var11 = lIl(var2);
      double var13 = lIl(var4);
      double var15 = I(var6, 0.0, 1.0);
      String[] var10000 = IIllllIl.IIIIl();
      double var17 = this.Ill(var8);
      String[] var10 = var10000;

      for (IlIlIIll var20 : this.II.values()) {
         var20.I = false;
         if (var10 != null) {
            break;
         }
      }

      LinkedHashMap var39 = new LinkedHashMap();
      if (var1 != null) {
         for (IIl var21 : var1) {
            if (var21 != null && var21.I() != null && !var21.I().isBlank()) {
               var39.putIfAbsent(var21.I(), var21);
            }

            if (var10 != null) {
               break;
            }
         }
      }

      HashSet var41 = new HashSet();
      ArrayList var42 = new ArrayList(var39.size());
      int var22 = 0;

      for (IIl var24 : var39.values()) {
         double var25 = lIl(var24.l());
         IlIlIIll var27 = this.II.get(var24.I());
         if (var27 == null) {
            var27 = new IlIlIIll(var24.I(), var25, var22);
            this.II.put(var24.I(), var27);
            var41.add(var24.I());
         }

         var27.I = true;
         var27.Il = var25;
         var42.add(var24.I());
         var22++;
         if (var10 != null) {
            break;
         }
      }

      for (IlIlIIll var45 : this.II.values()) {
         if (!var41.contains(var45.Ill)) {
            var45.l = l(var45.l, var45.I ? 1.0 : 0.0, var15, var17);
            llIlll var47 = Il(var45.IIl, var45.III, var45.Il, var17, 240.0, 28.0);
            var45.IIl = var47.l();
            var45.III = var47.I();
         }

         if (var10 != null) {
            break;
         }
      }

      this.II.values().removeIf(IIIlIIlII::III);
      List var44 = this.II.values().stream().filter(IIIlIIlII::lII).sorted(Comparator.comparingInt(IIIlIIlII::II)).toList();
      ArrayList var46 = new ArrayList(var42);

      for (IlIlIIll var26 : var44) {
         int var51 = Math.max(0, Math.min(var26.lI, var46.size()));
         var46.add(var51, var26.Ill);
         if (var10 != null) {
            break;
         }
      }

      ArrayList var49 = new ArrayList(var46.size());
      double var50 = 0.0;
      double var28 = 0.0;
      double var30 = 0.0;
      int var32 = 0;

      while (var32 < var46.size()) {
         IlIlIIll var33 = this.II.get(var46.get(var32));
         if (var33 != null) {
            double var34;
            label75: {
               var33.lI = var32;
               var34 = lI(var33.l);
               if (!var33.ll) {
                  var33.IlI = var50;
                  var33.ll = true;
                  if (var10 == null) {
                     break label75;
                  }
               }

               llIlll var38 = Il(var33.IlI, var33.II, var50, var17, 210.0, 26.0);
               var33.IlI = var38.l();
               var33.II = var38.I();
            }

            var49.add(new IlIlIlIl(var33.Ill, var33.I, var33.l, var34, var33.IlI, var33.IIl, var33.Il, var33.lI));
            var28 = Math.max(var28, var33.Il);
            var50 += (var11 + var13) * var34;
            var30 = var13 * var34;
         }

         var32++;
         if (var10 != null) {
            break;
         }
      }

      double var52 = Math.max(0.0, var50 - var30);
      this.IlI = new lIllIIl(List.copyOf(var49), var28, var52);
      return this.IlI;
   }

   private static boolean III(IlIlIIll var0) {
      return !var0.I && var0.l <= 5.0E-4;
   }

   public IIIlIIlII() {
      this.l = Long.MIN_VALUE;
   }

   public void IIl() {
      this.II.clear();
      this.IlI = lIllIIl.Il();
      this.l = Long.MIN_VALUE;
   }

   public lIllIIl IlI() {
      return this.IlI;
   }

   private double Ill(long var1) {
      if (this.l == Long.MIN_VALUE) {
         this.l = var1;
         return 0.0;
      } else if (var1 <= this.l) {
         return 0.0;
      } else {
         double var3 = (var1 - this.l) / 1.0E9;
         this.l = var1;
         return Math.min(0.05, Math.max(0.0, var3));
      }
   }

   private static boolean lII(IlIlIIll var0) {
      return !var0.I;
   }

   private static double lIl(double var0) {
      return Double.isFinite(var0) ? Math.max(0.0, var0) : 0.0;
   }
}
