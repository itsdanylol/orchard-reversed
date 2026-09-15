package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record IIlIlIII(int a, int b, int c, int d, boolean e, boolean f, llllIllI g) {
   private static final int[] IIl;
   private final int I;
   private final llllIllI l;
   private final int II;
   private final int Il;
   private final boolean lI;
   private final boolean ll;
   private final int III;

   public llllIllI I() {
      return this.l;
   }

   public int l() {
      return this.II;
   }

   public int II() {
      return this.Il;
   }

   static IIlIlIII Il(int var0) {
      return new IIlIlIII(-1, var0, IlI(1288000000, -176065874 ^ 1763226293), IlI(1288000001, -176065874 ^ -590712951), false, false, null);
   }

   private static int IlI(int var0, int var1) {
      int var2 = IIl[var0 ^ 1288000000] ^ var1 ^ var0;
      var2 += 40358;
      var2 -= 11616;
      var2 += 60484;
      var2 += 40878;
      var2 -= 64618;
      var2 -= 34377;
      var2 -= 21683;
      var2 -= 24724;
      var2 ^= 5416;
      return var2 - 27583;
   }

   static {
      int var2 = 1910725935;
      byte[] var0 = "!¿um\u0094m¨Q".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      IIl = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         IIl[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);
   }

   public int lI() {
      return this.III;
   }

   public boolean ll() {
      return this.lI;
   }

   public int III() {
      return this.I;
   }

   public IIlIlIII(int a, int b, int c, int d, boolean e, boolean f, llllIllI g) {
      this.II = a;
      this.I = b;
      this.III = c;
      this.Il = d;
      this.lI = e;
      this.ll = f;
      this.l = g;
   }

   public boolean IIl() {
      return this.ll;
   }
}
