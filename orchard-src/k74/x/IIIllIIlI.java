package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class IIIllIIlI {
   public static boolean I(class_243 var0, class_243 var1, class_243 var2, double var3) {
      if (var0 != null && var1 != null && var2 != null) {
         class_243 var5 = var2.method_1020(var0);
         if (!(var1.method_1027() <= 1.0E-9) && !(var5.method_1027() <= 1.0E-9)) {
            double var6 = var1.method_1029().method_1026(var5.method_1029());
            double var8 = class_3532.method_15350(var6, -1.0, 1.0);
            double var10 = Math.toDegrees(Math.acos(var8));
            return var10 <= var3;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private IIIllIIlI() {
   }
}
