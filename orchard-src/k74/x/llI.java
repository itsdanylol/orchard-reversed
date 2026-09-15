package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
class llI {
   private static final int[] l;
   static final int[] I;

   static {
      int var3 = -1135101423;
      byte[] var1 = "B{;£".getBytes("ISO-8859-1");
      int var2 = var1.length / 4;
      l = new int[var2];
      byte var4 = 0;
      int var5 = 0;

      do {
         int var6 = (var1[var4] & 255) << 24 | (var1[var4 + 1] & 255) << 16 | (var1[var4 + 2] & 255) << 8 | var1[var4 + 3] & 255;
         var6 ^= var3;
         l[var5] = var6;
         var4 += 4;
      } while (++var5 < var2);

      I = new int[lllIIlIl.values().length];

      try {
         I[lllIIlIl.IlI.ordinal()] = 1;
      } catch (NoSuchFieldError var12) {
      }

      try {
         I[lllIIlIl.I.ordinal()] = 2;
      } catch (NoSuchFieldError var11) {
      }

      try {
         I[lllIIlIl.III.ordinal()] = 3;
      } catch (NoSuchFieldError var10) {
      }

      try {
         I[lllIIlIl.IIl.ordinal()] = 4;
      } catch (NoSuchFieldError var9) {
      }

      try {
         I[lllIIlIl.II.ordinal()] = 5;
      } catch (NoSuchFieldError var8) {
      }

      try {
         I[lllIIlIl.Ill.ordinal()] = I(528760435, -1403154893 ^ 1307915336);
      } catch (NoSuchFieldError var7) {
      }
   }

   private static int I(int var0, int var1) {
      int var2 = l[var0 ^ 528760435] ^ var1 ^ var0;
      var2 += 60598;
      var2 ^= 27953;
      var2 -= 43578;
      var2 += 5486;
      var2 ^= 13044;
      var2 ^= 64045;
      var2 ^= 12355;
      return var2 ^ 62185;
   }
}
