package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class IIlIIllIl extends IlIIIIIIl {
   private int I;
   private final IIlIII II;
   private static final int[] IlI;
   private IIIIlII Il;
   private static final String[] Ill;
   private static final String[] lI;
   private long ll;
   private static final Object[] lII;
   private static final String[] III;
   private static String[] IIl;

   @Override
   public void llIl() {
      this.lI();
   }

   private boolean I(class_310 var1) {
      return var1.field_1690.field_1894.method_1434()
         && !var1.field_1690.field_1881.method_1434()
         && !var1.field_1724.method_5715()
         && !var1.field_1724.method_6115();
   }

   private static int IIl(int var0, int var1) {
      int var2 = IlI[var0 ^ -533765444] ^ var1 ^ var0;
      var2 ^= 49350;
      var2 -= 47476;
      var2 += 56078;
      var2 -= 32509;
      var2 ^= 59949;
      return var2 ^ 13682;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 484982752;
      int var17 = 0;
      int var16 = 0;
      String[] var15 = new String[2];
      int var14 = "E\ue4ca\ue70d釹䛪茻\ud912裏⽐摙란캴䮦愭\udf43\uf3fe䓬蚾趼\ue2dfᒊ认藂淣唪득荟Ȇ昼ﮕ閡옢箈攮쒿瞦튒䉀쵄\udcd9\udd7b䒳櫇\ue1ad犦䰓ꊗ\uf377\u2fdd죀ᑃܼꚩ줈\ueb18⨅骃ꦴ㈲⪍Ვ㍪崐鷱䄷귢宿ꛬ찈䵵\u0019\u0dfd₫䉣쓷럪걘썶쇴廞칕矲䰙邧↥鍎斘⼀鰆ﵰ弦엒\uee1c鵊䞃䁨"
         .length();
      String var13 = "E\ue4ca\ue70d釹䛪茻\ud912裏⽐摙란캴䮦愭\udf43\uf3fe䓬蚾趼\ue2dfᒊ认藂淣唪득荟Ȇ昼ﮕ閡옢箈攮쒿瞦튒䉀쵄\udcd9\udd7b䒳櫇\ue1ad犦䰓ꊗ\uf377\u2fdd죀ᑃܼꚩ줈\ueb18⨅骃ꦴ㈲⪍Ვ㍪崐鷱䄷귢宿ꛬ찈䵵\u0019\u0dfd₫䉣쓷럪걘썶쇴廞칕矲䰙邧↥鍎斘⼀鰆ﵰ弦엒\uee1c鵊䞃䁨";
      short var18 = 22290;

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 78;
               case 1 -> 86;
               case 2 -> 121;
               case 3 -> 163;
               case 4 -> 42;
               case 5 -> 139;
               case 6 -> 129;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      Ill = var15;
      lII = new Object[var15.length];
      int var9 = 523144693;
      byte[] var7 = "B×(yÑ\u001f\u0007oõ\u0003\nWÞ^,1µ\u009dÑ\u0084Ö\u008e¤<\\á*çFtÚD²\u009f^Ó\u0098¨¢Mä?ÆÕ3tv.©7jÃsjÞ¡\u0089\u0001X\u0094ÿ\u008dæ\u008cTÚÀµ\u0087\u001c°\u0084U\u001e.M\u001a\u0000Âm\u001f¨ZGÕj>=\u009aß7ÄÁ\u009fCÐéßÈ³Ä\u0087û¤0AÚ7w)\u0014¸\u0084.ëdJäÓºÚ\u0081AÇL\u009fÜà?7ø\u000f\u009doûYE²}ÌC-'Ê\u0013Ñ\u0089\u008f2_àüµþ@/\u001d\u0086\u0002V;ø¤\u0019\n¦ìÏÙßÄ6NMþüÓã?\"{ÿo¶\t!¨B¯\u0013\u001aìeÒ\u009f\u0015^ºÞ\u001d,\u001aÂIó\u0002!*Zqº\u001d.á\\\u0092ºF\u0086\u008fwÖ¿x\u0085¡K¶â\u0000ä\u009c#\u0012Ó©1íÓ«~\u0087?ûQ±U\u0005É2\u0006Ç0å\u0090µ¥u«Z\u0013ür$k½io\u008f4þ8\tå¼Ãh'\u0098Z·Ã-[³,»i×ø!3ì.\u000e¢ªîÇ¤tr\u0086ù¨È2\u0087ü;K\\÷\t±\u0014\u0087`\u0007ÉÜ\b°(\u0091½\u0082\t^\u0011\u009c\"\u0081¹\u0091ö7AI\u001fN;Äz¨W'¼}è\u007füÞ¾µD©áÙ\u0006\u0005{\u0081\u0085\u0090Þ\u0001\u0002\u001eû´\r\u0097ªÏ\u0013üÔ;¬.¨yæÖ\u0095Ñý®Ë±\u000bÆ\f\u001eExþ!ôÂ\u0093\u0085¥8\u0094.uÉ&5#Éc\u00adry^7Ú¥Y\u001fA>k2¯¾\u008b\u0082·³?@ Yé¿\\aß|Øçðw¹;Lû9Q¿ê§Õ»\u009b¹^9²\u0006É©\u009fà\u0090f\u00ad°\u0091¶\u000bêwÚ\u0089ÍëV\n\u00823e+Þ|Å\\ä¢OI\u001c\u00adû·4~\u009bI\u0087ÆN×$|ìm¶èdã\u0082êO£\u0087u9ÚÜ¦wkû\u008f\u001a\u0003\u0004\u0012\"¡\u000fÇ;kR6²\u0012\u0093«e÷÷¼[à\u008c\n±fÍ\u0002hóºxa\u0097YI\u0090Ô/æ¥TE\u0011v\nh|\u00ad\u008ct=Ô(\u009ax\u0086¾\u009dðî_òÊ\u0097ï´\u0088¨<(\u008c«x2ý¨\u0087¥¦rÒÜ¼S\u009b\u001dZ<©ÐÃà_\u0086Æ<í3+±O\u0012¦Ï=\u0010iÚ\u0013\u0006`m\u0015\\n»C¶+\u001aù)µN¼·9\u0001\nïÜy*×\u0000ý±#)\u001fú\u001f\u0080\u0091Å¯H¦ýR|³¦ÒÑ\u0085\u0016få\u008a¥\u009cÞ;@ÀË·\u0001;rÉO\u0082¿è\u0015¹û\u001fØ6ª¬ðó\u0018ì\u0096\u0005Ï§bPyUk`ciï]ó¼ z9D+sEt\u0088\b\u0014÷Ô\u00862_µ-ßç{\u009cP\u001cK½\u009f\u008bÈ\u008f\u001f_óî\u007fy¬^Cé\u0005\u008e\u0096îOMÙ\u0007Ïür%Õ}ðè¥¹>!\u001c\rÿßQaÇoë\u0003oÚRe\u0083\u0016`´Åþ+l\u008eáq\u008c§ÖVÚæ\u0013\u008bs\u000b¿Ï°hÓ\u00197aÃ}N`¿¡Âmo¢Û\u0087p\u0098\u0012Õ)2\u000b\u008dE\\¹\u0006ÂÏ4·Hâ¸¾TÏò¼j\u0016\u0086ùBÖ`(bÅ.¤Ó3q\u001f\u001e\u0003Ò³\u0098[>8(eÑÄ\u009bS;:5Ä¥ÛÆCñª¿Ä;Ã\u0016\u0002%\u0018ïU \u0013\"d³ÚÖ© ®\u0090Þ»B\u000fGQNjg¦\u0013áA}«å\u000f/]ÜV\u0012¸\u0081\u009b_3·\u0091ö1FG\u0096t±ý\u0007\u0001§e\u001a«Ï\u0010é\u0086vS\u001eX¹ûg\u0001âÅ/\u008e1oF\u001bÎ\u0001ô\u0098dGWµ\u0083ª5/VIV\nY\u0011\u008eë\u0011ëtmMk»éßU5 \u0013YËÝ½|¤êõ'ÏißÆw\u008f<\u008eÝ\u008c\u0092Â@0;\n\u0010.q\u00078IüÜn£|:s\u0082ù\u0090\u0015\u0005\u008b5g\u0082$°L=\u001f>ÝFd\u008f\u0019ç#\u0015\u0081p\fíÝ\u0013þÞ/W%\u0002Î\u001e+ÛÉ\u0018 i¥\u0002Û»'¸ÍkÁ%ÝiAK\u008cq\u0090%Ôüå\u0007\u0007*ºJ,&\u001f¨\u0080õí'@\u0006\u0091Ü\u0094C\u0081"
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

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = Ill('õ', '贠', var23 ^ -487969214)).length();
      int var1 = IIl(-533765444, var23 ^ -1589705580);
      int var25 = -1;

      label101:
      while (true) {
         int var28 = IIl(-533765443, var23 ^ 855059411);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label96: {
               char[] var44 = var10001.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var28;
               var40 = var44;
               int var34 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var47 = var28;
                  var34 = var10004;
                  if (var10004 <= var6) {
                     break label96;
                  }

                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % IIl(-533765448, var23 ^ 1450573140)) {
                     case 0 -> IIl(-533765447, var23 ^ 895912163);
                     case 1 -> IIl(-533765446, var23 ^ -1089927432);
                     case 2 -> IIl(-533765445, var23 ^ -1516439989);
                     case 3 -> IIl(-533765452, var23 ^ 1366782668);
                     case 4 -> IIl(-533765451, var23 ^ 2067828411);
                     case 5 -> IIl(-533765450, var23 ^ 131590860);
                     default -> IIl(-533765449, var23 ^ -795059515);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var34 <= var6) {
                        break;
                     }

                     var56 = var40;
                     var10004 = var47;
                     var10006 = var6;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var49;
                  if ((var25 += var1) >= var4) {
                     lI = var5;
                     III = new String[4];
                     IIl = new String[5];
                     III();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var49;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label101;
                  }

                  var4 = (var2 = Ill('ô', 'ὤ', var23 ^ 488729670)).length();
                  var1 = IIl(-533765442, var23 ^ 384509568);
                  var25 = -1;
            }

            var28 = IIl(-533765441, var23 ^ 1035337866);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   @Override
   public String IlIIl() {
      long var1 = this.l();
      String var10000;
      if (var1 <= 0L) {
         var10000 = IIl[1];
      } else {
         String var5 = IlIIllIII.lI(IIl[0]);
         var10000 = var1 + var5;
      }

      return var10000;
   }

   private static String Ill(char var0, char var1, int var2) {
      int var3 = var0 ^ 245;
      char[] var4 = Ill[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lII[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lII[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 18576;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 30848;
         var10 ^= 15185;
         var10 -= 22159;
         var10 -= 46871;
         var10 -= 56855;
         var10 += 64737;
         var10 ^= 10311;
         var10 += 10854;
         var10 += 36381;
         var10 += 57910;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private long l() {
      return Math.max(0L, Math.min(10L, Math.round(this.II.IllI())));
   }

   @Override
   public void IlIlI(class_1297 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 instanceof class_1309 var3 && var2 == null) {
         class_310 var4 = class_310.method_1551();
         if (var4 != null && var4.field_1724 != null && var4.field_1724.method_5624() && var3 != var4.field_1724 && var3.method_5805() && !var3.method_31481()) {
            this.Il = IIIIlII.III;
            this.ll = System.currentTimeMillis() + this.l();
            this.I = IIl(-533765456, 1758027928 ^ 1090542555);
         }
      }
   }

   public boolean II(class_310 var1) {
      if (!this.IIIIlIl() || this.Il == IIIIlII.l) {
         this.lI();
         return false;
      } else if (var1 == null || var1.field_1724 == null || var1.field_1690 == null || var1.field_1755 != null || !var1.field_1724.method_5805()) {
         this.lI();
         return false;
      } else if (this.Il == IIIIlII.III) {
         if (System.currentTimeMillis() < this.ll) {
            return false;
         } else if (!var1.field_1724.method_5624()) {
            this.lI();
            return false;
         } else {
            var1.field_1724.method_5728(false);
            this.Il = IIIIlII.I;
            this.I = var1.field_1724.field_6012 + 1;
            return true;
         }
      } else if (var1.field_1724.field_6012 < this.I) {
         return false;
      } else {
         boolean var2 = this.I(var1);
         this.lI();
         if (var2) {
            var1.field_1724.method_5728(true);
         }

         return false;
      }
   }

   private static String Il(int var0, int var1) {
      int var9 = 1586962069;
      int var2 = (var0 ^ IIl(-533765455, var9 ^ -755106025)) & IIl(-533765454, var9 ^ 680990595);
      if (III[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & IIl(-533765453, var9 ^ 1578822298)) {
            case 0 -> IIl(-533765460, var9 ^ -179450522);
            case 1 -> IIl(-533765459, var9 ^ 646692052);
            case 2 -> IIl(-533765458, var9 ^ -192339023);
            case 3 -> IIl(-533765457, var9 ^ -1147678733);
            case 4 -> IIl(-533765464, var9 ^ -1103145017);
            case 5 -> IIl(-533765463, var9 ^ 1962750791);
            case 6 -> IIl(-533765462, var9 ^ 994589672);
            case 7 -> IIl(-533765461, var9 ^ 1611157064);
            case 8 -> IIl(-533765468, var9 ^ 1212728594);
            case 9 -> IIl(-533765467, var9 ^ 1695610570);
            case 10 -> IIl(-533765466, var9 ^ -1848191048);
            case 11 -> IIl(-533765465, var9 ^ -692184756);
            case 12 -> IIl(-533765472, var9 ^ 632940342);
            case 13 -> IIl(-533765471, var9 ^ -344728048);
            case 14 -> IIl(-533765470, var9 ^ 2065058876);
            case 15 -> IIl(-533765469, var9 ^ -318189297);
            case 16 -> IIl(-533765476, var9 ^ -1633618910);
            case 17 -> IIl(-533765475, var9 ^ 1022949096);
            case 18 -> IIl(-533765474, var9 ^ -467308481);
            case 19 -> IIl(-533765473, var9 ^ -491115934);
            case 20 -> IIl(-533765480, var9 ^ -1304001450);
            case 21 -> IIl(-533765479, var9 ^ -1815548485);
            case 22 -> IIl(-533765478, var9 ^ 342445085);
            case 23 -> IIl(-533765477, var9 ^ -1139732936);
            case 24 -> IIl(-533765484, var9 ^ -1703958083);
            case 25 -> IIl(-533765483, var9 ^ -1422794588);
            case 26 -> IIl(-533765482, var9 ^ 2018035718);
            case 27 -> IIl(-533765481, var9 ^ -270863630);
            case 28 -> IIl(-533765488, var9 ^ 1920217759);
            case 29 -> IIl(-533765487, var9 ^ -630693343);
            case 30 -> IIl(-533765486, var9 ^ -1464425216);
            case 31 -> IIl(-533765485, var9 ^ 243537783);
            case 32 -> IIl(-533765492, var9 ^ -1002073285);
            case 33 -> IIl(-533765491, var9 ^ -13774290);
            case 34 -> IIl(-533765490, var9 ^ -1920086406);
            case 35 -> IIl(-533765489, var9 ^ 1385507936);
            case 36 -> IIl(-533765496, var9 ^ -68765878);
            case 37 -> IIl(-533765495, var9 ^ -1888071509);
            case 38 -> IIl(-533765494, var9 ^ 466717446);
            case 39 -> IIl(-533765493, var9 ^ -700337512);
            case 40 -> IIl(-533765500, var9 ^ 607536864);
            case 41 -> IIl(-533765499, var9 ^ 1134029154);
            case 42 -> IIl(-533765498, var9 ^ -2105155993);
            case 43 -> IIl(-533765497, var9 ^ -1870995551);
            case 44 -> IIl(-533765504, var9 ^ -552586284);
            case 45 -> IIl(-533765503, var9 ^ -265922486);
            case 46 -> IIl(-533765502, var9 ^ 1755646792);
            case 47 -> IIl(-533765501, var9 ^ -1854759662);
            case 48 -> IIl(-533765380, var9 ^ 81962847);
            case 49 -> IIl(-533765379, var9 ^ -1301577762);
            case 50 -> IIl(-533765378, var9 ^ -903191380);
            case 51 -> IIl(-533765377, var9 ^ 782496311);
            case 52 -> IIl(-533765384, var9 ^ -1468878707);
            case 53 -> IIl(-533765383, var9 ^ -911174572);
            case 54 -> IIl(-533765382, var9 ^ 374612155);
            case 55 -> IIl(-533765381, var9 ^ 314291965);
            case 56 -> IIl(-533765388, var9 ^ 1986997413);
            case 57 -> IIl(-533765387, var9 ^ 1303970679);
            case 58 -> IIl(-533765386, var9 ^ 192531036);
            case 59 -> IIl(-533765385, var9 ^ -706376836);
            case 60 -> IIl(-533765392, var9 ^ 157236915);
            case 61 -> IIl(-533765391, var9 ^ 1571571355);
            case 62 -> IIl(-533765390, var9 ^ 1453243526);
            case 63 -> IIl(-533765389, var9 ^ 653724400);
            case 64 -> IIl(-533765396, var9 ^ 2107620613);
            case 65 -> IIl(-533765395, var9 ^ 808095355);
            case 66 -> IIl(-533765394, var9 ^ -7958431);
            case 67 -> IIl(-533765393, var9 ^ 539925605);
            case 68 -> IIl(-533765400, var9 ^ -1764342420);
            case 69 -> IIl(-533765399, var9 ^ -273889276);
            case 70 -> IIl(-533765398, var9 ^ 163589058);
            case 71 -> 3;
            case 72 -> IIl(-533765397, var9 ^ -595627460);
            case 73 -> IIl(-533765404, var9 ^ 2133440832);
            case 74 -> IIl(-533765403, var9 ^ 142005621);
            case 75 -> IIl(-533765402, var9 ^ -1528001423);
            case 76 -> IIl(-533765401, var9 ^ 826871140);
            case 77 -> IIl(-533765408, var9 ^ -1083394018);
            case 78 -> IIl(-533765407, var9 ^ 910017192);
            case 79 -> IIl(-533765406, var9 ^ 1564686278);
            case 80 -> IIl(-533765405, var9 ^ -1891666922);
            case 81 -> IIl(-533765412, var9 ^ 1996676149);
            case 82 -> IIl(-533765411, var9 ^ 257736017);
            case 83 -> IIl(-533765410, var9 ^ 1738216440);
            case 84 -> 2;
            case 85 -> IIl(-533765409, var9 ^ -647418480);
            case 86 -> IIl(-533765416, var9 ^ 1661241405);
            case 87 -> IIl(-533765415, var9 ^ -1727847532);
            case 88 -> IIl(-533765414, var9 ^ 1756444941);
            case 89 -> IIl(-533765413, var9 ^ 1760862342);
            case 90 -> IIl(-533765420, var9 ^ -657900996);
            case 91 -> IIl(-533765419, var9 ^ 80613961);
            case 92 -> IIl(-533765418, var9 ^ -1610858692);
            case 93 -> IIl(-533765417, var9 ^ 521965489);
            case 94 -> IIl(-533765424, var9 ^ 313019779);
            case 95 -> IIl(-533765423, var9 ^ -125914480);
            case 96 -> IIl(-533765422, var9 ^ -1068994261);
            case 97 -> IIl(-533765421, var9 ^ 1181186640);
            case 98 -> IIl(-533765428, var9 ^ -1696860503);
            case 99 -> IIl(-533765427, var9 ^ -265754803);
            case 100 -> IIl(-533765426, var9 ^ 1949079516);
            case 101 -> IIl(-533765425, var9 ^ -5324856);
            case 102 -> IIl(-533765432, var9 ^ 1748931192);
            case 103 -> IIl(-533765431, var9 ^ 837918894);
            case 104 -> IIl(-533765430, var9 ^ 807470652);
            case 105 -> IIl(-533765429, var9 ^ -699562505);
            case 106 -> IIl(-533765436, var9 ^ 1254164226);
            case 107 -> IIl(-533765435, var9 ^ -1829623839);
            case 108 -> 5;
            case 109 -> IIl(-533765434, var9 ^ -581807781);
            case 110 -> IIl(-533765433, var9 ^ 64504964);
            case 111 -> IIl(-533765440, var9 ^ 208452142);
            case 112 -> IIl(-533765439, var9 ^ -552843787);
            case 113 -> IIl(-533765438, var9 ^ 1742330637);
            case 114 -> IIl(-533765437, var9 ^ -579116592);
            case 115 -> IIl(-533765572, var9 ^ 1240723042);
            case 116 -> IIl(-533765571, var9 ^ 1272491824);
            case 117 -> IIl(-533765570, var9 ^ -726739359);
            case 118 -> IIl(-533765569, var9 ^ 132147016);
            case 119 -> IIl(-533765576, var9 ^ 780996562);
            case 120 -> IIl(-533765575, var9 ^ -1279939512);
            case 121 -> IIl(-533765574, var9 ^ 1722574413);
            case 122 -> IIl(-533765573, var9 ^ -1759175097);
            case 123 -> IIl(-533765580, var9 ^ 183696008);
            case 124 -> IIl(-533765579, var9 ^ 499969508);
            case 125 -> 0;
            case 126 -> 4;
            case 127 -> IIl(-533765578, var9 ^ -1423545543);
            case 128 -> IIl(-533765577, var9 ^ -1543504014);
            case 129 -> IIl(-533765584, var9 ^ -638150052);
            case 130 -> IIl(-533765583, var9 ^ -402138904);
            case 131 -> IIl(-533765582, var9 ^ 1194482094);
            case 132 -> IIl(-533765581, var9 ^ -1327429988);
            case 133 -> IIl(-533765588, var9 ^ -583368462);
            case 134 -> IIl(-533765587, var9 ^ -1673321006);
            case 135 -> IIl(-533765586, var9 ^ -653151347);
            case 136 -> IIl(-533765585, var9 ^ 1366905664);
            case 137 -> IIl(-533765592, var9 ^ 1795220168);
            case 138 -> IIl(-533765591, var9 ^ 692007144);
            case 139 -> IIl(-533765590, var9 ^ 758936841);
            case 140 -> IIl(-533765589, var9 ^ 1547668265);
            case 141 -> IIl(-533765596, var9 ^ 132505494);
            case 142 -> IIl(-533765595, var9 ^ 499423199);
            case 143 -> IIl(-533765594, var9 ^ -72637238);
            case 144 -> IIl(-533765593, var9 ^ 1651987115);
            case 145 -> IIl(-533765600, var9 ^ 1739317351);
            case 146 -> IIl(-533765599, var9 ^ -1977203723);
            case 147 -> IIl(-533765598, var9 ^ 123219974);
            case 148 -> IIl(-533765597, var9 ^ -934470093);
            case 149 -> IIl(-533765604, var9 ^ -1040574007);
            case 150 -> IIl(-533765603, var9 ^ -819179895);
            case 151 -> IIl(-533765602, var9 ^ -1970408061);
            case 152 -> IIl(-533765601, var9 ^ 349810717);
            case 153 -> IIl(-533765608, var9 ^ -1734998450);
            case 154 -> IIl(-533765607, var9 ^ 2112759414);
            case 155 -> IIl(-533765606, var9 ^ -1586840493);
            case 156 -> IIl(-533765605, var9 ^ -2004289589);
            case 157 -> IIl(-533765612, var9 ^ 554092863);
            case 158 -> IIl(-533765611, var9 ^ -382602773);
            case 159 -> IIl(-533765610, var9 ^ -584799648);
            case 160 -> IIl(-533765609, var9 ^ 1880234705);
            case 161 -> IIl(-533765616, var9 ^ 1142794544);
            case 162 -> IIl(-533765615, var9 ^ 2141998121);
            case 163 -> IIl(-533765614, var9 ^ 1780485526);
            case 164 -> IIl(-533765613, var9 ^ -748797078);
            case 165 -> IIl(-533765620, var9 ^ 511645792);
            case 166 -> IIl(-533765619, var9 ^ 1518916977);
            case 167 -> IIl(-533765618, var9 ^ 188480586);
            case 168 -> IIl(-533765617, var9 ^ -1183081684);
            case 169 -> IIl(-533765624, var9 ^ 1848668044);
            case 170 -> IIl(-533765623, var9 ^ -658348156);
            case 171 -> IIl(-533765622, var9 ^ -1023483304);
            case 172 -> IIl(-533765621, var9 ^ 1378561327);
            case 173 -> IIl(-533765628, var9 ^ -1730992158);
            case 174 -> IIl(-533765627, var9 ^ -454851115);
            case 175 -> IIl(-533765626, var9 ^ -1251943973);
            case 176 -> IIl(-533765625, var9 ^ -1815562160);
            case 177 -> IIl(-533765632, var9 ^ 2121299775);
            case 178 -> IIl(-533765631, var9 ^ -242530526);
            case 179 -> IIl(-533765630, var9 ^ 1042072986);
            case 180 -> IIl(-533765629, var9 ^ -1094123862);
            case 181 -> IIl(-533765508, var9 ^ -554786335);
            case 182 -> IIl(-533765507, var9 ^ -495056750);
            case 183 -> IIl(-533765506, var9 ^ 930693710);
            case 184 -> IIl(-533765505, var9 ^ 2022753002);
            case 185 -> IIl(-533765512, var9 ^ -743253607);
            case 186 -> IIl(-533765511, var9 ^ 1367320753);
            case 187 -> IIl(-533765510, var9 ^ -1615457955);
            case 188 -> IIl(-533765509, var9 ^ 1581800883);
            case 189 -> IIl(-533765516, var9 ^ 1727588027);
            case 190 -> IIl(-533765515, var9 ^ -833790119);
            case 191 -> IIl(-533765514, var9 ^ 578907200);
            case 192 -> IIl(-533765513, var9 ^ 1684613012);
            case 193 -> IIl(-533765520, var9 ^ 796294502);
            case 194 -> IIl(-533765519, var9 ^ 104946235);
            case 195 -> IIl(-533765518, var9 ^ 1199867468);
            case 196 -> IIl(-533765517, var9 ^ -1440169146);
            case 197 -> IIl(-533765524, var9 ^ -918284865);
            case 198 -> IIl(-533765523, var9 ^ -1068208086);
            case 199 -> IIl(-533765522, var9 ^ -1054298802);
            case 200 -> IIl(-533765521, var9 ^ -856117393);
            case 201 -> IIl(-533765528, var9 ^ 652711112);
            case 202 -> IIl(-533765527, var9 ^ 1958625089);
            case 203 -> IIl(-533765526, var9 ^ 751980627);
            case 204 -> IIl(-533765525, var9 ^ -1487551539);
            case 205 -> IIl(-533765532, var9 ^ 383774706);
            case 206 -> IIl(-533765531, var9 ^ 532923072);
            case 207 -> IIl(-533765530, var9 ^ 503126618);
            case 208 -> IIl(-533765529, var9 ^ 1490410302);
            case 209 -> IIl(-533765536, var9 ^ -1980381184);
            case 210 -> IIl(-533765535, var9 ^ 88358469);
            case 211 -> IIl(-533765534, var9 ^ -1098314043);
            case 212 -> IIl(-533765533, var9 ^ 302995033);
            case 213 -> IIl(-533765540, var9 ^ -1715509054);
            case 214 -> IIl(-533765539, var9 ^ 1695309433);
            case 215 -> IIl(-533765538, var9 ^ -1683830281);
            case 216 -> IIl(-533765537, var9 ^ 2052149060);
            case 217 -> IIl(-533765544, var9 ^ 187222267);
            case 218 -> IIl(-533765543, var9 ^ 1652625163);
            case 219 -> IIl(-533765542, var9 ^ -1183295437);
            case 220 -> IIl(-533765541, var9 ^ -1296733699);
            case 221 -> IIl(-533765548, var9 ^ 2067899492);
            case 222 -> IIl(-533765547, var9 ^ 252170760);
            case 223 -> IIl(-533765546, var9 ^ -476558649);
            case 224 -> IIl(-533765545, var9 ^ -268604592);
            case 225 -> IIl(-533765552, var9 ^ -1300870093);
            case 226 -> IIl(-533765551, var9 ^ 175243823);
            case 227 -> IIl(-533765550, var9 ^ -62170312);
            case 228 -> IIl(-533765549, var9 ^ 420910692);
            case 229 -> IIl(-533765556, var9 ^ -1843356539);
            case 230 -> IIl(-533765555, var9 ^ -1865331894);
            case 231 -> IIl(-533765554, var9 ^ -718868465);
            case 232 -> IIl(-533765553, var9 ^ -1607439909);
            case 233 -> IIl(-533765560, var9 ^ 173546560);
            case 234 -> IIl(-533765559, var9 ^ 669081247);
            case 235 -> IIl(-533765558, var9 ^ -114362763);
            case 236 -> IIl(-533765557, var9 ^ -1602893804);
            case 237 -> IIl(-533765564, var9 ^ 799433280);
            case 238 -> IIl(-533765563, var9 ^ -1168569011);
            case 239 -> IIl(-533765562, var9 ^ 972245629);
            case 240 -> IIl(-533765561, var9 ^ 336897865);
            case 241 -> IIl(-533765568, var9 ^ -1899936262);
            case 242 -> 1;
            case 243 -> IIl(-533765567, var9 ^ -1412555423);
            case 244 -> IIl(-533765566, var9 ^ 1250354939);
            case 245 -> IIl(-533765565, var9 ^ -858101989);
            case 246 -> IIl(-533765188, var9 ^ 1212701067);
            case 247 -> IIl(-533765187, var9 ^ 25449846);
            case 248 -> IIl(-533765186, var9 ^ 2083156076);
            case 249 -> IIl(-533765185, var9 ^ 1264724632);
            case 250 -> IIl(-533765192, var9 ^ -934753767);
            case 251 -> IIl(-533765191, var9 ^ 782991922);
            case 252 -> IIl(-533765190, var9 ^ 755355497);
            case 253 -> IIl(-533765189, var9 ^ -1850997016);
            case 254 -> IIl(-533765196, var9 ^ -1880749463);
            default -> IIl(-533765195, var9 ^ -395587248);
         };
         int var5 = (var1 & IIl(-533765194, var9 ^ 48969568)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIl(-533765193, var9 ^ 594533895)) >>> IIl(-533765200, var9 ^ -1541654069)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIl(-533765199, var9 ^ 598981976);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIl(-533765198, var9 ^ -1668795446);
            }
         }

         III[var2] = new String(var3).intern();
      }

      return III[var2];
   }

   private void lI() {
      this.Il = IIIIlII.l;
      this.ll = 0L;
      this.I = IIl(-533765197, -436881362 ^ 594503604);
   }

   private static String ll(char[] var0, long var1, int var3) {
      int var4 = IIl(-533765204, 1295031066 ^ -1385523277) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIl(-533765203, 1295031066 ^ -1036229286);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static void III() {
      int var0 = 1117681583;
      IIl[0] = ll(Il(IIl(-533765202, var0 ^ -1369401409), IIl(-533765201, var0 ^ -356839021)).toCharArray(), 29308L, IIl(-533765208, var0 ^ -1829883318));
      IIl[1] = ll("".toCharArray(), 29414L, IIl(-533765207, var0 ^ 556085197));
      IIl[2] = ll(Il(IIl(-533765206, var0 ^ -1085934962), IIl(-533765205, var0 ^ -89261866)).toCharArray(), 65848L, IIl(-533765212, var0 ^ -13504863));
      IIl[3] = ll(Il(IIl(-533765211, var0 ^ -166578168), IIl(-533765210, var0 ^ -1739942921)).toCharArray(), 81098L, IIl(-533765209, var0 ^ 114922004));
      IIl[4] = ll(Il(IIl(-533765216, var0 ^ -139300989), IIl(-533765215, var0 ^ -354362860)).toCharArray(), 50525L, IIl(-533765214, var0 ^ -556501929));
   }

   public IIlIIllIl() {
      super(IlIIllIII.Ill(IIl[4]), lllIIlIl.III, IlIIllIII.Ill(IIl[3]));
      this.II = this.IllIIll(new IIlIII(IlIIllIII.Ill(IIl[2]), 0.0, 0.0, 10.0, 1.0).IlII(IlIIllIII.lI(IIl[0])));
      this.Il = IIIIlII.l;
      this.I = IIl(-533765213, 1296769967 ^ 287387837);
   }
}
