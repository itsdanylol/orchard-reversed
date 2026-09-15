package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class llIlIlll {
   private final int I;
   private static final int[] II;
   private final long l;

   private static int l(int var0, int var1) {
      int var2 = II[var0 ^ 1539650143] ^ var1 ^ var0;
      var2 -= 20483;
      var2 += 43000;
      var2 += 15573;
      var2 += 8312;
      var2 -= 25100;
      var2 -= 302;
      return var2 ^ 32037;
   }

   @Override
   public int hashCode() {
      return Long.hashCode(this.l) * l(1539650143, -1561193864 ^ 279653613) + this.I;
   }

   private static llIlIlll I(IIIlIlIl var0) {
      return new llIlIlll(var0.I(), var0.llI());
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 instanceof String var3) {
         return var3.codePointCount(0, var3.length()) == this.I && IlIIllIII.IlIl(var3) == this.l;
      } else {
         return !(var1 instanceof IIIlIlIl var2) ? false : var2.llI() == this.I && var2.I() == this.l;
      }
   }

   static {
      int var2 = -1806274902;
      byte[] var0 = "}ÊIR".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      II = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         II[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);
   }

   private llIlIlll(long var1, int var3) {
      this.l = var1;
      this.I = var3;
   }
}
