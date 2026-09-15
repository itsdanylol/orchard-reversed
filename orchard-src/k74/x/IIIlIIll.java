package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_2350.class_2351;

@Environment(EnvType.CLIENT)
final class IIIlIIll {
   private static final double I = 0.65;
   static final double II = 0.1;
   private static final double Il = 0.42;
   private static final int[] l;
   private static final double lI = 0.05;
   private static final double ll = 1.15;
   private static final double III = 0.05;
   private static final int IIl = 5;
   private static final double IlI = 0.02;
   private static final double Ill = 0.15;
   private static final double lII = 0.025;
   private static final double lIl = 0.035;
   private static final double llI = 0.74;

   private static int lIl(int var0, int var1) {
      int var2 = l[var0 ^ -481385553] ^ var1 ^ var0;
      var2 -= 20303;
      var2 += 6502;
      var2 += 15505;
      var2 -= 57333;
      var2 += 19882;
      var2 -= 42819;
      var2 += 27561;
      var2 ^= 13688;
      return var2 + 42502;
   }

   static IIIIIl I(class_310 var0, class_746 var1) {
      if (var0 != null && var0.field_1690 != null && var1 != null) {
         float var2 = 0.0F;
         float var3 = 0.0F;
         if (var0.field_1690.field_1894.method_1434()) {
            var2++;
         }

         if (var0.field_1690.field_1881.method_1434()) {
            var2--;
         }

         if (var0.field_1690.field_1913.method_1434()) {
            var3++;
         }

         if (var0.field_1690.field_1849.method_1434()) {
            var3--;
         }

         return II(var1, var2, var3);
      } else {
         return null;
      }
   }

   private static boolean l(class_1937 var0, class_746 var1, double var2, double var4) {
      class_238 var6 = var1.method_5829().method_989(var2, var1.field_6017 - var1.method_49476(), var4).method_35580(0.05, 0.0, 0.05);
      return var0.method_8587(var1, var6);
   }

   static IIIIIl II(class_746 var0, float var1, float var2) {
      if (var0 == null) {
         return null;
      } else {
         double var3 = Math.sqrt(var1 * var1 + var2 * var2);
         if (var3 < 0.001) {
            float var16 = (float)Math.toRadians(var0.method_36454());
            double var17 = -Math.sin(var16);
            double var18 = Math.cos(var16);
            double var19 = Math.sqrt(var17 * var17 + var18 * var18);
            return var19 < 0.001 ? null : new IIIIIl(var17 / var19, var18 / var19);
         } else {
            if (var3 > 1.0) {
               var1 /= (float)var3;
               var2 /= (float)var3;
            }

            float var5 = (float)Math.toRadians(var0.method_36454());
            double var6 = Math.sin(var5);
            double var8 = Math.cos(var5);
            double var10 = -var6 * var1 - var8 * var2;
            double var12 = var8 * var1 - var6 * var2;
            double var14 = Math.sqrt(var10 * var10 + var12 * var12);
            return var14 < 0.001 ? null : new IIIIIl(var10 / var14, var12 / var14);
         }
      }
   }

   private IIIlIIll() {
   }

   static boolean Il(class_1937 var0, class_746 var1, double var2, double var4) {
      return var0 != null && var1 != null && !l(var0, var1, var2, var4);
   }

   private static boolean lI(class_1937 var0, double var1, double var3, double var5, double var7) {
      class_2338 var9 = class_2338.method_49637(var1, var3, var5);
      class_2680 var10 = var0.method_8320(var9);
      if (!var10.method_26215() && var10.method_26227().method_15769()) {
         class_265 var11 = var10.method_26220(var0, var9);
         if (var11.method_1110()) {
            return false;
         } else {
            double var12 = var9.method_10264() + var11.method_1105(class_2351.field_11052);
            return var12 >= var7 - 0.15;
         }
      } else {
         return false;
      }
   }

   static {
      int var2 = -1087875013;
      byte[] var0 = "\u0080È\u009dQL-)ï".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      l = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         l[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);
   }

   static IIIIlIIll ll(class_310 var0, class_746 var1, double var2) {
      if (var0 != null && var0.field_1690 != null && var0.field_1687 != null && var1 != null) {
         IIIIIl var4 = I(var0, var1);
         if (var4 == null) {
            return IIIIlIIll.Il();
         } else {
            double var5 = IIl(var1.method_18798().field_1352, var1.method_18798().field_1350, var4.l(), var4.I(), var2);
            IlIIlIIll var7 = IlI(var0.field_1687, var1, var4.l(), var4.I(), var5);
            boolean var8 = !l(var0.field_1687, var1, 0.0, 0.0);
            boolean var9 = l(var0.field_1687, var1, var4.l() * var5, var4.I() * var5);
            boolean var10 = var8 && var9;
            boolean var11 = var0.field_1690.field_1894.method_1434()
               || var0.field_1690.field_1881.method_1434()
               || var0.field_1690.field_1913.method_1434()
               || var0.field_1690.field_1849.method_1434();
            return new IIIIlIIll(var11, var10, var7.I(), var4.l(), var4.I(), var5);
         }
      } else {
         return IIIIlIIll.Il();
      }
   }

   static IIIIlIIll III(class_310 var0, class_746 var1) {
      return ll(var0, var1, 0.1);
   }

   static double IIl(double var0, double var2, double var4, double var6, double var8) {
      double var10 = Math.max(0.0, var0 * var4 + var2 * var6);
      double var12 = var10 * 1.15 + 0.035;
      return Math.min(0.42, Math.max(Math.max(0.025, var8), var12));
   }

   private static IlIIlIIll IlI(class_1937 var0, class_746 var1, double var2, double var4, double var6) {
      class_238 var9 = var1.method_5829();
      double var10 = var9.field_1322 - 0.05;
      double var12 = var9.field_1323 + 0.02;
      double var14 = var9.field_1320 - 0.02;
      String[] var10000 = IIllllIl.IIIIl();
      double var16 = var9.field_1321 + 0.02;
      double var18 = var9.field_1324 - 0.02;
      String[] var8 = var10000;
      double var20 = (var12 + var14) * 0.5;
      double var22 = (var16 + var18) * 0.5;
      double var24 = -var4;
      double var26 = var2;
      double var28 = 0.0;
      double var30 = 0.0;

      label69:
      for (double var35 : new double[]{var12, var14}) {
         double[] var37 = new double[]{var16, var18};
         int var38 = var37.length;
         int var39 = 0;

         while (true) {
            if (var39 < var38) {
               double var40 = var37[var39];
               double var42 = var35 - var20;
               double var44 = var40 - var22;
               var28 = Math.max(var28, var42 * var2 + var44 * var4);
               var30 = Math.max(var30, Math.abs(var42 * var24 + var44 * var26));
               var39++;
               if (var8 == null) {
                  continue;
               }
            }

            if (var8 != null) {
               break label69;
            }
            break;
         }
      }

      int var46 = 0;
      int var47 = lIl(-481385553, -1923533970 ^ 1375167235);
      int var48 = 0;

      label56:
      while (var48 < 5) {
         double var50 = lII(var12, var14, var48, 5);
         int var52 = 0;

         while (true) {
            if (var52 < 5) {
               double var55 = lII(var16, var18, var52, 5);
               if (lI(var0, var50, var10, var55, var9.field_1322)) {
                  var46++;
               }

               var52++;
               if (var8 == null) {
                  continue;
               }
            }

            var48++;
            if (var8 != null) {
               break label56;
            }
            break;
         }
      }

      var48 = 0;
      double var51 = var28 + var6;
      int var53 = 0;

      while (var53 < 5) {
         double var56 = lII(-var30, var30, var53, 5);
         double var57 = var20 + var2 * var51 + var24 * var56;
         double var58 = var22 + var4 * var51 + var26 * var56;
         if (lI(var0, var57, var10, var58, var9.field_1322)) {
            var48++;
         }

         var53++;
         if (var8 != null) {
            break;
         }
      }

      boolean var54 = lI(var0, var20, var10, var22, var9.field_1322);
      return new IlIIlIIll(var54, (double)var46 / var47, var48 / 5.0);
   }

   static double Ill(class_1937 var0, class_746 var1) {
      if (var0 != null && var1 != null) {
         class_238 var2 = var1.method_5829();
         double var3 = var2.field_1322 - 0.05;
         double var5 = var2.field_1323 + 0.02;
         double var7 = var2.field_1320 - 0.02;
         double var9 = var2.field_1321 + 0.02;
         double var11 = var2.field_1324 - 0.02;
         int var13 = 0;
         int var14 = lIl(-481385554, 958383032 ^ 693380970);

         for (int var15 = 0; var15 < 5; var15++) {
            double var16 = lII(var5, var7, var15, 5);

            for (int var18 = 0; var18 < 5; var18++) {
               double var19 = lII(var9, var11, var18, 5);
               if (lI(var0, var16, var3, var19, var2.field_1322)) {
                  var13++;
               }
            }
         }

         return (double)var13 / var14;
      } else {
         return 1.0;
      }
   }

   private static double lII(double var0, double var2, int var4, int var5) {
      return var5 <= 1 ? (var0 + var2) * 0.5 : var0 + (var2 - var0) * ((double)var4 / (var5 - 1));
   }
}
