package k74.x;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IIIlIllll {
   private static final int[] lI;
   private static final Map<UUID, Integer> I;
   private static final Map<UUID, Integer> l;
   private static final Map<UUID, Integer> II;
   private static volatile int Il;

   static {
      int var2 = -1615342018;
      byte[] var0 = "ª\u001cWç".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      lI = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         lI[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);

      l = new ConcurrentHashMap<>();
      I = new ConcurrentHashMap<>();
      II = new ConcurrentHashMap<>();
      Il = lII(1073001468, 263000847 ^ -99685831);
   }

   public static int I(UUID var0) {
      if (var0 == null) {
         return Il;
      } else {
         Integer var1 = I.get(var0);
         if (var1 != null) {
            return var1;
         } else {
            Integer var2 = II.get(var0);
            if (var2 != null) {
               return var2;
            } else {
               Integer var3 = l.get(var0);
               return var3 != null ? var3 : Il;
            }
         }
      }
   }

   private static int lII(int var0, int var1) {
      int var2 = lI[var0 ^ 1073001468] ^ var1 ^ var0;
      var2 += 33738;
      var2 -= 63006;
      var2 += 48936;
      var2 += 57111;
      var2 += 46910;
      var2 += 44157;
      var2 ^= 4521;
      var2 ^= 54833;
      return var2 - 27375;
   }

   public static void l(UUID var0) {
      if (var0 != null) {
         l.put(var0, Il);
      }
   }

   public static void II(UUID var0, int var1) {
      if (var0 != null) {
         II.put(var0, var1);
      }
   }

   public static boolean Il(UUID var0) {
      return var0 != null && (l.containsKey(var0) || I.containsKey(var0) || II.containsKey(var0));
   }

   public static void lI() {
      II.clear();
   }

   private IIIlIllll() {
   }

   public static void ll() {
      l.clear();
   }

   public static void III(int var0) {
      Il = var0;
   }

   public static void IIl(UUID var0, int var1) {
      if (var0 != null) {
         I.put(var0, var1);
      }
   }

   public static int IlI() {
      return Il;
   }

   public static void Ill() {
      I.clear();
   }
}
