package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import k74.y.lllIlII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_465;

@Environment(EnvType.CLIENT)
public final class IllllIII extends IlIIIIIIl {
   private long I;
   private static final int II = 40;
   private static final String[] IIIl;
   private static final int[] IIII;
   private static final long Il = 50L;
   private final lIlllIl lI;
   private final IIlIII ll;
   private long III;
   private static final String[] IIl;
   private final lllIIlII IlI;
   private static final Object[] IIlI;
   private int Ill;
   private long lII;
   private static final String[] lIl;
   private int llI;
   private int lll;

   @Override
   public void llIl() {
      this.lI();
      this.Ill = -1;
      this.III = 0L;
   }

   private static String I(int var0, int var1) {
      int var9 = 1372781124;
      int var2 = (var0 ^ ll(-2109093745, var9 ^ -4843420)) & ll(-2109093746, var9 ^ -376064419);
      if (lIl[var2] == null) {
         char[] var3 = IIl[var2].toCharArray();

         int var4 = switch (var3[0] & ll(-2109093747, var9 ^ 609637261)) {
            case 0 -> ll(-2109093748, var9 ^ -1319740775);
            case 1 -> 4;
            case 2 -> ll(-2109093749, var9 ^ 2013512382);
            case 3 -> ll(-2109093750, var9 ^ -1881618427);
            case 4 -> ll(-2109093751, var9 ^ -1372608884);
            case 5 -> ll(-2109093752, var9 ^ -32648721);
            case 6 -> ll(-2109093753, var9 ^ -764654013);
            case 7 -> ll(-2109093754, var9 ^ 2064349608);
            case 8 -> ll(-2109093755, var9 ^ 1423643142);
            case 9 -> ll(-2109093756, var9 ^ 1349333922);
            case 10 -> ll(-2109093757, var9 ^ 741263422);
            case 11 -> ll(-2109093758, var9 ^ -920839687);
            case 12 -> ll(-2109093759, var9 ^ 1035241230);
            case 13 -> ll(-2109093760, var9 ^ -1873380381);
            case 14 -> ll(-2109093729, var9 ^ -1000314118);
            case 15 -> ll(-2109093730, var9 ^ -378593578);
            case 16 -> ll(-2109093731, var9 ^ 1163024692);
            case 17 -> ll(-2109093732, var9 ^ 1992256485);
            case 18 -> ll(-2109093733, var9 ^ 635628363);
            case 19 -> ll(-2109093734, var9 ^ -817217426);
            case 20 -> ll(-2109093735, var9 ^ -1698781543);
            case 21 -> ll(-2109093736, var9 ^ 1499688880);
            case 22 -> ll(-2109093737, var9 ^ -865171998);
            case 23 -> ll(-2109093738, var9 ^ 990666965);
            case 24 -> ll(-2109093739, var9 ^ 1951178041);
            case 25 -> ll(-2109093740, var9 ^ 2022882529);
            case 26 -> ll(-2109093741, var9 ^ -1866535311);
            case 27 -> 5;
            case 28 -> ll(-2109093742, var9 ^ -1960378353);
            case 29 -> ll(-2109093743, var9 ^ -166802255);
            case 30 -> ll(-2109093744, var9 ^ -953264179);
            case 31 -> ll(-2109093713, var9 ^ -1046967945);
            case 32 -> ll(-2109093714, var9 ^ 401236938);
            case 33 -> ll(-2109093715, var9 ^ 1213133790);
            case 34 -> ll(-2109093716, var9 ^ -542253897);
            case 35 -> ll(-2109093717, var9 ^ -583287380);
            case 36 -> ll(-2109093718, var9 ^ -1327193899);
            case 37 -> ll(-2109093719, var9 ^ 1877342864);
            case 38 -> ll(-2109093720, var9 ^ 1251159433);
            case 39 -> ll(-2109093721, var9 ^ 1775273882);
            case 40 -> ll(-2109093722, var9 ^ 1411184804);
            case 41 -> ll(-2109093723, var9 ^ 688222296);
            case 42 -> ll(-2109093724, var9 ^ 1725285132);
            case 43 -> ll(-2109093725, var9 ^ -212532423);
            case 44 -> ll(-2109093726, var9 ^ 291979218);
            case 45 -> ll(-2109093727, var9 ^ -805204442);
            case 46 -> ll(-2109093728, var9 ^ -1924323907);
            case 47 -> ll(-2109093697, var9 ^ 542025912);
            case 48 -> ll(-2109093698, var9 ^ -530606692);
            case 49 -> ll(-2109093699, var9 ^ -1570027636);
            case 50 -> ll(-2109093700, var9 ^ 22150391);
            case 51 -> ll(-2109093701, var9 ^ -762569693);
            case 52 -> ll(-2109093702, var9 ^ 445943725);
            case 53 -> ll(-2109093703, var9 ^ -1363926609);
            case 54 -> ll(-2109093704, var9 ^ 1135366130);
            case 55 -> ll(-2109093705, var9 ^ -339377339);
            case 56 -> ll(-2109093706, var9 ^ 2109503987);
            case 57 -> ll(-2109093707, var9 ^ -1719784851);
            case 58 -> ll(-2109093708, var9 ^ 735037196);
            case 59 -> ll(-2109093709, var9 ^ -1121789575);
            case 60 -> ll(-2109093710, var9 ^ 824490531);
            case 61 -> ll(-2109093711, var9 ^ -705751833);
            case 62 -> ll(-2109093712, var9 ^ -990295174);
            case 63 -> ll(-2109093681, var9 ^ 1736167837);
            case 64 -> ll(-2109093682, var9 ^ 1718488404);
            case 65 -> ll(-2109093683, var9 ^ -1277613741);
            case 66 -> ll(-2109093684, var9 ^ 1044726342);
            case 67 -> ll(-2109093685, var9 ^ -1468797309);
            case 68 -> 1;
            case 69 -> ll(-2109093686, var9 ^ 1322421482);
            case 70 -> ll(-2109093687, var9 ^ -1824188842);
            case 71 -> ll(-2109093688, var9 ^ 1425765038);
            case 72 -> ll(-2109093689, var9 ^ 1614366341);
            case 73 -> ll(-2109093690, var9 ^ -1348207012);
            case 74 -> ll(-2109093691, var9 ^ -818541778);
            case 75 -> ll(-2109093692, var9 ^ 179009839);
            case 76 -> ll(-2109093693, var9 ^ 1578777633);
            case 77 -> ll(-2109093694, var9 ^ 322844450);
            case 78 -> ll(-2109093695, var9 ^ 1425252858);
            case 79 -> ll(-2109093696, var9 ^ 26004190);
            case 80 -> ll(-2109093665, var9 ^ 1750643344);
            case 81 -> ll(-2109093666, var9 ^ -1615865994);
            case 82 -> ll(-2109093667, var9 ^ -2037926078);
            case 83 -> ll(-2109093668, var9 ^ -1272841960);
            case 84 -> ll(-2109093669, var9 ^ -784176259);
            case 85 -> ll(-2109093670, var9 ^ -182161308);
            case 86 -> ll(-2109093671, var9 ^ -301924397);
            case 87 -> ll(-2109093672, var9 ^ 1412139405);
            case 88 -> ll(-2109093673, var9 ^ -157218671);
            case 89 -> ll(-2109093674, var9 ^ -1310040428);
            case 90 -> ll(-2109093675, var9 ^ 475725303);
            case 91 -> ll(-2109093676, var9 ^ -285762321);
            case 92 -> ll(-2109093677, var9 ^ -1373572864);
            case 93 -> ll(-2109093678, var9 ^ -509100014);
            case 94 -> ll(-2109093679, var9 ^ 1162894364);
            case 95 -> ll(-2109093680, var9 ^ 1505440318);
            case 96 -> ll(-2109093649, var9 ^ -1837378924);
            case 97 -> ll(-2109093650, var9 ^ -1093010170);
            case 98 -> ll(-2109093651, var9 ^ -198228820);
            case 99 -> ll(-2109093652, var9 ^ -341504789);
            case 100 -> ll(-2109093653, var9 ^ 1601749501);
            case 101 -> ll(-2109093654, var9 ^ 230239832);
            case 102 -> ll(-2109093655, var9 ^ -1226664566);
            case 103 -> ll(-2109093656, var9 ^ -719314789);
            case 104 -> ll(-2109093657, var9 ^ -434979407);
            case 105 -> ll(-2109093658, var9 ^ -1254290891);
            case 106 -> ll(-2109093659, var9 ^ 1542070151);
            case 107 -> ll(-2109093660, var9 ^ -2093398757);
            case 108 -> ll(-2109093661, var9 ^ -1315117758);
            case 109 -> ll(-2109093662, var9 ^ -643802058);
            case 110 -> ll(-2109093663, var9 ^ 1489702518);
            case 111 -> ll(-2109093664, var9 ^ 1797380968);
            case 112 -> ll(-2109093633, var9 ^ 1248301317);
            case 113 -> ll(-2109093634, var9 ^ 1256337647);
            case 114 -> ll(-2109093635, var9 ^ 1373785865);
            case 115 -> ll(-2109093636, var9 ^ -1331984464);
            case 116 -> ll(-2109093637, var9 ^ -311166691);
            case 117 -> ll(-2109093638, var9 ^ -1008467623);
            case 118 -> ll(-2109093639, var9 ^ 1852350817);
            case 119 -> ll(-2109093640, var9 ^ 1511032624);
            case 120 -> ll(-2109093641, var9 ^ 2142930144);
            case 121 -> ll(-2109093642, var9 ^ -1900966749);
            case 122 -> ll(-2109093643, var9 ^ -2021378248);
            case 123 -> ll(-2109093644, var9 ^ -659413613);
            case 124 -> ll(-2109093645, var9 ^ -1118042585);
            case 125 -> ll(-2109093646, var9 ^ 228591600);
            case 126 -> ll(-2109093647, var9 ^ 964876442);
            case 127 -> ll(-2109093648, var9 ^ -675794221);
            case 128 -> ll(-2109093873, var9 ^ -1298740153);
            case 129 -> ll(-2109093874, var9 ^ -2101844749);
            case 130 -> ll(-2109093875, var9 ^ 1795571327);
            case 131 -> ll(-2109093876, var9 ^ 1544917662);
            case 132 -> ll(-2109093877, var9 ^ 475199815);
            case 133 -> ll(-2109093878, var9 ^ -2050750495);
            case 134 -> ll(-2109093879, var9 ^ -2080362035);
            case 135 -> ll(-2109093880, var9 ^ -435903035);
            case 136 -> ll(-2109093881, var9 ^ -801298458);
            case 137 -> ll(-2109093882, var9 ^ -1141855150);
            case 138 -> ll(-2109093883, var9 ^ 907802130);
            case 139 -> ll(-2109093884, var9 ^ -749892422);
            case 140 -> ll(-2109093885, var9 ^ -125572082);
            case 141 -> ll(-2109093886, var9 ^ -810438400);
            case 142 -> ll(-2109093887, var9 ^ -2068390389);
            case 143 -> 3;
            case 144 -> ll(-2109093888, var9 ^ -972113958);
            case 145 -> ll(-2109093857, var9 ^ 1493658436);
            case 146 -> ll(-2109093858, var9 ^ 2034523442);
            case 147 -> ll(-2109093859, var9 ^ 1373270856);
            case 148 -> ll(-2109093860, var9 ^ -321137182);
            case 149 -> ll(-2109093861, var9 ^ -43569284);
            case 150 -> ll(-2109093862, var9 ^ -1894381224);
            case 151 -> ll(-2109093863, var9 ^ -1297091283);
            case 152 -> ll(-2109093864, var9 ^ 1816082666);
            case 153 -> ll(-2109093865, var9 ^ -1017211665);
            case 154 -> ll(-2109093866, var9 ^ -199657759);
            case 155 -> ll(-2109093867, var9 ^ -1453898023);
            case 156 -> ll(-2109093868, var9 ^ -1507893822);
            case 157 -> ll(-2109093869, var9 ^ 214783996);
            case 158 -> ll(-2109093870, var9 ^ 197215346);
            case 159 -> ll(-2109093871, var9 ^ -1060992222);
            case 160 -> ll(-2109093872, var9 ^ -1377477999);
            case 161 -> ll(-2109093841, var9 ^ -448596481);
            case 162 -> ll(-2109093842, var9 ^ 1525071712);
            case 163 -> ll(-2109093843, var9 ^ -1757361697);
            case 164 -> ll(-2109093844, var9 ^ 869908483);
            case 165 -> ll(-2109093845, var9 ^ -2097406645);
            case 166 -> ll(-2109093846, var9 ^ 1092022948);
            case 167 -> ll(-2109093847, var9 ^ 496359838);
            case 168 -> ll(-2109093848, var9 ^ -1923422751);
            case 169 -> ll(-2109093849, var9 ^ 228187745);
            case 170 -> ll(-2109093850, var9 ^ 472815239);
            case 171 -> ll(-2109093851, var9 ^ 693597422);
            case 172 -> ll(-2109093852, var9 ^ 2081601897);
            case 173 -> ll(-2109093853, var9 ^ -161139220);
            case 174 -> ll(-2109093854, var9 ^ -399059979);
            case 175 -> ll(-2109093855, var9 ^ 309441130);
            case 176 -> ll(-2109093856, var9 ^ 242829394);
            case 177 -> ll(-2109093825, var9 ^ -104561601);
            case 178 -> ll(-2109093826, var9 ^ 1470126223);
            case 179 -> ll(-2109093827, var9 ^ -1015064499);
            case 180 -> ll(-2109093828, var9 ^ 560393752);
            case 181 -> ll(-2109093829, var9 ^ -266612148);
            case 182 -> ll(-2109093830, var9 ^ 1122965925);
            case 183 -> ll(-2109093831, var9 ^ -2134396168);
            case 184 -> ll(-2109093832, var9 ^ 954334211);
            case 185 -> ll(-2109093833, var9 ^ -2144399044);
            case 186 -> ll(-2109093834, var9 ^ 1695463216);
            case 187 -> ll(-2109093835, var9 ^ -343080764);
            case 188 -> ll(-2109093836, var9 ^ 1860239689);
            case 189 -> ll(-2109093837, var9 ^ -2120692576);
            case 190 -> ll(-2109093838, var9 ^ 1896360835);
            case 191 -> ll(-2109093839, var9 ^ -339240750);
            case 192 -> ll(-2109093840, var9 ^ -921004167);
            case 193 -> 0;
            case 194 -> ll(-2109093809, var9 ^ 524111079);
            case 195 -> ll(-2109093810, var9 ^ 1756904862);
            case 196 -> ll(-2109093811, var9 ^ -1483377496);
            case 197 -> ll(-2109093812, var9 ^ 1990233601);
            case 198 -> ll(-2109093813, var9 ^ 260403093);
            case 199 -> ll(-2109093814, var9 ^ -1616038214);
            case 200 -> 2;
            case 201 -> ll(-2109093815, var9 ^ -1632442266);
            case 202 -> ll(-2109093816, var9 ^ 817581634);
            case 203 -> ll(-2109093817, var9 ^ -2125867203);
            case 204 -> ll(-2109093818, var9 ^ -2027007431);
            case 205 -> ll(-2109093819, var9 ^ -2010348492);
            case 206 -> ll(-2109093820, var9 ^ 90744880);
            case 207 -> ll(-2109093821, var9 ^ 1862248817);
            case 208 -> ll(-2109093822, var9 ^ -1624824604);
            case 209 -> ll(-2109093823, var9 ^ -1614404650);
            case 210 -> ll(-2109093824, var9 ^ -584648507);
            case 211 -> ll(-2109093793, var9 ^ 1367396498);
            case 212 -> ll(-2109093794, var9 ^ 167071773);
            case 213 -> ll(-2109093795, var9 ^ 1061462964);
            case 214 -> ll(-2109093796, var9 ^ -1534118170);
            case 215 -> ll(-2109093797, var9 ^ -1297204443);
            case 216 -> ll(-2109093798, var9 ^ -1582860747);
            case 217 -> ll(-2109093799, var9 ^ -1942145320);
            case 218 -> ll(-2109093800, var9 ^ -1937749188);
            case 219 -> ll(-2109093801, var9 ^ -1967191415);
            case 220 -> ll(-2109093802, var9 ^ -1018064959);
            case 221 -> ll(-2109093803, var9 ^ -353192435);
            case 222 -> ll(-2109093804, var9 ^ -103417275);
            case 223 -> ll(-2109093805, var9 ^ -1497831704);
            case 224 -> ll(-2109093806, var9 ^ 1773373393);
            case 225 -> ll(-2109093807, var9 ^ 1219566756);
            case 226 -> ll(-2109093808, var9 ^ -1005276351);
            case 227 -> ll(-2109093777, var9 ^ -2136530920);
            case 228 -> ll(-2109093778, var9 ^ 2101045714);
            case 229 -> ll(-2109093779, var9 ^ 390572359);
            case 230 -> ll(-2109093780, var9 ^ 454772047);
            case 231 -> ll(-2109093781, var9 ^ -1897003810);
            case 232 -> ll(-2109093782, var9 ^ 419793338);
            case 233 -> ll(-2109093783, var9 ^ 1503678276);
            case 234 -> ll(-2109093784, var9 ^ -765423846);
            case 235 -> ll(-2109093785, var9 ^ -2092099578);
            case 236 -> ll(-2109093786, var9 ^ 1355681080);
            case 237 -> ll(-2109093787, var9 ^ 226579775);
            case 238 -> ll(-2109093788, var9 ^ 626802799);
            case 239 -> ll(-2109093789, var9 ^ 396257083);
            case 240 -> ll(-2109093790, var9 ^ 1288646965);
            case 241 -> ll(-2109093791, var9 ^ -816684704);
            case 242 -> ll(-2109093792, var9 ^ -116355680);
            case 243 -> ll(-2109093761, var9 ^ 1801398724);
            case 244 -> ll(-2109093762, var9 ^ -1466593054);
            case 245 -> ll(-2109093763, var9 ^ -71692761);
            case 246 -> ll(-2109093764, var9 ^ 1382805453);
            case 247 -> ll(-2109093765, var9 ^ 1566045603);
            case 248 -> ll(-2109093766, var9 ^ 941438552);
            case 249 -> ll(-2109093767, var9 ^ -1317672952);
            case 250 -> ll(-2109093768, var9 ^ -1831247821);
            case 251 -> ll(-2109093769, var9 ^ -23391270);
            case 252 -> ll(-2109093770, var9 ^ 381330338);
            case 253 -> ll(-2109093771, var9 ^ 2076770770);
            case 254 -> ll(-2109093772, var9 ^ 439450828);
            default -> ll(-2109093773, var9 ^ -1967157504);
         };
         int var5 = (var1 & ll(-2109093774, var9 ^ 569767901)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(-2109093775, var9 ^ 563605463)) >>> ll(-2109093776, var9 ^ 1022689408)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(-2109093489, var9 ^ -1360071482);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(-2109093490, var9 ^ -818308502);
            }
         }

         lIl[var2] = new String(var3).intern();
      }

      return lIl[var2];
   }

   private static int ll(int var0, int var1) {
      int var2 = IIII[var0 ^ -2109093745] ^ var1 ^ var0;
      var2 ^= 36186;
      var2 += 8823;
      var2 -= 61531;
      var2 -= 41600;
      var2 ^= 46120;
      var2 -= 64772;
      return var2 + 37798;
   }

   private static String III(char var0, short var1, int var2) {
      int var3 = var0 ^ '詀';
      char[] var4 = IIIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 11145;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 509;
         var10 -= 25084;
         var10 ^= 42664;
         var10 += 50951;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private long l() {
      double var1 = this.lI.IIlI();
      double var3 = this.lI.IlI();
      return var3 <= var1 ? (long)Math.max(0.0, var1) : (long)(var1 + ThreadLocalRandom.current().nextDouble() * (var3 - var1));
   }

   private void II(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 != null && var1.field_1724 != null && var1.field_1761 != null && var1.field_1755 instanceof class_465 var3 && var2 == null) {
         class_1703 var10 = var3.method_17577();
         if (var10 != null && var10.method_34255().method_7960()) {
            class_1735 var5 = ((lllIlII)var3).q96fbb2be();
            if (var5 != null && var5.field_7874 >= 0 && var5.method_7681() && var5.method_7677().method_31574(class_1802.field_8288)) {
               int var7;
               label96: {
                  boolean var6 = var1.field_1724.method_6079().method_31574(class_1802.field_8288);
                  var7 = -1;
                  if (!var6) {
                     var7 = ll(-2109093473, 227553805 ^ 992710947);
                     if (var2 == null) {
                        break label96;
                     }
                  }

                  if (this.IlI.IllI() && this.Il(var1, var5)) {
                     int var8 = (int)Math.round(this.ll.IllI()) - 1;
                     if (var8 >= 0 && var8 < ll(-2109093474, 227553805 ^ -1099927759)) {
                        class_1799 var9 = var1.field_1724.method_31548().method_5438(var8);
                        if (var9.method_7960() && (var5.field_7871 != var1.field_1724.method_31548() || var5.method_34266() != var8)) {
                           var7 = var8;
                        }
                     }
                  }
               }

               if (var7 == -1) {
                  this.lI();
               } else {
                  long var11;
                  label81: {
                     var11 = System.currentTimeMillis();
                     if (var5.field_7874 != this.llI) {
                        this.llI = var5.field_7874;
                        this.lll = 1;
                        this.I = var11;
                        this.lII = this.l();
                        if (var2 == null) {
                           break label81;
                        }
                     }

                     this.lll++;
                  }

                  if (this.lll >= 2 && var11 - this.I >= this.lII) {
                     if (var5.field_7874 != this.Ill || var11 - this.III >= 50L + this.lII) {
                        if (lIIIllII.l(var1)) {
                           var1.field_1761.method_2906(var10.field_7763, var5.field_7874, var7, class_1713.field_7791, var1.field_1724);
                           this.Ill = var5.field_7874;
                           this.III = var11;
                        }
                     }
                  }
               }
            } else {
               this.lI();
            }
         }
      } else {
         this.lI();
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 140826045;
      int var11 = 0;
      int var10 = 0;
      String[] var9 = new String[2];
      short var12 = 519;
      int var8 = "[ﰫ㟻謹\uf7d0雷\uf74eﯳ럣ﳛ៍ﻙ㝕\uf86b㟶ﷃ럐\ufb09坜︫\uf7f0３ퟔ︩块賈埰ￓ㟙視坋遼럧䀘㟄睊ᝑ\ufaeb㟯ﮋ\uf7d3柳\uf75c쀫韻\uf8fbៈ﹁띘ﴳ៩︣\uf7d4ﳑ흃狼埻糧럘ﰹ眹３埵拾㟍\ue501띖ﲻ럥拏៍\uf881띟ﻳ韧ﾓៀ療흙\ufe1b矽旅矒ﲡ睇\ue5ab\uf7f2\uf82b\ud7c7\ufff1ᝅﾃ\u0019ⓦꂚ⍦ꂽ⛌䀶♾ꂑ⒎₰⏴耯⎞\u0084≞肵␜䀪∮\u0088⒞ꂬ⛄‶✖"
         .length();
      String var7 = "[ﰫ㟻謹\uf7d0雷\uf74eﯳ럣ﳛ៍ﻙ㝕\uf86b㟶ﷃ럐\ufb09坜︫\uf7f0３ퟔ︩块賈埰ￓ㟙視坋遼럧䀘㟄睊ᝑ\ufaeb㟯ﮋ\uf7d3柳\uf75c쀫韻\uf8fbៈ﹁띘ﴳ៩︣\uf7d4ﳑ흃狼埻糧럘ﰹ眹３埵拾㟍\ue501띖ﲻ럥拏៍\uf881띟ﻳ韧ﾓៀ療흙\ufe1b矽旅矒ﲡ睇\ue5ab\uf7f2\uf82b\ud7c7\ufff1ᝅﾃ\u0019ⓦꂚ⍦ꂽ⛌䀶♾ꂑ⒎₰⏴耯⎞\u0084≞肵␜䀪∮\u0088⒞ꂬ⛄‶✖";

      do {
         char var13 = var7.charAt(var11);
         char[] var10000 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;
         char[] var14 = var10000;

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 6;
               case 1 -> 10;
               case 2 -> 62;
               case 3 -> 40;
               case 4 -> 68;
               case 5 -> 172;
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

      IIIl = var9;
      IIlI = new Object[var9.length];
      int var22 = 0;
      int var10001 = 0;
      IIII = new int[288];
      byte[] var10002 = "ÐÔÕÿÆõâÊ\u000b7\u0004\u0019\u009e7\u000e?Wb\u0095õ ¹\u009cæ\u0081Nñ\u008bÑl\u0085\u0015ý\r\u00190Tj-^{ºE7\u007f\fgS\u0003O\u009ftæ|NÎ\u0012ÕÓ¶¿7,gë\u0001=\u0083Æ\u000eJgj3\u000eåYÞ?\u001d\n\u0083¼\"à+\u0017ýµßñ\u0080v\u00028\u0082ã\u000fÒ\u0015\u0014m7¹[-Ê0Wóë$¿ß¹°¤FW$Ùo\u0098KèO\u0003%îùÞß8\u008b7\u0003g/¤ÝðÌ\u008bKòZé<\u009f\u0085÷µ@\u0084®\u001feòzìF±Ð°{}¯\u0084\u0006d'*I´\u0094TÜ4T_>\u0006k^ÿ`Úñ¢,rå\u000f/ÿAÏ>ÁH\u008d\n\u0010ï.0«\u000eýíKI5õØÎ\u0081ÕvÞlÍ\u001bxÄ¤ÔëRÝ.×¶\u001f};\u0004®\u0093\u0082\u0092C\u008e7\u001eEíBú\u008eCÕë\u0098\u001c\u0099H\u001a\u0086\u0004I\u000fZx\u009c¸~5\u0011$\u0015Õ\u0087\u0012¹\u0006a³ÛÎ¼$A\b{\u009a%ªOX\u0011T\u0080Â©UàW_\u008d%Ê.æq{ké<_`P{\u0092öY.í\u009dFG9åP°Î\u0080C©æãå\u009b@\u00adÆþ#<yÚE$\u009aÁa¨\u008b{JÞ\u0080ÙÀ_^\u009e\u008b\tS3;©_Á\u0096Ë(\u0081A¦;ÎÆ\u0097\u0012j1\bòvÚeû½\u001a\u0085\u0096\u0091¸ªsÛN\u0013¤ÄÄ[Ép\u0019\u0096\u008b\"Øz\u009e\u0099\u0083ÂÁúAwPÉsêÙ\u009a\\]Bt\u008bK\u0016¬X\u0012A\u009eý²{öÁ\u000b\u0099wªZ¯D@\u008cÏe\u0006ÅÄe\u0083gÓ~\u0083\u0018\u001e\u009fúÐÕÂ\u0012\u00ad\u0095ì\u0085U£A\tö\u001fuqÐ/PÛÓ\u0012¡ÐØ\"¨å`d÷ÓrÚ\u0092=Qô\"ÁP\u000e\u0016ã\u008fýøÙe\u0083\u009d÷\u0098K\u00adÙ3ãDgi0stÅS33\u00adiª¥P\u001d«af\u008fÉeò`ÿ\\pu\u0094\u0091û\u0082\u0019z¡Sü,Û6×â»¢àÐæ¡«×\u0089ôéoàhvf<FV%\t\u0001~»$\u008dÃº\u0082îÒ\u0006x\u0094 w^D\u009dÎ¢:C^o\u0016ì?ÃÚÛx!\u0017\u00866\u0011T\u0089~\nr#¬\u0000±$ \u0013§ï£ßB\u0082\u0084\rÔÊ#¢\u0090u\u0087è\u0004¸!\u009eú\u001c¸\u0097\u0097\u00ad\u009dJ\u008cnw¦ñ2ô\u008e ¢;±ý\"ø\u0089\u00853OÁz\u00066#TSsîÈÙ\u0004biÇW\u0084'=\u0010åñ!\u0018\u001fûÖ¥Ó[xÁ\fÊì\u001e\fq\u000e\u0007º\u0012ßz\u0086Gm\u008eM¨¯¦å\u001d\u0017\u0080«f¯NFªJoàZÄìWNA\u0080UV®ù\u0098´^i\u007fÈÄ¦Ï}æ{Àú0\\\u001bàGÙj±\u0088ô \u008dYÁÚd ä8)°ÌaL±Ó¿x\u001fÚ\u0019ñ®(\u0080Ë¨O\u0005ý§MÓ\u008e*\tÿ¤A\u009eþ¶°Fs\u000e°§t;òG¯C~á\u0087Ç&\u0094\u0007º\u0010%÷Õ\u008bîa\u001d\u009dÏlª\u008eÆ!\u009a£\\bý£á\u001c\u0085¥Þ]eì0Û¦Å\u0093á\u0001Ö´\u00adE\u0089Ù±øFÒÐ\u0019gÐKyëuä\u009a¯ÆwÁRZ>x8&þ¿4z\u0012Ò¡\u008fS\\6dÞ@vÁ\u0018æý\u0001Ø\u009d¬,L\\\u007f¯Ym\"à\u00029\n=\u0014u8ÿ0Wc®fàà36\u0013ÖqÙèD>}\u008e\u0087ôÇÓÔÛYÉ}\n¸ër6¢\u0091\u0017|a>\u009e\u0014¼\u0014½¸7_ÑúDì9Ûô^T¨V\u00025P+e¥ÞØR\u000e\u0094 ¶\u000e÷»¿\u0013\u0094T\u0082\u0081\u008f¢PàXÌý\bÞ7}Y3_\u0086;°\u00978.rp\u0096Â³ÒÑ\u007f)b¢\u0003¥\bvÄ\u00149e½\u000fþüÎù\u0084.ù\u0017ÍÑZ èFn&:\u0087SG\u0000bH\b\u000f'ÍSò\u00954\u001fÌý/\u008c\u009bm\u0096\u0016{\u0014³E\u000e7¼ýéà_¢^W\u0002\u0015é\u001bü_a\u0091\u0011®ýÞÔ\u00067\u0085Ø}\u0005i\u0080ò¶C\u000f#`ÑÞ\u00adÑ\u009e"
         .getBytes("ISO-8859-1");

      int var55;
      do {
         IIII[var22] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -50813218;
         var22 += 1;
         var55 = var10001 + 4;
         var10001 += 4;
      } while (var55 < var10002.length);

      String[] var5 = new String[ll(-2109093491, var17 ^ 2114538873)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III('詀', (short)'ꩪ', var17 ^ 177578594)).length();
      int var1 = ll(-2109093492, var17 ^ 803480973);
      int var19 = -1;

      label101:
      while (true) {
         var22 = ll(-2109093493, var17 ^ 1298656900);
         String var27 = var2.substring(++var19, var19 + var1);
         byte var39 = -1;

         while (true) {
            label96: {
               char[] var57 = var27.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var22;
               var44 = var57;
               var10001 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var22;
                  var88 = var6;
               } else {
                  var55 = var22;
                  var10001 = var69;
                  if (var69 <= var6) {
                     break label96;
                  }

                  var81 = var57;
                  var69 = var22;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % ll(-2109093497, var17 ^ 1970434681)) {
                     case 0 -> ll(-2109093498, var17 ^ -1295826050);
                     case 1 -> ll(-2109093499, var17 ^ -875002013);
                     case 2 -> ll(-2109093500, var17 ^ -1204879951);
                     case 3 -> ll(-2109093501, var17 ^ -1883196290);
                     case 4 -> ll(-2109093502, var17 ^ 746033736);
                     case 5 -> ll(-2109093503, var17 ^ 418464635);
                     default -> ll(-2109093504, var17 ^ 630225351);
                  });
                  var6++;
                  if (var55 == 0) {
                     var88 = var55;
                     var81 = var44;
                     var69 = var55;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var81 = var44;
                     var69 = var55;
                     var88 = var6;
                  }
               }
            }

            String var62 = new String(var44).intern();
            switch (var39) {
               case 0:
                  var5[var3++] = var62;
                  if ((var19 += var1) >= var4) {
                     IIl = var5;
                     lIl = new String[ll(-2109093496, var17 ^ 167647395)];
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var62;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label101;
                  }

                  var4 = (var2 = III('詁', (short)'菋', var17 ^ 712630005)).length();
                  var1 = ll(-2109093494, var17 ^ 1487211159);
                  var19 = -1;
            }

            var22 = ll(-2109093495, var17 ^ -1268471665);
            var27 = var2.substring(++var19, var19 + var1);
            var39 = 0;
         }
      }
   }

   public IllllIII() {
      int var1 = -1895381691;
      super(
         IlIIllIII.Ill(I(ll(-2109093475, var1 ^ -978763916), ll(-2109093476, var1 ^ -566648133))),
         lllIIlIl.IlI,
         IlIIllIII.Ill(I(ll(-2109093477, var1 ^ 1738573997), ll(-2109093478, var1 ^ 1123025626)))
      );
      this.lI = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(I(ll(-2109093479, var1 ^ 1296767584), ll(-2109093480, var1 ^ -1374194406))), 0.0, 0.0, 0.0, 500.0, 5.0)
            .Ill(IlIIllIII.Ill(I(ll(-2109093481, var1 ^ -207414609), ll(-2109093482, var1 ^ 233370833))))
      );
      this.IlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(I(ll(-2109093483, var1 ^ -535294370), ll(-2109093484, var1 ^ 632356196))), true));
      this.ll = this.IllIIll(new IIlIII(IlIIllIII.Ill(I(ll(-2109093485, var1 ^ 701232866), ll(-2109093486, var1 ^ 1900529381))), 1.0, 1.0, 9.0, 1.0));
      this.Ill = -1;
      this.llI = -1;
   }

   private boolean Il(class_310 var1, class_1735 var2) {
      if (var1 != null && var1.field_1724 != null && var2 != null && var2.field_7871 == var1.field_1724.method_31548()) {
         int var3 = var2.method_34266();
         return var3 >= ll(-2109093487, 4393358 ^ 1909704441) && var3 < ll(-2109093488, 4393358 ^ -1604488182);
      } else {
         return false;
      }
   }

   private void lI() {
      this.llI = -1;
      this.lll = 0;
      this.I = 0L;
      this.lII = 0L;
   }

   @Override
   public void IIlIl() {
      this.II(class_310.method_1551());
   }

   @Override
   public void llIIII(class_310 var1) {
      this.II(var1);
   }
}
