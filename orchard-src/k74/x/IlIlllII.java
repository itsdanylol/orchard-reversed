package k74.x;

import java.util.Iterator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_265;
import net.minecraft.class_2680;

@Environment(EnvType.CLIENT)
public final class IlIlllII extends IlIIIIIIl {
   private static final Object[] IIl;
   private static final String[] III;
   private static final int[] ll;
   private final lllIIlII I;
   private static volatile IlIlllII II;
   private static final String[] Il;
   private static final String[] lI;

   private boolean I(class_1297 var1, class_1297 var2) {
      return this.ll(var1) || this.ll(var2);
   }

   private boolean l(class_1657 var1) {
      String[] var10000 = IIllllIl.IIIIl();
      class_238 var3 = var1.method_5829().method_35580(0.05, 0.05, 0.05);
      String[] var2 = var10000;
      if (!(var3.method_17939() <= 0.0) && !(var3.method_17940() <= 0.0) && !(var3.method_17941() <= 0.0)) {
         class_1937 var4 = var1.method_73183();
         class_2338 var5 = class_2338.method_49637(var3.field_1323, var3.field_1322, var3.field_1321);
         class_2338 var6 = class_2338.method_49637(var3.field_1320, var3.field_1325, var3.field_1324);

         for (class_2338 var8 : class_2338.method_10097(var5, var6)) {
            class_2680 var9 = var4.method_8320(var8);
            if (!var9.method_26215() || var2 != null) {
               class_265 var10 = var9.method_26220(var4, var8);
               if (!var10.method_1110() || var2 != null) {
                  Iterator var11 = var10.method_1090().iterator();

                  while (true) {
                     if (var11.hasNext()) {
                        class_238 var12 = (class_238)var11.next();
                        if (var12.method_996(var8).method_994(var3)) {
                           return true;
                        }

                        if (var2 == null) {
                           continue;
                        }
                     }

                     if (var2 != null) {
                        return false;
                     }
                     break;
                  }
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static boolean II(class_1297 var0, class_1297 var1) {
      IlIlllII var2 = II;
      return var2 != null && var2.IIIIlIl() && (!var2.I.IllI() || !var2.I(var0, var1));
   }

   public IlIlllII() {
      int var1 = 1709447445;
      super(
         IlIIllIII.Ill(Il(III(1459153374, var1 ^ 929602615), III(1459153375, var1 ^ -1227023597))),
         lllIIlIl.III,
         IlIIllIII.Ill(Il(III(1459153372, var1 ^ 1837008786), III(1459153373, var1 ^ -608455415)))
      );
      this.I = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Il(III(1459153370, var1 ^ 131143968), III(1459153371, var1 ^ 420798228))), false));
      II = this;
   }

   private static String IIl(short var0, int var1, char var2) {
      int var3 = var2 ^ 11565;
      char[] var4 = III[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 30231;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 9559;
         var10 -= 20558;
         var10 += 10369;
         var10 -= 6455;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static String Il(int var0, int var1) {
      int var9 = 100869620;
      int var2 = (var0 ^ III(1459153358, var9 ^ -1157209232)) & III(1459153359, var9 ^ -1534454579);
      if (lI[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & III(1459153356, var9 ^ 1661860323)) {
            case 0 -> III(1459153357, var9 ^ 796208400);
            case 1 -> III(1459153354, var9 ^ 872734497);
            case 2 -> III(1459153355, var9 ^ 156690021);
            case 3 -> III(1459153352, var9 ^ -1403386405);
            case 4 -> III(1459153353, var9 ^ 54007333);
            case 5 -> III(1459153350, var9 ^ 139304268);
            case 6 -> III(1459153351, var9 ^ 823026011);
            case 7 -> III(1459153348, var9 ^ 126489224);
            case 8 -> III(1459153349, var9 ^ -914373745);
            case 9 -> III(1459153346, var9 ^ -105367732);
            case 10 -> III(1459153347, var9 ^ 1269586978);
            case 11 -> III(1459153344, var9 ^ 1299353275);
            case 12 -> III(1459153345, var9 ^ 879621215);
            case 13 -> III(1459153406, var9 ^ -176444402);
            case 14 -> III(1459153407, var9 ^ -1523993984);
            case 15 -> III(1459153404, var9 ^ -372692447);
            case 16 -> III(1459153405, var9 ^ 1322010768);
            case 17 -> III(1459153402, var9 ^ -847596896);
            case 18 -> III(1459153403, var9 ^ 2127958821);
            case 19 -> III(1459153400, var9 ^ 448281899);
            case 20 -> III(1459153401, var9 ^ -1862677704);
            case 21 -> III(1459153398, var9 ^ -649181859);
            case 22 -> III(1459153399, var9 ^ 1662846579);
            case 23 -> III(1459153396, var9 ^ -725189980);
            case 24 -> III(1459153397, var9 ^ -1602654183);
            case 25 -> III(1459153394, var9 ^ 1663729283);
            case 26 -> III(1459153395, var9 ^ -978737180);
            case 27 -> III(1459153392, var9 ^ 1860439229);
            case 28 -> III(1459153393, var9 ^ -1437242007);
            case 29 -> III(1459153390, var9 ^ -444439221);
            case 30 -> III(1459153391, var9 ^ -49738940);
            case 31 -> III(1459153388, var9 ^ -1972639179);
            case 32 -> III(1459153389, var9 ^ 2011359541);
            case 33 -> III(1459153386, var9 ^ -2034671642);
            case 34 -> III(1459153387, var9 ^ -502162311);
            case 35 -> 2;
            case 36 -> III(1459153384, var9 ^ -561037050);
            case 37 -> III(1459153385, var9 ^ -254174655);
            case 38 -> III(1459153382, var9 ^ -1230312703);
            case 39 -> III(1459153383, var9 ^ 112168191);
            case 40 -> III(1459153380, var9 ^ -160858878);
            case 41 -> III(1459153381, var9 ^ 374250456);
            case 42 -> III(1459153378, var9 ^ 493946116);
            case 43 -> III(1459153379, var9 ^ 1918735977);
            case 44 -> III(1459153376, var9 ^ 1293791012);
            case 45 -> III(1459153377, var9 ^ 1822208565);
            case 46 -> III(1459153310, var9 ^ 102510180);
            case 47 -> III(1459153311, var9 ^ 150498271);
            case 48 -> III(1459153308, var9 ^ 1196603714);
            case 49 -> III(1459153309, var9 ^ -1149117542);
            case 50 -> III(1459153306, var9 ^ 91511873);
            case 51 -> III(1459153307, var9 ^ -229478176);
            case 52 -> III(1459153304, var9 ^ 1383179292);
            case 53 -> III(1459153305, var9 ^ -197708142);
            case 54 -> III(1459153302, var9 ^ -1327081504);
            case 55 -> III(1459153303, var9 ^ -135412784);
            case 56 -> III(1459153300, var9 ^ -520708848);
            case 57 -> III(1459153301, var9 ^ -449799020);
            case 58 -> III(1459153298, var9 ^ -1667913721);
            case 59 -> III(1459153299, var9 ^ 1596739124);
            case 60 -> III(1459153296, var9 ^ -2008876752);
            case 61 -> III(1459153297, var9 ^ 353596231);
            case 62 -> III(1459153294, var9 ^ 947934809);
            case 63 -> III(1459153295, var9 ^ -2066712810);
            case 64 -> III(1459153292, var9 ^ 2141391033);
            case 65 -> III(1459153293, var9 ^ 318586136);
            case 66 -> III(1459153290, var9 ^ 244986148);
            case 67 -> III(1459153291, var9 ^ 1559419611);
            case 68 -> 4;
            case 69 -> III(1459153288, var9 ^ 530942242);
            case 70 -> III(1459153289, var9 ^ -887272025);
            case 71 -> III(1459153286, var9 ^ -1537804025);
            case 72 -> 0;
            case 73 -> III(1459153287, var9 ^ -1000472009);
            case 74 -> 5;
            case 75 -> III(1459153284, var9 ^ 812066742);
            case 76 -> III(1459153285, var9 ^ -1421431163);
            case 77 -> III(1459153282, var9 ^ 1254205893);
            case 78 -> III(1459153283, var9 ^ 1688991474);
            case 79 -> III(1459153280, var9 ^ -70644174);
            case 80 -> III(1459153281, var9 ^ 755068018);
            case 81 -> III(1459153342, var9 ^ 57559915);
            case 82 -> III(1459153343, var9 ^ 2064329203);
            case 83 -> III(1459153340, var9 ^ 1810424916);
            case 84 -> III(1459153341, var9 ^ -1227797697);
            case 85 -> III(1459153338, var9 ^ -598015555);
            case 86 -> III(1459153339, var9 ^ -1667957691);
            case 87 -> III(1459153336, var9 ^ -2140629378);
            case 88 -> III(1459153337, var9 ^ -751451738);
            case 89 -> III(1459153334, var9 ^ 480895685);
            case 90 -> III(1459153335, var9 ^ 1179575159);
            case 91 -> III(1459153332, var9 ^ -366471738);
            case 92 -> III(1459153333, var9 ^ 2101976507);
            case 93 -> III(1459153330, var9 ^ 567724609);
            case 94 -> III(1459153331, var9 ^ 1631336841);
            case 95 -> III(1459153328, var9 ^ 603424686);
            case 96 -> III(1459153329, var9 ^ -1945510549);
            case 97 -> III(1459153326, var9 ^ 67300178);
            case 98 -> III(1459153327, var9 ^ 1444514778);
            case 99 -> III(1459153324, var9 ^ 1406552143);
            case 100 -> III(1459153325, var9 ^ -1962224689);
            case 101 -> III(1459153322, var9 ^ -1655619146);
            case 102 -> III(1459153323, var9 ^ -1590822271);
            case 103 -> III(1459153320, var9 ^ 654474270);
            case 104 -> III(1459153321, var9 ^ 2038682785);
            case 105 -> III(1459153318, var9 ^ -1370578345);
            case 106 -> III(1459153319, var9 ^ 1484950710);
            case 107 -> III(1459153316, var9 ^ 1803229442);
            case 108 -> III(1459153317, var9 ^ 248999580);
            case 109 -> III(1459153314, var9 ^ -1286253191);
            case 110 -> III(1459153315, var9 ^ -1606472570);
            case 111 -> III(1459153312, var9 ^ -2052096174);
            case 112 -> III(1459153313, var9 ^ 1395640248);
            case 113 -> III(1459153246, var9 ^ 758966359);
            case 114 -> III(1459153247, var9 ^ 1583267237);
            case 115 -> III(1459153244, var9 ^ -1125503893);
            case 116 -> III(1459153245, var9 ^ 554741512);
            case 117 -> III(1459153242, var9 ^ 11471004);
            case 118 -> III(1459153243, var9 ^ -363591957);
            case 119 -> III(1459153240, var9 ^ -1369210887);
            case 120 -> III(1459153241, var9 ^ -1245165127);
            case 121 -> III(1459153238, var9 ^ -34700204);
            case 122 -> III(1459153239, var9 ^ -1496620875);
            case 123 -> III(1459153236, var9 ^ -1730608643);
            case 124 -> III(1459153237, var9 ^ -1381793094);
            case 125 -> III(1459153234, var9 ^ 1551828950);
            case 126 -> III(1459153235, var9 ^ 304506643);
            case 127 -> III(1459153232, var9 ^ -92683158);
            case 128 -> III(1459153233, var9 ^ -1825838563);
            case 129 -> III(1459153230, var9 ^ 1363002299);
            case 130 -> III(1459153231, var9 ^ -1069680955);
            case 131 -> III(1459153228, var9 ^ -1837855687);
            case 132 -> III(1459153229, var9 ^ -826129537);
            case 133 -> III(1459153226, var9 ^ -1215290342);
            case 134 -> III(1459153227, var9 ^ 1024279850);
            case 135 -> III(1459153224, var9 ^ -1112125578);
            case 136 -> III(1459153225, var9 ^ -1668972862);
            case 137 -> III(1459153222, var9 ^ 232392765);
            case 138 -> III(1459153223, var9 ^ -769903296);
            case 139 -> III(1459153220, var9 ^ 15393511);
            case 140 -> III(1459153221, var9 ^ 584051206);
            case 141 -> III(1459153218, var9 ^ -1374525755);
            case 142 -> III(1459153219, var9 ^ -1457757328);
            case 143 -> III(1459153216, var9 ^ -1626526267);
            case 144 -> III(1459153217, var9 ^ -603300145);
            case 145 -> III(1459153278, var9 ^ 910541274);
            case 146 -> III(1459153279, var9 ^ 620540009);
            case 147 -> 1;
            case 148 -> III(1459153276, var9 ^ 1371660693);
            case 149 -> III(1459153277, var9 ^ 1601906532);
            case 150 -> III(1459153274, var9 ^ 2095644900);
            case 151 -> III(1459153275, var9 ^ 268372775);
            case 152 -> III(1459153272, var9 ^ 575211688);
            case 153 -> III(1459153273, var9 ^ -2146728016);
            case 154 -> III(1459153270, var9 ^ -1672439298);
            case 155 -> III(1459153271, var9 ^ 1558229893);
            case 156 -> III(1459153268, var9 ^ -55444607);
            case 157 -> III(1459153269, var9 ^ 1546478935);
            case 158 -> III(1459153266, var9 ^ 1555279355);
            case 159 -> III(1459153267, var9 ^ -243311329);
            case 160 -> III(1459153264, var9 ^ -360597418);
            case 161 -> III(1459153265, var9 ^ 1399071132);
            case 162 -> III(1459153262, var9 ^ -1884509190);
            case 163 -> III(1459153263, var9 ^ 1807149474);
            case 164 -> III(1459153260, var9 ^ 291079875);
            case 165 -> III(1459153261, var9 ^ 1009033662);
            case 166 -> III(1459153258, var9 ^ 1656987912);
            case 167 -> III(1459153259, var9 ^ 778912902);
            case 168 -> III(1459153256, var9 ^ -2014827860);
            case 169 -> III(1459153257, var9 ^ -1261677706);
            case 170 -> III(1459153254, var9 ^ -1733009322);
            case 171 -> III(1459153255, var9 ^ 412440665);
            case 172 -> III(1459153252, var9 ^ -2123398752);
            case 173 -> III(1459153253, var9 ^ -1617984075);
            case 174 -> III(1459153250, var9 ^ 735259977);
            case 175 -> III(1459153251, var9 ^ -894371862);
            case 176 -> III(1459153248, var9 ^ -677476085);
            case 177 -> III(1459153249, var9 ^ -1005605534);
            case 178 -> III(1459153182, var9 ^ 592621705);
            case 179 -> III(1459153183, var9 ^ 892911747);
            case 180 -> III(1459153180, var9 ^ 456252028);
            case 181 -> III(1459153181, var9 ^ 1871065138);
            case 182 -> III(1459153178, var9 ^ 877590583);
            case 183 -> III(1459153179, var9 ^ -338089686);
            case 184 -> III(1459153176, var9 ^ -1437987190);
            case 185 -> III(1459153177, var9 ^ -30972465);
            case 186 -> III(1459153174, var9 ^ 1512736858);
            case 187 -> III(1459153175, var9 ^ 1451192165);
            case 188 -> III(1459153172, var9 ^ 2042691669);
            case 189 -> III(1459153173, var9 ^ -1461215616);
            case 190 -> III(1459153170, var9 ^ 878909073);
            case 191 -> III(1459153171, var9 ^ 825192506);
            case 192 -> III(1459153168, var9 ^ -731636386);
            case 193 -> III(1459153169, var9 ^ 967807366);
            case 194 -> III(1459153166, var9 ^ 1734418230);
            case 195 -> III(1459153167, var9 ^ -1504038200);
            case 196 -> III(1459153164, var9 ^ 1824716855);
            case 197 -> III(1459153165, var9 ^ -340363565);
            case 198 -> III(1459153162, var9 ^ 477371113);
            case 199 -> III(1459153163, var9 ^ 1576005033);
            case 200 -> III(1459153160, var9 ^ -72618731);
            case 201 -> III(1459153161, var9 ^ 1299624972);
            case 202 -> III(1459153158, var9 ^ -954937893);
            case 203 -> III(1459153159, var9 ^ 1166055889);
            case 204 -> III(1459153156, var9 ^ 577882522);
            case 205 -> III(1459153157, var9 ^ -256306620);
            case 206 -> III(1459153154, var9 ^ 983678259);
            case 207 -> III(1459153155, var9 ^ 1814317134);
            case 208 -> III(1459153152, var9 ^ 392018035);
            case 209 -> III(1459153153, var9 ^ 484945801);
            case 210 -> III(1459153214, var9 ^ -27656809);
            case 211 -> III(1459153215, var9 ^ 537734460);
            case 212 -> III(1459153212, var9 ^ -571703702);
            case 213 -> III(1459153213, var9 ^ 309043001);
            case 214 -> III(1459153210, var9 ^ 1160281680);
            case 215 -> III(1459153211, var9 ^ 955251537);
            case 216 -> III(1459153208, var9 ^ -1590408021);
            case 217 -> III(1459153209, var9 ^ -1815544978);
            case 218 -> III(1459153206, var9 ^ 883549218);
            case 219 -> III(1459153207, var9 ^ -1423467494);
            case 220 -> III(1459153204, var9 ^ 858252869);
            case 221 -> 3;
            case 222 -> III(1459153205, var9 ^ 552616011);
            case 223 -> III(1459153202, var9 ^ 1028167688);
            case 224 -> III(1459153203, var9 ^ -987794534);
            case 225 -> III(1459153200, var9 ^ -1494570282);
            case 226 -> III(1459153201, var9 ^ 970636798);
            case 227 -> III(1459153198, var9 ^ -1883363918);
            case 228 -> III(1459153199, var9 ^ 182107570);
            case 229 -> III(1459153196, var9 ^ -1810250687);
            case 230 -> III(1459153197, var9 ^ 1374358947);
            case 231 -> III(1459153194, var9 ^ -684343789);
            case 232 -> III(1459153195, var9 ^ -587906023);
            case 233 -> III(1459153192, var9 ^ -1710117520);
            case 234 -> III(1459153193, var9 ^ -1447842752);
            case 235 -> III(1459153190, var9 ^ 75280802);
            case 236 -> III(1459153191, var9 ^ 1088930813);
            case 237 -> III(1459153188, var9 ^ -596588568);
            case 238 -> III(1459153189, var9 ^ 494695260);
            case 239 -> III(1459153186, var9 ^ 1907768827);
            case 240 -> III(1459153187, var9 ^ 1206004790);
            case 241 -> III(1459153184, var9 ^ -468389780);
            case 242 -> III(1459153185, var9 ^ 1401951468);
            case 243 -> III(1459153118, var9 ^ -299036577);
            case 244 -> III(1459153119, var9 ^ 1758439143);
            case 245 -> III(1459153116, var9 ^ -483288343);
            case 246 -> III(1459153117, var9 ^ -1696793433);
            case 247 -> III(1459153114, var9 ^ 1699300363);
            case 248 -> III(1459153115, var9 ^ 1697830440);
            case 249 -> III(1459153112, var9 ^ 1983448920);
            case 250 -> III(1459153113, var9 ^ -408595919);
            case 251 -> III(1459153110, var9 ^ 1887635665);
            case 252 -> III(1459153111, var9 ^ -479429957);
            case 253 -> III(1459153108, var9 ^ 407676801);
            case 254 -> III(1459153109, var9 ^ -1607909408);
            default -> III(1459153106, var9 ^ -1573806330);
         };
         int var5 = (var1 & III(1459153107, var9 ^ 1559778451)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & III(1459153104, var9 ^ -1835179646)) >>> III(1459153105, var9 ^ -633406548)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & III(1459153102, var9 ^ 844090461);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & III(1459153103, var9 ^ -946000423);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1483605405;
      int var10 = 0;
      short var12 = 7259;
      int var10001 = "r覭ꮝ眎\udb9d枎ꍣ磮换禎ᮞ煮ꭠ竎\udb60擮鮜献⮘荭\ue399烎⎟蠍⎝輍㭢秮쭠谍᭣紮殙粮\uf39e茭宙袍펜艍Θ燎⎘竎뎟譍㎝粮።甎孢词季砎뮙纎ꮟ舍፠牮\ueb62瑮宜硎⮟祮\udb60読뎝旮᭢烮⍢皮\ueb9e玮쭣敎㎝撮᭠軭厞暎쎟绮쮝詭讝罎\ueb99珮莜瘮㎝荍掙旮筣脭莙磎㎘炮鎞悮\ueb9e珎譣腭\ue363設譣訍썣"
         .length();
      int var11 = 0;
      String[] var9 = new String[1];
      int var8 = var10001;
      String var7 = "r覭ꮝ眎\udb9d枎ꍣ磮换禎ᮞ煮ꭠ竎\udb60擮鮜献⮘荭\ue399烎⎟蠍⎝輍㭢秮쭠谍᭣紮殙粮\uf39e茭宙袍펜艍Θ燎⎘竎뎟譍㎝粮።甎孢词季砎뮙纎ꮟ舍፠牮\ueb62瑮宜硎⮟祮\udb60読뎝旮᭢烮⍢皮\ueb9e玮쭣敎㎝撮᭠軭厞暎쎟绮쮝詭讝罎\ueb99珮莜瘮㎝荍掙旮筣脭莙磎㎘炮鎞悮\ueb9e珎譣腭\ue363設譣訍썣";

      do {
         char var13 = var7.charAt(var11);
         var10001 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002 + var13).toCharArray();

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

      III = var9;
      IIl = new Object[var9.length];
      int var10000 = 0;
      int var21 = 0;
      ll = new int[274];
      byte[] var28 = "ë.\u009dqj\u009b¦Ê±8\u0086Ô\u0007ühõÛ\u0097\u0018gÅRzÎ.áäÇ\\åÚ\u0096\u001bâ<\u0013ýØbÉú·\u008a\u0017Dº(Ç\u0016±'ôeü ö\u007f\u00ad4Ð\u0092\u0001Ä\u00ad\u0004§^Å\u001b+dBÜ\u00ad\u0096o\u0090Õ]A\u008b¤°Í¶ö\u0089\u0087\u0013úu½¼\u0098f\u0085·ííð\u008e®\u0011j¸*b\u009fvß³\u0016F\u0018G¡ô\f3ÊòÒþ2\u008bÍ\u0084\u0001JÛÜ\u009a\u001a\u0089Â°ViEÃñl8?rÚÝwÁvcç¥\u0018LÓ/YºÃfî5>Ü½v´kf\ne\u001fÙ\u0000\u0003Ü\u008a\u000e\u0017z\t×\u0096ÑD|\u009f\u0015õ\u001dÎZ\"\u0015\tB©{\u00135Ë\u009bÝÈB\u0099W9\u0019/\u008c]±ìia/1ÔOyêX\t\n\u009b;¹\u000fü«IÉ\r\u000f©îëÁ¢ÑuÔÍýæÓò½ÀáÓ<Â¸¹¼^~·X\u001bõøòÉ\u0085\u0004!«1ºÔ,pMò\u0000\níÑÔ^K\u0097F\u0092\u000fF8cHM³\u0014_VòÄZ\u0090í\u0002#5Ç\u0081à\u008c>A7â\u0089ÿª³\u0003â\u0087 9À;p\u0007\u0007À\u0003x¼\u00ad]MË±:AÜãRµJ \u0005ùBt½=U\u001bö\u0089>{þr~\u008fÇW\n\u0014æÞªõaÙÓÛ\u000b\u0086¶Dj~J\u0092¡\u001dÿ¼Î;VÄ«Y3ÔH\u0094=\tq;Kcûqþ#4\u008cZ?Èæ]l\u0095±þ£\t\u008dPùî\u0093¼U\u0088e¯Âéì\u0004\u009evºPÞ\u009cV*\u009cW÷V3©²É»¢\u009byé¹äQìv'Ü4ª£ñ\"ñ1r\u001e\u008d\u008a^\u0098¢\r°Æ#»)\u0011îÒ!ç\"ü\u0096ÔÛv·±w\u001e«\fõ$Ö\u001f\u009f\\\u008a:\u000f\u000f\rì\u008f·¨\u0092\u009c\u0087)áþÍ\u0082\u0003J\\f\u009e°ßf¿\u000fx°Uôv\u0010\u0011Ã\u0010\u0086\nh9HBNôî\u0019k\u0010;'yq\u0019\u0012\u0003ò\u000fãßw=\u00ad\u0086\u0017®EÙ«\u0012,\u008b\u009aþî\u009d³~\u007f\u009d\u0086ù-Ôü\u0011qb3\u0090\b0T\u0081\u0082\u00ad5¬\u0002\u0016>?#%\u000eK²zx\u0016m¼Ey¿J\u0092I\u009do\u009a$\u0011²\u0016Ë\u0016¼\u0013© \u00ad][cª.3\u0089å±5\u009b\\À\u008eîa\u0090îàÛWÚÃIo\u0081°_{g\u009déxµ?«÷ø#ðö\u0090ã@ÜüC\u0011\u008bxã\u008d\u0015\u001fã\u0013Â\u009bNß-ÍU!ÈñìÄQª0\fÛ\u001aÔ\u0016\u0099Z®ùé²\u0083\u0084Ñ\u0005ÝcÑ\u0093\u0091Í4\u008d8HZ\u0094\u000bl#ý'\u0014\u0011;§5(£>Ïñ' /õ\u0085\u0094s]\u008cu\u0010\u0087=h>ù×{¯Ý-\u009còß\u0081\u008a\u0098°:¤\u0091ª»Ð&@Õ\u008bî\u0088gTyYó\u0015êa¸A\u0087\u0015\u001då\u008açnéß\u001f×ÆaoZ\u0017Gîb\u008bÃfÌ\u008e\u008f\u0000\u0092kÄmÂ\u0086\u000fá>ØÁoý\u0019úCÎÓb\u00974T\u0016\u0006-£ÔuÏâO\u009dcD\u000b\u009dVòÖÄ\u0095x´½6ú é\\\u009dÑ¹\bO\u0019b\u001b\u0085\u0001Í¹Ó\u00848\u0089¨ýÈÉ£GßoAù\u008d\u009e\u009f\u00ad]öbL\u000fS\u00adËïfú\u0088\u000e\u009e\u0087O\u008b'\u001e\u0094<>,h\u008b?\u008b\t\u0094w\u0014\u0087ìÐ\u008c\u0087\u0096\f\u009fP0\u0080\u0082èèCz¿\u0003[\u0019JÚ²\u0086zÍ 0\u001eUZµzÍp+¹´ÛîK}Fh\u0095Ñ%cU4E%±Ý\u0000\u0016\u0013Ü¥»ÜÁÙÿG³XcÐ·\u0006¢Ü\u001cGÎ\u0016M\u008eøB\\Ê[´\u0080¨ì0d¬Q\u008dad×o×H\\\u0091ë\u0082%|\u008dÄÚé5ºÚ\u0092¦ûÉ\u0099vÎX\u0005#ÔÏ#yß\\Ì\u000b\u0019§ìÉL\u001f\u0089Ná\u001d\u0091îRãX:\u0000-<\u0010\u0012e\u009e\u008a4\u008dï¢Óx=CV"
         .getBytes("ISO-8859-1");

      int var44;
      do {
         ll[var10000] = ((var28[var21] & 255) << 24 | (var28[var21 + 1] & 255) << 16 | (var28[var21 + 2] & 255) << 8 | var28[var21 + 3] & 255) ^ 279263036;
         var10000 += 1;
         var44 = var21 + 4;
         var21 += 4;
      } while (var44 < var28.length);

      String[] var5 = new String[3];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIl((short)'苶', var17 ^ -1185279144, 'ⴭ')).length();
      int var1 = III(1459153368, var17 ^ -819153669);
      int var0 = -1;

      while (true) {
         label77: {
            var10000 = III(1459153369, var17 ^ -1121416529);
            char[] var45 = var2.substring(++var0, var0 + var1).toCharArray();
            int var55 = var45.length;
            int var6 = 0;
            var44 = var10000;
            var34 = var45;
            var21 = var55;
            char[] var64;
            int var71;
            if (var55 <= 1) {
               var64 = var45;
               var55 = var10000;
               var71 = var6;
            } else {
               var44 = var10000;
               var21 = var55;
               if (var55 <= var6) {
                  break label77;
               }

               var64 = var45;
               var55 = var10000;
               var71 = var6;
            }

            while (true) {
               var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % III(1459153366, var17 ^ -97555228)) {
                  case 0 -> III(1459153367, var17 ^ 471151109);
                  case 1 -> III(1459153364, var17 ^ 461036088);
                  case 2 -> III(1459153365, var17 ^ -1518896924);
                  case 3 -> III(1459153362, var17 ^ -142837783);
                  case 4 -> III(1459153363, var17 ^ -2077134803);
                  case 5 -> III(1459153360, var17 ^ -1637850050);
                  default -> III(1459153361, var17 ^ 1942787202);
               });
               var6++;
               if (var44 == 0) {
                  var71 = var44;
                  var64 = var34;
                  var55 = var44;
               } else {
                  if (var21 <= var6) {
                     break;
                  }

                  var64 = var34;
                  var55 = var44;
                  var71 = var6;
               }
            }
         }

         String var48 = new String(var34).intern();
         byte var27 = -1;
         var5[var3++] = var48;
         if ((var0 += var1) >= var4) {
            Il = var5;
            lI = new String[3];
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static int III(int var0, int var1) {
      int var2 = ll[var0 ^ 1459153374] ^ var1 ^ var0;
      var2 ^= 31689;
      var2 += 8690;
      var2 ^= 43643;
      var2 ^= 7145;
      var2 ^= 44308;
      var2 ^= 19351;
      var2 -= 6848;
      return var2 + 54685;
   }

   public static void lI() {
      II = null;
   }

   private boolean ll(class_1297 var1) {
      return var1 instanceof class_1657 var2 && var2.method_73183() != null ? var2.method_5757() || this.l(var2) : false;
   }
}
