package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lIIIIIIl {
   II,
   lI;

   private static final lIIIIIIl[] I;
   private static final Object[] IlI;
   private static final int[] III;
   private static final String[] l;
   private static final String[] Il;
   private static final String[] IIl;
   private static String[] ll;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = ll(-1437667619, 645815364 ^ -1405759804) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(-1437667620, 645815364 ^ -1203281527);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static void l() {
      int var0 = -891846885;
      ll[0] = I(lI(ll(-1437667617, var0 ^ -780151671), ll(-1437667618, var0 ^ 922135891)).toCharArray(), 12861L, ll(-1437667623, var0 ^ 1044865936));
      ll[1] = I(lI(ll(-1437667624, var0 ^ -1930690814), ll(-1437667621, var0 ^ 835761668)).toCharArray(), 91651L, ll(-1437667622, var0 ^ 973314776));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -1997305639;
      int var10001 = "#蜰\ude57둤ᑣ\uf742麚樤瘆梼\uded8Ꙑ챠❘ಱᐩ斿봹ҙ㗣\ue468叭\ueca4鸘\ue967쀣⢩緼ፉ㰳\ueb2e鿤䉻嬉♙\uf646".length();
      short var12 = 29681;
      int var11 = 0;
      int var10 = 0;
      String[] var9 = new String[1];
      int var8 = var10001;
      String var7 = "#蜰\ude57둤ᑣ\uf742麚樤瘆梼\uded8Ꙑ챠❘ಱᐩ斿봹ҙ㗣\ue468叭\ueca4鸘\ue967쀣⢩緼ፉ㰳\ueb2e鿤䉻嬉♙\uf646";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 182;
               case 1 -> 222;
               case 2 -> 246;
               case 3 -> 146;
               case 4 -> 112;
               case 5 -> 42;
            }) ^ var16;
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
      III = new int[276];
      int var20 = 0;
      int var22 = 0;
      byte[] var10002 = "\u001cë'Ê\u0084Ú[ø\u0001H\u0082öæÁÊX½\fóZ\\Ü©{áäZ\u008bù\u008e\u0098)¬ü\u0006ºkdyw ôóëîø²qHâK\u0000¹G>µîú\u0094~D\u000bË3Ã\\U6*¤Õ/³Æ\u008eS \u0016z`\u0006\u008ai¿é·$CP¡ë\u001b½¬\u007fÏ/\u0004ú#\u009c\u009b\u0084Í¬ÈªÙ\u0000/\u0000¨ésÔãM²«Ý·\u0012ßLKÀ*áä'\u0086\"'\\¨C\u0083¦~\u009c\u0006?\u000b½\u009a©Z\u0007øý\u000e\u0087\u0005\u008dE\u001d(îQå'\u0005;ói¡f¾k©¦\u0010-£\næÆÿ\t\u0006\u00ad3jq\u000f{\u0015Vaq°\tª{\"L\u0081ç¿ñ5¿\fPoÒ\u0083î46B\u0090¯?\u0001P5±¢¤Ø.8Táé\b\u001bÃ\u0002æu3º\u0095\u0013e7k\u0098á\u0003&`\u0006¹\u008aÂ\u0081\u001cÀ\u0019Ï»\u001a\u008a½;âBË¾\u0097\u0093\u0005\u0006\u0091Sx\u0014ÓZÛD?\u001b»\u009aÌýø`¤ï\u009dÅ\bÄ·çEZ\u0088êæÚ\u000bN\u0016ª®>¹\u009cý9\u0098Ì\u0017ã)&®\u0010\\ â<2\u0013Û§\u0003\u000bW%lDE\u0092p\u0085B/üjZ'Mc'\u008d\u0000t \u0013Ðç]\u0081?$Ü\u0082fio§K¥EJe,þËt¯mÍçWE\u0018ax\u008b\u0004QD¾\u0000\u008bç\u0095y;ÎNO3Q\u001aj¯úò\u00845[/\u0096Ë\u0082`²iÉ|@]\u001c\u0007\u0014\u009a\u0099ÙL\u0002Í\u0011°ÛÝL©\u000f=ØÍ;¸\u009f½\u0096ä8\u0007ûSã\u0018D\u0093í\u008fÒþªÜýy\u0087Ä\u008a\"§\u001a~°õ}ùúù\u00954Òì3BP~«|Ím\u0087\u0011G\u0086z/MÓ:£\"\u0019o\u008a/Ù¨´>iW#\u009cGÆºõÙ\u0012\u0019)ÇÑ-\u0085Ñí\u0084TØü¤k\u009eM±\u007fR\u0086á\u0018UO\u008fµLâæ°6dÏíc¬\u0097w Bµ\u0003ëü«å|:w§«n\u0001@K÷ü¾°¢þ9½ÓFÈ<ï\u0098\u0091ì\u009a\nCp[WÜ\u008f\u009b\u000f\u0007}a]5\"\u0099é,MMçi=@¤äV*¥%\\b\u0097YL´TG}ÂQt|\fx?è~Z\u0019ÜP\u0081¿ÛÒª÷¤s1\r2£\u0094\u009b^\u0098ÛÕ\u0015y\u0080ôà\u0083SïhîÆ¼¢¶c-\u0083j¨&cNuøóCÖ~f\u0007\u0085¢ú*¡W\u0095»¯Á§\u0007u\u008bÃ¬\u009a\u0007ÜLèq\u001cg<\u0099i|þ¢á\u0093à\u0016ô>dJù}\u001cÏxýiÎ*\u0000\u0011¾mC)\u009fÈ\u0096u÷xV\u0011ìß/QÃ*Æ'\u0015ÞÕ×Ø\u0007\u0088\u009d\u0000@4\u001cå¼Û\u009cóE\u00ad\u0098\u009c*©|\u0080\b\n-Â25 >*wdàrÇ`\u0098¾bùtá= \u0017þ§\u001c¯\u0006\u0081£\u001e\u000bÂb\r\u0013\u0015¤\u0014ò¹ýFY@¶b\"n°þç^/»C\u0080+±Ì\fm4m®\u0095.I¯\u0087Õ¿DñØ\u009eczÀàk.-\u0015_®)\u0087)\u009bW£aZ M\u001a2c\u0081f» ç\u000b¿Å\u0012:¨Ã\u0003\u008a\u0013v`s\u0004Å@\u0019\u0015àó¹\u0084Ë\bÅü£¿à`\u0088U\u008b\u0082Ë\u0084¾p1-\u0082~7Æ\u0098\"\u0093'pÌøs\u0084ð5yðâ$&_\ffyp¥\u0082\u0013ÊVà\\\u0010cèÞ\u001a\bð¯~ÞFK%ÃV+ö\u0083Ä\u0016Úö\u0088q\u00985()n\u0092=tù\u0080x\u0083áhGIlVÖöýÍqfB!)I^è\u001cÅ26Ýéæ\u0080\u009aÝ\u001a6ö\u0012/øE{-\u009eBb__tvbaµ\u0004\u0082\u00112¹\u0092\u009fBÕ11:J\u0083°\u0014\fh\u008b\u009fy\u008c\ráèÚÛÓ\u00ad|Ùº#¥~Hê*ø¬ q×EI\u0018\u000f\u008997Ä8\u001ae}L\u009f\u008f!O&.3\u0000¼I\u0089xS8\bÀ"
         .getBytes("ISO-8859-1");

      int var44;
      do {
         III[var20] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ 1330826161;
         var20 += 1;
         var44 = var22 + 4;
         var22 += 4;
      } while (var44 < var10002.length);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III(-1941886594, (char)'閚', -605828841, (byte)49, 27305)).length();
      int var1 = ll(-1437667627, var17 ^ 1055713449);
      int var0 = -1;

      while (true) {
         label87: {
            var20 = ll(-1437667628, var17 ^ -109799651);
            char[] var45 = var2.substring(++var0, var0 + var1).toCharArray();
            int var55 = var45.length;
            int var6 = 0;
            var44 = var20;
            var34 = var45;
            var22 = var55;
            char[] var64;
            int var71;
            if (var55 <= 1) {
               var64 = var45;
               var55 = var20;
               var71 = var6;
            } else {
               var44 = var20;
               var22 = var55;
               if (var55 <= var6) {
                  break label87;
               }

               var64 = var45;
               var55 = var20;
               var71 = var6;
            }

            while (true) {
               var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % ll(-1437667625, var17 ^ -1293672844)) {
                  case 0 -> ll(-1437667626, var17 ^ 2095602785);
                  case 1 -> ll(-1437667631, var17 ^ -621631856);
                  case 2 -> ll(-1437667632, var17 ^ 727175412);
                  case 3 -> ll(-1437667629, var17 ^ 2095741506);
                  case 4 -> ll(-1437667630, var17 ^ -702864058);
                  case 5 -> ll(-1437667635, var17 ^ 1363983194);
                  default -> ll(-1437667636, var17 ^ -1196148563);
               });
               var6++;
               if (var44 == 0) {
                  var71 = var44;
                  var64 = var34;
                  var55 = var44;
               } else {
                  if (var22 <= var6) {
                     break;
                  }

                  var64 = var34;
                  var55 = var44;
                  var71 = var6;
               }
            }
         }

         String var48 = new String(var34).intern();
         byte var28 = -1;
         var5[var3++] = var48;
         if ((var0 += var1) >= var4) {
            l = var5;
            Il = new String[2];
            ll = new String[2];
            l();
            lI = new lIIIIIIl();
            II = new lIIIIIIl();
            I = II();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static lIIIIIIl[] II() {
      return new lIIIIIIl[]{lI, II};
   }

   public static lIIIIIIl Il(String var0) {
      return Enum.valueOf(lIIIIIIl.class, var0);
   }

   private static String III(int var0, char var1, int var2, byte var3, short var4) {
      int var9 = var0 ^ -1941886594;
      char[] var8 = IIl[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])IlI[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         IlI[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 60020;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ 7046 ^ var7 ^ var2 ^ var0 ^ var6 ^ var4 ^ var1 ^ var3);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   private static int ll(int var0, int var1) {
      int var2 = III[var0 ^ -1437667619] ^ var1 ^ var0;
      var2 ^= 53857;
      var2 += 1451;
      var2 += 13899;
      var2 ^= 40900;
      var2 += 33974;
      var2 ^= 60418;
      var2 += 50789;
      var2 -= 2815;
      return var2 + 2550;
   }

   private static String lI(int var0, int var1) {
      int var9 = 822327122;
      int var2 = (var0 ^ ll(-1437667633, var9 ^ -1742401420)) & ll(-1437667634, var9 ^ 1946789909);
      if (Il[var2] == null) {
         char[] var3 = l[var2].toCharArray();

         int var4 = switch (var3[0] & ll(-1437667639, var9 ^ 761968845)) {
            case 0 -> ll(-1437667640, var9 ^ -1034423038);
            case 1 -> ll(-1437667637, var9 ^ 2067872394);
            case 2 -> ll(-1437667638, var9 ^ -1773359565);
            case 3 -> ll(-1437667643, var9 ^ 82062204);
            case 4 -> ll(-1437667644, var9 ^ -1216653642);
            case 5 -> ll(-1437667641, var9 ^ -2027390189);
            case 6 -> ll(-1437667642, var9 ^ 735039766);
            case 7 -> ll(-1437667647, var9 ^ -1030551903);
            case 8 -> ll(-1437667648, var9 ^ 1716681303);
            case 9 -> ll(-1437667645, var9 ^ -1661858054);
            case 10 -> ll(-1437667646, var9 ^ 1612774284);
            case 11 -> ll(-1437667587, var9 ^ -809019424);
            case 12 -> ll(-1437667588, var9 ^ 213678566);
            case 13 -> ll(-1437667585, var9 ^ -1471762448);
            case 14 -> ll(-1437667586, var9 ^ 769645268);
            case 15 -> ll(-1437667591, var9 ^ -1320580100);
            case 16 -> ll(-1437667592, var9 ^ -753016952);
            case 17 -> ll(-1437667589, var9 ^ 778934050);
            case 18 -> ll(-1437667590, var9 ^ 51281953);
            case 19 -> ll(-1437667595, var9 ^ 216394341);
            case 20 -> ll(-1437667596, var9 ^ 1111603154);
            case 21 -> ll(-1437667593, var9 ^ 1078556478);
            case 22 -> ll(-1437667594, var9 ^ 105110380);
            case 23 -> ll(-1437667599, var9 ^ -316680101);
            case 24 -> 3;
            case 25 -> ll(-1437667600, var9 ^ -2032944223);
            case 26 -> ll(-1437667597, var9 ^ 614188217);
            case 27 -> ll(-1437667598, var9 ^ 1251041752);
            case 28 -> ll(-1437667603, var9 ^ -2120485996);
            case 29 -> ll(-1437667604, var9 ^ -1442353451);
            case 30 -> ll(-1437667601, var9 ^ 509599173);
            case 31 -> ll(-1437667602, var9 ^ 1144148547);
            case 32 -> ll(-1437667607, var9 ^ 534156263);
            case 33 -> ll(-1437667608, var9 ^ -2065706828);
            case 34 -> ll(-1437667605, var9 ^ 508653809);
            case 35 -> ll(-1437667606, var9 ^ -204543583);
            case 36 -> ll(-1437667611, var9 ^ -905324250);
            case 37 -> ll(-1437667612, var9 ^ -387827828);
            case 38 -> ll(-1437667609, var9 ^ 408569061);
            case 39 -> ll(-1437667610, var9 ^ 1322760777);
            case 40 -> ll(-1437667615, var9 ^ -891029634);
            case 41 -> ll(-1437667616, var9 ^ 760830121);
            case 42 -> ll(-1437667613, var9 ^ -1426320961);
            case 43 -> ll(-1437667614, var9 ^ -463746257);
            case 44 -> ll(-1437667683, var9 ^ -1764019244);
            case 45 -> ll(-1437667684, var9 ^ -530692598);
            case 46 -> ll(-1437667681, var9 ^ 786841616);
            case 47 -> ll(-1437667682, var9 ^ 1408500261);
            case 48 -> ll(-1437667687, var9 ^ -257626514);
            case 49 -> ll(-1437667688, var9 ^ -1871045270);
            case 50 -> ll(-1437667685, var9 ^ -746555923);
            case 51 -> ll(-1437667686, var9 ^ -1239033398);
            case 52 -> ll(-1437667691, var9 ^ -1677224819);
            case 53 -> ll(-1437667692, var9 ^ -1559611409);
            case 54 -> ll(-1437667689, var9 ^ 548325270);
            case 55 -> ll(-1437667690, var9 ^ -2049021721);
            case 56 -> ll(-1437667695, var9 ^ -690402957);
            case 57 -> ll(-1437667696, var9 ^ 1006893060);
            case 58 -> ll(-1437667693, var9 ^ -2047832667);
            case 59 -> ll(-1437667694, var9 ^ -908270757);
            case 60 -> ll(-1437667699, var9 ^ -263728552);
            case 61 -> ll(-1437667700, var9 ^ 2093333822);
            case 62 -> ll(-1437667697, var9 ^ 1853006129);
            case 63 -> ll(-1437667698, var9 ^ 1775185296);
            case 64 -> ll(-1437667703, var9 ^ 1908907106);
            case 65 -> ll(-1437667704, var9 ^ 208523666);
            case 66 -> ll(-1437667701, var9 ^ 200474998);
            case 67 -> ll(-1437667702, var9 ^ 1986129483);
            case 68 -> ll(-1437667707, var9 ^ -144525363);
            case 69 -> ll(-1437667708, var9 ^ 1145543292);
            case 70 -> ll(-1437667705, var9 ^ 1856681761);
            case 71 -> ll(-1437667706, var9 ^ -718559572);
            case 72 -> ll(-1437667711, var9 ^ 1177368132);
            case 73 -> ll(-1437667712, var9 ^ 1861791904);
            case 74 -> ll(-1437667709, var9 ^ -1595637706);
            case 75 -> ll(-1437667710, var9 ^ -1780458995);
            case 76 -> ll(-1437667651, var9 ^ -1097209269);
            case 77 -> ll(-1437667652, var9 ^ 1706025568);
            case 78 -> ll(-1437667649, var9 ^ 831159682);
            case 79 -> ll(-1437667650, var9 ^ -647699300);
            case 80 -> ll(-1437667655, var9 ^ 74848960);
            case 81 -> ll(-1437667656, var9 ^ 1263712333);
            case 82 -> ll(-1437667653, var9 ^ 1470139600);
            case 83 -> ll(-1437667654, var9 ^ 754207736);
            case 84 -> ll(-1437667659, var9 ^ -223554647);
            case 85 -> ll(-1437667660, var9 ^ 978324098);
            case 86 -> ll(-1437667657, var9 ^ 1732894249);
            case 87 -> ll(-1437667658, var9 ^ -215094718);
            case 88 -> ll(-1437667663, var9 ^ -1268955192);
            case 89 -> ll(-1437667664, var9 ^ 333916916);
            case 90 -> ll(-1437667661, var9 ^ -923232978);
            case 91 -> ll(-1437667662, var9 ^ -965803185);
            case 92 -> 5;
            case 93 -> ll(-1437667667, var9 ^ -2126762870);
            case 94 -> ll(-1437667668, var9 ^ -1406903513);
            case 95 -> ll(-1437667665, var9 ^ -1929728247);
            case 96 -> ll(-1437667666, var9 ^ -560125881);
            case 97 -> ll(-1437667671, var9 ^ -764025160);
            case 98 -> ll(-1437667672, var9 ^ -942435357);
            case 99 -> ll(-1437667669, var9 ^ 1431022893);
            case 100 -> ll(-1437667670, var9 ^ 1181204574);
            case 101 -> ll(-1437667675, var9 ^ -1382351143);
            case 102 -> ll(-1437667676, var9 ^ -119901562);
            case 103 -> ll(-1437667673, var9 ^ 848255881);
            case 104 -> ll(-1437667674, var9 ^ -230136498);
            case 105 -> ll(-1437667679, var9 ^ 1119351314);
            case 106 -> ll(-1437667680, var9 ^ 1814457306);
            case 107 -> ll(-1437667677, var9 ^ -218969986);
            case 108 -> ll(-1437667678, var9 ^ -332268421);
            case 109 -> ll(-1437667747, var9 ^ -99789433);
            case 110 -> ll(-1437667748, var9 ^ -216238809);
            case 111 -> ll(-1437667745, var9 ^ -1246928742);
            case 112 -> ll(-1437667746, var9 ^ 2036740119);
            case 113 -> ll(-1437667751, var9 ^ 2125422303);
            case 114 -> ll(-1437667752, var9 ^ 1728198529);
            case 115 -> ll(-1437667749, var9 ^ 495197916);
            case 116 -> ll(-1437667750, var9 ^ 1212958188);
            case 117 -> ll(-1437667755, var9 ^ -1952291729);
            case 118 -> ll(-1437667756, var9 ^ -1071875343);
            case 119 -> ll(-1437667753, var9 ^ 1473947154);
            case 120 -> ll(-1437667754, var9 ^ -2138124072);
            case 121 -> ll(-1437667759, var9 ^ 1612131590);
            case 122 -> ll(-1437667760, var9 ^ -1690161243);
            case 123 -> ll(-1437667757, var9 ^ -1775003762);
            case 124 -> ll(-1437667758, var9 ^ 386877719);
            case 125 -> ll(-1437667763, var9 ^ -948249763);
            case 126 -> ll(-1437667764, var9 ^ 1539016250);
            case 127 -> ll(-1437667761, var9 ^ -1535385896);
            case 128 -> ll(-1437667762, var9 ^ 1451330560);
            case 129 -> ll(-1437667767, var9 ^ 158940131);
            case 130 -> ll(-1437667768, var9 ^ 1722627653);
            case 131 -> ll(-1437667765, var9 ^ 379614494);
            case 132 -> ll(-1437667766, var9 ^ 2110419993);
            case 133 -> ll(-1437667771, var9 ^ 2005026344);
            case 134 -> ll(-1437667772, var9 ^ 1733592573);
            case 135 -> 0;
            case 136 -> ll(-1437667769, var9 ^ 1445101788);
            case 137 -> ll(-1437667770, var9 ^ 1475127613);
            case 138 -> ll(-1437667775, var9 ^ -1013019652);
            case 139 -> ll(-1437667776, var9 ^ -139439879);
            case 140 -> ll(-1437667773, var9 ^ -265126959);
            case 141 -> ll(-1437667774, var9 ^ -1886134155);
            case 142 -> ll(-1437667715, var9 ^ 423839002);
            case 143 -> ll(-1437667716, var9 ^ 1970801339);
            case 144 -> ll(-1437667713, var9 ^ 1050235299);
            case 145 -> ll(-1437667714, var9 ^ -882670986);
            case 146 -> ll(-1437667719, var9 ^ 1124996907);
            case 147 -> ll(-1437667720, var9 ^ -1990807012);
            case 148 -> ll(-1437667717, var9 ^ -1467319585);
            case 149 -> ll(-1437667718, var9 ^ 1219405005);
            case 150 -> ll(-1437667723, var9 ^ -660404238);
            case 151 -> ll(-1437667724, var9 ^ 1307006152);
            case 152 -> ll(-1437667721, var9 ^ -775261992);
            case 153 -> ll(-1437667722, var9 ^ -1101299975);
            case 154 -> ll(-1437667727, var9 ^ -1930975425);
            case 155 -> ll(-1437667728, var9 ^ -397653839);
            case 156 -> ll(-1437667725, var9 ^ -139707975);
            case 157 -> ll(-1437667726, var9 ^ 931654972);
            case 158 -> ll(-1437667731, var9 ^ 1117531947);
            case 159 -> 4;
            case 160 -> ll(-1437667732, var9 ^ -898420047);
            case 161 -> ll(-1437667729, var9 ^ -539052798);
            case 162 -> ll(-1437667730, var9 ^ -761410252);
            case 163 -> ll(-1437667735, var9 ^ 1394456727);
            case 164 -> ll(-1437667736, var9 ^ 31507228);
            case 165 -> ll(-1437667733, var9 ^ 1185151108);
            case 166 -> ll(-1437667734, var9 ^ -478763954);
            case 167 -> ll(-1437667739, var9 ^ 1404485650);
            case 168 -> ll(-1437667740, var9 ^ -187727697);
            case 169 -> ll(-1437667737, var9 ^ 19330546);
            case 170 -> ll(-1437667738, var9 ^ -181074405);
            case 171 -> ll(-1437667743, var9 ^ 745032808);
            case 172 -> ll(-1437667744, var9 ^ 1809108549);
            case 173 -> ll(-1437667741, var9 ^ -1757721103);
            case 174 -> ll(-1437667742, var9 ^ 1850558954);
            case 175 -> ll(-1437667811, var9 ^ 21605835);
            case 176 -> ll(-1437667812, var9 ^ 602602629);
            case 177 -> ll(-1437667809, var9 ^ 433418686);
            case 178 -> ll(-1437667810, var9 ^ 26719628);
            case 179 -> ll(-1437667815, var9 ^ 1495773649);
            case 180 -> ll(-1437667816, var9 ^ -1786632133);
            case 181 -> ll(-1437667813, var9 ^ -891457212);
            case 182 -> ll(-1437667814, var9 ^ -716714695);
            case 183 -> ll(-1437667819, var9 ^ 761360992);
            case 184 -> ll(-1437667820, var9 ^ 539145151);
            case 185 -> ll(-1437667817, var9 ^ 955610414);
            case 186 -> ll(-1437667818, var9 ^ -648467383);
            case 187 -> ll(-1437667823, var9 ^ 1923114880);
            case 188 -> ll(-1437667824, var9 ^ 160326108);
            case 189 -> ll(-1437667821, var9 ^ -859898278);
            case 190 -> ll(-1437667822, var9 ^ 1751185983);
            case 191 -> 2;
            case 192 -> ll(-1437667827, var9 ^ -403915553);
            case 193 -> ll(-1437667828, var9 ^ 1179534429);
            case 194 -> ll(-1437667825, var9 ^ 1649366710);
            case 195 -> ll(-1437667826, var9 ^ -1801183095);
            case 196 -> ll(-1437667831, var9 ^ -1249662166);
            case 197 -> ll(-1437667832, var9 ^ -880017565);
            case 198 -> ll(-1437667829, var9 ^ 1052737359);
            case 199 -> ll(-1437667830, var9 ^ -1396094500);
            case 200 -> ll(-1437667835, var9 ^ -2004775952);
            case 201 -> ll(-1437667836, var9 ^ 1727718166);
            case 202 -> ll(-1437667833, var9 ^ -1434031406);
            case 203 -> ll(-1437667834, var9 ^ -856986030);
            case 204 -> ll(-1437667839, var9 ^ 970619366);
            case 205 -> ll(-1437667840, var9 ^ 678085332);
            case 206 -> ll(-1437667837, var9 ^ 1267979684);
            case 207 -> ll(-1437667838, var9 ^ 1811530802);
            case 208 -> ll(-1437667779, var9 ^ -665233993);
            case 209 -> ll(-1437667780, var9 ^ 589638975);
            case 210 -> ll(-1437667777, var9 ^ -1811893915);
            case 211 -> ll(-1437667778, var9 ^ 2120963031);
            case 212 -> ll(-1437667783, var9 ^ -1352752736);
            case 213 -> ll(-1437667784, var9 ^ 107130879);
            case 214 -> ll(-1437667781, var9 ^ -310840510);
            case 215 -> ll(-1437667782, var9 ^ 210771242);
            case 216 -> ll(-1437667787, var9 ^ 1482957093);
            case 217 -> ll(-1437667788, var9 ^ 1376793352);
            case 218 -> ll(-1437667785, var9 ^ 230677931);
            case 219 -> ll(-1437667786, var9 ^ 1385198738);
            case 220 -> ll(-1437667791, var9 ^ 942311345);
            case 221 -> ll(-1437667792, var9 ^ 2012263030);
            case 222 -> ll(-1437667789, var9 ^ -168109706);
            case 223 -> ll(-1437667790, var9 ^ -2070016162);
            case 224 -> ll(-1437667795, var9 ^ 1623527932);
            case 225 -> ll(-1437667796, var9 ^ 1462863);
            case 226 -> ll(-1437667793, var9 ^ 1027221411);
            case 227 -> ll(-1437667794, var9 ^ 1517872224);
            case 228 -> ll(-1437667799, var9 ^ 42877940);
            case 229 -> ll(-1437667800, var9 ^ 1595494789);
            case 230 -> ll(-1437667797, var9 ^ -1476282041);
            case 231 -> ll(-1437667798, var9 ^ 1653376769);
            case 232 -> ll(-1437667803, var9 ^ -585294693);
            case 233 -> ll(-1437667804, var9 ^ 1302523940);
            case 234 -> ll(-1437667801, var9 ^ 1656633743);
            case 235 -> ll(-1437667802, var9 ^ -288168010);
            case 236 -> ll(-1437667807, var9 ^ -1039773063);
            case 237 -> ll(-1437667808, var9 ^ -151328815);
            case 238 -> ll(-1437667805, var9 ^ 969877935);
            case 239 -> ll(-1437667806, var9 ^ 1355632460);
            case 240 -> ll(-1437667363, var9 ^ 1237290777);
            case 241 -> 1;
            case 242 -> ll(-1437667364, var9 ^ 1568846573);
            case 243 -> ll(-1437667361, var9 ^ 795001296);
            case 244 -> ll(-1437667362, var9 ^ -1838002232);
            case 245 -> ll(-1437667367, var9 ^ -19799650);
            case 246 -> ll(-1437667368, var9 ^ 1633902763);
            case 247 -> ll(-1437667365, var9 ^ 663247674);
            case 248 -> ll(-1437667366, var9 ^ 1382866406);
            case 249 -> ll(-1437667371, var9 ^ -1019606055);
            case 250 -> ll(-1437667372, var9 ^ -2036594431);
            case 251 -> ll(-1437667369, var9 ^ 138784306);
            case 252 -> ll(-1437667370, var9 ^ -1043716056);
            case 253 -> ll(-1437667375, var9 ^ -1953429529);
            case 254 -> ll(-1437667376, var9 ^ 1660477332);
            default -> ll(-1437667373, var9 ^ 316085473);
         };
         int var5 = (var1 & ll(-1437667374, var9 ^ 830844197)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(-1437667379, var9 ^ 1267790393)) >>> ll(-1437667380, var9 ^ 231661576)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(-1437667377, var9 ^ -1750509300);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(-1437667378, var9 ^ 2027477173);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }
}
