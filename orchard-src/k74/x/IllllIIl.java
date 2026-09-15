package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class IllllIIl extends IlIIIIIIl {
   private int I;
   private lIllIlI II;
   private lI Il;
   private long lI;
   private final lIlllIl ll;
   private final lllIIlII III;
   private static final int IIl = 9;
   private static final String[] IlI;
   private static final Object[] IIll;
   private static final String[] Ill;
   private int lII;
   private final lllIIlII lIl;
   private static final String[] IIlI;
   private int llI;
   private final lIllIlII lll;
   private static final int[] IIIl;
   private boolean IIII;

   @Override
   public boolean IIIlIII() {
      return true;
   }

   private void I(class_310 var1) {
      class_306 var2 = this.lll.IllI();
      boolean var3 = !k74.x.IIll.IIlll(var2) && k74.x.IIll.IIIllll(var1, var2) || this.IIllIII() && k74.x.IIll.IIIllll(var1, this.IlIIlII());
      if (var3 && !this.IIII) {
         lI var4 = this.III(var1.field_1724) ? k74.x.lI.I : k74.x.lI.l;
         if (!this.lll(var1, var4)) {
            this.lll(var1, var4 == k74.x.lI.l ? k74.x.lI.I : k74.x.lI.l);
         }
      }

      this.IIII = var3;
   }

   private boolean II(class_310 var1) {
      String[] var10000 = llIllIlI.IIlII();
      class_746 var3 = var1.field_1724;
      String[] var2 = var10000;
      if (var3 != null && this.III(var3) && !var3.method_24828()) {
         boolean var4 = var3.method_18798().field_1351 < -0.1 || var3.field_6017 > 0.0 || var3.method_6128();
         if (!var4) {
            return false;
         } else {
            IIIIIllII var5 = IIIIIllII.III();
            IIlIlIlII var6 = var5 != null && var5.II() != null ? var5.II().llIlIl() : null;
            if (var6 != null && var6.IIIll()) {
               return false;
            } else {
               double var7 = var6 != null ? var6.lllI() : 6.0;
               double var9 = var7 * var7;
               if (var6 != null) {
                  class_1657 var11 = var6.IIIIlI();
                  if (var11 != null && var11.method_5805() && !var11.method_7325() && var3.method_5858(var11) <= var9) {
                     return true;
                  }
               }

               if (var1.field_1687 != null) {
                  IIlIlllll var15 = var5 != null && var5.II() != null ? var5.II().IlIllI() : null;
                  lIIIlIIl var12 = var5 != null && var5.II() != null ? var5.II().IlIlIII() : null;

                  for (class_1657 var14 : var1.field_1687.method_18456()) {
                     if (var14 != var3
                        && var14.method_5805()
                        && !var14.method_7325()
                        && (!var14.method_68878() || var2 == null)
                        && (var15 == null || !var15.l(var14) || var2 == null)
                        && (var12 == null || !var12.IIl(var14) || var2 == null)) {
                        if (var3.method_5858(var14) <= var9) {
                           return true;
                        }

                        if (var2 == null) {
                           break;
                        }
                     }
                  }
               }

               return false;
            }
         }
      } else {
         return false;
      }
   }

   private boolean Il(class_1799 var1) {
      return var1 != null
         && !var1.method_7960()
         && (
            var1.method_31574(class_1802.field_8577)
               || var1.method_31574(class_1802.field_8873)
               || var1.method_31574(class_1802.field_8523)
               || var1.method_31574(class_1802.field_8678)
               || var1.method_31574(class_1802.field_8058)
               || var1.method_31574(class_1802.field_22028)
               || var1.method_31574(class_1802.field_61344)
         );
   }

   private boolean lI(class_310 var1) {
      if (var1 != null && var1.field_1724 != null && this.lII >= 0 && this.lII < IllI(1795993026, -1159867502 ^ 267150740)) {
         class_1799 var2 = var1.field_1724.method_31548().method_5438(this.lII);
         if (var2.method_7960()) {
            return false;
         } else {
            return this.III(var1.field_1724) ? this.Il(var2) : this.llI(var2) || this.Il(var2);
         }
      } else {
         return false;
      }
   }

   private boolean ll(class_746 var1) {
      return this.Il(var1.method_6118(class_1304.field_6174));
   }

   private boolean III(class_746 var1) {
      return this.llI(var1.method_6118(class_1304.field_6174));
   }

   @Override
   public void IlIII() {
      this.lII();
      this.IIII = false;
   }

   private boolean IIl(class_310 var1) {
      return var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null && var1.field_1755 == null;
   }

   public IllllIIl() {
      int var1 = -917734750;
      super(
         IlIIllIII.Ill(IIll(IllI(1795993027, var1 ^ 853348887), IllI(1795993024, var1 ^ 1428366080))),
         lllIIlIl.IlI,
         IlIIllIII.Ill(IIll(IllI(1795993025, var1 ^ -2008357988), IllI(1795993030, var1 ^ 1713577682)))
      );
      this.lll = this.IllIIll(new lIllIlII(IlIIllIII.Ill(IIll(IllI(1795993031, var1 ^ 190904853), IllI(1795993028, var1 ^ 159652921)))));
      this.lIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIll(IllI(1795993029, var1 ^ -881412476), IllI(1795993034, var1 ^ -2140275639))), false));
      this.ll = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIll(IllI(1795993035, var1 ^ 613131182), IllI(1795993032, var1 ^ -6607797))), 0.0, 0.0, 0.0, 500.0, 5.0)
            .Ill(IlIIllIII.Ill(IIll(IllI(1795993033, var1 ^ -2118924358), IllI(1795993038, var1 ^ -145819654))))
      );
      this.III = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIll(IllI(1795993039, var1 ^ -1169777099), IllI(1795993036, var1 ^ 1403700047))), true));
      this.II = lIllIlI.l;
      this.llI = -1;
      this.lII = -1;
      this.I = -1;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -1765843874;
      int var11 = 0;
      int var10001 = "@Ǹ\u1c8a徹\udce1彽屈Զ籒,峪и㲛ู鳣օ籅~ᴨȜ㶔Ͱ벊ཁ\udce3\u0fcd屌\u0006ᴨ˴\udce9\u0590鲆ȱ峥̵屟Ů㱀ǌ㳠Π\udc9dA峹֕\udc4aÞ屭͔\u1cfcX粏ɹ籚ͽ뱌vﱯl\udce8ཨᲅ\u0379볠m蝸ﹼ릉绳뫵㺠뷦麷뷜鸅뮠빢蝉鸎뢽﹕蝖㺹뫤\ude0c뫰﹢렡师멽\udea8뜆Ế蛌\ude07虘\ude68虱绰蜭ﺽ뭖幌볤︆례\ufe67뤩帋믝纥뫦ﺉ虤Ḁ蘠\ude7c뫹黷룍\udea9릮뺥뤌㸏蝠鹽蜉\ude18룵庨蟶ﺤ몄縁뱠㹦먱㸌뱥뺧뵾麷뮼\ufe1c믈繾믹븍붽纺믞ﺴ虄㸜뵘Ṻ묁縏몝ṗ밦뺺蚄师멨繗렡㸂묽빓뜞\udea4뢌"
         .length();
      int var10 = 0;
      int var8 = var10001;
      String[] var24 = new String[2];
      short var12 = 27403;
      String[] var9 = var24;
      String var7 = "@Ǹ\u1c8a徹\udce1彽屈Զ籒,峪и㲛ู鳣օ籅~ᴨȜ㶔Ͱ벊ཁ\udce3\u0fcd屌\u0006ᴨ˴\udce9\u0590鲆ȱ峥̵屟Ů㱀ǌ㳠Π\udc9dA峹֕\udc4aÞ屭͔\u1cfcX粏ɹ籚ͽ뱌vﱯl\udce8ཨᲅ\u0379볠m蝸ﹼ릉绳뫵㺠뷦麷뷜鸅뮠빢蝉鸎뢽﹕蝖㺹뫤\ude0c뫰﹢렡师멽\udea8뜆Ế蛌\ude07虘\ude68虱绰蜭ﺽ뭖幌볤︆례\ufe67뤩帋믝纥뫦ﺉ虤Ḁ蘠\ude7c뫹黷룍\udea9릮뺥뤌㸏蝠鹽蜉\ude18룵庨蟶ﺤ몄縁뱠㹦먱㸌뱥뺧뵾麷뮼\ufe1c믈繾믹븍붽纺믞ﺴ虄㸜뵘Ṻ묁縏몝ṗ밦뺺蚄师멨繗렡㸂묽빓뜞\udea4뢌";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 79;
               case 1 -> 137;
               case 2 -> 86;
               case 3 -> 235;
               case 4 -> 234;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIlI = var9;
      IIll = new Object[var9.length];
      int var21 = 0;
      int var25 = 0;
      byte[] var10002 = "ÿ\u0016\u001c\u0087±·2#ÖH\u009ao\u000b Ã½åI\f\u0084\u0088\nÚ'\u008aï\u0097\u001aH\u001c\u0096µ\u0003\u0006E\u0090§á\u0083\u0084|ðåð\u0002Ùç\u0090t%\u001be9,¾\u0000ÐÁ\u0013Ùç\u009f Ö1§$Tý1Î¨Í \u0017Þé-\u0081z\u0003íÒB÷\u008aô!\u008aüb\u009d]} ¬\u0092\u0094²âíÎv\u008f½û\u007fh%L>âý\u001di£/\t\u0012ùØ#Úî4\u0010[ ¿|w¹\u0093²XÂ\u0006p\u0018¹3ÑI0zóÕ/O®*µ5¹<\u009a\u0096¼P&\u0014²¡SI\u0098I¦\u000b\u0098\u001dZ£äïÔ×óë.ì·\u0094\u009eýÌ\u0010\u0014\t\u0005ULf\u0085~Æ\u0091ZÍù\u0084ð\u001c\u0014\u0085\nº3A\u0004ÿæke5µ[Õ\u0087¿\"g¯}Äívª\rÝep\u001bÁ\u000fP\u0093oR\f®\"`Ñ\u0082U\u008e?\u0094|Ç2]g\u0099\u001a\u0013Ù\u0099\u0084ñ0L3\u008cb¿p¬\u0004,Þhµaì¥ç÷\u0011,>&àÅ¤|ô\u0089\u0000½ñnx«ðÖ\tÒV×¨Øág½?P\u009bJI\u0090\u009d\u0095\u001a[\u0080øaâV\u0003³\u007f\u000e/Jî\u009b\u001bá´hêÞ\\ijûS¹¨0\u0098.ª»ÉU¡Ò\u009c·JUY`º\u008cjrfA¾\u009e\u00ad&å\u007fô\u0014\u0004Iñ\u0007\u0087~ú\u0015EQFí¸\u0000£\u008aØ¾@\u008b\u008fäHä\u0088\u007f¢\f¹\tÂ(\u0085§Vê÷s\u0002Û\u0084ó¤*dFµÑ>\u0017t;|Pë¶^8\u009fzá½\u0012¢}\u007f¯\u008dq\u0014w\u008cdÚ`ÞQÿ\tÓYlDS]`qÊÙÊò2&\u0093îaM\u0016½®/ \u00004 \u0002YÅ9Ê\u0007\u000b\u009d\u0097\u0005K\u0001å^y=\u000eÎ¿ v3\u0019 ù\u0082X5\u0017:$üÁX>\u001apÐeB+\u0000\u0001he:\u001c\u0098\u00020mâ\u0091\u000bÚûs\t~F¡\u0006ç\u0097Þ\u0086äJ®\u0016\u0000\fÀtP\u00adsÓÓ·¤ï\nB34\u008dUµ\u0097Á\u0000ê\u001726GÕ~A\u00077\u0012Q'\u0095\u0089!\u0090,\u00940?Å\n!+ã²n\u0005®6³¨øÜu\u0000-\u0018ü\u009dRQ\u0001Õ(¦x\u008a\u0003\u009eÿÆ×Ö.l\u001fváÀ÷OîÁÓÜ\u008caéã\u000e ewó©m{\u0006\u000b\u0087\u0093{/-\u001dÇ\u0099ADb¢ÝåEG'ËA\u0094Ö¶#É*Ù5tìíö\u0005öÅ!Âßõ¡[Öf´\u0097aýVû»òOñaSr§+Êm~l³Ù\u001axÎsÑ3A¢§\u008cóKù\u0003\b¬\"\u0082\u0086×Ð\u0012Â\u0085\u008c^×86\u007f\u0005s³çQ\t\u0013I¢Q\u0003\"Ôu¶ÿØª92{È\u0006M,\u0094\u0015]\u0080\u0003\u0093ÁNÝF3Ó<\u0084Èí\u0083µKèÖg³15Pn\u001e>í\u0002Gz\u00adjVÏ¨Òý{\u0007\u000eÈ:'\u0095 ¡û{\u0080);ñøWùõ¤l8Ó±ë$Ûá@ar\u0094å\u008f7q\u0092ç£\u0088\u0098w\u001a°|2¦f\u0011+b(\u0098¶\u001e\u0082\u0097°\u0019quÄê\u0004ðw\u0099]LM\u0011\u007fc+¬\u0004+\u0002ïU\u0090$E¶/«¢÷¬¨\u0002I\u0000&\u001bw\u001d\f\u008fûÛUâ\u0011\u0084(\u0084?)\u0088=\u008c\u0002ü>¿\u0003\u0088,µ\u0083\u0090áKò{1\u009d\u0007uDÒÄ\u008fÖ\u008e\u0007§\u0087í\u001e\u000b\u0087ë/\u00922\u008d\u001dMýäî'Ô¥&öP\u0093È\u009a\u00871s\u0081\u0081V\u0096<\u0007,PV±Ã,é±Ï\u009bÓÕê \bÈDÆ\u000e,\u001d\u009b0\u0097>5)@\u0096>oáâï\u00adðOØ$ÿsÇÙ{óªêËw\u0095Ì[YpüHSR'äxl\u009cì\u001eÑ\u0011S\u000b-Õá¨,hàô\u0091y\u0007\u0011\u0011aU\u0004©[\\·R\u001c·æë\u0087\rcbgv§çUÄÑ\u0094`)OÏçÚµ×ýfá¶¹p\u0010<\u0096î¢î³¶ \u008dh${]Î\u00ad\u0085ë@&ñLv\u0005\u0094g\u0018\u009c\u001arÚä Ö\tLÔ\u0014\u00008³\u00053:\u0016\u0090\u0004\u0087_:=w{\b\"³'X"
         .getBytes("ISO-8859-1");
      IIIl = new int[289];

      int var56;
      do {
         IIIl[var21] = ((var10002[var25] & 255) << 24 | (var10002[var25 + 1] & 255) << 16 | (var10002[var25 + 2] & 255) << 8 | var10002[var25 + 3] & 255)
            ^ -556528672;
         var21 += 1;
         var56 = var25 + 4;
         var25 += 4;
      } while (var56 < var10002.length);

      String[] var5 = new String[IllI(1795992785, var17 ^ 1249269020)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = Illl(var17 ^ -1961404466, '轿', '킝')).length();
      int var1 = IllI(1795992790, var17 ^ 1865307993);
      int var19 = -1;

      label102:
      while (true) {
         var21 = IllI(1795992791, var17 ^ -1262711457);
         String var28 = var2.substring(++var19, var19 + var1);
         byte var40 = -1;

         while (true) {
            label97: {
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
                     break label97;
                  }

                  var82 = var58;
                  var70 = var21;
                  var89 = var6;
               }

               while (true) {
                  var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % IllI(1795992795, var17 ^ -1006310006)) {
                     case 0 -> IllI(1795992792, var17 ^ 108811825);
                     case 1 -> IllI(1795992793, var17 ^ -707517935);
                     case 2 -> IllI(1795992798, var17 ^ -593476298);
                     case 3 -> IllI(1795992799, var17 ^ -274538270);
                     case 4 -> IllI(1795992796, var17 ^ -669013779);
                     case 5 -> IllI(1795992797, var17 ^ -504394537);
                     default -> IllI(1795992802, var17 ^ -30682967);
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
                     Ill = var5;
                     IlI = new String[IllI(1795992794, var17 ^ -1432525922)];
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var63;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label102;
                  }

                  var4 = (var2 = Illl(var17 ^ -1385417022, 'ᓌ', '킜')).length();
                  var1 = IllI(1795992788, var17 ^ 305492745);
                  var19 = -1;
            }

            var21 = IllI(1795992789, var17 ^ -1665267997);
            var28 = var2.substring(++var19, var19 + var1);
            var40 = 0;
         }
      }
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (!this.IIl(var1)) {
         this.Ill(var1);
         this.lII();
         this.IIII = false;
      }
   }

   private static int IllI(int var0, int var1) {
      int var2 = IIIl[var0 ^ 1795993026] ^ var1 ^ var0;
      var2 += 57715;
      var2 ^= 22837;
      var2 -= 54905;
      var2 += 20727;
      var2 ^= 46206;
      return var2 + 31274;
   }

   public boolean l() {
      return this.II != lIllIlI.l;
   }

   private void Ill(class_310 var1) {
      if (this.III.IllI()
         && var1 != null
         && var1.field_1724 != null
         && this.llI >= 0
         && this.llI < IllI(1795993037, 1743408054 ^ -900546066)
         && this.llI != this.lII) {
         k74.x.IIll.lIIIlII(var1, this.llI, true);
         k74.x.IIll.IllIIII(var1);
      }
   }

   private void lII() {
      this.II = lIllIlI.l;
      this.lI = 0L;
      this.llI = -1;
      this.lII = -1;
      this.Il = null;
      this.I = -1;
   }

   private int lIl(class_746 var1, lI var2) {
      class_1661 var3 = var1.method_31548();

      for (int var4 = 0; var4 < IllI(1795993042, -2012603112 ^ -209021987); var4++) {
         class_1799 var5 = var3.method_5438(var4);
         if (var2 == k74.x.lI.l && this.llI(var5)) {
            return var4;
         }

         if (var2 == k74.x.lI.I && this.Il(var5)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean llI(class_1799 var1) {
      return var1 != null && !var1.method_7960() && var1.method_31574(class_1802.field_8833);
   }

   private boolean lll(class_310 var1, lI var2) {
      class_746 var3 = var1.field_1724;
      if (var2 == k74.x.lI.l && this.III(var3)) {
         return false;
      } else if (var2 == k74.x.lI.I && this.ll(var3)) {
         return false;
      } else {
         int var4 = this.lIl(var3, var2);
         if (var4 < 0) {
            return false;
         } else {
            class_1661 var5 = var3.method_31548();
            this.llI = k74.x.IIll.IIlII(var5);
            this.lII = var4;
            this.Il = var2;
            long var6 = this.IIII();
            if (var6 <= 0L) {
               this.IIIl(var1);
            } else {
               this.II = lIllIlI.I;
               this.lI = System.currentTimeMillis() + var6;
            }

            return true;
         }
      }
   }

   private long IIII() {
      double var1 = this.ll.IIlI();
      double var3 = this.ll.IlI();
      return var1 == var3 ? Math.max(0L, Math.round(var1)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var1, var3)));
   }

   private static String Illl(int var0, char var1, char var2) {
      int var3 = var2 ^ '킝';
      char[] var4 = IIlI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 22575;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 12362;
         var10 -= 38114;
         var10 -= 46765;
         var10 -= 5243;
         var10 ^= 64890;
         var10 ^= 39865;
         var10 += 61708;
         var10 ^= 15089;
         var10 -= 35311;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private void IIIl(class_310 var1) {
      if (this.lI(var1) && !var1.field_1724.method_6115()) {
         int var2 = k74.x.IIll.IIlII(var1.field_1724.method_31548());
         if (var2 != this.lII) {
            k74.x.IIll.lIIIlII(var1, this.lII, true);
            k74.x.IIll.IllIIII(var1);
         }

         if (k74.x.IIll.IIllll(var1, this.lII)) {
            this.II = lIllIlI.Il;
            this.I = var1.field_1724.field_6012;
         } else if (var2 != this.lII) {
            this.II = lIllIlI.I;
            this.lI = System.currentTimeMillis();
         } else {
            this.Ill(var1);
            this.lII();
         }
      } else {
         this.Ill(var1);
         this.lII();
      }
   }

   @Override
   public void llIl() {
      this.Ill(class_310.method_1551());
      this.lII();
      this.IIII = false;
   }

   @Override
   public String IlIIl() {
      return null;
   }

   public boolean IIlI() {
      return this.lIl.IllI();
   }

   @Override
   public void IllIll(class_310 var1) {
      if (!this.IIl(var1)) {
         this.Ill(var1);
         this.lII();
         this.IIII = false;
      } else if (this.II == lIllIlI.I) {
         if (System.currentTimeMillis() >= this.lI) {
            this.IIIl(var1);
         }
      } else if (this.II != lIllIlI.Il) {
         if (!this.lIl.IllI() || !this.II(var1) || !this.lll(var1, k74.x.lI.I)) {
            this.I(var1);
         }
      } else {
         boolean var2 = this.Il == k74.x.lI.I && this.ll(var1.field_1724) || this.Il == k74.x.lI.l && this.III(var1.field_1724);
         if (var2 || this.I > 0 && var1.field_1724.field_6012 - this.I > 2) {
            this.Ill(var1);
            this.lII();
         }
      }
   }

   private static String IIll(int var0, int var1) {
      int var9 = -1731370375;
      int var2 = (var0 ^ IllI(1795993043, var9 ^ 802879063)) & IllI(1795993040, var9 ^ -524951758);
      if (IlI[var2] == null) {
         char[] var3 = Ill[var2].toCharArray();

         int var4 = switch (var3[0] & IllI(1795993041, var9 ^ 1002879639)) {
            case 0 -> IllI(1795993046, var9 ^ -788063423);
            case 1 -> IllI(1795993047, var9 ^ 627167121);
            case 2 -> IllI(1795993044, var9 ^ 1477880665);
            case 3 -> IllI(1795993045, var9 ^ -1885902807);
            case 4 -> IllI(1795993050, var9 ^ 1082030977);
            case 5 -> IllI(1795993051, var9 ^ 1059372661);
            case 6 -> IllI(1795993048, var9 ^ 1863431707);
            case 7 -> IllI(1795993049, var9 ^ -140052973);
            case 8 -> 4;
            case 9 -> IllI(1795993054, var9 ^ 804757602);
            case 10 -> IllI(1795993055, var9 ^ -35509980);
            case 11 -> IllI(1795993052, var9 ^ 180950001);
            case 12 -> IllI(1795993053, var9 ^ -419786073);
            case 13 -> IllI(1795993058, var9 ^ 1838595948);
            case 14 -> IllI(1795993059, var9 ^ 1096323389);
            case 15 -> 1;
            case 16 -> IllI(1795993056, var9 ^ -728030423);
            case 17 -> IllI(1795993057, var9 ^ -516193815);
            case 18 -> IllI(1795993062, var9 ^ -1474749389);
            case 19 -> IllI(1795993063, var9 ^ -1656429580);
            case 20 -> IllI(1795993060, var9 ^ -413928358);
            case 21 -> IllI(1795993061, var9 ^ 1146525855);
            case 22 -> IllI(1795993066, var9 ^ -967206216);
            case 23 -> IllI(1795993067, var9 ^ -1686994811);
            case 24 -> IllI(1795993064, var9 ^ -646785947);
            case 25 -> IllI(1795993065, var9 ^ 1896862803);
            case 26 -> IllI(1795993070, var9 ^ 85533256);
            case 27 -> IllI(1795993071, var9 ^ 1046306211);
            case 28 -> IllI(1795993068, var9 ^ 791073894);
            case 29 -> IllI(1795993069, var9 ^ -605053898);
            case 30 -> IllI(1795993074, var9 ^ -1267746895);
            case 31 -> IllI(1795993075, var9 ^ 1135736324);
            case 32 -> IllI(1795993072, var9 ^ 1444599146);
            case 33 -> IllI(1795993073, var9 ^ 1474327328);
            case 34 -> IllI(1795993078, var9 ^ -1813104993);
            case 35 -> IllI(1795993079, var9 ^ -1181872606);
            case 36 -> IllI(1795993076, var9 ^ -1992342637);
            case 37 -> 2;
            case 38 -> IllI(1795993077, var9 ^ -259222287);
            case 39 -> IllI(1795993082, var9 ^ 369606556);
            case 40 -> IllI(1795993083, var9 ^ -549999517);
            case 41 -> IllI(1795993080, var9 ^ -919878040);
            case 42 -> IllI(1795993081, var9 ^ 1099273838);
            case 43 -> IllI(1795993086, var9 ^ 2093570926);
            case 44 -> IllI(1795993087, var9 ^ 1354712945);
            case 45 -> IllI(1795993084, var9 ^ 1184365809);
            case 46 -> IllI(1795993085, var9 ^ -1886608729);
            case 47 -> IllI(1795992962, var9 ^ -1053601504);
            case 48 -> IllI(1795992963, var9 ^ 601523511);
            case 49 -> IllI(1795992960, var9 ^ 1586001637);
            case 50 -> IllI(1795992961, var9 ^ 2129598231);
            case 51 -> IllI(1795992966, var9 ^ -1168136712);
            case 52 -> IllI(1795992967, var9 ^ 1997356671);
            case 53 -> IllI(1795992964, var9 ^ -19599397);
            case 54 -> IllI(1795992965, var9 ^ 391033932);
            case 55 -> IllI(1795992970, var9 ^ 1542161942);
            case 56 -> IllI(1795992971, var9 ^ -1131180028);
            case 57 -> IllI(1795992968, var9 ^ 81992496);
            case 58 -> IllI(1795992969, var9 ^ 88335139);
            case 59 -> IllI(1795992974, var9 ^ -1252526477);
            case 60 -> IllI(1795992975, var9 ^ 1235317339);
            case 61 -> IllI(1795992972, var9 ^ 1333777184);
            case 62 -> IllI(1795992973, var9 ^ 1376954605);
            case 63 -> IllI(1795992978, var9 ^ -2065073655);
            case 64 -> IllI(1795992979, var9 ^ -591105676);
            case 65 -> IllI(1795992976, var9 ^ 1240521306);
            case 66 -> IllI(1795992977, var9 ^ -1174399115);
            case 67 -> IllI(1795992982, var9 ^ -1149226455);
            case 68 -> IllI(1795992983, var9 ^ 1799551028);
            case 69 -> 5;
            case 70 -> IllI(1795992980, var9 ^ -62885213);
            case 71 -> IllI(1795992981, var9 ^ -2025133701);
            case 72 -> IllI(1795992986, var9 ^ 1705078467);
            case 73 -> IllI(1795992987, var9 ^ -1303362398);
            case 74 -> IllI(1795992984, var9 ^ -1601402688);
            case 75 -> IllI(1795992985, var9 ^ 1279782446);
            case 76 -> IllI(1795992990, var9 ^ -1390486346);
            case 77 -> IllI(1795992991, var9 ^ -1692676281);
            case 78 -> 3;
            case 79 -> IllI(1795992988, var9 ^ -1408180864);
            case 80 -> IllI(1795992989, var9 ^ -2085759410);
            case 81 -> IllI(1795992994, var9 ^ -766950516);
            case 82 -> IllI(1795992995, var9 ^ 1823097406);
            case 83 -> IllI(1795992992, var9 ^ 916597778);
            case 84 -> IllI(1795992993, var9 ^ -1387739000);
            case 85 -> IllI(1795992998, var9 ^ -618065055);
            case 86 -> IllI(1795992999, var9 ^ 1975374087);
            case 87 -> IllI(1795992996, var9 ^ -1578626501);
            case 88 -> IllI(1795992997, var9 ^ 558818055);
            case 89 -> IllI(1795993002, var9 ^ -1805718872);
            case 90 -> IllI(1795993003, var9 ^ -979435358);
            case 91 -> IllI(1795993000, var9 ^ -2113892895);
            case 92 -> IllI(1795993001, var9 ^ -361385031);
            case 93 -> IllI(1795993006, var9 ^ 1878628789);
            case 94 -> IllI(1795993007, var9 ^ -1387969426);
            case 95 -> IllI(1795993004, var9 ^ -962771661);
            case 96 -> IllI(1795993005, var9 ^ 143386061);
            case 97 -> IllI(1795993010, var9 ^ 769858058);
            case 98 -> IllI(1795993011, var9 ^ -1095853119);
            case 99 -> IllI(1795993008, var9 ^ -1298460934);
            case 100 -> IllI(1795993009, var9 ^ 404290332);
            case 101 -> IllI(1795993014, var9 ^ 1090869889);
            case 102 -> IllI(1795993015, var9 ^ -1000958528);
            case 103 -> IllI(1795993012, var9 ^ -219480635);
            case 104 -> IllI(1795993013, var9 ^ -793575782);
            case 105 -> IllI(1795993018, var9 ^ 418132074);
            case 106 -> IllI(1795993019, var9 ^ 1173254393);
            case 107 -> IllI(1795993016, var9 ^ 934588492);
            case 108 -> IllI(1795993017, var9 ^ -601590136);
            case 109 -> IllI(1795993022, var9 ^ -1529339163);
            case 110 -> IllI(1795993023, var9 ^ 728273249);
            case 111 -> IllI(1795993020, var9 ^ -976163370);
            case 112 -> IllI(1795993021, var9 ^ 330495845);
            case 113 -> IllI(1795992898, var9 ^ -1573213036);
            case 114 -> IllI(1795992899, var9 ^ -102053735);
            case 115 -> IllI(1795992896, var9 ^ -1211050560);
            case 116 -> IllI(1795992897, var9 ^ -790977469);
            case 117 -> IllI(1795992902, var9 ^ 1138824056);
            case 118 -> IllI(1795992903, var9 ^ -1579006611);
            case 119 -> IllI(1795992900, var9 ^ 1944858150);
            case 120 -> IllI(1795992901, var9 ^ 208415780);
            case 121 -> IllI(1795992906, var9 ^ 2096970505);
            case 122 -> IllI(1795992907, var9 ^ 312437746);
            case 123 -> IllI(1795992904, var9 ^ -1590093262);
            case 124 -> IllI(1795992905, var9 ^ 1980089270);
            case 125 -> IllI(1795992910, var9 ^ -505527136);
            case 126 -> IllI(1795992911, var9 ^ 1736247526);
            case 127 -> IllI(1795992908, var9 ^ 956169117);
            case 128 -> IllI(1795992909, var9 ^ -1790986324);
            case 129 -> IllI(1795992914, var9 ^ -706880743);
            case 130 -> IllI(1795992915, var9 ^ -176209678);
            case 131 -> IllI(1795992912, var9 ^ 1120382757);
            case 132 -> IllI(1795992913, var9 ^ -315739787);
            case 133 -> IllI(1795992918, var9 ^ -116818958);
            case 134 -> IllI(1795992919, var9 ^ -683340393);
            case 135 -> IllI(1795992916, var9 ^ 2048124776);
            case 136 -> IllI(1795992917, var9 ^ -758656728);
            case 137 -> IllI(1795992922, var9 ^ 1337497847);
            case 138 -> IllI(1795992923, var9 ^ 130260253);
            case 139 -> IllI(1795992920, var9 ^ 1491641818);
            case 140 -> IllI(1795992921, var9 ^ 339549789);
            case 141 -> IllI(1795992926, var9 ^ -1091285557);
            case 142 -> IllI(1795992927, var9 ^ 303924846);
            case 143 -> IllI(1795992924, var9 ^ 322508038);
            case 144 -> 0;
            case 145 -> IllI(1795992925, var9 ^ -1291637929);
            case 146 -> IllI(1795992930, var9 ^ -225555211);
            case 147 -> IllI(1795992931, var9 ^ 2072395805);
            case 148 -> IllI(1795992928, var9 ^ -647144760);
            case 149 -> IllI(1795992929, var9 ^ -37235627);
            case 150 -> IllI(1795992934, var9 ^ 1269464844);
            case 151 -> IllI(1795992935, var9 ^ 1882644033);
            case 152 -> IllI(1795992932, var9 ^ -1781726462);
            case 153 -> IllI(1795992933, var9 ^ 1178369650);
            case 154 -> IllI(1795992938, var9 ^ 465572028);
            case 155 -> IllI(1795992939, var9 ^ -1509435759);
            case 156 -> IllI(1795992936, var9 ^ -686027584);
            case 157 -> IllI(1795992937, var9 ^ 271924712);
            case 158 -> IllI(1795992942, var9 ^ -1992511657);
            case 159 -> IllI(1795992943, var9 ^ 1166752172);
            case 160 -> IllI(1795992940, var9 ^ 693189612);
            case 161 -> IllI(1795992941, var9 ^ 596351686);
            case 162 -> IllI(1795992946, var9 ^ 1975583286);
            case 163 -> IllI(1795992947, var9 ^ -1400472988);
            case 164 -> IllI(1795992944, var9 ^ -929953849);
            case 165 -> IllI(1795992945, var9 ^ 64518791);
            case 166 -> IllI(1795992950, var9 ^ 1969633930);
            case 167 -> IllI(1795992951, var9 ^ 736739619);
            case 168 -> IllI(1795992948, var9 ^ -261599298);
            case 169 -> IllI(1795992949, var9 ^ 49936822);
            case 170 -> IllI(1795992954, var9 ^ 1588862688);
            case 171 -> IllI(1795992955, var9 ^ -460046752);
            case 172 -> IllI(1795992952, var9 ^ 1628203536);
            case 173 -> IllI(1795992953, var9 ^ -1046254604);
            case 174 -> IllI(1795992958, var9 ^ -775414284);
            case 175 -> IllI(1795992959, var9 ^ 1679102313);
            case 176 -> IllI(1795992956, var9 ^ -338120137);
            case 177 -> IllI(1795992957, var9 ^ -727193480);
            case 178 -> IllI(1795992834, var9 ^ -944325763);
            case 179 -> IllI(1795992835, var9 ^ 1093371752);
            case 180 -> IllI(1795992832, var9 ^ -1797724085);
            case 181 -> IllI(1795992833, var9 ^ 1445078108);
            case 182 -> IllI(1795992838, var9 ^ 1738593245);
            case 183 -> IllI(1795992839, var9 ^ -1252394859);
            case 184 -> IllI(1795992836, var9 ^ -2105223389);
            case 185 -> IllI(1795992837, var9 ^ 1072205487);
            case 186 -> IllI(1795992842, var9 ^ 2139135647);
            case 187 -> IllI(1795992843, var9 ^ 2050504029);
            case 188 -> IllI(1795992840, var9 ^ -706474834);
            case 189 -> IllI(1795992841, var9 ^ -176284711);
            case 190 -> IllI(1795992846, var9 ^ 697387425);
            case 191 -> IllI(1795992847, var9 ^ -384093812);
            case 192 -> IllI(1795992844, var9 ^ 723479946);
            case 193 -> IllI(1795992845, var9 ^ -365332041);
            case 194 -> IllI(1795992850, var9 ^ -164550415);
            case 195 -> IllI(1795992851, var9 ^ -1281860396);
            case 196 -> IllI(1795992848, var9 ^ 1574812071);
            case 197 -> IllI(1795992849, var9 ^ 893993151);
            case 198 -> IllI(1795992854, var9 ^ -1510967228);
            case 199 -> IllI(1795992855, var9 ^ -531845157);
            case 200 -> IllI(1795992852, var9 ^ -108467178);
            case 201 -> IllI(1795992853, var9 ^ 1693825421);
            case 202 -> IllI(1795992858, var9 ^ 1660139712);
            case 203 -> IllI(1795992859, var9 ^ 369151320);
            case 204 -> IllI(1795992856, var9 ^ -1519151955);
            case 205 -> IllI(1795992857, var9 ^ -1610893618);
            case 206 -> IllI(1795992862, var9 ^ -112800474);
            case 207 -> IllI(1795992863, var9 ^ -804938629);
            case 208 -> IllI(1795992860, var9 ^ -156332719);
            case 209 -> IllI(1795992861, var9 ^ 2034777621);
            case 210 -> IllI(1795992866, var9 ^ 2062060986);
            case 211 -> IllI(1795992867, var9 ^ -185483531);
            case 212 -> IllI(1795992864, var9 ^ -563793348);
            case 213 -> IllI(1795992865, var9 ^ -2029464264);
            case 214 -> IllI(1795992870, var9 ^ -93391126);
            case 215 -> IllI(1795992871, var9 ^ 1524057472);
            case 216 -> IllI(1795992868, var9 ^ 785677246);
            case 217 -> IllI(1795992869, var9 ^ 1523027651);
            case 218 -> IllI(1795992874, var9 ^ 1108053763);
            case 219 -> IllI(1795992875, var9 ^ -1445243763);
            case 220 -> IllI(1795992872, var9 ^ -1481762045);
            case 221 -> IllI(1795992873, var9 ^ 1564231594);
            case 222 -> IllI(1795992878, var9 ^ 1970087050);
            case 223 -> IllI(1795992879, var9 ^ -647159128);
            case 224 -> IllI(1795992876, var9 ^ 1087915375);
            case 225 -> IllI(1795992877, var9 ^ -1625890935);
            case 226 -> IllI(1795992882, var9 ^ -180458247);
            case 227 -> IllI(1795992883, var9 ^ 616192519);
            case 228 -> IllI(1795992880, var9 ^ 1215040072);
            case 229 -> IllI(1795992881, var9 ^ 1399483853);
            case 230 -> IllI(1795992886, var9 ^ -286398215);
            case 231 -> IllI(1795992887, var9 ^ -2074408303);
            case 232 -> IllI(1795992884, var9 ^ 995816613);
            case 233 -> IllI(1795992885, var9 ^ 20894102);
            case 234 -> IllI(1795992890, var9 ^ -635207758);
            case 235 -> IllI(1795992891, var9 ^ -590928153);
            case 236 -> IllI(1795992888, var9 ^ -495061064);
            case 237 -> IllI(1795992889, var9 ^ -72635023);
            case 238 -> IllI(1795992894, var9 ^ -1123341535);
            case 239 -> IllI(1795992895, var9 ^ 2132445114);
            case 240 -> IllI(1795992892, var9 ^ -166348207);
            case 241 -> IllI(1795992893, var9 ^ 194066971);
            case 242 -> IllI(1795992770, var9 ^ 941735753);
            case 243 -> IllI(1795992771, var9 ^ 514876415);
            case 244 -> IllI(1795992768, var9 ^ 782408341);
            case 245 -> IllI(1795992769, var9 ^ -183586312);
            case 246 -> IllI(1795992774, var9 ^ 1309071017);
            case 247 -> IllI(1795992775, var9 ^ -1011236151);
            case 248 -> IllI(1795992772, var9 ^ 118133427);
            case 249 -> IllI(1795992773, var9 ^ -1173631486);
            case 250 -> IllI(1795992778, var9 ^ -1410475738);
            case 251 -> IllI(1795992779, var9 ^ -1279377909);
            case 252 -> IllI(1795992776, var9 ^ -1984528588);
            case 253 -> IllI(1795992777, var9 ^ -832775091);
            case 254 -> IllI(1795992782, var9 ^ 1441246046);
            default -> IllI(1795992783, var9 ^ -1248038935);
         };
         int var5 = (var1 & IllI(1795992780, var9 ^ -2026902684)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IllI(1795992781, var9 ^ 1295812158)) >>> IllI(1795992786, var9 ^ 892369976)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IllI(1795992787, var9 ^ 797825881);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IllI(1795992784, var9 ^ 1805331152);
            }
         }

         IlI[var2] = new String(var3).intern();
      }

      return IlI[var2];
   }

   @Override
   public void llIIII(class_310 var1) {
      if (this.II == lIllIlI.Il) {
         boolean var2 = this.Il == k74.x.lI.I && this.ll(var1.field_1724) || this.Il == k74.x.lI.l && this.III(var1.field_1724);
         if (var2 || this.I > 0 && var1.field_1724.field_6012 - this.I > 2) {
            this.Ill(var1);
            this.lII();
         }
      }
   }

   public boolean IlII(class_310 var1) {
      return this.IIl(var1) && this.II == lIllIlI.l ? this.lll(var1, k74.x.lI.I) : false;
   }

   public boolean IlIl(class_310 var1, class_1309 var2) {
      return this.IIIIlIl() && this.II != lIllIlI.l;
   }
}
