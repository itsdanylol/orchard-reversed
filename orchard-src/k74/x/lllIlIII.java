package k74.x;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_5134;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_9285;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_9285.class_9287;

@Environment(EnvType.CLIENT)
public final class lllIlIII extends IlIIIIIIl {
   private static final int II = 45;
   private final lllIIlII Il;
   private static final String[] I;
   private static String[] lI;
   private final lllIIlII ll;
   private long III;
   private final lllIIlII IIl;
   private final lllIIlII IlI;
   private static final String[] Ill;
   private final lIlllIl lII;
   private long lIl;
   private static final int llI = 5;
   private static final int lll = 8;
   private static final int IIII = 7;
   private static final int[] lIII;
   private static final int IIIl = 9;
   private static final Set<String> IIlI;
   private final IllIII<lIll> IIll;
   private static final String[] lIIl;
   private static final Object[] lIlI;
   private static final int IlII = 6;
   private static final int[] IlIl;
   private static final int IllI = 36;
   private final lllIIlII Illl;

   public lllIlIII() {
      int var1 = 1529080760;
      super(IlIIllIII.Ill(lI[IllII(-447652579, var1 ^ 1740489518)]), lllIIlIl.IlI, IlIIllIII.Ill(lI[IllII(-447652580, var1 ^ 1944759607)]));
      this.IIll = this.IllIIll(new IllIII<>(IlIIllIII.Ill(lI[IllII(-447652577, var1 ^ -1332540522)]), lIll.class, lIll.l));
      this.lII = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(lI[IllII(-447652578, var1 ^ -695706707)]), 70.0, 120.0, 0.0, 1000.0, 5.0)
            .lI(IlIIllIII.lI(lI[IllII(-447652583, var1 ^ 1450159433)]))
      );
      this.Illl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[IllII(-447652584, var1 ^ 1785413932)]), false));
      this.IIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[IllII(-447652581, var1 ^ -949218815)]), true));
      this.IlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[IllII(-447652582, var1 ^ 703004878)]), true));
      this.ll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[IllII(-447652587, var1 ^ -1772204314)]), true));
      this.Il = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[IllII(-447652588, var1 ^ -1926756225)]), false));
      this.IIll.lIlI(this::lIIl);
   }

   private static String I(int var0, int var1) {
      int var9 = -624051086;
      int var2 = (var0 ^ IllII(-447652585, var9 ^ 1411600941)) & IllII(-447652586, var9 ^ 1310971029);
      if (Ill[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & IllII(-447652591, var9 ^ 14005729)) {
            case 0 -> IllII(-447652592, var9 ^ -1356023160);
            case 1 -> IllII(-447652589, var9 ^ 127566382);
            case 2 -> IllII(-447652590, var9 ^ -1519550653);
            case 3 -> IllII(-447652595, var9 ^ 298486167);
            case 4 -> IllII(-447652596, var9 ^ -862998929);
            case 5 -> IllII(-447652593, var9 ^ 824112759);
            case 6 -> IllII(-447652594, var9 ^ -17503816);
            case 7 -> IllII(-447652599, var9 ^ 799282812);
            case 8 -> IllII(-447652600, var9 ^ 296690167);
            case 9 -> IllII(-447652597, var9 ^ 581959614);
            case 10 -> IllII(-447652598, var9 ^ -1020201526);
            case 11 -> IllII(-447652603, var9 ^ -548586438);
            case 12 -> IllII(-447652604, var9 ^ 1272076200);
            case 13 -> IllII(-447652601, var9 ^ -784576140);
            case 14 -> IllII(-447652602, var9 ^ -1172276784);
            case 15 -> IllII(-447652607, var9 ^ 1823852154);
            case 16 -> IllII(-447652608, var9 ^ 1299409584);
            case 17 -> IllII(-447652605, var9 ^ -982428464);
            case 18 -> IllII(-447652606, var9 ^ -1062690449);
            case 19 -> IllII(-447652547, var9 ^ 603872643);
            case 20 -> IllII(-447652548, var9 ^ 1431588026);
            case 21 -> IllII(-447652545, var9 ^ -1576840350);
            case 22 -> IllII(-447652546, var9 ^ 1647159762);
            case 23 -> IllII(-447652551, var9 ^ -1239745281);
            case 24 -> IllII(-447652552, var9 ^ -599261190);
            case 25 -> IllII(-447652549, var9 ^ 581550279);
            case 26 -> IllII(-447652550, var9 ^ 112838904);
            case 27 -> IllII(-447652555, var9 ^ -917585395);
            case 28 -> IllII(-447652556, var9 ^ 1860427111);
            case 29 -> IllII(-447652553, var9 ^ 2097435053);
            case 30 -> IllII(-447652554, var9 ^ 19406401);
            case 31 -> IllII(-447652559, var9 ^ -2071364225);
            case 32 -> IllII(-447652560, var9 ^ -509153510);
            case 33 -> IllII(-447652557, var9 ^ 431609910);
            case 34 -> IllII(-447652558, var9 ^ 1535974406);
            case 35 -> IllII(-447652563, var9 ^ 1348240577);
            case 36 -> IllII(-447652564, var9 ^ 1802911041);
            case 37 -> IllII(-447652561, var9 ^ 2060088385);
            case 38 -> IllII(-447652562, var9 ^ 586344040);
            case 39 -> IllII(-447652567, var9 ^ -1987858331);
            case 40 -> IllII(-447652568, var9 ^ -1012312656);
            case 41 -> IllII(-447652565, var9 ^ -1811189641);
            case 42 -> 2;
            case 43 -> IllII(-447652566, var9 ^ -495695186);
            case 44 -> IllII(-447652571, var9 ^ 1046121422);
            case 45 -> IllII(-447652572, var9 ^ -1312039682);
            case 46 -> IllII(-447652569, var9 ^ 1935752469);
            case 47 -> IllII(-447652570, var9 ^ 532823503);
            case 48 -> IllII(-447652575, var9 ^ 1173687548);
            case 49 -> IllII(-447652576, var9 ^ -1712051509);
            case 50 -> IllII(-447652573, var9 ^ -1207109550);
            case 51 -> IllII(-447652574, var9 ^ 181230976);
            case 52 -> IllII(-447652515, var9 ^ -964082128);
            case 53 -> IllII(-447652516, var9 ^ -1228375807);
            case 54 -> IllII(-447652513, var9 ^ -841270112);
            case 55 -> IllII(-447652514, var9 ^ 1970181825);
            case 56 -> IllII(-447652519, var9 ^ 1738102991);
            case 57 -> IllII(-447652520, var9 ^ 2062245451);
            case 58 -> IllII(-447652517, var9 ^ 526601142);
            case 59 -> IllII(-447652518, var9 ^ -1224388683);
            case 60 -> IllII(-447652523, var9 ^ -142667230);
            case 61 -> IllII(-447652524, var9 ^ -648379335);
            case 62 -> IllII(-447652521, var9 ^ 543126148);
            case 63 -> IllII(-447652522, var9 ^ 2030084433);
            case 64 -> IllII(-447652527, var9 ^ 2098726980);
            case 65 -> IllII(-447652528, var9 ^ 296964809);
            case 66 -> IllII(-447652525, var9 ^ 1541841820);
            case 67 -> IllII(-447652526, var9 ^ 1586575429);
            case 68 -> IllII(-447652531, var9 ^ 1282060521);
            case 69 -> IllII(-447652532, var9 ^ -1265960378);
            case 70 -> IllII(-447652529, var9 ^ 1910744530);
            case 71 -> IllII(-447652530, var9 ^ 813626460);
            case 72 -> IllII(-447652535, var9 ^ -957402386);
            case 73 -> IllII(-447652536, var9 ^ 1291252754);
            case 74 -> IllII(-447652533, var9 ^ -1227204332);
            case 75 -> IllII(-447652534, var9 ^ -1261487217);
            case 76 -> IllII(-447652539, var9 ^ 1053140263);
            case 77 -> IllII(-447652540, var9 ^ 1003755956);
            case 78 -> IllII(-447652537, var9 ^ 823397070);
            case 79 -> IllII(-447652538, var9 ^ -1272816912);
            case 80 -> IllII(-447652543, var9 ^ -414053197);
            case 81 -> IllII(-447652544, var9 ^ -2094021720);
            case 82 -> IllII(-447652541, var9 ^ -352634662);
            case 83 -> IllII(-447652542, var9 ^ 368537184);
            case 84 -> IllII(-447652483, var9 ^ -481874328);
            case 85 -> IllII(-447652484, var9 ^ 899802831);
            case 86 -> IllII(-447652481, var9 ^ 179825760);
            case 87 -> IllII(-447652482, var9 ^ -256473667);
            case 88 -> IllII(-447652487, var9 ^ -1729140370);
            case 89 -> IllII(-447652488, var9 ^ 744222728);
            case 90 -> IllII(-447652485, var9 ^ 392966983);
            case 91 -> IllII(-447652486, var9 ^ -784144574);
            case 92 -> IllII(-447652491, var9 ^ -400155725);
            case 93 -> IllII(-447652492, var9 ^ 1911547072);
            case 94 -> IllII(-447652489, var9 ^ -62089837);
            case 95 -> IllII(-447652490, var9 ^ 393271517);
            case 96 -> IllII(-447652495, var9 ^ 1204014050);
            case 97 -> IllII(-447652496, var9 ^ 1209307246);
            case 98 -> IllII(-447652493, var9 ^ -1561780994);
            case 99 -> IllII(-447652494, var9 ^ -1317851422);
            case 100 -> IllII(-447652499, var9 ^ -1646606202);
            case 101 -> IllII(-447652500, var9 ^ 239035885);
            case 102 -> IllII(-447652497, var9 ^ 2045628141);
            case 103 -> IllII(-447652498, var9 ^ 2135713554);
            case 104 -> IllII(-447652503, var9 ^ -288759413);
            case 105 -> IllII(-447652504, var9 ^ 1704203591);
            case 106 -> IllII(-447652501, var9 ^ -842707399);
            case 107 -> IllII(-447652502, var9 ^ 1967783168);
            case 108 -> IllII(-447652507, var9 ^ 857858048);
            case 109 -> IllII(-447652508, var9 ^ 240574531);
            case 110 -> 5;
            case 111 -> IllII(-447652505, var9 ^ -1315770996);
            case 112 -> IllII(-447652506, var9 ^ 1632409578);
            case 113 -> IllII(-447652511, var9 ^ -83660674);
            case 114 -> 1;
            case 115 -> IllII(-447652512, var9 ^ -1442369181);
            case 116 -> IllII(-447652509, var9 ^ 1088451447);
            case 117 -> IllII(-447652510, var9 ^ 1453552483);
            case 118 -> IllII(-447652451, var9 ^ -118864215);
            case 119 -> IllII(-447652452, var9 ^ -1847952397);
            case 120 -> IllII(-447652449, var9 ^ -1327436422);
            case 121 -> IllII(-447652450, var9 ^ -1783801652);
            case 122 -> IllII(-447652455, var9 ^ -1167668485);
            case 123 -> IllII(-447652456, var9 ^ 885713745);
            case 124 -> IllII(-447652453, var9 ^ -1678771231);
            case 125 -> IllII(-447652454, var9 ^ -1173623940);
            case 126 -> IllII(-447652459, var9 ^ 132404626);
            case 127 -> IllII(-447652460, var9 ^ -1068580780);
            case 128 -> IllII(-447652457, var9 ^ 909416493);
            case 129 -> IllII(-447652458, var9 ^ -1102515);
            case 130 -> IllII(-447652463, var9 ^ 521533160);
            case 131 -> IllII(-447652464, var9 ^ 511822992);
            case 132 -> IllII(-447652461, var9 ^ 92228802);
            case 133 -> IllII(-447652462, var9 ^ 481996777);
            case 134 -> IllII(-447652467, var9 ^ -422266263);
            case 135 -> IllII(-447652468, var9 ^ 1625473481);
            case 136 -> IllII(-447652465, var9 ^ 930373888);
            case 137 -> IllII(-447652466, var9 ^ 1896670934);
            case 138 -> IllII(-447652471, var9 ^ 1482561810);
            case 139 -> IllII(-447652472, var9 ^ 1919005047);
            case 140 -> IllII(-447652469, var9 ^ 1883700422);
            case 141 -> IllII(-447652470, var9 ^ 1179371076);
            case 142 -> IllII(-447652475, var9 ^ 1696486482);
            case 143 -> IllII(-447652476, var9 ^ 1054604324);
            case 144 -> IllII(-447652473, var9 ^ -26689837);
            case 145 -> IllII(-447652474, var9 ^ -1215428163);
            case 146 -> IllII(-447652479, var9 ^ -1864203613);
            case 147 -> IllII(-447652480, var9 ^ 106772274);
            case 148 -> IllII(-447652477, var9 ^ 2052951872);
            case 149 -> IllII(-447652478, var9 ^ 1866066518);
            case 150 -> IllII(-447652419, var9 ^ -1048188400);
            case 151 -> IllII(-447652420, var9 ^ -1787364609);
            case 152 -> IllII(-447652417, var9 ^ 206437417);
            case 153 -> IllII(-447652418, var9 ^ 1472202556);
            case 154 -> IllII(-447652423, var9 ^ 832934244);
            case 155 -> IllII(-447652424, var9 ^ 1584297983);
            case 156 -> IllII(-447652421, var9 ^ -500420532);
            case 157 -> 3;
            case 158 -> IllII(-447652422, var9 ^ -187471814);
            case 159 -> IllII(-447652427, var9 ^ -730829104);
            case 160 -> IllII(-447652428, var9 ^ -1007121155);
            case 161 -> IllII(-447652425, var9 ^ -652105785);
            case 162 -> IllII(-447652426, var9 ^ -323731362);
            case 163 -> IllII(-447652431, var9 ^ -1856531074);
            case 164 -> IllII(-447652432, var9 ^ 307006819);
            case 165 -> IllII(-447652429, var9 ^ 344710128);
            case 166 -> IllII(-447652430, var9 ^ 1824854816);
            case 167 -> IllII(-447652435, var9 ^ -1199609425);
            case 168 -> IllII(-447652436, var9 ^ -851724896);
            case 169 -> IllII(-447652433, var9 ^ -1933776761);
            case 170 -> IllII(-447652434, var9 ^ 1773294444);
            case 171 -> IllII(-447652439, var9 ^ 650836285);
            case 172 -> IllII(-447652440, var9 ^ 1921823979);
            case 173 -> IllII(-447652437, var9 ^ -1527708623);
            case 174 -> IllII(-447652438, var9 ^ 755400644);
            case 175 -> IllII(-447652443, var9 ^ 2070136137);
            case 176 -> IllII(-447652444, var9 ^ 1878589825);
            case 177 -> IllII(-447652441, var9 ^ -1641761105);
            case 178 -> IllII(-447652442, var9 ^ -1292446886);
            case 179 -> IllII(-447652447, var9 ^ -777458800);
            case 180 -> IllII(-447652448, var9 ^ 1650646800);
            case 181 -> IllII(-447652445, var9 ^ 1446567861);
            case 182 -> IllII(-447652446, var9 ^ 1977699797);
            case 183 -> IllII(-447652387, var9 ^ -804448490);
            case 184 -> IllII(-447652388, var9 ^ 1520174116);
            case 185 -> IllII(-447652385, var9 ^ 1944773658);
            case 186 -> IllII(-447652386, var9 ^ 1977432824);
            case 187 -> IllII(-447652391, var9 ^ -730487294);
            case 188 -> IllII(-447652392, var9 ^ -542385249);
            case 189 -> IllII(-447652389, var9 ^ 1826998645);
            case 190 -> IllII(-447652390, var9 ^ -839374311);
            case 191 -> IllII(-447652395, var9 ^ 884072293);
            case 192 -> IllII(-447652396, var9 ^ 1398924487);
            case 193 -> IllII(-447652393, var9 ^ 1216877251);
            case 194 -> IllII(-447652394, var9 ^ -461961163);
            case 195 -> IllII(-447652399, var9 ^ 265942737);
            case 196 -> IllII(-447652400, var9 ^ -1312284174);
            case 197 -> IllII(-447652397, var9 ^ -1030148370);
            case 198 -> IllII(-447652398, var9 ^ -1924965123);
            case 199 -> IllII(-447652403, var9 ^ -1602202630);
            case 200 -> IllII(-447652404, var9 ^ -619529206);
            case 201 -> IllII(-447652401, var9 ^ -872331512);
            case 202 -> IllII(-447652402, var9 ^ -1834089771);
            case 203 -> IllII(-447652407, var9 ^ 1073653404);
            case 204 -> IllII(-447652408, var9 ^ -985913964);
            case 205 -> IllII(-447652405, var9 ^ 1146414618);
            case 206 -> IllII(-447652406, var9 ^ -905303805);
            case 207 -> IllII(-447652411, var9 ^ 1226303754);
            case 208 -> IllII(-447652412, var9 ^ 2044783001);
            case 209 -> IllII(-447652409, var9 ^ 982265189);
            case 210 -> IllII(-447652410, var9 ^ 1882018360);
            case 211 -> IllII(-447652415, var9 ^ 1597984002);
            case 212 -> IllII(-447652416, var9 ^ 1107185947);
            case 213 -> IllII(-447652413, var9 ^ 1108605428);
            case 214 -> IllII(-447652414, var9 ^ 1566528106);
            case 215 -> IllII(-447652355, var9 ^ -1114810076);
            case 216 -> IllII(-447652356, var9 ^ 676207585);
            case 217 -> IllII(-447652353, var9 ^ -297982206);
            case 218 -> IllII(-447652354, var9 ^ 608018914);
            case 219 -> IllII(-447652359, var9 ^ -465852457);
            case 220 -> IllII(-447652360, var9 ^ 1939194436);
            case 221 -> IllII(-447652357, var9 ^ 485038679);
            case 222 -> IllII(-447652358, var9 ^ -1200479643);
            case 223 -> IllII(-447652363, var9 ^ -1281740445);
            case 224 -> IllII(-447652364, var9 ^ -12957220);
            case 225 -> IllII(-447652361, var9 ^ 1787581957);
            case 226 -> IllII(-447652362, var9 ^ 1516219005);
            case 227 -> IllII(-447652367, var9 ^ 415952542);
            case 228 -> 4;
            case 229 -> IllII(-447652368, var9 ^ -986301447);
            case 230 -> IllII(-447652365, var9 ^ 891905807);
            case 231 -> IllII(-447652366, var9 ^ -1530635475);
            case 232 -> IllII(-447652371, var9 ^ -988043563);
            case 233 -> IllII(-447652372, var9 ^ -340239610);
            case 234 -> IllII(-447652369, var9 ^ -1576745344);
            case 235 -> IllII(-447652370, var9 ^ 1049822706);
            case 236 -> IllII(-447652375, var9 ^ -1444775467);
            case 237 -> IllII(-447652376, var9 ^ -1537729325);
            case 238 -> IllII(-447652373, var9 ^ -57225892);
            case 239 -> IllII(-447652374, var9 ^ 1329077960);
            case 240 -> IllII(-447652379, var9 ^ 2025717015);
            case 241 -> IllII(-447652380, var9 ^ 72651723);
            case 242 -> IllII(-447652377, var9 ^ -1345291564);
            case 243 -> IllII(-447652378, var9 ^ 1723716676);
            case 244 -> IllII(-447652383, var9 ^ -352982881);
            case 245 -> IllII(-447652384, var9 ^ -1141697751);
            case 246 -> IllII(-447652381, var9 ^ -1943540402);
            case 247 -> IllII(-447652382, var9 ^ 1679268518);
            case 248 -> IllII(-447652835, var9 ^ 234366039);
            case 249 -> IllII(-447652836, var9 ^ 755709771);
            case 250 -> IllII(-447652833, var9 ^ 311242933);
            case 251 -> IllII(-447652834, var9 ^ -2012884723);
            case 252 -> 0;
            case 253 -> IllII(-447652839, var9 ^ -512491220);
            case 254 -> IllII(-447652840, var9 ^ -41696231);
            default -> IllII(-447652837, var9 ^ -1371807594);
         };
         int var5 = (var1 & IllII(-447652838, var9 ^ -1957177236)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IllII(-447652843, var9 ^ -1842072198)) >>> IllII(-447652844, var9 ^ -1266449850)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IllII(-447652841, var9 ^ -1934602946);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IllII(-447652842, var9 ^ 172873478);
            }
         }

         Ill[var2] = new String(var3).intern();
      }

      return Ill[var2];
   }

   private String l(class_1799 var1) {
      return class_7923.field_41178.method_10221(var1.method_7909()).toString();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 139635158;
      byte var14 = -1;
      char[] var9 = "㝑〱".toCharArray();
      String var8 = "\uf0bf몁ﵸ컝菦ᣅ引焑뤉\ud9eb쒶䄫ầ荝⹃⭖\ueb25ᛣґ\u2fe0쎼ꋫ豹퍙횤\uda3fㅉ㲘㘶㐤鞐\ue287ꣂ\uf615땫횓韢셆ᦑ酑㲎㘨絛揉׀㊺⺐⸽㍑۾㙞걄숫Ჾ⮭䩖\uefd2类᭦៵原䶻叿\uefc4韅頺\uf51a㛢颡Ýዡ㶂祠샺ﯵ赞㚟အꜽ\uec3f烅㭔휥鹾翤疊ሇ䧶㾣뛴䂬⫡\uab17䦙礠䊉㡰㙞쟑뗘╚豛\uee12崇㇀퓕㺘ꊟ퀇ꯣ雔靫坉槫\ueb05랣물貪梂䎈衴엻㘖픿崸뇀香垒Ự⏲፸⍋뢥\u2061\uf73e캢悲몤\ue7ee㘶㸧郟ోﾶ䇠ꪎ괖࿊榓猜\ue69b틾ᆄꗙ㖱窟懙첓葥㍪㛡⦫ﭪ힓劊窏ꔨ羉䝈㚂騿柩ꦰ七姢萵腄㜯ມጢ⍆颿㘹䂽诊\ue97c麃陮餗\udc4eⵅ\uf4a6喽鏅蚍쬎綩泳\ue9b1횻\uef82轷듌㛖\u1f1f肑ఴ\ue24b梥ﮡ蘯暱͜窳ㄛ\ue3da㿈\udfc1䰧늾\ueb7aڃ⬌禍㛲䶆铃\uf6b5짇궛˵쨑찱㚖幟寐铖䀆⼐\ud97e欷ꁂᬒ嗃捄\uf215뫗ꍉ注郟㚹蕰峄\uee1f\u0cdf速娴셦黔㱘께㞖뾧ꨶ앎垣췮棞澐ᰟЏ놐渷ᯋ➙捍拴調⽘Ⴆ㫍씸㞸\uf2f3탑汙鳨縣㛰ײַ\ud9c3貙篯㜩뼚\ued0eꔇ\udac9䧻㟕\ue036켖ᒲ桂Ⴜ뱖䜣낉긭\uf4e6啺ᧆ⮤怜䑰䰺㜖횞⧤覌\ue18d㷇柫\ue857護疐\ue795춄麆㝈䷘᱅ﯜ嬠쒃ᥦ頃\uf830㜣饋搑뤗\ued15\ue8b1샃伻慪\uf79f尶챇⨕쯣㝞㴝㟳㐇頗퀎\ue2e2邱飺迹ꤍ滻㝔\uf714\ue838㔸밅痺ᘤ걩怋퐰ﾨ䇽薨㜆\uf8c1紽ꌸ\uf74e슸菂\ue190띮문鱒ﭞ숦駄푛\ue78d턙㟓鷀ꅿṵ㴑턗⚗\u3130鰘࿗⭷鬊彡ℍዲ쭙ᒤ㜿ㄟ\uf5b6⼐\uf3f7뮱፬꿏摧\uf63cᏎ珌霊榐矛\ud956릥㟀䫔\uf170想׃⟪秬\uf644\ufeff큍蜳閝첵꯸堻䤪썾㜜넣ꝯ凈얩삷춶ᑸ\ue6d8㜕로榅ᜃ䄪㼢ᑆ繉യ䶅䙎퇧䶝牨ﲰ튢刲炇策\uf5aa爇㟬턼伧煇庾\uf0b1讎觚콪\uf614陏䀐鳃䑩ꀙ䥄颿㝤ㅥ뮧ڙ㽦狷蹼ផ攱챳跓ꀾ븤㞻鰠쩝㊕뢛鑚\ue1b2嵶븚⻀\uf861㒼뛮䠖쁥嘑잃傳ꕭ竝\u0017睔悔撨䂗䘝ᙼᏳ㓫\uf1ca\u2d2a\ue65f囋拁䖍뢐鳔㫷ꅾᔡￌൗ耊来\ue604㐇捣뀖م홌൚댆\u2ef9㒕ퟝ混땗粭巎欕䆣㏌鍘\ue484歨홅㒂쨙\ue00a莧륻\ufff4ᵻᶴ딧䪽⩤䐰廊瘝ꚸ둉䵵㓠\uf5a2ⵊ眖\uda80㐲檊融鿥墚䰈ꮗ蜟镳⟷⥶첻梯㓾曻胪נּ\uee96\udf8d蘿鷡ﻢ㓯糤\udfab譱\uf4ddᩉ\ue2a2ᔂ쑡\uf5b7绗뀾\u0015誱䪍翐瑖㓷㍣\ued5eſ㵓\ue3a5倞䴚♂\ued88恮䯹ጜ㾱ꍬꮥ\uf626릕蚏㇣綍㒈㣜ꞎゖ頯ʝ\uedbf\udabf幵涩\ue462ꈞ뢦㐡湲\udbe0ਇ尫㚳嘳㳽剭䄏\uf2f6ꖠሱ㐂\u0c5c꞉굫ଧ脀촙ꡭ㌖\ufdcb⯡秵墬㒾걪࣬Իቶ횎\uf189饉獺獶斩溹☘쀪\udee0鬐썰㓫叓✼꿡躿훋엫螟嵧쬣㒨굌䖲ྚ\uec37諴랼㊹ヌ㓊櫌鼙ዕ\ued70Ⓖ䘳箌ᶤ㒞ᆡᵷ躇輶柋涢豒㲭쮼䐌뇊㝻푡∺輞\uddf5㒫祱闪\ude75\uedb6赺\uf750碁헗ꊱỶ읕蒴쁈͡䥢⑱㖧\u196f\ude24⫪\ue7bfǠἤ朝婫껬➍㠄\uda86\ue6cf\uf684籜㠆㕈쑼ꪺభ\uda25裧䀫縇饁칶艪黣♦ρ\uf278퍼祖ڽ척ᩏ钴韷㖩覔쮭誩မ\u0a0d\ue36c寿泉琰诖㗒臋ネ섖梅堠䓓궣㠏\udd1b㗟⢲ᱽ쐕쪆捴䍱鱫鈊\ud962ꉧۊ呌⣏ெ哪雋缯锞퍗椎Ќ\uda0f\uda58ﺳ疖陔ɛ䰠駙昱罅䴒䩺ὅ㵙视磁\ufff1ಷ덀袪뮭떘ۆ功蓞핧ꮪ\uf4a9౮뙌ꄳ쀦굍ԝ\ueb2f髗橊뭄৩綅䳥熀䐫࣊辤漚ꓮ\uef03净쩗谝\u0dbc䣟\ue3e1䨅葨ꪗ㻍\ue261浫㓻\uf434苑첌碈紤꾷䈔㷣㺓ৄᄸ蚊匕\ue88c흘\ufde8㼊㬀㍪⧅ඒ䐲\ude5a\uef77ᴰ馅ꃒ䬅ෝ戱鱓翤ᄂ唫徻琡뤉뎫㗹ⴗ妀\ue506㘎\ue638샙げ珀㗶绸腒躗蚵蟯ޛ烧ꅔ䓠\ueba5\udda4Ζ苔멂믧頩㕞覆妦\uedef謫\u31ed浝鼧\ue95e㕧⾧퓃当쿤꧆\ue49fᬊ䠯㕼❿ꢁ㎸燲\ue90d獏륷➷衒ま蚱휄ʹ脝遷\uf563\uebd7畮吾\uf89b\udcf4ᣟ慧坾쎗헀丮髽㉢䑦ꋹ貔㶚눩\ueb5f纹\uf119\uedf6照\ue68a盀㊾\uf3ac→䵜濵꧆贓∤羐䞏䀹鈥㴱芉ڱ\ue8cb\uf231鏮턗ఓ\ud9c1\ufb0e\ueccc舡秘㉿ᰖᆜ줥赕\uf31f\u19cb魔\ud81c圴\uf402补逓쇹샣\u1aff䪂㊟ݠ턷炰\ue9f8灡怦뚕巻슃燧莹狠ꗶ皤쫫陉㈪쓹楋ࠠꜦ⥤눕㉱烓钓ꥣ횧啐㋮榯ۀ혎\ue58eܯ⢖봰\uebb4ꝓ喼\uf1bbⅴ\uea4bꀲ」馊㊏瘄冲핤髸씿웤㋑ꋤ䵲䐃⯉ꅿ♑轤뎁㋠龜뻗貫埐✊격☝䌐\u0c75\ude53谄忎⛤숂㏐\uf81e㊗鵗≧\u001f῀嬆㋮\uf138턮䆀圑픧餼뙚炡ꋮ㌂嗵\uebbd⫧㟐溷ﰴ㉉滞嗖윏秞㖢\uf22e娶\ue039䚊⸧\ue9f0㊀뢃\ue941퓢呿⇾\ud8b7븳\ue04f뇞꒞憦∑㈻仈馎줘ꢏ鉶돀쮘舱\uf5ba饝蓖嶀\ued80\udfafᤚᇕ촿떐匂\uf6a1\ud80a盌挝۶㉆싇Ꟙ騅禳䯃㭶毬Ḍⰱꕏᚗ\ue71fጄ橸Ặ宜㋨傇Ꮘ\ud7afᓎ深ઁ쑯Ⓖ纤ᭊᰫ骶ꀩ垌닁\ueb54㋄兘⻜띓獞ᲇ仐ꌌⱜ\uf0d9蠌๗␏腻錄瀩ꡮ㎈Ꟈꗽ鐌ʼʁ兎ᱪ끷㎩\ud80a᜕孖똞䖼昂ꅣ蔐븗ᢚ㻪ꨙ﨩퉡苡쪇㍪愔僠걏\u0cdc✧়裿桕㌺䴐녴浚\uf564ඹ檒鏋粡㗐\ued7f墝꧓㠩쳏뒟撸偙規㟨花㌮쨲\ue1cd⌀뛥⒜ꮪ\uf895刺㌠鿏햆칙腓ﾻ᳹\ue997浢틀\uabfd㍾ꎔ\u0b50\udb3d念ﳏ⨖횺ﶋ㌔噓旅ⓕᖌꞟ㍬帿䭷Ɦﱔ몜꘦텎넱࿏䭨ㇱ⾬뵍浮퇄⩫娅뢈᎔䷩㍕㖉ܼⳬ᧧榗췡⤽㏛䄹牳햃裁⛱鼕拉ؠᐈ窃癑㙣㋇\ued76藋ꧦ㏮罂淫햗݈鲛空䬏ｗ쵵檨輵\udf2e㌾飧楰逜찅蹖⬌켘隆絃\uee36쫒琫㎈ꝥ솚䅺⁞垟\ue60f\uf096쨛㏭圅\udcf7镢▩ۮ\uec83貜틕毾絬䁱钰\ued4f\ue511䢾\u2d78첨迿俯\uf14e㎁蘏ࣾ痗똨藛滗歙啲㮆쐍赝＼㎢ˇ䩏瀃\uecaeĔ\ufb37\uec26\ue0f7匍婹욣㞴㍐䷤煃畟쎂烸鞳㔮⭢㍓ᣙ澃Ⓥ绞\uf482퉴⌨籚ᗠ奫퐧꛱㍌촔唊ಚ⏽␑넆哪쇊慢䴌ৼ\ue99b薵뗴㹄笤ォ\uf149\uf26b샓\u0e62⌗\ue36e\ue5beゅ儚\udb72灤鐒႖켛뜄籸浻뻴춦ꢙ\ue6b9랱㹌豧ぜ긡耬韥숕撄첵萱\uf852ऩ儘諯ゆ碖芻ⳝបん\udb6b\uf7f5ㄔ൨拻ꑐﱽ⚷쥻䒻湦鲮ಝ㰵╤骂퉝覭鈢\ue505ネ⹇ᝄ䑤︃锏\udf4aX쑱\ue718ꤋ肄ఊ폚䑐\uf3df\u0a64ヅօ傿롯肉\uf88c砦躶\uf837ァ呮ꇐ鈐曪↬踢螶匪鷗鱇뫏鮽\u1adc貚\udd0e锏げꃾᛇΪ\ue826ド骻퍼\uf757ㅴ肵魯ﰹ춟ヲ㽤ꗏᘾ⛨\ue5ccꈈ䌋汄〣在\udf77\uf27e\uf065嚖䵦䪧魮諘礷쑯滈ﭶ囖෪粰ヴ렢쎗핍힘貣嗸\ue41d\ude88毓\udff9्ಷ⸠\ue01d䍷\uda1e「捫轩橩콺ꊈ\ue1ec剡銰ﴴꮊ뿥Ѐ゠檇튌╿驪\uee43盨ᕑ㰛嗇㵘ڐ⢵ぜ騽䅖ﺥ\udec5妧\u0b0e䋒〩끩团۫欼審诩엟휚겴鉇≔볛えᰔῬ跎Ὗ㎮흻搆ꃞ\uf1ad鋍꽥\uf240핞룘캔쫭犁\uf7bf쪺瑎て൚嚅\ued1b蝨鑒ᐯ喺蝯\ue6fd蒒\uf662醪〵꧙鮘\udd31끁⹍醪ƚ궟ㆺ謰鯑໊旭ຒ䖧晑㩆뵒ꦿ긒\ueae0\ue1ae㒩בּ\u0a4eㆸ쥺葁캐儤ㅦ\uf394䥡闣ྐ㘽쿳ݲ䓟憡ᰶ穣磁\udd33촶劵\ue677ㅩ㟁첷苎\uf40dꖫ㈦鲼忦乶귳ㆢ荘覼ᮂ\u0c5e⡺惇᾿䰸曰\ufadf\uf81c䀔炘曕兗諘ㅄ脌썆蒡醣ꂑ噹蜓첂韏Ⳅ짪윲맭ᱸú쑌鴆逕舰ࡶ珇\u1af6ȡ絺\u31e7决啷ꝙꥀ鶆\u0fcd簁✃ࣹ殣䕐\uf39bㅆ㞟牧勁\u2e71驪ᛑ솠㮛䓕絺\udb46髉\ue39c禼㇢ꇪ\ue105䙈鍮ㅶ魳覛\udd11鯚歖\ud8b3笨扆嵼쫛\udd3d喋ﾐℸྺ\ue610딮";
      short var7 = 12328;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            lIIl = var10;
            lIlI = new Object[var10.length];
            lIII = new int[975];
            int var22 = 0;
            int var10001 = 0;
            byte[] var10002 = "E\u0096P,QÁ>*\u0092¸\u0098\u008aô£È±tD>UH@Ò>åG\u0081\u0011\u000bÌ\u0093Ð´uÝó¯\u0003\u009bu\b\u0019\u0019qíç\tÊ£\u0010q¹\féqv¤_Kª\u0006¨¶Ñ²\u000fM?oJj-\u0092Û20]1-t\u008caÒÃ²jå5\u0081j;\u0018`õ<C|\u0088ø\u000eè\u0017\u009cQrù\u0095Æ\u0019å½\u008aÏp\u000fíî¶£$f´\u0090bcmhâ\u0080;\u0096@ö\u0091\u0085ü\u0001Æ\u0097îÁèmù\u0015ß5º\u007f\u0082;F\u0081l\t\u0084¥|\u0001^j\u008b\u000bNÍ&\u0019{ÞÁ\u0095 ¢íÚG'L¹\u0097Bc$Íº|\u001c¾øHÕ²ó\u0099M©È³ùÂÙ\u000f°Ð\u00817- *Ft\u008f`l\u0091¾7Î´\u009dA±\u008e\u009c\u009d\u009fOÒ\u0012\u000e\u0018ÀÐ¤ù4¼\u0007ù!æ0Èð:1îê\u001bÉ<>©\b\u0096IeL\u008d\u0080\u0015\r²¹n\u001eø2Ö«R±Ä\\\u0093dÙ.\u009a¬¼¦\u0082\u0089\u0014À\u008b¶TºÖ\u001az\u009fO\u0096\u0083\u009a¹2ÚÅeaÞÝÌ\"²v\u0096½ø#j¿ýTüÌï¯t~\u0017O>¨Ò&aÅ\u0093»00e*önï30:\u0015\u001f\u009d\u0082\u0017\nò»\u009d\u0000ag\u0098\u0011Ðk\u0092ÑÁx\u0017ç\u0091OD\u0097Ç\u0017 ê\u0007«I>ñ\u0003¶2ªW@\u0082êy\u0096d-K©r(³SsN6;*¢à\u008f\u009e4L´©ú¥r\u0087.IKãÒTÒ* Ú_\u0089Qè´µ\u0011;ä\u0006\u000fçëÑT4\u0001,Ø¿\u0012¶êÍ>\u001f\u0001\u0096\u00adú¡ÞÚ(\nNÜ\u0089®\u0007M\f%üÆQÜXn\u0000\u008a\u0092Ö\u008c6¯\u0090ä$×\u00ad\u0093)¯\u0012W&\u0014Â\u0089S\u0093XÆ»ã\tÂõ\u0086ã%·7õf·M[/\u008fF2\u001f²æ\u0013%)®6h\u0091Ó\u0019£\u000e\r\u0097\u000f/\u000e8*?:\u0019Î/Í¤!\u0091\u0004c\u008b\u0004d\u0095ñ\\h\\*é\u0092¼Ð2\u0010½D\b'¦º\u0085Ú¿\u007fk¥E\u0011~¥Ã'\u0005ï\u0094±¨\u0012ÒÉ\"äû\u009bÝPÑ¤z\u0010Ó\u00837¾å\u008e\u000f]ÆÛ\u0090\u0087\u009d\u001e7L]\u00adzí\u0014KÂÏ3'Fö¥\u0098ó\u0015Ù\u0098K\u0014Ìü.Åb@.\u008c6³1«¯\u00888\u009eô\u0005Ã\u0085\u0092`Ueý«³\u0089Aéô£W\u0016¬¥wµªQ`=EÖzäc7Oq\u0089p2\u0092\\°±\u0089IÊ·N\u001fIÏ\u0000Úë\u001bº\u00adjnþq\u001c/y,jÊw\u0097\u0093\u0085\u000f=óÑIp\u0090\u00074Àñ\u008eÃ»8Ø¦\u0001ÔÌ<Åú=ár[\u00113\u001airm/\u0099Á§\u0014Zõý\u0016eÖ$\u0089¯sÈÓ`ùYÀ7Ð/ xÖ\u0018þ\u0087w°m\u001f|n\u0010½Ï \r\u007fn=î¢\u0097t\u001bvð¤-\u009fëMÖÄG²Ìø¬\u001c2)\u0012\rå,a\\êë.\u0086\u0098\u0019\u0003E\u0098Õx×w/oÄ\u0083\u009c1kÆµ\u009c;m£fùá?ç\u0091\"ïiÏâ)êÒ-òÚ%-f\u0099IäæÓè\u0096ñüú\u0089eâ;\u0095ááÖ=\u0097þ\u009a\u009b*\u001eH\u009d\u0087\u008b\u008bßªMøãI\u0087øeIGþc\u0011ÐP\u0006·¿,Þþ\u001b·æÅ\u0010_õ\u0082\\ÿ\u008d\u008bÉI\u0092\u0098ù\u009anÍ»\u000f*Æfóòl\u0096ì£ü\u0007\u0001\u009fÿfÞmÛH}\u009fÅ\u0001Á\u000fâ\u009dVÁ\u0015\n'½\u000f\u0007\u009dÕ¼_S\u0004)ìýÚhÛx4x§\u0091W\u009f\f\u0015¾>Åx\u0010ïI0!ï\u00186×å/â&]ÇÒ^q®=áN\u008eÎò\u0000±Hø$+À\u0014qB±Ä7^F\u0001Ô\rþ%Q(\u0092\u001d?1ðé&\u0017FGH/u\u0088`©\u0088\u0012Y\rõ\u0084{1q¿N\u0007¾êÌ\u0097\u009e\u009c!Ü½þäyR@LF\u008f\u008a|Á\u0083\u009e:V\u009eëJ¨5\u0095Ú]J@Ö´hX.`<¸&e¼u9\u0096'µ\u0084\u001b\u0018è*\u008d\u008c\u0001BÇ#ü\t\u009bé\u001c¬\u0014ivÄr/Ok\u0080Úê&i°ÕV§ëmKQð×Ð¦£ñõ¤ì\u0086ë77m\u0082\u0099ý\u0084yÛVÍ¯\u0012\u008f\u0088ªâ¾t÷[\u009bw5ibõÐSk×\u0014\u001c\"ÙmÉ³e\u0018«dní BdÀ/Î\u0010À\u009a\u0081\u008eÊ|ó\u001b8è\u0019\u0017_\u008bç~\u001eêP\u00164¥\u0093KQ\u0092kF*\u0097ËS\u0088¨\u001bxÈVòÀßH¨ÖÏ\u000bé\u0011d\u0019ÿU\u0080i¢\u0090;\u0083tê\u008a\u0094T2´éÿ`+ó´\u0080\n¥1j\u0001Ï\u0019\u0085\u001a \"à¾\u0083\u0091ì+ðâ\u00ad_y\u009a\u000e\t§n\f_\fÂ\u0091w[5\u0088\u008eÙÔ:B\u0098à£ó\u0086µ\u0093\u0084É»>[SJF¼y- ^ÿy]ÈÔ\u0019¼ê\u0083á¬\u0097ÅÌóÝÒÓºx\u0086é©\u0018rcxLÍ9*ªÂ\u0095:Òó\u000f_\u008c\u009bå5\u0007\u008e·TOÃýÕ\u0015¡9ÝQÉZõ\u0019X=Ó,¾¡º¢\u0095n\u007fçöÇ| Ì\u007f\n\u0096æZªÓ5rS\u0012¢¯§n\u0000º¥9¨×oÔ\u008a\u0084\f>ì]¿²ÏúQ&\u0084í\u0084®Î\\ÙWa\u001a9îY\\!Î5\u0085M¦\u0006zÛCs1mø\u0094¾Ú*(\u001d÷¥\u0003è^\u0002\u0015\\ÚÄFSaiÚV\u0007\u0017ö%á!4åþúK\u008b´\n\u0010<\u007fîñÁQD\u0089¼\u008a\u0080\t\u0090´¾jáõc4l)»\u008a\u001aX]üzbgy*U\u0082@TEí<ói\u009cµ¥\u0001\u000bB¸\u0080¢\u0080\u008a+_é*Ò²á\u0086\u0017ñ\u0001\u0092LS\u0014wç0g§¦Ñ¢C¸zÚ8Ù±/xÆ\u0002õÙº\u0098Î2Ø\u0082\u008b%\u0013\r\u0001Ä:»\tlG©=¼ó`ûHM\u000f\u0088â²(æ\u0080q¡Gj(4õ\u0093ã)nA\u00854ù\u0083í\bZ;Õà3¨\u0095^\u009c«×&$nD\u0085\u0019Ñ^c¶N\u0018ïHîÆÁ%\u0087ýá_>ê¯²\u009bt\u008dÓ-ö;£KJÀ-ÁTù\u0082Ï\u0085¸fÂj\u0014\u009d²3\u000f\u0099EmÌø%à5·½®ÝrN¸Ö\u001ae\u0001½\u008dOE5\u0098Ôµ\u00ad\u001bÄ\u0092FXÓ\u000ew\u001c¶ïc¨n÷w=\u0016b\f}\u0091=ÿ\u0095@kóåÃÇç+`ûQ·\fsØoH½5C\u0099H\u0002Ôè³eA\u009aæÙ\u0093\u008c1\u0010\u009a=´Îºÿ\u007f(C\\\u0080i=\u001f°/\u0013Ø\u001c¬J\u001d:0O\u0002]_\u000f2\u0017\u0099\u008aå{`Hn\u0085ø\u009dzwÓ\tpå½eçÅ\u001d }\u0088~;ÙÂ\u0002³«\u0099È\u009aU¨Ó\u001cô\u0087\u0017|¬C\u0001\u0082XÜëRx;\u00015|\u000e\u0003(YA\u001c`.E\u008e\u0095¸J.\u00874«w\u000f=¼T=\u008c[Z¦ô\u0081°\u009e\u0015äQ4\u00140\u0012¹ød \u008dö2DåX×öi\b\u007f\u0086âÆ¦óV\u001d\u0011\u000e§ß~ 4J\u008a\u0084Ü\u0081\u001d\u0004(\u001c\nQI\u0013\u0091ÆÛ\u008f\u0001\u009bBR;6×k±è @§\u0085å]ÁL¿Yx?G.\u00adz\u001ewW^0lèÊ2\u0007êA\u0083ö¡D ç8ûsD£Õz\u000f*\u00adê\u0018Æít1&õª\bÿ\u0092\u009d7Ô6¿^Y\u007fiõ4\u0096\u0013´~BØ^þl\u0082L¤LÐ\u001al@³_ó®\u0014\u0091Ó²^9</\u001cµ!¾ß\"PÞÃ3D\u0093&¸§ó»Ïqõ\u0080\u0018\u0015³ÏÀç\u0011C\u0088\nYçM\u0015,\u0087éª\u0090óºfM<¨L\u008d¼Ù\u0007f\u0094ÚÏ\u0006,\u0092×<XcA²Äe¤k3\n\u0091ÂÓwªÄÚN\bêÜÏ\u008a,ß\u00ad;þ\u0089â!ç#\u0085\u009b&`÷\u0091}äCL¼¹\u0091ÕKþÿ¬|\t¾\u008d2,o\u0081þ\u0002\f*\u0080\u009fÒ{÷rñÃ\u0002\u008cý½,\fX\u0080¡Mfg©µFø\u0087t¡\u0012§\u007fM(&¥\u0089\u008e\bÓ0\u0013Í\u0011\u009dîÿ\u0001\u0017\u0098â\r/\u0088\u0097\t\u0010\u0007d\u009dÃ½J¥_Ê\u00ad¶³E~\u0096íµ\u0002 ´¨F{¨¡\u00adóþ+å©\u008c\b\n£?\u008cJæ\f+Òÿ;V\u0015øyÃ0\u0087Èy9ú\u0080P\u0002Áµ5 ~\u000fõéF\u0001V»t\t¨ÁwÅ\u0094æÝö(^\u0015\u0086°oºlÆ,p7[5fôMÍÝOßO.V\u0088@\u0089Ü¥F|k\u001d[lvk5\u0003R|Ö\u0087Vgãà2ßg\u0006`ô\u0013\u0017;\u0007¨Pþm}¢a\u0001ª\u0013Èú$\u0010Dt\u0082µx¾½\u0000K»\u0004OÎ6\u0087ZÐdrO4Ü\u0002kÉ8\u0085\u00ad|ç\u009aêaèM\u008e¼ ´NH\u0016£Ø]h\u0017mwð\u001aWÝÔø\u0095a¹Ê\u0003\u0000©0\u0002oxO*×M¦ÏJ\u001fÆ'\u009d«¦\u0087H\u001bÁ\u0085ÜãàåYc0ð\u0007ã\u008e¢â\u0082nhÎXýùÿ<²ô0òùö)ü\u0098c¢9\"lZf·\u0093@\u0000Õ\u0019Ï<ÇØe%\u009dÒÀ=H\u0017É2¸\u0083Iã°\r+úØW$\u0086\u0093Oß\u0097á@Mà¦½e37\u0015\u009e\tX7¤Àå#ª\u0093?,/ïÆÞlÃ\u0007\u0098\u008d\"Z~è\u000f`Ä\u009eð6\u0016cÝ\u0087í\u009a$È\rÚJ\u0006KmÙt%rfÀ÷®®\u0095\u0087¾8\u008aõýÿ\u001b\u001dÝ¨Z\u0094´®D»\u0083±Ñ°xëç4\u0018\u0097ÚîqÒ¡\u0001\u0097z²\u001b\u0091Ñf=pSß\\£YµÙ[ê\u0083é¿º\u0088ñooOôÉ\u00ad¾Ìµ\u001e¦A\u0098ò\u0005=b\u009fÑ¤'\u009f>}\u008a\u0003,aWÄ\u0090Ù\u0000±Z ²p\u0007\u0081;ré¦\u008cM\u0097Ô(\u001b\u008d\u009e\u0080lX¢\ntS`Ù\u0098®§\u0006*l\t?ë\u0086\u0097¸§\u0018\u000eÞZT\u0091x\u009d\u008aè/´[`\u001f§ýÏ+K¥¡7d¬¤ä]¢e\u0089ä³ZRþo®\u009d\u0081ß¥ª\u0096Íô\u0082:\u008aãÎüc\u0099h\u0082\u008c\u0018ük3©¨Vn\u008b\u0019RùÎ\u0081à3Xg\u0088\u001c\u0080\u009eÒ@ä\u0095pi¬÷«Ä(\u0012q[Öec\u0018¡\u001f\u0012Y]\u008f$\u0093þ\u0098\u001f\u009dBªEc\u0098\u0088æ2g\u008c«\u009fós àU;SÉÍêDkÈSÌN'CF`<ÁOvxQ\u000fB\u0084¶\u0005ÝÉCà<ü\u008e\u0089Q\u000e\u001cN\u0013lÂc\u0004\u0001\u0092ÊÀß éì1DB$\u000f\u000b\tgÕoÖ(\u0086¹!êÓ\u008d0\u0098\u0000L\u009a×\u001cSú\u009cm.\u001d\u0094p¿\u0089ÓÊL5úåKÙ2\u0015\u001d\u009e¦e5~\u0012EY\u0019±ÒIØA\u0099|ÕZlÌpI\u0006µ|»½F½®,6XZáå-ñ+>þ÷!jî:\r\u0082}ê¸ä\u009fÎ4Ý\u0011:HDÓ\u0000DxJ\u0088\u0085uoÄZ>\tÄDåùcÿÒ\u0000£ÿÔ\u009d\u008d\u0082?×ÆTÑ8K\u0011\u0085\u0007\u0015\u0003Eª\u001a»=?\u0095´\u009aàÑì\u0003\u0002¿KÀüÃñÉ>ÂiY¼ðß¹+(ó§+6?\t7À\\\u0084s\u000fD\fL\\$õéâÙ\u0099\u0014Ý\u0080`^\u001a\u001d7D\u0017\u0005\u0012Ô`\u0082j\nZWWê\u0092R.\u0003\u0002¾\u0097¿SÖØ÷x\u0013u1¿\u0019îI\u0007\u001e\u0014W\u0089\u0092\u000fz\u0097\fßP\u001eú\u0099\u0088qÔª,\u009aÛ\u0085\u0015ÇÀã\u009bfKm\nNjn1dD\\J\u0011À\u0005âqô×`\u0095t¾\u009eÛB\u0015\u0010ã3\u0003\u008dG¶$ÓÈ¯\u0016í\u0085¼{\u0081\\ÊÀ\u009f\u0010\u0017\u001d\b;Ü\u0084\u0017Ô\\ù¢w\u0005/\u0092K+\u0019Ö·\u001fôÎÉ ¥ûuBþÖB|z.\u0010HØ\rFïS#\u0002~Í¦PWä×\u0019viÄæ1B\u009eæÖc\u009fÇTÑ¯ë\u0017\u001c\u0013Ìð\u0003\u001dn\u0080\u0094»D\u009aJu\u001dfi~¯¼@\u0090\u009f?\u001fXÚF6ãI(A\u0084QFèª \u001e\u0080\u0081\u0081àb'ÿ=q-áØÿ\u001bûèëê\nü\u0080|§ÚÎò\u0019zb2»<\u0096Ýôt\u0017\u0011er¥ØÃÓ¼=\u0018êê©1\u0018$ËK³\u009b\r \t\u008aßXØ\u001d\u000eB\u0093\u0091§OÿÚZù \u0093Z%êü\r1n\u0002\u000f*/dZMÒ\b¯,åJ±²¸N\u009ex\rý\u0088\u0015\u009aál%d\u000b\u001eÖ[5+0æV:\u001aªÅ4¯k\\Åps\u0007\u0090\u0080±á\u0080õWcú©\u0011p©tåJÌ°P¹\u008c¢^W|\u001ddV×î\u0013°ö\u000e±cîÊx;\u000b\u00820\u0010ºe²¤³#¶\u0007w<\u001c\b*iü\u0002\u00160ß*Yµ\u0016¨%ãÂa\u008a¡p\u0099tÿ\u0005mor7»\u0001ffEÁ§ã\u0012\u0089\n\"\u0014\u0096¼á\u0087\u0018\u009fdú÷%\u009cfrgl%M\u0018\u0093>%.\u0081óÔùXÂrÚÖ¦q¶o³\u009a\u001a¦g³3k@èØ¨\u008a$\u008cø\u0091 rYbÃ©&á¬½,-Mèúp\u0098¹\u0080B\u0007Î\u009d\r<»¯«èR\u0016åÆ\u009b4ðµå!.*\u0013âÙJ@\u001al73Ö±Ó\u0016\u0011\u00169¯\t<¹Æ\bL\bÆ\u001e1ù\u0014<IÏ\u0002Ñ÷\u000e:\u0084(\u0010\rF\u0010¯©\u0081\u009dQµ¾\u0006jà?\u0095I\u0081<\u008eÌÇ}\u0099¾½Âèal\u0081u\u0087\n½\u0089æ²\u0080à\u0089Ë;ò¡Yë9\u0013ÜPi\u000b\u0012T\u0089ç¥½~\u000fºo¶b\u008d=}ð£\u0097\u009d°ÊINÌ±jËiîßwsmÕÁ!w§r\u0093\u0004\u0001\u001aG\u0017É\u009c8+åïÒ\u001b4\u001cÅÓ\u00027¬Í¯^Ìí\u001e\u0086ß5Dns5ÆÑößÚéü&t`ªH)yÆÇ0ÕH\u008a"
               .getBytes("ISO-8859-1");

            int var56;
            do {
               lIII[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1671873175;
               var22 += 1;
               var56 = var10001 + 4;
               var10001 += 4;
            } while (var56 < var10002.length);

            String[] var5 = new String[IllII(-447652224, var18 ^ -554616129)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IllIl(4404, 1973585483, (short)27778, (byte)-113, -129836434, (short)26413, 1116604942)).length();
            int var1 = IllII(-447652221, var18 ^ 1740575762);
            int var20 = -1;

            label103:
            while (true) {
               var22 = IllII(-447652222, var18 ^ 1168795610);
               String var28 = var2.substring(++var20, var20 + var1);
               byte var40 = -1;

               while (true) {
                  label98: {
                     char[] var58 = var28.toCharArray();
                     int var70 = var58.length;
                     int var6 = 0;
                     var56 = var22;
                     var45 = var58;
                     var10001 = var70;
                     char[] var82;
                     int var89;
                     if (var70 <= 1) {
                        var82 = var58;
                        var70 = var22;
                        var89 = var6;
                     } else {
                        var56 = var22;
                        var10001 = var70;
                        if (var70 <= var6) {
                           break label98;
                        }

                        var82 = var58;
                        var70 = var22;
                        var89 = var6;
                     }

                     while (true) {
                        var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % IllII(-447652162, var18 ^ -1477770979)) {
                           case 0 -> IllII(-447652167, var18 ^ 1615653756);
                           case 1 -> IllII(-447652168, var18 ^ 2019976230);
                           case 2 -> IllII(-447652165, var18 ^ 2031539492);
                           case 3 -> IllII(-447652166, var18 ^ 1869294551);
                           case 4 -> IllII(-447652171, var18 ^ 1293095662);
                           case 5 -> IllII(-447652172, var18 ^ -1599218463);
                           default -> IllII(-447652169, var18 ^ -177028483);
                        });
                        var6++;
                        if (var56 == 0) {
                           var89 = var56;
                           var82 = var45;
                           var70 = var56;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var82 = var45;
                           var70 = var56;
                           var89 = var6;
                        }
                     }
                  }

                  String var63 = new String(var45).intern();
                  switch (var40) {
                     case 0:
                        var5[var3++] = var63;
                        if ((var20 += var1) >= var4) {
                           I = var5;
                           Ill = new String[IllII(-447652161, var18 ^ 1798759905)];
                           lI = new String[IllII(-447652170, var18 ^ 927625257)];
                           Illl();
                           IlIl = lIl();
                           String[] var25 = new String[IllII(-447652175, var18 ^ -255360250)];
                           var25[0] = IlIIllIII.lI(lI[IllII(-447652176, var18 ^ -816007122)]);
                           var25[1] = IlIIllIII.lI(lI[IllII(-447652173, var18 ^ 1322228557)]);
                           var25[2] = IlIIllIII.lI(lI[IllII(-447652174, var18 ^ 1305747060)]);
                           var25[3] = IlIIllIII.lI(lI[IllII(-447652179, var18 ^ 214133972)]);
                           var25[4] = IlIIllIII.lI(lI[IllII(-447652180, var18 ^ -1280134220)]);
                           var25[5] = IlIIllIII.lI(lI[IllII(-447652177, var18 ^ -265333288)]);
                           var25[IllII(-447652178, var18 ^ -858573656)] = IlIIllIII.lI(lI[IllII(-447652183, var18 ^ -239445221)]);
                           var25[IllII(-447652184, var18 ^ 1252553540)] = IlIIllIII.lI(lI[IllII(-447652181, var18 ^ -1704738384)]);
                           var25[IllII(-447652182, var18 ^ 557046022)] = IlIIllIII.lI(lI[IllII(-447652187, var18 ^ 634598856)]);
                           var25[IllII(-447652188, var18 ^ -869999199)] = IlIIllIII.lI(lI[IllII(-447652185, var18 ^ 518828120)]);
                           var25[IllII(-447652186, var18 ^ 1277635909)] = IlIIllIII.lI(lI[IllII(-447652191, var18 ^ -423140702)]);
                           var25[IllII(-447652192, var18 ^ 940839248)] = IlIIllIII.lI(lI[IllII(-447652189, var18 ^ 462535479)]);
                           var25[IllII(-447652190, var18 ^ -1372741259)] = IlIIllIII.lI(lI[IllII(-447652131, var18 ^ -1533283480)]);
                           var25[IllII(-447652132, var18 ^ -702004893)] = IlIIllIII.lI(lI[IllII(-447652129, var18 ^ 1883280651)]);
                           var25[IllII(-447652130, var18 ^ -1194923447)] = IlIIllIII.lI(lI[IllII(-447652135, var18 ^ -1800077129)]);
                           var25[IllII(-447652136, var18 ^ 1162221494)] = IlIIllIII.lI(lI[IllII(-447652133, var18 ^ 1936555728)]);
                           var25[IllII(-447652134, var18 ^ -570155471)] = IlIIllIII.lI(lI[IllII(-447652139, var18 ^ 1876692380)]);
                           var25[IllII(-447652140, var18 ^ 892641766)] = IlIIllIII.lI(lI[IllII(-447652137, var18 ^ -1215617925)]);
                           var25[IllII(-447652138, var18 ^ -1414320392)] = IlIIllIII.lI(lI[IllII(-447652143, var18 ^ 87718041)]);
                           var25[IllII(-447652144, var18 ^ 1478693918)] = IlIIllIII.lI(lI[IllII(-447652141, var18 ^ 1099930146)]);
                           IIlI = Set.of(var25);
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var63;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label103;
                        }

                        var4 = (var2 = IllIl((short)-21499, 1961927928, (short)5533, 107, -423844548, 27178, 1116604943)).length();
                        var1 = IllII(-447652163, var18 ^ 1349843112);
                        var20 = -1;
                  }

                  var22 = IllII(-447652164, var18 ^ -1820092173);
                  var28 = var2.substring(++var20, var20 + var1);
                  var40 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 133;
                  case 1 -> 241;
                  case 2 -> 35;
                  case 3 -> 181;
                  case 4 -> 159;
                  case 5 -> 86;
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
   public void IIlIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 003: astore 1
      // 004: aload 0
      // 005: aload 1
      // 006: invokevirtual k74/x/lllIlIII.lIII (Lnet/minecraft/class_310;)Z
      // 009: ifne 011
      // 00c: return
      // 00d: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 010: athrow
      // 011: aload 1
      // 012: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 015: instanceof net/minecraft/class_490
      // 018: istore 2
      // 019: aload 0
      // 01a: getfield k74/x/lllIlIII.Illl Lk74/x/lllIIlII;
      // 01d: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 020: checkcast java/lang/Boolean
      // 023: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 026: ifeq 039
      // 029: iload 2
      // 02a: ifne 039
      // 02d: goto 034
      // 030: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 033: athrow
      // 034: return
      // 035: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 038: athrow
      // 039: aload 0
      // 03a: getfield k74/x/lllIlIII.Illl Lk74/x/lllIIlII;
      // 03d: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 040: checkcast java/lang/Boolean
      // 043: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 046: ifne 067
      // 049: aload 1
      // 04a: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 04d: ifnull 067
      // 050: goto 057
      // 053: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 056: athrow
      // 057: iload 2
      // 058: ifne 067
      // 05b: goto 062
      // 05e: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 061: athrow
      // 062: return
      // 063: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 066: athrow
      // 067: iload 2
      // 068: ifne 07f
      // 06b: aload 0
      // 06c: aload 1
      // 06d: invokevirtual k74/x/lllIlIII.llI (Lnet/minecraft/class_310;)Z
      // 070: ifne 07f
      // 073: goto 07a
      // 076: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 079: athrow
      // 07a: return
      // 07b: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 07e: athrow
      // 07f: aload 0
      // 080: aload 1
      // 081: invokevirtual k74/x/lllIlIII.lII (Lnet/minecraft/class_310;)Z
      // 084: ifeq 08c
      // 087: return
      // 088: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 08b: athrow
      // 08c: aload 1
      // 08d: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 090: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 093: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 096: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 099: ifne 0a1
      // 09c: return
      // 09d: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a0: athrow
      // 0a1: invokestatic java/lang/System.currentTimeMillis ()J
      // 0a4: lstore 3
      // 0a5: lload 3
      // 0a6: aload 0
      // 0a7: getfield k74/x/lllIlIII.lIl J
      // 0aa: lsub
      // 0ab: aload 0
      // 0ac: getfield k74/x/lllIlIII.III J
      // 0af: lcmp
      // 0b0: ifge 0b8
      // 0b3: return
      // 0b4: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b7: athrow
      // 0b8: aload 0
      // 0b9: aload 1
      // 0ba: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 0bd: invokevirtual k74/x/lllIlIII.IIl (Lnet/minecraft/class_746;)Lk74/x/lllllIII;
      // 0c0: astore 5
      // 0c2: aload 5
      // 0c4: ifnonnull 0cc
      // 0c7: return
      // 0c8: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0cb: athrow
      // 0cc: getstatic k74/x/lllIlIII.IlIl [I
      // 0cf: astore 6
      // 0d1: aload 6
      // 0d3: arraylength
      // 0d4: istore 7
      // 0d6: bipush 0
      // 0d7: istore 8
      // 0d9: iload 8
      // 0db: iload 7
      // 0dd: if_icmpge 135
      // 0e0: aload 6
      // 0e2: iload 8
      // 0e4: iaload
      // 0e5: istore 9
      // 0e7: aload 5
      // 0e9: iload 9
      // 0eb: invokevirtual k74/x/lllllIII.l (I)Z
      // 0ee: ifne 0f8
      // 0f1: goto 12f
      // 0f4: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f7: athrow
      // 0f8: aload 0
      // 0f9: aload 1
      // 0fa: iload 2
      // 0fb: invokevirtual k74/x/lllIlIII.lI (Lnet/minecraft/class_310;Z)Z
      // 0fe: ifne 106
      // 101: return
      // 102: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 105: athrow
      // 106: aload 0
      // 107: aload 1
      // 108: aload 1
      // 109: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 10c: iload 9
      // 10e: invokevirtual k74/x/lllIlIII.IIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_746;I)Z
      // 111: ifeq 12e
      // 114: aload 0
      // 115: invokestatic java/lang/System.currentTimeMillis ()J
      // 118: putfield k74/x/lllIlIII.lIl J
      // 11b: aload 0
      // 11c: aload 0
      // 11d: invokevirtual k74/x/lllIlIII.IIII ()J
      // 120: putfield k74/x/lllIlIII.III J
      // 123: aload 1
      // 124: invokestatic k74/x/lIIIllII.lII (Lnet/minecraft/class_310;)V
      // 127: goto 12e
      // 12a: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 12d: athrow
      // 12e: return
      // 12f: iinc 8 1
      // 132: goto 0d9
      // 135: return
   }

   private double II(String var1) {
      int var2 = -1486935229;

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652847, var2 ^ -744302178)]))) {
            return 700.0;
         }
      } catch (MatchException var18) {
         throw Ill(var18);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652848, var2 ^ -282664277)]))) {
            return 600.0;
         }
      } catch (MatchException var10) {
         throw Ill(var10);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652845, var2 ^ -638994671)]))) {
            return 500.0;
         }
      } catch (MatchException var17) {
         throw Ill(var17);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652846, var2 ^ 1237959164)]))) {
            return 440.0;
         }
      } catch (MatchException var9) {
         throw Ill(var9);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652851, var2 ^ 48931616)]))) {
            return 420.0;
         }
      } catch (MatchException var16) {
         throw Ill(var16);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652852, var2 ^ -1492836982)]))) {
            return 310.0;
         }
      } catch (MatchException var8) {
         throw Ill(var8);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652849, var2 ^ -1730619461)]))) {
            return 180.0;
         }
      } catch (MatchException var15) {
         throw Ill(var15);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652850, var2 ^ 534037440)]))) {
            return 700.0;
         }
      } catch (MatchException var7) {
         throw Ill(var7);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652855, var2 ^ -2000046410)]))) {
            return 600.0;
         }
      } catch (MatchException var14) {
         throw Ill(var14);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652856, var2 ^ 1986185244)]))) {
            return 500.0;
         }
      } catch (MatchException var6) {
         throw Ill(var6);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652853, var2 ^ -2095244010)]))) {
            return 440.0;
         }
      } catch (MatchException var13) {
         throw Ill(var13);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652854, var2 ^ 1782515181)]))) {
            return 420.0;
         }
      } catch (MatchException var5) {
         throw Ill(var5);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652859, var2 ^ -1100225047)]))) {
            return 350.0;
         }
      } catch (MatchException var12) {
         throw Ill(var12);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652860, var2 ^ -1142216462)]))) {
            return 310.0;
         }
      } catch (MatchException var4) {
         throw Ill(var4);
      }

      try {
         if (var1.startsWith(IlIIllIII.lI(lI[IllII(-447652857, var2 ^ 1215359051)]))) {
            return 220.0;
         }
      } catch (MatchException var11) {
         throw Ill(var11);
      }

      try {
         return var1.startsWith(IlIIllIII.lI(lI[IllII(-447652858, var2 ^ -984630753)])) ? 180.0 : 300.0;
      } catch (MatchException var3) {
         throw Ill(var3);
      }
   }

   private int Il(int param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w 1052855725
      // 03: istore 2
      // 04: iload 1
      // 05: bipush 5
      // 06: if_icmplt 2f
      // 09: iload 1
      // 0a: ldc_w -447652863
      // 0d: iload 2
      // 0e: ldc_w -901433978
      // 11: ixor
      // 12: invokestatic k74/x/lllIlIII.IllII (II)I
      // 15: if_icmpgt 2f
      // 18: goto 1f
      // 1b: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e: athrow
      // 1f: ldc_w -447652864
      // 22: iload 2
      // 23: ldc_w -2132097036
      // 26: ixor
      // 27: invokestatic k74/x/lllIlIII.IllII (II)I
      // 2a: ireturn
      // 2b: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2e: athrow
      // 2f: iload 1
      // 30: ldc_w -447652861
      // 33: iload 2
      // 34: ldc_w -601872506
      // 37: ixor
      // 38: invokestatic k74/x/lllIlIII.IllII (II)I
      // 3b: if_icmplt 72
      // 3e: iload 1
      // 3f: ldc_w -447652862
      // 42: iload 2
      // 43: ldc_w 1403014630
      // 46: ixor
      // 47: invokestatic k74/x/lllIlIII.IllII (II)I
      // 4a: if_icmpge 72
      // 4d: goto 54
      // 50: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 53: athrow
      // 54: ldc_w -447652803
      // 57: iload 2
      // 58: ldc_w 904295799
      // 5b: ixor
      // 5c: invokestatic k74/x/lllIlIII.IllII (II)I
      // 5f: iload 1
      // 60: ldc_w -447652804
      // 63: iload 2
      // 64: ldc_w -955002573
      // 67: ixor
      // 68: invokestatic k74/x/lllIlIII.IllII (II)I
      // 6b: isub
      // 6c: isub
      // 6d: ireturn
      // 6e: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 71: athrow
      // 72: iload 1
      // 73: ldc_w -447652801
      // 76: iload 2
      // 77: ldc_w 779742793
      // 7a: ixor
      // 7b: invokestatic k74/x/lllIlIII.IllII (II)I
      // 7e: if_icmpne 91
      // 81: ldc_w -447652802
      // 84: iload 2
      // 85: ldc_w -534619650
      // 88: ixor
      // 89: invokestatic k74/x/lllIlIII.IllII (II)I
      // 8c: ireturn
      // 8d: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 90: athrow
      // 91: ldc_w -447652807
      // 94: iload 2
      // 95: ldc_w 372892544
      // 98: ixor
      // 99: invokestatic k74/x/lllIlIII.IllII (II)I
      // 9c: iload 1
      // 9d: isub
      // 9e: ireturn
   }

   private boolean lI(class_310 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 2
      // 01: ifne 19
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual k74/x/lllIlIII.llII (Lnet/minecraft/class_310;)Z
      // 09: ifne 19
      // 0c: goto 13
      // 0f: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 12: athrow
      // 13: bipush 0
      // 14: ireturn
      // 15: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 18: athrow
      // 19: aload 0
      // 1a: aload 1
      // 1b: invokevirtual k74/x/lllIlIII.lIlI (Lnet/minecraft/class_310;)Z
      // 1e: ifne 27
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: aload 1
      // 28: invokestatic k74/x/lIIIllII.lII (Lnet/minecraft/class_310;)V
      // 2b: bipush 1
      // 2c: ireturn
   }

   private static String ll(char[] var0, long var1, int var3) {
      int var4 = IllII(-447652808, -1152235951 ^ -1446863650) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IllII(-447652805, -1152235951 ^ 1723251130);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private boolean III(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/lllIlIII.Il Lk74/x/lllIIlII;
      // 04: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 07: checkcast java/lang/Boolean
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: ifne 29
      // 10: aload 1
      // 11: ifnull 29
      // 14: goto 1b
      // 17: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a: athrow
      // 1b: aload 1
      // 1c: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 1f: ifeq 2f
      // 22: goto 29
      // 25: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: bipush 0
      // 2a: ireturn
      // 2b: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2e: athrow
      // 2f: aload 1
      // 30: invokevirtual net/minecraft/class_1799.method_57380 ()Lnet/minecraft/class_9326;
      // 33: getstatic net/minecraft/class_9334.field_49637 Lnet/minecraft/class_9331;
      // 36: invokevirtual net/minecraft/class_9326.method_57845 (Lnet/minecraft/class_9331;)Ljava/util/Optional;
      // 39: ifnonnull 50
      // 3c: aload 1
      // 3d: invokevirtual net/minecraft/class_1799.method_57380 ()Lnet/minecraft/class_9326;
      // 40: getstatic net/minecraft/class_9334.field_54199 Lnet/minecraft/class_9331;
      // 43: invokevirtual net/minecraft/class_9326.method_57845 (Lnet/minecraft/class_9331;)Ljava/util/Optional;
      // 46: ifnull 58
      // 49: goto 50
      // 4c: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 59
      // 54: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 57: athrow
      // 58: bipush 0
      // 59: ireturn
   }

   private lllllIII IIl(class_746 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: new java/util/HashMap
      // 003: dup
      // 004: invokespecial java/util/HashMap.<init> ()V
      // 007: astore 2
      // 008: getstatic k74/x/lllIlIII.IlIl [I
      // 00b: astore 3
      // 00c: aload 3
      // 00d: arraylength
      // 00e: istore 4
      // 010: bipush 0
      // 011: istore 5
      // 013: iload 5
      // 015: iload 4
      // 017: if_icmpge 0ae
      // 01a: aload 3
      // 01b: iload 5
      // 01d: iaload
      // 01e: istore 6
      // 020: aload 0
      // 021: aload 1
      // 022: iload 6
      // 024: invokevirtual k74/x/lllIlIII.IIlI (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 027: astore 7
      // 029: aload 7
      // 02b: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 02e: ifeq 038
      // 031: goto 0a8
      // 034: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 037: athrow
      // 038: aload 0
      // 039: aload 7
      // 03b: invokevirtual k74/x/lllIlIII.III (Lnet/minecraft/class_1799;)Z
      // 03e: ifeq 048
      // 041: goto 0a8
      // 044: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 047: athrow
      // 048: aload 0
      // 049: aload 7
      // 04b: invokevirtual k74/x/lllIlIII.IllI (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 04e: astore 8
      // 050: aload 8
      // 052: ifnonnull 05c
      // 055: goto 0a8
      // 058: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 05b: athrow
      // 05c: new k74/x/IllIIlll
      // 05f: dup
      // 060: iload 6
      // 062: aload 0
      // 063: aload 7
      // 065: invokevirtual k74/x/lllIlIII.IIIIl (Lnet/minecraft/class_1799;)D
      // 068: aload 0
      // 069: iload 6
      // 06b: invokevirtual k74/x/lllIlIII.Il (I)I
      // 06e: invokespecial k74/x/IllIIlll.<init> (IDI)V
      // 071: astore 9
      // 073: aload 2
      // 074: aload 8
      // 076: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 07b: checkcast k74/x/IllIIlll
      // 07e: astore 10
      // 080: aload 10
      // 082: ifnull 096
      // 085: aload 9
      // 087: aload 10
      // 089: invokevirtual k74/x/IllIIlll.II (Lk74/x/IllIIlll;)Z
      // 08c: ifeq 0a8
      // 08f: goto 096
      // 092: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 095: athrow
      // 096: aload 2
      // 097: aload 8
      // 099: aload 9
      // 09b: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 0a0: pop
      // 0a1: goto 0a8
      // 0a4: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a7: athrow
      // 0a8: iinc 5 1
      // 0ab: goto 013
      // 0ae: new java/util/HashMap
      // 0b1: dup
      // 0b2: invokespecial java/util/HashMap.<init> ()V
      // 0b5: astore 3
      // 0b6: getstatic k74/x/lllIlIII.IlIl [I
      // 0b9: astore 4
      // 0bb: aload 4
      // 0bd: arraylength
      // 0be: istore 5
      // 0c0: bipush 0
      // 0c1: istore 6
      // 0c3: iload 6
      // 0c5: iload 5
      // 0c7: if_icmpge 192
      // 0ca: aload 4
      // 0cc: iload 6
      // 0ce: iaload
      // 0cf: istore 7
      // 0d1: aload 0
      // 0d2: aload 1
      // 0d3: iload 7
      // 0d5: invokevirtual k74/x/lllIlIII.IIlI (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 0d8: astore 8
      // 0da: aload 8
      // 0dc: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 0df: ifne 18c
      // 0e2: aload 0
      // 0e3: aload 8
      // 0e5: invokevirtual k74/x/lllIlIII.III (Lnet/minecraft/class_1799;)Z
      // 0e8: ifne 18c
      // 0eb: goto 0f2
      // 0ee: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f1: athrow
      // 0f2: aload 8
      // 0f4: invokevirtual net/minecraft/class_1799.method_7946 ()Z
      // 0f7: ifne 18c
      // 0fa: goto 101
      // 0fd: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 100: athrow
      // 101: aload 0
      // 102: aload 8
      // 104: invokevirtual k74/x/lllIlIII.IllI (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 107: ifnonnull 18c
      // 10a: goto 111
      // 10d: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 110: athrow
      // 111: aload 0
      // 112: aload 8
      // 114: invokevirtual k74/x/lllIlIII.IIIII (Lnet/minecraft/class_1799;)Z
      // 117: ifne 18c
      // 11a: goto 121
      // 11d: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 120: athrow
      // 121: aload 0
      // 122: aload 8
      // 124: invokevirtual k74/x/lllIlIII.lIll (Lnet/minecraft/class_1799;)Z
      // 127: ifeq 138
      // 12a: goto 131
      // 12d: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 130: athrow
      // 131: goto 18c
      // 134: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 137: athrow
      // 138: aload 0
      // 139: aload 8
      // 13b: invokevirtual k74/x/lllIlIII.l (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 13e: astore 9
      // 140: new k74/x/IllIIlll
      // 143: dup
      // 144: iload 7
      // 146: aload 0
      // 147: aload 8
      // 149: invokevirtual k74/x/lllIlIII.IIIIl (Lnet/minecraft/class_1799;)D
      // 14c: aload 0
      // 14d: iload 7
      // 14f: invokevirtual k74/x/lllIlIII.Il (I)I
      // 152: invokespecial k74/x/IllIIlll.<init> (IDI)V
      // 155: astore 10
      // 157: aload 3
      // 158: aload 9
      // 15a: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 15f: checkcast k74/x/IllIIlll
      // 162: astore 11
      // 164: aload 11
      // 166: ifnull 17a
      // 169: aload 10
      // 16b: aload 11
      // 16d: invokevirtual k74/x/IllIIlll.II (Lk74/x/IllIIlll;)Z
      // 170: ifeq 18c
      // 173: goto 17a
      // 176: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 179: athrow
      // 17a: aload 3
      // 17b: aload 9
      // 17d: aload 10
      // 17f: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
      // 184: pop
      // 185: goto 18c
      // 188: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 18b: athrow
      // 18c: iinc 6 1
      // 18f: goto 0c3
      // 192: new k74/x/lllllIII
      // 195: dup
      // 196: invokespecial k74/x/lllllIII.<init> ()V
      // 199: astore 4
      // 19b: getstatic k74/x/lllIlIII.IlIl [I
      // 19e: astore 5
      // 1a0: aload 5
      // 1a2: arraylength
      // 1a3: istore 6
      // 1a5: bipush 0
      // 1a6: istore 7
      // 1a8: iload 7
      // 1aa: iload 6
      // 1ac: if_icmpge 2ac
      // 1af: aload 5
      // 1b1: iload 7
      // 1b3: iaload
      // 1b4: istore 8
      // 1b6: aload 0
      // 1b7: aload 1
      // 1b8: iload 8
      // 1ba: invokevirtual k74/x/lllIlIII.IIlI (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 1bd: astore 9
      // 1bf: aload 9
      // 1c1: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 1c4: ifeq 1ce
      // 1c7: goto 2a6
      // 1ca: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1cd: athrow
      // 1ce: iload 8
      // 1d0: invokestatic k74/x/lllIlIII.IIlll (I)Z
      // 1d3: ifeq 1dd
      // 1d6: goto 2a6
      // 1d9: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1dc: athrow
      // 1dd: aload 0
      // 1de: aload 9
      // 1e0: invokevirtual k74/x/lllIlIII.III (Lnet/minecraft/class_1799;)Z
      // 1e3: ifeq 1ed
      // 1e6: goto 2a6
      // 1e9: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1ec: athrow
      // 1ed: aload 0
      // 1ee: getfield k74/x/lllIlIII.IIl Lk74/x/lllIIlII;
      // 1f1: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 1f4: checkcast java/lang/Boolean
      // 1f7: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 1fa: ifeq 21b
      // 1fd: aload 0
      // 1fe: aload 9
      // 200: invokevirtual k74/x/lllIlIII.lIll (Lnet/minecraft/class_1799;)Z
      // 203: ifeq 21b
      // 206: goto 20d
      // 209: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 20c: athrow
      // 20d: aload 4
      // 20f: iload 8
      // 211: invokevirtual k74/x/lllllIII.I (I)V
      // 214: goto 2a6
      // 217: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21a: athrow
      // 21b: aload 0
      // 21c: aload 9
      // 21e: invokevirtual k74/x/lllIlIII.IllI (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 221: astore 10
      // 223: aload 10
      // 225: ifnull 259
      // 228: aload 2
      // 229: aload 10
      // 22b: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 230: checkcast k74/x/IllIIlll
      // 233: astore 11
      // 235: aload 11
      // 237: ifnull 2a6
      // 23a: aload 11
      // 23c: getfield k74/x/IllIIlll.I I
      // 23f: iload 8
      // 241: if_icmpeq 2a6
      // 244: goto 24b
      // 247: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 24a: athrow
      // 24b: aload 4
      // 24d: iload 8
      // 24f: invokevirtual k74/x/lllllIII.I (I)V
      // 252: goto 2a6
      // 255: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 258: athrow
      // 259: aload 9
      // 25b: invokevirtual net/minecraft/class_1799.method_7946 ()Z
      // 25e: ifne 2a6
      // 261: aload 0
      // 262: aload 9
      // 264: invokevirtual k74/x/lllIlIII.IIIII (Lnet/minecraft/class_1799;)Z
      // 267: ifne 2a6
      // 26a: goto 271
      // 26d: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 270: athrow
      // 271: aload 3
      // 272: aload 0
      // 273: aload 9
      // 275: invokevirtual k74/x/lllIlIII.l (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 278: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 27d: checkcast k74/x/IllIIlll
      // 280: astore 11
      // 282: aload 11
      // 284: ifnull 2a6
      // 287: aload 11
      // 289: getfield k74/x/IllIIlll.I I
      // 28c: iload 8
      // 28e: if_icmpeq 2a6
      // 291: goto 298
      // 294: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 297: athrow
      // 298: aload 4
      // 29a: iload 8
      // 29c: invokevirtual k74/x/lllllIII.I (I)V
      // 29f: goto 2a6
      // 2a2: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2a5: athrow
      // 2a6: iinc 7 1
      // 2a9: goto 1a8
      // 2ac: aload 4
      // 2ae: invokevirtual k74/x/lllllIII.II ()Z
      // 2b1: ifeq 2bd
      // 2b4: aload 4
      // 2b6: goto 2be
      // 2b9: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2bc: athrow
      // 2bd: aconst_null
      // 2be: areturn
   }

   private static MatchException Ill(MatchException var0) {
      return var0;
   }

   private boolean lII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnull 16
      // 08: aload 2
      // 09: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 0c: ifnonnull 1c
      // 0f: goto 16
      // 12: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1b: athrow
      // 1c: aload 2
      // 1d: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 20: invokevirtual k74/x/lIIIlIlI.llIlll ()Lk74/x/lIIlll;
      // 23: astore 3
      // 24: aload 3
      // 25: ifnull 3f
      // 28: aload 3
      // 29: aload 1
      // 2a: invokevirtual k74/x/lIIlll.IlIl (Lnet/minecraft/class_310;)Z
      // 2d: ifeq 3f
      // 30: goto 37
      // 33: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 36: athrow
      // 37: bipush 1
      // 38: goto 40
      // 3b: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3e: athrow
      // 3f: bipush 0
      // 40: ireturn
   }

   @Override
   public void llIl() {
      this.lIl = 0L;
      this.III = 0L;
   }

   private static int[] lIl() {
      int var4 = -1109232721;
      int var0 = IllII(-447652806, var4 ^ -203593570);
      int[] var1 = new int[var0];
      int var2 = 0;
      var1[var2++] = 5;
      var1[var2++] = IllII(-447652811, var4 ^ 1561824897);
      var1[var2++] = IllII(-447652812, var4 ^ 532465495);
      var1[var2++] = IllII(-447652809, var4 ^ -697990566);
      int var3 = IllII(-447652810, var4 ^ 643071495);

      try {
         while (var3 < IllII(-447652815, var4 ^ -1619955153)) {
            var1[var2++] = var3++;
         }
      } catch (MatchException var6) {
         throw Ill(var6);
      }

      var3 = 0;

      try {
         while (var3 < IllII(-447652816, var4 ^ -1383530714)) {
            var1[var2++] = IllII(-447652813, var4 ^ -1753099764) + var3;
            var3++;
         }
      } catch (MatchException var5) {
         throw Ill(var5);
      }

      var1[var2] = IllII(-447652814, var4 ^ -657924995);
      return var1;
   }

   private static String IllIl(short var0, int var1, short var2, byte var3, int var4, short var5, int var6) {
      int var11 = var6 ^ 1116604942;
      char[] var10 = lIIl[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])lIlI[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         lIlI[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 12355;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ '쟂' ^ switch (var9 % 9) {
            default -> 248;
            case 1 -> 115;
            case 2 -> 114;
            case 3 -> 231;
            case 4 -> 146;
            case 5 -> 149;
            case 6 -> 203;
            case 7 -> 28;
            case 8 -> 243;
         } ^ var9 ^ var2 ^ var1 ^ var3 ^ var5 ^ var6 ^ var0 ^ var4 ^ var8);
      }

      return new String(var10).intern();
   }

   private boolean llI(class_310 var1) {
      try {
         if (var1.field_1755 == null) {
            return true;
         }
      } catch (MatchException var2) {
         throw Ill(var2);
      }

      return false;
   }

   private double lll(class_1799 var1) {
      class_9304 var2 = (class_9304)var1.method_58695(class_9334.field_49633, class_9304.field_49385);
      double var3 = 0.0;

      for (class_6880 var6 : var2.method_57534()) {
         String var7 = var6.method_40230().map(lllIlIII::IIlII).orElse(lI[IllII(-447652819, 1361703556 ^ -510464350)]);
         int var8 = var2.method_57536(var6);
         var3 += var8 * this.IIIlI(var7);
      }

      return var3;
   }

   private long IIII() {
      double var1 = this.lII.IIlI();
      double var3 = this.lII.IlI();

      try {
         if (var1 == var3) {
            return Math.round(var1);
         }
      } catch (MatchException var5) {
         throw Ill(var5);
      }

      return Math.round(ThreadLocalRandom.current().nextDouble(var1, var3));
   }

   private boolean IIIl(class_310 param1, class_746 param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 3
      // 01: invokestatic k74/x/lllIlIII.IIlll (I)Z
      // 04: ifne 27
      // 07: iload 3
      // 08: iflt 27
      // 0b: goto 12
      // 0e: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: iload 3
      // 13: aload 2
      // 14: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 17: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 1a: invokevirtual net/minecraft/class_2371.size ()I
      // 1d: if_icmplt 2d
      // 20: goto 27
      // 23: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: bipush 0
      // 28: ireturn
      // 29: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2c: athrow
      // 2d: aload 2
      // 2e: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 31: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 34: iload 3
      // 35: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 38: checkcast net/minecraft/class_1735
      // 3b: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 3e: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 41: ifeq 4a
      // 44: bipush 0
      // 45: ireturn
      // 46: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 49: athrow
      // 4a: aload 1
      // 4b: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 4e: aload 2
      // 4f: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 52: getfield net/minecraft/class_1723.field_7763 I
      // 55: iload 3
      // 56: bipush 1
      // 57: getstatic net/minecraft/class_1713.field_7795 Lnet/minecraft/class_1713;
      // 5a: aload 2
      // 5b: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 5e: aload 2
      // 5f: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 62: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 65: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 68: ireturn
   }

   private class_1799 IIlI(class_746 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 24
      // 04: iload 2
      // 05: iflt 24
      // 08: goto 0f
      // 0b: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: iload 2
      // 10: aload 1
      // 11: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 14: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 17: invokevirtual net/minecraft/class_2371.size ()I
      // 1a: if_icmplt 2c
      // 1d: goto 24
      // 20: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 23: athrow
      // 24: getstatic net/minecraft/class_1799.field_8037 Lnet/minecraft/class_1799;
      // 27: areturn
      // 28: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2b: athrow
      // 2c: aload 1
      // 2d: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 30: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 33: iload 2
      // 34: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 37: checkcast net/minecraft/class_1735
      // 3a: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 3d: areturn
   }

   private double IIll(class_1799 var1) {
      double var2 = 0.0;
      class_9285 var4 = (class_9285)var1.method_58695(class_9334.field_49636, class_9285.field_49326);

      for (class_9287 var6 : var4.comp_2393()) {
         if (var6.comp_2395().equals(class_5134.field_23724)) {
            var2 += var6.comp_2396().comp_2449() * 80.0;
         } else if (var6.comp_2395().equals(class_5134.field_23725)) {
            var2 += var6.comp_2396().comp_2449() * 45.0;
         } else if (var6.comp_2395().equals(class_5134.field_23721)) {
            var2 += var6.comp_2396().comp_2449() * 65.0;
         } else if (var6.comp_2395().equals(class_5134.field_23723)) {
            var2 += var6.comp_2396().comp_2449() * 10.0;
         }
      }

      return var2;
   }

   private IllIIlll IlII(class_746 param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 3
      // 02: getstatic k74/x/lllIlIII.IlIl [I
      // 05: astore 4
      // 07: aload 4
      // 09: arraylength
      // 0a: istore 5
      // 0c: bipush 0
      // 0d: istore 6
      // 0f: iload 6
      // 11: iload 5
      // 13: if_icmpge cc
      // 16: aload 4
      // 18: iload 6
      // 1a: iaload
      // 1b: istore 7
      // 1d: aload 0
      // 1e: aload 1
      // 1f: iload 7
      // 21: invokevirtual k74/x/lllIlIII.IIlI (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 24: astore 8
      // 26: aload 8
      // 28: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 2b: ifne c6
      // 2e: aload 0
      // 2f: aload 8
      // 31: invokevirtual k74/x/lllIlIII.III (Lnet/minecraft/class_1799;)Z
      // 34: ifne c6
      // 37: goto 3e
      // 3a: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3d: athrow
      // 3e: aload 8
      // 40: invokevirtual net/minecraft/class_1799.method_7946 ()Z
      // 43: ifne c6
      // 46: goto 4d
      // 49: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4c: athrow
      // 4d: aload 0
      // 4e: aload 8
      // 50: invokevirtual k74/x/lllIlIII.IllI (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 53: ifnonnull c6
      // 56: goto 5d
      // 59: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5c: athrow
      // 5d: aload 0
      // 5e: aload 8
      // 60: invokevirtual k74/x/lllIlIII.IIIII (Lnet/minecraft/class_1799;)Z
      // 63: ifne c6
      // 66: goto 6d
      // 69: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6c: athrow
      // 6d: aload 0
      // 6e: aload 8
      // 70: invokevirtual k74/x/lllIlIII.lIll (Lnet/minecraft/class_1799;)Z
      // 73: ifne c6
      // 76: goto 7d
      // 79: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7c: athrow
      // 7d: aload 2
      // 7e: aload 0
      // 7f: aload 8
      // 81: invokevirtual k74/x/lllIlIII.l (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 84: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 87: ifne 98
      // 8a: goto 91
      // 8d: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 90: athrow
      // 91: goto c6
      // 94: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 97: athrow
      // 98: new k74/x/IllIIlll
      // 9b: dup
      // 9c: iload 7
      // 9e: aload 0
      // 9f: aload 8
      // a1: invokevirtual k74/x/lllIlIII.IIIIl (Lnet/minecraft/class_1799;)D
      // a4: aload 0
      // a5: iload 7
      // a7: invokevirtual k74/x/lllIlIII.Il (I)I
      // aa: invokespecial k74/x/IllIIlll.<init> (IDI)V
      // ad: astore 9
      // af: aload 3
      // b0: ifnull c3
      // b3: aload 9
      // b5: aload 3
      // b6: invokevirtual k74/x/IllIIlll.II (Lk74/x/IllIIlll;)Z
      // b9: ifeq c6
      // bc: goto c3
      // bf: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // c2: athrow
      // c3: aload 9
      // c5: astore 3
      // c6: iinc 6 1
      // c9: goto 0f
      // cc: aload 3
      // cd: areturn
   }

   private static String IlIl(class_1799 var0) {
      return class_7923.field_41178.method_10221(var0.method_7909()).method_12832();
   }

   private String IllI(class_1799 var1) {
      int var4 = -2115931517;

      try {
         if (var1.method_7960()) {
            return null;
         }
      } catch (MatchException var19) {
         throw Ill(var19);
      }

      String var2 = IlIl(var1);
      if (this.IlI.IllI()) {
         String var3 = this.IIllI(var2);

         try {
            if (var3 != null) {
               return var3;
            }
         } catch (MatchException var18) {
            throw Ill(var18);
         }
      }

      try {
         if (!this.ll.IllI()) {
            return null;
         }
      } catch (MatchException var17) {
         throw Ill(var17);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652820, var4 ^ 1401775429)]))) {
            return IlIIllIII.lI(lI[IllII(-447652817, var4 ^ -659853452)]);
         }
      } catch (MatchException var31) {
         throw Ill(var31);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652818, var4 ^ -685302886)]))) {
            return IlIIllIII.lI(lI[IllII(-447652823, var4 ^ 1651017131)]);
         }
      } catch (MatchException var16) {
         throw Ill(var16);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652824, var4 ^ -2078666609)]))) {
            return IlIIllIII.lI(lI[IllII(-447652821, var4 ^ 284171319)]);
         }
      } catch (MatchException var30) {
         throw Ill(var30);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652822, var4 ^ 1930327361)]))) {
            return IlIIllIII.lI(lI[IllII(-447652827, var4 ^ 314121609)]);
         }
      } catch (MatchException var15) {
         throw Ill(var15);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652828, var4 ^ 1568292915)]))) {
            return IlIIllIII.lI(lI[IllII(-447652825, var4 ^ 1786924436)]);
         }
      } catch (MatchException var29) {
         throw Ill(var29);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652826, var4 ^ 1864521967)]))) {
            return IlIIllIII.lI(lI[IllII(-447652831, var4 ^ 1358066603)]);
         }
      } catch (MatchException var14) {
         throw Ill(var14);
      }

      try {
         if (var2.equals(IlIIllIII.lI(lI[IllII(-447652832, var4 ^ -1373910078)]))) {
            return IlIIllIII.lI(lI[IllII(-447652829, var4 ^ -1337860759)]);
         }
      } catch (MatchException var28) {
         throw Ill(var28);
      }

      try {
         if (var2.equals(IlIIllIII.lI(lI[IllII(-447652830, var4 ^ -218097151)]))) {
            return IlIIllIII.lI(lI[IllII(-447652771, var4 ^ -518627769)]);
         }
      } catch (MatchException var13) {
         throw Ill(var13);
      }

      try {
         if (var2.equals(IlIIllIII.lI(lI[IllII(-447652772, var4 ^ -1857316051)]))) {
            return IlIIllIII.lI(lI[IllII(-447652769, var4 ^ 2073944472)]);
         }
      } catch (MatchException var27) {
         throw Ill(var27);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652770, var4 ^ 1824340334)]))) {
            return IlIIllIII.lI(lI[IllII(-447652775, var4 ^ 286682089)]);
         }
      } catch (MatchException var12) {
         throw Ill(var12);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652776, var4 ^ 190679846)]))) {
            return IlIIllIII.lI(lI[IllII(-447652773, var4 ^ 1574461714)]);
         }
      } catch (MatchException var26) {
         throw Ill(var26);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652774, var4 ^ 938512095)]))) {
            return IlIIllIII.lI(lI[IllII(-447652779, var4 ^ -657724504)]);
         }
      } catch (MatchException var11) {
         throw Ill(var11);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652780, var4 ^ 2071521034)]))) {
            return IlIIllIII.lI(lI[IllII(-447652777, var4 ^ 134981264)]);
         }
      } catch (MatchException var25) {
         throw Ill(var25);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652778, var4 ^ -2123168487)]))) {
            return IlIIllIII.lI(lI[IllII(-447652783, var4 ^ 1602684823)]);
         }
      } catch (MatchException var10) {
         throw Ill(var10);
      }

      try {
         if (var2.endsWith(IlIIllIII.lI(lI[IllII(-447652784, var4 ^ -198469018)]))) {
            return IlIIllIII.lI(lI[IllII(-447652781, var4 ^ -1545829473)]);
         }
      } catch (MatchException var24) {
         throw Ill(var24);
      }

      try {
         if (var2.equals(IlIIllIII.lI(lI[IllII(-447652782, var4 ^ 557658463)]))) {
            return IlIIllIII.lI(lI[IllII(-447652787, var4 ^ 1611245600)]);
         }
      } catch (MatchException var9) {
         throw Ill(var9);
      }

      try {
         if (var2.equals(IlIIllIII.lI(lI[IllII(-447652788, var4 ^ 2119997685)]))) {
            return IlIIllIII.lI(lI[IllII(-447652785, var4 ^ 827471249)]);
         }
      } catch (MatchException var23) {
         throw Ill(var23);
      }

      try {
         if (var2.equals(IlIIllIII.lI(lI[IllII(-447652786, var4 ^ -1415361096)]))) {
            return IlIIllIII.lI(lI[IllII(-447652791, var4 ^ -2117817510)]);
         }
      } catch (MatchException var8) {
         throw Ill(var8);
      }

      try {
         if (var2.equals(IlIIllIII.lI(lI[IllII(-447652792, var4 ^ 126899911)]))) {
            return IlIIllIII.lI(lI[IllII(-447652789, var4 ^ 753973051)]);
         }
      } catch (MatchException var22) {
         throw Ill(var22);
      }

      try {
         if (var2.equals(IlIIllIII.lI(lI[IllII(-447652790, var4 ^ 2064164846)]))) {
            return IlIIllIII.lI(lI[IllII(-447652795, var4 ^ 1025898708)]);
         }
      } catch (MatchException var7) {
         throw Ill(var7);
      }

      try {
         if (var2.equals(IlIIllIII.lI(lI[IllII(-447652796, var4 ^ 708489591)]))) {
            return IlIIllIII.lI(lI[IllII(-447652793, var4 ^ 2113970792)]);
         }
      } catch (MatchException var21) {
         throw Ill(var21);
      }

      try {
         if (var2.equals(IlIIllIII.lI(lI[IllII(-447652794, var4 ^ -1970638012)]))) {
            return IlIIllIII.lI(lI[IllII(-447652799, var4 ^ 902832546)]);
         }
      } catch (MatchException var6) {
         throw Ill(var6);
      }

      try {
         if (var2.equals(IlIIllIII.lI(lI[IllII(-447652800, var4 ^ 981217696)]))) {
            return IlIIllIII.lI(lI[IllII(-447652797, var4 ^ 199644403)]);
         }
      } catch (MatchException var20) {
         throw Ill(var20);
      }

      try {
         return var2.equals(IlIIllIII.lI(lI[IllII(-447652798, var4 ^ 1661746693)])) ? IlIIllIII.lI(lI[IllII(-447652739, var4 ^ 1985896196)]) : null;
      } catch (MatchException var5) {
         throw Ill(var5);
      }
   }

   private static void Illl() {
      int var0 = 351902954;
      lI[0] = ll(I(IllII(-447652740, var0 ^ 1374928839), IllII(-447652737, var0 ^ 859295794)).toCharArray(), 47314L, IllII(-447652738, var0 ^ -511833960));
      lI[1] = ll(I(IllII(-447652743, var0 ^ -902580546), IllII(-447652744, var0 ^ -749725467)).toCharArray(), 7234L, IllII(-447652741, var0 ^ -4335145));
      lI[2] = ll(I(IllII(-447652742, var0 ^ 1690900948), IllII(-447652747, var0 ^ 1584464216)).toCharArray(), 31113L, IllII(-447652748, var0 ^ -1106949127));
      lI[3] = ll(I(IllII(-447652745, var0 ^ -1485030993), IllII(-447652746, var0 ^ -815903370)).toCharArray(), 58391L, IllII(-447652751, var0 ^ 1491344319));
      lI[4] = ll(I(IllII(-447652752, var0 ^ 987301123), IllII(-447652749, var0 ^ -411716710)).toCharArray(), 66711L, IllII(-447652750, var0 ^ -752518082));
      lI[5] = ll(I(IllII(-447652755, var0 ^ 1576287215), IllII(-447652756, var0 ^ 384033366)).toCharArray(), 9335L, IllII(-447652753, var0 ^ 466540054));
      lI[IllII(-447652754, var0 ^ 216783880)] = ll(
         I(IllII(-447652759, var0 ^ -883801017), IllII(-447652760, var0 ^ 1484005224)).toCharArray(), 81557L, IllII(-447652757, var0 ^ -1825515618)
      );
      lI[IllII(-447652758, var0 ^ 515934235)] = ll(
         I(IllII(-447652763, var0 ^ 112242918), IllII(-447652764, var0 ^ 1173138677)).toCharArray(), 35456L, IllII(-447652761, var0 ^ -630185885)
      );
      lI[IllII(-447652762, var0 ^ 2024619808)] = ll(
         I(IllII(-447652767, var0 ^ -732101601), IllII(-447652768, var0 ^ 1213732770)).toCharArray(), 77827L, IllII(-447652765, var0 ^ -1879827447)
      );
      lI[IllII(-447652766, var0 ^ 1494489883)] = ll(
         I(IllII(-447652707, var0 ^ -645541489), IllII(-447652708, var0 ^ -2110645867)).toCharArray(), 331L, IllII(-447652705, var0 ^ -1391426968)
      );
      lI[IllII(-447652706, var0 ^ -464691102)] = ll(
         I(IllII(-447652711, var0 ^ -1684090575), IllII(-447652712, var0 ^ -118502831)).toCharArray(), 58982L, IllII(-447652709, var0 ^ 1250406501)
      );
      lI[IllII(-447652710, var0 ^ -403983686)] = ll(
         I(IllII(-447652715, var0 ^ 1853097756), IllII(-447652716, var0 ^ 349897543)).toCharArray(), 54861L, IllII(-447652713, var0 ^ 615986818)
      );
      lI[IllII(-447652714, var0 ^ 1359121548)] = ll(
         I(IllII(-447652719, var0 ^ 665543823), IllII(-447652720, var0 ^ 793320101)).toCharArray(), 17062L, IllII(-447652717, var0 ^ 1177561108)
      );
      lI[IllII(-447652718, var0 ^ -2066008153)] = ll(
         I(IllII(-447652723, var0 ^ 1938324922), IllII(-447652724, var0 ^ 1818482777)).toCharArray(), 93590L, IllII(-447652721, var0 ^ -701067203)
      );
      lI[IllII(-447652722, var0 ^ 173425631)] = ll(
         I(IllII(-447652727, var0 ^ 810409239), IllII(-447652728, var0 ^ -1211535239)).toCharArray(), 73672L, IllII(-447652725, var0 ^ 1849575473)
      );
      lI[IllII(-447652726, var0 ^ -1742184557)] = ll(
         I(IllII(-447652731, var0 ^ 1547484642), IllII(-447652732, var0 ^ -422291850)).toCharArray(), 3012L, IllII(-447652729, var0 ^ -1245067660)
      );
      lI[IllII(-447652730, var0 ^ 1688052245)] = ll(
         I(IllII(-447652735, var0 ^ -1347250025), IllII(-447652736, var0 ^ -1766222417)).toCharArray(), 64339L, IllII(-447652733, var0 ^ 714614525)
      );
      lI[IllII(-447652734, var0 ^ -1955490792)] = ll(
         I(IllII(-447652675, var0 ^ -714849701), IllII(-447652676, var0 ^ -1738378858)).toCharArray(), 78970L, IllII(-447652673, var0 ^ -1843287805)
      );
      lI[IllII(-447652674, var0 ^ -1804466046)] = ll(
         I(IllII(-447652679, var0 ^ -936001649), IllII(-447652680, var0 ^ -1582898202)).toCharArray(), 20306L, IllII(-447652677, var0 ^ 222964299)
      );
      lI[IllII(-447652678, var0 ^ 1235198218)] = ll(
         I(IllII(-447652683, var0 ^ -1948306412), IllII(-447652684, var0 ^ -608178659)).toCharArray(), 6623L, IllII(-447652681, var0 ^ -1017862642)
      );
      lI[IllII(-447652682, var0 ^ 1215699049)] = ll(
         I(IllII(-447652687, var0 ^ -852459328), IllII(-447652688, var0 ^ 546652472)).toCharArray(), 45103L, IllII(-447652685, var0 ^ -1400665366)
      );
      lI[IllII(-447652686, var0 ^ -826626227)] = ll(
         I(IllII(-447652691, var0 ^ -1076936969), IllII(-447652692, var0 ^ -281136511)).toCharArray(), 27259L, IllII(-447652689, var0 ^ -1346843164)
      );
      lI[IllII(-447652690, var0 ^ -263989607)] = ll(
         I(IllII(-447652695, var0 ^ 189466133), IllII(-447652696, var0 ^ -1781261785)).toCharArray(), 9913L, IllII(-447652693, var0 ^ -1934796384)
      );
      lI[IllII(-447652694, var0 ^ 532634949)] = ll(
         I(IllII(-447652699, var0 ^ -2006227961), IllII(-447652700, var0 ^ -524365094)).toCharArray(), 40762L, IllII(-447652697, var0 ^ -1328990587)
      );
      lI[IllII(-447652698, var0 ^ 1983215570)] = ll(
         I(IllII(-447652703, var0 ^ -891460596), IllII(-447652704, var0 ^ -1900478800)).toCharArray(), 12849L, IllII(-447652701, var0 ^ 1986097395)
      );
      lI[IllII(-447652702, var0 ^ 1357350813)] = ll(
         I(IllII(-447652643, var0 ^ -274769934), IllII(-447652644, var0 ^ -122613573)).toCharArray(), 78261L, IllII(-447652641, var0 ^ -1978154210)
      );
      lI[IllII(-447652642, var0 ^ 1183915683)] = ll(
         I(IllII(-447652647, var0 ^ 620894652), IllII(-447652648, var0 ^ 45685810)).toCharArray(), 82695L, IllII(-447652645, var0 ^ -456695317)
      );
      lI[IllII(-447652646, var0 ^ -1189521774)] = ll(
         I(IllII(-447652651, var0 ^ -745239179), IllII(-447652652, var0 ^ 25298187)).toCharArray(), 63896L, IllII(-447652649, var0 ^ -658216925)
      );
      lI[IllII(-447652650, var0 ^ -686908728)] = ll(
         I(IllII(-447652655, var0 ^ -783094827), IllII(-447652656, var0 ^ 1357790174)).toCharArray(), 96499L, IllII(-447652653, var0 ^ 1516827242)
      );
      lI[IllII(-447652654, var0 ^ 669835221)] = ll(
         I(IllII(-447652659, var0 ^ -586401714), IllII(-447652660, var0 ^ -1656997356)).toCharArray(), 10158L, IllII(-447652657, var0 ^ -217185925)
      );
      lI[IllII(-447652658, var0 ^ 631201798)] = ll(
         I(IllII(-447652663, var0 ^ 259268015), IllII(-447652664, var0 ^ -1686183446)).toCharArray(), 46048L, IllII(-447652661, var0 ^ 51534811)
      );
      lI[IllII(-447652662, var0 ^ 1301048709)] = ll(
         I(IllII(-447652667, var0 ^ -1445484104), IllII(-447652668, var0 ^ -564494819)).toCharArray(), 54273L, IllII(-447652665, var0 ^ -410007254)
      );
      lI[IllII(-447652666, var0 ^ 1896181179)] = ll(
         I(IllII(-447652671, var0 ^ -291362533), IllII(-447652672, var0 ^ 274125290)).toCharArray(), 92109L, IllII(-447652669, var0 ^ 220597770)
      );
      lI[IllII(-447652670, var0 ^ 1485694122)] = ll(
         I(IllII(-447652611, var0 ^ -1168692394), IllII(-447652612, var0 ^ 232773139)).toCharArray(), 62928L, IllII(-447652609, var0 ^ -802803078)
      );
      lI[IllII(-447652610, var0 ^ -356171283)] = ll(
         I(IllII(-447652615, var0 ^ -1657546792), IllII(-447652616, var0 ^ 1350402858)).toCharArray(), 20109L, IllII(-447652613, var0 ^ -261515588)
      );
      lI[IllII(-447652614, var0 ^ -203157810)] = ll(
         I(IllII(-447652619, var0 ^ -1508222432), IllII(-447652620, var0 ^ -737555776)).toCharArray(), 67689L, IllII(-447652617, var0 ^ 1321676491)
      );
      lI[IllII(-447652618, var0 ^ -2002174610)] = ll(
         I(IllII(-447652623, var0 ^ -83487738), IllII(-447652624, var0 ^ -1892200489)).toCharArray(), 52398L, IllII(-447652621, var0 ^ 1303916844)
      );
      lI[IllII(-447652622, var0 ^ -902916931)] = ll(
         I(IllII(-447652627, var0 ^ -1505435464), IllII(-447652628, var0 ^ 1318008027)).toCharArray(), 42339L, IllII(-447652625, var0 ^ -1085603913)
      );
      lI[IllII(-447652626, var0 ^ 618822464)] = ll(
         I(IllII(-447652631, var0 ^ 1233218470), IllII(-447652632, var0 ^ 799251007)).toCharArray(), 60925L, IllII(-447652629, var0 ^ -1520284744)
      );
      lI[IllII(-447652630, var0 ^ -844018426)] = ll(
         I(IllII(-447652635, var0 ^ 2001970255), IllII(-447652636, var0 ^ -760729931)).toCharArray(), 10860L, IllII(-447652633, var0 ^ -1032913168)
      );
      lI[IllII(-447652634, var0 ^ 1938210266)] = ll(
         I(IllII(-447652639, var0 ^ -1570599637), IllII(-447652640, var0 ^ 1609972005)).toCharArray(), 35627L, IllII(-447652637, var0 ^ -353262119)
      );
      lI[IllII(-447652638, var0 ^ -854142342)] = ll(
         I(IllII(-447652067, var0 ^ -515192289), IllII(-447652068, var0 ^ -402576573)).toCharArray(), 94043L, IllII(-447652065, var0 ^ 1641236661)
      );
      lI[IllII(-447652066, var0 ^ 432066487)] = ll(
         I(IllII(-447652071, var0 ^ 939955762), IllII(-447652072, var0 ^ -255425513)).toCharArray(), 89374L, IllII(-447652069, var0 ^ -187940601)
      );
      lI[IllII(-447652070, var0 ^ 67427793)] = ll(
         I(IllII(-447652075, var0 ^ -2118510616), IllII(-447652076, var0 ^ -1246773961)).toCharArray(), 27812L, IllII(-447652073, var0 ^ 1265483494)
      );
      lI[IllII(-447652074, var0 ^ -1108638416)] = ll(
         I(IllII(-447652079, var0 ^ 558994775), IllII(-447652080, var0 ^ 2036340599)).toCharArray(), 61506L, IllII(-447652077, var0 ^ 1735703651)
      );
      lI[IllII(-447652078, var0 ^ 1900333259)] = ll(
         I(IllII(-447652083, var0 ^ 1294743830), IllII(-447652084, var0 ^ 1362972860)).toCharArray(), 81871L, IllII(-447652081, var0 ^ 174564833)
      );
      lI[IllII(-447652082, var0 ^ -700540773)] = ll(
         I(IllII(-447652087, var0 ^ 303463540), IllII(-447652088, var0 ^ -1573829001)).toCharArray(), 31026L, IllII(-447652085, var0 ^ -997564026)
      );
      lI[IllII(-447652086, var0 ^ -1967326137)] = ll(
         I(IllII(-447652091, var0 ^ 367512727), IllII(-447652092, var0 ^ 1639207570)).toCharArray(), 65103L, IllII(-447652089, var0 ^ -962194866)
      );
      lI[IllII(-447652090, var0 ^ -785849862)] = ll(
         I(IllII(-447652095, var0 ^ 114600213), IllII(-447652096, var0 ^ 1097045160)).toCharArray(), 16429L, IllII(-447652093, var0 ^ -165590687)
      );
      lI[IllII(-447652094, var0 ^ -1449901326)] = ll(
         I(IllII(-447652035, var0 ^ -1593509829), IllII(-447652036, var0 ^ -1098500342)).toCharArray(), 82774L, IllII(-447652033, var0 ^ -1401920547)
      );
      lI[IllII(-447652034, var0 ^ -1321309050)] = ll(
         I(IllII(-447652039, var0 ^ 1302549109), IllII(-447652040, var0 ^ 468456925)).toCharArray(), 52114L, IllII(-447652037, var0 ^ -1255976644)
      );
      lI[IllII(-447652038, var0 ^ 218527698)] = ll(
         I(IllII(-447652043, var0 ^ 1984767269), IllII(-447652044, var0 ^ -731893623)).toCharArray(), 92573L, IllII(-447652041, var0 ^ 441134485)
      );
      lI[IllII(-447652042, var0 ^ 1682926490)] = ll(
         I(IllII(-447652047, var0 ^ -1100879933), IllII(-447652048, var0 ^ -1878898367)).toCharArray(), 76402L, IllII(-447652045, var0 ^ 610381517)
      );
      lI[IllII(-447652046, var0 ^ 520103343)] = ll(
         I(IllII(-447652051, var0 ^ 519298012), IllII(-447652052, var0 ^ 1638481259)).toCharArray(), 91774L, IllII(-447652049, var0 ^ -1959832125)
      );
      lI[IllII(-447652050, var0 ^ -659087823)] = ll(
         I(IllII(-447652055, var0 ^ -424707249), IllII(-447652056, var0 ^ -314369937)).toCharArray(), 81771L, IllII(-447652053, var0 ^ 2093661332)
      );
      lI[IllII(-447652054, var0 ^ -1094584962)] = ll(
         I(IllII(-447652059, var0 ^ -2087483175), IllII(-447652060, var0 ^ 1827017652)).toCharArray(), 70914L, IllII(-447652057, var0 ^ 897502352)
      );
      lI[IllII(-447652058, var0 ^ 1692525008)] = ll(
         I(IllII(-447652063, var0 ^ 265147672), IllII(-447652064, var0 ^ -928093215)).toCharArray(), 97264L, IllII(-447652061, var0 ^ -597953133)
      );
      lI[IllII(-447652062, var0 ^ -82029645)] = ll(
         I(IllII(-447652003, var0 ^ 851100089), IllII(-447652004, var0 ^ -374948724)).toCharArray(), 47404L, IllII(-447652001, var0 ^ 2146715540)
      );
      lI[IllII(-447652002, var0 ^ -998379816)] = ll(
         I(IllII(-447652007, var0 ^ 825354754), IllII(-447652008, var0 ^ -1946298694)).toCharArray(), 52995L, IllII(-447652005, var0 ^ -697151908)
      );
      lI[IllII(-447652006, var0 ^ -1786239513)] = ll(
         I(IllII(-447652011, var0 ^ 365301965), IllII(-447652012, var0 ^ -1754165870)).toCharArray(), 46534L, IllII(-447652009, var0 ^ 1905909657)
      );
      lI[IllII(-447652010, var0 ^ 335418153)] = ll(
         I(IllII(-447652015, var0 ^ -737198286), IllII(-447652016, var0 ^ 435707215)).toCharArray(), 52035L, IllII(-447652013, var0 ^ -108875579)
      );
      lI[IllII(-447652014, var0 ^ -1341665637)] = ll(
         I(IllII(-447652019, var0 ^ -2021075261), IllII(-447652020, var0 ^ 677557762)).toCharArray(), 18141L, IllII(-447652017, var0 ^ -1573898791)
      );
      lI[IllII(-447652018, var0 ^ 184920851)] = ll(
         I(IllII(-447652023, var0 ^ 1329706651), IllII(-447652024, var0 ^ 1135031746)).toCharArray(), 44454L, IllII(-447652021, var0 ^ 1330543652)
      );
      lI[IllII(-447652022, var0 ^ 295369600)] = ll(
         I(IllII(-447652027, var0 ^ -25689336), IllII(-447652028, var0 ^ 1856189034)).toCharArray(), 81788L, IllII(-447652025, var0 ^ -897344333)
      );
      lI[IllII(-447652026, var0 ^ -1916585621)] = ll(
         I(IllII(-447652031, var0 ^ -1804690370), IllII(-447652032, var0 ^ 2060108691)).toCharArray(), 56081L, IllII(-447652029, var0 ^ -1607724337)
      );
      lI[IllII(-447652030, var0 ^ -812587101)] = ll(
         I(IllII(-447651971, var0 ^ -2117690178), IllII(-447651972, var0 ^ -2109049830)).toCharArray(), 96098L, IllII(-447651969, var0 ^ -845985613)
      );
      lI[IllII(-447651970, var0 ^ 1840930110)] = ll(
         I(IllII(-447651975, var0 ^ -574598923), IllII(-447651976, var0 ^ 924924803)).toCharArray(), 82659L, IllII(-447651973, var0 ^ 1736955203)
      );
      lI[IllII(-447651974, var0 ^ 104390330)] = ll(
         I(IllII(-447651979, var0 ^ 1064472118), IllII(-447651980, var0 ^ 2020589694)).toCharArray(), 45769L, IllII(-447651977, var0 ^ -1362931192)
      );
      lI[IllII(-447651978, var0 ^ 599388315)] = ll(
         I(IllII(-447651983, var0 ^ 1246957211), IllII(-447651984, var0 ^ -8782253)).toCharArray(), 67671L, IllII(-447651981, var0 ^ -1568755696)
      );
      lI[IllII(-447651982, var0 ^ -124755977)] = ll(
         I(IllII(-447651987, var0 ^ -1861304017), IllII(-447651988, var0 ^ 1872690889)).toCharArray(), 96058L, IllII(-447651985, var0 ^ 1142288870)
      );
      lI[IllII(-447651986, var0 ^ -1564739104)] = ll(
         I(IllII(-447651991, var0 ^ -1248604719), IllII(-447651992, var0 ^ -356927411)).toCharArray(), 90568L, IllII(-447651989, var0 ^ 1603657421)
      );
      lI[IllII(-447651990, var0 ^ -2002221805)] = ll(
         I(IllII(-447651995, var0 ^ 1644791282), IllII(-447651996, var0 ^ -820820758)).toCharArray(), 40501L, IllII(-447651993, var0 ^ 1249391565)
      );
      lI[IllII(-447651994, var0 ^ -1810965866)] = ll(
         I(IllII(-447651999, var0 ^ 1715378979), IllII(-447652000, var0 ^ -1680296452)).toCharArray(), 44293L, IllII(-447651997, var0 ^ 2097097535)
      );
      lI[IllII(-447651998, var0 ^ 28016790)] = ll(
         I(IllII(-447651939, var0 ^ 21915218), IllII(-447651940, var0 ^ 1950264486)).toCharArray(), 85594L, IllII(-447651937, var0 ^ 231454730)
      );
      lI[IllII(-447651938, var0 ^ -1087251478)] = ll(
         I(IllII(-447651943, var0 ^ -2050534354), IllII(-447651944, var0 ^ -289928199)).toCharArray(), 59336L, IllII(-447651941, var0 ^ 1222978405)
      );
      lI[IllII(-447651942, var0 ^ 987062324)] = ll(
         I(IllII(-447651947, var0 ^ -573443737), IllII(-447651948, var0 ^ 767340862)).toCharArray(), 56234L, IllII(-447651945, var0 ^ 1229606175)
      );
      lI[IllII(-447651946, var0 ^ 2020601736)] = ll(
         I(IllII(-447651951, var0 ^ -1515542915), IllII(-447651952, var0 ^ 1314645272)).toCharArray(), 25213L, IllII(-447651949, var0 ^ -2093095886)
      );
      lI[IllII(-447651950, var0 ^ -1281546798)] = ll(
         I(IllII(-447651955, var0 ^ 176376698), IllII(-447651956, var0 ^ 320454249)).toCharArray(), 28285L, IllII(-447651953, var0 ^ 178501138)
      );
      lI[IllII(-447651954, var0 ^ 2073181001)] = ll(
         I(IllII(-447651959, var0 ^ 2140425609), IllII(-447651960, var0 ^ 1613465462)).toCharArray(), 8344L, IllII(-447651957, var0 ^ 127171153)
      );
      lI[IllII(-447651958, var0 ^ 1216577547)] = ll(
         I(IllII(-447651963, var0 ^ 1705036031), IllII(-447651964, var0 ^ -363880914)).toCharArray(), 55914L, IllII(-447651961, var0 ^ -1158184632)
      );
      lI[IllII(-447651962, var0 ^ 1881951782)] = ll(
         I(IllII(-447651967, var0 ^ 112903948), IllII(-447651968, var0 ^ 697163472)).toCharArray(), 85252L, IllII(-447651965, var0 ^ -851190043)
      );
      lI[IllII(-447651966, var0 ^ 1508471203)] = ll(
         I(IllII(-447651907, var0 ^ 2088744191), IllII(-447651908, var0 ^ 1818672953)).toCharArray(), 20079L, IllII(-447651905, var0 ^ 2031948975)
      );
      lI[IllII(-447651906, var0 ^ 1350677909)] = ll(
         I(IllII(-447651911, var0 ^ -827510608), IllII(-447651912, var0 ^ -1263921430)).toCharArray(), 56256L, IllII(-447651909, var0 ^ 302107023)
      );
      lI[IllII(-447651910, var0 ^ -1667331840)] = ll(
         I(IllII(-447651915, var0 ^ 1724369911), IllII(-447651916, var0 ^ -1589332325)).toCharArray(), 30565L, IllII(-447651913, var0 ^ 925401328)
      );
      lI[IllII(-447651914, var0 ^ 1351842201)] = ll(
         I(IllII(-447651919, var0 ^ 908719653), IllII(-447651920, var0 ^ -276536989)).toCharArray(), 7985L, IllII(-447651917, var0 ^ -1740179503)
      );
      lI[IllII(-447651918, var0 ^ -1259251945)] = ll(
         I(IllII(-447651923, var0 ^ -1296295665), IllII(-447651924, var0 ^ -322267792)).toCharArray(), 92352L, IllII(-447651921, var0 ^ 109751693)
      );
      lI[IllII(-447651922, var0 ^ -1176896037)] = ll(
         I(IllII(-447651927, var0 ^ 210634044), IllII(-447651928, var0 ^ 805588183)).toCharArray(), 44442L, IllII(-447651925, var0 ^ -1943935787)
      );
      lI[IllII(-447651926, var0 ^ -889729985)] = ll("".toCharArray(), 87617L, IllII(-447651931, var0 ^ 2680618));
      lI[IllII(-447651932, var0 ^ -95862450)] = ll(
         I(IllII(-447651929, var0 ^ -1664074521), IllII(-447651930, var0 ^ -58128229)).toCharArray(), 21271L, IllII(-447651935, var0 ^ 1502075254)
      );
      lI[IllII(-447651936, var0 ^ 233718190)] = ll(
         I(IllII(-447651933, var0 ^ 1562714826), IllII(-447651934, var0 ^ 859401155)).toCharArray(), 58261L, IllII(-447651875, var0 ^ 168465716)
      );
      lI[IllII(-447651876, var0 ^ 142082691)] = ll(
         I(IllII(-447651873, var0 ^ -933456104), IllII(-447651874, var0 ^ -1016318751)).toCharArray(), 55490L, IllII(-447651879, var0 ^ 369998045)
      );
      lI[IllII(-447651880, var0 ^ -1720460097)] = ll(
         I(IllII(-447651877, var0 ^ 1908446476), IllII(-447651878, var0 ^ 191276040)).toCharArray(), 26460L, IllII(-447651883, var0 ^ -1756147162)
      );
      lI[IllII(-447651884, var0 ^ -1000755124)] = ll(
         I(IllII(-447651881, var0 ^ 420952656), IllII(-447651882, var0 ^ -1552934288)).toCharArray(), 23622L, IllII(-447651887, var0 ^ 464449519)
      );
      lI[IllII(-447651888, var0 ^ -311479193)] = ll(
         I(IllII(-447651885, var0 ^ 1989876079), IllII(-447651886, var0 ^ -1056570822)).toCharArray(), 4413L, IllII(-447651891, var0 ^ -1562063863)
      );
      lI[IllII(-447651892, var0 ^ -1147894492)] = ll(
         I(IllII(-447651889, var0 ^ 856783585), IllII(-447651890, var0 ^ 813598657)).toCharArray(), 38310L, IllII(-447651895, var0 ^ 458638032)
      );
      lI[IllII(-447651896, var0 ^ 794534746)] = ll(
         I(IllII(-447651893, var0 ^ 176586995), IllII(-447651894, var0 ^ 175993631)).toCharArray(), 37006L, IllII(-447651899, var0 ^ 1366637647)
      );
      lI[IllII(-447651900, var0 ^ 952808743)] = ll(
         I(IllII(-447651897, var0 ^ 1608786602), IllII(-447651898, var0 ^ 1516093822)).toCharArray(), 44660L, IllII(-447651903, var0 ^ 1938098495)
      );
      lI[IllII(-447651904, var0 ^ 1362143645)] = ll(
         I(IllII(-447651901, var0 ^ -362845812), IllII(-447651902, var0 ^ -381179492)).toCharArray(), 64642L, IllII(-447651843, var0 ^ 136209458)
      );
      lI[IllII(-447651844, var0 ^ -1853919351)] = ll(
         I(IllII(-447651841, var0 ^ -1676531917), IllII(-447651842, var0 ^ 20135583)).toCharArray(), 23421L, IllII(-447651847, var0 ^ 16925257)
      );
      lI[IllII(-447651848, var0 ^ -1294921935)] = ll(
         I(IllII(-447651845, var0 ^ -1555420507), IllII(-447651846, var0 ^ 1660597745)).toCharArray(), 6304L, IllII(-447651851, var0 ^ -625511249)
      );
      lI[IllII(-447651852, var0 ^ -347551952)] = ll(
         I(IllII(-447651849, var0 ^ 1099126811), IllII(-447651850, var0 ^ 1841129554)).toCharArray(), 90319L, IllII(-447651855, var0 ^ 1956107584)
      );
      lI[IllII(-447651856, var0 ^ 14678859)] = ll(
         I(IllII(-447651853, var0 ^ -491659037), IllII(-447651854, var0 ^ 1480725483)).toCharArray(), 76903L, IllII(-447651859, var0 ^ 978843687)
      );
      lI[IllII(-447651860, var0 ^ 2028763234)] = ll(
         I(IllII(-447651857, var0 ^ -147121926), IllII(-447651858, var0 ^ 682139314)).toCharArray(), 7747L, IllII(-447651863, var0 ^ 1143949143)
      );
      lI[IllII(-447651864, var0 ^ -192072805)] = ll(
         I(IllII(-447651861, var0 ^ -20834741), IllII(-447651862, var0 ^ 1799667722)).toCharArray(), 36355L, IllII(-447651867, var0 ^ -1150467177)
      );
      lI[IllII(-447651868, var0 ^ 1103609500)] = ll(
         I(IllII(-447651865, var0 ^ 1944798373), IllII(-447651866, var0 ^ 1187992932)).toCharArray(), 36826L, IllII(-447651871, var0 ^ 1753946224)
      );
      lI[IllII(-447651872, var0 ^ 1618189097)] = ll(
         I(IllII(-447651869, var0 ^ 720042294), IllII(-447651870, var0 ^ 1496119323)).toCharArray(), 98006L, IllII(-447652323, var0 ^ -165771161)
      );
      lI[IllII(-447652324, var0 ^ 696888712)] = ll(
         I(IllII(-447652321, var0 ^ 393939167), IllII(-447652322, var0 ^ -936366366)).toCharArray(), 66745L, IllII(-447652327, var0 ^ -980418067)
      );
      lI[IllII(-447652328, var0 ^ -1843140698)] = ll(
         I(IllII(-447652325, var0 ^ 1843066160), IllII(-447652326, var0 ^ -271688200)).toCharArray(), 33433L, IllII(-447652331, var0 ^ 389396409)
      );
      lI[IllII(-447652332, var0 ^ 2088034343)] = ll(
         I(IllII(-447652329, var0 ^ -1857305738), IllII(-447652330, var0 ^ 691220762)).toCharArray(), 38899L, IllII(-447652335, var0 ^ 1924532528)
      );
      lI[IllII(-447652336, var0 ^ -2114787960)] = ll(
         I(IllII(-447652333, var0 ^ -640773024), IllII(-447652334, var0 ^ -1674009610)).toCharArray(), 78780L, IllII(-447652339, var0 ^ 1113604202)
      );
      lI[IllII(-447652340, var0 ^ -1303852028)] = ll(
         I(IllII(-447652337, var0 ^ 1638482834), IllII(-447652338, var0 ^ 1392045640)).toCharArray(), 65114L, IllII(-447652343, var0 ^ -2100607645)
      );
      lI[IllII(-447652344, var0 ^ 704490357)] = ll(
         I(IllII(-447652341, var0 ^ -1225031343), IllII(-447652342, var0 ^ 1268201994)).toCharArray(), 9146L, IllII(-447652347, var0 ^ -150801408)
      );
      lI[IllII(-447652348, var0 ^ 1892066121)] = ll(
         I(IllII(-447652345, var0 ^ -1759724344), IllII(-447652346, var0 ^ 274990893)).toCharArray(), 65051L, IllII(-447652351, var0 ^ 816409096)
      );
      lI[IllII(-447652352, var0 ^ 1071637593)] = ll(
         I(IllII(-447652349, var0 ^ 748279782), IllII(-447652350, var0 ^ 1154937613)).toCharArray(), 3667L, IllII(-447652291, var0 ^ -873798317)
      );
      lI[IllII(-447652292, var0 ^ 1948233327)] = ll(
         I(IllII(-447652289, var0 ^ -1944440649), IllII(-447652290, var0 ^ -67730)).toCharArray(), 48773L, IllII(-447652295, var0 ^ -970063640)
      );
      lI[IllII(-447652296, var0 ^ -1754763492)] = ll(
         I(IllII(-447652293, var0 ^ 1185170546), IllII(-447652294, var0 ^ 1233876933)).toCharArray(), 6935L, IllII(-447652299, var0 ^ 1322057825)
      );
      lI[IllII(-447652300, var0 ^ 647818532)] = ll(
         I(IllII(-447652297, var0 ^ -127904170), IllII(-447652298, var0 ^ 699208631)).toCharArray(), 16568L, IllII(-447652303, var0 ^ -768409845)
      );
      lI[IllII(-447652304, var0 ^ -1725528070)] = ll(
         I(IllII(-447652301, var0 ^ -424610218), IllII(-447652302, var0 ^ 803510246)).toCharArray(), 32654L, IllII(-447652307, var0 ^ 1849673833)
      );
      lI[IllII(-447652308, var0 ^ -606784324)] = ll(
         I(IllII(-447652305, var0 ^ 1025017189), IllII(-447652306, var0 ^ 779478800)).toCharArray(), 46563L, IllII(-447652311, var0 ^ -554598801)
      );
      lI[IllII(-447652312, var0 ^ 2062348106)] = ll(
         I(IllII(-447652309, var0 ^ 1317695509), IllII(-447652310, var0 ^ -822629920)).toCharArray(), 20212L, IllII(-447652315, var0 ^ 918088288)
      );
      lI[IllII(-447652316, var0 ^ 1189622209)] = ll(
         I(IllII(-447652313, var0 ^ -1912953230), IllII(-447652314, var0 ^ 850128269)).toCharArray(), 87655L, IllII(-447652319, var0 ^ 1463064868)
      );
      lI[IllII(-447652320, var0 ^ 294373731)] = ll(
         I(IllII(-447652317, var0 ^ -623483483), IllII(-447652318, var0 ^ -2103250326)).toCharArray(), 26755L, IllII(-447652259, var0 ^ -990952352)
      );
      lI[IllII(-447652260, var0 ^ 974467081)] = ll(
         I(IllII(-447652257, var0 ^ -462969943), IllII(-447652258, var0 ^ 1555286467)).toCharArray(), 79638L, IllII(-447652263, var0 ^ 517763557)
      );
      lI[IllII(-447652264, var0 ^ 958417150)] = ll(
         I(IllII(-447652261, var0 ^ -2062386377), IllII(-447652262, var0 ^ -1645063918)).toCharArray(), 99083L, IllII(-447652267, var0 ^ -1150899410)
      );
      lI[IllII(-447652268, var0 ^ -138702305)] = ll(
         I(IllII(-447652265, var0 ^ -194570679), IllII(-447652266, var0 ^ -776915424)).toCharArray(), 64847L, IllII(-447652271, var0 ^ -1931551886)
      );
      lI[IllII(-447652272, var0 ^ 734463054)] = ll(
         I(IllII(-447652269, var0 ^ -1169167176), IllII(-447652270, var0 ^ 723063291)).toCharArray(), 23389L, IllII(-447652275, var0 ^ 480943529)
      );
      lI[IllII(-447652276, var0 ^ -1919696669)] = ll(
         I(IllII(-447652273, var0 ^ -1350612404), IllII(-447652274, var0 ^ -1257337454)).toCharArray(), 81993L, IllII(-447652279, var0 ^ -1169123266)
      );
      lI[IllII(-447652280, var0 ^ -1854825538)] = ll(
         I(IllII(-447652277, var0 ^ 1220582041), IllII(-447652278, var0 ^ -395568264)).toCharArray(), 78267L, IllII(-447652283, var0 ^ 590557836)
      );
   }

   private boolean lIII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 58
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 58
      // 0b: goto 12
      // 0e: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 58
      // 19: goto 20
      // 1c: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 24: ifnull 58
      // 27: goto 2e
      // 2a: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: aload 1
      // 2f: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 32: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 35: ifnull 58
      // 38: goto 3f
      // 3b: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3e: athrow
      // 3f: aload 1
      // 40: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 43: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 46: ifeq 58
      // 49: goto 50
      // 4c: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4f: athrow
      // 50: bipush 1
      // 51: goto 59
      // 54: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 57: athrow
      // 58: bipush 0
      // 59: ireturn
   }

   private boolean lIIl() {
      try {
         if (!this.Illl.IllI()) {
            return true;
         }
      } catch (MatchException var1) {
         throw Ill(var1);
      }

      return false;
   }

   private boolean lIlI(class_310 var1) {
      try {
         switch (lllIlIll.I[this.IIll.IllI().ordinal()]) {
            case 1:
               return lIIIllII.III(var1);
            case 2:
               return lIIIllII.llI(var1);
            case 3:
               return lIIIllII.lllI(var1);
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var2) {
         throw Ill(var2);
      }
   }

   @Override
   public void IlIII() {
      this.lIl = 0L;
      this.III = this.IIII();
   }

   private boolean lIll(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 04: ifne 25
      // 07: getstatic k74/x/lllIlIII.IIlI Ljava/util/Set;
      // 0a: aload 1
      // 0b: invokestatic k74/x/lllIlIII.IlIl (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 0e: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 13: ifeq 25
      // 16: goto 1d
      // 19: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 1
      // 1e: goto 26
      // 21: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 24: athrow
      // 25: bipush 0
      // 26: ireturn
   }

   private boolean llII(class_310 var1) {
      try {
         switch (lllIlIll.I[this.IIll.IllI().ordinal()]) {
            case 1:
               return lIIIllII.I(var1);
            case 2:
               return lIIIllII.lll(var1);
            case 3:
               return lIIIllII.lIll(var1);
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var2) {
         throw Ill(var2);
      }
   }

   private static int IllII(int var0, int var1) {
      int var2 = lIII[var0 ^ -447652579] ^ var1 ^ var0;
      var2 -= 16094;
      var2 ^= 8530;
      var2 -= 2445;
      var2 -= 21692;
      var2 += 28793;
      return var2 ^ 2729;
   }

   public boolean lllI(class_746 param1, class_1799 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1d
      // 04: aload 2
      // 05: ifnull 1d
      // 08: goto 0f
      // 0b: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: aload 2
      // 10: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 13: ifeq 23
      // 16: goto 1d
      // 19: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
      // 1f: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: aload 0
      // 24: aload 2
      // 25: invokevirtual k74/x/lllIlIII.III (Lnet/minecraft/class_1799;)Z
      // 28: ifeq 31
      // 2b: bipush 0
      // 2c: ireturn
      // 2d: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: aload 0
      // 32: getfield k74/x/lllIlIII.IIl Lk74/x/lllIIlII;
      // 35: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 38: checkcast java/lang/Boolean
      // 3b: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3e: ifeq 56
      // 41: aload 0
      // 42: aload 2
      // 43: invokevirtual k74/x/lllIlIII.lIll (Lnet/minecraft/class_1799;)Z
      // 46: ifeq 56
      // 49: goto 50
      // 4c: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4f: athrow
      // 50: bipush 1
      // 51: ireturn
      // 52: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 55: athrow
      // 56: aload 0
      // 57: aload 2
      // 58: invokevirtual k74/x/lllIlIII.IllI (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 5b: astore 3
      // 5c: new k74/x/IllIIlll
      // 5f: dup
      // 60: bipush -1
      // 61: aload 0
      // 62: aload 2
      // 63: invokevirtual k74/x/lllIlIII.IIIIl (Lnet/minecraft/class_1799;)D
      // 66: ldc_w -447652284
      // 69: ldc_w -1196240451
      // 6c: ldc_w 900578300
      // 6f: ixor
      // 70: invokestatic k74/x/lllIlIII.IllII (II)I
      // 73: invokespecial k74/x/IllIIlll.<init> (IDI)V
      // 76: astore 4
      // 78: aload 3
      // 79: ifnull a4
      // 7c: aload 0
      // 7d: aload 1
      // 7e: aload 3
      // 7f: invokevirtual k74/x/lllIlIII.IIIll (Lnet/minecraft/class_746;Ljava/lang/String;)Lk74/x/IllIIlll;
      // 82: astore 5
      // 84: aload 5
      // 86: ifnull a2
      // 89: aload 5
      // 8b: aload 4
      // 8d: invokevirtual k74/x/IllIIlll.II (Lk74/x/IllIIlll;)Z
      // 90: ifeq a2
      // 93: goto 9a
      // 96: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 99: athrow
      // 9a: bipush 1
      // 9b: goto a3
      // 9e: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a1: athrow
      // a2: bipush 0
      // a3: ireturn
      // a4: aload 2
      // a5: invokevirtual net/minecraft/class_1799.method_7946 ()Z
      // a8: ifne ba
      // ab: aload 0
      // ac: aload 2
      // ad: invokevirtual k74/x/lllIlIII.IIIII (Lnet/minecraft/class_1799;)Z
      // b0: ifeq c0
      // b3: goto ba
      // b6: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // b9: athrow
      // ba: bipush 0
      // bb: ireturn
      // bc: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // bf: athrow
      // c0: aload 0
      // c1: aload 1
      // c2: aload 0
      // c3: aload 2
      // c4: invokevirtual k74/x/lllIlIII.l (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // c7: invokevirtual k74/x/lllIlIII.IlII (Lnet/minecraft/class_746;Ljava/lang/String;)Lk74/x/IllIIlll;
      // ca: astore 5
      // cc: aload 5
      // ce: ifnull ea
      // d1: aload 5
      // d3: aload 4
      // d5: invokevirtual k74/x/IllIIlll.II (Lk74/x/IllIIlll;)Z
      // d8: ifeq ea
      // db: goto e2
      // de: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // e1: athrow
      // e2: bipush 1
      // e3: goto eb
      // e6: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // e9: athrow
      // ea: bipush 0
      // eb: ireturn
   }

   private boolean IIIII(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1070563502
      // 003: istore 5
      // 005: aload 1
      // 006: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 009: ifeq 012
      // 00c: bipush 1
      // 00d: ireturn
      // 00e: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 011: athrow
      // 012: aload 1
      // 013: invokestatic k74/x/lllIlIII.IlIl (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 016: astore 2
      // 017: aload 2
      // 018: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 01b: ldc_w -447652281
      // 01e: iload 5
      // 020: ldc_w 878846965
      // 023: ixor
      // 024: invokestatic k74/x/lllIlIII.IllII (II)I
      // 027: aaload
      // 028: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 02b: invokevirtual java/lang/String.contains (Ljava/lang/CharSequence;)Z
      // 02e: ifne 3d5
      // 031: aload 2
      // 032: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 035: ldc_w -447652282
      // 038: iload 5
      // 03a: ldc_w -1787050459
      // 03d: ixor
      // 03e: invokestatic k74/x/lllIlIII.IllII (II)I
      // 041: aaload
      // 042: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 045: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 048: ifne 3d5
      // 04b: goto 052
      // 04e: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 051: athrow
      // 052: aload 2
      // 053: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 056: ldc_w -447652287
      // 059: iload 5
      // 05b: ldc_w -1406316008
      // 05e: ixor
      // 05f: invokestatic k74/x/lllIlIII.IllII (II)I
      // 062: aaload
      // 063: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 066: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 069: ifne 3d5
      // 06c: goto 073
      // 06f: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 072: athrow
      // 073: aload 2
      // 074: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 077: ldc_w -447652288
      // 07a: iload 5
      // 07c: ldc_w 1591947471
      // 07f: ixor
      // 080: invokestatic k74/x/lllIlIII.IllII (II)I
      // 083: aaload
      // 084: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 087: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 08a: ifne 3d5
      // 08d: goto 094
      // 090: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 093: athrow
      // 094: aload 2
      // 095: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 098: ldc_w -447652285
      // 09b: iload 5
      // 09d: ldc_w -178457068
      // 0a0: ixor
      // 0a1: invokestatic k74/x/lllIlIII.IllII (II)I
      // 0a4: aaload
      // 0a5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0a8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0ab: ifne 3d5
      // 0ae: goto 0b5
      // 0b1: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b4: athrow
      // 0b5: aload 2
      // 0b6: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 0b9: ldc_w -447652286
      // 0bc: iload 5
      // 0be: ldc_w 1330457397
      // 0c1: ixor
      // 0c2: invokestatic k74/x/lllIlIII.IllII (II)I
      // 0c5: aaload
      // 0c6: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0c9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 0cc: ifne 3d5
      // 0cf: goto 0d6
      // 0d2: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d5: athrow
      // 0d6: aload 2
      // 0d7: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 0da: ldc_w -447652227
      // 0dd: iload 5
      // 0df: ldc_w -1629816299
      // 0e2: ixor
      // 0e3: invokestatic k74/x/lllIlIII.IllII (II)I
      // 0e6: aaload
      // 0e7: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0ea: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 0ed: ldc_w -447652228
      // 0f0: iload 5
      // 0f2: ldc_w -715762913
      // 0f5: ixor
      // 0f6: invokestatic k74/x/lllIlIII.IllII (II)I
      // 0f9: aaload
      // 0fa: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0fd: astore 4
      // 0ff: astore 3
      // 100: new java/lang/StringBuilder
      // 103: dup
      // 104: invokespecial java/lang/StringBuilder.<init> ()V
      // 107: aload 3
      // 108: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 10b: aload 4
      // 10d: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 110: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 113: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 116: ifne 3d5
      // 119: goto 120
      // 11c: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11f: athrow
      // 120: aload 2
      // 121: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 124: ldc_w -447652225
      // 127: iload 5
      // 129: ldc_w -1189240332
      // 12c: ixor
      // 12d: invokestatic k74/x/lllIlIII.IllII (II)I
      // 130: aaload
      // 131: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 134: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 137: ifne 3d5
      // 13a: goto 141
      // 13d: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 140: athrow
      // 141: aload 2
      // 142: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 145: ldc_w -447652226
      // 148: iload 5
      // 14a: ldc_w -430657936
      // 14d: ixor
      // 14e: invokestatic k74/x/lllIlIII.IllII (II)I
      // 151: aaload
      // 152: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 155: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 158: ifne 3d5
      // 15b: goto 162
      // 15e: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 161: athrow
      // 162: aload 2
      // 163: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 166: ldc_w -447652231
      // 169: iload 5
      // 16b: ldc_w -1405356406
      // 16e: ixor
      // 16f: invokestatic k74/x/lllIlIII.IllII (II)I
      // 172: aaload
      // 173: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 176: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 179: ifne 3d5
      // 17c: goto 183
      // 17f: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 182: athrow
      // 183: aload 2
      // 184: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 187: ldc_w -447652232
      // 18a: iload 5
      // 18c: ldc_w 684061841
      // 18f: ixor
      // 190: invokestatic k74/x/lllIlIII.IllII (II)I
      // 193: aaload
      // 194: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 197: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 19a: ifne 3d5
      // 19d: goto 1a4
      // 1a0: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a3: athrow
      // 1a4: aload 2
      // 1a5: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 1a8: ldc_w -447652229
      // 1ab: iload 5
      // 1ad: ldc_w 1772334619
      // 1b0: ixor
      // 1b1: invokestatic k74/x/lllIlIII.IllII (II)I
      // 1b4: aaload
      // 1b5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1b8: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1bb: ifne 3d5
      // 1be: goto 1c5
      // 1c1: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c4: athrow
      // 1c5: aload 2
      // 1c6: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 1c9: ldc_w -447652230
      // 1cc: iload 5
      // 1ce: ldc_w -1798351832
      // 1d1: ixor
      // 1d2: invokestatic k74/x/lllIlIII.IllII (II)I
      // 1d5: aaload
      // 1d6: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1d9: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1dc: ifne 3d5
      // 1df: goto 1e6
      // 1e2: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e5: athrow
      // 1e6: aload 2
      // 1e7: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 1ea: ldc_w -447652235
      // 1ed: iload 5
      // 1ef: ldc_w -1551021381
      // 1f2: ixor
      // 1f3: invokestatic k74/x/lllIlIII.IllII (II)I
      // 1f6: aaload
      // 1f7: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1fa: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1fd: ifne 3d5
      // 200: goto 207
      // 203: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 206: athrow
      // 207: aload 2
      // 208: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 20b: ldc_w -447652236
      // 20e: iload 5
      // 210: ldc_w -24550026
      // 213: ixor
      // 214: invokestatic k74/x/lllIlIII.IllII (II)I
      // 217: aaload
      // 218: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 21b: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 21e: ifne 3d5
      // 221: goto 228
      // 224: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 227: athrow
      // 228: aload 2
      // 229: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 22c: ldc_w -447652233
      // 22f: iload 5
      // 231: ldc_w 1262124108
      // 234: ixor
      // 235: invokestatic k74/x/lllIlIII.IllII (II)I
      // 238: aaload
      // 239: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 23c: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 23f: ifne 3d5
      // 242: goto 249
      // 245: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 248: athrow
      // 249: aload 2
      // 24a: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 24d: ldc_w -447652234
      // 250: iload 5
      // 252: ldc_w -601450717
      // 255: ixor
      // 256: invokestatic k74/x/lllIlIII.IllII (II)I
      // 259: aaload
      // 25a: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 25d: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 260: ifne 3d5
      // 263: goto 26a
      // 266: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 269: athrow
      // 26a: aload 2
      // 26b: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 26e: ldc_w -447652239
      // 271: iload 5
      // 273: ldc_w 583853530
      // 276: ixor
      // 277: invokestatic k74/x/lllIlIII.IllII (II)I
      // 27a: aaload
      // 27b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 27e: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 281: ifne 3d5
      // 284: goto 28b
      // 287: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28a: athrow
      // 28b: aload 2
      // 28c: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 28f: ldc_w -447652240
      // 292: iload 5
      // 294: ldc_w 502456160
      // 297: ixor
      // 298: invokestatic k74/x/lllIlIII.IllII (II)I
      // 29b: aaload
      // 29c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 29f: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2a2: ifne 3d5
      // 2a5: goto 2ac
      // 2a8: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2ab: athrow
      // 2ac: aload 2
      // 2ad: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 2b0: ldc_w -447652237
      // 2b3: iload 5
      // 2b5: ldc_w -1601060586
      // 2b8: ixor
      // 2b9: invokestatic k74/x/lllIlIII.IllII (II)I
      // 2bc: aaload
      // 2bd: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 2c0: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 2c3: ifne 3d5
      // 2c6: goto 2cd
      // 2c9: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2cc: athrow
      // 2cd: aload 2
      // 2ce: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 2d1: ldc_w -447652238
      // 2d4: iload 5
      // 2d6: ldc_w -335363844
      // 2d9: ixor
      // 2da: invokestatic k74/x/lllIlIII.IllII (II)I
      // 2dd: aaload
      // 2de: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 2e1: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 2e4: ifne 3d5
      // 2e7: goto 2ee
      // 2ea: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2ed: athrow
      // 2ee: aload 2
      // 2ef: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 2f2: ldc_w -447652243
      // 2f5: iload 5
      // 2f7: ldc_w 765145380
      // 2fa: ixor
      // 2fb: invokestatic k74/x/lllIlIII.IllII (II)I
      // 2fe: aaload
      // 2ff: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 302: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 305: ifne 3d5
      // 308: goto 30f
      // 30b: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30e: athrow
      // 30f: aload 2
      // 310: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 313: ldc_w -447652244
      // 316: iload 5
      // 318: ldc_w 901802911
      // 31b: ixor
      // 31c: invokestatic k74/x/lllIlIII.IllII (II)I
      // 31f: aaload
      // 320: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 323: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 326: ifne 3d5
      // 329: goto 330
      // 32c: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 32f: athrow
      // 330: aload 2
      // 331: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 334: ldc_w -447652241
      // 337: iload 5
      // 339: ldc_w -148472993
      // 33c: ixor
      // 33d: invokestatic k74/x/lllIlIII.IllII (II)I
      // 340: aaload
      // 341: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 344: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 347: ifne 3d5
      // 34a: goto 351
      // 34d: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 350: athrow
      // 351: aload 2
      // 352: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 355: ldc_w -447652242
      // 358: iload 5
      // 35a: ldc_w 295961010
      // 35d: ixor
      // 35e: invokestatic k74/x/lllIlIII.IllII (II)I
      // 361: aaload
      // 362: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 365: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 368: ifne 3d5
      // 36b: goto 372
      // 36e: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 371: athrow
      // 372: aload 2
      // 373: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 376: ldc_w -447652247
      // 379: iload 5
      // 37b: ldc_w 1471631988
      // 37e: ixor
      // 37f: invokestatic k74/x/lllIlIII.IllII (II)I
      // 382: aaload
      // 383: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 386: invokevirtual java/lang/String.startsWith (Ljava/lang/String;)Z
      // 389: ifne 3d5
      // 38c: goto 393
      // 38f: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 392: athrow
      // 393: aload 2
      // 394: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 397: ldc_w -447652248
      // 39a: iload 5
      // 39c: ldc_w -1551026258
      // 39f: ixor
      // 3a0: invokestatic k74/x/lllIlIII.IllII (II)I
      // 3a3: aaload
      // 3a4: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 3a7: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 3aa: ifne 3d5
      // 3ad: goto 3b4
      // 3b0: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3b3: athrow
      // 3b4: aload 2
      // 3b5: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 3b8: ldc_w -447652245
      // 3bb: iload 5
      // 3bd: ldc_w 377386941
      // 3c0: ixor
      // 3c1: invokestatic k74/x/lllIlIII.IllII (II)I
      // 3c4: aaload
      // 3c5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 3c8: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 3cb: ifeq 3dd
      // 3ce: goto 3d5
      // 3d1: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3d4: athrow
      // 3d5: bipush 1
      // 3d6: goto 3de
      // 3d9: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3dc: athrow
      // 3dd: bipush 0
      // 3de: ireturn
   }

   private double IIIIl(class_1799 var1) {
      String var2 = IlIl(var1);
      double var3 = this.II(var2) + this.IIll(var1) + this.lll(var1);

      label26: {
         label25: {
            try {
               if (var1.method_7963() && var1.method_7936() > 0) {
                  break label25;
               }
            } catch (MatchException var5) {
               throw Ill(var5);
            }

            var3 += 100.0;
            break label26;
         }

         var3 += 100.0 * ((double)(var1.method_7936() - var1.method_7919()) / var1.method_7936());
      }

      if (var2.equals(IlIIllIII.lI(lI[IllII(-447652246, -2102644783 ^ -1510790961)]))) {
         var3 += 450.0;
      }

      return var3;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private double IIIlI(String var1) {
      int var5 = 961647415;
      String var3 = var1;
      String[] var10000 = IIllllIl.IIIIl();
      int var4 = -1;
      String[] var2 = var10000;

      label328: {
         label329: {
            label330: {
               label331: {
                  label332: {
                     label333: {
                        label334: {
                           label335: {
                              label336: {
                                 label337: {
                                    label338: {
                                       label339: {
                                          label340: {
                                             label341: {
                                                label342: {
                                                   label343: {
                                                      label344: {
                                                         label345: {
                                                            try {
                                                               switch (var3.hashCode()) {
                                                                  case -1684858151:
                                                                     break label344;
                                                                  case -1571105471:
                                                                     break label343;
                                                                  case -1380923823:
                                                                     break label330;
                                                                  case -1056264474:
                                                                     break label332;
                                                                  case -720514431:
                                                                     break label336;
                                                                  case -677216191:
                                                                     break label340;
                                                                  case 97513267:
                                                                     break label335;
                                                                  case 106858757:
                                                                     break label341;
                                                                  case 107028782:
                                                                     break label334;
                                                                  case 173173288:
                                                                     break label337;
                                                                  case 350056506:
                                                                     break label339;
                                                                  case 620514517:
                                                                     break label338;
                                                                  case 949868500:
                                                                     if (!var3.equals(lI[IllII(-447652251, var5 ^ 604979137)])) {
                                                                        break label328;
                                                                     }
                                                                     break;
                                                                  case 961218153:
                                                                     break label342;
                                                                  case 976288699:
                                                                     break label333;
                                                                  case 1386075689:
                                                                     break label329;
                                                                  case 1552717032:
                                                                     break label331;
                                                                  case 1603571740:
                                                                     break label345;
                                                                  default:
                                                                     break label328;
                                                               }
                                                            } catch (MatchException var41) {
                                                               throw Ill(var41);
                                                            }

                                                            var4 = 0;

                                                            try {
                                                               if (var2 == null) {
                                                                  break label328;
                                                               }
                                                            } catch (MatchException var40) {
                                                               throw Ill(var40);
                                                            }
                                                         }

                                                         try {
                                                            if (!var3.equals(lI[IllII(-447652252, var5 ^ 1407786529)])) {
                                                               break label328;
                                                            }
                                                         } catch (MatchException var39) {
                                                            throw Ill(var39);
                                                         }

                                                         var4 = 1;

                                                         try {
                                                            if (var2 == null) {
                                                               break label328;
                                                            }
                                                         } catch (MatchException var38) {
                                                            throw Ill(var38);
                                                         }
                                                      }

                                                      try {
                                                         if (!var3.equals(lI[IllII(-447652249, var5 ^ -247855389)])) {
                                                            break label328;
                                                         }
                                                      } catch (MatchException var37) {
                                                         throw Ill(var37);
                                                      }

                                                      var4 = 2;

                                                      try {
                                                         if (var2 == null) {
                                                            break label328;
                                                         }
                                                      } catch (MatchException var36) {
                                                         throw Ill(var36);
                                                      }
                                                   }

                                                   try {
                                                      if (!var3.equals(lI[IllII(-447652250, var5 ^ 946004904)])) {
                                                         break label328;
                                                      }
                                                   } catch (MatchException var35) {
                                                      throw Ill(var35);
                                                   }

                                                   var4 = 3;

                                                   try {
                                                      if (var2 == null) {
                                                         break label328;
                                                      }
                                                   } catch (MatchException var34) {
                                                      throw Ill(var34);
                                                   }
                                                }

                                                try {
                                                   if (!var3.equals(lI[IllII(-447652255, var5 ^ 1883853382)])) {
                                                      break label328;
                                                   }
                                                } catch (MatchException var33) {
                                                   throw Ill(var33);
                                                }

                                                var4 = 4;

                                                try {
                                                   if (var2 == null) {
                                                      break label328;
                                                   }
                                                } catch (MatchException var32) {
                                                   throw Ill(var32);
                                                }
                                             }

                                             try {
                                                if (!var3.equals(lI[IllII(-447652256, var5 ^ -218277106)])) {
                                                   break label328;
                                                }
                                             } catch (MatchException var31) {
                                                throw Ill(var31);
                                             }

                                             var4 = 5;

                                             try {
                                                if (var2 == null) {
                                                   break label328;
                                                }
                                             } catch (MatchException var30) {
                                                throw Ill(var30);
                                             }
                                          }

                                          try {
                                             if (!var3.equals(lI[IllII(-447652253, var5 ^ -161570872)])) {
                                                break label328;
                                             }
                                          } catch (MatchException var29) {
                                             throw Ill(var29);
                                          }

                                          var4 = IllII(-447652254, var5 ^ 1548862046);

                                          try {
                                             if (var2 == null) {
                                                break label328;
                                             }
                                          } catch (MatchException var28) {
                                             throw Ill(var28);
                                          }
                                       }

                                       try {
                                          if (!var3.equals(lI[IllII(-447652195, var5 ^ -1134821660)])) {
                                             break label328;
                                          }
                                       } catch (MatchException var27) {
                                          throw Ill(var27);
                                       }

                                       var4 = IllII(-447652196, var5 ^ -1619807875);

                                       try {
                                          if (var2 == null) {
                                             break label328;
                                          }
                                       } catch (MatchException var26) {
                                          throw Ill(var26);
                                       }
                                    }

                                    try {
                                       if (!var3.equals(lI[IllII(-447652193, var5 ^ 1458687283)])) {
                                          break label328;
                                       }
                                    } catch (MatchException var25) {
                                       throw Ill(var25);
                                    }

                                    var4 = IllII(-447652194, var5 ^ -2110234016);

                                    try {
                                       if (var2 == null) {
                                          break label328;
                                       }
                                    } catch (MatchException var24) {
                                       throw Ill(var24);
                                    }
                                 }

                                 try {
                                    if (!var3.equals(lI[IllII(-447652199, var5 ^ 817929248)])) {
                                       break label328;
                                    }
                                 } catch (MatchException var23) {
                                    throw Ill(var23);
                                 }

                                 var4 = IllII(-447652200, var5 ^ 1161070516);

                                 try {
                                    if (var2 == null) {
                                       break label328;
                                    }
                                 } catch (MatchException var22) {
                                    throw Ill(var22);
                                 }
                              }

                              try {
                                 if (!var3.equals(lI[IllII(-447652197, var5 ^ 2011359669)])) {
                                    break label328;
                                 }
                              } catch (MatchException var21) {
                                 throw Ill(var21);
                              }

                              var4 = IllII(-447652198, var5 ^ 639379100);

                              try {
                                 if (var2 == null) {
                                    break label328;
                                 }
                              } catch (MatchException var20) {
                                 throw Ill(var20);
                              }
                           }

                           try {
                              if (!var3.equals(lI[IllII(-447652203, var5 ^ -1555340850)])) {
                                 break label328;
                              }
                           } catch (MatchException var19) {
                              throw Ill(var19);
                           }

                           var4 = IllII(-447652204, var5 ^ 1649242504);

                           try {
                              if (var2 == null) {
                                 break label328;
                              }
                           } catch (MatchException var18) {
                              throw Ill(var18);
                           }
                        }

                        try {
                           if (!var3.equals(lI[IllII(-447652201, var5 ^ -1579224930)])) {
                              break label328;
                           }
                        } catch (MatchException var17) {
                           throw Ill(var17);
                        }

                        var4 = IllII(-447652202, var5 ^ 614670312);

                        try {
                           if (var2 == null) {
                              break label328;
                           }
                        } catch (MatchException var16) {
                           throw Ill(var16);
                        }
                     }

                     try {
                        if (!var3.equals(lI[IllII(-447652207, var5 ^ -599811405)])) {
                           break label328;
                        }
                     } catch (MatchException var15) {
                        throw Ill(var15);
                     }

                     var4 = IllII(-447652208, var5 ^ 746366418);

                     try {
                        if (var2 == null) {
                           break label328;
                        }
                     } catch (MatchException var14) {
                        throw Ill(var14);
                     }
                  }

                  try {
                     if (!var3.equals(lI[IllII(-447652205, var5 ^ -748171795)])) {
                        break label328;
                     }
                  } catch (MatchException var13) {
                     throw Ill(var13);
                  }

                  var4 = IllII(-447652206, var5 ^ -1045808074);

                  try {
                     if (var2 == null) {
                        break label328;
                     }
                  } catch (MatchException var12) {
                     throw Ill(var12);
                  }
               }

               try {
                  if (!var3.equals(lI[IllII(-447652211, var5 ^ 412850707)])) {
                     break label328;
                  }
               } catch (MatchException var11) {
                  throw Ill(var11);
               }

               var4 = IllII(-447652212, var5 ^ -1761633946);

               try {
                  if (var2 == null) {
                     break label328;
                  }
               } catch (MatchException var10) {
                  throw Ill(var10);
               }
            }

            try {
               if (!var3.equals(lI[IllII(-447652209, var5 ^ 803893974)])) {
                  break label328;
               }
            } catch (MatchException var9) {
               throw Ill(var9);
            }

            var4 = IllII(-447652210, var5 ^ -432120998);

            try {
               if (var2 == null) {
                  break label328;
               }
            } catch (MatchException var8) {
               throw Ill(var8);
            }
         }

         try {
            if (!var3.equals(lI[IllII(-447652215, var5 ^ 723058888)])) {
               break label328;
            }
         } catch (MatchException var7) {
            throw Ill(var7);
         }

         var4 = IllII(-447652216, var5 ^ -388772638);
      }

      try {
         switch (var4) {
            case 0:
               return 36.0;
            case 1:
               return 22.0;
            case 2:
               return 26.0;
            case 3:
            case 4:
            case 5:
               return 24.0;
            case 6:
            case 7:
            case 8:
            case 9:
               return 20.0;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
               return 14.0;
         }
      } catch (MatchException var6) {
         throw Ill(var6);
      }

      return 8.0;
   }

   private IllIIlll IIIll(class_746 param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aconst_null
      // 01: astore 3
      // 02: getstatic k74/x/lllIlIII.IlIl [I
      // 05: astore 4
      // 07: aload 4
      // 09: arraylength
      // 0a: istore 5
      // 0c: bipush 0
      // 0d: istore 6
      // 0f: iload 6
      // 11: iload 5
      // 13: if_icmpge 8d
      // 16: aload 4
      // 18: iload 6
      // 1a: iaload
      // 1b: istore 7
      // 1d: aload 0
      // 1e: aload 1
      // 1f: iload 7
      // 21: invokevirtual k74/x/lllIlIII.IIlI (Lnet/minecraft/class_746;I)Lnet/minecraft/class_1799;
      // 24: astore 8
      // 26: aload 8
      // 28: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 2b: ifne 87
      // 2e: aload 0
      // 2f: aload 8
      // 31: invokevirtual k74/x/lllIlIII.III (Lnet/minecraft/class_1799;)Z
      // 34: ifne 87
      // 37: goto 3e
      // 3a: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3d: athrow
      // 3e: aload 2
      // 3f: aload 0
      // 40: aload 8
      // 42: invokevirtual k74/x/lllIlIII.IllI (Lnet/minecraft/class_1799;)Ljava/lang/String;
      // 45: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 48: ifne 59
      // 4b: goto 52
      // 4e: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 51: athrow
      // 52: goto 87
      // 55: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 58: athrow
      // 59: new k74/x/IllIIlll
      // 5c: dup
      // 5d: iload 7
      // 5f: aload 0
      // 60: aload 8
      // 62: invokevirtual k74/x/lllIlIII.IIIIl (Lnet/minecraft/class_1799;)D
      // 65: aload 0
      // 66: iload 7
      // 68: invokevirtual k74/x/lllIlIII.Il (I)I
      // 6b: invokespecial k74/x/IllIIlll.<init> (IDI)V
      // 6e: astore 9
      // 70: aload 3
      // 71: ifnull 84
      // 74: aload 9
      // 76: aload 3
      // 77: invokevirtual k74/x/IllIIlll.II (Lk74/x/IllIIlll;)Z
      // 7a: ifeq 87
      // 7d: goto 84
      // 80: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 83: athrow
      // 84: aload 9
      // 86: astore 3
      // 87: iinc 6 1
      // 8a: goto 0f
      // 8d: aload 3
      // 8e: areturn
   }

   private static String IIlII(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   private String IIllI(String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc_w -1448320823
      // 03: istore 2
      // 04: aload 1
      // 05: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 08: ldc_w -447652213
      // 0b: iload 2
      // 0c: ldc_w 674577241
      // 0f: ixor
      // 10: invokestatic k74/x/lllIlIII.IllII (II)I
      // 13: aaload
      // 14: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 17: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 1a: ifeq 2a
      // 1d: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 20: bipush 5
      // 21: aaload
      // 22: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 25: areturn
      // 26: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 29: athrow
      // 2a: aload 1
      // 2b: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 2e: bipush 0
      // 2f: aaload
      // 30: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 33: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 36: ifne 4f
      // 39: aload 1
      // 3a: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 3d: bipush 4
      // 3e: aaload
      // 3f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 42: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 45: ifeq 5c
      // 48: goto 4f
      // 4b: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4e: athrow
      // 4f: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 52: bipush 2
      // 53: aaload
      // 54: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 57: areturn
      // 58: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5b: athrow
      // 5c: aload 1
      // 5d: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 60: bipush 3
      // 61: aaload
      // 62: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 65: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 68: ifeq 82
      // 6b: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 6e: ldc_w -447652214
      // 71: iload 2
      // 72: ldc_w -1983457143
      // 75: ixor
      // 76: invokestatic k74/x/lllIlIII.IllII (II)I
      // 79: aaload
      // 7a: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 7d: areturn
      // 7e: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 81: athrow
      // 82: aload 1
      // 83: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 86: bipush 1
      // 87: aaload
      // 88: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 8b: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // 8e: ifeq a8
      // 91: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // 94: ldc_w -447652219
      // 97: iload 2
      // 98: ldc_w -163203181
      // 9b: ixor
      // 9c: invokestatic k74/x/lllIlIII.IllII (II)I
      // 9f: aaload
      // a0: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // a3: areturn
      // a4: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a7: athrow
      // a8: aload 1
      // a9: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // ac: ldc_w -447652220
      // af: iload 2
      // b0: ldc_w -58108211
      // b3: ixor
      // b4: invokestatic k74/x/lllIlIII.IllII (II)I
      // b7: aaload
      // b8: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // bb: invokevirtual java/lang/String.endsWith (Ljava/lang/String;)Z
      // be: ifeq d8
      // c1: getstatic k74/x/lllIlIII.lI [Ljava/lang/String;
      // c4: ldc_w -447652217
      // c7: iload 2
      // c8: ldc_w 718572641
      // cb: ixor
      // cc: invokestatic k74/x/lllIlIII.IllII (II)I
      // cf: aaload
      // d0: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // d3: areturn
      // d4: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // d7: athrow
      // d8: aconst_null
      // d9: areturn
   }

   private static boolean IIlll(int param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: iload 0
      // 01: bipush 5
      // 02: if_icmplt 1d
      // 05: iload 0
      // 06: ldc_w -447652218
      // 09: ldc_w -312073086
      // 0c: ldc_w 338450594
      // 0f: ixor
      // 10: invokestatic k74/x/lllIlIII.IllII (II)I
      // 13: if_icmple 35
      // 16: goto 1d
      // 19: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: iload 0
      // 1e: ldc_w -447652223
      // 21: ldc_w -312073086
      // 24: ldc_w 157510709
      // 27: ixor
      // 28: invokestatic k74/x/lllIlIII.IllII (II)I
      // 2b: if_icmpne 3d
      // 2e: goto 35
      // 31: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 34: athrow
      // 35: bipush 1
      // 36: goto 3e
      // 39: invokestatic k74/x/lllIlIII.Ill (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3c: athrow
      // 3d: bipush 0
      // 3e: ireturn
   }
}
