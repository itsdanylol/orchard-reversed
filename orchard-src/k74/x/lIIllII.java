package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_7923;
import net.minecraft.class_9362;
import net.minecraft.class_239.class_240;

@Environment(EnvType.CLIENT)
public final class lIIllII extends IlIIIIIIl {
   private static final int[] lIll;
   private static final String[] II;
   private int Il;
   private boolean lI;
   private class_2350 ll;
   private int I;
   private long III;
   private long IIl;
   private final lllIIlII IlI;
   private static final int Ill = 3;
   private int lII;
   private class_2338 lIl;
   private int llI;
   private long lll;
   private static final String[] IIII;
   private final lllIIlII IIIl;
   private class_2338 IIlI;
   private final lllIIlII IIll;
   private long IlII;
   private final lllIIlII IlIl;
   private long IllI;
   private boolean Illl;
   private long lIII;
   private int lIIl;
   private static final Object[] llIl;
   private static final String[] llII;
   private final lIlllIl lIlI;

   private void I() {
      this.lII = -1;
      this.lIIl = -1;
      this.IlII = 0L;
      this.IIl = 0L;
      this.III = 0L;
      this.lIII = 0L;
      this.lll = 0L;
      this.IllI = 0L;
      this.lIl = null;
      this.Il = 0;
      this.Illl();
   }

   private void II(class_310 var1, class_2338 var2, class_2350 var3, int var4) {
      this.lI(var1, var2, var3);
      if (var1 != null && var1.field_1724 != null && var1.field_1761 != null) {
         this.I = var4;
         this.lI = true;
         this.llI = var1.field_1724.field_6012;
         this.IlII(var1, var4, false);
      }
   }

   private static int lIIl(int var0, int var1) {
      int var2 = lIll[var0 ^ -224159612] ^ var1 ^ var0;
      var2 ^= 1245;
      var2 -= 57574;
      var2 -= 35144;
      var2 -= 14810;
      var2 += 30672;
      return var2 - 12737;
   }

   private static String Il(int var0, int var1) {
      int var9 = 456105180;
      int var2 = (var0 ^ lIIl(-224159612, var9 ^ 1470043275)) & lIIl(-224159611, var9 ^ 1720624009);
      if (II[var2] == null) {
         char[] var3 = IIII[var2].toCharArray();

         int var4 = switch (var3[0] & lIIl(-224159610, var9 ^ 316875440)) {
            case 0 -> lIIl(-224159609, var9 ^ 105720805);
            case 1 -> lIIl(-224159616, var9 ^ -757946920);
            case 2 -> lIIl(-224159615, var9 ^ -869935952);
            case 3 -> lIIl(-224159614, var9 ^ -714158256);
            case 4 -> lIIl(-224159613, var9 ^ 2141936230);
            case 5 -> lIIl(-224159604, var9 ^ 259336292);
            case 6 -> lIIl(-224159603, var9 ^ -951885469);
            case 7 -> lIIl(-224159602, var9 ^ -34622602);
            case 8 -> lIIl(-224159601, var9 ^ 307872658);
            case 9 -> lIIl(-224159608, var9 ^ -211070974);
            case 10 -> lIIl(-224159607, var9 ^ 587494995);
            case 11 -> lIIl(-224159606, var9 ^ -2104943928);
            case 12 -> lIIl(-224159605, var9 ^ 743496394);
            case 13 -> lIIl(-224159596, var9 ^ 1130288934);
            case 14 -> lIIl(-224159595, var9 ^ 1649982568);
            case 15 -> lIIl(-224159594, var9 ^ 1274466947);
            case 16 -> lIIl(-224159593, var9 ^ -1689033839);
            case 17 -> lIIl(-224159600, var9 ^ -541827566);
            case 18 -> lIIl(-224159599, var9 ^ -2050746749);
            case 19 -> lIIl(-224159598, var9 ^ 74145951);
            case 20 -> lIIl(-224159597, var9 ^ -1418106953);
            case 21 -> lIIl(-224159588, var9 ^ -1713800403);
            case 22 -> lIIl(-224159587, var9 ^ -810959336);
            case 23 -> lIIl(-224159586, var9 ^ -1611445214);
            case 24 -> lIIl(-224159585, var9 ^ -1625032891);
            case 25 -> lIIl(-224159592, var9 ^ -1919050081);
            case 26 -> lIIl(-224159591, var9 ^ -2059148696);
            case 27 -> lIIl(-224159590, var9 ^ 802198166);
            case 28 -> lIIl(-224159589, var9 ^ 582145263);
            case 29 -> lIIl(-224159580, var9 ^ -208334200);
            case 30 -> lIIl(-224159579, var9 ^ -1471275825);
            case 31 -> lIIl(-224159578, var9 ^ 1896945405);
            case 32 -> lIIl(-224159577, var9 ^ 196005539);
            case 33 -> lIIl(-224159584, var9 ^ 1174714990);
            case 34 -> lIIl(-224159583, var9 ^ 1080617589);
            case 35 -> lIIl(-224159582, var9 ^ 784742646);
            case 36 -> lIIl(-224159581, var9 ^ -1257544091);
            case 37 -> lIIl(-224159572, var9 ^ 1750134994);
            case 38 -> lIIl(-224159571, var9 ^ -2065811568);
            case 39 -> lIIl(-224159570, var9 ^ 650950201);
            case 40 -> lIIl(-224159569, var9 ^ 261997877);
            case 41 -> lIIl(-224159576, var9 ^ -1938029503);
            case 42 -> lIIl(-224159575, var9 ^ 2094738586);
            case 43 -> lIIl(-224159574, var9 ^ 1505189123);
            case 44 -> lIIl(-224159573, var9 ^ -1881600266);
            case 45 -> lIIl(-224159564, var9 ^ -533793467);
            case 46 -> lIIl(-224159563, var9 ^ 381812657);
            case 47 -> lIIl(-224159562, var9 ^ -1552578917);
            case 48 -> lIIl(-224159561, var9 ^ -1176333);
            case 49 -> lIIl(-224159568, var9 ^ 1702967874);
            case 50 -> lIIl(-224159567, var9 ^ -1858264289);
            case 51 -> lIIl(-224159566, var9 ^ 585558913);
            case 52 -> lIIl(-224159565, var9 ^ 1831006170);
            case 53 -> lIIl(-224159556, var9 ^ -1599575192);
            case 54 -> lIIl(-224159555, var9 ^ 400608668);
            case 55 -> lIIl(-224159554, var9 ^ 1089286082);
            case 56 -> lIIl(-224159553, var9 ^ 2059846907);
            case 57 -> lIIl(-224159560, var9 ^ -2103809788);
            case 58 -> lIIl(-224159559, var9 ^ 886356804);
            case 59 -> lIIl(-224159558, var9 ^ 60996133);
            case 60 -> lIIl(-224159557, var9 ^ 2085685953);
            case 61 -> lIIl(-224159548, var9 ^ 1495672527);
            case 62 -> lIIl(-224159547, var9 ^ 712527278);
            case 63 -> lIIl(-224159546, var9 ^ 519109230);
            case 64 -> lIIl(-224159545, var9 ^ -246952497);
            case 65 -> lIIl(-224159552, var9 ^ -1054532014);
            case 66 -> lIIl(-224159551, var9 ^ -1298338891);
            case 67 -> lIIl(-224159550, var9 ^ 1951746096);
            case 68 -> lIIl(-224159549, var9 ^ 1785239670);
            case 69 -> lIIl(-224159540, var9 ^ 148468298);
            case 70 -> lIIl(-224159539, var9 ^ -1606470645);
            case 71 -> lIIl(-224159538, var9 ^ 640547044);
            case 72 -> lIIl(-224159537, var9 ^ 279437309);
            case 73 -> lIIl(-224159544, var9 ^ -843849682);
            case 74 -> lIIl(-224159543, var9 ^ 1140970745);
            case 75 -> lIIl(-224159542, var9 ^ 1035284870);
            case 76 -> lIIl(-224159541, var9 ^ -921591278);
            case 77 -> lIIl(-224159532, var9 ^ 1639801925);
            case 78 -> lIIl(-224159531, var9 ^ -1764492534);
            case 79 -> lIIl(-224159530, var9 ^ 911063125);
            case 80 -> lIIl(-224159529, var9 ^ -1947049985);
            case 81 -> lIIl(-224159536, var9 ^ -2077301765);
            case 82 -> lIIl(-224159535, var9 ^ -469594383);
            case 83 -> lIIl(-224159534, var9 ^ -622325565);
            case 84 -> lIIl(-224159533, var9 ^ 1825079724);
            case 85 -> lIIl(-224159524, var9 ^ 552429146);
            case 86 -> lIIl(-224159523, var9 ^ 653019429);
            case 87 -> lIIl(-224159522, var9 ^ -1691348190);
            case 88 -> lIIl(-224159521, var9 ^ -1074445192);
            case 89 -> lIIl(-224159528, var9 ^ -1757899017);
            case 90 -> lIIl(-224159527, var9 ^ -1637512612);
            case 91 -> lIIl(-224159526, var9 ^ -854628096);
            case 92 -> lIIl(-224159525, var9 ^ -1553957663);
            case 93 -> lIIl(-224159516, var9 ^ -602193596);
            case 94 -> lIIl(-224159515, var9 ^ -1235936122);
            case 95 -> lIIl(-224159514, var9 ^ -271565162);
            case 96 -> lIIl(-224159513, var9 ^ -658890650);
            case 97 -> lIIl(-224159520, var9 ^ 576938152);
            case 98 -> lIIl(-224159519, var9 ^ -1198834728);
            case 99 -> lIIl(-224159518, var9 ^ -1374709414);
            case 100 -> lIIl(-224159517, var9 ^ -2099403368);
            case 101 -> lIIl(-224159508, var9 ^ -702876212);
            case 102 -> lIIl(-224159507, var9 ^ 1355857176);
            case 103 -> lIIl(-224159506, var9 ^ 954914348);
            case 104 -> lIIl(-224159505, var9 ^ -1792913469);
            case 105 -> lIIl(-224159512, var9 ^ -262272160);
            case 106 -> lIIl(-224159511, var9 ^ -108427571);
            case 107 -> lIIl(-224159510, var9 ^ -1633422031);
            case 108 -> lIIl(-224159509, var9 ^ -1631529845);
            case 109 -> lIIl(-224159500, var9 ^ -1042498964);
            case 110 -> lIIl(-224159499, var9 ^ 1342801057);
            case 111 -> lIIl(-224159498, var9 ^ 1104361191);
            case 112 -> lIIl(-224159497, var9 ^ -90612669);
            case 113 -> lIIl(-224159504, var9 ^ 1309521020);
            case 114 -> lIIl(-224159503, var9 ^ -352217956);
            case 115 -> lIIl(-224159502, var9 ^ -23953901);
            case 116 -> lIIl(-224159501, var9 ^ -1056895756);
            case 117 -> lIIl(-224159492, var9 ^ -26808323);
            case 118 -> 3;
            case 119 -> lIIl(-224159491, var9 ^ -573114287);
            case 120 -> lIIl(-224159490, var9 ^ -111305511);
            case 121 -> lIIl(-224159489, var9 ^ 1609305698);
            case 122 -> lIIl(-224159496, var9 ^ 1364074736);
            case 123 -> lIIl(-224159495, var9 ^ 392811880);
            case 124 -> lIIl(-224159494, var9 ^ -1281320606);
            case 125 -> lIIl(-224159493, var9 ^ -1150690839);
            case 126 -> lIIl(-224159740, var9 ^ -1359558252);
            case 127 -> lIIl(-224159739, var9 ^ 430667131);
            case 128 -> lIIl(-224159738, var9 ^ 1719714975);
            case 129 -> lIIl(-224159737, var9 ^ 1647927021);
            case 130 -> lIIl(-224159744, var9 ^ -932950693);
            case 131 -> lIIl(-224159743, var9 ^ 1742856740);
            case 132 -> lIIl(-224159742, var9 ^ 1880385472);
            case 133 -> lIIl(-224159741, var9 ^ 187747491);
            case 134 -> lIIl(-224159732, var9 ^ 1308900574);
            case 135 -> lIIl(-224159731, var9 ^ -1628199165);
            case 136 -> lIIl(-224159730, var9 ^ 1391439651);
            case 137 -> lIIl(-224159729, var9 ^ -475070754);
            case 138 -> lIIl(-224159736, var9 ^ 551397434);
            case 139 -> lIIl(-224159735, var9 ^ -1309081008);
            case 140 -> lIIl(-224159734, var9 ^ -2054408761);
            case 141 -> lIIl(-224159733, var9 ^ 694175739);
            case 142 -> lIIl(-224159724, var9 ^ 1081014017);
            case 143 -> lIIl(-224159723, var9 ^ -1377217707);
            case 144 -> lIIl(-224159722, var9 ^ 1154292034);
            case 145 -> lIIl(-224159721, var9 ^ 524480410);
            case 146 -> lIIl(-224159728, var9 ^ 1469505013);
            case 147 -> lIIl(-224159727, var9 ^ 804523977);
            case 148 -> lIIl(-224159726, var9 ^ -752037729);
            case 149 -> lIIl(-224159725, var9 ^ -154187796);
            case 150 -> lIIl(-224159716, var9 ^ -1569955247);
            case 151 -> lIIl(-224159715, var9 ^ -979410279);
            case 152 -> lIIl(-224159714, var9 ^ 2126480820);
            case 153 -> lIIl(-224159713, var9 ^ 995017015);
            case 154 -> lIIl(-224159720, var9 ^ 1838393952);
            case 155 -> lIIl(-224159719, var9 ^ 1824888460);
            case 156 -> lIIl(-224159718, var9 ^ -1767233492);
            case 157 -> lIIl(-224159717, var9 ^ 508997347);
            case 158 -> lIIl(-224159708, var9 ^ 960666239);
            case 159 -> lIIl(-224159707, var9 ^ 2082282910);
            case 160 -> lIIl(-224159706, var9 ^ -2007531296);
            case 161 -> lIIl(-224159705, var9 ^ -299688318);
            case 162 -> lIIl(-224159712, var9 ^ 1897824064);
            case 163 -> lIIl(-224159711, var9 ^ 970527525);
            case 164 -> lIIl(-224159710, var9 ^ 2085398927);
            case 165 -> lIIl(-224159709, var9 ^ -1011187160);
            case 166 -> lIIl(-224159700, var9 ^ 35416760);
            case 167 -> lIIl(-224159699, var9 ^ 28037892);
            case 168 -> lIIl(-224159698, var9 ^ -2096081315);
            case 169 -> lIIl(-224159697, var9 ^ 129895763);
            case 170 -> lIIl(-224159704, var9 ^ -2099889234);
            case 171 -> lIIl(-224159703, var9 ^ 1785204886);
            case 172 -> lIIl(-224159702, var9 ^ 1088565194);
            case 173 -> lIIl(-224159701, var9 ^ -178768953);
            case 174 -> lIIl(-224159692, var9 ^ 579903701);
            case 175 -> lIIl(-224159691, var9 ^ -1928525020);
            case 176 -> 0;
            case 177 -> lIIl(-224159690, var9 ^ -754216837);
            case 178 -> lIIl(-224159689, var9 ^ -1473909058);
            case 179 -> lIIl(-224159696, var9 ^ -1128155480);
            case 180 -> lIIl(-224159695, var9 ^ 1110146579);
            case 181 -> lIIl(-224159694, var9 ^ -1618196067);
            case 182 -> lIIl(-224159693, var9 ^ -33823015);
            case 183 -> lIIl(-224159684, var9 ^ 108393290);
            case 184 -> lIIl(-224159683, var9 ^ -1636187879);
            case 185 -> lIIl(-224159682, var9 ^ -1917269580);
            case 186 -> 2;
            case 187 -> lIIl(-224159681, var9 ^ 518911222);
            case 188 -> lIIl(-224159688, var9 ^ -343420132);
            case 189 -> lIIl(-224159687, var9 ^ -1284456155);
            case 190 -> lIIl(-224159686, var9 ^ -605019914);
            case 191 -> lIIl(-224159685, var9 ^ 1697497716);
            case 192 -> 5;
            case 193 -> lIIl(-224159676, var9 ^ 1965829589);
            case 194 -> lIIl(-224159675, var9 ^ -1803718768);
            case 195 -> lIIl(-224159674, var9 ^ -1025069151);
            case 196 -> lIIl(-224159673, var9 ^ 157941671);
            case 197 -> lIIl(-224159680, var9 ^ 2053803302);
            case 198 -> lIIl(-224159679, var9 ^ 1334163789);
            case 199 -> lIIl(-224159678, var9 ^ 541373623);
            case 200 -> lIIl(-224159677, var9 ^ 955411537);
            case 201 -> lIIl(-224159668, var9 ^ 1232910720);
            case 202 -> lIIl(-224159667, var9 ^ 1030069947);
            case 203 -> lIIl(-224159666, var9 ^ 2033530344);
            case 204 -> lIIl(-224159665, var9 ^ -1622124402);
            case 205 -> lIIl(-224159672, var9 ^ 180868440);
            case 206 -> lIIl(-224159671, var9 ^ 1197294454);
            case 207 -> 4;
            case 208 -> lIIl(-224159670, var9 ^ 1276232164);
            case 209 -> lIIl(-224159669, var9 ^ -680449099);
            case 210 -> lIIl(-224159660, var9 ^ -506279011);
            case 211 -> lIIl(-224159659, var9 ^ 1348642628);
            case 212 -> lIIl(-224159658, var9 ^ 2107868868);
            case 213 -> lIIl(-224159657, var9 ^ 1120754400);
            case 214 -> lIIl(-224159664, var9 ^ 422507020);
            case 215 -> lIIl(-224159663, var9 ^ 1344635358);
            case 216 -> lIIl(-224159662, var9 ^ 2145152443);
            case 217 -> lIIl(-224159661, var9 ^ -690166092);
            case 218 -> lIIl(-224159652, var9 ^ -992763770);
            case 219 -> lIIl(-224159651, var9 ^ -1076511012);
            case 220 -> lIIl(-224159650, var9 ^ 2067367476);
            case 221 -> lIIl(-224159649, var9 ^ 900283533);
            case 222 -> lIIl(-224159656, var9 ^ 2142522259);
            case 223 -> lIIl(-224159655, var9 ^ 153830198);
            case 224 -> lIIl(-224159654, var9 ^ 860084900);
            case 225 -> lIIl(-224159653, var9 ^ -1607594598);
            case 226 -> lIIl(-224159644, var9 ^ -1495742225);
            case 227 -> lIIl(-224159643, var9 ^ 1776153788);
            case 228 -> lIIl(-224159642, var9 ^ -925995150);
            case 229 -> lIIl(-224159641, var9 ^ 823187162);
            case 230 -> lIIl(-224159648, var9 ^ -127021225);
            case 231 -> lIIl(-224159647, var9 ^ -2096435230);
            case 232 -> lIIl(-224159646, var9 ^ 643373403);
            case 233 -> lIIl(-224159645, var9 ^ 277064922);
            case 234 -> lIIl(-224159636, var9 ^ 266892115);
            case 235 -> lIIl(-224159635, var9 ^ -526758649);
            case 236 -> lIIl(-224159634, var9 ^ -1220587887);
            case 237 -> lIIl(-224159633, var9 ^ -1789782607);
            case 238 -> lIIl(-224159640, var9 ^ -136079988);
            case 239 -> lIIl(-224159639, var9 ^ 1604194829);
            case 240 -> lIIl(-224159638, var9 ^ 1373384606);
            case 241 -> 1;
            case 242 -> lIIl(-224159637, var9 ^ -489343667);
            case 243 -> lIIl(-224159628, var9 ^ -804179436);
            case 244 -> lIIl(-224159627, var9 ^ -302246128);
            case 245 -> lIIl(-224159626, var9 ^ 719779051);
            case 246 -> lIIl(-224159625, var9 ^ 299976087);
            case 247 -> lIIl(-224159632, var9 ^ 1841078681);
            case 248 -> lIIl(-224159631, var9 ^ 800035870);
            case 249 -> lIIl(-224159630, var9 ^ 802487498);
            case 250 -> lIIl(-224159629, var9 ^ -1756167323);
            case 251 -> lIIl(-224159620, var9 ^ 1667787967);
            case 252 -> lIIl(-224159619, var9 ^ 626111968);
            case 253 -> lIIl(-224159618, var9 ^ 1847578514);
            case 254 -> lIIl(-224159617, var9 ^ 524389258);
            default -> lIIl(-224159624, var9 ^ -1532755060);
         };
         int var5 = (var1 & lIIl(-224159623, var9 ^ -188612153)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIl(-224159622, var9 ^ 305496703)) >>> lIIl(-224159621, var9 ^ -1187479393)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIl(-224159356, var9 ^ -1975983791);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIl(-224159355, var9 ^ 1559031799);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }

   private void lI(class_310 var1, class_2338 var2, class_2350 var3) {
      if (var1 != null && var2 != null && var3 != null) {
         this.IIlI = var2.method_10062();
         this.ll = var3;
      } else {
         this.Illl();
      }
   }

   private static boolean ll(class_310 var0) {
      if (var0 != null && var0.field_1724 != null && var0.field_1687 != null) {
         class_1799 var1 = var0.field_1724.method_6047();
         if (!var1.method_7960() && var1.method_31574(class_1802.field_8301)) {
            if (var0.field_1765 instanceof class_3965 var2 && var2.method_17783() == class_240.field_1332) {
               class_2680 var4 = var0.field_1687.method_8320(var2.method_17777());
               return var4.method_27852(class_2246.field_10540) || var4.method_27852(class_2246.field_9987);
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean III(class_310 var1) {
      if (!this.lI) {
         return false;
      } else if (var1 == null
         || var1.field_1724 == null
         || var1.field_1687 == null
         || var1.field_1761 == null
         || this.IIlI == null
         || this.ll == null
         || this.I < 0
         || this.I >= lIIl(-224159354, -90194388 ^ 288360633)) {
         this.Illl();
         return false;
      } else if (this.llI != lIIl(-224159353, -90194388 ^ 997902826) && var1.field_1724.field_6012 - this.llI > lIIl(-224159360, -90194388 ^ 333995327)) {
         this.Illl();
         return false;
      } else if (k74.x.IIll.lIIlIl(var1.field_1687.method_8320(this.IIlI))) {
         this.Illl();
         return false;
      } else if (k74.x.IIll.lIIlI(var1) == this.I && k74.x.IIll.IIIIlII(var1, this.I)) {
         IIlllIllI.I(var1.field_1761, var1.field_1724.method_6047());
         IIlllIllI.lllI(var1.field_1761, 0);
         this.Illl = true;

         boolean var2;
         try {
            var2 = var1.field_1761.method_2910(this.IIlI, this.ll);
         } finally {
            this.Illl = false;
         }

         this.lI = false;
         this.lll = System.currentTimeMillis();
         if (!var2) {
            this.Illl();
         }

         return true;
      } else {
         return true;
      }
   }

   @Override
   public void lllllI(class_1297 var1) {
      class_310 var2 = class_310.method_1551();
      if (!k74.x.IIll.IllIll() && this.IlI.IllI() && var2.field_1724 != null && var1 instanceof class_1657) {
         int var3 = this.IIl(var2.field_1724);
         if (var3 >= 0) {
            if (this.lII == -1) {
               this.lII = k74.x.IIll.IIlII(var2.field_1724.method_31548());
            }

            this.IllI(var2, var3);
            long var4 = System.currentTimeMillis();
            this.IlII = var4;
            this.IIl = this.IIll();
            this.III = var4;
            this.lIII = this.IIll();
            this.IllI = var4;
         }
      }
   }

   private int IIl(class_1657 var1) {
      String[] var10000 = IIllllIl.IIIIl();
      float var3 = 0.0F;
      String[] var2 = var10000;
      int var4 = -1;
      int var5 = 0;

      while (var5 < lIIl(-224159359, -1204286436 ^ -613371025)) {
         class_1799 var6 = var1.method_31548().method_5438(var5);
         float var7 = this.lIl(var6);
         if (var7 > var3) {
            var3 = var7;
            var4 = var5;
         }

         var5++;
         if (var2 != null) {
            break;
         }
      }

      return var4;
   }

   private void Ill(class_310 var1) {
      if (this.lII < 0 || var1.field_1724 == null) {
         this.I();
      } else if (!this.IIIl.IllI()) {
         this.I();
      } else {
         long var2 = System.currentTimeMillis();
         if (this.III == 0L || var2 - this.III >= this.lIII) {
            if (this.lIIl >= 0 && k74.x.IIll.IIlII(var1.field_1724.method_31548()) != this.lIIl) {
               this.I();
            } else {
               k74.x.IIll.llIllI(var1, this, this.lII);
               this.I();
            }
         }
      }
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 == null || var1.field_1687 == null || var1.field_1761 == null) {
         this.IIlI(var1, false);
      } else if (!k74.x.IIll.IIIIII(var1)) {
         if (this.lIIl >= 0 && k74.x.IIll.IIlII(var1.field_1724.method_31548()) != this.lIIl) {
            this.I();
         } else if (this.III(var1)) {
            this.lll = System.currentTimeMillis();
         } else {
            this.lII(var1);
            this.IIII(var1);
            boolean var2 = this.lIII(var1);
            long var3 = System.currentTimeMillis();
            if (var2) {
               this.lll = var3;
            }

            boolean var5 = this.IlI.IllI() && this.IllI != 0L && var3 - this.IllI < 500L;
            if (var2) {
               if (this.IlII == 0L || var3 - this.IlII >= this.IIl) {
                  if (this.Il >= 3) {
                     if (var1.field_1765 instanceof class_3965 var6 && var6.method_17783() == class_240.field_1332) {
                        class_2680 var10 = var1.field_1687.method_8320(var6.method_17777());
                        int var8 = lll(var1, var10);
                        int var9 = k74.x.IIll.IIlII(var1.field_1724.method_31548());
                        if (var8 >= 0 && var8 != var9) {
                           if (this.lII == -1) {
                              this.lII = var9;
                           }

                           this.IlII(var1, var8, false);
                           this.IlII = var3;
                           this.IIl = this.IIll();
                           this.III = var3;
                           this.lIII = this.IIll();
                           this.lll = var3;
                        }
                     }
                  }
               }
            } else {
               if (!var5 && this.lII != -1 && (this.lll == 0L || var3 - this.lll >= Math.max(200L, this.lIII))) {
                  this.Illl();
                  this.Ill(var1);
               }
            }
         }
      }
   }

   private void lII(class_310 var1) {
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null && this.IIlI != null && this.ll != null) {
         if (!(var1.field_1765 instanceof class_3965 var2 && var2.method_17783() == class_240.field_1332 && var2.method_17777().equals(this.IIlI))) {
            this.Illl();
         } else if (k74.x.IIll.lIIlIl(var1.field_1687.method_8320(this.IIlI))) {
            this.Illl();
         } else if (!IIlllIllI.IlI(var1.field_1761)) {
            if (this.l(var1) || var1.field_1690 != null && var1.field_1690.field_1886 != null && k74.x.IIll.IlIllll(var1, var1.field_1690.field_1886)) {
               IIlllIllI.I(var1.field_1761, var1.field_1724.method_6047());
               IIlllIllI.lllI(var1.field_1761, 0);
               this.Illl = true;

               boolean var7;
               try {
                  var7 = var1.field_1761.method_2910(this.IIlI, this.ll);
               } finally {
                  this.Illl = false;
               }

               if (!var7) {
                  this.Illl();
               }
            } else {
               this.Illl();
            }
         }
      } else {
         this.Illl();
      }
   }

   private boolean l(class_310 var1) {
      if (var1 != null && var1.field_1690 != null && var1.field_1690.field_1886 != null) {
         boolean var2 = var1.field_1690.field_1886.method_1434()
            || k74.x.IIll.IIIIIlI(var1.field_1690.field_1886) > 0
            || k74.x.IIll.IlIllll(var1, var1.field_1690.field_1886);
         return !var2 ? false : var1.field_1765 instanceof class_3965 var3 && var3.method_17783() == class_240.field_1332;
      } else {
         return false;
      }
   }

   private float lIl(class_1799 var1) {
      int var3 = 1399656703;
      if (var1.method_7960()) {
         return 0.0F;
      } else if (var1.method_7909() instanceof class_9362) {
         return 7.0F;
      } else if (var1.method_7909() instanceof class_1743) {
         return this.IIll.IllI() ? 6.0F : 0.0F;
      } else {
         String var2 = class_7923.field_41178.method_10221(var1.method_7909()).method_12832();
         if (!var2.endsWith(IlIIllIII.lI(Il(lIIl(-224159358, var3 ^ -1750563975), lIIl(-224159357, var3 ^ 1636243350))))) {
            return 0.0F;
         } else if (var2.contains(IlIIllIII.lI(Il(lIIl(-224159348, var3 ^ -337601952), lIIl(-224159347, var3 ^ -37798939))))) {
            return 8.0F;
         } else if (var2.contains(IlIIllIII.lI(Il(lIIl(-224159346, var3 ^ 362782224), lIIl(-224159345, var3 ^ -1045291460))))) {
            return 7.0F;
         } else if (var2.contains(IlIIllIII.lI(Il(lIIl(-224159352, var3 ^ 447107226), lIIl(-224159351, var3 ^ -1266274589))))) {
            return 6.0F;
         } else if (var2.contains(IlIIllIII.lI(Il(lIIl(-224159350, var3 ^ 950553180), lIIl(-224159349, var3 ^ -34608181))))) {
            return 5.0F;
         } else {
            return var2.contains(IlIIllIII.lI(Il(lIIl(-224159340, var3 ^ 1914652689), lIIl(-224159339, var3 ^ -1429440011)))) ? 4.0F : 3.0F;
         }
      }
   }

   private boolean llI(class_310 var1) {
      return this.IlIl.IllI() && var1.field_1761 != null && !ll(var1) && IIlllIllI.IlI(var1.field_1761);
   }

   public static int lll(class_310 var0, class_2680 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var0.field_1724 == null) {
         return -1;
      } else {
         int var3 = k74.x.IIll.IIlII(var0.field_1724.method_31548());
         float var4 = IIIl(var0, var1, var3);
         int var5 = 0;

         while (var5 < lIIl(-224159338, -2014300027 ^ -1370452201)) {
            float var6 = IIIl(var0, var1, var5);
            if (var6 > var4) {
               var4 = var6;
               var3 = var5;
            }

            var5++;
            if (var2 != null) {
               break;
            }
         }

         return var3;
      }
   }

   private void IIII(class_310 var1) {
      String[] var10000 = IIllllIl.IIIIl();
      class_239 var5 = var1.field_1765;
      String[] var2 = var10000;
      class_2338 var3 = var5 instanceof class_3965 var4 && var4.method_17783() == class_240.field_1332 ? var4.method_17777() : null;
      if (var3 != null && var3.equals(this.lIl)) {
         this.Il++;
         if (var2 == null) {
            return;
         }
      }

      this.lIl = var3;
      this.Il = var3 == null ? 0 : 1;
   }

   public static float IIIl(class_310 var0, class_2680 var1, int var2) {
      if (var0.field_1724 == null) {
         return 0.0F;
      } else {
         class_1799 var3 = var0.field_1724.method_31548().method_5438(var2);
         return var3.method_7924(var1);
      }
   }

   public lIIllII() {
      int var1 = -575370009;
      super(
         IlIIllIII.Ill(Il(lIIl(-224159337, var1 ^ 511691622), lIIl(-224159344, var1 ^ 1218629353))),
         lllIIlIl.IlI,
         IlIIllIII.Ill(Il(lIIl(-224159343, var1 ^ 811312279), lIIl(-224159342, var1 ^ 1782100358)))
      );
      this.IlIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Il(lIIl(-224159341, var1 ^ 329189795), lIIl(-224159332, var1 ^ 1619673313))), true));
      this.IIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Il(lIIl(-224159331, var1 ^ 1758388315), lIIl(-224159330, var1 ^ -891248956))), true));
      this.lIlI = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(Il(lIIl(-224159329, var1 ^ 1973223976), lIIl(-224159336, var1 ^ -1255778325))), 45.0, 55.0, 0.0, 250.0, 5.0)
            .Ill(IlIIllIII.Ill(Il(lIIl(-224159335, var1 ^ 1902075466), lIIl(-224159334, var1 ^ 500535851))))
      );
      this.IlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Il(lIIl(-224159333, var1 ^ -127171030), lIIl(-224159324, var1 ^ -845605926))), false));
      this.IIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Il(lIIl(-224159323, var1 ^ 1105530283), lIIl(-224159322, var1 ^ 1983002941))), false));
      this.lII = -1;
      this.lIIl = -1;
      this.I = -1;
      this.llI = lIIl(-224159321, var1 ^ -490562936);
   }

   private void IIlI(class_310 var1, boolean var2) {
      if (var2
         && this.IIIl.IllI()
         && this.lII >= 0
         && this.lII < lIIl(-224159328, -940767944 ^ 169030739)
         && var1 != null
         && var1.field_1724 != null
         && k74.x.IIll.IIlII(var1.field_1724.method_31548()) != this.lII) {
         k74.x.IIll.llIllI(var1, this, this.lII);
      }

      this.I();
   }

   private long IIll() {
      double var1 = this.lIlI.IIlI();
      double var3 = this.lIlI.IlI();
      return var1 == var3 ? Math.max(0L, Math.round(var1)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var1, var3)));
   }

   private void IlII(class_310 var1, int var2, boolean var3) {
      k74.x.IIll.lIIIlII(var1, var2, true);
      this.lIIl = var2;
      if (var3) {
         this.lII(var1);
      }
   }

   public boolean IlIl(class_310 var1, class_2338 var2, class_2350 var3) {
      if (this.Illl || !this.IIIIlIl() || !this.IlIl.IllI()) {
         return false;
      } else if (var1.field_1724 != null && var1.field_1687 != null) {
         class_2680 var4 = var1.field_1687.method_8320(var2);
         int var5 = lll(var1, var4);
         int var6 = k74.x.IIll.IIlII(var1.field_1724.method_31548());
         if (var5 >= 0 && var5 != var6) {
            if (this.lII == -1) {
               this.lII = var6;
            }

            this.II(var1, var2, var3, var5);
            long var7 = System.currentTimeMillis();
            this.IlII = var7;
            this.IIl = this.IIll();
            this.III = var7;
            this.lIII = this.IIll();
            this.lll = var7;
            return true;
         } else {
            this.lll = System.currentTimeMillis();
            return false;
         }
      } else {
         return false;
      }
   }

   @Override
   public void IlIII() {
      this.I();
   }

   private void IllI(class_310 var1, int var2) {
      this.IlII(var1, var2, false);
   }

   @Override
   public void llIl() {
      this.IIlI(class_310.method_1551(), true);
   }

   private static String lIlI(int var0, int var1) {
      int var3 = var0 ^ -492435156;
      char[] var4 = llII[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])llIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         llIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 2137259570;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 62;
            case 1 -> 138;
            case 2 -> 246;
            case 3 -> 190;
            case 4 -> 4;
            case 5 -> 154;
            case 6 -> 209;
            case 7 -> 188;
            case 8 -> 235;
            case 9 -> 242;
            case 10 -> 27;
            case 11 -> 241;
            case 12 -> 148;
            case 13 -> 254;
            case 14 -> 161;
            case 15 -> 94;
            case 16 -> 191;
            case 17 -> 12;
            case 18 -> 227;
            case 19 -> 120;
            case 20 -> 19;
            case 21 -> 111;
            case 22 -> 210;
            case 23 -> 206;
            case 24 -> 251;
            case 25 -> 119;
            case 26 -> 22;
            case 27 -> 173;
            case 28 -> 14;
            case 29 -> 55;
            case 30 -> 245;
            case 31 -> 25;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -2021539680;
      int var10001 = "ó⎎㒁⟝풞⋅퐵␡铽⍧哵⃠鐍⍻ᒼ◞\uf487⇝咝\u202d됰\u2431퓽\u2427퓴⁐됃⌛钶⑶㒍⛝뒓⓽ᐽ⁉듳⌇\uf4eb⅘琛ℳᒼ⍆\uf48a⒅咊⓭琹⛡ᓠⅿ듹Ⓒᐄ△뒹▖㒋⁽\uf485⏅될↑铪┏퓠⇈됕⟛ᒴⓞᒟ\u2455璆Ⅵᐠⅹ铺⒟\uf4eaↀ鐏ⓛ咤∆풒┥钟⎭㐰⁁瓢ₗ㓾⃰琒⌋풭▾풒‥璃➵吧₁퓥≷ᓦ☘后⑻㒲Ω㒃➅咑▥㐽↉들✟ᓫⅰ鐌Ⓥ钱↦풞♭咗☥鐪⌹瓲⏏퓫▐퐉⌫㒦⏎咄⁅璆✽吥ↁ㓴‗㓤◸鐚⊳\uf4a5\u245e咟‵㒞⑥ᐺ▩铷ⅇ哯✘ᐎ≋璾⚖咔∝璁ⓕ됬⇙哶‟㓷‰\uf40f⍃풻\u244eᒜ⇵璛╽琼♉铯❧铫ℨ퐇❫ᒮ⛾ᒞ♥璅⊽됫☑铯⛿ᓬ␠퐋⁓咯❖㒞⚭㒟⊝吢⟁哳⒧瓮➘㐊Ⓝᒰ℮뒏⁕咝⇭됼⎁㓧⋏ᓥℐ㐙➳咣⌆풚❕㒌\u2455\u001d㳮ᓣ㷵듬㷵둚㼡㒃㷿㒓㠐瑸㼓퓃㰶㓰㴕퓼㬅푏㻩뒋㡏ᒁ㻸둺㧫퓌㮾"
         .length();
      int var17 = 0;
      String[] var15 = new String[2];
      int var14 = var10001;
      String var13 = "ó⎎㒁⟝풞⋅퐵␡铽⍧哵⃠鐍⍻ᒼ◞\uf487⇝咝\u202d됰\u2431퓽\u2427퓴⁐됃⌛钶⑶㒍⛝뒓⓽ᐽ⁉듳⌇\uf4eb⅘琛ℳᒼ⍆\uf48a⒅咊⓭琹⛡ᓠⅿ듹Ⓒᐄ△뒹▖㒋⁽\uf485⏅될↑铪┏퓠⇈됕⟛ᒴⓞᒟ\u2455璆Ⅵᐠⅹ铺⒟\uf4eaↀ鐏ⓛ咤∆풒┥钟⎭㐰⁁瓢ₗ㓾⃰琒⌋풭▾풒‥璃➵吧₁퓥≷ᓦ☘后⑻㒲Ω㒃➅咑▥㐽↉들✟ᓫⅰ鐌Ⓥ钱↦풞♭咗☥鐪⌹瓲⏏퓫▐퐉⌫㒦⏎咄⁅璆✽吥ↁ㓴‗㓤◸鐚⊳\uf4a5\u245e咟‵㒞⑥ᐺ▩铷ⅇ哯✘ᐎ≋璾⚖咔∝璁ⓕ됬⇙哶‟㓷‰\uf40f⍃풻\u244eᒜ⇵璛╽琼♉铯❧铫ℨ퐇❫ᒮ⛾ᒞ♥璅⊽됫☑铯⛿ᓬ␠퐋⁓咯❖㒞⚭㒟⊝吢⟁哳⒧瓮➘㐊Ⓝᒰ℮뒏⁕咝⇭됼⎁㓧⋏ᓥℐ㐙➳咣⌆풚❕㒌\u2455\u001d㳮ᓣ㷵듬㷵둚㼡㒃㷿㒓㠐瑸㼓퓃㰶㓰㴕퓼㬅푏㻩뒋㡏ᒁ㻸둺㧫퓌㮾";
      short var18 = 19248;
      int var16 = 0;

      do {
         char var10000 = var13.charAt(var17);
         int var21 = 0;
         char var19 = var10000;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 123;
               case 1 -> 18;
               case 2 -> 112;
               case 3 -> 13;
               case 4 -> 144;
               case 5 -> 174;
               case 6 -> 44;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      llII = var15;
      llIl = new Object[var15.length];
      int var9 = -76503233;
      byte[] var7 = "Eb\u0012GtpYÊ\u0000\u001eÛð\u0014°ÒÐÀ/\\®ÞØ-sÇ\u00936\u0097mV£\u0016\u001d\u0088Ñ\rÕ¾\u0098Xï\u0012J\u0080\u0000¤:\u0005á\u0096©·1ù\u008fm\u0090tãË>\u00ad#cQ£.çp¥EµY\u000b+Ù\u0089®\u009a&ÍI§z\u00979ïg\u0016\u0096\u0099L¹\u0084\u009e\u0005\u008b$\u0082\nÝTGâ\u008d\u000eµð\u008dÞ\u000e\u0017\u009f`g\b\u0097¾\u001b\u009d=-kU0O-#áhë\u009cº³åDcìïÚ\u0019S7¢TùC1R\u0095\u0013½<;Á\u0083§ö\u009fÊz\u00ad\tÊ\u0096#ÎÍ41O\u0093\u001d`<\u0089\u009e\u0081ýán&Õ\u0018KJ¤\u009c\u009d$÷dòÓ\f7\u0004<\u0006ú±\u0088\u007fjí\u0013õ\u0012w|Ãu\u0083ÀÚ\u00100\u001b\u0012~\u007fß\u0016¦²U\u0092|\u0005\u001d4\u0006R\u0010Ööh;=U\u0090g\u0090à&)B³\u0011_C\u009cn¬óDKÛß\u009b8\u0085´Â\f\r\u0003\u0014ãº4\u001aÓØç¦ a\u0012\u0005f¨±Åx\u0095a$\u001a$\u008b\u000e²ÂÍÏ4Ð\u0001û\u0002Z&/ßN\u0019\u0086Vü-\u008a/HÈ}Ûì[Gs@\u009d\u008d\u0084.\u0002©$°Aà\u0099\u000f¦g\u0096Ó\u001a_öÿw\u0003È\u0015é©~5xÐ2\u0010\u009f]4\u0011°\t\u0089Íêº\u00ad\b½¸\u0085Åo²\u008c\u0098s\u0085ßò\u0090ì±\u009d\u0085ìÎæ¸y¤¨å\u0002ý-ÇJÊGÙñ0\u009e\u0099ÆªvÂ®¼ò`Æ\u0090 \\#Äç\fqB-D\u0001*\u0017/\u0081\u0087ß¶Ïâ£ò§ët\u007f]\u008c^\f!\u008c=-\u008eÓ!C\u009aBô}\u0080S.Ï)èd¥U\\ðMØùümûìo\u0087²Óüõ«ì\u009b\u0016SÏ+\u0001/ë eíM\u0011÷CC³Ù$\u0005\u0094,\u0011¡]`6©\u0094 y¼\u000b0\u007f\u000bV\u008cst}=\u0080pÄ§\u0000Ú\u0099´Nu\u001c\u001b\rbé\u009e5\u0019Í5«\\ùÅ.\u008c\u000e^*@\u0012V\u001fñS\u0007\u00022 QW£\u0004û\"\u0097qÌ·;\u009d¾ºR\u0093\u000e*¿\u0014ªÚV0àQ\r¿\u0016ïEk$Ã=\tö¶ÁÑ)\u0093ä2¾´°\u0091\u009bÁ×b\u009bûlB|B)³8B\u007fnSÇ~8oÑ\u0084WÑ\u001f\f«W\u008f+¿c\u0084nàä0\u009aªy´üÞç\u000fcã\u0086ï+$ê\u001en±PwÑG{&\u0010á\u0093ð\u0013V*Ë\u0091í¯Ö\u0015Côµ\u0090+Â\u001fx\u0095éåR\u001fÖ=ç¥Ê\u008a0mY±\u009fðò\u0082ÁöiÒºØ\u0017-®<OaPÖ\u0087O\u008dq°\u008aï\u0006\u001f8\u0014\u0088\n)\u008c\u0084;å\u009fE0\u008c\f\u0010\r\u0019ùz*ü¡\u008d8÷É\rÙ>wÐ;'gÑÔ_\u0086\u0080\u00968Ð\u001bVL\u001b\u0094\u0006öh\u0097tq]x@\u008e2¹MV*\u000f\u0095µ[\u0081@(/\u0098g\u0011kÈÌ\u008c\u008d\u00ad¡¼\u0018:,\u0095U ºª^ì8\fÅ\u008cÒ\u000bó/2[B\u009f^ýo^\u007fGP0£\u0084\u000bÓ\u000báBØxüm!\u0094qÄ!\u001fíÖ.Yæ\u00ad(G\u0007iÄ\u007fö'TÅ_mI²Ð\u001bÖº¤!¾#^²Óô'´%1\u0085{ \rMÚ3\u0096$#í/æê\u00906\f\u0091÷\u0016\u00074¤àd\u0002~U¾\u001d\u0015\u008a¤òg´~¥Â·\u0002\u0087¯ì%å\u001el]Mcë¬C!ÖYð(Ì'ÂìË ÿ\u0001îÖ8\u001b\rA\u0003\u001c¼\t\u007fAX\\=Rm\u0000=)\u0005Ä\u0085®úöq\u0095\u0095\u008a7¬L<|â6]\r¼rå¶Yúªæ?øx\u0000ËxÃ«ÅyÛ\u0098Å\u0019\u0013N\u0011\u0017´â}ÒóH7\u0010Zà¥\u0087|j\u009aÛ\u0012Í\u0017\b\u009e;8\u00894±_\u0011\u0084§\u0000º8O \u0015õ\u009b\r«\u009f@\u0019Û|î9I»b\u0017Áº§PXu( Ãêðs\u008aØ rÓäÊ\u0019Ü\u009e\u009cÄ¹\\ä=³n¾^\u0095óÇù\u001eZ´ì|9¼¨÷ª\u001e\u0087Þm¡û\u0015Æa@.n¥9I¦É³x\u0089,\r\u0091Ú\u0019ÿÞü\u0095\u0083\u001a|¢TºÓ¶¤qÓÄ,U+`:À°h\u0001Ë6=ÆU|ën\fu\u0019\u001a\u0001°ætÃ\u001fòß-/Ø\u0082\u0088\u00817¼Rç\u0094¿9Ò\u008bÉ\u0092ö\u0019ô\u0096Mx(CA"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lIll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lIll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lIIl(-224159327, var23 ^ -295082924)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIlI(-492435156, var23 ^ 1652461972)).length();
      int var1 = lIIl(-224159326, var23 ^ -430805037);
      int var25 = -1;

      label100:
      while (true) {
         int var29 = lIIl(-224159325, var23 ^ -1282018862);
         String var31 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label95: {
               char[] var46 = var31.toCharArray();
               int var10004 = var46.length;
               int var6 = 0;
               int var49 = var29;
               var42 = var46;
               var10001 = var10004;
               char[] var58;
               int var10006;
               if (var10004 <= 1) {
                  var58 = var46;
                  var10004 = var29;
                  var10006 = var6;
               } else {
                  var49 = var29;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label95;
                  }

                  var58 = var46;
                  var10004 = var29;
                  var10006 = var6;
               }

               while (true) {
                  var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % lIIl(-224159313, var23 ^ 2089585090)) {
                     case 0 -> 4;
                     case 1 -> lIIl(-224159320, var23 ^ 1456548904);
                     case 2 -> lIIl(-224159319, var23 ^ -1175456200);
                     case 3 -> lIIl(-224159318, var23 ^ 451714383);
                     case 4 -> lIIl(-224159317, var23 ^ 93992463);
                     case 5 -> lIIl(-224159308, var23 ^ -1750650201);
                     default -> 5;
                  });
                  var6++;
                  if (var49 == 0) {
                     var10006 = var49;
                     var58 = var42;
                     var10004 = var49;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var58 = var42;
                     var10004 = var49;
                     var10006 = var6;
                  }
               }
            }

            String var51 = new String(var42).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var51;
                  if ((var25 += var1) >= var4) {
                     IIII = var5;
                     II = new String[lIIl(-224159314, var23 ^ 1747412980)];
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var51;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label100;
                  }

                  var4 = (var2 = lIlI(-492435155, var23 ^ 1643100066)).length();
                  var1 = lIIl(-224159316, var23 ^ 1698539678);
                  var25 = -1;
            }

            var29 = lIIl(-224159315, var23 ^ -1756781310);
            var31 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private void Illl() {
      this.IIlI = null;
      this.ll = null;
      this.I = -1;
      this.lI = false;
      this.llI = lIIl(-224159307, 100682269 ^ -134582542);
   }

   private boolean lIII(class_310 var1) {
      if (!this.IlIl.IllI() || var1 == null || var1.field_1724 == null) {
         return false;
      } else if (this.lI) {
         return true;
      } else {
         return this.llI(var1) ? true : this.l(var1);
      }
   }
}
