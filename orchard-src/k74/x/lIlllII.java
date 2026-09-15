package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lIlllII(IIIIlIl a, IlIIIllIl aK, int b, int c, boolean aN, int d) {
   private final int I;
   private final boolean l;
   private final int II;
   private final IlIIIllIl Il;
   private final int lI;
   private final IIIIlIl ll;

   public int I() {
      return this.II;
   }

   public int l() {
      return this.lI;
   }

   private lIlllII(IIIIlIl a, IlIIIllIl aK, int b, int c, boolean aN, int d) {
      this.ll = a;
      this.Il = aK;
      this.I = b;
      this.lI = c;
      this.l = aN;
      this.II = d;
   }

   public int II() {
      return this.I;
   }

   public boolean Il() {
      return this.l;
   }

   public IIIIlIl lI() {
      return this.ll;
   }

   public lIlllII ll(int var1) {
      return new lIlllII(this.ll, this.Il, this.I, this.lI, this.l, var1);
   }

   public IlIIIllIl III() {
      return this.Il;
   }
}
