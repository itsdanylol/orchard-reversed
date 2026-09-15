package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
public final class lIlIlI extends IlIIIIIIl {
   private final IllIII<IlllllII> I;
   private static final Object[] Ill;
   private static final String[] II;
   private static String[] Il;
   private static final String[] lI;
   private static final int[] IIl;
   private final IIlIII ll;
   private static final String[] IlI;
   private final lllIIlII III;

   private static int Ill(int var0, int var1) {
      int var2 = IIl[var0 ^ 172393242] ^ var1 ^ var0;
      var2 += 7157;
      var2 += 49909;
      var2 -= 48632;
      var2 -= 34892;
      var2 += 41513;
      var2 -= 12056;
      var2 ^= 49088;
      return var2 ^ 44849;
   }

   private static String lII(int var0, int var1) {
      int var3 = var0 ^ 103185906;
      char[] var4 = IlI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])Ill[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         Ill[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1570860770;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 202;
            case 1 -> 118;
            case 2 -> 177;
            case 3 -> 191;
            case 4 -> 80;
            case 5 -> 221;
            case 6 -> 143;
            case 7 -> 1;
            case 8 -> 75;
            case 9 -> 53;
            case 10 -> 207;
            case 11 -> 194;
            case 12 -> 57;
            case 13 -> 69;
            case 14 -> 94;
            case 15 -> 151;
            case 16 -> 231;
            case 17 -> 100;
            case 18 -> 24;
            case 19 -> 93;
            case 20 -> 252;
            case 21 -> 148;
            case 22 -> 79;
            case 23 -> 69;
            case 24 -> 217;
            case 25 -> 150;
            case 26 -> 215;
            case 27 -> 242;
            case 28 -> 102;
            case 29 -> 0;
            case 30 -> 156;
            case 31 -> 40;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static MatchException I(MatchException var0) {
      return var0;
   }

   public boolean l(class_1657 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/lIlIlI.IIIIlIl ()Z
      // 04: ifeq 1e
      // 07: aload 0
      // 08: aload 1
      // 09: invokevirtual k74/x/lIlIlI.IIl (Lnet/minecraft/class_1657;)Z
      // 0c: ifeq 1e
      // 0f: goto 16
      // 12: invokestatic k74/x/lIlIlI.I (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15: athrow
      // 16: bipush 1
      // 17: goto 1f
      // 1a: invokestatic k74/x/lIlIlI.I (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1d: athrow
      // 1e: bipush 0
      // 1f: ireturn
   }

   private static String II(int var0, int var1) {
      int var9 = -878590945;
      int var2 = (var0 ^ Ill(172393242, var9 ^ -829061254)) & Ill(172393243, var9 ^ -833314405);
      if (II[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & Ill(172393240, var9 ^ 692332024)) {
            case 0 -> Ill(172393241, var9 ^ 1816588455);
            case 1 -> Ill(172393246, var9 ^ 2139574971);
            case 2 -> Ill(172393247, var9 ^ 944248054);
            case 3 -> Ill(172393244, var9 ^ -306497452);
            case 4 -> Ill(172393245, var9 ^ 1732138736);
            case 5 -> Ill(172393234, var9 ^ 1529637642);
            case 6 -> Ill(172393235, var9 ^ -1824420301);
            case 7 -> Ill(172393232, var9 ^ 2040045844);
            case 8 -> Ill(172393233, var9 ^ -1980202899);
            case 9 -> Ill(172393238, var9 ^ 25697297);
            case 10 -> Ill(172393239, var9 ^ -718491697);
            case 11 -> Ill(172393236, var9 ^ 1523606561);
            case 12 -> Ill(172393237, var9 ^ 2077575978);
            case 13 -> Ill(172393226, var9 ^ 1236482795);
            case 14 -> Ill(172393227, var9 ^ -334227279);
            case 15 -> Ill(172393224, var9 ^ -806665217);
            case 16 -> Ill(172393225, var9 ^ 2123171514);
            case 17 -> Ill(172393230, var9 ^ -1474683394);
            case 18 -> Ill(172393231, var9 ^ -1485069081);
            case 19 -> Ill(172393228, var9 ^ -210248549);
            case 20 -> Ill(172393229, var9 ^ -1582179085);
            case 21 -> Ill(172393218, var9 ^ -1897261522);
            case 22 -> Ill(172393219, var9 ^ -1034909124);
            case 23 -> Ill(172393216, var9 ^ -1991967586);
            case 24 -> Ill(172393217, var9 ^ -1565850579);
            case 25 -> Ill(172393222, var9 ^ -426875214);
            case 26 -> Ill(172393223, var9 ^ -921502396);
            case 27 -> Ill(172393220, var9 ^ -414625631);
            case 28 -> 0;
            case 29 -> Ill(172393221, var9 ^ 392307206);
            case 30 -> Ill(172393274, var9 ^ -179988808);
            case 31 -> Ill(172393275, var9 ^ 1570531659);
            case 32 -> Ill(172393272, var9 ^ -469231184);
            case 33 -> Ill(172393273, var9 ^ -1213025317);
            case 34 -> Ill(172393278, var9 ^ -1954048963);
            case 35 -> Ill(172393279, var9 ^ -2039441532);
            case 36 -> Ill(172393276, var9 ^ 954292479);
            case 37 -> Ill(172393277, var9 ^ -652531336);
            case 38 -> Ill(172393266, var9 ^ 972084029);
            case 39 -> Ill(172393267, var9 ^ 469246541);
            case 40 -> Ill(172393264, var9 ^ 1687059125);
            case 41 -> Ill(172393265, var9 ^ -649173218);
            case 42 -> Ill(172393270, var9 ^ -2013425228);
            case 43 -> Ill(172393271, var9 ^ 760240599);
            case 44 -> Ill(172393268, var9 ^ 28425847);
            case 45 -> Ill(172393269, var9 ^ -680797090);
            case 46 -> Ill(172393258, var9 ^ 757546492);
            case 47 -> Ill(172393259, var9 ^ -154778168);
            case 48 -> Ill(172393256, var9 ^ -2035789361);
            case 49 -> 2;
            case 50 -> Ill(172393257, var9 ^ -1131653329);
            case 51 -> Ill(172393262, var9 ^ 1968303714);
            case 52 -> Ill(172393263, var9 ^ 552607325);
            case 53 -> Ill(172393260, var9 ^ -1140782842);
            case 54 -> Ill(172393261, var9 ^ -189354592);
            case 55 -> Ill(172393250, var9 ^ 1334866956);
            case 56 -> Ill(172393251, var9 ^ 1689020017);
            case 57 -> Ill(172393248, var9 ^ 110523962);
            case 58 -> Ill(172393249, var9 ^ -1060807061);
            case 59 -> Ill(172393254, var9 ^ -1670932361);
            case 60 -> Ill(172393255, var9 ^ -114225645);
            case 61 -> Ill(172393252, var9 ^ -894659533);
            case 62 -> Ill(172393253, var9 ^ 1792478497);
            case 63 -> Ill(172393306, var9 ^ -262132134);
            case 64 -> Ill(172393307, var9 ^ 1500504548);
            case 65 -> Ill(172393304, var9 ^ 756582226);
            case 66 -> Ill(172393305, var9 ^ -1748020721);
            case 67 -> Ill(172393310, var9 ^ 914162578);
            case 68 -> Ill(172393311, var9 ^ 501138506);
            case 69 -> Ill(172393308, var9 ^ -2035103970);
            case 70 -> Ill(172393309, var9 ^ 693735623);
            case 71 -> Ill(172393298, var9 ^ -1039667070);
            case 72 -> Ill(172393299, var9 ^ 435096134);
            case 73 -> Ill(172393296, var9 ^ -680830618);
            case 74 -> Ill(172393297, var9 ^ -1269196546);
            case 75 -> Ill(172393302, var9 ^ -380553067);
            case 76 -> Ill(172393303, var9 ^ 2011337567);
            case 77 -> Ill(172393300, var9 ^ -230358904);
            case 78 -> Ill(172393301, var9 ^ -625494455);
            case 79 -> Ill(172393290, var9 ^ 668116002);
            case 80 -> Ill(172393291, var9 ^ 1041426068);
            case 81 -> Ill(172393288, var9 ^ 1227778936);
            case 82 -> 3;
            case 83 -> Ill(172393289, var9 ^ -1253401614);
            case 84 -> Ill(172393294, var9 ^ 2050353373);
            case 85 -> Ill(172393295, var9 ^ 1380981449);
            case 86 -> Ill(172393292, var9 ^ 682261580);
            case 87 -> Ill(172393293, var9 ^ 1101565918);
            case 88 -> Ill(172393282, var9 ^ -1527264150);
            case 89 -> Ill(172393283, var9 ^ 2077017853);
            case 90 -> Ill(172393280, var9 ^ -505992588);
            case 91 -> Ill(172393281, var9 ^ 323673374);
            case 92 -> Ill(172393286, var9 ^ 1660456218);
            case 93 -> Ill(172393287, var9 ^ 402416);
            case 94 -> Ill(172393284, var9 ^ -1802625023);
            case 95 -> Ill(172393285, var9 ^ -856485087);
            case 96 -> Ill(172393338, var9 ^ -1458921715);
            case 97 -> Ill(172393339, var9 ^ -686453722);
            case 98 -> Ill(172393336, var9 ^ 1388872202);
            case 99 -> Ill(172393337, var9 ^ 1385434207);
            case 100 -> Ill(172393342, var9 ^ 95451926);
            case 101 -> Ill(172393343, var9 ^ -739232614);
            case 102 -> 1;
            case 103 -> Ill(172393340, var9 ^ -1573178971);
            case 104 -> Ill(172393341, var9 ^ -23265566);
            case 105 -> Ill(172393330, var9 ^ 2127065852);
            case 106 -> Ill(172393331, var9 ^ 267937793);
            case 107 -> Ill(172393328, var9 ^ -515568873);
            case 108 -> 4;
            case 109 -> Ill(172393329, var9 ^ -120293983);
            case 110 -> Ill(172393334, var9 ^ 1465913045);
            case 111 -> Ill(172393335, var9 ^ -1096735483);
            case 112 -> Ill(172393332, var9 ^ 1718676986);
            case 113 -> Ill(172393333, var9 ^ 1825090122);
            case 114 -> Ill(172393322, var9 ^ 158116929);
            case 115 -> Ill(172393323, var9 ^ -6162094);
            case 116 -> Ill(172393320, var9 ^ 138769266);
            case 117 -> Ill(172393321, var9 ^ 48771926);
            case 118 -> Ill(172393326, var9 ^ -1506305168);
            case 119 -> Ill(172393327, var9 ^ 399831878);
            case 120 -> Ill(172393324, var9 ^ -446080213);
            case 121 -> Ill(172393325, var9 ^ -304597744);
            case 122 -> Ill(172393314, var9 ^ 708812332);
            case 123 -> Ill(172393315, var9 ^ 1289990586);
            case 124 -> Ill(172393312, var9 ^ 429675708);
            case 125 -> Ill(172393313, var9 ^ -1680191744);
            case 126 -> Ill(172393318, var9 ^ -1229706413);
            case 127 -> Ill(172393319, var9 ^ 587080279);
            case 128 -> Ill(172393316, var9 ^ 356522599);
            case 129 -> Ill(172393317, var9 ^ 1079296442);
            case 130 -> Ill(172393370, var9 ^ -408582259);
            case 131 -> Ill(172393371, var9 ^ -1908374564);
            case 132 -> Ill(172393368, var9 ^ -1626728525);
            case 133 -> Ill(172393369, var9 ^ 27454240);
            case 134 -> Ill(172393374, var9 ^ 591177062);
            case 135 -> Ill(172393375, var9 ^ 158900325);
            case 136 -> Ill(172393372, var9 ^ -7655526);
            case 137 -> Ill(172393373, var9 ^ -1954673413);
            case 138 -> Ill(172393362, var9 ^ 1276590044);
            case 139 -> Ill(172393363, var9 ^ -2100819251);
            case 140 -> Ill(172393360, var9 ^ 355961495);
            case 141 -> Ill(172393361, var9 ^ 1732491261);
            case 142 -> Ill(172393366, var9 ^ -831273467);
            case 143 -> Ill(172393367, var9 ^ -415116907);
            case 144 -> Ill(172393364, var9 ^ -139714447);
            case 145 -> Ill(172393365, var9 ^ 1647526422);
            case 146 -> Ill(172393354, var9 ^ -2066343335);
            case 147 -> Ill(172393355, var9 ^ -1967201592);
            case 148 -> Ill(172393352, var9 ^ 391273789);
            case 149 -> Ill(172393353, var9 ^ -1235001792);
            case 150 -> Ill(172393358, var9 ^ -166444065);
            case 151 -> Ill(172393359, var9 ^ -230389203);
            case 152 -> Ill(172393356, var9 ^ 872314914);
            case 153 -> Ill(172393357, var9 ^ 1844932841);
            case 154 -> Ill(172393346, var9 ^ 1549748921);
            case 155 -> Ill(172393347, var9 ^ 760419893);
            case 156 -> Ill(172393344, var9 ^ 1101101562);
            case 157 -> Ill(172393345, var9 ^ -478045096);
            case 158 -> Ill(172393350, var9 ^ -474188320);
            case 159 -> Ill(172393351, var9 ^ -1239542974);
            case 160 -> Ill(172393348, var9 ^ -822705606);
            case 161 -> Ill(172393349, var9 ^ 1919691779);
            case 162 -> Ill(172393402, var9 ^ 883157019);
            case 163 -> Ill(172393403, var9 ^ -4754647);
            case 164 -> Ill(172393400, var9 ^ -408599899);
            case 165 -> Ill(172393401, var9 ^ 1801090058);
            case 166 -> Ill(172393406, var9 ^ 1624922956);
            case 167 -> Ill(172393407, var9 ^ -887677237);
            case 168 -> Ill(172393404, var9 ^ 2103785587);
            case 169 -> Ill(172393405, var9 ^ 430840495);
            case 170 -> Ill(172393394, var9 ^ -1098955035);
            case 171 -> Ill(172393395, var9 ^ 879722622);
            case 172 -> Ill(172393392, var9 ^ 1289195178);
            case 173 -> Ill(172393393, var9 ^ 1380169982);
            case 174 -> Ill(172393398, var9 ^ 904559028);
            case 175 -> Ill(172393399, var9 ^ -1359941465);
            case 176 -> Ill(172393396, var9 ^ 2144420578);
            case 177 -> Ill(172393397, var9 ^ -286448954);
            case 178 -> Ill(172393386, var9 ^ -1900523925);
            case 179 -> Ill(172393387, var9 ^ -247571017);
            case 180 -> Ill(172393384, var9 ^ -1131113132);
            case 181 -> Ill(172393385, var9 ^ 1820445895);
            case 182 -> Ill(172393390, var9 ^ -465735646);
            case 183 -> 5;
            case 184 -> Ill(172393391, var9 ^ -912961545);
            case 185 -> Ill(172393388, var9 ^ 1121269055);
            case 186 -> Ill(172393389, var9 ^ 21090894);
            case 187 -> Ill(172393378, var9 ^ 904212580);
            case 188 -> Ill(172393379, var9 ^ 584389666);
            case 189 -> Ill(172393376, var9 ^ -33366571);
            case 190 -> Ill(172393377, var9 ^ 1781841529);
            case 191 -> Ill(172393382, var9 ^ 1841602491);
            case 192 -> Ill(172393383, var9 ^ 1525872862);
            case 193 -> Ill(172393380, var9 ^ 2103833695);
            case 194 -> Ill(172393381, var9 ^ -1027295941);
            case 195 -> Ill(172393434, var9 ^ 1269781479);
            case 196 -> Ill(172393435, var9 ^ 1542351800);
            case 197 -> Ill(172393432, var9 ^ 40379040);
            case 198 -> Ill(172393433, var9 ^ -1748983065);
            case 199 -> Ill(172393438, var9 ^ 696426696);
            case 200 -> Ill(172393439, var9 ^ -1655530876);
            case 201 -> Ill(172393436, var9 ^ -1885239302);
            case 202 -> Ill(172393437, var9 ^ 657444345);
            case 203 -> Ill(172393426, var9 ^ -114863788);
            case 204 -> Ill(172393427, var9 ^ -636115069);
            case 205 -> Ill(172393424, var9 ^ 932333021);
            case 206 -> Ill(172393425, var9 ^ -698432587);
            case 207 -> Ill(172393430, var9 ^ -448386701);
            case 208 -> Ill(172393431, var9 ^ -772521573);
            case 209 -> Ill(172393428, var9 ^ 1843517827);
            case 210 -> Ill(172393429, var9 ^ 1982125743);
            case 211 -> Ill(172393418, var9 ^ -1965353911);
            case 212 -> Ill(172393419, var9 ^ -1256440816);
            case 213 -> Ill(172393416, var9 ^ 1263004341);
            case 214 -> Ill(172393417, var9 ^ 126236209);
            case 215 -> Ill(172393422, var9 ^ -410876125);
            case 216 -> Ill(172393423, var9 ^ -1506680580);
            case 217 -> Ill(172393420, var9 ^ -89839374);
            case 218 -> Ill(172393421, var9 ^ -1865372934);
            case 219 -> Ill(172393410, var9 ^ -1909547201);
            case 220 -> Ill(172393411, var9 ^ 547564825);
            case 221 -> Ill(172393408, var9 ^ -9603465);
            case 222 -> Ill(172393409, var9 ^ -1262055701);
            case 223 -> Ill(172393414, var9 ^ 784009282);
            case 224 -> Ill(172393415, var9 ^ -1393927857);
            case 225 -> Ill(172393412, var9 ^ -1445458041);
            case 226 -> Ill(172393413, var9 ^ -541964587);
            case 227 -> Ill(172393466, var9 ^ 803752586);
            case 228 -> Ill(172393467, var9 ^ -1984830788);
            case 229 -> Ill(172393464, var9 ^ -1546530945);
            case 230 -> Ill(172393465, var9 ^ 644377601);
            case 231 -> Ill(172393470, var9 ^ 1901645926);
            case 232 -> Ill(172393471, var9 ^ 224066719);
            case 233 -> Ill(172393468, var9 ^ 57685331);
            case 234 -> Ill(172393469, var9 ^ -2117687797);
            case 235 -> Ill(172393458, var9 ^ -1792938613);
            case 236 -> Ill(172393459, var9 ^ -787132016);
            case 237 -> Ill(172393456, var9 ^ 1712407336);
            case 238 -> Ill(172393457, var9 ^ -1547263944);
            case 239 -> Ill(172393462, var9 ^ 790928472);
            case 240 -> Ill(172393463, var9 ^ -408372989);
            case 241 -> Ill(172393460, var9 ^ -1836323449);
            case 242 -> Ill(172393461, var9 ^ -690385416);
            case 243 -> Ill(172393450, var9 ^ 1982916977);
            case 244 -> Ill(172393451, var9 ^ -733736981);
            case 245 -> Ill(172393448, var9 ^ -2058976967);
            case 246 -> Ill(172393449, var9 ^ -1214825245);
            case 247 -> Ill(172393454, var9 ^ 1408870837);
            case 248 -> Ill(172393455, var9 ^ -107280385);
            case 249 -> Ill(172393452, var9 ^ -1843755464);
            case 250 -> Ill(172393453, var9 ^ 1014907653);
            case 251 -> Ill(172393442, var9 ^ 489636530);
            case 252 -> Ill(172393443, var9 ^ -1329293260);
            case 253 -> Ill(172393440, var9 ^ -1283338760);
            case 254 -> Ill(172393441, var9 ^ 1032157007);
            default -> Ill(172393446, var9 ^ -1473598389);
         };
         int var5 = (var1 & Ill(172393447, var9 ^ 873188640)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Ill(172393444, var9 ^ -571513015)) >>> Ill(172393445, var9 ^ 1496749855)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Ill(172392986, var9 ^ -1999877393);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Ill(172392987, var9 ^ -1908662084);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }

   public boolean Il(class_1657 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/lIlIlI.IIIIlIl ()Z
      // 04: ifeq 2d
      // 07: aload 0
      // 08: getfield k74/x/lIlIlI.III Lk74/x/lllIIlII;
      // 0b: invokevirtual k74/x/lllIIlII.IllI ()Ljava/lang/Object;
      // 0e: checkcast java/lang/Boolean
      // 11: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 14: ifeq 2d
      // 17: goto 1e
      // 1a: invokestatic k74/x/lIlIlI.I (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1d: athrow
      // 1e: aload 0
      // 1f: aload 1
      // 20: invokevirtual k74/x/lIlIlI.IIl (Lnet/minecraft/class_1657;)Z
      // 23: ifne 33
      // 26: goto 2d
      // 29: invokestatic k74/x/lIlIlI.I (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
      // 2f: invokestatic k74/x/lIlIlI.I (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 32: athrow
      // 33: aload 0
      // 34: getfield k74/x/lIlIlI.I Lk74/x/IllIII;
      // 37: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 3a: checkcast k74/x/IlllllII
      // 3d: invokevirtual k74/x/IlllllII.ordinal ()I
      // 40: tableswitch 28 0 2 42 46 65
      // 5c: new java/lang/MatchException
      // 5f: dup
      // 60: aconst_null
      // 61: aconst_null
      // 62: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 65: athrow
      // 66: invokestatic k74/x/lIlIlI.I (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 69: athrow
      // 6a: bipush 1
      // 6b: goto 85
      // 6e: aload 1
      // 6f: invokevirtual net/minecraft/class_1657.method_24828 ()Z
      // 72: ifne 7d
      // 75: bipush 1
      // 76: goto 85
      // 79: invokestatic k74/x/lIlIlI.I (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7c: athrow
      // 7d: bipush 0
      // 7e: goto 85
      // 81: aload 1
      // 82: invokevirtual net/minecraft/class_1657.method_24828 ()Z
      // 85: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 2119645298;
      char[] var10000 = "j)".toCharArray();
      byte var14 = -1;
      char[] var9 = var10000;
      short var7 = 17821;
      String var8 = "⠫\uf2adᒲ힎뭼\u07b9\uebbd횁\udfc8㈈\uead9ಔ牤\uf050舡踚왕ⷳ唤钲\uead4蒽챣쏔条\uf43a踑鐫朹\uea07眷㜬鎲傗\uf8d7㓫㷸큢\uef76넷ㄾ\udae4ႯⅫธ퇩뗠㩑놦\ueb4eꇬχ\uda6a鐏쨱洐ࣨ緐鐤ぷ瞭쩻췦떓⛏\uf33a줮吧⇟塻ㄧ䡷\udbc6퀢ꊨ秦쐴퓬젇촣Ƿ渘舴ꌶ\uddca䖿嘒\uf123䴀鄰쭡\uec23德ꌭᶴ냮辁Ꭻ샹佛䓿Ю\udceb눮颕॒ꉢ\uf1fc蘼ꢶ\uf32f⾿걲谩㐧褮驍蘾潧\uef14႙灟㉐햂鷘噪䧰ᆎ⾤浘\uf7e2\ufb0c㌨ꂘ\u05c8ꗒ镟᮳़凙䩌ԥ뾔\uf4c5㋷\ue277滝";
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            IlI = var10;
            Ill = new Object[var10.length];
            byte var23 = 0;
            int var10001 = 0;
            byte[] var10002 = "\u008eÝ\u0091Ã\u008e\u001c;Âi\fX¢,\u000e\u008dÄ?Ï.\u0095x\u0000hù\u00adóE\u0096'v+V\u001bd\u0017-Ó\tó¤9ÐÝ\u0016É°ýúAÀa\u007f\u0095dÒ\u0005\u001a\u0098\u0019À;\u009d6ì\tûFè¬\\d\u0085\u008f£>©>Å{TèRa¥ç3Ù1³?¡Ýáù ÊÎ¢j \u0082\u0018÷ÝÉ\f\u0081 âãyw¦Æ\u001a\u0093\u0089Z\u0080\u001b§\u0001-ìW*^Pµ\rëÀ\u001dÔ\u0014ð¤@d\u0010÷úÏøËÏéGÆ8ê5x©$×\u0099SUDy¸®²[°_º$Æ\u0006¯\u0099\u0006\u001a´ÇµìEm\u0018%ÞAùÃÝ\u0097#¡\u001emoAí¶\u008e8\nÆà,\u0003üÄ*f5\u0019\u0092m`¸c¼üIu)´þÑµ\u000fØ\ta$ä\u001b\u0019FÞ\u000bT\u0080\u008d#çÜ/ä\u0001¹yr,\u008aäè\u001f*\u009fpÄ°(SÔ\u0019'\u009cÈmPúá×\u0087/îv5~^]\u0096¹õÆú»si\u0011í3\u0082O\u008dDY§wÐ\u0097#$Mô\u0011åÍ©\u0019E¼7ªî\u0082²\r}\u001f\u009aÿÊ!g\u009aÙã~Z\u009b(\tf\u0016\u008fõ\u0002æc:}\u0094\u009e\u0012\u0018gíhâ\u0001«\u0001àòiä¿±\u0087;\u0084»\u001b¡\u009fWqS\u0002 ë\"°ñO@N^\u0010ÔÆ]\u009a\u008c»oFéBã&\u0097]ñ\u0004\u0012\u0080þH\u0012ÜqXEø\u0006÷\u0093¸H¸âsL8¾Ô\u0083\u0003>\u0080\u000e¼O°\u0015\u0086¡\rv\r¸\u009c\b#\u0017(säþéYo&8\u0091ª,\u0080Ö\u0012I$Ñ\u008b¿é\u0084uH\r\u000f\u000bB Nïæ\u007fæèW\u009c\u008eh¥!'a\u00ad\u0090H\tjwâD\f«Ì¼YÔ)\u0013Û\u00923töüV\u009fb¶_ÏU\bg\u0080\u0000\u001c½æ§íúÆÎ\bÿpßBj\u0089Aê\u0096ÈctØ\u001eI0Ý\u0012¿ÃR`Ë6qÂ\f_JËÂ\u0080w¯U\u007f÷Ò'\u000bÊ\u0001\u008e;»k§\t\u00ad\u0000·ä]\u0006\"{?\u001aÄ\u009eg½Êö\u009f,W\u001a &ö+\"\u009f¶\\>Ð²\f÷Ðs¶\u0005×-¿\r¦\u001c\u00177«m\u001bjä\u0001é\u0005.£Éá\u007f£ô\b<öVn\u0085\u008e¾ÿ32$Qötë\u0095Å¿ÿ\u000eõ§í?|+\u0012\b\u0085 \u0092&Z\u008b_c¦=-DÁYæg\u008fþ7;\u001at'ý\u007f\f\u009fòM\u0012\u000bÅ u¢\u0004Ëî¸\u008d\u0098?\u0099?\u0090®¥_ÅÎð3\u00ad±v jüÜéÙ,É±\u0012¤u\r\"\u0089Ý2\u0010\u0002\u009dHaA\t¯Su\u00adM(b\u009dim¾J ù*|Ã2-\u008cã.\u001aº\u0085&=-\u0089\u0006\u0082\u008cÈ\u001c\u000bç.\u0091\u001b¦\u0016¿B _\u0095×\u0088Þ%iÊÝÀÝ\u001aæMÏéû9gg±+¹o-\u0083\u009a]Ú\u0087wÚ8ö\u0096\u0016¿z¥\u000eTY\u0091¼<©-©¤Í6l«&Ê\u0093i\"õTA\u0016\u000b\u000f\u0097ÁGÎK»§Êú\u008eæy\u009dÃºíU·Ð\u0098×¸Îfâ6`ëPO¿%\n«ô\u008eóBnóuíì¢$õé\u0090rÔ\u009fú;\u0081o 6iÉù\u009f\u0001ã\u0099²Ff \u0011I1\u0010¬¸M\u0012\u0081çC8I«Á\u008eÚöÕi\u0091E\u0091],\u009d&Y>oã\u008eÝ\u0003olá8§àÄNÒÃ\u0090Ð\u0096\u0091ñ\u001a6x\u0095¸\u0094\fs\u0007Å\u000eüd÷ß@\f\u0013±Ô\u0097¹Ó{\u001bÒRû\u000f|6>\u009b]g?©ð\u008cå\u001fóÉ°¡}Í\ntèbÑ\u001etC°\u0085\u009d§ýï\u0019~ë\u00adÈ\u00846·Ît\\å³û\u0089\u001c«ZTÈ\u0018ów¬è\u0004O\u0016ÃXà+Út¶rQ:)òZJÔËlä<\u0004ò]O3V\u0087[\u0002\u008e÷\u0088\u0011\bgþÀqÚeVÚÉû¾¯\u000fj\u0099µ\u0004\u0012³ù\u0005_Ã\"*\u009b\u009c\u0017\u0097T\u0099\u0016\"óÈß\u0087ò`íºØ¿ÌR*\u0082Vã×éÅ~dì\u0001;\u00adW\u0094\u0095©õ\u001eÎfª"
               .getBytes("ISO-8859-1");
            IIl = new int[287];

            int var56;
            do {
               IIl[var23] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -2119221750;
               var23 += 1;
               var56 = var10001 + 4;
               var10001 += 4;
            } while (var56 < var10002.length);

            String[] var5 = new String[5];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lII(103185906, var18 ^ -1421800123)).length();
            int var1 = Ill(172392984, var18 ^ 1178929234);
            int var20 = -1;

            label103:
            while (true) {
               int var24 = Ill(172392985, var18 ^ 1592055265);
               String var28 = var2.substring(++var20, var20 + var1);
               byte var40 = -1;

               while (true) {
                  label98: {
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
                           break label98;
                        }

                        var82 = var58;
                        var70 = var24;
                        var89 = var6;
                     }

                     while (true) {
                        var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % Ill(172392988, var18 ^ 921067888)) {
                           case 0 -> Ill(172392989, var18 ^ 801781449);
                           case 1 -> Ill(172392978, var18 ^ -1534809955);
                           case 2 -> Ill(172392979, var18 ^ -1342942126);
                           case 3 -> Ill(172392976, var18 ^ -1722106506);
                           case 4 -> Ill(172392977, var18 ^ 132370031);
                           case 5 -> Ill(172392982, var18 ^ -1556489334);
                           default -> Ill(172392983, var18 ^ 2068383889);
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
                           lI = var5;
                           II = new String[5];
                           Il = new String[5];
                           ll();
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var63;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label103;
                        }

                        var4 = (var2 = lII(103185907, var18 ^ -1239319566)).length();
                        var1 = Ill(172392990, var18 ^ -313657608);
                        var20 = -1;
                  }

                  var24 = Ill(172392991, var18 ^ 498781779);
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
               short var17 = switch (var16 % 5) {
                  default -> 164;
                  case 1 -> 45;
                  case 2 -> 208;
                  case 3 -> 71;
                  case 4 -> 207;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public lIlIlI() {
      super(IlIIllIII.Ill(Il[1]), lllIIlIl.III, IlIIllIII.Ill(Il[0]));
      this.ll = this.IllIIll(new IIlIII(IlIIllIII.Ill(Il[3]), 0.6, 0.6, 1.0, 0.1));
      this.III = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Il[4]), true));
      this.I = this.IllIIll(new IllIII<>(IlIIllIII.Ill(Il[2]), IlllllII.class, IlllllII.II));
   }

   public double lI() {
      return Math.max(0.6, Math.min(1.0, this.ll.IllI()));
   }

   private static void ll() {
      int var0 = 982543997;
      Il[0] = III(II(Ill(172392980, var0 ^ -1189199077), Ill(172392981, var0 ^ 1063025272)).toCharArray(), 33493L, Ill(172392970, var0 ^ 316241384));
      Il[1] = III(II(Ill(172392971, var0 ^ 511104855), Ill(172392968, var0 ^ 75337499)).toCharArray(), 30615L, Ill(172392969, var0 ^ -1405534502));
      Il[2] = III(II(Ill(172392974, var0 ^ -1823267246), Ill(172392975, var0 ^ -1494296322)).toCharArray(), 6527L, Ill(172392972, var0 ^ 705440734));
      Il[3] = III(II(Ill(172392973, var0 ^ 1862160300), Ill(172392962, var0 ^ 1556297607)).toCharArray(), 91492L, Ill(172392963, var0 ^ 726273061));
      Il[4] = III(II(Ill(172392960, var0 ^ -409310677), Ill(172392961, var0 ^ 1946658675)).toCharArray(), 77512L, Ill(172392966, var0 ^ -1320704159));
   }

   private static String III(char[] var0, long var1, int var3) {
      int var4 = Ill(172392967, 579357968 ^ -2069970966) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & Ill(172392964, 579357968 ^ -1213230109);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private boolean IIl(class_1657 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03: astore 2
      // 04: aload 1
      // 05: ifnull 2a
      // 08: aload 2
      // 09: ifnull 2a
      // 0c: goto 13
      // 0f: invokestatic k74/x/lIlIlI.I (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 12: athrow
      // 13: aload 1
      // 14: aload 2
      // 15: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 18: if_acmpne 2a
      // 1b: goto 22
      // 1e: invokestatic k74/x/lIlIlI.I (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21: athrow
      // 22: bipush 1
      // 23: goto 2b
      // 26: invokestatic k74/x/lIlIlI.I (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 29: athrow
      // 2a: bipush 0
      // 2b: ireturn
   }
}
