package k74.x;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import java.awt.Color;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;
import net.minecraft.class_10799;
import net.minecraft.class_12245;
import net.minecraft.class_12246;
import net.minecraft.class_12247;
import net.minecraft.class_12249;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_7833;
import net.minecraft.class_327.class_6415;
import net.minecraft.class_4597.class_4598;
import org.joml.Matrix4f;
import org.joml.Vector4f;

@Environment(EnvType.CLIENT)
public final class IlIII {
   private static final Method I;
   private static final int[] llll;
   private static final Vector4f II;
   private static final Method Il;
   private static final Object lI;
   private static final Object ll;
   private static final Method III;
   private static final Method IIl;
   private static String[] l;
   private static final Method IlI;
   private static final String[] Ill;
   private static final Object[] IIIIl;
   private static final Object lII;
   private static final Method lIl;
   private static final Method llI;
   private static final Method lll;
   private static final String[] IIII;
   private static final Method IIIl;
   private static final Method IIlI;
   private static float IIll;
   private static final class_1921 IlII;
   private static final class_1921 IlIl;
   private static final String[] IIIII;
   private static final class_1921 IllI;
   private static final Object Illl;
   private static final class_1921 lIII;
   private static final Matrix4f lIIl;
   private static final Method lIlI;
   private static final Method lIll;
   private static final int llII = 15728880;
   private static final Method llIl;
   private static final Method lllI;

   private static void I(class_4588 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, Color var7, double var8) {
      float var10 = var7.getRed() / 255.0F;
      float var11 = var7.getGreen() / 255.0F;
      float var12 = var7.getBlue() / 255.0F;
      float var13 = Il(var8) / 255.0F;
      var0.method_22918(var1, var2, var3, var4).method_22915(var10, var11, var12, var13);
      var0.method_22918(var1, var2, var3, var6).method_22915(var10, var11, var12, var13);
      var0.method_22918(var1, var5, var3, var6).method_22915(var10, var11, var12, var13);
      var0.method_22918(var1, var5, var3, var4).method_22915(var10, var11, var12, var13);
   }

   public static void l(lIIlIl var0, String var1, class_243 var2, Color var3, double var4, boolean var6) {
      String[] var7 = IIllllIl.IIIIl();
      if (IIIIII(var0)) {
         class_310 var8 = class_310.method_1551();
         class_327 var9 = var8.field_1772;
         class_4597 var10 = lIl(var0);
         if (var9 != null && var10 != null) {
            label41: {
               class_243 var11 = Illll(var0);
               class_4184 var12 = var8.field_1773.method_19418();
               var0.I().method_22903();
               var0.I().method_22904(var2.field_1352 - var11.field_1352, var2.field_1351 - var11.field_1351, var2.field_1350 - var11.field_1350);
               var0.I().method_22907(class_7833.field_40716.rotationDegrees(-var12.method_19330()));
               var0.I().method_22907(class_7833.field_40714.rotationDegrees(var12.method_19329()));
               float var13 = (float)(0.025 * var4);
               var0.I().method_22905(-var13, -var13, var13);
               Matrix4f var14 = var0.I().method_23760().method_23761();
               float var15 = -var9.method_1727(var1) / 2.0F;
               float var16 = -IlIlII(763350010, 1234363234 ^ -1930871149) / 2.0F;
               int var17 = IIIlI(var3, var3.getAlpha());
               if (IIIlIIII.lllI() && (var17 & IlIlII(763350011, 1234363234 ^ 1493310639)) != 0) {
                  float var18 = var15;
                  int var19 = 0;
                  int var20 = 0;

                  while (var20 < var1.length()) {
                     int var21 = var1.codePointAt(var20);
                     String var22 = new String(Character.toChars(var21));
                     if (!Character.isWhitespace(var21)) {
                        int var23 = IlIIlllIl.lIIIl(var3.getAlpha(), Math.round(var15), Math.round(var16), var19);
                        var9.method_27521(var22, var18, var16, var23, var6, var14, var10, class_6415.field_33993, 0, IlIlII(763350008, 1234363234 ^ 216788871));
                     }

                     var18 += var9.method_1727(var22);
                     var20 += Character.charCount(var21);
                     var19++;
                     if (var7 != null) {
                        break;
                     }
                  }

                  if (var7 == null) {
                     break label41;
                  }
               }

               var9.method_27521(var1, var15, var16, var17, var6, var14, var10, class_6415.field_33993, 0, IlIlII(763350009, 1234363234 ^ 901990231));
            }

            var0.I().method_22909();
         }
      }
   }

   private static class_243[] II(class_243 var0, float var1, float var2, float var3) {
      double var4 = Math.toRadians(var3);
      double var6 = Math.cos(var4);
      double var8 = Math.sin(var4);
      double var10 = var0.field_1351 - var2 / 2.0;
      double var12 = var0.field_1351 + var2 / 2.0;
      double[][] var14 = new double[][]{{-var1, -var1}, {var1, -var1}, {var1, var1}, {-var1, var1}};
      class_243[] var15 = new class_243[IlIlII(763350014, 2133551799 ^ 703376124)];

      for (int var16 = 0; var16 < var14.length; var16++) {
         double var17 = var14[var16][0];
         double var19 = var14[var16][1];
         double var21 = var17 * var6 - var19 * var8;
         double var23 = var17 * var8 + var19 * var6;
         var15[var16] = new class_243(var0.field_1352 + var21, var10, var0.field_1350 + var23);
         var15[var16 + 4] = new class_243(var0.field_1352 + var21, var12, var0.field_1350 + var23);
      }

      return var15;
   }

   private static int Il(double var0) {
      return Math.max(0, Math.min(IlIlII(763350015, 1461970867 ^ -585577544), (int)Math.round(var0)));
   }

   private static float lI(float var0, float var1, float var2) {
      if (var2 <= 0.0F) {
         return 0.0F;
      } else {
         if (var0 < var2) {
            float var3 = var2 - var0;
            if (var3 > 0.0F && var3 < var2) {
               return (float)(var2 - Math.sqrt(var2 * var2 - var3 * var3));
            }
         } else if (var0 > var1 - var2) {
            float var4 = var0 - (var1 - var2);
            if (var4 > 0.0F && var4 < var2) {
               return (float)(var2 - Math.sqrt(var2 * var2 - var4 * var4));
            }
         }

         return 0.0F;
      }
   }

   private static void ll(class_4587 var0, class_4597 var1, class_238 var2, Color var3, double var4, float var6, class_1921 var7) {
      if (var0 != null && var1 != null && var2 != null && var3 != null && var7 != null) {
         class_4184 var8 = class_310.method_1551().field_1773.method_19418();
         class_243 var9 = var8.method_71156();
         float var10 = (float)(var2.field_1323 - var9.field_1352);
         float var11 = (float)(var2.field_1322 - var9.field_1351);
         float var12 = (float)(var2.field_1321 - var9.field_1350);
         float var13 = (float)(var2.field_1320 - var9.field_1352);
         float var14 = (float)(var2.field_1325 - var9.field_1351);
         float var15 = (float)(var2.field_1324 - var9.field_1350);
         float var16 = var3.getRed() / 255.0F;
         float var17 = var3.getGreen() / 255.0F;
         float var18 = var3.getBlue() / 255.0F;
         float var19 = Il(var4) / 255.0F;
         Matrix4f var20 = var0.method_23760().method_23761();
         class_4588 var21 = var1.method_73477(var7);
         var21.method_22918(var20, var10, var11, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 1.0F, 0.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var11, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 1.0F, 0.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var11, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 1.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var14, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 1.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var14, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), -1.0F, 0.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var10, var14, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), -1.0F, 0.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var10, var14, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, -1.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var10, var11, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, -1.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var10, var11, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 1.0F, 0.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var11, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 1.0F, 0.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var11, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 1.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var14, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 1.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var14, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), -1.0F, 0.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var10, var14, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), -1.0F, 0.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var10, var14, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, -1.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var10, var11, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, -1.0F, 0.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var10, var11, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var10, var11, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var11, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var11, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var14, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var13, var14, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var10, var14, var12)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
            .method_75298(llII(var6));
         var21.method_22918(var20, var10, var14, var15)
            .method_22915(var16, var17, var18, var19)
            .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
            .method_75298(llII(var6));
      }
   }

   private static void III(lIIlIl var0, class_243 var1, class_243 var2, Color var3, double var4) {
      IIIIl(var0, var1, var2, var3, var4);
   }

   private static String IlIlIl(int var0, char var1, short var2) {
      int var3 = var1 ^ 13060;
      char[] var4 = IIIII[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIIIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIIIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 25357;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 4524;
         var10 ^= 16088;
         var10 ^= 13080;
         var10 += 19786;
         var10 ^= 22867;
         var10 -= 64653;
         var10 -= 59517;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static void IIl(lIIlIl var0, class_2960 var1, class_243 var2, double var3, double var5, Color var7) {
      if (IIIIII(var0) && var1 != null && !(var3 <= 0.0) && !(var5 <= 0.0)) {
         class_310 var8 = class_310.method_1551();
         class_4597 var9 = lIl(var0);
         if (var9 != null) {
            class_243 var10 = Illll(var0);
            class_4184 var11 = var8.field_1773.method_19418();
            class_4588 var12 = var9.method_73477(class_12249.method_75990(var1));
            float var13 = (float)(var3 / 2.0);
            float var14 = (float)(var5 / 2.0);
            Color var15 = var7 == null ? Color.WHITE : var7;
            int var16 = var15.getAlpha();
            var0.I().method_22903();
            var0.I().method_22904(var2.field_1352 - var10.field_1352, var2.field_1351 - var10.field_1351, var2.field_1350 - var10.field_1350);
            var0.I().method_22907(class_7833.field_40716.rotationDegrees(-var11.method_19330()));
            var0.I().method_22907(class_7833.field_40714.rotationDegrees(var11.method_19329()));
            Matrix4f var17 = var0.I().method_23760().method_23761();
            var12.method_22918(var17, -var13, -var14, 0.0F)
               .method_1336(var15.getRed(), var15.getGreen(), var15.getBlue(), var16)
               .method_22913(0.0F, 1.0F)
               .method_22922(class_4608.field_21444)
               .method_60803(IlIlII(763350012, -915178515 ^ 1171844538))
               .method_22914(0.0F, 0.0F, 1.0F);
            var12.method_22918(var17, var13, -var14, 0.0F)
               .method_1336(var15.getRed(), var15.getGreen(), var15.getBlue(), var16)
               .method_22913(1.0F, 1.0F)
               .method_22922(class_4608.field_21444)
               .method_60803(IlIlII(763350013, -915178515 ^ -1320391950))
               .method_22914(0.0F, 0.0F, 1.0F);
            var12.method_22918(var17, var13, var14, 0.0F)
               .method_1336(var15.getRed(), var15.getGreen(), var15.getBlue(), var16)
               .method_22913(1.0F, 0.0F)
               .method_22922(class_4608.field_21444)
               .method_60803(IlIlII(763350002, -915178515 ^ -278248076))
               .method_22914(0.0F, 0.0F, 1.0F);
            var12.method_22918(var17, -var13, var14, 0.0F)
               .method_1336(var15.getRed(), var15.getGreen(), var15.getBlue(), var16)
               .method_22913(0.0F, 0.0F)
               .method_22922(class_4608.field_21444)
               .method_60803(IlIlII(763350003, -915178515 ^ 1442488647))
               .method_22914(0.0F, 0.0F, 1.0F);
            var0.I().method_22909();
         }
      }
   }

   private static void IlI(float var0) {
      try {
         IIll = llII(var0);
         if (lllI == null) {
            return;
         }
      } catch (ReflectiveOperationException var3) {
         throw IIII(var3);
      }

      try {
         lllI.invoke(null, IIll);
      } catch (ReflectiveOperationException var2) {
      }
   }

   private static float Ill(float var0, float var1, float var2) {
      return Math.min(Math.min(var0, var1) / 2.0F, Math.max(0.0F, var2));
   }

   private static float lII(float var0, float var1, float var2, float var3) {
      if (var3 <= 0.0F) {
         return var2;
      } else {
         if (var0 < var3) {
            float var4 = var3 - var0;
            if (var4 > 0.0F && var4 < var3) {
               return (float)(var2 - var3 + Math.sqrt(var3 * var3 - var4 * var4));
            }
         } else if (var0 > var1 - var3) {
            float var5 = var0 - (var1 - var3);
            if (var5 > 0.0F && var5 < var3) {
               return (float)(var2 - var3 + Math.sqrt(var3 * var3 - var5 * var5));
            }
         }

         return var2;
      }
   }

   public static class_4597 lIl(Object var0) {
      if (var0 instanceof lIIlIl var2) {
         return (class_4597)(var2.llI() != null ? var2.llI() : class_310.method_1551().method_22940().method_23000());
      } else if (var0 instanceof WorldRenderContext var1) {
         return (class_4597)(var1.consumers() != null ? var1.consumers() : class_310.method_1551().method_22940().method_23000());
      } else {
         return class_310.method_1551().method_22940().method_23000();
      }
   }

   private static void llI(class_4587 var0, class_4597 var1, class_243 var2, float var3, float var4, float var5, Color var6, double var7) {
      int var14 = 1573761432;
      if (var0 != null && var1 != null && var2 != null) {
         class_243[] var9 = II(var2, var3, var4, var5);
         Matrix4f var10 = var0.method_23760().method_23761();
         class_4588 var11 = var1.method_73477(class_12249.method_76023());
         class_243 var12 = class_310.method_1551().field_1773.method_19418().method_71156();
         IIlI(var11, var10, var12, var9[0], var9[1], var9[2], var9[3], var6, var7);
         IIlI(var11, var10, var12, var9[4], var9[5], var9[IlIlII(763350000, var14 ^ -1413823931)], var9[IlIlII(763350001, var14 ^ 70982668)], var6, var7);
         IIlI(var11, var10, var12, var9[0], var9[1], var9[5], var9[4], var6, var7);
         IIlI(var11, var10, var12, var9[1], var9[2], var9[IlIlII(763350006, var14 ^ -379176734)], var9[5], var6, var7);
         IIlI(var11, var10, var12, var9[2], var9[3], var9[IlIlII(763350007, var14 ^ 1986016289)], var9[IlIlII(763350004, var14 ^ -723771232)], var6, var7);
         IIlI(var11, var10, var12, var9[3], var9[0], var9[4], var9[IlIlII(763350005, var14 ^ 1520194542)], var6, var7);
         if (var1 instanceof class_4598 var13) {
            var13.method_22993();
         }
      }
   }

   public static boolean lll(Object var0, class_238 var1) {
      if (var1 == null) {
         return false;
      } else {
         return !(var0 instanceof lIIlIl var2) ? true : var2.lI() == null || var2.lI().method_23093(var1);
      }
   }

   private static ReflectiveOperationException IIII(ReflectiveOperationException var0) {
      return var0;
   }

   public static void IIIl(lIIlIl var0, class_243 var1, float var2, float var3, float var4, Color var5, double var6, float var8) {
      if (IIIIII(var0) && var1 != null && !(var2 <= 0.0F) && !(var3 <= 0.0F)) {
         class_243[] var9 = II(var1, var2, var3, var4);
         lIlIl(var8, IlIII::IlIIlI);
      }
   }

   private static void IIlI(
      class_4588 var0, Matrix4f var1, class_243 var2, class_243 var3, class_243 var4, class_243 var5, class_243 var6, Color var7, double var8
   ) {
      float var10 = var7.getRed() / 255.0F;
      float var11 = var7.getGreen() / 255.0F;
      float var12 = var7.getBlue() / 255.0F;
      float var13 = Il(var8) / 255.0F;
      var0.method_22918(
            var1, (float)(var3.field_1352 - var2.field_1352), (float)(var3.field_1351 - var2.field_1351), (float)(var3.field_1350 - var2.field_1350)
         )
         .method_22915(var10, var11, var12, var13);
      var0.method_22918(
            var1, (float)(var4.field_1352 - var2.field_1352), (float)(var4.field_1351 - var2.field_1351), (float)(var4.field_1350 - var2.field_1350)
         )
         .method_22915(var10, var11, var12, var13);
      var0.method_22918(
            var1, (float)(var5.field_1352 - var2.field_1352), (float)(var5.field_1351 - var2.field_1351), (float)(var5.field_1350 - var2.field_1350)
         )
         .method_22915(var10, var11, var12, var13);
      var0.method_22918(
            var1, (float)(var6.field_1352 - var2.field_1352), (float)(var6.field_1351 - var2.field_1351), (float)(var6.field_1350 - var2.field_1350)
         )
         .method_22915(var10, var11, var12, var13);
   }

   public static class_243 IIll(class_1297 var0, float var1) {
      return var0.method_30950(var1);
   }

   private static void IlII(lIIlIl var0) {
      if (var0 != null && var0.llI() == null) {
         if (lIl(var0) instanceof class_4598 var2) {
            var2.method_22993();
         }
      }
   }

   public static <T> void IlIl(
      Object var0, Iterable<? extends Iterable<T>> var1, Function<T, class_2338> var2, Function<T, Color> var3, ToDoubleFunction<T> var4
   ) {
      if (var0 instanceof lIIlIl var5) {
         lllII(var5, var1, var2, var3, var4);
      }
   }

   private static void IllI(class_4587 var0, class_4597 var1, class_238 var2, Color var3, double var4, float var6) {
      if (var0 != null && var2 != null && var3 != null) {
         class_4184 var7 = class_310.method_1551().field_1773.method_19418();
         class_243 var8 = var7.method_71156();
         float var9 = (float)(var2.field_1323 - var8.field_1352);
         float var10 = (float)(var2.field_1322 - var8.field_1351);
         float var11 = (float)(var2.field_1321 - var8.field_1350);
         float var12 = (float)(var2.field_1320 - var8.field_1352);
         float var13 = (float)(var2.field_1325 - var8.field_1351);
         float var14 = (float)(var2.field_1324 - var8.field_1350);
         float var15 = var3.getRed() / 255.0F;
         float var16 = var3.getGreen() / 255.0F;
         float var17 = var3.getBlue() / 255.0F;
         float var18 = Il(var4) / 255.0F;
         Matrix4f var19 = var0.method_23760().method_23761();
         if (var1 != null) {
            class_4588 var26 = var1.method_73477(class_12249.method_76015());
            var26.method_22918(var19, var9, var10, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 1.0F, 0.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var10, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 1.0F, 0.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var10, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 1.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var13, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 1.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var13, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), -1.0F, 0.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var9, var13, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), -1.0F, 0.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var9, var13, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, -1.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var9, var10, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, -1.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var9, var10, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 1.0F, 0.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var10, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 1.0F, 0.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var10, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 1.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var13, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 1.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var13, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), -1.0F, 0.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var9, var13, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), -1.0F, 0.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var9, var13, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, -1.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var9, var10, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, -1.0F, 0.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var9, var10, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var9, var10, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var10, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var10, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var13, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var12, var13, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var9, var13, var11)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
               .method_75298(llII(var6));
            var26.method_22918(var19, var9, var13, var14)
               .method_22915(var15, var16, var17, var18)
               .method_60831(var0.method_23760(), 0.0F, 0.0F, 1.0F)
               .method_75298(llII(var6));
         } else {
            lIIIl(llIl);
            lIIIl(III);
            lIIIl(I);
            IIIIlI();
            IlIIl(IlI, Illl);
            IlIIl(lllI, llII(var6));

            try {
               Object var20 = IIIlll(IIIl);
               class_4588 var21 = (class_4588)lIII(var20, lIll, lII, ll);
               if (var21 != null) {
                  var21.method_22918(var19, var9, var10, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var10, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var10, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var13, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var13, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var9, var13, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var9, var13, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var9, var10, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var9, var10, var14).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var10, var14).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var10, var14).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var13, var14).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var13, var14).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var9, var13, var14).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var9, var13, var14).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var9, var10, var14).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var9, var10, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var9, var10, var14).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var10, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var10, var14).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var13, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var12, var13, var14).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var9, var13, var11).method_22915(var15, var16, var17, var18);
                  var21.method_22918(var19, var9, var13, var14).method_22915(var15, var16, var17, var18);
                  Object var22 = lIII(var21, lll);
                  if (var22 != null) {
                     IlIIl(lIl, var22);
                  }

                  return;
               }
            } finally {
               IlIIl(lllI, 1.0F);
               lIIII();
               lIIIl(Il);
               lIIIl(lIlI);
            }
         }
      }
   }

   public static void Illl(lIIlIl var0, class_238 var1, Color var2, double var3) {
      IIlIl(var0, var1, var2, var3, 1.0F);
   }

   private static Object lIII(Object param0, Method param1, Object... param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 0f
      // 04: aload 1
      // 05: ifnonnull 15
      // 08: goto 0f
      // 0b: invokestatic k74/x/IlIII.IIII (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 0e: athrow
      // 0f: aconst_null
      // 10: areturn
      // 11: invokestatic k74/x/IlIII.IIII (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 14: athrow
      // 15: aload 1
      // 16: aload 0
      // 17: aload 2
      // 18: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 1b: areturn
      // 1c: astore 3
      // 1d: aconst_null
      // 1e: areturn
   }

   public static void lIIl(Object var0, class_238 var1, Color var2, double var3) {
      if (lll(var0, var1)) {
         if (var0 instanceof lIIlIl var5) {
            llll(var5.I(), var5.llI(), var1, var2, var3);
         } else if (var0 instanceof WorldRenderContext var6) {
            llll(var6.matrices(), var6.consumers(), var1, var2, var3);
         }
      }
   }

   public static void lIlI(lIIlIl var0, Matrix4f var1, float var2, float var3, float var4, float var5, int var6) {
      int var13 = 1530462248;
      int var7 = var6 >>> IlIlII(763349994, var13 ^ 78215254) & IlIlII(763349995, var13 ^ -201843322);
      if (IIIIII(var0) && var1 != null && var7 > 0 && !(var4 <= var2) && !(var5 <= var3)) {
         float var8 = (var6 >> IlIlII(763349992, var13 ^ 1500950262) & IlIlII(763349993, var13 ^ 18013638)) / 255.0F;
         float var9 = (var6 >> IlIlII(763349998, var13 ^ 1188511570) & IlIlII(763349999, var13 ^ -1910100812)) / 255.0F;
         float var10 = (var6 & IlIlII(763349996, var13 ^ 1334529880)) / 255.0F;
         float var11 = var7 / 255.0F;
         class_4588 var12 = lIl(var0).method_73477(class_12249.method_76023());
         var12.method_22918(var1, var2, var3, 0.0F).method_22915(var8, var9, var10, var11);
         var12.method_22918(var1, var2, var5, 0.0F).method_22915(var8, var9, var10, var11);
         var12.method_22918(var1, var4, var5, 0.0F).method_22915(var8, var9, var10, var11);
         var12.method_22918(var1, var4, var3, 0.0F).method_22915(var8, var9, var10, var11);
      }
   }

   public static void lIll(lIIlIl var0, class_243 var1, class_243 var2, class_243 var3, Color var4, double var5) {
      if (IIIIII(var0) && var1 != null && var2 != null && var3 != null && var4 != null) {
         class_243 var7 = Illll(var0);
         Matrix4f var8 = var0.I().method_23760().method_23761();
         class_4588 var9 = lIl(var0).method_73477(class_12249.method_76023());
         float var10 = var4.getRed() / 255.0F;
         float var11 = var4.getGreen() / 255.0F;
         float var12 = var4.getBlue() / 255.0F;
         float var13 = Il(var5) / 255.0F;
         var9.method_22918(
               var8, (float)(var1.field_1352 - var7.field_1352), (float)(var1.field_1351 - var7.field_1351), (float)(var1.field_1350 - var7.field_1350)
            )
            .method_22915(var10, var11, var12, var13);
         var9.method_22918(
               var8, (float)(var2.field_1352 - var7.field_1352), (float)(var2.field_1351 - var7.field_1351), (float)(var2.field_1350 - var7.field_1350)
            )
            .method_22915(var10, var11, var12, var13);
         var9.method_22918(
               var8, (float)(var3.field_1352 - var7.field_1352), (float)(var3.field_1351 - var7.field_1351), (float)(var3.field_1350 - var7.field_1350)
            )
            .method_22915(var10, var11, var12, var13);
         var9.method_22918(
               var8, (float)(var1.field_1352 - var7.field_1352), (float)(var1.field_1351 - var7.field_1351), (float)(var1.field_1350 - var7.field_1350)
            )
            .method_22915(var10, var11, var12, var13);
      }
   }

   private static float llII(float var0) {
      return !Float.isFinite(var0) ? 1.0F : Math.max(0.5F, var0);
   }

   private static Method llIl(String param0, String param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 04: astore 3
      // 05: aload 3
      // 06: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 09: astore 4
      // 0b: aload 4
      // 0d: arraylength
      // 0e: istore 5
      // 10: bipush 0
      // 11: istore 6
      // 13: iload 6
      // 15: iload 5
      // 17: if_icmpge 58
      // 1a: aload 4
      // 1c: iload 6
      // 1e: aaload
      // 1f: astore 7
      // 21: aload 7
      // 23: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 26: aload 1
      // 27: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a: ifeq 52
      // 2d: aload 7
      // 2f: invokevirtual java/lang/reflect/Method.getParameterCount ()I
      // 32: iload 2
      // 33: if_icmpne 52
      // 36: goto 3d
      // 39: invokestatic k74/x/IlIII.IIII (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 3c: athrow
      // 3d: aload 7
      // 3f: invokevirtual java/lang/reflect/Method.getModifiers ()I
      // 42: invokestatic java/lang/reflect/Modifier.isStatic (I)Z
      // 45: ifne 52
      // 48: goto 4f
      // 4b: invokestatic k74/x/IlIII.IIII (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 4e: athrow
      // 4f: aload 7
      // 51: areturn
      // 52: iinc 6 1
      // 55: goto 13
      // 58: goto 5c
      // 5b: astore 3
      // 5c: aconst_null
      // 5d: areturn
   }

   public static void lllI(lIIlIl var0, class_243 var1, float var2, float var3, float var4, Color var5, double var6) {
      if (IIIIII(var0) && var1 != null && !(var2 <= 0.0F) && !(var3 <= 0.0F)) {
         llI(var0.I(), lIl(var0), var1, var2, var3, var4, var5, var6);
      }
   }

   private static void llll(class_4587 var0, class_4597 var1, class_238 var2, Color var3, double var4) {
      if (var0 != null && var2 != null && var3 != null) {
         class_4184 var6 = class_310.method_1551().field_1773.method_19418();
         class_243 var7 = var6.method_71156();
         float var8 = (float)(var2.field_1323 - var7.field_1352);
         float var9 = (float)(var2.field_1322 - var7.field_1351);
         float var10 = (float)(var2.field_1321 - var7.field_1350);
         float var11 = (float)(var2.field_1320 - var7.field_1352);
         float var12 = (float)(var2.field_1325 - var7.field_1351);
         float var13 = (float)(var2.field_1324 - var7.field_1350);
         float var14 = var3.getRed() / 255.0F;
         float var15 = var3.getGreen() / 255.0F;
         float var16 = var3.getBlue() / 255.0F;
         float var17 = Il(var4) / 255.0F;
         Matrix4f var18 = var0.method_23760().method_23761();
         if (var1 != null) {
            class_4588 var25 = var1.method_73477(class_12249.method_76023());
            var25.method_22918(var18, var8, var9, var10).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var9, var10).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var12, var10).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var8, var12, var10).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var8, var9, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var8, var12, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var12, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var9, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var8, var9, var10).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var8, var9, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var9, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var9, var10).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var8, var12, var10).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var12, var10).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var12, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var8, var12, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var8, var9, var10).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var8, var12, var10).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var8, var12, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var8, var9, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var9, var10).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var9, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var12, var13).method_22915(var14, var15, var16, var17);
            var25.method_22918(var18, var11, var12, var10).method_22915(var14, var15, var16, var17);
         } else {
            lIIIl(llIl);
            lIIIl(III);
            lIIIl(I);
            IIIIlI();
            IlIIl(IlI, Illl);

            try {
               Object var19 = IIIlll(IIIl);
               class_4588 var20 = (class_4588)lIII(var19, lIll, lI, ll);
               if (var20 != null) {
                  var20.method_22918(var18, var8, var9, var10).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var9, var10).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var12, var10).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var8, var12, var10).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var8, var9, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var8, var12, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var12, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var9, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var8, var9, var10).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var8, var9, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var9, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var9, var10).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var8, var12, var10).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var12, var10).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var12, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var8, var12, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var8, var9, var10).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var8, var12, var10).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var8, var12, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var8, var9, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var9, var10).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var9, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var12, var13).method_22915(var14, var15, var16, var17);
                  var20.method_22918(var18, var11, var12, var10).method_22915(var14, var15, var16, var17);
                  Object var21 = lIII(var20, lll);
                  if (var21 != null) {
                     IlIIl(lIl, var21);
                  }

                  return;
               }
            } finally {
               lIIII();
               lIIIl(Il);
               lIIIl(lIlI);
            }
         }
      }
   }

   public static class_243 IIIII() {
      class_4184 var0 = class_310.method_1551().field_1773.method_19418();
      float var1 = (float) Math.PI;
      float var2 = (float)Math.toRadians(-var0.method_19330());
      float var3 = (float)Math.toRadians(-var0.method_19329());
      float var4 = class_3532.method_15374(var2 - var1);
      float var5 = class_3532.method_15362(var2 - var1);
      float var6 = -class_3532.method_15374(var3);
      float var7 = class_3532.method_15362(var3);
      return new class_243(var5 * var6, var7, var4 * var6).method_1019(var0.method_71156());
   }

   public static void IIIIl(lIIlIl var0, class_243 var1, class_243 var2, Color var3, double var4) {
      if (IIIIII(var0) && var1 != null && var2 != null && var3 != null) {
         class_243 var6 = Illll(var0);
         float var7 = (float)(var1.field_1352 - var6.field_1352);
         float var8 = (float)(var1.field_1351 - var6.field_1351);
         float var9 = (float)(var1.field_1350 - var6.field_1350);
         float var10 = (float)(var2.field_1352 - var6.field_1352);
         float var11 = (float)(var2.field_1351 - var6.field_1351);
         float var12 = (float)(var2.field_1350 - var6.field_1350);
         float var13 = var3.getRed() / 255.0F;
         float var14 = var3.getGreen() / 255.0F;
         float var15 = var3.getBlue() / 255.0F;
         float var16 = Il(var4) / 255.0F;
         Matrix4f var17 = var0.I().method_23760().method_23761();
         lIIIl(llIl);
         lIIIl(III);
         lIIIl(I);
         IIIIlI();
         IlIIl(IlI, Illl);
         IlIIl(lllI, llII(IlIIll()));

         try {
            Object var18 = IIIlll(IIIl);
            class_4588 var19 = (class_4588)lIII(var18, lIll, lII, ll);
            if (var19 != null) {
               var19.method_22918(var17, var7, var8, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var11, var12).method_22915(var13, var14, var15, var16);
               Object var20 = lIII(var19, lll);
               if (var20 != null) {
                  IlIIl(lIl, var20);
               }

               return;
            }
         } finally {
            IlIIl(lllI, 1.0F);
            lIIII();
            lIIIl(Il);
            lIIIl(lIlI);
         }
      }
   }

   private static int IIIlI(Color var0, double var1) {
      int var4 = 1321052533;
      int var3 = Il(var1);
      return (var3 & IlIlII(763349997, var4 ^ -1940601138)) << IlIlII(763349986, var4 ^ -1979019088)
         | (var0.getRed() & IlIlII(763349987, var4 ^ 489411882)) << IlIlII(763349984, var4 ^ 422643363)
         | (var0.getGreen() & IlIlII(763349985, var4 ^ 1883138196)) << IlIlII(763349990, var4 ^ 49358276)
         | var0.getBlue() & IlIlII(763349991, var4 ^ -1536989124);
   }

   private static void IIIll(class_4587 var0, class_4597 var1, class_238 var2, Color var3, double var4, class_1921 var6) {
      if (var0 != null && var1 != null && var2 != null && var3 != null && var6 != null) {
         class_4184 var7 = class_310.method_1551().field_1773.method_19418();
         class_243 var8 = var7.method_71156();
         float var9 = (float)(var2.field_1323 - var8.field_1352);
         float var10 = (float)(var2.field_1322 - var8.field_1351);
         float var11 = (float)(var2.field_1321 - var8.field_1350);
         float var12 = (float)(var2.field_1320 - var8.field_1352);
         float var13 = (float)(var2.field_1325 - var8.field_1351);
         float var14 = (float)(var2.field_1324 - var8.field_1350);
         float var15 = var3.getRed() / 255.0F;
         float var16 = var3.getGreen() / 255.0F;
         float var17 = var3.getBlue() / 255.0F;
         float var18 = Il(var4) / 255.0F;
         Matrix4f var19 = var0.method_23760().method_23761();
         class_4588 var20 = var1.method_73477(var6);
         var20.method_22918(var19, var9, var10, var11).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var10, var11).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var13, var11).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var9, var13, var11).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var9, var10, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var9, var13, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var13, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var10, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var9, var10, var11).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var9, var10, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var10, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var10, var11).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var9, var13, var11).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var13, var11).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var13, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var9, var13, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var9, var10, var11).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var9, var13, var11).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var9, var13, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var9, var10, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var10, var11).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var10, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var13, var14).method_22915(var15, var16, var17, var18);
         var20.method_22918(var19, var12, var13, var11).method_22915(var15, var16, var17, var18);
      }
   }

   private IlIII() {
   }

   public static llIIIIll IIlII(lIIlIl var0, Iterable<class_243> var1) {
      if (IIIIII(var0) && var1 != null) {
         double var2 = Double.POSITIVE_INFINITY;
         double var4 = Double.POSITIVE_INFINITY;
         double var6 = Double.NEGATIVE_INFINITY;
         double var8 = Double.NEGATIVE_INFINITY;
         int var10 = 0;

         for (class_243 var12 : var1) {
            IlIllIIII var13 = IlIll(var0, var12);
            if (var13 != null) {
               var10++;
               var2 = Math.min(var2, var13.II());
               var4 = Math.min(var4, var13.l());
               var6 = Math.max(var6, var13.II());
               var8 = Math.max(var8, var13.l());
            }
         }

         return var10 < 2 ? null : new llIIIIll(var2, var4, var6, var8);
      } else {
         return null;
      }
   }

   public static void IIlIl(lIIlIl var0, class_238 var1, Color var2, double var3, float var5) {
      if (IIIIII(var0) && var1 != null && var2 != null && lll(var0, var1)) {
         IllI(var0.I(), var0.llI(), var1, var2, var3, var5);
      }
   }

   private static void IIllI(class_238 var0, lIIlIl var1, Color var2, double var3) {
      class_243 var5 = new class_243(var0.field_1323, var0.field_1322, var0.field_1321);
      class_243 var6 = new class_243(var0.field_1320, var0.field_1322, var0.field_1321);
      class_243 var7 = new class_243(var0.field_1320, var0.field_1325, var0.field_1321);
      class_243 var8 = new class_243(var0.field_1323, var0.field_1325, var0.field_1321);
      class_243 var9 = new class_243(var0.field_1323, var0.field_1322, var0.field_1324);
      class_243 var10 = new class_243(var0.field_1320, var0.field_1322, var0.field_1324);
      class_243 var11 = new class_243(var0.field_1320, var0.field_1325, var0.field_1324);
      class_243 var12 = new class_243(var0.field_1323, var0.field_1325, var0.field_1324);
      IIIIl(var1, var5, var6, var2, var3);
      IIIIl(var1, var6, var7, var2, var3);
      IIIIl(var1, var7, var8, var2, var3);
      IIIIl(var1, var8, var5, var2, var3);
      IIIIl(var1, var9, var10, var2, var3);
      IIIIl(var1, var10, var11, var2, var3);
      IIIIl(var1, var11, var12, var2, var3);
      IIIIl(var1, var12, var9, var2, var3);
      IIIIl(var1, var5, var9, var2, var3);
      IIIIl(var1, var6, var10, var2, var3);
      IIIIl(var1, var7, var11, var2, var3);
      IIIIl(var1, var8, var12, var2, var3);
   }

   private static void IIlll(
      class_4588 var0,
      Matrix4f var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14
   ) {
      int var15 = Math.max(1, class_3532.method_15386(var4));

      for (int var16 = 0; var16 < var15; var16++) {
         float var17 = Math.min(var4, (float)var16);
         float var18 = Math.min(var4, var16 + 1.0F);
         if (!(var18 <= var17)) {
            float var19 = (var17 + var18) * 0.5F;
            float var20 = lI(var19, var4, var6);
            float var21 = lII(var19, var4, var5, var6);
            if (!(var21 <= var20)) {
               var0.method_22918(var1, var2 + var17, var3 + var20, 0.0F).method_22915(var7, var8, var9, var10);
               var0.method_22918(var1, var2 + var17, var3 + var21, 0.0F).method_22915(var11, var12, var13, var14);
               var0.method_22918(var1, var2 + var18, var3 + var21, 0.0F).method_22915(var11, var12, var13, var14);
               var0.method_22918(var1, var2 + var18, var3 + var20, 0.0F).method_22915(var7, var8, var9, var10);
            }
         }
      }
   }

   private static void IlIII(class_4587 var0, class_238 var1, Color var2, double var3, float var5) {
      if (var0 != null && var1 != null && var2 != null) {
         class_4184 var6 = class_310.method_1551().field_1773.method_19418();
         class_243 var7 = var6.method_71156();
         float var8 = (float)(var1.field_1323 - var7.field_1352);
         float var9 = (float)(var1.field_1322 - var7.field_1351);
         float var10 = (float)(var1.field_1321 - var7.field_1350);
         float var11 = (float)(var1.field_1320 - var7.field_1352);
         float var12 = (float)(var1.field_1325 - var7.field_1351);
         float var13 = (float)(var1.field_1324 - var7.field_1350);
         float var14 = var2.getRed() / 255.0F;
         float var15 = var2.getGreen() / 255.0F;
         float var16 = var2.getBlue() / 255.0F;
         float var17 = Il(var3) / 255.0F;
         Matrix4f var18 = var0.method_23760().method_23761();
         lIIIl(llIl);
         lIIIl(III);
         lIIIl(I);
         IIIIlI();
         IlIIl(IlI, Illl);
         IlIIl(lllI, llII(var5));

         try {
            Object var19 = IIIlll(IIIl);
            class_4588 var20 = (class_4588)lIII(var19, lIll, lII, ll);
            if (var20 != null) {
               var20.method_22918(var18, var8, var9, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var9, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var9, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var12, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var12, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var8, var12, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var8, var12, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var8, var9, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var8, var9, var13).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var9, var13).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var9, var13).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var12, var13).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var12, var13).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var8, var12, var13).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var8, var12, var13).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var8, var9, var13).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var8, var9, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var8, var9, var13).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var9, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var9, var13).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var12, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var11, var12, var13).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var8, var12, var10).method_22915(var14, var15, var16, var17);
               var20.method_22918(var18, var8, var12, var13).method_22915(var14, var15, var16, var17);
               Object var21 = lIII(var20, lll);
               if (var21 != null) {
                  IlIIl(lIl, var21);
               }

               return;
            }
         } finally {
            IlIIl(lllI, 1.0F);
            lIIII();
            lIIIl(Il);
            lIIIl(lIlI);
         }
      }
   }

   private static void IlIIl(Method var0, Object... var1) {
      try {
         if (var0 == null) {
            return;
         }
      } catch (ReflectiveOperationException var4) {
         throw IIII(var4);
      }

      try {
         var0.invoke(null, var1);
      } catch (ReflectiveOperationException var3) {
      }
   }

   public static void IlIlI(Object var0, class_238 var1, Color var2, double var3, float var5) {
      if (var1 != null && var2 != null && lll(var0, var1)) {
         if (var0 instanceof lIIlIl var6 && var6.I() != null) {
            ll(var6.I(), lIl(var6), var1, var2, var3, var5, IlIl);
         } else if (var0 instanceof WorldRenderContext var7 && var7.matrices() != null) {
            ll(var7.matrices(), lIl(var7), var1, var2, var3, var5, IlIl);
         }
      }
   }

   public static IlIllIIII IlIll(lIIlIl var0, class_243 var1) {
      if (IIIIII(var0) && var1 != null) {
         class_310 var2 = class_310.method_1551();
         if (var2.method_22683() == null) {
            return null;
         } else {
            int var3 = var2.method_22683().method_4486();
            int var4 = var2.method_22683().method_4502();
            if (var3 > 0 && var4 > 0) {
               Matrix4f var5 = var0.lll();
               Matrix4f var6 = var0.IlI();
               class_243 var7 = Illll(var0);
               lIIl.set(var5).mul(var6);
               Vector4f var8 = II.set(
                  (float)(var1.field_1352 - var7.field_1352), (float)(var1.field_1351 - var7.field_1351), (float)(var1.field_1350 - var7.field_1350), 1.0F
               );
               lIIl.transform(var8);
               if (Float.isFinite(var8.x) && Float.isFinite(var8.y) && Float.isFinite(var8.z) && Float.isFinite(var8.w) && !(var8.w < 0.05F)) {
                  float var9 = var8.x / var8.w;
                  float var10 = var8.y / var8.w;
                  float var11 = var8.z / var8.w;
                  if (Float.isFinite(var9) && Float.isFinite(var10) && Float.isFinite(var11) && !(var11 < -1.0F) && !(var11 > 1.0F)) {
                     double var12 = (var9 * 0.5F + 0.5F) * var3;
                     double var14 = (-var10 * 0.5F + 0.5F) * var4;
                     return Double.isFinite(var12) && Double.isFinite(var14) ? new IlIllIIII(var12, var14, var11) : null;
                  } else {
                     return null;
                  }
               } else {
                  return null;
               }
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   public static boolean IllII(class_310 var0, lIIlIl var1, class_1297 var2, class_243 var3) {
      if (var0 != null && var2 != null && var3 != null) {
         class_243 var4 = Illll(var1);
         return var1 != null && var1.lI() != null
            ? var0.method_1561()
               .method_3950(var2, var1.lI(), var3.field_1352 - var4.field_1352, var3.field_1351 - var4.field_1351, var3.field_1350 - var4.field_1350)
            : var3.method_1022(var4) <= 16384.0;
      } else {
         return false;
      }
   }

   private static String IllIl(char[] var0, long var1, int var3) {
      int var4 = IlIlII(763349988, 1445164298 ^ -925993667) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IlIlII(763349989, 1445164298 ^ 80609246);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public static void IlllI(lIIlIl var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8) {
      int var21 = 452978696;
      int var9 = var7 >>> IlIlII(763349978, var21 ^ 1064728913) & IlIlII(763349979, var21 ^ -838074259);
      int var10 = var8 >>> IlIlII(763349976, var21 ^ -1863192653) & IlIlII(763349977, var21 ^ -67249802);
      if (IIIIII(var0) && var1 != null && (var9 > 0 || var10 > 0) && !(var4 <= 0.0F) && !(var5 <= 0.0F)) {
         float var11 = Ill(var4, var5, var6);
         if (var11 <= 0.01F) {
            llIlI(var0, var1, var2, var3, var2 + var4, var3 + var5, var7, var8);
         } else {
            float var12 = (var7 >> IlIlII(763349982, var21 ^ 1395316838) & IlIlII(763349983, var21 ^ 1432236793)) / 255.0F;
            float var13 = (var7 >> IlIlII(763349980, var21 ^ 635205664) & IlIlII(763349981, var21 ^ -1405063058)) / 255.0F;
            float var14 = (var7 & IlIlII(763349970, var21 ^ 82194587)) / 255.0F;
            float var15 = var9 / 255.0F;
            float var16 = (var8 >> IlIlII(763349971, var21 ^ 1430980279) & IlIlII(763349968, var21 ^ -1615526812)) / 255.0F;
            float var17 = (var8 >> IlIlII(763349969, var21 ^ -2061247573) & IlIlII(763349974, var21 ^ -474351201)) / 255.0F;
            float var18 = (var8 & IlIlII(763349975, var21 ^ 1253898657)) / 255.0F;
            float var19 = var10 / 255.0F;
            class_4588 var20 = lIl(var0).method_73477(class_12249.method_76023());
            IIlll(var20, var1, var2, var3, var4, var5, var11, var12, var13, var14, var15, var16, var17, var18, var19);
         }
      }
   }

   public static class_243 Illll(Object var0) {
      if (var0 instanceof lIIlIl var1) {
         return var1.lIl() != null ? var1.lIl().method_71156() : class_310.method_1551().field_1773.method_19418().method_71156();
      } else {
         return class_310.method_1551().field_1773.method_19418().method_71156();
      }
   }

   private static void lIIII() {
      IlIIl(IIl, true);
      lIIIl(llI);
   }

   private static int IlIlII(int var0, int var1) {
      int var2 = llll[var0 ^ 763350010] ^ var1 ^ var0;
      var2 ^= 1746;
      var2 += 30687;
      var2 -= 29088;
      var2 ^= 27657;
      var2 ^= 41592;
      return var2 - 18531;
   }

   private static void lIIIl(Method var0) {
      try {
         if (var0 == null) {
            return;
         }
      } catch (ReflectiveOperationException var3) {
         throw IIII(var3);
      }

      try {
         var0.invoke(null);
      } catch (ReflectiveOperationException var2) {
      }
   }

   public static void lIIlI(Object var0, class_238 var1, Color var2, double var3) {
      if (var1 != null && var2 != null && lll(var0, var1)) {
         if (var0 instanceof lIIlIl var5 && var5.I() != null) {
            IIIll(var5.I(), lIl(var5), var1, var2, var3, IllI);
         } else if (var0 instanceof WorldRenderContext var6 && var6.matrices() != null) {
            IIIll(var6.matrices(), lIl(var6), var1, var2, var3, IllI);
         }
      }
   }

   private static boolean lIIll(int var0) {
      return true;
   }

   public static void lIlII(lIIlIl var0, class_2338 var1, Color var2, double var3) {
      if (IIIIII(var0)) {
         class_243 var5 = Illll(var0);
         float var6 = 0.06F;
         float var7 = (float)(var1.method_10263() - var5.field_1352) + var6;
         float var8 = (float)(var1.method_10264() - var5.field_1351) + 0.02F;
         float var9 = (float)(var1.method_10260() - var5.field_1350) + var6;
         float var10 = (float)(var1.method_10263() - var5.field_1352 + 1.0) - var6;
         float var11 = (float)(var1.method_10260() - var5.field_1350 + 1.0) - var6;
         Matrix4f var12 = var0.I().method_23760().method_23761();
         class_4588 var13 = lIl(var0).method_73477(class_12249.method_76023());
         I(var13, var12, var7, var8, var9, var10, var11, var2, var3);
      }
   }

   private static void lIlIl(float var0, Runnable var1) {
      float var2 = IIll;
      IlI(var0);

      try {
         var1.run();
      } finally {
         IIll = var2;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -1586579733;
      String[] var9 = new String[2];
      int var10001 = "Γ햫硁\uddb2疡\uf4eb潙귅ꮛ懫䋝ᔀ吸뒽搇ԝ䴣䛾僚텷䷎叵뎦䙲骅柠\ue54b菙폑⧕䷸ﮑ༹ﰘ\ue2f4蒪ᇒ韋\ufdc9\ue619꧳뱕鶐\uee9fᎬ꼳隩윐‱ⷷ⿲㥖떟梽Ꙑ么\uef88쩉筲䪋葁떏䋑떝뻇敭鈙聫\ude7f烮ㅈ靥Ծ弎⼠璘贑㘩迿ᣇ\ua95e퉹䨟쏍엙\uf328善탩긂\ueba7䣪\uf4e0륫跤흵猐媒\uf4e8配ꐡ铔\u0d99봛欄㧩༧\u200b絋珳퓻ᨿ妾걑굖퇾賙鿽뱶퀡풉ೃĄ彋ᆀ\ue56a꼁⸪䎤ڪ㳹Ꮴ㷜魋ନ碟죉뽅鳸怍凂儌ꊦꗓ⇧ྈ큑鹝ᕭ熶ೇⒹṗ瘼韰鑘ᅒ砙龄䢖̳둢蘭⯚῀ᴁ\uf16f\ueb25밗㿙릱멺뉕굂圲㴣ꍙ\uf679옵뢎䤪竟좢尠\uf44d\ue45e溈Ꞇ㆕⥬Ⴙ阴䫩울Кㄝ兩咣蕿\ud9d6᱔刢ꖺ\uf5aa츛将컨帅ࢵ坫哜ޕڲ캯ㇳ\ue423慾겗\ue294\ue789骜⁆\u1ccb⤊\u0b5b椥瘧役㢃懑啚᭣얏醷釯ㅞ⸶ꕓ勒၂ॱ\uf854\ue763䥎叜튭觴鏮ㅅ䕉彎趻脢殑砰ἠₜ\uee0c\ueddaﻋ塌\u1aff쑉\ua9da▂፱\ue0ae\ueed3罿퍘廊뽫읺ნ·㑰\uea15媋\udad1찕弌᧣ศ䦑歈笇㍂ດ\ud8c5籠ጾ齴盶쟉⚙ࡼ췔譚뷿唗\uf381웉\udde8\uf11d퐢묪⠌ɈԌ蓰\ueffe촍ⰵ폨륃뷞癦玴邠嚷츢⏪佡㊲\ue48a\uf3c8\ue9b3緫ꁪꪟ斜쵚路紴ᦏ䜏᳴뤟替轁遄굙넮Έ騾턜湾ꚶ嗋䟳ﰕ㍋\uf4dfⓛ\udd69ﻤ旞廉졄쁍겶魘左㟅饅阃좛㝄\ue614ዙ硑햝䝾㋶쁥\uf11d緁ﹴ\u10ce垈켈䠲㵖ꀸ䯼橫畍䩀쮤ﻱ朘\uf23a캢鮴ᩃ봂\ue989⏮\uf585刅\ud9db\u2d29笩鸴污㽢쎌↜穐୳ꛙ䫒\uea51쟜≀緆옐氖秞먮蔓퇾먉ᙿꐆ浴갞\udaff絛낉猷㟈钩翐妅夵⠚묖䞩稝幬ꖔ쯉檟휼㠹ꟙ\ue183\ud84a鋘塃ꗘꛗ郣樏\ue95d᷿ﻀ붚⠥海퐖┰⳾ꂘ\udf9cꉇ驸⋭諬怿\uded7떣騻圮ꢽ荁\uec4e됵嗷嵐ᑉꈄ◅說箿㏹ﴩܡ\udb5e﹛ᅋ쾾兎廓鄜鋝这軺攌Ⴙ兕룲ᘿ䀽艒豒ꭨળ됙鵭疸묅덫쌕⇦\ue50f꩐眀⥝퉿ਟ嵏㵀쬢\udf2dᮥ玟瘣곶ꚧ㩔ﰮ菣㧫哟\uf88a褠ჲ䅁篧퇾\ue2a8俎넝窥\uedf3⻇퓭Ͽ㘇嬸ꟸ⸻쌍朢㪺ဃ隑䱐撇럌쫉苉뙲焉ᱏ愦졘ꀐ뛻깧蟱適\ue64b멌䁬덹类ⴐ祫띥ˀ獤蒼榉ᰛཨ皐ᨩ쩻迋䱥욋哨﹑咣䕧귆ٟ쎕Ή暝\u09b3鏅㽩\uf761\ue0aa훐숺〮閟堑\uf03e㥛⮌䡟ꏲ鲠ߒ\ue268瀱픈冶쿼굏\udd10㸈쩉閇\ue26b毋녔욲∰庨ꎀ\uf03f鲔偏눖哟野㣗\uea0f\ue24f鎢\uf2f1ഐ円憟ɓ蔺䖣\uda33窨\uf034⏯⧅㟓텂俴︓\udf6fᣎ໎㶃\ue987ꬕ驐➭և\uf494眍\ue9dc\ueffd弡諀ȯ퍃悲縸鮍ၫ庩뇿胒ꬖ\ue05b\ud9f0뼃㜌∷礶⠸軓枌\uea81숰㲹\ud8c5Ჲ剕\ueab8䘫\ud832籡颿䝇\ue7e2攑ᗽ䒜爛棽趩乢脠頬\uf66b\uf369䴚\uaa3a茓桄抍돆尲嵥뉜樻禮ⰹԭ뤼쓾̩မ\uf640挻៲॥쇉ꥣ\uefd6䪙瞘⠕\ue542㡧闾徴띴뼇鰁쇦ᧂۄ㥗䭠郢墫笕䕥ͦ䃂饱䆏暑䩤갈פֿ㺞\uea40㠈✠\uf550⅛깳ﺿ\ue469㱦뚆踖墆鄂│畉⯑㏟刖ኑꝥ㌵ⴇᓩꮭҗ䢈\uda40陳ᱎ࣒诀峥\udc52틐舢ﯜၬ왚\uf1ff᷌㜷桍떌껿\ue1e9֢鯭럔쎸젻䊽睛蕏\uf674ṩ캛迊\uecfc\ue678\ud803튔\uef8c糴鳼ꐰᥥﴫ㩲䟂ࠛ\ud98a峑ƍ酸粹떗㝥̲픬ᑦ\uf1ff䇪腭蕨|鿖ꁾាⶆ\uef9b頯ૣ쾆纭间䏊颔쮛㽕陯渦몌촏쀲ࢱ\ue118҂\udf2d塚귀証匾챏錟ᆶ铧걱⅟쮯莟ݗ禝綾⢼\ue4ddꖏᵨ쮛႘㛕ⱑႜⰕ킒諕刴䜳壀퀄\ue414\ue93b괇\u20f7븿]偋덍⇠ણ䇕捆\uea33瞠ф雫惍赺㏁蟢幨\uecdbꊗ썞ࡺവ⺖\u200d㽱ᔯ녝\ue1d5潆\ua7ed职\uf5fc䨴᪥玲ᐵ삠\udaeb桤⪗‷\udb42袇\ud888⼼烕\ue05e곎笈⽪䫹㒼ꆰ⓵ࠡṓ庪ꊇꛊ᳘긅鹎䧫Є帾⳯㮿ㄏ캻撞㴣蔨璿\ue758槲⫘悑菔议㟳鋾쮋畒ᚹ昈嫊\uf8be쉢㦼⤉僗꠫\uedc3⠂㉮"
         .length();
      int var11 = 0;
      int var8 = var10001;
      String var7 = "Γ햫硁\uddb2疡\uf4eb潙귅ꮛ懫䋝ᔀ吸뒽搇ԝ䴣䛾僚텷䷎叵뎦䙲骅柠\ue54b菙폑⧕䷸ﮑ༹ﰘ\ue2f4蒪ᇒ韋\ufdc9\ue619꧳뱕鶐\uee9fᎬ꼳隩윐‱ⷷ⿲㥖떟梽Ꙑ么\uef88쩉筲䪋葁떏䋑떝뻇敭鈙聫\ude7f烮ㅈ靥Ծ弎⼠璘贑㘩迿ᣇ\ua95e퉹䨟쏍엙\uf328善탩긂\ueba7䣪\uf4e0륫跤흵猐媒\uf4e8配ꐡ铔\u0d99봛欄㧩༧\u200b絋珳퓻ᨿ妾걑굖퇾賙鿽뱶퀡풉ೃĄ彋ᆀ\ue56a꼁⸪䎤ڪ㳹Ꮴ㷜魋ନ碟죉뽅鳸怍凂儌ꊦꗓ⇧ྈ큑鹝ᕭ熶ೇⒹṗ瘼韰鑘ᅒ砙龄䢖̳둢蘭⯚῀ᴁ\uf16f\ueb25밗㿙릱멺뉕굂圲㴣ꍙ\uf679옵뢎䤪竟좢尠\uf44d\ue45e溈Ꞇ㆕⥬Ⴙ阴䫩울Кㄝ兩咣蕿\ud9d6᱔刢ꖺ\uf5aa츛将컨帅ࢵ坫哜ޕڲ캯ㇳ\ue423慾겗\ue294\ue789骜⁆\u1ccb⤊\u0b5b椥瘧役㢃懑啚᭣얏醷釯ㅞ⸶ꕓ勒၂ॱ\uf854\ue763䥎叜튭觴鏮ㅅ䕉彎趻脢殑砰ἠₜ\uee0c\ueddaﻋ塌\u1aff쑉\ua9da▂፱\ue0ae\ueed3罿퍘廊뽫읺ნ·㑰\uea15媋\udad1찕弌᧣ศ䦑歈笇㍂ດ\ud8c5籠ጾ齴盶쟉⚙ࡼ췔譚뷿唗\uf381웉\udde8\uf11d퐢묪⠌ɈԌ蓰\ueffe촍ⰵ폨륃뷞癦玴邠嚷츢⏪佡㊲\ue48a\uf3c8\ue9b3緫ꁪꪟ斜쵚路紴ᦏ䜏᳴뤟替轁遄굙넮Έ騾턜湾ꚶ嗋䟳ﰕ㍋\uf4dfⓛ\udd69ﻤ旞廉졄쁍겶魘左㟅饅阃좛㝄\ue614ዙ硑햝䝾㋶쁥\uf11d緁ﹴ\u10ce垈켈䠲㵖ꀸ䯼橫畍䩀쮤ﻱ朘\uf23a캢鮴ᩃ봂\ue989⏮\uf585刅\ud9db\u2d29笩鸴污㽢쎌↜穐୳ꛙ䫒\uea51쟜≀緆옐氖秞먮蔓퇾먉ᙿꐆ浴갞\udaff絛낉猷㟈钩翐妅夵⠚묖䞩稝幬ꖔ쯉檟휼㠹ꟙ\ue183\ud84a鋘塃ꗘꛗ郣樏\ue95d᷿ﻀ붚⠥海퐖┰⳾ꂘ\udf9cꉇ驸⋭諬怿\uded7떣騻圮ꢽ荁\uec4e됵嗷嵐ᑉꈄ◅說箿㏹ﴩܡ\udb5e﹛ᅋ쾾兎廓鄜鋝这軺攌Ⴙ兕룲ᘿ䀽艒豒ꭨળ됙鵭疸묅덫쌕⇦\ue50f꩐眀⥝퉿ਟ嵏㵀쬢\udf2dᮥ玟瘣곶ꚧ㩔ﰮ菣㧫哟\uf88a褠ჲ䅁篧퇾\ue2a8俎넝窥\uedf3⻇퓭Ͽ㘇嬸ꟸ⸻쌍朢㪺ဃ隑䱐撇럌쫉苉뙲焉ᱏ愦졘ꀐ뛻깧蟱適\ue64b멌䁬덹类ⴐ祫띥ˀ獤蒼榉ᰛཨ皐ᨩ쩻迋䱥욋哨﹑咣䕧귆ٟ쎕Ή暝\u09b3鏅㽩\uf761\ue0aa훐숺〮閟堑\uf03e㥛⮌䡟ꏲ鲠ߒ\ue268瀱픈冶쿼굏\udd10㸈쩉閇\ue26b毋녔욲∰庨ꎀ\uf03f鲔偏눖哟野㣗\uea0f\ue24f鎢\uf2f1ഐ円憟ɓ蔺䖣\uda33窨\uf034⏯⧅㟓텂俴︓\udf6fᣎ໎㶃\ue987ꬕ驐➭և\uf494眍\ue9dc\ueffd弡諀ȯ퍃悲縸鮍ၫ庩뇿胒ꬖ\ue05b\ud9f0뼃㜌∷礶⠸軓枌\uea81숰㲹\ud8c5Ჲ剕\ueab8䘫\ud832籡颿䝇\ue7e2攑ᗽ䒜爛棽趩乢脠頬\uf66b\uf369䴚\uaa3a茓桄抍돆尲嵥뉜樻禮ⰹԭ뤼쓾̩မ\uf640挻៲॥쇉ꥣ\uefd6䪙瞘⠕\ue542㡧闾徴띴뼇鰁쇦ᧂۄ㥗䭠郢墫笕䕥ͦ䃂饱䆏暑䩤갈פֿ㺞\uea40㠈✠\uf550⅛깳ﺿ\ue469㱦뚆踖墆鄂│畉⯑㏟刖ኑꝥ㌵ⴇᓩꮭҗ䢈\uda40陳ᱎ࣒诀峥\udc52틐舢ﯜၬ왚\uf1ff᷌㜷桍떌껿\ue1e9֢鯭럔쎸젻䊽睛蕏\uf674ṩ캛迊\uecfc\ue678\ud803튔\uef8c糴鳼ꐰᥥﴫ㩲䟂ࠛ\ud98a峑ƍ酸粹떗㝥̲픬ᑦ\uf1ff䇪腭蕨|鿖ꁾាⶆ\uef9b頯ૣ쾆纭间䏊颔쮛㽕陯渦몌촏쀲ࢱ\ue118҂\udf2d塚귀証匾챏錟ᆶ铧걱⅟쮯莟ݗ禝綾⢼\ue4ddꖏᵨ쮛႘㛕ⱑႜⰕ킒諕刴䜳壀퀄\ue414\ue93b괇\u20f7븿]偋덍⇠ણ䇕捆\uea33瞠ф雫惍赺㏁蟢幨\uecdbꊗ썞ࡺവ⺖\u200d㽱ᔯ녝\ue1d5潆\ua7ed职\uf5fc䨴᪥玲ᐵ삠\udaeb桤⪗‷\udb42袇\ud888⼼烕\ue05e곎笈⽪䫹㒼ꆰ⓵ࠡṓ庪ꊇꛊ᳘긅鹎䧫Є帾⳯㮿ㄏ캻撞㴣蔨璿\ue758槲⫘悑菔议㟳鋾쮋畒ᚹ昈嫊\uf8be쉢㦼⤉僗꠫\uedc3⠂㉮";
      short var12 = 27727;
      int var10 = 0;

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 229;
               case 1 -> 239;
               case 2 -> 142;
               case 3 -> 68;
               case 4 -> 92;
               case 5 -> 13;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIIII = var9;
      IIIIl = new Object[var9.length];
      int var21 = 0;
      int var24 = 0;
      llll = new int[513];
      byte[] var10002 = "Ö\u000e¾|\u0002å\u009cKVü\u0090WoÔ8\u0086E²£Ç\u0099N°\u0089\u009f.\nákº\u008d¨5\u009c¢!\u008f\fF\u0013å\u0002\u0010]J\u0083Î\u0010§Þêü8Øæ;\u009adò¼\u0014$\u0081öLå\u001bö»´\u00818\u0011:Í\\I^Az\u000e\u009b\\æÆj°\u000e\u0007ÇÓáÑ\u009có+×ÂZE@ãàÁDùÌ\\-ö]}_9ï%ù«]Ófµæ¯A\u009b\u0016L6üòáÇ\u0086tÃ\u0099{d\u0001òw\u00adÚZ SÚ\\ÔFS,Vó\u0086¥Ê\u0004Æ\rlD<\\Á\u008d\u0006\u0096?pÁ\u008c©P\u0000ê3\u008d<C6\u008d\u0003<g¥<ZËe\u009dÕLtÞ\u008c|:&\u0019\u0089Ì\u0096tèªÕ\u008eÀ©zÙ\u0085\rØlL\u0086´>Ñ¼\u000b{Tn´F±@F\u0098\u0084\"×Óm\u0086<\u001eE\u00ad\u0088\\\u0081\u008f\u0000\u0011\u001cÊÆOqe$ôO¾[ê\u001f\u008a¯âøq\u0080$nFäõÏ|vn\u009d\u000f\rSr \u009dO©uq\\w\\G\u008bÞ-ÑEýÒy{7µCãðHì\u008e%\u0018\u000e\u0006\u0096Ïi\u009fÜ£$¢7H\u0005û\u0018\u000bÃ{§a=¿¥P@\u0083ð\u0013f\u0099õÌó\u0096\u0011²g¸ÇÃ[\f\u008e|U³\u0007¬ló\u0093$g_\u009f+\u0086m\u000eh³ó\\K\u009eÁ\u000fî9\u001dªT¶ic 7q\u0084\u0091\u000eºày\u009a4ïÙ\\rné¨ÒÃàR¸=ÚÃ\u0088\u0006\u0012&\u009ccå*\u0092\u009bhr\u001fY\u0089<'/^*\u0002Ê\tôK=\u0091ý\u007f\u008e\u0007o\u00876©\u0088÷\u0012s í\u00ad\u0012¬äøuZ#Ûw-\u0017ADüÁ¿:\u0017ú\u0010%}Qvàjp\u0083\u008aA}\u0093|\u007f÷\u0017Z®ZÎ¬·ÏÒ0$t%õ+N\u0010\r#+¦þ\u0093\u008båY%áôwîY§gÞ:¨\u009aoNPI\u0010\u009dSþ\u008dy\bÑJ]\u009b\"xÀ;oFP\u000e¢Å|\u0093\u001aª\u001d?\u0089\u008a¼R%÷Ã\n8=TCÓµÀ\u008dâo.»9\u007fUz\u001b´u´ë)¿¯\u0003\t\bÅÚ5\u0018\u0099HG«\u0017å\tÄH\u009ez~Ï\nñí=¬ðGÐ)Â\u008d\u0004\u0011\u0003¼¥õ\u009f`±ÚjMó\u001fD\u009e$GÀ÷\boÔý®f\"ðNÊwUüÀ\b\u0013ª.a`mFjÁ=É\u0082{ZTk(âç\n0aLÊ}ÏºîW\u0081@C1°V»>ÂV\u0092\u0085\u0081÷\u0014\u009b¬¤¼Æù|\u008aoOà\u008f;¯îí\u00025µ\u0002\u0001\u0085]f\u0096ïÞô[:×Kÿ\u0095\b!ZÒ~áûR¨\u0098CÓÏ\u0083Ê\u0089<\\ÿ^AªÐÜíÈk>C¡Ê\u0014Ë\u000eUfÌ ð¨7w'å$\u000f\\ð±RÛ~à`\f/ØP\u00979¾)Þ¾àÀ-õÏV,Ã\u0090ïà&êk2ÇÜ\u0017\u0011æ\b\u001fØ0·WfO\u008a;Û\u0090íM\"\u001e34+\u0006\u0082\u0085\u0089¼ä¹¶%\u000e\u0091E±î¼\u0089«\u0081«ËÀ÷~cü?*Q\u0084À³\u0010´¹\u001cÇÃ RF\u001b\u0080 à\u009e±\u009eèOv»,øY\u0003·Ã+\u0092)\u0089Ú\u0086\u009f\u0000BÑñ!_ô`5¼L¹Ö\u001d´\tî\u000b(ÔO§ÛÕªøìwQÕÊ\u0093Nx¿\u0001b3\u0014)\u008f\u0082YìêÜÚI\u0085Tb &áËx\u0018>½ÅÏh(_A´ Õ\u008b·+Õ}^þ\u0010x!\u0010ê \u0082\u009cD\u000fQ\u0091-\u0092«Å¶ê¯\u008eïÞ\u0017¯\fN\u0082Ü\u0098Î<Þ0|\u0094hXv÷Ô\u0098Õ\u009c\u0080XÁe\u0094&¥\u0018\u0012ðøúXF8\u0099+\u0016Í½@°ÆäRL\u009f{É?\u0001\u009c\u000f\u0091,NZÝÆAµ\b æÆ\tB\u0098±w\u009aë#,©å·ùr\u0091\u008b&ä\u0007_¿\u008emë\u0015ê`e ã4Ãÿø:Q¼Pßi\tÚ\u0097UEú\u0012$\u0082ó¤\u0011p×Uídétkð\u009fpgî\u0018[|ìeï\u0012±àú¨\u0004·9ê\u009duÁB©\u0090â\rÀt¹I¾µÜÿp»G6*ã\u008eNkçôeÍ\u0091+À\u007f\u0007\u0084ià\u0085ùtt^\u008bY(\u0001áÈ\f\u0095»Sef-?+JÐÙ\u00981¦¥\u008aT\u009b%9¹}Íiê\u0092ÄäpC\u0014mZÊEiE\u0091?Õ*\u0007Øg\u008eªÐ¦nmPÔl0\u008a\u001e\u0017`\u00ad3^\u00adÆv'\u0006áÄÖ\bFñ¦h©A2(\u0005M^7\u0080³C³@\u0011*W:zYS¬î\u0091\u008c\u001d^\bl\u001b|k¡oLÍ\u0005üG°\u009a[§GÆûL\u008cÆ'gÉÖ\u000f\u001d\u008d\u000bê8h÷\"\u0088¢f/Ìe?Ã·ËØ'&²\u0091U]\u008aÐ\u0004ËVyÖêÏf¾Eº÷È«s#\u0016x\u0096\u0002|á§\u0010ó\u0095éÀK¤qóâ«Êg¬E\u0095;ÄR\u001a\t\u008d¿ür,\u001d\u0003\u008er-\u0006{\u0094A\u009dr¾ïAGfá4GØ}\u0091åý©¹\u0000\u0001*N\u0090Í(i·c\u0088\u0019`º]r&¥{°'G\u0098\u008b@*\u0081\u001fÛS)l.Æ \u000ei]KqþÞÅó§\u009bï\u0085ë¬\u0005\f2\u001fZü\u0093ØqÇ¹ýÿ66½ÔÆ\u0011Átä\tD\u0004\u000b¯/hóÆ\n;ßPÆ\t\u0080êØ\"(i%\u0011¯ÎènÉ\u0018ÉÂªÐ¨ËÇ\u0090\"N\u001c\u0091¾\u0018lK\u0000\u0099\u0081S¸\bÁ\u0098\u008f\u0093oÉ\u008e¹\tË®çWÕç)\u009c]Ò\u001ar7\u0085\u008f\u0098)¤y\u000f-\u0099¸;\u001dv~¼PxÙ¹AyÙ\u008e&\u008eÙÌkª`G\u001f'¸\u0099ô\u009d\u0010Ï\u001ep\u0091áÁO&É¾V!¾Úç\u0097zäs\u008aînÅ\u0002>Õ\u008f?Hx·Å\u0006G\u0080M±\bKÍÌÞ\u0016\u008bÉq\u0001T8ä;x\u000f\u0013ÿ'\u001d\u008eØ¿sÚ\u0095ë\u0016Ä3ÿÙ¡É±I,Ô0\u001c÷ñB¦\u0018)ßOåFbN\u008d½@hUã¿\u0007iè¸Ù'©\u0001d\u000b\u00839\u009c\bp6ñÆ.â´ \u0001\u008df\u008c0Á!2Ò±ýÈ4$UO\u001cßÕ+Æ)A\u0011©\\-*7\u0096äó÷ÅÆ¡«ô°í\u009d´´\u008aIBª\u009cõM¡Øf¢òõmF»?ù\u0082q#&òÑAJ0u\u008b+(q¶È\u0016f;J\u0000\t\u0080bÌ¥É\u0085$\u009a\u008e>\u0097Ñ¬\u0081r+v\u001bö9Ç\u0010â\u001crï_n5-½\u008d\u0097+0#\u000b¨(Ð\u0003oË¿ß\u007fky1 â·uØ°u@$@ãd|ø\u0017ØP\u001d0cÆó\u0019ó[`_Î\u008f\u0080±¾Ý\u008b\u000f\u001chk§\u0085hU,|v·\u001bR¹Xúìy¥3\u001f\\©è\u00023=Ïø§\u0016W£¸3\u0016\u0004^G\u0007îô\u007f¶\n_\u0095\u0010¦\u0000)î@\u0006tëB\u008d\u0089\u0086\u0007ø?\u0016\u0083Ñ\u0087Æ\u007f0Í)ýÌ\u0091eD§AÄË\u0014\u001d\u009b\u008fÛÂ$Îµ £Zê\u0086·Q¬«ðW$t\u0002'¸\u008f%\u0097Õ\u0081e\u0000Ì\u0000\r\r,»n\u001e@ý¸[§·£\u0087é&Çj\u001a\u0090OÏ\f\u0098\f\u009eÔ\u0093$C×\u0011\u0002Õgu½/üüñ\u0099lÛØl\u0016"
         .getBytes("ISO-8859-1");

      int var55;
      do {
         llll[var21] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ 1040896379;
         var21 += 1;
         var55 = var24 + 4;
         var24 += 4;
      } while (var55 < var10002.length);

      String[] var5 = new String[IlIlII(763349683, var17 ^ -707592885)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IlIlIl(var17 ^ 1131593947, '㌄', (short)19961)).length();
      int var1 = IlIlII(763349680, var17 ^ -1349115725);
      int var19 = -1;

      label102:
      while (true) {
         var21 = IlIlII(763349681, var17 ^ -1972118347);
         String var27 = var2.substring(++var19, var19 + var1);
         byte var39 = -1;

         while (true) {
            label97: {
               char[] var57 = var27.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var21;
               var44 = var57;
               var24 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               } else {
                  var55 = var21;
                  var24 = var69;
                  if (var69 <= var6) {
                     break label97;
                  }

                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % IlIlII(763349685, var17 ^ -1800845954)) {
                     case 0 -> IlIlII(763349674, var17 ^ -275645543);
                     case 1 -> IlIlII(763349675, var17 ^ 2035110564);
                     case 2 -> IlIlII(763349672, var17 ^ 1490308390);
                     case 3 -> IlIlII(763349673, var17 ^ -140387259);
                     case 4 -> IlIlII(763349678, var17 ^ 426309414);
                     case 5 -> IlIlII(763349679, var17 ^ -896718511);
                     default -> IlIlII(763349676, var17 ^ 1404880092);
                  });
                  var6++;
                  if (var55 == 0) {
                     var88 = var55;
                     var81 = var44;
                     var69 = var55;
                  } else {
                     if (var24 <= var6) {
                        break;
                     }

                     var81 = var44;
                     var69 = var55;
                     var88 = var6;
                  }
               }
            }

            String var62 = new String(var44).intern();
            switch (var39) {
               case 0:
                  var5[var3++] = var62;
                  if ((var19 += var1) >= var4) {
                     Ill = var5;
                     IIII = new String[IlIlII(763349684, var17 ^ 97579876)];
                     l = new String[IlIlII(763349677, var17 ^ 670231313)];
                     IIIIIl();
                     lIIl = new Matrix4f();
                     II = new Vector4f();
                     lllI = IIlIll(IlIIllIII.lI(l[4]), IlIIllIII.lI(l[IlIlII(763349666, var17 ^ 376055769)]), 1);
                     IIlI = IIlIll(IlIIllIII.lI(l[4]), IlIIllIII.lI(l[IlIlII(763349667, var17 ^ 433173390)]), 0);
                     llI = IIlIll(IlIIllIII.lI(l[4]), IlIIllIII.lI(l[IlIlII(763349664, var17 ^ -141627421)]), 0);
                     llIl = IIlIll(IlIIllIII.lI(l[4]), IlIIllIII.lI(l[IlIlII(763349665, var17 ^ -536748623)]), 0);
                     lIlI = IIlIll(IlIIllIII.lI(l[4]), IlIIllIII.lI(l[IlIlII(763349670, var17 ^ 233285123)]), 0);
                     III = IIlIll(IlIIllIII.lI(l[4]), IlIIllIII.lI(l[IlIlII(763349671, var17 ^ -1357358502)]), 0);
                     Il = IIlIll(IlIIllIII.lI(l[4]), IlIIllIII.lI(l[IlIlII(763349668, var17 ^ -1625444434)]), 0);
                     I = IIlIll(IlIIllIII.lI(l[4]), IlIIllIII.lI(l[IlIlII(763349669, var17 ^ -209279360)]), 0);
                     IIl = IIlIll(IlIIllIII.lI(l[4]), IlIIllIII.lI(l[5]), 1);
                     IlI = IIlIll(IlIIllIII.lI(l[4]), IlIIllIII.lI(l[IlIlII(763349658, var17 ^ 1566217081)]), 1);
                     IIIl = IIlIll(IlIIllIII.lI(l[IlIlII(763349659, var17 ^ 1395626949)]), IlIIllIII.lI(l[IlIlII(763349656, var17 ^ -813026835)]), 0);
                     lIll = llIl(IlIIllIII.lI(l[IlIlII(763349657, var17 ^ 463655966)]), IlIIllIII.lI(l[IlIlII(763349662, var17 ^ -1739242273)]), 2);
                     lll = llIl(IlIIllIII.lI(l[IlIlII(763349663, var17 ^ -1703779474)]), IlIIllIII.lI(l[IlIlII(763349660, var17 ^ 973255848)]), 0);
                     lIl = llIII();
                     lII = lIllI(IlIIllIII.lI(l[3]), IlIIllIII.lI(l[IlIlII(763349661, var17 ^ -278269261)]));
                     lI = lIllI(IlIIllIII.lI(l[3]), IlIIllIII.lI(l[IlIlII(763349650, var17 ^ -911477942)]));
                     ll = lIllI(IlIIllIII.lI(l[IlIlII(763349651, var17 ^ 714118181)]), IlIIllIII.lI(l[2]));
                     Illl = IIllII();
                     IlIl = class_1921.method_75940(
                        IlIIllIII.lI(l[IlIlII(763349648, var17 ^ 855904064)]),
                        class_12247.method_75927(
                              RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
                                 .withLocation(IlIIllIII.lI(l[IlIlII(763349649, var17 ^ -1686698588)]))
                                 .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                                 .withDepthWrite(false)
                                 .build()
                           )
                           .method_75930(class_12245.field_63976)
                           .method_75931(class_12246.field_63983)
                           .method_75938()
                     );
                     lIII = class_1921.method_75940(
                        IlIIllIII.lI(l[IlIlII(763349654, var17 ^ -1844069050)]),
                        class_12247.method_75927(
                              RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
                                 .withLocation(IlIIllIII.lI(l[IlIlII(763349655, var17 ^ -110482709)]))
                                 .withDepthWrite(false)
                                 .build()
                           )
                           .method_75930(class_12245.field_63976)
                           .method_75938()
                     );
                     IlII = class_1921.method_75940(
                        IlIIllIII.lI(l[IlIlII(763349652, var17 ^ 2011729151)]),
                        class_12247.method_75927(
                              RenderPipeline.builder(new Snippet[]{class_10799.field_56859})
                                 .withLocation(IlIIllIII.lI(l[IlIlII(763349653, var17 ^ 1570652083)]))
                                 .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                                 .withDepthWrite(false)
                                 .build()
                           )
                           .method_75930(class_12245.field_63976)
                           .method_75938()
                     );
                     IllI = class_1921.method_75940(
                        IlIIllIII.lI(l[IlIlII(763349642, var17 ^ -1223170539)]),
                        class_12247.method_75927(
                              RenderPipeline.builder(new Snippet[]{class_10799.field_56860})
                                 .withLocation(IlIIllIII.lI(l[IlIlII(763349643, var17 ^ -387495977)]))
                                 .withCull(false)
                                 .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                                 .withDepthWrite(false)
                                 .build()
                           )
                           .method_75937()
                           .method_75930(class_12245.field_63976)
                           .method_75938()
                     );
                     IIll = 1.0F;
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var62;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label102;
                  }

                  var4 = (var2 = IlIlIl(var17 ^ 1100726094, '㌅', (short)17708)).length();
                  var1 = IlIlII(763349686, var17 ^ 985222496);
                  var19 = -1;
            }

            var21 = IlIlII(763349687, var17 ^ 2122192020);
            var27 = var2.substring(++var19, var19 + var1);
            var39 = 0;
         }
      }
   }

   private static Object lIllI(String var0, String var1) {
      try {
         Class var2 = Class.forName(var0);
         Field var3 = var2.getDeclaredField(var1);
         var3.setAccessible(true);
         return var3.get(null);
      } catch (ReflectiveOperationException var4) {
         return null;
      }
   }

   public static boolean lIlll(class_310 var0, class_1657 var1) {
      if (var0 == null || var0.field_1724 == null || var0.field_1687 == null || var1 == null || var1 == var0.field_1724) {
         return false;
      } else if (!var1.method_5805() || var1.method_7325()) {
         return false;
      } else {
         return IIlllIlll.II(var1) ? false : !IIIlIlll.I(var1);
      }
   }

   private static Method llIII() {
      Method var0 = IIlIll(IlIIllIII.lI(l[IlIlII(763349972, -975118416 ^ -353180091)]), IlIIllIII.lI(l[IlIlII(763349973, -975118416 ^ -1939986718)]), 1);
      if (var0 == null) {
         var0 = IIlIll(IlIIllIII.lI(l[IlIlII(763349962, -975118416 ^ 64567225)]), IlIIllIII.lI(l[IlIlII(763349963, -975118416 ^ 1525250370)]), 1);
      }

      return var0;
   }

   private static void llIIl(class_4588 var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, float var7, Color var8, double var9) {
      float var11 = var8.getRed() / 255.0F;
      float var12 = var8.getGreen() / 255.0F;
      float var13 = var8.getBlue() / 255.0F;
      float var14 = Il(var9) / 255.0F;
      var0.method_22918(var1, var2, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var3, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var3, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var2, var3, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var4).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var6, var7).method_22915(var11, var12, var13, var14);
      var0.method_22918(var1, var5, var3, var7).method_22915(var11, var12, var13, var14);
   }

   public static void llIlI(lIIlIl var0, Matrix4f var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      int var19 = -859968612;
      int var8 = var6 >>> IlIlII(763349960, var19 ^ -968801120) & IlIlII(763349961, var19 ^ -1423909379);
      int var9 = var7 >>> IlIlII(763349966, var19 ^ 1359487306) & IlIlII(763349967, var19 ^ 105741046);
      if (IIIIII(var0) && var1 != null && (var8 > 0 || var9 > 0) && !(var4 <= var2) && !(var5 <= var3)) {
         float var10 = (var6 >> IlIlII(763349964, var19 ^ -1283191154) & IlIlII(763349965, var19 ^ -518403289)) / 255.0F;
         float var11 = (var6 >> IlIlII(763349954, var19 ^ -1533221224) & IlIlII(763349955, var19 ^ -1720109212)) / 255.0F;
         float var12 = (var6 & IlIlII(763349952, var19 ^ 1196185078)) / 255.0F;
         float var13 = var8 / 255.0F;
         float var14 = (var7 >> IlIlII(763349953, var19 ^ 212143627) & IlIlII(763349958, var19 ^ -1047668049)) / 255.0F;
         float var15 = (var7 >> IlIlII(763349959, var19 ^ -2092366039) & IlIlII(763349956, var19 ^ -824918557)) / 255.0F;
         float var16 = (var7 & IlIlII(763349957, var19 ^ -1866919424)) / 255.0F;
         float var17 = var9 / 255.0F;
         class_4588 var18 = lIl(var0).method_73477(class_12249.method_76023());
         var18.method_22918(var1, var2, var3, 0.0F).method_22915(var10, var11, var12, var13);
         var18.method_22918(var1, var2, var5, 0.0F).method_22915(var14, var15, var16, var17);
         var18.method_22918(var1, var4, var5, 0.0F).method_22915(var14, var15, var16, var17);
         var18.method_22918(var1, var4, var3, 0.0F).method_22915(var10, var11, var12, var13);
      }
   }

   public static void llIll(lIIlIl var0, Matrix4f var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      int var15 = -586443355;
      int var8 = var7 >>> IlIlII(763349946, var15 ^ 976308262) & IlIlII(763349947, var15 ^ 610370508);
      if (IIIIII(var0) && var1 != null && var8 > 0 && !(var4 <= 0.0F) && !(var5 <= 0.0F)) {
         float var9 = Ill(var4, var5, var6);
         if (var9 <= 0.01F) {
            lIlI(var0, var1, var2, var3, var2 + var4, var3 + var5, var7);
         } else {
            float var10 = (var7 >> IlIlII(763349944, var15 ^ 747014135) & IlIlII(763349945, var15 ^ -368029819)) / 255.0F;
            float var11 = (var7 >> IlIlII(763349950, var15 ^ 1001490975) & IlIlII(763349951, var15 ^ -1595734422)) / 255.0F;
            float var12 = (var7 & IlIlII(763349948, var15 ^ -1660147207)) / 255.0F;
            float var13 = var8 / 255.0F;
            class_4588 var14 = lIl(var0).method_73477(class_12249.method_76023());
            IIlll(var14, var1, var2, var3, var4, var5, var9, var10, var11, var12, var13, var10, var11, var12, var13);
         }
      }
   }

   public static <T> void lllII(
      lIIlIl var0, Iterable<? extends Iterable<T>> var1, Function<T, class_2338> var2, Function<T, Color> var3, ToDoubleFunction<T> var4
   ) {
      if (IIIIII(var0)) {
         class_243 var5 = Illll(var0);
         Matrix4f var6 = var0.I().method_23760().method_23761();
         class_4588 var7 = lIl(var0).method_73477(class_12249.method_76023());

         for (Iterable var9 : var1) {
            for (Object var11 : var9) {
               class_2338 var12 = (class_2338)var2.apply(var11);
               Color var13 = (Color)var3.apply(var11);
               float var14 = 0.06F;
               float var15 = (float)(var12.method_10263() - var5.field_1352) + var14;
               float var16 = (float)(var12.method_10264() - var5.field_1351) + 0.02F;
               float var17 = (float)(var12.method_10260() - var5.field_1350) + var14;
               float var18 = (float)(var12.method_10263() - var5.field_1352 + 1.0) - var14;
               float var19 = (float)(var12.method_10260() - var5.field_1350 + 1.0) - var14;
               I(var7, var6, var15, var16, var17, var18, var19, var13, var4.applyAsDouble(var11));
            }
         }
      }
   }

   private static void lllIl(lIIlIl var0, class_238 var1, Color var2, double var3, float var5) {
      lIlIl(var5, IlIII::IIllI);
      IlII(var0);
   }

   private static String llllI(int var0, int var1) {
      int var9 = -1886228599;
      int var2 = (var0 ^ IlIlII(763349949, var9 ^ -749821149)) & IlIlII(763349938, var9 ^ -1064218623);
      if (IIII[var2] == null) {
         char[] var3 = Ill[var2].toCharArray();

         int var4 = switch (var3[0] & IlIlII(763349939, var9 ^ 389668502)) {
            case 0 -> IlIlII(763349936, var9 ^ -652598938);
            case 1 -> IlIlII(763349937, var9 ^ -405780530);
            case 2 -> IlIlII(763349942, var9 ^ 2132261838);
            case 3 -> IlIlII(763349943, var9 ^ 314764133);
            case 4 -> IlIlII(763349940, var9 ^ -1703854655);
            case 5 -> IlIlII(763349941, var9 ^ 54219183);
            case 6 -> IlIlII(763349930, var9 ^ 1053836369);
            case 7 -> IlIlII(763349931, var9 ^ 1744766872);
            case 8 -> IlIlII(763349928, var9 ^ -415198522);
            case 9 -> IlIlII(763349929, var9 ^ 591569768);
            case 10 -> IlIlII(763349934, var9 ^ 521658861);
            case 11 -> IlIlII(763349935, var9 ^ 85081914);
            case 12 -> IlIlII(763349932, var9 ^ 183910749);
            case 13 -> IlIlII(763349933, var9 ^ 606089370);
            case 14 -> IlIlII(763349922, var9 ^ -1872130343);
            case 15 -> IlIlII(763349923, var9 ^ 803233486);
            case 16 -> IlIlII(763349920, var9 ^ 1869928170);
            case 17 -> IlIlII(763349921, var9 ^ -1015490268);
            case 18 -> IlIlII(763349926, var9 ^ -236348455);
            case 19 -> IlIlII(763349927, var9 ^ 1874544592);
            case 20 -> IlIlII(763349924, var9 ^ 1575492791);
            case 21 -> IlIlII(763349925, var9 ^ -2125617647);
            case 22 -> IlIlII(763349914, var9 ^ -175877258);
            case 23 -> IlIlII(763349915, var9 ^ -312253868);
            case 24 -> IlIlII(763349912, var9 ^ 638028642);
            case 25 -> IlIlII(763349913, var9 ^ -1475859502);
            case 26 -> IlIlII(763349918, var9 ^ -293004618);
            case 27 -> IlIlII(763349919, var9 ^ 1310987143);
            case 28 -> IlIlII(763349916, var9 ^ 618277294);
            case 29 -> IlIlII(763349917, var9 ^ 350347561);
            case 30 -> IlIlII(763349906, var9 ^ 8656608);
            case 31 -> 5;
            case 32 -> IlIlII(763349907, var9 ^ 243047250);
            case 33 -> IlIlII(763349904, var9 ^ -2084668704);
            case 34 -> IlIlII(763349905, var9 ^ -1144476174);
            case 35 -> IlIlII(763349910, var9 ^ -1641153727);
            case 36 -> IlIlII(763349911, var9 ^ -673553745);
            case 37 -> IlIlII(763349908, var9 ^ -479595376);
            case 38 -> IlIlII(763349909, var9 ^ 466705210);
            case 39 -> IlIlII(763349898, var9 ^ 1811251401);
            case 40 -> IlIlII(763349899, var9 ^ 1900732811);
            case 41 -> IlIlII(763349896, var9 ^ 2015332024);
            case 42 -> IlIlII(763349897, var9 ^ -1086553062);
            case 43 -> IlIlII(763349902, var9 ^ -1952008200);
            case 44 -> IlIlII(763349903, var9 ^ 1566099619);
            case 45 -> IlIlII(763349900, var9 ^ 1727518667);
            case 46 -> IlIlII(763349901, var9 ^ -846130294);
            case 47 -> IlIlII(763349890, var9 ^ -328959634);
            case 48 -> IlIlII(763349891, var9 ^ -512454863);
            case 49 -> IlIlII(763349888, var9 ^ 1810933809);
            case 50 -> IlIlII(763349889, var9 ^ -970366990);
            case 51 -> IlIlII(763349894, var9 ^ 1396032475);
            case 52 -> IlIlII(763349895, var9 ^ -389937423);
            case 53 -> IlIlII(763349892, var9 ^ -755499076);
            case 54 -> IlIlII(763349893, var9 ^ -1220473529);
            case 55 -> IlIlII(763349882, var9 ^ 386050700);
            case 56 -> IlIlII(763349883, var9 ^ 2098431052);
            case 57 -> IlIlII(763349880, var9 ^ -985623448);
            case 58 -> IlIlII(763349881, var9 ^ -1504745417);
            case 59 -> IlIlII(763349886, var9 ^ -759711040);
            case 60 -> IlIlII(763349887, var9 ^ 28577210);
            case 61 -> IlIlII(763349884, var9 ^ -437312786);
            case 62 -> IlIlII(763349885, var9 ^ -1048784498);
            case 63 -> IlIlII(763349874, var9 ^ 1557961868);
            case 64 -> IlIlII(763349875, var9 ^ -857124396);
            case 65 -> IlIlII(763349872, var9 ^ -529209109);
            case 66 -> IlIlII(763349873, var9 ^ -2116518921);
            case 67 -> IlIlII(763349878, var9 ^ 548788150);
            case 68 -> IlIlII(763349879, var9 ^ 1609419715);
            case 69 -> IlIlII(763349876, var9 ^ -928719062);
            case 70 -> IlIlII(763349877, var9 ^ 1550455141);
            case 71 -> IlIlII(763349866, var9 ^ -1302541542);
            case 72 -> IlIlII(763349867, var9 ^ -912397827);
            case 73 -> IlIlII(763349864, var9 ^ -380430137);
            case 74 -> IlIlII(763349865, var9 ^ 591982644);
            case 75 -> IlIlII(763349870, var9 ^ -1809700798);
            case 76 -> IlIlII(763349871, var9 ^ -2072069205);
            case 77 -> IlIlII(763349868, var9 ^ 938535309);
            case 78 -> IlIlII(763349869, var9 ^ 1487891959);
            case 79 -> IlIlII(763349858, var9 ^ -500631294);
            case 80 -> IlIlII(763349859, var9 ^ 1910136469);
            case 81 -> IlIlII(763349856, var9 ^ -617096666);
            case 82 -> IlIlII(763349857, var9 ^ 300147416);
            case 83 -> IlIlII(763349862, var9 ^ 541198002);
            case 84 -> IlIlII(763349863, var9 ^ -61462498);
            case 85 -> IlIlII(763349860, var9 ^ -787213349);
            case 86 -> IlIlII(763349861, var9 ^ 46380151);
            case 87 -> IlIlII(763349850, var9 ^ 1810865547);
            case 88 -> IlIlII(763349851, var9 ^ 1632212460);
            case 89 -> IlIlII(763349848, var9 ^ 1823029744);
            case 90 -> IlIlII(763349849, var9 ^ -920964348);
            case 91 -> IlIlII(763349854, var9 ^ -1890722406);
            case 92 -> IlIlII(763349855, var9 ^ -58018411);
            case 93 -> IlIlII(763349852, var9 ^ 1574583232);
            case 94 -> 3;
            case 95 -> IlIlII(763349853, var9 ^ -407001095);
            case 96 -> IlIlII(763349842, var9 ^ -1274680424);
            case 97 -> IlIlII(763349843, var9 ^ -1400455536);
            case 98 -> IlIlII(763349840, var9 ^ -517453340);
            case 99 -> IlIlII(763349841, var9 ^ -882461768);
            case 100 -> IlIlII(763349846, var9 ^ -1386764919);
            case 101 -> IlIlII(763349847, var9 ^ -1574591288);
            case 102 -> 1;
            case 103 -> IlIlII(763349844, var9 ^ 426116100);
            case 104 -> IlIlII(763349845, var9 ^ 122398723);
            case 105 -> IlIlII(763349834, var9 ^ 1511952225);
            case 106 -> IlIlII(763349835, var9 ^ -207088940);
            case 107 -> IlIlII(763349832, var9 ^ -1488446096);
            case 108 -> IlIlII(763349833, var9 ^ -1630386472);
            case 109 -> IlIlII(763349838, var9 ^ -1654500924);
            case 110 -> IlIlII(763349839, var9 ^ 168307891);
            case 111 -> IlIlII(763349836, var9 ^ -941808527);
            case 112 -> IlIlII(763349837, var9 ^ 1668479985);
            case 113 -> IlIlII(763349826, var9 ^ -969569147);
            case 114 -> IlIlII(763349827, var9 ^ 1739938685);
            case 115 -> IlIlII(763349824, var9 ^ -550224393);
            case 116 -> IlIlII(763349825, var9 ^ 1450062072);
            case 117 -> IlIlII(763349830, var9 ^ 1673088258);
            case 118 -> IlIlII(763349831, var9 ^ 1278942776);
            case 119 -> IlIlII(763349828, var9 ^ -136728414);
            case 120 -> IlIlII(763349829, var9 ^ 1458780355);
            case 121 -> IlIlII(763349818, var9 ^ -914276527);
            case 122 -> IlIlII(763349819, var9 ^ 1817166897);
            case 123 -> IlIlII(763349816, var9 ^ -1157441656);
            case 124 -> IlIlII(763349817, var9 ^ -1072217278);
            case 125 -> IlIlII(763349822, var9 ^ 1201214440);
            case 126 -> IlIlII(763349823, var9 ^ -1865886584);
            case 127 -> IlIlII(763349820, var9 ^ 199118220);
            case 128 -> IlIlII(763349821, var9 ^ 1113133768);
            case 129 -> IlIlII(763349810, var9 ^ -1324170343);
            case 130 -> IlIlII(763349811, var9 ^ -1339792549);
            case 131 -> IlIlII(763349808, var9 ^ 2093029847);
            case 132 -> IlIlII(763349809, var9 ^ -1373622290);
            case 133 -> IlIlII(763349814, var9 ^ -1929249970);
            case 134 -> IlIlII(763349815, var9 ^ 1154958698);
            case 135 -> IlIlII(763349812, var9 ^ -89622489);
            case 136 -> IlIlII(763349813, var9 ^ 1198988977);
            case 137 -> IlIlII(763349802, var9 ^ -1090928521);
            case 138 -> IlIlII(763349803, var9 ^ -1209962222);
            case 139 -> IlIlII(763349800, var9 ^ 358291116);
            case 140 -> IlIlII(763349801, var9 ^ 717421947);
            case 141 -> IlIlII(763349806, var9 ^ -648617354);
            case 142 -> IlIlII(763349807, var9 ^ 357331480);
            case 143 -> IlIlII(763349804, var9 ^ 1462174971);
            case 144 -> IlIlII(763349805, var9 ^ -14955395);
            case 145 -> IlIlII(763349794, var9 ^ -849136667);
            case 146 -> IlIlII(763349795, var9 ^ -1940698385);
            case 147 -> IlIlII(763349792, var9 ^ 1529107202);
            case 148 -> IlIlII(763349793, var9 ^ -620989447);
            case 149 -> IlIlII(763349798, var9 ^ 2088321962);
            case 150 -> IlIlII(763349799, var9 ^ 1957201390);
            case 151 -> IlIlII(763349796, var9 ^ -1340123685);
            case 152 -> IlIlII(763349797, var9 ^ 723835121);
            case 153 -> IlIlII(763349786, var9 ^ -1251071738);
            case 154 -> IlIlII(763349787, var9 ^ 65515750);
            case 155 -> IlIlII(763349784, var9 ^ 1841736892);
            case 156 -> IlIlII(763349785, var9 ^ -53326028);
            case 157 -> IlIlII(763349790, var9 ^ 624029220);
            case 158 -> IlIlII(763349791, var9 ^ -1794508682);
            case 159 -> IlIlII(763349788, var9 ^ 1218991601);
            case 160 -> IlIlII(763349789, var9 ^ 1229785958);
            case 161 -> IlIlII(763349778, var9 ^ -340338373);
            case 162 -> IlIlII(763349779, var9 ^ 262769650);
            case 163 -> IlIlII(763349776, var9 ^ -1652178673);
            case 164 -> IlIlII(763349777, var9 ^ -1251446329);
            case 165 -> IlIlII(763349782, var9 ^ 1879912341);
            case 166 -> IlIlII(763349783, var9 ^ -714954773);
            case 167 -> IlIlII(763349780, var9 ^ -1128197621);
            case 168 -> 2;
            case 169 -> IlIlII(763349781, var9 ^ -452997993);
            case 170 -> IlIlII(763349770, var9 ^ 1495833126);
            case 171 -> IlIlII(763349771, var9 ^ -1012513091);
            case 172 -> IlIlII(763349768, var9 ^ 1231832293);
            case 173 -> IlIlII(763349769, var9 ^ 1234873683);
            case 174 -> IlIlII(763349774, var9 ^ -1935682898);
            case 175 -> IlIlII(763349775, var9 ^ 1992782280);
            case 176 -> IlIlII(763349772, var9 ^ -655842432);
            case 177 -> IlIlII(763349773, var9 ^ -1317709665);
            case 178 -> IlIlII(763349762, var9 ^ 705518638);
            case 179 -> IlIlII(763349763, var9 ^ 1933122378);
            case 180 -> IlIlII(763349760, var9 ^ -1867943634);
            case 181 -> IlIlII(763349761, var9 ^ 69848773);
            case 182 -> IlIlII(763349766, var9 ^ -1399101680);
            case 183 -> IlIlII(763349767, var9 ^ -997129096);
            case 184 -> IlIlII(763349764, var9 ^ 70422629);
            case 185 -> IlIlII(763349765, var9 ^ -1004115608);
            case 186 -> IlIlII(763349754, var9 ^ -1170019331);
            case 187 -> IlIlII(763349755, var9 ^ 1813973106);
            case 188 -> IlIlII(763349752, var9 ^ -622892332);
            case 189 -> IlIlII(763349753, var9 ^ -1976938823);
            case 190 -> IlIlII(763349758, var9 ^ 740365947);
            case 191 -> IlIlII(763349759, var9 ^ -797406911);
            case 192 -> IlIlII(763349756, var9 ^ -1545170676);
            case 193 -> IlIlII(763349757, var9 ^ 231424837);
            case 194 -> IlIlII(763349746, var9 ^ 1092727569);
            case 195 -> IlIlII(763349747, var9 ^ -1807225894);
            case 196 -> IlIlII(763349744, var9 ^ -1784321191);
            case 197 -> IlIlII(763349745, var9 ^ -344123143);
            case 198 -> IlIlII(763349750, var9 ^ -1337059727);
            case 199 -> 4;
            case 200 -> IlIlII(763349751, var9 ^ 1704289160);
            case 201 -> IlIlII(763349748, var9 ^ -1174145776);
            case 202 -> IlIlII(763349749, var9 ^ 594124651);
            case 203 -> IlIlII(763349738, var9 ^ -1995599279);
            case 204 -> IlIlII(763349739, var9 ^ 1006946046);
            case 205 -> IlIlII(763349736, var9 ^ 1663027624);
            case 206 -> IlIlII(763349737, var9 ^ 548875594);
            case 207 -> IlIlII(763349742, var9 ^ -1791138311);
            case 208 -> IlIlII(763349743, var9 ^ -652353514);
            case 209 -> IlIlII(763349740, var9 ^ 504649310);
            case 210 -> IlIlII(763349741, var9 ^ -332355771);
            case 211 -> IlIlII(763349730, var9 ^ -133265491);
            case 212 -> IlIlII(763349731, var9 ^ 1819837129);
            case 213 -> IlIlII(763349728, var9 ^ 1929357575);
            case 214 -> IlIlII(763349729, var9 ^ 1887575471);
            case 215 -> IlIlII(763349734, var9 ^ 755435763);
            case 216 -> IlIlII(763349735, var9 ^ -1739535810);
            case 217 -> IlIlII(763349732, var9 ^ 26358723);
            case 218 -> IlIlII(763349733, var9 ^ 896995407);
            case 219 -> IlIlII(763349722, var9 ^ 1553156876);
            case 220 -> IlIlII(763349723, var9 ^ 575811357);
            case 221 -> IlIlII(763349720, var9 ^ -329468602);
            case 222 -> IlIlII(763349721, var9 ^ -1241219860);
            case 223 -> IlIlII(763349726, var9 ^ -150993015);
            case 224 -> IlIlII(763349727, var9 ^ 1366743462);
            case 225 -> IlIlII(763349724, var9 ^ -471828747);
            case 226 -> IlIlII(763349725, var9 ^ 2086800243);
            case 227 -> IlIlII(763349714, var9 ^ -390498021);
            case 228 -> IlIlII(763349715, var9 ^ -1259990052);
            case 229 -> IlIlII(763349712, var9 ^ -1871558351);
            case 230 -> IlIlII(763349713, var9 ^ -108929103);
            case 231 -> IlIlII(763349718, var9 ^ -1213390149);
            case 232 -> IlIlII(763349719, var9 ^ 81155271);
            case 233 -> IlIlII(763349716, var9 ^ 380856729);
            case 234 -> IlIlII(763349717, var9 ^ -1520529578);
            case 235 -> 0;
            case 236 -> IlIlII(763349706, var9 ^ -183672543);
            case 237 -> IlIlII(763349707, var9 ^ 2023207324);
            case 238 -> IlIlII(763349704, var9 ^ -239257373);
            case 239 -> IlIlII(763349705, var9 ^ -173907077);
            case 240 -> IlIlII(763349710, var9 ^ 1238234158);
            case 241 -> IlIlII(763349711, var9 ^ -76981999);
            case 242 -> IlIlII(763349708, var9 ^ 982097596);
            case 243 -> IlIlII(763349709, var9 ^ 1217118741);
            case 244 -> IlIlII(763349698, var9 ^ -2098163027);
            case 245 -> IlIlII(763349699, var9 ^ -1346805910);
            case 246 -> IlIlII(763349696, var9 ^ -356453232);
            case 247 -> IlIlII(763349697, var9 ^ 1479670274);
            case 248 -> IlIlII(763349702, var9 ^ 1833015836);
            case 249 -> IlIlII(763349703, var9 ^ -573187443);
            case 250 -> IlIlII(763349700, var9 ^ -776354340);
            case 251 -> IlIlII(763349701, var9 ^ 799293940);
            case 252 -> IlIlII(763349690, var9 ^ -1915902828);
            case 253 -> IlIlII(763349691, var9 ^ -423714411);
            case 254 -> IlIlII(763349688, var9 ^ 1920368968);
            default -> IlIlII(763349689, var9 ^ -1024483618);
         };
         int var5 = (var1 & IlIlII(763349694, var9 ^ -527674587)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IlIlII(763349695, var9 ^ -802486089)) >>> IlIlII(763349692, var9 ^ -615016676)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IlIlII(763349693, var9 ^ 1000354994);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IlIlII(763349682, var9 ^ -798280607);
            }
         }

         IIII[var2] = new String(var3).intern();
      }

      return IIII[var2];
   }

   public static boolean lllll(class_310 var0, class_1297 var1) {
      if (var0 == null || var0.field_1724 == null || var0.field_1687 == null || var1 == null || var1 == var0.field_1724) {
         return false;
      } else {
         return var1 instanceof class_1657 var2 ? lIlll(var0, var2) : var1.method_5805() && !var1.method_7325();
      }
   }

   public static boolean IIIIII(Object var0) {
      if (var0 instanceof lIIlIl var2) {
         return var2 != null && var2.I() != null;
      } else {
         return !(var0 instanceof WorldRenderContext var1) ? false : var1 != null && var1.matrices() != null;
      }
   }

   private static void IIIIIl() {
      int var0 = 1037632275;
      l[0] = IllIl(llllI(IlIlII(763349640, var0 ^ 1600848401), IlIlII(763349641, var0 ^ -778391023)).toCharArray(), 29858L, IlIlII(763349646, var0 ^ 670677366));
      l[1] = IllIl(llllI(IlIlII(763349647, var0 ^ 1514713766), IlIlII(763349644, var0 ^ 715624076)).toCharArray(), 33803L, IlIlII(763349645, var0 ^ 1534522009));
      l[2] = IllIl(llllI(IlIlII(763349634, var0 ^ 359918397), IlIlII(763349635, var0 ^ 657248152)).toCharArray(), 91313L, IlIlII(763349632, var0 ^ -308040935));
      l[3] = IllIl(
         llllI(IlIlII(763349633, var0 ^ 1057191177), IlIlII(763349638, var0 ^ 1080406411)).toCharArray(), 72211L, IlIlII(763349639, var0 ^ 1411423395)
      );
      l[4] = IllIl(
         llllI(IlIlII(763349636, var0 ^ -445961250), IlIlII(763349637, var0 ^ -1622179387)).toCharArray(), 33798L, IlIlII(763349626, var0 ^ -1616118885)
      );
      l[5] = IllIl(llllI(IlIlII(763349627, var0 ^ -1221727283), IlIlII(763349624, var0 ^ 644684947)).toCharArray(), 92728L, IlIlII(763349625, var0 ^ 845502547));
      l[IlIlII(763349630, var0 ^ -1750750541)] = IllIl(
         llllI(IlIlII(763349631, var0 ^ -906268953), IlIlII(763349628, var0 ^ -120622438)).toCharArray(), 70923L, IlIlII(763349629, var0 ^ 416104643)
      );
      l[IlIlII(763349618, var0 ^ -1590409040)] = IllIl(
         llllI(IlIlII(763349619, var0 ^ 1470338708), IlIlII(763349616, var0 ^ -1768427949)).toCharArray(), 20925L, IlIlII(763349617, var0 ^ 227108355)
      );
      l[IlIlII(763349622, var0 ^ -149610386)] = IllIl(
         llllI(IlIlII(763349623, var0 ^ -148726378), IlIlII(763349620, var0 ^ -144658721)).toCharArray(), 26643L, IlIlII(763349621, var0 ^ 642044992)
      );
      l[IlIlII(763349610, var0 ^ -1774873197)] = IllIl(
         llllI(IlIlII(763349611, var0 ^ 1046717971), IlIlII(763349608, var0 ^ 1085461602)).toCharArray(), 26608L, IlIlII(763349609, var0 ^ -416164405)
      );
      l[IlIlII(763349614, var0 ^ 252885998)] = IllIl(
         llllI(IlIlII(763349615, var0 ^ -1177133205), IlIlII(763349612, var0 ^ -1539121737)).toCharArray(), 97487L, IlIlII(763349613, var0 ^ 1666201614)
      );
      l[IlIlII(763349602, var0 ^ 300161423)] = IllIl(
         llllI(IlIlII(763349603, var0 ^ -341115761), IlIlII(763349600, var0 ^ 1662865896)).toCharArray(), 86690L, IlIlII(763349601, var0 ^ 1944760483)
      );
      l[IlIlII(763349606, var0 ^ -1520103422)] = IllIl(
         llllI(IlIlII(763349607, var0 ^ 2056544062), IlIlII(763349604, var0 ^ 1453571955)).toCharArray(), 5316L, IlIlII(763349605, var0 ^ 780394083)
      );
      l[IlIlII(763349594, var0 ^ -1847608393)] = IllIl(
         llllI(IlIlII(763349595, var0 ^ -977633517), IlIlII(763349592, var0 ^ -780829665)).toCharArray(), 94107L, IlIlII(763349593, var0 ^ -658365538)
      );
      l[IlIlII(763349598, var0 ^ 514889428)] = IllIl(
         llllI(IlIlII(763349599, var0 ^ 1812636427), IlIlII(763349596, var0 ^ -236770410)).toCharArray(), 50774L, IlIlII(763349597, var0 ^ 1816655438)
      );
      l[IlIlII(763349586, var0 ^ 1858352335)] = IllIl(
         llllI(IlIlII(763349587, var0 ^ -1851010669), IlIlII(763349584, var0 ^ -1770696145)).toCharArray(), 22215L, IlIlII(763349585, var0 ^ -1326300319)
      );
      l[IlIlII(763349590, var0 ^ 389048671)] = IllIl(
         llllI(IlIlII(763349591, var0 ^ 408780047), IlIlII(763349588, var0 ^ 870761881)).toCharArray(), 12603L, IlIlII(763349589, var0 ^ -163462066)
      );
      l[IlIlII(763349578, var0 ^ -275950620)] = IllIl(
         llllI(IlIlII(763349579, var0 ^ -1622052081), IlIlII(763349576, var0 ^ -184127025)).toCharArray(), 55709L, IlIlII(763349577, var0 ^ -1362988191)
      );
      l[IlIlII(763349582, var0 ^ 133001368)] = IllIl(
         llllI(IlIlII(763349583, var0 ^ 1921093913), IlIlII(763349580, var0 ^ -1203230397)).toCharArray(), 7292L, IlIlII(763349581, var0 ^ 1793353902)
      );
      l[IlIlII(763349570, var0 ^ -635663187)] = IllIl(
         llllI(IlIlII(763349571, var0 ^ -1709690367), IlIlII(763349568, var0 ^ 1812357701)).toCharArray(), 11544L, IlIlII(763349569, var0 ^ 1606697306)
      );
      l[IlIlII(763349574, var0 ^ -1939958698)] = IllIl(
         llllI(IlIlII(763349575, var0 ^ 1746371786), IlIlII(763349572, var0 ^ -1394743585)).toCharArray(), 42791L, IlIlII(763349573, var0 ^ -1652070417)
      );
      l[IlIlII(763349562, var0 ^ 517597793)] = IllIl(
         llllI(IlIlII(763349563, var0 ^ 115150208), IlIlII(763349560, var0 ^ 952781843)).toCharArray(), 94233L, IlIlII(763349561, var0 ^ 1171224305)
      );
      l[IlIlII(763349566, var0 ^ -502683448)] = IllIl(
         llllI(IlIlII(763349567, var0 ^ 171324776), IlIlII(763349564, var0 ^ -1182961910)).toCharArray(), 4206L, IlIlII(763349565, var0 ^ -1324066664)
      );
      l[IlIlII(763349554, var0 ^ -661281196)] = IllIl(
         llllI(IlIlII(763349555, var0 ^ -860829253), IlIlII(763349552, var0 ^ 1908567015)).toCharArray(), 16158L, IlIlII(763349553, var0 ^ 483208332)
      );
      l[IlIlII(763349558, var0 ^ 512715503)] = IllIl(
         llllI(IlIlII(763349559, var0 ^ 108836923), IlIlII(763349556, var0 ^ -451697639)).toCharArray(), 5150L, IlIlII(763349557, var0 ^ 1646607826)
      );
      l[IlIlII(763349546, var0 ^ -870640506)] = IllIl(
         llllI(IlIlII(763349547, var0 ^ -1629881485), IlIlII(763349544, var0 ^ 1850716077)).toCharArray(), 54565L, IlIlII(763349545, var0 ^ -1762681838)
      );
      l[IlIlII(763349550, var0 ^ 865862303)] = IllIl(
         llllI(IlIlII(763349551, var0 ^ -575322094), IlIlII(763349548, var0 ^ 1324555138)).toCharArray(), 81574L, IlIlII(763349549, var0 ^ 171232750)
      );
      l[IlIlII(763349538, var0 ^ -1516012256)] = IllIl(
         llllI(IlIlII(763349539, var0 ^ 1158364734), IlIlII(763349536, var0 ^ 2072028902)).toCharArray(), 50188L, IlIlII(763349537, var0 ^ -193275323)
      );
      l[IlIlII(763349542, var0 ^ 1985383722)] = IllIl(
         llllI(IlIlII(763349543, var0 ^ -1952472047), IlIlII(763349540, var0 ^ -2025563728)).toCharArray(), 31222L, IlIlII(763349541, var0 ^ -319523092)
      );
      l[IlIlII(763349530, var0 ^ 955989418)] = IllIl(
         llllI(IlIlII(763349531, var0 ^ 498777908), IlIlII(763349528, var0 ^ -1772820168)).toCharArray(), 29307L, IlIlII(763349529, var0 ^ 562318424)
      );
      l[IlIlII(763349534, var0 ^ -1145292779)] = IllIl(
         llllI(IlIlII(763349535, var0 ^ 121829388), IlIlII(763349532, var0 ^ 1514666770)).toCharArray(), 69384L, IlIlII(763349533, var0 ^ -1484085687)
      );
      l[IlIlII(763349522, var0 ^ 297409997)] = IllIl(
         llllI(IlIlII(763349523, var0 ^ -1452620679), IlIlII(763349520, var0 ^ -477779916)).toCharArray(), 44973L, IlIlII(763349521, var0 ^ -783949126)
      );
      l[IlIlII(763349526, var0 ^ 1869108491)] = IllIl(
         llllI(IlIlII(763349527, var0 ^ 859255998), IlIlII(763349524, var0 ^ -326594694)).toCharArray(), 79675L, IlIlII(763349525, var0 ^ 778485099)
      );
      l[IlIlII(763349514, var0 ^ -1474572374)] = IllIl(
         llllI(IlIlII(763349515, var0 ^ -2057507766), IlIlII(763349512, var0 ^ 1521383790)).toCharArray(), 98134L, IlIlII(763349513, var0 ^ -1199203907)
      );
   }

   private static void IIIIlI() {
      IlIIl(IIl, false);
      lIIIl(IIlI);
   }

   public static <T> void IIIIll(
      Object var0, Iterable<? extends Iterable<T>> var1, Function<T, class_2338> var2, Function<T, Color> var3, ToDoubleFunction<T> var4
   ) {
      if (var0 instanceof lIIlIl var5 && IIIIII(var5)) {
         for (Iterable var7 : var1) {
            for (Object var9 : var7) {
               class_2338 var10 = (class_2338)var2.apply(var9);
               if (var10 != null) {
                  lIIl(
                     var5,
                     new class_238(
                        var10.method_10263(),
                        var10.method_10264(),
                        var10.method_10260(),
                        var10.method_10263() + 1.0,
                        var10.method_10264() + 1.0,
                        var10.method_10260() + 1.0
                     ),
                     (Color)var3.apply(var9),
                     var4.applyAsDouble(var9)
                  );
               }
            }
         }
      }
   }

   public static void IIIlII(Object var0, class_238 var1, Color var2, double var3) {
      if (var0 instanceof lIIlIl var5) {
         Illl(var5, var1, var2, var3);
      }
   }

   public static void IIIlIl(lIIlIl var0) {
      IlII(var0);
   }

   public static void IIIllI(lIIlIl var0, class_243 var1, class_243 var2, Color var3, double var4, float var6) {
      lIlIl(var6, IlIII::III);
   }

   private static Object IIIlll(Method var0, Object... var1) {
      try {
         if (var0 == null) {
            return null;
         }
      } catch (ReflectiveOperationException var4) {
         throw IIII(var4);
      }

      try {
         return var0.invoke(null, var1);
      } catch (ReflectiveOperationException var3) {
         return null;
      }
   }

   private static void IIlIII(lIIlIl var0, class_243[] var1, Color var2, double var3) {
      int var10 = 424788993;
      int[][] var10000 = new int[IlIlII(763349518, var10 ^ -1958631755)][];
      var10000[0] = new int[]{0, 1};
      var10000[1] = new int[]{1, 2};
      var10000[2] = new int[]{2, 3};
      var10000[3] = new int[]{3, 0};
      var10000[4] = new int[]{4, 5};
      var10000[5] = new int[]{5, IlIlII(763349519, var10 ^ 170502994)};
      var10000[IlIlII(763349516, var10 ^ -1320503235)] = new int[]{IlIlII(763349517, var10 ^ -140706341), IlIlII(763349506, var10 ^ -1115217505)};
      var10000[IlIlII(763349507, var10 ^ 753126509)] = new int[]{IlIlII(763349504, var10 ^ -1704236680), 4};
      var10000[IlIlII(763349505, var10 ^ -1842857818)] = new int[]{0, 4};
      var10000[IlIlII(763349510, var10 ^ -1727994457)] = new int[]{1, 5};
      var10000[IlIlII(763349511, var10 ^ 455504661)] = new int[]{2, IlIlII(763349508, var10 ^ 2140768649)};
      var10000[IlIlII(763349509, var10 ^ -153796831)] = new int[]{3, IlIlII(763349498, var10 ^ -771962472)};
      int[][] var5 = var10000;

      for (int[] var9 : var5) {
         IIIIl(var0, var1[var9[0]], var1[var9[1]], var2, var3);
      }
   }

   public static void IIlIIl(Object var0, class_243 var1, float var2, float var3, float var4, Color var5, double var6) {
      if (var0 instanceof lIIlIl var8) {
         lllI(var8, var1, var2, var3, var4, var5, var6);
      } else if (var0 instanceof WorldRenderContext var9) {
         llI(var9.matrices(), lIl(var9), var1, var2, var3, var4, var5, var6);
      }
   }

   public static void IIlIlI(lIIlIl var0, class_243 var1, double var2, int var4, Color var5, double var6, float var8) {
      IIllIl(var0, var1, var2, var4, var5, var6, var8, true, IlIII::lIIll);
   }

   private static Method IIlIll(String param0, String param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic java/lang/Class.forName (Ljava/lang/String;)Ljava/lang/Class;
      // 04: astore 3
      // 05: aload 3
      // 06: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 09: astore 4
      // 0b: aload 4
      // 0d: arraylength
      // 0e: istore 5
      // 10: bipush 0
      // 11: istore 6
      // 13: iload 6
      // 15: iload 5
      // 17: if_icmpge 53
      // 1a: aload 4
      // 1c: iload 6
      // 1e: aaload
      // 1f: astore 7
      // 21: aload 7
      // 23: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 26: aload 1
      // 27: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a: ifeq 4d
      // 2d: aload 7
      // 2f: invokevirtual java/lang/reflect/Method.getParameterCount ()I
      // 32: iload 2
      // 33: if_icmpeq 44
      // 36: goto 3d
      // 39: invokestatic k74/x/IlIII.IIII (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 3c: athrow
      // 3d: goto 4d
      // 40: invokestatic k74/x/IlIII.IIII (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 43: athrow
      // 44: aload 7
      // 46: bipush 1
      // 47: invokevirtual java/lang/reflect/Method.setAccessible (Z)V
      // 4a: aload 7
      // 4c: areturn
      // 4d: iinc 6 1
      // 50: goto 13
      // 53: goto 57
      // 56: astore 3
      // 57: aconst_null
      // 58: areturn
   }

   private static Object IIllII() {
      Object var0 = lIllI(IlIIllIII.lI(l[1]), IlIIllIII.lI(l[2]));
      if (var0 == null) {
         var0 = lIllI(IlIIllIII.lI(l[0]), IlIIllIII.lI(l[2]));
      }

      return var0;
   }

   public static void IIllIl(lIIlIl var0, class_243 var1, double var2, int var4, Color var5, double var6, float var8, boolean var9, IntPredicate var10) {
      String[] var11 = IIllllIl.IIIIl();
      if (IIIIII(var0) && var1 != null && !(var2 <= 0.0) && var4 >= 3 && var5 != null) {
         class_243 var12 = Illll(var0);
         Matrix4f var13 = var0.I().method_23760().method_23761();
         class_4588 var14 = lIl(var0).method_73477(var9 ? lIII : IlII);
         float var15 = var5.getRed() / 255.0F;
         float var16 = var5.getGreen() / 255.0F;
         float var17 = var5.getBlue() / 255.0F;
         float var18 = Il(var6) / 255.0F;
         float var19 = llII(var8);
         int var20 = 0;

         while (var20 < var4) {
            if (var10 == null || var10.test(var20)) {
               double var21 = (Math.PI * 2) * var20 / var4;
               double var23 = (Math.PI * 2) * (var20 + 1) / var4;
               float var25 = (float)(var1.field_1352 + Math.cos(var21) * var2 - var12.field_1352);
               float var26 = (float)(var1.field_1351 - var12.field_1351);
               float var27 = (float)(var1.field_1350 + Math.sin(var21) * var2 - var12.field_1350);
               float var28 = (float)(var1.field_1352 + Math.cos(var23) * var2 - var12.field_1352);
               float var30 = (float)(var1.field_1350 + Math.sin(var23) * var2 - var12.field_1350);
               float var31 = var28 - var25;
               float var32 = var30 - var27;
               float var33 = Math.max(1.0E-4F, class_3532.method_15355(var31 * var31 + var32 * var32));
               var31 /= var33;
               var32 /= var33;
               var14.method_22918(var13, var25, var26, var27)
                  .method_22915(var15, var16, var17, var18)
                  .method_60831(var0.I().method_23760(), var31, 0.0F, var32)
                  .method_75298(var19);
               var14.method_22918(var13, var28, var26, var30)
                  .method_22915(var15, var16, var17, var18)
                  .method_60831(var0.I().method_23760(), var31, 0.0F, var32)
                  .method_75298(var19);
            }

            var20++;
            if (var11 != null) {
               break;
            }
         }
      }
   }

   public static void IIlllI(lIIlIl var0, class_2960 var1, class_243 var2, double var3, double var5) {
      IIl(var0, var1, var2, var3, var5, Color.WHITE);
   }

   public static void IIllll(Object var0, class_243 var1, float var2, float var3, float var4, Color var5, double var6, float var8) {
      if (var0 instanceof lIIlIl var9) {
         IIIl(var9, var1, var2, var3, var4, var5, var6, var8);
      }
   }

   private static void IlIIII(class_4587 var0, class_238 var1, Color var2, double var3) {
      if (var0 != null && var1 != null && var2 != null) {
         class_4184 var5 = class_310.method_1551().field_1773.method_19418();
         class_243 var6 = var5.method_71156();
         float var7 = (float)(var1.field_1323 - var6.field_1352);
         float var8 = (float)(var1.field_1322 - var6.field_1351);
         float var9 = (float)(var1.field_1321 - var6.field_1350);
         float var10 = (float)(var1.field_1320 - var6.field_1352);
         float var11 = (float)(var1.field_1325 - var6.field_1351);
         float var12 = (float)(var1.field_1324 - var6.field_1350);
         float var13 = var2.getRed() / 255.0F;
         float var14 = var2.getGreen() / 255.0F;
         float var15 = var2.getBlue() / 255.0F;
         float var16 = Il(var3) / 255.0F;
         Matrix4f var17 = var0.method_23760().method_23761();
         lIIIl(llIl);
         lIIIl(III);
         lIIIl(I);
         IIIIlI();
         IlIIl(IlI, Illl);

         try {
            Object var18 = IIIlll(IIIl);
            class_4588 var19 = (class_4588)lIII(var18, lIll, lI, ll);
            if (var19 != null) {
               var19.method_22918(var17, var7, var8, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var8, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var11, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var7, var11, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var7, var8, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var7, var11, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var11, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var8, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var7, var8, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var7, var8, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var8, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var8, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var7, var11, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var11, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var11, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var7, var11, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var7, var8, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var7, var11, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var7, var11, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var7, var8, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var8, var9).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var8, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var11, var12).method_22915(var13, var14, var15, var16);
               var19.method_22918(var17, var10, var11, var9).method_22915(var13, var14, var15, var16);
               Object var20 = lIII(var19, lll);
               if (var20 != null) {
                  IlIIl(lIl, var20);
               }

               return;
            }
         } finally {
            lIIII();
            lIIIl(Il);
            lIIIl(lIlI);
         }
      }
   }

   public static void IlIIIl(Object var0, class_238 var1, Color var2, double var3, float var5) {
      if (lll(var0, var1)) {
         if (var0 instanceof lIIlIl var6) {
            IllI(var6.I(), var6.llI(), var1, var2, var3, var5);
         } else if (var0 instanceof WorldRenderContext var7) {
            IllI(var7.matrices(), var7.consumers(), var1, var2, var3, var5);
         }
      }
   }

   private static void IlIIlI(lIIlIl var0, class_243[] var1, Color var2, double var3) {
      IIlIII(var0, var1, var2, var3);
   }

   private static float IlIIll() {
      return llII(IIll);
   }
}
