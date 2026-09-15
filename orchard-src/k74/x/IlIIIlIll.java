package k74.x;

import java.awt.image.BufferedImage;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_437;

@Environment(EnvType.CLIENT)
public final class IlIIIlIll {
   private static long I;
   private static int l = -1;
   private static class_437 II;
   private static int Il = -1;
   private static BufferedImage lI;
   private static final long ll = 50L;

   private IlIIIlIll() {
   }

   public static IIIIlll I() {
      return lI == null ? null : new IIIIlll(lI, l, Il, I);
   }

   public static void l(class_310 var0, long var1) {
      if (var0 != null && var0.method_22683() != null && var0.field_1687 != null) {
         class_437 var3 = var0.field_1755;
         int var4 = var0.method_22683().method_4486();
         int var5 = var0.method_22683().method_4502();
         long var6 = Math.max(0L, var1);
         long var8 = System.currentTimeMillis();
         if (var8 - I >= var6 || var3 != II || var4 != l || var5 != Il) {
            BufferedImage var10 = IIll.llIIIl(var0);
            if (var10 != null) {
               lI = var10;
               II = var3;
               l = var4;
               Il = var5;
               I = var8;
            }
         }
      }
   }

   public static void II() {
      lI = null;
      II = null;
      l = -1;
      Il = -1;
      I = 0L;
   }

   public static void Il(class_310 var0) {
      l(var0, 50L);
   }
}
