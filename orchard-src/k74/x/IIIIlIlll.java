package k74.x;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_745;

@Environment(EnvType.CLIENT)
public final class IIIIlIlll extends IlIIIIIIl {
   private final lllIIlII I;
   private static final int[] IIII;
   private static String[] II;
   private static final String[] Il;
   private static final Object[] IIlI;
   private static final String[] lI;
   private final IIlIII ll;
   private static final String[] IIIl;
   private final lllIIlII III;
   private final lllIIlII IIl;
   private final IIlIII IlI;
   private final IIIlIIlll Ill;
   private final IIlIII lII;
   private final lllIIlII lIl;
   private final List<IIllIIIlI> llI;
   private final IIIlIIlll lll;

   @Override
   public void IlI(lIIlIl var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (this.IIIIlIl() && (this.lIl.IllI() || this.III.IllI()) && IlIII.IIIIII(var1)) {
         class_310 var3 = class_310.method_1551();
         if (var3.field_1687 != null && var3.field_1724 != null && var1.llI() != null) {
            long var4 = System.currentTimeMillis();
            long var6 = this.lIl();
            Iterator var8 = this.llI.iterator();

            while (var8.hasNext()) {
               IIllIIIlI var9 = (IIllIIIlI)var8.next();
               if (var9.l() + var6 <= var4 || var9.Il().method_73183() != var3.field_1687) {
                  var8.remove();
                  if (var2 == null) {
                     continue;
                  }
               }

               this.lI(var1, var9, var4, var6);
               if (var2 != null) {
                  break;
               }
            }
         } else {
            this.llI.clear();
         }
      }
   }

   private static boolean I(long var0, long var2, class_310 var4, IIllIIIlI var5) {
      return var5.l() + var0 <= var2 || var5.Il().method_73183() != var4.field_1687;
   }

   private static String l(char[] var0, long var1, int var3) {
      int var4 = IIII(399528261, 1175199752 ^ -1335473841) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIII(399528260, 1175199752 ^ -713128805);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String IIIl(int var0, int var1) {
      int var3 = var0 ^ 150082958;
      char[] var4 = IIIl[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIlI[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIlI[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 318772277;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 239;
            case 1 -> 240;
            case 2 -> 238;
            case 3 -> 86;
            case 4 -> 211;
            case 5 -> 158;
            case 6 -> 17;
            case 7 -> 143;
            case 8 -> 6;
            case 9 -> 97;
            case 10 -> 251;
            case 11 -> 9;
            case 12 -> 104;
            case 13 -> 170;
            case 14 -> 208;
            case 15 -> 59;
            case 16 -> 52;
            case 17 -> 112;
            case 18 -> 113;
            case 19 -> 20;
            case 20 -> 22;
            case 21 -> 3;
            case 22 -> 255;
            case 23 -> 32;
            case 24 -> 246;
            case 25 -> 91;
            case 26 -> 117;
            case 27 -> 52;
            case 28 -> 95;
            case 29 -> 143;
            case 30 -> 1;
            case 31 -> 157;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public void llIl() {
      this.llI.clear();
   }

   private static void II() {
      int var0 = 703439287;
      II[0] = l(Il(IIII(399528263, var0 ^ 768824408), IIII(399528262, var0 ^ 646011534)).toCharArray(), 61627L, IIII(399528257, var0 ^ -542923761));
      II[1] = l(Il(IIII(399528256, var0 ^ -1294954603), IIII(399528259, var0 ^ 661701674)).toCharArray(), 56124L, IIII(399528258, var0 ^ -1841699693));
      II[2] = l(Il(IIII(399528269, var0 ^ 1666863656), IIII(399528268, var0 ^ -1975829488)).toCharArray(), 98757L, IIII(399528271, var0 ^ -1107170311));
      II[3] = l(Il(IIII(399528270, var0 ^ 1405370425), IIII(399528265, var0 ^ 1374668106)).toCharArray(), 59058L, IIII(399528264, var0 ^ -2112035652));
      II[4] = l(Il(IIII(399528267, var0 ^ 597274691), IIII(399528266, var0 ^ -1305683753)).toCharArray(), 27463L, IIII(399528277, var0 ^ -525611302));
      II[5] = l(Il(IIII(399528276, var0 ^ 761114301), IIII(399528279, var0 ^ -1170281755)).toCharArray(), 5452L, IIII(399528278, var0 ^ 1410106934));
      II[IIII(399528273, var0 ^ 770895193)] = l(
         Il(IIII(399528272, var0 ^ 1384978591), IIII(399528275, var0 ^ 997746186)).toCharArray(), 9642L, IIII(399528274, var0 ^ 1305766312)
      );
      II[IIII(399528285, var0 ^ -1774760127)] = l(
         Il(IIII(399528284, var0 ^ -369150371), IIII(399528287, var0 ^ -301368793)).toCharArray(), 90644L, IIII(399528286, var0 ^ 800842564)
      );
      II[IIII(399528281, var0 ^ -822115231)] = l(
         Il(IIII(399528280, var0 ^ -219476898), IIII(399528283, var0 ^ 736081515)).toCharArray(), 76800L, IIII(399528282, var0 ^ 1175445603)
      );
      II[IIII(399528293, var0 ^ -1544092703)] = l(
         Il(IIII(399528292, var0 ^ 370743637), IIII(399528295, var0 ^ -802573405)).toCharArray(), 76810L, IIII(399528294, var0 ^ -190631117)
      );
      II[IIII(399528289, var0 ^ -941199108)] = l(
         Il(IIII(399528288, var0 ^ 1046094292), IIII(399528291, var0 ^ 103659914)).toCharArray(), 7827L, IIII(399528290, var0 ^ -1637556373)
      );
      II[IIII(399528301, var0 ^ 184200801)] = l(
         Il(IIII(399528300, var0 ^ -1182701230), IIII(399528303, var0 ^ -529623536)).toCharArray(), 15748L, IIII(399528302, var0 ^ -44595924)
      );
      II[IIII(399528297, var0 ^ -2062492713)] = l(
         Il(IIII(399528296, var0 ^ -1390487803), IIII(399528299, var0 ^ -1735927993)).toCharArray(), 31709L, IIII(399528298, var0 ^ 2094657600)
      );
      II[IIII(399528309, var0 ^ 1524315095)] = l("".toCharArray(), 28606L, IIII(399528308, var0 ^ -1493446446));
   }

   private static String Il(int var0, int var1) {
      int var9 = 290953205;
      int var2 = (var0 ^ IIII(399528311, var9 ^ 687466285)) & IIII(399528310, var9 ^ 341823754);
      if (lI[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & IIII(399528305, var9 ^ 1827509255)) {
            case 0 -> IIII(399528304, var9 ^ -462130917);
            case 1 -> IIII(399528307, var9 ^ -667452900);
            case 2 -> IIII(399528306, var9 ^ -1665958469);
            case 3 -> IIII(399528317, var9 ^ -1616059886);
            case 4 -> IIII(399528316, var9 ^ 1330625184);
            case 5 -> IIII(399528319, var9 ^ 737967508);
            case 6 -> IIII(399528318, var9 ^ 1737014918);
            case 7 -> IIII(399528313, var9 ^ -729060353);
            case 8 -> IIII(399528312, var9 ^ 2146109461);
            case 9 -> IIII(399528315, var9 ^ -1435754880);
            case 10 -> IIII(399528314, var9 ^ -1448534943);
            case 11 -> IIII(399528197, var9 ^ 1773220807);
            case 12 -> IIII(399528196, var9 ^ -2030217826);
            case 13 -> IIII(399528199, var9 ^ 1665086686);
            case 14 -> IIII(399528198, var9 ^ -554051088);
            case 15 -> IIII(399528193, var9 ^ 1436206151);
            case 16 -> IIII(399528192, var9 ^ 1397380185);
            case 17 -> IIII(399528195, var9 ^ -1323844514);
            case 18 -> IIII(399528194, var9 ^ 1458452027);
            case 19 -> IIII(399528205, var9 ^ 1681260045);
            case 20 -> IIII(399528204, var9 ^ -2098516300);
            case 21 -> IIII(399528207, var9 ^ 1880752646);
            case 22 -> IIII(399528206, var9 ^ 656995287);
            case 23 -> IIII(399528201, var9 ^ 90383156);
            case 24 -> IIII(399528200, var9 ^ 673790235);
            case 25 -> IIII(399528203, var9 ^ 1852562438);
            case 26 -> IIII(399528202, var9 ^ 461304145);
            case 27 -> IIII(399528213, var9 ^ -238892773);
            case 28 -> IIII(399528212, var9 ^ 1649285439);
            case 29 -> IIII(399528215, var9 ^ 1091603720);
            case 30 -> IIII(399528214, var9 ^ -1716415119);
            case 31 -> IIII(399528209, var9 ^ -1441168283);
            case 32 -> IIII(399528208, var9 ^ -1823102884);
            case 33 -> IIII(399528211, var9 ^ -1767918366);
            case 34 -> IIII(399528210, var9 ^ 1800238720);
            case 35 -> IIII(399528221, var9 ^ -1837654410);
            case 36 -> IIII(399528220, var9 ^ -786210682);
            case 37 -> IIII(399528223, var9 ^ -725074127);
            case 38 -> IIII(399528222, var9 ^ 205545335);
            case 39 -> IIII(399528217, var9 ^ 1026130833);
            case 40 -> IIII(399528216, var9 ^ 1283693794);
            case 41 -> IIII(399528219, var9 ^ -789242383);
            case 42 -> IIII(399528218, var9 ^ -1239901203);
            case 43 -> IIII(399528229, var9 ^ -895341285);
            case 44 -> IIII(399528228, var9 ^ -1235527070);
            case 45 -> IIII(399528231, var9 ^ -1206100189);
            case 46 -> IIII(399528230, var9 ^ 762801442);
            case 47 -> IIII(399528225, var9 ^ 2031961922);
            case 48 -> IIII(399528224, var9 ^ -1044950262);
            case 49 -> IIII(399528227, var9 ^ -1646272462);
            case 50 -> IIII(399528226, var9 ^ -1351539449);
            case 51 -> IIII(399528237, var9 ^ 1658821994);
            case 52 -> IIII(399528236, var9 ^ -1046587522);
            case 53 -> IIII(399528239, var9 ^ -2055911485);
            case 54 -> IIII(399528238, var9 ^ -1861382774);
            case 55 -> IIII(399528233, var9 ^ 457246653);
            case 56 -> IIII(399528232, var9 ^ 806211304);
            case 57 -> IIII(399528235, var9 ^ -1272962753);
            case 58 -> IIII(399528234, var9 ^ -592167277);
            case 59 -> IIII(399528245, var9 ^ -980184502);
            case 60 -> IIII(399528244, var9 ^ -1146627850);
            case 61 -> IIII(399528247, var9 ^ 1392461876);
            case 62 -> IIII(399528246, var9 ^ 238171821);
            case 63 -> IIII(399528241, var9 ^ -203584627);
            case 64 -> IIII(399528240, var9 ^ -939336826);
            case 65 -> 1;
            case 66 -> IIII(399528243, var9 ^ 224217696);
            case 67 -> IIII(399528242, var9 ^ 844472546);
            case 68 -> IIII(399528253, var9 ^ 170289453);
            case 69 -> IIII(399528252, var9 ^ -273519720);
            case 70 -> IIII(399528255, var9 ^ -1591026703);
            case 71 -> 4;
            case 72 -> IIII(399528254, var9 ^ -1105391931);
            case 73 -> IIII(399528249, var9 ^ -1949913750);
            case 74 -> IIII(399528248, var9 ^ 1627943465);
            case 75 -> IIII(399528251, var9 ^ -1971540751);
            case 76 -> IIII(399528250, var9 ^ 551391180);
            case 77 -> IIII(399528389, var9 ^ -1823896636);
            case 78 -> IIII(399528388, var9 ^ -1457102119);
            case 79 -> IIII(399528391, var9 ^ -1070953216);
            case 80 -> IIII(399528390, var9 ^ 1130609791);
            case 81 -> IIII(399528385, var9 ^ -1110165962);
            case 82 -> IIII(399528384, var9 ^ -1203125817);
            case 83 -> IIII(399528387, var9 ^ -1285063479);
            case 84 -> IIII(399528386, var9 ^ 1688116998);
            case 85 -> IIII(399528397, var9 ^ 2046856922);
            case 86 -> IIII(399528396, var9 ^ 1336126356);
            case 87 -> IIII(399528399, var9 ^ 547194707);
            case 88 -> IIII(399528398, var9 ^ 696351343);
            case 89 -> IIII(399528393, var9 ^ -723946719);
            case 90 -> IIII(399528392, var9 ^ 2063999901);
            case 91 -> IIII(399528395, var9 ^ -613358344);
            case 92 -> IIII(399528394, var9 ^ -1418439156);
            case 93 -> IIII(399528405, var9 ^ 995900727);
            case 94 -> 0;
            case 95 -> IIII(399528404, var9 ^ -2093882129);
            case 96 -> IIII(399528407, var9 ^ -838694702);
            case 97 -> IIII(399528406, var9 ^ -324622917);
            case 98 -> IIII(399528401, var9 ^ 1449764055);
            case 99 -> IIII(399528400, var9 ^ 1380084657);
            case 100 -> IIII(399528403, var9 ^ -471275761);
            case 101 -> IIII(399528402, var9 ^ 1270242816);
            case 102 -> IIII(399528413, var9 ^ 1919926228);
            case 103 -> IIII(399528412, var9 ^ -332356514);
            case 104 -> IIII(399528415, var9 ^ 667022117);
            case 105 -> IIII(399528414, var9 ^ -1111264961);
            case 106 -> IIII(399528409, var9 ^ -1100350367);
            case 107 -> IIII(399528408, var9 ^ 714738220);
            case 108 -> IIII(399528411, var9 ^ -1233911352);
            case 109 -> IIII(399528410, var9 ^ -998591861);
            case 110 -> IIII(399528421, var9 ^ 556221663);
            case 111 -> IIII(399528420, var9 ^ -349567838);
            case 112 -> IIII(399528423, var9 ^ -92895862);
            case 113 -> IIII(399528422, var9 ^ -1959498925);
            case 114 -> IIII(399528417, var9 ^ -442570847);
            case 115 -> IIII(399528416, var9 ^ 847093281);
            case 116 -> IIII(399528419, var9 ^ -150901673);
            case 117 -> IIII(399528418, var9 ^ -657645792);
            case 118 -> IIII(399528429, var9 ^ 1527681200);
            case 119 -> IIII(399528428, var9 ^ -124480959);
            case 120 -> IIII(399528431, var9 ^ -757177289);
            case 121 -> IIII(399528430, var9 ^ 1050860570);
            case 122 -> IIII(399528425, var9 ^ 1764315685);
            case 123 -> IIII(399528424, var9 ^ 290063186);
            case 124 -> IIII(399528427, var9 ^ -1601029700);
            case 125 -> IIII(399528426, var9 ^ 923963957);
            case 126 -> IIII(399528437, var9 ^ -485228957);
            case 127 -> IIII(399528436, var9 ^ 1094353688);
            case 128 -> IIII(399528439, var9 ^ -81025635);
            case 129 -> IIII(399528438, var9 ^ 404571905);
            case 130 -> IIII(399528433, var9 ^ 2066856437);
            case 131 -> IIII(399528432, var9 ^ -1504764140);
            case 132 -> IIII(399528435, var9 ^ 1715129842);
            case 133 -> IIII(399528434, var9 ^ -1531969838);
            case 134 -> IIII(399528445, var9 ^ 928706960);
            case 135 -> IIII(399528444, var9 ^ 345867455);
            case 136 -> IIII(399528447, var9 ^ -1208710099);
            case 137 -> IIII(399528446, var9 ^ 734738141);
            case 138 -> IIII(399528441, var9 ^ -139998109);
            case 139 -> IIII(399528440, var9 ^ 519271093);
            case 140 -> IIII(399528443, var9 ^ -1916515505);
            case 141 -> IIII(399528442, var9 ^ 1338225145);
            case 142 -> IIII(399528325, var9 ^ 1409502175);
            case 143 -> IIII(399528324, var9 ^ 1655637251);
            case 144 -> IIII(399528327, var9 ^ 2012319553);
            case 145 -> IIII(399528326, var9 ^ 1781401962);
            case 146 -> IIII(399528321, var9 ^ -2118260602);
            case 147 -> IIII(399528320, var9 ^ -204562667);
            case 148 -> IIII(399528323, var9 ^ -1089893461);
            case 149 -> IIII(399528322, var9 ^ 875232860);
            case 150 -> IIII(399528333, var9 ^ -1658708389);
            case 151 -> IIII(399528332, var9 ^ 1882024282);
            case 152 -> IIII(399528335, var9 ^ 534605253);
            case 153 -> IIII(399528334, var9 ^ -1514236007);
            case 154 -> IIII(399528329, var9 ^ 1691801106);
            case 155 -> IIII(399528328, var9 ^ 1061608644);
            case 156 -> IIII(399528331, var9 ^ 1442310379);
            case 157 -> IIII(399528330, var9 ^ -251642321);
            case 158 -> IIII(399528341, var9 ^ 1734568527);
            case 159 -> IIII(399528340, var9 ^ 1913292577);
            case 160 -> IIII(399528343, var9 ^ 1115582007);
            case 161 -> IIII(399528342, var9 ^ 1769322461);
            case 162 -> IIII(399528337, var9 ^ -396354282);
            case 163 -> IIII(399528336, var9 ^ -527591739);
            case 164 -> IIII(399528339, var9 ^ 602496026);
            case 165 -> 3;
            case 166 -> IIII(399528338, var9 ^ -88101904);
            case 167 -> IIII(399528349, var9 ^ -818285208);
            case 168 -> IIII(399528348, var9 ^ -620524189);
            case 169 -> IIII(399528351, var9 ^ 297954147);
            case 170 -> IIII(399528350, var9 ^ 455566621);
            case 171 -> IIII(399528345, var9 ^ -1574638215);
            case 172 -> IIII(399528344, var9 ^ 960939604);
            case 173 -> IIII(399528347, var9 ^ -440021381);
            case 174 -> IIII(399528346, var9 ^ 1314220814);
            case 175 -> IIII(399528357, var9 ^ 1694624164);
            case 176 -> IIII(399528356, var9 ^ 1107455170);
            case 177 -> IIII(399528359, var9 ^ -1739178927);
            case 178 -> IIII(399528358, var9 ^ 1446187752);
            case 179 -> IIII(399528353, var9 ^ -25150238);
            case 180 -> IIII(399528352, var9 ^ -76896026);
            case 181 -> IIII(399528355, var9 ^ -566700029);
            case 182 -> IIII(399528354, var9 ^ -1388369007);
            case 183 -> IIII(399528365, var9 ^ 992418067);
            case 184 -> IIII(399528364, var9 ^ 1046692110);
            case 185 -> IIII(399528367, var9 ^ 601899788);
            case 186 -> IIII(399528366, var9 ^ -692473254);
            case 187 -> IIII(399528361, var9 ^ -1229589276);
            case 188 -> IIII(399528360, var9 ^ 1534132798);
            case 189 -> IIII(399528363, var9 ^ -1526118107);
            case 190 -> IIII(399528362, var9 ^ -453421959);
            case 191 -> IIII(399528373, var9 ^ 2051633614);
            case 192 -> IIII(399528372, var9 ^ 1232896903);
            case 193 -> IIII(399528375, var9 ^ 309236077);
            case 194 -> IIII(399528374, var9 ^ -448957914);
            case 195 -> IIII(399528369, var9 ^ 23225729);
            case 196 -> IIII(399528368, var9 ^ 1077791523);
            case 197 -> IIII(399528371, var9 ^ 214873208);
            case 198 -> IIII(399528370, var9 ^ 1846269476);
            case 199 -> IIII(399528381, var9 ^ -827389773);
            case 200 -> IIII(399528380, var9 ^ -23679615);
            case 201 -> IIII(399528383, var9 ^ 1479843386);
            case 202 -> IIII(399528382, var9 ^ 2105374894);
            case 203 -> IIII(399528377, var9 ^ 553687348);
            case 204 -> IIII(399528376, var9 ^ -227323959);
            case 205 -> IIII(399528379, var9 ^ 464906521);
            case 206 -> 2;
            case 207 -> IIII(399528378, var9 ^ -237508093);
            case 208 -> IIII(399528005, var9 ^ 1211025006);
            case 209 -> IIII(399528004, var9 ^ -2024396544);
            case 210 -> IIII(399528007, var9 ^ -339968894);
            case 211 -> IIII(399528006, var9 ^ 475261953);
            case 212 -> IIII(399528001, var9 ^ -1422846749);
            case 213 -> IIII(399528000, var9 ^ -1191974990);
            case 214 -> IIII(399528003, var9 ^ 744551755);
            case 215 -> IIII(399528002, var9 ^ -200186109);
            case 216 -> IIII(399528013, var9 ^ 651155316);
            case 217 -> IIII(399528012, var9 ^ -1096467138);
            case 218 -> IIII(399528015, var9 ^ -102484935);
            case 219 -> IIII(399528014, var9 ^ -1227143845);
            case 220 -> IIII(399528009, var9 ^ 970520400);
            case 221 -> IIII(399528008, var9 ^ 1907879775);
            case 222 -> IIII(399528011, var9 ^ 66354982);
            case 223 -> IIII(399528010, var9 ^ 578061252);
            case 224 -> IIII(399528021, var9 ^ 559447269);
            case 225 -> IIII(399528020, var9 ^ -349786046);
            case 226 -> IIII(399528023, var9 ^ 1689959387);
            case 227 -> IIII(399528022, var9 ^ 1970548378);
            case 228 -> IIII(399528017, var9 ^ 1563756237);
            case 229 -> IIII(399528016, var9 ^ 869752837);
            case 230 -> IIII(399528019, var9 ^ -1278595800);
            case 231 -> IIII(399528018, var9 ^ -88338294);
            case 232 -> IIII(399528029, var9 ^ 57638941);
            case 233 -> IIII(399528028, var9 ^ 99445903);
            case 234 -> IIII(399528031, var9 ^ -974564106);
            case 235 -> IIII(399528030, var9 ^ 676206956);
            case 236 -> IIII(399528025, var9 ^ 123944936);
            case 237 -> IIII(399528024, var9 ^ -218274904);
            case 238 -> IIII(399528027, var9 ^ -1016006284);
            case 239 -> IIII(399528026, var9 ^ 559527739);
            case 240 -> IIII(399528037, var9 ^ -1045336571);
            case 241 -> IIII(399528036, var9 ^ 283866857);
            case 242 -> IIII(399528039, var9 ^ -2037242037);
            case 243 -> IIII(399528038, var9 ^ -1182928584);
            case 244 -> IIII(399528033, var9 ^ -1965677771);
            case 245 -> IIII(399528032, var9 ^ 292908716);
            case 246 -> 5;
            case 247 -> IIII(399528035, var9 ^ 1030122277);
            case 248 -> IIII(399528034, var9 ^ -1682110783);
            case 249 -> IIII(399528045, var9 ^ -240467807);
            case 250 -> IIII(399528044, var9 ^ 250247178);
            case 251 -> IIII(399528047, var9 ^ -252163786);
            case 252 -> IIII(399528046, var9 ^ -1366107468);
            case 253 -> IIII(399528041, var9 ^ 2029008757);
            case 254 -> IIII(399528040, var9 ^ 58415523);
            default -> IIII(399528043, var9 ^ -373301848);
         };
         int var5 = (var1 & IIII(399528042, var9 ^ -2856606)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIII(399528053, var9 ^ 255731643)) >>> IIII(399528052, var9 ^ 885107455)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIII(399528055, var9 ^ -1083122386);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIII(399528054, var9 ^ -1212964445);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   @Override
   public String IlIIl() {
      return II[IIII(399528049, 1924479501 ^ 659312030)];
   }

   private void lI(lIIlIl var1, IIllIIIlI var2, long var3, long var5) {
      float var7 = Math.min(1.0F, (float)(var3 - var2.l()) / (float)var5);
      float var8 = 1.0F - var7;
      if (!(var8 <= 0.0F)) {
         double var9 = this.lII.IllI() * var7;
         float var11 = var2.Il().method_17681() * 0.5F;
         float var12 = var2.Il().method_17682();
         if (!(var11 <= 0.0F) && !(var12 <= 0.0F)) {
            class_243 var13 = new class_243(var2.lI(), var2.II() + var9 + var12 * 0.5, var2.ll());
            if (this.lIl.IllI()) {
               Color var14 = this.III(var2, var7);
               IlIII.lllI(var1, var13, var11, var12, var2.I(), var14, (int)(var14.getAlpha() * var8));
            }

            if (this.III.IllI()) {
               Color var15 = this.lll(var2, var7);
               IlIII.IIIl(var1, var13, var11, var12, var2.I(), var15, (int)(var15.getAlpha() * var8), this.ll.IllI().floatValue());
            }
         }
      }
   }

   public void ll(class_1657 var1) {
      if (this.IIIIlIl()) {
         class_310 var2 = class_310.method_1551();
         if (var2.field_1687 != null && var2.field_1724 != null && var1 != null && !var1.method_31481() && var1.method_5805()) {
            if (var1 != var2.field_1724 || this.IIl.IllI()) {
               this.llI.add(this.IIl(var1, var2));
            }
         }
      }
   }

   public IIIIlIlll() {
      int var1 = -943946530;
      super(IlIIllIII.Ill(II[0]), lllIIlIl.IIl, IlIIllIII.Ill(II[5]));
      this.lIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(II[IIII(399527942, var1 ^ 103091087)]), true));
      this.I = this.IllIIll(new lllIIlII(IlIIllIII.Ill(II[IIII(399527937, var1 ^ 788711352)]), true));
      this.Ill = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(II[2]),
            new Color(
               IIII(399527936, var1 ^ 1159392336), IIII(399527939, var1 ^ 567184556), IIII(399527938, var1 ^ 1541976569), IIII(399527949, var1 ^ -1672987370)
            )
         )
      );
      this.III = this.IllIIll(new lllIIlII(IlIIllIII.Ill(II[IIII(399527948, var1 ^ -989242958)]), true));
      this.lll = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(II[IIII(399527951, var1 ^ -1249634441)]),
            new Color(
               IIII(399527950, var1 ^ 1583749199), IIII(399527945, var1 ^ 544936141), IIII(399527944, var1 ^ 258729986), IIII(399527947, var1 ^ -82441062)
            )
         )
      );
      this.ll = this.IllIIll(new IIlIII(IlIIllIII.Ill(II[IIII(399527946, var1 ^ 803419277)]), 1.5, 0.5, 6.0, 0.1));
      this.IlI = this.IllIIll(new IIlIII(IlIIllIII.Ill(II[1]), 1500.0, 100.0, 5000.0, 50.0).IlII(IlIIllIII.lI(II[4])));
      this.lII = this.IllIIll(new IIlIII(IlIIllIII.Ill(II[IIII(399527957, var1 ^ -879260812)]), 0.0, -2.0, 2.0, 0.05).IlII(IlIIllIII.lI(II[3])));
      this.IIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(II[IIII(399527956, var1 ^ 1179170622)]), false));
      this.llI = new ArrayList<>();
      this.Ill.lIlI(this::llI);
      this.lll.lIlI(this::Ill);
      this.ll.lIlI(this.III::IllI);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1576830622;
      int var8 = "Ö㷛ᄰ簀갇ᎋ朙\uf173ʈম뮃ㅯ⦵❒௮⛗匓퍞ﵾ\uec8a䂂剧怄䄳뻹緈▌べꐨ\ued2b渫㻔㭺\uf3c0퉳症깡⽥閤饴ꡳ䬣싷冝\uebe7燎\ue57a덤蘿Ȣ﮾彨ⶫ없썒ꆃ钱殚슞\ue29cေ拐\uf8c3嵦舦\ud7c9त䴋ۚ\uea05硒곐ࡲ猉\uec04\u2060᧖놅歐㞁㖀일饱痢삳洺⬽窢\udd1f\uf019퉟焘쭭觭걌츠裀솓\uecd1㈛榀踇⸢早棐䮷⨲選굚\uf41a\ue1bfᄳ㳱\u038bﻖ꺙䛡ꡭ䁬旮㯘슺\uf7fb籣챘\u17fa挕惰쟎\uf40a礖∌㱙ᄫ\ua878个셜鸴\udb03힅♼죐挛飐읫幸䱐견绷䃅Z\udb2bƬ뼝쓋ᓻ异莰踟\ue4b2슚睾㗌\ue566标뷉\ue330㌇弟漿㍔렻\uec5e쐳\ue2fa뤂携ᛳ鏥瘪苠엕폆\uf431㻟唏\u0a64眀Ⱛ뉞뜔ꂝ\uebb4ᣬ챃錜㸟\ude09⸁ﯰི戞맗ശ艙ꤴૺ⁐\uea4cω琢瘉眖ऩꧨ\u001d檓菟ǔ뵆ፏ缘榤酺䁏\ue434﮺ጼ⌰뿠ﮚ襣⧣嘸⩖\u009c\ue910涤坐뻉ꗞꏳ칑෬╬"
         .length();
      String[] var9 = new String[2];
      byte var12 = 15;
      int var11 = 0;
      int var10 = 0;
      String var7 = "Ö㷛ᄰ簀갇ᎋ朙\uf173ʈম뮃ㅯ⦵❒௮⛗匓퍞ﵾ\uec8a䂂剧怄䄳뻹緈▌べꐨ\ued2b渫㻔㭺\uf3c0퉳症깡⽥閤饴ꡳ䬣싷冝\uebe7燎\ue57a덤蘿Ȣ﮾彨ⶫ없썒ꆃ钱殚슞\ue29cေ拐\uf8c3嵦舦\ud7c9त䴋ۚ\uea05硒곐ࡲ猉\uec04\u2060᧖놅歐㞁㖀일饱痢삳洺⬽窢\udd1f\uf019퉟焘쭭觭걌츠裀솓\uecd1㈛榀踇⸢早棐䮷⨲選굚\uf41a\ue1bfᄳ㳱\u038bﻖ꺙䛡ꡭ䁬旮㯘슺\uf7fb籣챘\u17fa挕惰쟎\uf40a礖∌㱙ᄫ\ua878个셜鸴\udb03힅♼죐挛飐읫幸䱐견绷䃅Z\udb2bƬ뼝쓋ᓻ异莰踟\ue4b2슚睾㗌\ue566标뷉\ue330㌇弟漿㍔렻\uec5e쐳\ue2fa뤂携ᛳ鏥瘪苠엕폆\uf431㻟唏\u0a64眀Ⱛ뉞뜔ꂝ\uebb4ᣬ챃錜㸟\ude09⸁ﯰི戞맗ശ艙ꤴૺ⁐\uea4cω琢瘉眖ऩꧨ\u001d檓菟ǔ뵆ፏ缘榤酺䁏\ue434﮺ጼ⌰뿠ﮚ襣⧣嘸⩖\u009c\ue910涤坐뻉ꗞꏳ칑෬╬";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

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

      IIIl = var9;
      IIlI = new Object[var9.length];
      IIII = new int[344];
      int var10000 = 0;
      int var10001 = 0;
      byte[] var10002 = "ZC\u0017\u0001Üµ¬\u009dKù\u0095µ@«v_\u007f\"ÿ»ÔúNbAZ~ÉPÈ\u0083\u0094\u0005p\u0093×ì\u0011¥\u000f¶)úi5î\u0081ÙÈ:\u008b$hvS\u0015E³q¾Ô\u0006/u©W\u001f\u0010Kwo\\#ë\u0098Ì\u0014Ja=KØEþ4§Ù\u007f]R\u0083\b=\u0097Hbð\u001dçé\u008fÕ÷®wÜ=²\u008b,\u0086!¨Õ,Ì\u0094ÁÍ·Mõj¾=eÃúÅÝ«op3Ø\u0082¶\u0003\u0007Éè\\^×¡ÌØwXpà\u001c\u009fø\u008eþ\u007fsYXlÐ\u0006åß«¨\u0082y»Ô\u0096N£[ªã:sVË4\u0016Àþ\u00adq\u001f\u0010\u009b3 <ñ\u009bM`ã\u0087fvi\u0010®JÎOÃ2}\u000bÉºäï4\u0086§äKÂ#ãjÁ<}ã\u0011ß$Áulã\u00039\u0018 \u0096\u008a\u001bõ\u0090!{\u0096Ùôü\u0080é÷9\u0083\u009b7!\u00adÖØmË\u0097=¯«I\u0080iG\u008f\u000b\nZ+\rÚÊYï\u0087\"s\b~¨\u0016:¥`ÝÜ{°X.\u008a\u009cÇy¸m\u0097[ó¼¼v¹¦\u00820ûBÍEîoì¯RW\u0015<Þ\u0087W\u001f\u0080\u0013¾Ç!\nîô\u0089\u001a\u0084ÍÅ6\u0018È\u000f*\u00975ÝèÌÌç\u0000@\u008f³þn\u008aX ©RÐÁCc¹\u001c1\u0012\u0013\u0002þ\u008ee\u0083Ìè\u0088\u0005R\u00942³\u0005èËÄ¿æ\u008cÁæsçóÒ'\u008dÙº\u009f'ÍWÃO~Ëñá»\u0089<O\u0002Ô\u009f\u000eÉMÛåÙ\nÏ\u009d\u0013öEÑ\u0099×n\u009dPôê°¿~\u0082$ Ì\u009b\u0003\f¹å7FÓ\foÖðP¢©\u0019\u00adM\u0015x\u0096\u0092EêSÍÔ÷lÅ>%T¶÷\b±\"õ\u0088ÿºEhà\u008d\u0090ªÕV31?\u0098ì\u001eÔì2Ð~M\u00113ÍÙ\u0014\u0082÷¶ý\u0081\u009eº\u0013½\u001dó#\u0003ãD¨®æÙ_Lí÷â§:\u000e\u0001´$\u0090\u0011\u0081\u001135¦~\r\u0019rw\u0011äè\u008aIíî%\u0096½.\u0085àzòõäÈÁeÌ£õÝ¡zÆ\u0090\u0092\u0016J²6;'\bù;\u009b\fÒõÈ½xy\u009c\u0015&À\u001e,ÿ!D² :MyQm§ãSïÄàùbdt\n\u0094¯èä\u009e\u0089\u009aê-é\u007f·ÚVµº\u009aL¤æ\u001bZÕ¤õx»\u000ey\u0095lí\u0000à©\u0091òª\u0086]\u0081ñ\u0005\u009e\u000e\u0085¦\u0004\fB\u008cNúè`2C\u007f7¹ÍJOÚ\u009c2þ\u0002§Ri\u0082\f¬½\u0083`Á\u001fª\u001dC¥»;JF\u008dÙ\u0086%¡'¤øß\u0081Ù8ªS#ú?`uiÊnúJ\r\u001a¨éd\u0012Ðu[¨B©7Rä@cìxÓTÕ\u001e\u0011S.\u009b\n\u0093Õ\"<?\u009bÅ)a\u0011\u00824¾\u0097+ß-vÔ\u00ad^\u0001Já\u0099\u0015âjº`ÇÃ²\u0080\u001d.½÷ßAMò÷û.\b\u0082:FHzaÖBç\u000bgv0¯\u0090 \u00ad9óõW,\u009a\u0019Ð\u001cîð[7å)E¶ð\u0082\u0002¾\u001d\b÷}yÂl¤/4Ù\u0091©j\u007f\u0085\u0093\u0013\u001bORôgE·ûüü´s§gÖXö»UP\u008f\u0010Åõw;\u0091w&\u001c\u0092òZÆÆ¢Ä\b£\u008c] \u0010£Ü¥ú6¾\u0080¨F¼ó¯µue·\u0087È`óßô}pÝT\u0088), è%j\u001e\u0005á\u009cÓû\u0099Ö1ºiÊ°$Ùï\u001c\u0017ì\u001c¼Lþ\u000fÖ»\u00adìØ_òûî\u001e\u00adU»R^*ò0\u009bH8\u0090?\u0096\u0005 \u00063Ñ\u0006¤\u0000^#íæ/\u007f\u0090\u0007Ì¬ãÑ+E%w\u0005¯GtC\u0016¾Y_ÙÆ¶iµ,ã9BÃrÙõ¡\u008b²æcx\u0000rðjßª\u0081ø¦x_H\u008fà5¢D§t«_èKÚägHhk/'pá]dà\u0080|ä\u001cÖ\u007fÈã\u008eµ¶/\u0015:*$ì+ä±¥\u0003¥\u0099^mGÿ¿íZ²\u001f¤,\u008fÙ]ÿ\u001f\u0089[}ó\u001b\u009byÊ'vÞ\u0086âYó \u0089¬müÁ\u009dàfc\u007fÉ)ó\u009f!ñ²N{è\u0014Ø\u0002¸9çín\u008fÔF¼«Oåñ\u000fcöôeÅ-\u0099J¯:^HPzæÚ®hÖ2ð\u0002DN&`¨´]ëÆ£·/B´¡D÷·Q¯¸qjQ5=áàCæé#?j\u001a>\u007fºËÄÜn \u001a\u0014%D|¡!íÔ\u001eP\u001eÚ\u0098¤\u0087©f~C\u009219M1ø/kTö\u0014Ó·©Ëúç¢QÇ\u0090É\u008a,%KÊë\u0005yã\u008e^\u0087\t§yK&ÍaaÄ©µ\u0000IÓ\u0093=\u001d\u00143±ÞMrÕ#=ÿ\u009bûÖ\u001d\u0095Õ¨\u0000\u009c\"\u0087\u0010dìsm\u0081\u0005§\u0098¸\u0005Cì\u0007àÎ3;¶Ù\u0006\u0004§\u0082Ñ\u007f\u0007¨Åócðæ\u001b5ÔLî\u0011ð¶DG"
         .getBytes("ISO-8859-1");

      int var52;
      do {
         IIII[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1477904360;
         var10000 += 1;
         var52 = var10001 + 4;
         var10001 += 4;
      } while (var52 < var10002.length);

      String[] var5 = new String[IIII(399528048, var17 ^ -637578536)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIIl(150082958, var17 ^ -1099196346)).length();
      int var1 = 4;
      int var19 = -1;

      label92:
      while (true) {
         var10000 = IIII(399528051, var17 ^ -1306420735);
         String var24 = var2.substring(++var19, var19 + var1);
         byte var36 = -1;

         while (true) {
            label87: {
               char[] var54 = var24.toCharArray();
               int var66 = var54.length;
               int var6 = 0;
               var52 = var10000;
               var41 = var54;
               var10001 = var66;
               char[] var78;
               int var85;
               if (var66 <= 1) {
                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               } else {
                  var52 = var10000;
                  var10001 = var66;
                  if (var66 <= var6) {
                     break label87;
                  }

                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               }

               while (true) {
                  var78[var85] = (char)(var78[var85] ^ var66 ^ switch (var6 % IIII(399528063, var17 ^ -1785534243)) {
                     case 0 -> IIII(399528062, var17 ^ 1370079222);
                     case 1 -> IIII(399528057, var17 ^ 1594521306);
                     case 2 -> IIII(399528056, var17 ^ 2037348558);
                     case 3 -> IIII(399528059, var17 ^ -1047779583);
                     case 4 -> IIII(399528058, var17 ^ -388223916);
                     case 5 -> IIII(399527941, var17 ^ -710195404);
                     default -> IIII(399527940, var17 ^ 1042204000);
                  });
                  var6++;
                  if (var52 == 0) {
                     var85 = var52;
                     var78 = var41;
                     var66 = var52;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var78 = var41;
                     var66 = var52;
                     var85 = var6;
                  }
               }
            }

            String var59 = new String(var41).intern();
            switch (var36) {
               case 0:
                  var5[var3++] = var59;
                  if ((var19 += var1) >= var4) {
                     Il = var5;
                     lI = new String[IIII(399528060, var17 ^ 216077854)];
                     II = new String[IIII(399527943, var17 ^ -113314013)];
                     II();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var59;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label92;
                  }

                  var4 = (var2 = IIIl(150082959, var17 ^ -660629869)).length();
                  var1 = IIII(399528050, var17 ^ 1447505810);
                  var19 = -1;
            }

            var10000 = IIII(399528061, var17 ^ -1077100);
            var24 = var2.substring(++var19, var19 + var1);
            var36 = 0;
         }
      }
   }

   private Color III(IIllIIIlI var1, float var2) {
      if (!this.I.IllI()) {
         return this.Ill.IllI();
      } else {
         Color var3 = this.lII();
         Color var4 = IllIIlIl.lI(var3, IIlIlIIl.lI, var1.l() * 1.1E-4 + var2);
         return IllIIlIl.lll(var4, IIII(399527959, 1262270821 ^ -570575410));
      }
   }

   private IIllIIIlI IIl(class_1657 var1, class_310 var2) {
      class_745 var3 = new class_745(var2.field_1687, var1.method_7334());
      double var4 = var1.method_23318() - (var1.method_5715() ? 0.125 : 0.0);
      var3.method_5808(var1.method_23317(), var4, var1.method_23321(), var1.method_36454(), var1.method_36455());
      var3.method_5847(var1.method_5791());
      var3.method_36457(var1.method_36455());
      var3.method_18380(var1.method_18376());
      var3.method_5660(var1.method_5715());
      var3.method_5875(var1.method_5740());
      var3.method_5648(var1.method_5767());
      var3.field_6252 = var1.field_6252;
      return new IIllIIIlI(var3, System.currentTimeMillis(), var1.method_23317(), var4, var1.method_23321(), IIll.IllllII(var1, 1.0F));
   }

   private boolean Ill() {
      return this.III.IllI() && !this.I.IllI();
   }

   private static int IIII(int var0, int var1) {
      int var2 = IIII[var0 ^ 399528261] ^ var1 ^ var0;
      var2 ^= 57278;
      var2 ^= 20523;
      var2 ^= 56696;
      var2 ^= 361;
      var2 -= 61508;
      return var2 + 58397;
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1687 != null && var1.field_1724 != null) {
         long var2 = System.currentTimeMillis();
         long var4 = this.lIl();
         this.llI.removeIf(IIIIlIlll::I);
      } else {
         this.llI.clear();
      }
   }

   private Color lII() {
      IIIIIllII var1 = IIIIIllII.III();
      IIIlIIII var2 = var1 != null && var1.II() != null ? var1.II().IIlIIll() : null;
      return var2 == null
         ? new Color(
            IIII(399527958, -1540586301 ^ 1765470872),
            IIII(399527953, -1540586301 ^ 1127120777),
            IIII(399527952, -1540586301 ^ 453875678),
            IIII(399527955, -1540586301 ^ 1067934603)
         )
         : var2.lIlI();
   }

   private long lIl() {
      return Math.max(50L, Math.round(this.IlI.IllI()));
   }

   private boolean llI() {
      return this.lIl.IllI() && !this.I.IllI();
   }

   private Color lll(IIllIIIlI var1, float var2) {
      if (!this.I.IllI()) {
         return this.lll.IllI();
      } else {
         Color var3 = this.lII();
         Color var4 = IllIIlIl.lI(var3, IIlIlIIl.II, var1.l() * 1.3E-4 + var2);
         return IllIIlIl.lll(var4, IIII(399527954, -1166927873 ^ 84105952));
      }
   }
}
