package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIIllIlI(
   IlII a,
   boolean rosterCheck,
   boolean pingCheck,
   boolean identityCheck,
   boolean invisibilityCheck,
   boolean positionCheck,
   boolean airMovementCheck,
   boolean duplicateIdentityCheck,
   boolean entityIdCheck,
   long j
) {
   private final boolean I;
   private final boolean l;
   private final boolean II;
   private final boolean Il;
   private final boolean lI;
   private final IlII ll;
   private final boolean III;
   private final boolean IIl;
   private final long IlI;
   private final boolean Ill;

   public IlII l() {
      return this.ll;
   }

   private IIIllIlI(
      IlII a,
      boolean rosterCheck,
      boolean pingCheck,
      boolean identityCheck,
      boolean invisibilityCheck,
      boolean positionCheck,
      boolean airMovementCheck,
      boolean duplicateIdentityCheck,
      boolean entityIdCheck,
      long j
   ) {
      this.ll = a;
      this.Il = rosterCheck;
      this.Ill = pingCheck;
      this.IIl = identityCheck;
      this.III = invisibilityCheck;
      this.lI = positionCheck;
      this.l = airMovementCheck;
      this.II = duplicateIdentityCheck;
      this.I = entityIdCheck;
      this.IlI = j;
   }

   public boolean II() {
      return this.Ill;
   }

   public boolean Il() {
      return this.III;
   }

   public long lI() {
      return this.IlI;
   }

   public boolean ll() {
      return this.IIl;
   }

   public boolean III() {
      return this.II;
   }

   public boolean IIl() {
      return this.l;
   }

   public boolean IlI() {
      return this.lI;
   }

   public boolean Ill() {
      return this.Il;
   }
}
