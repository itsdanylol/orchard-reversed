package k74.x;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
class lIlIIlll extends LinkedHashMap<IIIIlllI, class_243> {
   private static final int[] l;
   final IIlIllll I;

   static {
      int var2 = -1678536355;
      byte[] var0 = "Õó«m".getBytes("ISO-8859-1");
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

   lIlIIlll(IIlIllll var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.I = var1;
   }

   private static int I(int var0, int var1) {
      int var2 = l[var0 ^ -754792929] ^ var1 ^ var0;
      var2 ^= 23328;
      var2 += 4924;
      var2 -= 58828;
      var2 ^= 38763;
      var2 -= 64496;
      var2 -= 5156;
      return var2 + 4812;
   }

   @Override
   protected boolean removeEldestEntry(Entry<IIIIlllI, class_243> var1) {
      return this.size() > I(-754792929, -1546641739 ^ 1054049577);
   }
}
