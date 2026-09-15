package k74.x;

import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2604;
import net.minecraft.class_2663;
import net.minecraft.class_2709;
import net.minecraft.class_2716;
import net.minecraft.class_2743;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_8143;

@Environment(EnvType.CLIENT)
public final class IIlllllIl extends IlIIIIIIl implements IIlIllII {
   private final IIlIII II;
   private static final String[] IIIlI;
   private static final double Il = 2.0;
   private final IIlIII lI;
   private final IIlIII ll;
   private static final double III = 2.0;
   private static final int[] IIIIl;
   private final lllIIlII IIl;
   private static final Object[] IIIll;
   private final IIlIII IlI;
   private final IIlIII Ill;
   private static final double lII = 10000.0;
   private final IllIII<lIIIlllI> lIl;
   private static final String[] llI;
   private static final String[] lll;
   private final lllIIlII IIII;
   private final lllIIlII IIIl;
   private static final double IIlI = 4.0;
   private static volatile lllllIlI IIll;
   private static final double IlII = 16.0;
   private static final double IlIl = 8.0;
   private static final double IllI = 8.0;
   private static final double Illl = 3.0;
   private static final double lIII = 6.0;
   private final lllIIlII lIIl;
   private static final double lIlI = 1000.0;
   private final IIlIII lIll;
   private static final double llII = 10000.0;
   private static final int llIl = 20;
   private static final int lllI = 10;
   private final IllIII<lIIlIlIl> llll;
   private static final double I = 64.0;
   private final lllIIlII IIIII;

   private boolean II() {
      return this.llll.IllI() == lIIlIlIl.Il && this.lIIl.IllI();
   }

   public double Il() {
      return this.lI.IllI();
   }

   public static class_243 lI(class_243 var0, class_243 var1, double var2) {
      if (var1 == null) {
         return null;
      } else {
         return var0 != null && !(var0.method_1025(var1) > 64.0) ? var0.method_35590(var1, Math.max(0.0, Math.min(1.0, var2))) : var1;
      }
   }

   public static class_243 ll(class_243 var0, class_243 var1, Set<class_2709> var2) {
      if (var1 == null) {
         return var0;
      } else {
         return var0 != null && var2 != null && !var2.isEmpty()
            ? new class_243(
               var2.contains(class_2709.field_12400) ? var0.field_1352 + var1.field_1352 : var1.field_1352,
               var2.contains(class_2709.field_12398) ? var0.field_1351 + var1.field_1351 : var1.field_1351,
               var2.contains(class_2709.field_12403) ? var0.field_1350 + var1.field_1350 : var1.field_1350
            )
            : var1;
      }
   }

   public boolean III() {
      return this.IIII.IllI();
   }

   private boolean IIl() {
      return this.llll.IllI() == lIIlIlIl.Il;
   }

   public boolean Ill() {
      return this.IIIl.IllI();
   }

   private static String lIIlI(int var0, int var1, int var2) {
      int var3 = var0 ^ 29828;
      char[] var4 = IIIlI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIIll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIIll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 12604;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 'ꑆ';
         var10 += 10128;
         var10 += 11687;
         var10 ^= 32139;
         var10 += 32559;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public boolean lII() {
      return this.lIIl.IllI();
   }

   public boolean lIl() {
      return this.IIIII.IllI();
   }

   public double llI() {
      return this.Ill.IllI();
   }

   @Override
   public boolean l() {
      lllllIlI var1 = IIll;
      return var1 != null && var1.II();
   }

   @Override
   public void IIlIl() {
      lllllIlI var1 = IIll;
      if (var1 != null) {
         var1.IIl(this);
      }
   }

   public static boolean lll(class_2596<?> var0, int var1) {
      return var0 instanceof class_2604 var2 && var2.method_11169() == class_1299.field_6133 && var2.method_11166() == var1;
   }

   public lIIIlllI IIII() {
      return this.lIl.IllI();
   }

   public static boolean IIIl(long var0, long var2, boolean var4) {
      return !var4 || var0 >= var2;
   }

   public static boolean IIlI(class_2596<?> var0, int var1) {
      return IllII(var0, var1, -1, 0L);
   }

   public double IIll() {
      return this.ll.IllI();
   }

   public boolean IlII() {
      return this.IIl.IllI();
   }

   public static double IlIl(lIIlIlIl var0, boolean var1, double var2) {
      if (var0 == lIIlIlIl.l) {
         return 6.0;
      } else if (var0 == lIIlIlIl.I) {
         return 8.0;
      } else {
         return var0 == lIIlIlIl.Il && var1 ? Math.max(2.0, Math.min(16.0, var2)) : Double.POSITIVE_INFINITY;
      }
   }

   @Override
   public void llIl() {
      this.lIlI();
      String[] var10000 = llIllIlI.IIlII();
      lllllIlI var2 = IIll;
      String[] var1 = var10000;
      if (var2 != null) {
         var2.ll(this);
         if (var1 != null) {
            return;
         }
      }

      IIlIIlIl.IlIIll();
      IIIIlIIIl.IIlIl().lIll(false);
   }

   public double IllI() {
      return this.IlI.IllI();
   }

   public double Illl() {
      return this.II.IllI();
   }

   @Override
   public void IlIlI(class_1297 var1) {
      if (this.lIl.IllI() == lIIIlllI.l) {
         lllllIlI var2 = IIll;
         if (var2 != null) {
            var2.lI(this, var1);
         }
      }
   }

   @Override
   public String IlIIl() {
      return this.llll.IllI().toString();
   }

   public static boolean lIII(class_243 var0, class_238 var1, double var2) {
      if (var0 != null && var1 != null) {
         double var4 = Math.max(var1.field_1323, Math.min(var0.field_1352, var1.field_1320));
         double var6 = Math.max(var1.field_1322, Math.min(var0.field_1351, var1.field_1325));
         double var8 = Math.max(var1.field_1321, Math.min(var0.field_1350, var1.field_1324));
         double var10 = var0.field_1352 - var4;
         double var12 = var0.field_1351 - var6;
         double var14 = var0.field_1350 - var8;
         return var10 * var10 + var12 * var12 + var14 * var14 > var2 * var2;
      } else {
         return false;
      }
   }

   @Override
   public boolean I(class_1297 var1) {
      lllllIlI var2 = IIll;
      return var2 != null && var2.I(var1);
   }

   @Override
   public void IlIII() {
      String[] var10000 = llIllIlI.IIlII();
      this.lIlI();
      String[] var1 = var10000;
      lllllIlI var2 = IIll;
      if (var2 != null) {
         var2.l(this);
         if (var1 != null) {
            return;
         }
      }

      IIlIIlIl.IlIIll();
      IIIIlIIIl.IIlIl().lIll(false);
   }

   private boolean lIIl() {
      return this.lIl.IllI() == lIIIlllI.I;
   }

   private void lIlI() {
   }

   private static String lIll(int var0, int var1) {
      int var9 = -1656383961;
      int var2 = (var0 ^ lIIIl(-674565756, var9 ^ 249666139)) & lIIIl(-674565755, var9 ^ 738575822);
      if (llI[var2] == null) {
         char[] var3 = lll[var2].toCharArray();

         int var4 = switch (var3[0] & lIIIl(-674565734, var9 ^ 1289088622)) {
            case 0 -> lIIIl(-674565733, var9 ^ -1211357425);
            case 1 -> lIIIl(-674565736, var9 ^ 226204480);
            case 2 -> lIIIl(-674565735, var9 ^ 113946948);
            case 3 -> lIIIl(-674565730, var9 ^ 1314484703);
            case 4 -> 4;
            case 5 -> lIIIl(-674565729, var9 ^ 96160536);
            case 6 -> lIIIl(-674565732, var9 ^ -164205883);
            case 7 -> lIIIl(-674565731, var9 ^ -960298199);
            case 8 -> lIIIl(-674565742, var9 ^ -765433970);
            case 9 -> lIIIl(-674565741, var9 ^ 171071869);
            case 10 -> lIIIl(-674565744, var9 ^ -949464345);
            case 11 -> lIIIl(-674565743, var9 ^ 1838156681);
            case 12 -> lIIIl(-674565738, var9 ^ -1674489614);
            case 13 -> lIIIl(-674565737, var9 ^ 290162059);
            case 14 -> lIIIl(-674565740, var9 ^ 605071672);
            case 15 -> lIIIl(-674565739, var9 ^ 1793601500);
            case 16 -> lIIIl(-674565718, var9 ^ -1729234895);
            case 17 -> lIIIl(-674565717, var9 ^ -919737250);
            case 18 -> lIIIl(-674565720, var9 ^ -1258201407);
            case 19 -> lIIIl(-674565719, var9 ^ 1489594545);
            case 20 -> lIIIl(-674565714, var9 ^ 2028781036);
            case 21 -> lIIIl(-674565713, var9 ^ 1262922567);
            case 22 -> lIIIl(-674565716, var9 ^ 1212921404);
            case 23 -> lIIIl(-674565715, var9 ^ 396228125);
            case 24 -> lIIIl(-674565726, var9 ^ 1199782875);
            case 25 -> lIIIl(-674565725, var9 ^ 1701145104);
            case 26 -> lIIIl(-674565728, var9 ^ -104555327);
            case 27 -> lIIIl(-674565727, var9 ^ 879809400);
            case 28 -> lIIIl(-674565722, var9 ^ 531637777);
            case 29 -> lIIIl(-674565721, var9 ^ 1501153128);
            case 30 -> lIIIl(-674565724, var9 ^ 139558657);
            case 31 -> lIIIl(-674565723, var9 ^ -1649536549);
            case 32 -> lIIIl(-674565702, var9 ^ -1837769177);
            case 33 -> lIIIl(-674565701, var9 ^ -204704544);
            case 34 -> lIIIl(-674565704, var9 ^ -1545154326);
            case 35 -> lIIIl(-674565703, var9 ^ -1805194215);
            case 36 -> lIIIl(-674565698, var9 ^ 1883506482);
            case 37 -> lIIIl(-674565697, var9 ^ 1059841860);
            case 38 -> lIIIl(-674565700, var9 ^ -2000972874);
            case 39 -> lIIIl(-674565699, var9 ^ -1255363571);
            case 40 -> lIIIl(-674565710, var9 ^ 87579845);
            case 41 -> lIIIl(-674565709, var9 ^ -1568069163);
            case 42 -> lIIIl(-674565712, var9 ^ -851481324);
            case 43 -> lIIIl(-674565711, var9 ^ -2109589907);
            case 44 -> lIIIl(-674565706, var9 ^ 21061325);
            case 45 -> lIIIl(-674565705, var9 ^ -518643540);
            case 46 -> 5;
            case 47 -> lIIIl(-674565708, var9 ^ -1521834754);
            case 48 -> lIIIl(-674565707, var9 ^ -318001561);
            case 49 -> lIIIl(-674565686, var9 ^ -2027660959);
            case 50 -> lIIIl(-674565685, var9 ^ 1337183491);
            case 51 -> lIIIl(-674565688, var9 ^ -1008501536);
            case 52 -> 1;
            case 53 -> lIIIl(-674565687, var9 ^ 1890893563);
            case 54 -> lIIIl(-674565682, var9 ^ 1981880667);
            case 55 -> lIIIl(-674565681, var9 ^ 1916979831);
            case 56 -> lIIIl(-674565684, var9 ^ -1566817369);
            case 57 -> lIIIl(-674565683, var9 ^ 437859021);
            case 58 -> lIIIl(-674565694, var9 ^ 440574316);
            case 59 -> lIIIl(-674565693, var9 ^ 1683772146);
            case 60 -> lIIIl(-674565696, var9 ^ -1871622356);
            case 61 -> lIIIl(-674565695, var9 ^ -1682827577);
            case 62 -> lIIIl(-674565690, var9 ^ 2019099520);
            case 63 -> lIIIl(-674565689, var9 ^ -1190816510);
            case 64 -> lIIIl(-674565692, var9 ^ 110322190);
            case 65 -> lIIIl(-674565691, var9 ^ 719774926);
            case 66 -> lIIIl(-674565670, var9 ^ 223668283);
            case 67 -> lIIIl(-674565669, var9 ^ 1125196409);
            case 68 -> lIIIl(-674565672, var9 ^ 1509047671);
            case 69 -> lIIIl(-674565671, var9 ^ -1427277122);
            case 70 -> lIIIl(-674565666, var9 ^ -33168241);
            case 71 -> lIIIl(-674565665, var9 ^ -2074144819);
            case 72 -> lIIIl(-674565668, var9 ^ 187496794);
            case 73 -> lIIIl(-674565667, var9 ^ 1992239212);
            case 74 -> lIIIl(-674565678, var9 ^ 1215201520);
            case 75 -> lIIIl(-674565677, var9 ^ -1769665519);
            case 76 -> lIIIl(-674565680, var9 ^ -732965548);
            case 77 -> lIIIl(-674565679, var9 ^ 1322552646);
            case 78 -> lIIIl(-674565674, var9 ^ 1092264408);
            case 79 -> lIIIl(-674565673, var9 ^ 2112801417);
            case 80 -> lIIIl(-674565676, var9 ^ 1332666749);
            case 81 -> lIIIl(-674565675, var9 ^ 1937491945);
            case 82 -> lIIIl(-674565654, var9 ^ -1829651511);
            case 83 -> lIIIl(-674565653, var9 ^ 1953222990);
            case 84 -> lIIIl(-674565656, var9 ^ -1908210705);
            case 85 -> lIIIl(-674565655, var9 ^ 1432019610);
            case 86 -> lIIIl(-674565650, var9 ^ -2125020395);
            case 87 -> lIIIl(-674565649, var9 ^ 1733676306);
            case 88 -> lIIIl(-674565652, var9 ^ -76954463);
            case 89 -> lIIIl(-674565651, var9 ^ -715302667);
            case 90 -> lIIIl(-674565662, var9 ^ 402439024);
            case 91 -> lIIIl(-674565661, var9 ^ -8241041);
            case 92 -> lIIIl(-674565664, var9 ^ -906019162);
            case 93 -> lIIIl(-674565663, var9 ^ -1876801067);
            case 94 -> lIIIl(-674565658, var9 ^ -1603084544);
            case 95 -> lIIIl(-674565657, var9 ^ 1284789848);
            case 96 -> lIIIl(-674565660, var9 ^ 1098737703);
            case 97 -> lIIIl(-674565659, var9 ^ -348604647);
            case 98 -> lIIIl(-674565638, var9 ^ -1976328740);
            case 99 -> lIIIl(-674565637, var9 ^ -931074226);
            case 100 -> lIIIl(-674565640, var9 ^ -342172479);
            case 101 -> lIIIl(-674565639, var9 ^ 1713050495);
            case 102 -> lIIIl(-674565634, var9 ^ -393986192);
            case 103 -> lIIIl(-674565633, var9 ^ 2126529758);
            case 104 -> lIIIl(-674565636, var9 ^ 968735207);
            case 105 -> lIIIl(-674565635, var9 ^ -1276572924);
            case 106 -> lIIIl(-674565646, var9 ^ -1529632279);
            case 107 -> lIIIl(-674565645, var9 ^ -200462643);
            case 108 -> lIIIl(-674565648, var9 ^ -1494925337);
            case 109 -> lIIIl(-674565647, var9 ^ -1725668780);
            case 110 -> lIIIl(-674565642, var9 ^ -1626474292);
            case 111 -> lIIIl(-674565641, var9 ^ -1878769352);
            case 112 -> lIIIl(-674565644, var9 ^ -826442760);
            case 113 -> lIIIl(-674565643, var9 ^ 1797952077);
            case 114 -> lIIIl(-674565878, var9 ^ 1659540997);
            case 115 -> lIIIl(-674565877, var9 ^ 251326626);
            case 116 -> lIIIl(-674565880, var9 ^ -8910644);
            case 117 -> lIIIl(-674565879, var9 ^ -1346319529);
            case 118 -> lIIIl(-674565874, var9 ^ -1990636273);
            case 119 -> lIIIl(-674565873, var9 ^ -1109498477);
            case 120 -> lIIIl(-674565876, var9 ^ -1304958860);
            case 121 -> lIIIl(-674565875, var9 ^ 755389160);
            case 122 -> lIIIl(-674565886, var9 ^ -2117501656);
            case 123 -> lIIIl(-674565885, var9 ^ -1774479686);
            case 124 -> lIIIl(-674565888, var9 ^ -458429856);
            case 125 -> lIIIl(-674565887, var9 ^ -666072529);
            case 126 -> lIIIl(-674565882, var9 ^ -1049677062);
            case 127 -> lIIIl(-674565881, var9 ^ 808753341);
            case 128 -> lIIIl(-674565884, var9 ^ -1979876320);
            case 129 -> lIIIl(-674565883, var9 ^ -1518593619);
            case 130 -> lIIIl(-674565862, var9 ^ -1662017001);
            case 131 -> lIIIl(-674565861, var9 ^ 322926811);
            case 132 -> lIIIl(-674565864, var9 ^ 1274399415);
            case 133 -> lIIIl(-674565863, var9 ^ -1442802638);
            case 134 -> lIIIl(-674565858, var9 ^ -1281727606);
            case 135 -> lIIIl(-674565857, var9 ^ -1440775566);
            case 136 -> lIIIl(-674565860, var9 ^ -932137185);
            case 137 -> lIIIl(-674565859, var9 ^ -1651020170);
            case 138 -> lIIIl(-674565870, var9 ^ -1524322997);
            case 139 -> lIIIl(-674565869, var9 ^ 922724561);
            case 140 -> lIIIl(-674565872, var9 ^ -1785051649);
            case 141 -> lIIIl(-674565871, var9 ^ -233976823);
            case 142 -> lIIIl(-674565866, var9 ^ 1137381417);
            case 143 -> lIIIl(-674565865, var9 ^ -1749324669);
            case 144 -> lIIIl(-674565868, var9 ^ -1645822800);
            case 145 -> lIIIl(-674565867, var9 ^ -754576485);
            case 146 -> lIIIl(-674565846, var9 ^ 1894864064);
            case 147 -> lIIIl(-674565845, var9 ^ -188036490);
            case 148 -> lIIIl(-674565848, var9 ^ -16385219);
            case 149 -> lIIIl(-674565847, var9 ^ 1056487908);
            case 150 -> lIIIl(-674565842, var9 ^ -1054746620);
            case 151 -> lIIIl(-674565841, var9 ^ -1519603892);
            case 152 -> lIIIl(-674565844, var9 ^ 1318085664);
            case 153 -> lIIIl(-674565843, var9 ^ -961126702);
            case 154 -> lIIIl(-674565854, var9 ^ -1397186541);
            case 155 -> lIIIl(-674565853, var9 ^ 852749016);
            case 156 -> lIIIl(-674565856, var9 ^ -1634465047);
            case 157 -> lIIIl(-674565855, var9 ^ 679709702);
            case 158 -> lIIIl(-674565850, var9 ^ -2129976477);
            case 159 -> lIIIl(-674565849, var9 ^ -1719072618);
            case 160 -> lIIIl(-674565852, var9 ^ 465699604);
            case 161 -> lIIIl(-674565851, var9 ^ -2094393167);
            case 162 -> lIIIl(-674565830, var9 ^ 2004778075);
            case 163 -> lIIIl(-674565829, var9 ^ 413961733);
            case 164 -> lIIIl(-674565832, var9 ^ 727553108);
            case 165 -> lIIIl(-674565831, var9 ^ 1953736057);
            case 166 -> lIIIl(-674565826, var9 ^ 400944353);
            case 167 -> lIIIl(-674565825, var9 ^ 97438789);
            case 168 -> lIIIl(-674565828, var9 ^ 765449196);
            case 169 -> lIIIl(-674565827, var9 ^ -294661154);
            case 170 -> lIIIl(-674565838, var9 ^ 1852053249);
            case 171 -> lIIIl(-674565837, var9 ^ -1254862718);
            case 172 -> lIIIl(-674565840, var9 ^ 342854131);
            case 173 -> lIIIl(-674565839, var9 ^ -932970543);
            case 174 -> lIIIl(-674565834, var9 ^ 2001998275);
            case 175 -> lIIIl(-674565833, var9 ^ 1152116492);
            case 176 -> lIIIl(-674565836, var9 ^ 452455789);
            case 177 -> lIIIl(-674565835, var9 ^ 1965816103);
            case 178 -> lIIIl(-674565814, var9 ^ -597306294);
            case 179 -> lIIIl(-674565813, var9 ^ 922767849);
            case 180 -> lIIIl(-674565816, var9 ^ 94929287);
            case 181 -> lIIIl(-674565815, var9 ^ 1767164227);
            case 182 -> lIIIl(-674565810, var9 ^ -1174524978);
            case 183 -> lIIIl(-674565809, var9 ^ 615215336);
            case 184 -> lIIIl(-674565812, var9 ^ 63417122);
            case 185 -> lIIIl(-674565811, var9 ^ -446281793);
            case 186 -> lIIIl(-674565822, var9 ^ -85659238);
            case 187 -> lIIIl(-674565821, var9 ^ 1759153810);
            case 188 -> lIIIl(-674565824, var9 ^ -461551642);
            case 189 -> lIIIl(-674565823, var9 ^ 1483249852);
            case 190 -> lIIIl(-674565818, var9 ^ -2128166846);
            case 191 -> lIIIl(-674565817, var9 ^ 1785498828);
            case 192 -> lIIIl(-674565820, var9 ^ -344903157);
            case 193 -> lIIIl(-674565819, var9 ^ 594835116);
            case 194 -> lIIIl(-674565798, var9 ^ -2127033128);
            case 195 -> lIIIl(-674565797, var9 ^ -1757765101);
            case 196 -> lIIIl(-674565800, var9 ^ -540935151);
            case 197 -> lIIIl(-674565799, var9 ^ -761417755);
            case 198 -> lIIIl(-674565794, var9 ^ 523349504);
            case 199 -> lIIIl(-674565793, var9 ^ 2022740838);
            case 200 -> lIIIl(-674565796, var9 ^ -1299383449);
            case 201 -> lIIIl(-674565795, var9 ^ 1430902507);
            case 202 -> lIIIl(-674565806, var9 ^ -965515606);
            case 203 -> lIIIl(-674565805, var9 ^ 1938422974);
            case 204 -> lIIIl(-674565808, var9 ^ 1202280120);
            case 205 -> 2;
            case 206 -> lIIIl(-674565807, var9 ^ -362617091);
            case 207 -> lIIIl(-674565802, var9 ^ -974660089);
            case 208 -> lIIIl(-674565801, var9 ^ -980552822);
            case 209 -> lIIIl(-674565804, var9 ^ 787173548);
            case 210 -> lIIIl(-674565803, var9 ^ 1117063464);
            case 211 -> lIIIl(-674565782, var9 ^ -1141796438);
            case 212 -> lIIIl(-674565781, var9 ^ 116446185);
            case 213 -> lIIIl(-674565784, var9 ^ 1438222557);
            case 214 -> lIIIl(-674565783, var9 ^ -495421879);
            case 215 -> lIIIl(-674565778, var9 ^ 1456538112);
            case 216 -> lIIIl(-674565777, var9 ^ -837813092);
            case 217 -> lIIIl(-674565780, var9 ^ 1558876280);
            case 218 -> lIIIl(-674565779, var9 ^ -1011963149);
            case 219 -> lIIIl(-674565790, var9 ^ -1455901203);
            case 220 -> 0;
            case 221 -> lIIIl(-674565789, var9 ^ 1207785208);
            case 222 -> lIIIl(-674565792, var9 ^ 754980648);
            case 223 -> lIIIl(-674565791, var9 ^ 1229940716);
            case 224 -> lIIIl(-674565786, var9 ^ 1208893899);
            case 225 -> lIIIl(-674565785, var9 ^ 1939205444);
            case 226 -> lIIIl(-674565788, var9 ^ 140373107);
            case 227 -> lIIIl(-674565787, var9 ^ -1358150814);
            case 228 -> lIIIl(-674565766, var9 ^ 1440957615);
            case 229 -> lIIIl(-674565765, var9 ^ -2033623008);
            case 230 -> lIIIl(-674565768, var9 ^ -1828644489);
            case 231 -> 3;
            case 232 -> lIIIl(-674565767, var9 ^ -1997570090);
            case 233 -> lIIIl(-674565762, var9 ^ 2129285717);
            case 234 -> lIIIl(-674565761, var9 ^ 1936136157);
            case 235 -> lIIIl(-674565764, var9 ^ -609737922);
            case 236 -> lIIIl(-674565763, var9 ^ -1528319040);
            case 237 -> lIIIl(-674565774, var9 ^ 858569925);
            case 238 -> lIIIl(-674565773, var9 ^ -1299008177);
            case 239 -> lIIIl(-674565776, var9 ^ 456419430);
            case 240 -> lIIIl(-674565775, var9 ^ -1176157293);
            case 241 -> lIIIl(-674565770, var9 ^ -1898431500);
            case 242 -> lIIIl(-674565769, var9 ^ 1669574172);
            case 243 -> lIIIl(-674565772, var9 ^ -352640368);
            case 244 -> lIIIl(-674565771, var9 ^ -1626645194);
            case 245 -> lIIIl(-674566006, var9 ^ -1902158382);
            case 246 -> lIIIl(-674566005, var9 ^ 622993158);
            case 247 -> lIIIl(-674566008, var9 ^ 883965410);
            case 248 -> lIIIl(-674566007, var9 ^ -1758164043);
            case 249 -> lIIIl(-674566002, var9 ^ 1860113019);
            case 250 -> lIIIl(-674566001, var9 ^ 2136733784);
            case 251 -> lIIIl(-674566004, var9 ^ -400199611);
            case 252 -> lIIIl(-674566003, var9 ^ -33108053);
            case 253 -> lIIIl(-674566014, var9 ^ 570658649);
            case 254 -> lIIIl(-674566013, var9 ^ -2106326950);
            default -> lIIIl(-674566016, var9 ^ 247547955);
         };
         int var5 = (var1 & lIIIl(-674566015, var9 ^ -699458854)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIIl(-674566010, var9 ^ 2018807388)) >>> lIIIl(-674566009, var9 ^ 927282063)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIIl(-674566012, var9 ^ 1812414710);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIIl(-674566011, var9 ^ -1790856827);
            }
         }

         llI[var2] = new String(var3).intern();
      }

      return llI[var2];
   }

   private static int lIIIl(int var0, int var1) {
      int var2 = IIIIl[var0 ^ -674565750] ^ var1 ^ var0;
      var2 ^= 2487;
      var2 -= 36512;
      var2 -= 40164;
      var2 -= 53741;
      var2 -= 18554;
      var2 -= 34424;
      var2 -= 6705;
      var2 ^= 4660;
      var2 -= 25906;
      return var2 ^ 3969;
   }

   private boolean llII() {
      return this.llll.IllI() == lIIlIlIl.Il;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 1049668573;
      short var7 = 30124;
      char[] var9 = "ŉ!".toCharArray();
      String var8 = "ꂔꌩꍱꌑꀭꁘꟽꍹꍪꂋꝢ꜍ꂭꂥꍑꍹꀰꁡꌓ\ua7d2ꂐꍋꏘꎃꂏꌾꂃꌩꁘꁊꌁꌲꍠꍰꀉꎱꂐꍕꍤꃛꏔꎘ\ua7e6\ua7cfꌅꌃꀴꎡꌇꂭꌂꃒꏠꏜꎉꂺꃺꍵꏛꎩ\ua7dfꌄꌞꍛꎓꎔꌛꃳꂞꍲꏼꏇꂒꂖꍸꌊꏅꎸꍙꍘꃘꃗꏫꏫꌘꌰꞍꂊꎤꁒꍯꎣꌵꂮꏳꁎꟐꂹꃼꌩꀳꁌꂱꟊꌿ\ua7f1ꀟꎜꂼꌴꂗꃚꝡꎕꌀ\ua7dcꍪꍽꎘꏢꌣꃨꍽꂸꏊꎓꍩꟉꍿꂃꝷꏻꍜꍳꃋꂓꎳ꜂ꌓꍿꞩ\ua7e4ꚕꎥꃀꌺꍸꌸꎰꏩꂣꃦꃩꍶꏝꏿꌸꟻꃺꂶꎐꎡꌿꟃꞴ\ua7ebꎰ꜋ꌊꌑꃾꌔꏛꁱ\ua7e9ꂧꍕꟳꎌꏫꍟꍫꌵꂥꏢꎙꂦꌋꙓꍿꝶꏜꍁꃱꃽꍢꎦꜫ\ua7e7ꂾꞽꂾꀘꜮꍔꌚꃮꌌꏞꏝꂾꟙꌜꟊꎂꎓꘈꂫꃹꂮꀰꎸꌡꂽꌿꍁꎿ꜂ꂞꟼꞥꍳꏭꁾꃗꍋꌏꃖꀈꁅꍓꍕꂘꟻꏇꎙꂯꍷꂗꌡꏑꎛꍿꟄꌰꂷꌗ꜂ꌒꂎꍕꌄꀁꎀꂦ\ua7deꃟꂸꎤꁊꌰꍬꃬꌉꎀꁥꍂꌄꞼꃐꏉꎠꌓꟐꞩꂍꀰꏻꍙꌢꍗꂀꏵꏀꌊ\ua7dcꌜꂬꁉꁂꃁꍘꞅ\ua7f1ꁛꁽꂱꌢꌺꂣꝠꎐ\ua7e7ꌞꌾꟅꎣꁊꌿꌭꃈꃓꁇꏳꂦꍝꞨꃚꁜ텣턉훹훋톝텑효\uddce훼턆톦톂횢횱턉텝홝홡횇훱텼횚퇇홄훏텤턾텕톫홡훘턙\udd85";
      String[] var10 = new String[var9.length];
      byte var14 = -1;

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            IIIlI = var10;
            IIIll = new Object[var10.length];
            int var22 = 0;
            IIIIl = new int[314];
            int var10001 = 0;
            byte[] var10002 = "í\u0081Ý\u0000\u0019GÍÓTÌ\u0016HN\\ÌømE\u0015\u0085ºGåiêw\u0013\u001c_C%\u0010n\u0019\u001bAë¹\u008b\u0000&¦Õb\u009a\u0098i\u0099~\u0087Êêªì\u0012\u0015<\u001f±\u001c\u001eý%í~*mR\u00853¤N?\u0084\u0018¤452l|¦òp7DÈCÄÉéÐô<\u0080Mà\u009fäº8ÍÛ´õ\u0097Ñ\u0092_o\u0088Þ®ÎÒ4#´\u0006¤\u0016ï*¹X\u0017\u00adjª\u0012{\u009fûÒoy\u0087þÝdj6ëaJ\u0013>7y¹)·z´5C%bu\u008au|¸\u0096W\u009aéFË;\u001fG\u0006\u008fPê-O¤Ók\u0086Dè:®ü'¯Q\u0093> \u008a]^Á3÷³\u0091\u0019R\u0016¦\u0099oGB»\u0085¤\rÔe¶ºD\u0010\f\u0087Ó.þ7Çß\u0096\u0090v«,ÿÀî\u0091°½´\u008e3¾ÝµÓé¢X\u0097µ'ôßô-\"µÛÛã}LN\u0003ñ\u001cþtBK=\u008fDÞ\u009b×@½H¥\u0090cÁO(æ°^(½#÷V£Ñ\u0090¢\u008eÌo©M\u0095ïJ¦\u0080\u00ad\u008bú\u0016\b4láU\u0018\u0019gË?«k8qî¡2k\r¿±\u0098\u0012ùZÌúf\u0018¶ \u008c½9ÓzXD@«\u000ez\u0091\u0002\u0000¤z\u008fDæ°V2|+\u000e-så#BO\u0011H?}\u0091b,A\u0084D> \u000e8éF\u0094R;¼¼\u0080(g¥aº³©A½UªNMÉ\u0096Fgç¢Ûî%\u00038\u0089Í}ÃKû\u0000½Î¢ÝÊ\u008d\u0092\u008d\\q~kÕMs\u0082ë2ÙÇ5\u0095¸Ì\u001frú\u007fl»Ùe_·Tä\u0090[Ú{¼LL?Æt\u000bB:d\u0081\u0016\u0088t\u0096,*¨Æò\u00ad\u0013\u0094\u001a¼Â«Ûàþ\u00adò{\b¢ûÂ@üBøÞYÕ\u0011yP\u0015\u0015\u009c<\u0005rìÍ\u0087\u008b\u0015\u009d?HÌ»¦Î\u0085\u008f!æ\u008e\u0080Èj%\u001fùÑ\u0093³6þG¤Ä\u0014áÖSiÌê³\tVó\u0090±\u000f\u0002Ë\u001b\u000f»\u0002ÿò\u0097\u0083\u009a<®\u0010!\u0090!Àú¦y\nIL\u0098ÿ\u0017 \u0081eàø\u0098à\u0001¡ú\u008f4\u0095¯hì\f\u0097Û.\u009c\u0004\u0000+¹§eÆ\u009dÀòNsq4\u0093Ä¥Dïy¯\u0019?\\áù\u0090\u008bB\u000eÖ\u00adÆ5I·ÍúyZ\f\u0007:3óÞ[³\u0097\u0093,\u009e|oælôIÝë\u009eG#í\u0000,iÃ¬k\u0089U\u001a|\u000f&³ô \u0091«v\u008b§)=\u00808±Õ\u009b¤E\u0081ÿ\u0081*S\r5\u0019¢\u0017ØF\u008c&@%\u001ao®71Oð\u001f`Q\u0086Ü\u0090PÍ\\\u009b\u0095\u0012\u0087ËÒæ&\u0090\u000bèú\u009c|@E«\u0092ÎvTd\u0017(\bnîGÔzîî\u009aW7\u0005ÿÓÈ7W\u0002b[«JÂ\u008b\u0001¨\u008a\u0016Tó\u009818)G×\u0099Ä\u0082È\u001br«Z%\r%Ö\u0082ÅÄj\u0097\u001bþ³ÙC~X\u0093\u000f\u000bÙ\u008e±\u0097\u0011\u008bõU³Ç\u008eÉ¥Å mí>~\u001aàb-í-Î-ýJo\u0010\u008b\u0080syXg¶U,ô\u008cåèAv~ñuVÕ'Ø\u009de£÷\u0018\\N÷rp\r\u001c\u0014ÓÁpj\u008az\u0089\u000e\u0012ö4\u000fP\u0005gF\u000b¢Ð\u0087õ\u001cd.\u0081\u0099üð\u007f\fn\u0015\u0013\u0005ñQ)\u000b\u009bÇ6ûu\u0002Õ\u0083\u001fÿ\u0094R{°ä\u0084zñÃìAjnÙ:¢oõ\u009dóÀ©g\u001cÇ¢´6ã\u0084¡þ\u009b/º\u0010ütL\u0015ÑÇA\u0098\u0094»éW¡*\u0096\u00181Ø\u0001Ó?Y\u0080m6¤)Ëëx\u008b\u001aÀñ¼'¸\u008eQ|-\u008dØ\u0004¡Ð\u00adôÞØ¼`ß¼\u0017Ý\u009d6\u0006O¿Í¥Ë\t\u009e\\ \u0090ËM¤zVÚÚò¦ÌùMñ\u0010ü\rJ°\u008b\u0082¤<>ÊÍä°\u0098ýJ¬o|\u0005º±\u0095^øÂÔ§¾3¦@¹^Î[º\u0081iÓmc\u0088\u0019\u009c¨\r\u008d?¿ñ\u000eÖ<± 6¯êy\u0016\u007fDîÑÍ¤7ÿ\u0011\u008e\u0082x»83ÄrêôS\u0092þä\u009a´\u001aU[\u0083p3\u000e\u0080\u0010\bÛ\u008aÄ\u00856s=|¡:ã\u0087'Sm=\u001a\u009c^Äsî\u0004K\fx,Ýþ#î\u001eëxÆôZ\u000b°=Ì\u0017\u008cUä\u000b&5¿ÓöGd^ò\u0097Pê\u0096½áIl\u001cE\u0016w÷À\u0091»\u0096\u0010ß]B\u008f£û\u00ad\u001f\u0012ZºãÙ\u0012\u0080É_±F9éñ©m¿\u007ftÆ[\u001f"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               IIIIl[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 2020843566;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var5 = new String[lIIIl(-674565750, var18 ^ 2091606857)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lIIlI(29828, var18 ^ -2028034467, 42467)).length();
            int var1 = lIIIl(-674565749, var18 ^ -2006092905);
            int var20 = -1;

            label101:
            while (true) {
               var22 = lIIIl(-674565752, var18 ^ -974739208);
               String var27 = var2.substring(++var20, var20 + var1);
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
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % lIIIl(-674565748, var18 ^ 2069736948)) {
                           case 0 -> lIIIl(-674565747, var18 ^ -831939733);
                           case 1 -> lIIIl(-674565758, var18 ^ -13392486);
                           case 2 -> lIIIl(-674565757, var18 ^ 2056467776);
                           case 3 -> lIIIl(-674565760, var18 ^ -1215534088);
                           case 4 -> lIIIl(-674565759, var18 ^ 196270055);
                           case 5 -> lIIIl(-674565754, var18 ^ -273845129);
                           default -> lIIIl(-674565753, var18 ^ 1002876087);
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
                        if ((var20 += var1) >= var4) {
                           lll = var5;
                           llI = new String[lIIIl(-674565745, var18 ^ 728587045)];
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var62;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label101;
                        }

                        var4 = (var2 = lIIlI(29829, var18 ^ 334732558, 24331)).length();
                        var1 = lIIIl(-674565751, var18 ^ -545885674);
                        var20 = -1;
                  }

                  var22 = lIIIl(-674565746, var18 ^ -59790453);
                  var27 = var2.substring(++var20, var20 + var1);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 165;
                  case 1 -> 141;
                  case 2 -> 254;
                  case 3 -> 181;
                  case 4 -> 59;
                  case 5 -> 125;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public static class_243 lllI(class_243 var0, long var1, long var3, long var5) {
      if (var0 == null) {
         return null;
      } else {
         double var7 = var0.field_1352;
         double var9 = var0.field_1351;
         double var11 = var0.field_1350;
         return new class_243(
            (Math.round(var7 * 4096.0) + var1) / 4096.0, (Math.round(var9 * 4096.0) + var3) / 4096.0, (Math.round(var11 * 4096.0) + var5) / 4096.0
         );
      }
   }

   public IIlllllIl() {
      int var2 = 1562043283;
      super(
         IlIIllIII.Ill(lIll(lIIIl(-674565990, var2 ^ -1307049673), lIIIl(-674565989, var2 ^ -1457796317))),
         lllIIlIl.I,
         IlIIllIII.Ill(lIll(lIIIl(-674565992, var2 ^ 567032933), lIIIl(-674565991, var2 ^ -348372424)))
      );
      llIllIlI.IIlII();
      this.llll = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(lIll(lIIIl(-674565986, var2 ^ 2141118486), lIIIl(-674565985, var2 ^ -59334838))), lIIlIlIl.class, lIIlIlIl.lI)
      );
      this.lIl = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(lIll(lIIIl(-674565988, var2 ^ -761794559), lIIIl(-674565987, var2 ^ -1950938433))), lIIIlllI.class, lIIIlllI.l)
      );
      this.lI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIll(lIIIl(-674565998, var2 ^ 477139529), lIIIl(-674565997, var2 ^ -983601593))), 3.0, 2.0, 4.0, 0.1)
            .IIIl(IlIIllIII.Ill(lIll(lIIIl(-674566000, var2 ^ 1893327907), lIIIl(-674565999, var2 ^ -1050390800))))
      );
      this.lIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIll(lIIIl(-674565994, var2 ^ 116575713), lIIIl(-674565993, var2 ^ 372937974))), true));
      this.Ill = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIll(lIIIl(-674565996, var2 ^ -1476731752), lIIIl(-674565995, var2 ^ -1045543276))), 8.0, 2.0, 16.0, 0.1)
            .IIIl(IlIIllIII.Ill(lIll(lIIIl(-674565974, var2 ^ -92613148), lIIIl(-674565973, var2 ^ 2006385692))))
      );
      this.IIII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIll(lIIIl(-674565976, var2 ^ -1912576724), lIIIl(-674565975, var2 ^ 1971807865))), true));
      this.lIll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIll(lIIIl(-674565970, var2 ^ -809778312), lIIIl(-674565969, var2 ^ 919848227))), 1000.0, 1000.0, 10000.0, 50.0)
            .IIIl(IlIIllIII.Ill(lIll(lIIIl(-674565972, var2 ^ -1179834383), lIIIl(-674565971, var2 ^ 794730173))))
      );
      this.IIIII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIll(lIIIl(-674565982, var2 ^ -330684646), lIIIl(-674565981, var2 ^ 117055588))), false));
      this.ll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIll(lIIIl(-674565984, var2 ^ -814921647), lIIIl(-674565983, var2 ^ -1488715169))), 1000.0, 0.0, 10000.0, 50.0)
            .IIIl(IlIIllIII.Ill(lIll(lIIIl(-674565978, var2 ^ -954299356), lIIIl(-674565977, var2 ^ -1245369737))))
      );
      this.IIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIll(lIIIl(-674565980, var2 ^ 1710339408), lIIIl(-674565979, var2 ^ 1329596083))), true));
      this.IIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIll(lIIIl(-674565958, var2 ^ -287028805), lIIIl(-674565957, var2 ^ 90196055))), true));
      this.II = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIll(lIIIl(-674565960, var2 ^ 1689354389), lIIIl(-674565959, var2 ^ -1339081613))), 9.0, 5.0, 16.0, 1.0)
            .IIIl(IlIIllIII.Ill(lIll(lIIIl(-674565954, var2 ^ 1606307202), lIIIl(-674565953, var2 ^ 1212379449))))
      );
      this.IlI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIll(lIIIl(-674565956, var2 ^ 1919418485), lIIIl(-674565955, var2 ^ -1264981164))), 215.0, 80.0, 255.0, 5.0)
      );
      this.lI.lIlI(this::lIIl);
      this.lIIl.lIlI(this::llII);
      this.Ill.lIlI(this::II);
      this.IIII.lIlI(this::IIl);
      this.ll.lIlI(this.IIIII::IllI);
      this.II.lIlI(this.IIIl::IllI);
      this.IlI.lIlI(this.IIIl::IllI);
      if (IlIIIIIIl.IIIlllI() == null) {
         llIllIlI.lII(new String[1]);
      }
   }

   private void IIIII(class_310 var1) {
      if (this.lIl.IllI() == lIIIlllI.I) {
         lllllIlI var2 = IIll;
         if (var2 != null) {
            this.IIllI(null, 0L);
         }
      }
   }

   public static lllllIlI IIIIl() {
      return IIll;
   }

   public boolean IIIlI(class_310 var1, class_1297 var2) {
      lllllIlI var3 = IIll;
      return var3 != null && var3.IlI(this, var1, var2);
   }

   public void IIIll() {
      this.lIlI();
      String[] var10000 = llIllIlI.IIlII();
      lllllIlI var2 = IIll;
      String[] var1 = var10000;
      if (var2 != null) {
         var2.ll(this);
         if (var1 != null) {
            return;
         }
      }

      IIlIIlIl.IlIIll();
      IIIIlIIIl.IIlIl().lIll(false);
   }

   public lIIlIlIl IIlII() {
      return this.llll.IllI();
   }

   private void IIllI(class_1297 var1, long var2) {
      IIIIlIIIl.IIlIl().IlIll(false);
      lllllIlI var4 = IIll;
      if (var4 != null) {
         var4.IIl(this);
      }
   }

   public static int IIlll(lIIIlllI var0) {
      return var0 == lIIIlllI.I ? lIIIl(-674565966, -1196591266 ^ -1099244403) : lIIIl(-674565965, -1196591266 ^ 1674655862);
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      lllllIlI var5 = IIll;
      if (var5 != null) {
         var5.Il(this, var1, var2, var3, var4);
      }
   }

   public static boolean IllII(class_2596<?> var0, int var1, int var2, long var3) {
      if (var0 == null || var1 < 0) {
         return false;
      } else if (var0 instanceof class_8143 var19) {
         if (var19.comp_1267() != var1) {
            return false;
         } else {
            return var2 >= 0 ? var19.comp_1269() == var2 || var19.comp_1270() == var2 : var19.comp_1269() >= 0 && var19.comp_1269() != var1;
         }
      } else if (var0 instanceof class_2743 var5) {
         if (var5.method_11818() != var1) {
            return false;
         } else {
            long var6 = System.currentTimeMillis();
            if (var6 - var3 < 400L) {
               return false;
            } else {
               class_243 var8 = var5.method_73085();
               if (var8 == null) {
                  return false;
               } else {
                  double var9 = var8.field_1352;
                  double var11 = var8.field_1351;
                  double var13 = var8.field_1350;
                  double var15 = var9 * var9 + var13 * var13;
                  double var17 = var15 + var11 * var11;
                  return var11 >= 0.1 || var15 >= 0.0484 || var17 >= 0.0625;
               }
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public void IlI(lIIlIl var1) {
      lllllIlI var2 = IIll;
      if (var2 != null) {
         var2.III(this, var1);
      }
   }

   public static void IllIl(lllllIlI var0) {
      IIll = var0;
   }

   public static boolean IlllI(class_2596<?> var0, class_1297 var1) {
      if (var0 == null || var1 == null) {
         return false;
      } else if (var0 instanceof class_2716 var4) {
         return var4.method_36548().contains(var1.method_5628());
      } else if (var0 instanceof class_2663 var2 && var2.method_11470() == 3) {
         class_310 var3 = class_310.method_1551();
         return var3 != null && var3.field_1687 != null && var2.method_11469(var3.field_1687) == var1;
      } else {
         return false;
      }
   }

   public double Illll() {
      return this.lIll.IllI();
   }

   public static void lIIII() {
      lllllIlI var0 = IIll;
      if (var0 != null) {
         var0.ll(null);
         IIll = null;
      }
   }
}
