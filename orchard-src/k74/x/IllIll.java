package k74.x;

import com.mojang.authlib.GameProfile;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_640;

@Environment(EnvType.CLIENT)
public final class IllIll {
   public static String I(String var0) {
      IIlllllII var1 = IIlllllII.IIlllI();
      return var1 != null && l() && var1.IlllI() ? var1.IlII(var0) : var0;
   }

   private static boolean l() {
      class_310 var0 = class_310.method_1551();
      return var0.field_1724 != null && var0.field_1687 != null;
   }

   private IllIll() {
   }

   public static class_2561 II(class_2561 var0) {
      IIlllllII var1 = IIlllllII.IIlllI();
      return var1 != null && l() && var1.IlllI() ? var1.IlIIlI(var0) : var0;
   }

   public static class_2561 Il(GameProfile var0, class_2561 var1) {
      IIlllllII var2 = IIlllllII.IIlllI();
      return var2 == null ? var1 : var2.llIll(var0, var1);
   }

   public static Object lI(GameProfile var0) {
      IIlllllII var1 = IIlllllII.IIlllI();
      Object var2 = var1 == null ? null : var1.lll(var0);
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 == null) {
         return var2;
      } else {
         IIlllII var4 = var3.II().IlII();
         return var4 == null ? var2 : var4.llI(var0, var2);
      }
   }

   public static boolean ll() {
      return IIlllllII.IIlllI() != null;
   }

   public static class_2561 III(class_640 var0, class_2561 var1) {
      return var0 == null ? var1 : Il(var0.method_2966(), var1);
   }
}
