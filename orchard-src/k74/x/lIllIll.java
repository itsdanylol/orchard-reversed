package k74.x;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class lIllIll {
   private final long I;
   private final int l;
   private static final int[] Il;
   private final byte[] II;

   private void I() {
      if (this.II != null) {
         Arrays.fill(this.II, (byte)0);
      }
   }

   private static lIllIll l(byte[] var0, int var1, int var2) {
      long var3 = IlIIllIII.Il.nextLong();
      byte[] var5 = new byte[var2];

      for (int var6 = 0; var6 < var2; var6++) {
         var5[var6] = (byte)(var0[var1 + var6] ^ II(var3, var6));
      }

      return new lIllIll(var5, var3, IlIIllIII.ll(var0, var1, var1 + var2));
   }

   private static byte II(long var0, int var2) {
      long var3 = var0 + -7046029254386353131L * ((var2 >>> 3) + 1L);
      long var5 = lI(var3);
      return (byte)(var5 >>> ((var2 & III(1218773125, -1892317573 ^ -594212759)) << 3));
   }

   static {
      int var2 = -1245128774;
      byte[] var0 = "Q2WÎm\u0092\u009amÏÊç\u0081Ö¼\u00838".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      Il = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         Il[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);
   }

   private byte[] Il() {
      if (!IlIIllIII.II && this.II != null && this.II.length != 0) {
         byte[] var1 = new byte[this.II.length];

         for (int var2 = 0; var2 < this.II.length; var2++) {
            var1[var2] = (byte)(this.II[var2] ^ II(this.I, var2));
         }

         return var1;
      } else {
         return new byte[0];
      }
   }

   private static long lI(long var0) {
      var0 = (var0 ^ var0 >>> III(1218773124, -442465675 ^ -1969176518)) * -4658895280553007687L;
      var0 = (var0 ^ var0 >>> III(1218773127, -442465675 ^ 687390166)) * -7723592293110705685L;
      return var0 ^ var0 >>> III(1218773126, -442465675 ^ 831445354);
   }

   private String ll() {
      if (!IlIIllIII.II && this.II != null && this.II.length != 0) {
         byte[] var1 = this.Il();

         String var2;
         try {
            var2 = new String(var1, StandardCharsets.UTF_8);
         } finally {
            Arrays.fill(var1, (byte)0);
         }

         return var2;
      } else {
         return "";
      }
   }

   private static int III(int var0, int var1) {
      int var2 = Il[var0 ^ 1218773125] ^ var1 ^ var0;
      var2 += 6973;
      var2 ^= 38805;
      var2 -= 13530;
      var2 += 16274;
      var2 += 11381;
      return var2 + 2853;
   }

   private lIllIll(byte[] var1, long var2, int var4) {
      this.II = var1;
      this.I = var2;
      this.l = var4;
      synchronized (IlIIllIII.I) {
         IlIIllIII.I.add(this);
      }
   }
}
