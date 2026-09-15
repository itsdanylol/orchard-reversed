package k74.x;

import com.google.gson.JsonObject;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class IIIIIIIII extends IlIIIIIIl {
   private static final String[] I;
   private long II;
   private static final int[] llI;
   private static final int Il = 3;
   private static final String[] lI;
   private long ll;
   private int III;
   private static final Object[] IIII;
   private final lIlllIl IIl;
   private long IlI;
   private static final String[] lll;
   private static final long Ill = 1000L;
   private int lII;
   private static final int lIl = 9;

   private void I() {
      this.IlI = Long.MIN_VALUE;
      this.II = Long.MIN_VALUE;
      this.ll = Long.MIN_VALUE;
      this.III = -1;
   }

   @Override
   public void IIlIl() {
      if (!this.IIIIlIl()) {
         this.I();
      } else if (this.IlI != Long.MIN_VALUE) {
         class_310 var1 = class_310.method_1551();
         long var2 = System.currentTimeMillis();
         if (var2 - this.ll > 1000L) {
            this.I();
         } else if (var2 >= this.IlI) {
            if (var1 != null && var1.field_1724 != null && var1.field_1761 != null && var1.field_1755 == null) {
               if (!this.III(var1.field_1724)) {
                  this.I();
               } else {
                  if (this.ll(var1, var1.field_1724, var2)) {
                     this.I();
                  }
               }
            }
         }
      }
   }

   private boolean l(class_1799 var1) {
      return var1 != null && !var1.method_7960() && var1.method_31574(class_1802.field_8288);
   }

   private static String II(int var0, int var1) {
      int var9 = -1675603448;
      int var2 = (var0 ^ lll(2066529114, var9 ^ 704487023)) & lll(2066529115, var9 ^ 992907501);
      if (lI[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & lll(2066529112, var9 ^ -1860213425)) {
            case 0 -> lll(2066529113, var9 ^ -1648606352);
            case 1 -> lll(2066529118, var9 ^ -522090631);
            case 2 -> lll(2066529119, var9 ^ 1491068309);
            case 3 -> lll(2066529116, var9 ^ -2017943852);
            case 4 -> lll(2066529117, var9 ^ 664475200);
            case 5 -> lll(2066529106, var9 ^ 1837966944);
            case 6 -> lll(2066529107, var9 ^ -1833285823);
            case 7 -> lll(2066529104, var9 ^ 484770621);
            case 8 -> lll(2066529105, var9 ^ -1217381648);
            case 9 -> lll(2066529110, var9 ^ -1325349024);
            case 10 -> lll(2066529111, var9 ^ -664682349);
            case 11 -> lll(2066529108, var9 ^ -1972190683);
            case 12 -> lll(2066529109, var9 ^ 82560512);
            case 13 -> lll(2066529098, var9 ^ 1475929496);
            case 14 -> lll(2066529099, var9 ^ 1037040149);
            case 15 -> lll(2066529096, var9 ^ 1957965681);
            case 16 -> lll(2066529097, var9 ^ -1796560802);
            case 17 -> lll(2066529102, var9 ^ -1078896323);
            case 18 -> lll(2066529103, var9 ^ 526735495);
            case 19 -> lll(2066529100, var9 ^ 508878956);
            case 20 -> lll(2066529101, var9 ^ 153538523);
            case 21 -> lll(2066529090, var9 ^ 1897678678);
            case 22 -> lll(2066529091, var9 ^ -2001058807);
            case 23 -> lll(2066529088, var9 ^ -531925394);
            case 24 -> lll(2066529089, var9 ^ -2002697950);
            case 25 -> lll(2066529094, var9 ^ 808923656);
            case 26 -> lll(2066529095, var9 ^ 402798664);
            case 27 -> lll(2066529092, var9 ^ 1625180709);
            case 28 -> lll(2066529093, var9 ^ -531461500);
            case 29 -> lll(2066529146, var9 ^ -1046318935);
            case 30 -> lll(2066529147, var9 ^ 1639465201);
            case 31 -> lll(2066529144, var9 ^ -1289808877);
            case 32 -> lll(2066529145, var9 ^ -213351805);
            case 33 -> lll(2066529150, var9 ^ 308431681);
            case 34 -> lll(2066529151, var9 ^ -213407071);
            case 35 -> lll(2066529148, var9 ^ -1130307730);
            case 36 -> lll(2066529149, var9 ^ -1281311545);
            case 37 -> 4;
            case 38 -> lll(2066529138, var9 ^ 2066830478);
            case 39 -> lll(2066529139, var9 ^ 187558244);
            case 40 -> lll(2066529136, var9 ^ 38014954);
            case 41 -> lll(2066529137, var9 ^ 1945118789);
            case 42 -> lll(2066529142, var9 ^ 325735641);
            case 43 -> lll(2066529143, var9 ^ 143475436);
            case 44 -> lll(2066529140, var9 ^ -1424481673);
            case 45 -> lll(2066529141, var9 ^ 1443604461);
            case 46 -> lll(2066529130, var9 ^ 613604798);
            case 47 -> lll(2066529131, var9 ^ 1415750944);
            case 48 -> lll(2066529128, var9 ^ -1497009561);
            case 49 -> lll(2066529129, var9 ^ 1296651600);
            case 50 -> lll(2066529134, var9 ^ -164075908);
            case 51 -> lll(2066529135, var9 ^ 793162802);
            case 52 -> lll(2066529132, var9 ^ 2095958242);
            case 53 -> lll(2066529133, var9 ^ -584556206);
            case 54 -> lll(2066529122, var9 ^ 1290536829);
            case 55 -> lll(2066529123, var9 ^ -207862060);
            case 56 -> lll(2066529120, var9 ^ -1174906086);
            case 57 -> lll(2066529121, var9 ^ 937117301);
            case 58 -> lll(2066529126, var9 ^ -1172505009);
            case 59 -> lll(2066529127, var9 ^ 1691549310);
            case 60 -> lll(2066529124, var9 ^ -975848552);
            case 61 -> lll(2066529125, var9 ^ -623229884);
            case 62 -> lll(2066529050, var9 ^ -1785439025);
            case 63 -> lll(2066529051, var9 ^ 1417997371);
            case 64 -> lll(2066529048, var9 ^ -1691984542);
            case 65 -> lll(2066529049, var9 ^ 659137722);
            case 66 -> lll(2066529054, var9 ^ -2059153022);
            case 67 -> lll(2066529055, var9 ^ -522583339);
            case 68 -> lll(2066529052, var9 ^ 861226465);
            case 69 -> 2;
            case 70 -> lll(2066529053, var9 ^ 1852805867);
            case 71 -> lll(2066529042, var9 ^ -2117794486);
            case 72 -> lll(2066529043, var9 ^ -966381432);
            case 73 -> lll(2066529040, var9 ^ -472959563);
            case 74 -> lll(2066529041, var9 ^ -1065251601);
            case 75 -> lll(2066529046, var9 ^ 1913612256);
            case 76 -> lll(2066529047, var9 ^ 2004283230);
            case 77 -> lll(2066529044, var9 ^ -429173116);
            case 78 -> lll(2066529045, var9 ^ -1683178743);
            case 79 -> lll(2066529034, var9 ^ 1716633468);
            case 80 -> lll(2066529035, var9 ^ -1964287601);
            case 81 -> lll(2066529032, var9 ^ -1184504190);
            case 82 -> lll(2066529033, var9 ^ 1413685034);
            case 83 -> lll(2066529038, var9 ^ 866559110);
            case 84 -> lll(2066529039, var9 ^ -1835863213);
            case 85 -> lll(2066529036, var9 ^ 1830598245);
            case 86 -> lll(2066529037, var9 ^ -2064698733);
            case 87 -> lll(2066529026, var9 ^ -162361906);
            case 88 -> 1;
            case 89 -> lll(2066529027, var9 ^ -971846974);
            case 90 -> lll(2066529024, var9 ^ 1822654254);
            case 91 -> lll(2066529025, var9 ^ 620187709);
            case 92 -> lll(2066529030, var9 ^ -1511960101);
            case 93 -> lll(2066529031, var9 ^ -177797740);
            case 94 -> 3;
            case 95 -> lll(2066529028, var9 ^ -1115486491);
            case 96 -> lll(2066529029, var9 ^ 1834373936);
            case 97 -> lll(2066529082, var9 ^ 1663622622);
            case 98 -> lll(2066529083, var9 ^ -983461516);
            case 99 -> lll(2066529080, var9 ^ -984350133);
            case 100 -> lll(2066529081, var9 ^ -1911430182);
            case 101 -> lll(2066529086, var9 ^ -818244918);
            case 102 -> lll(2066529087, var9 ^ -1013531780);
            case 103 -> lll(2066529084, var9 ^ -663367610);
            case 104 -> lll(2066529085, var9 ^ 359861331);
            case 105 -> lll(2066529074, var9 ^ -379819638);
            case 106 -> lll(2066529075, var9 ^ 869052597);
            case 107 -> lll(2066529072, var9 ^ 1331302000);
            case 108 -> lll(2066529073, var9 ^ 1595429090);
            case 109 -> lll(2066529078, var9 ^ 2071256048);
            case 110 -> lll(2066529079, var9 ^ -1188855490);
            case 111 -> lll(2066529076, var9 ^ 428022640);
            case 112 -> lll(2066529077, var9 ^ -1192776265);
            case 113 -> lll(2066529066, var9 ^ 76389747);
            case 114 -> lll(2066529067, var9 ^ 871927166);
            case 115 -> lll(2066529064, var9 ^ 1314058631);
            case 116 -> lll(2066529065, var9 ^ -751100475);
            case 117 -> lll(2066529070, var9 ^ -1521423981);
            case 118 -> lll(2066529071, var9 ^ 1329378915);
            case 119 -> lll(2066529068, var9 ^ -367931850);
            case 120 -> lll(2066529069, var9 ^ -428094347);
            case 121 -> lll(2066529058, var9 ^ -561624751);
            case 122 -> lll(2066529059, var9 ^ -66282486);
            case 123 -> lll(2066529056, var9 ^ 1621843209);
            case 124 -> lll(2066529057, var9 ^ -1775290749);
            case 125 -> lll(2066529062, var9 ^ -898717063);
            case 126 -> lll(2066529063, var9 ^ 1281591872);
            case 127 -> lll(2066529060, var9 ^ 519391196);
            case 128 -> lll(2066529061, var9 ^ -763056114);
            case 129 -> lll(2066529242, var9 ^ 829822661);
            case 130 -> lll(2066529243, var9 ^ 990584384);
            case 131 -> lll(2066529240, var9 ^ 638745041);
            case 132 -> lll(2066529241, var9 ^ -284164428);
            case 133 -> lll(2066529246, var9 ^ -194394571);
            case 134 -> lll(2066529247, var9 ^ -1945612053);
            case 135 -> lll(2066529244, var9 ^ 1340882632);
            case 136 -> lll(2066529245, var9 ^ 745036102);
            case 137 -> lll(2066529234, var9 ^ -1843948732);
            case 138 -> lll(2066529235, var9 ^ -636622154);
            case 139 -> lll(2066529232, var9 ^ 1718862951);
            case 140 -> lll(2066529233, var9 ^ -553292375);
            case 141 -> lll(2066529238, var9 ^ -277020427);
            case 142 -> lll(2066529239, var9 ^ -1553093926);
            case 143 -> lll(2066529236, var9 ^ 2056751922);
            case 144 -> lll(2066529237, var9 ^ 1968939052);
            case 145 -> lll(2066529226, var9 ^ 105874325);
            case 146 -> lll(2066529227, var9 ^ 345192776);
            case 147 -> lll(2066529224, var9 ^ 1953602724);
            case 148 -> lll(2066529225, var9 ^ -1262085834);
            case 149 -> 5;
            case 150 -> lll(2066529230, var9 ^ 1417728825);
            case 151 -> lll(2066529231, var9 ^ 2066395438);
            case 152 -> lll(2066529228, var9 ^ -787390935);
            case 153 -> lll(2066529229, var9 ^ -619188294);
            case 154 -> lll(2066529218, var9 ^ 127099022);
            case 155 -> lll(2066529219, var9 ^ 205936936);
            case 156 -> lll(2066529216, var9 ^ 457732607);
            case 157 -> lll(2066529217, var9 ^ -1391536757);
            case 158 -> lll(2066529222, var9 ^ 516397401);
            case 159 -> lll(2066529223, var9 ^ -985529456);
            case 160 -> lll(2066529220, var9 ^ 1565032677);
            case 161 -> lll(2066529221, var9 ^ 822246430);
            case 162 -> lll(2066529274, var9 ^ 222898583);
            case 163 -> 0;
            case 164 -> lll(2066529275, var9 ^ -1612356111);
            case 165 -> lll(2066529272, var9 ^ 422533685);
            case 166 -> lll(2066529273, var9 ^ 572432645);
            case 167 -> lll(2066529278, var9 ^ 1428347504);
            case 168 -> lll(2066529279, var9 ^ 2039443992);
            case 169 -> lll(2066529276, var9 ^ -134322547);
            case 170 -> lll(2066529277, var9 ^ -348570854);
            case 171 -> lll(2066529266, var9 ^ -1790488075);
            case 172 -> lll(2066529267, var9 ^ -1157629641);
            case 173 -> lll(2066529264, var9 ^ -1229548108);
            case 174 -> lll(2066529265, var9 ^ -1775681067);
            case 175 -> lll(2066529270, var9 ^ -615071658);
            case 176 -> lll(2066529271, var9 ^ 1976271027);
            case 177 -> lll(2066529268, var9 ^ -1340522647);
            case 178 -> lll(2066529269, var9 ^ -1943195129);
            case 179 -> lll(2066529258, var9 ^ 465802433);
            case 180 -> lll(2066529259, var9 ^ 1244768177);
            case 181 -> lll(2066529256, var9 ^ -268614537);
            case 182 -> lll(2066529257, var9 ^ 1171873663);
            case 183 -> lll(2066529262, var9 ^ -213174211);
            case 184 -> lll(2066529263, var9 ^ -1866430516);
            case 185 -> lll(2066529260, var9 ^ 2146215784);
            case 186 -> lll(2066529261, var9 ^ -684305163);
            case 187 -> lll(2066529250, var9 ^ 2130064773);
            case 188 -> lll(2066529251, var9 ^ 1040209582);
            case 189 -> lll(2066529248, var9 ^ -886312932);
            case 190 -> lll(2066529249, var9 ^ 1521877341);
            case 191 -> lll(2066529254, var9 ^ -495948114);
            case 192 -> lll(2066529255, var9 ^ 1646553576);
            case 193 -> lll(2066529252, var9 ^ 808614437);
            case 194 -> lll(2066529253, var9 ^ 1935637801);
            case 195 -> lll(2066529178, var9 ^ -923584329);
            case 196 -> lll(2066529179, var9 ^ -1709058486);
            case 197 -> lll(2066529176, var9 ^ -594148283);
            case 198 -> lll(2066529177, var9 ^ 245589545);
            case 199 -> lll(2066529182, var9 ^ -442476765);
            case 200 -> lll(2066529183, var9 ^ -619541168);
            case 201 -> lll(2066529180, var9 ^ 1387882791);
            case 202 -> lll(2066529181, var9 ^ -1374743388);
            case 203 -> lll(2066529170, var9 ^ 1258963473);
            case 204 -> lll(2066529171, var9 ^ 1941825995);
            case 205 -> lll(2066529168, var9 ^ -961364611);
            case 206 -> lll(2066529169, var9 ^ 722527018);
            case 207 -> lll(2066529174, var9 ^ -625060111);
            case 208 -> lll(2066529175, var9 ^ 142171677);
            case 209 -> lll(2066529172, var9 ^ -601403101);
            case 210 -> lll(2066529173, var9 ^ 646908244);
            case 211 -> lll(2066529162, var9 ^ -680944282);
            case 212 -> lll(2066529163, var9 ^ 1610226881);
            case 213 -> lll(2066529160, var9 ^ -1695625341);
            case 214 -> lll(2066529161, var9 ^ -1966213395);
            case 215 -> lll(2066529166, var9 ^ 1007304083);
            case 216 -> lll(2066529167, var9 ^ -948565597);
            case 217 -> lll(2066529164, var9 ^ 1192755304);
            case 218 -> lll(2066529165, var9 ^ 1985380144);
            case 219 -> lll(2066529154, var9 ^ -1577171857);
            case 220 -> lll(2066529155, var9 ^ 1984264848);
            case 221 -> lll(2066529152, var9 ^ -1382105238);
            case 222 -> lll(2066529153, var9 ^ 128711952);
            case 223 -> lll(2066529158, var9 ^ -1451111989);
            case 224 -> lll(2066529159, var9 ^ 1879086919);
            case 225 -> lll(2066529156, var9 ^ -392505670);
            case 226 -> lll(2066529157, var9 ^ -1924260018);
            case 227 -> lll(2066529210, var9 ^ -791458838);
            case 228 -> lll(2066529211, var9 ^ 1690040841);
            case 229 -> lll(2066529208, var9 ^ 957861673);
            case 230 -> lll(2066529209, var9 ^ 1969197904);
            case 231 -> lll(2066529214, var9 ^ 1973824013);
            case 232 -> lll(2066529215, var9 ^ 892903025);
            case 233 -> lll(2066529212, var9 ^ 1053344941);
            case 234 -> lll(2066529213, var9 ^ -299490857);
            case 235 -> lll(2066529202, var9 ^ -2026581251);
            case 236 -> lll(2066529203, var9 ^ -661804463);
            case 237 -> lll(2066529200, var9 ^ -1983091235);
            case 238 -> lll(2066529201, var9 ^ -1247652905);
            case 239 -> lll(2066529206, var9 ^ -1335153191);
            case 240 -> lll(2066529207, var9 ^ 1669520076);
            case 241 -> lll(2066529204, var9 ^ 2101071912);
            case 242 -> lll(2066529205, var9 ^ 1493695119);
            case 243 -> lll(2066529194, var9 ^ -1494850702);
            case 244 -> lll(2066529195, var9 ^ 428906050);
            case 245 -> lll(2066529192, var9 ^ -1733819527);
            case 246 -> lll(2066529193, var9 ^ -1478445389);
            case 247 -> lll(2066529198, var9 ^ -516191719);
            case 248 -> lll(2066529199, var9 ^ 1526628607);
            case 249 -> lll(2066529196, var9 ^ 203071777);
            case 250 -> lll(2066529197, var9 ^ -1141166689);
            case 251 -> lll(2066529186, var9 ^ -175931682);
            case 252 -> lll(2066529187, var9 ^ -477686057);
            case 253 -> lll(2066529184, var9 ^ -1336682177);
            case 254 -> lll(2066529185, var9 ^ -799220223);
            default -> lll(2066529190, var9 ^ -2121513490);
         };
         int var5 = (var1 & lll(2066529191, var9 ^ 2079040613)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lll(2066529188, var9 ^ -437110576)) >>> lll(2066529189, var9 ^ 2120515684)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lll(2066528858, var9 ^ 883890796);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lll(2066528859, var9 ^ 2092704358);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   public IIIIIIIII() {
      int var1 = -709860185;
      super(
         IlIIllIII.Ill(II(lll(2066528856, var1 ^ 40338645), lll(2066528857, var1 ^ 618225342))),
         lllIIlIl.I,
         IlIIllIII.Ill(II(lll(2066528862, var1 ^ -388756860), lll(2066528863, var1 ^ -2024089426)))
      );
      this.IIl = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(II(lll(2066528860, var1 ^ -2007227014), lll(2066528861, var1 ^ -1462207405))), 55.0, 60.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(II(lll(2066528850, var1 ^ -1540060446), lll(2066528851, var1 ^ 2011238027))))
      );
      this.lII = lll(2066528848, var1 ^ -1540917535);
      this.IlI = Long.MIN_VALUE;
      this.II = Long.MIN_VALUE;
      this.ll = Long.MIN_VALUE;
      this.III = -1;
   }

   private int Il(class_746 var1, int var2) {
      String[] var10000 = IIllllIl.IIIIl();
      int var4 = 0;
      String[] var3 = var10000;

      while (var4 < lll(2066528849, -1372165780 ^ 1721173896)) {
         if (var4 != var2 && this.l(var1.method_31548().method_5438(var4))) {
            return var4;
         }

         var4++;
         if (var3 != null) {
            break;
         }
      }

      return -1;
   }

   private int lI(class_746 var1, int var2) {
      return this.III >= 0 && this.III < lll(2066528854, -914487465 ^ 826748689) && this.III != var2 && this.l(var1.method_31548().method_5438(this.III))
         ? this.III
         : this.Il(var1, var2);
   }

   private static String IIII(int var0, byte var1, char var2, byte var3, int var4, int var5, int var6) {
      int var11 = var5 ^ -367514814;
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
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 38710;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ '\ue14e' ^ switch (var9 % 27) {
            default -> 211;
            case 1 -> 245;
            case 2 -> 190;
            case 3 -> 126;
            case 4 -> 141;
            case 5 -> 41;
            case 6 -> 79;
            case 7 -> 179;
            case 8 -> 125;
            case 9 -> 71;
            case 10 -> 34;
            case 11 -> 99;
            case 12 -> 69;
            case 13 -> 196;
            case 14 -> 101;
            case 15 -> 232;
            case 16 -> 255;
            case 17 -> 19;
            case 18 -> 124;
            case 19 -> 6;
            case 20 -> 114;
            case 21 -> 22;
            case 22 -> 56;
            case 23 -> 200;
            case 24 -> 222;
            case 25 -> 187;
            case 26 -> 252;
         } ^ var1 ^ var3 ^ var4 ^ var6 ^ var8 ^ var2 ^ var0 ^ var5);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   private boolean ll(class_310 var1, class_746 var2, long var3) {
      int var5 = IIll.IIlII(var2.method_31548());
      if (this.l(var2.method_31548().method_5438(var5))) {
         return true;
      } else {
         int var6 = this.lI(var2, var5);
         if (this.III >= 0) {
            if (var3 < this.II) {
               return false;
            } else if (var6 >= 0) {
               IIll.lIIIlII(var1, var6, true);
               return true;
            } else {
               return this.Ill(var1, var2, var5);
            }
         } else if (var6 >= 0) {
            this.III = var6;
            this.II = var3 + this.llI(this.IIl);
            if (var3 < this.II) {
               return false;
            } else {
               IIll.lIIIlII(var1, var6, true);
               return true;
            }
         } else {
            return this.Ill(var1, var2, var5);
         }
      }
   }

   private boolean III(class_746 var1) {
      if (var1 == null) {
         return false;
      } else {
         int var2 = IIll.IIlII(var1.method_31548());
         return this.l(var1.method_31548().method_5438(var2)) || this.Il(var1, var2) >= 0 || this.lII(var1) >= 0;
      }
   }

   public boolean IIl() {
      return this.IIIIlIl() && this.IlI != Long.MIN_VALUE;
   }

   private boolean Ill(class_310 var1, class_746 var2, int var3) {
      int var4 = this.lII(var2);
      if (var4 < 0) {
         return true;
      } else if (!var2.field_7498.method_34255().method_7960()) {
         return false;
      } else if (!lIIIllII.lIll(var1)) {
         return false;
      } else if (!lIIIllII.lIl(var1, 3)) {
         return false;
      } else {
         lIIIllII.lII(var1);
         var1.field_1761.method_2906(var2.field_7498.field_7763, var4, var3, class_1713.field_7791, var2);
         return true;
      }
   }

   @Override
   public void IlllII(JsonObject var1) {
      super.IlllII(var1);
      this.IIIlIIl(var1, IlIIllIII.lI(II(lll(2066528855, 1318152104 ^ 1209148542), lll(2066528852, 1318152104 ^ -1727867708))), new lIlllIl[]{this.IIl});
   }

   private int lII(class_746 var1) {
      int var3 = var1.field_7498.field_7761.size();
      String[] var10000 = IIllllIl.IIIIl();
      int var4 = lll(2066528853, 131129296 ^ 1072756089);
      String[] var2 = var10000;

      while (var4 < Math.min(lll(2066528842, 131129296 ^ -1029193985), var3)) {
         class_1799 var5 = ((class_1735)var1.field_7498.field_7761.get(var4)).method_7677();
         if (this.l(var5)) {
            return var4;
         }

         var4++;
         if (var2 != null) {
            break;
         }
      }

      return -1;
   }

   @Override
   public void lllIlI(class_1297 var1, byte var2) {
      class_310 var3 = class_310.method_1551();
      if (this.IIIIlIl()
         && var3 != null
         && var3.field_1724 != null
         && var3.field_1761 != null
         && var3.field_1755 == null
         && var2 == lll(2066528843, 1824839327 ^ 1460604105)
         && var1 != null
         && var1.method_5628() == var3.field_1724.method_5628()) {
         if (this.lII != var3.field_1724.field_6012) {
            this.lII = var3.field_1724.field_6012;
            if (this.lIl(var3.field_1724)) {
               this.I();
            } else if (!this.III(var3.field_1724)) {
               this.I();
            } else {
               long var4 = System.currentTimeMillis();
               this.ll = var4;
               this.IlI = var4;
               this.II = Long.MIN_VALUE;
               this.III = -1;
            }
         }
      }
   }

   private boolean lIl(class_746 var1) {
      if (var1 == null) {
         return false;
      } else {
         int var2 = IIll.IIlII(var1.method_31548());
         return var2 >= 0 && var2 < lll(2066528840, 1872640637 ^ 1684781050) && this.l(var1.method_31548().method_5438(var2));
      }
   }

   private long llI(lIlllIl var1) {
      double var2 = Math.max(0.0, Math.min(var1.IIlI(), var1.IlI()));
      double var4 = Math.max(var2, Math.max(var1.IIlI(), var1.IlI()));
      return var2 == var4 ? Math.round(var2) : Math.round(ThreadLocalRandom.current().nextDouble(var2, var4));
   }

   private static int lll(int var0, int var1) {
      int var2 = llI[var0 ^ 2066529114] ^ var1 ^ var0;
      var2 ^= 31958;
      var2 += 21238;
      var2 += 18101;
      var2 ^= 21261;
      var2 += 20309;
      var2 += 55252;
      return var2 ^ 31760;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 710830501;
      String[] var9 = new String[2];
      int var10001 = "b\ud8d7듊\udf37꒷\udf88쑪핱蒺\ude82ᒧ\udfa7\ue4c7\ud807꒸큘葥\udff1뒸\udbe2뒢폷瓂\udfc7Ⓘ\uded8鑦\uded1撳휂蒬\uddd7\ue4c9휇ҿ퇸\uf460\ud811ҹ횲咨\udb37퓁튇꒳핸呪\ud9c1䒳\udbb2\ue4a6힇퓂\udd57꒺흈ᑥ\uddc1꒱\udad2撠폷퓅\ud9d7쒿\udac8⑭퓱䒴\udfd2䒧틷㓃헇撴\udcf8ꑩ퐁\uf4bd킢钬\udb67ӆ튧풼\ud8a8葬힡䒵\uda62\ue4a8풷\ue4c9횷⒲\uda78呫\uda11䒾\u001d፷ᐈḧꑱშᒥᰑ\uf477ᓂꑭᲇ\ue40fἷ쑽ᅨ쒯ᅑ㑶ᝢ⑭ጧ됇ᠷ葳ᶸ䒤ṡ㑸ᕢ"
         .length();
      int var10 = 0;
      short var12 = 30359;
      int var11 = 0;
      int var8 = var10001;
      String var7 = "b\ud8d7듊\udf37꒷\udf88쑪핱蒺\ude82ᒧ\udfa7\ue4c7\ud807꒸큘葥\udff1뒸\udbe2뒢폷瓂\udfc7Ⓘ\uded8鑦\uded1撳휂蒬\uddd7\ue4c9휇ҿ퇸\uf460\ud811ҹ횲咨\udb37퓁튇꒳핸呪\ud9c1䒳\udbb2\ue4a6힇퓂\udd57꒺흈ᑥ\uddc1꒱\udad2撠폷퓅\ud9d7쒿\udac8⑭퓱䒴\udfd2䒧틷㓃헇撴\udcf8ꑩ퐁\uf4bd킢钬\udb67ӆ튧풼\ud8a8葬힡䒵\uda62\ue4a8풷\ue4c9횷⒲\uda78呫\uda11䒾\u001d፷ᐈḧꑱშᒥᰑ\uf477ᓂꑭᲇ\ue40fἷ쑽ᅨ쒯ᅑ㑶ᝢ⑭ጧ됇ᠷ葳ᶸ䒤ṡ㑸ᕢ";

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 179;
               case 1 -> 21;
               case 2 -> 99;
               case 3 -> 102;
               case 4 -> 124;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      lll = var9;
      IIII = new Object[var9.length];
      int var22 = 0;
      int var25 = 0;
      llI = new int[287];
      byte[] var10002 = ":)\u0003ë(úª\\\u0082ËDý\u008ehcEó5§gK\u000bÄ2\u0094l¾&4O4ý~Y\u0006\u008f\u0081ng\\\u000f1#'¤¤\u001a\u0099¢Ôç)Ëµá.\u0099¦â\u0004\u0017?ç\u0084D,ÇK.\u001bØ¿g`\u000f\u0092\u0087>\u0088w¬ey2\f±xê\r\u0080À\u000b\u001aòï\tbÈg¤\u009bndìó\u009fV\t\u009bu`\u008a#ã\u0012\u0001\u000bÖ\u0018Zs\njÂó\u0086ª©ÒvP¶rl`Ø Ë5©à\u009c¢D\u0001¶k\u0087à\u0093\u008aÚ¯tÿ¶ t\u009dthåt¸\u0018ùÉj\u0011\u0090._`$\b\"\u0000¾uo\u001bYb¯¸Ì\u0000\u008dEß\u0086v7Fý\u0091G¶\u0085Hµ\u0011RP^\u009du^åìF¸<\u0092\u0096Õo9è9ÎüAR_8'ªàHfêª,{w$\u000fgÓ©ÈÞ\u0096w\u0006ÜöÖ\u0001\u0099dÉ\u000ed´\u0086@|zGPÍã\u0088ò\u007fõ4\u009d\u0084\u0086\u0096\u0097ðLó\u000e#\u0012 \u0081eo}»²\u0081\u0092\u0011'¾Õ²\u0010\u009eð\u001b\u0015ãÓU¬YaÛGØd¢Ï\u000bõ¿v\u0000\u0088x\u009bmu\u0085\u009f-\u0099?xXª±Ä\u0001G\u0097?+ r\u00843\u0081FÓF~È\u0094\u008b\u0097;\u0010\u0013å\u0086\u00adÛÕÆèF\u007fw_37#p¯¶5sYæ³$h®W'6~\u0082q³püýÎÖµ±7Ö\u0080# \u009dÅÃAÜî²ÒÐB\u009bOË¡ð[\u0006§-\u0090ú\u0088I) \u0018\u0092\u000f\\\u008e.\u0017LÌpih ûåª÷¡\u001a\nW;y«3\u008cx\u0017Y½\u0010 ,\u00ad\u0005]\u0086ÓLÀï=Û¶\u0084É\u0090\\è\u0097«ùÅî\u0087õ¯í\u0095ÍRi|ïØ¼Hs\u007f}\u0005\u0085û\u0014OÙº\u008a\u0005_·ª{\r!gÂÁP\u0092Ç\"¢6;(ß?T5ÆY\tüÛÜçç½ç1\u009fÜqê\\8\u001eS?¼y6\u0081Ã±\fÉÙÊ\u001fu§ä©ÌÑMïü© -°¹\u008a\u009biC«Ðf\u008f\u0080à\u0015\u009b¡Ä\u0007G\u0019\u0091g¥¼|§\u00129êGTóÉhþ\u0091AÂÅ~©ÈÃÏ#\u0014G@\u0004\u001f\u0092y\u009f\b\u009cQ\u000f¾Úô\u008b\r\u0013»\u0013Ö\u0096!ÉN\u009c w\"Ö\\î\u001e\u009d\tu\u008c1EA\nûz®1Ê\u0080'FöûFj[R\u0088ä*Feøí\u0019\u001a\u0086\u0093pÞ©+Ø=¥bµØ\u0085ýa\u0090È\u0082à§f\u001f \u0015£Í\u001f¢\u009fù\u0010\r\b\u0017´\u008aYå\u0087>ü)dÁV\r\u007f?à\u009f\u0018ó\u0083\u0014¥¢l8\u0087\u008dÄâtcm\"\u0015\\-ÔvdØÿÐúIb añ¤O\u0084qðI3#æZ¯`\u008b]¥Û'\u0018\u0085\u0089õöºÏB$¯\u001dwF\u0006ötw\u008eÈÆ\u00ad}AmHP½Û4@XÞ`\u0006`iÈ\u0092Õf\u009d±8ÄÂrÉjv*\u001b\u00ad~ùÏópe5[+5Ä½½ÝL.>É\u0089:ï}\u0099\u0019ÖÁ/Þ\u001d\u001fÔ¢)\u001eTÌ!0e\u0082^Y²*d®e\u0091Z\u0019¾J\u009d\u001d\u0014\u007fÜDºUëÏcÔ·ÑûN÷õ\u009e\u009a?µÃ\u0007k6woÚ\u009a*Ãï\u008af\u008b³èfr\u000b[&ì¾\u009d-\u001cä ýò\u0001\u0000\u0094àòÛËY\u008b4\u009a\u0018MÔ¦vs\u0019£¿\r@pVû½nïñCJÓØºµ2Cº\nD¶â\u008b|#¡´4\u0097ÞòïªïI*¢¢\u001fÎ\u00811¨/\u000f×æW^\u0000ðS6Ç£\u0087ù¦Ã\u0088þù\u0092Xeäh?\u0085(ö&\u0002\u009em°¢<'{:Üoh\u0002×X#/\u001f~\u009d÷e²\u0090 \u00adÝ\u001dÓËÒ\u0018\u008fSò\u009c\u0001\u0092þp Á-¦êh~ccëGU\u001f%wÍY\u0080\u0089w\u008dRXgè¼·Ô[lJ\u0083\u0012É´?©\u0083\u0084\u0001ü_\u0007Jæo\\\u009c5ã¸ù¼W$R\u008eó\u0012ÛêÀ/\u007f\\\"¿]\u0010RoËA³Ï7\u0095µj~[\u008a1Þ\u0012¯¼P\u009fo"
         .getBytes("ISO-8859-1");

      int var56;
      do {
         llI[var22] = ((var10002[var25] & 255) << 24 | (var10002[var25 + 1] & 255) << 16 | (var10002[var25 + 2] & 255) << 8 | var10002[var25 + 3] & 255)
            ^ 187095316;
         var22 += 1;
         var56 = var25 + 4;
         var25 += 4;
      } while (var56 < var10002.length);

      String[] var5 = new String[5];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIII(-46099168, (byte)24, '\uda81', (byte)-19, -360624593, -367514814, -1619328039)).length();
      int var1 = 4;
      int var19 = -1;

      label102:
      while (true) {
         var22 = lll(2066528841, var17 ^ -1562313206);
         String var28 = var2.substring(++var19, var19 + var1);
         byte var40 = -1;

         while (true) {
            label97: {
               char[] var58 = var28.toCharArray();
               int var70 = var58.length;
               int var6 = 0;
               var56 = var22;
               var45 = var58;
               var25 = var70;
               char[] var82;
               int var89;
               if (var70 <= 1) {
                  var82 = var58;
                  var70 = var22;
                  var89 = var6;
               } else {
                  var56 = var22;
                  var25 = var70;
                  if (var70 <= var6) {
                     break label97;
                  }

                  var82 = var58;
                  var70 = var22;
                  var89 = var6;
               }

               while (true) {
                  var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % lll(2066528844, var17 ^ -2114414880)) {
                     case 0 -> lll(2066528845, var17 ^ -1217269620);
                     case 1 -> lll(2066528834, var17 ^ -1965734264);
                     case 2 -> lll(2066528835, var17 ^ 452397819);
                     case 3 -> lll(2066528832, var17 ^ -899589368);
                     case 4 -> lll(2066528833, var17 ^ 1788710861);
                     case 5 -> lll(2066528838, var17 ^ -808173287);
                     default -> lll(2066528839, var17 ^ -1804334875);
                  });
                  var6++;
                  if (var56 == 0) {
                     var89 = var56;
                     var82 = var45;
                     var70 = var56;
                  } else {
                     if (var25 <= var6) {
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
                  if ((var19 += var1) >= var4) {
                     I = var5;
                     lI = new String[5];
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var63;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label102;
                  }

                  var4 = (var2 = IIII(-792043619, (byte)52, (char)'쉳', 10, -1523337850, -367514813, 1997723951)).length();
                  var1 = lll(2066528846, var17 ^ -113889895);
                  var19 = -1;
            }

            var22 = lll(2066528847, var17 ^ 492020779);
            var28 = var2.substring(++var19, var19 + var1);
            var40 = 0;
         }
      }
   }

   @Override
   public void llIl() {
      this.lII = lll(2066528836, -277122985 ^ 1558158977);
      this.I();
   }
}
