package k74.x;

import java.util.List;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_3675.class_307;

@Environment(EnvType.CLIENT)
public final class IIlIlllll extends IlIIIIIIl {
   private static final String[] I;
   private final lllIIlII II;
   private static final Object[] Ill;
   private static final String[] IlI;
   private final lllIIlII Il;
   private final IllIlIl lI;
   private boolean ll;
   private static final int[] IIl;
   private static final String[] III;

   private void I(String var1) {
      String var2 = Ill(var1);
      if (!var2.isEmpty()) {
         this.lI.lI(var2);
      }
   }

   public boolean l(class_1657 var1) {
      return var1 != null && var1.method_7334() != null ? this.lIl(lIlIIIll.Ill(var1.method_7334())) : false;
   }

   public IIlIlllll() {
      int var1 = -173884590;
      super(
         IlIIllIII.Ill(IIl(llI(-1094292892, var1 ^ 770008877), llI(-1094292891, var1 ^ -1545024490))),
         lllIIlIl.Ill,
         IlIIllIII.Ill(IIl(llI(-1094292890, var1 ^ 1217701762), llI(-1094292889, var1 ^ 1316796141)))
      );
      this.II = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl(llI(-1094292872, var1 ^ -1541594456), llI(-1094292871, var1 ^ 262703806))), true));
      this.Il = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl(llI(-1094292870, var1 ^ -1194413736), llI(-1094292869, var1 ^ 128035765))), true));
      this.lI = this.IllIIll(new IllIlIl(IlIIllIII.Ill(IIl(llI(-1094292868, var1 ^ 1025298757), llI(-1094292867, var1 ^ -1985965924))), List.of()));
      this.IlIllIl(true);
   }

   private static int llI(int var0, int var1) {
      int var2 = IIl[var0 ^ -1094292888] ^ var1 ^ var0;
      var2 -= 64339;
      var2 ^= 29756;
      var2 -= 41604;
      var2 ^= 9222;
      var2 -= 8179;
      return var2 + 1064;
   }

   @Override
   public void llIl() {
      this.ll = false;
      IIIlIllll.Ill();
   }

   private static String II(String var0) {
      String var1 = var0 == null
         ? ""
         : var0.trim().replaceAll(IlIIllIII.lI(IIl(llI(-1094292866, -1591951029 ^ 1705888305), llI(-1094292865, -1591951029 ^ 1438792893))), "");
      return var1.length() <= llI(-1094292880, -1591951029 ^ -271222755) ? var1 : var1.substring(0, llI(-1094292879, -1591951029 ^ 1237719560));
   }

   public List<String> Il() {
      return List.copyOf(this.lI.IIlI());
   }

   @Override
   public void IllIll(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 == null) {
         this.ll = false;
      } else {
         boolean var3 = IIll.IIIllll(var1, class_307.field_1672.method_1447(2));
         boolean var4 = var3 && !this.ll;
         this.ll = var3;
         if (var4 && this.Il.IllI() && var1.field_1755 == null && var1.field_1724 != null) {
            class_1657 var5 = null;
            if (var1.field_1765 instanceof class_3966 var6 && var6.method_17782() instanceof class_1657 var7) {
               var5 = var7;
            } else {
               class_3966 var13 = IIll.lIlll(var1, 6.0);
               if (var13 != null && var13.method_17782() instanceof class_1657 var9) {
                  var5 = var9;
               }
            }

            if (var5 != null && var5 != var1.field_1724 && var5.method_7334() != null) {
               String var11 = II(lIlIIIll.Ill(var5.method_7334()));
               if (!var11.isEmpty()) {
                  label55: {
                     if (this.lIl(var11)) {
                        this.I(var11);
                        if (var2 == null) {
                           break label55;
                        }
                     }

                     this.III(var11);
                  }

                  this.ll();
               }
            }
         }
      }
   }

   public boolean lI(class_1657 var1) {
      return (!this.IIIIlIl() || this.II.IllI()) && this.l(var1);
   }

   @Override
   public boolean llllIl(class_310 var1) {
      return this.Il.IllI();
   }

   private static String lll(int var0, int var1) {
      int var3 = var0 ^ -1855399583;
      char[] var4 = IlI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])Ill[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         Ill[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 819725603;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 104;
            case 1 -> 250;
            case 2 -> 53;
            case 3 -> 233;
            case 4 -> 246;
            case 5 -> 64;
            case 6 -> 88;
            case 7 -> 193;
            case 8 -> 218;
            case 9 -> 196;
            case 10 -> 73;
            case 11 -> 45;
            case 12 -> 237;
            case 13 -> 254;
            case 14 -> 130;
            case 15 -> 172;
            case 16 -> 98;
            case 17 -> 5;
            case 18 -> 108;
            case 19 -> 171;
            case 20 -> 144;
            case 21 -> 186;
            case 22 -> 172;
            case 23 -> 34;
            case 24 -> 200;
            case 25 -> 48;
            case 26 -> 45;
            case 27 -> 1;
            case 28 -> 63;
            case 29 -> 171;
            case 30 -> 191;
            case 31 -> 40;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private void ll() {
      int var5 = -1219580943;
      List var1 = this.Il();
      String var10000 = this.IIIlIlI();
      String var10001 = IlIIllIII.lI(IIl(llI(-1094292878, var5 ^ -1924694550), llI(-1094292877, var5 ^ -808144141)));
      String var4 = var1.isEmpty()
         ? IlIIllIII.lI(IIl(llI(-1094292876, var5 ^ -67702093), llI(-1094292875, var5 ^ -1925845017)))
         : String.join(IlIIllIII.lI(IIl(llI(-1094292874, var5 ^ 116777587), llI(-1094292873, var5 ^ 1310518801))), var1);
      String var3 = var10001;
      String var2 = var10000;
      IllIlIlI.I(var2 + var3 + var4);
   }

   @Override
   public void IIlIl() {
      IIIlIllll.Ill();
   }

   private void III(String var1) {
      String var2 = II(var1);
      if (!var2.isEmpty() && !this.lIl(var2)) {
         this.lI.IlI(var2);
      }
   }

   private static String IIl(int var0, int var1) {
      int var9 = -480229979;
      int var2 = (var0 ^ llI(-1094292920, var9 ^ 517709314)) & llI(-1094292919, var9 ^ 28570312);
      if (I[var2] == null) {
         char[] var3 = III[var2].toCharArray();

         int var4 = switch (var3[0] & llI(-1094292918, var9 ^ -1636456624)) {
            case 0 -> llI(-1094292917, var9 ^ 188580131);
            case 1 -> llI(-1094292916, var9 ^ 2090195661);
            case 2 -> llI(-1094292915, var9 ^ -129661111);
            case 3 -> llI(-1094292914, var9 ^ -125591886);
            case 4 -> llI(-1094292913, var9 ^ 480231638);
            case 5 -> llI(-1094292928, var9 ^ -1952885643);
            case 6 -> llI(-1094292927, var9 ^ 1967837563);
            case 7 -> llI(-1094292926, var9 ^ -1953250686);
            case 8 -> llI(-1094292925, var9 ^ 1037676872);
            case 9 -> llI(-1094292924, var9 ^ -630372939);
            case 10 -> llI(-1094292923, var9 ^ -207822550);
            case 11 -> llI(-1094292922, var9 ^ -1130329022);
            case 12 -> llI(-1094292921, var9 ^ -1753552375);
            case 13 -> llI(-1094292904, var9 ^ 2053155340);
            case 14 -> llI(-1094292903, var9 ^ 1131293587);
            case 15 -> llI(-1094292902, var9 ^ -1784442857);
            case 16 -> llI(-1094292901, var9 ^ 687568);
            case 17 -> llI(-1094292900, var9 ^ 1718799242);
            case 18 -> llI(-1094292899, var9 ^ 1524700776);
            case 19 -> llI(-1094292898, var9 ^ 1935256939);
            case 20 -> llI(-1094292897, var9 ^ 713828104);
            case 21 -> llI(-1094292912, var9 ^ -1297465650);
            case 22 -> llI(-1094292911, var9 ^ 641816282);
            case 23 -> llI(-1094292910, var9 ^ -478921140);
            case 24 -> llI(-1094292909, var9 ^ -489189230);
            case 25 -> llI(-1094292908, var9 ^ -896198780);
            case 26 -> llI(-1094292907, var9 ^ -1180860928);
            case 27 -> llI(-1094292906, var9 ^ -79536800);
            case 28 -> llI(-1094292905, var9 ^ -1632583219);
            case 29 -> llI(-1094292952, var9 ^ 435988511);
            case 30 -> llI(-1094292951, var9 ^ 1744797282);
            case 31 -> llI(-1094292950, var9 ^ 1654726952);
            case 32 -> llI(-1094292949, var9 ^ -631985042);
            case 33 -> llI(-1094292948, var9 ^ -49466168);
            case 34 -> llI(-1094292947, var9 ^ 926005783);
            case 35 -> llI(-1094292946, var9 ^ 1547513700);
            case 36 -> llI(-1094292945, var9 ^ 1526016697);
            case 37 -> llI(-1094292960, var9 ^ -1643181761);
            case 38 -> llI(-1094292959, var9 ^ -834830147);
            case 39 -> 1;
            case 40 -> llI(-1094292958, var9 ^ 59340496);
            case 41 -> llI(-1094292957, var9 ^ 926948991);
            case 42 -> llI(-1094292956, var9 ^ -1657950342);
            case 43 -> llI(-1094292955, var9 ^ -2026279285);
            case 44 -> llI(-1094292954, var9 ^ 1267040266);
            case 45 -> llI(-1094292953, var9 ^ -1469332340);
            case 46 -> llI(-1094292936, var9 ^ -320210857);
            case 47 -> llI(-1094292935, var9 ^ -1333229600);
            case 48 -> llI(-1094292934, var9 ^ -983023383);
            case 49 -> llI(-1094292933, var9 ^ 339015866);
            case 50 -> llI(-1094292932, var9 ^ -211972799);
            case 51 -> llI(-1094292931, var9 ^ 691992747);
            case 52 -> 0;
            case 53 -> llI(-1094292930, var9 ^ -937464821);
            case 54 -> llI(-1094292929, var9 ^ -1603405366);
            case 55 -> llI(-1094292944, var9 ^ 893373425);
            case 56 -> llI(-1094292943, var9 ^ 1764365555);
            case 57 -> llI(-1094292942, var9 ^ -1299452747);
            case 58 -> llI(-1094292941, var9 ^ -199331183);
            case 59 -> llI(-1094292940, var9 ^ -885827267);
            case 60 -> llI(-1094292939, var9 ^ 1875345777);
            case 61 -> llI(-1094292938, var9 ^ -148532642);
            case 62 -> llI(-1094292937, var9 ^ 362317160);
            case 63 -> llI(-1094292984, var9 ^ 50230960);
            case 64 -> llI(-1094292983, var9 ^ -662167074);
            case 65 -> llI(-1094292982, var9 ^ 1713918372);
            case 66 -> llI(-1094292981, var9 ^ 681724656);
            case 67 -> llI(-1094292980, var9 ^ 305052481);
            case 68 -> llI(-1094292979, var9 ^ -1571191236);
            case 69 -> llI(-1094292978, var9 ^ -1141427176);
            case 70 -> llI(-1094292977, var9 ^ 1269180121);
            case 71 -> llI(-1094292992, var9 ^ 1711360817);
            case 72 -> llI(-1094292991, var9 ^ 699983659);
            case 73 -> llI(-1094292990, var9 ^ -1599479031);
            case 74 -> llI(-1094292989, var9 ^ -1758616491);
            case 75 -> llI(-1094292988, var9 ^ 1974137331);
            case 76 -> llI(-1094292987, var9 ^ 1745951069);
            case 77 -> llI(-1094292986, var9 ^ -309554427);
            case 78 -> llI(-1094292985, var9 ^ -929220608);
            case 79 -> llI(-1094292968, var9 ^ 139538694);
            case 80 -> llI(-1094292967, var9 ^ 46332817);
            case 81 -> llI(-1094292966, var9 ^ 1663088822);
            case 82 -> llI(-1094292965, var9 ^ 1445891528);
            case 83 -> llI(-1094292964, var9 ^ 257743310);
            case 84 -> llI(-1094292963, var9 ^ -477276106);
            case 85 -> llI(-1094292962, var9 ^ -1523170902);
            case 86 -> llI(-1094292961, var9 ^ -1417586309);
            case 87 -> 2;
            case 88 -> llI(-1094292976, var9 ^ -2111692249);
            case 89 -> llI(-1094292975, var9 ^ 144720310);
            case 90 -> llI(-1094292974, var9 ^ -1529281694);
            case 91 -> llI(-1094292973, var9 ^ -2128295478);
            case 92 -> llI(-1094292972, var9 ^ 1295489694);
            case 93 -> llI(-1094292971, var9 ^ -855101326);
            case 94 -> llI(-1094292970, var9 ^ -718836332);
            case 95 -> llI(-1094292969, var9 ^ -1501606981);
            case 96 -> llI(-1094292760, var9 ^ -1932672819);
            case 97 -> llI(-1094292759, var9 ^ -662882202);
            case 98 -> llI(-1094292758, var9 ^ 1663429518);
            case 99 -> llI(-1094292757, var9 ^ -1947313728);
            case 100 -> llI(-1094292756, var9 ^ 1219501096);
            case 101 -> llI(-1094292755, var9 ^ 1021963608);
            case 102 -> llI(-1094292754, var9 ^ 1317453570);
            case 103 -> llI(-1094292753, var9 ^ 2070118021);
            case 104 -> llI(-1094292768, var9 ^ -467590886);
            case 105 -> llI(-1094292767, var9 ^ 512683877);
            case 106 -> llI(-1094292766, var9 ^ 509919007);
            case 107 -> llI(-1094292765, var9 ^ -735879982);
            case 108 -> llI(-1094292764, var9 ^ -1855159080);
            case 109 -> llI(-1094292763, var9 ^ 201390344);
            case 110 -> llI(-1094292762, var9 ^ -969454607);
            case 111 -> llI(-1094292761, var9 ^ -1410621957);
            case 112 -> llI(-1094292744, var9 ^ 1765679873);
            case 113 -> llI(-1094292743, var9 ^ -1198239629);
            case 114 -> llI(-1094292742, var9 ^ -1523342433);
            case 115 -> llI(-1094292741, var9 ^ -1513661911);
            case 116 -> llI(-1094292740, var9 ^ 1952720563);
            case 117 -> llI(-1094292739, var9 ^ 987283428);
            case 118 -> llI(-1094292738, var9 ^ -946429119);
            case 119 -> llI(-1094292737, var9 ^ -264377791);
            case 120 -> llI(-1094292752, var9 ^ -1529834769);
            case 121 -> llI(-1094292751, var9 ^ 683317080);
            case 122 -> llI(-1094292750, var9 ^ 1628855566);
            case 123 -> llI(-1094292749, var9 ^ 1294752662);
            case 124 -> llI(-1094292748, var9 ^ -1546471901);
            case 125 -> llI(-1094292747, var9 ^ -599148429);
            case 126 -> llI(-1094292746, var9 ^ -105214360);
            case 127 -> llI(-1094292745, var9 ^ 1182361120);
            case 128 -> llI(-1094292792, var9 ^ 865585458);
            case 129 -> llI(-1094292791, var9 ^ 1320696844);
            case 130 -> llI(-1094292790, var9 ^ -785946799);
            case 131 -> llI(-1094292789, var9 ^ -1574756934);
            case 132 -> llI(-1094292788, var9 ^ -182512257);
            case 133 -> llI(-1094292787, var9 ^ -1346102248);
            case 134 -> llI(-1094292786, var9 ^ -256245288);
            case 135 -> llI(-1094292785, var9 ^ 1496446713);
            case 136 -> llI(-1094292800, var9 ^ -537519502);
            case 137 -> llI(-1094292799, var9 ^ 1719158468);
            case 138 -> llI(-1094292798, var9 ^ -2038246271);
            case 139 -> llI(-1094292797, var9 ^ 1655737223);
            case 140 -> llI(-1094292796, var9 ^ -912663543);
            case 141 -> llI(-1094292795, var9 ^ -406348224);
            case 142 -> llI(-1094292794, var9 ^ 1835288697);
            case 143 -> llI(-1094292793, var9 ^ 607962950);
            case 144 -> llI(-1094292776, var9 ^ 1652455959);
            case 145 -> llI(-1094292775, var9 ^ 951016995);
            case 146 -> llI(-1094292774, var9 ^ 271603251);
            case 147 -> llI(-1094292773, var9 ^ 702791941);
            case 148 -> llI(-1094292772, var9 ^ -1234189751);
            case 149 -> llI(-1094292771, var9 ^ -77048491);
            case 150 -> llI(-1094292770, var9 ^ 2018262463);
            case 151 -> llI(-1094292769, var9 ^ 1271562355);
            case 152 -> llI(-1094292784, var9 ^ 487989519);
            case 153 -> llI(-1094292783, var9 ^ 1756145683);
            case 154 -> llI(-1094292782, var9 ^ 1847446124);
            case 155 -> llI(-1094292781, var9 ^ -2043099156);
            case 156 -> llI(-1094292780, var9 ^ 1692482871);
            case 157 -> llI(-1094292779, var9 ^ -127403279);
            case 158 -> llI(-1094292778, var9 ^ -1974760666);
            case 159 -> llI(-1094292777, var9 ^ -1272206728);
            case 160 -> 3;
            case 161 -> llI(-1094292824, var9 ^ -1229223477);
            case 162 -> llI(-1094292823, var9 ^ -652796067);
            case 163 -> llI(-1094292822, var9 ^ 383146334);
            case 164 -> llI(-1094292821, var9 ^ -1067027888);
            case 165 -> llI(-1094292820, var9 ^ 1587571816);
            case 166 -> llI(-1094292819, var9 ^ -13778963);
            case 167 -> llI(-1094292818, var9 ^ -1845987559);
            case 168 -> llI(-1094292817, var9 ^ 265214977);
            case 169 -> 4;
            case 170 -> llI(-1094292832, var9 ^ 1683310272);
            case 171 -> llI(-1094292831, var9 ^ 1678275181);
            case 172 -> llI(-1094292830, var9 ^ 1368823211);
            case 173 -> llI(-1094292829, var9 ^ 104095983);
            case 174 -> llI(-1094292828, var9 ^ 1999045504);
            case 175 -> llI(-1094292827, var9 ^ -700510916);
            case 176 -> llI(-1094292826, var9 ^ 1159214390);
            case 177 -> llI(-1094292825, var9 ^ 1076127542);
            case 178 -> llI(-1094292808, var9 ^ 2093855070);
            case 179 -> llI(-1094292807, var9 ^ -1993634884);
            case 180 -> llI(-1094292806, var9 ^ 1316292468);
            case 181 -> llI(-1094292805, var9 ^ 1944637729);
            case 182 -> llI(-1094292804, var9 ^ -245174506);
            case 183 -> llI(-1094292803, var9 ^ 1438380716);
            case 184 -> llI(-1094292802, var9 ^ 1549206346);
            case 185 -> llI(-1094292801, var9 ^ 1640999919);
            case 186 -> llI(-1094292816, var9 ^ -1731589295);
            case 187 -> llI(-1094292815, var9 ^ 89519703);
            case 188 -> llI(-1094292814, var9 ^ 136088835);
            case 189 -> llI(-1094292813, var9 ^ 1516040810);
            case 190 -> llI(-1094292812, var9 ^ -967267903);
            case 191 -> llI(-1094292811, var9 ^ 352000957);
            case 192 -> llI(-1094292810, var9 ^ 403406412);
            case 193 -> llI(-1094292809, var9 ^ 605239612);
            case 194 -> llI(-1094292856, var9 ^ 2012310004);
            case 195 -> llI(-1094292855, var9 ^ 1913659248);
            case 196 -> llI(-1094292854, var9 ^ -892070277);
            case 197 -> llI(-1094292853, var9 ^ 502200642);
            case 198 -> llI(-1094292852, var9 ^ -61743424);
            case 199 -> llI(-1094292851, var9 ^ -1466641911);
            case 200 -> llI(-1094292850, var9 ^ -1392164511);
            case 201 -> llI(-1094292849, var9 ^ -1989058201);
            case 202 -> llI(-1094292864, var9 ^ -95476013);
            case 203 -> llI(-1094292863, var9 ^ -1654044686);
            case 204 -> llI(-1094292862, var9 ^ 1689213988);
            case 205 -> llI(-1094292861, var9 ^ 487802888);
            case 206 -> llI(-1094292860, var9 ^ 694629209);
            case 207 -> llI(-1094292859, var9 ^ -169887508);
            case 208 -> llI(-1094292858, var9 ^ 1292382543);
            case 209 -> llI(-1094292857, var9 ^ -466252160);
            case 210 -> llI(-1094292840, var9 ^ 2102707141);
            case 211 -> llI(-1094292839, var9 ^ -1960260940);
            case 212 -> llI(-1094292838, var9 ^ -539526910);
            case 213 -> llI(-1094292837, var9 ^ -1608670306);
            case 214 -> llI(-1094292836, var9 ^ -1043158924);
            case 215 -> llI(-1094292835, var9 ^ 615252674);
            case 216 -> llI(-1094292834, var9 ^ 1793984024);
            case 217 -> llI(-1094292833, var9 ^ -1269124442);
            case 218 -> llI(-1094292848, var9 ^ 1438834630);
            case 219 -> llI(-1094292847, var9 ^ 2033068972);
            case 220 -> llI(-1094292846, var9 ^ -557248961);
            case 221 -> llI(-1094292845, var9 ^ 2027953577);
            case 222 -> llI(-1094292844, var9 ^ 881671066);
            case 223 -> llI(-1094292843, var9 ^ 621873143);
            case 224 -> llI(-1094292842, var9 ^ -1014416030);
            case 225 -> llI(-1094292841, var9 ^ 635656801);
            case 226 -> llI(-1094292632, var9 ^ 1081460250);
            case 227 -> llI(-1094292631, var9 ^ -1162988293);
            case 228 -> llI(-1094292630, var9 ^ -1177225365);
            case 229 -> llI(-1094292629, var9 ^ 1737197608);
            case 230 -> llI(-1094292628, var9 ^ 8641409);
            case 231 -> llI(-1094292627, var9 ^ -1085264582);
            case 232 -> llI(-1094292626, var9 ^ -1485515991);
            case 233 -> llI(-1094292625, var9 ^ -202268268);
            case 234 -> llI(-1094292640, var9 ^ -1371305531);
            case 235 -> llI(-1094292639, var9 ^ 95141521);
            case 236 -> llI(-1094292638, var9 ^ 1042438260);
            case 237 -> llI(-1094292637, var9 ^ -1943699408);
            case 238 -> llI(-1094292636, var9 ^ 1879328733);
            case 239 -> llI(-1094292635, var9 ^ 22027806);
            case 240 -> llI(-1094292634, var9 ^ -1783453156);
            case 241 -> llI(-1094292633, var9 ^ 1582042926);
            case 242 -> llI(-1094292616, var9 ^ 315253647);
            case 243 -> llI(-1094292615, var9 ^ 223907948);
            case 244 -> llI(-1094292614, var9 ^ -166510575);
            case 245 -> llI(-1094292613, var9 ^ 66839715);
            case 246 -> llI(-1094292612, var9 ^ 1468066435);
            case 247 -> llI(-1094292611, var9 ^ -1163829138);
            case 248 -> llI(-1094292610, var9 ^ -582916375);
            case 249 -> llI(-1094292609, var9 ^ 1649154661);
            case 250 -> llI(-1094292624, var9 ^ 188455438);
            case 251 -> llI(-1094292623, var9 ^ -254525421);
            case 252 -> llI(-1094292622, var9 ^ 773835937);
            case 253 -> 5;
            case 254 -> llI(-1094292621, var9 ^ -1594952718);
            default -> llI(-1094292620, var9 ^ 1448490884);
         };
         int var5 = (var1 & llI(-1094292619, var9 ^ 860448459)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & llI(-1094292618, var9 ^ -1318242242)) >>> llI(-1094292617, var9 ^ -1686372636)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & llI(-1094292664, var9 ^ -1323583582);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & llI(-1094292663, var9 ^ 1810295093);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }

   private static String Ill(String var0) {
      return var0 == null ? "" : var0.trim().toLowerCase(Locale.ROOT);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = 1945360447;
      char[] var15 = "㫶㩑".toCharArray();
      String var14 = "ꤿ꧍ꦍ꤅ꥩꦝꥏꦌꥮꦩꦢꤙ꧰ꤵꥣꥰꦧꤽ꤅ꤳꦭ꥓ꤴꧧꤿꧺꥊ꧲ꥆꤹ꤉ꦻꥍꦕꥍꦦꥼ꧆ꥆꦛꤧꥡꦤꦉꧼ꧳ꥃ꤭ꤙ꧃\ua95bꧭꧣ꧲꤁ꦥꧦ꦳꧀꧶ꦢ꤂ꦰ꤆꤆ꧨ꧍ꥮꥢ\ua95c꥓ꥮꥷꤾ\ua955ꦯꧏꤋꦔ꧙꧉ꧤꦠꧤ꧙ꤙꦈꥺꤎ꧕ꥃꦸꥴꦿꤻ\ua9da꧵ꦺꧪꦺꤌꧢꥭꤱꦇꧠꦄꤪꥦꧾꥏꤒꤸ꧹ꧤ꤀\ua97dꧬꥊꦕꥊꦞꤔ\ua97eꤦꤱꤼ\ua97eꤤꤋ꧵ꦈꥰꥎࣷࢡࠥࡎࠊࡶࡐࡎ࢙࣊ࡒ\u088fࡻ\u0897ࢮࡘࣶࡅࡑࣵࠒࢪࢵࢨ࣫ࠗ\u086bࢪࠥ࠶ࣶࡡࡘ";
      byte var20 = -1;
      short var13 = 14960;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            IlI = var16;
            Ill = new Object[var16.length];
            int var9 = 2104603563;
            byte[] var7 = "§á¹Ùáç¨\u008f\u000e_\u007f0\u0013ßÐüxCã\u008d\u0015å\f\u008a\u0089¼Áæ\r\u0092\u0080Ðæf\u000e¬c@\u001e\u0011\u0010¤'i_s.k\u001bòtv\u0095ü\u0005|~\u0083´ÝxhSÜ\u0092\n1ì9¼\u0004Ö\u008eÙ¢\u001f1µ.À\u000b\u000bÂz¿´û\u009e\u0007\u0004£\u00167ktÍ\u008d\u007fñ=+l\u0093)ù¼~y»-?\t\u008f\rñ*ùÎúÅr\u000eá\u009c:ä\u00ad¿>\u000es\u0087!fÿ0¾£\u0091«+ë·\u0012\\Cì\u0090Ø\u0093±\"ØU¨\u008a<IõA«ObaU\u009cç\u0012«Eô\u0084\u001d\u000f\u0084íú»p\u001aÓJ×P\u009cvºy·¬Ü~Z¶\u009f c¸\u001d¿µu\u009dñ ÜKëF¤ýÓz7 \u001cS\u008f\u009bd\nZ\u0011A\u0092|\u000bq\u0006\u0097c^Ã¢\bCÂ\u0001¦¤êC!\u0087\u0099KHwÛ\u0094hÞ¾fÌ\r9*\u009eLG)HABw\u0017Kú\u0082\u009a\"ÝÛ\u0002Þ\u0017ç\u008fÙ|ë\u0019=z#\u001fF¾Ù?|îë¶\u001a#_{F\u0017\u0096(3½û\u0099e§ïX0kS¶X\u0088½ò³Ì?Î¨\u0090^±\u008cå¾M~4âÎ_Ó\u008b»J\tèÎÉèÉZL\u0080»Ït\u0015éÆ\\Iü\"\u008f\u0092]Ú«ÔÈD>ëålßO\u0011·Ë×ó\u009fø5N\u0088à\"(@´ø^\u0017ÞFþg\u008b\bt|è2ø\u008dy\u0082\u008f³Ø\u009b!\u0002\u009akp\u0013%F×F\u009a\tnê\u0099\u0080\u007fÕ\u001e·û\u0092rU|ÇrHÇ/2ÍZ¥ÊèK\u000e\u001e(\u0087\u0007 \"\u0014Í\fCö\u008epvø»µ/\u008a×ÌÃ[n(\u0085àw¿\u008bWo4¢ô\u0014I(vtz\u0084\u000f5p¡òÿ¦má\u0097(íÞ\u0006Dõñ[Á\u0086©}\u001d¬\u001bö~ø«\u000eºCóÞ¶«8T¸hf*Ð\u001c?ÛØnP\u0089\u0084[µHqÄ÷,S>XÚU>²\u008a\u0004ôõiÏ±º²:,ÖôCæáF¡\u008b=«OIè\u0015t\u0098B] \u0085å®Ø\u0085\u0011l\rT²+ÿ\u001a\u000e\u008aÊç@®\u0005ÐëÜÆ\u0084\u0006§Æ\bl\u009a\u0010AÀh\u001emún\u0099\u0083\u0004\u0083:ü\u009f\u008eÀÙl¸¾f¯Pê\u0013Aÿ±nn\t=ññRz\u0082õ+~ÕÉ#s\u008f\u0012\u0011@Ðl4áyçÀTÿ ,sF®p\b¦Tá\u00adBf½5éOÒÑÇ\u0011¨öM²F \u0004êñ\u0093B¨L¦\u0018yk\u00000æ`Ã\t5÷Ù\u0096¹ô\u00adÛ¾c±X\u009a\u000b¥k\u001cµH=À\u0017ÛHz\u009e\u008cNËÿE¦îÊ\u008aD7\b\u000fØ±Ì}ª\u009d\u0086k\u0094ý§\u0014\u0096m¿¥ùÁ*\u00136\u0000oªà°\u007f[~vZ\u0081ßû²Ú±.A</\u0018Ò¯D\u0083p}DÞD\u009aq@£\u0007&âV>Wñ5|öé\u0000<eÎ\u0003Ú`òR`\\\u001b¼I©ý½Æn£\nXS>älÑ´Ù(umÿ½|\u00815tA\u0019\u009d;¸\u001c=×%\u0083À#(Ê»Áz\u008aÄþæ\u008e\u009f\u00194--\u00128ÝsB\u0004Å\u000fÃW'dÂRÆ)×ê\u0002 \u007f=8ô[Ü\u0087èg\u0088Bä\r\u008dÓwÂ©§WøÚ\u0099\u0010=½¿qôDyj,=ÅE\u0012\t±\u0005UÕ\t\u008eUmÞ<XÄã»Ð]\u0082õ\u001c«þÿØÿ\u0001Où\u0080Ë\u0095$á\u0004\u009e¤\u0004z\u000fËJ83l\u0094\u008c\u0084eu\u0014ÒÎYø\u001drþ\u001f\u0003\u0005X6(Ç\u0014[\r\u0019\u0005Ç1Qã_\u000bü\u00055WP`£ò\u0092\u009ax\u0000w\u0099\u0002À[G]¿\u008c Uì¿\u009f\u0086\u001af\u0087¢ßäÓ'\u0096¼\u008e\u0095\u0085\u0004%}\u0089Â\u001eôlÌ¬ó\u008c÷PÒpù!\u0086)\u001fµd\u009d\u0006~\u009a8K2\u001cT5-\u008e§:ÖÅt\u009b#-Ð\u0003wVÝ|\u009awTÇý\u0097ReB\u009a-\u0085+í\u00ad²Ð\u0002t\u009d\u000eÉû\u0091\u00808ÿ&v\u0080;B\u0013\u009fQ\u000f\u0091¸4ù»\u00adò%\u0091Í\u0080[K0ÞÍ"
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

            String[] var5 = new String[llI(-1094292888, var24 ^ 396634520)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lll(-1855399583, var24 ^ 131313209)).length();
            int var1 = 4;
            int var26 = -1;

            label98:
            while (true) {
               int var29 = llI(-1094292887, var24 ^ 1369585873);
               String var10001 = var2.substring(++var26, var26 + var1);
               byte var10002 = -1;

               while (true) {
                  label93: {
                     char[] var45 = var10001.toCharArray();
                     int var10004 = var45.length;
                     int var6 = 0;
                     int var48 = var29;
                     var41 = var45;
                     int var35 = var10004;
                     char[] var57;
                     int var10006;
                     if (var10004 <= 1) {
                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     } else {
                        var48 = var29;
                        var35 = var10004;
                        if (var10004 <= var6) {
                           break label93;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % llI(-1094292883, var24 ^ -1516200764)) {
                           case 0 -> llI(-1094292882, var24 ^ 972646904);
                           case 1 -> llI(-1094292881, var24 ^ -1109972752);
                           case 2 -> llI(-1094292896, var24 ^ 1445176657);
                           case 3 -> llI(-1094292895, var24 ^ -754610622);
                           case 4 -> llI(-1094292894, var24 ^ -1595830429);
                           case 5 -> llI(-1094292893, var24 ^ -281625197);
                           default -> 3;
                        });
                        var6++;
                        if (var48 == 0) {
                           var10006 = var48;
                           var57 = var41;
                           var10004 = var48;
                        } else {
                           if (var35 <= var6) {
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
                        if ((var26 += var1) >= var4) {
                           III = var5;
                           I = new String[llI(-1094292884, var24 ^ -939101240)];
                           return;
                        }

                        var1 = var2.charAt(var26);
                        break;
                     default:
                        var5[var3++] = var50;
                        if ((var26 += var1) < var4) {
                           var1 = var2.charAt(var26);
                           continue label98;
                        }

                        var4 = (var2 = lll(-1855399584, var24 ^ -1507464176)).length();
                        var1 = llI(-1094292886, var24 ^ -1105531038);
                        var26 = -1;
                  }

                  var29 = llI(-1094292885, var24 ^ -1550157589);
                  var10001 = var2.substring(++var26, var26 + var1);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 56;
                  case 1 -> 76;
                  case 2 -> 250;
                  case 3 -> 38;
                  case 4 -> 93;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   public boolean lII(String var1) {
      return false;
   }

   public boolean lIl(String var1) {
      String[] var10000 = IIllllIl.IIIIl();
      String var3 = Ill(var1);
      String[] var2 = var10000;
      if (var3.isEmpty()) {
         return false;
      } else {
         for (IIIlIlIl var5 : this.lI.lIl()) {
            if (var5.Illl(var3)) {
               return true;
            }

            if (var2 != null) {
               break;
            }
         }

         return false;
      }
   }
}
