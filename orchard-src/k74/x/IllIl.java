package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public interface IllIl {
   long I();

   static boolean l(Enum<?> var0, String var1) {
      if (var0 == null || var1 == null) {
         return false;
      } else {
         return var0 instanceof IllIl var2 ? var2.I() == IlIIllIII.IlIl(var1) : var0.name().equals(var1);
      }
   }
}
