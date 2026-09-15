package k74.x;

import java.util.IdentityHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class lllllll {
   private static final int[] ll;
   private static final IdentityHashMap<Object, Long> I;
   private static int l;
   private static long II;
   private static long Il;
   private static llIIIlIl lI;

   static synchronized boolean I(int var0, int var1) {
      return l < 0 && var0 == var1;
   }

   static synchronized IIlIIlIlI l(Object var0, int var1) {
      Long var2 = I.remove(var0);
      if (var2 == null) {
         return IIlIIlIlI.I;
      } else if (var2 == II && l == var1) {
         II = 0L;
         l = -1;
         return IIlIIlIlI.II;
      } else {
         return IIlIIlIlI.ll;
      }
   }

   static {
      int var2 = -1136448064;
      byte[] var0 = "cJxy\u009d½\u007f¨".getBytes("ISO-8859-1");
      int var1 = var0.length / 4;
      ll = new int[var1];
      byte var3 = 0;
      int var4 = 0;

      do {
         int var5 = (var0[var3] & 255) << 24 | (var0[var3 + 1] & 255) << 16 | (var0[var3 + 2] & 255) << 8 | var0[var3 + 3] & 255;
         var5 ^= var2;
         ll[var4] = var5;
         var3 += 4;
      } while (++var4 < var1);

      l = -1;
      I = new IdentityHashMap<>();
   }

   static synchronized boolean II(Object var0, long var1, int var3) {
      if (!lII(var0, var1, var3)) {
         return false;
      } else {
         IlllII var4 = lI.I() == IlllII.I ? IlllII.II : IlllII.l;
         lI = lIl(var4);
         return true;
      }
   }

   static synchronized int Il() {
      return l;
   }

   static synchronized void lI(Object var0, long var1) {
      if (lll(var0, var1)) {
         lI = null;
      }
   }

   static synchronized boolean ll(Object var0, long var1, int var3, int var4) {
      return lll(var0, var1) && lI.I() == IlllII.ll && lI.lI() == var3 && lI.Il() == var4;
   }

   static synchronized boolean III(Object var0, int var1) {
      Long var2 = I.remove(var0);
      if (var2 != null && var2 == II && l == var1) {
         II = 0L;
         l = -1;
         return true;
      } else {
         return false;
      }
   }

   static synchronized void IIl(int var0) {
      l = var0;
   }

   static synchronized boolean IlI(Object var0, int var1, int var2, long var3, long var5) {
      if (var0 == null
         || var1 < 0
         || var1 > IlII(-620653716, -411920011 ^ 478643873)
         || var2 < 0
         || var2 > IlII(-620653715, -411920011 ^ -495943311)
         || var1 == var2
         || lI != null && lI.l() != var3) {
         return false;
      } else {
         lI = new llIIIlIl(var0, var1, var2, var3, var5, IlllII.I);
         return true;
      }
   }

   static synchronized void Ill(int var0) {
      if (l == var0) {
         l = -1;
      }
   }

   static synchronized boolean lII(Object var0, long var1, int var3) {
      if (!lll(var0, var1)) {
         return false;
      } else {
         return switch (lI.I()) {
            case I -> var3 == lI.lI();
            case lI -> var3 == lI.Il();
            default -> false;
         };
      }
   }

   private static llIIIlIl lIl(IlllII var0) {
      return new llIIIlIl(lI.ll(), lI.lI(), lI.Il(), lI.l(), lI.II(), var0);
   }

   static synchronized boolean llI(Object var0, long var1, long var3) {
      if (lll(var0, var1) && lI.I() == IlllII.II && var3 > lI.II()) {
         lI = lIl(IlllII.ll);
         return true;
      } else {
         return false;
      }
   }

   private static boolean lll(Object var0, long var1) {
      return lI != null && lI.ll() == var0 && lI.l() == var1;
   }

   static synchronized void IIII() {
      II = 0L;
      l = -1;
      I.clear();
      lI = null;
   }

   static synchronized boolean IIIl(Object var0, long var1, int var3) {
      if (lll(var0, var1) && lI.I() == IlllII.ll && lI.Il() == var3) {
         lI = lIl(IlllII.lI);
         return true;
      } else {
         return false;
      }
   }

   static synchronized boolean IIlI(long var0) {
      return lI != null && lI.l() == var0;
   }

   private static int IlII(int var0, int var1) {
      int var2 = ll[var0 ^ -620653716] ^ var1 ^ var0;
      var2 ^= 48308;
      var2 += 54576;
      var2 += 61824;
      var2 ^= 18915;
      var2 += 50666;
      var2 -= 36380;
      var2 += 54659;
      var2 ^= 40070;
      return var2 ^ 61017;
   }

   static synchronized void IIll(Object var0, int var1) {
      if (var0 != null && !I.containsKey(var0)) {
         long var2 = ++Il;
         I.put(var0, var2);
         II = var2;
         l = var1;
      }
   }

   private lllllll() {
   }
}
