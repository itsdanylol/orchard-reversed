package k74.x;

import java.util.ArrayDeque;
import java.util.Deque;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class lIIIIlII {
   private static final int[] l = new int[3];
   private static final Deque<IllIllII> I;

   public static boolean I(IlIIIIIIl var0, int var1, boolean var2, int var3, boolean var4, Runnable var5) {
      class_310 var6 = class_310.method_1551();
      if (var0 == null || var6.field_1724 == null) {
         return false;
      } else if (var1 >= 0 && var1 <= IlI(541472674, -295980744 ^ -1997924010)) {
         IllIllII var7 = I.peek();
         if (var7 != null && var7.ll == var0) {
            var7.II = var1;
            var7.III = var2;
            var7.lI = var4;
            var7.I = var3 < 0 ? Long.MAX_VALUE : var6.field_1724.field_6012 + var3;
            var7.Il = var3 <= 0 ? IlIlIIIl.ll : IlIlIIIl.lI;
            var7.l = var5;
            II(var6.field_1724, var1, var2);
            return true;
         } else if (Il(var0)) {
            return false;
         } else {
            int var8 = l(var6.field_1724);
            if (var8 == var1) {
               return false;
            } else {
               IllIllII var9 = I.peekLast();
               int var10 = var9 != null ? var9.IIl : var8;
               boolean var11 = var9 != null ? var9.IlI : var2;
               long var12 = var3 < 0 ? Long.MAX_VALUE : var6.field_1724.field_6012 + var3;
               IlIlIIIl var14 = var3 <= 0 ? IlIlIIIl.ll : IlIlIIIl.lI;
               I.push(new IllIllII(var0, var10, var11, var1, var2, var4, var12, var14, var5));
               II(var6.field_1724, var1, var2);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private lIIIIlII() {
   }

   public static int l(class_746 var0) {
      if (var0 == null) {
         return -1;
      } else {
         IllIllII var1 = I.peek();
         return var1 != null ? var1.II : var0.method_31548().method_67532();
      }
   }

   private static int IlI(int var0, int var1) {
      int var2 = l[var0 ^ 541472674] ^ var1 ^ var0;
      var2 ^= 21117;
      var2 -= 24813;
      var2 -= 6639;
      var2 ^= 47904;
      var2 += 16732;
      var2 += 14410;
      var2 += 21127;
      return var2 + 26461;
   }

   private static void II(class_746 var0, int var1, boolean var2) {
      if (var0 != null && var1 >= 0 && var1 <= IlI(541472675, 1763303111 ^ 549928925)) {
         var0.method_31548().method_61496(var1);
      }
   }

   public static boolean Il(IlIIIIIIl var0) {
      String[] var1 = IIllllIl.IIIIl();
      if (var0 == null) {
         return false;
      } else {
         for (IllIllII var3 : I) {
            if (var3.ll == var0) {
               return true;
            }

            if (var1 != null) {
               break;
            }
         }

         return false;
      }
   }

   public static boolean lI(IlIIIIIIl var0, int var1, boolean var2, int var3, boolean var4, Runnable var5) {
      class_310 var6 = class_310.method_1551();
      if (var0 == null || var6.field_1724 == null) {
         return false;
      } else if (var1 >= 0 && var1 <= IlI(541472672, -412953507 ^ -1272481825)) {
         int var7 = l(var6.field_1724);
         return var7 == var1 && !Il(var0) ? true : I(var0, var1, var2, var3, var4, var5);
      } else {
         return false;
      }
   }

   public static boolean ll(IlIIIIIIl var0, int var1, boolean var2) {
      return I(var0, var1, var2, 0, true, null);
   }

   public static boolean III(IlIIIIIIl var0, int var1, boolean var2, int var3) {
      return I(var0, var1, var2, var3, true, null);
   }

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "\u0094èkµ»\u0087\"À¡\u001c`[".getBytes("ISO-8859-1");

      int var14;
      do {
         l[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 769741886;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);

      I = new ArrayDeque<>();
   }

   public static void IIl(IlIIIIIIl var0) {
      class_310 var1 = class_310.method_1551();
      if (var0 != null && !I.isEmpty() && var1.field_1724 != null) {
         IllIllII var2 = I.peek();
         if (var2 != null && var2.ll == var0) {
            I.pop();
            IllIllII var3 = I.peek();
            int var4 = var3 != null ? var3.II : var2.IIl;
            boolean var5 = var3 != null ? var3.III : var2.IlI;
            if (var2.lI) {
               II(var1.field_1724, var4, var5);
            }

            if (var2.l != null) {
               var2.l.run();
            }
         }
      }
   }
}
