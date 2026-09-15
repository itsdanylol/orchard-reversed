package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_268;
import net.minecraft.class_310;
import net.minecraft.class_5251;
import net.minecraft.class_746;
import net.minecraft.class_9334;

@Environment(EnvType.CLIENT)
public final class lIlIlIIl extends IlIIIIIIl {
   private static final String[] I;
   private final lllIIlII II;
   private final lllIIlII Il;
   private static String[] lI;
   private static final String[] Ill;
   private static final Object[] lII;
   private static final class_1304[] ll;
   private final lllIIlII III;
   private static final int[] IlI;
   private static final String[] IIl;

   public boolean I(class_1657 var1) {
      if (this.IIIIlIl() && var1 != null) {
         class_310 var2 = class_310.method_1551();
         if (var2 != null && var2.field_1724 != null && var1 != var2.field_1724) {
            class_746 var3 = var2.field_1724;
            return this.II.IllI() && this.Ill(var3, var1) || this.III.IllI() && this.II(var3, var1) || this.Il.IllI() && this.lI(var3, var1);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static int l(int var0, int var1) {
      int var2 = IlI[var0 ^ 197673174] ^ var1 ^ var0;
      var2 -= 53095;
      var2 -= 6693;
      var2 -= 20932;
      var2 += 56364;
      var2 += 59464;
      var2 += 53416;
      return var2 - 22778;
   }

   public lIlIlIIl() {
      super(IlIIllIII.Ill(lI[1]), lllIIlIl.IlI, IlIIllIII.Ill(lI[2]));
      this.II = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[5]), true));
      this.III = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[3]), true));
      this.Il = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[4]), true));
   }

   private static String IIII(int var0, int var1) {
      int var3 = var0 ^ -1999745081;
      char[] var4 = Ill[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])lII[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         lII[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -319762003;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 45;
            case 1 -> 98;
            case 2 -> 124;
            case 3 -> 175;
            case 4 -> 120;
            case 5 -> 42;
            case 6 -> 142;
            case 7 -> 219;
            case 8 -> 159;
            case 9 -> 89;
            case 10 -> 191;
            case 11 -> 21;
            case 12 -> 224;
            case 13 -> 167;
            case 14 -> 156;
            case 15 -> 123;
            case 16 -> 52;
            case 17 -> 230;
            case 18 -> 215;
            case 19 -> 189;
            case 20 -> 151;
            case 21 -> 71;
            case 22 -> 111;
            case 23 -> 191;
            case 24 -> 58;
            case 25 -> 91;
            case 26 -> 203;
            case 27 -> 237;
            case 28 -> 53;
            case 29 -> 154;
            case 30 -> 232;
            case 31 -> 209;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private boolean II(class_1657 var1, class_1657 var2) {
      class_268 var3 = var1.method_5781();
      class_268 var4 = var2.method_5781();
      if (var3 != null && var4 != null) {
         Integer var5 = this.Il(var3);
         Integer var6 = this.Il(var4);
         return var5 != null && var5.equals(var6);
      } else {
         return false;
      }
   }

   private Integer Il(class_268 var1) {
      return var1 != null && var1.method_1202() != null ? var1.method_1202().method_532() : null;
   }

   private boolean lI(class_1657 var1, class_1657 var2) {
      Integer var3 = this.llI(var1.method_5476());
      Integer var4 = this.llI(var2.method_5476());
      if (var3 == null) {
         var3 = this.Il(var1.method_5781());
      }

      if (var4 == null) {
         var4 = this.Il(var2.method_5781());
      }

      return var3 != null && var3.equals(var4);
   }

   private Integer ll(class_1799 var1) {
      Object var2 = var1.method_58694(class_9334.field_49644);

      try {
         if (var2 == null) {
            return null;
         }
      } catch (ReflectiveOperationException var6) {
         throw lII(var6);
      }

      try {
         return var2.getClass().getMethod(IlIIllIII.lI(lI[0])).invoke(var2) instanceof Number var4 ? var4.intValue() : null;
      } catch (ReflectiveOperationException var5) {
         return null;
      }
   }

   private static String III(int var0, int var1) {
      int var9 = -768926445;
      int var2 = (var0 ^ l(197673176, var9 ^ 715586056)) & l(197673177, var9 ^ -1900551772);
      if (I[var2] == null) {
         char[] var3 = IIl[var2].toCharArray();

         int var4 = switch (var3[0] & l(197673158, var9 ^ -1051711960)) {
            case 0 -> l(197673159, var9 ^ -717590187);
            case 1 -> l(197673156, var9 ^ -1607702287);
            case 2 -> l(197673157, var9 ^ 373861333);
            case 3 -> l(197673154, var9 ^ -1623007283);
            case 4 -> l(197673155, var9 ^ -160611605);
            case 5 -> l(197673152, var9 ^ 420193686);
            case 6 -> l(197673153, var9 ^ -40685272);
            case 7 -> l(197673166, var9 ^ -409061105);
            case 8 -> l(197673167, var9 ^ -910746179);
            case 9 -> l(197673164, var9 ^ -2133543208);
            case 10 -> l(197673165, var9 ^ -836774828);
            case 11 -> l(197673162, var9 ^ 1788506513);
            case 12 -> l(197673163, var9 ^ -867494938);
            case 13 -> l(197673160, var9 ^ 1808928230);
            case 14 -> l(197673161, var9 ^ 1054672329);
            case 15 -> l(197673206, var9 ^ 332450292);
            case 16 -> l(197673207, var9 ^ -1624287016);
            case 17 -> l(197673204, var9 ^ 563647453);
            case 18 -> l(197673205, var9 ^ 540282645);
            case 19 -> l(197673202, var9 ^ 671905913);
            case 20 -> l(197673203, var9 ^ -167273094);
            case 21 -> l(197673200, var9 ^ 2065581293);
            case 22 -> l(197673201, var9 ^ 1784140181);
            case 23 -> l(197673214, var9 ^ -231382992);
            case 24 -> l(197673215, var9 ^ 1686540896);
            case 25 -> l(197673212, var9 ^ 1460080920);
            case 26 -> l(197673213, var9 ^ -312566510);
            case 27 -> l(197673210, var9 ^ -369957572);
            case 28 -> l(197673211, var9 ^ -1174077185);
            case 29 -> l(197673208, var9 ^ -1126843418);
            case 30 -> l(197673209, var9 ^ 1365567652);
            case 31 -> l(197673190, var9 ^ 1838346534);
            case 32 -> l(197673191, var9 ^ 1457940623);
            case 33 -> l(197673188, var9 ^ 1645042751);
            case 34 -> l(197673189, var9 ^ 901162971);
            case 35 -> l(197673186, var9 ^ 164892917);
            case 36 -> l(197673187, var9 ^ 142695616);
            case 37 -> l(197673184, var9 ^ -353794816);
            case 38 -> l(197673185, var9 ^ -2030647199);
            case 39 -> l(197673198, var9 ^ -526599190);
            case 40 -> l(197673199, var9 ^ -1940987589);
            case 41 -> l(197673196, var9 ^ -1739859550);
            case 42 -> l(197673197, var9 ^ -1193556283);
            case 43 -> l(197673194, var9 ^ -856071052);
            case 44 -> l(197673195, var9 ^ -945194935);
            case 45 -> l(197673192, var9 ^ -1202167067);
            case 46 -> l(197673193, var9 ^ -918549970);
            case 47 -> 5;
            case 48 -> l(197673110, var9 ^ 422950854);
            case 49 -> 0;
            case 50 -> l(197673111, var9 ^ -13756537);
            case 51 -> l(197673108, var9 ^ -2000792794);
            case 52 -> l(197673109, var9 ^ -86746411);
            case 53 -> l(197673106, var9 ^ -1997203176);
            case 54 -> l(197673107, var9 ^ 1736549806);
            case 55 -> l(197673104, var9 ^ -431869305);
            case 56 -> l(197673105, var9 ^ -1126495511);
            case 57 -> l(197673118, var9 ^ -2023062743);
            case 58 -> l(197673119, var9 ^ 1778485702);
            case 59 -> l(197673116, var9 ^ -1212024838);
            case 60 -> l(197673117, var9 ^ -298240896);
            case 61 -> l(197673114, var9 ^ 1282087819);
            case 62 -> l(197673115, var9 ^ 988709954);
            case 63 -> l(197673112, var9 ^ 307210131);
            case 64 -> l(197673113, var9 ^ 1975885376);
            case 65 -> l(197673094, var9 ^ 1806930069);
            case 66 -> l(197673095, var9 ^ 1923795983);
            case 67 -> l(197673092, var9 ^ -1457581751);
            case 68 -> l(197673093, var9 ^ -1057173412);
            case 69 -> 4;
            case 70 -> l(197673090, var9 ^ -1053892763);
            case 71 -> l(197673091, var9 ^ -1894209235);
            case 72 -> l(197673088, var9 ^ -1487847963);
            case 73 -> l(197673089, var9 ^ -616479310);
            case 74 -> l(197673102, var9 ^ -666843710);
            case 75 -> l(197673103, var9 ^ -2041734467);
            case 76 -> l(197673100, var9 ^ -720580440);
            case 77 -> l(197673101, var9 ^ -889540487);
            case 78 -> l(197673098, var9 ^ 1206368200);
            case 79 -> l(197673099, var9 ^ -1859758484);
            case 80 -> l(197673096, var9 ^ -1712642290);
            case 81 -> l(197673097, var9 ^ 632327838);
            case 82 -> l(197673142, var9 ^ -498996937);
            case 83 -> l(197673143, var9 ^ -1459826397);
            case 84 -> l(197673140, var9 ^ -256995676);
            case 85 -> l(197673141, var9 ^ -152249824);
            case 86 -> l(197673138, var9 ^ -1084370604);
            case 87 -> l(197673139, var9 ^ 379141689);
            case 88 -> l(197673136, var9 ^ -186747687);
            case 89 -> l(197673137, var9 ^ 1343518575);
            case 90 -> l(197673150, var9 ^ 858072173);
            case 91 -> l(197673151, var9 ^ -1730651855);
            case 92 -> l(197673148, var9 ^ 1968754904);
            case 93 -> l(197673149, var9 ^ -1838152462);
            case 94 -> l(197673146, var9 ^ -861980716);
            case 95 -> l(197673147, var9 ^ -475491411);
            case 96 -> l(197673144, var9 ^ -933257997);
            case 97 -> l(197673145, var9 ^ 360076732);
            case 98 -> l(197673126, var9 ^ -1278826327);
            case 99 -> l(197673127, var9 ^ -1647684717);
            case 100 -> l(197673124, var9 ^ 8169944);
            case 101 -> l(197673125, var9 ^ 821591258);
            case 102 -> l(197673122, var9 ^ 260265295);
            case 103 -> l(197673123, var9 ^ -44590635);
            case 104 -> l(197673120, var9 ^ -1698852738);
            case 105 -> l(197673121, var9 ^ 62350565);
            case 106 -> l(197673134, var9 ^ -497284686);
            case 107 -> l(197673135, var9 ^ 1491645288);
            case 108 -> l(197673132, var9 ^ 849546514);
            case 109 -> l(197673133, var9 ^ 1301190377);
            case 110 -> l(197673130, var9 ^ -1488695192);
            case 111 -> l(197673131, var9 ^ 1458460416);
            case 112 -> l(197673128, var9 ^ 1782650290);
            case 113 -> l(197673129, var9 ^ 416581601);
            case 114 -> l(197673046, var9 ^ 119940632);
            case 115 -> l(197673047, var9 ^ 1051484454);
            case 116 -> l(197673044, var9 ^ -1864512116);
            case 117 -> l(197673045, var9 ^ -1195429424);
            case 118 -> l(197673042, var9 ^ -2023182903);
            case 119 -> l(197673043, var9 ^ -69996370);
            case 120 -> l(197673040, var9 ^ 1836015705);
            case 121 -> l(197673041, var9 ^ -924593089);
            case 122 -> l(197673054, var9 ^ 54910977);
            case 123 -> l(197673055, var9 ^ 9004083);
            case 124 -> l(197673052, var9 ^ 438945835);
            case 125 -> l(197673053, var9 ^ -494485199);
            case 126 -> l(197673050, var9 ^ 1264902313);
            case 127 -> l(197673051, var9 ^ 1399631814);
            case 128 -> l(197673048, var9 ^ 732378574);
            case 129 -> l(197673049, var9 ^ -963240851);
            case 130 -> l(197673030, var9 ^ 64109744);
            case 131 -> l(197673031, var9 ^ -2074566433);
            case 132 -> l(197673028, var9 ^ -1044045262);
            case 133 -> l(197673029, var9 ^ 1270929884);
            case 134 -> l(197673026, var9 ^ 1617941064);
            case 135 -> l(197673027, var9 ^ 1566370453);
            case 136 -> l(197673024, var9 ^ -2047364986);
            case 137 -> l(197673025, var9 ^ -2085861587);
            case 138 -> l(197673038, var9 ^ 2021851249);
            case 139 -> l(197673039, var9 ^ 1772483472);
            case 140 -> l(197673036, var9 ^ 1821630501);
            case 141 -> l(197673037, var9 ^ 945340079);
            case 142 -> l(197673034, var9 ^ -1259071558);
            case 143 -> l(197673035, var9 ^ 1615274900);
            case 144 -> l(197673032, var9 ^ 1154535725);
            case 145 -> l(197673033, var9 ^ 743627060);
            case 146 -> l(197673078, var9 ^ 867057363);
            case 147 -> l(197673079, var9 ^ 679255285);
            case 148 -> l(197673076, var9 ^ -961961207);
            case 149 -> l(197673077, var9 ^ -1826974177);
            case 150 -> l(197673074, var9 ^ -1747504514);
            case 151 -> l(197673075, var9 ^ -327891771);
            case 152 -> l(197673072, var9 ^ 1472105648);
            case 153 -> l(197673073, var9 ^ -861222902);
            case 154 -> l(197673086, var9 ^ -97738904);
            case 155 -> l(197673087, var9 ^ -362681334);
            case 156 -> l(197673084, var9 ^ -424723037);
            case 157 -> l(197673085, var9 ^ 456608872);
            case 158 -> l(197673082, var9 ^ 2115030933);
            case 159 -> l(197673083, var9 ^ 157696779);
            case 160 -> l(197673080, var9 ^ 1562585935);
            case 161 -> l(197673081, var9 ^ -1375383001);
            case 162 -> l(197673062, var9 ^ -1485034197);
            case 163 -> l(197673063, var9 ^ -1608807210);
            case 164 -> l(197673060, var9 ^ -611567600);
            case 165 -> l(197673061, var9 ^ 44158854);
            case 166 -> l(197673058, var9 ^ 489255698);
            case 167 -> l(197673059, var9 ^ 2125952245);
            case 168 -> l(197673056, var9 ^ 460716812);
            case 169 -> l(197673057, var9 ^ 932232538);
            case 170 -> l(197673070, var9 ^ -1333511840);
            case 171 -> l(197673071, var9 ^ -1676153728);
            case 172 -> l(197673068, var9 ^ -828023565);
            case 173 -> l(197673069, var9 ^ -658272557);
            case 174 -> l(197673066, var9 ^ -1337390861);
            case 175 -> l(197673067, var9 ^ -1782664835);
            case 176 -> l(197673064, var9 ^ 579829893);
            case 177 -> l(197673065, var9 ^ 1781181784);
            case 178 -> 2;
            case 179 -> l(197672982, var9 ^ -1470196777);
            case 180 -> l(197672983, var9 ^ -761016204);
            case 181 -> l(197672980, var9 ^ -1754869525);
            case 182 -> l(197672981, var9 ^ -550613066);
            case 183 -> l(197672978, var9 ^ -1825228108);
            case 184 -> l(197672979, var9 ^ -345834699);
            case 185 -> l(197672976, var9 ^ 1431480087);
            case 186 -> l(197672977, var9 ^ 2062920596);
            case 187 -> l(197672990, var9 ^ 53752548);
            case 188 -> l(197672991, var9 ^ 780064546);
            case 189 -> l(197672988, var9 ^ -1983251910);
            case 190 -> l(197672989, var9 ^ 670623595);
            case 191 -> l(197672986, var9 ^ -633072430);
            case 192 -> l(197672987, var9 ^ -918922386);
            case 193 -> l(197672984, var9 ^ 2111589855);
            case 194 -> l(197672985, var9 ^ -735627795);
            case 195 -> l(197672966, var9 ^ 1943397892);
            case 196 -> l(197672967, var9 ^ 934608029);
            case 197 -> l(197672964, var9 ^ 194085531);
            case 198 -> l(197672965, var9 ^ -230872192);
            case 199 -> l(197672962, var9 ^ 145606560);
            case 200 -> l(197672963, var9 ^ 1156277585);
            case 201 -> l(197672960, var9 ^ -1883830936);
            case 202 -> l(197672961, var9 ^ 1571121184);
            case 203 -> l(197672974, var9 ^ -1305963550);
            case 204 -> l(197672975, var9 ^ 2103146227);
            case 205 -> l(197672972, var9 ^ 589109773);
            case 206 -> l(197672973, var9 ^ -1377843942);
            case 207 -> l(197672970, var9 ^ -303604175);
            case 208 -> l(197672971, var9 ^ -342756598);
            case 209 -> l(197672968, var9 ^ -789979783);
            case 210 -> l(197672969, var9 ^ 1385090032);
            case 211 -> l(197673014, var9 ^ 1200937097);
            case 212 -> l(197673015, var9 ^ -444982684);
            case 213 -> l(197673012, var9 ^ -1060956720);
            case 214 -> l(197673013, var9 ^ -1293123058);
            case 215 -> l(197673010, var9 ^ 1126482173);
            case 216 -> l(197673011, var9 ^ 1696788714);
            case 217 -> l(197673008, var9 ^ -462816843);
            case 218 -> l(197673009, var9 ^ -2110756919);
            case 219 -> l(197673022, var9 ^ 551397367);
            case 220 -> l(197673023, var9 ^ -918093371);
            case 221 -> l(197673020, var9 ^ 901706851);
            case 222 -> l(197673021, var9 ^ -156335183);
            case 223 -> l(197673018, var9 ^ 1927303092);
            case 224 -> l(197673019, var9 ^ 1270678189);
            case 225 -> l(197673016, var9 ^ -1644921522);
            case 226 -> l(197673017, var9 ^ 497955365);
            case 227 -> l(197672998, var9 ^ 585497169);
            case 228 -> l(197672999, var9 ^ -1281160687);
            case 229 -> l(197672996, var9 ^ 734915000);
            case 230 -> l(197672997, var9 ^ 1521516802);
            case 231 -> l(197672994, var9 ^ -1848300831);
            case 232 -> l(197672995, var9 ^ -1805759501);
            case 233 -> l(197672992, var9 ^ 1572333191);
            case 234 -> l(197672993, var9 ^ 1460406372);
            case 235 -> l(197673006, var9 ^ 800449455);
            case 236 -> l(197673007, var9 ^ 1994746486);
            case 237 -> l(197673004, var9 ^ -793002067);
            case 238 -> 1;
            case 239 -> l(197673005, var9 ^ 2128859908);
            case 240 -> l(197673002, var9 ^ 1059156497);
            case 241 -> l(197673003, var9 ^ 1917300925);
            case 242 -> l(197673000, var9 ^ 1211579686);
            case 243 -> l(197673001, var9 ^ 1609103160);
            case 244 -> l(197673430, var9 ^ 1769128936);
            case 245 -> l(197673431, var9 ^ -1103642225);
            case 246 -> l(197673428, var9 ^ -1095114409);
            case 247 -> l(197673429, var9 ^ 1649730961);
            case 248 -> l(197673426, var9 ^ 1919890980);
            case 249 -> l(197673427, var9 ^ 583649189);
            case 250 -> l(197673424, var9 ^ 118698153);
            case 251 -> l(197673425, var9 ^ 952584307);
            case 252 -> l(197673438, var9 ^ -1484291931);
            case 253 -> l(197673439, var9 ^ -194580211);
            case 254 -> l(197673436, var9 ^ -335584320);
            default -> 3;
         };
         int var5 = (var1 & l(197673437, var9 ^ 1725547472)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & l(197673434, var9 ^ 870808470)) >>> l(197673435, var9 ^ 380920404)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & l(197673432, var9 ^ 2032349987);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & l(197673433, var9 ^ 407999);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -768723527;
      int var16 = 0;
      int var10001 = "8\ud984鲭輓♨ﹽḣ潅㠱慺㏱燹⪸슇塦⏉묠⢝훠練튆舘\ude2e⃭\ue1c4Ĺ觪ᓳ鮃样材渕\uf3a9\ue527㝈䎃ᣟ땜瘨㳝숡ꗴ솲覯\udfa7逸\uef58㝊齈Ě䛸\uf45d胇酨暴讅䟰i륧퐓餬㚈蹢\ueb92눜㲪ﳑ〖\ue622\uec77╫ﵙ\ue677\ueb97귙熱鮜ꙟ씸銈\uf498쑀\uebcc溦촡錒ᅋ㏬떕Ꙣ䔂櫂\uf061ﷹ푂⃖\uf35e䮜虫\uefe9争芓ꢘ丁嗵䑙␡鼷{褀內銚褩▊ၶ闥ܒ鉈녧蛼䒅뇣ꚯ馆ꃹ瑠㿗ꀽ\uf7db遗ἃꏧ\ue239쌡뀊汍\ueb75㓁쪤걂̯꜎⸭혛\udfe5뾄\ue09d沱⍯뒮\u0e6e겅詊\uebc4\ud840\ue2f0\uda9eퟏ䐋咣쯬掫\uf351"
         .length();
      String[] var15 = new String[2];
      int var14 = var10001;
      short var18 = 26620;
      String var13 = "8\ud984鲭輓♨ﹽḣ潅㠱慺㏱燹⪸슇塦⏉묠⢝훠練튆舘\ude2e⃭\ue1c4Ĺ觪ᓳ鮃样材渕\uf3a9\ue527㝈䎃ᣟ땜瘨㳝숡ꗴ솲覯\udfa7逸\uef58㝊齈Ě䛸\uf45d胇酨暴讅䟰i륧퐓餬㚈蹢\ueb92눜㲪ﳑ〖\ue622\uec77╫ﵙ\ue677\ueb97귙熱鮜ꙟ씸銈\uf498쑀\uebcc溦촡錒ᅋ㏬떕Ꙣ䔂櫂\uf061ﷹ푂⃖\uf35e䮜虫\uefe9争芓ꢘ丁嗵䑙␡鼷{褀內銚褩▊ၶ闥ܒ鉈녧蛼䒅뇣ꚯ馆ꃹ瑠㿗ꀽ\uf7db遗ἃꏧ\ue239쌡뀊汍\ueb75㓁쪤걂̯꜎⸭혛\udfe5뾄\ue09d沱⍯뒮\u0e6e겅詊\uebc4\ud840\ue2f0\uda9eퟏ䐋咣쯬掫\uf351";
      int var17 = 0;

      do {
         char var10000 = var13.charAt(var17);
         int var21 = 0;
         char var19 = var10000;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      Ill = var15;
      lII = new Object[var15.length];
      int var9 = -1145097245;
      byte[] var7 = "\u000b3Ò\f\r{\u0085\n\u00101ô5æå\u001fô\f\u001f!\u008bÅ+±Ë\u0088Ô*K5'\tC»g9¬3f\nû¿\u0085\u008ey73Ä\u001bSzxÓ\u001a·ê´·\u0005ºÙ\u0013\u0014p \\óH3H\u0098à\u001c=\u008eù®\u008bëÅÅ\u0002àN-kÏÓ\u0099\u0084¨Ë¹`0_\tz<¨¼T\u0015\u008c·\u001dv'ÝS½E³÷8àßQé\u0082(öp\u009cP£\u007f\u0094µ\u008erX\u008e\u0002\u008dÉd¼:\u0002\u0006½\u0096\u009e\u00adµ®é\u0003k¥\f¥æ¼Õ\u0085÷õ@mo\u0097ñçù$\u0003ëÊ¤\u007f\u0013pýó\u0013tQ\u008b2'§\u0091¦!w*uÌÆyLð0`\u0097ËDù\u001bÿ¯Íp¨\u0015ÉÃ\u0094v\u0081\u001a\u0095#Í\u007fwK\u0014¶\u001bTYÒ}>*q\u0011í\u008f+\u0005éHS%yW\u008dQ[õ¾Z\n\u0016J%úóNTâ\u009bd\u0084\u0096Ù\u008cb\u008c\u0086h\u0015\u001cÂ¬gvËÅ\u0015W\u0088Nú#4f{à£¯!xd¢\u001aÈ\u0012Ú÷£\u0018ï*cf\u0004s\u009aZäÑÉ\u008a\u0098§L\u0015À\u008fí6hèg\u000fmö\u0011\u0001Ùï\b]Æ4½\u0080\u0092]_¾/\\\u008cNA\u0012º8\u0094:òSµFãÔ/EâT7\u001bï\u000b6H®A¶WX!¡ÚE&d\f\u0084Çý\u0004I¶\u0087¸\u0012\u001fN\u007fãx©5^@Öm\f\u001f\u009dkNK´\"ÿ@Ý\u008b;¯½i|åWÍ¶æ¶®\u0087µÀ\u0005{7lèû¾\u008d\u000fÒ\u0095ÙQ=¦á~\n\u0002SUý\rõ\u0088ÔÄÈ.d9\u0014\u0000hÂ\u0098\u009dÞ8â\u00adZí\u000e\u0092 ;\u0013`õ\b`\u0007\u001f\u0001æ\u009e\u0014\n\u0095\u007fþ\u0098HÅJ\"\u0097¯\u0000cKÐ,\u0007\u0082:æÁûËLÆì÷ã\u0084&\u0085wé\u0093\u009a\u0085H¢£\u000eðÈ\r~£(%\u001d \"\u001aÊ<\u000ffqa\u0087ðÍñ\u009eUAEÀ\u009eçqX\u009d*\n\u008f\u0087\u008bY/\u007f$P£ÖÆq?ÎÎ> ¶\u0005¤-[4\u008d\u0019\u009ep\u00adÝ\u0019ûÎy\\g³+ÖbH\býÌ¼òÀþ{ä\u0018U!D\u001e\u000eÖ\u0015å nÔô\u0007b^ñ1qX¥ú/¦)V\u0086`ýå²\u0018Ùr@Á±ðHÝ®\f¯\u0091µÞ\r+[\u000b2#\u000e¸\u0007f\nu£VqÖU\u0017Ê\u001c\u001dÿQ\bYîg\u008e\u000e¾wÃ}E{\r¬E\u0086\u0095Ý\u001bã²^û\u0094ÄÒEÀ\u0081ºK3§Ã\u0014:Þ¼Z=¹\u001dßF.©ô\u009f\u0003^\u0085\u0080\u008a\u001d\u009aã\u0015å²\u0086×jgª2,\b-'Wê\u0001µ}éS\u0007Í\u0002Ea\u001fñ-êfK\b\u001c \u0015¿,î\u001f÷\u0088<x5ü\u0002\nO\u0001Aå\nÄA\u0088B\u008d!w\u000e\u0096TWvÀj&Èð6\rçW:É\u009e\u0096£ï³ÜF\u0087\u0014kkîº[\u0089\u0090Gæ\u0085eT\u0098Êßà~Ü\u0081I\u0085¤öîv\u0088Ôª\u0016m\u001d\u00963\u0013\u0090o\u009fº\u008d\u0095\u000fVóÙIô\u009c\u0012\u0015\u0094ÔÀ\u0007ùM/\u008a\u0002_àø\u0018%¾¿\u008bq0}T!pD0Õv3b±MKLiÏ-¥\u0014Ú6IÀxØ\u008bÊ]a\u0084ô/OìÁÞ\u0086Q®ø\u0081\u009e\u000eyËhó\u001f\u0092ö{½\u007f6êTå\u0090U¨\u001ce8k\f\u0012\u009eïC!SÖ\u001f\u0093ö\u0000Vìü\u0080\r\\ç¿Gk?.\u0001\u009b_¶oxöÇ\u0013ïÂ\fvD\u001b\tüÚÏÀ\u0015w4Ê®\u0099k²\u0017r3ëGûäM\u0018ÑRãABM¢\u0083ã\u0084ïå!×Õ\u0094SéÂJf~ôÐS¢#\u0095Q}#\u001bq\u001cÿöuóïÍ¦\u0093¿kW\u0004\u009a°_\u008a¥eØâ:%\u0010\\iÄa\u0081v]ó\u0097ûz¬Ð®Dë\u0091\u008b\u0016òIä\u0080\\&\u009d¥V»Nï|qq¤íc\tB\u001a\\D«Ô°Ü\u001dØ]~p\u001c]\u0090ý±l7Ò!An \u0011\r\\>Â\u0018üi\tÐ\fY¤âÎ·\u001fûE\u001d\u008fÀ\\Ã\f¨¢\u0099\tí+\u001eÊ«Ú,Í¼Q\u0084s\u001f\u0082\u0013#6'À1\u0002¬`êÈ¾Ö4\u0090\u009fàz¿ÿ\u007fZ\n±\u001f\u009cPâ7\u0019±\u0000vå>8¤\u001e\u0014"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IlI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IlI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[l(197673174, var23 ^ -1768657995)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIII(-1999745081, var23 ^ -1008643017)).length();
      int var1 = l(197673175, var23 ^ -1864614727);
      int var25 = -1;

      label88:
      while (true) {
         int var27 = l(197673172, var23 ^ -1919529479);
         String var29 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label83: {
               char[] var44 = var29.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var27;
               var40 = var44;
               var10001 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var27;
                  var10006 = var6;
               } else {
                  var47 = var27;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label83;
                  }

                  var56 = var44;
                  var10004 = var27;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % l(197673171, var23 ^ 1485572215)) {
                     case 0 -> l(197673168, var23 ^ 359895936);
                     case 1 -> l(197673169, var23 ^ -1467961168);
                     case 2 -> l(197673182, var23 ^ 650149984);
                     case 3 -> l(197673183, var23 ^ -1363037435);
                     case 4 -> l(197673180, var23 ^ 572667834);
                     case 5 -> l(197673181, var23 ^ -1433109193);
                     default -> l(197673178, var23 ^ -824327913);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var10001 <= var6) {
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
                     IIl = var5;
                     I = new String[l(197673170, var23 ^ -1850173386)];
                     lI = new String[l(197673179, var23 ^ -2028973309)];
                     IIl();
                     ll = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var49;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label88;
                  }

                  var4 = (var2 = IIII(-1999745082, var23 ^ -978354312)).length();
                  var1 = l(197673173, var23 ^ 2067965693);
                  var25 = -1;
            }

            var27 = 2;
            var29 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private static void IIl() {
      int var0 = 2122339964;
      lI[0] = lll(III(l(197673414, var0 ^ 2145875679), l(197673415, var0 ^ 1085048518)).toCharArray(), 42019L, l(197673412, var0 ^ 1384485803));
      lI[1] = lll(III(l(197673413, var0 ^ 1973673495), l(197673410, var0 ^ -317454593)).toCharArray(), 96330L, l(197673411, var0 ^ -2018012839));
      lI[2] = lll(III(l(197673408, var0 ^ -1577731121), l(197673409, var0 ^ 114975837)).toCharArray(), 62791L, l(197673422, var0 ^ 1208182702));
      lI[3] = lll(III(l(197673423, var0 ^ 1832306864), l(197673420, var0 ^ -849270383)).toCharArray(), 12293L, l(197673421, var0 ^ -1588007433));
      lI[4] = lll(III(l(197673418, var0 ^ -4254377), l(197673419, var0 ^ 1947590872)).toCharArray(), 63594L, l(197673416, var0 ^ 1132617754));
      lI[5] = lll(III(l(197673417, var0 ^ -1819212992), l(197673462, var0 ^ 437722479)).toCharArray(), 64797L, l(197673463, var0 ^ -1541857227));
      lI[l(197673460, var0 ^ 1619896384)] = lll(
         III(l(197673461, var0 ^ -1290065494), l(197673458, var0 ^ 382206224)).toCharArray(), 29120L, l(197673459, var0 ^ -552188320)
      );
      lI[l(197673456, var0 ^ -1881149494)] = lll("".toCharArray(), 36107L, l(197673457, var0 ^ 1149933329));
   }

   private boolean Ill(class_1657 var1, class_1657 var2) {
      class_1304[] var4 = ll;
      String[] var10000 = IIllllIl.IIIIl();
      int var5 = var4.length;
      String[] var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         class_1304 var7 = var4[var6];
         String var8 = this.lIl(var1.method_6118(var7));
         if (!var8.isEmpty()) {
            String var9 = this.lIl(var2.method_6118(var7));
            if (var8.equals(var9)) {
               return true;
            }
         }

         var6++;
         if (var3 != null) {
            break;
         }
      }

      return false;
   }

   private static ReflectiveOperationException lII(ReflectiveOperationException var0) {
      return var0;
   }

   private String lIl(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         Integer var2 = this.ll(var1);
         if (var2 != null) {
            Object var3 = IlIIllIII.lI(lI[l(197673471, 568004274 ^ -548593718)]);
            return var3 + var2;
         } else {
            return lI[l(197673468, 568004274 ^ -1939498455)];
         }
      } else {
         return lI[l(197673470, 568004274 ^ -1859266160)];
      }
   }

   private Integer llI(class_2561 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 == null) {
         return null;
      } else {
         class_5251 var3 = var1.method_10866().method_10973();
         if (var3 != null) {
            return var3.method_27716();
         } else {
            for (class_2561 var5 : var1.method_10855()) {
               Integer var6 = this.llI(var5);
               if (var6 != null) {
                  return var6;
               }

               if (var2 != null) {
                  break;
               }
            }

            return null;
         }
      }
   }

   private static String lll(char[] var0, long var1, int var3) {
      int var4 = l(197673469, -460957753 ^ 266075174) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & l(197673466, -460957753 ^ -1817560089);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
