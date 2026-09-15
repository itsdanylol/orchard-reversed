package k74.x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1722;
import net.minecraft.class_1733;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2382;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_465;
import net.minecraft.class_746;
import net.minecraft.class_9334;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

@Environment(EnvType.CLIENT)
public final class lIIlll extends IlIIIIIIl {
   private class_2338 II;
   private static final double Il = 20.25;
   private static final String[] lI;
   private int ll;
   private final lIlllIl III;
   private long IIl;
   private long IlI;
   private final lllIIlII Ill;
   private boolean lII;
   private static final String[] lIl;
   private final Set<class_2338> llI;
   private static final int I = 8;
   private long lll;
   private final lllIIlII IIII;
   private static final double IIIl = 1.0E-4;
   private final lllIIlII IIlI;
   private final Map<Integer, lllIlIl> IIll;
   private static final Object[] llIl;
   private int IlII;
   private long IlIl;
   private static final String[] llII;
   private static final long IllI = 1000L;
   private int Illl;
   private static final int[] lIll;
   private static String[] lIII;
   private final lllIIlII lIIl;
   private boolean lIlI;

   private class_3965 I(class_310 var1, class_2338 var2) {
      if (this.lIlI(var1) && var2 != null) {
         if (var1.field_1765 instanceof class_3965 var3
            && var3.method_17783() == class_240.field_1332
            && var3.method_17777().equals(var2)
            && this.llII(var1.field_1724, var3.method_17784())) {
            return var3;
         } else {
            ArrayList var10 = new ArrayList<>(Arrays.asList(class_2350.values()));
            class_243 var11 = var1.field_1724.method_33571();
            class_243 var5 = class_243.method_24953(var2);
            var10.sort(Comparator.comparingDouble(this::lll));

            for (class_2350 var7 : var10) {
               class_243 var8 = this.IIl(var5, var7);
               if (this.llII(var1.field_1724, var8)) {
                  class_3965 var9 = var1.field_1687.method_17742(new class_3959(var11, var8, class_3960.field_17559, class_242.field_1348, var1.field_1724));
                  if (var9 != null && var9.method_17783() != class_240.field_1333 && var9.method_17777().equals(var2)) {
                     return var9;
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   private void II(class_1703 var1, int var2, int var3, int var4) {
      class_1735 var5 = this.IIll(var1, var2, var3);
      if (var5 != null && var5.method_7681()) {
         class_1799 var6 = var5.method_7677();
         if (var6 != null && !var6.method_7960()) {
            this.IIll.put(var3, new lllIlIl(this.IIIII(var6), var6.method_7947(), var4));
         }
      }
   }

   private static void Il() {
      int var0 = 1926465910;
      lIII[0] = l(Ill(IIIll(2032089220, var0 ^ 377582914), IIIll(2032089221, var0 ^ -1429892879)).toCharArray(), 319L, IIIll(2032089222, var0 ^ -1369343599));
      lIII[1] = l(Ill(IIIll(2032089223, var0 ^ 1738995612), IIIll(2032089216, var0 ^ 835861282)).toCharArray(), 89649L, IIIll(2032089217, var0 ^ 2070814711));
      lIII[2] = l(Ill(IIIll(2032089218, var0 ^ -155588061), IIIll(2032089219, var0 ^ -907151880)).toCharArray(), 7942L, IIIll(2032089228, var0 ^ -1329457105));
      lIII[3] = l(Ill(IIIll(2032089229, var0 ^ 1701353336), IIIll(2032089230, var0 ^ 1864601303)).toCharArray(), 85072L, IIIll(2032089231, var0 ^ 2731182));
      lIII[4] = l(Ill(IIIll(2032089224, var0 ^ 735490570), IIIll(2032089225, var0 ^ 1284731128)).toCharArray(), 25906L, IIIll(2032089226, var0 ^ -784341699));
      lIII[5] = l(Ill(IIIll(2032089227, var0 ^ 1364028273), IIIll(2032089236, var0 ^ -1161761923)).toCharArray(), 39484L, IIIll(2032089237, var0 ^ -1411617303));
      lIII[IIIll(2032089238, var0 ^ 1254590740)] = l(
         Ill(IIIll(2032089239, var0 ^ -254325754), IIIll(2032089232, var0 ^ -181606294)).toCharArray(), 838L, IIIll(2032089233, var0 ^ -1914697974)
      );
      lIII[IIIll(2032089234, var0 ^ -520110549)] = l(
         Ill(IIIll(2032089235, var0 ^ 1367845077), IIIll(2032089244, var0 ^ 856694633)).toCharArray(), 86930L, IIIll(2032089245, var0 ^ 2147045026)
      );
   }

   private lIIIIll lI(class_310 var1, class_1703 var2, int var3) {
      ArrayList var4 = new ArrayList();
      int var5 = 0;
      int var6 = Math.min(var3, var2.field_7761.size());

      for (int var7 = 0; var7 < var6; var7++) {
         class_1735 var8 = (class_1735)var2.field_7761.get(var7);
         if (var8 != null && var8.field_7874 >= 0 && var8.method_7681() && var8.method_7674(var1.field_1724)) {
            class_1799 var9 = var8.method_7677();
            if (var9 != null && !var9.method_7960() && !this.llI(var1, var9) && (!this.lIIl.IllI() || this.IIIl(var9))) {
               var5++;
               if (!this.IIll.containsKey(var8.field_7874)) {
                  var4.add(var8.field_7874);
               }
            }
         }
      }

      return new lIIIIll(var4, var5);
   }

   private boolean ll(class_310 var1, class_2338 var2) {
      if (this.lIlI(var1) && var2 != null) {
         class_2680 var3 = var1.field_1687.method_8320(var2);
         return this.lllI(var3) && this.I(var1, var2) != null;
      } else {
         return false;
      }
   }

   private lIlIllll III(class_310 var1) {
      class_2338 var2 = var1.field_1724.method_24515();
      lIlIllll var3 = null;
      double var4 = Double.MAX_VALUE;

      for (int var6 = IIIll(2032089246, -89894834 ^ 672986333); var6 <= 2; var6++) {
         for (int var7 = IIIll(2032089247, -89894834 ^ 1778984692); var7 <= 4; var7++) {
            for (int var8 = IIIll(2032089240, -89894834 ^ 1994536455); var8 <= 4; var8++) {
               class_2338 var9 = var2.method_10069(var7, var6, var8);
               if (!this.llI.contains(var9) && this.ll(var1, var9)) {
                  class_3965 var10 = this.I(var1, var9);
                  if (var10 != null) {
                     double var11 = var1.field_1724.method_33571().method_1025(var10.method_17784());
                     if (var11 < var4) {
                        var4 = var11;
                        var3 = new lIlIllll(var9.method_10062(), var10);
                     }
                  }
               }
            }
         }
      }

      return var3;
   }

   private class_243 IIl(class_243 var1, class_2350 var2) {
      class_2382 var3 = var2.method_62675();
      return var1.method_1031(var3.method_10263() * 0.4999, var3.method_10264() * 0.4999, var3.method_10260() * 0.4999);
   }

   private static String Ill(int var0, int var1) {
      int var9 = -697252067;
      int var2 = (var0 ^ IIIll(2032089241, var9 ^ 280902543)) & IIIll(2032089242, var9 ^ -1945766438);
      if (lIl[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & IIIll(2032089243, var9 ^ 304266370)) {
            case 0 -> IIIll(2032089252, var9 ^ 1738529957);
            case 1 -> IIIll(2032089253, var9 ^ -1978374331);
            case 2 -> IIIll(2032089254, var9 ^ -1429178775);
            case 3 -> IIIll(2032089255, var9 ^ -1694148625);
            case 4 -> IIIll(2032089248, var9 ^ 1009791515);
            case 5 -> IIIll(2032089249, var9 ^ 432407074);
            case 6 -> IIIll(2032089250, var9 ^ -1346539381);
            case 7 -> IIIll(2032089251, var9 ^ 1386897791);
            case 8 -> IIIll(2032089260, var9 ^ 62626957);
            case 9 -> IIIll(2032089261, var9 ^ -1158847425);
            case 10 -> IIIll(2032089262, var9 ^ 2107430243);
            case 11 -> IIIll(2032089263, var9 ^ 810688522);
            case 12 -> IIIll(2032089256, var9 ^ -560702057);
            case 13 -> IIIll(2032089257, var9 ^ 2008050771);
            case 14 -> IIIll(2032089258, var9 ^ -1418367802);
            case 15 -> IIIll(2032089259, var9 ^ 1824506706);
            case 16 -> IIIll(2032089268, var9 ^ 1953019879);
            case 17 -> IIIll(2032089269, var9 ^ -1058905179);
            case 18 -> IIIll(2032089270, var9 ^ -748072760);
            case 19 -> IIIll(2032089271, var9 ^ -1808100837);
            case 20 -> IIIll(2032089264, var9 ^ 1348110532);
            case 21 -> IIIll(2032089265, var9 ^ 1305289111);
            case 22 -> IIIll(2032089266, var9 ^ -1857833479);
            case 23 -> IIIll(2032089267, var9 ^ 1967506024);
            case 24 -> IIIll(2032089276, var9 ^ 1682876442);
            case 25 -> IIIll(2032089277, var9 ^ -1180967213);
            case 26 -> IIIll(2032089278, var9 ^ -1079884864);
            case 27 -> IIIll(2032089279, var9 ^ 24790700);
            case 28 -> IIIll(2032089272, var9 ^ -1611610983);
            case 29 -> IIIll(2032089273, var9 ^ -649707854);
            case 30 -> IIIll(2032089274, var9 ^ 1438289887);
            case 31 -> IIIll(2032089275, var9 ^ 1801499605);
            case 32 -> IIIll(2032089284, var9 ^ 359059739);
            case 33 -> IIIll(2032089285, var9 ^ 54434404);
            case 34 -> IIIll(2032089286, var9 ^ 1271875261);
            case 35 -> IIIll(2032089287, var9 ^ -426910811);
            case 36 -> IIIll(2032089280, var9 ^ 1254389233);
            case 37 -> IIIll(2032089281, var9 ^ 1473580);
            case 38 -> IIIll(2032089282, var9 ^ 1077418613);
            case 39 -> IIIll(2032089283, var9 ^ 961642166);
            case 40 -> IIIll(2032089292, var9 ^ -1528727978);
            case 41 -> IIIll(2032089293, var9 ^ 797259777);
            case 42 -> IIIll(2032089294, var9 ^ 1791525259);
            case 43 -> IIIll(2032089295, var9 ^ -1493654014);
            case 44 -> IIIll(2032089288, var9 ^ -533865261);
            case 45 -> IIIll(2032089289, var9 ^ -1912434594);
            case 46 -> IIIll(2032089290, var9 ^ 816327306);
            case 47 -> IIIll(2032089291, var9 ^ 1016497885);
            case 48 -> IIIll(2032089300, var9 ^ 1023139397);
            case 49 -> IIIll(2032089301, var9 ^ -1872729757);
            case 50 -> IIIll(2032089302, var9 ^ 652170902);
            case 51 -> IIIll(2032089303, var9 ^ 13686620);
            case 52 -> IIIll(2032089296, var9 ^ -1706548998);
            case 53 -> IIIll(2032089297, var9 ^ 1750824179);
            case 54 -> IIIll(2032089298, var9 ^ 2147228429);
            case 55 -> IIIll(2032089299, var9 ^ -577710474);
            case 56 -> IIIll(2032089308, var9 ^ 1663198337);
            case 57 -> IIIll(2032089309, var9 ^ -1919425855);
            case 58 -> IIIll(2032089310, var9 ^ -707041519);
            case 59 -> IIIll(2032089311, var9 ^ -2026393092);
            case 60 -> IIIll(2032089304, var9 ^ 1481341838);
            case 61 -> IIIll(2032089305, var9 ^ -467844840);
            case 62 -> IIIll(2032089306, var9 ^ 1786912508);
            case 63 -> IIIll(2032089307, var9 ^ 723939672);
            case 64 -> IIIll(2032089316, var9 ^ 1688578748);
            case 65 -> IIIll(2032089317, var9 ^ 959671184);
            case 66 -> IIIll(2032089318, var9 ^ -147317435);
            case 67 -> IIIll(2032089319, var9 ^ 323203578);
            case 68 -> IIIll(2032089312, var9 ^ 177459153);
            case 69 -> IIIll(2032089313, var9 ^ 2030584389);
            case 70 -> IIIll(2032089314, var9 ^ 275806084);
            case 71 -> IIIll(2032089315, var9 ^ 1705018667);
            case 72 -> IIIll(2032089324, var9 ^ 1320883583);
            case 73 -> IIIll(2032089325, var9 ^ 1706487995);
            case 74 -> IIIll(2032089326, var9 ^ 1135214753);
            case 75 -> IIIll(2032089327, var9 ^ -411460103);
            case 76 -> IIIll(2032089320, var9 ^ -1499656757);
            case 77 -> IIIll(2032089321, var9 ^ -886277335);
            case 78 -> IIIll(2032089322, var9 ^ 512446876);
            case 79 -> IIIll(2032089323, var9 ^ -1810343888);
            case 80 -> IIIll(2032089332, var9 ^ -259848497);
            case 81 -> IIIll(2032089333, var9 ^ 503683662);
            case 82 -> IIIll(2032089334, var9 ^ -1277984891);
            case 83 -> IIIll(2032089335, var9 ^ 650090816);
            case 84 -> IIIll(2032089328, var9 ^ 271027385);
            case 85 -> IIIll(2032089329, var9 ^ -1355068255);
            case 86 -> IIIll(2032089330, var9 ^ -2120084415);
            case 87 -> IIIll(2032089331, var9 ^ -444465208);
            case 88 -> IIIll(2032089340, var9 ^ -1714847863);
            case 89 -> 3;
            case 90 -> IIIll(2032089341, var9 ^ -1231623003);
            case 91 -> IIIll(2032089342, var9 ^ -1137941656);
            case 92 -> 1;
            case 93 -> IIIll(2032089343, var9 ^ -774724066);
            case 94 -> IIIll(2032089336, var9 ^ 2041115594);
            case 95 -> IIIll(2032089337, var9 ^ 803063223);
            case 96 -> IIIll(2032089338, var9 ^ 1072952716);
            case 97 -> IIIll(2032089339, var9 ^ -2007181470);
            case 98 -> IIIll(2032089092, var9 ^ -287332080);
            case 99 -> IIIll(2032089093, var9 ^ 567353964);
            case 100 -> IIIll(2032089094, var9 ^ 1780945529);
            case 101 -> IIIll(2032089095, var9 ^ -281268638);
            case 102 -> IIIll(2032089088, var9 ^ 1365341157);
            case 103 -> IIIll(2032089089, var9 ^ -1817221964);
            case 104 -> IIIll(2032089090, var9 ^ 1169785038);
            case 105 -> IIIll(2032089091, var9 ^ -1344256146);
            case 106 -> IIIll(2032089100, var9 ^ 1733105390);
            case 107 -> IIIll(2032089101, var9 ^ 361385846);
            case 108 -> IIIll(2032089102, var9 ^ -585195050);
            case 109 -> IIIll(2032089103, var9 ^ 1140847872);
            case 110 -> IIIll(2032089096, var9 ^ 1047754342);
            case 111 -> IIIll(2032089097, var9 ^ 50154133);
            case 112 -> IIIll(2032089098, var9 ^ -305822248);
            case 113 -> IIIll(2032089099, var9 ^ 204828729);
            case 114 -> IIIll(2032089108, var9 ^ -1042826209);
            case 115 -> IIIll(2032089109, var9 ^ -530069343);
            case 116 -> IIIll(2032089110, var9 ^ -387945676);
            case 117 -> IIIll(2032089111, var9 ^ -1589675945);
            case 118 -> IIIll(2032089104, var9 ^ 242633199);
            case 119 -> IIIll(2032089105, var9 ^ -1117121934);
            case 120 -> IIIll(2032089106, var9 ^ -2045693177);
            case 121 -> IIIll(2032089107, var9 ^ -1615476163);
            case 122 -> IIIll(2032089116, var9 ^ 211678176);
            case 123 -> 2;
            case 124 -> IIIll(2032089117, var9 ^ -1389972475);
            case 125 -> IIIll(2032089118, var9 ^ -2016935197);
            case 126 -> IIIll(2032089119, var9 ^ -1954227850);
            case 127 -> IIIll(2032089112, var9 ^ -135205520);
            case 128 -> IIIll(2032089113, var9 ^ 1848601275);
            case 129 -> IIIll(2032089114, var9 ^ 785348374);
            case 130 -> IIIll(2032089115, var9 ^ 142326502);
            case 131 -> IIIll(2032089124, var9 ^ -1553799025);
            case 132 -> IIIll(2032089125, var9 ^ 65320975);
            case 133 -> IIIll(2032089126, var9 ^ 143957955);
            case 134 -> IIIll(2032089127, var9 ^ 1347011986);
            case 135 -> 5;
            case 136 -> IIIll(2032089120, var9 ^ 1098762466);
            case 137 -> IIIll(2032089121, var9 ^ 430442103);
            case 138 -> IIIll(2032089122, var9 ^ 417952276);
            case 139 -> IIIll(2032089123, var9 ^ -127572003);
            case 140 -> IIIll(2032089132, var9 ^ 273278697);
            case 141 -> IIIll(2032089133, var9 ^ 2070213601);
            case 142 -> IIIll(2032089134, var9 ^ -1051975401);
            case 143 -> IIIll(2032089135, var9 ^ -208053384);
            case 144 -> IIIll(2032089128, var9 ^ 411193);
            case 145 -> IIIll(2032089129, var9 ^ -780304246);
            case 146 -> IIIll(2032089130, var9 ^ 320138812);
            case 147 -> IIIll(2032089131, var9 ^ 1778652542);
            case 148 -> IIIll(2032089140, var9 ^ 1717549748);
            case 149 -> IIIll(2032089141, var9 ^ -257472679);
            case 150 -> IIIll(2032089142, var9 ^ -1175452584);
            case 151 -> IIIll(2032089143, var9 ^ -796388299);
            case 152 -> 0;
            case 153 -> IIIll(2032089136, var9 ^ -1520474888);
            case 154 -> IIIll(2032089137, var9 ^ 788654000);
            case 155 -> IIIll(2032089138, var9 ^ -843945265);
            case 156 -> IIIll(2032089139, var9 ^ -487978897);
            case 157 -> IIIll(2032089148, var9 ^ 1994271917);
            case 158 -> IIIll(2032089149, var9 ^ 1258502137);
            case 159 -> IIIll(2032089150, var9 ^ 1311924918);
            case 160 -> IIIll(2032089151, var9 ^ 1836329470);
            case 161 -> IIIll(2032089144, var9 ^ 837746278);
            case 162 -> IIIll(2032089145, var9 ^ 1704156393);
            case 163 -> IIIll(2032089146, var9 ^ 648271593);
            case 164 -> IIIll(2032089147, var9 ^ 161433561);
            case 165 -> IIIll(2032089156, var9 ^ -2064477172);
            case 166 -> IIIll(2032089157, var9 ^ 235842718);
            case 167 -> IIIll(2032089158, var9 ^ 639466099);
            case 168 -> IIIll(2032089159, var9 ^ -1625368480);
            case 169 -> IIIll(2032089152, var9 ^ -1794260079);
            case 170 -> IIIll(2032089153, var9 ^ -12641677);
            case 171 -> IIIll(2032089154, var9 ^ -1639801593);
            case 172 -> IIIll(2032089155, var9 ^ 1026477578);
            case 173 -> IIIll(2032089164, var9 ^ -1544869844);
            case 174 -> IIIll(2032089165, var9 ^ 455968957);
            case 175 -> IIIll(2032089166, var9 ^ -1788520434);
            case 176 -> IIIll(2032089167, var9 ^ -774199313);
            case 177 -> IIIll(2032089160, var9 ^ 78879589);
            case 178 -> IIIll(2032089161, var9 ^ 807728172);
            case 179 -> IIIll(2032089162, var9 ^ -2130778556);
            case 180 -> IIIll(2032089163, var9 ^ 741560843);
            case 181 -> IIIll(2032089172, var9 ^ -1853126409);
            case 182 -> IIIll(2032089173, var9 ^ -1414232245);
            case 183 -> IIIll(2032089174, var9 ^ 560507809);
            case 184 -> IIIll(2032089175, var9 ^ 751244236);
            case 185 -> IIIll(2032089168, var9 ^ -682288458);
            case 186 -> IIIll(2032089169, var9 ^ 767448106);
            case 187 -> IIIll(2032089170, var9 ^ -1494190715);
            case 188 -> IIIll(2032089171, var9 ^ 522044562);
            case 189 -> IIIll(2032089180, var9 ^ -1146900202);
            case 190 -> IIIll(2032089181, var9 ^ -544019853);
            case 191 -> IIIll(2032089182, var9 ^ -277758380);
            case 192 -> IIIll(2032089183, var9 ^ 218596464);
            case 193 -> IIIll(2032089176, var9 ^ -1681721330);
            case 194 -> IIIll(2032089177, var9 ^ -1914465834);
            case 195 -> IIIll(2032089178, var9 ^ 1817672351);
            case 196 -> IIIll(2032089179, var9 ^ 1575607133);
            case 197 -> IIIll(2032089188, var9 ^ 1419215087);
            case 198 -> 4;
            case 199 -> IIIll(2032089189, var9 ^ -1549064541);
            case 200 -> IIIll(2032089190, var9 ^ -794941367);
            case 201 -> IIIll(2032089191, var9 ^ -1817061279);
            case 202 -> IIIll(2032089184, var9 ^ 829492880);
            case 203 -> IIIll(2032089185, var9 ^ 1056728383);
            case 204 -> IIIll(2032089186, var9 ^ -918887271);
            case 205 -> IIIll(2032089187, var9 ^ -1496093935);
            case 206 -> IIIll(2032089196, var9 ^ 639615403);
            case 207 -> IIIll(2032089197, var9 ^ 822746328);
            case 208 -> IIIll(2032089198, var9 ^ 362171017);
            case 209 -> IIIll(2032089199, var9 ^ -937980344);
            case 210 -> IIIll(2032089192, var9 ^ -1698027359);
            case 211 -> IIIll(2032089193, var9 ^ -1593090435);
            case 212 -> IIIll(2032089194, var9 ^ -1582032801);
            case 213 -> IIIll(2032089195, var9 ^ 445677622);
            case 214 -> IIIll(2032089204, var9 ^ -249267839);
            case 215 -> IIIll(2032089205, var9 ^ -1234837829);
            case 216 -> IIIll(2032089206, var9 ^ 277990495);
            case 217 -> IIIll(2032089207, var9 ^ 1581302642);
            case 218 -> IIIll(2032089200, var9 ^ -700538098);
            case 219 -> IIIll(2032089201, var9 ^ -2091376014);
            case 220 -> IIIll(2032089202, var9 ^ -600920158);
            case 221 -> IIIll(2032089203, var9 ^ 1075761025);
            case 222 -> IIIll(2032089212, var9 ^ 216838704);
            case 223 -> IIIll(2032089213, var9 ^ -1134852398);
            case 224 -> IIIll(2032089214, var9 ^ 1264238701);
            case 225 -> IIIll(2032089215, var9 ^ -2132877005);
            case 226 -> IIIll(2032089208, var9 ^ -999583190);
            case 227 -> IIIll(2032089209, var9 ^ 283977614);
            case 228 -> IIIll(2032089210, var9 ^ 2017263150);
            case 229 -> IIIll(2032089211, var9 ^ -1606908190);
            case 230 -> IIIll(2032089476, var9 ^ 1536615732);
            case 231 -> IIIll(2032089477, var9 ^ 1979330105);
            case 232 -> IIIll(2032089478, var9 ^ -1748447449);
            case 233 -> IIIll(2032089479, var9 ^ 206178569);
            case 234 -> IIIll(2032089472, var9 ^ -781759455);
            case 235 -> IIIll(2032089473, var9 ^ -1830815606);
            case 236 -> IIIll(2032089474, var9 ^ 1289199688);
            case 237 -> IIIll(2032089475, var9 ^ -646824377);
            case 238 -> IIIll(2032089484, var9 ^ 392526641);
            case 239 -> IIIll(2032089485, var9 ^ 2124273395);
            case 240 -> IIIll(2032089486, var9 ^ -1411735813);
            case 241 -> IIIll(2032089487, var9 ^ 1521277708);
            case 242 -> IIIll(2032089480, var9 ^ 1857822059);
            case 243 -> IIIll(2032089481, var9 ^ -1759617696);
            case 244 -> IIIll(2032089482, var9 ^ -731935647);
            case 245 -> IIIll(2032089483, var9 ^ 1325627914);
            case 246 -> IIIll(2032089492, var9 ^ -1589495980);
            case 247 -> IIIll(2032089493, var9 ^ -679622992);
            case 248 -> IIIll(2032089494, var9 ^ -840004522);
            case 249 -> IIIll(2032089495, var9 ^ 1228949259);
            case 250 -> IIIll(2032089488, var9 ^ -1656854500);
            case 251 -> IIIll(2032089489, var9 ^ -1500354738);
            case 252 -> IIIll(2032089490, var9 ^ -142878466);
            case 253 -> IIIll(2032089491, var9 ^ 1491863522);
            case 254 -> IIIll(2032089500, var9 ^ -141382519);
            default -> IIIll(2032089501, var9 ^ -623337117);
         };
         int var5 = (var1 & IIIll(2032089502, var9 ^ -886408093)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIIll(2032089503, var9 ^ -1829530779)) >>> IIIll(2032089496, var9 ^ -952422605)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIIll(2032089497, var9 ^ -960942110);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIIll(2032089498, var9 ^ 1339467131);
            }
         }

         lIl[var2] = new String(var3).intern();
      }

      return lIl[var2];
   }

   private boolean lII(class_310 var1, lIlIllll var2) {
      if (var2 != null && this.ll(var1, var2.l())) {
         class_3965 var3 = this.I(var1, var2.l());
         if (var3 == null) {
            var3 = var2.I();
         }

         if (!this.llII(var1.field_1724, var3.method_17784())) {
            return false;
         } else {
            k74.x.IIll.IlIll(var1);
            class_1269 var4 = var1.field_1761.method_2896(var1.field_1724, class_1268.field_5808, var3);
            if (var4 != null && var4.method_23665()) {
               this.II = var2.l().method_10062();
               this.llI.add(this.II);
               var1.field_1724.method_6104(class_1268.field_5808);
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void lIl(class_310 var1) {
      long var2 = System.currentTimeMillis();
      if (this.lIlI) {
         if (var2 - this.lll <= 1000L) {
            return;
         }

         this.lIII();
      }

      if (var2 - this.IIl >= this.IlI) {
         lIlIllll var4 = this.III(var1);
         if (var4 != null) {
            class_243 var5 = var4.I().method_17784();
            float var6;
            float var7;
            if (IlllIlII.lIIII(var1, var4.I(), false)) {
               var6 = var1.field_1724.method_36454();
               var7 = var1.field_1724.method_36455();
            } else {
               float[] var8 = IlllIlII.lIII(var1, var5);
               if (var8 == null) {
                  return;
               }

               var6 = var8[0];
               var7 = var8[1];
            }

            long var11 = ++this.IlIl;
            boolean var10 = IlllIlII.IlII(var1, IIIll(2032089499, -1477413571 ^ -1134137822), var6, var7, this::IIIlI);
            if (var10) {
               this.lIlI = true;
               this.lll = var2;
            }
         }
      }
   }

   private boolean llI(class_310 var1, class_1799 var2) {
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null && var3.II() != null && var1 != null && var1.field_1724 != null) {
         lllIlIII var4 = var3.II().IllII();
         return var4 != null && var4.IIIIlIl() && var4.lllI(var1.field_1724, var2);
      } else {
         return false;
      }
   }

   private double lll(class_243 var1, class_243 var2, class_2350 var3) {
      return this.IIl(var1, var3).method_1025(var2);
   }

   @Override
   public void llIl() {
      this.IIl = 0L;
      this.IlI = 0L;
      this.ll = IIIll(2032089515, -635401041 ^ -381897956);
      this.Illl = IIIll(2032089524, -635401041 ^ 1080760560);
      this.IlII = IIIll(2032089525, -635401041 ^ -296547001);
      this.IIll.clear();
      this.llI.clear();
      this.II = null;
      this.lII = false;
      this.lIII();
   }

   private static String IIlII(int var0, char var1, char var2) {
      int var3 = var1 ^ 'ｎ';
      char[] var4 = llII[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])llIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         llIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 21635;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '谜';
         var10 += 21297;
         var10 += 56258;
         var10 -= 50097;
         var10 += 28298;
         var10 += 32477;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private int IIII(class_1703 var1) {
      if (var1 instanceof class_1707 var2) {
         return var2.method_17388() * IIIll(2032089526, -1106896875 ^ 922403628);
      } else if (this.Ill.IllI() && var1 instanceof class_1733) {
         return IIIll(2032089527, -1106896875 ^ -2005218083);
      } else {
         return this.IIlI.IllI() && var1 instanceof class_1722 ? 5 : 0;
      }
   }

   private boolean IIIl(class_1799 var1) {
      if (var1 == null || var1.method_7960()) {
         return false;
      } else if (var1.method_7963()) {
         return true;
      } else {
         return var1.method_57353().method_57832(class_9334.field_50075)
            ? true
            : var1.method_31574(class_2246.field_10540.method_8389())
               || var1.method_31574(class_1802.field_8634)
               || var1.method_31574(class_1802.field_8301)
               || var1.method_31574(class_1802.field_8287)
               || var1.method_31574(class_1802.field_8288)
               || var1.method_31574(class_1802.field_8463)
               || var1.method_31574(class_1802.field_8367)
               || var1.method_31574(class_1802.field_8574)
               || var1.method_31574(class_1802.field_8436)
               || var1.method_31574(class_1802.field_8150)
               || var1.method_31574(class_2246.field_23152.method_8389())
               || var1.method_31574(class_1802.field_8801)
               || var1.method_31574(class_1802.field_8107)
               || var1.method_31574(class_2246.field_10343.method_8389());
      }
   }

   private void IIlI(class_310 var1, class_1703 var2, int var3) {
      int var4 = var1.field_1724.field_6012;
      this.IIll.entrySet().removeIf(this::IlII);
   }

   private class_1735 IIll(class_1703 var1, int var2, int var3) {
      int var4 = Math.min(var2, var1.field_7761.size());

      for (int var5 = 0; var5 < var4; var5++) {
         class_1735 var6 = (class_1735)var1.field_7761.get(var5);
         if (var6 != null && var6.field_7874 == var3) {
            return var6;
         }
      }

      return null;
   }

   private boolean IlII(int var1, class_1703 var2, int var3, Entry var4) {
      if (var1 - var4.getValue().l >= IIIll(2032089520, -735288460 ^ 1937527873)) {
         return true;
      } else {
         class_1735 var5 = this.IIll(var2, var3, var4.getKey());
         if (var5 != null && var5.method_7681()) {
            class_1799 var6 = var5.method_7677();
            return var6 == null || var6.method_7960() || !var4.getValue().Il(var6);
         } else {
            return true;
         }
      }
   }

   public boolean IlIl(class_310 var1) {
      if (!(this.IIIIlIl() && this.lIlI(var1) && var1.field_1755 instanceof class_465 var2)) {
         return false;
      } else if (this.lIIl(var1)) {
         return false;
      } else {
         class_1703 var4 = var2.method_17577();
         return this.IIII(var4) > 0 && var4.method_34255() != null;
      }
   }

   private static int IIIll(int var0, int var1) {
      int var2 = lIll[var0 ^ 2032089220] ^ var1 ^ var0;
      var2 -= 24344;
      var2 ^= 16125;
      var2 ^= 18370;
      var2 += 26138;
      var2 ^= 11947;
      var2 -= 17204;
      return var2 + 16820;
   }

   @Override
   public void IlIII() {
      this.IIl = 0L;
      this.IlI = this.IllI();
      this.ll = IIIll(2032089521, 668300728 ^ 1621760655);
      this.Illl = IIIll(2032089522, 668300728 ^ -985661942);
      this.IlII = IIIll(2032089523, 668300728 ^ -1295571356);
      this.IIll.clear();
      this.llI.clear();
      this.II = null;
      this.lII = false;
      this.lIII();
   }

   private long IllI() {
      double var1 = this.III.IIlI();
      double var3 = this.III.IlI();
      return var1 == var3 ? Math.round(var1) : Math.round(ThreadLocalRandom.current().nextDouble(var1, var3));
   }

   private void Illl(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         if (this.IlII != this.ll) {
            this.IlII = this.ll;
            var1.field_1724.method_7346();
            var1.method_1507(null);
            this.Illl = IIIll(2032089532, -1227654321 ^ 1787460369);
            this.IIll.clear();
            if (this.II != null) {
               this.llI.add(this.II);
               this.II = null;
               this.lII = false;
            }
         }
      }
   }

   private void lIII() {
      this.lIlI = false;
      this.lll = 0L;
      this.IlIl++;
   }

   private boolean lIIl(class_310 var1) {
      IIIIIllII var2 = IIIIIllII.III();
      if (var2 != null && var2.II() != null) {
         llIIII var3 = var2.II().lllIll();
         return var3 != null && var3.IlIl(var1);
      } else {
         return false;
      }
   }

   @Override
   public void IIlIl() {
      String[] var1 = IIllllIl.IIIIl();
      class_310 var2 = class_310.method_1551();
      if (this.lIlI(var2) && var2.field_1755 instanceof class_465 var3 && var1 == null) {
         if (this.lIIl(var2)) {
            this.IIIIl();
         } else {
            class_1703 var12 = var3.method_17577();
            int var5 = this.IIII(var12);
            if (var5 > 0 && var12.method_34255() != null && var12.method_34255().method_7960()) {
               if (this.IlII != var12.field_7763) {
                  if (var12.field_7763 != this.ll) {
                     this.ll = var12.field_7763;
                     this.lII = false;
                     this.IIl = 0L;
                     this.IlI = this.IllI();
                     this.Illl = IIIll(2032089533, -523145275 ^ -657313980);
                     this.IlII = IIIll(2032089534, -523145275 ^ 1514024037);
                     this.IIll.clear();
                  }

                  boolean var6 = false;
                  int var7 = Math.min(var5, var12.field_7761.size());
                  int var8 = 0;

                  while (var8 < var7) {
                     class_1735 var9 = (class_1735)var12.field_7761.get(var8);
                     if (var9 != null && var9.method_7681() && !var9.method_7677().method_7960()) {
                        var6 = true;
                        if (var1 == null) {
                           break;
                        }
                     }

                     var8++;
                     if (var1 != null) {
                        break;
                     }
                  }

                  if (var6) {
                     this.lII = true;
                  }

                  this.IIlI(var2, var12, var5);
                  lIIIIll var13 = this.lI(var2, var12, var5);
                  if (!var13.Il()) {
                     this.lIll(var2);
                  } else {
                     this.Illl = IIIll(2032089535, -523145275 ^ -116501710);
                     if (var13.l()) {
                        long var14 = System.currentTimeMillis();
                        if (var14 - this.IIl >= this.IlI) {
                           int var11 = var13.lI();
                           if (lIIIllII.III(var2)) {
                              this.II(var12, var5, var11, var2.field_1724.field_6012);
                              var2.field_1761.method_2906(var12.field_7763, var11, 0, class_1713.field_7794, var2.field_1724);
                              this.IIl = System.currentTimeMillis();
                              this.IlI = this.IllI();
                              lIIIllII.lII(var2);
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         if (this.IIIIlIl() && this.lIlI(var2) && this.IIII.IllI() && var2.field_1755 == null) {
            this.lIl(var2);
            if (var1 == null) {
               return;
            }
         }

         this.IIIIl();
      }
   }

   private boolean lIlI(class_310 var1) {
      return var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null && var1.field_1724.method_5805();
   }

   private static String l(char[] var0, long var1, int var3) {
      int var4 = IIIll(2032089528, -2089361300 ^ -1526407811) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIIll(2032089529, -2089361300 ^ 1577096948);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private void lIll(class_310 var1) {
      if (!this.IIll.isEmpty()) {
         this.Illl = IIIll(2032089530, 1428230081 ^ 1120328813);
      } else if (this.Illl == IIIll(2032089531, 1428230081 ^ 774480267)) {
         this.Illl = var1.field_1724.field_6012;
      } else {
         int var2 = this.lII ? 0 : IIIll(2032089540, 1428230081 ^ 144810276);
         if (var1.field_1724.field_6012 - this.Illl >= var2) {
            this.Illl(var1);
         }
      }
   }

   public lIIlll() {
      int var1 = 879142110;
      super(IlIIllIII.Ill(lIII[2]), lllIIlIl.IlI, IlIIllIII.Ill(lIII[5]));
      this.III = this.IllIIll(new lIlllIl(IlIIllIII.Ill(lIII[0]), 85.0, 165.0, 0.0, 1000.0, 5.0).lI(IlIIllIII.lI(lIII[4])));
      this.Ill = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIII[3]), true));
      this.IIlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIII[IIIll(2032089541, var1 ^ 306190482)]), false));
      this.IIII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIII[1]), false));
      this.lIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIII[IIIll(2032089542, var1 ^ -431909583)]), false));
      this.ll = IIIll(2032089543, var1 ^ -2083589344);
      this.Illl = IIIll(2032089536, var1 ^ -638894264);
      this.IlII = IIIll(2032089537, var1 ^ 2078345138);
      this.IIll = new HashMap<>();
      this.llI = new HashSet<>();
      this.lII = false;
   }

   private boolean llII(class_746 var1, class_243 var2) {
      return var1 != null && var2 != null && var1.method_33571().method_1025(var2) <= 20.25;
   }

   private boolean lllI(class_2680 var1) {
      if (var1.method_27852(class_2246.field_10034)
         || var1.method_27852(class_2246.field_10380)
         || var1.method_27852(class_2246.field_16328)
         || var1.method_27852(class_2246.field_10443)) {
         return true;
      } else {
         return this.Ill.IllI() && var1.method_26204() instanceof class_2480 ? true : this.IIlI.IllI() && var1.method_27852(class_2246.field_10312);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1185695373;
      int var14 = "¡쥒쳖ߧ\uf7f8ٔ웼⟠Ⳬ\uda1f곀䗒\ue100㋲ẵ這穮ᇚ漎ქ塁ڒ\uf564ᘌ瓺琖첺輑첁炑곻ᠩឺ侅噏\uddca벿\ue7ecὴض㪭愽Ს\ueec2耘睋\uf86cញⲔ壤澾䮹啝辕⯭颪첺\uda2c\ud81e괻㌷냀툍봶،☇珟饊챂ϖ⻈ﶼㄭ䎺\udc0c嬞遣媅䏼\ue5d5\ue110㌇\ue49d鰜沁叺柅猀蜤\uf4c0ˋ鳤廩⟐ؒ\uf348㈅ﯲ쩑ú\u0bce녣刟팩༱给붨ꌀ\u2e6cῐ瞢⾣浡醘桶\u1759⣟텍\uee9eｋᱺ略㺋ඛ앨\ue302\ue3ab嗙规ꢏ⨀ϫ鼓膚垨豤쩲諧類\uab17륕\uebbb뮛ꀹ\ued14ℱⵚ苵⨖䥆鿓\u0a7e썾蟀ᅝḓ禍툕\uf859寮\ue99a圼\u0015㠝읎ぷ髾꼈♠镙쌟䓰顈躸\ue8f7㍉囜\uf59d铧里耄⼗녚籌"
         .length();
      int var17 = 0;
      int var16 = 0;
      String[] var15 = new String[2];
      short var18 = 8715;
      String var13 = "¡쥒쳖ߧ\uf7f8ٔ웼⟠Ⳬ\uda1f곀䗒\ue100㋲ẵ這穮ᇚ漎ქ塁ڒ\uf564ᘌ瓺琖첺輑첁炑곻ᠩឺ侅噏\uddca벿\ue7ecὴض㪭愽Ს\ueec2耘睋\uf86cញⲔ壤澾䮹啝辕⯭颪첺\uda2c\ud81e괻㌷냀툍봶،☇珟饊챂ϖ⻈ﶼㄭ䎺\udc0c嬞遣媅䏼\ue5d5\ue110㌇\ue49d鰜沁叺柅猀蜤\uf4c0ˋ鳤廩⟐ؒ\uf348㈅ﯲ쩑ú\u0bce녣刟팩༱给붨ꌀ\u2e6cῐ瞢⾣浡醘桶\u1759⣟텍\uee9eｋᱺ略㺋ඛ앨\ue302\ue3ab嗙规ꢏ⨀ϫ鼓膚垨豤쩲諧類\uab17륕\uebbb뮛ꀹ\ued14ℱⵚ苵⨖䥆鿓\u0a7e썾蟀ᅝḓ禍툕\uf859寮\ue99a圼\u0015㠝읎ぷ髾꼈♠镙쌟䓰顈躸\ue8f7㍉囜\uf59d铧里耄⼗녚籌";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 161;
               case 1 -> 83;
               case 2 -> 14;
               case 3 -> 165;
               case 4 -> 218;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      llII = var15;
      llIl = new Object[var15.length];
      int var9 = -518069416;
      byte[] var7 = "\u0003¬N\u000b¿èTW\u001füÐ³r\u008bÌÑÛ\u0000[3Y3Ó\u0081ã\u0094Ñh#?ª\u009b½O¯rpE¬9\u0085ñ\u0006ó.çá\u000f>û\u0089EY¾\u009cnâê\u008a\rD`P1P\u0012\u0092\u0012ö\u0017\u0002i \u0015ÔèåúwW\u001fþ\u00adC.sQé\n-ãÒDª\u0093\u008e&=öæ\u009b®rÓJ¹pÉ\b¬¢ç\u0014G²\u0013¡0N»Âuæ\u0098\\S¾Á)îÞ#Äet\u0099ä¡táÕtUÏrA0eW·\u0000~áÌr\u000e\u001cÛcRMÊ\u008fYô\u009cwû3íÆ®~#\"T\u0090åN.9Án\tå\u0004nÐ\"ÎÁÌ:\u0019¤\u000e\u008e\u0093a¦\u009d\u0018R\u0095ÚK\u0090W\u001e+\u008aò\u0003¼2èß2·ð;4ÑÞ*?ª\u0083÷êÍ\u0013ñÓOÛO\u000bU{Ñ\u0081×N\u00977<û\u001bË\u008dI%\u0011°*[\u0017Ó(MO\u0099ã\u0005¾JÙ¨üÙô\u0004µfðNgo\u009c\u000eI\tëw |Êê\u0090t\u000eaô+\f$¹\u0092Aè\u0089¤F®\\ÏAÀs\u009c4~Ù(ýrç\u0084ør\u008aÍ¡Þ\u0011e*h®E\u0087N¡Ä°Ô93<&*g\"1\u008d\bí\u0093áÔP-Sf\u0081Ãæà\u0093\u009bªd\u009aÉF³ù\u0016:h3ªlCÝ$ó\u001c>eWs¨*Ô¹3wBiÄ¹I\u000eÁ]2¢ÑDâÍ¸7yN>^\u0001{û+Ñ\u0096ò\u0000Ê\u0017g+Çòµ\rÛ\u0002T©\b\u009e@èì\u0001\u008b\u0085]yHPú]îÚiZ^¾ò\n\u008fPt\u0096\u001cý¢l\u0012hÎ\u008ad^V\u009f5áJ_\u0084ÏÓ\u0007\u008c«ðì/×¸}\u00adøçÿPò]o=\u009f£µö7Ùñ²a¬ÇÊq\u0082÷\u0092Æ-Õy ®«7o .Ï$V\u0010Ç¡M=\u001f\u001f\u0010qvÝÞwË\u000bÈ\u0083\u0081á\u0091T«)<\u0014c[ûMÂ\u0093o£R\r\u008eæep\u0002t\u0094L\u008cH±£´\u0086\u0093BDrÞ\u008f¦¾é®\u0016Ê9¦\u0091hlïNz¸@\u0007Z7ó\u001b\u0010\u008eÈ`1\nÑÄÈ\bBìà\u0092ãW§×É¹\u0000$ÅõÚ>¹\u0081î- ^h\u0088`¾{\u00adF\n¹½í\u0013ëíM\u0095«tFå\u008c\u0090\u001e8ÇT\u000f\fÛûWÙ\nÈV\u0098q}¶\u0014tõ^8õ\f5\u0015à\u0094\u008f=2]½èW÷NwUÆ\u009f\f\u0082¾]eíY$u\u0006i(.¶5¾ÖD/÷\u0081\u0007\"\u009eù\u0007[ë.g\u009bapôæ\u0083Ãyô¬\u009b\u001b\u00968¯/Á\u0005r5Þ\u0000CqY#\u0005%k\u007f\u009füÏ+âO¢hÒÅåGîDªÊ\u0083\u0087(@\u007f¿ÚhlygÑoÚ\u000fÛ|Ïu±N\t!Ð3\u008evs_Ýxí\u009a*\u0089U\\\u008a`Û\u0014Tí\u009f«¥\\JÂ\u0099Å~Uç¡Î\u008fê\u0095bBA3ßú\u009buåÅ\u0085ìo\u0019©bb¶\u0011¯\u0099$\u0016\u007fcÏG\u000fè\u0081w2Ql×\nõÒ³ \u0091ãèØ¡\u0000½MCv\u0097\u0012Õ³ë\u0083Ã\u0092\u0082ù\"&i¾\u0013\u0098ÈY\u001aæ\u0093HíÚ*h\u009eï*6ÝÀË\f\u007f\u0000\fbp\u008dv.\u0087Kæ è¢x\u0005hnÒð\u007f{\u000f\u008d[çHW\u0086f\u008c°Ô»;¶ïz\\êïÅ\u001a¶Tá\u0082|¿U{Õø\u0014Íð^àÎ¥\u00101ÀO\u0098O¡\u0081Í)1Î\u0092_\u00ad6\u000eoÍ\u001dB\u009d¡\u0017ò*\u0095\u007f\u0005+Ì\u008cÎ¯ãþ\u008a\u001a\u0090ì^\u009c%u6Mü\u008bîI\u0084\u0087\u0015ç÷¾;\u008b#\u0015Ù¹Ý´B;\u001b\u0081\u009f\u0016^ÍÜ®õ¤\u0002¦£}\u0097\u0003=àY\u0014i¯0ìÕ\u0087å«\u008c\u0013\u0014ÝØª Í\u001e\u0004ÙoO\u0084\u009a.\u008fQ\u0001ry\\ï3%\u0012\u0099\fÄq\u0083\u009f\u009e\u0002\u00071D/ÓOk£èãjs¹\nÊ|\u0016\u009d\u0005 ¹ã®\\\u0094©³;\u0085[\u007f%Ü\u0083\u0081\"\u0089J= \u0088È,£\u0001§¦9\u0083\u0097ß±\u0083x×¬Y¿`S¶Ö\t\u009a\u0099U²\u0085\u0097¸$®Åëñ \u0081\u0098D:\u009a\u000e^T\u0095§Æ\b¬T\u0085Û`»³e0\"PÝº[Âþ.²SY0Ý\u0095)+\u001dê\u0006\u0082JAõ,rTC\u0010ý\u000e\u0098®}\u0001f?Qâ\u0093_~º\u0098úë^\u001e\u008d\u0013\u0086qÄXÕü \u0002\u0095\"¢î\u0096\u0000\u0001ÞéV£ñ¢·Ew²ä\u000fæ\u0006\bc\t{ïÅ\u0081{K¾'i\u0094J&ä5¯©\u0082'õ\u008cNHW\u0086v³u\u0095\u001f'\u0018Ù¤U÷ÎMÉ"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lIll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lIll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[IIIll(2032089508, var23 ^ 1574257811)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIlII(var23 ^ 778313797, 'ｎ', '\uf1db')).length();
      int var1 = IIIll(2032089509, var23 ^ -2028801263);
      int var25 = -1;

      label97:
      while (true) {
         int var28 = IIIll(2032089510, var23 ^ 1752930913);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label92: {
               char[] var44 = var10001.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var28;
               var40 = var44;
               int var34 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var47 = var28;
                  var34 = var10004;
                  if (var10004 <= var6) {
                     break label92;
                  }

                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % IIIll(2032089506, var23 ^ 1597363976)) {
                     case 0 -> IIIll(2032089507, var23 ^ 1151585562);
                     case 1 -> IIIll(2032089516, var23 ^ 1258968400);
                     case 2 -> IIIll(2032089517, var23 ^ 1928926853);
                     case 3 -> IIIll(2032089518, var23 ^ -1105838083);
                     case 4 -> IIIll(2032089519, var23 ^ -292561856);
                     case 5 -> IIIll(2032089512, var23 ^ 1693863517);
                     default -> IIIll(2032089513, var23 ^ -266354632);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var34 <= var6) {
                        break;
                     }

                     var56 = var40;
                     var10004 = var47;
                     var10006 = var6;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var49;
                  if ((var25 += var1) >= var4) {
                     lI = var5;
                     lIl = new String[IIIll(2032089505, var23 ^ 457597466)];
                     lIII = new String[IIIll(2032089514, var23 ^ -294648296)];
                     Il();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var49;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label97;
                  }

                  var4 = (var2 = IIlII(var23 ^ 166542307, 'ｏ', '倌')).length();
                  var1 = IIIll(2032089511, var23 ^ 1207443901);
                  var25 = -1;
            }

            var28 = IIIll(2032089504, var23 ^ 1226160068);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private String IIIII(class_1799 var1) {
      return var1.method_7909().toString();
   }

   private void IIIIl() {
      this.ll = IIIll(2032089538, 1876828376 ^ 38464035);
      this.Illl = IIIll(2032089539, 1876828376 ^ 1862685008);
      this.IlII = IIIll(2032089548, 1876828376 ^ -2146322237);
      this.IIll.clear();
      this.lIII();
   }

   private boolean IIIlI(long var1, class_310 var3, lIlIllll var4) {
      if (this.lIlI && var1 == this.IlIl) {
         boolean var5 = this.lII(var3, var4);
         this.lIlI = false;
         this.lll = 0L;
         if (var5) {
            this.IIl = System.currentTimeMillis();
            this.IlI = this.IllI();
         }

         return var5;
      } else {
         return false;
      }
   }
}
