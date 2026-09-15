package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class lllIIllI extends IIllllIl<String> {
   private final IIIlIlIl I;
   private IIIlIlIl l;

   public void I(String var1) {
      this.lI(IlIIllIII.lII(var1 == null ? "" : var1));
   }

   public lllIIllI(Object var1, Object var2) {
      super(var1, "");
      this.I = IlI(var2);
      this.l = this.I;
   }

   public lllIIllI(Object var1, String var2) {
      this(var1, (Object)var2);
   }

   public IIIlIlIl II() {
      return this.l;
   }

   @Override
   public JsonElement IIl() {
      return new JsonPrimitive(this.III());
   }

   public void lI(IIIlIlIl var1) {
      IIIlIlIl var2 = var1 == null ? IlIIllIII.lII("") : var1;
      if (!this.l.lll(var2)) {
         this.l = var2;
         this.llll();
      }
   }

   @Override
   public void ll(JsonElement var1) {
      if (var1 != null && var1.isJsonPrimitive()) {
         this.I(var1.getAsString());
      }
   }

   public String III() {
      return this.l.llIl();
   }

   private static IIIlIlIl IlI(Object var0) {
      return IlIIllIII.l(var0);
   }

   @Override
   public void Illl() {
      this.lI(this.I);
   }

   public String Ill() {
      return this.I.llIl();
   }

   public lllIIllI(String var1, String var2) {
      this((Object)var1, (Object)var2);
   }
}
