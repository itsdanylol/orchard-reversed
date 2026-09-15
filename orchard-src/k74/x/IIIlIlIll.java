package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record IIIlIlIll(float a, float b, float c, float d, float e, float am, float f, float g) {
   private final float I;
   private final float l;
   private final float II;
   private final float Il;
   private final float lI;
   private final float ll;
   private final float III;
   private final float IIl;

   public float I() {
      return this.III;
   }

   public float l() {
      return this.lI;
   }

   public float II() {
      return this.l;
   }

   IIIlIlIll(float var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this(var1, var2, var3, var4, var5, 0.0F, var6, var7);
   }

   public float Il() {
      return this.I;
   }

   public float lI() {
      return this.Il;
   }

   public float ll() {
      return this.IIl;
   }

   public float III() {
      return this.II;
   }

   public float IIl() {
      return this.ll;
   }

   static IIIlIlIll IlI() {
      return new IIIlIlIll(0.85F, 0.08F, 0.0F, 0.0F, 0.65F, 0.0F, 1.0F, 1.0F);
   }

   public IIIlIlIll(float a, float b, float c, float d, float e, float am, float f, float g) {
      a = IlIIIllll.IIllIII(a, 0.0F, 1.0F);
      b = IlIIIllll.IIllIII(b, 0.0F, 0.5F);
      c = IlIIIllll.IIllIII(c, 0.0F, 1.0F);
      d = IlIIIllll.IIllIII(d, 0.0F, 1.0F);
      e = IlIIIllll.IIllIII(e, 0.0F, 1.0F);
      am = IlIIIllll.IIllIII(am, 0.0F, 1.0F);
      f = IlIIIllll.IIllIII(f, 0.0F, 1.0F);
      g = IlIIIllll.IIllIII(g, 0.0F, 1.0F);
      this.III = a;
      this.Il = b;
      this.l = c;
      this.I = d;
      this.II = e;
      this.lI = am;
      this.IIl = f;
      this.ll = g;
   }
}
