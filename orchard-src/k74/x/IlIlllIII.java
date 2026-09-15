package k74.x;

import java.util.HashSet;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1661;
import net.minecraft.class_1684;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class IlIlllIII extends IlIIIIIIl {
   private static String[] I;
   private static final String[] II;
   private static final String[] Il;
   private static final int[] IIl;
   private final lllIIlII lI;
   private final Set<Integer> ll;
   private static final String[] IlI;
   private static final Object[] Ill;
   private final IllIII<IIlllIII> III;

   private boolean I(class_310 var1, int var2) {
      return IIll.lllIII(var1, this, var2, IlIlllIII::ll);
   }

   private class_1684 l(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1.field_1687 != null && var1.field_1724 != null) {
         for (class_1297 var4 : var1.field_1687.method_18112()) {
            if (var4 instanceof class_1684 var5 && !var5.method_31481()) {
               if (this.ll.contains(var5.method_5628())) {
                  continue;
               }

               class_1297 var6 = var5.method_24921();
               if (var6 != null && !var6.method_5667().equals(var1.field_1724.method_5667())) {
                  return var5;
               }
            }

            if (var2 != null) {
               break;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public IlIlllIII() {
      super(IlIIllIII.Ill(I[1]), lllIIlIl.IlI, IlIIllIII.Ill(I[0]));
      this.III = this.IllIIll(new IllIII<>(IlIIllIII.Ill(I[3]), IIlllIII.class, IIlllIII.I));
      this.lI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(I[2]), false));
      this.ll = new HashSet<>();
   }

   private static String II(int var0, int var1) {
      int var9 = -1008289630;
      int var2 = (var0 ^ IIl(-658116999, var9 ^ -646442811)) & IIl(-658117000, var9 ^ -2096445689);
      if (Il[var2] == null) {
         char[] var3 = II[var2].toCharArray();

         int var4 = switch (var3[0] & IIl(-658116997, var9 ^ -1369942280)) {
            case 0 -> IIl(-658116998, var9 ^ 1938251651);
            case 1 -> IIl(-658116995, var9 ^ 949626051);
            case 2 -> IIl(-658116996, var9 ^ -2075399440);
            case 3 -> IIl(-658116993, var9 ^ 369208321);
            case 4 -> IIl(-658116994, var9 ^ 2102103939);
            case 5 -> IIl(-658117007, var9 ^ -1266645183);
            case 6 -> IIl(-658117008, var9 ^ -404206399);
            case 7 -> IIl(-658117005, var9 ^ -25498057);
            case 8 -> IIl(-658117006, var9 ^ 2086536883);
            case 9 -> IIl(-658117003, var9 ^ 2112262652);
            case 10 -> IIl(-658117004, var9 ^ -207917965);
            case 11 -> IIl(-658117001, var9 ^ 50675509);
            case 12 -> IIl(-658117002, var9 ^ 1004391568);
            case 13 -> IIl(-658117015, var9 ^ -1722463101);
            case 14 -> IIl(-658117016, var9 ^ -680456233);
            case 15 -> IIl(-658117013, var9 ^ -1402530966);
            case 16 -> IIl(-658117014, var9 ^ 1744970088);
            case 17 -> IIl(-658117011, var9 ^ -1278699942);
            case 18 -> IIl(-658117012, var9 ^ -810891694);
            case 19 -> IIl(-658117009, var9 ^ -685847219);
            case 20 -> IIl(-658117010, var9 ^ 151901285);
            case 21 -> IIl(-658117023, var9 ^ 660235200);
            case 22 -> IIl(-658117024, var9 ^ -2080032627);
            case 23 -> IIl(-658117021, var9 ^ -2018941114);
            case 24 -> IIl(-658117022, var9 ^ 657096788);
            case 25 -> IIl(-658117019, var9 ^ -1632533663);
            case 26 -> IIl(-658117020, var9 ^ 1991207531);
            case 27 -> IIl(-658117017, var9 ^ -623397676);
            case 28 -> IIl(-658117018, var9 ^ -1975811503);
            case 29 -> IIl(-658117031, var9 ^ 595287054);
            case 30 -> IIl(-658117032, var9 ^ -1872869756);
            case 31 -> IIl(-658117029, var9 ^ 707111751);
            case 32 -> IIl(-658117030, var9 ^ 1749324523);
            case 33 -> IIl(-658117027, var9 ^ 305266400);
            case 34 -> IIl(-658117028, var9 ^ 1470926854);
            case 35 -> IIl(-658117025, var9 ^ -1865431215);
            case 36 -> IIl(-658117026, var9 ^ 1689789919);
            case 37 -> IIl(-658117039, var9 ^ 552374731);
            case 38 -> IIl(-658117040, var9 ^ -1828182924);
            case 39 -> IIl(-658117037, var9 ^ -1727273726);
            case 40 -> IIl(-658117038, var9 ^ 871096620);
            case 41 -> IIl(-658117035, var9 ^ -18533422);
            case 42 -> IIl(-658117036, var9 ^ 1124586157);
            case 43 -> 0;
            case 44 -> IIl(-658117033, var9 ^ -1050516895);
            case 45 -> IIl(-658117034, var9 ^ 247257660);
            case 46 -> IIl(-658117047, var9 ^ 241906675);
            case 47 -> IIl(-658117048, var9 ^ -1175757494);
            case 48 -> IIl(-658117045, var9 ^ 117999838);
            case 49 -> IIl(-658117046, var9 ^ 1614593170);
            case 50 -> IIl(-658117043, var9 ^ 1969926113);
            case 51 -> IIl(-658117044, var9 ^ -1796313441);
            case 52 -> IIl(-658117041, var9 ^ 1810795537);
            case 53 -> IIl(-658117042, var9 ^ -1921753139);
            case 54 -> IIl(-658117055, var9 ^ 2022989069);
            case 55 -> IIl(-658117056, var9 ^ 1058760660);
            case 56 -> IIl(-658117053, var9 ^ 522129248);
            case 57 -> IIl(-658117054, var9 ^ -1123421119);
            case 58 -> IIl(-658117051, var9 ^ -1824865022);
            case 59 -> IIl(-658117052, var9 ^ -265851099);
            case 60 -> IIl(-658117049, var9 ^ -493453446);
            case 61 -> IIl(-658117050, var9 ^ -820839482);
            case 62 -> IIl(-658117063, var9 ^ -1912973974);
            case 63 -> IIl(-658117064, var9 ^ -1710606088);
            case 64 -> IIl(-658117061, var9 ^ 266602298);
            case 65 -> IIl(-658117062, var9 ^ 57199609);
            case 66 -> IIl(-658117059, var9 ^ -610396125);
            case 67 -> IIl(-658117060, var9 ^ -2069476060);
            case 68 -> IIl(-658117057, var9 ^ 599741951);
            case 69 -> IIl(-658117058, var9 ^ -524445602);
            case 70 -> IIl(-658117071, var9 ^ 370743406);
            case 71 -> IIl(-658117072, var9 ^ 781730520);
            case 72 -> IIl(-658117069, var9 ^ -566590229);
            case 73 -> IIl(-658117070, var9 ^ 1080434295);
            case 74 -> IIl(-658117067, var9 ^ -1744952663);
            case 75 -> IIl(-658117068, var9 ^ 1621620783);
            case 76 -> 4;
            case 77 -> IIl(-658117065, var9 ^ 1121669017);
            case 78 -> IIl(-658117066, var9 ^ 15959839);
            case 79 -> IIl(-658117079, var9 ^ 530017230);
            case 80 -> IIl(-658117080, var9 ^ 1979097360);
            case 81 -> IIl(-658117077, var9 ^ -345734785);
            case 82 -> IIl(-658117078, var9 ^ 137285721);
            case 83 -> IIl(-658117075, var9 ^ 1230650017);
            case 84 -> IIl(-658117076, var9 ^ -688287828);
            case 85 -> IIl(-658117073, var9 ^ 1849839361);
            case 86 -> IIl(-658117074, var9 ^ 924947901);
            case 87 -> 5;
            case 88 -> IIl(-658117087, var9 ^ -1685805051);
            case 89 -> IIl(-658117088, var9 ^ 1115821238);
            case 90 -> IIl(-658117085, var9 ^ -824432371);
            case 91 -> IIl(-658117086, var9 ^ 1185410053);
            case 92 -> IIl(-658117083, var9 ^ 1898252384);
            case 93 -> IIl(-658117084, var9 ^ -114196262);
            case 94 -> IIl(-658117081, var9 ^ -691174880);
            case 95 -> IIl(-658117082, var9 ^ -1244261740);
            case 96 -> IIl(-658117095, var9 ^ 1981270196);
            case 97 -> IIl(-658117096, var9 ^ 2075291018);
            case 98 -> IIl(-658117093, var9 ^ -81859123);
            case 99 -> IIl(-658117094, var9 ^ -1881807283);
            case 100 -> IIl(-658117091, var9 ^ -1137981893);
            case 101 -> IIl(-658117092, var9 ^ 957144607);
            case 102 -> IIl(-658117089, var9 ^ -946384815);
            case 103 -> IIl(-658117090, var9 ^ 542272367);
            case 104 -> IIl(-658117103, var9 ^ -2101651988);
            case 105 -> IIl(-658117104, var9 ^ -1054721732);
            case 106 -> IIl(-658117101, var9 ^ -775208156);
            case 107 -> IIl(-658117102, var9 ^ 648732066);
            case 108 -> IIl(-658117099, var9 ^ -1533886921);
            case 109 -> IIl(-658117100, var9 ^ -2012938785);
            case 110 -> IIl(-658117097, var9 ^ -1856515477);
            case 111 -> IIl(-658117098, var9 ^ -1023499207);
            case 112 -> IIl(-658117111, var9 ^ 2107618802);
            case 113 -> IIl(-658117112, var9 ^ -490564351);
            case 114 -> IIl(-658117109, var9 ^ 1694760817);
            case 115 -> IIl(-658117110, var9 ^ 1936902827);
            case 116 -> IIl(-658117107, var9 ^ -382492872);
            case 117 -> 3;
            case 118 -> IIl(-658117108, var9 ^ 250946183);
            case 119 -> IIl(-658117105, var9 ^ -197766658);
            case 120 -> IIl(-658117106, var9 ^ -2022853250);
            case 121 -> IIl(-658117119, var9 ^ -1456451766);
            case 122 -> IIl(-658117120, var9 ^ 1029891908);
            case 123 -> IIl(-658117117, var9 ^ -500072209);
            case 124 -> IIl(-658117118, var9 ^ 1765263963);
            case 125 -> IIl(-658117115, var9 ^ 549062526);
            case 126 -> IIl(-658117116, var9 ^ 1897943107);
            case 127 -> IIl(-658117113, var9 ^ 1991198490);
            case 128 -> IIl(-658117114, var9 ^ -1852789825);
            case 129 -> IIl(-658116871, var9 ^ -444109790);
            case 130 -> IIl(-658116872, var9 ^ -1074211056);
            case 131 -> IIl(-658116869, var9 ^ -685495612);
            case 132 -> IIl(-658116870, var9 ^ -549252582);
            case 133 -> IIl(-658116867, var9 ^ -1009164363);
            case 134 -> IIl(-658116868, var9 ^ -1036653127);
            case 135 -> IIl(-658116865, var9 ^ -2003490055);
            case 136 -> IIl(-658116866, var9 ^ 1671055265);
            case 137 -> IIl(-658116879, var9 ^ 557175561);
            case 138 -> IIl(-658116880, var9 ^ -60894693);
            case 139 -> IIl(-658116877, var9 ^ -2046351612);
            case 140 -> IIl(-658116878, var9 ^ -717102055);
            case 141 -> IIl(-658116875, var9 ^ 1926373748);
            case 142 -> IIl(-658116876, var9 ^ 1088851270);
            case 143 -> IIl(-658116873, var9 ^ 165675861);
            case 144 -> IIl(-658116874, var9 ^ 1806099591);
            case 145 -> IIl(-658116887, var9 ^ 1743543772);
            case 146 -> IIl(-658116888, var9 ^ -1108199852);
            case 147 -> IIl(-658116885, var9 ^ -318443870);
            case 148 -> IIl(-658116886, var9 ^ -638396547);
            case 149 -> IIl(-658116883, var9 ^ -1250785128);
            case 150 -> IIl(-658116884, var9 ^ -798146247);
            case 151 -> IIl(-658116881, var9 ^ 1635194191);
            case 152 -> IIl(-658116882, var9 ^ -1232875042);
            case 153 -> IIl(-658116895, var9 ^ -1626638719);
            case 154 -> IIl(-658116896, var9 ^ 921068813);
            case 155 -> IIl(-658116893, var9 ^ -1297124536);
            case 156 -> IIl(-658116894, var9 ^ 357230846);
            case 157 -> IIl(-658116891, var9 ^ 811139032);
            case 158 -> IIl(-658116892, var9 ^ 688613000);
            case 159 -> IIl(-658116889, var9 ^ 1853499454);
            case 160 -> IIl(-658116890, var9 ^ -119888873);
            case 161 -> IIl(-658116903, var9 ^ -1064319096);
            case 162 -> IIl(-658116904, var9 ^ 1771904364);
            case 163 -> IIl(-658116901, var9 ^ 1936937893);
            case 164 -> IIl(-658116902, var9 ^ -813357079);
            case 165 -> IIl(-658116899, var9 ^ -1398934309);
            case 166 -> 2;
            case 167 -> IIl(-658116900, var9 ^ -1938464870);
            case 168 -> IIl(-658116897, var9 ^ 2047618535);
            case 169 -> IIl(-658116898, var9 ^ -1568136051);
            case 170 -> IIl(-658116911, var9 ^ -1426092242);
            case 171 -> IIl(-658116912, var9 ^ -812648658);
            case 172 -> IIl(-658116909, var9 ^ 1778337410);
            case 173 -> IIl(-658116910, var9 ^ -215621098);
            case 174 -> IIl(-658116907, var9 ^ 1818912126);
            case 175 -> IIl(-658116908, var9 ^ 220923578);
            case 176 -> IIl(-658116905, var9 ^ -1506169875);
            case 177 -> IIl(-658116906, var9 ^ -728616232);
            case 178 -> IIl(-658116919, var9 ^ 843555378);
            case 179 -> IIl(-658116920, var9 ^ 1465550333);
            case 180 -> IIl(-658116917, var9 ^ 421115864);
            case 181 -> IIl(-658116918, var9 ^ -1066386498);
            case 182 -> 1;
            case 183 -> IIl(-658116915, var9 ^ 1926742966);
            case 184 -> IIl(-658116916, var9 ^ 175441035);
            case 185 -> IIl(-658116913, var9 ^ 2025545879);
            case 186 -> IIl(-658116914, var9 ^ -817977554);
            case 187 -> IIl(-658116927, var9 ^ -559391154);
            case 188 -> IIl(-658116928, var9 ^ 1814548871);
            case 189 -> IIl(-658116925, var9 ^ 748147229);
            case 190 -> IIl(-658116926, var9 ^ 744707109);
            case 191 -> IIl(-658116923, var9 ^ -2005824873);
            case 192 -> IIl(-658116924, var9 ^ -1571759593);
            case 193 -> IIl(-658116921, var9 ^ 262942801);
            case 194 -> IIl(-658116922, var9 ^ 727892291);
            case 195 -> IIl(-658116935, var9 ^ -443775980);
            case 196 -> IIl(-658116936, var9 ^ 1641391529);
            case 197 -> IIl(-658116933, var9 ^ -1881896976);
            case 198 -> IIl(-658116934, var9 ^ 1597279278);
            case 199 -> IIl(-658116931, var9 ^ 1117344957);
            case 200 -> IIl(-658116932, var9 ^ -1733797955);
            case 201 -> IIl(-658116929, var9 ^ -1456354676);
            case 202 -> IIl(-658116930, var9 ^ 1515298566);
            case 203 -> IIl(-658116943, var9 ^ 542548765);
            case 204 -> IIl(-658116944, var9 ^ 1644211063);
            case 205 -> IIl(-658116941, var9 ^ 731760279);
            case 206 -> IIl(-658116942, var9 ^ 127248963);
            case 207 -> IIl(-658116939, var9 ^ 466710357);
            case 208 -> IIl(-658116940, var9 ^ 79348194);
            case 209 -> IIl(-658116937, var9 ^ -370959018);
            case 210 -> IIl(-658116938, var9 ^ 1360856175);
            case 211 -> IIl(-658116951, var9 ^ 1326878969);
            case 212 -> IIl(-658116952, var9 ^ 1672033348);
            case 213 -> IIl(-658116949, var9 ^ 1012491695);
            case 214 -> IIl(-658116950, var9 ^ -1910262168);
            case 215 -> IIl(-658116947, var9 ^ 1424001128);
            case 216 -> IIl(-658116948, var9 ^ 1760080686);
            case 217 -> IIl(-658116945, var9 ^ 1973222133);
            case 218 -> IIl(-658116946, var9 ^ -205245933);
            case 219 -> IIl(-658116959, var9 ^ -1707685969);
            case 220 -> IIl(-658116960, var9 ^ -208504639);
            case 221 -> IIl(-658116957, var9 ^ 1939967262);
            case 222 -> IIl(-658116958, var9 ^ -2031505205);
            case 223 -> IIl(-658116955, var9 ^ 647558345);
            case 224 -> IIl(-658116956, var9 ^ 515948528);
            case 225 -> IIl(-658116953, var9 ^ 1018648233);
            case 226 -> IIl(-658116954, var9 ^ 169564007);
            case 227 -> IIl(-658116967, var9 ^ 561667553);
            case 228 -> IIl(-658116968, var9 ^ 711861086);
            case 229 -> IIl(-658116965, var9 ^ 2076420);
            case 230 -> IIl(-658116966, var9 ^ -959857596);
            case 231 -> IIl(-658116963, var9 ^ 438596526);
            case 232 -> IIl(-658116964, var9 ^ -1326936850);
            case 233 -> IIl(-658116961, var9 ^ 578530170);
            case 234 -> IIl(-658116962, var9 ^ 618593263);
            case 235 -> IIl(-658116975, var9 ^ -1303445621);
            case 236 -> IIl(-658116976, var9 ^ -465530676);
            case 237 -> IIl(-658116973, var9 ^ -430223711);
            case 238 -> IIl(-658116974, var9 ^ -541463818);
            case 239 -> IIl(-658116971, var9 ^ -1952345559);
            case 240 -> IIl(-658116972, var9 ^ 954213741);
            case 241 -> IIl(-658116969, var9 ^ -1176681836);
            case 242 -> IIl(-658116970, var9 ^ -1402906720);
            case 243 -> IIl(-658116983, var9 ^ 1364423785);
            case 244 -> IIl(-658116984, var9 ^ -1931845316);
            case 245 -> IIl(-658116981, var9 ^ -403738841);
            case 246 -> IIl(-658116982, var9 ^ 1868878203);
            case 247 -> IIl(-658116979, var9 ^ -2014519307);
            case 248 -> IIl(-658116980, var9 ^ -1036339927);
            case 249 -> IIl(-658116977, var9 ^ 1357912282);
            case 250 -> IIl(-658116978, var9 ^ -325021643);
            case 251 -> IIl(-658116991, var9 ^ 1547165374);
            case 252 -> IIl(-658116992, var9 ^ 1511650213);
            case 253 -> IIl(-658116989, var9 ^ -664413072);
            case 254 -> IIl(-658116990, var9 ^ 484481722);
            default -> IIl(-658116987, var9 ^ 688849250);
         };
         int var5 = (var1 & IIl(-658116988, var9 ^ -671989971)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIl(-658116985, var9 ^ 695593083)) >>> IIl(-658116986, var9 ^ 2072361750)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIl(-658116743, var9 ^ -100010883);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIl(-658116744, var9 ^ -2043923302);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }

   @Override
   public void llIl() {
      this.ll.clear();
   }

   private static String Ill(int var0, int var1, char var2, int var3, char var4, char var5) {
      int var10 = var0 ^ -955113660;
      char[] var9 = IlI[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])Ill[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         Ill[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 43259;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ 16995 ^ switch (var8 % 6) {
            default -> 167;
            case 1 -> 194;
            case 2 -> 0;
            case 3 -> 159;
            case 4 -> 122;
            case 5 -> 94;
         } ^ var7 ^ var3 ^ var4 ^ var0 ^ var2 ^ var5 ^ var1);
      }

      return new String(var9).intern();
   }

   private static int IIl(int var0, int var1) {
      int var2 = IIl[var0 ^ -658116999] ^ var1 ^ var0;
      var2 += 34145;
      var2 ^= 64070;
      var2 ^= 61000;
      var2 -= 19989;
      var2 -= 678;
      var2 -= 51282;
      var2 += 12220;
      return var2 - 49832;
   }

   private static String Il(char[] var0, long var1, int var3) {
      int var4 = IIl(-658116741, -413124646 ^ 1598557537) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIl(-658116742, -413124646 ^ 1210229203);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 256947218;
      int var17 = 0;
      String[] var15 = new String[2];
      short var18 = 10139;
      int var16 = 0;
      int var14 = "\u0089ᢧ䥷ᥔ꯳塄㹦ꑧ暠䱑ྜ.龍쳨촡茀擧\u2ffd뽦粫ᖛ蟩↦趤થ嘯ᷱᩮ魤驱\udd6c뚾㈵℈䄍骤\ued91둖黕혫\u0ffe荃\u2453㘐䅖渭狤瞟\ue7f4潵츗䘀\uddc9\udad3艮Ⳕ\uf384̫ᣏረ沱㧭垠㑘빽\uecd4죇晱ᒝ㰯뼩\uf737稅젆\udbe8蓼\uf18b괥뮅㔼\uece6墁⤓㮩溞꺢区鉂\ud8bb䶊흒䞈絊椮㭦踧뜃㎚ᗿ\ue8d4誑뵿憻⬛\uf897㾫㟔\uf0b3펋齚齷爼꼡Ꞥ呱\uf54a駓ี\uf1e8諒밝渖⚢\ud9a7蚮탏䄐죽吒趗巵ﮝ連禚\uef0b磁㤔\ueffe%鷮븁\ueac0䛖❞蚂ͣ\uf2f4難ꯛ눣ﾘ⥮㍡\u0b4a鮢ᕞആU\uf810\ue423泇㪔\uf180땯턦皃孙ᝰ쎕Ⲯ㝖쒾\u0fe2綠䇎Ə"
         .length();
      String var13 = "\u0089ᢧ䥷ᥔ꯳塄㹦ꑧ暠䱑ྜ.龍쳨촡茀擧\u2ffd뽦粫ᖛ蟩↦趤થ嘯ᷱᩮ魤驱\udd6c뚾㈵℈䄍骤\ued91둖黕혫\u0ffe荃\u2453㘐䅖渭狤瞟\ue7f4潵츗䘀\uddc9\udad3艮Ⳕ\uf384̫ᣏረ沱㧭垠㑘빽\uecd4죇晱ᒝ㰯뼩\uf737稅젆\udbe8蓼\uf18b괥뮅㔼\uece6墁⤓㮩溞꺢区鉂\ud8bb䶊흒䞈絊椮㭦踧뜃㎚ᗿ\ue8d4誑뵿憻⬛\uf897㾫㟔\uf0b3펋齚齷爼꼡Ꞥ呱\uf54a駓ี\uf1e8諒밝渖⚢\ud9a7蚮탏䄐죽吒趗巵ﮝ連禚\uef0b磁㤔\ueffe%鷮븁\ueac0䛖❞蚂ͣ\uf2f4難ꯛ눣ﾘ⥮㍡\u0b4a鮢ᕞആU\uf810\ue423泇㪔\uf180땯턦皃孙ᝰ쎕Ⲯ㝖쒾\u0fe2綠䇎Ə";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

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

      IlI = var15;
      Ill = new Object[var15.length];
      int var9 = 541210050;
      byte[] var7 = "â\u0018.è¸i\u009e\u008a\u00958\u0006vHç\u000f´\u0003útè¿+ºw-aýöF+ÞR\u008fà×\u0018Ü\u0088\u001d-Å\u001a¿ÖG>V÷F\u0086Á¤Èû<\u00198eo]\u0000½\u009d(¢5\u001c\u0006ì\u0011_Ð\u0097\u0007B\u0083Sbp\u008b\u0088¨ÆmôÊ\u0096fì~\u009dÂ2m\u0084ö\u001c:3 ¿eiV¼É7V\u001cJÑ½¥ÑÓGMÏ:lá·ä\u009f±[Ò\u007f\u0018\u001b\rÃ«>\u0017[\u0011Eû<S$Âõ)Q¯nlÌÀG«¯\u0097\u0007_ØuÁ\u001b\u008cÁ\u0083¨ht\u001f¢kµu\b\u008b±\u001aÅ\u0085bLxg\u0082¶ú\u0002215Ü\u008aT5\u000bb}\u0082\u008b\rd<hØÀ[\\ìñN\nÿÁ¯\u008e?HP\u008eÜ{¶\u0014\u000e@Cô\fü\u0004{6J$\u007f_w\u0086i¤\u0015¨Z\u0094õËG?#Ùö.\u0098ôrª)¶\u009a\u0005¶¡ji\u001c4\u0084VÜ8\b\u009aiàþI¤¿Æ\u001d6\u0018ß\u0005×ÛÝÈ\u0087-yH+\u0015ø\u0013CåZÔ\u0084{\u0006NY¬\u009es\u0012[Ç©Ìy»\u001eh;\u0093Ö·$÷;ÓN\u0096ñiÐ\u0004Ñ[3N\u0081¨r:k\bí\u0099Þ\u0001U\"\u001f\u001d\fAÄ\f äø\u0003yâD«õ¼x\u0099}Ç¼-JEYäÂQÐðí\u00adÒF\u008e¶BìMw\u0098Q@Ò=¹À~¼Y´µ¶ \u0087K\u0097\u009b\u0002l\u008fÇü÷\u0001Ã\u001b2;#¹Û\u0004)úBhöê«\u0013\u0014\u001dÊ\u008d\u0081\u009fòî3³d\u00ad\u0090ª7\u0082#ù\u009eôËFÿå¾Ù¢Ä\u00ad^c®ëH\u0012\u009a±ÒSÏI5\u0095s,ÏV\u0001\t¼\räÓ\u0092P\u001eò\u0006\u0002¶ÜÙQÐ\u0004RW\u009b\u009c\u001bÚW,J@\u0001ÞMÏ\u0016©ªðû\u00adÞç<©\u0084\u0098\u0086NìDz\nä#C`ø¹\u000f«ùU½¿³õ{ÆXú\u0017g\u001aU\u0083\u0006Ç>\u0082\u0005½gvYî!´\u0012I²p\u001c{\u0086Ü\n2\u0080SÓPÆ´\b\\\u008c\rO\u0086\u0092f\u0080Öd¿éâ\u0092\u0087\u0084\u008e\u0012Ù¸ë\r\u0011·Z\u0017E»\u008dã\u0081|¤k&J\r\u00865ï\u0089Ï#^.*¸W\u000b8¯Ô\u0012k6\u0002U\u001ax°Ãºõ=ûï\u0096ÄRýL\nH\u0013\u0003\u000bôåv\u008f\u0097ý¤1·\u0015\u000f#Al|«\u0099èt\u0000\u0091\u009fß±ôï§\u0085R\u009f\u0016·ÈE²&W\n4\u00186KV(\u009dYû1ïòcÖ\t'ó\"l:Õ0\"yç5û\u0010k\u009fI·\u0092ø1\u0015U\u0088CÛ1Òô^÷ªåÈ\u000f'WG\u0080\u0095\u0017÷\u0083H\u0017\u0003\u00057³\u0011ÚJ\u00990\u008a®4Ì`\u009b\u0010\u0002\u0091åÞìÔ·ZµôØ´´×ªdTÜ¦yù\u0004k£È\u0006\u008d\u0092Q\u009a7a1Îm\u001b6ònY`û¯\u0010ý\u0096,<õúÎ ±?§?Ú\u0090ôÒ\u0083Í¸j}T3tvÀ\rXÉd\u0092\u000795|µCçUo\u0080ÙhS\u0088ãÒNüªcÈ¤b¨¡V\u0096ÑÈò(\u0017HÁÜB½\u0089áù\u001dø¤\u0000% ï$\u0007×\u0006G1{\u0006\u0000\u001a\u001a\f²\u0011\u000ery;\u007fÿ\u009fý©ìÒ!D\"û\u008b\u0088Ü\r\u0019\u001bû\u0092\u001f¾ªÄ\u0089.¯{ß É¬Ý;\u001f\u0083äÙºE°ÁÂ\u009e\u0003\u0080t|\u0082½\u0013Õ\u0097\u0001\u0006çj3$Ú·º1¦Ü\u008f?AT\u0004\u0081\u0096¼\u008c\u008eþùZä\tk\u0090He×ÀÀ¸gW\u008e9ay¢¿ã\u0005\u008dE'\u0080ÊR\u0012oQÈì\u0092o\\\u0012\u0016±\t@åê^Ái¥ñ½Le\u0017á¨*æWÄ\u007f$\u007f©Õæý;7Zl\u000bÞîõj>RÝÙ\n\u0095\u0097\u009c@×én=j\bÚ\u0019AobÿÏ59¯ô·\u000e\u00902\u0010ï«6n\u009dis@ÑÁ×2\u00adØ\u0005ÙÉtÞ0\u0011x]\u0091\u001aù\u0081.²\u0002^5\u0094\u00ad´Ð\u0006Y\b\u0092ÏÇFìJìÚ"
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

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = Ill(-955113660, -544907816, (char)'뒄', 495910084, '玉', 32214)).length();
      int var1 = IIl(-658116739, var23 ^ -2004907947);
      int var25 = -1;

      label89:
      while (true) {
         int var10000 = 5;
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label84: {
               char[] var42 = var10001.toCharArray();
               int var10004 = var42.length;
               int var6 = 0;
               int var45 = var10000;
               var38 = var42;
               int var32 = var10004;
               char[] var54;
               int var10006;
               if (var10004 <= 1) {
                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var45 = var10000;
                  var32 = var10004;
                  if (var10004 <= var6) {
                     break label84;
                  }

                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % IIl(-658116738, var23 ^ 45900369)) {
                     case 0 -> 4;
                     case 1 -> IIl(-658116751, var23 ^ 705648358);
                     case 2 -> IIl(-658116752, var23 ^ 1615469769);
                     case 3 -> IIl(-658116749, var23 ^ 515399979);
                     case 4 -> 3;
                     case 5 -> IIl(-658116750, var23 ^ -15973120);
                     default -> IIl(-658116747, var23 ^ -1732992415);
                  });
                  var6++;
                  if (var45 == 0) {
                     var10006 = var45;
                     var54 = var38;
                     var10004 = var45;
                  } else {
                     if (var32 <= var6) {
                        break;
                     }

                     var54 = var38;
                     var10004 = var45;
                     var10006 = var6;
                  }
               }
            }

            String var47 = new String(var38).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var47;
                  if ((var25 += var1) >= var4) {
                     II = var5;
                     Il = new String[4];
                     I = new String[4];
                     lI();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var47;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label89;
                  }

                  var4 = (var2 = Ill(-955113659, 1423778867, '꧱', 180219354, (char)'짉', '϶')).length();
                  var1 = IIl(-658116740, var23 ^ 183331668);
                  var25 = -1;
            }

            var10000 = IIl(-658116737, var23 ^ -1679981751);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (this.IIIIlIl() && var1.field_1724 != null && var1.field_1687 != null) {
         class_1684 var2 = this.l(var1);
         if (var2 != null) {
            if (this.lI.IllI() && var2.method_24921() instanceof class_1309 var4 && var1.field_1724.method_6032() < var4.method_6032()) {
               this.ll.add(var2.method_5628());
            } else {
               int var13 = this.III(var1.field_1724.method_31548(), class_1802.field_8634);
               if (var13 >= 0) {
                  this.ll.add(var2.method_5628());
                  class_243 var5 = new class_243(var2.method_23317(), var2.method_23318(), var2.method_23321());
                  class_243 var6 = var1.field_1724.method_33571();
                  class_243 var7 = var5.method_1020(var6);
                  double var8 = Math.sqrt(var7.field_1352 * var7.field_1352 + var7.field_1350 * var7.field_1350);
                  float var10 = (float)(class_3532.method_15349(var7.field_1350, var7.field_1352) * (180.0 / Math.PI)) - 90.0F;
                  float var11 = (float)(-(class_3532.method_15349(var7.field_1351, var8) * (180.0 / Math.PI)));
                  if (this.III.IllI() == IIlllIII.II) {
                     var1.field_1724.method_36456(var10);
                     var1.field_1724.method_36457(var11);
                  }

                  IlllIlII.IIIll(var1, IIl(-658116748, 836957693 ^ -60968157), var10, var11, this::I);
               }
            }
         }
      } else {
         this.ll.clear();
      }
   }

   private static void lI() {
      int var0 = -847511672;
      I[0] = Il(II(IIl(-658116745, var0 ^ -2097944517), IIl(-658116746, var0 ^ 622007714)).toCharArray(), 39224L, IIl(-658116759, var0 ^ 964043743));
      I[1] = Il(II(IIl(-658116760, var0 ^ 1965865414), IIl(-658116757, var0 ^ 122762640)).toCharArray(), 68712L, IIl(-658116758, var0 ^ -1060229678));
      I[2] = Il(II(IIl(-658116755, var0 ^ 99352651), IIl(-658116756, var0 ^ -1528308958)).toCharArray(), 89665L, IIl(-658116753, var0 ^ 636917400));
      I[3] = Il(II(IIl(-658116754, var0 ^ 6935974), IIl(-658116767, var0 ^ -436532063)).toCharArray(), 59986L, IIl(-658116768, var0 ^ -757821504));
   }

   private static boolean ll(class_310 var0, int var1) {
      if (var0.field_1724 != null && var0.field_1724.method_31548().method_5438(var1).method_31574(class_1802.field_8634)) {
         boolean var2 = IIll.IIllIlI(var0, class_1268.field_5808);
         if (var2) {
            var0.field_1724.method_6104(class_1268.field_5808);
         }

         return var2;
      } else {
         return false;
      }
   }

   private int III(class_1661 var1, class_1792 var2) {
      String[] var3 = IIllllIl.IIIIl();
      if (var1 != null && var2 != null) {
         int var4 = 0;

         while (var4 < IIl(-658116765, -859151769 ^ -670669129)) {
            if (var1.method_5438(var4).method_31574(var2)) {
               return var4;
            }

            var4++;
            if (var3 != null) {
               break;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }
}
