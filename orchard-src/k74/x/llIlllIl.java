package k74.x;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

@Environment(EnvType.CLIENT)
public final class llIlllIl extends IlIIIIIIl {
   private long I;
   private long II;
   private static final String[] IIll;
   private final lIlllIl Il;
   private int lI;
   private static final int[] IIlI;
   private static final String[] ll;
   private int III;
   private final IIlIII IIl;
   private final lllIIlII IlI;
   private final IlIIIllll Ill;
   private static final String[] lII;
   private final lIlllIl lIl;
   private final IIlIII llI;
   private final lllIIlII lll;
   private final IllIII<Illllll> IIII;
   private static final Object[] IlII;
   private final IllIII<lllIllIl> IIIl;

   private static String I(int var0, int var1) {
      int var9 = -771227784;
      int var2 = (var0 ^ lIIl(1460401305, var9 ^ -1405844965)) & lIIl(1460401304, var9 ^ -345320750);
      if (lII[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & lIIl(1460401307, var9 ^ 971877591)) {
            case 0 -> lIIl(1460401306, var9 ^ 1769624092);
            case 1 -> lIIl(1460401309, var9 ^ -1867625998);
            case 2 -> lIIl(1460401308, var9 ^ 2003140568);
            case 3 -> lIIl(1460401311, var9 ^ 332120065);
            case 4 -> lIIl(1460401310, var9 ^ 612432523);
            case 5 -> lIIl(1460401297, var9 ^ 1621141565);
            case 6 -> lIIl(1460401296, var9 ^ 2140666436);
            case 7 -> lIIl(1460401299, var9 ^ -1452088515);
            case 8 -> lIIl(1460401298, var9 ^ -74625242);
            case 9 -> lIIl(1460401301, var9 ^ -1107475076);
            case 10 -> lIIl(1460401300, var9 ^ 29483916);
            case 11 -> lIIl(1460401303, var9 ^ 1938742692);
            case 12 -> lIIl(1460401302, var9 ^ -1673443845);
            case 13 -> lIIl(1460401289, var9 ^ -902148525);
            case 14 -> lIIl(1460401288, var9 ^ -1393782588);
            case 15 -> lIIl(1460401291, var9 ^ -1280027066);
            case 16 -> lIIl(1460401290, var9 ^ 980353894);
            case 17 -> lIIl(1460401293, var9 ^ -538167708);
            case 18 -> lIIl(1460401292, var9 ^ -430121783);
            case 19 -> lIIl(1460401295, var9 ^ 236967557);
            case 20 -> lIIl(1460401294, var9 ^ 1625379768);
            case 21 -> lIIl(1460401281, var9 ^ -524805347);
            case 22 -> lIIl(1460401280, var9 ^ 539912156);
            case 23 -> lIIl(1460401283, var9 ^ -56732675);
            case 24 -> lIIl(1460401282, var9 ^ -135923609);
            case 25 -> lIIl(1460401285, var9 ^ -288112147);
            case 26 -> lIIl(1460401284, var9 ^ 145239427);
            case 27 -> lIIl(1460401287, var9 ^ -163547206);
            case 28 -> lIIl(1460401286, var9 ^ 1857049044);
            case 29 -> lIIl(1460401337, var9 ^ 1488212153);
            case 30 -> lIIl(1460401336, var9 ^ 1574030570);
            case 31 -> lIIl(1460401339, var9 ^ -14254803);
            case 32 -> lIIl(1460401338, var9 ^ 1628168924);
            case 33 -> lIIl(1460401341, var9 ^ 1281309941);
            case 34 -> lIIl(1460401340, var9 ^ 1909053926);
            case 35 -> lIIl(1460401343, var9 ^ -7508835);
            case 36 -> lIIl(1460401342, var9 ^ 142487247);
            case 37 -> lIIl(1460401329, var9 ^ 1481790092);
            case 38 -> lIIl(1460401328, var9 ^ 608908861);
            case 39 -> lIIl(1460401331, var9 ^ 1132831436);
            case 40 -> lIIl(1460401330, var9 ^ 800195325);
            case 41 -> lIIl(1460401333, var9 ^ 1061671203);
            case 42 -> lIIl(1460401332, var9 ^ -1471985989);
            case 43 -> lIIl(1460401335, var9 ^ -255883230);
            case 44 -> lIIl(1460401334, var9 ^ 774004025);
            case 45 -> lIIl(1460401321, var9 ^ -552608710);
            case 46 -> lIIl(1460401320, var9 ^ -1451659230);
            case 47 -> lIIl(1460401323, var9 ^ -92568220);
            case 48 -> lIIl(1460401322, var9 ^ 1076065689);
            case 49 -> lIIl(1460401325, var9 ^ 385661520);
            case 50 -> lIIl(1460401324, var9 ^ 928306755);
            case 51 -> lIIl(1460401327, var9 ^ -1530493886);
            case 52 -> 4;
            case 53 -> lIIl(1460401326, var9 ^ -1585646155);
            case 54 -> lIIl(1460401313, var9 ^ -1453818403);
            case 55 -> lIIl(1460401312, var9 ^ -1056755228);
            case 56 -> lIIl(1460401315, var9 ^ -1935123175);
            case 57 -> lIIl(1460401314, var9 ^ -1822807627);
            case 58 -> lIIl(1460401317, var9 ^ 182298430);
            case 59 -> lIIl(1460401316, var9 ^ 1221316550);
            case 60 -> lIIl(1460401319, var9 ^ -1341526534);
            case 61 -> lIIl(1460401318, var9 ^ 1177408201);
            case 62 -> lIIl(1460401369, var9 ^ 1533531696);
            case 63 -> lIIl(1460401368, var9 ^ 944957760);
            case 64 -> lIIl(1460401371, var9 ^ -1033660883);
            case 65 -> lIIl(1460401370, var9 ^ 850446648);
            case 66 -> lIIl(1460401373, var9 ^ -1799159245);
            case 67 -> lIIl(1460401372, var9 ^ 1467621480);
            case 68 -> lIIl(1460401375, var9 ^ -2059266188);
            case 69 -> lIIl(1460401374, var9 ^ -431763934);
            case 70 -> lIIl(1460401361, var9 ^ 1994706075);
            case 71 -> lIIl(1460401360, var9 ^ 1464624191);
            case 72 -> lIIl(1460401363, var9 ^ 989575322);
            case 73 -> lIIl(1460401362, var9 ^ -40619867);
            case 74 -> lIIl(1460401365, var9 ^ 1151712875);
            case 75 -> lIIl(1460401364, var9 ^ 1054584960);
            case 76 -> lIIl(1460401367, var9 ^ -1541982367);
            case 77 -> 0;
            case 78 -> lIIl(1460401366, var9 ^ -621592398);
            case 79 -> lIIl(1460401353, var9 ^ 1269684827);
            case 80 -> lIIl(1460401352, var9 ^ -260308015);
            case 81 -> lIIl(1460401355, var9 ^ 850183214);
            case 82 -> lIIl(1460401354, var9 ^ 1457861131);
            case 83 -> lIIl(1460401357, var9 ^ 620786579);
            case 84 -> lIIl(1460401356, var9 ^ 886487682);
            case 85 -> lIIl(1460401359, var9 ^ 446450617);
            case 86 -> lIIl(1460401358, var9 ^ -2094968149);
            case 87 -> lIIl(1460401345, var9 ^ -542721346);
            case 88 -> lIIl(1460401344, var9 ^ 1068962336);
            case 89 -> lIIl(1460401347, var9 ^ -1967058834);
            case 90 -> lIIl(1460401346, var9 ^ 702396110);
            case 91 -> lIIl(1460401349, var9 ^ -1901754087);
            case 92 -> lIIl(1460401348, var9 ^ 1585195798);
            case 93 -> lIIl(1460401351, var9 ^ -853504711);
            case 94 -> lIIl(1460401350, var9 ^ 844939326);
            case 95 -> lIIl(1460401401, var9 ^ -2082683847);
            case 96 -> lIIl(1460401400, var9 ^ 1507338470);
            case 97 -> lIIl(1460401403, var9 ^ 1640998647);
            case 98 -> lIIl(1460401402, var9 ^ 1758921886);
            case 99 -> lIIl(1460401405, var9 ^ -1622415252);
            case 100 -> lIIl(1460401404, var9 ^ 789046413);
            case 101 -> lIIl(1460401407, var9 ^ -380538456);
            case 102 -> lIIl(1460401406, var9 ^ 1666210002);
            case 103 -> lIIl(1460401393, var9 ^ -851906907);
            case 104 -> lIIl(1460401392, var9 ^ 700019381);
            case 105 -> lIIl(1460401395, var9 ^ -1855331045);
            case 106 -> lIIl(1460401394, var9 ^ -1566533986);
            case 107 -> lIIl(1460401397, var9 ^ -5770318);
            case 108 -> lIIl(1460401396, var9 ^ -1479424548);
            case 109 -> lIIl(1460401399, var9 ^ 1899774141);
            case 110 -> lIIl(1460401398, var9 ^ 867953739);
            case 111 -> lIIl(1460401385, var9 ^ -1715929420);
            case 112 -> lIIl(1460401384, var9 ^ -46052974);
            case 113 -> lIIl(1460401387, var9 ^ -713418234);
            case 114 -> lIIl(1460401386, var9 ^ 340780198);
            case 115 -> lIIl(1460401389, var9 ^ 1816198792);
            case 116 -> lIIl(1460401388, var9 ^ 1597322278);
            case 117 -> lIIl(1460401391, var9 ^ -1046449709);
            case 118 -> lIIl(1460401390, var9 ^ -566695958);
            case 119 -> lIIl(1460401377, var9 ^ 1974872383);
            case 120 -> lIIl(1460401376, var9 ^ 307539069);
            case 121 -> lIIl(1460401379, var9 ^ -2025906897);
            case 122 -> lIIl(1460401378, var9 ^ -222983552);
            case 123 -> lIIl(1460401381, var9 ^ 1770002824);
            case 124 -> lIIl(1460401380, var9 ^ 1500601331);
            case 125 -> lIIl(1460401383, var9 ^ 739681431);
            case 126 -> lIIl(1460401382, var9 ^ -2091892673);
            case 127 -> lIIl(1460401177, var9 ^ -1398658973);
            case 128 -> lIIl(1460401176, var9 ^ 2017563399);
            case 129 -> lIIl(1460401179, var9 ^ 17339983);
            case 130 -> lIIl(1460401178, var9 ^ -589972210);
            case 131 -> lIIl(1460401181, var9 ^ -921766251);
            case 132 -> lIIl(1460401180, var9 ^ 1862738647);
            case 133 -> lIIl(1460401183, var9 ^ 792565812);
            case 134 -> lIIl(1460401182, var9 ^ 1572565724);
            case 135 -> lIIl(1460401169, var9 ^ 612438171);
            case 136 -> lIIl(1460401168, var9 ^ 1924609133);
            case 137 -> lIIl(1460401171, var9 ^ -785113740);
            case 138 -> lIIl(1460401170, var9 ^ 291617785);
            case 139 -> lIIl(1460401173, var9 ^ 1944227635);
            case 140 -> lIIl(1460401172, var9 ^ -1872015364);
            case 141 -> lIIl(1460401175, var9 ^ 1267180845);
            case 142 -> lIIl(1460401174, var9 ^ -437345006);
            case 143 -> lIIl(1460401161, var9 ^ 353358094);
            case 144 -> lIIl(1460401160, var9 ^ 1554363794);
            case 145 -> lIIl(1460401163, var9 ^ 575357203);
            case 146 -> lIIl(1460401162, var9 ^ 411920807);
            case 147 -> lIIl(1460401165, var9 ^ 1545731288);
            case 148 -> lIIl(1460401164, var9 ^ -804442710);
            case 149 -> lIIl(1460401167, var9 ^ 1953946076);
            case 150 -> lIIl(1460401166, var9 ^ 1964003280);
            case 151 -> lIIl(1460401153, var9 ^ 1310472198);
            case 152 -> lIIl(1460401152, var9 ^ -1281253316);
            case 153 -> 3;
            case 154 -> lIIl(1460401155, var9 ^ 330461965);
            case 155 -> lIIl(1460401154, var9 ^ -1563236664);
            case 156 -> lIIl(1460401157, var9 ^ 1235935695);
            case 157 -> lIIl(1460401156, var9 ^ 1922819509);
            case 158 -> lIIl(1460401159, var9 ^ -1738352403);
            case 159 -> lIIl(1460401158, var9 ^ 1994439902);
            case 160 -> lIIl(1460401209, var9 ^ 1836054397);
            case 161 -> lIIl(1460401208, var9 ^ -2010841875);
            case 162 -> lIIl(1460401211, var9 ^ 1339072438);
            case 163 -> lIIl(1460401210, var9 ^ 1167108877);
            case 164 -> lIIl(1460401213, var9 ^ 189227805);
            case 165 -> lIIl(1460401212, var9 ^ 1772471131);
            case 166 -> lIIl(1460401215, var9 ^ 380367459);
            case 167 -> lIIl(1460401214, var9 ^ 445870067);
            case 168 -> lIIl(1460401201, var9 ^ 1503747364);
            case 169 -> lIIl(1460401200, var9 ^ -691956507);
            case 170 -> lIIl(1460401203, var9 ^ -1873771435);
            case 171 -> lIIl(1460401202, var9 ^ -950672161);
            case 172 -> lIIl(1460401205, var9 ^ 748476841);
            case 173 -> lIIl(1460401204, var9 ^ 1097125636);
            case 174 -> lIIl(1460401207, var9 ^ -634952775);
            case 175 -> lIIl(1460401206, var9 ^ -329863538);
            case 176 -> lIIl(1460401193, var9 ^ 644093269);
            case 177 -> 5;
            case 178 -> lIIl(1460401192, var9 ^ -1274511695);
            case 179 -> lIIl(1460401195, var9 ^ -141740388);
            case 180 -> lIIl(1460401194, var9 ^ 864451937);
            case 181 -> lIIl(1460401197, var9 ^ 124213768);
            case 182 -> lIIl(1460401196, var9 ^ -1760832115);
            case 183 -> lIIl(1460401199, var9 ^ -973753160);
            case 184 -> lIIl(1460401198, var9 ^ -1700595985);
            case 185 -> lIIl(1460401185, var9 ^ -1564868562);
            case 186 -> lIIl(1460401184, var9 ^ 535594989);
            case 187 -> lIIl(1460401187, var9 ^ -579209494);
            case 188 -> lIIl(1460401186, var9 ^ -16765008);
            case 189 -> lIIl(1460401189, var9 ^ -1935348392);
            case 190 -> lIIl(1460401188, var9 ^ -158568231);
            case 191 -> lIIl(1460401191, var9 ^ -1116622773);
            case 192 -> lIIl(1460401190, var9 ^ 1810117291);
            case 193 -> lIIl(1460401241, var9 ^ 1190589742);
            case 194 -> lIIl(1460401240, var9 ^ 71831688);
            case 195 -> lIIl(1460401243, var9 ^ -1619990411);
            case 196 -> lIIl(1460401242, var9 ^ -682819932);
            case 197 -> lIIl(1460401245, var9 ^ -1425215523);
            case 198 -> lIIl(1460401244, var9 ^ 1428392190);
            case 199 -> lIIl(1460401247, var9 ^ -27316720);
            case 200 -> lIIl(1460401246, var9 ^ 586234891);
            case 201 -> lIIl(1460401233, var9 ^ 883400544);
            case 202 -> lIIl(1460401232, var9 ^ 1938009276);
            case 203 -> lIIl(1460401235, var9 ^ -1743214351);
            case 204 -> lIIl(1460401234, var9 ^ 1832985126);
            case 205 -> lIIl(1460401237, var9 ^ -29610480);
            case 206 -> lIIl(1460401236, var9 ^ 1504692068);
            case 207 -> lIIl(1460401239, var9 ^ 180441962);
            case 208 -> lIIl(1460401238, var9 ^ 1281231217);
            case 209 -> lIIl(1460401225, var9 ^ -1106661947);
            case 210 -> lIIl(1460401224, var9 ^ -401656595);
            case 211 -> lIIl(1460401227, var9 ^ 318974770);
            case 212 -> lIIl(1460401226, var9 ^ -393715763);
            case 213 -> lIIl(1460401229, var9 ^ 546173330);
            case 214 -> lIIl(1460401228, var9 ^ -1521368508);
            case 215 -> lIIl(1460401231, var9 ^ 1789295648);
            case 216 -> lIIl(1460401230, var9 ^ -1511705655);
            case 217 -> lIIl(1460401217, var9 ^ -2076770266);
            case 218 -> lIIl(1460401216, var9 ^ -1004248873);
            case 219 -> lIIl(1460401219, var9 ^ 2052037924);
            case 220 -> lIIl(1460401218, var9 ^ -2108869073);
            case 221 -> lIIl(1460401221, var9 ^ -1824605466);
            case 222 -> lIIl(1460401220, var9 ^ 1318693487);
            case 223 -> lIIl(1460401223, var9 ^ 1430651434);
            case 224 -> lIIl(1460401222, var9 ^ 737878075);
            case 225 -> 1;
            case 226 -> lIIl(1460401273, var9 ^ 1343255884);
            case 227 -> lIIl(1460401272, var9 ^ 2109403429);
            case 228 -> lIIl(1460401275, var9 ^ 1303676531);
            case 229 -> lIIl(1460401274, var9 ^ -1609396709);
            case 230 -> lIIl(1460401277, var9 ^ 1406573963);
            case 231 -> lIIl(1460401276, var9 ^ 368483326);
            case 232 -> lIIl(1460401279, var9 ^ -1993443288);
            case 233 -> lIIl(1460401278, var9 ^ -558936209);
            case 234 -> lIIl(1460401265, var9 ^ -517570509);
            case 235 -> lIIl(1460401264, var9 ^ 643891721);
            case 236 -> lIIl(1460401267, var9 ^ 1264680538);
            case 237 -> lIIl(1460401266, var9 ^ 1396558958);
            case 238 -> lIIl(1460401269, var9 ^ 1614167188);
            case 239 -> lIIl(1460401268, var9 ^ -1575704630);
            case 240 -> lIIl(1460401271, var9 ^ 133279163);
            case 241 -> 2;
            case 242 -> lIIl(1460401270, var9 ^ -783245266);
            case 243 -> lIIl(1460401257, var9 ^ -1633801097);
            case 244 -> lIIl(1460401256, var9 ^ -679424581);
            case 245 -> lIIl(1460401259, var9 ^ 1790533527);
            case 246 -> lIIl(1460401258, var9 ^ -35571531);
            case 247 -> lIIl(1460401261, var9 ^ -2090133525);
            case 248 -> lIIl(1460401260, var9 ^ 1195388869);
            case 249 -> lIIl(1460401263, var9 ^ 1861138704);
            case 250 -> lIIl(1460401262, var9 ^ 1618574642);
            case 251 -> lIIl(1460401249, var9 ^ 1231721772);
            case 252 -> lIIl(1460401248, var9 ^ 920495332);
            case 253 -> lIIl(1460401251, var9 ^ 1613834389);
            case 254 -> lIIl(1460401250, var9 ^ 122681981);
            default -> lIIl(1460401253, var9 ^ 416966682);
         };
         int var5 = (var1 & lIIl(1460401252, var9 ^ -1347387882)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIl(1460401255, var9 ^ -636235652)) >>> lIIl(1460401254, var9 ^ -468846034)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIl(1460401561, var9 ^ -1739185771);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIl(1460401560, var9 ^ -1721287965);
            }
         }

         lII[var2] = new String(var3).intern();
      }

      return lII[var2];
   }

   @Override
   public void IlIII() {
      this.III();
      this.Ill.IIIIIII();
   }

   private static double l(class_243 var0, class_2338 var1) {
      return class_243.method_24953(var1).method_1025(var0);
   }

   private boolean II(class_310 var1, class_1657 var2) {
      for (class_2338 var4 : this.lIl(var2)) {
         if (var1.field_1687.method_8320(var4).method_27852(class_2246.field_10343)) {
            return true;
         }
      }

      return false;
   }

   private int Il(class_310 var1) {
      for (int var2 = 0; var2 < lIIl(1460401558, 2094288039 ^ 1068448178); var2++) {
         class_1799 var3 = var1.field_1724.method_31548().method_5438(var2);
         if (var3 != null && var3.method_31574(class_1802.field_8786)) {
            return var2;
         }
      }

      return -1;
   }

   public llIlllIl() {
      int var1 = -1303548779;
      super(
         IlIIllIII.Ill(I(lIIl(1460401545, var1 ^ 789126538), lIIl(1460401544, var1 ^ -2117573196))),
         lllIIlIl.I,
         IlIIllIII.Ill(I(lIIl(1460401547, var1 ^ 573919474), lIIl(1460401546, var1 ^ -35919047)))
      );
      this.IIII = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(I(lIIl(1460401549, var1 ^ 1978996289), lIIl(1460401548, var1 ^ 86441170))), Illllll.class, k74.x.Illllll.l)
      );
      this.IIIl = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(I(lIIl(1460401551, var1 ^ 1884361777), lIIl(1460401550, var1 ^ 1902994731))), lllIllIl.class, lllIllIl.II)
      );
      this.llI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(I(lIIl(1460401537, var1 ^ -489670899), lIIl(1460401536, var1 ^ -634257883))), 50.0, 1.0, 100.0, 1.0).lIlI(this::Ill)
      );
      this.IIl = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(I(lIIl(1460401539, var1 ^ -1467000140), lIIl(1460401538, var1 ^ 1508431605))), 4.5, 1.0, 6.0, 0.1)
            .IIIl(IlIIllIII.Ill(I(lIIl(1460401541, var1 ^ -128155593), lIIl(1460401540, var1 ^ -1011242200))))
      );
      this.lIl = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(I(lIIl(1460401543, var1 ^ 2123614035), lIIl(1460401542, var1 ^ 600804367))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(I(lIIl(1460401593, var1 ^ 278682069), lIIl(1460401592, var1 ^ 1854838140))))
      );
      this.Il = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(I(lIIl(1460401595, var1 ^ 832802151), lIIl(1460401594, var1 ^ -1975039552))), 50.0, 75.0, 0.0, 500.0, 5.0)
            .Ill(IlIIllIII.Ill(I(lIIl(1460401597, var1 ^ 1328297488), lIIl(1460401596, var1 ^ -1437291945))))
      );
      this.IlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(I(lIIl(1460401599, var1 ^ -808621812), lIIl(1460401598, var1 ^ 2090957461))), true));
      this.lll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(I(lIIl(1460401585, var1 ^ -1131068754), lIIl(1460401584, var1 ^ -2072428400))), false));
      this.Ill = new IlIIIllll();
      this.III = -1;
      this.lI = -1;
      this.I = Long.MIN_VALUE;
      this.II = Long.MIN_VALUE;
   }

   private boolean lI(class_310 var1, llIIIIII var2) {
      boolean var3 = k74.x.IIll.IlIIII(var1, var2.l());
      if (var3) {
         this.III();
      }

      return var3;
   }

   private static String lIlI(int var0, int var1, int var2) {
      int var7 = var0 ^ 532801498;
      char[] var6 = IIll[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])IlII[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         IlII[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 41718;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ var5 ^ switch (var5 % 14) {
            default -> 40;
            case 1 -> 202;
            case 2 -> 175;
            case 3 -> 207;
            case 4 -> 228;
            case 5 -> 85;
            case 6 -> 203;
            case 7 -> 172;
            case 8 -> 82;
            case 9 -> 110;
            case 10 -> 19;
            case 11 -> 57;
            case 12 -> 57;
            case 13 -> 59;
         } ^ var2 ^ var1 ^ var4 ^ var0);
      }

      return new String(var6).intern();
   }

   private llIIIIII ll(class_310 var1, class_1657 var2) {
      if (this.IIII.IllI() == k74.x.Illllll.Il) {
         return this.II(var1, var2) ? null : this.lII(var1, var2);
      } else {
         for (class_2338 var4 : this.lIl(var2)) {
            llIIIIII var5 = this.IIIl(var1, var4);
            if (var5 != null) {
               return var5;
            }
         }

         return null;
      }
   }

   private void III() {
      this.III = -1;
      this.lI = -1;
      this.I = Long.MIN_VALUE;
      this.II = Long.MIN_VALUE;
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (this.IIl(var1)) {
         if (!IlllIlII.lllIl() && !k74.x.IIll.IIlllll()) {
            class_1657 var2 = this.IIII(var1);
            int var3 = this.Il(var1);
            if (var2 != null && var3 >= 0) {
               llIIIIII var4 = this.ll(var1, var2);
               if (var4 == null) {
                  this.III();
                  this.Ill.IIlIl();
               } else if (!this.Illl(var1, var2.method_5628(), var3)) {
                  this.Ill.IIlIl();
               } else if (this.IIIl.IllI() != lllIllIl.Il) {
                  boolean var9 = IlllIlII.IIIlII(var1, lIIl(1460401587, 1328564181 ^ 2051253342), var4.I(), this::IIlI);
               } else {
                  float var5 = this.Ill.IIIllII(var1, var4.l(), this.llI.IllI().floatValue());
                  boolean var6 = var5 <= 1.0F
                     || var1.field_1765 instanceof class_3965 var7
                        && var7.method_17777().equals(var4.l().method_17777())
                        && var7.method_17780() == var4.l().method_17780();
                  if (var6) {
                     this.Ill.IIlIl();
                     boolean var10 = k74.x.IIll.lllIII(var1, this, var3, llIlllIl::IIll);
                     if (var10) {
                        this.III();
                     }
                  }
               }
            } else {
               this.III();
               this.Ill.IIlIl();
            }
         } else {
            this.III();
         }
      }
   }

   private boolean IIl(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var1.field_1755 == null
         && var1.field_1724.method_5805()
         && !lIIIllII.ll(var1);
   }

   private boolean Ill() {
      return this.IIIl.IllI() == lllIllIl.Il;
   }

   private llIIIIII lII(class_310 var1, class_1657 var2) {
      llIIIIII var3 = null;
      double var4 = -1.0;

      for (class_2338 var7 : this.lIl(var2)) {
         llIIIIII var8 = this.IIIl(var1, var7);
         if (var8 != null) {
            double var9 = this.llI(var2, var7);
            if (var9 > var4) {
               var3 = var8;
               var4 = var9;
            }
         }
      }

      return var3;
   }

   private List<class_2338> lIl(class_1657 var1) {
      class_238 var3 = var1.method_5829();
      int var4 = (int)Math.floor(var1.method_23320());
      class_2338 var5 = class_2338.method_49637(var1.method_23317(), var4, var1.method_23321());
      ArrayList var6 = new ArrayList();
      var6.add(var5);
      class_238 var7 = this.lll(var1, var3);
      class_243 var8 = var7.method_1005();
      int var9 = (int)Math.floor(Math.min(var3.field_1323, var7.field_1323));
      int var10 = (int)Math.floor(Math.max(var3.field_1320, var7.field_1320) - 1.0E-7);
      int var11 = (int)Math.floor(Math.min(var3.field_1321, var7.field_1321));
      String[] var10000 = llIllIlI.IIlII();
      int var12 = (int)Math.floor(Math.max(var3.field_1324, var7.field_1324) - 1.0E-7);
      double var13 = var3.field_1325 - var1.method_23320();
      String[] var2 = var10000;
      int var15 = (int)Math.floor(var7.field_1325 - var13);
      int var16 = var9;

      label37:
      while (var16 <= var10) {
         int var17 = var11;

         while (true) {
            if (var17 <= var12) {
               class_2338 var18 = new class_2338(var16, var4, var17);
               if (!var6.contains(var18)) {
                  var6.add(var18);
               }

               if (var15 != var4) {
                  class_2338 var19 = new class_2338(var16, var15, var17);
                  if (!var6.contains(var19)) {
                     var6.add(var19);
                  }
               }

               var17++;
               if (var2 != null) {
                  continue;
               }
            }

            var16++;
            if (var2 == null) {
               break label37;
            }
            break;
         }
      }

      var6.sort(Comparator.comparingDouble(llIlllIl::l));
      return var6;
   }

   private static int lIIl(int var0, int var1) {
      int var2 = IIlI[var0 ^ 1460401305] ^ var1 ^ var0;
      var2 ^= 25712;
      var2 ^= 21256;
      var2 -= 14904;
      var2 -= 64269;
      var2 -= 27760;
      return var2 + 39209;
   }

   private double llI(class_1657 var1, class_2338 var2) {
      class_238 var3 = var1.method_5829();
      class_238 var4 = this.lll(var1, var3);
      double var5 = this.IlIl(var3, var2);
      if (var4 != var3) {
         var5 += this.IlIl(var4, var2);
      }

      return var5;
   }

   @Override
   public void llIl() {
      this.III();
      this.Ill.lIIl();
      this.Ill.IIlIl();
   }

   private class_238 lll(class_1657 var1, class_238 var2) {
      class_243 var3 = var1.method_18798();
      double var4 = Math.hypot(var3.field_1352, var3.field_1350);
      boolean var6 = this.IlI.IllI() && (var4 > 0.04 || Math.abs(var3.field_1351) > 0.05);
      return var6
         ? var2.method_989(
            var3.field_1352 * Math.min(1.8, var4 * 2.5),
            var3.field_1351 * Math.min(1.2, Math.abs(var3.field_1351) * 2.0),
            var3.field_1350 * Math.min(1.8, var4 * 2.5)
         )
         : var2;
   }

   private class_1657 IIII(class_310 var1) {
      double var2 = this.IIl.IllI() * this.IIl.IllI();
      class_1657 var4 = null;
      double var5 = Double.POSITIVE_INFINITY;

      for (class_1657 var8 : var1.field_1687.method_18456()) {
         if (var8 != var1.field_1724
            && var8.method_5805()
            && !var8.method_7325()
            && !var8.method_68878()
            && !IIlllIlll.II(var8)
            && (!this.lll.IllI() || this.IlII(var8))) {
            double var9 = var1.field_1724.method_5858(var8);
            if (var9 <= var2 && var9 < var5) {
               var4 = var8;
               var5 = var9;
            }
         }
      }

      return var4;
   }

   private llIIIIII IIIl(class_310 var1, class_2338 var2) {
      String[] var10000 = llIllIlI.IIlII();
      class_2680 var4 = var1.field_1687.method_8320(var2);
      String[] var3 = var10000;
      if (var4.method_26227().method_15769() && !var4.method_27852(class_2246.field_10382) && !var4.method_27852(class_2246.field_10164) && var4.method_45474()
         )
       {
         for (class_2350 var8 : class_2350.values()) {
            class_2338 var9 = var2.method_10093(var8);
            class_2680 var10 = var1.field_1687.method_8320(var9);
            if (!var10.method_26215()
               && !var10.method_45474()
               && var10.method_26227().method_15769()
               && !var10.method_27852(class_2246.field_10382)
               && !var10.method_27852(class_2246.field_10164)
               && !var10.method_26220(var1.field_1687, var9).method_1110()) {
               class_2350 var11 = var8.method_10153();
               class_243 var12 = class_243.method_24953(var9).method_1019(class_243.method_24954(var11.method_62675()).method_1021(0.5));
               if (this.lIII(var1, var12)) {
                  class_243 var13 = var12.method_1020(class_243.method_24954(var11.method_62675()).method_1021(0.01));
                  class_3965 var14 = k74.x.IIll.lIIIlll(var1, var1.field_1724, var1.field_1724.method_33571(), var13);
                  if (var14 == null || var14.method_17783() != class_240.field_1332) {
                     var14 = var1.field_1687
                        .method_17742(new class_3959(var1.field_1724.method_33571(), var13, class_3960.field_17559, class_242.field_1348, var1.field_1724));
                  }

                  if (var14 != null
                     && var14.method_17783() == class_240.field_1332
                     && var14.method_17777().equals(var9)
                     && var2.equals(var9.method_10093(var14.method_17780()))) {
                     return new llIIIIII(var14.method_17784(), var14);
                  }
               }
            }

            if (var3 == null) {
               break;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private boolean IIlI(class_310 var1, int var2, llIIIIII var3) {
      return k74.x.IIll.lllIII(var1, this, var2, this::lI);
   }

   private static boolean IIll(class_310 var0, llIIIIII var1) {
      return k74.x.IIll.IlIIII(var0, var1.l());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = 1358594281;
      char[] var15 = "ò\u0019".toCharArray();
      byte var20 = -1;
      short var13 = 18048;
      String var14 = "촟춨췮쵐춂춳촛쵘촣촐충춏촾췁촴춣쵩쵤촑쵈춍쵅초쵋쵰췁쵌촗췉춪촠춶쵴쵐쵳췛춢쵨취쵤쵫췛춄쵀춦촯춐춼촮췿춸춼쵟췿췖춷췷췂촄쵙춻춽쵄촐췚춞춰췱췧췃쵻촛쵃쵽춂춘총촗춇촀춲촘춅춝췜췂촡촱춯쵫췽촡췟촷촰쵁춰춆췡췣춴쵁촽췔춟촯쵩춵춲촒촖촘촚췭쵚쵛췇춌춭췫촩춼췀쵡춒춺촌쵉촊춈췷췛춨쵰춷췢춞쵫쵸촨쵥췢촃췺춎쵡춆촛췙축촡쵩촦춫췾춊촙초촶춾촁쵲촞쵓췜쵞쵀쵙쵩췣쵘촁쵼춈촡쵨촡춳춾쵼췕쵆췁춬쵣쵥춱췫췱촸쵰촴춴쵪쵋쵈쵴쵮쵘췏촕쵺쵙쵎췠춐춁촪췮춖춋쵆쵂춄촗쵸쵵쵺췜춗췾춗춦쵂쵬쵰쵽쵩춢춮촄추춖춊췝쵗촖춊춰춍촷취̙͓̥͗\u0381Ϝϝ͕̙́̉υ̳̉ϘΗ\u03a2ΎͷϞΜͶΙ͏Ϳ";
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            IIll = var16;
            IlII = new Object[var16.length];
            int var9 = 246727153;
            byte[] var7 = "'\u008d\u001b\u0019`Ð'0²TX6âÃ¦t\u001b\u0017½\u008füÜ\u008az\u0098r4A¯9\u000f\u0003ë\u0019\\/ô.\u000e\\\"Ë\u0016\u009ep4»Z6D°ì\u008ax\u0017Éø7)¾\u0017ø°KA\u0083º\u001d'Ue^8\r£ü±ÖöÂTUÃ¢må)m\u0085¦#\bëX¦zk\u0001ï^«\u0097\u0093Ïw'§«|\\\f|ej5õ\u0083\u0011Ù÷}ù\u0082Zå\t¥çÓ\r¤ÉÖh8àt\u009f\u0089ïê²\u0016\u0013ÇæÉ\u001búp,it4\u0099J\u0083ÇÛiÓë§|¯òÃ±È<W#¤\u000b÷+´þ%î#ú³E{\u0006}¿¥\u009b©!T¶)Û\"À\u0085\u0096qÂpËË\u009a\u0081\u0082\u009dEO´¼í#è/\u007fp|*Å\u0001Ì\"á\u0089\u008bJºÅå\u0007\u0011©Î\u0018ãÜ\u001b\u0081dS\u0000Ãr;\u008e;°\u0018IÍ\u0094&§ÐÞ\"9³ë\u001d7IÚb\t¹\t<ï\u001fzö*ÜÃÕÛ\u000eûã\u000fmú;£ý]9qÜõ\u0090%±BLÓv-Å-Ï\u001cK¿µbE{/®ÃkQJ´\u0013À\u0014.\u0015{Å÷ü¹\u00150*Ý\\Çæ®¹\u0087å¿oON\u0091%¿ò\b\u0098¦ÂT\u001fNÿ´\u000eçé\u0001xå\u0081¢dB¯\u0005\u001c}DÕÅßzF\u0099y\u000b¹å4K\be1\u009bÒaÜ\u0091êvS'ãnð\u0092\u0014ò\u001d×¤¾\u0011Hbè\u0084bèé¬õF\u0081\u001aÖ¢\u0000\u0087\n\u001aÐ\u0011\u0016)\u0019b©t\u001e\u0007ÿ,h1Îú\u0085µP¸\u0002\u0018<\u0012\u0001\nãvø¼d^ÃïÒ\u009fö\u0011)çù\nÑÔ\u008cÀoJ\u0019\u0085ÖU\u0081\u0013ëþ\u000fÜ\u0080\u0099íY¿\f\u0086é¿y\f~\u009fâ9ì\u000eÒÈ¯\u0083§¯P\u0088\bé´f'\u001bÜüóøf-\u008a±bÂWlIÒB·\u0003æä¾ÖU¤\u0084m~Ö\u0002\u0086´¯8å®ù\u000eÀ\u0096Z\u008déÞ\u009aØO9ø[z;\u001bÒ»AÀ>P!nWQø\u009e¶$\u0004×\u001c@\u0089©òµù\u00934\u009c´×\u0098\bP[´Ù\u0000ÿÏ-\u001fþ©»PÅ¥Ím8\u0018TF\u0098\u000b\u0086.)k\u0013\u0093Â\u0013\u0015_ù\"\u0010Ý\u0013Û,)ýYHzæÖ\u0002)\u0003\u009d\tüÄijÏÎ)_á\u0080þ\u0096Kâ\u001c7\u009c\u009d\u0012\u0006ö\u0091*\u009b\u0006Ò\u0018©Ï]x`\u0006\u001bép\u0081Lì\u0010\u0017§%,ÎÊÝ;èQ\u009e\u0097Ngï[î\u00adÝà,?±\u008b\u008e|4Âi¸?\u0088\"\u008cÞ®è\u001c² «NL@-\u0011\u001b\u0002()\u0003õ5\u0094Us_VÀ\u0003ýt¹Ú\u0083\u0007\u001d\u0018m}5\u0084)6ÈEcà]Æ\u001aÍO\u0000T\u008fñä!\u0014É\u001dz\\õ\n^ µ\u001bòÞ\u009a|AuæÚÅ©HÈ\u0094¿\u001ej$ø:YÁ\u0013¡\\+æøÖ\u008du\u0085ÚùÒ\u001626\u0081x§LÇçü`5°XÔc¶À\u0013\u0098ºßòc1«+«4\u0005r.è6àá\u001f\u0088³.\\Çj\u000f\u008eõPO\u009d\u0095\u009cñöi÷\tôÂ\u001d\u0018\u0087OôÅ ^·Þÿ÷[ BÔ\u0006Û©\u0081ûö\u0003\u0005ÑÆ\rrì+«{iØoi]\u009eOn\u008c\u0002\u0097\u008d\u0012U\u0016º,j\u009fu\u0002\u00adØ÷7ÀØ\u008bdØ\u00848\u0083ë\u008fÈ\u0015)\u00adRØ\u008cHY|ZéU`\u0015'Ù?\\99ná\u0000«\u000fvXÍ\u009c\bÒâÛÌùÚ¶åWM¤ëÀ\u0088>ÂÓ`\t½dQ¡ë\u0088Ý§\u008cö\u000e¨\u0093c\u009c\u009d$\t\u008a\bQ©%ao´\u000f-\u0013ïÔv\u0012ÞÏ\u0001ÙL!\u009b\bÁ\u0007\u0091\u0082i\u0003w°ËdB\u0013õÜò,\u0083\u0015è#tä\u0006O¾ÒéB]\u00119°ðÚõZvôÁñ3êÕ\u0001³\u0086\u008f\u001aÅ~\u009fÄú\u0016|j:\u0096\u008eÉÆ[\u0007\u0016).s\u009e\u0006\u001d±îÕ®\u0084\u009b¢\u001fË\u009a\u009f\u0098û\t#<Î1Ã9\u0096C|QO²\u001a+¾\u0013¯\u008bÅ(K5*\u0095`Ì¯È<Ñ\u0095ûoR\u001a\u0085}\u009a¯ÚP\u0086¥aµìö¤ß=ÙA§ßB$>bÏ\u0097R\u0000\u009fWfIeo\u008aa®lÍéå"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            IIlI = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               IIlI[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var5 = new String[lIIl(1460401563, var24 ^ -804738311)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lIlI(532801498, -803591084, -524441005)).length();
            int var1 = 4;
            int var26 = -1;

            label100:
            while (true) {
               int var29 = lIIl(1460401562, var24 ^ 25529521);
               String var10001 = var2.substring(++var26, var26 + var1);
               byte var10002 = -1;

               while (true) {
                  label95: {
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
                           break label95;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lIIl(1460401566, var24 ^ 633839237)) {
                           case 0 -> lIIl(1460401553, var24 ^ 707817283);
                           case 1 -> lIIl(1460401552, var24 ^ 1190812148);
                           case 2 -> lIIl(1460401555, var24 ^ 1259969136);
                           case 3 -> lIIl(1460401554, var24 ^ -1179364958);
                           case 4 -> lIIl(1460401557, var24 ^ 1395818038);
                           case 5 -> lIIl(1460401556, var24 ^ -126393915);
                           default -> lIIl(1460401559, var24 ^ 150408621);
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
                           ll = var5;
                           lII = new String[lIIl(1460401567, var24 ^ 447829908)];
                           return;
                        }

                        var1 = var2.charAt(var26);
                        break;
                     default:
                        var5[var3++] = var50;
                        if ((var26 += var1) < var4) {
                           var1 = var2.charAt(var26);
                           continue label100;
                        }

                        var4 = (var2 = lIlI(532801499, 1248973813, -1601725663)).length();
                        var1 = lIIl(1460401565, var24 ^ -1959950318);
                        var26 = -1;
                  }

                  var29 = lIIl(1460401564, var24 ^ -1181749396);
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
               short var23 = switch (var22 % 5) {
                  default -> 96;
                  case 1 -> 220;
                  case 2 -> 201;
                  case 3 -> 216;
                  case 4 -> 65;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private boolean IlII(class_1657 var1) {
      if (var1 == null) {
         return false;
      } else {
         return !var1.method_24828() && !var1.method_6101() && !var1.method_5799() && !var1.method_5771() && !var1.method_6128()
            ? var1.field_6017 > 0.0 || var1.method_18798().field_1351 < -0.05
            : false;
      }
   }

   private double IlIl(class_238 var1, class_2338 var2) {
      double var3 = Math.max(var1.field_1322, var1.field_1325 - 0.8);
      double var5 = Math.max(0.0, Math.min(var1.field_1320, var2.method_10263() + 1.0) - Math.max(var1.field_1323, (double)var2.method_10263()));
      double var7 = Math.max(0.0, Math.min(var1.field_1325, var2.method_10264() + 1.0) - Math.max(var3, (double)var2.method_10264()));
      double var9 = Math.max(0.0, Math.min(var1.field_1324, var2.method_10260() + 1.0) - Math.max(var1.field_1321, (double)var2.method_10260()));
      return var5 * var7 * var9;
   }

   private long IllI(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();
      return var2 == var4 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private boolean Illl(class_310 var1, int var2, int var3) {
      long var4 = System.currentTimeMillis();
      if (this.III != var2 || this.lI != var3) {
         this.III = var2;
         this.lI = var3;
         boolean var6 = k74.x.IIll.lIIlI(var1) != var3;
         this.I = var4 + (var6 ? this.IllI(this.lIl) : 0L);
         this.II = Long.MIN_VALUE;
      }

      if (var4 < this.I) {
         return false;
      } else {
         if (this.II == Long.MIN_VALUE) {
            this.II = var4 + this.IllI(this.Il);
         }

         return var4 >= this.II;
      }
   }

   private boolean lIII(class_310 var1, class_243 var2) {
      double var3 = Math.max(0.0, var1.field_1724.method_55754() - 0.1);
      return var1.field_1724.method_33571().method_1025(var2) <= var3 * var3;
   }
}
