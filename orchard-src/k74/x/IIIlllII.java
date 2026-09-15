package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IIIlllII {
   private static final int[] I;

   private IIIlllII() {
   }

   public static Color I(Color var0, double var1) {
      return II(var0, Color.WHITE, var1);
   }

   public static int l(int var0, int var1) {
      return Math.max(0, Math.min(IIl(1583960630, 1783937531 ^ 640595949), var1)) << IIl(1583960631, 1783937531 ^ -1134449300)
         | var0 & IIl(1583960628, 1783937531 ^ 1269737680);
   }

   private static int IIl(int var0, int var1) {
      int var2 = I[var0 ^ 1583960630] ^ var1 ^ var0;
      var2 -= 63714;
      var2 -= 16457;
      var2 -= 56692;
      var2 -= 58779;
      var2 -= 80;
      var2 -= 5137;
      return var2 + 55229;
   }

   public static Color II(Color var0, Color var1, double var2) {
      double var4 = Math.max(0.0, Math.min(1.0, var2));
      int var6 = (int)Math.round(var0.getRed() + (var1.getRed() - var0.getRed()) * var4);
      int var7 = (int)Math.round(var0.getGreen() + (var1.getGreen() - var0.getGreen()) * var4);
      int var8 = (int)Math.round(var0.getBlue() + (var1.getBlue() - var0.getBlue()) * var4);
      int var9 = (int)Math.round(var0.getAlpha() + (var1.getAlpha() - var0.getAlpha()) * var4);
      return new Color(var6, var7, var8, var9);
   }

   public static Color Il(int var0, int var1) {
      int var4 = 1278768612;
      double var2 = Math.max(0.0, Math.min(1.0, (double)var0 / Math.max(1, var1)));
      return II(
         new Color(IIl(1583960629, var4 ^ -671882780), IIl(1583960626, var4 ^ 842816877), IIl(1583960627, var4 ^ -33747405)),
         new Color(IIl(1583960624, var4 ^ -257232647), IIl(1583960625, var4 ^ 951415994), IIl(1583960638, var4 ^ 1813871100)),
         var2
      );
   }

   static {
      int var2 = 26562627;
      byte[] var0 = "\u0013\u00845¾\u0089Ë.\u0015\u007f\u0004+\u0081Ä5¯X!ú\u0013Bî;@ñãl¾³+s:2\u007fÛ7{§ðAéaÃ\u0099Ç\u0018¬Rw«\u0013@Æ\u0082/^:@-*'Á¨\u0095»"
         .getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      I = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         I[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);
   }

   public static Color lI(Color var0, int var1) {
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), Math.max(0, Math.min(IIl(1583960639, 1012410370 ^ -1000975798), var1)));
   }

   public static Color ll(Color var0, double var1) {
      return II(var0, Color.BLACK, var1);
   }

   public static Color III(double var0) {
      int var4 = -103760388;
      double var2 = Math.max(0.0, Math.min(1.0, var0));
      return II(
         new Color(IIl(1583960636, var4 ^ -940761191), IIl(1583960637, var4 ^ -1098722069), IIl(1583960634, var4 ^ 222152285)),
         new Color(IIl(1583960635, var4 ^ 604100752), IIl(1583960632, var4 ^ -435966950), IIl(1583960633, var4 ^ 1736840043)),
         var2
      );
   }
}
