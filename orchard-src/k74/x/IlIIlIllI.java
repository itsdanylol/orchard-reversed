package k74.x;

public record IlIIlIllI(boolean forward, boolean sprint, boolean jump) {
   private final boolean I;
   private static final IlIIlIllI l = new IlIIlIllI(false, false, false);
   private final boolean II;
   private final boolean Il;

   public IlIIlIllI(boolean forward, boolean sprint, boolean jump) {
      this.I = forward;
      this.Il = sprint;
      this.II = jump;
   }

   public boolean l() {
      return this.II;
   }

   public boolean II() {
      return this.Il;
   }
}
