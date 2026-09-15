package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;

@Environment(EnvType.CLIENT)
record IlIIlIIl(
   boolean available,
   String mediaId,
   String title,
   String artist,
   String album,
   long positionMs,
   long durationMs,
   boolean playing,
   long observedAtMs,
   class_2960 j,
   IIIlII k
) {
   private final class_2960 I;
   private final String II;
   private static final int[] l = new int[3];
   private final boolean Il;
   private final String lI;
   private final long ll;
   private final String III;
   private final String IIl;
   private final IIIlII IlI;
   private final long Ill;
   private final long lII;
   private final boolean lIl;
   private static String[] llI;

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "ÇK\u0011)yÙ\u0007pü_ñË".getBytes("ISO-8859-1");

      int var14;
      do {
         l[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1388756943;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);

      llI = new String[1];
      ll();
   }

   double I(long var1) {
      return this.ll <= 0L ? 0.0 : Math.max(0.0, Math.min(1.0, (double)this.Il(var1) / this.ll));
   }

   private static int IIll(int var0, int var1) {
      int var2 = l[var0 ^ 553439050] ^ var1 ^ var0;
      var2 += 30910;
      var2 += 23608;
      var2 ^= 12632;
      var2 ^= 34445;
      var2 -= 33025;
      return var2 + 2395;
   }

   long Il(long var1) {
      long var3 = this.lII;
      if (this.Il) {
         var3 += Math.max(0L, var1 - this.Ill);
      }

      return Math.max(0L, Math.min(var3, Math.max(0L, this.ll)));
   }

   public long lI() {
      return this.Ill;
   }

   private static void ll() {
      llI[0] = lll("".toCharArray(), 41855L, IIll(553439050, 1220894617 ^ -302627882));
   }

   public long III() {
      return this.ll;
   }

   public IIIlII IIl() {
      return this.IlI;
   }

   public boolean l() {
      return this.Il;
   }

   IlIIlIIl(
      boolean available,
      String mediaId,
      String title,
      String artist,
      String album,
      long positionMs,
      long durationMs,
      boolean playing,
      long observedAtMs,
      class_2960 j,
      IIIlII k
   ) {
      this.lIl = available;
      this.III = mediaId;
      this.lI = title;
      this.II = artist;
      this.IIl = album;
      this.lII = positionMs;
      this.ll = durationMs;
      this.Il = playing;
      this.Ill = observedAtMs;
      this.I = j;
      this.IlI = k;
   }

   public String IlI() {
      return this.III;
   }

   public boolean Ill() {
      return this.lIl;
   }

   static IlIIlIIl lII() {
      return new IlIIlIIl(false, llI[0], llI[0], llI[0], llI[0], 0L, 0L, false, 0L, null, IIIlII.III);
   }

   IlIIlIIl lIl(IIIlII var1) {
      return new IlIIlIIl(this.lIl, this.III, this.lI, this.II, this.IIl, this.lII, this.ll, this.Il, this.Ill, this.I, var1 == null ? IIIlII.III : var1);
   }

   public class_2960 llI() {
      return this.I;
   }

   private static String lll(char[] var0, long var1, int var3) {
      int var4 = IIll(553439051, 1908010441 ^ 1768623482) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIll(553439048, 1908010441 ^ 2332415);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public String IIII() {
      return this.IIl;
   }

   public String IIIl() {
      return this.lI;
   }

   public long IIlI() {
      return this.lII;
   }
}
