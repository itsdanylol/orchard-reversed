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
record IIlIIIllI(
   Matrix3x2fc a,
   float b,
   float c,
   float d,
   float e,
   float f,
   float g,
   float h,
   float i,
   int j,
   float aE,
   class_11231 k,
   @Nullable class_8030 l,
   @Nullable class_8030 m
) implements class_11244 {
   private final float I;
   private final float II;
   private final float Il;
   private final float lI;
   @Nullable
   private final class_8030 ll;
   private final float III;
   private final float IIl;
   private final class_11231 IlI;
   private final float Ill;
   @Nullable
   private final class_8030 lII;
   private final int l;
   private final Matrix3x2fc lIl;
   private final float llI;
   private final float lll;

   public float I() {
      return this.IIl;
   }

   public float l() {
      return this.Ill;
   }

   public void method_70917(class_4588 var1) {
      IIlIlIlIl.lIIII(var1, this.lIl, this.llI, this.III, this.IIl, this.Ill, this.Il, this.II, this.I, this.lll, this.l, this.lI);
   }

   private IIlIIIllI(
      Matrix3x2fc a,
      float b,
      float c,
      float d,
      float e,
      float f,
      float g,
      float h,
      float i,
      int j,
      float aE,
      class_11231 k,
      @Nullable class_8030 l,
      @Nullable class_8030 m
   ) {
      this.lIl = a;
      this.llI = b;
      this.III = c;
      this.IIl = d;
      this.Ill = e;
      this.Il = f;
      this.II = g;
      this.I = h;
      this.lll = i;
      this.l = j;
      this.lI = aE;
      this.IlI = k;
      this.lII = l;
      this.ll = m;
   }

   public RenderPipeline comp_4055() {
      return IIlIlIlIl.lll;
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.lII;
   }

   public float II() {
      return this.I;
   }

   public float Il() {
      return this.llI;
   }

   public float lI() {
      return this.Il;
   }

   public float ll() {
      return this.lI;
   }

   public class_11231 comp_4056() {
      return this.IlI;
   }

   public Matrix3x2fc III() {
      return this.lIl;
   }

   public class_11231 IIl() {
      return this.IlI;
   }

   private IIlIIIllI(
      Matrix3x2fc var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      int var10,
      float var11,
      class_11231 var12,
      @Nullable class_8030 var13
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, IIlIlIlIl.lIllI(var2, var3, var4, var5, var1, var13));
   }

   public float IlI() {
      return this.III;
   }

   public int Ill() {
      return this.l;
   }

   @Nullable
   public class_8030 comp_4274() {
      return this.ll;
   }

   public float lII() {
      return this.II;
   }

   public float lIl() {
      return this.lll;
   }
}
