package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1799;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_7833;

@Environment(EnvType.CLIENT)
public final class IIIIllIll {
   public static lIIlllll I() {
      IIIIIllII var0 = IIIIIllII.III();
      return var0 == null ? null : var0.II().IIIl();
   }

   public static void l(class_742 var0, class_1268 var1, class_1799 var2, float var3, float var4, class_4587 var5) {
      String[] var6 = IIllllIl.IIIIl();
      lIIlllll var7 = I();
      if (var7 != null && var7.IlII() && !var2.method_7960() && lI(var0, var1)) {
         class_1306 var8 = II(var0, var1);
         float var9 = var8 == class_1306.field_6183 ? 1.0F : -1.0F;
         class_1268 var10 = var0.field_6266 != null ? var0.field_6266 : class_1268.field_5808;
         float var11 = var10 == var1 ? var4 : 0.0F;
         float var12 = var0.field_6252 && var10 == var1 ? Math.max(0.0F, var0.method_6055(var3)) : 0.0F;
         float var13 = Math.max(0.0F, Math.max(var11, var12));
         lIIllll var14 = var7.lIII(var1);
         float var15 = var14.Il(var13);
         float var16 = class_3532.method_15374(var13 * var13 * (float) Math.PI);
         float var17 = 1.0F;
         float var18 = var14.lIl();
         if (!var7.IIl() && var8 == class_1306.field_6182) {
            var18 = -var18;
         }

         var5.method_46416(var18, var14.IIIl(), var14.IlI());
         float var19 = var14.I();
         switch (IlIIlIlll.I[var14.ll().ordinal()]) {
            case 1:
               var5.method_46416(-0.14142136F * var9 - 0.05F * var9 * var15 * var19, 0.08F + 0.06F * var15 * var19, 0.14142136F - 0.09F * var16 * var19);
               var5.method_22907(class_7833.field_40714.rotationDegrees(-102.25F - 80.0F * var15 * var19));
               var5.method_22907(class_7833.field_40716.rotationDegrees(13.365F * var9 - 20.0F * var9 * var16 * var19));
               var5.method_22907(class_7833.field_40718.rotationDegrees(78.05F * var9 - 20.0F * var9 * var15 * var19));
               if (var6 == null) {
                  break;
               }
            case 2:
               var5.method_22907(class_7833.field_40716.rotationDegrees(var7.lllI(var1)));
            case 3:
         }

         switch (IlIIlIlll.l[var14.IIII().ordinal()]) {
            case 1:
               float var20 = var15 * var19;
               var5.method_46416(-0.14F * var9 * var20, 0.06F * var20, -0.08F * var20);
               var5.method_22907(class_7833.field_40716.rotationDegrees(var9 * (45.0F - 24.0F * var16 * var19)));
               var5.method_22907(class_7833.field_40718.rotationDegrees(var9 * -18.0F * var20));
               var5.method_22907(class_7833.field_40714.rotationDegrees(-72.0F * var20));
               var5.method_22907(class_7833.field_40716.rotationDegrees(var9 * -45.0F));
               if (var6 == null) {
                  break;
               }
            case 2:
               float var25 = var15 * var19;
               var5.method_46416(0.0F, 0.035F * var25, -0.06F * var25);
               var5.method_22907(class_7833.field_40714.rotationDegrees(-58.0F * var25));
               if (var6 == null) {
                  break;
               }
            case 3:
               float var26 = var14.III(var13);
               var5.method_22907(class_7833.field_40714.rotationDegrees(var26 * 360.0F * var19 * var9));
               if (var6 == null) {
                  break;
               }
            case 4:
               float var27 = 1.0F - var15 * 0.16F * var19;
               var17 = class_3532.method_15363(var27, 0.72F, 1.25F);
               if (var6 == null) {
                  break;
               }
            case 5:
               var5.method_46416(0.0F, -var15 * 0.02F * var19, -var15 * 0.42F * var19);
               var5.method_22907(class_7833.field_40714.rotationDegrees(-22.0F * var15 * var19));
               if (var6 == null) {
                  break;
               }
            case 6:
               float var28 = var15 * var19;
               var5.method_22907(class_7833.field_40714.rotationDegrees(var14.II() * var28));
               var5.method_22907(class_7833.field_40716.rotationDegrees(var14.IIl() * var28 * var9));
               var5.method_22907(class_7833.field_40718.rotationDegrees(var14.IlII() * var28 * var9));
            case 7:
         }

         float var29 = var14.lII();
         if (var29 != 0.0F) {
            var5.method_22907(class_7833.field_40714.rotationDegrees(var29));
         }

         float var21 = var14.llI();
         if (var21 != 0.0F) {
            var5.method_22907(class_7833.field_40716.rotationDegrees(var21));
         }

         float var22 = var14.IIll();
         if (var22 != 0.0F) {
            var5.method_22907(class_7833.field_40718.rotationDegrees(var22));
         }

         float var23 = var14.Ill();
         if (var23 != 0.0F) {
            var5.method_22907(class_7833.field_40718.rotationDegrees(var23 * var9));
         }

         float var24 = var14.lll() * var17;
         var5.method_22905(var24, var24, var24);
      }
   }

   private static class_1306 II(class_742 var0, class_1268 var1) {
      return var1 == class_1268.field_5808 ? var0.method_6068() : var0.method_6068().method_5928();
   }

   public static boolean Il(class_1268 var0) {
      lIIlllll var1 = I();
      return var1 != null && var1.IlII() && var1.IIII(var0) != IIllIllll.III;
   }

   public static boolean lI(class_742 var0, class_1268 var1) {
      lIIlllll var2 = I();
      return var2 != null && var2.IlII() && !var2.Illl() ? II(var0, var1) != class_1306.field_6182 : true;
   }

   private IIIIllIll() {
   }
}
