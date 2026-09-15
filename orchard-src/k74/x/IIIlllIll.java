package k74.x;

public final class IIIlllIll {
   private static final int[] I;

   static {
      int var2 = 1599033454;
      byte[] var0 = "s\u0082;çªE\u00907À¹´>Ëu\u001b¶`wgr`¹¡z©¢íª6)·þUeïazäM\u001céëßÂÀYWs\u0098WXÈD\u0007Wº".getBytes("ISO-8859-1");
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

   public static boolean I(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = Math.min(var4, var4 + var8);
      double var14 = Math.max(var4, var4 + var8);
      double var16 = Math.min(var6, var6 + var10);
      double var18 = Math.max(var6, var6 + var10);
      return var0 > var12 && var0 < var14 && var2 > var16 && var2 < var18;
   }

   public static IIlIllI l(double var0, double var2, double var4, double var6, double var8, double var10) {
      if (Double.isFinite(var0) && Double.isFinite(var2) && Double.isFinite(var4) && Double.isFinite(var6) && Double.isFinite(var8) && Double.isFinite(var10)) {
         double var12 = var4 < 0.0 ? var0 + var4 : var0;
         double var14 = var6 < 0.0 ? var2 + var6 : var2;
         double var16 = Math.abs(var4);
         double var18 = Math.abs(var6);
         if (!(var16 <= 0.0) && !(var18 <= 0.0)) {
            double var20 = Math.min(var16, var18) * 0.5;
            return new IIlIllI(var12, var14, var16, var18, ll(var8, 0.0, var20), ll(var10, 0.0, var20));
         } else {
            return IIlIllI.III;
         }
      } else {
         return IIlIllI.III;
      }
   }

   public static double II(double var0, double var2, double var4) {
      return lll(var0, var2, ll(var4, 0.0, 1.0));
   }

   public static float Il(float var0, float var1, float var2) {
      float var3 = (float)ll(var2, 0.0, 1.0);
      float var4 = Math.max(var0, var1) - Math.min(var0, var1);
      float var5 = var4 * var3;
      return var1 + (var0 > var1 ? var5 : -var5);
   }

   public static double lI(double var0, double var2, double var4, double var6) {
      double var8 = IIl(var0, 0.0);
      double var10 = lII(var4, 1.0);
      double var12 = lII(var6, 0.0);
      double var14 = Math.max(0.0, var10 - var12);
      double var16 = Math.max(IIl(var2, var14), var14);
      return var8 * (var10 + (var16 - var14) * 0.5);
   }

   public static double ll(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static IIlIIllll III(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = Double.isFinite(var0) ? var0 : 0.0;
      double var14 = Double.isFinite(var2) ? var2 : 0.0;
      double var16 = Double.isFinite(var4) ? Math.max(0.0, var4) : 0.0;
      double var18 = Double.isFinite(var6) ? Math.max(0.0, var6) : 0.0;
      double var20 = Double.isFinite(var8) ? Math.max(0.0, var8) : 0.0;
      double var22 = Double.isFinite(var10) ? Math.max(0.0, var10) : 0.0;
      double var24 = Math.max(0.0, var20 - var16);
      double var26 = Math.max(0.0, var22 - var18);
      return new IIlIIllll(ll(var12, 0.0, var24), ll(var14, 0.0, var26), var16, var18);
   }

   private static double IIl(double var0, double var2) {
      return Double.isFinite(var0) && var0 > 0.0 ? var0 : var2;
   }

   public static IIlIIllll IlI(IIlIIllll var0, Iterable<IIlIIllll> var1, double var2, double var4) {
      String[] var6 = IIllllIl.IIIIl();
      if (var0 != null && var1 != null && !(var4 <= 0.0)) {
         double var7 = var0.II();
         double var9 = var0.l();
         boolean var11 = var7 + var0.Il() * 0.5 >= var2 * 0.5;

         for (IIlIIllll var13 : var1) {
            if (var13 != null && !var13.equals(var0)) {
               label55: {
                  if (var11) {
                     double var14 = var13.II() + var13.Il();
                     double var16 = var7 + var0.Il();
                     if (Math.abs(var14 - var16) < var4) {
                        var7 = var14 - var0.Il();
                     }

                     if (var6 == null) {
                        break label55;
                     }
                  }

                  if (Math.abs(var13.II() - var7) < var4) {
                     var7 = var13.II();
                  }
               }

               if (Math.abs(var13.l() - var9) < var4) {
                  var9 = var13.l();
               }

               if (var6 != null) {
                  break;
               }
            }
         }

         return new IIlIIllll(var7, var9, var0.Il(), var0.I());
      } else {
         return var0;
      }
   }

   public static double Ill(double var0, double var2, double var4, double var6) {
      double var8 = ll(var6 * var4, 0.0, 1.0);
      return (1.0 - var8) * var0 + var8 * var2;
   }

   private static double lII(double var0, double var2) {
      return Double.isFinite(var0) ? var0 : var2;
   }

   private IIIlllIll() {
   }

   public static int lIl(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static double llI(double var0, double var2, double var4, double var6) {
      double var8 = IIl(var0, 0.0);
      double var10 = lII(var4, 1.0);
      double var12 = lII(var6, 0.0);
      double var14 = Math.max(0.0, var10 - var12);
      double var16 = IIl(var2, var14);
      return var8 * Math.max(var16, var14);
   }

   public static double lll(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static int IIII(int var0, int var1) {
      return lIl(var1, 0, IlIl(1023651409, 1838666178 ^ -2086175556)) << IlIl(1023651408, 1838666178 ^ 1516296252)
         | var0 & IlIl(1023651411, 1838666178 ^ -811829145);
   }

   private static int IlIl(int var0, int var1) {
      int var2 = I[var0 ^ 1023651409] ^ var1 ^ var0;
      var2 ^= 13026;
      var2 ^= 42522;
      var2 += 6253;
      var2 ^= 25636;
      var2 += 15065;
      var2 ^= 12506;
      var2 += 42893;
      return var2 ^ 16992;
   }

   private static int IIIl(int var0, int var1, int var2, double var3) {
      int var5 = var0 >>> var2 & IlIl(1023651410, -1472071711 ^ -24741171);
      int var6 = var1 >>> var2 & IlIl(1023651413, -1472071711 ^ 1434715662);
      return lIl((int)lll(var5, var6, var3), 0, IlIl(1023651412, -1472071711 ^ 1430962183));
   }

   public static int IIlI(int var0, int var1, double var2) {
      int var10 = 1890015208;
      double var4 = ll(var2, 0.0, 1.0);
      int var6 = IIIl(var0, var1, IlIl(1023651415, var10 ^ 1152852876), var4);
      int var7 = IIIl(var0, var1, IlIl(1023651414, var10 ^ -616794111), var4);
      int var8 = IIIl(var0, var1, IlIl(1023651417, var10 ^ -1200611111), var4);
      int var9 = IIIl(var0, var1, 0, var4);
      return var6 << IlIl(1023651416, var10 ^ -1745779915) | var7 << IlIl(1023651419, var10 ^ 83759152) | var8 << IlIl(1023651418, var10 ^ 759994568) | var9;
   }

   public static int IIll(int var0, double var1) {
      int var3 = var0 >>> IlIl(1023651421, -1605216597 ^ -1514694745) & IlIl(1023651420, -1605216597 ^ 2045220741);
      return IIII(var0, (int)(var3 * ll(var1, 0.0, 1.0)));
   }

   public static double IlII(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * ll(var4, 0.0, 1.0);
   }
}
