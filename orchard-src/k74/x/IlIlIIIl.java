package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIlIIIl {
   lI,
   ll;
   private static final IlIlIIIl[] I;
   private static final String[] l;
   private static final Object[] IlI;
   private static final String[] IIl;
   private static String[] II;
   private static final int[] III;
   private static final String[] Il;

   private static int ll(int var0, int var1) {
      int var2 = III[var0 ^ 864958629] ^ var1 ^ var0;
      var2 += 25448;
      var2 += 38759;
      var2 -= 40119;
      var2 ^= 43651;
      var2 ^= 19874;
      var2 ^= 50406;
      var2 -= 52808;
      var2 -= 51582;
      return var2 ^ 51196;
   }

   public static IlIlIIIl I(String var0) {
      return Enum.valueOf(IlIlIIIl.class, var0);
   }

   private static String l(char[] var0, long var1, int var3) {
      int var4 = ll(864958636, -1662836517 ^ -1665315035) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(864958639, -1662836517 ^ 330428442);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static IlIlIIIl[] II() {
      return new IlIlIIIl[]{lI, ll};
   }

   private static String III(char var0, short var1, int var2) {
      int var3 = var0 ^ 'Ｊ';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 32055;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 17497;
         var10 += 8348;
         var10 -= 41324;
         var10 += 12399;
         var10 ^= 2563;
         var10 ^= 13817;
         var10 -= 65195;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static void Il() {
      int var0 = -859645825;
      II[0] = l(lI(ll(864958638, var0 ^ 637491910), ll(864958633, var0 ^ -146612251)).toCharArray(), 89508L, ll(864958632, var0 ^ -1697856227));
      II[1] = l(lI(ll(864958635, var0 ^ 70590872), ll(864958634, var0 ^ -1894215803)).toCharArray(), 14028L, ll(864958645, var0 ^ -321486864));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -1690860372;
      int var14 = "\nꗫ룒磩\ue23a믷쪀跷駱戍묍".length();
      String var13 = "\nꗫ룒磩\ue23a믷쪀跷駱戍묍";
      short var18 = 32672;
      int var16 = 0;
      int var17 = 0;
      String[] var15 = new String[1];

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIl = var15;
      IlI = new Object[var15.length];
      int var9 = 705136853;
      byte[] var7 = "\u0084\u0098k-ç\u0082÷¾\u0088\u0091÷ë5\u009a]\u009eý\u0081½\u008f\u001f\u001eT\u0094\u0001>\",±ñ1yDÇo=Iré\u0010\u0096Ù~Mð¶\"\u0001\"\tÅú \u007f\u0019-Ñ|Y[ZRY^¶\\\u0015Øó{þÌåp\u0011ëU.p\u00adãt\u0089M)²Ï`R¼µå\u0099\u008bàôÖ§üç½\u008c«\u009eÃ\u001d9\u00ad³fìþ¹zF\u0084\u0017ò¥¾sãåÁ×o¨\u000b-¿\u0089\u0094èPâ¥\u001c¥dñþ\u0092\u0080â\u001bLe:\u0018ó&Ñ ª»\u008fX,l9îÏ\u0089Ù»óÐÐfC\u001d9<\u001d'2£µ»/¾\u0099dY\u0084¾\u0086\u0015-\u00908÷hk8\u0081\u009b©ë\u0081\u0006U\u001e\u009cµ\u001a\u009f¦.\u009cL¢\fäëÊ@íJÚLb¦w\u0090.|\u0081.0v\t?6~G6\u0019hÍmC\u0015EÏü\u0090lÁ'V°°l2P\u000bnF\fnÊ« ¿J'Ø3[µNä$**Õe\u0084?\u0010£{B\u0007\u0086¬.³\u000eòü\u008bøû:kÌqÇ`Dy\u0012BÜ'ÊBÆâ\u008cÔÞ$ô\"\u008e\"ø \u0017\u0085X>\u0016Þ\u008eÔH\u001fÂóÆ,\u0091ßkhÜ\u0083øÚHaÜ0öCÎ!LºFÝ¸ñ<æ\u009c¸3\u0083\u0005þ:Ñ]Î \u0093\u001aÈ¾¯¨uÇÌ&æÂÜ6^ò\u0013%£!¨&\u009aãH\u0085â¾\"\u0093?î\u008aú?6B\u0089£1Å\u0090\u008fcL\u008a\u009eºËã,0çß7©®ÏyÜ\u0001®(ÒKÉ\u001d\u0088\u0011\u008cÚ\u008f\bå0\tþ÷Ã§R\u0090¿ùpòeféz\nVB$%\rþ<_\u009fò\u0097\u00804ñSÁ+\u001eÞ\u007fºØ½\u009f+ÉüÑ8Î¿)¥Ê¾,OSDÅ\u0082Â\u000e7\"q¬ÉË¶ÆÕ\u001c\u0096+\u0089Ä³h\u0087î×;¿\u0019¡Ñ\u0097H¨B=\u008f~\u009c\u009f²\u0084®\u0089\u0089uFÃÉ:P\u008a*}\fF¦\b2\u0005åd0\\ª,\u009e>cYÎM\u0014R\u0080\u0099À÷\u0084»|CK\u0010\u0088CxHXê¦\u0083b£¢ë\u009e\u008bmÖêâ\bG4Ã.\u0084\u0013{Â/_×Sæß\u0006\u0013-\u007fï´ã;n\u009f»\u007f0\u00191G$L\u0012«¯]\tyÐ\"\u009ejÚ4\u00016nÍB\u0001¦\u008bla±\u0089kJ\u008dá½â ´\u008b5VW\u0010Þ\t\u009dÈ¢tª7,½÷\u001e\u008e\u001a\u000f©\r84¯\u009d^Ôm`\u0081\u008cCså«i>\u009f\u0013ãËFÛ!QC\u0083Õh£ jR\bëh\u0082ÁJ EúÉ¹(c\u0091\u0094\u0091}O#\u001c|\u0088\u0000\u000bT½ØJj ~°Ø\u0083\u001b¿@\u009dÁEn X\u0092úµVÍ÷5\u0003xb[h4óót²\u0013²cÎ\u001bXÛä'¸6\\¢\u001bÏ\u0080éQ\u001c\u0006APîBPa\u001fñE\u0083¥\u000fA¦\u0088®\u00178\u0095Q^}JÅ/Ö?À!B\u009afe\u0016^}¾´\u001d\u0017p\u0099\u0016rþ\u008bô¬ª\f\u000e× \u00ad±õ®\u0012\u001a¥¬Ó¬~Â\tbYÀ,·\u009a©\u00113ê4!5ö<d«RyZÔµ\u0088xÉ\u001fhÍ×;Æ¡\u0091\u0088Þ¾ÀØ\u0080Üïï\u009a;½ùÁ{K~k¤3nÐ\u008d¬3ß(Ìça\u008eÉ1h\u0006$K\u001c£\f.¸bÄ\u001eð©4\u0019NG\f\u0006\u000b\u008b\u0095Õ´\bîÉÎ®~ë\u000e\u000eÊÚu[³p{%¾Ü\t[Ò\u009f\u0011àåà\u000e\u008a\u0019\u008b\u0091ô\t/ò\u00adõfË\u0007@ä\u008c\bÒsÃ¬\u008e\u0015\u0088\u007f]es\u0013 <\u0097oÖ{vÎ\u0011¢ \u001eç\u008e1_õ¿Å\u009al^>Ãçví6aî\u0019aæ\u008e£[XÈÝ¦K\u008fÂtÃ\u009e`ã\u0080Gt2ø÷\u0097Dçøï\u0002\u008bqg\u009fN\u0088\u009aï%«öË\u000e:¹Ùsy/\u0004ü\tÁ\u0007¦áUì"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      III = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         III[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III('Ｊ', (short)'킈', var23 ^ -1776121322)).length();
      char var1 = 4;
      int var0 = -1;

      while (true) {
         char[] var10002;
         label73: {
            int var10000 = ll(864958629, var23 ^ 103039424);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var31 = var10000;
            var10002 = var10003;
            int var26 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            } else {
               var31 = var10000;
               var26 = var10004;
               if (var10004 <= var6) {
                  break label73;
               }

               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % ll(864958628, var23 ^ 1698619021)) {
                  case 0 -> ll(864958631, var23 ^ 170777966);
                  case 1 -> ll(864958630, var23 ^ -1222215897);
                  case 2 -> ll(864958625, var23 ^ 2134742996);
                  case 3 -> ll(864958624, var23 ^ -1650295291);
                  case 4 -> ll(864958627, var23 ^ -2088630157);
                  case 5 -> ll(864958626, var23 ^ 860691254);
                  default -> ll(864958637, var23 ^ -964999764);
               });
               var6++;
               if (var31 == 0) {
                  var10006 = var31;
                  var10005 = var10002;
                  var10004 = var31;
               } else {
                  if (var26 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var31;
                  var10006 = var6;
               }
            }
         }

         String var33 = new String(var10002).intern();
         byte var28 = -1;
         var5[var3++] = var33;
         if ((var0 += var1) >= var4) {
            Il = var5;
            l = new String[2];
            II = new String[2];
            Il();
            lI = new IlIlIIIl();
            ll = new IlIlIIIl();
            I = II();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static String lI(int var0, int var1) {
      int var9 = 1982631400;
      int var2 = (var0 ^ ll(864958644, var9 ^ -1663249530)) & ll(864958647, var9 ^ -1965776489);
      if (l[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & ll(864958646, var9 ^ 982078416)) {
            case 0 -> ll(864958641, var9 ^ -1932285331);
            case 1 -> ll(864958640, var9 ^ 1175841827);
            case 2 -> ll(864958643, var9 ^ 1025218143);
            case 3 -> ll(864958642, var9 ^ -164838467);
            case 4 -> ll(864958653, var9 ^ -1191125236);
            case 5 -> ll(864958652, var9 ^ -768898858);
            case 6 -> ll(864958655, var9 ^ -1397089629);
            case 7 -> ll(864958654, var9 ^ -591278203);
            case 8 -> ll(864958649, var9 ^ -690133604);
            case 9 -> ll(864958648, var9 ^ 2018870786);
            case 10 -> ll(864958651, var9 ^ 474269512);
            case 11 -> ll(864958650, var9 ^ -1194816602);
            case 12 -> ll(864958597, var9 ^ 1108912776);
            case 13 -> ll(864958596, var9 ^ -2013806304);
            case 14 -> ll(864958599, var9 ^ 1929528925);
            case 15 -> ll(864958598, var9 ^ -1858755727);
            case 16 -> ll(864958593, var9 ^ 1961575940);
            case 17 -> ll(864958592, var9 ^ 2001995051);
            case 18 -> ll(864958595, var9 ^ -821192625);
            case 19 -> ll(864958594, var9 ^ 931876702);
            case 20 -> ll(864958605, var9 ^ -2123846934);
            case 21 -> ll(864958604, var9 ^ -732630239);
            case 22 -> ll(864958607, var9 ^ 165953085);
            case 23 -> ll(864958606, var9 ^ 1404699659);
            case 24 -> ll(864958601, var9 ^ -871196272);
            case 25 -> ll(864958600, var9 ^ -784447577);
            case 26 -> ll(864958603, var9 ^ -350640979);
            case 27 -> ll(864958602, var9 ^ 1110907780);
            case 28 -> ll(864958613, var9 ^ 130816881);
            case 29 -> ll(864958612, var9 ^ -200357641);
            case 30 -> ll(864958615, var9 ^ 1777483085);
            case 31 -> ll(864958614, var9 ^ -625099544);
            case 32 -> ll(864958609, var9 ^ 1094414202);
            case 33 -> ll(864958608, var9 ^ 1665386576);
            case 34 -> ll(864958611, var9 ^ 793405925);
            case 35 -> ll(864958610, var9 ^ 600147351);
            case 36 -> ll(864958621, var9 ^ -7774246);
            case 37 -> ll(864958620, var9 ^ 1100436849);
            case 38 -> ll(864958623, var9 ^ 1351703905);
            case 39 -> ll(864958622, var9 ^ 1505643273);
            case 40 -> ll(864958617, var9 ^ 48510567);
            case 41 -> ll(864958616, var9 ^ -1604602906);
            case 42 -> ll(864958619, var9 ^ -1367312916);
            case 43 -> ll(864958618, var9 ^ -540339935);
            case 44 -> ll(864958693, var9 ^ 1690920331);
            case 45 -> ll(864958692, var9 ^ 23955587);
            case 46 -> ll(864958695, var9 ^ -789773150);
            case 47 -> ll(864958694, var9 ^ 1560057559);
            case 48 -> ll(864958689, var9 ^ -1954346533);
            case 49 -> ll(864958688, var9 ^ -1161648276);
            case 50 -> ll(864958691, var9 ^ 2130991353);
            case 51 -> ll(864958690, var9 ^ 1747029842);
            case 52 -> ll(864958701, var9 ^ -592850614);
            case 53 -> ll(864958700, var9 ^ -463480720);
            case 54 -> ll(864958703, var9 ^ 74142479);
            case 55 -> ll(864958702, var9 ^ 266557952);
            case 56 -> ll(864958697, var9 ^ 763036903);
            case 57 -> ll(864958696, var9 ^ 761381330);
            case 58 -> ll(864958699, var9 ^ -1149696181);
            case 59 -> ll(864958698, var9 ^ 1294532933);
            case 60 -> ll(864958709, var9 ^ 1336977086);
            case 61 -> ll(864958708, var9 ^ 1370619269);
            case 62 -> ll(864958711, var9 ^ -1141949157);
            case 63 -> ll(864958710, var9 ^ -1671360754);
            case 64 -> ll(864958705, var9 ^ -1328788492);
            case 65 -> ll(864958704, var9 ^ -329254749);
            case 66 -> ll(864958707, var9 ^ 242946917);
            case 67 -> ll(864958706, var9 ^ 745079317);
            case 68 -> ll(864958717, var9 ^ -706609498);
            case 69 -> ll(864958716, var9 ^ -1633958557);
            case 70 -> ll(864958719, var9 ^ -678125486);
            case 71 -> ll(864958718, var9 ^ -1851919656);
            case 72 -> ll(864958713, var9 ^ -1584942633);
            case 73 -> ll(864958712, var9 ^ -1491497785);
            case 74 -> ll(864958715, var9 ^ 442560228);
            case 75 -> ll(864958714, var9 ^ -1989804222);
            case 76 -> ll(864958661, var9 ^ 827666496);
            case 77 -> ll(864958660, var9 ^ -863597721);
            case 78 -> ll(864958663, var9 ^ -180065311);
            case 79 -> ll(864958662, var9 ^ -1927741000);
            case 80 -> ll(864958657, var9 ^ 1347004832);
            case 81 -> ll(864958656, var9 ^ 1351704878);
            case 82 -> ll(864958659, var9 ^ -862525596);
            case 83 -> ll(864958658, var9 ^ -523997388);
            case 84 -> ll(864958669, var9 ^ -249698029);
            case 85 -> ll(864958668, var9 ^ 1134019650);
            case 86 -> ll(864958671, var9 ^ 1477348784);
            case 87 -> 4;
            case 88 -> ll(864958670, var9 ^ 377168709);
            case 89 -> ll(864958665, var9 ^ 1198876766);
            case 90 -> ll(864958664, var9 ^ 1915695758);
            case 91 -> ll(864958667, var9 ^ -1255659001);
            case 92 -> ll(864958666, var9 ^ 1605295537);
            case 93 -> ll(864958677, var9 ^ -1409257368);
            case 94 -> ll(864958676, var9 ^ -799124629);
            case 95 -> ll(864958679, var9 ^ 180472397);
            case 96 -> ll(864958678, var9 ^ 1710317850);
            case 97 -> ll(864958673, var9 ^ 1252711713);
            case 98 -> ll(864958672, var9 ^ 809029759);
            case 99 -> ll(864958675, var9 ^ -275525096);
            case 100 -> ll(864958674, var9 ^ -1366541272);
            case 101 -> ll(864958685, var9 ^ 270400120);
            case 102 -> ll(864958684, var9 ^ -259200468);
            case 103 -> ll(864958687, var9 ^ -1096815133);
            case 104 -> ll(864958686, var9 ^ 1174596020);
            case 105 -> ll(864958681, var9 ^ 1139306712);
            case 106 -> ll(864958680, var9 ^ -1440357933);
            case 107 -> ll(864958683, var9 ^ 1485132345);
            case 108 -> ll(864958682, var9 ^ -1502833620);
            case 109 -> ll(864958501, var9 ^ -1162103478);
            case 110 -> ll(864958500, var9 ^ -429682613);
            case 111 -> ll(864958503, var9 ^ -397806488);
            case 112 -> ll(864958502, var9 ^ -792821174);
            case 113 -> ll(864958497, var9 ^ -118518991);
            case 114 -> ll(864958496, var9 ^ 1378376866);
            case 115 -> ll(864958499, var9 ^ -267016424);
            case 116 -> ll(864958498, var9 ^ -433170892);
            case 117 -> ll(864958509, var9 ^ -1402070968);
            case 118 -> ll(864958508, var9 ^ -443719938);
            case 119 -> ll(864958511, var9 ^ 687942431);
            case 120 -> ll(864958510, var9 ^ 1782728695);
            case 121 -> ll(864958505, var9 ^ 856493707);
            case 122 -> ll(864958504, var9 ^ 1371830882);
            case 123 -> ll(864958507, var9 ^ 582185379);
            case 124 -> ll(864958506, var9 ^ -160967615);
            case 125 -> ll(864958517, var9 ^ -723820367);
            case 126 -> ll(864958516, var9 ^ 2133811397);
            case 127 -> ll(864958519, var9 ^ 671074616);
            case 128 -> ll(864958518, var9 ^ -322600748);
            case 129 -> ll(864958513, var9 ^ -2076596012);
            case 130 -> ll(864958512, var9 ^ -1186086515);
            case 131 -> ll(864958515, var9 ^ 680780005);
            case 132 -> ll(864958514, var9 ^ -340502478);
            case 133 -> ll(864958525, var9 ^ 1090057232);
            case 134 -> ll(864958524, var9 ^ -1988614757);
            case 135 -> ll(864958527, var9 ^ 1121504305);
            case 136 -> ll(864958526, var9 ^ -1935913357);
            case 137 -> ll(864958521, var9 ^ -724036642);
            case 138 -> ll(864958520, var9 ^ 1591740216);
            case 139 -> ll(864958523, var9 ^ 2097974650);
            case 140 -> ll(864958522, var9 ^ 1725887362);
            case 141 -> ll(864958469, var9 ^ -238159361);
            case 142 -> ll(864958468, var9 ^ 1855016210);
            case 143 -> ll(864958471, var9 ^ 765887939);
            case 144 -> ll(864958470, var9 ^ 63345406);
            case 145 -> ll(864958465, var9 ^ 82685564);
            case 146 -> ll(864958464, var9 ^ -767229006);
            case 147 -> ll(864958467, var9 ^ -460163642);
            case 148 -> ll(864958466, var9 ^ 2138647283);
            case 149 -> ll(864958477, var9 ^ -1492822378);
            case 150 -> ll(864958476, var9 ^ 1485545071);
            case 151 -> ll(864958479, var9 ^ 1898527168);
            case 152 -> ll(864958478, var9 ^ -961930715);
            case 153 -> ll(864958473, var9 ^ -1069908616);
            case 154 -> 1;
            case 155 -> ll(864958472, var9 ^ 46637766);
            case 156 -> ll(864958475, var9 ^ 752141889);
            case 157 -> ll(864958474, var9 ^ 110738542);
            case 158 -> ll(864958485, var9 ^ -1939053106);
            case 159 -> ll(864958484, var9 ^ 1324769338);
            case 160 -> ll(864958487, var9 ^ -1160806364);
            case 161 -> ll(864958486, var9 ^ 99953563);
            case 162 -> ll(864958481, var9 ^ 119923414);
            case 163 -> ll(864958480, var9 ^ 1340266859);
            case 164 -> ll(864958483, var9 ^ -695254831);
            case 165 -> ll(864958482, var9 ^ -80322997);
            case 166 -> ll(864958493, var9 ^ 1287348031);
            case 167 -> ll(864958492, var9 ^ 1873573808);
            case 168 -> ll(864958495, var9 ^ -1209185818);
            case 169 -> ll(864958494, var9 ^ 286784470);
            case 170 -> ll(864958489, var9 ^ 1947755381);
            case 171 -> ll(864958488, var9 ^ -1360900825);
            case 172 -> 0;
            case 173 -> ll(864958491, var9 ^ 926276003);
            case 174 -> ll(864958490, var9 ^ 963302591);
            case 175 -> ll(864958565, var9 ^ 1826570712);
            case 176 -> ll(864958564, var9 ^ 127127655);
            case 177 -> ll(864958567, var9 ^ 454373542);
            case 178 -> ll(864958566, var9 ^ 208222288);
            case 179 -> ll(864958561, var9 ^ -1270676302);
            case 180 -> ll(864958560, var9 ^ 1509654933);
            case 181 -> ll(864958563, var9 ^ -1608004923);
            case 182 -> ll(864958562, var9 ^ 1939956523);
            case 183 -> ll(864958573, var9 ^ -2115669462);
            case 184 -> ll(864958572, var9 ^ 1884710586);
            case 185 -> ll(864958575, var9 ^ -894934329);
            case 186 -> ll(864958574, var9 ^ -418827072);
            case 187 -> ll(864958569, var9 ^ -84509225);
            case 188 -> ll(864958568, var9 ^ 627182711);
            case 189 -> ll(864958571, var9 ^ 1348928070);
            case 190 -> ll(864958570, var9 ^ -171882765);
            case 191 -> ll(864958581, var9 ^ 836410669);
            case 192 -> ll(864958580, var9 ^ 1924158231);
            case 193 -> ll(864958583, var9 ^ 2044058929);
            case 194 -> ll(864958582, var9 ^ -1693742830);
            case 195 -> ll(864958577, var9 ^ 1634763668);
            case 196 -> ll(864958576, var9 ^ -565015068);
            case 197 -> ll(864958579, var9 ^ 1963101966);
            case 198 -> ll(864958578, var9 ^ -1009131240);
            case 199 -> ll(864958589, var9 ^ 234808206);
            case 200 -> ll(864958588, var9 ^ -667055380);
            case 201 -> ll(864958591, var9 ^ 1548555901);
            case 202 -> ll(864958590, var9 ^ 1515266002);
            case 203 -> ll(864958585, var9 ^ -990553476);
            case 204 -> ll(864958584, var9 ^ -1156404296);
            case 205 -> ll(864958587, var9 ^ -1497871735);
            case 206 -> ll(864958586, var9 ^ -1197677267);
            case 207 -> 3;
            case 208 -> ll(864958533, var9 ^ -30409498);
            case 209 -> ll(864958532, var9 ^ -1350589665);
            case 210 -> ll(864958535, var9 ^ -2142717567);
            case 211 -> ll(864958534, var9 ^ -765533409);
            case 212 -> 2;
            case 213 -> ll(864958529, var9 ^ 618219649);
            case 214 -> ll(864958528, var9 ^ 1556738078);
            case 215 -> ll(864958531, var9 ^ -1013645967);
            case 216 -> ll(864958530, var9 ^ -1556069789);
            case 217 -> ll(864958541, var9 ^ -1500099999);
            case 218 -> ll(864958540, var9 ^ 1273773853);
            case 219 -> ll(864958543, var9 ^ 1669962736);
            case 220 -> ll(864958542, var9 ^ -1413885018);
            case 221 -> ll(864958537, var9 ^ 1539206192);
            case 222 -> ll(864958536, var9 ^ 1671506106);
            case 223 -> ll(864958539, var9 ^ -93153477);
            case 224 -> ll(864958538, var9 ^ -2123436667);
            case 225 -> ll(864958549, var9 ^ 290205137);
            case 226 -> ll(864958548, var9 ^ -1518512422);
            case 227 -> ll(864958551, var9 ^ -589866658);
            case 228 -> ll(864958550, var9 ^ -780457257);
            case 229 -> ll(864958545, var9 ^ -1120390643);
            case 230 -> ll(864958544, var9 ^ -1975046824);
            case 231 -> ll(864958547, var9 ^ 1982641032);
            case 232 -> ll(864958546, var9 ^ 1720242667);
            case 233 -> ll(864958557, var9 ^ -1698568003);
            case 234 -> ll(864958556, var9 ^ 792964732);
            case 235 -> ll(864958559, var9 ^ -1110122440);
            case 236 -> ll(864958558, var9 ^ -508384405);
            case 237 -> ll(864958553, var9 ^ 851595502);
            case 238 -> ll(864958552, var9 ^ -811879331);
            case 239 -> ll(864958555, var9 ^ -1176742498);
            case 240 -> ll(864958554, var9 ^ 2114290484);
            case 241 -> ll(864958885, var9 ^ -2010574064);
            case 242 -> ll(864958884, var9 ^ -1709643957);
            case 243 -> ll(864958887, var9 ^ 66657508);
            case 244 -> ll(864958886, var9 ^ -1999515983);
            case 245 -> 5;
            case 246 -> ll(864958881, var9 ^ 239680257);
            case 247 -> ll(864958880, var9 ^ -1993768554);
            case 248 -> ll(864958883, var9 ^ 930086463);
            case 249 -> ll(864958882, var9 ^ 606658570);
            case 250 -> ll(864958893, var9 ^ -1405533631);
            case 251 -> ll(864958892, var9 ^ -270510535);
            case 252 -> ll(864958895, var9 ^ -1756318517);
            case 253 -> ll(864958894, var9 ^ -2006987506);
            case 254 -> ll(864958889, var9 ^ -455719923);
            default -> ll(864958888, var9 ^ 556775602);
         };
         int var5 = (var1 & ll(864958891, var9 ^ 1242354859)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(864958890, var9 ^ 1637746872)) >>> ll(864958901, var9 ^ 484314601)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(864958900, var9 ^ -1817255048);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(864958903, var9 ^ -918128752);
            }
         }

         l[var2] = new String(var3).intern();
      }

      return l[var2];
   }
}
