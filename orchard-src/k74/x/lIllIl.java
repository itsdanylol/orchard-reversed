package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record lIllIl(boolean available, String mediaId, String title, String artist, String album, long positionMs, long durationMs, boolean playing, byte[] i) {
   private final boolean I;
   private final byte[] l;
   private final boolean II;
   private static final int[] lII;
   private final long Il;
   private final String lI;
   private final long ll;
   private final String III;
   private static String[] IIl;
   private final String IlI;
   private final String Ill;

   public boolean I() {
      return this.II;
   }

   public long l() {
      return this.ll;
   }

   public boolean II() {
      return this.I;
   }

   private static int llI(int var0, int var1) {
      int var2 = lII[var0 ^ 1680053263] ^ var1 ^ var0;
      var2 ^= 24184;
      var2 += 19288;
      var2 += 6987;
      var2 += 26345;
      var2 -= 37013;
      return var2 ^ 37622;
   }

   public String Il() {
      return this.III;
   }

   static lIllIl lI() {
      return new lIllIl(false, IIl[0], IIl[0], IIl[0], IIl[0], 0L, 0L, false, null);
   }

   private static String ll(char[] var0, long var1, int var3) {
      int var4 = llI(1680053263, -2034931940 ^ -334164685) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & llI(1680053262, -2034931940 ^ -791696390);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public String III() {
      return this.IlI;
   }

   public String IIl() {
      return this.lI;
   }

   private static void IlI() {
      IIl[0] = ll("".toCharArray(), 33192L, llI(1680053261, -962391465 ^ -1103140897));
   }

   public byte[] Ill() {
      return this.l;
   }

   public String lII() {
      return this.Ill;
   }

   static {
      int var2 = 436202863;
      byte[] var0 = "\u0090ô\u001a\u0014+¦¾í¦R\"¢".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      lII = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         lII[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);

      IIl = new String[1];
      IlI();
   }

   public long lIl() {
      return this.Il;
   }

   lIllIl(boolean available, String mediaId, String title, String artist, String album, long positionMs, long durationMs, boolean playing, byte[] i) {
      this.I = available;
      this.IlI = mediaId;
      this.lI = title;
      this.Ill = artist;
      this.III = album;
      this.Il = positionMs;
      this.ll = durationMs;
      this.II = playing;
      this.l = i;
   }
}
