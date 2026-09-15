package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lIl {
   I,
   lI;

   private static String[] l;
   private static final Object[] IlI;
   private static final String[] IIl;
   private static final int[] III;
   private static final lIl[] II;
   private static final String[] Il;
   private static final String[] ll;

   private static String III(int var0, short var1, char var2) {
      int var3 = var2 ^ '顓';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 29112;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '蹏';
         var10 ^= 26406;
         var10 += 10995;
         var10 -= 52460;
         var10 ^= 55356;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static lIl[] I() {
      return new lIl[]{I, lI};
   }

   private static int ll(int var0, int var1) {
      int var2 = III[var0 ^ -1022504531] ^ var1 ^ var0;
      var2 += 62550;
      var2 ^= 21378;
      var2 += 11669;
      var2 += 59948;
      var2 += 10979;
      var2 += 48934;
      var2 -= 4952;
      return var2 ^ 24733;
   }

   public static lIl l(String var0) {
      return Enum.valueOf(lIl.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = 1474122558;
      char[] var15 = "\n".toCharArray();
      String var14 = "⒧횄\uf0db琿⯿梌疍욚霊休";
      short var13 = 8268;
      String[] var10000 = new String[var15.length];
      byte var20 = -1;
      String[] var16 = var10000;

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            IIl = var16;
            IlI = new Object[var16.length];
            int var9 = 1382346064;
            byte[] var7 = "q{Í1\u0085\u0084\u009eQû@ÉÓýbà=ú\u009e³«\u00852ÙÁÉ\u008e\u001a\u0010ëùÂP3¶¿1\u009f\u001eýl1¿i(}v$@c3\u0010Ï9\u0080Z:\u0006\u0084ÑÇH\u0099\u0019_åèÜTc\u008fa\u008d\u000b\u001c\u0005Ã>\u008e\u009fK\u0006\b#ºG\u0098&ÔoîÂ \u0006N\u001cV<·kQ¾Â\u00ad\u0087m¸K\u009eE\u0099q\u00847s\u001f]\u0089Ôª\u0080y\f\u009bî\u009fUZzþ\u009d\u0088A$O\\sG¹\u0095\u009f\u0011LªðÖÐ0sC\u000f©ºV\u000f\u008b«¬\u008eÂÅY2ìl\u009fÇU¶óO\u001fYQ:\u0099\"*#úËà\u0017\u000bv\u0002)d\u0002l\u008cù$\u009ci¤ö^=â¾bcuý\u007f)ËàîÖj\u001bÅ8¯\u0010\u0005¨TKq«m\u0016ÞYT\u0088ìw\u0006\u000b\u0094`\u0012Aèh\u0081V\u008b\u0088ü÷\u001f¥\u008bý3`\u0019Ì\u0004dÒ\u000e2\u0006DP5\u0001\u000e7Ë\b£òbªù\u0095Fl\tü}½\u008b\u008fï÷Ã¹¬N\u0082\u0014Ù|@\u0082\f\u0085Puåº\u009b´\u0003R¶X¡õÞôF{P\t®\u00ad\u008aA\u0097gV\u008dó\u00949¸Ûiè¹\u0012Á);\u007fäkXâR>Ý¦e\u0003ÆÝk_ù\u001aA$\u008auàî\u0004\"v\t$ºQB\u000e(ÞOdSt¹ý\u0092ìVðSÏÃ\u0006WXmHsñ\u008cãÏË*x¸å\u00adô\u0095\b\u0016\u008b\u009eÆ\f£ò\u0093òìþ\u0007\u0001O@üu<ó46\u000fÁ1ÚH\u008bÝ(#Ën\u001fá\u009a\u00010¿èé\u009c(\u0086\u0087\u0092W5¯\u001a~\u0089di\u000f\u009aéX÷OiÛÞ,\u0018èv«\u0084qä\u000f¿Æ.é7\u000e\u0019_\u0000TÁáþ¨\u0003¦Sï÷\u0096V.#þWÒÃ2Vu\u00ad\u001aòß\u001f+[\ní\u009ctN\u00adÛ¢AV\bZ\u0003Pìæ\u009f\u0083Þ\u001e\u0091;Þp¦½iCn¦\u0090î|¶Õâë¥°¸e\u0000B\u0084Öu\"Æú\r¸@\u009d\u0001Ò!L\u0080.Òº\u009f$\u009a¾ú/Õlª\u0083\u0017\u001aP~(Ëû\fÏ3\u008eµÃ\u0016\u008a\u0015Â\u008fpDnÛ|QxY\u0087\u009enGM\u0010¾\b\bÙ\u0019³ôvÉ/¶\u009c\u0098\u009a\u0088\u0082'Ò^x¸\u009f\u008e5'\u0005ÑsjúýÅ£K\u008e*ð¼Ï\u0096\u001fá}þÔÓpgäyA«þ2 Ó&\u001cüòý\u0014Û$\\¶=÷¬VÿïD\u008b\u0080.\u008cé®¶\u008fµ%\u0000É£Y*Ôx\u0085\u0000%*cÍ\u0016a\u0007Çe\u000b{ëq¼@O\u0088\u0018êÓ\u0004é2÷\u008d|\u001d\u001fÀzgÔ§\u0095\u000bêÚ¾!Ö@¥Ë+}Øc\u0092ê± ¿\u008b÷°\u0016\u0085\u0006Îkæ\u000bD\u001aSêý6\u0096ÿÔ3)\u0086f`&\u0012à«·£@\u009dW\u009f¬Ø»\u009b\u0004ò\u0003\u001b¿ì\u0011TÐ[\u0013Jw\u0093©\u0005\u0018oy\u0087j\u0000\u009d.u£+ÏDB\t¡Ëj¬ý\u0005ýYFêc\u009d\u0094\u000e#\u009c\u0090z5hÖ¡gu¡\u0000j·c\u00979\rÜÏÐÏ(ýi<\u009b \u0085Ñð£ÜþE¯\u000b\u000f+E\u001bÒÚO\u0088i2Ö\u0093ï\u007fû0Ö÷gÃ:\u00addªô v\u0006ù\u0083ÁÖ0C\u0010\u0018Í$\t\u0004»ú#«ÚäÃÀ\u0000±*Þµ\u0001\u001a\n¦ÒüXËÑ\u007f\u0017**^ÿÔ¿E\u007fåpÒçh|tgÖW*¢\r\u000f\u0013¸µµs7¤\u0093_\u0086Ð9\u009e\u0091°\u000f`\u009fÔà\u008bèÿH7iFI-ª\u008f°\u001e\u0017¢_Lò\u0088H¼¯bò.:ú2÷\u0087øo¦\u009füBñ\u001b0Ü¶e\u000fÎ!`\u0080\u0004×\nÇÑ:\u001eOª\u0080ö)2é,¬LÄñûþ<iìSáñø9/\b\u0095\u008eÈ\u0011¾Ëz$^\u001a,}±}FÄy?\u0083ë§ðÙ\rËÿ\n\u0093ÓÛ\t\u0092/çP0@\u0000\u0006"
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
            int var4 = (var2 = III(var24 ^ 695867114, (short)18014, '顓')).length();
            char var1 = 4;
            int var0 = -1;

            while (true) {
               char[] var10002;
               label82: {
                  int var29 = ll(-1022504531, var24 ^ 1211273074);
                  char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                  int var10004 = var10003.length;
                  int var6 = 0;
                  int var35 = var29;
                  var10002 = var10003;
                  int var30 = var10004;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var10004 = var29;
                     var10006 = var6;
                  } else {
                     var35 = var29;
                     var30 = var10004;
                     if (var10004 <= var6) {
                        break label82;
                     }

                     var10005 = var10003;
                     var10004 = var29;
                     var10006 = var6;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % ll(-1022504532, var24 ^ -1127359289)) {
                        case 0 -> ll(-1022504529, var24 ^ -1039561867);
                        case 1 -> ll(-1022504530, var24 ^ -1003773315);
                        case 2 -> ll(-1022504535, var24 ^ -1009258003);
                        case 3 -> ll(-1022504536, var24 ^ -1132749988);
                        case 4 -> ll(-1022504533, var24 ^ -255371094);
                        case 5 -> ll(-1022504534, var24 ^ -760184639);
                        default -> 1;
                     });
                     var6++;
                     if (var35 == 0) {
                        var10006 = var35;
                        var10005 = var10002;
                        var10004 = var35;
                     } else {
                        if (var30 <= var6) {
                           break;
                        }

                        var10005 = var10002;
                        var10004 = var35;
                        var10006 = var6;
                     }
                  }
               }

               String var37 = new String(var10002).intern();
               byte var32 = -1;
               var5[var3++] = var37;
               if ((var0 += var1) >= var4) {
                  ll = var5;
                  Il = new String[2];
                  l = new String[2];
                  Il();
                  I = new lIl();
                  lI = new lIl();
                  II = I();
                  return;
               }

               var1 = var2.charAt(var0);
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 85;
                  case 1 -> 209;
                  case 2 -> 24;
                  case 3 -> 122;
                  case 4 -> 160;
                  case 5 -> 177;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static String II(char[] var0, long var1, int var3) {
      int var4 = ll(-1022504539, 1655357399 ^ 1718601622) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(-1022504540, 1655357399 ^ -1826598829);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static void Il() {
      int var0 = -1038703003;
      l[0] = II(lI(ll(-1022504537, var0 ^ -1656987524), ll(-1022504538, var0 ^ -772464811)).toCharArray(), 32790L, ll(-1022504543, var0 ^ 1106814196));
      l[1] = II(lI(ll(-1022504544, var0 ^ -1794944152), ll(-1022504541, var0 ^ -1442326298)).toCharArray(), 50080L, ll(-1022504542, var0 ^ -1540877223));
   }

   private static String lI(int var0, int var1) {
      int var9 = -1378280502;
      int var2 = (var0 ^ ll(-1022504515, var9 ^ 648308916)) & ll(-1022504516, var9 ^ -1597855305);
      if (Il[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & ll(-1022504513, var9 ^ -934212358)) {
            case 0 -> ll(-1022504514, var9 ^ -37513744);
            case 1 -> ll(-1022504519, var9 ^ -985323161);
            case 2 -> ll(-1022504520, var9 ^ -2066404165);
            case 3 -> 2;
            case 4 -> ll(-1022504517, var9 ^ -1398552483);
            case 5 -> ll(-1022504518, var9 ^ -989653319);
            case 6 -> ll(-1022504523, var9 ^ -368163);
            case 7 -> ll(-1022504524, var9 ^ 2106566418);
            case 8 -> ll(-1022504521, var9 ^ -1359658661);
            case 9 -> ll(-1022504522, var9 ^ -2032895008);
            case 10 -> ll(-1022504527, var9 ^ -197257970);
            case 11 -> ll(-1022504528, var9 ^ 1251582157);
            case 12 -> ll(-1022504525, var9 ^ -1170108029);
            case 13 -> ll(-1022504526, var9 ^ 1545097319);
            case 14 -> ll(-1022504563, var9 ^ 1037075147);
            case 15 -> ll(-1022504564, var9 ^ -419277162);
            case 16 -> ll(-1022504561, var9 ^ -2064343111);
            case 17 -> ll(-1022504562, var9 ^ -771645372);
            case 18 -> ll(-1022504567, var9 ^ 362625773);
            case 19 -> ll(-1022504568, var9 ^ -2143116348);
            case 20 -> ll(-1022504565, var9 ^ -1790803561);
            case 21 -> ll(-1022504566, var9 ^ 1875101839);
            case 22 -> ll(-1022504571, var9 ^ -1702893626);
            case 23 -> ll(-1022504572, var9 ^ 1552571930);
            case 24 -> ll(-1022504569, var9 ^ 805442800);
            case 25 -> ll(-1022504570, var9 ^ -1837657185);
            case 26 -> ll(-1022504575, var9 ^ -378604578);
            case 27 -> ll(-1022504576, var9 ^ 593101295);
            case 28 -> ll(-1022504573, var9 ^ -1050382628);
            case 29 -> ll(-1022504574, var9 ^ -1346243682);
            case 30 -> ll(-1022504547, var9 ^ 1596239315);
            case 31 -> ll(-1022504548, var9 ^ -1653544048);
            case 32 -> ll(-1022504545, var9 ^ -1590788200);
            case 33 -> ll(-1022504546, var9 ^ -1134247480);
            case 34 -> ll(-1022504551, var9 ^ 765158205);
            case 35 -> ll(-1022504552, var9 ^ 108373180);
            case 36 -> ll(-1022504549, var9 ^ -958046905);
            case 37 -> ll(-1022504550, var9 ^ -1293522959);
            case 38 -> ll(-1022504555, var9 ^ 487873933);
            case 39 -> ll(-1022504556, var9 ^ 792333453);
            case 40 -> ll(-1022504553, var9 ^ 1462573237);
            case 41 -> ll(-1022504554, var9 ^ 723880880);
            case 42 -> ll(-1022504559, var9 ^ 1220933455);
            case 43 -> ll(-1022504560, var9 ^ -588742207);
            case 44 -> ll(-1022504557, var9 ^ -265481393);
            case 45 -> ll(-1022504558, var9 ^ -953558828);
            case 46 -> ll(-1022504467, var9 ^ -246722868);
            case 47 -> ll(-1022504468, var9 ^ -162789547);
            case 48 -> ll(-1022504465, var9 ^ 138782976);
            case 49 -> ll(-1022504466, var9 ^ -1578635038);
            case 50 -> ll(-1022504471, var9 ^ -2061434333);
            case 51 -> 3;
            case 52 -> ll(-1022504472, var9 ^ -1091534573);
            case 53 -> ll(-1022504469, var9 ^ 750438707);
            case 54 -> 0;
            case 55 -> ll(-1022504470, var9 ^ 1862502567);
            case 56 -> ll(-1022504475, var9 ^ 439438156);
            case 57 -> ll(-1022504476, var9 ^ -808953308);
            case 58 -> ll(-1022504473, var9 ^ 653758728);
            case 59 -> ll(-1022504474, var9 ^ -1071661880);
            case 60 -> ll(-1022504479, var9 ^ 1656280094);
            case 61 -> ll(-1022504480, var9 ^ -2060035578);
            case 62 -> ll(-1022504477, var9 ^ 1843429442);
            case 63 -> ll(-1022504478, var9 ^ 1412062396);
            case 64 -> ll(-1022504451, var9 ^ 819540912);
            case 65 -> ll(-1022504452, var9 ^ 405070709);
            case 66 -> ll(-1022504449, var9 ^ -779345098);
            case 67 -> ll(-1022504450, var9 ^ -1129750388);
            case 68 -> ll(-1022504455, var9 ^ 555693162);
            case 69 -> ll(-1022504456, var9 ^ 1697122808);
            case 70 -> ll(-1022504453, var9 ^ 505828657);
            case 71 -> ll(-1022504454, var9 ^ -653513229);
            case 72 -> ll(-1022504459, var9 ^ -1230117020);
            case 73 -> ll(-1022504460, var9 ^ -516226100);
            case 74 -> ll(-1022504457, var9 ^ 2031896665);
            case 75 -> ll(-1022504458, var9 ^ -342669922);
            case 76 -> ll(-1022504463, var9 ^ -1875266646);
            case 77 -> ll(-1022504464, var9 ^ 1369529655);
            case 78 -> ll(-1022504461, var9 ^ -1870476845);
            case 79 -> ll(-1022504462, var9 ^ -1810536486);
            case 80 -> ll(-1022504499, var9 ^ -1329821974);
            case 81 -> ll(-1022504500, var9 ^ 210116783);
            case 82 -> ll(-1022504497, var9 ^ 2074650405);
            case 83 -> ll(-1022504498, var9 ^ 1447369746);
            case 84 -> ll(-1022504503, var9 ^ 1569392184);
            case 85 -> ll(-1022504504, var9 ^ 836696184);
            case 86 -> ll(-1022504501, var9 ^ 1028262790);
            case 87 -> ll(-1022504502, var9 ^ -2085519454);
            case 88 -> ll(-1022504507, var9 ^ 813251723);
            case 89 -> ll(-1022504508, var9 ^ 41734204);
            case 90 -> ll(-1022504505, var9 ^ 1217405576);
            case 91 -> ll(-1022504506, var9 ^ 136516933);
            case 92 -> ll(-1022504511, var9 ^ 1498167869);
            case 93 -> ll(-1022504512, var9 ^ 732206457);
            case 94 -> ll(-1022504509, var9 ^ 1170905311);
            case 95 -> ll(-1022504510, var9 ^ -152956716);
            case 96 -> ll(-1022504483, var9 ^ 1244226488);
            case 97 -> ll(-1022504484, var9 ^ 1503941163);
            case 98 -> ll(-1022504481, var9 ^ -1943743822);
            case 99 -> ll(-1022504482, var9 ^ -279584045);
            case 100 -> ll(-1022504487, var9 ^ 1758034919);
            case 101 -> ll(-1022504488, var9 ^ -856503110);
            case 102 -> ll(-1022504485, var9 ^ 712639541);
            case 103 -> ll(-1022504486, var9 ^ -1672651138);
            case 104 -> ll(-1022504491, var9 ^ 582197578);
            case 105 -> ll(-1022504492, var9 ^ 1696523770);
            case 106 -> ll(-1022504489, var9 ^ 1427842213);
            case 107 -> ll(-1022504490, var9 ^ 1025169660);
            case 108 -> ll(-1022504495, var9 ^ -249856138);
            case 109 -> ll(-1022504496, var9 ^ -641739186);
            case 110 -> ll(-1022504493, var9 ^ -401211149);
            case 111 -> ll(-1022504494, var9 ^ 1597589443);
            case 112 -> ll(-1022504659, var9 ^ 418335702);
            case 113 -> ll(-1022504660, var9 ^ -887682793);
            case 114 -> ll(-1022504657, var9 ^ 799774134);
            case 115 -> ll(-1022504658, var9 ^ 492018541);
            case 116 -> ll(-1022504663, var9 ^ 490581777);
            case 117 -> ll(-1022504664, var9 ^ -1441897029);
            case 118 -> 5;
            case 119 -> ll(-1022504661, var9 ^ 1403221664);
            case 120 -> ll(-1022504662, var9 ^ 380625410);
            case 121 -> ll(-1022504667, var9 ^ 1945464609);
            case 122 -> ll(-1022504668, var9 ^ -2117477354);
            case 123 -> ll(-1022504665, var9 ^ -510921822);
            case 124 -> ll(-1022504666, var9 ^ 2064488422);
            case 125 -> ll(-1022504671, var9 ^ 292308684);
            case 126 -> ll(-1022504672, var9 ^ -308301024);
            case 127 -> ll(-1022504669, var9 ^ -405293967);
            case 128 -> ll(-1022504670, var9 ^ -325556636);
            case 129 -> ll(-1022504643, var9 ^ 1079644280);
            case 130 -> ll(-1022504644, var9 ^ -1117404759);
            case 131 -> ll(-1022504641, var9 ^ -813549246);
            case 132 -> ll(-1022504642, var9 ^ 1989024968);
            case 133 -> ll(-1022504647, var9 ^ -695237365);
            case 134 -> 4;
            case 135 -> ll(-1022504648, var9 ^ -2027695401);
            case 136 -> ll(-1022504645, var9 ^ -1841998998);
            case 137 -> ll(-1022504646, var9 ^ 1562594574);
            case 138 -> ll(-1022504651, var9 ^ -739048908);
            case 139 -> ll(-1022504652, var9 ^ 441760207);
            case 140 -> ll(-1022504649, var9 ^ -1249630662);
            case 141 -> ll(-1022504650, var9 ^ 1607832357);
            case 142 -> ll(-1022504655, var9 ^ 1097521300);
            case 143 -> ll(-1022504656, var9 ^ -1141533420);
            case 144 -> ll(-1022504653, var9 ^ -160821352);
            case 145 -> ll(-1022504654, var9 ^ -1339559104);
            case 146 -> ll(-1022504691, var9 ^ 116277744);
            case 147 -> ll(-1022504692, var9 ^ -373442820);
            case 148 -> ll(-1022504689, var9 ^ 1431496928);
            case 149 -> ll(-1022504690, var9 ^ 1033493239);
            case 150 -> ll(-1022504695, var9 ^ -1532398688);
            case 151 -> ll(-1022504696, var9 ^ 1756576562);
            case 152 -> ll(-1022504693, var9 ^ 275453522);
            case 153 -> ll(-1022504694, var9 ^ 833625610);
            case 154 -> ll(-1022504699, var9 ^ -418267967);
            case 155 -> ll(-1022504700, var9 ^ 887184548);
            case 156 -> ll(-1022504697, var9 ^ 738820451);
            case 157 -> ll(-1022504698, var9 ^ -306060308);
            case 158 -> ll(-1022504703, var9 ^ 1975696558);
            case 159 -> ll(-1022504704, var9 ^ -1014715687);
            case 160 -> ll(-1022504701, var9 ^ -375819573);
            case 161 -> ll(-1022504702, var9 ^ -1016586123);
            case 162 -> ll(-1022504675, var9 ^ 240872255);
            case 163 -> 1;
            case 164 -> ll(-1022504676, var9 ^ 69731033);
            case 165 -> ll(-1022504673, var9 ^ 675067567);
            case 166 -> ll(-1022504674, var9 ^ -1933241994);
            case 167 -> ll(-1022504679, var9 ^ 273277703);
            case 168 -> ll(-1022504680, var9 ^ 885028437);
            case 169 -> ll(-1022504677, var9 ^ -594709520);
            case 170 -> ll(-1022504678, var9 ^ 401252274);
            case 171 -> ll(-1022504683, var9 ^ 697807985);
            case 172 -> ll(-1022504684, var9 ^ 353218546);
            case 173 -> ll(-1022504681, var9 ^ -399453549);
            case 174 -> ll(-1022504682, var9 ^ 1369947005);
            case 175 -> ll(-1022504687, var9 ^ 2093415993);
            case 176 -> ll(-1022504688, var9 ^ -708309767);
            case 177 -> ll(-1022504685, var9 ^ -1465187911);
            case 178 -> ll(-1022504686, var9 ^ -652287815);
            case 179 -> ll(-1022504595, var9 ^ -170134111);
            case 180 -> ll(-1022504596, var9 ^ -261845072);
            case 181 -> ll(-1022504593, var9 ^ -1553262163);
            case 182 -> ll(-1022504594, var9 ^ 1761257933);
            case 183 -> ll(-1022504599, var9 ^ 1578800584);
            case 184 -> ll(-1022504600, var9 ^ 469143902);
            case 185 -> ll(-1022504597, var9 ^ 827199866);
            case 186 -> ll(-1022504598, var9 ^ 794582646);
            case 187 -> ll(-1022504603, var9 ^ -1738653530);
            case 188 -> ll(-1022504604, var9 ^ 1357123355);
            case 189 -> ll(-1022504601, var9 ^ -1405842089);
            case 190 -> ll(-1022504602, var9 ^ -1009769223);
            case 191 -> ll(-1022504607, var9 ^ 1617347876);
            case 192 -> ll(-1022504608, var9 ^ -2126206958);
            case 193 -> ll(-1022504605, var9 ^ -1444808774);
            case 194 -> ll(-1022504606, var9 ^ 1041517667);
            case 195 -> ll(-1022504579, var9 ^ -1596940788);
            case 196 -> ll(-1022504580, var9 ^ -523134459);
            case 197 -> ll(-1022504577, var9 ^ -165290499);
            case 198 -> ll(-1022504578, var9 ^ -1539789976);
            case 199 -> ll(-1022504583, var9 ^ -1443206551);
            case 200 -> ll(-1022504584, var9 ^ -96414057);
            case 201 -> ll(-1022504581, var9 ^ 327295574);
            case 202 -> ll(-1022504582, var9 ^ -1435397762);
            case 203 -> ll(-1022504587, var9 ^ 1184692869);
            case 204 -> ll(-1022504588, var9 ^ 531845085);
            case 205 -> ll(-1022504585, var9 ^ -935190141);
            case 206 -> ll(-1022504586, var9 ^ -660614948);
            case 207 -> ll(-1022504591, var9 ^ 1260665064);
            case 208 -> ll(-1022504592, var9 ^ 1352824170);
            case 209 -> ll(-1022504589, var9 ^ -207880724);
            case 210 -> ll(-1022504590, var9 ^ 7840907);
            case 211 -> ll(-1022504627, var9 ^ 1773742822);
            case 212 -> ll(-1022504628, var9 ^ -978024120);
            case 213 -> ll(-1022504625, var9 ^ 360532398);
            case 214 -> ll(-1022504626, var9 ^ -612356524);
            case 215 -> ll(-1022504631, var9 ^ -940117984);
            case 216 -> ll(-1022504632, var9 ^ 1754787101);
            case 217 -> ll(-1022504629, var9 ^ 55425799);
            case 218 -> ll(-1022504630, var9 ^ 502794452);
            case 219 -> ll(-1022504635, var9 ^ -907290498);
            case 220 -> ll(-1022504636, var9 ^ -1685661507);
            case 221 -> ll(-1022504633, var9 ^ -731438996);
            case 222 -> ll(-1022504634, var9 ^ 1016706468);
            case 223 -> ll(-1022504639, var9 ^ -1129809235);
            case 224 -> ll(-1022504640, var9 ^ 606434965);
            case 225 -> ll(-1022504637, var9 ^ -1533321807);
            case 226 -> ll(-1022504638, var9 ^ 1631585598);
            case 227 -> ll(-1022504611, var9 ^ 2079899410);
            case 228 -> ll(-1022504612, var9 ^ -186017284);
            case 229 -> ll(-1022504609, var9 ^ 1167929468);
            case 230 -> ll(-1022504610, var9 ^ 1392313654);
            case 231 -> ll(-1022504615, var9 ^ 1553590949);
            case 232 -> ll(-1022504616, var9 ^ 733102647);
            case 233 -> ll(-1022504613, var9 ^ -1442102361);
            case 234 -> ll(-1022504614, var9 ^ 1774369435);
            case 235 -> ll(-1022504619, var9 ^ -722512238);
            case 236 -> ll(-1022504620, var9 ^ 835011233);
            case 237 -> ll(-1022504617, var9 ^ 1815083127);
            case 238 -> ll(-1022504618, var9 ^ -105432993);
            case 239 -> ll(-1022504623, var9 ^ 1152738563);
            case 240 -> ll(-1022504624, var9 ^ 1555122366);
            case 241 -> ll(-1022504621, var9 ^ -662841831);
            case 242 -> ll(-1022504622, var9 ^ -1505573739);
            case 243 -> ll(-1022504787, var9 ^ -1546842146);
            case 244 -> ll(-1022504788, var9 ^ -913647352);
            case 245 -> ll(-1022504785, var9 ^ -587030048);
            case 246 -> ll(-1022504786, var9 ^ 895760810);
            case 247 -> ll(-1022504791, var9 ^ -270448877);
            case 248 -> ll(-1022504792, var9 ^ 850851162);
            case 249 -> ll(-1022504789, var9 ^ -1432266732);
            case 250 -> ll(-1022504790, var9 ^ 850735813);
            case 251 -> ll(-1022504795, var9 ^ -875002500);
            case 252 -> ll(-1022504796, var9 ^ -755777412);
            case 253 -> ll(-1022504793, var9 ^ -418180799);
            case 254 -> ll(-1022504794, var9 ^ -1090750511);
            default -> ll(-1022504799, var9 ^ 120861833);
         };
         int var5 = (var1 & ll(-1022504800, var9 ^ 686487807)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(-1022504797, var9 ^ -830065105)) >>> ll(-1022504798, var9 ^ 1352585338)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(-1022504771, var9 ^ 1365438315);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(-1022504772, var9 ^ -217249732);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }
}
