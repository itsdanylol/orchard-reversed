package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2815;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class IIllIll extends IlIIIIIIl {
   private static final String[] I;
   private static final String[] III;
   private static String[] II;
   private static final Object[] IIl;
   private static final String[] Il;
   private static final int[] ll;
   private boolean lI;

   @Override
   public void IlIII() {
      this.lI = false;
   }

   public void I() {
      this.lI = true;
   }

   public boolean l() {
      return this.IIIIlIl();
   }

   private static String II(char[] var0, long var1, int var3) {
      int var4 = III(-440649191, -2034215771 ^ -613186064) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & III(-440649192, -2034215771 ^ -1538046478);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static void Il() {
      int var0 = 1926158644;
      II[0] = II(lI(III(-440649185, var0 ^ 236174408), III(-440649186, var0 ^ -1950832607)).toCharArray(), 88785L, III(-440649187, var0 ^ -2066030394));
      II[1] = II(lI(III(-440649188, var0 ^ -1003002987), III(-440649213, var0 ^ -1923369020)).toCharArray(), 48249L, III(-440649214, var0 ^ -607297268));
   }

   private static int III(int var0, int var1) {
      int var2 = ll[var0 ^ -440649197] ^ var1 ^ var0;
      var2 ^= 55953;
      var2 += 40671;
      var2 -= 31395;
      var2 += 39436;
      var2 += 59079;
      var2 -= 47898;
      var2 -= 54015;
      return var2 - 37320;
   }

   private static String lI(int var0, int var1) {
      int var9 = -1453121587;
      int var2 = (var0 ^ III(-440649215, var9 ^ -1576162185)) & III(-440649216, var9 ^ 1467717939);
      if (Il[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & III(-440649209, var9 ^ -1140701462)) {
            case 0 -> III(-440649210, var9 ^ 1693638702);
            case 1 -> III(-440649211, var9 ^ -439020574);
            case 2 -> III(-440649212, var9 ^ -1072627771);
            case 3 -> III(-440649205, var9 ^ 207201371);
            case 4 -> III(-440649206, var9 ^ -1854401170);
            case 5 -> III(-440649207, var9 ^ -1460353418);
            case 6 -> III(-440649208, var9 ^ -1586148839);
            case 7 -> III(-440649201, var9 ^ -59939786);
            case 8 -> III(-440649202, var9 ^ 2034296059);
            case 9 -> III(-440649203, var9 ^ 1793769620);
            case 10 -> III(-440649204, var9 ^ -1661050780);
            case 11 -> III(-440649165, var9 ^ -2147316176);
            case 12 -> III(-440649166, var9 ^ -878660313);
            case 13 -> 5;
            case 14 -> III(-440649167, var9 ^ -1861966098);
            case 15 -> III(-440649168, var9 ^ -885068273);
            case 16 -> III(-440649161, var9 ^ 720656284);
            case 17 -> III(-440649162, var9 ^ -792759071);
            case 18 -> III(-440649163, var9 ^ 1674552587);
            case 19 -> III(-440649164, var9 ^ 342445190);
            case 20 -> III(-440649157, var9 ^ 1927619701);
            case 21 -> III(-440649158, var9 ^ -1024986272);
            case 22 -> III(-440649159, var9 ^ -2103587756);
            case 23 -> III(-440649160, var9 ^ -1518126524);
            case 24 -> III(-440649153, var9 ^ 863128760);
            case 25 -> III(-440649154, var9 ^ 207807576);
            case 26 -> III(-440649155, var9 ^ -1728840519);
            case 27 -> III(-440649156, var9 ^ -1155048392);
            case 28 -> III(-440649181, var9 ^ 1155711111);
            case 29 -> III(-440649182, var9 ^ 1122671145);
            case 30 -> III(-440649183, var9 ^ -1531496507);
            case 31 -> III(-440649184, var9 ^ -1506564177);
            case 32 -> III(-440649177, var9 ^ -684157297);
            case 33 -> III(-440649178, var9 ^ -1396648718);
            case 34 -> III(-440649179, var9 ^ 2014638590);
            case 35 -> III(-440649180, var9 ^ 1470010361);
            case 36 -> III(-440649173, var9 ^ 334688779);
            case 37 -> III(-440649174, var9 ^ 727998975);
            case 38 -> III(-440649175, var9 ^ -776825690);
            case 39 -> III(-440649176, var9 ^ 1113555916);
            case 40 -> III(-440649169, var9 ^ 1256072299);
            case 41 -> III(-440649170, var9 ^ 1553304157);
            case 42 -> III(-440649171, var9 ^ 1176352137);
            case 43 -> III(-440649172, var9 ^ -2002057938);
            case 44 -> III(-440649133, var9 ^ -1759012259);
            case 45 -> III(-440649134, var9 ^ 2106393897);
            case 46 -> III(-440649135, var9 ^ -18312192);
            case 47 -> III(-440649136, var9 ^ -2122171515);
            case 48 -> III(-440649129, var9 ^ -1914231756);
            case 49 -> III(-440649130, var9 ^ -1386929086);
            case 50 -> III(-440649131, var9 ^ -116653776);
            case 51 -> III(-440649132, var9 ^ 746418309);
            case 52 -> III(-440649125, var9 ^ 947183304);
            case 53 -> III(-440649126, var9 ^ -1278102958);
            case 54 -> III(-440649127, var9 ^ -1865466800);
            case 55 -> III(-440649128, var9 ^ -1083772547);
            case 56 -> III(-440649121, var9 ^ -1683269827);
            case 57 -> III(-440649122, var9 ^ 1200092736);
            case 58 -> III(-440649123, var9 ^ 1938416251);
            case 59 -> III(-440649124, var9 ^ 676416193);
            case 60 -> III(-440649149, var9 ^ 560981773);
            case 61 -> III(-440649150, var9 ^ 1720828850);
            case 62 -> III(-440649151, var9 ^ -1875014459);
            case 63 -> III(-440649152, var9 ^ 1404317927);
            case 64 -> III(-440649145, var9 ^ -386425510);
            case 65 -> III(-440649146, var9 ^ -142411800);
            case 66 -> III(-440649147, var9 ^ -2021203258);
            case 67 -> III(-440649148, var9 ^ 734187329);
            case 68 -> III(-440649141, var9 ^ -2088981306);
            case 69 -> III(-440649142, var9 ^ 1049272954);
            case 70 -> III(-440649143, var9 ^ -835524023);
            case 71 -> III(-440649144, var9 ^ 1733541741);
            case 72 -> III(-440649137, var9 ^ -619427442);
            case 73 -> III(-440649138, var9 ^ 1946380494);
            case 74 -> III(-440649139, var9 ^ -1596414672);
            case 75 -> III(-440649140, var9 ^ 620941855);
            case 76 -> III(-440649101, var9 ^ -1484156539);
            case 77 -> III(-440649102, var9 ^ 158499400);
            case 78 -> III(-440649103, var9 ^ -1486986631);
            case 79 -> III(-440649104, var9 ^ 2040001143);
            case 80 -> 2;
            case 81 -> III(-440649097, var9 ^ 1917997135);
            case 82 -> III(-440649098, var9 ^ 868189907);
            case 83 -> III(-440649099, var9 ^ 2143738059);
            case 84 -> III(-440649100, var9 ^ -2032373462);
            case 85 -> III(-440649093, var9 ^ 577561615);
            case 86 -> III(-440649094, var9 ^ 906568867);
            case 87 -> III(-440649095, var9 ^ 1865716130);
            case 88 -> III(-440649096, var9 ^ -2075046971);
            case 89 -> III(-440649089, var9 ^ 69157938);
            case 90 -> III(-440649090, var9 ^ -1559035427);
            case 91 -> III(-440649091, var9 ^ 391258640);
            case 92 -> III(-440649092, var9 ^ -1036550932);
            case 93 -> III(-440649117, var9 ^ 1225725200);
            case 94 -> III(-440649118, var9 ^ -775404589);
            case 95 -> III(-440649119, var9 ^ 651211904);
            case 96 -> III(-440649120, var9 ^ -1761361850);
            case 97 -> III(-440649113, var9 ^ 2044566186);
            case 98 -> III(-440649114, var9 ^ -542329774);
            case 99 -> III(-440649115, var9 ^ -321158067);
            case 100 -> III(-440649116, var9 ^ -537711096);
            case 101 -> III(-440649109, var9 ^ -142920248);
            case 102 -> III(-440649110, var9 ^ -1978534790);
            case 103 -> III(-440649111, var9 ^ 864005076);
            case 104 -> III(-440649112, var9 ^ -1296408913);
            case 105 -> III(-440649105, var9 ^ 245061447);
            case 106 -> III(-440649106, var9 ^ -2131289049);
            case 107 -> III(-440649107, var9 ^ -1090889362);
            case 108 -> III(-440649108, var9 ^ 543526875);
            case 109 -> III(-440649069, var9 ^ -1945851948);
            case 110 -> III(-440649070, var9 ^ 758044872);
            case 111 -> III(-440649071, var9 ^ -1077354497);
            case 112 -> III(-440649072, var9 ^ -2138149315);
            case 113 -> III(-440649065, var9 ^ 1206737871);
            case 114 -> III(-440649066, var9 ^ 1283037859);
            case 115 -> III(-440649067, var9 ^ -105794484);
            case 116 -> III(-440649068, var9 ^ 257173684);
            case 117 -> III(-440649061, var9 ^ -726262190);
            case 118 -> III(-440649062, var9 ^ 197003335);
            case 119 -> III(-440649063, var9 ^ -764887824);
            case 120 -> III(-440649064, var9 ^ 1814687085);
            case 121 -> III(-440649057, var9 ^ -1043376086);
            case 122 -> III(-440649058, var9 ^ -1048198525);
            case 123 -> III(-440649059, var9 ^ -699515787);
            case 124 -> III(-440649060, var9 ^ -1893394302);
            case 125 -> III(-440649085, var9 ^ -419446955);
            case 126 -> III(-440649086, var9 ^ 860504424);
            case 127 -> III(-440649087, var9 ^ -1725470155);
            case 128 -> III(-440649088, var9 ^ -1640937149);
            case 129 -> III(-440649081, var9 ^ -117672532);
            case 130 -> III(-440649082, var9 ^ -825079702);
            case 131 -> III(-440649083, var9 ^ -617264798);
            case 132 -> III(-440649084, var9 ^ -176246761);
            case 133 -> III(-440649077, var9 ^ 1816796012);
            case 134 -> III(-440649078, var9 ^ 60926243);
            case 135 -> III(-440649079, var9 ^ -1356860469);
            case 136 -> III(-440649080, var9 ^ -849469541);
            case 137 -> III(-440649073, var9 ^ -65646695);
            case 138 -> III(-440649074, var9 ^ -2069890341);
            case 139 -> III(-440649075, var9 ^ 676482092);
            case 140 -> III(-440649076, var9 ^ 1749526025);
            case 141 -> III(-440649037, var9 ^ -390366009);
            case 142 -> III(-440649038, var9 ^ 1697202688);
            case 143 -> III(-440649039, var9 ^ 1007589691);
            case 144 -> III(-440649040, var9 ^ 1056523284);
            case 145 -> III(-440649033, var9 ^ 1741750310);
            case 146 -> III(-440649034, var9 ^ -727844236);
            case 147 -> III(-440649035, var9 ^ -942442424);
            case 148 -> III(-440649036, var9 ^ -2039639580);
            case 149 -> III(-440649029, var9 ^ 960380356);
            case 150 -> III(-440649030, var9 ^ -1033549032);
            case 151 -> III(-440649031, var9 ^ -1674697189);
            case 152 -> III(-440649032, var9 ^ 1299365622);
            case 153 -> III(-440649025, var9 ^ 44843059);
            case 154 -> III(-440649026, var9 ^ 253747584);
            case 155 -> III(-440649027, var9 ^ 420587806);
            case 156 -> III(-440649028, var9 ^ 1225786159);
            case 157 -> III(-440649053, var9 ^ 1869153699);
            case 158 -> III(-440649054, var9 ^ -2115315633);
            case 159 -> III(-440649055, var9 ^ 345765823);
            case 160 -> III(-440649056, var9 ^ -1988095762);
            case 161 -> III(-440649049, var9 ^ -1276987347);
            case 162 -> III(-440649050, var9 ^ 1820581330);
            case 163 -> III(-440649051, var9 ^ -606351386);
            case 164 -> III(-440649052, var9 ^ -730306686);
            case 165 -> III(-440649045, var9 ^ 709442059);
            case 166 -> III(-440649046, var9 ^ 1337492957);
            case 167 -> III(-440649047, var9 ^ 1067095960);
            case 168 -> III(-440649048, var9 ^ -2114050021);
            case 169 -> III(-440649041, var9 ^ -1185539819);
            case 170 -> III(-440649042, var9 ^ 1807630117);
            case 171 -> III(-440649043, var9 ^ 1301085513);
            case 172 -> III(-440649044, var9 ^ -1440897742);
            case 173 -> III(-440649005, var9 ^ 2137184517);
            case 174 -> III(-440649006, var9 ^ -128381445);
            case 175 -> III(-440649007, var9 ^ -655972866);
            case 176 -> III(-440649008, var9 ^ -167333119);
            case 177 -> III(-440649001, var9 ^ 953971021);
            case 178 -> III(-440649002, var9 ^ -172294394);
            case 179 -> III(-440649003, var9 ^ 1004365538);
            case 180 -> III(-440649004, var9 ^ -1341626489);
            case 181 -> III(-440648997, var9 ^ -391272528);
            case 182 -> III(-440648998, var9 ^ -1770283021);
            case 183 -> III(-440648999, var9 ^ 442543177);
            case 184 -> III(-440649000, var9 ^ 170926272);
            case 185 -> III(-440648993, var9 ^ 245857001);
            case 186 -> III(-440648994, var9 ^ 263349117);
            case 187 -> III(-440648995, var9 ^ -1101623625);
            case 188 -> III(-440648996, var9 ^ -751060707);
            case 189 -> 3;
            case 190 -> III(-440649021, var9 ^ -385825820);
            case 191 -> III(-440649022, var9 ^ 692785960);
            case 192 -> III(-440649023, var9 ^ -2147298485);
            case 193 -> III(-440649024, var9 ^ 849385723);
            case 194 -> III(-440649017, var9 ^ -841762199);
            case 195 -> III(-440649018, var9 ^ -1422442980);
            case 196 -> III(-440649019, var9 ^ -1342610578);
            case 197 -> III(-440649020, var9 ^ -713771595);
            case 198 -> III(-440649013, var9 ^ 1433626643);
            case 199 -> III(-440649014, var9 ^ -461343715);
            case 200 -> III(-440649015, var9 ^ 684148846);
            case 201 -> 0;
            case 202 -> III(-440649016, var9 ^ 1004017185);
            case 203 -> III(-440649009, var9 ^ 1864606316);
            case 204 -> III(-440649010, var9 ^ -1033926915);
            case 205 -> III(-440649011, var9 ^ 997417885);
            case 206 -> III(-440649012, var9 ^ -1309848220);
            case 207 -> III(-440648973, var9 ^ 1114062351);
            case 208 -> III(-440648974, var9 ^ -1870827730);
            case 209 -> III(-440648975, var9 ^ -996421604);
            case 210 -> III(-440648976, var9 ^ 401793815);
            case 211 -> III(-440648969, var9 ^ -946833380);
            case 212 -> III(-440648970, var9 ^ 1149470956);
            case 213 -> III(-440648971, var9 ^ 1100167550);
            case 214 -> III(-440648972, var9 ^ -987879972);
            case 215 -> III(-440648965, var9 ^ 1137065527);
            case 216 -> III(-440648966, var9 ^ -211654108);
            case 217 -> III(-440648967, var9 ^ -2000697160);
            case 218 -> III(-440648968, var9 ^ 75691413);
            case 219 -> III(-440648961, var9 ^ -44192214);
            case 220 -> III(-440648962, var9 ^ 1798555031);
            case 221 -> III(-440648963, var9 ^ -1397890891);
            case 222 -> III(-440648964, var9 ^ 430467770);
            case 223 -> III(-440648989, var9 ^ -1776153022);
            case 224 -> III(-440648990, var9 ^ 1367917533);
            case 225 -> III(-440648991, var9 ^ -592432992);
            case 226 -> III(-440648992, var9 ^ -1870330171);
            case 227 -> III(-440648985, var9 ^ -98804992);
            case 228 -> III(-440648986, var9 ^ -1026758327);
            case 229 -> III(-440648987, var9 ^ 1337681679);
            case 230 -> III(-440648988, var9 ^ 226940832);
            case 231 -> III(-440648981, var9 ^ -740787682);
            case 232 -> III(-440648982, var9 ^ -685290893);
            case 233 -> III(-440648983, var9 ^ 304833601);
            case 234 -> 1;
            case 235 -> III(-440648984, var9 ^ 994864072);
            case 236 -> III(-440648977, var9 ^ -1819668899);
            case 237 -> III(-440648978, var9 ^ 423680091);
            case 238 -> III(-440648979, var9 ^ -1936994092);
            case 239 -> III(-440648980, var9 ^ 999217503);
            case 240 -> III(-440648941, var9 ^ -406851488);
            case 241 -> III(-440648942, var9 ^ 979066568);
            case 242 -> III(-440648943, var9 ^ 91115040);
            case 243 -> III(-440648944, var9 ^ 1793448554);
            case 244 -> III(-440648937, var9 ^ -1228884321);
            case 245 -> III(-440648938, var9 ^ -526266788);
            case 246 -> III(-440648939, var9 ^ 602505979);
            case 247 -> III(-440648940, var9 ^ -547056608);
            case 248 -> III(-440648933, var9 ^ -91685193);
            case 249 -> III(-440648934, var9 ^ -450950647);
            case 250 -> III(-440648935, var9 ^ -1059690892);
            case 251 -> 4;
            case 252 -> III(-440648936, var9 ^ 1667308699);
            case 253 -> III(-440648929, var9 ^ -955393616);
            case 254 -> III(-440648930, var9 ^ 443632760);
            default -> III(-440648931, var9 ^ -450895631);
         };
         int var5 = (var1 & III(-440648932, var9 ^ -1531113146)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & III(-440648957, var9 ^ 197157896)) >>> III(-440648958, var9 ^ 965644318)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & III(-440648959, var9 ^ -1683200863);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & III(-440648960, var9 ^ -1570795699);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }

   public boolean ll(class_2815 var1) {
      class_310 var2 = class_310.method_1551();
      if (var2.field_1724 != null && var1 != null) {
         if (var1.method_36168() != var2.field_1724.field_7498.field_7763) {
            return false;
         } else if (this.lI) {
            this.lI = false;
            return false;
         } else {
            return this.IIIIlIl();
         }
      } else {
         return false;
      }
   }

   private static String IIl(int var0, int var1) {
      int var3 = var0 ^ 110313407;
      char[] var4 = III[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1994740863;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 151;
            case 1 -> 100;
            case 2 -> 215;
            case 3 -> 163;
            case 4 -> 84;
            case 5 -> 152;
            case 6 -> 44;
            case 7 -> 101;
            case 8 -> 179;
            case 9 -> 79;
            case 10 -> 136;
            case 11 -> 245;
            case 12 -> 75;
            case 13 -> 180;
            case 14 -> 15;
            case 15 -> 70;
            case 16 -> 170;
            case 17 -> 246;
            case 18 -> 219;
            case 19 -> 63;
            case 20 -> 187;
            case 21 -> 16;
            case 22 -> 163;
            case 23 -> 172;
            case 24 -> 198;
            case 25 -> 231;
            case 26 -> 189;
            case 27 -> 13;
            case 28 -> 42;
            case 29 -> 61;
            case 30 -> 112;
            case 31 -> 199;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -706335602;
      int var8 = "a䥘є\uf48a\ud869謐쟍鍡Ṳ㵵\udb8b즃ꮼ盏\udd97㐒\ue5e7膍䈬ㅿ\ua63f㺈픒铆譼⽽Ꟗ௱\uee2cታ㔝㋍䱆铟윷㷯唨ㄢ﹥\uec83\udbb3갌豋킖\u09d5ᠵ듳ᾑ犯獭﹔럷\ue6a6扢邡\udbb0ꪞ棒噕Խ葿惨뒫ퟞ꾹섡☿夘ካ戰䳳\ue9a5䪙埦䗪뜈谘\ue474쩕묈ᄇ\uf13c層敘\uecf3쫎蟞ீ䤊⺛毴ﶷ弫⦑ƹ궳\u242a\uedb4"
         .length();
      String var7 = "a䥘є\uf48a\ud869謐쟍鍡Ṳ㵵\udb8b즃ꮼ盏\udd97㐒\ue5e7膍䈬ㅿ\ua63f㺈픒铆譼⽽Ꟗ௱\uee2cታ㔝㋍䱆铟윷㷯唨ㄢ﹥\uec83\udbb3갌豋킖\u09d5ᠵ듳ᾑ犯獭﹔럷\ue6a6扢邡\udbb0ꪞ棒噕Խ葿惨뒫ퟞ꾹섡☿夘ካ戰䳳\ue9a5䪙埦䗪뜈谘\ue474쩕묈ᄇ\uf13c層敘\uecf3쫎蟞ீ䤊⺛毴ﶷ弫⦑ƹ궳\u242a\uedb4";
      short var12 = 22958;
      int var10 = 0;
      String[] var9 = new String[1];
      int var11 = 0;

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << '\r') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> '\r') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      III = var9;
      IIl = new Object[var9.length];
      int var10000 = 0;
      ll = new int[276];
      int var20 = 0;
      byte[] var27 = "Ç¼\u009b\u008dG¬\u008f\u0095aê\u001b8°È\u0086C\u009d\u0097%\u0002\u0016\u00111YÒ\u009cÚ¾\\Øb~8\u009bTÂW\u001bÜ¨ö;\u0093ÙVR\u000eö\b\u001c\u0016 \u008d·ÿXÏ®\f¿Â8É\u007f\u008bTaPµ\f»M\u007f¯Ày\u008aØ\u0098Ga F\u0099¹Pás8w\u0013Í\u001d²þ\u009dÑû¤\u009aLÚ\u0015æuVÆ¡|×JÖ!Ïdÿ¤âå¤·HÁÉA\\a7] \u008e\u0089\u0016\u0002µÜL¦¦z\u0016\u009cîÀ÷VW\u0080\r\u001dtË¾m¥\u0000ÉËL\u008f¯G$L\u001fEóð_?Ìèx!:éîÐL\u009eÑÀå\u001fEQü\ff\u0085\\ì\u0099@À\u001c\u009fH\u009a9y\u00157\u0089{\u0091§\u009e\n\u009a\u0096¦qbÔR¥¶ñÍ\u008a<\u0093+ÎPóuöÆa·\f\u0010\u0094 \u009fý\u0082²\u0097|$t\u00817\u008að\u009b¿µ\u0091U\t\u0005\u001dJ\u0085\u009a\u001d /\u0005º#J\u0094C\\ ;6PE$µp÷$5$®\u0001\u0082ñßpÌåÖÞrns²\fMm</bÄñåF\tV6\u009a%ö¥®+â¿õóJoüÍçø»3ÃXM\u009f\u008c\b\u008e\u00160«5U\u009cO* öêZ$â*ö`Ïÿ^Þ\u00adÃã(£y\u0013\u0090êiºñ¿\u008b\u0006¶Ic©¡hQ}z¤$ø Òqz+\u0091=ÔÐ\u0082Yzüc[¤5òÏ¯ðQbî\u001d\u0086+¢dØ1[~q\u0093ÿÎå7ë«$f²\u0096\u0091iYóK\u0019Ù½Dý~±\u0001SÊð\"Ü\u001f\u0095|\u001b\u0094\u00ad\u0015O\fjC\u0087ûr´vJ¡À\u0091¤\u007f\u009aã\u0002\u000e´Z1y\u0084È\u0002Q.·*Ù5tW³ô\u007fîÝªño\u0018^çÓ9Wä]U\u001c\u0090cXY\u0018ýÇ\u008f,Q¦§\u0095ð\u008cØ\u0095bjßc],nq\u009aOZ#\u0091Û\u009a\u009e$\u0013´-Òö(\u008d\t\u0014\u001f\u0081Ö\u001c\bµ\u000fÊ¼³±\u008bíò\u001cmX\u0090\u001c'ÃP\u000bì<\u008cR\u0087\u0018Û;]¿DîèA)D\u0085j C\u0093H\u008c%^uL\u0013pI§\u0006\u0097I\u0002(Ü°C±è\u001bAÞ\u0003¨×r½óa\u0010ü\u001f7!´O\u001fY=údõðLEµå¦ð5\u0019|\u0014¸\u008bB.á¬\u0099wã[D\u0010ºs\u0000\u007f\t?û\u009f\u001aqxÕ[Ï\u0091×ä\u009c=î\u001fÇK&A\u008c&8\u0090Ð¿\u0004ß\u000e@0Ò½á_Ä³©=\u0094²\u0003\u0013²Ë\u0005ù\\HØ\u0099É9÷\u0004T\"\u0011\u000fn@¸¦±!Ü\b\u0006yÏ%\tÚgõ÷ë;Ú\u0092\u001a\u0085oâ8\u0096t\\\\(µdô\u0019\u0081¶\u001c?5\u0090.ü¤w¿¥\\¢ÀÙ'%û\r\u0085\u0005D¥ò+¤³7å~pØ(\u0018ÿÎæ\u007ff¤mªgC5\u000f§FKÙ\u009f¨ÇÂ¬\u007f×\u0092 ãÓ\u0005z6Ò\u0010c¨cô\u008eÓ\u000e\u0099¹\u00ad4¢Ã2ôé\u0013ý] ÓDï\u0002\u0098\u000f\u0010q»Öv\u0095>Jr[cÀ\bÖµX\u0088ÑhG9\"tÝõeH\u0094æz\u0016\u0005²\u0081¢\f\u001fý\u0086ÄæÑc¬lOM\u0092\u009fÅ>uMßoD\u00199ÐNÊPãØ\u001a2x\u0081\u0099!\u0088ø\u009c19^\u0018¼%\u0092\u009ed>%.ÀjkU\u001dÈyÙ õÐ ÿ®Á¶\u0091Ålq\u000fá\u0016Ä\nk\u0001K\u0080\u000ee\u008c*Ây\u0001\u00120vM'\u0006¸'¾[À\u001fnéW\u0092\u0019géÐ$×å\u000ezz\u001f\n\u0085JtÏ\u0089dwæîj_N(\u000fÏÄâØ\u0015Q)Ð\u009eæ,ÙF:\u001dñ{çù_$ØÌOé·GÛ\u0089kb·\u001e=\u0003Ï\u009eþK\u0083ï\u0002Æ\u0094c'*þô8½\u000b \u001dtg\b¾Ã\u001d\u008c\u001a¯Ø\u0096ÇÓMë8½á\u0007y\u001f\u0010.Öcd\u007fä,\u0090cF\u000eeÔ\u007fý\u008e9"
         .getBytes("ISO-8859-1");

      int var43;
      do {
         ll[var10000] = ((var27[var20] & 255) << 24 | (var27[var20 + 1] & 255) << 16 | (var27[var20 + 2] & 255) << 8 | var27[var20 + 3] & 255) ^ -1854044935;
         var10000 += 1;
         var43 = var20 + 4;
         var20 += 4;
      } while (var43 < var27.length);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIl(110313407, var17 ^ -256294125)).length();
      int var1 = III(-440649197, var17 ^ 1721477202);
      int var0 = -1;

      while (true) {
         label77: {
            var10000 = III(-440649198, var17 ^ -427049952);
            char[] var44 = var2.substring(++var0, var0 + var1).toCharArray();
            int var54 = var44.length;
            int var6 = 0;
            var43 = var10000;
            var33 = var44;
            var20 = var54;
            char[] var63;
            int var70;
            if (var54 <= 1) {
               var63 = var44;
               var54 = var10000;
               var70 = var6;
            } else {
               var43 = var10000;
               var20 = var54;
               if (var54 <= var6) {
                  break label77;
               }

               var63 = var44;
               var54 = var10000;
               var70 = var6;
            }

            while (true) {
               var63[var70] = (char)(var63[var70] ^ var54 ^ switch (var6 % III(-440649199, var17 ^ -1060296426)) {
                  case 0 -> III(-440649200, var17 ^ 300922252);
                  case 1 -> III(-440649193, var17 ^ 1018173145);
                  case 2 -> III(-440649194, var17 ^ -1221197142);
                  case 3 -> III(-440649195, var17 ^ 1941694639);
                  case 4 -> III(-440649196, var17 ^ -33599082);
                  case 5 -> III(-440649189, var17 ^ -1715706109);
                  default -> III(-440649190, var17 ^ -163778723);
               });
               var6++;
               if (var43 == 0) {
                  var70 = var43;
                  var63 = var33;
                  var54 = var43;
               } else {
                  if (var20 <= var6) {
                     break;
                  }

                  var63 = var33;
                  var54 = var43;
                  var70 = var6;
               }
            }
         }

         String var47 = new String(var33).intern();
         byte var26 = -1;
         var5[var3++] = var47;
         if ((var0 += var1) >= var4) {
            I = var5;
            Il = new String[2];
            II = new String[2];
            Il();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public IIllIll() {
      super(IlIIllIII.Ill(II[0]), lllIIlIl.IlI, IlIIllIII.Ill(II[1]));
   }

   @Override
   public void llIl() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.method_1562() != null) {
         this.lI = true;
         var1.method_1562().method_52787(new class_2815(var1.field_1724.field_7498.field_7763));
      } else {
         this.lI = false;
      }
   }
}
