package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum llllIlI {
   ll,
   III,
   IIl;

   private final IIIlIlIl I;
   private static final String[] l;
   private static final String[] II;
   private static final Object[] lII;
   private static String[] Il;
   private static final llllIlI[] lI;
   private static final int[] IlI;
   private static final String[] Ill;

   public static llllIlI I(String var0) {
      return Enum.valueOf(llllIlI.class, var0);
   }

   private static String III(char var0, int var1, int var2, int var3) {
      int var8 = var3 ^ -1916261565;
      char[] var7 = Ill[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])lII[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         lII[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 39006;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 19) {
            default -> 153;
            case 1 -> 180;
            case 2 -> 77;
            case 3 -> 140;
            case 4 -> 204;
            case 5 -> 11;
            case 6 -> 192;
            case 7 -> 21;
            case 8 -> 213;
            case 9 -> 179;
            case 10 -> 250;
            case 11 -> 210;
            case 12 -> 5;
            case 13 -> 48;
            case 14 -> 99;
            case 15 -> 181;
            case 16 -> 179;
            case 17 -> 52;
            case 18 -> 131;
         } ^ 53382 ^ var1 ^ var0 ^ var3 ^ var5 ^ var2);
      }

      return new String(var7).intern();
   }

   private static void l() {
      int var0 = 1991410238;
      Il[0] = II(lI(ll(-1685952889, var0 ^ 954589375), ll(-1685952872, var0 ^ -399970305)).toCharArray(), 77417L, ll(-1685952871, var0 ^ 2117940));
      Il[1] = II(lI(ll(-1685952870, var0 ^ -338786551), ll(-1685952869, var0 ^ -1472106519)).toCharArray(), 78343L, ll(-1685952868, var0 ^ 1439872695));
      Il[2] = II(lI(ll(-1685952867, var0 ^ -1913955966), ll(-1685952866, var0 ^ -323274461)).toCharArray(), 47946L, ll(-1685952865, var0 ^ -574765608));
      Il[3] = II(lI(ll(-1685952880, var0 ^ -798990587), ll(-1685952879, var0 ^ -1436137984)).toCharArray(), 18319L, ll(-1685952878, var0 ^ -666117062));
      Il[4] = II(lI(ll(-1685952877, var0 ^ -658500054), ll(-1685952876, var0 ^ 1607092937)).toCharArray(), 43288L, ll(-1685952875, var0 ^ -739151757));
      Il[5] = II(lI(ll(-1685952874, var0 ^ -1846896020), ll(-1685952873, var0 ^ -1193314913)).toCharArray(), 92122L, ll(-1685952856, var0 ^ -416500430));
   }

   private static String II(char[] var0, long var1, int var3) {
      int var4 = ll(-1685952855, -177334763 ^ 904798305) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(-1685952854, -177334763 ^ 422103135);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static int ll(int var0, int var1) {
      int var2 = IlI[var0 ^ -1685952888] ^ var1 ^ var0;
      var2 ^= 37926;
      var2 ^= 35331;
      var2 -= 31485;
      var2 += 42509;
      var2 -= 20665;
      return var2 ^ 28146;
   }

   private static llllIlI[] Il() {
      return new llllIlI[]{ll, III, IIl};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 1831134902;
      int var17 = 0;
      short var18 = 13416;
      int var16 = 0;
      int var14 = "\u001d풾ퟢ鋋诊︘慥Ռꐍꅤ\ue526뮱鎅藖\uf677뙑聉誖䱜猢à戎揿\u0e69巾ِ鲸ٜ\ud8d4듆\r슥暹뇿ꌁ⸵䯻\uf52e뽄瓜颒␥켂ⲝ".length();
      String var13 = "\u001d풾ퟢ鋋诊︘慥Ռꐍꅤ\ue526뮱鎅藖\uf677뙑聉誖䱜猢à戎揿\u0e69巾ِ鲸ٜ\ud8d4듆\r슥暹뇿ꌁ⸵䯻\uf52e뽄瓜颒␥켂ⲝ";
      String[] var15 = new String[2];

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
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

      Ill = var15;
      lII = new Object[var15.length];
      int var9 = -1013549328;
      byte[] var7 = "WÛ½t}\u0099NY\u001d\u000e]\u0000\u008ay#]¾\\ct4´x\u0085C3[·ß¼Û\u0089x\u0086\u001b\u0002_\u0018Ü×ö :\u0082\u0097\tI\u008f««\u0089w\u009f\u0085xUm\u0090¯¤\u0016C_\u009f9qÈPø\u0017¯\nÅh83\u0086çÏK\u007fP\u0081ù£Mæ¹Â\u001d³Ë¶ï-\u0092þÆà0{?d\t\f\u0010±röf©\u001bql·¦e\u0099\u009cJ¿L%[\u0096y\u0099Ì\u0081¯I?»%-_´RB\u0083øO\u0015?©Kc\"ÙßHQ?\u008d²\u001dm\u000e¯\u009d\u0091\u008f1ô¼Þ\tä¦¾Ï_ø]X\u0080\u009dM\u008b\u0011z\u008cæî'\u0012\u0012¦SÉá\u0090þ\u0015Ç}f¶´\u0018Þ*U\u0016óçnX\u001a\u00adR\u009aãþbuc×\u0017âvÃÍ\u0088:@_¨En\u009dR\u0081\nÜsh\u001d©ä/Õ2 \u0004;C]\u008eF\u0086\u001b\u0080@ûÅó1,Ìiçâ\u0088ú¶\u0012+\u001e·´Þ:\r\u001dÜÉ\u008f¬©îXA4%bî±8Ü\nØ§=ú~§V\u0012Ä¿$Ûç\u009d@óÛ\u0096óF\u000f+\u0001\u008e?¹¦]Á/u®¯\u007fm^í¢®¾\u0093}avoóKÝ\u0003-ñ¯q¿SpS ÍhfGÔ11\u0089h¦mV?ß\u009cVZÍ@©\u0004ÎwL°Ã}\u0015Á¤ñÏ$\u0003\u0003X¯½ÿÜzÑ`ä\u0085¸+²¥§qN}$\u0099bÖo¸\u00921\u0004_\u0010D\u001b=/.Èé)åJG0DU ·#×p\"nÞÏ5Ø¦7â\u008d lB\u009e\u009bP¦$Ö8R\u0090ºÄ8\u001ao\u009b1Ój\u0098]C\u0004B9kxÅ§ÅÁ\u001exü\u0007$ªA\u0011bõBS\u0082ý\u000bù¡*w;èa-Rm\u0012\u008b=Õ¼REk\u0002\u007f)êgEfËÈdz/¶æ%EP¬\u0000~\u00131\"\u0099hgì\u0088B¨µWNÕ\u0017ä?\u0099ÓFdÃ\u008eÁôgÔf\u0002¾xý^mñ\u001b\u0094Å\u008ah=ß\u008f¬ÒüOë¨\u007fï9ñ9ý\u000f¤\u00116\u0010»\u008dò¥\u007f\u0015S·\ri\u0014¹³\u000f\u001d\u001dÉe\u0017Z\u000b¦³\u0095Ú§óü\bk H á\t{ò:\r(\u0019<!ÑAÐ\u0014õB\u0084¬#\u0097+\r\u0081\u009aÁÁ®\u0085\u001bJ\u000bP$.|Õ°ä¢\u0016N|\fú¡\u0081ñ1\u0005}-YJütèØüØrÞÍö6ø¯O\u0000Ø?Ú\u0086Q\u0088ê\u0013ï\u0095n\u0019%jô\u0012×aÑtapp\u0017o\u001eZ\u0010 \u009eA\u008cA\bÒºÉÄ'g\u0001O¡¢Ð@8\u0086ÝÐ7\u0010Ð\u008bÁ_\u0012ÐÈ>í±ºÎ´'\u009egÖl\u008d©\u0017»9\u0090I\u001e\u0097UêÖ\u0096êì»\u0099qI\u0091ÝÉj\u0091F\u0001ò¶$²À\"|=\u0010\u001f)ªºü3\u0007Ó\u008cW\u000bõ\u008a1P\u0091Ï½sèôôh[4r\u0007\n[Á.R\u001b\u0087ÖOÛHvj\u0004\rïb¤¬Uâê÷K\u0097£\u0092\u0014êðÑ\u0099\u0096\u0096Ó\\\u001f7[Øº\u0016B\u009e]£æU`Ñ¯í\u008bþ\u001e¯öêkv<î\u0090N/\u007f&=Ìx\u0097\u008c6ÿK\t±Z\u001c\u0016³\u009f·×>¨ÚÔ\u0013Gu¸sËRJÆgÇ\u001cÁ\u0085\u0091X\u0005ø\u0099)\u0085ô¥\u000b`F%pÙAÙ\u0010ç\fêNFïlå\u00028ØÀ\u008b\u0007\u0081\u0000\u0003ú\u00907]øAúØ;}B\bS¦ø\u0015HFù\u0007+E\b§\u0096\u00adÅ~(Ya¬bc¸\u0088E¸ùµñ\u0085¸¬78q\u009bð Ôa/¡Ä\u0089\u0090Ò\u0014\u0091c\u0019z\u0080\u001e^\u00ad@!\u008d+ñèOÊÕø·+G\u008c\u0014B³TÄ¼C\u0000«îÈux \u001b\u001fÅ§\u0014È¸=Ý\\f,\u0002n\u0097\u0096\u009d\u0085lyOSý}\u0086Í\u009b*±åï\u0092\u0093~G3\u0090\u0019J\u008cHÛ\nã;+¡%\u0098\u0083ÄÌö4PòÅjN\u001aÌÃqY\u0087\u008dk\u0003·$ã V@(Õ0\rÜ@¯~~Ó\u0011\u0019¼åëÛî¨fNòZ#\u008f\u0082\u000b\r\"¢l\u000b/Jää)¨\u0084\u0007ZÇ©\u0082ÜÐ"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IlI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IlI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[ll(-1685952888, var23 ^ 1659618818)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III('ﮑ', 891809498, -1928693094, -1916261565)).length();
      int var1 = ll(-1685952887, var23 ^ 1219048750);
      int var25 = -1;

      label87:
      while (true) {
         int var10000 = ll(-1685952886, var23 ^ 675161737);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label82: {
               char[] var42 = var10001.toCharArray();
               int var10004 = var42.length;
               int var6 = 0;
               int var45 = var10000;
               var38 = var42;
               int var32 = var10004;
               char[] var54;
               int var10006;
               if (var10004 <= 1) {
                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var45 = var10000;
                  var32 = var10004;
                  if (var10004 <= var6) {
                     break label82;
                  }

                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % ll(-1685952882, var23 ^ 1979916484)) {
                     case 0 -> ll(-1685952881, var23 ^ -359882709);
                     case 1 -> ll(-1685952896, var23 ^ 1303797981);
                     case 2 -> ll(-1685952895, var23 ^ 1781049160);
                     case 3 -> ll(-1685952894, var23 ^ -1022344887);
                     case 4 -> ll(-1685952893, var23 ^ -1573309918);
                     case 5 -> ll(-1685952892, var23 ^ -1633946968);
                     default -> ll(-1685952891, var23 ^ -1430977588);
                  });
                  var6++;
                  if (var45 == 0) {
                     var10006 = var45;
                     var54 = var38;
                     var10004 = var45;
                  } else {
                     if (var32 <= var6) {
                        break;
                     }

                     var54 = var38;
                     var10004 = var45;
                     var10006 = var6;
                  }
               }
            }

            String var47 = new String(var38).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var47;
                  if ((var25 += var1) >= var4) {
                     l = var5;
                     II = new String[ll(-1685952883, var23 ^ 25428982)];
                     Il = new String[ll(-1685952890, var23 ^ 1486935260)];
                     l();
                     ll = new llllIlI(IlIIllIII.lI(Il[2]));
                     III = new llllIlI(IlIIllIII.lI(Il[5]));
                     IIl = new llllIlI(IlIIllIII.lI(Il[1]));
                     lI = Il();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var47;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label87;
                  }

                  var4 = (var2 = III('ጱ', 462823028, -563052824, -1916261566)).length();
                  var1 = ll(-1685952885, var23 ^ -1085712362);
                  var25 = -1;
            }

            var10000 = ll(-1685952884, var23 ^ -1955850005);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private llllIlI(String var3) {
      this.I = IlIIllIII.lII(var3);
   }

   @Override
   public String toString() {
      return this.I.llIl();
   }

   private static String lI(int var0, int var1) {
      int var9 = -1960176720;
      int var2 = (var0 ^ ll(-1685952853, var9 ^ 728841144)) & ll(-1685952852, var9 ^ 2054539613);
      if (II[var2] == null) {
         char[] var3 = l[var2].toCharArray();

         int var4 = switch (var3[0] & ll(-1685952851, var9 ^ 182568751)) {
            case 0 -> ll(-1685952850, var9 ^ -323797799);
            case 1 -> ll(-1685952849, var9 ^ -1104142063);
            case 2 -> ll(-1685952864, var9 ^ 1118945066);
            case 3 -> ll(-1685952863, var9 ^ 1876985669);
            case 4 -> ll(-1685952862, var9 ^ 1971339374);
            case 5 -> ll(-1685952861, var9 ^ 727963186);
            case 6 -> ll(-1685952860, var9 ^ 1316160565);
            case 7 -> ll(-1685952859, var9 ^ -1447925267);
            case 8 -> ll(-1685952858, var9 ^ -198403048);
            case 9 -> ll(-1685952857, var9 ^ -2131267636);
            case 10 -> ll(-1685952840, var9 ^ 757811675);
            case 11 -> ll(-1685952839, var9 ^ -1249363301);
            case 12 -> ll(-1685952838, var9 ^ 219470741);
            case 13 -> ll(-1685952837, var9 ^ 551149726);
            case 14 -> ll(-1685952836, var9 ^ -913056703);
            case 15 -> ll(-1685952835, var9 ^ 817949979);
            case 16 -> ll(-1685952834, var9 ^ -1326868115);
            case 17 -> ll(-1685952833, var9 ^ -1510128999);
            case 18 -> ll(-1685952848, var9 ^ -377565056);
            case 19 -> ll(-1685952847, var9 ^ -1773136908);
            case 20 -> ll(-1685952846, var9 ^ 1379160721);
            case 21 -> ll(-1685952845, var9 ^ -1155323976);
            case 22 -> ll(-1685952844, var9 ^ -51659519);
            case 23 -> ll(-1685952843, var9 ^ -687485503);
            case 24 -> ll(-1685952842, var9 ^ 1568147825);
            case 25 -> ll(-1685952841, var9 ^ 1400796460);
            case 26 -> ll(-1685952824, var9 ^ 537895513);
            case 27 -> ll(-1685952823, var9 ^ -1160155701);
            case 28 -> ll(-1685952822, var9 ^ 696818891);
            case 29 -> ll(-1685952821, var9 ^ -846644488);
            case 30 -> ll(-1685952820, var9 ^ -382496119);
            case 31 -> ll(-1685952819, var9 ^ 447816680);
            case 32 -> ll(-1685952818, var9 ^ 1030148046);
            case 33 -> ll(-1685952817, var9 ^ -161718205);
            case 34 -> ll(-1685952832, var9 ^ -337476520);
            case 35 -> ll(-1685952831, var9 ^ 1946383434);
            case 36 -> ll(-1685952830, var9 ^ 1953012983);
            case 37 -> ll(-1685952829, var9 ^ 1813665000);
            case 38 -> ll(-1685952828, var9 ^ 1316912621);
            case 39 -> ll(-1685952827, var9 ^ 1171114185);
            case 40 -> ll(-1685952826, var9 ^ -130088718);
            case 41 -> ll(-1685952825, var9 ^ 1788400263);
            case 42 -> ll(-1685952808, var9 ^ -62184974);
            case 43 -> ll(-1685952807, var9 ^ -1403792916);
            case 44 -> ll(-1685952806, var9 ^ 1905275292);
            case 45 -> ll(-1685952805, var9 ^ -1369442013);
            case 46 -> ll(-1685952804, var9 ^ 544560054);
            case 47 -> ll(-1685952803, var9 ^ -19980271);
            case 48 -> ll(-1685952802, var9 ^ 1819148047);
            case 49 -> ll(-1685952801, var9 ^ 1945364187);
            case 50 -> ll(-1685952816, var9 ^ -1796554980);
            case 51 -> ll(-1685952815, var9 ^ 1515595976);
            case 52 -> ll(-1685952814, var9 ^ -2063511305);
            case 53 -> ll(-1685952813, var9 ^ -2057026709);
            case 54 -> ll(-1685952812, var9 ^ 2050638096);
            case 55 -> ll(-1685952811, var9 ^ -1618063879);
            case 56 -> ll(-1685952810, var9 ^ -956356044);
            case 57 -> ll(-1685952809, var9 ^ 471502210);
            case 58 -> ll(-1685952792, var9 ^ -1953418448);
            case 59 -> ll(-1685952791, var9 ^ 256138847);
            case 60 -> ll(-1685952790, var9 ^ 935016309);
            case 61 -> ll(-1685952789, var9 ^ 1637558357);
            case 62 -> ll(-1685952788, var9 ^ -1656509535);
            case 63 -> ll(-1685952787, var9 ^ -1310137933);
            case 64 -> ll(-1685952786, var9 ^ 1091537550);
            case 65 -> ll(-1685952785, var9 ^ -1015376469);
            case 66 -> ll(-1685952800, var9 ^ -66041984);
            case 67 -> ll(-1685952799, var9 ^ -86260534);
            case 68 -> ll(-1685952798, var9 ^ -478487578);
            case 69 -> ll(-1685952797, var9 ^ 1679645065);
            case 70 -> ll(-1685952796, var9 ^ -246394439);
            case 71 -> ll(-1685952795, var9 ^ -421123853);
            case 72 -> ll(-1685952794, var9 ^ 833826508);
            case 73 -> ll(-1685952793, var9 ^ -1851779723);
            case 74 -> ll(-1685952776, var9 ^ 1964660890);
            case 75 -> ll(-1685952775, var9 ^ -2119289848);
            case 76 -> ll(-1685952774, var9 ^ -349904725);
            case 77 -> ll(-1685952773, var9 ^ -487726035);
            case 78 -> 3;
            case 79 -> ll(-1685952772, var9 ^ -1904375060);
            case 80 -> ll(-1685952771, var9 ^ -363464797);
            case 81 -> ll(-1685952770, var9 ^ 1962626819);
            case 82 -> ll(-1685952769, var9 ^ -1413314541);
            case 83 -> ll(-1685952784, var9 ^ 2038406659);
            case 84 -> ll(-1685952783, var9 ^ 645717298);
            case 85 -> ll(-1685952782, var9 ^ 775255902);
            case 86 -> ll(-1685952781, var9 ^ -112610013);
            case 87 -> ll(-1685952780, var9 ^ -1307321036);
            case 88 -> ll(-1685952779, var9 ^ -1045056644);
            case 89 -> ll(-1685952778, var9 ^ 1869400956);
            case 90 -> ll(-1685952777, var9 ^ -784226454);
            case 91 -> ll(-1685953016, var9 ^ -1266947742);
            case 92 -> ll(-1685953015, var9 ^ 458945595);
            case 93 -> ll(-1685953014, var9 ^ 1708698264);
            case 94 -> ll(-1685953013, var9 ^ -2087546904);
            case 95 -> ll(-1685953012, var9 ^ -1072714571);
            case 96 -> ll(-1685953011, var9 ^ -1151769961);
            case 97 -> ll(-1685953010, var9 ^ -1852425365);
            case 98 -> ll(-1685953009, var9 ^ -1645504060);
            case 99 -> ll(-1685953024, var9 ^ -324575979);
            case 100 -> ll(-1685953023, var9 ^ -1208155986);
            case 101 -> ll(-1685953022, var9 ^ 660167277);
            case 102 -> ll(-1685953021, var9 ^ -780077512);
            case 103 -> ll(-1685953020, var9 ^ -1923907624);
            case 104 -> ll(-1685953019, var9 ^ 1207633354);
            case 105 -> ll(-1685953018, var9 ^ -287243828);
            case 106 -> ll(-1685953017, var9 ^ 29540622);
            case 107 -> ll(-1685953000, var9 ^ 2067882454);
            case 108 -> ll(-1685952999, var9 ^ 570913588);
            case 109 -> ll(-1685952998, var9 ^ 1999616057);
            case 110 -> ll(-1685952997, var9 ^ 1756593396);
            case 111 -> ll(-1685952996, var9 ^ -1406411760);
            case 112 -> ll(-1685952995, var9 ^ -564684004);
            case 113 -> ll(-1685952994, var9 ^ 1613861693);
            case 114 -> ll(-1685952993, var9 ^ 442210725);
            case 115 -> ll(-1685953008, var9 ^ -661111435);
            case 116 -> ll(-1685953007, var9 ^ 161054101);
            case 117 -> ll(-1685953006, var9 ^ -615141382);
            case 118 -> ll(-1685953005, var9 ^ 1944028937);
            case 119 -> ll(-1685953004, var9 ^ 553943834);
            case 120 -> ll(-1685953003, var9 ^ -905793583);
            case 121 -> ll(-1685953002, var9 ^ -1829856598);
            case 122 -> ll(-1685953001, var9 ^ -1850072133);
            case 123 -> ll(-1685952984, var9 ^ 1142260681);
            case 124 -> ll(-1685952983, var9 ^ 1241468916);
            case 125 -> ll(-1685952982, var9 ^ 1445315789);
            case 126 -> ll(-1685952981, var9 ^ -2095407033);
            case 127 -> ll(-1685952980, var9 ^ 109996792);
            case 128 -> ll(-1685952979, var9 ^ -982453321);
            case 129 -> ll(-1685952978, var9 ^ 698290052);
            case 130 -> ll(-1685952977, var9 ^ -499387725);
            case 131 -> ll(-1685952992, var9 ^ -1972080115);
            case 132 -> ll(-1685952991, var9 ^ 1004958459);
            case 133 -> ll(-1685952990, var9 ^ -1579138094);
            case 134 -> ll(-1685952989, var9 ^ -440000134);
            case 135 -> ll(-1685952988, var9 ^ -739856112);
            case 136 -> ll(-1685952987, var9 ^ 1433339757);
            case 137 -> ll(-1685952986, var9 ^ -1060037883);
            case 138 -> ll(-1685952985, var9 ^ -904141769);
            case 139 -> ll(-1685952968, var9 ^ -1041633495);
            case 140 -> ll(-1685952967, var9 ^ -1486881200);
            case 141 -> ll(-1685952966, var9 ^ -1001287659);
            case 142 -> ll(-1685952965, var9 ^ -1021439565);
            case 143 -> ll(-1685952964, var9 ^ 1602193082);
            case 144 -> ll(-1685952963, var9 ^ 1777814093);
            case 145 -> ll(-1685952962, var9 ^ -1270890476);
            case 146 -> ll(-1685952961, var9 ^ 1911475761);
            case 147 -> ll(-1685952976, var9 ^ 1440964525);
            case 148 -> ll(-1685952975, var9 ^ -1007811305);
            case 149 -> ll(-1685952974, var9 ^ -1943249272);
            case 150 -> 4;
            case 151 -> ll(-1685952973, var9 ^ -304922781);
            case 152 -> ll(-1685952972, var9 ^ 495626285);
            case 153 -> ll(-1685952971, var9 ^ -1259805935);
            case 154 -> ll(-1685952970, var9 ^ 2049520816);
            case 155 -> ll(-1685952969, var9 ^ 1131909285);
            case 156 -> ll(-1685952952, var9 ^ -2032903963);
            case 157 -> ll(-1685952951, var9 ^ 970077629);
            case 158 -> ll(-1685952950, var9 ^ -1569251790);
            case 159 -> 5;
            case 160 -> ll(-1685952949, var9 ^ 441720471);
            case 161 -> ll(-1685952948, var9 ^ -758368217);
            case 162 -> ll(-1685952947, var9 ^ 1644080620);
            case 163 -> ll(-1685952946, var9 ^ -298938180);
            case 164 -> ll(-1685952945, var9 ^ 2038723095);
            case 165 -> ll(-1685952960, var9 ^ -722664569);
            case 166 -> ll(-1685952959, var9 ^ -657783354);
            case 167 -> ll(-1685952958, var9 ^ -2085666501);
            case 168 -> ll(-1685952957, var9 ^ -1596556548);
            case 169 -> ll(-1685952956, var9 ^ -1150961030);
            case 170 -> ll(-1685952955, var9 ^ -734734960);
            case 171 -> ll(-1685952954, var9 ^ -43215762);
            case 172 -> ll(-1685952953, var9 ^ 91313480);
            case 173 -> ll(-1685952936, var9 ^ -1521185893);
            case 174 -> ll(-1685952935, var9 ^ 1012673369);
            case 175 -> ll(-1685952934, var9 ^ -2032376611);
            case 176 -> ll(-1685952933, var9 ^ -1733743531);
            case 177 -> 2;
            case 178 -> ll(-1685952932, var9 ^ -942375191);
            case 179 -> ll(-1685952931, var9 ^ 1252530445);
            case 180 -> ll(-1685952930, var9 ^ -1893615296);
            case 181 -> ll(-1685952929, var9 ^ 193239041);
            case 182 -> ll(-1685952944, var9 ^ 1298345022);
            case 183 -> ll(-1685952943, var9 ^ -2040635857);
            case 184 -> ll(-1685952942, var9 ^ 1052078249);
            case 185 -> ll(-1685952941, var9 ^ 2093507636);
            case 186 -> ll(-1685952940, var9 ^ -1526570816);
            case 187 -> ll(-1685952939, var9 ^ -1659768483);
            case 188 -> ll(-1685952938, var9 ^ -286067070);
            case 189 -> ll(-1685952937, var9 ^ 1594388784);
            case 190 -> ll(-1685952920, var9 ^ -628108199);
            case 191 -> ll(-1685952919, var9 ^ -980610651);
            case 192 -> ll(-1685952918, var9 ^ 67118848);
            case 193 -> ll(-1685952917, var9 ^ 120441185);
            case 194 -> ll(-1685952916, var9 ^ 1800226100);
            case 195 -> ll(-1685952915, var9 ^ -1711740606);
            case 196 -> ll(-1685952914, var9 ^ -805368860);
            case 197 -> ll(-1685952913, var9 ^ -1959037411);
            case 198 -> ll(-1685952928, var9 ^ -88376485);
            case 199 -> ll(-1685952927, var9 ^ -664876948);
            case 200 -> ll(-1685952926, var9 ^ -1545089081);
            case 201 -> ll(-1685952925, var9 ^ -1009155350);
            case 202 -> ll(-1685952924, var9 ^ -1653055197);
            case 203 -> ll(-1685952923, var9 ^ 909948694);
            case 204 -> ll(-1685952922, var9 ^ 330664431);
            case 205 -> ll(-1685952921, var9 ^ -750946997);
            case 206 -> ll(-1685952904, var9 ^ -463243679);
            case 207 -> ll(-1685952903, var9 ^ 702985376);
            case 208 -> ll(-1685952902, var9 ^ -1858675707);
            case 209 -> ll(-1685952901, var9 ^ 724289467);
            case 210 -> ll(-1685952900, var9 ^ 708420739);
            case 211 -> ll(-1685952899, var9 ^ -610723481);
            case 212 -> ll(-1685952898, var9 ^ 373335593);
            case 213 -> ll(-1685952897, var9 ^ -1298994061);
            case 214 -> 1;
            case 215 -> ll(-1685952912, var9 ^ 1807141637);
            case 216 -> ll(-1685952911, var9 ^ 713785095);
            case 217 -> ll(-1685952910, var9 ^ 1804777776);
            case 218 -> ll(-1685952909, var9 ^ -1566212281);
            case 219 -> ll(-1685952908, var9 ^ 123707483);
            case 220 -> ll(-1685952907, var9 ^ 397877013);
            case 221 -> ll(-1685952906, var9 ^ -944771878);
            case 222 -> ll(-1685952905, var9 ^ -1447128979);
            case 223 -> ll(-1685952632, var9 ^ 2122231346);
            case 224 -> ll(-1685952631, var9 ^ -120625207);
            case 225 -> ll(-1685952630, var9 ^ 434862078);
            case 226 -> ll(-1685952629, var9 ^ -126286986);
            case 227 -> ll(-1685952628, var9 ^ -1852974461);
            case 228 -> ll(-1685952627, var9 ^ 1870499470);
            case 229 -> ll(-1685952626, var9 ^ 1039596373);
            case 230 -> ll(-1685952625, var9 ^ 1931841940);
            case 231 -> ll(-1685952640, var9 ^ 1948927993);
            case 232 -> ll(-1685952639, var9 ^ -287059022);
            case 233 -> ll(-1685952638, var9 ^ -12787541);
            case 234 -> ll(-1685952637, var9 ^ 1168312967);
            case 235 -> ll(-1685952636, var9 ^ -1435378188);
            case 236 -> ll(-1685952635, var9 ^ -1363656069);
            case 237 -> 0;
            case 238 -> ll(-1685952634, var9 ^ -108041695);
            case 239 -> ll(-1685952633, var9 ^ 1101918234);
            case 240 -> ll(-1685952616, var9 ^ -525428992);
            case 241 -> ll(-1685952615, var9 ^ 1601590418);
            case 242 -> ll(-1685952614, var9 ^ 805676479);
            case 243 -> ll(-1685952613, var9 ^ -156889943);
            case 244 -> ll(-1685952612, var9 ^ 533248957);
            case 245 -> ll(-1685952611, var9 ^ 570156527);
            case 246 -> ll(-1685952610, var9 ^ -906867472);
            case 247 -> ll(-1685952609, var9 ^ -1967586453);
            case 248 -> ll(-1685952624, var9 ^ -796284093);
            case 249 -> ll(-1685952623, var9 ^ 1936248827);
            case 250 -> ll(-1685952622, var9 ^ 101614266);
            case 251 -> ll(-1685952621, var9 ^ -1819151894);
            case 252 -> ll(-1685952620, var9 ^ 3119095);
            case 253 -> ll(-1685952619, var9 ^ 919950763);
            case 254 -> ll(-1685952618, var9 ^ 2069414209);
            default -> ll(-1685952617, var9 ^ -1994588086);
         };
         int var5 = (var1 & ll(-1685952600, var9 ^ -667702055)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(-1685952599, var9 ^ -1087011792)) >>> ll(-1685952598, var9 ^ 937076420)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(-1685952597, var9 ^ 1463407807);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(-1685952596, var9 ^ 2059162287);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }
}
