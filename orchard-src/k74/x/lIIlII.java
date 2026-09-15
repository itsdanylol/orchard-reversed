package k74.x;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class lIIlII {
   private static final String I;
   private static String[] l;
   private static final Object[] Ill;
   private static final String[] II;
   private static volatile boolean Il;
   private static final String[] lI;
   private static final int[] IIl;
   private static final String[] IlI;
   private static final String ll;
   private static final String III;

   private static ReflectiveOperationException I(ReflectiveOperationException var0) {
      return var0;
   }

   private static synchronized void l() throws ReflectiveOperationException {
      try {
         if (Il) {
            return;
         }
      } catch (ReflectiveOperationException var5) {
         throw I(var5);
      }

      Class var0 = Class.forName(III);
      Object var1 = var0.getField(IlIIllIII.lI(l[IIl(99304593, 2145719231 ^ -1065718831)])).get(null);
      Class var2 = Class.forName(I);
      Method var3 = II(var1.getClass());
      Object var4 = Proxy.newProxyInstance(var2.getClassLoader(), new Class[]{var2}, new IIlIlIIII());
      var3.invoke(var1, var4);
      Il = true;
   }

   private static String IlI(byte var0, short var1, short var2, int var3, short var4, int var5) {
      int var10 = var5 ^ -1073730210;
      char[] var9 = IlI[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])Ill[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         Ill[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 50942;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ var8 ^ 28538 ^ switch (var8 % 13) {
            default -> 114;
            case 1 -> 60;
            case 2 -> 71;
            case 3 -> 85;
            case 4 -> 27;
            case 5 -> 72;
            case 6 -> 12;
            case 7 -> 224;
            case 8 -> 175;
            case 9 -> 53;
            case 10 -> 245;
            case 11 -> 246;
            case 12 -> 62;
         } ^ var4 ^ var3 ^ var1 ^ var2 ^ var7 ^ var5 ^ var0);
      }

      return new String(var9).intern();
   }

   private static int IIl(int var0, int var1) {
      int var2 = IIl[var0 ^ 99304593] ^ var1 ^ var0;
      var2 += 37323;
      var2 ^= 6661;
      var2 += 58924;
      var2 ^= 6493;
      var2 += 19091;
      var2 ^= 42016;
      return var2 - 44323;
   }

   private static Method II(Class<?> param0) throws NoSuchMethodException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual java/lang/Class.getMethods ()[Ljava/lang/reflect/Method;
      // 04: astore 2
      // 05: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 08: aload 2
      // 09: arraylength
      // 0a: istore 3
      // 0b: bipush 0
      // 0c: istore 4
      // 0e: astore 1
      // 0f: iload 4
      // 11: iload 3
      // 12: if_icmpge 52
      // 15: aload 2
      // 16: iload 4
      // 18: aaload
      // 19: astore 5
      // 1b: aload 5
      // 1d: invokevirtual java/lang/reflect/Method.getName ()Ljava/lang/String;
      // 20: getstatic k74/x/lIIlII.l [Ljava/lang/String;
      // 23: bipush 5
      // 24: aaload
      // 25: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 28: invokevirtual java/lang/String.equals (Ljava/lang/Object;)Z
      // 2b: ifeq 4b
      // 2e: aload 5
      // 30: invokevirtual java/lang/reflect/Method.getParameterCount ()I
      // 33: bipush 1
      // 34: if_icmpne 4b
      // 37: goto 3e
      // 3a: invokestatic k74/x/lIIlII.I (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 3d: athrow
      // 3e: aload 5
      // 40: bipush 1
      // 41: invokevirtual java/lang/reflect/Method.setAccessible (Z)V
      // 44: aload 5
      // 46: areturn
      // 47: invokestatic k74/x/lIIlII.I (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 4a: athrow
      // 4b: iinc 4 1
      // 4e: aload 1
      // 4f: ifnull 0f
      // 52: new java/lang/NoSuchMethodException
      // 55: dup
      // 56: getstatic k74/x/lIIlII.l [Ljava/lang/String;
      // 59: bipush 5
      // 5a: aaload
      // 5b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 5e: invokespecial java/lang/NoSuchMethodException.<init> (Ljava/lang/String;)V
      // 61: athrow
   }

   public void Il(IlIllIllI var1) {
      try {
         if (var1 == null) {
            return;
         }
      } catch (ReflectiveOperationException var8) {
         throw I(var8);
      }

      try {
         l();
         Class var2 = Class.forName(III);
         Object var3 = var2.getField(IlIIllIII.lI(l[0])).get(null);
         Class var4 = Class.forName(ll);
         Method var5 = II(var3.getClass());
         Object var6 = Proxy.newProxyInstance(var4.getClassLoader(), new Class[]{var4}, new lIIIIl(var1));
         var5.invoke(var3, var6);
      } catch (ReflectiveOperationException var7) {
         throw new RuntimeException(IlIIllIII.lI(l[1]), var7);
      }
   }

   private static void lI() {
      int var0 = -1516954593;
      l[0] = III(ll(IIl(99304606, var0 ^ 418890384), IIl(99304577, var0 ^ 462741173)).toCharArray(), 47451L, IIl(99304576, var0 ^ 115824698));
      l[1] = III(ll(IIl(99304579, var0 ^ 1171630653), IIl(99304578, var0 ^ -1321301720)).toCharArray(), 77829L, IIl(99304581, var0 ^ 1843809186));
      l[2] = III(ll(IIl(99304580, var0 ^ 953353141), IIl(99304583, var0 ^ -1756746986)).toCharArray(), 59369L, IIl(99304582, var0 ^ 480354083));
      l[3] = III(ll(IIl(99304585, var0 ^ -180849112), IIl(99304584, var0 ^ -52442283)).toCharArray(), 88222L, IIl(99304587, var0 ^ -636706160));
      l[4] = III(ll(IIl(99304586, var0 ^ -1045139691), IIl(99304589, var0 ^ -20376880)).toCharArray(), 16016L, IIl(99304588, var0 ^ 62596989));
      l[5] = III(ll(IIl(99304591, var0 ^ -960497596), IIl(99304590, var0 ^ -1134087016)).toCharArray(), 29695L, IIl(99304625, var0 ^ -1086136329));
      l[IIl(99304624, var0 ^ 329349186)] = III(
         ll(IIl(99304627, var0 ^ 430683487), IIl(99304626, var0 ^ -1913302652)).toCharArray(), 98543L, IIl(99304629, var0 ^ -1276845263)
      );
   }

   private static String ll(int var0, int var1) {
      int var9 = 366647535;
      int var2 = (var0 ^ IIl(99304628, var9 ^ 841166891)) & IIl(99304631, var9 ^ -2078930495);
      if (II[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & IIl(99304630, var9 ^ 1144725450)) {
            case 0 -> IIl(99304633, var9 ^ -1212933716);
            case 1 -> IIl(99304632, var9 ^ 355759322);
            case 2 -> IIl(99304635, var9 ^ 2094982605);
            case 3 -> IIl(99304634, var9 ^ -1010736044);
            case 4 -> IIl(99304637, var9 ^ -1786016475);
            case 5 -> IIl(99304636, var9 ^ 1602202817);
            case 6 -> IIl(99304639, var9 ^ 924969242);
            case 7 -> IIl(99304638, var9 ^ 1851196292);
            case 8 -> IIl(99304609, var9 ^ -306375846);
            case 9 -> IIl(99304608, var9 ^ 1033319068);
            case 10 -> IIl(99304611, var9 ^ -1223832787);
            case 11 -> IIl(99304610, var9 ^ 25561482);
            case 12 -> IIl(99304613, var9 ^ -1879446865);
            case 13 -> IIl(99304612, var9 ^ 1071257835);
            case 14 -> IIl(99304615, var9 ^ 1658323391);
            case 15 -> IIl(99304614, var9 ^ 1541500716);
            case 16 -> IIl(99304617, var9 ^ -1514385559);
            case 17 -> IIl(99304616, var9 ^ -2094074710);
            case 18 -> IIl(99304619, var9 ^ 703877608);
            case 19 -> IIl(99304618, var9 ^ 80340006);
            case 20 -> IIl(99304621, var9 ^ -1075017617);
            case 21 -> IIl(99304620, var9 ^ 1443028671);
            case 22 -> IIl(99304623, var9 ^ -1550654530);
            case 23 -> IIl(99304622, var9 ^ 127119031);
            case 24 -> IIl(99304657, var9 ^ 1034517367);
            case 25 -> IIl(99304656, var9 ^ -2064361149);
            case 26 -> IIl(99304659, var9 ^ 1754982201);
            case 27 -> IIl(99304658, var9 ^ 431085368);
            case 28 -> IIl(99304661, var9 ^ -1352951731);
            case 29 -> IIl(99304660, var9 ^ 1842183190);
            case 30 -> IIl(99304663, var9 ^ 31101332);
            case 31 -> IIl(99304662, var9 ^ -1765912102);
            case 32 -> IIl(99304665, var9 ^ -1049434381);
            case 33 -> IIl(99304664, var9 ^ -1074378564);
            case 34 -> IIl(99304667, var9 ^ 1640441801);
            case 35 -> IIl(99304666, var9 ^ -1103522649);
            case 36 -> IIl(99304669, var9 ^ -1573663392);
            case 37 -> IIl(99304668, var9 ^ -930389959);
            case 38 -> IIl(99304671, var9 ^ -835347386);
            case 39 -> IIl(99304670, var9 ^ -1864292173);
            case 40 -> IIl(99304641, var9 ^ 1668692182);
            case 41 -> IIl(99304640, var9 ^ 343106457);
            case 42 -> IIl(99304643, var9 ^ -232551911);
            case 43 -> IIl(99304642, var9 ^ 1113782033);
            case 44 -> IIl(99304645, var9 ^ -503176627);
            case 45 -> IIl(99304644, var9 ^ -1616661704);
            case 46 -> IIl(99304647, var9 ^ 481084767);
            case 47 -> IIl(99304646, var9 ^ 1668663918);
            case 48 -> IIl(99304649, var9 ^ -1913511121);
            case 49 -> IIl(99304648, var9 ^ -948600218);
            case 50 -> IIl(99304651, var9 ^ 142727504);
            case 51 -> IIl(99304650, var9 ^ -847544612);
            case 52 -> IIl(99304653, var9 ^ -1833942433);
            case 53 -> IIl(99304652, var9 ^ 1083645613);
            case 54 -> IIl(99304655, var9 ^ 2005033501);
            case 55 -> IIl(99304654, var9 ^ -430296550);
            case 56 -> IIl(99304689, var9 ^ -1063477204);
            case 57 -> IIl(99304688, var9 ^ -1227174200);
            case 58 -> IIl(99304691, var9 ^ -1590080);
            case 59 -> IIl(99304690, var9 ^ -121093681);
            case 60 -> IIl(99304693, var9 ^ 612714637);
            case 61 -> IIl(99304692, var9 ^ -208970353);
            case 62 -> IIl(99304695, var9 ^ 1428474675);
            case 63 -> IIl(99304694, var9 ^ -1722378776);
            case 64 -> IIl(99304697, var9 ^ -2116225314);
            case 65 -> IIl(99304696, var9 ^ 625635086);
            case 66 -> IIl(99304699, var9 ^ -948572062);
            case 67 -> IIl(99304698, var9 ^ 1908652995);
            case 68 -> IIl(99304701, var9 ^ -310236721);
            case 69 -> IIl(99304700, var9 ^ -1930920155);
            case 70 -> IIl(99304703, var9 ^ 1799235300);
            case 71 -> IIl(99304702, var9 ^ 2108060507);
            case 72 -> IIl(99304673, var9 ^ -121048477);
            case 73 -> IIl(99304672, var9 ^ -616478444);
            case 74 -> IIl(99304675, var9 ^ 1358950034);
            case 75 -> IIl(99304674, var9 ^ 1660887078);
            case 76 -> IIl(99304677, var9 ^ 1737613333);
            case 77 -> IIl(99304676, var9 ^ -1673470349);
            case 78 -> IIl(99304679, var9 ^ 244966243);
            case 79 -> IIl(99304678, var9 ^ 825851452);
            case 80 -> IIl(99304681, var9 ^ -955024983);
            case 81 -> IIl(99304680, var9 ^ 1558096345);
            case 82 -> IIl(99304683, var9 ^ 1960001554);
            case 83 -> IIl(99304682, var9 ^ 386723956);
            case 84 -> IIl(99304685, var9 ^ -194153324);
            case 85 -> IIl(99304684, var9 ^ -598606469);
            case 86 -> IIl(99304687, var9 ^ -565567934);
            case 87 -> IIl(99304686, var9 ^ -83391704);
            case 88 -> IIl(99304465, var9 ^ -2075197663);
            case 89 -> IIl(99304464, var9 ^ 127487103);
            case 90 -> IIl(99304467, var9 ^ -1248597634);
            case 91 -> IIl(99304466, var9 ^ 1655108433);
            case 92 -> IIl(99304469, var9 ^ -1271548489);
            case 93 -> IIl(99304468, var9 ^ -1541316298);
            case 94 -> IIl(99304471, var9 ^ 349311045);
            case 95 -> IIl(99304470, var9 ^ 624950176);
            case 96 -> IIl(99304473, var9 ^ -1366207848);
            case 97 -> 0;
            case 98 -> IIl(99304472, var9 ^ -620634950);
            case 99 -> IIl(99304475, var9 ^ -609557836);
            case 100 -> IIl(99304474, var9 ^ -2147315381);
            case 101 -> IIl(99304477, var9 ^ 2107109427);
            case 102 -> IIl(99304476, var9 ^ 21686560);
            case 103 -> IIl(99304479, var9 ^ 244012806);
            case 104 -> IIl(99304478, var9 ^ 1116404507);
            case 105 -> IIl(99304449, var9 ^ 932765631);
            case 106 -> IIl(99304448, var9 ^ 1012865523);
            case 107 -> IIl(99304451, var9 ^ 1451524216);
            case 108 -> IIl(99304450, var9 ^ 1133370602);
            case 109 -> IIl(99304453, var9 ^ 2125174573);
            case 110 -> IIl(99304452, var9 ^ 274982844);
            case 111 -> IIl(99304455, var9 ^ -1108679133);
            case 112 -> IIl(99304454, var9 ^ 1164400790);
            case 113 -> IIl(99304457, var9 ^ 1183659309);
            case 114 -> IIl(99304456, var9 ^ -1367298542);
            case 115 -> IIl(99304459, var9 ^ -525977435);
            case 116 -> IIl(99304458, var9 ^ -2006213533);
            case 117 -> IIl(99304461, var9 ^ -843639850);
            case 118 -> IIl(99304460, var9 ^ 959263029);
            case 119 -> IIl(99304463, var9 ^ -284878659);
            case 120 -> IIl(99304462, var9 ^ 847309264);
            case 121 -> IIl(99304497, var9 ^ -1572692712);
            case 122 -> 1;
            case 123 -> IIl(99304496, var9 ^ 1871960611);
            case 124 -> IIl(99304499, var9 ^ 1781688874);
            case 125 -> IIl(99304498, var9 ^ -684187871);
            case 126 -> IIl(99304501, var9 ^ -1406827251);
            case 127 -> IIl(99304500, var9 ^ -1753168779);
            case 128 -> IIl(99304503, var9 ^ 1653634489);
            case 129 -> IIl(99304502, var9 ^ 1099869073);
            case 130 -> IIl(99304505, var9 ^ 198048822);
            case 131 -> IIl(99304504, var9 ^ -332810713);
            case 132 -> IIl(99304507, var9 ^ -1788599957);
            case 133 -> IIl(99304506, var9 ^ 496616666);
            case 134 -> IIl(99304509, var9 ^ 303051295);
            case 135 -> IIl(99304508, var9 ^ -868029445);
            case 136 -> IIl(99304511, var9 ^ 1879384050);
            case 137 -> IIl(99304510, var9 ^ 806476711);
            case 138 -> IIl(99304481, var9 ^ -1349302251);
            case 139 -> IIl(99304480, var9 ^ -2146373750);
            case 140 -> IIl(99304483, var9 ^ -1674913698);
            case 141 -> IIl(99304482, var9 ^ 1047924495);
            case 142 -> IIl(99304485, var9 ^ -1528650993);
            case 143 -> IIl(99304484, var9 ^ 1862568555);
            case 144 -> IIl(99304487, var9 ^ -1509426613);
            case 145 -> IIl(99304486, var9 ^ -451097622);
            case 146 -> IIl(99304489, var9 ^ 1798556558);
            case 147 -> IIl(99304488, var9 ^ 984342611);
            case 148 -> IIl(99304491, var9 ^ 455896228);
            case 149 -> 2;
            case 150 -> IIl(99304490, var9 ^ 1988297755);
            case 151 -> IIl(99304493, var9 ^ 1697837282);
            case 152 -> IIl(99304492, var9 ^ 1872276429);
            case 153 -> IIl(99304495, var9 ^ -1339528840);
            case 154 -> IIl(99304494, var9 ^ -1473495197);
            case 155 -> IIl(99304529, var9 ^ -971482682);
            case 156 -> IIl(99304528, var9 ^ 1828127334);
            case 157 -> IIl(99304531, var9 ^ 1368035860);
            case 158 -> IIl(99304530, var9 ^ -526510615);
            case 159 -> IIl(99304533, var9 ^ -1944200031);
            case 160 -> IIl(99304532, var9 ^ 1999114293);
            case 161 -> IIl(99304535, var9 ^ -1436530243);
            case 162 -> IIl(99304534, var9 ^ -1748263377);
            case 163 -> IIl(99304537, var9 ^ -355606162);
            case 164 -> IIl(99304536, var9 ^ 1650394393);
            case 165 -> IIl(99304539, var9 ^ -845143449);
            case 166 -> IIl(99304538, var9 ^ 557676140);
            case 167 -> IIl(99304541, var9 ^ -44436240);
            case 168 -> IIl(99304540, var9 ^ 783706665);
            case 169 -> IIl(99304543, var9 ^ 1554530876);
            case 170 -> IIl(99304542, var9 ^ 1037776703);
            case 171 -> IIl(99304513, var9 ^ -951920826);
            case 172 -> IIl(99304512, var9 ^ 563472330);
            case 173 -> IIl(99304515, var9 ^ -523276334);
            case 174 -> IIl(99304514, var9 ^ 405828057);
            case 175 -> IIl(99304517, var9 ^ -1632812226);
            case 176 -> IIl(99304516, var9 ^ 898210564);
            case 177 -> IIl(99304519, var9 ^ 1157533808);
            case 178 -> IIl(99304518, var9 ^ 1998303171);
            case 179 -> IIl(99304521, var9 ^ 750247404);
            case 180 -> IIl(99304520, var9 ^ 1427026496);
            case 181 -> IIl(99304523, var9 ^ -1987749217);
            case 182 -> IIl(99304522, var9 ^ -413583370);
            case 183 -> IIl(99304525, var9 ^ 324722307);
            case 184 -> IIl(99304524, var9 ^ -1593449879);
            case 185 -> IIl(99304527, var9 ^ -367696399);
            case 186 -> IIl(99304526, var9 ^ 1101537444);
            case 187 -> IIl(99304561, var9 ^ 448959754);
            case 188 -> IIl(99304560, var9 ^ 1584679774);
            case 189 -> IIl(99304563, var9 ^ 202728222);
            case 190 -> IIl(99304562, var9 ^ -915593735);
            case 191 -> IIl(99304565, var9 ^ 1291934874);
            case 192 -> IIl(99304564, var9 ^ 761285822);
            case 193 -> IIl(99304567, var9 ^ -1672650305);
            case 194 -> IIl(99304566, var9 ^ 98695715);
            case 195 -> IIl(99304569, var9 ^ -1610117451);
            case 196 -> IIl(99304568, var9 ^ -266849580);
            case 197 -> 4;
            case 198 -> IIl(99304571, var9 ^ -1720001864);
            case 199 -> IIl(99304570, var9 ^ -656535630);
            case 200 -> IIl(99304573, var9 ^ -1246954036);
            case 201 -> IIl(99304572, var9 ^ 56238179);
            case 202 -> IIl(99304575, var9 ^ 1521726958);
            case 203 -> IIl(99304574, var9 ^ 427781825);
            case 204 -> IIl(99304545, var9 ^ -1300627540);
            case 205 -> IIl(99304544, var9 ^ 1935116212);
            case 206 -> IIl(99304547, var9 ^ 643795518);
            case 207 -> IIl(99304546, var9 ^ 337696959);
            case 208 -> IIl(99304549, var9 ^ 83374858);
            case 209 -> IIl(99304548, var9 ^ -1830530380);
            case 210 -> IIl(99304551, var9 ^ 652075178);
            case 211 -> IIl(99304550, var9 ^ -1133250331);
            case 212 -> IIl(99304553, var9 ^ 2013151495);
            case 213 -> IIl(99304552, var9 ^ -26979738);
            case 214 -> IIl(99304555, var9 ^ -707775680);
            case 215 -> IIl(99304554, var9 ^ 1780361770);
            case 216 -> IIl(99304557, var9 ^ -606167574);
            case 217 -> IIl(99304556, var9 ^ 273265001);
            case 218 -> IIl(99304559, var9 ^ 2118013496);
            case 219 -> IIl(99304558, var9 ^ 839733691);
            case 220 -> IIl(99304849, var9 ^ -1623615923);
            case 221 -> IIl(99304848, var9 ^ -120117792);
            case 222 -> IIl(99304851, var9 ^ 940910825);
            case 223 -> IIl(99304850, var9 ^ 146485093);
            case 224 -> IIl(99304853, var9 ^ 1136209674);
            case 225 -> IIl(99304852, var9 ^ 939617622);
            case 226 -> 5;
            case 227 -> IIl(99304855, var9 ^ -1391261678);
            case 228 -> IIl(99304854, var9 ^ 1856007068);
            case 229 -> IIl(99304857, var9 ^ 1517357889);
            case 230 -> IIl(99304856, var9 ^ -796006390);
            case 231 -> IIl(99304859, var9 ^ -1787613849);
            case 232 -> IIl(99304858, var9 ^ -987902950);
            case 233 -> IIl(99304861, var9 ^ -146970431);
            case 234 -> IIl(99304860, var9 ^ 1053952300);
            case 235 -> IIl(99304863, var9 ^ -1324684696);
            case 236 -> IIl(99304862, var9 ^ 1994353588);
            case 237 -> IIl(99304833, var9 ^ -1105166641);
            case 238 -> IIl(99304832, var9 ^ -1402572314);
            case 239 -> IIl(99304835, var9 ^ 1453523357);
            case 240 -> IIl(99304834, var9 ^ -1793663913);
            case 241 -> IIl(99304837, var9 ^ -545709569);
            case 242 -> IIl(99304836, var9 ^ 51755455);
            case 243 -> IIl(99304839, var9 ^ -603497617);
            case 244 -> IIl(99304838, var9 ^ 76221426);
            case 245 -> IIl(99304841, var9 ^ -474444496);
            case 246 -> IIl(99304840, var9 ^ 726455274);
            case 247 -> IIl(99304843, var9 ^ -422732017);
            case 248 -> IIl(99304842, var9 ^ 2029411624);
            case 249 -> IIl(99304845, var9 ^ -1110151882);
            case 250 -> 3;
            case 251 -> IIl(99304844, var9 ^ 677857950);
            case 252 -> IIl(99304847, var9 ^ 1575208226);
            case 253 -> IIl(99304846, var9 ^ -2143554718);
            case 254 -> IIl(99304881, var9 ^ 1630441780);
            default -> IIl(99304880, var9 ^ -304492900);
         };
         int var5 = (var1 & IIl(99304883, var9 ^ -1257970981)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIl(99304882, var9 ^ -740268515)) >>> IIl(99304885, var9 ^ 143946612)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIl(99304884, var9 ^ -617302625);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIl(99304887, var9 ^ 1276965119);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var20 = 1222049342;
      String[] var10002 = new String[2];
      short var15 = 22992;
      String[] var12 = var10002;
      int var10001 = "è\udc71\ue937⺾袖褅\uf48d郩⠿\ue4b3魅赱촫웘笣ⰹ쩐俾蟗氋ᔑڏ⛊彊풧\ua95c木\u2454병쨝똖握䳆뱞㽮臢\uf1aa暥莶瘤\ud9a9\uf2cf邃繇皣쑜긑\ue7a5\ueb6a悜렞㳿씉嶨\udea8Ĩᴯ付蓡ﯯ脼쑺Ͻ\ue5ce\u0fe2ᒅ倫ꆝ꩹牞疌ꦟ챊넖㉜ꘜ춗６놠옕\u13f6ᭋ낚췠滾袸ौʳ㔯蔷接冪\ufafaꒌ\ue1ac፫䏽ܞ坄፷⊋⹁洗썂갊耛闇踺⭬芨Ǆꧫ굝伈ః\ue5b4깚旍\uf30fӔ䇂\ue14d端쯼崦\ue450\u0c75ꭾ鴖赫暔钲엱⁃宯椆타礢䞏矼遂癄埉氮脞\uf78a䒭ﶁ䯞査㣓ꁅ嫨捫㜤ྟဳ藬\ue8c3虒뀯嘎\uda67ึ鴲鿥㌛\ue12d鮡掍痑폚䱘뫜邼\ueeca\ue893\uef81裳\ue95c刯\ue042薃ᎏስ贻⹚殃\uf70c쎼啓ᕾ᠘릯彫應ꤑ\uf686뛎䋨\ue70dೈ鐒但ࡾḴ茛ໍ逖浜犄㥔ﵥ鿲툅谩㳗ꙋ錇剉羡颏뱇\udb12鄩㽲䯍ꀟ≤Ⓓ뉦\uf7ef됑!ꀬ\uf293殢ᳳ\ue2cc鈋\uf398嚧ɦꉬ뻨\u0e67\ue620Ⱊ뒷\uaad3볬薈\ued36䎋\u1bf5蔸Ӳ㬪沎䬪㏆떇䞻盿\u0de5ǹ鰔"
         .length();
      int var13 = 0;
      int var11 = var10001;
      String var10 = "è\udc71\ue937⺾袖褅\uf48d郩⠿\ue4b3魅赱촫웘笣ⰹ쩐俾蟗氋ᔑڏ⛊彊풧\ua95c木\u2454병쨝똖握䳆뱞㽮臢\uf1aa暥莶瘤\ud9a9\uf2cf邃繇皣쑜긑\ue7a5\ueb6a悜렞㳿씉嶨\udea8Ĩᴯ付蓡ﯯ脼쑺Ͻ\ue5ce\u0fe2ᒅ倫ꆝ꩹牞疌ꦟ챊넖㉜ꘜ춗６놠옕\u13f6ᭋ낚췠滾袸ौʳ㔯蔷接冪\ufafaꒌ\ue1ac፫䏽ܞ坄፷⊋⹁洗썂갊耛闇踺⭬芨Ǆꧫ굝伈ః\ue5b4깚旍\uf30fӔ䇂\ue14d端쯼崦\ue450\u0c75ꭾ鴖赫暔钲엱⁃宯椆타礢䞏矼遂癄埉氮脞\uf78a䒭ﶁ䯞査㣓ꁅ嫨捫㜤ྟဳ藬\ue8c3虒뀯嘎\uda67ึ鴲鿥㌛\ue12d鮡掍痑폚䱘뫜邼\ueeca\ue893\uef81裳\ue95c刯\ue042薃ᎏስ贻⹚殃\uf70c쎼啓ᕾ᠘릯彫應ꤑ\uf686뛎䋨\ue70dೈ鐒但ࡾḴ茛ໍ逖浜犄㥔ﵥ鿲툅谩㳗ꙋ錇剉羡颏뱇\udb12鄩㽲䯍ꀟ≤Ⓓ뉦\uf7ef됑!ꀬ\uf293殢ᳳ\ue2cc鈋\uf398嚧ɦꉬ뻨\u0e67\ue620Ⱊ뒷\uaad3볬薈\ued36䎋\u1bf5蔸Ӳ㬪沎䬪㏆떇䞻盿\u0de5ǹ鰔";
      int var14 = 0;

      do {
         char var16 = var10.charAt(var14);
         char[] var17 = var10.substring(var14 + 1, var14 + 1 + var16).toCharArray();
         int var18 = 0;

         do {
            int var19 = var17[var18];

            var19 = (char)(switch (var18 % 5) {
               default -> 158;
               case 1 -> 210;
               case 2 -> 123;
               case 3 -> 61;
               case 4 -> 35;
            }) ^ var19;
            if (var18 % 2 == 0) {
               var17[var18] = (char)((var19 >>> 2 | var19 << 14) & 65535 ^ var15);
            } else {
               var17[var18] = (char)((var19 << 2 | var19 >>> 14) & 65535 ^ var15);
            }
         } while (++var18 < var17.length);

         var12[var13] = new String(var17);
         var13++;
         var14 = var14 + var16 + 1;
      } while (var14 < var11);

      IlI = var12;
      Ill = new Object[var12.length];
      IIl = new int[297];
      int var25 = 0;
      int var30 = 0;
      byte[] var40 = "è\u0090Û\u0002ÑtªA\u0094Ï û+-á\u0089\u0093D\u0089Àx\u0002ö/G>²q\u008fY9+O°\u0012¯\u0003Äo\u0007ÂÝVµ¾\nÊ.i\b\\*Z\u0004#}eÿ°Æêmo$é\u000f»KÔ¤%Â·O\u0007\u0080C¤¼¾\u001bíÓ\u009aÊI®\reÑ!ÝDn\u0016Ý\u0007¢Û\u0089\u000eEsÈo\u0017\u007f½3.Â \fSe 7©Nü4%UàNýñÞø'frá;Ç\u0010ë1\u0018Õ\u007fn\u009fñ°¨\u0006dpö\u0019SÆÂ2s\u0006î%yõa\"¶WáOw>\u000bß8\u0081\u0014^W×^¶\u001a\u001dª\u0097åuôÓg,\u00829\u0086¯h(\u0018\u007fB\bAõØñÂCS2úÍ,Ðä}\u000f#í \r;ù\u00194UåçitGÁûÏÖk!j²F\u001cßRý9²¢\u0014×äoáGØÌEF\u0095Þ\u007f|@XÆ!cÈ*OÝ\u0081[dí\u000fí\u008e£\u0011/\u0018F\u008dC\u000fªíÔkjä\u0083§Ü\u0095ý#sî#\u0012\u001c\u0091üìòZàæö$\u008a^[6\u008cà§UÒ4\u0013w!£\u0003+V¦Yª°ö°¾\u0000·Í½ ×\u0018ÜÝv\u0089\u0089^yþ\u0018! ðÙÏ'\u0018=\u0085 ä\u008eJTâ^\u008f®DAÐey\u0017\u0002B$\u00075WXª¤\u008f\b\u009c\u0082I\u009bAô\u000fôi½2Ú\u0000º\u001d{gfPsö±^;S\u0017ññ.Û\u0083®ºÃ\tÍÑg\u009fU\u001d\u0085 Ê-3\u0016Ý\u0014¯W\u00130Î=Dv)ë@9?sI×º\u001dÈf\u0099\u0094s¤\u0012*Õå *\u001a\u0081%DÛnÞ\u0095äòLLÙcsìD3\u0085ÆBð\u001e\u000b\u0093\u00806\u0006{÷UÙÊÁ¶¸O²\u009e\u0084Æ\u009a\u009c\u009fx°¹Ò±\u008dÆ\u009bÅrELv.÷FÒð sÈ\u009aöà\u008e\næô\u0007\u0017V\u0007*\u0018gêÁYìDi\u001b\u0099Ôç\u009f\u0099\u007fØèÂ×«\u0015?BÊÔC\u009fÒ´L^m¤\u0000_À\u0096uMå÷~\u008a#\u0003\u0014Qº\u0000\u0001Xçú<~\u00ad^R¶Ü9ÿ?ÜS\u0007²cY\u0004X\u000e+ìU\u0095À¢s\u0002\\Ê¾úC\u008fb)\u0089{øW\u0003\u00adÐ\"ÓpUÒkà\u0097¦\u0016-Fáñ(çQ\u0015\u0095í$\u000bîðã\u0014ÕUþ1 EO\u0084\u0003[\u00900I\u0018ÇÚ®ü\u008cY×±\u001b[_Lÿ6PÅ\tÛ\u008e\u0097Ð\u00172Ð$ÖrÄáðíF.\u000fÂÅ\u0089\u0098Þÿâ\u0003|£4«æ7\u0099Ç-Ñ±ÀäÒÁá§Éðø)æ\u00ad¸x~Ú¸YùW\u00104V>4'çË3-M\u0090DòýR\u008fêù\u0004\u00ad\u0084Íb7.\"8j\u0013_¨¡¢K.\u0085ÎÈçÍ5ý+®èµrÜÕ\u001e¥Ê¨\u0018Ú¦ \u008a>û\u008fu\u0018[cèLÃ¿\u008cÏ\u0006lcQå\u001e}x=\u007f\u000e\fÆ\u0085\u0097ìÃc@\u0081\u0094¢\u001aU\u0099ZåKÆÜxxðw\\ \u0097\u0006+«È5Î\u0095Mnbæ)\u0017Û\u0088QËPaB¥\u008c\réQ\u008f¸áãÐ\u0084\u0004¨À^s\u0003}FÚX\u0017®º\u001c¡-\bNÀY\u0095\u008b¸\u001e3\u000fÔgØoµw`Þ\u0098\u0007ëG4ÁÇâÒ´¶²Í\b@Û¯à\u0003\u009a\u000b4\u000e÷yÆ\nA\u008f\u001a©\u0018fÓ\u0080[ªU;ð¬Å\u009e1\u0082½\u0082d\u008a°êVõâÞF-\bÉÐ1iEd\bÚ\u008dþ¦Âî5+'G¼±i¼\u0097\u0005\bÖ(ËLT\u0099\u000bû\u009bR\u009c\u008a\u009e<ëi^pØj!Ýì¬\u0016º\u0002\u001fÜzÀ\u0012¥Jn\u0015+\u0001l\u0014ÇzÔW5ïÆ3;,uPG\u0018¤0¬\u0092XÒ?×¦JÙ\u0087È«®µèS0|\u00073\u0081óß\u008dÓ4\nPSüõE-î³\u0016p\u0014v;¿×Ãç½\u009d¬\u001a\u0005AÀÞ\u0010\u009eÒ`\u0082F^lm¡m·hi\u0099é¬¤\u0018ø\u0093:#f¢ÿ\u0001VÙj²p»\u001f6þîÂîÈ\u009f#ûö½¯\fõ×÷ÑÙm\u00914\\ªJAIÍ\u0099á\u008e.\u000eÉËM ø*¢\u001eæ-{"
         .getBytes("ISO-8859-1");

      int var62;
      do {
         IIl[var25] = ((var40[var30] & 255) << 24 | (var40[var30 + 1] & 255) << 16 | (var40[var30 + 2] & 255) << 8 | var40[var30 + 3] & 255) ^ -1390760238;
         var25 += 1;
         var62 = var30 + 4;
         var30 += 4;
      } while (var62 < var40.length);

      String[] var5 = new String[IIl(99304592, var20 ^ -827459827)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IlI(1, (short)-1343, (short)25099, -391148107, (short)25598, -1073730210)).length();
      int var1 = IIl(99304595, var20 ^ -1961427623);
      int var22 = -1;

      label100:
      while (true) {
         var25 = IIl(99304594, var20 ^ 888454161);
         String var33 = var2.substring(++var22, var22 + var1);
         byte var46 = -1;

         while (true) {
            label95: {
               char[] var64 = var33.toCharArray();
               int var76 = var64.length;
               int var6 = 0;
               var62 = var25;
               var51 = var64;
               var30 = var76;
               char[] var88;
               int var95;
               if (var76 <= 1) {
                  var88 = var64;
                  var76 = var25;
                  var95 = var6;
               } else {
                  var62 = var25;
                  var30 = var76;
                  if (var76 <= var6) {
                     break label95;
                  }

                  var88 = var64;
                  var76 = var25;
                  var95 = var6;
               }

               while (true) {
                  var88[var95] = (char)(var88[var95] ^ var76 ^ switch (var6 % IIl(99304599, var20 ^ 1491595066)) {
                     case 0 -> IIl(99304598, var20 ^ -1870633706);
                     case 1 -> IIl(99304601, var20 ^ 1349078862);
                     case 2 -> IIl(99304600, var20 ^ 471675898);
                     case 3 -> IIl(99304603, var20 ^ -586937560);
                     case 4 -> IIl(99304602, var20 ^ -1579969008);
                     case 5 -> IIl(99304605, var20 ^ 1993409009);
                     default -> IIl(99304604, var20 ^ 1172143986);
                  });
                  var6++;
                  if (var62 == 0) {
                     var95 = var62;
                     var88 = var51;
                     var76 = var62;
                  } else {
                     if (var30 <= var6) {
                        break;
                     }

                     var88 = var51;
                     var76 = var62;
                     var95 = var6;
                  }
               }
            }

            String var69 = new String(var51).intern();
            switch (var46) {
               case 0:
                  var5[var3++] = var69;
                  if ((var22 += var1) >= var4) {
                     lI = var5;
                     II = new String[IIl(99304596, var20 ^ 1742449511)];
                     l = new String[IIl(99304607, var20 ^ 2049371525)];
                     lI();
                     III = IlIIllIII.lI(l[3]);
                     String var28 = III;
                     String var8 = IlIIllIII.lI(l[4]);
                     String var7 = var28;
                     ll = var7 + var8;
                     String var29 = III;
                     String var9 = IlIIllIII.lI(l[2]);
                     var8 = var29;
                     I = var8 + var9;
                     return;
                  }

                  var1 = var2.charAt(var22);
                  break;
               default:
                  var5[var3++] = var69;
                  if ((var22 += var1) < var4) {
                     var1 = var2.charAt(var22);
                     continue label100;
                  }

                  var4 = (var2 = IlI(91, (short)-20661, (short)-10558, 1755770634, (short)22669, -1073730209)).length();
                  var1 = IIl(99304597, var20 ^ -1935813476);
                  var22 = -1;
            }

            var25 = 3;
            var33 = var2.substring(++var22, var22 + var1);
            var46 = 0;
         }
      }
   }

   private static String III(char[] var0, long var1, int var3) {
      int var4 = IIl(99304886, -1029227678 ^ 1191793713) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIl(99304889, -1029227678 ^ -1957776054);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
