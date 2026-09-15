package k74.x;

import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class IlIIIlIIl {
   private final Map<Long, IIIlIlIl> I = new HashMap<>();

   private IIIlIlIl I(long var1) {
      return this.I.get(var1);
   }

   private void l(String var1, String var2) {
      this.I.put(IlIIllIII.Ill(var1).I(), IlIIllIII.Ill(var2));
   }

   private IlIIIlIIl() {
   }
}
