package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class lIllll {
   private final IIIlIlIl I;
   private final long l;
   private final IIIlIlIl II;
   private final int Il;
   private static final int[] ll = new int[4];
   private final int lI;

   public JsonElement I() {
      return new JsonPrimitive(this.III());
   }

   private static int l(IIIlIlIl var0) {
      int[] var1 = new int[]{0};
      var0.IIII(lIllll::II);
      return var1[0];
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return var1 instanceof lIllll var2 && this.l == var2.l && this.I.I() == var2.I.I()
            ? this.III().equals(var2.III()) && this.IlI().equals(var2.IlI())
            : false;
      }
   }

   private static int Ill(int var0, int var1) {
      int var2 = ll[var0 ^ 546034004] ^ var1 ^ var0;
      var2 += 44190;
      var2 -= 52716;
      var2 += 14038;
      var2 -= 12997;
      var2 += 26728;
      var2 += 19085;
      var2 ^= 29089;
      return var2 ^ 12416;
   }

   @Override
   public int hashCode() {
      return Ill(546034004, 616862059 ^ 1520669657) * this.Il + this.lI;
   }

   private static void II(int[] var0, int var1) {
      if (Character.isBmpCodePoint(var1)) {
         var0[0] = Ill(546034005, -1025159597 ^ 564266800) * var0[0] + var1;
      } else {
         char[] var2 = Character.toChars(var1);
         var0[0] = Ill(546034006, -1025159597 ^ 377791926) * var0[0] + var2[0];
         var0[0] = Ill(546034007, -1025159597 ^ -2020650694) * var0[0] + var2[1];
      }
   }

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "\u0087ESä\u001ae\u00184-Cº±¼HN<".getBytes("ISO-8859-1");

      int var14;
      do {
         ll[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 643181444;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);
   }

   public lIllll(Object var1, Object var2) {
      this.II = IIl(var1);
      this.I = IIl(var2);
      this.l = this.II.I();
      this.Il = l(this.II);
      this.lI = l(this.I);
   }

   public IIIlIlIl Il() {
      return this.II;
   }

   public IIIlIlIl lI() {
      return this.I;
   }

   public long ll() {
      return this.l;
   }

   public String III() {
      return this.II.llIl();
   }

   private static IIIlIlIl IIl(Object var0) {
      return IlIIllIII.l(var0);
   }

   public String IlI() {
      return this.I.llIl();
   }

   public lIllll(String var1, IIIlIlIl var2) {
      this((Object)var1, (Object)var2);
   }

   public lIllll(String var1, String var2) {
      this(var1, (Object)var2);
   }

   public lIllll(String var1, Object var2) {
      this((Object)var1, var2);
   }
}
