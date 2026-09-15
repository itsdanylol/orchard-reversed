package k74.x;

import java.awt.Color;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10039;
import net.minecraft.class_11659;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_4184;
import net.minecraft.class_916;

@Environment(EnvType.CLIENT)
public final class lIlIIllI extends IlIIIIIIl {
   private static boolean I;
   private final IIIlIIlll II;
   private final IIlIII Il;
   private static final String[] lI;
   private static Field ll;
   private final List<IIllllII> III;
   private final lllIIlII IIl;
   private final IllIII<IlllIlIl> IlI;
   private static final Object[] IIIl;
   private static String[] Ill;
   private static final String[] lII;
   private static final String[] IIII;
   private static final int[] lll;
   private final IllIlI<Integer> lIl;
   private final IIlIII llI;

   private static String llI(byte var0, int var1, int var2, int var3) {
      int var8 = var1 ^ 616479363;
      char[] var7 = IIII[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])IIIl[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         IIIl[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 36964;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ var6 ^ var2 ^ var3 ^ var0 ^ var1 ^ var5);
      }

      return new String(var7).intern();
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      if (this.IIIIlIl() && this.IIl.IllI() && var1 != null) {
         class_310 var5 = class_310.method_1551();
         if (var5.field_1724 != null && var5.field_1687 != null && var5.method_22683() != null) {
            class_327 var6 = var5.field_1772;
            if (var6 != null) {
               for (IIllllII var8 : this.III) {
                  String var9 = var8.II();
                  int var10 = IlIIlllIl.IIl(var6, var9);
                  IlIIlllIl.IIII(var1, var6, var9, var8.I() - var10 / 2.0, var8.l(), this.II.IllI().getRGB());
               }
            }
         }
      }
   }

   private static void I() {
      int var0 = -829736089;
      Ill[0] = Ill(lI(lIl(1688281478, var0 ^ -959204734), lIl(1688281479, var0 ^ 436125931)).toCharArray(), 64034L, lIl(1688281476, var0 ^ -1663572178));
      Ill[1] = Ill(lI(lIl(1688281477, var0 ^ -1931870165), lIl(1688281474, var0 ^ -225594757)).toCharArray(), 11685L, lIl(1688281475, var0 ^ 76760609));
      Ill[2] = Ill(lI(lIl(1688281472, var0 ^ -1418991225), lIl(1688281473, var0 ^ -821652161)).toCharArray(), 72366L, lIl(1688281486, var0 ^ -1446668495));
      Ill[3] = Ill(lI(lIl(1688281487, var0 ^ -1712850582), lIl(1688281484, var0 ^ 1783347325)).toCharArray(), 95880L, lIl(1688281485, var0 ^ 282097600));
      Ill[4] = Ill(lI(lIl(1688281482, var0 ^ 1116723543), lIl(1688281483, var0 ^ -1424633825)).toCharArray(), 15993L, lIl(1688281480, var0 ^ -292628213));
      Ill[5] = Ill(lI(lIl(1688281481, var0 ^ 534021421), lIl(1688281494, var0 ^ 1236227399)).toCharArray(), 138L, lIl(1688281495, var0 ^ -2131858681));
      Ill[lIl(1688281492, var0 ^ -1136321245)] = Ill(
         lI(lIl(1688281493, var0 ^ -1299407603), lIl(1688281490, var0 ^ -1761669322)).toCharArray(), 44083L, lIl(1688281491, var0 ^ 367685325)
      );
      Ill[lIl(1688281488, var0 ^ -1505277868)] = Ill(
         lI(lIl(1688281489, var0 ^ -1509561814), lIl(1688281502, var0 ^ -1939882770)).toCharArray(), 54107L, lIl(1688281503, var0 ^ -1718631339)
      );
      Ill[lIl(1688281500, var0 ^ 530711616)] = Ill(
         lI(lIl(1688281501, var0 ^ 586118239), lIl(1688281498, var0 ^ -1176855816)).toCharArray(), 90164L, lIl(1688281499, var0 ^ -1089375633)
      );
   }

   @Override
   public void llIl() {
      this.III.clear();
      this.lIl.l();
   }

   private class_238 l(class_1542 var1, class_243 var2) {
      return var1 != null && var2 != null ? var1.method_18377(var1.method_18376()).method_30757(var2) : class_238.method_29968(class_243.field_1353);
   }

   private static Field II() {
      if (I) {
         return ll;
      } else {
         I = true;

         for (Field var3 : class_310.method_1551().field_1769.getClass().getDeclaredFields()) {
            if (class_11659.class.isAssignableFrom(var3.getType())) {
               var3.setAccessible(true);
               ll = var3;
               break;
            }
         }

         return ll;
      }
   }

   private class_11659 Il(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 12
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1769 Lnet/minecraft/class_761;
      // 08: ifnonnull 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/lIlIIllI.III (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 11: athrow
      // 12: aconst_null
      // 13: areturn
      // 14: invokestatic k74/x/lIlIIllI.III (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 17: athrow
      // 18: invokestatic k74/x/lIlIIllI.II ()Ljava/lang/reflect/Field;
      // 1b: astore 2
      // 1c: aload 2
      // 1d: ifnonnull 22
      // 20: aconst_null
      // 21: areturn
      // 22: aload 2
      // 23: aload 1
      // 24: getfield net/minecraft/class_310.field_1769 Lnet/minecraft/class_761;
      // 27: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 2a: astore 3
      // 2b: aload 3
      // 2c: instanceof net/minecraft/class_11659
      // 2f: ifeq 3d
      // 32: aload 3
      // 33: checkcast net/minecraft/class_11659
      // 36: astore 4
      // 38: aload 4
      // 3a: goto 3e
      // 3d: aconst_null
      // 3e: areturn
      // 3f: astore 2
      // 40: aconst_null
      // 41: areturn
   }

   private static String lI(int var0, int var1) {
      int var9 = 622335872;
      int var2 = (var0 ^ lIl(1688281515, var9 ^ -732298003)) & lIl(1688281512, var9 ^ 1729277028);
      if (lI[var2] == null) {
         char[] var3 = lII[var2].toCharArray();

         int var4 = switch (var3[0] & lIl(1688281513, var9 ^ -1454818328)) {
            case 0 -> lIl(1688281526, var9 ^ 1490514306);
            case 1 -> lIl(1688281527, var9 ^ -796350068);
            case 2 -> lIl(1688281524, var9 ^ 877481681);
            case 3 -> lIl(1688281525, var9 ^ 44280372);
            case 4 -> lIl(1688281522, var9 ^ -476489313);
            case 5 -> lIl(1688281523, var9 ^ 1724762100);
            case 6 -> lIl(1688281520, var9 ^ -278876598);
            case 7 -> lIl(1688281521, var9 ^ -1029159068);
            case 8 -> lIl(1688281534, var9 ^ 947837921);
            case 9 -> lIl(1688281535, var9 ^ -1966352975);
            case 10 -> lIl(1688281532, var9 ^ -1905647719);
            case 11 -> lIl(1688281533, var9 ^ 820924050);
            case 12 -> lIl(1688281530, var9 ^ -856383635);
            case 13 -> lIl(1688281531, var9 ^ 516471176);
            case 14 -> lIl(1688281528, var9 ^ 1628483618);
            case 15 -> lIl(1688281529, var9 ^ 1173618117);
            case 16 -> lIl(1688281542, var9 ^ -930023213);
            case 17 -> lIl(1688281543, var9 ^ 189799404);
            case 18 -> lIl(1688281540, var9 ^ -2120972974);
            case 19 -> lIl(1688281541, var9 ^ -269832806);
            case 20 -> lIl(1688281538, var9 ^ -64858643);
            case 21 -> lIl(1688281539, var9 ^ -1840286515);
            case 22 -> lIl(1688281536, var9 ^ 2074087478);
            case 23 -> lIl(1688281537, var9 ^ -872062789);
            case 24 -> lIl(1688281550, var9 ^ -1528483469);
            case 25 -> lIl(1688281551, var9 ^ -1447880940);
            case 26 -> lIl(1688281548, var9 ^ -1718886523);
            case 27 -> lIl(1688281549, var9 ^ -478614206);
            case 28 -> lIl(1688281546, var9 ^ 1050304553);
            case 29 -> lIl(1688281547, var9 ^ -222965622);
            case 30 -> lIl(1688281544, var9 ^ 1941277462);
            case 31 -> lIl(1688281545, var9 ^ -295117702);
            case 32 -> lIl(1688281558, var9 ^ 21137759);
            case 33 -> lIl(1688281559, var9 ^ -857712477);
            case 34 -> lIl(1688281556, var9 ^ -1903560177);
            case 35 -> lIl(1688281557, var9 ^ 935511224);
            case 36 -> lIl(1688281554, var9 ^ -1339320490);
            case 37 -> lIl(1688281555, var9 ^ -1911516371);
            case 38 -> lIl(1688281552, var9 ^ -2002599121);
            case 39 -> lIl(1688281553, var9 ^ 1528725597);
            case 40 -> lIl(1688281566, var9 ^ -353983239);
            case 41 -> lIl(1688281567, var9 ^ -1693787616);
            case 42 -> lIl(1688281564, var9 ^ -1062847751);
            case 43 -> lIl(1688281565, var9 ^ 263353935);
            case 44 -> lIl(1688281562, var9 ^ 1574579991);
            case 45 -> lIl(1688281563, var9 ^ 1079081016);
            case 46 -> lIl(1688281560, var9 ^ -562962868);
            case 47 -> lIl(1688281561, var9 ^ 484459656);
            case 48 -> lIl(1688281574, var9 ^ -1588285067);
            case 49 -> lIl(1688281575, var9 ^ -625801418);
            case 50 -> lIl(1688281572, var9 ^ -180681381);
            case 51 -> lIl(1688281573, var9 ^ 746491963);
            case 52 -> lIl(1688281570, var9 ^ 376526460);
            case 53 -> lIl(1688281571, var9 ^ -1123721218);
            case 54 -> lIl(1688281568, var9 ^ -655097410);
            case 55 -> lIl(1688281569, var9 ^ 410294480);
            case 56 -> 2;
            case 57 -> lIl(1688281582, var9 ^ 111949991);
            case 58 -> lIl(1688281583, var9 ^ -358363545);
            case 59 -> lIl(1688281580, var9 ^ 592181122);
            case 60 -> lIl(1688281581, var9 ^ -1762539343);
            case 61 -> lIl(1688281578, var9 ^ -1906819618);
            case 62 -> lIl(1688281579, var9 ^ -1498675785);
            case 63 -> lIl(1688281576, var9 ^ 986381030);
            case 64 -> lIl(1688281577, var9 ^ 36130036);
            case 65 -> lIl(1688281590, var9 ^ -1749811769);
            case 66 -> lIl(1688281591, var9 ^ -1413457906);
            case 67 -> lIl(1688281588, var9 ^ -1187660855);
            case 68 -> lIl(1688281589, var9 ^ 374529712);
            case 69 -> lIl(1688281586, var9 ^ -154135662);
            case 70 -> lIl(1688281587, var9 ^ 1088237389);
            case 71 -> lIl(1688281584, var9 ^ -1656626798);
            case 72 -> lIl(1688281585, var9 ^ 978457242);
            case 73 -> lIl(1688281598, var9 ^ -1004268416);
            case 74 -> lIl(1688281599, var9 ^ 1287955213);
            case 75 -> lIl(1688281596, var9 ^ 1225349234);
            case 76 -> lIl(1688281597, var9 ^ 934822484);
            case 77 -> lIl(1688281594, var9 ^ -1235652894);
            case 78 -> lIl(1688281595, var9 ^ 845259268);
            case 79 -> lIl(1688281592, var9 ^ 188661440);
            case 80 -> lIl(1688281593, var9 ^ 1040108935);
            case 81 -> lIl(1688281350, var9 ^ -1792036101);
            case 82 -> lIl(1688281351, var9 ^ 1301033609);
            case 83 -> lIl(1688281348, var9 ^ -2071082022);
            case 84 -> lIl(1688281349, var9 ^ 1983520985);
            case 85 -> lIl(1688281346, var9 ^ -997290248);
            case 86 -> lIl(1688281347, var9 ^ 2065138242);
            case 87 -> lIl(1688281344, var9 ^ 270693876);
            case 88 -> lIl(1688281345, var9 ^ -654336438);
            case 89 -> lIl(1688281358, var9 ^ -583196916);
            case 90 -> lIl(1688281359, var9 ^ -743119134);
            case 91 -> lIl(1688281356, var9 ^ -1453400669);
            case 92 -> lIl(1688281357, var9 ^ 752617025);
            case 93 -> lIl(1688281354, var9 ^ -1573644578);
            case 94 -> lIl(1688281355, var9 ^ -1057340274);
            case 95 -> lIl(1688281352, var9 ^ 55967098);
            case 96 -> lIl(1688281353, var9 ^ -671002748);
            case 97 -> lIl(1688281366, var9 ^ 1095179761);
            case 98 -> lIl(1688281367, var9 ^ -2001446849);
            case 99 -> lIl(1688281364, var9 ^ -179224927);
            case 100 -> lIl(1688281365, var9 ^ 943290411);
            case 101 -> lIl(1688281362, var9 ^ 863387955);
            case 102 -> lIl(1688281363, var9 ^ -337453093);
            case 103 -> lIl(1688281360, var9 ^ -1885980099);
            case 104 -> lIl(1688281361, var9 ^ -1499627943);
            case 105 -> lIl(1688281374, var9 ^ -758528365);
            case 106 -> lIl(1688281375, var9 ^ 448241718);
            case 107 -> lIl(1688281372, var9 ^ 394660143);
            case 108 -> lIl(1688281373, var9 ^ -2125178486);
            case 109 -> lIl(1688281370, var9 ^ -412404831);
            case 110 -> lIl(1688281371, var9 ^ 742335214);
            case 111 -> lIl(1688281368, var9 ^ 655964673);
            case 112 -> lIl(1688281369, var9 ^ 946477168);
            case 113 -> lIl(1688281382, var9 ^ -1670802301);
            case 114 -> lIl(1688281383, var9 ^ -776911876);
            case 115 -> lIl(1688281380, var9 ^ -165296280);
            case 116 -> lIl(1688281381, var9 ^ -1237576029);
            case 117 -> lIl(1688281378, var9 ^ 260642364);
            case 118 -> lIl(1688281379, var9 ^ 1970271531);
            case 119 -> lIl(1688281376, var9 ^ 477679454);
            case 120 -> lIl(1688281377, var9 ^ -1218363795);
            case 121 -> lIl(1688281390, var9 ^ -1558698439);
            case 122 -> lIl(1688281391, var9 ^ -166313308);
            case 123 -> lIl(1688281388, var9 ^ 240641768);
            case 124 -> lIl(1688281389, var9 ^ 1533245456);
            case 125 -> lIl(1688281386, var9 ^ -1332012394);
            case 126 -> lIl(1688281387, var9 ^ -2045859687);
            case 127 -> lIl(1688281384, var9 ^ -1801767621);
            case 128 -> lIl(1688281385, var9 ^ -720611374);
            case 129 -> lIl(1688281398, var9 ^ -984518223);
            case 130 -> lIl(1688281399, var9 ^ -1912852315);
            case 131 -> lIl(1688281396, var9 ^ 464168234);
            case 132 -> lIl(1688281397, var9 ^ 1402005909);
            case 133 -> lIl(1688281394, var9 ^ 436598188);
            case 134 -> lIl(1688281395, var9 ^ 163377871);
            case 135 -> lIl(1688281392, var9 ^ -838478001);
            case 136 -> lIl(1688281393, var9 ^ -63814426);
            case 137 -> lIl(1688281406, var9 ^ -2058566298);
            case 138 -> lIl(1688281407, var9 ^ 664089859);
            case 139 -> lIl(1688281404, var9 ^ 392744652);
            case 140 -> lIl(1688281405, var9 ^ -1628158639);
            case 141 -> lIl(1688281402, var9 ^ -822386796);
            case 142 -> lIl(1688281403, var9 ^ 138622420);
            case 143 -> lIl(1688281400, var9 ^ 797194844);
            case 144 -> lIl(1688281401, var9 ^ 234334027);
            case 145 -> lIl(1688281414, var9 ^ 1301978898);
            case 146 -> 4;
            case 147 -> lIl(1688281415, var9 ^ -1911084620);
            case 148 -> lIl(1688281412, var9 ^ 1343956615);
            case 149 -> lIl(1688281413, var9 ^ -468396605);
            case 150 -> lIl(1688281410, var9 ^ -1782300647);
            case 151 -> lIl(1688281411, var9 ^ 296074632);
            case 152 -> lIl(1688281408, var9 ^ 1879432406);
            case 153 -> lIl(1688281409, var9 ^ 61924721);
            case 154 -> lIl(1688281422, var9 ^ 830378040);
            case 155 -> lIl(1688281423, var9 ^ 2022943364);
            case 156 -> lIl(1688281420, var9 ^ 1331849721);
            case 157 -> lIl(1688281421, var9 ^ 250465430);
            case 158 -> lIl(1688281418, var9 ^ -1671846865);
            case 159 -> lIl(1688281419, var9 ^ 1873721188);
            case 160 -> lIl(1688281416, var9 ^ 1075291718);
            case 161 -> lIl(1688281417, var9 ^ 1833845570);
            case 162 -> lIl(1688281430, var9 ^ 54973879);
            case 163 -> lIl(1688281431, var9 ^ 290084779);
            case 164 -> lIl(1688281428, var9 ^ -406959196);
            case 165 -> lIl(1688281429, var9 ^ 324980153);
            case 166 -> lIl(1688281426, var9 ^ -2104872535);
            case 167 -> lIl(1688281427, var9 ^ -1586065016);
            case 168 -> lIl(1688281424, var9 ^ 2123952092);
            case 169 -> lIl(1688281425, var9 ^ 1359638171);
            case 170 -> lIl(1688281438, var9 ^ -1019285862);
            case 171 -> lIl(1688281439, var9 ^ -1137746263);
            case 172 -> lIl(1688281436, var9 ^ 2117437582);
            case 173 -> lIl(1688281437, var9 ^ -1647273801);
            case 174 -> lIl(1688281434, var9 ^ 1213934379);
            case 175 -> lIl(1688281435, var9 ^ -835432822);
            case 176 -> lIl(1688281432, var9 ^ 1300619237);
            case 177 -> lIl(1688281433, var9 ^ 619751632);
            case 178 -> lIl(1688281446, var9 ^ -1177636237);
            case 179 -> lIl(1688281447, var9 ^ -1141621488);
            case 180 -> lIl(1688281444, var9 ^ -1153849066);
            case 181 -> lIl(1688281445, var9 ^ 942687319);
            case 182 -> lIl(1688281442, var9 ^ 1385206108);
            case 183 -> lIl(1688281443, var9 ^ 2126397313);
            case 184 -> lIl(1688281440, var9 ^ -679535180);
            case 185 -> lIl(1688281441, var9 ^ 12187150);
            case 186 -> lIl(1688281454, var9 ^ -809912660);
            case 187 -> lIl(1688281455, var9 ^ 1471303714);
            case 188 -> lIl(1688281452, var9 ^ -1149874509);
            case 189 -> lIl(1688281453, var9 ^ -1158634995);
            case 190 -> lIl(1688281450, var9 ^ -9422874);
            case 191 -> lIl(1688281451, var9 ^ -1305851507);
            case 192 -> lIl(1688281448, var9 ^ -1532638499);
            case 193 -> lIl(1688281449, var9 ^ 1748248677);
            case 194 -> 5;
            case 195 -> lIl(1688281462, var9 ^ 742063987);
            case 196 -> lIl(1688281463, var9 ^ 1693317360);
            case 197 -> lIl(1688281460, var9 ^ -1028555865);
            case 198 -> lIl(1688281461, var9 ^ -426148017);
            case 199 -> lIl(1688281458, var9 ^ 615321966);
            case 200 -> lIl(1688281459, var9 ^ -1011820992);
            case 201 -> lIl(1688281456, var9 ^ 188078141);
            case 202 -> lIl(1688281457, var9 ^ 41751924);
            case 203 -> lIl(1688281470, var9 ^ 906530576);
            case 204 -> lIl(1688281471, var9 ^ -547830463);
            case 205 -> lIl(1688281468, var9 ^ 2089559668);
            case 206 -> lIl(1688281469, var9 ^ 691847916);
            case 207 -> lIl(1688281466, var9 ^ -514704773);
            case 208 -> lIl(1688281467, var9 ^ 1042789186);
            case 209 -> lIl(1688281464, var9 ^ 1833873013);
            case 210 -> lIl(1688281465, var9 ^ -227678767);
            case 211 -> lIl(1688281222, var9 ^ -2030907795);
            case 212 -> lIl(1688281223, var9 ^ -463005960);
            case 213 -> lIl(1688281220, var9 ^ 400759760);
            case 214 -> lIl(1688281221, var9 ^ 1933417718);
            case 215 -> lIl(1688281218, var9 ^ 584570514);
            case 216 -> lIl(1688281219, var9 ^ 1629362666);
            case 217 -> lIl(1688281216, var9 ^ 174398067);
            case 218 -> lIl(1688281217, var9 ^ 229420327);
            case 219 -> lIl(1688281230, var9 ^ -492379246);
            case 220 -> lIl(1688281231, var9 ^ -587654401);
            case 221 -> 0;
            case 222 -> lIl(1688281228, var9 ^ 1600543623);
            case 223 -> lIl(1688281229, var9 ^ -215099798);
            case 224 -> lIl(1688281226, var9 ^ -1365520615);
            case 225 -> lIl(1688281227, var9 ^ -569839548);
            case 226 -> lIl(1688281224, var9 ^ 1174987965);
            case 227 -> 3;
            case 228 -> lIl(1688281225, var9 ^ -287158625);
            case 229 -> lIl(1688281238, var9 ^ -553738283);
            case 230 -> lIl(1688281239, var9 ^ 1961798800);
            case 231 -> lIl(1688281236, var9 ^ 84337477);
            case 232 -> lIl(1688281237, var9 ^ -1596975882);
            case 233 -> lIl(1688281234, var9 ^ -385760213);
            case 234 -> lIl(1688281235, var9 ^ -641320827);
            case 235 -> 1;
            case 236 -> lIl(1688281232, var9 ^ 1820167630);
            case 237 -> lIl(1688281233, var9 ^ 1047382551);
            case 238 -> lIl(1688281246, var9 ^ 143289914);
            case 239 -> lIl(1688281247, var9 ^ -1230866408);
            case 240 -> lIl(1688281244, var9 ^ -392082111);
            case 241 -> lIl(1688281245, var9 ^ 1807975119);
            case 242 -> lIl(1688281242, var9 ^ -937609594);
            case 243 -> lIl(1688281243, var9 ^ -1781861339);
            case 244 -> lIl(1688281240, var9 ^ -1777593593);
            case 245 -> lIl(1688281241, var9 ^ 596405246);
            case 246 -> lIl(1688281254, var9 ^ -42668189);
            case 247 -> lIl(1688281255, var9 ^ 1982489694);
            case 248 -> lIl(1688281252, var9 ^ 1112537990);
            case 249 -> lIl(1688281253, var9 ^ 985706088);
            case 250 -> lIl(1688281250, var9 ^ -487993345);
            case 251 -> lIl(1688281251, var9 ^ -10360046);
            case 252 -> lIl(1688281248, var9 ^ -1502171525);
            case 253 -> lIl(1688281249, var9 ^ 892978832);
            case 254 -> lIl(1688281262, var9 ^ 1584068030);
            default -> lIl(1688281263, var9 ^ 1701665800);
         };
         int var5 = (var1 & lIl(1688281260, var9 ^ -1949465724)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIl(1688281261, var9 ^ -366479360)) >>> lIl(1688281258, var9 ^ 1170461398)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIl(1688281259, var9 ^ -1305387699);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIl(1688281256, var9 ^ -2095644209);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   private boolean ll() {
      return this.IlI.IllI() == IlllIlIl.Il;
   }

   @Override
   public void IlI(lIIlIl var1) {
      String[] var2 = IIllllIl.IIIIl();
      this.III.clear();
      if (this.IIIIlIl() && IlIII.IIIIII(var1)) {
         class_310 var3 = class_310.method_1551();
         if (var3.field_1724 != null && var3.field_1687 != null) {
            Color var4 = this.II.IllI();
            IlllIlIl var5 = this.IlI.IllI();
            float var6 = (float)this.llI.IllI().doubleValue();
            float var7 = IIll.IlIIlI(var3);
            double var8 = this.Il.IllI() * this.Il.IllI();
            HashSet var10 = new HashSet();

            for (class_1297 var12 : var3.field_1687.method_18112()) {
               if (var12 instanceof class_1542 var13 && var13.method_5805() && !(var13.method_5858(var3.field_1724) > var8)) {
                  class_1799 var14 = var13.method_6983();
                  if (var14 != null && !var14.method_7960()) {
                     class_243 var15;
                     label59: {
                        var15 = IlIII.IIll(var13, var7);
                        if (var5 == IlllIlIl.Il) {
                           class_238 var16 = this.l(var13, var15);
                           IlIII.IlIlI(var1, var16, var4, var4.getAlpha(), var6);
                           if (var2 == null) {
                              break label59;
                           }
                        }

                        this.IIl(var1, var3, var13, var7, var15);
                     }

                     if (this.IIl.IllI()) {
                        class_243 var21 = var15.method_1031(0.0, var13.method_17682() + 0.45, 0.0);
                        IlIllIIII var17 = IlIII.IlIll(var1, var21);
                        if (var17 != null) {
                           var10.add(var13.method_5628());
                           double var18 = var13.method_5858(var3.field_1724);
                           lIllIIll var20 = this.lIl.IIl(var13.method_5628(), var17.II(), var17.l(), var18);
                           this.III.add(new IIllllII(this.lII(var14), var20.I(), var20.II()));
                        }
                     }

                     if (var2 != null) {
                        break;
                     }
                  }
               }
            }

            this.lIl.I(var10);
         } else {
            this.lIl.l();
         }
      } else {
         this.lIl.l();
      }
   }

   private static ReflectiveOperationException III(ReflectiveOperationException var0) {
      return var0;
   }

   private void IIl(lIIlIl var1, class_310 var2, class_1542 var3, float var4, class_243 var5) {
      String[] var6 = IIllllIl.IIIIl();
      class_11659 var7 = this.Il(var2);
      if (var7 != null && var1.I() != null && var3 != null && var5 != null) {
         if (var2.method_1561().method_3953(var3) instanceof class_916 var9 && var6 == null) {
            class_10039 var10 = var9.method_62469();
            var9.method_62470(var3, var10, var4);
            var10.field_61820 = lIl(1688281257, -582597896 ^ 2076027570);
            class_4184 var11 = var1.lIl() != null ? var1.lIl() : var2.field_1773.method_19418();
            class_243 var12 = var11.method_71156();
            class_12075 var13 = new class_12075();
            var13.field_63078 = var12;
            var13.field_63077 = var11.method_19328();
            var13.field_63081 = var11.method_23767();
            var13.field_63079 = true;
            var1.I().method_22903();

            try {
               var1.I().method_22904(var5.field_1352 - var12.field_1352, var5.field_1351 - var12.field_1351, var5.field_1350 - var12.field_1350);
               var9.method_3996(var10, var1.I(), var7, var13);
            } finally {
               var1.I().method_22909();
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1037826517;
      int var11 = 0;
      short var12 = 4815;
      int var10001 = "v\ue0ecἳ辧\ude01ȑ\uf472䵐ꕹ視笍㣝㘩濄\ueb5b\uddcf䳞↨ﾃꑜ퉺\udb89휟⢶墻ὠ훎晠ꂌ蔙\uda90뺰瑭룇퀏\udde5렋\uda13﵎ጋ㲸ᡪ\udbcc藼訴郇쓩큮堃灗᧨ణ搥殠橤軝䛖⚮찭ῠﰿ䎺ᠩ굨턶퍗纝䚍댎\uf5df䚠筇냼⌗⟛艑쇾⡖伅樘ꂩ\u20c1\uf415ꓟ욤層䐪\uf4a7쭾릷\ue7c0抟填ᴙ茭ဤ砫櫰偗漒\uf86a沟附Ǉග佅\uda8e\ud82e䄧ⶽﴆ灭䊃⯱䚮㭵辑횝쬤\u0011\uf635짖\uf43f栟ᶡ噿瀨搰『ṍມ끯\ued71\uddec䃿ᢚ폼"
         .length();
      int var10 = 0;
      int var8 = var10001;
      String var7 = "v\ue0ecἳ辧\ude01ȑ\uf472䵐ꕹ視笍㣝㘩濄\ueb5b\uddcf䳞↨ﾃꑜ퉺\udb89휟⢶墻ὠ훎晠ꂌ蔙\uda90뺰瑭룇퀏\udde5렋\uda13﵎ጋ㲸ᡪ\udbcc藼訴郇쓩큮堃灗᧨ణ搥殠橤軝䛖⚮찭ῠﰿ䎺ᠩ굨턶퍗纝䚍댎\uf5df䚠筇냼⌗⟛艑쇾⡖伅樘ꂩ\u20c1\uf415ꓟ욤層䐪\uf4a7쭾릷\ue7c0抟填ᴙ茭ဤ砫櫰偗漒\uf86a沟附Ǉග佅\uda8e\ud82e䄧ⶽﴆ灭䊃⯱䚮㭵辑횝쬤\u0011\uf635짖\uf43f栟ᶡ噿瀨搰『ṍມ끯\ued71\uddec䃿ᢚ폼";
      String[] var9 = new String[2];

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
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

      IIII = var9;
      IIIl = new Object[var9.length];
      int var10000 = 0;
      int var22 = 0;
      lll = new int[313];
      byte[] var10002 = "\u001eÝ^ÌÁðIEm,ëÕTÔìaÕ|É\u009aAz\u0083Ise\u0005·\u0017\bÈM\tmA©Aé\u0015S²Eþ*³<ß\u008e\u009a\u00815\u0010s\u001b\u0013@ÊË¸ªÇÚihn^@´Ã\u008b\fëdKå}j\u0082q)NñíÏ\u0014\u0094¶ì~I°\u0001~\u000b\u0006\bTQzåÑ\\©ÀÇ¬ü,úá\u0098p\u009e+\u0088¶\u000b<cµ\u0013Ç\u008f\u0088Kíæ,iÐ¼\u009d$¨Ñ¡¢M5Fu\u0001\u0085ú`|\u0097öQR¸\u009fðn\rv\u008f6Cåo\u0012\u0010Ü¯\u0081üh\u0098Êtân\u0016\bP\u000eåÆlçÇÄ\u0011T\u008er¶\u009aÔà;kJ¥Ïã\u0015ri\u0007Ð\u009551>~CÐ\u0004\u008d>UP\u0013fÜýuÑñ5\u0093\u0001\u000bã\u000fä¹V\u0001Ø½÷Ë!\u0003s\u009a¼ÿiKâ-Um<R\u008dkìvn&\u0097û\r,18ÍÏØ²\tQ#Üwy^Ï¿\u0081m¡Ò¯mH=Ä\u000bÿ\u0098´\u0097\u0097xå3\u009a.Ã.ª\u0016\u0004%Ðå9m\r\u0007´?Á(\u000b0@(_æÝõ\u0007Õ2ßRØÿ}\u008cO½\u0014!£\u0004_\u0010H\u0083¶C&½\u008dGW»?\u0017ah\u0083T\u0091Ù{\u007fs¨\u0097\u0001°ó;î5</¢\u0095nGûRsÌ£\u000bíì\n\u0002/}\u0090\u009b\u0092ÉjÖé.Ó~Æ¦ÑI\u001fãD;%ì\u0082V\u008e\u0098\u0084[ëiÚ:+éC\u001e51ìÀÙ>\u0015õ\u0010Ö#ä¥l\u0013.½Åéx\u00951Ñ»\tW!D1º\u0098\u0001¤.)Ñ\u0098]\u0083\u0087\u008a¨oê%Ï\n\u0094ÅMÇ°s@ôË®Ü5\u009d\tÏÆ|÷¹ÀH\u007fYw3z\u0094\u0083Ö\u0004%\u0099à\u0085ÄºÆ\u0001üvf8£j\u008f\u000ec\u00169¦²f\u0004~\u0011æ\u008c·\u0010\u001f\u0004E§ôÈ÷\u0013Z\\H\u008aVÛ#¿¡ýëbJzî Äbà)2P\u009aÃ\u0006ú\u001fAÒF\u0091©Âzóg\u009fo0È)Lë\u009c\u0094èrÚÆ\u0085»)\u008c\u008cÆÌê\u0092\u000b¤£N\u0000ë\u009aZØ\u007f\u0004á¼\u000báw\u0095\u0000ª\u009aáT\u0012æ)*tü$\u001bÝ\u0098²É\u008dtÔöèì\u001f¢öp\u0014\u0084î§\u000b÷Ì¬¯ô@1â,\u0097xÅ¸\u001c?\u0085¡Â\u0086<\u0014ÍaFò!\u008a/å\u0014\u0004\u0084üå\u0015\u0090\u0085ò\u001cÅ\u008b\u0096\u0083=Ê2Vhþ¬Û\u0083\u0006ÁÅµ\u0093s\u009a§\u0006á\u0015æ\u0091\u0083`öÌ¥7¾aä2(7~b`\r=x)\u0098.Í:!&8ý\u0098\u0003âÏ¯\u0090ú¶Ñ\u001e/\u0014\báÂ$õ\u001a\b\u00adi\u0091týf\u008b\u0097;Þáß\u001c\u0019î{>jsq~\u0007Kì½\u008aý\u009dc\u0086òÝ×\u0089\u0001j¦Y\u0094\u0090\"8f¬C\u0098\b¥0-1\u0086\u0002ãDõK\u000e~;|ÿ½®=p\u0018V¯Äp\u009f\\3cæs\u008a}O^Ó\u0097\u00970Û\u000e©\"×\u00832Ô#\u009f\\ Ã\u0019+±\u0017ê°\u0092ëEJM\u0005;$b\u0097º~ð£5ê\u008f²\u008a[M¨\\m®MLY{ÆÿËý©\u009a`~\u0018\u000b`\u0017m|æ\u008aSf'\u0088ié¸\u0088¤}ý\u000b\u00ad\u009fFa\rEÂM#ä¿äâÉm3$-4ü$b\u008fd/\u0084¿\u0088ë\u009a>\u0089mvrÌíì¦\u0081·\u009d÷\u00978\u001e\u0089[©ü*\u001f§+:Wp#Éñ, ²Õ\u0004¤e\u00170Å\u0005ð-\u0002Z8¨\fÕ1àÁ\u000b\u0005\u0095[\u0006ìÅ\u0011+O\u0011ò\u008f\u001a¡\u0016\u0017ÒÏá_\rºg\r^ÓzNÁð1\u0092µo\u001b{×úÃ¿$~Îó@ I~\u0011J\fLR\u0083Ìá9øÏ,>1x3Ñ;6ÅïdÏÕlû\u008e\u0080À°\u0003*\u009d\u0006\u001a±í\u0095%Ùu\u00951\bÝ\u007f\u009báícJ\u0003Gsvj6\u009b6 \u0093MÁ°Ú\u009c\u0011bê[âR_àX4\rð\u001fr;\u0017»%\u0085?\u00ad\u000bÛ<\u0098|X^Wîû\u0080ã\u0006¦W!r¥\u0091Æ\u001b\u0010\u0011¾¡Îé:ÀE·±\u001dqÒ.\u0090\t]t\u009bÑt\u001ajÌü>r\u0095ë{[\u0006¤\u0013=m÷ \u0087Vð\u0089\r¸PYRÙ»'×v^\u0007k\u0081¬\u0087\u009c°\u008aÛ\u001d°\u008e%\u001c§ú¹§~J«¶å\u008d¼Ù?\u0090Ú\u0016¿¦\u000b\u001d\u0090ÝÌ0\u0093\u001b\u009bò¬ó\u008aü^\u008b\rÞ"
         .getBytes("ISO-8859-1");

      int var53;
      do {
         lll[var10000] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ 1915001492;
         var10000 += 1;
         var53 = var22 + 4;
         var22 += 4;
      } while (var53 < var10002.length);

      String[] var5 = new String[lIl(1688281496, var17 ^ 949597521)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = llI((byte)-45, 616479363, -1884582806, 472522642)).length();
      int var1 = lIl(1688281497, var17 ^ 1622400211);
      int var19 = -1;

      label91:
      while (true) {
         var10000 = lIl(1688281510, var17 ^ 1116636851);
         String var25 = var2.substring(++var19, var19 + var1);
         byte var37 = -1;

         while (true) {
            label86: {
               char[] var55 = var25.toCharArray();
               int var67 = var55.length;
               int var6 = 0;
               var53 = var10000;
               var42 = var55;
               var22 = var67;
               char[] var79;
               int var86;
               if (var67 <= 1) {
                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               } else {
                  var53 = var10000;
                  var22 = var67;
                  if (var67 <= var6) {
                     break label86;
                  }

                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               }

               while (true) {
                  var79[var86] = (char)(var79[var86] ^ var67 ^ switch (var6 % lIl(1688281506, var17 ^ 1260563747)) {
                     case 0 -> lIl(1688281507, var17 ^ 2047640216);
                     case 1 -> lIl(1688281504, var17 ^ -617597052);
                     case 2 -> lIl(1688281505, var17 ^ -1536657100);
                     case 3 -> lIl(1688281518, var17 ^ 1145842425);
                     case 4 -> lIl(1688281519, var17 ^ -2065709461);
                     case 5 -> lIl(1688281516, var17 ^ -1282126083);
                     default -> lIl(1688281517, var17 ^ 1162359525);
                  });
                  var6++;
                  if (var53 == 0) {
                     var86 = var53;
                     var79 = var42;
                     var67 = var53;
                  } else {
                     if (var22 <= var6) {
                        break;
                     }

                     var79 = var42;
                     var67 = var53;
                     var86 = var6;
                  }
               }
            }

            String var60 = new String(var42).intern();
            switch (var37) {
               case 0:
                  var5[var3++] = var60;
                  if ((var19 += var1) >= var4) {
                     lII = var5;
                     lI = new String[lIl(1688281509, var17 ^ 1583333150)];
                     Ill = new String[lIl(1688281514, var17 ^ 633076871)];
                     I();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var60;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label91;
                  }

                  var4 = (var2 = llI((byte)-100, 616479362, 1765930847, 484897318)).length();
                  var1 = lIl(1688281511, var17 ^ 267840324);
                  var19 = -1;
            }

            var10000 = lIl(1688281508, var17 ^ -1995239589);
            var25 = var2.substring(++var19, var19 + var1);
            var37 = 0;
         }
      }
   }

   public lIlIIllI() {
      int var1 = -357799257;
      super(IlIIllIII.Ill(Ill[5]), lllIIlIl.IIl, IlIIllIII.Ill(Ill[2]), true);
      this.IlI = this.IllIIll(new IllIII<>(IlIIllIII.Ill(Ill[4]), IlllIlIl.class, IlllIlIl.Il));
      this.IIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Ill[0]), true));
      this.II = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(Ill[3]),
            new Color(
               lIl(1688281270, var1 ^ 1540559313), lIl(1688281271, var1 ^ -2107437967), lIl(1688281268, var1 ^ 430185264), lIl(1688281269, var1 ^ -1011253793)
            )
         )
      );
      this.Il = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(Ill[lIl(1688281266, var1 ^ 1133487018)]), 96.0, 8.0, 256.0, 4.0).IlII(IlIIllIII.lI(Ill[lIl(1688281267, var1 ^ 1827955849)]))
      );
      this.llI = this.IllIIll(new IIlIII(IlIIllIII.Ill(Ill[1]), 1.5, 0.5, 4.0, 0.1).lIlI(this::ll));
      this.lIl = new IllIlI<>();
      this.III = new ArrayList<>();
   }

   private static String Ill(char[] var0, long var1, int var3) {
      int var4 = lIl(1688281264, 1443103197 ^ 217983149) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIl(1688281265, 1443103197 ^ -328055190);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static int lIl(int var0, int var1) {
      int var2 = lll[var0 ^ 1688281478] ^ var1 ^ var0;
      var2 += 49734;
      var2 -= 15424;
      var2 ^= 19297;
      var2 += 39822;
      var2 -= 59259;
      var2 += 53245;
      var2 -= 51010;
      var2 -= 28937;
      return var2 ^ 293;
   }

   private String lII(class_1799 var1) {
      String var2 = var1.method_7964().getString();
      if (var1.method_7947() > 1) {
         String var10001 = IlIIllIII.lI(Ill[lIl(1688281278, 1632980279 ^ 693863104)]);
         int var5 = var1.method_7947();
         String var4 = var10001;
         var2 = var2 + var4 + var5;
      }

      return var2;
   }
}
