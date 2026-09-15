package k74.x;

import k74.y.lIlIlllI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class lIIIl extends IlIIIIIIl {
   private static String[] I;
   private static final String[] ll;
   private static final int[] lI;
   private static final String[] II;
   private static final Object[] III;
   private static final String[] Il;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = Il(329549484, -840572229 ^ -885534577) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & Il(329549485, -840572229 ^ 1032058654);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String l(int var0, int var1) {
      int var9 = 635102971;
      int var2 = (var0 ^ Il(329549472, var9 ^ -1848829486)) & Il(329549473, var9 ^ -808317464);
      if (Il[var2] == null) {
         char[] var3 = II[var2].toCharArray();

         int var4 = switch (var3[0] & Il(329549474, var9 ^ -1729750958)) {
            case 0 -> Il(329549475, var9 ^ -295026168);
            case 1 -> Il(329549500, var9 ^ 2102423617);
            case 2 -> Il(329549501, var9 ^ -1634409784);
            case 3 -> Il(329549502, var9 ^ 895546918);
            case 4 -> Il(329549503, var9 ^ 1281224649);
            case 5 -> Il(329549496, var9 ^ -308444457);
            case 6 -> Il(329549497, var9 ^ -1086552992);
            case 7 -> Il(329549498, var9 ^ 386809444);
            case 8 -> Il(329549499, var9 ^ -205114178);
            case 9 -> Il(329549492, var9 ^ -1728540981);
            case 10 -> Il(329549493, var9 ^ 1245671932);
            case 11 -> Il(329549494, var9 ^ -1367165501);
            case 12 -> Il(329549495, var9 ^ 1970601034);
            case 13 -> Il(329549488, var9 ^ 60581396);
            case 14 -> Il(329549489, var9 ^ -2059199832);
            case 15 -> Il(329549490, var9 ^ -602622761);
            case 16 -> Il(329549491, var9 ^ -287816229);
            case 17 -> Il(329549452, var9 ^ -534225189);
            case 18 -> 2;
            case 19 -> Il(329549453, var9 ^ 441000380);
            case 20 -> Il(329549454, var9 ^ -925307203);
            case 21 -> Il(329549455, var9 ^ -1120998883);
            case 22 -> Il(329549448, var9 ^ -2118291887);
            case 23 -> Il(329549449, var9 ^ -925781553);
            case 24 -> Il(329549450, var9 ^ -1373585889);
            case 25 -> Il(329549451, var9 ^ -434745464);
            case 26 -> Il(329549444, var9 ^ -822640548);
            case 27 -> Il(329549445, var9 ^ 297475701);
            case 28 -> Il(329549446, var9 ^ 523181816);
            case 29 -> Il(329549447, var9 ^ 1977264290);
            case 30 -> Il(329549440, var9 ^ 1123669714);
            case 31 -> Il(329549441, var9 ^ -798542731);
            case 32 -> Il(329549442, var9 ^ -712419263);
            case 33 -> Il(329549443, var9 ^ 633302639);
            case 34 -> Il(329549468, var9 ^ -536858358);
            case 35 -> Il(329549469, var9 ^ 1652668160);
            case 36 -> Il(329549470, var9 ^ 10832027);
            case 37 -> Il(329549471, var9 ^ -358647677);
            case 38 -> Il(329549464, var9 ^ 1337518706);
            case 39 -> Il(329549465, var9 ^ -1901550563);
            case 40 -> Il(329549466, var9 ^ -709272262);
            case 41 -> Il(329549467, var9 ^ 1292817569);
            case 42 -> Il(329549460, var9 ^ -113387479);
            case 43 -> Il(329549461, var9 ^ -2034168378);
            case 44 -> Il(329549462, var9 ^ 2081263632);
            case 45 -> Il(329549463, var9 ^ -1540963818);
            case 46 -> Il(329549456, var9 ^ -250118464);
            case 47 -> Il(329549457, var9 ^ -1159524593);
            case 48 -> Il(329549458, var9 ^ -544581989);
            case 49 -> Il(329549459, var9 ^ -477310791);
            case 50 -> Il(329549548, var9 ^ 837778799);
            case 51 -> Il(329549549, var9 ^ -999966166);
            case 52 -> Il(329549550, var9 ^ -154622663);
            case 53 -> Il(329549551, var9 ^ 419686086);
            case 54 -> Il(329549544, var9 ^ -188264160);
            case 55 -> Il(329549545, var9 ^ -11305396);
            case 56 -> Il(329549546, var9 ^ -537302320);
            case 57 -> Il(329549547, var9 ^ -1533737067);
            case 58 -> Il(329549540, var9 ^ -1320245021);
            case 59 -> Il(329549541, var9 ^ -1124786768);
            case 60 -> Il(329549542, var9 ^ -733467521);
            case 61 -> Il(329549543, var9 ^ 193453164);
            case 62 -> Il(329549536, var9 ^ -1460167721);
            case 63 -> 5;
            case 64 -> Il(329549537, var9 ^ 1008443800);
            case 65 -> Il(329549538, var9 ^ -632834795);
            case 66 -> Il(329549539, var9 ^ 492126778);
            case 67 -> Il(329549564, var9 ^ 253087892);
            case 68 -> Il(329549565, var9 ^ -997946091);
            case 69 -> Il(329549566, var9 ^ 625783793);
            case 70 -> Il(329549567, var9 ^ -968303647);
            case 71 -> Il(329549560, var9 ^ -2080815418);
            case 72 -> Il(329549561, var9 ^ -366630949);
            case 73 -> Il(329549562, var9 ^ -438612402);
            case 74 -> Il(329549563, var9 ^ -282742653);
            case 75 -> Il(329549556, var9 ^ -402256624);
            case 76 -> Il(329549557, var9 ^ 331409660);
            case 77 -> Il(329549558, var9 ^ 1118348838);
            case 78 -> Il(329549559, var9 ^ -316158255);
            case 79 -> Il(329549552, var9 ^ -439084782);
            case 80 -> Il(329549553, var9 ^ -371524063);
            case 81 -> Il(329549554, var9 ^ -1149944461);
            case 82 -> Il(329549555, var9 ^ 1343724751);
            case 83 -> Il(329549516, var9 ^ -1059013066);
            case 84 -> Il(329549517, var9 ^ 1493523848);
            case 85 -> Il(329549518, var9 ^ 910016188);
            case 86 -> Il(329549519, var9 ^ 1335528873);
            case 87 -> Il(329549512, var9 ^ -842480648);
            case 88 -> Il(329549513, var9 ^ 1279275320);
            case 89 -> Il(329549514, var9 ^ 1367706709);
            case 90 -> Il(329549515, var9 ^ 725756836);
            case 91 -> Il(329549508, var9 ^ -1244603237);
            case 92 -> Il(329549509, var9 ^ -1464572248);
            case 93 -> Il(329549510, var9 ^ -2097061793);
            case 94 -> Il(329549511, var9 ^ 820812025);
            case 95 -> Il(329549504, var9 ^ 2014807263);
            case 96 -> Il(329549505, var9 ^ 1476273761);
            case 97 -> Il(329549506, var9 ^ 302158967);
            case 98 -> Il(329549507, var9 ^ 156905889);
            case 99 -> Il(329549532, var9 ^ 1014712474);
            case 100 -> Il(329549533, var9 ^ -1416914448);
            case 101 -> Il(329549534, var9 ^ -1315744843);
            case 102 -> Il(329549535, var9 ^ -338933660);
            case 103 -> Il(329549528, var9 ^ 1188653929);
            case 104 -> Il(329549529, var9 ^ 282664047);
            case 105 -> Il(329549530, var9 ^ -459377028);
            case 106 -> Il(329549531, var9 ^ -1102867588);
            case 107 -> Il(329549524, var9 ^ 1893300310);
            case 108 -> Il(329549525, var9 ^ 1001500620);
            case 109 -> Il(329549526, var9 ^ -1683622394);
            case 110 -> Il(329549527, var9 ^ -811566092);
            case 111 -> Il(329549520, var9 ^ -907800523);
            case 112 -> Il(329549521, var9 ^ 2065782792);
            case 113 -> Il(329549522, var9 ^ 535467923);
            case 114 -> Il(329549523, var9 ^ -2137663508);
            case 115 -> Il(329549356, var9 ^ 723056968);
            case 116 -> Il(329549357, var9 ^ 1126975084);
            case 117 -> Il(329549358, var9 ^ 1788856305);
            case 118 -> Il(329549359, var9 ^ -165452376);
            case 119 -> Il(329549352, var9 ^ -398644895);
            case 120 -> Il(329549353, var9 ^ -2064029583);
            case 121 -> Il(329549354, var9 ^ -1202434138);
            case 122 -> Il(329549355, var9 ^ -87775208);
            case 123 -> Il(329549348, var9 ^ 264186217);
            case 124 -> Il(329549349, var9 ^ -165095407);
            case 125 -> Il(329549350, var9 ^ -603717445);
            case 126 -> Il(329549351, var9 ^ 1167366442);
            case 127 -> Il(329549344, var9 ^ -418166678);
            case 128 -> Il(329549345, var9 ^ 964861834);
            case 129 -> Il(329549346, var9 ^ 1360807176);
            case 130 -> Il(329549347, var9 ^ -470277625);
            case 131 -> Il(329549372, var9 ^ -738903385);
            case 132 -> Il(329549373, var9 ^ 1935532348);
            case 133 -> Il(329549374, var9 ^ 594914655);
            case 134 -> Il(329549375, var9 ^ -1072443781);
            case 135 -> Il(329549368, var9 ^ -1196053729);
            case 136 -> Il(329549369, var9 ^ -1307637532);
            case 137 -> Il(329549370, var9 ^ -2101962125);
            case 138 -> Il(329549371, var9 ^ -93839805);
            case 139 -> Il(329549364, var9 ^ -2030246641);
            case 140 -> Il(329549365, var9 ^ 1540551360);
            case 141 -> Il(329549366, var9 ^ 529080903);
            case 142 -> Il(329549367, var9 ^ -1656637201);
            case 143 -> Il(329549360, var9 ^ 176242712);
            case 144 -> Il(329549361, var9 ^ 1219027245);
            case 145 -> Il(329549362, var9 ^ 1445998500);
            case 146 -> Il(329549363, var9 ^ -1232702177);
            case 147 -> 0;
            case 148 -> Il(329549324, var9 ^ -689690414);
            case 149 -> Il(329549325, var9 ^ 1304963635);
            case 150 -> Il(329549326, var9 ^ 1313903370);
            case 151 -> Il(329549327, var9 ^ 1612719534);
            case 152 -> Il(329549320, var9 ^ -76783734);
            case 153 -> Il(329549321, var9 ^ 273283495);
            case 154 -> 4;
            case 155 -> Il(329549322, var9 ^ 1167977055);
            case 156 -> Il(329549323, var9 ^ -1598538572);
            case 157 -> Il(329549316, var9 ^ 1051881907);
            case 158 -> Il(329549317, var9 ^ -532426054);
            case 159 -> Il(329549318, var9 ^ -859314850);
            case 160 -> Il(329549319, var9 ^ -1011550271);
            case 161 -> Il(329549312, var9 ^ 531096181);
            case 162 -> 1;
            case 163 -> Il(329549313, var9 ^ 1412042640);
            case 164 -> Il(329549314, var9 ^ -2030997297);
            case 165 -> Il(329549315, var9 ^ 795137009);
            case 166 -> Il(329549340, var9 ^ -164816719);
            case 167 -> Il(329549341, var9 ^ 107157515);
            case 168 -> Il(329549342, var9 ^ -112051319);
            case 169 -> Il(329549343, var9 ^ 859667284);
            case 170 -> Il(329549336, var9 ^ 700629698);
            case 171 -> Il(329549337, var9 ^ 1554610425);
            case 172 -> Il(329549338, var9 ^ 1501515111);
            case 173 -> Il(329549339, var9 ^ 1703864870);
            case 174 -> Il(329549332, var9 ^ -933792367);
            case 175 -> Il(329549333, var9 ^ 188318418);
            case 176 -> Il(329549334, var9 ^ -1597669388);
            case 177 -> Il(329549335, var9 ^ 456565350);
            case 178 -> Il(329549328, var9 ^ -390574373);
            case 179 -> Il(329549329, var9 ^ 1794595670);
            case 180 -> Il(329549330, var9 ^ 153705019);
            case 181 -> Il(329549331, var9 ^ -450521526);
            case 182 -> Il(329549420, var9 ^ -2118685868);
            case 183 -> Il(329549421, var9 ^ 509820841);
            case 184 -> Il(329549422, var9 ^ 1342516233);
            case 185 -> Il(329549423, var9 ^ 1731707229);
            case 186 -> Il(329549416, var9 ^ 863806010);
            case 187 -> Il(329549417, var9 ^ -1799457516);
            case 188 -> 3;
            case 189 -> Il(329549418, var9 ^ -1868758418);
            case 190 -> Il(329549419, var9 ^ -1403213284);
            case 191 -> Il(329549412, var9 ^ -1213496479);
            case 192 -> Il(329549413, var9 ^ -1560451258);
            case 193 -> Il(329549414, var9 ^ -986471884);
            case 194 -> Il(329549415, var9 ^ 830447490);
            case 195 -> Il(329549408, var9 ^ 777458719);
            case 196 -> Il(329549409, var9 ^ 814542237);
            case 197 -> Il(329549410, var9 ^ 259111106);
            case 198 -> Il(329549411, var9 ^ 305785388);
            case 199 -> Il(329549436, var9 ^ -221941142);
            case 200 -> Il(329549437, var9 ^ 1609095946);
            case 201 -> Il(329549438, var9 ^ 651221121);
            case 202 -> Il(329549439, var9 ^ 213049882);
            case 203 -> Il(329549432, var9 ^ -93825430);
            case 204 -> Il(329549433, var9 ^ -476802298);
            case 205 -> Il(329549434, var9 ^ 366848015);
            case 206 -> Il(329549435, var9 ^ -993414557);
            case 207 -> Il(329549428, var9 ^ 1377052970);
            case 208 -> Il(329549429, var9 ^ -501476800);
            case 209 -> Il(329549430, var9 ^ -1303582430);
            case 210 -> Il(329549431, var9 ^ -398933346);
            case 211 -> Il(329549424, var9 ^ 1271748429);
            case 212 -> Il(329549425, var9 ^ 392935468);
            case 213 -> Il(329549426, var9 ^ -595070355);
            case 214 -> Il(329549427, var9 ^ 1366164631);
            case 215 -> Il(329549388, var9 ^ -1139112378);
            case 216 -> Il(329549389, var9 ^ 1953990271);
            case 217 -> Il(329549390, var9 ^ 52331592);
            case 218 -> Il(329549391, var9 ^ 1757055577);
            case 219 -> Il(329549384, var9 ^ 837369232);
            case 220 -> Il(329549385, var9 ^ -1597431508);
            case 221 -> Il(329549386, var9 ^ 683396661);
            case 222 -> Il(329549387, var9 ^ 872444846);
            case 223 -> Il(329549380, var9 ^ -85933396);
            case 224 -> Il(329549381, var9 ^ -1080931818);
            case 225 -> Il(329549382, var9 ^ -977669687);
            case 226 -> Il(329549383, var9 ^ 1424265247);
            case 227 -> Il(329549376, var9 ^ -1062539180);
            case 228 -> Il(329549377, var9 ^ 2011778690);
            case 229 -> Il(329549378, var9 ^ 154647240);
            case 230 -> Il(329549379, var9 ^ 954424606);
            case 231 -> Il(329549404, var9 ^ -1371883040);
            case 232 -> Il(329549405, var9 ^ -1530423676);
            case 233 -> Il(329549406, var9 ^ 1329775276);
            case 234 -> Il(329549407, var9 ^ 1691991750);
            case 235 -> Il(329549400, var9 ^ -1198955837);
            case 236 -> Il(329549401, var9 ^ 1062522885);
            case 237 -> Il(329549402, var9 ^ -734208943);
            case 238 -> Il(329549403, var9 ^ -212688915);
            case 239 -> Il(329549396, var9 ^ -1378298463);
            case 240 -> Il(329549397, var9 ^ -353774689);
            case 241 -> Il(329549398, var9 ^ 266256712);
            case 242 -> Il(329549399, var9 ^ 1071403157);
            case 243 -> Il(329549392, var9 ^ -233473159);
            case 244 -> Il(329549393, var9 ^ -1618087952);
            case 245 -> Il(329549394, var9 ^ 932589995);
            case 246 -> Il(329549395, var9 ^ -1333672756);
            case 247 -> Il(329549740, var9 ^ -392500165);
            case 248 -> Il(329549741, var9 ^ -53217800);
            case 249 -> Il(329549742, var9 ^ 1625238039);
            case 250 -> Il(329549743, var9 ^ 518375712);
            case 251 -> Il(329549736, var9 ^ 2037572804);
            case 252 -> Il(329549737, var9 ^ -830766599);
            case 253 -> Il(329549738, var9 ^ -1969862548);
            case 254 -> Il(329549739, var9 ^ 1490775716);
            default -> Il(329549732, var9 ^ -532663062);
         };
         int var5 = (var1 & Il(329549733, var9 ^ -2108652307)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Il(329549734, var9 ^ 1688476935)) >>> Il(329549735, var9 ^ -1656500582)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Il(329549728, var9 ^ -1110650288);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Il(329549729, var9 ^ 349231276);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1724 != null) {
         ((lIlIlllI)var1.field_1724).ilovcats$setJumpingCooldown(0);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1464747947;
      short var18 = 3186;
      int var17 = 0;
      String[] var15 = new String[1];
      int var14 = "Aꖱꆵ\udcf3뻓䞡돕눻ḥ澛렦Δ잰䅑쥁➓碲ᅽ\ue545늷ꚰ耚◓읔怈氝틩䓇ﺸ簱琻員疥휾쩕볈메礤泹ￓ汝ꉹ\uf542崙䡙猕ꆤ秿ꌀ\ueb38魀婇\ufb0f힜ﳑ滃\ue087䯛㓯膝犲鎀祹Ⲃ⮾瘮".length();
      String var13 = "Aꖱꆵ\udcf3뻓䞡돕눻ḥ澛렦Δ잰䅑쥁➓碲ᅽ\ue545늷ꚰ耚◓읔怈氝틩䓇ﺸ簱琻員疥휾쩕볈메礤泹ￓ汝ꉹ\uf542崙䡙猕ꆤ秿ꌀ\ueb38魀婇\ufb0f힜ﳑ滃\ue087䯛㓯膝犲鎀祹Ⲃ⮾瘮";
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 240;
               case 1 -> 193;
               case 2 -> 225;
               case 3 -> 131;
               case 4 -> 243;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      ll = var15;
      III = new Object[var15.length];
      int var9 = -1368363369;
      byte[] var7 = "\u0097¼Âv²L\u0011Èi\u0002\u008dEÛý\u0003°ÿ\u009e7\u0007L³Áì1\u008fÇ\"W\u0095R#jâ\u0088\r½[\u000e\u000b-\u001aRÒ\u0099ó%²ö<!±¨#îrÿ\u0016úË\u0089\u009a¡\f\u001a \u0092vùd\u0001\bR\u0090\u0015 +\u00ad\fw\u008ama\u0005ØÌfùpþÝ\u0087\u00946×õÿ\bm\u009d-Ï\u0092<ÉrV\u008c\u0012\u0084\u001fÙdl\u0085·â³ù\f»äWÏ\u0089(¦G\u0087Ø½\b}¹Âô¯(\r)ÚÞ\tëæM\u008d\u0016¯!S×ÉÐ\\\u001b\u0081æ¬l©\u0007c7vKý+xßüü\u0012*Kæ%\t5º·\u0097ÖÑ²y»7BO\u008dÚ\u0087ðÒÂ\u0005qTUgU«Î\u008do\u009b,(H\bnéXG\\²I¿5*þ6½\u009eÍ:\u000fá1ïm\u001býsÄÃÖ!5\u0096ç\u009dNÝ\u0013ìÿ¸zµÕ\u0084|3\u0004V\u001f\u009e\u0084£\u0095Y\u0017\u00918FØ~ó\u0005\u0086\u00937²\u0080\u0098£\u009d\u001b¸\t\u0089øÃeäeÖ¾K\fÛ\u0005þ7³¸ÏKlw?.Ï\u0007xà[ëB9½·V(z¥ Khå3#£tn¦B¼Q\u0090¡¸8\u0010ä\t¥E\u008dÕDâ\u0082+\u00ad¦\u0088ÕSÁ\u008föîHt0\u000b\u001d%XE5\u008a×-Å\u0082$úÿ\u008e*\u001d\u0097Ü\u0085Þ,7ç~¹§\u0010]7>õ¿ÞQÍ]¤(jnoª8 2+°ÒX6uo¨L²È\u0088Ò >ÆÏD\u0085zäñ\u0083eW\u001c{H\u001fçgõ0\u000eÅ£uòw|nªÓø[\u008b«\u0017Ì{z\u0083Öc±S\u008c<ª&!)\u0088ow)ÿù\u0083n\u0095ÙÙ³q!\u0017)\u009bÐ\\ALZüU\u0014D¨P\u0098x®\u0014ò{\u001cÑºXx\u001atPçe4\u0099Lè\u001aÄ$Ü¥]\ro$¬\u0091Ó\u0086ù\u008fÍÊóã\t\u008b=ß¤¬û\u009d4J¿hOÊ\u009e\u0091Ø;2»ôâ\u0001\"dz¬\u0080ã«\u0010^r}<6ì¦'\u0084\bÀ\u0095´\u0005Ù3\u0014\u00ad\u0002çD\u0085Nm§ã-@ßEH/Õÿë¬åFy\r\u009d\u0098ý\u0018á\f\u0007«<\"\u0010ÈxyÀJú±[\u0092mq£E/X\u000211ÀÌ5Ñv\u0097\u000e±\u0014Ëë*8È\u0089) pû\u0007ÐÆ\u0088\u009c\u009c¼Ëw¹\u001b6\"m\t§ÇHßHYB\u0092ú\u0087³1\u008c«7\u0006t¤D\u0014yxW\u0001¯3ÚìÌá\u0001\u0092{H\u00940\u0007\u0091Ýû\u0085a\u0093ûî\u009e¢Ø]TÍ\u0098yN2!½;Y\u009b¦>\u008f®b\u0002~\tì¯§\u0096õlÉ`NÇ5\u009cû|ÆA\u0003\u008fH\u00ad&\r\u0007¹ÄnÙ¹Ô\u0082Õu§æG\u0088Py\u0093Ýt7õÏV\u0000Ç\"çT\u008cAxóN\u0097õ÷máhË¬I\u008cÐ[`.Å\r\u0085\u001f¢ÃA\u008bV\u008f|1I§÷ÔW|\u000e\u009ah\u0081[óuÉ\t\u0013\u00955\u0091ø8\u00189VA ;\u0014kB\u0001s\u009d\u0098µó\u0084dp\u007fr-K±£9Q@5äÊ\u0000\u0085ìñóÕ¼\u000bÔ\u008fÈ!T,=´óp\u009b[W»w\u0011v6\u009eç\u0012Ûêei\u0013\u0087eÖdîfµ\u000fJiËV\u0019ßÿÇ9Â)OK-\u0096Sð\u0090\u0099\u009d\u0010 ËØb©ñ¢I\u0012o3\u0014sä§Z\u0013å\u0010\u0019\u00ad¨nÇX\u0005_\u0013¾æÉÊZPÃ7tT(² Í\u0003)]=ßy\u0081hX¤3Y³Ì?o\u0094¢}%Ê(6\u008f\u008d\u00190\u0006h.\"_X,³Ò\u0095å\u0098èø}\r\u0087PfÒ¼×q'ç\u008fj\u000eã\u009b#\u0017¯\u0007/Èïy\u0015*:\u001e\u0082\u0007ú©\u008bc>íf«L?+\u008cÈ\u0087°ÖVå gs\u0003Uÿ\u009aú³,\u0011Ú<1Ës ;6søKbTb'àc¶\u0007åÖ?$õs\u009e\u00923Û¾¶Ó"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lI('\uf41f', var23 ^ 1863777026, '\udfca')).length();
      int var1 = Il(329549486, var23 ^ -2087112703);
      int var0 = -1;

      while (true) {
         char[] var10002;
         label81: {
            int var27 = Il(329549487, var23 ^ 828816911);
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
                  break label81;
               }

               var10005 = var10003;
               var10004 = var27;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % Il(329549480, var23 ^ 352684626)) {
                  case 0 -> Il(329549481, var23 ^ -1507296078);
                  case 1 -> Il(329549482, var23 ^ -619415030);
                  case 2 -> Il(329549483, var23 ^ -1123094653);
                  case 3 -> Il(329549476, var23 ^ -2139540100);
                  case 4 -> Il(329549477, var23 ^ 1472246633);
                  case 5 -> Il(329549478, var23 ^ -947786158);
                  default -> Il(329549479, var23 ^ 1936234735);
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
            II = var5;
            Il = new String[2];
            I = new String[2];
            II();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static void II() {
      int var0 = 993640067;
      I[0] = I(l(Il(329549730, var0 ^ 183118459), Il(329549731, var0 ^ 762322783)).toCharArray(), 40281L, Il(329549756, var0 ^ -1905517512));
      I[1] = I(l(Il(329549757, var0 ^ -1355987466), Il(329549758, var0 ^ 176966898)).toCharArray(), 92984L, Il(329549759, var0 ^ 465751301));
   }

   private static int Il(int var0, int var1) {
      int var2 = lI[var0 ^ 329549484] ^ var1 ^ var0;
      var2 -= 56793;
      var2 ^= 16267;
      var2 ^= 11088;
      var2 ^= 63039;
      var2 ^= 39318;
      var2 += 39622;
      var2 -= 49617;
      var2 += 54132;
      var2 += 13538;
      return var2 + 43688;
   }

   private static String lI(char var0, int var1, char var2) {
      int var3 = var0 ^ '\uf41f';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 4315;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '뗻';
         var10 -= 51757;
         var10 ^= 2514;
         var10 ^= 26232;
         var10 ^= 25749;
         var10 ^= 12960;
         var10 += 31955;
         var10 -= 21008;
         var10 += 7633;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public lIIIl() {
      super(IlIIllIII.Ill(I[1]), lllIIlIl.III, IlIIllIII.Ill(I[0]));
   }
}
