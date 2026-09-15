package k74.x;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
final class IIlIllll {
   private static final int[] l;
   private final Map<IIIIlllI, class_243> I = new lIlIIlll(this, Ill(-236945068, -725754209 ^ 385222275), 0.75F, true);

   void I() {
      this.I.clear();
   }

   static {
      int var2 = 1789533400;
      byte[] var0 = "¦ü?\u0099".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      l = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         l[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);
   }

   private static IIIIIlIl l(IIIIIlIl var0) {
      return var0 == null ? IIIIIlIl.IIl : var0;
   }

   void II(int var1, IIIIIlIl var2) {
      this.I.remove(new IIIIlllI(var1, l(var2)));
   }

   class_243 Il(int var1, IIIIIlIl var2, class_238 var3) {
      if (var3 == null) {
         return null;
      } else {
         class_243 var4 = this.I.get(new IIIIlllI(var1, l(var2)));
         return var4 == null ? null : IIl(var3, var4);
      }
   }

   void lI(int var1, IIIIIlIl var2, class_238 var3, class_243 var4) {
      if (var3 != null && IlIIIllll.llIIIl(var4)) {
         this.I.put(new IIIIlllI(var1, l(var2)), III(var3, var4));
      }
   }

   int ll() {
      return this.I.size();
   }

   private static class_243 III(class_238 var0, class_243 var1) {
      return new class_243(
         IlI(var1.field_1352, var0.field_1323, var0.field_1320),
         IlI(var1.field_1351, var0.field_1322, var0.field_1325),
         IlI(var1.field_1350, var0.field_1321, var0.field_1324)
      );
   }

   private static class_243 IIl(class_238 var0, class_243 var1) {
      return new class_243(
         class_3532.method_16436(var1.field_1352, var0.field_1323, var0.field_1320),
         class_3532.method_16436(var1.field_1351, var0.field_1322, var0.field_1325),
         class_3532.method_16436(var1.field_1350, var0.field_1321, var0.field_1324)
      );
   }

   private static int Ill(int var0, int var1) {
      int var2 = l[var0 ^ -236945068] ^ var1 ^ var0;
      var2 += 40144;
      var2 ^= 18642;
      var2 ^= 46052;
      var2 += 57121;
      var2 += 37242;
      return var2 ^ 24234;
   }

   private static double IlI(double var0, double var2, double var4) {
      double var6 = var4 - var2;
      return var6 <= 1.0E-6 ? 0.5 : class_3532.method_15350((var0 - var2) / var6, 0.0, 1.0);
   }
}
