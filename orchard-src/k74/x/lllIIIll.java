package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
class lllIIIll {
   private static final int[] l;
   static final int[] I;

   static {
      int var3 = 2096405638;
      byte[] var1 = "ÚÏB?".getBytes("ISO-8859-1");
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
         I[lllIIlIl.Ill.ordinal()] = I(69075306, -1937732418 ^ 782622916);
      } catch (NoSuchFieldError var7) {
      }
   }

   private static int I(int var0, int var1) {
      int var2 = l[var0 ^ 69075306] ^ var1 ^ var0;
      var2 -= 9230;
      var2 -= 61759;
      var2 -= 3205;
      var2 += 29467;
      var2 += 56675;
      var2 -= 43378;
      var2 ^= 48181;
      var2 += 6075;
      var2 -= 14265;
      return var2 - 25810;
   }
}
