package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class lll extends IlIIIIIIl {
   private static final Object[] III;
   private static final int[] lI;
   private static final String[] I;
   private static final String[] ll;
   private static String[] II;
   private static final String[] Il;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = Il(2129346396, 1102037825 ^ -1062562369) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & Il(2129346397, 1102037825 ^ -1435683175);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1900518097;
      short var18 = 1500;
      int var16 = 0;
      int var17 = 0;
      String[] var15 = new String[1];
      int var14 = "Qꭽ\ue902挼냰荥䥻㻨覂\uf381祣雿\u1758흧＊泞᪓\uf412㮠㼓輭酵碯䡓隵㣨⟡郿䏄Ɛ熏嵹᧩玞\ue40f튭휚龂\uf4f1毽г贉خ權ᐨ㨈믥슥俩\ue9a8ꉽ❓稄ㄟ끢ඨᲑ綤찙う톪毶⛄໕ᚌ\uda0a胟辳䰒\ue3af㷫ڨ雫竇\ue345偟꠆\uab6d\ue825䝽\ud8d7\uebee"
         .length();
      String var13 = "Qꭽ\ue902挼냰荥䥻㻨覂\uf381祣雿\u1758흧＊泞᪓\uf412㮠㼓輭酵碯䡓隵㣨⟡郿䏄Ɛ熏嵹᧩玞\ue40f튭휚龂\uf4f1毽г贉خ權ᐨ㨈믥슥俩\ue9a8ꉽ❓稄ㄟ끢ඨᲑ綤찙う톪毶⛄໕ᚌ\uda0a胟辳䰒\ue3af㷫ڨ雫竇\ue345偟꠆\uab6d\ue825䝽\ud8d7\uebee";

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

      ll = var15;
      III = new Object[var15.length];
      int var9 = 1269777381;
      byte[] var7 = "Õ¢æ\u0002Þ\u0087?\f¹Ùo\u008f4G\u0014á\u0013'á\u0019\u0010Â\u009aPs\u0019z\u0011!d\u001aÙ\u0010|\u0014\tø\u0082lD\u000e?\u000eÌ\r´î/¤¹\u0019\u0092Ý øø\u0012¿BÌ\fâN[¦j\u00030Mùü¥\u0088\u0012±¹\u0091.X\u0000Çi\u000ezFjÙ\u0096|i\u0083\u009d½ûjü5ävJ\u0004ªé½U\u008d\u009fH3\u00adGÒ\u0083G>ý-Ê`¢ç>c|ë[êé\u0088Öq$Ôþ¶ZÕZ÷±\u001ayZpCG\u0085gô¿ã¯Ì\u00108\u0001¦dîÎ©h4\u000eÈ\u0087\u0092t2\u0097\u00841m{$¸ \u008bí¦^xbl¶÷\u0015{ ¨8\u0087*Øüó\u0013ÊÜhB¿ÈN\u000b_ 6\u0012¤tr\"f\u0002A£:ú\u008c«#\u0086åã\u0001{\u008b%\tÃ5\u001f?Nom\u008cDªs'Såx\u0085õE½L\u008b\u000b®ù\u0003Ù`7\u0004GÅZáb³<\u0010ìK<\u0080k\u008f\u0004\u009cé½=Y\u00adq\u0097\f_Ùa\u0090õ2ÀZ)½ <õ´ª7\u009eeÈM9±'\u0083Z)ú7òjú+7\u0017 ÊH\u001f\u008f<\u0085\u0014®C\u0013<´\u001b´\u0000\u000b\u000f\u0011sÓ\u0001\u0085\u008c\u0082-à\u008cÐ\u0099\u00006\u0018\u008fßBD\t\nè_¯*Ívw)ã\u0002Ó\u0003rÌN\u0010ç\u0098\u0083éc\u000eÔ\u0019\u0095V3\u0002é¿\u0015kc²¥<\t\u0094V*ä\u0091\u0091\u000e\u008buP±Ö16ªÕaÁ¹\u00953êÄEµü·\u0012.±\tf$ÏOå³ÑÚ\u0085A\u000f\u000fÂWÊHIT\u009cm±\u0014*\féT{Vp»20}ÎlÍ3Ú!`ñ\rc<¿x7ÔØ9~áñ?Ï³\u000eÖTÑê\u0095kÂà\u000f\u0088\\\u008a´Ñ¾4ÆP9\u008e]¦¯iy¦\u0012\u0082m²\bv\u008cìrsàª¥C\u0018ú\u009d\u0095U\u001f¯ØtìÌ^²YcMY\u0016¥,\"5ß\u0006ÿ\u0081]\u001c×'\u001a,Ù\rVG²/\u007f³R\u009e1å¢åÄè{\u0097\u0095L}\u0016üÏ*$\u0014k\u0099zB=½S\\>l\u0007§\u0004[k\u000fkø ËÉ§Ä\u001f5\u0014\u0002áÆ\u00927\r¹\u0000\u0099e²\u0080t\u008eÈ?V§\"Ä0\u009e´\u009fäÊ¶\u0013\u0090\tn%\u0081\f\u0015ñËJÁ¤\u001aáAÿìýE9Ê¢±ù\u0007¯~½ÜUÑ\u001f¸òf\u008b\u000bàíÏ\u000fÆ£\u0018jyÊ-\u0088iIq\u000e\u001b\u0018\u001b&ðáënP6çÜ¿Å<²\u0095hÙ$\tÞ¾\u0089T\u0086\u008al§$Z\u0010|Q¹V\n\u0098\u001f´cHaÍ\u0015Ï^Öx³±ìÄ\u008d\u0006Ð.}å{¥Ãµ\u000b&1¢\thÂ[\u0086ô\\än\u008e(&%3Xa·Oo\u0091\u001c¯W\u001eº\u0085\u0099cOìËÃ\u0093w^ÃPÞä33ßxÜ\u000eìÊq\\WÛÁ1®6\u008bIn\u0083ù\u0005?ô_KÍ`\u009a\u0018-\u0003¡(Ç\u0005«\tziÒÕQoåoCUoÚÓB\u008fý ¨a\u00ad§Â\u0085ì6ðØþ\u001a\u0098\u0091e\u0016·\u0003<ë4>\u00113Q\u000b\"úG*$6Èi·b°Á\u0096\u0080\u008b}B\u0097+ä\u0013ÙG?^&÷'Õ\fí\u0081\u009d¶µgxà\u0000y\u0012O(¯\u0006¹àÙ\u0087\u009aÉÌä\u000bs^5b\u0085w5\u001cRþlÆe7è(ä\u0006â\u009eºÇ_ÃÚ¨\u0085«\u0002\u0016\u008a¹µ(GÙ\u001cd#1eXA¼´¸ìí-$\u009dT\u0015JU7\u009a\u00015\u008eõë\u0000¯S>:\u000e\u0086b»\u00059wô\u0005äË \u0016FçèX¨Gtr·°\u0089~ÓÄù\u0084\"õß±S,Ë\u001b³qEÕ^àà\u008b5£\u0089}é^®2Ð$ò\u0096Ê¦êì\u0004\u001eéx8\t\u0097ò8\u00ad\u001c-ø\u0015°\u0003\u0094ë\u0006èá\u000f¾4¼\u0019\u00160Í\u001f\u001d\u001dZÌJû`(©Ë©¨\u0019\u0092£\u0096¤x"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lI('\u0b00', var23 ^ -1861847507, (short)17738)).length();
      int var1 = Il(2129346134, var23 ^ -2091863314);
      int var0 = -1;

      while (true) {
         char[] var30;
         label75: {
            int var10000 = Il(2129346135, var23 ^ 1139284268);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var33 = var10000;
            var30 = var10003;
            int var27 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            } else {
               var33 = var10000;
               var27 = var10004;
               if (var10004 <= var6) {
                  break label75;
               }

               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % Il(2129346128, var23 ^ 790014006)) {
                  case 0 -> Il(2129346129, var23 ^ 1525815069);
                  case 1 -> Il(2129346130, var23 ^ 132431693);
                  case 2 -> Il(2129346131, var23 ^ 1994568671);
                  case 3 -> Il(2129346124, var23 ^ -516824095);
                  case 4 -> Il(2129346125, var23 ^ -606797653);
                  case 5 -> Il(2129346126, var23 ^ 307605665);
                  default -> Il(2129346127, var23 ^ 409668939);
               });
               var6++;
               if (var33 == 0) {
                  var10006 = var33;
                  var10005 = var30;
                  var10004 = var33;
               } else {
                  if (var27 <= var6) {
                     break;
                  }

                  var10005 = var30;
                  var10004 = var33;
                  var10006 = var6;
               }
            }
         }

         String var35 = new String(var30).intern();
         byte var29 = -1;
         var5[var3++] = var35;
         if ((var0 += var1) >= var4) {
            Il = var5;
            I = new String[2];
            II = new String[2];
            l();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static void l() {
      int var0 = 209279444;
      II[0] = I(II(Il(2129346398, var0 ^ -2132492285), Il(2129346399, var0 ^ 226146310)).toCharArray(), 5014L, Il(2129346392, var0 ^ -1157501636));
      II[1] = I(II(Il(2129346393, var0 ^ 704591322), Il(2129346394, var0 ^ 1243986039)).toCharArray(), 1949L, Il(2129346395, var0 ^ -1003456032));
   }

   public lll() {
      super(IlIIllIII.Ill(II[0]), lllIIlIl.IlI, IlIIllIII.Ill(II[1]));
   }

   private static String lI(char var0, int var1, short var2) {
      int var3 = var0 ^ 2816;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 2369;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 3741;
         var10 -= 45283;
         var10 -= 39047;
         var10 -= 16987;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int Il(int var0, int var1) {
      int var2 = lI[var0 ^ 2129346396] ^ var1 ^ var0;
      var2 ^= 37455;
      var2 -= 39610;
      var2 += 2649;
      var2 -= 3639;
      var2 ^= 64440;
      var2 ^= 27982;
      return var2 ^ 4994;
   }

   private static String II(int var0, int var1) {
      int var9 = 1333152819;
      int var2 = (var0 ^ Il(2129346388, var9 ^ 1783541352)) & Il(2129346389, var9 ^ -2102274133);
      if (I[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & Il(2129346390, var9 ^ 1946978336)) {
            case 0 -> Il(2129346391, var9 ^ 2005362897);
            case 1 -> Il(2129346384, var9 ^ -561340556);
            case 2 -> Il(2129346385, var9 ^ -1491895889);
            case 3 -> Il(2129346386, var9 ^ 1754055781);
            case 4 -> Il(2129346387, var9 ^ 1993461594);
            case 5 -> Il(2129346380, var9 ^ -598113668);
            case 6 -> Il(2129346381, var9 ^ 936017289);
            case 7 -> Il(2129346382, var9 ^ -232704189);
            case 8 -> Il(2129346383, var9 ^ -350363993);
            case 9 -> Il(2129346376, var9 ^ -1118140172);
            case 10 -> Il(2129346377, var9 ^ 1012488328);
            case 11 -> Il(2129346378, var9 ^ 106562924);
            case 12 -> Il(2129346379, var9 ^ -943133634);
            case 13 -> Il(2129346372, var9 ^ 1339553633);
            case 14 -> Il(2129346373, var9 ^ 2123984683);
            case 15 -> Il(2129346374, var9 ^ 800988796);
            case 16 -> Il(2129346375, var9 ^ 1235140909);
            case 17 -> Il(2129346368, var9 ^ -109791228);
            case 18 -> Il(2129346369, var9 ^ 1475995373);
            case 19 -> Il(2129346370, var9 ^ -1660033759);
            case 20 -> Il(2129346371, var9 ^ -1855427698);
            case 21 -> Il(2129346428, var9 ^ -219811799);
            case 22 -> Il(2129346429, var9 ^ -1362284395);
            case 23 -> Il(2129346430, var9 ^ -1352042843);
            case 24 -> Il(2129346431, var9 ^ 1615518563);
            case 25 -> Il(2129346424, var9 ^ 963904402);
            case 26 -> Il(2129346425, var9 ^ -1903402281);
            case 27 -> Il(2129346426, var9 ^ -1239172782);
            case 28 -> Il(2129346427, var9 ^ -598251452);
            case 29 -> Il(2129346420, var9 ^ -748964569);
            case 30 -> Il(2129346421, var9 ^ -1296821237);
            case 31 -> Il(2129346422, var9 ^ 1218708163);
            case 32 -> Il(2129346423, var9 ^ 390637051);
            case 33 -> Il(2129346416, var9 ^ 1522035569);
            case 34 -> Il(2129346417, var9 ^ 608953536);
            case 35 -> Il(2129346418, var9 ^ -859532396);
            case 36 -> Il(2129346419, var9 ^ 1520156227);
            case 37 -> Il(2129346412, var9 ^ 1357610475);
            case 38 -> Il(2129346413, var9 ^ 1777949204);
            case 39 -> Il(2129346414, var9 ^ 948719317);
            case 40 -> Il(2129346415, var9 ^ 1902946037);
            case 41 -> Il(2129346408, var9 ^ 1754788356);
            case 42 -> Il(2129346409, var9 ^ 1481999595);
            case 43 -> 1;
            case 44 -> Il(2129346410, var9 ^ -653689968);
            case 45 -> Il(2129346411, var9 ^ -787478582);
            case 46 -> Il(2129346404, var9 ^ -1724712300);
            case 47 -> Il(2129346405, var9 ^ 1597654401);
            case 48 -> Il(2129346406, var9 ^ 1695336636);
            case 49 -> Il(2129346407, var9 ^ 398443229);
            case 50 -> Il(2129346400, var9 ^ 152359647);
            case 51 -> Il(2129346401, var9 ^ 45511805);
            case 52 -> Il(2129346402, var9 ^ -947974731);
            case 53 -> Il(2129346403, var9 ^ -724925066);
            case 54 -> Il(2129346332, var9 ^ 436503836);
            case 55 -> Il(2129346333, var9 ^ -1083613148);
            case 56 -> Il(2129346334, var9 ^ -921726564);
            case 57 -> Il(2129346335, var9 ^ 823068411);
            case 58 -> Il(2129346328, var9 ^ -180937310);
            case 59 -> Il(2129346329, var9 ^ -955328283);
            case 60 -> Il(2129346330, var9 ^ 195333380);
            case 61 -> Il(2129346331, var9 ^ -1554901450);
            case 62 -> Il(2129346324, var9 ^ 1223941375);
            case 63 -> Il(2129346325, var9 ^ -946619798);
            case 64 -> Il(2129346326, var9 ^ -828787025);
            case 65 -> Il(2129346327, var9 ^ 536595533);
            case 66 -> Il(2129346320, var9 ^ -887880270);
            case 67 -> Il(2129346321, var9 ^ 1405728435);
            case 68 -> Il(2129346322, var9 ^ 281652665);
            case 69 -> 4;
            case 70 -> Il(2129346323, var9 ^ 1838369539);
            case 71 -> Il(2129346316, var9 ^ 1706867251);
            case 72 -> Il(2129346317, var9 ^ 1855833367);
            case 73 -> Il(2129346318, var9 ^ 1183292689);
            case 74 -> Il(2129346319, var9 ^ 2050525595);
            case 75 -> Il(2129346312, var9 ^ 165709603);
            case 76 -> Il(2129346313, var9 ^ -156128086);
            case 77 -> Il(2129346314, var9 ^ -152887550);
            case 78 -> 2;
            case 79 -> Il(2129346315, var9 ^ 1277888793);
            case 80 -> Il(2129346308, var9 ^ 947357739);
            case 81 -> Il(2129346309, var9 ^ -1838405217);
            case 82 -> Il(2129346310, var9 ^ -1220151734);
            case 83 -> Il(2129346311, var9 ^ -1724820213);
            case 84 -> Il(2129346304, var9 ^ 150980619);
            case 85 -> Il(2129346305, var9 ^ -1649736420);
            case 86 -> Il(2129346306, var9 ^ 423449103);
            case 87 -> Il(2129346307, var9 ^ -278547865);
            case 88 -> Il(2129346364, var9 ^ -1819503570);
            case 89 -> Il(2129346365, var9 ^ 427893828);
            case 90 -> Il(2129346366, var9 ^ 1940377748);
            case 91 -> Il(2129346367, var9 ^ -1633544257);
            case 92 -> Il(2129346360, var9 ^ -247015866);
            case 93 -> Il(2129346361, var9 ^ -1409110015);
            case 94 -> Il(2129346362, var9 ^ -1353563947);
            case 95 -> Il(2129346363, var9 ^ -285184932);
            case 96 -> Il(2129346356, var9 ^ 1065777760);
            case 97 -> Il(2129346357, var9 ^ 1746743371);
            case 98 -> Il(2129346358, var9 ^ 471288253);
            case 99 -> Il(2129346359, var9 ^ -1618979016);
            case 100 -> Il(2129346352, var9 ^ -9269639);
            case 101 -> Il(2129346353, var9 ^ -1201386382);
            case 102 -> Il(2129346354, var9 ^ 862395764);
            case 103 -> Il(2129346355, var9 ^ -886592758);
            case 104 -> Il(2129346348, var9 ^ -1821902334);
            case 105 -> Il(2129346349, var9 ^ 176730922);
            case 106 -> Il(2129346350, var9 ^ 134081040);
            case 107 -> Il(2129346351, var9 ^ 1240047629);
            case 108 -> Il(2129346344, var9 ^ -1958812196);
            case 109 -> Il(2129346345, var9 ^ -984895215);
            case 110 -> Il(2129346346, var9 ^ -1576339446);
            case 111 -> Il(2129346347, var9 ^ -1962127689);
            case 112 -> Il(2129346340, var9 ^ 1961218655);
            case 113 -> Il(2129346341, var9 ^ -1868109092);
            case 114 -> Il(2129346342, var9 ^ -1707341498);
            case 115 -> Il(2129346343, var9 ^ -259565765);
            case 116 -> Il(2129346336, var9 ^ 1324734207);
            case 117 -> Il(2129346337, var9 ^ -194107404);
            case 118 -> Il(2129346338, var9 ^ 323625104);
            case 119 -> Il(2129346339, var9 ^ -128044262);
            case 120 -> Il(2129346524, var9 ^ 213871196);
            case 121 -> Il(2129346525, var9 ^ 164834055);
            case 122 -> Il(2129346526, var9 ^ 959150879);
            case 123 -> Il(2129346527, var9 ^ -278487478);
            case 124 -> Il(2129346520, var9 ^ -1572377962);
            case 125 -> Il(2129346521, var9 ^ 612489459);
            case 126 -> Il(2129346522, var9 ^ 929730708);
            case 127 -> Il(2129346523, var9 ^ 1444000775);
            case 128 -> Il(2129346516, var9 ^ 2093744308);
            case 129 -> 5;
            case 130 -> Il(2129346517, var9 ^ 1726259461);
            case 131 -> Il(2129346518, var9 ^ 1458212001);
            case 132 -> Il(2129346519, var9 ^ 1031907657);
            case 133 -> Il(2129346512, var9 ^ -916383738);
            case 134 -> Il(2129346513, var9 ^ -1617861659);
            case 135 -> Il(2129346514, var9 ^ -1840770565);
            case 136 -> Il(2129346515, var9 ^ 911120173);
            case 137 -> Il(2129346508, var9 ^ -1256610426);
            case 138 -> Il(2129346509, var9 ^ 296418364);
            case 139 -> Il(2129346510, var9 ^ 1200542386);
            case 140 -> Il(2129346511, var9 ^ 1147110927);
            case 141 -> 3;
            case 142 -> Il(2129346504, var9 ^ 2120805750);
            case 143 -> Il(2129346505, var9 ^ 298559129);
            case 144 -> Il(2129346506, var9 ^ -1282129324);
            case 145 -> Il(2129346507, var9 ^ 1327989610);
            case 146 -> Il(2129346500, var9 ^ -1130253993);
            case 147 -> Il(2129346501, var9 ^ -1020061552);
            case 148 -> Il(2129346502, var9 ^ -927731057);
            case 149 -> Il(2129346503, var9 ^ -1307781282);
            case 150 -> Il(2129346496, var9 ^ 1492629205);
            case 151 -> Il(2129346497, var9 ^ -827563347);
            case 152 -> Il(2129346498, var9 ^ -870312330);
            case 153 -> Il(2129346499, var9 ^ 336986339);
            case 154 -> Il(2129346556, var9 ^ 1875004032);
            case 155 -> Il(2129346557, var9 ^ -1147691787);
            case 156 -> Il(2129346558, var9 ^ 1003252473);
            case 157 -> Il(2129346559, var9 ^ 1057639588);
            case 158 -> Il(2129346552, var9 ^ -875919821);
            case 159 -> Il(2129346553, var9 ^ 76438955);
            case 160 -> Il(2129346554, var9 ^ -1423163887);
            case 161 -> Il(2129346555, var9 ^ 481856975);
            case 162 -> Il(2129346548, var9 ^ -1745056243);
            case 163 -> Il(2129346549, var9 ^ -651432939);
            case 164 -> Il(2129346550, var9 ^ -1340207499);
            case 165 -> Il(2129346551, var9 ^ 860000207);
            case 166 -> Il(2129346544, var9 ^ 1646829807);
            case 167 -> 0;
            case 168 -> Il(2129346545, var9 ^ -1680283569);
            case 169 -> Il(2129346546, var9 ^ 1288985238);
            case 170 -> Il(2129346547, var9 ^ -1089522893);
            case 171 -> Il(2129346540, var9 ^ 317366911);
            case 172 -> Il(2129346541, var9 ^ -1534261011);
            case 173 -> Il(2129346542, var9 ^ -54923935);
            case 174 -> Il(2129346543, var9 ^ 1583976865);
            case 175 -> Il(2129346536, var9 ^ 730519500);
            case 176 -> Il(2129346537, var9 ^ -500419134);
            case 177 -> Il(2129346538, var9 ^ 844253953);
            case 178 -> Il(2129346539, var9 ^ -1251127177);
            case 179 -> Il(2129346532, var9 ^ -914200011);
            case 180 -> Il(2129346533, var9 ^ -147499520);
            case 181 -> Il(2129346534, var9 ^ 131529338);
            case 182 -> Il(2129346535, var9 ^ -1182365015);
            case 183 -> Il(2129346528, var9 ^ 1267830539);
            case 184 -> Il(2129346529, var9 ^ -1201143589);
            case 185 -> Il(2129346530, var9 ^ 651684009);
            case 186 -> Il(2129346531, var9 ^ 1377149813);
            case 187 -> Il(2129346460, var9 ^ 575813294);
            case 188 -> Il(2129346461, var9 ^ 362978591);
            case 189 -> Il(2129346462, var9 ^ 757939393);
            case 190 -> Il(2129346463, var9 ^ -481243567);
            case 191 -> Il(2129346456, var9 ^ -1309665999);
            case 192 -> Il(2129346457, var9 ^ 619762047);
            case 193 -> Il(2129346458, var9 ^ -1644121543);
            case 194 -> Il(2129346459, var9 ^ 49254204);
            case 195 -> Il(2129346452, var9 ^ -1337796021);
            case 196 -> Il(2129346453, var9 ^ -1577930666);
            case 197 -> Il(2129346454, var9 ^ 1287180039);
            case 198 -> Il(2129346455, var9 ^ -104168234);
            case 199 -> Il(2129346448, var9 ^ -1905472984);
            case 200 -> Il(2129346449, var9 ^ 447323740);
            case 201 -> Il(2129346450, var9 ^ 2039654758);
            case 202 -> Il(2129346451, var9 ^ 2140702886);
            case 203 -> Il(2129346444, var9 ^ 333534145);
            case 204 -> Il(2129346445, var9 ^ 366405931);
            case 205 -> Il(2129346446, var9 ^ 794581849);
            case 206 -> Il(2129346447, var9 ^ 951876491);
            case 207 -> Il(2129346440, var9 ^ -766366765);
            case 208 -> Il(2129346441, var9 ^ -1196004791);
            case 209 -> Il(2129346442, var9 ^ -1964279673);
            case 210 -> Il(2129346443, var9 ^ -492641025);
            case 211 -> Il(2129346436, var9 ^ -852444481);
            case 212 -> Il(2129346437, var9 ^ 1309511894);
            case 213 -> Il(2129346438, var9 ^ 725132055);
            case 214 -> Il(2129346439, var9 ^ 1025090073);
            case 215 -> Il(2129346432, var9 ^ -1302711972);
            case 216 -> Il(2129346433, var9 ^ -890105698);
            case 217 -> Il(2129346434, var9 ^ -246496109);
            case 218 -> Il(2129346435, var9 ^ 1373082956);
            case 219 -> Il(2129346492, var9 ^ 1024253930);
            case 220 -> Il(2129346493, var9 ^ -1928047780);
            case 221 -> Il(2129346494, var9 ^ -1749935145);
            case 222 -> Il(2129346495, var9 ^ -816513465);
            case 223 -> Il(2129346488, var9 ^ 2051707833);
            case 224 -> Il(2129346489, var9 ^ 1385988311);
            case 225 -> Il(2129346490, var9 ^ -1695940294);
            case 226 -> Il(2129346491, var9 ^ -1275108835);
            case 227 -> Il(2129346484, var9 ^ 158184639);
            case 228 -> Il(2129346485, var9 ^ -12274907);
            case 229 -> Il(2129346486, var9 ^ 684583590);
            case 230 -> Il(2129346487, var9 ^ 520384086);
            case 231 -> Il(2129346480, var9 ^ -1640668318);
            case 232 -> Il(2129346481, var9 ^ -1057695254);
            case 233 -> Il(2129346482, var9 ^ -1600453704);
            case 234 -> Il(2129346483, var9 ^ 2015693653);
            case 235 -> Il(2129346476, var9 ^ -820264553);
            case 236 -> Il(2129346477, var9 ^ 1717019375);
            case 237 -> Il(2129346478, var9 ^ 527157007);
            case 238 -> Il(2129346479, var9 ^ -829724082);
            case 239 -> Il(2129346472, var9 ^ 1461132069);
            case 240 -> Il(2129346473, var9 ^ 1870254989);
            case 241 -> Il(2129346474, var9 ^ -533547999);
            case 242 -> Il(2129346475, var9 ^ -1881635306);
            case 243 -> Il(2129346468, var9 ^ 688766058);
            case 244 -> Il(2129346469, var9 ^ -61785466);
            case 245 -> Il(2129346470, var9 ^ 1128559116);
            case 246 -> Il(2129346471, var9 ^ -1627904478);
            case 247 -> Il(2129346464, var9 ^ 1020554823);
            case 248 -> Il(2129346465, var9 ^ -764087807);
            case 249 -> Il(2129346466, var9 ^ -847048917);
            case 250 -> Il(2129346467, var9 ^ -1443399574);
            case 251 -> Il(2129346140, var9 ^ 1489393680);
            case 252 -> Il(2129346141, var9 ^ 689916684);
            case 253 -> Il(2129346142, var9 ^ -918370911);
            case 254 -> Il(2129346143, var9 ^ 617834323);
            default -> Il(2129346136, var9 ^ 1334840872);
         };
         int var5 = (var1 & Il(2129346137, var9 ^ -1821562415)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Il(2129346138, var9 ^ -1441314698)) >>> Il(2129346139, var9 ^ -1332384454)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Il(2129346132, var9 ^ 2116906646);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Il(2129346133, var9 ^ 1111101469);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }
}
