package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IllIIlIl {
   private static final double I = 1.6E-4;
   private static final double l = 0.0027;
   private static final int[] Il;
   private static final double II = 0.0042;

   private static MatchException I(MatchException var0) {
      return var0;
   }

   private static Color l(Color var0, double var1, int var3) {
      int var10 = 2076168534;
      double var4 = System.currentTimeMillis() * 0.0027 + var1 * 2.2;
      Color var6 = lll(new Color(IIII(-702221902, var10 ^ -1838611352), IIII(-702221901, var10 ^ -2138277320), IIII(-702221904, var10 ^ 1637489727)), var3);
      Color var7 = lll(new Color(IIII(-702221903, var10 ^ 1493019781), IIII(-702221898, var10 ^ 968306067), IIII(-702221897, var10 ^ -28366019)), var3);
      Color var8 = lll(lIl(var0, 1.18), var3);
      Color var9 = lII(var6, var7, 0.5 + 0.5 * Math.sin(var4));
      return lll(lII(var8, var9, 0.42 + 0.28 * Math.cos(var4 * 0.7)), var3);
   }

   static {
      int var2 = 1396272809;
      byte[] var0 = "lËGn~.#o\u009f8XÚ¦_ï\u0091Ç\u0015iù\u0000íoß?B5~Q&¥Ô+\u0000Æ\rVëÃSmtY[½ij\t\u0004\u0004ð]òª~\u009cÆX\u0095\u008eU#»!"
         .getBytes("ISO-8859-1");
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

   private static int II(int var0) {
      return Math.max(0, Math.min(IIII(-702221900, 470058380 ^ -1503976123), var0));
   }

   public static Color Il(Color var0, IIlIlIIl var1, double var2) {
      return lI(var0, var1, var2 + 0.19);
   }

   public static Color lI(Color var0, IIlIlIIl var1, double var2) {
      int var10000;
      label16: {
         try {
            if (var0 == null) {
               var10000 = IIII(-702221899, 897118 ^ -734625732);
               break label16;
            }
         } catch (MatchException var5) {
            throw I(var5);
         }

         var10000 = var0.getAlpha();
      }

      int var4 = var10000;
      return llI(var0, var1, var2, var4);
   }

   private static int IIII(int var0, int var1) {
      int var2 = Il[var0 ^ -702221902] ^ var1 ^ var0;
      var2 ^= 7864;
      var2 += 47395;
      var2 ^= 57357;
      var2 ^= 1062;
      var2 ^= 44778;
      var2 -= 56094;
      var2 ^= 17344;
      var2 += 23562;
      return var2 ^ 19423;
   }

   private static Color ll(Color var0, double var1, int var3) {
      double var4 = IIl(var1);
      Color var6 = lIl(var0, 0.72);
      Color var7 = lIl(var0, 1.28);
      return lll(lII(var6, var7, var4), var3);
   }

   public static Color III(Color var0, double var1) {
      Color var10000;
      label16: {
         try {
            if (var0 == null) {
               var10000 = Color.WHITE;
               break label16;
            }
         } catch (MatchException var4) {
            throw I(var4);
         }

         var10000 = var0;
      }

      Color var3 = var10000;
      return lll(var3, (int)Math.round(var3.getAlpha() * Math.max(0.0, var1)));
   }

   public static double IIl(double var0) {
      return 0.5 + 0.5 * Math.sin(System.currentTimeMillis() * 0.0042 + var0 * 5.0);
   }

   private static Color IlI(float var0, float var1, float var2, int var3) {
      int var5 = 82505094;
      int var4 = Color.HSBtoRGB(var0, var1, var2);
      return new Color(
         var4 >> IIII(-702221894, var5 ^ -1426604385) & IIII(-702221893, var5 ^ -685982867),
         var4 >> IIII(-702221896, var5 ^ -326950477) & IIII(-702221895, var5 ^ 1016992309),
         var4 & IIII(-702221890, var5 ^ -2047637402),
         II(var3)
      );
   }

   private static Color Ill(double var0, int var2) {
      float var3 = (float)((System.currentTimeMillis() * 1.6E-4 + var0 * 0.173) % 1.0);
      return IlI(var3, 0.78F, 1.0F, var2);
   }

   public static Color lII(Color var0, Color var1, double var2) {
      Color var10000;
      label30: {
         try {
            if (var0 == null) {
               var10000 = Color.WHITE;
               break label30;
            }
         } catch (MatchException var9) {
            throw I(var9);
         }

         var10000 = var0;
      }

      Color var4 = var10000;

      label22: {
         try {
            if (var1 == null) {
               var10000 = Color.WHITE;
               break label22;
            }
         } catch (MatchException var8) {
            throw I(var8);
         }

         var10000 = var1;
      }

      Color var5 = var10000;
      double var6 = Math.max(0.0, Math.min(1.0, var2));
      return new Color(
         II((int)Math.round(var4.getRed() + (var5.getRed() - var4.getRed()) * var6)),
         II((int)Math.round(var4.getGreen() + (var5.getGreen() - var4.getGreen()) * var6)),
         II((int)Math.round(var4.getBlue() + (var5.getBlue() - var4.getBlue()) * var6)),
         II((int)Math.round(var4.getAlpha() + (var5.getAlpha() - var4.getAlpha()) * var6))
      );
   }

   private IllIIlIl() {
   }

   public static Color lIl(Color var0, double var1) {
      Color var10000;
      label16: {
         try {
            if (var0 == null) {
               var10000 = Color.WHITE;
               break label16;
            }
         } catch (MatchException var4) {
            throw I(var4);
         }

         var10000 = var0;
      }

      Color var3 = var10000;
      return new Color(
         II((int)Math.round(var3.getRed() * var1)), II((int)Math.round(var3.getGreen() * var1)), II((int)Math.round(var3.getBlue() * var1)), var3.getAlpha()
      );
   }

   public static Color llI(Color var0, IIlIlIIl var1, double var2, int var4) {
      Color var10000;
      label55: {
         try {
            if (var0 == null) {
               var10000 = new Color(
                  IIII(-702221889, 1669750181 ^ 338802309), IIII(-702221892, 1669750181 ^ 549674388), IIII(-702221891, 1669750181 ^ -1279757510), var4
               );
               break label55;
            }
         } catch (MatchException var8) {
            throw I(var8);
         }

         var10000 = lll(var0, var4);
      }

      Color var5 = var10000;

      label47: {
         try {
            if (var1 == null) {
               var9 = IIlIlIIl.l;
               break label47;
            }
         } catch (MatchException var7) {
            throw I(var7);
         }

         var9 = var1;
      }

      try {
         switch (var9) {
            case l:
               return var5;
            case II:
               return Ill(var2, var4);
            case lI:
               return ll(var5, var2, var4);
            case III:
               return l(var5, var2, var4);
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var6) {
         throw I(var6);
      }
   }

   public static Color lll(Color var0, int var1) {
      Color var10000;
      label16: {
         try {
            if (var0 == null) {
               var10000 = Color.WHITE;
               break label16;
            }
         } catch (MatchException var3) {
            throw I(var3);
         }

         var10000 = var0;
      }

      Color var2 = var10000;
      return new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), II(var1));
   }
}
