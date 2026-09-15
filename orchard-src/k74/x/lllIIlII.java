package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class lllIIlII extends IIllllIl<Boolean> {
   public lllIIlII(Object var1, boolean var2) {
      super(var1, var2);
   }

   @Override
   public JsonElement IIl() {
      return new JsonPrimitive(this.IllI());
   }

   public lllIIlII(String var1, boolean var2) {
      this((Object)var1, var2);
   }

   @Override
   public void ll(JsonElement var1) {
      if (var1 != null && var1.isJsonPrimitive()) {
         this.Il(var1.getAsBoolean());
      }
   }
}
