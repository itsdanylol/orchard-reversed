package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;

@Environment(EnvType.CLIENT)
public final class lIIlllI {
   public static llllllll I() {
      IIlIlIlII var0 = ll();
      if (var0 != null && var0.lIIIII()) {
         return llllllll.I;
      } else {
         llllIIIl var1 = lI();
         return var1 != null && var1.llIll() ? llllllll.II : llllllll.Il;
      }
   }

   public static boolean l(llllllll var0, class_1297 var1) {
      if (var0 == llllllll.I) {
         IIlIlIlII var3 = ll();
         return var3 != null && var3.llII(var1);
      } else if (var0 != llllllll.II) {
         return false;
      } else {
         llllIIIl var2 = lI();
         return var2 != null && var2.IIllII(var1);
      }
   }

   public static float II(llllllll var0, float var1) {
      if (var0 == llllllll.I) {
         IIlIlIlII var3 = ll();
         return var3 == null ? 0.0F : var3.II(var1);
      } else {
         llllIIIl var2 = lI();
         return var0 == llllllll.II && var2 != null ? var2.lIll(var1) : 0.0F;
      }
   }

   public static float Il(llllllll var0, float var1) {
      if (var0 == llllllll.I) {
         IIlIlIlII var3 = ll();
         return var3 == null ? 0.0F : var3.lIIII(var1);
      } else {
         llllIIIl var2 = lI();
         return var0 == llllllll.II && var2 != null ? var2.IIIII(var1) : 0.0F;
      }
   }

   private lIIlllI() {
   }

   private static llllIIIl lI() {
      IIIIIllII var0 = IIIIIllII.III();
      return var0 != null && var0.II() != null ? var0.II().lllIlI() : null;
   }

   private static IIlIlIlII ll() {
      IIIIIllII var0 = IIIIIllII.III();
      return var0 != null && var0.II() != null ? var0.II().llIlIl() : null;
   }

   public static void III(llllllll var0, float var1, float var2, float var3, float var4) {
      if (var0 == llllllll.I) {
         IIlIlIlII var6 = ll();
         if (var6 != null) {
            var6.lIlIl(var1, var2, var3, var4);
         }
      } else {
         if (var0 == llllllll.II) {
            llllIIIl var5 = lI();
            if (var5 != null) {
               var5.lIIll(var1, var2, var3, var4);
            }
         }
      }
   }
}
