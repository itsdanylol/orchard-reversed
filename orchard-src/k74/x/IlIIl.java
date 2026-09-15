package k74.x;

import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1531;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_640;

@Environment(EnvType.CLIENT)
public final class IlIIl {
   private int I = lllI(-1913701757, 719390718 ^ 40771853);
   private double II;
   private static final int[] IIlI = new int[5];
   private double Il;
   private long l;
   private final IlllIllI lI = new IlllIllI();
   private double ll;
   private UUID III;
   private static final double IIl = 0.25;
   private double IlI;
   private static final double Ill = 0.125;
   private class_1309 lII;
   private double lIl;
   private long llI;
   private final IlllIllI lll = new IlllIllI();
   private class_1309 IIII;
   private boolean IIIl;

   public long I(long var1) {
      return this.llI <= 0L ? Long.MAX_VALUE : Math.max(0L, var1 - this.llI);
   }

   public void II(class_1297 var1) {
      if (var1 instanceof class_1309 var2 && !IIlllIlll.I(var2)) {
         if (!(var1 instanceof class_1531)) {
            if (!(this.IIII instanceof class_1657) || var2 instanceof class_1657 || !this.IIII.method_5805() || this.IIII.method_31481()) {
               this.IlII(var2);
               this.IIII = var2;
               this.III = var2.method_5667();
               this.I = var2.method_5628();
               this.llI = System.currentTimeMillis();
            }
         }
      }
   }

   public double Il() {
      return this.lI.II();
   }

   public int lI(class_310 var1) {
      int var2 = this.lI.l();
      return var2 > 0 ? var2 : this.IIlI(var1, var1.field_1724);
   }

   public void ll() {
      this.IIl();
      this.IIII = null;
      this.III = null;
      this.I = lllI(-1913701760, 1508354819 ^ 1145291745);
      this.llI = 0L;
      this.lI.ll();
   }

   public void III(class_310 var1) {
      if (var1.field_1724 != null && var1.field_1687 != null) {
         this.lI.lI(this.IIlI(var1, var1.field_1724));
         if (this.lII != null && this.lII(var1, this.lII)) {
            this.IIl();
         }

         if (this.IIII != null && this.IlI(var1, this.IIII)) {
            this.IIII = null;
            this.III = null;
            this.I = lllI(-1913701759, -570860766 ^ -1169954258);
            this.llI = 0L;
         }

         if (var1.field_1765 instanceof class_3966 var2) {
            class_1297 var5 = var2.method_17782();
            if (var5 instanceof class_1309 var4 && var5 != var1.field_1724 && !IIlllIlll.I(var4)) {
               this.IlII(var4);
            }
         }

         if (this.lII != null && System.currentTimeMillis() - this.l > 2500L) {
            this.IIl();
         } else {
            if (this.lII != null) {
               this.lll.lI(this.IIlI(var1, this.lII));
               this.Ill(var1);
            }
         }
      } else {
         this.IIl();
      }
   }

   private void IIl() {
      this.lII = null;
      this.l = 0L;
      this.ll = 0.0;
      this.II = 0.0;
      this.IlI = 0.0;
      this.IIIl = false;
      this.lll.ll();
   }

   private boolean IlI(class_310 var1, class_1309 var2) {
      if (var2 == null || IIlllIlll.I(var2)) {
         return true;
      } else if (!var2.method_31481() && var2.method_5805()) {
         return false;
      } else {
         if (var1 != null && var1.field_1687 != null) {
            if (this.III != null) {
               class_1657 var3 = var1.field_1687.method_18470(this.III);
               if (var3 != null && !var3.method_31481() && var3.method_5805() && !IIlllIlll.II(var3)) {
                  this.IIII = var3;
                  this.I = var3.method_5628();
                  return false;
               }
            }

            if (this.I != lllI(-1913701758, 1142139952 ^ -881484517)
               && var1.field_1687.method_8469(this.I) instanceof class_1309 var4
               && !var4.method_31481()
               && var4.method_5805()
               && !IIlllIlll.I(var4)) {
               this.IIII = var4;
               this.III = var4.method_5667();
               return false;
            }
         }

         return true;
      }
   }

   private void Ill(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1.field_1724 != null && this.lII != null) {
         double var3;
         label24: {
            var3 = var1.field_1724.method_5739(this.lII);
            if (this.IIIl) {
               this.II = this.ll - var3;
               if (var2 == null) {
                  break label24;
               }
            }

            this.II = 0.0;
         }

         this.ll = var3;
         double var5 = this.lII.method_23317() - this.lIl;
         double var7 = this.lII.method_23321() - this.Il;
         this.IlI = this.IIIl ? Math.sqrt(var5 * var5 + var7 * var7) : 0.0;
         this.lIl = this.lII.method_23317();
         this.Il = this.lII.method_23321();
         this.IIIl = true;
      }
   }

   private static int lllI(int var0, int var1) {
      int var2 = IIlI[var0 ^ -1913701760] ^ var1 ^ var0;
      var2 += 44496;
      var2 += 11868;
      var2 -= 59475;
      var2 ^= 6887;
      var2 -= 24942;
      var2 -= 10580;
      var2 += 3076;
      var2 -= 2741;
      var2 -= 45803;
      return var2 + 2952;
   }

   private boolean lII(class_310 var1, class_1309 var2) {
      return var2 == null || !var2.method_5805() || var2.method_31481() || IIlllIlll.I(var2) || var1.field_1724.method_5739(var2) > 16.0F;
   }

   public boolean lIl(class_310 var1, double var2) {
      if (var1 == null || var1.field_1724 == null || var1.field_1687 == null || this.lII == null) {
         return false;
      } else if (this.lII.method_5805() && !this.lII.method_31481()) {
         return var1.field_1687.method_8469(this.lII.method_5628()) != this.lII ? false : IIII(var1.field_1724.method_5858(this.lII), var2);
      } else {
         return false;
      }
   }

   public double llI() {
      return this.ll;
   }

   public double lll() {
      return this.lll.I();
   }

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "Ó8S¬©&\u008aCAú\ngæ\u0013\u001d¾Èn\b\u009e".getBytes("ISO-8859-1");

      int var14;
      do {
         IIlI[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1015924842;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);
   }

   public static boolean IIII(double var0, double var2) {
      double var4 = Math.max(0.0, var2);
      return var0 >= 0.0 && var0 <= var4 * var4;
   }

   public double IIIl() {
      return this.lll.II();
   }

   private int IIlI(class_310 var1, class_1297 var2) {
      if (var2 instanceof class_1657 var3 && var1.method_1562() != null) {
         class_640 var4 = var1.method_1562().method_2871(var3.method_5667());
         return var4 == null ? 0 : var4.method_2959();
      } else {
         return 0;
      }
   }

   public double IIll(double var1) {
      return this.lI.Il(var1);
   }

   private void IlII(class_1309 var1) {
      if (this.lII != var1) {
         this.lII = var1;
         this.IIIl = false;
         this.ll = 0.0;
         this.II = 0.0;
         this.IlI = 0.0;
         this.lll.ll();
      }

      this.l = System.currentTimeMillis();
   }

   public int IlIl(class_310 var1) {
      int var2 = this.lll.l();
      return var2 > 0 ? var2 : this.IIlI(var1, this.lII);
   }

   public double IllI() {
      return this.lll() * 0.7 + this.llIl() * 0.25 + this.IIIl() * 1.6 + this.Il() * 0.7;
   }

   public double Illl() {
      return this.lll() + this.IIIl() * 1.35;
   }

   public class_1309 lIII() {
      return this.lII;
   }

   public long lIIl() {
      return this.llI;
   }

   public double lIlI() {
      return this.II;
   }

   public class_1309 l() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1687 != null) {
         if (this.IIII != null && !this.IIII.method_31481() && this.IIII.method_5805()) {
            return this.IIII;
         }

         if (this.III != null) {
            class_1657 var2 = var1.field_1687.method_18470(this.III);
            if (var2 != null && !var2.method_31481() && var2.method_5805()) {
               this.IIII = var2;
               this.I = var2.method_5628();
               return var2;
            }
         }

         if (this.I != lllI(-1913701756, -234520701 ^ -185119657)
            && var1.field_1687.method_8469(this.I) instanceof class_1309 var3
            && !var3.method_31481()
            && var3.method_5805()) {
            this.IIII = var3;
            this.III = var3.method_5667();
            return var3;
         }
      }

      return this.IIII != null && !this.IIII.method_31481() && this.IIII.method_5805() ? this.IIII : null;
   }

   public double lIll() {
      return this.IlI;
   }

   public double llII(double var1) {
      return this.lll.Il(var1);
   }

   public double llIl() {
      return this.lI.I();
   }
}
