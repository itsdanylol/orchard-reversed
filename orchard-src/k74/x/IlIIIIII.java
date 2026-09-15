package k74.x;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;
import net.minecraft.class_2817;
import net.minecraft.class_310;
import net.minecraft.class_8709;
import net.minecraft.class_8710;
import net.minecraft.class_9091;

@Environment(EnvType.CLIENT)
public final class IlIIIIII {
   private static final IIIlIlIl I;
   private static final int[] IIIl;
   private static final Object[] IIll;
   private static final IIIlIlIl II;
   private static final int Il = 16;
   private static final AtomicInteger lI;
   private static final long ll = 2500L;
   private static final IIIlIlIl III;
   private static final IIIlIlIl IIl;
   private static final String[] IlI;
   private static final String[] Ill;
   private static final byte[][] lII;
   private static final int lIl = 4;
   private static final ExecutorService llI;
   private static final String[] IIlI;
   private static final Set<UUID> l;
   private static final Map<String, Long> lll;
   private static final int IIII = 100000;

   public static boolean I(String var0) {
      try {
         if (var0 == null) {
            return false;
         }
      } catch (MatchException var10) {
         throw lIIl(var10);
      }

      try {
         if (var0.startsWith(IlIIllIII.lI(l(IIlII(389092718, -341099557 ^ 756074077), IIlII(389092719, -341099557 ^ -642968875))))) {
            return true;
         }
      } catch (MatchException var6) {
         throw lIIl(var6);
      }

      try {
         if (lII.length == 0) {
            return false;
         }
      } catch (MatchException var9) {
         throw lIIl(var9);
      }

      byte[] var1 = IIl(var0);

      try {
         if (var1 == null) {
            return false;
         }
      } catch (MatchException var8) {
         throw lIIl(var8);
      }

      int var2 = 0;
      int var3 = lII.length - 1;

      while (var2 <= var3) {
         int var4 = var2 + var3 >>> 1;
         int var5 = IIIll(lII[var4], var1);

         try {
            if (var5 == 0) {
               return true;
            }
         } catch (MatchException var7) {
            throw lIIl(var7);
         }

         if (var5 < 0) {
            var2 = var4 + 1;
         } else {
            var3 = var4 - 1;
         }
      }

      return false;
   }

   private static String l(int var0, int var1) {
      int var9 = -857823759;
      int var2 = (var0 ^ IIlII(389092716, var9 ^ 529772676)) & IIlII(389092717, var9 ^ 1479088597);
      if (IlI[var2] == null) {
         char[] var3 = Ill[var2].toCharArray();

         int var4 = switch (var3[0] & IIlII(389092714, var9 ^ 1003906396)) {
            case 0 -> IIlII(389092715, var9 ^ -2033990692);
            case 1 -> IIlII(389092712, var9 ^ 372447339);
            case 2 -> IIlII(389092713, var9 ^ 1892893652);
            case 3 -> IIlII(389092710, var9 ^ 188982894);
            case 4 -> IIlII(389092711, var9 ^ 789049430);
            case 5 -> IIlII(389092708, var9 ^ -820444052);
            case 6 -> IIlII(389092709, var9 ^ -814272049);
            case 7 -> IIlII(389092706, var9 ^ 742126571);
            case 8 -> IIlII(389092707, var9 ^ -925751501);
            case 9 -> IIlII(389092704, var9 ^ -1193142268);
            case 10 -> IIlII(389092705, var9 ^ 1469026214);
            case 11 -> IIlII(389092734, var9 ^ 2088512073);
            case 12 -> 1;
            case 13 -> IIlII(389092735, var9 ^ 1867629167);
            case 14 -> IIlII(389092732, var9 ^ -339472455);
            case 15 -> IIlII(389092733, var9 ^ 1850846426);
            case 16 -> IIlII(389092730, var9 ^ 1995995847);
            case 17 -> IIlII(389092731, var9 ^ 1219679866);
            case 18 -> IIlII(389092728, var9 ^ -1350569036);
            case 19 -> IIlII(389092729, var9 ^ -257911897);
            case 20 -> IIlII(389092726, var9 ^ 1273539911);
            case 21 -> IIlII(389092727, var9 ^ 1749289832);
            case 22 -> IIlII(389092724, var9 ^ 1781601939);
            case 23 -> IIlII(389092725, var9 ^ -1143305520);
            case 24 -> IIlII(389092722, var9 ^ 148230098);
            case 25 -> IIlII(389092723, var9 ^ 865530054);
            case 26 -> IIlII(389092720, var9 ^ 502909074);
            case 27 -> IIlII(389092721, var9 ^ -1505106143);
            case 28 -> IIlII(389092686, var9 ^ 1404160308);
            case 29 -> IIlII(389092687, var9 ^ 5714985);
            case 30 -> IIlII(389092684, var9 ^ 905924906);
            case 31 -> IIlII(389092685, var9 ^ -1526856319);
            case 32 -> IIlII(389092682, var9 ^ 1167014543);
            case 33 -> IIlII(389092683, var9 ^ -1132742410);
            case 34 -> IIlII(389092680, var9 ^ -1613723624);
            case 35 -> IIlII(389092681, var9 ^ 342939830);
            case 36 -> IIlII(389092678, var9 ^ 523070587);
            case 37 -> IIlII(389092679, var9 ^ 1581478946);
            case 38 -> IIlII(389092676, var9 ^ 857887420);
            case 39 -> IIlII(389092677, var9 ^ -1410918373);
            case 40 -> IIlII(389092674, var9 ^ 1150523119);
            case 41 -> IIlII(389092675, var9 ^ -1266784761);
            case 42 -> IIlII(389092672, var9 ^ 1618669811);
            case 43 -> IIlII(389092673, var9 ^ -218589308);
            case 44 -> IIlII(389092702, var9 ^ 1885075600);
            case 45 -> IIlII(389092703, var9 ^ 1745615222);
            case 46 -> IIlII(389092700, var9 ^ -1160383535);
            case 47 -> IIlII(389092701, var9 ^ -968383448);
            case 48 -> IIlII(389092698, var9 ^ -1007526283);
            case 49 -> IIlII(389092699, var9 ^ 1480198751);
            case 50 -> IIlII(389092696, var9 ^ 1267585276);
            case 51 -> IIlII(389092697, var9 ^ 574900593);
            case 52 -> IIlII(389092694, var9 ^ 904074402);
            case 53 -> IIlII(389092695, var9 ^ 911212823);
            case 54 -> IIlII(389092692, var9 ^ 1794023884);
            case 55 -> IIlII(389092693, var9 ^ 1509596142);
            case 56 -> IIlII(389092690, var9 ^ -2032199936);
            case 57 -> IIlII(389092691, var9 ^ 1276215922);
            case 58 -> IIlII(389092688, var9 ^ 1932077591);
            case 59 -> IIlII(389092689, var9 ^ 1115222190);
            case 60 -> IIlII(389092654, var9 ^ 1786788689);
            case 61 -> IIlII(389092655, var9 ^ 1006750998);
            case 62 -> IIlII(389092652, var9 ^ -37589002);
            case 63 -> IIlII(389092653, var9 ^ 617724220);
            case 64 -> 4;
            case 65 -> IIlII(389092650, var9 ^ 1196773411);
            case 66 -> IIlII(389092651, var9 ^ -844756433);
            case 67 -> IIlII(389092648, var9 ^ -1493317580);
            case 68 -> IIlII(389092649, var9 ^ 1523759779);
            case 69 -> IIlII(389092646, var9 ^ -1881843176);
            case 70 -> IIlII(389092647, var9 ^ -2083372102);
            case 71 -> IIlII(389092644, var9 ^ -779370819);
            case 72 -> IIlII(389092645, var9 ^ -2081336987);
            case 73 -> IIlII(389092642, var9 ^ -1714472099);
            case 74 -> IIlII(389092643, var9 ^ -1714678048);
            case 75 -> IIlII(389092640, var9 ^ 1019630297);
            case 76 -> IIlII(389092641, var9 ^ 475176033);
            case 77 -> IIlII(389092670, var9 ^ -1380445319);
            case 78 -> IIlII(389092671, var9 ^ 399594634);
            case 79 -> IIlII(389092668, var9 ^ -1829760219);
            case 80 -> IIlII(389092669, var9 ^ -626097127);
            case 81 -> IIlII(389092666, var9 ^ 445742389);
            case 82 -> IIlII(389092667, var9 ^ 413163626);
            case 83 -> IIlII(389092664, var9 ^ 25479518);
            case 84 -> IIlII(389092665, var9 ^ -1994730013);
            case 85 -> IIlII(389092662, var9 ^ -1019740343);
            case 86 -> IIlII(389092663, var9 ^ 1391254567);
            case 87 -> IIlII(389092660, var9 ^ -215956576);
            case 88 -> IIlII(389092661, var9 ^ -1862666709);
            case 89 -> IIlII(389092658, var9 ^ -685617605);
            case 90 -> IIlII(389092659, var9 ^ 160522504);
            case 91 -> IIlII(389092656, var9 ^ 1183281963);
            case 92 -> IIlII(389092657, var9 ^ -905677370);
            case 93 -> IIlII(389092622, var9 ^ 627481203);
            case 94 -> IIlII(389092623, var9 ^ -1048488679);
            case 95 -> IIlII(389092620, var9 ^ 941063996);
            case 96 -> IIlII(389092621, var9 ^ -1026705392);
            case 97 -> IIlII(389092618, var9 ^ 268656717);
            case 98 -> IIlII(389092619, var9 ^ -17418592);
            case 99 -> IIlII(389092616, var9 ^ -2078782471);
            case 100 -> IIlII(389092617, var9 ^ -1317314147);
            case 101 -> 3;
            case 102 -> IIlII(389092614, var9 ^ 843296322);
            case 103 -> IIlII(389092615, var9 ^ 2030084469);
            case 104 -> IIlII(389092612, var9 ^ 144738013);
            case 105 -> IIlII(389092613, var9 ^ 640468606);
            case 106 -> IIlII(389092610, var9 ^ -807224720);
            case 107 -> IIlII(389092611, var9 ^ 1619540347);
            case 108 -> IIlII(389092608, var9 ^ 301765545);
            case 109 -> IIlII(389092609, var9 ^ -1471129110);
            case 110 -> IIlII(389092638, var9 ^ -163865165);
            case 111 -> IIlII(389092639, var9 ^ 569415495);
            case 112 -> IIlII(389092636, var9 ^ 1799457569);
            case 113 -> IIlII(389092637, var9 ^ -120703413);
            case 114 -> IIlII(389092634, var9 ^ -783567712);
            case 115 -> IIlII(389092635, var9 ^ -235248898);
            case 116 -> IIlII(389092632, var9 ^ -1627807155);
            case 117 -> IIlII(389092633, var9 ^ -1728409222);
            case 118 -> IIlII(389092630, var9 ^ 1802769779);
            case 119 -> IIlII(389092631, var9 ^ 682617095);
            case 120 -> IIlII(389092628, var9 ^ 385341956);
            case 121 -> IIlII(389092629, var9 ^ 1072599256);
            case 122 -> IIlII(389092626, var9 ^ -2135541091);
            case 123 -> IIlII(389092627, var9 ^ -1684157323);
            case 124 -> IIlII(389092624, var9 ^ -2093418150);
            case 125 -> IIlII(389092625, var9 ^ -1209464087);
            case 126 -> IIlII(389092846, var9 ^ -293815756);
            case 127 -> IIlII(389092847, var9 ^ -1378301288);
            case 128 -> IIlII(389092844, var9 ^ -2085120688);
            case 129 -> IIlII(389092845, var9 ^ 762610917);
            case 130 -> IIlII(389092842, var9 ^ 1990905869);
            case 131 -> IIlII(389092843, var9 ^ -403781657);
            case 132 -> IIlII(389092840, var9 ^ -2096644591);
            case 133 -> IIlII(389092841, var9 ^ 457099579);
            case 134 -> IIlII(389092838, var9 ^ 2043668451);
            case 135 -> IIlII(389092839, var9 ^ 976230881);
            case 136 -> IIlII(389092836, var9 ^ -1863047526);
            case 137 -> IIlII(389092837, var9 ^ -1440994362);
            case 138 -> IIlII(389092834, var9 ^ -174769314);
            case 139 -> IIlII(389092835, var9 ^ 1606767290);
            case 140 -> IIlII(389092832, var9 ^ -657778114);
            case 141 -> IIlII(389092833, var9 ^ -1945599075);
            case 142 -> IIlII(389092862, var9 ^ 2062566735);
            case 143 -> IIlII(389092863, var9 ^ -900431456);
            case 144 -> IIlII(389092860, var9 ^ -1310961745);
            case 145 -> IIlII(389092861, var9 ^ -2074274026);
            case 146 -> IIlII(389092858, var9 ^ -1280140749);
            case 147 -> IIlII(389092859, var9 ^ -361203052);
            case 148 -> IIlII(389092856, var9 ^ 777409854);
            case 149 -> IIlII(389092857, var9 ^ 1076822697);
            case 150 -> IIlII(389092854, var9 ^ 1852062234);
            case 151 -> IIlII(389092855, var9 ^ 916716807);
            case 152 -> IIlII(389092852, var9 ^ -1589299852);
            case 153 -> IIlII(389092853, var9 ^ -1662319625);
            case 154 -> IIlII(389092850, var9 ^ 1303097332);
            case 155 -> IIlII(389092851, var9 ^ 349284103);
            case 156 -> IIlII(389092848, var9 ^ 1975039643);
            case 157 -> IIlII(389092849, var9 ^ -1170724034);
            case 158 -> IIlII(389092814, var9 ^ -1013812305);
            case 159 -> 5;
            case 160 -> IIlII(389092815, var9 ^ -887867017);
            case 161 -> IIlII(389092812, var9 ^ -1516969554);
            case 162 -> IIlII(389092813, var9 ^ 722345680);
            case 163 -> IIlII(389092810, var9 ^ -782579580);
            case 164 -> IIlII(389092811, var9 ^ -1011880629);
            case 165 -> IIlII(389092808, var9 ^ 1561016869);
            case 166 -> IIlII(389092809, var9 ^ 1039177311);
            case 167 -> IIlII(389092806, var9 ^ 303608060);
            case 168 -> IIlII(389092807, var9 ^ -2021322359);
            case 169 -> IIlII(389092804, var9 ^ 942103440);
            case 170 -> IIlII(389092805, var9 ^ -108633762);
            case 171 -> IIlII(389092802, var9 ^ -33167604);
            case 172 -> IIlII(389092803, var9 ^ -145887472);
            case 173 -> IIlII(389092800, var9 ^ 74343314);
            case 174 -> IIlII(389092801, var9 ^ 1242197328);
            case 175 -> IIlII(389092830, var9 ^ -56927891);
            case 176 -> IIlII(389092831, var9 ^ -181702179);
            case 177 -> IIlII(389092828, var9 ^ -591330466);
            case 178 -> IIlII(389092829, var9 ^ -1578543749);
            case 179 -> IIlII(389092826, var9 ^ 1530415272);
            case 180 -> IIlII(389092827, var9 ^ 1704357912);
            case 181 -> IIlII(389092824, var9 ^ -1503250848);
            case 182 -> IIlII(389092825, var9 ^ 2088442249);
            case 183 -> 0;
            case 184 -> IIlII(389092822, var9 ^ 733926200);
            case 185 -> IIlII(389092823, var9 ^ -1956564033);
            case 186 -> IIlII(389092820, var9 ^ 742086055);
            case 187 -> IIlII(389092821, var9 ^ 1776879056);
            case 188 -> IIlII(389092818, var9 ^ -1130719931);
            case 189 -> IIlII(389092819, var9 ^ 1548557926);
            case 190 -> IIlII(389092816, var9 ^ -1598863167);
            case 191 -> IIlII(389092817, var9 ^ 797148141);
            case 192 -> 2;
            case 193 -> IIlII(389092782, var9 ^ 687948202);
            case 194 -> IIlII(389092783, var9 ^ -409877062);
            case 195 -> IIlII(389092780, var9 ^ 1743425058);
            case 196 -> IIlII(389092781, var9 ^ -1085557037);
            case 197 -> IIlII(389092778, var9 ^ -696013029);
            case 198 -> IIlII(389092779, var9 ^ -1850097050);
            case 199 -> IIlII(389092776, var9 ^ -830689215);
            case 200 -> IIlII(389092777, var9 ^ -1289692855);
            case 201 -> IIlII(389092774, var9 ^ -40905064);
            case 202 -> IIlII(389092775, var9 ^ -1366049092);
            case 203 -> IIlII(389092772, var9 ^ -713069133);
            case 204 -> IIlII(389092773, var9 ^ -1390611662);
            case 205 -> IIlII(389092770, var9 ^ 2134290975);
            case 206 -> IIlII(389092771, var9 ^ -402492179);
            case 207 -> IIlII(389092768, var9 ^ 1879510369);
            case 208 -> IIlII(389092769, var9 ^ -1006974117);
            case 209 -> IIlII(389092798, var9 ^ 1040521354);
            case 210 -> IIlII(389092799, var9 ^ -2074589841);
            case 211 -> IIlII(389092796, var9 ^ -637313708);
            case 212 -> IIlII(389092797, var9 ^ -637741256);
            case 213 -> IIlII(389092794, var9 ^ 1472172944);
            case 214 -> IIlII(389092795, var9 ^ -665400298);
            case 215 -> IIlII(389092792, var9 ^ 327687753);
            case 216 -> IIlII(389092793, var9 ^ -2116789343);
            case 217 -> IIlII(389092790, var9 ^ -1358043407);
            case 218 -> IIlII(389092791, var9 ^ 1412117743);
            case 219 -> IIlII(389092788, var9 ^ 1962270809);
            case 220 -> IIlII(389092789, var9 ^ 1978534757);
            case 221 -> IIlII(389092786, var9 ^ 2097762792);
            case 222 -> IIlII(389092787, var9 ^ 2069532272);
            case 223 -> IIlII(389092784, var9 ^ 868057529);
            case 224 -> IIlII(389092785, var9 ^ -240158819);
            case 225 -> IIlII(389092750, var9 ^ 1281220591);
            case 226 -> IIlII(389092751, var9 ^ -2031614764);
            case 227 -> IIlII(389092748, var9 ^ -901672091);
            case 228 -> IIlII(389092749, var9 ^ -484629007);
            case 229 -> IIlII(389092746, var9 ^ 404213337);
            case 230 -> IIlII(389092747, var9 ^ 1450688103);
            case 231 -> IIlII(389092744, var9 ^ 1741463077);
            case 232 -> IIlII(389092745, var9 ^ -761782558);
            case 233 -> IIlII(389092742, var9 ^ 155702344);
            case 234 -> IIlII(389092743, var9 ^ 1231511372);
            case 235 -> IIlII(389092740, var9 ^ -131629030);
            case 236 -> IIlII(389092741, var9 ^ -1274682228);
            case 237 -> IIlII(389092738, var9 ^ 1346147878);
            case 238 -> IIlII(389092739, var9 ^ -1287037071);
            case 239 -> IIlII(389092736, var9 ^ -424830786);
            case 240 -> IIlII(389092737, var9 ^ -1756498551);
            case 241 -> IIlII(389092766, var9 ^ -956677039);
            case 242 -> IIlII(389092767, var9 ^ -196186873);
            case 243 -> IIlII(389092764, var9 ^ -2104784813);
            case 244 -> IIlII(389092765, var9 ^ 259309882);
            case 245 -> IIlII(389092762, var9 ^ -331709706);
            case 246 -> IIlII(389092763, var9 ^ 905251024);
            case 247 -> IIlII(389092760, var9 ^ 792749656);
            case 248 -> IIlII(389092761, var9 ^ -1905704355);
            case 249 -> IIlII(389092758, var9 ^ 213580975);
            case 250 -> IIlII(389092759, var9 ^ 1801324718);
            case 251 -> IIlII(389092756, var9 ^ -168046904);
            case 252 -> IIlII(389092757, var9 ^ -1444422756);
            case 253 -> IIlII(389092754, var9 ^ -2055832543);
            case 254 -> IIlII(389092755, var9 ^ -2059387775);
            default -> IIlII(389092752, var9 ^ 985955486);
         };
         int var5 = (var1 & IIlII(389092753, var9 ^ -71074957)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIlII(389092462, var9 ^ -198751843)) >>> IIlII(389092463, var9 ^ 957102471)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIlII(389092460, var9 ^ 1061640860);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIlII(389092461, var9 ^ -1929057594);
            }
         }

         IlI[var2] = new String(var3).intern();
      }

      return IlI[var2];
   }

   private static void II(Consumer param0, Boolean param1, Throwable param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IlIIIIII.lI Ljava/util/concurrent/atomic/AtomicInteger;
      // 03: invokevirtual java/util/concurrent/atomic/AtomicInteger.decrementAndGet ()I
      // 06: pop
      // 07: aload 0
      // 08: aload 2
      // 09: ifnonnull 25
      // 0c: getstatic java/lang/Boolean.TRUE Ljava/lang/Boolean;
      // 0f: aload 1
      // 10: invokevirtual java/lang/Boolean.equals (Ljava/lang/Object;)Z
      // 13: ifeq 25
      // 16: goto 1d
      // 19: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: goto 26
      // 21: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 24: athrow
      // 25: bipush 0
      // 26: invokestatic java/lang/Boolean.valueOf (Z)Ljava/lang/Boolean;
      // 29: invokeinterface java/util/function/Consumer.accept (Ljava/lang/Object;)V 2
      // 2e: return
   }

   private static Boolean Il(llIII var0) {
      return IlII(var0.I());
   }

   public static void lI(class_2596<?> param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w -1963098458
      // 003: istore 13
      // 005: invokestatic k74/x/llIllIlI.IIlII ()[Ljava/lang/String;
      // 008: astore 1
      // 009: aload 0
      // 00a: ifnonnull 012
      // 00d: return
      // 00e: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 011: athrow
      // 012: aload 0
      // 013: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 018: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 01b: astore 2
      // 01c: aload 0
      // 01d: instanceof net/minecraft/class_2817
      // 020: ifeq 0f7
      // 023: aload 0
      // 024: checkcast net/minecraft/class_2817
      // 027: astore 3
      // 028: aload 3
      // 029: invokevirtual net/minecraft/class_2817.comp_1647 ()Lnet/minecraft/class_8710;
      // 02c: astore 6
      // 02e: aload 6
      // 030: instanceof net/minecraft/class_8709
      // 033: ifeq 0a4
      // 036: aload 6
      // 038: checkcast net/minecraft/class_8709
      // 03b: astore 5
      // 03d: ldc_w 389092458
      // 040: iload 13
      // 042: ldc_w 2009951591
      // 045: ixor
      // 046: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 049: ldc_w 389092459
      // 04c: iload 13
      // 04e: ldc_w -2136837088
      // 051: ixor
      // 052: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 055: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 058: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 05b: aload 5
      // 05d: invokevirtual net/minecraft/class_8709.comp_1677 ()Ljava/lang/String;
      // 060: ldc_w 389092456
      // 063: iload 13
      // 065: ldc_w 1536333153
      // 068: ixor
      // 069: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 06c: ldc_w 389092457
      // 06f: iload 13
      // 071: ldc_w 297070452
      // 074: ixor
      // 075: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 078: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 07b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 07e: astore 9
      // 080: astore 8
      // 082: astore 7
      // 084: new java/lang/StringBuilder
      // 087: dup
      // 088: invokespecial java/lang/StringBuilder.<init> ()V
      // 08b: aload 7
      // 08d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 090: aload 8
      // 092: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 095: aload 9
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 09a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 09d: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 0a0: aload 1
      // 0a1: ifnonnull 249
      // 0a4: ldc_w 389092454
      // 0a7: iload 13
      // 0a9: ldc_w -1900614513
      // 0ac: ixor
      // 0ad: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0b0: ldc_w 389092455
      // 0b3: iload 13
      // 0b5: ldc_w -1274030176
      // 0b8: ixor
      // 0b9: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0bc: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 0bf: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0c2: aload 3
      // 0c3: invokevirtual net/minecraft/class_2817.comp_1647 ()Lnet/minecraft/class_8710;
      // 0c6: invokeinterface net/minecraft/class_8710.method_56479 ()Lnet/minecraft/class_8710$class_9154; 1
      // 0cb: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 0ce: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 0d1: astore 9
      // 0d3: astore 8
      // 0d5: new java/lang/StringBuilder
      // 0d8: dup
      // 0d9: invokespecial java/lang/StringBuilder.<init> ()V
      // 0dc: aload 8
      // 0de: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e1: aload 9
      // 0e3: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 0e6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0e9: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 0ec: aload 1
      // 0ed: ifnonnull 249
      // 0f0: goto 0f7
      // 0f3: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f6: athrow
      // 0f7: aload 0
      // 0f8: instanceof net/minecraft/class_9091
      // 0fb: ifeq 184
      // 0fe: goto 105
      // 101: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 104: athrow
      // 105: aload 0
      // 106: checkcast net/minecraft/class_9091
      // 109: astore 4
      // 10b: ldc_w 389092452
      // 10e: iload 13
      // 110: ldc_w 1029761836
      // 113: ixor
      // 114: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 117: ldc_w 389092453
      // 11a: iload 13
      // 11c: ldc_w 935741303
      // 11f: ixor
      // 120: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 123: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 126: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 129: aload 4
      // 12b: invokevirtual net/minecraft/class_9091.comp_2195 ()Lnet/minecraft/class_2960;
      // 12e: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 131: ldc_w 389092450
      // 134: iload 13
      // 136: ldc_w -343483031
      // 139: ixor
      // 13a: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 13d: ldc_w 389092451
      // 140: iload 13
      // 142: ldc_w -893736765
      // 145: ixor
      // 146: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 149: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 14c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 14f: aload 4
      // 151: invokevirtual net/minecraft/class_9091.comp_2196 ()[B
      // 154: invokestatic k74/x/IlllI.IllII ([B)Ljava/lang/String;
      // 157: astore 12
      // 159: astore 11
      // 15b: astore 10
      // 15d: astore 9
      // 15f: new java/lang/StringBuilder
      // 162: dup
      // 163: invokespecial java/lang/StringBuilder.<init> ()V
      // 166: aload 9
      // 168: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 16b: aload 10
      // 16d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 170: aload 11
      // 172: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 175: aload 12
      // 177: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 17a: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 17d: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 180: aload 1
      // 181: ifnonnull 249
      // 184: aload 2
      // 185: ldc_w 389092448
      // 188: iload 13
      // 18a: ldc_w 110108295
      // 18d: ixor
      // 18e: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 191: ldc_w 389092449
      // 194: iload 13
      // 196: ldc_w 2078534500
      // 199: ixor
      // 19a: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 19d: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 1a0: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1a3: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1a6: ifne 208
      // 1a9: goto 1b0
      // 1ac: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1af: athrow
      // 1b0: aload 2
      // 1b1: ldc_w 389092478
      // 1b4: iload 13
      // 1b6: ldc_w 852096286
      // 1b9: ixor
      // 1ba: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 1bd: ldc_w 389092479
      // 1c0: iload 13
      // 1c2: ldc_w 1745443561
      // 1c5: ixor
      // 1c6: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 1c9: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 1cc: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1cf: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1d2: ifne 208
      // 1d5: goto 1dc
      // 1d8: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1db: athrow
      // 1dc: aload 2
      // 1dd: ldc_w 389092476
      // 1e0: iload 13
      // 1e2: ldc_w -1380596489
      // 1e5: ixor
      // 1e6: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 1e9: ldc_w 389092477
      // 1ec: iload 13
      // 1ee: ldc_w 653595641
      // 1f1: ixor
      // 1f2: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 1f5: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 1f8: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1fb: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 1fe: ifeq 249
      // 201: goto 208
      // 204: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 207: athrow
      // 208: ldc_w 389092474
      // 20b: iload 13
      // 20d: ldc_w 297743324
      // 210: ixor
      // 211: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 214: ldc_w 389092475
      // 217: iload 13
      // 219: ldc_w -90199308
      // 21c: ixor
      // 21d: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 220: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 223: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 226: aload 2
      // 227: astore 11
      // 229: astore 10
      // 22b: new java/lang/StringBuilder
      // 22e: dup
      // 22f: invokespecial java/lang/StringBuilder.<init> ()V
      // 232: aload 10
      // 234: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 237: aload 11
      // 239: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 23c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 23f: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 242: goto 249
      // 245: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 248: athrow
      // 249: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -2111895532;
      String var8 = "㐏㑱㓎㐆㒹㒓㑮㐷㑜㐾㑛㐶㓆㓍㓖㑟㒭㑍㓢㓲㑎㓩㑊㒁㑓㑄㒞㑍㒻㓄㐪㒌㒗㒦㐓㐱㒹㒈㑗㑋㒃㒠㑷㑨㐫㑗㐯㒢㑧㐜㓐㒳㒭㓷㒺㓺㐗㑅㒕㒏㑧㑹㓪㓖㐷㑞㑒㒴㒦㓋㓐㓚㐚㐈㐕㒵㑙㒭㓠㓡㓤㓄㑒㒔㑃㓂㓒㓛㑐㐉㐒㓞㓋㑖㐱㒋㓓㐑㑬㐳㒥㒄㐲㒡㐏㒺㐶㓋㐝㒙㓠㐬㐍㐄㒤㓄㑙㑫㓭㒉㓡㓢㑺㒳㒥㓩㓷㓜㑎㒳㒫㓥㒢㐮㒥㑫㓢㒈㒻㑬㑄㒆㓁㒧㐡㒒㓖㐳㓚㐂㒏㓏㐛㒝㒕㓱㓺㑫㓸㐍㑌㑵㐼㑓㑷㐽㒿㑿㒰㑜㑓㓳㐶㓐㐜㒺㓓㑬㒧㑏㑟㒇㓺㑦㐵㒖㓔㓶㓿㒩㒈㒎㒳㓗㑮㐓㒃㒍㓰㓷㐣㑕㑾㐭㓊㑴㓆㐹㓹㑍㒶㓾㒹㐓㐔㑺㐖㓥㓌㐖㐮㐩㓭㐒㐷㐞㑁㑾㐻㑫㑞㑡㒲㓭㑭㐐㑳㓥㑃㑈㓈㑪㓄㒢㒫㓲㑧㐺㓬㓍㒿㓂㐠㒒㒠㑞㑾㐒㒾㓪㓽㐽㑥㐛㓧㐖㓽㓮㒟㓭㐤㓄㑛㑚㐄㒩㐬㓼㑷㐊㐱㒪㐗㓊㐛㒀㐎㑸㐪㐕㓈㒻㑶㐭㐷㐥㐼㑥㑼㓃㐙㑿㓦㐻㑸㐈㐕㒁㒕㒼㒖㒈㑁㓱㑠㓉㐢㐁㓎㓘㒐㑳㐝㑏㒔㑳㑏㓢㓏㑔㓑㐵㒇㒀㑁㑓㐭㑺㒤㒉㒶㐈㑖㓬㐟㑗㑺㒬㒆㑹㑭㒘㓒㐓㓊㒫㐎㑞㐖㑡㓒㒶㒮㒞㑪㐺㑏㓜㒻㓳㒬㓇㓫㐵㐯㐗㓨㒴㐒㐁㒥㐣㒾㑾㑄㑨㑱㐊㐺㒋㑪㑱㐽㓡㑡㒘㑃㐻㑯㑹㒚㐇㑯㓯㒲㓧㐼㑯㓵㒘㓤㓗㓧㑰㓅㑐㓃㐔㐼㐆㑜㑽㑿㑞㐓㐭㒌㑑㓧㐛㓈㐢㒱㒝㑞㓫㐱㒼㑁㑀㓸㒳㓂㑌㒷㑀㓑㑲㐇㓳㑟㓔㑩㐙㐵㐱㒩㑗㒣㑾㒥㑝㑀㑐㐸㒫㒩㐓㐅㐍㒞㐛㐾㒜㑘㒠㓖㑍㓖㓍㑹㓓㑼㐑㐋㐞㓰㑠㒕㑗㓘㒆㐟㑒㓙㒉㑖㐒㐫㑻㐎㒂㐹㒆㑥㓅㐀㑌㓼㒨㒉㐗㑏㐟㐶㐣㑅㐶㒲㒡㐩㓇㓬㐂㒥㒻㓿㐼㓔㓸㑸㓗㓝㐕㐣㒠㓡㒛㒣㓏㑭㓪㒟㐊㑠㑅㓆㓸㓄㑏㑨㓾㒸㐧㓗㓉㓎㐾㑶㑃㑳㐇㒌㑸㐋㓾㓤㒐㒷㑘㒥㒯㐇㐓㒋㐙㐰㒰㒙㒗㐛㑟㒢㒗㐬㐲㒻㑚㐮㐳㒦㓃㐬㐝㑷㒾㐔㓫㐟㐑㑺㑖㑜㐠㐆㓙㑣㑧㑍㑰㐜㒔㒕㑜㒐㒂㐆㓃㒓㒯㑱㐂㐵㐷㑧㒷㓝㐡㑿㒏㑄㑣㓫㑩㓽㒖㒻㓈㓢㒧㓨㑦㒢㐚㓯㑹㓦㒷㐚㑦㒵㓴㐂㑼㑯㑙㐦㒔㓏㓐㒞㑢㒿㑚㑑㑏㒃㓃㒬㓕㐺㒨㐛㓀㐭㒾㓕㑪㑻㒹㐑㓇㓄㑤㑡㓆㒇㓩㒿㑡㒅㓫㐔㑴㒚㑆㑒㐈㐈㐇㑐㓉㓬㒾㐀㒮㓽㑡㓧㑋㒑㒭㐯㐁㑑㐠㐗㐳㑦㒞㑚㑭㒇㒑㓳㓖㐃㒇㑂㓴㑑㑍㒽㐀㒑㓕㒽㐾㒁㒆㐙㐶㓸㑒㑯㐃㐄㐩㑤㓿㐉㐯㑧㑎㒓㐵㑔㐻㒲㓕㒈㓪㓰㐑㑌㒨㐎㓎㑔㑆㓑㓜㐬㑢㑷㐳㓭㓓㓎㓆㒶㓎㐊㑄㑔㓘㐿㑭㑘㑷㒞㒤㐌㓂㓩㓐㐖㐯㑧㒋㒛㒘㐢㑺㐽㐊㓫㐑㑜㒋㑇㑊㐇㐋㒶㓼㒫㓛㑖㒦㑸㐦㒋㑑㒰㐧㐡㓁㑜㓼㒓㒾㒃㓇㓘㒏㓀㒲㐦㐣㐰㐎㓘㑧㓍㐤㑾㓿㒚㐼㐗㒃㐄㒠㐮㓴㒱㑄㑴㓭㐱㑖㓨㐃㒷㐯㐐㑌㑿㓐㑛㑬㑵㓺㒐㑽㐣㒙㓒㓣㒲㑼㒦㓾㓜㓍㒐㑤㑯㑼㐵㐷㒽㐀㐡㒘㒚㒖㓚㒑㐅㓼㒟㐶㒋㓻㑝㐓㓇㐿㓦㐰㒴㓋㐶㓍㐇㑈㐑㑌㑉㑦㒩㓥㒢㓏㓜㑤㒅㓭㑂㒾㐁㒬㐜㑎㑱㐭㑸㒂㐌㐂㐨㑕㐼㑼㒼㐿㑧㒭㒈㐈㑃㓃㑕㑍㐻㓸㐬㐤㑛㐌㐪㑚㑘㑺㒧㐫㑤㐬㐔㑤㐋㐄㐀㓒㒷㑝㓒㓔㓫㒈㐅㒞㒌㑡㒽㑀㒶㐒㐓㓙㑴㑺㑍㓺㐩㒲㑌㓻㒊㑊㑈㓈㑋㓥㑎㓡㐪㓷㒬㐁㑝㒻㐹㓛㑩㒭㓒㒻㑛㓢㓹㑲㑤㓵㑥㐞㒴㐬㒷㒪㐃㑦㒎㐝㓶㑘㒰㐞㒕㒥㐟㓭㐅㒏㑘㒓㐪㓜㑛㒄㐫㐷㑐㐐㒃㑕㑇㑗㓧㒠㒷㒇㐭㐳㒔㓽㓷㐐㒟㐺㓇㑋㓔㐑㐫㒲㒠㑵㑋㐫㓊㐔㒛㓤㓻㒔㒝㑉㒶㐙㓩㑮㓤㓮㐡㓅㓂㐺㐧㓤㒂㒹㒥㐁㑷㒰㑓㓜㒂梌栁棅桭棛棢栰栂梠梔桔桙栥桢栛栰棖梦栵栶梏";
      char[] var9 = "ї\u0015".toCharArray();
      short var7 = 553;
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            IIlI = var10;
            IIll = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            byte[] var10002 = "SQ<\u0002§ï$ F§Ôò\u0001\u001d\u0090\u0090báó\u001eßôUÙO\u0004\u008e=)äÕæRt0)v0fa\u0096.\u0093\u0090\u0096@§\u0099u\feÞ\u0091å±\u0090áÕ\u008e¸\u000e¸\u0019%%K½¶6fT(²ó\u0099\u00047f:e/ÏìÅ\u0011\u0085@óöHe\u0098©\u0097\u0005Ã\u0012ß;õ1s\u009c\u00983\u0006\u0080*âí\u001c\u0015QâYHj¡fôDÎ^òÿ~q¬\n\u0086_hY`¢<lÈÇ$ýÉ\u0093\u0092\u001c¸¬\u0086åL.¥Æç\u001eKMGNXF\u001aúÄ\u0007tâ½j\u0015ÄøòÐ\u008e\u0084\u001d¤\u0000õíIð»9Mg\n«Ï\u0001ª)lní1<oîãâd5\u009fp2\u000e\u009aÅÈ\u008d\u0001\r\u009d»\u0012ºF}{sßÍlÔ\u0082_og\u0096ú3Ù6/\u0000Í\rËßè\u0080Ú\u0015&\u0014x*\u001e¼i\u001bOfñ3·¬óe6[p¤õù9}æ.\u0087\u001ebÆ×\u0094\u0091\u009c\u000bÿÊ^f\u0003å,qÖâÌTÚåÕn\u0088¼(°ÚÆÇeÀø¬ñÀû\u0080\feñÄ\u009dEe\nìô\u008f\u0085 NæÂèËÇ\u0085Ð\u0083\u0099\u0012ÎC¦ërA\u0097ö\u0004X³_9Ð-C£\u009a\u0000iw\u000bÛJ¦ª\u0017U°ÉÎ`,\u008e\u0015ØEP¦÷'\u001f°ä\u0085\u00933ã]|Q\fd\u0098¶Ã¹a é\u0005\u009bú.\u000eI4ö½§Á mÝ/ÝËèL÷àkt9× 77cQ\u0097\u0010\u008a\u007f\u001bP)\u0096Õ,?9¿¯6HË\u0005\u009dñgÏ4¯\f\u000bÎxÇ\u0001B2v\u001dé¡ù 0\u0088|#:¨Íô\u0097ÇÎ4~ÁÍ\u0006ú2C\u0083Íq\u0098\u007fàOÀM\u009ffÙ\u0006hÙ\u0081\u00ad2ÂªZÕÚ\u000fo{îÞ\u009c\f·K-Nôï]ÃÚ\u0080\u0003ltC\u0012À/\u009dFÏ¾ÙQ\u0000Ú0(PB\t_× øqnc\u0007\u008e\u0096ÉÃ±ìó+½\u0014¬¢¬7\u0006òÄ\u0011\u0081ü\u008c~Õ?\u0015Q#ÇÓ\u0088\u0093c\u0017\u001aèëÙ6Ýj\u0081èê\u0085\fã³Oì\u0092waÃh\u0019\u0018\u0094½7S¬åo\u0094k\u0016ør£#ÅÜ\u0095T\u0014\u009c9nMæ1\n,\u008f |ã\u000f½+\u009a¥å¼\u0092#¯¦ü£w\u0003r9\u0089\u0086\u0088m_Ò\u009a\u0098{V\u0004<¬¢dÇ\u0000wK/&ÖÞ²\u00878a\u0010Í\u009f ±÷p§2qÊ®zyü]Yõ,\u0013=ú\u001b¥¬Ï\u0094¬\u001cç}\u0085ö\u0094\u0018øÞÃà\u0002\u000fÞ¥<¡æÜÿQ V%L\u008fvr\u0089D[ÒV¥\u0019u\fÃE0Þ\u0093)å\u00ad\u0003D\u0005z\u0088Ùù\u0084ß\u0097v´\u0015Äp6×Î¾¦SÛ>Ý\u0019\u0011æ| \u0002\u008f´9DÈ\u008eTý\u0097K&ÿê\u0017Oí¤¸@I÷¤) \u008cHû±ô+d\n&\u0001%,±5â\u0082)0\u009aD\u009aÍ]\u0093g2\u008f¶ÝoÓ\u0094\u00834Ë:\u0080ËAÔ\u000e\u0088\u0004\u0096\u0081aZ\tJ¿\u0089fØãÍ:ö:qÃ\r\u001c¢®-Âv±,Ù\u009d\u000b$>Æä\"m\u0018*j\u008a\u0017ø¨\u0098áù\u0015jIÐßß\u0092\u001c\u0093v\u0005Hº*³\u00adA Xa\u000f@)e>û\b§\u008b¯\u0088¨PpB»\u0010PÉ$¡\u0010\u0016óí2rþ\t\u000b\u0001'ê~É\u0012¿\u009a\u000eMÎzb\u009d\u009fÍÒÛ\u00adyû\u008dÛ¼\u001e\u0084VCWçµ\r\u0014\u000elÂ\u009e\u0001vwðË×^ÕIU\u008dj\u00192i\u009eY¬ÌXgðÐMîÜAê´Üwª×cóê£¢ôíÊ\u00ad\u0013ÁÛ`;®ÝfpÍØÔ3}\u0083hÚÓ¹\u009f¶l\u0001D\u0085+g\u000e ü\u0000\u0091¡R¡«\u0018At\"wUù(Ò|?ô\u0091cIÕ\u00ad\u001a\"\u0019\u0087 §dô\u000eí-ÞK1w\u001eÛ%²¢zà9á\u00140\u000e¨\u008dåå\u0088\u0012XÕj\u008b\u009cS^¹ñ0×¦+\u0096\u001c\u008a\u009bö@Ô2þ¤j¢ã1N\t²\u0011\u0017\u0082/·\u0010ó\b§7ãY·ÖO\u0012L·WSqyBSÜH\u0096\u0094{\u009cK.UYTå\u009cIõé[\u009e\u008bX:*/\u001b\u001feôô¡Sã'«VyK\u000eôJ1\u0087ý#\u0081\rôþ_%\u001e¥k]p\ftv©µ\u009aþ%c:íBQHi\\\u0091'ÊÄÝ Þ/]N*¯\u0006ÜnÞÃÖthjD|\u0089U[M¤ô\u0097µs?\"W\u009f«ò\u008ey\u001e7\u0096\u001b|HØ\u0016Èß\u0096\u0016èù>\u0001Ø\\#ÙâNÛ¬x\u0088r\"³U\u009c\u0006\u008b®£å\u008a«ÿ,ùû(\u008dÀõ\u0094Kè\"µåm³\u0019|Õ£qÍ©5Pµ&Ú~\u009e1°\u0007Ü[§Z\u0010\u0085Öò.\u0014Óþ\u0015øKgï\u0014½Þ\u009cû%¤÷Í\u0080\u008ayW:\u0010Ýkvu)\riî\u0011Y9 t\u001e¼\bê\u000f\u009b\u0085\u0015}Ë=®\u0019>\f³;;jÃ¹Ú\u001c;r\u0003o\u0088WÇ\u0014Õ÷/\u0019m\u0080òxb¦ÉWKÀïè¹c§\u001aÚ\u009fþº\u009c\u008a\u009aYæn\u0081î\u009d±ä\u008bÍ\u007f¯Na;\u00ad£Bn/+x6_\u0083»5\u0001¤ÛPó\u001b\u0016ªÊ\n\u000eÁ\u0091\u001d\u0092¢P\u000b\u009e¹£ ñ;ãÜPÒ98e9¤þVùwW\u009f.«\u0000²+\u0093\u0090\u0097²5ó\u0000ÕE|Ô<g³\u001e©¼âO\"\u0089\u0096æ]ÒÃð\u0014\u0098±OÚ"
               .getBytes("ISO-8859-1");
            IIIl = new int[388];

            int var55;
            do {
               IIIl[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -2099591060;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var5 = new String[IIlII(389092419, var18 ^ 644990878)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IIlIl(7144, -377720630, (short)31210, -1555585412, 1376533025, 8525)).length();
            int var1 = IIlII(389092416, var18 ^ -1761882526);
            int var20 = -1;

            label100:
            while (true) {
               var22 = IIlII(389092417, var18 ^ 1221797069);
               String var27 = var2.substring(++var20, var20 + var1);
               byte var39 = -1;

               while (true) {
                  label95: {
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
                           break label95;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % IIlII(389092445, var18 ^ 756775145)) {
                           case 0 -> IIlII(389092442, var18 ^ 1604281904);
                           case 1 -> IIlII(389092443, var18 ^ 809303741);
                           case 2 -> IIlII(389092440, var18 ^ -1222109931);
                           case 3 -> IIlII(389092441, var18 ^ 1507628314);
                           case 4 -> IIlII(389092438, var18 ^ -879172535);
                           case 5 -> IIlII(389092439, var18 ^ -1048423732);
                           default -> IIlII(389092436, var18 ^ 1401598735);
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
                           Ill = var5;
                           IlI = new String[IIlII(389092444, var18 ^ -1928847423)];
                           I = IlIIllIII.Ill(l(IIlII(389092437, var18 ^ 1287154848), IIlII(389092434, var18 ^ -2143080128)));
                           III = IlIIllIII.Ill(l(IIlII(389092435, var18 ^ 899831804), IIlII(389092432, var18 ^ -445107517)));
                           IIl = IlIIllIII.Ill(l(IIlII(389092433, var18 ^ 543413247), IIlII(389092398, var18 ^ 1596734897)));
                           II = IlIIllIII.Ill(l(IIlII(389092399, var18 ^ -932978993), IIlII(389092396, var18 ^ -288856168)));
                           l = ConcurrentHashMap.newKeySet();
                           lll = new ConcurrentHashMap<>();
                           lI = new AtomicInteger();
                           llI = Executors.newFixedThreadPool(2, IlIIIIII::IIIII);
                           lII = lIlI();
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var62;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label100;
                        }

                        var4 = (var2 = IIlIl((short)-32308, -1914246410, (short)2547, -1400734965, 1376533024, (short)-12118)).length();
                        var1 = IIlII(389092446, var18 ^ 2091600570);
                        var20 = -1;
                  }

                  var22 = IIlII(389092447, var18 ^ 1669370829);
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
               short var17 = switch (var16 % 5) {
                  default -> 97;
                  case 1 -> 226;
                  case 2 -> 221;
                  case 3 -> 137;
                  case 4 -> 59;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public static void ll(String var0) {
      try {
         if (IlIl(IlIIllIII.lI(l(IIlII(389092472, -1858434094 ^ -776290263), IIlII(389092473, -1858434094 ^ 1468959875))))) {
            return;
         }
      } catch (MatchException var1) {
         throw lIIl(var1);
      }

      lIl(I, IIl);
   }

   private static int IIlII(int var0, int var1) {
      int var2 = IIIl[var0 ^ 389092718] ^ var1 ^ var0;
      var2 -= 56937;
      var2 -= 48530;
      var2 -= 35051;
      var2 += 50405;
      var2 -= 36906;
      var2 ^= 36978;
      return var2 ^ 28167;
   }

   public static void III(String var0) {
      try {
         if (IlIl(IlIIllIII.lI(l(IIlII(389092470, 1228665945 ^ -335113495), IIlII(389092471, 1228665945 ^ 1254999840))))) {
            return;
         }
      } catch (MatchException var1) {
         throw lIIl(var1);
      }

      lIl(I, III);
   }

   private static byte[] IIl(String var0) {
      try {
         return Arrays.copyOf(
            MessageDigest.getInstance(IlIIllIII.lI(l(IIlII(389092468, 1367902177 ^ 841126732), IIlII(389092469, 1367902177 ^ 986082684))))
               .digest(var0.getBytes(StandardCharsets.UTF_8)),
            IIlII(389092466, 1367902177 ^ 659618662)
         );
      } catch (Exception var2) {
         return null;
      }
   }

   public static String IlI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 888255159
      // 003: istore 3
      // 004: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 007: astore 0
      // 008: aload 0
      // 009: ifnull 10c
      // 00c: aload 0
      // 00d: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 010: ifnull 10c
      // 013: goto 01a
      // 016: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 019: athrow
      // 01a: aload 0
      // 01b: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 01e: invokevirtual k74/x/lIIIlIlI.IIllll ()Lk74/x/IlllI;
      // 021: astore 1
      // 022: aload 1
      // 023: ifnull 03d
      // 026: aload 1
      // 027: invokevirtual k74/x/IlllI.lIllI ()Z
      // 02a: ifeq 03d
      // 02d: goto 034
      // 030: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 033: athrow
      // 034: aload 1
      // 035: invokevirtual k74/x/IlllI.lIIIl ()Ljava/lang/String;
      // 038: areturn
      // 039: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 03c: athrow
      // 03d: aload 0
      // 03e: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 041: invokevirtual k74/x/lIIIlIlI.lllll ()Lk74/x/IIlIIIIll;
      // 044: astore 2
      // 045: aload 2
      // 046: ifnull 10c
      // 049: aload 2
      // 04a: invokevirtual k74/x/IIlIIIIll.IIIIlIl ()Z
      // 04d: ifeq 10c
      // 050: goto 057
      // 053: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: getstatic k74/x/llllIII.I [I
      // 05a: aload 2
      // 05b: invokevirtual k74/x/IIlIIIIll.II ()Lk74/x/lIllIlIl;
      // 05e: invokevirtual k74/x/lIllIlIl.ordinal ()I
      // 061: iaload
      // 062: tableswitch 34 1 4 48 79 110 141
      // 080: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 083: athrow
      // 084: new java/lang/MatchException
      // 087: dup
      // 088: aconst_null
      // 089: aconst_null
      // 08a: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 08d: athrow
      // 08e: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 091: athrow
      // 092: ldc_w 389092467
      // 095: iload 3
      // 096: ldc_w 319448495
      // 099: ixor
      // 09a: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 09d: ldc_w 389092464
      // 0a0: iload 3
      // 0a1: ldc_w -1901072182
      // 0a4: ixor
      // 0a5: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0a8: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 0ab: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0ae: goto 10b
      // 0b1: ldc_w 389092465
      // 0b4: iload 3
      // 0b5: ldc_w -1447279309
      // 0b8: ixor
      // 0b9: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0bc: ldc_w 389092430
      // 0bf: iload 3
      // 0c0: ldc_w -122886340
      // 0c3: ixor
      // 0c4: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0c7: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 0ca: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0cd: goto 10b
      // 0d0: ldc_w 389092431
      // 0d3: iload 3
      // 0d4: ldc_w -1286093504
      // 0d7: ixor
      // 0d8: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0db: ldc_w 389092428
      // 0de: iload 3
      // 0df: ldc_w -227808511
      // 0e2: ixor
      // 0e3: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0e6: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 0e9: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0ec: goto 10b
      // 0ef: ldc_w 389092429
      // 0f2: iload 3
      // 0f3: ldc_w -221824394
      // 0f6: ixor
      // 0f7: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0fa: ldc_w 389092426
      // 0fd: iload 3
      // 0fe: ldc_w 895546694
      // 101: ixor
      // 102: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 105: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 108: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 10b: areturn
      // 10c: ldc_w 389092427
      // 10f: iload 3
      // 110: ldc_w -1890702524
      // 113: ixor
      // 114: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 117: ldc_w 389092424
      // 11a: iload 3
      // 11b: ldc_w 1149716491
      // 11e: ixor
      // 11f: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 122: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 125: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 128: areturn
   }

   static boolean Ill(class_2596<?> param0, boolean param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 2029527128
      // 003: istore 10
      // 005: iload 1
      // 006: ifne 00f
      // 009: bipush 0
      // 00a: ireturn
      // 00b: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 00e: athrow
      // 00f: aload 0
      // 010: instanceof net/minecraft/class_2817
      // 013: ifeq 01e
      // 016: aload 0
      // 017: checkcast net/minecraft/class_2817
      // 01a: astore 2
      // 01b: goto 020
      // 01e: bipush 0
      // 01f: ireturn
      // 020: aload 2
      // 021: invokevirtual net/minecraft/class_2817.comp_1647 ()Lnet/minecraft/class_8710;
      // 024: astore 3
      // 025: aload 3
      // 026: instanceof net/minecraft/class_8709
      // 029: ifne 063
      // 02c: aload 3
      // 02d: invokeinterface net/minecraft/class_8710.method_56479 ()Lnet/minecraft/class_8710$class_9154; 1
      // 032: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 035: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 038: ldc_w 389092425
      // 03b: iload 10
      // 03d: ldc_w 71925329
      // 040: ixor
      // 041: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 044: ldc_w 389092422
      // 047: iload 10
      // 049: ldc_w -1255452268
      // 04c: ixor
      // 04d: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 050: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 053: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 056: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 059: ifeq 069
      // 05c: goto 063
      // 05f: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 062: athrow
      // 063: bipush 0
      // 064: ireturn
      // 065: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 068: athrow
      // 069: aload 3
      // 06a: invokeinterface net/minecraft/class_8710.method_56479 ()Lnet/minecraft/class_8710$class_9154; 1
      // 06f: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 072: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 075: astore 4
      // 077: invokestatic k74/x/IlllI.lIlI ()Z
      // 07a: ifeq 083
      // 07d: bipush 0
      // 07e: ireturn
      // 07f: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 086: astore 5
      // 088: aload 5
      // 08a: ifnull 12b
      // 08d: aload 5
      // 08f: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 092: ifnull 12b
      // 095: goto 09c
      // 098: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09b: athrow
      // 09c: aload 5
      // 09e: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 0a1: invokevirtual k74/x/lIIIlIlI.IIllll ()Lk74/x/IlllI;
      // 0a4: astore 6
      // 0a6: aload 6
      // 0a8: ifnull 12b
      // 0ab: aload 6
      // 0ad: invokevirtual k74/x/IlllI.lIllI ()Z
      // 0b0: ifeq 12b
      // 0b3: goto 0ba
      // 0b6: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b9: athrow
      // 0ba: aload 6
      // 0bc: invokevirtual k74/x/IlllI.Il ()Z
      // 0bf: ifeq 12b
      // 0c2: goto 0c9
      // 0c5: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c8: athrow
      // 0c9: aload 6
      // 0cb: aload 4
      // 0cd: invokevirtual k74/x/IlllI.IIIl (Ljava/lang/String;)Z
      // 0d0: ifeq 11b
      // 0d3: goto 0da
      // 0d6: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d9: athrow
      // 0da: ldc_w 389092423
      // 0dd: iload 10
      // 0df: ldc_w -166885901
      // 0e2: ixor
      // 0e3: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0e6: ldc_w 389092420
      // 0e9: iload 10
      // 0eb: ldc_w 430983970
      // 0ee: ixor
      // 0ef: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0f2: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 0f5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0f8: aload 4
      // 0fa: astore 8
      // 0fc: astore 7
      // 0fe: new java/lang/StringBuilder
      // 101: dup
      // 102: invokespecial java/lang/StringBuilder.<init> ()V
      // 105: aload 7
      // 107: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10a: aload 8
      // 10c: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10f: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 112: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 115: bipush 1
      // 116: ireturn
      // 117: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 11a: athrow
      // 11b: aload 6
      // 11d: aload 4
      // 11f: invokevirtual k74/x/IlllI.lII (Ljava/lang/String;)Z
      // 122: ifeq 12b
      // 125: bipush 0
      // 126: ireturn
      // 127: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 12a: athrow
      // 12b: ldc_w 389092421
      // 12e: iload 10
      // 130: ldc_w -893798739
      // 133: ixor
      // 134: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 137: ldc_w 389092418
      // 13a: iload 10
      // 13c: ldc_w -1507885832
      // 13f: ixor
      // 140: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 143: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 146: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 149: aload 4
      // 14b: astore 9
      // 14d: astore 8
      // 14f: new java/lang/StringBuilder
      // 152: dup
      // 153: invokespecial java/lang/StringBuilder.<init> ()V
      // 156: aload 8
      // 158: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 15b: aload 9
      // 15d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 160: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 163: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 166: aload 4
      // 168: invokestatic k74/x/IlIIIIII.lll (Ljava/lang/String;)V
      // 16b: bipush 1
      // 16c: ireturn
   }

   public static class_2596<?> lII(class_2596<?> var0) {
      lI(var0);
      return lllI(var0, IIIlI());
   }

   private IlIIIIII() {
   }

   private static void lIl(IIIlIlIl var0, IIIlIlIl var1) {
      class_310 var2 = class_310.method_1551();

      try {
         if (var2 == null) {
            return;
         }
      } catch (MatchException var3) {
         throw lIIl(var3);
      }

      var2.execute(IlIIIIII::llII);
   }

   public static boolean llI(UUID param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 1f
      // 04: getstatic k74/x/IlIIIIII.l Ljava/util/Set;
      // 07: aload 0
      // 08: invokeinterface java/util/Set.remove (Ljava/lang/Object;)Z 2
      // 0d: ifeq 1f
      // 10: goto 17
      // 13: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 20
      // 1b: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
   }

   public static void lll(String var0) {
      try {
         if (IlIl(IlIIllIII.lI(l(IIlII(389092397, 1068421104 ^ -160967125), IIlII(389092394, 1068421104 ^ -459388940))))) {
            return;
         }
      } catch (MatchException var1) {
         throw lIIl(var1);
      }

      lIl(I, II);
   }

   public static void IIII(UUID var0) {
      try {
         if (var0 != null) {
            l.add(var0);
         }
      } catch (MatchException var1) {
         throw lIIl(var1);
      }
   }

   public static void IIIl() {
      l.clear();
      lI.set(0);
      lll.clear();
      llI.shutdownNow();
   }

   public static boolean IIlI(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokestatic k74/x/IlIIIIII.lIII (Ljava/lang/String;)Lk74/x/llIII;
      // 04: astore 1
      // 05: aload 1
      // 06: ifnull 22
      // 09: aload 1
      // 0a: invokevirtual k74/x/llIII.I ()Ljava/lang/String;
      // 0d: invokestatic k74/x/IlIIIIII.IlII (Ljava/lang/String;)Z
      // 10: ifeq 22
      // 13: goto 1a
      // 16: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 19: athrow
      // 1a: bipush 1
      // 1b: goto 23
      // 1e: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: bipush 0
      // 23: ireturn
   }

   public static void IIll(class_2596<?> param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w -163097697
      // 003: istore 13
      // 005: invokestatic k74/x/llIllIlI.IIlII ()[Ljava/lang/String;
      // 008: astore 1
      // 009: aload 0
      // 00a: ifnonnull 012
      // 00d: return
      // 00e: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 011: athrow
      // 012: aload 0
      // 013: invokeinterface net/minecraft/class_2596.getClass ()Ljava/lang/Class; 1
      // 018: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 01b: astore 2
      // 01c: aload 0
      // 01d: instanceof net/minecraft/class_9088
      // 020: ifeq 09b
      // 023: aload 0
      // 024: checkcast net/minecraft/class_9088
      // 027: astore 3
      // 028: ldc_w 389092395
      // 02b: iload 13
      // 02d: ldc_w -337661696
      // 030: ixor
      // 031: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 034: ldc_w 389092392
      // 037: iload 13
      // 039: ldc_w 909227755
      // 03c: ixor
      // 03d: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 040: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 043: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 046: aload 3
      // 047: invokevirtual net/minecraft/class_9088.comp_2194 ()Lnet/minecraft/class_2960;
      // 04a: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 04d: astore 9
      // 04f: astore 8
      // 051: new java/lang/StringBuilder
      // 054: dup
      // 055: invokespecial java/lang/StringBuilder.<init> ()V
      // 058: aload 8
      // 05a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 05d: aload 9
      // 05f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 062: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 065: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 068: aload 3
      // 069: invokevirtual net/minecraft/class_9088.comp_2194 ()Lnet/minecraft/class_2960;
      // 06c: invokestatic k74/x/IlllI.lIII (Lnet/minecraft/class_2960;)Z
      // 06f: ifeq 09a
      // 072: ldc_w 389092393
      // 075: iload 13
      // 077: ldc_w -854690058
      // 07a: ixor
      // 07b: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 07e: ldc_w 389092390
      // 081: iload 13
      // 083: ldc_w -934103854
      // 086: ixor
      // 087: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 08a: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 08d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 090: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 093: goto 09a
      // 096: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 099: athrow
      // 09a: return
      // 09b: aload 0
      // 09c: instanceof net/minecraft/class_2658
      // 09f: ifeq 261
      // 0a2: aload 0
      // 0a3: checkcast net/minecraft/class_2658
      // 0a6: astore 3
      // 0a7: aload 3
      // 0a8: invokevirtual net/minecraft/class_2658.comp_1646 ()Lnet/minecraft/class_8710;
      // 0ab: astore 4
      // 0ad: aload 4
      // 0af: instanceof net/fabricmc/fabric/impl/networking/RegistrationPayload
      // 0b2: ifeq 0c9
      // 0b5: aload 4
      // 0b7: checkcast net/fabricmc/fabric/impl/networking/RegistrationPayload
      // 0ba: astore 5
      // 0bc: aload 5
      // 0be: invokevirtual net/fabricmc/fabric/impl/networking/RegistrationPayload.channels ()Ljava/util/List;
      // 0c1: astore 6
      // 0c3: aload 6
      // 0c5: invokestatic k74/x/IlllI.llI (Ljava/util/List;)V
      // 0c8: return
      // 0c9: aload 4
      // 0cb: invokeinterface net/minecraft/class_8710.method_56479 ()Lnet/minecraft/class_8710$class_9154; 1
      // 0d0: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 0d3: invokevirtual net/minecraft/class_2960.toString ()Ljava/lang/String;
      // 0d6: astore 5
      // 0d8: ldc_w 389092391
      // 0db: iload 13
      // 0dd: ldc_w -1736106316
      // 0e0: ixor
      // 0e1: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0e4: ldc_w 389092388
      // 0e7: iload 13
      // 0e9: ldc_w -1774586951
      // 0ec: ixor
      // 0ed: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0f0: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 0f3: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0f6: aload 5
      // 0f8: astore 10
      // 0fa: astore 9
      // 0fc: new java/lang/StringBuilder
      // 0ff: dup
      // 100: invokespecial java/lang/StringBuilder.<init> ()V
      // 103: aload 9
      // 105: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 108: aload 10
      // 10a: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10d: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 110: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 113: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 116: astore 6
      // 118: invokestatic k74/x/IlllI.IlllI ()Z
      // 11b: ifeq 1b5
      // 11e: aload 5
      // 120: ldc_w 389092389
      // 123: iload 13
      // 125: ldc_w 1092122137
      // 128: ixor
      // 129: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 12c: ldc_w 389092386
      // 12f: iload 13
      // 131: ldc_w -793455315
      // 134: ixor
      // 135: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 138: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 13b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 13e: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 141: ifeq 1b5
      // 144: goto 14b
      // 147: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 14a: athrow
      // 14b: aload 4
      // 14d: invokestatic k74/x/IlllI.IIllI (Lnet/minecraft/class_8710;)[B
      // 150: astore 7
      // 152: aload 7
      // 154: ifnull 16b
      // 157: aload 5
      // 159: aload 7
      // 15b: aload 6
      // 15d: invokestatic k74/x/IlllI.Illll (Ljava/lang/String;[BLnet/minecraft/class_310;)V
      // 160: aload 1
      // 161: ifnonnull 1b5
      // 164: goto 16b
      // 167: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16a: athrow
      // 16b: ldc_w 389092387
      // 16e: iload 13
      // 170: ldc_w -1059299610
      // 173: ixor
      // 174: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 177: ldc_w 389092384
      // 17a: iload 13
      // 17c: ldc_w 1459532060
      // 17f: ixor
      // 180: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 183: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 186: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 189: aload 4
      // 18b: invokeinterface net/minecraft/class_8710.getClass ()Ljava/lang/Class; 1
      // 190: invokevirtual java/lang/Class.getName ()Ljava/lang/String;
      // 193: astore 11
      // 195: astore 10
      // 197: new java/lang/StringBuilder
      // 19a: dup
      // 19b: invokespecial java/lang/StringBuilder.<init> ()V
      // 19e: aload 10
      // 1a0: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a3: aload 11
      // 1a5: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 1a8: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 1ab: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 1ae: goto 1b5
      // 1b1: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b4: athrow
      // 1b5: aload 4
      // 1b7: instanceof net/minecraft/class_8709
      // 1ba: ifne 222
      // 1bd: aload 5
      // 1bf: ldc_w 389092385
      // 1c2: iload 13
      // 1c4: ldc_w -1177350772
      // 1c7: ixor
      // 1c8: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 1cb: ldc_w 389092414
      // 1ce: iload 13
      // 1d0: ldc_w -743812409
      // 1d3: ixor
      // 1d4: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 1d7: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 1da: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1dd: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1e0: ifne 222
      // 1e3: goto 1ea
      // 1e6: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1e9: athrow
      // 1ea: aload 4
      // 1ec: invokeinterface net/minecraft/class_8710.method_56479 ()Lnet/minecraft/class_8710$class_9154; 1
      // 1f1: invokevirtual net/minecraft/class_8710$class_9154.comp_2242 ()Lnet/minecraft/class_2960;
      // 1f4: invokevirtual net/minecraft/class_2960.method_12832 ()Ljava/lang/String;
      // 1f7: ldc_w 389092415
      // 1fa: iload 13
      // 1fc: ldc_w -990411973
      // 1ff: ixor
      // 200: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 203: ldc_w 389092412
      // 206: iload 13
      // 208: ldc_w -1252253335
      // 20b: ixor
      // 20c: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 20f: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 212: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 215: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 218: ifeq 25d
      // 21b: goto 222
      // 21e: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 221: athrow
      // 222: aload 6
      // 224: ifnull 25d
      // 227: goto 22e
      // 22a: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 22d: athrow
      // 22e: aload 6
      // 230: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 233: ifnull 25d
      // 236: goto 23d
      // 239: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 23c: athrow
      // 23d: aload 6
      // 23f: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 242: new net/minecraft/class_2817
      // 245: dup
      // 246: new net/minecraft/class_8709
      // 249: dup
      // 24a: invokestatic k74/x/IlIIIIII.IlI ()Ljava/lang/String;
      // 24d: invokespecial net/minecraft/class_8709.<init> (Ljava/lang/String;)V
      // 250: invokespecial net/minecraft/class_2817.<init> (Lnet/minecraft/class_8710;)V
      // 253: invokevirtual net/minecraft/class_634.method_52787 (Lnet/minecraft/class_2596;)V
      // 256: goto 25d
      // 259: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 25c: athrow
      // 25d: aload 1
      // 25e: ifnonnull 326
      // 261: aload 2
      // 262: ldc_w 389092413
      // 265: iload 13
      // 267: ldc_w -1336703330
      // 26a: ixor
      // 26b: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 26e: ldc_w 389092410
      // 271: iload 13
      // 273: ldc_w 684431939
      // 276: ixor
      // 277: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 27a: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 27d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 280: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 283: ifne 2e5
      // 286: goto 28d
      // 289: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28c: athrow
      // 28d: aload 2
      // 28e: ldc_w 389092411
      // 291: iload 13
      // 293: ldc_w -562884681
      // 296: ixor
      // 297: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 29a: ldc_w 389092408
      // 29d: iload 13
      // 29f: ldc_w 1175017258
      // 2a2: ixor
      // 2a3: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 2a6: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 2a9: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 2ac: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 2af: ifne 2e5
      // 2b2: goto 2b9
      // 2b5: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2b8: athrow
      // 2b9: aload 2
      // 2ba: ldc_w 389092409
      // 2bd: iload 13
      // 2bf: ldc_w -483923404
      // 2c2: ixor
      // 2c3: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 2c6: ldc_w 389092406
      // 2c9: iload 13
      // 2cb: ldc_w 1505674622
      // 2ce: ixor
      // 2cf: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 2d2: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 2d5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 2d8: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 2db: ifeq 326
      // 2de: goto 2e5
      // 2e1: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e4: athrow
      // 2e5: ldc_w 389092407
      // 2e8: iload 13
      // 2ea: ldc_w 366525110
      // 2ed: ixor
      // 2ee: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 2f1: ldc_w 389092404
      // 2f4: iload 13
      // 2f6: ldc_w 172122736
      // 2f9: ixor
      // 2fa: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 2fd: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 300: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 303: aload 2
      // 304: astore 12
      // 306: astore 11
      // 308: new java/lang/StringBuilder
      // 30b: dup
      // 30c: invokespecial java/lang/StringBuilder.<init> ()V
      // 30f: aload 11
      // 311: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 314: aload 12
      // 316: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 319: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 31c: invokestatic k74/x/IlllI.IIlI (Ljava/lang/String;)V
      // 31f: goto 326
      // 322: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 325: athrow
      // 326: return
   }

   private static boolean IlII(String var0) {
      try {
         InetAddress[] var1 = InetAddress.getAllByName(var0);
         if (var1.length == 0) {
            return false;
         } else {
            for (InetAddress var5 : var1) {
               if (IIIIl(var5)) {
                  return false;
               }
            }

            return true;
         }
      } catch (Exception var6) {
         return false;
      }
   }

   private static boolean IlIl(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic java/lang/System.currentTimeMillis ()J
      // 03: lstore 1
      // 04: getstatic k74/x/IlIIIIII.lll Ljava/util/Map;
      // 07: aload 0
      // 08: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0d: checkcast java/lang/Long
      // 10: astore 3
      // 11: aload 3
      // 12: ifnull 2f
      // 15: lload 1
      // 16: aload 3
      // 17: invokevirtual java/lang/Long.longValue ()J
      // 1a: lsub
      // 1b: ldc2_w 2500
      // 1e: lcmp
      // 1f: ifge 2f
      // 22: goto 29
      // 25: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 28: athrow
      // 29: bipush 1
      // 2a: ireturn
      // 2b: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2e: athrow
      // 2f: getstatic k74/x/IlIIIIII.lll Ljava/util/Map;
      // 32: aload 0
      // 33: lload 1
      // 34: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 37: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 3c: pop
      // 3d: bipush 0
      // 3e: ireturn
   }

   public static boolean IllI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IlIIIIII.llll ()Z
      // 03: ifeq 0c
      // 06: bipush 1
      // 07: ireturn
      // 08: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b: athrow
      // 0c: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 0f: astore 0
      // 10: aload 0
      // 11: ifnull 50
      // 14: aload 0
      // 15: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 18: ifnull 50
      // 1b: goto 22
      // 1e: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 26: invokevirtual k74/x/lIIIlIlI.IIllll ()Lk74/x/IlllI;
      // 29: astore 1
      // 2a: aload 1
      // 2b: ifnull 50
      // 2e: aload 1
      // 2f: invokevirtual k74/x/IlllI.lIllI ()Z
      // 32: ifeq 50
      // 35: goto 3c
      // 38: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: aload 1
      // 3d: invokevirtual k74/x/IlllI.Il ()Z
      // 40: ifeq 50
      // 43: goto 4a
      // 46: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 49: athrow
      // 4a: bipush 1
      // 4b: ireturn
      // 4c: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4f: athrow
      // 50: bipush 0
      // 51: ireturn
   }

   private static boolean Illl(byte param0, byte param1, byte param2, byte param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: ldc_w -1002978928
      // 03: istore 6
      // 05: iload 0
      // 06: invokestatic java/lang/Byte.toUnsignedInt (B)I
      // 09: istore 4
      // 0b: iload 1
      // 0c: invokestatic java/lang/Byte.toUnsignedInt (B)I
      // 0f: istore 5
      // 11: iload 4
      // 13: ifeq ee
      // 16: iload 4
      // 18: ldc_w 389092405
      // 1b: iload 6
      // 1d: ldc_w 1761511293
      // 20: ixor
      // 21: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 24: if_icmpeq ee
      // 27: goto 2e
      // 2a: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: iload 4
      // 30: ldc_w 389092402
      // 33: iload 6
      // 35: ldc_w -304735756
      // 38: ixor
      // 39: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 3c: if_icmpeq ee
      // 3f: goto 46
      // 42: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 45: athrow
      // 46: iload 4
      // 48: ldc_w 389092403
      // 4b: iload 6
      // 4d: ldc_w -899946571
      // 50: ixor
      // 51: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 54: if_icmpne 76
      // 57: goto 5e
      // 5a: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: iload 5
      // 60: ldc_w 389092400
      // 63: iload 6
      // 65: ldc_w -1696375453
      // 68: ixor
      // 69: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 6c: if_icmpeq ee
      // 6f: goto 76
      // 72: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 75: athrow
      // 76: iload 4
      // 78: ldc_w 389092401
      // 7b: iload 6
      // 7d: ldc_w 1876050418
      // 80: ixor
      // 81: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 84: if_icmpne be
      // 87: goto 8e
      // 8a: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 8d: athrow
      // 8e: iload 5
      // 90: ldc_w 389092366
      // 93: iload 6
      // 95: ldc_w 1790193883
      // 98: ixor
      // 99: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 9c: if_icmplt be
      // 9f: goto a6
      // a2: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a5: athrow
      // a6: iload 5
      // a8: ldc_w 389092367
      // ab: iload 6
      // ad: ldc_w -1950169068
      // b0: ixor
      // b1: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // b4: if_icmple ee
      // b7: goto be
      // ba: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // bd: athrow
      // be: iload 4
      // c0: ldc_w 389092364
      // c3: iload 6
      // c5: ldc_w 1387363143
      // c8: ixor
      // c9: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // cc: if_icmpne f6
      // cf: goto d6
      // d2: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d5: athrow
      // d6: iload 5
      // d8: ldc_w 389092365
      // db: iload 6
      // dd: ldc_w -1765136626
      // e0: ixor
      // e1: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // e4: if_icmpne f6
      // e7: goto ee
      // ea: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // ed: athrow
      // ee: bipush 1
      // ef: goto f7
      // f2: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // f5: athrow
      // f6: bipush 0
      // f7: ireturn
   }

   private static llIII lIII(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w -624213754
      // 003: istore 5
      // 005: aload 0
      // 006: ifnull 017
      // 009: aload 0
      // 00a: invokevirtual java/lang/String.isBlank ()Z
      // 00d: ifeq 01d
      // 010: goto 017
      // 013: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: aconst_null
      // 018: areturn
      // 019: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 01c: athrow
      // 01d: aload 0
      // 01e: invokestatic java/net/URI.create (Ljava/lang/String;)Ljava/net/URI;
      // 021: astore 1
      // 022: aload 1
      // 023: invokevirtual java/net/URI.getScheme ()Ljava/lang/String;
      // 026: astore 2
      // 027: aload 2
      // 028: ifnull 0b9
      // 02b: aload 2
      // 02c: ldc_w 389092362
      // 02f: iload 5
      // 031: ldc_w 1614343317
      // 034: ixor
      // 035: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 038: ldc_w 389092363
      // 03b: iload 5
      // 03d: ldc_w -1118182995
      // 040: ixor
      // 041: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 044: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 047: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 04a: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 04d: ifne 083
      // 050: goto 057
      // 053: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 056: athrow
      // 057: aload 2
      // 058: ldc_w 389092360
      // 05b: iload 5
      // 05d: ldc_w -2039035169
      // 060: ixor
      // 061: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 064: ldc_w 389092361
      // 067: iload 5
      // 069: ldc_w -1597436313
      // 06c: ixor
      // 06d: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 070: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 073: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 076: invokevirtual java/lang/String.equalsIgnoreCase (Ljava/lang/String;)Z
      // 079: ifeq 0b9
      // 07c: goto 083
      // 07f: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 082: athrow
      // 083: aload 1
      // 084: invokevirtual java/net/URI.getRawUserInfo ()Ljava/lang/String;
      // 087: ifnonnull 0b9
      // 08a: goto 091
      // 08d: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: aload 1
      // 092: invokevirtual java/net/URI.getPort ()I
      // 095: ifeq 0b9
      // 098: goto 09f
      // 09b: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09e: athrow
      // 09f: aload 1
      // 0a0: invokevirtual java/net/URI.getPort ()I
      // 0a3: ldc_w 389092358
      // 0a6: iload 5
      // 0a8: ldc_w -398739898
      // 0ab: ixor
      // 0ac: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0af: if_icmple 0bb
      // 0b2: goto 0b9
      // 0b5: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: aconst_null
      // 0ba: areturn
      // 0bb: aload 1
      // 0bc: invokevirtual java/net/URI.getHost ()Ljava/lang/String;
      // 0bf: astore 3
      // 0c0: aload 3
      // 0c1: ifnull 0d2
      // 0c4: aload 3
      // 0c5: invokevirtual java/lang/String.isBlank ()Z
      // 0c8: ifeq 0d4
      // 0cb: goto 0d2
      // 0ce: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d1: athrow
      // 0d2: aconst_null
      // 0d3: areturn
      // 0d4: aload 3
      // 0d5: invokestatic java/net/IDN.toASCII (Ljava/lang/String;)Ljava/lang/String;
      // 0d8: getstatic java/util/Locale.ROOT Ljava/util/Locale;
      // 0db: invokevirtual java/lang/String.toLowerCase (Ljava/util/Locale;)Ljava/lang/String;
      // 0de: astore 4
      // 0e0: aload 4
      // 0e2: ldc_w 389092359
      // 0e5: iload 5
      // 0e7: ldc_w -1315234416
      // 0ea: ixor
      // 0eb: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0ee: ldc_w 389092356
      // 0f1: iload 5
      // 0f3: ldc_w -713545310
      // 0f6: ixor
      // 0f7: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0fa: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 0fd: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 100: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 103: ifne 133
      // 106: aload 4
      // 108: ldc_w 389092357
      // 10b: iload 5
      // 10d: ldc_w -825287502
      // 110: ixor
      // 111: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 114: ldc_w 389092354
      // 117: iload 5
      // 119: ldc_w -1414902923
      // 11c: ixor
      // 11d: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 120: invokestatic k74/x/IlIIIIII.l (II)Ljava/lang/String;
      // 123: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 126: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 129: ifeq 135
      // 12c: goto 133
      // 12f: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 132: athrow
      // 133: aconst_null
      // 134: areturn
      // 135: new k74/x/llIII
      // 138: dup
      // 139: aload 4
      // 13b: invokespecial k74/x/llIII.<init> (Ljava/lang/String;)V
      // 13e: areturn
      // 13f: astore 1
      // 140: aconst_null
      // 141: areturn
   }

   private static Throwable lIIl(Throwable var0) {
      return var0;
   }

   private static byte[][] lIlI() {
      try {
         InputStream var0 = IlIIIIII.class
            .getResourceAsStream(IlIIllIII.lI(l(IIlII(389092355, -1777080539 ^ -1397275108), IIlII(389092352, -1777080539 ^ -1369852926))));

         byte[][] var15;
         label107: {
            byte[][] var17;
            label108: {
               byte[][] var16;
               try {
                  if (var0 == null) {
                     var15 = new byte[0][];
                     break label107;
                  }

                  try (DataInputStream var1 = new DataInputStream(var0)) {
                     int var2 = var1.readInt();

                     label111: {
                        try {
                           if (var2 < 1 || var2 > IIlII(389092353, -1777080539 ^ 751839870)) {
                              break label111;
                           }
                        } catch (Throwable var11) {
                           throw lIIl(var11);
                        }

                        var16 = new byte[var2][IIlII(389092382, -1777080539 ^ 1551462130)];

                        for (byte[] var7 : var16) {
                           var1.readFully(var7);
                        }

                        var17 = var16;
                        break label108;
                     }

                     var16 = new byte[0][];
                  }
               } catch (Throwable var13) {
                  if (var0 != null) {
                     try {
                        var0.close();
                     } catch (Throwable var8) {
                        var13.addSuppressed(var8);
                     }
                  }

                  throw var13;
               }

               if (var0 != null) {
                  var0.close();
               }

               return var16;
            }

            if (var0 != null) {
               var0.close();
            }

            return var17;
         }

         try {
            if (var0 != null) {
               var0.close();
            }

            return var15;
         } catch (Throwable var10) {
            throw lIIl(var10);
         }
      } catch (Exception var14) {
         return new byte[0][];
      }
   }

   public static boolean lIll(class_2596<?> var0) {
      return Ill(var0, IllI());
   }

   private static String IIlIl(short var0, int var1, short var2, int var3, int var4, short var5) {
      int var10 = var4 ^ 1376533025;
      char[] var9 = IIlI[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])IIll[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         IIll[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 806;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ '飙' ^ switch (var8 % 17) {
            default -> 111;
            case 1 -> 173;
            case 2 -> 237;
            case 3 -> 118;
            case 4 -> 11;
            case 5 -> 92;
            case 6 -> 83;
            case 7 -> 223;
            case 8 -> 207;
            case 9 -> 22;
            case 10 -> 144;
            case 11 -> 17;
            case 12 -> 200;
            case 13 -> 24;
            case 14 -> 120;
            case 15 -> 5;
            case 16 -> 119;
         } ^ var7 ^ var5 ^ var0 ^ var3 ^ var1 ^ var4 ^ var2);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   private static void llII(IIIlIlIl var0, IIIlIlIl var1) {
      IlIlIllII var2 = IlIlIllII.l();

      try {
         if (var2 != null) {
            var2.I(IIIIllI.Il, var0, var1, 4000L);
         }
      } catch (MatchException var3) {
         throw lIIl(var3);
      }
   }

   public static void llIl(String var0, Consumer<Boolean> var1) {
      llIII var2 = lIII(var0);

      try {
         if (var2 == null) {
            var1.accept(false);
            return;
         }
      } catch (RuntimeException var7) {
         throw lIIl(var7);
      }

      int var3 = lI.incrementAndGet();

      try {
         if (var3 > 4) {
            lI.decrementAndGet();
            var1.accept(false);
            return;
         }
      } catch (RuntimeException var6) {
         throw lIIl(var6);
      }

      try {
         CompletableFuture.supplyAsync(IlIIIIII::Il, llI).orTimeout(3L, TimeUnit.SECONDS).whenComplete(IlIIIIII::II);
      } catch (RuntimeException var5) {
         lI.decrementAndGet();
         var1.accept(false);
      }
   }

   static class_2596<?> lllI(class_2596<?> var0, boolean var1) {
      int var9 = -150539882;

      try {
         if (!var1) {
            return var0;
         }
      } catch (MatchException var10) {
         throw lIIl(var10);
      }

      if (var0 instanceof class_9091 var13) {
         try {
            if (!IlllI.IlIl() || !IlllI.lIII(var13.comp_2195())) {
               return var0;
            }
         } catch (MatchException var11) {
            throw lIIl(var11);
         }

         byte[] var14 = IlllI.l();
         String var17 = IlIIllIII.lI(l(IIlII(389092383, var9 ^ 1665723099), IIlII(389092380, var9 ^ -1846217709)));
         String var10001 = String.valueOf(var13.comp_2195());
         String var10002 = IlIIllIII.lI(l(IIlII(389092381, var9 ^ -1461305467), IIlII(389092378, var9 ^ -202213649)));
         String var16 = IlllI.IllII(var14);
         String var7 = var10002;
         String var15 = var10001;
         String var5 = var17;
         IlllI.IIlI(var5 + var15 + var7 + var16);
         return new class_9091(var13.comp_2195(), var14);
      } else if (var0 instanceof class_2817 var2) {
         class_8710 var3 = var2.comp_1647();

         try {
            if (!(var3 instanceof class_8709)) {
               return var0;
            }
         } catch (MatchException var12) {
            throw lIIl(var12);
         }

         String var4 = IlI();
         String var10000 = IlIIllIII.lI(l(IIlII(389092379, var9 ^ 854044457), IIlII(389092376, var9 ^ -1043394779)));
         String var8 = IlIIllIII.lI(l(IIlII(389092377, var9 ^ -2127535699), IIlII(389092374, var9 ^ 1540650455)));
         String var6 = var10000;
         IlllI.IIlI(var6 + var4 + var8);
         return new class_2817(new class_8709(var4));
      } else {
         return var0;
      }
   }

   public static boolean llll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 03: astore 0
      // 04: aload 0
      // 05: ifnull 16
      // 08: aload 0
      // 09: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 0c: ifnonnull 1c
      // 0f: goto 16
      // 12: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 1b: athrow
      // 1c: aload 0
      // 1d: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 20: invokevirtual k74/x/lIIIlIlI.IlIll ()Lk74/x/IIIlIlIIl;
      // 23: astore 1
      // 24: aload 1
      // 25: ifnull 3e
      // 28: aload 1
      // 29: invokevirtual k74/x/IIIlIlIIl.IIIIlIl ()Z
      // 2c: ifeq 3e
      // 2f: goto 36
      // 32: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: bipush 1
      // 37: goto 3f
      // 3a: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: ireturn
   }

   private static Thread IIIII(Runnable var0) {
      Thread var1 = new Thread(var0);
      var1.setDaemon(true);
      return var1;
   }

   private static boolean IIIIl(InetAddress param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -874845082
      // 003: istore 4
      // 005: aload 0
      // 006: ifnull 04f
      // 009: aload 0
      // 00a: invokevirtual java/net/InetAddress.isAnyLocalAddress ()Z
      // 00d: ifne 04f
      // 010: goto 017
      // 013: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 016: athrow
      // 017: aload 0
      // 018: invokevirtual java/net/InetAddress.isLoopbackAddress ()Z
      // 01b: ifne 04f
      // 01e: goto 025
      // 021: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 024: athrow
      // 025: aload 0
      // 026: invokevirtual java/net/InetAddress.isLinkLocalAddress ()Z
      // 029: ifne 04f
      // 02c: goto 033
      // 02f: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 032: athrow
      // 033: aload 0
      // 034: invokevirtual java/net/InetAddress.isSiteLocalAddress ()Z
      // 037: ifne 04f
      // 03a: goto 041
      // 03d: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 040: athrow
      // 041: aload 0
      // 042: invokevirtual java/net/InetAddress.isMulticastAddress ()Z
      // 045: ifeq 055
      // 048: goto 04f
      // 04b: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 04e: athrow
      // 04f: bipush 1
      // 050: ireturn
      // 051: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 054: athrow
      // 055: aload 0
      // 056: invokevirtual java/net/InetAddress.getAddress ()[B
      // 059: astore 1
      // 05a: aload 1
      // 05b: arraylength
      // 05c: ldc_w 389092375
      // 05f: iload 4
      // 061: ldc_w -87193484
      // 064: ixor
      // 065: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 068: if_icmpne 145
      // 06b: aload 1
      // 06c: bipush 0
      // 06d: baload
      // 06e: ldc_w 389092372
      // 071: iload 4
      // 073: ldc_w 694436230
      // 076: ixor
      // 077: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 07a: iand
      // 07b: ldc_w 389092373
      // 07e: iload 4
      // 080: ldc_w -181179264
      // 083: ixor
      // 084: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 087: if_icmpne 097
      // 08a: goto 091
      // 08d: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 090: athrow
      // 091: bipush 1
      // 092: ireturn
      // 093: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 096: athrow
      // 097: bipush 1
      // 098: istore 2
      // 099: bipush 0
      // 09a: istore 3
      // 09b: iload 3
      // 09c: ldc_w 389092370
      // 09f: iload 4
      // 0a1: ldc_w -844936960
      // 0a4: ixor
      // 0a5: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0a8: if_icmpge 0ca
      // 0ab: iload 2
      // 0ac: aload 1
      // 0ad: iload 3
      // 0ae: baload
      // 0af: ifne 0c1
      // 0b2: goto 0b9
      // 0b5: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b8: athrow
      // 0b9: bipush 1
      // 0ba: goto 0c2
      // 0bd: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c0: athrow
      // 0c1: bipush 0
      // 0c2: iand
      // 0c3: istore 2
      // 0c4: iinc 3 1
      // 0c7: goto 09b
      // 0ca: iload 2
      // 0cb: aload 1
      // 0cc: ldc_w 389092371
      // 0cf: iload 4
      // 0d1: ldc_w 1807801958
      // 0d4: ixor
      // 0d5: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0d8: baload
      // 0d9: bipush -1
      // 0da: if_icmpne 0fe
      // 0dd: aload 1
      // 0de: ldc_w 389092368
      // 0e1: iload 4
      // 0e3: ldc_w 458164879
      // 0e6: ixor
      // 0e7: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 0ea: baload
      // 0eb: bipush -1
      // 0ec: if_icmpne 0fe
      // 0ef: goto 0f6
      // 0f2: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0f5: athrow
      // 0f6: bipush 1
      // 0f7: goto 0ff
      // 0fa: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0fd: athrow
      // 0fe: bipush 0
      // 0ff: iand
      // 100: istore 2
      // 101: iload 2
      // 102: ifeq 145
      // 105: aload 1
      // 106: ldc_w 389092369
      // 109: iload 4
      // 10b: ldc_w 964739094
      // 10e: ixor
      // 10f: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 112: baload
      // 113: aload 1
      // 114: ldc_w 389092590
      // 117: iload 4
      // 119: ldc_w -489582235
      // 11c: ixor
      // 11d: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 120: baload
      // 121: aload 1
      // 122: ldc_w 389092591
      // 125: iload 4
      // 127: ldc_w -677038050
      // 12a: ixor
      // 12b: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 12e: baload
      // 12f: aload 1
      // 130: ldc_w 389092588
      // 133: iload 4
      // 135: ldc_w -1930416553
      // 138: ixor
      // 139: invokestatic k74/x/IlIIIIII.IIlII (II)I
      // 13c: baload
      // 13d: invokestatic k74/x/IlIIIIII.Illl (BBBB)Z
      // 140: ireturn
      // 141: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 144: athrow
      // 145: aload 1
      // 146: arraylength
      // 147: bipush 4
      // 148: if_icmpne 16c
      // 14b: aload 1
      // 14c: bipush 0
      // 14d: baload
      // 14e: aload 1
      // 14f: bipush 1
      // 150: baload
      // 151: aload 1
      // 152: bipush 2
      // 153: baload
      // 154: aload 1
      // 155: bipush 3
      // 156: baload
      // 157: invokestatic k74/x/IlIIIIII.Illl (BBBB)Z
      // 15a: ifeq 16c
      // 15d: goto 164
      // 160: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 163: athrow
      // 164: bipush 1
      // 165: goto 16d
      // 168: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16b: athrow
      // 16c: bipush 0
      // 16d: ireturn
   }

   public static boolean IIIlI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IlIIIIII.llll ()Z
      // 03: ifeq 0c
      // 06: bipush 1
      // 07: ireturn
      // 08: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0b: athrow
      // 0c: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 0f: astore 0
      // 10: aload 0
      // 11: ifnull 62
      // 14: aload 0
      // 15: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 18: ifnull 62
      // 1b: goto 22
      // 1e: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 21: athrow
      // 22: aload 0
      // 23: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 26: invokevirtual k74/x/lIIIlIlI.IIllll ()Lk74/x/IlllI;
      // 29: astore 1
      // 2a: aload 1
      // 2b: ifnull 42
      // 2e: aload 1
      // 2f: invokevirtual k74/x/IlllI.lIllI ()Z
      // 32: ifeq 42
      // 35: goto 3c
      // 38: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3b: athrow
      // 3c: bipush 1
      // 3d: ireturn
      // 3e: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 41: athrow
      // 42: aload 0
      // 43: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 46: invokevirtual k74/x/lIIIlIlI.lllll ()Lk74/x/IIlIIIIll;
      // 49: astore 2
      // 4a: aload 2
      // 4b: ifnull 62
      // 4e: aload 2
      // 4f: invokevirtual k74/x/IIlIIIIll.IIIIlIl ()Z
      // 52: ifeq 62
      // 55: goto 5c
      // 58: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5b: athrow
      // 5c: bipush 1
      // 5d: ireturn
      // 5e: invokestatic k74/x/IlIIIIII.lIIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 61: athrow
      // 62: bipush 0
      // 63: ireturn
   }

   private static int IIIll(byte[] var0, byte[] var1) {
      for (int var2 = 0; var2 < IIlII(389092589, 866652306 ^ 1055944025); var2++) {
         int var3 = Byte.toUnsignedInt(var0[var2]) - Byte.toUnsignedInt(var1[var2]);

         try {
            if (var3 != 0) {
               return var3;
            }
         } catch (MatchException var4) {
            throw lIIl(var4);
         }
      }

      return 0;
   }
}
