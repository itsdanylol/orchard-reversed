package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lllIII {
   I,
   II;

   private static final String[] l;
   private static final int[] III;
   private static final Object[] IlI;
   private static final String[] IIl;
   private static String[] Il;
   private static final String[] lI;
   private static final lllIII[] ll;

   public static lllIII I(String var0) {
      return Enum.valueOf(lllIII.class, var0);
   }

   private static void l() {
      int var0 = 1933893378;
      Il[0] = II(lI(ll(665439633, var0 ^ -345166884), ll(665439632, var0 ^ 714100041)).toCharArray(), 25316L, ll(665439635, var0 ^ -1173493712));
      Il[1] = II(lI(ll(665439634, var0 ^ -1921393734), ll(665439637, var0 ^ -1367169528)).toCharArray(), 77870L, ll(665439636, var0 ^ -1427878292));
   }

   private static String II(char[] var0, long var1, int var3) {
      int var4 = ll(665439639, -866453216 ^ -44929186) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(665439638, -866453216 ^ 850886090);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String III(int var0, char var1, short var2) {
      int var3 = var1 ^ '颩';
      char[] var4 = IIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10470;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 2903;
         var10 -= 20906;
         var10 ^= 39881;
         var10 -= 23913;
         var10 ^= 17880;
         var10 ^= 27842;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int ll(int var0, int var1) {
      int var2 = III[var0 ^ 665439633] ^ var1 ^ var0;
      var2 -= 17463;
      var2 ^= 12879;
      var2 -= 9887;
      var2 -= 7374;
      var2 -= 45126;
      var2 ^= 38751;
      return var2 + 14724;
   }

   private static lllIII[] Il() {
      return new lllIII[]{II, I};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 1815882347;
      int var11 = 0;
      int var10 = 0;
      String[] var9 = new String[1];
      short var12 = 19944;
      int var8 = "\fֈ틽췤뀻麛䕯㭈ॖ峑ꅶ閺쉜".length();
      String var7 = "\fֈ틽췤뀻麛䕯㭈ॖ峑ꅶ閺쉜";

      do {
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIl = var9;
      IlI = new Object[var9.length];
      int var10000 = 0;
      III = new int[276];
      int var10001 = 0;
      byte[] var10002 = "Ôu q\u0015\u0088ã\u008avRRË²aÐ\u0015\u0091\u009aY\u009eabáµeDª+²±\u0093Ó?´õE\u0099ÙK$\u0092g`î5og\u00adE\u0018Ëª._?PjèÅ~¶z¹«¹\u0080G¹êµ\u001fB§\tZô¼\u0002I\u0098aÖª,B\u009d\u008dºJÛ¾\u0082Ø\u0083NC!\u0085ôÖsO\u008aZä½Aã/w\u0093í@í\u0011qÖ\u0099#\u0099\u00026Ã\u0092\u0011\u0004\r±F¾YÆ\u0089ï\u0001\tö{Æ5à8\u0095£õrÛáài\u009aKCS²Ò\u007f¨\u0094ï`ôHÓ>\u008cZ¿ì\u0004;ìÛd\u008fÏX\u001fÃÖ÷¼2\u008fÙ\u009bú£Ó\u001c)\u0084u¯\u0084DéaãT\u001d\u008aÛ´\u009bªk×\u008aUöÞ¹¸Ç\u0089éö\tcBµc\\B\u0094?ô\u009e±8W\u0017@{s«\u001fR\u0090lÇåä¸f_w,Ë$ð\nÃû\u0097;KÊ\u00178°þ\u0006Ó\u0002\u000fç·Y~ìä§-xçBË\u0088ü\u0011î4YÚÅzQ<è@¬ïgBE\u0011K\u009f\u0001àØ¸\u000b\u001efá!ñN4»\u0094\u00957\f¥§» TrµÉ¶m*Æ ·/\u0012´¼\u0017-©\u0080\u001fm\u001dsMµ&!;\u0015\u0003\u00152â\u0088ôÜJ\u000e»\u0004q\u0099\u008fõ=îDR¼²Ø&Ü«Z\u0019\u0002\u0091µÍ¬;jJ)\fTb_ ²b%=\u0081U0>dP\u007f/\u0005(Üú¬I\u001c0§«\u0012ÃhJ\u008a\u0005ðrvc>ÙcÜç\u001d \u001a\u0004Ä¥ó\u001d/\u000fïV\u0013'0\u0088F\u0014ÃM~Å\u000f\u0080q\u0086Î\u0094ÜÓ\u0092±/Øxùäm{¦Ä#êÕÖÞÄ\u0095q]ìí\u009f\u0097çð\u001aDeò]\u0096Ð\u00988Õ\\\u008cBkÅ1^\u0003ÿèþI\u008br%®á\u0015\u00011RæÏÃ¢Ãð\u009fàOé`´À\u008aN\u0099\u0015]¾½aý3tk£-\u001e\u0093»´\u0002+;\u000f\u009c\u0007\u0091\u00ad°µ\u008c\u008a{Ø\u0090+ï+\"\u001ct7ó\u0018Õ&\u0096úúôÚ\u0000K'\u0011\u008cxidF\u0005ÉÊÁ¾©Þ%¾[\u009dJ\u0080\u009c°P÷°Ql±\u0091\u0017!i\u0084£wzÇÜº\u008eR8eÖ\u00875X\u000f\u0099)H¥¸]\u0080¿\u0014\u0096T4\u0097U¹\u000b×\u0095B\u008dE©\u009fWQAÐ\u008ceæ\u0084ê}\u0083)\u001d(=î\u0096²°Ð\u0001ÈÌháæþv\u001a\u0098\u009d{¿Ï7Cuõ¯ú\u0096@4yI\u0017ýo\u009e[éÔ^¥G´j\r\u0017\u001d\rÏúS·a ,áõâ&\u0016¡;÷\u0083\u0088ANn$Ì6YªP½à]N\u009fWtä\u0088èG#Àg¿\u009cOÞ\u0086ïô\u0091q\u001eu·#\u000b\u008ceH¨å¿³\u0010i\fÐ\u001aý\u0085xã÷o·J\u0097_0i\u008d\u0017?ê3Þß,oc.k\u001e%¯£G\u0081\u0013\u0090M)\u0088¡Ñ\u0017'-\nÎÑL\u001bV´ý~E.ÍqÉi#S5Í¤·ÞÀ§\u008bLëº®®,\\E\u007f÷¾ÃÓq \u0015r\u008e¾I\u001fØ\u0016\u009d;.úíßL\\ôìß¸\nwpY«Þz\n\u009d}[\u007fy\u0083ìÓb\u0097\u008fE\u008d\u0091$¶¸7ÚB¤ð\u008cïÅ0Ýv3`î£n.Ø\u0013Ú\u0093Íw¾ÇkÞ*S\u0017-\u0084\u0002¢¯\u008d)\u009dçb\n\u009a\\{@ç¶Ø\"\u0001\tÛ\u0096É¨\u0092Ü\u00009\u0002\u0013\u008dîò\u0016qêzZFîÛ¹\u0012ÓÉKP^G\u0006\u0082°¨B@3\fÁô,õHO£:ZXÚò²´Í2-eÒ\u0082¶\u009cpÖ\u0003\u001d\u0000Ê3LPøq¥8~A\u008d26\tÐ\u008dJ\u0004B\u0002QEr³?UöXTË&áR\u001f|\u0016\u0016JôYÏé<\u009c\u008e?\\\u008c©ïP¹Êè¼Ì\u0012d\u0097Ê²Ý¯\u0000%¢é¸H^\u0006É\u0007 â\u0001Å\nçÌc\u008b7\u0004;ØØ¢"
         .getBytes("ISO-8859-1");

      int var41;
      do {
         III[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1811246944;
         var10000 += 1;
         var41 = var10001 + 4;
         var10001 += 4;
      } while (var41 < var10002.length);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III(var17 ^ 1036799015, '颩', (short)'非')).length();
      int var1 = ll(665439387, var17 ^ -1987091746);
      int var0 = -1;

      while (true) {
         label77: {
            var10000 = ll(665439386, var17 ^ -360149497);
            char[] var42 = var2.substring(++var0, var0 + var1).toCharArray();
            int var52 = var42.length;
            int var6 = 0;
            var41 = var10000;
            var31 = var42;
            var10001 = var52;
            char[] var61;
            int var68;
            if (var52 <= 1) {
               var61 = var42;
               var52 = var10000;
               var68 = var6;
            } else {
               var41 = var10000;
               var10001 = var52;
               if (var52 <= var6) {
                  break label77;
               }

               var61 = var42;
               var52 = var10000;
               var68 = var6;
            }

            while (true) {
               var61[var68] = (char)(var61[var68] ^ var52 ^ switch (var6 % ll(665439389, var17 ^ 839165355)) {
                  case 0 -> ll(665439388, var17 ^ -1833067035);
                  case 1 -> ll(665439391, var17 ^ 96656432);
                  case 2 -> ll(665439390, var17 ^ 1748906876);
                  case 3 -> ll(665439361, var17 ^ 666947781);
                  case 4 -> ll(665439360, var17 ^ -445983242);
                  case 5 -> ll(665439363, var17 ^ 1139475931);
                  default -> ll(665439362, var17 ^ 465103457);
               });
               var6++;
               if (var41 == 0) {
                  var68 = var41;
                  var61 = var31;
                  var52 = var41;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var61 = var31;
                  var52 = var41;
                  var68 = var6;
               }
            }
         }

         String var45 = new String(var31).intern();
         byte var25 = -1;
         var5[var3++] = var45;
         if ((var0 += var1) >= var4) {
            lI = var5;
            l = new String[2];
            Il = new String[2];
            l();
            II = new lllIII();
            I = new lllIII();
            ll = Il();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static String lI(int var0, int var1) {
      int var9 = 1229204639;
      int var2 = (var0 ^ ll(665439641, var9 ^ 984354173)) & ll(665439640, var9 ^ -1665106036);
      if (l[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & ll(665439643, var9 ^ -1753261243)) {
            case 0 -> ll(665439642, var9 ^ 813128823);
            case 1 -> ll(665439645, var9 ^ 1073806968);
            case 2 -> ll(665439644, var9 ^ 726075138);
            case 3 -> ll(665439647, var9 ^ 1878061482);
            case 4 -> ll(665439646, var9 ^ -1285387089);
            case 5 -> ll(665439617, var9 ^ -1130857421);
            case 6 -> ll(665439616, var9 ^ -273863373);
            case 7 -> ll(665439619, var9 ^ -1575917438);
            case 8 -> ll(665439618, var9 ^ -1189446303);
            case 9 -> ll(665439621, var9 ^ 1691262743);
            case 10 -> ll(665439620, var9 ^ 1199946061);
            case 11 -> ll(665439623, var9 ^ 1338215344);
            case 12 -> ll(665439622, var9 ^ -577012905);
            case 13 -> ll(665439625, var9 ^ 614318086);
            case 14 -> ll(665439624, var9 ^ 1985460264);
            case 15 -> ll(665439627, var9 ^ -509248943);
            case 16 -> ll(665439626, var9 ^ 711960701);
            case 17 -> ll(665439629, var9 ^ 1173695170);
            case 18 -> ll(665439628, var9 ^ -746514774);
            case 19 -> ll(665439631, var9 ^ 120517117);
            case 20 -> ll(665439630, var9 ^ 337395702);
            case 21 -> ll(665439665, var9 ^ 1134980335);
            case 22 -> ll(665439664, var9 ^ -1929955899);
            case 23 -> ll(665439667, var9 ^ -211553191);
            case 24 -> ll(665439666, var9 ^ -450843102);
            case 25 -> ll(665439669, var9 ^ -261427461);
            case 26 -> ll(665439668, var9 ^ -445534595);
            case 27 -> ll(665439671, var9 ^ 1179355042);
            case 28 -> ll(665439670, var9 ^ 2058398863);
            case 29 -> ll(665439673, var9 ^ 1709996704);
            case 30 -> ll(665439672, var9 ^ 999581944);
            case 31 -> ll(665439675, var9 ^ -384037281);
            case 32 -> ll(665439674, var9 ^ -562251001);
            case 33 -> ll(665439677, var9 ^ 1560803405);
            case 34 -> ll(665439676, var9 ^ -224131278);
            case 35 -> ll(665439679, var9 ^ -595345140);
            case 36 -> ll(665439678, var9 ^ -704373800);
            case 37 -> ll(665439649, var9 ^ 1891087902);
            case 38 -> ll(665439648, var9 ^ -327558948);
            case 39 -> ll(665439651, var9 ^ 412282734);
            case 40 -> ll(665439650, var9 ^ -1632477520);
            case 41 -> ll(665439653, var9 ^ -1890728985);
            case 42 -> ll(665439652, var9 ^ -1130300412);
            case 43 -> ll(665439655, var9 ^ -319934180);
            case 44 -> ll(665439654, var9 ^ 1202542330);
            case 45 -> ll(665439657, var9 ^ 1200360854);
            case 46 -> ll(665439656, var9 ^ -1683422257);
            case 47 -> ll(665439659, var9 ^ 307777138);
            case 48 -> ll(665439658, var9 ^ -1375246421);
            case 49 -> ll(665439661, var9 ^ 1776275700);
            case 50 -> ll(665439660, var9 ^ -1115788353);
            case 51 -> ll(665439663, var9 ^ 701701997);
            case 52 -> ll(665439662, var9 ^ 266063499);
            case 53 -> ll(665439697, var9 ^ 1045691973);
            case 54 -> ll(665439696, var9 ^ 1034472506);
            case 55 -> ll(665439699, var9 ^ -702924101);
            case 56 -> ll(665439698, var9 ^ -1304345305);
            case 57 -> ll(665439701, var9 ^ -507570114);
            case 58 -> ll(665439700, var9 ^ -497353205);
            case 59 -> ll(665439703, var9 ^ -116794560);
            case 60 -> ll(665439702, var9 ^ 1556279354);
            case 61 -> ll(665439705, var9 ^ 1411702056);
            case 62 -> 3;
            case 63 -> ll(665439704, var9 ^ -1443406628);
            case 64 -> ll(665439707, var9 ^ 1074364132);
            case 65 -> ll(665439706, var9 ^ 83422709);
            case 66 -> ll(665439709, var9 ^ 235295421);
            case 67 -> ll(665439708, var9 ^ 619279776);
            case 68 -> ll(665439711, var9 ^ -1098080157);
            case 69 -> ll(665439710, var9 ^ 163421273);
            case 70 -> ll(665439681, var9 ^ -1521726811);
            case 71 -> ll(665439680, var9 ^ -860989030);
            case 72 -> ll(665439683, var9 ^ -1019704067);
            case 73 -> ll(665439682, var9 ^ 397184571);
            case 74 -> ll(665439685, var9 ^ 682736582);
            case 75 -> ll(665439684, var9 ^ 1745176284);
            case 76 -> ll(665439687, var9 ^ -1338108755);
            case 77 -> ll(665439686, var9 ^ 270213507);
            case 78 -> ll(665439689, var9 ^ -409943618);
            case 79 -> ll(665439688, var9 ^ 1326876949);
            case 80 -> ll(665439691, var9 ^ 1954658877);
            case 81 -> ll(665439690, var9 ^ 955678650);
            case 82 -> ll(665439693, var9 ^ -1179982911);
            case 83 -> ll(665439692, var9 ^ -642552149);
            case 84 -> ll(665439695, var9 ^ 126451906);
            case 85 -> ll(665439694, var9 ^ -1457303145);
            case 86 -> ll(665439729, var9 ^ 739536820);
            case 87 -> ll(665439728, var9 ^ 1522040943);
            case 88 -> ll(665439731, var9 ^ 539341840);
            case 89 -> ll(665439730, var9 ^ 891703511);
            case 90 -> ll(665439733, var9 ^ 2050437197);
            case 91 -> ll(665439732, var9 ^ -639459773);
            case 92 -> ll(665439735, var9 ^ 422089455);
            case 93 -> 0;
            case 94 -> ll(665439734, var9 ^ 400249738);
            case 95 -> 1;
            case 96 -> ll(665439737, var9 ^ -1893874390);
            case 97 -> ll(665439736, var9 ^ 1937442548);
            case 98 -> ll(665439739, var9 ^ 1724175237);
            case 99 -> ll(665439738, var9 ^ -1526582925);
            case 100 -> ll(665439741, var9 ^ -1595199695);
            case 101 -> ll(665439740, var9 ^ 183987697);
            case 102 -> ll(665439743, var9 ^ 573095202);
            case 103 -> ll(665439742, var9 ^ 299595407);
            case 104 -> ll(665439713, var9 ^ -1072188168);
            case 105 -> ll(665439712, var9 ^ -2083086247);
            case 106 -> ll(665439715, var9 ^ -695565243);
            case 107 -> ll(665439714, var9 ^ -580858910);
            case 108 -> ll(665439717, var9 ^ 1751358721);
            case 109 -> ll(665439716, var9 ^ 653451701);
            case 110 -> ll(665439719, var9 ^ -606297967);
            case 111 -> ll(665439718, var9 ^ 1492441596);
            case 112 -> ll(665439721, var9 ^ -1828731564);
            case 113 -> ll(665439720, var9 ^ 1098761781);
            case 114 -> ll(665439723, var9 ^ -1815567472);
            case 115 -> ll(665439722, var9 ^ -800802309);
            case 116 -> ll(665439725, var9 ^ 1859978354);
            case 117 -> ll(665439724, var9 ^ 115858510);
            case 118 -> ll(665439727, var9 ^ 1284720309);
            case 119 -> ll(665439726, var9 ^ -1409734898);
            case 120 -> ll(665439505, var9 ^ 877318784);
            case 121 -> ll(665439504, var9 ^ -960825102);
            case 122 -> ll(665439507, var9 ^ -1694991486);
            case 123 -> ll(665439506, var9 ^ 1705833681);
            case 124 -> ll(665439509, var9 ^ 1266756996);
            case 125 -> ll(665439508, var9 ^ -1146792880);
            case 126 -> ll(665439511, var9 ^ 913071678);
            case 127 -> ll(665439510, var9 ^ 671525001);
            case 128 -> ll(665439513, var9 ^ -1323691980);
            case 129 -> ll(665439512, var9 ^ 176435756);
            case 130 -> ll(665439515, var9 ^ -1465348477);
            case 131 -> ll(665439514, var9 ^ -1889277325);
            case 132 -> ll(665439517, var9 ^ 787943546);
            case 133 -> ll(665439516, var9 ^ 426509596);
            case 134 -> ll(665439519, var9 ^ 499978981);
            case 135 -> ll(665439518, var9 ^ -1913840);
            case 136 -> ll(665439489, var9 ^ 89331172);
            case 137 -> ll(665439488, var9 ^ -1990173424);
            case 138 -> ll(665439491, var9 ^ 1126038538);
            case 139 -> ll(665439490, var9 ^ -995714260);
            case 140 -> ll(665439493, var9 ^ 547774636);
            case 141 -> 4;
            case 142 -> ll(665439492, var9 ^ 1335404758);
            case 143 -> ll(665439495, var9 ^ 1441759921);
            case 144 -> ll(665439494, var9 ^ 1772725413);
            case 145 -> ll(665439497, var9 ^ 611430708);
            case 146 -> ll(665439496, var9 ^ 1919087179);
            case 147 -> ll(665439499, var9 ^ -1080662347);
            case 148 -> ll(665439498, var9 ^ 1624161314);
            case 149 -> ll(665439501, var9 ^ 1561829989);
            case 150 -> ll(665439500, var9 ^ 1304265580);
            case 151 -> ll(665439503, var9 ^ -2052644527);
            case 152 -> ll(665439502, var9 ^ 1361879868);
            case 153 -> ll(665439537, var9 ^ -1139544914);
            case 154 -> 5;
            case 155 -> ll(665439536, var9 ^ 1200979618);
            case 156 -> ll(665439539, var9 ^ -1706072833);
            case 157 -> ll(665439538, var9 ^ -711700340);
            case 158 -> ll(665439541, var9 ^ -2114827813);
            case 159 -> ll(665439540, var9 ^ 738530108);
            case 160 -> ll(665439543, var9 ^ -342980797);
            case 161 -> ll(665439542, var9 ^ -719717026);
            case 162 -> ll(665439545, var9 ^ 1845088925);
            case 163 -> ll(665439544, var9 ^ 1929551991);
            case 164 -> ll(665439547, var9 ^ 2124937902);
            case 165 -> 2;
            case 166 -> ll(665439546, var9 ^ 1181601090);
            case 167 -> ll(665439549, var9 ^ -7441059);
            case 168 -> ll(665439548, var9 ^ 2085694718);
            case 169 -> ll(665439551, var9 ^ 1787195002);
            case 170 -> ll(665439550, var9 ^ -783902820);
            case 171 -> ll(665439521, var9 ^ -1317912640);
            case 172 -> ll(665439520, var9 ^ 404092119);
            case 173 -> ll(665439523, var9 ^ 1454331034);
            case 174 -> ll(665439522, var9 ^ 704237186);
            case 175 -> ll(665439525, var9 ^ 588158307);
            case 176 -> ll(665439524, var9 ^ -224677012);
            case 177 -> ll(665439527, var9 ^ 1266028901);
            case 178 -> ll(665439526, var9 ^ 859935419);
            case 179 -> ll(665439529, var9 ^ -1191679798);
            case 180 -> ll(665439528, var9 ^ -1706081842);
            case 181 -> ll(665439531, var9 ^ -1913621840);
            case 182 -> ll(665439530, var9 ^ -981496872);
            case 183 -> ll(665439533, var9 ^ 1254536084);
            case 184 -> ll(665439532, var9 ^ -242662433);
            case 185 -> ll(665439535, var9 ^ 1890521548);
            case 186 -> ll(665439534, var9 ^ -1988264721);
            case 187 -> ll(665439569, var9 ^ -525892077);
            case 188 -> ll(665439568, var9 ^ 1813308925);
            case 189 -> ll(665439571, var9 ^ -123909522);
            case 190 -> ll(665439570, var9 ^ -227047951);
            case 191 -> ll(665439573, var9 ^ -1840839276);
            case 192 -> ll(665439572, var9 ^ -2012280297);
            case 193 -> ll(665439575, var9 ^ 919004227);
            case 194 -> ll(665439574, var9 ^ 1786453211);
            case 195 -> ll(665439577, var9 ^ 457022044);
            case 196 -> ll(665439576, var9 ^ 1117333198);
            case 197 -> ll(665439579, var9 ^ 1211219084);
            case 198 -> ll(665439578, var9 ^ -737208917);
            case 199 -> ll(665439581, var9 ^ 265742786);
            case 200 -> ll(665439580, var9 ^ 508461255);
            case 201 -> ll(665439583, var9 ^ 2069699279);
            case 202 -> ll(665439582, var9 ^ 1959875164);
            case 203 -> ll(665439553, var9 ^ 1445853269);
            case 204 -> ll(665439552, var9 ^ -1295583774);
            case 205 -> ll(665439555, var9 ^ -1907044107);
            case 206 -> ll(665439554, var9 ^ -1414129564);
            case 207 -> ll(665439557, var9 ^ 1080541760);
            case 208 -> ll(665439556, var9 ^ -959757208);
            case 209 -> ll(665439559, var9 ^ 275430414);
            case 210 -> ll(665439558, var9 ^ 1275587924);
            case 211 -> ll(665439561, var9 ^ -1742529828);
            case 212 -> ll(665439560, var9 ^ -389580644);
            case 213 -> ll(665439563, var9 ^ -235608860);
            case 214 -> ll(665439562, var9 ^ 258950258);
            case 215 -> ll(665439565, var9 ^ -1362738846);
            case 216 -> ll(665439564, var9 ^ -1738182824);
            case 217 -> ll(665439567, var9 ^ 2090588123);
            case 218 -> ll(665439566, var9 ^ 1737472890);
            case 219 -> ll(665439601, var9 ^ -2004279312);
            case 220 -> ll(665439600, var9 ^ -1120933696);
            case 221 -> ll(665439603, var9 ^ -1578584154);
            case 222 -> ll(665439602, var9 ^ -1071058948);
            case 223 -> ll(665439605, var9 ^ 913889874);
            case 224 -> ll(665439604, var9 ^ 1798761949);
            case 225 -> ll(665439607, var9 ^ -544474948);
            case 226 -> ll(665439606, var9 ^ -1142992717);
            case 227 -> ll(665439609, var9 ^ 793453082);
            case 228 -> ll(665439608, var9 ^ -2128965619);
            case 229 -> ll(665439611, var9 ^ -2010012028);
            case 230 -> ll(665439610, var9 ^ 1729277874);
            case 231 -> ll(665439613, var9 ^ 2119750153);
            case 232 -> ll(665439612, var9 ^ -583387858);
            case 233 -> ll(665439615, var9 ^ -561054585);
            case 234 -> ll(665439614, var9 ^ -1748749670);
            case 235 -> ll(665439585, var9 ^ 118208538);
            case 236 -> ll(665439584, var9 ^ -150060009);
            case 237 -> ll(665439587, var9 ^ 2135063974);
            case 238 -> ll(665439586, var9 ^ -559864069);
            case 239 -> ll(665439589, var9 ^ -866950444);
            case 240 -> ll(665439588, var9 ^ 1109309118);
            case 241 -> ll(665439591, var9 ^ -1386579110);
            case 242 -> ll(665439590, var9 ^ 165269371);
            case 243 -> ll(665439593, var9 ^ -263161244);
            case 244 -> ll(665439592, var9 ^ 1061317225);
            case 245 -> ll(665439595, var9 ^ -139817866);
            case 246 -> ll(665439594, var9 ^ 926240894);
            case 247 -> ll(665439597, var9 ^ -2018597031);
            case 248 -> ll(665439596, var9 ^ -753195613);
            case 249 -> ll(665439599, var9 ^ -819234721);
            case 250 -> ll(665439598, var9 ^ -43413239);
            case 251 -> ll(665439377, var9 ^ 2069479007);
            case 252 -> ll(665439376, var9 ^ 856812040);
            case 253 -> ll(665439379, var9 ^ 1327265970);
            case 254 -> ll(665439378, var9 ^ 1415399021);
            default -> ll(665439381, var9 ^ 978177234);
         };
         int var5 = (var1 & ll(665439380, var9 ^ 1372789829)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(665439383, var9 ^ 1460029873)) >>> ll(665439382, var9 ^ 324190408)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(665439385, var9 ^ -890173899);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(665439384, var9 ^ -1960352220);
            }
         }

         l[var2] = new String(var3).intern();
      }

      return l[var2];
   }
}
