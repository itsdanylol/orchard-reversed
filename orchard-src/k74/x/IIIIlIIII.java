package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1747;
import net.minecraft.class_2338;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class IIIIlIIII extends IlIIIIIIl {
   private int I;
   private static final String[] II;
   private static final int[] lll;
   private static final String[] Il;
   private static final String[] IIII;
   private boolean lI;
   private final lIlllIl ll;
   private boolean III;
   private final lllIIlII IIl;
   private final IIlIII IlI;
   private int Ill;
   private static final Object[] IIIl;
   private static String[] lII;
   private final lllIIlII lIl;
   private final lllIIlII llI;

   private static int l(int var0, int var1) {
      int var2 = lll[var0 ^ 1300137005] ^ var1 ^ var0;
      var2 += 61401;
      var2 ^= 26522;
      var2 -= 4108;
      var2 -= 37792;
      var2 -= 31565;
      var2 -= 21428;
      var2 += 50558;
      var2 ^= 15378;
      var2 ^= 42159;
      return var2 - 3983;
   }

   private void I() {
      this.lI = false;
      this.I = 0;
      this.Ill = 0;
      this.III = false;
   }

   private static String II(int var0, int var1) {
      int var9 = 562171335;
      int var2 = (var0 ^ l(1300137005, var9 ^ -1238661682)) & l(1300137004, var9 ^ 1255389659);
      if (II[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & l(1300137007, var9 ^ -1907365503)) {
            case 0 -> l(1300137006, var9 ^ 993228615);
            case 1 -> l(1300137001, var9 ^ 1638870434);
            case 2 -> l(1300137000, var9 ^ -466136762);
            case 3 -> l(1300137003, var9 ^ -705588511);
            case 4 -> l(1300137002, var9 ^ 1141191816);
            case 5 -> l(1300136997, var9 ^ -927137617);
            case 6 -> l(1300136996, var9 ^ 563052873);
            case 7 -> l(1300136999, var9 ^ 1902160900);
            case 8 -> 1;
            case 9 -> l(1300136998, var9 ^ -1283038166);
            case 10 -> l(1300136993, var9 ^ -457117362);
            case 11 -> l(1300136992, var9 ^ 1217211339);
            case 12 -> 3;
            case 13 -> l(1300136995, var9 ^ -2112187593);
            case 14 -> l(1300136994, var9 ^ -1998822647);
            case 15 -> l(1300137021, var9 ^ -2015413221);
            case 16 -> l(1300137020, var9 ^ 340512817);
            case 17 -> l(1300137023, var9 ^ -889897282);
            case 18 -> l(1300137022, var9 ^ 749471202);
            case 19 -> l(1300137017, var9 ^ -1241272267);
            case 20 -> l(1300137016, var9 ^ 1963875060);
            case 21 -> l(1300137019, var9 ^ 1241163747);
            case 22 -> l(1300137018, var9 ^ 1685448384);
            case 23 -> l(1300137013, var9 ^ -1716290788);
            case 24 -> l(1300137012, var9 ^ 1146252521);
            case 25 -> l(1300137015, var9 ^ 1490593160);
            case 26 -> l(1300137014, var9 ^ -621420576);
            case 27 -> l(1300137009, var9 ^ -1326844962);
            case 28 -> l(1300137008, var9 ^ -194051609);
            case 29 -> l(1300137011, var9 ^ 518346296);
            case 30 -> l(1300137010, var9 ^ 1015557937);
            case 31 -> l(1300136973, var9 ^ 4827405);
            case 32 -> l(1300136972, var9 ^ 715665719);
            case 33 -> l(1300136975, var9 ^ 423810736);
            case 34 -> l(1300136974, var9 ^ 746629246);
            case 35 -> l(1300136969, var9 ^ 1891420065);
            case 36 -> l(1300136968, var9 ^ -1613462769);
            case 37 -> l(1300136971, var9 ^ 1851030567);
            case 38 -> l(1300136970, var9 ^ 1557296854);
            case 39 -> l(1300136965, var9 ^ 1030484805);
            case 40 -> l(1300136964, var9 ^ -538151348);
            case 41 -> l(1300136967, var9 ^ 1042893554);
            case 42 -> l(1300136966, var9 ^ -1254899234);
            case 43 -> l(1300136961, var9 ^ 1004587936);
            case 44 -> l(1300136960, var9 ^ 2110565219);
            case 45 -> l(1300136963, var9 ^ -118507371);
            case 46 -> l(1300136962, var9 ^ -274997897);
            case 47 -> l(1300136989, var9 ^ -1793456264);
            case 48 -> l(1300136988, var9 ^ 1807211513);
            case 49 -> l(1300136991, var9 ^ -1134131621);
            case 50 -> l(1300136990, var9 ^ 1951551678);
            case 51 -> l(1300136985, var9 ^ 128930550);
            case 52 -> l(1300136984, var9 ^ 1412216921);
            case 53 -> l(1300136987, var9 ^ 874203327);
            case 54 -> 5;
            case 55 -> l(1300136986, var9 ^ 1212372250);
            case 56 -> l(1300136981, var9 ^ 1592487255);
            case 57 -> l(1300136980, var9 ^ 789857678);
            case 58 -> l(1300136983, var9 ^ -862613562);
            case 59 -> l(1300136982, var9 ^ 721243680);
            case 60 -> l(1300136977, var9 ^ 458486234);
            case 61 -> l(1300136976, var9 ^ 1570536612);
            case 62 -> l(1300136979, var9 ^ 1968514230);
            case 63 -> l(1300136978, var9 ^ -1373260213);
            case 64 -> l(1300137069, var9 ^ -1515097426);
            case 65 -> l(1300137068, var9 ^ -1988001391);
            case 66 -> l(1300137071, var9 ^ 1937153665);
            case 67 -> l(1300137070, var9 ^ 1667679229);
            case 68 -> l(1300137065, var9 ^ -644564325);
            case 69 -> 2;
            case 70 -> l(1300137064, var9 ^ -1773902216);
            case 71 -> l(1300137067, var9 ^ 724794336);
            case 72 -> l(1300137066, var9 ^ 1615155702);
            case 73 -> l(1300137061, var9 ^ -2068092104);
            case 74 -> l(1300137060, var9 ^ -1084298599);
            case 75 -> l(1300137063, var9 ^ 1597807581);
            case 76 -> l(1300137062, var9 ^ -1065503506);
            case 77 -> l(1300137057, var9 ^ 1886371758);
            case 78 -> l(1300137056, var9 ^ 1439530542);
            case 79 -> l(1300137059, var9 ^ 572941364);
            case 80 -> l(1300137058, var9 ^ -1177656115);
            case 81 -> 0;
            case 82 -> l(1300137085, var9 ^ -1817393024);
            case 83 -> l(1300137084, var9 ^ -1252300550);
            case 84 -> l(1300137087, var9 ^ -378484285);
            case 85 -> l(1300137086, var9 ^ -771390721);
            case 86 -> l(1300137081, var9 ^ -409692306);
            case 87 -> l(1300137080, var9 ^ 1282697071);
            case 88 -> l(1300137083, var9 ^ -1713196423);
            case 89 -> l(1300137082, var9 ^ -1996446731);
            case 90 -> l(1300137077, var9 ^ 476300568);
            case 91 -> l(1300137076, var9 ^ 192275568);
            case 92 -> l(1300137079, var9 ^ -32328152);
            case 93 -> l(1300137078, var9 ^ -1498275981);
            case 94 -> l(1300137073, var9 ^ 117258659);
            case 95 -> l(1300137072, var9 ^ -808385237);
            case 96 -> l(1300137075, var9 ^ -1683477194);
            case 97 -> l(1300137074, var9 ^ 706943247);
            case 98 -> l(1300137037, var9 ^ 1277500609);
            case 99 -> l(1300137036, var9 ^ 54392935);
            case 100 -> l(1300137039, var9 ^ -86089218);
            case 101 -> l(1300137038, var9 ^ -905424699);
            case 102 -> l(1300137033, var9 ^ 1784300793);
            case 103 -> l(1300137032, var9 ^ 1235268038);
            case 104 -> l(1300137035, var9 ^ 826637312);
            case 105 -> l(1300137034, var9 ^ -112234734);
            case 106 -> l(1300137029, var9 ^ -722240044);
            case 107 -> l(1300137028, var9 ^ -832522857);
            case 108 -> l(1300137031, var9 ^ -1788227360);
            case 109 -> l(1300137030, var9 ^ 1285448737);
            case 110 -> l(1300137025, var9 ^ -681338223);
            case 111 -> l(1300137024, var9 ^ -1537452216);
            case 112 -> l(1300137027, var9 ^ -306649274);
            case 113 -> l(1300137026, var9 ^ 1729580055);
            case 114 -> l(1300137053, var9 ^ -320511168);
            case 115 -> l(1300137052, var9 ^ -551084315);
            case 116 -> l(1300137055, var9 ^ -871439246);
            case 117 -> l(1300137054, var9 ^ -820116366);
            case 118 -> l(1300137049, var9 ^ 906272968);
            case 119 -> l(1300137048, var9 ^ 1225605897);
            case 120 -> l(1300137051, var9 ^ 578556436);
            case 121 -> l(1300137050, var9 ^ 33127526);
            case 122 -> l(1300137045, var9 ^ 1409908438);
            case 123 -> l(1300137044, var9 ^ 1660299955);
            case 124 -> l(1300137047, var9 ^ 953029259);
            case 125 -> l(1300137046, var9 ^ 196481126);
            case 126 -> l(1300137041, var9 ^ 1715212635);
            case 127 -> l(1300137040, var9 ^ 157354584);
            case 128 -> 4;
            case 129 -> l(1300137043, var9 ^ 21887611);
            case 130 -> l(1300137042, var9 ^ 427692222);
            case 131 -> l(1300137133, var9 ^ 1009984089);
            case 132 -> l(1300137132, var9 ^ -148945538);
            case 133 -> l(1300137135, var9 ^ -931239160);
            case 134 -> l(1300137134, var9 ^ 434362553);
            case 135 -> l(1300137129, var9 ^ -1339813673);
            case 136 -> l(1300137128, var9 ^ 1811346342);
            case 137 -> l(1300137131, var9 ^ -469223800);
            case 138 -> l(1300137130, var9 ^ 377056166);
            case 139 -> l(1300137125, var9 ^ 289678494);
            case 140 -> l(1300137124, var9 ^ 2081621497);
            case 141 -> l(1300137127, var9 ^ -1110014461);
            case 142 -> l(1300137126, var9 ^ 1231571175);
            case 143 -> l(1300137121, var9 ^ 506290607);
            case 144 -> l(1300137120, var9 ^ -829742355);
            case 145 -> l(1300137123, var9 ^ 1222585791);
            case 146 -> l(1300137122, var9 ^ 347159677);
            case 147 -> l(1300137149, var9 ^ 471403003);
            case 148 -> l(1300137148, var9 ^ -521130737);
            case 149 -> l(1300137151, var9 ^ 779782610);
            case 150 -> l(1300137150, var9 ^ -760328525);
            case 151 -> l(1300137145, var9 ^ -1189995093);
            case 152 -> l(1300137144, var9 ^ -1905993316);
            case 153 -> l(1300137147, var9 ^ 288226044);
            case 154 -> l(1300137146, var9 ^ 89644987);
            case 155 -> l(1300137141, var9 ^ 741736285);
            case 156 -> l(1300137140, var9 ^ -377399542);
            case 157 -> l(1300137143, var9 ^ 1316309348);
            case 158 -> l(1300137142, var9 ^ -1249003447);
            case 159 -> l(1300137137, var9 ^ -81934892);
            case 160 -> l(1300137136, var9 ^ -919789144);
            case 161 -> l(1300137139, var9 ^ -2025842248);
            case 162 -> l(1300137138, var9 ^ 923388715);
            case 163 -> l(1300137101, var9 ^ 180553421);
            case 164 -> l(1300137100, var9 ^ 210380650);
            case 165 -> l(1300137103, var9 ^ 1118273955);
            case 166 -> l(1300137102, var9 ^ -1190604496);
            case 167 -> l(1300137097, var9 ^ 306678831);
            case 168 -> l(1300137096, var9 ^ 244664717);
            case 169 -> l(1300137099, var9 ^ -210186134);
            case 170 -> l(1300137098, var9 ^ -978057270);
            case 171 -> l(1300137093, var9 ^ -620674876);
            case 172 -> l(1300137092, var9 ^ -716986556);
            case 173 -> l(1300137095, var9 ^ 1307868519);
            case 174 -> l(1300137094, var9 ^ -201429692);
            case 175 -> l(1300137089, var9 ^ -1773264118);
            case 176 -> l(1300137088, var9 ^ 760055761);
            case 177 -> l(1300137091, var9 ^ 1966228429);
            case 178 -> l(1300137090, var9 ^ 744832791);
            case 179 -> l(1300137117, var9 ^ -823056976);
            case 180 -> l(1300137116, var9 ^ -1230119972);
            case 181 -> l(1300137119, var9 ^ -1043456297);
            case 182 -> l(1300137118, var9 ^ 887799318);
            case 183 -> l(1300137113, var9 ^ -2145689827);
            case 184 -> l(1300137112, var9 ^ -1645098979);
            case 185 -> l(1300137115, var9 ^ -1969898156);
            case 186 -> l(1300137114, var9 ^ -2035029769);
            case 187 -> l(1300137109, var9 ^ 992272046);
            case 188 -> l(1300137108, var9 ^ -2096589963);
            case 189 -> l(1300137111, var9 ^ 356248877);
            case 190 -> l(1300137110, var9 ^ 1298558047);
            case 191 -> l(1300137105, var9 ^ 1803669420);
            case 192 -> l(1300137104, var9 ^ -401456620);
            case 193 -> l(1300137107, var9 ^ -11966462);
            case 194 -> l(1300137106, var9 ^ -707105980);
            case 195 -> l(1300137197, var9 ^ 650036250);
            case 196 -> l(1300137196, var9 ^ -773739967);
            case 197 -> l(1300137199, var9 ^ 1575410748);
            case 198 -> l(1300137198, var9 ^ -105325854);
            case 199 -> l(1300137193, var9 ^ -1845300889);
            case 200 -> l(1300137192, var9 ^ -1754926396);
            case 201 -> l(1300137195, var9 ^ 1477463256);
            case 202 -> l(1300137194, var9 ^ 431277880);
            case 203 -> l(1300137189, var9 ^ -1239192775);
            case 204 -> l(1300137188, var9 ^ 1686918398);
            case 205 -> l(1300137191, var9 ^ -2015343614);
            case 206 -> l(1300137190, var9 ^ -841477951);
            case 207 -> l(1300137185, var9 ^ 797518931);
            case 208 -> l(1300137184, var9 ^ -276803504);
            case 209 -> l(1300137187, var9 ^ -1934080784);
            case 210 -> l(1300137186, var9 ^ 212349284);
            case 211 -> l(1300137213, var9 ^ -1911302138);
            case 212 -> l(1300137212, var9 ^ 1382777756);
            case 213 -> l(1300137215, var9 ^ 555789658);
            case 214 -> l(1300137214, var9 ^ -754976084);
            case 215 -> l(1300137209, var9 ^ 1441523021);
            case 216 -> l(1300137208, var9 ^ 1864984959);
            case 217 -> l(1300137211, var9 ^ 1371080707);
            case 218 -> l(1300137210, var9 ^ -2031346927);
            case 219 -> l(1300137205, var9 ^ 1436310736);
            case 220 -> l(1300137204, var9 ^ -324076059);
            case 221 -> l(1300137207, var9 ^ 1839734158);
            case 222 -> l(1300137206, var9 ^ 1841615971);
            case 223 -> l(1300137201, var9 ^ 29791587);
            case 224 -> l(1300137200, var9 ^ -1101220331);
            case 225 -> l(1300137203, var9 ^ 611132007);
            case 226 -> l(1300137202, var9 ^ 1379984210);
            case 227 -> l(1300137165, var9 ^ 134023546);
            case 228 -> l(1300137164, var9 ^ 87216699);
            case 229 -> l(1300137167, var9 ^ 1898170619);
            case 230 -> l(1300137166, var9 ^ 1334680643);
            case 231 -> l(1300137161, var9 ^ -1190735998);
            case 232 -> l(1300137160, var9 ^ 694375735);
            case 233 -> l(1300137163, var9 ^ -254595140);
            case 234 -> l(1300137162, var9 ^ -429117926);
            case 235 -> l(1300137157, var9 ^ 820472542);
            case 236 -> l(1300137156, var9 ^ -1954756247);
            case 237 -> l(1300137159, var9 ^ -1481446055);
            case 238 -> l(1300137158, var9 ^ 1010137195);
            case 239 -> l(1300137153, var9 ^ -406065802);
            case 240 -> l(1300137152, var9 ^ -1124383566);
            case 241 -> l(1300137155, var9 ^ -1749544566);
            case 242 -> l(1300137154, var9 ^ 699071219);
            case 243 -> l(1300137181, var9 ^ 158543467);
            case 244 -> l(1300137180, var9 ^ -967499172);
            case 245 -> l(1300137183, var9 ^ -1601030615);
            case 246 -> l(1300137182, var9 ^ 984584033);
            case 247 -> l(1300137177, var9 ^ 1508537525);
            case 248 -> l(1300137176, var9 ^ -1659376171);
            case 249 -> l(1300137179, var9 ^ -1012758310);
            case 250 -> l(1300137178, var9 ^ -1975573920);
            case 251 -> l(1300137173, var9 ^ 300208);
            case 252 -> l(1300137172, var9 ^ -616773044);
            case 253 -> l(1300137175, var9 ^ -643941150);
            case 254 -> l(1300137174, var9 ^ -860011374);
            default -> l(1300137169, var9 ^ 1822600617);
         };
         int var5 = (var1 & l(1300137168, var9 ^ -550917784)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & l(1300137171, var9 ^ 1490955968)) >>> l(1300137170, var9 ^ 326904032)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & l(1300137261, var9 ^ 468309635);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & l(1300137260, var9 ^ 175761717);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }

   public boolean Il(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      this.III = false;
      if (this.IIIIlIl() && var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1690 != null && var1.field_1724.method_5805()) {
         class_746 var3 = var1.field_1724;
         if (this.lIl.IllI() && !this.III(var3)) {
            this.lI = false;
            this.I = 0;
            return false;
         } else {
            label69: {
               class_2338 var4 = class_2338.method_49637(var3.method_23317(), var3.method_23318() - 1.0, var3.method_23321());
               boolean var5 = this.IIl.IllI() && !var3.method_24828();
               boolean var6 = this.llI.IllI() && var1.field_1690.field_1894.method_1434();
               this.lI = !var5 && !var6 && var1.field_1687.method_8320(var4).method_26215();
               if (this.lI) {
                  this.Ill = this.lII();
                  this.I++;
                  if (var2 == null) {
                     break label69;
                  }
               }

               this.I = 0;
            }

            boolean var7 = this.Ill > 0;
            this.Ill--;
            this.III = this.Ill > 0 && this.I <= 2;
            return var7;
         }
      } else {
         this.I();
         return false;
      }
   }

   private static String lI(char[] var0, long var1, int var3) {
      int var4 = l(1300137263, -1963632089 ^ -245290499) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & l(1300137262, -1963632089 ^ 1449975770);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String llI(int var0, int var1) {
      int var3 = var0 ^ 2130182655;
      char[] var4 = IIII[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 714161563;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 248;
            case 1 -> 165;
            case 2 -> 133;
            case 3 -> 249;
            case 4 -> 30;
            case 5 -> 237;
            case 6 -> 139;
            case 7 -> 219;
            case 8 -> 85;
            case 9 -> 38;
            case 10 -> 230;
            case 11 -> 245;
            case 12 -> 250;
            case 13 -> 1;
            case 14 -> 252;
            case 15 -> 221;
            case 16 -> 228;
            case 17 -> 196;
            case 18 -> 240;
            case 19 -> 98;
            case 20 -> 226;
            case 21 -> 14;
            case 22 -> 51;
            case 23 -> 208;
            case 24 -> 63;
            case 25 -> 115;
            case 26 -> 94;
            case 27 -> 185;
            case 28 -> 24;
            case 29 -> 95;
            case 30 -> 23;
            case 31 -> 54;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public double ll(class_310 var1) {
      return this.IIIIlIl() && this.III ? this.IlI.IllI() : 1.0;
   }

   private boolean III(class_746 var1) {
      return var1.method_6047().method_7909() instanceof class_1747 || var1.method_6079().method_7909() instanceof class_1747;
   }

   @Override
   public void llIl() {
      this.I();
   }

   public boolean IIl(class_310 var1) {
      return false;
   }

   private static void Ill() {
      int var0 = 2067873036;
      lII[0] = lI(II(l(1300137257, var0 ^ -1127234456), l(1300137256, var0 ^ -97314818)).toCharArray(), 19558L, l(1300137259, var0 ^ 1146720627));
      lII[1] = lI(II(l(1300137258, var0 ^ 1551135028), l(1300137253, var0 ^ 1916824961)).toCharArray(), 18068L, l(1300137252, var0 ^ 14797772));
      lII[2] = lI(II(l(1300137255, var0 ^ -470323174), l(1300137254, var0 ^ 1086602679)).toCharArray(), 57146L, l(1300137249, var0 ^ -1468556138));
      lII[3] = lI(II(l(1300137248, var0 ^ -1450050633), l(1300137251, var0 ^ 1287099157)).toCharArray(), 67864L, l(1300137250, var0 ^ 50095013));
      lII[4] = lI(II(l(1300137277, var0 ^ 1214288150), l(1300137276, var0 ^ -1164211320)).toCharArray(), 56023L, l(1300137279, var0 ^ -1714892377));
      lII[5] = lI(II(l(1300137278, var0 ^ 1214254682), l(1300137273, var0 ^ -1819499909)).toCharArray(), 17931L, l(1300137272, var0 ^ 2059873647));
      lII[l(1300137275, var0 ^ -428157789)] = lI(
         II(l(1300137274, var0 ^ 1895945716), l(1300137269, var0 ^ 1669180388)).toCharArray(), 64583L, l(1300137268, var0 ^ -1933095101)
      );
      lII[l(1300137271, var0 ^ 1001984184)] = lI(
         II(l(1300137270, var0 ^ 1131491282), l(1300137265, var0 ^ 1213435357)).toCharArray(), 2143L, l(1300137264, var0 ^ -243062134)
      );
   }

   private int lII() {
      int var1 = Math.max(1, (int)Math.round(this.ll.IIlI()));
      int var2 = Math.max(var1, (int)Math.round(this.ll.IlI()));
      return ThreadLocalRandom.current().nextInt(var1, var2 + 1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1422725310;
      int var14 = "¡Ꝙ鸴㽎曃ࠗ\uf398Ⱑ㒖\ued51訋\ued2f輸傪틝䔘껻ᴤ精\ue49f쇲Ⴇ疡\ue93f熙穱豢珓㲴ᘜᔛ飌뾿ܦ柯⒣ٓ螽赘胗凭鎾\ud804엑ᘘ⌆\uea18諨衸\udfba뺲齗䘬첹ᰑ閁뗭ጱ礄㒗䲟샥ༀŞࠜԶ双탽峑杄躪麤≕ꢔ튀\ued83쀿꣬ꡛ\uf116顀怕ዕ夈湩檰\uf33d眖ꕀ熓쾸ꅐὃ둍ͻ煚퍉옠쭖꺆븋ᅃՉꇥ砝僺\uda81ﯩ\udd7a\ued04틙ꮚ\uf6e9᥌䴼拖켷蠒픡沖Ů呓\uef9c돁ￅ쭣䧯ﴂ\uf09fࡪ\udc74\uf771⋐趎릭ﲵ뙝ຆ\uf2aa炷趽ߖ뽓ᵰ감咣榴假ꪀ릙씼㋄➰⠦읥楶춍￨\ueb74뀷ྥ톯)\ue26c\uf784∑짋둩퓾먺눅誮彜䓈渚輧\uda49㼧䳫\uef41\ue02cאգ\ued76⅍\udc35ꏴﯡ\u0a31퓡磚惱⟨剞鉑㝿\uda0f\uead0笂왓칚ම뭘労"
         .length();
      String[] var15 = new String[2];
      short var18 = 18839;
      int var17 = 0;
      int var16 = 0;
      String var13 = "¡Ꝙ鸴㽎曃ࠗ\uf398Ⱑ㒖\ued51訋\ued2f輸傪틝䔘껻ᴤ精\ue49f쇲Ⴇ疡\ue93f熙穱豢珓㲴ᘜᔛ飌뾿ܦ柯⒣ٓ螽赘胗凭鎾\ud804엑ᘘ⌆\uea18諨衸\udfba뺲齗䘬첹ᰑ閁뗭ጱ礄㒗䲟샥ༀŞࠜԶ双탽峑杄躪麤≕ꢔ튀\ued83쀿꣬ꡛ\uf116顀怕ዕ夈湩檰\uf33d眖ꕀ熓쾸ꅐὃ둍ͻ煚퍉옠쭖꺆븋ᅃՉꇥ砝僺\uda81ﯩ\udd7a\ued04틙ꮚ\uf6e9᥌䴼拖켷蠒픡沖Ů呓\uef9c돁ￅ쭣䧯ﴂ\uf09fࡪ\udc74\uf771⋐趎릭ﲵ뙝ຆ\uf2aa炷趽ߖ뽓ᵰ감咣榴假ꪀ릙씼㋄➰⠦읥楶춍￨\ueb74뀷ྥ톯)\ue26c\uf784∑짋둩퓾먺눅誮彜䓈渚輧\uda49㼧䳫\uef41\ue02cאգ\ued76⅍\udc35ꏴﯡ\u0a31퓡磚惱⟨剞鉑㝿\uda0f\uead0笂왓칚ම뭘労";

      do {
         char var19 = var13.charAt(var17);
         String var10000 = var13.substring(var17 + 1, var17 + 1 + var19);
         int var21 = 0;
         char[] var20 = var10000.toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << '\r') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> '\r') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIII = var15;
      IIIl = new Object[var15.length];
      int var9 = 581831596;
      byte[] var7 = "\u0007\u0086¼p\u0004\u0080\u000f\u0083À\u001d\bÚua\u0097z/ýÎ_ªeà-\u009b£#â\nWÕé\u0086ïã!oÝa\u0084?2LÏýÔÒvª\u0092G\u0005\u0006ßËèÌHp¦Æ\u008eÒjÉ\u008dÜîZ\u0019a\\\u0084§\u008f´bþ´\u008føQ\u0001=;\\ºK\u0007¨F®*'Wf×áÊ\u0091\n\u0000\u008f\b\u0016\u008a\u0014ï\u0094§i¿þ»\u0013\bº=°VP·àsrÚ\u0099tN\u001bI\u001edúÑ=W\u0010`ÜbÒK¡>îv\u0011Ñ\u0086c\u0000 \u0006Í»\u0012\u0080\u0096/s9\u0013[\u0091¾\u0095üp{ªåûapêu²z\u00073\u009eHÉ¶½XX¡É=\u009fÛHçA%åjÓò47I:\u0000°MIý²\n\u001a~\tÒzIþÙ\u0006\u0011µ÷\u0010¹ÜJaF¤Ò\u0082Ç>Nd¯®)U\u0001@i\u0013Î\u009fj;\u0007ÄQàwV¯ëãÄ¤ÇÓ0h=$/|-4 &\u0097ÆZ8Ø\u0016× ea\u009br.\u0017±|Êé\u008a,ñ\f\t8\u0011n*\u0091\u008e/\u0002é>=_Ê\u001b\u009f\u009eXlt\u0087Ý÷\u009c\u0084LÝþ(2û\t\u0088{§\"\u007fÒ\u009cWcý©Æ!i\u0002&Ö¬×°\u0003\u0092ÇR\u0012ÍR1tGE'U\u000b°@V\u007fèàüÂH¯Ú\u0016\u0081\u0083å[ÕúÍXdq¯\u0018\u0002wÿNMoI°´\u008c\u0081@\u0084Zá\u0012$\bõå\u0007òQ`\u007f\u0017\u009c¤·\u001dÙ'\u009a¡\u009eI\u00802\u0004\u008bÛ;fË\u0002ÌÒ\n\u00991,¿ê\u000e·-£êV©)E\u00ad%¢·Õd\u0091u¨Û\u0082\\Uy\u0081LäáxVCK\u0007_òxl.£\u000bO«\u009fá\u001a[ÏÃ,¤É4v\u009c£JEäðÂ(n 6G3é\u0081O\u001f\u001a?W,ðèraÂ?¹M¥é\u0086,\u008b\u009fW±;¿þv¡w%¤EfªZÕ®X+\u008ax_\u0016Ä\u00052Aå\u0094ó\u0084gÖ\u0007:«ÎP\u007f\u0081ö\u0080ÙÁ\u0094\u0006\u008d\u009c\u0081ZãßnRKè5®¢Í¢`(8Ê\u009cü\u00ad¢÷@ýéÀ69Þ_\u007f\u001aaK\u0005?àbg\u001f\u0016§Ó¶ð\u0000'©Çûß\u000e\u0094µOs\u0005\u0087\u007f\u0090EÉ\u0012ú\u0083y[zËD\u0091·\u0016BØ\u0096½\fõ0\u0089÷Z`\u0091\\\u0015o}@Çÿc½*a[\u008bæ¶K\u0095S `\u009b\u0011\u0016ó\u0003¦\u009eN½¬\u008eLØ\u001cÀ\"c\u001fd\u0086;`£²b7ßj\u0080£Å\u000eøÿ;«\u008f\u009cý\u009az¸\u000fÑÎI¿\u0085Ó£y\u001dÄÇ\\\u0085Èá\bAuv>\u001cÍZ\"V[i\\\u001b\u00034\u008cë%Ó,ë¦@ó\u008a±\u001b\u0088\u0088\u009b\u0088\u0088]hì$â\u009f³\u001bú\u0013´?\f·ê:\u0014ÜP@£Ù7C \u0016B¬×Wæ'ëøq\u008bÞ*Þ·ÙÉ²ý\u007f\u0083\u008añRaÛ\u009d\r¡ÒáõÂê¤\u0001BúÑ\u008aÀAiÕ\u001c92:or\u001cû\u009c\u00adKÃ\u001b¹\u0006\u0002!{\u008aW\u001fë¹òÈ¾ª\u00ad\u001bÎí»¢üLM#ú«\u0002#\u009678O\u0094$Õð\u000eUVj?\u0093 \u001c\u0012R4I¯éUK`c»?q~P\u0001ß-)÷T,\u0087g1¶O¾\u0081ÏJ¨>Î8~µ\u008a\u0007Å.)\u0092éà\rkrg\u0098·©\u0099\\\nò©¤EÙêò\u0095gøK\u008fG!Ïù\u0088\u0007ÁFîÀÖ\u0010tý>à\u0017¸\u0097ÐÓE\r7\u008dðhñÄmÁzNVw¤\u0095n{8\u0097Ì\u008d±\u0082ï¥\t\"ð\u001cÛ\u0091{HÌ\u0016\u008d\u0098g].\u0099³U»6ÚD+\tmá\u0091\u0084&³Ih`W¡Ì\u001c\u0011]Ü©\u009e(|\u0088·\u001a~º\u0099/\u001cwe\u000bßï\b\u0099xd««Oûã\u0090\u0010\u0019BÿóÉ§ÙW `æÊì£\u000e\u0099yQô\u0093 M¿ÜÏ£\u000e\u0006?\u0087\u001d(\u009að¦4]òëTÌ\u009aoÝ\u0096\u0088\u0012±z3rï)/(\u0090È¨\u001f'³£<©\u0010h\u001c\u0085r\u0019 Óg\u0019û\u0080\u001b\u0098ú\u0097\u0092N,yñH\u009bd\b¸ñmX³à\u008c¡RÁ\u000b\f\u0091\u009aÆ-÷6Õ#\u008b\u0013D\u001c\u0007óéÌp¢µ;sÐ¿ñÛ\u000eÑÚêG\u0095@/¬\f©"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[l(1300137229, var23 ^ -1545127321)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = llI(2130182655, var23 ^ 1972511629)).length();
      int var1 = l(1300137228, var23 ^ 1966199789);
      int var25 = -1;

      label90:
      while (true) {
         int var27 = l(1300137231, var23 ^ 1938200719);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label85: {
               char[] var43 = var10001.toCharArray();
               int var10004 = var43.length;
               int var6 = 0;
               int var46 = var27;
               var39 = var43;
               int var33 = var10004;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var43;
                  var10004 = var27;
                  var10006 = var6;
               } else {
                  var46 = var27;
                  var33 = var10004;
                  if (var10004 <= var6) {
                     break label85;
                  }

                  var55 = var43;
                  var10004 = var27;
                  var10006 = var6;
               }

               while (true) {
                  var55[var10006] = (char)(var55[var10006] ^ var10004 ^ switch (var6 % l(1300137227, var23 ^ -1433965613)) {
                     case 0 -> l(1300137226, var23 ^ -869586601);
                     case 1 -> l(1300137221, var23 ^ -1341199874);
                     case 2 -> l(1300137220, var23 ^ 1022247942);
                     case 3 -> l(1300137223, var23 ^ 1270814744);
                     case 4 -> l(1300137222, var23 ^ 1221400048);
                     case 5 -> l(1300137217, var23 ^ -535593729);
                     default -> l(1300137216, var23 ^ -782616563);
                  });
                  var6++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var55 = var39;
                     var10004 = var46;
                  } else {
                     if (var33 <= var6) {
                        break;
                     }

                     var55 = var39;
                     var10004 = var46;
                     var10006 = var6;
                  }
               }
            }

            String var48 = new String(var39).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var48;
                  if ((var25 += var1) >= var4) {
                     Il = var5;
                     II = new String[l(1300137224, var23 ^ 1776068348)];
                     lII = new String[l(1300137219, var23 ^ 347185490)];
                     Ill();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var48;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label90;
                  }

                  var4 = (var2 = llI(2130182654, var23 ^ 1402547976)).length();
                  var1 = l(1300137230, var23 ^ -2081634490);
                  var25 = -1;
            }

            var27 = l(1300137225, var23 ^ -1996676637);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   public IIIIlIIII() {
      super(IlIIllIII.Ill(lII[4]), lllIIlIl.IlI, IlIIllIII.Ill(lII[0]));
      this.ll = this.IllIIll(new lIlllIl(IlIIllIII.Ill(lII[5]), 1.0, 1.0, 1.0, 4.0, 1.0).lI(IlIIllIII.lI(lII[2])));
      this.IlI = this.IllIIll(new IIlIII(IlIIllIII.Ill(lII[l(1300137267, 1985899365 ^ 11404649)]), 0.3, 0.2, 1.0, 0.05));
      this.IIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lII[l(1300137266, 1985899365 ^ 7689735)]), false));
      this.lIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lII[3]), false));
      this.llI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lII[1]), false));
   }

   public boolean lIl(class_310 var1) {
      return this.IIIIlIl() && this.lI;
   }
}
