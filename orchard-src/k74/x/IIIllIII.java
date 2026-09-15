package k74.x;

import java.util.ArrayDeque;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class IIIllIII extends IlIIIIIIl {
   private static String[] I;
   private final IIlIII II;
   private final lllIIlII Il;
   private final lllIIlII lI;
   private static final String[] ll;
   private static final String[] lIl;
   private static final Object[] llI;
   private final lIllIlII III;
   private boolean IIl;
   private final ArrayDeque<IIIIllll> IlI;
   private static final int[] lII;
   private static final String[] Ill;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = lI(470653004, -2125379897 ^ -653629602) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lI(470653005, -2125379897 ^ 41442297);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public IIIllIII() {
      super(IlIIllIII.Ill(I[4]), lllIIlIl.IlI, IlIIllIII.Ill(I[5]));
      this.III = this.IllIIll(new lIllIlII(IlIIllIII.Ill(I[lI(470653006, 151327830 ^ 1967807403)])));
      this.Il = this.IllIIll(new lllIIlII(IlIIllIII.Ill(I[2]), true));
      this.lI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(I[3]), false));
      this.II = this.IllIIll(new IIlIII(IlIIllIII.Ill(I[lI(470653007, 151327830 ^ -652125965)]), 20.0, 1.0, 40.0, 1.0));
      this.IlI = new ArrayDeque<>();
   }

   private static String ll(int var0, char var1, char var2) {
      int var3 = var1 ^ '튼';
      char[] var4 = lIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])llI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         llI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 22398;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 19312;
         var10 -= 7166;
         var10 -= 57362;
         var10 += 61305;
         var10 ^= 30188;
         var10 += 57577;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 378829608;
      String[] var9 = new String[2];
      short var12 = 20815;
      int var10 = 0;
      int var11 = 0;
      int var8 = "a⨆燰갳\uf214\ue597ឺ㦷\ue52a꒝갎襔㖧\ue6d3≻ꕰᢴ\uf8a8⾋ꐦ퇼냪﨧킻ㅘ\udd7e䚈\ue733꾡ϼ\uda6a孲巴㳓齏\ue790䙼㚚⼊✩逌磏즬౬\ue46f⮢횴ந\uf214食ᷭ\uf8e2ꖃꬣ\uedcc虵旃揹\u09ca꺕\ud82a廧瓑둶݇\uf258綕뱏秺㓩楣\udd5e⽁쬟뙉䀏몶甡뉙ౘ푫脂倛뇤\uec01븷翴\u1aaf憱\uf8eeꈸẌ眠䛛딋즥⚢ࣴa⊚ᄹ牐\ue7ecঔ㨯묳鸴㮂㯃묦\ueb2e⏝힗\udd7f핎ㄾ\u07b7厞\ue793\uf3f6鮽\uded0か掺\ue5fb槏হУ微Յ魳≴⃮鷰䙢࿉\ude30勭蘨㚜콢잺\ue02c⍩蘔햇뇎绍毭\ue78aꔐ➨찷ꌛ㲂\udc7d\uf4fc\ue5d5聿垪氁誦⁜鿿̰ⶻ葂爐柶衦贠ﰁ煨\u243f갺梏搨⿰ꅉ暲짲ㆲဝ⍿䚟䇵똭뉭䌄燮꾒攪鋤懧꿌\ud89d"
         .length();
      String var7 = "a⨆燰갳\uf214\ue597ឺ㦷\ue52a꒝갎襔㖧\ue6d3≻ꕰᢴ\uf8a8⾋ꐦ퇼냪﨧킻ㅘ\udd7e䚈\ue733꾡ϼ\uda6a孲巴㳓齏\ue790䙼㚚⼊✩逌磏즬౬\ue46f⮢횴ந\uf214食ᷭ\uf8e2ꖃꬣ\uedcc虵旃揹\u09ca꺕\ud82a廧瓑둶݇\uf258綕뱏秺㓩楣\udd5e⽁쬟뙉䀏몶甡뉙ౘ푫脂倛뇤\uec01븷翴\u1aaf憱\uf8eeꈸẌ眠䛛딋즥⚢ࣴa⊚ᄹ牐\ue7ecঔ㨯묳鸴㮂㯃묦\ueb2e⏝힗\udd7f핎ㄾ\u07b7厞\ue793\uf3f6鮽\uded0か掺\ue5fb槏হУ微Յ魳≴⃮鷰䙢࿉\ude30勭蘨㚜콢잺\ue02c⍩蘔햇뇎绍毭\ue78aꔐ➨찷ꌛ㲂\udc7d\uf4fc\ue5d5聿垪氁誦⁜鿿̰ⶻ葂爐柶衦贠ﰁ煨\u243f갺梏搨⿰ꅉ暲짲ㆲဝ⍿䚟䇵똭뉭䌄燮꾒攪鋤懧꿌\ud89d";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 164;
               case 1 -> 192;
               case 2 -> 138;
               case 3 -> 3;
               case 4 -> 156;
               case 5 -> 22;
               case 6 -> 27;
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

      lIl = var9;
      llI = new Object[var9.length];
      lII = new int[303];
      int var21 = 0;
      int var10001 = 0;
      byte[] var10002 = "xèx\u00887~$>È\u0018v§dsuÿ$á;á\t\u0015{\u0097þ\u0007d¸ìvÈÖ\u008fäÔS¢\u0087¦¯ÜÚ\u0087\u008dQ\u0018Þì\u0097ï\u008a»Îa\rd®\u0019×£\u0011\u0094\u0005(¼H\u0001\u0000vx]+þ\u007fdc\u0088ý½çÈÜ&ü\u000fXf*Á\u0098Q7\u0018Dc\u0012q#Æø\u0098·ÎJn.òßA$\u0096ð_!nÄû\u0087Vn}1\u0089WÎa\u008f\u000e\u0000\u000b|\u000fIÁÓz·\u0094ç\u0012\u009cÆ`ÚïâÅµÆ\u0094¿/Í×Pbl(\u008cïÞ¬S\u0094Má\u0015r\u009a,ó\u0087\u008c^Îz\t\u0011 PD\u0085c\u001a\u0011P\u009clÎu\u0019a^[C\u0019«^\u0083\u001e6«\u0081»+\"\u0011-Rã»nõ.\u009aÖÓ[b\f\u0093îTµÜ\u0002Ó3ø\u0018\u0091kÊ¢Z5Ø×ä8Öµ\u0082l\u0082\u0013¼C\u001d¯¸¡ë~û\u0092F\u0087)º\u0081@+òÌhO\u0018Í@+(üJ\u000b_¡ø*2&ñ\n\u0091j±)þ²½¦P#\u0011\r\u0004\u001c\u001d«Ñ\u001aÌqè{L\u001e\u0095#Z\u0018\u0082;Q\u0098\u0099A¸\u009a\u0087$\u001bÍ\u0089¦\u009eî\u0011\u00adïl\u009aa$L\u0003\u0095\u007fì[ÏºqH\n&[\u009ee7*ªeD¨\u001b\\ \u00adjYtÝè\u008d|ç{^Õ¸À\u0080ªè\u000b=Ú^Rú\\\u0086!íÂý5ÅKQ-\u0003è\u001aã\u0098çÓn\u0016¿}Z\u0088\u009e\u001c\u0092×l\u0019\u001fåø¤{]\\Q\u0004\u0003:XxËÜ\u008fë´2c²)\u0093Nmû4\u0092x\u001aIì\u009c#ø[§ÆiÞ\u00ad^ü\u0088\u000ebOtË\fàö²3ûv é×3¼$d\u0085CÜ\u009eÀ\u0096\r}91\u009dî\u0012½ªz\u000eWÓ~ \u009a\u0000kÃïkã\u0082\u008bEc\u001f\u009b\u0017&U®»0X\u000bÕD\u0080~=¼Þºikw·\u0090=\u0093¢v ¯/ISÖ8@É\u0085\u001a4½ûe/HhÇ}oÙê\u000e(ä¹\n¢ú\u0086I½¨¥U\u0000£r©\u001aÖ\u0091\u0096\u001e94$lxí\u0005\u0004Çòò\u009dNNF\bVT\u008bY¶P\u008cj\u00adÒ\"Æ}yïÇÎÅ\tÐ¥³Õ½¤ª`²swÙwüs\u00989@\u0095ÄöÔ\u0017e#áéVµ\u008bÉ\u0097µ\u009c\u001báÏ¿ý@¨°ûg¨ó²ôå´ç\u0007\u0085:|\u0089\tÞ¼ÐÑ\u009c£Âæ;IlÂÐ»\fè\u008fµ%\\¨m*¬ t\u0003\u000b]h³süÒ\u0080ôö8¸\u0001â\u0084\u0003Îû~\u009e9\u0002\u0086nPùo%Ù|¬RxnëOíè²A\u009cz\u0015ß\u000e$Ovä<\u0091[;í*\"}âyNï#G\u001bÄ7\u0013\u0002:ÂF¸äj\u0084}7@\u0002wp\u008aUÄ?\"\u0018Ñ\rEX-\u0081ÁÍðEV¸'A*1\u0098Ï\"ª\u008cO2c9Iì5;ki\u007fX\u0083È\t\u0002z2Jö*\u0099Ø¸9zÎòû[eø\u00162\u0015\u0082\rÎJ\u0015\u0084³¤/&m\u0084\u0001a[\u009e\u0095\u000b)\u0088h}fêÄ\f\"PpL?@¸\u0094\u0007¤OÍÔ\u0083æÍEßÓJÏÚËé\fC\u0014³F¶rh§²¢$wx²3j\u0014¼\u0093L\u0012?Æ°÷\u0082õ\u0004¥jÏ0\u001b»ÌÏ ñ\u009d\u0013\u0098d\u009d\u00adz§Ãªº 8\u0004ér<û5×úØ\u001e»W\u001c\u00ad\u001cä*Ç«$f$J\u0093UÿÂØ,ÁªÏ·\u0099Ì\u0002\u0088\u008eÎnÀ)Z«\u0085oîB÷82)ì½c\u000f\u0086,-ÏÁ¥á¼Â\u0087Ã¾\u0096z¶Ò\u00183\u008e@¨Umm~.fjZv\u008a\u001aÕ÷ôtcì½}êS\u0084\u001c\u0015¸W»¾\u008b1Íãò½\u0086ÃüÃMT©È°\u001d\u009f\u008f?£\u000b^M\u0095e»\u008b\\¾[ø\u0016ô\u001bxÌ¥ÂÕ\u0083ä_$\u008d\u008a_»\u0005²\u008d\\\u0088'\u0015ã>ÞP~¸æ©ÑÂ¥ìBÞÊï«£C\u008d\u008dÐ¿æ\u009b\u001aê\u0004\u00065å\u000e\u0017o\fm³\f¦[£=\u0083{Lî\u008c\u0084Ó\u0006~ö+\u0011({ªÈüã\u0005á\u008a\u008b,×ºJQU\u0094ÝQ\u0018ìgÃuÌ\u009cÍÈ]¶Ìç\u0086\u0098û\u001bµÌ¯\u0084\u009d\u0006ÛÒ\u0001\u0007r<1}cî=2{\u0016\u0091"
         .getBytes("ISO-8859-1");

      int var54;
      do {
         lII[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 1470489693;
         var21 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var5 = new String[lI(470653000, var17 ^ -2044560913)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = ll(var17 ^ -1823441269, '튼', '㝟')).length();
      int var1 = lI(470653001, var17 ^ -1412024256);
      int var19 = -1;

      label101:
      while (true) {
         var21 = lI(470653002, var17 ^ 1556358875);
         String var26 = var2.substring(++var19, var19 + var1);
         byte var38 = -1;

         while (true) {
            label96: {
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
                     break label96;
                  }

                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % lI(470652998, var17 ^ 2115618294)) {
                     case 0 -> lI(470652999, var17 ^ -203711236);
                     case 1 -> lI(470652992, var17 ^ 892127388);
                     case 2 -> lI(470652993, var17 ^ 1822576452);
                     case 3 -> lI(470652994, var17 ^ 215651836);
                     case 4 -> lI(470652995, var17 ^ -1286125813);
                     case 5 -> lI(470653020, var17 ^ 512443165);
                     default -> lI(470653021, var17 ^ -725934289);
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
                     ll = var5;
                     Ill = new String[lI(470652997, var17 ^ 4514988)];
                     I = new String[lI(470653022, var17 ^ 1555834491)];
                     II();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var61;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label101;
                  }

                  var4 = (var2 = ll(var17 ^ -1461432642, '튽', '：')).length();
                  var1 = lI(470653003, var17 ^ 1320520451);
                  var19 = -1;
            }

            var21 = lI(470652996, var17 ^ 757569259);
            var26 = var2.substring(++var19, var19 + var1);
            var38 = 0;
         }
      }
   }

   @Override
   public void IlIII() {
      this.IlI.clear();
      this.l(IlIIllIII.lI(I[0]));
   }

   private void l(String var1) {
      class_310 var2 = class_310.method_1551();
      if (var2.field_1724 != null && var2.field_1687 != null) {
         IIIIllll var3 = new IIIIllll(var2.field_1724, var1, this.II.IllI().floatValue(), this.Il.IllI(), this.lI.IllI());
         var3.Il();
         this.IlI.add(var3);
      } else {
         this.IlIllIl(false);
      }
   }

   private static void II() {
      int var0 = -1136485691;
      I[0] = I(Il(lI(470653023, var0 ^ -2132220376), lI(470653016, var0 ^ -1060508644)).toCharArray(), 98389L, lI(470653017, var0 ^ 1665762635));
      I[1] = I(Il(lI(470653018, var0 ^ -913503502), lI(470653019, var0 ^ 273709836)).toCharArray(), 28673L, lI(470653012, var0 ^ -1315925177));
      I[2] = I(Il(lI(470653013, var0 ^ -1868393087), lI(470653014, var0 ^ 1715119331)).toCharArray(), 98778L, lI(470653015, var0 ^ -2055775541));
      I[3] = I(Il(lI(470653008, var0 ^ 1463039237), lI(470653009, var0 ^ -208470506)).toCharArray(), 53560L, lI(470653010, var0 ^ 394042169));
      I[4] = I(Il(lI(470653011, var0 ^ -965421768), lI(470653036, var0 ^ 136277854)).toCharArray(), 26821L, lI(470653037, var0 ^ 1121797427));
      I[5] = I(Il(lI(470653038, var0 ^ -1082016488), lI(470653039, var0 ^ -1798055858)).toCharArray(), 69489L, lI(470653032, var0 ^ -617500760));
      I[lI(470653033, var0 ^ -830399337)] = I(
         Il(lI(470653034, var0 ^ -977139093), lI(470653035, var0 ^ 1681729512)).toCharArray(), 25441L, lI(470653028, var0 ^ 2120869732)
      );
      I[lI(470653029, var0 ^ 1173665479)] = I(
         Il(lI(470653030, var0 ^ -1841714813), lI(470653031, var0 ^ -2075451423)).toCharArray(), 86091L, lI(470653024, var0 ^ -360959340)
      );
   }

   private static int lI(int var0, int var1) {
      int var2 = lII[var0 ^ 470653004] ^ var1 ^ var0;
      var2 += 9070;
      var2 ^= 33889;
      var2 ^= 42309;
      var2 += 46860;
      var2 ^= 14065;
      var2 ^= 4676;
      return var2 ^ 9260;
   }

   @Override
   public void llIl() {
      String[] var1 = IIllllIl.IIIIl();

      while (!this.IlI.isEmpty()) {
         IIIIllll var2 = this.IlI.pollFirst();
         if (var2 != null) {
            var2.I();
         }

         if (var1 != null) {
            break;
         }
      }

      this.IIl = false;
   }

   private static String Il(int var0, int var1) {
      int var9 = -297732373;
      int var2 = (var0 ^ lI(470653025, var9 ^ 512906442)) & lI(470653026, var9 ^ -1262989144);
      if (Ill[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & lI(470653027, var9 ^ -1805461852)) {
            case 0 -> lI(470653052, var9 ^ 72125807);
            case 1 -> lI(470653053, var9 ^ -246854375);
            case 2 -> lI(470653054, var9 ^ 1824280074);
            case 3 -> lI(470653055, var9 ^ 1899355834);
            case 4 -> lI(470653048, var9 ^ 150238406);
            case 5 -> lI(470653049, var9 ^ -1355197110);
            case 6 -> lI(470653050, var9 ^ -1991463843);
            case 7 -> lI(470653051, var9 ^ -906388821);
            case 8 -> lI(470653044, var9 ^ -2045436796);
            case 9 -> lI(470653045, var9 ^ -1576050894);
            case 10 -> lI(470653046, var9 ^ -1867148229);
            case 11 -> lI(470653047, var9 ^ -2101335492);
            case 12 -> lI(470653040, var9 ^ -1935520755);
            case 13 -> lI(470653041, var9 ^ -670796880);
            case 14 -> lI(470653042, var9 ^ 1203271387);
            case 15 -> lI(470653043, var9 ^ -1318505038);
            case 16 -> lI(470652940, var9 ^ 479258232);
            case 17 -> lI(470652941, var9 ^ -614996866);
            case 18 -> lI(470652942, var9 ^ -1770028785);
            case 19 -> lI(470652943, var9 ^ -1755847304);
            case 20 -> lI(470652936, var9 ^ -1503804099);
            case 21 -> lI(470652937, var9 ^ -68164157);
            case 22 -> lI(470652938, var9 ^ 2095498478);
            case 23 -> lI(470652939, var9 ^ 816244734);
            case 24 -> lI(470652932, var9 ^ -391484980);
            case 25 -> lI(470652933, var9 ^ 2030486343);
            case 26 -> lI(470652934, var9 ^ 1175086131);
            case 27 -> lI(470652935, var9 ^ 1088142968);
            case 28 -> lI(470652928, var9 ^ 559665444);
            case 29 -> lI(470652929, var9 ^ 2035144348);
            case 30 -> lI(470652930, var9 ^ 1631999690);
            case 31 -> lI(470652931, var9 ^ 464475271);
            case 32 -> lI(470652956, var9 ^ 2114715987);
            case 33 -> lI(470652957, var9 ^ -58121838);
            case 34 -> lI(470652958, var9 ^ -134700412);
            case 35 -> lI(470652959, var9 ^ 993231410);
            case 36 -> lI(470652952, var9 ^ -815259115);
            case 37 -> lI(470652953, var9 ^ -1783775600);
            case 38 -> lI(470652954, var9 ^ 1345426620);
            case 39 -> lI(470652955, var9 ^ 1059120527);
            case 40 -> lI(470652948, var9 ^ 1062429908);
            case 41 -> lI(470652949, var9 ^ 112681729);
            case 42 -> lI(470652950, var9 ^ 56824337);
            case 43 -> lI(470652951, var9 ^ -680842967);
            case 44 -> lI(470652944, var9 ^ 79853379);
            case 45 -> lI(470652945, var9 ^ -625138156);
            case 46 -> lI(470652946, var9 ^ 1741525490);
            case 47 -> lI(470652947, var9 ^ -1605678636);
            case 48 -> lI(470652972, var9 ^ -1210764440);
            case 49 -> lI(470652973, var9 ^ -1621320002);
            case 50 -> lI(470652974, var9 ^ 1509938479);
            case 51 -> lI(470652975, var9 ^ -1024451307);
            case 52 -> lI(470652968, var9 ^ 1286124337);
            case 53 -> lI(470652969, var9 ^ -762719373);
            case 54 -> lI(470652970, var9 ^ -1921263914);
            case 55 -> lI(470652971, var9 ^ -1074828750);
            case 56 -> lI(470652964, var9 ^ 122396468);
            case 57 -> lI(470652965, var9 ^ 1496160222);
            case 58 -> lI(470652966, var9 ^ -1848950689);
            case 59 -> lI(470652967, var9 ^ -299520523);
            case 60 -> lI(470652960, var9 ^ 1938063780);
            case 61 -> lI(470652961, var9 ^ -1591518088);
            case 62 -> lI(470652962, var9 ^ 1079911284);
            case 63 -> lI(470652963, var9 ^ 2045744582);
            case 64 -> lI(470652988, var9 ^ -1669459590);
            case 65 -> lI(470652989, var9 ^ 82528155);
            case 66 -> lI(470652990, var9 ^ 945339110);
            case 67 -> lI(470652991, var9 ^ 1459042449);
            case 68 -> lI(470652984, var9 ^ 1777121708);
            case 69 -> lI(470652985, var9 ^ -1279198028);
            case 70 -> lI(470652986, var9 ^ 2121484870);
            case 71 -> lI(470652987, var9 ^ -2037838126);
            case 72 -> 4;
            case 73 -> lI(470652980, var9 ^ 1466627878);
            case 74 -> lI(470652981, var9 ^ -939926266);
            case 75 -> lI(470652982, var9 ^ -261242854);
            case 76 -> lI(470652983, var9 ^ -1989578994);
            case 77 -> lI(470652976, var9 ^ 1518079097);
            case 78 -> lI(470652977, var9 ^ 838094028);
            case 79 -> lI(470652978, var9 ^ 527749149);
            case 80 -> lI(470652979, var9 ^ 1295096481);
            case 81 -> lI(470653132, var9 ^ -517499054);
            case 82 -> lI(470653133, var9 ^ -1890365560);
            case 83 -> lI(470653134, var9 ^ 1739264322);
            case 84 -> lI(470653135, var9 ^ 863811939);
            case 85 -> lI(470653128, var9 ^ -903193292);
            case 86 -> lI(470653129, var9 ^ 741826584);
            case 87 -> lI(470653130, var9 ^ 323230159);
            case 88 -> lI(470653131, var9 ^ 450776029);
            case 89 -> lI(470653124, var9 ^ 1856648337);
            case 90 -> lI(470653125, var9 ^ 1969203119);
            case 91 -> lI(470653126, var9 ^ 662181607);
            case 92 -> lI(470653127, var9 ^ 1413425717);
            case 93 -> lI(470653120, var9 ^ 1354052688);
            case 94 -> lI(470653121, var9 ^ 329934771);
            case 95 -> lI(470653122, var9 ^ 253193657);
            case 96 -> lI(470653123, var9 ^ -217245638);
            case 97 -> lI(470653148, var9 ^ -871762640);
            case 98 -> lI(470653149, var9 ^ 2122037212);
            case 99 -> lI(470653150, var9 ^ 1595082779);
            case 100 -> lI(470653151, var9 ^ -1467317996);
            case 101 -> lI(470653144, var9 ^ 471832817);
            case 102 -> lI(470653145, var9 ^ -783386362);
            case 103 -> lI(470653146, var9 ^ -696425730);
            case 104 -> lI(470653147, var9 ^ 2027008949);
            case 105 -> lI(470653140, var9 ^ -1244659402);
            case 106 -> lI(470653141, var9 ^ 1405578023);
            case 107 -> lI(470653142, var9 ^ -1884657063);
            case 108 -> lI(470653143, var9 ^ 983940160);
            case 109 -> lI(470653136, var9 ^ -2090847462);
            case 110 -> lI(470653137, var9 ^ -1037135938);
            case 111 -> lI(470653138, var9 ^ -1629414675);
            case 112 -> lI(470653139, var9 ^ 1060384385);
            case 113 -> lI(470653164, var9 ^ 211961054);
            case 114 -> lI(470653165, var9 ^ -845000005);
            case 115 -> lI(470653166, var9 ^ -1143443212);
            case 116 -> lI(470653167, var9 ^ 448757296);
            case 117 -> lI(470653160, var9 ^ 1035943118);
            case 118 -> lI(470653161, var9 ^ -1359840328);
            case 119 -> lI(470653162, var9 ^ 1569912240);
            case 120 -> lI(470653163, var9 ^ -753004034);
            case 121 -> lI(470653156, var9 ^ -1966713959);
            case 122 -> lI(470653157, var9 ^ -1728973375);
            case 123 -> lI(470653158, var9 ^ 919936916);
            case 124 -> lI(470653159, var9 ^ 1459569023);
            case 125 -> lI(470653152, var9 ^ 2135647957);
            case 126 -> 5;
            case 127 -> lI(470653153, var9 ^ 1891331878);
            case 128 -> lI(470653154, var9 ^ 1495045100);
            case 129 -> lI(470653155, var9 ^ -379309478);
            case 130 -> lI(470653180, var9 ^ -622642821);
            case 131 -> lI(470653181, var9 ^ -501863370);
            case 132 -> lI(470653182, var9 ^ 1507406963);
            case 133 -> lI(470653183, var9 ^ -1003566029);
            case 134 -> lI(470653176, var9 ^ 877082597);
            case 135 -> lI(470653177, var9 ^ 2144252833);
            case 136 -> lI(470653178, var9 ^ 141533285);
            case 137 -> lI(470653179, var9 ^ 368715334);
            case 138 -> lI(470653172, var9 ^ 462140584);
            case 139 -> lI(470653173, var9 ^ -2061899096);
            case 140 -> lI(470653174, var9 ^ 754184727);
            case 141 -> lI(470653175, var9 ^ 19669905);
            case 142 -> lI(470653168, var9 ^ 2020224206);
            case 143 -> lI(470653169, var9 ^ 351857712);
            case 144 -> lI(470653170, var9 ^ 1104410743);
            case 145 -> lI(470653171, var9 ^ 1479347808);
            case 146 -> lI(470653068, var9 ^ -487348942);
            case 147 -> lI(470653069, var9 ^ 656444501);
            case 148 -> lI(470653070, var9 ^ 761742683);
            case 149 -> lI(470653071, var9 ^ -1641485066);
            case 150 -> lI(470653064, var9 ^ -1961194895);
            case 151 -> lI(470653065, var9 ^ 2006322877);
            case 152 -> lI(470653066, var9 ^ -1437427456);
            case 153 -> lI(470653067, var9 ^ 2102846753);
            case 154 -> lI(470653060, var9 ^ -1025970734);
            case 155 -> lI(470653061, var9 ^ -698811196);
            case 156 -> lI(470653062, var9 ^ 1667113810);
            case 157 -> lI(470653063, var9 ^ 1635559004);
            case 158 -> lI(470653056, var9 ^ 43255568);
            case 159 -> lI(470653057, var9 ^ 1483603254);
            case 160 -> lI(470653058, var9 ^ -1405266163);
            case 161 -> lI(470653059, var9 ^ -500255635);
            case 162 -> lI(470653084, var9 ^ -1460890612);
            case 163 -> lI(470653085, var9 ^ -1576927653);
            case 164 -> lI(470653086, var9 ^ -669384517);
            case 165 -> lI(470653087, var9 ^ 1335065847);
            case 166 -> lI(470653080, var9 ^ 1966187376);
            case 167 -> lI(470653081, var9 ^ 1534498139);
            case 168 -> lI(470653082, var9 ^ -820189376);
            case 169 -> lI(470653083, var9 ^ 845851040);
            case 170 -> lI(470653076, var9 ^ -1642336973);
            case 171 -> lI(470653077, var9 ^ 710668699);
            case 172 -> lI(470653078, var9 ^ -494679716);
            case 173 -> lI(470653079, var9 ^ 366615513);
            case 174 -> lI(470653072, var9 ^ -1126528285);
            case 175 -> lI(470653073, var9 ^ -1990393578);
            case 176 -> lI(470653074, var9 ^ -1845575023);
            case 177 -> lI(470653075, var9 ^ 1319405959);
            case 178 -> lI(470653100, var9 ^ 679438466);
            case 179 -> lI(470653101, var9 ^ -130827844);
            case 180 -> lI(470653102, var9 ^ -400251715);
            case 181 -> lI(470653103, var9 ^ -427523354);
            case 182 -> lI(470653096, var9 ^ 1708228152);
            case 183 -> lI(470653097, var9 ^ -656225404);
            case 184 -> lI(470653098, var9 ^ 819527477);
            case 185 -> lI(470653099, var9 ^ -505741020);
            case 186 -> lI(470653092, var9 ^ -1416962754);
            case 187 -> lI(470653093, var9 ^ 1049256534);
            case 188 -> lI(470653094, var9 ^ -36411698);
            case 189 -> lI(470653095, var9 ^ -97530976);
            case 190 -> lI(470653088, var9 ^ 673920389);
            case 191 -> 3;
            case 192 -> lI(470653089, var9 ^ -1913841915);
            case 193 -> lI(470653090, var9 ^ -515845618);
            case 194 -> lI(470653091, var9 ^ 1190389432);
            case 195 -> lI(470653116, var9 ^ -248272590);
            case 196 -> lI(470653117, var9 ^ 277125766);
            case 197 -> lI(470653118, var9 ^ -1731206609);
            case 198 -> lI(470653119, var9 ^ -254248689);
            case 199 -> lI(470653112, var9 ^ -1776990287);
            case 200 -> 1;
            case 201 -> lI(470653113, var9 ^ -1804005652);
            case 202 -> lI(470653114, var9 ^ 12339791);
            case 203 -> lI(470653115, var9 ^ -1269483106);
            case 204 -> lI(470653108, var9 ^ 1748902857);
            case 205 -> lI(470653109, var9 ^ 957892980);
            case 206 -> lI(470653110, var9 ^ 2010648235);
            case 207 -> lI(470653111, var9 ^ -1146417713);
            case 208 -> lI(470653104, var9 ^ -1716954611);
            case 209 -> lI(470653105, var9 ^ -322578699);
            case 210 -> lI(470653106, var9 ^ -732469597);
            case 211 -> lI(470653107, var9 ^ 930787679);
            case 212 -> lI(470653260, var9 ^ 1014862857);
            case 213 -> lI(470653261, var9 ^ -804447408);
            case 214 -> lI(470653262, var9 ^ -1369199358);
            case 215 -> lI(470653263, var9 ^ -412474106);
            case 216 -> lI(470653256, var9 ^ -569648387);
            case 217 -> lI(470653257, var9 ^ 229405079);
            case 218 -> lI(470653258, var9 ^ 1809460417);
            case 219 -> lI(470653259, var9 ^ -409924336);
            case 220 -> lI(470653252, var9 ^ -1722115080);
            case 221 -> lI(470653253, var9 ^ -1834495986);
            case 222 -> lI(470653254, var9 ^ -718770824);
            case 223 -> 0;
            case 224 -> lI(470653255, var9 ^ 73030540);
            case 225 -> lI(470653248, var9 ^ -509832671);
            case 226 -> lI(470653249, var9 ^ 32496049);
            case 227 -> lI(470653250, var9 ^ 1097794436);
            case 228 -> lI(470653251, var9 ^ -1732096386);
            case 229 -> lI(470653276, var9 ^ 87245639);
            case 230 -> lI(470653277, var9 ^ 95210282);
            case 231 -> lI(470653278, var9 ^ -682932508);
            case 232 -> lI(470653279, var9 ^ 1341452676);
            case 233 -> lI(470653272, var9 ^ 174683724);
            case 234 -> lI(470653273, var9 ^ -205124187);
            case 235 -> lI(470653274, var9 ^ -1235939269);
            case 236 -> lI(470653275, var9 ^ -1245942339);
            case 237 -> 2;
            case 238 -> lI(470653268, var9 ^ -677765546);
            case 239 -> lI(470653269, var9 ^ -1131620959);
            case 240 -> lI(470653270, var9 ^ 1578236716);
            case 241 -> lI(470653271, var9 ^ 1409327105);
            case 242 -> lI(470653264, var9 ^ 933544944);
            case 243 -> lI(470653265, var9 ^ 28635908);
            case 244 -> lI(470653266, var9 ^ 559620596);
            case 245 -> lI(470653267, var9 ^ -557528958);
            case 246 -> lI(470653292, var9 ^ -1405297140);
            case 247 -> lI(470653293, var9 ^ 566036006);
            case 248 -> lI(470653294, var9 ^ -1189990660);
            case 249 -> lI(470653295, var9 ^ -784656059);
            case 250 -> lI(470653288, var9 ^ 273062720);
            case 251 -> lI(470653289, var9 ^ -2025400351);
            case 252 -> lI(470653290, var9 ^ 1037351699);
            case 253 -> lI(470653291, var9 ^ -958790129);
            case 254 -> lI(470653284, var9 ^ -321181121);
            default -> lI(470653285, var9 ^ -1024666272);
         };
         int var5 = (var1 & lI(470653286, var9 ^ -1766307235)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lI(470653287, var9 ^ -1556930624)) >>> lI(470653280, var9 ^ 1566962388)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lI(470653281, var9 ^ 661922042);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lI(470653282, var9 ^ 1751963733);
            }
         }

         Ill[var2] = new String(var3).intern();
      }

      return Ill[var2];
   }

   @Override
   public void IIlIl() {
      class_306 var1 = this.III.IllI();
      boolean var2 = this.IIIIlIl() && !IIll.IIlll(var1) && IIll.IIIllll(class_310.method_1551(), var1);
      if (var2 && !this.IIl) {
         String var10001 = IlIIllIII.lI(I[1]);
         int var4 = this.IlI.size();
         String var3 = var10001;
         this.l(var3 + var4);
      }

      this.IIl = var2;
   }
}
