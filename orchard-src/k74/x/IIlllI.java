package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;

@Environment(EnvType.CLIENT)
public final class IIlllI {
   private static final IIlllI I;
   private static final String[] l;
   private static final Object[] Ill;
   private volatile long II;
   private static final String[] IlI;
   private static final String[] Il;
   private volatile long lI;
   private static final int[] IIl;
   private static String[] ll;
   private volatile long III;

   public long I() {
      return this.II;
   }

   private static int lIl(int var0, int var1) {
      int var2 = IIl[var0 ^ 1023938072] ^ var1 ^ var0;
      var2 += 38205;
      var2 += 20909;
      var2 ^= 22327;
      var2 += 43481;
      var2 ^= 39033;
      var2 -= 19373;
      var2 ^= 62225;
      return var2 ^ 53398;
   }

   public long l() {
      return this.lI;
   }

   private static String II(int var0, int var1) {
      int var9 = -1680400683;
      int var2 = (var0 ^ lIl(1023938072, var9 ^ 54258379)) & lIl(1023938073, var9 ^ -674336794);
      if (l[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & lIl(1023938074, var9 ^ -1822264141)) {
            case 0 -> lIl(1023938075, var9 ^ 240490768);
            case 1 -> lIl(1023938076, var9 ^ 1351391875);
            case 2 -> lIl(1023938077, var9 ^ -735064738);
            case 3 -> lIl(1023938078, var9 ^ -364156029);
            case 4 -> lIl(1023938079, var9 ^ -1233902509);
            case 5 -> lIl(1023938064, var9 ^ -847125534);
            case 6 -> lIl(1023938065, var9 ^ 1273569050);
            case 7 -> lIl(1023938066, var9 ^ -1957103925);
            case 8 -> lIl(1023938067, var9 ^ 212305376);
            case 9 -> lIl(1023938068, var9 ^ 1026429380);
            case 10 -> lIl(1023938069, var9 ^ 747526357);
            case 11 -> lIl(1023938070, var9 ^ 1947546241);
            case 12 -> lIl(1023938071, var9 ^ 221015901);
            case 13 -> lIl(1023938056, var9 ^ 1810169695);
            case 14 -> lIl(1023938057, var9 ^ 1989472061);
            case 15 -> lIl(1023938058, var9 ^ 489739770);
            case 16 -> lIl(1023938059, var9 ^ 1468073325);
            case 17 -> lIl(1023938060, var9 ^ 748337823);
            case 18 -> lIl(1023938061, var9 ^ -1845781992);
            case 19 -> lIl(1023938062, var9 ^ 1141194906);
            case 20 -> lIl(1023938063, var9 ^ 1645208372);
            case 21 -> lIl(1023938048, var9 ^ -2016525131);
            case 22 -> lIl(1023938049, var9 ^ -1123907808);
            case 23 -> lIl(1023938050, var9 ^ -689086692);
            case 24 -> lIl(1023938051, var9 ^ -175096316);
            case 25 -> lIl(1023938052, var9 ^ 1512540995);
            case 26 -> lIl(1023938053, var9 ^ -595426431);
            case 27 -> lIl(1023938054, var9 ^ 1045476267);
            case 28 -> lIl(1023938055, var9 ^ 368638737);
            case 29 -> lIl(1023938104, var9 ^ -810293484);
            case 30 -> lIl(1023938105, var9 ^ -1919203288);
            case 31 -> lIl(1023938106, var9 ^ -1151381812);
            case 32 -> lIl(1023938107, var9 ^ 1840786658);
            case 33 -> lIl(1023938108, var9 ^ -1503756776);
            case 34 -> lIl(1023938109, var9 ^ -2115675086);
            case 35 -> lIl(1023938110, var9 ^ -1757903604);
            case 36 -> lIl(1023938111, var9 ^ 1436363556);
            case 37 -> lIl(1023938096, var9 ^ 1631497736);
            case 38 -> lIl(1023938097, var9 ^ 854900085);
            case 39 -> lIl(1023938098, var9 ^ 1701305451);
            case 40 -> lIl(1023938099, var9 ^ -462054393);
            case 41 -> lIl(1023938100, var9 ^ -1322488550);
            case 42 -> lIl(1023938101, var9 ^ 231310120);
            case 43 -> lIl(1023938102, var9 ^ 836548710);
            case 44 -> lIl(1023938103, var9 ^ 204477902);
            case 45 -> lIl(1023938088, var9 ^ -2057044368);
            case 46 -> lIl(1023938089, var9 ^ -294839630);
            case 47 -> lIl(1023938090, var9 ^ 835468160);
            case 48 -> lIl(1023938091, var9 ^ -934784063);
            case 49 -> lIl(1023938092, var9 ^ 1799830787);
            case 50 -> lIl(1023938093, var9 ^ -1942769436);
            case 51 -> lIl(1023938094, var9 ^ 440093465);
            case 52 -> lIl(1023938095, var9 ^ -1555575725);
            case 53 -> lIl(1023938080, var9 ^ -792624950);
            case 54 -> lIl(1023938081, var9 ^ -96005967);
            case 55 -> lIl(1023938082, var9 ^ -445632967);
            case 56 -> lIl(1023938083, var9 ^ -1810914483);
            case 57 -> lIl(1023938084, var9 ^ -1291907626);
            case 58 -> lIl(1023938085, var9 ^ 1747229005);
            case 59 -> lIl(1023938086, var9 ^ 1617731890);
            case 60 -> lIl(1023938087, var9 ^ -999257622);
            case 61 -> lIl(1023938136, var9 ^ 3619409);
            case 62 -> lIl(1023938137, var9 ^ 1722856066);
            case 63 -> lIl(1023938138, var9 ^ 551142830);
            case 64 -> lIl(1023938139, var9 ^ 1273788928);
            case 65 -> lIl(1023938140, var9 ^ -211653294);
            case 66 -> lIl(1023938141, var9 ^ -107715342);
            case 67 -> lIl(1023938142, var9 ^ -619602678);
            case 68 -> lIl(1023938143, var9 ^ -633413498);
            case 69 -> lIl(1023938128, var9 ^ 986060845);
            case 70 -> lIl(1023938129, var9 ^ -1668229151);
            case 71 -> lIl(1023938130, var9 ^ 58524199);
            case 72 -> lIl(1023938131, var9 ^ -648945789);
            case 73 -> lIl(1023938132, var9 ^ -842229852);
            case 74 -> lIl(1023938133, var9 ^ -342190371);
            case 75 -> lIl(1023938134, var9 ^ -1718780545);
            case 76 -> lIl(1023938135, var9 ^ 2039936015);
            case 77 -> lIl(1023938120, var9 ^ -418501081);
            case 78 -> lIl(1023938121, var9 ^ 972444697);
            case 79 -> lIl(1023938122, var9 ^ -229846804);
            case 80 -> lIl(1023938123, var9 ^ -1847062138);
            case 81 -> lIl(1023938124, var9 ^ -249967294);
            case 82 -> lIl(1023938125, var9 ^ 422634161);
            case 83 -> lIl(1023938126, var9 ^ 371853719);
            case 84 -> lIl(1023938127, var9 ^ 396641566);
            case 85 -> lIl(1023938112, var9 ^ 145993155);
            case 86 -> lIl(1023938113, var9 ^ -335402103);
            case 87 -> lIl(1023938114, var9 ^ 1748611860);
            case 88 -> lIl(1023938115, var9 ^ 1456828395);
            case 89 -> lIl(1023938116, var9 ^ 1097841364);
            case 90 -> lIl(1023938117, var9 ^ -998350511);
            case 91 -> lIl(1023938118, var9 ^ 450563801);
            case 92 -> lIl(1023938119, var9 ^ 1263418867);
            case 93 -> lIl(1023938168, var9 ^ -51220048);
            case 94 -> lIl(1023938169, var9 ^ -1598372271);
            case 95 -> lIl(1023938170, var9 ^ 1468293611);
            case 96 -> lIl(1023938171, var9 ^ -736551022);
            case 97 -> lIl(1023938172, var9 ^ 28416663);
            case 98 -> lIl(1023938173, var9 ^ -1409950902);
            case 99 -> lIl(1023938174, var9 ^ -1773808507);
            case 100 -> lIl(1023938175, var9 ^ -518215087);
            case 101 -> lIl(1023938160, var9 ^ -1600344881);
            case 102 -> lIl(1023938161, var9 ^ -1355800471);
            case 103 -> lIl(1023938162, var9 ^ 432286989);
            case 104 -> lIl(1023938163, var9 ^ 2144904074);
            case 105 -> lIl(1023938164, var9 ^ 699171792);
            case 106 -> lIl(1023938165, var9 ^ 1049904552);
            case 107 -> lIl(1023938166, var9 ^ -634057898);
            case 108 -> lIl(1023938167, var9 ^ 825773478);
            case 109 -> lIl(1023938152, var9 ^ 1001999754);
            case 110 -> lIl(1023938153, var9 ^ 1113544067);
            case 111 -> lIl(1023938154, var9 ^ -375716988);
            case 112 -> lIl(1023938155, var9 ^ -1480875038);
            case 113 -> lIl(1023938156, var9 ^ 1276520825);
            case 114 -> lIl(1023938157, var9 ^ 1934651032);
            case 115 -> lIl(1023938158, var9 ^ 1092676609);
            case 116 -> lIl(1023938159, var9 ^ -1650167409);
            case 117 -> lIl(1023938144, var9 ^ -1925025135);
            case 118 -> lIl(1023938145, var9 ^ 886187807);
            case 119 -> lIl(1023938146, var9 ^ 2034874159);
            case 120 -> lIl(1023938147, var9 ^ 186553127);
            case 121 -> lIl(1023938148, var9 ^ 1447908934);
            case 122 -> lIl(1023938149, var9 ^ 981857210);
            case 123 -> lIl(1023938150, var9 ^ 884761211);
            case 124 -> lIl(1023938151, var9 ^ -944059197);
            case 125 -> lIl(1023938200, var9 ^ 1005199204);
            case 126 -> lIl(1023938201, var9 ^ -544716998);
            case 127 -> lIl(1023938202, var9 ^ -1794916840);
            case 128 -> lIl(1023938203, var9 ^ -596840906);
            case 129 -> lIl(1023938204, var9 ^ 687533412);
            case 130 -> lIl(1023938205, var9 ^ -1363646760);
            case 131 -> lIl(1023938206, var9 ^ 571114508);
            case 132 -> lIl(1023938207, var9 ^ 1461978171);
            case 133 -> lIl(1023938192, var9 ^ -568668380);
            case 134 -> lIl(1023938193, var9 ^ 40824707);
            case 135 -> lIl(1023938194, var9 ^ -816128455);
            case 136 -> lIl(1023938195, var9 ^ -744868895);
            case 137 -> lIl(1023938196, var9 ^ -950291488);
            case 138 -> lIl(1023938197, var9 ^ -1134837481);
            case 139 -> lIl(1023938198, var9 ^ -2018464478);
            case 140 -> lIl(1023938199, var9 ^ 1905282457);
            case 141 -> lIl(1023938184, var9 ^ -1621265165);
            case 142 -> lIl(1023938185, var9 ^ 1570436362);
            case 143 -> lIl(1023938186, var9 ^ -1801175576);
            case 144 -> lIl(1023938187, var9 ^ 1133729730);
            case 145 -> lIl(1023938188, var9 ^ -413613318);
            case 146 -> lIl(1023938189, var9 ^ -452139807);
            case 147 -> lIl(1023938190, var9 ^ 936663765);
            case 148 -> lIl(1023938191, var9 ^ 331450443);
            case 149 -> lIl(1023938176, var9 ^ 352004);
            case 150 -> lIl(1023938177, var9 ^ 451607956);
            case 151 -> lIl(1023938178, var9 ^ -269047963);
            case 152 -> lIl(1023938179, var9 ^ 845804402);
            case 153 -> lIl(1023938180, var9 ^ 1266786043);
            case 154 -> lIl(1023938181, var9 ^ 1313459775);
            case 155 -> lIl(1023938182, var9 ^ -404129906);
            case 156 -> lIl(1023938183, var9 ^ 1185117543);
            case 157 -> lIl(1023938232, var9 ^ -614292172);
            case 158 -> lIl(1023938233, var9 ^ 1329377883);
            case 159 -> lIl(1023938234, var9 ^ -325631869);
            case 160 -> lIl(1023938235, var9 ^ 296139495);
            case 161 -> lIl(1023938236, var9 ^ 707118135);
            case 162 -> lIl(1023938237, var9 ^ 60395708);
            case 163 -> lIl(1023938238, var9 ^ 2101788332);
            case 164 -> lIl(1023938239, var9 ^ 74738991);
            case 165 -> lIl(1023938224, var9 ^ -327817701);
            case 166 -> lIl(1023938225, var9 ^ -1052119899);
            case 167 -> lIl(1023938226, var9 ^ -1340789303);
            case 168 -> lIl(1023938227, var9 ^ 57700186);
            case 169 -> lIl(1023938228, var9 ^ -668568794);
            case 170 -> lIl(1023938229, var9 ^ 313052722);
            case 171 -> lIl(1023938230, var9 ^ 445186024);
            case 172 -> lIl(1023938231, var9 ^ -1209932610);
            case 173 -> lIl(1023938216, var9 ^ -860762343);
            case 174 -> lIl(1023938217, var9 ^ -708835270);
            case 175 -> lIl(1023938218, var9 ^ 505011794);
            case 176 -> lIl(1023938219, var9 ^ -123166492);
            case 177 -> 1;
            case 178 -> lIl(1023938220, var9 ^ -923880044);
            case 179 -> lIl(1023938221, var9 ^ 1795876587);
            case 180 -> lIl(1023938222, var9 ^ -242452533);
            case 181 -> lIl(1023938223, var9 ^ -1379362843);
            case 182 -> lIl(1023938208, var9 ^ -987827492);
            case 183 -> lIl(1023938209, var9 ^ 1192387127);
            case 184 -> lIl(1023938210, var9 ^ -1166166208);
            case 185 -> lIl(1023938211, var9 ^ 255621461);
            case 186 -> lIl(1023938212, var9 ^ 1101646004);
            case 187 -> lIl(1023938213, var9 ^ -1735655005);
            case 188 -> lIl(1023938214, var9 ^ 1776108910);
            case 189 -> lIl(1023938215, var9 ^ -1926405227);
            case 190 -> lIl(1023938264, var9 ^ -824225646);
            case 191 -> lIl(1023938265, var9 ^ 309126491);
            case 192 -> lIl(1023938266, var9 ^ -1568329260);
            case 193 -> lIl(1023938267, var9 ^ -1028717498);
            case 194 -> lIl(1023938268, var9 ^ 123831392);
            case 195 -> lIl(1023938269, var9 ^ 1304264004);
            case 196 -> lIl(1023938270, var9 ^ 1579123139);
            case 197 -> 3;
            case 198 -> lIl(1023938271, var9 ^ -636492458);
            case 199 -> lIl(1023938256, var9 ^ 45556151);
            case 200 -> lIl(1023938257, var9 ^ 1265583234);
            case 201 -> lIl(1023938258, var9 ^ -1102387903);
            case 202 -> 4;
            case 203 -> lIl(1023938259, var9 ^ -1580673305);
            case 204 -> lIl(1023938260, var9 ^ 1625070131);
            case 205 -> lIl(1023938261, var9 ^ -1201879665);
            case 206 -> lIl(1023938262, var9 ^ 569216368);
            case 207 -> lIl(1023938263, var9 ^ -1802764305);
            case 208 -> lIl(1023938248, var9 ^ -753862992);
            case 209 -> lIl(1023938249, var9 ^ 1320396446);
            case 210 -> lIl(1023938250, var9 ^ 2072978699);
            case 211 -> lIl(1023938251, var9 ^ 1405078919);
            case 212 -> lIl(1023938252, var9 ^ -224971190);
            case 213 -> lIl(1023938253, var9 ^ 1467246848);
            case 214 -> lIl(1023938254, var9 ^ -680308120);
            case 215 -> lIl(1023938255, var9 ^ -236925883);
            case 216 -> lIl(1023938240, var9 ^ 1054072784);
            case 217 -> lIl(1023938241, var9 ^ -1232971482);
            case 218 -> lIl(1023938242, var9 ^ -372942481);
            case 219 -> lIl(1023938243, var9 ^ 346951661);
            case 220 -> lIl(1023938244, var9 ^ -227677030);
            case 221 -> lIl(1023938245, var9 ^ 719291253);
            case 222 -> lIl(1023938246, var9 ^ 1296373369);
            case 223 -> lIl(1023938247, var9 ^ 1805109806);
            case 224 -> lIl(1023938296, var9 ^ 1506711183);
            case 225 -> lIl(1023938297, var9 ^ 499962154);
            case 226 -> lIl(1023938298, var9 ^ -1898233759);
            case 227 -> lIl(1023938299, var9 ^ -1604864894);
            case 228 -> lIl(1023938300, var9 ^ 1692550765);
            case 229 -> lIl(1023938301, var9 ^ -1471480953);
            case 230 -> lIl(1023938302, var9 ^ 1503189740);
            case 231 -> lIl(1023938303, var9 ^ -650849368);
            case 232 -> lIl(1023938288, var9 ^ -862501712);
            case 233 -> lIl(1023938289, var9 ^ 428966967);
            case 234 -> lIl(1023938290, var9 ^ -695023592);
            case 235 -> lIl(1023938291, var9 ^ -1887573984);
            case 236 -> lIl(1023938292, var9 ^ -970770407);
            case 237 -> 5;
            case 238 -> lIl(1023938293, var9 ^ -2081781116);
            case 239 -> lIl(1023938294, var9 ^ -421014809);
            case 240 -> lIl(1023938295, var9 ^ -731916272);
            case 241 -> lIl(1023938280, var9 ^ -160135846);
            case 242 -> lIl(1023938281, var9 ^ -917665709);
            case 243 -> lIl(1023938282, var9 ^ 2035203505);
            case 244 -> lIl(1023938283, var9 ^ 412148466);
            case 245 -> lIl(1023938284, var9 ^ 1415466195);
            case 246 -> lIl(1023938285, var9 ^ 1339697190);
            case 247 -> lIl(1023938286, var9 ^ 616269598);
            case 248 -> 2;
            case 249 -> lIl(1023938287, var9 ^ -745892108);
            case 250 -> lIl(1023938272, var9 ^ 47442109);
            case 251 -> lIl(1023938273, var9 ^ -1507229779);
            case 252 -> 0;
            case 253 -> lIl(1023938274, var9 ^ 1044609726);
            case 254 -> lIl(1023938275, var9 ^ -815325906);
            default -> lIl(1023938276, var9 ^ 797864143);
         };
         int var5 = (var1 & lIl(1023938277, var9 ^ -1551653965)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIl(1023938278, var9 ^ -2031229054)) >>> lIl(1023938279, var9 ^ -198790197)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIl(1023938328, var9 ^ 712174749);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIl(1023938329, var9 ^ 598495665);
            }
         }

         l[var2] = new String(var3).intern();
      }

      return l[var2];
   }

   private static String llI(int var0, int var1, int var2, int var3, char var4, char var5) {
      int var10 = var1 ^ -1019993348;
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
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 28493;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ var8 ^ switch (var8 % 9) {
            default -> 164;
            case 1 -> 183;
            case 2 -> 90;
            case 3 -> 35;
            case 4 -> 231;
            case 5 -> 29;
            case 6 -> 51;
            case 7 -> 153;
            case 8 -> 77;
         } ^ var7 ^ var1 ^ var5 ^ var4 ^ var0 ^ var3 ^ var2);
      }

      return new String(var9).intern();
   }

   private boolean Il(class_2596<?> var1) {
      String var2 = var1.getClass().getName();
      return !var2.contains(IlIIllIII.lI(ll[1])) ? false : !var2.endsWith(IlIIllIII.lI(ll[0])) && !var2.endsWith(IlIIllIII.lI(ll[2]));
   }

   public void lI(class_2596<?> var1) {
      long var2 = System.currentTimeMillis();
      this.II = var2;
      if (this.lI == 0L) {
         this.lI = var2;
      }

      if (this.Il(var1)) {
         this.III = var2;
      }
   }

   public void ll() {
      long var1 = System.currentTimeMillis();
      this.lI = var1;
      this.II = var1;
      this.III = var1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -677442062;
      int var17 = 0;
      int var14 = "N攙ꔱ츳䏐踍箩䕡곅䀏\uf603潘莀䃀≀Ꟊ橗⠠ᜩ칣ꇳറ렺鉌컍ﯻ\udf0d霰輊⟙棧\uea94⹐꤫㠈\ueee4旷鬸촰\ue8dd᧮ὶ蹧ꬓ\uef8a◽薌\uf7dd쁻蕬騋넹灵䘟҅媱ப忻㎃콽穑\ude5e\ue4dc箖\ue2d2\u2d7c䳯몹璊㶢೯溼\uf460⁼뿬쩾づ\ud899脈"
         .length();
      short var18 = 17375;
      int var16 = 0;
      String[] var15 = new String[1];
      String var13 = "N攙ꔱ츳䏐踍箩䕡곅䀏\uf603潘莀䃀≀Ꟊ橗⠠ᜩ칣ꇳറ렺鉌컍ﯻ\udf0d霰輊⟙棧\uea94⹐꤫㠈\ueee4旷鬸촰\ue8dd᧮ὶ蹧ꬓ\uef8a◽薌\uf7dd쁻蕬騋넹灵䘟҅媱ப忻㎃콽穑\ude5e\ue4dc箖\ue2d2\u2d7c䳯몹璊㶢೯溼\uf460⁼뿬쩾づ\ud899脈";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
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
      int var9 = -1034054705;
      byte[] var7 = "\u0098G.\r³L\u0086/\b\u001fÄy\u0095()ÇËñ*\u0093OR}'q6Ü}-\t\u0094yVüSUÐ\u0094¯\f\u0010%Fª\u0097Ú4Ó¦S \u0082·óè\u0084ïh\u0082¬\u0096Qß\u008eð\u0099O.íé^\u0016\u0086MeÊÌüµZ·ç\u000bÙ\n\u0086- ßxðñùrS\u0089\u001c³õû&\u007f7ÞM\u0090ï\u00adní\u008erÁZ:\u0014Gÿ5\u009a¥-\u0004.\u008e\u0085KxTÎWæ\u0016æùH \"þZöÅ\u009aÍ=#É\u008a\u001a\u0098íS\fE5\u001bÎà\u009d\u0002úC\u001f\u001c©\u0089\f\u0019þ\u001ajK\u007f\b,\r*QÝå\u0096´4øª¡\b2\u0097M¥d\u001e\u001eN9u\u0010\u00ad\u001eª±\u008d½S5äEð:\u008ct\u0017N\u0000X\u0081Fûæ8:{\u008eK¼1Ía: \u0004~\r\u0098\u0011\u000fr\u0012H)\u0082½{óY.\u0083û\u0011\u0011i_\r8ì\u009bJ\u008a\u009aýÍ\u0002\u0012»¤u\u0092Ð\u0091Íãh\u001fÝ6béÓ@@l-~ACQ\u008e¡»®b\u0007íg\u0001\u0098\u0000µøB,nãV±'\u008fpç& \u0002ðÊïâëC²|s\u009e\b¢\u008bäñi1g\u000e\n\u0095§×jd}\u0095\u0082MUp\u008dW¹©\u008cÙòè\u0093Î\u001a7w\u007f\u009b³óD\u0003ÝÍ¨ß&Ú\u0012\nG_\u0003Ñ²\u0081¦¾èÐ3\u008c\u0089g\u008fÆw;Çv\u0098ÌùÐÅOd¨\u000e\u009aÌ*s0\u0088lõ\r8e´za\u001a\u008d;á\u001a©4M\u0090\u001b\u0082¹\u009dªä¥\u0012°²Ñ3Ï¥éôøAH¼ÚªEý§ Äü·Ù\"å¯ræ³Ñ<Æ\u0013[×k\u0099±è-Þ#Ú]\\§\u0006ÙÁr\u0016?ÃÝ¯¯\u0097°â4\u0001P\u0090c%MÍ0çx¡øD[¯ÁÔ\u0016\\Ç|> \u0097¨\u001fDõ÷î\u000e~\b\u0091G\u0011^\u0093³\u0087]#5ÅÐ]¹w4¹ÌY³PEg\u007fÌ\u0099\u0013XÑT'nPHç\u0084\u0087\\&\u0004\u0098'&pÊ\u001cÍ\u001c\u0084êíý\u0097\u0004 ÂuÆçEì\u000fÙ\u008ddØîç°|%r4~qT\u0012¬©ëv\u0088¼8Ä\u009bxèi\u0081\u0097JÔt\u008b\u0017Z©\u0014C±Ðü)\u009dÕ4yG|\u0094ÀìÝÞÅp@\u001f\u0013\u0090ÔA\u0002ïwê÷\u0090\u008aÛ\u000b\u0002±Xt&\u0098ä'\u0086æ;\b\u001d\u009f\tÛ\u008bw\bWàZ4]\"+h\u009dT\u0098\rß4C[Äz\u0089Õ~ç\u0081õH¦,\u009cU>WÌ~îN½¸þ\u0085dnÖcÕ\u0017ÉS\u0093\u0005¤ðwVBjñÇ\u00146µ![^cE\u0095ÜoÕQ!\u0000\u0007G\u0094AÉ\u0084ÚÔxÈ\u0003ñ°Pò òH\u0016PÔÔU¢àê\u0089\u0011U\u00179ø\u0087\u0006YÒ´+\u009c\u001c3JÖÀÍ\u0006Åb1tArRz\u0099Ê\u0091+Ð\u0012òC%7R(:µa\u008eû¡*m#!u¤º\u0090=y\u000föO\u008fHmF\u0012ÕÎ\u0016\u008eàò\u0095\u001fÈÂ}Ûiê\u0086IÌ\tÞsL\u000eä³j\u009d|æ¥®n\"-ÿî\u001br¸é\u0099\u008fÓ¿òi\u0010]o±¢3cÖ8¦oðê{ÊÂ³&r\u0086±aÑ\u0015¦÷V;*\u0004ïÿ\u009fö\u001937K\u0019Âåm\u0090BIb\u0006WêôÏ\u0082ì5\u0096Mïx0\u0014\u0000_\u0016]^\u0088\u0091\u0018\u0097:Ó}\u009aeÑO\"oMm\t5,R0?Tâ3\n¬\u0083íUèÏ#û¾Ô§\u0098\u001f¿Æ7\u0098H÷&\u001a\u0099®_\u00ad=TÈç¥>Ë\u0004T\u001aªq´óÇÊ8þ\u0013\u0086âo\u000e´o[\u0003G±\u000f]U¸ÑàxÕZy#\u0017¾uÅ\u009fs3¶òã\"Æº\u0084DÍÒjRvtf\u001aÑ BÈ5\u0013\u001f\u0019Z?YZ\u001d\u0000ÚÔd/Ù ª\u00963\u0081{\u0003 \u008fá\u0004Ùu|H\u0085ªòÀc©w\u0097*¨E¼Î\u008fí\u008eÇ]\u008d²,Ë\u009a"
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

      String[] var5 = new String[3];
      int var3 = 0;
      String var2;
      int var4 = (var2 = llI(-1476038256, -1019993348, -1277533122, 1943887166, 23093, (char)'鿛')).length();
      int var1 = lIl(1023938325, var23 ^ -118717945);
      int var0 = -1;

      while (true) {
         char[] var10002;
         label71: {
            int var10000 = lIl(1023938326, var23 ^ 1090920977);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var31 = var10000;
            var10002 = var10003;
            int var26 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            } else {
               var31 = var10000;
               var26 = var10004;
               if (var10004 <= var6) {
                  break label71;
               }

               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % lIl(1023938327, var23 ^ -736809559)) {
                  case 0 -> lIl(1023938312, var23 ^ -739453328);
                  case 1 -> lIl(1023938313, var23 ^ -1615853396);
                  case 2 -> lIl(1023938314, var23 ^ 391514997);
                  case 3 -> lIl(1023938315, var23 ^ 1075776044);
                  case 4 -> lIl(1023938316, var23 ^ 1811623156);
                  case 5 -> lIl(1023938317, var23 ^ 1509097425);
                  default -> lIl(1023938318, var23 ^ 1696164278);
               });
               var6++;
               if (var31 == 0) {
                  var10006 = var31;
                  var10005 = var10002;
                  var10004 = var31;
               } else {
                  if (var26 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var31;
                  var10006 = var6;
               }
            }
         }

         String var33 = new String(var10002).intern();
         byte var28 = -1;
         var5[var3++] = var33;
         if ((var0 += var1) >= var4) {
            Il = var5;
            l = new String[3];
            ll = new String[3];
            IlI();
            I = new IIlllI();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public long III() {
      return this.III;
   }

   public void IIl() {
      this.lI = 0L;
      this.II = 0L;
      this.III = 0L;
   }

   private static void IlI() {
      int var0 = 394250722;
      ll[0] = lII(II(lIl(1023938330, var0 ^ -1030853675), lIl(1023938331, var0 ^ 6999264)).toCharArray(), 98688L, lIl(1023938332, var0 ^ 1083096124));
      ll[1] = lII(II(lIl(1023938333, var0 ^ -449368000), lIl(1023938334, var0 ^ -1387261120)).toCharArray(), 92728L, lIl(1023938335, var0 ^ -1843652234));
      ll[2] = lII(II(lIl(1023938320, var0 ^ 1672611880), lIl(1023938321, var0 ^ 932543544)).toCharArray(), 30372L, lIl(1023938322, var0 ^ -987117375));
   }

   public static IIlllI Ill() {
      return I;
   }

   private static String lII(char[] var0, long var1, int var3) {
      int var4 = lIl(1023938323, 1740302287 ^ 984607040) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIl(1023938324, 1740302287 ^ 1741331642);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
