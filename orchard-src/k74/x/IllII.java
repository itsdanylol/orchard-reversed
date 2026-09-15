package k74.x;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicLong;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IllII {
   private static final int[] Il = new int[2];
   private final AtomicLong I;
   private final Deque<lIlIIIl> l = new ArrayDeque<>();
   private static final long II = Long.MAX_VALUE;

   public synchronized boolean I(llllIllI var1, int var2, int var3, lIl var4) {
      lIlIIIl var5 = this.II(var1);
      if (var5 != null && !var5.Ill) {
         int var6 = var5.lI == lllIIIl.l && var3 >= 0 ? Math.max(1, var3) : var3;
         var5.I = true;
         var5.ll = var6 < 0 ? Long.MAX_VALUE : (long)var2 + var6;
         var5.l = var4 == null ? (var5.lI == lllIIIl.l ? lIl.I : lll(var6)) : var4;
         return true;
      } else {
         return false;
      }
   }

   public synchronized int l() {
      return this.l.size();
   }

   private lIlIIIl II(llllIllI var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 != null && var1.II()) {
         for (lIlIIIl var4 : this.l) {
            if (var4.lII.I() == var1.I() && var4.lII.l() == var1.l()) {
               return var4;
            }

            if (var2 != null) {
               break;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public synchronized boolean Il(llllIllI var1) {
      return this.II(var1) != null;
   }

   public synchronized void lI() {
      this.l.clear();
   }

   public synchronized boolean ll(Object var1) {
      lIlIIIl var2 = this.l.peekFirst();
      return var1 != null && var2 != null && var2.lII.l() == var1;
   }

   public synchronized void III(IIIIIII var1, llllIllI var2, lllIII var3) {
      String[] var4 = IIllllIl.IIIIl();
      lIlIIIl var5 = this.II(var2);
      if (var5 != null) {
         label23: {
            this.lIl(var5);
            Ill(var5);
            if (var3 == lllIII.II) {
               this.lIll(var1, var5);
               if (var4 == null) {
                  break label23;
               }
            }

            this.l.removeFirst();
         }

         if (var3 != lllIII.II && !this.l.isEmpty()) {
            lIlIIIl var6 = this.l.peekFirst();
            var1.II(var6.lI, var6.lIl);
         }
      }
   }

   public synchronized boolean IIl(Object var1) {
      return this.Illl(var1) != null;
   }

   private static void IlI(lIlIIIl var0, int var1, int var2) {
      int var3 = var0.lI == lllIIIl.l && var2 >= 0 ? Math.max(1, var2) : var2;
      var0.ll = var3 < 0 ? Long.MAX_VALUE : (long)var1 + var3;
      var0.l = var0.lI == lllIIIl.l ? lIl.I : lll(var3);
   }

   private static void Ill(lIlIIIl var0) {
      Runnable var1 = var0.Il;
      var0.Il = null;
      if (var1 != null) {
         try {
            var1.run();
         } catch (Throwable var3) {
            var3.printStackTrace();
         }
      }
   }

   private static int IIIll(int var0, int var1) {
      int var2 = Il[var0 ^ 653730885] ^ var1 ^ var0;
      var2 ^= 46756;
      var2 += 54953;
      var2 ^= 30388;
      var2 ^= 30680;
      var2 += 50847;
      var2 += 53621;
      return var2 - 46163;
   }

   public synchronized boolean lII(Object var1, int var2) {
      lIlIIIl var3 = this.l.peekFirst();
      if (var1 != null && var2 >= 0 && var2 <= IIIll(653730885, -2136612673 ^ 382188312) && var3 != null && var3.lII.l() == var1 && !var3.Ill) {
         var3.lIl = var2;
         return true;
      } else {
         return false;
      }
   }

   private void lIl(lIlIIIl var1) {
      while (!this.l.isEmpty()) {
         lIlIIIl var2 = this.l.peekFirst();
         if (var2 == var1) {
            return;
         }

         this.l.removeFirst();
         Ill(var2);
      }
   }

   public synchronized llllIllI llI(IIIIIII var1, Object var2, int var3, lllIIIl var4, int var5, boolean var6, Runnable var7) {
      if (!IIIII(var1, var2, var3, var4)) {
         return new llllIllI(0L, var2);
      } else {
         lIlIIIl var8 = this.Illl(var2);
         int var9 = this.l.isEmpty() && var4 == lllIIIl.l ? var1.l() : this.lIlI(var1);
         return var8 != null || var9 != var3 || var4 == lllIIIl.l && var1.lI() != var3
            ? this.IIlI(var1, var2, var3, var4, var5, var6, var7)
            : new llllIllI(-1L, var2);
      }
   }

   private static lIl lll(int var0) {
      return var0 > 0 ? lIl.I : lIl.lI;
   }

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "úÐM\f¸\u0007©\u0019".getBytes("ISO-8859-1");

      int var14;
      do {
         Il[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1245986104;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);
   }

   public synchronized boolean IIII(IIIIIII var1, llllIllI var2, int var3, lllIIIl var4, int var5) {
      if (!IIIII(var1, var2 == null ? null : var2.l(), var3, var4) || var2.I() == 0L || var1.Il() < var5) {
         return false;
      } else {
         return var2.I() < 0L ? var1.I(var4, var3) : this.lllI(var1, var2, var5);
      }
   }

   public synchronized boolean IIIl() {
      lIlIIIl var1 = this.l.peekFirst();
      return var1 != null && var1.lI == lllIIIl.l;
   }

   public synchronized llllIllI IIlI(IIIIIII var1, Object var2, int var3, lllIIIl var4, int var5, boolean var6, Runnable var7) {
      if (!IIIII(var1, var2, var3, var4)) {
         return new llllIllI(0L, var2);
      } else {
         lIlIIIl var8 = this.Illl(var2);
         lIlIIIl var9 = this.l.peekFirst();
         if (var8 != null) {
            if (var8 == var9 && !var8.Ill) {
               boolean var15 = var9.lIl != var3 || var9.lI != var4;
               var9.lIl = var3;
               var9.lI = var4;
               var9.I = var6;
               var9.Il = var7;
               IlI(var9, var1.Il(), var5);
               if (var15) {
                  var1.II(var4, var3);
               }

               return var9.lII;
            } else {
               return new llllIllI(0L, var2);
            }
         } else {
            int var10 = this.l.isEmpty() && var4 == lllIIIl.l ? var1.l() : this.lIlI(var1);
            if (var10 != var3 || var4 == lllIIIl.l && var1.lI() != var3) {
               lIlIIIl var11 = this.l.peekLast();
               int var12 = var11 == null ? var1.lI() : var11.IIl;
               lllIIIl var13 = var11 == null ? IllI(var4) : var11.II;
               lIlIIIl var14 = new lIlIIIl(
                  new llllIllI(this.I.incrementAndGet(), var2), var12, var13, var10, var9 == null ? IllI(var4) : var9.lI, var3, var4, var6, var7
               );
               IlI(var14, var1.Il(), var5);
               this.l.addFirst(var14);
               if (var10 != var3 || var4 != lllIIIl.l) {
                  var1.II(var4, var3);
               }

               return var14.lII;
            } else {
               return new llllIllI(0L, var2);
            }
         }
      }
   }

   public synchronized boolean IIll() {
      lIlIIIl var1 = this.l.peekFirst();
      return var1 != null && var1.Ill;
   }

   private lIlIIIl IlII(lIlIIIl var1) {
      boolean var2 = false;

      for (lIlIIIl var4 : this.l) {
         if (var2) {
            return var4;
         }

         var2 = var4 == var1;
      }

      return null;
   }

   private boolean IlIl(IIIIIII var1, lIlIIIl var2) {
      if (!var1.I(var2.lI, var2.lIl)) {
         return false;
      } else {
         var2.Ill = false;
         return this.l.remove(var2);
      }
   }

   private static lllIIIl IllI(lllIIIl var0) {
      return var0 == lllIIIl.l ? lllIIIl.l : var0;
   }

   public IllII() {
      this.I = new AtomicLong();
   }

   private lIlIIIl Illl(Object var1) {
      if (var1 == null) {
         return null;
      } else {
         for (lIlIIIl var3 : this.l) {
            if (var3.lII.l() == var1) {
               return var3;
            }
         }

         return null;
      }
   }

   public synchronized void lIII(IIIIIII var1, lIl var2) {
      while (true) {
         lIlIIIl var3 = this.l.peekFirst();
         if (var3 == null) {
            return;
         }

         if (var3.Ill) {
            if (!this.IlIl(var1, var3)) {
               return;
            }
         } else {
            if (!var3.I(var1.Il(), var2)) {
               return;
            }

            boolean var4 = var3.I;
            Ill(var3);
            if (var4) {
               this.lIll(var1, var3);
               if (var3.Ill) {
                  return;
               }
            } else {
               this.l.removeFirst();
            }

            if (!var4 && !this.l.isEmpty()) {
               lIlIIIl var5 = this.l.peekFirst();
               var1.II(var5.lI, var5.lIl);
            }
         }
      }
   }

   public synchronized boolean lIIl(Object var1) {
      lIlIIIl var2 = this.Illl(var1);
      if (var2 == null) {
         return false;
      } else {
         var2.Il = null;
         return this.l.remove(var2);
      }
   }

   public synchronized int lIlI(IIIIIII var1) {
      lIlIIIl var2 = this.l.peekFirst();
      return var2 == null ? var1.lI() : var2.lIl;
   }

   private void lIll(IIIIIII var1, lIlIIIl var2) {
      lIlIIIl var3 = this.IlII(var2);
      int var4 = var3 != null ? var3.lIl : var2.IIl;
      lllIIIl var5 = var2.lI == lllIIIl.l ? lllIIIl.l : (var3 != null ? var3.lI : var2.II);
      var2.Ill = true;
      var2.lIl = var4;
      var2.lI = var5;
      var1.II(var5, var4);
      if (var5 != lllIIIl.l || var1.I(var5, var4)) {
         this.l.remove(var2);
         var2.Ill = false;
      }
   }

   public synchronized int llII(Object var1) {
      lIlIIIl var2 = this.l.peekFirst();
      return var1 != null && var2 != null && var2.lII.l() == var1 ? var2.lIl : -1;
   }

   public synchronized boolean llIl(Object var1, int var2, int var3, lIl var4) {
      lIlIIIl var5 = this.Illl(var1);
      return var5 != null && this.I(var5.lII, var2, var3, var4);
   }

   public synchronized boolean lllI(IIIIIII var1, llllIllI var2, int var3) {
      lIlIIIl var4 = this.II(var2);
      return var4 != null && var4 == this.l.peekFirst() && !var4.Ill && var1.Il() >= var3 && var1.I(var4.lI, var4.lIl);
   }

   public synchronized lllIIIl llll(Object var1) {
      lIlIIIl var2 = this.l.peekFirst();
      return var1 != null && var2 != null && var2.lII.l() == var1 ? var2.lI : null;
   }

   private static boolean IIIII(IIIIIII var0, Object var1, int var2, lllIIIl var3) {
      return var0 != null && var1 != null && var3 != null && var2 >= 0 && var2 <= IIIll(653730884, -1688197680 ^ 1339398755);
   }

   public synchronized void IIIIl(IIIIIII var1, Object var2, lllIII var3) {
      String[] var4 = IIllllIl.IIIIl();
      lIlIIIl var5 = this.Illl(var2);
      if (var5 != null) {
         if (var5 != this.l.peekFirst()) {
            this.l.remove(var5);
            Ill(var5);
         } else {
            label28: {
               Ill(var5);
               if (var3 == lllIII.II) {
                  this.lIll(var1, var5);
                  if (var4 == null) {
                     break label28;
                  }
               }

               this.l.removeFirst();
            }

            if (var3 != lllIII.II && !this.l.isEmpty()) {
               lIlIIIl var6 = this.l.peekFirst();
               var1.II(var6.lI, var6.lIl);
            }
         }
      }
   }

   public synchronized boolean IIIlI() {
      return !this.l.isEmpty();
   }
}
