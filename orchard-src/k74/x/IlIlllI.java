package k74.x;

import com.google.gson.JsonObject;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;

@Environment(EnvType.CLIENT)
public final class IlIlllI extends IlIIIIIIl {
   private static final double II = 4.5;
   private long Il;
   private class_3965 lI;
   private static final Object[] IIIlI;
   private static final String[] IIIIl;
   private static final String[] ll;
   private static final int III = 20;
   private int IIl;
   private int IlI;
   private static final int Ill = 9;
   private int lII;
   private static final int lIl = 1;
   private IIlIlIII llI;
   private final lIlllIl lll;
   private static final long IIII = 50L;
   private int IIIl;
   private int IIlI;
   private final lIlllIl IIll;
   private boolean IlII;
   private static final double IlIl = 0.125;
   private static final String IllI;
   private int Illl;
   private static final double lIII = 20.25;
   private final lllIIlII lIIl;
   private static String[] lIlI;
   private boolean lIll;
   private static final int[] I;
   private int llII;
   private boolean llIl;
   private static final String[] lllI;
   private long llll;
   private class_2338 IIIII;

   private void I(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      int var3 = this.IIlI >= 0 ? this.IIlI : this.Illl;
      if (var1 != null && var1.field_1724 != null) {
         if (this.lIIl.IllI() && var3 >= 0 && var3 < IIlII(-664065689, -1164532954 ^ -1681376036)) {
            k74.x.IIll.llIllI(var1, this, var3);
            if (var2 == null) {
               return;
            }
         }

         k74.x.IIll.lllIl(var1, this, lllIII.I);
      }
   }

   private int II(class_1657 var1) {
      return this.IIIl(var1, class_1802.field_8069);
   }

   private void Il() {
      this.IIIII = null;
      this.IIlI = -1;
      this.llII = -1;
      this.lIll = false;
      this.llI = null;
      this.llll = 0L;
      this.IIl = IIlII(-664065690, -386912287 ^ 1270640799);
      this.lII = IIlII(-664065691, -386912287 ^ 851953241);
      this.IlII = false;
      this.IlI = 0;
   }

   private boolean lI(class_2680 var1) {
      return var1 != null
         && (
            var1.method_27852(class_2246.field_10167)
               || var1.method_27852(class_2246.field_10425)
               || var1.method_27852(class_2246.field_10025)
               || var1.method_27852(class_2246.field_10546)
         );
   }

   public void ll(class_310 var1, class_1268 var2, class_3965 var3, class_1269 var4) {
      if (this.IIIl != IIlII(-664065692, 1511384038 ^ 874337081)) {
         try {
            if (this.IIIIlIl()
               && !this.llIl
               && !this.l()
               && var4 != null
               && var4.method_23665()
               && var1 != null
               && var1.field_1724 != null
               && var1.field_1687 != null
               && var1.field_1761 != null
               && var2 == class_1268.field_5808
               && var1.field_1724.field_6012 == this.IIIl
               && k74.x.IIll.IllllI() > this.Il) {
               class_3965 var5 = this.lI != null ? this.lI : var3;
               class_2338 var6 = this.Ill(var1, var5);
               if (var6 != null) {
                  this.IIlI(var6, this.Illl);
                  this.IIl(var1);
               }

               return;
            }
         } finally {
            this.llII();
         }
      }
   }

   private int III(lIlllIl var1) {
      return Math.max(0, (int)Math.ceil(this.lIll(var1) / 50.0));
   }

   private void IIl(class_310 var1) {
      int var5 = -795198862;
      if (this.IIIII != null) {
         if (this.l()) {
            this.IllI(var1);
         } else if (!this.IIll(var1)) {
            this.I(var1);
            this.Il();
         } else if (this.lII != IIlII(-664065693, var5 ^ -1521890764)) {
            if (var1.field_1724.field_6012 >= this.lII) {
               this.I(var1);
               this.Il();
            }
         } else if (this.IIl != IIlII(-664065694, var5 ^ 1724321973)) {
            if (var1.field_1724.field_6012 > this.IIl) {
               this.IIl = IIlII(-664065695, var5 ^ -963469017);
               this.llll = System.currentTimeMillis() + 50L;
            }
         } else if (System.currentTimeMillis() >= this.llll) {
            class_2338 var2 = this.IIIII;
            if (!this.lI(var1.field_1687.method_8320(var2))) {
               this.lllI(var1);
            } else if (!this.lIIl(var1, var2)) {
               this.lIlI(var1);
            } else {
               if (this.llII < 0) {
                  this.llII = this.II(var1.field_1724);
               }

               if (!this.lIll) {
                  if (this.llII < 0 || !this.lIII(var1, this.llII)) {
                     this.lIlI(var1);
                     return;
                  }

                  if (this.llI == null || !k74.x.IIll.IIIII(var1, this.llI) || this.llI.III() != this.llII) {
                     boolean var3 = k74.x.IIll.lIIlI(var1) != this.llII;
                     int var4 = var3 ? this.III(this.lll) : 0;
                     this.llI = k74.x.IIll.llII(var1, this, this.llII, var4, true);
                  }

                  if (!this.llI.IIl()) {
                     this.llI = null;
                     this.llll = System.currentTimeMillis() + 50L;
                     return;
                  }

                  if (!k74.x.IIll.IIIllII(var1, this.llI)) {
                     return;
                  }

                  this.llI = null;
                  this.lIll = true;
               }

               if (this.lII(var1, var2)) {
                  this.lIl(var1, var2);
               } else {
                  float[] var6 = IlllIlII.lIII(var1, this.Illl(var2));
                  if (var6 == null) {
                     this.lllI(var1);
                  } else {
                     this.IIl = var1.field_1724.field_6012 + 1;
                     boolean var7 = IlllIlII.IlII(var1, IIlII(-664065696, var5 ^ 1781620947), var6[0], var6[1], this::IIIIl);
                     if (!var7) {
                        this.IIl = IIlII(-664065681, var5 ^ 782823358);
                        this.llll = System.currentTimeMillis() + 50L;
                     }
                  }
               }
            }
         }
      }
   }

   private class_2338 Ill(class_310 var1, class_3965 var2) {
      if (var1 != null && var1.field_1687 != null && var2 != null) {
         class_2338 var3 = var2.method_17777();
         class_2338 var4 = var3.method_10093(var2.method_17780());
         if (this.lI(var1.field_1687.method_8320(var4))) {
            return var4.method_10062();
         } else {
            return this.lI(var1.field_1687.method_8320(var3)) ? var3.method_10062() : var4.method_10062();
         }
      } else {
         return null;
      }
   }

   private static String IIllI(int var0, short var1, char var2) {
      int var3 = var2 ^ '袮';
      char[] var4 = IIIIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIIlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIIlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 25219;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '馮';
         var10 -= 57948;
         var10 += 15871;
         var10 += 50393;
         var10 += 8157;
         var10 ^= 13232;
         var10 += 5112;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private boolean lII(class_310 var1, class_2338 var2) {
      return this.IIll(var1) && var2 != null
         ? var1.field_1724.method_5745(4.5, 1.0F, false) instanceof class_3965 var4
            && var4.method_17783() == class_240.field_1332
            && var4.method_17777().equals(var2)
            && var4.method_17780() == class_2350.field_11036
            && this.lI(var1.field_1687.method_8320(var2))
         : false;
   }

   private boolean lIl(class_310 var1, class_2338 var2) {
      this.IIl = IIlII(-664065682, -349449922 ^ -1852003844);
      if (this.l()) {
         this.IllI(var1);
         return false;
      } else if (this.IIIII != null
         && this.IIIII.equals(var2)
         && !this.IlII
         && this.lIIl(var1, var2)
         && this.lII(var1, var2)
         && this.llII >= 0
         && this.IlII(var1.field_1724.method_31548().method_5438(this.llII))) {
         class_3965 var3 = new class_3965(this.Illl(var2), class_2350.field_11036, var2, false);
         if (k74.x.IIll.lIIlI(var1) != this.llII) {
            this.lllI(var1);
            return false;
         } else {
            long var4 = k74.x.IIll.IllllI();
            boolean var6 = k74.x.IIll.IlI();
            if (!var6) {
               this.lllI(var1);
               return false;
            } else {
               class_1269 var7;
               try {
                  this.llIl = true;

                  try {
                     var7 = var1.field_1761.method_2896(var1.field_1724, class_1268.field_5808, var3);
                  } finally {
                     this.llIl = false;
                  }
               } finally {
                  k74.x.IIll.lIl();
               }

               if (var7 != null && var7.method_23665()) {
                  var1.field_1724.method_6104(class_1268.field_5808);
               }

               this.IlII = k74.x.IIll.IllllI() != var4;
               if (!this.IlII) {
                  this.lllI(var1);
                  return false;
               } else {
                  this.lIlI(var1);
                  return true;
               }
            }
         }
      } else {
         this.lllI(var1);
         return false;
      }
   }

   private static String llI(int var0, int var1) {
      int var9 = -1151655297;
      int var2 = (var0 ^ IIlII(-664065683, var9 ^ -294896610)) & IIlII(-664065684, var9 ^ -1484058669);
      if (lllI[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & IIlII(-664065685, var9 ^ 1542634996)) {
            case 0 -> IIlII(-664065686, var9 ^ 196738628);
            case 1 -> IIlII(-664065687, var9 ^ 753239732);
            case 2 -> IIlII(-664065688, var9 ^ -563656404);
            case 3 -> IIlII(-664065673, var9 ^ 1774706269);
            case 4 -> 1;
            case 5 -> IIlII(-664065674, var9 ^ 854864329);
            case 6 -> IIlII(-664065675, var9 ^ -1680519830);
            case 7 -> IIlII(-664065676, var9 ^ 442980681);
            case 8 -> IIlII(-664065677, var9 ^ -359511247);
            case 9 -> IIlII(-664065678, var9 ^ 288072105);
            case 10 -> IIlII(-664065679, var9 ^ 1734654866);
            case 11 -> IIlII(-664065680, var9 ^ -54844033);
            case 12 -> IIlII(-664065665, var9 ^ -851943084);
            case 13 -> IIlII(-664065666, var9 ^ -814945298);
            case 14 -> IIlII(-664065667, var9 ^ 995493798);
            case 15 -> IIlII(-664065668, var9 ^ -828301931);
            case 16 -> IIlII(-664065669, var9 ^ 1726489659);
            case 17 -> IIlII(-664065670, var9 ^ -1851792482);
            case 18 -> IIlII(-664065671, var9 ^ -487399754);
            case 19 -> IIlII(-664065672, var9 ^ 1363273482);
            case 20 -> IIlII(-664065721, var9 ^ 1772077813);
            case 21 -> IIlII(-664065722, var9 ^ -747271148);
            case 22 -> IIlII(-664065723, var9 ^ 547332593);
            case 23 -> IIlII(-664065724, var9 ^ 2118025114);
            case 24 -> IIlII(-664065725, var9 ^ -1437729882);
            case 25 -> IIlII(-664065726, var9 ^ 1873815552);
            case 26 -> IIlII(-664065727, var9 ^ -575453891);
            case 27 -> IIlII(-664065728, var9 ^ 739352968);
            case 28 -> IIlII(-664065713, var9 ^ 1496717910);
            case 29 -> IIlII(-664065714, var9 ^ -1275220080);
            case 30 -> IIlII(-664065715, var9 ^ -1700295315);
            case 31 -> IIlII(-664065716, var9 ^ -1807161501);
            case 32 -> IIlII(-664065717, var9 ^ 816697854);
            case 33 -> IIlII(-664065718, var9 ^ -1863195701);
            case 34 -> IIlII(-664065719, var9 ^ -234555338);
            case 35 -> IIlII(-664065720, var9 ^ 1511484451);
            case 36 -> IIlII(-664065705, var9 ^ -1707180680);
            case 37 -> IIlII(-664065706, var9 ^ -2113876692);
            case 38 -> IIlII(-664065707, var9 ^ 1526181383);
            case 39 -> IIlII(-664065708, var9 ^ 535862604);
            case 40 -> IIlII(-664065709, var9 ^ 2046481326);
            case 41 -> IIlII(-664065710, var9 ^ -7196288);
            case 42 -> 3;
            case 43 -> IIlII(-664065711, var9 ^ 1904656127);
            case 44 -> IIlII(-664065712, var9 ^ 159865948);
            case 45 -> IIlII(-664065697, var9 ^ 1954676913);
            case 46 -> IIlII(-664065698, var9 ^ 1079253769);
            case 47 -> IIlII(-664065699, var9 ^ 2033260263);
            case 48 -> IIlII(-664065700, var9 ^ -68754862);
            case 49 -> IIlII(-664065701, var9 ^ 1509512670);
            case 50 -> IIlII(-664065702, var9 ^ 1465466848);
            case 51 -> IIlII(-664065703, var9 ^ 1291720358);
            case 52 -> IIlII(-664065704, var9 ^ -20937942);
            case 53 -> IIlII(-664065753, var9 ^ -1167513966);
            case 54 -> IIlII(-664065754, var9 ^ 1000437326);
            case 55 -> IIlII(-664065755, var9 ^ 575547439);
            case 56 -> IIlII(-664065756, var9 ^ 29822532);
            case 57 -> IIlII(-664065757, var9 ^ -1310677403);
            case 58 -> IIlII(-664065758, var9 ^ 1631038019);
            case 59 -> IIlII(-664065759, var9 ^ -613478848);
            case 60 -> IIlII(-664065760, var9 ^ -862502078);
            case 61 -> IIlII(-664065745, var9 ^ 231876238);
            case 62 -> IIlII(-664065746, var9 ^ -1425709857);
            case 63 -> IIlII(-664065747, var9 ^ 929606625);
            case 64 -> IIlII(-664065748, var9 ^ 821482075);
            case 65 -> IIlII(-664065749, var9 ^ -1903677581);
            case 66 -> 0;
            case 67 -> IIlII(-664065750, var9 ^ 2127768810);
            case 68 -> IIlII(-664065751, var9 ^ 1594534238);
            case 69 -> IIlII(-664065752, var9 ^ 802412168);
            case 70 -> IIlII(-664065737, var9 ^ -1170600193);
            case 71 -> IIlII(-664065738, var9 ^ -561647958);
            case 72 -> IIlII(-664065739, var9 ^ -525347675);
            case 73 -> IIlII(-664065740, var9 ^ -1018051021);
            case 74 -> IIlII(-664065741, var9 ^ 267454621);
            case 75 -> IIlII(-664065742, var9 ^ 419989108);
            case 76 -> IIlII(-664065743, var9 ^ -405592392);
            case 77 -> IIlII(-664065744, var9 ^ 891764510);
            case 78 -> IIlII(-664065729, var9 ^ -1703221870);
            case 79 -> IIlII(-664065730, var9 ^ -1683921316);
            case 80 -> IIlII(-664065731, var9 ^ -1306945561);
            case 81 -> IIlII(-664065732, var9 ^ 399119836);
            case 82 -> IIlII(-664065733, var9 ^ -108965394);
            case 83 -> IIlII(-664065734, var9 ^ -901694784);
            case 84 -> IIlII(-664065735, var9 ^ -1295905256);
            case 85 -> IIlII(-664065736, var9 ^ 494347502);
            case 86 -> IIlII(-664065785, var9 ^ 291057727);
            case 87 -> IIlII(-664065786, var9 ^ -2077515360);
            case 88 -> IIlII(-664065787, var9 ^ -1596806495);
            case 89 -> IIlII(-664065788, var9 ^ 1353599280);
            case 90 -> IIlII(-664065789, var9 ^ -1797777937);
            case 91 -> IIlII(-664065790, var9 ^ 1221717341);
            case 92 -> IIlII(-664065791, var9 ^ 1281741125);
            case 93 -> IIlII(-664065792, var9 ^ 1655280317);
            case 94 -> IIlII(-664065777, var9 ^ -1641755752);
            case 95 -> IIlII(-664065778, var9 ^ -12905612);
            case 96 -> IIlII(-664065779, var9 ^ 1545424788);
            case 97 -> IIlII(-664065780, var9 ^ 1150587840);
            case 98 -> IIlII(-664065781, var9 ^ 970955206);
            case 99 -> IIlII(-664065782, var9 ^ -1950053735);
            case 100 -> IIlII(-664065783, var9 ^ -710878901);
            case 101 -> IIlII(-664065784, var9 ^ -1131110562);
            case 102 -> IIlII(-664065769, var9 ^ 43333532);
            case 103 -> IIlII(-664065770, var9 ^ 816998967);
            case 104 -> IIlII(-664065771, var9 ^ 382571475);
            case 105 -> IIlII(-664065772, var9 ^ 1597909595);
            case 106 -> IIlII(-664065773, var9 ^ 889389972);
            case 107 -> IIlII(-664065774, var9 ^ 1034416787);
            case 108 -> IIlII(-664065775, var9 ^ 2103242396);
            case 109 -> IIlII(-664065776, var9 ^ 1359485333);
            case 110 -> IIlII(-664065761, var9 ^ 476960522);
            case 111 -> IIlII(-664065762, var9 ^ 1047940112);
            case 112 -> IIlII(-664065763, var9 ^ 1058506076);
            case 113 -> IIlII(-664065764, var9 ^ -2129129122);
            case 114 -> IIlII(-664065765, var9 ^ 2085885262);
            case 115 -> IIlII(-664065766, var9 ^ 1924250249);
            case 116 -> IIlII(-664065767, var9 ^ -1396465851);
            case 117 -> IIlII(-664065768, var9 ^ 684439841);
            case 118 -> IIlII(-664065561, var9 ^ -1734876331);
            case 119 -> IIlII(-664065562, var9 ^ 115601541);
            case 120 -> IIlII(-664065563, var9 ^ -1702954680);
            case 121 -> IIlII(-664065564, var9 ^ 908949326);
            case 122 -> IIlII(-664065565, var9 ^ -87459800);
            case 123 -> IIlII(-664065566, var9 ^ 1830457826);
            case 124 -> IIlII(-664065567, var9 ^ 749397958);
            case 125 -> IIlII(-664065568, var9 ^ -672319750);
            case 126 -> IIlII(-664065553, var9 ^ 329854820);
            case 127 -> IIlII(-664065554, var9 ^ 1136307369);
            case 128 -> IIlII(-664065555, var9 ^ 1561752737);
            case 129 -> IIlII(-664065556, var9 ^ -1105611688);
            case 130 -> IIlII(-664065557, var9 ^ -1554905024);
            case 131 -> IIlII(-664065558, var9 ^ 88264919);
            case 132 -> IIlII(-664065559, var9 ^ -176661922);
            case 133 -> IIlII(-664065560, var9 ^ -515515986);
            case 134 -> IIlII(-664065545, var9 ^ -99432113);
            case 135 -> IIlII(-664065546, var9 ^ -97418634);
            case 136 -> IIlII(-664065547, var9 ^ -1650801057);
            case 137 -> IIlII(-664065548, var9 ^ 658986292);
            case 138 -> IIlII(-664065549, var9 ^ -1688503485);
            case 139 -> IIlII(-664065550, var9 ^ -995657029);
            case 140 -> IIlII(-664065551, var9 ^ -604333411);
            case 141 -> IIlII(-664065552, var9 ^ 885124793);
            case 142 -> IIlII(-664065537, var9 ^ 2057371817);
            case 143 -> IIlII(-664065538, var9 ^ -1733272040);
            case 144 -> IIlII(-664065539, var9 ^ -693705467);
            case 145 -> IIlII(-664065540, var9 ^ 801654193);
            case 146 -> IIlII(-664065541, var9 ^ -2085262253);
            case 147 -> IIlII(-664065542, var9 ^ -865819986);
            case 148 -> IIlII(-664065543, var9 ^ 2082495479);
            case 149 -> IIlII(-664065544, var9 ^ 452455269);
            case 150 -> IIlII(-664065593, var9 ^ -494912165);
            case 151 -> IIlII(-664065594, var9 ^ -1555363525);
            case 152 -> IIlII(-664065595, var9 ^ 1518448733);
            case 153 -> IIlII(-664065596, var9 ^ -45033568);
            case 154 -> IIlII(-664065597, var9 ^ 190534332);
            case 155 -> 2;
            case 156 -> IIlII(-664065598, var9 ^ -507424650);
            case 157 -> IIlII(-664065599, var9 ^ -1662027763);
            case 158 -> IIlII(-664065600, var9 ^ -691281136);
            case 159 -> IIlII(-664065585, var9 ^ 1121871399);
            case 160 -> IIlII(-664065586, var9 ^ -1195032059);
            case 161 -> IIlII(-664065587, var9 ^ 816732614);
            case 162 -> IIlII(-664065588, var9 ^ -1496949905);
            case 163 -> IIlII(-664065589, var9 ^ -1499175461);
            case 164 -> IIlII(-664065590, var9 ^ -753470971);
            case 165 -> IIlII(-664065591, var9 ^ -1262577226);
            case 166 -> IIlII(-664065592, var9 ^ -1657140595);
            case 167 -> IIlII(-664065577, var9 ^ 64252310);
            case 168 -> IIlII(-664065578, var9 ^ 863774234);
            case 169 -> IIlII(-664065579, var9 ^ -468660118);
            case 170 -> IIlII(-664065580, var9 ^ -1279311001);
            case 171 -> IIlII(-664065581, var9 ^ 1256466354);
            case 172 -> IIlII(-664065582, var9 ^ 1593925379);
            case 173 -> IIlII(-664065583, var9 ^ 670126497);
            case 174 -> IIlII(-664065584, var9 ^ -1286717335);
            case 175 -> IIlII(-664065569, var9 ^ -848117903);
            case 176 -> IIlII(-664065570, var9 ^ -1596703417);
            case 177 -> IIlII(-664065571, var9 ^ 929438166);
            case 178 -> IIlII(-664065572, var9 ^ 746533762);
            case 179 -> IIlII(-664065573, var9 ^ -675191665);
            case 180 -> IIlII(-664065574, var9 ^ -370328597);
            case 181 -> IIlII(-664065575, var9 ^ -1170249183);
            case 182 -> IIlII(-664065576, var9 ^ -1382475068);
            case 183 -> IIlII(-664065625, var9 ^ 110215180);
            case 184 -> IIlII(-664065626, var9 ^ -1519601033);
            case 185 -> IIlII(-664065627, var9 ^ -756413272);
            case 186 -> IIlII(-664065628, var9 ^ 1068490750);
            case 187 -> IIlII(-664065629, var9 ^ -1290086552);
            case 188 -> IIlII(-664065630, var9 ^ 363912788);
            case 189 -> IIlII(-664065631, var9 ^ -1177917444);
            case 190 -> IIlII(-664065632, var9 ^ 1276376548);
            case 191 -> IIlII(-664065617, var9 ^ -58578451);
            case 192 -> IIlII(-664065618, var9 ^ -796193887);
            case 193 -> IIlII(-664065619, var9 ^ 1227573181);
            case 194 -> IIlII(-664065620, var9 ^ 87732707);
            case 195 -> IIlII(-664065621, var9 ^ 668741452);
            case 196 -> IIlII(-664065622, var9 ^ -708401336);
            case 197 -> IIlII(-664065623, var9 ^ 1707754621);
            case 198 -> IIlII(-664065624, var9 ^ -888494412);
            case 199 -> IIlII(-664065609, var9 ^ -364688275);
            case 200 -> IIlII(-664065610, var9 ^ 1421745667);
            case 201 -> IIlII(-664065611, var9 ^ 978422819);
            case 202 -> IIlII(-664065612, var9 ^ -1393915717);
            case 203 -> IIlII(-664065613, var9 ^ 125336652);
            case 204 -> IIlII(-664065614, var9 ^ 937842183);
            case 205 -> IIlII(-664065615, var9 ^ 724113439);
            case 206 -> IIlII(-664065616, var9 ^ -1207118378);
            case 207 -> IIlII(-664065601, var9 ^ 1911439265);
            case 208 -> IIlII(-664065602, var9 ^ -308689302);
            case 209 -> IIlII(-664065603, var9 ^ 1662626605);
            case 210 -> IIlII(-664065604, var9 ^ 685210276);
            case 211 -> IIlII(-664065605, var9 ^ 1887801357);
            case 212 -> IIlII(-664065606, var9 ^ 1400525551);
            case 213 -> IIlII(-664065607, var9 ^ 539242541);
            case 214 -> IIlII(-664065608, var9 ^ -1701299900);
            case 215 -> IIlII(-664065657, var9 ^ 1599078268);
            case 216 -> IIlII(-664065658, var9 ^ 115903550);
            case 217 -> IIlII(-664065659, var9 ^ 493691457);
            case 218 -> IIlII(-664065660, var9 ^ -1053616050);
            case 219 -> IIlII(-664065661, var9 ^ -552295962);
            case 220 -> 4;
            case 221 -> IIlII(-664065662, var9 ^ -1322806795);
            case 222 -> IIlII(-664065663, var9 ^ 952810240);
            case 223 -> IIlII(-664065664, var9 ^ -581817546);
            case 224 -> IIlII(-664065649, var9 ^ 489551409);
            case 225 -> IIlII(-664065650, var9 ^ -165559379);
            case 226 -> IIlII(-664065651, var9 ^ -936294341);
            case 227 -> IIlII(-664065652, var9 ^ -59378490);
            case 228 -> IIlII(-664065653, var9 ^ -1735473881);
            case 229 -> IIlII(-664065654, var9 ^ 1090347020);
            case 230 -> IIlII(-664065655, var9 ^ -23517233);
            case 231 -> IIlII(-664065656, var9 ^ -2054807754);
            case 232 -> 5;
            case 233 -> IIlII(-664065641, var9 ^ 2008810028);
            case 234 -> IIlII(-664065642, var9 ^ -848425337);
            case 235 -> IIlII(-664065643, var9 ^ -718177242);
            case 236 -> IIlII(-664065644, var9 ^ 1802192083);
            case 237 -> IIlII(-664065645, var9 ^ -1547994873);
            case 238 -> IIlII(-664065646, var9 ^ -1183079710);
            case 239 -> IIlII(-664065647, var9 ^ -1518477975);
            case 240 -> IIlII(-664065648, var9 ^ -907835467);
            case 241 -> IIlII(-664065633, var9 ^ 1106697620);
            case 242 -> IIlII(-664065634, var9 ^ -1487918090);
            case 243 -> IIlII(-664065635, var9 ^ -342208760);
            case 244 -> IIlII(-664065636, var9 ^ 369586430);
            case 245 -> IIlII(-664065637, var9 ^ 131804555);
            case 246 -> IIlII(-664065638, var9 ^ 433637013);
            case 247 -> IIlII(-664065639, var9 ^ -1459202443);
            case 248 -> IIlII(-664065640, var9 ^ 1613827904);
            case 249 -> IIlII(-664065945, var9 ^ -422806588);
            case 250 -> IIlII(-664065946, var9 ^ -384895056);
            case 251 -> IIlII(-664065947, var9 ^ 102377812);
            case 252 -> IIlII(-664065948, var9 ^ 672008952);
            case 253 -> IIlII(-664065949, var9 ^ 970535435);
            case 254 -> IIlII(-664065950, var9 ^ 281003047);
            default -> IIlII(-664065951, var9 ^ -1367006436);
         };
         int var5 = (var1 & IIlII(-664065952, var9 ^ -401290229)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIlII(-664065937, var9 ^ 1149402917)) >>> IIlII(-664065938, var9 ^ 469403144)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIlII(-664065939, var9 ^ 1416944);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIlII(-664065940, var9 ^ -1208883215);
            }
         }

         lllI[var2] = new String(var3).intern();
      }

      return lllI[var2];
   }

   public void lll(class_310 var1, class_1268 var2, class_3965 var3) {
      if (this.IIII(var1, var2, var3)) {
         this.I(var1);
         this.llII();
         this.Il();
         this.IIIl = var1.field_1724.field_6012;
         this.Il = k74.x.IIll.IllllI();
         this.lI = var3;
         this.Illl = k74.x.IIll.IIlII(var1.field_1724.method_31548());
      }
   }

   private boolean IIII(class_310 var1, class_1268 var2, class_3965 var3) {
      return this.IIIIlIl()
         && !this.llIl
         && !this.l()
         && var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var2 == class_1268.field_5808
         && var3 != null
         && var3.method_17783() == class_240.field_1332
         && var3.method_17780() == class_2350.field_11036
         && !lIIIllII.ll(var1)
         && this.IlIl(var1.field_1724.method_6047());
   }

   @Override
   public void IIlIl() {
      this.IIl(class_310.method_1551());
   }

   @Override
   public String IlIIl() {
      return null;
   }

   private int IIIl(class_1657 var1, class_1792 var2) {
      String[] var3 = IIllllIl.IIIIl();
      int var4 = 0;

      while (var4 < IIlII(-664065941, -1044843593 ^ -1661900703)) {
         class_1799 var5 = var1.method_31548().method_5438(var4);
         if (var5.method_31574(var2)) {
            return var4;
         }

         var4++;
         if (var3 != null) {
            break;
         }
      }

      return -1;
   }

   private static int IIlII(int var0, int var1) {
      int var2 = I[var0 ^ -664065689] ^ var1 ^ var0;
      var2 -= 3221;
      var2 -= 42097;
      var2 -= 4132;
      var2 += 61726;
      var2 -= 771;
      var2 -= 54275;
      var2 -= 38590;
      var2 ^= 7272;
      var2 += 35215;
      return var2 ^ 56332;
   }

   private void IIlI(class_2338 var1, int var2) {
      this.IIIII = var1.method_10062();
      this.IIlI = var2;
      this.llII = -1;
      this.lIll = false;
      this.llI = null;
      this.IlI = 0;
      this.IIl = IIlII(-664065942, -1935543718 ^ 1489752372);
      this.lII = IIlII(-664065943, -1935543718 ^ -478471119);
      this.IlII = false;
      this.llll = System.currentTimeMillis() + this.lIll(this.IIll);
   }

   @Override
   public void llIl() {
      this.I(class_310.method_1551());
      this.llII();
      this.Il();
      this.llIl = false;
   }

   private boolean IIll(class_310 var1) {
      return this.IIIIlIl() && var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null && var1.field_1724.method_5805();
   }

   private boolean l() {
      IIIIIllII var1 = IIIIIllII.III();
      if (var1 != null && var1.II() != null) {
         llIIlll var2 = var1.II().IlIllIl();
         if (var2 != null && var2.IllIl()) {
            return true;
         } else {
            IIIllIl var3 = var1.II().IIIIIlI();
            return var3 != null && var3.lIlllI();
         }
      } else {
         return false;
      }
   }

   @Override
   public String IlIllII() {
      String var1 = this.IlIIl();
      String var10000;
      if (var1 != null && !var1.isBlank()) {
         var10000 = this.IllIlI();
         String var3 = IlIIllIII.lI(lIlI[IIlII(-664065944, 458462852 ^ 1581521032)]);
         String var2 = var10000;
         var10000 = var2 + var3 + var1;
      } else {
         var10000 = this.IllIlI();
      }

      return var10000;
   }

   private boolean IlII(class_1799 var1) {
      return var1 != null && !var1.method_7960() && var1.method_31574(class_1802.field_8069);
   }

   private boolean IlIl(class_1799 var1) {
      return var1 != null
         && !var1.method_7960()
         && (
            var1.method_31574(class_1802.field_8129)
               || var1.method_31574(class_1802.field_8848)
               || var1.method_31574(class_1802.field_8211)
               || var1.method_31574(class_1802.field_8655)
         );
   }

   private void IllI(class_310 var1) {
      this.I(var1);
      this.llII();
      this.Il();
      this.llIl = false;
   }

   @Override
   public void IlllII(JsonObject var1) {
      super.IlllII(var1);
      this.IIIlIIl(var1, IllI, new lIlllIl[]{this.lll, this.IIll});
   }

   private class_243 Illl(class_2338 var1) {
      return class_243.method_24955(var1).method_1031(0.0, 0.125, 0.0);
   }

   private boolean lIII(class_310 var1, int var2) {
      return var1 != null && var1.field_1724 != null && var2 >= 0 && var2 < IIlII(-664065929, -699875002 ^ 1753278370) && !lIIIllII.ll(var1)
         ? this.IlII(var1.field_1724.method_31548().method_5438(var2))
         : false;
   }

   private boolean lIIl(class_310 var1, class_2338 var2) {
      return this.IIll(var1)
         && var2 != null
         && this.lI(var1.field_1687.method_8320(var2))
         && var1.field_1724.method_33571().method_1025(this.Illl(var2)) <= 20.25;
   }

   private void lIlI(class_310 var1) {
      if (this.lIIl.IllI() && this.IIlI >= 0 && this.IIlI < IIlII(-664065930, -2049718382 ^ -396746977) && this.IIlI != this.llII) {
         this.lII = var1.field_1724.field_6012 + 1;
      } else {
         this.Il();
      }
   }

   private long lIll(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();
      return var2 >= var4 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private void llII() {
      this.IIIl = IIlII(-664065977, 506754974 ^ -256498994);
      this.Il = Long.MIN_VALUE;
      this.lI = null;
      this.Illl = -1;
   }

   private void lllI(class_310 var1) {
      this.IlI++;
      if (this.IlI > IIlII(-664065978, 784316350 ^ -717588100)) {
         this.lIlI(var1);
      } else {
         this.llll = System.currentTimeMillis() + 50L;
      }
   }

   private static void IIIII() {
      int var0 = 851756254;
      lIlI[0] = IIIll(
         llI(IIlII(-664065979, var0 ^ -315222667), IIlII(-664065980, var0 ^ 1692114235)).toCharArray(), 57630L, IIlII(-664065981, var0 ^ -902730614)
      );
      lIlI[1] = IIIll(
         llI(IIlII(-664065982, var0 ^ -80243879), IIlII(-664065983, var0 ^ -2127950607)).toCharArray(), 65681L, IIlII(-664065984, var0 ^ -779911230)
      );
      lIlI[2] = IIIll(
         llI(IIlII(-664065969, var0 ^ -1638014191), IIlII(-664065970, var0 ^ -1203033116)).toCharArray(), 24309L, IIlII(-664065971, var0 ^ 1708980118)
      );
      lIlI[3] = IIIll(
         llI(IIlII(-664065972, var0 ^ -1645703982), IIlII(-664065973, var0 ^ 669531467)).toCharArray(), 4172L, IIlII(-664065974, var0 ^ -327521363)
      );
      lIlI[4] = IIIll(llI(IIlII(-664065975, var0 ^ 638627943), IIlII(-664065976, var0 ^ 89152102)).toCharArray(), 28656L, IIlII(-664065961, var0 ^ 487725077));
      lIlI[5] = IIIll(
         llI(IIlII(-664065962, var0 ^ -1904577971), IIlII(-664065963, var0 ^ -154880517)).toCharArray(), 42148L, IIlII(-664065964, var0 ^ -1541690863)
      );
      lIlI[IIlII(-664065965, var0 ^ 940471163)] = IIIll(
         llI(IIlII(-664065966, var0 ^ -1642372319), IIlII(-664065967, var0 ^ -1975296748)).toCharArray(), 39189L, IIlII(-664065968, var0 ^ -959213770)
      );
      lIlI[IIlII(-664065953, var0 ^ -478289842)] = IIIll(
         llI(IIlII(-664065954, var0 ^ -1461542461), IIlII(-664065955, var0 ^ 971725345)).toCharArray(), 61626L, IIlII(-664065956, var0 ^ -597303269)
      );
   }

   public IlIlllI() {
      super(IlIIllIII.Ill(lIlI[0]), lllIIlIl.I, IlIIllIII.Ill(lIlI[3]));
      this.lll = this.IllIIll(new lIlllIl(IlIIllIII.Ill(lIlI[2]), 0.0, 0.0, 0.0, 300.0, 5.0).lI(IlIIllIII.lI(lIlI[4])));
      this.IIll = this.IllIIll(new lIlllIl(IlIIllIII.Ill(lIlI[1]), 0.0, 0.0, 0.0, 300.0, 5.0).lI(IlIIllIII.lI(lIlI[4])));
      this.lIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIlI[5]), true));
      this.IIIl = IIlII(-664065957, -1642346939 ^ 1986289257);
      this.Il = Long.MIN_VALUE;
      this.Illl = -1;
      this.IIlI = -1;
      this.llII = -1;
      this.IIl = IIlII(-664065958, -1642346939 ^ 390989566);
      this.lII = IIlII(-664065959, -1642346939 ^ 1576471890);
   }

   private boolean IIIIl(class_310 var1, class_2338 var2) {
      return this.lIl(var1, var2);
   }

   public boolean IIIlI() {
      return this.llIl;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 743849784;
      String[] var10001 = new String[2];
      int var10 = 0;
      String[] var9 = var10001;
      short var12 = 29962;
      int var8 = "m踥哼䟴\uec21콐줝䞗㟷ᛨᗣດ\udcd2璘绞龳䮹찅潆ꤜ咔蹕㕋\udad8恕缥\ue761酌㿀陘燭猶狂贾ྈ陚똜뼢ꔕ瞁穚潮\ued4a좆쳒嬥酟ឡ㣴ਸ쀪筮恈ꡂ侎생\ue13fﻤ底ꢶ佾\uef3f\ue976邶툒䋇폞\ud94d铔폿兩鞎Ⱊ\u1af4㯏聞䚫腓\uedba쵽\uef12獟\uf6ac荼뉢梬剌쿳㗽\ude68ጦ탵\udbcd캨덼ཤ\uefb1쉫ⷩ蛦謮Ǿ\udfddﶋ\uf445獹百\uf674궖\ud83b)ⴤ鋽쫡끅\ue117林\ue150\ue854맷\udb33雟巐ꮮ\uf42a\uf018혀鮻弇聬㢱స麅噮긱顔\uef94蓾䅋띝윺`㋮ঔ㓋\uf476澷ꕟ쁘籠銥\uf56e"
         .length();
      String var7 = "m踥哼䟴\uec21콐줝䞗㟷ᛨᗣດ\udcd2璘绞龳䮹찅潆ꤜ咔蹕㕋\udad8恕缥\ue761酌㿀陘燭猶狂贾ྈ陚똜뼢ꔕ瞁穚潮\ued4a좆쳒嬥酟ឡ㣴ਸ쀪筮恈ꡂ侎생\ue13fﻤ底ꢶ佾\uef3f\ue976邶툒䋇폞\ud94d铔폿兩鞎Ⱊ\u1af4㯏聞䚫腓\uedba쵽\uef12獟\uf6ac荼뉢梬剌쿳㗽\ude68ጦ탵\udbcd캨덼ཤ\uefb1쉫ⷩ蛦謮Ǿ\udfddﶋ\uf445獹百\uf674궖\ud83b)ⴤ鋽쫡끅\ue117林\ue150\ue854맷\udb33雟巐ꮮ\uf42a\uf018혀鮻弇聬㢱స麅噮긱顔\uef94蓾䅋띝윺`㋮ঔ㓋\uf476澷ꕟ쁘籠銥\uf56e";
      int var11 = 0;

      do {
         char var13 = var7.charAt(var11);
         int var24 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var24, var10002 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 152;
               case 1 -> 201;
               case 2 -> 123;
               case 3 -> 49;
               case 4 -> 201;
               case 5 -> 85;
               case 6 -> 148;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIIIl = var9;
      IIIlI = new Object[var9.length];
      int var21 = 0;
      I = new int[321];
      byte var25 = 0;
      byte[] var35 = "\u0091à0÷\u0093òðyê\u0089F¼^¶\u001fÚEm_D\u0086ã\u0085Ä&¶4U\n\u0015óhÎ\u008czÂJ\t×Íå\u0088\u0017\u0001¬oÊ\u0098P\u00177¸\u0000\\uý'\u0000\f\u008eÕ\u0082Ãíb\"T`9\u0011»\u0089\u00900Ç\u001c\u0011\u0082ÓVáwÀ¥\u001aÎ*:l\u00816ö÷^®°ÆÝì0Ä\u0089aÔ0³\u008dUÅD\u0097Óm\r®E\u009azh<é\u0017TûZ¤l\u008abzH¶Ø\u0090\u0006\u001e+z*ZuÛòÆ¡¨qpdU£¨ÖVÏú'ô+RRÓ\u0090\u0080¸\u0018%©\u0091B\u0007\u0084\u009f\u00adm\u0082;H[<\u009b\u0014i/ùár0Qòæb\u0091Û÷§\u0089åGêQ\u0012$\b\u0014\u0015\u0017\u0017r\u001fYÐôw»Ázc5|\u0002b×Ï\u007fg\u008b\u0013K±\u0091_rÔ\u009b¨ð\u0003iÈR\u001cß\u0082\\¼µäG\u001b\u009d)õ%\t\u001f±\u008c¬À0Dü.)«£Ý\n\"\u0084<º\u0005-\u0084jÒ AÐ\u008a\u0084\u0013ÇrÉM\u00067¬\n àîÉ<\u008d!®;\u0013Xü\u0085m¥<u6§&Tï#\b$6\\ ±ß\u0085\u0014Õ`e'ëJ_#È´L\u0005\u0004\u0014\u0082\u008b\u0012í\fÕì6¬°>Âµe\u0091\u009fo×\u0090DìP¹ü\u001c\u001a\u001c/\u009f@òdÚ/Á¤°R¹'\u0085ÿ\u0016\u0092®ô\u001a¼º£\u008fÎ+>«7!\u001e[KÃ\u0004\u009f=\u009e'C4g<G\u0080[`iL\u001f¬\u0095ÁAöôÞ\u0099\u0012WøÄBOq\u0018\u00022:\u0013I\u0080!\u0007\u008cÞESC·q\u0014²\tp¼b;WàG\u001d(\u0019LTÛ 4>æ\u0089\u00046Bx\u0010v¹ePZí\u0093º\u0017\u0088]\u008b5\u0093Çå4ò\u000e\u008d\u008aý\u009aðw±\u009f;yT05§&\u0015;#.3¹\u0093ri\u0094\r\u0006{ª\u0091\u009bs\u0085=Èý÷ñ,òVfÿ\u001b¡'Ol\u0092Ü\b¼X\u0018L¤cH_'³Vóþ\fµü>ë¨·\u0083\u001f\u000e§ZRþ\u009dÐÇê R\u009cñ÷CññÔ\ts\u0096\u007fM\u0016,¢Þq\u0090¾ñÎÏBñðÐ\u001f\u0010@?$e²qD\u008a\"\u0093UÔ¨ÝCn\u0015$-Î²\u0088PçqÇ\u0081)¨wÅÐ÷\u0011\u0012aÉée·Ñ¨®\u0082KQd:ëöµ]\u0004\u0000¾ßiê$Ú5\u0097\nó>Ý.iOI;í\"³ È\u009a;KÒè\u00ad#Ñ.\u00adAï²Øóx£¿[\u0013^\u0096ß\u0080I\b1â´8\u0099\u00ad\u000bïõZ\u0010¸ZÉ?A\u0001¬\u008dTäÕø,\u0014Û\u0019¸«Ë\u0004Æ\u00975!«1·¨<\u0083\u0092î'\u009a¹cÜ$éCâ\b°î±Úà_¦|\u0090m\rtK\u0013®\u00890©Ù\u000f\u0086g4JT\u009f¸ÿ]\\\u001eUTÝ²/íaGö\u007f=÷g£uÛn\u0081,BÎÌ§\u000eß;\u0016,9¥éÞ#,\\n/Î\u0095Àï,°á¦Æp_[\u0095a1´\u0006Ã§\u000f\u0002ª\f\u009d÷2<\u0003Ý` Ì\u0093\u001e³é_Lz\u000bµ\u0082æ|Lïhü!\u0017#2ð\u008c{`\u001a\u0088X\u009fØf+Á»D\u0091}³®Tªt?\r\r\u0007O\u0016\u0088¨\u0081ÊÖ\u0093*Ôñ+-ºÂ\u001b,3/1\u0087Ö·¡ñ\u0016È|éýÄI(ÃÔÂî÷\u0090\u007f\u009b\u0093kNcK\u0018ëpõ|¬·\u008ec\u0095Ã|Y\u0088>Æ\u008b\u0084\u001cÞÔöÖ`\u008eÉS¨^ó\u0016²\u009e(W®\u0098WòÂ\u0006\fäJ\u0013W]¬µ¦xà\u007fÅ6\u001dâú\u0014\f>¦ò\u0012=Mñ¢ãÜÙkÔ\u0084\u0010í)ñSâë|ª\rÿ£Þ#ë\u0081\u000e2<¹8\u001bZOÓ¥`¨SãñGLOf»m\u0010\u001f\np\u000bð\u0015º¼\u0014lºí÷5×äÔ\u008de_d@cõ© \u0003\u000ev\u0088ùÝ7v\u0091÷dåAð*ìêÕ\u0080z\u0011'°,æxm\u007f4C\bh¨Q ¾\u0091h³üëí½\u008c\u0012\u0002Éó@6_üî4\u00ad\u009e\u0001£Á\u001fR÷\u0090NéÞ<ûvK;g±oMÙãæ¡\u001d\u0013\u008eÐÇ\ryL_Îü®&mÝZ\u0085\u0097\u001c&/\u0084:0Ð²\u0003\"B{\u001f\u0093@H¥\u0092õ>^C\u0012ø¤k|ú\u0087*Ì#¬\u0013×º\f\u0001¾Ìt¾ø\u009cð\u008a9\bºt\u0019\u0091\u001c`¯£\b9\u0095xþ±Q£a\u0007\u008a¯*\u0099mL»\u0091Ô\u0091Ðø.\u0098ØÁ6\u0016¹ën\u0080óRe/ÜL\u008a\u001bpR45"
         .getBytes("ISO-8859-1");

      int var57;
      do {
         I[var21] = ((var35[var25] & 255) << 24 | (var35[var25 + 1] & 255) << 16 | (var35[var25 + 2] & 255) << 8 | var35[var25 + 3] & 255) ^ 1758727556;
         var21 += 1;
         var57 = var25 + 4;
         var25 += 4;
      } while (var57 < var35.length);

      String[] var5 = new String[IIlII(-664065931, var17 ^ 1804366949)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIllI(var17 ^ -1480364988, (short)'\ud8c6', '袮')).length();
      int var1 = IIlII(-664065932, var17 ^ 1824685515);
      int var19 = -1;

      label104:
      while (true) {
         var21 = 1;
         String var28 = var2.substring(++var19, var19 + var1);
         byte var41 = -1;

         while (true) {
            label99: {
               char[] var59 = var28.toCharArray();
               int var71 = var59.length;
               int var6 = 0;
               var57 = var21;
               var46 = var59;
               int var33 = var71;
               char[] var83;
               int var90;
               if (var71 <= 1) {
                  var83 = var59;
                  var71 = var21;
                  var90 = var6;
               } else {
                  var57 = var21;
                  var33 = var71;
                  if (var71 <= var6) {
                     break label99;
                  }

                  var83 = var59;
                  var71 = var21;
                  var90 = var6;
               }

               while (true) {
                  var83[var90] = (char)(var83[var90] ^ var71 ^ switch (var6 % IIlII(-664065936, var17 ^ -538904192)) {
                     case 0 -> IIlII(-664065921, var17 ^ -850909177);
                     case 1 -> 3;
                     case 2 -> IIlII(-664065922, var17 ^ -195335444);
                     case 3 -> IIlII(-664065923, var17 ^ 1901402715);
                     case 4 -> IIlII(-664065924, var17 ^ -1641978560);
                     case 5 -> IIlII(-664065925, var17 ^ -1430820115);
                     default -> IIlII(-664065926, var17 ^ -1471870818);
                  });
                  var6++;
                  if (var57 == 0) {
                     var90 = var57;
                     var83 = var46;
                     var71 = var57;
                  } else {
                     if (var33 <= var6) {
                        break;
                     }

                     var83 = var46;
                     var71 = var57;
                     var90 = var6;
                  }
               }
            }

            String var64 = new String(var46).intern();
            switch (var41) {
               case 0:
                  var5[var3++] = var64;
                  if ((var19 += var1) >= var4) {
                     ll = var5;
                     lllI = new String[IIlII(-664065935, var17 ^ -460984812)];
                     lIlI = new String[IIlII(-664065927, var17 ^ 1059688058)];
                     IIIII();
                     IllI = IlIIllIII.lI(lIlI[IIlII(-664065928, var17 ^ 1803083721)]);
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var64;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label104;
                  }

                  var4 = (var2 = IIllI(var17 ^ 1779130594, (short)'ꉩ', '袯')).length();
                  var1 = IIlII(-664065933, var17 ^ 1231613027);
                  var19 = -1;
            }

            var21 = IIlII(-664065934, var17 ^ -1151812964);
            var28 = var2.substring(++var19, var19 + var1);
            var41 = 0;
         }
      }
   }

   private static String IIIll(char[] var0, long var1, int var3) {
      int var4 = IIlII(-664065960, -1651099545 ^ 1876057584) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIlII(-664066009, -1651099545 ^ 1568318765);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
