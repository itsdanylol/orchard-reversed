package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_490;
import net.minecraft.class_638;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class lIlIIl extends IlIIIIIIl {
   private final lIlllIl II;
   private final IIlIII Il;
   private final lllIIlII lI;
   private static final Object[] Illl;
   private int ll;
   private int III;
   private static final int IIl = 40;
   private final lllIIlII IlI;
   private Object Ill;
   private static final int[] IlIl;
   private static final int I = 36;
   private static final String[] IllI;
   private class_490 lII;
   private static final int lIl = 9;
   private static final int llI = 44;
   private long lll;
   private static final String[] IIII;
   private static final String[] IIIl;
   private class_490 IIlI;
   private static final int IIll = 35;
   private Object IlII;

   private int I() {
      return (int)Math.round(this.Il.IllI()) - 1;
   }

   private int l(class_746 var1, int var2) {
      String[] var10000 = llIllIlI.IIlII();
      int var4 = Math.min(IIlI(-25799566, 1482574518 ^ 1024727043), Math.min(IIlI(-25799565, 1482574518 ^ 2039849757), var1.field_7498.field_7761.size() - 1));
      int var5 = IIlI(-25799568, 1482574518 ^ -1480145984);
      String[] var3 = var10000;

      while (var5 <= var4) {
         if (var5 != var2 && this.llI(((class_1735)var1.field_7498.field_7761.get(var5)).method_7677())) {
            return var5;
         }

         var5++;
         if (var3 == null) {
            break;
         }
      }

      return -1;
   }

   private int II() {
      return IIlI(-25799567, -595462857 ^ -1936168533) + this.I();
   }

   private void Il(class_310 var1, boolean var2) {
      if (var2 && var1 != null && var1.field_1755 == this.IIlI) {
         var1.method_1507(null);
      }

      this.ll();
   }

   private long lI() {
      long var1 = Math.max(0L, Math.round(Math.min(this.II.IIlI(), this.II.IlI())));
      long var3 = Math.max(var1, Math.round(Math.max(this.II.IIlI(), this.II.IlI())));
      return var1 == var3 ? var1 : ThreadLocalRandom.current().nextLong(var1, var3 + 1L);
   }

   private void ll() {
      this.IIlI = null;
      this.lII = null;
      this.III = IIlI(-25799562, 967454717 ^ -534528001);
      this.ll = IIlI(-25799561, 967454717 ^ -255107721);
      this.lll = 0L;
   }

   private void III(boolean var1) {
      class_310 var2 = class_310.method_1551();
      this.Il(var2, var1);
      this.IlII = null;
      this.Ill = null;
   }

   private void IIl(class_310 var1) {
      class_746 var2 = var1 == null ? null : var1.field_1724;
      class_638 var3 = var1 == null ? null : var1.field_1687;
      if (var2 != this.IlII || var3 != this.Ill) {
         this.III(false);
         this.IlII = var2;
         this.Ill = var3;
      }
   }

   @Override
   public void IlIII() {
      this.III(false);
   }

   @Override
   public void IIlIl() {
      String[] var10000 = llIllIlI.IIlII();
      class_310 var2 = class_310.method_1551();
      String[] var1 = var10000;
      this.IIl(var2);
      if (!this.lIl(var2)) {
         this.Il(var2, false);
      } else if (this.lll()) {
         this.Il(var2, true);
      } else {
         class_746 var3 = var2.field_1724;
         boolean var4 = !this.llI(var3.method_6079());
         boolean var5 = this.lII(var3);
         if (var2.field_1755 instanceof class_490 var6 && var1 != null) {
            if (var6 != this.lII) {
               this.lII = var6;
               this.III = var6 == this.IIlI ? this.III : var3.field_6012 - 1;
               this.ll = IIlI(-25799564, -531172404 ^ -513655621);
               this.lll = System.currentTimeMillis() + this.lI();
            }

            if (!var4 && !var5) {
               if (this.IIlI == var6 && var3.field_6012 > this.III) {
                  var2.method_1507(null);
                  this.ll();
               }
            } else if (var3.field_6012 > this.III
               && var3.field_6012 > this.ll
               && System.currentTimeMillis() >= this.lll
               && var3.field_7498.method_34255().method_7960()) {
               if (var2.field_1761 != null) {
                  if (var4) {
                     int var11 = var5 ? this.II() : -1;
                     int var12 = this.l(var3, var11);
                     if (var12 >= 0) {
                        var2.field_1761.method_2906(var3.field_7498.field_7763, var12, IIlI(-25799563, -531172404 ^ 1686366249), class_1713.field_7791, var3);
                        this.IIIl(var3);
                     }
                  } else {
                     if (var5) {
                        int var10 = this.II();
                        int var8 = this.l(var3, var10);
                        if (var8 < 0) {
                           return;
                        }

                        var2.field_1761.method_2906(var3.field_7498.field_7763, var8, this.I(), class_1713.field_7791, var3);
                        this.IIIl(var3);
                     }
                  }
               }
            }
         } else {
            this.ll();
            if (var2.field_1755 == null) {
               if (!this.IlI.IllI()) {
               }

               if ((var4 || var5) && this.l(var3, -1) >= 0) {
                  class_490 var9 = new class_490(var3);
                  this.IIlI = var9;
                  this.lII = var9;
                  this.III = var3.field_6012;
                  this.lll = System.currentTimeMillis() + this.lI();
                  var2.method_1507(var9);
               }
            }
         }
      }
   }

   public lIlIIl() {
      int var1 = 447426129;
      super(
         IlIIllIII.Ill(Ill(IIlI(-25799558, var1 ^ 1486780324), IIlI(-25799557, var1 ^ 1508780949))),
         lllIIlIl.I,
         IlIIllIII.Ill(Ill(IIlI(-25799560, var1 ^ -1088629800), IIlI(-25799559, var1 ^ 1128173424)))
      );
      this.II = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(Ill(IIlI(-25799554, var1 ^ 552299148), IIlI(-25799553, var1 ^ 746009282))), 0.0, 0.0, 0.0, 1000.0, 5.0)
            .Ill(IlIIllIII.Ill(Ill(IIlI(-25799556, var1 ^ 2047358798), IIlI(-25799555, var1 ^ 530899205))))
      );
      this.IlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Ill(IIlI(-25799582, var1 ^ 837000001), IIlI(-25799581, var1 ^ 1595249028))), true).lIlI(lIlIIl::IIII));
      this.lI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Ill(IIlI(-25799584, var1 ^ 380417337), IIlI(-25799583, var1 ^ 1316310748))), false));
      this.Il = this.IllIIll(new IIlIII(IlIIllIII.Ill(Ill(IIlI(-25799578, var1 ^ -23276053), IIlI(-25799577, var1 ^ 2000167478))), 1.0, 1.0, 9.0, 1.0));
      this.III = IIlI(-25799580, var1 ^ 1589675003);
      this.ll = IIlI(-25799579, var1 ^ -866302804);
   }

   private static String IIll(int var0, int var1) {
      int var3 = var0 ^ -1879560078;
      char[] var4 = IllI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])Illl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         Illl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1160755042;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 182;
            case 1 -> 255;
            case 2 -> 34;
            case 3 -> 180;
            case 4 -> 201;
            case 5 -> 113;
            case 6 -> 128;
            case 7 -> 218;
            case 8 -> 16;
            case 9 -> 186;
            case 10 -> 85;
            case 11 -> 146;
            case 12 -> 254;
            case 13 -> 235;
            case 14 -> 48;
            case 15 -> 66;
            case 16 -> 3;
            case 17 -> 202;
            case 18 -> 79;
            case 19 -> 104;
            case 20 -> 63;
            case 21 -> 196;
            case 22 -> 91;
            case 23 -> 50;
            case 24 -> 250;
            case 25 -> 83;
            case 26 -> 251;
            case 27 -> 141;
            case 28 -> 42;
            case 29 -> 140;
            case 30 -> 105;
            case 31 -> 151;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static String Ill(int var0, int var1) {
      int var9 = -1756978793;
      int var2 = (var0 ^ IIlI(-25799574, var9 ^ 1834718741)) & IIlI(-25799573, var9 ^ -1281713097);
      if (IIII[var2] == null) {
         char[] var3 = IIIl[var2].toCharArray();

         int var4 = switch (var3[0] & IIlI(-25799576, var9 ^ -584447368)) {
            case 0 -> IIlI(-25799575, var9 ^ -1350485996);
            case 1 -> IIlI(-25799570, var9 ^ 1904778213);
            case 2 -> IIlI(-25799569, var9 ^ 2010019068);
            case 3 -> IIlI(-25799572, var9 ^ 575301132);
            case 4 -> IIlI(-25799571, var9 ^ -1760140116);
            case 5 -> IIlI(-25799598, var9 ^ -1424510863);
            case 6 -> IIlI(-25799597, var9 ^ -215921013);
            case 7 -> IIlI(-25799600, var9 ^ -484182608);
            case 8 -> IIlI(-25799599, var9 ^ 1828258689);
            case 9 -> IIlI(-25799594, var9 ^ 1592354919);
            case 10 -> IIlI(-25799593, var9 ^ -122699241);
            case 11 -> IIlI(-25799596, var9 ^ -1035190454);
            case 12 -> IIlI(-25799595, var9 ^ 1813368289);
            case 13 -> IIlI(-25799590, var9 ^ 1010222783);
            case 14 -> IIlI(-25799589, var9 ^ 482710500);
            case 15 -> IIlI(-25799592, var9 ^ 1000734615);
            case 16 -> IIlI(-25799591, var9 ^ -734828631);
            case 17 -> IIlI(-25799586, var9 ^ -1585558506);
            case 18 -> IIlI(-25799585, var9 ^ 523558993);
            case 19 -> IIlI(-25799588, var9 ^ 1302086465);
            case 20 -> IIlI(-25799587, var9 ^ 1716902320);
            case 21 -> IIlI(-25799614, var9 ^ -1693098298);
            case 22 -> IIlI(-25799613, var9 ^ 1277889725);
            case 23 -> IIlI(-25799616, var9 ^ -263292079);
            case 24 -> IIlI(-25799615, var9 ^ 2107822617);
            case 25 -> IIlI(-25799610, var9 ^ 2053990991);
            case 26 -> IIlI(-25799609, var9 ^ -1534286905);
            case 27 -> IIlI(-25799612, var9 ^ -1687299047);
            case 28 -> IIlI(-25799611, var9 ^ -873373529);
            case 29 -> IIlI(-25799606, var9 ^ -184042234);
            case 30 -> IIlI(-25799605, var9 ^ 465528709);
            case 31 -> IIlI(-25799608, var9 ^ 1084057325);
            case 32 -> IIlI(-25799607, var9 ^ 1210462632);
            case 33 -> IIlI(-25799602, var9 ^ 429519063);
            case 34 -> IIlI(-25799601, var9 ^ 1682488975);
            case 35 -> IIlI(-25799604, var9 ^ -639463172);
            case 36 -> IIlI(-25799603, var9 ^ 1395532995);
            case 37 -> IIlI(-25799630, var9 ^ 2022011342);
            case 38 -> IIlI(-25799629, var9 ^ 199442577);
            case 39 -> IIlI(-25799632, var9 ^ 67468411);
            case 40 -> 2;
            case 41 -> IIlI(-25799631, var9 ^ -1666451578);
            case 42 -> IIlI(-25799626, var9 ^ -14337024);
            case 43 -> IIlI(-25799625, var9 ^ 184345661);
            case 44 -> IIlI(-25799628, var9 ^ 320899010);
            case 45 -> IIlI(-25799627, var9 ^ 1385497136);
            case 46 -> IIlI(-25799622, var9 ^ 840788518);
            case 47 -> IIlI(-25799621, var9 ^ 1870002377);
            case 48 -> IIlI(-25799624, var9 ^ 1678551767);
            case 49 -> IIlI(-25799623, var9 ^ -1622052891);
            case 50 -> IIlI(-25799618, var9 ^ 878566680);
            case 51 -> IIlI(-25799617, var9 ^ 1219135773);
            case 52 -> IIlI(-25799620, var9 ^ 897439324);
            case 53 -> IIlI(-25799619, var9 ^ 137492764);
            case 54 -> IIlI(-25799646, var9 ^ 1039976471);
            case 55 -> IIlI(-25799645, var9 ^ 482714453);
            case 56 -> IIlI(-25799648, var9 ^ -489260383);
            case 57 -> IIlI(-25799647, var9 ^ -1058317627);
            case 58 -> IIlI(-25799642, var9 ^ -602461968);
            case 59 -> IIlI(-25799641, var9 ^ -26894398);
            case 60 -> IIlI(-25799644, var9 ^ -1243367740);
            case 61 -> IIlI(-25799643, var9 ^ 1929629134);
            case 62 -> IIlI(-25799638, var9 ^ -1805593571);
            case 63 -> IIlI(-25799637, var9 ^ 1473557675);
            case 64 -> IIlI(-25799640, var9 ^ 1723464476);
            case 65 -> IIlI(-25799639, var9 ^ -1998697466);
            case 66 -> IIlI(-25799634, var9 ^ -1308798249);
            case 67 -> IIlI(-25799633, var9 ^ 225514284);
            case 68 -> IIlI(-25799636, var9 ^ 118060347);
            case 69 -> IIlI(-25799635, var9 ^ 717952317);
            case 70 -> IIlI(-25799662, var9 ^ 1659642595);
            case 71 -> IIlI(-25799661, var9 ^ -453329143);
            case 72 -> IIlI(-25799664, var9 ^ -1074033951);
            case 73 -> IIlI(-25799663, var9 ^ 337921554);
            case 74 -> IIlI(-25799658, var9 ^ 1041454023);
            case 75 -> IIlI(-25799657, var9 ^ -1145302397);
            case 76 -> IIlI(-25799660, var9 ^ 1039788539);
            case 77 -> IIlI(-25799659, var9 ^ -1778767927);
            case 78 -> 3;
            case 79 -> IIlI(-25799654, var9 ^ -1620689721);
            case 80 -> IIlI(-25799653, var9 ^ 1022424065);
            case 81 -> IIlI(-25799656, var9 ^ 825407372);
            case 82 -> IIlI(-25799655, var9 ^ 329490558);
            case 83 -> IIlI(-25799650, var9 ^ 1532872696);
            case 84 -> IIlI(-25799649, var9 ^ 129362433);
            case 85 -> IIlI(-25799652, var9 ^ -1137435737);
            case 86 -> IIlI(-25799651, var9 ^ 1714199837);
            case 87 -> IIlI(-25799678, var9 ^ 856784582);
            case 88 -> IIlI(-25799677, var9 ^ 1263591438);
            case 89 -> IIlI(-25799680, var9 ^ 1467674002);
            case 90 -> IIlI(-25799679, var9 ^ 1524178307);
            case 91 -> IIlI(-25799674, var9 ^ 47753159);
            case 92 -> IIlI(-25799673, var9 ^ -335073648);
            case 93 -> IIlI(-25799676, var9 ^ -292103714);
            case 94 -> IIlI(-25799675, var9 ^ 564618382);
            case 95 -> IIlI(-25799670, var9 ^ -1117709949);
            case 96 -> IIlI(-25799669, var9 ^ -893438602);
            case 97 -> IIlI(-25799672, var9 ^ 388062036);
            case 98 -> IIlI(-25799671, var9 ^ 891204855);
            case 99 -> IIlI(-25799666, var9 ^ 960819775);
            case 100 -> IIlI(-25799665, var9 ^ 1452910714);
            case 101 -> IIlI(-25799668, var9 ^ -691284156);
            case 102 -> IIlI(-25799667, var9 ^ -933138554);
            case 103 -> IIlI(-25799438, var9 ^ -1393500524);
            case 104 -> IIlI(-25799437, var9 ^ -1802428090);
            case 105 -> IIlI(-25799440, var9 ^ -407928671);
            case 106 -> IIlI(-25799439, var9 ^ -629486534);
            case 107 -> IIlI(-25799434, var9 ^ 375492677);
            case 108 -> IIlI(-25799433, var9 ^ -962037941);
            case 109 -> IIlI(-25799436, var9 ^ -298071976);
            case 110 -> IIlI(-25799435, var9 ^ -799741145);
            case 111 -> IIlI(-25799430, var9 ^ -111817217);
            case 112 -> IIlI(-25799429, var9 ^ 1238031696);
            case 113 -> IIlI(-25799432, var9 ^ 977807296);
            case 114 -> 4;
            case 115 -> IIlI(-25799431, var9 ^ 695882802);
            case 116 -> IIlI(-25799426, var9 ^ -519606729);
            case 117 -> IIlI(-25799425, var9 ^ -1246239350);
            case 118 -> IIlI(-25799428, var9 ^ -1336055161);
            case 119 -> IIlI(-25799427, var9 ^ -1504581909);
            case 120 -> IIlI(-25799454, var9 ^ -1989593582);
            case 121 -> IIlI(-25799453, var9 ^ -720507270);
            case 122 -> IIlI(-25799456, var9 ^ 341752770);
            case 123 -> IIlI(-25799455, var9 ^ -551967069);
            case 124 -> IIlI(-25799450, var9 ^ -1776931702);
            case 125 -> IIlI(-25799449, var9 ^ 307908630);
            case 126 -> IIlI(-25799452, var9 ^ -245847844);
            case 127 -> IIlI(-25799451, var9 ^ -134279806);
            case 128 -> IIlI(-25799446, var9 ^ 147345233);
            case 129 -> IIlI(-25799445, var9 ^ -1000831981);
            case 130 -> IIlI(-25799448, var9 ^ -597515133);
            case 131 -> IIlI(-25799447, var9 ^ -1121982242);
            case 132 -> IIlI(-25799442, var9 ^ 634279040);
            case 133 -> IIlI(-25799441, var9 ^ -1920805080);
            case 134 -> IIlI(-25799444, var9 ^ -1832494224);
            case 135 -> IIlI(-25799443, var9 ^ 1815664261);
            case 136 -> IIlI(-25799470, var9 ^ -1016179559);
            case 137 -> 0;
            case 138 -> IIlI(-25799469, var9 ^ 1305781645);
            case 139 -> IIlI(-25799472, var9 ^ 1387729144);
            case 140 -> IIlI(-25799471, var9 ^ 659512863);
            case 141 -> IIlI(-25799466, var9 ^ 153909812);
            case 142 -> IIlI(-25799465, var9 ^ -1644192866);
            case 143 -> IIlI(-25799468, var9 ^ -143512721);
            case 144 -> IIlI(-25799467, var9 ^ -1894807438);
            case 145 -> IIlI(-25799462, var9 ^ -984792667);
            case 146 -> IIlI(-25799461, var9 ^ -451899110);
            case 147 -> IIlI(-25799464, var9 ^ -1651742981);
            case 148 -> IIlI(-25799463, var9 ^ -984015751);
            case 149 -> IIlI(-25799458, var9 ^ 335691846);
            case 150 -> IIlI(-25799457, var9 ^ 1024949037);
            case 151 -> IIlI(-25799460, var9 ^ -668100237);
            case 152 -> IIlI(-25799459, var9 ^ 184180362);
            case 153 -> IIlI(-25799486, var9 ^ 572194796);
            case 154 -> IIlI(-25799485, var9 ^ -749932057);
            case 155 -> IIlI(-25799488, var9 ^ -1808550681);
            case 156 -> IIlI(-25799487, var9 ^ 570395565);
            case 157 -> IIlI(-25799482, var9 ^ 486304365);
            case 158 -> IIlI(-25799481, var9 ^ -1823879381);
            case 159 -> IIlI(-25799484, var9 ^ -804593371);
            case 160 -> IIlI(-25799483, var9 ^ -75494102);
            case 161 -> IIlI(-25799478, var9 ^ -463623115);
            case 162 -> IIlI(-25799477, var9 ^ 1490900571);
            case 163 -> IIlI(-25799480, var9 ^ -2027839712);
            case 164 -> IIlI(-25799479, var9 ^ 592109930);
            case 165 -> IIlI(-25799474, var9 ^ -1882128558);
            case 166 -> IIlI(-25799473, var9 ^ 38775350);
            case 167 -> IIlI(-25799476, var9 ^ 1083946306);
            case 168 -> IIlI(-25799475, var9 ^ -1117313714);
            case 169 -> IIlI(-25799502, var9 ^ -952762542);
            case 170 -> IIlI(-25799501, var9 ^ 1846474569);
            case 171 -> IIlI(-25799504, var9 ^ 1332158704);
            case 172 -> IIlI(-25799503, var9 ^ 1937230327);
            case 173 -> IIlI(-25799498, var9 ^ 1822306044);
            case 174 -> IIlI(-25799497, var9 ^ -1340938890);
            case 175 -> IIlI(-25799500, var9 ^ 377538237);
            case 176 -> IIlI(-25799499, var9 ^ -1632982224);
            case 177 -> IIlI(-25799494, var9 ^ 1892230699);
            case 178 -> IIlI(-25799493, var9 ^ -536624052);
            case 179 -> IIlI(-25799496, var9 ^ 1249739160);
            case 180 -> IIlI(-25799495, var9 ^ -1277411251);
            case 181 -> IIlI(-25799490, var9 ^ 810557056);
            case 182 -> IIlI(-25799489, var9 ^ -837790186);
            case 183 -> IIlI(-25799492, var9 ^ 1169947516);
            case 184 -> IIlI(-25799491, var9 ^ 320545110);
            case 185 -> IIlI(-25799518, var9 ^ 1130970392);
            case 186 -> IIlI(-25799517, var9 ^ 500062570);
            case 187 -> IIlI(-25799520, var9 ^ -894897798);
            case 188 -> IIlI(-25799519, var9 ^ -875602172);
            case 189 -> IIlI(-25799514, var9 ^ -1147944194);
            case 190 -> IIlI(-25799513, var9 ^ 1020869561);
            case 191 -> IIlI(-25799516, var9 ^ 2019001716);
            case 192 -> IIlI(-25799515, var9 ^ -93575994);
            case 193 -> IIlI(-25799510, var9 ^ 491214605);
            case 194 -> IIlI(-25799509, var9 ^ 1621531342);
            case 195 -> IIlI(-25799512, var9 ^ -1208079542);
            case 196 -> IIlI(-25799511, var9 ^ 536165666);
            case 197 -> IIlI(-25799506, var9 ^ -1549552977);
            case 198 -> IIlI(-25799505, var9 ^ -1037745078);
            case 199 -> IIlI(-25799508, var9 ^ -1172013517);
            case 200 -> IIlI(-25799507, var9 ^ -1423853912);
            case 201 -> IIlI(-25799534, var9 ^ 986274020);
            case 202 -> IIlI(-25799533, var9 ^ -1065839859);
            case 203 -> IIlI(-25799536, var9 ^ 1308366950);
            case 204 -> IIlI(-25799535, var9 ^ -1877831731);
            case 205 -> IIlI(-25799530, var9 ^ -552409118);
            case 206 -> IIlI(-25799529, var9 ^ 1653567024);
            case 207 -> IIlI(-25799532, var9 ^ 310097180);
            case 208 -> IIlI(-25799531, var9 ^ -1842640139);
            case 209 -> 5;
            case 210 -> IIlI(-25799526, var9 ^ -102620426);
            case 211 -> IIlI(-25799525, var9 ^ -603510447);
            case 212 -> IIlI(-25799528, var9 ^ -1704097735);
            case 213 -> IIlI(-25799527, var9 ^ -1700630357);
            case 214 -> IIlI(-25799522, var9 ^ 1215372285);
            case 215 -> IIlI(-25799521, var9 ^ 537534931);
            case 216 -> IIlI(-25799524, var9 ^ -1558019565);
            case 217 -> IIlI(-25799523, var9 ^ -1841463485);
            case 218 -> IIlI(-25799550, var9 ^ 1128067129);
            case 219 -> IIlI(-25799549, var9 ^ 1286760655);
            case 220 -> IIlI(-25799552, var9 ^ 1555433965);
            case 221 -> IIlI(-25799551, var9 ^ 1617349028);
            case 222 -> IIlI(-25799546, var9 ^ -843736389);
            case 223 -> IIlI(-25799545, var9 ^ 1045102408);
            case 224 -> IIlI(-25799548, var9 ^ -249480944);
            case 225 -> IIlI(-25799547, var9 ^ 489493826);
            case 226 -> IIlI(-25799542, var9 ^ 1768332713);
            case 227 -> IIlI(-25799541, var9 ^ -335789084);
            case 228 -> IIlI(-25799544, var9 ^ 1950421147);
            case 229 -> IIlI(-25799543, var9 ^ 1785408678);
            case 230 -> IIlI(-25799538, var9 ^ 1927395724);
            case 231 -> IIlI(-25799537, var9 ^ -598906839);
            case 232 -> IIlI(-25799540, var9 ^ 2137330892);
            case 233 -> IIlI(-25799539, var9 ^ -1484348797);
            case 234 -> IIlI(-25799310, var9 ^ 1411543354);
            case 235 -> IIlI(-25799309, var9 ^ -346354599);
            case 236 -> IIlI(-25799312, var9 ^ -1788869196);
            case 237 -> IIlI(-25799311, var9 ^ 62518059);
            case 238 -> IIlI(-25799306, var9 ^ 426566292);
            case 239 -> IIlI(-25799305, var9 ^ 770814082);
            case 240 -> IIlI(-25799308, var9 ^ 1865271536);
            case 241 -> 1;
            case 242 -> IIlI(-25799307, var9 ^ -1260390327);
            case 243 -> IIlI(-25799302, var9 ^ 757619267);
            case 244 -> IIlI(-25799301, var9 ^ 1924805838);
            case 245 -> IIlI(-25799304, var9 ^ -1049038266);
            case 246 -> IIlI(-25799303, var9 ^ -2030095891);
            case 247 -> IIlI(-25799298, var9 ^ 323866953);
            case 248 -> IIlI(-25799297, var9 ^ 420204403);
            case 249 -> IIlI(-25799300, var9 ^ 1171244402);
            case 250 -> IIlI(-25799299, var9 ^ 1233755166);
            case 251 -> IIlI(-25799326, var9 ^ 137138552);
            case 252 -> IIlI(-25799325, var9 ^ 743808539);
            case 253 -> IIlI(-25799328, var9 ^ 1646811083);
            case 254 -> IIlI(-25799327, var9 ^ 1777550790);
            default -> IIlI(-25799322, var9 ^ -564953242);
         };
         int var5 = (var1 & IIlI(-25799321, var9 ^ 702068583)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIlI(-25799324, var9 ^ -1440078975)) >>> IIlI(-25799323, var9 ^ 1494778477)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIlI(-25799318, var9 ^ -1701982163);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIlI(-25799317, var9 ^ 1746397981);
            }
         }

         IIII[var2] = new String(var3).intern();
      }

      return IIII[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1389531386;
      int var17 = 0;
      int var16 = 0;
      String[] var15 = new String[2];
      int var10001 = "|奵虜䧴⺬削溫䬕﹚僴욭䶪纯䎕♚娔ڪ䢪麪䦵癟䷴⚨䯪ᚫ併幟䄔ڭ䜊꺮帵湜哔뺮僪隩庵ٝ侴뚯幪욬䛕⹛哴躯勊皬夵噙彴麯䯊䚮崵빘乴꺯䒪嚨䄵虝啴蚨䀪ẫ倵왛䭴ﺮ媪뚬䩵깚娔㺩䀊ﺫ䂵ṝ䈴ڬ厊躮巕홞伴嚩䰪皬䝕䙘忴캩䡪㚫坵깞䷴ﺨ妪溨䁵\uee5d嚴嚫䋪ẫ䗵Ṙ乴嚪䏊庨儕晝厔ꚮ䎪\uf6ab䏵蹚䷔\ue6a8-켇˺쎆降쬘鈍츧勻\udd46娉\udeb8\uea0e\ud9e7\ufafc쾆舍삘\u0a0c\udd07諹\ud9c6눌처樋팇\uf2fc훦㨏\udd18㨎쏧櫸퐦쨈잸숎폧ૺ\udfa6먈쿘⨏섧\ue2fd쯆"
         .length();
      short var18 = 12787;
      int var14 = var10001;
      String var13 = "|奵虜䧴⺬削溫䬕﹚僴욭䶪纯䎕♚娔ڪ䢪麪䦵癟䷴⚨䯪ᚫ併幟䄔ڭ䜊꺮帵湜哔뺮僪隩庵ٝ侴뚯幪욬䛕⹛哴躯勊皬夵噙彴麯䯊䚮崵빘乴꺯䒪嚨䄵虝啴蚨䀪ẫ倵왛䭴ﺮ媪뚬䩵깚娔㺩䀊ﺫ䂵ṝ䈴ڬ厊躮巕홞伴嚩䰪皬䝕䙘忴캩䡪㚫坵깞䷴ﺨ妪溨䁵\uee5d嚴嚫䋪ẫ䗵Ṙ乴嚪䏊庨儕晝厔ꚮ䎪\uf6ab䏵蹚䷔\ue6a8-켇˺쎆降쬘鈍츧勻\udd46娉\udeb8\uea0e\ud9e7\ufafc쾆舍삘\u0a0c\udd07諹\ud9c6눌처樋팇\uf2fc훦㨏\udd18㨎쏧櫸퐦쨈잸숎폧ૺ\udfa6먈쿘⨏섧\ue2fd쯆";

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var10002 = var17 + 1 + var19;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 79;
               case 1 -> 205;
               case 2 -> 14;
               case 3 -> 60;
               case 4 -> 208;
               case 5 -> 56;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IllI = var15;
      Illl = new Object[var15.length];
      int var9 = 1940155527;
      byte[] var7 = "è\u009999¬\u0018\u0082&rKâ×ÝÊ÷\u001bÔZû¾Ä²\u00197\fç¤É\t\u0006pbÏæm¨Î\u0096\u0015á(dÉ×ÔF\u0088Ó·\u0093p\u0080»\u000fX¼íp-{\u0088Ü[Ò¦\u009b\u0081WÈm\u0094d\u0081Ô¯\u0012Ù\f·ÂiäÏøàAÜ\u0012I¸Æ\u0004Û%\u0001RwÎ\u0003Ì©\fV\u0000Ç¿ÇLµ\u0014õYk\u001dQ+m[¾.8ß«{\u008d\u0083©î±\u0082z\u008bé´\u0083ïù¶8ÒvlÉ\u0016D|¢\u009aâ:\b»ØÙõ\u0092v\u0080\u0007|&£\f\u0094\u0006PY\b!05|Î¦\u00ad(»ë\u0086ñ\u0005¡*IW\t\u0089Þ|À\u0013<\u0081\u0080\u0094%V¾Æ\rêÛ¶/g7\u001fU`ø \u0080¾\u0019i~\u0081ø\u0016³Ñdª<ï\u0092w\u0083\u0001*\u00adAZ\b¬xR³û\u0092\u0003\f:\t~ÝtBÃwZiI»éÕb\u0010»\u009b\u0011v\u008ai\u001e\u0090¶\u009c\u0086>:¨å°ño\u0010i.Ñ\tµJÆH\u0000Èã(\u0088 áuà5ü~\u0099`¡\u0085Ä¢\u0088.È\u0017bR?CB/è\u001cÕ\u0012¤3å'i\u0005`\u0006Pi»øC°ïÚ~\u0097ÆÆ\u0082âºäðU\u0086¯v|ji\u0096\u0007\u0096\u008eõ\u0019)MAy¡|,6<\u0092K\u0086Í«h\u009f¯\u0017äÙæ\u001d\u009c¿c0^ßZxyè\u0090þouõ¥n@i\u000e±\u008c\u008e$\u0086\u0099V¡)Øá'l#t\u008foí\u0093\u0085óö\u0098&e9\u000b+§}:\t6m7AÈ\rª\u001d  \u0089¦¡Ö\u009c|¹Wk)\u0084´OQÅ*îMï \u0087@L×í\u0018Mm\u001dö\u0092ã\u009bô\u0003\u0014î;2®/§ôÓ;Ð*øy\r´\u0091ù/\u008byî#Ñ8XL\fbõÌ^\u001dÀÒô¥z¶e\u0014Ð\u008e\u0004ëÓý:MPÀï\u0006\u0082\fô]µÜ=½\u0011ô®\u0005¯ÊÁ&ÄãÀ\u0000\u0005S_\u0010¢ Ýí¢3ï\u009eJû\u0092¤¡¯\"/£ªÈ§y¼Ä+%\u0093üü\u0094Ï\u0098$F\u000eËqÏÅ\u008cks\u008c\u0083æú\bÏ\u009auëÍb©íjÇ\u009f\u0012]\u0085%ÞÍIÀÆ÷nô§\u008a\"Û?[\u0099U\u0097\u0017\u001d\u0012\u0088S\u0091îv\u00ad\u001c¡Ùû\u009e;WAo3H\"ÚÁ=Ú\u0094´\u0013¹·Ë\u0087jQ÷íçæ\u0098\u0095\u009aE¾ßØ\u008b\u0095ÿ\u0085[\u0001\u0087\u0019¬UßÌÖ\u000f\u000e\u0097\u008d\u0092'\u0082¶ÔÂ¸T½\u0010o\u0094\u009b8\u008f29ÉÙ;ö\u008e¦~³;jA¢\u0006i _\u0089Ü\u0005yÊ\u009f+\u009dá\u0015Ç\u0085þÈf:BH\u009c\u0003\u009d´U«9ß,\u0088\u0095E2²\u0018Ú`\u0081Z\u000ex\u008b§òïcÝ 5Qt\u009b=\\Uòí]iâ\u0003¿v\u000bäèª\u0087(\u009d\f\u0015\fâ\u0084?a,j\\ì\u0012ú\u0096\t PèKk©I\u008aD*ÅÓ\u000bÔ\u0085\u009c^_.1z\t\u008eë\u0095Yüð±\u0007[\u0093nÐ=;¡ÑZ\u00959¡\u0006\b\u008c&LöObÂOµàùîß\u0007Ò\u009d\u0004z3Wq\u00adkæß\u0005`÷[¹6xàØ°\u0089Ù ±´5±´{: \\\u0092\u009eÚíYnWiÒ\u0094\u008a\u0087BfÅ\u0087-Ëx\u001a¤[\bîx¤\u0088¾@\u001fãwïFÆ\u0092ãW\u0080øE\u0084\u00807ºÇRäÖ\u007f:\u009fëÕ¹·O¶\u0088¨²öY©:ýV'¢\u0086F#Ãèzó\u0004w× P³$ß5Ië´óÙ\u0007¸ß\u0006sóWÇñi\u008eunÔÝKpþæ\u009bhtsØÆØ¥µeðÞÒ½\u0013h¢N·½~ñÎÇè\u008fõÉ\u009e\u0019,8 \u0003ù)17d|¦u¸\u0003<®J3t7½\u0091\u0082h/ø²Ûí9I\u009cjý\u008c\tØ\u001aÅ\u0003\u009e\u0004Ë_Z\t\u0001S\u001cPN\u0012¹Zc6ÀU\u0087x½\u009cLsf\u0089\u0087ÄÆ´ö3M{\\°¼è¹C\u008dIM\u0080\u0018\u001c\u001br\u0082'*)\u001eRwd\u0082èAL\u0093Ãcè\u0096\u001drU0sÓÝ\u0017\u001fè\u001dX1n»\\ÞÆV·x\u0097oÔf\r\u0088,îÕ\u000bW?\u0092\u001bÖ>n"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IlIl = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IlIl[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[IIlI(-25799320, var23 ^ -165697482)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIll(-1879560078, var23 ^ 317106069)).length();
      int var1 = IIlI(-25799319, var23 ^ -1149038072);
      int var25 = -1;

      label98:
      while (true) {
         int var28 = IIlI(-25799314, var23 ^ -1819133500);
         String var31 = var2.substring(++var25, var25 + var1);
         byte var38 = -1;

         while (true) {
            label93: {
               char[] var47 = var31.toCharArray();
               int var10004 = var47.length;
               int var6 = 0;
               int var50 = var28;
               var43 = var47;
               var10001 = var10004;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var47;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var50 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label93;
                  }

                  var59 = var47;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var59[var10006] = (char)(var59[var10006] ^ var10004 ^ switch (var6 % IIlI(-25799342, var23 ^ -1034302699)) {
                     case 0 -> IIlI(-25799341, var23 ^ 1683825735);
                     case 1 -> IIlI(-25799344, var23 ^ -1984527669);
                     case 2 -> IIlI(-25799343, var23 ^ -1328178021);
                     case 3 -> IIlI(-25799338, var23 ^ 1462572143);
                     case 4 -> 3;
                     case 5 -> IIlI(-25799337, var23 ^ -732510962);
                     default -> IIlI(-25799340, var23 ^ -992492518);
                  });
                  var6++;
                  if (var50 == 0) {
                     var10006 = var50;
                     var59 = var43;
                     var10004 = var50;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var59 = var43;
                     var10004 = var50;
                     var10006 = var6;
                  }
               }
            }

            String var52 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var5[var3++] = var52;
                  if ((var25 += var1) >= var4) {
                     IIIl = var5;
                     IIII = new String[IIlI(-25799315, var23 ^ 35055020)];
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var52;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label98;
                  }

                  var4 = (var2 = IIll(-1879560077, var23 ^ -2038761849)).length();
                  var1 = IIlI(-25799313, var23 ^ 932701961);
                  var25 = -1;
            }

            var28 = IIlI(-25799316, var23 ^ -1976465086);
            var31 = var2.substring(++var25, var25 + var1);
            var38 = 0;
         }
      }
   }

   private boolean lII(class_746 var1) {
      return this.lI.IllI() && !this.llI(var1.method_31548().method_5438(this.I()));
   }

   private boolean lIl(class_310 var1) {
      return var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null && var1.field_1724.method_5805();
   }

   private static int IIlI(int var0, int var1) {
      int var2 = IlIl[var0 ^ -25799566] ^ var1 ^ var0;
      var2 -= 11111;
      var2 -= 6658;
      var2 -= 22819;
      var2 += 40878;
      var2 -= 54911;
      return var2 - 32240;
   }

   private boolean llI(class_1799 var1) {
      return var1 != null && !var1.method_7960() && var1.method_31574(class_1802.field_8288);
   }

   private boolean lll() {
      IIIIIllII var1 = IIIIIllII.III();
      IIIIIIIII var2 = var1 != null && var1.II() != null ? var1.II().IIIlII() : null;
      return var2 != null && var2.IIl();
   }

   private static boolean IIII() {
      return false;
   }

   private void IIIl(class_746 var1) {
      this.ll = var1.field_6012;
      this.lll = System.currentTimeMillis() + this.lI();
   }

   @Override
   public void llIl() {
      this.III(true);
   }
}
