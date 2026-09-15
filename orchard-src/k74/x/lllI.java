package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class lllI extends IlIIIIIIl {
   private static final float II = 7.5F;
   private int Il;
   private static final float lI = 8.0F;
   private static final float ll = 32.0F;
   private static final int III = 12;
   private static String[] IIl;
   private static final String[] IlI;
   private static final int I = 2;
   private static final int[] IIll;
   private final lllIIllI Ill;
   private static final String[] IlII;
   private final IIlIII lII;
   private static final String[] lIl;
   private int llI;
   private int lll;
   private static final float IIII = 75.0F;
   private static final Object[] IlIl;
   private static final float IIIl = 6.0F;
   private static final float IIlI = 4.5F;

   private float I(float var1, float var2, float var3) {
      float var4 = class_3532.method_15393(var2 - var1);
      return Math.abs(var4) <= var3 ? var2 : var1 + Math.copySign(var3, var4);
   }

   private class_1657 II(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      String var3 = ((String)this.Ill.IllI()).trim();
      if (var3.isEmpty()) {
         return null;
      } else {
         double var4 = this.lII.IllI() * this.lII.IllI();

         for (class_1657 var7 : var1.field_1687.method_18456()) {
            if (var7 != var1.field_1724 && var7.method_5477().getString().equalsIgnoreCase(var3)) {
               if (var7.method_5858(var1.field_1724) <= var4) {
                  return var7;
               }

               if (var2 != null) {
                  break;
               }
            }
         }

         return null;
      }
   }

   private static int l(int var0, int var1) {
      int var2 = IIll[var0 ^ -651924417] ^ var1 ^ var0;
      var2 ^= 58988;
      var2 ^= 5767;
      var2 ^= 21633;
      var2 -= 15151;
      var2 ^= 34059;
      var2 += 16922;
      var2 += 20066;
      var2 += 32680;
      var2 += 8331;
      return var2 + 42108;
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1687 != null && var1.field_1724 != null) {
         class_1657 var2 = this.II(var1);
         if (var2 == null) {
            this.lll = 0;
            this.Il = -1;
            this.llI = 0;
         } else {
            if (this.Il != var2.method_5628()) {
               this.Il = var2.method_5628();
               this.llI = 2;
            }

            this.ll(var1.field_1724, var2);
            if (++this.lll >= l(-651924417, 15267039 ^ 1968814609)) {
               this.lll = 0;
               var2.method_6104(class_1268.field_5808);
            }
         }
      } else {
         this.lll = 0;
      }
   }

   private static String Il(char[] var0, long var1, int var3) {
      int var4 = l(-651924418, -13871923 ^ 1899155440) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & l(-651924419, -13871923 ^ 880510723);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public lllI() {
      super(IlIIllIII.Ill(IIl[2]), lllIIlIl.IIl, IlIIllIII.Ill(IIl[4]));
      this.Ill = this.IllIIll(new lllIIllI(IlIIllIII.Ill(IIl[3]), IIl[5]));
      this.lII = this.IllIIll(new IIlIII(IlIIllIII.Ill(IIl[1]), 8.0, 1.0, 64.0, 0.5).IlII(IlIIllIII.lI(IIl[0])));
      this.Il = -1;
   }

   private static String IIl(int var0, int var1, int var2) {
      int var3 = var0 ^ 49924;
      char[] var4 = IlII[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 11282;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '馤';
         var10 -= 13587;
         var10 += 59162;
         var10 ^= 29840;
         var10 ^= 23703;
         var10 -= 9170;
         var10 += 62885;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static String lI(int var0, int var1) {
      int var9 = 3317737;
      int var2 = (var0 ^ l(-651924420, var9 ^ 730386894)) & l(-651924421, var9 ^ -239976281);
      if (IlI[var2] == null) {
         char[] var3 = lIl[var2].toCharArray();

         int var4 = switch (var3[0] & l(-651924422, var9 ^ -1394963950)) {
            case 0 -> l(-651924423, var9 ^ -841845207);
            case 1 -> l(-651924424, var9 ^ 464786430);
            case 2 -> l(-651924425, var9 ^ 946124020);
            case 3 -> l(-651924426, var9 ^ 1338474798);
            case 4 -> l(-651924427, var9 ^ -1533950549);
            case 5 -> l(-651924428, var9 ^ -2066895554);
            case 6 -> l(-651924429, var9 ^ -940239245);
            case 7 -> l(-651924430, var9 ^ 1091078288);
            case 8 -> l(-651924431, var9 ^ 2027483771);
            case 9 -> 0;
            case 10 -> l(-651924432, var9 ^ -295661916);
            case 11 -> l(-651924433, var9 ^ -1822125894);
            case 12 -> l(-651924434, var9 ^ 371849229);
            case 13 -> l(-651924435, var9 ^ -1564082070);
            case 14 -> 3;
            case 15 -> l(-651924436, var9 ^ 1424380661);
            case 16 -> l(-651924437, var9 ^ -1128368499);
            case 17 -> l(-651924438, var9 ^ 1379621249);
            case 18 -> l(-651924439, var9 ^ -736503339);
            case 19 -> l(-651924440, var9 ^ 996617932);
            case 20 -> l(-651924441, var9 ^ -1884725521);
            case 21 -> l(-651924442, var9 ^ -427800145);
            case 22 -> l(-651924443, var9 ^ -171186064);
            case 23 -> l(-651924444, var9 ^ 1545866290);
            case 24 -> l(-651924445, var9 ^ 935517959);
            case 25 -> 4;
            case 26 -> l(-651924446, var9 ^ 500317213);
            case 27 -> l(-651924447, var9 ^ 2068092950);
            case 28 -> l(-651924448, var9 ^ -533168524);
            case 29 -> l(-651924449, var9 ^ 1620428275);
            case 30 -> l(-651924450, var9 ^ 194401791);
            case 31 -> l(-651924451, var9 ^ -1976142425);
            case 32 -> l(-651924452, var9 ^ 404033078);
            case 33 -> l(-651924453, var9 ^ 111968064);
            case 34 -> l(-651924454, var9 ^ 1092842498);
            case 35 -> l(-651924455, var9 ^ 1886790735);
            case 36 -> l(-651924456, var9 ^ 2042805585);
            case 37 -> l(-651924457, var9 ^ -1028989938);
            case 38 -> l(-651924458, var9 ^ -5387304);
            case 39 -> l(-651924459, var9 ^ -1121172512);
            case 40 -> l(-651924460, var9 ^ 1078389157);
            case 41 -> l(-651924461, var9 ^ -210204728);
            case 42 -> l(-651924462, var9 ^ 676844889);
            case 43 -> l(-651924463, var9 ^ -1558718508);
            case 44 -> l(-651924464, var9 ^ -270525352);
            case 45 -> l(-651924465, var9 ^ 1024320058);
            case 46 -> l(-651924466, var9 ^ -995362318);
            case 47 -> l(-651924467, var9 ^ -1749011942);
            case 48 -> l(-651924468, var9 ^ 1728343849);
            case 49 -> l(-651924469, var9 ^ -1044359834);
            case 50 -> l(-651924470, var9 ^ -1786439792);
            case 51 -> l(-651924471, var9 ^ 640691262);
            case 52 -> l(-651924472, var9 ^ -1573495360);
            case 53 -> l(-651924473, var9 ^ 1326295419);
            case 54 -> l(-651924474, var9 ^ 1124590654);
            case 55 -> l(-651924475, var9 ^ -355862189);
            case 56 -> l(-651924476, var9 ^ -120704522);
            case 57 -> l(-651924477, var9 ^ -890380363);
            case 58 -> l(-651924478, var9 ^ 1191536558);
            case 59 -> l(-651924479, var9 ^ -301441068);
            case 60 -> l(-651924480, var9 ^ -695129026);
            case 61 -> l(-651924353, var9 ^ -1959567696);
            case 62 -> l(-651924354, var9 ^ 1973571095);
            case 63 -> l(-651924355, var9 ^ 861521099);
            case 64 -> l(-651924356, var9 ^ 1561903022);
            case 65 -> l(-651924357, var9 ^ -262971997);
            case 66 -> l(-651924358, var9 ^ 708393633);
            case 67 -> l(-651924359, var9 ^ -1994267237);
            case 68 -> l(-651924360, var9 ^ -2045553189);
            case 69 -> l(-651924361, var9 ^ -1714786975);
            case 70 -> l(-651924362, var9 ^ -758887856);
            case 71 -> l(-651924363, var9 ^ -195053112);
            case 72 -> l(-651924364, var9 ^ -1532417369);
            case 73 -> l(-651924365, var9 ^ -788069998);
            case 74 -> l(-651924366, var9 ^ 1571601207);
            case 75 -> l(-651924367, var9 ^ -409941543);
            case 76 -> l(-651924368, var9 ^ -327734982);
            case 77 -> l(-651924369, var9 ^ 748317815);
            case 78 -> l(-651924370, var9 ^ -1001274565);
            case 79 -> l(-651924371, var9 ^ 548155767);
            case 80 -> l(-651924372, var9 ^ 1781362861);
            case 81 -> l(-651924373, var9 ^ -49082060);
            case 82 -> l(-651924374, var9 ^ 818303358);
            case 83 -> l(-651924375, var9 ^ -71484738);
            case 84 -> l(-651924376, var9 ^ -379723595);
            case 85 -> l(-651924377, var9 ^ -1977145589);
            case 86 -> l(-651924378, var9 ^ -1268567963);
            case 87 -> l(-651924379, var9 ^ 1520771565);
            case 88 -> l(-651924380, var9 ^ -1017336133);
            case 89 -> l(-651924381, var9 ^ 1911728448);
            case 90 -> l(-651924382, var9 ^ 1839207411);
            case 91 -> l(-651924383, var9 ^ -165063003);
            case 92 -> l(-651924384, var9 ^ 284915947);
            case 93 -> l(-651924385, var9 ^ -836826613);
            case 94 -> l(-651924386, var9 ^ -1112679760);
            case 95 -> l(-651924387, var9 ^ 2030874004);
            case 96 -> l(-651924388, var9 ^ -151918914);
            case 97 -> l(-651924389, var9 ^ -2120897046);
            case 98 -> l(-651924390, var9 ^ 821087968);
            case 99 -> l(-651924391, var9 ^ -1893031789);
            case 100 -> l(-651924392, var9 ^ 1439453203);
            case 101 -> l(-651924393, var9 ^ 1090226571);
            case 102 -> l(-651924394, var9 ^ -231651997);
            case 103 -> l(-651924395, var9 ^ -878807542);
            case 104 -> l(-651924396, var9 ^ -1670572144);
            case 105 -> l(-651924397, var9 ^ 1045332636);
            case 106 -> l(-651924398, var9 ^ 661278183);
            case 107 -> l(-651924399, var9 ^ 1527048033);
            case 108 -> l(-651924400, var9 ^ 1614110483);
            case 109 -> l(-651924401, var9 ^ -405093237);
            case 110 -> l(-651924402, var9 ^ 1318937944);
            case 111 -> l(-651924403, var9 ^ -492806631);
            case 112 -> l(-651924404, var9 ^ 140319648);
            case 113 -> l(-651924405, var9 ^ 125991088);
            case 114 -> l(-651924406, var9 ^ 2077524204);
            case 115 -> l(-651924407, var9 ^ 496737090);
            case 116 -> l(-651924408, var9 ^ -498068645);
            case 117 -> l(-651924409, var9 ^ -598148743);
            case 118 -> l(-651924410, var9 ^ -954104508);
            case 119 -> l(-651924411, var9 ^ -1805409808);
            case 120 -> l(-651924412, var9 ^ 1240532107);
            case 121 -> l(-651924413, var9 ^ 1285390046);
            case 122 -> l(-651924414, var9 ^ 866539032);
            case 123 -> l(-651924415, var9 ^ 608298662);
            case 124 -> l(-651924416, var9 ^ -1404103271);
            case 125 -> l(-651924289, var9 ^ -565207113);
            case 126 -> l(-651924290, var9 ^ 1947890359);
            case 127 -> l(-651924291, var9 ^ 1154469146);
            case 128 -> l(-651924292, var9 ^ -263866625);
            case 129 -> l(-651924293, var9 ^ -830071199);
            case 130 -> l(-651924294, var9 ^ -1608501817);
            case 131 -> l(-651924295, var9 ^ 2079558475);
            case 132 -> l(-651924296, var9 ^ 1870865077);
            case 133 -> l(-651924297, var9 ^ 1067394605);
            case 134 -> l(-651924298, var9 ^ -222028501);
            case 135 -> l(-651924299, var9 ^ -933874317);
            case 136 -> l(-651924300, var9 ^ -2059766613);
            case 137 -> l(-651924301, var9 ^ 1265584456);
            case 138 -> l(-651924302, var9 ^ -29458103);
            case 139 -> l(-651924303, var9 ^ 949484470);
            case 140 -> l(-651924304, var9 ^ -1873638156);
            case 141 -> l(-651924305, var9 ^ -514895419);
            case 142 -> 5;
            case 143 -> l(-651924306, var9 ^ -984789364);
            case 144 -> l(-651924307, var9 ^ -2075999232);
            case 145 -> l(-651924308, var9 ^ -29990202);
            case 146 -> l(-651924309, var9 ^ 1619544287);
            case 147 -> l(-651924310, var9 ^ -1668063296);
            case 148 -> l(-651924311, var9 ^ 1602010937);
            case 149 -> l(-651924312, var9 ^ 1841121547);
            case 150 -> l(-651924313, var9 ^ 577345135);
            case 151 -> l(-651924314, var9 ^ -380841393);
            case 152 -> l(-651924315, var9 ^ 1322057504);
            case 153 -> l(-651924316, var9 ^ -1640409578);
            case 154 -> l(-651924317, var9 ^ 511579098);
            case 155 -> l(-651924318, var9 ^ 386043767);
            case 156 -> l(-651924319, var9 ^ -1764812498);
            case 157 -> l(-651924320, var9 ^ 1119053088);
            case 158 -> l(-651924321, var9 ^ 54651309);
            case 159 -> l(-651924322, var9 ^ -467016398);
            case 160 -> l(-651924323, var9 ^ 1096772457);
            case 161 -> l(-651924324, var9 ^ -124330458);
            case 162 -> l(-651924325, var9 ^ 1657321025);
            case 163 -> l(-651924326, var9 ^ -1643479558);
            case 164 -> l(-651924327, var9 ^ -1180637147);
            case 165 -> l(-651924328, var9 ^ -393835148);
            case 166 -> l(-651924329, var9 ^ -797821708);
            case 167 -> l(-651924330, var9 ^ -1609340950);
            case 168 -> l(-651924331, var9 ^ 185778122);
            case 169 -> l(-651924332, var9 ^ -1413773444);
            case 170 -> l(-651924333, var9 ^ -1510180790);
            case 171 -> 1;
            case 172 -> l(-651924334, var9 ^ -1090892493);
            case 173 -> l(-651924335, var9 ^ -258503990);
            case 174 -> l(-651924336, var9 ^ -1797286284);
            case 175 -> l(-651924337, var9 ^ 1448614059);
            case 176 -> l(-651924338, var9 ^ -1670546449);
            case 177 -> l(-651924339, var9 ^ -1920617018);
            case 178 -> l(-651924340, var9 ^ 1987554559);
            case 179 -> l(-651924341, var9 ^ 591998526);
            case 180 -> l(-651924342, var9 ^ 2086458116);
            case 181 -> l(-651924343, var9 ^ -2099208101);
            case 182 -> l(-651924344, var9 ^ 1834933184);
            case 183 -> l(-651924345, var9 ^ 1533363686);
            case 184 -> l(-651924346, var9 ^ -1836374640);
            case 185 -> l(-651924347, var9 ^ -1978762006);
            case 186 -> l(-651924348, var9 ^ 1342332071);
            case 187 -> l(-651924349, var9 ^ -2004182546);
            case 188 -> l(-651924350, var9 ^ 1431499452);
            case 189 -> l(-651924351, var9 ^ 1701700766);
            case 190 -> l(-651924352, var9 ^ -914802274);
            case 191 -> l(-651924225, var9 ^ 617773508);
            case 192 -> l(-651924226, var9 ^ -1262685581);
            case 193 -> l(-651924227, var9 ^ -116952326);
            case 194 -> l(-651924228, var9 ^ -1144899639);
            case 195 -> l(-651924229, var9 ^ -1939649073);
            case 196 -> l(-651924230, var9 ^ -1516269711);
            case 197 -> l(-651924231, var9 ^ 1154266011);
            case 198 -> l(-651924232, var9 ^ 728253555);
            case 199 -> l(-651924233, var9 ^ -372839040);
            case 200 -> 2;
            case 201 -> l(-651924234, var9 ^ 443748149);
            case 202 -> l(-651924235, var9 ^ -1222376361);
            case 203 -> l(-651924236, var9 ^ -1030247083);
            case 204 -> l(-651924237, var9 ^ 2058905335);
            case 205 -> l(-651924238, var9 ^ -1099557979);
            case 206 -> l(-651924239, var9 ^ -1742360722);
            case 207 -> l(-651924240, var9 ^ -1006212440);
            case 208 -> l(-651924241, var9 ^ 1866114547);
            case 209 -> l(-651924242, var9 ^ -597132441);
            case 210 -> l(-651924243, var9 ^ -616482333);
            case 211 -> l(-651924244, var9 ^ 1480910062);
            case 212 -> l(-651924245, var9 ^ 850574660);
            case 213 -> l(-651924246, var9 ^ 1681129382);
            case 214 -> l(-651924247, var9 ^ 1761122123);
            case 215 -> l(-651924248, var9 ^ -1203090658);
            case 216 -> l(-651924249, var9 ^ -1998947168);
            case 217 -> l(-651924250, var9 ^ -1875107927);
            case 218 -> l(-651924251, var9 ^ -1305259993);
            case 219 -> l(-651924252, var9 ^ -244548124);
            case 220 -> l(-651924253, var9 ^ 1662783465);
            case 221 -> l(-651924254, var9 ^ -641125586);
            case 222 -> l(-651924255, var9 ^ 501353920);
            case 223 -> l(-651924256, var9 ^ 2112376980);
            case 224 -> l(-651924257, var9 ^ 1992920708);
            case 225 -> l(-651924258, var9 ^ -1383242756);
            case 226 -> l(-651924259, var9 ^ -627848447);
            case 227 -> l(-651924260, var9 ^ -1388525661);
            case 228 -> l(-651924261, var9 ^ 1948332157);
            case 229 -> l(-651924262, var9 ^ -1182669007);
            case 230 -> l(-651924263, var9 ^ -840087086);
            case 231 -> l(-651924264, var9 ^ 108026970);
            case 232 -> l(-651924265, var9 ^ 343758556);
            case 233 -> l(-651924266, var9 ^ -1128751757);
            case 234 -> l(-651924267, var9 ^ 898374841);
            case 235 -> l(-651924268, var9 ^ -1305603354);
            case 236 -> l(-651924269, var9 ^ -1378640108);
            case 237 -> l(-651924270, var9 ^ -1152205593);
            case 238 -> l(-651924271, var9 ^ -1398720596);
            case 239 -> l(-651924272, var9 ^ -183963792);
            case 240 -> l(-651924273, var9 ^ 911001142);
            case 241 -> l(-651924274, var9 ^ 1069186147);
            case 242 -> l(-651924275, var9 ^ -449171349);
            case 243 -> l(-651924276, var9 ^ -1780393705);
            case 244 -> l(-651924277, var9 ^ 184840949);
            case 245 -> l(-651924278, var9 ^ 1598183586);
            case 246 -> l(-651924279, var9 ^ -94414993);
            case 247 -> l(-651924280, var9 ^ 446319206);
            case 248 -> l(-651924281, var9 ^ 2024761417);
            case 249 -> l(-651924282, var9 ^ -1816916786);
            case 250 -> l(-651924283, var9 ^ 637939095);
            case 251 -> l(-651924284, var9 ^ -1232475106);
            case 252 -> l(-651924285, var9 ^ 393454832);
            case 253 -> l(-651924286, var9 ^ 2067230500);
            case 254 -> l(-651924287, var9 ^ -1899467250);
            default -> l(-651924288, var9 ^ -1778498161);
         };
         int var5 = (var1 & l(-651924161, var9 ^ 582771064)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & l(-651924162, var9 ^ 2026571967)) >>> l(-651924163, var9 ^ -1281182751)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & l(-651924164, var9 ^ 106176395);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & l(-651924165, var9 ^ -62578484);
            }
         }

         IlI[var2] = new String(var3).intern();
      }

      return IlI[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -2089734072;
      short var12 = 13485;
      int var8 = "f㍇駸䪏㊜쵸鐣贩⇤\ue97f⬐⭔컴糁ᢤ䃐拡䩻넰\uf3e0ഡ셩\uf5c0摝\ud82bﶲ뾡㒍㏊ﾣ䜌㱛㙑ئ⌑⩍踳砬핍\ud980\ufaf3\udef0ｙ\uef7e퐪䔰䄘茖ⅰ뭑〬齍\ueb4b\ue39d\ued28ଝ\u139c鋯嚮ᥘ芊䷞\uda85怃ʞ쏅餙⚯켜纙擒싵諓隁ֻꋈ쟞䕍샏⍯궁帪\ue60a\udf32禒ﮘ깝疞ឱ蹱㗙₠뵬눉끕赑\ue851ꌌ᭔\udd60廓乜⊆\u0011ꪀ휏ራ嶛骍ࡥ쳋謂럡Ḃ\ue964Ꜿ퐳췭㑤⮘ଜ"
         .length();
      int var11 = 0;
      String[] var10001 = new String[2];
      int var10 = 0;
      String[] var9 = var10001;
      String var7 = "f㍇駸䪏㊜쵸鐣贩⇤\ue97f⬐⭔컴糁ᢤ䃐拡䩻넰\uf3e0ഡ셩\uf5c0摝\ud82bﶲ뾡㒍㏊ﾣ䜌㱛㙑ئ⌑⩍踳砬핍\ud980\ufaf3\udef0ｙ\uef7e퐪䔰䄘茖ⅰ뭑〬齍\ueb4b\ue39d\ued28ଝ\u139c鋯嚮ᥘ芊䷞\uda85怃ʞ쏅餙⚯켜纙擒싵諓隁ֻꋈ쟞䕍샏⍯궁帪\ue60a\udf32禒ﮘ깝疞ឱ蹱㗙₠뵬눉끕赑\ue851ꌌ᭔\udd60廓乜⊆\u0011ꪀ휏ራ嶛骍ࡥ쳋謂럡Ḃ\ue964Ꜿ퐳췭㑤⮘ଜ";

      do {
         char var13 = var7.charAt(var11);
         int var24 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var24, var10002).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 26;
               case 1 -> 185;
               case 2 -> 5;
               case 3 -> 102;
               case 4 -> 152;
               case 5 -> 73;
            }) ^ var16;
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

      IlII = var9;
      IlIl = new Object[var9.length];
      int var21 = 0;
      IIll = new int[290];
      byte var25 = 0;
      byte[] var35 = "\u008d\u0093\u001f\u0090\u0080gâ\u009d3u\u0083\u0085Ó\u0099õ\u0094\t£\u008e\u0003TÊE·5ÂºØã¤ß\u0012Àtzy·×M\n\\\u0081\t||Ýa7?åÚw¹\u0018D\u009c\u0080È>\u0080\u0016p@\u0018kt\\ßî94ÌZÖÌ\u0080¬ö\u009eóD®º\u009fª+\u0095z,\t\u0015QÃwá|w¹\u0092\t\u001e\u0090\u0085x\rÛ$\u0091¤4À[ÏÒ\u0013\u0012åÂð:\u0083TV\u0081\u0018(²e\u0098\u0085\u000b^ó\u0086\u0099ër&¹¢à\u0005ÂÕþ¼±Î¹3¸j\u0088fêÝ\u0081ÒsÇ:º\u0010½\u0007½\u0007.E<\u008f\t¸V%¹\u000bhK\u0012ÐG\u0019\f[\u0007\u001b>\u0017ðÓÑÅ\u001d-[<»5³oÐþW\u009f\u0014£×9Ð\u0099\u009am\u0095Û~Þ àÝZ&\u0091Û·\u001deH»\u0017(\u0018\u0012Ù5ÿ\u0000ÞýÚ2ý\u0011\"¿\u0015«\\\u0016\u0018\u0091d.\u0081àþs#\u0092¥\u008d²\u0082\rËI\bQ¥\bs\u0004\bC\u0091\u009dÒ)ôEq1)ò~\u0003\u0099HaÚ£\u0090*Ô\u0086y\fOu\u008e\\¹æ\u009b)\u0017Ïi¥¼w\u008b\u001f\u0080\u0005s\u0014gå\u0087Ô\u008a `<A\u000fNØ¼ý\r\u0092=¼¤\u0005\u0003Ý.ÈÖ\u009f¤\u0003\u00adö¤\u0011M/Br7ëÄLsü$¢µíº;Lb!\u0089âeU\u0095°ßI\u000e9\u009a!èë¶\u00066\u000fÆ¬E½\u0014o\u0081\u001caf\u000eá*Äy\u0085aËÈà\u0002Òw:lÐ\u00adÜ\u009c;¸ëE=\n!\u008983\u008eºád}Û\u0002Æ^N;ßz\u0083\r£\u0014+Ê\u0098%\u0093\u0086\u001fÊ\b'¶\u008d©Ë\u001a°\u00924ðMÕPÿ\u0092¶i\u0083ÄLñå\u008bWÔ\u001a@ßÿ$H5R?1I\tlsmF±áÈ\u0094´\u008d²:Ë¶\u009a\u0089ÜQ*MT_Ùº&_Sá\u008c\n¾(¼ß\u0003\u0012\bUz\u007f6\u0096ÒÏX0ùF\u0083ãG\\\u0097\u0093î\u0003Ç\u008fê\u0098\nÔÑ²0Fû}}*º\u009c³\u007f\u0085ò\u0006.MµÀ\u00877DhB@%\u0019_\u009d|=]\u0080\u0096|R\b\b\u0006&®\u0082\u0098\u0098\u0084\rd\u0083\u0093\u0016§lsm\u0095\u00ad\u0085\u0099ÚyZ\u0011\u0011\\\u001e\u001f¶Ü3\u009bf)\u009a±ænßßï\u0012AUnß×2º£©ÙûQ%\u001f\u001c9)n¹O§Ä\u0000\u0086\u0012\u0094\u009aØzÖf\u001a±KA°&6\u0010\u0096AÈ(búÔX\u0003©Ãó\u0002s\u008fS«K¼]ì´æFê\u0081ñ\b\u0087F®lÏZ¼®HÔSd}·³u\u0095y6\u008eg`ØÛYâ\u0080\u0084L\u001f\u0091zðl\u0011\u0095N\u0017é£u\u0089ªj\u009bé\u0016r\u001e³ù¨\u0012\u0090?p\u009aU?\u00adB>U\u009d}(È1iõ`ÜÂµNL¬>c\u0001\u0017¼\u0083CÒûyts\u0081p]\u008fCæ¼Ü\u007f8Óx\u0088Ê\u0011Ö\"ìâcÃ\fO4Èñ:\u0087a\u0002\u0082¨ªmFfß\u008d`5cý<\u0016¦z\u0097*k¥$x·±#Qõ\u001f T(\u0004Ê¢qä\u009c#3î\u0090è[¶@Z\u0087ÓpÊ°3h,Ó\u0091J#\u009c\u00ad\t|³\u0089\u009b\fÃì!Ùÿ\u0099åòÁ}\u0085ø\u009c)\u008eÙ@ÌU\u009d¯þ\"\u0083\u0007\u008aU,\u000b\u0000\u008c1ü_A\u0091+ö5ý\u0085mþ`\u0092\u0000ìm\u009a'D¨S Í\u009cÐ2J>ÞtUÃS\u0096CBp1T±û4\r\u0018#ÛÎ\\\b~Çª°´\u001d*þ\u0015mñ\u0095wó\u0014¾?§R\u0094\u000f\u0002O\u009bsâ\u008a\u0086\u008d\u0080¿¤\u0081k¤À\u000fÞ\u0016á{N\u0099 \u0016ïch\u0093\u0083'£\u000bvØ @mî\u0089\rÚ¬¯Ø\u0080ÚÇ\u001eK²|HþDÑ(\u0004Uîh+¤v¡\u0006ngªÃ\u0005±Ùäí-lÓjûºoLïqÿsL=\bÊ£Þ!1¡9\u008ac\u001c*æÌ\u001e¦\u0091nn\u0087!\u0085{\u000f,+èÙ\u0012\u009cD \u0091\u001b *lbô<\u0090ÄòÐUëQR\b8~\\s¹\u008cìvìÝmÌ\u0005Ó4Èñ\u00974ð¯\u001c7î\u0014\u0019U~ËÉ\u0016BT\u009b§\u001f\u0092:ý"
         .getBytes("ISO-8859-1");

      int var57;
      do {
         IIll[var21] = ((var35[var25] & 255) << 24 | (var35[var25 + 1] & 255) << 16 | (var35[var25 + 2] & 255) << 8 | var35[var25 + 3] & 255) ^ -554143214;
         var21 += 1;
         var57 = var25 + 4;
         var25 += 4;
      } while (var57 < var35.length);

      String[] var5 = new String[5];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIl(49924, var17 ^ -1992095940, 43868)).length();
      int var1 = l(-651924182, var17 ^ 389125155);
      int var19 = -1;

      label100:
      while (true) {
         var21 = l(-651924183, var17 ^ -342388549);
         String var28 = var2.substring(++var19, var19 + var1);
         byte var41 = -1;

         while (true) {
            label95: {
               char[] var59 = var28.toCharArray();
               int var71 = var59.length;
               int var6 = 0;
               var57 = var21;
               var46 = var59;
               int var33 = var71;
               char[] var83;
               int var90;
               if (var71 <= 1) {
                  var83 = var59;
                  var71 = var21;
                  var90 = var6;
               } else {
                  var57 = var21;
                  var33 = var71;
                  if (var71 <= var6) {
                     break label95;
                  }

                  var83 = var59;
                  var71 = var21;
                  var90 = var6;
               }

               while (true) {
                  var83[var90] = (char)(var83[var90] ^ var71 ^ switch (var6 % l(-651924186, var17 ^ 149613820)) {
                     case 0 -> l(-651924187, var17 ^ 230670136);
                     case 1 -> l(-651924188, var17 ^ -1219054794);
                     case 2 -> l(-651924189, var17 ^ -1281165516);
                     case 3 -> l(-651924190, var17 ^ -1946387447);
                     case 4 -> l(-651924191, var17 ^ -1790477530);
                     case 5 -> l(-651924192, var17 ^ 93891416);
                     default -> l(-651924193, var17 ^ 956823990);
                  });
                  var6++;
                  if (var57 == 0) {
                     var90 = var57;
                     var83 = var46;
                     var71 = var57;
                  } else {
                     if (var33 <= var6) {
                        break;
                     }

                     var83 = var46;
                     var71 = var57;
                     var90 = var6;
                  }
               }
            }

            String var64 = new String(var46).intern();
            switch (var41) {
               case 0:
                  var5[var3++] = var64;
                  if ((var19 += var1) >= var4) {
                     lIl = var5;
                     IlI = new String[5];
                     IIl = new String[l(-651924194, var17 ^ 1690393388)];
                     III();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var64;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label100;
                  }

                  var4 = (var2 = IIl(49925, var17 ^ -1423961805, 988)).length();
                  var1 = l(-651924184, var17 ^ 783823183);
                  var19 = -1;
            }

            var21 = l(-651924185, var17 ^ 1936399555);
            var28 = var2.substring(++var19, var19 + var1);
            var41 = 0;
         }
      }
   }

   private void ll(class_1657 var1, class_1657 var2) {
      class_243 var3 = var2.method_33571();
      class_243 var4 = var1.method_33571();
      double var5 = var4.field_1352 - var3.field_1352;
      double var7 = var4.field_1351 - var3.field_1351;
      double var9 = var4.field_1350 - var3.field_1350;
      double var11 = Math.sqrt(var5 * var5 + var9 * var9);
      float var13 = (float)(class_3532.method_15349(var9, var5) * 180.0F / (float)Math.PI) - 90.0F;
      float var14 = (float)(-(class_3532.method_15349(var7, var11) * 180.0F / (float)Math.PI));
      if (this.llI > 0) {
         this.llI--;
      } else {
         float var15 = var2.field_6283;
         float var16 = class_3532.method_15363(class_3532.method_15393(var13 - var15), -75.0F, 75.0F);
         float var17 = var15 + var16;
         float var18 = this.I(var2.field_6241, var17, 8.0F);
         float var19 = var15;
         float var20 = class_3532.method_15393(var18 - var15);
         if (Math.abs(var20) > 32.0F) {
            var19 = this.I(var15, var13, 4.5F);
            var20 = class_3532.method_15393(var18 - var19);
         }

         if (Math.abs(var20) > 75.0F) {
            float var21 = var18 - Math.copySign(75.0F, var20);
            var19 = this.I(var19, var21, 7.5F);
            var20 = class_3532.method_15393(var18 - var19);
         }

         if (Math.abs(var20) > 75.0F) {
            var18 = var19 + Math.copySign(75.0F, var20);
         }

         float var22 = this.I(var2.method_36455(), var14, 6.0F);
         var2.method_36456(var19);
         var2.field_6283 = var19;
         var2.field_6241 = var18;
         var2.method_36457(var22);
      }
   }

   private static void III() {
      int var0 = -586065202;
      IIl[0] = Il(lI(l(-651924166, var0 ^ 244750037), l(-651924167, var0 ^ 593349302)).toCharArray(), 37168L, l(-651924168, var0 ^ 543044088));
      IIl[1] = Il(lI(l(-651924169, var0 ^ -1042297574), l(-651924170, var0 ^ -161889707)).toCharArray(), 76373L, l(-651924171, var0 ^ -1585429301));
      IIl[2] = Il(lI(l(-651924172, var0 ^ -633230266), l(-651924173, var0 ^ 771335912)).toCharArray(), 57301L, l(-651924174, var0 ^ -73429314));
      IIl[3] = Il(lI(l(-651924175, var0 ^ -1353581490), l(-651924176, var0 ^ -1006690101)).toCharArray(), 87456L, l(-651924177, var0 ^ -618263722));
      IIl[4] = Il(lI(l(-651924178, var0 ^ 79141737), l(-651924179, var0 ^ 152586018)).toCharArray(), 25637L, l(-651924180, var0 ^ -1629873825));
      IIl[5] = Il("".toCharArray(), 48624L, l(-651924181, var0 ^ -848366988));
   }
}
