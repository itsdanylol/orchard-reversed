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
record lIIIll(Matrix3x2fc a, float b, float c, float d, float e, float f, int g, int h, @Nullable class_8030 i, @Nullable class_8030 j) implements class_11244 {
   private final float I;
   private final Matrix3x2fc l;
   private final float II;
   private final int Il;
   private final float lI;
   private final int ll;
   @Nullable
   private final class_8030 III;
   private final float IIl;
   private final float IlI;
   @Nullable
   private final class_8030 Ill;

   public Matrix3x2fc I() {
      return this.l;
   }

   public float l() {
      return this.lI;
   }

   public int II() {
      return this.ll;
   }

   public float Il() {
      return this.IIl;
   }

   public float lI() {
      return this.I;
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.III;
   }

   private lIIIll(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, @Nullable class_8030 var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, IIlIlIlIl.lIllI(var2 - var4, var3 - var4, var4 * 2.0F, var4 * 2.0F, var1, var9));
   }

   public class_11231 comp_4056() {
      return IIlIlIlIl.llI;
   }

   public void method_70917(class_4588 var1) {
      float var2 = this.lI * 2.0F;
      IIlIlIlIl.IIII(var1, this.l, this.II - this.lI, this.I - this.lI, var2, var2, this.IlI, this.IIl, this.ll, this.Il, this.Il, this.Il, this.Il);
   }

   private lIIIll(Matrix3x2fc a, float b, float c, float d, float e, float f, int g, int h, @Nullable class_8030 i, @Nullable class_8030 j) {
      this.l = a;
      this.II = b;
      this.I = c;
      this.lI = d;
      this.IlI = e;
      this.IIl = f;
      this.ll = g;
      this.Il = h;
      this.III = i;
      this.Ill = j;
   }

   public float ll() {
      return this.II;
   }

   public float III() {
      return this.IlI;
   }

   public int IIl() {
      return this.Il;
   }

   public RenderPipeline comp_4055() {
      return IIlIlIlIl.III;
   }

   @Nullable
   public class_8030 comp_4274() {
      return this.Ill;
   }
}
