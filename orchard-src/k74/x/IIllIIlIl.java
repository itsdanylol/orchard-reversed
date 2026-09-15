package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2868;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
final class IIllIIlIl implements IIIIIII {
   private static final int[] l = new int[1];
   private final class_310 I;

   @Override
   public boolean I(lllIIIl var1, int var2) {
      if (var1 == lllIIIl.l) {
         if (this.l() != var2 && lllllll.Il() != var2) {
            if (lllllll.Il() != var2) {
               this.II(var1, var2);
            }

            return false;
         } else {
            return true;
         }
      } else {
         return this.lI() == var2;
      }
   }

   private static int ll(int var0, int var1) {
      int var2 = l[var0 ^ -383431093] ^ var1 ^ var0;
      var2 -= 28849;
      var2 -= 5321;
      var2 ^= 62355;
      var2 -= 13938;
      var2 += 13523;
      var2 += 53514;
      var2 -= 16431;
      var2 ^= 11598;
      var2 += 55508;
      return var2 - 510;
   }

   @Override
   public int l() {
      return IIll.lllII >= 0 && IIll.lllII < ll(-383431093, 1020690396 ^ 1166703960) ? IIll.lllII : this.lI();
   }

   @Override
   public void II(lllIIIl var1, int var2) {
      String[] var3 = IIllllIl.IIIIl();
      switch (IIllllIlI.l[var1.ordinal()]) {
         case 1:
            IIll.lIIIlII(this.I, var2, true);
            if (var3 == null) {
               break;
            }
         case 2:
            IIll.IlllII(this.I, var2);
            IIll.lIIIlII(this.I, var2, false);
            if (var3 == null) {
               break;
            }
         case 3:
            label68: {
               int var4 = lllllll.Il();
               if (var4 != var2 && (var4 >= 0 || this.l() != var2)) {
                  lllllll.IIl(var2);
                  IIll.llll++;

                  try {
                     this.I.method_1562().method_52787(new class_2868(var2));
                  } finally {
                     IIll.llll = Math.max(0, IIll.llll - 1);
                  }

                  if (var3 == null) {
                     break label68;
                  }
               }

               lllllll.IIl(var2);
            }

            IIIIIllII var5 = IIIIIllII.III();
            if (IIll.lIIlll() && var5 != null && var5.II() != null && var5.II().llIIlI() != null && var5.II().llIIlI().IIIIlIl()) {
               var5.II().llIIlI().lI(var2);
            }
      }
   }

   @Override
   public int Il() {
      return this.I != null && this.I.field_1724 != null ? this.I.field_1724.field_6012 : 0;
   }

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "\u0080Q?¦".getBytes("ISO-8859-1");

      int var14;
      do {
         l[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -271089883;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);
   }

   @Override
   public int lI() {
      return IIlllIllI.Il(this.I.field_1724.method_31548());
   }

   private IIllIIlIl(class_310 var1) {
      this.I = var1;
   }
}
