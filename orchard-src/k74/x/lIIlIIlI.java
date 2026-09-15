package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class lIIlIIlI {
   private boolean I;
   private int l;
   private boolean II;
   private float Il;
   private float lI;
   private static final int[] IlI;
   private float ll;
   private float III;
   private boolean IIl;

   private static int lll(int var0, int var1) {
      int var2 = IlI[var0 ^ -1307705955] ^ var1 ^ var0;
      var2 -= 33039;
      var2 ^= 61766;
      var2 += 39798;
      var2 ^= 20798;
      var2 += 63314;
      return var2 ^ 17618;
   }

   private void I(class_310 var1, boolean var2) {
      if (this.IIl && var2) {
         if (var1 != null && var1.field_1724 != null) {
            var1.field_1724.method_36456(this.ll);
            var1.field_1724.method_36457(lII(this.III));
            this.II = true;
            this.l = lll(-1307705955, -125019283 ^ -769741243);
         }

         this.IIl = false;
      }
   }

   public void l(class_310 var1, boolean var2, boolean var3) {
      if (var2) {
         this.II = false;
         this.l = 0;
         if (!this.I && var1 != null && var1.field_1724 != null) {
            this.I = true;
            this.IIl = false;
            this.ll = var1.field_1724.method_36454();
            this.III = lII(var1.field_1724.method_36455());
            this.Il = this.ll;
            this.lI = this.III;
         }
      } else if (!this.I) {
         this.I(var1, var3);
         this.llI(var1);
      } else {
         this.I = false;
         if (var3 && var1 != null && var1.field_1724 != null) {
            this.IIl = false;
            var1.field_1724.method_36456(this.ll);
            var1.field_1724.method_36457(lII(this.III));
            this.II = true;
            this.l = lll(-1307705956, -456712336 ^ 584191166);
         } else {
            this.IIl = true;
         }
      }
   }

   static {
      int var2 = 1412223859;
      byte[] var0 = "3M*ÓßÊÌ4".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      IlI = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         IlI[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);
   }

   public boolean II() {
      return this.IIl;
   }

   public boolean Il() {
      return this.II;
   }

   public boolean lI() {
      return this.I;
   }

   public boolean ll() {
      return this.I || this.IIl || this.II;
   }

   public void III(class_310 var1, boolean var2) {
      this.l(var1, var2, true);
   }

   public float IIl(float var1) {
      if (this.II) {
         class_310 var2 = class_310.method_1551();
         if (var2 != null && var2.field_1724 != null) {
            return var2.field_1724.method_5695(var1);
         }
      }

      return class_3532.method_16439(var1, this.lI, this.III);
   }

   private static boolean IlI(class_746 var0) {
      if (var0 == null) {
         return true;
      } else {
         float var1 = Math.abs(class_3532.method_15393(var0.field_3932 - var0.method_36454()));
         float var2 = Math.abs(var0.field_3916 - var0.method_36455());
         float var3 = Math.abs(class_3532.method_15393(var0.field_3931 - var0.method_36454()));
         float var4 = Math.abs(var0.field_3914 - var0.method_36455());
         return var1 < 0.25F && var2 < 0.25F && var3 < 0.25F && var4 < 0.25F;
      }
   }

   public float Ill(float var1) {
      if (this.II) {
         class_310 var2 = class_310.method_1551();
         if (var2 != null && var2.field_1724 != null) {
            return var2.field_1724.method_5705(var1);
         }
      }

      return class_3532.method_17821(var1, this.Il, this.ll);
   }

   private static float lII(float var0) {
      return class_3532.method_15363(var0, -90.0F, 90.0F);
   }

   public void lIl(float var1, float var2, float var3, float var4) {
      if (this.I || this.IIl) {
         this.Il = this.ll;
         this.lI = this.III;
         this.ll = class_3532.method_15393(this.ll + class_3532.method_15393(var3 - var1));
         this.III = lII(this.III + var4 - var2);
      }
   }

   private void llI(class_310 var1) {
      if (this.II) {
         if (var1 != null && var1.field_1724 != null) {
            if (IlI(var1.field_1724) || --this.l <= 0) {
               this.II = false;
               this.l = 0;
            }
         } else {
            this.II = false;
            this.l = 0;
         }
      }
   }
}
