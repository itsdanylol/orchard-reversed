package k74.x;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2743;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

@Environment(EnvType.CLIENT)
public final class IIlIIIlIl extends IlIIIIIIl {
   private final IllIII<IlIIlIlI> II;
   private boolean Il;
   private int lI;
   private boolean ll;
   private boolean III;
   private static final int I = 3;
   private int IIl;
   private static final int IlI = 8;
   private final IIlIII Ill;
   private int lII;
   private class_243 lIl;
   private final IIlIII llI;
   private static final Object[] llII;
   private static final int[] lIlI;
   private static final String[] lll;
   private static final String[] lIll;
   private final lllIIlII IIII;
   private float IIIl;
   private boolean IIlI;
   private static final int IIll = 9;
   private final IlIIIllll IlII;
   private int IlIl;
   private int IllI;
   private int Illl;
   private int lIII;
   private static final String[] lIIl;

   private int I(class_310 var1) {
      for (int var2 = 0; var2 < llII(1020212460, -296237214 ^ -221408836); var2++) {
         class_1799 var3 = var1.field_1724.method_31548().method_5438(var2);
         if (var3.method_31574(class_1802.field_8786)) {
            return var2;
         }
      }

      return -1;
   }

   private boolean l() {
      double var1 = this.Ill.IllI();
      return var1 >= 100.0 || var1 > 0.0 && ThreadLocalRandom.current().nextDouble(100.0) < var1;
   }

   private boolean II(class_310 var1, IlIIlIlII var2) {
      return this.IIIl(var1, var2.I());
   }

   private boolean Il(class_1657 var1) {
      if (this.Il) {
         return false;
      } else {
         IIIIIllII var2 = IIIIIllII.III();
         IIlIIlIII var3 = var2 != null && var2.II() != null ? var2.II().lIIIIl() : null;
         return var3 != null && var3.IIIIlIl() && var3.IIlII(var1);
      }
   }

   private class_243 lI(class_310 var1, class_1309 var2) {
      class_243 var3 = this.IllI == var2.method_5628() && this.lI != llII(1020212450, -144368837 ^ -1594053502) && var1.field_1724.field_6012 - this.lI <= 3
         ? this.lIl
         : var2.method_18798();
      return var3 == null ? class_243.field_1353 : new class_243(var3.field_1352, 0.0, var3.field_1350);
   }

   private void ll(class_310 var1) {
      if (var1.field_1724.field_6012 > this.lII) {
         this.IIl();
      } else if ((this.IlIl >= 0 ? var1.field_1687.method_8469(this.IlIl) : null) instanceof class_1309 var3 && var3.method_5805()) {
         class_243 var4 = var3.method_33571();
         float var5 = this.IlII.llllII(var1, var4, this.llI.IllI().floatValue());
         if (var5 <= 4.0F) {
            this.IIl();
         }
      } else {
         this.IIl();
      }
   }

   private void III(class_310 var1) {
      String[] var2 = llIllIlI.IIlII();
      if (this.IllI >= 0
         && var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var1.field_1755 == null
         && var1.field_1724.field_6012 >= this.lIII) {
         IIIIIllII var3 = IIIIIllII.III();
         IIlIlIlII var4 = var3 != null && var3.II() != null ? var3.II().llIlIl() : null;
         if ((var4 == null || !var4.IlIlIl()) && !IlllIlII.lllIl() && !k74.x.IIll.IIlllll() && !lIIIllII.ll(var1)) {
            if (!(var1.field_1687.method_8469(this.IllI) instanceof class_1309 var6 && var6.method_5805() && !k74.x.IIll.lIllIl(var6))) {
               this.IIl();
            } else if (var6 instanceof class_1657 var7 && this.Il(var7)) {
               this.IIl();
            } else {
               int var15 = this.I(var1);
               IlIIlIlII var8 = var15 < 0 ? null : this.lIIl(var1, var6);
               if (var8 == null) {
                  this.IlII.IIlIl();
                  this.lIII = var1.field_1724.field_6012 + 1;
               } else {
                  int var9 = this.IllI;
                  if (this.II.IllI() != IlIIlIlI.I) {
                     float[] var16 = IlllIlII.lIII(var1, var8.II());
                     if (var16 == null) {
                        this.lIII = var1.field_1724.field_6012 + 1;
                     } else {
                        boolean var17 = IlllIlII.IlII(var1, llII(1020212476, 483973800 ^ -274178877), var16[0], var16[1], this::IllI);
                        if (!var17) {
                           this.lIII = var1.field_1724.field_6012 + 1;
                        } else {
                           this.III = true;
                           this.IIl = var1.field_1724.field_6012;
                        }
                     }
                  } else {
                     float var10 = this.IlII.IIIllII(var1, var8.I(), this.llI.IllI().floatValue());
                     boolean var11 = var10 <= 2.5F
                        || var1.field_1765 instanceof class_3965 var12
                           && var12.method_17783() == class_240.field_1332
                           && var12.method_17777().equals(var8.Il())
                           && (var12.method_17780() == var8.I().method_17780() || var8.l().equals(var12.method_17777().method_10093(var12.method_17780())));
                     if (var11) {
                        label113: {
                           class_3965 var18 = var1.field_1765 instanceof class_3965 var19
                                 && var19.method_17783() == class_240.field_1332
                                 && var19.method_17777().equals(var8.Il())
                                 && var8.l().equals(var19.method_17777().method_10093(var19.method_17780()))
                              ? var19
                              : var8.I();
                           boolean var20 = k74.x.IIll.lllIII(var1, this, var15, this::lII);
                           this.IlII(var1, var9, var20);
                           if (var20 && var6.method_5805()) {
                              this.ll = true;
                              this.IlIl = var9;
                              this.lII = var1.field_1724.field_6012 + llII(1020212451, 483973800 ^ 233022800);
                              this.IlII.llllII(var1, var6.method_33571(), this.llI.IllI().floatValue());
                              if (var2 != null) {
                                 break label113;
                              }
                           }

                           this.IlII.IIlIl();
                        }

                        if (var2 != null) {
                           return;
                        }
                     }

                     this.lIII = var1.field_1724.field_6012;
                  }
               }
            }
         } else {
            this.lIII = var1.field_1724.field_6012 + 1;
         }
      }
   }

   private void IIl() {
      int var1 = 2045785900;
      this.Il = false;
      this.IllI = -1;
      this.lIII = llII(1020212477, var1 ^ -1125620061);
      this.Illl = llII(1020212478, var1 ^ 480039073);
      this.IIl = llII(1020212479, var1 ^ 1323506073);
      this.lI = llII(1020212472, var1 ^ -724106728);
      this.IIIl = 0.0F;
      this.lIl = class_243.field_1353;
      this.III = false;
      this.ll = false;
      this.IlIl = -1;
      this.lII = llII(1020212473, var1 ^ 525254831);
      this.IlII.IIlIl();
   }

   private boolean Ill(class_310 var1, class_2338 var2) {
      if (var1 != null && var1.field_1687 != null && var2 != null) {
         class_2680 var3 = var1.field_1687.method_8320(var2);
         return var3.method_26227().method_15769() && !var3.method_27852(class_2246.field_10382) && !var3.method_27852(class_2246.field_10164)
            ? var3.method_26215()
               || var3.method_45474()
               || k74.x.IIll.lIIlIl(var3)
               || var3.method_27852(class_2246.field_10036)
               || var3.method_27852(class_2246.field_22089)
            : false;
      } else {
         return false;
      }
   }

   private boolean lII(class_310 var1, class_3965 var2) {
      return this.IIIl(var1, var2);
   }

   private static String lIl(int var0, int var1) {
      int var9 = 1675793083;
      int var2 = (var0 ^ llII(1020212474, var9 ^ -266641382)) & llII(1020212475, var9 ^ -1801824726);
      if (lll[var2] == null) {
         char[] var3 = lIIl[var2].toCharArray();

         int var4 = switch (var3[0] & llII(1020212468, var9 ^ 1670007970)) {
            case 0 -> llII(1020212469, var9 ^ 559600056);
            case 1 -> llII(1020212470, var9 ^ -1788624105);
            case 2 -> llII(1020212471, var9 ^ -1857213536);
            case 3 -> llII(1020212464, var9 ^ -1857983342);
            case 4 -> llII(1020212465, var9 ^ 350491078);
            case 5 -> llII(1020212466, var9 ^ 878626483);
            case 6 -> llII(1020212467, var9 ^ 1424059516);
            case 7 -> llII(1020212428, var9 ^ 1767618810);
            case 8 -> llII(1020212429, var9 ^ -334400806);
            case 9 -> llII(1020212430, var9 ^ -1574679875);
            case 10 -> llII(1020212431, var9 ^ -438276797);
            case 11 -> llII(1020212424, var9 ^ 1470945461);
            case 12 -> llII(1020212425, var9 ^ -751275770);
            case 13 -> llII(1020212426, var9 ^ 1227051231);
            case 14 -> llII(1020212427, var9 ^ -2071899925);
            case 15 -> 0;
            case 16 -> llII(1020212420, var9 ^ -1216621628);
            case 17 -> llII(1020212421, var9 ^ 105028147);
            case 18 -> llII(1020212422, var9 ^ 810996281);
            case 19 -> llII(1020212423, var9 ^ 691510376);
            case 20 -> llII(1020212416, var9 ^ 2074205600);
            case 21 -> llII(1020212417, var9 ^ 406656910);
            case 22 -> llII(1020212418, var9 ^ -1905222455);
            case 23 -> llII(1020212419, var9 ^ 1998934120);
            case 24 -> llII(1020212444, var9 ^ -2143501359);
            case 25 -> llII(1020212445, var9 ^ 1144597608);
            case 26 -> llII(1020212446, var9 ^ 891250086);
            case 27 -> 5;
            case 28 -> llII(1020212447, var9 ^ 158774911);
            case 29 -> llII(1020212440, var9 ^ 934554746);
            case 30 -> llII(1020212441, var9 ^ 264748915);
            case 31 -> llII(1020212442, var9 ^ -1258093405);
            case 32 -> llII(1020212443, var9 ^ 473129847);
            case 33 -> llII(1020212436, var9 ^ 1461847839);
            case 34 -> llII(1020212437, var9 ^ 1700394732);
            case 35 -> llII(1020212438, var9 ^ 2108624733);
            case 36 -> llII(1020212439, var9 ^ 1967965062);
            case 37 -> llII(1020212432, var9 ^ -1462351724);
            case 38 -> llII(1020212433, var9 ^ 1048148110);
            case 39 -> llII(1020212434, var9 ^ 1235761553);
            case 40 -> llII(1020212435, var9 ^ -215936341);
            case 41 -> llII(1020212396, var9 ^ -159746840);
            case 42 -> llII(1020212397, var9 ^ 25941077);
            case 43 -> llII(1020212398, var9 ^ -1011885418);
            case 44 -> llII(1020212399, var9 ^ -1596761665);
            case 45 -> llII(1020212392, var9 ^ -1195751508);
            case 46 -> llII(1020212393, var9 ^ -1361118027);
            case 47 -> llII(1020212394, var9 ^ -867472543);
            case 48 -> llII(1020212395, var9 ^ -1335693758);
            case 49 -> llII(1020212388, var9 ^ -1766971641);
            case 50 -> llII(1020212389, var9 ^ -937481865);
            case 51 -> llII(1020212390, var9 ^ 86023866);
            case 52 -> llII(1020212391, var9 ^ -1597958159);
            case 53 -> llII(1020212384, var9 ^ 1753909159);
            case 54 -> llII(1020212385, var9 ^ -161881601);
            case 55 -> llII(1020212386, var9 ^ -170066683);
            case 56 -> llII(1020212387, var9 ^ 1794390798);
            case 57 -> llII(1020212412, var9 ^ -1417740494);
            case 58 -> llII(1020212413, var9 ^ -935311525);
            case 59 -> llII(1020212414, var9 ^ -55991546);
            case 60 -> llII(1020212415, var9 ^ 960712654);
            case 61 -> llII(1020212408, var9 ^ 115485623);
            case 62 -> llII(1020212409, var9 ^ -645962083);
            case 63 -> llII(1020212410, var9 ^ 202381429);
            case 64 -> llII(1020212411, var9 ^ -145453534);
            case 65 -> llII(1020212404, var9 ^ -1005093657);
            case 66 -> llII(1020212405, var9 ^ -281094936);
            case 67 -> llII(1020212406, var9 ^ -1976096828);
            case 68 -> llII(1020212407, var9 ^ -1088615620);
            case 69 -> llII(1020212400, var9 ^ -276973399);
            case 70 -> llII(1020212401, var9 ^ -167601970);
            case 71 -> llII(1020212402, var9 ^ -1724953955);
            case 72 -> llII(1020212403, var9 ^ 805012027);
            case 73 -> llII(1020212364, var9 ^ -483325754);
            case 74 -> llII(1020212365, var9 ^ 909281018);
            case 75 -> llII(1020212366, var9 ^ -955303137);
            case 76 -> llII(1020212367, var9 ^ 1636866627);
            case 77 -> llII(1020212360, var9 ^ 263086334);
            case 78 -> llII(1020212361, var9 ^ 1187385352);
            case 79 -> llII(1020212362, var9 ^ -721629656);
            case 80 -> llII(1020212363, var9 ^ -1332409975);
            case 81 -> llII(1020212356, var9 ^ 1626192274);
            case 82 -> llII(1020212357, var9 ^ -879628521);
            case 83 -> llII(1020212358, var9 ^ -1742286487);
            case 84 -> llII(1020212359, var9 ^ -2093286841);
            case 85 -> llII(1020212352, var9 ^ 1721937913);
            case 86 -> llII(1020212353, var9 ^ -1978258444);
            case 87 -> llII(1020212354, var9 ^ 381093801);
            case 88 -> llII(1020212355, var9 ^ 1974446544);
            case 89 -> llII(1020212380, var9 ^ -533199992);
            case 90 -> llII(1020212381, var9 ^ 1648329111);
            case 91 -> llII(1020212382, var9 ^ -1534384059);
            case 92 -> llII(1020212383, var9 ^ -1170491836);
            case 93 -> llII(1020212376, var9 ^ 1196563392);
            case 94 -> llII(1020212377, var9 ^ 1638509171);
            case 95 -> llII(1020212378, var9 ^ 784823486);
            case 96 -> llII(1020212379, var9 ^ -1044152972);
            case 97 -> llII(1020212372, var9 ^ 83470924);
            case 98 -> llII(1020212373, var9 ^ -209283150);
            case 99 -> llII(1020212374, var9 ^ 1997132609);
            case 100 -> llII(1020212375, var9 ^ -231071268);
            case 101 -> llII(1020212368, var9 ^ -746668731);
            case 102 -> llII(1020212369, var9 ^ 605798011);
            case 103 -> llII(1020212370, var9 ^ 1144258012);
            case 104 -> llII(1020212371, var9 ^ 1216006236);
            case 105 -> llII(1020212332, var9 ^ -612422485);
            case 106 -> llII(1020212333, var9 ^ 157727073);
            case 107 -> llII(1020212334, var9 ^ -1194907662);
            case 108 -> llII(1020212335, var9 ^ -290033922);
            case 109 -> llII(1020212328, var9 ^ 2073308869);
            case 110 -> llII(1020212329, var9 ^ 684763203);
            case 111 -> llII(1020212330, var9 ^ -1035688716);
            case 112 -> llII(1020212331, var9 ^ -109330381);
            case 113 -> llII(1020212324, var9 ^ -636434879);
            case 114 -> llII(1020212325, var9 ^ 1783692856);
            case 115 -> llII(1020212326, var9 ^ 1503635463);
            case 116 -> llII(1020212327, var9 ^ 60141762);
            case 117 -> llII(1020212320, var9 ^ 786992362);
            case 118 -> llII(1020212321, var9 ^ 1135090885);
            case 119 -> llII(1020212322, var9 ^ 1012354657);
            case 120 -> llII(1020212323, var9 ^ 1268209764);
            case 121 -> llII(1020212348, var9 ^ -749601672);
            case 122 -> llII(1020212349, var9 ^ 1007757096);
            case 123 -> llII(1020212350, var9 ^ -740031214);
            case 124 -> llII(1020212351, var9 ^ 1262897419);
            case 125 -> llII(1020212344, var9 ^ 2043838022);
            case 126 -> llII(1020212345, var9 ^ -1728277108);
            case 127 -> llII(1020212346, var9 ^ 77760120);
            case 128 -> llII(1020212347, var9 ^ 1356902394);
            case 129 -> llII(1020212340, var9 ^ -2064234519);
            case 130 -> llII(1020212341, var9 ^ 2032493936);
            case 131 -> llII(1020212342, var9 ^ 950101606);
            case 132 -> llII(1020212343, var9 ^ -1024220255);
            case 133 -> llII(1020212336, var9 ^ -783724098);
            case 134 -> llII(1020212337, var9 ^ 2109261399);
            case 135 -> llII(1020212338, var9 ^ 135824384);
            case 136 -> llII(1020212339, var9 ^ 2111211878);
            case 137 -> llII(1020212300, var9 ^ 1214680928);
            case 138 -> llII(1020212301, var9 ^ 1748780018);
            case 139 -> llII(1020212302, var9 ^ 1711910853);
            case 140 -> 4;
            case 141 -> llII(1020212303, var9 ^ -1721805424);
            case 142 -> llII(1020212296, var9 ^ -886905247);
            case 143 -> llII(1020212297, var9 ^ -1243177097);
            case 144 -> llII(1020212298, var9 ^ -882794327);
            case 145 -> llII(1020212299, var9 ^ 477066765);
            case 146 -> llII(1020212292, var9 ^ -641113640);
            case 147 -> llII(1020212293, var9 ^ 520117007);
            case 148 -> llII(1020212294, var9 ^ -913883802);
            case 149 -> llII(1020212295, var9 ^ 53404873);
            case 150 -> llII(1020212288, var9 ^ 1688431387);
            case 151 -> llII(1020212289, var9 ^ -841414614);
            case 152 -> llII(1020212290, var9 ^ 301776089);
            case 153 -> llII(1020212291, var9 ^ 398801061);
            case 154 -> llII(1020212316, var9 ^ 1558268277);
            case 155 -> llII(1020212317, var9 ^ -1694803584);
            case 156 -> llII(1020212318, var9 ^ 1194139707);
            case 157 -> llII(1020212319, var9 ^ -1326286361);
            case 158 -> llII(1020212312, var9 ^ -1682992110);
            case 159 -> llII(1020212313, var9 ^ -2135737734);
            case 160 -> llII(1020212314, var9 ^ -1945281341);
            case 161 -> llII(1020212315, var9 ^ -1891614918);
            case 162 -> llII(1020212308, var9 ^ 1129841700);
            case 163 -> llII(1020212309, var9 ^ -187675780);
            case 164 -> llII(1020212310, var9 ^ 935873807);
            case 165 -> llII(1020212311, var9 ^ 1832961584);
            case 166 -> llII(1020212304, var9 ^ -53246920);
            case 167 -> llII(1020212305, var9 ^ -1467091841);
            case 168 -> llII(1020212306, var9 ^ -1141777734);
            case 169 -> llII(1020212307, var9 ^ -883092547);
            case 170 -> llII(1020212268, var9 ^ -290603106);
            case 171 -> llII(1020212269, var9 ^ 773216783);
            case 172 -> llII(1020212270, var9 ^ -26063209);
            case 173 -> llII(1020212271, var9 ^ 1496243182);
            case 174 -> llII(1020212264, var9 ^ 2089694003);
            case 175 -> llII(1020212265, var9 ^ -1696989773);
            case 176 -> llII(1020212266, var9 ^ -1223293199);
            case 177 -> llII(1020212267, var9 ^ 455779902);
            case 178 -> llII(1020212260, var9 ^ -1021570261);
            case 179 -> llII(1020212261, var9 ^ -1603331874);
            case 180 -> llII(1020212262, var9 ^ -171347095);
            case 181 -> llII(1020212263, var9 ^ 834120175);
            case 182 -> 2;
            case 183 -> llII(1020212256, var9 ^ -815835345);
            case 184 -> llII(1020212257, var9 ^ -1885870045);
            case 185 -> llII(1020212258, var9 ^ -889996609);
            case 186 -> llII(1020212259, var9 ^ -2008261914);
            case 187 -> llII(1020212284, var9 ^ -2027444953);
            case 188 -> llII(1020212285, var9 ^ -1563599741);
            case 189 -> llII(1020212286, var9 ^ 1774902000);
            case 190 -> llII(1020212287, var9 ^ 2132735021);
            case 191 -> llII(1020212280, var9 ^ -440269832);
            case 192 -> llII(1020212281, var9 ^ 1405862325);
            case 193 -> llII(1020212282, var9 ^ -757542232);
            case 194 -> llII(1020212283, var9 ^ 783652695);
            case 195 -> llII(1020212276, var9 ^ -280635271);
            case 196 -> llII(1020212277, var9 ^ 1894593384);
            case 197 -> llII(1020212278, var9 ^ -668381081);
            case 198 -> llII(1020212279, var9 ^ -1445945908);
            case 199 -> llII(1020212272, var9 ^ 1840875370);
            case 200 -> 3;
            case 201 -> llII(1020212273, var9 ^ -1112268359);
            case 202 -> llII(1020212274, var9 ^ 1550493620);
            case 203 -> llII(1020212275, var9 ^ 1219865546);
            case 204 -> llII(1020212236, var9 ^ -382307261);
            case 205 -> llII(1020212237, var9 ^ 420025931);
            case 206 -> llII(1020212238, var9 ^ -1963504226);
            case 207 -> llII(1020212239, var9 ^ 83177839);
            case 208 -> llII(1020212232, var9 ^ -1225332803);
            case 209 -> llII(1020212233, var9 ^ 810307933);
            case 210 -> llII(1020212234, var9 ^ 1240231530);
            case 211 -> llII(1020212235, var9 ^ -463188784);
            case 212 -> llII(1020212228, var9 ^ 1038193418);
            case 213 -> llII(1020212229, var9 ^ -1147121136);
            case 214 -> llII(1020212230, var9 ^ -1614343689);
            case 215 -> llII(1020212231, var9 ^ 659600799);
            case 216 -> llII(1020212224, var9 ^ 868182908);
            case 217 -> llII(1020212225, var9 ^ -1565882277);
            case 218 -> llII(1020212226, var9 ^ 1299589628);
            case 219 -> llII(1020212227, var9 ^ -507625389);
            case 220 -> llII(1020212252, var9 ^ 977082144);
            case 221 -> llII(1020212253, var9 ^ -146937850);
            case 222 -> llII(1020212254, var9 ^ -1107236645);
            case 223 -> llII(1020212255, var9 ^ -1745636617);
            case 224 -> llII(1020212248, var9 ^ -1061770776);
            case 225 -> 1;
            case 226 -> llII(1020212249, var9 ^ 203346057);
            case 227 -> llII(1020212250, var9 ^ -2059820152);
            case 228 -> llII(1020212251, var9 ^ 2020243336);
            case 229 -> llII(1020212244, var9 ^ -1325357709);
            case 230 -> llII(1020212245, var9 ^ 383290364);
            case 231 -> llII(1020212246, var9 ^ 1951223213);
            case 232 -> llII(1020212247, var9 ^ 1519522711);
            case 233 -> llII(1020212240, var9 ^ 88757707);
            case 234 -> llII(1020212241, var9 ^ -858605114);
            case 235 -> llII(1020212242, var9 ^ -447045359);
            case 236 -> llII(1020212243, var9 ^ -1808573934);
            case 237 -> llII(1020212716, var9 ^ 92101304);
            case 238 -> llII(1020212717, var9 ^ -1614799110);
            case 239 -> llII(1020212718, var9 ^ -1979895466);
            case 240 -> llII(1020212719, var9 ^ 319204363);
            case 241 -> llII(1020212712, var9 ^ -393450043);
            case 242 -> llII(1020212713, var9 ^ -1973765059);
            case 243 -> llII(1020212714, var9 ^ -846428950);
            case 244 -> llII(1020212715, var9 ^ -1503525740);
            case 245 -> llII(1020212708, var9 ^ -755751661);
            case 246 -> llII(1020212709, var9 ^ -213311604);
            case 247 -> llII(1020212710, var9 ^ -1392671330);
            case 248 -> llII(1020212711, var9 ^ -1798612662);
            case 249 -> llII(1020212704, var9 ^ -1598451436);
            case 250 -> llII(1020212705, var9 ^ 1361166383);
            case 251 -> llII(1020212706, var9 ^ 1900577583);
            case 252 -> llII(1020212707, var9 ^ -1070550044);
            case 253 -> llII(1020212732, var9 ^ -502410738);
            case 254 -> llII(1020212733, var9 ^ 163594588);
            default -> llII(1020212734, var9 ^ -64907288);
         };
         int var5 = (var1 & llII(1020212735, var9 ^ -759700752)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & llII(1020212728, var9 ^ 282629279)) >>> llII(1020212729, var9 ^ 1253913726)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & llII(1020212730, var9 ^ 1892106860);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & llII(1020212731, var9 ^ 1839743908);
            }
         }

         lll[var2] = new String(var3).intern();
      }

      return lll[var2];
   }

   private double llI(class_238 var1, class_2338 var2) {
      double var3 = Math.max(0.0, Math.min(var1.field_1320, var2.method_10263() + 1.0) - Math.max(var1.field_1323, (double)var2.method_10263()));
      double var5 = Math.max(0.0, Math.min(var1.field_1324, var2.method_10260() + 1.0) - Math.max(var1.field_1321, (double)var2.method_10260()));
      return var3 * var5;
   }

   private static int llII(int var0, int var1) {
      int var2 = lIlI[var0 ^ 1020212460] ^ var1 ^ var0;
      var2 += 46191;
      var2 ^= 58592;
      var2 += 62407;
      var2 -= 24349;
      var2 ^= 45412;
      var2 += 56093;
      return var2 - 58029;
   }

   private static String lllI(byte var0, byte var1, int var2, short var3, char var4, int var5, short var6) {
      int var11 = var2 ^ -320895488;
      char[] var10 = lIll[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])llII[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         llII[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 51103;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ 17306 ^ switch (var9 % 21) {
            default -> 209;
            case 1 -> 216;
            case 2 -> 61;
            case 3 -> 66;
            case 4 -> 100;
            case 5 -> 102;
            case 6 -> 249;
            case 7 -> 4;
            case 8 -> 254;
            case 9 -> 226;
            case 10 -> 11;
            case 11 -> 135;
            case 12 -> 60;
            case 13 -> 80;
            case 14 -> 33;
            case 15 -> 119;
            case 16 -> 21;
            case 17 -> 116;
            case 18 -> 22;
            case 19 -> 37;
            case 20 -> 245;
         } ^ var3 ^ var0 ^ var8 ^ var5 ^ var2 ^ var4 ^ var6 ^ var1);
      }

      return new String(var10).intern();
   }

   private boolean lll(class_310 var1, class_2338 var2) {
      class_2680 var3 = var1.field_1687.method_8320(var2);
      return !var3.method_26215()
         && var3.method_26227().method_15769()
         && !var3.method_27852(class_2246.field_10382)
         && !var3.method_27852(class_2246.field_10164)
         && !var3.method_26220(var1.field_1687, var2).method_1110();
   }

   public boolean IIII() {
      return this.IIIIlIl() && (this.IIlI || this.ll || this.IllI >= 0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1533742041;
      String[] var15 = new String[2];
      int var14 = "9\uf445蠏ﮢ㣇\uf071ᡒ\uf7b8裡ﰆ颶ﲕ렃\uf3c2룈Ｑ硓\uf188ᣬ\ufaf6袶\uf325栌\uf8f2\ua8c9\uf4a1\ue852\uf148裢\uf796ࢸ\uf275砈\uf652\uf8c5\uf591衝\uf778죪ﳖꢲ\uf735⠅\uf402飃ﮑࡖ\uf8c8ࣤｶ⢸\uf5d5㠉︲죋ﺱ衙\uf588Yꨁ\uec5f걆ⲙ궅䰉ꐜ಼ꨢᳯꥑ鱐Ꞗ첗굥䰅ꢜ벶ꁢ泦꾱鱝꩖ﲙ꒕簅귌Ჱ긲鳠ꆱ᱒ꔖ겔ꜵ尃꾼費깢質ꮁౚꃆ粝ꋕﰇꈜ粲ꩲ㳯걑汖ꬆﲙ걅尊꽜겹긢鳯ꆡ᱕ꓦ粞꾥\uec02ꀬ沺ꠂ쳡ꥱ뱝ꓦ粗곥氉꾬겱괒賤꒑\u0c5eꬆ貙ꪕఅꤼ㲵ꉒ"
         .length();
      String var13 = "9\uf445蠏ﮢ㣇\uf071ᡒ\uf7b8裡ﰆ颶ﲕ렃\uf3c2룈Ｑ硓\uf188ᣬ\ufaf6袶\uf325栌\uf8f2\ua8c9\uf4a1\ue852\uf148裢\uf796ࢸ\uf275砈\uf652\uf8c5\uf591衝\uf778죪ﳖꢲ\uf735⠅\uf402飃ﮑࡖ\uf8c8ࣤｶ⢸\uf5d5㠉︲죋ﺱ衙\uf588Yꨁ\uec5f걆ⲙ궅䰉ꐜ಼ꨢᳯꥑ鱐Ꞗ첗굥䰅ꢜ벶ꁢ泦꾱鱝꩖ﲙ꒕簅귌Ჱ긲鳠ꆱ᱒ꔖ겔ꜵ尃꾼費깢質ꮁౚꃆ粝ꋕﰇꈜ粲ꩲ㳯걑汖ꬆﲙ걅尊꽜겹긢鳯ꆡ᱕ꓦ粞꾥\uec02ꀬ沺ꠂ쳡ꥱ뱝ꓦ粗곥氉꾬겱괒賤꒑\u0c5eꬆ貙ꪕఅꤼ㲵ꉒ";
      int var17 = 0;
      short var18 = 28957;
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 173;
               case 1 -> 240;
               case 2 -> 26;
               case 3 -> 62;
               case 4 -> 73;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lIll = var15;
      llII = new Object[var15.length];
      int var9 = -1408685604;
      byte[] var7 = "\u008c\\YªÝ\u00894à\u0007\u0007°\u0011ããP\u0090yá\nÅ\u0007\u008d_7\u0010\u0002s1ß8´;Ð\u001a\u001d\u0091\u008a:òÊ\u0015r\u00820Ç\u0093åÙ¡üçîk-\u001eLG_¸¼\u0081ýp\u0085c¶\u0090©ÕÞ^\u0095uªè\u0094'Õ!\u00ad½á:+vxø\u009düÀ\u0015\u0004g¿Ë\u0084\u0090®Î\u0003Ò~R\rfG^ûbi´þbeï\u0007çÀ\u008c\u0013ÇzY\u0085§Åè9\u009a\u007f%4\u001f5ñXQ\u0000×o\u0016Äò,¤\u0088EL \u001cò²º\u0007ÏÝw¥Ó\\D_PFõf\u001eSÃrQ\u0095Ú\u0013\u0018?\u0088\u0085^,ë\u0019\u0094'}T\u0001\u0019\u0084\u0001Ô\u0013s\u0018G\u008b·\u001d¨\u000fÆ;øYúR2;Ä\u0090±´üã<ÅF'\u0099\u0094ï\u0017þ\u008a¤\u0006\u0098a\u0096}k\u000b\u008e\u008b\u008b\f\u0086h^A[ò×\u0084Í]å³º\u008c½Ñ\u0000\u0005\u008f]\u0005^ë±ò¯K\u00010\u008bGÓS÷Ä#K\u009eÚ\u001b]ú\u007fx?oè³CFq\"e\u008a¤\u008a;;´êö\u0004\u001aÁSå\u0093\u0088\u009b®\u001a\u001a\u0005}~\u009b\u0006ø`I\u0099Ð¹§XZ|®;dÄ\u0084\u000f\u008d!¶ÊgÒeõÆ¶\u000b*[âýÿ4\u009c\\\u0004p\u0013¬73ÿy\u001c\u001aPÈy\u0013£úL9\u008f\u0004\u001cY%î\u0005&\u001b8j\u000bÎ»Üß\u0006^\u0010\u0015\u0095©Å\u0016\u0002è4+¿\u0010\u0092´\u0007ëü\u008aã!µâ\u0093è'ØM\u008fC±\u0094 \u0093É$ù8µlºk\u0002Uyp\u001eg\u0098\u0095\u0086+¬y2¯ëå\u0093\u0098ì\u0086\u008b-Ð\u0013\u001c\u009eõ\u0091\u001b\u001e¢W¯«\u0095I\u001f2k´v\u009fÕ\u0092\u008d)\u008aÝãé\u00102çà\r÷Ý.m\u0000¢\bÙ\u0084-W\u0007\u0001\u001e¢  Z9D×?!\u001c·\u0017yò»^LS([¨PúB$\nKã£;\u001d\u0092ó®\u0088°ª$Ûô+^1`&Ë\n_]K)4[<\u0099t}>ª»7\u009að±/\u000eÝÌ\u0013y°\u008c\u0098\u0010ÏsÍA¸³ÛJ ux\u009eÏ5£ê À\u0086\r¸bÊ?\u008aöýRkØ\u0011L÷\u0086\u001b\u001c£Ä2¿wÒØP\u008a\u0001á§Ë\u0085âÈ1×>à\"mÕJ\u008e\u009cB¤û<\u0000Ñ\u008eò\u0014K»B\u000bð\u009b\u0018Á¨\u0095-,æj{Ñ\u00058\u0006e_FÂ\u0002c8E=ÙïKëC*íå.ì$Ø1:£¾Nð\ny\u0089\u0097\u0087ô\u0094>ý\u008b\\âØ!\u0098äá¼W¯ÅË}ißÚ¨´\t¢4CÖä\u009bh\u008b\u000b¶s\u0097¾\u0090\u007f)Ø$|d Ï°|\u0086x\u0007ôÖÀÄìÎ\u001c\u009edDk\u000f÷\u001bß[©i\u001eHÕE\u00158y\u008c \u001d\u0089<ÀÝ2Ù]\rVÍÊª\nFÙ\u008fª°jiýy\u0016D2\u009b3è\u000e$\u001e08\u0090vSK\u009c \u0006íì\u0089Â\u00936d<{Ó\u008f|³wÕ9×>B{hØ\u0093t\u0003'HQéØ\u001a\u009aîG+\u008c:i+\u0016æ\u0080\u0084 ï\\f!üV3Ý\u0091\nQ\u001caE«\u0083É®L+\rÓ}Zô\u001e\u008c\u009e\u009d\u0005\bN\u0090¢ï¯N#8»\u0091/`\u001a\u0012éTê-\u0092ÌyÓÎÚ÷Ñ®\u0092EÒxvÃhÕïºÈìm\u0017@Ï«ÎÅ\u0010pH\u0084Ñslã\u008e\u0005Ôt(\u008dÀ\u009bïäQ\u008e\f\u0088¾R¶\u000f\u0012\u009aß\u0092É\u0019\u0093¡\u0004\u0019wãM$w5d×-)3\u0092*\u008aÿ:M¬v\u001d<?\u008bNôÚB$!éåü\u000f=\u0087iÒq©¶\u0097QönÖð?ö&\u001b\u0016~%Ðg\u0017ÅÈöYÄûlä\u009c9zÙ\u00ad_à\".¥\u001b¨î$y~ ï>¨\u0018\u0001UF\u0081ú!Ð¹\u0017\u0000m\u0083\u008d_Ù\u0006xgïÛîS\u009d\u000f\u000e¢\u0005Bá\u0082l\u0000Â3\u00146¡\u0011)PºúäÄ*\u000f\u0005\té!\u0093aZãý\b2¹\u0099¨£\u0083ãÁÃ\u009e\u008cÀ\n\u0080 \u0002n\u007fé·\u008cS_\u008fýØ\tÝïá\u008dKÑ\u008aÉ´\nÍd#UJ\u001ec\u0015\u0088Q\u0089\u0097q\u009bÓzÒâ<\u0091é©\u0099 ®;Í\u0004¿ÄôÛT¿$|\u0085tòu=\u0014w\u0004\r\u008f¹à×+D\u009b\u0092b6±B»:{^Mº«Y\u0085'è\u0096ø^\u0091\u0099ÝºÏõ®Wà@ZÁ\u0083.\u0018\u009b\u0093.9\u0004\u009d"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lIlI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lIlI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[llII(1020212461, var23 ^ 371470411)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lllI((byte)111, 20, -320895488, (short)-26424, 'ꇑ', 982556724, (short)-17533)).length();
      int var1 = llII(1020212462, var23 ^ -861227835);
      int var25 = -1;

      label99:
      while (true) {
         int var28 = llII(1020212463, var23 ^ 676222015);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var37 = -1;

         while (true) {
            label94: {
               char[] var46 = var30.toCharArray();
               int var10004 = var46.length;
               int var6 = 0;
               int var49 = var28;
               var42 = var46;
               int var35 = var10004;
               char[] var58;
               int var10006;
               if (var10004 <= 1) {
                  var58 = var46;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var49 = var28;
                  var35 = var10004;
                  if (var10004 <= var6) {
                     break label94;
                  }

                  var58 = var46;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % llII(1020212459, var23 ^ 345354479)) {
                     case 0 -> 1;
                     case 1 -> llII(1020212452, var23 ^ 464984333);
                     case 2 -> llII(1020212453, var23 ^ 1100477670);
                     case 3 -> llII(1020212454, var23 ^ -555776352);
                     case 4 -> llII(1020212455, var23 ^ 205448177);
                     case 5 -> llII(1020212448, var23 ^ 1783751554);
                     default -> llII(1020212449, var23 ^ -1602217261);
                  });
                  var6++;
                  if (var49 == 0) {
                     var10006 = var49;
                     var58 = var42;
                     var10004 = var49;
                  } else {
                     if (var35 <= var6) {
                        break;
                     }

                     var58 = var42;
                     var10004 = var49;
                     var10006 = var6;
                  }
               }
            }

            String var51 = new String(var42).intern();
            switch (var37) {
               case 0:
                  var5[var3++] = var51;
                  if ((var25 += var1) >= var4) {
                     lIIl = var5;
                     lll = new String[llII(1020212458, var23 ^ -609257571)];
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var51;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label99;
                  }

                  var4 = (var2 = lllI((byte)-15, (byte)63, -320895487, (short)-14530, '瀅', 1400662331, 18158)).length();
                  var1 = llII(1020212456, var23 ^ -1303638433);
                  var25 = -1;
            }

            var28 = llII(1020212457, var23 ^ -870294609);
            var30 = var2.substring(++var25, var25 + var1);
            var37 = 0;
         }
      }
   }

   private boolean IIIl(class_310 var1, class_3965 var2) {
      this.IIlI = true;

      boolean var4;
      try {
         k74.x.IIll.IlIll(var1);
         class_1269 var3 = k74.x.IIll.IlIIIl(var1, class_1268.field_5808, var2);
         var4 = var3 != null && var3.method_23665();
      } finally {
         this.IIlI = false;
      }

      return var4;
   }

   private IlIIlIlII IIlI(class_310 var1, class_2338 var2) {
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var2 != null && this.Ill(var1, var2)) {
         double var3 = Math.max(0.0, var1.field_1724.method_55754() - 0.1);

         for (class_2350 var8 : class_2350.values()) {
            class_2338 var9 = var2.method_10093(var8);
            if (this.lll(var1, var9)) {
               class_2350 var10 = var8.method_10153();
               class_243 var11 = class_243.method_24953(var9).method_1019(class_243.method_24954(var10.method_62675()).method_1021(0.5));
               if (!(var1.field_1724.method_33571().method_1025(var11) > var3 * var3)) {
                  class_243 var12 = var11.method_1020(class_243.method_24954(var10.method_62675()).method_1021(0.001));
                  class_3965 var13 = k74.x.IIll.lIIIlll(var1, var1.field_1724, var1.field_1724.method_33571(), var12);
                  if (var13 == null || var13.method_17783() != class_240.field_1332) {
                     var13 = var1.field_1687
                        .method_17742(new class_3959(var1.field_1724.method_33571(), var12, class_3960.field_17559, class_242.field_1348, var1.field_1724));
                  }

                  if (var13 != null && var13.method_17777().equals(var9) && var2.equals(var9.method_10093(var13.method_17780()))) {
                     return new IlIIlIlII(var2.method_10062(), var9.method_10062(), var11, var13);
                  }
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Override
   public void IlIlI(class_1297 var1) {
      class_310 var2 = class_310.method_1551();
      if (var1 instanceof class_1657 var3
         && var2 != null
         && var2.field_1724 != null
         && var2.field_1687 != null
         && var3.method_5805()
         && !k74.x.IIll.lIllIl(var3)
         && !this.Il(var3)
         && !this.III
         && this.l()) {
         this.IllI = var3.method_5628();
         this.lIII = var2.field_1724.field_6012;
         this.Illl = var2.field_1724.field_6012
            + (this.II.IllI() == IlIIlIlI.I ? llII(1020212724, 1324313069 ^ 1586062842) : llII(1020212725, 1324313069 ^ -1581199349));
         this.IIIl = var2.field_1724.method_36454();
         this.lIl = class_243.field_1353;
         this.lI = llII(1020212726, 1324313069 ^ 225896449);
         this.ll = false;
         this.IlIl = -1;
         this.III(var2);
      }
   }

   private IlIIlIlII IIll(class_310 var1, List<class_2338> var2) {
      for (class_2338 var4 : var2) {
         IlIIlIlII var5 = this.IIlI(var1, var4);
         if (var5 != null) {
            return var5;
         }
      }

      return null;
   }

   @Override
   public void lllIll(class_2596<?> var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 != null && this.IllI >= 0 && var1 instanceof class_2743 var3 && var3.method_11818() == this.IllI) {
         class_243 var4 = var3.method_73085();
         if (var4 != null) {
            this.lIl = var4;
            this.lI = var2.field_1724.field_6012;
         }
      }
   }

   private void IlII(class_310 var1, int var2, boolean var3) {
      this.III = false;
      this.IIl = llII(1020212727, -508245845 ^ 695933780);
      if (var2 == this.IllI) {
         if (var3) {
            this.IIl();
         } else {
            if (var1 != null && var1.field_1724 != null) {
               this.lIII = var1.field_1724.field_6012 + 1;
            }
         }
      }
   }

   @Override
   public String IlIIl() {
      long var10000 = Math.round(this.Ill.IllI());
      String var3 = IlIIllIII.lI(lIl(llII(1020212720, -1298562218 ^ 1009594068), llII(1020212721, -1298562218 ^ 1466651815)));
      long var1 = var10000;
      return var1 + var3;
   }

   private List<class_2338> IlIl(class_310 var1, class_1309 var2) {
      String[] var10000 = llIllIlI.IIlII();
      class_238 var4 = var2.method_5829();
      String[] var3 = var10000;
      int var5 = (int)Math.floor(var4.field_1322 + 1.0E-4);
      class_243 var6 = this.lIII(var1, var2);
      class_243 var7 = this.lI(var1, var2);
      if (var6.method_1027() < 1.0E-6 && var7.method_1027() < 1.0E-6) {
         return List.of(var2.method_24515());
      } else {
         boolean var8 = this.lI != llII(1020212722, -1204013742 ^ 1704859666) && var1.field_1724.field_6012 - this.lI <= 3;
         double var9 = var1.field_1724.method_5624() ? 0.28 : 0.0;
         class_243 var11 = var8 ? var7.method_1021(1.8) : var7.method_1021(1.2).method_1019(var6.method_1021(0.65 + var9));
         double var12 = var11.method_1033();
         if (var12 > 2.2) {
            var11 = var11.method_1021(2.2 / var12);
         }

         class_238 var14 = var4.method_989(var11.field_1352 * 0.5, 0.0, var11.field_1350 * 0.5);
         class_238 var15 = var4.method_989(var11.field_1352, 0.0, var11.field_1350);
         class_243 var16 = new class_243(var2.method_23317(), var5 + 0.5, var2.method_23321()).method_1019(var11);
         int var17 = (int)Math.floor(Math.min(Math.min(var4.field_1323, var14.field_1323), var15.field_1323)) - 1;
         int var18 = (int)Math.floor(Math.max(Math.max(var4.field_1320, var14.field_1320), var15.field_1320) - 1.0E-7) + 1;
         int var19 = (int)Math.floor(Math.min(Math.min(var4.field_1321, var14.field_1321), var15.field_1321)) - 1;
         int var20 = (int)Math.floor(Math.max(Math.max(var4.field_1324, var14.field_1324), var15.field_1324) - 1.0E-7) + 1;
         ArrayList var21 = new ArrayList();
         int[] var22 = var2.method_24828() && !(Math.abs(var2.method_18798().field_1351) > 0.08) ? new int[]{var5} : new int[]{var5, var5 - 1, var5 + 1};

         label76:
         for (int var26 : var22) {
            int var27 = var17;

            while (true) {
               if (var27 <= var18) {
                  int var28 = var19;

                  while (var28 <= var20) {
                     class_2338 var29 = new class_2338(var27, var26, var28);
                     double var30 = Math.max(this.llI(var15, var29), Math.max(this.llI(var14, var29) * 0.95, this.llI(var4, var29) * 0.85));
                     if (var26 != var5) {
                        var30 *= 0.8;
                     }

                     var21.add(new IIIlIIlI(var29, var30, class_243.method_24953(var29).method_1025(var16)));
                     var28++;
                     if (var3 == null) {
                        break;
                     }
                  }

                  var27++;
                  if (var3 != null) {
                     continue;
                  }
               }

               if (var3 == null) {
                  break label76;
               }
               break;
            }
         }

         var21.sort(Comparator.comparingDouble(IIIlIIlI::l).reversed().thenComparingDouble(IIIlIIlI::II));
         return var21.stream().map(IIIlIIlI::I).toList();
      }
   }

   @Override
   public void IlIII() {
      this.IlII.IIIIIII();
   }

   public IIlIIIlIl() {
      int var1 = -1585455543;
      super(
         IlIIllIII.Ill(lIl(llII(1020212723, var1 ^ -2074584077), llII(1020212684, var1 ^ -1175949926))),
         lllIIlIl.I,
         IlIIllIII.Ill(lIl(llII(1020212685, var1 ^ -1075975261), llII(1020212686, var1 ^ 480674835)))
      );
      this.Ill = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIl(llII(1020212687, var1 ^ 670015996), llII(1020212680, var1 ^ 1618760294))), 100.0, 0.0, 100.0, 1.0)
            .IIIl(IlIIllIII.Ill(lIl(llII(1020212681, var1 ^ 1904397315), llII(1020212682, var1 ^ 1694948259))))
      );
      this.IIII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIl(llII(1020212683, var1 ^ 1261619886), llII(1020212676, var1 ^ -212701957))), true));
      this.II = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(lIl(llII(1020212677, var1 ^ -1010204366), llII(1020212678, var1 ^ 426709760))), IlIIlIlI.class, IlIIlIlI.l)
      );
      this.llI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIl(llII(1020212679, var1 ^ 1545866848), llII(1020212672, var1 ^ -1929576288))), 50.0, 1.0, 100.0, 1.0).lIlI(this::Illl)
      );
      this.IlII = new IlIIIllll();
      this.IllI = -1;
      this.lIII = llII(1020212673, var1 ^ -269194556);
      this.Illl = llII(1020212674, var1 ^ -398657660);
      this.IIl = llII(1020212675, var1 ^ 658607868);
      this.lI = llII(1020212700, var1 ^ 677669565);
      this.lIl = class_243.field_1353;
      this.IlIl = -1;
      this.lII = llII(1020212701, var1 ^ 1142392723);
   }

   private boolean IllI(class_310 var1, int var2, IlIIlIlII var3, int var4) {
      boolean var5 = k74.x.IIll.lllIII(var1, this, var2, this::lIlI);
      this.IlII(var1, var4, var5);
      return var5;
   }

   private boolean Illl() {
      return this.II.IllI() == IlIIlIlI.I;
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1724 != null) {
         if (this.ll) {
            this.ll(var1);
         } else if (this.IllI >= 0) {
            if (var1.field_1724.field_6012 > this.Illl) {
               this.IIl();
            } else {
               if (this.III) {
                  if (var1.field_1724.field_6012 - this.IIl <= 3) {
                     return;
                  }

                  this.III = false;
                  this.lIII = var1.field_1724.field_6012;
               }

               this.III(var1);
            }
         }
      }
   }

   private class_243 lIII(class_310 var1, class_1309 var2) {
      float var3 = (float)Math.toRadians(this.IllI == var2.method_5628() ? this.IIIl : var1.field_1724.method_36454());
      class_243 var4 = new class_243(-Math.sin(var3), 0.0, Math.cos(var3));
      class_243 var5 = new class_243(var2.method_23317() - var1.field_1724.method_23317(), 0.0, var2.method_23321() - var1.field_1724.method_23321());
      if (var4.method_1027() < 1.0E-6) {
         return var5.method_1027() < 1.0E-6 ? class_243.field_1353 : var5.method_1029();
      } else {
         var4 = var4.method_1029();
         return var5.method_1027() > 1.0E-6 && var4.method_1026(var5.method_1029()) <= 0.0 ? var5.method_1029() : var4;
      }
   }

   @Override
   public void llIl() {
      this.IIl();
      this.IlII.lIIl();
      this.IlII.IIlIl();
      this.IIlI = false;
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1724 != null) {
         k74.x.IIll.lllIl(var1, this, lllIII.II);
      }
   }

   private IlIIlIlII lIIl(class_310 var1, class_1309 var2) {
      if (this.IIII.IllI()) {
         IlIIlIlII var3 = this.IIll(var1, this.IlIl(var1, var2));
         if (var3 != null) {
            return var3;
         }
      }

      return this.IIll(var1, List.of(var2.method_24515()));
   }

   private boolean lIlI(class_310 var1, IlIIlIlII var2) {
      return this.II(var1, var2);
   }

   public void lIll(class_310 var1, class_1657 var2, float var3) {
      if (var2 != null && var1 != null && var1.field_1724 != null && var1.field_1687 != null && var2.method_5805() && !k74.x.IIll.lIllIl(var2) && !this.III) {
         this.Il = true;
         this.IllI = var2.method_5628();
         this.lIII = var1.field_1724.field_6012;
         this.Illl = var1.field_1724.field_6012
            + (this.II.IllI() == IlIIlIlI.I ? llII(1020212702, 51973304 ^ -746208408) : llII(1020212703, 51973304 ^ -1110992533));
         this.IIIl = var3;
         this.lIl = class_243.field_1353;
         this.lI = llII(1020212696, 51973304 ^ 1038485018);
         this.ll = false;
         this.IlIl = -1;
         this.III(var1);
      }
   }
}
