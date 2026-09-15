package k74.x;

import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class llIlIllI extends IlIIIIIIl {
   private int II;
   private String Il;
   private final IlIIl lI;
   private static final int[] IIll;
   private static final Object[] IlIl;
   private long ll;
   private int III;
   private static final String[] IIl;
   private static String[] I;
   private final IIlIII IlI;
   private static final String[] IlII;
   private final IllIlIl Ill;
   private class_1309 lII;
   private static final long lIl = 10000L;
   private long llI;
   private static final String[] lll;
   private final Random IIII;
   private int IIIl;
   private final IllIII<lllllII> IIlI;

   private static int ll(int var0, int var1) {
      int var2 = IIll[var0 ^ 409359851] ^ var1 ^ var0;
      var2 -= 55165;
      var2 ^= 55925;
      var2 -= 39258;
      var2 ^= 52001;
      var2 -= 47215;
      return var2 - 62007;
   }

   public llIlIllI(IlIIl var1) {
      super(IlIIllIII.Ill(I[2]), lllIIlIl.IlI, IlIIllIII.Ill(I[1]));
      this.Ill = this.IllIIll(
         new IllIlIl(IlIIllIII.Ill(I[ll(409359851, -1770659711 ^ -1776950865)]), IlIIIlIII.I(IlIIllIII.lI(I[3]), IlIIllIII.lI(I[0])), IlIIllIII.lI(I[0]))
      );
      this.IlI = this.IllIIll(new IIlIII(IlIIllIII.Ill(I[5]), 500.0, 0.0, 5000.0, 50.0).IlII(IlIIllIII.lI(I[4])));
      this.IIlI = this.IllIIll(new IllIII<>(IlIIllIII.Ill(I[ll(409359850, -1770659711 ^ 1760170368)]), lllllII.class, lllllII.Il));
      this.IIII = new Random();
      this.Il = null;
      this.ll = 0L;
      this.III = ll(409359849, -1770659711 ^ -174212693);
      this.II = ll(409359848, -1770659711 ^ 1096219992);
      this.llI = 0L;
      this.IIIl = 0;
      this.lI = var1;
   }

   @Override
   public void IIlIl() {
      String[] var1 = IIllllIl.IIIIl();
      if (this.IIIIlIl()) {
         class_310 var2 = class_310.method_1551();
         if (var2.field_1724 != null && var2.method_1562() != null) {
            long var3 = System.currentTimeMillis();
            if (this.Il != null && var3 >= this.ll) {
               this.Il(var2, this.Il);
               this.Il = null;
               this.ll = 0L;
               this.III = ll(409359855, 620192930 ^ -1108737118);
            }

            class_1309 var5 = this.lI.lIII();
            if (var5 != null) {
               this.lII = var5;
               if (var1 == null) {
                  return;
               }
            }

            if (this.lII != null) {
               if ((!this.lII.method_5805() || this.lII.method_31481()) && var2.field_1724.method_5739(this.lII) < 20.0F) {
                  this.II(this.lII);
               }

               this.lII = null;
            }
         }
      }
   }

   private static String III(int var0, int var1) {
      int var3 = var0 ^ -1821678953;
      char[] var4 = IlII[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IlIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IlIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1892022884;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 20;
            case 1 -> 192;
            case 2 -> 148;
            case 3 -> 69;
            case 4 -> 47;
            case 5 -> 153;
            case 6 -> 139;
            case 7 -> 130;
            case 8 -> 240;
            case 9 -> 142;
            case 10 -> 217;
            case 11 -> 99;
            case 12 -> 204;
            case 13 -> 138;
            case 14 -> 60;
            case 15 -> 47;
            case 16 -> 188;
            case 17 -> 125;
            case 18 -> 243;
            case 19 -> 158;
            case 20 -> 181;
            case 21 -> 223;
            case 22 -> 237;
            case 23 -> 158;
            case 24 -> 245;
            case 25 -> 89;
            case 26 -> 64;
            case 27 -> 153;
            case 28 -> 164;
            case 29 -> 54;
            case 30 -> 48;
            case 31 -> 23;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static void I() {
      int var0 = 280528483;
      I[0] = lI(l(ll(409359871, var0 ^ 1715780277), ll(409359870, var0 ^ 735158058)).toCharArray(), 16570L, ll(409359869, var0 ^ 1743741925));
      I[1] = lI(l(ll(409359868, var0 ^ -1553995231), ll(409359859, var0 ^ 2033790691)).toCharArray(), 50977L, ll(409359858, var0 ^ -99691893));
      I[2] = lI(l(ll(409359857, var0 ^ 1832915986), ll(409359856, var0 ^ 1000926486)).toCharArray(), 91546L, ll(409359863, var0 ^ 1187875945));
      I[3] = lI(l(ll(409359862, var0 ^ 1766873636), ll(409359861, var0 ^ -1385562261)).toCharArray(), 63480L, ll(409359860, var0 ^ -1355465225));
      I[4] = lI(l(ll(409359819, var0 ^ 1114411637), ll(409359818, var0 ^ -1222628960)).toCharArray(), 71680L, ll(409359817, var0 ^ 1514710138));
      I[5] = lI(l(ll(409359816, var0 ^ 2068891787), ll(409359823, var0 ^ -2008367224)).toCharArray(), 1145L, ll(409359822, var0 ^ -633455384));
      I[ll(409359821, var0 ^ 235609550)] = lI(
         l(ll(409359820, var0 ^ 514987617), ll(409359811, var0 ^ -1540996476)).toCharArray(), 65068L, ll(409359810, var0 ^ 335135901)
      );
      I[ll(409359809, var0 ^ -1911219497)] = lI(
         l(ll(409359808, var0 ^ -167444685), ll(409359815, var0 ^ 464501464)).toCharArray(), 39333L, ll(409359814, var0 ^ -1641279902)
      );
   }

   private static String l(int var0, int var1) {
      int var9 = 625682972;
      int var2 = (var0 ^ ll(409359813, var9 ^ 1187068710)) & ll(409359812, var9 ^ -1647094869);
      if (IIl[var2] == null) {
         char[] var3 = lll[var2].toCharArray();

         int var4 = switch (var3[0] & ll(409359835, var9 ^ 1829882893)) {
            case 0 -> ll(409359834, var9 ^ -1252662310);
            case 1 -> ll(409359833, var9 ^ -319938601);
            case 2 -> ll(409359832, var9 ^ 2052240862);
            case 3 -> ll(409359839, var9 ^ -1074464276);
            case 4 -> ll(409359838, var9 ^ 1957405141);
            case 5 -> ll(409359837, var9 ^ -251176230);
            case 6 -> ll(409359836, var9 ^ -2141518459);
            case 7 -> ll(409359827, var9 ^ 354124099);
            case 8 -> ll(409359826, var9 ^ -1848317585);
            case 9 -> ll(409359825, var9 ^ -408213030);
            case 10 -> ll(409359824, var9 ^ 780049209);
            case 11 -> ll(409359831, var9 ^ 843998157);
            case 12 -> ll(409359830, var9 ^ 632658804);
            case 13 -> ll(409359829, var9 ^ -1896421399);
            case 14 -> ll(409359828, var9 ^ 1784441254);
            case 15 -> ll(409359787, var9 ^ -1331100915);
            case 16 -> ll(409359786, var9 ^ -640971923);
            case 17 -> ll(409359785, var9 ^ -1284923854);
            case 18 -> ll(409359784, var9 ^ -1280201366);
            case 19 -> ll(409359791, var9 ^ 1906958048);
            case 20 -> ll(409359790, var9 ^ 923853917);
            case 21 -> ll(409359789, var9 ^ -1184551870);
            case 22 -> ll(409359788, var9 ^ 637028250);
            case 23 -> ll(409359779, var9 ^ -1435502337);
            case 24 -> ll(409359778, var9 ^ 1761291213);
            case 25 -> ll(409359777, var9 ^ 118844278);
            case 26 -> ll(409359776, var9 ^ 641411900);
            case 27 -> ll(409359783, var9 ^ -1742034867);
            case 28 -> ll(409359782, var9 ^ 1941777874);
            case 29 -> ll(409359781, var9 ^ 864993215);
            case 30 -> ll(409359780, var9 ^ -1302632436);
            case 31 -> ll(409359803, var9 ^ -1253954404);
            case 32 -> ll(409359802, var9 ^ -482282081);
            case 33 -> ll(409359801, var9 ^ 1799761340);
            case 34 -> ll(409359800, var9 ^ -1600502244);
            case 35 -> ll(409359807, var9 ^ 1241131836);
            case 36 -> ll(409359806, var9 ^ -931169871);
            case 37 -> ll(409359805, var9 ^ 2002289163);
            case 38 -> ll(409359804, var9 ^ 523457874);
            case 39 -> ll(409359795, var9 ^ -1595197222);
            case 40 -> ll(409359794, var9 ^ 1241768619);
            case 41 -> ll(409359793, var9 ^ 2054509861);
            case 42 -> ll(409359792, var9 ^ 895840050);
            case 43 -> ll(409359799, var9 ^ -750155338);
            case 44 -> ll(409359798, var9 ^ 1106034352);
            case 45 -> ll(409359797, var9 ^ 1618646647);
            case 46 -> ll(409359796, var9 ^ 744259180);
            case 47 -> ll(409359755, var9 ^ 773216209);
            case 48 -> ll(409359754, var9 ^ -553847091);
            case 49 -> ll(409359753, var9 ^ -343190729);
            case 50 -> ll(409359752, var9 ^ -249097677);
            case 51 -> ll(409359759, var9 ^ 356225983);
            case 52 -> ll(409359758, var9 ^ 1394132992);
            case 53 -> ll(409359757, var9 ^ -1263915374);
            case 54 -> ll(409359756, var9 ^ 213727563);
            case 55 -> ll(409359747, var9 ^ -2003352704);
            case 56 -> ll(409359746, var9 ^ 58836351);
            case 57 -> ll(409359745, var9 ^ -505789230);
            case 58 -> ll(409359744, var9 ^ -1533627982);
            case 59 -> ll(409359751, var9 ^ -1645782121);
            case 60 -> ll(409359750, var9 ^ 2115210781);
            case 61 -> ll(409359749, var9 ^ -2136819990);
            case 62 -> ll(409359748, var9 ^ -527974042);
            case 63 -> ll(409359771, var9 ^ 1046289961);
            case 64 -> ll(409359770, var9 ^ 2026155136);
            case 65 -> ll(409359769, var9 ^ -136137631);
            case 66 -> ll(409359768, var9 ^ 1085661086);
            case 67 -> ll(409359775, var9 ^ 1103028773);
            case 68 -> ll(409359774, var9 ^ -1015167142);
            case 69 -> ll(409359773, var9 ^ 830894368);
            case 70 -> ll(409359772, var9 ^ 815812072);
            case 71 -> ll(409359763, var9 ^ -423696710);
            case 72 -> ll(409359762, var9 ^ 496216082);
            case 73 -> ll(409359761, var9 ^ -11644271);
            case 74 -> ll(409359760, var9 ^ -1062127287);
            case 75 -> ll(409359767, var9 ^ -1321604288);
            case 76 -> ll(409359766, var9 ^ -65793129);
            case 77 -> ll(409359765, var9 ^ -923403420);
            case 78 -> ll(409359764, var9 ^ -996289200);
            case 79 -> ll(409359723, var9 ^ 650582859);
            case 80 -> ll(409359722, var9 ^ 1276899943);
            case 81 -> ll(409359721, var9 ^ -2093548999);
            case 82 -> ll(409359720, var9 ^ -2138700821);
            case 83 -> ll(409359727, var9 ^ -370270575);
            case 84 -> ll(409359726, var9 ^ -886162445);
            case 85 -> ll(409359725, var9 ^ 1260174208);
            case 86 -> ll(409359724, var9 ^ -788096136);
            case 87 -> ll(409359715, var9 ^ -1847315357);
            case 88 -> ll(409359714, var9 ^ -2146918599);
            case 89 -> ll(409359713, var9 ^ 992558234);
            case 90 -> ll(409359712, var9 ^ -1879388281);
            case 91 -> ll(409359719, var9 ^ 380506154);
            case 92 -> ll(409359718, var9 ^ 1049813388);
            case 93 -> ll(409359717, var9 ^ -127715201);
            case 94 -> ll(409359716, var9 ^ -578654597);
            case 95 -> ll(409359739, var9 ^ 570321093);
            case 96 -> ll(409359738, var9 ^ 1840021329);
            case 97 -> ll(409359737, var9 ^ 1269144484);
            case 98 -> ll(409359736, var9 ^ 1363915448);
            case 99 -> ll(409359743, var9 ^ 1333758975);
            case 100 -> ll(409359742, var9 ^ -847607095);
            case 101 -> ll(409359741, var9 ^ -132999115);
            case 102 -> ll(409359740, var9 ^ 874595441);
            case 103 -> ll(409359731, var9 ^ -992986656);
            case 104 -> ll(409359730, var9 ^ -9796596);
            case 105 -> ll(409359729, var9 ^ 1383308298);
            case 106 -> ll(409359728, var9 ^ -1925700508);
            case 107 -> ll(409359735, var9 ^ 19321150);
            case 108 -> ll(409359734, var9 ^ 933796959);
            case 109 -> ll(409359733, var9 ^ -1659364351);
            case 110 -> ll(409359732, var9 ^ -1470269089);
            case 111 -> ll(409359691, var9 ^ -1840496352);
            case 112 -> ll(409359690, var9 ^ -1584144728);
            case 113 -> ll(409359689, var9 ^ -1763706921);
            case 114 -> ll(409359688, var9 ^ 1487010457);
            case 115 -> ll(409359695, var9 ^ 1664406300);
            case 116 -> ll(409359694, var9 ^ 1158237212);
            case 117 -> ll(409359693, var9 ^ -1399716022);
            case 118 -> ll(409359692, var9 ^ 728467470);
            case 119 -> ll(409359683, var9 ^ -307694100);
            case 120 -> ll(409359682, var9 ^ -1575843862);
            case 121 -> ll(409359681, var9 ^ 1510244347);
            case 122 -> ll(409359680, var9 ^ -183552900);
            case 123 -> ll(409359687, var9 ^ 685278045);
            case 124 -> ll(409359686, var9 ^ -1918524706);
            case 125 -> ll(409359685, var9 ^ 2145764358);
            case 126 -> ll(409359684, var9 ^ -1807088066);
            case 127 -> ll(409359707, var9 ^ -238084571);
            case 128 -> ll(409359706, var9 ^ -87372431);
            case 129 -> 2;
            case 130 -> ll(409359705, var9 ^ 1479040790);
            case 131 -> ll(409359704, var9 ^ -1827516576);
            case 132 -> ll(409359711, var9 ^ 1782207095);
            case 133 -> ll(409359710, var9 ^ -1400073276);
            case 134 -> ll(409359709, var9 ^ -1016927429);
            case 135 -> ll(409359708, var9 ^ 1982803122);
            case 136 -> ll(409359699, var9 ^ 754326652);
            case 137 -> ll(409359698, var9 ^ 62971175);
            case 138 -> ll(409359697, var9 ^ 1839338957);
            case 139 -> ll(409359696, var9 ^ 1484985912);
            case 140 -> ll(409359703, var9 ^ -722464488);
            case 141 -> ll(409359702, var9 ^ -1660943523);
            case 142 -> ll(409359701, var9 ^ -979882016);
            case 143 -> ll(409359700, var9 ^ 1207005103);
            case 144 -> ll(409359659, var9 ^ -1342005992);
            case 145 -> ll(409359658, var9 ^ -611161109);
            case 146 -> ll(409359657, var9 ^ -247386342);
            case 147 -> ll(409359656, var9 ^ 1231981748);
            case 148 -> ll(409359663, var9 ^ 2110485536);
            case 149 -> ll(409359662, var9 ^ -2134353828);
            case 150 -> ll(409359661, var9 ^ -1103623233);
            case 151 -> ll(409359660, var9 ^ -176588228);
            case 152 -> ll(409359651, var9 ^ -1672352449);
            case 153 -> ll(409359650, var9 ^ 291519791);
            case 154 -> ll(409359649, var9 ^ 35128913);
            case 155 -> ll(409359648, var9 ^ 342565984);
            case 156 -> ll(409359655, var9 ^ -1239153132);
            case 157 -> ll(409359654, var9 ^ -551110917);
            case 158 -> ll(409359653, var9 ^ 905257982);
            case 159 -> ll(409359652, var9 ^ 1053590013);
            case 160 -> ll(409359675, var9 ^ -202063182);
            case 161 -> ll(409359674, var9 ^ 1571749907);
            case 162 -> ll(409359673, var9 ^ 680440931);
            case 163 -> ll(409359672, var9 ^ 206511727);
            case 164 -> ll(409359679, var9 ^ -1280227358);
            case 165 -> ll(409359678, var9 ^ -1489830717);
            case 166 -> ll(409359677, var9 ^ -2097765037);
            case 167 -> ll(409359676, var9 ^ -1693256861);
            case 168 -> ll(409359667, var9 ^ 2035513009);
            case 169 -> 3;
            case 170 -> ll(409359666, var9 ^ -327937101);
            case 171 -> ll(409359665, var9 ^ -155505600);
            case 172 -> ll(409359664, var9 ^ 475395780);
            case 173 -> ll(409359671, var9 ^ 1597645998);
            case 174 -> ll(409359670, var9 ^ 852715657);
            case 175 -> ll(409359669, var9 ^ -523950103);
            case 176 -> ll(409359668, var9 ^ 1914279765);
            case 177 -> ll(409359627, var9 ^ -225966694);
            case 178 -> ll(409359626, var9 ^ 1550326100);
            case 179 -> ll(409359625, var9 ^ -1129795476);
            case 180 -> ll(409359624, var9 ^ 288900298);
            case 181 -> ll(409359631, var9 ^ -191514719);
            case 182 -> ll(409359630, var9 ^ 287232309);
            case 183 -> ll(409359629, var9 ^ 1387399936);
            case 184 -> 4;
            case 185 -> ll(409359628, var9 ^ 526459878);
            case 186 -> ll(409359619, var9 ^ 1672809382);
            case 187 -> ll(409359618, var9 ^ -833140245);
            case 188 -> ll(409359617, var9 ^ -1617885888);
            case 189 -> ll(409359616, var9 ^ 865330713);
            case 190 -> ll(409359623, var9 ^ 379702070);
            case 191 -> ll(409359622, var9 ^ 1685808527);
            case 192 -> 1;
            case 193 -> ll(409359621, var9 ^ 1256506358);
            case 194 -> ll(409359620, var9 ^ -2095431595);
            case 195 -> ll(409359643, var9 ^ -1568342593);
            case 196 -> ll(409359642, var9 ^ -429234421);
            case 197 -> ll(409359641, var9 ^ 1457775732);
            case 198 -> ll(409359640, var9 ^ 1372034168);
            case 199 -> ll(409359647, var9 ^ -2003494418);
            case 200 -> 0;
            case 201 -> ll(409359646, var9 ^ 2113778173);
            case 202 -> 5;
            case 203 -> ll(409359645, var9 ^ -443120880);
            case 204 -> ll(409359644, var9 ^ 1864267665);
            case 205 -> ll(409359635, var9 ^ 498787697);
            case 206 -> ll(409359634, var9 ^ -1535058467);
            case 207 -> ll(409359633, var9 ^ -965101699);
            case 208 -> ll(409359632, var9 ^ -337091660);
            case 209 -> ll(409359639, var9 ^ -2043871793);
            case 210 -> ll(409359638, var9 ^ -1604277245);
            case 211 -> ll(409359637, var9 ^ 289536861);
            case 212 -> ll(409359636, var9 ^ -147610621);
            case 213 -> ll(409359595, var9 ^ -1543837776);
            case 214 -> ll(409359594, var9 ^ 1219089177);
            case 215 -> ll(409359593, var9 ^ 365391959);
            case 216 -> ll(409359592, var9 ^ -42668389);
            case 217 -> ll(409359599, var9 ^ 1932707074);
            case 218 -> ll(409359598, var9 ^ 1063841419);
            case 219 -> ll(409359597, var9 ^ 1636586840);
            case 220 -> ll(409359596, var9 ^ -1615436580);
            case 221 -> ll(409359587, var9 ^ 534551301);
            case 222 -> ll(409359586, var9 ^ -1829253962);
            case 223 -> ll(409359585, var9 ^ -458887958);
            case 224 -> ll(409359584, var9 ^ 542199527);
            case 225 -> ll(409359591, var9 ^ 35770488);
            case 226 -> ll(409359590, var9 ^ 1591308117);
            case 227 -> ll(409359589, var9 ^ 919197470);
            case 228 -> ll(409359588, var9 ^ -525192992);
            case 229 -> ll(409359611, var9 ^ -1955799082);
            case 230 -> ll(409359610, var9 ^ 1994320188);
            case 231 -> ll(409359609, var9 ^ 1417320331);
            case 232 -> ll(409359608, var9 ^ 1245294972);
            case 233 -> ll(409359615, var9 ^ -1791463585);
            case 234 -> ll(409359614, var9 ^ -1525192031);
            case 235 -> ll(409359613, var9 ^ -1768902551);
            case 236 -> ll(409359612, var9 ^ 567492889);
            case 237 -> ll(409359603, var9 ^ 1371249179);
            case 238 -> ll(409359602, var9 ^ -623447307);
            case 239 -> ll(409359601, var9 ^ 2014754209);
            case 240 -> ll(409359600, var9 ^ -1366797192);
            case 241 -> ll(409359607, var9 ^ 1494644014);
            case 242 -> ll(409359606, var9 ^ 553268245);
            case 243 -> ll(409359605, var9 ^ 328414683);
            case 244 -> ll(409359604, var9 ^ 1974123948);
            case 245 -> ll(409359563, var9 ^ -1713075548);
            case 246 -> ll(409359562, var9 ^ -840073225);
            case 247 -> ll(409359561, var9 ^ 1343572030);
            case 248 -> ll(409359560, var9 ^ 675688455);
            case 249 -> ll(409359567, var9 ^ -896552920);
            case 250 -> ll(409359566, var9 ^ -1230881550);
            case 251 -> ll(409359565, var9 ^ 1107300950);
            case 252 -> ll(409359564, var9 ^ -895246812);
            case 253 -> ll(409359555, var9 ^ 2091531470);
            case 254 -> ll(409359554, var9 ^ 430321064);
            default -> ll(409359553, var9 ^ -306622102);
         };
         int var5 = (var1 & ll(409359552, var9 ^ -121557361)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(409359559, var9 ^ 88625934)) >>> ll(409359558, var9 ^ -1632828484)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(409359557, var9 ^ 1015415907);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(409359556, var9 ^ -841494217);
            }
         }

         IIl[var2] = new String(var3).intern();
      }

      return IIl[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -163803549;
      char[] var9 = "㋗㉧".toCharArray();
      String var8 = "ᴔᡓ蔨ἷ겋캙憊™둬ⴅ劢\ue435䫋㜍\ue1b3\uddfc씛鐗\u206d\ue1a2ꣿ⬗\u09b3ƥ퇾崂죐ܒ漍唦곉䮨⪴ો\udda3뗳헖മ鼅\uf464죽ꐻ゛笎훫翏妡빉娏䣂\uf1d5碒躿㪟칬㈺ị一곧㆒팵낐嶔탶\ua87fতꙑー荸俹\uec65溨\ue086䉨✉ễ슂噥ꡇ\ud916怡ླ\ud8cd埂㴥\uf601땴Ꭵ輊꒫\ud8f6쭁砍恭栟ặ棷䲖⟩ᴺ평缠蔺\ue7ed吣\ufbc4鍉͵䱑能㕳訫뼠얂돊儻싣펬\udff5⯼郱堜┭㷔㗒ᛂ\ue7d8諱\uf6eaᏉ糮ᔛ埏䜒цΌ瑃ẫ鍍諌吐櫄␌謭웖\ued34ẙ鲣腚⻣燻Ọ怇⺇왂\ue6e7Ỻ鍋倭뜯㦆⒥㕆改嗒\udc4eꊄ罫ꄲƆ罸ᵋ䦿稟捍ꘙꌾⴸ⧶ᅽ\ue5edᗀ퐼「ᓦ\ueac8";
      short var7 = 12914;
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            IlII = var10;
            IlIl = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            IIll = new int[310];
            byte[] var10002 = " \u009fð\u008aÞ`\u0000»Ã\u0017¨\u008dwÜì\u007f9â\u0096¡\u0082\\G\"\u0016P\u009d¾|ñpß\r\u0094\u0005\u000fo_Ð\u001c¿\u0005[äR\u001cÞ\u000b\u000e+ÐÀ¶\u001b\u0081$×\u001aî\u001a5ö\u0016äGÖÆäS¯\u0087%äùÌWö\u008a«\u0010V\u0001\u0011o\u001b\u00944d\u0087OÓé\u0093\u001aA÷I|Ô\u009d¸õ\u009cÐ]\u0005¿Å\u000bï\u009b\u001e;p¬^Y\u0015ñû\u009d,\u000f\u0097¼\u0000\u0081\u0084r)9\u009a\u0087b,¹x¹ó»K\u0015cd¸\u000f\u0013ÔJ\u009eÂª>Lj0.÷½\u0086\u0094dH\u0088 6\u008aÜ¾Rm:ÆATÓ+ê\u0018¿ \r\u0087\u0003Cw<µ\u0098d\u0088\u0004h¥\u0014½°á8\u0091éZÇf\u007fæa¹º@!Cq\u001fz\u008dô³\u00823\u0085ïÜ\u0095\u0010¯Y¿\u0094`=\u0014â\u001fña+ÊCÄ7ú·½ \u0001@R\u008bB>öoè°±µ\u001dÛ\u008fÜ\u007fR(¶ÝFé¶\u0005u»t\u001d\u0005Ù2¤=2¼Ñ÷¦ L\u009f'¯Û,çmOóp\u0002¡°R#\u008fðv\u009d\u009ep\u008ev\tõj6:g\u0007·ï³é°öõóæô.®nòõd¥.\u009e LNó¤ÍË¢\u0083rìZÐ\u001a\u0087\u008ew¥_àIO·;'\u007fÁ\u008dó0Ñ·àÖýRõDXfzeÎNË)è§\u0007+¢\u008fJÛH/\u0089î?\u0088=ô\u0093Ê¡\u0010\u008fKYV¬\u001c8±\u001eõ´\t\táÓ\u008d#\u009aÊ\u00065\u001c\u0018än\u009cH¡\"i\b\u0098S\u0080D{§WI\u0085\u0016o¼å3\u0019Ç;éÊ\u0010}pwOòVl\u0095E\u0001\u0007CD\n9AÆÉ\u001fÊ42©û5\u0014\u0095Zã\n>&\u0018'qMúú\u0089VÅ\u0005á¢´\u008d0\u007fù È\u008fÍA \u0000Á)\u000eL#sÏ\u008aI¯)Ñ\u0086\u0082\"Q\u00852×?ìZÅ\u001dÎ\u009aï'N¨`\u0018Ô²C6\u0094Pà®\u0085¼D\u0011>\u009dço\u008aN\u0014\u0010\u0013\u001aÈ\u0005;&:\u0015ý×ãäØ6µL$J¼\u001fh\u0018¤³N\u0011CÊTÿk\u0002JËP\u0017ÈÎSpý¦Cì1\u0095\u009c\u0018ÁdáâúÞ_\u0093WÇG\u0088\u0088\u008cü!\u0004\u0092\nì2\u001cD+\u0098¬Å¬\u00adé\u00ad\u0087\u0097ø\u0099x¤'\n[\u0093k,w]\u0015\"×f\u0080\n\u0085@½\u0094Y©&ßi.ßP\u0006è\u001c!\u001c§¦_ã_°¤ýð»ïe-lZË\u0088\u0011{XzQ\u001c|\u0091þÞQô{Ç§ÿ~\u0016Å]\u009c\u0086\u008a\u0096¦\u0094§o\u008e\u0089ö©8KçÆÖ0&s\u009b÷\u0014)BÇ¨\u0006t\tÄh\u0016Î\u0006]7ÍûÑDÉO\u0098´ÛWÀ,ô4BE»Oµ¶EVÞ&°<ôõ÷>LÚX)x\u007f¯\u0085\u0085|\u0083â»\u008cÐ\u0012ðÍ¡\u008b\u0099å4Ô\u0014Ôæí\u0007¬ÒÂ\u0011ßÿÕ³\u0090ß×Ú\u0092mO0Aû»;xZ]ö@\u0019pX\u001bØ#-:o\u0016\tûÆ4¶\u0005\u009c1¢\u0086$Æ\u0087B}B\u009e¦+F|ç®ßéÀË¢ó\u000fõª\u0019á.\u0082Z\u008eÿÛ7g°\u0087åqó|w\u00adCÂ÷<ÝäYÜÂ\u0083¹\u001ck>\u0014\u008c\u009cãñ!l\\\u0014ª\t\u001fW\u0006Ð\u0080\u001aÕûÌf\u0001Ó\u00adËã\u0091\u009a\u009a%Ñù6'2©\u0013\u0015\u0013~aÏ½ñOP\u001b\u008c\u0086®\u0094ì§0)\u001aãÞ¾ÕSW=\u0085TsO#\u008d!Â\u0007xIh9à\"[bjª¯¥\u0018\u000e>ë¡4\u0005øÃÍooî\\ºO\u0083\u0098$\u001e¥Ôx¸\u0014õ#qò\u0087\u007fï¦N>7M\u001d\n\u0098\u0010s©ÊøÀ7\u0004v\u0086\u001c\u0097:Ü7\u001bd8\u008c£\u009a\u0002¾o\u001ahBÕ\u0097C\u0014há\u00115:%å\u00977\u0007\u0095\t\u0083[m¶\u00813}\r£å\u0006å³\u008eØ\u0005Ïsj1\u0016QÎBîO\u008dh®\u0090\u008c·o £³G\u0093$h©$g\u0098àT\u000f@jßb(¨}¢o¬«<\u008d\u008f\\¢ G%Nî\u0002\u0016'ìpp\u001ee\u0093\u009cP_òÈY¥²U¡\u0090\u0011-òêiÏ;h0³\u0016æÛG´Ë\u0097Ï\u0017D²y\u001eäØ\u001c\u0012ô\\è\r\u0088¹ýu÷$\u0000ÿ\u0089¢\u009b\u0019Ù 92ÝÍÈc\b\u0098\u0097Ï.6°jSq\u0099\u0003ÿRC\u0083Ðý\u0018Ò,\u0007!I\fº"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               IIll[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 949509215;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var5 = new String[ll(409359854, var18 ^ 1419720937)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = III(-1821678953, var18 ^ 1521396954)).length();
            int var1 = ll(409359853, var18 ^ -1064049978);
            int var20 = -1;

            label104:
            while (true) {
               var22 = ll(409359852, var18 ^ -1439559738);
               String var27 = var2.substring(++var20, var20 + var1);
               byte var39 = -1;

               while (true) {
                  label99: {
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
                           break label99;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % ll(409359840, var18 ^ -2065718841)) {
                           case 0 -> ll(409359847, var18 ^ -655840136);
                           case 1 -> ll(409359846, var18 ^ 1624833439);
                           case 2 -> ll(409359845, var18 ^ 31035763);
                           case 3 -> ll(409359844, var18 ^ -483038281);
                           case 4 -> ll(409359867, var18 ^ -1860847110);
                           case 5 -> ll(409359866, var18 ^ -2056455579);
                           default -> ll(409359865, var18 ^ 842707760);
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
                           IIl = new String[ll(409359841, var18 ^ 1774593056)];
                           I = new String[ll(409359864, var18 ^ 541709517)];
                           I();
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var62;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label104;
                        }

                        var4 = (var2 = III(-1821678954, var18 ^ 1042527249)).length();
                        var1 = ll(409359843, var18 ^ -615023927);
                        var20 = -1;
                  }

                  var22 = ll(409359842, var18 ^ -1180913909);
                  var27 = var2.substring(++var20, var20 + var1);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 48;
                  case 1 -> 48;
                  case 2 -> 8;
                  case 3 -> 138;
                  case 4 -> 212;
                  case 5 -> 75;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   @Override
   public void llIl() {
      this.lII = null;
      this.Il = null;
      this.ll = 0L;
      this.III = ll(409359579, 182228728 ^ 1038895195);
      this.II = ll(409359578, 182228728 ^ 441005341);
      this.llI = 0L;
   }

   private void II(class_1309 var1) {
      String[] var2 = IIllllIl.IIIIl();
      long var3 = System.currentTimeMillis();
      int var5 = var1 == null ? ll(409359577, -248741290 ^ -925856365) : var1.method_5628();
      if (var5 != ll(409359576, -248741290 ^ 307274301)) {
         if (this.Il != null && this.III == var5) {
            return;
         }

         if (this.II == var5 && var3 - this.llI < 10000L) {
            return;
         }
      }

      List var6 = (List)this.Ill.IllI();
      if (!var6.isEmpty()) {
         String var7;
         label56: {
            if (this.IIlI.IllI() == lllllII.Il) {
               var7 = (String)var6.get(this.IIII.nextInt(var6.size()));
               if (var2 == null) {
                  break label56;
               }
            }

            if (this.IIIl >= var6.size()) {
               this.IIIl = 0;
            }

            var7 = (String)var6.get(this.IIIl);
            this.IIIl = (this.IIIl + 1) % var6.size();
         }

         if (var7 != null && !var7.isBlank()) {
            this.Il = var7.trim();
            this.ll = var3 + (long)this.IlI.IllI().doubleValue();
            this.III = var5;
            this.II = var5;
            this.llI = var3;
         }
      }
   }

   private void Il(class_310 var1, String var2) {
      try {
         var1.method_1562().method_45729(var2);
      } catch (Exception var4) {
      }
   }

   private static String lI(char[] var0, long var1, int var3) {
      int var4 = ll(409359583, 433345612 ^ 345410254) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(409359582, 433345612 ^ 409119583);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
