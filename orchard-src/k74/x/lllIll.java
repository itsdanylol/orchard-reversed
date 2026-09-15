package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lllIll {
   l,
   II,
   Il,
   lI,
   III,
   IIl,
   lII;
   private final IIIlIlIl I;
   private static final int[] lIl;
   private static final String[] ll;
   private static final String[] llI;
   private static final String[] IlI;
   private static final Object[] lll;
   private static final lllIll[] Ill;

   static lllIll I(String var0) {
      int var6 = 1803440156;
      String[] var1 = IIllllIl.IIIIl();
      if (var0 != null) {
         if (IlIIllIII.lI(Il(IIl(-995836204, var6 ^ -895746448), IIl(-995836203, var6 ^ -134177932))).equals(var0)) {
            return lII;
         }

         if (IlIIllIII.lI(Il(IIl(-995836202, var6 ^ 209942100), IIl(-995836201, var6 ^ 918867364))).equals(var0)) {
            return l;
         }

         if (IlIIllIII.lI(Il(IIl(-995836208, var6 ^ 1976540810), IIl(-995836207, var6 ^ -41044522))).equals(var0)) {
            return IIl;
         }

         for (lllIll var5 : values()) {
            if (IllIl.l(var5, var0)) {
               return var5;
            }

            if (var1 != null) {
               break;
            }
         }
      }

      return Il;
   }

   public static lllIll l(String var0) {
      return Enum.valueOf(lllIll.class, var0);
   }

   private static lllIll[] II() {
      lllIll[] var10000 = new lllIll[IIl(-995836206, -1267108956 ^ -825137687)];
      var10000[0] = Il;
      var10000[1] = II;
      var10000[2] = lII;
      var10000[3] = III;
      var10000[4] = l;
      var10000[5] = IIl;
      var10000[IIl(-995836205, -1267108956 ^ 714597640)] = lI;
      return var10000;
   }

   private static String IlI(int var0, int var1) {
      int var3 = var0 ^ -686990440;
      char[] var4 = llI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])lll[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         lll[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1390611316;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 39;
            case 1 -> 182;
            case 2 -> 216;
            case 3 -> 192;
            case 4 -> 72;
            case 5 -> 203;
            case 6 -> 152;
            case 7 -> 239;
            case 8 -> 150;
            case 9 -> 184;
            case 10 -> 144;
            case 11 -> 52;
            case 12 -> 89;
            case 13 -> 126;
            case 14 -> 18;
            case 15 -> 130;
            case 16 -> 112;
            case 17 -> 178;
            case 18 -> 153;
            case 19 -> 77;
            case 20 -> 103;
            case 21 -> 84;
            case 22 -> 160;
            case 23 -> 34;
            case 24 -> 8;
            case 25 -> 66;
            case 26 -> 175;
            case 27 -> 232;
            case 28 -> 198;
            case 29 -> 136;
            case 30 -> 179;
            case 31 -> 142;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -1064884672;
      int var10 = 0;
      int var11 = 0;
      String[] var10002 = new String[2];
      short var12 = 16877;
      String[] var9 = var10002;
      int var8 = "j쯙맆줙링쿙駄쏉ে컉짊춹槀쏹䧀쌩㧆슉駄컹짏읹\u19cc쉉꧈켙직얉⧉착꧋슙\u09ca씙䧎졹秎셹䧃츉䧋쪹ৌ쾹\u09c5쏹꧁켩姀쁩駃승\ud9cd쥩⧄찉ূ쭹遼쟹ꧏ젹\ue9cf쁙맍솉꧉숹ᧂ읉种츉蓼쟉\ud9c9승⧆쪉姀엩䧍섉⧆쓩맃쥉맂웩構쨙柳쁉㧈쬉만샩맆쩹㧎칩⧃쯙\u19cb쩙槌즉㧃\f鯯뾔雟ᾓ鈯ྙ骿辑閿侑錏澜"
         .length();
      String var7 = "j쯙맆줙링쿙駄쏉ে컉짊춹槀쏹䧀쌩㧆슉駄컹짏읹\u19cc쉉꧈켙직얉⧉착꧋슙\u09ca씙䧎졹秎셹䧃츉䧋쪹ৌ쾹\u09c5쏹꧁켩姀쁩駃승\ud9cd쥩⧄찉ূ쭹遼쟹ꧏ젹\ue9cf쁙맍솉꧉숹ᧂ읉种츉蓼쟉\ud9c9승⧆쪉姀엩䧍섉⧆쓩맃쥉맂웩構쨙柳쁉㧈쬉만샩맆쩹㧎칩⧃쯙\u19cb쩙槌즉㧃\f鯯뾔雟ᾓ鈯ྙ骿辑閿侑錏澜";

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

      llI = var9;
      lll = new Object[var9.length];
      int var10000 = 0;
      lIl = new int[309];
      int var10001 = 0;
      byte[] var31 = "K#k\u001cy¹zg\u008d;ã@·|¯rôw\u000bü\u0083Ê\u0006U\u0090o¿&t)?ÙÊn³\u0085Ù9&^\u0098ÿ·\u000f±\u0096\u0013ª)Dx^¾\u0084Ö;é\u0017Nø\"ê£Gu4dØi]O5×Ëy!*O`F:CGn¿\r\u009bq\u0002¾?´\u001b\u0093¥ÿË \u000f¥ïÈMM\u00adÔ {ðAÒ\u0080Ö\u0006Ô¼Úå\u0089\u0091ÞF.x\";z\u008c´¢\u0005è\u0004Õ°\u0001¹¶¸x\u008cÒârBÛ\u0091Ç°ýõbö§\tR}jé1B3¾Iëåknrcë\u0086\u009b\u008dÞà¸Er·/Z3'\u0012a_ù\u0010[\u0098ñç\u008eµÑÍúõ\u0083\u0092Ãð\u000e\u0092éZ$UÖ-A\u008dùX¬&ïX×ÒGÅ\u0019*\u000fWg\u0083qd´Ê\u0094¿'a|WM\n³s99ìk@Q\u0080S>þ%ë¸4µ·ò¿\u0015®çå÷\u001c$á¯\u009d§{\u00ad\u0004\u0000íÊ*£\u0085ó\u0085èª8¯¿©U\u001cà ¾³Þ\u0001!ù¦\u0007ÿ\u0007Íf\u0084ãNVABÑ`±\u001dGn\u00adJ\u009e\n\u0003ARkÎ³HÇn\u0005¼\u0092ðò®Y@\":\u0003h¼£¼D37êñ\u0003]8¥Èl \u0011\u0099 ¥\u0016°æó 4é[Õ´Ú\u0095\u00138ú[Ü\u0082ÐÝ\bB¡y'\\k\u0002Ó®ps[©âÝd¶¸äÃWS§\u001eÞPÝ\u000bóÖ\u009d_TÜà`Äæ\f9\u0096À_\u0013J&%ó$¢\u0002®=ÍÌñ\u0085b\u008e%Öa\u0007Qf|ß¾Qóc¬ï\u0091];O\u001a´c\u0088\u0016¦AçH\u008aÙYpÙ4CµMë\u00166å¼\u0091°1g®¢`\u0092OÉ¥\u0081ÔãpLú/¶\u009d*£;\u0011DÛìøÝ7\u0014^#\u0013÷\u0098\u0083i\u0018Î¾\u009dÉ\u0097Ë/±\u0019{\u008a\u0011-åLÚ\u007f£ÙJïDð\u001b*\u0018\u0003ìBä\u0098g³lS\u001f\u008dy\u0007¨\u008dU´\u009fH\u001eË\u0082\u0002W\u008dFÿÀ\u00178_>>\f±\u007f\u0005\u0003&\u0098mü¥ÝÆPäm[\u0086¨`|7?ªÛ\u0016\u0096ªÊè{?¢m\u000f0¿3K\u0095ËO¿{:Ô\u0093fÁélÓâ\u0086\u0095\u0012Ö«z\u009e/ÐN\u0096\u0099±\r_Ú)Ò\u0082uÿ2\u009f´S\u0019 öí®Î\u0088©Íüi×.wÅGÄ*\u0018)sÿð\\}|Öaú*Ú\nèî'uXñ\nç\u008d£\u000eÇ2Q\u0090bXA\"\u0006Â×¢ \u009b÷îNy\u0098pþºÒ8&\u001ck\u0099\u0011û¼\u0005P]#Cw#ú4\tý!\u0093PÁ@nÎ&&\u0085ÌcØ\f\u00055V\u0010Ëñg½ÒØÉUg\u001d\u000ft\u0015iÌ&\u0017`OLc\u0086³\u0098î\u0007\u007fµ¸L(Syîþ\u0002êWÕgi|IE\u0006\u0090¦ð£\u007f6úÞ\u0082\b©7\fJ¡ôÎK×\u0083SÊ!¢\u0005\u009f?ûäËÛ¾S²\u0089u\u009bª\u0087ZÝ?\u00867\u000fî\u008e;kh¾\u00076\u009c\u0016o\u008alMÊ\u0018Ý\u0010\u0010Þã¦\u009b\u000fYÕqÉÓ½W§¢Ç±\u001c%¸\u0000ÞyeÌ\u009c\u0015µ·}R\u0012ÄõB5S\u0087\u0094/\u00833æ\u0083²\u0002¶âB6¹Ô\u0018î`[Ë\u0080.ÙÝD\u0017Ò_ìôeÿUTêm\u0018ù\u0080Æ\u008a?åV\u000b\f×h\u0080°\u0018\u0097LIÀÁz\u0010\u008fü\u0092Wy\u001e\u001eKÆ\u0087c+\bëßN,£÷àö¢*£\u001f\u0096~(\u00046Ï\u000eAð\"ígêHÐ\u0015©jÌ\r\u008fñþèBNN§6|ê$\u0017\u0015®\u0014à\u0091}ÀíD\u001aH1¥\u009d]'\u0082\n.\u0012\u0004Ws\u0013mðÜ\u0084\u0015\u00045\u0017<JI\nK6bÓËÖüÒg'L¯¦%i\u0000¢Fh]ËU¦õÀùºXG±³\u0091N¹Ü>s\u00871\u001eúu\u001eÑ\u0015,j\u001b¨9¿[´Øq\u001a¬'r\"»U\u0081@ÀÕ/ÚsËÉ\u0002¦D@BEÿÀ ÿ\u0097ôu«=\u001eôé\u0005y\u00056³Ûûbþ)5`\rpã®\u0099\u0082&\u001eØ\u0018(§S\u000b¶ÛÞ\rÒ~èU~î\u0089\b\t4à\u0099\u0095CÐQ~Õ:ÌîV\u008f´çN-\u0095¶V\u0011)\u009d\u0092\u0006¾\u007f¯\u001bNÛ\u009bv\u0090©yhÕù$Ù¹%V!\u0089RÒJ¶"
         .getBytes("ISO-8859-1");

      int var53;
      do {
         lIl[var10000] = ((var31[var10001] & 255) << 24 | (var31[var10001 + 1] & 255) << 16 | (var31[var10001 + 2] & 255) << 8 | var31[var10001 + 3] & 255)
            ^ -778216298;
         var10000 += 1;
         var53 = var10001 + 4;
         var10001 += 4;
      } while (var53 < var31.length);

      String[] var5 = new String[IIl(-995835938, var17 ^ -131618559)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IlI(-686990440, var17 ^ -226341581)).length();
      int var1 = IIl(-995835937, var17 ^ -2048480474);
      int var19 = -1;

      label91:
      while (true) {
         var10000 = IIl(-995835944, var17 ^ 719505444);
         String var24 = var2.substring(++var19, var19 + var1);
         byte var37 = -1;

         while (true) {
            label86: {
               char[] var55 = var24.toCharArray();
               int var67 = var55.length;
               int var6 = 0;
               var53 = var10000;
               var42 = var55;
               var10001 = var67;
               char[] var79;
               int var86;
               if (var67 <= 1) {
                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               } else {
                  var53 = var10000;
                  var10001 = var67;
                  if (var67 <= var6) {
                     break label86;
                  }

                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               }

               while (true) {
                  var79[var86] = (char)(var79[var86] ^ var67 ^ switch (var6 % IIl(-995835964, var17 ^ -1156696095)) {
                     case 0 -> IIl(-995835963, var17 ^ 338888702);
                     case 1 -> IIl(-995835962, var17 ^ 884669320);
                     case 2 -> IIl(-995835961, var17 ^ -78271329);
                     case 3 -> IIl(-995835968, var17 ^ 837335396);
                     case 4 -> IIl(-995835967, var17 ^ 1911838298);
                     case 5 -> IIl(-995835966, var17 ^ 820816382);
                     default -> IIl(-995835965, var17 ^ 150723492);
                  });
                  var6++;
                  if (var53 == 0) {
                     var86 = var53;
                     var79 = var42;
                     var67 = var53;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var79 = var42;
                     var67 = var53;
                     var86 = var6;
                  }
               }
            }

            String var60 = new String(var42).intern();
            switch (var37) {
               case 0:
                  var5[var3++] = var60;
                  if ((var19 += var1) >= var4) {
                     ll = var5;
                     IlI = new String[IIl(-995835941, var17 ^ 1913077755)];
                     Il = new lllIll(IlIIllIII.Ill(Il(IIl(-995835954, var17 ^ 686270056), IIl(-995835953, var17 ^ 1745097991))));
                     II = new lllIll(IlIIllIII.Ill(Il(IIl(-995835958, var17 ^ -559356082), IIl(-995835957, var17 ^ 796356023))));
                     lII = new lllIll(IlIIllIII.Ill(Il(IIl(-995835914, var17 ^ -907052060), IIl(-995835913, var17 ^ 207557186))));
                     III = new lllIll(IlIIllIII.Ill(Il(IIl(-995835918, var17 ^ -130086305), IIl(-995835917, var17 ^ 1420793834))));
                     l = new lllIll(IlIIllIII.Ill(Il(IIl(-995835906, var17 ^ 1419040935), IIl(-995835905, var17 ^ -1005245612))));
                     IIl = new lllIll(IlIIllIII.Ill(Il(IIl(-995835910, var17 ^ -1210850115), IIl(-995835909, var17 ^ 1441723390))));
                     lI = new lllIll(IlIIllIII.Ill(Il(IIl(-995835929, var17 ^ 253215740), IIl(-995835936, var17 ^ 2022928498))));
                     Ill = II();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var60;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label91;
                  }

                  var4 = (var2 = IlI(-686990439, var17 ^ -1758313401)).length();
                  var1 = IIl(-995835943, var17 ^ 2005654511);
                  var19 = -1;
            }

            var10000 = IIl(-995835942, var17 ^ -545228915);
            var24 = var2.substring(++var19, var19 + var1);
            var37 = 0;
         }
      }
   }

   private static int IIl(int var0, int var1) {
      int var2 = lIl[var0 ^ -995836204] ^ var1 ^ var0;
      var2 += 64087;
      var2 ^= 53611;
      var2 ^= 22687;
      var2 += 20665;
      var2 -= 28939;
      var2 -= 11451;
      var2 += 39948;
      var2 ^= 37595;
      var2 -= 6823;
      return var2 ^ 28420;
   }

   private static String Il(int var0, int var1) {
      int var9 = 799455179;
      int var2 = (var0 ^ IIl(-995836196, var9 ^ 252625195)) & IIl(-995836195, var9 ^ 475536105);
      if (IlI[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & IIl(-995836194, var9 ^ 1570677947)) {
            case 0 -> IIl(-995836193, var9 ^ 1962344521);
            case 1 -> IIl(-995836200, var9 ^ -333093212);
            case 2 -> IIl(-995836199, var9 ^ 2078656572);
            case 3 -> IIl(-995836198, var9 ^ 745951452);
            case 4 -> IIl(-995836197, var9 ^ -410272422);
            case 5 -> IIl(-995836220, var9 ^ -1336576872);
            case 6 -> IIl(-995836219, var9 ^ -1405333050);
            case 7 -> IIl(-995836218, var9 ^ 313158014);
            case 8 -> IIl(-995836217, var9 ^ -282169234);
            case 9 -> IIl(-995836224, var9 ^ -14526693);
            case 10 -> IIl(-995836223, var9 ^ 2053932509);
            case 11 -> IIl(-995836222, var9 ^ -941678164);
            case 12 -> IIl(-995836221, var9 ^ -554518978);
            case 13 -> IIl(-995836212, var9 ^ 239145363);
            case 14 -> IIl(-995836211, var9 ^ 715740087);
            case 15 -> IIl(-995836210, var9 ^ 1756704799);
            case 16 -> IIl(-995836209, var9 ^ 891339511);
            case 17 -> IIl(-995836216, var9 ^ 325569193);
            case 18 -> IIl(-995836215, var9 ^ 528783879);
            case 19 -> IIl(-995836214, var9 ^ 455556677);
            case 20 -> IIl(-995836213, var9 ^ -413506445);
            case 21 -> IIl(-995836172, var9 ^ 1908610452);
            case 22 -> IIl(-995836171, var9 ^ -1045126212);
            case 23 -> IIl(-995836170, var9 ^ 2094508994);
            case 24 -> IIl(-995836169, var9 ^ 1236529646);
            case 25 -> IIl(-995836176, var9 ^ -2017820043);
            case 26 -> IIl(-995836175, var9 ^ 1973216541);
            case 27 -> IIl(-995836174, var9 ^ 868621018);
            case 28 -> IIl(-995836173, var9 ^ -1207174815);
            case 29 -> IIl(-995836164, var9 ^ -2024628147);
            case 30 -> IIl(-995836163, var9 ^ 780433628);
            case 31 -> IIl(-995836162, var9 ^ -1224542143);
            case 32 -> IIl(-995836161, var9 ^ 1592577712);
            case 33 -> IIl(-995836168, var9 ^ 2099539122);
            case 34 -> IIl(-995836167, var9 ^ -365223081);
            case 35 -> IIl(-995836166, var9 ^ -687849182);
            case 36 -> IIl(-995836165, var9 ^ -717584879);
            case 37 -> IIl(-995836188, var9 ^ 586132242);
            case 38 -> IIl(-995836187, var9 ^ 144434625);
            case 39 -> IIl(-995836186, var9 ^ 1470292920);
            case 40 -> IIl(-995836185, var9 ^ 1468549683);
            case 41 -> IIl(-995836192, var9 ^ -1867041960);
            case 42 -> 1;
            case 43 -> IIl(-995836191, var9 ^ 1217939691);
            case 44 -> IIl(-995836190, var9 ^ -477213903);
            case 45 -> IIl(-995836189, var9 ^ 388420982);
            case 46 -> IIl(-995836180, var9 ^ -277985532);
            case 47 -> 3;
            case 48 -> IIl(-995836179, var9 ^ 1175485061);
            case 49 -> IIl(-995836178, var9 ^ 267755786);
            case 50 -> IIl(-995836177, var9 ^ -1541584536);
            case 51 -> IIl(-995836184, var9 ^ -808295556);
            case 52 -> IIl(-995836183, var9 ^ -57837398);
            case 53 -> IIl(-995836182, var9 ^ -1797173810);
            case 54 -> IIl(-995836181, var9 ^ 994375738);
            case 55 -> IIl(-995836268, var9 ^ -237721641);
            case 56 -> IIl(-995836267, var9 ^ 2054467650);
            case 57 -> IIl(-995836266, var9 ^ 546701895);
            case 58 -> IIl(-995836265, var9 ^ 617516557);
            case 59 -> IIl(-995836272, var9 ^ -1093920080);
            case 60 -> IIl(-995836271, var9 ^ 682308674);
            case 61 -> IIl(-995836270, var9 ^ 1083348496);
            case 62 -> IIl(-995836269, var9 ^ 1868151921);
            case 63 -> IIl(-995836260, var9 ^ 1815347791);
            case 64 -> IIl(-995836259, var9 ^ 1709155316);
            case 65 -> IIl(-995836258, var9 ^ -1002378675);
            case 66 -> IIl(-995836257, var9 ^ -1029827577);
            case 67 -> IIl(-995836264, var9 ^ -1545211776);
            case 68 -> IIl(-995836263, var9 ^ -1826595707);
            case 69 -> IIl(-995836262, var9 ^ -1513091748);
            case 70 -> IIl(-995836261, var9 ^ -1412671151);
            case 71 -> IIl(-995836284, var9 ^ -815640239);
            case 72 -> IIl(-995836283, var9 ^ -1364221071);
            case 73 -> IIl(-995836282, var9 ^ 34543202);
            case 74 -> IIl(-995836281, var9 ^ 1469181183);
            case 75 -> IIl(-995836288, var9 ^ -1675546049);
            case 76 -> IIl(-995836287, var9 ^ -972444490);
            case 77 -> IIl(-995836286, var9 ^ 2032479635);
            case 78 -> IIl(-995836285, var9 ^ 797970565);
            case 79 -> IIl(-995836276, var9 ^ -37431194);
            case 80 -> IIl(-995836275, var9 ^ -445609217);
            case 81 -> IIl(-995836274, var9 ^ 1618452634);
            case 82 -> IIl(-995836273, var9 ^ 918627541);
            case 83 -> IIl(-995836280, var9 ^ -1632327089);
            case 84 -> IIl(-995836279, var9 ^ 1349659403);
            case 85 -> IIl(-995836278, var9 ^ -1631740785);
            case 86 -> IIl(-995836277, var9 ^ 409555217);
            case 87 -> IIl(-995836236, var9 ^ -1136242713);
            case 88 -> IIl(-995836235, var9 ^ -944587192);
            case 89 -> IIl(-995836234, var9 ^ -1237665936);
            case 90 -> IIl(-995836233, var9 ^ 403023169);
            case 91 -> IIl(-995836240, var9 ^ 564283143);
            case 92 -> IIl(-995836239, var9 ^ 1652542852);
            case 93 -> 2;
            case 94 -> IIl(-995836238, var9 ^ 409658358);
            case 95 -> IIl(-995836237, var9 ^ 1480476462);
            case 96 -> IIl(-995836228, var9 ^ 620876994);
            case 97 -> IIl(-995836227, var9 ^ -916945154);
            case 98 -> IIl(-995836226, var9 ^ -1703783344);
            case 99 -> IIl(-995836225, var9 ^ -527287753);
            case 100 -> IIl(-995836232, var9 ^ -942726382);
            case 101 -> IIl(-995836231, var9 ^ 160471820);
            case 102 -> IIl(-995836230, var9 ^ 1262798863);
            case 103 -> IIl(-995836229, var9 ^ -1037010922);
            case 104 -> IIl(-995836252, var9 ^ 450838977);
            case 105 -> IIl(-995836251, var9 ^ -1496449936);
            case 106 -> IIl(-995836250, var9 ^ -1738908442);
            case 107 -> IIl(-995836249, var9 ^ 1895995439);
            case 108 -> IIl(-995836256, var9 ^ 1663104782);
            case 109 -> IIl(-995836255, var9 ^ 1337477850);
            case 110 -> IIl(-995836254, var9 ^ 475356476);
            case 111 -> IIl(-995836253, var9 ^ -2004220525);
            case 112 -> IIl(-995836244, var9 ^ 551387533);
            case 113 -> IIl(-995836243, var9 ^ -200884991);
            case 114 -> IIl(-995836242, var9 ^ -1510776947);
            case 115 -> IIl(-995836241, var9 ^ 1625344695);
            case 116 -> IIl(-995836248, var9 ^ -1255283636);
            case 117 -> IIl(-995836247, var9 ^ 1945909921);
            case 118 -> IIl(-995836246, var9 ^ -26192737);
            case 119 -> IIl(-995836245, var9 ^ 697945467);
            case 120 -> IIl(-995836332, var9 ^ -784387118);
            case 121 -> IIl(-995836331, var9 ^ 855217096);
            case 122 -> IIl(-995836330, var9 ^ -575689111);
            case 123 -> IIl(-995836329, var9 ^ 217503777);
            case 124 -> IIl(-995836336, var9 ^ 1954047237);
            case 125 -> IIl(-995836335, var9 ^ -733152306);
            case 126 -> IIl(-995836334, var9 ^ 522104970);
            case 127 -> IIl(-995836333, var9 ^ -1886497732);
            case 128 -> IIl(-995836324, var9 ^ -565507295);
            case 129 -> IIl(-995836323, var9 ^ 690223780);
            case 130 -> IIl(-995836322, var9 ^ -1563263776);
            case 131 -> IIl(-995836321, var9 ^ -622040570);
            case 132 -> IIl(-995836328, var9 ^ 1844200776);
            case 133 -> IIl(-995836327, var9 ^ 1512640121);
            case 134 -> IIl(-995836326, var9 ^ 1197688651);
            case 135 -> IIl(-995836325, var9 ^ -2086743873);
            case 136 -> IIl(-995836348, var9 ^ -46260152);
            case 137 -> IIl(-995836347, var9 ^ -909087735);
            case 138 -> IIl(-995836346, var9 ^ -968391164);
            case 139 -> IIl(-995836345, var9 ^ 969199298);
            case 140 -> IIl(-995836352, var9 ^ -1786416264);
            case 141 -> IIl(-995836351, var9 ^ 1137275092);
            case 142 -> IIl(-995836350, var9 ^ -228673133);
            case 143 -> IIl(-995836349, var9 ^ -738739592);
            case 144 -> IIl(-995836340, var9 ^ 756687327);
            case 145 -> IIl(-995836339, var9 ^ -1469177790);
            case 146 -> IIl(-995836338, var9 ^ -164985551);
            case 147 -> IIl(-995836337, var9 ^ -1965135860);
            case 148 -> IIl(-995836344, var9 ^ 301103343);
            case 149 -> IIl(-995836343, var9 ^ 739102083);
            case 150 -> IIl(-995836342, var9 ^ 1140067484);
            case 151 -> IIl(-995836341, var9 ^ 1847299444);
            case 152 -> IIl(-995836300, var9 ^ 355436108);
            case 153 -> IIl(-995836299, var9 ^ 1953255239);
            case 154 -> IIl(-995836298, var9 ^ -323773241);
            case 155 -> IIl(-995836297, var9 ^ 978554708);
            case 156 -> IIl(-995836304, var9 ^ -1770474520);
            case 157 -> IIl(-995836303, var9 ^ 684711333);
            case 158 -> IIl(-995836302, var9 ^ 1823272123);
            case 159 -> IIl(-995836301, var9 ^ 307193626);
            case 160 -> IIl(-995836292, var9 ^ -2103101160);
            case 161 -> IIl(-995836291, var9 ^ -334304124);
            case 162 -> IIl(-995836290, var9 ^ -1726189592);
            case 163 -> IIl(-995836289, var9 ^ -1533330871);
            case 164 -> IIl(-995836296, var9 ^ -813043645);
            case 165 -> IIl(-995836295, var9 ^ -1338383749);
            case 166 -> IIl(-995836294, var9 ^ 585936920);
            case 167 -> 0;
            case 168 -> IIl(-995836293, var9 ^ 39014387);
            case 169 -> 5;
            case 170 -> IIl(-995836316, var9 ^ -1489415600);
            case 171 -> IIl(-995836315, var9 ^ -1012676176);
            case 172 -> IIl(-995836314, var9 ^ 1710942006);
            case 173 -> IIl(-995836313, var9 ^ -1961327090);
            case 174 -> IIl(-995836320, var9 ^ 1004260483);
            case 175 -> IIl(-995836319, var9 ^ -478317272);
            case 176 -> IIl(-995836318, var9 ^ -728063483);
            case 177 -> IIl(-995836317, var9 ^ -1791217634);
            case 178 -> IIl(-995836308, var9 ^ -1304237371);
            case 179 -> IIl(-995836307, var9 ^ -862175444);
            case 180 -> IIl(-995836306, var9 ^ -1784652188);
            case 181 -> IIl(-995836305, var9 ^ 189216229);
            case 182 -> IIl(-995836312, var9 ^ 151177438);
            case 183 -> IIl(-995836311, var9 ^ -1068218727);
            case 184 -> IIl(-995836310, var9 ^ 244348798);
            case 185 -> IIl(-995836309, var9 ^ 398055993);
            case 186 -> 4;
            case 187 -> IIl(-995836396, var9 ^ -1568924629);
            case 188 -> IIl(-995836395, var9 ^ -804724956);
            case 189 -> IIl(-995836394, var9 ^ -771665517);
            case 190 -> IIl(-995836393, var9 ^ -1494768790);
            case 191 -> IIl(-995836400, var9 ^ 728133387);
            case 192 -> IIl(-995836399, var9 ^ 2100115077);
            case 193 -> IIl(-995836398, var9 ^ -1131421476);
            case 194 -> IIl(-995836397, var9 ^ 792120237);
            case 195 -> IIl(-995836388, var9 ^ -1407363206);
            case 196 -> IIl(-995836387, var9 ^ -1007569339);
            case 197 -> IIl(-995836386, var9 ^ 1713251743);
            case 198 -> IIl(-995836385, var9 ^ 467867700);
            case 199 -> IIl(-995836392, var9 ^ -227715999);
            case 200 -> IIl(-995836391, var9 ^ 833575725);
            case 201 -> IIl(-995836390, var9 ^ 1177736215);
            case 202 -> IIl(-995836389, var9 ^ 1734639921);
            case 203 -> IIl(-995836412, var9 ^ 1048959812);
            case 204 -> IIl(-995836411, var9 ^ 2066915820);
            case 205 -> IIl(-995836410, var9 ^ -1325745609);
            case 206 -> IIl(-995836409, var9 ^ -1615057668);
            case 207 -> IIl(-995836416, var9 ^ -227607139);
            case 208 -> IIl(-995836415, var9 ^ -32869249);
            case 209 -> IIl(-995836414, var9 ^ -1034452267);
            case 210 -> IIl(-995836413, var9 ^ -1427407095);
            case 211 -> IIl(-995836404, var9 ^ 259640726);
            case 212 -> IIl(-995836403, var9 ^ -708837963);
            case 213 -> IIl(-995836402, var9 ^ 1584286365);
            case 214 -> IIl(-995836401, var9 ^ -1264005715);
            case 215 -> IIl(-995836408, var9 ^ -1832469453);
            case 216 -> IIl(-995836407, var9 ^ 1954364275);
            case 217 -> IIl(-995836406, var9 ^ -977311347);
            case 218 -> IIl(-995836405, var9 ^ 167576894);
            case 219 -> IIl(-995836364, var9 ^ 1914454716);
            case 220 -> IIl(-995836363, var9 ^ 26497298);
            case 221 -> IIl(-995836362, var9 ^ -1763277686);
            case 222 -> IIl(-995836361, var9 ^ 1179842114);
            case 223 -> IIl(-995836368, var9 ^ 2003020023);
            case 224 -> IIl(-995836367, var9 ^ -2024297761);
            case 225 -> IIl(-995836366, var9 ^ -577801352);
            case 226 -> IIl(-995836365, var9 ^ 249638933);
            case 227 -> IIl(-995836356, var9 ^ 405080476);
            case 228 -> IIl(-995836355, var9 ^ -1701976235);
            case 229 -> IIl(-995836354, var9 ^ 976504768);
            case 230 -> IIl(-995836353, var9 ^ -1468405069);
            case 231 -> IIl(-995836360, var9 ^ 65744088);
            case 232 -> IIl(-995836359, var9 ^ -1821764925);
            case 233 -> IIl(-995836358, var9 ^ -1377721485);
            case 234 -> IIl(-995836357, var9 ^ 1378703157);
            case 235 -> IIl(-995836380, var9 ^ 68878361);
            case 236 -> IIl(-995836379, var9 ^ 972245362);
            case 237 -> IIl(-995836378, var9 ^ -612410555);
            case 238 -> IIl(-995836377, var9 ^ 1107441744);
            case 239 -> IIl(-995836384, var9 ^ 784224457);
            case 240 -> IIl(-995836383, var9 ^ 1721167964);
            case 241 -> IIl(-995836382, var9 ^ 1733013623);
            case 242 -> IIl(-995836381, var9 ^ 1394555760);
            case 243 -> IIl(-995836372, var9 ^ -206692656);
            case 244 -> IIl(-995836371, var9 ^ 893645701);
            case 245 -> IIl(-995836370, var9 ^ 791266174);
            case 246 -> IIl(-995836369, var9 ^ 1812717341);
            case 247 -> IIl(-995836376, var9 ^ 1251008745);
            case 248 -> IIl(-995836375, var9 ^ -2026938949);
            case 249 -> IIl(-995836374, var9 ^ -216139083);
            case 250 -> IIl(-995836373, var9 ^ -764101268);
            case 251 -> IIl(-995835948, var9 ^ 636513412);
            case 252 -> IIl(-995835947, var9 ^ 673516324);
            case 253 -> IIl(-995835946, var9 ^ -188445590);
            case 254 -> IIl(-995835945, var9 ^ -488433484);
            default -> IIl(-995835952, var9 ^ -681228772);
         };
         int var5 = (var1 & IIl(-995835951, var9 ^ -703798681)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIl(-995835950, var9 ^ 1098135949)) >>> IIl(-995835949, var9 ^ -765635199)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIl(-995835940, var9 ^ -819321644);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIl(-995835939, var9 ^ 380290123);
            }
         }

         IlI[var2] = new String(var3).intern();
      }

      return IlI[var2];
   }

   boolean lI(IIllIIl var1) {
      return var1 != null && var1 != IIllIIl.IIIll ? this == Il || this == III(var1) : false;
   }

   IIIlIlIl ll() {
      return this.I;
   }

   private static lllIll III(IIllIIl var0) {
      if (var0 != null && var0 != IIllIIl.IIIll) {
         Color var1 = var0.lII();
         if (var1 == null) {
            return lI;
         } else {
            float[] var2 = Color.RGBtoHSB(var1.getRed(), var1.getGreen(), var1.getBlue(), null);
            if (var2[1] < 0.18F) {
               return lI;
            } else {
               float var3 = var2[0];
               if (var3 < 0.035F || var3 >= 0.94F) {
                  return II;
               } else if (var3 < 0.18F) {
                  return lII;
               } else if (var3 < 0.42F) {
                  return III;
               } else {
                  return var3 < 0.7F ? l : IIl;
               }
            }
         }
      } else {
         return Il;
      }
   }

   private lllIll(IIIlIlIl var3) {
      this.I = var3;
   }
}
