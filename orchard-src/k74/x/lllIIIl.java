package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lllIIIl {
   l,
   II,
   ll;

   private static final String[] I;
   private static final Object[] Ill;
   private static final String[] IlI;
   private static final int[] IIl;
   private static String[] Il;
   private static final String[] lI;
   private static final lllIIIl[] III;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = ll(11789428, 1157553236 ^ -2030091583) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(11789429, 1157553236 ^ 1703698299);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static lllIIIl[] l() {
      return new lllIIIl[]{ll, II, l};
   }

   private static int ll(int var0, int var1) {
      int var2 = IIl[var0 ^ 11789428] ^ var1 ^ var0;
      var2 ^= 11291;
      var2 += 38592;
      var2 -= 15670;
      var2 -= 36149;
      var2 += 45123;
      var2 -= 16354;
      var2 -= 1325;
      var2 -= 53013;
      var2 -= 63465;
      return var2 - 11590;
   }

   private static String III(int var0, int var1) {
      int var3 = var0 ^ -776098340;
      char[] var4 = IlI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])Ill[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         Ill[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 789884928;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 143;
            case 1 -> 23;
            case 2 -> 196;
            case 3 -> 161;
            case 4 -> 188;
            case 5 -> 87;
            case 6 -> 141;
            case 7 -> 15;
            case 8 -> 200;
            case 9 -> 232;
            case 10 -> 115;
            case 11 -> 115;
            case 12 -> 75;
            case 13 -> 152;
            case 14 -> 217;
            case 15 -> 13;
            case 16 -> 170;
            case 17 -> 199;
            case 18 -> 179;
            case 19 -> 202;
            case 20 -> 89;
            case 21 -> 81;
            case 22 -> 53;
            case 23 -> 125;
            case 24 -> 85;
            case 25 -> 13;
            case 26 -> 54;
            case 27 -> 173;
            case 28 -> 41;
            case 29 -> 217;
            case 30 -> 182;
            case 31 -> 176;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static void II() {
      int var0 = -661621392;
      Il[0] = I(Il(ll(11789430, var0 ^ -1510289375), ll(11789431, var0 ^ -1618457965)).toCharArray(), 17681L, ll(11789424, var0 ^ -1787420837));
      Il[1] = I(Il(ll(11789425, var0 ^ -1974378505), ll(11789426, var0 ^ 163072692)).toCharArray(), 22400L, ll(11789427, var0 ^ -1883846015));
      Il[2] = I(Il(ll(11789436, var0 ^ -1596868730), ll(11789437, var0 ^ -877496889)).toCharArray(), 75287L, ll(11789438, var0 ^ 1584404522));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -246907841;
      int var14 = "$ₛ䶛ǚꊮ蚮ꍖ㤹䥣餤ꦞ痩説鱷⥳諝⢡蚴ꂈ挬䕪艦嘴㎉傂㇣믱嶨愌畸퉗㖷崯蕧閁\udbc5\u000e".length();
      int var17 = 0;
      short var18 = 2107;
      String[] var15 = new String[1];
      String var13 = "$ₛ䶛ǚꊮ蚮ꍖ㤹䥣餤ꦞ痩説鱷⥳諝⢡蚴ꂈ挬䕪艦嘴㎉傂㇣믱嶨愌畸퉗㖷崯蕧閁\udbc5\u000e";
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         char[] var10000 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;
         char[] var20 = var10000;

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 50;
               case 1 -> 145;
               case 2 -> 229;
               case 3 -> 203;
               case 4 -> 73;
               case 5 -> 90;
               case 6 -> 237;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IlI = var15;
      Ill = new Object[var15.length];
      int var9 = 1232465027;
      byte[] var7 = "kó`<hµ\u001ax4®«Ç\u000eßÍð\u0080\u0082\u0082j\u001b\u0005$\u0014\u0098ïþë*I}¯1\u0085ÌkZåW±g\u0085³\u001b\n\u0082öà\u0097q\u00873L\u009e¤\u0001»þ\fø£\n,Ù\u0094*Ùù\u00153ÜèF\n\u0004\u00072Q\u0084c#\u0088!\u0002ã\u0002ïÀ>äÊÙâE§j¹R\t¨@N,S\u009fÃ\u009bÛ\bYb\u0005.ó\u0080ký\u007f\u007f\u008a\u0082wÉ¶n>Í\u009bB$\u0086ÉxÎq'/+£vâÐ\u0082m\u0084^<\u0007rÞ_°'EÉaw\u0006\u001b¡\u001f\u0092ÏòV\u0081Û]±\u008flc\u001b\u008d«P\r\u0095\u009foF>\u0088§Q´Oî`Ú\u0084\u0080Ì¦P¦8j(ë\u0017êÁÉ\u0013\u0090×Ï\u008bT\u0096w4n\u009c\u0096\u001eZÏæÄÝ9\u0001\u0003¢\u0005/ÿr ôbÇ¶t©3|§ËU\u0003~3\u009d\u0095¿.\u0087©\u0098\u001a\u0005ä¾w¡²\u0004Xn\t¢£³µ.\u001a;¸»\u0000\u0087\"\u0000\u000eEð±Ú¢JRUáÛ2Hx\u0092ÎX½\u0010TëdàÈ\u0093\\w\u0010Çáô¦e?\\\t¨ó¤\u0000\u0093îkùíä%`QØ÷*\u008fn»\u009e>×0áö\u001fÌ×\u0005H\u009a\u001dn_^\u0086\u0013$EaSï\u0087Ê\u009båHu)B¨\u0085.ô©Ò\u0001¥¥¸¿Ójï)*6QÄ/'\u008a?MRyÆ¤ýSwj\tä¹ \u008dy¨e\u0082\u009e\u009c²Q\u000fúSÍ\u008b\t`Å\u0015\u0084ìÌ>Fæ\u0082Ì²\u001e/Ë¢U\u009bnhj²¸þLy[ýXúêúa\u0015g=½Èl!\u008e¿qL÷ÚF2Â¸KW¦T¥\u0019±\u001f:\f¬:rt\u000fïðyXA\u000e\u0092Ä¬~'\u0004r,|l²\u008eµøÜXRrNël»ó÷ M_JJ(3&XÅØºÂ{ÖP\u0082LÊ²¢+\u001a²ÿ1-\u0000¡xÙÆL¸)WÌh4°\u0015\u008eR\u008aMàP\u001dÐ\u0017,¿\u0084¶\f®¼¹àA\u0081y\u0019\u001a©¥«6º\u0090w¦\u0097+yòdúJ\u0012:\u0007¹Ó\\ìJå\u0019¶Þ;^Ý³?$è\u0016>\u0085\u0000É\u008c0Ç¼opÔÐ\u001dÃyû\u0090\u0015p®¾\u0096õ2±Ü¼o/&K²[ç K\u0019\u001b¥ô|y4Ô¡\u0013ÂbL,ã|K¥\u0004Ár @3\u008br\u0088ÌhrîF\u008eh±åÃVÌ*³ô\u0094\u0084|éR\u0010ð\nÑÐÿ½Î\u009fT\tPï,]§n\u001a\u0085\u0013´ãØ\u000b¶Ð(\u0011q\u009e\u0083[Ú\u000e3wÎ\u0011R<ù\u008avÐL\u009fÅJ6\u0015}\rÙ@Îñ}0IE&\u0012J\u0094êÃ<Hà\u0011\u0087\u0091\\®r\u0081ëSðÑF´Î\u0010ÖBì\u000e¨*\u008aÆM\u009e\u0091Õ\u0098V%w½\u008bwN\u0086xO\u009f\u0083ÿ´À{\u008aZäQ¤zÝ~ \u0002dªÖiØ\u008b¤w4mw¼h*íùrÀþþZ{\u001f\u009cét÷W\u009c\u0083bEPóâ\u001cá\u008d+¿8\u0017A4¯\u0085´ÐU$m¢\u0014\u0012Ã¦.f\u0001\b1qö]\nU\u0011½zFîûìDn·=k¬$\u0002\u0004ß\u0016¦k¾k2\u0000\u001d,\b4\\\u0017'iË\u00033ÀgÉ\u0091ç\u0083K\u00101Oav\u009bfî \n\u00131\u009e$`½À\u00125\\'âf\"\rßþg\u001c/YûÈ+@¾;µ²æýeAË$F \u0017\u001b6öþè\u009c\u008b\u0013¼\u009bÊ½\u0084ÓØ\u008fº\u001a\u009cðù`uüîqkÀÃ\t¶\u0083gÆ\u0093\u0001.!\u009fu)[05çZ\rß\u000f¢ëûÎ¾\u001b©\u008aÎ\u009e<bï=Ó=é¾=\u008bù¯*6\u00811£Hv[\u008f\f\u008d\u0018\u0005ýdR}N\u008d\u001d\u0088ûYç1j¾\u001aeÀGV½'×cøx\u001f³ýÿpþo\u000f\u0086'ÏN}\u001c&Ä)\u0012\u008b´ Î\u0017ôr#i\u0083Ëô¡p^DÂ6ÂJ"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IIl = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IIl[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[3];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III(-776098340, var23 ^ -202152668)).length();
      int var1 = ll(11789689, var23 ^ 1089993383);
      int var0 = -1;

      while (true) {
         char[] var10002;
         label85: {
            int var28 = ll(11789690, var23 ^ 1165006301);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var34 = var28;
            var10002 = var10003;
            int var29 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var28;
               var10006 = var6;
            } else {
               var34 = var28;
               var29 = var10004;
               if (var10004 <= var6) {
                  break label85;
               }

               var10005 = var10003;
               var10004 = var28;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % ll(11789691, var23 ^ -679451847)) {
                  case 0 -> ll(11789668, var23 ^ 2009176520);
                  case 1 -> ll(11789669, var23 ^ -1639199710);
                  case 2 -> ll(11789670, var23 ^ 859554844);
                  case 3 -> ll(11789671, var23 ^ -1350854914);
                  case 4 -> ll(11789664, var23 ^ -787730746);
                  case 5 -> ll(11789665, var23 ^ 436190045);
                  default -> ll(11789666, var23 ^ 2058954430);
               });
               var6++;
               if (var34 == 0) {
                  var10006 = var34;
                  var10005 = var10002;
                  var10004 = var34;
               } else {
                  if (var29 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var34;
                  var10006 = var6;
               }
            }
         }

         String var36 = new String(var10002).intern();
         byte var31 = -1;
         var5[var3++] = var36;
         if ((var0 += var1) >= var4) {
            I = var5;
            lI = new String[3];
            Il = new String[3];
            II();
            ll = new lllIIIl();
            II = new lllIIIl();
            l = new lllIIIl();
            III = l();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static String Il(int var0, int var1) {
      int var9 = 908886362;
      int var2 = (var0 ^ ll(11789439, var9 ^ 1969912103)) & ll(11789432, var9 ^ -392585677);
      if (lI[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & ll(11789433, var9 ^ 863353856)) {
            case 0 -> ll(11789434, var9 ^ -1005251191);
            case 1 -> ll(11789435, var9 ^ -589220797);
            case 2 -> ll(11789412, var9 ^ -339623670);
            case 3 -> ll(11789413, var9 ^ 1792590907);
            case 4 -> ll(11789414, var9 ^ 971054431);
            case 5 -> ll(11789415, var9 ^ 1304075438);
            case 6 -> ll(11789408, var9 ^ 1550006657);
            case 7 -> ll(11789409, var9 ^ -1662388421);
            case 8 -> ll(11789410, var9 ^ 1091555890);
            case 9 -> ll(11789411, var9 ^ -1649492151);
            case 10 -> ll(11789420, var9 ^ -960950034);
            case 11 -> ll(11789421, var9 ^ 1067791634);
            case 12 -> ll(11789422, var9 ^ -534215685);
            case 13 -> ll(11789423, var9 ^ 2008185526);
            case 14 -> ll(11789416, var9 ^ 1360566564);
            case 15 -> ll(11789417, var9 ^ -2104203395);
            case 16 -> ll(11789418, var9 ^ -40054468);
            case 17 -> ll(11789419, var9 ^ 299226493);
            case 18 -> ll(11789396, var9 ^ 1037016686);
            case 19 -> ll(11789397, var9 ^ 119892446);
            case 20 -> ll(11789398, var9 ^ 1354807862);
            case 21 -> ll(11789399, var9 ^ -1657038204);
            case 22 -> ll(11789392, var9 ^ -72014466);
            case 23 -> ll(11789393, var9 ^ 221595566);
            case 24 -> ll(11789394, var9 ^ 1487851859);
            case 25 -> ll(11789395, var9 ^ 149750553);
            case 26 -> ll(11789404, var9 ^ 1618597679);
            case 27 -> ll(11789405, var9 ^ 694862752);
            case 28 -> ll(11789406, var9 ^ -832277204);
            case 29 -> ll(11789407, var9 ^ 1684452264);
            case 30 -> ll(11789400, var9 ^ 1920894786);
            case 31 -> ll(11789401, var9 ^ 970297516);
            case 32 -> ll(11789402, var9 ^ 778000180);
            case 33 -> ll(11789403, var9 ^ 523345077);
            case 34 -> ll(11789380, var9 ^ -1286780855);
            case 35 -> ll(11789381, var9 ^ 1199648832);
            case 36 -> ll(11789382, var9 ^ 1744951631);
            case 37 -> ll(11789383, var9 ^ 1820053146);
            case 38 -> ll(11789376, var9 ^ -188772721);
            case 39 -> ll(11789377, var9 ^ 1267041767);
            case 40 -> ll(11789378, var9 ^ 1639044954);
            case 41 -> ll(11789379, var9 ^ -1154080375);
            case 42 -> ll(11789388, var9 ^ 2085166171);
            case 43 -> ll(11789389, var9 ^ -2137442072);
            case 44 -> ll(11789390, var9 ^ 489467598);
            case 45 -> ll(11789391, var9 ^ -690461534);
            case 46 -> ll(11789384, var9 ^ -1262609526);
            case 47 -> ll(11789385, var9 ^ 1282837790);
            case 48 -> ll(11789386, var9 ^ 1366077780);
            case 49 -> ll(11789387, var9 ^ 1710161029);
            case 50 -> ll(11789364, var9 ^ 139110986);
            case 51 -> ll(11789365, var9 ^ 663032080);
            case 52 -> ll(11789366, var9 ^ -598168534);
            case 53 -> ll(11789367, var9 ^ 1708171315);
            case 54 -> ll(11789360, var9 ^ 2137799398);
            case 55 -> ll(11789361, var9 ^ 1907288292);
            case 56 -> ll(11789362, var9 ^ -1521921513);
            case 57 -> ll(11789363, var9 ^ 705348444);
            case 58 -> ll(11789372, var9 ^ 932416161);
            case 59 -> ll(11789373, var9 ^ 659949916);
            case 60 -> ll(11789374, var9 ^ -1802504103);
            case 61 -> ll(11789375, var9 ^ -323523022);
            case 62 -> ll(11789368, var9 ^ -1207243677);
            case 63 -> ll(11789369, var9 ^ 450118909);
            case 64 -> ll(11789370, var9 ^ -686244629);
            case 65 -> ll(11789371, var9 ^ -335187203);
            case 66 -> ll(11789348, var9 ^ -1844495254);
            case 67 -> ll(11789349, var9 ^ 775155614);
            case 68 -> 1;
            case 69 -> ll(11789350, var9 ^ -259677188);
            case 70 -> ll(11789351, var9 ^ 1094461491);
            case 71 -> ll(11789344, var9 ^ -1980443187);
            case 72 -> ll(11789345, var9 ^ 2057536299);
            case 73 -> ll(11789346, var9 ^ 297027187);
            case 74 -> ll(11789347, var9 ^ 1825528903);
            case 75 -> ll(11789356, var9 ^ 738500404);
            case 76 -> ll(11789357, var9 ^ -468823835);
            case 77 -> 2;
            case 78 -> ll(11789358, var9 ^ 1453961263);
            case 79 -> ll(11789359, var9 ^ 1361031387);
            case 80 -> ll(11789352, var9 ^ 2119089295);
            case 81 -> ll(11789353, var9 ^ -1070042521);
            case 82 -> ll(11789354, var9 ^ 1455500832);
            case 83 -> ll(11789355, var9 ^ -1144766619);
            case 84 -> ll(11789332, var9 ^ 1084640066);
            case 85 -> ll(11789333, var9 ^ -1185946231);
            case 86 -> ll(11789334, var9 ^ 142676394);
            case 87 -> ll(11789335, var9 ^ -968124960);
            case 88 -> ll(11789328, var9 ^ -678519923);
            case 89 -> ll(11789329, var9 ^ -480688067);
            case 90 -> ll(11789330, var9 ^ -2051484219);
            case 91 -> ll(11789331, var9 ^ 1988877746);
            case 92 -> ll(11789340, var9 ^ -83372922);
            case 93 -> ll(11789341, var9 ^ 957192755);
            case 94 -> ll(11789342, var9 ^ -839567652);
            case 95 -> ll(11789343, var9 ^ -574716942);
            case 96 -> ll(11789336, var9 ^ 394373825);
            case 97 -> ll(11789337, var9 ^ -2119736839);
            case 98 -> ll(11789338, var9 ^ -2102140410);
            case 99 -> ll(11789339, var9 ^ -2054550025);
            case 100 -> ll(11789316, var9 ^ 1112985969);
            case 101 -> ll(11789317, var9 ^ 1583720226);
            case 102 -> ll(11789318, var9 ^ 857522731);
            case 103 -> ll(11789319, var9 ^ 1294573911);
            case 104 -> ll(11789312, var9 ^ 676154788);
            case 105 -> ll(11789313, var9 ^ 1717176175);
            case 106 -> 5;
            case 107 -> ll(11789314, var9 ^ 1934041944);
            case 108 -> ll(11789315, var9 ^ 199554809);
            case 109 -> ll(11789324, var9 ^ 112417088);
            case 110 -> ll(11789325, var9 ^ -315640791);
            case 111 -> ll(11789326, var9 ^ 1492085355);
            case 112 -> ll(11789327, var9 ^ 59222575);
            case 113 -> ll(11789320, var9 ^ -904674133);
            case 114 -> ll(11789321, var9 ^ 765023779);
            case 115 -> ll(11789322, var9 ^ 324070218);
            case 116 -> ll(11789323, var9 ^ 1604732885);
            case 117 -> ll(11789556, var9 ^ 901983095);
            case 118 -> ll(11789557, var9 ^ 657375239);
            case 119 -> ll(11789558, var9 ^ -1114583142);
            case 120 -> ll(11789559, var9 ^ -39333010);
            case 121 -> ll(11789552, var9 ^ -574618790);
            case 122 -> ll(11789553, var9 ^ -2133183054);
            case 123 -> ll(11789554, var9 ^ -560741976);
            case 124 -> ll(11789555, var9 ^ 861090131);
            case 125 -> ll(11789564, var9 ^ -1283248972);
            case 126 -> ll(11789565, var9 ^ 1785023163);
            case 127 -> ll(11789566, var9 ^ 839600182);
            case 128 -> ll(11789567, var9 ^ -1342426073);
            case 129 -> ll(11789560, var9 ^ -77785982);
            case 130 -> ll(11789561, var9 ^ -1017972719);
            case 131 -> ll(11789562, var9 ^ -23985971);
            case 132 -> ll(11789563, var9 ^ -699485422);
            case 133 -> ll(11789540, var9 ^ -981766343);
            case 134 -> ll(11789541, var9 ^ -390045211);
            case 135 -> ll(11789542, var9 ^ 454119972);
            case 136 -> ll(11789543, var9 ^ 1173135854);
            case 137 -> ll(11789536, var9 ^ 587682591);
            case 138 -> ll(11789537, var9 ^ 1717421603);
            case 139 -> ll(11789538, var9 ^ 557230897);
            case 140 -> ll(11789539, var9 ^ 1526926892);
            case 141 -> ll(11789548, var9 ^ -85208972);
            case 142 -> ll(11789549, var9 ^ 1328325853);
            case 143 -> ll(11789550, var9 ^ 255838719);
            case 144 -> ll(11789551, var9 ^ -1131224096);
            case 145 -> ll(11789544, var9 ^ 1788589766);
            case 146 -> ll(11789545, var9 ^ -383898981);
            case 147 -> ll(11789546, var9 ^ -1554548890);
            case 148 -> ll(11789547, var9 ^ 1503701908);
            case 149 -> ll(11789524, var9 ^ -1731505246);
            case 150 -> ll(11789525, var9 ^ 1682894040);
            case 151 -> 3;
            case 152 -> ll(11789526, var9 ^ 115330380);
            case 153 -> ll(11789527, var9 ^ 1814657579);
            case 154 -> ll(11789520, var9 ^ 1393058822);
            case 155 -> ll(11789521, var9 ^ -621815302);
            case 156 -> ll(11789522, var9 ^ 1605053015);
            case 157 -> ll(11789523, var9 ^ 224646246);
            case 158 -> ll(11789532, var9 ^ 218455767);
            case 159 -> ll(11789533, var9 ^ 391839109);
            case 160 -> 0;
            case 161 -> ll(11789534, var9 ^ 690434780);
            case 162 -> ll(11789535, var9 ^ -1954571067);
            case 163 -> ll(11789528, var9 ^ -1766258494);
            case 164 -> ll(11789529, var9 ^ 1966786763);
            case 165 -> ll(11789530, var9 ^ -1037727962);
            case 166 -> ll(11789531, var9 ^ 1992030042);
            case 167 -> ll(11789508, var9 ^ 575436313);
            case 168 -> ll(11789509, var9 ^ -84366109);
            case 169 -> ll(11789510, var9 ^ -1478447463);
            case 170 -> ll(11789511, var9 ^ 1476028487);
            case 171 -> ll(11789504, var9 ^ -55524678);
            case 172 -> ll(11789505, var9 ^ 1285346958);
            case 173 -> ll(11789506, var9 ^ 769122810);
            case 174 -> ll(11789507, var9 ^ 154883226);
            case 175 -> ll(11789516, var9 ^ -1163841873);
            case 176 -> ll(11789517, var9 ^ 48677039);
            case 177 -> ll(11789518, var9 ^ -1323670125);
            case 178 -> ll(11789519, var9 ^ 917389304);
            case 179 -> ll(11789512, var9 ^ 897577667);
            case 180 -> ll(11789513, var9 ^ 1134819389);
            case 181 -> ll(11789514, var9 ^ -126204564);
            case 182 -> ll(11789515, var9 ^ 225113055);
            case 183 -> ll(11789492, var9 ^ -1892000104);
            case 184 -> ll(11789493, var9 ^ -1308897305);
            case 185 -> ll(11789494, var9 ^ -1813663730);
            case 186 -> ll(11789495, var9 ^ -181578249);
            case 187 -> ll(11789488, var9 ^ -297893820);
            case 188 -> ll(11789489, var9 ^ 1520215043);
            case 189 -> ll(11789490, var9 ^ 145071688);
            case 190 -> ll(11789491, var9 ^ 812948373);
            case 191 -> ll(11789500, var9 ^ -886348855);
            case 192 -> ll(11789501, var9 ^ 621758966);
            case 193 -> ll(11789502, var9 ^ 87451339);
            case 194 -> 4;
            case 195 -> ll(11789503, var9 ^ 2106569581);
            case 196 -> ll(11789496, var9 ^ 372478942);
            case 197 -> ll(11789497, var9 ^ 148862145);
            case 198 -> ll(11789498, var9 ^ -1014812138);
            case 199 -> ll(11789499, var9 ^ -2036737837);
            case 200 -> ll(11789476, var9 ^ -2119080981);
            case 201 -> ll(11789477, var9 ^ -486380511);
            case 202 -> ll(11789478, var9 ^ 678927057);
            case 203 -> ll(11789479, var9 ^ 985394134);
            case 204 -> ll(11789472, var9 ^ 1661637802);
            case 205 -> ll(11789473, var9 ^ -1059909805);
            case 206 -> ll(11789474, var9 ^ 1262787933);
            case 207 -> ll(11789475, var9 ^ -1346486840);
            case 208 -> ll(11789484, var9 ^ -570487985);
            case 209 -> ll(11789485, var9 ^ -641368380);
            case 210 -> ll(11789486, var9 ^ 2010802686);
            case 211 -> ll(11789487, var9 ^ 585190541);
            case 212 -> ll(11789480, var9 ^ -1030660561);
            case 213 -> ll(11789481, var9 ^ -2079892405);
            case 214 -> ll(11789482, var9 ^ -925469728);
            case 215 -> ll(11789483, var9 ^ 1542003887);
            case 216 -> ll(11789460, var9 ^ 1766683598);
            case 217 -> ll(11789461, var9 ^ 349772004);
            case 218 -> ll(11789462, var9 ^ 1407396947);
            case 219 -> ll(11789463, var9 ^ 1758228948);
            case 220 -> ll(11789456, var9 ^ 2094585981);
            case 221 -> ll(11789457, var9 ^ -1233453177);
            case 222 -> ll(11789458, var9 ^ 888875309);
            case 223 -> ll(11789459, var9 ^ 513639145);
            case 224 -> ll(11789468, var9 ^ -1848962502);
            case 225 -> ll(11789469, var9 ^ 1316306414);
            case 226 -> ll(11789470, var9 ^ -1037366357);
            case 227 -> ll(11789471, var9 ^ 600636092);
            case 228 -> ll(11789464, var9 ^ 1575405317);
            case 229 -> ll(11789465, var9 ^ 418854834);
            case 230 -> ll(11789466, var9 ^ -2078068003);
            case 231 -> ll(11789467, var9 ^ -1043288757);
            case 232 -> ll(11789444, var9 ^ -1726579464);
            case 233 -> ll(11789445, var9 ^ -1261478168);
            case 234 -> ll(11789446, var9 ^ 1760571261);
            case 235 -> ll(11789447, var9 ^ -2130475720);
            case 236 -> ll(11789440, var9 ^ 1817674543);
            case 237 -> ll(11789441, var9 ^ -1032861074);
            case 238 -> ll(11789442, var9 ^ -263126279);
            case 239 -> ll(11789443, var9 ^ -1894614977);
            case 240 -> ll(11789452, var9 ^ -2096797299);
            case 241 -> ll(11789453, var9 ^ -1087893118);
            case 242 -> ll(11789454, var9 ^ -57876901);
            case 243 -> ll(11789455, var9 ^ 2126854622);
            case 244 -> ll(11789448, var9 ^ 180503410);
            case 245 -> ll(11789449, var9 ^ 1242317432);
            case 246 -> ll(11789450, var9 ^ -1595622858);
            case 247 -> ll(11789451, var9 ^ -2077907224);
            case 248 -> ll(11789684, var9 ^ -698230990);
            case 249 -> ll(11789685, var9 ^ 1133115041);
            case 250 -> ll(11789686, var9 ^ -1395199490);
            case 251 -> ll(11789687, var9 ^ 1113645090);
            case 252 -> ll(11789680, var9 ^ 1440585874);
            case 253 -> ll(11789681, var9 ^ -593269221);
            case 254 -> ll(11789682, var9 ^ -253258544);
            default -> ll(11789683, var9 ^ 2048294253);
         };
         int var5 = (var1 & ll(11789692, var9 ^ 44405785)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(11789693, var9 ^ -149732894)) >>> ll(11789694, var9 ^ 1317119589)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(11789695, var9 ^ 439049809);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(11789688, var9 ^ -1026765213);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   public static lllIIIl lI(String var0) {
      return Enum.valueOf(lllIIIl.class, var0);
   }
}
