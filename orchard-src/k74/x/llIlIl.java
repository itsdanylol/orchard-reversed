package k74.x;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class llIlIl extends IlIIIIIIl {
   private final IIlIII I;
   private final List<llIIIll> II;
   private static final String[] IIII;
   private static final Object[] IIIl;
   private double Il;
   private static final String[] lI;
   private final IIlIII ll;
   private boolean III;
   private static final int[] lll;
   private static final String[] IIl;
   private static final double IlI = 0.035;
   private static String[] Ill;
   private static final int lII = 96;
   private final IIlIII lIl;
   private final IIlIII llI;

   @Override
   public void IIlIl() {
      String[] var1 = IIllllIl.IIIIl();
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2 == null ? null : var2.field_1724;
      if (var3 != null && var2.field_1687 != null) {
         boolean var4;
         label28: {
            var4 = var3.method_24828();
            if (var4) {
               this.Il = var3.method_5829().field_1322;
               if (var1 == null) {
                  break label28;
               }
            }

            if (this.III && var3.method_18798().field_1351 > 0.08) {
               this.II.add(new llIIIll(new class_243(var3.method_23317(), this.Il + 0.035, var3.method_23321()), System.currentTimeMillis()));
            }
         }

         this.III = var4;
         this.Il(System.currentTimeMillis());
      } else {
         this.II.clear();
         this.III = false;
      }
   }

   public llIlIl() {
      super(IlIIllIII.Ill(Ill[3]), lllIIlIl.IIl, IlIIllIII.Ill(Ill[2]));
      this.lIl = this.IllIIll(new IIlIII(IlIIllIII.Ill(Ill[0]), 1.15, 0.25, 3.0, 0.05).IlII(IlIIllIII.lI(Ill[4])));
      this.llI = this.IllIIll(new IIlIII(IlIIllIII.Ill(Ill[ll(1146620675, 442101844 ^ 1918437072)]), 900.0, 250.0, 3000.0, 50.0).IlII(IlIIllIII.lI(Ill[1])));
      this.ll = this.IllIIll(new IIlIII(IlIIllIII.Ill(Ill[5]), 2.2, 0.5, 5.0, 0.1));
      this.I = this.IllIIll(new IIlIII(IlIIllIII.Ill(Ill[ll(1146620674, 442101844 ^ 827420899)]), 190.0, 25.0, 255.0, 1.0));
      this.II = new ArrayList<>();
   }

   private static int ll(int var0, int var1) {
      int var2 = lll[var0 ^ 1146620675] ^ var1 ^ var0;
      var2 += 14798;
      var2 -= 14116;
      var2 -= 47700;
      var2 += 20796;
      var2 -= 9587;
      var2 -= 53633;
      var2 += 42428;
      return var2 + 46790;
   }

   private Color I() {
      int var5 = -1218525123;
      IIIIIllII var1 = IIIIIllII.III();
      IIIlIIII var2 = var1 != null && var1.II() != null ? var1.II().IIlIIll() : null;
      Color var3 = var2 == null
         ? new Color(ll(1146620673, var5 ^ 1161740158), ll(1146620672, var5 ^ 159454107), ll(1146620679, var5 ^ 184407081), ll(1146620678, var5 ^ -450640889))
         : var2.lIlI();
      int var4 = class_3532.method_15340((int)Math.round(this.I.IllI()), 0, ll(1146620677, var5 ^ 195431911));
      return new Color(var3.getRed(), var3.getGreen(), var3.getBlue(), var4);
   }

   private static String l(int var0, int var1) {
      int var9 = -1231250512;
      int var2 = (var0 ^ ll(1146620693, var9 ^ 865315633)) & ll(1146620692, var9 ^ 1995513914);
      if (lI[var2] == null) {
         char[] var3 = IIl[var2].toCharArray();

         int var4 = switch (var3[0] & ll(1146620699, var9 ^ 1519133752)) {
            case 0 -> ll(1146620698, var9 ^ -884702053);
            case 1 -> ll(1146620697, var9 ^ -974287677);
            case 2 -> ll(1146620696, var9 ^ -1144139154);
            case 3 -> ll(1146620703, var9 ^ 1083396222);
            case 4 -> ll(1146620702, var9 ^ 688469088);
            case 5 -> ll(1146620701, var9 ^ 1539551807);
            case 6 -> ll(1146620700, var9 ^ 285849662);
            case 7 -> ll(1146620707, var9 ^ -1296149882);
            case 8 -> ll(1146620706, var9 ^ -269783598);
            case 9 -> ll(1146620705, var9 ^ -434950501);
            case 10 -> ll(1146620704, var9 ^ 1739613947);
            case 11 -> ll(1146620711, var9 ^ 1510421704);
            case 12 -> ll(1146620710, var9 ^ -287846268);
            case 13 -> ll(1146620709, var9 ^ 392321253);
            case 14 -> ll(1146620708, var9 ^ -1546579616);
            case 15 -> ll(1146620715, var9 ^ 1560577929);
            case 16 -> ll(1146620714, var9 ^ 474923612);
            case 17 -> 3;
            case 18 -> ll(1146620713, var9 ^ 1630383115);
            case 19 -> ll(1146620712, var9 ^ -1741298930);
            case 20 -> ll(1146620719, var9 ^ -361717465);
            case 21 -> ll(1146620718, var9 ^ 1162494017);
            case 22 -> ll(1146620717, var9 ^ -645443664);
            case 23 -> ll(1146620716, var9 ^ 1051882251);
            case 24 -> ll(1146620723, var9 ^ -275280968);
            case 25 -> ll(1146620722, var9 ^ -319891321);
            case 26 -> ll(1146620721, var9 ^ 2029052608);
            case 27 -> ll(1146620720, var9 ^ 1484640966);
            case 28 -> ll(1146620727, var9 ^ 1457908331);
            case 29 -> ll(1146620726, var9 ^ 1691030098);
            case 30 -> ll(1146620725, var9 ^ -1904903584);
            case 31 -> ll(1146620724, var9 ^ -895500755);
            case 32 -> 4;
            case 33 -> ll(1146620731, var9 ^ -180093511);
            case 34 -> ll(1146620730, var9 ^ 1217530497);
            case 35 -> ll(1146620729, var9 ^ -969966475);
            case 36 -> ll(1146620728, var9 ^ -575060434);
            case 37 -> ll(1146620735, var9 ^ -908113647);
            case 38 -> ll(1146620734, var9 ^ -2077951428);
            case 39 -> ll(1146620733, var9 ^ 542999128);
            case 40 -> ll(1146620732, var9 ^ -1289540296);
            case 41 -> ll(1146620739, var9 ^ -102493523);
            case 42 -> ll(1146620738, var9 ^ 302405102);
            case 43 -> ll(1146620737, var9 ^ 280399361);
            case 44 -> ll(1146620736, var9 ^ -2058323934);
            case 45 -> ll(1146620743, var9 ^ 1270409163);
            case 46 -> ll(1146620742, var9 ^ 1562948688);
            case 47 -> ll(1146620741, var9 ^ -1478477270);
            case 48 -> ll(1146620740, var9 ^ 699207756);
            case 49 -> ll(1146620747, var9 ^ 506678128);
            case 50 -> ll(1146620746, var9 ^ 1737667502);
            case 51 -> ll(1146620745, var9 ^ -1123186834);
            case 52 -> ll(1146620744, var9 ^ -675000606);
            case 53 -> ll(1146620751, var9 ^ -627167391);
            case 54 -> ll(1146620750, var9 ^ -295357885);
            case 55 -> ll(1146620749, var9 ^ 832741724);
            case 56 -> ll(1146620748, var9 ^ 2001045537);
            case 57 -> 0;
            case 58 -> ll(1146620755, var9 ^ -503156493);
            case 59 -> ll(1146620754, var9 ^ -1463003330);
            case 60 -> ll(1146620753, var9 ^ 1245028882);
            case 61 -> ll(1146620752, var9 ^ -568448806);
            case 62 -> ll(1146620759, var9 ^ 1775875238);
            case 63 -> ll(1146620758, var9 ^ -896327959);
            case 64 -> ll(1146620757, var9 ^ 2120056844);
            case 65 -> ll(1146620756, var9 ^ -1964519710);
            case 66 -> ll(1146620763, var9 ^ 957714900);
            case 67 -> ll(1146620762, var9 ^ 1217665599);
            case 68 -> ll(1146620761, var9 ^ -375365833);
            case 69 -> ll(1146620760, var9 ^ 984101440);
            case 70 -> ll(1146620767, var9 ^ 1228302628);
            case 71 -> ll(1146620766, var9 ^ 1957469876);
            case 72 -> ll(1146620765, var9 ^ -191009490);
            case 73 -> ll(1146620764, var9 ^ 969142218);
            case 74 -> ll(1146620771, var9 ^ -1707815860);
            case 75 -> ll(1146620770, var9 ^ 1005221473);
            case 76 -> ll(1146620769, var9 ^ 225603688);
            case 77 -> ll(1146620768, var9 ^ -1767334858);
            case 78 -> ll(1146620775, var9 ^ -450288031);
            case 79 -> ll(1146620774, var9 ^ -1381549656);
            case 80 -> ll(1146620773, var9 ^ -1124355189);
            case 81 -> ll(1146620772, var9 ^ -963342510);
            case 82 -> ll(1146620779, var9 ^ 1444385793);
            case 83 -> ll(1146620778, var9 ^ 1180134033);
            case 84 -> ll(1146620777, var9 ^ -1420210813);
            case 85 -> ll(1146620776, var9 ^ 1595687894);
            case 86 -> ll(1146620783, var9 ^ 986783985);
            case 87 -> ll(1146620782, var9 ^ -1065747556);
            case 88 -> ll(1146620781, var9 ^ 504781746);
            case 89 -> ll(1146620780, var9 ^ 1794483560);
            case 90 -> ll(1146620787, var9 ^ -748051036);
            case 91 -> ll(1146620786, var9 ^ 1950684238);
            case 92 -> ll(1146620785, var9 ^ 2082218170);
            case 93 -> ll(1146620784, var9 ^ 899028297);
            case 94 -> ll(1146620791, var9 ^ 898599331);
            case 95 -> ll(1146620790, var9 ^ 1682755689);
            case 96 -> ll(1146620789, var9 ^ 400901730);
            case 97 -> ll(1146620788, var9 ^ -1852254610);
            case 98 -> ll(1146620795, var9 ^ 1646978457);
            case 99 -> ll(1146620794, var9 ^ 273077954);
            case 100 -> ll(1146620793, var9 ^ 139393843);
            case 101 -> ll(1146620792, var9 ^ 1488199654);
            case 102 -> ll(1146620799, var9 ^ -902104290);
            case 103 -> ll(1146620798, var9 ^ -764024541);
            case 104 -> ll(1146620797, var9 ^ 965112087);
            case 105 -> ll(1146620796, var9 ^ -591147715);
            case 106 -> ll(1146620803, var9 ^ -32486312);
            case 107 -> ll(1146620802, var9 ^ 1197178792);
            case 108 -> ll(1146620801, var9 ^ 195053221);
            case 109 -> ll(1146620800, var9 ^ 281007834);
            case 110 -> ll(1146620807, var9 ^ 898480338);
            case 111 -> ll(1146620806, var9 ^ -2118087419);
            case 112 -> ll(1146620805, var9 ^ 450671141);
            case 113 -> ll(1146620804, var9 ^ -433180161);
            case 114 -> ll(1146620811, var9 ^ -2124408373);
            case 115 -> ll(1146620810, var9 ^ -792368823);
            case 116 -> ll(1146620809, var9 ^ 255057341);
            case 117 -> ll(1146620808, var9 ^ 1873508522);
            case 118 -> ll(1146620815, var9 ^ 1269447492);
            case 119 -> ll(1146620814, var9 ^ -1433512725);
            case 120 -> ll(1146620813, var9 ^ -469425104);
            case 121 -> ll(1146620812, var9 ^ 2029002121);
            case 122 -> ll(1146620819, var9 ^ 1678524011);
            case 123 -> ll(1146620818, var9 ^ 1402605841);
            case 124 -> ll(1146620817, var9 ^ -719246349);
            case 125 -> ll(1146620816, var9 ^ -327946772);
            case 126 -> ll(1146620823, var9 ^ -760692365);
            case 127 -> ll(1146620822, var9 ^ 1773098446);
            case 128 -> ll(1146620821, var9 ^ -1919813694);
            case 129 -> ll(1146620820, var9 ^ 989336000);
            case 130 -> ll(1146620827, var9 ^ -1624335692);
            case 131 -> ll(1146620826, var9 ^ -1673310677);
            case 132 -> ll(1146620825, var9 ^ -294957568);
            case 133 -> ll(1146620824, var9 ^ 1882426874);
            case 134 -> ll(1146620831, var9 ^ 1594248038);
            case 135 -> ll(1146620830, var9 ^ -2136894430);
            case 136 -> ll(1146620829, var9 ^ 213523689);
            case 137 -> ll(1146620828, var9 ^ 1413826875);
            case 138 -> ll(1146620835, var9 ^ -1878014861);
            case 139 -> ll(1146620834, var9 ^ 339761817);
            case 140 -> ll(1146620833, var9 ^ 327344824);
            case 141 -> ll(1146620832, var9 ^ -86200873);
            case 142 -> ll(1146620839, var9 ^ 1516203585);
            case 143 -> ll(1146620838, var9 ^ 604898079);
            case 144 -> ll(1146620837, var9 ^ 1891788518);
            case 145 -> ll(1146620836, var9 ^ -1564364778);
            case 146 -> ll(1146620843, var9 ^ 796223885);
            case 147 -> ll(1146620842, var9 ^ 1216603803);
            case 148 -> ll(1146620841, var9 ^ 1967759384);
            case 149 -> ll(1146620840, var9 ^ 1765976089);
            case 150 -> ll(1146620847, var9 ^ -673477507);
            case 151 -> ll(1146620846, var9 ^ -1877324505);
            case 152 -> ll(1146620845, var9 ^ -480384325);
            case 153 -> ll(1146620844, var9 ^ -132996717);
            case 154 -> ll(1146620851, var9 ^ 2122305588);
            case 155 -> ll(1146620850, var9 ^ -2039054571);
            case 156 -> ll(1146620849, var9 ^ -1791094430);
            case 157 -> ll(1146620848, var9 ^ -215693946);
            case 158 -> ll(1146620855, var9 ^ -697633288);
            case 159 -> ll(1146620854, var9 ^ -1677563225);
            case 160 -> ll(1146620853, var9 ^ 1583621447);
            case 161 -> ll(1146620852, var9 ^ 1293725285);
            case 162 -> ll(1146620859, var9 ^ 170532856);
            case 163 -> ll(1146620858, var9 ^ -160089298);
            case 164 -> ll(1146620857, var9 ^ 865991823);
            case 165 -> ll(1146620856, var9 ^ -544382388);
            case 166 -> ll(1146620863, var9 ^ 620253849);
            case 167 -> ll(1146620862, var9 ^ 658489100);
            case 168 -> ll(1146620861, var9 ^ -1705096381);
            case 169 -> ll(1146620860, var9 ^ -188331080);
            case 170 -> ll(1146620867, var9 ^ 27642385);
            case 171 -> ll(1146620866, var9 ^ 703027050);
            case 172 -> ll(1146620865, var9 ^ 1946659120);
            case 173 -> ll(1146620864, var9 ^ 1408469514);
            case 174 -> ll(1146620871, var9 ^ -186550434);
            case 175 -> ll(1146620870, var9 ^ -1985976507);
            case 176 -> ll(1146620869, var9 ^ 451096951);
            case 177 -> ll(1146620868, var9 ^ -251750054);
            case 178 -> ll(1146620875, var9 ^ 1801824245);
            case 179 -> ll(1146620874, var9 ^ 1436278359);
            case 180 -> ll(1146620873, var9 ^ -626879403);
            case 181 -> ll(1146620872, var9 ^ -1850384206);
            case 182 -> ll(1146620879, var9 ^ -935947109);
            case 183 -> ll(1146620878, var9 ^ -697570749);
            case 184 -> ll(1146620877, var9 ^ -1055642385);
            case 185 -> ll(1146620876, var9 ^ -1888909851);
            case 186 -> ll(1146620883, var9 ^ -1439197167);
            case 187 -> ll(1146620882, var9 ^ -977743322);
            case 188 -> ll(1146620881, var9 ^ -1296088654);
            case 189 -> ll(1146620880, var9 ^ -670887586);
            case 190 -> ll(1146620887, var9 ^ 468440048);
            case 191 -> ll(1146620886, var9 ^ 693930601);
            case 192 -> ll(1146620885, var9 ^ -1909876386);
            case 193 -> ll(1146620884, var9 ^ -130767154);
            case 194 -> ll(1146620891, var9 ^ -498521409);
            case 195 -> ll(1146620890, var9 ^ -1290732713);
            case 196 -> ll(1146620889, var9 ^ 168598767);
            case 197 -> ll(1146620888, var9 ^ 1007245996);
            case 198 -> ll(1146620895, var9 ^ -1016334953);
            case 199 -> ll(1146620894, var9 ^ 314553075);
            case 200 -> ll(1146620893, var9 ^ -1423258805);
            case 201 -> ll(1146620892, var9 ^ 185873474);
            case 202 -> ll(1146620899, var9 ^ -673262811);
            case 203 -> ll(1146620898, var9 ^ 525533313);
            case 204 -> ll(1146620897, var9 ^ -1858077922);
            case 205 -> ll(1146620896, var9 ^ -956882334);
            case 206 -> ll(1146620903, var9 ^ -1273743912);
            case 207 -> ll(1146620902, var9 ^ 1930080693);
            case 208 -> ll(1146620901, var9 ^ 1275717325);
            case 209 -> ll(1146620900, var9 ^ 1654600975);
            case 210 -> ll(1146620907, var9 ^ -1200394205);
            case 211 -> ll(1146620906, var9 ^ 588920067);
            case 212 -> 2;
            case 213 -> ll(1146620905, var9 ^ -1109678135);
            case 214 -> ll(1146620904, var9 ^ -1939421717);
            case 215 -> ll(1146620911, var9 ^ -507867516);
            case 216 -> ll(1146620910, var9 ^ -713814936);
            case 217 -> ll(1146620909, var9 ^ -463310658);
            case 218 -> ll(1146620908, var9 ^ 1026362108);
            case 219 -> 5;
            case 220 -> ll(1146620915, var9 ^ 491423556);
            case 221 -> ll(1146620914, var9 ^ 1300718292);
            case 222 -> ll(1146620913, var9 ^ 29627363);
            case 223 -> ll(1146620912, var9 ^ -53928487);
            case 224 -> ll(1146620919, var9 ^ -1741984975);
            case 225 -> 1;
            case 226 -> ll(1146620918, var9 ^ -1481140940);
            case 227 -> ll(1146620917, var9 ^ -1557672207);
            case 228 -> ll(1146620916, var9 ^ 997472352);
            case 229 -> ll(1146620923, var9 ^ 1665759519);
            case 230 -> ll(1146620922, var9 ^ -1649304037);
            case 231 -> ll(1146620921, var9 ^ 47609834);
            case 232 -> ll(1146620920, var9 ^ -1396201971);
            case 233 -> ll(1146620927, var9 ^ 1031127419);
            case 234 -> ll(1146620926, var9 ^ -1526577642);
            case 235 -> ll(1146620925, var9 ^ -21697226);
            case 236 -> ll(1146620924, var9 ^ -1312169474);
            case 237 -> ll(1146620419, var9 ^ 204868932);
            case 238 -> ll(1146620418, var9 ^ -108550861);
            case 239 -> ll(1146620417, var9 ^ 400686654);
            case 240 -> ll(1146620416, var9 ^ 260101378);
            case 241 -> ll(1146620423, var9 ^ 994129);
            case 242 -> ll(1146620422, var9 ^ -1133301499);
            case 243 -> ll(1146620421, var9 ^ -1229982305);
            case 244 -> ll(1146620420, var9 ^ -1800240354);
            case 245 -> ll(1146620427, var9 ^ 1305691885);
            case 246 -> ll(1146620426, var9 ^ -849403982);
            case 247 -> ll(1146620425, var9 ^ -1522003607);
            case 248 -> ll(1146620424, var9 ^ -2101514984);
            case 249 -> ll(1146620431, var9 ^ 847989239);
            case 250 -> ll(1146620430, var9 ^ -1588623883);
            case 251 -> ll(1146620429, var9 ^ 717430050);
            case 252 -> ll(1146620428, var9 ^ -1382479616);
            case 253 -> ll(1146620435, var9 ^ -334016068);
            case 254 -> ll(1146620434, var9 ^ -1902465415);
            default -> ll(1146620433, var9 ^ 935648912);
         };
         int var5 = (var1 & ll(1146620432, var9 ^ 1579324857)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(1146620439, var9 ^ -1025220600)) >>> ll(1146620438, var9 ^ 83195714)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(1146620437, var9 ^ 181709958);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(1146620436, var9 ^ -1215955012);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1690682859;
      short var12 = 5012;
      int var11 = 0;
      int var8 = "E鷏︀䠰뱻伦簸组뷪셎\ue754∟\u19afᆻ\ude12뢚杩퐔驤莗\ue42f얻\u175c\ue8f9\ue163თ\uf4c6ी祋ҵ贓痴鯘␓贊퐬逢꤬굯㜴\ud988\ueb41쯁荛婡\ueb0cᲤ훧ﺉ汣ꉶ၏\u0dff䄬龍\ue2bf嘣킍㦍픛\ue024흿㴔烁㶎굻꒶ꛂ\u1ae2쀐E▜䅈陋\uefbe왔툦\ue1f9ӝ轸믶孅ⅶ獑鷭犲낀왧폇\ue084퓬訬풔栛꣡뙞㸄鷐澏魀\uefd6爅蜼䳝ﾇ\uea96䗿ٖঽ\uf7dc䋏\udc6f\ue461ಘნ㑕뿸ꤩ仯嵰\uec28眸緶낢\uf6e2\ud8a2뼟泭햩秢⫐뙰﵃頱㓚ꁘ\ueaac呙\ued97卼"
         .length();
      String var7 = "E鷏︀䠰뱻伦簸组뷪셎\ue754∟\u19afᆻ\ude12뢚杩퐔驤莗\ue42f얻\u175c\ue8f9\ue163თ\uf4c6ी祋ҵ贓痴鯘␓贊퐬逢꤬굯㜴\ud988\ueb41쯁荛婡\ueb0cᲤ훧ﺉ汣ꉶ၏\u0dff䄬龍\ue2bf嘣킍㦍픛\ue024흿㴔烁㶎굻꒶ꛂ\u1ae2쀐E▜䅈陋\uefbe왔툦\ue1f9ӝ轸믶孅ⅶ獑鷭犲낀왧폇\ue084퓬訬풔栛꣡뙞㸄鷐澏魀\uefd6爅蜼䳝ﾇ\uea96䗿ٖঽ\uf7dc䋏\udc6f\ue461ಘნ㑕뿸ꤩ仯嵰\uec28眸緶낢\uf6e2\ud8a2뼟泭햩秢⫐뙰﵃頱㓚ꁘ\ueaac呙\ued97卼";
      String[] var9 = new String[2];
      int var10 = 0;

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 87;
               case 1 -> 231;
               case 2 -> 112;
               case 3 -> 143;
               case 4 -> 228;
               case 5 -> 117;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIII = var9;
      IIIl = new Object[var9.length];
      int var22 = 0;
      int var10001 = 0;
      lll = new int[309];
      byte[] var10002 = "é\u009d-?ª\u0095[\fsý\u00adÂ?B\u0001×<>Æ\bÓàÖ¼=e\u001f_\u001a\f/É\u009dª´bJõ\u0010óVk\u009eAèr¬ùl£:Õ¿cÄ\u009eº5ß\u0089æißG\u0084\u008aÖå#Ñ]kóN kõLîÿKG5³¿\u001d6\"ûmpnAñ`\u001em\u008de\u0013üEÅAòìÍ\u001b\u008cÌ\u0092gw\u0092\u00111\u001e\bu\u0018lÂóÃ&\bùô\u0085¿\u0013!Øê,ÅÑ\u0012o\u0011P±'\u009em\u0006tòÙÖ\u0091| c\u0019(\u0094ÐPÅj\u0005Æ:+O\u0082~V,íÞ¯4¢UÝqà<rK\u0001]î\u0086\u000ep\t³2zØ\u0096Ê\u0001Ûï\u0099\u0015Oñ£So|\u0092ðaä«\u008bSÊS_¹t;\u009eý\u009eÿ@ÂB¼\u001d\u007f\u0093K~ñ.=`ê¸\u0007\u0083þÞ\b{³%»Æ\u0017\\Ã?\u0084\"l\u008dÎåS~%\u0007\u0014 '·Ï4²Q9ß|¹§\u008bj)õ°\u0090á{\u009e\u001e¬Q¸)2\nTP\u0093ò]\u008a\fÆ\u0094àÅ\u000fzí\u009fnòÙdsv\u0006£à¤@DÉóÕ\u00031K\u009fÍ\u0016Ò}4ã\u0091é\u001fh\u0083^ØõXý\u0092_-I\\Á\r½æ\u008f\u0097\u000e\u0014ÐL\u007f\u0095[\u008bÞ¡\u001fx\r©r\u0018~7(ÑC\u00adß%Ã\u009c,\u0097\u000eÂ®Ä\u00ad5\u008d\u001f\fë7;:s1à¡©ÝùÒ(gf\u009a¦x³\u008búò\fñ\u0095ÎOa\u0016Õ\u001cqV*ø\u009cX\fPh\u001d\u0002H\rÐaa÷xº()\u0017\u001aD]ôä\u008cähä4CDU\u007fK\u001da¯\u0002\u0097T\u001d\u0002\u008eÈ\u0001SM\u0091S ä\u0007&¦\u0099\u0096\u001fU+¤\u000e'G\u0097ü?Oº2oµ^!ý;º[åt¨\u0016\u000e\u00870\u009fëÂ\u008c\u008cÉ\u0011\rYpZ>¶<¡\u0007\u0002'¾\u0096A\u0002\u008cøA¶ÁÌ¿-ÝóñÑ/pX¶aXÖçÄ(\u000582\u009c¿Xª9¯|«{Ñ\u009d\u008f\u0015'Ó\u0004e)Oñ\\YS\r~íd\u009bP\u0004â j%Ûr¬\u008få©\u0080,^®\u0014\u0019º\u0090¶Ä\rùP%¨/Ûe«B\u000f\u007fÙj\u000fÏG2ÌLh\u0007\n®· Õâ;»]ÏcD\bA§\u000e\u0085d#A\u001b\u0013$\u0083£sÍÝìZm^.ø\u0013\u000fC¡GÃ'â\u0095Àð«\u0018t)1\u007f\u0082§|BHáb^Cè³àÚÍ¨§\u001b\f´Ô\\«®Ï\u0013àîI~\u0091\u00ad±w>B¢?P#Ä%\u0084íák´ê«\u0003+§ieeóz\u001dï@=+^\u0084Átz³\u0004\u009c½Ëè\u008c#)\u0013ù\u0013`\u0010>þU\u00ad_\n\u0097ÃÇ\nM6¤\u008b\u0092\u001eæ\u0016\u0087C\u0006èÇdòË¯Ãà6[¾¡&ô-âpÐÇÿØA\\dæ§b\u009a\u009f5í£Õs¦´!£ÿ7ÔFáj«îö\u0015m¤¸hÄf\u009d6Ù£ò¹\u0093\u0006\u0085¾\u0000\u0011ï\u0002P\u0019,ê\u0092\u0014\u001e]Ë?¹(ØrÏ5çoÕHkF\u0084\u0011ºñ=\rÝÎ\u000b\b\u001b\u001aôjµT%¾ó\u009c\u009c+\u008a_<\u0015u,àß\u0092=(RA\u001d¦>º¬ñöcu\u0083\u0015t¢D\u000bðô{\b§ðU\u009et\u0094\u008fr0Û\u0014\u001bt\u0082\u008aÚæÞ»g\u0084\u008cÖ»ÏîâuMêÓc1\f\n,J\u0014*KÆïz\u0086#\u00916ÅRØËÈ\\§¯**\n\u0090¶Ôé\u0094&\u008f \fuy`TH8Äª°ßØ5×6Ç\u009bÆçÊ\nt\u0080'\u0092\u0003\u0007EÉµ¬w\u0086È \u0081;7M7Î\u0086åj à¾\b8\u0081\u0095\u00987\u000ekh\u008brq&\u0081®µò£³Ã´zÒ\u0006Ïú^_R\u0092IP\u007fµ¼,\u0000\u0005\u008a\t\u0002\u0096NÅµ\u001dÂ]Ï\u009a\u0098IkÛ\u0016\u0011Â¹\u009bî#\u0000Å\u009e-i#Õ\u0099õä!/3ô6S=Õì£\u0080\u0084¿\u00980V\u0010\u0095¯÷«Z9L`SRp£Äk\u0087ª\u0011\u009fgþ©\u0007\u0001ÿ\u0090îíuK8$\u0096È\u0097¥m\nG¼¬ô{\u0013cà\u0003¼43\u000e¤_\u009d=Î\u001bæf?á\u001e\u00981<Oùå©Ù{Â|\u000f\u008bB{n¶\u0007,ÿ\u0003%·Cºc%yÕ3eF\u008dRâ\u0084\u001b±G9n\u000e>å\u0002¯(\u0092\u0003Ãº4"
         .getBytes("ISO-8859-1");

      int var55;
      do {
         lll[var22] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -976891809;
         var22 += 1;
         var55 = var10001 + 4;
         var10001 += 4;
      } while (var55 < var10002.length);

      String[] var5 = new String[ll(1146620676, var17 ^ -11259503)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III('\uf785', -520301763, (short)-24355, (char)'阿', 2121, -1850086421, (short)32247)).length();
      int var1 = ll(1146620683, var17 ^ 2029169197);
      int var19 = -1;

      label103:
      while (true) {
         var22 = ll(1146620682, var17 ^ -1347612864);
         String var27 = var2.substring(++var19, var19 + var1);
         byte var39 = -1;

         while (true) {
            label98: {
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
                     break label98;
                  }

                  var81 = var57;
                  var69 = var22;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % ll(1146620686, var17 ^ 1513872067)) {
                     case 0 -> ll(1146620685, var17 ^ 1601028155);
                     case 1 -> ll(1146620684, var17 ^ 53592277);
                     case 2 -> ll(1146620691, var17 ^ 1641203881);
                     case 3 -> ll(1146620690, var17 ^ -964082993);
                     case 4 -> ll(1146620689, var17 ^ 370556891);
                     case 5 -> ll(1146620688, var17 ^ 269807879);
                     default -> ll(1146620695, var17 ^ -1373688852);
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
                     lI = new String[ll(1146620687, var17 ^ -1980029818)];
                     Ill = new String[ll(1146620694, var17 ^ 1514481768)];
                     II();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var62;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label103;
                  }

                  var4 = (var2 = III('㽲', -647851706, 30646, (char)'舼', (char)'\uefad', -1850086422, (short)-12592)).length();
                  var1 = ll(1146620681, var17 ^ -1288470052);
                  var19 = -1;
            }

            var22 = ll(1146620680, var17 ^ 220902257);
            var27 = var2.substring(++var19, var19 + var1);
            var39 = 0;
         }
      }
   }

   @Override
   public void llIl() {
      this.II.clear();
      this.III = false;
      this.Il = 0.0;
   }

   @Override
   public void IlIII() {
      this.II.clear();
      class_310 var1 = class_310.method_1551();
      class_746 var2 = var1 == null ? null : var1.field_1724;
      this.III = var2 != null && var2.method_24828();
      this.Il = var2 == null ? 0.0 : var2.method_5829().field_1322;
   }

   private static String III(char var0, int var1, short var2, char var3, char var4, int var5, short var6) {
      int var11 = var5 ^ -1850086421;
      char[] var10 = IIII[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])IIIl[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         IIIl[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 44817;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ '\ue13d' ^ switch (var9 % 28) {
            default -> 198;
            case 1 -> 199;
            case 2 -> 1;
            case 3 -> 232;
            case 4 -> 186;
            case 5 -> 105;
            case 6 -> 68;
            case 7 -> 118;
            case 8 -> 9;
            case 9 -> 34;
            case 10 -> 154;
            case 11 -> 33;
            case 12 -> 216;
            case 13 -> 42;
            case 14 -> 241;
            case 15 -> 96;
            case 16 -> 100;
            case 17 -> 135;
            case 18 -> 211;
            case 19 -> 97;
            case 20 -> 80;
            case 21 -> 234;
            case 22 -> 54;
            case 23 -> 191;
            case 24 -> 254;
            case 25 -> 196;
            case 26 -> 43;
            case 27 -> 121;
         } ^ var9 ^ var6 ^ var2 ^ var5 ^ var1 ^ var4 ^ var0 ^ var8 ^ var3);
      }

      return new String(var10).intern();
   }

   private static void II() {
      int var0 = 745931329;
      Ill[0] = lI(l(ll(1146620443, var0 ^ 1648513841), ll(1146620442, var0 ^ 35405507)).toCharArray(), 41877L, ll(1146620441, var0 ^ -320882313));
      Ill[1] = lI(l(ll(1146620440, var0 ^ 6611040), ll(1146620447, var0 ^ 966000477)).toCharArray(), 11373L, ll(1146620446, var0 ^ -1787394106));
      Ill[2] = lI(l(ll(1146620445, var0 ^ 1427487792), ll(1146620444, var0 ^ 1124507635)).toCharArray(), 94975L, ll(1146620451, var0 ^ 240068856));
      Ill[3] = lI(l(ll(1146620450, var0 ^ -978243949), ll(1146620449, var0 ^ 363367168)).toCharArray(), 89123L, ll(1146620448, var0 ^ -1142534724));
      Ill[4] = lI(l(ll(1146620455, var0 ^ 1369995181), ll(1146620454, var0 ^ 1555064795)).toCharArray(), 3464L, ll(1146620453, var0 ^ 1915793860));
      Ill[5] = lI(l(ll(1146620452, var0 ^ 875274882), ll(1146620459, var0 ^ 903518520)).toCharArray(), 53546L, ll(1146620458, var0 ^ -1908159261));
      Ill[ll(1146620457, var0 ^ -701913890)] = lI(
         l(ll(1146620456, var0 ^ -648660744), ll(1146620463, var0 ^ -468514734)).toCharArray(), 19369L, ll(1146620462, var0 ^ -1967541107)
      );
      Ill[ll(1146620461, var0 ^ 394853805)] = lI(
         l(ll(1146620460, var0 ^ -2027477296), ll(1146620467, var0 ^ -549008505)).toCharArray(), 78919L, ll(1146620466, var0 ^ 455008315)
      );
   }

   private void Il(long var1) {
      double var4 = Math.max(1.0, this.llI.IllI());
      String[] var10000 = IIllllIl.IIIIl();
      Iterator var6 = this.II.iterator();
      String[] var3 = var10000;

      while (var6.hasNext()) {
         if (var1 - ((llIIIll)var6.next()).l() > var4) {
            var6.remove();
            if (var3 != null) {
               break;
            }
         }
      }
   }

   private static String lI(char[] var0, long var1, int var3) {
      int var4 = ll(1146620465, 1763291897 ^ -1842661765) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(1146620464, 1763291897 ^ -366263845);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public void IlI(lIIlIl var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (IlIII.IIIIII(var1)) {
         long var3 = System.currentTimeMillis();
         this.Il(var3);
         if (!this.II.isEmpty()) {
            Color var5 = this.I();
            double var6 = Math.max(1.0, this.llI.IllI());
            double var8 = this.lIl.IllI();
            double var10 = this.I.IllI();
            float var12 = this.ll.IllI().floatValue();

            for (llIIIll var14 : this.II) {
               double var15 = class_3532.method_15350((var3 - var14.l()) / var6, 0.0, 1.0);
               double var17 = 1.0 - Math.pow(1.0 - var15, 3.0);
               double var19 = var8 * (0.28 + var17 * 0.72);
               double var21 = var10 * Math.pow(1.0 - var15, 1.35);
               float var23 = Math.max(0.5F, (float)(var12 * (1.0 - var15 * 0.3)));
               IlIII.IIlIlI(var1, var14.I(), var19, ll(1146620471, -1571875851 ^ 538014441), var5, var21, var23);
               if (var2 != null) {
                  break;
               }
            }
         }
      }
   }
}
