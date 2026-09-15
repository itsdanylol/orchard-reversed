package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class llIllllI extends IlIIIIIIl {
   private static final String[] I;
   private static final int[] IIl;
   private static String[] II;
   private static final String[] Il;
   private static final int lI = 96;
   private final IllIII<IlIIIIllI> ll;
   private static final Object[] Ill;
   private static final String[] IlI;
   private static final double III = 3.0;

   private static void I() {
      int var0 = 1670688449;
      II[0] = ll(III(IIl(1484681399, var0 ^ 1800904289), IIl(1484681398, var0 ^ 1300792497)).toCharArray(), 27216L, IIl(1484681397, var0 ^ 750127590));
      II[1] = ll(III(IIl(1484681396, var0 ^ 466102851), IIl(1484681395, var0 ^ 123999476)).toCharArray(), 91072L, IIl(1484681394, var0 ^ 871238288));
      II[2] = ll(III(IIl(1484681393, var0 ^ -1330931140), IIl(1484681392, var0 ^ 797211551)).toCharArray(), 14820L, IIl(1484681407, var0 ^ -112030513));
   }

   private static boolean l(int var0) {
      return true;
   }

   private boolean II(class_310 var1, class_243 var2, float var3) {
      String[] var4 = IIllllIl.IIIIl();
      IIlIlllll var5 = IIIIIllII.III() == null ? null : IIIIIllII.III().II().IlIllI();

      for (class_1657 var7 : var1.field_1687.method_18456()) {
         if (var7 != var1.field_1724 && var7.method_5805() && (var5 == null || !var5.l(var7))) {
            class_243 var8 = IlIII.IIll(var7, var3);
            class_238 var9 = var7.method_5829()
               .method_989(var8.field_1352 - var7.method_23317(), var8.field_1351 - var7.method_23318(), var8.field_1350 - var7.method_23321());
            boolean var10 = this.ll.IllI() == IlIIIIllI.II
               ? IlIIIlIII.IlIl(var2.field_1352, var2.field_1350, 3.0, var9.field_1323, var9.field_1321, var9.field_1320, var9.field_1324)
               : IlIIIlIII.IIlIl(var2.field_1352, var2.field_1350, 3.0, var8.field_1352, var8.field_1350);
            if (var10) {
               return true;
            }

            if (var4 != null) {
               break;
            }
         }
      }

      return false;
   }

   private Color Il() {
      Color var1 = this.lI();
      return new Color(
         IIl(1484681406, 329741096 ^ 317846609) - var1.getRed(),
         IIl(1484681405, 329741096 ^ 1219204349) - var1.getGreen(),
         IIl(1484681404, 329741096 ^ -946929294) - var1.getBlue()
      );
   }

   @Override
   public void IlI(lIIlIl var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 != null && var2.field_1687 != null && IlIII.IIIIII(var1)) {
         float var3 = IIll.IlIIlI(var2);
         class_243 var4 = IlIII.IIll(var2.field_1724, var3);
         class_243 var5 = new class_243(var4.field_1352, var4.field_1351 + 0.04, var4.field_1350);
         boolean var6 = this.II(var2, var4, var3);
         Color var7 = var6 ? this.Il() : this.lI();
         IlIII.IIlIlI(var1, var5, 3.0, IIl(1484681403, -1837489562 ^ -1140688101), var7, 235.0, 3.0F);
         IlIII.IIllIl(var1, var5, 3.0, IIl(1484681402, -1837489562 ^ -1816413150), var7, 235.0, 3.0F, false, llIllllI::l);
      }
   }

   private static String Ill(int var0, short var1, int var2) {
      int var3 = var2 ^ 60258;
      char[] var4 = IlI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])Ill[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         Ill[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 23166;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 23859;
         var10 -= 61426;
         var10 -= 9458;
         var10 += 48165;
         var10 ^= 25796;
         var10 += 58036;
         var10 -= 50430;
         var10 += 302;
         var10 -= 4924;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int IIl(int var0, int var1) {
      int var2 = IIl[var0 ^ 1484681399] ^ var1 ^ var0;
      var2 -= 5753;
      var2 ^= 53201;
      var2 -= 30826;
      var2 -= 28813;
      var2 ^= 26308;
      var2 += 22039;
      var2 += 43277;
      var2 -= 14680;
      var2 ^= 53383;
      return var2 ^ 43639;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 1122140296;
      short var18 = 4058;
      String[] var15 = new String[1];
      int var16 = 0;
      int var10001 = "z㍔爸滧蟶ꎌ\ue4fb狴ĵ歘ꆴ骞₂㓽\udcb6䨾⪖䧄堯颭ᒭ析눍⨰è㮕\uf7a8ﴚ\uee6f멽愴毱ḇ靬៤ߞꅀ텣薷㗶⨰⟇경減ꃁ㈰㜫涂ຬ草⭎榀仲筪\uf4b2銂덉퓒䆱燝堘軿搮荈燌뻀짽疒蘜\ud81d㇇꿭ᨈ䧀ꆯ⭄倚証妩\ud99a観촥絘찥솂\u0ad4韭㷜㎢㌆\u20c8\u10c6砥\ud88e㗭ꛬ芣ꘃ遝孉∇梋᷀즒둊俅짵ﮯ뿫ḷѝු쵢砌㹅鵳맇晃릢⸭\uda0d턄㉚"
         .length();
      int var17 = 0;
      int var14 = var10001;
      String var13 = "z㍔爸滧蟶ꎌ\ue4fb狴ĵ歘ꆴ骞₂㓽\udcb6䨾⪖䧄堯颭ᒭ析눍⨰è㮕\uf7a8ﴚ\uee6f멽愴毱ḇ靬៤ߞꅀ텣薷㗶⨰⟇경減ꃁ㈰㜫涂ຬ草⭎榀仲筪\uf4b2銂덉퓒䆱燝堘軿搮荈燌뻀짽疒蘜\ud81d㇇꿭ᨈ䧀ꆯ⭄倚証妩\ud99a観촥絘찥솂\u0ad4韭㷜㎢㌆\u20c8\u10c6砥\ud88e㗭ꛬ芣ꘃ遝孉∇梋᷀즒둊俅짵ﮯ뿫ḷѝු쵢砌㹅鵳맇晃릢⸭\uda0d턄㉚";

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 168;
               case 1 -> 202;
               case 2 -> 162;
               case 3 -> 119;
               case 4 -> 9;
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
      int var9 = 1274105641;
      byte[] var7 = "\u001bLæ³=\u0093¦þ\u009au[8kÓR\u0094\u0088\u0080û&±\u0098\u0097]À°âõ `-n¸Ô\u0090Ï\u0012Ù3ÆH\u0083SiÇ§Æç=÷íp\u0012N*H¾T\u001aIú\u000eSÕ¼\u0002ù7ª\u0080¨y\u0010Í\\\\úTLY\u008d¼Ç|käSÉÃ=:\u0006\u009aïú\u0016í¨9ùdI\fwd|æqzA1\u001eö\u009b¾ÿÐ0Öº\u0094\u008c=\u0017¹®í\u0003\u009d\t\röwn\u0007F\u008a\u0000\f\u0091\u000e \u0092\u0098æ³²q3H\u0004½\tz÷©\u0098Ï\u001d_2dòM\n.\u009f\u001a{\u0012\u008f\u008bzZ\u0082\u0082î\u009e0\u000b½)¤¹ÑÁmý\u0003p·\u0096¹c£\u001dO Õ÷\u001c\u0092eª5ãÝK ÛMí×wû;+\u008fÔP²3\u009eÁsÂ\u0087\u009cfá«\u0015\u0010¾QÁo\u008a\u0002\u00022u\u0087Ò®å6\\\u008eðX³ub\u009epO&©Ë~á\u0094\\\r\u009d\n(.Ù\u0002P\u009bM\u0016\u0012÷e nÆ¬éÓ\u0003]\u0086\u0095\u008dê\u001fÝÄ.Ý\u0012ZÃ¿.\u0083u§<#\u008ah*\rGàeôüº\u008bû´*¾â°\u0095tÇ_SË1¸r¬å~/Î?=üWÒÀ?BÂ6\u0097Å~\u0004\u0080Ö\u00adÁÜÂ\u008d_\u0006s\u009bÚ\u000eK8\u0004J5x1\u001aUö\u008e\u00890³em\u0098\u00ad8pq\u001a.ï;\t\n+ðÁc(H\u0084ÈM\rÉõzéÍD]m\u0089;4×3%=)K&ÏÍ\u00983þÑÛÏ\u001e($XÎ¨\u009fO7óË©è*ñ Äàÿ4¼sK}ë\u0084\u001a|?\u0015=\u0093rÖ\u001d\u0006{ \\U1fANcÒ°\u0003<IWõÎ\u00ad§\u008d\u0087åLí\u0005è-\u0006'\\\u001e(Å\u0015£'=\u007fÐ\u0090\u009d\u009döØ\u00031\u0093k1ºÛõº(g\u0014%zÆ\u0083ì\u0092íM¬Zp\u009d\u009780o\u0001ÇIËK~qð\b¹ñN/¢\\@=g5\u009f\u0016\u0085oßùúÒj\"\u001etEMR§OíÍ7\u0011\u000b\\\u0083ò\f\u00963í¹ù³q¢ù\u007f\u0096X%ì¾ûMqG\u0086j\u009c¦Ô@\u0094¢\u0018\u0093\u008b%/\u0001\u008eÖyâ\u0089Å\u0001ÿ\u000eðkk\u0000/\u009cø°\u009e\u001aî\u0006G\u00884\u0007\u0015~Ã»Ùö:T\u0014ùéC%à<\u009a%$X\u0005È¨©þ¹auÿ\u0090\u001eú`\u0000¼n4\u0095\u008b¯@\rk²\u0017{ãßål\u009d\u009aU\u008b«S¾pYO~7m¦ÃÇ\u0005Ê¾_<*êåõ\u0014:\u0084@I¬\u0096?ÞÜ=gÛ\u0004ÿßÛ\u0086@å\nöÂþê*n\u0011Åå Ø\"-\róU\u008fÝ\u0093\u0018\u00ad)Eù2Yã£f;[Oõã\u001doãf\u009aqÒy£ìì¨\u000f\u0084\u0096¡7/\u0017\u000fÔ¯ÿñ½¡\u008fmÓÑÜT±\u000bA4ú\\\u009b}%çlx\u009fê\n¤|ñ\u0095R\u0002*58e&\u008ajyë3áUG¯:\u0012\u009a\u0011cðÔò\u0005ì\u00831l\u0003V{-\u0093S\u0080\u007fLn)\u001cI\u0089øô¨ÍÊw/\u001d¤»Æ±NlÄ\u0088!0øêøäQ.¸ÚM\u001eXêt]\u00990¼\u0090ÿAY~¤Ë'W\u0000ð¼ O«\u001bÆ\u0012_\u0013Ú\u009eHúp!UÇ\u0016~®ó\u0012bºfsã¸ÝNìDI\u0005\u0090ä\u0092J3fzè©2N\u0000!\u0096KG\u000eÿòõ\u0095bd`È\u009dà¼ûx@\"?$Ht\u00194o_2¡Vì\u0012u\u008d³Ìz}\u0017¸vÌ\u001c\u0086\b\u001f°7À¥ú\u0099Ã´Â\u0017úä\u0094tD\nPî}\u0091\u00991ÔM\u0015\u0018ob]\u0011\tO]Ì/\u0007á¨Õr¸Àl%Q^qTN\u0092\u008f\u0018hÛä\u00062Ç\u0096\u0088DÒÄ\u0098\u007f\u0090\u001f¤L\u0085(ï·\u00035\u001a\u001eÜ¦S¯\u0005Þú ^Ò@Ô\u0087+ä\u0090ÿpëÅcoñÿ\u000bÅêÅ0ì\u0003¦A3\u008fØlø\fÕñ³¾2jb$Ø@\u0097©$·:\u009eW¥ä\u0099\u0000¦.¥%\u008b\u008a\u008cÑÊ\u0092ýçÝÑ¸n"
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
      int var4 = (var2 = Ill(var23 ^ 1293977532, (short)'迻', 60258)).length();
      int var1 = IIl(1484681401, var23 ^ -281465238);
      int var0 = -1;

      while (true) {
         char[] var10002;
         label83: {
            int var27 = IIl(1484681400, var23 ^ -1419548719);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var34 = var27;
            var10002 = var10003;
            var10001 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var27;
               var10006 = var6;
            } else {
               var34 = var27;
               var10001 = var10004;
               if (var10004 <= var6) {
                  break label83;
               }

               var10005 = var10003;
               var10004 = var27;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % IIl(1484681383, var23 ^ -311439487)) {
                  case 0 -> IIl(1484681382, var23 ^ -68313593);
                  case 1 -> IIl(1484681381, var23 ^ 1101031969);
                  case 2 -> IIl(1484681380, var23 ^ -1422296840);
                  case 3 -> IIl(1484681379, var23 ^ -590220809);
                  case 4 -> IIl(1484681378, var23 ^ 982083557);
                  case 5 -> IIl(1484681377, var23 ^ -1840247220);
                  default -> IIl(1484681376, var23 ^ -880619950);
               });
               var6++;
               if (var34 == 0) {
                  var10006 = var34;
                  var10005 = var10002;
                  var10004 = var34;
               } else {
                  if (var10001 <= var6) {
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
            Il = var5;
            I = new String[3];
            II = new String[3];
            I();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private Color lI() {
      IIIIIllII var1 = IIIIIllII.III();
      IIIlIIII var2 = var1 != null && var1.II() != null ? var1.II().IIlIIll() : null;
      Color var3 = var2 == null
         ? new Color(IIl(1484681391, 1774656607 ^ -1746889847), IIl(1484681390, 1774656607 ^ 503424132), IIl(1484681389, 1774656607 ^ 506744450))
         : var2.lIlll();
      return new Color(var3.getRed(), var3.getGreen(), var3.getBlue(), IIl(1484681388, 1774656607 ^ 629228));
   }

   private static String ll(char[] var0, long var1, int var3) {
      int var4 = IIl(1484681387, 623270733 ^ 2120444014) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIl(1484681386, 623270733 ^ -426165924);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String III(int var0, int var1) {
      int var9 = -1632040240;
      int var2 = (var0 ^ IIl(1484681385, var9 ^ 431677898)) & IIl(1484681384, var9 ^ 882441338);
      if (I[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & IIl(1484681367, var9 ^ 272610224)) {
            case 0 -> IIl(1484681366, var9 ^ -94848813);
            case 1 -> IIl(1484681365, var9 ^ 121025118);
            case 2 -> IIl(1484681364, var9 ^ -2087310012);
            case 3 -> IIl(1484681363, var9 ^ 1803881662);
            case 4 -> IIl(1484681362, var9 ^ -1098990828);
            case 5 -> IIl(1484681361, var9 ^ -2075375528);
            case 6 -> IIl(1484681360, var9 ^ 368681291);
            case 7 -> IIl(1484681375, var9 ^ -1085124941);
            case 8 -> IIl(1484681374, var9 ^ -2028461753);
            case 9 -> IIl(1484681373, var9 ^ -165400090);
            case 10 -> IIl(1484681372, var9 ^ -143901316);
            case 11 -> IIl(1484681371, var9 ^ 1671990467);
            case 12 -> IIl(1484681370, var9 ^ 807344221);
            case 13 -> IIl(1484681369, var9 ^ 1559745494);
            case 14 -> 3;
            case 15 -> IIl(1484681368, var9 ^ -1908012618);
            case 16 -> IIl(1484681351, var9 ^ 877993258);
            case 17 -> IIl(1484681350, var9 ^ -1038718413);
            case 18 -> IIl(1484681349, var9 ^ -1851467458);
            case 19 -> IIl(1484681348, var9 ^ -1193975039);
            case 20 -> IIl(1484681347, var9 ^ -1376914548);
            case 21 -> 2;
            case 22 -> IIl(1484681346, var9 ^ 1514226860);
            case 23 -> IIl(1484681345, var9 ^ -1497798054);
            case 24 -> IIl(1484681344, var9 ^ 1057300658);
            case 25 -> IIl(1484681359, var9 ^ -17549283);
            case 26 -> IIl(1484681358, var9 ^ -338225915);
            case 27 -> IIl(1484681357, var9 ^ -1651970451);
            case 28 -> IIl(1484681356, var9 ^ -490947142);
            case 29 -> IIl(1484681355, var9 ^ -1086113377);
            case 30 -> IIl(1484681354, var9 ^ 601065926);
            case 31 -> IIl(1484681353, var9 ^ 63366810);
            case 32 -> IIl(1484681352, var9 ^ -128704402);
            case 33 -> IIl(1484681463, var9 ^ -1039132752);
            case 34 -> IIl(1484681462, var9 ^ -204003134);
            case 35 -> IIl(1484681461, var9 ^ -2136230436);
            case 36 -> IIl(1484681460, var9 ^ -1544569154);
            case 37 -> IIl(1484681459, var9 ^ 377202758);
            case 38 -> IIl(1484681458, var9 ^ 2052300336);
            case 39 -> IIl(1484681457, var9 ^ 1268405777);
            case 40 -> IIl(1484681456, var9 ^ -1905575744);
            case 41 -> IIl(1484681471, var9 ^ 14459723);
            case 42 -> IIl(1484681470, var9 ^ 1226335019);
            case 43 -> IIl(1484681469, var9 ^ -671809223);
            case 44 -> IIl(1484681468, var9 ^ 239279078);
            case 45 -> IIl(1484681467, var9 ^ -1363356116);
            case 46 -> IIl(1484681466, var9 ^ -2140053537);
            case 47 -> IIl(1484681465, var9 ^ 2043282778);
            case 48 -> IIl(1484681464, var9 ^ 1988269233);
            case 49 -> 5;
            case 50 -> IIl(1484681447, var9 ^ 1871063887);
            case 51 -> IIl(1484681446, var9 ^ 1248456149);
            case 52 -> IIl(1484681445, var9 ^ -1131492335);
            case 53 -> IIl(1484681444, var9 ^ 1749586388);
            case 54 -> IIl(1484681443, var9 ^ -1307885349);
            case 55 -> IIl(1484681442, var9 ^ 1609991116);
            case 56 -> IIl(1484681441, var9 ^ 1325410782);
            case 57 -> IIl(1484681440, var9 ^ -214811577);
            case 58 -> IIl(1484681455, var9 ^ 553083601);
            case 59 -> IIl(1484681454, var9 ^ 6928476);
            case 60 -> IIl(1484681453, var9 ^ 384610714);
            case 61 -> IIl(1484681452, var9 ^ -1254951537);
            case 62 -> IIl(1484681451, var9 ^ -184048554);
            case 63 -> IIl(1484681450, var9 ^ 2075670395);
            case 64 -> IIl(1484681449, var9 ^ 1045681084);
            case 65 -> IIl(1484681448, var9 ^ 537841160);
            case 66 -> IIl(1484681431, var9 ^ -1760013903);
            case 67 -> IIl(1484681430, var9 ^ -2076404361);
            case 68 -> IIl(1484681429, var9 ^ 1280677764);
            case 69 -> IIl(1484681428, var9 ^ 167703299);
            case 70 -> IIl(1484681427, var9 ^ 1153680584);
            case 71 -> IIl(1484681426, var9 ^ 1081271088);
            case 72 -> IIl(1484681425, var9 ^ 67996305);
            case 73 -> IIl(1484681424, var9 ^ -1106017906);
            case 74 -> IIl(1484681439, var9 ^ -972000838);
            case 75 -> IIl(1484681438, var9 ^ 352665896);
            case 76 -> IIl(1484681437, var9 ^ 1459200672);
            case 77 -> IIl(1484681436, var9 ^ -1452379978);
            case 78 -> IIl(1484681435, var9 ^ 309954606);
            case 79 -> IIl(1484681434, var9 ^ 1184847403);
            case 80 -> IIl(1484681433, var9 ^ 2090236586);
            case 81 -> IIl(1484681432, var9 ^ 1912734334);
            case 82 -> IIl(1484681415, var9 ^ -968141786);
            case 83 -> IIl(1484681414, var9 ^ -1756724280);
            case 84 -> IIl(1484681413, var9 ^ -1331311324);
            case 85 -> IIl(1484681412, var9 ^ -1875851346);
            case 86 -> IIl(1484681411, var9 ^ -782004415);
            case 87 -> IIl(1484681410, var9 ^ -864494567);
            case 88 -> IIl(1484681409, var9 ^ 1026916362);
            case 89 -> IIl(1484681408, var9 ^ -624725966);
            case 90 -> IIl(1484681423, var9 ^ 716912700);
            case 91 -> IIl(1484681422, var9 ^ -1042564113);
            case 92 -> IIl(1484681421, var9 ^ -1607427873);
            case 93 -> IIl(1484681420, var9 ^ -1826718938);
            case 94 -> IIl(1484681419, var9 ^ 772899599);
            case 95 -> IIl(1484681418, var9 ^ 1571169276);
            case 96 -> IIl(1484681417, var9 ^ 2079243509);
            case 97 -> IIl(1484681416, var9 ^ 509448135);
            case 98 -> IIl(1484681271, var9 ^ 1455621417);
            case 99 -> IIl(1484681270, var9 ^ -366830716);
            case 100 -> IIl(1484681269, var9 ^ 1270174617);
            case 101 -> IIl(1484681268, var9 ^ 1618678476);
            case 102 -> IIl(1484681267, var9 ^ -39114724);
            case 103 -> IIl(1484681266, var9 ^ -1118191756);
            case 104 -> IIl(1484681265, var9 ^ -989989059);
            case 105 -> IIl(1484681264, var9 ^ -54085718);
            case 106 -> 4;
            case 107 -> IIl(1484681279, var9 ^ 2088276937);
            case 108 -> IIl(1484681278, var9 ^ -780762542);
            case 109 -> IIl(1484681277, var9 ^ -1196840846);
            case 110 -> IIl(1484681276, var9 ^ -488028394);
            case 111 -> IIl(1484681275, var9 ^ 1599905015);
            case 112 -> IIl(1484681274, var9 ^ -109841877);
            case 113 -> IIl(1484681273, var9 ^ 712594194);
            case 114 -> IIl(1484681272, var9 ^ -1171803133);
            case 115 -> IIl(1484681255, var9 ^ 247772069);
            case 116 -> IIl(1484681254, var9 ^ -1092941967);
            case 117 -> IIl(1484681253, var9 ^ 1044848115);
            case 118 -> IIl(1484681252, var9 ^ -224336148);
            case 119 -> IIl(1484681251, var9 ^ 1636320332);
            case 120 -> IIl(1484681250, var9 ^ -59688387);
            case 121 -> IIl(1484681249, var9 ^ 294676495);
            case 122 -> IIl(1484681248, var9 ^ 429171904);
            case 123 -> IIl(1484681263, var9 ^ 101945823);
            case 124 -> IIl(1484681262, var9 ^ 65062673);
            case 125 -> IIl(1484681261, var9 ^ 83082701);
            case 126 -> IIl(1484681260, var9 ^ -2084121481);
            case 127 -> IIl(1484681259, var9 ^ -1927733064);
            case 128 -> IIl(1484681258, var9 ^ 1034462601);
            case 129 -> IIl(1484681257, var9 ^ -1955514584);
            case 130 -> IIl(1484681256, var9 ^ -1977367918);
            case 131 -> IIl(1484681239, var9 ^ 921651763);
            case 132 -> IIl(1484681238, var9 ^ -652065020);
            case 133 -> IIl(1484681237, var9 ^ -837591960);
            case 134 -> IIl(1484681236, var9 ^ 387160751);
            case 135 -> IIl(1484681235, var9 ^ -1996614441);
            case 136 -> IIl(1484681234, var9 ^ 1938808288);
            case 137 -> IIl(1484681233, var9 ^ 1923522676);
            case 138 -> IIl(1484681232, var9 ^ -315228062);
            case 139 -> IIl(1484681247, var9 ^ -1180486360);
            case 140 -> IIl(1484681246, var9 ^ -851716848);
            case 141 -> IIl(1484681245, var9 ^ -1706205863);
            case 142 -> IIl(1484681244, var9 ^ 1750737746);
            case 143 -> IIl(1484681243, var9 ^ -658696802);
            case 144 -> IIl(1484681242, var9 ^ 860284185);
            case 145 -> IIl(1484681241, var9 ^ -217984353);
            case 146 -> IIl(1484681240, var9 ^ 1324464951);
            case 147 -> IIl(1484681223, var9 ^ 862552771);
            case 148 -> 0;
            case 149 -> IIl(1484681222, var9 ^ 1741900728);
            case 150 -> IIl(1484681221, var9 ^ -1213005963);
            case 151 -> IIl(1484681220, var9 ^ 564166870);
            case 152 -> IIl(1484681219, var9 ^ 1359731068);
            case 153 -> IIl(1484681218, var9 ^ -1983290449);
            case 154 -> IIl(1484681217, var9 ^ 192305716);
            case 155 -> IIl(1484681216, var9 ^ 2079604803);
            case 156 -> IIl(1484681231, var9 ^ -1487360140);
            case 157 -> IIl(1484681230, var9 ^ 1746298527);
            case 158 -> IIl(1484681229, var9 ^ -1606726215);
            case 159 -> IIl(1484681228, var9 ^ 48967083);
            case 160 -> IIl(1484681227, var9 ^ 538966932);
            case 161 -> IIl(1484681226, var9 ^ -1083220862);
            case 162 -> IIl(1484681225, var9 ^ -351410775);
            case 163 -> IIl(1484681224, var9 ^ 2027266671);
            case 164 -> IIl(1484681335, var9 ^ 1850746090);
            case 165 -> IIl(1484681334, var9 ^ 1599020341);
            case 166 -> IIl(1484681333, var9 ^ 1637789999);
            case 167 -> IIl(1484681332, var9 ^ 462915586);
            case 168 -> IIl(1484681331, var9 ^ -1707513339);
            case 169 -> IIl(1484681330, var9 ^ 1925645056);
            case 170 -> IIl(1484681329, var9 ^ 39546152);
            case 171 -> IIl(1484681328, var9 ^ 1365380359);
            case 172 -> IIl(1484681343, var9 ^ -872266447);
            case 173 -> IIl(1484681342, var9 ^ 374053678);
            case 174 -> IIl(1484681341, var9 ^ -514972675);
            case 175 -> IIl(1484681340, var9 ^ -2020424830);
            case 176 -> IIl(1484681339, var9 ^ 409255254);
            case 177 -> IIl(1484681338, var9 ^ -1206986214);
            case 178 -> IIl(1484681337, var9 ^ 123520969);
            case 179 -> IIl(1484681336, var9 ^ -1093146299);
            case 180 -> IIl(1484681319, var9 ^ 571255865);
            case 181 -> IIl(1484681318, var9 ^ -1672131534);
            case 182 -> IIl(1484681317, var9 ^ 2134070242);
            case 183 -> 1;
            case 184 -> IIl(1484681316, var9 ^ -1134903427);
            case 185 -> IIl(1484681315, var9 ^ -165991341);
            case 186 -> IIl(1484681314, var9 ^ 222950033);
            case 187 -> IIl(1484681313, var9 ^ -1540688098);
            case 188 -> IIl(1484681312, var9 ^ 1975653904);
            case 189 -> IIl(1484681327, var9 ^ 1195479160);
            case 190 -> IIl(1484681326, var9 ^ 697137190);
            case 191 -> IIl(1484681325, var9 ^ -1017480225);
            case 192 -> IIl(1484681324, var9 ^ -1408874581);
            case 193 -> IIl(1484681323, var9 ^ 1976758219);
            case 194 -> IIl(1484681322, var9 ^ 904720945);
            case 195 -> IIl(1484681321, var9 ^ -706951127);
            case 196 -> IIl(1484681320, var9 ^ 335938146);
            case 197 -> IIl(1484681303, var9 ^ 1920460125);
            case 198 -> IIl(1484681302, var9 ^ 704485862);
            case 199 -> IIl(1484681301, var9 ^ -1916402745);
            case 200 -> IIl(1484681300, var9 ^ -1029855350);
            case 201 -> IIl(1484681299, var9 ^ -1620464384);
            case 202 -> IIl(1484681298, var9 ^ 327042172);
            case 203 -> IIl(1484681297, var9 ^ -1402767261);
            case 204 -> IIl(1484681296, var9 ^ -208122380);
            case 205 -> IIl(1484681311, var9 ^ -275982036);
            case 206 -> IIl(1484681310, var9 ^ 1854825044);
            case 207 -> IIl(1484681309, var9 ^ 1634924481);
            case 208 -> IIl(1484681308, var9 ^ 500313289);
            case 209 -> IIl(1484681307, var9 ^ -1102002640);
            case 210 -> IIl(1484681306, var9 ^ 604303734);
            case 211 -> IIl(1484681305, var9 ^ -1398737454);
            case 212 -> IIl(1484681304, var9 ^ -2083959684);
            case 213 -> IIl(1484681287, var9 ^ 408214186);
            case 214 -> IIl(1484681286, var9 ^ 1168858726);
            case 215 -> IIl(1484681285, var9 ^ 1984888649);
            case 216 -> IIl(1484681284, var9 ^ -1307380086);
            case 217 -> IIl(1484681283, var9 ^ -1811754978);
            case 218 -> IIl(1484681282, var9 ^ -1080563704);
            case 219 -> IIl(1484681281, var9 ^ -1622986055);
            case 220 -> IIl(1484681280, var9 ^ 1095549917);
            case 221 -> IIl(1484681295, var9 ^ 893416115);
            case 222 -> IIl(1484681294, var9 ^ 188653917);
            case 223 -> IIl(1484681293, var9 ^ -1158276315);
            case 224 -> IIl(1484681292, var9 ^ 351603258);
            case 225 -> IIl(1484681291, var9 ^ -1697883174);
            case 226 -> IIl(1484681290, var9 ^ -109923190);
            case 227 -> IIl(1484681289, var9 ^ 1665871555);
            case 228 -> IIl(1484681288, var9 ^ -1125977499);
            case 229 -> IIl(1484681655, var9 ^ -1789272896);
            case 230 -> IIl(1484681654, var9 ^ -1673531322);
            case 231 -> IIl(1484681653, var9 ^ 1092204913);
            case 232 -> IIl(1484681652, var9 ^ 635686748);
            case 233 -> IIl(1484681651, var9 ^ 1297783305);
            case 234 -> IIl(1484681650, var9 ^ -750261400);
            case 235 -> IIl(1484681649, var9 ^ 532260240);
            case 236 -> IIl(1484681648, var9 ^ 1456651261);
            case 237 -> IIl(1484681663, var9 ^ 1252013766);
            case 238 -> IIl(1484681662, var9 ^ 1609705241);
            case 239 -> IIl(1484681661, var9 ^ 489233252);
            case 240 -> IIl(1484681660, var9 ^ 136204578);
            case 241 -> IIl(1484681659, var9 ^ -1912363051);
            case 242 -> IIl(1484681658, var9 ^ 1368452318);
            case 243 -> IIl(1484681657, var9 ^ -1998043744);
            case 244 -> IIl(1484681656, var9 ^ -739967395);
            case 245 -> IIl(1484681639, var9 ^ 169695856);
            case 246 -> IIl(1484681638, var9 ^ 1917211798);
            case 247 -> IIl(1484681637, var9 ^ -296137037);
            case 248 -> IIl(1484681636, var9 ^ -2030873183);
            case 249 -> IIl(1484681635, var9 ^ -1109738294);
            case 250 -> IIl(1484681634, var9 ^ -872075073);
            case 251 -> IIl(1484681633, var9 ^ -506547259);
            case 252 -> IIl(1484681632, var9 ^ 2089091863);
            case 253 -> IIl(1484681647, var9 ^ -413885933);
            case 254 -> IIl(1484681646, var9 ^ -845080995);
            default -> IIl(1484681645, var9 ^ 973873422);
         };
         int var5 = (var1 & IIl(1484681644, var9 ^ 684861053)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIl(1484681643, var9 ^ 723039583)) >>> IIl(1484681642, var9 ^ 112996613)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIl(1484681641, var9 ^ 1201947295);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIl(1484681640, var9 ^ 1357317911);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }

   public llIllllI() {
      super(IlIIllIII.Ill(II[2]), lllIIlIl.IIl, IlIIllIII.Ill(II[0]));
      this.ll = this.IllIIll(new IllIII<>((Object)IlIIllIII.lI(II[1]), IlIIIIllI.class, IlIIIIllI.II));
   }
}
