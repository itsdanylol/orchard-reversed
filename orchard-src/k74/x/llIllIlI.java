package k74.x;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class llIllIlI {
   private static final Object[] IIII;
   private static final String[] lll;
   public static final double I = 0.1;
   private static final String[] II;
   private static final String[] Il;
   private static final int[] llI;
   private static final double l = 3.0;
   public static final double lI = 0.01;
   private static String[] ll;
   private static final double III = 620.0;
   public static final boolean IIl = true;
   private static final double IlI = 32.0;
   public static final double Ill = 0.01;
   private static final double lII = 382.0;
   private static final double lIl = 64.0;

   public static double I(double var0, double var2, double var4) {
      double var6 = Double.isFinite(var0) ? var0 : 0.0;
      double var8 = Double.isFinite(var2) ? var2 : 0.0;
      double var10 = Double.isFinite(var4) ? Math.max(0.0, var4) : 0.0;
      return Math.max(var6 - var10, Math.min(var6 + var10, var8));
   }

   public static List<String> l(String var0, String var1) {
      String[] var2 = IIlII();
      if (var0 != null && !var0.isBlank()) {
         String var3 = var1 != null && !var1.isBlank()
            ? var1
            : IlIIllIII.lI(III(IIlIl(-2138859602, -43483963 ^ -1099219617), IIlIl(-2138859601, -43483963 ^ -815162081)));
         String[] var4 = var0.split(var3);
         ArrayList var5 = new ArrayList();

         for (String var9 : var4) {
            if (var9 != null || var2 == null) {
               String var10 = var9.trim();
               if (!var10.isEmpty()) {
                  var5.add(var10);
               }
            }

            if (var2 == null) {
               break;
            }
         }

         return List.copyOf(var5);
      } else {
         return List.of();
      }
   }

   public static boolean II(double var0, double var2, double var4, double var6, double var8) {
      double var10 = Math.max(0.0, var4);
      double var12 = var6 - var0;
      double var14 = var8 - var2;
      return var12 * var12 + var14 * var14 <= var10 * var10;
   }

   private static double Il(double var0) {
      return Math.max(0.0, Math.min(100.0, var0));
   }

   public static double lI(double var0, int var2, int var3) {
      double var4 = Double.isFinite(var0) ? Math.max(1.0, var0) : 1.0;
      double var6 = Math.max(1, var2) / 652.0;
      double var8 = Math.max(1, var3) / 446.0;
      double var10 = Math.max(1.0, Math.min(var6, var8));
      return Math.min(var4, Math.min(3.0, var10));
   }

   public static boolean ll(Object var0, Object var1) {
      return !Objects.deepEquals(var0, var1);
   }

   private static String III(int var0, int var1) {
      int var9 = -1248029849;
      int var2 = (var0 ^ IIlIl(-2138859604, var9 ^ 55278332)) & IIlIl(-2138859603, var9 ^ -514906587);
      if (Il[var2] == null) {
         char[] var3 = II[var2].toCharArray();

         int var4 = switch (var3[0] & IIlIl(-2138859606, var9 ^ -196807481)) {
            case 0 -> IIlIl(-2138859605, var9 ^ -1398410168);
            case 1 -> IIlIl(-2138859608, var9 ^ 192362772);
            case 2 -> IIlIl(-2138859607, var9 ^ -1884490901);
            case 3 -> IIlIl(-2138859610, var9 ^ 1849188514);
            case 4 -> IIlIl(-2138859609, var9 ^ 1796378340);
            case 5 -> IIlIl(-2138859612, var9 ^ -941882443);
            case 6 -> IIlIl(-2138859611, var9 ^ -1822959168);
            case 7 -> IIlIl(-2138859614, var9 ^ 926268673);
            case 8 -> IIlIl(-2138859613, var9 ^ 1466485650);
            case 9 -> IIlIl(-2138859616, var9 ^ 235268041);
            case 10 -> IIlIl(-2138859615, var9 ^ -755547565);
            case 11 -> IIlIl(-2138859586, var9 ^ -1821622481);
            case 12 -> IIlIl(-2138859585, var9 ^ -1234472105);
            case 13 -> IIlIl(-2138859588, var9 ^ -1707500607);
            case 14 -> IIlIl(-2138859587, var9 ^ -2082442176);
            case 15 -> IIlIl(-2138859590, var9 ^ 1199105184);
            case 16 -> IIlIl(-2138859589, var9 ^ 926751304);
            case 17 -> IIlIl(-2138859592, var9 ^ -473273270);
            case 18 -> IIlIl(-2138859591, var9 ^ 1916519759);
            case 19 -> IIlIl(-2138859594, var9 ^ -682671580);
            case 20 -> IIlIl(-2138859593, var9 ^ 212670997);
            case 21 -> IIlIl(-2138859596, var9 ^ 592660551);
            case 22 -> IIlIl(-2138859595, var9 ^ 290825931);
            case 23 -> IIlIl(-2138859598, var9 ^ 1243410446);
            case 24 -> IIlIl(-2138859597, var9 ^ 198959013);
            case 25 -> IIlIl(-2138859600, var9 ^ 1240037646);
            case 26 -> 2;
            case 27 -> IIlIl(-2138859599, var9 ^ 1007673475);
            case 28 -> IIlIl(-2138859634, var9 ^ 950738775);
            case 29 -> IIlIl(-2138859633, var9 ^ 356037789);
            case 30 -> IIlIl(-2138859636, var9 ^ 418820088);
            case 31 -> IIlIl(-2138859635, var9 ^ 785721560);
            case 32 -> IIlIl(-2138859638, var9 ^ -607134672);
            case 33 -> IIlIl(-2138859637, var9 ^ -280107564);
            case 34 -> IIlIl(-2138859640, var9 ^ -1174995151);
            case 35 -> IIlIl(-2138859639, var9 ^ -372465777);
            case 36 -> IIlIl(-2138859642, var9 ^ 466379587);
            case 37 -> IIlIl(-2138859641, var9 ^ 87855331);
            case 38 -> IIlIl(-2138859644, var9 ^ -699844410);
            case 39 -> IIlIl(-2138859643, var9 ^ -1822368405);
            case 40 -> IIlIl(-2138859646, var9 ^ 408078040);
            case 41 -> IIlIl(-2138859645, var9 ^ -1532214903);
            case 42 -> IIlIl(-2138859648, var9 ^ 1695411360);
            case 43 -> IIlIl(-2138859647, var9 ^ 584407980);
            case 44 -> IIlIl(-2138859618, var9 ^ 837695271);
            case 45 -> IIlIl(-2138859617, var9 ^ 153853019);
            case 46 -> IIlIl(-2138859620, var9 ^ -305320263);
            case 47 -> IIlIl(-2138859619, var9 ^ 396905700);
            case 48 -> IIlIl(-2138859622, var9 ^ -1794005603);
            case 49 -> IIlIl(-2138859621, var9 ^ -1438319494);
            case 50 -> IIlIl(-2138859624, var9 ^ -173433277);
            case 51 -> IIlIl(-2138859623, var9 ^ -690262275);
            case 52 -> 4;
            case 53 -> IIlIl(-2138859626, var9 ^ 689759803);
            case 54 -> IIlIl(-2138859625, var9 ^ -739806577);
            case 55 -> IIlIl(-2138859628, var9 ^ 131552537);
            case 56 -> IIlIl(-2138859627, var9 ^ 1301282751);
            case 57 -> IIlIl(-2138859630, var9 ^ 591184523);
            case 58 -> IIlIl(-2138859629, var9 ^ 1080425746);
            case 59 -> IIlIl(-2138859632, var9 ^ 741140190);
            case 60 -> IIlIl(-2138859631, var9 ^ -1787787482);
            case 61 -> IIlIl(-2138859538, var9 ^ 1465803057);
            case 62 -> IIlIl(-2138859537, var9 ^ -588050220);
            case 63 -> IIlIl(-2138859540, var9 ^ 1446181614);
            case 64 -> IIlIl(-2138859539, var9 ^ -188833594);
            case 65 -> IIlIl(-2138859542, var9 ^ 840971595);
            case 66 -> IIlIl(-2138859541, var9 ^ 824626800);
            case 67 -> IIlIl(-2138859544, var9 ^ -226373566);
            case 68 -> IIlIl(-2138859543, var9 ^ -132581411);
            case 69 -> IIlIl(-2138859546, var9 ^ 1781236867);
            case 70 -> IIlIl(-2138859545, var9 ^ -1725254914);
            case 71 -> IIlIl(-2138859548, var9 ^ -1134980325);
            case 72 -> IIlIl(-2138859547, var9 ^ 829819542);
            case 73 -> IIlIl(-2138859550, var9 ^ 554478605);
            case 74 -> IIlIl(-2138859549, var9 ^ 433095372);
            case 75 -> IIlIl(-2138859552, var9 ^ -562828611);
            case 76 -> IIlIl(-2138859551, var9 ^ -1552319896);
            case 77 -> IIlIl(-2138859522, var9 ^ 2075419577);
            case 78 -> IIlIl(-2138859521, var9 ^ -270497608);
            case 79 -> IIlIl(-2138859524, var9 ^ 1910977551);
            case 80 -> IIlIl(-2138859523, var9 ^ 68788542);
            case 81 -> IIlIl(-2138859526, var9 ^ 410384990);
            case 82 -> IIlIl(-2138859525, var9 ^ 1413964319);
            case 83 -> IIlIl(-2138859528, var9 ^ -891863021);
            case 84 -> IIlIl(-2138859527, var9 ^ 485863221);
            case 85 -> IIlIl(-2138859530, var9 ^ 378631837);
            case 86 -> 0;
            case 87 -> IIlIl(-2138859529, var9 ^ -500519187);
            case 88 -> IIlIl(-2138859532, var9 ^ 113468109);
            case 89 -> IIlIl(-2138859531, var9 ^ -1276433962);
            case 90 -> IIlIl(-2138859534, var9 ^ 142849389);
            case 91 -> IIlIl(-2138859533, var9 ^ 304177577);
            case 92 -> IIlIl(-2138859536, var9 ^ 91682648);
            case 93 -> IIlIl(-2138859535, var9 ^ -672467878);
            case 94 -> IIlIl(-2138859570, var9 ^ 340488719);
            case 95 -> IIlIl(-2138859569, var9 ^ 1507063184);
            case 96 -> IIlIl(-2138859572, var9 ^ -337058738);
            case 97 -> 3;
            case 98 -> IIlIl(-2138859571, var9 ^ -1210609551);
            case 99 -> IIlIl(-2138859574, var9 ^ 666768136);
            case 100 -> IIlIl(-2138859573, var9 ^ -1665010994);
            case 101 -> IIlIl(-2138859576, var9 ^ -582985711);
            case 102 -> IIlIl(-2138859575, var9 ^ -2116777754);
            case 103 -> IIlIl(-2138859578, var9 ^ -569738028);
            case 104 -> IIlIl(-2138859577, var9 ^ -1595472637);
            case 105 -> IIlIl(-2138859580, var9 ^ 265800053);
            case 106 -> IIlIl(-2138859579, var9 ^ -571412453);
            case 107 -> IIlIl(-2138859582, var9 ^ 874803362);
            case 108 -> IIlIl(-2138859581, var9 ^ 707370226);
            case 109 -> IIlIl(-2138859584, var9 ^ 53363773);
            case 110 -> IIlIl(-2138859583, var9 ^ -326299536);
            case 111 -> IIlIl(-2138859554, var9 ^ -610630020);
            case 112 -> IIlIl(-2138859553, var9 ^ -877340344);
            case 113 -> IIlIl(-2138859556, var9 ^ 1150072701);
            case 114 -> IIlIl(-2138859555, var9 ^ -193943273);
            case 115 -> IIlIl(-2138859558, var9 ^ 1536916173);
            case 116 -> IIlIl(-2138859557, var9 ^ -1997030391);
            case 117 -> IIlIl(-2138859560, var9 ^ 1206883735);
            case 118 -> IIlIl(-2138859559, var9 ^ -1418095162);
            case 119 -> IIlIl(-2138859562, var9 ^ 1091715230);
            case 120 -> IIlIl(-2138859561, var9 ^ 347912423);
            case 121 -> IIlIl(-2138859564, var9 ^ -106327611);
            case 122 -> IIlIl(-2138859563, var9 ^ -1525210992);
            case 123 -> IIlIl(-2138859566, var9 ^ 451448384);
            case 124 -> IIlIl(-2138859565, var9 ^ 1312306029);
            case 125 -> IIlIl(-2138859568, var9 ^ -1041852133);
            case 126 -> IIlIl(-2138859567, var9 ^ 1111966883);
            case 127 -> IIlIl(-2138859730, var9 ^ -1272532688);
            case 128 -> IIlIl(-2138859729, var9 ^ 42379827);
            case 129 -> IIlIl(-2138859732, var9 ^ -1064329258);
            case 130 -> IIlIl(-2138859731, var9 ^ 448459815);
            case 131 -> IIlIl(-2138859734, var9 ^ -797489906);
            case 132 -> IIlIl(-2138859733, var9 ^ -128604579);
            case 133 -> IIlIl(-2138859736, var9 ^ -745063069);
            case 134 -> IIlIl(-2138859735, var9 ^ -695397543);
            case 135 -> IIlIl(-2138859738, var9 ^ -2086969013);
            case 136 -> IIlIl(-2138859737, var9 ^ 1486636211);
            case 137 -> IIlIl(-2138859740, var9 ^ -725224735);
            case 138 -> IIlIl(-2138859739, var9 ^ -1509417046);
            case 139 -> IIlIl(-2138859742, var9 ^ 2054411516);
            case 140 -> IIlIl(-2138859741, var9 ^ -875766728);
            case 141 -> IIlIl(-2138859744, var9 ^ 535515522);
            case 142 -> IIlIl(-2138859743, var9 ^ -886287310);
            case 143 -> IIlIl(-2138859714, var9 ^ -2010076530);
            case 144 -> IIlIl(-2138859713, var9 ^ -976574460);
            case 145 -> IIlIl(-2138859716, var9 ^ 1206019731);
            case 146 -> IIlIl(-2138859715, var9 ^ -700678090);
            case 147 -> IIlIl(-2138859718, var9 ^ 120816556);
            case 148 -> IIlIl(-2138859717, var9 ^ -1724697888);
            case 149 -> IIlIl(-2138859720, var9 ^ -1329379497);
            case 150 -> IIlIl(-2138859719, var9 ^ 420662817);
            case 151 -> IIlIl(-2138859722, var9 ^ -2134835794);
            case 152 -> IIlIl(-2138859721, var9 ^ 546210405);
            case 153 -> IIlIl(-2138859724, var9 ^ -875018698);
            case 154 -> IIlIl(-2138859723, var9 ^ 608949881);
            case 155 -> IIlIl(-2138859726, var9 ^ -198012084);
            case 156 -> IIlIl(-2138859725, var9 ^ -1582318791);
            case 157 -> IIlIl(-2138859728, var9 ^ 938227196);
            case 158 -> IIlIl(-2138859727, var9 ^ -1341341375);
            case 159 -> IIlIl(-2138859762, var9 ^ 464324358);
            case 160 -> IIlIl(-2138859761, var9 ^ 1872170943);
            case 161 -> IIlIl(-2138859764, var9 ^ 1175006403);
            case 162 -> IIlIl(-2138859763, var9 ^ 1380872435);
            case 163 -> IIlIl(-2138859766, var9 ^ -1304146334);
            case 164 -> IIlIl(-2138859765, var9 ^ -954703217);
            case 165 -> IIlIl(-2138859768, var9 ^ 1041729173);
            case 166 -> IIlIl(-2138859767, var9 ^ 437921706);
            case 167 -> IIlIl(-2138859770, var9 ^ 534017971);
            case 168 -> IIlIl(-2138859769, var9 ^ 267338301);
            case 169 -> IIlIl(-2138859772, var9 ^ -880314282);
            case 170 -> IIlIl(-2138859771, var9 ^ 1050401769);
            case 171 -> 1;
            case 172 -> IIlIl(-2138859774, var9 ^ 691552234);
            case 173 -> IIlIl(-2138859773, var9 ^ 574566390);
            case 174 -> IIlIl(-2138859776, var9 ^ 62325453);
            case 175 -> IIlIl(-2138859775, var9 ^ -1903337840);
            case 176 -> IIlIl(-2138859746, var9 ^ 2040818518);
            case 177 -> IIlIl(-2138859745, var9 ^ 427549446);
            case 178 -> IIlIl(-2138859748, var9 ^ -1561881268);
            case 179 -> IIlIl(-2138859747, var9 ^ 401267536);
            case 180 -> IIlIl(-2138859750, var9 ^ -25798327);
            case 181 -> IIlIl(-2138859749, var9 ^ -175962094);
            case 182 -> IIlIl(-2138859752, var9 ^ -1419699852);
            case 183 -> IIlIl(-2138859751, var9 ^ -781275831);
            case 184 -> IIlIl(-2138859754, var9 ^ -996767117);
            case 185 -> IIlIl(-2138859753, var9 ^ 196117823);
            case 186 -> IIlIl(-2138859756, var9 ^ 1419365124);
            case 187 -> IIlIl(-2138859755, var9 ^ 628911256);
            case 188 -> IIlIl(-2138859758, var9 ^ -873531084);
            case 189 -> IIlIl(-2138859757, var9 ^ -1623408315);
            case 190 -> 5;
            case 191 -> IIlIl(-2138859760, var9 ^ 1478713167);
            case 192 -> IIlIl(-2138859759, var9 ^ -1917447807);
            case 193 -> IIlIl(-2138859666, var9 ^ -950561504);
            case 194 -> IIlIl(-2138859665, var9 ^ 296862926);
            case 195 -> IIlIl(-2138859668, var9 ^ 605913644);
            case 196 -> IIlIl(-2138859667, var9 ^ 1324652479);
            case 197 -> IIlIl(-2138859670, var9 ^ -546264692);
            case 198 -> IIlIl(-2138859669, var9 ^ 147321736);
            case 199 -> IIlIl(-2138859672, var9 ^ -1104184353);
            case 200 -> IIlIl(-2138859671, var9 ^ 1167131129);
            case 201 -> IIlIl(-2138859674, var9 ^ -1177719505);
            case 202 -> IIlIl(-2138859673, var9 ^ 1132192367);
            case 203 -> IIlIl(-2138859676, var9 ^ 1610766955);
            case 204 -> IIlIl(-2138859675, var9 ^ 1357613486);
            case 205 -> IIlIl(-2138859678, var9 ^ -1279482472);
            case 206 -> IIlIl(-2138859677, var9 ^ 1059978046);
            case 207 -> IIlIl(-2138859680, var9 ^ -297738183);
            case 208 -> IIlIl(-2138859679, var9 ^ -1395845991);
            case 209 -> IIlIl(-2138859650, var9 ^ 166848946);
            case 210 -> IIlIl(-2138859649, var9 ^ -237844141);
            case 211 -> IIlIl(-2138859652, var9 ^ -1821456674);
            case 212 -> IIlIl(-2138859651, var9 ^ -529982783);
            case 213 -> IIlIl(-2138859654, var9 ^ -569119114);
            case 214 -> IIlIl(-2138859653, var9 ^ 1345742590);
            case 215 -> IIlIl(-2138859656, var9 ^ 498183888);
            case 216 -> IIlIl(-2138859655, var9 ^ -555081121);
            case 217 -> IIlIl(-2138859658, var9 ^ 1370422342);
            case 218 -> IIlIl(-2138859657, var9 ^ 708035666);
            case 219 -> IIlIl(-2138859660, var9 ^ -969135329);
            case 220 -> IIlIl(-2138859659, var9 ^ -1824037157);
            case 221 -> IIlIl(-2138859662, var9 ^ 1960147571);
            case 222 -> IIlIl(-2138859661, var9 ^ 648789052);
            case 223 -> IIlIl(-2138859664, var9 ^ -1578299146);
            case 224 -> IIlIl(-2138859663, var9 ^ 800765398);
            case 225 -> IIlIl(-2138859698, var9 ^ 1873189821);
            case 226 -> IIlIl(-2138859697, var9 ^ -385810059);
            case 227 -> IIlIl(-2138859700, var9 ^ -1885836512);
            case 228 -> IIlIl(-2138859699, var9 ^ -1834207022);
            case 229 -> IIlIl(-2138859702, var9 ^ -1781623354);
            case 230 -> IIlIl(-2138859701, var9 ^ 965202440);
            case 231 -> IIlIl(-2138859704, var9 ^ -1020090344);
            case 232 -> IIlIl(-2138859703, var9 ^ 826457033);
            case 233 -> IIlIl(-2138859706, var9 ^ 2088422824);
            case 234 -> IIlIl(-2138859705, var9 ^ 288476530);
            case 235 -> IIlIl(-2138859708, var9 ^ 558930582);
            case 236 -> IIlIl(-2138859707, var9 ^ -803080883);
            case 237 -> IIlIl(-2138859710, var9 ^ 742115674);
            case 238 -> IIlIl(-2138859709, var9 ^ -1051576822);
            case 239 -> IIlIl(-2138859712, var9 ^ -851956666);
            case 240 -> IIlIl(-2138859711, var9 ^ -1676740212);
            case 241 -> IIlIl(-2138859682, var9 ^ 1110118667);
            case 242 -> IIlIl(-2138859681, var9 ^ 1427070013);
            case 243 -> IIlIl(-2138859684, var9 ^ 295970417);
            case 244 -> IIlIl(-2138859683, var9 ^ -65062108);
            case 245 -> IIlIl(-2138859686, var9 ^ 1650339151);
            case 246 -> IIlIl(-2138859685, var9 ^ -1013025826);
            case 247 -> IIlIl(-2138859688, var9 ^ -2038586082);
            case 248 -> IIlIl(-2138859687, var9 ^ -818218315);
            case 249 -> IIlIl(-2138859690, var9 ^ 1442932343);
            case 250 -> IIlIl(-2138859689, var9 ^ -1017627837);
            case 251 -> IIlIl(-2138859692, var9 ^ 1615590277);
            case 252 -> IIlIl(-2138859691, var9 ^ 1491980301);
            case 253 -> IIlIl(-2138859694, var9 ^ -968592667);
            case 254 -> IIlIl(-2138859693, var9 ^ 1865994805);
            default -> IIlIl(-2138859696, var9 ^ 527587699);
         };
         int var5 = (var1 & IIlIl(-2138859695, var9 ^ 1939604710)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIlIl(-2138859858, var9 ^ 748928742)) >>> IIlIl(-2138859857, var9 ^ 437113898)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIlIl(-2138859860, var9 ^ 65002184);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIlIl(-2138859859, var9 ^ -1346166275);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }

   public static boolean IIl(double var0, double var2) {
      return var0 >= Il(var2);
   }

   public static String IlI(long var0, long var2) {
      return Long.toString(var0 + Math.max(1L, var2));
   }

   public static int Ill(int var0, int var1) {
      return var0 + 1 + Math.max(0, var1);
   }

   public static void lII(String[] var0) {
      ll = var0;
   }

   public static boolean lIl(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22
   ) {
      double[] var24 = new double[]{0.0, 1.0};
      return lIIl(var0, var6 - var0, Math.min(var12, var18), Math.max(var12, var18), var24)
            && lIIl(var2, var8 - var2, Math.min(var14, var20), Math.max(var14, var20), var24)
            && lIIl(var4, var10 - var4, Math.min(var16, var22), Math.max(var16, var22), var24)
         ? var24[0] < 0.999999 && var24[1] >= 0.0
         : false;
   }

   public static double llI(double var0) {
      double var2 = Double.isFinite(var0) ? Math.max(0.0, var0) : 0.0;
      double var4 = Math.max(0.0, Math.min(1.0, (var2 - 0.5) / 11.5));
      return var4 * var4 * (3.0 - 2.0 * var4);
   }

   public static boolean lll(double var0, float var2, double var3) {
      return Double.isFinite(var0) && var0 < 0.0 && Float.isFinite(var2) && var2 > 0.9F && var2 >= var3;
   }

   private static int IIlIl(int var0, int var1) {
      int var2 = llI[var0 ^ -2138859602] ^ var1 ^ var0;
      var2 -= 21445;
      var2 ^= 17770;
      var2 -= 6455;
      var2 -= 45470;
      var2 += 39685;
      var2 += 6039;
      return var2 ^ 48589;
   }

   private static String IIllI(int var0, int var1) {
      int var3 = var0 ^ 1728716007;
      char[] var4 = lll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIII[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIII[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1537046875;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 91;
            case 1 -> 160;
            case 2 -> 199;
            case 3 -> 17;
            case 4 -> 244;
            case 5 -> 7;
            case 6 -> 84;
            case 7 -> 189;
            case 8 -> 38;
            case 9 -> 144;
            case 10 -> 217;
            case 11 -> 61;
            case 12 -> 222;
            case 13 -> 3;
            case 14 -> 22;
            case 15 -> 237;
            case 16 -> 150;
            case 17 -> 207;
            case 18 -> 108;
            case 19 -> 4;
            case 20 -> 13;
            case 21 -> 81;
            case 22 -> 208;
            case 23 -> 145;
            case 24 -> 252;
            case 25 -> 7;
            case 26 -> 149;
            case 27 -> 154;
            case 28 -> 121;
            case 29 -> 60;
            case 30 -> 60;
            case 31 -> 228;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public static boolean IIII(boolean var0, boolean var1, double var2, double var4) {
      return var0 && !var1 && (var2 >= 0.0 || var4 <= 0.0);
   }

   public static double IIIl(double var0, double var2) {
      double var4 = Double.isFinite(var0) ? Math.max(0.0, Math.min(var0, 0.1)) : 0.0;
      double var6 = Double.isFinite(var2) ? Math.max(0.0, Math.min(var2, 1.0)) : 0.85;
      double var8 = 12.0 - var6 * 9.5;
      return 1.0 - Math.exp(-var4 * var8);
   }

   public static double IIlI(double var0) {
      double var2 = Double.isFinite(var0) ? Math.max(0.0, var0) : 0.0;
      double var4 = Math.min(1.0, var2 / 30.0);
      double var6 = var4 * var4 * (3.0 - 2.0 * var4);
      return 0.14 + var6 * 0.86;
   }

   private llIllIlI() {
   }

   public static double IIll(double var0) {
      return IIIl(var0, 0.85);
   }

   public static long IlII(long var0, long var2, long var4) {
      return Math.max(var0, var2 + Math.max(0L, var4));
   }

   public static lIIlllIl IlIl(boolean var0, boolean var1, boolean var2, boolean var3, float var4, float var5) {
      float var6 = (var0 ? 1.0F : 0.0F) - (var1 ? 1.0F : 0.0F);
      float var7 = (var2 ? 1.0F : 0.0F) - (var3 ? 1.0F : 0.0F);
      float var8 = (float)Math.sqrt(var6 * var6 + var7 * var7);
      if (var8 <= 1.0E-4F) {
         return new lIIlllIl(0.0F, 0.0F);
      } else {
         if (var8 > 1.0F) {
            var6 /= var8;
            var7 /= var8;
         }

         float var9 = lllI(var4 - var5);
         float var10 = (float)Math.toRadians(var9);
         float var11 = (float)Math.sin(var10);
         float var12 = (float)Math.cos(var10);
         float var13 = var7 * var12 + var6 * var11;
         float var14 = var6 * var12 - var7 * var11;
         float var15 = (float)Math.sqrt(var14 * var14 + var13 * var13);
         if (var15 > 1.0F) {
            var14 /= var15;
            var13 /= var15;
         }

         return new lIIlllIl(var14, var13);
      }
   }

   public static boolean IllI(boolean var0, boolean var1) {
      return var0 && var1;
   }

   public static boolean Illl(double var0, double var2, double var4, double var6, double var8, double var10, double var12) {
      double var14 = Math.max(0.0, var4);
      double var16 = Math.max(Math.min(var6, var10), Math.min(var0, Math.max(var6, var10)));
      double var18 = Math.max(Math.min(var8, var12), Math.min(var2, Math.max(var8, var12)));
      double var20 = var16 - var0;
      double var22 = var18 - var2;
      return var20 * var20 + var22 * var22 <= var14 * var14;
   }

   public static boolean lIII(boolean var0, int var1, boolean var2) {
      return !var2 && (var0 || var1 > 0);
   }

   private static boolean lIIl(double var0, double var2, double var4, double var6, double[] var8) {
      if (!(Math.abs(var2) < 1.0E-9)) {
         double var9 = (var4 - var0) / var2;
         double var11 = (var6 - var0) / var2;
         if (var9 > var11) {
            double var13 = var9;
            var9 = var11;
            var11 = var13;
         }

         var8[0] = Math.max(var8[0], var9);
         var8[1] = Math.min(var8[1], var11);
         return var8[0] <= var8[1];
      } else {
         return var0 >= var4 && var0 <= var6;
      }
   }

   public static double lIlI(int var0, int var1) {
      if (var0 <= 0) {
         return 100.0;
      } else {
         int var2 = Math.max(0, Math.min(var0, var1));
         return (var0 - var2) * 100.0 / var0;
      }
   }

   public static boolean lIll(double var0) {
      return var0 >= 0.1;
   }

   public static boolean llII(long var0, long var2) {
      return var0 < var2;
   }

   public static boolean llIl(double var0, double var2) {
      return var0 < Il(var2);
   }

   public static float lllI(float var0) {
      float var1 = var0 % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   public static boolean llll(double var0, float var2, boolean var3, boolean var4) {
      return lll(var0, var2, 0.0) && !var3 && !var4;
   }

   public static double IIIII(boolean var0, boolean var1) {
      if (var0 && !var1) {
         return 0.86;
      } else {
         return var1 && !var0 ? 0.58 : 0.73;
      }
   }

   public static boolean IIIIl(boolean var0, String var1) {
      return var0 && var1 != null && !var1.isBlank();
   }

   public static boolean IIIlI(long var0, long var2, long var4) {
      return var4 <= 0L || var0 >= var2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1718332251;
      int var17 = 0;
      short var18 = 21812;
      String[] var15 = new String[1];
      int var16 = 0;
      int var14 = "\r醩ꦟ鬉妑鉹릕餙ꦟ鈉撚骙榒饩".length();
      String var13 = "\r醩ꦟ鬉妑鉹릕餙ꦟ鈉撚骙榒饩";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << '\f') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> '\f') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lll = var15;
      IIII = new Object[var15.length];
      int var9 = 675152367;
      byte[] var7 = "ë®\u000eP\u009a¼\u009a@\u001ej¦SünQÆée\u0012#±\u0084\u0012¬\u0016VØð\u0092\u008d\u0015¶s\u0019\u0081\u0017v3oÈÚýâÎ\u008ev?\u0001*\u0014_hJI*\u0016\u0013$\u0006úÏÖ¤²\u008eMÞ\u0099«J\u0092Æ\u0087\u0018}\u000b\u009eÁ\u0096JZY\u0005ò*\u001cü\u0096þë\u008d\u0014o\u001a$.Ên£\u008a\u0011\u008cû[>r©#\ft@\u0017W=\u0011\"\u0016ú>ùTÈ\u009b\u001c!.\u0006Z%\u008aýF\b\u0019R|\u0005×N@3ôÉOÆî=|òl\u0007Ü¤×\u001e¬ôí~\u009b\u0006í\u0085µ\u0018\u001dq{ËhÙ\u0087\u008eA;½\u0005s 9¹\u008d£¦x,\r/?ôºÏ,ÏÑÆ\u0014\n~mðìÈG\n\u0089\u00adY\u00880D\u0001·e\u001eKè\u0088|xËú\u008fu4=\u0004\u001bÎÆ\u0090ª\u001aö´qP®\u001eÉ>\u001d#Å]D\u001c¼1\r\u0007X\u0088QaÄJ\u007f\u00803ÁÒñÜK\u0013\u001bHé\u009fFF/\u0001×\t,\u0007/kï 1yå9\u0016½w\nea\u0084\u000bSÍ¡xqy,Wì%<-M5\u0004ñd\u007fÃR\f2¾X\u009b\u0089f\u0095\u0082¦òÁn\u0019lÆÖk\u00198Cs\u0005T\u001b`If\u0084\u0095×ö¡£\u0001ÔN÷\u000b°\u0097Mÿ\u000bO&\u001bâ\u0083 ®ÊÈÉ\u0015¢T\u0013\u000f\u0000\u0083Ø\u0018W\u0011ÐÊË\u0012Þ\tj\u0093%Dò\u0013\u0019öÉ\u0005wªöv×:\u009fòñ\u0081à\u0013\u0097Àa¹\u0017\u009cõi\rÃ+\u009d$½Æäß\u0012ö(\u009cÀÑ\u0011J)\u0005\u0096\u001e7\b}Â\u001e\u000f¥ãñ¬öæÆ»d#Ö\u00958PY\u00adVaéQO\u0098Fº\u009bÅ\u0095Ö^_ZÎt`¶Xtô\\3¡}\t\u009dZ\u008eä\u0088wR¸6Âä\u0007ÉoiS\u0019ÒªÜÇxÁ_f¥ø©\u0007P\u0010\u001f§HÖÝ®}]\u0007\u009b\u0012sÍV¤Ðåt@\u0010Î¶ßíË¬õ1\u009eº\u0080\u009aE½¦4Éä\u0010q»)ùÂgR5úÖí=\u008b\u0002Ê°©Ö\r¶\u0085\u0095\u0011LïØëJòZÃ\u00843Ë\u001db´\u001a\u0012b¡\u0084\u0012Ô¡\u00adâ¦$\u00043(\\\u009dá\u001bã=¯`ÝÖù¤\u00989j0\u0015é\u0013r\u0083¼\u008e]H*ÍÔå\u00ad-#Ý\u0006\u008cáMr¶îe[(ÍÓOo\u0091'¯e¯ªÚ9\u0080\n#6dQ\u0007;Æ~\u0002õ\u0096D\u0012Î ¯Ö¦\u009e\u0007#º:-4\u0019Ý ?\u001eÎö\u001e\u0096ä¬\u0093¬¸Ìd\u0085\u008d\u0010\u0004Z\u0002#¿ÆtÁ\nË:\u00adãW¸«è¢é!¶@øUÌOOÔÙ·l\u0005\u0016\u0091g\u0086I¸*\u001c8]\u008d\u0088ÖÏ\u0018÷\u0082\u001d#íE\u0002½Ú\u0090\u0097ð\u0099Úvt~\f\u0090%\u00829<cASÕv\u001fÂQH1\u0015æ\u0015\u0084£\u000e\u009aZX°ã!¤ì\u008cK^Z\u00036}#»>MÊk\\®\u009dGG\"\f\u001aPóa\u0006\b±ìõÇ\u0014Ð\u000b\u007fìó(<\u008eO'aýHø;Ã2\f\u008cM\u0017\u0087[\u0000\u0090O ÃËÃ!L\u008f\u001aB7\u0012%ßÛ\u001dÍ\u0017\u008ef\u0087Kiô\u009b3;\u008a]\u0006¼Ìò32\u009bSür\u0087zîô àõ\u0092¹\u008d\u0000\u008f\u008dÞÅ\u0088ït $¦44Þ\u0013N\u0017,c]ýa[/E\f\u0010/¬<q{\tÍ\u0000\u0013\\1\u001a/DÜsÐ\u0007Ð\u0019Í>\u0081/\u0018ç_\nð~H.½\u009d\f\u0085Ç?á>ÙÝ\u007f\u007fÌûÞ¿\u0092s\u009b\\D¸Ò\u001b\u001b\u0005K \u0080KÞyÙ\u008f}j\u0012\u0007EÌ1yÛe\u0093 r\u00193\u0094\u0002S¸\u0006n½âù1\u0082È\u0006\u0007,4T\u001eþ=*²âÆ\u001e\u0080\u0013\u0006ÿ\u0094òÈ½¢ç\u0011\u0006)þ«\u0004}M\u0080\u0084ü\u001a#\u007fåê\u0000V\u008dá{Ùs\u00adYÏy+ðÞFµÏþ"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      llI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         llI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIllI(1728716007, var23 ^ 1688316339)).length();
      char var1 = 4;
      String[] var10000 = new String[5];
      int var0 = -1;
      lII(var10000);

      while (true) {
         char[] var10002;
         label75: {
            int var26 = IIlIl(-2138859862, var23 ^ 1321590259);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var32 = var26;
            var10002 = var10003;
            int var27 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var26;
               var10006 = var6;
            } else {
               var32 = var26;
               var27 = var10004;
               if (var10004 <= var6) {
                  break label75;
               }

               var10005 = var10003;
               var10004 = var26;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % IIlIl(-2138859861, var23 ^ 1512313740)) {
                  case 0 -> IIlIl(-2138859864, var23 ^ 1815202206);
                  case 1 -> IIlIl(-2138859863, var23 ^ -416779405);
                  case 2 -> IIlIl(-2138859866, var23 ^ -1281664075);
                  case 3 -> IIlIl(-2138859865, var23 ^ 852294434);
                  case 4 -> IIlIl(-2138859868, var23 ^ 725407964);
                  case 5 -> IIlIl(-2138859867, var23 ^ 1127719848);
                  default -> IIlIl(-2138859870, var23 ^ -1115979371);
               });
               var6++;
               if (var32 == 0) {
                  var10006 = var32;
                  var10005 = var10002;
                  var10004 = var32;
               } else {
                  if (var27 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var32;
                  var10006 = var6;
               }
            }
         }

         String var34 = new String(var10002).intern();
         byte var29 = -1;
         var5[var3++] = var34;
         if ((var0 += var1) >= var4) {
            II = var5;
            Il = new String[2];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public static String IIIll(String var0, int var1) {
      String var2 = var0 != null && !var0.isBlank()
         ? var0.trim()
         : IlIIllIII.lI(III(IIlIl(-2138859869, -2093766202 ^ 1386551250), IIlIl(-2138859872, -2093766202 ^ -1832603739)));
      int var4 = Math.max(1, var1);
      return var2 + var4;
   }

   public static String[] IIlII() {
      return ll;
   }
}
