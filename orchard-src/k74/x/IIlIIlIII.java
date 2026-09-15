package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2680;
import net.minecraft.class_2743;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_638;
import net.minecraft.class_7923;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

@Environment(EnvType.CLIENT)
public final class IIlIIlIII extends IlIIIIIIl {
   private int II;
   private static final double Il = 0.5;
   private static final double lI = 0.12;
   private static final List<lIllll> ll;
   private static final double III = 0.35;
   private final lllIIlII I;
   private final IIlIII IIl;
   private boolean IlI;
   private IIlIlIII Ill;
   private final lIlllIl lII;
   private final IllIII<llIlllII> lIl;
   private static final Object[] IlIIII;
   private int llI;
   private static final double lll = 3.0;
   private static final String[] IIllll;
   private static final String[] IIII;
   private float IIIl;
   private long IIlI;
   private int IIll;
   private boolean IlII;
   private static final double IlIl = 9.0;
   private static final IIIlIlIl IllI;
   private class_1309 Illl;
   private static final int lIII = 20;
   private static final long lIIl = 175L;
   private class_243 lIlI;
   private static final double lIll = 0.42;
   private static final String[] llII;
   private static final double llIl = 25.0;
   private final lIIIIIlI lllI;
   private final lIlllIl llll;
   private Object IIIII;
   private final IIlIII IIIIl;
   private static final long IIIlI = 650L;
   private final lllIIlII IIIll;
   private class_2338 IIlII;
   private final IIlIII IIlIl;
   private static final long IIllI = 180L;
   private final lllIIlII IIlll;
   private final lIlllIl IlIII;
   private class_3965 IlIIl;
   private long IlIlI;
   private static final double IlIll = 1.25;
   private static final int IllII = 9;
   private long IllIl;
   private boolean IlllI;
   private static final int[] IIlllI;
   private final IlIIIllll Illll;
   private static final int lIIII = 3;
   private int lIIIl;
   private int lIIlI;
   private IIIlIll lIIll;
   private int lIlII;
   private static final double lIlIl = 0.25;
   private long lIllI;
   private static final double lIlll = 0.0;
   private float llIII;
   private int llIIl;
   private class_2338 llIlI;
   private static final IIIlIlIl llIll;
   private final IllIII<IllIIIlI> lllII;
   private float lllIl;
   private static final IIIlIlIl llllI;
   private static final IIIlIlIl lllll;
   private boolean IIIIII;
   private boolean IIIIIl;
   private static final long IIIIlI = 600L;
   private static final double IIIIll = 0.55;
   private int IIIlII;
   private long IIIlIl;
   private final lllIIlII IIIllI;
   private class_243 IIIlll;
   private long IIlIII;
   private boolean IIlIIl;
   private static final double IIlIlI = 0.001;
   private int IIlIll;
   private int IIllII;
   private int IIllIl;

   private void I(class_2338 var1, boolean var2) {
      if (this.llIlI != null && this.llIlI.equals(var1)) {
         this.IIIIIl = var2;
         this.IlII = !var2;
      }
   }

   private boolean II(class_310 var1, class_2338 var2) {
      if (var1 != null && var1.field_1687 != null && var2 != null) {
         class_2680 var3 = var1.field_1687.method_8320(var2);
         return var3.method_26227().method_15769() && !var3.method_27852(class_2246.field_10382) && !var3.method_27852(class_2246.field_10164)
            ? var3.method_26215()
               || var3.method_45474()
               || k74.x.IIll.lIIlIl(var3)
               || var3.method_27852(class_2246.field_10036)
               || var3.method_27852(class_2246.field_22089)
            : false;
      } else {
         return false;
      }
   }

   public IIlIIlIII() {
      int var1 = 942770810;
      super(
         IlIIllIII.Ill(IIllI(IlIllI(566834682, var1 ^ -203767046), IlIllI(566834683, var1 ^ 1140927822))),
         lllIIlIl.I,
         IlIIllIII.Ill(IIllI(IlIllI(566834680, var1 ^ 280539541), IlIllI(566834681, var1 ^ 1540661514)))
      );
      this.lIl = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllI(IlIllI(566834686, var1 ^ -1428269018), IlIllI(566834687, var1 ^ 960313475))), llIlllII.class, llIlllII.Il)
      );
      this.lllI = this.IllIIll(
         new lIIIIIlI(IlIIllIII.Ill(IIllI(IlIllI(566834684, var1 ^ -6853355), IlIllI(566834685, var1 ^ 1208067618))), ll, List.of(IllI, lllll))
      );
      this.IIIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllI(IlIllI(566834674, var1 ^ 116181949), IlIllI(566834675, var1 ^ -1427245791))), true));
      this.I = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllI(IlIllI(566834672, var1 ^ -1794725827), IlIllI(566834673, var1 ^ -1092428482))), false));
      this.llll = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIllI(IlIllI(566834678, var1 ^ -352874058), IlIllI(566834679, var1 ^ 471491323))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(IIllI(IlIllI(566834676, var1 ^ -1602246544), IlIllI(566834677, var1 ^ -869095104))))
      );
      this.IIl = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIllI(IlIllI(566834666, var1 ^ 675401800), IlIllI(566834667, var1 ^ 1870569595))), 100.0, 0.0, 100.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIllI(IlIllI(566834664, var1 ^ -1394908661), IlIllI(566834665, var1 ^ 1607142345))))
      );
      this.IIlll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllI(IlIllI(566834670, var1 ^ -368731800), IlIllI(566834671, var1 ^ -809964303))), false));
      this.IlIII = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIllI(IlIllI(566834668, var1 ^ -443445173), IlIllI(566834669, var1 ^ -1190335820))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(IIllI(IlIllI(566834658, var1 ^ -96124658), IlIllI(566834659, var1 ^ 206860607))))
      );
      this.IIIIl = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIllI(IlIllI(566834656, var1 ^ -680345129), IlIllI(566834657, var1 ^ -824622784))), 100.0, 0.0, 100.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIllI(IlIllI(566834662, var1 ^ -1776214861), IlIllI(566834663, var1 ^ -2076627009))))
      );
      this.lII = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIllI(IlIllI(566834660, var1 ^ -387125737), IlIllI(566834661, var1 ^ 362058647))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(IIllI(IlIllI(566834650, var1 ^ -1615216833), IlIllI(566834651, var1 ^ -506797912))))
      );
      this.IIIllI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllI(IlIllI(566834648, var1 ^ 480564947), IlIllI(566834649, var1 ^ 1698034642))), true));
      this.lllII = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllI(IlIllI(566834654, var1 ^ 668547969), IlIllI(566834655, var1 ^ 2119335732))), IllIIIlI.class, IllIIIlI.II)
      );
      this.IIlIl = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIllI(IlIllI(566834652, var1 ^ 767219959), IlIllI(566834653, var1 ^ -499149845))), 50.0, 1.0, 100.0, 1.0).lIlI(this::IlIIII)
      );
      this.Illll = new IlIIIllll();
      this.lIIll = IIIlIll.Il;
      this.llIIl = -1;
      this.lIlII = -1;
      this.lIIlI = -1;
      this.IIIlII = -1;
      this.IIlII = null;
      this.IIIlll = null;
      this.IlIIl = null;
      this.IIllII = -1;
      this.IIll = IlIllI(566834642, var1 ^ 528876852);
      this.lIlI = class_243.field_1353;
      this.Illl = null;
      this.IIIIII = false;
      this.lIIIl = -1;
      this.llI = IlIllI(566834643, var1 ^ -822337479);
      this.II = -1;
      this.llll.lIlI(this.I::IllI);
      this.IIl.lIlI(this.I::IllI);
      this.IIlll.lIlI(IIlIIlIII::lIllI);
      this.IlIII.lIlI(this.IIlll::IllI);
      this.IIIllI.lIlI(this.IIlll::IllI);
      this.lllII.lIlI(this.IIlll::IllI);
      this.IIIIl.lIlI(this.IIlll::IllI);
   }

   private void Il(long var1) {
      if (this.IIIlII >= 0 && this.IIIlII < IlIllI(566834640, -1650474941 ^ 1833956054)) {
         if (this.lIIIl != this.IIIlII) {
            this.lIIIl = this.IIIlII;
            this.IIlI = var1 + 180L;
            this.IlllI = false;
         }
      }
   }

   private boolean lI(class_310 var1, class_1309 var2) {
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 == null) {
         return false;
      } else {
         IllIIIIl var4 = var3.II().Illl();
         return var4 != null && var4.IIIIlIl() && (var4.lllI(var2) || var4.llIll(var1, var2));
      }
   }

   private boolean ll(class_310 var1, class_1309 var2) {
      if (var2 == null || var1 == null || var1.field_1724 == null || var1.field_1761 == null) {
         return false;
      } else if (var2.method_5805() && !k74.x.IIll.lIllIl(var2)) {
         if (this.lIIlI < 0 || k74.x.IIll.lIIlI(var1) != this.lIIlI || !k74.x.IIll.IIIIlII(var1, this.lIIlI)) {
            this.lIIlI = this.IIIllI(var1);
         }

         if (this.lIIlI < 0) {
            return false;
         } else {
            llIlIlII var3 = this.lIIII(var1, var2);
            if (var3 == null) {
               this.IIIll();
               return false;
            } else {
               this.IIlII = var3.I();
               this.IIIlll = var3.Il();
               this.IlIIl = var3.l();
               this.IlI = this.IllI(var1, this.IIlII, this.IIIlll);
               return this.IlI;
            }
         }
      } else {
         this.IIIlII(System.currentTimeMillis());
         return true;
      }
   }

   private boolean III(class_310 var1, class_1309 var2) {
      return !this.IIlIIl(var1)
         ? false
         : var2 instanceof class_1657
            && var2 != var1.field_1724
            && var2.method_5805()
            && var2.method_6039()
            && k74.x.IIll.IIIl(var2, var1.field_1724)
            && !this.IIlIII(var2)
            && this.IllIl(var1, var2);
   }

   private void IIl() {
      this.lIIIl = -1;
      this.IIlI = 0L;
      this.IlllI = false;
   }

   private boolean Ill(class_310 var1, class_3966 var2, class_1309 var3) {
      return var1 != null
         && var1.field_1724 != null
         && var2 != null
         && var2.method_17782() == var3
         && var1.field_1724.method_33571().method_1025(var2.method_17784()) <= 9.0;
   }

   private class_3966 lII(class_310 var1, class_1309 var2) {
      if (var1 != null && var1.field_1724 != null && var2 != null && this.IllIl(var1, var2)) {
         class_239 var5 = var1.field_1765;
         class_3966 var4 = var5 instanceof class_3966 ? (class_3966)var5 : null;
         if (!this.Ill(var1, var4, var2)) {
            var4 = k74.x.IIll.lIlll(var1, 3.0);
         }

         return this.Ill(var1, var4, var2) ? var4 : null;
      } else {
         return null;
      }
   }

   private void lIl(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (this.lIIll != IIIlIll.Il) {
         if (var1 != null && var1.field_1724 != null) {
            label292: {
               long var3 = System.currentTimeMillis();
               if (this.lIIll == IIIlIll.Ill) {
                  if (!this.III(var1, this.Illl)) {
                     this.IIIlII(var3);
                     return;
                  }

                  if (!this.IIIIl(var1, this.llIIl)) {
                     if (var3 - this.IllIl > 650L) {
                        this.IlIIll(var1);
                     }

                     return;
                  }

                  if (var3 < this.IIIlIl) {
                     return;
                  }

                  this.lIIll = IIIlIll.IlI;
                  this.IllIl = var3;
                  this.IIIlIl = var3 + this.lIIll(this.llll);
                  if (var3 < this.IIIlIl) {
                     return;
                  }

                  this.IlIIlI(var1, var3);
                  if (var2 == null) {
                     return;
                  }
               }

               if (this.lIIll == IIIlIll.IlI) {
                  if (var3 < this.IIIlIl) {
                     return;
                  }

                  this.IlIIlI(var1, var3);
                  if (var2 == null) {
                     return;
                  }
               }

               if (this.lIIll == IIIlIll.l) {
                  this.IlIIlI(var1, var3);
                  if (var2 == null) {
                     return;
                  }
               }

               if (this.lIIll == IIIlIll.II) {
                  if (var3 < this.IIIlIl) {
                     return;
                  }

                  this.llIIl(var1, var3);
                  if (var2 == null) {
                     return;
                  }
               }

               if (this.lIIll == IIIlIll.lI) {
                  if (var3 < this.IIIlIl) {
                     return;
                  }

                  if (!this.IIllII(var1)) {
                     if (var3 - this.IllIl > 650L) {
                        this.IIIlII(var3);
                        return;
                     }

                     this.IIIlIl = var3;
                     return;
                  }

                  this.lIIll = IIIlIll.III;
                  this.IllIl = var3;
                  this.IIIlIl = var3 + this.lIIll(this.lII);
                  if (var2 == null) {
                     return;
                  }
               }

               if (this.lIIll == IIIlIll.III) {
                  if (k74.x.IIll.lIIlI(var1) != this.lIIlI) {
                     this.lIIll = IIIlIll.lI;
                     this.IllIl = var3;
                     this.IIIlIl = var3;
                     return;
                  }

                  if (this.lllII.IllI() == IllIIIlI.lI) {
                     if (var3 - this.IllIl >= 1500L) {
                        this.lIIll = IIIlIll.IIl;
                        this.IllIl = var3;
                        this.IIIlIl = var3 + this.lIIll(this.IlIII);
                        return;
                     }

                     float var5 = this.Illll.IIIllII(var1, this.IlIIl, this.IIlIl.IllI().floatValue());
                     if (var5 == Float.MAX_VALUE) {
                        this.IIIll();
                        this.lIIll = IIIlIll.IIl;
                        this.IllIl = var3;
                        this.IIIlIl = var3;
                        return;
                     }

                     boolean var6 = var5 <= 2.5F || var1.field_1765 instanceof class_3965 var7 && IIIIlI(var7, this.IlIIl);
                     if (var6) {
                        this.lIIll = IIIlIll.IIl;
                        this.IllIl = var3;
                        this.IIIlIl = var3 + this.lIIll(this.IlIII);
                     }

                     if (var2 == null) {
                        return;
                     }
                  }

                  if (var3 < this.IIIlIl) {
                     return;
                  }

                  if (!this.IlII(var1)) {
                     this.IIIlII(var3);
                     return;
                  }

                  this.lIIll = IIIlIll.IIl;
                  this.IllIl = var3;
                  this.IIIlIl = var3 + this.lIIll(this.IlIII);
                  if (var2 == null) {
                     return;
                  }
               }

               if (this.lIIll == IIIlIll.IIl) {
                  if (this.llIlI != null) {
                     if (var1.field_1687 != this.IIIII || this.IIIIIl || var1.field_1724.field_6012 > this.IIllIl) {
                        this.IIIlII(var3);
                        if (var2 == null) {
                           return;
                        }
                     }

                     if (this.IlII) {
                        this.lllII();
                        this.IlI = false;
                        if (this.IIlIll >= 3) {
                           this.IIIlII(var3);
                           if (var2 == null) {
                              return;
                           }
                        }

                        this.IIIlIl = var3 + 50L;
                     }

                     return;
                  }

                  if (this.IIllIl(var1)) {
                     this.IIIlIl = var3;
                     return;
                  }

                  if (this.IlI) {
                     if (var3 - this.IllIl > 650L) {
                        this.IIIlII(var3);
                     }

                     return;
                  }

                  if (var3 < this.IIIlIl || this.ll(var1, this.Illl)) {
                     return;
                  }

                  if (var3 - this.IllIl <= 650L) {
                     this.IIIlIl = var3 + 15L;
                     if (var2 == null) {
                        return;
                     }
                  }

                  this.IIIlII(var3);
                  if (var2 == null) {
                     return;
                  }
               }

               if (this.lIIll == IIIlIll.I && var3 >= this.IIIlIl) {
                  if (!this.IIIll.IllI()) {
                     break label292;
                  }

                  this.Il(var3);
                  if (var2 != null) {
                     break label292;
                  }

                  if (this.IIllIl(var1) && var3 - this.IllIl <= 650L) {
                     this.IIIlIl = var3;
                     return;
                  }

                  this.IlIIll(var1);
               }

               return;
            }

            k74.x.IIll.lllIl(var1, this, lllIII.I);
            this.lllI();
         } else {
            this.lllI();
         }
      }
   }

   private boolean llI(class_310 var1, long var2) {
      if (!this.I.IllI() || !this.IIIlI(var1, this.Illl)) {
         return false;
      } else if (!this.IlIIIl()) {
         return false;
      } else {
         this.lIlII = this.llIIl;
         this.lIIll = IIIlIll.II;
         this.IllIl = var2;
         this.IIIlIl = var2 + this.lIIll(this.llll);
         this.IIlIII = 0L;
         return true;
      }
   }

   public boolean lll() {
      return this.lIIll != IIIlIll.Il || this.IIlIIl;
   }

   public boolean IIII(class_1309 var1) {
      return var1 != null && this.Illl == var1 && this.lIIll != IIIlIll.Il && this.lIIll != IIIlIll.I;
   }

   @Override
   public void lllIll(class_2596<?> var1) {
      class_310 var2 = class_310.method_1551();
      if (var1 instanceof class_2626 var3) {
         this.lIlll(var2, var3.method_11309(), var3.method_11308());
      } else if (var1 instanceof class_2637 var4) {
         var4.method_30621(this::llII);
      }

      if (var2 != null && var2.field_1724 != null && this.IIllII >= 0 && var1 instanceof class_2743 var5 && var5.method_11818() == this.IIllII) {
         class_243 var6 = var5.method_73085();
         if (var6 != null) {
            this.lIlI = var6;
            this.IIll = var2.field_1724.field_6012;
         }
      }
   }

   private boolean IIIl(class_310 var1, class_1309 var2, int var3) {
      if (!this.IIll(var1, var2, var3)) {
         return false;
      } else {
         this.lIl(var1);
         return true;
      }
   }

   private void IIlI() {
      this.lllII();
      this.IIlIll = 0;
      this.lIIlI = -1;
      this.IIIll();
      this.IIllII = -1;
      this.IIll = IlIllI(566834641, -814952547 ^ 561008850);
      this.lllIl = 0.0F;
      this.lIlI = class_243.field_1353;
      this.IlI = false;
   }

   private boolean IIll(class_310 var1, class_1309 var2, int var3) {
      if (var1 != null && var1.field_1724 != null && var1.method_1562() != null && var2 != null && var3 >= 0 && var3 < IlIllI(566834646, -1764162 ^ 528599282)) {
         this.Illl = var2;
         this.llIIl = var3;
         this.IIIlII = k74.x.IIll.IIlII(var1.field_1724.method_31548());
         long var4 = System.currentTimeMillis();
         this.lIIll = IIIlIll.Ill;
         this.IllIl = var4;
         boolean var6 = k74.x.IIll.lIIlI(var1) != var3;
         this.IIIlIl = var6 ? var4 + this.lIIll(this.lII) : var4;
         return true;
      } else {
         return false;
      }
   }

   private boolean IlII(class_310 var1) {
      if (!this.lllll(var1)) {
         return false;
      } else if (this.lllII.IllI() == IllIIIlI.II) {
         return true;
      } else {
         k74.x.IIll.IIIIIll(var1, this.llIII, this.IIIl);
         return true;
      }
   }

   private boolean IlIl(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1690 != null
         && var1.field_1755 == null
         && var1.field_1724.method_5805();
   }

   private boolean IllI(class_310 var1, class_2338 var2, class_243 var3) {
      if (var1 != null && var1.field_1724 != null && var1.field_1761 != null && var2 != null && var3 != null) {
         int var4 = this.lIIlI >= 0 ? this.lIIlI : this.IIIllI(var1);
         if (var4 < 0) {
            return false;
         } else {
            class_3965 var5 = this.IlIIl;
            if (var5 != null && var2.equals(var5.method_17777()) && this.IlIlII(var1, var5)) {
               if (this.lllII.IllI() == IllIIIlI.lI) {
                  float var12 = this.Illll.IIIllII(var1, var5, this.IIlIl.IllI().floatValue());
                  if (var12 == Float.MAX_VALUE) {
                     return false;
                  } else {
                     boolean var7 = var12 <= 2.5F || var1.field_1765 instanceof class_3965 var8 && IIIIlI(var8, var5);
                     if (!var7) {
                        return false;
                     } else {
                        this.Illll.IIlIl();
                        class_3965 var13 = var1.field_1765 instanceof class_3965 var14 && IIIIlI(var14, var5) ? var14 : var5;
                        return this.IlllI(var1, var4, var5, var13);
                     }
                  }
               } else {
                  if (this.lllII.IllI() == IllIIIlI.l) {
                     float[] var6 = IlllIlII.lIII(var1, var3);
                     if (var6 != null) {
                        k74.x.IIll.IIIIIll(var1, var6[0], var6[1]);
                     }
                  }

                  class_638 var11 = var1.field_1687;
                  return IlllIlII.IIIlII(var1, IlIllI(566834647, -297693419 ^ 1244992269), var5.method_17784(), this::IIlllI);
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private boolean Illl(class_310 var1, class_243 var2, class_2338 var3) {
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var2 != null && var3 != null) {
         class_3965 var4 = var1.field_1687
            .method_17742(new class_3959(var1.field_1724.method_33571(), var2, class_3960.field_17559, class_242.field_1348, var1.field_1724));
         return var4 != null && var4.method_17777().equals(var3);
      } else {
         return false;
      }
   }

   private boolean lIII(class_310 var1, class_1309 var2) {
      if (!this.IIlll.IllI() || var1 == null || var1.field_1724 == null || var1.field_1687 == null || var1.field_1761 == null || var2 == null) {
         return false;
      } else if (k74.x.IIll.lIllIl(var2)) {
         return false;
      } else if (!this.IIIlll()) {
         return false;
      } else {
         int var3 = this.IIIllI(var1);
         if (var3 < 0) {
            return false;
         } else {
            llIlIlII var4 = this.lIIII(var1, var2);
            if (var4 == null) {
               return false;
            } else {
               float[] var5 = IlllIlII.lIII(var1, var4.Il());
               if (var5 == null) {
                  return false;
               } else {
                  this.lIIlI = var3;
                  this.IIlII = var4.I();
                  this.IIIlll = var4.Il();
                  this.IlIIl = var4.l();
                  this.llIII = var5[0];
                  this.IIIl = var5[1];
                  return true;
               }
            }
         }
      }
   }

   @Override
   public void IlllII(JsonObject var1) {
      int var2 = -232113564;
      this.lIll(var1);
      super.IlllII(var1);
      this.IIIlIIl(var1, llllI.llIl(), new lIlllIl[]{this.lII, this.llll});
      this.IIIlIIl(var1, llIll.llIl(), new lIlllIl[]{this.lII, this.llll});
      this.IIIlIIl(var1, IlIIllIII.lI(IIllI(IlIllI(566834644, var2 ^ -494871639), IlIllI(566834645, var2 ^ 1104960172))), new lIlllIl[]{this.lII});
      this.IIIlIIl(var1, IlIIllIII.lI(IIllI(IlIllI(566834634, var2 ^ 1607196806), IlIllI(566834635, var2 ^ 2095014047))), new lIlllIl[]{this.llll});
      this.IIIlIIl(var1, IlIIllIII.lI(IIllI(IlIllI(566834632, var2 ^ 462654271), IlIllI(566834633, var2 ^ 1185283402))), new lIlllIl[]{this.llll});
      this.IIIlIIl(var1, IlIIllIII.lI(IIllI(IlIllI(566834638, var2 ^ 1981797546), IlIllI(566834639, var2 ^ -656088628))), new lIlllIl[]{this.lII});
      this.IIIlIIl(var1, IlIIllIII.lI(IIllI(IlIllI(566834636, var2 ^ 938977821), IlIllI(566834637, var2 ^ -1131308499))), new lIlllIl[]{this.llll});
      this.IIIlIIl(var1, IlIIllIII.lI(IIllI(IlIllI(566834626, var2 ^ -1809707978), IlIllI(566834627, var2 ^ 404097928))), new lIlllIl[]{this.llll});
      if (this.lII.IIlI() == 55.0 && this.lII.IlI() == 60.0) {
         this.lII.III(new double[]{0.0, 0.0});
      }

      if (this.llll.IIlI() == 10.0 && this.llll.IlI() == 25.0) {
         this.llll.III(new double[]{0.0, 0.0});
      }
   }

   private llIlIlII lIIl(class_310 var1, List<class_2338> var2) {
      for (class_2338 var4 : var2) {
         llIlIlII var5 = this.IIIIll(var1, var4);
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   public boolean lIlI() {
      return this.IIIIlIl() && this.IIlll.IllI() && (this.lIIll == IIIlIll.lI || this.lIIll == IIIlIll.III || this.lIIll == IIIlIll.IIl);
   }

   private void lIll(JsonObject var1) {
      if (var1 != null && var1.has(IlIIllIII.lI(IIllI(IlIllI(566834602, 2036657678 ^ 254131324), IlIllI(566834603, 2036657678 ^ -590579286))))) {
         JsonObject var2 = var1.getAsJsonObject(IlIIllIII.lI(IIllI(IlIllI(566834600, 2036657678 ^ -838298200), IlIllI(566834601, 2036657678 ^ -666930961))));
         if (var2 != null) {
            JsonElement var3 = IIIllll(var2, this.lllI.l());
            if (var3 != null && var3.isJsonPrimitive() && var3.getAsJsonPrimitive().isBoolean()) {
               IIIllII(var2, this.lllI.l());
            }
         }
      }
   }

   private void llII(class_310 var1, class_2338 var2, class_2680 var3) {
      this.lIlll(var1, var2, var3);
   }

   private void lllI() {
      this.lIIll = IIIlIll.Il;
      this.IllIl = 0L;
      this.IIIlIl = 0L;
      this.IIlIII = 0L;
      this.Illl = null;
      this.llIIl = -1;
      this.lIlII = -1;
      this.IIIlII = -1;
      this.IIlI();
      this.IIlIIl = false;
      this.lIllI = 0L;
      this.llI = IlIllI(566834606, -863206091 ^ 799721090);
      this.Ill = null;
   }

   private static double IIIII(class_238 var0, class_2338 var1) {
      double var2 = Math.max(0.0, Math.min(var0.field_1320, var1.method_10263() + 1.0) - Math.max(var0.field_1323, (double)var1.method_10263()));
      double var4 = Math.max(0.0, Math.min(var0.field_1324, var1.method_10260() + 1.0) - Math.max(var0.field_1321, (double)var1.method_10260()));
      return var2 * var4;
   }

   private boolean IIIIl(class_310 var1, int var2) {
      if (var1 != null && var1.field_1724 != null && var2 >= 0 && var2 < IlIllI(566834607, -1766356908 ^ -834541753)) {
         if (k74.x.IIll.lIIlI(var1) == var2 && k74.x.IIll.IIIIlII(var1, var2)) {
            this.Ill = null;
            return true;
         } else {
            if (this.Ill == null || this.Ill.III() != var2) {
               this.Ill = k74.x.IIll.llII(var1, this, var2, 0, true);
            }

            if (!k74.x.IIll.IIIllII(var1, this.Ill)) {
               return false;
            } else {
               this.Ill = null;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private boolean IIIlI(class_310 var1, class_1309 var2) {
      return var2 instanceof class_1657 && var2 != var1.field_1724 && var2.method_5805() && this.IllIl(var1, var2) && this.lIlIl(var1, var2);
   }

   private void IIIll() {
      this.IIlII = null;
      this.IIIlll = null;
      this.IlIIl = null;
      this.llIII = 0.0F;
      this.IIIl = 0.0F;
   }

   public boolean IIlII(class_1309 var1) {
      return var1 != null && this.Illl == var1 && this.lIIll != IIIlIll.Il;
   }

   private static int IlIllI(int var0, int var1) {
      int var2 = IIlllI[var0 ^ 566834682] ^ var1 ^ var0;
      var2 -= 12246;
      var2 += 105;
      var2 -= 22585;
      var2 -= 44880;
      var2 += 11794;
      var2 ^= 6501;
      var2 ^= 16094;
      var2 ^= 29247;
      var2 ^= 37333;
      return var2 ^ 42413;
   }

   private static String IIllI(int var0, int var1) {
      int var9 = 1340403393;
      int var2 = (var0 ^ IlIllI(566834604, var9 ^ -139444497)) & IlIllI(566834605, var9 ^ -2103403109);
      if (IIII[var2] == null) {
         char[] var3 = llII[var2].toCharArray();

         int var4 = switch (var3[0] & IlIllI(566834594, var9 ^ -2101209651)) {
            case 0 -> IlIllI(566834595, var9 ^ -1481154240);
            case 1 -> IlIllI(566834592, var9 ^ 206408075);
            case 2 -> IlIllI(566834593, var9 ^ 753025867);
            case 3 -> IlIllI(566834598, var9 ^ 934020328);
            case 4 -> IlIllI(566834599, var9 ^ 2095447007);
            case 5 -> IlIllI(566834596, var9 ^ -37636302);
            case 6 -> IlIllI(566834597, var9 ^ 2069292274);
            case 7 -> IlIllI(566834586, var9 ^ 1590228934);
            case 8 -> IlIllI(566834587, var9 ^ -549566768);
            case 9 -> IlIllI(566834584, var9 ^ -1103946402);
            case 10 -> IlIllI(566834585, var9 ^ 1510257231);
            case 11 -> IlIllI(566834590, var9 ^ 2053912364);
            case 12 -> IlIllI(566834591, var9 ^ 902280293);
            case 13 -> IlIllI(566834588, var9 ^ -1487254864);
            case 14 -> IlIllI(566834589, var9 ^ 1568541439);
            case 15 -> IlIllI(566834578, var9 ^ 1205728574);
            case 16 -> IlIllI(566834579, var9 ^ 404203544);
            case 17 -> IlIllI(566834576, var9 ^ 1665222701);
            case 18 -> IlIllI(566834577, var9 ^ -1904783692);
            case 19 -> IlIllI(566834582, var9 ^ -1357150129);
            case 20 -> IlIllI(566834583, var9 ^ 152116319);
            case 21 -> IlIllI(566834580, var9 ^ 991811639);
            case 22 -> IlIllI(566834581, var9 ^ -1894654573);
            case 23 -> IlIllI(566834570, var9 ^ -1419205013);
            case 24 -> IlIllI(566834571, var9 ^ 1256322559);
            case 25 -> IlIllI(566834568, var9 ^ 351607925);
            case 26 -> IlIllI(566834569, var9 ^ -2109825174);
            case 27 -> IlIllI(566834574, var9 ^ 481462456);
            case 28 -> IlIllI(566834575, var9 ^ 534666247);
            case 29 -> IlIllI(566834572, var9 ^ 690728502);
            case 30 -> IlIllI(566834573, var9 ^ 661803558);
            case 31 -> IlIllI(566834562, var9 ^ 1180858740);
            case 32 -> IlIllI(566834563, var9 ^ 1128231899);
            case 33 -> IlIllI(566834560, var9 ^ -1325258322);
            case 34 -> IlIllI(566834561, var9 ^ 177500722);
            case 35 -> IlIllI(566834566, var9 ^ 1562330915);
            case 36 -> IlIllI(566834567, var9 ^ 1023556667);
            case 37 -> IlIllI(566834564, var9 ^ 1576669866);
            case 38 -> IlIllI(566834565, var9 ^ -818854894);
            case 39 -> IlIllI(566834554, var9 ^ -1674890679);
            case 40 -> IlIllI(566834555, var9 ^ 2037324404);
            case 41 -> IlIllI(566834552, var9 ^ -2012340972);
            case 42 -> IlIllI(566834553, var9 ^ -9914225);
            case 43 -> IlIllI(566834558, var9 ^ 352277119);
            case 44 -> IlIllI(566834559, var9 ^ -1256634646);
            case 45 -> IlIllI(566834556, var9 ^ 601385257);
            case 46 -> IlIllI(566834557, var9 ^ -1029218520);
            case 47 -> IlIllI(566834546, var9 ^ -255181705);
            case 48 -> IlIllI(566834547, var9 ^ 46941115);
            case 49 -> IlIllI(566834544, var9 ^ -1430980099);
            case 50 -> IlIllI(566834545, var9 ^ -47035205);
            case 51 -> IlIllI(566834550, var9 ^ 214033803);
            case 52 -> IlIllI(566834551, var9 ^ 86091735);
            case 53 -> IlIllI(566834548, var9 ^ 519754504);
            case 54 -> IlIllI(566834549, var9 ^ 808452470);
            case 55 -> IlIllI(566834538, var9 ^ 531036596);
            case 56 -> IlIllI(566834539, var9 ^ -656874880);
            case 57 -> IlIllI(566834536, var9 ^ -368306062);
            case 58 -> IlIllI(566834537, var9 ^ -430044081);
            case 59 -> IlIllI(566834542, var9 ^ -1721037990);
            case 60 -> IlIllI(566834543, var9 ^ -2020862143);
            case 61 -> IlIllI(566834540, var9 ^ 504702140);
            case 62 -> IlIllI(566834541, var9 ^ -1015826529);
            case 63 -> 5;
            case 64 -> IlIllI(566834530, var9 ^ 856840181);
            case 65 -> IlIllI(566834531, var9 ^ -87729490);
            case 66 -> IlIllI(566834528, var9 ^ 714366136);
            case 67 -> IlIllI(566834529, var9 ^ 785574792);
            case 68 -> IlIllI(566834534, var9 ^ 763727480);
            case 69 -> IlIllI(566834535, var9 ^ 655966403);
            case 70 -> IlIllI(566834532, var9 ^ -1948325852);
            case 71 -> IlIllI(566834533, var9 ^ 1401859712);
            case 72 -> IlIllI(566834522, var9 ^ -582512861);
            case 73 -> IlIllI(566834523, var9 ^ 384351591);
            case 74 -> IlIllI(566834520, var9 ^ -277767891);
            case 75 -> IlIllI(566834521, var9 ^ 1094223549);
            case 76 -> IlIllI(566834526, var9 ^ 1904445132);
            case 77 -> IlIllI(566834527, var9 ^ 1637628894);
            case 78 -> IlIllI(566834524, var9 ^ -1421334253);
            case 79 -> 3;
            case 80 -> IlIllI(566834525, var9 ^ 2046925139);
            case 81 -> IlIllI(566834514, var9 ^ -1665989961);
            case 82 -> IlIllI(566834515, var9 ^ 1831718406);
            case 83 -> IlIllI(566834512, var9 ^ -277905694);
            case 84 -> IlIllI(566834513, var9 ^ -41738544);
            case 85 -> IlIllI(566834518, var9 ^ -1018501138);
            case 86 -> 1;
            case 87 -> IlIllI(566834519, var9 ^ -61455272);
            case 88 -> IlIllI(566834516, var9 ^ 587455433);
            case 89 -> IlIllI(566834517, var9 ^ -1046846069);
            case 90 -> IlIllI(566834506, var9 ^ -20794228);
            case 91 -> IlIllI(566834507, var9 ^ -1838196670);
            case 92 -> IlIllI(566834504, var9 ^ -639017661);
            case 93 -> IlIllI(566834505, var9 ^ 1754440072);
            case 94 -> IlIllI(566834510, var9 ^ -336520575);
            case 95 -> IlIllI(566834511, var9 ^ -2136725796);
            case 96 -> IlIllI(566834508, var9 ^ -1581764831);
            case 97 -> IlIllI(566834509, var9 ^ -280856221);
            case 98 -> IlIllI(566834498, var9 ^ -1646407041);
            case 99 -> 0;
            case 100 -> IlIllI(566834499, var9 ^ -1535373159);
            case 101 -> IlIllI(566834496, var9 ^ 49433783);
            case 102 -> IlIllI(566834497, var9 ^ 1410571883);
            case 103 -> IlIllI(566834502, var9 ^ -336337552);
            case 104 -> IlIllI(566834503, var9 ^ -1300899509);
            case 105 -> IlIllI(566834500, var9 ^ 2066611009);
            case 106 -> IlIllI(566834501, var9 ^ 961221673);
            case 107 -> IlIllI(566834490, var9 ^ 513284279);
            case 108 -> IlIllI(566834491, var9 ^ -1427088722);
            case 109 -> IlIllI(566834488, var9 ^ -781861537);
            case 110 -> IlIllI(566834489, var9 ^ 523136835);
            case 111 -> IlIllI(566834494, var9 ^ 394142143);
            case 112 -> IlIllI(566834495, var9 ^ -851065028);
            case 113 -> IlIllI(566834492, var9 ^ -43377500);
            case 114 -> IlIllI(566834493, var9 ^ 1613056059);
            case 115 -> IlIllI(566834482, var9 ^ -1479761197);
            case 116 -> IlIllI(566834483, var9 ^ -131646163);
            case 117 -> IlIllI(566834480, var9 ^ 1140320365);
            case 118 -> IlIllI(566834481, var9 ^ -1418945343);
            case 119 -> IlIllI(566834486, var9 ^ -1441229100);
            case 120 -> IlIllI(566834487, var9 ^ 498279669);
            case 121 -> IlIllI(566834484, var9 ^ -256823674);
            case 122 -> IlIllI(566834485, var9 ^ -1454457333);
            case 123 -> IlIllI(566834474, var9 ^ -1848727776);
            case 124 -> IlIllI(566834475, var9 ^ 1263709843);
            case 125 -> IlIllI(566834472, var9 ^ -1982752107);
            case 126 -> IlIllI(566834473, var9 ^ -2107702708);
            case 127 -> IlIllI(566834478, var9 ^ -277403702);
            case 128 -> IlIllI(566834479, var9 ^ 1525614077);
            case 129 -> IlIllI(566834476, var9 ^ 672701408);
            case 130 -> IlIllI(566834477, var9 ^ 697066806);
            case 131 -> IlIllI(566834466, var9 ^ -1401139016);
            case 132 -> IlIllI(566834467, var9 ^ -459974948);
            case 133 -> IlIllI(566834464, var9 ^ -376611443);
            case 134 -> IlIllI(566834465, var9 ^ 1803624093);
            case 135 -> IlIllI(566834470, var9 ^ -1316954242);
            case 136 -> IlIllI(566834471, var9 ^ 1053636706);
            case 137 -> IlIllI(566834468, var9 ^ -730645968);
            case 138 -> IlIllI(566834469, var9 ^ 484718529);
            case 139 -> IlIllI(566834458, var9 ^ -1092210533);
            case 140 -> IlIllI(566834459, var9 ^ 1531148029);
            case 141 -> IlIllI(566834456, var9 ^ -248412609);
            case 142 -> IlIllI(566834457, var9 ^ -1284054062);
            case 143 -> IlIllI(566834462, var9 ^ -1522895391);
            case 144 -> IlIllI(566834463, var9 ^ -1504029964);
            case 145 -> IlIllI(566834460, var9 ^ 1445377972);
            case 146 -> IlIllI(566834461, var9 ^ -1726936903);
            case 147 -> IlIllI(566834450, var9 ^ 227788130);
            case 148 -> IlIllI(566834451, var9 ^ -71630272);
            case 149 -> IlIllI(566834448, var9 ^ -750459768);
            case 150 -> IlIllI(566834449, var9 ^ 1189572704);
            case 151 -> IlIllI(566834454, var9 ^ -912132462);
            case 152 -> IlIllI(566834455, var9 ^ 58797084);
            case 153 -> IlIllI(566834452, var9 ^ 607222123);
            case 154 -> IlIllI(566834453, var9 ^ -476165566);
            case 155 -> 4;
            case 156 -> IlIllI(566834442, var9 ^ 1072216777);
            case 157 -> IlIllI(566834443, var9 ^ -591569233);
            case 158 -> IlIllI(566834440, var9 ^ -153287395);
            case 159 -> IlIllI(566834441, var9 ^ -353896336);
            case 160 -> IlIllI(566834446, var9 ^ 1059671392);
            case 161 -> IlIllI(566834447, var9 ^ 66659701);
            case 162 -> IlIllI(566834444, var9 ^ -393173880);
            case 163 -> IlIllI(566834445, var9 ^ -1695913977);
            case 164 -> IlIllI(566834434, var9 ^ -1415557025);
            case 165 -> IlIllI(566834435, var9 ^ 1416818392);
            case 166 -> IlIllI(566834432, var9 ^ -2110555017);
            case 167 -> IlIllI(566834433, var9 ^ 727809615);
            case 168 -> IlIllI(566834438, var9 ^ -319180592);
            case 169 -> IlIllI(566834439, var9 ^ 1956214197);
            case 170 -> IlIllI(566834436, var9 ^ -1284032751);
            case 171 -> IlIllI(566834437, var9 ^ 1868397187);
            case 172 -> IlIllI(566834426, var9 ^ 1195115744);
            case 173 -> IlIllI(566834427, var9 ^ -252576267);
            case 174 -> IlIllI(566834424, var9 ^ -300513195);
            case 175 -> IlIllI(566834425, var9 ^ 1064165762);
            case 176 -> IlIllI(566834430, var9 ^ -940057663);
            case 177 -> IlIllI(566834431, var9 ^ 1693105635);
            case 178 -> IlIllI(566834428, var9 ^ 1183602444);
            case 179 -> IlIllI(566834429, var9 ^ -1332518428);
            case 180 -> IlIllI(566834418, var9 ^ -986045434);
            case 181 -> IlIllI(566834419, var9 ^ -1462385760);
            case 182 -> IlIllI(566834416, var9 ^ -705258122);
            case 183 -> IlIllI(566834417, var9 ^ 1893920704);
            case 184 -> IlIllI(566834422, var9 ^ -1118189364);
            case 185 -> IlIllI(566834423, var9 ^ -188852439);
            case 186 -> IlIllI(566834420, var9 ^ -1521319181);
            case 187 -> IlIllI(566834421, var9 ^ 1505980426);
            case 188 -> IlIllI(566834410, var9 ^ 1258958802);
            case 189 -> IlIllI(566834411, var9 ^ -155109062);
            case 190 -> IlIllI(566834408, var9 ^ -1047979442);
            case 191 -> IlIllI(566834409, var9 ^ -560143649);
            case 192 -> IlIllI(566834414, var9 ^ 142187746);
            case 193 -> IlIllI(566834415, var9 ^ 2052109633);
            case 194 -> IlIllI(566834412, var9 ^ 1693619505);
            case 195 -> IlIllI(566834413, var9 ^ -516526417);
            case 196 -> IlIllI(566834402, var9 ^ 882194788);
            case 197 -> IlIllI(566834403, var9 ^ 951989623);
            case 198 -> IlIllI(566834400, var9 ^ 1172237691);
            case 199 -> IlIllI(566834401, var9 ^ -1110593205);
            case 200 -> IlIllI(566834406, var9 ^ -1211003325);
            case 201 -> IlIllI(566834407, var9 ^ -1426725352);
            case 202 -> IlIllI(566834404, var9 ^ 879443437);
            case 203 -> IlIllI(566834405, var9 ^ -839569916);
            case 204 -> IlIllI(566834394, var9 ^ 824898486);
            case 205 -> IlIllI(566834395, var9 ^ 1173357794);
            case 206 -> IlIllI(566834392, var9 ^ -1892854553);
            case 207 -> IlIllI(566834393, var9 ^ 1876280267);
            case 208 -> IlIllI(566834398, var9 ^ 2133690026);
            case 209 -> IlIllI(566834399, var9 ^ 1103437956);
            case 210 -> IlIllI(566834396, var9 ^ -294158944);
            case 211 -> IlIllI(566834397, var9 ^ 542516607);
            case 212 -> IlIllI(566834386, var9 ^ -1734176699);
            case 213 -> IlIllI(566834387, var9 ^ -259573064);
            case 214 -> IlIllI(566834384, var9 ^ 898634266);
            case 215 -> IlIllI(566834385, var9 ^ -250204630);
            case 216 -> IlIllI(566834390, var9 ^ 406032338);
            case 217 -> 2;
            case 218 -> IlIllI(566834391, var9 ^ 874147805);
            case 219 -> IlIllI(566834388, var9 ^ -1609471376);
            case 220 -> IlIllI(566834389, var9 ^ 681352840);
            case 221 -> IlIllI(566834378, var9 ^ -554512555);
            case 222 -> IlIllI(566834379, var9 ^ 1896519479);
            case 223 -> IlIllI(566834376, var9 ^ -229553346);
            case 224 -> IlIllI(566834377, var9 ^ 1610654902);
            case 225 -> IlIllI(566834382, var9 ^ 268006284);
            case 226 -> IlIllI(566834383, var9 ^ -422363084);
            case 227 -> IlIllI(566834380, var9 ^ -913761014);
            case 228 -> IlIllI(566834381, var9 ^ -1507353074);
            case 229 -> IlIllI(566834370, var9 ^ -235162940);
            case 230 -> IlIllI(566834371, var9 ^ -1094913720);
            case 231 -> IlIllI(566834368, var9 ^ 154043428);
            case 232 -> IlIllI(566834369, var9 ^ -2099168750);
            case 233 -> IlIllI(566834374, var9 ^ -2036447058);
            case 234 -> IlIllI(566834375, var9 ^ 202812075);
            case 235 -> IlIllI(566834372, var9 ^ -1273926292);
            case 236 -> IlIllI(566834373, var9 ^ -1573951651);
            case 237 -> IlIllI(566834362, var9 ^ -1279674709);
            case 238 -> IlIllI(566834363, var9 ^ -1993160421);
            case 239 -> IlIllI(566834360, var9 ^ 324219430);
            case 240 -> IlIllI(566834361, var9 ^ 1627553559);
            case 241 -> IlIllI(566834366, var9 ^ -1267435476);
            case 242 -> IlIllI(566834367, var9 ^ -68716802);
            case 243 -> IlIllI(566834364, var9 ^ -999483280);
            case 244 -> IlIllI(566834365, var9 ^ -1470919708);
            case 245 -> IlIllI(566834354, var9 ^ -1193156309);
            case 246 -> IlIllI(566834355, var9 ^ 1212123953);
            case 247 -> IlIllI(566834352, var9 ^ -498952395);
            case 248 -> IlIllI(566834353, var9 ^ 597637705);
            case 249 -> IlIllI(566834358, var9 ^ 1593873591);
            case 250 -> IlIllI(566834359, var9 ^ -1719205770);
            case 251 -> IlIllI(566834356, var9 ^ 1792100268);
            case 252 -> IlIllI(566834357, var9 ^ 1447836476);
            case 253 -> IlIllI(566834346, var9 ^ -1891323895);
            case 254 -> IlIllI(566834347, var9 ^ 1023695420);
            default -> IlIllI(566834344, var9 ^ 1112056522);
         };
         int var5 = (var1 & IlIllI(566834345, var9 ^ -1991628746)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IlIllI(566834350, var9 ^ 742713745)) >>> IlIllI(566834351, var9 ^ 1851836934)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IlIllI(566834348, var9 ^ -262584489);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IlIllI(566834349, var9 ^ -1230335593);
            }
         }

         IIII[var2] = new String(var3).intern();
      }

      return IIII[var2];
   }

   private boolean IIlll(class_310 var1, class_1309 var2) {
      if (var1 == null || var1.field_1724 == null || var1.field_1761 == null || var1.method_1562() == null || var2 == null) {
         return false;
      } else if (k74.x.IIll.IIlllIl() || lIIIllII.ll(var1)) {
         return false;
      } else if (k74.x.IIll.lIIIll(var1, var2)) {
         return false;
      } else {
         class_3966 var3 = this.lII(var1, var2);
         if (var3 == null) {
            return false;
         } else {
            k74.x.IIll.IlIlI(true);
            k74.x.IIll.IlI();

            boolean var5;
            try {
               k74.x.IIll.IIlIlIl(var1);
               boolean var4 = k74.x.IIll.lIlIIl(var1, var3);
               if (var4) {
                  this.IlIlI = System.currentTimeMillis();
                  this.II = var2.method_5628();
               }

               var5 = var4;
            } finally {
               k74.x.IIll.lIl();
               k74.x.IIll.IlIlI(false);
            }

            return var5;
         }
      }
   }

   private boolean IllII(class_310 var1) {
      if (var1 != null && var1.field_1724 != null && this.IIIlII >= 0 && this.IIIlII < IlIllI(566834338, 459983564 ^ 788230960)) {
         this.Il(System.currentTimeMillis());
         return !this.IIllIl(var1);
      } else {
         return true;
      }
   }

   private boolean IllIl(class_310 var1, class_1309 var2) {
      if (var1 != null && var1.field_1724 != null && var2 != null) {
         class_243 var3 = var1.field_1724.method_33571();
         class_238 var4 = var2.method_5829();
         double var5 = Math.max(var4.field_1323, Math.min(var3.field_1352, var4.field_1320));
         double var7 = Math.max(var4.field_1322, Math.min(var3.field_1351, var4.field_1325));
         double var9 = Math.max(var4.field_1321, Math.min(var3.field_1350, var4.field_1324));
         if (var3.method_1028(var5, var7, var9) > 9.0) {
            return false;
         } else {
            class_3966 var11 = k74.x.IIll.lIlll(var1, 3.0);
            return var11 != null && var11.method_17782() == var2 && var3.method_1025(var11.method_17784()) <= 9.0;
         }
      } else {
         return false;
      }
   }

   private boolean IlllI(class_310 var1, int var2, class_3965 var3, class_3965 var4) {
      if (this.IIIIlIl() && this.lIIll == IIIlIll.IIl && this.IlIIl == var3) {
         this.IlI = false;
         if (this.IlIlII(var1, var4)
            && IlllIlII.IlIll(var1, var4, true)
            && var1.field_1724.method_31548().method_5438(var2).method_31574(class_1802.field_8786)) {
            boolean var5 = k74.x.IIll.lllIII(var1, this, var2, this::lIlII);
            if (var5) {
               this.IIlIll++;
            } else {
               this.lllII();
               this.IIIlIl = System.currentTimeMillis() + 50L;
            }

            return var5;
         } else {
            this.IIIlIl = System.currentTimeMillis() + 50L;
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean Illll(class_310 var1) {
      return var1 != null && var1.field_1724 != null ? k74.x.IIll.IIlI(var1.field_1724) : true;
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      this.IIllIl(var1);
      if (this.lIl.IllI() == llIlllII.l && this.lIIll == IIIlIll.Il && !this.IIlIIl && this.IIIIII(var1)) {
         class_3966 var2 = k74.x.IIll.lIlll(var1, 3.0);
         class_1309 var3 = k74.x.IIll.llIlll(var1, var2);
         if (this.III(var1, var3) && !this.lI(var1, var3)) {
            int var4 = this.llIII(var1);
            if (var4 != -1) {
               this.IIIl(var1, var3, var4);
            }
         }
      }

      if (this.IIlIIl) {
         if (!this.IlIl(var1)) {
            this.IlIIll(var1);
         } else {
            if (System.currentTimeMillis() >= this.lIllI) {
               this.IlIlIl(var1);
            }
         }
      }
   }

   private llIlIlII lIIII(class_310 var1, class_1309 var2) {
      if (this.IIIllI.IllI()) {
         llIlIlII var3 = this.lIIl(var1, this.l(var1, var2));
         if (var3 != null) {
            return var3;
         }
      }

      return this.lIIl(var1, List.of(var2.method_24515()));
   }

   private class_243 lIIIl(class_310 var1, class_1309 var2) {
      float var3 = this.IIllII == var2.method_5628() ? this.lllIl : var1.field_1724.method_36454();
      float var4 = (float)Math.toRadians(var3);
      class_243 var5 = new class_243(-Math.sin(var4), 0.0, Math.cos(var4));
      class_243 var6 = new class_243(var2.method_23317() - var1.field_1724.method_23317(), 0.0, var2.method_23321() - var1.field_1724.method_23321());
      if (var5.method_1027() < 1.0E-6) {
         return var6.method_1027() < 1.0E-6 ? class_243.field_1353 : var6.method_1029();
      } else {
         var5 = var5.method_1029();
         return var6.method_1027() > 1.0E-6 && var5.method_1026(var6.method_1029()) <= 0.0 ? var6.method_1029() : var5;
      }
   }

   public boolean lIIlI(class_310 var1, class_1309 var2) {
      if (!this.IIIIII(var1) || !this.III(var1, var2)) {
         return false;
      } else if (this.lI(var1, var2)) {
         return false;
      } else {
         int var3 = this.llIII(var1);
         return var3 != -1 ? this.IIIl(var1, var2, var3) : false;
      }
   }

   @Override
   public void llIl() {
      this.llIll(class_310.method_1551());
      this.Illll.lIIl();
   }

   private long lIIll(lIlllIl var1) {
      double var4 = var1.IIlI();
      double var2;
      return var4 == (var2 = var1.IlI()) ? Math.max(0L, Math.round(var4)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var4, var2)));
   }

   private boolean lIlII(class_3965 var1, class_310 var2) {
      this.llIlI = var1.method_17777().method_10093(var1.method_17780()).method_10062();
      this.IIIII = var2.field_1687;
      this.IIllIl = var2.field_1724.field_6012 + IlIllI(566834339, -1694522326 ^ 404889249);
      this.IIIIIl = false;
      this.IlII = false;
      return k74.x.IIll.IlIIII(var2, var1);
   }

   private boolean lIlIl(class_310 var1, class_1309 var2) {
      if (var1 != null && var1.field_1724 != null && var2 != null) {
         class_243 var3 = var2.method_5828(1.0F);
         class_243 var4 = new class_243(var3.field_1352, 0.0, var3.field_1350);
         class_243 var5 = new class_243(
            var1.field_1724.method_23317() - var2.method_23317(),
            var1.field_1724.method_23318() - var2.method_23318(),
            var1.field_1724.method_23321() - var2.method_23321()
         );
         class_243 var6 = new class_243(var5.field_1352, 0.0, var5.field_1350);
         return !(var4.method_1027() < 1.0E-6) && !(var6.method_1027() < 1.0E-6) ? var4.method_1029().method_1026(var6.method_1029()) > 0.0 : true;
      } else {
         return false;
      }
   }

   private static boolean lIllI() {
      return true;
   }

   @Override
   public void llIIII(class_310 var1) {
      this.IIllIl(var1);
      if (this.IIlIIl) {
         if (!this.IlIl(var1)) {
            this.IlIIll(var1);
         } else {
            if (System.currentTimeMillis() >= this.lIllI) {
               this.IlIlIl(var1);
            }
         }
      }
   }

   private void lIlll(class_310 var1, class_2338 var2, class_2680 var3) {
      if (this.IIIIlIl() && var1 != null && var1.field_1687 == this.IIIII && this.llIlI != null && var3 != null) {
         this.I(var2, var3.method_27852(class_2246.field_10343));
      }
   }

   private int llIII(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         for (int var2 = 0; var2 < IlIllI(566834336, 1555874792 ^ -1708039032); var2++) {
            class_1799 var3 = var1.field_1724.method_31548().method_5438(var2);
            if (var3.method_7909() instanceof class_1743) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private void llIIl(class_310 var1, long var2) {
      if (!this.IIIlI(var1, this.Illl)) {
         this.IIIlII(var2);
      } else if (!k74.x.IIll.lIIIll(var1, this.Illl)) {
         if (var2 - this.IllIl > 1200L) {
            this.IIIlII(var2);
         } else if (k74.x.IIll.IIlI(this.Illl)) {
            if (this.IIlIII == 0L && var2 - this.IllIl < 175L) {
               this.IIIlIl = var2;
            } else {
               this.IIIlII(var2);
            }
         } else if (this.IIlIII == 0L) {
            this.IIlIII = var2;
            this.IIIlIl = var2;
         } else if (var2 - this.IIlIII < 25L) {
            this.IIIlIl = var2;
         } else if (k74.x.IIll.IIlI(this.Illl)) {
            this.IIIlII(var2);
         } else if (!this.IIIIl(var1, this.llIIl)) {
            this.IIIlIl = var2;
         } else if (this.IIlll(var1, this.Illl)) {
            if (var1.field_1724 != null) {
               this.llI = var1.field_1724.field_6012;
            }

            if (this.IIlll.IllI()) {
               this.lllIl(var1, this.Illl, var2);
            } else {
               this.IIIlII(var2);
            }
         } else {
            this.IIIlIl = var2;
         }
      }
   }

   public boolean llIlI(class_1309 var1) {
      return var1 != null && this.Illl == var1 && (this.lIIll == IIIlIll.Ill || this.lIIll == IIIlIll.IlI);
   }

   private void llIll(class_310 var1) {
      this.IlIIll(var1);
   }

   private void lllII() {
      this.llIlI = null;
      this.IIIII = null;
      this.IIllIl = IlIllI(566834337, -1388219513 ^ 930293344);
      this.IIIIIl = false;
      this.IlII = false;
   }

   private void lllIl(class_310 var1, class_1309 var2, long var3) {
      if (this.IIlll.IllI() && var1 != null && var1.field_1724 != null && var2 != null && var2.method_5805() && !k74.x.IIll.lIllIl(var2) && this.IIIlll()) {
         int var5 = this.IIIllI(var1);
         if (var5 < 0) {
            this.IIIlII(var3);
         } else {
            this.IIlI();
            this.Illl = var2;
            this.lIIlI = var5;
            this.IIllII = var2.method_5628();
            this.lllIl = var1.field_1724.method_36454();
            this.lIlI = class_243.field_1353;
            this.IIll = IlIllI(566834342, 1825383697 ^ -27763799);
            llIlIlII var6 = this.lIIII(var1, var2);
            if (var6 == null) {
               this.IIIll();
               this.IIIlII(var3);
            } else {
               this.IIlII = var6.I();
               this.IIIlll = var6.Il();
               this.IlIIl = var6.l();
               if (this.IIIll.IllI()) {
                  this.Il(var3);
               } else {
                  k74.x.IIll.lllIl(var1, this, lllIII.I);
               }

               this.Ill = null;
               boolean var7 = k74.x.IIll.lIIlI(var1) != var5;
               this.lIIll = var7 ? IIIlIll.lI : IIIlIll.III;
               this.IllIl = var3;
               this.IIIlIl = var3 + this.lIIll(this.IlIII);
            }
         }
      } else {
         this.IIIlII(var3);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -381533003;
      int var14 = "ǥ\uf8bc뼹ﮅ㾕辶罄璉뼲﨣\ufff5龍㼬\uf821뾫臘㽁\uf8c0뼻珞㿥פּ㼈蘆ﾒﮚ뽚識㼬ײַ\ufff4\uf8e8뼛\uf8e9뾾ﬆ뽎\uf8b4缔\uf817뿖פּ／ﮉ㾳ﮢ罁\uf8ec뼺僚\uffc9屮缫調ﾣ臘뽙梅Ｐ喇\ufff8樂缩ﯹﾜ辶｢塞缞\ufbc7ￔ怒Ｓ囹뾦殺ｕ穀㼦屢뿆ﯬ뼧龎羈搜㽳\uf88c缁屢뿗\ufb1c뼿嵐羓ﯖ뽗שּׁ㼠ײַ㿣煮缫殮羒烙㽷直㼛ﯛ㿎ﭐ뼩\uf809ﾃ\uf8e2｟\ufb18㼈亂ￅ\uf888㼇鈴뾫燐㽱滛뼆\ufbc3\uffc9\uf838＂\ufb11羕\uf886뽥\uf800뼡ﭻ\ufff0煮编\uf881뾉惘｣\uf8a8㼘ﭯ㿍\ufb10Ｙ蓮㾥\uf822罨\uf88c㼦\uf81b뿠社㼔鈴羫吏ｾ林뼓禎￪ﯬ０ﬅ뾗索㽺裂뼻嘆翬怜㼇缾뾈ﭖ～醙㼝絛㿂\uf8e0缁\uf8e5ﾁ祈㽥郎㼴\uf8df翡呂㼘\uf879ﾔ既ｪﬀ缉\uf8cf㿂\uf838뼤僧㾤ﮖ罜濾Ａ\uf8eb㿌ﮔ缐ﮍ㾫גּ㽭祿㼉\uf8cb翡倫㼹\uf8c1㾃晴㽨ﭰ㼶漢㿈\uf828뼼祝羘祥뽯ﭨ뼁\uf8d7뿖בֿ㼜\uf819뾘艹ｋ\ufb1c㼣\ufafbￗﬔ缏\uf821뾄ﭢ㽦呂缳\ufae7\uffdf褐㼞契羒\ufb0aｸ敖㼩遼㿛聆缲\uf865뾙ﭦ㽌龍Ｒ𢡊㿦ﯘ뼃\ufaf9㾈זּ㽻賓뼄\uf8af㿢ﬨ㼜\uf81d뾪\ufaea뽎窱Ｋ麟ￓﯔ缱龎㾎喙뽣褐缔懲뿉ﭜ％淚뾑既㽂敖뼝\uf84f翶林㼉視뾑ﭺ뽔ﮌ뼩\uf80b뿀\uf8b0＄\uf8d5羢𥳐㽮\ufb1c뼵𢡊뿦𢡄／\uf89dﾒﬂｷ濾뼺\uf88f㿏ﮈ缭諾羁索罂\uf804缥嗢뿡ﯔ뼐\uf819뾶惘뽒\ufaf4뼞ﮯ뿞藺㼉\uf8ed㾡תּｋ\ufbcc뼔靈뿁充㼖יִ㾋練罵祖缐福뿄ﮤ－\uf8b5羸\ufbce罾ﮠ뼟龜뿡\uf838㼧\uf809羃復罻﮸뼋\uf877翓\uf8e0㼔ﯵ뾱廬罃宅뼘ﯫ뿍\ufaf8＄暈ﾤ\uf8ca罾ﬀ缀ﯧￇ宅＾什뾙ﬖ网\uf8f8缤麟뿆\ufb10뼴諾ﾾ異ｔ\uf8c0㼞\uf8f7㿞令＝\uf819뾈\uf842㽧鹿뼲盛\uffd8林Ｄ調㾃駱ｰ\uf88c＿著\ufff8喝뼓ﮩ뾛ﮎ\u001d뎲鮍뀓ᬱ늈ᯃ닺\udbb6끩\udb7c덊审눳\udb24냄鯰뀞ᮏ눽孓놚ᮅ놛嬏돸\udbff놪\udb99뉩"
         .length();
      int var16 = 0;
      short var18 = 11707;
      int var17 = 0;
      String[] var15 = new String[2];
      String var13 = "ǥ\uf8bc뼹ﮅ㾕辶罄璉뼲﨣\ufff5龍㼬\uf821뾫臘㽁\uf8c0뼻珞㿥פּ㼈蘆ﾒﮚ뽚識㼬ײַ\ufff4\uf8e8뼛\uf8e9뾾ﬆ뽎\uf8b4缔\uf817뿖פּ／ﮉ㾳ﮢ罁\uf8ec뼺僚\uffc9屮缫調ﾣ臘뽙梅Ｐ喇\ufff8樂缩ﯹﾜ辶｢塞缞\ufbc7ￔ怒Ｓ囹뾦殺ｕ穀㼦屢뿆ﯬ뼧龎羈搜㽳\uf88c缁屢뿗\ufb1c뼿嵐羓ﯖ뽗שּׁ㼠ײַ㿣煮缫殮羒烙㽷直㼛ﯛ㿎ﭐ뼩\uf809ﾃ\uf8e2｟\ufb18㼈亂ￅ\uf888㼇鈴뾫燐㽱滛뼆\ufbc3\uffc9\uf838＂\ufb11羕\uf886뽥\uf800뼡ﭻ\ufff0煮编\uf881뾉惘｣\uf8a8㼘ﭯ㿍\ufb10Ｙ蓮㾥\uf822罨\uf88c㼦\uf81b뿠社㼔鈴羫吏ｾ林뼓禎￪ﯬ０ﬅ뾗索㽺裂뼻嘆翬怜㼇缾뾈ﭖ～醙㼝絛㿂\uf8e0缁\uf8e5ﾁ祈㽥郎㼴\uf8df翡呂㼘\uf879ﾔ既ｪﬀ缉\uf8cf㿂\uf838뼤僧㾤ﮖ罜濾Ａ\uf8eb㿌ﮔ缐ﮍ㾫גּ㽭祿㼉\uf8cb翡倫㼹\uf8c1㾃晴㽨ﭰ㼶漢㿈\uf828뼼祝羘祥뽯ﭨ뼁\uf8d7뿖בֿ㼜\uf819뾘艹ｋ\ufb1c㼣\ufafbￗﬔ缏\uf821뾄ﭢ㽦呂缳\ufae7\uffdf褐㼞契羒\ufb0aｸ敖㼩遼㿛聆缲\uf865뾙ﭦ㽌龍Ｒ𢡊㿦ﯘ뼃\ufaf9㾈זּ㽻賓뼄\uf8af㿢ﬨ㼜\uf81d뾪\ufaea뽎窱Ｋ麟ￓﯔ缱龎㾎喙뽣褐缔懲뿉ﭜ％淚뾑既㽂敖뼝\uf84f翶林㼉視뾑ﭺ뽔ﮌ뼩\uf80b뿀\uf8b0＄\uf8d5羢𥳐㽮\ufb1c뼵𢡊뿦𢡄／\uf89dﾒﬂｷ濾뼺\uf88f㿏ﮈ缭諾羁索罂\uf804缥嗢뿡ﯔ뼐\uf819뾶惘뽒\ufaf4뼞ﮯ뿞藺㼉\uf8ed㾡תּｋ\ufbcc뼔靈뿁充㼖יִ㾋練罵祖缐福뿄ﮤ－\uf8b5羸\ufbce罾ﮠ뼟龜뿡\uf838㼧\uf809羃復罻﮸뼋\uf877翓\uf8e0㼔ﯵ뾱廬罃宅뼘ﯫ뿍\ufaf8＄暈ﾤ\uf8ca罾ﬀ缀ﯧￇ宅＾什뾙ﬖ网\uf8f8缤麟뿆\ufb10뼴諾ﾾ異ｔ\uf8c0㼞\uf8f7㿞令＝\uf819뾈\uf842㽧鹿뼲盛\uffd8林Ｄ調㾃駱ｰ\uf88c＿著\ufff8喝뼓ﮩ뾛ﮎ\u001d뎲鮍뀓ᬱ늈ᯃ닺\udbb6끩\udb7c덊审눳\udb24냄鯰뀞ᮏ눽孓놚ᮅ놛嬏돸\udbff놪\udb99뉩";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 255;
               case 1 -> 131;
               case 2 -> 162;
               case 3 -> 12;
               case 4 -> 65;
            }) ^ var22;
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

      IIllll = var15;
      IlIIII = new Object[var15.length];
      int var9 = 627103682;
      byte[] var7 = "ÏBn\u0080x\u0099äÜ, \u001dægM\u0088ª\u0096FôE\u0005¥\u009c Ã\u000fÁmt\u0098\u00ad5:tgÈ\u0096tÿ!©\u009e\u0004L\u0082{Ó\u0010Öo=Ð \u0083z\n\u009cç\u0004\u0007ð«Ó'\u0014Ù|-Sçá\"\u0090CÎ}cR?EÖ\u009d5\bó!\u0007\u0018Ù\t<%\u0085\u0094hãÆÝís0Ìéõëêm½ò@e\u008fª¹°Ó¸ `aÔtB~)\r\u009fp£!\u0013zÝRxZ <zðY\u00ad\u0005\u0001\u001bA\u0097§BË\u0092Ö\u0011\"t¾Þ¦\u0082g£\u001f\u0007¾re\"²ôxº^j´\u0017¼äÌT\u0081 Ü\u0014\u0015\u0014\u0003Ç\u009a·^\u0094\u0005©HüÚ\u008a]ÍÕí\u0010\u0097\u0013°&Îs\u0080\u009cÈé.gÃ\u001aÁt¶YJ\u0012Óvb¡\u0010xî\u0094³4)AÕ\u001a¦\u008d%<î\u001e\u0018\u0014\u0011iÈ¥\u0015z%´ÎÄµ8^\"\u0082û\u0099bÜ>mJÁ\u0011ì\u0002Aî?U<pCÞ¨¤ý¶\u008dE5ËÔí×GÝÅZo¯BM\u000fv¼6)\u001bÉõvÁwø|\u0000yÏlk z0\u001b\u0091rèt3¡\u0001Á~³Å]ø¥ó%\u009dg\u008eË;\\^ç§¼ýö\u007fÉì7ÒÉ\u008ep\u008bìû\u0007\u0088G\u0001ìÎg®%¼|àbê7©\u009d\u001f¶\u008dÑ\u00940\u001a\u00825\u0015\u0084\u0091'\u0094r &õ\u007f{\u0007\u0011HÔ\u009f1 Q¥~\u008bÒ'ì\u0016,\u0016\u00162o\u0085\f\u0091\u0093\u001dS[ÎÖ(\r-FÅ;(\u0013äWî\tB]z¼pQ¾¨Ä]»Õà$Àu\u0001\u00ad\u0093\u0006_¹y\u0000Érù\u009cWþîKT\u0092:'bgÈ\u0002l>4\u0083\r.\u001c\u0001\bs\u0015gúNO©AØ\u0014k\u0016S\"TvNZé\u0016¶t½\u0084}\"\u0083×gTº2#|]ÃB{$´$Þ*_³4\u0099þU Äh\u0094\f¥\u0089ë9ö»\u0086YîI\u0080%qáø\u009f\t¶~*mG\u008d\u0083ÛNmÁØU¶¶\u0090{|g\u0002Tê\u009fÁ\u0093\u0094\u0084-¡@~ß\u00ad\u0012j|Ò'm2ÌÀq\u008eUYBë\u0088?Ñ x^2i±\u0089?4aØ:ÿe\u009e\u008d\u008afÉè\u0002lU&ÑÀ\u0092\u008eI\u0018ÂÈÅ\u0096\u000bé\u0017]¤Û\u001d¤=ÿe\ntã\u0010:ÏàY*Ð]Và\u0004O\u00101Müà×ÿd~&a¨Ä¤#\u0018ü¶Ï{t\u0088\u0006\u0081\u0085·\u001a\"ÃhO½Ø\u008aÖ\u0003Iµ\u008eÒLÙ#>z\u0092¥;F#ÞÇ¸ ½\u007f\"Ëè@ÊêôI,¤\u000e\u001f¬Ö\u0091´Wï0väI¾*Þ\u001f_øl ¿\u0083\u0002ù9¿z0a\u009d\rr\u0007r\u001cUÔ~\u0001á¼<U\u009a)ÛèTb\t9\\2GH\u0086\t¡I¶&y|+i.]ì\u0080ÄR³k[d\b»\u008eöà ù\u001fáTðÿVÿBk»ýH9â\u0002ØWÚ\u0082Á´\u0000\u001eÈ\u0095Â\u009dÿWÉ\u0013dÈ¤;AJ\u0011£cÌcTþ6bÀ\u0003³ç06ö¯Ù0\u008e¢Á;þ Íx»úÌ¹\u0014u\u0081]·\u009f?_ìW¨Q¸õªV¢\u0010\u000f\u0010cº}à#ø:\u0085aîv\u0013\u009bí\u00164Î\u001djÑ\u0082Ò]n\u008bFß£Ò°÷dÝ\u0098\b\u0082W\r«\u0016µ\u0082í\u0090úHÍJ»o}\u001fÂ¨Ò,ßt¤Üu\u0097ñ8¤½\u0091c§¡«\u009ecte+¸Hµ@\u008c£ÜÂ\u0087Ñ¦\u000eÈàì6Í\u001f>\u0088IÉ\u007f\u001aÌ`-\u0018}§µÖ\u0011?Õ\u0013\u0007ø;Q>$\u0011\u001fz\fpc\u0086»½\u009aÔ¥Zì^t!\u0086N\u008c»¼\u0083/¦Ú\u009a\rÀ0\\ûß\u0006\u0013\u008evC¿ã\u0099¤\u001c\u009eºú1;®\u0088\u0013ö\u0015¯÷¿ò0Ðî\u001eæï\u0012\u008f\u0017\u009f\u0000FHx½\u008d^\u0004\u008aÅ}¾\u0095Ð\u0085'C5ûª1\u001cÒ»/¾ò\u0004ªz\t\u008c\u007fÙ]`sòRû\u000e\u0092\u008a\u0002ö\u0081Öþü\u009détá¹\u0081¯\u007f'ZÊ\u0086¹Iúzf\u0094\\\u000e¼c\u008dÄa3C$\u0099¤e4aá\u001c\n\u0089Gc¥;\u001ask\u001aB\u001dÓîôh»Ë]þ~ÜuäºZIxS\u007fèF\u007fV\b\u0006ë]\rücÐùj\u0095¾¨\t:Fð]¹\u001d,-+LÃfDµ\u0014{\u00ad\u009f'×\u0082ÅzXíkùÿº·ÕÌõð\u00961BbãéÉ\u00ad]\u0097ÍÒ/åGZÍ\nÿ]\n2éc\u0000¼øõÑ\u0091Â~®tX\u001fUV*N\u0018\u009cÿ8\u001f\u000f°«\u0011ä\u008f!\u007fýã\u001fì\u001eó\u00ad\u0086Ç\u0003sì\u0091©\u000eðähÓ^\u0011\u0014Ló\u0004ÒËgÓ!\u009d \u0087\u001d\u0000\\\bÄ\b×ÆvH=\u0081\t\u0004Å5Â\u0006L{g\bBÛ%,\u00adr»\u0015#\u001fýæõÞ190E\u0086u3&Â%.Û\u001e\u009aÜd\u0016=÷<¾º\u0001\u0014;þiãc]\u001aì\u0017\u0087\fî0\u008b+\u009eËíû@!Yö\u0096"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IIlllI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IIlllI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[IlIllI(566834624, var23 ^ -995419795)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IlIlll(-81097839, var23 ^ 1525761947)).length();
      int var1 = IlIllI(566834625, var23 ^ 1265101146);
      int var25 = -1;

      label98:
      while (true) {
         int var28 = IlIllI(566834630, var23 ^ 66376764);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label93: {
               char[] var44 = var10001.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var28;
               var40 = var44;
               int var34 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var47 = var28;
                  var34 = var10004;
                  if (var10004 <= var6) {
                     break label93;
                  }

                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % IlIllI(566834618, var23 ^ -1278718231)) {
                     case 0 -> IlIllI(566834619, var23 ^ 1955074098);
                     case 1 -> IlIllI(566834616, var23 ^ -2136994475);
                     case 2 -> IlIllI(566834617, var23 ^ 32017822);
                     case 3 -> IlIllI(566834622, var23 ^ -759173078);
                     case 4 -> IlIllI(566834623, var23 ^ -1372298068);
                     case 5 -> IlIllI(566834620, var23 ^ 274481467);
                     default -> IlIllI(566834621, var23 ^ -668919650);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var34 <= var6) {
                        break;
                     }

                     var56 = var40;
                     var10004 = var47;
                     var10006 = var6;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var49;
                  if ((var25 += var1) >= var4) {
                     llII = var5;
                     IIII = new String[IlIllI(566834629, var23 ^ 590248266)];
                     llllI = IlIIllIII.Ill(IIllI(IlIllI(566834610, var23 ^ 984399660), IlIllI(566834611, var23 ^ -1215983714)));
                     llIll = IlIIllIII.Ill(IIllI(IlIllI(566834608, var23 ^ -1595665338), IlIllI(566834609, var23 ^ -608013708)));
                     IllI = IlIIllIII.Ill(IIllI(IlIllI(566834614, var23 ^ 412984217), IlIllI(566834615, var23 ^ 362202865)));
                     lllll = IlIIllIII.Ill(IIllI(IlIllI(566834612, var23 ^ 579275090), IlIllI(566834613, var23 ^ -1747241449)));
                     ll = List.of(new lIllll(IllI, IllI), new lIllll(lllll, lllll));
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var49;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label98;
                  }

                  var4 = (var2 = IlIlll(-81097840, var23 ^ -937491011)).length();
                  var1 = IlIllI(566834631, var23 ^ -58522431);
                  var25 = -1;
            }

            var28 = IlIllI(566834628, var23 ^ -124720703);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   public boolean llllI(class_1309 var1) {
      return k74.x.IIll.IIlI(var1);
   }

   private boolean lllll(class_310 var1) {
      return this.IIlll.IllI()
         && var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && this.lIIlI >= 0
         && this.lIIlI < IlIllI(566834343, 1100960544 ^ -74589304)
         && this.IIlII != null
         && this.IIIlll != null;
   }

   private boolean IIIIII(class_310 var1) {
      return !this.IIIIlIl()
            || var1 == null
            || var1.field_1724 == null
            || var1.field_1687 == null
            || var1.field_1761 == null
            || var1.field_1690 == null
            || var1.field_1755 != null
            || !var1.field_1724.method_5805()
            || this.Illll(var1)
         ? false
         : this.IIlIIl(var1);
   }

   private class_243 IIIIIl(class_310 var1, class_1309 var2) {
      if (var2 == null) {
         return class_243.field_1353;
      } else {
         class_243 var3 = this.IIllII == var2.method_5628()
               && this.IIll != IlIllI(566834340, 1042390300 ^ -2122875527)
               && var1.field_1724.field_6012 - this.IIll <= 3
            ? this.lIlI
            : var2.method_18798();
         return var3 == null ? class_243.field_1353 : new class_243(var3.field_1352, 0.0, var3.field_1350);
      }
   }

   static boolean IIIIlI(class_3965 var0, class_3965 var1) {
      return var0 != null
         && var1 != null
         && var0.method_17783() == class_240.field_1332
         && var1.method_17783() == class_240.field_1332
         && var0.method_17777().equals(var1.method_17777())
         && var0.method_17780() == var1.method_17780();
   }

   private llIlIlII IIIIll(class_310 var1, class_2338 var2) {
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var2 != null && this.II(var1, var2)) {
         double var3 = Math.max(0.0, var1.field_1724.method_55754() - 0.1);

         for (class_2350 var8 : class_2350.values()) {
            class_2338 var9 = var2.method_10093(var8);
            if (this.IIIlIl(var1, var9)) {
               class_2350 var10 = var8.method_10153();
               class_243 var11 = class_243.method_24953(var9).method_1019(class_243.method_24954(var10.method_62675()).method_1021(0.5));
               if (!(var1.field_1724.method_33571().method_1025(var11) > var3 * var3)) {
                  class_243 var12 = var11.method_1020(class_243.method_24954(var10.method_62675()).method_1021(0.001));
                  class_3965 var13 = k74.x.IIll.lIIIlll(var1, var1.field_1724, var1.field_1724.method_33571(), var12);
                  if (var13 == null || var13.method_17783() != class_240.field_1332) {
                     var13 = var1.field_1687
                        .method_17742(new class_3959(var1.field_1724.method_33571(), var12, class_3960.field_17559, class_242.field_1348, var1.field_1724));
                  }

                  if (var13 != null
                     && var13.method_17783() == class_240.field_1332
                     && var13.method_17777().equals(var9)
                     && var13.method_17780() == var10
                     && var2.equals(var9.method_10093(var13.method_17780()))) {
                     return new llIlIlII(var2.method_10062(), var9.method_10062(), var13.method_17784(), var13);
                  }
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private void IIIlII(long var1) {
      this.IIlI();
      this.lIIll = IIIlIll.I;
      this.IllIl = var1;
      this.IIIlIl = var1 + this.lIIll(this.lII);
      this.lIIIl = this.IIIlII;
      this.Ill = null;
   }

   private boolean IIIlIl(class_310 var1, class_2338 var2) {
      if (var1 != null && var1.field_1687 != null && var2 != null) {
         class_2680 var3 = var1.field_1687.method_8320(var2);
         return var3 != null
            && !var3.method_26215()
            && var3.method_26227().method_15769()
            && !var3.method_27852(class_2246.field_10382)
            && !var3.method_27852(class_2246.field_10164)
            && !var3.method_26220(var1.field_1687, var2).method_1110();
      } else {
         return false;
      }
   }

   @Override
   public void IlIII() {
      this.IIl();
      this.lllI();
      this.Illll.IIIIIII();
   }

   private int IIIllI(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         for (int var2 = 0; var2 < IlIllI(566834341, 1183882209 ^ 560269491); var2++) {
            class_1799 var3 = var1.field_1724.method_31548().method_5438(var2);
            if (var3 != null && var3.method_31574(class_1802.field_8786)) {
               return var2;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private boolean IIIlll() {
      double var1 = this.IIIIl.IllI();
      if (var1 >= 100.0) {
         return true;
      } else {
         return var1 <= 0.0 ? false : ThreadLocalRandom.current().nextDouble(100.0) < var1;
      }
   }

   @Override
   public void IllIll(class_310 var1) {
      if (!this.IIIIlIl() || var1 == null || var1.field_1724 == null || var1.field_1690 == null) {
         this.IIIIII = false;
      } else if (this.Illll(var1)) {
         this.llIll(var1);
         this.IIIIII = var1.field_1690.field_1886 != null && var1.field_1690.field_1886.method_1434();
      } else if (this.lIIll != IIIlIll.Il) {
         this.lIl(var1);
         k74.x.IIll.lIIIIlI(var1.field_1690.field_1886);
      } else if (!this.IIllIl(var1)) {
         if (!this.IIlIIl) {
            boolean var4 = this.lIl.IllI() == llIlllII.l;
            boolean var5 = var1.field_1690.field_1886.method_1434();
            boolean var6 = var5 && !this.IIIIII;
            this.IIIIII = var5;
            class_1309 var3;
            if ((var4 || var6 || k74.x.IIll.IIIIIlI(var1.field_1690.field_1886) > 0)
               && this.III(var1, var3 = k74.x.IIll.llIlll(var1, k74.x.IIll.lIlll(var1, 3.0)))) {
               if (this.lI(var1, var3)) {
                  return;
               }

               int var7 = this.llIII(var1);
               if (var7 != -1 && this.IIIl(var1, var3, var7) && !var4) {
                  k74.x.IIll.lIIIIlI(var1.field_1690.field_1886);
               }
            }
         }
      }
   }

   private boolean IIlIII(class_1309 var1) {
      return var1 != null && this.II == var1.method_5628() && System.currentTimeMillis() - this.IlIlI < 600L;
   }

   private boolean IIlIIl(class_310 var1) {
      if (var1 == null || var1.field_1724 == null) {
         return false;
      } else if (!this.lllI.III(IllI) && !this.lllI.III(lllll)) {
         return true;
      } else {
         class_1799 var2 = var1.field_1724.method_6047();
         if (var2 != null && !var2.method_7960()) {
            boolean var3 = var2.method_31573(class_3489.field_42611)
               || class_7923.field_41178
                  .method_10221(var2.method_7909())
                  .method_12832()
                  .endsWith(IlIIllIII.lI(IIllI(IlIllI(566834330, -2111589675 ^ -1861379769), IlIllI(566834331, -2111589675 ^ -1241502216))));
            boolean var4 = var2.method_7909() instanceof class_1743;
            return this.lllI.III(IllI) && var3 || this.lllI.III(lllll) && var4;
         } else {
            return false;
         }
      }
   }

   public boolean IIlIlI() {
      return this.lIlI();
   }

   private static String IlIlll(int var0, int var1) {
      int var3 = var0 ^ -81097839;
      char[] var4 = IIllll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IlIIII[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IlIIII[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -809582952;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 162;
            case 1 -> 251;
            case 2 -> 169;
            case 3 -> 173;
            case 4 -> 138;
            case 5 -> 60;
            case 6 -> 57;
            case 7 -> 148;
            case 8 -> 68;
            case 9 -> 192;
            case 10 -> 81;
            case 11 -> 164;
            case 12 -> 50;
            case 13 -> 61;
            case 14 -> 225;
            case 15 -> 89;
            case 16 -> 124;
            case 17 -> 86;
            case 18 -> 77;
            case 19 -> 217;
            case 20 -> 244;
            case 21 -> 72;
            case 22 -> 53;
            case 23 -> 107;
            case 24 -> 161;
            case 25 -> 109;
            case 26 -> 233;
            case 27 -> 252;
            case 28 -> 94;
            case 29 -> 80;
            case 30 -> 98;
            case 31 -> 206;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public void IIlIll(class_310 var1) {
   }

   private boolean IIllII(class_310 var1) {
      if (!this.lllll(var1)) {
         return false;
      } else {
         return k74.x.IIll.lIIlI(var1) == this.lIIlI ? true : this.IIIIl(var1, this.lIIlI);
      }
   }

   private boolean IIllIl(class_310 var1) {
      if (this.lIIIl < 0 || this.lIIIl >= IlIllI(566834328, 208317242 ^ -1020274183)) {
         return false;
      } else if (var1 == null || var1.field_1724 == null) {
         return true;
      } else if (var1.field_1724.field_6012 <= this.llI) {
         return true;
      } else {
         int var2 = k74.x.IIll.IIlII(var1.field_1724.method_31548());
         if (!this.IlllI && var2 != this.lIIIl) {
            k74.x.IIll.IlIllII(var1, this, this.lIIIl, 1);
            this.IlllI = true;
         }

         if (var2 == this.lIIIl) {
            k74.x.IIll.lllIl(var1, this, lllIII.II);
            this.IIl();
            return false;
         } else if (System.currentTimeMillis() >= this.IIlI) {
            k74.x.IIll.lllIl(var1, this, lllIII.II);
            this.IIl();
            return false;
         } else {
            return true;
         }
      }
   }

   private boolean IIlllI(class_310 var1, Object var2, int var3, class_3965 var4) {
      return var1.field_1687 == var2 && this.IlllI(var1, var3, var4, var4);
   }

   private class_2338 IIllll(class_310 var1, class_1309 var2) {
      llIlIlII var3 = this.lIIII(var1, var2);
      return var3 != null ? var3.II() : null;
   }

   private List<class_2338> l(class_310 var1, class_1309 var2) {
      class_238 var3 = var2.method_5829();
      int var4 = (int)Math.floor(var3.field_1322 + 1.0E-4);
      class_243 var5 = this.lIIIl(var1, var2);
      class_243 var6 = this.IIIIIl(var1, var2);
      if (var5.method_1027() < 1.0E-6 && var6.method_1027() < 1.0E-6) {
         return List.of(var2.method_24515());
      } else {
         boolean var7 = this.IIllII == var2.method_5628()
            && this.IIll != IlIllI(566834329, 566400781 ^ -2076973024)
            && var1.field_1724.field_6012 - this.IIll <= 3;
         double var8 = var1.field_1724.method_5624() ? 0.28 : 0.0;
         class_243 var10 = var7 ? var6.method_1021(1.8) : var6.method_1021(1.2).method_1019(var5.method_1021(0.65 + var8));
         double var11 = var10.method_1033();
         if (var11 > 2.2) {
            var10 = var10.method_1021(2.2 / var11);
         }

         class_238 var13 = var3.method_989(var10.field_1352 * 0.5, 0.0, var10.field_1350 * 0.5);
         class_238 var14 = var3.method_989(var10.field_1352, 0.0, var10.field_1350);
         class_243 var15 = new class_243(var2.method_23317(), var4 + 0.5, var2.method_23321()).method_1019(var10);
         int var16 = (int)Math.floor(Math.min(Math.min(var3.field_1323, var13.field_1323), var14.field_1323)) - 1;
         int var17 = (int)Math.floor(Math.max(Math.max(var3.field_1320, var13.field_1320), var14.field_1320) - 1.0E-7) + 1;
         int var18 = (int)Math.floor(Math.min(Math.min(var3.field_1321, var13.field_1321), var14.field_1321)) - 1;
         int var19 = (int)Math.floor(Math.max(Math.max(var3.field_1324, var13.field_1324), var14.field_1324) - 1.0E-7) + 1;
         ArrayList var20 = new ArrayList();
         int[] var21 = var2.method_24828() && !(Math.abs(var2.method_18798().field_1351) > 0.08) ? new int[]{var4} : new int[]{var4, var4 - 1, var4 + 1};

         for (int var25 : var21) {
            for (int var26 = var16; var26 <= var17; var26++) {
               for (int var27 = var18; var27 <= var19; var27++) {
                  class_2338 var28 = new class_2338(var26, var25, var27);
                  double var29 = Math.max(IIIII(var14, var28), Math.max(IIIII(var13, var28) * 0.95, IIIII(var3, var28) * 0.85));
                  if (var25 != var4) {
                     var29 *= 0.8;
                  }

                  var20.add(new IIIlllIl(var28, var29, class_243.method_24953(var28).method_1025(var15)));
               }
            }
         }

         var20.sort(Comparator.comparingDouble(IIIlllIl::I).reversed().thenComparingDouble(IIIlllIl::l));
         return var20.stream().map(IIIlllIl::II).toList();
      }
   }

   private boolean IlIIII() {
      return this.I.IllI() && this.IIlll.IllI() && this.lllII.IllI() == IllIIIlI.lI;
   }

   private boolean IlIIIl() {
      double var1 = this.IIl.IllI();
      if (var1 >= 100.0) {
         return true;
      } else {
         return var1 <= 0.0 ? false : ThreadLocalRandom.current().nextDouble(100.0) < var1;
      }
   }

   private void IlIIlI(class_310 var1, long var2) {
      if (!this.III(var1, this.Illl)) {
         this.IIIlII(var2);
      } else if (!k74.x.IIll.lIIIll(var1, this.Illl)) {
         if (!this.IIIIl(var1, this.llIIl)) {
            if (var2 - this.IllIl > 650L) {
               this.IIIlII(var2);
            } else {
               this.IIIlIl = var2;
            }
         } else {
            boolean var4 = this.IIlll(var1, this.Illl);
            if (var4 && var1.field_1724 != null) {
               this.llI = var1.field_1724.field_6012;
            }

            if (var4) {
               if (this.llI(var1, var2)) {
                  return;
               }

               if (this.IIlll.IllI()) {
                  this.lllIl(var1, this.Illl, var2);
                  return;
               }
            }

            this.IIIlII(var2);
         }
      }
   }

   private void IlIIll(class_310 var1) {
      lllIII var2 = this.IIIll.IllI() ? lllIII.II : lllIII.I;
      k74.x.IIll.lllIl(var1, this, var2);
      this.IIl();
      this.Ill = null;
      this.lllI();
   }

   private boolean IlIlII(class_310 var1, class_3965 var2) {
      if (var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var2 != null
         && var2.method_17783() == class_240.field_1332
         && this.IIIlIl(var1, var2.method_17777())
         && this.II(var1, var2.method_17777().method_10093(var2.method_17780()))) {
         double var3 = Math.max(0.0, var1.field_1724.method_55754() - 0.1);
         class_243 var5 = var1.field_1724.method_33571();
         if (var5.method_1025(var2.method_17784()) > var3 * var3) {
            return false;
         } else {
            class_243 var6 = var2.method_17784().method_1020(class_243.method_24954(var2.method_17780().method_62675()).method_1021(0.01));
            class_3965 var7 = k74.x.IIll.lIIIlll(var1, var1.field_1724, var5, var6);
            if (var7 == null || var7.method_17783() != class_240.field_1332) {
               var7 = var1.field_1687.method_17742(new class_3959(var5, var6, class_3960.field_17559, class_242.field_1348, var1.field_1724));
            }

            return IIIIlI(var7, var2);
         }
      } else {
         return false;
      }
   }

   private void IlIlIl(class_310 var1) {
      if (this.IIIll.IllI()) {
         this.Il(System.currentTimeMillis());
      }

      this.IIllIl(var1);
      this.IIlIIl = false;
      this.lIllI = 0L;
      this.Illl = null;
      this.lIIll = IIIlIll.Il;
   }
}
