package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIlIllIII {
   l,
   Il;

   private static String[] I;
   private static final Object[] Ill;
   private static final int[] IIl;
   private static final String[] IlI;
   private static final String[] II;
   private final IIIlIlIl lI;
   private static final String[] ll;
   private static final IIlIllIII[] III;

   private static String III(int var0, int var1) {
      int var3 = var0 ^ 2049444241;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1733441050;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 9;
            case 1 -> 66;
            case 2 -> 10;
            case 3 -> 245;
            case 4 -> 108;
            case 5 -> 23;
            case 6 -> 104;
            case 7 -> 75;
            case 8 -> 249;
            case 9 -> 224;
            case 10 -> 81;
            case 11 -> 172;
            case 12 -> 195;
            case 13 -> 62;
            case 14 -> 84;
            case 15 -> 49;
            case 16 -> 77;
            case 17 -> 144;
            case 18 -> 181;
            case 19 -> 163;
            case 20 -> 59;
            case 21 -> 138;
            case 22 -> 34;
            case 23 -> 36;
            case 24 -> 89;
            case 25 -> 11;
            case 26 -> 7;
            case 27 -> 145;
            case 28 -> 27;
            case 29 -> 249;
            case 30 -> 223;
            case 31 -> 7;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static void I() {
      int var0 = -963362840;
      I[0] = Il(II(ll(1378650828, var0 ^ 1118305515), ll(1378650829, var0 ^ -1968536744)).toCharArray(), 89731L, ll(1378650830, var0 ^ -915877835));
      I[1] = Il(II(ll(1378650831, var0 ^ 1775746357), ll(1378650824, var0 ^ 595460143)).toCharArray(), 7379L, ll(1378650825, var0 ^ -251465101));
      I[2] = Il(II(ll(1378650826, var0 ^ -1040987874), ll(1378650827, var0 ^ 191638567)).toCharArray(), 96190L, ll(1378650820, var0 ^ 1126404055));
      I[3] = Il(II(ll(1378650821, var0 ^ -1906157687), ll(1378650822, var0 ^ 884465788)).toCharArray(), 96819L, ll(1378650823, var0 ^ 323946776));
   }

   private static int ll(int var0, int var1) {
      int var2 = IIl[var0 ^ 1378650828] ^ var1 ^ var0;
      var2 ^= 50112;
      var2 -= 3720;
      var2 ^= 53068;
      var2 += 14767;
      var2 ^= 62550;
      var2 ^= 58763;
      var2 -= 42479;
      var2 ^= 56922;
      return var2 - 54563;
   }

   @Override
   public String toString() {
      return this.lI.llIl();
   }

   public static IIlIllIII l(String var0) {
      return Enum.valueOf(IIlIllIII.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 72576259;
      int var10001 = "\u0011嶑萝砝窵舁ဎ쌭ᴠ隍䣋ࢋⱯ㤋鮥ⴺ嗍\uec89\f䅔克磃좹ഝ㧑跞砜䆁\udc46㇐ẽ".length();
      String[] var9 = new String[2];
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\u0011嶑萝砝窵舁ဎ쌭ᴠ隍䣋ࢋⱯ㤋鮥ⴺ嗍\uec89\f䅔克磃좹ഝ㧑跞砜䆁\udc46㇐ẽ";
      int var11 = 0;
      short var12 = 29555;

      do {
         char var13 = var7.charAt(var11);
         var10001 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10001 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 69;
               case 1 -> 58;
               case 2 -> 92;
               case 3 -> 227;
               case 4 -> 219;
               case 5 -> 72;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IlI = var9;
      Ill = new Object[var9.length];
      int var21 = 0;
      int var25 = 0;
      IIl = new int[283];
      byte[] var10002 = "< Uaô,\u001b¼8,fË\u0017P\u0016S]ø¥!Áæ\\\u0094¿t`\u008fuë ´ß\u001e\u0016wðåþ\u0014J1É\u009c×\u000e\u0086ÞÖî0\u008d\u009b®>Hg\bõ\u0016^ý½{&ûûÜ\u000eÕ\u009c\u0017\u0096b¢-¿ì\u0087æéw3~ñ$¨BPÿè3àîÝLÞ7ë\u0095cm{´\u000b6)J¶Þ%\u0005\u008a\u001cö'/\u0082\u0015\u0082ð¢®Òö\u0002¥'\n£<ãG*ÿ¡°öÿzø½ÇÓÍ¹3\u008bx{x^-8\u0016\u0000\u0091W³wX¯ÖÃvä±(\u0092yÃ¼\u0018¸ÏH3To\u0002S\u008fºYÕ\u0016´\u0093°Qb\u0012Ê\u0084©\u0089\u00883ho«BË³GM\u0098ý¨ÍW\r\u0000LUúâ¢6óç#\u0011gî¿\u001c\u0096|¹\u0084\u0080\r\u0001\u009eò\u008aâUÄQjÈÛ%Àõ.#Övê\u0016\u0012\u0097¶«\u0086|\u0095¿âõ9\u0018/`§ð;þ\u001e,ñ`Åô¿%ËµRõ}2Æ|À\u008e*¨û\u008a\"mN\u0093\u0013ÌêÈÜ¦ WøÕ§a[\u0088\u0014\u009e\u0014Û\u008c¹\u009b\u0086s9\u009d ¶9\u0081FèÚúbâ\u00ada½uó\u0017mxÈÅì]Stå\u000f´::ÒÎ\u0002\u008c\u0014P\u009aô}\u0093?P>ç³FI\u0087\u0013]\u00150ÙN\u008f\u009b\b!¿÷÷\u0084)´ï\u0018<öÅ8¤ä§¥\u0094¡Öu\u009cAÈxIÏ%Uë\u0017e\t\u009f\u008d\u000fu²nÀ\u009bGW\u008d¹\u0088Ê\u0097\b\u0095ÒlöÑ'\u0002\u0087ù¥Ø«\u001d\u0001û¬Ó¥ Zñ©\u000båÚió \u0000z\u00899\u008dLBæø¸\u0002Ä+\u0017q²&a¾\u00965st:þ£«±H\u0089[Îî¦þKØP\u0000§¼óÔÒäj\u0091Ü3ðK\u0099ï½Ü½\u0080Íz7UIXåÿÖ~\u0002Ü\u0092:gmÃ\u0014\u0003I<áKé¹D0[ÛÍ\u00845°ñUÂ\u0083\u001fâgªà\u009c\b\u000bs`¶\u001fzµUw\u000fÆ÷ÖB6øJó\u0096¦\u009d¡üÚ\u009df`ÔÏÉ!Ëzg\u008eÈ\u007fU%Ë\u0006È¢¬D¨\u008c\u0012Í\u000bÜ°¥ùõ\"ÙMÆ?½í\u001e\u009b\u009bt\u001a\u000e¼hf\u0004\u0096SG2Ø0\u009bê 2¼C\u0014?Ë°`sÄÙ7+Ç6\u0087Yq¼\u0000yÄ 'À=\u0014\u00023¦\"Ý__¾\u0092 Ó\u0082ãïD%:X\u009e°\u00ad\u008bæ5)>I\u0090×äj²°£¥¿:¦\u0089(\u001c§\u0082_ ð\u00045Vâ\u0086ÏMØ\u0019\u0014¿ªW\u0093¬SQ\u0000\u0095\u0080Äè\u0015\u00101\u0013ôQõ\u0098;\u008bN\u0087µ\u008aöÉ\u00adV\u009f:ê\u0098.ÓÖ¥\u0085%\b/*\u009e\u0007l\\\u008b]<T\u0007ª\u00814÷\u009bS Sq6XmÆø\u008cp4ª\u001c;Y\u0007ÐNÐ6¦>Tg\u0015\u0011²tzrm\u0017\u0016cµ\u0014\u0016\u000e*\u001eÈöæ$MRPt\u000e\u001b\u008f¤fãü\u001f÷v\u000eñ\u000b\u0013lPºÄ\u0007Èé»\u0095bPäÕ\u0000\u009f\u008c\u001d\tNÔ\u0089\u0015\u001d\b\u000f#\u00adTÞ\u0013#V¸²9F\u0088\u000f/Û¦\u000fëªÇ\tG×\u008a\u009c«\u0093½\u0091Q\u009cfRA\u008eÔÀq<ªP\u008f\u009e¬?\u0002\u008eÂ®U0±U\u0017\u009bëwó\u0082\u008aièí½?~¿ýeA\u001b{\u009f×\\Ä©§\u0014ûq(D½\u0083,\u00869üð«´OÄn%®> \u009eç,'Uh_\u00ad\u001f\u0002ìÉq\u0084\u0006~Õá\u001fu\u000f;/¸\u009a\u0017g\u0082=\u0011ÝSÜ\u0012Bò{_\u0016Ði=ÈÂ»c\u0095djo\u0002\u0019\u008av&°áP\u0006\u0011\u0097\u00930\u001búÃ;7*Ü-F¬_nJ\u0002ÙÒ6Ô\u0099Í\u008fMF`¾\u0018\u0088E¢ô:ð\u0085Èôl®\u001d?0,Â\u009dý4måS\u0097\u000f\u0013ø*\u0005F/Â¤\u008eÑIDç5\u008dQz\u0013=>ª7^\u0006º©f\u001e¼æJ\u0082/åþ\u009f[¹§oùá\u0018ûº\u008dúb@ËæÛmõ¬"
         .getBytes("ISO-8859-1");

      int var56;
      do {
         IIl[var21] = ((var10002[var25] & 255) << 24 | (var10002[var25 + 1] & 255) << 16 | (var10002[var25 + 2] & 255) << 8 | var10002[var25 + 3] & 255)
            ^ -364996961;
         var21 += 1;
         var56 = var25 + 4;
         var25 += 4;
      } while (var56 < var10002.length);

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III(2049444241, var17 ^ 55460698)).length();
      int var1 = ll(1378651100, var17 ^ -123326265);
      int var19 = -1;

      label101:
      while (true) {
         var21 = ll(1378651101, var17 ^ -314894200);
         String var28 = var2.substring(++var19, var19 + var1);
         byte var40 = -1;

         while (true) {
            label96: {
               char[] var58 = var28.toCharArray();
               int var70 = var58.length;
               int var6 = 0;
               var56 = var21;
               var45 = var58;
               var25 = var70;
               char[] var82;
               int var89;
               if (var70 <= 1) {
                  var82 = var58;
                  var70 = var21;
                  var89 = var6;
               } else {
                  var56 = var21;
                  var25 = var70;
                  if (var70 <= var6) {
                     break label96;
                  }

                  var82 = var58;
                  var70 = var21;
                  var89 = var6;
               }

               while (true) {
                  var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % ll(1378651103, var17 ^ -1157913918)) {
                     case 0 -> ll(1378651096, var17 ^ -1560419472);
                     case 1 -> ll(1378651097, var17 ^ 1047453888);
                     case 2 -> ll(1378651098, var17 ^ 588954776);
                     case 3 -> ll(1378651099, var17 ^ -742857646);
                     case 4 -> ll(1378651092, var17 ^ 1207666819);
                     case 5 -> ll(1378651093, var17 ^ -570310635);
                     default -> ll(1378651094, var17 ^ 1730998526);
                  });
                  var6++;
                  if (var56 == 0) {
                     var89 = var56;
                     var82 = var45;
                     var70 = var56;
                  } else {
                     if (var25 <= var6) {
                        break;
                     }

                     var82 = var45;
                     var70 = var56;
                     var89 = var6;
                  }
               }
            }

            String var63 = new String(var45).intern();
            switch (var40) {
               case 0:
                  var5[var3++] = var63;
                  if ((var19 += var1) >= var4) {
                     II = var5;
                     ll = new String[4];
                     I = new String[4];
                     I();
                     l = new IIlIllIII(IlIIllIII.lI(I[3]));
                     Il = new IIlIllIII(IlIIllIII.lI(I[2]));
                     III = lI();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var63;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label101;
                  }

                  var4 = (var2 = III(2049444240, var17 ^ -2063591436)).length();
                  var1 = ll(1378651102, var17 ^ -2098515400);
                  var19 = -1;
            }

            var21 = 5;
            var28 = var2.substring(++var19, var19 + var1);
            var40 = 0;
         }
      }
   }

   private IIlIllIII(String var3) {
      this.lI = IlIIllIII.lII(var3);
   }

   private static String II(int var0, int var1) {
      int var9 = 1972162600;
      int var2 = (var0 ^ ll(1378650816, var9 ^ 460420822)) & ll(1378650817, var9 ^ 1446086449);
      if (ll[var2] == null) {
         char[] var3 = II[var2].toCharArray();

         int var4 = switch (var3[0] & ll(1378650818, var9 ^ -1432965780)) {
            case 0 -> ll(1378650819, var9 ^ -1822227096);
            case 1 -> ll(1378650844, var9 ^ -345685326);
            case 2 -> ll(1378650845, var9 ^ -1018483834);
            case 3 -> ll(1378650846, var9 ^ 1543248730);
            case 4 -> ll(1378650847, var9 ^ 1920086030);
            case 5 -> ll(1378650840, var9 ^ 619283540);
            case 6 -> ll(1378650841, var9 ^ 1018830778);
            case 7 -> ll(1378650842, var9 ^ -1654566865);
            case 8 -> ll(1378650843, var9 ^ 762340694);
            case 9 -> ll(1378650836, var9 ^ 329864092);
            case 10 -> ll(1378650837, var9 ^ -1359754231);
            case 11 -> ll(1378650838, var9 ^ -962027868);
            case 12 -> ll(1378650839, var9 ^ 2067832125);
            case 13 -> ll(1378650832, var9 ^ 1199718795);
            case 14 -> ll(1378650833, var9 ^ -501439877);
            case 15 -> ll(1378650834, var9 ^ 1027348184);
            case 16 -> ll(1378650835, var9 ^ 1000144210);
            case 17 -> ll(1378650860, var9 ^ -952277833);
            case 18 -> ll(1378650861, var9 ^ -1967871617);
            case 19 -> ll(1378650862, var9 ^ 2103985722);
            case 20 -> ll(1378650863, var9 ^ 891514919);
            case 21 -> ll(1378650856, var9 ^ 2581823);
            case 22 -> ll(1378650857, var9 ^ -1243230281);
            case 23 -> ll(1378650858, var9 ^ -525947066);
            case 24 -> ll(1378650859, var9 ^ 1556679181);
            case 25 -> ll(1378650852, var9 ^ -1791922440);
            case 26 -> ll(1378650853, var9 ^ -1149630188);
            case 27 -> ll(1378650854, var9 ^ 1609005774);
            case 28 -> ll(1378650855, var9 ^ -718898991);
            case 29 -> ll(1378650848, var9 ^ -20301975);
            case 30 -> ll(1378650849, var9 ^ -1643049592);
            case 31 -> ll(1378650850, var9 ^ 411566956);
            case 32 -> ll(1378650851, var9 ^ 2110774079);
            case 33 -> ll(1378650876, var9 ^ 119152145);
            case 34 -> ll(1378650877, var9 ^ 1168981984);
            case 35 -> ll(1378650878, var9 ^ 1725723377);
            case 36 -> ll(1378650879, var9 ^ -1965874816);
            case 37 -> ll(1378650872, var9 ^ 1699999346);
            case 38 -> ll(1378650873, var9 ^ -841817567);
            case 39 -> ll(1378650874, var9 ^ 792494392);
            case 40 -> ll(1378650875, var9 ^ 717072393);
            case 41 -> ll(1378650868, var9 ^ 589409075);
            case 42 -> ll(1378650869, var9 ^ -1322790139);
            case 43 -> ll(1378650870, var9 ^ -1063311469);
            case 44 -> ll(1378650871, var9 ^ 1199369353);
            case 45 -> ll(1378650864, var9 ^ -1661701757);
            case 46 -> ll(1378650865, var9 ^ -396475692);
            case 47 -> ll(1378650866, var9 ^ -297218094);
            case 48 -> ll(1378650867, var9 ^ -611569751);
            case 49 -> ll(1378650764, var9 ^ 1712900887);
            case 50 -> ll(1378650765, var9 ^ 1920748590);
            case 51 -> ll(1378650766, var9 ^ -709764659);
            case 52 -> ll(1378650767, var9 ^ 1034241884);
            case 53 -> ll(1378650760, var9 ^ -512764037);
            case 54 -> ll(1378650761, var9 ^ 958501555);
            case 55 -> ll(1378650762, var9 ^ 2026677167);
            case 56 -> ll(1378650763, var9 ^ -10959488);
            case 57 -> ll(1378650756, var9 ^ 1135874252);
            case 58 -> ll(1378650757, var9 ^ 1203559110);
            case 59 -> ll(1378650758, var9 ^ 1586330441);
            case 60 -> ll(1378650759, var9 ^ 88219569);
            case 61 -> ll(1378650752, var9 ^ -1704566220);
            case 62 -> ll(1378650753, var9 ^ -1396363083);
            case 63 -> ll(1378650754, var9 ^ 1401580556);
            case 64 -> ll(1378650755, var9 ^ 1946500650);
            case 65 -> ll(1378650780, var9 ^ -201124058);
            case 66 -> ll(1378650781, var9 ^ -199233208);
            case 67 -> ll(1378650782, var9 ^ 392484212);
            case 68 -> ll(1378650783, var9 ^ 1627325699);
            case 69 -> ll(1378650776, var9 ^ 1049221852);
            case 70 -> ll(1378650777, var9 ^ 89873379);
            case 71 -> ll(1378650778, var9 ^ -1628810539);
            case 72 -> ll(1378650779, var9 ^ 2040824783);
            case 73 -> ll(1378650772, var9 ^ 60570603);
            case 74 -> ll(1378650773, var9 ^ -1660664842);
            case 75 -> ll(1378650774, var9 ^ 1587669348);
            case 76 -> ll(1378650775, var9 ^ 707599955);
            case 77 -> ll(1378650768, var9 ^ 1250814611);
            case 78 -> ll(1378650769, var9 ^ -45614816);
            case 79 -> ll(1378650770, var9 ^ 1452709398);
            case 80 -> ll(1378650771, var9 ^ 979973057);
            case 81 -> ll(1378650796, var9 ^ 2037489746);
            case 82 -> ll(1378650797, var9 ^ 995856195);
            case 83 -> ll(1378650798, var9 ^ 691608770);
            case 84 -> ll(1378650799, var9 ^ 1816710307);
            case 85 -> ll(1378650792, var9 ^ -1940512766);
            case 86 -> ll(1378650793, var9 ^ 45870274);
            case 87 -> ll(1378650794, var9 ^ -621035908);
            case 88 -> ll(1378650795, var9 ^ 1083253598);
            case 89 -> ll(1378650788, var9 ^ -1554068039);
            case 90 -> ll(1378650789, var9 ^ -1710027215);
            case 91 -> ll(1378650790, var9 ^ 118075788);
            case 92 -> ll(1378650791, var9 ^ 535970074);
            case 93 -> ll(1378650784, var9 ^ -358817833);
            case 94 -> ll(1378650785, var9 ^ 1749422623);
            case 95 -> ll(1378650786, var9 ^ -865731834);
            case 96 -> 3;
            case 97 -> 1;
            case 98 -> ll(1378650787, var9 ^ 1757340655);
            case 99 -> ll(1378650812, var9 ^ 1687507484);
            case 100 -> ll(1378650813, var9 ^ -1536297224);
            case 101 -> ll(1378650814, var9 ^ -1223192991);
            case 102 -> ll(1378650815, var9 ^ -2116267651);
            case 103 -> ll(1378650808, var9 ^ 1973189697);
            case 104 -> ll(1378650809, var9 ^ -621869614);
            case 105 -> ll(1378650810, var9 ^ -1407177116);
            case 106 -> ll(1378650811, var9 ^ -1091924626);
            case 107 -> ll(1378650804, var9 ^ 1849026490);
            case 108 -> ll(1378650805, var9 ^ 1153791934);
            case 109 -> ll(1378650806, var9 ^ 1801518118);
            case 110 -> ll(1378650807, var9 ^ -1650585500);
            case 111 -> ll(1378650800, var9 ^ 1045062963);
            case 112 -> ll(1378650801, var9 ^ -1492163227);
            case 113 -> ll(1378650802, var9 ^ 1037381225);
            case 114 -> ll(1378650803, var9 ^ 1883374726);
            case 115 -> ll(1378650700, var9 ^ 14974989);
            case 116 -> ll(1378650701, var9 ^ -2067374758);
            case 117 -> ll(1378650702, var9 ^ 467712588);
            case 118 -> ll(1378650703, var9 ^ 1604636737);
            case 119 -> ll(1378650696, var9 ^ 243971151);
            case 120 -> ll(1378650697, var9 ^ -243270463);
            case 121 -> ll(1378650698, var9 ^ 1960479164);
            case 122 -> ll(1378650699, var9 ^ 374553748);
            case 123 -> ll(1378650692, var9 ^ 2104484492);
            case 124 -> ll(1378650693, var9 ^ 1317100509);
            case 125 -> ll(1378650694, var9 ^ 1736320159);
            case 126 -> ll(1378650695, var9 ^ -957491297);
            case 127 -> 5;
            case 128 -> ll(1378650688, var9 ^ -756806493);
            case 129 -> ll(1378650689, var9 ^ -1164873261);
            case 130 -> 0;
            case 131 -> ll(1378650690, var9 ^ 467435964);
            case 132 -> ll(1378650691, var9 ^ -2022891128);
            case 133 -> ll(1378650716, var9 ^ 1346323715);
            case 134 -> ll(1378650717, var9 ^ 1358485586);
            case 135 -> ll(1378650718, var9 ^ 39287157);
            case 136 -> ll(1378650719, var9 ^ -1208404189);
            case 137 -> ll(1378650712, var9 ^ -1295289627);
            case 138 -> ll(1378650713, var9 ^ -883549322);
            case 139 -> ll(1378650714, var9 ^ -1992936010);
            case 140 -> ll(1378650715, var9 ^ 9792492);
            case 141 -> ll(1378650708, var9 ^ 1751597605);
            case 142 -> ll(1378650709, var9 ^ 349404847);
            case 143 -> ll(1378650710, var9 ^ 1886627338);
            case 144 -> ll(1378650711, var9 ^ 1458195458);
            case 145 -> ll(1378650704, var9 ^ 1912000811);
            case 146 -> ll(1378650705, var9 ^ 1540223100);
            case 147 -> ll(1378650706, var9 ^ 363736280);
            case 148 -> ll(1378650707, var9 ^ -307492077);
            case 149 -> ll(1378650732, var9 ^ -643722411);
            case 150 -> ll(1378650733, var9 ^ -1376947252);
            case 151 -> ll(1378650734, var9 ^ -88768791);
            case 152 -> ll(1378650735, var9 ^ 1254606554);
            case 153 -> ll(1378650728, var9 ^ -840469531);
            case 154 -> ll(1378650729, var9 ^ -362902903);
            case 155 -> ll(1378650730, var9 ^ -810741424);
            case 156 -> ll(1378650731, var9 ^ 281143043);
            case 157 -> ll(1378650724, var9 ^ 1606314582);
            case 158 -> ll(1378650725, var9 ^ 779222494);
            case 159 -> ll(1378650726, var9 ^ -138008171);
            case 160 -> ll(1378650727, var9 ^ 1612013523);
            case 161 -> ll(1378650720, var9 ^ -459211038);
            case 162 -> ll(1378650721, var9 ^ 444257139);
            case 163 -> ll(1378650722, var9 ^ 2101154514);
            case 164 -> ll(1378650723, var9 ^ -147267818);
            case 165 -> ll(1378650748, var9 ^ -784737623);
            case 166 -> ll(1378650749, var9 ^ -311512232);
            case 167 -> ll(1378650750, var9 ^ -1686356103);
            case 168 -> ll(1378650751, var9 ^ -2142879280);
            case 169 -> ll(1378650744, var9 ^ 1916010933);
            case 170 -> ll(1378650745, var9 ^ 1640883743);
            case 171 -> ll(1378650746, var9 ^ 1478401050);
            case 172 -> ll(1378650747, var9 ^ -661748162);
            case 173 -> ll(1378650740, var9 ^ 969886839);
            case 174 -> ll(1378650741, var9 ^ -166331946);
            case 175 -> ll(1378650742, var9 ^ 2014593424);
            case 176 -> ll(1378650743, var9 ^ 1623730365);
            case 177 -> ll(1378650736, var9 ^ 654743974);
            case 178 -> ll(1378650737, var9 ^ 456867208);
            case 179 -> ll(1378650738, var9 ^ -978218224);
            case 180 -> ll(1378650739, var9 ^ -890049593);
            case 181 -> ll(1378650636, var9 ^ -1868370722);
            case 182 -> ll(1378650637, var9 ^ 1730118409);
            case 183 -> ll(1378650638, var9 ^ 1456314188);
            case 184 -> ll(1378650639, var9 ^ -1129779388);
            case 185 -> ll(1378650632, var9 ^ 191249217);
            case 186 -> ll(1378650633, var9 ^ -113990243);
            case 187 -> ll(1378650634, var9 ^ -1801877712);
            case 188 -> ll(1378650635, var9 ^ 497553740);
            case 189 -> ll(1378650628, var9 ^ -1711693218);
            case 190 -> ll(1378650629, var9 ^ 2146053171);
            case 191 -> 4;
            case 192 -> ll(1378650630, var9 ^ -1601589624);
            case 193 -> ll(1378650631, var9 ^ 2022354920);
            case 194 -> ll(1378650624, var9 ^ -411009084);
            case 195 -> ll(1378650625, var9 ^ 733672839);
            case 196 -> ll(1378650626, var9 ^ -1645561983);
            case 197 -> ll(1378650627, var9 ^ 1111154519);
            case 198 -> ll(1378650652, var9 ^ 830578995);
            case 199 -> ll(1378650653, var9 ^ -1016089965);
            case 200 -> ll(1378650654, var9 ^ -1580274261);
            case 201 -> ll(1378650655, var9 ^ -900309422);
            case 202 -> ll(1378650648, var9 ^ 1492969535);
            case 203 -> ll(1378650649, var9 ^ 413018240);
            case 204 -> ll(1378650650, var9 ^ -795347431);
            case 205 -> ll(1378650651, var9 ^ 1150002643);
            case 206 -> ll(1378650644, var9 ^ -1027795802);
            case 207 -> ll(1378650645, var9 ^ 328047354);
            case 208 -> ll(1378650646, var9 ^ 1965854373);
            case 209 -> ll(1378650647, var9 ^ 1167169288);
            case 210 -> ll(1378650640, var9 ^ 1804685861);
            case 211 -> ll(1378650641, var9 ^ 177729772);
            case 212 -> ll(1378650642, var9 ^ 1191318139);
            case 213 -> ll(1378650643, var9 ^ 1880090652);
            case 214 -> ll(1378650668, var9 ^ -1412630196);
            case 215 -> ll(1378650669, var9 ^ 425642338);
            case 216 -> 2;
            case 217 -> ll(1378650670, var9 ^ 1741568229);
            case 218 -> ll(1378650671, var9 ^ 1637987749);
            case 219 -> ll(1378650664, var9 ^ 254807447);
            case 220 -> ll(1378650665, var9 ^ 2093723261);
            case 221 -> ll(1378650666, var9 ^ 652823042);
            case 222 -> ll(1378650667, var9 ^ 1207418503);
            case 223 -> ll(1378650660, var9 ^ 1889651052);
            case 224 -> ll(1378650661, var9 ^ 821818903);
            case 225 -> ll(1378650662, var9 ^ -1241420079);
            case 226 -> ll(1378650663, var9 ^ 154661228);
            case 227 -> ll(1378650656, var9 ^ 921665297);
            case 228 -> ll(1378650657, var9 ^ 1880988562);
            case 229 -> ll(1378650658, var9 ^ -194885741);
            case 230 -> ll(1378650659, var9 ^ 2043769625);
            case 231 -> ll(1378650684, var9 ^ -399472159);
            case 232 -> ll(1378650685, var9 ^ 1400468630);
            case 233 -> ll(1378650686, var9 ^ -1728649718);
            case 234 -> ll(1378650687, var9 ^ -761506547);
            case 235 -> ll(1378650680, var9 ^ -1139098011);
            case 236 -> ll(1378650681, var9 ^ 411018929);
            case 237 -> ll(1378650682, var9 ^ -1029334805);
            case 238 -> ll(1378650683, var9 ^ 1468649656);
            case 239 -> ll(1378650676, var9 ^ -259037963);
            case 240 -> ll(1378650677, var9 ^ 294451982);
            case 241 -> ll(1378650678, var9 ^ -1228820683);
            case 242 -> ll(1378650679, var9 ^ -1532788775);
            case 243 -> ll(1378650672, var9 ^ 1996300803);
            case 244 -> ll(1378650673, var9 ^ -1477331638);
            case 245 -> ll(1378650674, var9 ^ 1206423980);
            case 246 -> ll(1378650675, var9 ^ 751747008);
            case 247 -> ll(1378651084, var9 ^ 1510836299);
            case 248 -> ll(1378651085, var9 ^ 928877994);
            case 249 -> ll(1378651086, var9 ^ -415066767);
            case 250 -> ll(1378651087, var9 ^ 1640053191);
            case 251 -> ll(1378651080, var9 ^ -817403270);
            case 252 -> ll(1378651081, var9 ^ 419920649);
            case 253 -> ll(1378651082, var9 ^ -2133272989);
            case 254 -> ll(1378651083, var9 ^ -719916176);
            default -> ll(1378651076, var9 ^ 967067179);
         };
         int var5 = (var1 & ll(1378651077, var9 ^ 90846675)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(1378651078, var9 ^ -794785710)) >>> ll(1378651079, var9 ^ 251872590)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(1378651072, var9 ^ -1602549009);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(1378651073, var9 ^ -1030905517);
            }
         }

         ll[var2] = new String(var3).intern();
      }

      return ll[var2];
   }

   private static String Il(char[] var0, long var1, int var3) {
      int var4 = ll(1378651074, 1380571934 ^ 1445781379) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(1378651075, 1380571934 ^ 1322615556);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static IIlIllIII[] lI() {
      return new IIlIllIII[]{l, Il};
   }
}
