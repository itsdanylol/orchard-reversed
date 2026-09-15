package k74.x;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_12392;
import net.minecraft.class_1304;
import net.minecraft.class_1320;
import net.minecraft.class_1322;
import net.minecraft.class_1324;
import net.minecraft.class_1799;
import net.minecraft.class_2960;
import net.minecraft.class_5134;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_9334;
import net.minecraft.class_1322.class_1323;

@Environment(EnvType.CLIENT)
public final class lIIllIII {
   private static final float I = 0.85F;
   private static final double l = 5.0;
   private static final double II = 1.0E-6;
   private static final double Il = 20.0;

   public static double I(class_746 var0, class_1799 var1) {
      if (var0 != null && var1 != null && !var1.method_7960()) {
         class_1324 var2 = var0.method_5996(class_5134.field_23723);
         if (var2 == null) {
            return 0.0;
         } else {
            double var3 = IIl(var2.method_6201(), var2.method_6195(), IlI(var0.method_6047()), IlI(var1));
            return ((class_1320)class_5134.field_23723.comp_349()).method_6165(var3);
         }
      } else {
         return 0.0;
      }
   }

   static boolean l(float var0, float var1, double var2) {
      if (Float.isFinite(var0) && Float.isFinite(var1) && Double.isFinite(var2) && !(var1 <= 0.0F) && !(var2 <= 0.0)) {
         double var4 = Math.max(0.0, Math.min(1.0, (double)var0));
         double var6 = var4 * var1;
         return var6 + 1.0E-6 >= var2 * 0.85F;
      } else {
         return false;
      }
   }

   private static void II(Map<class_2960, class_1322> var0, Iterable<class_1322> var1) {
      if (var1 != null) {
         for (class_1322 var3 : var1) {
            if (var3 != null) {
               var0.remove(var3.comp_2447());
            }
         }
      }
   }

   static boolean Il(float var0, float var1, double var2, float var4) {
      if (Float.isFinite(var0) && Float.isFinite(var1) && Double.isFinite(var2) && Float.isFinite(var4) && !(var1 <= 0.0F) && !(var2 <= 0.0)) {
         double var5 = Math.max(0.0, Math.min(1.0, (double)var0));
         double var7 = var5 * var1;
         double var9 = Math.max(0.0, (double)var4);
         return var7 + 5.0 + 1.0E-6 >= var2 * var9;
      } else {
         return false;
      }
   }

   public static boolean lI(class_746 var0, class_1799 var1, float var2) {
      if (var0 != null && var1 != null && !var1.method_7960()) {
         if (var0.method_7357().method_7904(var1)) {
            return false;
         } else {
            double var3 = ll(I(var0, var1));
            return l(var0.method_7261(var2), var0.method_7279(), var3);
         }
      } else {
         return false;
      }
   }

   static double ll(double var0) {
      return Double.isFinite(var0) && var0 > 0.0 ? 20.0 / var0 : Double.POSITIVE_INFINITY;
   }

   private static void III(Map<class_2960, class_1322> var0, Iterable<class_1322> var1) {
      if (var1 != null) {
         for (class_1322 var3 : var1) {
            if (var3 != null) {
               var0.put(var3.comp_2447(), var3);
            }
         }
      }
   }

   static double IIl(double var0, Iterable<class_1322> var2, Iterable<class_1322> var3, Iterable<class_1322> var4) {
      LinkedHashMap var6 = new LinkedHashMap();
      String[] var10000 = IIllllIl.IIIIl();
      III(var6, var2);
      String[] var5 = var10000;
      II(var6, var3);
      III(var6, var4);
      double var7 = var0;

      for (class_1322 var10 : var6.values()) {
         if (var10.comp_2450() == class_1323.field_6328) {
            var7 += var10.comp_2449();
         }

         if (var5 != null) {
            break;
         }
      }

      double var13 = var7;

      for (class_1322 var12 : var6.values()) {
         if (var12.comp_2450() == class_1323.field_6330) {
            var13 += var7 * var12.comp_2449();
         }

         if (var5 != null) {
            break;
         }
      }

      for (class_1322 var15 : var6.values()) {
         if (var15.comp_2450() == class_1323.field_6331) {
            var13 *= 1.0 + var15.comp_2449();
         }

         if (var5 != null) {
            break;
         }
      }

      return var13;
   }

   private static List<class_1322> IlI(class_1799 var0) {
      if (var0 != null && !var0.method_7960()) {
         ArrayList var1 = new ArrayList();
         var0.method_57354(class_1304.field_6173, lIIllIII::Ill);
         return var1;
      } else {
         return List.of();
      }
   }

   private static void Ill(List var0, class_6880 var1, class_1322 var2) {
      if (var1.equals(class_5134.field_23723)) {
         var0.add(var2);
      }
   }

   private lIIllIII() {
   }

   public static boolean lII(class_746 var0, class_1799 var1, float var2) {
      if (var0 != null && var1 != null && !var1.method_7960()) {
         if (var0.method_7357().method_7904(var1)) {
            return false;
         } else {
            double var3 = ll(I(var0, var1));
            float var5 = (Float)var1.method_58695(class_9334.field_63635, 0.0F);
            return Il(var0.method_7261(var2), var0.method_7279(), var3, var5);
         }
      } else {
         return false;
      }
   }

   public static class_12392 lIl(class_746 var0, class_1799 var1) {
      if (var0 == null) {
         return null;
      } else {
         class_12392 var2 = class_12392.method_76734(var0);
         return var1 != null && !var1.method_7960() ? (class_12392)var1.method_58695(class_9334.field_64680, var2) : var2;
      }
   }
}
