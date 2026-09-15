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
record IIIlI(Matrix3x2fc a, float b, float c, float d, float e, float f, int g, @Nullable class_8030 h, @Nullable class_8030 i) implements class_11244 {
   private final float I;
   private final float l;
   private final int II;
   private final float Il;
   private final float lI;
   private final float ll;
   private final Matrix3x2fc III;
   @Nullable
   private final class_8030 IIl;
   @Nullable
   private final class_8030 IlI;

   public void method_70917(class_4588 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (this.l <= 0.5F) {
         IIlIlIlIl.IIlll(var1, this.III, this.I, this.ll, 0.0F, 0.0F, this.II);
         IIlIlIlIl.IIlll(var1, this.III, this.I, this.ll + this.Il, 0.0F, 1.0F, this.II);
         IIlIlIlIl.IIlll(var1, this.III, this.I + this.lI, this.ll + this.Il, 1.0F, 1.0F, this.II);
         IIlIlIlIl.IIlll(var1, this.III, this.I, this.ll, 0.0F, 0.0F, this.II);
         IIlIlIlIl.IIlll(var1, this.III, this.I + this.lI, this.ll + this.Il, 1.0F, 1.0F, this.II);
         IIlIlIlIl.IIlll(var1, this.III, this.I + this.lI, this.ll, 1.0F, 0.0F, this.II);
         if (var2 == null) {
            return;
         }
      }

      IIlIlIlIl.II(var1, this.III, this.I, this.ll, this.lI, this.Il, this.l, this.II);
   }

   public float I() {
      return this.lI;
   }

   private IIIlI(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, int var7, @Nullable class_8030 var8) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, IIlIlIlIl.lIllI(var2, var3, var4, var5, var1, var8));
   }

   public float l() {
      return this.I;
   }

   public class_11231 comp_4056() {
      return IIlIlIlIl.llI;
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.IIl;
   }

   public Matrix3x2fc Il() {
      return this.III;
   }

   public RenderPipeline comp_4055() {
      return IIlIlIlIl.IIl;
   }

   public float lI() {
      return this.l;
   }

   private IIIlI(Matrix3x2fc a, float b, float c, float d, float e, float f, int g, @Nullable class_8030 h, @Nullable class_8030 i) {
      this.III = a;
      this.I = b;
      this.ll = c;
      this.lI = d;
      this.Il = e;
      this.l = f;
      this.II = g;
      this.IIl = h;
      this.IlI = i;
   }

   @Nullable
   public class_8030 comp_4274() {
      return this.IlI;
   }

   public float III() {
      return this.Il;
   }
}
