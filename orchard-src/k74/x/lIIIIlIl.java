package k74.x;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class lIIIIlIl extends IlIIIIIIl {
   private long II;
   private static final int Il = 7;
   private final IIlIII lI;
   private static final int[] Illll;
   private final IIlIII ll;
   private boolean III;
   private static final String[] IIl;
   private final lllIIlII IlI;
   private final IIlIII Ill;
   private boolean lII;
   private boolean lIl;
   private final IIlIII llI;
   private boolean lll;
   private boolean IIII;
   private final lllIIlII IIIl;
   private class_1657 IIlI;
   private int IIll;
   private long IlII;
   private boolean IlIl;
   private final IIlIII IllI;
   private double Illl;
   private int lIII;
   private final IIlIII lIIl;
   private final lllIIlII lIlI;
   private boolean lIll;
   private final lllIIlII llII;
   private final IIlIII llIl;
   private boolean lllI;
   private static final Object[] lIIIl;
   private final lllIIlII llll;
   private static final String[] I;
   private static final long IIIII = 55L;
   private static final String[] lIIII;
   private final IllIII<IlIlIIlI> IIIIl;
   private final IIlIII IIIlI;
   private final lllIIlII IIIll;
   private double IIlII;
   private static final double IIlIl = 0.42;
   private int IIllI;
   private boolean IIlll;
   private int IlIII;
   private final lllIIlII IlIIl;
   private boolean IlIlI;
   private final lllIIlII IlIll;
   private static final long IllII = 220000000L;
   private long IllIl;
   private long IlllI;

   private void I(class_310 var1) {
      this.IlIlI = false;
      this.IIlll = false;
      this.lllI = false;
      boolean var2 = this.IllI(var1, 0.0, 1.0);
      boolean var3 = this.IllI(var1, 0.0, -1.0);
      if (!var2 && !var3) {
         this.lIl = false;
         this.III = false;
      } else {
         if (var2 != var3) {
            this.lIII = var2 ? 1 : -1;
         }

         this.lIl = this.lIII > 0 && var2;
         this.III = this.lIII < 0 && var3;
         this.IIllI = Math.max(this.IIllI, IllII(-1513222265, -1211513792 ^ 209584118));
      }
   }

   private void II(class_310 var1, class_1657 var2) {
      String[] var10000 = IIllllIl.IIIIl();
      class_746 var4 = var1.field_1724;
      String[] var3 = var10000;
      double var5 = Math.sqrt(var4.method_5858(var2));
      boolean var7 = this.lI(var2);
      boolean var8 = var7 && var5 <= Math.min(3.0, this.lI.IllI()) && var4.method_6057(var2);
      boolean var9 = !this.llll.IllI() || this.IllI(var1, 1.0, 0.0);
      IlIlIIlI var10 = this.IIIIl.IllI();
      boolean var11 = var10 != IlIlIIlI.l && this.lIl(var4) && var9;
      boolean var12 = var10 == IlIlIIlI.lI && var11;
      IlIIlIllI var13 = IllIllIl.II(var5, var8, var4.method_24828(), var11, var12, this.llI.IllI(), this.IllI.IllI(), this.IIIlI.IllI(), this.IlIll.IllI());
      this.IlIlI = var13.I();
      this.IIlll = var13.II();
      this.lllI = var13.l();
      this.lIl = false;
      this.III = false;
      boolean var14 = this.llII.IllI() && this.IlIlI && var4.method_24828() && var4.field_5976 && var9;
      if (var14) {
         this.IIlll = false;
         this.lllI = true;
      }

      this.lIIl(var4, this.IlIlI);
      if (this.IIIl.IllI() && (!var14 && var4.field_5976 && this.IIllI <= 0 || this.IIll >= IllII(-1513222266, -1199827314 ^ -1254078993))) {
         this.IlII(var1);
      }

      if (this.llll.IllI() && this.IlIlI && var4.method_24828() && !this.IllI(var1, 1.0, 0.0)) {
         this.I(var1);
         if (var3 == null) {
            return;
         }
      }

      if (this.IIIl.IllI() && this.IIllI > 0 && !var8) {
         this.lIl = this.lIII > 0;
         this.III = this.lIII < 0;
         this.IIllI--;
         if (var3 == null) {
            return;
         }
      }

      if (!this.IIIl.IllI()) {
         this.IIllI = 0;
      }
   }

   @Override
   public void llIIII(class_310 var1) {
      if (this.IIII && this.l(var1) && var1.field_1755 == null) {
         this.IIIII(var1);
      }
   }

   private void Il(class_310 var1) {
      if (this.IIII
         && this.l(var1)
         && var1.field_1755 == null
         && this.IIlI != null
         && this.III(var1, this.IIlI, this.lIIl.IllI())
         && !this.lllI(var1, this.IIlI)) {
         double var2 = Math.sqrt(var1.field_1724.method_5858(this.IIlI));
         boolean var4 = this.lI(this.IIlI);
         boolean var5 = this.IlIll.IllI() && var4 && var2 <= Math.min(3.0, this.lI.IllI()) && var1.field_1724.method_6057(this.IIlI);
         this.IIII(var1, this.IIll(this.IIlI, var2, var4), var2, var5);
      } else {
         this.II = 0L;
      }
   }

   private static String IllIl(int var0, char var1, char var2) {
      int var3 = var1 ^ 18600;
      char[] var4 = lIIII[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lIIIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lIIIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 12585;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 13345;
         var10 -= 63387;
         var10 += 9103;
         var10 ^= 38237;
         var10 += 36737;
         var10 -= 19246;
         var10 ^= 57537;
         var10 += 26671;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private boolean lI(class_1657 var1) {
      IIIIIllII var2 = IIIIIllII.III();
      if (var2 != null && var2.II() != null) {
         for (IlIIIIIIl var4 : var2.II().IIIlll()) {
            if (var4.IIIIlIl() && var4 instanceof IIlIllII var5 && var5.I(var1)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean ll(class_310 var1) {
      int var2 = this.llI(var1);
      boolean var3 = var2 >= 0;
      if (!var3 && !this.lIll) {
         this.lII = false;
      }

      if (!IllIllIl.Il(var3, this.lII, this.lIll)) {
         return this.lIll;
      } else if (k74.x.IIll.IIlllll()) {
         return false;
      } else {
         this.lII = true;
         this.lIll = true;
         this.IlIII = var2;
         k74.x.IIll.lIIIlII(var1, var2, true);
         long var4 = this.IlII;
         class_746 var6 = var1.field_1724;
         CompletableFuture.runAsync(this::Illl, CompletableFuture.delayedExecutor(55L, TimeUnit.MILLISECONDS));
         return true;
      }
   }

   private boolean l(class_310 var1) {
      return var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1690 != null && var1.field_1761 != null;
   }

   private boolean III(class_310 var1, class_1657 var2, double var3) {
      return k74.x.IlIII.lIlll(var1, var2)
         && !var2.method_31549().field_7477
         && !var2.method_31481()
         && var1.field_1687.method_8469(var2.method_5628()) == var2
         && (!this.IIIll.IllI() || var1.field_1724.method_6057(var2))
         && var1.field_1724.method_5858(var2) <= var3 * var3;
   }

   private void IIl() {
      this.lll = false;
      this.IIll = 0;
      this.IIllI = 0;
      this.Illl = 0.0;
      this.IIlII = 0.0;
      this.II = 0L;
   }

   private void Ill(class_310 var1, class_746 var2, int var3, long var4) {
      this.IIIIl(var1, var2, var3, var4);
   }

   private void lII(class_310 var1, class_304 var2, boolean var3) {
      if (var2 != null) {
         var2.method_23481(var3);
      }
   }

   private boolean lIl(class_746 var1) {
      return var1.method_5805()
         && !var1.method_6115()
         && !var1.method_5715()
         && !var1.method_5799()
         && !var1.method_5869()
         && !var1.method_5771()
         && !var1.method_6101()
         && !var1.method_5765()
         && !var1.method_31549().field_7479
         && var1.method_7344().method_7586() >= this.ll.IllI();
   }

   @Override
   public void llIl() {
      this.IlII++;
      this.IIII = false;
      this.IlllI = 0L;
      this.IIlI = null;
      this.lIll = false;
      this.lII = false;
      this.lll();
      this.lIll(class_310.method_1551());
      this.IIl();
   }

   private int llI(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         for (int var2 = 0; var2 < IllII(-1513222267, 1993518769 ^ -1336288490); var2++) {
            if (var1.field_1724.method_31548().method_5438(var2).method_31574(class_1802.field_8407)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   @Override
   public void IlIII() {
      this.IlII++;
      this.IIII = false;
      this.IllIl = 0L;
      this.IlllI = System.nanoTime() + Math.max(0L, Math.round(this.llIl.IllI() * 1.0E9));
      this.IIlI = null;
      this.IIl();
      this.lII = false;
      this.lIll = false;
      this.IlIII = this.lIlI(class_310.method_1551());
      this.lll();
      this.IlIl = false;
   }

   private void lll() {
      this.IlIlI = false;
      this.lIl = false;
      this.III = false;
      this.IIlll = false;
      this.lllI = false;
   }

   private void IIII(class_310 var1, class_243 var2, double var3, boolean var5) {
      class_243 var6 = var1.field_1724.method_33571();
      double var7 = var2.field_1352 - var6.field_1352;
      double var9 = var2.field_1351 - var6.field_1351;
      double var11 = var2.field_1350 - var6.field_1350;
      double var13 = Math.hypot(var7, var11);
      if (var13 < 1.0E-4) {
         this.II = 0L;
      } else {
         long var15 = System.nanoTime();
         float var17 = this.II == 0L ? 0.008333334F : class_3532.method_15363((float)(var15 - this.II) / 1.0E9F, 0.004166667F, 0.05F);
         this.II = var15;
         float var18 = (float)(Math.toDegrees(Math.atan2(var11, var7)) - 90.0);
         float var19 = (float)(-Math.toDegrees(Math.atan2(var9, var13)));
         float var20 = var1.field_1724.method_36454();
         float var21 = var1.field_1724.method_36455();
         float var22 = class_3532.method_15393(var18 - var20);
         float var23 = var19 - var21;
         float var24 = this.Ill.IllI().floatValue() / 100.0F;
         float var25 = (var5 ? 9.0F : (var3 > 12.0 ? 6.0F : 7.5F)) * var24;
         float var26 = (var5 ? 8.0F : 6.0F) * var24;
         float var27 = (var5 ? 150.0F : (var3 > 18.0 ? 100.0F : (var3 > 8.0 ? 125.0F : 145.0F))) * var24 * var17;
         float var28 = (var5 ? 110.0F : 85.0F) * var24 * var17;
         float var29 = class_3532.method_15363(var22 * (float)(1.0 - Math.exp(-var25 * var17)), -var27, var27);
         float var30 = class_3532.method_15363(var23 * (float)(1.0 - Math.exp(-var26 * var17)), -var28, var28);
         k74.x.IIll.IIIIIll(
            var1, var20 + (Math.abs(var22) < 0.03F ? var22 : var29), class_3532.method_15363(var21 + (Math.abs(var23) < 0.03F ? var23 : var30), -90.0F, 90.0F)
         );
      }
   }

   @Override
   public int lIllll() {
      return IllII(-1513222268, -959500183 ^ 1226331130);
   }

   public void IIIl(double var1, double var3) {
      if (this.IIIIlIl() && !(Math.abs(var1) + Math.abs(var3) < 0.01) && this.IIII) {
         class_310 var5 = class_310.method_1551();
         if (this.l(var5) && var5.field_1755 == null && System.nanoTime() >= this.IllIl) {
            this.IlIllIl(false);
         }
      }
   }

   public class_1657 IIlI(class_310 var1) {
      return this.IIIIlIl() && this.IIII && this.l(var1) ? this.llII(var1) : null;
   }

   private class_243 IIll(class_1657 var1, double var2, boolean var4) {
      class_243 var5 = var1.method_5829().method_1005();
      class_243 var6 = new class_243(var5.field_1352, var1.method_5829().field_1322 + var1.method_17682() * 0.62, var5.field_1350);
      if (!var4 && this.IlIIl.IllI()) {
         class_243 var7 = var1.method_18798();
         double var8 = Math.hypot(var7.field_1352, var7.field_1350);
         if (Double.isFinite(var8) && !(var8 > 1.4)) {
            double var10 = class_3532.method_15350(var2 / 6.0, 0.6, 3.2);
            return var6.method_1031(var7.field_1352 * var10, 0.0, var7.field_1350 * var10);
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   private void IlII(class_310 var1) {
      this.IIll = 0;
      this.IIllI = IllII(-1513222269, -27872084 ^ 556644960);
      boolean var2 = this.IllI(var1, 0.35, 1.0);
      boolean var3 = this.IllI(var1, 0.35, -1.0);
      this.lIII = var2 != var3 ? (var2 ? 1 : -1) : -this.lIII;
   }

   private boolean IlIl(class_310 var1, class_304 var2) {
      return var2 != null && k74.x.IIll.IlIllll(var1, var2);
   }

   private boolean IllI(class_310 var1, double var2, double var4) {
      class_746 var6 = var1.field_1724;
      if (!var6.method_24828()) {
         return true;
      } else {
         double var7 = Math.toRadians(var6.method_36454());
         double var9 = -Math.sin(var7) * var2 - Math.cos(var7) * var4;
         double var11 = Math.cos(var7) * var2 - Math.sin(var7) * var4;
         double var13 = Math.hypot(var9, var11);
         return var13 < 1.0E-4 || IIIlIIll.Il(var1.field_1687, var6, var9 / var13 * 0.42, var11 / var13 * 0.42);
      }
   }

   private void Illl(class_310 var1, class_746 var2, int var3, long var4) {
      var1.execute(this::Ill);
   }

   private boolean lIII(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 == null || var1.field_1690 == null) {
         return false;
      } else if (!this.IlIl(var1, var1.field_1690.field_1894)
         && !this.IlIl(var1, var1.field_1690.field_1881)
         && !this.IlIl(var1, var1.field_1690.field_1913)
         && !this.IlIl(var1, var1.field_1690.field_1849)
         && !this.IlIl(var1, var1.field_1690.field_1903)
         && !this.IlIl(var1, var1.field_1690.field_1832)
         && !this.IlIl(var1, var1.field_1690.field_1867)
         && !this.IlIl(var1, var1.field_1690.field_1886)
         && !this.IlIl(var1, var1.field_1690.field_1904)) {
         if (var1.field_1690.field_1852 != null) {
            for (class_304 var6 : var1.field_1690.field_1852) {
               if (this.IlIl(var1, var6)) {
                  return true;
               }

               if (var2 != null) {
                  break;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   private void lIIl(class_746 var1, boolean var2) {
      double var3 = var1.method_23317();
      double var5 = var1.method_23321();
      if (this.lll && var2 && var1.method_24828()) {
         double var7 = var3 - this.Illl;
         double var9 = var5 - this.IIlII;
         this.IIll = var7 * var7 + var9 * var9 < 4.0E-4 ? this.IIll + 1 : Math.max(0, this.IIll - 2);
      } else if (!var2) {
         this.IIll = 0;
      }

      this.Illl = var3;
      this.IIlII = var5;
      this.lll = true;
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (!this.l(var1)) {
         this.lll();
         this.lIll(var1);
         this.IIlI = null;
      } else {
         long var2 = System.nanoTime();
         if (!this.IIII) {
            if (var2 < this.IlllI) {
               return;
            }

            this.IIII = true;
            this.IllIl = var2 + 220000000L;
            this.IlIII = this.lIlI(var1);
         }

         if (var2 >= this.IllIl && this.lIII(var1)) {
            this.IlIllIl(false);
         } else {
            int var4 = this.lIlI(var1);
            if (this.IlIII >= 0 && var4 != this.IlIII && !this.lIll && !k74.x.IIll.IIlllll()) {
               this.IlIllIl(false);
            } else {
               this.IlIII = var4;
               if (var1.field_1755 != null || var1.field_1724.method_29504()) {
                  this.lll();
                  this.lIll(var1);
               } else if (this.lIlI.IllI() && this.ll(var1)) {
                  this.lll();
                  this.IIIII(var1);
               } else if (this.IlI.IllI() && var1.field_1724.method_6115()) {
                  this.lll();
                  this.IIIII(var1);
               } else {
                  this.IIlI = this.llII(var1);
                  if (this.IIlI == null) {
                     this.lll();
                     this.IIIII(var1);
                     this.IIl();
                  } else {
                     this.II(var1, this.IIlI);
                     this.IIIII(var1);
                  }
               }
            }
         }
      }
   }

   private int lIlI(class_310 var1) {
      return var1 != null && var1.field_1724 != null ? k74.x.IIll.IIlII(var1.field_1724.method_31548()) : -1;
   }

   private void lIll(class_310 var1) {
      if (this.IlIl && var1 != null && var1.field_1690 != null) {
         this.IIlII(var1, var1.field_1690.field_1894);
         this.IIlII(var1, var1.field_1690.field_1881);
         this.IIlII(var1, var1.field_1690.field_1913);
         this.IIlII(var1, var1.field_1690.field_1849);
         this.IIlII(var1, var1.field_1690.field_1867);
         this.IIlII(var1, var1.field_1690.field_1903);
         if (var1.field_1724 != null && !this.IlIl(var1, var1.field_1690.field_1867)) {
            var1.field_1724.method_5728(false);
         }

         this.IlIl = false;
      }
   }

   private class_1657 llII(class_310 var1) {
      class_1657 var2 = null;
      double var3 = Double.POSITIVE_INFINITY;

      for (class_1657 var6 : var1.field_1687.method_18456()) {
         double var7;
         if (this.III(var1, var6, this.lIIl.IllI()) && !((var7 = var1.field_1724.method_5858(var6)) >= var3)) {
            var2 = var6;
            var3 = var7;
         }
      }

      return var2;
   }

   private boolean lllI(class_310 var1, class_1657 var2) {
      IIIIIllII var3 = IIIIIllII.III();
      llllIIIl var4 = var3 != null && var3.II() != null ? var3.II().lllIlI() : null;
      return var4 != null && var4.Ill(var1, var2);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1909398271;
      int var17 = 0;
      short var18 = 32400;
      String[] var15 = new String[2];
      int var16 = 0;
      int var14 = "ɍ難\ueb75鿓ᬈ鱃\udbcc欮זּ醀᭛ꕉ䮊\ua4c8묞槣魸럣䬶꓃ீ釮鯃驠쭿ꞙ\udba9隘\ufbd1늳䭞鎃\ueb0e鰳ꬺ땾⬌땐䭖殉宍逸묜롓\udb71椃嬍齣믦롎\udb37毀\udb55槙鮀槨寀邃䮀髃謌ꜳﯫ槮\udb39阰\u0b5b麹殢鷘\ufbcd椃\udb53늃ଧ醣鬸뉎\ueb35ꐰ\u0b5b눉箤鹈毯럃뭻鴣쬈鎣ꯌ鳞鯃룰孞鄹쮮遨믫髃筵뜃㬌鱳ꬺ럎欟롐\ueb59榙⮏鲈⯯띣\u0b50랓\ueb0c鿓ᯫ땾欚鼐뭛鴉宫뗘\u0bd2槳歓鿣ଁ黃\udbcf邎寁毐⭞덩宫錸ﯣ딃\u2b75楣嬥룣\u0bc9椮㬝띐୕뗹\ueb50黨鯩驓୷欃\ueb0d雓ꯍ룞쬹렐㭘齹ᮊ鹘௪逳歜鹣䬌鼃쯏鏾ଏ槀ﭻ釩殨鿘믤룃ᮀ榳\ufb0e椣實郞\ueb37齰⭗鷉殤눘䯍鿣\u2b75ꓳזּ邃鯂釾쬸鲰⭘ꕉ㮤雸⯍늳筸釓\ufb08ꑓ믫骮쬻렠\udb54鿉讥高\udbe9鱳魵陓㬌髳\udbcd鱞쬵麐箣鹙ᮢ毸毨鿳孏뗳毹殣築驞欸雐䭗덉箊ꖸ寥ꐓ讀鸓\u0b29麳쯤毞寃뢀\ueb53鱉\u0b80鏈ᯪ鼃\u0b78霓\ueb20醃寡槾㬻롰箣酹宧龨毇毳孜鄓笏鼣ᯅ뜎笴髠孙麙订醘寣逃⭸榣묶黓믃酞㬲鵀筬鲹ꮩ鹘⯥덳뭻驓\ueb03欣ꯂ鍎⬐鄐䭔鸹ᮀ梸毯黳ﭻ鱓謄딣்釾\ufb1a殀᭘鄹뮨鱈鯀槓魜隣欌땃\udbcc鼮笚限㭔눩᭑鷸毨龃㭻됣믹逳\udbc8點ᬲ눐筰槙⮩髸鬞錣箂鼃㬪ꑳ\ufbc3鍎⬷槠\ueb7a骩筑醘\uebea驃\ueb70鳃鬧랓词鄞㬚歰孙鵩鮏邸ﯯ鰣䭞떳묄鍓⯍邮דּ鷠䭰醹宍醈ே欃魏黳嬈뉃䯍럞嬾鸠歖隩\u0ba7槸ꯦ毣筜꒳㬌陣⯅梞欹떰管驩ꮨ釸诩骃\ueb59鱃ꬌ韣㬸黮謾釰譺ꐩ\udba7늘笜렳魷鳣鬂鄣寷띎笌대\ueb57黹\udbaf鍨ﯤ毓뭱늳쬎龳篷렮㬹鹀ꭙ驙ﮧ뉨\uebea鲣᭸麃ଏ雓쬸눞嬐髠쮣뢩\ueba2鴨쯫黓孺鶣ꬎ떃\udbe1뗎诃鏀䭙鄹箊뒸ᯇ鼃ꭺ鏳ଠ랳毦鹞ᯃ鱐譺ꒉ讜鏸鯯黓\u0b4f褓\udb04눓请酮ꯃ骐歘뜙宜땸毥髓\u0b53鎃쬎닃\ufbc4렾\ueb37대\udb56鵹\ueba4郸ﯪ鹳ୌ鰓䬧鎃⬺髾欻驀뭿떙箜ꒈ寇鹓魺鱣\ueb05鿓诃랾ଵ酐答鰉㮤뗸鯨렓㭽錃㯹歃謺닮鬝ꒀ魿鿹孑뒸寨뗓%㦙ᇐⰩ憱⯙酾㯄뽯ࡊ⇦쉍ᄁ♒ꅘℹ䇊쟗䆱\u2e79䅹⫔ㆂ⎚䇤ࣳ턕⪢腌♹ꇇ‹ཐ㤹셧☔ƅ㯚"
         .length();
      String var13 = "ɍ難\ueb75鿓ᬈ鱃\udbcc欮זּ醀᭛ꕉ䮊\ua4c8묞槣魸럣䬶꓃ீ釮鯃驠쭿ꞙ\udba9隘\ufbd1늳䭞鎃\ueb0e鰳ꬺ땾⬌땐䭖殉宍逸묜롓\udb71椃嬍齣믦롎\udb37毀\udb55槙鮀槨寀邃䮀髃謌ꜳﯫ槮\udb39阰\u0b5b麹殢鷘\ufbcd椃\udb53늃ଧ醣鬸뉎\ueb35ꐰ\u0b5b눉箤鹈毯럃뭻鴣쬈鎣ꯌ鳞鯃룰孞鄹쮮遨믫髃筵뜃㬌鱳ꬺ럎欟롐\ueb59榙⮏鲈⯯띣\u0b50랓\ueb0c鿓ᯫ땾欚鼐뭛鴉宫뗘\u0bd2槳歓鿣ଁ黃\udbcf邎寁毐⭞덩宫錸ﯣ딃\u2b75楣嬥룣\u0bc9椮㬝띐୕뗹\ueb50黨鯩驓୷欃\ueb0d雓ꯍ룞쬹렐㭘齹ᮊ鹘௪逳歜鹣䬌鼃쯏鏾ଏ槀ﭻ釩殨鿘믤룃ᮀ榳\ufb0e椣實郞\ueb37齰⭗鷉殤눘䯍鿣\u2b75ꓳזּ邃鯂釾쬸鲰⭘ꕉ㮤雸⯍늳筸釓\ufb08ꑓ믫骮쬻렠\udb54鿉讥高\udbe9鱳魵陓㬌髳\udbcd鱞쬵麐箣鹙ᮢ毸毨鿳孏뗳毹殣築驞欸雐䭗덉箊ꖸ寥ꐓ讀鸓\u0b29麳쯤毞寃뢀\ueb53鱉\u0b80鏈ᯪ鼃\u0b78霓\ueb20醃寡槾㬻롰箣酹宧龨毇毳孜鄓笏鼣ᯅ뜎笴髠孙麙订醘寣逃⭸榣묶黓믃酞㬲鵀筬鲹ꮩ鹘⯥덳뭻驓\ueb03欣ꯂ鍎⬐鄐䭔鸹ᮀ梸毯黳ﭻ鱓謄딣்釾\ufb1a殀᭘鄹뮨鱈鯀槓魜隣欌땃\udbcc鼮笚限㭔눩᭑鷸毨龃㭻됣믹逳\udbc8點ᬲ눐筰槙⮩髸鬞錣箂鼃㬪ꑳ\ufbc3鍎⬷槠\ueb7a骩筑醘\uebea驃\ueb70鳃鬧랓词鄞㬚歰孙鵩鮏邸ﯯ鰣䭞떳묄鍓⯍邮דּ鷠䭰醹宍醈ே欃魏黳嬈뉃䯍럞嬾鸠歖隩\u0ba7槸ꯦ毣筜꒳㬌陣⯅梞欹떰管驩ꮨ釸诩骃\ueb59鱃ꬌ韣㬸黮謾釰譺ꐩ\udba7늘笜렳魷鳣鬂鄣寷띎笌대\ueb57黹\udbaf鍨ﯤ毓뭱늳쬎龳篷렮㬹鹀ꭙ驙ﮧ뉨\uebea鲣᭸麃ଏ雓쬸눞嬐髠쮣뢩\ueba2鴨쯫黓孺鶣ꬎ떃\udbe1뗎诃鏀䭙鄹箊뒸ᯇ鼃ꭺ鏳ଠ랳毦鹞ᯃ鱐譺ꒉ讜鏸鯯黓\u0b4f褓\udb04눓请酮ꯃ骐歘뜙宜땸毥髓\u0b53鎃쬎닃\ufbc4렾\ueb37대\udb56鵹\ueba4郸ﯪ鹳ୌ鰓䬧鎃⬺髾欻驀뭿떙箜ꒈ寇鹓魺鱣\ueb05鿓诃랾ଵ酐答鰉㮤뗸鯨렓㭽錃㯹歃謺닮鬝ꒀ魿鿹孑뒸寨뗓%㦙ᇐⰩ憱⯙酾㯄뽯ࡊ⇦쉍ᄁ♒ꅘℹ䇊쟗䆱\u2e79䅹⫔ㆂ⎚䇤ࣳ턕⪢腌♹ꇇ‹ཐ㤹셧☔ƅ㯚";

      do {
         char var19 = var13.charAt(var17);
         String var10000 = var13.substring(var17 + 1, var17 + 1 + var19);
         int var21 = 0;
         char[] var20 = var10000.toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 168;
               case 1 -> 235;
               case 2 -> 200;
               case 3 -> 146;
               case 4 -> 56;
               case 5 -> 83;
               case 6 -> 117;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lIIII = var15;
      lIIIl = new Object[var15.length];
      int var9 = 987953923;
      byte[] var7 = "$\u0098Ôé\u0092\u0010¼?Y§\u009bÔï\u0005(r@Wà¸6\u0016_¸T-5l?H\u0001å\u0094«\u0001^C\u007f¦k\u0093kß\u0082Ú±@-\u0011\u009a\u00956¼Ã\u009d\u0092\"ü<q\u00ad\u0018×\u0017\u0093\u0083]\u0096U\u001el<ÇÚ³{\u0098\u0096hH0\u008c|\u0013âî\u001b3¥»ÿ\u0007\u0004/÷[¸\u0016XÊâTTÊ÷ÆÈºfÅ.dÎv.¾\u0015dîÄ\u0001.\u000b'2/th¶¹e\u009aä\u009aLzæ\u0015ñ¹âPØ\u0099NxÐÁ¾ejÏ×P|M\u009a\u0018Q=ÀÉ\u008b\u001bÍiW_Ë·\u009cNd.\u0014²¾\u0097Äù\u0082g\u008d\u0011ÌF\u0093\u0095\u0006\u0017W\u0091FÖ]\u0000\u0093\u0004ì\r¿½\u0084øLh\u0010ËR<wk\u0011\u0007\u0083à\u0094Ë#.Ä\u009d_?\u0001vñ\u001awWG×CSù\u0015ª\u001b²ëÃ\u009eà<¸\u0095kVrïîL\\\u0093èSNw\u009au\u0090\u0083îò\u0081\u0081¦b\u0096\u0014Á\u001cö®?°è¦\"Cat/T\tíK4ÌT³?ßç\u000f#5)Ë¡?\te !wD¿)\u0087c\u0081)\\4¯5í£\u0084w\tÎ½äVÅB\u0094+*\tÙ¶+£!»Ê-ÞùÏ\bÍ\u0098ZJ\u0011¨â·m\u008f\u0093Axæ\nß¥\u0001¯\u0094Bóa^\u0097^ª·©¸ÜçÈ\u001a\u000ew7EÙÑGé\u0080ò.y\u008b\u009a7\u009fæ\f\u001b \u00adØy^¼3$cÓ[\u009bk\u0003H3\u0003õÅ\u0012àÂ\u0081x\u0090Hö\u0006îêÙÄ\u0084æFCå¶q\u0017Ö\u0084 ÀSJ\u008bV·DKeÄçQ\u0096\u00166Î&\u0080Bi\u000f|½cUÞ\u0098ºÈ0-ð'RÂ\u001f\u0091\u0088xîå¥\u0095{O\u001d?\u000bXÃ(ð_9\u0084VÉ\r\u0097ÖÚ\u0093Ó\u0088ûjèÓT\u0090|SüxãS¸µLþ7Z¤fÇ9lÓ\u009a oÛò»\u0082\u0085<>tÚãÞ\n\fj\u0083eµçÞ+ÛMa\u0082ÖØÄ5w·ÿPð¶\u008c\u0006üD\b¹\u0080¨b©\u00adöî\u0080\u0099Ö±\u0018NÃEQ\u001a\u0003\u009c¡þDg.¸8*ñ\féé\u0006·bEOÆõÓs²X\u0082@\u0092\u0007ñ\"rºW\"RæÇ\u000e:Aø\u0080É\f\b\u008aýKÍ¢=\u0081åj4\u000e=wVòÑ\b\u0094qT\u0016ñYuO\u0083A\u0083ï:ás;?U\u0080Á°\u001bBüì³¯Æ*Hl\u001eu\u008fJo\u009aßª\u009aí\u001bÄ\u0017ã\u00add\u009dPÖÏ>û\r\u007f\u00054µ\u0000\u007f\u001d/nX\u009dÚ\u0083 \u008c0òJ\u0091©%\u001dsÖ6CÓ5Ô3\u0092~\u001e\u00038\u008d;\u009aù¯u0ªvÀúÂ'ì\u000f\u000en\rXS\u000eIV0ßr¿\u001bé\u0086I;\u0015*«÷M\u001c&\u0096³÷n!ã\u0091(çÜ®Ó\u0090C\u0013Ò\rì5ß;A±\u0087¹\u0084\u0081\u0006\u008e!ìþÔÿ\u001bïÂ¶ïVµô ëÝ\u0089ó©bQ&\u0002\u0012\u0083\u0088se\u0002\u0080ö¾¸¶ÝAkî^ã\u0091®\u0006\u0082m\u0015\u008e»ø\u000fdìÛ\u0082výõò;UA\u0012ÓÀ(Ý\u0081\"WL÷a¬\u008b\u0087t\u000f`\u0096\u0016Ìi\u009cÛ¶.¡Q\u0081¼;T\u008aÝóv¼;\u0089\u0098\u0019\u009c\r)r\u008agç\u0091C&@v³lõ\u0014\u0096|ì¤l\u008ec8\u0011O4ìC\u001b´\u0011 Î\u0087û=¸eqp¾i\u0015ã\u008d¶Á±3Ã\u007fT\u001b¸5ð.0'\u009aQxJñ.µ¼\u0007ýg~,¾Öû\u000eëy«?\u001eçnÄûûÑJk×\u0095\"6ZWÁL\u0086\u0011©\u008cZ\u008f!X\u0087\u0005hãµ\u0089å\u0084Êd\u0010Þî\u009a}rõ&Ç°\u008f\u009b\\«\u008f\\:Éý\u0006¯Ø`\u0086\u000b÷¹\r\u008c\u009e¥\u0002Ï['øÚ,¶C_æ>\f\u0097\u009dÒD\u001fÙ\u0000Îþ°Å\u0018\u009b¹ÝýKÖQ\u0094\u0081æ|S\"\u0003Õ\u008eÊlÀ'uç@íÇ¡§k12î\u008fíÊ\u0017\u001d\u0011ë\u0018ö£{ÞQ¾\u0018G·+Ï>!0\u0006\u009eÃÙ\u0096`¸+J\u0090\u0019Óg-ì,jiä\nª¹«L\bf\nd\b\u0001Ïçû*¯°\u0091±\u0007\u0083³ï\u0082à¦±\u009b\u001c=ÑÆP¤«\u009b\u0096¹\u008bøy\u007fG\u000f\u0098Ôäð\u000e\u0091Û~\u00819÷\u0004ÈCè\rôNç\u0019I\u0084-\u0004qH\u000f\r+ÓÃC0n\rÊ\u0019\u0002Àg\u000f\u007f±\u0086\u009eí\u0013µ\u0004Xæ\u0010cà\u007fð\u0012\u0087Jko\u0015ï®\u0004¿M¯YÈ|\bdÕ\u009d!\u009b\u008d2ÝºsÐ[É\u0019^\u0016\u009b.ô¯\u001e\u0002É\"ïïkå\u009c>ÖRk\rÑ\u0081º÷ð´]\u0081\u001a\u0089Õ2Ò\u000b<'O)g&ó"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      Illll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         Illll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[IllII(-1513222270, var23 ^ -654988640)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IllIl(var23 ^ 764281557, '䢨', '邤')).length();
      int var1 = IllII(-1513222271, var23 ^ -1160855493);
      int var25 = -1;

      label101:
      while (true) {
         int var29 = IllII(-1513222272, var23 ^ -777260228);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label96: {
               char[] var45 = var10001.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var29;
               var41 = var45;
               int var35 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var29;
                  var10006 = var6;
               } else {
                  var48 = var29;
                  var35 = var10004;
                  if (var10004 <= var6) {
                     break label96;
                  }

                  var57 = var45;
                  var10004 = var29;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % IllII(-1513222260, var23 ^ 877835654)) {
                     case 0 -> IllII(-1513222261, var23 ^ -8822750);
                     case 1 -> IllII(-1513222262, var23 ^ 1377855700);
                     case 2 -> IllII(-1513222263, var23 ^ -870332137);
                     case 3 -> IllII(-1513222264, var23 ^ 1140531896);
                     case 4 -> IllII(-1513222249, var23 ^ 2103486675);
                     case 5 -> IllII(-1513222250, var23 ^ -1141008049);
                     default -> IllII(-1513222251, var23 ^ 691619407);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var35 <= var6) {
                        break;
                     }

                     var57 = var41;
                     var10004 = var48;
                     var10006 = var6;
                  }
               }
            }

            String var50 = new String(var41).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var50;
                  if ((var25 += var1) >= var4) {
                     IIl = var5;
                     I = new String[IllII(-1513222259, var23 ^ 2106075797)];
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label101;
                  }

                  var4 = (var2 = IllIl(var23 ^ -1368052359, '䢩', '\ud81b')).length();
                  var1 = IllII(-1513222257, var23 ^ 2051601447);
                  var25 = -1;
            }

            var29 = IllII(-1513222258, var23 ^ -1382264052);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private void IIIII(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         this.IlIl = true;
         this.lII(var1, var1.field_1690.field_1894, this.IlIlI);
         this.lII(var1, var1.field_1690.field_1881, false);
         this.lII(var1, var1.field_1690.field_1913, this.lIl);
         this.lII(var1, var1.field_1690.field_1849, this.III);
         this.lII(var1, var1.field_1690.field_1867, this.IIlll);
         this.lII(var1, var1.field_1690.field_1903, this.lllI);
         if (var1.field_1724 != null) {
            var1.field_1724.method_5728(this.IIlll);
         }
      }
   }

   public lIIIIlIl() {
      int var1 = 1497524723;
      super(
         IlIIllIII.Ill(IIIll(IllII(-1513222252, var1 ^ -1593407643), IllII(-1513222253, var1 ^ -152936427))),
         lllIIlIl.III,
         IlIIllIII.Ill(IIIll(IllII(-1513222254, var1 ^ -612436967), IllII(-1513222255, var1 ^ -1674851085)))
      );
      this.llIl = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIIll(IllII(-1513222256, var1 ^ 1035933711), IllII(-1513222241, var1 ^ -2121885522))), 5.0, 0.0, 15.0, 0.5)
            .IIIl(IlIIllIII.Ill(IIIll(IllII(-1513222242, var1 ^ -607863914), IllII(-1513222243, var1 ^ -833221778))))
      );
      this.lIIl = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIIll(IllII(-1513222244, var1 ^ 1599455556), IllII(-1513222245, var1 ^ -135909967))), 72.0, 4.0, 128.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIIll(IllII(-1513222246, var1 ^ 754195464), IllII(-1513222247, var1 ^ 951978094))))
      );
      this.llI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIIll(IllII(-1513222248, var1 ^ 197106486), IllII(-1513222233, var1 ^ 1893174647))), 2.35, 1.0, 6.0, 0.05)
            .IIIl(IlIIllIII.Ill(IIIll(IllII(-1513222234, var1 ^ -586505441), IllII(-1513222235, var1 ^ -544894097))))
      );
      this.IIIIl = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIIll(IllII(-1513222236, var1 ^ -608163224), IllII(-1513222237, var1 ^ -2011771308))), IlIlIIlI.class, IlIlIIlI.lI)
      );
      this.IllI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIIll(IllII(-1513222238, var1 ^ -2013952592), IllII(-1513222239, var1 ^ 289340485))), 3.0, 1.0, 12.0, 0.1)
            .IIIl(IlIIllIII.Ill(IIIll(IllII(-1513222240, var1 ^ -1551319458), IllII(-1513222225, var1 ^ -111547961))))
            .lIlI(this::IIIlI)
      );
      this.IIIlI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIIll(IllII(-1513222226, var1 ^ -184960949), IllII(-1513222227, var1 ^ 232337065))), 4.5, 1.0, 16.0, 0.1)
            .IIIl(IlIIllIII.Ill(IIIll(IllII(-1513222228, var1 ^ 1572797405), IllII(-1513222229, var1 ^ -2029541855))))
            .lIlI(this::IIlll)
      );
      this.llII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIIll(IllII(-1513222230, var1 ^ -1141415323), IllII(-1513222231, var1 ^ -170503437))), true));
      this.IIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIIll(IllII(-1513222232, var1 ^ 1065859281), IllII(-1513222217, var1 ^ 2135305797))), true));
      this.IlIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIIll(IllII(-1513222218, var1 ^ -1433133335), IllII(-1513222219, var1 ^ -2043886423))), true));
      this.lI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIIll(IllII(-1513222220, var1 ^ 1979252664), IllII(-1513222221, var1 ^ -1806535713))), 2.0, 0.5, 3.0, 0.05)
            .IIIl(IlIIllIII.Ill(IIIll(IllII(-1513222222, var1 ^ 681012369), IllII(-1513222223, var1 ^ -1386528276))))
            .lIlI(this.IlIll::IllI)
      );
      this.IIIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIIll(IllII(-1513222224, var1 ^ -49434546), IllII(-1513222209, var1 ^ 954690065))), false));
      this.llll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIIll(IllII(-1513222210, var1 ^ 1321707692), IllII(-1513222211, var1 ^ -2059538617))), true));
      this.IlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIIll(IllII(-1513222212, var1 ^ -1819590652), IllII(-1513222213, var1 ^ -99710539))), true));
      this.IlIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIIll(IllII(-1513222214, var1 ^ -2130344873), IllII(-1513222215, var1 ^ -1266594510))), true));
      this.Ill = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIIll(IllII(-1513222216, var1 ^ 1694702268), IllII(-1513222201, var1 ^ 2011689113))), 100.0, 20.0, 200.0, 5.0)
            .IIIl(IlIIllIII.Ill(IIIll(IllII(-1513222202, var1 ^ -1458372117), IllII(-1513222203, var1 ^ 1206849001))))
      );
      this.lIlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIIll(IllII(-1513222204, var1 ^ -1350291944), IllII(-1513222205, var1 ^ -818014464))), true));
      this.ll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIIll(IllII(-1513222206, var1 ^ -784936752), IllII(-1513222207, var1 ^ -1491410239))), 6.0, 0.0, 20.0, 1.0)
      );
      this.lIII = 1;
      this.IlIII = -1;
   }

   @Override
   public String IIlllIl() {
      return IlIIllIII.lI(IIIll(IllII(-1513222208, -1018494285 ^ -1435184416), IllII(-1513222193, -1018494285 ^ 1875686522)));
   }

   private void IIIIl(class_310 var1, class_1657 var2, int var3, long var4) {
      if (var4 == this.IlII
         && this.IIIIlIl()
         && this.IIII
         && this.l(var1)
         && var1.field_1724 == var2
         && var1.field_1755 == null
         && var1.field_1724.method_31548().method_5438(var3).method_31574(class_1802.field_8407)) {
         k74.x.IIll.lIIIlII(var1, var3, true);
         k74.x.IIll.IIllllI(var1);
         k74.x.IIll.IllIIll(var1, class_1268.field_5808);
         this.IlIII = var3;
         this.lIll = false;
      } else {
         this.lIll = false;
      }
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      class_310 var5 = class_310.method_1551();
      if (var5 != null && var5.method_22683() != null) {
         this.Il(var5);
         double var6 = var5.method_22683().method_4486() * 0.5;
         double var8 = var5.method_22683().method_4502() * 0.5 + 16.0;
         IlIIlllIl.IIllll(var1);

         try {
            IlIIlllIl.IlIIlI(var1, var6, var8);
            IlIIlllIl.llIIIl(var1, 1.7, 1.7);
            IlIIlllIl.Illl(true, this::IIllI);
         } finally {
            IlIIlllIl.lIIIll(var1);
         }
      }
   }

   private boolean IIIlI() {
      return this.IIIIl.IllI() != IlIlIIlI.l;
   }

   private static String IIIll(int var0, int var1) {
      int var9 = 669714559;
      int var2 = (var0 ^ IllII(-1513222194, var9 ^ -1730241483)) & IllII(-1513222195, var9 ^ 1913749907);
      if (I[var2] == null) {
         char[] var3 = IIl[var2].toCharArray();

         int var4 = switch (var3[0] & IllII(-1513222196, var9 ^ -2016509421)) {
            case 0 -> IllII(-1513222197, var9 ^ -1716477180);
            case 1 -> IllII(-1513222198, var9 ^ -1858042806);
            case 2 -> IllII(-1513222199, var9 ^ -1852058738);
            case 3 -> IllII(-1513222200, var9 ^ -1926610025);
            case 4 -> IllII(-1513222185, var9 ^ -808571863);
            case 5 -> IllII(-1513222186, var9 ^ 1553015329);
            case 6 -> IllII(-1513222187, var9 ^ 753716579);
            case 7 -> IllII(-1513222188, var9 ^ 1634847911);
            case 8 -> IllII(-1513222189, var9 ^ -1719916359);
            case 9 -> IllII(-1513222190, var9 ^ 1715349572);
            case 10 -> IllII(-1513222191, var9 ^ 1969207477);
            case 11 -> IllII(-1513222192, var9 ^ -1452342007);
            case 12 -> IllII(-1513222177, var9 ^ -716671968);
            case 13 -> IllII(-1513222178, var9 ^ -1071518363);
            case 14 -> IllII(-1513222179, var9 ^ 499535116);
            case 15 -> IllII(-1513222180, var9 ^ -97220863);
            case 16 -> IllII(-1513222181, var9 ^ 798576028);
            case 17 -> IllII(-1513222182, var9 ^ 293550906);
            case 18 -> IllII(-1513222183, var9 ^ 1893591546);
            case 19 -> IllII(-1513222184, var9 ^ -1887289666);
            case 20 -> IllII(-1513222169, var9 ^ -13735943);
            case 21 -> IllII(-1513222170, var9 ^ -1765905373);
            case 22 -> IllII(-1513222171, var9 ^ -1890057938);
            case 23 -> IllII(-1513222172, var9 ^ -1553511503);
            case 24 -> IllII(-1513222173, var9 ^ -1046914202);
            case 25 -> IllII(-1513222174, var9 ^ -1666960160);
            case 26 -> IllII(-1513222175, var9 ^ 598532495);
            case 27 -> IllII(-1513222176, var9 ^ -1950084365);
            case 28 -> IllII(-1513222161, var9 ^ -1440275225);
            case 29 -> IllII(-1513222162, var9 ^ -1067995257);
            case 30 -> IllII(-1513222163, var9 ^ -1104605703);
            case 31 -> IllII(-1513222164, var9 ^ 2084765963);
            case 32 -> IllII(-1513222165, var9 ^ -81636986);
            case 33 -> IllII(-1513222166, var9 ^ -1357814130);
            case 34 -> IllII(-1513222167, var9 ^ 2023009632);
            case 35 -> IllII(-1513222168, var9 ^ -294608347);
            case 36 -> IllII(-1513222153, var9 ^ -587005744);
            case 37 -> IllII(-1513222154, var9 ^ 785503975);
            case 38 -> IllII(-1513222155, var9 ^ -1639472101);
            case 39 -> IllII(-1513222156, var9 ^ -1212458427);
            case 40 -> IllII(-1513222157, var9 ^ -317096146);
            case 41 -> IllII(-1513222158, var9 ^ 1895287445);
            case 42 -> IllII(-1513222159, var9 ^ -1617616701);
            case 43 -> 0;
            case 44 -> IllII(-1513222160, var9 ^ 693082658);
            case 45 -> IllII(-1513222145, var9 ^ 1566733071);
            case 46 -> 1;
            case 47 -> IllII(-1513222146, var9 ^ -136652742);
            case 48 -> IllII(-1513222147, var9 ^ -536555748);
            case 49 -> IllII(-1513222148, var9 ^ -402758773);
            case 50 -> IllII(-1513222149, var9 ^ 1909092769);
            case 51 -> IllII(-1513222150, var9 ^ 1649685622);
            case 52 -> IllII(-1513222151, var9 ^ 1135415191);
            case 53 -> IllII(-1513222152, var9 ^ -329802805);
            case 54 -> IllII(-1513222393, var9 ^ 1153369158);
            case 55 -> IllII(-1513222394, var9 ^ 7515131);
            case 56 -> IllII(-1513222395, var9 ^ -1885518971);
            case 57 -> IllII(-1513222396, var9 ^ 2147388289);
            case 58 -> IllII(-1513222397, var9 ^ 585600491);
            case 59 -> IllII(-1513222398, var9 ^ 1249666377);
            case 60 -> IllII(-1513222399, var9 ^ -2064018674);
            case 61 -> IllII(-1513222400, var9 ^ 1528425784);
            case 62 -> 4;
            case 63 -> IllII(-1513222385, var9 ^ -767261964);
            case 64 -> IllII(-1513222386, var9 ^ 1595526184);
            case 65 -> IllII(-1513222387, var9 ^ -173644719);
            case 66 -> IllII(-1513222388, var9 ^ 1610863154);
            case 67 -> IllII(-1513222389, var9 ^ 255374043);
            case 68 -> IllII(-1513222390, var9 ^ 239853688);
            case 69 -> IllII(-1513222391, var9 ^ -53518771);
            case 70 -> IllII(-1513222392, var9 ^ 279269097);
            case 71 -> IllII(-1513222377, var9 ^ 1311336308);
            case 72 -> IllII(-1513222378, var9 ^ 1853292435);
            case 73 -> IllII(-1513222379, var9 ^ 2072164047);
            case 74 -> IllII(-1513222380, var9 ^ -1151645984);
            case 75 -> IllII(-1513222381, var9 ^ -56571555);
            case 76 -> IllII(-1513222382, var9 ^ -2131945980);
            case 77 -> IllII(-1513222383, var9 ^ 1362026774);
            case 78 -> IllII(-1513222384, var9 ^ -628971396);
            case 79 -> IllII(-1513222369, var9 ^ 1293194340);
            case 80 -> IllII(-1513222370, var9 ^ -532307887);
            case 81 -> IllII(-1513222371, var9 ^ -1086929568);
            case 82 -> IllII(-1513222372, var9 ^ 43040869);
            case 83 -> IllII(-1513222373, var9 ^ 1577118148);
            case 84 -> IllII(-1513222374, var9 ^ -113285545);
            case 85 -> IllII(-1513222375, var9 ^ -1261474697);
            case 86 -> IllII(-1513222376, var9 ^ -217430710);
            case 87 -> IllII(-1513222361, var9 ^ 958565067);
            case 88 -> IllII(-1513222362, var9 ^ -1225092900);
            case 89 -> IllII(-1513222363, var9 ^ 1243017052);
            case 90 -> IllII(-1513222364, var9 ^ -913051351);
            case 91 -> IllII(-1513222365, var9 ^ -508385075);
            case 92 -> IllII(-1513222366, var9 ^ -112981782);
            case 93 -> IllII(-1513222367, var9 ^ 1505025249);
            case 94 -> IllII(-1513222368, var9 ^ -314104258);
            case 95 -> IllII(-1513222353, var9 ^ -1551557697);
            case 96 -> IllII(-1513222354, var9 ^ 191373658);
            case 97 -> IllII(-1513222355, var9 ^ -257164808);
            case 98 -> IllII(-1513222356, var9 ^ 932022384);
            case 99 -> IllII(-1513222357, var9 ^ 1735228711);
            case 100 -> IllII(-1513222358, var9 ^ -1560021232);
            case 101 -> IllII(-1513222359, var9 ^ 363035179);
            case 102 -> IllII(-1513222360, var9 ^ 1846074619);
            case 103 -> IllII(-1513222345, var9 ^ -1246174570);
            case 104 -> IllII(-1513222346, var9 ^ 231184811);
            case 105 -> IllII(-1513222347, var9 ^ -1750483185);
            case 106 -> IllII(-1513222348, var9 ^ 1648674740);
            case 107 -> IllII(-1513222349, var9 ^ -2009748037);
            case 108 -> IllII(-1513222350, var9 ^ 300087982);
            case 109 -> IllII(-1513222351, var9 ^ 1861330051);
            case 110 -> IllII(-1513222352, var9 ^ -1928080169);
            case 111 -> IllII(-1513222337, var9 ^ -958798678);
            case 112 -> IllII(-1513222338, var9 ^ 905738375);
            case 113 -> IllII(-1513222339, var9 ^ 397596620);
            case 114 -> IllII(-1513222340, var9 ^ -838395666);
            case 115 -> IllII(-1513222341, var9 ^ -1624511220);
            case 116 -> IllII(-1513222342, var9 ^ -691355791);
            case 117 -> IllII(-1513222343, var9 ^ -1232161755);
            case 118 -> IllII(-1513222344, var9 ^ 1739937945);
            case 119 -> IllII(-1513222329, var9 ^ 1363258900);
            case 120 -> IllII(-1513222330, var9 ^ -1376957238);
            case 121 -> IllII(-1513222331, var9 ^ -170147478);
            case 122 -> IllII(-1513222332, var9 ^ 187730375);
            case 123 -> IllII(-1513222333, var9 ^ 1532414623);
            case 124 -> IllII(-1513222334, var9 ^ 1684616231);
            case 125 -> 3;
            case 126 -> IllII(-1513222335, var9 ^ -69978914);
            case 127 -> IllII(-1513222336, var9 ^ 1425160403);
            case 128 -> IllII(-1513222321, var9 ^ -109682673);
            case 129 -> IllII(-1513222322, var9 ^ 1011278251);
            case 130 -> IllII(-1513222323, var9 ^ -1725228796);
            case 131 -> IllII(-1513222324, var9 ^ 1205602491);
            case 132 -> IllII(-1513222325, var9 ^ 237547976);
            case 133 -> IllII(-1513222326, var9 ^ 1281821923);
            case 134 -> IllII(-1513222327, var9 ^ 825510762);
            case 135 -> IllII(-1513222328, var9 ^ -371071501);
            case 136 -> IllII(-1513222313, var9 ^ 995071185);
            case 137 -> IllII(-1513222314, var9 ^ -1169747573);
            case 138 -> IllII(-1513222315, var9 ^ 7420552);
            case 139 -> IllII(-1513222316, var9 ^ -752240212);
            case 140 -> IllII(-1513222317, var9 ^ 694805748);
            case 141 -> IllII(-1513222318, var9 ^ -707630671);
            case 142 -> IllII(-1513222319, var9 ^ 1086882354);
            case 143 -> IllII(-1513222320, var9 ^ 1665503559);
            case 144 -> IllII(-1513222305, var9 ^ 1295375538);
            case 145 -> IllII(-1513222306, var9 ^ -103467831);
            case 146 -> IllII(-1513222307, var9 ^ -1877318072);
            case 147 -> IllII(-1513222308, var9 ^ -276099003);
            case 148 -> IllII(-1513222309, var9 ^ 340549760);
            case 149 -> IllII(-1513222310, var9 ^ -1213763074);
            case 150 -> IllII(-1513222311, var9 ^ 1957592760);
            case 151 -> IllII(-1513222312, var9 ^ 250168976);
            case 152 -> IllII(-1513222297, var9 ^ 964418756);
            case 153 -> IllII(-1513222298, var9 ^ 840570036);
            case 154 -> IllII(-1513222299, var9 ^ 83652152);
            case 155 -> IllII(-1513222300, var9 ^ -1587811671);
            case 156 -> 2;
            case 157 -> IllII(-1513222301, var9 ^ -900890373);
            case 158 -> IllII(-1513222302, var9 ^ 696566063);
            case 159 -> IllII(-1513222303, var9 ^ -831222142);
            case 160 -> IllII(-1513222304, var9 ^ -1403937125);
            case 161 -> IllII(-1513222289, var9 ^ 480995670);
            case 162 -> IllII(-1513222290, var9 ^ -2133415775);
            case 163 -> IllII(-1513222291, var9 ^ 1418000880);
            case 164 -> IllII(-1513222292, var9 ^ -1452857053);
            case 165 -> IllII(-1513222293, var9 ^ 1140481837);
            case 166 -> IllII(-1513222294, var9 ^ -910730902);
            case 167 -> IllII(-1513222295, var9 ^ -1390122311);
            case 168 -> IllII(-1513222296, var9 ^ 2037830793);
            case 169 -> IllII(-1513222281, var9 ^ -946602972);
            case 170 -> IllII(-1513222282, var9 ^ -1925723031);
            case 171 -> IllII(-1513222283, var9 ^ -1621248359);
            case 172 -> IllII(-1513222284, var9 ^ -231290595);
            case 173 -> IllII(-1513222285, var9 ^ 79699756);
            case 174 -> IllII(-1513222286, var9 ^ -957654667);
            case 175 -> IllII(-1513222287, var9 ^ 1137249336);
            case 176 -> IllII(-1513222288, var9 ^ 335083828);
            case 177 -> IllII(-1513222273, var9 ^ -704439249);
            case 178 -> IllII(-1513222274, var9 ^ 1770884324);
            case 179 -> IllII(-1513222275, var9 ^ 770036145);
            case 180 -> IllII(-1513222276, var9 ^ -284775549);
            case 181 -> IllII(-1513222277, var9 ^ -1452381291);
            case 182 -> IllII(-1513222278, var9 ^ 937869302);
            case 183 -> IllII(-1513222279, var9 ^ -1112603556);
            case 184 -> IllII(-1513222280, var9 ^ 824338061);
            case 185 -> IllII(-1513222521, var9 ^ -589873225);
            case 186 -> IllII(-1513222522, var9 ^ 582652262);
            case 187 -> IllII(-1513222523, var9 ^ -1644144924);
            case 188 -> IllII(-1513222524, var9 ^ 597380419);
            case 189 -> IllII(-1513222525, var9 ^ -453170628);
            case 190 -> IllII(-1513222526, var9 ^ -1100464472);
            case 191 -> IllII(-1513222527, var9 ^ 1053561292);
            case 192 -> IllII(-1513222528, var9 ^ -1253345159);
            case 193 -> IllII(-1513222513, var9 ^ -1173832280);
            case 194 -> IllII(-1513222514, var9 ^ 1075695365);
            case 195 -> IllII(-1513222515, var9 ^ -73924412);
            case 196 -> IllII(-1513222516, var9 ^ -1269794097);
            case 197 -> IllII(-1513222517, var9 ^ -52936735);
            case 198 -> IllII(-1513222518, var9 ^ 1983468379);
            case 199 -> IllII(-1513222519, var9 ^ -1604558925);
            case 200 -> IllII(-1513222520, var9 ^ 1166815569);
            case 201 -> IllII(-1513222505, var9 ^ 742785026);
            case 202 -> IllII(-1513222506, var9 ^ -337255160);
            case 203 -> IllII(-1513222507, var9 ^ 906857133);
            case 204 -> IllII(-1513222508, var9 ^ -1615724121);
            case 205 -> IllII(-1513222509, var9 ^ 1426081671);
            case 206 -> IllII(-1513222510, var9 ^ -738798087);
            case 207 -> IllII(-1513222511, var9 ^ 925510068);
            case 208 -> IllII(-1513222512, var9 ^ -1512698567);
            case 209 -> IllII(-1513222497, var9 ^ 1315216668);
            case 210 -> IllII(-1513222498, var9 ^ -377880920);
            case 211 -> IllII(-1513222499, var9 ^ 267135325);
            case 212 -> IllII(-1513222500, var9 ^ -1711808425);
            case 213 -> IllII(-1513222501, var9 ^ 2065592369);
            case 214 -> IllII(-1513222502, var9 ^ 15510745);
            case 215 -> IllII(-1513222503, var9 ^ -1592491588);
            case 216 -> IllII(-1513222504, var9 ^ 1424722981);
            case 217 -> IllII(-1513222489, var9 ^ 1556958304);
            case 218 -> IllII(-1513222490, var9 ^ 327936999);
            case 219 -> IllII(-1513222491, var9 ^ -1297879365);
            case 220 -> IllII(-1513222492, var9 ^ 1998593407);
            case 221 -> IllII(-1513222493, var9 ^ 393705281);
            case 222 -> IllII(-1513222494, var9 ^ -1086040678);
            case 223 -> IllII(-1513222495, var9 ^ 975650922);
            case 224 -> IllII(-1513222496, var9 ^ 601611242);
            case 225 -> IllII(-1513222481, var9 ^ 2123843394);
            case 226 -> IllII(-1513222482, var9 ^ 592535487);
            case 227 -> IllII(-1513222483, var9 ^ 1086232857);
            case 228 -> IllII(-1513222484, var9 ^ -1218496670);
            case 229 -> IllII(-1513222485, var9 ^ 1221162870);
            case 230 -> IllII(-1513222486, var9 ^ -968435079);
            case 231 -> IllII(-1513222487, var9 ^ -1139825469);
            case 232 -> IllII(-1513222488, var9 ^ -1254905782);
            case 233 -> IllII(-1513222473, var9 ^ -1584504065);
            case 234 -> IllII(-1513222474, var9 ^ -1128878409);
            case 235 -> IllII(-1513222475, var9 ^ -1242811035);
            case 236 -> 5;
            case 237 -> IllII(-1513222476, var9 ^ -67663639);
            case 238 -> IllII(-1513222477, var9 ^ 1927210131);
            case 239 -> IllII(-1513222478, var9 ^ -540501663);
            case 240 -> IllII(-1513222479, var9 ^ 1046022691);
            case 241 -> IllII(-1513222480, var9 ^ 230931304);
            case 242 -> IllII(-1513222465, var9 ^ -1465645425);
            case 243 -> IllII(-1513222466, var9 ^ 1221943785);
            case 244 -> IllII(-1513222467, var9 ^ -743902373);
            case 245 -> IllII(-1513222468, var9 ^ 381901161);
            case 246 -> IllII(-1513222469, var9 ^ 396242443);
            case 247 -> IllII(-1513222470, var9 ^ -1331481799);
            case 248 -> IllII(-1513222471, var9 ^ -1721996326);
            case 249 -> IllII(-1513222472, var9 ^ 1702728981);
            case 250 -> IllII(-1513222457, var9 ^ -485556357);
            case 251 -> IllII(-1513222458, var9 ^ -1369651063);
            case 252 -> IllII(-1513222459, var9 ^ 400155606);
            case 253 -> IllII(-1513222460, var9 ^ -1708652093);
            case 254 -> IllII(-1513222461, var9 ^ 1566300263);
            default -> IllII(-1513222462, var9 ^ -357765598);
         };
         int var5 = (var1 & IllII(-1513222463, var9 ^ 964497870)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IllII(-1513222464, var9 ^ -211432923)) >>> IllII(-1513222449, var9 ^ 823317911)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IllII(-1513222450, var9 ^ -1275346562);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IllII(-1513222451, var9 ^ -1851735871);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }

   private void IIlII(class_310 var1, class_304 var2) {
      if (var2 != null) {
         var2.method_23481(k74.x.IIll.IlIllll(var1, var2));
      }
   }

   private static int IllII(int var0, int var1) {
      int var2 = Illll[var0 ^ -1513222265] ^ var1 ^ var0;
      var2 -= 8941;
      var2 ^= 1359;
      var2 -= 65013;
      var2 += 49728;
      var2 ^= 14288;
      var2 += 52841;
      return var2 ^ 50338;
   }

   private void IIllI(class_332 var1, class_310 var2) {
      IlIIlllIl.llIIlI(var1, var2.field_1772, this.IllIlI(), 0.0, 0.0, -1);
   }

   private boolean IIlll() {
      return this.IIIIl.IllI() == IlIlIIlI.lI;
   }
}
