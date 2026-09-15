package k74.x;

import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_437;
import net.minecraft.class_639;
import net.minecraft.class_642;

@Environment(EnvType.CLIENT)
public final class llllIlll {
   private static String[] I;
   private static final Object[] ll;
   private static final String[] l;
   private static final int[] Il;
   private static final String[] II;
   private static final String[] lI;

   private static String I(Object var0, String var1) {
      try {
         if (var0 == null) {
            return I[0];
         }
      } catch (ReflectiveOperationException var6) {
         throw l(var6);
      }

      try {
         Method var2 = var0.getClass().getMethod(var1);
         return var2.invoke(var0) instanceof String var4 ? var4 : I[0];
      } catch (ReflectiveOperationException var5) {
         return I[0];
      }
   }

   private static ReflectiveOperationException l(ReflectiveOperationException var0) {
      return var0;
   }

   private static String Ill(char var0, int var1, char var2) {
      int var3 = var0 ^ 6717;
      char[] var4 = lI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])ll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         ll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 8574;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '\uf0d7';
         var10 -= 29480;
         var10 += 32224;
         var10 -= 27794;
         var10 ^= 45308;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static boolean II(class_437 var0, class_310 var1, class_639 var2, class_642 var3) {
      String var4 = III(var2, var3);
      return IIl(var4);
   }

   private static String Il(char[] var0, long var1, int var3) {
      int var4 = IlI(2139382063, 1212345940 ^ 1436337633) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IlI(2139382062, 1212345940 ^ -1271939563);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String lI(int var0, int var1) {
      int var9 = 2094050507;
      int var2 = (var0 ^ IlI(2139382061, var9 ^ -1923183059)) & IlI(2139382060, var9 ^ -1490837763);
      if (l[var2] == null) {
         char[] var3 = II[var2].toCharArray();

         int var4 = switch (var3[0] & IlI(2139382059, var9 ^ -593653317)) {
            case 0 -> IlI(2139382058, var9 ^ 2006025640);
            case 1 -> IlI(2139382057, var9 ^ -571731865);
            case 2 -> IlI(2139382056, var9 ^ 1060949732);
            case 3 -> IlI(2139382055, var9 ^ 2054452415);
            case 4 -> IlI(2139382054, var9 ^ -1591567440);
            case 5 -> IlI(2139382053, var9 ^ -1518248940);
            case 6 -> IlI(2139382052, var9 ^ 523909120);
            case 7 -> IlI(2139382051, var9 ^ 1441560993);
            case 8 -> IlI(2139382050, var9 ^ -633699746);
            case 9 -> IlI(2139382049, var9 ^ -449942922);
            case 10 -> IlI(2139382048, var9 ^ 459890116);
            case 11 -> IlI(2139382079, var9 ^ -1512110827);
            case 12 -> IlI(2139382078, var9 ^ 991869691);
            case 13 -> IlI(2139382077, var9 ^ 1796052574);
            case 14 -> IlI(2139382076, var9 ^ 8658482);
            case 15 -> IlI(2139382075, var9 ^ 1867826002);
            case 16 -> IlI(2139382074, var9 ^ -657426618);
            case 17 -> IlI(2139382073, var9 ^ 1000199854);
            case 18 -> IlI(2139382072, var9 ^ -627761754);
            case 19 -> IlI(2139382071, var9 ^ -607987160);
            case 20 -> IlI(2139382070, var9 ^ -823691403);
            case 21 -> IlI(2139382069, var9 ^ 253021367);
            case 22 -> IlI(2139382068, var9 ^ 227530077);
            case 23 -> IlI(2139382067, var9 ^ -281605599);
            case 24 -> IlI(2139382066, var9 ^ -645620578);
            case 25 -> IlI(2139382065, var9 ^ 2115462156);
            case 26 -> IlI(2139382064, var9 ^ 616350704);
            case 27 -> IlI(2139382031, var9 ^ 662898510);
            case 28 -> IlI(2139382030, var9 ^ 1938106106);
            case 29 -> IlI(2139382029, var9 ^ -1919708921);
            case 30 -> IlI(2139382028, var9 ^ 1366318269);
            case 31 -> IlI(2139382027, var9 ^ -968363181);
            case 32 -> IlI(2139382026, var9 ^ 1713443037);
            case 33 -> IlI(2139382025, var9 ^ 1975124560);
            case 34 -> IlI(2139382024, var9 ^ 1703884467);
            case 35 -> IlI(2139382023, var9 ^ 471839264);
            case 36 -> IlI(2139382022, var9 ^ -2079196803);
            case 37 -> IlI(2139382021, var9 ^ 488012377);
            case 38 -> IlI(2139382020, var9 ^ 842415715);
            case 39 -> IlI(2139382019, var9 ^ 206537402);
            case 40 -> IlI(2139382018, var9 ^ -247247165);
            case 41 -> IlI(2139382017, var9 ^ -714324520);
            case 42 -> IlI(2139382016, var9 ^ 1168646809);
            case 43 -> IlI(2139382047, var9 ^ -1576203993);
            case 44 -> IlI(2139382046, var9 ^ -336954181);
            case 45 -> IlI(2139382045, var9 ^ 1369063864);
            case 46 -> IlI(2139382044, var9 ^ 1842341951);
            case 47 -> IlI(2139382043, var9 ^ -641487325);
            case 48 -> IlI(2139382042, var9 ^ -887030005);
            case 49 -> IlI(2139382041, var9 ^ -49044204);
            case 50 -> IlI(2139382040, var9 ^ -957873415);
            case 51 -> IlI(2139382039, var9 ^ -1542432191);
            case 52 -> IlI(2139382038, var9 ^ -1340403896);
            case 53 -> IlI(2139382037, var9 ^ -1965829262);
            case 54 -> IlI(2139382036, var9 ^ 1539194622);
            case 55 -> IlI(2139382035, var9 ^ 704058181);
            case 56 -> IlI(2139382034, var9 ^ 385991223);
            case 57 -> IlI(2139382033, var9 ^ 481479237);
            case 58 -> IlI(2139382032, var9 ^ -463023371);
            case 59 -> IlI(2139382127, var9 ^ 682084261);
            case 60 -> IlI(2139382126, var9 ^ 128765384);
            case 61 -> IlI(2139382125, var9 ^ -91379117);
            case 62 -> IlI(2139382124, var9 ^ -1974573560);
            case 63 -> IlI(2139382123, var9 ^ 1224338571);
            case 64 -> IlI(2139382122, var9 ^ -1970376870);
            case 65 -> IlI(2139382121, var9 ^ -673179850);
            case 66 -> IlI(2139382120, var9 ^ 1922953337);
            case 67 -> IlI(2139382119, var9 ^ 1537601362);
            case 68 -> IlI(2139382118, var9 ^ -1800061739);
            case 69 -> IlI(2139382117, var9 ^ -1643959557);
            case 70 -> IlI(2139382116, var9 ^ -57099121);
            case 71 -> IlI(2139382115, var9 ^ -1608703088);
            case 72 -> IlI(2139382114, var9 ^ 1294268064);
            case 73 -> IlI(2139382113, var9 ^ 1488830865);
            case 74 -> IlI(2139382112, var9 ^ 209460607);
            case 75 -> IlI(2139382143, var9 ^ -1609010967);
            case 76 -> IlI(2139382142, var9 ^ -1292788019);
            case 77 -> IlI(2139382141, var9 ^ -1597364698);
            case 78 -> IlI(2139382140, var9 ^ 1638545248);
            case 79 -> IlI(2139382139, var9 ^ -2052810007);
            case 80 -> IlI(2139382138, var9 ^ 80984105);
            case 81 -> IlI(2139382137, var9 ^ 1545665605);
            case 82 -> IlI(2139382136, var9 ^ 770380461);
            case 83 -> IlI(2139382135, var9 ^ -1401481953);
            case 84 -> IlI(2139382134, var9 ^ -1150573972);
            case 85 -> IlI(2139382133, var9 ^ -1472571913);
            case 86 -> IlI(2139382132, var9 ^ -1356570582);
            case 87 -> IlI(2139382131, var9 ^ 1957978745);
            case 88 -> IlI(2139382130, var9 ^ -1058837354);
            case 89 -> IlI(2139382129, var9 ^ 1634005089);
            case 90 -> IlI(2139382128, var9 ^ -1652914750);
            case 91 -> IlI(2139382095, var9 ^ -936003613);
            case 92 -> IlI(2139382094, var9 ^ -779283333);
            case 93 -> IlI(2139382093, var9 ^ 793892066);
            case 94 -> IlI(2139382092, var9 ^ 1817493184);
            case 95 -> IlI(2139382091, var9 ^ 430488580);
            case 96 -> IlI(2139382090, var9 ^ -1084780979);
            case 97 -> IlI(2139382089, var9 ^ -483444508);
            case 98 -> IlI(2139382088, var9 ^ -126096245);
            case 99 -> IlI(2139382087, var9 ^ 1684750057);
            case 100 -> IlI(2139382086, var9 ^ -1135868985);
            case 101 -> IlI(2139382085, var9 ^ 788354228);
            case 102 -> IlI(2139382084, var9 ^ 461526946);
            case 103 -> IlI(2139382083, var9 ^ 1464222054);
            case 104 -> IlI(2139382082, var9 ^ -1620788450);
            case 105 -> IlI(2139382081, var9 ^ 590720854);
            case 106 -> IlI(2139382080, var9 ^ -1877293958);
            case 107 -> IlI(2139382111, var9 ^ -1693732589);
            case 108 -> IlI(2139382110, var9 ^ -897507104);
            case 109 -> IlI(2139382109, var9 ^ -326302990);
            case 110 -> IlI(2139382108, var9 ^ 113410260);
            case 111 -> IlI(2139382107, var9 ^ 526068713);
            case 112 -> IlI(2139382106, var9 ^ -1318569004);
            case 113 -> IlI(2139382105, var9 ^ -177856931);
            case 114 -> IlI(2139382104, var9 ^ 668434220);
            case 115 -> IlI(2139382103, var9 ^ 1450645035);
            case 116 -> IlI(2139382102, var9 ^ 178310961);
            case 117 -> IlI(2139382101, var9 ^ -196760302);
            case 118 -> IlI(2139382100, var9 ^ 660896227);
            case 119 -> IlI(2139382099, var9 ^ 1755435472);
            case 120 -> IlI(2139382098, var9 ^ 1326805050);
            case 121 -> IlI(2139382097, var9 ^ 240027361);
            case 122 -> IlI(2139382096, var9 ^ -1368734584);
            case 123 -> IlI(2139382191, var9 ^ 947456474);
            case 124 -> 3;
            case 125 -> IlI(2139382190, var9 ^ -44220431);
            case 126 -> IlI(2139382189, var9 ^ -239644525);
            case 127 -> 2;
            case 128 -> IlI(2139382188, var9 ^ 462995787);
            case 129 -> IlI(2139382187, var9 ^ 1350999847);
            case 130 -> IlI(2139382186, var9 ^ -1530945710);
            case 131 -> IlI(2139382185, var9 ^ 2111346281);
            case 132 -> IlI(2139382184, var9 ^ -1047426115);
            case 133 -> IlI(2139382183, var9 ^ -1375386049);
            case 134 -> IlI(2139382182, var9 ^ -565894479);
            case 135 -> IlI(2139382181, var9 ^ -63960118);
            case 136 -> IlI(2139382180, var9 ^ 685918921);
            case 137 -> IlI(2139382179, var9 ^ -1938888950);
            case 138 -> IlI(2139382178, var9 ^ 465675370);
            case 139 -> IlI(2139382177, var9 ^ -1237014773);
            case 140 -> IlI(2139382176, var9 ^ -1324706878);
            case 141 -> IlI(2139382207, var9 ^ -439227453);
            case 142 -> IlI(2139382206, var9 ^ 978091740);
            case 143 -> IlI(2139382205, var9 ^ -676018117);
            case 144 -> IlI(2139382204, var9 ^ 609327183);
            case 145 -> IlI(2139382203, var9 ^ 52521114);
            case 146 -> IlI(2139382202, var9 ^ -1525085436);
            case 147 -> IlI(2139382201, var9 ^ 905516779);
            case 148 -> IlI(2139382200, var9 ^ -1376931008);
            case 149 -> IlI(2139382199, var9 ^ -1171452502);
            case 150 -> IlI(2139382198, var9 ^ 1805678023);
            case 151 -> IlI(2139382197, var9 ^ 317531594);
            case 152 -> IlI(2139382196, var9 ^ 1508041458);
            case 153 -> IlI(2139382195, var9 ^ 1869153060);
            case 154 -> IlI(2139382194, var9 ^ -307173407);
            case 155 -> IlI(2139382193, var9 ^ -429477508);
            case 156 -> IlI(2139382192, var9 ^ 2130457044);
            case 157 -> 0;
            case 158 -> 4;
            case 159 -> IlI(2139382159, var9 ^ 1631813634);
            case 160 -> IlI(2139382158, var9 ^ 2106121874);
            case 161 -> IlI(2139382157, var9 ^ 1106933443);
            case 162 -> IlI(2139382156, var9 ^ 88618094);
            case 163 -> IlI(2139382155, var9 ^ 486225692);
            case 164 -> IlI(2139382154, var9 ^ -121003129);
            case 165 -> IlI(2139382153, var9 ^ 712339160);
            case 166 -> IlI(2139382152, var9 ^ -800823608);
            case 167 -> IlI(2139382151, var9 ^ 176555605);
            case 168 -> IlI(2139382150, var9 ^ -1097611270);
            case 169 -> IlI(2139382149, var9 ^ -1123701253);
            case 170 -> IlI(2139382148, var9 ^ 627740445);
            case 171 -> IlI(2139382147, var9 ^ 1445915924);
            case 172 -> IlI(2139382146, var9 ^ -243830478);
            case 173 -> IlI(2139382145, var9 ^ -597821044);
            case 174 -> IlI(2139382144, var9 ^ 751920042);
            case 175 -> IlI(2139382175, var9 ^ 1213543027);
            case 176 -> IlI(2139382174, var9 ^ -1696504497);
            case 177 -> IlI(2139382173, var9 ^ -816324633);
            case 178 -> IlI(2139382172, var9 ^ -883619305);
            case 179 -> IlI(2139382171, var9 ^ -1667953580);
            case 180 -> IlI(2139382170, var9 ^ 2014214255);
            case 181 -> IlI(2139382169, var9 ^ -126801416);
            case 182 -> IlI(2139382168, var9 ^ -361064589);
            case 183 -> IlI(2139382167, var9 ^ 1349640462);
            case 184 -> IlI(2139382166, var9 ^ 1894262701);
            case 185 -> IlI(2139382165, var9 ^ -1040444295);
            case 186 -> IlI(2139382164, var9 ^ 106634988);
            case 187 -> IlI(2139382163, var9 ^ 1694489543);
            case 188 -> IlI(2139382162, var9 ^ -1158728435);
            case 189 -> IlI(2139382161, var9 ^ -1919565879);
            case 190 -> IlI(2139382160, var9 ^ -1403756176);
            case 191 -> IlI(2139382255, var9 ^ 477341566);
            case 192 -> IlI(2139382254, var9 ^ 1793521028);
            case 193 -> IlI(2139382253, var9 ^ -75492061);
            case 194 -> IlI(2139382252, var9 ^ 1118968622);
            case 195 -> IlI(2139382251, var9 ^ 1269031552);
            case 196 -> IlI(2139382250, var9 ^ 1522014892);
            case 197 -> IlI(2139382249, var9 ^ 2145507660);
            case 198 -> IlI(2139382248, var9 ^ -1242018003);
            case 199 -> IlI(2139382247, var9 ^ 612583806);
            case 200 -> IlI(2139382246, var9 ^ 1016319178);
            case 201 -> IlI(2139382245, var9 ^ -883050798);
            case 202 -> IlI(2139382244, var9 ^ 241163767);
            case 203 -> IlI(2139382243, var9 ^ -923846061);
            case 204 -> IlI(2139382242, var9 ^ 414146227);
            case 205 -> IlI(2139382241, var9 ^ 1310116776);
            case 206 -> IlI(2139382240, var9 ^ 1554852775);
            case 207 -> 5;
            case 208 -> IlI(2139382271, var9 ^ 1575756110);
            case 209 -> IlI(2139382270, var9 ^ -659837910);
            case 210 -> IlI(2139382269, var9 ^ -357061839);
            case 211 -> IlI(2139382268, var9 ^ -779493491);
            case 212 -> IlI(2139382267, var9 ^ -1404881367);
            case 213 -> IlI(2139382266, var9 ^ 1867116417);
            case 214 -> IlI(2139382265, var9 ^ -96704259);
            case 215 -> IlI(2139382264, var9 ^ -915339804);
            case 216 -> IlI(2139382263, var9 ^ -212775959);
            case 217 -> IlI(2139382262, var9 ^ 1648879749);
            case 218 -> IlI(2139382261, var9 ^ -668868425);
            case 219 -> IlI(2139382260, var9 ^ 1913303412);
            case 220 -> IlI(2139382259, var9 ^ 1882793590);
            case 221 -> IlI(2139382258, var9 ^ -641040252);
            case 222 -> IlI(2139382257, var9 ^ 478336889);
            case 223 -> IlI(2139382256, var9 ^ 692842428);
            case 224 -> IlI(2139382223, var9 ^ 1643757538);
            case 225 -> IlI(2139382222, var9 ^ 746533749);
            case 226 -> IlI(2139382221, var9 ^ 806122236);
            case 227 -> IlI(2139382220, var9 ^ 856859398);
            case 228 -> IlI(2139382219, var9 ^ 1102238168);
            case 229 -> IlI(2139382218, var9 ^ 449131646);
            case 230 -> IlI(2139382217, var9 ^ 422348919);
            case 231 -> IlI(2139382216, var9 ^ -180114597);
            case 232 -> IlI(2139382215, var9 ^ 1687184667);
            case 233 -> IlI(2139382214, var9 ^ -200827136);
            case 234 -> IlI(2139382213, var9 ^ -1976000678);
            case 235 -> IlI(2139382212, var9 ^ -845998130);
            case 236 -> IlI(2139382211, var9 ^ -1113546005);
            case 237 -> IlI(2139382210, var9 ^ 246899790);
            case 238 -> IlI(2139382209, var9 ^ 2110619800);
            case 239 -> IlI(2139382208, var9 ^ -1655369506);
            case 240 -> IlI(2139382239, var9 ^ -1474549323);
            case 241 -> IlI(2139382238, var9 ^ -343365799);
            case 242 -> IlI(2139382237, var9 ^ 458024951);
            case 243 -> IlI(2139382236, var9 ^ -503152397);
            case 244 -> IlI(2139382235, var9 ^ 1593286714);
            case 245 -> IlI(2139382234, var9 ^ 592205524);
            case 246 -> IlI(2139382233, var9 ^ 452013188);
            case 247 -> IlI(2139382232, var9 ^ -2121964632);
            case 248 -> IlI(2139382231, var9 ^ -1442219850);
            case 249 -> IlI(2139382230, var9 ^ 999123327);
            case 250 -> IlI(2139382229, var9 ^ 637608551);
            case 251 -> 1;
            case 252 -> IlI(2139382228, var9 ^ -1223915544);
            case 253 -> IlI(2139382227, var9 ^ 461417943);
            case 254 -> IlI(2139382226, var9 ^ -1981412521);
            default -> IlI(2139382225, var9 ^ 1276406143);
         };
         int var5 = (var1 & IlI(2139382224, var9 ^ -403388535)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IlI(2139381807, var9 ^ -861648480)) >>> IlI(2139381806, var9 ^ 1514513660)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IlI(2139381805, var9 ^ 1969234307);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IlI(2139381804, var9 ^ 963316281);
            }
         }

         l[var2] = new String(var3).intern();
      }

      return l[var2];
   }

   private static void ll() {
      int var0 = -291366554;
      I[0] = Il("".toCharArray(), 70471L, IlI(2139381803, var0 ^ -1028107372));
      I[1] = Il(lI(IlI(2139381802, var0 ^ 1876407841), IlI(2139381801, var0 ^ 515677684)).toCharArray(), 67695L, IlI(2139381800, var0 ^ -1455573548));
      I[2] = Il(lI(IlI(2139381799, var0 ^ 1484492402), IlI(2139381798, var0 ^ 1728861369)).toCharArray(), 14254L, IlI(2139381797, var0 ^ -1382240246));
      I[3] = Il(lI(IlI(2139381796, var0 ^ 1593501031), IlI(2139381795, var0 ^ 1925644860)).toCharArray(), 95270L, IlI(2139381794, var0 ^ -309914682));
      I[4] = Il(lI(IlI(2139381793, var0 ^ -1499467794), IlI(2139381792, var0 ^ 18538345)).toCharArray(), 83866L, IlI(2139381823, var0 ^ 555651936));
      I[5] = Il(lI(IlI(2139381822, var0 ^ 276186641), IlI(2139381821, var0 ^ -521608797)).toCharArray(), 15444L, IlI(2139381820, var0 ^ 353723579));
      I[IlI(2139381819, var0 ^ 1676580531)] = Il(
         lI(IlI(2139381818, var0 ^ -2121019710), IlI(2139381817, var0 ^ -1631253159)).toCharArray(), 56256L, IlI(2139381816, var0 ^ -627372355)
      );
   }

   private static int IlI(int var0, int var1) {
      int var2 = Il[var0 ^ 2139382063] ^ var1 ^ var0;
      var2 += 10069;
      var2 += 60275;
      var2 ^= 56169;
      var2 += 30669;
      var2 ^= 35677;
      var2 ^= 2499;
      var2 ^= 47067;
      return var2 ^ 65260;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -596426891;
      String var14 = "ၤ苖\uef8a貝腻谸涞剅䥈람⓷쐣ﳲ\ue0f8꺜᧘匭ᘓ\ue572笩鲫腔\uded2⛠觨㓤叔ᆜ퍭쯱\u2063⻛삦뢱滽岳缓\ueca4忁ﻱഴ脮腒辧嗳\uf739⺥ꂟ區ﬗ➛씌\ue70dᠱ㍽↪䞡⑀ἃ칀뛅ᯀ柂莊꾡긇㮆潐ᷙ\ue502Ⱙ퍀귌\ueb5a䮬葹宻ꀼ\ue95e᪆삟텠鱌遵";
      byte var20 = -1;
      char[] var15 = "/%".toCharArray();
      short var13 = 4185;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            lI = var16;
            ll = new Object[var16.length];
            int var9 = -1480514167;
            byte[] var7 = "\u0085®EYÛ×bþÖ4ó¹üH#\u008b\u0087÷\u000fÊ,û\u001bá\u0086\u0086\u008dÐdVSÁ!\u001eà[úH\u0006\u0093þëÁµDP¦I\u000e\u0086ä!\u0081P\u001fú¾Dô\n@\u0003ÀÄþµ\u0098\u009a`t'ì0g\u000bW[î\u008aà4>^b\u0083ºêP`÷HÞ\u0081ÿ\u0089i\u0080¨G<\u0095\u008dêCT~QüVåHx´]\u0097\u0084\u0082î\u0001±%}ù\u000b\u007fÖ^Ø|é\u009a¿(ï²'Öù\f\u001a\n\u001aÂä\u009d-g\u0081=K\u008d\u0007.Ð\u0096e>å¢gGu,Eß{g4F|ä\ni\\£ÚW%\u001cÜª)Óã\u008e\u0006Ñ\u0003\u001eÂ¶{ùg\u0094;°\u0080ár\nðÕ\u009a6¥u\u0011\u0082©3\u0013\u0090Jb\u0018¦y;d\u009d\u0082\u009f_ÿzÇÍëq\u009b´Ñ¹Ní\u0000Ô£Hr\u009d\u008e@Lk\\uGØW\u009c¿\fOSsÍS)\\ÆY\u009d¡ç>×Ñ$ûK\u0013\u0093quÑäña\u008c\u008a\u008a )÷mÞ\u0000ÏqxÏß¡\fÅi´ë§ò!cûw¾ý\u0016Nh\u0084\u0003×\\\tW\u0016\u0080\u0083ûríké\u009b\u0003\u0080û ¸\u0015:Àª\u001eÞÎ\u0004þ_¹,¥\u0007Jaõv\u0081\u008c\u0086÷\u001d\u0081\u00adà\u0001?=óPËãôNý&/Þÿv\u009b\u0089ò\u0083:\u000endÆ\u0010\u0018\u0017\u0093_*Õ\u008aç\u008aqt;I{7>*yBÂ\"\u0013ä=\u0013\u0019¸E¬A£\u0011qx?\u0001£\u000eç&\u009e6u\u0097ÀË@èÉ\u0091\f,Ü*Ä\u000e&Zx_;ÐËpZbÀa,Â\u0091ë¾ü·ç\u009fy]¨\u001d\u0091D1¶\u0014ê\u0002¦\u0092®\f\u008a:|½ë\u0099\r\u001d\u0082\u00adQÊRà¯/3\u001d|\u000eí\\3ËOë\u0014\u007fä©U$\u001b5õ\u0000P<c\u0013\u0094\u008a¦7¢SªÝÄÛ@ò\\v\u000bì\u0002¹ÿÕ\u0002K&²\u000bP\u009aû\u0016ïõoÛ\u008a\u0085/¼f§Z\u0096îs\u0088Ô\u001f×\u0004yÏ@«9}í.9Åê`\u000e·¾»\u007f\u0094a&êº\u008cÞ\\@\u007f;\u0005ùXKõíþs\u0095Þn\u0093\u0088\u0019ö\u0087'\u0017áG\u0093U0Êè\u000bI\u0087»3\u0002\u0088\u007fB4\u0003\u0097f¶Úzù½\f/\u0096%\u0096¯3:)\u001d¬&â@E\u001a\u0090âs^\"©ÈG\u0091©ü££>\u0094q\u001fú\u008f\u008b.ø\u0012Qì\u0098\u0091åùZRæo3\r~\u0000\u0012\u0012\rDp6ª\u001dìH\u00877d¼w»þ\u0002\u0013?¦\u000bÁ\u008bøC\u0094=B_\u0090?\u0097\u0014Çÿ\u0092¥#dì\u0005£\u001b´t±\u0010\nY\u000b\u001b|\u0086+\u0082¹q\u009a\u0096\u0089\u0091]1\u0083b?\u0095E\u000bá\u0085¨\u0010Öÿ\"\u0096÷>ü-G\u0019:\u001c1\u008chm ê\u0088þ\u0019Ø\u0086@\u0010ÉvS\u0001Ò\u0087Ò$\u008bDYî\u0092ÒI\u007fé×ÍgùQæ\u00907(wU5@§\u0093\u0085¤ÀCÅÃÆ\u0015|Và\u0007Çµ\u0002\u0006\u0086µP\u0083Á1I±Ý6Û\u008aãK³÷)«\u00194#rÃ¡Võ\u0097\u0092\u001b\u0091ü¨;ßÁ9-ué\u0083K}u)`%s+S¸Â\u0082 \u0014\u0084GèJ4r!q\u0012:\u0093\"\u0089w\u0015§Okfæìhx>a\u001aØOwA¯© BF\u001c~®)5ý?úøÏ¯m\u0002âÑR\u0002\u0016\u0096ù\u008a,æÊ6ìUÝù+&§\u0014¿Æ?\u0084Åóv´\u0011°â:>@&z²¹h\u001d\u0002\u0005\u009d=[x&ËõA\u009b±ÝÚïþkñcæ\u0017`ç÷è}k¿ºìf\u0013î@ê05Ò\u008c\u009f¼\u0017~ô¯¼\u009eY\u0003\u0097ÏõÕ\u0001/8e.\n¾ôb\u0001\u0095Ol»¦½¦Ï\u007f\u001c×¤\u0089\u008e3È\u0002â\u0091cGA®\u0016*\u008fß-\u0000·\u0097â,U»ß\u008a\rRÙUâo\u0087%'È\u0000¨)\u008b\u0098º¹Ùn\u008cÆ)ð\u0013¼ª;·µªö¿¤H\u008b\u0004\u0013WßX_¬¡]\u009bô\\2tÆü\u0010åM&UÑ\u008b0¿Ø\u001díØÊ\"ÜÔ\u0087SÜ8Á´a\u008cvWÇ\u0089{¢\u0092tíõúÄ\u009do\u008bÝ0\u0004¿T\u001cßÁ\u007f\u0002ì!\u009a*"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            Il = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               Il[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var5 = new String[IlI(2139381815, var24 ^ 261438844)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = Ill('ᨽ', var24 ^ 2022916412, '餎')).length();
            int var1 = 4;
            int var26 = -1;

            label101:
            while (true) {
               int var29 = IlI(2139381814, var24 ^ 1026891719);
               String var10001 = var2.substring(++var26, var26 + var1);
               byte var10002 = -1;

               while (true) {
                  label96: {
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
                           break label96;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % IlI(2139381810, var24 ^ -652878967)) {
                           case 0 -> IlI(2139381809, var24 ^ -1475002729);
                           case 1 -> IlI(2139381808, var24 ^ 1336443654);
                           case 2 -> IlI(2139381775, var24 ^ -1408334213);
                           case 3 -> IlI(2139381774, var24 ^ 1499165338);
                           case 4 -> IlI(2139381773, var24 ^ 238275482);
                           case 5 -> IlI(2139381772, var24 ^ -1807560140);
                           default -> IlI(2139381771, var24 ^ -9020636);
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
                           II = var5;
                           l = new String[IlI(2139381811, var24 ^ -433793082)];
                           I = new String[IlI(2139381770, var24 ^ 604532788)];
                           ll();
                           return;
                        }

                        var1 = var2.charAt(var26);
                        break;
                     default:
                        var5[var3++] = var50;
                        if ((var26 += var1) < var4) {
                           var1 = var2.charAt(var26);
                           continue label101;
                        }

                        var4 = (var2 = Ill('ᨼ', var24 ^ 813721087, '￫')).length();
                        var1 = IlI(2139381813, var24 ^ -1225827639);
                        var26 = -1;
                  }

                  var29 = IlI(2139381812, var24 ^ 1895411905);
                  var10001 = var2.substring(++var26, var26 + var1);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 74;
                  case 1 -> 229;
                  case 2 -> 214;
                  case 3 -> 60;
                  case 4 -> 15;
                  case 5 -> 218;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   public static String III(class_639 var0, class_642 var1) {
      if (var1 != null && var1.field_3761 != null && !var1.field_3761.isBlank()) {
         return var1.field_3761;
      } else {
         String var2 = I(var0, IlIIllIII.lI(I[IlI(2139381769, -752682102 ^ 414798307)]));
         if (!var2.isBlank()) {
            return var2;
         } else {
            String var3 = var0 == null ? I[0] : String.valueOf(var0);
            return var3.contains(IlIIllIII.lI(I[5])) ? I[0] : var3;
         }
      }
   }

   public static boolean IIl(String var0) {
      if (var0 == null) {
         return false;
      } else {
         String var1 = var0.trim().toLowerCase();
         if (var1.contains(IlIIllIII.lI(I[2]))) {
            var1 = var1.split(IlIIllIII.lI(I[2]))[0].trim();
         }

         return var1.equals(IlIIllIII.lI(I[3])) || var1.equals(IlIIllIII.lI(I[1])) || var1.equals(IlIIllIII.lI(I[4]));
      }
   }

   private llllIlll() {
   }
}
