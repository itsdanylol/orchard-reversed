package k74.x;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import k74.y.lIlIlllI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_8956;

@Environment(EnvType.CLIENT)
public final class IIllIlIlI extends IlIIIIIIl {
   private int I;
   private static final double II = 0.65;
   private static final String[] Il;
   private static final int[] llI;
   private final IIlIII lI;
   private static final Object[] IIII;
   private final Map<Integer, Integer> ll;
   private static String[] III;
   private static final double IIl = 1.35;
   private static final String[] lll;
   private static final int IlI = 30;
   private static final int Ill = 2;
   private static final String[] lII;
   private Object lIl;

   private void I() {
      this.ll.clear();
      this.I = 0;
      this.lIl = null;
   }

   private static String l(int var0, int var1) {
      int var9 = -722367953;
      int var2 = (var0 ^ llI(-807797386, var9 ^ -1361949033)) & llI(-807797385, var9 ^ 142436141);
      if (Il[var2] == null) {
         char[] var3 = lII[var2].toCharArray();

         int var4 = switch (var3[0] & llI(-807797388, var9 ^ 379451454)) {
            case 0 -> llI(-807797387, var9 ^ -1848761917);
            case 1 -> llI(-807797390, var9 ^ 380042085);
            case 2 -> llI(-807797389, var9 ^ 1476180681);
            case 3 -> llI(-807797392, var9 ^ 576107165);
            case 4 -> llI(-807797391, var9 ^ -1371288826);
            case 5 -> llI(-807797378, var9 ^ 882747643);
            case 6 -> llI(-807797377, var9 ^ 1938343423);
            case 7 -> llI(-807797380, var9 ^ -1174605607);
            case 8 -> llI(-807797379, var9 ^ 340243194);
            case 9 -> llI(-807797382, var9 ^ 1698290546);
            case 10 -> llI(-807797381, var9 ^ -258420576);
            case 11 -> llI(-807797384, var9 ^ 1349706818);
            case 12 -> llI(-807797383, var9 ^ -697189629);
            case 13 -> llI(-807797402, var9 ^ -1778614906);
            case 14 -> llI(-807797401, var9 ^ 872531600);
            case 15 -> llI(-807797404, var9 ^ 441866445);
            case 16 -> llI(-807797403, var9 ^ -1308505129);
            case 17 -> llI(-807797406, var9 ^ -1264436564);
            case 18 -> llI(-807797405, var9 ^ 89387313);
            case 19 -> llI(-807797408, var9 ^ -791401312);
            case 20 -> llI(-807797407, var9 ^ 2127766789);
            case 21 -> llI(-807797394, var9 ^ 1319147424);
            case 22 -> llI(-807797393, var9 ^ -1088723103);
            case 23 -> llI(-807797396, var9 ^ -1486829722);
            case 24 -> llI(-807797395, var9 ^ 674876589);
            case 25 -> llI(-807797398, var9 ^ 1179652608);
            case 26 -> llI(-807797397, var9 ^ 556288883);
            case 27 -> llI(-807797400, var9 ^ -1687023473);
            case 28 -> llI(-807797399, var9 ^ -140864698);
            case 29 -> llI(-807797418, var9 ^ -1684465956);
            case 30 -> llI(-807797417, var9 ^ -99643318);
            case 31 -> llI(-807797420, var9 ^ 285575626);
            case 32 -> llI(-807797419, var9 ^ 1751481461);
            case 33 -> llI(-807797422, var9 ^ 568069843);
            case 34 -> llI(-807797421, var9 ^ -450376539);
            case 35 -> llI(-807797424, var9 ^ 488439845);
            case 36 -> llI(-807797423, var9 ^ 329372978);
            case 37 -> llI(-807797410, var9 ^ 1760773340);
            case 38 -> llI(-807797409, var9 ^ 1440514831);
            case 39 -> llI(-807797412, var9 ^ 1538913085);
            case 40 -> llI(-807797411, var9 ^ 1107246075);
            case 41 -> llI(-807797414, var9 ^ 1731357186);
            case 42 -> llI(-807797413, var9 ^ 563058679);
            case 43 -> llI(-807797416, var9 ^ -1916063847);
            case 44 -> llI(-807797415, var9 ^ -1344952343);
            case 45 -> llI(-807797434, var9 ^ 784278679);
            case 46 -> llI(-807797433, var9 ^ 1129656049);
            case 47 -> llI(-807797436, var9 ^ -1235094244);
            case 48 -> llI(-807797435, var9 ^ -13263204);
            case 49 -> llI(-807797438, var9 ^ 1723844382);
            case 50 -> llI(-807797437, var9 ^ 164756645);
            case 51 -> llI(-807797440, var9 ^ -518119098);
            case 52 -> llI(-807797439, var9 ^ 412210303);
            case 53 -> llI(-807797426, var9 ^ 2048899869);
            case 54 -> llI(-807797425, var9 ^ 2121155277);
            case 55 -> 4;
            case 56 -> llI(-807797428, var9 ^ -1689003982);
            case 57 -> llI(-807797427, var9 ^ 1227973284);
            case 58 -> llI(-807797430, var9 ^ -194728335);
            case 59 -> llI(-807797429, var9 ^ -853061066);
            case 60 -> llI(-807797432, var9 ^ 2051972051);
            case 61 -> llI(-807797431, var9 ^ -491388585);
            case 62 -> llI(-807797450, var9 ^ -138175823);
            case 63 -> llI(-807797449, var9 ^ -1606143081);
            case 64 -> llI(-807797452, var9 ^ 1502864266);
            case 65 -> llI(-807797451, var9 ^ -748938276);
            case 66 -> llI(-807797454, var9 ^ 1988169827);
            case 67 -> llI(-807797453, var9 ^ -717989829);
            case 68 -> llI(-807797456, var9 ^ 790236329);
            case 69 -> llI(-807797455, var9 ^ -1377225997);
            case 70 -> llI(-807797442, var9 ^ -1012317827);
            case 71 -> llI(-807797441, var9 ^ 385634027);
            case 72 -> llI(-807797444, var9 ^ -635664270);
            case 73 -> llI(-807797443, var9 ^ -697322566);
            case 74 -> llI(-807797446, var9 ^ 1689267942);
            case 75 -> llI(-807797445, var9 ^ 358410021);
            case 76 -> llI(-807797448, var9 ^ -797068981);
            case 77 -> llI(-807797447, var9 ^ -1308977750);
            case 78 -> llI(-807797466, var9 ^ 1305757091);
            case 79 -> llI(-807797465, var9 ^ -690563289);
            case 80 -> llI(-807797468, var9 ^ -2106057257);
            case 81 -> llI(-807797467, var9 ^ 1448174926);
            case 82 -> llI(-807797470, var9 ^ -1940854938);
            case 83 -> llI(-807797469, var9 ^ 338592998);
            case 84 -> llI(-807797472, var9 ^ 514322763);
            case 85 -> llI(-807797471, var9 ^ 964619910);
            case 86 -> llI(-807797458, var9 ^ 517291524);
            case 87 -> llI(-807797457, var9 ^ 2083892462);
            case 88 -> llI(-807797460, var9 ^ 1935299057);
            case 89 -> llI(-807797459, var9 ^ 998479805);
            case 90 -> llI(-807797462, var9 ^ 1189010358);
            case 91 -> llI(-807797461, var9 ^ -1795747942);
            case 92 -> llI(-807797464, var9 ^ 482995492);
            case 93 -> llI(-807797463, var9 ^ -2015395779);
            case 94 -> llI(-807797482, var9 ^ -74895498);
            case 95 -> llI(-807797481, var9 ^ -1073381103);
            case 96 -> llI(-807797484, var9 ^ 963983946);
            case 97 -> llI(-807797483, var9 ^ 2072729275);
            case 98 -> llI(-807797486, var9 ^ -498597864);
            case 99 -> llI(-807797485, var9 ^ -781654418);
            case 100 -> llI(-807797488, var9 ^ 1028734955);
            case 101 -> llI(-807797487, var9 ^ 974162667);
            case 102 -> llI(-807797474, var9 ^ -569292821);
            case 103 -> llI(-807797473, var9 ^ 1562688472);
            case 104 -> llI(-807797476, var9 ^ 218681815);
            case 105 -> llI(-807797475, var9 ^ 397301411);
            case 106 -> llI(-807797478, var9 ^ 1246581308);
            case 107 -> llI(-807797477, var9 ^ 629775146);
            case 108 -> llI(-807797480, var9 ^ -1553661492);
            case 109 -> llI(-807797479, var9 ^ -1117583533);
            case 110 -> llI(-807797498, var9 ^ -256119697);
            case 111 -> llI(-807797497, var9 ^ 150721580);
            case 112 -> llI(-807797500, var9 ^ -939451803);
            case 113 -> llI(-807797499, var9 ^ -893140625);
            case 114 -> llI(-807797502, var9 ^ -826557219);
            case 115 -> llI(-807797501, var9 ^ -1949698363);
            case 116 -> llI(-807797504, var9 ^ 1463882111);
            case 117 -> llI(-807797503, var9 ^ -798254846);
            case 118 -> llI(-807797490, var9 ^ 905788085);
            case 119 -> llI(-807797489, var9 ^ -1188004055);
            case 120 -> llI(-807797492, var9 ^ 1279783904);
            case 121 -> llI(-807797491, var9 ^ -1091652469);
            case 122 -> llI(-807797494, var9 ^ -1122631874);
            case 123 -> llI(-807797493, var9 ^ 1012211069);
            case 124 -> llI(-807797496, var9 ^ 1728993639);
            case 125 -> llI(-807797495, var9 ^ -464935066);
            case 126 -> llI(-807797258, var9 ^ -1335611471);
            case 127 -> llI(-807797257, var9 ^ 102722308);
            case 128 -> llI(-807797260, var9 ^ -424658637);
            case 129 -> llI(-807797259, var9 ^ -122614614);
            case 130 -> llI(-807797262, var9 ^ -76381839);
            case 131 -> llI(-807797261, var9 ^ -2005995231);
            case 132 -> 0;
            case 133 -> llI(-807797264, var9 ^ 1858458860);
            case 134 -> llI(-807797263, var9 ^ 2123195639);
            case 135 -> llI(-807797250, var9 ^ 996693132);
            case 136 -> llI(-807797249, var9 ^ -2103555961);
            case 137 -> llI(-807797252, var9 ^ 1278257988);
            case 138 -> llI(-807797251, var9 ^ -1280809471);
            case 139 -> llI(-807797254, var9 ^ 21636842);
            case 140 -> llI(-807797253, var9 ^ -1171863462);
            case 141 -> llI(-807797256, var9 ^ -726799537);
            case 142 -> llI(-807797255, var9 ^ 675636794);
            case 143 -> llI(-807797274, var9 ^ 655149168);
            case 144 -> llI(-807797273, var9 ^ 1775537074);
            case 145 -> llI(-807797276, var9 ^ 534378557);
            case 146 -> llI(-807797275, var9 ^ -285017401);
            case 147 -> llI(-807797278, var9 ^ -493528290);
            case 148 -> llI(-807797277, var9 ^ 904906604);
            case 149 -> llI(-807797280, var9 ^ 1759829658);
            case 150 -> llI(-807797279, var9 ^ -1360861270);
            case 151 -> llI(-807797266, var9 ^ 1217708328);
            case 152 -> llI(-807797265, var9 ^ -597982270);
            case 153 -> 5;
            case 154 -> llI(-807797268, var9 ^ -1321608265);
            case 155 -> llI(-807797267, var9 ^ -1891749961);
            case 156 -> llI(-807797270, var9 ^ -1737124985);
            case 157 -> llI(-807797269, var9 ^ -1706754846);
            case 158 -> llI(-807797272, var9 ^ -362806345);
            case 159 -> llI(-807797271, var9 ^ 2091550026);
            case 160 -> llI(-807797290, var9 ^ -1248195985);
            case 161 -> llI(-807797289, var9 ^ -379073547);
            case 162 -> llI(-807797292, var9 ^ -1916482193);
            case 163 -> llI(-807797291, var9 ^ -890932420);
            case 164 -> 2;
            case 165 -> llI(-807797294, var9 ^ -580374681);
            case 166 -> llI(-807797293, var9 ^ 2108484619);
            case 167 -> llI(-807797296, var9 ^ -1323875691);
            case 168 -> llI(-807797295, var9 ^ 1525169722);
            case 169 -> llI(-807797282, var9 ^ -1268439115);
            case 170 -> llI(-807797281, var9 ^ -1894981518);
            case 171 -> llI(-807797284, var9 ^ 1072663024);
            case 172 -> llI(-807797283, var9 ^ 1850538089);
            case 173 -> llI(-807797286, var9 ^ 1518180127);
            case 174 -> llI(-807797285, var9 ^ -143087925);
            case 175 -> llI(-807797288, var9 ^ -2098489906);
            case 176 -> llI(-807797287, var9 ^ 556104556);
            case 177 -> llI(-807797306, var9 ^ 836254004);
            case 178 -> llI(-807797305, var9 ^ -2034500703);
            case 179 -> llI(-807797308, var9 ^ 2051093194);
            case 180 -> llI(-807797307, var9 ^ -1419194385);
            case 181 -> llI(-807797310, var9 ^ -1484437057);
            case 182 -> llI(-807797309, var9 ^ 433396919);
            case 183 -> llI(-807797312, var9 ^ 2055692339);
            case 184 -> llI(-807797311, var9 ^ 996290628);
            case 185 -> llI(-807797298, var9 ^ -2041736268);
            case 186 -> llI(-807797297, var9 ^ 1516690178);
            case 187 -> llI(-807797300, var9 ^ 412597883);
            case 188 -> llI(-807797299, var9 ^ -217146995);
            case 189 -> llI(-807797302, var9 ^ -764246736);
            case 190 -> llI(-807797301, var9 ^ -335359319);
            case 191 -> llI(-807797304, var9 ^ 1232110798);
            case 192 -> llI(-807797303, var9 ^ 1793568200);
            case 193 -> llI(-807797322, var9 ^ 2092576507);
            case 194 -> llI(-807797321, var9 ^ 93265111);
            case 195 -> llI(-807797324, var9 ^ 372803230);
            case 196 -> llI(-807797323, var9 ^ 232995347);
            case 197 -> llI(-807797326, var9 ^ 291621763);
            case 198 -> llI(-807797325, var9 ^ -1035153109);
            case 199 -> llI(-807797328, var9 ^ 975058409);
            case 200 -> llI(-807797327, var9 ^ 209765997);
            case 201 -> llI(-807797314, var9 ^ -1070866337);
            case 202 -> llI(-807797313, var9 ^ 1763981021);
            case 203 -> llI(-807797316, var9 ^ 1504009704);
            case 204 -> llI(-807797315, var9 ^ -2100071411);
            case 205 -> llI(-807797318, var9 ^ 2099636723);
            case 206 -> llI(-807797317, var9 ^ 1267846393);
            case 207 -> llI(-807797320, var9 ^ -1952986039);
            case 208 -> llI(-807797319, var9 ^ -1011591220);
            case 209 -> llI(-807797338, var9 ^ -803713883);
            case 210 -> 1;
            case 211 -> llI(-807797337, var9 ^ 852999413);
            case 212 -> llI(-807797340, var9 ^ -514955332);
            case 213 -> llI(-807797339, var9 ^ -948731109);
            case 214 -> llI(-807797342, var9 ^ -2143328400);
            case 215 -> llI(-807797341, var9 ^ 1793702838);
            case 216 -> llI(-807797344, var9 ^ 2042726077);
            case 217 -> llI(-807797343, var9 ^ 1247047899);
            case 218 -> llI(-807797330, var9 ^ -208426095);
            case 219 -> llI(-807797329, var9 ^ 603784492);
            case 220 -> llI(-807797332, var9 ^ 1487152484);
            case 221 -> llI(-807797331, var9 ^ 570177786);
            case 222 -> llI(-807797334, var9 ^ -1707962830);
            case 223 -> llI(-807797333, var9 ^ -1190491555);
            case 224 -> llI(-807797336, var9 ^ 141472522);
            case 225 -> llI(-807797335, var9 ^ -156452089);
            case 226 -> llI(-807797354, var9 ^ 681665839);
            case 227 -> llI(-807797353, var9 ^ 1062109246);
            case 228 -> llI(-807797356, var9 ^ 524332744);
            case 229 -> 3;
            case 230 -> llI(-807797355, var9 ^ 537500501);
            case 231 -> llI(-807797358, var9 ^ 1177962468);
            case 232 -> llI(-807797357, var9 ^ 1445522775);
            case 233 -> llI(-807797360, var9 ^ -966259406);
            case 234 -> llI(-807797359, var9 ^ 1595955514);
            case 235 -> llI(-807797346, var9 ^ -1135814558);
            case 236 -> llI(-807797345, var9 ^ -2098485254);
            case 237 -> llI(-807797348, var9 ^ 1640955018);
            case 238 -> llI(-807797347, var9 ^ -1513808719);
            case 239 -> llI(-807797350, var9 ^ 1106076173);
            case 240 -> llI(-807797349, var9 ^ 51028020);
            case 241 -> llI(-807797352, var9 ^ -1957282688);
            case 242 -> llI(-807797351, var9 ^ 1840336039);
            case 243 -> llI(-807797370, var9 ^ 214990017);
            case 244 -> llI(-807797369, var9 ^ -243752191);
            case 245 -> llI(-807797372, var9 ^ -1103705055);
            case 246 -> llI(-807797371, var9 ^ 118923398);
            case 247 -> llI(-807797374, var9 ^ 147471349);
            case 248 -> llI(-807797373, var9 ^ 1005269713);
            case 249 -> llI(-807797376, var9 ^ -2005403231);
            case 250 -> llI(-807797375, var9 ^ -1474041167);
            case 251 -> llI(-807797362, var9 ^ 635895420);
            case 252 -> llI(-807797361, var9 ^ -151788138);
            case 253 -> llI(-807797364, var9 ^ -383093698);
            case 254 -> llI(-807797363, var9 ^ 1887304916);
            default -> llI(-807797366, var9 ^ -1502846616);
         };
         int var5 = (var1 & llI(-807797365, var9 ^ 1599346501)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & llI(-807797368, var9 ^ 375402818)) >>> llI(-807797367, var9 ^ -1654394067)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & llI(-807797642, var9 ^ -303334282);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & llI(-807797641, var9 ^ -1999718796);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }

   @Override
   public void llIl() {
      this.I();
   }

   private void II(int var1) {
      String[] var2 = IIllllIl.IIIIl();
      Iterator var3 = this.ll.entrySet().iterator();

      while (var3.hasNext()) {
         if ((Integer)((Entry)var3.next()).getValue() <= var1) {
            var3.remove();
            if (var2 != null) {
               break;
            }
         }
      }
   }

   private static void Il() {
      int var0 = 843572816;
      III[0] = lII(l(llI(-807797644, var0 ^ -1353105063), llI(-807797643, var0 ^ -1318298792)).toCharArray(), 72510L, llI(-807797646, var0 ^ 1847212739));
      III[1] = lII(l(llI(-807797645, var0 ^ -1253665399), llI(-807797648, var0 ^ 1418985406)).toCharArray(), 37572L, llI(-807797647, var0 ^ -1109201335));
      III[2] = lII(l(llI(-807797634, var0 ^ -978431039), llI(-807797633, var0 ^ -1295002999)).toCharArray(), 51441L, llI(-807797636, var0 ^ 1943883236));
      III[3] = lII(l(llI(-807797635, var0 ^ 1375711833), llI(-807797638, var0 ^ 1403293886)).toCharArray(), 92390L, llI(-807797637, var0 ^ 891331323));
   }

   private static String lll(short var0, int var1, int var2, byte var3, short var4, short var5) {
      int var10 = var2 ^ -1735142417;
      char[] var9 = lll[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])IIII[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         IIII[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 7971;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 12) {
            default -> 73;
            case 1 -> 98;
            case 2 -> 95;
            case 3 -> 24;
            case 4 -> 124;
            case 5 -> 62;
            case 6 -> 192;
            case 7 -> 188;
            case 8 -> 209;
            case 9 -> 46;
            case 10 -> 7;
            case 11 -> 231;
         } ^ var7 ^ var0 ^ var2 ^ var3 ^ var5 ^ var4 ^ var1);
      }

      return new String(var9).intern();
   }

   public IIllIlIlI() {
      super(IlIIllIII.Ill(III[0]), lllIIlIl.III, IlIIllIII.Ill(III[1]));
      this.lI = this.IllIIll(new IIlIII(IlIIllIII.Ill(III[2]), 1.15, 0.5, 2.5, 0.05).IlII(IlIIllIII.lI(III[3])));
      this.ll = new HashMap<>();
   }

   private double lI(class_243 var1, class_243 var2, class_243 var3) {
      class_243 var4 = var3.method_1020(var2);
      double var5 = var4.method_1027();
      if (var5 <= 1.0E-8) {
         return var1.method_1025(var2);
      } else {
         double var7 = var1.method_1020(var2).method_1026(var4) / var5;
         var7 = Math.max(0.0, Math.min(1.0, var7));
         return var1.method_1025(var2.method_1019(var4.method_1021(var7)));
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1252250952;
      String[] var10001 = new String[2];
      short var12 = 6010;
      int var11 = 0;
      String[] var9 = var10001;
      int var22 = "\u001d虳湝鿯妒뵗쵐ᛸヲ⟒繾鴽\u0d80\udbf4৺鎴\udf1cﯣᣐ㗂\udacfნ横\ue8e0ꅩⴅ䫵黚麤瞵iī౨䍊閆욥株Ԩ᱆﨩䣴ᶶ涅ٳ\ueb34붟ꑢ栬닚ᛦ邮쮕옷쩠핲볆\udb3c裇\uda33脺⧟\udfab솈쨞≘\uf520袁ဓ豻\uefba\ueead\ue835쉧Ꝣᶊ\uef79뀝귌ᲃ\udd67똧썵\udffa뼹ﱉꚄ厣\ud993妊伭ꚜ荏꿓辀鵜㏜ᑬꓻ폛鈰퇠웞㭋縃욙糯鱗\uaa5aꁍꭋ㏈栐꿖\ue4be㌳ी厕䓞験䵯둎\uea6d\ue4e2휁벼蘕闈\uf7a1㠢鰢嚈絹早倴⭮ܥ"
         .length();
      int var10 = 0;
      int var8 = var22;
      String var7 = "\u001d虳湝鿯妒뵗쵐ᛸヲ⟒繾鴽\u0d80\udbf4৺鎴\udf1cﯣᣐ㗂\udacfნ横\ue8e0ꅩⴅ䫵黚麤瞵iī౨䍊閆욥株Ԩ᱆﨩䣴ᶶ涅ٳ\ueb34붟ꑢ栬닚ᛦ邮쮕옷쩠핲볆\udb3c裇\uda33脺⧟\udfab솈쨞≘\uf520袁ဓ豻\uefba\ueead\ue835쉧Ꝣᶊ\uef79뀝귌ᲃ\udd67똧썵\udffa뼹ﱉꚄ厣\ud993妊伭ꚜ荏꿓辀鵜㏜ᑬꓻ폛鈰퇠웞㭋縃욙糯鱗\uaa5aꁍꭋ㏈栐꿖\ue4be㌳ी厕䓞験䵯둎\uea6d\ue4e2휁벼蘕闈\uf7a1㠢鰢嚈絹早倴⭮ܥ";

      do {
         char var13 = var7.charAt(var11);
         int var23 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var23, var10002).toCharArray();

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

      lll = var9;
      IIII = new Object[var9.length];
      int var10000 = 0;
      byte var24 = 0;
      llI = new int[284];
      byte[] var34 = "\u009d;\u0001g;\u0095\u000e¬%tn¼¢'·\u0082%OlKd\u0015-\t\u0011¿$0\u009dª\\\u0019\u0007t? @aRÊ\u008a\u0015g\u0007'®$LVÐMâÃqFñc\u009bs\u0086å\u0098-t¦\u0015ë\t\u0007èQ\u0082)¿ÎY\u0081è]¦\u0087K¬-6ºg\u0092ã=»pM:³²}I\u0000¸\u008còðu\u0094\u0089Q\u0016\u001bÐZ\u001fu¹\u0085Ü\u0012ÁÝ-¨\u009b\u0086>Äs\u0005<¨p\u0081éÉæ\u0007\u0083\"ì\u001eÕ[\u008cêÓ\u00125\u0099>ÖÎ[¡.ô\u0097I HC©[\u001aÒ\u0095f5\u0014¯hPelr\u0016¬\u0002TÛü\u008a\u0012f\u0001\u007f¾\"¸o\u009c<0Á\u001dV³«p¼¹\u000b\u0085\u0088c&ÌÜ\b\u0014UVQl:8k\u0082Ò÷¶u+xB\u0015Iö,ÚM\u0087ÕÅ¨ºO\u001czØõ¥Ç\u008d8ëþÎÄ³I§\f\u0018Ñ_\u00977Ä*\r5\u0093\u00ad¤\u001ajztýàµ\u008cyEh\u0087!æÝÎä\u001có\u009aH\u009e\u0000¥yð@Ö,%\u0015ØÏéõ\u001f\u0015å\u0086$çWY¹»&µq\u0000ã\u0094&é\u0082\u0013\u0003\u0082~=Ó¤å?@e±\u0091\u008bÈe¸ò\u0097¿¹p\r'Ç\u0012ë-Nf-\n\u0097y8-<©¨OÜ:\u0003@³Æª\bj\u0001©u7LÞ§\u001e\u0098\u0006/ {Å´6\u0016\u0001È`¹¸óì\u0016t\n\u009c\u00ad\u001aHbÁ\u001bÑ¡\u0096êâ\u0081pX\u000e¸¨Q\tù\u001d¥íøÑ\u0018nÍ-6>áG9$GÁ\u0006y¤Ä*\u0016`\fd\u0090\u008c\u0097\u0015\u008e\u008a\u0091OÃR{9;\u0012BVûè\u008cwù*VâýR*ù¸ aFd¨\u0087Rã\u0082\u000fÏ\u0006\u0014¬»\u008aÙè¡\u007f®d\u008a\u008d\u0007#í\u008eüi&\u000f¼\u008boTçÎ=× 1e\u0083\u008d¸É5öýõÕY¯ÿËX\u009b\u0002È\u009b\u0017ü»\u0087gÈ],C\\Mdó;\b\u0081Ãï±wßã\u007fÙ=¥\u0080Að92£°\u0013\u0089Ï^¹çD|ö\u001b¬ñb\u0014å^wZ=\u001d°,0nØÜël\u0010Ñ|Ì\u0090\u0006\u0006P\u0013[\rH¼\u009d\u000bqo{}W\u0012ï²\u0014¸\u0082ÐL\n¼×¸ò«\u009c\u0004À©\u00adk\u0083Ù\u0089\u0095\u0081OC\u0013\u0080\u0086s\u009ccÚ\u008e\\v¾-Z=ù\fäqî\u0081¹¼NEz\u0010\u0082þÔ\u0081i\u0001¨Ú\u0087\u008c°ä¼åwÙ\f\u0006\u001fð]¥oùi\u0094\u0001êÄ\u00911^±\u0002\u0002\u0081\u0012ÌíS\u00021¯ÒµRlYI¨¤9\u0098\u0081X\u0093\u0094lÞÑ*<\u008a¡In÷S\b\u008b§xµ¤\u0005¹i\u008fMå+~(¿Àç\u000f\u009bá\u009b\u0012¿ßëE\bz\u0099\u0013gY\u000e:NOS¸©6f\u008b\r%Ñ\u0011\u0094>\n¬¶\"\u0088\\\u000fñ¥F)\t÷¢ò?iQ¤óÂwrZÍ¡1jLÊ\u000e±:ã\u0004NÌ\u007f¼xx[Ô¸~Z\u001fð]À#ãñÚ!\u0001>*~Ò§ðFô\u009a\u0014\u001d³ÖðSY\u0000-ãJ(\u0010ÿy½æqÀz<\u0099\u0010\u0014\u0092\u000ekM³Ê\u0012\u0015®°©Û\u0018¿\u008aã\u001cÅ;\u0087%¦ÅE,ö\u001bHóV\f§\u0016f,©9õ\u0013à\r+ußÐïeÁz@õ\u0081\u009aêlÉÎ'\u008f¥NÆ±\u00020<R'k\u009d\u0096,\u008b¾r\u0004ô\u00900ã7>¸¿ª\u0017^XÛG?9ê\u0090Â\u00915°\u008dß[14ÿ7¤;#\u00ad°\b\u0002¥¬»\u009enH\u009bÊ|Ø\u0016\u000fh\u0006Å\u001ar¶ÚÃãÚC\u0094jF\u0095\u0085ögl½\u00818%\u0088X<®\u008aeÛÞ\u0002ëö»'!õz\u0006c×\u009bÌ8\n\u0096¦º;`\u0019·\u0001\u0081Ì±§0\u0012V8\u0010ñqC\u0098o 1¿a\u001e°\u0084 \u0090Ýy\u0005'pÛà%\u00adÅ\u0012¦¿È\u008bä\u000e¶×\u008a*Y\u009eK»\u0091\u008a\u009b6\r\u0086\b±4j4ÞH\u008eHü\u0017\n±õ2\u0085·F[\u0092ë\u0019d:@±;ÓÂË>°ú\u0089"
         .getBytes("ISO-8859-1");

      int var56;
      do {
         llI[var10000] = ((var34[var24] & 255) << 24 | (var34[var24 + 1] & 255) << 16 | (var34[var24 + 2] & 255) << 8 | var34[var24 + 3] & 255) ^ 683764268;
         var10000 += 1;
         var56 = var24 + 4;
         var24 += 4;
      } while (var56 < var34.length);

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lll(25663, -1029968944, -1735142417, 80, (short)-8867, 31787)).length();
      int var1 = 4;
      int var19 = -1;

      label92:
      while (true) {
         var10000 = llI(-807797640, var17 ^ 1755934668);
         String var27 = var2.substring(++var19, var19 + var1);
         byte var40 = -1;

         while (true) {
            label87: {
               char[] var58 = var27.toCharArray();
               int var70 = var58.length;
               int var6 = 0;
               var56 = var10000;
               var45 = var58;
               int var32 = var70;
               char[] var82;
               int var89;
               if (var70 <= 1) {
                  var82 = var58;
                  var70 = var10000;
                  var89 = var6;
               } else {
                  var56 = var10000;
                  var32 = var70;
                  if (var70 <= var6) {
                     break label87;
                  }

                  var82 = var58;
                  var70 = var10000;
                  var89 = var6;
               }

               while (true) {
                  var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % llI(-807797657, var17 ^ -198868027)) {
                     case 0 -> llI(-807797660, var17 ^ 1009865355);
                     case 1 -> llI(-807797659, var17 ^ -1606565710);
                     case 2 -> llI(-807797662, var17 ^ -1714291281);
                     case 3 -> llI(-807797661, var17 ^ -449478235);
                     case 4 -> llI(-807797664, var17 ^ -1162774371);
                     case 5 -> llI(-807797663, var17 ^ -1623294086);
                     default -> llI(-807797650, var17 ^ -165076188);
                  });
                  var6++;
                  if (var56 == 0) {
                     var89 = var56;
                     var82 = var45;
                     var70 = var56;
                  } else {
                     if (var32 <= var6) {
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
                     lII = var5;
                     Il = new String[4];
                     III = new String[4];
                     Il();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var63;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label92;
                  }

                  var4 = (var2 = lll((short)-10328, -708624364, -1735142418, 23, (short)-17524, (short)-2988)).length();
                  var1 = llI(-807797639, var17 ^ 1697656155);
                  var19 = -1;
            }

            var10000 = llI(-807797658, var17 ^ 460079626);
            var27 = var2.substring(++var19, var19 + var1);
            var40 = 0;
         }
      }
   }

   private boolean ll(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1690 != null
         && var1.field_1755 == null
         && var1.field_1724.method_5805()
         && !var1.field_1724.method_31549().field_7479
         && !var1.field_1724.method_5799()
         && !var1.field_1724.method_5869()
         && !var1.field_1724.method_5771()
         && !var1.field_1724.method_6101();
   }

   private class_8956 III(class_310 var1) {
      double var3 = this.lI.IllI();
      double var5 = var3 * var3;
      String[] var10000 = IIllllIl.IIIIl();
      class_746 var7 = var1.field_1724;
      class_243 var8 = new class_243(var7.method_23317(), var7.method_23318() + 0.05, var7.method_23321());
      class_8956 var9 = null;
      String[] var2 = var10000;
      double var10 = Double.MAX_VALUE;

      for (class_1297 var13 : var1.field_1687.method_18112()) {
         if (var13 instanceof class_8956 var14 && !var14.method_31481() && var14.method_5805() && !this.ll.containsKey(var14.method_5628())) {
            double var15 = Math.min(var14.method_23318(), var14.method_23318() + var14.method_18798().field_1351);
            double var17 = Math.max(var14.method_23318(), var14.method_23318() + var14.method_18798().field_1351);
            if (!(var15 > var7.method_23318() + 1.35) && !(var17 < var7.method_23318() - 0.65)) {
               class_243 var19 = new class_243(var14.method_23317(), var14.method_23318(), var14.method_23321());
               class_243 var20 = var19.method_1019(var14.method_18798());
               double var21 = this.lI(var8, var19, var20);
               if (var21 <= var5 && var21 < var10) {
                  var10 = var21;
                  var9 = var14;
               }

               if (var2 != null) {
                  break;
               }
            }
         }
      }

      return var9;
   }

   private void IIl(class_746 var1) {
      ((lIlIlllI)var1).ilovcats$setJumpingCooldown(0);
   }

   public boolean Ill(class_310 var1) {
      if (this.IIIIlIl() && this.ll(var1) && var1.field_1724.method_24828()) {
         this.lIl(var1);
         this.II(var1.field_1724.field_6012);
         if (this.I > 0) {
            this.I--;
            this.IIl(var1.field_1724);
            return true;
         } else {
            class_8956 var2 = this.III(var1);
            if (var2 == null) {
               return false;
            } else {
               this.ll.put(var2.method_5628(), var1.field_1724.field_6012 + llI(-807797649, -1707395289 ^ 421096131));
               this.I = 1;
               this.IIl(var1.field_1724);
               return true;
            }
         }
      } else {
         this.I = 0;
         return false;
      }
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (!this.ll(var1)) {
         this.I();
      } else {
         this.lIl(var1);
         this.II(var1.field_1724.field_6012);
      }
   }

   private static int llI(int var0, int var1) {
      int var2 = llI[var0 ^ -807797386] ^ var1 ^ var0;
      var2 ^= 45414;
      var2 ^= 47704;
      var2 += 36568;
      var2 += 46239;
      var2 -= 49897;
      var2 -= 9810;
      var2 ^= 51901;
      return var2 - 4283;
   }

   private static String lII(char[] var0, long var1, int var3) {
      int var4 = llI(-807797652, -721662007 ^ 151638094) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & llI(-807797651, -721662007 ^ 223652084);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private void lIl(class_310 var1) {
      if (this.lIl != var1.field_1687) {
         this.lIl = var1.field_1687;
         this.ll.clear();
         this.I = 0;
      }
   }
}
