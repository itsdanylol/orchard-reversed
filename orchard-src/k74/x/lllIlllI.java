package k74.x;

import com.google.gson.JsonObject;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import k74.y.IIlIIllI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_7923;

@Environment(EnvType.CLIENT)
public final class lllIlllI extends IlIIIIIIl {
   private static final String I;
   private static final Object[] lII;
   private static final String II;
   private final IllIlIl Il;
   private static String[] lI;
   private static final String[] ll;
   private static final int[] IlI;
   private static final String[] III;
   private static final String[] Ill;
   private final lIlllIl IIl;

   static boolean I(String var0, List<String> var1) {
      if (var0 != null && !var0.isBlank() && var1 != null && !var1.isEmpty()) {
         String var2 = var0.trim().toLowerCase(Locale.ROOT);
         return var1.stream().filter(lllIlllI::II).map(lllIlllI::lIl).anyMatch(var2::equals);
      } else {
         return false;
      }
   }

   private static void l() {
      int var0 = 1338054176;
      lI[0] = lII(lI(llI(748270295, var0 ^ -323837601), llI(748270294, var0 ^ 680396325)).toCharArray(), 82152L, llI(748270293, var0 ^ 1594690697));
      lI[1] = lII(lI(llI(748270292, var0 ^ -1186683040), llI(748270291, var0 ^ -670449566)).toCharArray(), 56038L, llI(748270290, var0 ^ 270909544));
      lI[2] = lII(lI(llI(748270289, var0 ^ -569071767), llI(748270288, var0 ^ -1432477286)).toCharArray(), 76661L, llI(748270303, var0 ^ 2044405111));
      lI[3] = lII(lI(llI(748270302, var0 ^ 110203505), llI(748270301, var0 ^ 1694310177)).toCharArray(), 85515L, llI(748270300, var0 ^ -2137076201));
      lI[4] = lII(lI(llI(748270299, var0 ^ 1900988300), llI(748270298, var0 ^ 835658042)).toCharArray(), 34361L, llI(748270297, var0 ^ 1126734549));
      lI[5] = lII(lI(llI(748270296, var0 ^ 557041825), llI(748270279, var0 ^ -1246679236)).toCharArray(), 51800L, llI(748270278, var0 ^ 2111400419));
      lI[llI(748270277, var0 ^ 3835447)] = lII(
         lI(llI(748270276, var0 ^ -1424580546), llI(748270275, var0 ^ 1537244267)).toCharArray(), 3271L, llI(748270274, var0 ^ -1631278644)
      );
      lI[llI(748270273, var0 ^ -1517772367)] = lII(
         lI(llI(748270272, var0 ^ -39218844), llI(748270287, var0 ^ -513597220)).toCharArray(), 29159L, llI(748270286, var0 ^ 957836880)
      );
      lI[llI(748270285, var0 ^ -100301776)] = lII(
         lI(llI(748270284, var0 ^ 1820303364), llI(748270283, var0 ^ -1565481904)).toCharArray(), 1374L, llI(748270282, var0 ^ -1658611625)
      );
      lI[llI(748270281, var0 ^ -887840990)] = lII(
         lI(llI(748270280, var0 ^ -100353654), llI(748270327, var0 ^ -1709159660)).toCharArray(), 68323L, llI(748270326, var0 ^ 558247573)
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 22806688;
      int var11 = 0;
      String[] var9 = new String[2];
      short var12 = 5610;
      int var10001 = "Sﳔꜽꦇ砜ῃ㥸订⯺㍿嚐ⲷ\uf125⾧気畞獷펚䑣恔竕䴶ⴂᔽ嬸\ue29c뭃癿杖賳쭠툲岚쎮䗴⪸灡ᘼ젮⬝䜍䙽겭ྔ괵ﳢ۟\udfda㶭됰嚝㪧旚쒴듲턤ꙺ퀂侨䀔ਚ暮쌃畚惢ꎦ鐚ዢ䑛턜俕櫝\ufeff\uee87괪엗枫좩\ue172팮䶄쬤䌨\ue8e6Aꔧ䗃譹ᢵ䌻ꑆ陞췊\ue23b뇙妲\u1f4f몰\uf2c5콂疍陔\ueadcꗞ殻욢랊聨ꗨ꽣\ue3b8脫ㅸ\udeb1辥\udbd4뙱᩼𥳐\ue739誸뤡엛ሊ쉳쬈讀풘틌⺽즼콷䙒꥓ꁽ䥕輇\u0e7c\uec2a\uea90혹ⲫ띤H疋\uf14a\uf6da醘훗䌱"
         .length();
      int var10 = 0;
      int var8 = var10001;
      String var7 = "Sﳔꜽꦇ砜ῃ㥸订⯺㍿嚐ⲷ\uf125⾧気畞獷펚䑣恔竕䴶ⴂᔽ嬸\ue29c뭃癿杖賳쭠툲岚쎮䗴⪸灡ᘼ젮⬝䜍䙽겭ྔ괵ﳢ۟\udfda㶭됰嚝㪧旚쒴듲턤ꙺ퀂侨䀔ਚ暮쌃畚惢ꎦ鐚ዢ䑛턜俕櫝\ufeff\uee87괪엗枫좩\ue172팮䶄쬤䌨\ue8e6Aꔧ䗃譹ᢵ䌻ꑆ陞췊\ue23b뇙妲\u1f4f몰\uf2c5콂疍陔\ueadcꗞ殻욢랊聨ꗨ꽣\ue3b8脫ㅸ\udeb1辥\udbd4뙱᩼𥳐\ue739誸뤡엛ሊ쉳쬈讀풘틌⺽즼콷䙒꥓ꁽ䥕輇\u0e7c\uec2a\uea90혹ⲫ띤H疋\uf14a\uf6da醘훗䌱";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
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

      Ill = var9;
      lII = new Object[var9.length];
      int var10000 = 0;
      int var22 = 0;
      IlI = new int[316];
      byte[] var10002 = "K'\u0018à\u008f\u001a6\u00862eéË\u001eÑ\u001e¢\u007f\u009dÑ·k)È\u0088y\u0081\u001eß\r\rpWP\u0082\u001e0¡\u0004+ÍÃi9dÄy\u0092\u0081ÖÛ~B\u0096\\h¾R\u0094rN\u0086¦q\u0019\u0012%Æ(>æú\n§®æ¼\f\u0083\u0019\u0096ü5sÙ2\u000b*y\u0002\u001c¾ýZ<(ËF÷ä®kÙCV]\u0091\u009buËê\u0019«\u0005$qi¿É\u009d+l\u0080\u0080d]\u0091\u0000#=³,S°\u0083ú\u00adá6\u0092ìÃ¹L\u007fÃ0H@E»\u0098×,G> \u0003\u0088öl¢\rèÂÑÐãT!Ï¸`R\u0019Ð`\u009b¡\u001bo\\ð\u0096M\u0093\u0002¾Bþf¾\u0092\u000b\u0007\u0017ð££\u0013ï\u0003Çõl¤µ¯Â:·h</\u0093ZE\u001asÒ¬=zzUIî!ÂoÌ»¹K.¢Í`í\u0000f\u007f\u0001º\u001c*r²¥W\u009dC¯ßã\u008aYñï3¹\u00adÐ\u0086x³\tÔ«þù)¶\u0098ÛQ\\\n,\u0083\u009e\u009cíÝZ\u009dI¿\u0089\u0011\u0092¿\u0002_dnº¼½Xü\u0098\u0091°»\u0010\u0002Ì»\u0088¥Ïîpu½Y\u009b¼\u0098\u0011·ý§ü\u0014\u009b\nÀ}\u0007Çì\u0091°\u0001\u001c\u0010ü\u0086\u0081\u0081\u0091 F*Älf\u009fb\u0088£±©9¶?L¶s>þ\u001aìb}±ÔÄ`\râ`Â\u0089SØ\u0005>\u0018p\u008dØ8\u0091®^³\u0084&å\rÉ$Ê\u0004µæVe±µ\u0099\u008eI\u0086\f\u0081À\u0098\u001c«#ï¹Êc(8ïbkÇK¿<\u009a\u0099ÉÚK\u000fZ\u000fíôÌÐñ\u0004\u0082\u0092fçVÝ\u0012\u0096¶\u008c¬Hs4ÿ\u009b^~^¿\u0097 Ü-¦s#<ºH÷Ý¶\nNÅ\n¿[ü\u009c\u0001\u0007\u007f,O*Î«\u0083\u0017ÎPÿw\u0085U¨ô\u0098Y#Áe¡DÞ`\u008fæßÕ\u0099ÆLÃ\u00ad|O\u0017Ý×SÓVf\u0006ðÂ&\f\u0080ÿr\u008eÑE\u0002HYK\u0007n\u0017Ê\u001a'\u00957À\u0091Ýù\u0085Kcò^Mmþ\u0006¯4\u0094\u0017{'+\u0085\u001a\u0090Å\u008e\u0011\u0014 +Ûº\u0016\u0089ÒÆ\u0098\u0086\u001e\u0015\u0098\u0080\u000b\u0016ÝQØ`]\u00adÖ?ZpÌ\u0082\u001aÀ°¶\u0095FÄû¯ØxW\fÄÆ;¨\u0097\u0007\u0082M½ù·R·>W\u0004ë\u0014I\u009c\r\u0084´}íðÚô+YÑ[´\u0017¼\u0096ù\u0098ùÑX`\u009c\u0019\u008d3¸&\u0083Í\u000b³ÊþÂR\u0017\u0018\u0088]½ªg\f\u0000\u000bÑ:_\u001b>*R ¾Á\u0007Tµ\u0084°ÌÇföÌ\"B\u0083:5±8=¼\u0006\b\u0011QÇ»\u0094æÔTÎ\u0004$\u008d\u000f\u0087¸¤L\u001aP\u0083ÏÁðßû\u0006\u0096kË\u0006\u0003UÚf¥\u008b¶õ\u0083ÊÖ\u0015\u0082. ¢\u0089R&Õ|Ü0ÎB\u007f\u0004© Kß»\u000e\u008f&\u001eý\u0083¡z¥\u0092hu=~SÕùÐph¼³\u001a$85ªT\u0098Þy7ï;u¡\u0016¸´úCW\të¡A\u0016\u000esÍ<\u00059`ä\u0094\u0095?\u0011àR0bÕ\u0011¡T\u009fvß@!\u000eW\u0016æ,\u000f\u0090{Ò\u008d\u0016ð*.y©Ç©A\u0006«\u0000çKiþT©\u0011\u0010cª^»mS\u0005¶<?\u0085\u0089Óy\u008a]¨¶\u008d\u0086SàQEë\t¶I\u0089ð?Ñ\u0090\n¹Íë$~Ø®\f6O\u0099x\u0003n\u001c\u0007ó\u0098T7v\u0090²Bå£w\u0083î<\u0097½Ì\u008eFYR\u0001\u0018.#\u0093Tî(¤ÞÜ \u001cLãZ/¥>Îë_¹0\u001be \u0090£]\u007f]»¢\u0092_DÅÌ ½Å\u000b°'Ôîsß\u0080|þÿ´\u001c\u001c\u009a¼`+O]ÛyÊ®\u00ad¯\u0085Êgº`âí\u0011Ä¼\u008d±ù¶y\fÆtø±êÑ´\u00adíL\u008cóÉÍ\u0011\u0080J^ò\u0017yV\\O©\u009c É\u0006¹\n\u0006\u0089D\u001b\u009br~ª÷ÚÃP÷\u001c\u0007([ÜV\u0015ØÐ¡**û\u001bÌ\u0096u´+ëª\u000fm7þ\u0084õ/ZÙ\u009cWª39\n±à\u0012ýÞ\u001a\u008f«\u001d\nõ¢\u009e\nÈ\u009a·uUæqÅ^>iúqY²_÷~\u0085Ä1Hk-VOë'ï·ô\u007f|\u007fºS\u0016s\u000eh¬7'Lé¹\u009c\u0082ßI1¨Û¹ðü\u0093¬w\u009c\u0094À´\u009fG\u0004;Ù\u0089\u0082q\u0099S\u000frÇ\u0081à®|:jÏ*\u0002y9ñv\u001eõa\u009c6,G~®\u0000gë`6$;?¹F$f\u0018±;Ã\u0090}´h(«[«|òÝø%ç\u0092}F\u0089\u0091\u000e$@M"
         .getBytes("ISO-8859-1");

      int var53;
      do {
         IlI[var10000] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ -993524492;
         var10000 += 1;
         var53 = var22 + 4;
         var22 += 4;
      } while (var53 < var10002.length);

      String[] var5 = new String[llI(748270590, var17 ^ 700291003)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lll(1122988148, var17 ^ -1623384821)).length();
      int var1 = llI(748270589, var17 ^ -315436732);
      int var19 = -1;

      label92:
      while (true) {
         var10000 = llI(748270588, var17 ^ 1803087310);
         String var25 = var2.substring(++var19, var19 + var1);
         byte var37 = -1;

         while (true) {
            label87: {
               char[] var55 = var25.toCharArray();
               int var67 = var55.length;
               int var6 = 0;
               var53 = var10000;
               var42 = var55;
               var22 = var67;
               char[] var79;
               int var86;
               if (var67 <= 1) {
                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               } else {
                  var53 = var10000;
                  var22 = var67;
                  if (var67 <= var6) {
                     break label87;
                  }

                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               }

               while (true) {
                  var79[var86] = (char)(var79[var86] ^ var67 ^ switch (var6 % llI(748270584, var17 ^ -1875838589)) {
                     case 0 -> llI(748270567, var17 ^ -134452928);
                     case 1 -> llI(748270566, var17 ^ -551210025);
                     case 2 -> llI(748270565, var17 ^ 1191776928);
                     case 3 -> llI(748270564, var17 ^ -1992339239);
                     case 4 -> llI(748270563, var17 ^ -693095718);
                     case 5 -> llI(748270562, var17 ^ -1894660710);
                     default -> llI(748270561, var17 ^ 714672766);
                  });
                  var6++;
                  if (var53 == 0) {
                     var86 = var53;
                     var79 = var42;
                     var67 = var53;
                  } else {
                     if (var22 <= var6) {
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
                     III = new String[llI(748270585, var17 ^ -2084166919)];
                     lI = new String[llI(748270560, var17 ^ -2128501831)];
                     l();
                     II = IlIIllIII.lI(lI[llI(748270575, var17 ^ 1115028029)]);
                     I = IlIIllIII.lI(lI[llI(748270574, var17 ^ 288157556)]);
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var60;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label92;
                  }

                  var4 = (var2 = lll(1122988149, var17 ^ 93154079)).length();
                  var1 = llI(748270587, var17 ^ -428093578);
                  var19 = -1;
            }

            var10000 = llI(748270586, var17 ^ 161969380);
            var25 = var2.substring(++var19, var19 + var1);
            var37 = 0;
         }
      }
   }

   private static boolean II(String var0) {
      return var0 != null && !var0.isBlank();
   }

   public void Il(class_310 var1) {
      this.III(var1, true);
   }

   public lllIlllI() {
      super(IlIIllIII.Ill(lI[5]), lllIIlIl.IlI, IlIIllIII.Ill(lI[2]));
      this.IIl = this.IllIIll(new lIlllIl(IlIIllIII.Ill(lI[3]), 1.0, 4.0, 1.0, 4.0, 1.0).lI(IlIIllIII.lI(lI[4])));
      this.Il = this.IllIIll(new IllIlIl((Object)II, List.of()));
   }

   private static String lI(int var0, int var1) {
      int var9 = -446960763;
      int var2 = (var0 ^ llI(748270325, var9 ^ -331753772)) & llI(748270324, var9 ^ -826879701);
      if (III[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & llI(748270323, var9 ^ -834742765)) {
            case 0 -> llI(748270322, var9 ^ 1219823195);
            case 1 -> llI(748270321, var9 ^ 558473331);
            case 2 -> llI(748270320, var9 ^ 243690350);
            case 3 -> llI(748270335, var9 ^ -1358727454);
            case 4 -> llI(748270334, var9 ^ -589398633);
            case 5 -> llI(748270333, var9 ^ 750855801);
            case 6 -> llI(748270332, var9 ^ 1595362894);
            case 7 -> llI(748270331, var9 ^ -1766852174);
            case 8 -> llI(748270330, var9 ^ 1375630492);
            case 9 -> llI(748270329, var9 ^ -1643372338);
            case 10 -> llI(748270328, var9 ^ -211279779);
            case 11 -> llI(748270311, var9 ^ 101288269);
            case 12 -> llI(748270310, var9 ^ -1364332261);
            case 13 -> llI(748270309, var9 ^ 248080491);
            case 14 -> llI(748270308, var9 ^ -1447349771);
            case 15 -> llI(748270307, var9 ^ 934934255);
            case 16 -> llI(748270306, var9 ^ 580765516);
            case 17 -> llI(748270305, var9 ^ 394087591);
            case 18 -> llI(748270304, var9 ^ 812967002);
            case 19 -> llI(748270319, var9 ^ 1155580724);
            case 20 -> llI(748270318, var9 ^ 1656890868);
            case 21 -> llI(748270317, var9 ^ 1176517767);
            case 22 -> llI(748270316, var9 ^ 1843651236);
            case 23 -> llI(748270315, var9 ^ 1913594940);
            case 24 -> llI(748270314, var9 ^ 662449188);
            case 25 -> llI(748270313, var9 ^ 1519639953);
            case 26 -> llI(748270312, var9 ^ -756214583);
            case 27 -> llI(748270231, var9 ^ -52318886);
            case 28 -> llI(748270230, var9 ^ -1596057447);
            case 29 -> llI(748270229, var9 ^ -1106818480);
            case 30 -> llI(748270228, var9 ^ -201869462);
            case 31 -> llI(748270227, var9 ^ -1781149929);
            case 32 -> 2;
            case 33 -> llI(748270226, var9 ^ 119676208);
            case 34 -> llI(748270225, var9 ^ -1847377860);
            case 35 -> llI(748270224, var9 ^ -1874386202);
            case 36 -> llI(748270239, var9 ^ 480009650);
            case 37 -> llI(748270238, var9 ^ 1382740081);
            case 38 -> llI(748270237, var9 ^ -1313617939);
            case 39 -> llI(748270236, var9 ^ -1784730033);
            case 40 -> llI(748270235, var9 ^ 487337480);
            case 41 -> llI(748270234, var9 ^ -2052369797);
            case 42 -> llI(748270233, var9 ^ 2105221168);
            case 43 -> llI(748270232, var9 ^ -1766717730);
            case 44 -> llI(748270215, var9 ^ -1158465130);
            case 45 -> llI(748270214, var9 ^ 429233267);
            case 46 -> llI(748270213, var9 ^ 1879660810);
            case 47 -> llI(748270212, var9 ^ -1665229051);
            case 48 -> llI(748270211, var9 ^ 502405250);
            case 49 -> llI(748270210, var9 ^ -1935688059);
            case 50 -> llI(748270209, var9 ^ 667611803);
            case 51 -> llI(748270208, var9 ^ -1838409817);
            case 52 -> llI(748270223, var9 ^ -1129864140);
            case 53 -> llI(748270222, var9 ^ 843196589);
            case 54 -> llI(748270221, var9 ^ 871400506);
            case 55 -> llI(748270220, var9 ^ 1869819853);
            case 56 -> llI(748270219, var9 ^ -915476612);
            case 57 -> llI(748270218, var9 ^ 1842091885);
            case 58 -> llI(748270217, var9 ^ -720658262);
            case 59 -> llI(748270216, var9 ^ 2105755348);
            case 60 -> llI(748270263, var9 ^ -1667186520);
            case 61 -> llI(748270262, var9 ^ -1993835576);
            case 62 -> llI(748270261, var9 ^ -1003858692);
            case 63 -> llI(748270260, var9 ^ -1192703883);
            case 64 -> llI(748270259, var9 ^ -1128593515);
            case 65 -> llI(748270258, var9 ^ 1149800973);
            case 66 -> llI(748270257, var9 ^ -845774122);
            case 67 -> llI(748270256, var9 ^ 786506870);
            case 68 -> llI(748270271, var9 ^ 1848026536);
            case 69 -> llI(748270270, var9 ^ 1868912760);
            case 70 -> llI(748270269, var9 ^ -1305315315);
            case 71 -> llI(748270268, var9 ^ -992684763);
            case 72 -> llI(748270267, var9 ^ 1459712894);
            case 73 -> llI(748270266, var9 ^ -1042387874);
            case 74 -> llI(748270265, var9 ^ -1885538059);
            case 75 -> llI(748270264, var9 ^ 1540590664);
            case 76 -> 4;
            case 77 -> llI(748270247, var9 ^ -1149095304);
            case 78 -> llI(748270246, var9 ^ 2117755062);
            case 79 -> llI(748270245, var9 ^ 1399898323);
            case 80 -> llI(748270244, var9 ^ -1708244593);
            case 81 -> llI(748270243, var9 ^ -1417822928);
            case 82 -> llI(748270242, var9 ^ -1220122383);
            case 83 -> llI(748270241, var9 ^ -1157312029);
            case 84 -> llI(748270240, var9 ^ 129087818);
            case 85 -> llI(748270255, var9 ^ -1861229062);
            case 86 -> llI(748270254, var9 ^ 557959244);
            case 87 -> llI(748270253, var9 ^ -1500673402);
            case 88 -> llI(748270252, var9 ^ 1576135386);
            case 89 -> llI(748270251, var9 ^ 1487301357);
            case 90 -> llI(748270250, var9 ^ 1412259728);
            case 91 -> llI(748270249, var9 ^ -1404419968);
            case 92 -> llI(748270248, var9 ^ -2098708206);
            case 93 -> llI(748270167, var9 ^ -1798778480);
            case 94 -> llI(748270166, var9 ^ -1603087793);
            case 95 -> llI(748270165, var9 ^ -791032395);
            case 96 -> llI(748270164, var9 ^ 1533581331);
            case 97 -> llI(748270163, var9 ^ -819424976);
            case 98 -> llI(748270162, var9 ^ -226749570);
            case 99 -> llI(748270161, var9 ^ 1208800879);
            case 100 -> llI(748270160, var9 ^ 1175056580);
            case 101 -> llI(748270175, var9 ^ -954943194);
            case 102 -> llI(748270174, var9 ^ 986608537);
            case 103 -> llI(748270173, var9 ^ -192162639);
            case 104 -> llI(748270172, var9 ^ -11480182);
            case 105 -> 1;
            case 106 -> llI(748270171, var9 ^ -217566889);
            case 107 -> llI(748270170, var9 ^ -1726356208);
            case 108 -> llI(748270169, var9 ^ 646677675);
            case 109 -> llI(748270168, var9 ^ -931099459);
            case 110 -> llI(748270151, var9 ^ 757417314);
            case 111 -> llI(748270150, var9 ^ 461852542);
            case 112 -> llI(748270149, var9 ^ -1786216199);
            case 113 -> llI(748270148, var9 ^ -1785817712);
            case 114 -> llI(748270147, var9 ^ -799062419);
            case 115 -> llI(748270146, var9 ^ 1352878970);
            case 116 -> llI(748270145, var9 ^ 1467887332);
            case 117 -> llI(748270144, var9 ^ 399387927);
            case 118 -> llI(748270159, var9 ^ -1740088900);
            case 119 -> llI(748270158, var9 ^ -1562974473);
            case 120 -> 3;
            case 121 -> llI(748270157, var9 ^ 30038252);
            case 122 -> llI(748270156, var9 ^ -1516660339);
            case 123 -> 5;
            case 124 -> llI(748270155, var9 ^ 1085479908);
            case 125 -> llI(748270154, var9 ^ 1606000760);
            case 126 -> llI(748270153, var9 ^ 166038124);
            case 127 -> llI(748270152, var9 ^ -1862067542);
            case 128 -> llI(748270199, var9 ^ 1893953239);
            case 129 -> llI(748270198, var9 ^ -114967572);
            case 130 -> llI(748270197, var9 ^ 1455065467);
            case 131 -> llI(748270196, var9 ^ -1678309859);
            case 132 -> llI(748270195, var9 ^ -598278887);
            case 133 -> llI(748270194, var9 ^ 344173859);
            case 134 -> llI(748270193, var9 ^ 730673002);
            case 135 -> llI(748270192, var9 ^ -1094425672);
            case 136 -> llI(748270207, var9 ^ 1595508273);
            case 137 -> llI(748270206, var9 ^ 1353921745);
            case 138 -> llI(748270205, var9 ^ 17733088);
            case 139 -> llI(748270204, var9 ^ 928089462);
            case 140 -> llI(748270203, var9 ^ 660389463);
            case 141 -> llI(748270202, var9 ^ -871773604);
            case 142 -> llI(748270201, var9 ^ -1984015665);
            case 143 -> llI(748270200, var9 ^ 1811436090);
            case 144 -> llI(748270183, var9 ^ 1334696005);
            case 145 -> llI(748270182, var9 ^ -1137269874);
            case 146 -> llI(748270181, var9 ^ 184979449);
            case 147 -> llI(748270180, var9 ^ -894104883);
            case 148 -> llI(748270179, var9 ^ -648392665);
            case 149 -> llI(748270178, var9 ^ 696488375);
            case 150 -> llI(748270177, var9 ^ -1247096101);
            case 151 -> llI(748270176, var9 ^ 1569542547);
            case 152 -> llI(748270191, var9 ^ -36608532);
            case 153 -> llI(748270190, var9 ^ -1687869061);
            case 154 -> llI(748270189, var9 ^ 240862287);
            case 155 -> llI(748270188, var9 ^ -1467668386);
            case 156 -> llI(748270187, var9 ^ -1899738229);
            case 157 -> llI(748270186, var9 ^ -1893712194);
            case 158 -> llI(748270185, var9 ^ -2074295128);
            case 159 -> llI(748270184, var9 ^ 1909632631);
            case 160 -> llI(748270103, var9 ^ 1332864703);
            case 161 -> llI(748270102, var9 ^ 759513413);
            case 162 -> llI(748270101, var9 ^ 58835977);
            case 163 -> llI(748270100, var9 ^ -259178731);
            case 164 -> llI(748270099, var9 ^ -1466108347);
            case 165 -> llI(748270098, var9 ^ 812698703);
            case 166 -> llI(748270097, var9 ^ -186716632);
            case 167 -> llI(748270096, var9 ^ -1312979827);
            case 168 -> llI(748270111, var9 ^ 893072406);
            case 169 -> llI(748270110, var9 ^ -1781471246);
            case 170 -> llI(748270109, var9 ^ -499804231);
            case 171 -> llI(748270108, var9 ^ 464923239);
            case 172 -> llI(748270107, var9 ^ 1314515948);
            case 173 -> llI(748270106, var9 ^ -1404073867);
            case 174 -> llI(748270105, var9 ^ 2126750369);
            case 175 -> llI(748270104, var9 ^ 879655484);
            case 176 -> llI(748270087, var9 ^ -1741582405);
            case 177 -> llI(748270086, var9 ^ 1597963389);
            case 178 -> llI(748270085, var9 ^ 481282561);
            case 179 -> llI(748270084, var9 ^ 2077351843);
            case 180 -> llI(748270083, var9 ^ 56199289);
            case 181 -> llI(748270082, var9 ^ 553717412);
            case 182 -> llI(748270081, var9 ^ -545000206);
            case 183 -> llI(748270080, var9 ^ 656467738);
            case 184 -> llI(748270095, var9 ^ -894983388);
            case 185 -> llI(748270094, var9 ^ -1509030566);
            case 186 -> llI(748270093, var9 ^ 1693497018);
            case 187 -> llI(748270092, var9 ^ 471793027);
            case 188 -> llI(748270091, var9 ^ 1404433293);
            case 189 -> llI(748270090, var9 ^ 146317971);
            case 190 -> llI(748270089, var9 ^ -2004398655);
            case 191 -> llI(748270088, var9 ^ -2024589620);
            case 192 -> llI(748270135, var9 ^ -2138525236);
            case 193 -> llI(748270134, var9 ^ 1548449254);
            case 194 -> llI(748270133, var9 ^ -1152968889);
            case 195 -> llI(748270132, var9 ^ 853479048);
            case 196 -> llI(748270131, var9 ^ -1262258751);
            case 197 -> llI(748270130, var9 ^ 1943416998);
            case 198 -> llI(748270129, var9 ^ 994117393);
            case 199 -> llI(748270128, var9 ^ 241205870);
            case 200 -> llI(748270143, var9 ^ -23672324);
            case 201 -> llI(748270142, var9 ^ 2073963718);
            case 202 -> llI(748270141, var9 ^ -391255559);
            case 203 -> llI(748270140, var9 ^ -483260081);
            case 204 -> llI(748270139, var9 ^ -1048520677);
            case 205 -> llI(748270138, var9 ^ 1594852840);
            case 206 -> llI(748270137, var9 ^ 782092849);
            case 207 -> llI(748270136, var9 ^ 631914613);
            case 208 -> llI(748270119, var9 ^ 756208301);
            case 209 -> llI(748270118, var9 ^ 1461795804);
            case 210 -> llI(748270117, var9 ^ -1008352807);
            case 211 -> llI(748270116, var9 ^ 1024821017);
            case 212 -> llI(748270115, var9 ^ -1649556539);
            case 213 -> llI(748270114, var9 ^ 1354054752);
            case 214 -> llI(748270113, var9 ^ 1380604727);
            case 215 -> llI(748270112, var9 ^ -1380754668);
            case 216 -> llI(748270127, var9 ^ -1121367541);
            case 217 -> llI(748270126, var9 ^ 2127633833);
            case 218 -> llI(748270125, var9 ^ -202298804);
            case 219 -> llI(748270124, var9 ^ 294920826);
            case 220 -> llI(748270123, var9 ^ 641844012);
            case 221 -> llI(748270122, var9 ^ 1959015293);
            case 222 -> llI(748270121, var9 ^ -1567927260);
            case 223 -> llI(748270120, var9 ^ -1217495878);
            case 224 -> llI(748270551, var9 ^ 483008675);
            case 225 -> llI(748270550, var9 ^ -1124652577);
            case 226 -> llI(748270549, var9 ^ 29944808);
            case 227 -> llI(748270548, var9 ^ -1125888663);
            case 228 -> llI(748270547, var9 ^ -1595681845);
            case 229 -> llI(748270546, var9 ^ -20491526);
            case 230 -> llI(748270545, var9 ^ -1924873879);
            case 231 -> llI(748270544, var9 ^ 444057874);
            case 232 -> llI(748270559, var9 ^ 1118241759);
            case 233 -> llI(748270558, var9 ^ -1006098594);
            case 234 -> llI(748270557, var9 ^ 193439714);
            case 235 -> llI(748270556, var9 ^ -1770200637);
            case 236 -> llI(748270555, var9 ^ -86745899);
            case 237 -> llI(748270554, var9 ^ -99444686);
            case 238 -> 0;
            case 239 -> llI(748270553, var9 ^ 1456654616);
            case 240 -> llI(748270552, var9 ^ -706855350);
            case 241 -> llI(748270535, var9 ^ 670401697);
            case 242 -> llI(748270534, var9 ^ -1686426705);
            case 243 -> llI(748270533, var9 ^ -425422769);
            case 244 -> llI(748270532, var9 ^ 988814008);
            case 245 -> llI(748270531, var9 ^ 575948432);
            case 246 -> llI(748270530, var9 ^ 1520741462);
            case 247 -> llI(748270529, var9 ^ 129990416);
            case 248 -> llI(748270528, var9 ^ -254769911);
            case 249 -> llI(748270543, var9 ^ -1508666063);
            case 250 -> llI(748270542, var9 ^ -1349479129);
            case 251 -> llI(748270541, var9 ^ -1749444983);
            case 252 -> llI(748270540, var9 ^ -343988590);
            case 253 -> llI(748270539, var9 ^ 862414203);
            case 254 -> llI(748270538, var9 ^ 1421656071);
            default -> llI(748270537, var9 ^ 1938512811);
         };
         int var5 = (var1 & llI(748270536, var9 ^ 1164292670)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & llI(748270583, var9 ^ 1122286520)) >>> llI(748270582, var9 ^ -1157981017)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & llI(748270581, var9 ^ 1924451395);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & llI(748270580, var9 ^ 2113992696);
            }
         }

         III[var2] = new String(var3).intern();
      }

      return III[var2];
   }

   private static int llI(int var0, int var1) {
      int var2 = IlI[var0 ^ 748270295] ^ var1 ^ var0;
      var2 -= 11889;
      var2 -= 59333;
      var2 -= 7871;
      var2 ^= 43774;
      var2 ^= 59291;
      var2 -= 55073;
      var2 ^= 26144;
      var2 -= 58853;
      var2 -= 52883;
      return var2 - 54593;
   }

   @Override
   public String IlIIl() {
      int var1 = (int)Math.round(this.IIl.IIlI());
      int var2 = (int)Math.round(this.IIl.IlI());
      String var10000;
      if (var1 == var2) {
         var10000 = Integer.toString(var1);
      } else {
         String var4 = IlIIllIII.lI(lI[llI(748270579, 2131418990 ^ -1602708519)]);
         var10000 = var1 + var4 + var2;
      }

      return var10000;
   }

   @Override
   public void IlllII(JsonObject var1) {
      if (var1 != null && var1.has(IlIIllIII.lI(lI[llI(748270578, -2063742229 ^ -717996120)]))) {
         JsonObject var2 = var1.getAsJsonObject(IlIIllIII.lI(lI[llI(748270577, -2063742229 ^ 630789551)]));
         if (var2 != null && !var2.has(II) && var2.has(I)) {
            var2.add(II, var2.get(I).deepCopy());
         }
      }

      super.IlllII(var1);
   }

   private static String lll(int var0, int var1) {
      int var3 = var0 ^ 1122988148;
      char[] var4 = Ill[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])lII[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         lII[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 358108577;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 38;
            case 1 -> 38;
            case 2 -> 203;
            case 3 -> 149;
            case 4 -> 68;
            case 5 -> 228;
            case 6 -> 181;
            case 7 -> 61;
            case 8 -> 10;
            case 9 -> 241;
            case 10 -> 28;
            case 11 -> 133;
            case 12 -> 119;
            case 13 -> 112;
            case 14 -> 144;
            case 15 -> 146;
            case 16 -> 189;
            case 17 -> 232;
            case 18 -> 121;
            case 19 -> 165;
            case 20 -> 30;
            case 21 -> 95;
            case 22 -> 190;
            case 23 -> 76;
            case 24 -> 79;
            case 25 -> 52;
            case 26 -> 196;
            case 27 -> 102;
            case 28 -> 0;
            case 29 -> 222;
            case 30 -> 223;
            case 31 -> 240;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private int ll() {
      int var1 = Math.max(1, Math.min(4, (int)Math.round(this.IIl.IIlI())));
      int var2 = Math.max(var1, Math.min(4, (int)Math.round(this.IIl.IlI())));
      return var1 == var2 ? var1 : ThreadLocalRandom.current().nextInt(var1, var2 + 1);
   }

   private void III(class_310 var1, boolean var2) {
      if (this.IIIIlIl() && var1 != null && var1.field_1724 != null && this.Ill(var1)) {
         if (!IIll.IIlllll() && !IlllIlII.III() && !lIIIllII.ll(var1)) {
            IIlIIllI var3 = (IIlIIllI)var1;
            int var4 = this.ll();
            if (var2 || var3.ilovcats$getUseCd() > var4) {
               var3.ilovcats$setUseCd(var4);
            }
         }
      }
   }

   private boolean IIl(class_1799 var1) {
      if (var1 != null && var1.method_7909() instanceof class_1747) {
         List var2 = (List)this.Il.IllI();
         if (var2.isEmpty()) {
            return true;
         } else {
            String var3 = class_7923.field_41178.method_10221(var1.method_7909()).toString();
            return !I(var3, var2);
         }
      } else {
         return false;
      }
   }

   private boolean Ill(class_310 var1) {
      class_1799 var2 = var1.field_1724.method_6047();
      return var2 != null && var2.method_7909() instanceof class_1747 ? this.IIl(var2) : this.IIl(var1.field_1724.method_6079());
   }

   @Override
   public void IIlIl() {
      this.III(class_310.method_1551(), false);
   }

   private static String lII(char[] var0, long var1, int var3) {
      int var4 = llI(748270576, 152537376 ^ -1789583378) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & llI(748270591, 152537376 ^ 1295343982);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String lIl(String var0) {
      String var1 = var0.trim().toLowerCase(Locale.ROOT).replace((char)llI(748270573, 787223932 ^ -1140878208), (char)llI(748270572, 787223932 ^ -929226472));
      String var10000;
      if (var1.contains(IlIIllIII.lI(lI[1]))) {
         var10000 = var1;
      } else {
         String var2 = IlIIllIII.lI(lI[0]);
         var10000 = var2 + var1;
      }

      return var10000;
   }
}
