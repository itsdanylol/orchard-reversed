package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IlIllIII extends IIllllIl<String> {
   private final Runnable I;
   private static final int[] II = new int[3];
   private static String[] l;

   private static void I() {
      l[0] = IlI("".toCharArray(), 43902L, Ill(-2014218074, -1537815828 ^ 1459763926));
   }

   public IlIllIII(Object var1, String var2, Runnable var3) {
      super(var1, var2 == null ? l[0] : var2);
      this.I = var3;
   }

   public void II() {
      if (this.I != null) {
         this.I.run();
      }
   }

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "\f°Ä\u0099|´OØOc;\u0004".getBytes("ISO-8859-1");

      int var14;
      do {
         II[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -575576068;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);

      l = new String[1];
      I();
   }

   public String lI() {
      return this.IllI();
   }

   private static int Ill(int var0, int var1) {
      int var2 = II[var0 ^ -2014218074] ^ var1 ^ var0;
      var2 += 46048;
      var2 ^= 10051;
      var2 += 34207;
      var2 ^= 63902;
      var2 -= 40987;
      var2 += 21404;
      var2 -= 62970;
      var2 ^= 13046;
      var2 -= 56649;
      return var2 ^ 12470;
   }

   public IlIllIII(Object var1, String var2) {
      this(var1, var2, null);
   }

   @Override
   public void ll(JsonElement var1) {
   }

   public void III(String var1) {
      super.Il(var1 == null ? l[0] : var1);
   }

   public IlIllIII(Object var1) {
      this(var1, l[0], null);
   }

   @Override
   public JsonElement IIl() {
      return JsonNull.INSTANCE;
   }

   private static String IlI(char[] var0, long var1, int var3) {
      int var4 = Ill(-2014218073, 1565675399 ^ 1745624384) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & Ill(-2014218076, 1565675399 ^ 1215318492);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
