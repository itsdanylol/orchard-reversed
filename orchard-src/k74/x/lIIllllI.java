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
record lIIllllI(class_11231 au, Matrix3x2fc av, float aw, float ax, float ay, float az, float aA, int aB, @Nullable class_8030 a, @Nullable class_8030 b)
   implements class_11244 {
   private final float I;
   private final float l;
   @Nullable
   private final class_8030 II;
   private final Matrix3x2fc Il;
   @Nullable
   private final class_8030 lI;
   private final int ll;
   private final class_11231 III;
   private final float IIl;
   private final float IlI;
   private final float Ill;

   private lIIllllI(class_11231 au, Matrix3x2fc av, float aw, float ax, float ay, float az, float aA, int aB, @Nullable class_8030 a, @Nullable class_8030 b) {
      this.III = au;
      this.Il = av;
      this.IIl = aw;
      this.l = ax;
      this.I = ay;
      this.Ill = az;
      this.IlI = aA;
      this.ll = aB;
      this.II = a;
      this.lI = b;
   }

   public void method_70917(class_4588 var1) {
      IIlIlIlIl.II(var1, this.Il, this.IIl, this.l, this.I, this.Ill, this.IlI, this.ll);
   }

   @Nullable
   public class_8030 comp_4069() {
      return this.II;
   }

   public float I() {
      return this.l;
   }

   public float l() {
      return this.I;
   }

   public float II() {
      return this.Ill;
   }

   public class_11231 Il() {
      return this.III;
   }

   public class_11231 comp_4056() {
      return this.III;
   }

   public float lI() {
      return this.IlI;
   }

   public float ll() {
      return this.IIl;
   }

   public Matrix3x2fc III() {
      return this.Il;
   }

   public RenderPipeline comp_4055() {
      return IIlIlIlIl.I;
   }

   @Nullable
   public class_8030 comp_4274() {
      return this.lI;
   }

   private lIIllllI(class_11231 var1, Matrix3x2fc var2, float var3, float var4, float var5, float var6, float var7, int var8, @Nullable class_8030 var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, IIlIlIlIl.lIllI(var3, var4, var5, var6, var2, var9));
   }

   public int IIl() {
      return this.ll;
   }
}
