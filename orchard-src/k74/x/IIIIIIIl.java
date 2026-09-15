package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
class IIIIIIIl {
   private static final int[] II = new int[1];
   static final int[] I;
   static final int[] l;

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "WÖì¤".getBytes("ISO-8859-1");

      int var25;
      do {
         II[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 194926038;
         var10000 += 1;
         var25 = var10001 + 4;
         var10001 += 4;
      } while (var25 < var10002.length);

      l = new int[IlIlll.values().length];

      try {
         l[IlIlll.III.ordinal()] = 1;
      } catch (NoSuchFieldError var10) {
      }

      try {
         l[IlIlll.ll.ordinal()] = 2;
      } catch (NoSuchFieldError var9) {
      }

      try {
         l[IlIlll.lI.ordinal()] = 3;
      } catch (NoSuchFieldError var8) {
      }

      try {
         l[IlIlll.IIl.ordinal()] = 4;
      } catch (NoSuchFieldError var7) {
      }

      I = new int[lllIIlIl.values().length];

      try {
         I[lllIIlIl.I.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         I[lllIIlIl.III.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         I[lllIIlIl.IIl.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         I[lllIIlIl.IlI.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      try {
         I[lllIIlIl.II.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
      }

      try {
         I[lllIIlIl.Ill.ordinal()] = I(1201786523, 1702529883 ^ 2123544670);
      } catch (NoSuchFieldError var1) {
      }
   }

   private static int I(int var0, int var1) {
      int var2 = II[var0 ^ 1201786523] ^ var1 ^ var0;
      var2 -= 58081;
      var2 += 20566;
      var2 -= 1816;
      var2 += 9858;
      var2 += 4609;
      var2 ^= 51930;
      var2 ^= 32400;
      var2 ^= 23199;
      return var2 - 3347;
   }
}
