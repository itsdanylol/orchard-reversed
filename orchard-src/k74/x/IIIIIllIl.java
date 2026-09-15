package k74.x;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class IIIIIllIl extends LinkedHashMap<String, IIIlII> {
   private static final int[] l = new int[1];
   final IIIllIIII I;

   private static int I(int var0, int var1) {
      int var2 = l[var0 ^ -1758068458] ^ var1 ^ var0;
      var2 -= 33497;
      var2 -= 63315;
      var2 -= 34819;
      var2 -= 23763;
      var2 += 61630;
      var2 ^= 57026;
      var2 -= 44127;
      return var2 ^ 47442;
   }

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "tÁ\u0095Õ".getBytes("ISO-8859-1");

      int var14;
      do {
         l[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1692028170;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);
   }

   @Override
   protected boolean removeEldestEntry(Entry<String, IIIlII> var1) {
      return this.size() > I(-1758068458, 1058799107 ^ -1204482403);
   }

   IIIIIllIl(IIIllIIII var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.I = var1;
   }
}
