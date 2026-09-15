package k74.x;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class lIIIIl implements InvocationHandler {
   private static final Object[] III;
   private static String[] I;
   private final IlIllIllI l;
   private static final int[] lI;
   private static final String[] ll;
   private static final String[] II;
   private static final String[] Il;

   @Override
   public Object invoke(Object var1, Method var2, Object[] var3) {
      String[] var4 = IIllllIl.IIIIl();
      if (var2.getDeclaringClass() == Object.class) {
         String var7 = var2.getName();
         byte var6 = -1;
         switch (var7.hashCode()) {
            case -1776922004:
               if (!var7.equals(I[1])) {
                  break;
               }

               var6 = 0;
               if (var4 == null) {
                  break;
               }
            case 147696667:
               if (!var7.equals(I[2])) {
                  break;
               }

               var6 = 1;
               if (var4 == null) {
                  break;
               }
            case -1295482945:
               if (var7.equals(I[3])) {
                  var6 = 2;
               }
         }
         return switch (var6) {
            case 0 -> IlIIllIII.lI(I[0]);
            case 1 -> System.identityHashCode(var1);
            case 2 -> var1 == (var3 != null && var3.length != 0 ? var3[0] : null);
            default -> null;
         };
      } else {
         Object var5 = var3 != null && var3.length > 0 ? var3[0] : null;
         this.l.a(new IlIllIIll(var5));
         return null;
      }
   }

   private static String I(int var0, int var1) {
      int var9 = -582020837;
      int var2 = (var0 ^ Il(-825244569, var9 ^ -2140176498)) & Il(-825244570, var9 ^ 1134470545);
      if (II[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & Il(-825244571, var9 ^ -303833555)) {
            case 0 -> Il(-825244572, var9 ^ 553823683);
            case 1 -> Il(-825244573, var9 ^ -959678781);
            case 2 -> Il(-825244574, var9 ^ -2064973864);
            case 3 -> Il(-825244575, var9 ^ 185529653);
            case 4 -> Il(-825244576, var9 ^ -259865135);
            case 5 -> Il(-825244561, var9 ^ 1102511565);
            case 6 -> Il(-825244562, var9 ^ 1662578859);
            case 7 -> Il(-825244563, var9 ^ 1863784045);
            case 8 -> Il(-825244564, var9 ^ 1300483921);
            case 9 -> Il(-825244565, var9 ^ -320209766);
            case 10 -> Il(-825244566, var9 ^ -1268503173);
            case 11 -> Il(-825244567, var9 ^ -604323139);
            case 12 -> Il(-825244568, var9 ^ -161037891);
            case 13 -> Il(-825244553, var9 ^ 316725352);
            case 14 -> Il(-825244554, var9 ^ -1609413972);
            case 15 -> Il(-825244555, var9 ^ -1584600693);
            case 16 -> Il(-825244556, var9 ^ 1830623421);
            case 17 -> Il(-825244557, var9 ^ 429376676);
            case 18 -> Il(-825244558, var9 ^ -1761377122);
            case 19 -> 5;
            case 20 -> Il(-825244559, var9 ^ -1563705047);
            case 21 -> Il(-825244560, var9 ^ -1826406208);
            case 22 -> Il(-825244545, var9 ^ -1097682454);
            case 23 -> Il(-825244546, var9 ^ -580497758);
            case 24 -> Il(-825244547, var9 ^ 1560562442);
            case 25 -> Il(-825244548, var9 ^ -343873292);
            case 26 -> Il(-825244549, var9 ^ 1593537401);
            case 27 -> Il(-825244550, var9 ^ 10464871);
            case 28 -> Il(-825244551, var9 ^ 590485494);
            case 29 -> Il(-825244552, var9 ^ -1078612475);
            case 30 -> Il(-825244601, var9 ^ 106420390);
            case 31 -> Il(-825244602, var9 ^ 630996385);
            case 32 -> Il(-825244603, var9 ^ -119516832);
            case 33 -> Il(-825244604, var9 ^ -1793396573);
            case 34 -> Il(-825244605, var9 ^ 1551167198);
            case 35 -> Il(-825244606, var9 ^ 17748572);
            case 36 -> Il(-825244607, var9 ^ 381834655);
            case 37 -> Il(-825244608, var9 ^ 2012792720);
            case 38 -> Il(-825244593, var9 ^ 1392218546);
            case 39 -> Il(-825244594, var9 ^ -21874763);
            case 40 -> Il(-825244595, var9 ^ 1539332584);
            case 41 -> Il(-825244596, var9 ^ 1618738775);
            case 42 -> Il(-825244597, var9 ^ -568817816);
            case 43 -> Il(-825244598, var9 ^ 1457086458);
            case 44 -> Il(-825244599, var9 ^ -1452847312);
            case 45 -> 3;
            case 46 -> Il(-825244600, var9 ^ -321491058);
            case 47 -> Il(-825244585, var9 ^ 1443476326);
            case 48 -> Il(-825244586, var9 ^ -43349567);
            case 49 -> Il(-825244587, var9 ^ 1360022844);
            case 50 -> Il(-825244588, var9 ^ 1664027798);
            case 51 -> Il(-825244589, var9 ^ -412677834);
            case 52 -> Il(-825244590, var9 ^ -2103020968);
            case 53 -> Il(-825244591, var9 ^ -124379176);
            case 54 -> Il(-825244592, var9 ^ 1514255415);
            case 55 -> Il(-825244577, var9 ^ -1221957294);
            case 56 -> Il(-825244578, var9 ^ 416056213);
            case 57 -> Il(-825244579, var9 ^ 1587005433);
            case 58 -> Il(-825244580, var9 ^ -1082611094);
            case 59 -> Il(-825244581, var9 ^ 1000808463);
            case 60 -> Il(-825244582, var9 ^ 1857074153);
            case 61 -> Il(-825244583, var9 ^ -1324610861);
            case 62 -> Il(-825244584, var9 ^ 1407036305);
            case 63 -> Il(-825244633, var9 ^ -628695093);
            case 64 -> Il(-825244634, var9 ^ 459631788);
            case 65 -> Il(-825244635, var9 ^ -519627269);
            case 66 -> Il(-825244636, var9 ^ -1499361165);
            case 67 -> Il(-825244637, var9 ^ 1677765367);
            case 68 -> Il(-825244638, var9 ^ -41043951);
            case 69 -> Il(-825244639, var9 ^ 887463291);
            case 70 -> Il(-825244640, var9 ^ 888442916);
            case 71 -> Il(-825244625, var9 ^ -1259067468);
            case 72 -> Il(-825244626, var9 ^ -1302503596);
            case 73 -> Il(-825244627, var9 ^ 1469882797);
            case 74 -> Il(-825244628, var9 ^ 1553234652);
            case 75 -> Il(-825244629, var9 ^ -391764289);
            case 76 -> Il(-825244630, var9 ^ 1371638800);
            case 77 -> Il(-825244631, var9 ^ -484449110);
            case 78 -> Il(-825244632, var9 ^ -277447912);
            case 79 -> Il(-825244617, var9 ^ -212511793);
            case 80 -> Il(-825244618, var9 ^ -1265268747);
            case 81 -> Il(-825244619, var9 ^ 1675244706);
            case 82 -> Il(-825244620, var9 ^ 1216972762);
            case 83 -> Il(-825244621, var9 ^ -43979097);
            case 84 -> Il(-825244622, var9 ^ -1540101050);
            case 85 -> Il(-825244623, var9 ^ -1229229108);
            case 86 -> Il(-825244624, var9 ^ 823776815);
            case 87 -> Il(-825244609, var9 ^ 709788867);
            case 88 -> Il(-825244610, var9 ^ 1649961665);
            case 89 -> Il(-825244611, var9 ^ 2017531436);
            case 90 -> Il(-825244612, var9 ^ -872241177);
            case 91 -> Il(-825244613, var9 ^ 1916079676);
            case 92 -> Il(-825244614, var9 ^ -555213595);
            case 93 -> Il(-825244615, var9 ^ 122726623);
            case 94 -> Il(-825244616, var9 ^ 1945657256);
            case 95 -> Il(-825244665, var9 ^ -1324564384);
            case 96 -> Il(-825244666, var9 ^ 583197772);
            case 97 -> Il(-825244667, var9 ^ 1308949188);
            case 98 -> Il(-825244668, var9 ^ 1151760305);
            case 99 -> Il(-825244669, var9 ^ 841252887);
            case 100 -> Il(-825244670, var9 ^ -194336562);
            case 101 -> Il(-825244671, var9 ^ 1240596447);
            case 102 -> Il(-825244672, var9 ^ -1771770364);
            case 103 -> Il(-825244657, var9 ^ -1319835024);
            case 104 -> Il(-825244658, var9 ^ 132851646);
            case 105 -> Il(-825244659, var9 ^ 1720093901);
            case 106 -> Il(-825244660, var9 ^ -1497900274);
            case 107 -> Il(-825244661, var9 ^ -1984148103);
            case 108 -> Il(-825244662, var9 ^ 1543880230);
            case 109 -> Il(-825244663, var9 ^ 1824248714);
            case 110 -> Il(-825244664, var9 ^ 1232744138);
            case 111 -> Il(-825244649, var9 ^ 844321484);
            case 112 -> Il(-825244650, var9 ^ 2146451378);
            case 113 -> Il(-825244651, var9 ^ 1921424086);
            case 114 -> Il(-825244652, var9 ^ -2039245757);
            case 115 -> Il(-825244653, var9 ^ -1118972916);
            case 116 -> Il(-825244654, var9 ^ 1202112569);
            case 117 -> Il(-825244655, var9 ^ -1822511351);
            case 118 -> Il(-825244656, var9 ^ -1347677820);
            case 119 -> 0;
            case 120 -> Il(-825244641, var9 ^ -2060660236);
            case 121 -> Il(-825244642, var9 ^ 1316885279);
            case 122 -> Il(-825244643, var9 ^ 2115332733);
            case 123 -> 1;
            case 124 -> Il(-825244644, var9 ^ 823534151);
            case 125 -> Il(-825244645, var9 ^ -781732710);
            case 126 -> Il(-825244646, var9 ^ 179909596);
            case 127 -> Il(-825244647, var9 ^ 794217999);
            case 128 -> Il(-825244648, var9 ^ -1945026329);
            case 129 -> Il(-825244441, var9 ^ -91693769);
            case 130 -> Il(-825244442, var9 ^ -1385067542);
            case 131 -> Il(-825244443, var9 ^ 666415298);
            case 132 -> Il(-825244444, var9 ^ -65350852);
            case 133 -> Il(-825244445, var9 ^ 1653167107);
            case 134 -> Il(-825244446, var9 ^ -18349799);
            case 135 -> Il(-825244447, var9 ^ 1778266441);
            case 136 -> Il(-825244448, var9 ^ -633085241);
            case 137 -> Il(-825244433, var9 ^ -1449134848);
            case 138 -> Il(-825244434, var9 ^ 289048950);
            case 139 -> Il(-825244435, var9 ^ -783403590);
            case 140 -> Il(-825244436, var9 ^ 567747972);
            case 141 -> Il(-825244437, var9 ^ -1216150782);
            case 142 -> Il(-825244438, var9 ^ -1783156132);
            case 143 -> Il(-825244439, var9 ^ -159742329);
            case 144 -> Il(-825244440, var9 ^ 2120615744);
            case 145 -> Il(-825244425, var9 ^ -1246756675);
            case 146 -> Il(-825244426, var9 ^ -1937679619);
            case 147 -> Il(-825244427, var9 ^ -1569684901);
            case 148 -> Il(-825244428, var9 ^ 174371235);
            case 149 -> Il(-825244429, var9 ^ 70798411);
            case 150 -> Il(-825244430, var9 ^ -1525412683);
            case 151 -> Il(-825244431, var9 ^ -471436220);
            case 152 -> Il(-825244432, var9 ^ -581900629);
            case 153 -> Il(-825244417, var9 ^ -236654556);
            case 154 -> Il(-825244418, var9 ^ -2067324540);
            case 155 -> Il(-825244419, var9 ^ 1954671308);
            case 156 -> Il(-825244420, var9 ^ 366347927);
            case 157 -> Il(-825244421, var9 ^ -248719159);
            case 158 -> Il(-825244422, var9 ^ 880081384);
            case 159 -> Il(-825244423, var9 ^ 286503595);
            case 160 -> Il(-825244424, var9 ^ 1045091663);
            case 161 -> Il(-825244473, var9 ^ -1110158148);
            case 162 -> Il(-825244474, var9 ^ 1330872102);
            case 163 -> Il(-825244475, var9 ^ -826247659);
            case 164 -> Il(-825244476, var9 ^ 727304121);
            case 165 -> Il(-825244477, var9 ^ -1024746460);
            case 166 -> Il(-825244478, var9 ^ -1097629909);
            case 167 -> Il(-825244479, var9 ^ 1705133909);
            case 168 -> Il(-825244480, var9 ^ 1340748142);
            case 169 -> Il(-825244465, var9 ^ -1487362383);
            case 170 -> Il(-825244466, var9 ^ 400534486);
            case 171 -> Il(-825244467, var9 ^ 1865479762);
            case 172 -> Il(-825244468, var9 ^ 338516104);
            case 173 -> Il(-825244469, var9 ^ -643123335);
            case 174 -> Il(-825244470, var9 ^ -1777918811);
            case 175 -> Il(-825244471, var9 ^ -87655869);
            case 176 -> Il(-825244472, var9 ^ -1943862127);
            case 177 -> Il(-825244457, var9 ^ 835934742);
            case 178 -> Il(-825244458, var9 ^ -1591670288);
            case 179 -> Il(-825244459, var9 ^ 2014569063);
            case 180 -> Il(-825244460, var9 ^ -905706536);
            case 181 -> Il(-825244461, var9 ^ 753559855);
            case 182 -> Il(-825244462, var9 ^ 709948101);
            case 183 -> Il(-825244463, var9 ^ -1657686107);
            case 184 -> Il(-825244464, var9 ^ -588758726);
            case 185 -> Il(-825244449, var9 ^ 1129207569);
            case 186 -> Il(-825244450, var9 ^ 2018732925);
            case 187 -> Il(-825244451, var9 ^ -68939916);
            case 188 -> Il(-825244452, var9 ^ 1428958796);
            case 189 -> Il(-825244453, var9 ^ -1089835679);
            case 190 -> Il(-825244454, var9 ^ -1690490212);
            case 191 -> Il(-825244455, var9 ^ 1477554144);
            case 192 -> Il(-825244456, var9 ^ 305072451);
            case 193 -> Il(-825244505, var9 ^ -1784591703);
            case 194 -> Il(-825244506, var9 ^ 2002890460);
            case 195 -> Il(-825244507, var9 ^ -663319299);
            case 196 -> Il(-825244508, var9 ^ 210452350);
            case 197 -> 4;
            case 198 -> Il(-825244509, var9 ^ -1093200037);
            case 199 -> Il(-825244510, var9 ^ -977189526);
            case 200 -> Il(-825244511, var9 ^ 815528852);
            case 201 -> Il(-825244512, var9 ^ 1706199745);
            case 202 -> Il(-825244497, var9 ^ -1512133299);
            case 203 -> Il(-825244498, var9 ^ -1198512024);
            case 204 -> Il(-825244499, var9 ^ 1336026021);
            case 205 -> Il(-825244500, var9 ^ -1044810600);
            case 206 -> Il(-825244501, var9 ^ -2086047770);
            case 207 -> Il(-825244502, var9 ^ 1634307152);
            case 208 -> Il(-825244503, var9 ^ -1211184644);
            case 209 -> Il(-825244504, var9 ^ 69436929);
            case 210 -> Il(-825244489, var9 ^ 885876448);
            case 211 -> Il(-825244490, var9 ^ -699756102);
            case 212 -> Il(-825244491, var9 ^ 845143453);
            case 213 -> Il(-825244492, var9 ^ -505598141);
            case 214 -> Il(-825244493, var9 ^ 1180381574);
            case 215 -> Il(-825244494, var9 ^ -413888245);
            case 216 -> Il(-825244495, var9 ^ -2075731715);
            case 217 -> Il(-825244496, var9 ^ 45368129);
            case 218 -> Il(-825244481, var9 ^ -1757989912);
            case 219 -> Il(-825244482, var9 ^ -1270980701);
            case 220 -> Il(-825244483, var9 ^ -1581996401);
            case 221 -> Il(-825244484, var9 ^ 190673089);
            case 222 -> Il(-825244485, var9 ^ 1719445038);
            case 223 -> Il(-825244486, var9 ^ 53860781);
            case 224 -> Il(-825244487, var9 ^ -1384453491);
            case 225 -> Il(-825244488, var9 ^ -241696564);
            case 226 -> Il(-825244537, var9 ^ 1261506540);
            case 227 -> Il(-825244538, var9 ^ -1535025018);
            case 228 -> Il(-825244539, var9 ^ 1834518177);
            case 229 -> Il(-825244540, var9 ^ -733234703);
            case 230 -> 2;
            case 231 -> Il(-825244541, var9 ^ -275975737);
            case 232 -> Il(-825244542, var9 ^ -548016434);
            case 233 -> Il(-825244543, var9 ^ -935819600);
            case 234 -> Il(-825244544, var9 ^ -1002576716);
            case 235 -> Il(-825244529, var9 ^ 1468983409);
            case 236 -> Il(-825244530, var9 ^ 207566762);
            case 237 -> Il(-825244531, var9 ^ -1157831438);
            case 238 -> Il(-825244532, var9 ^ -919676096);
            case 239 -> Il(-825244533, var9 ^ -2128094);
            case 240 -> Il(-825244534, var9 ^ -2071091531);
            case 241 -> Il(-825244535, var9 ^ -869738174);
            case 242 -> Il(-825244536, var9 ^ -1748300926);
            case 243 -> Il(-825244521, var9 ^ -1604016037);
            case 244 -> Il(-825244522, var9 ^ 1701123300);
            case 245 -> Il(-825244523, var9 ^ -1298204647);
            case 246 -> Il(-825244524, var9 ^ -736143401);
            case 247 -> Il(-825244525, var9 ^ -1536807553);
            case 248 -> Il(-825244526, var9 ^ 1323429717);
            case 249 -> Il(-825244527, var9 ^ -2007244015);
            case 250 -> Il(-825244528, var9 ^ -879311193);
            case 251 -> Il(-825244513, var9 ^ 2145708505);
            case 252 -> Il(-825244514, var9 ^ 1389844132);
            case 253 -> Il(-825244515, var9 ^ -1257334144);
            case 254 -> Il(-825244516, var9 ^ -1811596593);
            default -> Il(-825244517, var9 ^ -1101568684);
         };
         int var5 = (var1 & Il(-825244518, var9 ^ -1825185664)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Il(-825244519, var9 ^ 1522511908)) >>> Il(-825244520, var9 ^ 82451820)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Il(-825244313, var9 ^ -1128141711);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Il(-825244314, var9 ^ -226986788);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }

   private static String lI(int var0, short var1, int var2) {
      int var3 = var0 ^ 63438;
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])III[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         III[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 30766;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 7090;
         var10 += 33679;
         var10 -= 11765;
         var10 += 54222;
         var10 -= 22483;
         var10 ^= 14821;
         var10 -= 59810;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private lIIIIl(IlIllIllI var1) {
      this.l = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1569995387;
      int var11 = 0;
      String[] var9 = new String[2];
      short var12 = 24744;
      int var10 = 0;
      int var8 = "=쉾㺆Ⱈ묹꤃ʊ\ueb99輡烶䠣紸ඓ⽲\u31ed\u2458f❫͍侴肏첀쥍鶷䦊粱幦ꥶ\ue8d8ക曈酽쿡섣鏉蕧歹\uf651긲靷ൣ\u0cd3꫰쒚䶩戋踁⹛ቹㅬ\ud98d钹蛣洒컌炙ܙ䬗수儹뀂芴\u000f廛蹝뼃\udf84썾潳ⷧ⫂\ue3b1窛觜鵷귮滯秆".length();
      String var7 = "=쉾㺆Ⱈ묹꤃ʊ\ueb99輡烶䠣紸ඓ⽲\u31ed\u2458f❫͍侴肏첀쥍鶷䦊粱幦ꥶ\ue8d8ക曈酽쿡섣鏉蕧歹\uf651긲靷ൣ\u0cd3꫰쒚䶩戋踁⹛ቹㅬ\ud98d钹蛣洒컌炙ܙ䬗수儹뀂芴\u000f廛蹝뼃\udf84썾潳ⷧ⫂\ue3b1窛觜鵷귮滯秆";

      do {
         char var13 = var7.charAt(var11);
         String var10000 = var7.substring(var11 + 1, var11 + 1 + var13);
         int var15 = 0;
         char[] var14 = var10000.toCharArray();

         do {
            char var16 = var14[var15];
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

      ll = var9;
      III = new Object[var9.length];
      int var20 = 0;
      int var10001 = 0;
      lI = new int[284];
      byte[] var10002 = "ÕVÄ<\u0016¤í\u007f¸Ø\u0093Àt9ã¦\u0093÷8\u0086ÑÑ²í^5¸²¥¹\u0088\u0016\u0014\u008d°_6#¾Ï:,X.\u0018¸\u0082®¹Ò±\\á_`§\u008eÁ\u008f\u000f£]\u008c¬GÛ\u0095ìõ)\u0007\u0016ô·¤x8&U\tL¬\u0089CÂ8ÊÆ÷ð\u008cÐÆ\u0018\róë©üX\u0088]\u0003b\b?\u00069¾»¥Þ\u000bÀ>MU¤ãiv\tZwê\u008eãGSl\u0096ép§pM\u00adÛ\u001c\u008dÀ!½/\tO ¿T5\u009fmCù\u0018=\"Ã\u0089Á\u0007ÀÜ·«\u0089z\u009f\u000eû\u0014H5@³µ\u008b#Ê±\u0003â\u0012ôü\\\u0001N¹í!Ý\u00032þô¨QÄ\u0015\u0004+\u000066\u0014A\u007f²\\DÚ×\u009d?7\u00ad\u00adR%\u000fzù+â\u0011$]M÷Îs\u000b¬\u0089§êCçén\u009cnw;\u008bý©ä7G;\u0006ææ±\u008f½\u00928N^!ï´<P´ó\u009aÝ\f1;ç6¨¶õÉaÞÐ®aÏÝiáÏjTçf\u0012¦\u0002§ìV\t¯7\u0001½\u009dkZ\u0004úÁ\\¶$©RºM5\u0017¦n\u001eºá®Êx6áy8\u001d²Ê\u009f¨[£mñ\b¢cã\u0080>\u0002d\"\u0098\u0006\u007fuÉ\u00137c'L-z[¥\u00999ê¦'\u000eCï\u008bÓQXRkå/&Ã\u00120ä7\u008d^wùªH\u001b?·\u0089\u0011\u009d:ég\u001fÎ?¡QåY\u001cÊ²\rÃ_£\u008bäo§\rRÐjî3½Á6ó\u008c\u00954Ü\u0087\u0003R\t>ój9\u0080\u009eÎ\u001cAc\u009agh\u001cî*ËrÄ'½×\u0090ÓHÙþèv\u009a\u000f\u0012\u009d\u0085éÆeâÓú\u0097\\IÐ\u0017\u009c\u0085\u001bE]\u0014+.'Ãd-o¥\u0084\\ùö_\u0082}özm\u0080\u0005Ù*\r-¯³\u0090\u0089øJÆÕr\u0083ýð©!\u009ez7²\u001aÏ«ÓL\u0099<Å|\u001f\u008fx¯ãü¤»óD\u0001Ä£\u0084uxctìknâ¸N<À\u008c|\u0097£AË\u009c+]I£à\u008bM5Ùº\u0017\u0095÷KÏ7__ü<Q\u0003\u0001\u0004ð/A(¶Ý9Ü\u0088k«\u009d¤ß½\u00adÑülû!º§Û@íK\u0007¤\u0017\u0096\u001eaO´ÌD(ückq\u0098'èï\u0019\u0087\u001ah2D\u009bû8ß~b\u008aA\u0097ÐÑ|ë¨1Ú0\u0099\n$\u001aÑ\u007f«òcë\u0090Bäæ\u009d:\u000b»ÅA\u0016\u0015Õ\u008c\u0091ú1Ã<Rb¯ý7\nÙ\u0018I\u000bdè\u0017\u0084ô\u001aDÁ-(¯ç\u009f?M\u0012yÑ$,\u007fk¿^È\nùf\u0089Ó\f_\u0016u\u001a\u0093-h&\u009c®ßBé\u0000\u0017ckê1 %Î\u0006g£\r*á-G\u0014DrÀ\u009a\u0007¼\"Zãç\u008dMÂ@Y°rFëìZ\u0019\u0090ú\bDe ¶Ù0\u0089Ç÷ðåà\u0099í«em\u001a\u0099nì\u0094\u00829\u008eÖ\u0092!C4RÁ\râõ\u0084\u009fQ\u0018È\u0084aö(\u007f\u0083qÜªgd\u0093$´æaÒ\u0013`\u007f*²oÜèÑ}\u0095\u0018W\u008f\røÂ\f~¢á\u0005\u0012Çô\u008fëQ^f=63GëRV\u000e\u0097\u0010øA§÷¤£M\u0004\u001e\nB³ñº-ð8cËZ\u0081p÷uº·¼z\u008an£Ö\u009d\u0003ËD\u0091\u0006ª\u0010\u0002µ¦èYdz\u001cïÇ©ç\u009c\u0015\u0096\rªäÊÓÑ¶ë\u0086\u0099\u0013\u0094ªÂðF«õ_å'0^Yåç¥¶¥\u0081$\u001a\u0002ñ]`I\u001bÚ¡ÚÝ`\u00ad\u0084\u009e\u00ad\u008b_*ß¤\u0001\u0007ì\u001b]à5×ýÁ>w/ël+ýÆ\u000e\u00ad\u0092\u000f\u0085ø5QÑP\u0011éú \u009e§C82\u0013<\u001dõµ+¨\u007ftK\u0089\u001eÿ.\u0014\u007f%_[÷\u0007\f\u001fò¦¯èµ¿\u001dçÞü\tG\u0098\u0087$*±¯Û\u0094Vk¢\u001bØ4Ä\u001a%)ÜIoÈN\u0084J%MoÈ\u009e2\u0007\u009açf\u0017\u0097`6vq\u0004H\u0000m¼C\u008e\u009a·É{¢\u001a|]\u001dº=ÔMà=\u0016oø5\u0099\u0091"
         .getBytes("ISO-8859-1");

      int var53;
      do {
         lI[var20] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1186512616;
         var20 += 1;
         var53 = var10001 + 4;
         var10001 += 4;
      } while (var53 < var10002.length);

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lI(63438, (short)17524, var17 ^ 1813208437)).length();
      int var1 = Il(-825244297, var17 ^ 498000868);
      int var19 = -1;

      label93:
      while (true) {
         var20 = Il(-825244298, var17 ^ -257095661);
         String var25 = var2.substring(++var19, var19 + var1);
         byte var37 = -1;

         while (true) {
            label88: {
               char[] var55 = var25.toCharArray();
               int var67 = var55.length;
               int var6 = 0;
               var53 = var20;
               var42 = var55;
               var10001 = var67;
               char[] var79;
               int var86;
               if (var67 <= 1) {
                  var79 = var55;
                  var67 = var20;
                  var86 = var6;
               } else {
                  var53 = var20;
                  var10001 = var67;
                  if (var67 <= var6) {
                     break label88;
                  }

                  var79 = var55;
                  var67 = var20;
                  var86 = var6;
               }

               while (true) {
                  var79[var86] = (char)(var79[var86] ^ var67 ^ switch (var6 % Il(-825244301, var17 ^ -1244262014)) {
                     case 0 -> Il(-825244302, var17 ^ -777493398);
                     case 1 -> Il(-825244303, var17 ^ 1772349792);
                     case 2 -> Il(-825244304, var17 ^ 1646862225);
                     case 3 -> Il(-825244289, var17 ^ -811844926);
                     case 4 -> Il(-825244290, var17 ^ 1876799601);
                     case 5 -> Il(-825244291, var17 ^ 903705168);
                     default -> Il(-825244292, var17 ^ 768998819);
                  });
                  var6++;
                  if (var53 == 0) {
                     var86 = var53;
                     var79 = var42;
                     var67 = var53;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var79 = var42;
                     var67 = var53;
                     var86 = var6;
                  }
               }
            }

            String var60 = new String(var42).intern();
            switch (var37) {
               case 0:
                  var5[var3++] = var60;
                  if ((var19 += var1) >= var4) {
                     Il = var5;
                     II = new String[4];
                     I = new String[4];
                     l();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var60;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label93;
                  }

                  var4 = (var2 = lI(63439, (short)'隯', var17 ^ -291030808)).length();
                  var1 = Il(-825244299, var17 ^ 1272078440);
                  var19 = -1;
            }

            var20 = Il(-825244300, var17 ^ 847672212);
            var25 = var2.substring(++var19, var19 + var1);
            var37 = 0;
         }
      }
   }

   private static void l() {
      int var0 = 1284345163;
      I[0] = II(I(Il(-825244315, var0 ^ -674809067), Il(-825244316, var0 ^ 1909609137)).toCharArray(), 39206L, Il(-825244317, var0 ^ -1846183063));
      I[1] = II(I(Il(-825244318, var0 ^ 1003827841), Il(-825244319, var0 ^ -509314976)).toCharArray(), 22836L, Il(-825244320, var0 ^ 1708643117));
      I[2] = II(I(Il(-825244305, var0 ^ 1649725020), Il(-825244306, var0 ^ 2078542859)).toCharArray(), 34965L, Il(-825244307, var0 ^ 524160190));
      I[3] = II(I(Il(-825244308, var0 ^ 1138691166), Il(-825244309, var0 ^ 1797414980)).toCharArray(), 77288L, Il(-825244310, var0 ^ -305993045));
   }

   private static int Il(int var0, int var1) {
      int var2 = lI[var0 ^ -825244569] ^ var1 ^ var0;
      var2 += 26530;
      var2 += 65319;
      var2 ^= 45443;
      var2 ^= 20232;
      var2 ^= 42251;
      var2 ^= 45396;
      var2 ^= 30841;
      var2 += 35028;
      var2 += 59790;
      return var2 - 17500;
   }

   private static String II(char[] var0, long var1, int var3) {
      int var4 = Il(-825244311, 1171407356 ^ 1277964797) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & Il(-825244312, 1171407356 ^ -461744792);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
