package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class IlIllllI extends IlIIIIIIl {
   private static final String[] I;
   private static final int[] lI;
   private static String[] II;
   private static final Object[] III;
   private static final String[] ll;
   private static final String[] Il;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = lI(-1369632976, 402058585 ^ 1218727790) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lI(-1369632973, 402058585 ^ 1918474028);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static int lI(int var0, int var1) {
      int var2 = lI[var0 ^ -1369632967] ^ var1 ^ var0;
      var2 -= 49944;
      var2 += 57350;
      var2 += 64974;
      var2 += 3247;
      var2 -= 39600;
      var2 += 14786;
      var2 -= 10813;
      var2 += 13128;
      var2 -= 56855;
      return var2 - 51907;
   }

   private static String l(int var0, int var1) {
      int var9 = 1574647591;
      int var2 = (var0 ^ lI(-1369632974, var9 ^ -15634443)) & lI(-1369632971, var9 ^ -1348240686);
      if (Il[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & lI(-1369632972, var9 ^ 776374858)) {
            case 0 -> lI(-1369632969, var9 ^ -396681121);
            case 1 -> lI(-1369632970, var9 ^ -92336810);
            case 2 -> lI(-1369632983, var9 ^ -367046048);
            case 3 -> lI(-1369632984, var9 ^ -546470315);
            case 4 -> lI(-1369632981, var9 ^ 204296348);
            case 5 -> lI(-1369632982, var9 ^ 2039710234);
            case 6 -> lI(-1369632979, var9 ^ -1221639378);
            case 7 -> lI(-1369632980, var9 ^ 1495044830);
            case 8 -> lI(-1369632977, var9 ^ -1129961660);
            case 9 -> lI(-1369632978, var9 ^ -1231078005);
            case 10 -> lI(-1369632991, var9 ^ 449443760);
            case 11 -> lI(-1369632992, var9 ^ 1755735908);
            case 12 -> lI(-1369632989, var9 ^ -1288907969);
            case 13 -> lI(-1369632990, var9 ^ 695113082);
            case 14 -> lI(-1369632987, var9 ^ -1663682449);
            case 15 -> lI(-1369632988, var9 ^ -848913482);
            case 16 -> lI(-1369632985, var9 ^ -2018082899);
            case 17 -> lI(-1369632986, var9 ^ 844334073);
            case 18 -> lI(-1369632999, var9 ^ -962777968);
            case 19 -> lI(-1369633000, var9 ^ -1349631570);
            case 20 -> lI(-1369632997, var9 ^ 320341902);
            case 21 -> lI(-1369632998, var9 ^ 1227398279);
            case 22 -> lI(-1369632995, var9 ^ 426356289);
            case 23 -> lI(-1369632996, var9 ^ 724682353);
            case 24 -> lI(-1369632993, var9 ^ 1742135509);
            case 25 -> lI(-1369632994, var9 ^ 34476141);
            case 26 -> lI(-1369633007, var9 ^ -1557276343);
            case 27 -> lI(-1369633008, var9 ^ 871353183);
            case 28 -> lI(-1369633005, var9 ^ -825777942);
            case 29 -> lI(-1369633006, var9 ^ -174769310);
            case 30 -> lI(-1369633003, var9 ^ 1834813422);
            case 31 -> lI(-1369633004, var9 ^ 1700649054);
            case 32 -> lI(-1369633001, var9 ^ -1139896599);
            case 33 -> lI(-1369633002, var9 ^ 1772577760);
            case 34 -> lI(-1369633015, var9 ^ 2103873490);
            case 35 -> lI(-1369633016, var9 ^ 235806014);
            case 36 -> lI(-1369633013, var9 ^ 112972642);
            case 37 -> 2;
            case 38 -> lI(-1369633014, var9 ^ 1347156996);
            case 39 -> lI(-1369633011, var9 ^ 1147924778);
            case 40 -> lI(-1369633012, var9 ^ -1627059604);
            case 41 -> lI(-1369633009, var9 ^ -2123488657);
            case 42 -> lI(-1369633010, var9 ^ 1078723648);
            case 43 -> lI(-1369633023, var9 ^ 916867377);
            case 44 -> lI(-1369633024, var9 ^ 500334949);
            case 45 -> lI(-1369633021, var9 ^ -1453586683);
            case 46 -> lI(-1369633022, var9 ^ 2040467744);
            case 47 -> lI(-1369633019, var9 ^ -1530598354);
            case 48 -> lI(-1369633020, var9 ^ -949353217);
            case 49 -> lI(-1369633017, var9 ^ 1136485865);
            case 50 -> lI(-1369633018, var9 ^ 1796758270);
            case 51 -> lI(-1369632903, var9 ^ 1388707808);
            case 52 -> lI(-1369632904, var9 ^ 596261327);
            case 53 -> lI(-1369632901, var9 ^ -1071563214);
            case 54 -> lI(-1369632902, var9 ^ -1488445079);
            case 55 -> lI(-1369632899, var9 ^ 1396331710);
            case 56 -> lI(-1369632900, var9 ^ -895499261);
            case 57 -> lI(-1369632897, var9 ^ 1682732834);
            case 58 -> lI(-1369632898, var9 ^ 362414873);
            case 59 -> lI(-1369632911, var9 ^ -1727308240);
            case 60 -> lI(-1369632912, var9 ^ -1734423905);
            case 61 -> lI(-1369632909, var9 ^ 1843487744);
            case 62 -> lI(-1369632910, var9 ^ -125277921);
            case 63 -> lI(-1369632907, var9 ^ 1255960808);
            case 64 -> lI(-1369632908, var9 ^ 1841969142);
            case 65 -> lI(-1369632905, var9 ^ -166678790);
            case 66 -> lI(-1369632906, var9 ^ 630520954);
            case 67 -> lI(-1369632919, var9 ^ -502676041);
            case 68 -> lI(-1369632920, var9 ^ 1484730829);
            case 69 -> lI(-1369632917, var9 ^ 2087413272);
            case 70 -> lI(-1369632918, var9 ^ 404579335);
            case 71 -> lI(-1369632915, var9 ^ 1738536047);
            case 72 -> lI(-1369632916, var9 ^ -851820201);
            case 73 -> lI(-1369632913, var9 ^ 950039935);
            case 74 -> lI(-1369632914, var9 ^ -1007696929);
            case 75 -> lI(-1369632927, var9 ^ -1572750460);
            case 76 -> lI(-1369632928, var9 ^ 1823529796);
            case 77 -> lI(-1369632925, var9 ^ -1311650475);
            case 78 -> lI(-1369632926, var9 ^ 1760263786);
            case 79 -> lI(-1369632923, var9 ^ 154032706);
            case 80 -> lI(-1369632924, var9 ^ -1209228810);
            case 81 -> lI(-1369632921, var9 ^ -477935183);
            case 82 -> lI(-1369632922, var9 ^ -1768122623);
            case 83 -> lI(-1369632935, var9 ^ 1451656917);
            case 84 -> lI(-1369632936, var9 ^ 2075984256);
            case 85 -> lI(-1369632933, var9 ^ -1969287146);
            case 86 -> lI(-1369632934, var9 ^ -1302600558);
            case 87 -> lI(-1369632931, var9 ^ 1207515765);
            case 88 -> lI(-1369632932, var9 ^ 1166358485);
            case 89 -> lI(-1369632929, var9 ^ 507118128);
            case 90 -> lI(-1369632930, var9 ^ 779647039);
            case 91 -> lI(-1369632943, var9 ^ 422388398);
            case 92 -> lI(-1369632944, var9 ^ -1865642750);
            case 93 -> lI(-1369632941, var9 ^ -1884154922);
            case 94 -> lI(-1369632942, var9 ^ -1043646454);
            case 95 -> lI(-1369632939, var9 ^ 1131383966);
            case 96 -> lI(-1369632940, var9 ^ -9487058);
            case 97 -> lI(-1369632937, var9 ^ 2140095462);
            case 98 -> lI(-1369632938, var9 ^ 2014499171);
            case 99 -> lI(-1369632951, var9 ^ 38070766);
            case 100 -> lI(-1369632952, var9 ^ 611438195);
            case 101 -> lI(-1369632949, var9 ^ -1366716713);
            case 102 -> lI(-1369632950, var9 ^ -1060917075);
            case 103 -> lI(-1369632947, var9 ^ -1522870275);
            case 104 -> 5;
            case 105 -> lI(-1369632948, var9 ^ 765081452);
            case 106 -> lI(-1369632945, var9 ^ 1138573179);
            case 107 -> lI(-1369632946, var9 ^ 735135904);
            case 108 -> lI(-1369632959, var9 ^ -2124533033);
            case 109 -> lI(-1369632960, var9 ^ 1054500218);
            case 110 -> lI(-1369632957, var9 ^ -1106322311);
            case 111 -> lI(-1369632958, var9 ^ 247834550);
            case 112 -> lI(-1369632955, var9 ^ 886484047);
            case 113 -> lI(-1369632956, var9 ^ 681397109);
            case 114 -> lI(-1369632953, var9 ^ 224322966);
            case 115 -> lI(-1369632954, var9 ^ 1269486866);
            case 116 -> lI(-1369632839, var9 ^ 1302183590);
            case 117 -> lI(-1369632840, var9 ^ 1666078924);
            case 118 -> lI(-1369632837, var9 ^ 795969018);
            case 119 -> lI(-1369632838, var9 ^ -564263123);
            case 120 -> lI(-1369632835, var9 ^ 930528129);
            case 121 -> lI(-1369632836, var9 ^ 2108747509);
            case 122 -> lI(-1369632833, var9 ^ 462935779);
            case 123 -> lI(-1369632834, var9 ^ 60669342);
            case 124 -> lI(-1369632847, var9 ^ 1072462767);
            case 125 -> lI(-1369632848, var9 ^ 2003256097);
            case 126 -> lI(-1369632845, var9 ^ 1769196415);
            case 127 -> lI(-1369632846, var9 ^ 1641706487);
            case 128 -> lI(-1369632843, var9 ^ 2094735564);
            case 129 -> lI(-1369632844, var9 ^ 319844970);
            case 130 -> lI(-1369632841, var9 ^ 337508689);
            case 131 -> lI(-1369632842, var9 ^ 752145939);
            case 132 -> lI(-1369632855, var9 ^ -1839161415);
            case 133 -> lI(-1369632856, var9 ^ 406962030);
            case 134 -> lI(-1369632853, var9 ^ 838502953);
            case 135 -> lI(-1369632854, var9 ^ 506383967);
            case 136 -> lI(-1369632851, var9 ^ 732698423);
            case 137 -> lI(-1369632852, var9 ^ -1497286774);
            case 138 -> lI(-1369632849, var9 ^ -1658158529);
            case 139 -> lI(-1369632850, var9 ^ 91623343);
            case 140 -> lI(-1369632863, var9 ^ 1736718730);
            case 141 -> lI(-1369632864, var9 ^ 389469780);
            case 142 -> lI(-1369632861, var9 ^ 1926862876);
            case 143 -> lI(-1369632862, var9 ^ 2069112760);
            case 144 -> lI(-1369632859, var9 ^ -1950446481);
            case 145 -> lI(-1369632860, var9 ^ -1611594961);
            case 146 -> lI(-1369632857, var9 ^ -315263896);
            case 147 -> lI(-1369632858, var9 ^ -659213586);
            case 148 -> lI(-1369632871, var9 ^ -732013320);
            case 149 -> lI(-1369632872, var9 ^ 1383858632);
            case 150 -> lI(-1369632869, var9 ^ 22796057);
            case 151 -> lI(-1369632870, var9 ^ -227871274);
            case 152 -> lI(-1369632867, var9 ^ 250123181);
            case 153 -> lI(-1369632868, var9 ^ -1700186218);
            case 154 -> lI(-1369632865, var9 ^ 937976342);
            case 155 -> lI(-1369632866, var9 ^ -1417981571);
            case 156 -> lI(-1369632879, var9 ^ -1294454082);
            case 157 -> lI(-1369632880, var9 ^ -89258016);
            case 158 -> lI(-1369632877, var9 ^ 845046819);
            case 159 -> lI(-1369632878, var9 ^ -1475623671);
            case 160 -> lI(-1369632875, var9 ^ 1701966117);
            case 161 -> lI(-1369632876, var9 ^ -551216075);
            case 162 -> lI(-1369632873, var9 ^ 1265739450);
            case 163 -> lI(-1369632874, var9 ^ -113097864);
            case 164 -> lI(-1369632887, var9 ^ -194181748);
            case 165 -> lI(-1369632888, var9 ^ -297183446);
            case 166 -> lI(-1369632885, var9 ^ 1775208341);
            case 167 -> lI(-1369632886, var9 ^ -270202959);
            case 168 -> lI(-1369632883, var9 ^ 1074685340);
            case 169 -> lI(-1369632884, var9 ^ 1980437475);
            case 170 -> lI(-1369632881, var9 ^ 1925596705);
            case 171 -> lI(-1369632882, var9 ^ 1230347493);
            case 172 -> lI(-1369632895, var9 ^ 577205607);
            case 173 -> lI(-1369632896, var9 ^ 895056490);
            case 174 -> lI(-1369632893, var9 ^ -902145556);
            case 175 -> lI(-1369632894, var9 ^ -87374160);
            case 176 -> lI(-1369632891, var9 ^ -1939406340);
            case 177 -> lI(-1369632892, var9 ^ 1375488069);
            case 178 -> lI(-1369632889, var9 ^ 370497294);
            case 179 -> lI(-1369632890, var9 ^ -719138355);
            case 180 -> lI(-1369632775, var9 ^ 516151836);
            case 181 -> lI(-1369632776, var9 ^ -94160213);
            case 182 -> lI(-1369632773, var9 ^ -1174569956);
            case 183 -> lI(-1369632774, var9 ^ 763804924);
            case 184 -> lI(-1369632771, var9 ^ 1956387270);
            case 185 -> lI(-1369632772, var9 ^ 848695068);
            case 186 -> lI(-1369632769, var9 ^ 654071892);
            case 187 -> lI(-1369632770, var9 ^ -1019578010);
            case 188 -> lI(-1369632783, var9 ^ 720594975);
            case 189 -> lI(-1369632784, var9 ^ -1730840221);
            case 190 -> lI(-1369632781, var9 ^ 132610346);
            case 191 -> lI(-1369632782, var9 ^ 772526813);
            case 192 -> lI(-1369632779, var9 ^ 785629800);
            case 193 -> lI(-1369632780, var9 ^ -1570214537);
            case 194 -> lI(-1369632777, var9 ^ -665634886);
            case 195 -> lI(-1369632778, var9 ^ -1854161757);
            case 196 -> lI(-1369632791, var9 ^ 89510296);
            case 197 -> lI(-1369632792, var9 ^ -606481276);
            case 198 -> lI(-1369632789, var9 ^ 2117319287);
            case 199 -> lI(-1369632790, var9 ^ -514759750);
            case 200 -> lI(-1369632787, var9 ^ -1212881476);
            case 201 -> lI(-1369632788, var9 ^ 821326726);
            case 202 -> lI(-1369632785, var9 ^ 1262116730);
            case 203 -> lI(-1369632786, var9 ^ -345801770);
            case 204 -> lI(-1369632799, var9 ^ -3051664);
            case 205 -> lI(-1369632800, var9 ^ 288276551);
            case 206 -> lI(-1369632797, var9 ^ -1583100402);
            case 207 -> lI(-1369632798, var9 ^ -1880137089);
            case 208 -> lI(-1369632795, var9 ^ 2116996444);
            case 209 -> lI(-1369632796, var9 ^ 70171357);
            case 210 -> lI(-1369632793, var9 ^ 107631419);
            case 211 -> lI(-1369632794, var9 ^ -726502658);
            case 212 -> 3;
            case 213 -> lI(-1369632807, var9 ^ 682353686);
            case 214 -> lI(-1369632808, var9 ^ 1431932309);
            case 215 -> lI(-1369632805, var9 ^ 430938356);
            case 216 -> 4;
            case 217 -> 0;
            case 218 -> lI(-1369632806, var9 ^ -835854015);
            case 219 -> lI(-1369632803, var9 ^ 493092103);
            case 220 -> lI(-1369632804, var9 ^ -1341749216);
            case 221 -> lI(-1369632801, var9 ^ 784329183);
            case 222 -> lI(-1369632802, var9 ^ -1655458710);
            case 223 -> lI(-1369632815, var9 ^ -1451439993);
            case 224 -> lI(-1369632816, var9 ^ -819081394);
            case 225 -> lI(-1369632813, var9 ^ -1037323450);
            case 226 -> lI(-1369632814, var9 ^ -1797195390);
            case 227 -> lI(-1369632811, var9 ^ 1154392752);
            case 228 -> 1;
            case 229 -> lI(-1369632812, var9 ^ -1391432795);
            case 230 -> lI(-1369632809, var9 ^ -1668572541);
            case 231 -> lI(-1369632810, var9 ^ -977172964);
            case 232 -> lI(-1369632823, var9 ^ 972331854);
            case 233 -> lI(-1369632824, var9 ^ 1476230345);
            case 234 -> lI(-1369632821, var9 ^ 1021715802);
            case 235 -> lI(-1369632822, var9 ^ 1771947757);
            case 236 -> lI(-1369632819, var9 ^ -1837362967);
            case 237 -> lI(-1369632820, var9 ^ 1936130867);
            case 238 -> lI(-1369632817, var9 ^ -1701817203);
            case 239 -> lI(-1369632818, var9 ^ -2065246401);
            case 240 -> lI(-1369632831, var9 ^ 1120324563);
            case 241 -> lI(-1369632832, var9 ^ -1794847733);
            case 242 -> lI(-1369632829, var9 ^ 1181424170);
            case 243 -> lI(-1369632830, var9 ^ -147745277);
            case 244 -> lI(-1369632827, var9 ^ -1698253176);
            case 245 -> lI(-1369632828, var9 ^ -983327002);
            case 246 -> lI(-1369632825, var9 ^ 1561919008);
            case 247 -> lI(-1369632826, var9 ^ -220107048);
            case 248 -> lI(-1369633223, var9 ^ -71549346);
            case 249 -> lI(-1369633224, var9 ^ -481982936);
            case 250 -> lI(-1369633221, var9 ^ -1343504821);
            case 251 -> lI(-1369633222, var9 ^ -202309561);
            case 252 -> lI(-1369633219, var9 ^ 1205224459);
            case 253 -> lI(-1369633220, var9 ^ -30916576);
            case 254 -> lI(-1369633217, var9 ^ -722514161);
            default -> lI(-1369633218, var9 ^ -44295258);
         };
         int var5 = (var1 & lI(-1369633231, var9 ^ 26451359)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lI(-1369633232, var9 ^ 136028545)) >>> lI(-1369633229, var9 ^ -564423568)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lI(-1369633230, var9 ^ 643251858);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lI(-1369633227, var9 ^ -317485043);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }

   @Override
   public void llIl() {
      IIIlIllll.lI();
   }

   @Override
   public void IIlIl() {
      IIIlIllll.lI();
      String[] var10000 = IIllllIl.IIIIl();
      class_310 var2 = class_310.method_1551();
      String[] var1 = var10000;
      if (var2 != null && var2.field_1724 != null && var2.field_1687 != null) {
         for (class_1297 var4 : var2.field_1687.method_18112()) {
            if (var4 instanceof class_1657 var5 && IlIII.lIlll(var2, var5)) {
               int var6 = this.II(var5).getRGB();
               IIIlIllll.II(var5.method_5667(), var6);
            }

            if (var1 != null) {
               break;
            }
         }
      }
   }

   private Color II(class_1657 var1) {
      IIIIIllII var2 = IIIIIllII.III();
      if (var2 != null && var2.II() != null && var2.II().IlIIll() != null) {
         Color var3 = var2.II().IlIIll().lIlI();
         double var4 = var1 == null ? 0.0 : var1.method_5628() * 0.173;
         return IllIIlIl.lI(var3, IIlIlIIl.lI, var4);
      } else {
         return Color.WHITE;
      }
   }

   private static String ll(int var0, short var1, int var2) {
      int var3 = var2 ^ 10718;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 18810;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 29763;
         var10 ^= 2515;
         var10 += 43728;
         var10 += 2446;
         var10 += 19165;
         var10 -= 6836;
         var10 += 9591;
         var10 -= 61302;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -1326857261;
      short var12 = 16166;
      int var10 = 0;
      String[] var9 = new String[1];
      int var11 = 0;
      int var8 = "e\ue856棁ሇ\ueb0aជᣒࣲꅥ팾妅諜ǝ鹐䛉莔묶鷫Ⅾ竍傋뭦ꍡ綍쿸ᛷᐘ纑䪽殌怷걏䘤캞잀㸑璆枯軳ᩴ\ue603⡷簔蕻\uf81a꿁\uef32쁔潮\uf308ボ얅킓ᩫꢼ閺ᰨ鐇ဦ洰锤퓧흈䮮\uf876ꙍ龀ଐ㾮쎖德ޖ鯺䁯\ue3c0觑㭃幹⹖ἥ᱖ዸ廄喻ቪ\u0dbfഞ堢\ue4cd\uf119䪞⻗斗ﴺꭲｚ\ueac1\uee8b䄓硟\uf197茈"
         .length();
      String var7 = "e\ue856棁ሇ\ueb0aជᣒࣲꅥ팾妅諜ǝ鹐䛉莔묶鷫Ⅾ竍傋뭦ꍡ綍쿸ᛷᐘ纑䪽殌怷걏䘤캞잀㸑璆枯軳ᩴ\ue603⡷簔蕻\uf81a꿁\uef32쁔潮\uf308ボ얅킓ᩫꢼ閺ᰨ鐇ဦ洰锤퓧흈䮮\uf876ꙍ龀ଐ㾮쎖德ޖ鯺䁯\ue3c0觑㭃幹⹖ἥ᱖ዸ廄喻ቪ\u0dbfഞ堢\ue4cd\uf119䪞⻗斗ﴺꭲｚ\ueac1\uee8b䄓硟\uf197茈";

      do {
         char var13 = var7.charAt(var11);
         String var10000 = var7.substring(var11 + 1, var11 + 1 + var13);
         int var15 = 0;
         char[] var14 = var10000.toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      int var19 = 0;
      int var10001 = 0;
      byte[] var10002 = "\u0093¤(\u001b\u009c:èMÆBt[9[¿52|¸\u001a¨Ãß²g&y/¸\u0086Z53ñ\u001auÕÌÀ\u008d¤\u0096\u001ePcó`ý3@*Ö²¤ÙOt¹p\u009cf\u009d^\u0007vý\u0001yC\u008fÖ\u0087\u0090Ï\u0003ÑåqÑ\u001d+Í\u0013\u008fÅþÁ\u008d Dw *}mi\u0086+§}ôD7\u0081/Î\u0083\tµ\u008cÆ\u0015\u00004k\u0017Q\u0084ËA\u001bT,û®±Ð\u00adZ\u007f|²3l\u0011¢\u008fúW\u0087ÕÊÏã\u0085\u008bþ»·Ó\u0096Uû4°=\u009eìC\u0000?Ï\u008a ¯\r\u0098\u0018R%ðWiwknñ¿Wæù¿\u008b\u001a ìÝÒõE3ká\u0084ßk\u0092ìM\u0095\u009aY\u0080\fÌ©¯TØ\u0089¡\u001d\u0003çY9\u001d\u008crÂÜ®W\u0006ªD\u0019â\u00810Ñµ5¾W\u0097å}A 8&¼Í[\u0088Tkß_5ù÷ú\nÆÎ'¬õ¿hip\\Ãn\u009e;ªr8ÏØ\u0007¶V}\u0094vø®$0\u0089xP\b\u0005é\u000eK\u0004|\u009a6ñ\u00034udj:DÖ> [ñ(g\u0016jòþ~¹v¬Ý~ë\u0096¤Ä\u009da-à\u00896ê\u0084ÿ4¢û}§kQØ\u0011Ã¤B%\u009f_\r\u0093M>£ë^ðR\u008bÌ-3\u009e\\ô\t.ö\u0095Ì\nù+\u000eñ\u001b\u007fa\u0019\t\n~Ä5ÊdÕÂç_R\u009f\u0016}@¦.¹·µÛ\u001bj\u0096Ùgg4\u0082ØQI²\u009a(Ò\u0085Ïqß\f.Þ\"\u0013PC\u0082])hgß\u008dÜKc\u008dm³ãm\u0013räð\u0081Ñ\u009e¦º\u008d¸\u0093\u009dO2kÞg\\!à\t9Ø\u0087¬±xgàß?o6·3\u001b\u00ad\u001d¼b\u008e¢85¥\"ì\u008c1\u0092'÷F¨4üï´\u007f\u0018z\u0091¼¶\u0087×H\u00860Ñ\u007fîÒÿ¬\bÀ³\u0093ÕýB¼WU«\u0094ë\u009aáR¾p\u0087u\u0086\u0087\u009f\u007fî\u007f£\u000e(~ë\u0085\u0010ùõ\u0091\u009b\bý8 `à9s\u0017\u008fò!¿\u0088ÿ©\u0007°6\u0085\u008d\u000e\u0082Ï»\u0084£ì\u0089\u00ad\u0018ÚX\u0082Ì\u009er·NG\u0097:#g\u008b\u0001ÈÑ·\u0099\u0094\\vûfi\u0083\u008bÔ\u0086\u007fî;È»ç¶w\f\u0017\\ß¡\u0003\u0013S\"q×'ëDWa\bH¼\u000fNÎ\u009eR\b\u009d¹\u0087\u008en\u0088¥ô\u0092\nÃ\u0094\u0006Kd(«\n1Ã7\u0099\u0001T.:a~fLW\u009f®¼4,4é\u0095\u0098ù\u0093¢ÒCÇL|×\u0093õ[e \u0010\u0092h\u008fVGr«\u00075õ-×¾s\u0007W¨Üì5\u0083êéCÚî$\u0015ÍÕ·Ì¿¾\u0085%\u0010©»*ïVØ\tÙf(\u0095\u0003\u0010\u0085QôÍ\u001e\u0018>\u008a÷\u0007iIÀ\u0081ä\u0082!\u008aaf\u0081jÍ%\u001f,?±dì\u0016è~Jr®t_(º\u001e\b\n_Ø)\u0081¶\u00118\u0003\u00047)\u0005\u009b\u0005)Ø²é\u0082'²1\u0091Ø>\u008a=ID±gM\r\u0099ì\u009b\u0099·\u0081ÝG;\u0084vâÑê\u008f}³0\u0014+V¶\n¬\u0016#¿×Ø\f¶w\u0081(fc3?r\u008dÌ\u0093\u0089=A\u009e\u0018\u0013\r2\u001bâÌ\u009d@\u0098Ìê£\u009a\u0088\u0000ýHP!M´I´óÉ»Ýp\u0085MËcRÏ±\u0015\u0081\u0081®\u0086,äØ\f²]¹¹\u0001±ä¥5\u009e\u0098«SÏ\u009f\u0006^Éã\u0014\b\u0002ª\u0011Ø,òk1ò;ä\u0000iÊÞY#Ö\u001c¥\u0016ËFË\u001f,\u000e \u0004v×õ\u007f\u0096\u0082\u000e\u009e@Æï\u0085S\r\u0006r\u0007\u0016\u0018\u0004\u0087[Þ$\u009b¨\tæ\u009f\u0098Ú\u0089J\u0000kÓÆ~\u0006$æÎY\u0081Î9Áú®Vn\u0003>¹g^oâ\u007f§Ôk3\tïoo\u0013Q¡Û4\u0016ObÊ\u0011öH\r\u001eÁa¾J\u0003\u009dqÏ\u009f\u0094øð\u0080B¹Åyºµl\u0091qñÂ\tÖ°$¹\u0015Ã\u000e\u009cÓ\u0015öf{\u0084µúkq\u0000Zò11\u00ad"
         .getBytes("ISO-8859-1");
      lI = new int[275];

      int var42;
      do {
         lI[var19] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1868869959;
         var19 += 1;
         var42 = var10001 + 4;
         var10001 += 4;
      } while (var42 < var10002.length);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = ll(var17 ^ 759800791, (short)24558, 10718)).length();
      int var1 = lI(-1369632967, var17 ^ -495678440);
      int var0 = -1;

      while (true) {
         label77: {
            var19 = lI(-1369632968, var17 ^ -303412175);
            char[] var43 = var2.substring(++var0, var0 + var1).toCharArray();
            int var53 = var43.length;
            int var6 = 0;
            var42 = var19;
            var32 = var43;
            var10001 = var53;
            char[] var62;
            int var69;
            if (var53 <= 1) {
               var62 = var43;
               var53 = var19;
               var69 = var6;
            } else {
               var42 = var19;
               var10001 = var53;
               if (var53 <= var6) {
                  break label77;
               }

               var62 = var43;
               var53 = var19;
               var69 = var6;
            }

            while (true) {
               var62[var69] = (char)(var62[var69] ^ var53 ^ switch (var6 % lI(-1369632965, var17 ^ -1215115091)) {
                  case 0 -> lI(-1369632966, var17 ^ 1217076197);
                  case 1 -> lI(-1369632963, var17 ^ 1135353053);
                  case 2 -> lI(-1369632964, var17 ^ -653034530);
                  case 3 -> lI(-1369632961, var17 ^ 385277228);
                  case 4 -> lI(-1369632962, var17 ^ -917045745);
                  case 5 -> lI(-1369632975, var17 ^ 1109507680);
                  default -> 5;
               });
               var6++;
               if (var42 == 0) {
                  var69 = var42;
                  var62 = var32;
                  var53 = var42;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var62 = var32;
                  var53 = var42;
                  var69 = var6;
               }
            }
         }

         String var46 = new String(var32).intern();
         byte var26 = -1;
         var5[var3++] = var46;
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

   private static void Il() {
      int var0 = 287426783;
      II[0] = I(l(lI(-1369633228, var0 ^ 111727951), lI(-1369633225, var0 ^ -975456091)).toCharArray(), 24992L, lI(-1369633226, var0 ^ 1812790570));
      II[1] = I(l(lI(-1369633239, var0 ^ -1415822320), lI(-1369633240, var0 ^ -1150735413)).toCharArray(), 28434L, lI(-1369633237, var0 ^ -1232599838));
   }

   public IlIllllI() {
      super(IlIIllIII.Ill(II[1]), lllIIlIl.IIl, IlIIllIII.Ill(II[0]));
   }
}
