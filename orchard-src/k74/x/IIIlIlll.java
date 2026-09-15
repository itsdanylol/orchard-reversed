package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class IIIlIlll extends IlIIIIIIl {
   private static final Object[] IlI;
   private static volatile IIIlIlll I;
   private final lllIIlII II;
   private final lllIIlII Il;
   private static final int[] III;
   private static final String[] lI;
   private static final String[] IIl;
   private static final String[] ll;

   public static boolean I(class_1297 var0) {
      String[] var10000 = IIllllIl.IIIIl();
      IIIlIlll var2 = I;
      String[] var1 = var10000;
      if (var2 != null && var2.IIIIlIl() && var2.II.IllI() && var0 instanceof class_1657 var3 && var1 == null) {
         class_310 var4 = class_310.method_1551();
         return var4.field_1724 != null && var3 != var4.field_1724;
      } else {
         return false;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1834727498;
      short var12 = 11724;
      String[] var9 = new String[2];
      int var10 = 0;
      int var8 = "Qꇿ価봯ﾳ뮿㾲뽏ᾳ롯⾰봿澸뤟龾놿徵벯龵먯侳룏辿럿㾳눏羿렏㾷먿侷돿ι띿徲릯侸뵿뾾뼿⾿벟⾰븿羿벟㾹럯뾵뭯\uefb3뎏쾽됿ᾡ뽟羼먏㾳놯뾵똯羹뤯澹뿯ﾰ뛯德몏羲떟㾡듏Ὰ둟羴끯徽뀿⾺뵏!쎡凌슁⇈즱⇊쮱\uf1c4읁臀쓑⇍좑燋칡ꇄ읡野송ꇈ쵱ꇋ쫡䇉잱燆췡ꇊ졑\uf1f1쳡㇎쒑".length();
      int var11 = 0;
      String var7 = "Qꇿ価봯ﾳ뮿㾲뽏ᾳ롯⾰봿澸뤟龾놿徵벯龵먯侳룏辿럿㾳눏羿렏㾷먿侷돿ι띿徲릯侸뵿뾾뼿⾿벟⾰븿羿벟㾹럯뾵뭯\uefb3뎏쾽됿ᾡ뽟羼먏㾳놯뾵똯羹뤯澹뿯ﾰ뛯德몏羲떟㾡듏Ὰ둟羴끯徽뀿⾺뵏!쎡凌슁⇈즱⇊쮱\uf1c4읁臀쓑⇍좑燋칡ꇄ읡野송ꇈ쵱ꇋ쫡䇉잱燆췡ꇊ졑\uf1f1쳡㇎쒑";

      do {
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << '\f') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> '\f') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIl = var9;
      IlI = new Object[var9.length];
      III = new int[278];
      int var10000 = 0;
      int var10001 = 0;
      byte[] var10002 = "\u0091Q°\b[|]å¾vØ\u0014ÛÞ¼ÒH\u001cÔÅ\u008eæñ=T\u0018Ë/D\u008fú«H¡7\u000eÑd\u008f\u0082½odÄÁt\u0006Ë÷\u00008]A06^ªi\r\b\u0005ÓF}kTUGÖº)\u008f\f\u001aÞ\u000eEpÂ\u0000àèBÕÙ\u0003Q+Jf~{\u0017-ÔÞ\u0010Ë\"Êk´\\\u0005ì&Ó²\u0093>)Ð(èåi\u0080\u001d\u009e\u000em~¤\\ßk\u0089´£3=\u007f\u0085 l\u001ahÙ#\u00125ñCÎ~Zj\u0002ã}5}å\u008b\u0099\u000b?À\u0088Ú³üQH^nÆk°Ä1(\u0088ÐÙþO9r@±;q\u008cd\t\rJ\u009fÕ¾$Ð»\u001b\u0006\u0015Q\u008açÿ¿ß}Ð]\"Ý\u0093ð¦²\"\u0087\u009ft\u001cýU>¼õ¸`.>ÝåLhòÓ]Db-uº·\u007ffÅµæ\b-¸\u0097¿\u0010ÄýZÑ\u0013@ïxÌ\u008d\u008b\u0082¶\u009f!þ\u0013ô\u0005!Q,\u009a\u0092þ=×òçë\u0002\u0082\u000b°õ'fÞ¥öê¬j¹»\u009d3}\u001dG³0¼é°¦ýµFN\u0015ß\u0000\u0087hæã\u008bÅêß#\u0007\u0018ª!ä(\u007f f6|ß\u0085[Q,ÎI±A4\u0096\u000eo7âaíë}\u0097Ìõ¦Ý>³\u009a¨\u001cf1º&\u009e\u0090öùÝ\u0080º\u0083}ë\u0088Mom\u0012ÿ\u0014\u009e\u0092r\u008f'ÃXy\u0019:GxÆ¦\b3oÀÙ,£æ\u0006\u001a²x\"\u00adqNôÔtàÀþÇ\u0090B¼6\u0090\u0017þÌìl2\u009b{e;\nÑµïÐ¥úDí\u009f\u0097î4\u0000%\u008cÐÃ¥ÃÖ±\u0002*O6>Q¥\u0089\u0014MR\u00adØí~ZçÃYî][\u0005^÷\f\u0007t\u0010²\u0090Ð\u000f4\u008b¯û¦\u0096uóçÔ\u009c/ªP¬Ì\u0017D¨\u0011\u0003;\u000b©kþÉò9\u0080\u000f3!2J×Lè¤\u0010\r}þµý*ç.Bì(\u0012e\u0017}ô·Ø\u0004_e´\n¾{»á2\u00995·<\u0013\u0090Ó\u0090íËRÏÿ_À*nÙ\u0013Ò¤ìG\u0080Û³¼ÅOÇñ\u009b*Æj°Z\u0004ÑØU4\u0017ü\u0094S¨Sby\u0012fJ¨8°ñvm^HÁ\u009eÑçíÄÑI¯\"Ì;¾ó8\u009cHE^Ð\u009c·\u0083\b\u00940\u0000½ð?PCw\u0012 DæÝã£ÞùOXãª:Ì+F¶D£á\u001b\u001a£»õ\u008dPOG\u0011R\u0002\u0090<1\u000b\u009bO<?Õgc'LÉB\u009cÙu\u0014_\u0087;«\u0088¸\u0006L0ß4¶£bÖfo\u000bM}+tC*w7ú\u0007ÛÖ_\n\u0087ñ\u00961ü<ü¨{\u0086Ë*\u0095ÿ[\u000fª\u000e!3*\u0084\u001bëÐ¬\n\u000b\u0086@æíPhûRCD¾\u0089g\u0085Ø\u001d\u0017\u0093\u0093å~Õã\u008e\"Clóîé~hó\u001e\\!¿W\u0097\u001ftmQ§P\u0083ú§ý\u0091'ÜÂ\u0007\u000fU:²\u008f*õ\u0084:ðVxþ\u000bV#\u008døH,úQM<|Õ¡è\u0094C\u0011ûñÎéTH\u00855Ü$÷æBX)Ïâ|àç=\u009c8\u0091ÿÑÑÒª?õG>Pà\u0007\u0082ä\u009aZF\u008að[`/|öN<åõî<Â*7\u001f,ô¥\u0089=t\u0002Fc\u001d&èè\u001fæ\u009fÌ\u008fQÿAs\rs+Q\u0014Ö:;\u008eü\u007f}fÿÞ\u0016\u0088U\u0089Õe\tË`\u0082C_m\u0003À\r2)L\u0003¢Æy{\u0007ÿ\u0082Ç\u001c¬s/¯rÝQñëÜný%\u0089)\u0002\u0084\u0001)\u0092@\u009cÌI0Ø\u00167º~=\u0084¡ßÜ1\u008bÙF\u009a/ÕVæ\u0091UwÄ»S\u0012BÃÄ-2ëÖMÊ.Wþ\b¤ÌæâlfºñbqEÜÚi\u0098\u001fD\tÛq\u0019\u009c¿A\u009c\u0092|\u0004 K9ÜÈ~9E\rô%\u0092TûÒP¯\u0089\n\u009e\\\u0018ïO¢Jù»|§»Ñ¾éqáÎ\u001eÇEÃD£}$Í}"
         .getBytes("ISO-8859-1");

      int var52;
      do {
         III[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1003144975;
         var10000 += 1;
         var52 = var10001 + 4;
         var10001 += 4;
      } while (var52 < var10002.length);

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = ll(var17 ^ -1217816197, 'ǟ', '艪')).length();
      int var1 = lI(-243406423, var17 ^ 280144668);
      int var19 = -1;

      label92:
      while (true) {
         var10000 = lI(-243406424, var17 ^ -1988684832);
         String var24 = var2.substring(++var19, var19 + var1);
         byte var36 = -1;

         while (true) {
            label87: {
               char[] var54 = var24.toCharArray();
               int var66 = var54.length;
               int var6 = 0;
               var52 = var10000;
               var41 = var54;
               var10001 = var66;
               char[] var78;
               int var85;
               if (var66 <= 1) {
                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               } else {
                  var52 = var10000;
                  var10001 = var66;
                  if (var66 <= var6) {
                     break label87;
                  }

                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               }

               while (true) {
                  var78[var85] = (char)(var78[var85] ^ var66 ^ switch (var6 % lI(-243406419, var17 ^ -1357667272)) {
                     case 0 -> lI(-243406420, var17 ^ 421767701);
                     case 1 -> lI(-243406417, var17 ^ -226848442);
                     case 2 -> lI(-243406418, var17 ^ 1572919864);
                     case 3 -> lI(-243406415, var17 ^ 860342534);
                     case 4 -> lI(-243406416, var17 ^ -1901481165);
                     case 5 -> lI(-243406413, var17 ^ 1409892981);
                     default -> lI(-243406414, var17 ^ 493050003);
                  });
                  var6++;
                  if (var52 == 0) {
                     var85 = var52;
                     var78 = var41;
                     var66 = var52;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var78 = var41;
                     var66 = var52;
                     var85 = var6;
                  }
               }
            }

            String var59 = new String(var41).intern();
            switch (var36) {
               case 0:
                  var5[var3++] = var59;
                  if ((var19 += var1) >= var4) {
                     lI = var5;
                     ll = new String[4];
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var59;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label92;
                  }

                  var4 = (var2 = ll(var17 ^ 486048895, 'Ǟ', '琍')).length();
                  var1 = lI(-243406421, var17 ^ -444794712);
                  var19 = -1;
            }

            var10000 = lI(-243406422, var17 ^ -1721263471);
            var24 = var2.substring(++var19, var19 + var1);
            var36 = 0;
         }
      }
   }

   public IIIlIlll() {
      int var1 = 1317623299;
      super(
         IlIIllIII.Ill(Il(lI(-243406431, var1 ^ 359621171), lI(-243406432, var1 ^ -549260313))),
         lllIIlIl.IIl,
         IlIIllIII.Ill(Il(lI(-243406429, var1 ^ 977799727), lI(-243406430, var1 ^ -1608531343)))
      );
      this.II = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Il(lI(-243406427, var1 ^ -870185221), lI(-243406428, var1 ^ -181942835))), true));
      this.Il = this.IllIIll(new lllIIlII(IlIIllIII.Ill(Il(lI(-243406425, var1 ^ -802809583), lI(-243406426, var1 ^ -1062136390))), true));
      I = this;
   }

   public static void l() {
      I = null;
   }

   public static boolean II(class_1297 var0) {
      String[] var10000 = IIllllIl.IIIIl();
      IIIlIlll var2 = I;
      String[] var1 = var10000;
      if (var2 != null && var2.IIIIlIl() && var2.Il.IllI() && var0 instanceof class_1657 var3 && var1 == null) {
         class_310 var4 = class_310.method_1551();
         return var4.field_1724 != null && var3 != var4.field_1724;
      } else {
         return false;
      }
   }

   private static String ll(int var0, char var1, char var2) {
      int var3 = var1 ^ 479;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 12074;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '샀';
         var10 ^= 5515;
         var10 ^= 23954;
         var10 += 60057;
         var10 -= 17830;
         var10 ^= 44439;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int lI(int var0, int var1) {
      int var2 = III[var0 ^ -243406431] ^ var1 ^ var0;
      var2 += 3198;
      var2 ^= 53443;
      var2 += 59437;
      var2 += 16136;
      var2 -= 63481;
      var2 -= 12136;
      var2 ^= 11165;
      return var2 + 5126;
   }

   private static String Il(int var0, int var1) {
      int var9 = -1034748658;
      int var2 = (var0 ^ lI(-243406411, var9 ^ -401785868)) & lI(-243406412, var9 ^ -773422773);
      if (ll[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & lI(-243406409, var9 ^ -1115904232)) {
            case 0 -> 5;
            case 1 -> lI(-243406410, var9 ^ -533262944);
            case 2 -> lI(-243406407, var9 ^ -405668967);
            case 3 -> lI(-243406408, var9 ^ -1666284406);
            case 4 -> lI(-243406405, var9 ^ 456919825);
            case 5 -> lI(-243406406, var9 ^ 1680142545);
            case 6 -> lI(-243406403, var9 ^ -537773421);
            case 7 -> lI(-243406404, var9 ^ 1996965543);
            case 8 -> lI(-243406401, var9 ^ -1704690417);
            case 9 -> lI(-243406402, var9 ^ 678516296);
            case 10 -> lI(-243406463, var9 ^ 1412031948);
            case 11 -> 2;
            case 12 -> lI(-243406464, var9 ^ 1924838561);
            case 13 -> lI(-243406461, var9 ^ -1614545950);
            case 14 -> 1;
            case 15 -> lI(-243406462, var9 ^ -1024746639);
            case 16 -> lI(-243406459, var9 ^ -1992247844);
            case 17 -> lI(-243406460, var9 ^ 342354600);
            case 18 -> lI(-243406457, var9 ^ 311509415);
            case 19 -> lI(-243406458, var9 ^ -925216652);
            case 20 -> lI(-243406455, var9 ^ 1155960453);
            case 21 -> 0;
            case 22 -> lI(-243406456, var9 ^ -1452009050);
            case 23 -> lI(-243406453, var9 ^ 1205790737);
            case 24 -> lI(-243406454, var9 ^ 2143946270);
            case 25 -> lI(-243406451, var9 ^ -1205621906);
            case 26 -> lI(-243406452, var9 ^ 1176610989);
            case 27 -> lI(-243406449, var9 ^ -1827416623);
            case 28 -> lI(-243406450, var9 ^ 1758422846);
            case 29 -> lI(-243406447, var9 ^ 664912486);
            case 30 -> lI(-243406448, var9 ^ -498380203);
            case 31 -> lI(-243406445, var9 ^ 145033071);
            case 32 -> lI(-243406446, var9 ^ 659028979);
            case 33 -> lI(-243406443, var9 ^ 1693088106);
            case 34 -> lI(-243406444, var9 ^ -711112714);
            case 35 -> lI(-243406441, var9 ^ -337146403);
            case 36 -> lI(-243406442, var9 ^ 1273979225);
            case 37 -> lI(-243406439, var9 ^ -651950882);
            case 38 -> lI(-243406440, var9 ^ -1150145971);
            case 39 -> lI(-243406437, var9 ^ -1436632263);
            case 40 -> lI(-243406438, var9 ^ -2103415208);
            case 41 -> lI(-243406435, var9 ^ -1847628459);
            case 42 -> lI(-243406436, var9 ^ -13146257);
            case 43 -> lI(-243406433, var9 ^ 1208622101);
            case 44 -> lI(-243406434, var9 ^ -1379153285);
            case 45 -> lI(-243406367, var9 ^ 409080939);
            case 46 -> lI(-243406368, var9 ^ 2090364917);
            case 47 -> lI(-243406365, var9 ^ -689648861);
            case 48 -> lI(-243406366, var9 ^ -230977898);
            case 49 -> lI(-243406363, var9 ^ 1837639336);
            case 50 -> lI(-243406364, var9 ^ 552091319);
            case 51 -> lI(-243406361, var9 ^ -174533981);
            case 52 -> 3;
            case 53 -> lI(-243406362, var9 ^ 37601232);
            case 54 -> lI(-243406359, var9 ^ 1391211516);
            case 55 -> lI(-243406360, var9 ^ -1650236376);
            case 56 -> lI(-243406357, var9 ^ -999832535);
            case 57 -> lI(-243406358, var9 ^ 1143628642);
            case 58 -> lI(-243406355, var9 ^ 1203512655);
            case 59 -> lI(-243406356, var9 ^ -1319843207);
            case 60 -> lI(-243406353, var9 ^ -140660268);
            case 61 -> lI(-243406354, var9 ^ 345054389);
            case 62 -> lI(-243406351, var9 ^ 674881052);
            case 63 -> lI(-243406352, var9 ^ 1564163390);
            case 64 -> lI(-243406349, var9 ^ -2001028720);
            case 65 -> lI(-243406350, var9 ^ -1950000391);
            case 66 -> lI(-243406347, var9 ^ -1506405912);
            case 67 -> lI(-243406348, var9 ^ 1180429810);
            case 68 -> lI(-243406345, var9 ^ -109713289);
            case 69 -> lI(-243406346, var9 ^ -1762184594);
            case 70 -> lI(-243406343, var9 ^ 1624648209);
            case 71 -> lI(-243406344, var9 ^ 707030064);
            case 72 -> lI(-243406341, var9 ^ 1594276269);
            case 73 -> lI(-243406342, var9 ^ 1295796200);
            case 74 -> lI(-243406339, var9 ^ 31655078);
            case 75 -> lI(-243406340, var9 ^ 1301914888);
            case 76 -> lI(-243406337, var9 ^ 2136454659);
            case 77 -> lI(-243406338, var9 ^ -437924393);
            case 78 -> lI(-243406399, var9 ^ 1701335200);
            case 79 -> lI(-243406400, var9 ^ 876781990);
            case 80 -> lI(-243406397, var9 ^ -849501748);
            case 81 -> lI(-243406398, var9 ^ 1360194097);
            case 82 -> lI(-243406395, var9 ^ 935589308);
            case 83 -> lI(-243406396, var9 ^ 287097461);
            case 84 -> lI(-243406393, var9 ^ -1892125959);
            case 85 -> lI(-243406394, var9 ^ -1175581393);
            case 86 -> lI(-243406391, var9 ^ 400173043);
            case 87 -> lI(-243406392, var9 ^ 1733846302);
            case 88 -> lI(-243406389, var9 ^ 1728915331);
            case 89 -> lI(-243406390, var9 ^ 460778026);
            case 90 -> lI(-243406387, var9 ^ -1937775670);
            case 91 -> lI(-243406388, var9 ^ 649017016);
            case 92 -> lI(-243406385, var9 ^ 1390451569);
            case 93 -> lI(-243406386, var9 ^ 1754085169);
            case 94 -> lI(-243406383, var9 ^ -146844204);
            case 95 -> lI(-243406384, var9 ^ 884939564);
            case 96 -> lI(-243406381, var9 ^ 1176040098);
            case 97 -> lI(-243406382, var9 ^ -1054570325);
            case 98 -> lI(-243406379, var9 ^ 2114885051);
            case 99 -> lI(-243406380, var9 ^ 1522677215);
            case 100 -> lI(-243406377, var9 ^ -1375921586);
            case 101 -> lI(-243406378, var9 ^ 424117235);
            case 102 -> lI(-243406375, var9 ^ -1444031136);
            case 103 -> lI(-243406376, var9 ^ -2096469440);
            case 104 -> lI(-243406373, var9 ^ 655748574);
            case 105 -> lI(-243406374, var9 ^ 1491172965);
            case 106 -> lI(-243406371, var9 ^ -2098643300);
            case 107 -> lI(-243406372, var9 ^ 1798664987);
            case 108 -> lI(-243406369, var9 ^ 1540804163);
            case 109 -> lI(-243406370, var9 ^ 1594612242);
            case 110 -> lI(-243406559, var9 ^ -55331933);
            case 111 -> lI(-243406560, var9 ^ 1055449551);
            case 112 -> lI(-243406557, var9 ^ -131467127);
            case 113 -> lI(-243406558, var9 ^ -1110600813);
            case 114 -> lI(-243406555, var9 ^ 1393218706);
            case 115 -> lI(-243406556, var9 ^ 162473122);
            case 116 -> lI(-243406553, var9 ^ 271883092);
            case 117 -> lI(-243406554, var9 ^ -553075427);
            case 118 -> lI(-243406551, var9 ^ -1964085689);
            case 119 -> lI(-243406552, var9 ^ -213533203);
            case 120 -> lI(-243406549, var9 ^ -39541517);
            case 121 -> lI(-243406550, var9 ^ 371736803);
            case 122 -> lI(-243406547, var9 ^ 1076284355);
            case 123 -> 4;
            case 124 -> lI(-243406548, var9 ^ 613037461);
            case 125 -> lI(-243406545, var9 ^ -1512757513);
            case 126 -> lI(-243406546, var9 ^ 925939448);
            case 127 -> lI(-243406543, var9 ^ -456623180);
            case 128 -> lI(-243406544, var9 ^ -1332084103);
            case 129 -> lI(-243406541, var9 ^ 1272944184);
            case 130 -> lI(-243406542, var9 ^ 109179586);
            case 131 -> lI(-243406539, var9 ^ -1649769963);
            case 132 -> lI(-243406540, var9 ^ 650284237);
            case 133 -> lI(-243406537, var9 ^ -521778103);
            case 134 -> lI(-243406538, var9 ^ 1598667321);
            case 135 -> lI(-243406535, var9 ^ -444820707);
            case 136 -> lI(-243406536, var9 ^ -810932063);
            case 137 -> lI(-243406533, var9 ^ -1706780782);
            case 138 -> lI(-243406534, var9 ^ 1774927374);
            case 139 -> lI(-243406531, var9 ^ 868978806);
            case 140 -> lI(-243406532, var9 ^ -707337635);
            case 141 -> lI(-243406529, var9 ^ 69354292);
            case 142 -> lI(-243406530, var9 ^ -1304164004);
            case 143 -> lI(-243406591, var9 ^ 1083824067);
            case 144 -> lI(-243406592, var9 ^ -954571759);
            case 145 -> lI(-243406589, var9 ^ -934634661);
            case 146 -> lI(-243406590, var9 ^ -449143476);
            case 147 -> lI(-243406587, var9 ^ 720993259);
            case 148 -> lI(-243406588, var9 ^ 240484724);
            case 149 -> lI(-243406585, var9 ^ 1562383806);
            case 150 -> lI(-243406586, var9 ^ -1314087746);
            case 151 -> lI(-243406583, var9 ^ 369214279);
            case 152 -> lI(-243406584, var9 ^ 1290753363);
            case 153 -> lI(-243406581, var9 ^ -1201813334);
            case 154 -> lI(-243406582, var9 ^ -175446576);
            case 155 -> lI(-243406579, var9 ^ -58617736);
            case 156 -> lI(-243406580, var9 ^ -925909133);
            case 157 -> lI(-243406577, var9 ^ -799666040);
            case 158 -> lI(-243406578, var9 ^ 1807985221);
            case 159 -> lI(-243406575, var9 ^ -1466047616);
            case 160 -> lI(-243406576, var9 ^ 2141380511);
            case 161 -> lI(-243406573, var9 ^ -943330043);
            case 162 -> lI(-243406574, var9 ^ 1417154160);
            case 163 -> lI(-243406571, var9 ^ -1743678263);
            case 164 -> lI(-243406572, var9 ^ -596731244);
            case 165 -> lI(-243406569, var9 ^ -2144525325);
            case 166 -> lI(-243406570, var9 ^ 751601509);
            case 167 -> lI(-243406567, var9 ^ 1894467912);
            case 168 -> lI(-243406568, var9 ^ 187049216);
            case 169 -> lI(-243406565, var9 ^ -1935928647);
            case 170 -> lI(-243406566, var9 ^ 1659208386);
            case 171 -> lI(-243406563, var9 ^ 1561655563);
            case 172 -> lI(-243406564, var9 ^ -576798084);
            case 173 -> lI(-243406561, var9 ^ 666293184);
            case 174 -> lI(-243406562, var9 ^ 1901739826);
            case 175 -> lI(-243406495, var9 ^ -1485692148);
            case 176 -> lI(-243406496, var9 ^ -1268881552);
            case 177 -> lI(-243406493, var9 ^ -1868627869);
            case 178 -> lI(-243406494, var9 ^ -527873522);
            case 179 -> lI(-243406491, var9 ^ -1982907477);
            case 180 -> lI(-243406492, var9 ^ -715541151);
            case 181 -> lI(-243406489, var9 ^ 435398568);
            case 182 -> lI(-243406490, var9 ^ 67405304);
            case 183 -> lI(-243406487, var9 ^ 1213026115);
            case 184 -> lI(-243406488, var9 ^ -2089318352);
            case 185 -> lI(-243406485, var9 ^ -1483136302);
            case 186 -> lI(-243406486, var9 ^ 176946717);
            case 187 -> lI(-243406483, var9 ^ 891146334);
            case 188 -> lI(-243406484, var9 ^ -844605823);
            case 189 -> lI(-243406481, var9 ^ 43967164);
            case 190 -> lI(-243406482, var9 ^ -1587402869);
            case 191 -> lI(-243406479, var9 ^ -1590078032);
            case 192 -> lI(-243406480, var9 ^ -1086971367);
            case 193 -> lI(-243406477, var9 ^ -1171872428);
            case 194 -> lI(-243406478, var9 ^ 1458719807);
            case 195 -> lI(-243406475, var9 ^ -421451334);
            case 196 -> lI(-243406476, var9 ^ 508465376);
            case 197 -> lI(-243406473, var9 ^ -1027146771);
            case 198 -> lI(-243406474, var9 ^ 291012729);
            case 199 -> lI(-243406471, var9 ^ 955818997);
            case 200 -> lI(-243406472, var9 ^ 271008826);
            case 201 -> lI(-243406469, var9 ^ 1726286290);
            case 202 -> lI(-243406470, var9 ^ 632348888);
            case 203 -> lI(-243406467, var9 ^ -1339782785);
            case 204 -> lI(-243406468, var9 ^ -258458469);
            case 205 -> lI(-243406465, var9 ^ -1386458434);
            case 206 -> lI(-243406466, var9 ^ -1401227599);
            case 207 -> lI(-243406527, var9 ^ 22340927);
            case 208 -> lI(-243406528, var9 ^ 49603723);
            case 209 -> lI(-243406525, var9 ^ -584204237);
            case 210 -> lI(-243406526, var9 ^ 62869877);
            case 211 -> lI(-243406523, var9 ^ -2095538184);
            case 212 -> lI(-243406524, var9 ^ -365154165);
            case 213 -> lI(-243406521, var9 ^ -386120077);
            case 214 -> lI(-243406522, var9 ^ 2018189420);
            case 215 -> lI(-243406519, var9 ^ -2078823645);
            case 216 -> lI(-243406520, var9 ^ -1509027932);
            case 217 -> lI(-243406517, var9 ^ -862706303);
            case 218 -> lI(-243406518, var9 ^ -1971575185);
            case 219 -> lI(-243406515, var9 ^ -510489129);
            case 220 -> lI(-243406516, var9 ^ 578801729);
            case 221 -> lI(-243406513, var9 ^ -1751606599);
            case 222 -> lI(-243406514, var9 ^ -1709629688);
            case 223 -> lI(-243406511, var9 ^ -986475114);
            case 224 -> lI(-243406512, var9 ^ 1440522506);
            case 225 -> lI(-243406509, var9 ^ -253404358);
            case 226 -> lI(-243406510, var9 ^ -340350332);
            case 227 -> lI(-243406507, var9 ^ 1483211930);
            case 228 -> lI(-243406508, var9 ^ 116458940);
            case 229 -> lI(-243406505, var9 ^ 171922971);
            case 230 -> lI(-243406506, var9 ^ -174139242);
            case 231 -> lI(-243406503, var9 ^ 1700414630);
            case 232 -> lI(-243406504, var9 ^ -1104543660);
            case 233 -> lI(-243406501, var9 ^ -1063213092);
            case 234 -> lI(-243406502, var9 ^ 1941636726);
            case 235 -> lI(-243406499, var9 ^ -963575522);
            case 236 -> lI(-243406500, var9 ^ 1832193161);
            case 237 -> lI(-243406497, var9 ^ 294358328);
            case 238 -> lI(-243406498, var9 ^ 866224930);
            case 239 -> lI(-243406687, var9 ^ -1244062315);
            case 240 -> lI(-243406688, var9 ^ -974057888);
            case 241 -> lI(-243406685, var9 ^ 1026854907);
            case 242 -> lI(-243406686, var9 ^ -4320122);
            case 243 -> lI(-243406683, var9 ^ 360103839);
            case 244 -> lI(-243406684, var9 ^ 108570999);
            case 245 -> lI(-243406681, var9 ^ 734050167);
            case 246 -> lI(-243406682, var9 ^ -396439441);
            case 247 -> lI(-243406679, var9 ^ -2046606758);
            case 248 -> lI(-243406680, var9 ^ -1232712746);
            case 249 -> lI(-243406677, var9 ^ -205876442);
            case 250 -> lI(-243406678, var9 ^ 735224013);
            case 251 -> lI(-243406675, var9 ^ -1307103868);
            case 252 -> lI(-243406676, var9 ^ 1699619454);
            case 253 -> lI(-243406673, var9 ^ -1481289409);
            case 254 -> lI(-243406674, var9 ^ 1766245915);
            default -> lI(-243406671, var9 ^ -1195863377);
         };
         int var5 = (var1 & lI(-243406672, var9 ^ 1281785823)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lI(-243406669, var9 ^ -648333290)) >>> lI(-243406670, var9 ^ 383043326)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lI(-243406667, var9 ^ -1294361406);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lI(-243406668, var9 ^ -1975642851);
            }
         }

         ll[var2] = new String(var3).intern();
      }

      return ll[var2];
   }
}
