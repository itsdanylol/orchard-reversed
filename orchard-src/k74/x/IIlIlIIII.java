package k74.x;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class IIlIlIIII implements InvocationHandler {
   private static final Object[] ll;
   private static final String[] I;
   private static final String[] lI;
   private static final String[] l;
   private static final int[] Il;
   private static String[] II;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = Il(1906138531, 1386214812 ^ 1696917709) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & Il(1906138530, 1386214812 ^ 186594088);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String l(int var0, int var1) {
      int var9 = -1432860568;
      int var2 = (var0 ^ Il(1906138529, var9 ^ -1918301408)) & Il(1906138528, var9 ^ 397108225);
      if (l[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & Il(1906138535, var9 ^ -1109240646)) {
            case 0 -> Il(1906138534, var9 ^ -1234285169);
            case 1 -> Il(1906138533, var9 ^ -719440279);
            case 2 -> Il(1906138532, var9 ^ 2147034554);
            case 3 -> Il(1906138539, var9 ^ -247307798);
            case 4 -> Il(1906138538, var9 ^ 675062157);
            case 5 -> Il(1906138537, var9 ^ -1570975591);
            case 6 -> Il(1906138536, var9 ^ 722228354);
            case 7 -> Il(1906138543, var9 ^ -1666463112);
            case 8 -> Il(1906138542, var9 ^ -665647320);
            case 9 -> Il(1906138541, var9 ^ 1454834788);
            case 10 -> Il(1906138540, var9 ^ -39344874);
            case 11 -> Il(1906138547, var9 ^ -912545091);
            case 12 -> Il(1906138546, var9 ^ 2072525363);
            case 13 -> Il(1906138545, var9 ^ 1272833207);
            case 14 -> Il(1906138544, var9 ^ 1313966210);
            case 15 -> Il(1906138551, var9 ^ -24680720);
            case 16 -> Il(1906138550, var9 ^ -2099170516);
            case 17 -> Il(1906138549, var9 ^ -1543290505);
            case 18 -> Il(1906138548, var9 ^ -907574412);
            case 19 -> Il(1906138555, var9 ^ -1810819385);
            case 20 -> Il(1906138554, var9 ^ 284342697);
            case 21 -> Il(1906138553, var9 ^ -1330686380);
            case 22 -> Il(1906138552, var9 ^ -671764123);
            case 23 -> Il(1906138559, var9 ^ -1322890774);
            case 24 -> Il(1906138558, var9 ^ -1489930090);
            case 25 -> Il(1906138557, var9 ^ -1359805353);
            case 26 -> Il(1906138556, var9 ^ -945261699);
            case 27 -> Il(1906138499, var9 ^ -313982556);
            case 28 -> Il(1906138498, var9 ^ -524469229);
            case 29 -> Il(1906138497, var9 ^ -128560635);
            case 30 -> Il(1906138496, var9 ^ 1495998153);
            case 31 -> Il(1906138503, var9 ^ 1791533390);
            case 32 -> Il(1906138502, var9 ^ -1091749312);
            case 33 -> Il(1906138501, var9 ^ 869133000);
            case 34 -> Il(1906138500, var9 ^ -880118271);
            case 35 -> Il(1906138507, var9 ^ -2117738365);
            case 36 -> Il(1906138506, var9 ^ 118148254);
            case 37 -> Il(1906138505, var9 ^ 1819404930);
            case 38 -> Il(1906138504, var9 ^ -1394416186);
            case 39 -> Il(1906138511, var9 ^ 960354564);
            case 40 -> Il(1906138510, var9 ^ 1947245464);
            case 41 -> Il(1906138509, var9 ^ -2129313903);
            case 42 -> Il(1906138508, var9 ^ -1691011538);
            case 43 -> Il(1906138515, var9 ^ 1812591098);
            case 44 -> Il(1906138514, var9 ^ 1153502916);
            case 45 -> Il(1906138513, var9 ^ -148585285);
            case 46 -> Il(1906138512, var9 ^ 1680790412);
            case 47 -> Il(1906138519, var9 ^ 1883677749);
            case 48 -> Il(1906138518, var9 ^ 1324569240);
            case 49 -> Il(1906138517, var9 ^ 1971225719);
            case 50 -> Il(1906138516, var9 ^ 1963104641);
            case 51 -> Il(1906138523, var9 ^ 498634621);
            case 52 -> Il(1906138522, var9 ^ -1530044892);
            case 53 -> Il(1906138521, var9 ^ -290551996);
            case 54 -> Il(1906138520, var9 ^ 1954310652);
            case 55 -> Il(1906138527, var9 ^ 340329161);
            case 56 -> Il(1906138526, var9 ^ 1271824492);
            case 57 -> Il(1906138525, var9 ^ -660742929);
            case 58 -> Il(1906138524, var9 ^ 966613615);
            case 59 -> Il(1906138595, var9 ^ -1283629703);
            case 60 -> Il(1906138594, var9 ^ 344301128);
            case 61 -> Il(1906138593, var9 ^ 2118381772);
            case 62 -> Il(1906138592, var9 ^ 71151487);
            case 63 -> Il(1906138599, var9 ^ -335634041);
            case 64 -> Il(1906138598, var9 ^ -470050117);
            case 65 -> Il(1906138597, var9 ^ 1777761835);
            case 66 -> Il(1906138596, var9 ^ -1739016709);
            case 67 -> Il(1906138603, var9 ^ 151282625);
            case 68 -> Il(1906138602, var9 ^ -2100502835);
            case 69 -> Il(1906138601, var9 ^ 99020441);
            case 70 -> Il(1906138600, var9 ^ 1181882710);
            case 71 -> Il(1906138607, var9 ^ -1622000244);
            case 72 -> Il(1906138606, var9 ^ 259643560);
            case 73 -> Il(1906138605, var9 ^ 595799624);
            case 74 -> Il(1906138604, var9 ^ 1025317855);
            case 75 -> Il(1906138611, var9 ^ -907614561);
            case 76 -> Il(1906138610, var9 ^ -82968942);
            case 77 -> Il(1906138609, var9 ^ 335751874);
            case 78 -> Il(1906138608, var9 ^ -1395350615);
            case 79 -> Il(1906138615, var9 ^ -1121092376);
            case 80 -> 4;
            case 81 -> Il(1906138614, var9 ^ -351943545);
            case 82 -> Il(1906138613, var9 ^ 1840375923);
            case 83 -> Il(1906138612, var9 ^ -1663027936);
            case 84 -> Il(1906138619, var9 ^ 580334420);
            case 85 -> Il(1906138618, var9 ^ 240707680);
            case 86 -> Il(1906138617, var9 ^ -1651216280);
            case 87 -> Il(1906138616, var9 ^ 96184428);
            case 88 -> Il(1906138623, var9 ^ 232161870);
            case 89 -> Il(1906138622, var9 ^ -1502650578);
            case 90 -> Il(1906138621, var9 ^ -935378336);
            case 91 -> Il(1906138620, var9 ^ -1768941121);
            case 92 -> Il(1906138563, var9 ^ 1417424502);
            case 93 -> Il(1906138562, var9 ^ -1562178706);
            case 94 -> Il(1906138561, var9 ^ -1682798506);
            case 95 -> Il(1906138560, var9 ^ -2134775946);
            case 96 -> 5;
            case 97 -> Il(1906138567, var9 ^ 2013928085);
            case 98 -> Il(1906138566, var9 ^ -502977846);
            case 99 -> Il(1906138565, var9 ^ 1178809704);
            case 100 -> Il(1906138564, var9 ^ 1526086444);
            case 101 -> Il(1906138571, var9 ^ -1076533551);
            case 102 -> Il(1906138570, var9 ^ 1010471762);
            case 103 -> Il(1906138569, var9 ^ 451695225);
            case 104 -> Il(1906138568, var9 ^ -809972198);
            case 105 -> Il(1906138575, var9 ^ 938970468);
            case 106 -> Il(1906138574, var9 ^ 1745570700);
            case 107 -> Il(1906138573, var9 ^ -2106081039);
            case 108 -> Il(1906138572, var9 ^ -1108326422);
            case 109 -> Il(1906138579, var9 ^ -966253328);
            case 110 -> 0;
            case 111 -> Il(1906138578, var9 ^ -755617735);
            case 112 -> Il(1906138577, var9 ^ -254110902);
            case 113 -> Il(1906138576, var9 ^ -2083681061);
            case 114 -> Il(1906138583, var9 ^ 610857225);
            case 115 -> Il(1906138582, var9 ^ 312950722);
            case 116 -> Il(1906138581, var9 ^ 1640872154);
            case 117 -> Il(1906138580, var9 ^ -449222197);
            case 118 -> Il(1906138587, var9 ^ -915999739);
            case 119 -> Il(1906138586, var9 ^ 1809023363);
            case 120 -> Il(1906138585, var9 ^ 716674700);
            case 121 -> Il(1906138584, var9 ^ -1012866364);
            case 122 -> Il(1906138591, var9 ^ 877448329);
            case 123 -> Il(1906138590, var9 ^ -277188004);
            case 124 -> Il(1906138589, var9 ^ 327545439);
            case 125 -> Il(1906138588, var9 ^ 411633910);
            case 126 -> Il(1906138403, var9 ^ -481665554);
            case 127 -> Il(1906138402, var9 ^ 1115814396);
            case 128 -> Il(1906138401, var9 ^ 1873344007);
            case 129 -> Il(1906138400, var9 ^ -278539453);
            case 130 -> Il(1906138407, var9 ^ 1922351717);
            case 131 -> Il(1906138406, var9 ^ -1562451366);
            case 132 -> Il(1906138405, var9 ^ 663980885);
            case 133 -> Il(1906138404, var9 ^ -1056205894);
            case 134 -> Il(1906138411, var9 ^ 978612851);
            case 135 -> Il(1906138410, var9 ^ -1979279502);
            case 136 -> Il(1906138409, var9 ^ -1592451454);
            case 137 -> Il(1906138408, var9 ^ -2041439654);
            case 138 -> Il(1906138415, var9 ^ -1639238544);
            case 139 -> Il(1906138414, var9 ^ -425313469);
            case 140 -> Il(1906138413, var9 ^ -1107739889);
            case 141 -> Il(1906138412, var9 ^ 616981452);
            case 142 -> Il(1906138419, var9 ^ -564945629);
            case 143 -> Il(1906138418, var9 ^ 1663317816);
            case 144 -> Il(1906138417, var9 ^ 1043800159);
            case 145 -> Il(1906138416, var9 ^ 1389870543);
            case 146 -> Il(1906138423, var9 ^ -677117232);
            case 147 -> Il(1906138422, var9 ^ -1779847049);
            case 148 -> Il(1906138421, var9 ^ -101470452);
            case 149 -> Il(1906138420, var9 ^ -668703619);
            case 150 -> Il(1906138427, var9 ^ -786375805);
            case 151 -> Il(1906138426, var9 ^ -492215244);
            case 152 -> 2;
            case 153 -> Il(1906138425, var9 ^ 1702329520);
            case 154 -> Il(1906138424, var9 ^ 196348203);
            case 155 -> Il(1906138431, var9 ^ 1882079598);
            case 156 -> Il(1906138430, var9 ^ 125505154);
            case 157 -> Il(1906138429, var9 ^ 405640712);
            case 158 -> Il(1906138428, var9 ^ 182821348);
            case 159 -> Il(1906138371, var9 ^ 933789674);
            case 160 -> Il(1906138370, var9 ^ -1917427953);
            case 161 -> Il(1906138369, var9 ^ -916176817);
            case 162 -> Il(1906138368, var9 ^ 1682208279);
            case 163 -> Il(1906138375, var9 ^ -802315476);
            case 164 -> Il(1906138374, var9 ^ -1319841450);
            case 165 -> Il(1906138373, var9 ^ -83436241);
            case 166 -> Il(1906138372, var9 ^ -1214532091);
            case 167 -> Il(1906138379, var9 ^ 372368096);
            case 168 -> Il(1906138378, var9 ^ 665562745);
            case 169 -> Il(1906138377, var9 ^ -623828122);
            case 170 -> Il(1906138376, var9 ^ 1593379491);
            case 171 -> Il(1906138383, var9 ^ 1838285826);
            case 172 -> Il(1906138382, var9 ^ -348042196);
            case 173 -> Il(1906138381, var9 ^ 540852759);
            case 174 -> Il(1906138380, var9 ^ 1986525732);
            case 175 -> Il(1906138387, var9 ^ 630213492);
            case 176 -> Il(1906138386, var9 ^ 697100887);
            case 177 -> Il(1906138385, var9 ^ 362906022);
            case 178 -> Il(1906138384, var9 ^ 151977501);
            case 179 -> Il(1906138391, var9 ^ -1211134439);
            case 180 -> Il(1906138390, var9 ^ 148780939);
            case 181 -> Il(1906138389, var9 ^ -1425336322);
            case 182 -> Il(1906138388, var9 ^ 1218254373);
            case 183 -> Il(1906138395, var9 ^ 181904349);
            case 184 -> Il(1906138394, var9 ^ -806226082);
            case 185 -> Il(1906138393, var9 ^ -1652312485);
            case 186 -> Il(1906138392, var9 ^ -4040467);
            case 187 -> Il(1906138399, var9 ^ 1762958303);
            case 188 -> Il(1906138398, var9 ^ 1531554394);
            case 189 -> 1;
            case 190 -> Il(1906138397, var9 ^ 1071759542);
            case 191 -> Il(1906138396, var9 ^ -1780998066);
            case 192 -> 3;
            case 193 -> Il(1906138467, var9 ^ 1667582269);
            case 194 -> Il(1906138466, var9 ^ 578893679);
            case 195 -> Il(1906138465, var9 ^ -514065529);
            case 196 -> Il(1906138464, var9 ^ -2061650586);
            case 197 -> Il(1906138471, var9 ^ -365691428);
            case 198 -> Il(1906138470, var9 ^ 241985278);
            case 199 -> Il(1906138469, var9 ^ 1211106234);
            case 200 -> Il(1906138468, var9 ^ -2118632802);
            case 201 -> Il(1906138475, var9 ^ 271634170);
            case 202 -> Il(1906138474, var9 ^ 1084471359);
            case 203 -> Il(1906138473, var9 ^ 899678338);
            case 204 -> Il(1906138472, var9 ^ -856795015);
            case 205 -> Il(1906138479, var9 ^ 536097900);
            case 206 -> Il(1906138478, var9 ^ 1889688214);
            case 207 -> Il(1906138477, var9 ^ 553629614);
            case 208 -> Il(1906138476, var9 ^ 245332787);
            case 209 -> Il(1906138483, var9 ^ 1367281249);
            case 210 -> Il(1906138482, var9 ^ 1928239276);
            case 211 -> Il(1906138481, var9 ^ -509179094);
            case 212 -> Il(1906138480, var9 ^ 272185575);
            case 213 -> Il(1906138487, var9 ^ -1316648211);
            case 214 -> Il(1906138486, var9 ^ -1142151728);
            case 215 -> Il(1906138485, var9 ^ 821909206);
            case 216 -> Il(1906138484, var9 ^ 308248353);
            case 217 -> Il(1906138491, var9 ^ -349062429);
            case 218 -> Il(1906138490, var9 ^ 2074959063);
            case 219 -> Il(1906138489, var9 ^ 1923568225);
            case 220 -> Il(1906138488, var9 ^ 1589932711);
            case 221 -> Il(1906138495, var9 ^ -390935755);
            case 222 -> Il(1906138494, var9 ^ -1161223276);
            case 223 -> Il(1906138493, var9 ^ 886093715);
            case 224 -> Il(1906138492, var9 ^ -1047903439);
            case 225 -> Il(1906138435, var9 ^ -143005348);
            case 226 -> Il(1906138434, var9 ^ 1116569864);
            case 227 -> Il(1906138433, var9 ^ 1305549757);
            case 228 -> Il(1906138432, var9 ^ -1773628986);
            case 229 -> Il(1906138439, var9 ^ 985078289);
            case 230 -> Il(1906138438, var9 ^ -624472552);
            case 231 -> Il(1906138437, var9 ^ -962117727);
            case 232 -> Il(1906138436, var9 ^ 1695910157);
            case 233 -> Il(1906138443, var9 ^ 750484679);
            case 234 -> Il(1906138442, var9 ^ -1365601861);
            case 235 -> Il(1906138441, var9 ^ -1461432757);
            case 236 -> Il(1906138440, var9 ^ 1364263278);
            case 237 -> Il(1906138447, var9 ^ -1515398774);
            case 238 -> Il(1906138446, var9 ^ 1396493830);
            case 239 -> Il(1906138445, var9 ^ -965661354);
            case 240 -> Il(1906138444, var9 ^ 1286547716);
            case 241 -> Il(1906138451, var9 ^ 967299969);
            case 242 -> Il(1906138450, var9 ^ 917043768);
            case 243 -> Il(1906138449, var9 ^ 277970793);
            case 244 -> Il(1906138448, var9 ^ -1315097346);
            case 245 -> Il(1906138455, var9 ^ -1168395357);
            case 246 -> Il(1906138454, var9 ^ 913204754);
            case 247 -> Il(1906138453, var9 ^ -1454753615);
            case 248 -> Il(1906138452, var9 ^ -1685984286);
            case 249 -> Il(1906138459, var9 ^ -4859472);
            case 250 -> Il(1906138458, var9 ^ 2051429842);
            case 251 -> Il(1906138457, var9 ^ -801940915);
            case 252 -> Il(1906138456, var9 ^ 958207572);
            case 253 -> Il(1906138463, var9 ^ -1454917766);
            case 254 -> Il(1906138462, var9 ^ 882226405);
            default -> Il(1906138461, var9 ^ 1345038817);
         };
         int var5 = (var1 & Il(1906138460, var9 ^ 135944145)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Il(1906138275, var9 ^ 945392109)) >>> Il(1906138274, var9 ^ 1384753638)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Il(1906138273, var9 ^ 1344770807);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Il(1906138272, var9 ^ 1813801518);
            }
         }

         l[var2] = new String(var3).intern();
      }

      return l[var2];
   }

   private IIlIlIIII() {
   }

   private static int Il(int var0, int var1) {
      int var2 = Il[var0 ^ 1906138531] ^ var1 ^ var0;
      var2 ^= 18221;
      var2 ^= 856;
      var2 -= 43148;
      var2 += 12441;
      var2 -= 51457;
      var2 += 9585;
      return var2 ^ 44686;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 836050102;
      short var18 = 5786;
      int var10001 = "/㸃\udc2a\udba4뀔稷ếℜ懘例\ue6f3\ue19fϟ⸇㓋輇糊ᄥ朊╺䖵㝊눞ꎉ熓꭪뫰髷赧畫䷹ൂ\uf367ḁ锦㤷\udcea\ue77d鹕捯縿뵇碌㌲䅋跧䅇╲\u0011翠䷄㶪朷涳璆参ꚷ苙\udcedヰ倰逖ﵨ◰\uf658锲".length();
      String[] var15 = new String[2];
      int var14 = var10001;
      int var16 = 0;
      int var17 = 0;
      String var13 = "/㸃\udc2a\udba4뀔稷ếℜ懘例\ue6f3\ue19fϟ⸇㓋輇糊ᄥ朊╺䖵㝊눞ꎉ熓꭪뫰髷赧畫䷹ൂ\uf367ḁ锦㤷\udcea\ue77d鹕捯縿뵇碌㌲䅋跧䅇╲\u0011翠䷄㶪朷涳璆参ꚷ苙\udcedヰ倰逖ﵨ◰\uf658锲";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 112;
               case 1 -> 113;
               case 2 -> 23;
               case 3 -> 2;
               case 4 -> 26;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lI = var15;
      ll = new Object[var15.length];
      int var9 = 360101217;
      byte[] var7 = "Kº\u0005à=j£öCØÿÐÙÙì)s\u0090y\u0095x\u001cc:\u001bl\u0018©±\u008b\u000bu?0L\u0081æN\u008cÄl.ýùå~y\u0083RÙç3\u0016!*\u000f\u0098Å)}3Õ\u0088J\u0007é\u0084Sµú\u0014Ô\u0085¯Éï\u0080#¥\u008f0õH\u001bL\u0093\u001e\u0000jqlA\u0007\u0095\u00ad\u0089Zc;\u0092Þ\u0080\u0097\u000f~Ý{S\u0019\u0087\u009fÙ\u007fTg4iCU¬`\u0081)x\tÚ]Ñ#;/..Ï\u0012Ú6$\u007f\u0018\u0097Y3°¤º\u008cop\u009f\u0017\u001aý¿Ä$\u0005ø['O·ÎöÉxáõ¢\u0003Ä*b\u0090ËX÷O÷¦ºbµ\u0003Og\u0012\u0084UG\u001bn¢{Üº\u008a³ S9Véûª\\þï¾4\u008aÁ\u0080\u0081|C»\fªÅ»p·EÓÊ¢Bj¿s- Ü©¥º\u000eGQÚ;/\u0094\u0085¼\u00ad\n\u0016ïñë÷ït\u0093}\u000fp)Ú÷³?°1Ý\u0097ÊO\u0081³%\u008c\u008cÖ-\u0089·ï§\u0084PðV*\u0098\u0082ÇvN\u008dL¾ó±Ë\u0094À\n\u0088\u00004AQ \u0013IÁ\u000bö»íñ\u0003qóo5;\u0007\u0094Ë¡5\u007fÐcÚq\u0007Õb¦\u008dYs_R\u0006%wé¨£ÃÅtR\u0092\u001b\u0097ìå\u001e\u000eÀ*Æ\u0091Sæ^ÏËÉ\u0085?Ã¤¬Çh\u001drV\u0006MlaXâ7M\u009a\u000e\u0003Ul\u0091%\u009dUÀ¦ÝN³Ê\t¶x4\u0004,w\u0004q\u00881\u001bÿ\u0094\u0084\u0015òq§KÞòH¾_Ô\u009e\u007fg\u0001ÊàÉù\u0085£ó¦yf\u0087L\u0005í¼s\u0082i\u007f\b\u001a\tÆ\u001c\u0084\u001eÛ>¨½\u0089M¿¢4ê\u001aÜrÜÕ\u0012\u008f¯¿\u0095\u008a+KDÞ\u0007\u0014Úþ¥¡¯\u0011äÅ»\u008e\rÒÏ\u0096ú>â\u0013!\b\\ÍÝ÷ßsÖû%ô-8pZ\u008cóÔ\b¡ÚØ>!\u0017ý\t¼æïól¬Ìbéá¦Ø\u000fy½Ïô&_\u0090Dtºûog0ÏH 7´P9\u0019ä(Ô\u0016Õs\u008b\u0015\u0006ê´N\\\u0010!³Q\u00adV\u001aýðE\u000eX\u009c¥\u0093ë\u0019Ö/G[\u009b\u009d´7\u0081\u0081\u001f\u0016VJ\u0016\u001fRõÁ,ÛI¾«\u0005R\u0094ÅÆ'G¾\\l»É\t#\u0005Ö_»ÏÄ\u0097\u008fëùÚQÀCÄq\u000b\u0007\u0016nmª6[¸\u001e_\u008d!\u007f&ÿ?5tðõyé\u009b\u008dØCÏFéÙ\u0083ü\u0014£\r\u001b\u0090\u008b'D£à*\u0000%3b îNì\u0005¸\u0015× ëâe^çþÇòÛÓ¯\u008fÇ|Ð\u001ay½£ÛÆ¬\u001aqey9¸\u0086ï;ÅÄ¥\u008d¡\u0001\u0083Ú\u0087Sñ\u0098N1°vò§fµë\u0095;\u0084,ñ\u0093í)[ª\r÷\u00ad\u0017dôìó\u001a\u008a/)Õ±Ko\u009b4$AÐtÀ\u001eK\u0013\u0086B-\u009fOÊ\u0014¸ÞBãZ\u008eÑ\u0096pûÒ.Ü\u0002\u009cu¤Ñ\u0086\u0019ø¾Ðwfî\u008d\u009a!ÀíUd\u009f\r#ÿ¼\u009c¶ü/Ô¥9ÞK\u0016\u0098\u007f÷¤Ýu\u009e\u000bÙþ\u008fx\u009fÜ-Qz%C\u00976µßr¼¼Õ\u007fÊ\u0090¶\\\u0091&Àå\ft»\r\u009aú¢\u009a3\u000fømp9\u000bÇE\u008cÿ¯1\u0083£6\nX:¿úôÅ7\u008c\u0014µcÐ\bÕ\u0011\u0091«g§}âÉR¤`è¿ªf\u0096cå\u009f#,§kÞô\u000f\u009dNàr\b\u0003\u0003l\u0082Ý\u0004Å÷Õý\u009eøÚÔ\fÞãRè\u007fï\u0019vt)\u009dÚø\u001cH\u0000g8\u0015tUóÅÈ1Çôz´4x\u0017\u001eAwÚ÷o;äg5\u009a±úç\u009aº\u009eY\u0084WÆhz\u0005ö+\u0000Æ\u009cû\u00861\u009eU¾Þ¢nF\u0006V\u0018ÙûåÛ ôv~¨\u008dVAtR\u001b\u0096\u0094,8¼XÃB¡¿(ä;Écï*Ý\u001fxÐáH%Ê\u008bG\u008fg\u0091Ò^ÙU\u0003ÎªÇø3\u0096\u0007è\u000bXwösñh>Á¯ÓäY\u0014eÀÄ\u0082f]7\u001a\bZ\u001c\u000e\u0092o@s\u009ba"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      Il = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         Il[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lI(82, 112, -641475741, (byte)-50, -1652210216, 606770283, (short)-30970)).length();
      int var1 = Il(1906138279, var23 ^ 52929269);
      int var25 = -1;

      label96:
      while (true) {
         int var28 = Il(1906138278, var23 ^ -1327178859);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label91: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var28;
               var41 = var45;
               var10001 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var48 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label91;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % Il(1906138283, var23 ^ 1319759657)) {
                     case 0 -> Il(1906138282, var23 ^ 1837310971);
                     case 1 -> Il(1906138281, var23 ^ 396280848);
                     case 2 -> Il(1906138280, var23 ^ -1325092280);
                     case 3 -> Il(1906138287, var23 ^ -1172986290);
                     case 4 -> Il(1906138286, var23 ^ 770677370);
                     case 5 -> 3;
                     default -> Il(1906138285, var23 ^ 1895165989);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var57 = var41;
                     var10004 = var48;
                     var10006 = var6;
                  }
               }
            }

            String var50 = new String(var41).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var50;
                  if ((var25 += var1) >= var4) {
                     I = var5;
                     l = new String[4];
                     II = new String[4];
                     II();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label96;
                  }

                  var4 = (var2 = lI(113, 28, -641475742, (byte)82, 656720249, -2124970509, (short)22749)).length();
                  var1 = Il(1906138277, var23 ^ 591516547);
                  var25 = -1;
            }

            var28 = Il(1906138276, var23 ^ 58593043);
            var30 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   @Override
   public Object invoke(Object var1, Method var2, Object[] var3) {
      String[] var4 = IIllllIl.IIIIl();
      if (var2.getDeclaringClass() == Object.class) {
         String var7 = var2.getName();
         byte var6 = -1;
         switch (var7.hashCode()) {
            case -1776922004:
               if (!var7.equals(II[3])) {
                  break;
               }

               var6 = 0;
               if (var4 == null) {
                  break;
               }
            case 147696667:
               if (!var7.equals(II[0])) {
                  break;
               }

               var6 = 1;
               if (var4 == null) {
                  break;
               }
            case -1295482945:
               if (var7.equals(II[1])) {
                  var6 = 2;
               }
         }
         return switch (var6) {
            case 0 -> IlIIllIII.lI(II[2]);
            case 1 -> System.identityHashCode(var1);
            case 2 -> var1 == (var3 != null && var3.length != 0 ? var3[0] : null);
            default -> null;
         };
      } else {
         Object var5 = var3 != null && var3.length > 0 ? var3[0] : null;
         lllII.I = llIIlIIl.lII(var5);
         return null;
      }
   }

   private static String lI(byte var0, byte var1, int var2, byte var3, int var4, int var5, short var6) {
      int var11 = var2 ^ -641475741;
      char[] var10 = lI[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])ll[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         ll[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 45148;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ 26011 ^ switch (var9 % 20) {
            default -> 186;
            case 1 -> 234;
            case 2 -> 219;
            case 3 -> 231;
            case 4 -> 201;
            case 5 -> 157;
            case 6 -> 159;
            case 7 -> 168;
            case 8 -> 156;
            case 9 -> 167;
            case 10 -> 93;
            case 11 -> 94;
            case 12 -> 196;
            case 13 -> 119;
            case 14 -> 207;
            case 15 -> 56;
            case 16 -> 92;
            case 17 -> 128;
            case 18 -> 147;
            case 19 -> 44;
         } ^ var9 ^ var0 ^ var8 ^ var5 ^ var2 ^ var4 ^ var3 ^ var1 ^ var6);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   private static void II() {
      int var0 = 1759735857;
      II[0] = I(l(Il(1906138284, var0 ^ -2089984912), Il(1906138291, var0 ^ 1389376305)).toCharArray(), 95375L, Il(1906138290, var0 ^ 1540292386));
      II[1] = I(l(Il(1906138289, var0 ^ 1067240017), Il(1906138288, var0 ^ 122858130)).toCharArray(), 73642L, Il(1906138295, var0 ^ 1340531440));
      II[2] = I(l(Il(1906138294, var0 ^ -844816807), Il(1906138293, var0 ^ 1428077332)).toCharArray(), 909L, Il(1906138292, var0 ^ -652299170));
      II[3] = I(l(Il(1906138299, var0 ^ 990954984), Il(1906138298, var0 ^ 268878822)).toCharArray(), 87598L, Il(1906138297, var0 ^ 174352128));
   }
}
