package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1812;
import net.minecraft.class_310;
import net.minecraft.class_490;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
abstract class IllllI extends IlIIIIIIl {
   private long ll;
   private final IIlIII III;
   private final IllIIIll IIl;
   private boolean IlI;
   private final int[] I;
   private final IllIII<lIll> Ill;
   private final lllIIlII lII;
   private static final String[] IIIlI;
   private static final String[] lIl;
   private boolean llI;
   private static final int lll = 36;
   private final IIlIII IIII;
   private int IIIl;
   private static final Object[] IIIll;
   private static final int IIlI = 9;
   private long IIll;
   private int IlII;
   private final class_1799[] IlIl;
   private final lIlllIl IllI;
   private static String[] Illl;
   private static final String[] lIII;
   private int lIIl;
   private int lIlI;
   private final lllIIlII lIll;
   private static final int[] llll;
   private final lllIIlII llII;
   private boolean llIl;

   private boolean Il(class_1799 var1) {
      try {
         if (System.currentTimeMillis() - this.IIll >= this.ll) {
            return true;
         }
      } catch (MatchException var2) {
         throw III(var2);
      }

      return false;
   }

   protected IllllI(Object var1, Object var2, IllIIIll var3, boolean var4) {
      int var5 = 244508630;
      super(var1, lllIIlIl.IlI, var2);
      this.lIlI = -1;
      this.IIIl = -1;
      this.IlII = lIIlI(-433413645, var5 ^ -1291943852);
      this.IlIl = new class_1799[lIIlI(-433413646, var5 ^ 1121766469)];
      this.I = new int[lIIlI(-433413647, var5 ^ 2108490170)];
      this.IIl = var3;
      IllllI var10000 = this;
      IIlIII var10001 = var4 ? this.IllIIll(new IIlIII(IlIIllIII.Ill(Illl[3]), 10.0, 1.0, 63.0, 1.0)) : null;

      lllIIlII var10002;
      lllIIlII var10003;
      IIIlIlIl var10004;
      boolean var10005;
      label20: {
         try {
            var10000.IIII = var10001;
            this.IllI = this.IllIIll(
               new lIlllIl(IlIIllIII.Ill(Illl[2]), 75.0, 75.0, 0.0, 500.0, 5.0).lI(IlIIllIII.lI(Illl[lIIlI(-433413648, var5 ^ -206392941)]))
            );
            this.Ill = this.IllIIll(new IllIII<>(IlIIllIII.Ill(Illl[lIIlI(-433413641, var5 ^ 1586179192)]), lIll.class, k74.x.lIll.IIl));
            this.III = this.IllIIll(new IIlIII(IlIIllIII.Ill(Illl[lIIlI(-433413642, var5 ^ -198465819)]), 1.0, 1.0, 9.0, 1.0));
            this.lII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Illl[4]), true));
            var10000 = this;
            var8 = this;
            var10002 = new lllIIlII;
            var10003 = var10002;
            var10004 = IlIIllIII.Ill(Illl[1]);
            if (var3 != IllIIIll.lI) {
               var10005 = true;
               break label20;
            }
         } catch (MatchException var6) {
            throw III(var6);
         }

         var10005 = false;
      }

      var10003./* $VF: Unable to resugar constructor */<init>(var10004, var10005);
      var10000.llII = var8.IllIIll(var10002);
      this.lIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Illl[5]), true));
      this.lIll.lIlI(this::IllIl);
      this.III.lIlI(this::IIIII);
      this.Ill.lIlI(this::IIll);
      this.lII.lIlI(this::IIlI);
   }

   private static String lI(int var0, int var1) {
      int var9 = 887001346;
      int var2 = (var0 ^ lIIlI(-433413643, var9 ^ 1198029344)) & lIIlI(-433413644, var9 ^ -961476636);
      if (lIII[var2] == null) {
         char[] var3 = lIl[var2].toCharArray();

         int var4 = switch (var3[0] & lIIlI(-433413637, var9 ^ 1193938248)) {
            case 0 -> lIIlI(-433413638, var9 ^ -1484704742);
            case 1 -> lIIlI(-433413639, var9 ^ -1788126987);
            case 2 -> lIIlI(-433413640, var9 ^ -94877746);
            case 3 -> lIIlI(-433413633, var9 ^ -210485886);
            case 4 -> lIIlI(-433413634, var9 ^ -76966066);
            case 5 -> lIIlI(-433413635, var9 ^ 39463724);
            case 6 -> lIIlI(-433413636, var9 ^ -942930356);
            case 7 -> lIIlI(-433413661, var9 ^ 131713776);
            case 8 -> lIIlI(-433413662, var9 ^ -1693796856);
            case 9 -> lIIlI(-433413663, var9 ^ 166288911);
            case 10 -> lIIlI(-433413664, var9 ^ -658950242);
            case 11 -> lIIlI(-433413657, var9 ^ -1731570443);
            case 12 -> lIIlI(-433413658, var9 ^ -620871129);
            case 13 -> lIIlI(-433413659, var9 ^ -1251238684);
            case 14 -> lIIlI(-433413660, var9 ^ -1755191231);
            case 15 -> lIIlI(-433413653, var9 ^ 1841452022);
            case 16 -> lIIlI(-433413654, var9 ^ -2129270196);
            case 17 -> lIIlI(-433413655, var9 ^ 1644127281);
            case 18 -> lIIlI(-433413656, var9 ^ -1823138165);
            case 19 -> lIIlI(-433413649, var9 ^ 2019243601);
            case 20 -> lIIlI(-433413650, var9 ^ 2124227024);
            case 21 -> 5;
            case 22 -> lIIlI(-433413651, var9 ^ -1620367110);
            case 23 -> lIIlI(-433413652, var9 ^ 873184370);
            case 24 -> lIIlI(-433413677, var9 ^ -579785118);
            case 25 -> lIIlI(-433413678, var9 ^ -1932832067);
            case 26 -> lIIlI(-433413679, var9 ^ -1919324821);
            case 27 -> lIIlI(-433413680, var9 ^ -698624370);
            case 28 -> lIIlI(-433413673, var9 ^ -868643529);
            case 29 -> lIIlI(-433413674, var9 ^ -91912095);
            case 30 -> lIIlI(-433413675, var9 ^ 339181762);
            case 31 -> lIIlI(-433413676, var9 ^ 601463605);
            case 32 -> lIIlI(-433413669, var9 ^ 793660583);
            case 33 -> lIIlI(-433413670, var9 ^ 279443718);
            case 34 -> lIIlI(-433413671, var9 ^ -870837374);
            case 35 -> lIIlI(-433413672, var9 ^ -743944761);
            case 36 -> lIIlI(-433413665, var9 ^ 1924446861);
            case 37 -> lIIlI(-433413666, var9 ^ 821917577);
            case 38 -> lIIlI(-433413667, var9 ^ 709470049);
            case 39 -> lIIlI(-433413668, var9 ^ -771548462);
            case 40 -> lIIlI(-433413693, var9 ^ -1610288843);
            case 41 -> lIIlI(-433413694, var9 ^ 1436977154);
            case 42 -> lIIlI(-433413695, var9 ^ 750850080);
            case 43 -> lIIlI(-433413696, var9 ^ -420998640);
            case 44 -> lIIlI(-433413689, var9 ^ -993123862);
            case 45 -> 1;
            case 46 -> lIIlI(-433413690, var9 ^ -1402302094);
            case 47 -> lIIlI(-433413691, var9 ^ 1939059790);
            case 48 -> lIIlI(-433413692, var9 ^ 4466350);
            case 49 -> lIIlI(-433413685, var9 ^ -429557243);
            case 50 -> lIIlI(-433413686, var9 ^ 1061315613);
            case 51 -> lIIlI(-433413687, var9 ^ -1952624276);
            case 52 -> lIIlI(-433413688, var9 ^ -1126484955);
            case 53 -> lIIlI(-433413681, var9 ^ -1405948794);
            case 54 -> lIIlI(-433413682, var9 ^ 157645533);
            case 55 -> lIIlI(-433413683, var9 ^ 156074153);
            case 56 -> lIIlI(-433413684, var9 ^ 1411120714);
            case 57 -> lIIlI(-433413709, var9 ^ 1841532960);
            case 58 -> lIIlI(-433413710, var9 ^ 554367368);
            case 59 -> lIIlI(-433413711, var9 ^ 720938109);
            case 60 -> lIIlI(-433413712, var9 ^ 622065849);
            case 61 -> lIIlI(-433413705, var9 ^ -1619189377);
            case 62 -> lIIlI(-433413706, var9 ^ -12979412);
            case 63 -> lIIlI(-433413707, var9 ^ -708246536);
            case 64 -> lIIlI(-433413708, var9 ^ 116012752);
            case 65 -> lIIlI(-433413701, var9 ^ 1299222941);
            case 66 -> lIIlI(-433413702, var9 ^ 841909879);
            case 67 -> lIIlI(-433413703, var9 ^ -672989077);
            case 68 -> lIIlI(-433413704, var9 ^ -1785694835);
            case 69 -> lIIlI(-433413697, var9 ^ 1031594015);
            case 70 -> lIIlI(-433413698, var9 ^ -332160910);
            case 71 -> lIIlI(-433413699, var9 ^ -1980755160);
            case 72 -> lIIlI(-433413700, var9 ^ 1927846555);
            case 73 -> lIIlI(-433413725, var9 ^ -754236664);
            case 74 -> lIIlI(-433413726, var9 ^ -443914630);
            case 75 -> lIIlI(-433413727, var9 ^ -1324006553);
            case 76 -> lIIlI(-433413728, var9 ^ -856210519);
            case 77 -> lIIlI(-433413721, var9 ^ 480007835);
            case 78 -> lIIlI(-433413722, var9 ^ 109109557);
            case 79 -> lIIlI(-433413723, var9 ^ 1352211779);
            case 80 -> lIIlI(-433413724, var9 ^ -217171454);
            case 81 -> lIIlI(-433413717, var9 ^ 1595435951);
            case 82 -> lIIlI(-433413718, var9 ^ -534166268);
            case 83 -> 0;
            case 84 -> lIIlI(-433413719, var9 ^ -635455888);
            case 85 -> lIIlI(-433413720, var9 ^ -1555454423);
            case 86 -> lIIlI(-433413713, var9 ^ -653772755);
            case 87 -> lIIlI(-433413714, var9 ^ -923547503);
            case 88 -> lIIlI(-433413715, var9 ^ -1343657194);
            case 89 -> lIIlI(-433413716, var9 ^ 685856796);
            case 90 -> lIIlI(-433413741, var9 ^ 557856956);
            case 91 -> lIIlI(-433413742, var9 ^ 1632834767);
            case 92 -> lIIlI(-433413743, var9 ^ -546739311);
            case 93 -> lIIlI(-433413744, var9 ^ 18727392);
            case 94 -> lIIlI(-433413737, var9 ^ -1508609918);
            case 95 -> lIIlI(-433413738, var9 ^ 588893677);
            case 96 -> lIIlI(-433413739, var9 ^ 793649818);
            case 97 -> lIIlI(-433413740, var9 ^ 1220635808);
            case 98 -> lIIlI(-433413733, var9 ^ -1891908456);
            case 99 -> lIIlI(-433413734, var9 ^ 1466428837);
            case 100 -> lIIlI(-433413735, var9 ^ 1869175206);
            case 101 -> lIIlI(-433413736, var9 ^ 2129836453);
            case 102 -> lIIlI(-433413729, var9 ^ 2125978140);
            case 103 -> lIIlI(-433413730, var9 ^ 1076022456);
            case 104 -> lIIlI(-433413731, var9 ^ -130648773);
            case 105 -> lIIlI(-433413732, var9 ^ 1428339613);
            case 106 -> lIIlI(-433413757, var9 ^ 249787801);
            case 107 -> lIIlI(-433413758, var9 ^ -1518789251);
            case 108 -> lIIlI(-433413759, var9 ^ -193062223);
            case 109 -> lIIlI(-433413760, var9 ^ -1072194198);
            case 110 -> lIIlI(-433413753, var9 ^ -1091499623);
            case 111 -> lIIlI(-433413754, var9 ^ -879797498);
            case 112 -> lIIlI(-433413755, var9 ^ -198027924);
            case 113 -> lIIlI(-433413756, var9 ^ -392698063);
            case 114 -> lIIlI(-433413749, var9 ^ 1369672688);
            case 115 -> lIIlI(-433413750, var9 ^ 758170137);
            case 116 -> lIIlI(-433413751, var9 ^ 1214933378);
            case 117 -> lIIlI(-433413752, var9 ^ -1946333944);
            case 118 -> lIIlI(-433413745, var9 ^ -54173231);
            case 119 -> lIIlI(-433413746, var9 ^ -1421438939);
            case 120 -> lIIlI(-433413747, var9 ^ -496595781);
            case 121 -> lIIlI(-433413748, var9 ^ -811498116);
            case 122 -> lIIlI(-433413773, var9 ^ -1408770466);
            case 123 -> lIIlI(-433413774, var9 ^ -1757187840);
            case 124 -> lIIlI(-433413775, var9 ^ -423367201);
            case 125 -> lIIlI(-433413776, var9 ^ 397409153);
            case 126 -> lIIlI(-433413769, var9 ^ 280722809);
            case 127 -> lIIlI(-433413770, var9 ^ -2113182635);
            case 128 -> lIIlI(-433413771, var9 ^ -1009582541);
            case 129 -> lIIlI(-433413772, var9 ^ -1069960746);
            case 130 -> lIIlI(-433413765, var9 ^ 447166711);
            case 131 -> lIIlI(-433413766, var9 ^ 355702885);
            case 132 -> lIIlI(-433413767, var9 ^ 993726760);
            case 133 -> lIIlI(-433413768, var9 ^ 122637104);
            case 134 -> lIIlI(-433413761, var9 ^ 164358399);
            case 135 -> lIIlI(-433413762, var9 ^ 1942510858);
            case 136 -> lIIlI(-433413763, var9 ^ -1808658314);
            case 137 -> lIIlI(-433413764, var9 ^ -1318546177);
            case 138 -> lIIlI(-433413789, var9 ^ -428208517);
            case 139 -> lIIlI(-433413790, var9 ^ 80838345);
            case 140 -> lIIlI(-433413791, var9 ^ -1855399526);
            case 141 -> 3;
            case 142 -> lIIlI(-433413792, var9 ^ -963057721);
            case 143 -> lIIlI(-433413785, var9 ^ -1337618403);
            case 144 -> lIIlI(-433413786, var9 ^ 1293877173);
            case 145 -> lIIlI(-433413787, var9 ^ 2029052577);
            case 146 -> lIIlI(-433413788, var9 ^ 1506434602);
            case 147 -> lIIlI(-433413781, var9 ^ 1660554940);
            case 148 -> lIIlI(-433413782, var9 ^ -645186784);
            case 149 -> lIIlI(-433413783, var9 ^ -1008065193);
            case 150 -> lIIlI(-433413784, var9 ^ -914841408);
            case 151 -> lIIlI(-433413777, var9 ^ -900187217);
            case 152 -> lIIlI(-433413778, var9 ^ -1501019889);
            case 153 -> lIIlI(-433413779, var9 ^ 2112478474);
            case 154 -> lIIlI(-433413780, var9 ^ -1142550975);
            case 155 -> lIIlI(-433413805, var9 ^ -1735127910);
            case 156 -> lIIlI(-433413806, var9 ^ -1330767003);
            case 157 -> lIIlI(-433413807, var9 ^ 307192792);
            case 158 -> lIIlI(-433413808, var9 ^ -692180006);
            case 159 -> lIIlI(-433413801, var9 ^ 1392033675);
            case 160 -> lIIlI(-433413802, var9 ^ -1288252312);
            case 161 -> lIIlI(-433413803, var9 ^ -689138281);
            case 162 -> lIIlI(-433413804, var9 ^ -879850751);
            case 163 -> lIIlI(-433413797, var9 ^ 1507099333);
            case 164 -> lIIlI(-433413798, var9 ^ -1063725966);
            case 165 -> lIIlI(-433413799, var9 ^ 1036023347);
            case 166 -> lIIlI(-433413800, var9 ^ 592753771);
            case 167 -> lIIlI(-433413793, var9 ^ -949197269);
            case 168 -> lIIlI(-433413794, var9 ^ -1383330249);
            case 169 -> lIIlI(-433413795, var9 ^ 2125781694);
            case 170 -> lIIlI(-433413796, var9 ^ 1866210583);
            case 171 -> lIIlI(-433413821, var9 ^ 416215708);
            case 172 -> lIIlI(-433413822, var9 ^ 108775200);
            case 173 -> lIIlI(-433413823, var9 ^ 2112582750);
            case 174 -> lIIlI(-433413824, var9 ^ -1264433087);
            case 175 -> lIIlI(-433413817, var9 ^ -1445352108);
            case 176 -> lIIlI(-433413818, var9 ^ 1207589251);
            case 177 -> lIIlI(-433413819, var9 ^ 900717359);
            case 178 -> lIIlI(-433413820, var9 ^ 114280240);
            case 179 -> lIIlI(-433413813, var9 ^ 1145236127);
            case 180 -> lIIlI(-433413814, var9 ^ -403524737);
            case 181 -> lIIlI(-433413815, var9 ^ -1670630699);
            case 182 -> lIIlI(-433413816, var9 ^ -1804342441);
            case 183 -> lIIlI(-433413809, var9 ^ -67037332);
            case 184 -> lIIlI(-433413810, var9 ^ 481366288);
            case 185 -> lIIlI(-433413811, var9 ^ -1970840012);
            case 186 -> lIIlI(-433413812, var9 ^ 997190832);
            case 187 -> lIIlI(-433413837, var9 ^ -1371695486);
            case 188 -> lIIlI(-433413838, var9 ^ -125259891);
            case 189 -> lIIlI(-433413839, var9 ^ -1006907190);
            case 190 -> lIIlI(-433413840, var9 ^ -1754374562);
            case 191 -> lIIlI(-433413833, var9 ^ -1375438057);
            case 192 -> lIIlI(-433413834, var9 ^ 1848475221);
            case 193 -> lIIlI(-433413835, var9 ^ 1211541700);
            case 194 -> lIIlI(-433413836, var9 ^ 1601646438);
            case 195 -> lIIlI(-433413829, var9 ^ -484698096);
            case 196 -> lIIlI(-433413830, var9 ^ -748753989);
            case 197 -> lIIlI(-433413831, var9 ^ -1072131375);
            case 198 -> 2;
            case 199 -> lIIlI(-433413832, var9 ^ -2089405508);
            case 200 -> lIIlI(-433413825, var9 ^ -1341178932);
            case 201 -> lIIlI(-433413826, var9 ^ 666925629);
            case 202 -> lIIlI(-433413827, var9 ^ -211461704);
            case 203 -> lIIlI(-433413828, var9 ^ 1024344972);
            case 204 -> lIIlI(-433413853, var9 ^ -1476674564);
            case 205 -> lIIlI(-433413854, var9 ^ 401983309);
            case 206 -> lIIlI(-433413855, var9 ^ -184286144);
            case 207 -> lIIlI(-433413856, var9 ^ 1460608344);
            case 208 -> lIIlI(-433413849, var9 ^ 222025086);
            case 209 -> lIIlI(-433413850, var9 ^ 1498467833);
            case 210 -> lIIlI(-433413851, var9 ^ -1939591244);
            case 211 -> lIIlI(-433413852, var9 ^ -926752454);
            case 212 -> lIIlI(-433413845, var9 ^ -579202499);
            case 213 -> lIIlI(-433413846, var9 ^ 2120355482);
            case 214 -> lIIlI(-433413847, var9 ^ -1413264058);
            case 215 -> lIIlI(-433413848, var9 ^ 984094595);
            case 216 -> lIIlI(-433413841, var9 ^ 1647904628);
            case 217 -> lIIlI(-433413842, var9 ^ -2034989542);
            case 218 -> lIIlI(-433413843, var9 ^ -275901891);
            case 219 -> lIIlI(-433413844, var9 ^ -1568196097);
            case 220 -> lIIlI(-433413869, var9 ^ -630655581);
            case 221 -> lIIlI(-433413870, var9 ^ -362090505);
            case 222 -> lIIlI(-433413871, var9 ^ -155203986);
            case 223 -> lIIlI(-433413872, var9 ^ -1981670613);
            case 224 -> lIIlI(-433413865, var9 ^ 134482900);
            case 225 -> lIIlI(-433413866, var9 ^ -1712012682);
            case 226 -> lIIlI(-433413867, var9 ^ -81460341);
            case 227 -> lIIlI(-433413868, var9 ^ 1385195037);
            case 228 -> lIIlI(-433413861, var9 ^ 2027402789);
            case 229 -> lIIlI(-433413862, var9 ^ -76643752);
            case 230 -> lIIlI(-433413863, var9 ^ 180067274);
            case 231 -> lIIlI(-433413864, var9 ^ -1062881156);
            case 232 -> lIIlI(-433413857, var9 ^ -781486179);
            case 233 -> lIIlI(-433413858, var9 ^ -268389413);
            case 234 -> lIIlI(-433413859, var9 ^ -1296474835);
            case 235 -> lIIlI(-433413860, var9 ^ 1360886126);
            case 236 -> lIIlI(-433413885, var9 ^ -1300465618);
            case 237 -> lIIlI(-433413886, var9 ^ 1157658916);
            case 238 -> 4;
            case 239 -> lIIlI(-433413887, var9 ^ -723960266);
            case 240 -> lIIlI(-433413888, var9 ^ 925810487);
            case 241 -> lIIlI(-433413881, var9 ^ 1436159877);
            case 242 -> lIIlI(-433413882, var9 ^ -565139831);
            case 243 -> lIIlI(-433413883, var9 ^ -56385102);
            case 244 -> lIIlI(-433413884, var9 ^ -810144573);
            case 245 -> lIIlI(-433413877, var9 ^ -605884766);
            case 246 -> lIIlI(-433413878, var9 ^ -580695439);
            case 247 -> lIIlI(-433413879, var9 ^ -1035369978);
            case 248 -> lIIlI(-433413880, var9 ^ 791066808);
            case 249 -> lIIlI(-433413873, var9 ^ 1121612305);
            case 250 -> lIIlI(-433413874, var9 ^ 643313309);
            case 251 -> lIIlI(-433413875, var9 ^ 350735520);
            case 252 -> lIIlI(-433413876, var9 ^ -1557641434);
            case 253 -> lIIlI(-433413901, var9 ^ 1396239622);
            case 254 -> lIIlI(-433413902, var9 ^ -504939673);
            default -> lIIlI(-433413903, var9 ^ 29731659);
         };
         int var5 = (var1 & lIIlI(-433413904, var9 ^ -1302227701)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIlI(-433413897, var9 ^ 259272925)) >>> lIIlI(-433413898, var9 ^ 933039503)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIlI(-433413899, var9 ^ 1918745663);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIlI(-433413900, var9 ^ -1245961272);
            }
         }

         lIII[var2] = new String(var3).intern();
      }

      return lIII[var2];
   }

   private boolean ll(class_310 param1, class_1799 param2, int param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 04: ifeq 81
      // 07: aload 1
      // 08: ifnull 81
      // 0b: goto 12
      // 0e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 16: ifnull 81
      // 19: goto 20
      // 1c: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 24: instanceof net/minecraft/class_490
      // 27: ifeq 81
      // 2a: goto 31
      // 2d: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: aload 0
      // 32: getfield k74/x/IllllI.llIl Z
      // 35: ifne 81
      // 38: goto 3f
      // 3b: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3e: athrow
      // 3f: iload 3
      // 40: iflt 81
      // 43: goto 4a
      // 46: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 49: athrow
      // 4a: iload 3
      // 4b: ldc_w -433413915
      // 4e: ldc_w 1378988711
      // 51: ldc_w -309116979
      // 54: ixor
      // 55: invokestatic k74/x/IllllI.lIIlI (II)I
      // 58: if_icmpge 81
      // 5b: goto 62
      // 5e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 61: athrow
      // 62: aload 0
      // 63: getfield k74/x/IllllI.I [I
      // 66: iload 3
      // 67: iaload
      // 68: aload 1
      // 69: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 6c: getfield net/minecraft/class_746.field_6012 I
      // 6f: if_icmplt 81
      // 72: goto 79
      // 75: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 78: athrow
      // 79: bipush 1
      // 7a: goto 82
      // 7d: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 80: athrow
      // 81: bipush 0
      // 82: ireturn
   }

   private static MatchException III(MatchException var0) {
      return var0;
   }

   private boolean IIl(class_310 param1, class_746 param2, int param3, int param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: iload 3
      // 01: iflt 31
      // 04: iload 4
      // 06: iflt 31
      // 09: goto 10
      // 0c: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f: athrow
      // 10: iload 3
      // 11: iload 4
      // 13: if_icmpeq 31
      // 16: goto 1d
      // 19: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: aload 2
      // 1e: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 21: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 24: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 27: ifne 37
      // 2a: goto 31
      // 2d: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: bipush 0
      // 32: ireturn
      // 33: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 36: athrow
      // 37: aload 2
      // 38: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 3b: getfield net/minecraft/class_1723.field_7763 I
      // 3e: istore 5
      // 40: aload 1
      // 41: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 44: iload 5
      // 46: iload 3
      // 47: bipush 0
      // 48: getstatic net/minecraft/class_1713.field_7790 Lnet/minecraft/class_1713;
      // 4b: aload 2
      // 4c: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 4f: aload 1
      // 50: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 53: iload 5
      // 55: iload 4
      // 57: bipush 0
      // 58: getstatic net/minecraft/class_1713.field_7790 Lnet/minecraft/class_1713;
      // 5b: aload 2
      // 5c: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 5f: aload 2
      // 60: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 63: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 66: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 69: ifne 82
      // 6c: aload 1
      // 6d: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 70: iload 5
      // 72: iload 3
      // 73: bipush 0
      // 74: getstatic net/minecraft/class_1713.field_7790 Lnet/minecraft/class_1713;
      // 77: aload 2
      // 78: invokevirtual net/minecraft/class_636.method_2906 (IIILnet/minecraft/class_1713;Lnet/minecraft/class_1657;)V
      // 7b: goto 82
      // 7e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 81: athrow
      // 82: aload 2
      // 83: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 86: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 89: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 8c: ireturn
   }

   private boolean Ill(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 04: instanceof net/minecraft/class_1812
      // 07: ifne 32
      // 0a: aload 0
      // 0b: aload 1
      // 0c: invokevirtual k74/x/IllllI.IIllI (Lnet/minecraft/class_1799;)Z
      // 0f: ifne 32
      // 12: goto 19
      // 15: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 18: athrow
      // 19: aload 1
      // 1a: getstatic net/minecraft/class_1802.field_8069 Lnet/minecraft/class_1792;
      // 1d: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 20: ifne 32
      // 23: goto 2a
      // 26: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 29: athrow
      // 2a: bipush 1
      // 2b: goto 33
      // 2e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 31: athrow
      // 32: bipush 0
      // 33: ireturn
   }

   private boolean lII(class_310 var1) {
      try {
         switch (IlIIIIIlI.I[this.Ill.IllI().ordinal()]) {
            case 1:
               return lIIIllII.I(var1);
            case 2:
               return lIIIllII.lll(var1);
            case 3:
               return true;
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var2) {
         throw III(var2);
      }
   }

   private boolean lIl(class_310 param1, class_746 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: iload 3
      // 03: ldc_w -433413916
      // 06: ldc_w 1197098309
      // 09: ldc_w -1496214914
      // 0c: ixor
      // 0d: invokestatic k74/x/IllllI.lIIlI (II)I
      // 10: if_icmpge 7f
      // 13: aload 2
      // 14: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 17: iload 3
      // 18: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 1b: astore 4
      // 1d: aload 0
      // 1e: aload 1
      // 1f: aload 4
      // 21: iload 3
      // 22: invokevirtual k74/x/IllllI.ll (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;I)Z
      // 25: ifeq 2f
      // 28: goto 79
      // 2b: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 3
      // 31: aload 4
      // 33: invokevirtual k74/x/IllllI.IIII (ILnet/minecraft/class_1799;)Lnet/minecraft/class_1799;
      // 36: astore 5
      // 38: aload 5
      // 3a: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 3d: ifne 79
      // 40: aload 0
      // 41: aload 4
      // 43: aload 5
      // 45: invokevirtual k74/x/IllllI.IlllI (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 48: ifeq 79
      // 4b: goto 52
      // 4e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 51: athrow
      // 52: aload 0
      // 53: aload 5
      // 55: invokevirtual k74/x/IllllI.llI (Lnet/minecraft/class_1799;)Z
      // 58: ifne 69
      // 5b: goto 62
      // 5e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 61: athrow
      // 62: goto 79
      // 65: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 68: athrow
      // 69: aload 0
      // 6a: aload 2
      // 6b: aload 5
      // 6d: invokevirtual k74/x/IllllI.lIIl (Lnet/minecraft/class_746;Lnet/minecraft/class_1799;)I
      // 70: iflt 79
      // 73: bipush 1
      // 74: ireturn
      // 75: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 78: athrow
      // 79: iinc 3 1
      // 7c: goto 02
      // 7f: bipush 0
      // 80: ireturn
   }

   private boolean llI(class_1799 var1) {
      try {
         if (var1.method_7960()) {
            return false;
         }
      } catch (MatchException var2) {
         throw III(var2);
      }

      try {
         switch (this.IIl) {
            case l:
               return var1.method_7909() instanceof class_1812;
            case Il:
               return this.Ill(var1);
            case lI:
               return var1.method_31574(class_1802.field_8069);
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var3) {
         throw III(var3);
      }
   }

   private boolean lll(class_1799 param1, class_1799 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: aload 2
      // 02: invokestatic net/minecraft/class_1799.method_31577 (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 05: ifeq 1e
      // 08: aload 1
      // 09: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 0c: ifle 1e
      // 0f: goto 16
      // 12: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15: athrow
      // 16: bipush 1
      // 17: goto 1f
      // 1a: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
   }

   private class_1799 IIII(int var1, class_1799 var2) {
      try {
         if (!var2.method_7960()) {
            return var2;
         }
      } catch (MatchException var5) {
         throw III(var5);
      }

      class_1799 var3 = this.IlIl[var1];

      try {
         if (var3 == null) {
            return class_1799.field_8037;
         }
      } catch (MatchException var4) {
         throw III(var4);
      }

      return var3;
   }

   @Override
   public String IlIIl() {
      try {
         if (this.IIII == null) {
            return Illl[0];
         }
      } catch (MatchException var1) {
         throw III(var1);
      }

      return String.valueOf(Math.round(this.IIII.IllI()));
   }

   private void IIIl(class_310 param1, class_746 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 0
      // 001: aload 2
      // 002: invokevirtual k74/x/IllllI.llII (Lnet/minecraft/class_746;)V
      // 005: aload 2
      // 006: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 009: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 00c: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 00f: ifne 017
      // 012: return
      // 013: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 016: athrow
      // 017: aload 0
      // 018: bipush 0
      // 019: putfield k74/x/IllllI.llI Z
      // 01c: aload 0
      // 01d: bipush 0
      // 01e: putfield k74/x/IllllI.lIIl I
      // 021: invokestatic java/lang/System.currentTimeMillis ()J
      // 024: aload 0
      // 025: getfield k74/x/IllllI.IIll J
      // 028: lsub
      // 029: aload 0
      // 02a: getfield k74/x/IllllI.ll J
      // 02d: lcmp
      // 02e: ifge 036
      // 031: return
      // 032: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 035: athrow
      // 036: aload 0
      // 037: aload 1
      // 038: aload 2
      // 039: invokevirtual k74/x/IllllI.lIl (Lnet/minecraft/class_310;Lnet/minecraft/class_746;)Z
      // 03c: ifne 044
      // 03f: return
      // 040: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 043: athrow
      // 044: aload 1
      // 045: invokestatic k74/x/lIIIllII.lIll (Lnet/minecraft/class_310;)Z
      // 048: ifne 050
      // 04b: return
      // 04c: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 04f: athrow
      // 050: bipush 0
      // 051: istore 3
      // 052: bipush 0
      // 053: istore 4
      // 055: iload 4
      // 057: ldc_w -433413909
      // 05a: ldc_w 406454218
      // 05d: ldc_w 1746116882
      // 060: ixor
      // 061: invokestatic k74/x/IllllI.lIIlI (II)I
      // 064: if_icmpge 11b
      // 067: aload 2
      // 068: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 06b: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 06e: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 071: ifne 082
      // 074: goto 07b
      // 077: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 07a: athrow
      // 07b: goto 11b
      // 07e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 081: athrow
      // 082: aload 2
      // 083: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 086: iload 4
      // 088: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 08b: astore 5
      // 08d: aload 0
      // 08e: aload 1
      // 08f: aload 5
      // 091: iload 4
      // 093: invokevirtual k74/x/IllllI.ll (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;I)Z
      // 096: ifeq 0a0
      // 099: goto 115
      // 09c: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 09f: athrow
      // 0a0: aload 0
      // 0a1: iload 4
      // 0a3: aload 5
      // 0a5: invokevirtual k74/x/IllllI.IIII (ILnet/minecraft/class_1799;)Lnet/minecraft/class_1799;
      // 0a8: astore 6
      // 0aa: aload 6
      // 0ac: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 0af: ifne 115
      // 0b2: aload 0
      // 0b3: aload 5
      // 0b5: aload 6
      // 0b7: invokevirtual k74/x/IllllI.IlllI (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 0ba: ifeq 115
      // 0bd: goto 0c4
      // 0c0: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c3: athrow
      // 0c4: aload 0
      // 0c5: aload 6
      // 0c7: invokevirtual k74/x/IllllI.llI (Lnet/minecraft/class_1799;)Z
      // 0ca: ifne 0db
      // 0cd: goto 0d4
      // 0d0: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d3: athrow
      // 0d4: goto 115
      // 0d7: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0da: athrow
      // 0db: aload 0
      // 0dc: aload 2
      // 0dd: aload 6
      // 0df: invokevirtual k74/x/IllllI.lIIl (Lnet/minecraft/class_746;Lnet/minecraft/class_1799;)I
      // 0e2: istore 7
      // 0e4: iload 7
      // 0e6: ifge 0f0
      // 0e9: goto 115
      // 0ec: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ef: athrow
      // 0f0: aload 0
      // 0f1: aload 1
      // 0f2: aload 2
      // 0f3: iload 7
      // 0f5: ldc_w -433413910
      // 0f8: ldc_w 406454218
      // 0fb: ldc_w 128917745
      // 0fe: ixor
      // 0ff: invokestatic k74/x/IllllI.lIIlI (II)I
      // 102: iload 4
      // 104: iadd
      // 105: invokevirtual k74/x/IllllI.IIl (Lnet/minecraft/class_310;Lnet/minecraft/class_746;II)Z
      // 108: ifne 112
      // 10b: goto 11b
      // 10e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 111: athrow
      // 112: iinc 3 1
      // 115: iinc 4 1
      // 118: goto 055
      // 11b: iload 3
      // 11c: ifle 139
      // 11f: aload 0
      // 120: invokestatic java/lang/System.currentTimeMillis ()J
      // 123: putfield k74/x/IllllI.IIll J
      // 126: aload 0
      // 127: aload 0
      // 128: invokevirtual k74/x/IllllI.IllII ()J
      // 12b: putfield k74/x/IllllI.ll J
      // 12e: aload 1
      // 12f: invokestatic k74/x/lIIIllII.lII (Lnet/minecraft/class_310;)V
      // 132: goto 139
      // 135: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 138: athrow
      // 139: aload 1
      // 13a: invokestatic k74/x/lIIIllII.Ill (Lnet/minecraft/class_310;)V
      // 13d: return
   }

   private boolean IIlI() {
      try {
         if (!this.llII.IllI()) {
            return true;
         }
      } catch (MatchException var1) {
         throw III(var1);
      }

      return false;
   }

   private boolean IIll() {
      try {
         if (!this.llII.IllI()) {
            return true;
         }
      } catch (MatchException var1) {
         throw III(var1);
      }

      return false;
   }

   private void IlII(class_310 var1, class_746 var2) {
      try {
         if (var1.field_1755 instanceof class_490) {
            this.llIl = false;
            return;
         }
      } catch (MatchException var3) {
         throw III(var3);
      }

      var1.method_1507(new class_490(var2));
      this.llIl = true;
   }

   private void IlIl() {
      int var1 = 0;

      try {
         while (var1 < this.IlIl.length) {
            this.IlIl[var1] = class_1799.field_8037;
            this.I[var1] = lIIlI(-433413911, -201118889 ^ 1144573592);
            var1++;
         }
      } catch (MatchException var2) {
         throw III(var2);
      }
   }

   private boolean IllI(class_310 param1, class_746 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: iload 3
      // 03: ldc_w -433413912
      // 06: ldc_w 1624429091
      // 09: ldc_w -568203984
      // 0c: ixor
      // 0d: invokestatic k74/x/IllllI.lIIlI (II)I
      // 10: if_icmpge 9d
      // 13: aload 2
      // 14: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 17: iload 3
      // 18: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 1b: astore 4
      // 1d: aload 0
      // 1e: aload 1
      // 1f: aload 4
      // 21: iload 3
      // 22: invokevirtual k74/x/IllllI.ll (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;I)Z
      // 25: ifeq 2f
      // 28: goto 97
      // 2b: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2e: athrow
      // 2f: aload 0
      // 30: iload 3
      // 31: aload 4
      // 33: invokevirtual k74/x/IllllI.IIII (ILnet/minecraft/class_1799;)Lnet/minecraft/class_1799;
      // 36: astore 5
      // 38: aload 5
      // 3a: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 3d: ifne 97
      // 40: aload 0
      // 41: aload 4
      // 43: aload 5
      // 45: invokevirtual k74/x/IllllI.IlllI (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 48: ifeq 97
      // 4b: goto 52
      // 4e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 51: athrow
      // 52: aload 0
      // 53: aload 5
      // 55: invokevirtual k74/x/IllllI.llI (Lnet/minecraft/class_1799;)Z
      // 58: ifne 69
      // 5b: goto 62
      // 5e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 61: athrow
      // 62: goto 97
      // 65: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 68: athrow
      // 69: aload 0
      // 6a: aload 2
      // 6b: aload 5
      // 6d: invokevirtual k74/x/IllllI.lIIl (Lnet/minecraft/class_746;Lnet/minecraft/class_1799;)I
      // 70: istore 6
      // 72: iload 6
      // 74: ifge 7e
      // 77: goto 97
      // 7a: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: iload 6
      // 81: ldc_w -433413905
      // 84: ldc_w 1624429091
      // 87: ldc_w 641796084
      // 8a: ixor
      // 8b: invokestatic k74/x/IllllI.lIIlI (II)I
      // 8e: iload 3
      // 8f: iadd
      // 90: aload 2
      // 91: aload 1
      // 92: invokevirtual k74/x/IllllI.lIIII (IILnet/minecraft/class_746;Lnet/minecraft/class_310;)V
      // 95: bipush 1
      // 96: ireturn
      // 97: iinc 3 1
      // 9a: goto 02
      // 9d: bipush 0
      // 9e: ireturn
   }

   private void Illl() {
      this.lIlI = -1;
      this.IIIl = -1;
      this.IlII = lIIlI(-433413906, 349828420 ^ 577706697);
      this.IlI = false;
      this.llIl = false;
   }

   @Override
   public void llIl() {
      this.IIIlI(class_310.method_1551());
      this.Illl();
      this.llI = false;
      this.lIIl = 0;
      this.ll = 0L;
      this.IlIl();
   }

   private int lIII() {
      return Math.max(1, Math.min(lIIlI(-433413907, -183745967 ^ -1608852961), (int)Math.round(this.III.IllI())));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1992402516;
      short var18 = 25709;
      int var16 = 0;
      int var10001 = "]㘂\ud9ec瑦䬄䝲\udbfc쏜\ue670ﮧ瘯䔕浕椝㸼᐀鄰㱑\uf3bc꫱틘恄잺寎扅⦒줶ㄙὁ嬃沣\ue5fb䷩렋跧鲓貳竾᪕癷秠鲼曻扫筨뇿ꨘ釭ꥰ⫅雜ᢸ썇㈬㽯퐬癱朱ṉ拲\uea3d譌替펯ꍱ芬읒\uda2fᗀ\uf527멞∹曑\uf061ꓸ䢒Ȑ鹮ⶢ࠼汝抸芗⌇\uf509癵\ue1f7ᩜ뇒身䕲峉䚙펤!癶몣㮞嘄綾ٵ\ue4a1᧗塰茌좠හꢹ\u1bfa딴줲퍶\ue237㤣ǆᩫ๖얿ﺌ\ufb19\uf6a9ኴ⢢鎖ᩘꡗୡ짹"
         .length();
      String[] var15 = new String[2];
      int var14 = var10001;
      int var17 = 0;
      String var13 = "]㘂\ud9ec瑦䬄䝲\udbfc쏜\ue670ﮧ瘯䔕浕椝㸼᐀鄰㱑\uf3bc꫱틘恄잺寎扅⦒줶ㄙὁ嬃沣\ue5fb䷩렋跧鲓貳竾᪕癷秠鲼曻扫筨뇿ꨘ釭ꥰ⫅雜ᢸ썇㈬㽯퐬癱朱ṉ拲\uea3d譌替펯ꍱ芬읒\uda2fᗀ\uf527멞∹曑\uf061ꓸ䢒Ȑ鹮ⶢ࠼汝抸芗⌇\uf509癵\ue1f7ᩜ뇒身䕲峉䚙펤!癶몣㮞嘄綾ٵ\ue4a1᧗塰茌좠හꢹ\u1bfa딴줲퍶\ue237㤣ǆᩫ๖얿ﺌ\ufb19\uf6a9ኴ⢢鎖ᩘꡗୡ짹";

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 153;
               case 1 -> 212;
               case 2 -> 178;
               case 3 -> 130;
               case 4 -> 176;
               case 5 -> 218;
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

      IIIlI = var15;
      IIIll = new Object[var15.length];
      int var9 = 1515148686;
      byte[] var7 = "\u007föé\u0012\u000fÔ¥\u001b0¥hç¾ºØÍ\u0013\u0083E\"¹#Ï¼0-ó7N\n\u0018r0n\u0011ÑÐÅ+hâ/G+\u008d\u001cX=\u00840\"\u0090\u008c-\u0088\u0010u\u001e4X°\u0088\u0019\u0015p\u009dÕñìN©g~\u00adA°¯ý(Äï\u008eKÕ\u00adº]'Â/\u0083ýà%÷¶\u001a\u0086LØöQõ\u001d\u0016»{ðä\u0011\u0001®\u000f\u001f)þ\tÙ>\u0094è/7\u0099CO£&ª51Âû\u008fMvúÝr#¡\u001fÊ2»}\u0092ü\u008dÁ\u0097\u009dcs\u009f1T\u009d\u0084\u0016X\nS¾gãæÉ»\\\fÍ¤ìRï\u0005ð¥\u0006G¹h\u001e]\r¸»¥G\u0005Ù×@îò\"â\u0097O[\u0085\u000fW\u0091¬\r:³\u008a=JÛ.\u008dÐ\u0004×«Uw\u00009R\u0091!f¦H\u0006{cüÙN\u0003Ë\u009f+TÛvól~!e ~\t\u009f\u008c#_áy\u001a\u0087\u008f¾VNæC]¼»SRWçÕè9>¹\u0088}ì¥¢\u008d\u001c©q®)\u007f:4\u008e\u0010Ej\u0099\u0004 §\u001f\u0088âÔjíJ8ÿ\u0083\u009bw¿¼þ´\f\u0090\u0005¬\u0085o¤O\\ß\u0092Îy\nÆQ\\\u0015»³\\\u008dkØI\u008dqÄþÌ'Ý\u0002e\u0084J%\u0015(\\t\u009f\u0097mZ¢\u00ad[©!Ô\r¹¯®L'\t¿·×oØ\u00adt\u0004_¥GdV\u0004'l\u0016\u0017\u000b\u0099¨-tAvYÞvÑPoäT]Ò-X\n=\u001b?\u0085s\u0089ø\u007fÛ\u0091 #ò®\u0018-EQ\t¶¥T\tóÅ(7fÓ\u0006\u008frj6\"f¤Þy§j\\Ò=\u0002³\u0083:\u0005\u001f·S\u0082ëÉµ\u0016Ô¼ËD\u009d\u0083vJÓ\u009fÓø»&ç\u0094ºZtÝ;?.v\u0011ü¹RL\u008b\u0081~ÞÜ\u0002\u008f-\u0095\"\u0093þ¸å\u009a\u00adÛCÁ\u009aà\u0007n6\u0091\u0087ò§`ëä\u001dgÿb\u009dõO{1´\u0096á¯·}®?mã'Þbw\u0087\u0098L\u007f\u000eÿp\u000bT\u0002~\u008f÷ò\u0004\u008cA\u001eãv\u000fêÆ,\u008b¿\u0091>\u0011\u0010s\u0095a'æ,Æê±Üø~Ç\u0001\u008f\u0000:Zà\u0091\u000f´ýE.\u008eAì\u0015¾\u0011C®Ï$\u001b´®:E¾<¿-½\u001c$\u001dÑÌ^Æ\n\u00adÂ§Ì¢\u0011ÖïÐ\u0013ùÇê\u0004Åe\u000b|ü¡ú4m%¼ \u007fÄrË\u000f¡¨\u008aà¼Ê\u0094\u009b.\u0090\u009eý·ÜË0J\u0084iºT\u0010¨Q°(yAÚÈ\u0011H\tðÅ¿\u0018x\u0002äo\u008aíÐq?ØÆ\n¯k\u000fÃæWJÞ\u009d²æ0¾F*BëÄ%q\u008bØ\u008e3\u0006õ\u0001\u0090¶¬`ë(-=ã7ô+\u008bE\u000bEkõ\u000eÜýÃA*L+ó\nÙy\u0089-\u008fÌ°!´¿Ï à*AöÙ@gO\u0019ia]?r·\u0014(30e\u0094X\u0007\u0097¤\u001aô\u0097·\\\u008d'ô2,\u009bÇK$AP\u0084eØ\u0084!F,JJ\\IÐ¿¤Ò`±Ø]\u0082@\u001b\u0082 K\u0002âz\u007fÊõ.\u0014Òoû 0Ü¿\u0086þ5ª>\r+\t&\u0011CÜ\u0087RqMì\bh\u0015}\u0018bñð\u0099#\u0098Ê\räÕÃ&Ù\u00ad,êç\u009d.ð[\u0081ûÙVþ¦\u0004M\u007f@\u0014\u0012î°Ý«\u008ca\u001c~%ÔyG\u000f\u0093©F\u008c*\u009d\u001a}ÿ\u0087¸·á§=¦/kï\u0087D¬þÅýBê&YfVÅ8dH2Df&£\u009d!@@j \u0082\"Þ\u0010\u0017©\u0014¹Y\u008bç¾ð¸ò3\u0082¬¦ñ«ª'U\u0090µ\r\u009d¢Xb§M5\u009emðQ\u001c1Uc£Ó®ÔlX½$|ó\u000b\u0096£%¹v\u0081µ0Å%\u0088\u0099\u0087Ï.H@Ù\u0013\u0000\u0005\u0019¡¨Âø>^`²}\u007fG\u0096}w\u0087¬\u009a'2\r\u009d\u0081¯\u0014%\u000e\u0088\u001f\"\u0081\u0089\u009a\"\u0085ã\u008c§[\u001eZqÞ\u0085\u0015]xûå)¢si\n8¿¿W8É\u0087o*ü8\u0002õ¢\u0011X¥3°ÑI\\\fP\u008es¡jEýi¸\u0081\u0005\tZgõ,`\u0000\u0016\u008c\u0017ÙÁr\"\u009aú\u0001ïÑ\"b{OE¸Ä|¥%Å\n{\u0080HÅ\\gV¸\u0082\u0081Èõ¸a\u007fÕ\u0092\r\u009f- jw\u0006âö\b?\u008aD\u0010a°\u000bg¡Õµ÷\u0096\u0086d¼\u0086\u0081õ4·\u001a-\u0017\u001e~\u001e\u0082ø\u0016ÓÅ?J«OLA\u0095\u0082'[\u001dÐ0¡ì\u009a;fp\u0086êª°do\u0014iMì!\u009c7åùØ\u008a´D¯ü#¼Ç\u001e\u0081TÍ\u0083YÆã\u0089L\u001f\bR¿H¤úäf\u0088|F\u0002·\u009b9²I\u0000\u0019h,2\u008aê\u001fÏ2HBÃ\u0001\u0011\u001bjô"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      llll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         llll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lIIlI(-433413893, var23 ^ 1441354923)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIlII(1916157517, var23 ^ -678057531)).length();
      int var1 = lIIlI(-433413894, var23 ^ 1926059158);
      int var25 = -1;

      label99:
      while (true) {
         int var28 = lIIlI(-433413895, var23 ^ -1292389495);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label94: {
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
                     break label94;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lIIlI(-433413890, var23 ^ -1119614125)) {
                     case 0 -> lIIlI(-433413891, var23 ^ -1128199422);
                     case 1 -> lIIlI(-433413892, var23 ^ -690516225);
                     case 2 -> lIIlI(-433413917, var23 ^ 721508415);
                     case 3 -> lIIlI(-433413918, var23 ^ -1337035740);
                     case 4 -> lIIlI(-433413919, var23 ^ -826408942);
                     case 5 -> lIIlI(-433413920, var23 ^ 1177691048);
                     default -> lIIlI(-433413913, var23 ^ -1964736877);
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
                     lIl = var5;
                     lIII = new String[lIIlI(-433413889, var23 ^ -1706095394)];
                     Illl = new String[lIIlI(-433413914, var23 ^ -52672798)];
                     IIIIl();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label99;
                  }

                  var4 = (var2 = lIlII(1916157516, var23 ^ -347169796)).length();
                  var1 = lIIlI(-433413896, var23 ^ 123122794);
                  var25 = -1;
            }

            var28 = 2;
            var30 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private int lIIl(class_746 param1, class_1799 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: bipush -1
      // 001: istore 3
      // 002: bipush 0
      // 003: istore 4
      // 005: ldc_w -433413908
      // 008: ldc_w -973996968
      // 00b: ldc_w 1192841556
      // 00e: ixor
      // 00f: invokestatic k74/x/IllllI.lIIlI (II)I
      // 012: istore 5
      // 014: iload 5
      // 016: ldc_w -433413933
      // 019: ldc_w -973996968
      // 01c: ldc_w 2087361541
      // 01f: ixor
      // 020: invokestatic k74/x/IllllI.lIIlI (II)I
      // 023: if_icmpge 07b
      // 026: aload 1
      // 027: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 02a: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 02d: iload 5
      // 02f: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 032: checkcast net/minecraft/class_1735
      // 035: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 038: astore 6
      // 03a: aload 6
      // 03c: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 03f: ifne 075
      // 042: aload 0
      // 043: aload 6
      // 045: aload 2
      // 046: invokevirtual k74/x/IllllI.lll (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 049: ifeq 075
      // 04c: goto 053
      // 04f: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 052: athrow
      // 053: aload 6
      // 055: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 058: iload 4
      // 05a: if_icmpgt 06b
      // 05d: goto 064
      // 060: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 063: athrow
      // 064: goto 075
      // 067: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 06a: athrow
      // 06b: iload 5
      // 06d: istore 3
      // 06e: aload 6
      // 070: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 073: istore 4
      // 075: iinc 5 1
      // 078: goto 014
      // 07b: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 07e: astore 5
      // 080: aload 0
      // 081: getfield k74/x/IllllI.lII Lk74/x/lllIIlII;
      // 084: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 087: checkcast java/lang/Boolean
      // 08a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 08d: ifeq 118
      // 090: aload 5
      // 092: ifnull 118
      // 095: goto 09c
      // 098: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 09b: athrow
      // 09c: aload 5
      // 09e: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 0a1: invokevirtual k74/x/lIIIlIlI.IIl ()Lk74/x/IIllIll;
      // 0a4: astore 6
      // 0a6: aload 6
      // 0a8: ifnull 118
      // 0ab: aload 6
      // 0ad: invokevirtual k74/x/IIllIll.l ()Z
      // 0b0: ifeq 118
      // 0b3: goto 0ba
      // 0b6: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b9: athrow
      // 0ba: bipush 1
      // 0bb: istore 7
      // 0bd: iload 7
      // 0bf: bipush 4
      // 0c0: if_icmpgt 118
      // 0c3: aload 1
      // 0c4: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 0c7: getfield net/minecraft/class_1723.field_7761 Lnet/minecraft/class_2371;
      // 0ca: iload 7
      // 0cc: invokevirtual net/minecraft/class_2371.get (I)Ljava/lang/Object;
      // 0cf: checkcast net/minecraft/class_1735
      // 0d2: invokevirtual net/minecraft/class_1735.method_7677 ()Lnet/minecraft/class_1799;
      // 0d5: astore 8
      // 0d7: aload 8
      // 0d9: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 0dc: ifne 112
      // 0df: aload 0
      // 0e0: aload 8
      // 0e2: aload 2
      // 0e3: invokevirtual k74/x/IllllI.lll (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 0e6: ifeq 112
      // 0e9: goto 0f0
      // 0ec: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ef: athrow
      // 0f0: aload 8
      // 0f2: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 0f5: iload 4
      // 0f7: if_icmpgt 108
      // 0fa: goto 101
      // 0fd: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 100: athrow
      // 101: goto 112
      // 104: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 107: athrow
      // 108: iload 7
      // 10a: istore 3
      // 10b: aload 8
      // 10d: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 110: istore 4
      // 112: iinc 7 1
      // 115: goto 0bd
      // 118: iload 3
      // 119: ireturn
   }

   private int lIlI(class_310 param1, class_746 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: bipush 0
      // 03: istore 4
      // 05: iload 4
      // 07: ldc_w -433413934
      // 0a: ldc_w -735113735
      // 0d: ldc_w -1244137186
      // 10: ixor
      // 11: invokestatic k74/x/IllllI.lIIlI (II)I
      // 14: if_icmpge 8a
      // 17: aload 2
      // 18: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 1b: iload 4
      // 1d: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 20: astore 5
      // 22: aload 0
      // 23: aload 1
      // 24: aload 5
      // 26: iload 4
      // 28: invokevirtual k74/x/IllllI.ll (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;I)Z
      // 2b: ifeq 35
      // 2e: goto 84
      // 31: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 34: athrow
      // 35: aload 0
      // 36: iload 4
      // 38: aload 5
      // 3a: invokevirtual k74/x/IllllI.IIII (ILnet/minecraft/class_1799;)Lnet/minecraft/class_1799;
      // 3d: astore 6
      // 3f: aload 6
      // 41: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 44: ifne 84
      // 47: aload 0
      // 48: aload 5
      // 4a: aload 6
      // 4c: invokevirtual k74/x/IllllI.IlllI (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 4f: ifeq 84
      // 52: goto 59
      // 55: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 58: athrow
      // 59: aload 0
      // 5a: aload 6
      // 5c: invokevirtual k74/x/IllllI.llI (Lnet/minecraft/class_1799;)Z
      // 5f: ifne 70
      // 62: goto 69
      // 65: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 68: athrow
      // 69: goto 84
      // 6c: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6f: athrow
      // 70: aload 0
      // 71: aload 2
      // 72: aload 6
      // 74: invokevirtual k74/x/IllllI.lIIl (Lnet/minecraft/class_746;Lnet/minecraft/class_1799;)I
      // 77: iflt 84
      // 7a: iinc 3 1
      // 7d: goto 84
      // 80: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 83: athrow
      // 84: iinc 4 1
      // 87: goto 05
      // 8a: iload 3
      // 8b: ireturn
   }

   private void lIll(class_310 param1, class_746 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 3
      // 004: aload 0
      // 005: getfield k74/x/IllllI.Ill Lk74/x/IllIII;
      // 008: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 00b: getstatic k74/x/lIll.Il Lk74/x/lIll;
      // 00e: if_acmpne 01c
      // 011: aload 0
      // 012: aload 1
      // 013: aload 2
      // 014: invokevirtual k74/x/IllllI.IIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_746;)V
      // 017: return
      // 018: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 01b: athrow
      // 01c: aload 0
      // 01d: aload 2
      // 01e: invokevirtual k74/x/IllllI.llII (Lnet/minecraft/class_746;)V
      // 021: aload 1
      // 022: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 025: instanceof net/minecraft/class_490
      // 028: istore 4
      // 02a: aload 0
      // 02b: getfield k74/x/IllllI.llII Lk74/x/lllIIlII;
      // 02e: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 031: checkcast java/lang/Boolean
      // 034: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 037: ifeq 059
      // 03a: iload 4
      // 03c: ifne 059
      // 03f: goto 046
      // 042: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 045: athrow
      // 046: aload 0
      // 047: invokevirtual k74/x/IllllI.Illl ()V
      // 04a: aload 0
      // 04b: bipush 0
      // 04c: putfield k74/x/IllllI.llI Z
      // 04f: aload 0
      // 050: bipush 0
      // 051: putfield k74/x/IllllI.lIIl I
      // 054: return
      // 055: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 058: athrow
      // 059: aload 0
      // 05a: getfield k74/x/IllllI.llII Lk74/x/lllIIlII;
      // 05d: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 060: checkcast java/lang/Boolean
      // 063: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 066: ifne 0a9
      // 069: aload 0
      // 06a: getfield k74/x/IllllI.lIll Lk74/x/lllIIlII;
      // 06d: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 070: checkcast java/lang/Boolean
      // 073: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 076: ifeq 0a9
      // 079: goto 080
      // 07c: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 07f: athrow
      // 080: aload 1
      // 081: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 084: ifnull 0a9
      // 087: goto 08e
      // 08a: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 08d: athrow
      // 08e: iload 4
      // 090: ifne 0a9
      // 093: goto 09a
      // 096: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 099: athrow
      // 09a: aload 0
      // 09b: bipush 0
      // 09c: putfield k74/x/IllllI.llI Z
      // 09f: aload 0
      // 0a0: bipush 0
      // 0a1: putfield k74/x/IllllI.lIIl I
      // 0a4: return
      // 0a5: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a8: athrow
      // 0a9: aload 1
      // 0aa: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0ad: ifnull 0cb
      // 0b0: iload 4
      // 0b2: ifne 0cb
      // 0b5: goto 0bc
      // 0b8: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0bb: athrow
      // 0bc: aload 0
      // 0bd: bipush 0
      // 0be: putfield k74/x/IllllI.llI Z
      // 0c1: aload 0
      // 0c2: bipush 0
      // 0c3: putfield k74/x/IllllI.lIIl I
      // 0c6: return
      // 0c7: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ca: athrow
      // 0cb: aload 2
      // 0cc: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 0cf: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 0d2: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 0d5: ifne 0dd
      // 0d8: return
      // 0d9: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0dc: athrow
      // 0dd: aload 0
      // 0de: getfield k74/x/IllllI.Ill Lk74/x/IllIII;
      // 0e1: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 0e4: getstatic k74/x/lIll.IIl Lk74/x/lIll;
      // 0e7: if_acmpeq 0ff
      // 0ea: aload 0
      // 0eb: bipush 0
      // 0ec: putfield k74/x/IllllI.llI Z
      // 0ef: aload 0
      // 0f0: bipush 0
      // 0f1: putfield k74/x/IllllI.lIIl I
      // 0f4: aload 0
      // 0f5: invokevirtual k74/x/IllllI.Illl ()V
      // 0f8: goto 0ff
      // 0fb: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: getfield k74/x/IllllI.Ill Lk74/x/IllIII;
      // 103: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 106: getstatic k74/x/lIll.IIl Lk74/x/lIll;
      // 109: if_acmpne 1a9
      // 10c: aload 0
      // 10d: invokevirtual k74/x/IllllI.IIlll ()Z
      // 110: ifeq 1a9
      // 113: goto 11a
      // 116: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 119: athrow
      // 11a: aload 2
      // 11b: getfield net/minecraft/class_746.field_6012 I
      // 11e: aload 0
      // 11f: getfield k74/x/IllllI.IlII I
      // 122: if_icmpge 131
      // 125: goto 12c
      // 128: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 12b: athrow
      // 12c: return
      // 12d: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 130: athrow
      // 131: aload 0
      // 132: aload 1
      // 133: invokevirtual k74/x/IllllI.IIlII (Lnet/minecraft/class_310;)Z
      // 136: ifne 13e
      // 139: return
      // 13a: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 13d: athrow
      // 13e: aload 0
      // 13f: aload 1
      // 140: aload 2
      // 141: aload 0
      // 142: getfield k74/x/IllllI.lIlI I
      // 145: aload 0
      // 146: getfield k74/x/IllllI.IIIl I
      // 149: invokevirtual k74/x/IllllI.IIl (Lnet/minecraft/class_310;Lnet/minecraft/class_746;II)Z
      // 14c: istore 5
      // 14e: aload 0
      // 14f: invokevirtual k74/x/IllllI.Illl ()V
      // 152: iload 5
      // 154: ifeq 192
      // 157: aload 0
      // 158: invokestatic java/lang/System.currentTimeMillis ()J
      // 15b: putfield k74/x/IllllI.IIll J
      // 15e: aload 0
      // 15f: aload 0
      // 160: invokevirtual k74/x/IllllI.IllII ()J
      // 163: putfield k74/x/IllllI.ll J
      // 166: aload 0
      // 167: bipush 0
      // 168: aload 0
      // 169: getfield k74/x/IllllI.lIIl I
      // 16c: bipush 1
      // 16d: isub
      // 16e: invokestatic java/lang/Math.max (II)I
      // 171: putfield k74/x/IllllI.lIIl I
      // 174: aload 0
      // 175: getfield k74/x/IllllI.lIIl I
      // 178: ifne 1a8
      // 17b: goto 182
      // 17e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 181: athrow
      // 182: aload 0
      // 183: bipush 0
      // 184: putfield k74/x/IllllI.llI Z
      // 187: aload 3
      // 188: ifnull 1a8
      // 18b: goto 192
      // 18e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 191: athrow
      // 192: aload 0
      // 193: bipush 0
      // 194: putfield k74/x/IllllI.llI Z
      // 197: aload 0
      // 198: bipush 0
      // 199: putfield k74/x/IllllI.lIIl I
      // 19c: aload 0
      // 19d: lconst_0
      // 19e: putfield k74/x/IllllI.ll J
      // 1a1: goto 1a8
      // 1a4: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a7: athrow
      // 1a8: return
      // 1a9: aload 0
      // 1aa: getfield k74/x/IllllI.Ill Lk74/x/IllIII;
      // 1ad: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 1b0: getstatic k74/x/lIll.IIl Lk74/x/lIll;
      // 1b3: if_acmpne 1e0
      // 1b6: aload 0
      // 1b7: getfield k74/x/IllllI.llI Z
      // 1ba: ifne 1e0
      // 1bd: goto 1c4
      // 1c0: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c3: athrow
      // 1c4: invokestatic java/lang/System.currentTimeMillis ()J
      // 1c7: aload 0
      // 1c8: getfield k74/x/IllllI.IIll J
      // 1cb: lsub
      // 1cc: aload 0
      // 1cd: getfield k74/x/IllllI.ll J
      // 1d0: lcmp
      // 1d1: ifge 1e0
      // 1d4: goto 1db
      // 1d7: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1da: athrow
      // 1db: return
      // 1dc: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1df: athrow
      // 1e0: aload 0
      // 1e1: aload 1
      // 1e2: aload 2
      // 1e3: invokevirtual k74/x/IllllI.lIlI (Lnet/minecraft/class_310;Lnet/minecraft/class_746;)I
      // 1e6: istore 5
      // 1e8: iload 5
      // 1ea: ifgt 1fc
      // 1ed: aload 0
      // 1ee: bipush 0
      // 1ef: putfield k74/x/IllllI.llI Z
      // 1f2: aload 0
      // 1f3: bipush 0
      // 1f4: putfield k74/x/IllllI.lIIl I
      // 1f7: return
      // 1f8: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1fb: athrow
      // 1fc: aload 0
      // 1fd: getfield k74/x/IllllI.Ill Lk74/x/IllIII;
      // 200: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 203: getstatic k74/x/lIll.IIl Lk74/x/lIll;
      // 206: if_acmpne 26e
      // 209: invokestatic java/lang/System.currentTimeMillis ()J
      // 20c: aload 0
      // 20d: getfield k74/x/IllllI.IIll J
      // 210: lsub
      // 211: aload 0
      // 212: getfield k74/x/IllllI.ll J
      // 215: lcmp
      // 216: ifge 233
      // 219: goto 220
      // 21c: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21f: athrow
      // 220: aload 0
      // 221: getfield k74/x/IllllI.llI Z
      // 224: ifne 233
      // 227: goto 22e
      // 22a: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22d: athrow
      // 22e: return
      // 22f: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 232: athrow
      // 233: aload 0
      // 234: getfield k74/x/IllllI.llI Z
      // 237: ifne 253
      // 23a: aload 0
      // 23b: bipush 1
      // 23c: putfield k74/x/IllllI.llI Z
      // 23f: aload 0
      // 240: iload 5
      // 242: aload 0
      // 243: invokevirtual k74/x/IllllI.lIII ()I
      // 246: invokestatic java/lang/Math.min (II)I
      // 249: putfield k74/x/IllllI.lIIl I
      // 24c: goto 253
      // 24f: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 252: athrow
      // 253: aload 0
      // 254: aload 1
      // 255: aload 2
      // 256: invokevirtual k74/x/IllllI.IllI (Lnet/minecraft/class_310;Lnet/minecraft/class_746;)Z
      // 259: ifne 26d
      // 25c: aload 0
      // 25d: bipush 0
      // 25e: putfield k74/x/IllllI.llI Z
      // 261: aload 0
      // 262: bipush 0
      // 263: putfield k74/x/IllllI.lIIl I
      // 266: goto 26d
      // 269: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26c: athrow
      // 26d: return
      // 26e: invokestatic java/lang/System.currentTimeMillis ()J
      // 271: aload 0
      // 272: getfield k74/x/IllllI.IIll J
      // 275: lsub
      // 276: aload 0
      // 277: getfield k74/x/IllllI.ll J
      // 27a: lcmp
      // 27b: ifge 283
      // 27e: return
      // 27f: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 282: athrow
      // 283: aload 0
      // 284: aload 1
      // 285: invokevirtual k74/x/IllllI.lII (Lnet/minecraft/class_310;)Z
      // 288: ifeq 29a
      // 28b: aload 0
      // 28c: aload 1
      // 28d: invokevirtual k74/x/IllllI.Illll (Lnet/minecraft/class_310;)Z
      // 290: ifne 29f
      // 293: goto 29a
      // 296: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 299: athrow
      // 29a: return
      // 29b: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 29e: athrow
      // 29f: bipush 0
      // 2a0: istore 6
      // 2a2: bipush 0
      // 2a3: istore 7
      // 2a5: iload 7
      // 2a7: ldc_w -433413935
      // 2aa: ldc_w 1198168236
      // 2ad: ldc_w 1095291771
      // 2b0: ixor
      // 2b1: invokestatic k74/x/IllllI.lIIlI (II)I
      // 2b4: if_icmpge 369
      // 2b7: aload 2
      // 2b8: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 2bb: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 2be: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 2c1: ifne 2cb
      // 2c4: goto 369
      // 2c7: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2ca: athrow
      // 2cb: aload 2
      // 2cc: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 2cf: iload 7
      // 2d1: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 2d4: astore 8
      // 2d6: aload 0
      // 2d7: aload 1
      // 2d8: aload 8
      // 2da: iload 7
      // 2dc: invokevirtual k74/x/IllllI.ll (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;I)Z
      // 2df: ifeq 2e9
      // 2e2: goto 362
      // 2e5: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2e8: athrow
      // 2e9: aload 0
      // 2ea: iload 7
      // 2ec: aload 8
      // 2ee: invokevirtual k74/x/IllllI.IIII (ILnet/minecraft/class_1799;)Lnet/minecraft/class_1799;
      // 2f1: astore 9
      // 2f3: aload 9
      // 2f5: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 2f8: ifne 362
      // 2fb: aload 0
      // 2fc: aload 8
      // 2fe: aload 9
      // 300: invokevirtual k74/x/IllllI.IlllI (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 303: ifeq 362
      // 306: goto 30d
      // 309: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30c: athrow
      // 30d: aload 0
      // 30e: aload 9
      // 310: invokevirtual k74/x/IllllI.llI (Lnet/minecraft/class_1799;)Z
      // 313: ifne 324
      // 316: goto 31d
      // 319: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 31c: athrow
      // 31d: goto 362
      // 320: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 323: athrow
      // 324: aload 0
      // 325: aload 2
      // 326: aload 9
      // 328: invokevirtual k74/x/IllllI.lIIl (Lnet/minecraft/class_746;Lnet/minecraft/class_1799;)I
      // 32b: istore 10
      // 32d: iload 10
      // 32f: ifge 339
      // 332: goto 362
      // 335: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 338: athrow
      // 339: ldc_w -433413936
      // 33c: ldc_w 1198168236
      // 33f: ldc_w -1579822551
      // 342: ixor
      // 343: invokestatic k74/x/IllllI.lIIlI (II)I
      // 346: iload 7
      // 348: iadd
      // 349: istore 11
      // 34b: aload 0
      // 34c: aload 1
      // 34d: aload 2
      // 34e: iload 10
      // 350: iload 11
      // 352: invokevirtual k74/x/IllllI.IIl (Lnet/minecraft/class_310;Lnet/minecraft/class_746;II)Z
      // 355: ifne 35f
      // 358: goto 369
      // 35b: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 35e: athrow
      // 35f: iinc 6 1
      // 362: iinc 7 1
      // 365: aload 3
      // 366: ifnull 2a5
      // 369: iload 6
      // 36b: ifle 388
      // 36e: aload 0
      // 36f: invokestatic java/lang/System.currentTimeMillis ()J
      // 372: putfield k74/x/IllllI.IIll J
      // 375: aload 0
      // 376: aload 0
      // 377: invokevirtual k74/x/IllllI.IllII ()J
      // 37a: putfield k74/x/IllllI.ll J
      // 37d: aload 1
      // 37e: invokestatic k74/x/lIIIllII.lII (Lnet/minecraft/class_310;)V
      // 381: goto 388
      // 384: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 387: athrow
      // 388: return
   }

   private void llII(class_746 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 2
      // 02: iload 2
      // 03: ldc_w -433413929
      // 06: ldc_w -1339173658
      // 09: ldc_w -2009656434
      // 0c: ixor
      // 0d: invokestatic k74/x/IllllI.lIIlI (II)I
      // 10: if_icmpge 87
      // 13: aload 1
      // 14: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 17: iload 2
      // 18: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 1b: astore 3
      // 1c: aload 3
      // 1d: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 20: ifne 47
      // 23: aload 0
      // 24: getfield k74/x/IllllI.IlIl [Lnet/minecraft/class_1799;
      // 27: iload 2
      // 28: aload 3
      // 29: invokevirtual net/minecraft/class_1799.method_7972 ()Lnet/minecraft/class_1799;
      // 2c: aastore
      // 2d: aload 0
      // 2e: getfield k74/x/IllllI.I [I
      // 31: iload 2
      // 32: ldc_w -433413930
      // 35: ldc_w -1339173658
      // 38: ldc_w 802164203
      // 3b: ixor
      // 3c: invokestatic k74/x/IllllI.lIIlI (II)I
      // 3f: iastore
      // 40: goto 81
      // 43: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 46: athrow
      // 47: aload 0
      // 48: getfield k74/x/IllllI.IlIl [Lnet/minecraft/class_1799;
      // 4b: iload 2
      // 4c: aaload
      // 4d: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 50: ifne 81
      // 53: aload 0
      // 54: getfield k74/x/IllllI.I [I
      // 57: iload 2
      // 58: iaload
      // 59: ldc_w -433413931
      // 5c: ldc_w -1339173658
      // 5f: ldc_w -248081499
      // 62: ixor
      // 63: invokestatic k74/x/IllllI.lIIlI (II)I
      // 66: if_icmpne 81
      // 69: goto 70
      // 6c: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6f: athrow
      // 70: aload 0
      // 71: getfield k74/x/IllllI.I [I
      // 74: iload 2
      // 75: aload 1
      // 76: getfield net/minecraft/class_746.field_6012 I
      // 79: iastore
      // 7a: goto 81
      // 7d: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 80: athrow
      // 81: iinc 2 1
      // 84: goto 02
      // 87: return
   }

   private static int lIIlI(int var0, int var1) {
      int var2 = llll[var0 ^ -433413645] ^ var1 ^ var0;
      var2 -= 7818;
      var2 -= 7792;
      var2 += 31434;
      var2 += 29225;
      var2 += 6087;
      var2 ^= 12015;
      var2 ^= 30988;
      return var2 - 5454;
   }

   private static String lllI(char[] var0, long var1, int var3) {
      int var4 = lIIlI(-433413932, 1269957194 ^ 1248909335) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIIlI(-433413925, 1269957194 ^ -1708846628);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private boolean IIIII() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IllllI.llII Lk74/x/lllIIlII;
      // 04: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 07: checkcast java/lang/Boolean
      // 0a: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d: ifne 2c
      // 10: aload 0
      // 11: getfield k74/x/IllllI.Ill Lk74/x/IllIII;
      // 14: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 17: getstatic k74/x/lIll.IIl Lk74/x/lIll;
      // 1a: if_acmpne 2c
      // 1d: goto 24
      // 20: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 23: athrow
      // 24: bipush 1
      // 25: goto 2d
      // 28: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2b: athrow
      // 2c: bipush 0
      // 2d: ireturn
   }

   private static void IIIIl() {
      int var0 = 1561091213;
      Illl[0] = lllI("".toCharArray(), 9455L, lIIlI(-433413926, var0 ^ -1949418131));
      Illl[1] = lllI(lI(lIIlI(-433413927, var0 ^ -60732031), lIIlI(-433413928, var0 ^ -1798168786)).toCharArray(), 95179L, lIIlI(-433413921, var0 ^ 1444826160));
      Illl[2] = lllI(
         lI(lIIlI(-433413922, var0 ^ -886918623), lIIlI(-433413923, var0 ^ -1728935021)).toCharArray(), 11184L, lIIlI(-433413924, var0 ^ -2014025950)
      );
      Illl[3] = lllI(lI(lIIlI(-433413949, var0 ^ 79319735), lIIlI(-433413950, var0 ^ 1619654450)).toCharArray(), 75910L, lIIlI(-433413951, var0 ^ 1636355127));
      Illl[4] = lllI(lI(lIIlI(-433413952, var0 ^ 1413221095), lIIlI(-433413945, var0 ^ 1594025607)).toCharArray(), 40842L, lIIlI(-433413946, var0 ^ -522503709));
      Illl[5] = lllI(
         lI(lIIlI(-433413947, var0 ^ -1082400877), lIIlI(-433413948, var0 ^ 2028455685)).toCharArray(), 21170L, lIIlI(-433413941, var0 ^ -1581437921)
      );
      Illl[lIIlI(-433413942, var0 ^ 184524498)] = lllI(
         lI(lIIlI(-433413943, var0 ^ 1057714752), lIIlI(-433413944, var0 ^ -414269441)).toCharArray(), 14346L, lIIlI(-433413937, var0 ^ 1988407001)
      );
      Illl[lIIlI(-433413938, var0 ^ -1571697222)] = lllI(
         lI(lIIlI(-433413939, var0 ^ 1247463154), lIIlI(-433413940, var0 ^ -663388972)).toCharArray(), 30085L, lIIlI(-433413965, var0 ^ 1626323919)
      );
      Illl[lIIlI(-433413966, var0 ^ 1446128032)] = lllI(
         lI(lIIlI(-433413967, var0 ^ 2015312287), lIIlI(-433413968, var0 ^ 471918018)).toCharArray(), 93211L, lIIlI(-433413961, var0 ^ 1881248230)
      );
   }

   private void IIIlI(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IllllI.llIl Z
      // 04: ifne 0c
      // 07: return
      // 08: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b: athrow
      // 0c: aload 1
      // 0d: ifnull 2d
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 14: instanceof net/minecraft/class_490
      // 17: ifeq 2d
      // 1a: goto 21
      // 1d: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 20: athrow
      // 21: aload 1
      // 22: aconst_null
      // 23: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
      // 26: goto 2d
      // 29: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2c: athrow
      // 2d: aload 0
      // 2e: bipush 0
      // 2f: putfield k74/x/IllllI.llIl Z
      // 32: return
   }

   private boolean IIIll() {
      try {
         return !this.llII.IllI();
      } catch (MatchException var1) {
         throw III(var1);
      }
   }

   @Override
   public void IlIII() {
      this.IIll = 0L;
      this.ll = this.IllII();
      this.Illl();
      this.llI = false;
      this.lIIl = 0;
      this.IlIl();
   }

   private boolean IIlII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1d
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 08: instanceof net/minecraft/class_490
      // 0b: ifeq 1d
      // 0e: goto 15
      // 11: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: bipush 1
      // 16: goto 1e
      // 19: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: istore 2
      // 1f: aload 0
      // 20: invokevirtual k74/x/IllllI.IIIll ()Z
      // 23: ifeq 77
      // 26: aload 0
      // 27: getfield k74/x/IllllI.Ill Lk74/x/IllIII;
      // 2a: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 2d: getstatic k74/x/lIll.Il Lk74/x/lIll;
      // 30: if_acmpne 54
      // 33: goto 3a
      // 36: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 39: athrow
      // 3a: aload 1
      // 3b: invokestatic k74/x/lIIIllII.lllI (Lnet/minecraft/class_310;)Z
      // 3e: ifne 4e
      // 41: goto 48
      // 44: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 47: athrow
      // 48: bipush 0
      // 49: ireturn
      // 4a: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4d: athrow
      // 4e: aload 1
      // 4f: invokestatic k74/x/lIIIllII.lII (Lnet/minecraft/class_310;)V
      // 52: bipush 1
      // 53: ireturn
      // 54: aload 0
      // 55: aload 1
      // 56: invokevirtual k74/x/IllllI.lII (Lnet/minecraft/class_310;)Z
      // 59: ifeq 6b
      // 5c: aload 0
      // 5d: aload 1
      // 5e: invokevirtual k74/x/IllllI.Illll (Lnet/minecraft/class_310;)Z
      // 61: ifne 71
      // 64: goto 6b
      // 67: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6a: athrow
      // 6b: bipush 0
      // 6c: ireturn
      // 6d: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 70: athrow
      // 71: aload 1
      // 72: invokestatic k74/x/lIIIllII.lII (Lnet/minecraft/class_310;)V
      // 75: bipush 1
      // 76: ireturn
      // 77: aload 1
      // 78: invokestatic k74/x/lIIIllII.IIlI (Lnet/minecraft/class_310;)Z
      // 7b: ifne 84
      // 7e: bipush 0
      // 7f: ireturn
      // 80: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 83: athrow
      // 84: iload 2
      // 85: ifne 9c
      // 88: aload 1
      // 89: invokestatic k74/x/lIIIllII.IlIl (Lnet/minecraft/class_310;)Z
      // 8c: ifne 9c
      // 8f: goto 96
      // 92: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 95: athrow
      // 96: bipush 0
      // 97: ireturn
      // 98: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 9b: athrow
      // 9c: aload 1
      // 9d: invokestatic k74/x/lIIIllII.l (Lnet/minecraft/class_310;)Z
      // a0: ifne a9
      // a3: bipush 0
      // a4: ireturn
      // a5: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a8: athrow
      // a9: aload 1
      // aa: invokestatic k74/x/lIIIllII.lII (Lnet/minecraft/class_310;)V
      // ad: bipush 1
      // ae: ireturn
   }

   private boolean IIllI(class_1799 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 04: ifne 20
      // 07: aload 1
      // 08: invokevirtual net/minecraft/class_1799.method_7909 ()Lnet/minecraft/class_1792;
      // 0b: getstatic net/minecraft/class_1802.field_8288 Lnet/minecraft/class_1792;
      // 0e: if_acmpne 20
      // 11: goto 18
      // 14: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17: athrow
      // 18: bipush 1
      // 19: goto 21
      // 1c: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
   }

   private boolean IIlll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IllllI.lIlI I
      // 04: iflt 1d
      // 07: aload 0
      // 08: getfield k74/x/IllllI.IIIl I
      // 0b: iflt 1d
      // 0e: goto 15
      // 11: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14: athrow
      // 15: bipush 1
      // 16: goto 1e
      // 19: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
   }

   private long IllII() {
      double var1 = this.IllI.IIlI();
      double var3 = this.IllI.IlI();

      try {
         if (var1 == var3) {
            return Math.round(var1);
         }
      } catch (MatchException var5) {
         throw III(var5);
      }

      return Math.round(ThreadLocalRandom.current().nextDouble(var1, var3));
   }

   private static String lIlII(int var0, int var1) {
      int var3 = var0 ^ 1916157517;
      char[] var4 = IIIlI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIIll[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIIll[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 229637302;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 184;
            case 1 -> 246;
            case 2 -> 136;
            case 3 -> 159;
            case 4 -> 96;
            case 5 -> 132;
            case 6 -> 31;
            case 7 -> 135;
            case 8 -> 218;
            case 9 -> 55;
            case 10 -> 202;
            case 11 -> 205;
            case 12 -> 196;
            case 13 -> 129;
            case 14 -> 194;
            case 15 -> 11;
            case 16 -> 44;
            case 17 -> 208;
            case 18 -> 14;
            case 19 -> 232;
            case 20 -> 139;
            case 21 -> 6;
            case 22 -> 135;
            case 23 -> 23;
            case 24 -> 17;
            case 25 -> 64;
            case 26 -> 62;
            case 27 -> 55;
            case 28 -> 180;
            case 29 -> 145;
            case 30 -> 177;
            case 31 -> 96;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private boolean IllIl() {
      try {
         if (!this.llII.IllI()) {
            return true;
         }
      } catch (MatchException var1) {
         throw III(var1);
      }

      return false;
   }

   private boolean IlllI(class_1799 param1, class_1799 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 04: ifne 16
      // 07: aload 0
      // 08: aload 2
      // 09: invokevirtual k74/x/IllllI.llI (Lnet/minecraft/class_1799;)Z
      // 0c: ifne 1c
      // 0f: goto 16
      // 12: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1b: athrow
      // 1c: aload 0
      // 1d: getfield k74/x/IllllI.IIl Lk74/x/IllIIIll;
      // 20: getstatic k74/x/IllIIIll.Il Lk74/x/IllIIIll;
      // 23: if_acmpeq 2f
      // 26: aload 1
      // 27: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 2a: ireturn
      // 2b: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2e: athrow
      // 2f: aload 1
      // 30: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 33: ifeq 4e
      // 36: aload 2
      // 37: invokevirtual net/minecraft/class_1799.method_7914 ()I
      // 3a: ifle 4c
      // 3d: goto 44
      // 40: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 43: athrow
      // 44: bipush 1
      // 45: goto 4d
      // 48: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4b: athrow
      // 4c: bipush 0
      // 4d: ireturn
      // 4e: aload 1
      // 4f: invokevirtual net/minecraft/class_1799.method_7946 ()Z
      // 52: ifeq 64
      // 55: aload 1
      // 56: invokevirtual net/minecraft/class_1799.method_7914 ()I
      // 59: bipush 1
      // 5a: if_icmpgt 6a
      // 5d: goto 64
      // 60: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 63: athrow
      // 64: bipush 0
      // 65: ireturn
      // 66: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 69: athrow
      // 6a: aload 1
      // 6b: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 6e: aload 1
      // 6f: invokevirtual net/minecraft/class_1799.method_7914 ()I
      // 72: if_icmplt 7b
      // 75: bipush 0
      // 76: ireturn
      // 77: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7a: athrow
      // 7b: aload 0
      // 7c: getfield k74/x/IllllI.IIII Lk74/x/IIlIII;
      // 7f: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 82: checkcast java/lang/Double
      // 85: invokevirtual java/lang/Double.doubleValue ()D
      // 88: invokestatic java/lang/Math.round (D)J
      // 8b: l2i
      // 8c: aload 1
      // 8d: invokevirtual net/minecraft/class_1799.method_7914 ()I
      // 90: bipush 1
      // 91: isub
      // 92: invokestatic java/lang/Math.min (II)I
      // 95: istore 3
      // 96: aload 1
      // 97: invokevirtual net/minecraft/class_1799.method_7947 ()I
      // 9a: iload 3
      // 9b: if_icmpgt a6
      // 9e: bipush 1
      // 9f: goto a7
      // a2: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // a5: athrow
      // a6: bipush 0
      // a7: ireturn
   }

   private boolean Illll(class_310 var1) {
      try {
         switch (IlIIIIIlI.I[this.Ill.IllI().ordinal()]) {
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
         throw III(var2);
      }
   }

   private void lIIII(int var1, int var2, class_746 var3, class_310 var4) {
      try {
         this.lIlI = var1;
         this.IIIl = var2;
         this.IlII = var3.field_6012 + 1;
         this.IlI = true;
         if (this.Ill.IllI() == k74.x.lIll.Il) {
            lIIIllII.IlI(var4);
            return;
         }
      } catch (MatchException var6) {
         throw III(var6);
      }

      try {
         if (this.Ill.IllI() == k74.x.lIll.IIl) {
            lIIIllII.IIll(var4);
         }
      } catch (MatchException var5) {
         throw III(var5);
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
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 1
      // 004: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 007: astore 2
      // 008: aload 2
      // 009: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 00c: ifnull 02b
      // 00f: aload 2
      // 010: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 013: ifnull 02b
      // 016: goto 01d
      // 019: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 01c: athrow
      // 01d: aload 2
      // 01e: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 021: ifnonnull 03e
      // 024: goto 02b
      // 027: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02a: athrow
      // 02b: aload 0
      // 02c: invokevirtual k74/x/IllllI.Illl ()V
      // 02f: aload 0
      // 030: bipush 0
      // 031: putfield k74/x/IllllI.llI Z
      // 034: aload 0
      // 035: bipush 0
      // 036: putfield k74/x/IllllI.lIIl I
      // 039: return
      // 03a: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03d: athrow
      // 03e: invokestatic k74/x/IIIIIllII.III ()Lk74/x/IIIIIllII;
      // 041: astore 3
      // 042: aload 3
      // 043: ifnull 068
      // 046: aload 3
      // 047: invokevirtual k74/x/IIIIIllII.II ()Lk74/x/lIIIlIlI;
      // 04a: invokevirtual k74/x/lIIIlIlI.IIIlIlI ()Lk74/x/IIllIIIl;
      // 04d: astore 4
      // 04f: aload 4
      // 051: ifnull 068
      // 054: aload 4
      // 056: invokevirtual k74/x/IIllIIIl.lII ()Z
      // 059: ifeq 068
      // 05c: goto 063
      // 05f: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 062: athrow
      // 063: return
      // 064: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 067: athrow
      // 068: aload 0
      // 069: getfield k74/x/IllllI.llII Lk74/x/lllIIlII;
      // 06c: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 06f: checkcast java/lang/Boolean
      // 072: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 075: ifeq 092
      // 078: aload 2
      // 079: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 07c: instanceof net/minecraft/class_490
      // 07f: ifne 092
      // 082: goto 089
      // 085: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 088: athrow
      // 089: aload 0
      // 08a: invokevirtual k74/x/IllllI.Illl ()V
      // 08d: return
      // 08e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 091: athrow
      // 092: aload 0
      // 093: invokevirtual k74/x/IllllI.IIIll ()Z
      // 096: ifeq 0a7
      // 099: aload 0
      // 09a: aload 2
      // 09b: aload 2
      // 09c: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 09f: invokevirtual k74/x/IllllI.lIll (Lnet/minecraft/class_310;Lnet/minecraft/class_746;)V
      // 0a2: return
      // 0a3: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a6: athrow
      // 0a7: aload 0
      // 0a8: getfield k74/x/IllllI.llIl Z
      // 0ab: ifeq 0c7
      // 0ae: aload 2
      // 0af: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0b2: instanceof net/minecraft/class_490
      // 0b5: ifeq 0c7
      // 0b8: goto 0bf
      // 0bb: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0be: athrow
      // 0bf: bipush 1
      // 0c0: goto 0c8
      // 0c3: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c6: athrow
      // 0c7: bipush 0
      // 0c8: istore 4
      // 0ca: aload 0
      // 0cb: getfield k74/x/IllllI.llII Lk74/x/lllIIlII;
      // 0ce: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0d1: checkcast java/lang/Boolean
      // 0d4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0d7: ifne 110
      // 0da: aload 0
      // 0db: getfield k74/x/IllllI.lIll Lk74/x/lllIIlII;
      // 0de: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0e1: checkcast java/lang/Boolean
      // 0e4: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0e7: ifeq 110
      // 0ea: goto 0f1
      // 0ed: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f0: athrow
      // 0f1: aload 2
      // 0f2: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0f5: ifnull 110
      // 0f8: goto 0ff
      // 0fb: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0fe: athrow
      // 0ff: iload 4
      // 101: ifne 110
      // 104: goto 10b
      // 107: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 10a: athrow
      // 10b: return
      // 10c: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 10f: athrow
      // 110: aload 2
      // 111: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 114: ifnull 139
      // 117: aload 2
      // 118: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 11b: instanceof net/minecraft/class_490
      // 11e: ifne 139
      // 121: goto 128
      // 124: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 127: athrow
      // 128: iload 4
      // 12a: ifne 139
      // 12d: goto 134
      // 130: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 133: athrow
      // 134: return
      // 135: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 138: athrow
      // 139: aload 2
      // 13a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 13d: astore 5
      // 13f: aload 0
      // 140: aload 5
      // 142: invokevirtual k74/x/IllllI.llII (Lnet/minecraft/class_746;)V
      // 145: aload 0
      // 146: invokevirtual k74/x/IllllI.IIlll ()Z
      // 149: ifeq 1f1
      // 14c: aload 0
      // 14d: getfield k74/x/IllllI.IlI Z
      // 150: ifeq 17f
      // 153: goto 15a
      // 156: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 159: athrow
      // 15a: aload 5
      // 15c: getfield net/minecraft/class_746.field_6012 I
      // 15f: aload 0
      // 160: getfield k74/x/IllllI.IlII I
      // 163: if_icmpge 172
      // 166: goto 16d
      // 169: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16c: athrow
      // 16d: return
      // 16e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 171: athrow
      // 172: aload 0
      // 173: aload 2
      // 174: invokevirtual k74/x/IllllI.IIlII (Lnet/minecraft/class_310;)Z
      // 177: ifne 192
      // 17a: return
      // 17b: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 17e: athrow
      // 17f: aload 2
      // 180: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 183: instanceof net/minecraft/class_490
      // 186: ifne 192
      // 189: aload 0
      // 18a: invokevirtual k74/x/IllllI.Illl ()V
      // 18d: return
      // 18e: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 191: athrow
      // 192: aload 0
      // 193: getfield k74/x/IllllI.IlI Z
      // 196: ifne 1ad
      // 199: aload 0
      // 19a: aload 2
      // 19b: invokevirtual k74/x/IllllI.IIlII (Lnet/minecraft/class_310;)Z
      // 19e: ifne 1ad
      // 1a1: goto 1a8
      // 1a4: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a7: athrow
      // 1a8: return
      // 1a9: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1ac: athrow
      // 1ad: aload 0
      // 1ae: aload 2
      // 1af: aload 5
      // 1b1: aload 0
      // 1b2: getfield k74/x/IllllI.lIlI I
      // 1b5: aload 0
      // 1b6: getfield k74/x/IllllI.IIIl I
      // 1b9: invokevirtual k74/x/IllllI.IIl (Lnet/minecraft/class_310;Lnet/minecraft/class_746;II)Z
      // 1bc: istore 6
      // 1be: aload 0
      // 1bf: invokestatic java/lang/System.currentTimeMillis ()J
      // 1c2: putfield k74/x/IllllI.IIll J
      // 1c5: aload 0
      // 1c6: aload 0
      // 1c7: invokevirtual k74/x/IllllI.IllII ()J
      // 1ca: putfield k74/x/IllllI.ll J
      // 1cd: aload 0
      // 1ce: getfield k74/x/IllllI.llIl Z
      // 1d1: ifeq 1ec
      // 1d4: iload 6
      // 1d6: ifeq 1ec
      // 1d9: goto 1e0
      // 1dc: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1df: athrow
      // 1e0: aload 0
      // 1e1: aload 2
      // 1e2: invokevirtual k74/x/IllllI.IIIlI (Lnet/minecraft/class_310;)V
      // 1e5: goto 1ec
      // 1e8: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1eb: athrow
      // 1ec: aload 0
      // 1ed: invokevirtual k74/x/IllllI.Illl ()V
      // 1f0: return
      // 1f1: aload 2
      // 1f2: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 1f5: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 1f8: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 1fb: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 1fe: ifne 206
      // 201: return
      // 202: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 205: athrow
      // 206: invokestatic java/lang/System.currentTimeMillis ()J
      // 209: aload 0
      // 20a: getfield k74/x/IllllI.IIll J
      // 20d: lsub
      // 20e: aload 0
      // 20f: getfield k74/x/IllllI.ll J
      // 212: lcmp
      // 213: ifge 21b
      // 216: return
      // 217: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21a: athrow
      // 21b: aload 2
      // 21c: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 21f: instanceof net/minecraft/class_490
      // 222: istore 6
      // 224: iload 6
      // 226: ifeq 335
      // 229: bipush 0
      // 22a: istore 7
      // 22c: bipush 0
      // 22d: istore 8
      // 22f: iload 8
      // 231: ldc_w -433413962
      // 234: ldc_w -1133562887
      // 237: ldc_w -1747349825
      // 23a: ixor
      // 23b: invokestatic k74/x/IllllI.lIIlI (II)I
      // 23e: if_icmpge 319
      // 241: aload 2
      // 242: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 245: getfield net/minecraft/class_746.field_7498 Lnet/minecraft/class_1723;
      // 248: invokevirtual net/minecraft/class_1723.method_34255 ()Lnet/minecraft/class_1799;
      // 24b: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 24e: ifne 258
      // 251: goto 319
      // 254: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 257: athrow
      // 258: aload 5
      // 25a: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 25d: iload 8
      // 25f: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 262: astore 9
      // 264: aload 0
      // 265: aload 2
      // 266: aload 9
      // 268: iload 8
      // 26a: invokevirtual k74/x/IllllI.ll (Lnet/minecraft/class_310;Lnet/minecraft/class_1799;I)Z
      // 26d: ifeq 277
      // 270: goto 312
      // 273: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 276: athrow
      // 277: aload 0
      // 278: iload 8
      // 27a: aload 9
      // 27c: invokevirtual k74/x/IllllI.IIII (ILnet/minecraft/class_1799;)Lnet/minecraft/class_1799;
      // 27f: astore 10
      // 281: aload 10
      // 283: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 286: ifne 312
      // 289: aload 0
      // 28a: aload 9
      // 28c: aload 10
      // 28e: invokevirtual k74/x/IllllI.IlllI (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 291: ifeq 312
      // 294: goto 29b
      // 297: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 29a: athrow
      // 29b: aload 0
      // 29c: aload 10
      // 29e: invokevirtual k74/x/IllllI.llI (Lnet/minecraft/class_1799;)Z
      // 2a1: ifne 2b2
      // 2a4: goto 2ab
      // 2a7: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2aa: athrow
      // 2ab: goto 312
      // 2ae: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2b1: athrow
      // 2b2: aload 0
      // 2b3: aload 5
      // 2b5: aload 10
      // 2b7: invokevirtual k74/x/IllllI.lIIl (Lnet/minecraft/class_746;Lnet/minecraft/class_1799;)I
      // 2ba: istore 11
      // 2bc: iload 11
      // 2be: ifge 2c8
      // 2c1: goto 312
      // 2c4: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2c7: athrow
      // 2c8: ldc_w -433413963
      // 2cb: ldc_w -1133562887
      // 2ce: ldc_w 367686433
      // 2d1: ixor
      // 2d2: invokestatic k74/x/IllllI.lIIlI (II)I
      // 2d5: iload 8
      // 2d7: iadd
      // 2d8: istore 12
      // 2da: aload 0
      // 2db: aload 2
      // 2dc: invokevirtual k74/x/IllllI.IIlII (Lnet/minecraft/class_310;)Z
      // 2df: ifne 2e7
      // 2e2: return
      // 2e3: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2e6: athrow
      // 2e7: iload 7
      // 2e9: ifne 2fc
      // 2ec: aload 0
      // 2ed: iload 11
      // 2ef: iload 12
      // 2f1: aload 5
      // 2f3: aload 2
      // 2f4: invokevirtual k74/x/IllllI.lIIII (IILnet/minecraft/class_746;Lnet/minecraft/class_310;)V
      // 2f7: return
      // 2f8: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2fb: athrow
      // 2fc: aload 0
      // 2fd: aload 2
      // 2fe: aload 5
      // 300: iload 11
      // 302: iload 12
      // 304: invokevirtual k74/x/IllllI.IIl (Lnet/minecraft/class_310;Lnet/minecraft/class_746;II)Z
      // 307: ifne 30f
      // 30a: return
      // 30b: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30e: athrow
      // 30f: iinc 7 1
      // 312: iinc 8 1
      // 315: aload 1
      // 316: ifnull 22f
      // 319: iload 7
      // 31b: ifle 334
      // 31e: aload 0
      // 31f: invokestatic java/lang/System.currentTimeMillis ()J
      // 322: putfield k74/x/IllllI.IIll J
      // 325: aload 0
      // 326: aload 0
      // 327: invokevirtual k74/x/IllllI.IllII ()J
      // 32a: putfield k74/x/IllllI.ll J
      // 32d: goto 334
      // 330: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 333: athrow
      // 334: return
      // 335: bipush 0
      // 336: istore 7
      // 338: iload 7
      // 33a: ldc_w -433413964
      // 33d: ldc_w -1133562887
      // 340: ldc_w -1212711114
      // 343: ixor
      // 344: invokestatic k74/x/IllllI.lIIlI (II)I
      // 347: if_icmpge 400
      // 34a: aload 5
      // 34c: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 34f: iload 7
      // 351: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 354: astore 8
      // 356: aload 0
      // 357: iload 7
      // 359: aload 8
      // 35b: invokevirtual k74/x/IllllI.IIII (ILnet/minecraft/class_1799;)Lnet/minecraft/class_1799;
      // 35e: astore 9
      // 360: aload 9
      // 362: invokevirtual net/minecraft/class_1799.method_7960 ()Z
      // 365: ifne 3f9
      // 368: aload 0
      // 369: aload 8
      // 36b: aload 9
      // 36d: invokevirtual k74/x/IllllI.IlllI (Lnet/minecraft/class_1799;Lnet/minecraft/class_1799;)Z
      // 370: ifeq 3f9
      // 373: goto 37a
      // 376: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 379: athrow
      // 37a: aload 0
      // 37b: aload 9
      // 37d: invokevirtual k74/x/IllllI.llI (Lnet/minecraft/class_1799;)Z
      // 380: ifeq 3f9
      // 383: goto 38a
      // 386: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 389: athrow
      // 38a: aload 0
      // 38b: aload 9
      // 38d: invokevirtual k74/x/IllllI.Il (Lnet/minecraft/class_1799;)Z
      // 390: ifne 3a1
      // 393: goto 39a
      // 396: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 399: athrow
      // 39a: goto 3f9
      // 39d: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3a0: athrow
      // 3a1: aload 0
      // 3a2: aload 5
      // 3a4: aload 9
      // 3a6: invokevirtual k74/x/IllllI.lIIl (Lnet/minecraft/class_746;Lnet/minecraft/class_1799;)I
      // 3a9: istore 10
      // 3ab: iload 10
      // 3ad: ifge 3b7
      // 3b0: goto 3f9
      // 3b3: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3b6: athrow
      // 3b7: ldc_w -433413957
      // 3ba: ldc_w -1133562887
      // 3bd: ldc_w -286337303
      // 3c0: ixor
      // 3c1: invokestatic k74/x/IllllI.lIIlI (II)I
      // 3c4: iload 7
      // 3c6: iadd
      // 3c7: istore 11
      // 3c9: aload 0
      // 3ca: getfield k74/x/IllllI.llII Lk74/x/lllIIlII;
      // 3cd: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 3d0: checkcast java/lang/Boolean
      // 3d3: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 3d6: ifeq 3e0
      // 3d9: goto 3f9
      // 3dc: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3df: athrow
      // 3e0: aload 0
      // 3e1: aload 2
      // 3e2: invokevirtual k74/x/IllllI.IIlII (Lnet/minecraft/class_310;)Z
      // 3e5: ifne 3ed
      // 3e8: return
      // 3e9: invokestatic k74/x/IllllI.III (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3ec: athrow
      // 3ed: aload 0
      // 3ee: iload 10
      // 3f0: iload 11
      // 3f2: aload 5
      // 3f4: aload 2
      // 3f5: invokevirtual k74/x/IllllI.lIIII (IILnet/minecraft/class_746;Lnet/minecraft/class_310;)V
      // 3f8: return
      // 3f9: iinc 7 1
      // 3fc: aload 1
      // 3fd: ifnull 338
      // 400: return
   }
}
