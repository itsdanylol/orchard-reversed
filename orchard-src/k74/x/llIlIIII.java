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
record llIlIIII(
   Matrix3x2fc a, float b, float c, float d, float e, float f, float g, int h, int i, int j, int k, int l, @Nullable class_8030 m, @Nullable class_8030 n
) implements class_11244 {
   private final int I;
   private final float II;
   @Nullable
   private final class_8030 Il;
   private final int lI;
   private final int ll;
   private final float l;
   private final Matrix3x2fc III;
   private final float IIl;
   private final float IlI;
   private final float Ill;
   private final int lII;
   private final int lIl;
   @Nullable
   private final class_8030 llI;
   private final float lll;

   @Nullable
   public class_8030 comp_4274() {
      return this.llI;
   }

   public int I() {
      return this.lI;
   }

   public float II() {
      return this.lll;
   }

   private llIlIIII(
      Matrix3x2fc a, float b, float c, float d, float e, float f, float g, int h, int i, int j, int k, int l, @Nullable class_8030 m, @Nullable class_8030 n
   ) {
      this.III = a;
      this.l = b;
      this.lll = c;
      this.Ill = d;
      this.IlI = e;
      this.IIl = f;
      this.II = g;
      this.lI = h;
      this.lII = i;
      this.lIl = j;
      this.I = k;
      this.ll = l;
      this.Il = m;
      this.llI = n;
   }

   public void method_70917(class_4588 var1) {
      IIlIlIlIl.IIII(var1, this.III, this.l, this.lll, this.Ill, this.IlI, this.IIl, this.II, this.lI, this.lII, this.lIl, this.I, this.ll);
   }

   public class_11231 comp_4056() {
      return IIlIlIlIl.llI;
   }

   public RenderPipeline comp_4055() {
      return IIlIlIlIl.III;
   }

   public float Il() {
      return this.Ill;
   }

   private llIlIIII(
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
      int var12,
      @Nullable class_8030 var13
   ) {
      this(
         var1,
         var2 - 1.25F,
         var3 - 1.25F,
         var4 + 2.5F,
         var5 + 2.5F,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         var12,
         var13,
         IIlIlIlIl.lIllI(var2 - 1.25F, var3 - 1.25F, var4 + 2.5F, var5 + 2.5F, var1, var13)
      );
   }

   public float lI() {
      return this.IIl;
   }

   public float ll() {
      return this.II;
   }

   public int III() {
      return this.ll;
   }

   public int l() {
      return this.I;
   }

   public int IIl() {
      return this.lIl;
   }

   public Matrix3x2fc IlI() {
      return this.III;
   }

   public float Ill() {
      return this.l;
   }

   public float lIl() {
      return this.IlI;
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.Il;
   }
}
