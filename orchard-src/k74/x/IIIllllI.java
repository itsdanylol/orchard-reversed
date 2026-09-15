package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public record IIIllllI(float a, IIlIIIIl b, IlIIIlIlI c, boolean d, IIllII e, IIIlIlIll f, boolean g, float aC, boolean aD) {
   private final boolean I;
   private final float l;
   private final boolean II;
   private final IlIIIlIlI Il;
   private final float lI;
   private final IIlIIIIl ll;
   private final IIIlIlIll III;
   private final boolean IIl;
   private final IIllII IlI;

   IIIllllI(float var1, IIlIIIIl var2, IlIIIlIlI var3, boolean var4, IIllII var5) {
      this(var1, var2, var3, var4, var5, IIIlIlIll.IlI(), false, 1.0F);
   }

   public float I() {
      return this.l;
   }

   public IIIllllI(float var1, IIlIIIIl var2, IlIIIlIlI var3, boolean var4, IIllII var5, IIIlIlIll var6, boolean var7, float var8) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, false);
   }

   IIIllllI(float var1, IIlIIIIl var2, IlIIIlIlI var3, boolean var4, IIllII var5, IIIlIlIll var6) {
      this(var1, var2, var3, var4, var5, var6, false, 1.0F);
   }

   IIIllllI(float var1, IIlIIIIl var2, IlIIIlIlI var3, boolean var4, IIllII var5, boolean var6) {
      this(var1, var2, var3, var4, var5, IIIlIlIll.IlI(), var6, 1.0F);
   }

   public float l() {
      return this.lI;
   }

   public IIIllllI(float a, IIlIIIIl b, IlIIIlIlI c, boolean d, IIllII e, IIIlIlIll f, boolean g, float aC, boolean aD) {
      if (e == null) {
         e = IIllII.IIII(a, c);
      }

      if (f == null) {
         f = IIIlIlIll.IlI();
      }

      if (!Float.isFinite(aC) || aC <= 0.0F) {
         aC = 1.0F;
      }

      this.l = a;
      this.ll = b;
      this.Il = c;
      this.I = d;
      this.IlI = e;
      this.III = f;
      this.II = g;
      this.lI = aC;
      this.IIl = aD;
   }

   IIIllllI(float var1, IIlIIIIl var2, IlIIIlIlI var3, boolean var4) {
      this(var1, var2, var3, var4, IIllII.IIII(var1, var3), IIIlIlIll.IlI(), false, 1.0F);
   }

   public boolean lI() {
      return this.I;
   }

   public IIIlIlIll ll() {
      return this.III;
   }

   static IIIllllI III(float var0, boolean var1) {
      float var2 = Float.isFinite(var0) ? var0 : 0.0F;
      float var3 = class_3532.method_15363(var2 / 100.0F, 0.01F, 1.0F);
      float var4 = class_3532.method_15363(var2 * 4.5F, 120.0F, 485.0F);
      float var5 = class_3532.method_15363(var2 / 18.0F, 1.0F, 20.0F);
      float var6 = class_3532.method_15363(1.05F - var2 / 100.0F * 0.7F, 0.08F, 0.85F);
      float var7 = class_3532.method_15363(var2 / 100.0F, 0.01F, 2.5F);
      return new IIIllllI(
         var4, IIlIIIIl.II, IlIIIlIlI.II, var1, IIllII.IIII(var4, IlIIIlIlI.II), new IIIlIlIll(var6, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, var7, var7), false, var5
      );
   }

   public IIllII IIl() {
      return this.IlI;
   }

   static IIIllllI IlI(float var0) {
      float var1 = Float.isFinite(var0) ? Math.max(1.0F, var0) : 50.0F;
      float var2 = class_3532.method_15363(var1 / 100.0F, 0.01F, 1.0F);
      float var3 = class_3532.method_15363(var1 * 3.2F, 107.0F, 320.0F);
      float var4 = class_3532.method_15363(0.78F - var2 * 0.32F, 0.42F, 0.78F);
      float var5 = class_3532.method_15363(var1 / 38.0F, 0.65F, 2.85F);
      return new IIIllllI(
         var3, IIlIIIIl.II, IlIIIlIlI.II, true, IIllII.IIII(var3, IlIIIlIlI.II), new IIIlIlIll(var4, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, var2, var2), false, var5
      );
   }

   public IIlIIIIl Ill() {
      return this.ll;
   }

   public boolean lII() {
      return this.IIl;
   }

   static IIIllllI lIl(float var0) {
      return III(var0, true);
   }
}
