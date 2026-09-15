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
record IllllIl(Matrix3x2fc a, float b, float c, float d, float e, int f, boolean g, @Nullable class_8030 h, @Nullable class_8030 i) implements class_11244 {
   private final int I;
   @Nullable
   private final class_8030 l;
   @Nullable
   private final class_8030 II;
   private final boolean Il;
   private final Matrix3x2fc lI;
   private final float ll;
   private final float III;
   private final float IIl;
   private final float IlI;

   public RenderPipeline comp_4055() {
      return IIlIlIlIl.Il;
   }

   public void method_70917(class_4588 var1) {
      if (this.Il) {
         IIlIlIlIl.III(var1, this.lI, this.IlI, this.III, this.IIl, this.ll, this.I);
      } else {
         IIlIlIlIl.IIIIl(var1, this.lI, this.IlI, this.III, this.IIl, this.I);
      }
   }

   public float I() {
      return this.III;
   }

   public float l() {
      return this.IlI;
   }

   @Nullable
   public class_8030 comp_4274() {
      return this.l;
   }

   public float II() {
      return this.IIl;
   }

   private IllllIl(Matrix3x2fc a, float b, float c, float d, float e, int f, boolean g, @Nullable class_8030 h, @Nullable class_8030 i) {
      this.lI = a;
      this.IlI = b;
      this.III = c;
      this.IIl = d;
      this.ll = e;
      this.I = f;
      this.Il = g;
      this.II = h;
      this.l = i;
   }

   private IllllIl(Matrix3x2fc var1, float var2, float var3, float var4, float var5, int var6, boolean var7, @Nullable class_8030 var8, float var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, IIlIlIlIl.lIllI(var2 - var9, var3 - var9, var9 * 2.0F, var9 * 2.0F, var1, var8));
   }

   public int Il() {
      return this.I;
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.II;
   }

   public class_11231 comp_4056() {
      return IIlIlIlIl.llI;
   }

   public boolean III() {
      return this.Il;
   }
}
