package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class lIIIIIII extends IlIIIIIIl {
   private final IIlIII I;
   private final IIlIII II;
   private static final int[] IIlI;
   private final IIlIII Il;
   private final IIlIII lI;
   private final IIlIII ll;
   private static final float III = 0.01F;
   private final IIlIII IIl;
   private static String[] IlI;
   private final lllIIlII Ill;
   private static final Object[] IlII;
   private final IIlIII lII;
   private static final String[] IIll;
   private final IllIII<IllIIIl> lIl;
   private static final String[] llI;
   private static final double lll = 8.0;
   private volatile float IIII;
   private static final String[] IIIl;

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null) {
         this.IIl(this.III(var1));
      } else {
         this.IIl(1.0F);
      }
   }

   private boolean I(class_1309 var1, IllIIIl var2) {
      boolean var3 = var1 instanceof class_1657;
      return var2 == k74.x.IllIIIl.ll || var2 == k74.x.IllIIIl.III && var3 || var2 == k74.x.IllIIIl.I && !var3;
   }

   public boolean l() {
      return this.IIIIlIl() && Math.abs(this.IIII - 1.0F) > 0.01F;
   }

   private static String II(char[] var0, long var1, int var3) {
      int var4 = lll(-1601562269, -1523595903 ^ -2009915317) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lll(-1601562272, -1523595903 ^ -442100851);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static int lll(int var0, int var1) {
      int var2 = IIlI[var0 ^ -1601562258] ^ var1 ^ var0;
      var2 ^= 46852;
      var2 ^= 3310;
      var2 += 20634;
      var2 -= 52949;
      var2 ^= 11358;
      var2 ^= 57685;
      var2 += 5361;
      return var2 ^ 44148;
   }

   private static String Il(int var0, int var1) {
      int var9 = -1512095904;
      int var2 = (var0 ^ lll(-1601562271, var9 ^ 1847176260)) & lll(-1601562242, var9 ^ 1174766193);
      if (IIIl[var2] == null) {
         char[] var3 = llI[var2].toCharArray();

         int var4 = switch (var3[0] & lll(-1601562241, var9 ^ -224539387)) {
            case 0 -> lll(-1601562244, var9 ^ 334598891);
            case 1 -> lll(-1601562243, var9 ^ 10053135);
            case 2 -> lll(-1601562246, var9 ^ -91856522);
            case 3 -> lll(-1601562245, var9 ^ 538233449);
            case 4 -> lll(-1601562248, var9 ^ 1421815735);
            case 5 -> lll(-1601562247, var9 ^ 1553081688);
            case 6 -> lll(-1601562250, var9 ^ -1965177847);
            case 7 -> lll(-1601562249, var9 ^ 716797749);
            case 8 -> lll(-1601562252, var9 ^ 1641634660);
            case 9 -> lll(-1601562251, var9 ^ 806267938);
            case 10 -> lll(-1601562254, var9 ^ 1201381986);
            case 11 -> lll(-1601562253, var9 ^ -407495569);
            case 12 -> lll(-1601562256, var9 ^ 1618417620);
            case 13 -> lll(-1601562255, var9 ^ -1049063335);
            case 14 -> lll(-1601562290, var9 ^ -1111572420);
            case 15 -> lll(-1601562289, var9 ^ 1152683574);
            case 16 -> lll(-1601562292, var9 ^ 1344075817);
            case 17 -> lll(-1601562291, var9 ^ -34049240);
            case 18 -> lll(-1601562294, var9 ^ -324631352);
            case 19 -> lll(-1601562293, var9 ^ -326592305);
            case 20 -> lll(-1601562296, var9 ^ 90617732);
            case 21 -> lll(-1601562295, var9 ^ -367421789);
            case 22 -> lll(-1601562298, var9 ^ 941377364);
            case 23 -> lll(-1601562297, var9 ^ -1280419662);
            case 24 -> lll(-1601562300, var9 ^ 542588309);
            case 25 -> lll(-1601562299, var9 ^ -1841403429);
            case 26 -> lll(-1601562302, var9 ^ -3161344);
            case 27 -> lll(-1601562301, var9 ^ -397450015);
            case 28 -> lll(-1601562304, var9 ^ -1456418593);
            case 29 -> lll(-1601562303, var9 ^ 154229743);
            case 30 -> 2;
            case 31 -> lll(-1601562274, var9 ^ -904645652);
            case 32 -> lll(-1601562273, var9 ^ -2012518978);
            case 33 -> lll(-1601562276, var9 ^ 1313843146);
            case 34 -> lll(-1601562275, var9 ^ 609767189);
            case 35 -> lll(-1601562278, var9 ^ -296651474);
            case 36 -> lll(-1601562277, var9 ^ 600564044);
            case 37 -> lll(-1601562280, var9 ^ -1115659725);
            case 38 -> lll(-1601562279, var9 ^ -1713654795);
            case 39 -> lll(-1601562282, var9 ^ 1273930748);
            case 40 -> lll(-1601562281, var9 ^ -1582081147);
            case 41 -> 5;
            case 42 -> lll(-1601562284, var9 ^ -2092575854);
            case 43 -> lll(-1601562283, var9 ^ 219629182);
            case 44 -> lll(-1601562286, var9 ^ -819051591);
            case 45 -> lll(-1601562285, var9 ^ 249191234);
            case 46 -> lll(-1601562288, var9 ^ -1852571246);
            case 47 -> lll(-1601562287, var9 ^ -1201287990);
            case 48 -> lll(-1601562322, var9 ^ -1746105288);
            case 49 -> lll(-1601562321, var9 ^ -1754577166);
            case 50 -> lll(-1601562324, var9 ^ -1152345135);
            case 51 -> lll(-1601562323, var9 ^ 861000830);
            case 52 -> lll(-1601562326, var9 ^ 1018108296);
            case 53 -> lll(-1601562325, var9 ^ 1276277066);
            case 54 -> lll(-1601562328, var9 ^ 1022913232);
            case 55 -> lll(-1601562327, var9 ^ -1368429508);
            case 56 -> lll(-1601562330, var9 ^ 283161586);
            case 57 -> lll(-1601562329, var9 ^ 2008951876);
            case 58 -> lll(-1601562332, var9 ^ 991100542);
            case 59 -> lll(-1601562331, var9 ^ -844528562);
            case 60 -> lll(-1601562334, var9 ^ 476798001);
            case 61 -> lll(-1601562333, var9 ^ 493855544);
            case 62 -> lll(-1601562336, var9 ^ 564255373);
            case 63 -> lll(-1601562335, var9 ^ -401012125);
            case 64 -> lll(-1601562306, var9 ^ -1883155735);
            case 65 -> lll(-1601562305, var9 ^ -636937709);
            case 66 -> lll(-1601562308, var9 ^ 1614469321);
            case 67 -> lll(-1601562307, var9 ^ 2106308786);
            case 68 -> lll(-1601562310, var9 ^ -251016254);
            case 69 -> lll(-1601562309, var9 ^ -1449469502);
            case 70 -> lll(-1601562312, var9 ^ -1001291398);
            case 71 -> lll(-1601562311, var9 ^ -291225442);
            case 72 -> lll(-1601562314, var9 ^ -13622523);
            case 73 -> lll(-1601562313, var9 ^ -895952427);
            case 74 -> lll(-1601562316, var9 ^ 1107611036);
            case 75 -> lll(-1601562315, var9 ^ -1782583141);
            case 76 -> lll(-1601562318, var9 ^ 99546243);
            case 77 -> lll(-1601562317, var9 ^ 128445060);
            case 78 -> lll(-1601562320, var9 ^ 2001619601);
            case 79 -> lll(-1601562319, var9 ^ 1610302332);
            case 80 -> lll(-1601562354, var9 ^ 2102928118);
            case 81 -> lll(-1601562353, var9 ^ 48955442);
            case 82 -> lll(-1601562356, var9 ^ 1535108895);
            case 83 -> lll(-1601562355, var9 ^ -746540572);
            case 84 -> lll(-1601562358, var9 ^ 1906800248);
            case 85 -> lll(-1601562357, var9 ^ -2104380095);
            case 86 -> lll(-1601562360, var9 ^ 1496559518);
            case 87 -> lll(-1601562359, var9 ^ -594768191);
            case 88 -> lll(-1601562362, var9 ^ -1345617036);
            case 89 -> lll(-1601562361, var9 ^ 249932932);
            case 90 -> lll(-1601562364, var9 ^ -953393996);
            case 91 -> lll(-1601562363, var9 ^ -731827010);
            case 92 -> lll(-1601562366, var9 ^ 2145780057);
            case 93 -> lll(-1601562365, var9 ^ 310398519);
            case 94 -> lll(-1601562368, var9 ^ -1756646619);
            case 95 -> lll(-1601562367, var9 ^ 1348183971);
            case 96 -> lll(-1601562338, var9 ^ 1436126098);
            case 97 -> lll(-1601562337, var9 ^ -229396187);
            case 98 -> 0;
            case 99 -> lll(-1601562340, var9 ^ -1818716379);
            case 100 -> lll(-1601562339, var9 ^ -1473935954);
            case 101 -> lll(-1601562342, var9 ^ -939355330);
            case 102 -> lll(-1601562341, var9 ^ 505435293);
            case 103 -> lll(-1601562344, var9 ^ 1922581997);
            case 104 -> lll(-1601562343, var9 ^ -1922960456);
            case 105 -> 1;
            case 106 -> lll(-1601562346, var9 ^ -565746497);
            case 107 -> lll(-1601562345, var9 ^ -1888904619);
            case 108 -> lll(-1601562348, var9 ^ 1234241929);
            case 109 -> lll(-1601562347, var9 ^ 1343435603);
            case 110 -> lll(-1601562350, var9 ^ -1821085853);
            case 111 -> lll(-1601562349, var9 ^ -401496301);
            case 112 -> 4;
            case 113 -> lll(-1601562352, var9 ^ 920372801);
            case 114 -> lll(-1601562351, var9 ^ 655402077);
            case 115 -> lll(-1601562130, var9 ^ -699022147);
            case 116 -> lll(-1601562129, var9 ^ -2006842407);
            case 117 -> lll(-1601562132, var9 ^ 10121362);
            case 118 -> lll(-1601562131, var9 ^ 21196294);
            case 119 -> lll(-1601562134, var9 ^ -579286395);
            case 120 -> lll(-1601562133, var9 ^ -986891896);
            case 121 -> lll(-1601562136, var9 ^ -1154897126);
            case 122 -> lll(-1601562135, var9 ^ 782258512);
            case 123 -> lll(-1601562138, var9 ^ 900507658);
            case 124 -> lll(-1601562137, var9 ^ -1724919190);
            case 125 -> lll(-1601562140, var9 ^ -739924133);
            case 126 -> lll(-1601562139, var9 ^ -1876370442);
            case 127 -> lll(-1601562142, var9 ^ -2135776782);
            case 128 -> lll(-1601562141, var9 ^ -1296998710);
            case 129 -> lll(-1601562144, var9 ^ -1870790767);
            case 130 -> lll(-1601562143, var9 ^ -1319939794);
            case 131 -> lll(-1601562114, var9 ^ -2087293502);
            case 132 -> lll(-1601562113, var9 ^ 896896910);
            case 133 -> lll(-1601562116, var9 ^ 708935585);
            case 134 -> lll(-1601562115, var9 ^ 1775953535);
            case 135 -> lll(-1601562118, var9 ^ 1344327649);
            case 136 -> lll(-1601562117, var9 ^ 939890403);
            case 137 -> lll(-1601562120, var9 ^ 370266691);
            case 138 -> lll(-1601562119, var9 ^ -570835748);
            case 139 -> lll(-1601562122, var9 ^ 1705404292);
            case 140 -> lll(-1601562121, var9 ^ -781412405);
            case 141 -> lll(-1601562124, var9 ^ 1117461486);
            case 142 -> lll(-1601562123, var9 ^ -1361467472);
            case 143 -> lll(-1601562126, var9 ^ 1015859129);
            case 144 -> lll(-1601562125, var9 ^ 410396121);
            case 145 -> lll(-1601562128, var9 ^ 715588002);
            case 146 -> lll(-1601562127, var9 ^ 1183354717);
            case 147 -> lll(-1601562162, var9 ^ -455771408);
            case 148 -> lll(-1601562161, var9 ^ 46535831);
            case 149 -> lll(-1601562164, var9 ^ 1815470917);
            case 150 -> lll(-1601562163, var9 ^ -1653827308);
            case 151 -> lll(-1601562166, var9 ^ -1657110850);
            case 152 -> lll(-1601562165, var9 ^ -1004508087);
            case 153 -> lll(-1601562168, var9 ^ 1182434594);
            case 154 -> lll(-1601562167, var9 ^ 2070985517);
            case 155 -> lll(-1601562170, var9 ^ 1558293533);
            case 156 -> lll(-1601562169, var9 ^ 1800213487);
            case 157 -> lll(-1601562172, var9 ^ 888420133);
            case 158 -> lll(-1601562171, var9 ^ -1248199435);
            case 159 -> lll(-1601562174, var9 ^ 1684842624);
            case 160 -> lll(-1601562173, var9 ^ -549052972);
            case 161 -> lll(-1601562176, var9 ^ 1088822921);
            case 162 -> lll(-1601562175, var9 ^ 1570538332);
            case 163 -> lll(-1601562146, var9 ^ -1653993402);
            case 164 -> lll(-1601562145, var9 ^ 41172351);
            case 165 -> lll(-1601562148, var9 ^ -1198171786);
            case 166 -> lll(-1601562147, var9 ^ -545545291);
            case 167 -> lll(-1601562150, var9 ^ 1308969238);
            case 168 -> lll(-1601562149, var9 ^ -906565186);
            case 169 -> lll(-1601562152, var9 ^ 838081073);
            case 170 -> lll(-1601562151, var9 ^ -564423628);
            case 171 -> lll(-1601562154, var9 ^ 26463102);
            case 172 -> lll(-1601562153, var9 ^ 1046376912);
            case 173 -> lll(-1601562156, var9 ^ 1450094016);
            case 174 -> lll(-1601562155, var9 ^ 918639581);
            case 175 -> lll(-1601562158, var9 ^ 982827059);
            case 176 -> lll(-1601562157, var9 ^ 273161365);
            case 177 -> lll(-1601562160, var9 ^ 81425506);
            case 178 -> lll(-1601562159, var9 ^ -425189454);
            case 179 -> lll(-1601562194, var9 ^ 759288618);
            case 180 -> lll(-1601562193, var9 ^ 1091317219);
            case 181 -> lll(-1601562196, var9 ^ 252135687);
            case 182 -> lll(-1601562195, var9 ^ 779317373);
            case 183 -> lll(-1601562198, var9 ^ -1626666339);
            case 184 -> lll(-1601562197, var9 ^ -15540906);
            case 185 -> lll(-1601562200, var9 ^ 2121748556);
            case 186 -> lll(-1601562199, var9 ^ 1599062893);
            case 187 -> lll(-1601562202, var9 ^ -756485182);
            case 188 -> lll(-1601562201, var9 ^ 757478086);
            case 189 -> lll(-1601562204, var9 ^ 1614126282);
            case 190 -> lll(-1601562203, var9 ^ 1369947808);
            case 191 -> lll(-1601562206, var9 ^ 1676390243);
            case 192 -> lll(-1601562205, var9 ^ -1531795438);
            case 193 -> lll(-1601562208, var9 ^ 744813161);
            case 194 -> lll(-1601562207, var9 ^ 473776449);
            case 195 -> lll(-1601562178, var9 ^ -1066807471);
            case 196 -> lll(-1601562177, var9 ^ 1184415769);
            case 197 -> lll(-1601562180, var9 ^ 1626084211);
            case 198 -> lll(-1601562179, var9 ^ -1908127468);
            case 199 -> lll(-1601562182, var9 ^ 1346585757);
            case 200 -> lll(-1601562181, var9 ^ 748696648);
            case 201 -> lll(-1601562184, var9 ^ -297296896);
            case 202 -> lll(-1601562183, var9 ^ -493341762);
            case 203 -> lll(-1601562186, var9 ^ -1931011508);
            case 204 -> lll(-1601562185, var9 ^ 1311849937);
            case 205 -> lll(-1601562188, var9 ^ -151120083);
            case 206 -> lll(-1601562187, var9 ^ -756325999);
            case 207 -> lll(-1601562190, var9 ^ 214200788);
            case 208 -> lll(-1601562189, var9 ^ 659238524);
            case 209 -> lll(-1601562192, var9 ^ -1197452030);
            case 210 -> lll(-1601562191, var9 ^ 605395234);
            case 211 -> lll(-1601562226, var9 ^ 1059047941);
            case 212 -> lll(-1601562225, var9 ^ -1007538522);
            case 213 -> lll(-1601562228, var9 ^ -1426346361);
            case 214 -> 3;
            case 215 -> lll(-1601562227, var9 ^ -833869523);
            case 216 -> lll(-1601562230, var9 ^ 2103578729);
            case 217 -> lll(-1601562229, var9 ^ 1081349779);
            case 218 -> lll(-1601562232, var9 ^ 2002169890);
            case 219 -> lll(-1601562231, var9 ^ -427510251);
            case 220 -> lll(-1601562234, var9 ^ 1387481496);
            case 221 -> lll(-1601562233, var9 ^ 593055344);
            case 222 -> lll(-1601562236, var9 ^ -2003621264);
            case 223 -> lll(-1601562235, var9 ^ -1862144738);
            case 224 -> lll(-1601562238, var9 ^ -1731133081);
            case 225 -> lll(-1601562237, var9 ^ -1374909949);
            case 226 -> lll(-1601562240, var9 ^ 766096497);
            case 227 -> lll(-1601562239, var9 ^ 851486983);
            case 228 -> lll(-1601562210, var9 ^ -1465866488);
            case 229 -> lll(-1601562209, var9 ^ -1112643903);
            case 230 -> lll(-1601562212, var9 ^ 1070988693);
            case 231 -> lll(-1601562211, var9 ^ 1359597168);
            case 232 -> lll(-1601562214, var9 ^ -1045529346);
            case 233 -> lll(-1601562213, var9 ^ 479447171);
            case 234 -> lll(-1601562216, var9 ^ 895235290);
            case 235 -> lll(-1601562215, var9 ^ -2006183502);
            case 236 -> lll(-1601562218, var9 ^ -1666615307);
            case 237 -> lll(-1601562217, var9 ^ 436575086);
            case 238 -> lll(-1601562220, var9 ^ 525139293);
            case 239 -> lll(-1601562219, var9 ^ -954371489);
            case 240 -> lll(-1601562222, var9 ^ -1864590609);
            case 241 -> lll(-1601562221, var9 ^ 1117616544);
            case 242 -> lll(-1601562224, var9 ^ 1343732214);
            case 243 -> lll(-1601562223, var9 ^ -1238672856);
            case 244 -> lll(-1601562514, var9 ^ 502463095);
            case 245 -> lll(-1601562513, var9 ^ 436806336);
            case 246 -> lll(-1601562516, var9 ^ -6715142);
            case 247 -> lll(-1601562515, var9 ^ -979593462);
            case 248 -> lll(-1601562518, var9 ^ 1811466504);
            case 249 -> lll(-1601562517, var9 ^ -1326306733);
            case 250 -> lll(-1601562520, var9 ^ -328539544);
            case 251 -> lll(-1601562519, var9 ^ 1299913702);
            case 252 -> lll(-1601562522, var9 ^ -898484976);
            case 253 -> lll(-1601562521, var9 ^ 2107520872);
            case 254 -> lll(-1601562524, var9 ^ -1127207081);
            default -> lll(-1601562523, var9 ^ -1702694591);
         };
         int var5 = (var1 & lll(-1601562526, var9 ^ 644104848)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lll(-1601562525, var9 ^ -305087592)) >>> lll(-1601562528, var9 ^ -96499167)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lll(-1601562527, var9 ^ -1260259725);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lll(-1601562498, var9 ^ 160937245);
            }
         }

         IIIl[var2] = new String(var3).intern();
      }

      return IIIl[var2];
   }

   public lIIIIIII() {
      int var1 = 1338963769;
      super(IlIIllIII.Ill(IlI[0]), lllIIlIl.I, IlIIllIII.Ill(IlI[lll(-1601562497, var1 ^ -980144311)]));
      this.lIl = this.IllIIll(new IllIII<>(IlIIllIII.Ill(IlI[lll(-1601562500, var1 ^ -1265731254)]), IllIIIl.class, k74.x.IllIIIl.III));
      this.IIl = this.IllIIll(new IIlIII(IlIIllIII.Ill(IlI[1]), 8.0, 2.0, 12.0, 0.25).IlII(IlIIllIII.lI(IlI[2])));
      this.I = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IlI[lll(-1601562499, var1 ^ 671042258)]), 9.0, 1.0, 35.0, 0.5).IlII(IlIIllIII.lI(IlI[lll(-1601562502, var1 ^ -1122697271)]))
      );
      this.Il = this.IllIIll(new IIlIII(IlIIllIII.Ill(IlI[3]), 0.55, 0.1, 1.0, 0.05));
      this.ll = this.IllIIll(new IIlIII(IlIIllIII.Ill(IlI[5]), 1.08, 0.5, 1.5, 0.05));
      this.lII = this.IllIIll(new IIlIII(IlIIllIII.Ill(IlI[lll(-1601562501, var1 ^ -375668721)]), 1.0, 0.5, 1.5, 0.05));
      this.lI = this.IllIIll(new IIlIII(IlIIllIII.Ill(IlI[lll(-1601562504, var1 ^ 683474263)]), 0.05, 0.0, 0.5, 0.01).IlII(IlIIllIII.lI(IlI[2])));
      this.II = this.IllIIll(new IIlIII(IlIIllIII.Ill(IlI[lll(-1601562503, var1 ^ -1892865418)]), 0.22, 0.05, 0.6, 0.01));
      this.Ill = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IlI[4]), true));
      this.IIII = 1.0F;
   }

   public float lI() {
      return this.IIIIlIl() ? this.IIII : 1.0F;
   }

   private static String IIII(char var0, char var1, int var2) {
      int var3 = var0 ^ '铛';
      char[] var4 = IIll[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlII[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlII[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 19093;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\ueaea';
         var10 += 48671;
         var10 += 8409;
         var10 -= 49968;
         var10 += 9741;
         var10 -= 35462;
         var10 -= 196;
         var10 += 51855;
         var10 -= 5510;
         var10 -= 58554;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private double ll(class_243 var1, class_243 var2, class_238 var3) {
      class_243 var4 = var3.method_1005();
      class_243 var5 = new class_243(var4.field_1352, var3.field_1322 + (var3.field_1325 - var3.field_1322) * 0.72, var4.field_1350);
      class_243 var6 = new class_243(var4.field_1352, var3.field_1322 + (var3.field_1325 - var3.field_1322) * 0.38, var4.field_1350);
      return Math.min(this.lIl(var2, var4.method_1020(var1)), Math.min(this.lIl(var2, var5.method_1020(var1)), this.lIl(var2, var6.method_1020(var1))));
   }

   @Override
   public void llIl() {
      this.IIII = 1.0F;
   }

   private float III(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (!this.Ill(var1)) {
         return this.lII.IllI().floatValue();
      } else {
         class_243 var3 = var1.field_1724.method_33571();
         class_243 var4 = var1.field_1724.method_5828(1.0F).method_1029();
         double var5 = Math.max(0.1, this.IIl.IllI());
         class_243 var7 = var3.method_1019(var4.method_1021(var5));
         IllIIIl var8 = this.lIl.IllI();
         double var9 = Math.max(0.0, this.lI.IllI());
         double var11 = Math.max(0.1, this.I.IllI());
         double var13 = 0.0;

         for (class_1297 var16 : var1.field_1687.method_18112()) {
            if (var16 instanceof class_1309 var17
               && var17 != var1.field_1724
               && var17.method_5805()
               && !var17.method_31481()
               && this.I(var17, var8)
               && !(var1.field_1724.method_5858(var17) > var5 * var5)) {
               class_238 var18 = var17.method_5829().method_1014(var9);
               if (var18.method_992(var3, var7).isPresent()) {
                  return this.ll.IllI().floatValue();
               }

               double var19 = this.ll(var3, var4, var18);
               if (var19 <= var11) {
                  double var21 = 1.0 - var19 / var11;
                  var13 = Math.max(var13, this.lII(var21));
               }

               if (var2 != null) {
                  break;
               }
            }
         }

         float var23 = this.lII.IllI().floatValue();
         if (var13 <= 0.0) {
            return var23;
         } else {
            float var24 = this.Il.IllI().floatValue();
            return (float)class_3532.method_16436(var13, var23, var24);
         }
      }
   }

   private void IIl(float var1) {
      float var2 = class_3532.method_15363(this.II.IllI().floatValue(), 0.01F, 1.0F);
      this.IIII = class_3532.method_16439(var2, this.IIII, var1);
      if (Math.abs(this.IIII - var1) < 0.001F) {
         this.IIII = var1;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 561703789;
      int var10001 = "Ē\udec9\uf68d͘\ue05c˸鐸摍\uf116⧂㯏ྃ䭓輭蓩꽴홚Ƕҋჩ托\ue705㮄챑⚑뎕粍ഊᒭ⛗\u0984⡦\uf7ba鞕褃\uda5a릧口옍ꁇ\uf314\ue0a0幱㝠竺穹嬊쇈⢘ٶ\ueedf酭ꩋ淇⩧\uefeb㲉\uf1cf崳\ue705㞖㪬뀸Ꝺ\u070e厦诸蜽鉷\udff8ꢬ嶁ॹ\ua636냫铲᯲\ue5ef찏꾛幬\uf429뿡隢ᚹ\ue6c5ᵧㅉ\udfd3徊幷\uf73a毮덅\uf7d9젛䴊皃珺㲯ꡃ\uf5f1\uf470㘷뢼扸틣瞝둴ả记댆\u173e셞ⴍ\ue775㏤쾹㳝殤ṭ࡚틖蛇Ṇ퉊ⶋ筤鱮勰疝㯯彬吼ퟔ⬷㙍䣯إ蒾幱\ud98c컇뵆ᦄ\u001b\uf7cc㑇\uf602㍌丽\udc64歀갆쵢䗓絒\ue675踘㊷턥뱁櫣\uab6e\ue551\udc8bﾂ擞歩爟⑶ꋱ袿針編惿뵓㥶뜉잡\ud8ef\uf3c3\ue1ac嘙\ueb3d⦐㠱蓘ᔮ貰봌䦡‾ക닫㍋\ue21d摺㱠宒侃ꃴ୴柏\uefe4儵ቦ\ue998侑洍\uf360胋㴅䊉\ue0ae懙折\udcef部݄ჺ\ue73e℧\uf321씟ꠦ벌㐓\u086c鱁팇ᘣ렍\uf4a2㒁ᐽᣗᰘ洰㫙덀圇䃴綔嚗陹并䨈䏯\uf4eaⴑ钶걙耴㊓ꈯ툃炲몦ꖪ㦅䦧戟찲䥉ⴖ厮⣄욅ㆹ\uec86ណ닾잷ᖂ!構ꋲ\uedc4㥊\uf8b2ㅗ냗ਗ਼虳䚞豠째拣컜錐㺯⨋硇嶬ﳼ뤗鎌믨ႂŤ곦〉亱瘡\uf597\uebf7\udbb1ጋ"
         .length();
      int var10 = 0;
      int var8 = var10001;
      short var12 = 6171;
      String[] var22 = new String[2];
      int var11 = 0;
      String[] var9 = var22;
      String var7 = "Ē\udec9\uf68d͘\ue05c˸鐸摍\uf116⧂㯏ྃ䭓輭蓩꽴홚Ƕҋჩ托\ue705㮄챑⚑뎕粍ഊᒭ⛗\u0984⡦\uf7ba鞕褃\uda5a릧口옍ꁇ\uf314\ue0a0幱㝠竺穹嬊쇈⢘ٶ\ueedf酭ꩋ淇⩧\uefeb㲉\uf1cf崳\ue705㞖㪬뀸Ꝺ\u070e厦诸蜽鉷\udff8ꢬ嶁ॹ\ua636냫铲᯲\ue5ef찏꾛幬\uf429뿡隢ᚹ\ue6c5ᵧㅉ\udfd3徊幷\uf73a毮덅\uf7d9젛䴊皃珺㲯ꡃ\uf5f1\uf470㘷뢼扸틣瞝둴ả记댆\u173e셞ⴍ\ue775㏤쾹㳝殤ṭ࡚틖蛇Ṇ퉊ⶋ筤鱮勰疝㯯彬吼ퟔ⬷㙍䣯إ蒾幱\ud98c컇뵆ᦄ\u001b\uf7cc㑇\uf602㍌丽\udc64歀갆쵢䗓絒\ue675踘㊷턥뱁櫣\uab6e\ue551\udc8bﾂ擞歩爟⑶ꋱ袿針編惿뵓㥶뜉잡\ud8ef\uf3c3\ue1ac嘙\ueb3d⦐㠱蓘ᔮ貰봌䦡‾ക닫㍋\ue21d摺㱠宒侃ꃴ୴柏\uefe4儵ቦ\ue998侑洍\uf360胋㴅䊉\ue0ae懙折\udcef部݄ჺ\ue73e℧\uf321씟ꠦ벌㐓\u086c鱁팇ᘣ렍\uf4a2㒁ᐽᣗᰘ洰㫙덀圇䃴綔嚗陹并䨈䏯\uf4eaⴑ钶걙耴㊓ꈯ툃炲몦ꖪ㦅䦧戟찲䥉ⴖ厮⣄욅ㆹ\uec86ណ닾잷ᖂ!構ꋲ\uedc4㥊\uf8b2ㅗ냗ਗ਼虳䚞豠째拣컜錐㺯⨋硇嶬ﳼ뤗鎌믨ႂŤ곦〉亱瘡\uf597\uebf7\udbb1ጋ";

      do {
         char var13 = var7.charAt(var11);
         var10001 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIll = var9;
      IlII = new Object[var9.length];
      IIlI = new int[326];
      int var10000 = 0;
      int var24 = 0;
      byte[] var34 = "m&ÄKTRÉx>Vl\u008d=\u001e´H\u0000¡=\u0003\f?¿u\u0094ZÈ\u008a2û\u0016r3\u009f´ùÐ\nÄdLó\u0014\u008aâCÜ\u009b¸¬K\u0099£gG\u0005\u0089\u0084\u008e\u000f\u0002Ë\u0001\u0084*ÖL\f\u009eOªy\u007f#õ×lK\u0001ò\u0096T\u0006VLÆ\u00adv8mHÁ0@B#æ\u000f£\u0019Fk\u0011\u0084\r\u000b=ý\\ÜËg+IÅ°\u008bdz×\f¥{U\u00adª÷\rÑl¦¥(féK<Î\u009fH\u0091*\u0014-\u0080tã%\u0080Zÿ7i´Ñ\u001d\u0086ËñþTÎ!Òß|?\u0089L\u0085Z`þì\u000eá\u0093\u001d¤Ò\u0084\u009d\u0002IÅâ·Øeã<\u0081¦ÆU{äÙ\u0002Z\"\u009dÀøH\u008a(0\u0082\u0083\u0012ÀO\u0019\u0086-ÑR\u0005\u001cõ\tÔó'<Ä\u008aÍa<íï\u0097´©aÅ!v£ü$~b\b=øýFfgÔ·ª~û>ë\u0081û¹ =×\u0082ý)_\u0083²\u008dP}\u007fE À\u0017¾P*\u0006\u007fÂ½\n×|2ÔP\u001blKÇWÀ\u0099^¡{ã0p¹;mq½Ä\u0011Ms¼N\u0084Ël\u0085ã\u00135I¶Ûv¥\fè¿I\u0011Yß&\u009dÛ\u00ad\u0017ÅHµ\u007f¨\u0083æq\u0082v'\u008f\u0093âEÊ¦Jµ\u0016.Ö¡[ùm\u0097\u0090i<\u0093íku\u008d\u0086\u001b\u009c-\t3)$Î\u0011\u008aE\u00adn9fü7\u00ad\u0080¬¿RÖ§\u001du\u0011>îCÒU5áÈ$°^è\u0006Ã\u0019äUb7ÊN«þ;À¸³SÍ\u00134g¥~R\"±û\u0099Ôl<\u0089Àá9Kì\u0014\u009e\u0081×ÒÿJð\u0084Ä÷âí¤Ðô+rò3\u0094\u001eJ#\u001fá³\u0094Û²\u0095\u0003\u0080ã»ý÷%Cn\u008b<ÁTÕÿ¦\bo\u0084ÃÀ!Z\t¡rKÂÃbº\u0087£!ä°d\u0090lH\u0017cm\u0091\b(±ª\u00adu©ÿ^\b×ûÌ½Br=3Y~Î\u0019õýµ°¿7À=üú½Éì`ÆqÞc9\u0003ü¯\u0099\u0089Ý\u00816¦ïD\nEY§èÛF\u0093\u0019¿\u0005\b\u0081®<ò¨nT×ñ3zÃµÙ±+Û`\tt\u000bú½¾û³.I|KÂ\u000bÀ]P^ òt¤BMFug\u0087*Zèÿ\u0088\u0007\u001dxn\u0014sm\u0000ç\u008f\u0002ñ¾þµñè\u0019P¨ò\u000bÃ*¨âH\u0017¢ÜØ03Ë\u008d\u0007\u009ft(X&PxÙK\u009bz\b¾Î\u009f³\u0094z¼,4r»1NåOñ¸vTn¦Z\u001aÔG>\u008c³©Ä\u0000\"×/ ¥$\u008f\u00ad]&}h²\u0089óÚmA¬\u0007R\u008c\u0016<:¼Ê·Z\u00134¿VF§u|\u009a{%h\b\u0012w\u008azy³A\u0093´\u001e-ÞJ¼cÕ.ªB¡\u00166óÙlÊ\u0093À»$\u0012¥6\u00133\u009d¤R¾:\u0095®AôUq\fçûy=uÙ«\u000f9È°È`ÏÌ@¶\u009eDpï&¤¬»¨¤*J§\n\f>tÜâ\u0096.ñ<\u0091#$@rSË\u0082\u0095ûË\u008eJT^à5|\u0005\"ã[\u009d\u009a,p\u00ad¾9\u0006¿`\u0016\u0017\u009cK\u0099H\u001cÔr2/HÇþªSÍ\u00ad\u0014¯ I0Æ)É[¢\u009eOD\u0011°wN,¦pù\u001b\u0084×Ç\u008aVÚ\u0010>a/ÚO\u008b)ºäAL,ýÓ\u008a:ô\u0003mkÂÞíåA{Ó¥^\u0012Î°ÄrÁxÑ|\u0000\u0085S\u0007\u009a\u0098=Û©¿\u00ad|\u001bxpA¯\u0084Y\u008eS(ä¾v\u009bð{\u0010Ýv×üAs\u009e\u009a²«Ï\u0015¾ü\u000eü«.O\u001fÏ<Åß\u0090Úù=\u009bq \u009c\fvÛDí\u0093Kî\u009b©Nñõ\u0007*¯ÔÜ M÷\u0080¸\u0085Ü!©}Ø¦ Sm\u0011LQ\u001eÐ\u0002I8öP\u0097,J¶$ñ\u0081\u0003tø\u0096íì5Ø3\u0090\u0011eEÓ`CW\u0081b2M×d¡<äþ;×QäoXnY®\u007fSy\tî\u0084\\7óh\u0013d¶àP\u0096íj^f|\u0017\u0017Í-°©\u0080êæ±Á]\u008e%\u0006Î\u0087xda\u001fTö3\u0001õb(»\u0003}¿Á\u001b¢æ\u0084!/\u001dÔ\u0014\u0086båÌ+Þ¶¸½¹¬ÜÓ§ÜÜý\u008côÚ.\u008d! \u009d\u001b[V\u0016 \u009a\u0087\u00adÂi¤Í\r\tµ\tÊv\u0000\u0015MÃÖxH°8\u0081vÂBEÀõU\u00114<vK8]\t®\u0000°¸RLn¶ '\u001eÝ\u0092\u009cDi\u0001iØ\u000b\u0019\u0081N#É\u0005'a©Â\n\u00964\u0004âêZÜ'Ù:ß\u008bZ#\u0097W%<X\u0082N3\u0006Z ÞwAr"
         .getBytes("ISO-8859-1");

      int var56;
      do {
         IIlI[var10000] = ((var34[var24] & 255) << 24 | (var34[var24 + 1] & 255) << 16 | (var34[var24 + 2] & 255) << 8 | var34[var24 + 3] & 255) ^ 1770463813;
         var10000 += 1;
         var56 = var24 + 4;
         var24 += 4;
      } while (var56 < var34.length);

      String[] var5 = new String[lll(-1601562258, var17 ^ -2058258599)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIII('铛', '㈼', var17 ^ 1086701927)).length();
      int var1 = lll(-1601562257, var17 ^ -1138394550);
      int var19 = -1;

      label91:
      while (true) {
         var10000 = lll(-1601562260, var17 ^ -702423152);
         String var27 = var2.substring(++var19, var19 + var1);
         byte var40 = -1;

         while (true) {
            label86: {
               char[] var58 = var27.toCharArray();
               int var70 = var58.length;
               int var6 = 0;
               var56 = var10000;
               var45 = var58;
               var24 = var70;
               char[] var82;
               int var89;
               if (var70 <= 1) {
                  var82 = var58;
                  var70 = var10000;
                  var89 = var6;
               } else {
                  var56 = var10000;
                  var24 = var70;
                  if (var70 <= var6) {
                     break label86;
                  }

                  var82 = var58;
                  var70 = var10000;
                  var89 = var6;
               }

               while (true) {
                  var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % lll(-1601562261, var17 ^ -465040360)) {
                     case 0 -> lll(-1601562264, var17 ^ 2083355464);
                     case 1 -> 5;
                     case 2 -> lll(-1601562263, var17 ^ -628316791);
                     case 3 -> lll(-1601562266, var17 ^ -605550617);
                     case 4 -> lll(-1601562265, var17 ^ 947746726);
                     case 5 -> lll(-1601562268, var17 ^ -1534810275);
                     default -> lll(-1601562267, var17 ^ 171208537);
                  });
                  var6++;
                  if (var56 == 0) {
                     var89 = var56;
                     var82 = var45;
                     var70 = var56;
                  } else {
                     if (var24 <= var6) {
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
                     llI = var5;
                     IIIl = new String[lll(-1601562262, var17 ^ -388592107)];
                     IlI = new String[lll(-1601562270, var17 ^ 1356593287)];
                     llI();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var63;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label91;
                  }

                  var4 = (var2 = IIII('铚', '갫', var17 ^ 1452538079)).length();
                  var1 = lll(-1601562259, var17 ^ -714537124);
                  var19 = -1;
            }

            var10000 = 4;
            var27 = var2.substring(++var19, var19 + var1);
            var40 = 0;
         }
      }
   }

   private boolean Ill(class_310 var1) {
      return !this.Ill.IllI() ? true : var1.field_1690 != null && var1.field_1690.field_1886 != null && var1.field_1690.field_1886.method_1434();
   }

   private double lII(double var1) {
      double var3 = class_3532.method_15350(var1, 0.0, 1.0);
      return var3 * var3 * (3.0 - 2.0 * var3);
   }

   @Override
   public void IlIII() {
      this.IIII = this.lII.IllI().floatValue();
   }

   private double lIl(class_243 var1, class_243 var2) {
      double var3 = var2.method_1033();
      if (var3 <= 1.0E-6) {
         return 0.0;
      } else {
         double var5 = class_3532.method_15350(var1.method_1026(var2.method_1021(1.0 / var3)), -1.0, 1.0);
         return Math.toDegrees(Math.acos(var5));
      }
   }

   private static void llI() {
      int var0 = 882115130;
      IlI[0] = II(Il(lll(-1601562506, var0 ^ -898958946), lll(-1601562505, var0 ^ -1724968693)).toCharArray(), 69738L, lll(-1601562508, var0 ^ 843555861));
      IlI[1] = II(Il(lll(-1601562507, var0 ^ -1679456638), lll(-1601562510, var0 ^ -817193776)).toCharArray(), 28317L, lll(-1601562509, var0 ^ -76735327));
      IlI[2] = II(Il(lll(-1601562512, var0 ^ 1019486130), lll(-1601562511, var0 ^ -78143826)).toCharArray(), 58905L, lll(-1601562546, var0 ^ 1564134852));
      IlI[3] = II(Il(lll(-1601562545, var0 ^ 195727426), lll(-1601562548, var0 ^ -1615772549)).toCharArray(), 12333L, lll(-1601562547, var0 ^ 1209877282));
      IlI[4] = II(Il(lll(-1601562550, var0 ^ 1602164100), lll(-1601562549, var0 ^ -763051584)).toCharArray(), 58220L, lll(-1601562552, var0 ^ 1765333229));
      IlI[5] = II(Il(lll(-1601562551, var0 ^ -699980016), lll(-1601562554, var0 ^ 1075854997)).toCharArray(), 85147L, lll(-1601562553, var0 ^ -541518253));
      IlI[lll(-1601562556, var0 ^ 1421262)] = II(
         Il(lll(-1601562555, var0 ^ -753618816), lll(-1601562558, var0 ^ 1619166664)).toCharArray(), 36767L, lll(-1601562557, var0 ^ -1694992751)
      );
      IlI[lll(-1601562560, var0 ^ 1348154037)] = II(
         Il(lll(-1601562559, var0 ^ 815044621), lll(-1601562530, var0 ^ -195829985)).toCharArray(), 57512L, lll(-1601562529, var0 ^ 607859470)
      );
      IlI[lll(-1601562532, var0 ^ -2049840310)] = II(
         Il(lll(-1601562531, var0 ^ 2096059388), lll(-1601562534, var0 ^ -1202079634)).toCharArray(), 74178L, lll(-1601562533, var0 ^ -345222030)
      );
      IlI[lll(-1601562536, var0 ^ -1230961146)] = II(
         Il(lll(-1601562535, var0 ^ 1402544427), lll(-1601562538, var0 ^ -1344979754)).toCharArray(), 85880L, lll(-1601562537, var0 ^ 596984905)
      );
      IlI[lll(-1601562540, var0 ^ 1862606697)] = II(
         Il(lll(-1601562539, var0 ^ -51361376), lll(-1601562542, var0 ^ -468168867)).toCharArray(), 53280L, lll(-1601562541, var0 ^ -1678374033)
      );
      IlI[lll(-1601562544, var0 ^ 1415270803)] = II(
         Il(lll(-1601562543, var0 ^ -912428199), lll(-1601562578, var0 ^ -1488633621)).toCharArray(), 96930L, lll(-1601562577, var0 ^ -2036055850)
      );
      IlI[lll(-1601562580, var0 ^ -569504677)] = II(
         Il(lll(-1601562579, var0 ^ -1044311161), lll(-1601562582, var0 ^ -828425328)).toCharArray(), 22688L, lll(-1601562581, var0 ^ -53461901)
      );
   }
}
