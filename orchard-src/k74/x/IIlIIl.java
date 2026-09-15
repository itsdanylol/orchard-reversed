package k74.x;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_364;
import net.minecraft.class_412;
import net.minecraft.class_4185;
import net.minecraft.class_419;
import net.minecraft.class_437;
import net.minecraft.class_442;
import net.minecraft.class_500;
import net.minecraft.class_639;
import net.minecraft.class_642;

@Environment(EnvType.CLIENT)
public final class IIlIIl extends IlIIIIIIl {
   private static String[] I;
   private final IIlIII II;
   private long Il;
   private static final String[] lI;
   private static final Object[] lII;
   private Object ll;
   private static final String[] Ill;
   private static final String[] III;
   private static final int[] IlI;
   private class_642 IIl;

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1 == null) {
         this.lIl();
      } else {
         this.l(var1);
         if (var1.field_1755 instanceof class_419 var2) {
            if (!this.IIII(var1)) {
               this.lIl();
            } else {
               long var6 = System.nanoTime() / 1000000L;
               if (this.ll != var2) {
                  this.ll = var2;
                  this.Il = var6 + Math.max(0L, Math.round(this.II.IllI() * 1000.0));
               } else if (var6 >= this.Il) {
                  if (this.III(var2)) {
                     this.lIl();
                  } else {
                     class_642 var5 = this.II(this.IIl);
                     if (var5 == null) {
                        this.lIl();
                     } else {
                        this.lIl();
                        class_412.method_36877(this.Il(var2), var1, class_639.method_2950(var5.field_3761), var5, false, k74.x.IlI.I());
                     }
                  }
               }
            }
         } else {
            this.lIl();
         }
      }
   }

   private static String I(int var0, int var1) {
      int var9 = 20931344;
      int var2 = (var0 ^ IIlI(132647370, var9 ^ 1862480630)) & IIlI(132647371, var9 ^ -150590913);
      if (lI[var2] == null) {
         char[] var3 = III[var2].toCharArray();

         int var4 = switch (var3[0] & IIlI(132647368, var9 ^ -1086474984)) {
            case 0 -> IIlI(132647369, var9 ^ -206772438);
            case 1 -> 4;
            case 2 -> IIlI(132647374, var9 ^ -1738659718);
            case 3 -> IIlI(132647375, var9 ^ 329906087);
            case 4 -> IIlI(132647372, var9 ^ -187366060);
            case 5 -> IIlI(132647373, var9 ^ -863560867);
            case 6 -> IIlI(132647362, var9 ^ 1982552929);
            case 7 -> IIlI(132647363, var9 ^ 106028690);
            case 8 -> IIlI(132647360, var9 ^ 2006717175);
            case 9 -> IIlI(132647361, var9 ^ -24103096);
            case 10 -> IIlI(132647366, var9 ^ -264286919);
            case 11 -> IIlI(132647367, var9 ^ 1351839965);
            case 12 -> IIlI(132647364, var9 ^ 168819473);
            case 13 -> IIlI(132647365, var9 ^ -769214733);
            case 14 -> IIlI(132647386, var9 ^ 1027328294);
            case 15 -> IIlI(132647387, var9 ^ -1634092421);
            case 16 -> IIlI(132647384, var9 ^ -796723940);
            case 17 -> IIlI(132647385, var9 ^ -1870779986);
            case 18 -> IIlI(132647390, var9 ^ -2035420985);
            case 19 -> 0;
            case 20 -> IIlI(132647391, var9 ^ 16361688);
            case 21 -> IIlI(132647388, var9 ^ -1417141680);
            case 22 -> IIlI(132647389, var9 ^ -527258671);
            case 23 -> IIlI(132647378, var9 ^ -649795233);
            case 24 -> IIlI(132647379, var9 ^ 390439099);
            case 25 -> IIlI(132647376, var9 ^ -471096515);
            case 26 -> IIlI(132647377, var9 ^ 22700435);
            case 27 -> IIlI(132647382, var9 ^ 62476594);
            case 28 -> IIlI(132647383, var9 ^ -1728935338);
            case 29 -> IIlI(132647380, var9 ^ -1558105549);
            case 30 -> IIlI(132647381, var9 ^ -816870502);
            case 31 -> IIlI(132647402, var9 ^ 1773980427);
            case 32 -> IIlI(132647403, var9 ^ 897807685);
            case 33 -> IIlI(132647400, var9 ^ 1930336986);
            case 34 -> IIlI(132647401, var9 ^ -42993555);
            case 35 -> IIlI(132647406, var9 ^ -1909134786);
            case 36 -> IIlI(132647407, var9 ^ -895516077);
            case 37 -> IIlI(132647404, var9 ^ 1228857486);
            case 38 -> IIlI(132647405, var9 ^ -843571333);
            case 39 -> IIlI(132647394, var9 ^ 1332216826);
            case 40 -> IIlI(132647395, var9 ^ -1949366960);
            case 41 -> IIlI(132647392, var9 ^ -1031184327);
            case 42 -> IIlI(132647393, var9 ^ 1570973810);
            case 43 -> IIlI(132647398, var9 ^ 1992207741);
            case 44 -> IIlI(132647399, var9 ^ -600700462);
            case 45 -> IIlI(132647396, var9 ^ 947889880);
            case 46 -> IIlI(132647397, var9 ^ 70388384);
            case 47 -> IIlI(132647418, var9 ^ -1971941390);
            case 48 -> IIlI(132647419, var9 ^ -4540278);
            case 49 -> IIlI(132647416, var9 ^ 122805192);
            case 50 -> IIlI(132647417, var9 ^ -1268347980);
            case 51 -> IIlI(132647422, var9 ^ -2059600234);
            case 52 -> IIlI(132647423, var9 ^ 599738412);
            case 53 -> IIlI(132647420, var9 ^ -939196429);
            case 54 -> IIlI(132647421, var9 ^ 144406214);
            case 55 -> IIlI(132647410, var9 ^ -782847338);
            case 56 -> IIlI(132647411, var9 ^ 1987276448);
            case 57 -> IIlI(132647408, var9 ^ 1195182814);
            case 58 -> IIlI(132647409, var9 ^ 1184352312);
            case 59 -> IIlI(132647414, var9 ^ -1108915300);
            case 60 -> IIlI(132647415, var9 ^ 356040409);
            case 61 -> IIlI(132647412, var9 ^ 1047128062);
            case 62 -> IIlI(132647413, var9 ^ 1390066058);
            case 63 -> IIlI(132647306, var9 ^ 1569298421);
            case 64 -> IIlI(132647307, var9 ^ 2046134161);
            case 65 -> IIlI(132647304, var9 ^ 1263135530);
            case 66 -> IIlI(132647305, var9 ^ -221109115);
            case 67 -> IIlI(132647310, var9 ^ -586578520);
            case 68 -> IIlI(132647311, var9 ^ -870254033);
            case 69 -> IIlI(132647308, var9 ^ 1153073041);
            case 70 -> IIlI(132647309, var9 ^ 1818109614);
            case 71 -> IIlI(132647298, var9 ^ -1095934567);
            case 72 -> IIlI(132647299, var9 ^ -1015507852);
            case 73 -> IIlI(132647296, var9 ^ 692004829);
            case 74 -> IIlI(132647297, var9 ^ 1332574105);
            case 75 -> IIlI(132647302, var9 ^ 880389451);
            case 76 -> IIlI(132647303, var9 ^ -1478542174);
            case 77 -> IIlI(132647300, var9 ^ 886937205);
            case 78 -> IIlI(132647301, var9 ^ 1534942325);
            case 79 -> IIlI(132647322, var9 ^ -985810295);
            case 80 -> IIlI(132647323, var9 ^ -1621604411);
            case 81 -> IIlI(132647320, var9 ^ -645985805);
            case 82 -> IIlI(132647321, var9 ^ -1700893982);
            case 83 -> IIlI(132647326, var9 ^ 655980735);
            case 84 -> IIlI(132647327, var9 ^ 1658068012);
            case 85 -> IIlI(132647324, var9 ^ 510136520);
            case 86 -> IIlI(132647325, var9 ^ -485056881);
            case 87 -> IIlI(132647314, var9 ^ 1698096013);
            case 88 -> IIlI(132647315, var9 ^ -596767223);
            case 89 -> IIlI(132647312, var9 ^ 867788358);
            case 90 -> IIlI(132647313, var9 ^ 369271627);
            case 91 -> IIlI(132647318, var9 ^ -776416375);
            case 92 -> IIlI(132647319, var9 ^ -195455055);
            case 93 -> IIlI(132647316, var9 ^ -1662555284);
            case 94 -> IIlI(132647317, var9 ^ -761867607);
            case 95 -> IIlI(132647338, var9 ^ 1211056116);
            case 96 -> IIlI(132647339, var9 ^ -443086880);
            case 97 -> IIlI(132647336, var9 ^ 555287815);
            case 98 -> IIlI(132647337, var9 ^ 2053061356);
            case 99 -> IIlI(132647342, var9 ^ 1678296873);
            case 100 -> IIlI(132647343, var9 ^ 1675735869);
            case 101 -> IIlI(132647340, var9 ^ 875526097);
            case 102 -> IIlI(132647341, var9 ^ -679907507);
            case 103 -> IIlI(132647330, var9 ^ -1020627086);
            case 104 -> IIlI(132647331, var9 ^ -341942079);
            case 105 -> IIlI(132647328, var9 ^ 2125794515);
            case 106 -> IIlI(132647329, var9 ^ -457456820);
            case 107 -> 2;
            case 108 -> IIlI(132647334, var9 ^ 721759794);
            case 109 -> IIlI(132647335, var9 ^ 967664882);
            case 110 -> IIlI(132647332, var9 ^ -1566113358);
            case 111 -> IIlI(132647333, var9 ^ -789565710);
            case 112 -> IIlI(132647354, var9 ^ 45471731);
            case 113 -> IIlI(132647355, var9 ^ -1090438854);
            case 114 -> IIlI(132647352, var9 ^ -1330341841);
            case 115 -> IIlI(132647353, var9 ^ 1446808350);
            case 116 -> IIlI(132647358, var9 ^ 1787155090);
            case 117 -> IIlI(132647359, var9 ^ -1634321004);
            case 118 -> IIlI(132647356, var9 ^ -1507594953);
            case 119 -> IIlI(132647357, var9 ^ 1589808653);
            case 120 -> IIlI(132647346, var9 ^ 1667627192);
            case 121 -> IIlI(132647347, var9 ^ -963643922);
            case 122 -> IIlI(132647344, var9 ^ 1787067678);
            case 123 -> IIlI(132647345, var9 ^ 1256203013);
            case 124 -> IIlI(132647350, var9 ^ 870568380);
            case 125 -> IIlI(132647351, var9 ^ -665597301);
            case 126 -> IIlI(132647348, var9 ^ 719077942);
            case 127 -> IIlI(132647349, var9 ^ 276520765);
            case 128 -> IIlI(132647242, var9 ^ -463619269);
            case 129 -> IIlI(132647243, var9 ^ -1165553948);
            case 130 -> IIlI(132647240, var9 ^ -547853659);
            case 131 -> IIlI(132647241, var9 ^ 1464046634);
            case 132 -> IIlI(132647246, var9 ^ 124478871);
            case 133 -> IIlI(132647247, var9 ^ 138711027);
            case 134 -> IIlI(132647244, var9 ^ -1261835956);
            case 135 -> IIlI(132647245, var9 ^ 1469002119);
            case 136 -> IIlI(132647234, var9 ^ -1615370839);
            case 137 -> IIlI(132647235, var9 ^ 929537821);
            case 138 -> IIlI(132647232, var9 ^ -31570787);
            case 139 -> IIlI(132647233, var9 ^ 610237412);
            case 140 -> IIlI(132647238, var9 ^ 1700144873);
            case 141 -> IIlI(132647239, var9 ^ -192404723);
            case 142 -> IIlI(132647236, var9 ^ -496668985);
            case 143 -> IIlI(132647237, var9 ^ 1894468152);
            case 144 -> IIlI(132647258, var9 ^ -333842032);
            case 145 -> IIlI(132647259, var9 ^ -1036756644);
            case 146 -> IIlI(132647256, var9 ^ 1536870854);
            case 147 -> IIlI(132647257, var9 ^ 497882867);
            case 148 -> IIlI(132647262, var9 ^ -57307665);
            case 149 -> IIlI(132647263, var9 ^ 1955932270);
            case 150 -> IIlI(132647260, var9 ^ 1526560469);
            case 151 -> IIlI(132647261, var9 ^ -1611176448);
            case 152 -> IIlI(132647250, var9 ^ 2084317045);
            case 153 -> IIlI(132647251, var9 ^ 599910246);
            case 154 -> IIlI(132647248, var9 ^ -1864919509);
            case 155 -> IIlI(132647249, var9 ^ -982961849);
            case 156 -> IIlI(132647254, var9 ^ 621831415);
            case 157 -> IIlI(132647255, var9 ^ 759002692);
            case 158 -> 5;
            case 159 -> IIlI(132647252, var9 ^ 559669120);
            case 160 -> IIlI(132647253, var9 ^ -782731256);
            case 161 -> IIlI(132647274, var9 ^ 1329123528);
            case 162 -> IIlI(132647275, var9 ^ -828149659);
            case 163 -> IIlI(132647272, var9 ^ 1650714512);
            case 164 -> IIlI(132647273, var9 ^ 1785948725);
            case 165 -> IIlI(132647278, var9 ^ 1522795050);
            case 166 -> IIlI(132647279, var9 ^ 1532231390);
            case 167 -> IIlI(132647276, var9 ^ 2058302843);
            case 168 -> IIlI(132647277, var9 ^ -1721608751);
            case 169 -> IIlI(132647266, var9 ^ 180820048);
            case 170 -> IIlI(132647267, var9 ^ 1438385852);
            case 171 -> IIlI(132647264, var9 ^ -1581054613);
            case 172 -> IIlI(132647265, var9 ^ 62166127);
            case 173 -> IIlI(132647270, var9 ^ 1337551535);
            case 174 -> IIlI(132647271, var9 ^ -667718530);
            case 175 -> IIlI(132647268, var9 ^ 782086338);
            case 176 -> IIlI(132647269, var9 ^ -857108087);
            case 177 -> IIlI(132647290, var9 ^ -1041159137);
            case 178 -> IIlI(132647291, var9 ^ 1055239555);
            case 179 -> IIlI(132647288, var9 ^ 387217858);
            case 180 -> IIlI(132647289, var9 ^ 1186327153);
            case 181 -> IIlI(132647294, var9 ^ -1645118217);
            case 182 -> IIlI(132647295, var9 ^ -548678356);
            case 183 -> IIlI(132647292, var9 ^ 1870680695);
            case 184 -> IIlI(132647293, var9 ^ 1012305308);
            case 185 -> IIlI(132647282, var9 ^ 1261001968);
            case 186 -> IIlI(132647283, var9 ^ -1694754774);
            case 187 -> IIlI(132647280, var9 ^ -981392265);
            case 188 -> IIlI(132647281, var9 ^ -2122256997);
            case 189 -> IIlI(132647286, var9 ^ -2074297735);
            case 190 -> IIlI(132647287, var9 ^ 707467592);
            case 191 -> IIlI(132647284, var9 ^ -1247524413);
            case 192 -> IIlI(132647285, var9 ^ 2099488838);
            case 193 -> IIlI(132647178, var9 ^ 32280898);
            case 194 -> IIlI(132647179, var9 ^ -1647630719);
            case 195 -> IIlI(132647176, var9 ^ -504531411);
            case 196 -> IIlI(132647177, var9 ^ 527493423);
            case 197 -> IIlI(132647182, var9 ^ -979519626);
            case 198 -> IIlI(132647183, var9 ^ 1420515261);
            case 199 -> IIlI(132647180, var9 ^ -1525449267);
            case 200 -> IIlI(132647181, var9 ^ 1118425597);
            case 201 -> IIlI(132647170, var9 ^ -1040571727);
            case 202 -> IIlI(132647171, var9 ^ -60286915);
            case 203 -> IIlI(132647168, var9 ^ -1266266702);
            case 204 -> IIlI(132647169, var9 ^ 167291040);
            case 205 -> IIlI(132647174, var9 ^ -745606186);
            case 206 -> IIlI(132647175, var9 ^ 932576968);
            case 207 -> 1;
            case 208 -> IIlI(132647172, var9 ^ 1647180437);
            case 209 -> IIlI(132647173, var9 ^ 932310055);
            case 210 -> IIlI(132647194, var9 ^ 293091036);
            case 211 -> IIlI(132647195, var9 ^ -1150772573);
            case 212 -> IIlI(132647192, var9 ^ 1502235052);
            case 213 -> IIlI(132647193, var9 ^ -1200854921);
            case 214 -> IIlI(132647198, var9 ^ -1803888546);
            case 215 -> IIlI(132647199, var9 ^ 1460719393);
            case 216 -> IIlI(132647196, var9 ^ -1268496680);
            case 217 -> IIlI(132647197, var9 ^ -9676360);
            case 218 -> IIlI(132647186, var9 ^ 640495559);
            case 219 -> IIlI(132647187, var9 ^ -1225099297);
            case 220 -> IIlI(132647184, var9 ^ -177209072);
            case 221 -> IIlI(132647185, var9 ^ 888903720);
            case 222 -> IIlI(132647190, var9 ^ 1137192640);
            case 223 -> IIlI(132647191, var9 ^ 498738084);
            case 224 -> IIlI(132647188, var9 ^ -1358316608);
            case 225 -> IIlI(132647189, var9 ^ -385720620);
            case 226 -> IIlI(132647210, var9 ^ -17045774);
            case 227 -> IIlI(132647211, var9 ^ 122595707);
            case 228 -> 3;
            case 229 -> IIlI(132647208, var9 ^ -1496152951);
            case 230 -> IIlI(132647209, var9 ^ 1065374503);
            case 231 -> IIlI(132647214, var9 ^ 1426509149);
            case 232 -> IIlI(132647215, var9 ^ 1236381790);
            case 233 -> IIlI(132647212, var9 ^ 850316175);
            case 234 -> IIlI(132647213, var9 ^ -302522752);
            case 235 -> IIlI(132647202, var9 ^ 2100377419);
            case 236 -> IIlI(132647203, var9 ^ -48648149);
            case 237 -> IIlI(132647200, var9 ^ -725978667);
            case 238 -> IIlI(132647201, var9 ^ 1451934181);
            case 239 -> IIlI(132647206, var9 ^ -1105021978);
            case 240 -> IIlI(132647207, var9 ^ 1487631502);
            case 241 -> IIlI(132647204, var9 ^ 1935529050);
            case 242 -> IIlI(132647205, var9 ^ -991725935);
            case 243 -> IIlI(132647226, var9 ^ -195342882);
            case 244 -> IIlI(132647227, var9 ^ -570927234);
            case 245 -> IIlI(132647224, var9 ^ -1742644395);
            case 246 -> IIlI(132647225, var9 ^ -1551403733);
            case 247 -> IIlI(132647230, var9 ^ 568465981);
            case 248 -> IIlI(132647231, var9 ^ 1030620127);
            case 249 -> IIlI(132647228, var9 ^ -1043311832);
            case 250 -> IIlI(132647229, var9 ^ 1470755271);
            case 251 -> IIlI(132647218, var9 ^ -447826038);
            case 252 -> IIlI(132647219, var9 ^ 1930554173);
            case 253 -> IIlI(132647216, var9 ^ -732884785);
            case 254 -> IIlI(132647217, var9 ^ 427430674);
            default -> IIlI(132647222, var9 ^ -1689820203);
         };
         int var5 = (var1 & IIlI(132647223, var9 ^ 1445808986)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIlI(132647220, var9 ^ -1078090899)) >>> IIlI(132647221, var9 ^ 1050515839)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIlI(132647114, var9 ^ 680630931);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIlI(132647115, var9 ^ -1245782880);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   private void l(class_310 var1) {
      if (!var1.method_1542()) {
         class_642 var2 = var1.method_1558();
         if (var2 != null && var2.field_3761 != null && !var2.field_3761.isBlank()) {
            this.IIl = this.II(var2);
         }
      }
   }

   private class_642 II(class_642 var1) {
      if (var1 == null) {
         return null;
      } else {
         class_642 var2 = new class_642(var1.field_3752, var1.field_3761, var1.method_55616());
         var2.method_44292(var1);
         return var2;
      }
   }

   @Override
   public void llIl() {
      this.lIl();
   }

   private class_437 Il(class_419 var1) {
      class_437 var2 = this.lll(var1);
      return var2 != null ? var2 : this.ll();
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static Object lI(Object var0, Method var1, Object[] var2) throws Throwable {
      String var4 = var1.getName();
      String[] var10000 = IIllllIl.IIIIl();
      byte var5 = -1;
      String[] var3 = var10000;

      label98: {
         label99: {
            label100: {
               label101: {
                  try {
                     switch (var4.hashCode()) {
                        case -1901045636:
                           break label101;
                        case -1776922004:
                           break label99;
                        case -1417910757:
                           break label100;
                        case 221855894:
                           if (!var4.equals(I[0])) {
                              break label98;
                           }
                           break;
                        default:
                           break label98;
                     }
                  } catch (Throwable var14) {
                     throw lII(var14);
                  }

                  var5 = 0;

                  try {
                     if (var3 == null) {
                        break label98;
                     }
                  } catch (Throwable var13) {
                     throw lII(var13);
                  }
               }

               try {
                  if (!var4.equals(I[4])) {
                     break label98;
                  }
               } catch (Throwable var12) {
                  throw lII(var12);
               }

               var5 = 1;

               try {
                  if (var3 == null) {
                     break label98;
                  }
               } catch (Throwable var11) {
                  throw lII(var11);
               }
            }

            try {
               if (!var4.equals(I[3])) {
                  break label98;
               }
            } catch (Throwable var10) {
               throw lII(var10);
            }

            var5 = 2;

            try {
               if (var3 == null) {
                  break label98;
               }
            } catch (Throwable var9) {
               throw lII(var9);
            }
         }

         try {
            if (!var4.equals(I[1])) {
               break label98;
            }
         } catch (Throwable var8) {
            throw lII(var8);
         }

         var5 = 3;
      }

      try {
         switch (var5) {
            case 0:
            case 1:
            case 2:
               return 0;
            case 3:
               return IlIIllIII.lI(I[2]);
         }
      } catch (Throwable var7) {
         throw lII(var7);
      }

      try {
         if (var1.getReturnType() == boolean.class) {
            return Boolean.FALSE;
         }
      } catch (Throwable var6) {
         throw lII(var6);
      }

      return 0;
   }

   private class_437 ll() {
      return new class_500(new class_442());
   }

   private boolean III(class_419 var1) {
      if (var1 == null) {
         return false;
      } else {
         for (class_364 var3 : var1.method_25396()) {
            if (var3 instanceof class_4185 var4 && this.IIl(var4) && this.IIIl(var4)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean IIl(class_4185 var1) {
      if (var1 != null && var1.field_22763 && var1.field_22764) {
         String var2 = var1.method_25369() == null ? I[IIlI(132647112, 786405317 ^ 5880467)] : var1.method_25369().getString();
         return var2 != null && var2.toLowerCase(Locale.ROOT).contains(IlIIllIII.lI(I[IIlI(132647113, 786405317 ^ 54404601)]));
      } else {
         return false;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -652187516;
      char[] var9 = "Ù\u0011".toCharArray();
      short var7 = 2982;
      String var8 = "藢䶉╆浖嫊泩ꇤ\uf509돌⇨瘱䞖꾇ᶶ鲠௯罫᠀籺ᕡᯘ톋㦟阢꧄▘萑邰鮄ᬄ胀詨킈鍺ᣵ戮盝쐍ꋾ⭮ㇱ麔ᯱ⇬䦾い⡢矩\ufadb龵鈭᭓\ue9aeⲵ旼ꙷ⬟빕蕨\uf8dd睶櫧ᮦ\ueedd벘ꠅᛶ\ue7f9偦컇뺎\udd45曘駨㙂ඨ\uf3bc\ueb01\uf40e᧰☾홂遚삲䆵✓閖糧䘘ᇟꎲ豒\uedf8渮潫쑪\uf487ὔ⻦櫚䅗̻剿꙰옶\udc4b\uedcfᄋ\u0ff2橭恱뭅ᙻ打䆍昛ᄱ⨥흀㪄ﺊ꿘萊閭\udac1㹭滚闕\uf605\ufffe鐬\uecc8쁂茢㘆歺윉\ue62a\uef5f㵉蟷\uf523否ꉑ뜍餈涒\ue2e5見\ue8e5졻\u0086沕\udf24⫮ᮇ䙓藩◕ꃰ䪠悉\u2d7c剕ꔆᯃ昰⿷뚭嗖牕䠀긴\udd91涸候肾Ꞛᭋ唧賕ꢮ滯\ud8bd㸟톘ꯀ\ueb2e\udef3믃╛⺁绳\ued37驶⬽ㆢ伵櫭ꨛ⤤ྏ\ue982ᯚ㡉戌ࣵ꤉ᬹʏ⣆觫猣큦ꕚ\u0ffd\ue5ae\ud8b2\uf389⭣㞍컩䰦篆䉁녍⁓⽊艇㞼ᇓ祉ⶨ䶸";
      String[] var10000 = new String[var9.length];
      byte var14 = -1;
      String[] var10 = var10000;

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            Ill = var10;
            lII = new Object[var10.length];
            byte var23 = 0;
            int var10001 = 0;
            IlI = new int[332];
            byte[] var10002 = "¼©Nã$\u00ad\u0004Îl\u0097\u009aê \u0006É Kô\u0007.À\u0003Ùa'\u007f*`\u001f-5ä¥\u0081tRÕûñµ¤6=\r-:\u0018\u0005#\u0095c\u0094\u00839_:Ù¥Ô \u0001\u008c\u0099Þî\u0091æ\u0017M3\u00956\u0003(Ú\u0010CÔ\u0006\u0096U\u0007ß\u008cÓS\u0086Ix\"\fÊ38\u0084Ç\nîÇöÄï\u008e'0A\u008c\u0013ÒðN\u008dÐ\u0013~yKX¥_p\u008b\u001c\u0084\u001cå¤Æº\u0016äÈæ)Z\u0019 ¤µ£.Å×$]\u009eÅ\u007f\u00195\u00ad\"\u009a\u0094Ï\u0090\u001e\u00120:\u009cÂ,»Xe*\u000b\u0011#N\u008c\u008e\t\u00077¥\u0014\u0082F\u000f\u0098'ZëÕ\u0088n×\u0098$BYÜ  ,\u0010\u0096~Ôûô»gÌ¤ÊV\u0096ÑIð\u0015gu\u001b®Ñ|Û1X\\\u0002ü\u009dë¥Ù@\u0097\u0094\u0097$X\u0095=æ«nMd\u0080Æ\u0092\u0090~íÃÉ^\u0081p\u0096Ô\u008e#¸µª_¨?\u0098ãÄ\u000f!x\u000b\"\u000e£«F\u001f\u008aÕn\u0097\u0010P¸¿ô\b|m\u0007s^\u0010Òº\u0092ú\u0095\tW\u009cÇYiçÓ\u0083Ìtu\u0013\u0095çw¸³\u0088×sí\u0016\u0097\u0095½Lòh£\nÕ&ôI4Eaô³W\u0015±~2ÄÍÂ?O0¼°\u0000¶\u009cÌ<\u000fÄ!nà\u0013I\u0000Å¨\u008dÞ\u0002\u0012ýe'ó¹0OMDÔ\u0001<üù\u009b\u0085\u0011?6=(lò³+É©õ\u0015\u0096·¢è_°K\u009c.ç\u0085Xa\u0004Ó@ø\u0010\u0080X\u001d84OY\u00ad\u001f#ý7\u0011ìhø¯\u0001kê\u0007KKq\r.ñ\u0003Z\u0001¸Ñ\u001fù]l«\u0017øc\u001e·\u0088\u0085\u0096¤¶¹/ýÖM<\u0012\u0015u\u0089Â1\u008dh¡:°Ï×Û\u0015%ÚÊ¹.Sé\u0099J\rÁàIþæ\u000bùä}ùvm³ÃÑqá7÷\u0095<i- Ó\fòE1\u0084é»ÞÔÁK³Ûî EgcÇ\u0015\u0084%\u001f¤L\u001dJ4äÍ±\u0003-´k\u001d÷õT¼¶ü\t\u0016'\"\rY1ÏA6£Aeí?³×\u0093\u0011\u009evê\u00880æµÎ\u00078ª/?¢%§?\u0007\u0017\u0089WYuL]HQ¯\u0096\tnðkÈýC}¸\u001f\u0016Ã\u001fdöºKhþ\u0097Y òññÙ\u0002òV\u0005\u009c\u0092ÿ\u0013\u001d\t_\u0096±ÉÉ®¹ÙEº\u0089n-ò\u0088ùÑc©\u0005\u001b[JÈz\u008aÙm7¶\u0086\u0016)Mri*\u008dÐ\u001eºP\u009c\u0013E)\u000b\u0099BSý7\u009eí\u001fC¾Ü\u0012[\u0002\bíO\u0082(Ä¾Vo\u0095\u001fÅ·N[S!\fáû\u0013¼*}èïü¢\u0016\u0098\u0083r\u0081IV7ð\u0016+\u000b*R*Ã\u0082Wö\u0095:ù\u00816\u0095f\u000ef\u0084®\u0089\u0087\u0001ÒF¿\u008aNa\t®2GX ÌÚÆ6\u00167\u0099;\u0087\u0001xDv¹Rã\u0091\u0003þ\u0015\u0012P\r\u0011/Â68g,bsÚR\u0087\u008e\u0000$Ü\u0007ä?Ñq±\u0087Õ\u001cä;ÃËÂÒ\u0018¸hÂ´¶\u008a fmkÆG´GÐö?\u0084ºà¢gÎi_,Æv6õ\u0087\u0001\u0084ePY\u0090&Ú.²çQ·\u0082\u0090b\u00018Î\u0010\f\u0007|£\u0095©:¨qI-QÉ[Ôä\u0086«uxªÑì*|9\u0086¬ã \u009a\u001b\u009fªá\u0004åÛ>]ñ\n®\u009b\u0019!.³\u009f\u0089\u0007\u0010_®\u0085 îûm\u0088\u009dË\u008b\u0001[+ ÷ûß\u0017IY\u009e'ñcì\u000eRx¶K\u008buop-[HòH4oîÄ,\u0002\u0012z}\u0003\u0084\u0003ß¾6ä\u00988 »Ä\u0097\u0007û?\u000fÊÐ=tHíL/\u0085\u0087dWl\u0016\u008dcí7·\u008fû;´cf\u0014òQü\u0013aKÿtþ!\tø\u0099\u009aÃfÈ2CñÅØÄ\u0097Ñ{\u008e\\ÿÁüh\u000eQ\u001en×<O\u007f¤\u0083\u001bC\u001c]6t1@\u008a\u0094&¿¢ërþzP\u0012¥ù\nò*è\n\bêªÀ\u008f®\u0081\u0011ª»7VÛO\u0014\u0010hï>\u009bM²\u00197\u0091òy6Õ\u0095=c\rþ>\u008dmô3 ÿ¯©\u000b\u0085Gç\u0005ÞU,Õ\u0003ãX\u007f\u0090C%_r/\n\u0093\u0099ê\u0003ùÖLôº\u008d][ñ\u0000>16!Ú¸±!)úÂ¿?Ä\tÚÜâîÌXòDÐ¥Ì\u008f\u009d©¬Eí*\u001dú\u008b¬MSé¶ê\bv-\u0006½\u0088C<6H®\u0087\u0015\u0017H9D\u001a\u001fì\u0092ó\u0017õµI\u009987Ê±·J\u008b\u001al\u009c)\u0017F]ëê\u0001\u0084:Ã\u0090M8ö\u0014¶\u001d+xõëPÁZÈì+!\u0095ÑåÀP\u009b\u0017¸a\u0002VÖ\u0014®ìk-Û±\rÌV¸DlCÍ8p\u0080a6eJ\u0092/Æ\u0007a2ºxªÔ~X"
               .getBytes("ISO-8859-1");

            int var56;
            do {
               IlI[var23] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 713234283;
               var23 += 1;
               var56 = var10001 + 4;
               var10001 += 4;
            } while (var56 < var10002.length);

            String[] var5 = new String[IIlI(132647159, var18 ^ 520304936)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IIll((short)1834, 89, -195807846)).length();
            int var1 = IIlI(132647156, var18 ^ 1933627225);
            int var20 = -1;

            label102:
            while (true) {
               int var24 = IIlI(132647157, var18 ^ -890245904);
               String var28 = var2.substring(++var20, var20 + var1);
               byte var40 = -1;

               while (true) {
                  label97: {
                     char[] var58 = var28.toCharArray();
                     int var70 = var58.length;
                     int var6 = 0;
                     var56 = var24;
                     var45 = var58;
                     var10001 = var70;
                     char[] var82;
                     int var89;
                     if (var70 <= 1) {
                        var82 = var58;
                        var70 = var24;
                        var89 = var6;
                     } else {
                        var56 = var24;
                        var10001 = var70;
                        if (var70 <= var6) {
                           break label97;
                        }

                        var82 = var58;
                        var70 = var24;
                        var89 = var6;
                     }

                     while (true) {
                        var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % IIlI(132647049, var18 ^ 1566781553)) {
                           case 0 -> IIlI(132647054, var18 ^ -404878968);
                           case 1 -> IIlI(132647055, var18 ^ -1162287074);
                           case 2 -> IIlI(132647052, var18 ^ -1276032543);
                           case 3 -> IIlI(132647053, var18 ^ -963816188);
                           case 4 -> IIlI(132647042, var18 ^ 1786986757);
                           case 5 -> IIlI(132647043, var18 ^ -1717902821);
                           default -> IIlI(132647040, var18 ^ 1787273205);
                        });
                        var6++;
                        if (var56 == 0) {
                           var89 = var56;
                           var82 = var45;
                           var70 = var56;
                        } else {
                           if (var10001 <= var6) {
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
                        if ((var20 += var1) >= var4) {
                           III = var5;
                           lI = new String[IIlI(132647048, var18 ^ 470631806)];
                           I = new String[IIlI(132647041, var18 ^ -1587455450)];
                           llI();
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var63;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label102;
                        }

                        var4 = (var2 = IIll(21050, (byte)-63, -195807845)).length();
                        var1 = IIlI(132647050, var18 ^ 546615562);
                        var20 = -1;
                  }

                  var24 = IIlI(132647051, var18 ^ -294292273);
                  var28 = var2.substring(++var20, var20 + var1);
                  var40 = 0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 59;
                  case 1 -> 53;
                  case 2 -> 44;
                  case 3 -> 130;
                  case 4 -> 9;
                  case 5 -> 253;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public IIlIIl() {
      super(IlIIllIII.Ill(I[IIlI(132647118, 1991788716 ^ -1378509432)]), lllIIlIl.IlI, IlIIllIII.Ill(I[IIlI(132647119, 1991788716 ^ 1733020719)]));
      this.II = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(I[IIlI(132647116, 1991788716 ^ -404962871)]), 3.0, 0.5, 30.0, 0.5)
            .IlII(IlIIllIII.lI(I[IIlI(132647117, 1991788716 ^ 1622857161)]))
      );
   }

   private static String Ill(char[] var0, long var1, int var3) {
      int var4 = IIlI(132647106, 930350683 ^ -1741251922) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIlI(132647107, 930350683 ^ 428426723);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static int IIlI(int var0, int var1) {
      int var2 = IlI[var0 ^ 132647370] ^ var1 ^ var0;
      var2 ^= 51773;
      var2 -= 53864;
      var2 += 55359;
      var2 -= 698;
      var2 += 43341;
      var2 ^= 62419;
      var2 -= 7702;
      return var2 + 26592;
   }

   private static Throwable lII(Throwable var0) {
      return var0;
   }

   private void lIl() {
      this.ll = null;
      this.Il = 0L;
   }

   private static void llI() {
      int var0 = -1131527554;
      I[0] = Ill(I(IIlI(132647104, var0 ^ 1886751561), IIlI(132647105, var0 ^ 560242751)).toCharArray(), 63833L, IIlI(132647110, var0 ^ 892284097));
      I[1] = Ill(I(IIlI(132647111, var0 ^ 1483697437), IIlI(132647108, var0 ^ -460338152)).toCharArray(), 89216L, IIlI(132647109, var0 ^ -170832019));
      I[2] = Ill(I(IIlI(132647130, var0 ^ 340479718), IIlI(132647131, var0 ^ -1760445474)).toCharArray(), 68605L, IIlI(132647128, var0 ^ -1792185576));
      I[3] = Ill(I(IIlI(132647129, var0 ^ -992226316), IIlI(132647134, var0 ^ -284511391)).toCharArray(), 13601L, IIlI(132647135, var0 ^ 1308158380));
      I[4] = Ill(I(IIlI(132647132, var0 ^ 2047554700), IIlI(132647133, var0 ^ 1350570120)).toCharArray(), 83902L, IIlI(132647122, var0 ^ -586969360));
      I[5] = Ill(I(IIlI(132647123, var0 ^ 388860381), IIlI(132647120, var0 ^ -1400460259)).toCharArray(), 7702L, IIlI(132647121, var0 ^ 1014162098));
      I[IIlI(132647126, var0 ^ 1572598228)] = Ill(
         I(IIlI(132647127, var0 ^ -955197176), IIlI(132647124, var0 ^ -1994474659)).toCharArray(), 80986L, IIlI(132647125, var0 ^ 49938604)
      );
      I[IIlI(132647146, var0 ^ 912563717)] = Ill(
         I(IIlI(132647147, var0 ^ 1262759494), IIlI(132647144, var0 ^ 1686661898)).toCharArray(), 20369L, IIlI(132647145, var0 ^ -1379863879)
      );
      I[IIlI(132647150, var0 ^ -1700691176)] = Ill("".toCharArray(), 69992L, IIlI(132647151, var0 ^ 372966616));
      I[IIlI(132647148, var0 ^ 1596796828)] = Ill(
         I(IIlI(132647149, var0 ^ -693469830), IIlI(132647138, var0 ^ -1797671014)).toCharArray(), 52207L, IIlI(132647139, var0 ^ -1924233459)
      );
      I[IIlI(132647136, var0 ^ -1930050887)] = Ill(
         I(IIlI(132647137, var0 ^ -1671459623), IIlI(132647142, var0 ^ -1567292395)).toCharArray(), 26624L, IIlI(132647143, var0 ^ -64396683)
      );
      I[IIlI(132647140, var0 ^ 1944159560)] = Ill(
         I(IIlI(132647141, var0 ^ 591967719), IIlI(132647162, var0 ^ -2079081341)).toCharArray(), 19595L, IIlI(132647163, var0 ^ 1240336892)
      );
      I[IIlI(132647160, var0 ^ 1378698841)] = Ill(
         I(IIlI(132647161, var0 ^ -384939263), IIlI(132647166, var0 ^ 1465855225)).toCharArray(), 69958L, IIlI(132647167, var0 ^ -258359388)
      );
      I[IIlI(132647164, var0 ^ -1683077269)] = Ill(
         I(IIlI(132647165, var0 ^ 1445762813), IIlI(132647154, var0 ^ -648971218)).toCharArray(), 70635L, IIlI(132647155, var0 ^ 1955442507)
      );
   }

   @Override
   public String IlIIl() {
      double var1 = this.II.IllI();
      if (Math.abs(var1 - Math.rint(var1)) < 0.001) {
         int var10000 = (int)Math.rint(var1);
         String var4 = IlIIllIII.lI(I[IIlI(132647152, -98305540 ^ 1860918837)]);
         int var3 = var10000;
         return var3 + var4;
      } else {
         return String.format(Locale.ROOT, IlIIllIII.lI(I[IIlI(132647153, -98305540 ^ 691179292)]), var1);
      }
   }

   private static String IIll(short var0, byte var1, int var2) {
      int var7 = var2 ^ -195807846;
      char[] var6 = Ill[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])lII[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         lII[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 34300;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ var5 ^ var2 ^ var1 ^ var4 ^ var0);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   private class_437 lll(class_419 var1) {
      try {
         if (var1 == null) {
            return null;
         }
      } catch (ReflectiveOperationException var6) {
         throw lII(var6);
      }

      try {
         Field var2 = class_419.class.getDeclaredField(IlIIllIII.lI(I[IIlI(132647158, 873428383 ^ 1993802208)]));
         var2.setAccessible(true);
         return var2.get(var1) instanceof class_437 var4 ? var4 : null;
      } catch (ReflectiveOperationException var5) {
         return null;
      }
   }

   private boolean IIII(class_310 var1) {
      if (!var1.method_1542() && this.IIl != null) {
         String var2 = this.IIl.field_3761;
         return var2 != null && !var2.isBlank() && class_639.method_36224(var2) && !llllIlll.IIl(var2);
      } else {
         return false;
      }
   }

   private boolean IIIl(class_4185 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnonnull 0a
      // 04: bipush 0
      // 05: ireturn
      // 06: invokestatic k74/x/IIlIIl.lII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 09: athrow
      // 0a: aload 1
      // 0b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0e: getstatic k74/x/IIlIIl.I [Ljava/lang/String;
      // 11: bipush 5
      // 12: aaload
      // 13: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 16: bipush 0
      // 17: anewarray 1137
      // 1a: invokevirtual java/lang/Class.getMethod (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      // 1d: astore 2
      // 1e: aload 2
      // 1f: aload 1
      // 20: bipush 0
      // 21: anewarray 754
      // 24: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 27: pop
      // 28: bipush 1
      // 29: ireturn
      // 2a: astore 2
      // 2b: aload 1
      // 2c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 2f: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 32: astore 2
      // 33: aload 2
      // 34: arraylength
      // 35: istore 3
      // 36: bipush 0
      // 37: istore 4
      // 39: iload 4
      // 3b: iload 3
      // 3c: if_icmpge ba
      // 3f: aload 2
      // 40: iload 4
      // 42: aaload
      // 43: astore 5
      // 45: aload 5
      // 47: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 4a: getstatic k74/x/IIlIIl.I [Ljava/lang/String;
      // 4d: bipush 5
      // 4e: aaload
      // 4f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 52: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 55: ifeq b4
      // 58: aload 5
      // 5a: invokevirtual java/lang/reflect/Method.getParameterCount ()I
      // 5d: bipush 1
      // 5e: if_icmpeq 6f
      // 61: goto 68
      // 64: invokestatic k74/x/IIlIIl.lII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 67: athrow
      // 68: goto b4
      // 6b: invokestatic k74/x/IIlIIl.lII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 6e: athrow
      // 6f: aload 5
      // 71: invokevirtual java/lang/reflect/Method.getParameterTypes ()[Ljava/lang/Class;
      // 74: bipush 0
      // 75: aaload
      // 76: astore 6
      // 78: aload 6
      // 7a: invokevirtual java/lang/Class.isInterface ()Z
      // 7d: ifeq 9d
      // 80: aload 6
      // 82: invokevirtual java/lang/Class.getClassLoader ()Ljava/lang/ClassLoader;
      // 85: bipush 1
      // 86: anewarray 1137
      // 89: dup
      // 8a: bipush 0
      // 8b: aload 6
      // 8d: aastore
      // 8e: invokedynamic invoke ()Ljava/lang/reflect/InvocationHandler; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;, k74/x/IIlIIl.lI (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object; ]
      // 93: invokestatic java/lang/reflect/Proxy.newProxyInstance (Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
      // 96: goto 9e
      // 99: invokestatic k74/x/IIlIIl.lII (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 9c: athrow
      // 9d: aconst_null
      // 9e: astore 7
      // a0: aload 5
      // a2: aload 1
      // a3: bipush 1
      // a4: anewarray 754
      // a7: dup
      // a8: bipush 0
      // a9: aload 7
      // ab: aastore
      // ac: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // af: pop
      // b0: bipush 1
      // b1: ireturn
      // b2: astore 8
      // b4: iinc 4 1
      // b7: goto 39
      // ba: bipush 0
      // bb: ireturn
   }
}
