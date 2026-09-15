package k74.x;

import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4604;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

@Environment(EnvType.CLIENT)
final class IlIllIIll implements lIIlIl {
   private final class_4604 I;
   private static final String[] l;
   private final class_4184 II;
   private static String[] Il;
   private static final String[] lIl;
   private static final String[] lI;
   private final class_4587 ll;
   private final Matrix4f III;
   private final Matrix4f IIl;
   private static final int[] lII;
   private static final Object[] llI;
   private final class_757 IlI;
   private final class_4597 Ill;

   @Override
   public class_4587 I() {
      return this.ll;
   }

   @Override
   public class_757 l() {
      return this.IlI;
   }

   private static void II() {
      int var0 = -1360320904;
      Il[0] = ll(III(IIII(-626528143, var0 ^ -1943700583), IIII(-626528144, var0 ^ 1146124569)).toCharArray(), 32604L, IIII(-626528145, var0 ^ 991995625));
      Il[1] = ll(III(IIII(-626528146, var0 ^ 911304030), IIII(-626528147, var0 ^ -429613789)).toCharArray(), 3386L, IIII(-626528148, var0 ^ -2081396211));
      Il[2] = ll(III(IIII(-626528149, var0 ^ 1052202080), IIII(-626528150, var0 ^ 805501365)).toCharArray(), 42325L, IIII(-626528151, var0 ^ -152611751));
      Il[3] = ll(III(IIII(-626528152, var0 ^ -1108590679), IIII(-626528153, var0 ^ -711252492)).toCharArray(), 53388L, IIII(-626528154, var0 ^ 1529778829));
      Il[4] = ll(III(IIII(-626528155, var0 ^ 174509072), IIII(-626528156, var0 ^ 1380107799)).toCharArray(), 36082L, IIII(-626528157, var0 ^ -146220948));
      Il[5] = ll(III(IIII(-626528158, var0 ^ -1266190290), IIII(-626528159, var0 ^ -1023904953)).toCharArray(), 34175L, IIII(-626528160, var0 ^ 152938712));
      Il[IIII(-626528161, var0 ^ -1386759245)] = ll(
         III(IIII(-626528162, var0 ^ 1706149826), IIII(-626528163, var0 ^ -236710816)).toCharArray(), 43547L, IIII(-626528164, var0 ^ 739727010)
      );
      Il[IIII(-626528165, var0 ^ 1085947926)] = ll(
         III(IIII(-626528166, var0 ^ -1438746207), IIII(-626528167, var0 ^ 1234091844)).toCharArray(), 25780L, IIII(-626528168, var0 ^ 1023783387)
      );
      Il[IIII(-626528169, var0 ^ -13248135)] = ll(
         III(IIII(-626528170, var0 ^ 1914754580), IIII(-626528171, var0 ^ 2007245979)).toCharArray(), 25705L, IIII(-626528172, var0 ^ 887076062)
      );
   }

   private static ReflectiveOperationException Il(ReflectiveOperationException var0) {
      return var0;
   }

   private static String IIIl(int var0, int var1) {
      int var3 = var0 ^ -1091433873;
      char[] var4 = lIl[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])llI[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         llI[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -778827416;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 239;
            case 1 -> 232;
            case 2 -> 21;
            case 3 -> 155;
            case 4 -> 173;
            case 5 -> 182;
            case 6 -> 152;
            case 7 -> 114;
            case 8 -> 6;
            case 9 -> 174;
            case 10 -> 171;
            case 11 -> 113;
            case 12 -> 160;
            case 13 -> 103;
            case 14 -> 138;
            case 15 -> 186;
            case 16 -> 250;
            case 17 -> 73;
            case 18 -> 8;
            case 19 -> 16;
            case 20 -> 53;
            case 21 -> 108;
            case 22 -> 190;
            case 23 -> 59;
            case 24 -> 177;
            case 25 -> 111;
            case 26 -> 154;
            case 27 -> 240;
            case 28 -> 23;
            case 29 -> 32;
            case 30 -> 108;
            case 31 -> 230;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private IlIllIIll(Object var1) {
      IlIlIIIlI var2 = lllII.II;
      this.ll = Ill(var1, class_4587.class, IlIIllIII.lI(Il[1]), IlIIllIII.lI(Il[3]));
      this.Ill = Ill(var1, class_4597.class, IlIIllIII.lI(Il[IIII(-626528173, 616060577 ^ 1754796416)]));
      class_4604 var3 = Ill(var1, class_4604.class, IlIIllIII.lI(Il[4]));
      this.I = var3 != null ? var3 : lllII.I.II();
      class_4184 var4 = Ill(var1, class_4184.class, IlIIllIII.lI(Il[5]));
      this.II = var4 != null ? var4 : lllII.l(var2.II(), lllII.I.Ill());
      class_757 var5 = Ill(var1, class_757.class, IlIIllIII.lI(Il[IIII(-626528174, 616060577 ^ -1164624418)]));
      this.IlI = var5 != null ? var5 : lllII.l(var2.I(), lllII.I.IIl());
      Matrix4f var6 = IIl(var1, IlIIllIII.lI(Il[IIII(-626528175, 616060577 ^ 979538806)]));
      this.IIl = var6 != null ? var6 : lllII.l(var2.l(), lllII.I.III());
      Matrix4f var7 = IIl(var1, IlIIllIII.lI(Il[0]), IlIIllIII.lI(Il[2]));
      this.III = var7 != null ? var7 : lllII.l(var2.Il(), lllII.I.l());
   }

   private static int IIII(int var0, int var1) {
      int var2 = lII[var0 ^ -626528129] ^ var1 ^ var0;
      var2 -= 51444;
      var2 ^= 62193;
      var2 -= 5122;
      var2 ^= 22268;
      var2 ^= 59546;
      return var2 - 55131;
   }

   @Override
   public class_4604 lI() {
      return this.I;
   }

   private static String ll(char[] var0, long var1, int var3) {
      int var4 = IIII(-626528176, 1410605473 ^ -207250415) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIII(-626528177, 1410605473 ^ 515579000);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String III(int var0, int var1) {
      int var9 = -1029119981;
      int var2 = (var0 ^ IIII(-626528178, var9 ^ -584695405)) & IIII(-626528179, var9 ^ 39029056);
      if (lI[var2] == null) {
         char[] var3 = l[var2].toCharArray();

         int var4 = switch (var3[0] & IIII(-626528180, var9 ^ 2073954689)) {
            case 0 -> IIII(-626528181, var9 ^ -1351432335);
            case 1 -> IIII(-626528182, var9 ^ -1996952413);
            case 2 -> IIII(-626528183, var9 ^ 86101463);
            case 3 -> IIII(-626528184, var9 ^ -174134947);
            case 4 -> IIII(-626528185, var9 ^ 427194601);
            case 5 -> IIII(-626528186, var9 ^ -1855273058);
            case 6 -> IIII(-626528187, var9 ^ -927931589);
            case 7 -> IIII(-626528188, var9 ^ -1228062395);
            case 8 -> IIII(-626528189, var9 ^ 230399334);
            case 9 -> IIII(-626528190, var9 ^ -1562546615);
            case 10 -> IIII(-626528191, var9 ^ 274619763);
            case 11 -> IIII(-626528192, var9 ^ 573337895);
            case 12 -> IIII(-626528193, var9 ^ 1961402796);
            case 13 -> IIII(-626528194, var9 ^ -872285570);
            case 14 -> IIII(-626528195, var9 ^ 115121524);
            case 15 -> IIII(-626528196, var9 ^ -1306586530);
            case 16 -> IIII(-626528197, var9 ^ 99979681);
            case 17 -> IIII(-626528198, var9 ^ 22548244);
            case 18 -> IIII(-626528199, var9 ^ 545997650);
            case 19 -> IIII(-626528200, var9 ^ -949654285);
            case 20 -> IIII(-626528201, var9 ^ -89379514);
            case 21 -> IIII(-626528202, var9 ^ -1354731190);
            case 22 -> IIII(-626528203, var9 ^ 603566814);
            case 23 -> IIII(-626528204, var9 ^ -1029030670);
            case 24 -> IIII(-626528205, var9 ^ -773348368);
            case 25 -> IIII(-626528206, var9 ^ 983246244);
            case 26 -> IIII(-626528207, var9 ^ -914682634);
            case 27 -> IIII(-626528208, var9 ^ -400114132);
            case 28 -> IIII(-626528209, var9 ^ -1418606375);
            case 29 -> IIII(-626528210, var9 ^ 493159117);
            case 30 -> IIII(-626528211, var9 ^ -10374329);
            case 31 -> IIII(-626528212, var9 ^ -1169593225);
            case 32 -> IIII(-626528213, var9 ^ -1314013137);
            case 33 -> IIII(-626528214, var9 ^ -1327452712);
            case 34 -> IIII(-626528215, var9 ^ 2023238615);
            case 35 -> IIII(-626528216, var9 ^ 1362371641);
            case 36 -> IIII(-626528217, var9 ^ 1597453828);
            case 37 -> IIII(-626528218, var9 ^ -1140324069);
            case 38 -> IIII(-626528219, var9 ^ 984523549);
            case 39 -> IIII(-626528220, var9 ^ -1368943980);
            case 40 -> IIII(-626528221, var9 ^ 1845987033);
            case 41 -> IIII(-626528222, var9 ^ -556300086);
            case 42 -> IIII(-626528223, var9 ^ -386745633);
            case 43 -> IIII(-626528224, var9 ^ -1801462106);
            case 44 -> IIII(-626528225, var9 ^ -1997886882);
            case 45 -> IIII(-626528226, var9 ^ -1461204680);
            case 46 -> IIII(-626528227, var9 ^ 2073429919);
            case 47 -> IIII(-626528228, var9 ^ -153671761);
            case 48 -> IIII(-626528229, var9 ^ -134847141);
            case 49 -> IIII(-626528230, var9 ^ -465079611);
            case 50 -> IIII(-626528231, var9 ^ -496699159);
            case 51 -> IIII(-626528232, var9 ^ -1669285436);
            case 52 -> IIII(-626528233, var9 ^ -787054351);
            case 53 -> IIII(-626528234, var9 ^ -1625968070);
            case 54 -> IIII(-626528235, var9 ^ -945848801);
            case 55 -> IIII(-626528236, var9 ^ -284001424);
            case 56 -> IIII(-626528237, var9 ^ 255434014);
            case 57 -> IIII(-626528238, var9 ^ 94920315);
            case 58 -> IIII(-626528239, var9 ^ -1783191387);
            case 59 -> IIII(-626528240, var9 ^ 1888333609);
            case 60 -> IIII(-626528241, var9 ^ -1159897664);
            case 61 -> IIII(-626528242, var9 ^ -1750982658);
            case 62 -> IIII(-626528243, var9 ^ 1376890004);
            case 63 -> IIII(-626528244, var9 ^ 1079297162);
            case 64 -> IIII(-626528245, var9 ^ -1744583035);
            case 65 -> IIII(-626528246, var9 ^ -1794475229);
            case 66 -> IIII(-626528247, var9 ^ 1963149410);
            case 67 -> IIII(-626528248, var9 ^ 357906550);
            case 68 -> IIII(-626528249, var9 ^ -1490965969);
            case 69 -> IIII(-626528250, var9 ^ 1647564991);
            case 70 -> IIII(-626528251, var9 ^ -1806868810);
            case 71 -> IIII(-626528252, var9 ^ -1080074732);
            case 72 -> IIII(-626528253, var9 ^ 1616954037);
            case 73 -> IIII(-626528254, var9 ^ -500208671);
            case 74 -> IIII(-626528255, var9 ^ -661623207);
            case 75 -> IIII(-626528256, var9 ^ -1817113729);
            case 76 -> IIII(-626528001, var9 ^ -1234811245);
            case 77 -> IIII(-626528002, var9 ^ 955255128);
            case 78 -> IIII(-626528003, var9 ^ -1369963734);
            case 79 -> IIII(-626528004, var9 ^ -2131380381);
            case 80 -> IIII(-626528005, var9 ^ -47329697);
            case 81 -> IIII(-626528006, var9 ^ 772720412);
            case 82 -> IIII(-626528007, var9 ^ 645886952);
            case 83 -> IIII(-626528008, var9 ^ -310632554);
            case 84 -> IIII(-626528009, var9 ^ -533680479);
            case 85 -> IIII(-626528010, var9 ^ -394013101);
            case 86 -> IIII(-626528011, var9 ^ -1719343070);
            case 87 -> 0;
            case 88 -> IIII(-626528012, var9 ^ 442682134);
            case 89 -> IIII(-626528013, var9 ^ -911678696);
            case 90 -> IIII(-626528014, var9 ^ -1410219243);
            case 91 -> IIII(-626528015, var9 ^ -511430305);
            case 92 -> IIII(-626528016, var9 ^ 2130923731);
            case 93 -> IIII(-626528017, var9 ^ -50283099);
            case 94 -> IIII(-626528018, var9 ^ -183322597);
            case 95 -> IIII(-626528019, var9 ^ -1459692693);
            case 96 -> IIII(-626528020, var9 ^ -918648270);
            case 97 -> IIII(-626528021, var9 ^ -1028842069);
            case 98 -> IIII(-626528022, var9 ^ 1671776005);
            case 99 -> IIII(-626528023, var9 ^ 636059283);
            case 100 -> IIII(-626528024, var9 ^ 187185311);
            case 101 -> IIII(-626528025, var9 ^ -1254550458);
            case 102 -> IIII(-626528026, var9 ^ -1655180785);
            case 103 -> IIII(-626528027, var9 ^ 2057468573);
            case 104 -> 3;
            case 105 -> IIII(-626528028, var9 ^ -919937183);
            case 106 -> IIII(-626528029, var9 ^ -634756294);
            case 107 -> IIII(-626528030, var9 ^ -685847920);
            case 108 -> 5;
            case 109 -> IIII(-626528031, var9 ^ -2071335310);
            case 110 -> IIII(-626528032, var9 ^ 253491490);
            case 111 -> IIII(-626528033, var9 ^ -1367859724);
            case 112 -> IIII(-626528034, var9 ^ 551893850);
            case 113 -> IIII(-626528035, var9 ^ -526383495);
            case 114 -> IIII(-626528036, var9 ^ 1669682599);
            case 115 -> IIII(-626528037, var9 ^ 1862817497);
            case 116 -> IIII(-626528038, var9 ^ -263968245);
            case 117 -> IIII(-626528039, var9 ^ -1447018349);
            case 118 -> IIII(-626528040, var9 ^ 952456595);
            case 119 -> IIII(-626528041, var9 ^ 239315036);
            case 120 -> IIII(-626528042, var9 ^ -617795742);
            case 121 -> IIII(-626528043, var9 ^ 1575336031);
            case 122 -> IIII(-626528044, var9 ^ 78131244);
            case 123 -> IIII(-626528045, var9 ^ -108942561);
            case 124 -> IIII(-626528046, var9 ^ 2100120316);
            case 125 -> IIII(-626528047, var9 ^ 1122965594);
            case 126 -> 2;
            case 127 -> IIII(-626528048, var9 ^ 381915283);
            case 128 -> IIII(-626528049, var9 ^ 1431692620);
            case 129 -> IIII(-626528050, var9 ^ -1396919419);
            case 130 -> IIII(-626528051, var9 ^ -1051954741);
            case 131 -> IIII(-626528052, var9 ^ 1009614633);
            case 132 -> IIII(-626528053, var9 ^ -1288984088);
            case 133 -> IIII(-626528054, var9 ^ -1246939723);
            case 134 -> IIII(-626528055, var9 ^ 258987232);
            case 135 -> IIII(-626528056, var9 ^ -435620761);
            case 136 -> IIII(-626528057, var9 ^ -2065519841);
            case 137 -> IIII(-626528058, var9 ^ -130836634);
            case 138 -> IIII(-626528059, var9 ^ 1760451554);
            case 139 -> IIII(-626528060, var9 ^ -361782503);
            case 140 -> IIII(-626528061, var9 ^ -94059046);
            case 141 -> IIII(-626528062, var9 ^ -2106526171);
            case 142 -> IIII(-626528063, var9 ^ -369395504);
            case 143 -> IIII(-626528064, var9 ^ -1710033604);
            case 144 -> IIII(-626528065, var9 ^ 880747415);
            case 145 -> IIII(-626528066, var9 ^ 168319016);
            case 146 -> IIII(-626528067, var9 ^ -1813420337);
            case 147 -> IIII(-626528068, var9 ^ -610737874);
            case 148 -> IIII(-626528069, var9 ^ 1608524798);
            case 149 -> IIII(-626528070, var9 ^ -204566490);
            case 150 -> IIII(-626528071, var9 ^ -750967434);
            case 151 -> IIII(-626528072, var9 ^ -1068154970);
            case 152 -> IIII(-626528073, var9 ^ 1759082923);
            case 153 -> IIII(-626528074, var9 ^ -1699194223);
            case 154 -> IIII(-626528075, var9 ^ 349804508);
            case 155 -> IIII(-626528076, var9 ^ 319189546);
            case 156 -> IIII(-626528077, var9 ^ 1167776865);
            case 157 -> IIII(-626528078, var9 ^ -548387238);
            case 158 -> IIII(-626528079, var9 ^ -724165154);
            case 159 -> 4;
            case 160 -> IIII(-626528080, var9 ^ -1262776668);
            case 161 -> IIII(-626528081, var9 ^ 563503436);
            case 162 -> IIII(-626528082, var9 ^ -363092622);
            case 163 -> IIII(-626528083, var9 ^ 1558921008);
            case 164 -> IIII(-626528084, var9 ^ -1243940279);
            case 165 -> IIII(-626528085, var9 ^ -2136229075);
            case 166 -> IIII(-626528086, var9 ^ 363324407);
            case 167 -> IIII(-626528087, var9 ^ 549007741);
            case 168 -> IIII(-626528088, var9 ^ -725078072);
            case 169 -> IIII(-626528089, var9 ^ 1590216343);
            case 170 -> IIII(-626528090, var9 ^ -915073674);
            case 171 -> IIII(-626528091, var9 ^ 1081804495);
            case 172 -> IIII(-626528092, var9 ^ -1263075086);
            case 173 -> IIII(-626528093, var9 ^ -829596887);
            case 174 -> IIII(-626528094, var9 ^ -1152777610);
            case 175 -> IIII(-626528095, var9 ^ 2012681046);
            case 176 -> IIII(-626528096, var9 ^ -1462492833);
            case 177 -> IIII(-626528097, var9 ^ 1867926942);
            case 178 -> IIII(-626528098, var9 ^ -2138112447);
            case 179 -> IIII(-626528099, var9 ^ 275194525);
            case 180 -> IIII(-626528100, var9 ^ -57849205);
            case 181 -> IIII(-626528101, var9 ^ 1026644440);
            case 182 -> IIII(-626528102, var9 ^ 2085686014);
            case 183 -> IIII(-626528103, var9 ^ 944776469);
            case 184 -> IIII(-626528104, var9 ^ -1940811690);
            case 185 -> IIII(-626528105, var9 ^ 858481790);
            case 186 -> IIII(-626528106, var9 ^ -932984500);
            case 187 -> IIII(-626528107, var9 ^ 1503401284);
            case 188 -> IIII(-626528108, var9 ^ 1306596197);
            case 189 -> IIII(-626528109, var9 ^ -954302631);
            case 190 -> IIII(-626528110, var9 ^ -588170727);
            case 191 -> IIII(-626528111, var9 ^ -341169202);
            case 192 -> IIII(-626528112, var9 ^ 265253238);
            case 193 -> IIII(-626528113, var9 ^ -666372343);
            case 194 -> IIII(-626528114, var9 ^ 12260070);
            case 195 -> IIII(-626528115, var9 ^ 1398175918);
            case 196 -> IIII(-626528116, var9 ^ 1239581039);
            case 197 -> IIII(-626528117, var9 ^ 1609438574);
            case 198 -> IIII(-626528118, var9 ^ 263882492);
            case 199 -> IIII(-626528119, var9 ^ -341870801);
            case 200 -> IIII(-626528120, var9 ^ 172714533);
            case 201 -> IIII(-626528121, var9 ^ -1287613143);
            case 202 -> IIII(-626528122, var9 ^ -1711842139);
            case 203 -> IIII(-626528123, var9 ^ 950541938);
            case 204 -> IIII(-626528124, var9 ^ 1332643983);
            case 205 -> IIII(-626528125, var9 ^ 782664983);
            case 206 -> IIII(-626528126, var9 ^ 1132304255);
            case 207 -> IIII(-626528127, var9 ^ -724930445);
            case 208 -> IIII(-626528128, var9 ^ 2105555145);
            case 209 -> IIII(-626527873, var9 ^ -51816139);
            case 210 -> IIII(-626527874, var9 ^ -1689652129);
            case 211 -> IIII(-626527875, var9 ^ -972035990);
            case 212 -> IIII(-626527876, var9 ^ 388950773);
            case 213 -> IIII(-626527877, var9 ^ -289135581);
            case 214 -> IIII(-626527878, var9 ^ -764599425);
            case 215 -> IIII(-626527879, var9 ^ 1216459010);
            case 216 -> IIII(-626527880, var9 ^ -1747534993);
            case 217 -> IIII(-626527881, var9 ^ -855417704);
            case 218 -> IIII(-626527882, var9 ^ -141503541);
            case 219 -> IIII(-626527883, var9 ^ 1676868834);
            case 220 -> IIII(-626527884, var9 ^ 1465011695);
            case 221 -> IIII(-626527885, var9 ^ 1366001734);
            case 222 -> IIII(-626527886, var9 ^ -1045963899);
            case 223 -> IIII(-626527887, var9 ^ 1366358525);
            case 224 -> IIII(-626527888, var9 ^ -1720028761);
            case 225 -> IIII(-626527889, var9 ^ -763586639);
            case 226 -> IIII(-626527890, var9 ^ 35101925);
            case 227 -> IIII(-626527891, var9 ^ 1451203027);
            case 228 -> IIII(-626527892, var9 ^ 289200329);
            case 229 -> 1;
            case 230 -> IIII(-626527893, var9 ^ -247582906);
            case 231 -> IIII(-626527894, var9 ^ 1491500291);
            case 232 -> IIII(-626527895, var9 ^ -132698881);
            case 233 -> IIII(-626527896, var9 ^ 1504308780);
            case 234 -> IIII(-626527897, var9 ^ 541105547);
            case 235 -> IIII(-626527898, var9 ^ -554353816);
            case 236 -> IIII(-626527899, var9 ^ -1000581954);
            case 237 -> IIII(-626527900, var9 ^ 2023713559);
            case 238 -> IIII(-626527901, var9 ^ -1291864165);
            case 239 -> IIII(-626527902, var9 ^ -258384696);
            case 240 -> IIII(-626527903, var9 ^ -1106912295);
            case 241 -> IIII(-626527904, var9 ^ -308234356);
            case 242 -> IIII(-626527905, var9 ^ 542372004);
            case 243 -> IIII(-626527906, var9 ^ -2122109844);
            case 244 -> IIII(-626527907, var9 ^ -1601717574);
            case 245 -> IIII(-626527908, var9 ^ -1944813761);
            case 246 -> IIII(-626527909, var9 ^ 1606485235);
            case 247 -> IIII(-626527910, var9 ^ -17985488);
            case 248 -> IIII(-626527911, var9 ^ -1807481217);
            case 249 -> IIII(-626527912, var9 ^ 1185915168);
            case 250 -> IIII(-626527913, var9 ^ -1000709192);
            case 251 -> IIII(-626527914, var9 ^ -1331385023);
            case 252 -> IIII(-626527915, var9 ^ -249162361);
            case 253 -> IIII(-626527916, var9 ^ 1679767656);
            case 254 -> IIII(-626527917, var9 ^ 349460315);
            default -> IIII(-626527918, var9 ^ -477204627);
         };
         int var5 = (var1 & IIII(-626527919, var9 ^ -732861574)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIII(-626527920, var9 ^ 728285163)) >>> IIII(-626527921, var9 ^ 1275742054)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIII(-626527922, var9 ^ -943308772);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIII(-626527923, var9 ^ 2122003439);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   private static Matrix4f IIl(Object var0, String... var1) {
      String[] var3 = var1;
      String[] var10000 = IIllllIl.IIIIl();
      int var4 = var1.length;
      int var5 = 0;
      String[] var2 = var10000;

      while (var5 < var4) {
         String var6 = var3[var5];
         if (lII(var0, var6) instanceof Matrix4fc var8) {
            return new Matrix4f(var8);
         }

         var5++;
         if (var2 != null) {
            break;
         }
      }

      return null;
   }

   @Override
   public Matrix4f IlI() {
      return this.IIl;
   }

   private static <T> T Ill(Object var0, Class<T> var1, String... var2) {
      String[] var3 = IIllllIl.IIIIl();
      if (var0 == null) {
         return null;
      } else {
         for (String var7 : var2) {
            Object var8 = lII(var0, var7);
            if (var1.isInstance(var8)) {
               return (T)var1.cast(var8);
            }

            if (var3 != null) {
               break;
            }
         }

         return null;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 93351689;
      short var18 = 252;
      int var17 = 0;
      String[] var15 = new String[2];
      int var16 = 0;
      int var14 = "z燆峍罁⸘턞\uf793ꃈ족譽ބ콗̡뭽ӕ䋘ꙷ䔈爍鷇᠇쌑笝疆\udf23\ue281픭㳮䂹ด흤ᱜ㛿髍辻䈟詯䒌⌯侉㻚䐴\u2e62㟺풹͈韠괘\uefc8ꨙ姯苁\u2439ⳡ\udfc2䜘\u0a5f୯䵦떰ꮊ꣹茵\uf72eᅚ䰽튐\uf1b9尯ⵑ溂㕞⑱۶ܖĬ崳䅏뗁봣\uf559뭗霶\uf224ᡶᔔﻔĘ냙狕䩃聎䖔薖疝썠㵌䖀\ue80a勬Մ\udd27弑㢑\uf2f4콖鈨㾋弆桰핁䃐ᷡ꫱涡\uef51ࢯ潬盬ꝲ觠ꑋ黄\u001d奴\ue2c1ᚽ휊若섲뮊⪣\u242eᎂ麪뻴앀ᏻ捀桌ḪཚǊ\ud800炞伍犵㘐빜䢀⤃\ue9aa匥"
         .length();
      String var13 = "z燆峍罁⸘턞\uf793ꃈ족譽ބ콗̡뭽ӕ䋘ꙷ䔈爍鷇᠇쌑笝疆\udf23\ue281픭㳮䂹ด흤ᱜ㛿髍辻䈟詯䒌⌯侉㻚䐴\u2e62㟺풹͈韠괘\uefc8ꨙ姯苁\u2439ⳡ\udfc2䜘\u0a5f୯䵦떰ꮊ꣹茵\uf72eᅚ䰽튐\uf1b9尯ⵑ溂㕞⑱۶ܖĬ崳䅏뗁봣\uf559뭗霶\uf224ᡶᔔﻔĘ냙狕䩃聎䖔薖疝썠㵌䖀\ue80a勬Մ\udd27弑㢑\uf2f4콖鈨㾋弆桰핁䃐ᷡ꫱涡\uef51ࢯ潬盬ꝲ觠ꑋ黄\u001d奴\ue2c1ᚽ휊若섲뮊⪣\u242eᎂ麪뻴앀ᏻ捀桌ḪཚǊ\ud800炞伍犵㘐빜䢀⤃\ue9aa匥";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 42;
               case 1 -> 245;
               case 2 -> 64;
               case 3 -> 59;
               case 4 -> 69;
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

      lIl = var15;
      llI = new Object[var15.length];
      int var9 = -1441374612;
      byte[] var7 = "!ªkmh\u009fB±ñØ%8]È\u00964sø\u008ck8Au\u000e\u0089²\u0006\u0086\"d+å0«[\u0000\u0090EíW4EfÇ\u0099\u00ad6=å·ÅI°\u0090\u009aoR~\rÀ\u009a\u000b$\"âH Xè\n\u0013v8?\u0080ñþÇ\u0011\u0081àì\"$îYÆ+ºv\u0084Îc·Ið\u000bÀñN¿î4ÏÔ=º1\u008c\u0018¾p%Gz\u0017jÜ\u000e\u0016\u001c£½ýs\u0095\u0080Zs\fk\u0014»ê±µ/¿b>8fê±\u009eá\u0090²te\u000f¾\u0097Õa¥±ÓEæ!n\tÐ¬{ \u0019©ÿÄÞXÛ\u0093s<\u0090±ôî\u009d\u009dªnj3\u0006%Âf\u001c:\u001fÂ9o>ñ\u009f°H\u009f±É\u0086\u0016q\u001djØâ:àóE·9ÛËG\u0086ð\u0091«nn\u008e#rØ\u001fz¨üw\u0004ÕW_¿£\u008bL\u0010Åqæ¢FK/\u00904nÛÆð·Ý~\u0019ì'´Ä\u0082\u0085\u0000\u0007\u000bä·í\u0087ð³@\u0010À\u0092\u0093\\¥u}záH´;O\u001dXn\u0097\u0091á¤\u0091p²*\u009fcÿµ÷\u0088\u00833Á{c\u001aKZ>¨¼\u0019iÞf¯}\u0014îMy¥0\bQzH\u0003µß\u000e\u0002ø»\u0082Ê\u00804\u001cã,2Ní/ \u0013\u000e\u0010\u001f\u0086\u0088¶¼Ð\u001c\u007f\u008d\u0007Ü\u001f\u0099\rlÏ\u009e£Zê¥ö&\u0087Èé:ò¼å\u001aÿÖâÉ\u008e\u0011\rDÏ8xEîz\u009aV_d\u0084P|îé.\u0098¦\u0016c\u000e\u0096Ã-\r\u00adóu\u0087aÂ]\nbï½!\u0082ñ·°Gá'®·yÂ\u0095°è\bÅK÷%º\t\u0084à\t³|òLÝ\u0005*\u001bÐÁ'\u0012m\u008cÇ\u001b^ø§M.-\u00159µÜÐ+Çz&UHï\r\u0087H)ÒxÔäP7t\u0002j\u0088xo!©\u001d\u0004\u0004~Yµ\u008aè\u0016J\u001c@\u001cy2í¡\u0000O5ØÊ\u009c\u0016ÑÚ\u0094ge\t_d\t+R(¸`Z\u009bÀ\u008c+\u009cþ\u0093¨zÝD{°ü=\u0019éÕÌS\u009c.\u0016Í\u001bF\u000bO\u0018¢¬G\n§\u000b\u001aæÍø{&\u0095\u0003pµ\u000b\fÑ½QÕ\u0097ñh,¹0'§\u0007!\u0002\u0092/OëlÈºl\u001e{2Àth2z^e\u0006Ü\u000e6\u0091ø\u001e½\u0003æ+\u001c`\u0002õ\u0092ý-ÉR¸\u0019fÑ\u009dCuÝ\u0010@\u009cB\\3[\u001bØVí\u008aÝC=¼[¾ßi59Ôïý§z¶°&RK\u0099½ÐÏ5\\\u0085ð÷\u0007\u0090¤Û\u008f£çMóÃ\u001e¤¥\u0002sTgA\u008e5i\u00ad\u00013¶ø\u0007µ*\u008d½wÏ²T\u0010â\u00826ú½°J+\u0088£ÚöDèXwµïH|Ó>0hé![ãgè(\nã\u008e\u0086g<(¸\u0010C\f!ñpäi\u0080÷ííø:ÅAÖ\u0086\ra%3þrM \u001aÚÁf\u001e( LD¦Á\u0081{¡\u001ed\u0092÷\u0082ÅSmHYífÎ\u0002\u0094\u0006£\u0098\u0005\u0093\u008e~äXC¼Uîó)Þ\u0007Âìx2³¤\u008d§¿õ8\u0092¡.gfÐ0©ìÐÐG{m\u0003Hòc\u0019\u0095\u0006¯\u001fW|\u0095Dn\tR\u0014ÀÅï\u0005Ì\u001aÌ>\u0005ÝN[#2\u0096èÀ¢\u007f;\u0082N\u0095Uô\u008f)FòÎI\u0015Ñ\u008aH3->I\u008f=\u00813r\u0091z{Ö\u001fë\u0084\u0003rÿù\f\u001eu\u0006ihné,ÁY²=\u001e½×n1j_á\u0089²£\r\u009dáNnZûú\u009e\u001bíö\u0003§½¢\u0090ßY\u0087hP¸Su\u0014\u0001X\u0083Ã+ïC\u0091\u008a°\u0001%ýv\u009e(\u009c¾\u0093Ìñe\u0081»fÒo.Ï\u0098.\u0014NñNl)Qã1t\u0017öý¥6ô?\\Ü3%`u4nú\u0099¦m%Î¬\u008b\u007f\u001bK\u008eE\u0088Í\u0010Ñêë¢åJZêãs\u0096\u009as¿ÌÖãhç_+bo*`d\u0080\u00ad°\u000f\u0082\u0091äg\u008e\u0092£$Ï\u008aC&1+êþj8J\u000f;\u0001ë±ù \u0092X\u008aDlí%ÛvDCäÊ\u0087|ý\u0000ç \u009aB\u0081BM\f\u001dÌ!_¸ û\u0092KîK3\u009b;b\u0012\u009f\u00adÉ>\fa·íÙ\u001a\u001cLõ\u0087\u0006&\\\u0011³ô·¶\rvBtU\u0002¼º\tC>\u0002FÖ\u0007/)¦Ì@,Q\u0096x\u0002fIu\u0097\u0099s¨\u0007þ\u0012P¼uÞ^îÌc-\u001e"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lII = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lII[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[IIII(-626528129, var23 ^ 1418392222)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIIl(-1091433873, var23 ^ -1601418472)).length();
      int var1 = IIII(-626528130, var23 ^ 499112792);
      int var25 = -1;

      label99:
      while (true) {
         int var28 = 3;
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label94: {
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
                     break label94;
                  }

                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % IIII(-626528134, var23 ^ 1298263290)) {
                     case 0 -> IIII(-626528135, var23 ^ -57499734);
                     case 1 -> IIII(-626528136, var23 ^ 1464119998);
                     case 2 -> IIII(-626528137, var23 ^ 1166787135);
                     case 3 -> IIII(-626528138, var23 ^ -446335873);
                     case 4 -> IIII(-626528139, var23 ^ 1097203668);
                     case 5 -> IIII(-626528140, var23 ^ -326262571);
                     default -> IIII(-626528141, var23 ^ -1869128569);
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
                     l = var5;
                     lI = new String[IIII(-626528133, var23 ^ 114824604)];
                     Il = new String[IIII(-626528142, var23 ^ -978320495)];
                     II();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var49;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label99;
                  }

                  var4 = (var2 = IIIl(-1091433874, var23 ^ 282142208)).length();
                  var1 = IIII(-626528131, var23 ^ -2064073530);
                  var25 = -1;
            }

            var28 = IIII(-626528132, var23 ^ 686297076);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private static Object lII(Object var0, String var1) {
      try {
         if (var0 == null) {
            return null;
         }
      } catch (ReflectiveOperationException var4) {
         throw Il(var4);
      }

      try {
         Method var2 = var0.getClass().getMethod(var1);
         var2.setAccessible(true);
         return var2.invoke(var0);
      } catch (ReflectiveOperationException var3) {
         return null;
      }
   }

   @Override
   public class_4184 lIl() {
      return this.II;
   }

   @Override
   public class_4597 llI() {
      return this.Ill;
   }

   @Override
   public Matrix4f lll() {
      return this.III;
   }
}
