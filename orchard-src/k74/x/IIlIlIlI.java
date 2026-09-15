package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record IIlIlIlI(double a, float b, boolean c, IIIIIlIl d, boolean e, boolean f, boolean g, boolean h, boolean ap, boolean aq, double ar) {
   private final boolean I;
   private final double l;
   private final boolean II;
   private final boolean Il;
   private final boolean lI;
   private final IIIIIlIl ll;
   private final float III;
   private final double IIl;
   private final boolean IlI;
   private final boolean Ill;
   private final boolean lII;

   public boolean I() {
      return this.IlI;
   }

   public IIIIIlIl l() {
      return this.ll;
   }

   public boolean II() {
      return this.I;
   }

   IIlIlIlI(double var1, float var3, boolean var4, IIIIIlIl var5, boolean var6, boolean var7, boolean var8, boolean var9) {
      this(var1, var3, var4, var5, var6, var7, var8, var9, true, false, 1.0);
   }

   public double Il() {
      return this.l;
   }

   public boolean lI() {
      return this.Il;
   }

   public boolean ll() {
      return this.II;
   }

   public boolean III() {
      return this.lII;
   }

   public IIlIlIlI(double a, float b, boolean c, IIIIIlIl d, boolean e, boolean f, boolean g, boolean h, boolean ap, boolean aq, double ar) {
      this.IIl = a;
      this.III = b;
      this.IlI = c;
      this.ll = d;
      this.Ill = e;
      this.lI = f;
      this.Il = g;
      this.II = h;
      this.lII = ap;
      this.I = aq;
      this.l = ar;
   }

   public boolean IIl() {
      return this.lI;
   }

   public double IlI() {
      return this.IIl;
   }

   public float lII() {
      return this.III;
   }
}
