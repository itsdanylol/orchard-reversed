package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class lIIII {
   private static final int[] I;

   public static float I(float var0, float var1, float var2) {
      float var3 = (float)ll(var2, 0.0, 1.0);
      float var4 = Math.max(var0, var1) - Math.min(var0, var1);
      float var5 = var4 * var3;
      return var1 + (var0 > var1 ? var5 : -var5);
   }

   private static int l(int var0, int var1, int var2, double var3) {
      int var5 = var0 >>> var2 & IlIl(-870256164, -238740212 ^ -2102368029);
      int var6 = var1 >>> var2 & IlIl(-870256163, -238740212 ^ -1611990396);
      return IIll((int)lIl(var5, var6, var3), 0, IlIl(-870256162, -238740212 ^ 502583539));
   }

   public static IIIlIIIII II(IIIlIIIII var0, Iterable<IIIlIIIII> var1, double var2, double var4) {
      String[] var6 = llIllIlI.IIlII();
      if (var0 != null && var1 != null && !(var4 <= 0.0)) {
         double var7 = var0.l();
         double var9 = var0.I();
         boolean var11 = var7 + var0.II() * 0.5 >= var2 * 0.5;

         for (IIIlIIIII var13 : var1) {
            if (var13 != null && (!var13.equals(var0) || var6 == null)) {
               label57: {
                  if (var11) {
                     double var14 = var13.l() + var13.II();
                     double var16 = var7 + var0.II();
                     if (Math.abs(var14 - var16) < var4) {
                        var7 = var14 - var0.II();
                     }

                     if (var6 != null) {
                        break label57;
                     }
                  }

                  if (Math.abs(var13.l() - var7) < var4) {
                     var7 = var13.l();
                  }
               }

               if (Math.abs(var13.I() - var9) < var4) {
                  var9 = var13.I();
               }

               if (var6 == null) {
                  break;
               }
            }
         }

         return new IIIlIIIII(var7, var9, var0.II(), var0.Il());
      } else {
         return var0;
      }
   }

   public static int Il(int var0, int var1, double var2) {
      int var10 = 577337575;
      double var4 = ll(var2, 0.0, 1.0);
      int var6 = l(var0, var1, IlIl(-870256161, var10 ^ 2110403260), var4);
      int var7 = l(var0, var1, IlIl(-870256168, var10 ^ -1803244161), var4);
      int var8 = l(var0, var1, IlIl(-870256167, var10 ^ 754290080), var4);
      int var9 = l(var0, var1, 0, var4);
      return var6 << IlIl(-870256166, var10 ^ -1449884480) | var7 << IlIl(-870256165, var10 ^ -1515932631) | var8 << IlIl(-870256172, var10 ^ 299518889) | var9;
   }

   public static double lI(double var0, double var2, double var4) {
      return lIl(var0, var2, ll(var4, 0.0, 1.0));
   }

   public static double ll(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static double III(double var0, double var2, double var4, double var6) {
      double var8 = ll(var6 * var4, 0.0, 1.0);
      return (1.0 - var8) * var0 + var8 * var2;
   }

   public static double IIl(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * ll(var4, 0.0, 1.0);
   }

   private static double IlI(double var0, double var2) {
      return Double.isFinite(var0) && var0 > 0.0 ? var0 : var2;
   }

   public static int Ill(int var0, double var1) {
      int var3 = var0 >>> IlIl(-870256171, 1862722907 ^ -50400218) & IlIl(-870256170, 1862722907 ^ 433933674);
      return llI(var0, (int)(var3 * ll(var1, 0.0, 1.0)));
   }

   public static boolean lII(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = Math.min(var4, var4 + var8);
      double var14 = Math.max(var4, var4 + var8);
      double var16 = Math.min(var6, var6 + var10);
      double var18 = Math.max(var6, var6 + var10);
      return var0 > var12 && var0 < var14 && var2 > var16 && var2 < var18;
   }

   public static double lIl(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static int llI(int var0, int var1) {
      return IIll(var1, 0, IlIl(-870256169, 1776239916 ^ -306332179)) << IlIl(-870256176, 1776239916 ^ -1838985240)
         | var0 & IlIl(-870256175, 1776239916 ^ 339008603);
   }

   public static double lll(double var0, double var2, double var4, double var6) {
      double var8 = IlI(var0, 0.0);
      double var10 = IIIl(var4, 1.0);
      double var12 = IIIl(var6, 0.0);
      double var14 = Math.max(0.0, var10 - var12);
      double var16 = IlI(var2, var14);
      return var8 * Math.max(var16, var14);
   }

   static {
      int var2 = -327263650;
      byte[] var0 = "¬Õ\u0089²±\u008f\u001bÔ3\u00911 \u0080\u0003µ\u001eiM*ÒÑ<\n\u0014T]\u0003gXm3\u0087ì\u0013Ì\u0010LXî2©{Tf[Â\u0004\u0097$\u001cõ\u008e]Kf'"
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

   public static IIllIIII IIII(double var0, double var2, double var4, double var6, double var8, double var10) {
      if (Double.isFinite(var0) && Double.isFinite(var2) && Double.isFinite(var4) && Double.isFinite(var6) && Double.isFinite(var8) && Double.isFinite(var10)) {
         double var12 = var4 < 0.0 ? var0 + var4 : var0;
         double var14 = var6 < 0.0 ? var2 + var6 : var2;
         double var16 = Math.abs(var4);
         double var18 = Math.abs(var6);
         if (!(var16 <= 0.0) && !(var18 <= 0.0)) {
            double var20 = Math.min(var16, var18) * 0.5;
            return new IIllIIII(var12, var14, var16, var18, ll(var8, 0.0, var20), ll(var10, 0.0, var20));
         } else {
            return IIllIIII.lI;
         }
      } else {
         return IIllIIII.lI;
      }
   }

   private static int IlIl(int var0, int var1) {
      int var2 = I[var0 ^ -870256164] ^ var1 ^ var0;
      var2 ^= 59887;
      var2 ^= 50347;
      var2 ^= 58430;
      var2 += 28109;
      var2 += 35270;
      var2 += 25638;
      return var2 + 1697;
   }

   private static double IIIl(double var0, double var2) {
      return Double.isFinite(var0) ? var0 : var2;
   }

   public static IIIlIIIII IIlI(double var0, double var2, double var4, double var6, double var8, double var10) {
      double var12 = Math.max(0.0, var4);
      double var14 = Math.max(0.0, var6);
      double var16 = Math.max(0.0, var8 - var12);
      double var18 = Math.max(0.0, var10 - var14);
      return new IIIlIIIII(ll(var0, 0.0, var16), ll(var2, 0.0, var18), var12, var14);
   }

   private lIIII() {
   }

   public static int IIll(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static double IlII(double var0, double var2, double var4, double var6) {
      double var8 = IlI(var0, 0.0);
      double var10 = IIIl(var4, 1.0);
      double var12 = IIIl(var6, 0.0);
      double var14 = Math.max(0.0, var10 - var12);
      double var16 = Math.max(IlI(var2, var14), var14);
      return var8 * (var10 + (var16 - var14) * 0.5);
   }
}
