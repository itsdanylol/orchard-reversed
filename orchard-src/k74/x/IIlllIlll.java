package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
public final class IIlllIlll {
   public static boolean I(class_1309 var0) {
      return var0 instanceof class_1657 var1 && II(var1);
   }

   public static boolean l(class_1297 var0) {
      return var0 instanceof class_1657 var1 && II(var1);
   }

   private IIlllIlll() {
   }

   public static boolean II(class_1657 var0) {
      if (var0 == null) {
         return false;
      } else {
         IIIIIllII var1 = IIIIIllII.III();
         if (var1 != null && var1.II() != null) {
            IIlIlllll var2 = var1.II().IlIllI();
            if (var2 != null && var2.lI(var0)) {
               return true;
            } else {
               lIlIlIIl var3 = var1.II().IIlIll();
               if (var3 != null && var3.I(var0)) {
                  return true;
               } else {
                  lIIIlIIl var4 = var1.II().lllII(lIIIlIIl.class);
                  return var4 != null && var4.IIl(var0);
               }
            }
         } else {
            return false;
         }
      }
   }
}
