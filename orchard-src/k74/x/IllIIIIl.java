package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1309;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_5134;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_9362;
import net.minecraft.class_239.class_240;

@Environment(EnvType.CLIENT)
public final class IllIIIIl extends IlIIIIIIl {
   private int II;
   private boolean Il;
   private long lI;
   private static final double I = 3.0;
   private boolean ll;
   private long III;
   private IIlIlIII IIl;
   private IIlIIIl IlI;
   private final lIlllIl Ill;
   private double lII;
   private static final int lIl = 3;
   private double llI;
   private long lll;
   private static final long IIII = 1500L;
   private boolean IIIl;
   private final lllIIlII IIlI;
   private static final long IIll = 1L;
   private static final String[] IlII;
   private class_239 IlIl;
   private int IllI;
   private boolean Illl;
   private final IIlIII lIII;
   private int lIIl;
   private IlIIllIll lIlI;
   private static final Object[] lIIIl;
   private class_1309 lIll;
   private static final String[] llII;
   private final lllIIlII llIl;
   private static final long lllI = 350L;
   private long llll;
   private boolean IIIII;
   private boolean IIIIl;
   private int IIIlI;
   private static String[] IIIll;
   private static final String[] lIIII;
   private boolean IIlII;
   private Consumer<Boolean> IIlIl;
   private int IIllI;
   private boolean IIlll;
   private long IlIII;
   private static final int IlIIl = 9;
   private long IlIlI;
   private final lllIIlII IlIll;
   private long IllII;
   private static final long IllIl = 1000L;
   private static final int[] Illll;
   private final IIlIII IlllI;

   private boolean I(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && this.IIIlI >= 0
         && this.IIIlI < l(-1001777623, -371246818 ^ 520049469)
         && k74.x.IIll.lIIlI(var1) == this.IIIlI
         && k74.x.IIll.IlIlIl(var1, this.IIIlI)
         && var1.field_1724.method_31548().method_5438(this.IIIlI).method_7909() instanceof class_9362
         && (!this.Illl || this.lIlI(var1.field_1724.method_31548().method_5438(this.IIIlI), IlIIllIll.l.I) > 0)
         && this.IIIlIl(var1, this.IIIlI);
   }

   @Override
   public void IllIll(class_310 var1) {
      if (this.IIIIlIl() && var1 != null && var1.field_1724 != null && var1.field_1690 != null) {
         this.IllII(var1.field_1724);
         this.IIlII = false;
         if (this.IlI != IIlIIIl.IIl) {
            this.IIIlII(var1);
            if (!this.IIlII) {
               this.IIlI(var1);
            }
         } else if (this.lIllI(var1)) {
            this.IIlI(var1);
            this.IIIl = false;
         } else {
            boolean var2 = var1.field_1690.field_1886.method_1434();
            boolean var3 = var2 && !this.IIIl;
            this.IIIl = var2;
            if (var3 || k74.x.IIll.IIIIIlI(var1.field_1690.field_1886) > 0) {
               class_3966 var4 = this.IIlIlI(var1);
               class_1309 var5 = k74.x.IIll.llIlll(var1, var4);
               this.lIll = var5;
               if (var5 != null && this.IlIIII(var1, var4, var5) && this.lIIl(var1, var5)) {
                  if (this.IIIIll(var1, var5)) {
                     this.IIIlII(var1);
                     this.IIlI(var1);
                  } else {
                     this.lIll = null;
                  }
               } else {
                  this.lIll = null;
               }
            }
         }
      } else {
         this.IIIl = false;
         this.IllII(null);
      }
   }

   private int II(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         for (int var2 = 0; var2 < l(-1001777624, 14612568 ^ 989264486); var2++) {
            class_1799 var3 = var1.field_1724.method_31548().method_5438(var2);
            if (!var3.method_7960() && var3.method_7909() instanceof class_1743 && k74.x.IIll.IIIIlll(var3)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private boolean Il(class_1799 var1) {
      return var1 != null && !var1.method_7960() && var1.method_7909() instanceof class_9362 && this.lIlI(var1, IlIIllIll.l.I) > 0;
   }

   private boolean lI(class_310 var1, class_3966 var2) {
      if (this.Illl) {
         if (!this.lll(var1)) {
            return false;
         }

         k74.x.IIll.IlIll(var1);
      }

      return this.IlllI(var1, var2, this.IIIlI);
   }

   @Override
   public void IlIII() {
      k74.x.IIll.lllIl(class_310.method_1551(), this, lllIII.I);
      this.IIIl = false;
      this.llll = 0L;
      this.IIIl();
      this.IIIII();
   }

   private void ll(class_310 var1, Boolean var2) {
      long var3 = System.currentTimeMillis();
      if (!var2) {
         this.IIlIll(var3);
      } else {
         this.II = var1.field_1724.field_6012 + 1;
         this.IlI = IIlIIIl.Ill;
         this.IlIII = var3;
         if (this.IlII(var1) && !this.I(var1)) {
            this.llllI(var1, this.IIIlI);
         }

         this.lll = var3;
      }
   }

   private boolean III(class_310 var1, class_1309 var2) {
      return this.lIIl(var1, var2) && this.IlIIIl(var2);
   }

   private boolean IIl(class_310 var1, class_243 var2, class_243 var3) {
      if (var1 != null && var1.field_1687 != null && var2 != null && var3 != null) {
         class_3965 var4 = k74.x.IIll.lIIIlll(var1, var1.field_1724, var2, var3);
         return var4 != null && var4.method_17783() != class_240.field_1333 ? var2.method_1025(var4.method_17784()) + 1.0E-4 >= var2.method_1025(var3) : true;
      } else {
         return false;
      }
   }

   private int Ill(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         int var2 = k74.x.IIll.IIlII(var1.field_1724.method_31548());
         if (var2 >= 0
            && var2 < l(-1001777621, -217321896 ^ -1490078626)
            && var1.field_1724.method_31548().method_5438(var2).method_7909() instanceof class_9362
            && this.lIlI(var1.field_1724.method_31548().method_5438(var2), IlIIllIll.l.I) > 0) {
            return var2;
         } else {
            for (int var3 = 0; var3 < l(-1001777622, -217321896 ^ 1901861228); var3++) {
               class_1799 var4 = var1.field_1724.method_31548().method_5438(var3);
               if (var4 != null && !var4.method_7960() && var4.method_7909() instanceof class_9362 && this.lIlI(var4, IlIIllIll.l.I) > 0) {
                  return var3;
               }
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   private boolean lII(class_746 var1) {
      this.IllII(var1);
      return this.IIlll(var1) && this.IlIlI >= 1L ? class_9362.method_58659(var1) && Math.max(0.0, var1.field_6017) >= Math.max(1.5, this.IlllI.IllI()) : false;
   }

   private boolean lIl(class_310 var1, class_1309 var2, IlIIllIll var3) {
      return this.IlIIIl(var2) && var3 != null && this.IIIll(var1, var3) >= 0 && this.II(var1) >= 0;
   }

   private static void llI() {
      int var0 = 1314243529;
      IIIll[0] = IIlIIl(Illll(l(-1001777619, var0 ^ -253354628), l(-1001777620, var0 ^ 1744180567)).toCharArray(), 76032L, l(-1001777617, var0 ^ 1108777980));
      IIIll[1] = IIlIIl(Illll(l(-1001777618, var0 ^ 1775616426), l(-1001777631, var0 ^ 1984258074)).toCharArray(), 7371L, l(-1001777632, var0 ^ -2110449092));
      IIIll[2] = IIlIIl("".toCharArray(), 69747L, l(-1001777629, var0 ^ -1150831498));
      IIIll[3] = IIlIIl(Illll(l(-1001777630, var0 ^ -435956452), l(-1001777627, var0 ^ -73908296)).toCharArray(), 43099L, l(-1001777628, var0 ^ 1688723067));
      IIIll[4] = IIlIIl(Illll(l(-1001777625, var0 ^ -235974682), l(-1001777626, var0 ^ 8203694)).toCharArray(), 76776L, l(-1001777607, var0 ^ 2060962712));
      IIIll[5] = IIlIIl(Illll(l(-1001777608, var0 ^ 1796323934), l(-1001777605, var0 ^ 1750916689)).toCharArray(), 81051L, l(-1001777606, var0 ^ 95098607));
      IIIll[l(-1001777603, var0 ^ -123494361)] = IIlIIl(
         Illll(l(-1001777604, var0 ^ -1851385202), l(-1001777601, var0 ^ 1105636316)).toCharArray(), 38437L, l(-1001777602, var0 ^ -1810473458)
      );
      IIIll[l(-1001777615, var0 ^ -992223096)] = IIlIIl(
         Illll(l(-1001777616, var0 ^ 1179275592), l(-1001777613, var0 ^ 525641059)).toCharArray(), 58116L, l(-1001777614, var0 ^ 153074803)
      );
      IIIll[l(-1001777611, var0 ^ -1350275898)] = IIlIIl(
         Illll(l(-1001777612, var0 ^ -1590185237), l(-1001777609, var0 ^ 966854858)).toCharArray(), 85700L, l(-1001777610, var0 ^ -1014090906)
      );
      IIIll[l(-1001777655, var0 ^ 1162742441)] = IIlIIl(
         Illll(l(-1001777656, var0 ^ 1179507243), l(-1001777653, var0 ^ 188390283)).toCharArray(), 81398L, l(-1001777654, var0 ^ -1586033628)
      );
      IIIll[l(-1001777651, var0 ^ 261166869)] = IIlIIl(
         Illll(l(-1001777652, var0 ^ -722654061), l(-1001777649, var0 ^ 586968218)).toCharArray(), 40301L, l(-1001777650, var0 ^ -1120311523)
      );
      IIIll[l(-1001777663, var0 ^ 1940734418)] = IIlIIl(
         Illll(l(-1001777664, var0 ^ 1357299806), l(-1001777661, var0 ^ -666781702)).toCharArray(), 52511L, l(-1001777662, var0 ^ 1958744194)
      );
      IIIll[l(-1001777659, var0 ^ -1752345170)] = IIlIIl(
         Illll(l(-1001777660, var0 ^ 1068148510), l(-1001777657, var0 ^ 1342114680)).toCharArray(), 88140L, l(-1001777658, var0 ^ 1966329377)
      );
   }

   private boolean lll(class_310 var1) {
      return this.llllI(var1, this.IIIlI);
   }

   private void IIII(class_310 var1, long var2) {
      if (this.IIllI < 0 || !this.lIIll(var1, false)) {
         this.IIlIll(var2);
      } else if (!k74.x.IIll.lllI(var1, this.lIll)) {
         class_3966 var4 = this.llIII(var1, this.lIll);
         if (var4 == null) {
            if (this.IlIIlI(var2)) {
               this.IIlIll(var2);
            }
         } else {
            this.IIlI(var1);
            if (!this.IlIllI(var1, this.IIllI, true)) {
               this.lll = var2;
            } else {
               this.IIlIl = this::ll;
               boolean var5 = this.IllIII(var1, var4, this.IIllI);
               if (!var5) {
                  this.IIlIl = null;
                  this.IIlIll(var2);
               }
            }
         }
      }
   }

   private void IIIl() {
      this.lI = Long.MIN_VALUE;
      this.IlIlI = 0L;
      this.llI = 0.0;
      this.lII = Double.NaN;
      this.IIlll = false;
   }

   private void IIlI(class_310 var1) {
      if (var1 != null && var1.field_1690 != null && var1.field_1690.field_1886 != null) {
         k74.x.IIll.lIIIIlI(var1.field_1690.field_1886);
         var1.field_1690.field_1886.method_23481(false);
      }
   }

   private static String Illlll(int var0, int var1) {
      int var3 = var0 ^ 1461086762;
      char[] var4 = lIIII[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])lIIIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         lIIIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1316233168;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 211;
            case 1 -> 233;
            case 2 -> 211;
            case 3 -> 190;
            case 4 -> 232;
            case 5 -> 86;
            case 6 -> 224;
            case 7 -> 224;
            case 8 -> 238;
            case 9 -> 228;
            case 10 -> 158;
            case 11 -> 174;
            case 12 -> 165;
            case 13 -> 180;
            case 14 -> 31;
            case 15 -> 187;
            case 16 -> 30;
            case 17 -> 244;
            case 18 -> 153;
            case 19 -> 137;
            case 20 -> 17;
            case 21 -> 75;
            case 22 -> 134;
            case 23 -> 163;
            case 24 -> 146;
            case 25 -> 91;
            case 26 -> 250;
            case 27 -> 118;
            case 28 -> 224;
            case 29 -> 57;
            case 30 -> 72;
            case 31 -> 83;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private long IIll(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();
      return var2 == var4 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private boolean IlII(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         IlIIllIll var2 = this.lIlI != null ? this.lIlI : this.IIIllI(var1.field_1724);
         if (var2 == null) {
            return false;
         } else {
            int var4 = this.Illl ? this.Ill(var1) : this.IIIll(var1, var2);
            if (var4 < 0) {
               this.IIIlI = -1;
               return false;
            } else {
               this.IIIlI = var4;
               class_1799 var5 = var1.field_1724.method_31548().method_5438(this.IIIlI);
               return var5.method_7909() instanceof class_9362 && (!this.Illl || this.lIlI(var5, IlIIllIll.l.I) > 0);
            }
         }
      } else {
         return false;
      }
   }

   private void IlIl(Boolean var1) {
      long var2 = System.currentTimeMillis();
      if (!var1) {
         this.IIlIll(var2);
      } else {
         this.Il = true;
         this.IIlll = true;
         this.llll = var2 + 0L;
         this.IIlIll(var2);
      }
   }

   private double IllI(class_746 var1) {
      return var1 == null ? 0.0 : lIlIIlII.IIl(this.IIIIlI(var1), var1.method_18798().field_1351);
   }

   private boolean Illl(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && this.IIllI >= 0
         && this.IIllI < l(-1001777639, 559194510 ^ -304655804)
         && k74.x.IIll.lIIlI(var1) == this.IIllI
         && k74.x.IIll.IlIlIl(var1, this.IIllI)
         && var1.field_1724.method_31548().method_5438(this.IIllI).method_7909() instanceof class_1743
         && k74.x.IIll.IIIIlll(var1.field_1724.method_31548().method_5438(this.IIllI))
         && this.IIIlIl(var1, this.IIllI);
   }

   private boolean lIII(class_310 var1, boolean var2) {
      boolean var3 = var2
         && var1 != null
         && var1.field_1724 != null
         && this.llIl.IllI()
         && this.IllI >= 0
         && this.IllI < l(-1001777640, 1300506807 ^ -2134095061);
      if (!var3) {
         k74.x.IIll.lllIl(var1, this, lllIII.I);
         this.IIl = null;
         this.IIIIl = false;
         return true;
      } else {
         if (!this.IIIIl) {
            IIllIl(var1, this, lllIII.II);
            this.IIl = null;
            this.IIIIl = true;
         }

         int var4 = k74.x.IIll.IIlII(var1.field_1724.method_31548());
         return !k74.x.IIll.IlIIl(this) && k74.x.IIll.IlIlIl(var1, var4);
      }
   }

   private boolean lIIl(class_310 var1, class_1309 var2) {
      this.lIll = var2;
      if (!this.IIIIlIl()
         || var1 == null
         || var1.field_1724 == null
         || var1.field_1687 == null
         || var1.field_1761 == null
         || var1.field_1755 != null
         || var2 == null
         || var2 == var1.field_1724
         || !var2.method_5805()
         || IIlllIlll.I(var2)
         || lIIIllII.ll(var1)
         || System.currentTimeMillis() < this.llll) {
         this.lIll = null;
         return false;
      } else if (!this.lII(var1.field_1724)) {
         this.lIll = null;
         return false;
      } else if (!k74.x.IIll.IIlI(var2) || this.IIlI.IllI() && this.II(var1) >= 0) {
         boolean var3 = !this.IllIl(var1.field_1724);
         if (!var3) {
            this.lIll = null;
         }

         return var3;
      } else {
         this.lIll = null;
         return false;
      }
   }

   @Override
   public void llIl() {
      this.lIII(class_310.method_1551(), true);
      this.IIIl = false;
      this.llll = 0L;
      this.IIIl();
      this.IIIII();
   }

   private int lIlI(class_1799 var1, String var2) {
      class_9304 var3 = (class_9304)var1.method_58695(class_9334.field_49633, class_9304.field_49385);

      for (class_6880 var5 : var3.method_57534()) {
         String var6 = var5.method_40230().map(IllIIIIl::lIll).orElse(IIIll[2]);
         if (var2.equals(var6)) {
            return var3.method_57536(var5);
         }
      }

      return 0;
   }

   private static String lIll(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   private boolean llII(class_746 var1) {
      class_310 var2 = class_310.method_1551();
      return var1 != null
         && var2 != null
         && var2.field_1724 == var1
         && this.IlIll.IllI()
         && (this.lIll == null || !this.IlIIIl(this.lIll))
         && this.IIllII(var2)
         && this.Ill(var2) >= 0;
   }

   public boolean lllI(class_1309 var1) {
      return this.IlI != IIlIIIl.IIl && this.lIll != null && (var1 == null || var1 == this.lIll);
   }

   private void IIIII() {
      this.IlI = IIlIIIl.IIl;
      this.IlIII = 0L;
      this.lll = 0L;
      this.IIllI = -1;
      this.IIIlI = -1;
      this.IllI = -1;
      this.lIll = null;
      this.IIIII = false;
      this.lIlI = null;
      this.Il = false;
      this.lIIl = 0;
      this.II = l(-1001777637, -1080343814 ^ -1433561400);
      this.IIIIl = false;
      this.Illl = false;
      this.IIl = null;
      this.IIlIl = null;
   }

   private class_3966 IIIIl(class_310 var1, class_1309 var2) {
      if (var1 != null && var1.field_1724 != null && var2 != null) {
         class_3966 var3 = k74.x.IIll.lIlll(var1, 3.0);
         if (this.IlIIII(var1, var3, var2)) {
            return var3;
         } else {
            return var1.field_1765 instanceof class_3966 var4 && var4.method_17782() == var2 && this.IlIIII(var1, var4, var2) ? var4 : this.IIlllI(var1, var2);
         }
      } else {
         return null;
      }
   }

   private void IIIlI(long var1, boolean var3) {
      if (var1 == this.III && this.IlI == IIlIIIl.l) {
         Consumer var4 = this.IIlIl;
         this.IIlIl = null;
         this.IlI = IIlIIIl.II;
         if (var4 != null) {
            var4.accept(var3);
         } else {
            this.IIlIll(System.currentTimeMillis());
         }
      }
   }

   public IllIIIIl() {
      int var1 = -1914620369;
      super(IlIIllIII.Ill(IIIll[l(-1001777638, var1 ^ -132998756)]), lllIIlIl.I, IlIIllIII.Ill(IIIll[5]));
      this.IIlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIIll[l(-1001777635, var1 ^ -537393304)]), true));
      this.IlIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIIll[l(-1001777636, var1 ^ 2071072125)]), true));
      this.Ill = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIIll[l(-1001777633, var1 ^ -1466824949)]), 55.0, 60.0, 0.0, 300.0, 5.0)
            .lI(IlIIllIII.lI(IIIll[l(-1001777634, var1 ^ 134710925)]))
      );
      this.IlllI = this.IllIIll(new IIlIII(IlIIllIII.Ill(IIIll[3]), 1.5, 1.5, 12.0, 0.25).IlII(IlIIllIII.lI(IIIll[l(-1001777647, var1 ^ -378207408)])));
      this.lIII = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIIll[l(-1001777648, var1 ^ 969727024)]), 1.5, 0.0, 12.0, 0.25).IlII(IlIIllIII.lI(IIIll[l(-1001777645, var1 ^ -1210007546)]))
      );
      this.llIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIIll[4]), true));
      this.lI = Long.MIN_VALUE;
      this.lII = Double.NaN;
      this.IlI = IIlIIIl.IIl;
      this.IIllI = -1;
      this.IIIlI = -1;
      this.IllI = -1;
      this.II = l(-1001777646, var1 ^ -68435484);
      this.IllII = Long.MIN_VALUE;
   }

   private int IIIll(class_310 var1, IlIIllIll var2) {
      String[] var3 = IIllllIl.IIIIl();
      if (var1 != null && var1.field_1724 != null) {
         int var4 = k74.x.IIll.IIlII(var1.field_1724.method_31548());
         if (this.lIll != null) {
            double var5 = this.IllI(var1.field_1724);
            double var7 = this.lIll.method_45325(class_5134.field_23724);
            double var9 = this.lIll.method_45325(class_5134.field_23725);
            int var11 = -1;
            double var12 = Double.NEGATIVE_INFINITY;
            int var14 = 0;

            while (var14 < l(-1001777643, 2130255618 ^ -737662955)) {
               class_1799 var15 = var1.field_1724.method_31548().method_5438(var14);
               if (!var15.method_7960() && var15.method_7909() instanceof class_9362) {
                  double var16 = lIlIIlII.lI(var5, this.lIlI(var15, IlIIllIll.l.I), this.lIlI(var15, IlIIllIll.III.I), var7, var9);
                  if (var16 > var12 || Double.compare(var16, var12) == 0 && var14 == var4) {
                     var12 = var16;
                     var11 = var14;
                  }
               }

               var14++;
               if (var3 != null) {
                  break;
               }
            }

            if (var11 >= 0) {
               return var11;
            }
         }

         int var18 = -1;
         int var6 = l(-1001777644, 2130255618 ^ 411275965);
         int var19 = -1;
         int var8 = 0;

         while (var8 < l(-1001777641, 2130255618 ^ -117101120)) {
            class_1799 var20 = var1.field_1724.method_31548().method_5438(var8);
            if (!var20.method_7960() && var20.method_7909() instanceof class_9362) {
               if (var19 < 0 || var8 == var4) {
                  var19 = var8;
               }

               int var10 = this.lIlll(var20, var2, var8 == var4);
               if (var10 > var6) {
                  var6 = var10;
                  var18 = var8;
               }
            }

            var8++;
            if (var3 != null) {
               break;
            }
         }

         return var18 >= 0 ? var18 : var19;
      } else {
         return -1;
      }
   }

   private boolean IIlII(class_310 var1) {
      if (!this.IlII(var1)) {
         return false;
      } else {
         return this.Illl ? this.lll(var1) : this.llllI(var1, this.IIIlI) && this.I(var1);
      }
   }

   private static double IIllI(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   private boolean IIlll(class_746 var1) {
      return this.lIlII(var1) && (var1.method_18798().field_1351 < -0.01 || var1.field_6017 > 0.0);
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null) {
         this.IllII(var1.field_1724);
         if (this.IlI != IIlIIIl.IIl) {
            this.IIIlII(var1);
         }
      }
   }

   private void IllII(class_746 var1) {
      String[] var2 = IIllllIl.IIIIl();
      class_310 var6 = class_310.method_1551();
      if (var1 != null && var6 != null && var6.field_1687 != null) {
         if (Double.isNaN(this.lII)) {
            this.lII = var1.method_23318();
         }

         long var4;
         if ((var4 = var6.field_1687.method_75260()) != this.lI) {
            this.lI = var4;
            boolean var7 = this.lIlII(var1);
            boolean var3 = var7 && this.IIlll(var1);
            if (!var7) {
               this.IlIlI = 0L;
               this.llI = 0.0;
               this.lII = var1.method_23318();
               this.IIlll = false;
            } else {
               this.lII = Math.max(this.lII, var1.method_23318());
               if (var3) {
                  if (this.IlIlI == 0L && this.IIlll) {
                     this.IIlll = false;
                     this.llI = 0.0;
                     this.lII = var1.method_23318();
                  }

                  this.IlIlI++;
                  this.llI = Math.max(this.llI, this.lllll(var1));
               } else {
                  this.IlIlI = 0L;
                  if (var1.method_18798().field_1351 > 0.0) {
                     this.IIlll = false;
                     this.llI = 0.0;
                     this.lII = Math.max(Double.isNaN(this.lII) ? var1.method_23318() : this.lII, var1.method_23318());
                     if (var2 == null) {
                        return;
                     }
                  }

                  this.llI = Math.max(this.llI, this.lllll(var1));
               }
            }
         } else if (!this.lIlII(var1)) {
            this.IlIlI = 0L;
            this.llI = 0.0;
            this.lII = var1.method_23318();
            this.IIlll = false;
         } else {
            this.lII = Math.max(this.lII, var1.method_23318());
            this.llI = Math.max(this.llI, this.lllll(var1));
            if (!this.IIlll(var1)) {
               this.IlIlI = 0L;
            }
         }
      } else {
         this.IIIl();
      }
   }

   private boolean IllIl(class_746 var1) {
      if (k74.x.IIll.IIlI(var1)) {
         return true;
      } else if (!var1.method_6115()) {
         return false;
      } else if (var1.method_6058() == class_1268.field_5810) {
         return true;
      } else {
         class_1799 var2 = var1.method_6030();
         return var2 != null && k74.x.IIll.lIIIIl(var2);
      }
   }

   private boolean IlllI(class_310 var1, class_3966 var2, int var3) {
      if (this.lIIlI()) {
         return false;
      } else if (var1 == null || var1.field_1724 == null || var2 == null || var3 < 0 || var3 >= l(-1001777642, -211473557 ^ 272945018)) {
         return false;
      } else if (!k74.x.IIll.lllI(var1, this.lIll) && !k74.x.IIll.lllI(var1, var2.method_17782())) {
         boolean var4 = var3 == this.IIllI && this.IIIII;
         boolean var5 = this.IIIII && (var3 == this.IIllI || var3 == this.IIIlI);
         boolean var6 = var5 ? this.IlIllI(var1, var3, var4) : this.llllI(var1, var3) && k74.x.IIll.IlIlIl(var1, var3);
         class_1799 var7 = var6 ? var1.field_1724.method_31548().method_5438(var3) : class_1799.field_8037;
         boolean var8 = !var7.method_7960()
            && (var4 ? var7.method_7909() instanceof class_1743 && k74.x.IIll.IIIIlll(var7) : var7.method_7909() instanceof class_9362);
         class_3966 var9 = var8 && this.IlIIII(var1, var2, this.lIll) ? var2 : (var8 ? this.lIIIl(var1, this.lIll) : null);
         if (var9 == null) {
            return false;
         } else {
            long var10 = ++this.III;
            this.IlI = IIlIIIl.l;
            this.IlIII = System.currentTimeMillis();
            this.lll = 0L;
            this.IIlII = true;
            boolean var12 = false;
            boolean var13 = k74.x.IIll.IlI();
            k74.x.IIll.IlIlI(true);

            try {
               k74.x.IIll.IIlIlIl(var1);
               boolean var10000 = k74.x.IIll.IlIIIll(var1, var9);
               this.lIlIl(var10000);
               var12 = var10000;
            } finally {
               k74.x.IIll.IlIlI(false);
               if (var13) {
                  k74.x.IIll.lIl();
               }
            }

            this.IIIlI(var10, var12);
            return true;
         }
      } else {
         return false;
      }
   }

   private static String Illll(int var0, int var1) {
      int var9 = 1753148511;
      int var2 = (var0 ^ l(-1001777559, var9 ^ 411608016)) & l(-1001777560, var9 ^ -432895935);
      if (IlII[var2] == null) {
         char[] var3 = llII[var2].toCharArray();

         int var4 = switch (var3[0] & l(-1001777557, var9 ^ 1861077110)) {
            case 0 -> l(-1001777558, var9 ^ 891459727);
            case 1 -> l(-1001777555, var9 ^ -88737923);
            case 2 -> l(-1001777556, var9 ^ 2021525421);
            case 3 -> l(-1001777553, var9 ^ -1993746689);
            case 4 -> l(-1001777554, var9 ^ 1762808066);
            case 5 -> l(-1001777567, var9 ^ 1274672387);
            case 6 -> l(-1001777568, var9 ^ -977238678);
            case 7 -> l(-1001777565, var9 ^ -714321044);
            case 8 -> l(-1001777566, var9 ^ -895550592);
            case 9 -> l(-1001777563, var9 ^ 895006279);
            case 10 -> l(-1001777564, var9 ^ 272929902);
            case 11 -> l(-1001777561, var9 ^ -1001665857);
            case 12 -> l(-1001777562, var9 ^ 1102788059);
            case 13 -> l(-1001777543, var9 ^ 498051540);
            case 14 -> l(-1001777544, var9 ^ 580611044);
            case 15 -> l(-1001777541, var9 ^ 2054660601);
            case 16 -> l(-1001777542, var9 ^ -62708790);
            case 17 -> l(-1001777539, var9 ^ -176035730);
            case 18 -> 2;
            case 19 -> l(-1001777540, var9 ^ 306780976);
            case 20 -> l(-1001777537, var9 ^ 20404777);
            case 21 -> l(-1001777538, var9 ^ -699613178);
            case 22 -> l(-1001777551, var9 ^ 692361385);
            case 23 -> l(-1001777552, var9 ^ -494039022);
            case 24 -> l(-1001777549, var9 ^ 1196842645);
            case 25 -> l(-1001777550, var9 ^ -1097460602);
            case 26 -> l(-1001777547, var9 ^ 1567620628);
            case 27 -> l(-1001777548, var9 ^ -834416561);
            case 28 -> l(-1001777545, var9 ^ -2040588941);
            case 29 -> l(-1001777546, var9 ^ 640674091);
            case 30 -> l(-1001777591, var9 ^ 1545086524);
            case 31 -> l(-1001777592, var9 ^ -1993869892);
            case 32 -> l(-1001777589, var9 ^ 1950699929);
            case 33 -> l(-1001777590, var9 ^ 1976092562);
            case 34 -> l(-1001777587, var9 ^ 1563996963);
            case 35 -> l(-1001777588, var9 ^ -473669674);
            case 36 -> l(-1001777585, var9 ^ 2083145140);
            case 37 -> l(-1001777586, var9 ^ 215982128);
            case 38 -> l(-1001777599, var9 ^ 296633897);
            case 39 -> l(-1001777600, var9 ^ -42954247);
            case 40 -> l(-1001777597, var9 ^ -1548460123);
            case 41 -> l(-1001777598, var9 ^ -1520156355);
            case 42 -> l(-1001777595, var9 ^ 723619626);
            case 43 -> l(-1001777596, var9 ^ -1282595277);
            case 44 -> l(-1001777593, var9 ^ -1454312200);
            case 45 -> l(-1001777594, var9 ^ -46430711);
            case 46 -> l(-1001777575, var9 ^ 1361251592);
            case 47 -> l(-1001777576, var9 ^ 1581706031);
            case 48 -> l(-1001777573, var9 ^ -670295430);
            case 49 -> l(-1001777574, var9 ^ -251977285);
            case 50 -> l(-1001777571, var9 ^ 2042041378);
            case 51 -> l(-1001777572, var9 ^ -515597468);
            case 52 -> l(-1001777569, var9 ^ -1388675794);
            case 53 -> l(-1001777570, var9 ^ 1385599692);
            case 54 -> l(-1001777583, var9 ^ 150412498);
            case 55 -> l(-1001777584, var9 ^ 18805973);
            case 56 -> l(-1001777581, var9 ^ -957602548);
            case 57 -> l(-1001777582, var9 ^ 182119904);
            case 58 -> l(-1001777579, var9 ^ -18505058);
            case 59 -> l(-1001777580, var9 ^ -238485827);
            case 60 -> l(-1001777577, var9 ^ 494214095);
            case 61 -> l(-1001777578, var9 ^ -1214895933);
            case 62 -> l(-1001777495, var9 ^ -1296187731);
            case 63 -> l(-1001777496, var9 ^ -1153088840);
            case 64 -> l(-1001777493, var9 ^ 1349806603);
            case 65 -> l(-1001777494, var9 ^ -1188856868);
            case 66 -> l(-1001777491, var9 ^ -364341330);
            case 67 -> l(-1001777492, var9 ^ -683742981);
            case 68 -> l(-1001777489, var9 ^ 966064935);
            case 69 -> l(-1001777490, var9 ^ -557073521);
            case 70 -> l(-1001777503, var9 ^ 1255735154);
            case 71 -> l(-1001777504, var9 ^ -1813315713);
            case 72 -> l(-1001777501, var9 ^ 1840120371);
            case 73 -> l(-1001777502, var9 ^ -276212200);
            case 74 -> l(-1001777499, var9 ^ -207557987);
            case 75 -> l(-1001777500, var9 ^ -1620737216);
            case 76 -> l(-1001777497, var9 ^ -2091536347);
            case 77 -> l(-1001777498, var9 ^ 483622948);
            case 78 -> l(-1001777479, var9 ^ 1888284806);
            case 79 -> l(-1001777480, var9 ^ 1610446003);
            case 80 -> l(-1001777477, var9 ^ -1208186682);
            case 81 -> l(-1001777478, var9 ^ 1848655252);
            case 82 -> l(-1001777475, var9 ^ -1251136294);
            case 83 -> l(-1001777476, var9 ^ 67922790);
            case 84 -> l(-1001777473, var9 ^ -58270716);
            case 85 -> l(-1001777474, var9 ^ -1124513642);
            case 86 -> l(-1001777487, var9 ^ 913221704);
            case 87 -> l(-1001777488, var9 ^ -975230294);
            case 88 -> l(-1001777485, var9 ^ -1937300179);
            case 89 -> l(-1001777486, var9 ^ -2006988881);
            case 90 -> l(-1001777483, var9 ^ 426470771);
            case 91 -> l(-1001777484, var9 ^ -1398047159);
            case 92 -> 0;
            case 93 -> l(-1001777481, var9 ^ -92933425);
            case 94 -> l(-1001777482, var9 ^ -532312914);
            case 95 -> l(-1001777527, var9 ^ 2084645386);
            case 96 -> l(-1001777528, var9 ^ 963433668);
            case 97 -> l(-1001777525, var9 ^ -686638747);
            case 98 -> l(-1001777526, var9 ^ -236052263);
            case 99 -> l(-1001777523, var9 ^ -1380268239);
            case 100 -> l(-1001777524, var9 ^ -1477666321);
            case 101 -> l(-1001777521, var9 ^ -1966138762);
            case 102 -> l(-1001777522, var9 ^ -1936004484);
            case 103 -> l(-1001777535, var9 ^ 68305908);
            case 104 -> l(-1001777536, var9 ^ 73666644);
            case 105 -> l(-1001777533, var9 ^ -1051107502);
            case 106 -> l(-1001777534, var9 ^ -1893738772);
            case 107 -> l(-1001777531, var9 ^ 2120993773);
            case 108 -> l(-1001777532, var9 ^ -2133391006);
            case 109 -> l(-1001777529, var9 ^ 1296892418);
            case 110 -> l(-1001777530, var9 ^ 103368125);
            case 111 -> l(-1001777511, var9 ^ -584441834);
            case 112 -> l(-1001777512, var9 ^ 1916771581);
            case 113 -> l(-1001777509, var9 ^ 1028435071);
            case 114 -> l(-1001777510, var9 ^ -1031808359);
            case 115 -> l(-1001777507, var9 ^ -969403018);
            case 116 -> l(-1001777508, var9 ^ -614488146);
            case 117 -> l(-1001777505, var9 ^ -678145927);
            case 118 -> l(-1001777506, var9 ^ -769264073);
            case 119 -> l(-1001777519, var9 ^ -360606229);
            case 120 -> l(-1001777520, var9 ^ 1131618510);
            case 121 -> l(-1001777517, var9 ^ 1545776700);
            case 122 -> l(-1001777518, var9 ^ 1310133357);
            case 123 -> l(-1001777515, var9 ^ -1387512821);
            case 124 -> l(-1001777516, var9 ^ 502626230);
            case 125 -> l(-1001777513, var9 ^ -1720544412);
            case 126 -> l(-1001777514, var9 ^ -413243677);
            case 127 -> l(-1001777431, var9 ^ 519026336);
            case 128 -> l(-1001777432, var9 ^ -1970862479);
            case 129 -> l(-1001777429, var9 ^ 11505331);
            case 130 -> l(-1001777430, var9 ^ 1435503808);
            case 131 -> l(-1001777427, var9 ^ 1153744323);
            case 132 -> l(-1001777428, var9 ^ -1165013446);
            case 133 -> l(-1001777425, var9 ^ -1009176360);
            case 134 -> l(-1001777426, var9 ^ 407511429);
            case 135 -> l(-1001777439, var9 ^ 1636269224);
            case 136 -> l(-1001777440, var9 ^ -735151077);
            case 137 -> l(-1001777437, var9 ^ 436987815);
            case 138 -> 3;
            case 139 -> 5;
            case 140 -> l(-1001777438, var9 ^ -415026292);
            case 141 -> l(-1001777435, var9 ^ -1023803727);
            case 142 -> l(-1001777436, var9 ^ 174310743);
            case 143 -> l(-1001777433, var9 ^ 1333559366);
            case 144 -> 4;
            case 145 -> l(-1001777434, var9 ^ 1648108364);
            case 146 -> l(-1001777415, var9 ^ -1552430283);
            case 147 -> l(-1001777416, var9 ^ 1657272802);
            case 148 -> l(-1001777413, var9 ^ 96834932);
            case 149 -> l(-1001777414, var9 ^ -1502489772);
            case 150 -> l(-1001777411, var9 ^ 1539822733);
            case 151 -> l(-1001777412, var9 ^ -1932388690);
            case 152 -> l(-1001777409, var9 ^ 670593321);
            case 153 -> l(-1001777410, var9 ^ 983053058);
            case 154 -> l(-1001777423, var9 ^ 194539997);
            case 155 -> l(-1001777424, var9 ^ 1457001785);
            case 156 -> l(-1001777421, var9 ^ -464607289);
            case 157 -> l(-1001777422, var9 ^ -317626926);
            case 158 -> l(-1001777419, var9 ^ -689883420);
            case 159 -> l(-1001777420, var9 ^ -144194632);
            case 160 -> l(-1001777417, var9 ^ 1865546099);
            case 161 -> l(-1001777418, var9 ^ -813941579);
            case 162 -> l(-1001777463, var9 ^ -1715589709);
            case 163 -> l(-1001777464, var9 ^ 1441836616);
            case 164 -> l(-1001777461, var9 ^ -2068208199);
            case 165 -> l(-1001777462, var9 ^ 149240783);
            case 166 -> l(-1001777459, var9 ^ -1148112358);
            case 167 -> l(-1001777460, var9 ^ -352770249);
            case 168 -> l(-1001777457, var9 ^ 104506459);
            case 169 -> l(-1001777458, var9 ^ 1250017050);
            case 170 -> l(-1001777471, var9 ^ 975976453);
            case 171 -> l(-1001777472, var9 ^ 317644889);
            case 172 -> l(-1001777469, var9 ^ -1211900189);
            case 173 -> l(-1001777470, var9 ^ 1093305024);
            case 174 -> l(-1001777467, var9 ^ -1644411665);
            case 175 -> l(-1001777468, var9 ^ 235128421);
            case 176 -> l(-1001777465, var9 ^ -371669818);
            case 177 -> l(-1001777466, var9 ^ 1634291942);
            case 178 -> l(-1001777447, var9 ^ -1617615513);
            case 179 -> l(-1001777448, var9 ^ -992973276);
            case 180 -> l(-1001777445, var9 ^ 767346723);
            case 181 -> l(-1001777446, var9 ^ 28751342);
            case 182 -> l(-1001777443, var9 ^ -120129763);
            case 183 -> l(-1001777444, var9 ^ -2000219293);
            case 184 -> l(-1001777441, var9 ^ -8476955);
            case 185 -> l(-1001777442, var9 ^ -999575637);
            case 186 -> l(-1001777455, var9 ^ -1133865672);
            case 187 -> l(-1001777456, var9 ^ 67029251);
            case 188 -> l(-1001777453, var9 ^ 1860957863);
            case 189 -> l(-1001777454, var9 ^ 297177280);
            case 190 -> l(-1001777451, var9 ^ -464576464);
            case 191 -> l(-1001777452, var9 ^ 909018134);
            case 192 -> l(-1001777449, var9 ^ -1380837391);
            case 193 -> l(-1001777450, var9 ^ -1488398003);
            case 194 -> l(-1001777367, var9 ^ 400534704);
            case 195 -> l(-1001777368, var9 ^ 301166576);
            case 196 -> l(-1001777365, var9 ^ -2125808133);
            case 197 -> l(-1001777366, var9 ^ 74478072);
            case 198 -> l(-1001777363, var9 ^ -393565166);
            case 199 -> l(-1001777364, var9 ^ 238021674);
            case 200 -> l(-1001777361, var9 ^ -495610483);
            case 201 -> l(-1001777362, var9 ^ -454067565);
            case 202 -> l(-1001777375, var9 ^ -470072818);
            case 203 -> l(-1001777376, var9 ^ 564645064);
            case 204 -> l(-1001777373, var9 ^ -253987483);
            case 205 -> l(-1001777374, var9 ^ -1688170011);
            case 206 -> l(-1001777371, var9 ^ 1127078976);
            case 207 -> l(-1001777372, var9 ^ 10305708);
            case 208 -> l(-1001777369, var9 ^ 2075443471);
            case 209 -> l(-1001777370, var9 ^ 1125583302);
            case 210 -> l(-1001777351, var9 ^ -988212491);
            case 211 -> l(-1001777352, var9 ^ 926826697);
            case 212 -> l(-1001777349, var9 ^ -1106845033);
            case 213 -> l(-1001777350, var9 ^ 2060529243);
            case 214 -> l(-1001777347, var9 ^ -19341084);
            case 215 -> l(-1001777348, var9 ^ -1922024960);
            case 216 -> l(-1001777345, var9 ^ -518739000);
            case 217 -> l(-1001777346, var9 ^ 1186757000);
            case 218 -> 1;
            case 219 -> l(-1001777359, var9 ^ -1305144656);
            case 220 -> l(-1001777360, var9 ^ -310318998);
            case 221 -> l(-1001777357, var9 ^ 303578796);
            case 222 -> l(-1001777358, var9 ^ -1560091286);
            case 223 -> l(-1001777355, var9 ^ 395988235);
            case 224 -> l(-1001777356, var9 ^ -1112787734);
            case 225 -> l(-1001777353, var9 ^ 980426728);
            case 226 -> l(-1001777354, var9 ^ -969778402);
            case 227 -> l(-1001777399, var9 ^ -978854812);
            case 228 -> l(-1001777400, var9 ^ 751096151);
            case 229 -> l(-1001777397, var9 ^ 1523578371);
            case 230 -> l(-1001777398, var9 ^ 500459999);
            case 231 -> l(-1001777395, var9 ^ 908681145);
            case 232 -> l(-1001777396, var9 ^ 882357216);
            case 233 -> l(-1001777393, var9 ^ 1541423212);
            case 234 -> l(-1001777394, var9 ^ -1938882802);
            case 235 -> l(-1001777407, var9 ^ -272333092);
            case 236 -> l(-1001777408, var9 ^ 162659271);
            case 237 -> l(-1001777405, var9 ^ -2101962039);
            case 238 -> l(-1001777406, var9 ^ 1245393956);
            case 239 -> l(-1001777403, var9 ^ 1119844598);
            case 240 -> l(-1001777404, var9 ^ -1074147938);
            case 241 -> l(-1001777401, var9 ^ 1289636567);
            case 242 -> l(-1001777402, var9 ^ 1773468119);
            case 243 -> l(-1001777383, var9 ^ -1113719566);
            case 244 -> l(-1001777384, var9 ^ -49086076);
            case 245 -> l(-1001777381, var9 ^ -886373368);
            case 246 -> l(-1001777382, var9 ^ -1004023605);
            case 247 -> l(-1001777379, var9 ^ -1181065521);
            case 248 -> l(-1001777380, var9 ^ -340985195);
            case 249 -> l(-1001777377, var9 ^ -984075032);
            case 250 -> l(-1001777378, var9 ^ -2111926567);
            case 251 -> l(-1001777391, var9 ^ -655791594);
            case 252 -> l(-1001777392, var9 ^ 1731661554);
            case 253 -> l(-1001777389, var9 ^ 556651619);
            case 254 -> l(-1001777390, var9 ^ -864758335);
            default -> l(-1001777387, var9 ^ -1969156156);
         };
         int var5 = (var1 & l(-1001777388, var9 ^ -227256329)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & l(-1001777385, var9 ^ -1819165314)) >>> l(-1001777386, var9 ^ 1286661158)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & l(-1001777303, var9 ^ -1770660609);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & l(-1001777304, var9 ^ -486658089);
            }
         }

         IlII[var2] = new String(var3).intern();
      }

      return IlII[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1440991212;
      short var18 = 1237;
      int var17 = 0;
      int var14 = "µ\udacf鏛髻ꈐ瓓㹌㷲䤲떁诱ߒ盖\ue3a1갯⑦훗禝뇲釻㎜춬鷥\ue7c9경䦆ᨛ㙌漣䒩\ue680捂ⶮ衕\u1c8f頸油춭ِ㞯䎢協蠝\ue740븀鸘ᶆ廙쪏絺ᄼ\ue1c0\u0097쟛便乥㝱\ue529뼹꺦쭚溌㐀᱑苠\uf779챓殰镛᷌Ǻ죌˖\ufdd7ꢩꓔ긜㎵帪鑟銞汙ㆄ⨂뾧꽭ಯⓚ꺌赉눍㳤\udef3┉롅\ue155壃㶉﹋猽\u1aed꤈ꏮ뼔쟢簕顸膇等ﴗ膶嚚鸩큚䂄\uf215䳢䁗部\u2cf7㨱ʘ㑾ỷ⮤š\uf300䨣嫎\ue329䨼\uf001㤘⋻ᯂꐼ殐찊㘜\ue318왁熼옠យﴬ\ue86b᱆\ud9ce냴弽鸒\uf1ff⚞ⱴﯼ욽멖箚뒯隽ᴧ語덹\ue359ఴ⼴跆윣\ue1df\ue9cb媢\ued90\ude29卧巨蔉牊\ue05d좜Ⱁ媚౼!逃췊\ue04b鸐嚶萧ﭵힽ骷ᗋ돺쒆裪葕뛉心뙍ﻇ㑶鮰蓐䅠翗疤ᱠ룦譊㗎鲭岰㯁䭏ⷍ"
         .length();
      int var16 = 0;
      String[] var15 = new String[2];
      String var13 = "µ\udacf鏛髻ꈐ瓓㹌㷲䤲떁诱ߒ盖\ue3a1갯⑦훗禝뇲釻㎜춬鷥\ue7c9경䦆ᨛ㙌漣䒩\ue680捂ⶮ衕\u1c8f頸油춭ِ㞯䎢協蠝\ue740븀鸘ᶆ廙쪏絺ᄼ\ue1c0\u0097쟛便乥㝱\ue529뼹꺦쭚溌㐀᱑苠\uf779챓殰镛᷌Ǻ죌˖\ufdd7ꢩꓔ긜㎵帪鑟銞汙ㆄ⨂뾧꽭ಯⓚ꺌赉눍㳤\udef3┉롅\ue155壃㶉﹋猽\u1aed꤈ꏮ뼔쟢簕顸膇等ﴗ膶嚚鸩큚䂄\uf215䳢䁗部\u2cf7㨱ʘ㑾ỷ⮤š\uf300䨣嫎\ue329䨼\uf001㤘⋻ᯂꐼ殐찊㘜\ue318왁熼옠យﴬ\ue86b᱆\ud9ce냴弽鸒\uf1ff⚞ⱴﯼ욽멖箚뒯隽ᴧ語덹\ue359ఴ⼴跆윣\ue1df\ue9cb媢\ued90\ude29卧巨蔉牊\ue05d좜Ⱁ媚౼!逃췊\ue04b鸐嚶萧ﭵힽ骷ᗋ돺쒆裪葕뛉心뙍ﻇ㑶鮰蓐䅠翗疤ᱠ룦譊㗎鲭岰㯁䭏ⷍ";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lIIII = var15;
      lIIIl = new Object[var15.length];
      int var9 = -1304672476;
      byte[] var7 = "\u0081VãÎL^\u008bÒ\"RSéô!~ÚÈÅ\f\u0085_×ÚÅ~v[·QöÐ\fNg\u008b¹Ð»&[\u0086ÖBüÞ Ä·Ã¹üt\u0088½ôÎÉÌ^\u00128_\u0017\u008eÒÁ\u0087\u007fS2«°P\u007f\u00833c\u0085Ã\nÀ\u0080ê,©\u0085\u000bcyÇSÙV\u008eÄTüøª¶~i@×'vwy]£X&\u0097§&ÿ\u0099\u0014£\n\u0001\u0082N\u009a\u0007¾õO}m@\u00ad~nË¤3\u0018\u0000}käá\u00967²]*ìÎ=\u0011\u001aÞï\bUs\u008c\u009aK\u008e\n8hÅÑ\u008eàbØ\u0090puàÈ¯®\u001eC\u0007\u0089¶ÀwÝêçJî.\u0013ºõz\u0017»>ê@ã`]Ô\u0003\u0085&o$o¸\u009f\u0080å²±S\u0005¹\u0019ó\u00909G\u0012â¼ªÂ[b.Lw\u007fþ\u0080|~$Ü\u0087¾Æ\u0090\f\u0004Vñ\u008a»\u0011\u0095WmÃ\u0006\u0080\u009d\u0080ø;í\u0088på¤¼+*ö\u008aä½\u0099 fvk\u0007\u0097!¸²w\u001a?2Uñ\u0099\u0088ÛÈë7Ëd?ÞÔ\u0096\u0097/+PØ>\u000eLú;ÚC¤Õ_³[î\u0003§Çè<\u0093\u0007\\d\u007fÍJâKO\u001bë\u0089\u0086P\fAwÒ\u001f?>'ÈD¬Á7Lö!ü\u0085þ4Y^0\u0081 \u009eqwCg\u0090\u0001ÐK¼ñ\u0098Wy\u00908'\u00875B\u0010JÇ\u0097/\u0099(jM=?kÀ©×C0ßüýÌ3Xb\")8\u0012×Ä\t\u000f¦*£ãxýE½¼1ý»l/05)êô\u00ad\u0085H\u0012·X\u009açã3èiO+aµ@N\u0087¤Æ\u0004tqîóOâg¿qþÿLõs³2\u0011ßL\u009eþ`\u0016ÿr¬\u001f\u0016\u0091\rØäIå\u0014Ò\u0088?àíÎWïÀ\u0092q\u0003}u\u0099©\u009eFÂ¬µÛ\u008a¥M.ÏN|\u000eÐ§+\u0017\u008eô@ùCÉ6\u0086\u0011'\u009c\u0095êÀÃßTTÐ\u0091Ë\u008dâ\u0093gs¦l´ñ\u00818´í¨\u0084Y\u0081mç\u009c\u009d]Þ\u0095\u0002ÛîËn\u0084\u009cåAõ\u001aC©ôæop8Sc«e@\u0096\u001a\u0004\u0005Þâ\u008e¸Á¢ñ$\u0094(fÍ|Û×DP\u0092\u008fK\u0092\u0096W©p\u0007c\u0001Y²£\u0010÷ä}\u009e·þMàîbINé'd¸\u0091É\u001a×óïæL\u0086³²«)¹äõ\u0088\u0094ÇtÔ\u0092\u0092\u0086y\u001a\u001a&ó\u001al~üßQ1\u0095\u0091\u0017¸h`c§\u009c\u009eßgõSEn4\u0018!)\u0092Ã\"N\u009fl7ø\u0018#DÀ\nÜw´mØ0yFÅWË¯É\u009c4\u0098Ì-\u009a\u001aô\u0089ù\u009a]{NyB*À\u008cP\u001fh\u008c³DPF\u0003ý\u0019\f\u0087zýªùV\bk\u0000çÚ\u0097\u0094\u008fc\u0015\u001e§âÏK\u0098hQZÌÓ%¤\u0087*¢ÝÑ\\Ö\u0006BO\u0090\u007f\u008f\u0010ýÊ&\u0010\u0004\u0004\u0003\u0089}ùK]\bÜñ\u0092\u0098\u0014k«ìQtìe|4Mþ½\u007f¥Ä|Ï\u0097\u0003\u001bÍù4¸y¿$EÏ¸\u0093\u0092Úr-9ð\u001d\u0001$\u0090V~\u0015\u0090\u001f8HÐ{¥úFËæó\u0019\tÐÈéX\u0016éo\u00ad\u000eq9\u0095_ÑtR}\u0087¶AÇKøÀ\u0095\u009a±Àý\u0016íWâ¥\u0099\\\u0082ôñK\u0014\u00182ÊÉT\u0089Ó~$$\\¶\fæ\u008cq©Ë»§_\"ì8\u0083ô(Ù\u0010\u000b¨°÷Ðªû\u007fa<î\u0081\u009dKâÚØ\u0000ù3´¦£\u001f¾ÛxæÞ\u009b>\u0096Ï}\u0096ávÊ\u0084ÚcÃ\u009c¢bûÞ\u001dö¥Epã\u0098K\u000f¾õ\u0092úGL (&èm³ºr\u0082¹@µ\\\t×Ál\u000fû\u0002>\u009fBÐ\u0000\u001ax\u001e\u0088ö\u0082Á¬\u0010'\u0083-ü}ø\u0012úç\u0017kýó/Ò?¯£¯îÔ\u001aF\u0085hþç]%³I\u001e\u0095/ìe¼¬é]\u001ffÿÛ\u0011}ô)6$k \u000e\u008d\u0099dÙK\u001dàÐ\u0085 \u0093xU\u0007ÿ\u001cÆ\u0015X´\u0014Z¬=}Àó\u0088\u0085û\f\u0010Sh½\n\u008a;\t\u0092(W£¤Y\u0017$xp\u0091Ø:6\u009fÛ¯¸é2Ì¾mDÇ\u0092\u0091\u0003Ü\f£(!;\u0014*\u009fÜÉEè/I\u0092f\u0090\u0002ñÌëk\u0017¹\u0094\u0095\u009c¾õüT3YÃ\\·\u0015z¡ñ¢©RÖ%ñw¼\u0094A£\u0095\u0093ßã\u001bl\rÕ#iÊÚ/¿\u0080§\u0092;¹õ¤\u0095µÛPY_\u009c\u0016áÝÆá\u0007¸y?cW?%»fÒ|¸\u0007\u0094©`Øì|:B\u008d\u0098ÙÈR¸\u0080ª\u0088}±7üöB\u001eç8\u0004Àì\u001fÆ\u0090\u0000²\u008c\u001a\u0017[\u007f¾\u008b\u00938S<Òõ?Û2\u007f\u0090,%×¦C\tã_F¹uÑÁ{\u0089W\t\u0014\u0098\u0017YEÃfÝ\u0003\u00adA@PÅÎ\u0096ºl\u000esõ\b×¯'%ÖÞ\f\u0091h³\u0007ë\u0004-<\u008c5\u0010¿ù\u009f\b8\u0085Ü"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      Illll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         Illll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[l(-1001777300, var23 ^ 885928223)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = Illlll(1461086762, var23 ^ 1886698543)).length();
      int var1 = l(-1001777297, var23 ^ -1475971343);
      int var25 = -1;

      label88:
      while (true) {
         int var10000 = l(-1001777298, var23 ^ 524792265);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label83: {
               char[] var42 = var10001.toCharArray();
               int var10004 = var42.length;
               int var6 = 0;
               int var45 = var10000;
               var38 = var42;
               int var32 = var10004;
               char[] var54;
               int var10006;
               if (var10004 <= 1) {
                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var45 = var10000;
                  var32 = var10004;
                  if (var10004 <= var6) {
                     break label83;
                  }

                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % l(-1001777310, var23 ^ 1697397401)) {
                     case 0 -> l(-1001777307, var23 ^ -487668217);
                     case 1 -> l(-1001777308, var23 ^ 713153688);
                     case 2 -> l(-1001777305, var23 ^ 2060486559);
                     case 3 -> l(-1001777306, var23 ^ -23664227);
                     case 4 -> l(-1001777287, var23 ^ 1673888027);
                     case 5 -> l(-1001777288, var23 ^ -1255200557);
                     default -> l(-1001777285, var23 ^ 1348488195);
                  });
                  var6++;
                  if (var45 == 0) {
                     var10006 = var45;
                     var54 = var38;
                     var10004 = var45;
                  } else {
                     if (var32 <= var6) {
                        break;
                     }

                     var54 = var38;
                     var10004 = var45;
                     var10006 = var6;
                  }
               }
            }

            String var47 = new String(var38).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var47;
                  if ((var25 += var1) >= var4) {
                     llII = var5;
                     IlII = new String[l(-1001777309, var23 ^ 1620880881)];
                     IIIll = new String[l(-1001777286, var23 ^ -1934464160)];
                     llI();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var47;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label88;
                  }

                  var4 = (var2 = Illlll(1461086763, var23 ^ 268168287)).length();
                  var1 = l(-1001777311, var23 ^ -123260632);
                  var25 = -1;
            }

            var10000 = l(-1001777312, var23 ^ 263230269);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private boolean lIIII(class_310 var1, long var2) {
      if (this.Il || var1 == null || var1.field_1724 == null || var1.field_1761 == null || this.lIll == null) {
         return false;
      } else if (!this.lIlII(var1.field_1724)) {
         return false;
      } else if (!this.IIlII(var1)) {
         return false;
      } else {
         class_3966 var4 = this.IIIII ? this.IIIIIl(var1, this.lIll) : this.llIII(var1, this.lIll);
         if (var4 == null) {
            var4 = this.IIlllI(var1, this.lIll);
         }

         if (var4 == null) {
            return false;
         } else {
            this.IIlIl = this::lllII;
            boolean var5 = this.IIIII ? this.IllIII(var1, var4, this.IIIlI) : this.lI(var1, var4);
            if (!var5) {
               this.IIlIl = null;
               return false;
            } else {
               return true;
            }
         }
      }
   }

   @Override
   public void llIIII(class_310 var1) {
      if (this.IIIIlIl() && var1 != null && var1.field_1724 != null && var1.field_1690 != null) {
         this.IllII(var1.field_1724);
         if (this.IlI != IIlIIIl.IIl) {
            this.IIlI(var1);
         }

         this.IIlII = false;
      } else {
         this.IIlII = false;
      }
   }

   private class_3966 lIIIl(class_310 var1, class_1309 var2) {
      if (var1 != null && var1.field_1724 != null && var2 != null) {
         class_3966 var3 = var1.field_1765 instanceof class_3966 var4 ? var4 : null;
         if (!this.IlIIII(var1, var3, var2)) {
            var3 = k74.x.IIll.lIlll(var1, 3.0);
         }

         return this.IlIIII(var1, var3, var2) ? var3 : null;
      } else {
         return null;
      }
   }

   private boolean lIIlI() {
      return this.IllII == IIlIIlIl.Ill();
   }

   private boolean lIIll(class_310 var1, boolean var2) {
      if (this.IIIIlIl()
         && var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var1.field_1755 == null
         && this.lIll != null
         && this.lIll != var1.field_1724
         && this.lIll.method_5805()
         && !IIlllIlll.I(this.lIll)
         && !lIIIllII.ll(var1)
         && System.currentTimeMillis() >= this.llll) {
         if (!k74.x.IIll.IIlI(this.lIll) || this.IIlI.IllI() && this.II(var1) >= 0) {
            if (var2 && !this.lIlII(var1.field_1724)) {
               return false;
            } else {
               boolean var3 = !this.IllIl(var1.field_1724);
               if (!var3) {
                  this.lIll = null;
               }

               return var3;
            }
         } else {
            this.lIll = null;
            return false;
         }
      } else {
         this.lIll = null;
         return false;
      }
   }

   private boolean lIlII(class_746 var1) {
      return var1 != null
         && !var1.method_24828()
         && !var1.method_6128()
         && !var1.method_5799()
         && !var1.method_5869()
         && !var1.method_5771()
         && !var1.method_6101()
         && !var1.method_5765()
         && !var1.method_31549().field_7479
         && !k74.x.IIll.lIllIl(var1);
   }

   private void lIlIl(boolean var1) {
      if (var1) {
         this.IllII = IIlIIlIl.Ill();
      }
   }

   private boolean lIllI(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && this.IlI != IIlIIIl.IIl
         && this.IIlll
         && this.lIlII(var1.field_1724)
         && System.currentTimeMillis() < this.llll;
   }

   private int lIlll(class_1799 var1, IlIIllIll var2, boolean var3) {
      int var4 = this.lIlI(var1, var2.I);
      int var5 = this.lIlI(var1, var2.IlI);
      return var4 * l(-1001777301, 1194529834 ^ -696413084) + var5 * l(-1001777302, 1194529834 ^ -581283383) + (var3 ? 1 : 0);
   }

   private class_3966 llIII(class_310 var1, class_1309 var2) {
      if (var1 != null && var1.field_1724 != null && var2 != null) {
         class_239 var5 = var1.field_1765;
         class_3966 var4 = var5 instanceof class_3966 ? (class_3966)var5 : null;
         if (!this.IlIIII(var1, var4, var2)) {
            var4 = k74.x.IIll.lIlll(var1, 3.0);
         }

         return this.IlIIII(var1, var4, var2) ? var4 : this.IIlllI(var1, var2);
      } else {
         return null;
      }
   }

   public boolean llIIl(class_310 var1, class_1309 var2) {
      if (this.IlI != IIlIIIl.IIl) {
         return var2 != null && var2 == this.lIll;
      } else {
         this.lIll = var2;
         if (this.lIllI(var1)) {
            return true;
         } else {
            boolean var4 = this.IlIIIl(var2);
            boolean var3 = var4 ? this.III(var1, var2) : this.lIIl(var1, var2);
            if (var3 && this.IIIIl(var1, var2) != null) {
               IlIIllIll var6 = this.IIIllI(var1.field_1724);
               boolean var7 = var6 != null && this.IlIIll(var1, var6, var4) >= 0 && (!var4 || this.lIl(var1, var2, var6));
               if (!var7) {
                  this.lIll = null;
               }

               return var7;
            } else {
               this.lIll = null;
               return false;
            }
         }
      }
   }

   private int llIlI(lIlllIl var1) {
      return Math.max(0, (int)Math.ceil(this.IIll(var1) / 50.0));
   }

   public boolean llIll(class_310 var1, class_1309 var2) {
      if (this.IlI == IIlIIIl.IIl) {
         this.lIll = var2;
         if (!this.III(var1, var2)) {
            this.lIll = null;
            return false;
         } else {
            IlIIllIll var3 = this.IIIllI(var1.field_1724);
            boolean var4 = this.lIl(var1, var2, var3);
            if (!var4) {
               this.lIll = null;
            }

            return var4;
         }
      } else {
         return this.IIIII && var2 != null && var2 == this.lIll;
      }
   }

   private void lllII(Boolean var1) {
      long var2 = System.currentTimeMillis();
      if (!var1) {
         this.IIlIll(var2);
      } else {
         this.Il = true;
         this.IIlll = true;
         this.llll = var2 + 0L;
         this.IIlIll(var2);
      }
   }

   private void lllIl(class_310 var1, long var2) {
      if (this.Il) {
         this.IIlIll(var2);
      } else if (!k74.x.IIll.lllI(var1, this.lIll)) {
         if (!this.lIIll(var1, true)) {
            if (!this.IIIII || this.IlIIlI(var2)) {
               this.lIIII(var1, var2);
               this.IIlIll(var2);
            }
         } else if (!this.IlII(var1)) {
            if (!this.IIIII || this.IlIIlI(var2)) {
               this.lIIII(var1, var2);
               this.IIlIll(var2);
            }
         } else {
            if (!this.IIlII(var1)) {
               if (var2 - this.IlIII > 350L) {
                  this.lIIII(var1, var2);
                  this.IIlIll(var2);
                  return;
               }

               if (!this.llllI(var1, this.IIIlI)) {
                  return;
               }
            }

            if (this.Illl || this.I(var1)) {
               class_3966 var4 = this.IIIII ? this.IIIIIl(var1, this.lIll) : this.llIII(var1, this.lIll);
               if (var4 == null) {
                  var4 = this.IIlllI(var1, this.lIll);
               }

               if (var4 == null) {
                  if (!this.IIIII || this.IlIIlI(var2)) {
                     this.lIIII(var1, var2);
                     this.IIlIll(var2);
                  }
               } else {
                  this.IIlIl = this::IlIl;
                  boolean var5 = this.IIIII ? this.IllIII(var1, var4, this.IIIlI) : this.lI(var1, var4);
                  if (!var5) {
                     this.IIlIl = null;
                     if (!this.IIIII || this.IlIIlI(var2)) {
                        this.lIIII(var1, var2);
                        this.IIlIll(var2);
                     }
                  }
               }
            }
         }
      }
   }

   private boolean llllI(class_310 var1, int var2) {
      if (this.lIIlI()) {
         return false;
      } else if (var1 != null && var1.field_1724 != null && var2 >= 0 && var2 < l(-1001777299, -852001253 ^ -1141671256)) {
         if (k74.x.IIll.lIIlI(var1) == var2 && k74.x.IIll.IlIlIl(var1, var2)) {
            this.IIl = null;
            return true;
         } else {
            if (this.IIl == null || !this.IIl.IIl() || !k74.x.IIll.IIIII(var1, this.IIl) || this.IIl.III() != var2) {
               this.IIl = k74.x.IIll.llII(var1, this, var2, 0, true);
            }

            if (k74.x.IIll.IIIllII(var1, this.IIl) && k74.x.IIll.IlIlIl(var1, var2)) {
               this.IIl = null;
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private double lllll(class_746 var1) {
      if (var1 == null) {
         return 0.0;
      } else {
         double var2 = Double.isNaN(this.lII) ? 0.0 : Math.max(0.0, this.lII - var1.method_23318());
         return Math.max(var1.field_6017, var2);
      }
   }

   private void IIIIII(class_310 var1, Boolean var2) {
      long var3 = System.currentTimeMillis();
      if (!var2) {
         if (this.lIIl++ < 3 && this.lIlII(var1.field_1724) && !this.IlIIlI(var3)) {
            this.IlI = IIlIIIl.Ill;
            this.lll = var3;
         } else {
            this.IIlIll(var3);
         }
      } else {
         this.Il = true;
         this.IIlll = true;
         this.llll = var3 + 0L;
         this.IIlIll(var3);
      }
   }

   private class_3966 IIIIIl(class_310 var1, class_1309 var2) {
      class_3966 var3 = this.llIII(var1, var2);
      return var3 != null ? var3 : this.IIlllI(var1, var2);
   }

   @Override
   public String IlIIl() {
      return IIIll[2];
   }

   private double IIIIlI(class_746 var1) {
      return Math.max(this.llI, this.lllll(var1));
   }

   private static int l(int var0, int var1) {
      int var2 = Illll[var0 ^ -1001777623] ^ var1 ^ var0;
      var2 += 5549;
      var2 -= 54130;
      var2 -= 45246;
      var2 ^= 27305;
      var2 ^= 32155;
      var2 ^= 63545;
      var2 += 60272;
      var2 ^= 54040;
      return var2 - 41941;
   }

   private boolean IIIIll(class_310 var1, class_1309 var2) {
      this.lIll = var2;
      IlIIllIll var3 = this.IIIllI(var1.field_1724);
      if (var3 == null) {
         this.lIll = null;
         return false;
      } else {
         int var4 = k74.x.IIll.IIlII(var1.field_1724.method_31548());
         int var5 = this.IlIIll(var1, var3, this.IlIIIl(var2));
         if (var5 < 0) {
            this.lIll = null;
            return false;
         } else {
            boolean var6 = this.IlIIIl(var2);
            int var7 = -1;
            if (var6 && (var7 = this.II(var1)) < 0) {
               this.lIll = null;
               return false;
            } else if (this.IlIlIl(var1, var3, var6) && !this.IlIlll(var1, var5)) {
               k74.x.IIll.lllIl(var1, this, lllIII.II);
               this.IIl = null;
               this.lIll = null;
               return false;
            } else {
               return this.IIllll(var1, var2, var5, var7, var6, var3, var4);
            }
         }
      }
   }

   private void IIIlII(class_310 var1) {
      if (this.IlI != IIlIIIl.IIl) {
         if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null && var1.field_1755 == null) {
            long var2 = System.currentTimeMillis();
            if (this.IlI == IIlIIIl.l) {
               if (var2 - this.IlIII > 1000L) {
                  this.IIlIl = null;
                  this.IlI = IIlIIIl.II;
                  this.IIlIll(var2);
               }
            } else if (this.IlI == IIlIIIl.lI) {
               if (var2 >= this.lll) {
                  this.IIII(var1, var2);
               }
            } else if (this.IlI == IIlIIIl.Ill) {
               if (var2 >= this.lll) {
                  if (this.IIIII) {
                     this.IllIIl(var1, var2);
                     return;
                  }

                  this.lllIl(var1, var2);
               }
            } else if (this.IlI == IIlIIIl.II) {
               if (var2 >= this.lll) {
                  this.lllIl(var1, var2);
               }
            } else {
               if (this.IlI == IIlIIIl.I && var2 >= this.lll && this.lIII(var1, true)) {
                  this.IIIII();
               }
            }
         } else {
            this.lIII(var1, true);
            this.IIIII();
         }
      }
   }

   private boolean IIIlIl(class_310 var1, int var2) {
      return this.IIl == null || this.IIl.III() != var2 || k74.x.IIll.IIIllII(var1, this.IIl);
   }

   private IlIIllIll IIIllI(class_746 var1) {
      if (var1 == null) {
         return null;
      } else if (this.IlI != IIlIIIl.IIl && this.lIlI != null) {
         return this.lIlI;
      } else if (this.llII(var1)) {
         return IlIIllIll.l;
      } else {
         double var2 = this.IllI(var1);
         return lIlIIlII.IlI(var2, this.lIII.IllI()) ? IlIIllIll.III : IlIIllIll.l;
      }
   }

   public boolean IIIlll() {
      return this.IlI != IIlIIIl.IIl;
   }

   public boolean IIlIII(class_310 var1, class_1309 var2) {
      if (this.IlI == IIlIIIl.IIl) {
         this.lIll = var2;
         if (this.lIllI(var1)) {
            this.IIlI(var1);
            return true;
         } else {
            boolean var4 = this.IlIIIl(var2);
            boolean var7 = var4 ? this.III(var1, var2) : this.lIIl(var1, var2);
            if (!var7) {
               this.lIll = null;
               return false;
            } else if (this.IIIIl(var1, var2) == null) {
               this.lIll = null;
               return false;
            } else {
               boolean var6 = this.IIIIll(var1, var2);
               if (var6) {
                  this.IIIlII(var1);
                  if (!this.IIlII) {
                     this.IIlI(var1);
                  }
               }

               return var6;
            }
         }
      } else {
         boolean var3 = var2 != null && var2 == this.lIll;
         if (var3) {
            this.IIlI(var1);
         }

         return var3;
      }
   }

   private static String IIlIIl(char[] var0, long var1, int var3) {
      int var4 = l(-1001777283, -416284195 ^ -844130678) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & l(-1001777284, -416284195 ^ 574712667);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private class_3966 IIlIlI(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         class_3966 var2 = k74.x.IIll.lIlll(var1, 3.0);
         class_1309 var3 = k74.x.IIll.llIlll(var1, var2);
         if (var3 != null && this.IlIIII(var1, var2, var3)) {
            return var2;
         } else {
            return var1.field_1765 instanceof class_3966 var4 && var4.method_17782() instanceof class_1309 var5 && this.IlIIII(var1, var4, var5) ? var4 : null;
         }
      } else {
         return null;
      }
   }

   private void IIlIll(long var1) {
      if (this.IlI != IIlIIIl.l) {
         this.IlI = IIlIIIl.I;
         this.IlIII = var1;
         this.lll = var1;
      }
   }

   private boolean IIllII(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         class_1799 var2 = var1.field_1724.method_6047();
         if (var2 != null && !var2.method_7960()) {
            String var3 = class_7923.field_41178.method_10221(var2.method_7909()).method_12832();
            return var3.endsWith(IlIIllIII.lI(IIIll[1])) || var3.endsWith(IlIIllIII.lI(IIIll[0]));
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static void IIllIl(class_310 var0, Object var1, lllIII var2) {
      if (((IllIIIIl)var1).lIIlI()) {
         k74.x.IIll.IlIllII(var0, var1, -1, 1);
      } else {
         k74.x.IIll.lllIl(var0, var1, var2);
      }
   }

   private class_3966 IIlllI(class_310 var1, class_1309 var2) {
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var2 != null) {
         class_243 var3 = var1.field_1724.method_33571();
         class_238 var4 = var2.method_5829();
         class_243 var5 = new class_243(
            IIllI(var3.field_1352, var4.field_1323, var4.field_1320),
            IIllI(var3.field_1351, var4.field_1322, var4.field_1325),
            IIllI(var3.field_1350, var4.field_1321, var4.field_1324)
         );
         return !(var3.method_1025(var5) > 9.0001) && this.IIl(var1, var3, var5) ? new class_3966(var2, var5) : null;
      } else {
         return null;
      }
   }

   private boolean IIllll(class_310 var1, class_1309 var2, int var3, int var4, boolean var5, IlIIllIll var6, int var7) {
      this.lIll = var2;
      this.IIllI = var4;
      this.IIIlI = var3;
      this.IIIII = var5;
      this.lIlI = var6;
      this.Illl = this.IlIlIl(var1, var6, var5);
      this.Il = false;
      this.lIIl = 0;
      this.II = l(-1001777281, 924380582 ^ -330110703);
      this.IIIIl = false;
      this.IllI = var7;
      if (var4 < 0 && !this.Illl && k74.x.IIll.IIlII(var1.field_1724.method_31548()) != var3) {
         this.llllI(var1, var3);
      }

      long var9 = System.currentTimeMillis();
      this.IlI = var4 >= 0 ? IIlIIIl.lI : IIlIIIl.II;
      this.IlIII = var9;
      this.lll = var9;
      return true;
   }

   private boolean IlIIII(class_310 var1, class_3966 var2, class_1309 var3) {
      if (var1 == null
         || var1.field_1724 == null
         || var1.field_1687 == null
         || var3 == null
         || var3 == var1.field_1724
         || !var3.method_5805()
         || var3.method_31481()
         || var1.field_1687.method_8469(var3.method_5628()) != var3) {
         return false;
      } else if (var2 != null && var2.method_17782() == var3 && var2.method_17784() != null) {
         class_243 var4 = var1.field_1724.method_33571();
         class_243 var5 = var2.method_17784();
         return var4.method_1025(var5) <= 9.0 && this.IIl(var1, var4, var5);
      } else {
         return false;
      }
   }

   private boolean IlIIIl(class_1309 var1) {
      class_310 var2 = class_310.method_1551();
      return this.IIlI.IllI() && var2 != null && var2.field_1724 != null && var1 != null && this.IllllI(var2, var1) && this.II(var2) >= 0;
   }

   private boolean IlIIlI(long var1) {
      return var1 - this.IlIII > 1500L;
   }

   private int IlIIll(class_310 var1, IlIIllIll var2, boolean var3) {
      return this.IlIlIl(var1, var2, var3) ? this.Ill(var1) : this.IIIll(var1, var2);
   }

   private void IlIlII(class_310 var1) {
      if (this.ll && var1 != null) {
         var1.field_1765 = this.IlIl;
      }

      this.ll = false;
      this.IlIl = null;
      k74.x.IIll.IlIlI(false);
   }

   private boolean IlIlIl(class_310 var1, IlIIllIll var2, boolean var3) {
      return this.IlIll.IllI() && !var3 && var2 == IlIIllIll.l && this.IIllII(var1);
   }

   private boolean IlIllI(class_310 var1, int var2, boolean var3) {
      if (this.lIIlI()) {
         return false;
      } else if (var1 != null && var1.field_1724 != null && var2 >= 0 && var2 < l(-1001777282, 2028320967 ^ 506251746)) {
         class_1799 var4 = var1.field_1724.method_31548().method_5438(var2);
         boolean var5 = var3 ? var4.method_7909() instanceof class_1743 && k74.x.IIll.IIIIlll(var4) : var4.method_7909() instanceof class_9362;
         if (!var5) {
            return false;
         } else {
            boolean var6 = k74.x.IIll.lIIlI(var1) != var2;
            int var7 = var6 ? this.llIlI(this.Ill) : 0;
            this.IIl = k74.x.IIll.llII(var1, this, var2, var7, true);
            return this.IIl != null && this.IIl.IIl() && k74.x.IIll.lIIlI(var1) == var2 && (k74.x.IIll.IllIlI() || k74.x.IIll.IlIlIl(var1, var2));
         }
      } else {
         return false;
      }
   }

   private boolean IlIlll(class_310 var1, int var2) {
      if (var1 != null && var1.field_1724 != null && var2 >= 0 && var2 < l(-1001777295, -1329671532 ^ -823074819)) {
         class_1799 var3 = var1.field_1724.method_31548().method_5438(var2);
         return !this.Il(var3) ? false : this.IlIllI(var1, var2, false);
      } else {
         return false;
      }
   }

   private boolean IllIII(class_310 var1, class_3966 var2, int var3) {
      return this.IlllI(var1, var2, var3);
   }

   private void IllIIl(class_310 var1, long var2) {
      if (this.Il) {
         this.IIlIll(var2);
      } else if (var1 == null || var1.field_1724 == null || !this.lIlII(var1.field_1724)) {
         this.IIlIll(var2);
      } else if (var1.field_1724.field_6012 >= this.II) {
         if (!k74.x.IIll.lllI(var1, this.lIll)) {
            if (!this.IlII(var1)) {
               if (this.IlIIlI(var2)) {
                  this.lIIII(var1, var2);
                  this.IIlIll(var2);
               }
            } else if (!this.IlIllI(var1, this.IIIlI, false)) {
               if (var2 - this.IlIII > 350L) {
                  this.lIIII(var1, var2);
                  this.IIlIll(var2);
               }
            } else {
               class_3966 var4 = this.IIIIIl(var1, this.lIll);
               if (var4 == null) {
                  if (this.IlIIlI(var2)) {
                     this.lIIII(var1, var2);
                     this.IIlIll(var2);
                  }
               } else {
                  this.IIlIl = this::IIIIII;
                  if (!this.IllIII(var1, var4, this.IIIlI)) {
                     this.IIlIl = null;
                     if (this.IlIIlI(var2)) {
                        this.lIIII(var1, var2);
                        this.IIlIll(var2);
                     }
                  }
               }
            }
         }
      }
   }

   private boolean IllllI(class_310 var1, class_1309 var2) {
      if (var1 != null && var1.field_1724 != null && var2 != null && k74.x.IIll.IIlI(var2)) {
         class_243 var3 = new class_243(
            var1.field_1724.method_23317() - var2.method_23317(),
            var1.field_1724.method_23318() - var2.method_23318(),
            var1.field_1724.method_23321() - var2.method_23321()
         );
         class_243 var4 = var2.method_5828(1.0F);
         double var5 = Math.hypot(var3.field_1352, var3.field_1350);
         return var5 <= 1.0E-5 ? true : (var4.field_1352 * var3.field_1352 + var4.field_1350 * var3.field_1350) / var5 > 0.0;
      } else {
         return false;
      }
   }
}
