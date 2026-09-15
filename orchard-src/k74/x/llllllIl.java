package k74.x;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11231;
import net.minecraft.class_11244;
import net.minecraft.class_4588;
import net.minecraft.class_8030;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
record llllllIl(Matrix3x2fc a, float b, float c, float d, float e, float f, float g, int h, @Nullable class_8030 i, @Nullable class_8030 j)
   implements class_11244 {
   private final float I;
   private final float l;
   private final float II;
   private final float Il;
   @Nullable
   private final class_8030 lI;
   @Nullable
   private final class_8030 ll;
   private final int III;
   private final float IIl;
   private final float IlI;
   private final Matrix3x2fc Ill;

   private llllllIl(Matrix3x2fc a, float b, float c, float d, float e, float f, float g, int h, @Nullable class_8030 i, @Nullable class_8030 j) {
      this.Ill = a;
      this.l = b;
      this.I = c;
      this.Il = d;
      this.IlI = e;
      this.II = f;
      this.IIl = g;
      this.III = h;
      this.lI = i;
      this.ll = j;
   }

   public int l() {
      return this.III;
   }

   public float II() {
      return this.IlI;
   }

   public void method_70917(class_4588 var1) {
      float var2 = this.Il * 2.0F;
      IIlIlIlIl.lIIIl(var1, this.Ill, this.l - this.Il, this.I - this.Il, var2, var2, this.IlI, this.II, this.IIl, this.III);
   }

   public RenderPipeline comp_4055() {
      return IIlIlIlIl.lIlI;
   }

   public class_11231 comp_4056() {
      return IIlIlIlIl.llI;
   }

   public float lI() {
      return this.II;
   }

   public float ll() {
      return this.IIl;
   }

   private llllllIl(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, @Nullable class_8030 var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, IIlIlIlIl.lIllI(var2 - var4, var3 - var4, var4 * 2.0F, var4 * 2.0F, var1, var9));
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.lI;
   }

   public float III() {
      return this.l;
   }

   @Nullable
   public class_8030 comp_4274() {
      return this.ll;
   }

   public Matrix3x2fc IIl() {
      return this.Ill;
   }
}
