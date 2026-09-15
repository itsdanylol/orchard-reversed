package k74.x;

import java.util.SplittableRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
final class IIIIllIl {
   private static final float II = -0.6F;
   private static final float Il = 1.25F;
   private final float[] lI;
   private float ll;
   private static final float III = 0.4F;
   private float IIl;
   private static final float IlI = 0.05F;
   private static final float Ill = 0.016666668F;
   private static final float lII = 0.10000001F;
   private static final int[] lIIIll = new int[3];
   private static final float lIl = 0.9F;
   private float llI;
   private float lll;
   private static final float IIII = 0.8F;
   private float IIIl;
   private static final float IIlI = 4.2F;
   private static final float IIll = 0.75F;
   private float IlII;
   private static final float IlIl = 2.5F;
   private float IllI;
   private static final float Illl = 0.15F;
   private final float lIII;
   private static final float lIIl = 0.1F;
   private static final int lIlI = 4;
   private static final float lIll = (float) (Math.PI / 3);
   private float I;
   private float llII;
   private static final float llIl = 1.1F;
   private final SplittableRandom lllI;
   private final float[] llll = new float[4];
   private static final float IIIII = 1.6F;
   private float IIIIl;
   private static final float IIIlI = 0.6F;
   private static final float IIIll = 0.16F;
   private boolean IIlII;
   private static final float IIlIl = 0.35F;
   private static final float IIllI = 0.045F;
   private static final float IIlll = 0.32F;
   private final lIIIllI IlIII;
   private static final float IlIIl = 0.14F;
   private static final float IlIlI = 0.65F;
   private static final float IlIll = 0.6F;
   private boolean IllII;
   private float IllIl;
   private final lIllIlll[] IlllI;
   private final lIllIlll[] Illll;
   private static final float lIIII = 1.5F;
   private static final float lIIIl = 1.0F;
   private float lIIlI;
   private static final float lIIll = 0.8F;
   private static final float lIlII = 0.15F;
   private static final float lIlIl = 0.85F;
   private float lIllI;
   private static final float lIlll = 0.018F;
   private static final long llIII = -7046029254386353131L;
   private float llIIl;
   private static final int llIlI = 6;
   private final lIIIllI llIll;
   private float lllII;
   private static final float lllIl = 0.35F;
   private float llllI;
   private static final float lllll = 0.8F;
   private float IIIIII;
   private final float[] IIIIIl;
   private static final float IIIIlI = 1.6F;
   private static final float IIIIll = 0.3F;
   private static final float IIIlII = 0.08F;
   private static final float IIIlIl = 1.6F;
   private static final float IIIllI = 1.2F;
   private static final float IIIlll = 0.22F;
   private static final float IIlIII = 0.45F;
   private static final float IIlIIl = 20.0F;
   private static final float IIlIlI = 1.2F;
   private float IIlIll;
   private static final float IIllII = 1.25F;
   private static final float IIllIl = 0.61F;
   private float IIlllI;
   private final float[] IIllll = new float[4];
   private float IlIIII;
   private float IlIIIl;
   private static final float IlIIlI = 0.7F;
   private final float IlIIll;
   private float IlIlII;
   private float IlIlIl;
   private static final float IlIllI = 0.3F;
   private static final float IlIlll = 3.0F;
   private static final float IllIII = 0.55F;
   private final int IllIIl;
   private static final float IllIlI = 0.2F;
   private static final float IllIll = 8.0F;
   private static final float IlllII = 0.42F;
   private static final float IlllIl = 1.45F;
   private float l;
   private final lIllIlll IllllI;
   private static final double Illlll = 0.025;
   private static final float lIIIII = 1.2F;
   private float lIIIIl;
   private static final float lIIIlI = 1.5F;

   private float I(float var1, float var2) {
      return var1 + this.lllI.nextFloat() * (var2 - var1);
   }

   private static int llII(int var0, int var1) {
      int var2 = lIIIll[var0 ^ 2133561120] ^ var1 ^ var0;
      var2 ^= 17375;
      var2 -= 11173;
      var2 -= 56260;
      var2 ^= 4797;
      var2 -= 59622;
      var2 += 48322;
      var2 += 21717;
      var2 ^= 63703;
      var2 -= 55689;
      return var2 - 14791;
   }

   private float l() {
      if (this.IllII) {
         this.IllII = false;
         return this.IlIlIl;
      } else {
         double var1 = Math.max(1.0E-12, this.lllI.nextDouble());
         double var3 = this.lllI.nextDouble();
         double var5 = Math.sqrt(-2.0 * Math.log(var1));
         double var7 = (Math.PI * 2) * var3;
         this.IlIlIl = (float)(Math.sin(var7) * var5);
         this.IllII = true;
         return (float)(Math.cos(var7) * var5);
      }
   }

   int II() {
      return this.IllIIl;
   }

   float Il() {
      return this.IIIIl;
   }

   class_243 lI(class_243 var1, class_243 var2, class_238 var3, boolean var4) {
      String[] var5 = IIllllIl.IIIIl();
      if (var1 != null && var2 != null && var3 != null) {
         class_243 var6 = var2.method_1020(var1);
         double var7 = Math.sqrt(var6.field_1352 * var6.field_1352 + var6.field_1350 * var6.field_1350);
         double var9 = var6.method_1033();
         if (!(var7 <= 1.0E-4) && !(var9 <= 1.0E-4) && IlIIIllll.llIIIl(var6)) {
            class_238 var11 = IlIIIllll.IIlIII(var3, 0.025);
            double var12 = 0.5
               * Math.sqrt(var3.method_17939() * var3.method_17939() + var3.method_17940() * var3.method_17940() + var3.method_17941() * var3.method_17941());
            float var14 = (float)Math.toDegrees(Math.atan(var12 / Math.max(var9, 0.05)));
            float var15 = Math.min(0.8F * var14, 1.2F);
            float var16 = this.llII;
            float var17 = this.IIIIII;
            double var18 = Math.hypot(var16, var17);
            if (var18 > 1.0E-6 && var18 * var15 > 1.2F) {
               float var20 = (float)(1.2F / (var18 * var15));
               var16 *= var20;
               var17 *= var20;
            }

            float var31 = var4 ? 0.0F : var16 * var15;
            float var21 = var4 ? class_3532.method_15363(var17 * var15, -0.22F, 0.22F) : var17 * var15;
            if (Math.hypot(var31, var21) <= 1.0E-6) {
               return var2;
            } else {
               class_243 var22;
               label59: {
                  if (var4) {
                     double var23 = Math.tan(Math.toRadians(var21)) * var7;
                     var22 = new class_243(var2.field_1352, var2.field_1351 + var23, var2.field_1350);
                     if (var5 == null) {
                        break label59;
                     }
                  }

                  float var32 = (float)(Math.toDegrees(Math.atan2(var6.field_1350, var6.field_1352)) - 90.0) + var31;
                  float var24 = class_3532.method_15363((float)(-Math.toDegrees(Math.atan2(var6.field_1351, var7))) + var21, -89.9F, 89.9F);
                  double var25 = Math.toRadians(var32);
                  double var27 = Math.toRadians(var24);
                  double var29 = Math.cos(var27);
                  var22 = var1.method_1019(new class_243(-Math.sin(var25) * var29, -Math.sin(var27), Math.cos(var25) * var29).method_1021(var9));
               }

               if (!IlIIIllll.llIIIl(var22)) {
                  return null;
               } else {
                  class_243 var33 = new class_243(
                     class_3532.method_15350(var22.field_1352, var11.field_1323, var11.field_1320),
                     class_3532.method_15350(var22.field_1351, var11.field_1322, var11.field_1325),
                     class_3532.method_15350(var22.field_1350, var11.field_1321, var11.field_1324)
                  );
                  class_243 var34 = var6.method_1029();
                  class_243 var35 = var33.method_1020(var1).method_1029();
                  double var26 = Math.toDegrees(Math.acos(class_3532.method_15350(var35.method_1026(var34), -1.0, 1.0)));
                  return Double.isFinite(var26) && !(var26 > 1.2001000476837158) ? var33 : var2;
               }
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void ll(float var1, float var2, float var3) {
      this.IllI += var1;
      this.lIll(this.Illll, var1);
      this.lIll(this.IlllI, var1);
      this.IIll(this.IllllI, var1);
      this.ll = this.ll + this.I(-0.6F, 1.6F) * var1;
      if (this.IllI >= this.IlIIIl) {
         this.llIIl = this.I(0.05F, 0.6F);
         this.IlIIIl = this.IllI + this.I(0.9F, 2.5F);
      }

      this.lIllI = this.lIllI + (this.llIIl - this.lIllI) * (1.0F - (float)Math.exp(-var1 / 0.45F));
      this.IIlllI = this.IIlllI * this.IIlIll;
      this.lllII -= var1;
      if (this.lllII <= 0.0F) {
         this.lllII = this.IIII(1.0F / this.IlIIll);
         this.IIlllI = this.I(1.0F, 1.5F);
         this.lll = this.I((float) (-Math.PI / 3), (float) (Math.PI / 3));
      }

      this.lIIlI = this.I(-0.35F, 0.35F);
      this.llI = this.I(-0.35F, 0.35F);
      this.IlIIII = this.I(0.85F, 1.2F);
      this.IIIIl = this.I(0.3F, 0.7F);
      this.Illl(var1, var2, var3, this.llIll);
      this.Illl(var1, var2, var3, this.IlIII);
      this.lIIIIl -= var1;
      if (this.IIlII) {
         this.IlIlII -= var1;
         if (this.IlIlII <= 0.0F) {
            this.IIlII = false;
         }
      }

      if (this.lIIIIl <= 0.0F) {
         this.lll();
         this.lIIIIl = this.III();
         this.IlII = this.I(0.14F, 0.32F);
      }

      float var4 = 1.0F - (float)Math.exp(-var1 / Math.max(this.IlII, 0.001F));
      float var5 = this.IIlII ? this.l : this.IIl;
      float var6 = this.IIlII ? this.llllI : this.I;
      this.llII = this.llII + (var5 - this.llII) * var4;
      this.IIIIII = this.IIIIII + (var6 - this.IIIIII) * var4;
      this.IIIl = Math.min(this.IIIl + var1, this.lIII);
   }

   private float III() {
      return class_3532.method_15363(this.IIII(0.42F), 0.16F, 1.1F);
   }

   float IIl(float var1, float var2) {
      return this.IIIl(this.IlIII, var1, var2) * this.IlIIII;
   }

   private float IlI(lIllIlll[] var1, float[] var2, float var3, boolean var4, float var5, float var6, float var7) {
      String[] var8 = IIllllIl.IIIIl();
      float var9 = var3 > 1.0E-4F ? var3 : 0.15F;
      float var10 = 0.0F;
      int var11 = 0;

      while (var11 < var1.length) {
         var10 += var2[var11] * var1[var11].I();
         var11++;
         if (var8 != null) {
            break;
         }
      }

      float var19 = 6.8852453F;
      float var12 = (float)Math.tanh(var10) * var19;
      float var13 = var4 ? (float)Math.cos(this.ll) * this.lIllI : (float)Math.sin(this.ll) * this.lIllI;
      float var14 = var4 ? this.lIIlI : this.llI;
      float var15 = this.lIIl();
      float var16 = 0.0F;
      if (var5 < 3.0F && this.IIlllI > 1.0E-4F && (Math.abs(var6) > 1.0E-4F || Math.abs(var7) > 1.0E-4F)) {
         float var17 = (float)Math.atan2(var7, var6);
         float var18 = var17 + this.lll;
         var16 = (var4 ? (float)Math.cos(var18) : (float)Math.sin(var18)) * this.IIlllI;
      }

      return (var12 * var15 + var13 + var14 + var16) * var9;
   }

   IIIIllIl(long var1, int var3) {
      this.lI = new float[4];
      this.IIIIIl = new float[4];
      this.Illll = new lIllIlll[4];
      this.IlllI = new lIllIlll[4];
      this.IlIIII = 1.0F;
      this.IIIIl = 0.5F;
      this.llIll = new lIIIllI();
      this.IlIII = new lIIIllI();
      this.lllI = new SplittableRandom(var1 ^ var3 * -7046029254386353131L);
      this.IllIIl = var3;
      this.lIl(this.Illll, this.llll, this.IIllll);
      this.lIl(this.IlllI, this.lI, this.IIIIIl);
      this.IllllI = new lIllIlll(this.I(8.0F, 20.0F), this.l(), this.l(), this.I(0.55F, 1.45F), this.lIII(), this);
      this.ll = this.lIII() * (float) (Math.PI * 2);
      this.llIIl = this.I(0.05F, 0.6F);
      this.lIllI = this.llIIl;
      this.IlIIIl = this.I(0.9F, 2.5F);
      this.IlIIll = this.I(0.4F, 1.2F);
      this.lllII = this.IIII(1.0F / this.IlIIll);
      this.IIlIll = (float)Math.exp(-0.016666668F / this.I(0.1F, 0.2F));
      this.lIIIIl = this.III();
      this.IlII = this.I(0.14F, 0.32F);
      this.lll();
      this.lIII = this.I(0.018F, 0.045F);
   }

   private static float Ill(lIIlIlI var0, float var1, float var2) {
      float var3 = IlIIIllll.IIlllI(var1, 0.992F, 0.72F);
      float var4 = IlIIIllll.IIlllI(1.008F, var2, 0.28F);

      return switch (var0.II()) {
         case 0 -> IlIIIllll.IIlllI(var1, var3, var0.l());
         case 1 -> IlIIIllll.IIlllI(var4, var2, var0.l());
         default -> IlIIIllll.IIlllI(var3, var4, var0.l());
      };
   }

   float lII(float var1, float var2, float var3, float var4) {
      return this.IlI(this.IlllI, this.IIIIIl, var1, false, var2, var3, var4);
   }

   private void lIl(lIllIlll[] var1, float[] var2, float[] var3) {
      String[] var10000 = IIllllIl.IIIIl();
      float var5 = this.I(0.8F, 1.6F);
      String[] var4 = var10000;
      float var6 = this.I(0.35F, 0.65F);
      float var7 = 0.0F;
      int var8 = 0;

      while (var8 < 4) {
         float var9 = var5 * (float)Math.pow(0.5, var8) * this.I(0.8F, 1.25F);
         var2[var8] = var9;
         var1[var8] = new lIllIlll(var9, this.l(), this.l(), this.I(0.55F, 1.45F), this.lIII(), this);
         var3[var8] = (float)Math.pow(var9 / var5, var6);
         var7 += var3[var8] * var3[var8];
         var8++;
         if (var4 != null) {
            break;
         }
      }

      float var10 = (float)Math.sqrt(var7 * 0.75F);
      if (var10 < 1.0E-4F) {
         var10 = 1.0F;
      }

      int var11 = 0;

      while (var11 < 4) {
         var3[var11] /= var10;
         var11++;
         if (var4 != null) {
            break;
         }
      }
   }

   float llI() {
      return this.IlIIII;
   }

   private void lll() {
      float var1 = this.lIII();
      float var2 = this.lIII();
      float var3 = Math.min(var1, var2) + this.lIII() * Math.abs(var1 - var2);
      double var4 = this.lIII() * (Math.PI * 2);
      this.IIl = (float)(Math.cos(var4) * var3);
      this.I = (float)(Math.sin(var4) * var3);
      if (this.lIII() < 0.3F) {
         float var6 = this.I(1.25F, 1.6F);
         this.l = this.IIl * var6;
         this.llllI = this.I * var6;
         this.IIlII = true;
         this.IlIlII = this.I(0.08F, 0.15F);
      } else {
         this.IIlII = false;
      }
   }

   private float IIII(float var1) {
      float var2 = 1.0F - this.lllI.nextFloat();
      if (var2 < 1.0E-6F) {
         var2 = 1.0E-6F;
      }

      return (float)(-Math.log(var2) * var1);
   }

   private float IIIl(lIIIllI var1, float var2, float var3) {
      float var4 = var1.Il;
      float var5 = var4 <= 1.0E-4F ? 1.0F : class_3532.method_15363(var1.II / var4, 0.0F, 1.0F);
      float var6 = var5 * var5 * (3.0F - 2.0F * var5);
      float var7 = Ill(var1.I, var2, var3);
      float var8 = Ill(var1.l, var2, var3);
      return class_3532.method_16439(var6, var7, var8);
   }

   private lIIlIlI IIlI() {
      return new lIIlIlI(this.lllI.nextInt(3), this.lllI.nextFloat(), this.lllI.nextFloat());
   }

   private void IIll(lIllIlll var1, float var2) {
      var1.l += var2;

      for (int var3 = 0; var1.l >= var1.I && var3 < llII(2133561120, -840726967 ^ 160314958); var3++) {
         var1.l = var1.l - var1.I;
         var1.Il = var1.ll;
         var1.ll = this.l();
         var1.I = var1.II * var1.lI;
         var1.lI = this.I(0.55F, 1.45F);
      }
   }

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "\u001c\f\u0080Øh]\u008a\u009eÒÏ:(".getBytes("ISO-8859-1");

      int var14;
      do {
         lIIIll[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1488442476;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);
   }

   void IlII(float var1, float var2, float var3) {
      float var4 = class_3532.method_15363(Float.isFinite(var1) ? var1 : 0.0F, 0.0F, 0.10000001F);
      this.IllIl = Math.min(this.IllIl + var4, 0.10000001F);

      for (int var5 = 0; this.IllIl >= 0.016666668F && var5 < llII(2133561121, 1857893734 ^ -561934524); var5++) {
         this.ll(0.016666668F, var2, var3);
         this.IllIl -= 0.016666668F;
      }
   }

   float IlIl(float var1, float var2) {
      return this.IIIl(this.llIll, var1, var2) * this.IlIIII;
   }

   float IllI() {
      if (!(this.lIII <= 1.0E-4F) && !(this.IIIl >= this.lIII)) {
         float var1 = class_3532.method_15363(this.IIIl / this.lIII, 0.0F, 1.0F);
         float var2 = var1 * var1 * (3.0F - 2.0F * var1);
         return 0.15F + 0.85F * var2;
      } else {
         return 1.0F;
      }
   }

   private void Illl(float var1, float var2, float var3, lIIIllI var4) {
      var4.II += var1;

      for (int var5 = 0; var4.II >= var4.Il && var5 < llII(2133561122, -472937104 ^ -379484283); var5++) {
         var4.II = var4.II - var4.Il;
         var4.I = var4.l;
         var4.l = this.IIlI();
         var4.Il = class_3532.method_16439(class_3532.method_15363(var2, 0.02F, 5.0F), class_3532.method_15363(var3, var2, 5.0F), this.lIII());
      }
   }

   private float lIII() {
      return this.lllI.nextFloat();
   }

   private float lIIl() {
      float var1 = this.IllllI.I();
      float var2 = class_3532.method_15363(0.5F + 0.5F * var1, 0.0F, 1.0F);
      return 0.6F + 0.9F * var2;
   }

   float lIlI(float var1, float var2, float var3, float var4) {
      return this.IlI(this.Illll, this.IIllll, var1, true, var2, var3, var4);
   }

   private void lIll(lIllIlll[] var1, float var2) {
      for (int var3 = 0; var3 < var1.length; var3++) {
         this.IIll(var1[var3], var2);
      }
   }
}
