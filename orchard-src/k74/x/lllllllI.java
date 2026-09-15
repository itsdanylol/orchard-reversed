package k74.x;

import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class lllllllI {
   private static final Robot I = I();

   private lllllllI() {
   }

   private static Robot I() {
      try {
         try {
            if (GraphicsEnvironment.isHeadless()) {
               return null;
            }
         } catch (Throwable var1) {
            throw l(var1);
         }

         return new Robot();
      } catch (Throwable var2) {
         return null;
      }
   }

   private static Throwable l(Throwable var0) {
      return var0;
   }

   private static Robot II() {
      return I;
   }
}
