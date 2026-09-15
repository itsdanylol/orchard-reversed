package k74.x;

import java.util.SplittableRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
final class IIIIlIIlI {
   private float I;
   private float l;
   private float II;
   private float Il = 2.7F;
   private float lI;
   private float ll;
   private SplittableRandom III;
   private float IIl;
   private float IlI;
   private static final float Ill = (float) (Math.PI * 2);

   float[] I(float var1, float var2, float var3, float var4) {
      String[] var10000 = IIllllIl.IIIIl();
      float var6 = Math.max(0.0F, Math.min(var1, 0.1F));
      this.l = this.l + var6 * this.Il;
      String[] var5 = var10000;

      while (this.l >= 1.0F) {
         this.l--;
         this.lI = this.ll;
         this.ll = this.III.nextFloat() * 2.0F - 1.0F;
         if (var5 != null) {
            break;
         }
      }

      this.IIl = this.IIl + var6 * this.II;

      while (this.IIl >= 1.0F) {
         this.IIl--;
         this.IlI = this.I;
         this.I = this.III.nextFloat() * 2.0F - 1.0F;
         if (var5 != null) {
            break;
         }
      }

      float var7 = this.l;
      float var8 = var7 * var7 * (3.0F - 2.0F * var7);
      float var9 = class_3532.method_16439(var8, this.lI, this.ll);
      float var10 = this.IIl;
      float var11 = var10 * var10 * (3.0F - 2.0F * var10);
      float var12 = class_3532.method_16439(var11, this.IlI, this.I);
      float var13 = class_3532.method_15363(var2 / 120.0F, 0.0F, 1.0F);
      float var14 = 0.6F + 0.4F * var13 * var13;
      float var15 = var3 * 1.35F * var14;
      float var16 = var3 * 1.1F * class_3532.method_15363(var4, 0.35F, 1.0F) * var14;
      return new float[]{var9 * var15, var12 * var16};
   }

   IIIIlIIlI() {
      this.II = 4.5F;
      this.III = new SplittableRandom();
      this.II(System.nanoTime());
   }

   float[] l(float var1, float var2, float var3) {
      return this.I(var1, var2, var3, 0.65F);
   }

   void II(long var1) {
      SplittableRandom var3 = new SplittableRandom(var1);
      this.III = var3;
      this.l = var3.nextFloat();
      this.lI = var3.nextFloat() * 2.0F - 1.0F;
      this.ll = var3.nextFloat() * 2.0F - 1.0F;
      this.IIl = var3.nextFloat();
      this.IlI = var3.nextFloat() * 2.0F - 1.0F;
      this.I = var3.nextFloat() * 2.0F - 1.0F;
      this.Il = 4.6F + var3.nextFloat() * 3.4F;
      this.II = 5.4F + var3.nextFloat() * 4.2F;
   }

   void Il() {
      this.II(System.nanoTime());
   }
}
