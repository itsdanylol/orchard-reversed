package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIIlIIIll {
   I,
   l,
   Il,
   lI,
   IlI;
   private static final Object[] lIl;
   private static final String[] lII;
   private static final int[] Ill;
   private static String[] II;
   private static final String[] ll;
   private static final String[] III;
   private static final IIIlIIIll[] IIl;

   private static String III(char var0, int var1, char var2) {
      int var3 = var2 ^ 18159;
      char[] var4 = lII[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 28421;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '耂';
         var10 += 5339;
         var10 -= 8173;
         var10 -= 34145;
         var10 ^= 56975;
         var10 -= 19260;
         var10 -= 34753;
         var10 ^= 7638;
         var10 -= 40240;
         var10 += 37066;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static String I(char[] var0, long var1, int var3) {
      int var4 = ll(678787357, 2129961694 ^ 369510904) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(678787356, 2129961694 ^ -658372899);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static IIIlIIIll[] l() {
      return new IIIlIIIll[]{Il, IlI, I, l, lI};
   }

   public static IIIlIIIll II(String var0) {
      return Enum.valueOf(IIIlIIIll.class, var0);
   }

   private static int ll(int var0, int var1) {
      int var2 = Ill[var0 ^ 678787357] ^ var1 ^ var0;
      var2 -= 278;
      var2 -= 27136;
      var2 -= 33184;
      var2 += 57713;
      var2 ^= 64383;
      var2 ^= 55278;
      var2 -= 6836;
      var2 -= 17819;
      var2 += 58860;
      return var2 - 60981;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 401649967;
      String[] var9 = new String[2];
      short var12 = 25973;
      int var10001 = "\u0019ۘ\uece2ྚ년麸㘼씜䋷焗嶀ㅨ칲Ⓣ삺\udb81䞱\ue4a2츂뎉즌芥玛哴\udbe2\uf59c\u000b䮮鬈쁬☎栜ᾐŔ硲ꗓ㴊헼".length();
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\u0019ۘ\uece2ྚ년麸㘼씜䋷焗嶀ㅨ칲Ⓣ삺\udb81䞱\ue4a2츂뎉즌芥玛哴\udbe2\uf59c\u000b䮮鬈쁬☎栜ᾐŔ硲ꗓ㴊헼";
      int var11 = 0;

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 69;
               case 1 -> 73;
               case 2 -> 133;
               case 3 -> 124;
               case 4 -> 70;
               case 5 -> 157;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      lII = var9;
      lIl = new Object[var9.length];
      int var21 = 0;
      int var24 = 0;
      byte[] var10002 = "\u0015\u0097ú0X\u0088¡\u00063\u000b\r\bÒúàØ»ñËò\u001dy+ªÒ\u0099½\u0000\u000f±©Rða9\u0012ºSÞñÙV\u0011ò\u0093ÆB¸I\u0083=1¦v?ê¼{%2ðsÝI\u0019:\u0096\u000b\u0092n8Ñ\u008d\u009aÄÆð\u0093]è\u0013-Z7\u0091%OæûÛ\u0083©mÇ\u0080Ql5*zúMPÊ/<\u0018p>=pÐ\u0084É\u0094N%³Ú§ªÐÁòï\u009fZè\"Õ3âë\u00ad>3\r,\u0005(ta$-#7À\u008dg\u00923D+VÛ\u009fÖb//¹\u0088\u0086Æ\"o¬êIH\u009aú\b'Ð\u009dIÛq&zÍNÝ ¶\u000b\u0088\u0017\u0087+àà\u0000Å¦\u009b=È^«\u0016·2Vå@\u008f\u000fã\u0093\u00001ù£Û¸M\u0094\u001c\u000b*bon^r\u0097v\u0088@¯ej\u008aP\u009d£k>\u0016\u009e@»ù«FGö\u001e`[\u0014\u00ad\u0018KO×\u0094\u001fkÉ\u000f,î¿%\nÞ±\u009b¨Ð\u008d¹þÛ\u0018\u0093=?\u0007UØ×\u001b\u0083ª\u0016\u0090B\u007f\u00adö\u0013\u0010U\u009c&m-\u0014#;I£Ù'{Ëµ©\u00909µ]\u000fç\u0083<\u009eKî\u0006¬ûQÊ\u0015\u0082äo\u009eçA´ú5Á\u009cÍL\rò¥+\u0082\u0089\u0083\u0016Cx³¼(\u0088\u000eïE}áÄM\u009d¹fÂµ±½\u009a¬¾\u0086Ù5\u0089\u0084Ë\u0007\u0000\u007fcÆ\u000bIQæ\fj\bvËKîºªéæ?\\\bÿ~Ù=Êùm\u0086\u0000Åiì\u0017ß*³âÃÕÐ\u001aF_½M\u0011\u008fwtX\u00871ßepòÊ\u009fÝöYH\u007fÊ^»P4\u001433Ýj4\u0082\u0090\u001d\u008aFN\u009e\u001bâµ\u0080Á$£\u008aÙ7QÀ´\u001d\u001d\u001f= D¾Z\u0014}c!¼ýj\u0091úT\u0007ÞÙ~sé¾==O0!ÊDg¥?Í\u0097Ò\u001bïê\u0003^Ü[*\u0006\u0004ª\u009dË\u0018Ôa##½mP\u0086=\"s°>\u0014TÛã\u0096üV\u0081\u009cp\füÄU\u0097F\u0011:\u0002å \u000b|\u0002ÎtÆrH\u001f¨DKß²_±\u009eê\u0080yVÔ\u0012Æ(NÅ²»üQ \u009dÖ¡Æ´6YÓbC¤\u0004\"X¡ª+QÌ@\u000b\u0003$\u008d¬½\u0096\u0005×\u0019\t¡\b\u008a,³Ä¿\u0017º¶\u0005Æ\u0015\u0094Ã\u0011Qà\u0014\u001c\u0082\u0014;å´\u001c¸\\É¸ýÄ±@'÷\u001fÖ*\u001c³Àµ¼Öb\u000bÈKmoí\u0010\u0098®\u0000+VRê½43§çà~Ù\u0091]\b\u0013èî[!b\u009dØ¥\u009f\u0002Dáéßz\u0004?\u00adô*ò\u0090\u0081#\u008b\u0096öUË\u0017§8Èf³Ï\tç\u0014;\u0017m\u0089\u0097(ÏvÅf\u0017é<H\u0099ÐÿéÐ7\u0082N·®æñÂù\u001eJÆS\u0097'È¢ô°\u008e\u0019\u001ec>$îgÒÃ\u0086M7G\u0012\u008aóB¨HZo¯mÐM\u0092#èä\u0007®vÄÁþÇÕ¯Ë\u000eÅhgú\u0005u2\u009b·û\"þWp®ÉV\u0019\u00ad?ìOnS\u0080\u008f\u0098ÄNêwÐNx·í\u008a^RØx×/´}c-Õ\u0007\u0012sÓH\u007f;[r\u0017\u009f\u00014àÂt\n\u0012\u0081\u0016\u0088G¦\u0085§×1\u000bR¼Ã\u0013\u000e\u001f\u001d8Ø¸\u0014¡Î\u0018Þ\u008d æ¥\u007f\u0019\u0088o$<|§RÃØ\u0006RÈ\u008aK\u0086#\u001e×ê²<£C°%Ñ\u0084É¥¾2¦ÜIìbIkX\u0090\u0010jæ¡ådo\u0086f)ò:'ï\u000f\u0000\fi'\u0016<çÍ\u001b\u0016 yK¡òsKO\u0095¤ÙúÎrXe¤Eî+¸e§º\u0080®¶RÝV)0\u00938è²7á×//hÅ\b\u0080Tß|·\u0010\u0005ëÍ±E\u001eôÁH\u0003Ýykiý\u001bs«´\r\u0004e?;lß¿\u0006\u009bZIQ£\u0015g\u0082\u0088Â\"\u0082v³T\u0019|?»å¡`\u0007d$ðahùk\u0011èù÷£K§ì]Ó¹B¦\u0090:\u0099A>I¨\u008d\u0097Ò&\u0003b2s)EJ\u0014È\u000el~çÔàT\u00ad²ËZ=úe»Ó\u0010\b¼þ~º_]Ü¹"
         .getBytes("ISO-8859-1");
      Ill = new int[286];

      int var55;
      do {
         Ill[var21] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ -691327918;
         var21 += 1;
         var55 = var24 + 4;
         var24 += 4;
      } while (var55 < var10002.length);

      String[] var5 = new String[5];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III('펋', var17 ^ 116837192, '䛯')).length();
      int var1 = ll(678787359, var17 ^ -632969666);
      int var19 = -1;

      label102:
      while (true) {
         var21 = ll(678787358, var17 ^ 1001673823);
         String var27 = var2.substring(++var19, var19 + var1);
         byte var39 = -1;

         while (true) {
            label97: {
               char[] var57 = var27.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var21;
               var44 = var57;
               var24 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               } else {
                  var55 = var21;
                  var24 = var69;
                  if (var69 <= var6) {
                     break label97;
                  }

                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % ll(678787352, var17 ^ -197689188)) {
                     case 0 -> ll(678787355, var17 ^ 1003948449);
                     case 1 -> ll(678787354, var17 ^ -419495345);
                     case 2 -> ll(678787349, var17 ^ 422548170);
                     case 3 -> ll(678787348, var17 ^ 1394436702);
                     case 4 -> ll(678787351, var17 ^ 806926878);
                     case 5 -> ll(678787350, var17 ^ 2055793031);
                     default -> ll(678787345, var17 ^ -1597139201);
                  });
                  var6++;
                  if (var55 == 0) {
                     var88 = var55;
                     var81 = var44;
                     var69 = var55;
                  } else {
                     if (var24 <= var6) {
                        break;
                     }

                     var81 = var44;
                     var69 = var55;
                     var88 = var6;
                  }
               }
            }

            String var62 = new String(var44).intern();
            switch (var39) {
               case 0:
                  var5[var3++] = var62;
                  if ((var19 += var1) >= var4) {
                     ll = var5;
                     III = new String[5];
                     II = new String[5];
                     Il();
                     Il = new IIIlIIIll();
                     IlI = new IIIlIIIll();
                     I = new IIIlIIIll();
                     l = new IIIlIIIll();
                     lI = new IIIlIIIll();
                     IIl = l();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var62;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label102;
                  }

                  var4 = (var2 = III('駗', var17 ^ 1150339255, '䛮')).length();
                  var1 = 4;
                  var19 = -1;
            }

            var21 = ll(678787353, var17 ^ 1388273686);
            var27 = var2.substring(++var19, var19 + var1);
            var39 = 0;
         }
      }
   }

   private static void Il() {
      int var0 = 1722594590;
      II[0] = I(lI(ll(678787344, var0 ^ 1046776330), ll(678787347, var0 ^ 610865945)).toCharArray(), 1322L, ll(678787346, var0 ^ 364533586));
      II[1] = I(lI(ll(678787341, var0 ^ -2128075779), ll(678787340, var0 ^ 175919434)).toCharArray(), 80593L, ll(678787343, var0 ^ -1689320413));
      II[2] = I(lI(ll(678787342, var0 ^ 1753344018), ll(678787337, var0 ^ 1958761251)).toCharArray(), 47996L, ll(678787336, var0 ^ -1700610060));
      II[3] = I(lI(ll(678787339, var0 ^ 1674131032), ll(678787338, var0 ^ -170543546)).toCharArray(), 9265L, ll(678787333, var0 ^ -71769056));
      II[4] = I(lI(ll(678787332, var0 ^ 1650451767), ll(678787335, var0 ^ -1221688605)).toCharArray(), 64052L, ll(678787334, var0 ^ -315008890));
   }

   private static String lI(int var0, int var1) {
      int var9 = 835797352;
      int var2 = (var0 ^ ll(678787329, var9 ^ 1269224909)) & ll(678787328, var9 ^ -354582058);
      if (III[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & ll(678787331, var9 ^ 1707050368)) {
            case 0 -> ll(678787330, var9 ^ 552607293);
            case 1 -> ll(678787389, var9 ^ -306546979);
            case 2 -> ll(678787388, var9 ^ 616725222);
            case 3 -> ll(678787391, var9 ^ -1035779610);
            case 4 -> ll(678787390, var9 ^ -1156677716);
            case 5 -> ll(678787385, var9 ^ -329743163);
            case 6 -> ll(678787384, var9 ^ -1459784071);
            case 7 -> ll(678787387, var9 ^ -465985881);
            case 8 -> ll(678787386, var9 ^ 420309864);
            case 9 -> ll(678787381, var9 ^ 1994900437);
            case 10 -> ll(678787380, var9 ^ -318703756);
            case 11 -> ll(678787383, var9 ^ -2044207442);
            case 12 -> ll(678787382, var9 ^ -951547112);
            case 13 -> 2;
            case 14 -> ll(678787377, var9 ^ -2035010549);
            case 15 -> ll(678787376, var9 ^ -1247668884);
            case 16 -> ll(678787379, var9 ^ 1876512388);
            case 17 -> ll(678787378, var9 ^ -655855917);
            case 18 -> ll(678787373, var9 ^ 795836551);
            case 19 -> ll(678787372, var9 ^ 1414696290);
            case 20 -> ll(678787375, var9 ^ 1685713777);
            case 21 -> ll(678787374, var9 ^ -1719002161);
            case 22 -> ll(678787369, var9 ^ -1064511631);
            case 23 -> ll(678787368, var9 ^ -23660368);
            case 24 -> ll(678787371, var9 ^ 1998770445);
            case 25 -> ll(678787370, var9 ^ -1002100880);
            case 26 -> ll(678787365, var9 ^ -1590610366);
            case 27 -> ll(678787364, var9 ^ -1176042111);
            case 28 -> ll(678787367, var9 ^ -1442459891);
            case 29 -> ll(678787366, var9 ^ 1389112874);
            case 30 -> ll(678787361, var9 ^ -638515786);
            case 31 -> ll(678787360, var9 ^ 918822347);
            case 32 -> ll(678787363, var9 ^ 963722207);
            case 33 -> ll(678787362, var9 ^ -608025621);
            case 34 -> ll(678787421, var9 ^ -2135371810);
            case 35 -> ll(678787420, var9 ^ -1532603333);
            case 36 -> ll(678787423, var9 ^ 567304608);
            case 37 -> ll(678787422, var9 ^ 299810928);
            case 38 -> ll(678787417, var9 ^ 534969691);
            case 39 -> ll(678787416, var9 ^ 343398308);
            case 40 -> ll(678787419, var9 ^ -261615278);
            case 41 -> ll(678787418, var9 ^ 410306282);
            case 42 -> ll(678787413, var9 ^ -637593178);
            case 43 -> ll(678787412, var9 ^ 1654212842);
            case 44 -> ll(678787415, var9 ^ -1695325439);
            case 45 -> ll(678787414, var9 ^ -495229010);
            case 46 -> ll(678787409, var9 ^ -2033410660);
            case 47 -> ll(678787408, var9 ^ -1264258854);
            case 48 -> ll(678787411, var9 ^ 1599533553);
            case 49 -> ll(678787410, var9 ^ -1064777824);
            case 50 -> ll(678787405, var9 ^ 1361357458);
            case 51 -> ll(678787404, var9 ^ 1670646308);
            case 52 -> ll(678787407, var9 ^ -621953175);
            case 53 -> ll(678787406, var9 ^ 1367874223);
            case 54 -> ll(678787401, var9 ^ 895124771);
            case 55 -> ll(678787400, var9 ^ 35870223);
            case 56 -> ll(678787403, var9 ^ 1782892532);
            case 57 -> ll(678787402, var9 ^ 1283004515);
            case 58 -> ll(678787397, var9 ^ 2094230573);
            case 59 -> ll(678787396, var9 ^ -1048575984);
            case 60 -> ll(678787399, var9 ^ 782964256);
            case 61 -> ll(678787398, var9 ^ 1980335765);
            case 62 -> ll(678787393, var9 ^ 2127749061);
            case 63 -> ll(678787392, var9 ^ 1911135322);
            case 64 -> ll(678787395, var9 ^ 1189842832);
            case 65 -> ll(678787394, var9 ^ -821024923);
            case 66 -> ll(678787453, var9 ^ -1004140001);
            case 67 -> ll(678787452, var9 ^ -1023061111);
            case 68 -> ll(678787455, var9 ^ 69511706);
            case 69 -> ll(678787454, var9 ^ 1703322276);
            case 70 -> ll(678787449, var9 ^ -1821918344);
            case 71 -> ll(678787448, var9 ^ 374509283);
            case 72 -> ll(678787451, var9 ^ -1561770592);
            case 73 -> ll(678787450, var9 ^ -1501343060);
            case 74 -> ll(678787445, var9 ^ -438524013);
            case 75 -> ll(678787444, var9 ^ 448749276);
            case 76 -> ll(678787447, var9 ^ -1865283200);
            case 77 -> ll(678787446, var9 ^ 1075326855);
            case 78 -> ll(678787441, var9 ^ 1214153812);
            case 79 -> ll(678787440, var9 ^ -1080193497);
            case 80 -> ll(678787443, var9 ^ 312024110);
            case 81 -> ll(678787442, var9 ^ -1331356722);
            case 82 -> ll(678787437, var9 ^ -1621405926);
            case 83 -> ll(678787436, var9 ^ -55431529);
            case 84 -> ll(678787439, var9 ^ 1308575333);
            case 85 -> ll(678787438, var9 ^ -1994269870);
            case 86 -> ll(678787433, var9 ^ 769311963);
            case 87 -> ll(678787432, var9 ^ -338898614);
            case 88 -> ll(678787435, var9 ^ -130114744);
            case 89 -> ll(678787434, var9 ^ -764257527);
            case 90 -> ll(678787429, var9 ^ 1865153125);
            case 91 -> ll(678787428, var9 ^ -619562796);
            case 92 -> ll(678787431, var9 ^ 1938960767);
            case 93 -> ll(678787430, var9 ^ 893082856);
            case 94 -> ll(678787425, var9 ^ 370227175);
            case 95 -> ll(678787424, var9 ^ 1901225581);
            case 96 -> ll(678787427, var9 ^ -11628139);
            case 97 -> ll(678787426, var9 ^ -1463125176);
            case 98 -> ll(678787485, var9 ^ 1488797948);
            case 99 -> ll(678787484, var9 ^ 627841693);
            case 100 -> ll(678787487, var9 ^ -1807400356);
            case 101 -> ll(678787486, var9 ^ 1710395404);
            case 102 -> ll(678787481, var9 ^ 453933111);
            case 103 -> ll(678787480, var9 ^ 1912739087);
            case 104 -> ll(678787483, var9 ^ -229820878);
            case 105 -> ll(678787482, var9 ^ -243592866);
            case 106 -> ll(678787477, var9 ^ 754563238);
            case 107 -> ll(678787476, var9 ^ 1324561653);
            case 108 -> ll(678787479, var9 ^ 866848339);
            case 109 -> ll(678787478, var9 ^ -1988206083);
            case 110 -> 4;
            case 111 -> ll(678787473, var9 ^ 718229190);
            case 112 -> ll(678787472, var9 ^ -845074053);
            case 113 -> ll(678787475, var9 ^ -1121494074);
            case 114 -> ll(678787474, var9 ^ -1960535496);
            case 115 -> ll(678787469, var9 ^ -1864443204);
            case 116 -> ll(678787468, var9 ^ 1326845383);
            case 117 -> ll(678787471, var9 ^ -576099308);
            case 118 -> ll(678787470, var9 ^ 182320915);
            case 119 -> ll(678787465, var9 ^ -1638934426);
            case 120 -> ll(678787464, var9 ^ 1856630869);
            case 121 -> ll(678787467, var9 ^ -1766054396);
            case 122 -> ll(678787466, var9 ^ 1802200613);
            case 123 -> ll(678787461, var9 ^ 1858433147);
            case 124 -> ll(678787460, var9 ^ 53432164);
            case 125 -> ll(678787463, var9 ^ -337450686);
            case 126 -> ll(678787462, var9 ^ 1500154937);
            case 127 -> ll(678787457, var9 ^ -959556733);
            case 128 -> ll(678787456, var9 ^ -472088339);
            case 129 -> ll(678787459, var9 ^ -657068591);
            case 130 -> ll(678787458, var9 ^ 159043534);
            case 131 -> ll(678787517, var9 ^ -566314009);
            case 132 -> ll(678787516, var9 ^ -739422413);
            case 133 -> ll(678787519, var9 ^ 719013702);
            case 134 -> ll(678787518, var9 ^ -1817779256);
            case 135 -> ll(678787513, var9 ^ 199105319);
            case 136 -> ll(678787512, var9 ^ 946901935);
            case 137 -> ll(678787515, var9 ^ -740522640);
            case 138 -> ll(678787514, var9 ^ 1941518592);
            case 139 -> ll(678787509, var9 ^ 119813759);
            case 140 -> ll(678787508, var9 ^ 578805035);
            case 141 -> ll(678787511, var9 ^ -817623689);
            case 142 -> ll(678787510, var9 ^ 634548309);
            case 143 -> ll(678787505, var9 ^ 1753791306);
            case 144 -> ll(678787504, var9 ^ 385751211);
            case 145 -> ll(678787507, var9 ^ -595088717);
            case 146 -> ll(678787506, var9 ^ -301082538);
            case 147 -> ll(678787501, var9 ^ 1794136485);
            case 148 -> ll(678787500, var9 ^ 780573458);
            case 149 -> 1;
            case 150 -> ll(678787503, var9 ^ -883886357);
            case 151 -> ll(678787502, var9 ^ -442641095);
            case 152 -> ll(678787497, var9 ^ -320549407);
            case 153 -> ll(678787496, var9 ^ -1700508517);
            case 154 -> 0;
            case 155 -> ll(678787499, var9 ^ -140041532);
            case 156 -> ll(678787498, var9 ^ 6726314);
            case 157 -> ll(678787493, var9 ^ -193448305);
            case 158 -> ll(678787492, var9 ^ 1481086053);
            case 159 -> ll(678787495, var9 ^ 168383040);
            case 160 -> ll(678787494, var9 ^ -215498037);
            case 161 -> ll(678787489, var9 ^ 814123996);
            case 162 -> ll(678787488, var9 ^ 1294070333);
            case 163 -> ll(678787491, var9 ^ 698254995);
            case 164 -> ll(678787490, var9 ^ -786070982);
            case 165 -> ll(678787549, var9 ^ 1481151361);
            case 166 -> ll(678787548, var9 ^ 1004522038);
            case 167 -> ll(678787551, var9 ^ -787711469);
            case 168 -> ll(678787550, var9 ^ 554211035);
            case 169 -> ll(678787545, var9 ^ 1226992648);
            case 170 -> ll(678787544, var9 ^ -572151604);
            case 171 -> ll(678787547, var9 ^ 1730616940);
            case 172 -> ll(678787546, var9 ^ 1610781921);
            case 173 -> ll(678787541, var9 ^ 1565307764);
            case 174 -> ll(678787540, var9 ^ -926863992);
            case 175 -> ll(678787543, var9 ^ 244423860);
            case 176 -> ll(678787542, var9 ^ 1621379875);
            case 177 -> ll(678787537, var9 ^ -1492598820);
            case 178 -> ll(678787536, var9 ^ -1168260866);
            case 179 -> ll(678787539, var9 ^ 877509535);
            case 180 -> ll(678787538, var9 ^ -1077833180);
            case 181 -> ll(678787533, var9 ^ -691897531);
            case 182 -> ll(678787532, var9 ^ -2147412065);
            case 183 -> ll(678787535, var9 ^ 1089969977);
            case 184 -> ll(678787534, var9 ^ 622367834);
            case 185 -> ll(678787529, var9 ^ -1210534377);
            case 186 -> ll(678787528, var9 ^ -1858233222);
            case 187 -> ll(678787531, var9 ^ 406909334);
            case 188 -> ll(678787530, var9 ^ -1404924328);
            case 189 -> ll(678787525, var9 ^ -585328659);
            case 190 -> ll(678787524, var9 ^ -1336664424);
            case 191 -> ll(678787527, var9 ^ -655336855);
            case 192 -> ll(678787526, var9 ^ 799879628);
            case 193 -> ll(678787521, var9 ^ -571585043);
            case 194 -> ll(678787520, var9 ^ -2000043933);
            case 195 -> ll(678787523, var9 ^ 408833891);
            case 196 -> ll(678787522, var9 ^ 1940674344);
            case 197 -> ll(678787581, var9 ^ -797803435);
            case 198 -> ll(678787580, var9 ^ 2004608037);
            case 199 -> ll(678787583, var9 ^ -676211056);
            case 200 -> ll(678787582, var9 ^ 701119271);
            case 201 -> ll(678787577, var9 ^ 1191206939);
            case 202 -> ll(678787576, var9 ^ -1278732541);
            case 203 -> ll(678787579, var9 ^ 392759755);
            case 204 -> ll(678787578, var9 ^ 1160037054);
            case 205 -> ll(678787573, var9 ^ -776425195);
            case 206 -> ll(678787572, var9 ^ -204732832);
            case 207 -> ll(678787575, var9 ^ -356597448);
            case 208 -> ll(678787574, var9 ^ 1792112317);
            case 209 -> ll(678787569, var9 ^ 321300894);
            case 210 -> ll(678787568, var9 ^ -2046557220);
            case 211 -> ll(678787571, var9 ^ -553272049);
            case 212 -> ll(678787570, var9 ^ 705374794);
            case 213 -> ll(678787565, var9 ^ -1454986863);
            case 214 -> ll(678787564, var9 ^ -394245481);
            case 215 -> ll(678787567, var9 ^ -1022985150);
            case 216 -> ll(678787566, var9 ^ -209152408);
            case 217 -> ll(678787561, var9 ^ -640736753);
            case 218 -> ll(678787560, var9 ^ 1855797071);
            case 219 -> ll(678787563, var9 ^ -2131042106);
            case 220 -> ll(678787562, var9 ^ 899757999);
            case 221 -> ll(678787557, var9 ^ -1429529021);
            case 222 -> ll(678787556, var9 ^ -455663540);
            case 223 -> ll(678787559, var9 ^ 1978657576);
            case 224 -> ll(678787558, var9 ^ -1649274366);
            case 225 -> ll(678787553, var9 ^ -236646);
            case 226 -> ll(678787552, var9 ^ 2102961518);
            case 227 -> ll(678787555, var9 ^ -532663329);
            case 228 -> 3;
            case 229 -> ll(678787554, var9 ^ -940634233);
            case 230 -> ll(678787101, var9 ^ -1277667846);
            case 231 -> ll(678787100, var9 ^ 614659448);
            case 232 -> ll(678787103, var9 ^ -778331381);
            case 233 -> ll(678787102, var9 ^ -860734281);
            case 234 -> 5;
            case 235 -> ll(678787097, var9 ^ -1500364303);
            case 236 -> ll(678787096, var9 ^ 1692096323);
            case 237 -> ll(678787099, var9 ^ -1437565288);
            case 238 -> ll(678787098, var9 ^ 282090513);
            case 239 -> ll(678787093, var9 ^ -1792666428);
            case 240 -> ll(678787092, var9 ^ -636954563);
            case 241 -> ll(678787095, var9 ^ 223205577);
            case 242 -> ll(678787094, var9 ^ 2084258804);
            case 243 -> ll(678787089, var9 ^ -254500421);
            case 244 -> ll(678787088, var9 ^ -1352130538);
            case 245 -> ll(678787091, var9 ^ 1057895079);
            case 246 -> ll(678787090, var9 ^ -1535202111);
            case 247 -> ll(678787085, var9 ^ 952897238);
            case 248 -> ll(678787084, var9 ^ 590514462);
            case 249 -> ll(678787087, var9 ^ -1916152831);
            case 250 -> ll(678787086, var9 ^ 1445880832);
            case 251 -> ll(678787081, var9 ^ 1742918601);
            case 252 -> ll(678787080, var9 ^ -378787841);
            case 253 -> ll(678787083, var9 ^ -1136262794);
            case 254 -> ll(678787082, var9 ^ -609793104);
            default -> ll(678787077, var9 ^ -1316450718);
         };
         int var5 = (var1 & ll(678787076, var9 ^ -1681721410)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(678787079, var9 ^ -1789681645)) >>> ll(678787078, var9 ^ 1958496834)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(678787073, var9 ^ 1938897866);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(678787072, var9 ^ -1875732024);
            }
         }

         III[var2] = new String(var3).intern();
      }

      return III[var2];
   }
}
