package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_757;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public final class lllII {
   private static volatile llIIlIIl I = new llIIlIIl(null, null, null, null, null);
   public static final lIIlII l = new lIIlII();
   private static volatile IlIlIIIlI II = new IlIlIIIlI(null, null, null, null);

   public static void I(class_4184 var0, class_757 var1, Matrix4f var2, Matrix4f var3) {
      II = new IlIlIIIlI(var0, var1, II(var2), II(var3));
   }

   private static <T> T l(T var0, T var1) {
      return (T)(var0 != null ? var0 : var1);
   }

   private lllII() {
   }

   private static Matrix4f II(Matrix4f var0) {
      return var0 == null ? null : new Matrix4f(var0);
   }
}
