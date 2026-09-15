package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// $VF: synthetic class
@Environment(EnvType.CLIENT)
class lIlllllI {
   private static final int[] l = new int[1];
   static final int[] I;

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "\u0099û\u009a²".getBytes("ISO-8859-1");

      int var21;
      do {
         l[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -2048848684;
         var10000 += 1;
         var21 = var10001 + 4;
         var10001 += 4;
      } while (var21 < var10002.length);

      I = new int[lllIIlIl.values().length];

      try {
         I[lllIIlIl.IlI.ordinal()] = 1;
      } catch (NoSuchFieldError var6) {
      }

      try {
         I[lllIIlIl.I.ordinal()] = 2;
      } catch (NoSuchFieldError var5) {
      }

      try {
         I[lllIIlIl.III.ordinal()] = 3;
      } catch (NoSuchFieldError var4) {
      }

      try {
         I[lllIIlIl.IIl.ordinal()] = 4;
      } catch (NoSuchFieldError var3) {
      }

      try {
         I[lllIIlIl.II.ordinal()] = 5;
      } catch (NoSuchFieldError var2) {
      }

      try {
         I[lllIIlIl.Ill.ordinal()] = I(-589980212, 1487361929 ^ -1738006304);
      } catch (NoSuchFieldError var1) {
      }
   }

   private static int I(int var0, int var1) {
      int var2 = l[var0 ^ -589980212] ^ var1 ^ var0;
      var2 ^= 7497;
      var2 ^= 56810;
      var2 -= 47470;
      var2 += 47040;
      var2 ^= 48347;
      var2 ^= 41870;
      var2 += 9670;
      var2 ^= 41570;
      var2 += 23736;
      return var2 ^ 50817;
   }
}
