package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_745;

@Environment(EnvType.CLIENT)
public final class lIlI extends IlIIIIIIl {
   private static final String[] IIII;
   private float I;
   private static final Object[] IIIl;
   private static final int[] lll;
   private static final String[] II;
   private class_243 Il;
   private class_745 lI;
   private final IIlIII ll;
   private static String[] III;
   private float IIl;
   private float IlI;
   private static final String[] Ill;
   private class_243 lII;
   private class_1297 lIl;
   private float llI;

   private class_243 I(double var1, double var3, double var5, float var7) {
      double var8 = Math.toRadians(var7);
      double var10 = Math.sin(var8);
      double var12 = Math.cos(var8);
      double var14 = var1 * -var10 + var3 * var12;
      double var16 = var1 * var12 + var3 * var10;
      return new class_243(var14, var5, var16);
   }

   private static String II(char[] var0, long var1, int var3) {
      int var4 = l(194510975, -1880611843 ^ 1522398058) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & l(194510974, -1880611843 ^ 1062225865);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private double Il(class_310 var1, class_304 var2, class_304 var3) {
      return (IIll.IlIllll(var1, var2) ? 1.0 : 0.0) - (IIll.IlIllll(var1, var3) ? 1.0 : 0.0);
   }

   private static void lI() {
      int var0 = -2890513;
      III[0] = II(lII(l(194510973, var0 ^ 1809389653), l(194510972, var0 ^ -610468362)).toCharArray(), 18375L, l(194510971, var0 ^ 1451148282));
      III[1] = II(lII(l(194510970, var0 ^ -244697932), l(194510969, var0 ^ -1523976901)).toCharArray(), 66937L, l(194510968, var0 ^ -1489707379));
      III[2] = II(lII(l(194510967, var0 ^ -1077400097), l(194510966, var0 ^ -2088110756)).toCharArray(), 56938L, l(194510965, var0 ^ -120055904));
   }

   @Override
   public void IlIII() {
      class_310 var1 = class_310.method_1551();
      this.lIl(var1);
      if (var1 != null && var1.field_1724 != null) {
         this.lII = var1.field_1724.method_5836(1.0F);
         this.Il = this.lII;
         this.IIl = var1.field_1724.method_36454();
         this.llI = this.IIl;
         this.IlI = var1.field_1724.method_36455();
         this.I = this.IlI;
         this.lIl = IIll.Il(var1);
         this.lI = new class_745(var1.field_1687, var1.field_1724.method_7334());
         this.lI.method_5719(var1.field_1724);
         this.lI.field_5960 = true;
         IIll.lIIIllI(var1, this.lI);
      } else {
         this.lII = null;
         this.Il = null;
      }
   }

   private static int l(int var0, int var1) {
      int var2 = lll[var0 ^ 194510975] ^ var1 ^ var0;
      var2 -= 38920;
      var2 -= 26732;
      var2 += 42648;
      var2 -= 63626;
      var2 ^= 60950;
      return var2 - 62864;
   }

   public class_243 ll(float var1) {
      if (this.lII == null) {
         return class_243.field_1353;
      } else {
         return this.Il == null ? this.lII : this.Il.method_35590(this.lII, class_3532.method_15363(var1, 0.0F, 1.0F));
      }
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1 == null || var1.field_1724 == null) {
         this.lIl(var1);
         this.lII = null;
         this.Il = null;
      } else if (this.lII != null && this.lI != null) {
         this.Il = this.lII;
         this.llI = this.IIl;
         this.I = this.IlI;
         this.IIl = this.lI.method_36454();
         this.IlI = this.lI.method_36455();
         double var2 = this.Il(var1, var1.field_1690.field_1894, var1.field_1690.field_1881);
         double var4 = this.Il(var1, var1.field_1690.field_1913, var1.field_1690.field_1849);
         double var6 = this.Il(var1, var1.field_1690.field_1903, var1.field_1690.field_1832);
         class_243 var8 = this.I(var2, var4, var6, this.IIl);
         if (!(var8.method_1027() <= 1.0E-6)) {
            double var9 = this.ll.IllI() * (IIll.IlIllll(var1, var1.field_1690.field_1867) ? 0.42 : 0.18);
            this.lII = this.lII.method_1019(var8.method_1029().method_1021(var9));
            this.lI.method_5814(this.lII.field_1352, this.lII.field_1351, this.lII.field_1350);
         }
      } else {
         this.IlIII();
      }
   }

   public boolean III(class_1297 var1) {
      return this.IIIIlIl() && var1 != null && this.lII != null;
   }

   private static String lll(int var0, int var1, char var2) {
      int var7 = var1 ^ -2075121196;
      char[] var6 = IIII[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])IIIl[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         IIIl[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 53545;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ var5 ^ 26474 ^ switch (var5 % 30) {
            default -> 223;
            case 1 -> 38;
            case 2 -> 212;
            case 3 -> 117;
            case 4 -> 101;
            case 5 -> 63;
            case 6 -> 231;
            case 7 -> 105;
            case 8 -> 194;
            case 9 -> 48;
            case 10 -> 250;
            case 11 -> 89;
            case 12 -> 238;
            case 13 -> 198;
            case 14 -> 174;
            case 15 -> 140;
            case 16 -> 6;
            case 17 -> 232;
            case 18 -> 68;
            case 19 -> 43;
            case 20 -> 82;
            case 21 -> 77;
            case 22 -> 22;
            case 23 -> 137;
            case 24 -> 40;
            case 25 -> 70;
            case 26 -> 143;
            case 27 -> 143;
            case 28 -> 232;
            case 29 -> 182;
         } ^ var2 ^ var1 ^ var4 ^ var0);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   public lIlI() {
      super(IlIIllIII.Ill(III[2]), lllIIlIl.IIl, IlIIllIII.Ill(III[1]));
      this.ll = this.IllIIll(new IIlIII(IlIIllIII.Ill(III[0]), 1.0, 0.1, 10.0, 0.1));
   }

   public float IIl(float var1) {
      return class_3532.method_16439(class_3532.method_15363(var1, 0.0F, 1.0F), this.I, this.IlI);
   }

   public float Ill(float var1) {
      return class_3532.method_17821(class_3532.method_15363(var1, 0.0F, 1.0F), this.llI, this.IIl);
   }

   private static String lII(int var0, int var1) {
      int var9 = 414796287;
      int var2 = (var0 ^ l(194510954, var9 ^ -517492443)) & l(194510953, var9 ^ -241641667);
      if (Ill[var2] == null) {
         char[] var3 = II[var2].toCharArray();

         int var4 = switch (var3[0] & l(194510952, var9 ^ -753550555)) {
            case 0 -> l(194510951, var9 ^ 816000539);
            case 1 -> l(194510950, var9 ^ -750872218);
            case 2 -> l(194510949, var9 ^ 1501436040);
            case 3 -> l(194510948, var9 ^ -1961392633);
            case 4 -> l(194510947, var9 ^ 2028242814);
            case 5 -> l(194510946, var9 ^ -711537375);
            case 6 -> l(194510945, var9 ^ 2131332585);
            case 7 -> l(194510944, var9 ^ 1852355310);
            case 8 -> l(194510943, var9 ^ -33829556);
            case 9 -> l(194510942, var9 ^ -1558497551);
            case 10 -> l(194510941, var9 ^ -1371600413);
            case 11 -> 2;
            case 12 -> l(194510940, var9 ^ -103537630);
            case 13 -> l(194510939, var9 ^ -439641385);
            case 14 -> l(194510938, var9 ^ 2132416672);
            case 15 -> l(194510937, var9 ^ -119465916);
            case 16 -> l(194510936, var9 ^ 1922298362);
            case 17 -> l(194510935, var9 ^ 2146948070);
            case 18 -> l(194510934, var9 ^ -1401722027);
            case 19 -> l(194510933, var9 ^ 1188633182);
            case 20 -> l(194510932, var9 ^ -2133920844);
            case 21 -> l(194510931, var9 ^ -362310957);
            case 22 -> l(194510930, var9 ^ -1292711141);
            case 23 -> l(194510929, var9 ^ 457024640);
            case 24 -> l(194510928, var9 ^ 2026415932);
            case 25 -> l(194510927, var9 ^ -1686481149);
            case 26 -> l(194510926, var9 ^ 1497974464);
            case 27 -> l(194510925, var9 ^ 1013868402);
            case 28 -> l(194510924, var9 ^ -184763233);
            case 29 -> l(194510923, var9 ^ 1067785509);
            case 30 -> l(194510922, var9 ^ 2108012573);
            case 31 -> l(194510921, var9 ^ 1849751893);
            case 32 -> l(194510920, var9 ^ 227181702);
            case 33 -> l(194510919, var9 ^ 418287079);
            case 34 -> l(194510918, var9 ^ 1713021653);
            case 35 -> l(194510917, var9 ^ 1364888967);
            case 36 -> l(194510916, var9 ^ -860847465);
            case 37 -> l(194510915, var9 ^ 1514815749);
            case 38 -> l(194510914, var9 ^ 872858607);
            case 39 -> l(194510913, var9 ^ 1666572083);
            case 40 -> l(194510912, var9 ^ 1853849897);
            case 41 -> l(194510911, var9 ^ 1784249499);
            case 42 -> l(194510910, var9 ^ -1873241263);
            case 43 -> l(194510909, var9 ^ -1618208874);
            case 44 -> l(194510908, var9 ^ 2090861186);
            case 45 -> l(194510907, var9 ^ -239440510);
            case 46 -> l(194510906, var9 ^ 1592762349);
            case 47 -> l(194510905, var9 ^ -459962891);
            case 48 -> l(194510904, var9 ^ -2013041832);
            case 49 -> l(194510903, var9 ^ -155736001);
            case 50 -> l(194510902, var9 ^ -1502773869);
            case 51 -> l(194510901, var9 ^ -1317432604);
            case 52 -> l(194510900, var9 ^ 631303504);
            case 53 -> l(194510899, var9 ^ 1174325000);
            case 54 -> l(194510898, var9 ^ 1610275060);
            case 55 -> l(194510897, var9 ^ -1025527937);
            case 56 -> l(194510896, var9 ^ 330906623);
            case 57 -> l(194510895, var9 ^ -1169306222);
            case 58 -> l(194510894, var9 ^ 1966920082);
            case 59 -> l(194510893, var9 ^ -646509636);
            case 60 -> l(194510892, var9 ^ 1894491169);
            case 61 -> l(194510891, var9 ^ 1578630231);
            case 62 -> l(194510890, var9 ^ -1666326780);
            case 63 -> l(194510889, var9 ^ -1220188643);
            case 64 -> l(194510888, var9 ^ 579250045);
            case 65 -> l(194510887, var9 ^ -882585575);
            case 66 -> l(194510886, var9 ^ -1671614730);
            case 67 -> l(194510885, var9 ^ 235993171);
            case 68 -> l(194510884, var9 ^ -1606409397);
            case 69 -> l(194510883, var9 ^ -1094628189);
            case 70 -> l(194510882, var9 ^ -132790456);
            case 71 -> l(194510881, var9 ^ 862501051);
            case 72 -> l(194510880, var9 ^ 1974613731);
            case 73 -> 5;
            case 74 -> l(194510879, var9 ^ 1642718414);
            case 75 -> 1;
            case 76 -> l(194510878, var9 ^ -16009869);
            case 77 -> l(194510877, var9 ^ 748528048);
            case 78 -> l(194510876, var9 ^ 137544207);
            case 79 -> l(194510875, var9 ^ -699055093);
            case 80 -> l(194510874, var9 ^ 1312766998);
            case 81 -> l(194510873, var9 ^ 627912964);
            case 82 -> l(194510872, var9 ^ 1556178463);
            case 83 -> l(194510871, var9 ^ -1178654105);
            case 84 -> l(194510870, var9 ^ -782857561);
            case 85 -> l(194510869, var9 ^ 1288148313);
            case 86 -> l(194510868, var9 ^ -664836774);
            case 87 -> l(194510867, var9 ^ -620041724);
            case 88 -> l(194510866, var9 ^ 1905205367);
            case 89 -> l(194510865, var9 ^ -1841752088);
            case 90 -> l(194510864, var9 ^ 1253427780);
            case 91 -> l(194510863, var9 ^ 182090817);
            case 92 -> l(194510862, var9 ^ 644165353);
            case 93 -> l(194510861, var9 ^ 793735247);
            case 94 -> l(194510860, var9 ^ -1603565126);
            case 95 -> 0;
            case 96 -> l(194510859, var9 ^ 1244329437);
            case 97 -> l(194510858, var9 ^ -1315749023);
            case 98 -> l(194510857, var9 ^ 1140399825);
            case 99 -> l(194510856, var9 ^ 155261332);
            case 100 -> l(194510855, var9 ^ -768807212);
            case 101 -> l(194510854, var9 ^ -948349812);
            case 102 -> l(194510853, var9 ^ 2126868519);
            case 103 -> l(194510852, var9 ^ 781766424);
            case 104 -> l(194510851, var9 ^ 540141153);
            case 105 -> l(194510850, var9 ^ 564064932);
            case 106 -> l(194510849, var9 ^ -901092819);
            case 107 -> l(194510848, var9 ^ 992358251);
            case 108 -> l(194511103, var9 ^ -103832662);
            case 109 -> l(194511102, var9 ^ -150414974);
            case 110 -> l(194511101, var9 ^ 119082455);
            case 111 -> l(194511100, var9 ^ 1186922784);
            case 112 -> l(194511099, var9 ^ 794763023);
            case 113 -> l(194511098, var9 ^ 47809784);
            case 114 -> l(194511097, var9 ^ 151613779);
            case 115 -> l(194511096, var9 ^ 123046006);
            case 116 -> l(194511095, var9 ^ -1518392468);
            case 117 -> l(194511094, var9 ^ -1608266061);
            case 118 -> l(194511093, var9 ^ -228039750);
            case 119 -> l(194511092, var9 ^ -1292087648);
            case 120 -> l(194511091, var9 ^ -2082720746);
            case 121 -> l(194511090, var9 ^ -182230608);
            case 122 -> l(194511089, var9 ^ 1280628964);
            case 123 -> l(194511088, var9 ^ 1846347432);
            case 124 -> l(194511087, var9 ^ 2002690538);
            case 125 -> l(194511086, var9 ^ -1633444231);
            case 126 -> l(194511085, var9 ^ 961460697);
            case 127 -> l(194511084, var9 ^ -1032812207);
            case 128 -> l(194511083, var9 ^ 1045827165);
            case 129 -> l(194511082, var9 ^ -1166560210);
            case 130 -> l(194511081, var9 ^ -1215826396);
            case 131 -> l(194511080, var9 ^ 1566568597);
            case 132 -> l(194511079, var9 ^ 1541197676);
            case 133 -> l(194511078, var9 ^ 2031607973);
            case 134 -> l(194511077, var9 ^ -1438915923);
            case 135 -> l(194511076, var9 ^ 1052471917);
            case 136 -> l(194511075, var9 ^ 1598573284);
            case 137 -> l(194511074, var9 ^ -557439067);
            case 138 -> l(194511073, var9 ^ -849021695);
            case 139 -> l(194511072, var9 ^ 984959867);
            case 140 -> l(194511071, var9 ^ 1065499300);
            case 141 -> l(194511070, var9 ^ -1144848909);
            case 142 -> l(194511069, var9 ^ 229898973);
            case 143 -> l(194511068, var9 ^ 2130678217);
            case 144 -> l(194511067, var9 ^ 1674720087);
            case 145 -> l(194511066, var9 ^ -588250991);
            case 146 -> l(194511065, var9 ^ -392331248);
            case 147 -> l(194511064, var9 ^ 1315956128);
            case 148 -> l(194511063, var9 ^ -1085397787);
            case 149 -> l(194511062, var9 ^ 502650778);
            case 150 -> l(194511061, var9 ^ 880031026);
            case 151 -> l(194511060, var9 ^ -576943736);
            case 152 -> l(194511059, var9 ^ -681353914);
            case 153 -> l(194511058, var9 ^ -1180465663);
            case 154 -> l(194511057, var9 ^ -955155453);
            case 155 -> l(194511056, var9 ^ -830985855);
            case 156 -> l(194511055, var9 ^ 169884579);
            case 157 -> l(194511054, var9 ^ 932749881);
            case 158 -> l(194511053, var9 ^ 530735642);
            case 159 -> l(194511052, var9 ^ 1651497669);
            case 160 -> l(194511051, var9 ^ -1966346482);
            case 161 -> l(194511050, var9 ^ 640992920);
            case 162 -> l(194511049, var9 ^ -1520010521);
            case 163 -> l(194511048, var9 ^ 2066459510);
            case 164 -> l(194511047, var9 ^ -1961976374);
            case 165 -> l(194511046, var9 ^ 700211686);
            case 166 -> l(194511045, var9 ^ -1667534623);
            case 167 -> l(194511044, var9 ^ -1357575698);
            case 168 -> l(194511043, var9 ^ 172017692);
            case 169 -> l(194511042, var9 ^ -732179569);
            case 170 -> l(194511041, var9 ^ -1413492949);
            case 171 -> l(194511040, var9 ^ -795125469);
            case 172 -> l(194511039, var9 ^ 146841094);
            case 173 -> l(194511038, var9 ^ 915466046);
            case 174 -> l(194511037, var9 ^ -879179561);
            case 175 -> l(194511036, var9 ^ 58222187);
            case 176 -> l(194511035, var9 ^ -897894319);
            case 177 -> l(194511034, var9 ^ -2057514304);
            case 178 -> l(194511033, var9 ^ 1415029497);
            case 179 -> l(194511032, var9 ^ 1899809752);
            case 180 -> l(194511031, var9 ^ 70668254);
            case 181 -> l(194511030, var9 ^ -1258631015);
            case 182 -> l(194511029, var9 ^ -120033069);
            case 183 -> l(194511028, var9 ^ 1893446298);
            case 184 -> l(194511027, var9 ^ -1753363778);
            case 185 -> l(194511026, var9 ^ 497913085);
            case 186 -> l(194511025, var9 ^ -555175034);
            case 187 -> l(194511024, var9 ^ 285640839);
            case 188 -> 4;
            case 189 -> l(194511023, var9 ^ -610867722);
            case 190 -> l(194511022, var9 ^ -488252289);
            case 191 -> l(194511021, var9 ^ -708055588);
            case 192 -> l(194511020, var9 ^ 809267155);
            case 193 -> l(194511019, var9 ^ -1371658214);
            case 194 -> l(194511018, var9 ^ 1152031557);
            case 195 -> l(194511017, var9 ^ 1011656562);
            case 196 -> l(194511016, var9 ^ 1076151448);
            case 197 -> l(194511015, var9 ^ -1232867268);
            case 198 -> l(194511014, var9 ^ 1642434546);
            case 199 -> l(194511013, var9 ^ -1434658444);
            case 200 -> l(194511012, var9 ^ 1616565841);
            case 201 -> l(194511011, var9 ^ 301820680);
            case 202 -> l(194511010, var9 ^ 685560747);
            case 203 -> l(194511009, var9 ^ 153320803);
            case 204 -> l(194511008, var9 ^ 1014406624);
            case 205 -> l(194511007, var9 ^ 1007781184);
            case 206 -> l(194511006, var9 ^ 1723275278);
            case 207 -> 3;
            case 208 -> l(194511005, var9 ^ -1518820810);
            case 209 -> l(194511004, var9 ^ 794882899);
            case 210 -> l(194511003, var9 ^ 1400168698);
            case 211 -> l(194511002, var9 ^ -833419254);
            case 212 -> l(194511001, var9 ^ -565921089);
            case 213 -> l(194511000, var9 ^ 1821107953);
            case 214 -> l(194510999, var9 ^ -1105319006);
            case 215 -> l(194510998, var9 ^ 1394892005);
            case 216 -> l(194510997, var9 ^ -19308952);
            case 217 -> l(194510996, var9 ^ 1717393897);
            case 218 -> l(194510995, var9 ^ 746454231);
            case 219 -> l(194510994, var9 ^ -1839546712);
            case 220 -> l(194510993, var9 ^ -2018847173);
            case 221 -> l(194510992, var9 ^ 731866854);
            case 222 -> l(194510991, var9 ^ -78147406);
            case 223 -> l(194510990, var9 ^ 1262700819);
            case 224 -> l(194510989, var9 ^ -675989352);
            case 225 -> l(194510988, var9 ^ 1506204094);
            case 226 -> l(194510987, var9 ^ -125584745);
            case 227 -> l(194510986, var9 ^ -6481845);
            case 228 -> l(194510985, var9 ^ -1998225971);
            case 229 -> l(194510984, var9 ^ 1162072471);
            case 230 -> l(194510983, var9 ^ 1319507357);
            case 231 -> l(194510982, var9 ^ 354415233);
            case 232 -> l(194510981, var9 ^ -1218383929);
            case 233 -> l(194510980, var9 ^ -21928912);
            case 234 -> l(194510979, var9 ^ -2061639004);
            case 235 -> l(194510978, var9 ^ 823928083);
            case 236 -> l(194510977, var9 ^ 497639844);
            case 237 -> l(194510976, var9 ^ 1409641579);
            case 238 -> l(194511231, var9 ^ -1823252178);
            case 239 -> l(194511230, var9 ^ -549811144);
            case 240 -> l(194511229, var9 ^ -1531435916);
            case 241 -> l(194511228, var9 ^ -1103566756);
            case 242 -> l(194511227, var9 ^ 277346994);
            case 243 -> l(194511226, var9 ^ 219459184);
            case 244 -> l(194511225, var9 ^ -1063971027);
            case 245 -> l(194511224, var9 ^ 1373515516);
            case 246 -> l(194511223, var9 ^ 367665627);
            case 247 -> l(194511222, var9 ^ 1722114994);
            case 248 -> l(194511221, var9 ^ 1132061345);
            case 249 -> l(194511220, var9 ^ -958813748);
            case 250 -> l(194511219, var9 ^ -1257814189);
            case 251 -> l(194511218, var9 ^ -244531996);
            case 252 -> l(194511217, var9 ^ -2102195761);
            case 253 -> l(194511216, var9 ^ -2116969580);
            case 254 -> l(194511215, var9 ^ 1959177922);
            default -> l(194511214, var9 ^ 1618660274);
         };
         int var5 = (var1 & l(194511213, var9 ^ 1003858076)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & l(194511212, var9 ^ -1607441755)) >>> l(194511211, var9 ^ 3047535)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & l(194511210, var9 ^ 810050751);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & l(194511209, var9 ^ 683329780);
            }
         }

         Ill[var2] = new String(var3).intern();
      }

      return Ill[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -255582644;
      short var7 = 850;
      char[] var9 = "Z".toCharArray();
      String var8 = "申Ⴤ㌺異\uf069泝䓎\udf7e\uf854扇佴卅ⱈ코孅礤\uf096繙痟휜ꩆ蹿剾↝ኽ\ue05a㊞᧳純㪳魌絘ꈏꨙ⡁⟝䌇ꛂ펫ꢁ抗킓၍⭿唃鍖㘢⫄캑즅釠֝뤤㱍察낙䅼ꟁ⒛躊\uea5a☩ⅶ䅏Ū䪎⋣豃䤮뵯⟸菭絒㬘邦⬫蚅\ue328袎റꚚⲦ蟬効鮦ֽ쉆넱힅鮿";
      String[] var10 = new String[var9.length];
      byte var14 = -1;

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            IIII = var10;
            IIIl = new Object[var10.length];
            int var21 = 0;
            int var10001 = 0;
            lll = new int[279];
            byte[] var10002 = "»ÉáµÅ\u0093M\u0094á!.²QdÏ\u0085\u009b5KÃ{\u0092\u0002S/Óy]Ì¤2ù50\u001b4\ts\u001fW\u008cUé½¹É7e\u008eP`\u000b{8ôÏõ\u0001ùÞGì\u0088J\u0016\u0014Ó\u0005\u0019»su>Þ0ct±ÆÂÔuÎ\u007f\u008cµ*Ã\u009c\t°u¾\u0087Ûl]1N6¾¬þ04ì|\u0002æ\u0085â\u008b\u0015vãÐ¸\u0004©È\u0012\u009bén\u0003úÒÒ\u0090i\u00adªÎ\u0089VîÃ\u00adm8\u0094F@¬\u0088Yþz\u0012\u0088x\u009e\u0095sx\n\u001f\u0001\u0091©\u0012e·iÁá\u000fí+KzMí\\\u0093â\u0087õöwß`¯Áv¯ÄÏ\u0015ZÇÍöè3Ã4Û\"2Qü\u0007,\u0099nÜ\u009bR7}P\u00107ØP\u0003Ò\u009d£`\u0018àXu|éX\u000b\u0088Â\u009c<Èío¡\"æR7Ø%×Y\u0094£þ\u000eÇ¿Å\u0003íå÷\u0007Ë\u001c\rýÊûcò\u001es/\u00112f\\\u009c(\r\u009b3}ÿÈ\u0089\u0007åµå\u0091\u000b@\u009b%ÈEËÿ\u001d¸ÜëöDH2\u008aH(l£Å2h¼'¯MË¢~+[\u007f×ß\u00ad\u0017\u0018®±\u0018´åo\u000b\u001dyÄ23\u0085\u0098µñ?¿{Ú×\u0006bO\u0014ÇU¦ö°\u0096ñÏJ\u0016c\u0082\u009c\u0086ÍÒC&ÓS+ª\u0095\u0087£ê^úØÅ\u0018 RQ\f{\u0084¾\u0092\u0099Õ\u001fA\u000fÁée ¢±»Ç \u0088#\u00adX\u0090HÿU\u009a1S\u0002¼Ô-N¤¼Äê\u0090!UõhµÍ\u0005W¶\u0098\u008a¯\u001c\u001d@Mÿ«wð''ª\ngH\u0018\u00adK÷N¾BÝ\u0014\u0082ÍùéÐ'¸\u0095½Ü\u0001'».k~tdÓ}i¿¾\u008e¿ªë4\u0082\u0013W\u0014áC\n¯¹M£\u00860L\f\u0096;§Ø\u000eµV´O1\u0094]Ãþ\u009a\u009a½\u0096j\u008bmO+-a\u007fBÍ\u007f\u0099oKäId\u009b\u0015PjÇèùÈíOgÍ±®,\u009fú\u0007Üßn.\u000fîNTT\u0098±\u0001!!Æ¼\u009b\u0003\u009ff\u007f\u001aÌÁ\u000bó1úrTÜÙ\u0092¯âé©SÄj)×åÕ\u0018Ú\u0015\u0096³0Í\u0094¨6N¯>\u0014\u0085\u0084ÀÇ©\u0082\u0006S)\u0012\u00832Ú.Ã³TG8 ö\u0091jW'/\u0019R\u0010^\u008aÖP\u009d7`!\u009a´\u0013mñ<\u000e@Wx±b`m\u0085\u000fà¨#ý\u0085ÊÒÜDwpg·:YæT<°\u000eégºñ9nÔ1â ª\u0083\u001d\b£êIRg²_\u0087Z\nÃ)r0\u0006\u001b\u000fý¾ÚçY\u008fÙK¦¡cÈô\u001a\r\u0016¹ÏZæ\u009cý]D.\u0005Ýñ\t\u0014áÂ\u0087i'gÒ¬V¹É³\u0010Æ-«z½\t>ÌeRþ¬[\u0002\u0083\u001b¦\n¬¼nê\u0006µ§éXÏèÎµQ9ÅÂ*\u001c®¯·i¤/\u0001Ùh´ä\u0095J\u0010p\u001dIÒIúï®òp?ì\f³zÓJ|\u0094ìÿ¶\u0004\u0081\u0080\u008fw¼±¸Y\u008d\n]®\u000b®Ã¬Hñ)8ÿ\u0016QÞÇu-¶¤\u0090Û\u0011\u0097¢\fwï\u0013Çî¹É\rÈ²y|o\u000b\u0097EN³}d±\u001d·QäýQQ\u0083å®\u000b%|bÈêÂúBò\u0093\u0098>æ\u0084¯£Áh#³ÖÚr\u0001\u0019\u0086\u0019Ó\u008cO¢>¶<r\u0093K>\u0093\u000bÏ=ÀAï\u0098\u008eÿÈÞvê8¶\u0097F\r\u00069\u0096Åð\u009a&Ñ-pº'Xf4T¹p\u0095\u0011Úd\u0092\u000f|Dåw\u001dA(ÑµÐ#4uµx\u008d\u0096\u008aÚò\u008fô\u0093#\u0005iè\u008f\u0082<\\\u008eAxp;\u0001}9\u0097\u000bÅþÁ\u0000k²¨êkÉ*E\u000fÓª\u0089\\}\u0015\u009f\u000e`\u0086ËË\u00ad\u0007rê<LO\u0096xxG\u0094\u000b7\u0006P.ë\u0083Ä«KÌzØ\u0095\"À\u009cþÝìï!iaìCþ\u0003\u0019TÏ©\rè®fVGÉÐÍ¡\u0004èm¼æ.]Ú\u0005ôE(©¼"
               .getBytes("ISO-8859-1");

            int var44;
            do {
               lll[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 2125611809;
               var21 += 1;
               var44 = var10001 + 4;
               var10001 += 4;
            } while (var44 < var10002.length);

            String[] var5 = new String[3];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lll(-441771554, -2075121196, '䖔')).length();
            int var1 = l(194510964, var18 ^ 1009125260);
            int var0 = -1;

            while (true) {
               label88: {
                  var21 = l(194510963, var18 ^ 197088082);
                  char[] var45 = var2.substring(++var0, var0 + var1).toCharArray();
                  int var55 = var45.length;
                  int var6 = 0;
                  var44 = var21;
                  var34 = var45;
                  var10001 = var55;
                  char[] var64;
                  int var71;
                  if (var55 <= 1) {
                     var64 = var45;
                     var55 = var21;
                     var71 = var6;
                  } else {
                     var44 = var21;
                     var10001 = var55;
                     if (var55 <= var6) {
                        break label88;
                     }

                     var64 = var45;
                     var55 = var21;
                     var71 = var6;
                  }

                  while (true) {
                     var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % l(194510962, var18 ^ -19413961)) {
                        case 0 -> l(194510961, var18 ^ 1894697717);
                        case 1 -> l(194510960, var18 ^ -1039941848);
                        case 2 -> l(194510959, var18 ^ -1812209593);
                        case 3 -> l(194510958, var18 ^ -1672200132);
                        case 4 -> l(194510957, var18 ^ -1154415783);
                        case 5 -> l(194510956, var18 ^ -245436096);
                        default -> l(194510955, var18 ^ 1369111032);
                     });
                     var6++;
                     if (var44 == 0) {
                        var71 = var44;
                        var64 = var34;
                        var55 = var44;
                     } else {
                        if (var10001 <= var6) {
                           break;
                        }

                        var64 = var34;
                        var55 = var44;
                        var71 = var6;
                     }
                  }
               }

               String var48 = new String(var34).intern();
               byte var28 = -1;
               var5[var3++] = var48;
               if ((var0 += var1) >= var4) {
                  II = var5;
                  Ill = new String[3];
                  III = new String[3];
                  lI();
                  return;
               }

               var1 = var2.charAt(var0);
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 123;
                  case 1 -> 42;
                  case 2 -> 118;
                  case 3 -> 215;
                  case 4 -> 84;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private void lIl(class_310 var1) {
      if (var1 != null && this.lI != null && IIll.Il(var1) == this.lI) {
         Object var2 = this.lIl != null ? this.lIl : var1.field_1724;
         IIll.lIIIllI(var1, (class_1297)var2);
      }

      this.lI = null;
      this.lIl = null;
   }

   @Override
   public void llIl() {
      class_310 var1 = class_310.method_1551();
      this.lIl(var1);
      this.lII = null;
      this.Il = null;
   }

   public void llI(float var1, float var2, float var3, float var4) {
      if (this.IIIIlIl() && this.lI != null) {
         float var5 = class_3532.method_15393(var3 - var1);
         float var6 = var4 - var2;
         this.llI = this.IIl;
         this.I = this.IlI;
         this.IIl += var5;
         this.IlI = class_3532.method_15363(this.IlI + var6, -90.0F, 90.0F);
         this.lI.method_36456(this.IIl);
         this.lI.method_36457(this.IlI);
      }
   }
}
