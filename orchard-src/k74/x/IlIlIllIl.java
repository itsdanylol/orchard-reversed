package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IlIlIllIl(IIllIIIll a, IIlllll b, boolean c, boolean d) {
   private final boolean I;
   private final IIllIIIll l;
   private final IIlllll II;
   private final boolean Il;

   static IlIlIllIl I(IIllIIIll var0) {
      return new IlIlIllIl(var0, null, true, false);
   }

   public IIlllll l() {
      return this.II;
   }

   public boolean II() {
      return this.Il;
   }

   public IIllIIIll Il() {
      return this.l;
   }

   static IlIlIllIl lI(IIllIIIll var0) {
      return new IlIlIllIl(var0, null, false, false);
   }

   static IlIlIllIl ll(IIllIIIll var0, IIlllll var1, boolean var2) {
      return new IlIlIllIl(var0, var1, true, var2);
   }

   IlIlIllIl(IIllIIIll a, IIlllll b, boolean c, boolean d) {
      this.l = a;
      this.II = b;
      this.I = c;
      this.Il = d;
   }

   public boolean III() {
      return this.I;
   }
}
