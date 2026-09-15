package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class llIlIll extends IlIIIIIIl implements IIIIIlII {
   private static final double I = 18.0;
   private static final String[] IIll;
   private static final int II = 9;
   private final IIlIII Il;
   private static String[] lI;
   private final lllIIlII ll;
   private static final double III = 64.0;
   private static final double IIl = 0.0;
   private static final int IlI = 3;
   private static final int[] IIlI;
   private static final String[] Ill;
   private static final double lII = 172.0;
   private final IIlIII lIl;
   private static final IIIllIIl llI;
   private final IIlIII lll;
   private static final double IIII = 5.0;
   private static final Object[] IlII;
   private static final String[] IIIl;

   @Override
   public double lll() {
      return this.Il.IllI();
   }

   @Override
   public double IIllI() {
      return 172.0 * this.Il();
   }

   @Override
   public void lllI(double var1, double var3) {
      class_310 var5 = class_310.method_1551();
      double var6 = Double.MAX_VALUE;
      double var8 = Double.MAX_VALUE;
      if (var5 != null && var5.method_22683() != null) {
         var6 = Math.max(0.0, var5.method_22683().method_4486() - this.IIllI());
         var8 = Math.max(0.0, var5.method_22683().method_4502() - this.IIIl());
      }

      this.Il.Ill(Math.max(0.0, Math.min(var1, var6)));
      this.lll.Ill(Math.max(0.0, Math.min(var3, var8)));
   }

   public llIlIll() {
      super(IlIIllIII.Ill(lI[3]), lllIIlIl.II, IlIIllIII.Ill(lI[2]));
      this.Il = this.IllIIll(new IIlIII(IlIIllIII.Ill(lI[4]), 18.0, 0.0, 4000.0, 1.0).IlII(IlIIllIII.lI(lI[1])));
      this.lll = this.IllIIll(new IIlIII(IlIIllIII.Ill(lI[lII(458603149, 1924398177 ^ -1696155484)]), 240.0, 0.0, 4000.0, 1.0).IlII(IlIIllIII.lI(lI[1])));
      this.lIl = this.IllIIll(new IIlIII(IlIIllIII.Ill(lI[0]), 100.0, 60.0, 200.0, 5.0).IlII(IlIIllIII.lI(lI[lII(458603148, 1924398177 ^ 1519273866)])));
      this.ll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[5]), true));
   }

   private void I(class_332 var1, class_310 var2, class_1661 var3) {
      class_327 var5 = var2.field_1772;
      double var6 = 5.0;
      String[] var10000 = IIllllIl.IIIIl();
      double var8 = 5.0;
      String[] var4 = var10000;
      int var10 = 0;

      while (var10 < 3) {
         int var11 = 0;

         while (true) {
            if (var11 < lII(458603151, 1244388068 ^ -1729851496)) {
               int var12 = this.II(var10, var11);
               double var13 = var6 + var11 * 18.0 + 1.0;
               double var15 = var8 + var10 * 18.0 + 1.0;
               IIIlIllII.I(var1, var13, var15, 16.0, 16.0, 3.5);
               class_1799 var17 = var3.method_5438(var12);
               if (!var17.method_7960()) {
                  IlIIlllIl.llIllI(var1, var5, var17, (int)Math.round(var13 + 0.0), (int)Math.round(var15 + 0.0));
               }

               var11++;
               if (var4 == null) {
                  continue;
               }
            }

            var10++;
            if (var4 != null) {
               return;
            }
            break;
         }
      }
   }

   @Override
   public double ll() {
      return this.lll.IllI();
   }

   @Override
   public void Illl(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.Ill(var1, var5);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -945206510;
      String var8 = "藖瘵\ue604픦닦ͺዛ鬧囎厰鱻\u0d99猁텡戸ￆꛬ\u2fe3惊粒\ue6fdꚢ椡튀ᰱ睚履襆쬬裡ﹿ⟂០\ue705ꛁత䢘완兀ꛆﯪ\u243f\ue5de橱ꚯ꼐7\udb0c骄룡咬\udac7濬봼龴\ueea3⼾銁\uf5c0픖겵\uef3f툛뾜ᝰ衙\udf0e퍰쭜\uf1bc綕\ue692⨐\uf0b6甗\udbc5∻\ue489껓ꛭ磨ᕿ촜땳콺⪽鿥⌺Ꙭ䐴Ọ筫恢ᜰ쒧\uf35e\udf5a薺泦䨹뫡䅓\ude37ᇲ婈煍";
      char[] var10001 = "燁燁".toCharArray();
      byte var14 = -1;
      char[] var9 = var10001;
      short var7 = 29172;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            IIll = var10;
            IlII = new Object[var10.length];
            int var22 = 0;
            IIlI = new int[304];
            byte var25 = 0;
            byte[] var10002 = "Öq\u0012ë\u0016\u0019íÅìë\u0003cfé5eLz#j$1\u0097\u000e\u0099ÜXxÓ\u0001£\u001c½\u008dÏ\u0010Ý\u0097ZpÓ\u0084\u009dàßpF\\/\u0092×ÁÃðÓ\u0080;ö\u0080\btqÈ1Ð\r\u008d\u001d\u009adÚOE²~\u0003\u0001\u0002dåIG1O\u009c²ÍY\u000f¨\u0006|t\u009d +\u0093½\u0010\u001c\u0089û2³NA_#\u0013úÄm È\u0014Õ³aQ\u0014\u0096\u008e\u0096@w\u001f?¡Iq\u0006ô\u008dµ+\u0001j#\u0011ÄÇä\u0089$pg§sE1-\u0011ÔM\u0019K£\u0003\u0001_°&®\u0092Òµ\u009b©\u001aß\u0082R0ýlS&MMù »<«XD\u008bâ\u0098;ýê\r\u0019\u001aÑo´2%Lj\u0015\u0096É-¹a+\u0017Ù%\u0094Ü.çc\u008fÑ\u001a`4è\u0006æ¼Ùÿª\u0091t\u0090F\u009b\u0006»\u001e<\u0014ïÏ\u0007\u0003;?\u0082!dKb\u008dßÜ%úê\u001c±Ï\u001d\u0087¤Y\u008c /¿\u009a: ë\u0018´Eê²\u0018ö(å{ç\u001e^ây°\u0092}Î\u0082\rm^\u00101Ô\u009dx\u001aà¾E ¼º©¬GÏ\u0081Ûü\u001do\u00170ûöø\u008bF¹å\u0004¾¯,UxÈ\u0087\f\u0018Ìßu\u0001q\u0095VÌ\u0015\u0091j\u009e\u001e\u0095\u0019\u0080ô\u0004\u001fDtÂ\u0006*;8\u0017´oaV\u0093r«kîÌ\u0017Çqö÷y\u0090\u0018O\u008b\u0006;\u0007\u0098áäºÆeÇ\u008aí½ú+XÙ¶°\u0005©\u0017ì³¤â8oÎçÀB÷ôvQã\nÛ\u0006\u0097\u0003\u000b¶³Tê2\u009bìÚÇ«¾îN\u0084Õ>ZÙ\u001fPm\u001b¸x<j]\u008aâmEûû1~\u0013=r\u009a\u0016å?^\u0002\u0095PÙZ¬b\u0098ò\u0087LÏ8q\u000fv¢êzÑ\u0080toú»~£Õ¹\"\u009b®\u009c¡{5µ\u0098¡);ú$ÒÖ?\u009f~\f\u001f\u000bOpÞ\u001fýá\u009d:ÿuJ\nÉ£Å\u009dñ\u007fW\u009b\u009b\b+íBñ)¿*Û4r\u009a\u0093\u009bî\u0015\u0093@yï9ðñKs\u000bq:õÝ7UWÜs\u0084k\u009c$i\u000bL[ÆF#m\u0086áÕ©kÎæ\"ÐN)L©\u0087Õæ5o+¬?|\u0092\u0002\u009c\u0015m¡&FeÍD{y\f:q\\û\u0085¤·\u009b\t*+ö\u008dÍª>°\u0000Äp\u0092ë>ù\u0002\u007fEµ×\u008eþ-\u0011Ôºåï]ÞÏñû¡.\u0006\u0091\u0004WÈ'\u0080ýþJ\u008e\u0012\u0096\u0096ÿ¢%ù\u008dcõ\u0010×$hí\u0012³\u0089úzB¯\u001a\u001c+\u001c'\u001bÃÌ\u0093¢Bãß¹\u001c\u0006\u0016q\u0000\u008a\u009c\u0085\u0097\u008d.ª\u0005%|a\u0086yfá\u0095\u0083ö=vp=\u001a\u0012O`à\u0094ú\u0082áÇ\u008a/ãÞ\u0018\u009bª\u00903\u0082§Eï\u008cvA \u0089P\u009dºê¾ é%\\\u0017ÄàkÒü¿òu\u0018ªßßdÒãÅ\u009d/F3îw.Í¹ñcb\u001d|ß\u001d\u007f\u001e\u0012è\u0090\u0095l\"õÛØAhj!¿ 0#J\u0085w\\\"K÷è\u0015Lë'3h\u0015à¶8ñ\u0098\u0089Ì Vü\u001b\u0088\u0010k\u0010û¾\u0011\u0080ÛÊ$q£b^èO\u0014°\u0004{ú¹¬ðEG>Í\u0005÷9cl¬Ö;\u001c\u0091~¿ýÒ@áÉ\u008eÒ¶ÓLµÆþG<(Þ\u0099ñJ»¾q8¤½\u0019í\u0098æ\u009d\u0081;\u000b\tm\u00846Ú'ÿ«ÍªÙ\u0006DÄ\u0010sPÇ\n1\"3ð\u0085Ë2}I\u0081\\ßó§\u008cXÄW\u0089Ær¥\u0016\u0095è~Me\u008c\f]¦`$º\u0086\u0004(,\u0015KD\u0097Î@aKUÊÅ\u0085úÒ\f23×»RÚ\u0089ê[\u0083U\u0097\u009b0ùK³oª-9æwßk\u00ad2\u001b°Â\u0016¡\\\u0082\u0099\u0081´\u0084\fÆlÒï«\u0010\u0003\u009cs\u001f1ñBc>\u00075ÿß=-ÉW\u0097åFÉ°iòH à\\\u0089Ö{0¢óú\nÝÑN\u0097 Z0\u009fîù/^ÏéÕ\u000b\u0080ÑþÆ0\ny\u00162O=zëX\fî.\u008c5¤¤+\u0093\u000b;%¥\\23Á¹^ªW=bV|U\u001d¼Nyáø>\u0086®GkL\u008e2?\u0085±KÚü\f\u001bG)\u0003^k8îÿÇÊÇ©\u0083Ç\u009d\u0092®êj5W¯©\t\u009aö\u0095º#6ä\u0016\u0085\u0093ñ÷i6«ä\u0013[E~\u0089Ð\t\u0015¸\u0011%\u008bk\u0005"
               .getBytes("ISO-8859-1");

            int var56;
            do {
               IIlI[var22] = ((var10002[var25] & 255) << 24 | (var10002[var25 + 1] & 255) << 16 | (var10002[var25 + 2] & 255) << 8 | var10002[var25 + 3] & 255)
                  ^ -628227340;
               var22 += 1;
               var56 = var25 + 4;
               var25 += 4;
            } while (var56 < var10002.length);

            String[] var5 = new String[lII(458603396, var18 ^ 649081342)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lIl(1776149450, var18 ^ -228372435)).length();
            int var1 = lII(458603399, var18 ^ -1373963910);
            int var20 = -1;

            label104:
            while (true) {
               var22 = lII(458603398, var18 ^ 809334305);
               String var28 = var2.substring(++var20, var20 + var1);
               byte var40 = -1;

               while (true) {
                  label99: {
                     char[] var58 = var28.toCharArray();
                     int var70 = var58.length;
                     int var6 = 0;
                     var56 = var22;
                     var45 = var58;
                     int var33 = var70;
                     char[] var82;
                     int var89;
                     if (var70 <= 1) {
                        var82 = var58;
                        var70 = var22;
                        var89 = var6;
                     } else {
                        var56 = var22;
                        var33 = var70;
                        if (var70 <= var6) {
                           break label99;
                        }

                        var82 = var58;
                        var70 = var22;
                        var89 = var6;
                     }

                     while (true) {
                        var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % lII(458603392, var18 ^ 1885038336)) {
                           case 0 -> lII(458603395, var18 ^ 1535043025);
                           case 1 -> lII(458603394, var18 ^ 610029963);
                           case 2 -> lII(458603421, var18 ^ 1507274533);
                           case 3 -> lII(458603420, var18 ^ 393490677);
                           case 4 -> lII(458603423, var18 ^ 912575139);
                           case 5 -> lII(458603422, var18 ^ 2036130173);
                           default -> lII(458603417, var18 ^ -913873653);
                        });
                        var6++;
                        if (var56 == 0) {
                           var89 = var56;
                           var82 = var45;
                           var70 = var56;
                        } else {
                           if (var33 <= var6) {
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
                        if ((var20 += var1) >= var4) {
                           IIIl = var5;
                           Ill = new String[lII(458603393, var18 ^ -1322386322)];
                           lI = new String[lII(458603416, var18 ^ -876469935)];
                           IIl();
                           llI = IIIllIIl.II;
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var63;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label104;
                        }

                        var4 = (var2 = lIl(1776149451, var18 ^ -964023975)).length();
                        var1 = 4;
                        var20 = -1;
                  }

                  var22 = 1;
                  var28 = var2.substring(++var20, var20 + var1);
                  var40 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 198;
                  case 1 -> 2;
                  case 2 -> 252;
                  case 3 -> 95;
                  case 4 -> 93;
                  case 5 -> 102;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static String l(int var0, int var1) {
      int var9 = 684637533;
      int var2 = (var0 ^ lII(458603150, var9 ^ -1879296475)) & lII(458603145, var9 ^ -1519400956);
      if (Ill[var2] == null) {
         char[] var3 = IIIl[var2].toCharArray();

         int var4 = switch (var3[0] & lII(458603144, var9 ^ 853230433)) {
            case 0 -> lII(458603147, var9 ^ -1892250520);
            case 1 -> lII(458603146, var9 ^ -974435426);
            case 2 -> lII(458603141, var9 ^ -1419302946);
            case 3 -> lII(458603140, var9 ^ -880964004);
            case 4 -> 2;
            case 5 -> lII(458603143, var9 ^ -982627875);
            case 6 -> lII(458603142, var9 ^ -912616901);
            case 7 -> lII(458603137, var9 ^ 964166648);
            case 8 -> lII(458603136, var9 ^ -719714730);
            case 9 -> lII(458603139, var9 ^ 756836515);
            case 10 -> lII(458603138, var9 ^ 1654332506);
            case 11 -> lII(458603165, var9 ^ -957913699);
            case 12 -> lII(458603164, var9 ^ -1936847279);
            case 13 -> lII(458603167, var9 ^ 1398314568);
            case 14 -> lII(458603166, var9 ^ 401116239);
            case 15 -> lII(458603161, var9 ^ 1605228986);
            case 16 -> lII(458603160, var9 ^ -1973934683);
            case 17 -> lII(458603163, var9 ^ 423809642);
            case 18 -> lII(458603162, var9 ^ 1651995661);
            case 19 -> lII(458603157, var9 ^ -2057832199);
            case 20 -> lII(458603156, var9 ^ -1626219922);
            case 21 -> lII(458603159, var9 ^ 1487648675);
            case 22 -> lII(458603158, var9 ^ 84938842);
            case 23 -> lII(458603153, var9 ^ -1239236411);
            case 24 -> lII(458603152, var9 ^ -1517569544);
            case 25 -> lII(458603155, var9 ^ -2140897621);
            case 26 -> lII(458603154, var9 ^ 1643501395);
            case 27 -> 3;
            case 28 -> lII(458603181, var9 ^ 1604054426);
            case 29 -> lII(458603180, var9 ^ -1688222849);
            case 30 -> lII(458603183, var9 ^ 2093598159);
            case 31 -> lII(458603182, var9 ^ -787587827);
            case 32 -> lII(458603177, var9 ^ 1720546126);
            case 33 -> lII(458603176, var9 ^ 1406925033);
            case 34 -> lII(458603179, var9 ^ -1029190320);
            case 35 -> lII(458603178, var9 ^ -1242961535);
            case 36 -> lII(458603173, var9 ^ -1496548501);
            case 37 -> lII(458603172, var9 ^ -1000377593);
            case 38 -> lII(458603175, var9 ^ 204822117);
            case 39 -> lII(458603174, var9 ^ 639075464);
            case 40 -> lII(458603169, var9 ^ 816290245);
            case 41 -> lII(458603168, var9 ^ 911332464);
            case 42 -> lII(458603171, var9 ^ 1320050658);
            case 43 -> lII(458603170, var9 ^ -1898900066);
            case 44 -> lII(458603197, var9 ^ 468971949);
            case 45 -> lII(458603196, var9 ^ 2036262855);
            case 46 -> lII(458603199, var9 ^ 1518402877);
            case 47 -> lII(458603198, var9 ^ -540585441);
            case 48 -> lII(458603193, var9 ^ 1039994151);
            case 49 -> lII(458603192, var9 ^ -2110326048);
            case 50 -> lII(458603195, var9 ^ 1969554692);
            case 51 -> lII(458603194, var9 ^ 1994260609);
            case 52 -> lII(458603189, var9 ^ -262795812);
            case 53 -> lII(458603188, var9 ^ -1132749791);
            case 54 -> lII(458603191, var9 ^ 1349636854);
            case 55 -> lII(458603190, var9 ^ 148306968);
            case 56 -> lII(458603185, var9 ^ -638719080);
            case 57 -> lII(458603184, var9 ^ 694744413);
            case 58 -> lII(458603187, var9 ^ 1569219958);
            case 59 -> lII(458603186, var9 ^ -892391724);
            case 60 -> lII(458603213, var9 ^ 173745925);
            case 61 -> lII(458603212, var9 ^ -1857113697);
            case 62 -> lII(458603215, var9 ^ 918902617);
            case 63 -> lII(458603214, var9 ^ 751451978);
            case 64 -> lII(458603209, var9 ^ -1565573378);
            case 65 -> lII(458603208, var9 ^ 236765252);
            case 66 -> lII(458603211, var9 ^ 1829620347);
            case 67 -> lII(458603210, var9 ^ -191670197);
            case 68 -> lII(458603205, var9 ^ 1797548771);
            case 69 -> lII(458603204, var9 ^ 2075457684);
            case 70 -> lII(458603207, var9 ^ -1032350954);
            case 71 -> lII(458603206, var9 ^ -162229948);
            case 72 -> lII(458603201, var9 ^ -1437580990);
            case 73 -> lII(458603200, var9 ^ 1361406293);
            case 74 -> lII(458603203, var9 ^ -352876795);
            case 75 -> lII(458603202, var9 ^ 638656051);
            case 76 -> lII(458603229, var9 ^ -1649651342);
            case 77 -> lII(458603228, var9 ^ 307526518);
            case 78 -> lII(458603231, var9 ^ 1133649159);
            case 79 -> lII(458603230, var9 ^ 452076652);
            case 80 -> lII(458603225, var9 ^ 1676384562);
            case 81 -> lII(458603224, var9 ^ 1076297041);
            case 82 -> lII(458603227, var9 ^ 2088040035);
            case 83 -> lII(458603226, var9 ^ 258613367);
            case 84 -> lII(458603221, var9 ^ 162438245);
            case 85 -> lII(458603220, var9 ^ 281079558);
            case 86 -> lII(458603223, var9 ^ 22972404);
            case 87 -> lII(458603222, var9 ^ 1081714479);
            case 88 -> lII(458603217, var9 ^ 2097420347);
            case 89 -> lII(458603216, var9 ^ -778363292);
            case 90 -> lII(458603219, var9 ^ 1870318606);
            case 91 -> lII(458603218, var9 ^ -1645416581);
            case 92 -> lII(458603245, var9 ^ -1911869170);
            case 93 -> lII(458603244, var9 ^ -795929601);
            case 94 -> lII(458603247, var9 ^ -78179633);
            case 95 -> lII(458603246, var9 ^ 1311989161);
            case 96 -> lII(458603241, var9 ^ 323208079);
            case 97 -> lII(458603240, var9 ^ -1521612058);
            case 98 -> lII(458603243, var9 ^ 2032415692);
            case 99 -> lII(458603242, var9 ^ 1411194920);
            case 100 -> lII(458603237, var9 ^ 1191829348);
            case 101 -> lII(458603236, var9 ^ 276687830);
            case 102 -> lII(458603239, var9 ^ -1604731868);
            case 103 -> lII(458603238, var9 ^ 611386386);
            case 104 -> 5;
            case 105 -> lII(458603233, var9 ^ -784242016);
            case 106 -> lII(458603232, var9 ^ 1483619777);
            case 107 -> 0;
            case 108 -> lII(458603235, var9 ^ 1278474093);
            case 109 -> lII(458603234, var9 ^ 2079412460);
            case 110 -> lII(458603261, var9 ^ 713078124);
            case 111 -> lII(458603260, var9 ^ -192434818);
            case 112 -> lII(458603263, var9 ^ -304376112);
            case 113 -> lII(458603262, var9 ^ 731401796);
            case 114 -> lII(458603257, var9 ^ -204109240);
            case 115 -> lII(458603256, var9 ^ -2084949420);
            case 116 -> lII(458603259, var9 ^ -1165462591);
            case 117 -> lII(458603258, var9 ^ -1851385210);
            case 118 -> lII(458603253, var9 ^ 1743101528);
            case 119 -> lII(458603252, var9 ^ -57657001);
            case 120 -> lII(458603255, var9 ^ 1652887942);
            case 121 -> lII(458603254, var9 ^ 1749615076);
            case 122 -> lII(458603249, var9 ^ 879852244);
            case 123 -> lII(458603248, var9 ^ -1215176682);
            case 124 -> lII(458603251, var9 ^ -1907637768);
            case 125 -> lII(458603250, var9 ^ -322029056);
            case 126 -> lII(458603021, var9 ^ 695577321);
            case 127 -> lII(458603020, var9 ^ 165783421);
            case 128 -> lII(458603023, var9 ^ -923462226);
            case 129 -> lII(458603022, var9 ^ -1949296871);
            case 130 -> lII(458603017, var9 ^ 1558191341);
            case 131 -> lII(458603016, var9 ^ -747169149);
            case 132 -> lII(458603019, var9 ^ 1097954085);
            case 133 -> lII(458603018, var9 ^ 1023912199);
            case 134 -> lII(458603013, var9 ^ 1062584595);
            case 135 -> lII(458603012, var9 ^ 580416134);
            case 136 -> lII(458603015, var9 ^ -1929068170);
            case 137 -> lII(458603014, var9 ^ 1452489323);
            case 138 -> lII(458603009, var9 ^ -434396997);
            case 139 -> lII(458603008, var9 ^ 496758688);
            case 140 -> lII(458603011, var9 ^ -874660524);
            case 141 -> lII(458603010, var9 ^ -895921946);
            case 142 -> lII(458603037, var9 ^ -1966162559);
            case 143 -> lII(458603036, var9 ^ 1521561226);
            case 144 -> lII(458603039, var9 ^ 898061225);
            case 145 -> lII(458603038, var9 ^ -1018985725);
            case 146 -> lII(458603033, var9 ^ -255313836);
            case 147 -> lII(458603032, var9 ^ 1067860398);
            case 148 -> lII(458603035, var9 ^ -1022567000);
            case 149 -> lII(458603034, var9 ^ 1028052833);
            case 150 -> lII(458603029, var9 ^ -2065140520);
            case 151 -> lII(458603028, var9 ^ 2068565580);
            case 152 -> lII(458603031, var9 ^ 1931980690);
            case 153 -> lII(458603030, var9 ^ 1877397922);
            case 154 -> lII(458603025, var9 ^ 1242648877);
            case 155 -> lII(458603024, var9 ^ -1586372098);
            case 156 -> lII(458603027, var9 ^ 1025267864);
            case 157 -> lII(458603026, var9 ^ -1126934415);
            case 158 -> lII(458603053, var9 ^ -761627968);
            case 159 -> lII(458603052, var9 ^ 672393798);
            case 160 -> lII(458603055, var9 ^ 1398751131);
            case 161 -> lII(458603054, var9 ^ -389561017);
            case 162 -> lII(458603049, var9 ^ -1408301285);
            case 163 -> lII(458603048, var9 ^ -937089716);
            case 164 -> lII(458603051, var9 ^ -1211837936);
            case 165 -> lII(458603050, var9 ^ 314384435);
            case 166 -> lII(458603045, var9 ^ -1776866571);
            case 167 -> lII(458603044, var9 ^ -1728560157);
            case 168 -> lII(458603047, var9 ^ -381104871);
            case 169 -> lII(458603046, var9 ^ -1685512083);
            case 170 -> lII(458603041, var9 ^ -1043431216);
            case 171 -> lII(458603040, var9 ^ 72965466);
            case 172 -> lII(458603043, var9 ^ 1822980705);
            case 173 -> lII(458603042, var9 ^ 180472152);
            case 174 -> lII(458603069, var9 ^ 220800221);
            case 175 -> lII(458603068, var9 ^ -1264055332);
            case 176 -> lII(458603071, var9 ^ -1342778725);
            case 177 -> lII(458603070, var9 ^ 1743413964);
            case 178 -> lII(458603065, var9 ^ -1820501521);
            case 179 -> lII(458603064, var9 ^ -1125134947);
            case 180 -> lII(458603067, var9 ^ 2003611057);
            case 181 -> lII(458603066, var9 ^ -142649559);
            case 182 -> lII(458603061, var9 ^ 731682821);
            case 183 -> lII(458603060, var9 ^ 217621659);
            case 184 -> lII(458603063, var9 ^ -159509886);
            case 185 -> lII(458603062, var9 ^ -148020622);
            case 186 -> lII(458603057, var9 ^ -181079845);
            case 187 -> lII(458603056, var9 ^ -1132796103);
            case 188 -> lII(458603059, var9 ^ -1313930115);
            case 189 -> lII(458603058, var9 ^ 1621881940);
            case 190 -> lII(458603085, var9 ^ 1182225106);
            case 191 -> lII(458603084, var9 ^ -1463156302);
            case 192 -> lII(458603087, var9 ^ 1258098696);
            case 193 -> lII(458603086, var9 ^ 2100832327);
            case 194 -> lII(458603081, var9 ^ -459279569);
            case 195 -> lII(458603080, var9 ^ -919236780);
            case 196 -> lII(458603083, var9 ^ -181439116);
            case 197 -> lII(458603082, var9 ^ 1356400136);
            case 198 -> lII(458603077, var9 ^ 942107988);
            case 199 -> lII(458603076, var9 ^ 1971898800);
            case 200 -> lII(458603079, var9 ^ -906515526);
            case 201 -> 1;
            case 202 -> lII(458603078, var9 ^ 67257421);
            case 203 -> lII(458603073, var9 ^ 2059935167);
            case 204 -> lII(458603072, var9 ^ -827621340);
            case 205 -> lII(458603075, var9 ^ 928335954);
            case 206 -> lII(458603074, var9 ^ 899706224);
            case 207 -> lII(458603101, var9 ^ 1254663106);
            case 208 -> lII(458603100, var9 ^ -16800520);
            case 209 -> lII(458603103, var9 ^ 836353247);
            case 210 -> lII(458603102, var9 ^ -161689464);
            case 211 -> lII(458603097, var9 ^ -1906108291);
            case 212 -> lII(458603096, var9 ^ 1075236709);
            case 213 -> lII(458603099, var9 ^ 109181058);
            case 214 -> lII(458603098, var9 ^ -1459918620);
            case 215 -> lII(458603093, var9 ^ -590439995);
            case 216 -> lII(458603092, var9 ^ 1957953571);
            case 217 -> lII(458603095, var9 ^ 39513100);
            case 218 -> lII(458603094, var9 ^ -330086567);
            case 219 -> lII(458603089, var9 ^ 1403906661);
            case 220 -> lII(458603088, var9 ^ 320728480);
            case 221 -> lII(458603091, var9 ^ 2051423870);
            case 222 -> lII(458603090, var9 ^ 175876614);
            case 223 -> lII(458603117, var9 ^ -348608320);
            case 224 -> lII(458603116, var9 ^ -547079458);
            case 225 -> lII(458603119, var9 ^ -978951868);
            case 226 -> lII(458603118, var9 ^ -391255834);
            case 227 -> lII(458603113, var9 ^ -931980972);
            case 228 -> lII(458603112, var9 ^ -1386964694);
            case 229 -> lII(458603115, var9 ^ -1302868731);
            case 230 -> lII(458603114, var9 ^ -1911797403);
            case 231 -> lII(458603109, var9 ^ 769778130);
            case 232 -> lII(458603108, var9 ^ -1831072003);
            case 233 -> lII(458603111, var9 ^ -381606478);
            case 234 -> lII(458603110, var9 ^ -806580220);
            case 235 -> 4;
            case 236 -> lII(458603105, var9 ^ 110737601);
            case 237 -> lII(458603104, var9 ^ 484166197);
            case 238 -> lII(458603107, var9 ^ -428924992);
            case 239 -> lII(458603106, var9 ^ 1805871365);
            case 240 -> lII(458603133, var9 ^ -921079017);
            case 241 -> lII(458603132, var9 ^ 1311686440);
            case 242 -> lII(458603135, var9 ^ -795325115);
            case 243 -> lII(458603134, var9 ^ -2096982283);
            case 244 -> lII(458603129, var9 ^ 1936119955);
            case 245 -> lII(458603128, var9 ^ -1333080896);
            case 246 -> lII(458603131, var9 ^ -1863401347);
            case 247 -> lII(458603130, var9 ^ 60919830);
            case 248 -> lII(458603125, var9 ^ -659912409);
            case 249 -> lII(458603124, var9 ^ 1126182332);
            case 250 -> lII(458603127, var9 ^ -331815889);
            case 251 -> lII(458603126, var9 ^ 624783241);
            case 252 -> lII(458603121, var9 ^ -865926403);
            case 253 -> lII(458603120, var9 ^ -1782612061);
            case 254 -> lII(458603123, var9 ^ 638821362);
            default -> lII(458603122, var9 ^ 2034301434);
         };
         int var5 = (var1 & lII(458603405, var9 ^ -258143743)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lII(458603404, var9 ^ 1143468507)) >>> lII(458603407, var9 ^ -721663185)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lII(458603406, var9 ^ -1804380963);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lII(458603401, var9 ^ -1830415614);
            }
         }

         Ill[var2] = new String(var3).intern();
      }

      return Ill[var2];
   }

   private int II(int var1, int var2) {
      return lII(458603400, -173063251 ^ 426033061) + var1 * lII(458603403, -173063251 ^ -937990231) + var2;
   }

   private double Il() {
      return this.lIl.IllI() / 100.0;
   }

   private static String lI(char[] var0, long var1, int var3) {
      int var4 = lII(458603402, 1622480635 ^ -1137209022) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lII(458603397, 1622480635 ^ 1620462395);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public boolean llII(double var1, double var3) {
      return var1 >= this.lll() && var1 <= this.lll() + this.IIllI() && var3 >= this.ll() && var3 <= this.ll() + this.IIIl();
   }

   @Override
   public double IIIl() {
      return 64.0 * this.Il();
   }

   private void III(class_332 var1, boolean var2) {
      if (this.ll.IllI() || var2) {
         IIIlIllII.llI(var1, llI, 0.0, 0.0, 172.0, 64.0, var2);
      }
   }

   private static void IIl() {
      int var0 = -1034392717;
      lI[0] = lI(l(lII(458603419, var0 ^ -388245352), lII(458603418, var0 ^ 756005743)).toCharArray(), 52930L, lII(458603413, var0 ^ -1933495127));
      lI[1] = lI(l(lII(458603412, var0 ^ 950432041), lII(458603415, var0 ^ 833714381)).toCharArray(), 59911L, lII(458603414, var0 ^ 435146325));
      lI[2] = lI(l(lII(458603409, var0 ^ 1641392175), lII(458603408, var0 ^ 507401902)).toCharArray(), 40403L, lII(458603411, var0 ^ 475393165));
      lI[3] = lI(l(lII(458603410, var0 ^ -1379614928), lII(458603437, var0 ^ -1917822730)).toCharArray(), 70482L, lII(458603436, var0 ^ 1916526544));
      lI[4] = lI(l(lII(458603439, var0 ^ 261657449), lII(458603438, var0 ^ -14528987)).toCharArray(), 48555L, lII(458603433, var0 ^ 1397772626));
      lI[5] = lI(l(lII(458603432, var0 ^ -1003858033), lII(458603435, var0 ^ 1643022209)).toCharArray(), 26102L, lII(458603434, var0 ^ -1057021455));
      lI[lII(458603429, var0 ^ 1433773699)] = lI(
         l(lII(458603428, var0 ^ -1774585986), lII(458603431, var0 ^ -409641582)).toCharArray(), 39139L, lII(458603430, var0 ^ 893051060)
      );
      lI[lII(458603425, var0 ^ 1469591339)] = lI(
         l(lII(458603424, var0 ^ 1191009706), lII(458603427, var0 ^ 177671283)).toCharArray(), 39658L, lII(458603426, var0 ^ -897245249)
      );
   }

   private static int lII(int var0, int var1) {
      int var2 = IIlI[var0 ^ 458603149] ^ var1 ^ var0;
      var2 -= 62979;
      var2 -= 774;
      var2 -= 32306;
      var2 += 42958;
      var2 ^= 53639;
      var2 += 2529;
      var2 += 19821;
      var2 -= 17905;
      return var2 + 7996;
   }

   private void Ill(class_332 var1, boolean var2) {
      class_310 var3 = class_310.method_1551();
      if (var1 != null && var3 != null && var3.field_1724 != null && var3.field_1772 != null) {
         double var4 = this.Il();
         IlIIlllIl.IIllll(var1);
         IlIIlllIl.IlIIlI(var1, this.lll(), this.ll());
         IlIIlllIl.llIIIl(var1, var4, var4);

         try {
            this.III(var1, var2);
            this.I(var1, var3, var3.field_1724.method_31548());
         } finally {
            IlIIlllIl.lIIIll(var1);
         }
      }
   }

   @Override
   public void IIIII(class_332 var1, int var2, int var3, float var4) {
      this.Ill(var1, false);
   }

   private static String lIl(int var0, int var1) {
      int var3 = var0 ^ 1776149450;
      char[] var4 = IIll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IlII[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IlII[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -58282988;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 65;
            case 1 -> 48;
            case 2 -> 146;
            case 3 -> 70;
            case 4 -> 15;
            case 5 -> 150;
            case 6 -> 133;
            case 7 -> 151;
            case 8 -> 158;
            case 9 -> 180;
            case 10 -> 133;
            case 11 -> 107;
            case 12 -> 81;
            case 13 -> 178;
            case 14 -> 96;
            case 15 -> 176;
            case 16 -> 191;
            case 17 -> 46;
            case 18 -> 46;
            case 19 -> 64;
            case 20 -> 117;
            case 21 -> 251;
            case 22 -> 205;
            case 23 -> 114;
            case 24 -> 128;
            case 25 -> 205;
            case 26 -> 19;
            case 27 -> 173;
            case 28 -> 115;
            case 29 -> 71;
            case 30 -> 143;
            case 31 -> 146;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      this.Ill(var1, false);
   }
}
