package k74.x;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class IlIIIlll {
   private static final double I = 620.0;
   lllIll II;
   double Il;
   private static final String[] lI;
   private boolean ll;
   private static final double III = 380.0;
   IIllIIl IIl;
   private final Set<Long> IlI;
   double Ill;
   double lII;
   private boolean lIl;
   private static final String[] IIIlI;
   double llI;
   double lll;
   double IIII;
   double IIIl;
   IlIlll IIlI;
   private static final double IIll = 420.0;
   double IlII;
   double IlIl;
   private long IllI;
   private static final double Illl = 1.75;
   private static final double lIII = 380.0;
   private long lIIl;
   private final EnumMap<lllIIlIl, Double> lIlI;
   private boolean lIll;
   private static final int[] IIIIl;
   double llII;
   double llIl;
   private static final String[] l;
   private static final Object[] IIIll;
   lllIIlIl lllI = lllIIlIl.I;
   private static final double llll = 0.36;
   double IIIII;

   private static Long I(JsonObject param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 05: astore 2
      // 06: aload 2
      // 07: ifnull 18
      // 0a: aload 2
      // 0b: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 0e: ifne 20
      // 11: goto 18
      // 14: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aconst_null
      // 19: goto 27
      // 1c: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: aload 2
      // 21: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 24: invokestatic k74/x/IlIIIlll.llI (Ljava/lang/String;)Ljava/lang/Long;
      // 27: areturn
   }

   private static <E extends Enum<E>> E l(JsonObject param0, String param1, E[] param2, E param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 05: astore 4
      // 07: aload 4
      // 09: ifnull 1b
      // 0c: aload 4
      // 0e: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 11: ifne 21
      // 14: goto 1b
      // 17: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1a: athrow
      // 1b: aload 3
      // 1c: areturn
      // 1d: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 20: athrow
      // 21: aload 4
      // 23: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 26: istore 5
      // 28: iload 5
      // 2a: iflt 40
      // 2d: iload 5
      // 2f: aload 2
      // 30: arraylength
      // 31: if_icmpge 40
      // 34: goto 3b
      // 37: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3a: athrow
      // 3b: aload 2
      // 3c: iload 5
      // 3e: aaload
      // 3f: areturn
      // 40: goto 45
      // 43: astore 5
      // 45: aload 4
      // 47: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 4a: astore 5
      // 4c: aload 2
      // 4d: astore 6
      // 4f: aload 6
      // 51: arraylength
      // 52: istore 7
      // 54: bipush 0
      // 55: istore 8
      // 57: iload 8
      // 59: iload 7
      // 5b: if_icmpge 7c
      // 5e: aload 6
      // 60: iload 8
      // 62: aaload
      // 63: astore 9
      // 65: aload 9
      // 67: aload 5
      // 69: invokestatic k74/x/IllIl.l (Ljava/lang/Enum;Ljava/lang/String;)Z
      // 6c: ifeq 76
      // 6f: aload 9
      // 71: areturn
      // 72: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 75: athrow
      // 76: iinc 8 1
      // 79: goto 57
      // 7c: aload 3
      // 7d: areturn
   }

   void II(int var1, int var2) {
      this.IIIl = lll(this.IIIl, 420.0, Math.max(420.0, var1 - 12.0));
      this.lII = lll(this.lII, 380.0, Math.max(380.0, var2 - 48.0));
      this.llI = lll(this.llI, 4.0, Math.max(4.0, var1 - this.IIIl - 4.0));
      this.lll = lll(this.lll, 4.0, Math.max(4.0, var2 - this.lII - 8.0));
      this.IIII = lll(this.IIII, 4.0, Math.max(4.0, var1 - 356.0));
      this.llIl = lll(this.llIl, 4.0, Math.max(4.0, var2 - 34.0));
   }

   private static String Il(JsonObject param0, String param1, String param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 05: ifeq 1a
      // 08: aload 0
      // 09: aload 1
      // 0a: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0d: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 10: ifne 20
      // 13: goto 1a
      // 16: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: aload 2
      // 1b: areturn
      // 1c: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 25: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 28: areturn
      // 29: astore 3
      // 2a: aload 2
      // 2b: areturn
   }

   private double lI(int var1) {
      return lll(380.0, 380.0, Math.max(380.0, var1 - 54.0));
   }

   void ll(IlIIIIIIl var1) {
      try {
         if (var1 == null) {
            return;
         }
      } catch (RuntimeException var5) {
         throw lIl(var5);
      }

      long var2 = var1.IIllllI();

      try {
         if (!this.IlI.remove(var2)) {
            this.IlI.add(var2);
            this.IllI = var2;
            this.lIl = true;
         }
      } catch (RuntimeException var4) {
         throw lIl(var4);
      }
   }

   private static String III(int var0, int var1) {
      int var9 = 1795844996;
      int var2 = (var0 ^ IIIII(-567484354, var9 ^ 722565079)) & IIIII(-567484353, var9 ^ 2032153202);
      if (lI[var2] == null) {
         char[] var3 = l[var2].toCharArray();

         int var4 = switch (var3[0] & IIIII(-567484356, var9 ^ 1083606015)) {
            case 0 -> IIIII(-567484355, var9 ^ 1252614729);
            case 1 -> IIIII(-567484358, var9 ^ 1414502495);
            case 2 -> IIIII(-567484357, var9 ^ -2031584756);
            case 3 -> IIIII(-567484360, var9 ^ 1135477947);
            case 4 -> IIIII(-567484359, var9 ^ 951339830);
            case 5 -> IIIII(-567484362, var9 ^ 1919303935);
            case 6 -> IIIII(-567484361, var9 ^ 297670921);
            case 7 -> IIIII(-567484364, var9 ^ 403657209);
            case 8 -> IIIII(-567484363, var9 ^ 708602120);
            case 9 -> IIIII(-567484366, var9 ^ 234076780);
            case 10 -> IIIII(-567484365, var9 ^ -1338602800);
            case 11 -> IIIII(-567484368, var9 ^ 1967701731);
            case 12 -> IIIII(-567484367, var9 ^ -189788302);
            case 13 -> IIIII(-567484370, var9 ^ -639327586);
            case 14 -> IIIII(-567484369, var9 ^ 1393382886);
            case 15 -> IIIII(-567484372, var9 ^ -29114289);
            case 16 -> IIIII(-567484371, var9 ^ -96594208);
            case 17 -> IIIII(-567484374, var9 ^ 1224368908);
            case 18 -> IIIII(-567484373, var9 ^ 1534655980);
            case 19 -> IIIII(-567484376, var9 ^ -290001819);
            case 20 -> IIIII(-567484375, var9 ^ -87763013);
            case 21 -> IIIII(-567484378, var9 ^ 127685659);
            case 22 -> IIIII(-567484377, var9 ^ 1855968854);
            case 23 -> IIIII(-567484380, var9 ^ 543167645);
            case 24 -> IIIII(-567484379, var9 ^ -774238315);
            case 25 -> IIIII(-567484382, var9 ^ -131116792);
            case 26 -> IIIII(-567484381, var9 ^ -54931666);
            case 27 -> IIIII(-567484384, var9 ^ -340152444);
            case 28 -> IIIII(-567484383, var9 ^ 333231257);
            case 29 -> IIIII(-567484386, var9 ^ -1451910139);
            case 30 -> IIIII(-567484385, var9 ^ 1696625249);
            case 31 -> IIIII(-567484388, var9 ^ -327199115);
            case 32 -> IIIII(-567484387, var9 ^ 111773816);
            case 33 -> IIIII(-567484390, var9 ^ -1991461120);
            case 34 -> IIIII(-567484389, var9 ^ 1674815339);
            case 35 -> IIIII(-567484392, var9 ^ -1926306881);
            case 36 -> IIIII(-567484391, var9 ^ 121902607);
            case 37 -> IIIII(-567484394, var9 ^ -96088454);
            case 38 -> IIIII(-567484393, var9 ^ 695205415);
            case 39 -> IIIII(-567484396, var9 ^ -885758887);
            case 40 -> IIIII(-567484395, var9 ^ -2147168793);
            case 41 -> IIIII(-567484398, var9 ^ 1916101311);
            case 42 -> IIIII(-567484397, var9 ^ 1773492596);
            case 43 -> IIIII(-567484400, var9 ^ 1305749903);
            case 44 -> IIIII(-567484399, var9 ^ 9496388);
            case 45 -> IIIII(-567484402, var9 ^ -1388550296);
            case 46 -> IIIII(-567484401, var9 ^ 1650848389);
            case 47 -> IIIII(-567484404, var9 ^ -1956735949);
            case 48 -> IIIII(-567484403, var9 ^ -193709689);
            case 49 -> IIIII(-567484406, var9 ^ -867607890);
            case 50 -> IIIII(-567484405, var9 ^ 1235999570);
            case 51 -> IIIII(-567484408, var9 ^ -842638528);
            case 52 -> IIIII(-567484407, var9 ^ 849570607);
            case 53 -> IIIII(-567484410, var9 ^ -2015370155);
            case 54 -> IIIII(-567484409, var9 ^ -1549504892);
            case 55 -> IIIII(-567484412, var9 ^ 1174263173);
            case 56 -> IIIII(-567484411, var9 ^ 994200585);
            case 57 -> IIIII(-567484414, var9 ^ -776962784);
            case 58 -> IIIII(-567484413, var9 ^ 1149740055);
            case 59 -> IIIII(-567484416, var9 ^ 1187480565);
            case 60 -> IIIII(-567484415, var9 ^ 1776803612);
            case 61 -> IIIII(-567484290, var9 ^ 697590860);
            case 62 -> IIIII(-567484289, var9 ^ -238413974);
            case 63 -> IIIII(-567484292, var9 ^ 2054486963);
            case 64 -> IIIII(-567484291, var9 ^ 956618955);
            case 65 -> IIIII(-567484294, var9 ^ -1539657125);
            case 66 -> IIIII(-567484293, var9 ^ -1791197238);
            case 67 -> IIIII(-567484296, var9 ^ 1171037967);
            case 68 -> IIIII(-567484295, var9 ^ -2032373364);
            case 69 -> IIIII(-567484298, var9 ^ -259820238);
            case 70 -> IIIII(-567484297, var9 ^ 1864469223);
            case 71 -> IIIII(-567484300, var9 ^ -541972118);
            case 72 -> IIIII(-567484299, var9 ^ -1977921137);
            case 73 -> IIIII(-567484302, var9 ^ 1123640851);
            case 74 -> IIIII(-567484301, var9 ^ -1948244794);
            case 75 -> IIIII(-567484304, var9 ^ -344707462);
            case 76 -> IIIII(-567484303, var9 ^ 1577730857);
            case 77 -> 3;
            case 78 -> IIIII(-567484306, var9 ^ 1939352972);
            case 79 -> IIIII(-567484305, var9 ^ -518832511);
            case 80 -> IIIII(-567484308, var9 ^ -930680269);
            case 81 -> IIIII(-567484307, var9 ^ 690188397);
            case 82 -> IIIII(-567484310, var9 ^ 1310715856);
            case 83 -> IIIII(-567484309, var9 ^ 1826668184);
            case 84 -> IIIII(-567484312, var9 ^ -445902025);
            case 85 -> IIIII(-567484311, var9 ^ 2027649103);
            case 86 -> IIIII(-567484314, var9 ^ 1401254013);
            case 87 -> IIIII(-567484313, var9 ^ -992432293);
            case 88 -> IIIII(-567484316, var9 ^ 686130546);
            case 89 -> IIIII(-567484315, var9 ^ 594808347);
            case 90 -> IIIII(-567484318, var9 ^ 955541592);
            case 91 -> IIIII(-567484317, var9 ^ -273895413);
            case 92 -> IIIII(-567484320, var9 ^ -83637985);
            case 93 -> IIIII(-567484319, var9 ^ -1557449111);
            case 94 -> IIIII(-567484322, var9 ^ 1151817799);
            case 95 -> IIIII(-567484321, var9 ^ 138226420);
            case 96 -> IIIII(-567484324, var9 ^ -1783860755);
            case 97 -> IIIII(-567484323, var9 ^ 1946363492);
            case 98 -> IIIII(-567484326, var9 ^ -280200721);
            case 99 -> IIIII(-567484325, var9 ^ 1175558661);
            case 100 -> IIIII(-567484328, var9 ^ -1878986197);
            case 101 -> IIIII(-567484327, var9 ^ -1109184076);
            case 102 -> IIIII(-567484330, var9 ^ 1185847813);
            case 103 -> IIIII(-567484329, var9 ^ 1269367193);
            case 104 -> IIIII(-567484332, var9 ^ 956725060);
            case 105 -> IIIII(-567484331, var9 ^ 1540952450);
            case 106 -> IIIII(-567484334, var9 ^ 2132621582);
            case 107 -> IIIII(-567484333, var9 ^ -279401336);
            case 108 -> IIIII(-567484336, var9 ^ -1437661204);
            case 109 -> IIIII(-567484335, var9 ^ 375739257);
            case 110 -> IIIII(-567484338, var9 ^ -1376084120);
            case 111 -> IIIII(-567484337, var9 ^ -455040905);
            case 112 -> IIIII(-567484340, var9 ^ 17973208);
            case 113 -> IIIII(-567484339, var9 ^ -2145856286);
            case 114 -> IIIII(-567484342, var9 ^ -860550533);
            case 115 -> IIIII(-567484341, var9 ^ 188290524);
            case 116 -> IIIII(-567484344, var9 ^ 1693884478);
            case 117 -> IIIII(-567484343, var9 ^ 1875471388);
            case 118 -> IIIII(-567484346, var9 ^ 618039574);
            case 119 -> IIIII(-567484345, var9 ^ 1760360285);
            case 120 -> IIIII(-567484348, var9 ^ -1084365251);
            case 121 -> 1;
            case 122 -> IIIII(-567484347, var9 ^ 405750806);
            case 123 -> IIIII(-567484350, var9 ^ 2082881164);
            case 124 -> IIIII(-567484349, var9 ^ 86497992);
            case 125 -> IIIII(-567484352, var9 ^ 1054443168);
            case 126 -> IIIII(-567484351, var9 ^ -1530468643);
            case 127 -> IIIII(-567484226, var9 ^ -2045449817);
            case 128 -> IIIII(-567484225, var9 ^ 847974109);
            case 129 -> IIIII(-567484228, var9 ^ -162782562);
            case 130 -> IIIII(-567484227, var9 ^ -1055773304);
            case 131 -> IIIII(-567484230, var9 ^ 1491272457);
            case 132 -> IIIII(-567484229, var9 ^ 2069064828);
            case 133 -> IIIII(-567484232, var9 ^ 261672999);
            case 134 -> IIIII(-567484231, var9 ^ -1517959714);
            case 135 -> IIIII(-567484234, var9 ^ 769793011);
            case 136 -> IIIII(-567484233, var9 ^ 954007926);
            case 137 -> IIIII(-567484236, var9 ^ -1074430413);
            case 138 -> IIIII(-567484235, var9 ^ 1785650132);
            case 139 -> IIIII(-567484238, var9 ^ -1408411087);
            case 140 -> IIIII(-567484237, var9 ^ -1054325331);
            case 141 -> IIIII(-567484240, var9 ^ 2040427507);
            case 142 -> IIIII(-567484239, var9 ^ -317671825);
            case 143 -> IIIII(-567484242, var9 ^ 1830513641);
            case 144 -> IIIII(-567484241, var9 ^ -986374765);
            case 145 -> IIIII(-567484244, var9 ^ -2031997155);
            case 146 -> IIIII(-567484243, var9 ^ -1654762498);
            case 147 -> IIIII(-567484246, var9 ^ 1994002499);
            case 148 -> IIIII(-567484245, var9 ^ 1571416566);
            case 149 -> IIIII(-567484248, var9 ^ 249008803);
            case 150 -> IIIII(-567484247, var9 ^ 698112949);
            case 151 -> IIIII(-567484250, var9 ^ -43363788);
            case 152 -> IIIII(-567484249, var9 ^ 569209518);
            case 153 -> IIIII(-567484252, var9 ^ -521152219);
            case 154 -> IIIII(-567484251, var9 ^ -35293683);
            case 155 -> IIIII(-567484254, var9 ^ 982788819);
            case 156 -> IIIII(-567484253, var9 ^ 1427112686);
            case 157 -> IIIII(-567484256, var9 ^ -1627895255);
            case 158 -> IIIII(-567484255, var9 ^ 1372504703);
            case 159 -> IIIII(-567484258, var9 ^ -514261611);
            case 160 -> IIIII(-567484257, var9 ^ -696405007);
            case 161 -> 2;
            case 162 -> IIIII(-567484260, var9 ^ -296257234);
            case 163 -> IIIII(-567484259, var9 ^ -772198636);
            case 164 -> IIIII(-567484262, var9 ^ -660393006);
            case 165 -> IIIII(-567484261, var9 ^ -771320111);
            case 166 -> IIIII(-567484264, var9 ^ -101465716);
            case 167 -> IIIII(-567484263, var9 ^ 1729955328);
            case 168 -> IIIII(-567484266, var9 ^ -168418897);
            case 169 -> IIIII(-567484265, var9 ^ 1192135944);
            case 170 -> IIIII(-567484268, var9 ^ -612118569);
            case 171 -> IIIII(-567484267, var9 ^ 112384698);
            case 172 -> IIIII(-567484270, var9 ^ 860708059);
            case 173 -> IIIII(-567484269, var9 ^ 122081378);
            case 174 -> IIIII(-567484272, var9 ^ 258165909);
            case 175 -> IIIII(-567484271, var9 ^ 207702103);
            case 176 -> IIIII(-567484274, var9 ^ -616450221);
            case 177 -> IIIII(-567484273, var9 ^ 1394197853);
            case 178 -> IIIII(-567484276, var9 ^ 1502633928);
            case 179 -> IIIII(-567484275, var9 ^ 2020113401);
            case 180 -> IIIII(-567484278, var9 ^ 115713896);
            case 181 -> IIIII(-567484277, var9 ^ -492355258);
            case 182 -> IIIII(-567484280, var9 ^ -1042125733);
            case 183 -> IIIII(-567484279, var9 ^ 542164872);
            case 184 -> IIIII(-567484282, var9 ^ 1397582829);
            case 185 -> IIIII(-567484281, var9 ^ 710506087);
            case 186 -> IIIII(-567484284, var9 ^ -2107944988);
            case 187 -> IIIII(-567484283, var9 ^ -929694965);
            case 188 -> IIIII(-567484286, var9 ^ -1526375159);
            case 189 -> IIIII(-567484285, var9 ^ 765058264);
            case 190 -> 5;
            case 191 -> IIIII(-567484288, var9 ^ 1878090720);
            case 192 -> IIIII(-567484287, var9 ^ -776661263);
            case 193 -> IIIII(-567484162, var9 ^ 469789055);
            case 194 -> IIIII(-567484161, var9 ^ 973640508);
            case 195 -> IIIII(-567484164, var9 ^ -889564679);
            case 196 -> IIIII(-567484163, var9 ^ -1613620060);
            case 197 -> IIIII(-567484166, var9 ^ -1168761994);
            case 198 -> IIIII(-567484165, var9 ^ 1798370876);
            case 199 -> IIIII(-567484168, var9 ^ 430759572);
            case 200 -> IIIII(-567484167, var9 ^ -908668911);
            case 201 -> IIIII(-567484170, var9 ^ 259233838);
            case 202 -> 4;
            case 203 -> IIIII(-567484169, var9 ^ 1299319789);
            case 204 -> IIIII(-567484172, var9 ^ -355437818);
            case 205 -> IIIII(-567484171, var9 ^ 1622316523);
            case 206 -> IIIII(-567484174, var9 ^ 736362673);
            case 207 -> IIIII(-567484173, var9 ^ 2040715900);
            case 208 -> IIIII(-567484176, var9 ^ -731643249);
            case 209 -> IIIII(-567484175, var9 ^ -1502290685);
            case 210 -> IIIII(-567484178, var9 ^ 612830969);
            case 211 -> IIIII(-567484177, var9 ^ 708053547);
            case 212 -> IIIII(-567484180, var9 ^ -1243065616);
            case 213 -> IIIII(-567484179, var9 ^ 1058198091);
            case 214 -> IIIII(-567484182, var9 ^ 2086465003);
            case 215 -> IIIII(-567484181, var9 ^ 102620346);
            case 216 -> IIIII(-567484184, var9 ^ 1551363748);
            case 217 -> IIIII(-567484183, var9 ^ 2035876243);
            case 218 -> IIIII(-567484186, var9 ^ -1445024273);
            case 219 -> IIIII(-567484185, var9 ^ -1105496432);
            case 220 -> 0;
            case 221 -> IIIII(-567484188, var9 ^ -1803143867);
            case 222 -> IIIII(-567484187, var9 ^ -1013788070);
            case 223 -> IIIII(-567484190, var9 ^ -1641784054);
            case 224 -> IIIII(-567484189, var9 ^ 1951116269);
            case 225 -> IIIII(-567484192, var9 ^ 1055432170);
            case 226 -> IIIII(-567484191, var9 ^ -280756526);
            case 227 -> IIIII(-567484194, var9 ^ 1280983454);
            case 228 -> IIIII(-567484193, var9 ^ -1417578973);
            case 229 -> IIIII(-567484196, var9 ^ 963809062);
            case 230 -> IIIII(-567484195, var9 ^ 1792545866);
            case 231 -> IIIII(-567484198, var9 ^ 1259529299);
            case 232 -> IIIII(-567484197, var9 ^ -598076026);
            case 233 -> IIIII(-567484200, var9 ^ -705986859);
            case 234 -> IIIII(-567484199, var9 ^ 1482897984);
            case 235 -> IIIII(-567484202, var9 ^ -974170840);
            case 236 -> IIIII(-567484201, var9 ^ -2025872379);
            case 237 -> IIIII(-567484204, var9 ^ 1062744215);
            case 238 -> IIIII(-567484203, var9 ^ -1236472476);
            case 239 -> IIIII(-567484206, var9 ^ 277862005);
            case 240 -> IIIII(-567484205, var9 ^ -73440119);
            case 241 -> IIIII(-567484208, var9 ^ 101046371);
            case 242 -> IIIII(-567484207, var9 ^ -204306238);
            case 243 -> IIIII(-567484210, var9 ^ -1960283714);
            case 244 -> IIIII(-567484209, var9 ^ -2070851378);
            case 245 -> IIIII(-567484212, var9 ^ -1306869103);
            case 246 -> IIIII(-567484211, var9 ^ 1836403625);
            case 247 -> IIIII(-567484214, var9 ^ -1717889068);
            case 248 -> IIIII(-567484213, var9 ^ 1060029329);
            case 249 -> IIIII(-567484216, var9 ^ 1889563944);
            case 250 -> IIIII(-567484215, var9 ^ 665789574);
            case 251 -> IIIII(-567484218, var9 ^ -161986520);
            case 252 -> IIIII(-567484217, var9 ^ 544863027);
            case 253 -> IIIII(-567484220, var9 ^ 1106279612);
            case 254 -> IIIII(-567484219, var9 ^ -247589004);
            default -> IIIII(-567484222, var9 ^ 637622718);
         };
         int var5 = (var1 & IIIII(-567484221, var9 ^ 646988729)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIIII(-567484224, var9 ^ -1865401542)) >>> IIIII(-567484223, var9 ^ -1417258538)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIIII(-567484098, var9 ^ 551535830);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIIII(-567484097, var9 ^ 782273083);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   private static int IIIII(int var0, int var1) {
      int var2 = IIIIl[var0 ^ -567484354] ^ var1 ^ var0;
      var2 += 38507;
      var2 -= 52699;
      var2 -= 17504;
      var2 += 31728;
      var2 ^= 40705;
      var2 += 33666;
      var2 += 49974;
      var2 -= 18025;
      var2 -= 60237;
      return var2 + 20101;
   }

   private static String IIl(long var0) {
      int var5 = 821647212;
      String var2 = Long.toUnsignedString(var0, IIIII(-567484100, var5 ^ -319589814));
      StringBuilder var3 = new StringBuilder(IIIII(-567484099, var5 ^ -589389073)).append((char)IIIII(-567484102, var5 ^ -1293677746));
      int var4 = var2.length();

      try {
         while (var4 < IIIII(-567484101, var5 ^ -234650468)) {
            var3.append((char)IIIII(-567484104, var5 ^ -1515778604));
            var4++;
         }
      } catch (RuntimeException var6) {
         throw lIl(var6);
      }

      return var3.append(var2).toString();
   }

   JsonObject IlI() {
      int var7 = -684773760;
      JsonObject var1 = new JsonObject();

      try {
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484103, var7 ^ 1362594728), IIIII(-567484106, var7 ^ 1321384863))), this.llI);
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484105, var7 ^ -1155699976), IIIII(-567484108, var7 ^ 94804394))), this.lll);
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484107, var7 ^ -2029339762), IIIII(-567484110, var7 ^ -1770441644))), this.IIIl);
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484109, var7 ^ 1945767261), IIIII(-567484112, var7 ^ 1055958262))), this.lII);
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484111, var7 ^ -713610093), IIIII(-567484114, var7 ^ 1116908840))), this.IIII);
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484113, var7 ^ 1699756665), IIIII(-567484116, var7 ^ -1303349715))), this.llIl);
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484115, var7 ^ 828575544), IIIII(-567484118, var7 ^ 1858891862))), this.lllI.ordinal());
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484117, var7 ^ -2026626844), IIIII(-567484120, var7 ^ -566102066))), this.IIl.ordinal());
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484119, var7 ^ -2067076316), IIIII(-567484122, var7 ^ 1094807294))), this.II.ordinal());
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484121, var7 ^ 1911878193), IIIII(-567484124, var7 ^ 1688417664))), this.llII);
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484123, var7 ^ -301191523), IIIII(-567484126, var7 ^ -356927428))), this.IlII);
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484125, var7 ^ -686324729), IIIII(-567484128, var7 ^ -15843555))), this.IlIl);
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484127, var7 ^ 1083196359), IIIII(-567484130, var7 ^ -265575790))), this.Ill);
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484129, var7 ^ -1681206391), IIIII(-567484132, var7 ^ 1329495446))), this.IIIII);
         var1.addProperty(IlIIllIII.lI(III(IIIII(-567484131, var7 ^ -617844931), IIIII(-567484134, var7 ^ 715964535))), this.Il);
         if (this.lIl) {
            var1.addProperty(IlIIllIII.lI(III(IIIII(-567484133, var7 ^ -1236993826), IIIII(-567484136, var7 ^ -1926018302))), IIl(this.IllI));
         }
      } catch (RuntimeException var8) {
         throw lIl(var8);
      }

      try {
         if (this.ll) {
            var1.addProperty(IlIIllIII.lI(III(IIIII(-567484135, var7 ^ 1065587557), IIIII(-567484138, var7 ^ -1324006800))), IIl(this.lIIl));
         }
      } catch (RuntimeException var9) {
         throw lIl(var9);
      }

      JsonArray var2 = new JsonArray();

      for (lllIIlIl var6 : lllIIlIl.values()) {
         var2.add(this.lII(var6));
      }

      var1.add(IlIIllIII.lI(III(IIIII(-567484137, var7 ^ -1264555130), IIIII(-567484140, var7 ^ -1354566909))), var2);
      JsonArray var10 = new JsonArray();

      for (long var12 : this.IlI) {
         var10.add(IIl(var12));
      }

      var1.add(IlIIllIII.lI(III(IIIII(-567484139, var7 ^ -90089912), IIIII(-567484142, var7 ^ 1446570829))), var10);
      return var1;
   }

   private static lllIll Ill(JsonObject param0, String param1, lllIll param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 05: astore 3
      // 06: aload 3
      // 07: ifnull 18
      // 0a: aload 3
      // 0b: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 0e: ifne 1e
      // 11: goto 18
      // 14: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 2
      // 19: areturn
      // 1a: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: aload 3
      // 1f: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 22: istore 4
      // 24: invokestatic k74/x/lllIll.values ()[Lk74/x/lllIll;
      // 27: astore 5
      // 29: iload 4
      // 2b: iflt 43
      // 2e: iload 4
      // 30: aload 5
      // 32: arraylength
      // 33: if_icmpge 43
      // 36: goto 3d
      // 39: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3c: athrow
      // 3d: aload 5
      // 3f: iload 4
      // 41: aaload
      // 42: areturn
      // 43: goto 48
      // 46: astore 4
      // 48: aload 3
      // 49: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 4c: invokestatic k74/x/lllIll.I (Ljava/lang/String;)Lk74/x/lllIll;
      // 4f: areturn
   }

   double lII(lllIIlIl var1) {
      return this.lIlI.getOrDefault(var1, 0.0);
   }

   private static RuntimeException lIl(RuntimeException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1649577528;
      int var16 = 0;
      String[] var15 = new String[2];
      short var18 = 25155;
      int var14 = "ǫ뾋仰븋\u0eee멋\u0ee4뿃\u2ef9밣껣뱃⻤봃껹믻⻫뵫\u0efe볋\ueee2뢣仠볣\u0efe맻⻬뺳\u2eff붋軩먫\u0eea뵃仨뽫껵뤣\ueee0붫껷뫳\ueeff맳軺뷳⻬뻳컶벳軰멛滸믣\u0eee뮣仨뫃\ueeff볛軾룛軧뤛\u0ef7맻컥뻛滱뤋\u0ee0뤋컷밋份믫軺릛滪뢻⻦륋軣맋軵뵃仾뵳仱볃⻪뻋\u0ee1롣\u0efb봋\u0eee뵣\u2efd몫滺붋\u0efd륫껿믋\ueef5빃컹뽣\u0eed뫓\ueee5뷫軱뺻\u0ef8믳껠뻛껰뵳軹붫滷뵃滪멳滠붻껷뵓\u0eec뮃軥뵓仡봻⻰뼣\ueefd믃滷륫\ueee5빣껬뺳滰빣컢뫻滽릫転륃軶륛껱뾋컧묫\u2efe뱋\u2efa벣컿먣\ueef5뵫仧렓\ueef5맫\ueee6밋\u2efb뢳\u2efa빳⻣븫軿뿋\u0ef3뺋\u0ef7뱓\u0efe뾃滰뵳\u0eea볳\ueee7뢫令빓軥뺃\u0ef9륓껷뫋仧먓滳뽓컹뵋⻭뮋\u0ee5뼃껣맛滱릫軮볛滣뫛껭룫軴뫫\ueefe뤛⻣뵫껥먫滿붛껲븻仦묓滷릋⻡뺫滶뵃\ueeec뷣転벫仮몛\ueefc릻\u2ef4뢣껳륫\ueee1뚛껓뙃໔됫\ueecd둋컇땫\u0ecf딫໊뗛軃넻໘뉫컁뇳軋뜣仒떣什뎓껌럳滓놃컌뎃ໜ뗃껇늻컀댓付닫컖끳ໟ댫껌똋\ueec4눛軇뜻컋띃滌딫\ueec9랃\ueed8둓໓뛣\ueec7뇃滔뀋滓뜋껕뚋컞띻컎됳什낣\ueec1럫軄뗫\ueed4듣껎딫⻂띛滀끳軈랫껂뒛\ueec4늃\ueed2뛻滘눳\ueed6뇓컟뗓컝돫仔뛛\ueec7둃⻆띓\ueedc뇃໒끋컚눻仛듓껝랃滉늃껁띳軖띣軓뇛⻋뚻컒됳滅뙋⻒뚛軎뒃컞됃껝끫滀똣軅딻滔딣滃둣\ueedc냃軑뀣軍듳滎딳滐뒻⻙낫仇닣\ueed6뚫\ueec8뙳\u0ec5똋ແ뙃컎땳⻙닋⻕랓껓넫껃늳車끫軈됫⻁뀃仚낣滛녛컒뛫滔둳軛럳껞둣\ueedf뎳껚럣⻍됋껃럃໙늫⻔뇳仁냳軓뉓仉끫滇럳軁끫滕딻껞떛⻎눛⻔돛滒넓仈럛ໆ뉋컑녓!ɴ뀟Ӥ뀏ń\uf015͌퀇дယÌစͬ퀅Ф\uf013Ƭ瀙Ռ〄ߜ\uf012ü뀄ǤသܜဘϤ倅ݔ瀒Ԕ"
         .length();
      int var17 = 0;
      String var13 = "ǫ뾋仰븋\u0eee멋\u0ee4뿃\u2ef9밣껣뱃⻤봃껹믻⻫뵫\u0efe볋\ueee2뢣仠볣\u0efe맻⻬뺳\u2eff붋軩먫\u0eea뵃仨뽫껵뤣\ueee0붫껷뫳\ueeff맳軺뷳⻬뻳컶벳軰멛滸믣\u0eee뮣仨뫃\ueeff볛軾룛軧뤛\u0ef7맻컥뻛滱뤋\u0ee0뤋컷밋份믫軺릛滪뢻⻦륋軣맋軵뵃仾뵳仱볃⻪뻋\u0ee1롣\u0efb봋\u0eee뵣\u2efd몫滺붋\u0efd륫껿믋\ueef5빃컹뽣\u0eed뫓\ueee5뷫軱뺻\u0ef8믳껠뻛껰뵳軹붫滷뵃滪멳滠붻껷뵓\u0eec뮃軥뵓仡봻⻰뼣\ueefd믃滷륫\ueee5빣껬뺳滰빣컢뫻滽릫転륃軶륛껱뾋컧묫\u2efe뱋\u2efa벣컿먣\ueef5뵫仧렓\ueef5맫\ueee6밋\u2efb뢳\u2efa빳⻣븫軿뿋\u0ef3뺋\u0ef7뱓\u0efe뾃滰뵳\u0eea볳\ueee7뢫令빓軥뺃\u0ef9륓껷뫋仧먓滳뽓컹뵋⻭뮋\u0ee5뼃껣맛滱릫軮볛滣뫛껭룫軴뫫\ueefe뤛⻣뵫껥먫滿붛껲븻仦묓滷릋⻡뺫滶뵃\ueeec뷣転벫仮몛\ueefc릻\u2ef4뢣껳륫\ueee1뚛껓뙃໔됫\ueecd둋컇땫\u0ecf딫໊뗛軃넻໘뉫컁뇳軋뜣仒떣什뎓껌럳滓놃컌뎃ໜ뗃껇늻컀댓付닫컖끳ໟ댫껌똋\ueec4눛軇뜻컋띃滌딫\ueec9랃\ueed8둓໓뛣\ueec7뇃滔뀋滓뜋껕뚋컞띻컎됳什낣\ueec1럫軄뗫\ueed4듣껎딫⻂띛滀끳軈랫껂뒛\ueec4늃\ueed2뛻滘눳\ueed6뇓컟뗓컝돫仔뛛\ueec7둃⻆띓\ueedc뇃໒끋컚눻仛듓껝랃滉늃껁띳軖띣軓뇛⻋뚻컒됳滅뙋⻒뚛軎뒃컞됃껝끫滀똣軅딻滔딣滃둣\ueedc냃軑뀣軍듳滎딳滐뒻⻙낫仇닣\ueed6뚫\ueec8뙳\u0ec5똋ແ뙃컎땳⻙닋⻕랓껓넫껃늳車끫軈됫⻁뀃仚낣滛녛컒뛫滔둳軛럳껞둣\ueedf뎳껚럣⻍됋껃럃໙늫⻔뇳仁냳軓뉓仉끫滇럳軁끫滕딻껞떛⻎눛⻔돛滒넓仈럛ໆ뉋컑녓!ɴ뀟Ӥ뀏ń\uf015͌퀇дယÌစͬ퀅Ф\uf013Ƭ瀙Ռ〄ߜ\uf012ü뀄ǤသܜဘϤ倅ݔ瀒Ԕ";

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << '\r') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> '\r') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIIlI = var15;
      IIIll = new Object[var15.length];
      int var9 = -1239220537;
      byte[] var7 = "×ê±.z$DW¼môÙ¶R\u0015\b¨´î´z\u0013\r3¿Ur\u001fÄO<t\u008e\u009d7\u009aíEoéäô'AÖÇ\u001f»ñ\bÌÆLÍüx\u0089³É¼\bKx3%\u001fÕÔ¯ö\"\u0089\u0002¸·d\u0006Åbt´\u0001\u0015ß§\u0083\u008a©\u0012M\u009a\u0089\u0006?¡¨ûg\"Ö\u0092d ¸Ü\u009bb\u009c-!{\u0010\u0004Ô%\u009e\u0000B¹'\u0017BÙ\u0088ï'ÃìU\u008eë\u0011\u0099Û\u0006Å\u0010\u0084 èúRÿ\u0012u·Á\u009a\u009f(Ð!qÕ\u0094Ñû¿`1\u0006¾¸AÕ\u0094\u0089I7Ï\u0012§|ÿ»}\u008eÎ\u0015Í\u0095N.\u0006±/^\u008fük\u0093æQÇ\u0011¸\u009e\u009e\u0085Îw¥ãu\b\u008fN\u009d0²-ýµP\u00ad¡1=-´ÎX\u001d¤{$\u0093\u001b__\u0018\n¹\u0006¢\u0081Ç¹:$-K\no¸|Ò(º<õ\u0014\u0095\u001c©ÐÕo\u0010\u0085\r1aÓ\u0086\u008f\u008d&Åÿ®xXÁÄ\u0016iÇ\bÛ¹7èaz'\u0006\u008b\fx\u0002\u0016\u0093ÚüF#I^Ivà'2¾\u0002\u0010\u0087w\u001bSÖ\u0017\u008fXé¢ñ7û\u008fc[r\u001dèH/4}\u0084vÕØ\u0006ö²ä\u009b\u0013\u0090\u001bÉú\u0019\u0097eÒ\u0084 \u000fi¯~\u000658#Ø\u007fÔ\u001eó\u0081ß\u008fxXÄ\u000f\u001eã\u0013WÆS\u0007ø¿J_ÐA\r¸\\.*ôÆ\\!iW\u0007n\u0088øQR\u0013·\r\u001bºêì£lû\u0085aA\u0018GtºUí\f·Rw\fÅý\u0003º§\"g3\u0083æMê\u0013£ÚAV´q\u0097ê\u009e$}Q\u0001éã\u0018\u001bÖ¼ýéH\u0087|ã£ä0N}S÷Âc¨\u0098\rÔÎ\u00932\u001azØ-ýû\u0094\u0017\u0080\u0017C¦\u0090\u0087äÔ2Æ\u0080ÝJsùÜ\u00adúÂ\"ñëX=\u0090\u000ezï\u009e\u001bÎpxó\n·U.=éY\u0099¤\u0018tÉ\u0087¨\u001añóc¦eY~³«Ñ\u0019mgÄ&v\u0086C\u000e\n#\u0096\u0095\u00ad@Pö,³=Ó3Ù\u0085e\u0005Ä\u0011ëÀ,\u0091à\u001d~9Îi\u0089z\u0019XÌa¥$\b\u008a!dX¡R\u009e\u0014ò,ä\u009dÕg,]\u0001\u0091$¬Ý\u0016\u0005Q\u001c\u0014¯\u0012\u0001\u001e\u0001¹Æo\\E©ëuXb\u0003<[\u00ad5´!\u001d£\u008bú*\u0086Ä(\u0012¬\r\u0014-\u0002YC$XD\u0006.ýâç\u0005\b¶Q\u009bæp½\t\rWÉ»õù:'x¸$úI¬¤Ï¶*\u009cû½§¬ó\u00988·ð\u009a>\u001e'ºÁX¯â² ¥k)£\u0084\u0093\r\u0080ú\u001eÑ\u007f\u001e\\78=\u0019\u001a3Ü«°\u0000¯¶\u001dHÖ¢\u0000c~ ;Â4n\u008d¶Yþ+VÑbª¬\u0093\n\u0015\u008f-NbÌàû\u001fBÆóå\u00036\u0001'\u009ac)hãF\u00adm¾\u0097Ë\u0081ÝåW©\u00055-§üó\u0088îV±\u0089|v\u0016+\u0005=\u009cIâ{×\u001ftë\u0085Y¬_(\u009fu%Z\u008f«!Ø|y\u0011ÖÏ~{I\u0013$ÆÃé¤.\u0080§\u0099¦úæ«% \u008c\u0099\u0012\u0085¢v*U%ÚUBà\u0001\u0004h}CM?i¥°bß)V\u0088°ÝæÂ\u0013ê\\\u0013¸\u0089[°¡7]Wz\u0001°Å\u0089øô\u0096#bª·é\u0093ö ¡c³)\u0010\tk¤\u0098LR9\u0014#`{ÄÐ}Ã£G@J·\u0099\u0010ìt {\u0007d\u0013Rúþ¯Þ\u000f)ü£wÓ\u0007\u009dxj&ÚNá´}\u0091\u008e=°e`a/ÃÕ´\u0018\u008c[\u0003\u0002ÛTRÛ\n£?\u0096Ü\u0082\u0085\u0011½\u000b\n\u008b\rÅ`ÄÚú/\u0087Úk4`\u0093ÔMàW}/4Ü$²òÒ[ü\u001eKû9µ{Öé\u0012\u0015ì@\u001fU\u000bÏd\u0002¯FÏ\u0011é\tZ\u000e\u001c©åûÃè\u0011Ex\u0002sÇÔ9|Ö§e\u00163$\u008f¢\u0081Ñ\u0012\u0017\u0095©®g\u0002LÅé%\u008e¸\u0098ò\u008eì¾q½\u008d4.\u0012h\u009aÇê¢ï\u009e\u009fð\u0088Ä\u0014iÙ\u0001\u009f<k1*p+$}fc®Ò¬\u0082ªg½ê\u0097É\u0006\u0003¿ÐÍ\u0080\u0000NÁ%°õÉ>Û\u0014Q¯\u000fàª \u009bòíéjr¦Mö\u009az\rÍí\u008aï\u007f]\u0011XñËWÕô~éSï\u009c\f§º\u007fÔ\u0088\u0016æ\u0012e0\u009f\u008aVå\u0011Ð°ñ rªÚ¼\u0018\u0015\u0013ß1\u001c(ýWÝö\u0006Õ\u000fúÀ3jE\u0003å\u0000/4Ç,}\u0015,³\u0086ö¡\b/±¬iÙ°4[o±\u0094×½Ë¹aÍ!¿\u0000óú5\u0093\u008dºU<wv\u0095oZô\u0001`Y|£ìr\u0092¤¨\t9õûoüèU\u0016äÞ8Ed\u009fÝ\u007f'\u000fàûÜ©Gè\u0095\u0002¹÷\n@ÚÀÞû¢9;7\u009al\u0013ñAb}Ü\u0088+0ÿcxg-%ê¢\u008d¦\u001a\u0016¦CÖùQ\u008b½\u0093«\u0088î\u008e<\u0097\f\u001bw.÷ÈÓüýÖ~ô|]üÃbäÈUr¥\u0080e\u0015\u008e\u0089Î8{Ì\u000fV\u001d%\u008f[\u009b«þ\u000bÖ¡Ú)¾dApÏ$j\u007f¸h6gÀ\u0006²jé09º\u0085Õ\u0084Bú\u0093\u0002"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IIIIl = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IIIIl[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[IIIII(-567484146, var23 ^ 790596250)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIIIl((short)18951, 13, 739105138)).length();
      int var1 = IIIII(-567484145, var23 ^ -428039292);
      int var25 = -1;

      label90:
      while (true) {
         int var10000 = 5;
         String var28 = var2.substring(++var25, var25 + var1);
         byte var35 = -1;

         while (true) {
            label85: {
               char[] var44 = var28.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var10000;
               var40 = var44;
               int var33 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var47 = var10000;
                  var33 = var10004;
                  if (var10004 <= var6) {
                     break label85;
                  }

                  var56 = var44;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % IIIII(-567484149, var23 ^ -1331660907)) {
                     case 0 -> IIIII(-567484152, var23 ^ -627616346);
                     case 1 -> IIIII(-567484151, var23 ^ -2001289531);
                     case 2 -> IIIII(-567484154, var23 ^ 1934963611);
                     case 3 -> IIIII(-567484153, var23 ^ -636338444);
                     case 4 -> IIIII(-567484156, var23 ^ 739485294);
                     case 5 -> IIIII(-567484155, var23 ^ -1710094681);
                     default -> IIIII(-567484158, var23 ^ 1214786535);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var33 <= var6) {
                        break;
                     }

                     var56 = var40;
                     var10004 = var47;
                     var10006 = var6;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var35) {
               case 0:
                  var5[var3++] = var49;
                  if ((var25 += var1) >= var4) {
                     l = var5;
                     lI = new String[IIIII(-567484150, var23 ^ 258187745)];
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var49;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label90;
                  }

                  var4 = (var2 = IIIIl((short)-16899, (byte)118, 739105139)).length();
                  var1 = IIIII(-567484148, var23 ^ -580991674);
                  var25 = -1;
            }

            var10000 = IIIII(-567484147, var23 ^ 61163383);
            var28 = var2.substring(++var25, var25 + var1);
            var35 = 0;
         }
      }
   }

   private static Long llI(String param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 12
      // 04: aload 0
      // 05: invokevirtual java/lang/String.isBlank ()Z
      // 08: ifeq 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: aconst_null
      // 13: areturn
      // 14: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 17: athrow
      // 18: aload 0
      // 19: invokevirtual java/lang/String.length ()I
      // 1c: ldc_w -567484141
      // 1f: ldc_w -676971197
      // 22: ldc_w 1892199338
      // 25: ixor
      // 26: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 29: if_icmpne 62
      // 2c: aload 0
      // 2d: bipush 0
      // 2e: invokevirtual java/lang/String.charAt (I)C
      // 31: ldc_w -567484144
      // 34: ldc_w -676971197
      // 37: ldc_w -1522077212
      // 3a: ixor
      // 3b: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 3e: if_icmpne 62
      // 41: goto 48
      // 44: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 47: athrow
      // 48: aload 0
      // 49: bipush 1
      // 4a: invokevirtual java/lang/String.substring (I)Ljava/lang/String;
      // 4d: ldc_w -567484143
      // 50: ldc_w -676971197
      // 53: ldc_w -1309191337
      // 56: ixor
      // 57: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 5a: invokestatic java/lang/Long.parseUnsignedLong (Ljava/lang/String;I)J
      // 5d: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 60: areturn
      // 61: astore 1
      // 62: aload 0
      // 63: invokestatic k74/x/IlIIllIII.IlIl (Ljava/lang/String;)J
      // 66: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 69: areturn
   }

   private static double lll(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   private void IIII(int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: ldc2_w 420.0
      // 03: iload 1
      // 04: i2d
      // 05: ldc2_w 12.0
      // 08: dsub
      // 09: invokestatic java/lang/Math.max (DD)D
      // 0c: dstore 3
      // 0d: ldc2_w 380.0
      // 10: iload 2
      // 11: i2d
      // 12: ldc2_w 48.0
      // 15: dsub
      // 16: invokestatic java/lang/Math.max (DD)D
      // 19: dstore 5
      // 1b: aload 0
      // 1c: ldc2_w 620.0
      // 1f: dload 3
      // 20: invokestatic java/lang/Math.min (DD)D
      // 23: putfield k74/x/IlIIIlll.IIIl D
      // 26: aload 0
      // 27: ldc2_w 380.0
      // 2a: dload 5
      // 2c: invokestatic java/lang/Math.min (DD)D
      // 2f: putfield k74/x/IlIIIlll.lII D
      // 32: aload 0
      // 33: getfield k74/x/IlIIIlll.lII D
      // 36: dconst_0
      // 37: dcmpg
      // 38: ifle 52
      // 3b: aload 0
      // 3c: getfield k74/x/IlIIIlll.IIIl D
      // 3f: aload 0
      // 40: getfield k74/x/IlIIIlll.lII D
      // 43: ddiv
      // 44: ldc2_w 1.75
      // 47: dcmpg
      // 48: ifgt 57
      // 4b: goto 52
      // 4e: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 51: athrow
      // 52: return
      // 53: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 56: athrow
      // 57: aload 0
      // 58: aload 0
      // 59: getfield k74/x/IlIIIlll.lII D
      // 5c: ldc2_w 1.75
      // 5f: dmul
      // 60: ldc2_w 420.0
      // 63: dload 3
      // 64: invokestatic k74/x/IlIIIlll.lll (DDD)D
      // 67: putfield k74/x/IlIIIlll.IIIl D
      // 6a: aload 0
      // 6b: getfield k74/x/IlIIIlll.IIIl D
      // 6e: aload 0
      // 6f: getfield k74/x/IlIIIlll.lII D
      // 72: ddiv
      // 73: ldc2_w 1.75
      // 76: dcmpl
      // 77: ifle 95
      // 7a: aload 0
      // 7b: aload 0
      // 7c: getfield k74/x/IlIIIlll.IIIl D
      // 7f: ldc2_w 1.75
      // 82: ddiv
      // 83: ldc2_w 380.0
      // 86: dload 5
      // 88: invokestatic k74/x/IlIIIlll.lll (DDD)D
      // 8b: putfield k74/x/IlIIIlll.lII D
      // 8e: goto 95
      // 91: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 94: athrow
      // 95: return
   }

   private static double IIIl(JsonObject var0, Enum<?> var1, double var2) {
      if (!(var1 instanceof IllIl var4)) {
         return lIlI(var0, var1.name(), var2);
      } else {
         long var5 = var4.I();

         for (Entry var8 : var0.entrySet()) {
            try {
               if (IlIIllIII.IlIl((String)var8.getKey()) != var5 || !((JsonElement)var8.getValue()).isJsonPrimitive()) {
                  continue;
               }
            } catch (RuntimeException var11) {
               throw lIl(var11);
            }

            try {
               return ((JsonElement)var8.getValue()).getAsDouble();
            } catch (RuntimeException var10) {
               return var2;
            }
         }

         return var2;
      }
   }

   void IIlI() {
      this.IlI.clear();
      this.lIl = false;
   }

   void IIll(int var1, int var2) {
      IlIIIlll var10000;
      double var10001;
      label28: {
         try {
            var10000 = this;
            if (this.IIIl <= 0.0) {
               var10001 = this.lIII(var1);
               break label28;
            }
         } catch (RuntimeException var4) {
            throw lIl(var4);
         }

         var10001 = this.IIIl;
      }

      label21: {
         try {
            var10000.IIIl = lll(var10001, 420.0, Math.max(420.0, var1 - 12.0));
            var10000 = this;
            if (this.lII <= 0.0) {
               var10001 = this.lI(var2);
               break label21;
            }
         } catch (RuntimeException var3) {
            throw lIl(var3);
         }

         var10001 = this.lII;
      }

      var10000.lII = lll(var10001, 380.0, Math.max(380.0, var2 - 48.0));
      this.IIII(var1, var2);
      this.llI = Math.max(4.0, (var1 - this.IIIl) * 0.5);
      this.lll = Math.max(4.0, (var2 - this.lII) * 0.36);
      this.IIII = Math.max(4.0, (var1 - 348.0) * 0.5);
      this.llIl = Math.max(4.0, var2 - 42.0);
      this.lIll = true;
      this.II(var1, var2);
   }

   void IlII() {
      this.ll = false;
   }

   boolean IlIl(long param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IlIIIlll.ll Z
      // 04: ifeq 1f
      // 07: aload 0
      // 08: getfield k74/x/IlIIIlll.lIIl J
      // 0b: lload 1
      // 0c: lcmp
      // 0d: ifne 1f
      // 10: goto 17
      // 13: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 16: athrow
      // 17: bipush 1
      // 18: goto 20
      // 1b: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1e: athrow
      // 1f: bipush 0
      // 20: ireturn
   }

   IlIIIlll() {
      this.IIlI = IlIlll.I;
      this.IIl = IIllIIl.IIlIl;
      this.II = lllIll.Il;
      this.lIlI = new EnumMap<>(lllIIlIl.class);
      this.IlI = new HashSet<>();

      for (lllIIlIl var4 : lllIIlIl.values()) {
         this.lIlI.put(var4, 0.0);
      }
   }

   void IllI(int var1, int var2) {
      try {
         if (!this.lIll) {
            this.IIIl = this.lIII(var1);
            this.lII = this.lI(var2);
            this.llI = Math.max(8.0, (var1 - this.IIIl) * 0.5);
            this.lll = Math.max(10.0, (var2 - this.lII) * 0.36);
            this.IIII = Math.max(8.0, (var1 - 348.0) * 0.5);
            this.llIl = Math.max(8.0, var2 - 42.0);
            this.lIll = true;
         }
      } catch (RuntimeException var3) {
         throw lIl(var3);
      }

      this.II(var1, var2);
   }

   void Illl(IlIIIIIIl var1) {
      IlIIIlll var10000;
      boolean var10001;
      label28: {
         try {
            var10000 = this;
            if (var1 != null) {
               var10001 = true;
               break label28;
            }
         } catch (RuntimeException var3) {
            throw lIl(var3);
         }

         var10001 = false;
      }

      label21: {
         try {
            var10000.lIl = var10001;
            var10000 = this;
            if (var1 == null) {
               var5 = 0L;
               break label21;
            }
         } catch (RuntimeException var2) {
            throw lIl(var2);
         }

         var5 = var1.IIllllI();
      }

      var10000.IllI = var5;
   }

   private double lIII(int var1) {
      return lll(620.0, 420.0, Math.max(420.0, var1 - 16.0));
   }

   void lIIl(lllIIlIl var1, double var2) {
      this.lIlI.put(var1, Math.max(0.0, var2));
   }

   private static double lIlI(JsonObject param0, String param1, double param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 05: ifeq 1a
      // 08: aload 0
      // 09: aload 1
      // 0a: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 0d: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 10: ifne 20
      // 13: goto 1a
      // 16: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 19: athrow
      // 1a: dload 2
      // 1b: dreturn
      // 1c: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: aload 0
      // 21: aload 1
      // 22: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 25: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 28: dreturn
      // 29: astore 4
      // 2b: dload 2
      // 2c: dreturn
   }

   void lIll(JsonObject param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: ldc_w -358792021
      // 003: istore 11
      // 005: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 008: astore 2
      // 009: aload 1
      // 00a: ifnonnull 012
      // 00d: return
      // 00e: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 011: athrow
      // 012: aload 0
      // 013: aload 1
      // 014: ldc_w -567484157
      // 017: iload 11
      // 019: ldc_w -1337108504
      // 01c: ixor
      // 01d: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 020: ldc_w -567484160
      // 023: iload 11
      // 025: ldc_w -1902754849
      // 028: ixor
      // 029: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 02c: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 02f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 032: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 035: putfield k74/x/IlIIIlll.lIll Z
      // 038: aload 0
      // 039: aload 1
      // 03a: ldc_w -567484159
      // 03d: iload 11
      // 03f: ldc_w -254362154
      // 042: ixor
      // 043: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 046: ldc_w -567484034
      // 049: iload 11
      // 04b: ldc_w 169534301
      // 04e: ixor
      // 04f: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 052: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 055: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 058: aload 0
      // 059: getfield k74/x/IlIIIlll.llI D
      // 05c: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 05f: putfield k74/x/IlIIIlll.llI D
      // 062: aload 0
      // 063: aload 1
      // 064: ldc_w -567484033
      // 067: iload 11
      // 069: ldc_w 664332771
      // 06c: ixor
      // 06d: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 070: ldc_w -567484036
      // 073: iload 11
      // 075: ldc_w 605044040
      // 078: ixor
      // 079: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 07c: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 07f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 082: aload 0
      // 083: getfield k74/x/IlIIIlll.lll D
      // 086: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 089: putfield k74/x/IlIIIlll.lll D
      // 08c: aload 0
      // 08d: aload 1
      // 08e: ldc_w -567484035
      // 091: iload 11
      // 093: ldc_w 268323896
      // 096: ixor
      // 097: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 09a: ldc_w -567484038
      // 09d: iload 11
      // 09f: ldc_w 1951777759
      // 0a2: ixor
      // 0a3: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 0a6: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 0a9: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0ac: aload 0
      // 0ad: getfield k74/x/IlIIIlll.IIIl D
      // 0b0: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 0b3: putfield k74/x/IlIIIlll.IIIl D
      // 0b6: aload 0
      // 0b7: aload 1
      // 0b8: ldc_w -567484037
      // 0bb: iload 11
      // 0bd: ldc_w 311427285
      // 0c0: ixor
      // 0c1: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 0c4: ldc_w -567484040
      // 0c7: iload 11
      // 0c9: ldc_w 1804085912
      // 0cc: ixor
      // 0cd: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 0d0: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 0d3: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 0d6: aload 0
      // 0d7: getfield k74/x/IlIIIlll.lII D
      // 0da: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 0dd: putfield k74/x/IlIIIlll.lII D
      // 0e0: aload 0
      // 0e1: getfield k74/x/IlIIIlll.lII D
      // 0e4: ldc2_w 382.0
      // 0e7: dsub
      // 0e8: invokestatic java/lang/Math.abs (D)D
      // 0eb: dconst_1
      // 0ec: dcmpg
      // 0ed: iflt 102
      // 0f0: aload 0
      // 0f1: getfield k74/x/IlIIIlll.lII D
      // 0f4: ldc2_w 380.0
      // 0f7: dcmpl
      // 0f8: ifle 110
      // 0fb: goto 102
      // 0fe: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 101: athrow
      // 102: aload 0
      // 103: ldc2_w 380.0
      // 106: putfield k74/x/IlIIIlll.lII D
      // 109: goto 110
      // 10c: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 10f: athrow
      // 110: aload 0
      // 111: aload 1
      // 112: ldc_w -567484039
      // 115: iload 11
      // 117: ldc_w 940078923
      // 11a: ixor
      // 11b: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 11e: ldc_w -567484042
      // 121: iload 11
      // 123: ldc_w 38489091
      // 126: ixor
      // 127: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 12a: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 12d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 130: aload 0
      // 131: getfield k74/x/IlIIIlll.IIII D
      // 134: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 137: putfield k74/x/IlIIIlll.IIII D
      // 13a: aload 0
      // 13b: aload 1
      // 13c: ldc_w -567484041
      // 13f: iload 11
      // 141: ldc_w -2035269344
      // 144: ixor
      // 145: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 148: ldc_w -567484044
      // 14b: iload 11
      // 14d: ldc_w -1778800921
      // 150: ixor
      // 151: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 154: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 157: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 15a: aload 0
      // 15b: getfield k74/x/IlIIIlll.llIl D
      // 15e: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 161: putfield k74/x/IlIIIlll.llIl D
      // 164: aload 0
      // 165: aload 1
      // 166: ldc_w -567484043
      // 169: iload 11
      // 16b: ldc_w -1972983620
      // 16e: ixor
      // 16f: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 172: ldc_w -567484046
      // 175: iload 11
      // 177: ldc_w -1112378794
      // 17a: ixor
      // 17b: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 17e: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 181: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 184: aload 0
      // 185: getfield k74/x/IlIIIlll.llII D
      // 188: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 18b: putfield k74/x/IlIIIlll.llII D
      // 18e: aload 0
      // 18f: aload 1
      // 190: ldc_w -567484045
      // 193: iload 11
      // 195: ldc_w 1146609421
      // 198: ixor
      // 199: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 19c: ldc_w -567484048
      // 19f: iload 11
      // 1a1: ldc_w 293552978
      // 1a4: ixor
      // 1a5: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 1a8: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 1ab: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1ae: aload 0
      // 1af: getfield k74/x/IlIIIlll.IlII D
      // 1b2: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 1b5: putfield k74/x/IlIIIlll.IlII D
      // 1b8: aload 0
      // 1b9: aload 1
      // 1ba: ldc_w -567484047
      // 1bd: iload 11
      // 1bf: ldc_w 521221361
      // 1c2: ixor
      // 1c3: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 1c6: ldc_w -567484050
      // 1c9: iload 11
      // 1cb: ldc_w 1448879310
      // 1ce: ixor
      // 1cf: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 1d2: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 1d5: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 1d8: aload 0
      // 1d9: getfield k74/x/IlIIIlll.IlIl D
      // 1dc: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 1df: putfield k74/x/IlIIIlll.IlIl D
      // 1e2: aload 0
      // 1e3: aload 1
      // 1e4: ldc_w -567484049
      // 1e7: iload 11
      // 1e9: ldc_w 84657587
      // 1ec: ixor
      // 1ed: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 1f0: ldc_w -567484052
      // 1f3: iload 11
      // 1f5: ldc_w -1748045041
      // 1f8: ixor
      // 1f9: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 1fc: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 1ff: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 202: aload 0
      // 203: getfield k74/x/IlIIIlll.Ill D
      // 206: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 209: putfield k74/x/IlIIIlll.Ill D
      // 20c: aload 0
      // 20d: aload 1
      // 20e: ldc_w -567484051
      // 211: iload 11
      // 213: ldc_w 1736068820
      // 216: ixor
      // 217: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 21a: ldc_w -567484054
      // 21d: iload 11
      // 21f: ldc_w 1416269496
      // 222: ixor
      // 223: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 226: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 229: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 22c: aload 0
      // 22d: getfield k74/x/IlIIIlll.IIIII D
      // 230: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 233: putfield k74/x/IlIIIlll.IIIII D
      // 236: aload 0
      // 237: aload 1
      // 238: ldc_w -567484053
      // 23b: iload 11
      // 23d: ldc_w -1057012748
      // 240: ixor
      // 241: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 244: ldc_w -567484056
      // 247: iload 11
      // 249: ldc_w -1813898379
      // 24c: ixor
      // 24d: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 250: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 253: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 256: aload 0
      // 257: getfield k74/x/IlIIIlll.Il D
      // 25a: invokestatic k74/x/IlIIIlll.lIlI (Lcom/google/gson/JsonObject;Ljava/lang/String;D)D
      // 25d: putfield k74/x/IlIIIlll.Il D
      // 260: aload 1
      // 261: ldc_w -567484055
      // 264: iload 11
      // 266: ldc_w 1903664979
      // 269: ixor
      // 26a: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 26d: ldc_w -567484058
      // 270: iload 11
      // 272: ldc_w 1968898787
      // 275: ixor
      // 276: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 279: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 27c: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 27f: invokestatic k74/x/IlIIIlll.I (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/Long;
      // 282: astore 3
      // 283: aload 0
      // 284: aload 3
      // 285: ifnull 290
      // 288: bipush 1
      // 289: goto 291
      // 28c: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 28f: athrow
      // 290: bipush 0
      // 291: putfield k74/x/IlIIIlll.lIl Z
      // 294: aload 0
      // 295: aload 3
      // 296: ifnonnull 2a1
      // 299: lconst_0
      // 29a: goto 2a5
      // 29d: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2a0: athrow
      // 2a1: aload 3
      // 2a2: invokevirtual java/lang/Long.longValue ()J
      // 2a5: putfield k74/x/IlIIIlll.IllI J
      // 2a8: aload 1
      // 2a9: ldc_w -567484057
      // 2ac: iload 11
      // 2ae: ldc_w -2135255402
      // 2b1: ixor
      // 2b2: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 2b5: ldc_w -567484060
      // 2b8: iload 11
      // 2ba: ldc_w 20052713
      // 2bd: ixor
      // 2be: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 2c1: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 2c4: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 2c7: invokestatic k74/x/IlIIIlll.I (Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/Long;
      // 2ca: astore 4
      // 2cc: aload 0
      // 2cd: aload 4
      // 2cf: ifnull 2da
      // 2d2: bipush 1
      // 2d3: goto 2db
      // 2d6: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d9: athrow
      // 2da: bipush 0
      // 2db: putfield k74/x/IlIIIlll.ll Z
      // 2de: aload 0
      // 2df: aload 4
      // 2e1: ifnonnull 2ec
      // 2e4: lconst_0
      // 2e5: goto 2f1
      // 2e8: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2eb: athrow
      // 2ec: aload 4
      // 2ee: invokevirtual java/lang/Long.longValue ()J
      // 2f1: putfield k74/x/IlIIIlll.lIIl J
      // 2f4: aload 0
      // 2f5: aload 1
      // 2f6: ldc_w -567484059
      // 2f9: iload 11
      // 2fb: ldc_w 529014993
      // 2fe: ixor
      // 2ff: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 302: ldc_w -567484062
      // 305: iload 11
      // 307: ldc_w -264872369
      // 30a: ixor
      // 30b: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 30e: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 311: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 314: invokestatic k74/x/lllIIlIl.values ()[Lk74/x/lllIIlIl;
      // 317: aload 0
      // 318: getfield k74/x/IlIIIlll.lllI Lk74/x/lllIIlIl;
      // 31b: invokestatic k74/x/IlIIIlll.l (Lcom/google/gson/JsonObject;Ljava/lang/String;[Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/lang/Enum;
      // 31e: checkcast k74/x/lllIIlIl
      // 321: putfield k74/x/IlIIIlll.lllI Lk74/x/lllIIlIl;
      // 324: aload 0
      // 325: aload 1
      // 326: ldc_w -567484061
      // 329: iload 11
      // 32b: ldc_w 1759666503
      // 32e: ixor
      // 32f: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 332: ldc_w -567484064
      // 335: iload 11
      // 337: ldc_w 1159158753
      // 33a: ixor
      // 33b: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 33e: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 341: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 344: invokestatic k74/x/IIllIIl.values ()[Lk74/x/IIllIIl;
      // 347: aload 0
      // 348: getfield k74/x/IlIIIlll.IIl Lk74/x/IIllIIl;
      // 34b: invokestatic k74/x/IlIIIlll.l (Lcom/google/gson/JsonObject;Ljava/lang/String;[Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/lang/Enum;
      // 34e: checkcast k74/x/IIllIIl
      // 351: putfield k74/x/IlIIIlll.IIl Lk74/x/IIllIIl;
      // 354: aload 0
      // 355: aload 1
      // 356: ldc_w -567484063
      // 359: iload 11
      // 35b: ldc_w 728878344
      // 35e: ixor
      // 35f: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 362: ldc_w -567484066
      // 365: iload 11
      // 367: ldc_w 653773948
      // 36a: ixor
      // 36b: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 36e: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 371: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 374: aload 0
      // 375: getfield k74/x/IlIIIlll.II Lk74/x/lllIll;
      // 378: invokestatic k74/x/IlIIIlll.Ill (Lcom/google/gson/JsonObject;Ljava/lang/String;Lk74/x/lllIll;)Lk74/x/lllIll;
      // 37b: putfield k74/x/IlIIIlll.II Lk74/x/lllIll;
      // 37e: aload 1
      // 37f: ldc_w -567484065
      // 382: iload 11
      // 384: ldc_w 1991919992
      // 387: ixor
      // 388: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 38b: ldc_w -567484068
      // 38e: iload 11
      // 390: ldc_w 1423113726
      // 393: ixor
      // 394: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 397: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 39a: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 39d: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 3a0: astore 5
      // 3a2: aload 5
      // 3a4: ifnull 3fa
      // 3a7: aload 5
      // 3a9: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 3ac: ifeq 3fa
      // 3af: goto 3b6
      // 3b2: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3b5: athrow
      // 3b6: aload 5
      // 3b8: invokevirtual com/google/gson/JsonElement.getAsJsonArray ()Lcom/google/gson/JsonArray;
      // 3bb: astore 6
      // 3bd: invokestatic k74/x/lllIIlIl.values ()[Lk74/x/lllIIlIl;
      // 3c0: astore 7
      // 3c2: bipush 0
      // 3c3: istore 8
      // 3c5: iload 8
      // 3c7: aload 7
      // 3c9: arraylength
      // 3ca: if_icmpge 3f6
      // 3cd: iload 8
      // 3cf: aload 6
      // 3d1: invokevirtual com/google/gson/JsonArray.size ()I
      // 3d4: if_icmpge 3f6
      // 3d7: aload 0
      // 3d8: aload 7
      // 3da: iload 8
      // 3dc: aaload
      // 3dd: aload 6
      // 3df: iload 8
      // 3e1: invokevirtual com/google/gson/JsonArray.get (I)Lcom/google/gson/JsonElement;
      // 3e4: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 3e7: invokevirtual k74/x/IlIIIlll.lIIl (Lk74/x/lllIIlIl;D)V
      // 3ea: goto 3ef
      // 3ed: astore 9
      // 3ef: iinc 8 1
      // 3f2: aload 2
      // 3f3: ifnull 3c5
      // 3f6: aload 2
      // 3f7: ifnull 451
      // 3fa: aload 5
      // 3fc: ifnull 451
      // 3ff: goto 406
      // 402: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 405: athrow
      // 406: aload 5
      // 408: invokevirtual com/google/gson/JsonElement.isJsonObject ()Z
      // 40b: ifeq 451
      // 40e: goto 415
      // 411: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 414: athrow
      // 415: aload 5
      // 417: invokevirtual com/google/gson/JsonElement.getAsJsonObject ()Lcom/google/gson/JsonObject;
      // 41a: astore 6
      // 41c: invokestatic k74/x/lllIIlIl.values ()[Lk74/x/lllIIlIl;
      // 41f: astore 7
      // 421: aload 7
      // 423: arraylength
      // 424: istore 8
      // 426: bipush 0
      // 427: istore 9
      // 429: iload 9
      // 42b: iload 8
      // 42d: if_icmpge 451
      // 430: aload 7
      // 432: iload 9
      // 434: aaload
      // 435: astore 10
      // 437: aload 0
      // 438: aload 10
      // 43a: aload 6
      // 43c: aload 10
      // 43e: aload 0
      // 43f: aload 10
      // 441: invokevirtual k74/x/IlIIIlll.lII (Lk74/x/lllIIlIl;)D
      // 444: invokestatic k74/x/IlIIIlll.IIIl (Lcom/google/gson/JsonObject;Ljava/lang/Enum;D)D
      // 447: invokevirtual k74/x/IlIIIlll.lIIl (Lk74/x/lllIIlIl;D)V
      // 44a: iinc 9 1
      // 44d: aload 2
      // 44e: ifnull 429
      // 451: aload 1
      // 452: ldc_w -567484067
      // 455: iload 11
      // 457: ldc_w 228838607
      // 45a: ixor
      // 45b: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 45e: ldc_w -567484070
      // 461: iload 11
      // 463: ldc_w 47466534
      // 466: ixor
      // 467: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 46a: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 46d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 470: invokevirtual com/google/gson/JsonObject.has (Ljava/lang/String;)Z
      // 473: ifeq 525
      // 476: aload 1
      // 477: ldc_w -567484069
      // 47a: iload 11
      // 47c: ldc_w 447540753
      // 47f: ixor
      // 480: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 483: ldc_w -567484072
      // 486: iload 11
      // 488: ldc_w 394596395
      // 48b: ixor
      // 48c: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 48f: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 492: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 495: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 498: invokevirtual com/google/gson/JsonElement.isJsonArray ()Z
      // 49b: ifeq 525
      // 49e: goto 4a5
      // 4a1: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4a4: athrow
      // 4a5: aload 0
      // 4a6: getfield k74/x/IlIIIlll.IlI Ljava/util/Set;
      // 4a9: invokeinterface java/util/Set.clear ()V 1
      // 4ae: aload 1
      // 4af: ldc_w -567484071
      // 4b2: iload 11
      // 4b4: ldc_w -941015771
      // 4b7: ixor
      // 4b8: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 4bb: ldc_w -567484074
      // 4be: iload 11
      // 4c0: ldc_w 1066840862
      // 4c3: ixor
      // 4c4: invokestatic k74/x/IlIIIlll.IIIII (II)I
      // 4c7: invokestatic k74/x/IlIIIlll.III (II)Ljava/lang/String;
      // 4ca: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 4cd: invokevirtual com/google/gson/JsonObject.getAsJsonArray (Ljava/lang/String;)Lcom/google/gson/JsonArray;
      // 4d0: invokevirtual com/google/gson/JsonArray.iterator ()Ljava/util/Iterator;
      // 4d3: astore 6
      // 4d5: aload 6
      // 4d7: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4dc: ifeq 525
      // 4df: aload 6
      // 4e1: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 4e6: checkcast com/google/gson/JsonElement
      // 4e9: astore 7
      // 4eb: aload 7
      // 4ed: ifnull 521
      // 4f0: aload 7
      // 4f2: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 4f5: ifeq 521
      // 4f8: goto 4ff
      // 4fb: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4fe: athrow
      // 4ff: aload 7
      // 501: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 504: invokestatic k74/x/IlIIIlll.llI (Ljava/lang/String;)Ljava/lang/Long;
      // 507: astore 8
      // 509: aload 8
      // 50b: ifnull 521
      // 50e: aload 0
      // 50f: getfield k74/x/IlIIIlll.IlI Ljava/util/Set;
      // 512: aload 8
      // 514: invokeinterface java/util/Set.add (Ljava/lang/Object;)Z 2
      // 519: pop
      // 51a: goto 521
      // 51d: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 520: athrow
      // 521: aload 2
      // 522: ifnull 4d5
      // 525: return
   }

   boolean llII(IlIIIIIIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 2d
      // 04: aload 0
      // 05: getfield k74/x/IlIIIlll.lIl Z
      // 08: ifeq 2d
      // 0b: goto 12
      // 0e: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: aload 0
      // 13: getfield k74/x/IlIIIlll.IllI J
      // 16: aload 1
      // 17: invokevirtual k74/x/IlIIIIIIl.IIllllI ()J
      // 1a: lcmp
      // 1b: ifne 2d
      // 1e: goto 25
      // 21: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 24: athrow
      // 25: bipush 1
      // 26: goto 2e
      // 29: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2c: athrow
      // 2d: bipush 0
      // 2e: ireturn
   }

   void llIl(long var1) {
      this.ll = true;
      this.lIIl = var1;
   }

   private static String IIIIl(short var0, byte var1, int var2) {
      int var7 = var2 ^ 739105138;
      char[] var6 = IIIlI[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])IIIll[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         IIIll[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 54695;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ 20880 ^ switch (var5 % 8) {
            default -> 127;
            case 1 -> 186;
            case 2 -> 13;
            case 3 -> 61;
            case 4 -> 138;
            case 5 -> 195;
            case 6 -> 161;
            case 7 -> 50;
         } ^ var5 ^ var2 ^ var0 ^ var4 ^ var1);
      }

      return new String(var6).intern();
   }

   void lllI(IlIIIIIIl var1) {
      try {
         if (var1 != null) {
            this.IlI.remove(var1.IIllllI());
         }
      } catch (RuntimeException var2) {
         throw lIl(var2);
      }
   }

   boolean llll(IlIIIIIIl param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 26
      // 04: aload 0
      // 05: getfield k74/x/IlIIIlll.IlI Ljava/util/Set;
      // 08: aload 1
      // 09: invokevirtual k74/x/IlIIIIIIl.IIllllI ()J
      // 0c: invokestatic java/lang/Long.valueOf (J)Ljava/lang/Long;
      // 0f: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 14: ifeq 26
      // 17: goto 1e
      // 1a: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1d: athrow
      // 1e: bipush 1
      // 1f: goto 27
      // 22: invokestatic k74/x/IlIIIlll.lIl (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: bipush 0
      // 27: ireturn
   }
}
