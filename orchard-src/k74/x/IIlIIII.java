package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIlIIII {
   Il,
   III;
   private static String[] I;
   private static final String[] IlI;
   private final IIIlIlIl l;
   private static final IIlIIII[] II;
   private static final Object[] Ill;
   private static final String[] lI;
   private static final String[] ll;
   private static final int[] IIl;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = ll(-2087344398, 1480078855 ^ 146135008) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(-2087344397, 1480078855 ^ -645345098);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 1034026068;
      int var17 = 0;
      short var18 = 806;
      int var10001 = "\u0015ꢜ熧\uf0b9뺏敚ㅗ쬡ز꺋\uf476㽰\u20c6厙쿞ȯ䢸戹乱싀᳙\udedc\u000f燛儭껟鑦埸픜쒔\uecf1\udb9fᚠ䠈螠龊趻\uf5c3".length();
      String[] var10002 = new String[2];
      int var16 = 0;
      String[] var15 = var10002;
      int var14 = var10001;
      String var13 = "\u0015ꢜ熧\uf0b9뺏敚ㅗ쬡ز꺋\uf476㽰\u20c6厙쿞ȯ䢸戹乱싀᳙\udedc\u000f燛儭껟鑦埸픜쒔\uecf1\udb9fᚠ䠈螠龊趻\uf5c3";

      do {
         char var19 = var13.charAt(var17);
         String var10000 = var13.substring(var17 + 1, var17 + 1 + var19);
         int var21 = 0;
         char[] var20 = var10000.toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 74;
               case 1 -> 194;
               case 2 -> 67;
               case 3 -> 196;
               case 4 -> 210;
            }) ^ var22;
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

      IlI = var15;
      Ill = new Object[var15.length];
      int var9 = -1555520470;
      byte[] var7 = "2êT¯^\u0092ÞÁ\u007f\u008d:\u000f\u0012ÌØÒb\u001ei{Í\u0083V×ã®~Aô\fèý«À£7§ä\u0096i¿Ù\u008b÷w\u009fgOð»\u0007È0R\u008fíPA«VãÖt\u00ad6Î~L<\u001bý\u0096\u000eyµ{Ä±õïÕÓF\u0091\u007f\u000eÄã\u0099Ð¹Ó:#aè°:ñÄ\u0017æe\r´3iÓ\u0010!èÊ\u0018mÓ\u007fÜáÈ\u0012çM÷\u009eÂË9dÚ\u008e0õæ@©9ð¿\u009a´A\bË\u00ad\u001b!\u0001\t\u0015i·è³Vèú\u0080òb¤ß]!yâùÒl·=þB9F\u008f±|»ù\u0013 ÿ\f\u009c\u0093Ý.Ù)i\u0016\u0091\u0082ÿ\\\u0098P/\u0003ì%T%<\u001c\u0000V`Hid}\u001e\u0095N\u0006B/ëZö\u001eVÇ±¦\u0018Ä\f2ø\t½¨î6û\u0083ñ¤ô\u000bÄ\u0081ÊBà¬ÿ\n\u00adªÏÌi#Z|¨Ç±\r\u009b\u0098\u0096\u0012}\u009cuåuÓ·\u008a0'»7\u0096^°zn\u0000iâ ïÑ\u008fZ\u001es \u001e\u009c±å£§\u0091¢Gz¯ï-ê^|\u0099\u0092óòE\u0001üoÔUØ\u0006%R¥zºñº¼¿\u0089àõîeû¤ï¶\u0013\u0095U¦W&KP\n\u0082pZ^,;lÈ6P\tüY?\u0017\u0007Ô¢#Å¶G\u001büëÖ¦º\u0006ä\u0095\u009cÍ³¨T|-4L\u0093\u0099\u0007\u0007¤\u0084\r{½\u001e.Ùø\u0007\u009d)qi©;\u0014k\týèö`Gz\u0011&ßw×<\u009c\u0090\u001c\u0099Ù\u001eáVIË\u009dlH¡\u0085*-ýï~\u0083\u0006FnøPV\u0095£¸\u00052T\u001câä\u0081ó¸çÏ!o£»0÷iÝâêg=úwü\t ¡öÈ\u001e\u0017È·óµ\u007fÊQ/-\u0015\u008dîî\u0018ùgÌ\u0089ÒeøÏH\u008b´£ò7Þ7®ã\u0097rÁW\u0091ÉÔí]+÷\u007fl%\"Ò\u000b©;@¡øâ\u0092z·nDÒ{ã\bò^\u0087X\u0081èÎhIq¤\u0002«&ó\u00ad,·A%\u009bW2Yæ\u009a\u0018Þ\u0013Q\u008aIÅ\u0081è\t×än\u0093\u00196,#4zî\u001fÓ~Z\u0088\u008d_ÛT\u001b&d¾T\u001dmÍ¸\u0010ç<\u00008±\u0010tMÔ\u009dLU#aÚó\u0083\fÍuÀy0i×iÇJz\u0016rR©a·\u0097¿\u0016ë`Ë¸ó\u0087+D\u001d¾\u0000\u009a\u0086R>2\b^\u00035L£#\u0012\u009a}£EFÏ·\u009bsCâ'\u0003ëI=\u0083ûR\u0085wÃ=\u0015ì$\u0086£×ÏAÍp¥Ý\u001a\u0091\f\u0006ü\u0099Zca\u0017Mg°q\u001eXN|(\u0094¿~\u0007s1Üè_\u0010´\u000fB\u00164\u009dû¡5\u008cÊ\u008aDÊ\u0080ìv\t\u0091v\u001a$!\u008aüsº\u000b#÷r\u0086\u0016^Taå\u001b\b\u001e\u009a¯\u008föa{}â4\u0099Jk\u008aÑjH\u00993\u008a\u0015\u0081âû\u000bDpb©Z\u0083ýKá;~áê(ù\u0098,¯_å°UÑ\u0087ëÎÁ\u001a\\ð\u0017¦Q\u0085Z\"·\u0015Ñ« Áìì\u0013F*óJÞØjk\u0088L~&4\u008deÜ!\u009bHÓ\u0001P¢ü\u009b\u0018z\u000e8Qé^\u00ad\u000f\u008aû\u0015WãÎ\u0088øVD×}¢\u008c?£Dò\u0080t'í\u0005T\u000e\u001e·Û<²×\u009b\u008eÔ=Ïüvq\"Òò(j'\u0007´âE\u008b°\u0081Å?mÛ-\u0095?/{ÁQ¾Ò±Õ\u008b\u0017_ÂFJT!\u00813\u0096\u009aõ\u0098R\u0004®ÙM\u0016DcÔófe#&÷\r=\u0013ê¹{\u009f\u0018ò\u009f\u0018²=G\u0006Cw1%({mÓl°}§\u00042\tó\u008d\u0007\u0087nc¦\u008c\u0017y`ÉÑ¢\u0087ãx¯ó\u000e\u001fâÓ]§\u0015´¼\u0083^\u0016h\nÀãx\u0006ãcßeÓ\u0084o\u008e\u0007\u000esn\u008eÏC\u008e\u000b)\u001fþ\u0017Zå¥\u001d\u000es\fÀ\u0014¿\u0080îoî[ôu\u001f¦ì6\u0012ëE¤»ì«OÝ\u008ae\u0014º¥Iº\u0095§\u009f:\"I\u001c¯ï7D²Ó¾Ý\u0018\u007f¯Å)ãåLà\u0015"
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

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III(-277463991, var23 ^ 816756167)).length();
      int var1 = ll(-2087344400, var23 ^ -1659962061);
      int var25 = -1;

      label95:
      while (true) {
         int var29 = ll(-2087344399, var23 ^ -263249990);
         String var31 = var2.substring(++var25, var25 + var1);
         byte var38 = -1;

         while (true) {
            label90: {
               char[] var47 = var31.toCharArray();
               int var10004 = var47.length;
               int var6 = 0;
               int var50 = var29;
               var43 = var47;
               var10001 = var10004;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var47;
                  var10004 = var29;
                  var10006 = var6;
               } else {
                  var50 = var29;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label90;
                  }

                  var59 = var47;
                  var10004 = var29;
                  var10006 = var6;
               }

               while (true) {
                  var59[var10006] = (char)(var59[var10006] ^ var10004 ^ switch (var6 % ll(-2087344396, var23 ^ 19773818)) {
                     case 0 -> ll(-2087344395, var23 ^ 378482627);
                     case 1 -> 3;
                     case 2 -> ll(-2087344390, var23 ^ 1229153357);
                     case 3 -> ll(-2087344389, var23 ^ 1164398929);
                     case 4 -> ll(-2087344392, var23 ^ 1566198955);
                     case 5 -> ll(-2087344391, var23 ^ -1793285173);
                     default -> ll(-2087344386, var23 ^ 305709915);
                  });
                  var6++;
                  if (var50 == 0) {
                     var10006 = var50;
                     var59 = var43;
                     var10004 = var50;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var59 = var43;
                     var10004 = var50;
                     var10006 = var6;
                  }
               }
            }

            String var52 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var5[var3++] = var52;
                  if ((var25 += var1) >= var4) {
                     ll = var5;
                     lI = new String[4];
                     I = new String[4];
                     lI();
                     III = new IIlIIII(IlIIllIII.lI(I[2]));
                     Il = new IIlIIII(IlIIllIII.lI(I[1]));
                     II = Il();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var52;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label95;
                  }

                  var4 = (var2 = III(-277463992, var23 ^ 1788646225)).length();
                  var1 = ll(-2087344394, var23 ^ -2137149885);
                  var25 = -1;
            }

            var29 = ll(-2087344393, var23 ^ 788566438);
            var31 = var2.substring(++var25, var25 + var1);
            var38 = 0;
         }
      }
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private IIlIIII(String var3) {
      this.l = IlIIllIII.lII(var3);
   }

   public static IIlIIII l(String var0) {
      return Enum.valueOf(IIlIIII.class, var0);
   }

   private static int ll(int var0, int var1) {
      int var2 = IIl[var0 ^ -2087344398] ^ var1 ^ var0;
      var2 -= 17026;
      var2 -= 39472;
      var2 -= 279;
      var2 -= 37389;
      var2 += 13629;
      var2 += 63667;
      var2 += 36186;
      var2 += 33766;
      return var2 - 2308;
   }

   private static String II(int var0, int var1) {
      int var9 = -1914421926;
      int var2 = (var0 ^ ll(-2087344385, var9 ^ 1653877526)) & ll(-2087344388, var9 ^ -42422925);
      if (lI[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & ll(-2087344387, var9 ^ -1324322423)) {
            case 0 -> ll(-2087344414, var9 ^ 1678276644);
            case 1 -> ll(-2087344413, var9 ^ 1860041706);
            case 2 -> ll(-2087344416, var9 ^ 1556067103);
            case 3 -> ll(-2087344415, var9 ^ -1770524658);
            case 4 -> ll(-2087344410, var9 ^ -2028650259);
            case 5 -> ll(-2087344409, var9 ^ 768131391);
            case 6 -> ll(-2087344412, var9 ^ -887702316);
            case 7 -> ll(-2087344411, var9 ^ 1759864743);
            case 8 -> ll(-2087344406, var9 ^ -486738909);
            case 9 -> ll(-2087344405, var9 ^ 1159749883);
            case 10 -> 3;
            case 11 -> ll(-2087344408, var9 ^ -420123555);
            case 12 -> ll(-2087344407, var9 ^ 1122495765);
            case 13 -> ll(-2087344402, var9 ^ 1252775659);
            case 14 -> ll(-2087344401, var9 ^ -1909993915);
            case 15 -> ll(-2087344404, var9 ^ -1249119600);
            case 16 -> ll(-2087344403, var9 ^ -1878180613);
            case 17 -> ll(-2087344430, var9 ^ -2008533273);
            case 18 -> ll(-2087344429, var9 ^ -1266242431);
            case 19 -> ll(-2087344432, var9 ^ -1569088317);
            case 20 -> ll(-2087344431, var9 ^ 332320192);
            case 21 -> ll(-2087344426, var9 ^ 1239877396);
            case 22 -> ll(-2087344425, var9 ^ 1202696598);
            case 23 -> ll(-2087344428, var9 ^ -510595823);
            case 24 -> ll(-2087344427, var9 ^ -768317681);
            case 25 -> ll(-2087344422, var9 ^ -1919211748);
            case 26 -> ll(-2087344421, var9 ^ -1337993326);
            case 27 -> ll(-2087344424, var9 ^ -436471755);
            case 28 -> ll(-2087344423, var9 ^ 1803586146);
            case 29 -> ll(-2087344418, var9 ^ 780008474);
            case 30 -> ll(-2087344417, var9 ^ -231143105);
            case 31 -> ll(-2087344420, var9 ^ -1055184069);
            case 32 -> ll(-2087344419, var9 ^ 2075070593);
            case 33 -> ll(-2087344446, var9 ^ -801547968);
            case 34 -> ll(-2087344445, var9 ^ 48825864);
            case 35 -> ll(-2087344448, var9 ^ 2006065395);
            case 36 -> ll(-2087344447, var9 ^ 1321619503);
            case 37 -> ll(-2087344442, var9 ^ 447701453);
            case 38 -> ll(-2087344441, var9 ^ 1280527144);
            case 39 -> ll(-2087344444, var9 ^ 283766374);
            case 40 -> ll(-2087344443, var9 ^ -1529326601);
            case 41 -> ll(-2087344438, var9 ^ -480240306);
            case 42 -> ll(-2087344437, var9 ^ 1593114007);
            case 43 -> ll(-2087344440, var9 ^ -277943538);
            case 44 -> ll(-2087344439, var9 ^ -1455033259);
            case 45 -> ll(-2087344434, var9 ^ -1496465146);
            case 46 -> ll(-2087344433, var9 ^ -1736120662);
            case 47 -> ll(-2087344436, var9 ^ -1379096505);
            case 48 -> ll(-2087344435, var9 ^ -1660261194);
            case 49 -> ll(-2087344462, var9 ^ 146451753);
            case 50 -> ll(-2087344461, var9 ^ -473194886);
            case 51 -> ll(-2087344464, var9 ^ -992708561);
            case 52 -> ll(-2087344463, var9 ^ 656633992);
            case 53 -> ll(-2087344458, var9 ^ -447990252);
            case 54 -> ll(-2087344457, var9 ^ -370044145);
            case 55 -> ll(-2087344460, var9 ^ -490969057);
            case 56 -> ll(-2087344459, var9 ^ 992225007);
            case 57 -> ll(-2087344454, var9 ^ -2092344283);
            case 58 -> ll(-2087344453, var9 ^ 560339169);
            case 59 -> ll(-2087344456, var9 ^ -484202974);
            case 60 -> ll(-2087344455, var9 ^ -1016839518);
            case 61 -> ll(-2087344450, var9 ^ -47633513);
            case 62 -> ll(-2087344449, var9 ^ 213556233);
            case 63 -> ll(-2087344452, var9 ^ -1590410480);
            case 64 -> ll(-2087344451, var9 ^ -1364602479);
            case 65 -> ll(-2087344478, var9 ^ -1967120249);
            case 66 -> ll(-2087344477, var9 ^ -138625177);
            case 67 -> ll(-2087344480, var9 ^ -394610296);
            case 68 -> ll(-2087344479, var9 ^ -1305220193);
            case 69 -> ll(-2087344474, var9 ^ -1453135488);
            case 70 -> ll(-2087344473, var9 ^ 1095979112);
            case 71 -> ll(-2087344476, var9 ^ 98585940);
            case 72 -> ll(-2087344475, var9 ^ 1480881453);
            case 73 -> ll(-2087344470, var9 ^ 216678030);
            case 74 -> ll(-2087344469, var9 ^ -1695525461);
            case 75 -> ll(-2087344472, var9 ^ -1365296855);
            case 76 -> ll(-2087344471, var9 ^ 1427285945);
            case 77 -> ll(-2087344466, var9 ^ -1754250525);
            case 78 -> ll(-2087344465, var9 ^ -1372729190);
            case 79 -> ll(-2087344468, var9 ^ -390012638);
            case 80 -> ll(-2087344467, var9 ^ -838093079);
            case 81 -> ll(-2087344494, var9 ^ 112863298);
            case 82 -> ll(-2087344493, var9 ^ 508927786);
            case 83 -> ll(-2087344496, var9 ^ 1432519210);
            case 84 -> ll(-2087344495, var9 ^ 695932954);
            case 85 -> 5;
            case 86 -> ll(-2087344490, var9 ^ -1958870275);
            case 87 -> ll(-2087344489, var9 ^ 2075619204);
            case 88 -> ll(-2087344492, var9 ^ 1775398173);
            case 89 -> ll(-2087344491, var9 ^ -1355877447);
            case 90 -> ll(-2087344486, var9 ^ 364647496);
            case 91 -> ll(-2087344485, var9 ^ -1917726032);
            case 92 -> ll(-2087344488, var9 ^ -833218223);
            case 93 -> ll(-2087344487, var9 ^ -1948719953);
            case 94 -> 0;
            case 95 -> ll(-2087344482, var9 ^ 453875730);
            case 96 -> ll(-2087344481, var9 ^ 442990777);
            case 97 -> ll(-2087344484, var9 ^ 2134632799);
            case 98 -> ll(-2087344483, var9 ^ -775929056);
            case 99 -> ll(-2087344510, var9 ^ -1432989565);
            case 100 -> ll(-2087344509, var9 ^ -243400449);
            case 101 -> ll(-2087344512, var9 ^ 115009378);
            case 102 -> ll(-2087344511, var9 ^ -751452924);
            case 103 -> ll(-2087344506, var9 ^ -1645778418);
            case 104 -> ll(-2087344505, var9 ^ -369691919);
            case 105 -> ll(-2087344508, var9 ^ -1893405590);
            case 106 -> ll(-2087344507, var9 ^ 1866232417);
            case 107 -> ll(-2087344502, var9 ^ 1533453371);
            case 108 -> ll(-2087344501, var9 ^ -1697115482);
            case 109 -> ll(-2087344504, var9 ^ -449465478);
            case 110 -> ll(-2087344503, var9 ^ -1734923639);
            case 111 -> ll(-2087344498, var9 ^ 1196157854);
            case 112 -> ll(-2087344497, var9 ^ 1245667809);
            case 113 -> ll(-2087344500, var9 ^ -619420689);
            case 114 -> ll(-2087344499, var9 ^ -1651601844);
            case 115 -> ll(-2087344526, var9 ^ -248237719);
            case 116 -> ll(-2087344525, var9 ^ 1701373644);
            case 117 -> ll(-2087344528, var9 ^ 537350509);
            case 118 -> ll(-2087344527, var9 ^ -1693259553);
            case 119 -> ll(-2087344522, var9 ^ 2033285680);
            case 120 -> ll(-2087344521, var9 ^ 2011486103);
            case 121 -> ll(-2087344524, var9 ^ -67287803);
            case 122 -> ll(-2087344523, var9 ^ -1440442381);
            case 123 -> ll(-2087344518, var9 ^ -441957924);
            case 124 -> ll(-2087344517, var9 ^ 690294152);
            case 125 -> ll(-2087344520, var9 ^ 205610390);
            case 126 -> ll(-2087344519, var9 ^ -1173852856);
            case 127 -> ll(-2087344514, var9 ^ 593627130);
            case 128 -> 2;
            case 129 -> ll(-2087344513, var9 ^ 1949673516);
            case 130 -> ll(-2087344516, var9 ^ -444128398);
            case 131 -> ll(-2087344515, var9 ^ 99900616);
            case 132 -> ll(-2087344542, var9 ^ -924918937);
            case 133 -> ll(-2087344541, var9 ^ 55331924);
            case 134 -> ll(-2087344544, var9 ^ -751956813);
            case 135 -> ll(-2087344543, var9 ^ -1230465431);
            case 136 -> ll(-2087344538, var9 ^ 1693066812);
            case 137 -> ll(-2087344537, var9 ^ 673716826);
            case 138 -> ll(-2087344540, var9 ^ 748457347);
            case 139 -> ll(-2087344539, var9 ^ 220025166);
            case 140 -> ll(-2087344534, var9 ^ 1956821859);
            case 141 -> ll(-2087344533, var9 ^ 1336658145);
            case 142 -> ll(-2087344536, var9 ^ 1109473628);
            case 143 -> ll(-2087344535, var9 ^ 1786189284);
            case 144 -> ll(-2087344530, var9 ^ 521312297);
            case 145 -> ll(-2087344529, var9 ^ 132474009);
            case 146 -> ll(-2087344532, var9 ^ -1589310961);
            case 147 -> ll(-2087344531, var9 ^ 654737344);
            case 148 -> ll(-2087344558, var9 ^ 990998318);
            case 149 -> ll(-2087344557, var9 ^ 414978214);
            case 150 -> ll(-2087344560, var9 ^ 7300289);
            case 151 -> ll(-2087344559, var9 ^ -981920796);
            case 152 -> ll(-2087344554, var9 ^ 839761390);
            case 153 -> ll(-2087344553, var9 ^ -705871226);
            case 154 -> ll(-2087344556, var9 ^ -322528240);
            case 155 -> ll(-2087344555, var9 ^ 16266479);
            case 156 -> ll(-2087344550, var9 ^ 214249723);
            case 157 -> ll(-2087344549, var9 ^ -236644473);
            case 158 -> ll(-2087344552, var9 ^ 795164743);
            case 159 -> ll(-2087344551, var9 ^ -1653498459);
            case 160 -> 1;
            case 161 -> ll(-2087344546, var9 ^ 287580788);
            case 162 -> ll(-2087344545, var9 ^ -1181796123);
            case 163 -> ll(-2087344548, var9 ^ -1449885443);
            case 164 -> ll(-2087344547, var9 ^ -1845817127);
            case 165 -> ll(-2087344574, var9 ^ 1983948410);
            case 166 -> ll(-2087344573, var9 ^ -1652044894);
            case 167 -> ll(-2087344576, var9 ^ -149217479);
            case 168 -> ll(-2087344575, var9 ^ 1589705113);
            case 169 -> ll(-2087344570, var9 ^ 145056901);
            case 170 -> ll(-2087344569, var9 ^ 530691445);
            case 171 -> ll(-2087344572, var9 ^ 1285441712);
            case 172 -> ll(-2087344571, var9 ^ 2052241794);
            case 173 -> ll(-2087344566, var9 ^ 1437938797);
            case 174 -> ll(-2087344565, var9 ^ -1164372383);
            case 175 -> ll(-2087344568, var9 ^ 1568936808);
            case 176 -> 4;
            case 177 -> ll(-2087344567, var9 ^ -818043853);
            case 178 -> ll(-2087344562, var9 ^ -569602268);
            case 179 -> ll(-2087344561, var9 ^ -1740183074);
            case 180 -> ll(-2087344564, var9 ^ 1532457781);
            case 181 -> ll(-2087344563, var9 ^ 1994886262);
            case 182 -> ll(-2087344590, var9 ^ 561778196);
            case 183 -> ll(-2087344589, var9 ^ -1514897260);
            case 184 -> ll(-2087344592, var9 ^ 210920484);
            case 185 -> ll(-2087344591, var9 ^ 1238244283);
            case 186 -> ll(-2087344586, var9 ^ -45485216);
            case 187 -> ll(-2087344585, var9 ^ 700180476);
            case 188 -> ll(-2087344588, var9 ^ -879989466);
            case 189 -> ll(-2087344587, var9 ^ -2085859946);
            case 190 -> ll(-2087344582, var9 ^ 1632374860);
            case 191 -> ll(-2087344581, var9 ^ -1338175908);
            case 192 -> ll(-2087344584, var9 ^ 581217376);
            case 193 -> ll(-2087344583, var9 ^ -784642526);
            case 194 -> ll(-2087344578, var9 ^ 1773724806);
            case 195 -> ll(-2087344577, var9 ^ 2050989341);
            case 196 -> ll(-2087344580, var9 ^ -40247120);
            case 197 -> ll(-2087344579, var9 ^ 118981327);
            case 198 -> ll(-2087344606, var9 ^ -1677255427);
            case 199 -> ll(-2087344605, var9 ^ -1563319381);
            case 200 -> ll(-2087344608, var9 ^ -677632046);
            case 201 -> ll(-2087344607, var9 ^ 1192734356);
            case 202 -> ll(-2087344602, var9 ^ -1825904271);
            case 203 -> ll(-2087344601, var9 ^ 351073698);
            case 204 -> ll(-2087344604, var9 ^ -1944162497);
            case 205 -> ll(-2087344603, var9 ^ -628458674);
            case 206 -> ll(-2087344598, var9 ^ 1716216626);
            case 207 -> ll(-2087344597, var9 ^ 1935494616);
            case 208 -> ll(-2087344600, var9 ^ 1402382238);
            case 209 -> ll(-2087344599, var9 ^ -908165911);
            case 210 -> ll(-2087344594, var9 ^ 1788342193);
            case 211 -> ll(-2087344593, var9 ^ -3568516);
            case 212 -> ll(-2087344596, var9 ^ 1200744128);
            case 213 -> ll(-2087344595, var9 ^ -633449674);
            case 214 -> ll(-2087344622, var9 ^ -2051299454);
            case 215 -> ll(-2087344621, var9 ^ 1835352377);
            case 216 -> ll(-2087344624, var9 ^ -760077796);
            case 217 -> ll(-2087344623, var9 ^ 1469188872);
            case 218 -> ll(-2087344618, var9 ^ -451069384);
            case 219 -> ll(-2087344617, var9 ^ -2057467789);
            case 220 -> ll(-2087344620, var9 ^ 1862924597);
            case 221 -> ll(-2087344619, var9 ^ 602199858);
            case 222 -> ll(-2087344614, var9 ^ 2058101169);
            case 223 -> ll(-2087344613, var9 ^ -433831740);
            case 224 -> ll(-2087344616, var9 ^ -498614188);
            case 225 -> ll(-2087344615, var9 ^ 1058876187);
            case 226 -> ll(-2087344610, var9 ^ 1844018537);
            case 227 -> ll(-2087344609, var9 ^ 58250277);
            case 228 -> ll(-2087344612, var9 ^ -2024992218);
            case 229 -> ll(-2087344611, var9 ^ -1870639999);
            case 230 -> ll(-2087344638, var9 ^ 1934046825);
            case 231 -> ll(-2087344637, var9 ^ -936141472);
            case 232 -> ll(-2087344640, var9 ^ 1449712673);
            case 233 -> ll(-2087344639, var9 ^ 1149396484);
            case 234 -> ll(-2087344634, var9 ^ -1583325112);
            case 235 -> ll(-2087344633, var9 ^ 1949370462);
            case 236 -> ll(-2087344636, var9 ^ 1093451737);
            case 237 -> ll(-2087344635, var9 ^ -841025660);
            case 238 -> ll(-2087344630, var9 ^ 1249131476);
            case 239 -> ll(-2087344629, var9 ^ 1418031657);
            case 240 -> ll(-2087344632, var9 ^ 2012118567);
            case 241 -> ll(-2087344631, var9 ^ -2119518930);
            case 242 -> ll(-2087344626, var9 ^ -171821931);
            case 243 -> ll(-2087344625, var9 ^ -1588920050);
            case 244 -> ll(-2087344628, var9 ^ 1017488369);
            case 245 -> ll(-2087344627, var9 ^ 1170171495);
            case 246 -> ll(-2087344142, var9 ^ -2090564758);
            case 247 -> ll(-2087344141, var9 ^ 711586894);
            case 248 -> ll(-2087344144, var9 ^ 1294259225);
            case 249 -> ll(-2087344143, var9 ^ -170675249);
            case 250 -> ll(-2087344138, var9 ^ -778562845);
            case 251 -> ll(-2087344137, var9 ^ 1476847495);
            case 252 -> ll(-2087344140, var9 ^ 1411736719);
            case 253 -> ll(-2087344139, var9 ^ 924156157);
            case 254 -> ll(-2087344134, var9 ^ -591328613);
            default -> ll(-2087344133, var9 ^ 1011402866);
         };
         int var5 = (var1 & ll(-2087344136, var9 ^ -590533314)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(-2087344135, var9 ^ 1395547589)) >>> ll(-2087344130, var9 ^ -136640177)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(-2087344129, var9 ^ 1577455769);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(-2087344132, var9 ^ -769102901);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   private static IIlIIII[] Il() {
      return new IIlIIII[]{III, Il};
   }

   private static String III(int var0, int var1) {
      int var3 = var0 ^ -277463991;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -468035780;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 39;
            case 1 -> 201;
            case 2 -> 227;
            case 3 -> 134;
            case 4 -> 130;
            case 5 -> 122;
            case 6 -> 71;
            case 7 -> 191;
            case 8 -> 247;
            case 9 -> 121;
            case 10 -> 54;
            case 11 -> 119;
            case 12 -> 253;
            case 13 -> 192;
            case 14 -> 97;
            case 15 -> 101;
            case 16 -> 132;
            case 17 -> 59;
            case 18 -> 170;
            case 19 -> 34;
            case 20 -> 192;
            case 21 -> 73;
            case 22 -> 51;
            case 23 -> 253;
            case 24 -> 113;
            case 25 -> 112;
            case 26 -> 234;
            case 27 -> 226;
            case 28 -> 150;
            case 29 -> 79;
            case 30 -> 252;
            case 31 -> 185;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static void lI() {
      int var0 = -1480138228;
      I[0] = I(II(ll(-2087344131, var0 ^ 588255158), ll(-2087344158, var0 ^ -569833183)).toCharArray(), 42299L, ll(-2087344157, var0 ^ -1527513847));
      I[1] = I(II(ll(-2087344160, var0 ^ -1806748306), ll(-2087344159, var0 ^ -226472797)).toCharArray(), 55758L, ll(-2087344154, var0 ^ -175085336));
      I[2] = I(II(ll(-2087344153, var0 ^ -545570672), ll(-2087344156, var0 ^ 838387307)).toCharArray(), 86413L, ll(-2087344155, var0 ^ -1059801306));
      I[3] = I(II(ll(-2087344150, var0 ^ -969317689), ll(-2087344149, var0 ^ -685652440)).toCharArray(), 83819L, ll(-2087344152, var0 ^ -895320047));
   }
}
