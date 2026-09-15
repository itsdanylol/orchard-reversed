package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record IIIlIlI(long a, IIIIllI b, IIIlIlIl i, IIIlIlIl j, long c, long d) {
   private final IIIlIlIl I;
   private final IIIIllI l;
   private final long II;
   private final IIIlIlIl Il;
   private final long lI;
   private final long ll;

   public String I() {
      return this.Il.llIl();
   }

   public String II() {
      return this.I.llIl();
   }

   public long Il() {
      return this.ll + this.II;
   }

   public IIIlIlIl lI() {
      return this.I;
   }

   public long ll() {
      return this.lI;
   }

   public IIIlIlIl III() {
      return this.Il;
   }

   public IIIlIlIl IIl() {
      return this.I;
   }

   public long IlI() {
      return this.ll;
   }

   public IIIIllI Ill() {
      return this.l;
   }

   public IIIlIlI(long a, IIIIllI b, IIIlIlIl i, IIIlIlIl j, long c, long d) {
      this.lI = a;
      this.l = b;
      this.Il = i;
      this.I = j;
      this.ll = c;
      this.II = d;
   }

   public long lII() {
      return this.II;
   }

   public IIIlIlIl l() {
      return this.Il;
   }
}
