package k74.x;

public final class IlIIlll {
   private long I;
   private int l = -1;

   public boolean I(int var1, long var2) {
      return this.l == var1 && var2 >= this.I;
   }

   public void l() {
      this.l = -1;
      this.I = Long.MIN_VALUE;
   }

   public boolean II(int var1) {
      return this.l == var1;
   }

   public IlIIlll() {
      this.I = Long.MIN_VALUE;
   }

   public void Il(int var1, long var2, long var4) {
      this.l = var1;
      this.I = var2 + Math.max(0L, var4);
   }

   public static int lI(long var0) {
      return Math.max(0, (int)Math.ceil(Math.max(0L, var0) / 50.0));
   }
}
