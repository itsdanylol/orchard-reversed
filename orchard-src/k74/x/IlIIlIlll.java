package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
class IlIIlIlll {
   static final int[] I;
   private static final int[] II;
   static final int[] l;

   static {
      int var3 = 1070408650;
      byte[] var1 = "p\fQg<ïÅ\u000e".getBytes("ISO-8859-1");
      int var2 = var1.length / 4;
      II = new int[var2];
      byte var4 = 0;
      int var5 = 0;

      do {
         int var6 = (var1[var4] & 255) << 24 | (var1[var4 + 1] & 255) << 16 | (var1[var4 + 2] & 255) << 8 | var1[var4 + 3] & 255;
         var6 ^= var3;
         II[var5] = var6;
         var4 += 4;
      } while (++var5 < var2);

      l = new int[IIllIllll.values().length];

      try {
         l[IIllIllll.I.ordinal()] = 1;
      } catch (NoSuchFieldError var16) {
      }

      try {
         l[IIllIllll.lII.ordinal()] = 2;
      } catch (NoSuchFieldError var15) {
      }

      try {
         l[IIllIllll.lIl.ordinal()] = 3;
      } catch (NoSuchFieldError var14) {
      }

      try {
         l[IIllIllll.II.ordinal()] = 4;
      } catch (NoSuchFieldError var13) {
      }

      try {
         l[IIllIllll.ll.ordinal()] = 5;
      } catch (NoSuchFieldError var12) {
      }

      try {
         l[IIllIllll.Ill.ordinal()] = I(1976897218, -520770297 ^ 622816090);
      } catch (NoSuchFieldError var11) {
      }

      try {
         l[IIllIllll.III.ordinal()] = I(1976897219, -520770297 ^ 1778188081);
      } catch (NoSuchFieldError var10) {
      }

      I = new int[llllIlI.values().length];

      try {
         I[llllIlI.III.ordinal()] = 1;
      } catch (NoSuchFieldError var9) {
      }

      try {
         I[llllIlI.IIl.ordinal()] = 2;
      } catch (NoSuchFieldError var8) {
      }

      try {
         I[llllIlI.ll.ordinal()] = 3;
      } catch (NoSuchFieldError var7) {
      }
   }

   private static int I(int var0, int var1) {
      int var2 = II[var0 ^ 1976897218] ^ var1 ^ var0;
      var2 += 63078;
      var2 -= 53067;
      var2 ^= 11856;
      var2 += 17021;
      var2 ^= 31947;
      var2 -= 25477;
      return var2 + 63034;
   }
}
