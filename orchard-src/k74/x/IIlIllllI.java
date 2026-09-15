package k74.x;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class IIlIllllI extends LinkedHashMap<String, String> {
   private static final int[] l;
   final IIlllllII I;

   private static int I(int var0, int var1) {
      int var2 = l[var0 ^ 558336788] ^ var1 ^ var0;
      var2 -= 59594;
      var2 -= 35569;
      var2 -= 12602;
      var2 += 29589;
      var2 ^= 3717;
      var2 ^= 8991;
      var2 -= 17518;
      return var2 ^ 19954;
   }

   @Override
   protected boolean removeEldestEntry(Entry<String, String> var1) {
      return this.size() > I(558336788, 34171466 ^ -2039001030);
   }

   static {
      int var2 = -406863774;
      byte[] var0 = "B\u0087\u009a\\".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      l = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         l[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);
   }

   IIlIllllI(IIlllllII var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.I = var1;
   }
}
