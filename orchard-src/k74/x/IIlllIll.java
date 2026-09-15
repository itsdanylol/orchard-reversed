package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class IIlllIll extends IlIIIIIIl {
   private static final String[] IlI;
   private static final String[] I;
   private static String[] II;
   private static final Object[] Ill;
   private boolean Il;
   private static final String[] lI;
   private int ll;
   private static final int[] IIl;
   private static final int III = 2;

   private static void I() {
      int var0 = 295586148;
      II[0] = l(ll(llI(987580908, var0 ^ 1613677152), llI(987580909, var0 ^ -2059406193)).toCharArray(), 55335L, llI(987580910, var0 ^ -1434007910));
      II[1] = l(ll(llI(987580911, var0 ^ -1898986480), llI(987580904, var0 ^ -963887562)).toCharArray(), 87585L, llI(987580905, var0 ^ -347464354));
   }

   private static String lll(char var0, int var1, int var2) {
      int var3 = var0 ^ 20626;
      char[] var4 = IlI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])Ill[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         Ill[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10638;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 'ꏘ';
         var10 += 51551;
         var10 -= 58088;
         var10 -= 2743;
         var10 -= 47202;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static String l(char[] var0, long var1, int var3) {
      int var4 = llI(987580906, -1197536072 ^ -279516948) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & llI(987580907, -1197536072 ^ -581705382);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public boolean II(class_310 var1) {
      if (this.IIIIlIl() && var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1690 != null && var1.field_1755 == null) {
         class_746 var2 = var1.field_1724;
         return var2.method_5805()
            && !var2.method_31549().field_7479
            && !var2.method_5715()
            && !var2.method_6115()
            && !var2.method_6101()
            && !var2.method_5799()
            && !var2.method_5869()
            && !IIll.IllIllI(var2)
            && var1.field_1690.field_1894.method_1434()
            && !var1.field_1690.field_1881.method_1434();
      } else {
         return false;
      }
   }

   private boolean Il(class_310 var1, class_746 var2) {
      return var2.method_5805()
         && !var2.method_31549().field_7479
         && !var2.method_5715()
         && !var1.field_1690.field_1903.method_1434()
         && !var2.method_6101()
         && !var2.method_5799()
         && !var2.method_5869()
         && !IIll.IllIllI(var2)
         && this.lIl(var1);
   }

   public boolean lI(class_310 var1) {
      if (this.IIIIlIl() && var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1755 == null) {
         class_746 var2 = var1.field_1724;
         if (!this.Il(var1, var2)) {
            this.III();
            return false;
         } else if (this.Ill(var1, var2)) {
            this.Il = true;
            this.ll = 2;
            return true;
         } else if (this.Il && this.ll > 0) {
            this.ll--;
            return true;
         } else {
            this.III();
            return false;
         }
      } else {
         this.III();
         return false;
      }
   }

   private static String ll(int var0, int var1) {
      int var9 = -1319888455;
      int var2 = (var0 ^ llI(987580926, var9 ^ 1950127665)) & llI(987580927, var9 ^ -774088465);
      if (lI[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & llI(987580920, var9 ^ 1219350778)) {
            case 0 -> llI(987580921, var9 ^ -1811745650);
            case 1 -> llI(987580922, var9 ^ 1957324600);
            case 2 -> llI(987580923, var9 ^ 1573721752);
            case 3 -> llI(987580916, var9 ^ -443955086);
            case 4 -> llI(987580917, var9 ^ 2022003352);
            case 5 -> llI(987580918, var9 ^ -80320186);
            case 6 -> llI(987580919, var9 ^ 748018098);
            case 7 -> llI(987580912, var9 ^ -1026624746);
            case 8 -> llI(987580913, var9 ^ 2114049248);
            case 9 -> llI(987580914, var9 ^ 110976300);
            case 10 -> llI(987580915, var9 ^ -1265733522);
            case 11 -> llI(987580876, var9 ^ -1648715284);
            case 12 -> llI(987580877, var9 ^ 1986031073);
            case 13 -> llI(987580878, var9 ^ 1996554521);
            case 14 -> llI(987580879, var9 ^ 622106420);
            case 15 -> llI(987580872, var9 ^ 1307213403);
            case 16 -> llI(987580873, var9 ^ -1467271857);
            case 17 -> llI(987580874, var9 ^ -2076988418);
            case 18 -> llI(987580875, var9 ^ -1710007578);
            case 19 -> llI(987580868, var9 ^ 127185505);
            case 20 -> llI(987580869, var9 ^ 163272653);
            case 21 -> llI(987580870, var9 ^ 1271924099);
            case 22 -> llI(987580871, var9 ^ 264804055);
            case 23 -> llI(987580864, var9 ^ 1162834614);
            case 24 -> llI(987580865, var9 ^ -1144180928);
            case 25 -> llI(987580866, var9 ^ 616985616);
            case 26 -> llI(987580867, var9 ^ 1780968355);
            case 27 -> llI(987580892, var9 ^ 936438066);
            case 28 -> llI(987580893, var9 ^ 1490201616);
            case 29 -> llI(987580894, var9 ^ 1859912692);
            case 30 -> llI(987580895, var9 ^ 1241091030);
            case 31 -> llI(987580888, var9 ^ 1105282293);
            case 32 -> 4;
            case 33 -> llI(987580889, var9 ^ -1107656838);
            case 34 -> llI(987580890, var9 ^ 166950250);
            case 35 -> llI(987580891, var9 ^ 942328062);
            case 36 -> llI(987580884, var9 ^ 1546480167);
            case 37 -> llI(987580885, var9 ^ -1786889283);
            case 38 -> llI(987580886, var9 ^ 918077959);
            case 39 -> llI(987580887, var9 ^ 607318393);
            case 40 -> llI(987580880, var9 ^ -512432367);
            case 41 -> llI(987580881, var9 ^ 528624840);
            case 42 -> llI(987580882, var9 ^ -1444009582);
            case 43 -> llI(987580883, var9 ^ 2052868491);
            case 44 -> llI(987580844, var9 ^ 145803582);
            case 45 -> llI(987580845, var9 ^ 1592435350);
            case 46 -> llI(987580846, var9 ^ -110099163);
            case 47 -> llI(987580847, var9 ^ -2060843836);
            case 48 -> llI(987580840, var9 ^ -70835231);
            case 49 -> llI(987580841, var9 ^ 1559368576);
            case 50 -> llI(987580842, var9 ^ -1330746318);
            case 51 -> llI(987580843, var9 ^ 746623090);
            case 52 -> llI(987580836, var9 ^ -1276042697);
            case 53 -> llI(987580837, var9 ^ 366368289);
            case 54 -> llI(987580838, var9 ^ 269939415);
            case 55 -> llI(987580839, var9 ^ 1804307769);
            case 56 -> llI(987580832, var9 ^ -341203107);
            case 57 -> llI(987580833, var9 ^ -58596365);
            case 58 -> llI(987580834, var9 ^ 396704844);
            case 59 -> llI(987580835, var9 ^ 1354313149);
            case 60 -> llI(987580860, var9 ^ -101241355);
            case 61 -> llI(987580861, var9 ^ -1385764394);
            case 62 -> llI(987580862, var9 ^ 266504506);
            case 63 -> llI(987580863, var9 ^ 1642723967);
            case 64 -> llI(987580856, var9 ^ -407371367);
            case 65 -> llI(987580857, var9 ^ -589834033);
            case 66 -> llI(987580858, var9 ^ 1671099123);
            case 67 -> 5;
            case 68 -> llI(987580859, var9 ^ 550345550);
            case 69 -> llI(987580852, var9 ^ 46260443);
            case 70 -> llI(987580853, var9 ^ 1289791830);
            case 71 -> llI(987580854, var9 ^ -1434372477);
            case 72 -> llI(987580855, var9 ^ -530795153);
            case 73 -> llI(987580848, var9 ^ -1777901237);
            case 74 -> llI(987580849, var9 ^ 1735793788);
            case 75 -> llI(987580850, var9 ^ -1999263912);
            case 76 -> llI(987580851, var9 ^ -1539250806);
            case 77 -> llI(987580812, var9 ^ -2034199838);
            case 78 -> llI(987580813, var9 ^ -1112720595);
            case 79 -> llI(987580814, var9 ^ -904515078);
            case 80 -> llI(987580815, var9 ^ 2025397590);
            case 81 -> llI(987580808, var9 ^ -1250591717);
            case 82 -> llI(987580809, var9 ^ -1239111723);
            case 83 -> llI(987580810, var9 ^ 1171588195);
            case 84 -> llI(987580811, var9 ^ 372416250);
            case 85 -> llI(987580804, var9 ^ 1734410117);
            case 86 -> llI(987580805, var9 ^ 334873565);
            case 87 -> llI(987580806, var9 ^ -1421621235);
            case 88 -> llI(987580807, var9 ^ -1148992122);
            case 89 -> llI(987580800, var9 ^ 345407869);
            case 90 -> llI(987580801, var9 ^ 12504163);
            case 91 -> llI(987580802, var9 ^ 347418207);
            case 92 -> llI(987580803, var9 ^ -1125989554);
            case 93 -> llI(987580828, var9 ^ 69362423);
            case 94 -> llI(987580829, var9 ^ -707399557);
            case 95 -> llI(987580830, var9 ^ 1560481141);
            case 96 -> llI(987580831, var9 ^ 627094348);
            case 97 -> llI(987580824, var9 ^ 549730623);
            case 98 -> llI(987580825, var9 ^ -643176411);
            case 99 -> llI(987580826, var9 ^ -664013148);
            case 100 -> llI(987580827, var9 ^ 363668545);
            case 101 -> llI(987580820, var9 ^ -710122198);
            case 102 -> llI(987580821, var9 ^ -1375139023);
            case 103 -> llI(987580822, var9 ^ 1074378228);
            case 104 -> llI(987580823, var9 ^ -2113769813);
            case 105 -> llI(987580816, var9 ^ 466098638);
            case 106 -> llI(987580817, var9 ^ 618513588);
            case 107 -> llI(987580818, var9 ^ 2018630366);
            case 108 -> llI(987580819, var9 ^ 1429237052);
            case 109 -> llI(987580780, var9 ^ 768359463);
            case 110 -> llI(987580781, var9 ^ 1626705534);
            case 111 -> llI(987580782, var9 ^ -1760674099);
            case 112 -> llI(987580783, var9 ^ -1215058190);
            case 113 -> 0;
            case 114 -> llI(987580776, var9 ^ 1650573626);
            case 115 -> llI(987580777, var9 ^ 145903058);
            case 116 -> 2;
            case 117 -> llI(987580778, var9 ^ 1030030114);
            case 118 -> llI(987580779, var9 ^ 510700560);
            case 119 -> llI(987580772, var9 ^ 1452432345);
            case 120 -> llI(987580773, var9 ^ -1286791982);
            case 121 -> llI(987580774, var9 ^ 1943268359);
            case 122 -> llI(987580775, var9 ^ 397104129);
            case 123 -> llI(987580768, var9 ^ -1554699660);
            case 124 -> llI(987580769, var9 ^ -819034707);
            case 125 -> llI(987580770, var9 ^ 552948319);
            case 126 -> llI(987580771, var9 ^ 348203876);
            case 127 -> llI(987580796, var9 ^ 231915036);
            case 128 -> llI(987580797, var9 ^ 1413987094);
            case 129 -> llI(987580798, var9 ^ 335298342);
            case 130 -> llI(987580799, var9 ^ 1631767509);
            case 131 -> llI(987580792, var9 ^ 733402685);
            case 132 -> llI(987580793, var9 ^ 995827084);
            case 133 -> llI(987580794, var9 ^ -496055362);
            case 134 -> llI(987580795, var9 ^ -615018856);
            case 135 -> llI(987580788, var9 ^ 997054625);
            case 136 -> llI(987580789, var9 ^ -84749699);
            case 137 -> llI(987580790, var9 ^ 29405357);
            case 138 -> 3;
            case 139 -> llI(987580791, var9 ^ 343316989);
            case 140 -> llI(987580784, var9 ^ -44005576);
            case 141 -> llI(987580785, var9 ^ 457112192);
            case 142 -> llI(987580786, var9 ^ -725414862);
            case 143 -> llI(987580787, var9 ^ 1917053991);
            case 144 -> llI(987580748, var9 ^ -662995290);
            case 145 -> llI(987580749, var9 ^ -735965019);
            case 146 -> llI(987580750, var9 ^ -187690352);
            case 147 -> llI(987580751, var9 ^ -1337126654);
            case 148 -> llI(987580744, var9 ^ 286621758);
            case 149 -> llI(987580745, var9 ^ -1780331059);
            case 150 -> llI(987580746, var9 ^ -2037319208);
            case 151 -> llI(987580747, var9 ^ 916006634);
            case 152 -> llI(987580740, var9 ^ 2105377095);
            case 153 -> llI(987580741, var9 ^ -1224473839);
            case 154 -> llI(987580742, var9 ^ -1582326231);
            case 155 -> llI(987580743, var9 ^ -1287367457);
            case 156 -> llI(987580736, var9 ^ 352067170);
            case 157 -> llI(987580737, var9 ^ 627542046);
            case 158 -> llI(987580738, var9 ^ 1803697340);
            case 159 -> llI(987580739, var9 ^ -1651693267);
            case 160 -> llI(987580764, var9 ^ -1065157524);
            case 161 -> llI(987580765, var9 ^ 318505112);
            case 162 -> llI(987580766, var9 ^ -52311837);
            case 163 -> llI(987580767, var9 ^ -719313724);
            case 164 -> llI(987580760, var9 ^ -751373420);
            case 165 -> llI(987580761, var9 ^ 1461335912);
            case 166 -> llI(987580762, var9 ^ 1917937654);
            case 167 -> llI(987580763, var9 ^ 2043557232);
            case 168 -> llI(987580756, var9 ^ -1967749405);
            case 169 -> llI(987580757, var9 ^ 721197411);
            case 170 -> llI(987580758, var9 ^ -1014752679);
            case 171 -> llI(987580759, var9 ^ 598240234);
            case 172 -> llI(987580752, var9 ^ -427916767);
            case 173 -> llI(987580753, var9 ^ 1298551773);
            case 174 -> llI(987580754, var9 ^ 590411004);
            case 175 -> llI(987580755, var9 ^ 1896908993);
            case 176 -> llI(987580716, var9 ^ 1542170515);
            case 177 -> llI(987580717, var9 ^ -1757723670);
            case 178 -> llI(987580718, var9 ^ -1117334094);
            case 179 -> llI(987580719, var9 ^ 193990180);
            case 180 -> llI(987580712, var9 ^ 611733525);
            case 181 -> llI(987580713, var9 ^ -1225061168);
            case 182 -> llI(987580714, var9 ^ -168378768);
            case 183 -> 1;
            case 184 -> llI(987580715, var9 ^ -1988031812);
            case 185 -> llI(987580708, var9 ^ -1912339877);
            case 186 -> llI(987580709, var9 ^ 375215979);
            case 187 -> llI(987580710, var9 ^ -907437761);
            case 188 -> llI(987580711, var9 ^ -1128165734);
            case 189 -> llI(987580704, var9 ^ -2000223707);
            case 190 -> llI(987580705, var9 ^ -1666791052);
            case 191 -> llI(987580706, var9 ^ 725009177);
            case 192 -> llI(987580707, var9 ^ 183974542);
            case 193 -> llI(987580732, var9 ^ -1374228973);
            case 194 -> llI(987580733, var9 ^ 1111059470);
            case 195 -> llI(987580734, var9 ^ -2033452812);
            case 196 -> llI(987580735, var9 ^ -2100488311);
            case 197 -> llI(987580728, var9 ^ 1400075322);
            case 198 -> llI(987580729, var9 ^ 575430695);
            case 199 -> llI(987580730, var9 ^ -1216689192);
            case 200 -> llI(987580731, var9 ^ -1391730123);
            case 201 -> llI(987580724, var9 ^ -1814398891);
            case 202 -> llI(987580725, var9 ^ -1853984521);
            case 203 -> llI(987580726, var9 ^ -22898880);
            case 204 -> llI(987580727, var9 ^ -1252393718);
            case 205 -> llI(987580720, var9 ^ -428396625);
            case 206 -> llI(987580721, var9 ^ 1171350344);
            case 207 -> llI(987580722, var9 ^ 353605229);
            case 208 -> llI(987580723, var9 ^ -1495319132);
            case 209 -> llI(987580684, var9 ^ -1727565283);
            case 210 -> llI(987580685, var9 ^ 1242749121);
            case 211 -> llI(987580686, var9 ^ 1135369035);
            case 212 -> llI(987580687, var9 ^ -1086710388);
            case 213 -> llI(987580680, var9 ^ 2038383222);
            case 214 -> llI(987580681, var9 ^ -897761554);
            case 215 -> llI(987580682, var9 ^ 377001734);
            case 216 -> llI(987580683, var9 ^ -1342124490);
            case 217 -> llI(987580676, var9 ^ -1682265280);
            case 218 -> llI(987580677, var9 ^ 114050638);
            case 219 -> llI(987580678, var9 ^ 1005488773);
            case 220 -> llI(987580679, var9 ^ -1047380507);
            case 221 -> llI(987580672, var9 ^ 1489721135);
            case 222 -> llI(987580673, var9 ^ 802770888);
            case 223 -> llI(987580674, var9 ^ -982466660);
            case 224 -> llI(987580675, var9 ^ -1624971056);
            case 225 -> llI(987580700, var9 ^ -186880283);
            case 226 -> llI(987580701, var9 ^ -581519160);
            case 227 -> llI(987580702, var9 ^ -2011411326);
            case 228 -> llI(987580703, var9 ^ 1958073170);
            case 229 -> llI(987580696, var9 ^ 938785923);
            case 230 -> llI(987580697, var9 ^ 2076203347);
            case 231 -> llI(987580698, var9 ^ 1716489287);
            case 232 -> llI(987580699, var9 ^ 159334180);
            case 233 -> llI(987580692, var9 ^ 838862254);
            case 234 -> llI(987580693, var9 ^ -151052614);
            case 235 -> llI(987580694, var9 ^ -1997928265);
            case 236 -> llI(987580695, var9 ^ 813393592);
            case 237 -> llI(987580688, var9 ^ -559126941);
            case 238 -> llI(987580689, var9 ^ 267715176);
            case 239 -> llI(987580690, var9 ^ 1830349861);
            case 240 -> llI(987580691, var9 ^ 1532806286);
            case 241 -> llI(987580652, var9 ^ -1019853177);
            case 242 -> llI(987580653, var9 ^ -110023277);
            case 243 -> llI(987580654, var9 ^ 1028649641);
            case 244 -> llI(987580655, var9 ^ 1222468644);
            case 245 -> llI(987580648, var9 ^ 1941467511);
            case 246 -> llI(987580649, var9 ^ 1416777124);
            case 247 -> llI(987580650, var9 ^ 27445967);
            case 248 -> llI(987580651, var9 ^ -387858651);
            case 249 -> llI(987580644, var9 ^ 918335062);
            case 250 -> llI(987580645, var9 ^ 1924790876);
            case 251 -> llI(987580646, var9 ^ -347886489);
            case 252 -> llI(987580647, var9 ^ -729654418);
            case 253 -> llI(987580640, var9 ^ 1476395568);
            case 254 -> llI(987580641, var9 ^ 1494806912);
            default -> llI(987580642, var9 ^ 130456489);
         };
         int var5 = (var1 & llI(987580643, var9 ^ 200356156)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & llI(987580668, var9 ^ -660358326)) >>> llI(987580669, var9 ^ 1428895872)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & llI(987580670, var9 ^ -1911359370);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & llI(987580671, var9 ^ 430948166);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   private void III() {
      this.Il = false;
      this.ll = 0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1590198600;
      int var14 = "Y峼揥껣\ue31b꽄\uf388噺겷ￓ\uee9f윩磙㗚㝣蓄䬬㞜\u0530摮厝鰒ּ쑰靝蓭㍆䋾誳쯫쌀Ꭵౙ破\ud89fꔪ\uf487렀\ue285€爃㉥뗙卵䃥쑮䵔ﲐ뙒銂훤ꋤ\uf143\ue8caͮ跧依꾍緔ᇴ櫜ៃꃫ\u0088ꢄ\uf01a룂챒యꎙ솹็⊏ᳮ옢嫓ꆛ蘎甓﨨작⬺郾礿㎧趮绩풨眚⌷"
         .length();
      int var17 = 0;
      int var16 = 0;
      String var13 = "Y峼揥껣\ue31b꽄\uf388噺겷ￓ\uee9f윩磙㗚㝣蓄䬬㞜\u0530摮厝鰒ּ쑰靝蓭㍆䋾誳쯫쌀Ꭵౙ破\ud89fꔪ\uf487렀\ue285€爃㉥뗙卵䃥쑮䵔ﲐ뙒銂훤ꋤ\uf143\ue8caͮ跧依꾍緔ᇴ櫜ៃꃫ\u0088ꢄ\uf01a룂챒యꎙ솹็⊏ᳮ옢嫓ꆛ蘎甓﨨작⬺郾礿㎧趮绩풨眚⌷";
      short var18 = 10080;
      String[] var15 = new String[1];

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 64;
               case 1 -> 176;
               case 2 -> 18;
               case 3 -> 32;
               case 4 -> 5;
               case 5 -> 192;
               case 6 -> 167;
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

      IlI = var15;
      Ill = new Object[var15.length];
      int var9 = 1550503290;
      byte[] var7 = "\u0017\u0007$\u0002ò\u0016Ñ\u0000º\u000ek'ùæ\"nN[q6\u0081\u0094#ì\u00922zD\u0003{µ\u000f¾Ý>ôõCß\u008e\u0004\u009c\u008a|\u0016òR\n\u0000\u000ew\u008a.`~¸zö\u0004*ñÃ×ûV¥µðÜ\u0090{\u0084£ß \u009c\u0006>\u009a¯\u009fN\u0091½Cá³\u001c£I!!\u008a.P\u00962j\u008fþ¯f\u0013ß,Õ.¡ûv\u0098\u0010\u0015-´æ©â\u0095 Ñ~\u001cWcm1:JYÞH¡\u0083*q âGWò÷Ö´\u009a\t?Ì\u007fhtËSÐíÓMð\u001b§Ðwó÷ÞX\u0016\u0087\u009c3C©Ø+×J\u0092¬5\u0016l.h\u0086ó%5e½Ä,aà3®ñ\u008f1íg¹?D\u0013\u009e\u001aÌc\u0096\u0002\u00030j\u00198ØÞ\u00103`ïÉ\u008f_\u008bÎ,/B\u009dzäá[\u0084.óÑ°\u00066\u0097¦eÈak\t~\rhÑ\u00ad¿\u000efßS\u008f^\u0089\tå4.\u0093D\u0014RÉEØ,$e\u0080\u008b\u0011T\u001dgM-(ûc×þd\u0012c0Â5\u0017\u0011Çõ³!¼hÊÿ<Jæ®+b¤GÀF{Ó\u0087Zjx.\u0014k«z\u0085¯\u0080Ø\u0001Ïp¶\n»|0[FB\u000b4\u0099Ø´y³Ù÷.ÜÖÕ\"¦¶\u009b\u0003ï\u001a}bw\u008f7¿òèAä&ñ°\u0095[û_6á\u0019s£¤«Q#Õ`jN|\u008e\u001dõvj¯ZZÎb\u0096:YaÇæ×\u00926E¡ÁÑßÓ°\u0083¾\u00adÄ\u0016\u0082ù| \u008ekl`\u0082oÃuÀ]×]\u008bÀÃVo\u0096k\u0001\u0084½ÓÁ$\u0082\u00026±{\u008aàJñò\u0083ôÊ÷'x\u0001\u000eJ©\u0003\u000f\u0088·\u0086ÂNcÉ\u0002O\"\u0094yêL¿\u0097êó\u0084Uá(»Ì+X\u0017ó>\u0082ö¯²\u009bç\u0082Ó+wú/z°·\u0016É?@íxR`pïßµ\u0082\u0086-ßQ\u000b:ê\u0086E¢É\u0093ê \u0081q\u001aêd®]ñ¤0«\u0005ÀH\u0013\\t¶m\u0010\u0018ÍÂ¡÷\u0016\u0015\u0016Ã\"l\u001bÚ1ùh\u0083¤ü\u001eÄ\u001fy¢¶¡\u008a\"üU\u0091Nì¸ZÊ5\u008d\u008d\u001e\f´ÉÂì\u008e\u0099\u008e-\u0011\u0093\u008bÖ#÷èÃ\u0095Þã*\u0083Á\u0089ÌÝ¼,\u0003 KF¥ \u00adÒ\u000f\u00989é\u0003ÁV\u001a#3Uëg®W\u0083ÆöÆ¾B\u0001\u000bZQs¸\u0006ázg\u001aª\u009eÆ.`çD#vLÙ}d§\u0013ëÃ\u001f_\u009bò\u0084ÉÇ¼az9Jno\u008a\u0017aºÕÅ\u001fAH+\u0002\u0089÷\u0002ÃeÕ\u0004Õ²\u008f\u0080ùv\u0094¥²&è®-r\u0010]UÁÁý\u001fØ¨\u0014g[WôK-k1\u009dÅ\u0016\u009a\u0085\u0012\u0010ôÓµ\u0007¦óÏ¶\u008c\bæ1@Ø\u0004¢j\u0085\u0093kÜsHêó\u0095\u0011za\u0018K\u0087\"\u0015øØ^bK\u0012YçCÉÁ¾\u0011£\u001e\nÞ\u001ck\"Ï*_$DóKE\u0088\u0015üÕ\u0085ÔÝ\u0014{)yõ©[\u0095Ú+BQ(¹~U.PÔ\u0084\u00903-õ¯',`\u0099\u008atzè¤ÚD99ßF\u009d6\u0017)AÑ¡bºº\u001d1\u0094h\u008b\u00922\" ÂðÑ3q<z²Nä5h\u009dñ\u0099V\u0094O\u001d½hÙZÝ®\u009c\u0005\u0003\u001d\u009eyßÁ\u009bÐPgã\u0088ðLYìRÑ/\u0000¥ì\rËÕ\u0016q{ \u008f(\u00107ø:\u000eR\u0012\u0093ø\u0093HÇ©J#?/V\nµù\u0084_ÿ\u000b\u0095£V\u0094\"à\u0017ý\b¬#\u001e}±¬Ê\u0092Þ\u009cx=åãDF!\u001cY£_\tO\u0089ç\u0098!\u009e\tO ³Ø\u0016D\u0089ºû«E\u008c¿\u0082^\u0014Õ\u0006Æ.\u0092j¡ê¬²\u0006\u009f>$\u008e¤[1\"\u0083\u0091\u000bkÖA\u008aØ?\u0002ø&á_îæ¥Z¼\u0085< êý\u0003a\u001bÅ\u008fãB.\u008eû±ÔÐ%ÝbÜ\u0012q`\u000fAx\t\u0082È~CYñ¸7ÎLÿ\u0006"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IIl = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IIl[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lll('傒', var23 ^ -627583374, 20942)).length();
      int var1 = llI(987580900, var23 ^ -2036146133);
      int var0 = -1;

      while (true) {
         char[] var10002;
         label82: {
            int var27 = llI(987580901, var23 ^ -851705514);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var33 = var27;
            var10002 = var10003;
            int var28 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var27;
               var10006 = var6;
            } else {
               var33 = var27;
               var28 = var10004;
               if (var10004 <= var6) {
                  break label82;
               }

               var10005 = var10003;
               var10004 = var27;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % llI(987580902, var23 ^ 1021531324)) {
                  case 0 -> llI(987580903, var23 ^ 781028645);
                  case 1 -> llI(987580896, var23 ^ 946973003);
                  case 2 -> llI(987580897, var23 ^ 371171434);
                  case 3 -> llI(987580898, var23 ^ 1116330707);
                  case 4 -> llI(987580899, var23 ^ -910423805);
                  case 5 -> llI(987580924, var23 ^ 1859808028);
                  default -> llI(987580925, var23 ^ -454056829);
               });
               var6++;
               if (var33 == 0) {
                  var10006 = var33;
                  var10005 = var10002;
                  var10004 = var33;
               } else {
                  if (var28 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var33;
                  var10006 = var6;
               }
            }
         }

         String var35 = new String(var10002).intern();
         byte var30 = -1;
         var5[var3++] = var35;
         if ((var0 += var1) >= var4) {
            I = var5;
            lI = new String[2];
            II = new String[2];
            I();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   @Override
   public void llIl() {
      this.III();
   }

   public boolean IIl() {
      return false;
   }

   private static int llI(int var0, int var1) {
      int var2 = IIl[var0 ^ 987580908] ^ var1 ^ var0;
      var2 -= 30365;
      var2 ^= 65285;
      var2 -= 48697;
      var2 += 58517;
      var2 ^= 20563;
      var2 ^= 53643;
      return var2 ^ 16401;
   }

   private boolean Ill(class_310 var1, class_746 var2) {
      String[] var3 = IIllllIl.IIIIl();
      if (!var2.method_24828()) {
         return false;
      } else {
         class_2338 var4 = class_2338.method_49637(var2.method_23317(), var2.method_23318() - 0.5, var2.method_23321());
         if (var1.field_1687.method_8320(var4).method_26215()) {
            return true;
         } else {
            float var5 = 0.0F;
            float var6 = 0.0F;
            if (var1.field_1690.field_1894.method_1434()) {
               var5++;
            }

            if (var1.field_1690.field_1881.method_1434()) {
               var5--;
            }

            if (var1.field_1690.field_1913.method_1434()) {
               var6++;
            }

            if (var1.field_1690.field_1849.method_1434()) {
               var6--;
            }

            if (var5 == 0.0F && var6 == 0.0F) {
               return false;
            } else {
               double var7 = Math.sqrt(var5 * var5 + var6 * var6);
               var5 /= (float)var7;
               var6 /= (float)var7;
               float var9 = (float)Math.toRadians(var2.method_36454());
               double var10 = Math.sin(var9);
               double var12 = Math.cos(var9);
               double var14 = -var10 * var5 - var12 * var6;
               double var16 = var12 * var5 - var10 * var6;

               for (double var21 : new double[]{0.05, 0.15, 0.25, 0.35}) {
                  double var23 = var2.method_23317() + var14 * var21;
                  double var25 = var2.method_23321() + var16 * var21;
                  class_2338 var27 = class_2338.method_49637(var23, var2.method_23318() - 0.5, var25);
                  if (var1.field_1687.method_8320(var27).method_26215()) {
                     return true;
                  }

                  class_238 var28 = var2.method_5829().method_989(var14 * var21, -0.5, var16 * var21);
                  if (!var1.field_1687.method_20812(var2, var28).iterator().hasNext()) {
                     return true;
                  }

                  if (var3 != null) {
                     break;
                  }
               }

               IIIIlIIll var31 = IIIlIIll.III(var1, var2);
               return var31.ll() && var31.III();
            }
         }
      }
   }

   public IIlllIll() {
      super(IlIIllIII.Ill(II[0]), lllIIlIl.III, IlIIllIII.Ill(II[1]));
   }

   public float lII() {
      return 0.0F;
   }

   private boolean lIl(class_310 var1) {
      return var1.field_1690.field_1894.method_1434()
         || var1.field_1690.field_1881.method_1434()
         || var1.field_1690.field_1849.method_1434()
         || var1.field_1690.field_1913.method_1434();
   }
}
