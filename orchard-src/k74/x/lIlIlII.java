package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1291;
import net.minecraft.class_1294;
import net.minecraft.class_6880;

@Environment(EnvType.CLIENT)
public final class lIlIlII extends IlIIIIIIl {
   private static String[] I;
   private static final Object[] III;
   private static final int[] lI;
   private static final String[] II;
   private static final String[] ll;
   private static final String[] Il;

   public lIlIlII() {
      super(IlIIllIII.Ill(I[1]), lllIIlIl.IIl, IlIIllIII.Ill(I[0]));
   }

   private static void I() {
      int var0 = -1160256470;
      I[0] = II(Il(lI(-1018803606, var0 ^ -829457310), lI(-1018803605, var0 ^ -488430722)).toCharArray(), 58114L, lI(-1018803608, var0 ^ 1691382396));
      I[1] = II(Il(lI(-1018803607, var0 ^ 1622981468), lI(-1018803602, var0 ^ -559711234)).toCharArray(), 85844L, lI(-1018803601, var0 ^ 895659507));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -2123765749;
      String[] var10000 = new String[1];
      short var12 = 23494;
      String[] var9 = var10000;
      int var8 = "U\ue4ed镛擋┩稝䕺믉ꬓ\uee2b皬\u0ffc᭬댟턣柫烃䄸\u0c45괌쎿쩇㶥毺橾軯붻祟鼞㔪\udeeb溺褤ݮ돿跢揃ኙ蔼붺ṏ쁽ା༇䕉跒ᝌ蛡킜鴡霌\u0e5c킶ꣅ몿鉇灅⽨턺뷞齨栐㲮⠓連Қ㗚\ue641\uf31dᔆ῝㳭䨟￦꾚Ⱇꐀ룵痳⣸㺋碈ቷ蔎涇姨".length();
      String var7 = "U\ue4ed镛擋┩稝䕺믉ꬓ\uee2b皬\u0ffc᭬댟턣柫烃䄸\u0c45괌쎿쩇㶥毺橾軯붻祟鼞㔪\udeeb溺褤ݮ돿跢揃ኙ蔼붺ṏ쁽ା༇䕉跒ᝌ蛡킜鴡霌\u0e5c킶ꣅ몿鉇灅⽨턺뷞齨栐㲮⠓連Қ㗚\ue641\uf31dᔆ῝㳭䨟￦꾚Ⱇꐀ룵痳⣸㺋碈ቷ蔎涇姨";
      int var11 = 0;
      int var10 = 0;

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 246;
               case 1 -> 15;
               case 2 -> 63;
               case 3 -> 102;
               case 4 -> 19;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      byte var21 = 0;
      int var23 = 0;
      lI = new int[276];
      byte[] var30 = "\u0092:JÉA¨¹\u0002+\u009cº¦<\t\u008d÷\u0082\u0017f¤N¥Ufñæg\u0096 Â¸úÌ$Áåã\u0004D\u0086T.E¹\u0005ß\u0097Ìh(g¼¥D\u00981\u0092*\u0090l³9ÊRNÂÉºö½G\u0097\rÇ\u001c\thu5Ón#]l\u0083\u008f\u001fn4'z\u001a*F;Ùã¨®\u009cúì²\u000f\u001f¨Õ¬ÝáX;}ÛÙ8\u0016Ý|\u001b\u009b?ñ¬aÝåpý+ï\u0082ªõá\u0097¼\u0010Þn¥ô\u0012¨ä´\u0007ëøË\u0011/1[íÎ+Q\u0003jØV\u0090 \u000fÜ\u0092·¡±¢|\u0090Ý(gy\u0000Xr\u0011 0s°ÈÂ=;?oê\u0089\u0000\u0099/å\u0010«õI\u008cN?H\u008fáI®Þ$CCðW\u008d¯Ë\u0086èÊw½Ù²rø/çA®\u008fª\u001e¬&èSF\u0013.ì2¶å\u0091.:ÂØö·\f\u0007L?¢ÿ\u0014\rÓ·Hæ¦¸I³`z\u001b^ôÜ'\u0012¶¾\u0002\u0084Ù\u008c\u0095n\u0087ÞVL%Ç\u008c¡\u00adÅËvY\u000bÑ-,¼\u008a \u001bÛF÷!S¿´\u0098\u0083°bWÇ&À\roé0j\u0005úT\u0017\u0017\u0086\u00918\u0088ö\u008d\u0096Ò9\n2$\u0014ÛÙ\u008b\u008a\u001dñ\u000fU¢3øîóY6ò0{\u0083\u009bKÕa\u0096\tFZ0Lü#6gv\u009eÿý\fë$\u008a#hÆ/\u0006\u0080\u009fÔ\u0019k/~·\u0006Ôµ>\u00897\u001e8&ïtÄ¦¯«ÞO\u0019í7\u001e\u009aL\u0001\t\\¼¦ÿÿ¼6Á;ÅÎ \u008eR'æõªÆ\u0096ëï\u0091Ê¨Nò\u009e»VÎ\u001c#Á)h}÷v\u001eä\u008etîs\u0012\r\u0001\u0012)3¯\u0088u\n2T\u0089¤\u00129¥k\u001f¸/«\u009f<\u0083À\u0082£\u0085\u0089f4\u008dC©¾&^×¥§QnJÃf2\u008b%ß\u0002mê\nûeP\u009d±\u001aúûE û§ ¦ûÉÔÚKd0\u000f÷\u009c\u001aj`\u0084½o\u0095\u0013\u0017ª)\u0003ª\u0017Ë-DOW\u009d{µöü¢.&\u000bÍ±\u001bô¥ký¥n9\u0016\u000b¸\u0095Ì.\u0007SU \u0006¾I\u0018:Çm\u0019h§\u0083¦%dæýDäñ×Àþ1/Â\u007f¹\u0096¶\u008f¢´òu6$\u009aÝùié\u0012¤\u0017\u001c\u0085ÖÛt`rTá\u0096\r\u007f¸Ê\u0083+\u0003¤\u007fþp»I}\tÙA\u0090ä©|b±±ÜÞ\u0010Íî:7í\u001dE Æ§½A]\u009as3aÿ÷ªµq!\u0014s)\u0004£ìTÈ%N3|\u009e\u0006Ö?N¿I_\u008a¾\u0088:¢5¡®÷K\u0086PÿSß6\u0081\u0094Í\u0006']\u0011Ü¶*Ü>NwJ*îm_\u0081.+\u0018\u0092Z¾\\^]\u0083©\rmB\u009dv«iÆÿ¥f\u0013\u008f¸ÿ\u009b\u0090ç×É\u001b\u0097\u0004\u009d²\u000fõO\u0091Hÿ\u009am\u009eÑ&\u000b¨\u0089ñ=\u001d\u0098Ò9ÃnTn½)Í\u0085\u0094èù-0·Ó¢##{\u0013\u009a§äÂ!o\fFÐ\u0097T}\nµ+Ò£\u0093/zò²\u0091íÑ[\u001f57lï\u0098>\u0094M=g\u0086\u0091WlÔsð\u000f\u0090E\u0001÷{Ò\tµ5ÒÅ\u0007\u0083£âÀõöß®ô`\u0094\u0097¯³*\u008dÔIpÄ\u0005\u008a,Ñ\u009aöÿ*ÄµcuC\u001bÊè;¦\n\u0018\u0080\u0083f\u008bæ¥Ù\u0088TªNíIÆ!i¶2W\u007f\u0090ý(]\u001cs?·úA8\u0017RÃiM\u008dU\"\u0010\u0010Yé\u0000«í\u00adFOh\u0015ríCïð\u0094\u000b´qË\"0Tü.·=æ_\u0001FÜ,!ê8\u0092sê]sø\u0004Yý\u00830Æ(\u001e\u0005S\u0010sK;(\u0006óó\u0013³\u009a\b\u0087\u0094ñu<DØëÍn\u007fwýDÚe(W!ÎÚh´&ÈFúHÑ\u0000àó¼ÙP\u0003µØ!ëÉ²O\u0004ØÇ¤¨`î~\bòAC\u0018\u0018+\u000b\u0082m\u008aÏßå\n\u0001\u0094\u000eFM·\u008f"
         .getBytes("ISO-8859-1");

      int var46;
      do {
         lI[var21] = ((var30[var23] & 255) << 24 | (var30[var23 + 1] & 255) << 16 | (var30[var23 + 2] & 255) << 8 | var30[var23 + 3] & 255) ^ 623216082;
         var21 += 1;
         var46 = var23 + 4;
         var23 += 4;
      } while (var46 < var30.length);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = ll('붘', 32917, var17 ^ 277864996)).length();
      int var1 = lI(-1018803614, var17 ^ -1422975611);
      int var0 = -1;

      while (true) {
         label85: {
            int var22 = lI(-1018803613, var17 ^ -2079352342);
            char[] var47 = var2.substring(++var0, var0 + var1).toCharArray();
            int var57 = var47.length;
            int var6 = 0;
            var46 = var22;
            var36 = var47;
            var23 = var57;
            char[] var66;
            int var73;
            if (var57 <= 1) {
               var66 = var47;
               var57 = var22;
               var73 = var6;
            } else {
               var46 = var22;
               var23 = var57;
               if (var57 <= var6) {
                  break label85;
               }

               var66 = var47;
               var57 = var22;
               var73 = var6;
            }

            while (true) {
               var66[var73] = (char)(var66[var73] ^ var57 ^ switch (var6 % lI(-1018803616, var17 ^ 858102054)) {
                  case 0 -> lI(-1018803615, var17 ^ 1658080076);
                  case 1 -> lI(-1018803610, var17 ^ 253999935);
                  case 2 -> lI(-1018803609, var17 ^ -1034992451);
                  case 3 -> lI(-1018803612, var17 ^ -182367168);
                  case 4 -> lI(-1018803611, var17 ^ -734914833);
                  case 5 -> lI(-1018803590, var17 ^ 701044017);
                  default -> lI(-1018803589, var17 ^ -1850303665);
               });
               var6++;
               if (var46 == 0) {
                  var73 = var46;
                  var66 = var36;
                  var57 = var46;
               } else {
                  if (var23 <= var6) {
                     break;
                  }

                  var66 = var36;
                  var57 = var46;
                  var73 = var6;
               }
            }
         }

         String var50 = new String(var36).intern();
         byte var29 = -1;
         var5[var3++] = var50;
         if ((var0 += var1) >= var4) {
            II = var5;
            Il = new String[2];
            I = new String[2];
            I();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static String ll(char var0, int var1, int var2) {
      int var3 = var0 ^ '붘';
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])III[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         III[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 720;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 'ꗈ';
         var10 += 2279;
         var10 += 46876;
         var10 ^= 38374;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public boolean l(class_6880<class_1291> var1) {
      return this.IIIIlIl() && (class_1294.field_5919.equals(var1) || class_1294.field_38092.equals(var1) || class_1294.field_5916.equals(var1));
   }

   private static int lI(int var0, int var1) {
      int var2 = lI[var0 ^ -1018803606] ^ var1 ^ var0;
      var2 ^= 5940;
      var2 ^= 2347;
      var2 ^= 36896;
      var2 -= 6632;
      var2 ^= 60475;
      var2 ^= 15776;
      var2 -= 59727;
      var2 ^= 60646;
      return var2 ^ 19898;
   }

   private static String II(char[] var0, long var1, int var3) {
      int var4 = lI(-1018803604, 891197096 ^ 1828099617) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lI(-1018803603, 891197096 ^ -205645181);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String Il(int var0, int var1) {
      int var9 = 1515193717;
      int var2 = (var0 ^ lI(-1018803592, var9 ^ -1309291537)) & lI(-1018803591, var9 ^ -733494941);
      if (Il[var2] == null) {
         char[] var3 = II[var2].toCharArray();

         int var4 = switch (var3[0] & lI(-1018803586, var9 ^ -770609957)) {
            case 0 -> lI(-1018803585, var9 ^ 1069362969);
            case 1 -> lI(-1018803588, var9 ^ -2011870210);
            case 2 -> lI(-1018803587, var9 ^ -1770779717);
            case 3 -> lI(-1018803598, var9 ^ 1603968953);
            case 4 -> lI(-1018803597, var9 ^ 1188987550);
            case 5 -> lI(-1018803600, var9 ^ -1550130032);
            case 6 -> lI(-1018803599, var9 ^ 1641245143);
            case 7 -> lI(-1018803594, var9 ^ -1041635104);
            case 8 -> lI(-1018803593, var9 ^ -1427157985);
            case 9 -> lI(-1018803596, var9 ^ 655212990);
            case 10 -> lI(-1018803595, var9 ^ -571485141);
            case 11 -> lI(-1018803638, var9 ^ 1092214429);
            case 12 -> lI(-1018803637, var9 ^ 382193742);
            case 13 -> lI(-1018803640, var9 ^ 2289364);
            case 14 -> lI(-1018803639, var9 ^ 432415237);
            case 15 -> lI(-1018803634, var9 ^ 1485190664);
            case 16 -> lI(-1018803633, var9 ^ 1157177506);
            case 17 -> lI(-1018803636, var9 ^ -1922441745);
            case 18 -> lI(-1018803635, var9 ^ -1755106721);
            case 19 -> lI(-1018803646, var9 ^ 1684316578);
            case 20 -> lI(-1018803645, var9 ^ -1276206265);
            case 21 -> lI(-1018803648, var9 ^ 495161909);
            case 22 -> lI(-1018803647, var9 ^ 753867260);
            case 23 -> lI(-1018803642, var9 ^ -986552258);
            case 24 -> lI(-1018803641, var9 ^ -1382940580);
            case 25 -> lI(-1018803644, var9 ^ 217772573);
            case 26 -> lI(-1018803643, var9 ^ -2029166603);
            case 27 -> lI(-1018803622, var9 ^ 892512477);
            case 28 -> lI(-1018803621, var9 ^ 1495440321);
            case 29 -> lI(-1018803624, var9 ^ -172065130);
            case 30 -> lI(-1018803623, var9 ^ -188886900);
            case 31 -> lI(-1018803618, var9 ^ 317461809);
            case 32 -> lI(-1018803617, var9 ^ -4037119);
            case 33 -> lI(-1018803620, var9 ^ 335132476);
            case 34 -> lI(-1018803619, var9 ^ 1984269712);
            case 35 -> lI(-1018803630, var9 ^ 239126665);
            case 36 -> lI(-1018803629, var9 ^ 1534304005);
            case 37 -> lI(-1018803632, var9 ^ 372022610);
            case 38 -> lI(-1018803631, var9 ^ 1415673743);
            case 39 -> lI(-1018803626, var9 ^ -1830943833);
            case 40 -> lI(-1018803625, var9 ^ 1503862282);
            case 41 -> lI(-1018803628, var9 ^ 2129315694);
            case 42 -> lI(-1018803627, var9 ^ -1338672020);
            case 43 -> lI(-1018803670, var9 ^ 516760949);
            case 44 -> lI(-1018803669, var9 ^ 1871018132);
            case 45 -> lI(-1018803672, var9 ^ 445282679);
            case 46 -> lI(-1018803671, var9 ^ -599250206);
            case 47 -> lI(-1018803666, var9 ^ 1223562869);
            case 48 -> lI(-1018803665, var9 ^ 176960257);
            case 49 -> lI(-1018803668, var9 ^ 1706993079);
            case 50 -> lI(-1018803667, var9 ^ 1005348797);
            case 51 -> lI(-1018803678, var9 ^ -1711948492);
            case 52 -> lI(-1018803677, var9 ^ 301464437);
            case 53 -> lI(-1018803680, var9 ^ -449191783);
            case 54 -> lI(-1018803679, var9 ^ -1869694309);
            case 55 -> lI(-1018803674, var9 ^ -1477871768);
            case 56 -> lI(-1018803673, var9 ^ -1654550934);
            case 57 -> lI(-1018803676, var9 ^ 615612460);
            case 58 -> lI(-1018803675, var9 ^ -336259277);
            case 59 -> lI(-1018803654, var9 ^ -1319249852);
            case 60 -> lI(-1018803653, var9 ^ -700986606);
            case 61 -> lI(-1018803656, var9 ^ -1423591690);
            case 62 -> lI(-1018803655, var9 ^ -2068134043);
            case 63 -> lI(-1018803650, var9 ^ 719325454);
            case 64 -> lI(-1018803649, var9 ^ -1911151399);
            case 65 -> lI(-1018803652, var9 ^ 1706670965);
            case 66 -> lI(-1018803651, var9 ^ 1295869315);
            case 67 -> lI(-1018803662, var9 ^ -1882529939);
            case 68 -> lI(-1018803661, var9 ^ -452672614);
            case 69 -> lI(-1018803664, var9 ^ -944657703);
            case 70 -> 3;
            case 71 -> lI(-1018803663, var9 ^ 1767089760);
            case 72 -> lI(-1018803658, var9 ^ -93847513);
            case 73 -> lI(-1018803657, var9 ^ 1074857824);
            case 74 -> lI(-1018803660, var9 ^ -894644666);
            case 75 -> lI(-1018803659, var9 ^ -1327950450);
            case 76 -> lI(-1018803702, var9 ^ -1621428732);
            case 77 -> lI(-1018803701, var9 ^ -1162694859);
            case 78 -> lI(-1018803704, var9 ^ -1520886205);
            case 79 -> lI(-1018803703, var9 ^ 188016119);
            case 80 -> lI(-1018803698, var9 ^ -2101672283);
            case 81 -> 2;
            case 82 -> lI(-1018803697, var9 ^ -2079006866);
            case 83 -> lI(-1018803700, var9 ^ 2023005698);
            case 84 -> lI(-1018803699, var9 ^ 1652369472);
            case 85 -> lI(-1018803710, var9 ^ -1960007131);
            case 86 -> lI(-1018803709, var9 ^ -1120178690);
            case 87 -> lI(-1018803712, var9 ^ 449695692);
            case 88 -> lI(-1018803711, var9 ^ -1963783174);
            case 89 -> lI(-1018803706, var9 ^ 1913831408);
            case 90 -> lI(-1018803705, var9 ^ -1680554928);
            case 91 -> lI(-1018803708, var9 ^ 2057624462);
            case 92 -> lI(-1018803707, var9 ^ 771266722);
            case 93 -> lI(-1018803686, var9 ^ 1319930566);
            case 94 -> lI(-1018803685, var9 ^ 1915622011);
            case 95 -> lI(-1018803688, var9 ^ -1789244018);
            case 96 -> lI(-1018803687, var9 ^ -903031673);
            case 97 -> lI(-1018803682, var9 ^ -925088769);
            case 98 -> lI(-1018803681, var9 ^ -1322048519);
            case 99 -> lI(-1018803684, var9 ^ -1885488677);
            case 100 -> lI(-1018803683, var9 ^ -1241488102);
            case 101 -> lI(-1018803694, var9 ^ 404752417);
            case 102 -> lI(-1018803693, var9 ^ -684881548);
            case 103 -> lI(-1018803696, var9 ^ 397217037);
            case 104 -> 1;
            case 105 -> lI(-1018803695, var9 ^ 2091946695);
            case 106 -> lI(-1018803690, var9 ^ 894698831);
            case 107 -> lI(-1018803689, var9 ^ -6582456);
            case 108 -> lI(-1018803692, var9 ^ -488270741);
            case 109 -> lI(-1018803691, var9 ^ -312706322);
            case 110 -> lI(-1018803478, var9 ^ -637486149);
            case 111 -> lI(-1018803477, var9 ^ 1664113982);
            case 112 -> lI(-1018803480, var9 ^ -1228319334);
            case 113 -> lI(-1018803479, var9 ^ 562244569);
            case 114 -> lI(-1018803474, var9 ^ 1198985623);
            case 115 -> lI(-1018803473, var9 ^ 462591956);
            case 116 -> lI(-1018803476, var9 ^ 1978067859);
            case 117 -> lI(-1018803475, var9 ^ -670941601);
            case 118 -> lI(-1018803486, var9 ^ 539515693);
            case 119 -> lI(-1018803485, var9 ^ 948920014);
            case 120 -> lI(-1018803488, var9 ^ -1356489841);
            case 121 -> lI(-1018803487, var9 ^ -1080547703);
            case 122 -> lI(-1018803482, var9 ^ -1854505230);
            case 123 -> lI(-1018803481, var9 ^ 558466551);
            case 124 -> lI(-1018803484, var9 ^ 1083187184);
            case 125 -> lI(-1018803483, var9 ^ -1207991908);
            case 126 -> lI(-1018803462, var9 ^ 1217878678);
            case 127 -> lI(-1018803461, var9 ^ 425462218);
            case 128 -> lI(-1018803464, var9 ^ -1215650545);
            case 129 -> lI(-1018803463, var9 ^ -1841995224);
            case 130 -> 4;
            case 131 -> lI(-1018803458, var9 ^ -1674276996);
            case 132 -> lI(-1018803457, var9 ^ -1542916121);
            case 133 -> lI(-1018803460, var9 ^ -1520789655);
            case 134 -> lI(-1018803459, var9 ^ 437736907);
            case 135 -> lI(-1018803470, var9 ^ 1098307008);
            case 136 -> lI(-1018803469, var9 ^ 1811074791);
            case 137 -> lI(-1018803472, var9 ^ -1812967923);
            case 138 -> lI(-1018803471, var9 ^ 713342813);
            case 139 -> lI(-1018803466, var9 ^ 146818160);
            case 140 -> lI(-1018803465, var9 ^ -1733759799);
            case 141 -> lI(-1018803468, var9 ^ -707059017);
            case 142 -> lI(-1018803467, var9 ^ -1423002335);
            case 143 -> lI(-1018803510, var9 ^ 1732661629);
            case 144 -> lI(-1018803509, var9 ^ -388782377);
            case 145 -> lI(-1018803512, var9 ^ -1014301707);
            case 146 -> lI(-1018803511, var9 ^ -1758358143);
            case 147 -> lI(-1018803506, var9 ^ 1111657132);
            case 148 -> lI(-1018803505, var9 ^ -1053038158);
            case 149 -> lI(-1018803508, var9 ^ 752261350);
            case 150 -> lI(-1018803507, var9 ^ -561807027);
            case 151 -> lI(-1018803518, var9 ^ 1646460279);
            case 152 -> lI(-1018803517, var9 ^ -2046436190);
            case 153 -> lI(-1018803520, var9 ^ -116197607);
            case 154 -> lI(-1018803519, var9 ^ 24341854);
            case 155 -> lI(-1018803514, var9 ^ -821997371);
            case 156 -> lI(-1018803513, var9 ^ 1268286481);
            case 157 -> lI(-1018803516, var9 ^ -1658436708);
            case 158 -> lI(-1018803515, var9 ^ -1198400066);
            case 159 -> lI(-1018803494, var9 ^ 1947696962);
            case 160 -> lI(-1018803493, var9 ^ -1062455348);
            case 161 -> lI(-1018803496, var9 ^ -2088989078);
            case 162 -> lI(-1018803495, var9 ^ -474443890);
            case 163 -> lI(-1018803490, var9 ^ -2037382094);
            case 164 -> lI(-1018803489, var9 ^ 314931951);
            case 165 -> lI(-1018803492, var9 ^ -322084304);
            case 166 -> lI(-1018803491, var9 ^ -1967938531);
            case 167 -> lI(-1018803502, var9 ^ -1173001199);
            case 168 -> lI(-1018803501, var9 ^ 1619270168);
            case 169 -> lI(-1018803504, var9 ^ -2105784653);
            case 170 -> lI(-1018803503, var9 ^ -1763942930);
            case 171 -> lI(-1018803498, var9 ^ 1025252297);
            case 172 -> lI(-1018803497, var9 ^ 778604454);
            case 173 -> lI(-1018803500, var9 ^ -495996186);
            case 174 -> lI(-1018803499, var9 ^ -1319144680);
            case 175 -> lI(-1018803542, var9 ^ -895919763);
            case 176 -> lI(-1018803541, var9 ^ 1133991824);
            case 177 -> lI(-1018803544, var9 ^ 864734857);
            case 178 -> lI(-1018803543, var9 ^ 752215599);
            case 179 -> lI(-1018803538, var9 ^ -1482345081);
            case 180 -> lI(-1018803537, var9 ^ 238929155);
            case 181 -> lI(-1018803540, var9 ^ 763023020);
            case 182 -> lI(-1018803539, var9 ^ -777199562);
            case 183 -> lI(-1018803550, var9 ^ -1214596894);
            case 184 -> lI(-1018803549, var9 ^ -2127583208);
            case 185 -> lI(-1018803552, var9 ^ -2047779039);
            case 186 -> lI(-1018803551, var9 ^ -762374121);
            case 187 -> lI(-1018803546, var9 ^ 967235625);
            case 188 -> lI(-1018803545, var9 ^ -1862105462);
            case 189 -> 0;
            case 190 -> 5;
            case 191 -> lI(-1018803548, var9 ^ 504435504);
            case 192 -> lI(-1018803547, var9 ^ -1347905710);
            case 193 -> lI(-1018803526, var9 ^ 2115198540);
            case 194 -> lI(-1018803525, var9 ^ -85809401);
            case 195 -> lI(-1018803528, var9 ^ -1053260430);
            case 196 -> lI(-1018803527, var9 ^ 1855038151);
            case 197 -> lI(-1018803522, var9 ^ -960462140);
            case 198 -> lI(-1018803521, var9 ^ 1373858647);
            case 199 -> lI(-1018803524, var9 ^ -1996137384);
            case 200 -> lI(-1018803523, var9 ^ 604808444);
            case 201 -> lI(-1018803534, var9 ^ -2125088886);
            case 202 -> lI(-1018803533, var9 ^ -346102398);
            case 203 -> lI(-1018803536, var9 ^ 1279107385);
            case 204 -> lI(-1018803535, var9 ^ -1111143863);
            case 205 -> lI(-1018803530, var9 ^ -1249442423);
            case 206 -> lI(-1018803529, var9 ^ 2033562383);
            case 207 -> lI(-1018803532, var9 ^ 1592968348);
            case 208 -> lI(-1018803531, var9 ^ 1671218459);
            case 209 -> lI(-1018803574, var9 ^ 681942842);
            case 210 -> lI(-1018803573, var9 ^ -1765808707);
            case 211 -> lI(-1018803576, var9 ^ -856279795);
            case 212 -> lI(-1018803575, var9 ^ -1864127512);
            case 213 -> lI(-1018803570, var9 ^ 1125709013);
            case 214 -> lI(-1018803569, var9 ^ -548965780);
            case 215 -> lI(-1018803572, var9 ^ 1994001045);
            case 216 -> lI(-1018803571, var9 ^ -1238715992);
            case 217 -> lI(-1018803582, var9 ^ -625354769);
            case 218 -> lI(-1018803581, var9 ^ 1706714186);
            case 219 -> lI(-1018803584, var9 ^ -220235716);
            case 220 -> lI(-1018803583, var9 ^ -1654946081);
            case 221 -> lI(-1018803578, var9 ^ -347234206);
            case 222 -> lI(-1018803577, var9 ^ -1804653271);
            case 223 -> lI(-1018803580, var9 ^ -2088383822);
            case 224 -> lI(-1018803579, var9 ^ -2077924682);
            case 225 -> lI(-1018803558, var9 ^ -713048785);
            case 226 -> lI(-1018803557, var9 ^ -1641930423);
            case 227 -> lI(-1018803560, var9 ^ 1429379761);
            case 228 -> lI(-1018803559, var9 ^ 292847201);
            case 229 -> lI(-1018803554, var9 ^ -1455367087);
            case 230 -> lI(-1018803553, var9 ^ 1405265219);
            case 231 -> lI(-1018803556, var9 ^ 138673082);
            case 232 -> lI(-1018803555, var9 ^ -1939419800);
            case 233 -> lI(-1018803566, var9 ^ 185587707);
            case 234 -> lI(-1018803565, var9 ^ -1116410719);
            case 235 -> lI(-1018803568, var9 ^ -1646786232);
            case 236 -> lI(-1018803567, var9 ^ -807899897);
            case 237 -> lI(-1018803562, var9 ^ 1144416404);
            case 238 -> lI(-1018803561, var9 ^ 1057158823);
            case 239 -> lI(-1018803564, var9 ^ -1573428723);
            case 240 -> lI(-1018803563, var9 ^ -814150737);
            case 241 -> lI(-1018803350, var9 ^ -1161706985);
            case 242 -> lI(-1018803349, var9 ^ 262683087);
            case 243 -> lI(-1018803352, var9 ^ 683885677);
            case 244 -> lI(-1018803351, var9 ^ -118826282);
            case 245 -> lI(-1018803346, var9 ^ -766687597);
            case 246 -> lI(-1018803345, var9 ^ -118991400);
            case 247 -> lI(-1018803348, var9 ^ -351011273);
            case 248 -> lI(-1018803347, var9 ^ -729409949);
            case 249 -> lI(-1018803358, var9 ^ -87525368);
            case 250 -> lI(-1018803357, var9 ^ -1127038270);
            case 251 -> lI(-1018803360, var9 ^ 1700934283);
            case 252 -> lI(-1018803359, var9 ^ 1679022945);
            case 253 -> lI(-1018803354, var9 ^ 243086664);
            case 254 -> lI(-1018803353, var9 ^ 2073467028);
            default -> lI(-1018803356, var9 ^ 1380727216);
         };
         int var5 = (var1 & lI(-1018803355, var9 ^ -42915660)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lI(-1018803334, var9 ^ -1757841442)) >>> lI(-1018803333, var9 ^ 922611494)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lI(-1018803336, var9 ^ -1238129473);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lI(-1018803335, var9 ^ -92305601);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }
}
