package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public record lIIllll(
   llllIlI a,
   IIllIllll b,
   lIlllIII c,
   float equipSmoothing,
   float swingStrength,
   float swingRotationX,
   float swingRotationY,
   float swingRotationZ,
   float spinSpeed,
   float scale,
   float xOffset,
   float yOffset,
   float zOffset,
   float tilt,
   float rotationX,
   float rotationY,
   float rotationZ
) {
   private final float I;
   private final float II;
   private final float Il;
   private final float lI;
   private final float ll;
   private final float III;
   private final lIlllIII IIl;
   private final float IlI;
   private final float Ill;
   private final float lII;
   private final llllIlI lIl;
   private final IIllIllll llI;
   private final float lll;
   private final float IIII;
   private final float l;
   private final float IIIl;
   private final float IIlI;

   public float I() {
      return this.II;
   }

   public lIIllll(
      llllIlI a,
      IIllIllll b,
      lIlllIII c,
      float equipSmoothing,
      float swingStrength,
      float swingRotationX,
      float swingRotationY,
      float swingRotationZ,
      float spinSpeed,
      float scale,
      float xOffset,
      float yOffset,
      float zOffset,
      float tilt,
      float rotationX,
      float rotationY,
      float rotationZ
   ) {
      this.lIl = a;
      this.llI = b;
      this.IIl = c;
      this.ll = equipSmoothing;
      this.II = swingStrength;
      this.Il = swingRotationX;
      this.I = swingRotationY;
      this.IlI = swingRotationZ;
      this.Ill = spinSpeed;
      this.lII = scale;
      this.lI = xOffset;
      this.IIII = yOffset;
      this.l = zOffset;
      this.IIlI = tilt;
      this.lll = rotationX;
      this.IIIl = rotationY;
      this.III = rotationZ;
   }

   public float II() {
      return this.Il;
   }

   public float Il(float var1) {
      return this.IIl.I(class_3532.method_15363(var1, 0.0F, 1.0F));
   }

   public float lI() {
      return this.ll;
   }

   public llllIlI ll() {
      return this.lIl;
   }

   public float III(float var1) {
      return this.IIl.l(class_3532.method_15363(var1, 0.0F, 1.0F));
   }

   public float IIl() {
      return this.I;
   }

   public float IlI() {
      return this.l;
   }

   public float Ill() {
      return this.IIlI;
   }

   public float lII() {
      return this.lll;
   }

   public float lIl() {
      return this.lI;
   }

   public float llI() {
      return this.IIIl;
   }

   public float lll() {
      return this.lII;
   }

   public IIllIllll IIII() {
      return this.llI;
   }

   public float IIIl() {
      return this.IIII;
   }

   public float l() {
      return this.Ill;
   }

   public lIlllIII IIlI() {
      return this.IIl;
   }

   public float IIll() {
      return this.III;
   }

   public float IlII() {
      return this.IlI;
   }
}
