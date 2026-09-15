package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class lIlIll extends IlIIIIIIl {
   private static final String[] I;
   private int II = -1;
   private int Il = -1;
   private static final int[] ll;
   private static final Object[] IIl;
   private static final String[] III;
   private static final String[] lI;

   public void I() {
      this.II = -1;
      this.Il = -1;
   }

   @Override
   public void llIl() {
      this.I();
   }

   public void l(int var1, int var2) {
      class_310 var3 = class_310.method_1551();
      if (var3 != null && var3.field_1724 != null && var1 >= 0 && var1 < ll(-54573952, 376890194 ^ -2126563278)) {
         this.II = var1;
         this.Il = IIlllIllI.Il(var3.field_1724.method_31548());
      }
   }

   public int II(int var1) {
      if (!this.IIIIlIl()) {
         return -1;
      } else {
         class_310 var2 = class_310.method_1551();
         if (var2 != null && var2.field_1724 != null && this.Il >= 0 && IIlllIllI.Il(var2.field_1724.method_31548()) != this.Il) {
            this.I();
            return -1;
         } else if (var2 != null && var2.field_1724 != null && this.II >= 0 && this.II <= ll(-54573941, 929599850 ^ 1889245334) && IIll.IIIIlII(var2, this.II)) {
            return this.II;
         } else {
            this.I();
            return -1;
         }
      }
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1724 != null && this.II >= 0) {
         this.II(var1.field_1724.field_6012);
      }
   }

   private static String Il(int var0, int var1) {
      int var9 = 36820909;
      int var2 = (var0 ^ ll(-54573940, var9 ^ -282038508)) & ll(-54573939, var9 ^ -647770095);
      if (I[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & ll(-54573938, var9 ^ 869765372)) {
            case 0 -> ll(-54573937, var9 ^ 62087533);
            case 1 -> ll(-54573936, var9 ^ 602484826);
            case 2 -> ll(-54573935, var9 ^ 1537614969);
            case 3 -> ll(-54573934, var9 ^ -1901560223);
            case 4 -> ll(-54573933, var9 ^ -487530688);
            case 5 -> ll(-54573932, var9 ^ -1712093241);
            case 6 -> ll(-54573931, var9 ^ -139570912);
            case 7 -> ll(-54573930, var9 ^ -1686047982);
            case 8 -> ll(-54573929, var9 ^ 202052895);
            case 9 -> ll(-54573928, var9 ^ 648892088);
            case 10 -> ll(-54573927, var9 ^ 375339723);
            case 11 -> ll(-54573926, var9 ^ 1186522324);
            case 12 -> ll(-54573925, var9 ^ -2097445602);
            case 13 -> ll(-54573924, var9 ^ -1608740608);
            case 14 -> ll(-54573923, var9 ^ -491149139);
            case 15 -> ll(-54573922, var9 ^ 1927005984);
            case 16 -> ll(-54573921, var9 ^ 967400799);
            case 17 -> ll(-54573920, var9 ^ 639731145);
            case 18 -> ll(-54573919, var9 ^ 2026502357);
            case 19 -> ll(-54573918, var9 ^ 1825478773);
            case 20 -> ll(-54573917, var9 ^ 4291733);
            case 21 -> ll(-54573916, var9 ^ 258549687);
            case 22 -> 2;
            case 23 -> ll(-54573915, var9 ^ 701398889);
            case 24 -> ll(-54573914, var9 ^ 1217880510);
            case 25 -> ll(-54573913, var9 ^ -1840056559);
            case 26 -> ll(-54573912, var9 ^ -1213608321);
            case 27 -> ll(-54573911, var9 ^ -1429770134);
            case 28 -> ll(-54573910, var9 ^ -1055209192);
            case 29 -> ll(-54573909, var9 ^ -767333562);
            case 30 -> 3;
            case 31 -> ll(-54573908, var9 ^ 243738796);
            case 32 -> ll(-54573907, var9 ^ 700710830);
            case 33 -> ll(-54573906, var9 ^ -1085360436);
            case 34 -> ll(-54573905, var9 ^ 525738875);
            case 35 -> ll(-54573904, var9 ^ 183455269);
            case 36 -> ll(-54573903, var9 ^ -1696142683);
            case 37 -> ll(-54573902, var9 ^ -510949348);
            case 38 -> ll(-54573901, var9 ^ 223342074);
            case 39 -> ll(-54573900, var9 ^ 958246828);
            case 40 -> ll(-54573899, var9 ^ 1610382293);
            case 41 -> ll(-54573898, var9 ^ -1784303429);
            case 42 -> ll(-54573897, var9 ^ -86091342);
            case 43 -> ll(-54573896, var9 ^ 1160499325);
            case 44 -> ll(-54573895, var9 ^ 2132545057);
            case 45 -> ll(-54573894, var9 ^ -1032590299);
            case 46 -> ll(-54573893, var9 ^ 722564648);
            case 47 -> ll(-54573892, var9 ^ 1277507390);
            case 48 -> ll(-54573891, var9 ^ 1317402692);
            case 49 -> ll(-54573890, var9 ^ -1637230862);
            case 50 -> ll(-54573889, var9 ^ -1582241988);
            case 51 -> ll(-54573888, var9 ^ -183595228);
            case 52 -> ll(-54573887, var9 ^ 506576489);
            case 53 -> ll(-54573886, var9 ^ 676388901);
            case 54 -> ll(-54573885, var9 ^ -1353654574);
            case 55 -> ll(-54573884, var9 ^ 1909943714);
            case 56 -> ll(-54573883, var9 ^ 1112348319);
            case 57 -> ll(-54573882, var9 ^ -187591876);
            case 58 -> ll(-54573881, var9 ^ 1477185765);
            case 59 -> ll(-54573880, var9 ^ -996154817);
            case 60 -> ll(-54573879, var9 ^ -2049341587);
            case 61 -> ll(-54573878, var9 ^ -663841851);
            case 62 -> ll(-54573877, var9 ^ -1711533030);
            case 63 -> ll(-54573876, var9 ^ 879837638);
            case 64 -> ll(-54573875, var9 ^ -1372610736);
            case 65 -> ll(-54573874, var9 ^ -1066399739);
            case 66 -> ll(-54573873, var9 ^ 66369438);
            case 67 -> ll(-54573872, var9 ^ -675799194);
            case 68 -> ll(-54573871, var9 ^ 1957356499);
            case 69 -> ll(-54573870, var9 ^ -294910744);
            case 70 -> ll(-54573869, var9 ^ -211667314);
            case 71 -> ll(-54573868, var9 ^ -185275618);
            case 72 -> 1;
            case 73 -> ll(-54573867, var9 ^ -980208069);
            case 74 -> ll(-54573866, var9 ^ -1668368952);
            case 75 -> ll(-54573865, var9 ^ 414654979);
            case 76 -> ll(-54573864, var9 ^ 1254947511);
            case 77 -> ll(-54573863, var9 ^ 1177257044);
            case 78 -> ll(-54573862, var9 ^ -2074731233);
            case 79 -> ll(-54573861, var9 ^ 486189093);
            case 80 -> ll(-54573860, var9 ^ 672585714);
            case 81 -> ll(-54573859, var9 ^ -1608409524);
            case 82 -> ll(-54573858, var9 ^ 694284147);
            case 83 -> ll(-54573857, var9 ^ 991146350);
            case 84 -> ll(-54573856, var9 ^ 67155666);
            case 85 -> ll(-54573855, var9 ^ -824003332);
            case 86 -> ll(-54573854, var9 ^ -914718620);
            case 87 -> ll(-54573853, var9 ^ -1972821713);
            case 88 -> ll(-54573852, var9 ^ -1657418653);
            case 89 -> ll(-54573851, var9 ^ -2044647674);
            case 90 -> ll(-54573850, var9 ^ -547776748);
            case 91 -> ll(-54573849, var9 ^ -1904685428);
            case 92 -> ll(-54573848, var9 ^ -1402540335);
            case 93 -> ll(-54573847, var9 ^ -71659949);
            case 94 -> ll(-54573846, var9 ^ 986303658);
            case 95 -> ll(-54573845, var9 ^ -629229350);
            case 96 -> ll(-54573844, var9 ^ -422755425);
            case 97 -> ll(-54573843, var9 ^ -698814117);
            case 98 -> ll(-54573842, var9 ^ 666550986);
            case 99 -> ll(-54573841, var9 ^ 1869920317);
            case 100 -> ll(-54573840, var9 ^ 1296655522);
            case 101 -> ll(-54573839, var9 ^ -153112381);
            case 102 -> ll(-54573838, var9 ^ -91315119);
            case 103 -> ll(-54573837, var9 ^ -2112563101);
            case 104 -> ll(-54573836, var9 ^ -257646161);
            case 105 -> ll(-54573835, var9 ^ -272336350);
            case 106 -> ll(-54573834, var9 ^ 1145098533);
            case 107 -> ll(-54573833, var9 ^ 138867945);
            case 108 -> ll(-54573832, var9 ^ -236455019);
            case 109 -> ll(-54573831, var9 ^ 622441578);
            case 110 -> ll(-54573830, var9 ^ -97004733);
            case 111 -> ll(-54573829, var9 ^ 1522365478);
            case 112 -> ll(-54573828, var9 ^ -251285174);
            case 113 -> ll(-54573827, var9 ^ 184217642);
            case 114 -> ll(-54573826, var9 ^ 1325730696);
            case 115 -> ll(-54573825, var9 ^ 266197622);
            case 116 -> ll(-54574080, var9 ^ -199115825);
            case 117 -> ll(-54574079, var9 ^ -311364925);
            case 118 -> ll(-54574078, var9 ^ 1463380943);
            case 119 -> ll(-54574077, var9 ^ -94245685);
            case 120 -> ll(-54574076, var9 ^ 1268295493);
            case 121 -> ll(-54574075, var9 ^ 1146223489);
            case 122 -> ll(-54574074, var9 ^ 70285184);
            case 123 -> ll(-54574073, var9 ^ 331435440);
            case 124 -> ll(-54574072, var9 ^ 1178931368);
            case 125 -> ll(-54574071, var9 ^ 1957425083);
            case 126 -> ll(-54574070, var9 ^ -209758213);
            case 127 -> ll(-54574069, var9 ^ 953591222);
            case 128 -> ll(-54574068, var9 ^ 1684416165);
            case 129 -> ll(-54574067, var9 ^ -318164302);
            case 130 -> ll(-54574066, var9 ^ 106615385);
            case 131 -> ll(-54574065, var9 ^ 469424943);
            case 132 -> ll(-54574064, var9 ^ -2126781673);
            case 133 -> ll(-54574063, var9 ^ 967264647);
            case 134 -> ll(-54574062, var9 ^ -1855928107);
            case 135 -> ll(-54574061, var9 ^ 211401648);
            case 136 -> ll(-54574060, var9 ^ -524280186);
            case 137 -> ll(-54574059, var9 ^ -628488179);
            case 138 -> ll(-54574058, var9 ^ 936543432);
            case 139 -> ll(-54574057, var9 ^ 1119936428);
            case 140 -> ll(-54574056, var9 ^ 781163843);
            case 141 -> ll(-54574055, var9 ^ -370875123);
            case 142 -> ll(-54574054, var9 ^ 1222875948);
            case 143 -> ll(-54574053, var9 ^ 278006374);
            case 144 -> ll(-54574052, var9 ^ -1008196680);
            case 145 -> ll(-54574051, var9 ^ -1310886816);
            case 146 -> ll(-54574050, var9 ^ 1255865839);
            case 147 -> ll(-54574049, var9 ^ 1120705715);
            case 148 -> ll(-54574048, var9 ^ 1008460984);
            case 149 -> ll(-54574047, var9 ^ -1844772276);
            case 150 -> ll(-54574046, var9 ^ -2007229105);
            case 151 -> ll(-54574045, var9 ^ -140797381);
            case 152 -> ll(-54574044, var9 ^ -1069834683);
            case 153 -> ll(-54574043, var9 ^ -1897282163);
            case 154 -> ll(-54574042, var9 ^ 872391770);
            case 155 -> ll(-54574041, var9 ^ 73019210);
            case 156 -> ll(-54574040, var9 ^ -715996937);
            case 157 -> ll(-54574039, var9 ^ 1093582033);
            case 158 -> ll(-54574038, var9 ^ 145449334);
            case 159 -> ll(-54574037, var9 ^ -1020805470);
            case 160 -> ll(-54574036, var9 ^ 78815395);
            case 161 -> ll(-54574035, var9 ^ -1850917595);
            case 162 -> ll(-54574034, var9 ^ 514652251);
            case 163 -> ll(-54574033, var9 ^ 163302294);
            case 164 -> ll(-54574032, var9 ^ -612483563);
            case 165 -> ll(-54574031, var9 ^ -608837714);
            case 166 -> ll(-54574030, var9 ^ -1286360884);
            case 167 -> ll(-54574029, var9 ^ 430026517);
            case 168 -> ll(-54574028, var9 ^ 2018494237);
            case 169 -> ll(-54574027, var9 ^ 314456091);
            case 170 -> ll(-54574026, var9 ^ -1460568518);
            case 171 -> ll(-54574025, var9 ^ -2126704359);
            case 172 -> ll(-54574024, var9 ^ 55463122);
            case 173 -> ll(-54574023, var9 ^ 2029963131);
            case 174 -> ll(-54574022, var9 ^ -405083860);
            case 175 -> ll(-54574021, var9 ^ -274967917);
            case 176 -> ll(-54574020, var9 ^ -202605845);
            case 177 -> ll(-54574019, var9 ^ 1667126533);
            case 178 -> ll(-54574018, var9 ^ -743833405);
            case 179 -> ll(-54574017, var9 ^ -918639784);
            case 180 -> ll(-54574016, var9 ^ 510973343);
            case 181 -> ll(-54574015, var9 ^ -1354048851);
            case 182 -> ll(-54574014, var9 ^ 1314941252);
            case 183 -> ll(-54574013, var9 ^ 1362775611);
            case 184 -> ll(-54574012, var9 ^ -1714484559);
            case 185 -> ll(-54574011, var9 ^ 1748784772);
            case 186 -> ll(-54574010, var9 ^ 955167838);
            case 187 -> ll(-54574009, var9 ^ -1241942519);
            case 188 -> ll(-54574008, var9 ^ -2101112223);
            case 189 -> ll(-54574007, var9 ^ -743382667);
            case 190 -> ll(-54574006, var9 ^ -143325777);
            case 191 -> ll(-54574005, var9 ^ 1653072839);
            case 192 -> ll(-54574004, var9 ^ -1872914211);
            case 193 -> ll(-54574003, var9 ^ -1854692952);
            case 194 -> ll(-54574002, var9 ^ 399625896);
            case 195 -> ll(-54574001, var9 ^ 1852130427);
            case 196 -> ll(-54574000, var9 ^ 569826095);
            case 197 -> ll(-54573999, var9 ^ -368720857);
            case 198 -> ll(-54573998, var9 ^ -412608799);
            case 199 -> ll(-54573997, var9 ^ 793731782);
            case 200 -> ll(-54573996, var9 ^ 119762989);
            case 201 -> ll(-54573995, var9 ^ -1671514744);
            case 202 -> ll(-54573994, var9 ^ -1088278347);
            case 203 -> ll(-54573993, var9 ^ -1725395019);
            case 204 -> ll(-54573992, var9 ^ -433548292);
            case 205 -> ll(-54573991, var9 ^ 985465304);
            case 206 -> ll(-54573990, var9 ^ 434135540);
            case 207 -> ll(-54573989, var9 ^ -1634158021);
            case 208 -> ll(-54573988, var9 ^ 571173521);
            case 209 -> ll(-54573987, var9 ^ 1207522815);
            case 210 -> ll(-54573986, var9 ^ -412168994);
            case 211 -> ll(-54573985, var9 ^ -223832923);
            case 212 -> ll(-54573984, var9 ^ 1825815588);
            case 213 -> ll(-54573983, var9 ^ 2086032606);
            case 214 -> ll(-54573982, var9 ^ -1123044396);
            case 215 -> ll(-54573981, var9 ^ -836963268);
            case 216 -> ll(-54573980, var9 ^ 1421059512);
            case 217 -> ll(-54573979, var9 ^ 1560210251);
            case 218 -> ll(-54573978, var9 ^ 1610640930);
            case 219 -> ll(-54573977, var9 ^ 488099417);
            case 220 -> ll(-54573976, var9 ^ 1028421152);
            case 221 -> ll(-54573975, var9 ^ 1659301742);
            case 222 -> 0;
            case 223 -> ll(-54573974, var9 ^ -1716837295);
            case 224 -> ll(-54573973, var9 ^ 1718918358);
            case 225 -> ll(-54573972, var9 ^ -219655514);
            case 226 -> 4;
            case 227 -> ll(-54573971, var9 ^ 1488659028);
            case 228 -> ll(-54573970, var9 ^ 1818697326);
            case 229 -> ll(-54573969, var9 ^ -1519888489);
            case 230 -> ll(-54573968, var9 ^ -1002990675);
            case 231 -> ll(-54573967, var9 ^ 1244636771);
            case 232 -> ll(-54573966, var9 ^ 1598744375);
            case 233 -> ll(-54573965, var9 ^ 358552600);
            case 234 -> ll(-54573964, var9 ^ -1994275158);
            case 235 -> ll(-54573963, var9 ^ -580248013);
            case 236 -> ll(-54573962, var9 ^ -1292479822);
            case 237 -> ll(-54573961, var9 ^ -379931390);
            case 238 -> ll(-54573960, var9 ^ 1069629197);
            case 239 -> ll(-54573959, var9 ^ -1177737706);
            case 240 -> ll(-54573958, var9 ^ -1062413418);
            case 241 -> ll(-54573957, var9 ^ -1935128928);
            case 242 -> ll(-54573956, var9 ^ 313119771);
            case 243 -> ll(-54573955, var9 ^ 1635042653);
            case 244 -> ll(-54573954, var9 ^ -1453519095);
            case 245 -> ll(-54573953, var9 ^ 291272959);
            case 246 -> ll(-54573696, var9 ^ 659591194);
            case 247 -> ll(-54573695, var9 ^ -437450601);
            case 248 -> ll(-54573694, var9 ^ -2077933901);
            case 249 -> ll(-54573693, var9 ^ -637247547);
            case 250 -> ll(-54573692, var9 ^ 543538319);
            case 251 -> ll(-54573691, var9 ^ 1322801587);
            case 252 -> ll(-54573690, var9 ^ -942720702);
            case 253 -> 5;
            case 254 -> ll(-54573689, var9 ^ -1411117287);
            default -> ll(-54573688, var9 ^ -889799724);
         };
         int var5 = (var1 & ll(-54573687, var9 ^ 1048207662)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(-54573686, var9 ^ 789267113)) >>> ll(-54573685, var9 ^ 1016660074)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(-54573684, var9 ^ -1689940217);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(-54573683, var9 ^ -141878721);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }

   private static String III(int var0, byte var1, char var2, int var3) {
      int var8 = var3 ^ 1544040565;
      char[] var7 = III[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])IIl[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         IIl[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 23899;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 15) {
            default -> 58;
            case 1 -> 189;
            case 2 -> 69;
            case 3 -> 68;
            case 4 -> 186;
            case 5 -> 147;
            case 6 -> 133;
            case 7 -> 99;
            case 8 -> 115;
            case 9 -> 5;
            case 10 -> 50;
            case 11 -> 79;
            case 12 -> 118;
            case 13 -> 12;
            case 14 -> 92;
         } ^ 48610 ^ var6 ^ var3 ^ var0 ^ var1 ^ var5 ^ var2);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1784356931;
      short var18 = 5465;
      String[] var15 = new String[1];
      int var14 = "]棔똲泡ᛖ掇噠怤阱況⛝擷癡挄嘴懑蛘愇뙥摴嘸澑ᛓ欧ᙫ悴혵殑\uf6d7澧왡攤ؾ殡\uf6da澇\uf667憤\uf63c摡曙榧٦淴阽摑ᛜ檷晤挤\ua632潡훙榧癤榤똹惁㛙攗ᙤ渄\ue63e旡ꛚ濷晩憴ᘺ惁훙椧癥橄ᘹ懡蛟擇\ue66f懤\ue634澡囕惗왢演혶氁\u06dd氧器桤蘻攑"
         .length();
      int var16 = 0;
      String var13 = "]棔똲泡ᛖ掇噠怤阱況⛝擷癡挄嘴懑蛘愇뙥摴嘸澑ᛓ欧ᙫ悴혵殑\uf6d7澧왡攤ؾ殡\uf6da澇\uf667憤\uf63c摡曙榧٦淴阽摑ᛜ檷晤挤\ua632潡훙榧癤榤똹惁㛙攗ᙤ渄\ue63e旡ꛚ濷晩憴ᘺ惁훙椧癥橄ᘹ懡蛟擇\ue66f懤\ue634澡囕惗왢演혶氁\u06dd氧器桤蘻攑";
      int var17 = 0;

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 34;
               case 1 -> 95;
               case 2 -> 39;
               case 3 -> 179;
               case 4 -> 97;
               case 5 -> 3;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      III = var15;
      IIl = new Object[var15.length];
      int var9 = 278733812;
      byte[] var7 = "{k\u008b\u0015ðÛ;Çä\u0019\u0010\u0015¨I]@ý\u000eRKìÎ1a\u000eÈ¢üÐ«K\tº\u0004¢\u009bð\u001d\u008b\u0091ò\u001c\u008c\u001b«ÑXeþÜ\u0014\u00197qV*ÝÄ\u0015Äí æÔÍú¶mµµ£¤`»ø?\fãX\u0098wà\u0000G\u0019½Ö¯u\u0093uKâ\u0018\u0093pÈ¾È¾øL¼¡¨«cClè\u0002öN\u000f\u0017\u001b\fª.°\u009cÈ@©×ºÛ<È2\u00025\u0096Ú~î\u0082Ý\u001ezîRû>áz¡\u0083ÇÝùl¦\u0084æ}|Ap¹YºI\u0091DÔö\u0014/\tNÜ<Píbà\u0094®ÁÇÐx\rQ]1¹ñE¤\u000eäüÈ\u0018tõl®\u000f\u0098\u000ecã\\jC×\u000e)Î±ïü@{¶7\u0018\u0014Íß\u0084«8VT\u0091\u000f\u0088\u0007,`k÷Å\u0002ñ¯¢6°ª \u0096\u007fúpzP«O£a_\u001b\u001d\tqð\"9\u009aÆCf ACY%\u009fÄëØ¬^\u0091\u000f\u001aÂ\u0015\u0007¶\u001f\u0096\u0083*\u008cd>kÊ\u0001f6}\u0014]wï\u0091{ÚbÆZ@<\u0018\u00ad.c\u008f½íç0 9«\u0099\u0018\u009a¹dc\u0000\u007f\u0082é\u001dq±\f\u001açl\u008e+\u0080°1r\u009d2\u0000ö¤¤o¤ß|©¨8\u0003âjE\u009aÝòé.=Æ\u0005P^N2\u0019îÇrhÚÕ\u00006óê\u00131\" ñ2ê'i\u0007Ãdz§\u0002s&Jqh2 Ø1J\u0011,`kHâBuh¯\u0015©\b!ÔÚK84m?e\bÞÄª8Kv\u008bÉ©Es\u0081g>P£ZãM\u0018Ì6Ë\u0014\u009d#ðl\u0007_£\u001e·'ä\u0001×ÿ\u007fªSV°æUsz\u001fô| Ë\n3\u0094\u0014$Tâ´®ó\u0080\u001f\u00166Ëäéwà¡\u0016\u008eÃáÎ\\`\u001a2=m\u0003cu¹¹*í9\u0014rkë¥\u008b!¾ªB}+ê#ñ\u0011ýÒÊ\u008e¨V\u0097ï\u009a¸hü\u001dlÑWÖÅ\"\u008c\u008au {\u0003\u001aµÓèIU\"õé\\io(d\u000b×´Î°\u007fsO¥â\u008a=c\u000eÓ\u009874\u0099\u008fPÙÁ\u0003ä¬ÓX\u0090À\u009c\u001a2\u0007÷b;¦ð\u001d®þ\u0081\u008dE-û¥F_ÎóY¤Éz±¬ß\u001aqÒ\bb\u0010|\u0018\u0084ÁfO\u009b\u008e\u0019\u0088\u001dR.(\u0018\u009f`úC\u0011Ýì\"\u0099êI¨{;AGÆ¯=;\u009fæ¸çÿ-49ïê¡&K\u007f¾ºbð¿~ìç¨L\u008c5m¸Õ5¦Xÿ]@7&÷²)º\u0096\\@hü\u00ad¿+Fâøão.\u0094\u0085í]ÊW\u0096í@|\tÉn)\u0001\u008fÔE\u001dÿüT\u008dMÓí=¹\u0086\u0011'-,fðgS;AY]\u0087 sï\u008d¿)ÉcwÜ\u008c\u001f\u0086/Ð\u0011Öý3N[êñ_lÐ\u0015\b=£fd\u0019f\u0082\u0099\u008c\u0094e]~N\u001f¸\u007f`&ºùÂHl\u0080vÃYÏå]\u008a\u0004\u0016B¼\t{\u0091µÁ\\äAé0öÿrM2ñQ1·Æw;\b\u0090\b;\u0015!Ô®\u0086\u0085÷óçOp\u008b?ÖÌ\u0018í¹©êÒ\u0085\t}Kú\u001c»\u0012\u000b\u0082À;\u0007\u0092EÒDS\u001c4È \u000fsBº #.²íl\u0000\u008e\u0013éFó\u0004H²Ó_ðð\u008cõiìw¸¢Ý\u0088g\u001b¯\u001cûÔ0¶¨¥c\u0082t\u009b©K{ÐÕ*$\u00153¤< \u0081±YbñûL\u0093,g2@63y\u0098È\\åÔ@\u0007I3°ÑÒ¹çWÞ ò.¿\\\u0095b»À\u0010üºSn\u008fgB<GN\u0089ÓÿOþ\u0014ÉC\u0017z\u000bþ\u008e\u0016j6¸\u00134\u0017ÙMÎv:\u0018 ËÞþ)Ü¿\u009aE÷\u0089´$å=\u0005Ðiå\u0011Á\u0019Å\u0095Ò\u008a\u0087^uV\u000b=\u0019\u0098\u009e\u0004\u0093»mC\u008d\u0084g-päóê\u008cÓ\u0093O"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      ll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         ll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III(1317727525, (byte)-98, 23219, 1544040565)).length();
      int var1 = ll(-54573951, var23 ^ -1990347351);
      int var0 = -1;

      while (true) {
         char[] var10002;
         label83: {
            int var27 = ll(-54573950, var23 ^ -1650483703);
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
                  break label83;
               }

               var10005 = var10003;
               var10004 = var27;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % ll(-54573949, var23 ^ -774909075)) {
                  case 0 -> ll(-54573948, var23 ^ -2071405501);
                  case 1 -> ll(-54573947, var23 ^ -1790394658);
                  case 2 -> ll(-54573946, var23 ^ 2001611909);
                  case 3 -> ll(-54573945, var23 ^ -1456618152);
                  case 4 -> ll(-54573944, var23 ^ -1014878980);
                  case 5 -> ll(-54573943, var23 ^ -1986329110);
                  default -> ll(-54573942, var23 ^ -1952840792);
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
            lI = var5;
            I = new String[2];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static int ll(int var0, int var1) {
      int var2 = ll[var0 ^ -54573952] ^ var1 ^ var0;
      var2 += 45999;
      var2 -= 52275;
      var2 ^= 18285;
      var2 += 5617;
      var2 -= 44361;
      return var2 + 15953;
   }

   public void lI(int var1) {
      this.l(var1, 1);
   }

   public lIlIll() {
      super(
         IlIIllIII.Ill(Il(ll(-54573682, -1654922128 ^ 490546322), ll(-54573681, -1654922128 ^ 50473825))),
         lllIIlIl.Ill,
         IlIIllIII.Ill(Il(ll(-54573680, -1654922128 ^ -27084250), ll(-54573679, -1654922128 ^ -39174359)))
      );
   }

   @Override
   public boolean IlIIllI() {
      return true;
   }
}
