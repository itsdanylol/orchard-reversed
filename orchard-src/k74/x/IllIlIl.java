package k74.x;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IllIlIl extends IIllllIl<List<String>> {
   private static final String[] lll;
   private static final String[] I;
   private final List<IIIlIlIl> II;
   private List<IIIlIlIl> Il;
   private static final int[] l;
   private final IIIlIlIl lI;
   private static final Object[] IIII;
   private static final String[] ll;

   public void I(int var1) {
      ArrayList var2 = new ArrayList<>(this.Il);
      if (var1 >= 0 && var1 < var2.size()) {
         var2.remove(var1);
         this.IIll(var2);
      }
   }

   @Override
   public JsonElement IIl() {
      JsonArray var1 = new JsonArray();

      for (IIIlIlIl var3 : this.Il) {
         var1.add(new JsonPrimitive(var3.llIl()));
      }

      return var1;
   }

   private static String II(String var0) {
      return var0 == null ? "" : var0.trim();
   }

   public void lI(String var1) {
      if (var1 != null) {
         ArrayList var2 = new ArrayList<>(this.Il);
         if (var2.removeIf(IllIlIl::lll)) {
            this.IIll(var2);
         }
      }
   }

   public IllIlIl(Object var1, Collection<?> var2) {
      this(var1, var2, IlIIllIII.Ill(IIII(IIIll(-816108748, -346595759 ^ 922847954), IIIll(-816108747, -346595759 ^ -161284111))));
   }

   private static boolean III(List<IIIlIlIl> var0, List<IIIlIlIl> var1) {
      if (var0 == var1) {
         return true;
      } else if (var0 != null && var1 != null && var0.size() == var1.size()) {
         for (int var2 = 0; var2 < var0.size(); var2++) {
            if (!((IIIlIlIl)var0.get(var2)).lll((IIIlIlIl)var1.get(var2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public IllIlIl(String var1, Collection<?> var2, String var3) {
      this((Object)var1, var2, var3);
   }

   public void IlI(String var1) {
      String var2 = II(var1);
      if (!var2.isEmpty()) {
         ArrayList var3 = new ArrayList<>(this.Il);
         var3.add(IlIIllIII.lII(var2));
         this.IIll(var3);
      }
   }

   public void Ill(String var1, int var2) {
      String var3 = II(var1);
      if (!var3.isEmpty()) {
         ArrayList var4 = new ArrayList<>(this.Il);
         var4.add(0, IlIIllIII.lII(var3));
         int var5 = Math.max(0, var2);

         while (var4.size() > var5) {
            var4.remove(var4.size() - 1);
         }

         this.IIll(var4);
      }
   }

   public void lII(List<String> var1) {
      this.IIll(IlII(var1));
   }

   public List<IIIlIlIl> lIl() {
      return this.Il;
   }

   @Override
   public void Illl() {
      this.IIll(this.II);
   }

   public IllIlIl(Object var1, Collection<?> var2, Object var3) {
      super(var1, List.of());
      this.II = IlII(var2);
      this.Il = this.II;
      this.lI = var3 instanceof IIIlIlIl var4
         ? var4
         : IlIIllIII.lII(
            var3 != null && !var3.toString().isBlank()
               ? var3.toString()
               : IlIIllIII.lI(IIII(IIIll(-816108746, -317819998 ^ 1490855414), IIIll(-816108745, -317819998 ^ -2094271511)))
         );
   }

   public void llI(int var1, String var2) {
      ArrayList var3 = new ArrayList<>(this.Il);
      if (var1 >= 0 && var1 < var3.size()) {
         String var4 = II(var2);
         if (var4.isEmpty()) {
            var3.remove(var1);
         } else {
            var3.set(var1, IlIIllIII.lII(var4));
         }

         this.IIll(var3);
      }
   }

   @Override
   public void ll(JsonElement var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 == null || var1.isJsonNull()) {
         this.lII(List.of());
      } else if (!var1.isJsonArray()) {
         if (var1.isJsonPrimitive()) {
            this.lII(llIllIlI.l(var1.getAsString(), this.lI.llIl()));
         }
      } else {
         ArrayList var3 = new ArrayList();

         for (JsonElement var5 : var1.getAsJsonArray()) {
            if (var5 != null && var5.isJsonPrimitive()) {
               var3.add(var5.getAsString());
            }

            if (var2 != null) {
               break;
            }
         }

         this.lII(var3);
      }
   }

   private static boolean lll(String var0, IIIlIlIl var1) {
      return var1.Illl(var0);
   }

   private static String IIII(int var0, int var1) {
      int var9 = 410098082;
      int var2 = (var0 ^ IIIll(-816108752, var9 ^ 736116585)) & IIIll(-816108751, var9 ^ 1474748775);
      if (ll[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & IIIll(-816108750, var9 ^ -1509345445)) {
            case 0 -> IIIll(-816108749, var9 ^ 793709229);
            case 1 -> IIIll(-816108740, var9 ^ -317913400);
            case 2 -> IIIll(-816108739, var9 ^ 654922256);
            case 3 -> IIIll(-816108738, var9 ^ 1124923480);
            case 4 -> IIIll(-816108737, var9 ^ 458778397);
            case 5 -> IIIll(-816108744, var9 ^ 162722056);
            case 6 -> IIIll(-816108743, var9 ^ -1335389267);
            case 7 -> IIIll(-816108742, var9 ^ -1075070691);
            case 8 -> IIIll(-816108741, var9 ^ 2066540223);
            case 9 -> IIIll(-816108764, var9 ^ -246863706);
            case 10 -> IIIll(-816108763, var9 ^ -1823954383);
            case 11 -> IIIll(-816108762, var9 ^ 2107982996);
            case 12 -> IIIll(-816108761, var9 ^ -1550125752);
            case 13 -> IIIll(-816108768, var9 ^ 308472779);
            case 14 -> IIIll(-816108767, var9 ^ -823631081);
            case 15 -> IIIll(-816108766, var9 ^ 35662630);
            case 16 -> IIIll(-816108765, var9 ^ -102895312);
            case 17 -> IIIll(-816108756, var9 ^ 707244828);
            case 18 -> IIIll(-816108755, var9 ^ -14861068);
            case 19 -> IIIll(-816108754, var9 ^ 104271590);
            case 20 -> IIIll(-816108753, var9 ^ -581530153);
            case 21 -> IIIll(-816108760, var9 ^ -42491232);
            case 22 -> IIIll(-816108759, var9 ^ -729741810);
            case 23 -> IIIll(-816108758, var9 ^ -527759051);
            case 24 -> IIIll(-816108757, var9 ^ -603434145);
            case 25 -> IIIll(-816108780, var9 ^ 2096589115);
            case 26 -> IIIll(-816108779, var9 ^ -722058084);
            case 27 -> IIIll(-816108778, var9 ^ -1154445535);
            case 28 -> IIIll(-816108777, var9 ^ -983326585);
            case 29 -> IIIll(-816108784, var9 ^ 555394946);
            case 30 -> IIIll(-816108783, var9 ^ 1459009962);
            case 31 -> IIIll(-816108782, var9 ^ 1980353937);
            case 32 -> IIIll(-816108781, var9 ^ -1165234802);
            case 33 -> IIIll(-816108772, var9 ^ -311699695);
            case 34 -> IIIll(-816108771, var9 ^ -1528283288);
            case 35 -> IIIll(-816108770, var9 ^ 1966866391);
            case 36 -> IIIll(-816108769, var9 ^ 1070088188);
            case 37 -> IIIll(-816108776, var9 ^ 1289116289);
            case 38 -> IIIll(-816108775, var9 ^ -800545577);
            case 39 -> IIIll(-816108774, var9 ^ 1286044208);
            case 40 -> IIIll(-816108773, var9 ^ 143720602);
            case 41 -> IIIll(-816108796, var9 ^ -370465754);
            case 42 -> IIIll(-816108795, var9 ^ -894503750);
            case 43 -> IIIll(-816108794, var9 ^ -1866180290);
            case 44 -> IIIll(-816108793, var9 ^ 1830097824);
            case 45 -> IIIll(-816108800, var9 ^ 1911219286);
            case 46 -> IIIll(-816108799, var9 ^ -1105665562);
            case 47 -> IIIll(-816108798, var9 ^ 2032617636);
            case 48 -> IIIll(-816108797, var9 ^ 1659683378);
            case 49 -> IIIll(-816108788, var9 ^ -1478087628);
            case 50 -> IIIll(-816108787, var9 ^ -1813082540);
            case 51 -> IIIll(-816108786, var9 ^ 1192823501);
            case 52 -> IIIll(-816108785, var9 ^ -84979706);
            case 53 -> IIIll(-816108792, var9 ^ 125943758);
            case 54 -> IIIll(-816108791, var9 ^ 1902888821);
            case 55 -> IIIll(-816108790, var9 ^ 116982799);
            case 56 -> IIIll(-816108789, var9 ^ 795759603);
            case 57 -> IIIll(-816108684, var9 ^ 1706667725);
            case 58 -> IIIll(-816108683, var9 ^ -212872668);
            case 59 -> IIIll(-816108682, var9 ^ -1659897092);
            case 60 -> IIIll(-816108681, var9 ^ 718052590);
            case 61 -> IIIll(-816108688, var9 ^ 1041459535);
            case 62 -> IIIll(-816108687, var9 ^ 63308067);
            case 63 -> IIIll(-816108686, var9 ^ 407026873);
            case 64 -> IIIll(-816108685, var9 ^ -426900874);
            case 65 -> IIIll(-816108676, var9 ^ 349376028);
            case 66 -> IIIll(-816108675, var9 ^ -1206002723);
            case 67 -> IIIll(-816108674, var9 ^ 342312396);
            case 68 -> IIIll(-816108673, var9 ^ -1226669226);
            case 69 -> IIIll(-816108680, var9 ^ 1928864305);
            case 70 -> IIIll(-816108679, var9 ^ 1153562665);
            case 71 -> IIIll(-816108678, var9 ^ -1973016400);
            case 72 -> IIIll(-816108677, var9 ^ 1918370860);
            case 73 -> IIIll(-816108700, var9 ^ 1481545327);
            case 74 -> IIIll(-816108699, var9 ^ 126193740);
            case 75 -> IIIll(-816108698, var9 ^ -412671583);
            case 76 -> IIIll(-816108697, var9 ^ 387691648);
            case 77 -> IIIll(-816108704, var9 ^ 1623159923);
            case 78 -> IIIll(-816108703, var9 ^ 805799521);
            case 79 -> IIIll(-816108702, var9 ^ 681899414);
            case 80 -> 2;
            case 81 -> IIIll(-816108701, var9 ^ 156782973);
            case 82 -> IIIll(-816108692, var9 ^ 1972787327);
            case 83 -> IIIll(-816108691, var9 ^ 1829718885);
            case 84 -> IIIll(-816108690, var9 ^ 347378978);
            case 85 -> IIIll(-816108689, var9 ^ 959280468);
            case 86 -> IIIll(-816108696, var9 ^ 1783282739);
            case 87 -> IIIll(-816108695, var9 ^ -465380780);
            case 88 -> IIIll(-816108694, var9 ^ 671059053);
            case 89 -> IIIll(-816108693, var9 ^ -1596094567);
            case 90 -> IIIll(-816108716, var9 ^ 469607189);
            case 91 -> IIIll(-816108715, var9 ^ -1293799028);
            case 92 -> IIIll(-816108714, var9 ^ 1250595966);
            case 93 -> IIIll(-816108713, var9 ^ -2127514644);
            case 94 -> IIIll(-816108720, var9 ^ 281633677);
            case 95 -> IIIll(-816108719, var9 ^ -1529312525);
            case 96 -> IIIll(-816108718, var9 ^ 1111444100);
            case 97 -> IIIll(-816108717, var9 ^ -1812714229);
            case 98 -> IIIll(-816108708, var9 ^ 1152525231);
            case 99 -> IIIll(-816108707, var9 ^ -1843420017);
            case 100 -> IIIll(-816108706, var9 ^ 529094201);
            case 101 -> IIIll(-816108705, var9 ^ 891442338);
            case 102 -> IIIll(-816108712, var9 ^ -1865347209);
            case 103 -> IIIll(-816108711, var9 ^ 192045843);
            case 104 -> IIIll(-816108710, var9 ^ 1405461952);
            case 105 -> IIIll(-816108709, var9 ^ -243728493);
            case 106 -> IIIll(-816108732, var9 ^ 1795130153);
            case 107 -> IIIll(-816108731, var9 ^ -2136405999);
            case 108 -> IIIll(-816108730, var9 ^ 330313735);
            case 109 -> IIIll(-816108729, var9 ^ 1587596321);
            case 110 -> IIIll(-816108736, var9 ^ -289965068);
            case 111 -> IIIll(-816108735, var9 ^ 93036557);
            case 112 -> IIIll(-816108734, var9 ^ 1177213345);
            case 113 -> IIIll(-816108733, var9 ^ 77674284);
            case 114 -> IIIll(-816108724, var9 ^ 617439315);
            case 115 -> IIIll(-816108723, var9 ^ -1993899410);
            case 116 -> IIIll(-816108722, var9 ^ -757735332);
            case 117 -> IIIll(-816108721, var9 ^ 1549152757);
            case 118 -> IIIll(-816108728, var9 ^ -878498450);
            case 119 -> IIIll(-816108727, var9 ^ 1938899528);
            case 120 -> IIIll(-816108726, var9 ^ -1391155);
            case 121 -> IIIll(-816108725, var9 ^ -1302450571);
            case 122 -> IIIll(-816108620, var9 ^ -2060720726);
            case 123 -> IIIll(-816108619, var9 ^ 728088224);
            case 124 -> IIIll(-816108618, var9 ^ 1591773138);
            case 125 -> IIIll(-816108617, var9 ^ -1418982244);
            case 126 -> IIIll(-816108624, var9 ^ 195139143);
            case 127 -> IIIll(-816108623, var9 ^ 1361271177);
            case 128 -> IIIll(-816108622, var9 ^ 340245412);
            case 129 -> IIIll(-816108621, var9 ^ -319821926);
            case 130 -> IIIll(-816108612, var9 ^ -71812585);
            case 131 -> IIIll(-816108611, var9 ^ 2140955612);
            case 132 -> IIIll(-816108610, var9 ^ 1911654636);
            case 133 -> IIIll(-816108609, var9 ^ 2024445154);
            case 134 -> IIIll(-816108616, var9 ^ 261692146);
            case 135 -> IIIll(-816108615, var9 ^ -1817959319);
            case 136 -> IIIll(-816108614, var9 ^ -1137589268);
            case 137 -> IIIll(-816108613, var9 ^ 71534262);
            case 138 -> IIIll(-816108636, var9 ^ 467764126);
            case 139 -> IIIll(-816108635, var9 ^ -1198903135);
            case 140 -> IIIll(-816108634, var9 ^ -1728166248);
            case 141 -> IIIll(-816108633, var9 ^ -2083529489);
            case 142 -> IIIll(-816108640, var9 ^ -337144205);
            case 143 -> IIIll(-816108639, var9 ^ 2124777631);
            case 144 -> IIIll(-816108638, var9 ^ -2043737346);
            case 145 -> IIIll(-816108637, var9 ^ 1308531375);
            case 146 -> 0;
            case 147 -> IIIll(-816108628, var9 ^ -397120554);
            case 148 -> IIIll(-816108627, var9 ^ 1474677381);
            case 149 -> IIIll(-816108626, var9 ^ -510236523);
            case 150 -> IIIll(-816108625, var9 ^ 846257849);
            case 151 -> IIIll(-816108632, var9 ^ 1207845339);
            case 152 -> IIIll(-816108631, var9 ^ -299574097);
            case 153 -> IIIll(-816108630, var9 ^ -1373275115);
            case 154 -> IIIll(-816108629, var9 ^ -1724345526);
            case 155 -> IIIll(-816108652, var9 ^ 547356021);
            case 156 -> IIIll(-816108651, var9 ^ 243598959);
            case 157 -> IIIll(-816108650, var9 ^ -1265168651);
            case 158 -> IIIll(-816108649, var9 ^ 1339468987);
            case 159 -> IIIll(-816108656, var9 ^ 681276221);
            case 160 -> IIIll(-816108655, var9 ^ 2122049963);
            case 161 -> IIIll(-816108654, var9 ^ 1590281733);
            case 162 -> IIIll(-816108653, var9 ^ 985216462);
            case 163 -> 5;
            case 164 -> IIIll(-816108644, var9 ^ 42303463);
            case 165 -> IIIll(-816108643, var9 ^ 128139161);
            case 166 -> IIIll(-816108642, var9 ^ 1457446415);
            case 167 -> IIIll(-816108641, var9 ^ -1360363951);
            case 168 -> IIIll(-816108648, var9 ^ -828296389);
            case 169 -> IIIll(-816108647, var9 ^ -1118973002);
            case 170 -> IIIll(-816108646, var9 ^ -54126792);
            case 171 -> IIIll(-816108645, var9 ^ -1286425403);
            case 172 -> IIIll(-816108668, var9 ^ 1412138613);
            case 173 -> IIIll(-816108667, var9 ^ 516186043);
            case 174 -> IIIll(-816108666, var9 ^ -222976994);
            case 175 -> IIIll(-816108665, var9 ^ -458179747);
            case 176 -> IIIll(-816108672, var9 ^ -1730843634);
            case 177 -> IIIll(-816108671, var9 ^ 234823658);
            case 178 -> IIIll(-816108670, var9 ^ -1833477558);
            case 179 -> IIIll(-816108669, var9 ^ 926171593);
            case 180 -> IIIll(-816108660, var9 ^ 556240242);
            case 181 -> IIIll(-816108659, var9 ^ -1368270832);
            case 182 -> IIIll(-816108658, var9 ^ 2017980865);
            case 183 -> IIIll(-816108657, var9 ^ -586668286);
            case 184 -> IIIll(-816108664, var9 ^ 1319165054);
            case 185 -> IIIll(-816108663, var9 ^ -643198328);
            case 186 -> IIIll(-816108662, var9 ^ -1469339646);
            case 187 -> IIIll(-816108661, var9 ^ 1471633869);
            case 188 -> IIIll(-816108556, var9 ^ 406625071);
            case 189 -> IIIll(-816108555, var9 ^ 472791009);
            case 190 -> IIIll(-816108554, var9 ^ -85353367);
            case 191 -> IIIll(-816108553, var9 ^ 131194135);
            case 192 -> IIIll(-816108560, var9 ^ 1211278948);
            case 193 -> IIIll(-816108559, var9 ^ 891994840);
            case 194 -> IIIll(-816108558, var9 ^ -2142364892);
            case 195 -> 1;
            case 196 -> IIIll(-816108557, var9 ^ 1820274662);
            case 197 -> IIIll(-816108548, var9 ^ 905900410);
            case 198 -> IIIll(-816108547, var9 ^ 1110046235);
            case 199 -> IIIll(-816108546, var9 ^ -2127324578);
            case 200 -> IIIll(-816108545, var9 ^ -1979498831);
            case 201 -> 3;
            case 202 -> IIIll(-816108552, var9 ^ 1131557744);
            case 203 -> IIIll(-816108551, var9 ^ 565599187);
            case 204 -> IIIll(-816108550, var9 ^ 802131886);
            case 205 -> IIIll(-816108549, var9 ^ 752724845);
            case 206 -> IIIll(-816108572, var9 ^ 1165407343);
            case 207 -> IIIll(-816108571, var9 ^ -714012897);
            case 208 -> IIIll(-816108570, var9 ^ -859125007);
            case 209 -> IIIll(-816108569, var9 ^ -206858670);
            case 210 -> IIIll(-816108576, var9 ^ 2059512069);
            case 211 -> IIIll(-816108575, var9 ^ -987633995);
            case 212 -> IIIll(-816108574, var9 ^ -9112725);
            case 213 -> IIIll(-816108573, var9 ^ 1728887200);
            case 214 -> IIIll(-816108564, var9 ^ -409357568);
            case 215 -> IIIll(-816108563, var9 ^ -1489162387);
            case 216 -> IIIll(-816108562, var9 ^ 637715767);
            case 217 -> IIIll(-816108561, var9 ^ -1375635887);
            case 218 -> IIIll(-816108568, var9 ^ -1025910002);
            case 219 -> IIIll(-816108567, var9 ^ 1585134795);
            case 220 -> IIIll(-816108566, var9 ^ 619451161);
            case 221 -> IIIll(-816108565, var9 ^ -1423529092);
            case 222 -> IIIll(-816108588, var9 ^ -349321374);
            case 223 -> IIIll(-816108587, var9 ^ -2125400254);
            case 224 -> IIIll(-816108586, var9 ^ -1357013242);
            case 225 -> IIIll(-816108585, var9 ^ 804008920);
            case 226 -> IIIll(-816108592, var9 ^ -970585083);
            case 227 -> IIIll(-816108591, var9 ^ 1107058985);
            case 228 -> IIIll(-816108590, var9 ^ 747412208);
            case 229 -> 4;
            case 230 -> IIIll(-816108589, var9 ^ -1540753295);
            case 231 -> IIIll(-816108580, var9 ^ 1080194043);
            case 232 -> IIIll(-816108579, var9 ^ 1737536643);
            case 233 -> IIIll(-816108578, var9 ^ 2016543044);
            case 234 -> IIIll(-816108577, var9 ^ 1191323395);
            case 235 -> IIIll(-816108584, var9 ^ -986953029);
            case 236 -> IIIll(-816108583, var9 ^ -1162852789);
            case 237 -> IIIll(-816108582, var9 ^ 1598755485);
            case 238 -> IIIll(-816108581, var9 ^ 1573136780);
            case 239 -> IIIll(-816108604, var9 ^ 1972308156);
            case 240 -> IIIll(-816108603, var9 ^ -813324600);
            case 241 -> IIIll(-816108602, var9 ^ -1751458774);
            case 242 -> IIIll(-816108601, var9 ^ 1037998258);
            case 243 -> IIIll(-816108608, var9 ^ -1547891008);
            case 244 -> IIIll(-816108607, var9 ^ 1185527057);
            case 245 -> IIIll(-816108606, var9 ^ 2119054847);
            case 246 -> IIIll(-816108605, var9 ^ 1731474399);
            case 247 -> IIIll(-816108596, var9 ^ -1810788182);
            case 248 -> IIIll(-816108595, var9 ^ 1324343411);
            case 249 -> IIIll(-816108594, var9 ^ 321204650);
            case 250 -> IIIll(-816108593, var9 ^ -899986547);
            case 251 -> IIIll(-816108600, var9 ^ 1522963408);
            case 252 -> IIIll(-816108599, var9 ^ -806609639);
            case 253 -> IIIll(-816108598, var9 ^ 718742943);
            case 254 -> IIIll(-816108597, var9 ^ -775786690);
            default -> IIIll(-816109004, var9 ^ 235148885);
         };
         int var5 = (var1 & IIIll(-816109003, var9 ^ 1668254121)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIIll(-816109002, var9 ^ -528692104)) >>> IIIll(-816109001, var9 ^ 364869552)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIIll(-816109008, var9 ^ 1011009442);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIIll(-816109007, var9 ^ -1148963752);
            }
         }

         ll[var2] = new String(var3).intern();
      }

      return ll[var2];
   }

   private static String IIlII(byte var0, byte var1, short var2, char var3, byte var4, char var5, int var6) {
      int var11 = var6 ^ -1424357926;
      char[] var10 = lll[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])IIII[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         IIII[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 64769;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ var9 ^ switch (var9 % 13) {
            default -> 159;
            case 1 -> 173;
            case 2 -> 177;
            case 3 -> 87;
            case 4 -> 128;
            case 5 -> 105;
            case 6 -> 58;
            case 7 -> 1;
            case 8 -> 194;
            case 9 -> 68;
            case 10 -> 215;
            case 11 -> 99;
            case 12 -> 116;
         } ^ var5 ^ var0 ^ var8 ^ var1 ^ var6 ^ var3 ^ var2 ^ var4);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   private static List<String> IIIl(List<IIIlIlIl> var0) {
      if (var0 != null && !var0.isEmpty()) {
         ArrayList var1 = new ArrayList(var0.size());

         for (IIIlIlIl var3 : var0) {
            var1.add(var3.llIl());
         }

         return List.copyOf(var1);
      } else {
         return List.of();
      }
   }

   public List<String> IIlI() {
      return IIIl(this.Il);
   }

   private void IIll(List<IIIlIlIl> var1) {
      List var2 = var1 == null ? List.of() : List.copyOf(var1);
      if (!III(this.Il, var2)) {
         this.Il = var2;
         this.llll();
      }
   }

   private static List<IIIlIlIl> IlII(Collection<?> var0) {
      String[] var1 = IIllllIl.IIIIl();
      if (var0 != null && !var0.isEmpty()) {
         ArrayList var2 = new ArrayList();

         for (Object var4 : var0) {
            IIIlIlIl var5;
            label47: {
               if (var4 instanceof IIIlIlIl var6) {
                  var5 = var6;
                  if (var1 == null) {
                     break label47;
                  }
               }

               String var7 = II(var4 == null ? null : var4.toString());
               var5 = IlIIllIII.lII(var7);
            }

            if (!var5.lI()) {
               var2.add(var5);
            }

            if (var1 != null) {
               break;
            }
         }

         return List.copyOf(var2);
      } else {
         return List.of();
      }
   }

   public List<String> lIII() {
      return IIIl(this.II);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -2126269383;
      String[] var15 = new String[1];
      int var17 = 0;
      int var16 = 0;
      int var10001 = "\t忼浓姼䴆嵐淌忀\ued59岸".length();
      short var18 = 31224;
      int var14 = var10001;
      String var13 = "\t忼浓姼䴆嵐淌忀\ued59岸";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 183;
               case 1 -> 51;
               case 2 -> 47;
               case 3 -> 115;
               case 4 -> 11;
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

      lll = var15;
      IIII = new Object[var15.length];
      int var9 = -304243789;
      byte[] var7 = "\u0001.«ùÀMß³hª©,³]þZîéÙ´m\u0011\u0081\u0002c\u0001T=êGju(\u0005eÖâ\u000114\u0086\u0004\u0098\u008aÞP\u0007ÑÌº\u0091¬uoóïzãÙà¾$\u0085¥4AK\u008aV@Ê\u0080¸\u00ad$\u001bf\u0092\u0095ñ×j\u008b\u008d\u000bà\u0003àÇ(K\u0087<Õ\u0091Èï/Óþ:\u0015\\\u0097Ã?n¸\u0018^í\u001e8\u007fÂm\u0011\u0089e\n%\u0083iæ\u0019\u00003\u0080¹ÿ\t·\u0011þ$\u0014~8ï\u008c\u0000kÃ\u0097ä\u0012Ä¹\u0093þÙ,³\u0001\u00ad^\u007f\u0083\u008e®(c·ªaà_\r°3\u009cÜúÀ_\u009e\u0089Þ:J\u0015@ÄQ\u0089¯\u001a¨Í\u0099c\u008e,ãDâ\u000f¦\u0097\u0084UÌ9Ã¨\u001ds\u000f´â\u0084Ó{\u0010\u0081,¼/+¼§ä¢\u0085bîLÄVæís\u0082\u0011iÒ?ç0ÅÂ\u0089ßª´c¤ZÃñdjêf3¿ ±Íê6G±~X\u0007\u009aNïÄüØû\u001b\t\u008eÆÎa'ÝJßÏ#\u0086bIÑÛm|}\u0015»ÉÑo%esêà}·ðA~\u0081É\u0098\u0093OnH«·Pd\u000b\u009dFö´Â\u008dð¨\"oAlÒ\u0013Ô\u0019¥·\u0014úõ\u000fæÒí¬\u0095LÌP1²°\u009e8 ¨\u0007(\tÑ¼öyü%\u0016-¯BÜ´!JºLâ÷ïVeÕçSÞõÃ\u001cwêQ4\u008f\u0082ôgD8ÓùÕÁ\u0000ÉaÐé\u009c\u00877*\u0006VüM\u0095\u0081ºCVW\u0017Ä6Ú\u00815Gð*4\u0099UÙl1Îz\u0003º\u0096ÍÆ¦4p\u009f\u0014¯÷ã\u0011E¡kKÖ¸P6\u009b¨¬\u008e+¿\u001bÎÀ\u0083Àõ\u0083\"¹\u0084Á©W'áÅ\u0000\u00adL/â«\u0017Ý\u0083\"\u0099^R¹\u000e«M´¶\u0099\"¼:â¦¯wVNï@#\u0086LîmÞ\u0086\u009bèçândlôÎ©ö\u009d\u0094+9òÑOÛÐ)ç\u0087\u0095>°Y¢º\u0094\u0000U´ùèç½¢ôçÊ\u0091z*V¬D¤y9£)ÁKæÓÞéà-}\u0082S\u000f]ö%kFÇ¿M.ïö\u008d»\u00adè@C'j£\u0088öúÕ-\\\u000b\u0017\u0092íªà$\u009e\b¼÷x¾Ô\u0082ö\"q+,¼hk-\u001cg\\0óKå\u0097\u009eçË\u008df\u0083q\u009fmO\u008aÞÌºí\u0093\u0013$»s\u008a0\u009bÁ¥\u0097ÿ±VOÇ\u008d\u001f\u0013Â«\\\u001f\u0093Ö¾gkâ\u001eC\u000b©P\u009cxE°\u00179Îw9vZÔ¾\u0091#æ´ÛÌ?L7½Ä\u0002!¸Ûw]Ý\f\u0017È÷\u007fÕW¿:\u0081ò<!ýä/írky¸\u0013½O\u0091<\u0018\u0000G\u0006\u008b¨¿ë\u001c¡òJmcÈ+\u0092¿9¾Ý4û[Ù&T\"?áü~ÂÙ½V\u008d:Å·ð\"¢\u0089EF{\u0019©wOÏðö\u0091\u0016\u0087!\u0096\u0005D;ù\u009aO\u000b^8\u0086zSAä¾8\u0003êÇïöéÕËW\u0080~ÔÍ\u0010ygº\tÂªu6£õ»¿ÉÉ\u001f\u0000)\u0085Y:|\u0093\u0003¢\u0004Úz\"\u0091Ó\u0006b5O\u0004ã\n¥}k\t\u00161\u0007Ñ¸×\u009bs\\fáäs\u000en.È\u0087.%¤ºDX\u0097Ôj\u0015ÿ'êäSÚ\u0003.l\u009f\u0084ô\u0001ié\u0084úÐa!\u0098S\u0085j\u0013Å¢\u0098Ôð½:b¾\u0082\nG¿\u0000$)p\u007f¸&=\u009aCq`\u0098ÌJj°\u0087k]\n\u008dÆhR\u0092¼\\øÖø*fµnõ\u0083¡Õ\u009d»FV\u0013¢<SÙQ\u0019ð\r\u008bç\u0083¦Ö-Q\u008a\u000fS+¥\u009fÎðH\nä}EïßE\u0081\u0014Ê\fÇË\fwÇ¦gëÈÚ\u008b\u00ad\u001aÐ·\u0016ØùJ¥Æ~\u008cV=\u0094¡Ö\u0083\nÜç½¤¿>>ä\u000b©¥R¿i\u0013ã.A@\u001d GMç\t\u0006ÊÛòñ\u0084í\u0019]\f"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      l = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         l[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIlII((byte)-29, (byte)-2, (short)-32487, (char)'\ueae7', (byte)-72, '衠', -1424357926)).length();
      char var1 = 4;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label82: {
            int var27 = IIIll(-816109006, var23 ^ -929326426);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var34 = var27;
            var10002 = var10003;
            var10001 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var27;
               var10006 = var6;
            } else {
               var34 = var27;
               var10001 = var10004;
               if (var10004 <= var6) {
                  break label82;
               }

               var10005 = var10003;
               var10004 = var27;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % IIIll(-816109005, var23 ^ 1457957705)) {
                  case 0 -> 1;
                  case 1 -> IIIll(-816108996, var23 ^ -125472248);
                  case 2 -> IIIll(-816108995, var23 ^ -1204689564);
                  case 3 -> IIIll(-816108994, var23 ^ 243606982);
                  case 4 -> IIIll(-816108993, var23 ^ -1089204905);
                  case 5 -> IIIll(-816109000, var23 ^ 1100614523);
                  default -> IIIll(-816108999, var23 ^ -1154266600);
               });
               var6++;
               if (var34 == 0) {
                  var10006 = var34;
                  var10005 = var10002;
                  var10004 = var34;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var34;
                  var10006 = var6;
               }
            }
         }

         String var36 = new String(var10002).intern();
         byte var31 = -1;
         var5[var3++] = var36;
         if ((var0 += var1) >= var4) {
            I = var5;
            ll = new String[2];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static int IIIll(int var0, int var1) {
      int var2 = l[var0 ^ -816108748] ^ var1 ^ var0;
      var2 -= 23190;
      var2 += 25125;
      var2 += 26381;
      var2 += 36510;
      var2 -= 10685;
      var2 -= 3393;
      return var2 - 3970;
   }

   public IllIlIl(String var1, Collection<?> var2) {
      this(var1, var2, IlIIllIII.Ill(IIII(IIIll(-816108998, -750020795 ^ -708765516), IIIll(-816108997, -750020795 ^ -483712523))));
   }

   public IllIlIl(Object var1, Collection<?> var2, String var3) {
      this(var1, var2, (Object)var3);
   }
}
