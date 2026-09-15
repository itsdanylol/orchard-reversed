package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIIIlllI implements lIllIIIl {
   l,
   Il;

   private static final String[] IlI;
   private static final String[] I;
   private final IIIlIlIl II;
   private static final IlIIIlllI[] lI;
   private static final Object[] Ill;
   private static String[] ll;
   private static final int[] IIl;
   private static final String[] III;

   @Override
   public String toString() {
      return this.II.llIl();
   }

   private static int IIl(int var0, int var1) {
      int var2 = IIl[var0 ^ 174497308] ^ var1 ^ var0;
      var2 += 25860;
      var2 -= 55559;
      var2 -= 62102;
      var2 -= 54877;
      var2 -= 59715;
      var2 += 62020;
      var2 -= 3088;
      var2 += 23738;
      var2 += 32842;
      return var2 + 32243;
   }

   private static IlIIIlllI[] I() {
      return new IlIIIlllI[]{Il, l};
   }

   public static IlIIIlllI l(String var0) {
      return Enum.valueOf(IlIIIlllI.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 393271770;
      int var10 = 0;
      int var8 = "\u000f霝뺖랍Ⴉ饀\uebc3锰ꖽ㞵︨䬱㬇鈁쎙\uf2a4\u000f傘ବἵ癍\ue2c1謻⯒\ue608撧뭓苈\uddd5큹銈猈".length();
      String[] var9 = new String[2];
      short var12 = 16804;
      int var11 = 0;
      String var7 = "\u000f霝뺖랍Ⴉ饀\uebc3锰ꖽ㞵︨䬱㬇鈁쎙\uf2a4\u000f傘ବἵ癍\ue2c1謻⯒\ue608撧뭓苈\uddd5큹銈猈";

      do {
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 0;
               case 1 -> 127;
               case 2 -> 63;
               case 3 -> 110;
               case 4 -> 248;
               case 5 -> 188;
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

      IlI = var9;
      Ill = new Object[var9.length];
      int var21 = 0;
      int var10001 = 0;
      IIl = new int[284];
      byte[] var10002 = "³\u0089à¨\u0000\u0011\u000f£\u007fÔD8(K¯NÑÔ#\u000f±¤õô\u0013L\u009cwæx\u0001\u0098]Ó%\u0091<\u00adæu\u008bä¥\u001b_\u009dP¨í2r\u0098Þ\u0080µtlºE\u0084-\u000bg\u0095²±\u0080\u0004x¢×àªi\u0091}\u009e-LGüöö»@3\u0099Þ\u008bAÂÑ\u0011^s/ÃÒ E\u008c\u000f%²×\"\u0013h\u008bFãb\u0090Þ\u0014=Á\u0002+ý:B\u0086\u008c\u0002Ãá\u008eÌhíÅÍ1´ª\u0094Ù2fbÙ&Æø\u001büw\u008dÀ©49¸*¯e\u0012^Ã\b¯#ÿ\u000fÕ\u0007|ÃÓ\u009eþÆçDËav{6\u00825\u009a=\u008f\u0091î\u0002}y?ñXYá'\u008bn\u0018p\u0096\rtÄ\u0086/\u0000ô-J¸5\u008d\u00adm¬ËëÈã\t¼z;¾lì\u00101^£¢¢ÄÜ¬\u008b^¬\n¬7\u008f\u009c\u0097\u009c£ÏS\u00122pËÊ´l\u0006J¨\u0011\u0013Íí\u008eÙeÈ\u0015¦\u0010ª±[<X³³aØwQ¿'N/<¨NßbßîepÖå½t¯Ã'½\u001b£ItÒäD`çÞÓw¼\u0007Øà\b¸\u009cÁG£\u008eT%è¦£\u0098ñ\bv÷@E4vµ\u001c\u000fÇ\u0083¯\u001bµÈ4lËc©ÿN\fË§3¿ý pBpë·y\u0001aý\u0096°\u009f\u0011ñ\u0097Çé£\u008bÅZ6¾U=\u0092{Ð`ã\u0083ÿ/õ\u00809H*\u0094ë\u0016^\u009eÛUc\u0093¥2Ä¹±7´\ncL@zé«Oë\u008eÏfJçôVRûÎ\u00907~\u001fPLýË&\u000f^Ð}:qée\u008d\u0090u`åJÐMïÞìñ\u0090x}7\u0013Þak×6\u000f9U\u0099xz\u009e¯<IMóí[V$AÕ\u0013iÏóHÎ`Ìóï*\u0089\u00180\u008egB°}Türg\u001cÄ\u0016\u0007:ú\u0003m?^ïS\u001f\u000fX\u0007ó\u009dá\u0099\u009aÇ¿\u001fÁ\u0080\u000eG¢$\u0007\u008bf\u0010(ô_\u007f\u0010J\u000f1¸\u0007¿\u0016esT¸\u008b6%n[S·Ö\r\u0010á»´\u00adC\u001cÅE`¬ý\u009bK.,ãùàURyX\u0097\u0007ßÚk\u0019>è=áù\u001c|ò\u008fh\u008c.iD¥5\u0081Öï¯\u0082S«éu¢E\u0004\u0016Yþä\u0083à¥\u00ad{ýÆGüú\u001a\u0098\u001c¸¹Â®g\u0080ÓR]ÐTèÛ\u0018\u0003f=Ó\u001f9\u0002Ñ\u0095\u0003\u0082O\u0096!\u0010Fõ\u001dy£\u009a 6\u0091Yònõ0/\u0087\u008d²G\"µõ\u007fwT¯ä<¿]\u00ad8ð³ë±ÿÒ\u0087#6¬\u0082òb\u0010\\\u0086=q³\u0010Ö\u0093º\u0080 IÇ(\r\u0014r\u0015N=\u0005\u009d¥îe\u0011eàÁ\u0019sô\u00160 ^ÖÁ\u0094õ\u0082\u0080Ì¸\u009f\nä¾¯\u0089ñÃ5\u0018\u0091ÒB¬ÀE:\u0097¬§\u0095\tµ\u000e¨Å\u0092\u001c 4Y¹#öoùml³3Zï\u0084»2g®xéÑýô\u0082ÖX\u00adÿÍ\u0099ºñ\u008aà\u007fº\u0097>±ÉV\u0097Ã»ÿ|è ´12,&\u0017P?©Å¾êïNy\f¶T?a5ºü¨\u0093úmZ\u008fõ\u0097\u001b:³\u0091%{C&\u001d\u0089b\u0090öDÍ[¸-ë®1[\u0083ãÇ|\u0004´\u0000Aþ\u0014ê¸dBtCS\u0096VL\u0099g§\u0081èU\u0093\u0003Ë±8Ê\u009bjÝ\u008bÙp\u008d\u0006\u0088\"×ðÏ\u0011ÔhAÒÙ\u0002ñr\u0083¡y©úÙvùÊÄôµp\u0003Áû\u001cô\u0086\u001c\u001e+\u009fsÑ¶q\u008aHs\u0016\u007f<×Aq\u0085j\u0091%þ\u0083%ðÒ½oÀÏ®\u0099È>µ|s\u0018\u0001pã\u008e#ü`\u0098½\u0010g*ë\u009a\u0010-n<Uå-£¸$æ\u0016\u001eû\u008f§>r\u0014\u000e±¶¦j²ê\u0083Þö \u0018&ïêjP½\u0019e¼ý¦ì!ùò\u009dÙ9õRg\u009e²\u0012\u0099&ñ\u0004z!þV\u0005^M\u0018\\,\u001dÀ>$wpÅÜ\u0088Nº\u0098\u00843¿\u0019ÌxÓTûòÕ¹\u009eC-\u0017¡À\u0016ÑíãÃL\u00adÖH¡{¶=SZ"
         .getBytes("ISO-8859-1");

      int var54;
      do {
         IIl[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1198286498;
         var21 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IlI(-999056646, 1679599827, '\u2435')).length();
      int var1 = IIl(174497308, var17 ^ 369941286);
      int var19 = -1;

      label99:
      while (true) {
         var21 = IIl(174497309, var17 ^ -1517014001);
         String var26 = var2.substring(++var19, var19 + var1);
         byte var38 = -1;

         while (true) {
            label94: {
               char[] var56 = var26.toCharArray();
               int var68 = var56.length;
               int var6 = 0;
               var54 = var21;
               var43 = var56;
               var10001 = var68;
               char[] var80;
               int var87;
               if (var68 <= 1) {
                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               } else {
                  var54 = var21;
                  var10001 = var68;
                  if (var68 <= var6) {
                     break label94;
                  }

                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % IIl(174497304, var17 ^ 1951471750)) {
                     case 0 -> IIl(174497305, var17 ^ 337759768);
                     case 1 -> IIl(174497306, var17 ^ -1228298334);
                     case 2 -> IIl(174497307, var17 ^ 1140669060);
                     case 3 -> IIl(174497300, var17 ^ -128573868);
                     case 4 -> IIl(174497301, var17 ^ -1725375058);
                     case 5 -> IIl(174497302, var17 ^ 778149533);
                     default -> IIl(174497303, var17 ^ -99062923);
                  });
                  var6++;
                  if (var54 == 0) {
                     var87 = var54;
                     var80 = var43;
                     var68 = var54;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var80 = var43;
                     var68 = var54;
                     var87 = var6;
                  }
               }
            }

            String var61 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var5[var3++] = var61;
                  if ((var19 += var1) >= var4) {
                     I = var5;
                     III = new String[4];
                     ll = new String[4];
                     lI();
                     Il = new IlIIIlllI(IlIIllIII.lI(ll[0]));
                     l = new IlIIIlllI(IlIIllIII.lI(ll[2]));
                     lI = I();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var61;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label99;
                  }

                  var4 = (var2 = IlI(-717498211, 1679599826, (char)'\ue7a6')).length();
                  var1 = IIl(174497310, var17 ^ -632193098);
                  var19 = -1;
            }

            var21 = IIl(174497311, var17 ^ -1915841400);
            var26 = var2.substring(++var19, var19 + var1);
            var38 = 0;
         }
      }
   }

   private static String IlI(int var0, int var1, char var2) {
      int var7 = var1 ^ 1679599827;
      char[] var6 = IlI[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])Ill[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         Ill[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 10137;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ 5337 ^ switch (var5 % 15) {
            default -> 198;
            case 1 -> 194;
            case 2 -> 16;
            case 3 -> 18;
            case 4 -> 235;
            case 5 -> 110;
            case 6 -> 147;
            case 7 -> 74;
            case 8 -> 173;
            case 9 -> 156;
            case 10 -> 249;
            case 11 -> 215;
            case 12 -> 15;
            case 13 -> 153;
            case 14 -> 36;
         } ^ var4 ^ var2 ^ var1 ^ var0);
      }

      return new String(var6).intern();
   }

   private static void lI() {
      int var0 = 390291280;
      ll[0] = ll(III(IIl(174497296, var0 ^ 1216687710), IIl(174497297, var0 ^ 2067266346)).toCharArray(), 57037L, IIl(174497298, var0 ^ -1934780919));
      ll[1] = ll(III(IIl(174497299, var0 ^ -2000929967), IIl(174497292, var0 ^ 386339078)).toCharArray(), 26364L, IIl(174497293, var0 ^ 1342297661));
      ll[2] = ll(III(IIl(174497294, var0 ^ 266259882), IIl(174497295, var0 ^ 999971340)).toCharArray(), 95052L, IIl(174497288, var0 ^ 693075012));
      ll[3] = ll(III(IIl(174497289, var0 ^ -444283633), IIl(174497290, var0 ^ 787954705)).toCharArray(), 28673L, IIl(174497291, var0 ^ -224471344));
   }

   private IlIIIlllI(String var3) {
      this.II = IlIIllIII.lII(var3);
   }

   private static String ll(char[] var0, long var1, int var3) {
      int var4 = IIl(174497284, -455025158 ^ -853390246) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIl(174497285, -455025158 ^ -635823842);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String III(int var0, int var1) {
      int var9 = -2139785080;
      int var2 = (var0 ^ IIl(174497286, var9 ^ -442275744)) & IIl(174497287, var9 ^ -1178109506);
      if (III[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & IIl(174497280, var9 ^ -1570861594)) {
            case 0 -> IIl(174497281, var9 ^ -209538804);
            case 1 -> IIl(174497282, var9 ^ 146939057);
            case 2 -> IIl(174497283, var9 ^ 809728095);
            case 3 -> IIl(174497340, var9 ^ -18319398);
            case 4 -> IIl(174497341, var9 ^ -5165542);
            case 5 -> IIl(174497342, var9 ^ -1504073530);
            case 6 -> IIl(174497343, var9 ^ 1348058140);
            case 7 -> IIl(174497336, var9 ^ -895785259);
            case 8 -> IIl(174497337, var9 ^ -1086311655);
            case 9 -> IIl(174497338, var9 ^ 188264631);
            case 10 -> IIl(174497339, var9 ^ 1469236237);
            case 11 -> IIl(174497332, var9 ^ 976206334);
            case 12 -> IIl(174497333, var9 ^ 1029021105);
            case 13 -> IIl(174497334, var9 ^ -246217641);
            case 14 -> IIl(174497335, var9 ^ -194519770);
            case 15 -> IIl(174497328, var9 ^ 1408688861);
            case 16 -> IIl(174497329, var9 ^ -1330315105);
            case 17 -> 0;
            case 18 -> IIl(174497330, var9 ^ -1122929410);
            case 19 -> IIl(174497331, var9 ^ 1341760987);
            case 20 -> IIl(174497324, var9 ^ 1792637894);
            case 21 -> IIl(174497325, var9 ^ -1175551427);
            case 22 -> IIl(174497326, var9 ^ -1534202248);
            case 23 -> IIl(174497327, var9 ^ -1263559939);
            case 24 -> IIl(174497320, var9 ^ 533340813);
            case 25 -> 5;
            case 26 -> 1;
            case 27 -> IIl(174497321, var9 ^ -1087506523);
            case 28 -> IIl(174497322, var9 ^ -110407093);
            case 29 -> 2;
            case 30 -> IIl(174497323, var9 ^ 993845430);
            case 31 -> IIl(174497316, var9 ^ -1930660276);
            case 32 -> IIl(174497317, var9 ^ 64895437);
            case 33 -> IIl(174497318, var9 ^ -1874573989);
            case 34 -> IIl(174497319, var9 ^ -1176619388);
            case 35 -> IIl(174497312, var9 ^ -1632168639);
            case 36 -> IIl(174497313, var9 ^ -1524876989);
            case 37 -> IIl(174497314, var9 ^ 1637001385);
            case 38 -> IIl(174497315, var9 ^ -112578962);
            case 39 -> IIl(174497372, var9 ^ 885666340);
            case 40 -> IIl(174497373, var9 ^ 558725053);
            case 41 -> IIl(174497374, var9 ^ -337292710);
            case 42 -> IIl(174497375, var9 ^ -1802489680);
            case 43 -> IIl(174497368, var9 ^ 1773978365);
            case 44 -> IIl(174497369, var9 ^ -2115943761);
            case 45 -> IIl(174497370, var9 ^ 1665121682);
            case 46 -> IIl(174497371, var9 ^ 498872914);
            case 47 -> IIl(174497364, var9 ^ -303938304);
            case 48 -> IIl(174497365, var9 ^ 1475366137);
            case 49 -> IIl(174497366, var9 ^ -1879821040);
            case 50 -> IIl(174497367, var9 ^ 356352340);
            case 51 -> IIl(174497360, var9 ^ 2079606916);
            case 52 -> IIl(174497361, var9 ^ 1994423771);
            case 53 -> IIl(174497362, var9 ^ -503896350);
            case 54 -> IIl(174497363, var9 ^ -362769791);
            case 55 -> IIl(174497356, var9 ^ -1371415173);
            case 56 -> IIl(174497357, var9 ^ -1126908093);
            case 57 -> IIl(174497358, var9 ^ -1809644876);
            case 58 -> IIl(174497359, var9 ^ 989228414);
            case 59 -> IIl(174497352, var9 ^ 2008345756);
            case 60 -> IIl(174497353, var9 ^ 781147525);
            case 61 -> IIl(174497354, var9 ^ -1650774038);
            case 62 -> IIl(174497355, var9 ^ 116150555);
            case 63 -> IIl(174497348, var9 ^ -1686121301);
            case 64 -> IIl(174497349, var9 ^ -114841051);
            case 65 -> IIl(174497350, var9 ^ -819926369);
            case 66 -> 4;
            case 67 -> IIl(174497351, var9 ^ 1114320200);
            case 68 -> IIl(174497344, var9 ^ 870410091);
            case 69 -> IIl(174497345, var9 ^ -2111861892);
            case 70 -> IIl(174497346, var9 ^ -1522044114);
            case 71 -> IIl(174497347, var9 ^ -1186611111);
            case 72 -> IIl(174497404, var9 ^ -1932155041);
            case 73 -> IIl(174497405, var9 ^ 1230043705);
            case 74 -> IIl(174497406, var9 ^ -1317030539);
            case 75 -> IIl(174497407, var9 ^ -1296444714);
            case 76 -> IIl(174497400, var9 ^ -1502901078);
            case 77 -> IIl(174497401, var9 ^ -1403269195);
            case 78 -> IIl(174497402, var9 ^ -1591366814);
            case 79 -> IIl(174497403, var9 ^ -1959678469);
            case 80 -> IIl(174497396, var9 ^ 954455634);
            case 81 -> IIl(174497397, var9 ^ 1214853514);
            case 82 -> IIl(174497398, var9 ^ -653372016);
            case 83 -> IIl(174497399, var9 ^ 2020044488);
            case 84 -> IIl(174497392, var9 ^ 1618695311);
            case 85 -> IIl(174497393, var9 ^ 100566480);
            case 86 -> IIl(174497394, var9 ^ 2122142038);
            case 87 -> IIl(174497395, var9 ^ 1037978293);
            case 88 -> IIl(174497388, var9 ^ 150041532);
            case 89 -> IIl(174497389, var9 ^ -1089409160);
            case 90 -> IIl(174497390, var9 ^ -674608553);
            case 91 -> IIl(174497391, var9 ^ -581011821);
            case 92 -> IIl(174497384, var9 ^ -1560746064);
            case 93 -> IIl(174497385, var9 ^ 559872856);
            case 94 -> IIl(174497386, var9 ^ -441019061);
            case 95 -> IIl(174497387, var9 ^ 1729749572);
            case 96 -> IIl(174497380, var9 ^ -1406163419);
            case 97 -> IIl(174497381, var9 ^ 2138273705);
            case 98 -> IIl(174497382, var9 ^ 1688525586);
            case 99 -> IIl(174497383, var9 ^ 568939942);
            case 100 -> IIl(174497376, var9 ^ 2051996371);
            case 101 -> IIl(174497377, var9 ^ -1049644862);
            case 102 -> IIl(174497378, var9 ^ 716182765);
            case 103 -> IIl(174497379, var9 ^ 1882253301);
            case 104 -> IIl(174497436, var9 ^ -822936125);
            case 105 -> IIl(174497437, var9 ^ -157901390);
            case 106 -> IIl(174497438, var9 ^ -930875635);
            case 107 -> IIl(174497439, var9 ^ 1819265284);
            case 108 -> IIl(174497432, var9 ^ 1037606223);
            case 109 -> IIl(174497433, var9 ^ -1352596615);
            case 110 -> IIl(174497434, var9 ^ -180386466);
            case 111 -> IIl(174497435, var9 ^ -1299260146);
            case 112 -> IIl(174497428, var9 ^ 377950634);
            case 113 -> IIl(174497429, var9 ^ 581463748);
            case 114 -> IIl(174497430, var9 ^ 1301336261);
            case 115 -> IIl(174497431, var9 ^ 54042358);
            case 116 -> IIl(174497424, var9 ^ 619047227);
            case 117 -> IIl(174497425, var9 ^ -1978946526);
            case 118 -> IIl(174497426, var9 ^ 1557907746);
            case 119 -> IIl(174497427, var9 ^ -460485938);
            case 120 -> IIl(174497420, var9 ^ -1993066579);
            case 121 -> IIl(174497421, var9 ^ 776331054);
            case 122 -> IIl(174497422, var9 ^ -1635974664);
            case 123 -> IIl(174497423, var9 ^ 481065252);
            case 124 -> IIl(174497416, var9 ^ -757741546);
            case 125 -> IIl(174497417, var9 ^ 1779932637);
            case 126 -> IIl(174497418, var9 ^ -387218520);
            case 127 -> IIl(174497419, var9 ^ -625116182);
            case 128 -> IIl(174497412, var9 ^ 788293645);
            case 129 -> IIl(174497413, var9 ^ 1510782107);
            case 130 -> IIl(174497414, var9 ^ 1982181143);
            case 131 -> IIl(174497415, var9 ^ -462473980);
            case 132 -> IIl(174497408, var9 ^ 1630237455);
            case 133 -> IIl(174497409, var9 ^ -1866097033);
            case 134 -> IIl(174497410, var9 ^ 1803451984);
            case 135 -> IIl(174497411, var9 ^ -769312865);
            case 136 -> IIl(174497468, var9 ^ -817439250);
            case 137 -> IIl(174497469, var9 ^ -929430952);
            case 138 -> IIl(174497470, var9 ^ -1975953364);
            case 139 -> IIl(174497471, var9 ^ 1426082184);
            case 140 -> IIl(174497464, var9 ^ 1867566834);
            case 141 -> IIl(174497465, var9 ^ -375875305);
            case 142 -> IIl(174497466, var9 ^ 257131988);
            case 143 -> IIl(174497467, var9 ^ 810618849);
            case 144 -> IIl(174497460, var9 ^ -1328608172);
            case 145 -> IIl(174497461, var9 ^ 583430035);
            case 146 -> IIl(174497462, var9 ^ 1260585106);
            case 147 -> IIl(174497463, var9 ^ 68272982);
            case 148 -> IIl(174497456, var9 ^ 1551215282);
            case 149 -> IIl(174497457, var9 ^ -1257428931);
            case 150 -> IIl(174497458, var9 ^ 271937523);
            case 151 -> IIl(174497459, var9 ^ 1171535359);
            case 152 -> IIl(174497452, var9 ^ 239060793);
            case 153 -> IIl(174497453, var9 ^ 175122911);
            case 154 -> IIl(174497454, var9 ^ -2088809475);
            case 155 -> IIl(174497455, var9 ^ 297154094);
            case 156 -> IIl(174497448, var9 ^ -1058895176);
            case 157 -> IIl(174497449, var9 ^ -1262621715);
            case 158 -> IIl(174497450, var9 ^ 576063808);
            case 159 -> IIl(174497451, var9 ^ -1298082997);
            case 160 -> IIl(174497444, var9 ^ 445484758);
            case 161 -> IIl(174497445, var9 ^ 667854783);
            case 162 -> IIl(174497446, var9 ^ -1356499935);
            case 163 -> IIl(174497447, var9 ^ 602241467);
            case 164 -> IIl(174497440, var9 ^ 737373764);
            case 165 -> IIl(174497441, var9 ^ 35701885);
            case 166 -> 3;
            case 167 -> IIl(174497442, var9 ^ -216764504);
            case 168 -> IIl(174497443, var9 ^ -1303633342);
            case 169 -> IIl(174497500, var9 ^ 946086943);
            case 170 -> IIl(174497501, var9 ^ -1150199359);
            case 171 -> IIl(174497502, var9 ^ 705776458);
            case 172 -> IIl(174497503, var9 ^ -1639915642);
            case 173 -> IIl(174497496, var9 ^ -1523827333);
            case 174 -> IIl(174497497, var9 ^ 993367277);
            case 175 -> IIl(174497498, var9 ^ -149780854);
            case 176 -> IIl(174497499, var9 ^ 114893715);
            case 177 -> IIl(174497492, var9 ^ -990944458);
            case 178 -> IIl(174497493, var9 ^ 1580444114);
            case 179 -> IIl(174497494, var9 ^ -586931777);
            case 180 -> IIl(174497495, var9 ^ 1429136007);
            case 181 -> IIl(174497488, var9 ^ -478319057);
            case 182 -> IIl(174497489, var9 ^ -455592036);
            case 183 -> IIl(174497490, var9 ^ -15130568);
            case 184 -> IIl(174497491, var9 ^ -1201609353);
            case 185 -> IIl(174497484, var9 ^ -1514263730);
            case 186 -> IIl(174497485, var9 ^ 1679251923);
            case 187 -> IIl(174497486, var9 ^ -839093667);
            case 188 -> IIl(174497487, var9 ^ -2035177456);
            case 189 -> IIl(174497480, var9 ^ 345492151);
            case 190 -> IIl(174497481, var9 ^ -1689967393);
            case 191 -> IIl(174497482, var9 ^ -573643953);
            case 192 -> IIl(174497483, var9 ^ -2066438779);
            case 193 -> IIl(174497476, var9 ^ 121267848);
            case 194 -> IIl(174497477, var9 ^ -1585776669);
            case 195 -> IIl(174497478, var9 ^ -1116402356);
            case 196 -> IIl(174497479, var9 ^ 137562972);
            case 197 -> IIl(174497472, var9 ^ 1237565198);
            case 198 -> IIl(174497473, var9 ^ -1142814077);
            case 199 -> IIl(174497474, var9 ^ 1984807250);
            case 200 -> IIl(174497475, var9 ^ 527119536);
            case 201 -> IIl(174497532, var9 ^ 1761835515);
            case 202 -> IIl(174497533, var9 ^ 1317285442);
            case 203 -> IIl(174497534, var9 ^ 1937673757);
            case 204 -> IIl(174497535, var9 ^ -1964713918);
            case 205 -> IIl(174497528, var9 ^ 1909656645);
            case 206 -> IIl(174497529, var9 ^ 2115632777);
            case 207 -> IIl(174497530, var9 ^ -1284976733);
            case 208 -> IIl(174497531, var9 ^ 827009927);
            case 209 -> IIl(174497524, var9 ^ -132386653);
            case 210 -> IIl(174497525, var9 ^ -1185289522);
            case 211 -> IIl(174497526, var9 ^ 872986735);
            case 212 -> IIl(174497527, var9 ^ -1034974257);
            case 213 -> IIl(174497520, var9 ^ 1522616461);
            case 214 -> IIl(174497521, var9 ^ 812771559);
            case 215 -> IIl(174497522, var9 ^ -1812384862);
            case 216 -> IIl(174497523, var9 ^ -336174121);
            case 217 -> IIl(174497516, var9 ^ -160157823);
            case 218 -> IIl(174497517, var9 ^ 826368486);
            case 219 -> IIl(174497518, var9 ^ -972650789);
            case 220 -> IIl(174497519, var9 ^ 421521713);
            case 221 -> IIl(174497512, var9 ^ -2064576426);
            case 222 -> IIl(174497513, var9 ^ 1100408230);
            case 223 -> IIl(174497514, var9 ^ -440276107);
            case 224 -> IIl(174497515, var9 ^ 1477558052);
            case 225 -> IIl(174497508, var9 ^ -1314559304);
            case 226 -> IIl(174497509, var9 ^ -1880139140);
            case 227 -> IIl(174497510, var9 ^ -1676062112);
            case 228 -> IIl(174497511, var9 ^ -2013468395);
            case 229 -> IIl(174497504, var9 ^ 871397730);
            case 230 -> IIl(174497505, var9 ^ 293403049);
            case 231 -> IIl(174497506, var9 ^ -1886323279);
            case 232 -> IIl(174497507, var9 ^ -652572029);
            case 233 -> IIl(174497564, var9 ^ 1555877476);
            case 234 -> IIl(174497565, var9 ^ 522396562);
            case 235 -> IIl(174497566, var9 ^ -728332920);
            case 236 -> IIl(174497567, var9 ^ -1121475278);
            case 237 -> IIl(174497560, var9 ^ 646851292);
            case 238 -> IIl(174497561, var9 ^ -1796593230);
            case 239 -> IIl(174497562, var9 ^ -1319211557);
            case 240 -> IIl(174497563, var9 ^ 715551893);
            case 241 -> IIl(174497556, var9 ^ 1490036255);
            case 242 -> IIl(174497557, var9 ^ 1463576315);
            case 243 -> IIl(174497558, var9 ^ -559848758);
            case 244 -> IIl(174497559, var9 ^ -1353080255);
            case 245 -> IIl(174497552, var9 ^ 1625753049);
            case 246 -> IIl(174497553, var9 ^ 538557875);
            case 247 -> IIl(174497554, var9 ^ 922401494);
            case 248 -> IIl(174497555, var9 ^ 1686488423);
            case 249 -> IIl(174497548, var9 ^ 719107990);
            case 250 -> IIl(174497549, var9 ^ -222380881);
            case 251 -> IIl(174497550, var9 ^ 1111836523);
            case 252 -> IIl(174497551, var9 ^ 2084176767);
            case 253 -> IIl(174497544, var9 ^ 20939393);
            case 254 -> IIl(174497545, var9 ^ 1247006679);
            default -> IIl(174497546, var9 ^ -1068162350);
         };
         int var5 = (var1 & IIl(174497547, var9 ^ 1907199857)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIl(174497540, var9 ^ -224966094)) >>> IIl(174497541, var9 ^ -784083096)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIl(174497542, var9 ^ -456640090);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIl(174497543, var9 ^ -2067936378);
            }
         }

         III[var2] = new String(var3).intern();
      }

      return III[var2];
   }
}
