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
record IlIIllII(Matrix3x2fc a, float b, float c, float d, float e, float f, float g, int h, boolean i, @Nullable class_8030 j, @Nullable class_8030 k)
   implements class_11244 {
   @Nullable
   private final class_8030 I;
   private final boolean l;
   private final float II;
   private final float Il;
   private final Matrix3x2fc lI;
   private final float ll;
   private final float III;
   private final int IIl;
   private final float IlI;
   @Nullable
   private final class_8030 Ill;
   private final float lII;

   @Nullable
   public class_8030 comp_4069() {
      return this.I;
   }

   private IlIIllII(Matrix3x2fc a, float b, float c, float d, float e, float f, float g, int h, boolean i, @Nullable class_8030 j, @Nullable class_8030 k) {
      this.lI = a;
      this.IlI = b;
      this.II = c;
      this.Il = d;
      this.III = e;
      this.lII = f;
      this.ll = g;
      this.IIl = h;
      this.l = i;
      this.I = j;
      this.Ill = k;
   }

   @Nullable
   public class_8030 comp_4274() {
      return this.Ill;
   }

   public float I() {
      return this.ll;
   }

   public float l() {
      return this.IlI;
   }

   private IlIIllII(
      Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, boolean var9, @Nullable class_8030 var10
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, IIlIlIlIl.lIllI(var2, var3, var4, var5, var1, var10));
   }

   public RenderPipeline comp_4055() {
      return IIlIlIlIl.Il;
   }

   public class_11231 comp_4056() {
      return IIlIlIlIl.llI;
   }

   public boolean Il() {
      return this.l;
   }

   public void method_70917(class_4588 var1) {
      if (this.l) {
         IIlIlIlIl.IlII(var1, this.lI, this.IlI, this.II, this.Il, this.III, this.lII, this.ll, this.IIl);
      } else {
         IIlIlIlIl.lIl(var1, this.lI, this.IlI, this.II, this.Il, this.III, this.lII, this.IIl);
      }
   }

   public float lI() {
      return this.lII;
   }

   public int ll() {
      return this.IIl;
   }

   public Matrix3x2fc III() {
      return this.lI;
   }

   public float IIl() {
      return this.Il;
   }

   public float IlI() {
      return this.III;
   }
}
