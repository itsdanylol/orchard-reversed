package k74.x;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1044;
import net.minecraft.class_10799;
import net.minecraft.class_11231;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4588;
import net.minecraft.class_8030;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
final class IIlIlIlIl {
   private static final int II = 5;
   private static final RenderPipeline Il;
   private static final IIIlIlIl lI;
   private static final float ll = 1.25F;
   private static final RenderPipeline III;
   private static final RenderPipeline IIl;
   private static final IIIlIlIl IlI;
   private static final IIIlIlIl Ill;
   private static final Object[] IIlll;
   private static final IIIlIlIl lII;
   private static final int lIl = 4;
   private static final int[] IIlIl;
   private static final class_11231 llI;
   private static final RenderPipeline lll;
   private static final IIIlIlIl IIII;
   private static final float IIIl = 8.0F;
   private static final String[] IIllI;
   private static final IIIlIlIl IIlI;
   private static final int IIll = 0;
   private static final int IlII = 2;
   private static final int IlIl = 7;
   private static final IIIlIlIl IllI;
   private static final int Illl = 1;
   private static final int lIII = 6;
   private static final int lIIl = 6;
   private static final RenderPipeline lIlI;
   private static final float lIll = 2.0F;
   private static final IIIlIlIl llII;
   private static final float l = 8.0F;
   private static final IIIlIlIl llIl;
   private static final int lllI = 8;
   private static final RenderPipeline I;
   private static final IIIlIlIl llll;
   private static final IIIlIlIl IIIII;
   private static final IIIlIlIl IIIIl;
   private static final float IIIlI = 12.0F;
   private static final int IIIll = 3;
   private static final int IIlII = 18;

   private static RenderPipeline I() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
            .withLocation(llIIl(IlI))
            .withVertexShader(llIIl(llIl))
            .withFragmentShader(llIIl(llIl))
            .withBlend(BlendFunction.TRANSLUCENT)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withCull(false)
            .withVertexFormat(class_290.field_1575, class_5596.field_27379)
            .build()
      );
   }

   static boolean l(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if (!(var5 <= 0.0) && !(var7 <= 0.0) && (var11 >>> llIll(493166259, -1791099193 ^ -917091080) & llIll(493166258, -1791099193 ^ 1104102823)) > 0) {
         double var12 = IlllI(var5, var7, var9);
         var0.field_59826
            .method_70919(
               new llIlIIII(
                  new Matrix3x2f(var0.method_51448()),
                  (float)var1,
                  (float)var3,
                  (float)var5,
                  (float)var7,
                  (float)var12,
                  0.0F,
                  0,
                  var11,
                  var11,
                  var11,
                  var11,
                  var0.field_44659.method_70863()
               )
            );
         return true;
      } else {
         return true;
      }
   }

   private static void II(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      String[] var10000 = IIllllIl.IIIIl();
      int var9 = llIlI(var6);
      String[] var8 = var10000;
      float[] var10 = new float[llIll(493166257, 1736515118 ^ -1593804919)];
      float[] var11 = new float[llIll(493166256, 1736515118 ^ 275138414)];
      int var12 = IIll(var10, var11, var2, var3, var4, var5, var6, var9);
      if (var12 >= 3) {
         float[] var13 = new float[var12];
         int var14 = 0;
         int var15 = 0;

         while (var15 < var12) {
            boolean var16 = false;
            int var17 = 0;

            while (var17 < var14) {
               if (Math.abs(var13[var17] - var11[var15]) < 0.001F) {
                  var16 = true;
                  if (var8 == null) {
                     break;
                  }
               }

               var17++;
               if (var8 != null) {
                  break;
               }
            }

            if (!var16) {
               var13[var14++] = var11[var15];
            }

            var15++;
            if (var8 != null) {
               break;
            }
         }

         var15 = 0;

         label106:
         while (var15 < var14 - 1) {
            int var32 = var15 + 1;

            while (true) {
               if (var32 < var14) {
                  if (var13[var32] < var13[var15]) {
                     float var34 = var13[var15];
                     var13[var15] = var13[var32];
                     var13[var32] = var34;
                  }

                  var32++;
                  if (var8 == null) {
                     continue;
                  }
               }

               var15++;
               if (var8 != null) {
                  break label106;
               }
               break;
            }
         }

         var15 = 0;

         while (var15 < var14 - 1) {
            float var33 = var13[var15];
            float var35 = var13[var15 + 1];
            float var18 = var2 + var4;
            float var19 = var2;
            float var20 = var2 + var4;
            float var21 = var2;
            int var22 = 0;

            while (var22 < var12) {
               int var23 = (var22 + 1) % var12;
               float var24 = var11[var22];
               float var25 = var11[var23];
               float var26 = var10[var22];
               float var27 = var10[var23];
               float var28 = lIll(var26, var24, var27, var25, var33);
               if (!Float.isNaN(var28)) {
                  var18 = Math.min(var18, var28);
                  var19 = Math.max(var19, var28);
               }

               var28 = lIll(var26, var24, var27, var25, var35);
               if (!Float.isNaN(var28)) {
                  var20 = Math.min(var20, var28);
                  var21 = Math.max(var21, var28);
               }

               var22++;
               if (var8 != null) {
                  break;
               }
            }

            var22 = 0;

            while (true) {
               if (var22 < var12) {
                  if (Math.abs(var11[var22] - var33) < 0.001F) {
                     var18 = Math.min(var18, var10[var22]);
                     var19 = Math.max(var19, var10[var22]);
                  }

                  if (Math.abs(var11[var22] - var35) < 0.001F) {
                     var20 = Math.min(var20, var10[var22]);
                     var21 = Math.max(var21, var10[var22]);
                  }

                  var22++;
                  if (var8 == null) {
                     continue;
                  }
               }

               float var37 = 1.0F / var4;
               float var38 = 1.0F / var5;
               float var39 = (var18 - var2) * var37;
               float var40 = (var33 - var3) * var38;
               float var41 = (var19 - var2) * var37;
               float var42 = (var20 - var2) * var37;
               float var44 = (var35 - var3) * var38;
               float var29 = (var21 - var2) * var37;
               IIlll(var0, var1, var18, var33, var39, var40, var7);
               IIlll(var0, var1, var19, var33, var41, var40, var7);
               IIlll(var0, var1, var21, var35, var29, var44, var7);
               IIlll(var0, var1, var18, var33, var39, var40, var7);
               IIlll(var0, var1, var21, var35, var29, var44, var7);
               IIlll(var0, var1, var20, var35, var42, var44, var7);
               var15++;
               if (var8 != null) {
                  return;
               }
               break;
            }
         }
      }
   }

   static void Il(class_332 var0, double var1, double var3) {
      var0.method_51448().scale((float)var1, (float)var3);
   }

   static void lI(class_332 var0) {
      var0.method_51448().popMatrix();
   }

   static boolean ll(
      class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, float var10, float var11, float var12, float var13, int var14
   ) {
      return llII(var0, var1, var2, var4, var6, var8, var10, var11, var12, var13, var14, 12.0F);
   }

   private static void III(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, int var6) {
      float var7 = var4 + var5 * 0.5F;
      float var8 = Math.max(0.0F, var4 - var5 * 0.5F);
      if (var8 <= 0.0F) {
         IIIIl(var0, var1, var2, var3, var7, var6);
      } else {
         int var9 = IlIII(var7);

         for (int var10 = 0; var10 < var9; var10++) {
            double var11 = (Math.PI * 2) * var10 / var9;
            double var13 = (Math.PI * 2) * (var10 + 1) / var9;
            float var15 = var2 + (float)Math.cos(var11) * var7;
            float var16 = var3 + (float)Math.sin(var11) * var7;
            float var17 = var2 + (float)Math.cos(var13) * var7;
            float var18 = var3 + (float)Math.sin(var13) * var7;
            float var19 = var2 + (float)Math.cos(var11) * var8;
            float var20 = var3 + (float)Math.sin(var11) * var8;
            float var21 = var2 + (float)Math.cos(var13) * var8;
            float var22 = var3 + (float)Math.sin(var13) * var8;
            lIIl(var0, var1, var15, var16, var6);
            lIIl(var0, var1, var17, var18, var6);
            lIIl(var0, var1, var21, var22, var6);
            lIIl(var0, var1, var15, var16, var6);
            lIIl(var0, var1, var21, var22, var6);
            lIIl(var0, var1, var19, var20, var6);
         }
      }
   }

   private static RenderPipeline IIl() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_56864})
            .withLocation(llIIl(lI))
            .withSampler(llII.llIl())
            .withBlend(BlendFunction.TRANSLUCENT)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withCull(false)
            .withVertexFormat(class_290.field_1575, class_5596.field_27379)
            .build()
      );
   }

   static void IlI(class_332 var0, double var1) {
      var0.method_51448().rotate((float)Math.toRadians(var1));
   }

   static boolean Ill(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if (!(var5 <= 0.0) && !(var7 <= 0.0) && (var11 >>> llIll(493166263, 355416012 ^ -1335210002) & llIll(493166262, 355416012 ^ -409937102)) > 0) {
         float var12 = (float)Math.max(0.0, var9);
         var0.field_59826
            .method_70919(
               new IIIlI(new Matrix3x2f(var0.method_51448()), (float)var1, (float)var3, (float)var5, (float)var7, var12, var11, var0.field_44659.method_70863())
            );
         return true;
      } else {
         return true;
      }
   }

   private static void lII(
      class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9, float var10, int var11
   ) {
      var0.method_70815(var1, var2, var3).method_39415(var11).method_22913(var4, var5).method_22921(var6, var7).method_22914(var8, var9, var10);
   }

   private static void lIl(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      int var8 = llIlI(var6);
      float[] var9 = new float[llIll(493166261, -2078676674 ^ -309942265)];
      float[] var10 = new float[llIll(493166260, -2078676674 ^ 1208202570)];
      int var11 = IIll(var9, var10, var2, var3, var4, var5, var6, var8);
      float var12 = var2 + var4 * 0.5F;
      float var13 = var3 + var5 * 0.5F;

      for (int var14 = 0; var14 < var11; var14++) {
         int var15 = (var14 + 1) % var11;
         lIIl(var0, var1, var12, var13, var7);
         lIIl(var0, var1, var9[var14], var10[var14], var7);
         lIIl(var0, var1, var9[var15], var10[var15], var7);
      }
   }

   private static float llI(int var0) {
      return Math.max(-1.0F, Math.min(1.0F, -1.0F + var0 * 0.25F));
   }

   static void lll(class_332 var0) {
      var0.method_51448().pushMatrix();
   }

   private static void IIII(
      class_4588 var0,
      Matrix3x2fc var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12
   ) {
      if (!(var4 <= 0.0F) && !(var5 <= 0.0F)) {
         int var13 = IIIll(var4);
         int var14 = IIIll(var5);
         float var15 = Math.max(1.0E-4F, Math.min(var4, var5));
         float var16 = lllI(var6 / var15);
         float var17 = lllI(var7 / var15);
         float var18 = IlIl(var16);
         float var19 = IlIl(var17);
         float var20 = llI(var8);
         lII(var0, var1, var2, var3, 0.0F, 0.0F, var13, var14, var18, var19, var20, var9);
         lII(var0, var1, var2, var3 + var5, 0.0F, 1.0F, var13, var14, var18, var19, var20, var12);
         lII(var0, var1, var2 + var4, var3 + var5, 1.0F, 1.0F, var13, var14, var18, var19, var20, var11);
         lII(var0, var1, var2 + var4, var3, 1.0F, 0.0F, var13, var14, var18, var19, var20, var10);
      }
   }

   static boolean IIIl(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if (!(var5 <= 0.0)
         && !(var7 <= 0.0)
         && !(var9 <= 0.0)
         && (var11 >>> llIll(493166267, -829872319 ^ 143368854) & llIll(493166266, -829872319 ^ 1037046619)) > 0) {
         float var12 = (float)Math.max(0.0, var5);
         float var13 = (float)Math.max(0.25, var7);
         float var14 = var12 + var13 * 0.5F + 2.0F;
         var0.field_59826
            .method_70919(
               new llllllIl(
                  new Matrix3x2f(var0.method_51448()), (float)var1, (float)var3, var14, var12, var13, lllI((float)var9), var11, var0.field_44659.method_70863()
               )
            );
         return true;
      } else {
         return true;
      }
   }

   static boolean IIlI(class_332 var0, double var1, double var3, double var5, int var7) {
      if (!(var5 <= 0.0) && (var7 >>> llIll(493166265, 1226825927 ^ 900236535) & llIll(493166264, 1226825927 ^ 1779956110)) > 0) {
         float var8 = (float)Math.max(0.0, var5);
         float var9 = var8 + 2.0F;
         var0.field_59826
            .method_70919(new lIIIll(new Matrix3x2f(var0.method_51448()), (float)var1, (float)var3, var9, var8, 0.0F, 5, var7, var0.field_44659.method_70863()));
         return true;
      } else {
         return true;
      }
   }

   private static int IIll(float[] var0, float[] var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = Math.min(Math.min(var4, var5) * 0.5F, Math.max(0.0F, var6));
      int var9 = 0;
      var9 = llIII(var0, var1, var9, var2 + var4 - var8, var3 + var8, var8, -90.0F, 0.0F, var7);
      var9 = llIII(var0, var1, var9, var2 + var4 - var8, var3 + var5 - var8, var8, 0.0F, 90.0F, var7);
      var9 = llIII(var0, var1, var9, var2 + var8, var3 + var5 - var8, var8, 90.0F, 180.0F, var7);
      return llIII(var0, var1, var9, var2 + var8, var3 + var8, var8, 180.0F, 270.0F, var7);
   }

   private static void IlII(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      float var9 = Math.min(var7, Math.min(var4, var5) * 0.5F);
      float var10 = var4 - var9 * 2.0F;
      float var11 = var5 - var9 * 2.0F;
      if (!(var10 <= 0.0F) && !(var11 <= 0.0F)) {
         int var12 = llIlI(var6);
         float[] var13 = new float[llIll(493166271, 1287355489 ^ 1504860131)];
         float[] var14 = new float[llIll(493166270, 1287355489 ^ 572691716)];
         float[] var15 = new float[llIll(493166269, 1287355489 ^ -1883873967)];
         float[] var16 = new float[llIll(493166268, 1287355489 ^ 2053446086)];
         int var17 = IIll(var13, var14, var2, var3, var4, var5, var6, var12);
         int var18 = IIll(var15, var16, var2 + var9, var3 + var9, var10, var11, Math.max(0.0F, var6 - var9), var12);
         int var19 = Math.min(var17, var18);

         for (int var20 = 0; var20 < var19; var20++) {
            int var21 = (var20 + 1) % var19;
            lIIl(var0, var1, var13[var20], var14[var20], var8);
            lIIl(var0, var1, var13[var21], var14[var21], var8);
            lIIl(var0, var1, var15[var21], var16[var21], var8);
            lIIl(var0, var1, var13[var20], var14[var20], var8);
            lIIl(var0, var1, var15[var21], var16[var21], var8);
            lIIl(var0, var1, var15[var20], var16[var20], var8);
         }
      } else {
         lIl(var0, var1, var2, var3, var4, var5, var6, var8);
      }
   }

   private static float IlIl(float var0) {
      return lllI(var0) * 2.0F - 1.0F;
   }

   static void IllI(class_332 var0, class_2960 var1, int var2, int var3, int var4, int var5, int var6) {
      if ((var6 >>> llIll(493166243, -78224227 ^ 1234709624) & llIll(493166242, -78224227 ^ 1676628194)) > 0 && var4 > 0 && var5 > 0) {
         var0.method_25291(class_10799.field_56883, var1, var2, var3, 0.0F, 0.0F, var4, var5, var4, var5, var6);
      }
   }

   private static RenderPipeline Illl() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
            .withLocation(llIIl(IIIII))
            .withVertexShader(llIIl(Ill))
            .withFragmentShader(llIIl(lII))
            .withBlend(BlendFunction.TRANSLUCENT)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withCull(false)
            .withVertexFormat(class_290.field_1590, class_5596.field_27382)
            .build()
      );
   }

   static boolean lIII(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if (!(var5 <= 0.0) && !(var7 <= 0.0) && (var11 >>> llIll(493166241, -1234532371 ^ 1388465081) & llIll(493166240, -1234532371 ^ 1895981663)) > 0) {
         var0.field_59826
            .method_70919(
               new IlIIllII(
                  new Matrix3x2f(var0.method_51448()),
                  (float)var1,
                  (float)var3,
                  (float)var5,
                  (float)var7,
                  (float)IlllI(var5, var7, var9),
                  0.0F,
                  var11,
                  false,
                  var0.field_44659.method_70863()
               )
            );
         return true;
      } else {
         return true;
      }
   }

   private static void lIIl(class_4588 var0, Matrix3x2fc var1, float var2, float var3, int var4) {
      var0.method_70815(var1, var2, var3).method_39415(var4);
   }

   private static RenderPipeline lIlI() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
            .withLocation(llIIl(IllI))
            .withVertexShader(llIIl(Ill))
            .withFragmentShader(llIIl(Ill))
            .withBlend(BlendFunction.TRANSLUCENT)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withCull(false)
            .withVertexFormat(class_290.field_1590, class_5596.field_27382)
            .build()
      );
   }

   private static float lIll(float var0, float var1, float var2, float var3, float var4) {
      float var5 = Math.min(var1, var3);
      float var6 = Math.max(var1, var3);
      if (!(var4 < var5 - 0.001F) && !(var4 > var6 + 0.001F)) {
         if (Math.abs(var3 - var1) < 1.0E-4F) {
            return Float.NaN;
         } else {
            float var7 = (var4 - var1) / (var3 - var1);
            return var0 + var7 * (var2 - var0);
         }
      } else {
         return Float.NaN;
      }
   }

   static boolean llII(
      class_332 var0,
      class_2960 var1,
      double var2,
      double var4,
      double var6,
      double var8,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      float var15
   ) {
      if (var0 != null
         && var1 != null
         && !(var6 <= 0.0)
         && !(var8 <= 0.0)
         && (var14 >>> llIll(493166247, -1062276106 ^ -407803127) & llIll(493166246, -1062276106 ^ 705172686)) > 0) {
         class_1044 var16 = class_310.method_1551().method_1531().method_4619(var1);
         var0.field_59826
            .method_70919(
               new IIlIIIllI(
                  new Matrix3x2f(var0.method_51448()),
                  (float)var2,
                  (float)var4,
                  (float)var6,
                  (float)var8,
                  var10,
                  var11,
                  var12,
                  var13,
                  var14,
                  var15,
                  class_11231.method_70900(var16.method_71659(), var16.method_75484()),
                  var0.field_44659.method_70863()
               )
            );
         return true;
      } else {
         return true;
      }
   }

   static boolean llIl(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12, int var13, int var14) {
      int var21 = -1637913074;
      int var15 = var11 >>> llIll(493166245, var21 ^ -225931886) & llIll(493166244, var21 ^ 1237240889);
      int var16 = var12 >>> llIll(493166251, var21 ^ 1834211372) & llIll(493166250, var21 ^ -1180029462);
      int var17 = var13 >>> llIll(493166249, var21 ^ 1401508554) & llIll(493166248, var21 ^ -491225774);
      int var18 = var14 >>> llIll(493166255, var21 ^ -108393455) & llIll(493166254, var21 ^ -1294179325);
      if ((var15 > 0 || var16 > 0 || var17 > 0 || var18 > 0) && !(var5 <= 0.0) && !(var7 <= 0.0)) {
         double var19 = IlllI(var5, var7, var9);
         var0.field_59826
            .method_70919(
               new llIlIIII(
                  new Matrix3x2f(var0.method_51448()),
                  (float)var1,
                  (float)var3,
                  (float)var5,
                  (float)var7,
                  (float)var19,
                  0.0F,
                  0,
                  var11,
                  var12,
                  var13,
                  var14,
                  var0.field_44659.method_70863()
               )
            );
         return true;
      } else {
         return true;
      }
   }

   private static float lllI(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }

   static boolean llll(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12) {
      int var13 = var11 >>> llIll(493166253, -1609054279 ^ 1789828637) & llIll(493166252, -1609054279 ^ -1900990038);
      int var14 = var12 >>> llIll(493166227, -1609054279 ^ 946319022) & llIll(493166226, -1609054279 ^ -1407512080);
      if ((var13 > 0 || var14 > 0) && !(var5 <= 0.0) && !(var7 <= 0.0)) {
         double var15 = IlllI(var5, var7, var9);
         var0.field_59826
            .method_70919(
               new llIlIIII(
                  new Matrix3x2f(var0.method_51448()),
                  (float)var1,
                  (float)var3,
                  (float)var5,
                  (float)var7,
                  (float)var15,
                  0.0F,
                  0,
                  var11,
                  var12,
                  var12,
                  var11,
                  var0.field_44659.method_70863()
               )
            );
         return true;
      } else {
         return true;
      }
   }

   static boolean IIIII(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, int var10) {
      return ll(var0, var1, var2, var4, var6, var8, 0.0F, 0.0F, 1.0F, 1.0F, var10);
   }

   private static int llIll(int var0, int var1) {
      int var2 = IIlIl[var0 ^ 493166259] ^ var1 ^ var0;
      var2 += 55053;
      var2 -= 48279;
      var2 ^= 43006;
      var2 += 33989;
      var2 -= 45987;
      var2 -= 21670;
      var2 ^= 21156;
      var2 += 8706;
      return var2 - 56896;
   }

   private static void IIIIl(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, int var5) {
      int var6 = IlIII(var4);

      for (int var7 = 0; var7 < var6; var7++) {
         double var8 = (Math.PI * 2) * var7 / var6;
         double var10 = (Math.PI * 2) * (var7 + 1) / var6;
         lIIl(var0, var1, var2, var3, var5);
         lIIl(var0, var1, var2 + (float)Math.cos(var8) * var4, var3 + (float)Math.sin(var8) * var4, var5);
         lIIl(var0, var1, var2 + (float)Math.cos(var10) * var4, var3 + (float)Math.sin(var10) * var4, var5);
      }
   }

   static boolean IIIlI(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      return IllII(var0, var1, var3, var5, var7, var9, 1.0, var11);
   }

   private static int IIIll(float var0) {
      return Math.max(1, Math.min(llIll(493166225, -2121228220 ^ -448509713), Math.round(var0 * 8.0F)));
   }

   private static RenderPipeline IIlII() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_56863})
            .withLocation(llIIl(IIlI))
            .withCull(false)
            .withVertexFormat(class_290.field_1576, class_5596.field_27379)
            .build()
      );
   }

   private static RenderPipeline IIlIl() {
      return class_10799.method_67887(
         RenderPipeline.builder(new Snippet[]{class_10799.field_60125})
            .withLocation(llIIl(llll))
            .withVertexShader(llIIl(Ill))
            .withFragmentShader(llIIl(IIIIl))
            .withSampler(llII.llIl())
            .withBlend(BlendFunction.TRANSLUCENT)
            .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
            .withDepthWrite(false)
            .withCull(false)
            .withVertexFormat(class_290.field_1590, class_5596.field_27382)
            .build()
      );
   }

   static void IIllI(class_332 var0, double var1, double var3) {
      var0.method_51448().mul(new Matrix3x2f(1.0F, (float)var3, (float)var1, 1.0F, 0.0F, 0.0F));
   }

   private static void IIlll(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, int var6) {
      var0.method_70815(var1, var2, var3).method_22913(var4, var5).method_39415(var6);
   }

   private static int IlIII(float var0) {
      return Math.max(llIll(493166213, 411447527 ^ 303268542), Math.min(llIll(493166212, 411447527 ^ 644009950), (int)Math.ceil(var0 * 0.75F)));
   }

   static void IlIIl(class_332 var0, class_2960 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if ((var8 >>> llIll(493166219, -1091096794 ^ 989800945) & llIll(493166218, -1091096794 ^ 2052475409)) > 0 && var4 > 0 && var5 > 0 && var6 > 0 && var7 > 0
         )
       {
         var0.method_25293(class_10799.field_56883, var1, var2, var3, 0.0F, 0.0F, var4, var5, var6, var7, var6, var7, var8);
      }
   }

   static void IlIlI(
      class_332 var0, class_2960 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      if ((var12 >>> llIll(493166217, 1720493426 ^ 894528522) & llIll(493166216, 1720493426 ^ -1163477893)) > 0
         && var4 > 0
         && var5 > 0
         && var8 > 0
         && var9 > 0
         && var10 > 0
         && var11 > 0) {
         var0.method_25293(class_10799.field_56883, var1, var2, var3, var6, var7, var4, var5, var8, var9, var10, var11, var12);
      }
   }

   static boolean IlIll(class_332 var0, double var1, double var3, double var5, double var7, double var9, double var11, int var13) {
      if (!(var5 <= 0.0)
         && !(var7 <= 0.0)
         && !(var11 <= 0.0)
         && (var13 >>> llIll(493166223, -1477149644 ^ 1656705169) & llIll(493166222, -1477149644 ^ 1342236982)) > 0) {
         double var14 = IlllI(var5, var7, var9);
         float var16 = (float)Math.max(0.25, var11);
         float var17 = (float)(var1 - var16);
         float var18 = (float)(var3 - var16);
         float var19 = (float)(var5 + var16 * 2.0F);
         float var20 = (float)(var7 + var16 * 2.0F);
         float var21 = (float)(var14 + var16);
         var0.field_59826
            .method_70919(
               new llIlIIII(
                  new Matrix3x2f(var0.method_51448()),
                  var17,
                  var18,
                  var19,
                  var20,
                  var21,
                  var16,
                  llIll(493166221, -1477149644 ^ -235698871),
                  var13,
                  var13,
                  var13,
                  var13,
                  var0.field_44659.method_70863()
               )
            );
         return true;
      } else {
         return true;
      }
   }

   static boolean IllII(class_332 var0, double var1, double var3, double var5, double var7, double var9, double var11, int var13) {
      if (!(var5 <= 0.0) && !(var7 <= 0.0) && (var13 >>> llIll(493166220, 1373802242 ^ 1705170731) & llIll(493166323, 1373802242 ^ -993420661)) > 0) {
         double var14 = IlllI(var5, var7, var9);
         double var16 = Math.max(0.25, Math.min(var11, Math.min(var5, var7) * 0.5));
         var0.field_59826
            .method_70919(
               new llIlIIII(
                  new Matrix3x2f(var0.method_51448()),
                  (float)var1,
                  (float)var3,
                  (float)var5,
                  (float)var7,
                  (float)var14,
                  (float)var16,
                  3,
                  var13,
                  var13,
                  var13,
                  var13,
                  var0.field_44659.method_70863()
               )
            );
         return true;
      } else {
         return true;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -336068347;
      int var10001 = "Ñ拴來戒ᦕ朼茶恼礿撺連憄积怄㤯悂禘护᧺敜礢擊\ud99d掄\ud9e7於뤴惂릅攌᧫恌餦掺ᦞ揄駥昴뤱怲㦇果맧慄夭惒릗挜\ud9e1抬露撺妖擤秠押㤬杲릍拴秳旌ᤨ憊列戤姧抔\ud922枒㦃愼\ud9fd旼㤣懊㦑悌姨惜뤢抂禍攬駦敔뤣扪禒杬맰挬夿撂\ud992怬駧扔ᤤ戢㦔柌駵懔\u193f昢馛扄㧢憬ᤠ戒\ud99c抴駼搔ᤧ斺輦怬᧬攼㤴挺ᦍ攜᧫恬ᤧ戲妝掼맮曔夹憲\ud981斤駣慜\ud92c惂릖恔罹括餸敲릕摼㧭挄餥柲力挌識搼礪悚禚戤駧慌天朚㦋怬᧸撜\ud922恺妒慤\ud9ec押㤤慒㦇斄駧擔餥抢릓於駴揔ᤳ旂\ud99b恔駡挴夠戊ᦓ朼秼懤ᤳ枂馘悜姬憄礮揺馕懬)ᢶ烄ᧀၾᵎ倓᭮냐Ḉ遰\u1aee\uf003\u1afe僂\u1ae0遱ᣆ뀖ῦ탊ἰ遵\u187e瀄ᵖ\uf0db᧰큮ᾖ倂ᠮ烏ᦸ偲ᥞညᴦ탗ᩈၣᴦ"
         .length();
      int var10 = 0;
      int var8 = var10001;
      String var7 = "Ñ拴來戒ᦕ朼茶恼礿撺連憄积怄㤯悂禘护᧺敜礢擊\ud99d掄\ud9e7於뤴惂릅攌᧫恌餦掺ᦞ揄駥昴뤱怲㦇果맧慄夭惒릗挜\ud9e1抬露撺妖擤秠押㤬杲릍拴秳旌ᤨ憊列戤姧抔\ud922枒㦃愼\ud9fd旼㤣懊㦑悌姨惜뤢抂禍攬駦敔뤣扪禒杬맰挬夿撂\ud992怬駧扔ᤤ戢㦔柌駵懔\u193f昢馛扄㧢憬ᤠ戒\ud99c抴駼搔ᤧ斺輦怬᧬攼㤴挺ᦍ攜᧫恬ᤧ戲妝掼맮曔夹憲\ud981斤駣慜\ud92c惂릖恔罹括餸敲릕摼㧭挄餥柲力挌識搼礪悚禚戤駧慌天朚㦋怬᧸撜\ud922恺妒慤\ud9ec押㤤慒㦇斄駧擔餥抢릓於駴揔ᤳ旂\ud99b恔駡挴夠戊ᦓ朼秼懤ᤳ枂馘悜姬憄礮揺馕懬)ᢶ烄ᧀၾᵎ倓᭮냐Ḉ遰\u1aee\uf003\u1afe僂\u1ae0遱ᣆ뀖ῦ탊ἰ遵\u187e瀄ᵖ\uf0db᧰큮ᾖ倂ᠮ烏ᦸ偲ᥞညᴦ탗ᩈၣᴦ";
      String[] var10000 = new String[2];
      short var12 = 31498;
      String[] var9 = var10000;
      int var11 = 0;

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 42;
               case 1 -> 182;
               case 2 -> 140;
               case 3 -> 11;
               case 4 -> 114;
               case 5 -> 119;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIllI = var9;
      IIlll = new Object[var9.length];
      byte var22 = 0;
      IIlIl = new int[81];
      int var25 = 0;
      byte[] var10002 = "HD÷¢ÀÝÿ\u0083Ò®,ücÈ\u001c\u001a±j=»æ\u0090¨\u0019}°\u0004fØ5\u0019*Ò-ÀBçvpñh\u0098!§7'] \u0001&n×z¶¬1×\"dg\"ñ ñ¦á\rh\u008c\u0096p\u008cð\u0087\u0089ÛÓG¡C30Ývþ\u0089£Ïxø¦\u0017ÃÎæÂç#ó§3Ú\u0007\u001fÙùyChÈW¥sú'\u009e8¬NòÞ\u0096\u001c':\u0089²î\u008c_,ª\u0018#\u0092\u008apû-kíHÛâÛ\u0087.c\u0093Æïä=ÒüµLâ¶@'\u0084\u001a?\bäô/ÿ!\u0014Ët÷CÜ\u0017\u0080D\u0097ÁF:Ì-\u0002 8\u0014±JÝ\u00802\u0088.ôÇ\u008a÷2îûÙ4ñ=\u0088ù\u008bä0Çä\u0011´\u001eº÷ò*ËºK\u0090'CrÐ\u008e!ìGò\u008cßÈ\u0005]ÐÑdi\u0004ãÛÑÝB(¼é o\u001d\u008b\u0081\u0004Q+Ñ\u001a\u008d\\\u0094Í\u001a\u0089R9\u0099_]?V£ ÿÈ¨\u009e[(3\u008c\u009e\u001d4A\u0001øN§ HO_^\u0016-\u0084MÉä±ë\u0095#ÄDë\u0013Éµ·çúµ Ë8RÌ&"
         .getBytes("ISO-8859-1");

      int var56;
      do {
         IIlIl[var22] = ((var10002[var25] & 255) << 24 | (var10002[var25 + 1] & 255) << 16 | (var10002[var25 + 2] & 255) << 8 | var10002[var25 + 3] & 255)
            ^ 155967548;
         var22 += 1;
         var56 = var25 + 4;
         var25 += 4;
      } while (var56 < var10002.length);

      String[] var0 = new String[llIll(493166224, var17 ^ 312450909)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lllII(1345753547, var17 ^ -1135070557)).length();
      int var2 = llIll(493166231, var17 ^ 609250015);
      int var19 = -1;

      label103:
      while (true) {
         int var23 = llIll(493166230, var17 ^ 1813097348);
         String var28 = var3.substring(++var19, var19 + var2);
         byte var40 = -1;

         while (true) {
            label98: {
               char[] var58 = var28.toCharArray();
               int var70 = var58.length;
               int var6 = 0;
               var56 = var23;
               var45 = var58;
               var25 = var70;
               char[] var82;
               int var89;
               if (var70 <= 1) {
                  var82 = var58;
                  var70 = var23;
                  var89 = var6;
               } else {
                  var56 = var23;
                  var25 = var70;
                  if (var70 <= var6) {
                     break label98;
                  }

                  var82 = var58;
                  var70 = var23;
                  var89 = var6;
               }

               while (true) {
                  var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % llIll(493166235, var17 ^ -665624904)) {
                     case 0 -> llIll(493166234, var17 ^ -147605623);
                     case 1 -> llIll(493166233, var17 ^ 16144235);
                     case 2 -> llIll(493166232, var17 ^ -1960835193);
                     case 3 -> llIll(493166239, var17 ^ -396951324);
                     case 4 -> llIll(493166238, var17 ^ 1049722541);
                     case 5 -> llIll(493166237, var17 ^ -757734290);
                     default -> llIll(493166236, var17 ^ -345634435);
                  });
                  var6++;
                  if (var56 == 0) {
                     var89 = var56;
                     var82 = var45;
                     var70 = var56;
                  } else {
                     if (var25 <= var6) {
                        break;
                     }

                     var82 = var45;
                     var70 = var56;
                     var89 = var6;
                  }
               }
            }

            String var63 = new String(var45).intern();
            switch (var40) {
               case 0:
                  var0[var4++] = var63;
                  if ((var19 += var2) >= var5) {
                     IIII = IlIIllIII.Ill(var0[llIll(493166211, var17 ^ 2145766583)]);
                     IllI = IlIIllIII.Ill(var0[llIll(493166210, var17 ^ 185650793)]);
                     Ill = IlIIllIII.Ill(var0[llIll(493166209, var17 ^ -851853447)]);
                     IIIII = IlIIllIII.Ill(var0[0]);
                     lII = IlIIllIII.Ill(var0[4]);
                     IIlI = IlIIllIII.Ill(var0[2]);
                     lI = IlIIllIII.Ill(var0[llIll(493166208, var17 ^ -886671064)]);
                     llll = IlIIllIII.Ill(var0[5]);
                     IIIIl = IlIIllIII.Ill(var0[llIll(493166215, var17 ^ 106733738)]);
                     IlI = IlIIllIII.Ill(var0[3]);
                     llIl = IlIIllIII.Ill(var0[1]);
                     llII = IlIIllIII.Ill(var0[llIll(493166214, var17 ^ 942888233)]);
                     Il = IIlII();
                     I = IIl();
                     III = lIlI();
                     lIlI = Illl();
                     lll = IIlIl();
                     IIl = I();
                     llI = class_11231.method_70899();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var63;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label103;
                  }

                  var5 = (var3 = lllII(1345753546, var17 ^ -210679303)).length();
                  var2 = llIll(493166229, var17 ^ -1039812593);
                  var19 = -1;
            }

            var23 = llIll(493166228, var17 ^ -1288310057);
            var28 = var3.substring(++var19, var19 + var2);
            var40 = 0;
         }
      }
   }

   static boolean IllIl(class_332 var0, double var1, double var3, double var5, double var7, int var9) {
      if (!(var5 <= 0.0) && !(var7 <= 0.0) && (var9 >>> llIll(493166322, -1588408756 ^ 1684473548) & llIll(493166321, -1588408756 ^ 565219429)) > 0) {
         float var10 = (float)Math.max(0.0, var5);
         float var11 = (float)Math.max(0.25, var7);
         float var12 = var10 + var11 * 0.5F + 2.0F;
         var0.field_59826
            .method_70919(
               new lIIIll(
                  new Matrix3x2f(var0.method_51448()),
                  (float)var1,
                  (float)var3,
                  var12,
                  var10,
                  var11,
                  llIll(493166320, -1588408756 ^ -414969093),
                  var9,
                  var0.field_44659.method_70863()
               )
            );
         return true;
      } else {
         return true;
      }
   }

   private static double IlllI(double var0, double var2, double var4) {
      return Math.min(Math.min(var0, var2) * 0.5, Math.max(0.0, var4));
   }

   static void Illll(class_332 var0, double var1, double var3) {
      var0.method_51448().translate((float)var1, (float)var3);
   }

   private static void lIIII(
      class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float var11
   ) {
      if (!(var4 <= 0.0F) && !(var5 <= 0.0F)) {
         int var12 = IIIll(var4);
         int var13 = IIIll(var5);
         float var14 = llI(llIll(493166327, 561673126 ^ 1751802092));
         lII(var0, var1, var2, var3, var6, var7, var12, var13, 0.0F, var11, var14, var10);
         lII(var0, var1, var2, var3 + var5, var6, var9, var12, var13, 0.0F, var11, var14, var10);
         lII(var0, var1, var2 + var4, var3 + var5, var8, var9, var12, var13, 0.0F, var11, var14, var10);
         lII(var0, var1, var2 + var4, var3, var8, var7, var12, var13, 0.0F, var11, var14, var10);
      }
   }

   private IIlIlIlIl() {
   }

   private static void lIIIl(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      if (!(var4 <= 0.0F) && !(var5 <= 0.0F)) {
         int var10 = IIIll(var4);
         int var11 = IIIll(var5);
         float var12 = Math.max(1.0E-4F, Math.min(var4, var5));
         float var13 = IlIl(lllI(var6 / var12));
         float var14 = IlIl(lllI(var7 / var12));
         float var15 = lllI(var8);
         lII(var0, var1, var2, var3, 0.0F, 0.0F, var10, var11, var13, var14, var15, var9);
         lII(var0, var1, var2, var3 + var5, 0.0F, 1.0F, var10, var11, var13, var14, var15, var9);
         lII(var0, var1, var2 + var4, var3 + var5, 1.0F, 1.0F, var10, var11, var13, var14, var15, var9);
         lII(var0, var1, var2 + var4, var3, 1.0F, 0.0F, var10, var11, var13, var14, var15, var9);
      }
   }

   static void lIIlI(class_332 var0, double var1, double var3, double var5) {
      var0.method_51448().translate((float)var1, (float)var3);
   }

   static boolean lIIll(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12, boolean var13, boolean var14) {
      int var15 = var11 >>> llIll(493166326, 2083016893 ^ -923214387) & llIll(493166325, 2083016893 ^ -161727446);
      int var16 = var12 >>> llIll(493166324, 2083016893 ^ -459732909) & llIll(493166331, 2083016893 ^ 688319577);
      if ((var15 > 0 || var16 > 0) && !(var5 <= 0.0) && !(var7 <= 0.0)) {
         double var17 = IlllI(var5, var7, var9);
         if (!(var17 <= 0.01) && (var13 || var14)) {
            var0.field_59826
               .method_70919(
                  new llIlIIII(
                     new Matrix3x2f(var0.method_51448()),
                     (float)var1,
                     (float)var3,
                     (float)var5,
                     (float)var7,
                     (float)var17,
                     0.0F,
                     var13 && var14 ? 0 : (var13 ? 1 : 2),
                     var11,
                     var11,
                     var12,
                     var12,
                     var0.field_44659.method_70863()
                  )
               );
            return true;
         } else {
            var0.method_25296((int)Math.floor(var1), (int)Math.floor(var3), (int)Math.ceil(var1 + var5), (int)Math.ceil(var3 + var7), var11, var12);
            return true;
         }
      } else {
         return true;
      }
   }

   static void lIlII(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, double var10, int var12) {
      if ((var12 >>> llIll(493166330, -1134402519 ^ 258828722) & llIll(493166329, -1134402519 ^ -149735764)) > 0 && !(var6 <= 0.0) && !(var8 <= 0.0)) {
         double var13 = IlllI(var6, var8, var10);
         if (var13 <= 0.01) {
            IllI(var0, var1, (int)Math.round(var2), (int)Math.round(var4), (int)Math.round(var6), (int)Math.round(var8), var12);
         } else {
            class_1044 var15 = class_310.method_1551().method_1531().method_4619(var1);
            if (var15 != null) {
               class_11231 var16 = class_11231.method_70900(var15.method_71659(), var15.method_75484());
               var0.field_59826
                  .method_70919(
                     new lIIllllI(
                        var16,
                        new Matrix3x2f(var0.method_51448()),
                        (float)var2,
                        (float)var4,
                        (float)var6,
                        (float)var8,
                        (float)var13,
                        var12,
                        var0.field_44659.method_70863()
                     )
                  );
            }
         }
      }
   }

   static boolean lIlIl(class_332 var0, double var1, double var3, double var5, double var7, double var9, double var11, int var13) {
      if (!(var5 <= 0.0)
         && !(var7 <= 0.0)
         && !(var11 <= 0.0)
         && (var13 >>> llIll(493166328, -543389535 ^ 1342047379) & llIll(493166335, -543389535 ^ 2052610348)) > 0) {
         double var14 = IlllI(var5, var7, var9);
         float var16 = (float)Math.max(0.25, var11);
         float var17 = (float)(var1 - var16);
         float var18 = (float)(var3 - var16);
         float var19 = (float)(var5 + var16 * 2.0F);
         float var20 = (float)(var7 + var16 * 2.0F);
         float var21 = (float)(var14 + var16);
         var0.field_59826
            .method_70919(
               new llIlIIII(
                  new Matrix3x2f(var0.method_51448()), var17, var18, var19, var20, var21, var16, 4, var13, var13, var13, var13, var0.field_44659.method_70863()
               )
            );
         return true;
      } else {
         return true;
      }
   }

   @Nullable
   private static class_8030 lIllI(float var0, float var1, float var2, float var3, Matrix3x2fc var4, @Nullable class_8030 var5) {
      int var6 = (int)Math.floor(var0);
      int var7 = (int)Math.floor(var1);
      int var8 = (int)Math.ceil(var0 + var2);
      int var9 = (int)Math.ceil(var1 + var3);
      class_8030 var10 = new class_8030(var6, var7, Math.max(1, var8 - var6), Math.max(1, var9 - var7)).method_65185(var4);
      return var5 != null ? var5.method_49701(var10) : var10;
   }

   static boolean lIlll(class_332 var0, double var1, double var3, double var5, double var7, double var9, double var11, int var13) {
      if (!(var5 <= 0.0)
         && !(var7 <= 0.0)
         && !(var11 <= 0.0)
         && (var13 >>> llIll(493166334, -92192027 ^ 720038950) & llIll(493166333, -92192027 ^ 656126382)) > 0) {
         float var14 = (float)Math.min(Math.max(0.5, var11), Math.min(var5, var7) * 0.5);
         var0.field_59826
            .method_70919(
               new IlIIllII(
                  new Matrix3x2f(var0.method_51448()),
                  (float)var1,
                  (float)var3,
                  (float)var5,
                  (float)var7,
                  (float)IlllI(var5, var7, var9),
                  var14,
                  var13,
                  true,
                  var0.field_44659.method_70863()
               )
            );
         return true;
      } else {
         return true;
      }
   }

   private static String lllII(int var0, int var1) {
      int var3 = var0 ^ 1345753547;
      char[] var4 = IIllI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIlll[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIlll[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1524680610;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 41;
            case 1 -> 244;
            case 2 -> 29;
            case 3 -> 136;
            case 4 -> 166;
            case 5 -> 60;
            case 6 -> 101;
            case 7 -> 53;
            case 8 -> 192;
            case 9 -> 235;
            case 10 -> 96;
            case 11 -> 140;
            case 12 -> 70;
            case 13 -> 155;
            case 14 -> 43;
            case 15 -> 210;
            case 16 -> 21;
            case 17 -> 14;
            case 18 -> 198;
            case 19 -> 197;
            case 20 -> 249;
            case 21 -> 244;
            case 22 -> 19;
            case 23 -> 183;
            case 24 -> 151;
            case 25 -> 99;
            case 26 -> 34;
            case 27 -> 13;
            case 28 -> 195;
            case 29 -> 173;
            case 30 -> 94;
            case 31 -> 197;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int llIII(float[] var0, float[] var1, int var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      for (int var9 = 0; var9 <= var8; var9++) {
         float var10 = (float)var9 / var8;
         double var11 = Math.toRadians(var6 + (var7 - var6) * var10);
         var0[var2] = var3 + (float)Math.cos(var11) * var5;
         var1[var2] = var4 + (float)Math.sin(var11) * var5;
         var2++;
      }

      return var2;
   }

   private static class_2960 llIIl(IIIlIlIl var0) {
      return class_2960.method_60655(IIII.llIl(), var0.llIl());
   }

   private static int llIlI(float var0) {
      return Math.max(llIll(493166332, -171426272 ^ 458414863), Math.min(llIll(493166307, -171426272 ^ -642402359), (int)Math.ceil(var0)));
   }
}
