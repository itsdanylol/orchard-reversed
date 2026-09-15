package k74.x;

import java.util.Arrays;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class IlllIllI {
   private static final int[] IlI;
   private int I;
   private static final int l = 12;
   private int II;
   private boolean Il;
   private double lI;
   private int ll;
   private final int[] III = new int[III(2071566540, -68886206 ^ -851796041)];
   private double IIl;

   private double I() {
      return this.Il ? this.IIl : this.II;
   }

   private int l() {
      return this.II;
   }

   static {
      int var2 = -1151267222;
      byte[] var0 = "N\u0093E\u009aÇ\u0090ê&öÇÍ¨".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      IlI = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         IlI[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);
   }

   private static int III(int var0, int var1) {
      int var2 = IlI[var0 ^ 2071566542] ^ var1 ^ var0;
      var2 += 38916;
      var2 -= 60789;
      var2 += 40217;
      var2 += 15483;
      var2 += 4242;
      var2 += 6844;
      var2 -= 57679;
      return var2 - 62481;
   }

   private double II() {
      return this.Il ? this.lI : 0.0;
   }

   private double Il(double var1) {
      if (this.ll <= 0) {
         return this.I();
      } else {
         double var3 = Math.max(0.0, Math.min(1.0, var1));
         int[] var5 = new int[this.ll];
         System.arraycopy(this.III, 0, var5, 0, this.ll);
         Arrays.sort(var5);
         int var6 = Math.max(0, Math.min(var5.length - 1, (int)Math.round((var5.length - 1) * var3)));
         return var5[var6];
      }
   }

   private void lI(int var1) {
      if (var1 > 0) {
         this.II = var1;
         this.III[this.I] = var1;
         this.I = (this.I + 1) % III(2071566542, -1313353610 ^ 1060972211);
         if (this.ll < III(2071566543, -1313353610 ^ -1237415666)) {
            this.ll++;
         }

         if (!this.Il) {
            this.IIl = var1;
            this.lI = var1 / 2.0;
            this.Il = true;
         } else {
            this.lI = 0.75 * this.lI + 0.25 * Math.abs(this.IIl - var1);
            this.IIl = 0.875 * this.IIl + 0.125 * var1;
         }
      }
   }

   private void ll() {
      this.IIl = 0.0;
      this.lI = 0.0;
      this.II = 0;
      this.Il = false;
      this.ll = 0;
      this.I = 0;
   }

   private IlllIllI() {
   }
}
