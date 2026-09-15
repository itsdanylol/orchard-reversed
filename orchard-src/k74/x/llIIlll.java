package k74.x;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1665;
import net.minecraft.class_1701;
import net.minecraft.class_1747;
import net.minecraft.class_1753;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2846;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_5321;
import net.minecraft.class_638;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_239.class_240;
import net.minecraft.class_2846.class_2847;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

@Environment(EnvType.CLIENT)
public final class llIIlll extends IlIIIIIIl {
   private static final int[] lllIl;
   private static final int II = 8;
   private static final double Il = 20.25;
   private static final String[] llllI;
   private static final int lI = 2;
   private final IlIIlll ll;
   private boolean III;
   private int IIl;
   private final IIlIII IlI;
   private static final double Ill = 0.99;
   private float lII;
   private int lIl;
   private long llI;
   private class_638 lll;
   private static final Object[] lllll;
   private final Set<UUID> IIII;
   private final lIlllIl IIIl;
   private float IIlI;
   private int IIll;
   private final lllIIlII IlII;
   private final Set<UUID> IlIl;
   private IIIIIIII IllI;
   private boolean Illl;
   private int lIII;
   private float lIIl;
   private static final int lIlI = 20;
   private static final long lIll = 1500L;
   private final IlIIIllll llII;
   private int I;
   private int llIl;
   private long lllI;
   private static final String[] llll;
   private int IIIII;
   private static final int IIIIl = 20;
   private int IIIlI;
   private class_243 IIIll;
   private final lllIIlII IIlII;
   private long IIlIl;
   private boolean IIllI;
   private final IIlIII IIlll;
   private static final int IlIII = 320;
   private static final float IlIIl = 0.1F;
   private int IlIlI;
   private int IlIll;
   private static final double IllII = 0.05;
   private int IllIl;
   private class_2338 IlllI;
   private static final double Illll = 0.0625;
   private int lIIII;
   private static final double lIIIl = 0.125;
   private int lIIlI;
   private long lIIll;
   private boolean lIlII;
   private final IllIII<IIIIlIlII> lIlIl;
   private IIlIIIlI lIllI;
   private IIlIlIII lIlll;
   private boolean llIII;
   private class_243 llIIl;
   private class_746 llIlI;
   private static final double llIll = 4.5;
   private static final String[] lllII;

   private boolean I(class_310 var1, class_2338 var2, int var3) {
      if (var1 != null && var1.field_1724 != null && var2 != null) {
         int var4 = this.III(var1);
         if (var4 < 0) {
            return false;
         } else {
            IlIIIIlII var5 = this.IIlI(var1, var2);
            if (var5 == null) {
               return false;
            } else {
               float[] var6 = IlllIlII.lIII(var1, var5.II());
               float var7 = var6 != null ? var6[0] : var1.field_1724.method_36454();
               float var8 = var6 != null ? var6[1] : var1.field_1724.method_36455();
               this.lIllI = new IIlIIIlI(var5, var4, var3, var7, var8);
               this.lIl = lIIlIl(-476329783, 155505445 ^ 1370648890);
               this.llI = 0L;
               this.Ill(var1);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private void II(class_310 var1) {
      int var14 = -310079186;
      if (this.IlllI != null && var1 != null && var1.field_1724 != null && var1.field_1724.field_6012 >= this.I && var1.field_1724.field_6012 >= this.IIl) {
         class_2338 var2 = this.IlllI;
         int var3 = this.lIIII;
         long var4 = this.lllI;
         if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null) {
            if (this.IlIlI != lIIlIl(-476329784, var14 ^ -1972606620)) {
               if (var1.field_1724.field_6012 <= this.IlIlI) {
                  return;
               }

               this.IlIlI = lIIlIl(-476329781, var14 ^ 805237691);
               this.IIIII = lIIlIl(-476329782, var14 ^ -47980409);
            }

            if (this.llIII) {
               if (this.lIIIIl(var1, var2)) {
                  this.lIlIl(var1, var3);
               } else if (var1.field_1724.field_6012 > this.IllIl) {
                  this.llIII = false;
                  this.IllIl = lIIlIl(-476329779, var14 ^ 2006422789);
                  this.IIlll(var1, var3);
               }
            } else if (!this.IIIlIl(var1.field_1687.method_8320(var2))) {
               if (var1.field_1724.field_6012 - this.I > lIIlIl(-476329780, var14 ^ 698728311)) {
                  this.IIIlI(var1);
                  this.lIIIlI(var1, var3);
                  this.llllI();
               }
            } else if (this.lIIIIl(var1, var2)) {
               this.lIlIl(var1, var3);
            } else if (!this.Illl(var1, var2)) {
               this.IIlll(var1, var3);
            } else {
               int var6 = this.IllIIl(var1.field_1724);
               if (var6 < 0) {
                  this.IIlll(var1, var3);
               } else {
                  boolean var7 = this.IlIlIl(var1, var6);
                  boolean var8 = var1.field_1724.field_6012 == this.IIIII;
                  if (this.IlIIII(var1, var2)) {
                     if (var7) {
                        this.IlllI(var1, var4, var2, var3, var1.field_1724.method_36454(), var1.field_1724.method_36455(), var8);
                     }
                  } else {
                     float[] var9 = IlllIlII.lIII(var1, this.Illlll(var2));
                     if (var9 == null) {
                        this.IIlll(var1, var3);
                     } else if (this.lIlIl.IllI() != IIIIlIlII.l) {
                        if (var7) {
                           this.IlllI(var1, var4, var2, var3, var9[0], var9[1], var8);
                        }
                     } else {
                        if (this.lIIll == 0L) {
                           this.lIIll = System.currentTimeMillis();
                        }

                        boolean var10 = this.IlIIII(var1, var2);
                        float var11 = var10 ? 0.0F : this.llII.IIIllII(var1, this.IIIlll(var2), this.IlI.IllI().floatValue());
                        if (var7) {
                           if (!var10 && !(var11 <= 0.5F)) {
                              if (System.currentTimeMillis() - this.lIIll >= 1500L) {
                                 this.IIIlI(var1);
                                 this.lIIIlI(var1, var3);
                                 this.llllI();
                              }
                           } else {
                              float var12 = var10 ? var1.field_1724.method_36454() : var9[0];
                              float var13 = var10 ? var1.field_1724.method_36455() : var9[1];
                              if (this.IlllI(var1, var4, var2, var3, var12, var13, var8)) {
                                 this.lIIll = 0L;
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            this.lIIIlI(var1, var3);
            this.llllI();
         }
      }
   }

   private boolean Il(class_310 var1, class_2338 var2) {
      return this.IIllII(var1, var2) && this.IIIII(var1, var2) && !this.lIIIIl(var1, var2);
   }

   private boolean lI(class_310 var1, long var2, class_2338 var4, int var5) {
      return this.IIllIl(var1, var2, var4, var5);
   }

   private static boolean ll(class_2338 var0, class_1701 var1) {
      return var1.method_5805() && !var1.method_31481() && IllllI(var0, var1.method_73189());
   }

   private int III(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         int var2 = (int)Math.round(this.IIlll.IllI()) - 1;
         return this.IIII(var1, var2) ? var2 : -1;
      } else {
         return -1;
      }
   }

   private boolean IIl(class_310 var1, IIIIIIII var2) {
      return this.IIll(var1, var2);
   }

   private void Ill(class_310 var1) {
      int var6 = -1341198241;
      if (this.lIllI != null) {
         IIlIIIlI var2 = this.lIllI;
         if (var1 == null || var1.field_1724 == null || var1.field_1687 == null || var1.field_1761 == null) {
            this.lIllI = null;
            this.lIl = lIIlIl(-476329777, var6 ^ 1611696921);
            this.llI = 0L;
         } else if (var1.field_1724.field_6012 >= this.IIl) {
            if (this.lIl != lIIlIl(-476329778, var6 ^ -219211566)) {
               if (var1.field_1724.field_6012 <= this.lIl) {
                  return;
               }

               this.lIl = lIIlIl(-476329791, var6 ^ -1807151897);
            }

            if (!this.lllI(var1, var2.II().l())) {
               this.IIIIlI(var1, var2.Il());
            } else {
               boolean var3 = this.IlIlIl(var1, var2.l());
               if (this.lIlIl.IllI() == IIIIlIlII.l) {
                  if (this.llI == 0L) {
                     this.llI = System.currentTimeMillis();
                  }

                  float var7 = this.llII.IIIllII(var1, var2.II().I(), this.IlI.IllI().floatValue());
                  if (var3) {
                     if (var7 <= 0.5F) {
                        this.lIl = var1.field_1724.field_6012 + 2;
                        boolean var5 = IlllIlII.IlII(var1, lIIlIl(-476329792, var6 ^ -214402144), var2.lI(), var2.I(), this::lllll);
                        if (!var5) {
                           this.lIl = lIIlIl(-476329789, var6 ^ -579262970);
                        } else {
                           this.llI = 0L;
                        }
                     } else if (System.currentTimeMillis() - this.llI >= 1500L) {
                        this.IIIIlI(var1, var2.Il());
                     }
                  }
               } else if (var3) {
                  this.lIl = var1.field_1724.field_6012;
                  boolean var4 = IlllIlII.IlII(var1, lIIlIl(-476329790, var6 ^ 1750964557), var2.lI(), var2.I(), this::lIIll);
                  if (!var4) {
                     this.lIl = lIIlIl(-476329787, var6 ^ 622573039);
                  }
               }
            }
         }
      }
   }

   private boolean lII(class_310 var1, IIlIIIlI var2) {
      if (this.lIllI != var2) {
         return false;
      } else {
         this.lIl = lIIlIl(-476329788, 1460972632 ^ -1540561783);
         this.llI = 0L;
         this.lIlII(var1, var2.l(), var2.II().I());
         this.IIIIlI(var1, var2.Il());
         return true;
      }
   }

   @Override
   public void IllIll(class_310 var1) {
      if (this.IIIlII(var1)) {
         if (this.IIllI || this.lIIlI()) {
            this.IIlIll(var1);
         }

         this.IIIIll(var1);
         this.II(var1);
         this.Ill(var1);
         this.IllI(var1);
      }
   }

   @Override
   public void llIl() {
      class_310 var1 = class_310.method_1551();
      this.lIIIll(var1);
      this.IIIlI(var1);
      this.llIII();
      this.IllI = null;
      this.IlIll = 0;
      this.IIll = lIIlIl(-476329785, -1194037504 ^ -265089072);
      this.lIllI = null;
      this.lIl = lIIlIl(-476329786, -1194037504 ^ -590945329);
      this.llI = 0L;
      this.llllI();
      this.IlIIIl();
      this.IllIII();
      this.IIllI = false;
      this.IIIlI = 0;
      this.IIII.clear();
      this.IlIl.clear();
      this.llII.lIIl();
      this.lIIll = 0L;
   }

   private void lIl(class_310 var1) {
      this.IIII.clear();
      if (var1 != null && var1.field_1687 != null) {
         for (class_1297 var3 : var1.field_1687.method_18112()) {
            if (var3 instanceof class_1665 var4) {
               this.IIII.add(var4.method_5667());
            }
         }
      }
   }

   private static String llI(int var0, int var1) {
      int var9 = 2028182433;
      int var2 = (var0 ^ lIIlIl(-476329767, var9 ^ 1638087954)) & lIIlIl(-476329768, var9 ^ 1876489746);
      if (llll[var2] == null) {
         char[] var3 = lllII[var2].toCharArray();

         int var4 = switch (var3[0] & lIIlIl(-476329765, var9 ^ -1432799380)) {
            case 0 -> lIIlIl(-476329766, var9 ^ -575816554);
            case 1 -> lIIlIl(-476329763, var9 ^ -1807921421);
            case 2 -> lIIlIl(-476329764, var9 ^ -543715045);
            case 3 -> lIIlIl(-476329761, var9 ^ -146543069);
            case 4 -> lIIlIl(-476329762, var9 ^ 1774004323);
            case 5 -> lIIlIl(-476329775, var9 ^ 748472807);
            case 6 -> lIIlIl(-476329776, var9 ^ 1222943740);
            case 7 -> lIIlIl(-476329773, var9 ^ 399850839);
            case 8 -> lIIlIl(-476329774, var9 ^ -1325783216);
            case 9 -> lIIlIl(-476329771, var9 ^ 1671990679);
            case 10 -> lIIlIl(-476329772, var9 ^ -270776653);
            case 11 -> lIIlIl(-476329769, var9 ^ 1466708565);
            case 12 -> lIIlIl(-476329770, var9 ^ 929068498);
            case 13 -> lIIlIl(-476329751, var9 ^ -1519229561);
            case 14 -> 3;
            case 15 -> lIIlIl(-476329752, var9 ^ 1272183735);
            case 16 -> 4;
            case 17 -> lIIlIl(-476329749, var9 ^ -463977596);
            case 18 -> lIIlIl(-476329750, var9 ^ 1394793330);
            case 19 -> lIIlIl(-476329747, var9 ^ 198302146);
            case 20 -> lIIlIl(-476329748, var9 ^ -806207020);
            case 21 -> lIIlIl(-476329745, var9 ^ -315658884);
            case 22 -> lIIlIl(-476329746, var9 ^ -35177901);
            case 23 -> lIIlIl(-476329759, var9 ^ -1906829501);
            case 24 -> lIIlIl(-476329760, var9 ^ -405074575);
            case 25 -> lIIlIl(-476329757, var9 ^ -86165398);
            case 26 -> lIIlIl(-476329758, var9 ^ 1083057111);
            case 27 -> lIIlIl(-476329755, var9 ^ 459766847);
            case 28 -> lIIlIl(-476329756, var9 ^ 2024909943);
            case 29 -> lIIlIl(-476329753, var9 ^ -413529750);
            case 30 -> lIIlIl(-476329754, var9 ^ -1363925349);
            case 31 -> lIIlIl(-476329735, var9 ^ 1197101434);
            case 32 -> lIIlIl(-476329736, var9 ^ -473488624);
            case 33 -> lIIlIl(-476329733, var9 ^ -1838270853);
            case 34 -> lIIlIl(-476329734, var9 ^ 660405313);
            case 35 -> lIIlIl(-476329731, var9 ^ 1918890266);
            case 36 -> lIIlIl(-476329732, var9 ^ 1875959799);
            case 37 -> lIIlIl(-476329729, var9 ^ 822026022);
            case 38 -> lIIlIl(-476329730, var9 ^ 1713312381);
            case 39 -> lIIlIl(-476329743, var9 ^ -358568758);
            case 40 -> lIIlIl(-476329744, var9 ^ -1518085410);
            case 41 -> lIIlIl(-476329741, var9 ^ 1427733387);
            case 42 -> lIIlIl(-476329742, var9 ^ 1387849017);
            case 43 -> lIIlIl(-476329739, var9 ^ -420138110);
            case 44 -> lIIlIl(-476329740, var9 ^ -1921273173);
            case 45 -> lIIlIl(-476329737, var9 ^ 1727515779);
            case 46 -> lIIlIl(-476329738, var9 ^ -1926641779);
            case 47 -> lIIlIl(-476329847, var9 ^ 473909568);
            case 48 -> lIIlIl(-476329848, var9 ^ 138407867);
            case 49 -> lIIlIl(-476329845, var9 ^ -5018689);
            case 50 -> lIIlIl(-476329846, var9 ^ -1358430899);
            case 51 -> lIIlIl(-476329843, var9 ^ -1132323125);
            case 52 -> lIIlIl(-476329844, var9 ^ -1308279548);
            case 53 -> lIIlIl(-476329841, var9 ^ 329558934);
            case 54 -> lIIlIl(-476329842, var9 ^ 445618764);
            case 55 -> lIIlIl(-476329855, var9 ^ 715070445);
            case 56 -> lIIlIl(-476329856, var9 ^ 434643517);
            case 57 -> lIIlIl(-476329853, var9 ^ 1197903016);
            case 58 -> lIIlIl(-476329854, var9 ^ 2069690612);
            case 59 -> lIIlIl(-476329851, var9 ^ -1403846563);
            case 60 -> lIIlIl(-476329852, var9 ^ 289147351);
            case 61 -> lIIlIl(-476329849, var9 ^ 1690914792);
            case 62 -> lIIlIl(-476329850, var9 ^ -1573316987);
            case 63 -> lIIlIl(-476329831, var9 ^ -623408667);
            case 64 -> lIIlIl(-476329832, var9 ^ -1106375930);
            case 65 -> 0;
            case 66 -> lIIlIl(-476329829, var9 ^ 475854628);
            case 67 -> lIIlIl(-476329830, var9 ^ 211952094);
            case 68 -> lIIlIl(-476329827, var9 ^ -44680490);
            case 69 -> lIIlIl(-476329828, var9 ^ 73888028);
            case 70 -> 1;
            case 71 -> lIIlIl(-476329825, var9 ^ 1089830827);
            case 72 -> lIIlIl(-476329826, var9 ^ -1387163185);
            case 73 -> lIIlIl(-476329839, var9 ^ -1474313552);
            case 74 -> lIIlIl(-476329840, var9 ^ 423686900);
            case 75 -> lIIlIl(-476329837, var9 ^ -853581459);
            case 76 -> lIIlIl(-476329838, var9 ^ -595776835);
            case 77 -> lIIlIl(-476329835, var9 ^ -1271797916);
            case 78 -> lIIlIl(-476329836, var9 ^ -1126708328);
            case 79 -> lIIlIl(-476329833, var9 ^ -236053264);
            case 80 -> lIIlIl(-476329834, var9 ^ -931125677);
            case 81 -> lIIlIl(-476329815, var9 ^ -604223902);
            case 82 -> lIIlIl(-476329816, var9 ^ -487309270);
            case 83 -> lIIlIl(-476329813, var9 ^ -1735511207);
            case 84 -> lIIlIl(-476329814, var9 ^ -1662355817);
            case 85 -> lIIlIl(-476329811, var9 ^ 1038028168);
            case 86 -> lIIlIl(-476329812, var9 ^ -831684184);
            case 87 -> lIIlIl(-476329809, var9 ^ -2049677931);
            case 88 -> lIIlIl(-476329810, var9 ^ 1820264533);
            case 89 -> lIIlIl(-476329823, var9 ^ 1019100238);
            case 90 -> lIIlIl(-476329824, var9 ^ 1870808093);
            case 91 -> lIIlIl(-476329821, var9 ^ 602425717);
            case 92 -> lIIlIl(-476329822, var9 ^ 2129205393);
            case 93 -> lIIlIl(-476329819, var9 ^ 1985533600);
            case 94 -> lIIlIl(-476329820, var9 ^ -1563565606);
            case 95 -> lIIlIl(-476329817, var9 ^ 309108681);
            case 96 -> lIIlIl(-476329818, var9 ^ 1815845186);
            case 97 -> lIIlIl(-476329799, var9 ^ -1803261808);
            case 98 -> lIIlIl(-476329800, var9 ^ -810954211);
            case 99 -> lIIlIl(-476329797, var9 ^ -1722461292);
            case 100 -> lIIlIl(-476329798, var9 ^ 2059381544);
            case 101 -> lIIlIl(-476329795, var9 ^ -1628266492);
            case 102 -> lIIlIl(-476329796, var9 ^ -1684185420);
            case 103 -> lIIlIl(-476329793, var9 ^ 2131822366);
            case 104 -> lIIlIl(-476329794, var9 ^ -1064539891);
            case 105 -> lIIlIl(-476329807, var9 ^ 296830999);
            case 106 -> lIIlIl(-476329808, var9 ^ -621747805);
            case 107 -> lIIlIl(-476329805, var9 ^ -710267714);
            case 108 -> lIIlIl(-476329806, var9 ^ 1655296557);
            case 109 -> lIIlIl(-476329803, var9 ^ -533893045);
            case 110 -> lIIlIl(-476329804, var9 ^ -130284277);
            case 111 -> lIIlIl(-476329801, var9 ^ 472400515);
            case 112 -> lIIlIl(-476329802, var9 ^ -1060349341);
            case 113 -> lIIlIl(-476329911, var9 ^ -1520548728);
            case 114 -> lIIlIl(-476329912, var9 ^ -1405474757);
            case 115 -> lIIlIl(-476329909, var9 ^ -298735484);
            case 116 -> lIIlIl(-476329910, var9 ^ -304204655);
            case 117 -> lIIlIl(-476329907, var9 ^ -1286738032);
            case 118 -> lIIlIl(-476329908, var9 ^ 1223468455);
            case 119 -> lIIlIl(-476329905, var9 ^ 1159995239);
            case 120 -> lIIlIl(-476329906, var9 ^ 1531111845);
            case 121 -> lIIlIl(-476329919, var9 ^ 893641023);
            case 122 -> lIIlIl(-476329920, var9 ^ 577517229);
            case 123 -> lIIlIl(-476329917, var9 ^ 1898885166);
            case 124 -> lIIlIl(-476329918, var9 ^ 181179567);
            case 125 -> lIIlIl(-476329915, var9 ^ -929549322);
            case 126 -> lIIlIl(-476329916, var9 ^ 2017240549);
            case 127 -> lIIlIl(-476329913, var9 ^ 867973972);
            case 128 -> lIIlIl(-476329914, var9 ^ 100140562);
            case 129 -> lIIlIl(-476329895, var9 ^ 67175894);
            case 130 -> lIIlIl(-476329896, var9 ^ 1082904261);
            case 131 -> lIIlIl(-476329893, var9 ^ 1659476275);
            case 132 -> lIIlIl(-476329894, var9 ^ -1372719697);
            case 133 -> lIIlIl(-476329891, var9 ^ -1771827530);
            case 134 -> lIIlIl(-476329892, var9 ^ -712064976);
            case 135 -> lIIlIl(-476329889, var9 ^ -1754098948);
            case 136 -> lIIlIl(-476329890, var9 ^ 46073843);
            case 137 -> lIIlIl(-476329903, var9 ^ -1459411758);
            case 138 -> lIIlIl(-476329904, var9 ^ -524674);
            case 139 -> lIIlIl(-476329901, var9 ^ -455946122);
            case 140 -> lIIlIl(-476329902, var9 ^ -1034399485);
            case 141 -> lIIlIl(-476329899, var9 ^ 116872383);
            case 142 -> lIIlIl(-476329900, var9 ^ -2116908433);
            case 143 -> lIIlIl(-476329897, var9 ^ 2139855997);
            case 144 -> lIIlIl(-476329898, var9 ^ 1511061798);
            case 145 -> lIIlIl(-476329879, var9 ^ -390269345);
            case 146 -> lIIlIl(-476329880, var9 ^ -231956239);
            case 147 -> lIIlIl(-476329877, var9 ^ -1194094824);
            case 148 -> lIIlIl(-476329878, var9 ^ 1355892625);
            case 149 -> lIIlIl(-476329875, var9 ^ -500815127);
            case 150 -> lIIlIl(-476329876, var9 ^ 251820561);
            case 151 -> lIIlIl(-476329873, var9 ^ 841972093);
            case 152 -> lIIlIl(-476329874, var9 ^ -1981658536);
            case 153 -> lIIlIl(-476329887, var9 ^ -1126378817);
            case 154 -> lIIlIl(-476329888, var9 ^ -341371137);
            case 155 -> lIIlIl(-476329885, var9 ^ -792762530);
            case 156 -> lIIlIl(-476329886, var9 ^ -479642578);
            case 157 -> lIIlIl(-476329883, var9 ^ 162809011);
            case 158 -> lIIlIl(-476329884, var9 ^ -1611167070);
            case 159 -> lIIlIl(-476329881, var9 ^ -1906565639);
            case 160 -> lIIlIl(-476329882, var9 ^ -762949388);
            case 161 -> lIIlIl(-476329863, var9 ^ -736066188);
            case 162 -> lIIlIl(-476329864, var9 ^ -177293442);
            case 163 -> 2;
            case 164 -> lIIlIl(-476329861, var9 ^ 403494401);
            case 165 -> lIIlIl(-476329862, var9 ^ -1861035533);
            case 166 -> lIIlIl(-476329859, var9 ^ 696959624);
            case 167 -> lIIlIl(-476329860, var9 ^ -321263160);
            case 168 -> lIIlIl(-476329857, var9 ^ 469199444);
            case 169 -> lIIlIl(-476329858, var9 ^ 495215739);
            case 170 -> lIIlIl(-476329871, var9 ^ -1817043032);
            case 171 -> lIIlIl(-476329872, var9 ^ 141466553);
            case 172 -> lIIlIl(-476329869, var9 ^ -328548037);
            case 173 -> lIIlIl(-476329870, var9 ^ 1304441250);
            case 174 -> lIIlIl(-476329867, var9 ^ 397433497);
            case 175 -> lIIlIl(-476329868, var9 ^ 52294447);
            case 176 -> lIIlIl(-476329865, var9 ^ -306583006);
            case 177 -> lIIlIl(-476329866, var9 ^ -1549649896);
            case 178 -> lIIlIl(-476329975, var9 ^ -581226012);
            case 179 -> lIIlIl(-476329976, var9 ^ -37541076);
            case 180 -> lIIlIl(-476329973, var9 ^ -725228418);
            case 181 -> lIIlIl(-476329974, var9 ^ -919652904);
            case 182 -> lIIlIl(-476329971, var9 ^ 1062101076);
            case 183 -> lIIlIl(-476329972, var9 ^ 1548089736);
            case 184 -> lIIlIl(-476329969, var9 ^ -1188251187);
            case 185 -> lIIlIl(-476329970, var9 ^ -717111543);
            case 186 -> lIIlIl(-476329983, var9 ^ 377842355);
            case 187 -> lIIlIl(-476329984, var9 ^ 754594887);
            case 188 -> lIIlIl(-476329981, var9 ^ 753167469);
            case 189 -> lIIlIl(-476329982, var9 ^ 1453730736);
            case 190 -> lIIlIl(-476329979, var9 ^ 521978860);
            case 191 -> 5;
            case 192 -> lIIlIl(-476329980, var9 ^ 1714345044);
            case 193 -> lIIlIl(-476329977, var9 ^ -2072321534);
            case 194 -> lIIlIl(-476329978, var9 ^ 803560094);
            case 195 -> lIIlIl(-476329959, var9 ^ 1679916755);
            case 196 -> lIIlIl(-476329960, var9 ^ -1314606708);
            case 197 -> lIIlIl(-476329957, var9 ^ 1110323190);
            case 198 -> lIIlIl(-476329958, var9 ^ 301555187);
            case 199 -> lIIlIl(-476329955, var9 ^ -524472000);
            case 200 -> lIIlIl(-476329956, var9 ^ -65707178);
            case 201 -> lIIlIl(-476329953, var9 ^ 784163481);
            case 202 -> lIIlIl(-476329954, var9 ^ -1387182620);
            case 203 -> lIIlIl(-476329967, var9 ^ -748005216);
            case 204 -> lIIlIl(-476329968, var9 ^ -1756654312);
            case 205 -> lIIlIl(-476329965, var9 ^ 1430617543);
            case 206 -> lIIlIl(-476329966, var9 ^ 956305126);
            case 207 -> lIIlIl(-476329963, var9 ^ 1444712890);
            case 208 -> lIIlIl(-476329964, var9 ^ -373244064);
            case 209 -> lIIlIl(-476329961, var9 ^ 544961529);
            case 210 -> lIIlIl(-476329962, var9 ^ -974946362);
            case 211 -> lIIlIl(-476329943, var9 ^ -1068541412);
            case 212 -> lIIlIl(-476329944, var9 ^ 1554132809);
            case 213 -> lIIlIl(-476329941, var9 ^ -616025096);
            case 214 -> lIIlIl(-476329942, var9 ^ 1376472079);
            case 215 -> lIIlIl(-476329939, var9 ^ -850667583);
            case 216 -> lIIlIl(-476329940, var9 ^ 353909665);
            case 217 -> lIIlIl(-476329937, var9 ^ -923298576);
            case 218 -> lIIlIl(-476329938, var9 ^ -56527175);
            case 219 -> lIIlIl(-476329951, var9 ^ -202506880);
            case 220 -> lIIlIl(-476329952, var9 ^ -222543876);
            case 221 -> lIIlIl(-476329949, var9 ^ -2052126344);
            case 222 -> lIIlIl(-476329950, var9 ^ 548276390);
            case 223 -> lIIlIl(-476329947, var9 ^ -1783793628);
            case 224 -> lIIlIl(-476329948, var9 ^ 283450180);
            case 225 -> lIIlIl(-476329945, var9 ^ 2051716896);
            case 226 -> lIIlIl(-476329946, var9 ^ -1390978939);
            case 227 -> lIIlIl(-476329927, var9 ^ 814569622);
            case 228 -> lIIlIl(-476329928, var9 ^ -1806748786);
            case 229 -> lIIlIl(-476329925, var9 ^ -1875507750);
            case 230 -> lIIlIl(-476329926, var9 ^ -967416710);
            case 231 -> lIIlIl(-476329923, var9 ^ -921419456);
            case 232 -> lIIlIl(-476329924, var9 ^ -1099880282);
            case 233 -> lIIlIl(-476329921, var9 ^ 238934563);
            case 234 -> lIIlIl(-476329922, var9 ^ 1613625740);
            case 235 -> lIIlIl(-476329935, var9 ^ -1277599308);
            case 236 -> lIIlIl(-476329936, var9 ^ 40391396);
            case 237 -> lIIlIl(-476329933, var9 ^ 98215315);
            case 238 -> lIIlIl(-476329934, var9 ^ 397961261);
            case 239 -> lIIlIl(-476329931, var9 ^ 1410937414);
            case 240 -> lIIlIl(-476329932, var9 ^ 1601095640);
            case 241 -> lIIlIl(-476329929, var9 ^ 1487635919);
            case 242 -> lIIlIl(-476329930, var9 ^ -875479404);
            case 243 -> lIIlIl(-476329527, var9 ^ -786109433);
            case 244 -> lIIlIl(-476329528, var9 ^ 2033449078);
            case 245 -> lIIlIl(-476329525, var9 ^ 114386424);
            case 246 -> lIIlIl(-476329526, var9 ^ -58377922);
            case 247 -> lIIlIl(-476329523, var9 ^ -109287890);
            case 248 -> lIIlIl(-476329524, var9 ^ 875224050);
            case 249 -> lIIlIl(-476329521, var9 ^ 1921051432);
            case 250 -> lIIlIl(-476329522, var9 ^ -1030070054);
            case 251 -> lIIlIl(-476329535, var9 ^ -679120717);
            case 252 -> lIIlIl(-476329536, var9 ^ 218594568);
            case 253 -> lIIlIl(-476329533, var9 ^ 198558453);
            case 254 -> lIIlIl(-476329534, var9 ^ -1731227613);
            default -> lIIlIl(-476329531, var9 ^ 1250328678);
         };
         int var5 = (var1 & lIIlIl(-476329532, var9 ^ 1478299535)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIlIl(-476329529, var9 ^ -1374447551)) >>> lIIlIl(-476329530, var9 ^ 545980608)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIlIl(-476329511, var9 ^ -346119390);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIlIl(-476329512, var9 ^ -1470976552);
            }
         }

         llll[var2] = new String(var3).intern();
      }

      return llll[var2];
   }

   private static class_2350 lll(double var0, double var2) {
      if (Math.abs(var0) >= Math.abs(var2)) {
         return var0 >= 0.0 ? class_2350.field_11034 : class_2350.field_11039;
      } else {
         return var2 >= 0.0 ? class_2350.field_11035 : class_2350.field_11043;
      }
   }

   private boolean IIII(class_310 var1, int var2) {
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var2 >= 0 && var2 < lIIlIl(-476329509, 1377472553 ^ -2000906004)) {
         class_1799 var3 = var1.field_1724.method_31548().method_5438(var2);
         if (var3 != null && !var3.method_7960() && var3.method_7909() instanceof class_1747 var4) {
            class_2680 var6 = var4.method_7711().method_9564();
            return var6 != null && !var6.method_26215() && !var6.method_26220(var1.field_1687, class_2338.field_10980).method_1110();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean IIIl(class_310 var1, IIIIIIII var2) {
      return this.IIll(var1, var2);
   }

   private IlIIIIlII IIlI(class_310 var1, class_2338 var2) {
      String[] var3 = IIllllIl.IIIIl();
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var2 != null) {
         class_243 var4 = new class_243(var2.method_10263() + 0.5, var2.method_10264() + 0.38, var2.method_10260() + 0.5);
         class_2338 var5 = var1.field_1724.method_24515();
         double var6 = var4.field_1352 - var1.field_1724.method_23317();
         double var8 = var4.field_1350 - var1.field_1724.method_23321();
         class_2350 var10 = lll(var6, var8);
         class_2350 var11 = Math.abs(var6) >= Math.abs(var8)
            ? (var8 > 0.0 ? class_2350.field_11035 : class_2350.field_11043)
            : (var6 > 0.0 ? class_2350.field_11034 : class_2350.field_11039);
         boolean var12 = Math.abs(var6) > 0.3 && Math.abs(var8) > 0.3;
         ArrayList var13 = new ArrayList();
         var13.add(var5.method_10093(var10));
         var13.add(var5.method_10093(var10).method_10084());
         if (var12) {
            var13.add(var5.method_10093(var10).method_10093(var11));
            var13.add(var5.method_10093(var10).method_10093(var11).method_10084());
            var13.add(var5.method_10093(var11));
            var13.add(var5.method_10093(var11).method_10084());
         }

         var13.add(var5.method_10079(var10, 2));
         var13.add(var5.method_10079(var10, 2).method_10084());
         class_2350 var14 = var10.method_10153();
         var13.add(var2.method_10093(var14));
         var13.add(var2.method_10093(var14).method_10084());
         if (var12) {
            var13.add(var2.method_10093(var14).method_10093(var11.method_10153()));
         }

         float var15 = IIIIllIlI.lII(var1.field_1724, var4, 11.5F, null);
         IlIIIIlII var16 = null;
         float var17 = Float.POSITIVE_INFINITY;
         class_238 var18 = var1.field_1724.method_5829();
         class_238 var19 = new class_238(var2).method_1009(0.5, 0.5, 0.5);

         for (class_2338 var21 : var13) {
            if ((!var21.equals(var2) || var3 != null) && (this.lllI(var1, var21) || var3 != null)) {
               class_238 var22 = new class_238(var21);
               if (!var22.method_994(var18)
                  && (!var22.method_994(var19) || var3 != null)
                  && (var1.field_1687.method_8333(null, var22, llIIlll::l).isEmpty() || var3 != null)) {
                  IlIIIIlII var23 = this.lIIl(var1, var21);
                  if ((var23 != null || var3 != null) && (!this.IlIlll(this.IIIll, this.llIIl, var21, var2) || var3 != null)) {
                     float var24 = IIIIllIlI.lII(var1.field_1724, var4, 11.5F, var21);
                     if (var15 - var24 >= 0.25F && var24 < var17) {
                        var17 = var24;
                        var16 = var23;
                     }

                     if (var3 != null) {
                        break;
                     }
                  }
               }
            }
         }

         return var16;
      } else {
         return null;
      }
   }

   private boolean IIll(class_310 var1, IIIIIIII var2) {
      if (this.IllI != var2) {
         return false;
      } else {
         this.IIll = lIIlIl(-476329510, 1429521086 ^ -487031288);
         if (this.Illll(var1, var2.I())) {
            this.IllIII();
            this.IllI = null;
            this.IlIll = 0;
            this.IIIIl(var1, var2.I(), var2.l());
            this.II(var1);
            return true;
         } else {
            this.IlIIll(var1, var2);
            return false;
         }
      }
   }

   private void IlII(class_310 var1) {
      if (var1 != null && var1.field_1690 != null && var1.field_1690.field_1904 != null) {
         k74.x.IIll.lIIIIlI(var1.field_1690.field_1904);
         var1.field_1690.field_1904.method_23481(false);
      }
   }

   private static boolean l(class_1297 var0) {
      return var0.method_5805() && !var0.method_31481();
   }

   private class_3965 IlIl(class_2338 var1) {
      return var1 == null ? null : new class_3965(this.IlIlII(var1), class_2350.field_11036, var1.method_10074(), false);
   }

   private void IllI(class_310 var1) {
      if (this.llIl >= 0) {
         if (var1 == null || var1.field_1724 == null) {
            this.IlIIIl();
         } else if (var1.field_1724.field_6012 >= this.lIIlI) {
            int var2 = this.llIl;
            k74.x.IIll.IlIllII(var1, this, var2, 0);
            this.IlIIIl();
         }
      }
   }

   private boolean Illl(class_310 var1, class_2338 var2) {
      return var1 != null
         && var1.field_1687 != null
         && var2 != null
         && this.IIIlIl(var1.field_1687.method_8320(var2))
         && this.IIIII(var1, var2)
         && !this.lIIIIl(var1, var2);
   }

   private boolean lIII(class_1799 var1) {
      if (var1 != null && !var1.method_7960() && var1.method_7909() instanceof class_1753) {
         class_9304 var2 = (class_9304)var1.method_58695(class_9334.field_49633, class_9304.field_49385);

         for (class_6880 var4 : var2.method_57534()) {
            int var10000 = lIIlIl(-476329507, -1197681315 ^ -1605331897);
            String var5 = var4.method_40230().map(llIIlll::lIIIII).orElse("");
            if (IlIIllIII.lI(llI(var10000, lIIlIl(-476329508, -1197681315 ^ 2010503577))).equals(var5) && var2.method_57536(var4) > 0) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private IlIIIIlII lIIl(class_310 var1, class_2338 var2) {
      if (this.lllI(var1, var2) && var1.field_1687.method_8335(null, new class_238(var2)).isEmpty()) {
         class_2350[] var10000 = new class_2350[lIIlIl(-476329505, 1163027664 ^ -1674245490)];
         var10000[0] = class_2350.field_11033;
         var10000[1] = class_2350.field_11043;
         var10000[2] = class_2350.field_11035;
         var10000[3] = class_2350.field_11039;
         var10000[4] = class_2350.field_11034;
         var10000[5] = class_2350.field_11036;
         class_2350[] var3 = var10000;

         for (class_2350 var7 : var3) {
            class_2338 var8 = var2.method_10093(var7);
            class_2680 var9 = var1.field_1687.method_8320(var8);
            if (!var9.method_26215() && !var9.method_26220(var1.field_1687, var8).method_1110()) {
               class_2350 var10 = var7.method_10153();
               class_243 var11 = class_243.method_24953(var8).method_1019(class_243.method_24954(var10.method_62675()).method_1021(0.5));
               if (!(var1.field_1724.method_33571().method_1025(var11) > 20.25)) {
                  return new IlIIIIlII(var2.method_10062(), var11, new class_3965(var11, var10, var8.method_10062(), false));
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private boolean lIlI(class_1799 var1) {
      return var1 != null
         && !var1.method_7960()
         && (
            var1.method_31574(class_1802.field_8129)
               || var1.method_31574(class_1802.field_8848)
               || var1.method_31574(class_1802.field_8211)
               || var1.method_31574(class_1802.field_8655)
         );
   }

   private boolean lIll(class_310 var1, class_2338 var2) {
      return IlllIlII.IIlIlI(var1, this.IlIl(var2));
   }

   private boolean llII(class_1799 var1) {
      return var1 != null && !var1.method_7960() && var1.method_31574(class_1802.field_8069);
   }

   private boolean lllI(class_310 var1, class_2338 var2) {
      return var1 != null
         && var1.field_1687 != null
         && var2 != null
         && (
            var1.field_1687.method_8320(var2).method_26215()
               || var1.field_1687.method_8320(var2).method_45474()
               || k74.x.IIll.lIIlIl(var1.field_1687.method_8320(var2))
         );
   }

   private boolean IIIII(class_310 var1, class_2338 var2) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var2 != null
         && var1.field_1687.method_8621().method_11952(var2)
         && var1.field_1724.method_33571().method_1025(this.Illlll(var2)) <= 20.25;
   }

   private void IIIIl(class_310 var1, class_2338 var2, int var3) {
      this.IlllI = var2.method_10062();
      this.lIIII = var3;
      this.I = var1.field_1724.field_6012;
      this.lIII = 0;
      this.IlIlI = lIIlIl(-476329506, -1708429098 ^ -1402165083);
      this.IIIII = var1.field_1724.field_6012;
      this.lllI = ++this.IIlIl;
      this.llIII = false;
      int var4 = this.IllIIl(var1.field_1724);
      if (var4 >= 0) {
         this.IlIlIl(var1, var4);
      }
   }

   private void IIIlI(class_310 var1) {
      if (this.III) {
         if (this.lIlIl.IllI() == IIIIlIlII.l && var1 != null && var1.field_1724 != null) {
            k74.x.IIll.IIIIIll(var1, this.lIIl, this.IIlI);
         }

         this.III = false;
      }
   }

   private class_243 IIIll(class_2338 var1) {
      return this.IlIlII(var1).method_1023(0.0, 0.0625, 0.0);
   }

   private void IIlII(class_310 var1) {
      float var2 = this.lII > 0.0F ? this.lII : 1.0F;
      this.lIlII = false;
      this.lII = 0.0F;
      this.lIllI(var1, true);
      this.lIl(var1);
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null) {
         float var3 = var2 * 3.0F;
         class_243 var4 = var1.field_1724.method_5828(1.0F);
         class_243 var5 = var1.field_1724.method_33571().method_1023(0.0, 0.1F, 0.0);
         class_243 var6 = var4.method_1021(var3);
         if (this.lllIl(var1, var5, var6)) {
            this.IIIIll(var1);
            this.IIllI = false;
            return;
         }
      }

      this.IIllI = true;
      this.IIIlI = 0;
   }

   private boolean IIllI(class_310 var1, IIIIIIII var2) {
      return this.IIll(var1, var2);
   }

   private void IIlll(class_310 var1, int var2) {
      this.lIII++;
      this.IllIII();
      if (this.lIII > lIIlIl(-476329519, 1499598827 ^ 1736327147)) {
         this.IIIlI(var1);
         this.lIIIlI(var1, var2);
         this.llllI();
      }
   }

   @Override
   public void IlllII(JsonObject var1) {
      super.IlllII(var1);
      this.IIIlIIl(var1, IlIIllIII.lI(llI(lIIlIl(-476329520, 1082849042 ^ 2003268201), lIIlIl(-476329517, 1082849042 ^ 1952013790))), new lIlllIl[]{this.IIIl});
      this.IIIlIIl(var1, IlIIllIII.lI(llI(lIIlIl(-476329518, 1082849042 ^ -566408487), lIIlIl(-476329515, 1082849042 ^ -1602028662))), new lIlllIl[]{this.IIIl});
   }

   private void IllII(UUID var1) {
      if (var1 != null) {
         if (this.IlIl.size() >= lIIlIl(-476329516, -1502471746 ^ -1005805101)) {
            this.IlIl.clear();
         }

         this.IlIl.add(var1);
      }
   }

   boolean IllIl() {
      return this.IIIIlIl() && (this.IIllI || this.lIIlI());
   }

   private boolean IlllI(class_310 var1, long var2, class_2338 var4, int var5, float var6, float var7, boolean var8) {
      this.IlIlI = var1.field_1724.field_6012;
      if (!this.Illl(var1, var4)) {
         this.IlIlI = lIIlIl(-476329513, 1034166116 ^ 1227963673);
         return false;
      } else {
         boolean var9 = IlllIlII.IlII(var1, lIIlIl(-476329514, 1034166116 ^ 1403219692), var6, var7, this::lI);
         if (!var9) {
            this.IlIlI = lIIlIl(-476329495, 1034166116 ^ 1838646674);
            this.IIIII = lIIlIl(-476329496, 1034166116 ^ -861454856);
         }

         return var9;
      }
   }

   private boolean Illll(class_310 var1, class_2338 var2) {
      if (this.Illl) {
         return true;
      } else {
         int var3 = this.IIlllI(var1.field_1724);
         if (this.Il(var1, var2) && var3 >= 0) {
            this.Illl = this.lIlII(var1, var3, this.IlIl(var2));
            return this.Illl;
         } else {
            return false;
         }
      }
   }

   private void lIIII(class_310 var1) {
      if (this.lIlIl.IllI() == IIIIlIlII.l && !this.III && var1 != null && var1.field_1724 != null) {
         this.lIIl = var1.field_1724.method_36454();
         this.IIlI = var1.field_1724.method_36455();
         this.III = true;
      }
   }

   private boolean lIIIl(class_310 var1) {
      return var1 != null && var1.field_1724 == this.llIlI && var1.field_1687 == this.lll;
   }

   private boolean lIIlI() {
      return this.IllI != null || this.IlllI != null || this.lIllI != null || this.llIl >= 0;
   }

   private boolean lIIll(class_310 var1, IIlIIIlI var2) {
      return this.lII(var1, var2);
   }

   private boolean lIlII(class_310 var1, int var2, class_3965 var3) {
      return k74.x.IIll.lllIII(var1, this, var2, this::llIll);
   }

   private void lIlIl(class_310 var1, int var2) {
      class_2338 var3 = this.IlllI;
      this.IllIII();
      this.III = false;
      this.llllI();
      if (!this.IlII.IllI() || var3 == null || !this.I(var1, var3, var2)) {
         this.lIIIlI(var1, var2);
      }
   }

   private void lIllI(class_310 var1, boolean var2) {
      if (var2) {
         this.IIIlI(var1);
      }

      if (var1 != null && var1.field_1724 != null) {
         k74.x.IIll.lllIl(var1, this, lllIII.II);
      }

      this.IllI = null;
      this.IlIll = 0;
      this.IIll = lIIlIl(-476329493, -594742189 ^ 1560547862);
      this.lIllI = null;
      this.lIl = lIIlIl(-476329494, -594742189 ^ 1285194074);
      this.llI = 0L;
      this.Illl = false;
      this.llllI();
      this.IlIIIl();
      this.IllIII();
   }

   @Override
   public void IlIII() {
      this.llII.IIIIIII();
   }

   private class_2338 lIlll(class_310 var1, class_3965 var2) {
      for (class_2338 var6 : this.IlIllI(var2)) {
         if (this.Il(var1, var6)) {
            return var6.method_10062();
         }
      }

      return null;
   }

   private void llIII() {
      this.lIlII = false;
      this.lII = 0.0F;
      this.IIIll = null;
      this.llIIl = null;
   }

   private boolean llIIl(class_310 var1, class_2338 var2) {
      return var1 != null && var1.field_1724 != null && var1.field_1687 != null && var2 != null
         ? var1.field_1724.method_5745(4.5, 1.0F, false) instanceof class_3965 var4
            && var4.method_17783() == class_240.field_1332
            && var4.method_17777().equals(var2)
            && var4.method_17780() == class_2350.field_11036
            && this.IIIlIl(var1.field_1687.method_8320(var2))
         : false;
   }

   private boolean llIlI(class_310 var1, class_2338 var2) {
      int var3 = this.IllIIl(var1.field_1724);
      if (this.Illl(var1, var2) && var3 >= 0) {
         this.llIII = this.lIlII(var1, var3, this.IIIlll(var2));
         return this.llIII;
      } else {
         return false;
      }
   }

   private boolean llIll(class_310 var1, class_3965 var2) {
      this.IlII(var1);
      boolean var3 = k74.x.IIll.IlI();

      boolean var4;
      try {
         var4 = k74.x.IIll.IlIIII(var1, var2);
      } finally {
         if (var3) {
            k74.x.IIll.lIl();
         }
      }

      return var4;
   }

   private int lllII(class_1657 var1, class_1792 var2) {
      for (int var3 = 0; var3 < lIIlIl(-476329491, -1412193563 ^ -520233363); var3++) {
         class_1799 var4 = var1.method_31548().method_5438(var3);
         if (var4.method_31574(var2)) {
            return var3;
         }
      }

      return -1;
   }

   private boolean lllIl(class_310 var1, class_243 var2, class_243 var3) {
      if (var1 != null && var1.field_1724 != null && this.IIlllI(var1.field_1724) >= 0 && this.IllIIl(var1.field_1724) >= 0) {
         this.IIIll = var2;
         this.llIIl = var3;
         class_2338 var4 = this.IIlIlI(var1, var2, var3);
         if (var4 != null && this.Il(var1, var4)) {
            class_243 var5 = this.IlIlII(var4);
            float[] var6 = IlllIlII.lIII(var1, var5);
            if (var6 == null) {
               return false;
            } else {
               this.lIIII(var1);
               int var7 = this.IllI != null ? this.IllI.l() : k74.x.IIll.IIlII(var1.field_1724.method_31548());
               this.IllI = new IIIIIIII(var4.method_10062(), var7, var6[0], var6[1]);
               this.IlIll = 0;
               this.IIll = lIIlIl(-476329492, -1284549225 ^ -574063777);
               this.Illl = false;
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void llllI() {
      this.IlllI = null;
      this.lIIII = -1;
      this.I = lIIlIl(-476329489, -58454799 ^ -1227297521);
      this.lIII = 0;
      this.IlIlI = lIIlIl(-476329490, -58454799 ^ 1823058382);
      this.IIIII = lIIlIl(-476329503, -58454799 ^ -1800550351);
      this.IllIl = lIIlIl(-476329504, -58454799 ^ 1963730000);
      this.lllI = Long.MIN_VALUE;
      this.llIII = false;
      this.lIIll = 0L;
   }

   private boolean lllll(class_310 var1, IIlIIIlI var2) {
      return this.lII(var1, var2);
   }

   private boolean IIIIII() {
      return this.lIlIl.IllI() == IIIIlIlII.l;
   }

   private class_243 IIIIIl(class_310 var1, float var2, float var3) {
      float var4 = var2 * (float) (Math.PI / 180.0);
      float var5 = var3 * (float) (Math.PI / 180.0);
      float var6 = class_3532.method_15362(var5);
      float var7 = class_3532.method_15374(var5);
      float var8 = class_3532.method_15362(var4);
      float var9 = class_3532.method_15374(var4);
      class_243 var10 = new class_243(-var9 * var6, -var7, var8 * var6);
      return var1.field_1724.method_33571().method_1019(var10.method_1021(5.0));
   }

   private void IIIIlI(class_310 var1, int var2) {
      this.lIllI = null;
      this.lIl = lIIlIl(-476329501, 326691933 ^ -1285316527);
      this.llI = 0L;
      this.IllIII();
      this.III = false;
      this.lIIIlI(var1, var2);
   }

   private void IIIIll(class_310 var1) {
      int var10 = 1189314183;
      if (this.IllI != null) {
         IIIIIIII var2 = this.IllI;
         if (var1 == null || var1.field_1724 == null || var1.field_1687 == null || var1.field_1761 == null) {
            this.IllI = null;
            this.IIll = lIIlIl(-476329488, var10 ^ -1002875845);
         } else if (var1.field_1724.field_6012 >= this.IIl) {
            if (this.IIll != lIIlIl(-476329485, var10 ^ 1089923234)) {
               if (var1.field_1724.field_6012 <= this.IIll) {
                  return;
               }

               this.IIll = lIIlIl(-476329486, var10 ^ 1671028562);
            }

            if (!this.Il(var1, var2.I())) {
               this.IllI = null;
               this.lIIIlI(var1, var2.l());
            } else {
               int var3 = this.IIlllI(var1.field_1724);
               if (var3 < 0) {
                  this.IllI = null;
                  this.lIIIlI(var1, var2.l());
               } else {
                  boolean var4 = this.IlIlIl(var1, var3);
                  if (this.lIlIl.IllI() != IIIIlIlII.l) {
                     if (var4) {
                        if (this.lIlIl.IllI() == IIIIlIlII.I) {
                           this.IIll = var1.field_1724.field_6012;
                           boolean var11 = IlllIlII.IlII(var1, lIIlIl(-476329481, var10 ^ -2040404207), var2.II(), var2.Il(), this::IIllI);
                           if (!var11) {
                              this.IIll = lIIlIl(-476329482, var10 ^ -256202219);
                           }
                        } else {
                           this.IIll = var1.field_1724.field_6012;
                           if (!IlllIlII.IlII(var1, lIIlIl(-476329591, var10 ^ -1679037084), var2.II(), var2.Il(), this::IIIl)) {
                              this.IIll = lIIlIl(-476329592, var10 ^ 985960634);
                           }
                        }
                     }
                  } else {
                     if (this.lIIll == 0L) {
                        this.lIIll = System.currentTimeMillis();
                     }

                     boolean var5 = this.lIll(var1, var2.I());
                     float var6 = var5 ? 0.0F : this.llII.IIIllII(var1, this.IlIl(var2.I()), this.IlI.IllI().floatValue());
                     if (var4) {
                        if (!var5 && !(var6 <= 0.5F)) {
                           if (System.currentTimeMillis() - this.lIIll >= 1500L) {
                              this.IllI = null;
                              this.lIIll = 0L;
                              this.IIIlI(var1);
                              this.lIIIlI(var1, var2.l());
                           }
                        } else {
                           float var7 = var5 ? var1.field_1724.method_36454() : var2.II();
                           float var8 = var5 ? var1.field_1724.method_36455() : var2.Il();
                           this.IIll = var1.field_1724.field_6012 + 2;
                           boolean var9 = IlllIlII.IlII(var1, lIIlIl(-476329483, var10 ^ 1580553399), var7, var8, this::IIl);
                           if (!var9) {
                              this.IIll = lIIlIl(-476329484, var10 ^ 23206995);
                           } else {
                              this.lIIll = 0L;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean IIIlII(class_310 var1) {
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null) {
         if (this.llIlI == null && this.lll == null) {
            this.llIlI = var1.field_1724;
            this.lll = var1.field_1687;
            return true;
         } else if (!this.lIIIl(var1)) {
            this.IIIllI(var1);
            this.llIlI = var1.field_1724;
            this.lll = var1.field_1687;
            return false;
         } else {
            return true;
         }
      } else {
         if (this.llIlI != null || this.lll != null) {
            this.IIIllI(var1);
         }

         return false;
      }
   }

   private boolean IIIlIl(class_2680 var1) {
      return var1 != null
         && (
            var1.method_27852(class_2246.field_10167)
               || var1.method_27852(class_2246.field_10425)
               || var1.method_27852(class_2246.field_10025)
               || var1.method_27852(class_2246.field_10546)
         );
   }

   private void IIIllI(class_310 var1) {
      k74.x.IIll.lllIl(var1, this, lllIII.I);
      this.llIII();
      this.IIllI = false;
      this.IIIlI = 0;
      this.IIII.clear();
      this.IlIl.clear();
      this.IllI = null;
      this.IlIll = 0;
      this.IIll = lIIlIl(-476329589, 508589731 ^ -1787513718);
      this.lIllI = null;
      this.lIl = lIIlIl(-476329590, 508589731 ^ 806239076);
      this.llI = 0L;
      this.Illl = false;
      this.llllI();
      this.IlIIIl();
      this.IllIII();
      this.III = false;
      this.IIl = lIIlIl(-476329587, 508589731 ^ -1075884154);
      this.llIlI = null;
      this.lll = null;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1390345018;
      int var10001 = "ñҡ쐗ʡꐜ߱萈̩ꐙɡАֱ␂ƹ萄֩␞©䐂ű쐗ñ␛Չ\ue404\u0011ЎıꐞΉ搌Չ萀ә쐃Á\ue409ܹ␂؉搜߱쐉ՙ␆ٹ搌Éꐊș\ue415ǡЁ҉ГiꐚܑЎɩ搞1萊ԁ搝ߑКޑ␂Ź萅Љꐏԉ搕ʁ搎݁䐒ف쐜Ł␌ʁ搔̩萏šꐘʑ\ue418I䐄Łꐚũ␂́쐑Ĺꐓρꐔ9ОЙ␔ѹ萐\u0001␜ҁЕ֡萎ơ萐Ɂ\ue401ӑ␙ԩ䐁ݡꐇÁ쐂\u0089␕ʩ萏С\ue418!쐍ڡ搜ݹ䐙\u0011搈\u0019\ue404\u0601萃ء萎ʩ\ue40dٱ\ue403ͩ搕ȑꐕȱ쐕űꐜę\ue41dY␘ޑ쐑̉萟ڙОȉБ́ЂǑꐀƩ\ue41aׁМ\u0089\ue413\u0081␄ש萈ő␂С\ue41aʱЙױ␜ͩ␏ɩ쐂ى\ue418ͩꐀי␇É␝݉ꐛѡ䐅Ĺ\ue403ܑОԁ搖ՙ萂ב搂\u05f9搃ș\ue40dι␉ԡ␐ơ␁ҡ搕י搙iЁ٩쐍)搈ҙꐇۉ\u0015㟞飓㚾\ud8d4㌾\uf8ce㞶\uf8c8㙆\uf8c0〞\ud8c5㗎壁㞖\uf8d7㎆㣐㎆룅㜆"
         .length();
      String[] var9 = new String[2];
      short var12 = 32523;
      int var8 = var10001;
      int var11 = 0;
      int var10 = 0;
      String var7 = "ñҡ쐗ʡꐜ߱萈̩ꐙɡАֱ␂ƹ萄֩␞©䐂ű쐗ñ␛Չ\ue404\u0011ЎıꐞΉ搌Չ萀ә쐃Á\ue409ܹ␂؉搜߱쐉ՙ␆ٹ搌Éꐊș\ue415ǡЁ҉ГiꐚܑЎɩ搞1萊ԁ搝ߑКޑ␂Ź萅Љꐏԉ搕ʁ搎݁䐒ف쐜Ł␌ʁ搔̩萏šꐘʑ\ue418I䐄Łꐚũ␂́쐑Ĺꐓρꐔ9ОЙ␔ѹ萐\u0001␜ҁЕ֡萎ơ萐Ɂ\ue401ӑ␙ԩ䐁ݡꐇÁ쐂\u0089␕ʩ萏С\ue418!쐍ڡ搜ݹ䐙\u0011搈\u0019\ue404\u0601萃ء萎ʩ\ue40dٱ\ue403ͩ搕ȑꐕȱ쐕űꐜę\ue41dY␘ޑ쐑̉萟ڙОȉБ́ЂǑꐀƩ\ue41aׁМ\u0089\ue413\u0081␄ש萈ő␂С\ue41aʱЙױ␜ͩ␏ɩ쐂ى\ue418ͩꐀי␇É␝݉ꐛѡ䐅Ĺ\ue403ܑОԁ搖ՙ萂ב搂\u05f9搃ș\ue40dι␉ԡ␐ơ␁ҡ搕י搙iЁ٩쐍)搈ҙꐇۉ\u0015㟞飓㚾\ud8d4㌾\uf8ce㞶\uf8c8㙆\uf8c0〞\ud8c5㗎壁㞖\uf8d7㎆㣐㎆룅㜆";

      do {
         char var13 = var7.charAt(var11);
         char[] var10000 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;
         char[] var14 = var10000;

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << '\r') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> '\r') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      llllI = var9;
      lllll = new Object[var9.length];
      lllIl = new int[362];
      int var20 = 0;
      int var23 = 0;
      byte[] var10002 = "ÆÛ\u0003*ùÅY~\\WÃ¢\u008e\u008aÐ\u009f\u0004>¥\u001aÚ\f\u008f}N3ÚuÜÌI¿ºj]\u0085]\u001b!\u009bóZwfÆ~Ãt\u000b8ä\u0089m\u0015ééÖÊÁëú?-õ\u0007m\u000eOöéÌ\u0096ÌW\u0006ë»c\u0087Ôòóuå¹Y ¨\u0091\u008dß\u008a\u000fs\u0013ZJRò\u0004.*\u0092Eq\u001b\u0006MÖ4\u0016ê\u0005f¼M\u0089\u0012|$1¢\t\nQ®N\u009eÃ¼^Ä-\u001dÊR\u0082\u0096x[5ìê\u009am\u001fâë©<z\u009e\u008báV¶\u009b)\u000bÍè\u0096-ï\u0081\u00156<\u009c\u0013\u0003\"&@\u0018\r}©M«\u001e\u007f\u009d÷\u0081\u00942kÈz\u001dÙ!\u0094j\u0004\u0085\t\u0018}ô \u0007ÒA\u0092Í²\u0014\u0091À\u009d\t\u001eä³V1.ª\u0000Ñ)m\u008cn\u0097óÃMáö3×@þ4vÞô\u0080;\bÐëµ\u0089Ã\u00009÷_ëçý=zñx§nñÔè\u0099}Q{ÉÉÆ\u001eÚL%XÔË\u0006\buj\u0090ö|A¡ÞLQ*\n\u007f&\u0013Â!¨·\u0017\u001d\u0092Ã\u0087Ê\u009d1¹wò2\u008f\u0002\u0007t¢Ä÷'f¼\u0019¸*ØÀ02z\u0092ÌRjl\u0010\u0017\u009b\u0098\u0001db©@\u0081&;D\u0094Ë\u009fªxÎÑùÊ\u007f\u008eÃ\u0004«ÑZ+º³\u0011èÒÿÖ\u0086Ú\u0019ú\u0014\u0097 '·®N\u001dÒ½2}Y\u0084:q\u0084þ@\b~ú$Mþ[\u00116\u0014¨£º¬ã\u001aT!\n±2¹Zp\u0007;\tL\u007f©E&r]\u0018'#Ú\u0010\u0096í¶Ä\u0003Ú\u008at¢¤M\nõ¢&òJYK©géPÿ\u009bh\u000b\u001cq\u0090\u0081ø<\u009b\u0007ýSeò\u0019ß<@¦BXÙw\u007frì¼>Ú\u0090³d\u001d\r\u0004gé<\u0086ãA\u0086\u009eò4èzæy¾¦\u0002a{Ã\u0090\u007fuÊô\u0013f\u0088ÿ\u0093\u0015\u008b\u0010\u000f~Õ\u0083ÔN.\"\u009e\u000f#ê$>=\u008cÒ\u0003S\u008dÐ\u0012D¢\rÚ\u0017à\u008bül\u0002¯d®V\b@\u001eò\u0094ÔUr\n\u001fc6=\u008bbÏ>&&Eõ±\u0004'£&ÈãÎ+ðª4¯³@ûÛñ¼£÷dq6£ÏÍ\u001f,\u00999Ï-\u0082\u001cëë¤\u0096j¬`9o\u0018ç\u001c±\u0081\u0019E\u00adQ<ÞÂÀ\u008erÍÁ\u0094â\u009bsÞ\u001dµ46\u001f|ê\u0084è\u0011?iÌAÁTáBÔï,q\u0097Ú\u0012é.\u008di-}¶q\\©\u0085§\r0ozuÏù9±æè\u0092'×´Hkk²î¾²\u0093 \u008c$~Âì2÷ÜâlODø¹\u008a\u0017Ø¿}9Q\u009e{J_$õ|$hn ªÁ\u008a¤ð%+\u000e\u0000\u008cq~a\u001aeÓÈÆ\u008bwÑ\u0084Ål\u0003D»\u0095\n;\u009b\r\u0010\u0002²\u000bßå¯á\u000e)Y\u0080[`:\u008bÂWßâ\u0082Y³\u008f\u0084äpKQ\u000bJ4\u0005MJ*W[0h\u0010\u000fyÒø(\u0000àå\u0005â´Ù\u009aI+a\u000e\u0002ïE\u000f×j\u0080\u0091$à\u0014\u0012w7l\u0090\u0086s\nÒ\u009aÛX\u0098HsY\u0096Ë\u009f~\u0002µ¤c\u009cñ\u0085®\u009f3\u008bFç_Î4¯0Òª*\u008f\u000e\u0084úFµB\u0089£-Dà¦\u0081k2:l\u0014à½\u0086\bq4Å}:«\u0085æèsÖ\u0001Æ®9¯?\u009aoM{\u0095#Æ]\u0094r\u0004\u0013ãa2ÖF`2ÄócC\u009fv+!%\u001c\u0084\u008cÍËÙiÈVCc\u0088ò\u0081\u0002æöø>S \u0098_Â¯Úp,Ø¿\u0019îhóá'\u0006ãÂ\u0004Õ\u0017ZId¦iúc\u0014\u009e\u009aqvYm2×\t÷9 üÒ>e¾a\u00ad\u001f\u0005\u008a·êÖÜ\u001fýÂi`\u001f_î\u009aK\t\u008a\u009f²\\ÞRäà\u007f\u0014NÑ'¤TZê±K@hkÉGÕm\u001bòUþ\u0001ª×,H°Þ>Ó?\u00177\"£ÚFE;C\u008d\u0090\u0093§Î\u009c\u009d\\Ä\u008b¨ù)á\u001c\u0090\u0006áèçÑd¨·ÇJÎ{¨jxQ 1\u00909)À,\u0086*þ\rÿ\u0080\u009a\u0014\"þ%xU|S\u0019Åê¸\u0082Vp*ÚúÎ\u001e:ão.\u0082\u0088\u001f¥FR\u000e;Õ\u001fU\u0003Ü\u0082ð\u008a\u008eØÔqAí\u000e\u0000\u0005-ö\u0004dÝ\u0017¥\u0088½>6ì\u0013à%7t\u0086\u007fØ\u0085\u008eÂzQ\u0092²ëHx\u001b\"\u0003\u0082¹ý(¸\u0002ær\u0013Ó<Çë§U¢1ø7N\u0017\u000eî\u0098\u0091\u009b\u007fìò\u0098Eld£É\r\u001c÷\u008a°\u009886*»W\u0001Û\u0006û\u0081aÙ¬ÂÜÞ¯2Å(tt\u0098Ã%8Îâ\nNI\u0015\tb^°sí±?¢\u0099T9<E¾,Ý@ÖÀ;p».P}\u0091\u009c\u009a\u008ed6ôG«\u0005ûR¡¡(0Ú\u000eþÍÝ\u0084X×â\u008dùÉcYy3\u0013á&T)qd\u000fuòÕ\u0003µ#\u0012LBI9\u0012¢ë%\u0018R\u0090j\u0011Yo\u008d¬J\u0013þæ\u0017Çx\u008dü&k§ 'Ì\u0085 g\u0085nÊ;k>ÿ<\f\u0012aº\u0012\b¼\u0000Þ·ò\u0097K¶IäZÝ]\u00adþïªê«F\u008f\u000erÝ\u008a\u0094\u001a'Qº{ò\u0095\u0018|\u0088C"
         .getBytes("ISO-8859-1");

      int var54;
      do {
         lllIl[var20] = ((var10002[var23] & 255) << 24 | (var10002[var23 + 1] & 255) << 16 | (var10002[var23 + 2] & 255) << 8 | var10002[var23 + 3] & 255)
            ^ 38353685;
         var20 += 1;
         var54 = var23 + 4;
         var23 += 4;
      } while (var54 < var10002.length);

      String[] var5 = new String[lIIlIl(-476329502, var17 ^ -1395233716)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIIllI(2079409658, -1959701660, -1119147721, 1984483608)).length();
      int var1 = lIIlIl(-476329499, var17 ^ -896760906);
      int var19 = -1;

      label92:
      while (true) {
         var20 = lIIlIl(-476329500, var17 ^ -1036967766);
         String var26 = var2.substring(++var19, var19 + var1);
         byte var38 = -1;

         while (true) {
            label87: {
               char[] var56 = var26.toCharArray();
               int var68 = var56.length;
               int var6 = 0;
               var54 = var20;
               var43 = var56;
               var23 = var68;
               char[] var80;
               int var87;
               if (var68 <= 1) {
                  var80 = var56;
                  var68 = var20;
                  var87 = var6;
               } else {
                  var54 = var20;
                  var23 = var68;
                  if (var68 <= var6) {
                     break label87;
                  }

                  var80 = var56;
                  var68 = var20;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % lIIlIl(-476329480, var17 ^ -185483947)) {
                     case 0 -> lIIlIl(-476329477, var17 ^ 1595959265);
                     case 1 -> lIIlIl(-476329478, var17 ^ -1487663275);
                     case 2 -> lIIlIl(-476329475, var17 ^ 2097901053);
                     case 3 -> lIIlIl(-476329476, var17 ^ 1543353469);
                     case 4 -> lIIlIl(-476329473, var17 ^ -580377288);
                     case 5 -> lIIlIl(-476329474, var17 ^ -1100275741);
                     default -> lIIlIl(-476329487, var17 ^ 676369311);
                  });
                  var6++;
                  if (var54 == 0) {
                     var87 = var54;
                     var80 = var43;
                     var68 = var54;
                  } else {
                     if (var23 <= var6) {
                        break;
                     }

                     var80 = var43;
                     var68 = var54;
                     var87 = var6;
                  }
               }
            }

            String var61 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var5[var3++] = var61;
                  if ((var19 += var1) >= var4) {
                     lllII = var5;
                     llll = new String[lIIlIl(-476329479, var17 ^ -833968629)];
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var61;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label92;
                  }

                  var4 = (var2 = lIIllI(633455054, -1959701659, 1930556409, -216897197)).length();
                  var1 = lIIlIl(-476329497, var17 ^ -566120331);
                  var19 = -1;
            }

            var20 = lIIlIl(-476329498, var17 ^ 887650525);
            var26 = var2.substring(++var19, var19 + var1);
            var38 = 0;
         }
      }
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (this.IIIlII(var1)) {
         this.IIllll(var1);
         if (this.IIllI || this.lIIlI()) {
            this.IIlIll(var1);
         }

         this.II(var1);
         this.Ill(var1);
      }
   }

   private class_3965 IIIlll(class_2338 var1) {
      return var1 == null ? null : new class_3965(this.Illlll(var1), class_2350.field_11036, var1, false);
   }

   private long IIlIII(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();
      return var2 == var4 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private boolean IIlIIl(class_310 var1, class_2338 var2) {
      class_2680 var3 = var1.field_1687.method_8320(var2);
      return var3 != null && !var3.method_26215() && var3.method_26227().method_15769() && !var3.method_26220(var1.field_1687, var2).method_1110();
   }

   private class_2338 IIlIlI(class_310 var1, class_243 var2, class_243 var3) {
      class_243 var4 = var2;
      class_243 var5 = var3;

      for (int var6 = 0; var6 < lIIlIl(-476329588, -588971980 ^ -67834566); var6++) {
         class_243 var7 = var4.method_1019(var5);
         class_3965 var8 = var1.field_1687.method_17742(new class_3959(var4, var7, class_3960.field_17558, class_242.field_1348, var1.field_1724));
         if (var8 != null && var8.method_17783() == class_240.field_1332) {
            return this.lIlll(var1, var8);
         }

         var4 = var7;
         var5 = var5.method_1021(0.99).method_1023(0.0, 0.05, 0.0);
      }

      return null;
   }

   private void IIlIll(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         this.IIl = Math.max(this.IIl, k74.x.IIll.IlllIl(var1));
      }
   }

   private boolean IIllII(class_310 var1, class_2338 var2) {
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var2 != null) {
         class_2680 var3 = var1.field_1687.method_8320(var2);
         class_2338 var4 = var2.method_10074();
         class_243 var5 = this.IlIlII(var2);
         return var1.field_1687.method_8621().method_11952(var2)
            && var1.field_1687.method_8621().method_11952(var4)
            && (var3.method_26215() || var3.method_45474())
            && this.IIlIIl(var1, var4)
            && var1.field_1724.method_33571().method_1025(var5) <= 20.25
            && this.IlIIlI(var1, this.IIIll(var2), var4);
      } else {
         return false;
      }
   }

   private static String lIIllI(int var0, int var1, int var2, int var3) {
      int var8 = var1 ^ -1959701660;
      char[] var7 = llllI[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])lllll[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         lllll[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 14533;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ '뛚' ^ var2 ^ var0 ^ var3 ^ var1 ^ var5);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   private boolean IIllIl(class_310 var1, long var2, class_2338 var4, int var5) {
      if (var2 == this.lllI && this.IlllI != null && this.IlllI.equals(var4)) {
         this.IlIlI = lIIlIl(-476329585, -324012552 ^ 1583289693);
         if (this.lIIIIl(var1, var4)) {
            this.lIlIl(var1, var5);
            return true;
         } else if (this.llIlI(var1, var4)) {
            this.IllIII();
            this.IllIl = var1.field_1724.field_6012 + lIIlIl(-476329586, -324012552 ^ 850994473);
            return true;
         } else {
            this.IIlll(var1, var5);
            return false;
         }
      } else {
         return false;
      }
   }

   private int IIlllI(class_1657 var1) {
      for (int var2 = 0; var2 < lIIlIl(-476329599, 1138780963 ^ 1939715796); var2++) {
         class_1799 var3 = var1.method_31548().method_5438(var2);
         if (this.lIlI(var3)) {
            return var2;
         }
      }

      return -1;
   }

   private void IIllll(class_310 var1) {
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null) {
         class_746 var2 = var1.field_1724;
         class_1799 var3 = var2.method_6030();
         if (var2.method_6115() && this.lIII(var3)) {
            this.lII = class_1753.method_7722(var2.method_6048());
            this.lIlII = this.lII >= 0.1F;
         } else {
            if (this.lIlII) {
               this.IIlII(var1);
            }

            if (this.IIllI) {
               this.IIIlI++;
               if (this.IIIlI > lIIlIl(-476329600, 622790272 ^ -1482151796) || this.IlllI != null) {
                  this.IIllI = false;
                  return;
               }

               for (class_1297 var5 : var1.field_1687.method_18112()) {
                  if (var5 instanceof class_1665 var6
                     && var6.field_6012 <= lIIlIl(-476329597, 622790272 ^ 231137614)
                     && var6.method_5809()
                     && !this.IIII.contains(var6.method_5667())
                     && !this.IlIl.contains(var6.method_5667())) {
                     double var7 = var6.method_5858(var2);
                     if (var7 < 25.0
                        && (var6.method_24921() == var2 || var6.method_24921() == null && var6.field_6012 <= 3 && var7 < 9.0)
                        && this.lllIl(var1, new class_243(var6.method_23317(), var6.method_23318(), var6.method_23321()), var6.method_18798())) {
                        this.IllII(var6.method_5667());
                        this.IIIIll(var1);
                        this.IIllI = false;
                        this.IIII.clear();
                        break;
                     }
                  }
               }
            }
         }
      } else {
         this.llIII();
         this.IIllI = false;
      }
   }

   @Override
   public void llllII(class_2596<?> var1) {
      if (var1 instanceof class_2846 var2 && var2.method_12363() == class_2847.field_12974) {
         class_310 var3 = class_310.method_1551();
         if (var3 != null && var3.field_1724 != null && this.lIlII) {
            this.IIlII(var3);
         }
      }
   }

   private boolean IlIIII(class_310 var1, class_2338 var2) {
      return IlllIlII.IIlIlI(var1, this.IIIlll(var2));
   }

   private void IlIIIl() {
      this.llIl = -1;
      this.lIIlI = 0;
   }

   private boolean IlIIlI(class_310 var1, class_243 var2, class_2338 var3) {
      class_3965 var4 = var1.field_1687
         .method_17742(new class_3959(var1.field_1724.method_33571(), var2, class_3960.field_17559, class_242.field_1348, var1.field_1724));
      return var4 != null && var4.method_17777().equals(var3);
   }

   private void IlIIll(class_310 var1, IIIIIIII var2) {
      if (this.IllI == var2) {
         this.IlIll++;
         this.IllIII();
         if (this.IlIll > lIIlIl(-476329598, -557528226 ^ -988661355)) {
            this.IllI = null;
            this.IIll = lIIlIl(-476329595, -557528226 ^ -507421699);
            this.IIIlI(var1);
            this.lIIIlI(var1, var2.l());
         }
      }
   }

   private class_243 IlIlII(class_2338 var1) {
      return class_243.method_24955(var1);
   }

   private boolean IlIlIl(class_310 var1, int var2) {
      if (var1 != null && var1.field_1724 != null && var2 >= 0 && var2 < lIIlIl(-476329596, -1278304675 ^ -1558318109)) {
         if (!this.ll.II(var2)) {
            boolean var3 = k74.x.IIll.lIIlI(var1) != var2;
            long var4 = var3 ? this.IIlIII(this.IIIl) : 0L;
            this.ll.Il(var2, System.currentTimeMillis(), var4);
         }

         return this.ll.I(var2, System.currentTimeMillis());
      } else {
         return false;
      }
   }

   private class_2338[] IlIllI(class_3965 var1) {
      class_2338 var2 = var1.method_17777();
      class_2350 var3 = var1.method_17780();
      if (var3 == class_2350.field_11036) {
         return new class_2338[]{
            var2.method_10084(),
            var2.method_10095().method_10084(),
            var2.method_10072().method_10084(),
            var2.method_10078().method_10084(),
            var2.method_10067().method_10084()
         };
      } else {
         return var3.method_10166().method_10179()
            ? new class_2338[]{
               var2.method_10093(var3),
               var2.method_10084(),
               var2.method_10093(var3).method_10084(),
               var2.method_10093(var3.method_10170()).method_10084(),
               var2.method_10093(var3.method_10160()).method_10084()
            }
            : new class_2338[]{var2.method_10093(var3), var2.method_10084()};
      }
   }

   public llIIlll() {
      int var1 = 1333077387;
      super(
         IlIIllIII.Ill(llI(lIIlIl(-476329593, var1 ^ -721396787), lIIlIl(-476329594, var1 ^ 593429919))),
         lllIIlIl.I,
         IlIIllIII.Ill(llI(lIIlIl(-476329575, var1 ^ 136429375), lIIlIl(-476329576, var1 ^ -1333855009)))
      );
      this.lIlIl = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(llI(lIIlIl(-476329573, var1 ^ 540836703), lIIlIl(-476329574, var1 ^ 1551089794))), IIIIlIlII.class, IIIIlIlII.I)
      );
      this.IlI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(llI(lIIlIl(-476329571, var1 ^ 1917501548), lIIlIl(-476329572, var1 ^ 409045217))), 50.0, 1.0, 100.0, 1.0).lIlI(this::IIIIII)
      );
      this.llII = new IlIIIllll();
      this.lIIll = 0L;
      this.IIlII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(llI(lIIlIl(-476329569, var1 ^ -1166175133), lIIlIl(-476329570, var1 ^ 1053606059))), true));
      this.IIIl = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(llI(lIIlIl(-476329583, var1 ^ 1054154863), lIIlIl(-476329584, var1 ^ -1118187958))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(llI(lIIlIl(-476329581, var1 ^ -1776287290), lIIlIl(-476329582, var1 ^ 1999839650))))
      );
      this.IlII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(llI(lIIlIl(-476329579, var1 ^ 1989413250), lIIlIl(-476329580, var1 ^ 920512271))), false));
      this.IIlll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(llI(lIIlIl(-476329577, var1 ^ 1781773018), lIIlIl(-476329578, var1 ^ 1834247906))), 9.0, 1.0, 9.0, 1.0).lIlI(this.IlII::IllI)
      );
      this.IIII = new HashSet<>();
      this.IlIl = new HashSet<>();
      this.IIll = lIIlIl(-476329559, var1 ^ 1800047970);
      this.lIIII = -1;
      this.I = lIIlIl(-476329560, var1 ^ -779734483);
      this.IlIlI = lIIlIl(-476329557, var1 ^ 1175663509);
      this.IIIII = lIIlIl(-476329558, var1 ^ 889346176);
      this.IllIl = lIIlIl(-476329555, var1 ^ 2091281008);
      this.lllI = Long.MIN_VALUE;
      this.IIl = lIIlIl(-476329556, var1 ^ 1005830996);
      this.llIl = -1;
      this.ll = new IlIIlll();
      this.lIl = lIIlIl(-476329553, var1 ^ -550873006);
      this.llI = 0L;
   }

   private boolean IlIlll(class_243 var1, class_243 var2, class_2338 var3, class_2338 var4) {
      if (var1 != null && var2 != null && var3 != null && var4 != null) {
         class_238 var5 = new class_238(var3);
         class_238 var6 = new class_238(var4).method_1009(0.5, 0.5, 0.5);
         class_243 var7 = var1;
         class_243 var8 = var2;

         for (int var9 = 0; var9 < lIIlIl(-476329554, 1056192150 ^ -1262241451); var9++) {
            class_243 var10 = var7.method_1019(var8);
            if (var6.method_992(var7, var10).isPresent()) {
               return false;
            }

            if (var5.method_992(var7, var10).isPresent()) {
               return true;
            }

            var7 = var10;
            var8 = var8.method_1021(0.99).method_1023(0.0, 0.05, 0.0);
         }

         return false;
      } else {
         return false;
      }
   }

   private void IllIII() {
      this.lIlll = null;
      this.ll.l();
   }

   private int IllIIl(class_1657 var1) {
      return this.lllII(var1, class_1802.field_8069);
   }

   static boolean IllllI(class_2338 var0, class_243 var1) {
      if (var0 != null && var1 != null) {
         double var2 = var0.method_10263() + 0.5;
         double var4 = var0.method_10260() + 0.5;
         return Math.abs(var1.field_1352 - var2) <= 0.3 && Math.abs(var1.field_1350 - var4) <= 0.3;
      } else {
         return false;
      }
   }

   private class_243 Illlll(class_2338 var1) {
      return class_243.method_24955(var1).method_1031(0.0, 0.125, 0.0);
   }

   private static String lIIIII(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   private boolean lIIIIl(class_310 var1, class_2338 var2) {
      if (var1 != null && var1.field_1687 != null && var2 != null) {
         class_238 var3 = new class_238(
            var2.method_10263() + 0.2,
            var2.method_10264() - 0.25,
            var2.method_10260() + 0.2,
            var2.method_10263() + 0.8,
            var2.method_10264() + 1.25,
            var2.method_10260() + 0.8
         );
         return !var1.field_1687.method_8390(class_1701.class, var3, llIIlll::ll).isEmpty();
      } else {
         return false;
      }
   }

   private void lIIIlI(class_310 var1, int var2) {
      if (var1 != null && var1.field_1724 != null && var2 >= 0 && var2 < lIIlIl(-476329567, 844055244 ^ -1776742369)) {
         if (!this.IIlII.IllI()) {
            k74.x.IIll.lllIl(var1, this, lllIII.I);
            this.IlIIIl();
            this.IllIII();
         } else {
            this.IllIII();
            this.llIl = var2;
            this.lIIlI = var1.field_1724.field_6012 + (this.lIlIl.IllI() == IIIIlIlII.l ? 1 : 0);
         }
      }
   }

   private static int lIIlIl(int var0, int var1) {
      int var2 = lllIl[var0 ^ -476329783] ^ var1 ^ var0;
      var2 -= 7851;
      var2 ^= 58522;
      var2 ^= 6042;
      var2 += 5933;
      var2 -= 5135;
      var2 -= 49345;
      return var2 + 63077;
   }

   private void lIIIll(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         if (!this.IIlII.IllI()) {
            k74.x.IIll.lllIl(var1, this, lllIII.I);
         } else {
            int var2 = this.llIl;
            if (var2 < 0 && this.lIllI != null) {
               var2 = this.lIllI.Il();
            }

            if (var2 < 0 && this.lIIII >= 0) {
               var2 = this.lIIII;
            }

            if (var2 < 0 && this.IllI != null) {
               var2 = this.IllI.l();
            }

            if (var2 >= 0 && var2 < lIIlIl(-476329568, -2083491744 ^ -2055120796)) {
               k74.x.IIll.llIllI(var1, this, var2);
            } else {
               k74.x.IIll.lllIl(var1, this, lllIII.II);
            }
         }
      }
   }

   private int lIIlII(lIlllIl var1) {
      return IlIIlll.lI(this.IIlIII(var1));
   }
}
