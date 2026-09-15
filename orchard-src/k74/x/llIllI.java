package k74.x;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class llIllI extends IlIIIIIIl implements IIIIIlII {
   private static final Object[] lIl;
   private static final String[] I;
   private final IIlIII II;
   private final lllIIlII Il;
   private static final int[] Ill;
   private static final String[] lII;
   private final IIlIII lI;
   private final IIIlIIII ll;
   private final IIlIII III;
   private static final String[] IIl;
   private final Supplier<List<IlIIIIIIl>> IlI;

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      if (this.IIIIlIl()) {
         this.l(var1, false);
      }
   }

   @Override
   public double IIllI() {
      return this.Il(class_310.method_1551(), this.I()).l * this.III();
   }

   private static int IIl(int var0, int var1) {
      int var2 = Ill[var0 ^ 1821061314] ^ var1 ^ var0;
      var2 += 23873;
      var2 += 58040;
      var2 += 35528;
      var2 -= 41428;
      var2 ^= 2586;
      var2 -= 43656;
      var2 -= 42067;
      return var2 + 332;
   }

   @Override
   public double IIIl() {
      return this.Il(class_310.method_1551(), this.I()).I * this.III();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 606020529;
      int var10001 = "\u0087뎟蘼댒왞뉕嚙낿\ue636먒癗댥皚럿똺뱒뙟럵ꚟ눏☼묂㙝듕蚑눏䘷뾲ٟ똥嚙닯㘿븢Ꙟ띅\ue693붏蘹뀒㙒붕ڞ뇟阳볢噞됅皚낯瘻늂활듥\ue69a딯ؽ뒲晙끕嚛뗿\ua636덲♞낕㚖둏昳뤂\uf652눵뚛돟☾떲虝믕뚕륟㘳렒♟맥횟렏ؿ뒒晜륥㚕뷏阰뜒ꙑ빥㚙봯䘿볲왙뗕⚐룯\ue63f돒陜됵暒랯똾뼂뙜뷵暛뚯ض뗒\uf65a끵횙둏㘵뻲虗똕뚑뱿蘹묲䙑뗅욘벯䘷밲\u0015멿嘶봒왑멥䚟벯㘳볢ᙜ륵蚔늿昹늢虐됕\ue69d륟\ue638묲"
         .length();
      short var18 = 22821;
      int var14 = var10001;
      int var17 = 0;
      String var13 = "\u0087뎟蘼댒왞뉕嚙낿\ue636먒癗댥皚럿똺뱒뙟럵ꚟ눏☼묂㙝듕蚑눏䘷뾲ٟ똥嚙닯㘿븢Ꙟ띅\ue693붏蘹뀒㙒붕ڞ뇟阳볢噞됅皚낯瘻늂활듥\ue69a딯ؽ뒲晙끕嚛뗿\ua636덲♞낕㚖둏昳뤂\uf652눵뚛돟☾떲虝믕뚕륟㘳렒♟맥횟렏ؿ뒒晜륥㚕뷏阰뜒ꙑ빥㚙봯䘿볲왙뗕⚐룯\ue63f돒陜됵暒랯똾뼂뙜뷵暛뚯ض뗒\uf65a끵횙둏㘵뻲虗똕뚑뱿蘹묲䙑뗅욘벯䘷밲\u0015멿嘶봒왑멥䚟벯㘳볢ᙜ륵蚔늿昹늢虐됕\ue69d륟\ue638묲";
      int var16 = 0;
      String[] var15 = new String[2];

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 201;
               case 1 -> 131;
               case 2 -> 148;
               case 3 -> 229;
               case 4 -> 51;
               case 5 -> 32;
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

      lII = var15;
      lIl = new Object[var15.length];
      int var9 = -1175994196;
      byte[] var7 = "w\u0088íUüÇÊã\u00118¹«h°>_\u0084\u0016\u009d\u001fD9H\u0091yLGêeº\u0003\b\u0091f Èy\u008eËß\fj\u009aækNç°\u008e½EC×.\u001aÜÜI*Þ\u0016ç©DÆÿ?û\u009cPÔ\u0090vZzda`#\u0093ß\u0019±7Ó\u001d²\u0095,ïÛ\u0007 \u0002\r[:\u0086'Ò\u0007Â\u000es[fÓgfJ¹hÛÆý^vP|ôX!\u0007O\u0017»flzØ\u008bD\u0000Én\u0087°#A_\r\u0002»\u0007¢ÿ'\u00adR\u0091³\u0000\u0095²cG\u0002I\u00ad½\u007f\fT¿)ÖÍ\bx<î÷\u00ad\u00ad[Ü\u008a#\u0093\u0089\u0016{!dòö\u0099\u0000\u001b\u0085$9ð¥J>M\n4¼¤\u0088»q\u0000«\u0097\u0014\u000e\u001eð\u0098\\¥k\u0095n4\u0095¤°n\u00ad\u009a$uS)¡\u00922ÇK\u0097z\u0000\u009d\\A\u0082òõÍ\u0090\u001eÐ5\u001a÷þºçFmBÃ\u009fÑcÐi²\f\u001a\u008dÉô_?\u0003\u0094'],?\u0003\u0018\tâÆ|\u0018-,\u0086¦3q\u0087\bí¹\u0016\u0016XÇÈg1VN!×\u008b\u0097üôª\u0090W\u0091\u0096)Ý)Ö\u00127'\u0087\u0003`\u0086ê¡÷\u0084_ñ-\u0097øÛx\u000b½¥¥äX]èî0åµß'c\u0005ø?Öà\u0092jÎ\u009a\u0088m\u0003VR\t\t×o³\u001b\"fá²ålÄ5×\u001dü%i\u0089¢\u000f4\u0091©¦HB\u001c\u00adp\n\u0088\u0010N3\u0019,¢)?Cma\u0088Ý\fø¨T\u0094ß«-ôEø\u001c\u000bF.¨\u009c\u008aàB\u00ad\u009d\u001bèL\u0098B\u001d\u000ey.¶;Íó\u001aÄw\u0087èn-Õ\u0092¯6@¶I¿ÅÈ\u0089\tëüt[k5§_ça×\u000f>~\u0089\u0005Q[ã%\u0083\u008eSü\\®Â¥Tð/\u00adyC^\u001e1\"ø±3Ã\u0001Ï)W!\u0007JÃ\u001d¥[:£\u008a¸Á[¼ÍÁ\u0097ý.ÑÙ\"~U1´Í¤\u0086`@\u00ad8ÔÏ\u007f\u0015ÍÍ\u0088G\u0007Òî\u008e[9å;WT\fp\u0098ô9?\u001d.\u008aW\u009f8\u0011\u0003ü#\u0091Dkà\u009cte}6IK\t\u0091\u0084§W´)\")~éüegÓ@$H\u0092-J>\u0096m×xæ-r/\u0014\u0001\n\u009bÁô/¦a\u009bí\u0098\u0003>öë\u0080R¶h¦z\u000e\u0012\u0092K\u0013ûá\u009b%\u001aáw}¸\u0092Þ\u001dzl\u0095\u0005)q6!\u0084î÷\u0003\u0087ú\u0016Fúáf¶\u009e  jÛÕ^&-®=\u0087\u008a©4÷\u009b\u000ex'Á|JB¹}HÝ\u001a×\u007f\u009d]1NÂ¨ºé\u0085÷\u0010\rãK`çþ¡(Ö\u0007\u0018\u009c'\u0013}\u0095\u0010i\u0014êÆ=ã\u000bÌ\u001b5~á\u0006°ý?âÐ°ß³ñý\u0014Ò'?ý\u0018 ¯ÛÙ¶\\\u0012|êJÏh³÷\u001bß¬\u0085\u00010:\u0099áS¸.pÆ\u0012P\u0097£þ,ìå$4µÛ\u0093ì±\u009e\u008b7.×G\u001d1§\u008f\u0099ôÒ©Zie\u0015i<Ëúo\u000fO8¢â«ñ¦ÿO9FöPÑìÓp\u00adxÜÐ°ØÎUu»\fø´Í®Á\u0018\u0092]\u009e\u008d6b7iy\u001b<ú\u0098Î¦¨\u0002¼(éY\u0081\u0019Í\u0094¥l®vè^*mº3¦ìËr[\u0011Ó\u0014\u009d\u001f«Ú\u0011\u009bm\u0089Vjìí\u0087ÞMØ\u008fíL \u000e\u0014Ì\u000f¢e\u0004|Ù\t´²\u0007cã©E«\u008eD}\u0095zÒ*\u0019[×Ì\u0083\u000e\u001bá\u0095§UÖYXÒ6Dp½/p\u0013ñp\u0090¨\u007f\u0001\u009fS;ô²\u001d\u0003\u0082\u0081JæY®ù\u001dÂÌ\u0019<HOq6\f\u001aÓeFßç\u0019\\@M\u0085QhÔ\u001cÙô+ñ\fR\nL\u009fóVR¹\u0082\u008e\u0012>\u0014æGsØ·¯xf\u0089Î\u0010@\u008f5sÕ\u009eê-\u0006ï«\u000fn\fµhqI/Í\u0017\u001f\u00ad¥\u0015NS\u0000ÍïaW\b\u0088lüÍöÞ¼Ò{\u001eÒÃ4#·Ý\u0003\u009f\u0083Vô\u008b.ÿöß\u0097Ë/\u0018:²f(5ã,f\u0002ÉÌ\u001b\u009a}ô)5\u0091P@»wJ@Ñ3\u0096rï¥\u0003+Û&¯¡¿Üm¿\u0013ÍG5âè²â\u0082\u0092§»\u0001þF\u0017=\u001aYö\u000f¨ÒIC®ë\u0082ïÈì\u0003â'ïi\u0096Igå\u009e\u000fâ\u0017"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      Ill = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         Ill[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[IIl(1821061314, var23 ^ -2030362596)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = Ill((byte)103, (byte)-12, -716105558)).length();
      int var1 = 4;
      int var25 = -1;

      label100:
      while (true) {
         int var28 = IIl(1821061315, var23 ^ 229901878);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label95: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var28;
               var41 = var45;
               var10001 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var48 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label95;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % IIl(1821061319, var23 ^ -1253407276)) {
                     case 0 -> IIl(1821061316, var23 ^ -2009101574);
                     case 1 -> IIl(1821061317, var23 ^ -1798713755);
                     case 2 -> IIl(1821061322, var23 ^ 1612049436);
                     case 3 -> IIl(1821061323, var23 ^ -1996683527);
                     case 4 -> IIl(1821061320, var23 ^ -48670727);
                     case 5 -> IIl(1821061321, var23 ^ -1707266232);
                     default -> IIl(1821061326, var23 ^ 2144242073);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var57 = var41;
                     var10004 = var48;
                     var10006 = var6;
                  }
               }
            }

            String var50 = new String(var41).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var50;
                  if ((var25 += var1) >= var4) {
                     I = var5;
                     IIl = new String[IIl(1821061318, var23 ^ 1969573970)];
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label100;
                  }

                  var4 = (var2 = Ill((byte)37, (byte)-57, -716105557)).length();
                  var1 = IIl(1821061312, var23 ^ -531925778);
                  var25 = -1;
            }

            var28 = IIl(1821061313, var23 ^ -1715211435);
            var30 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   @Override
   public double ll() {
      return this.II.IllI();
   }

   private List<lllIIIIl> I() {
      ArrayList var2 = new ArrayList();
      String[] var10000 = IIllllIl.IIIIl();
      List var3 = this.IlI.get();
      String[] var1 = var10000;
      if (var3 != null && !var3.isEmpty()) {
         for (IlIIIIIIl var5 : var3) {
            if (var5 != null && var5 != this && (var5.IIllIII() || var1 != null) && (!this.Il.IllI() || var5.IIIIlIl() || var1 != null)) {
               IIIlIlIl var6 = var5.IIllIIl();
               String var7 = var6 == null ? "" : var6.llIl();
               if (var7.isBlank()) {
                  var7 = var5.IIIlIlI();
               }

               if (var7 != null && (!var7.isBlank() || var1 != null)) {
                  String var8 = IIll.lI(var5.IlIIlII());
                  if (var8 != null && (!var8.isBlank() || var1 != null)) {
                     var2.add(new lllIIIIl(var7, var8, var5.IIIIlIl()));
                     if (var1 != null) {
                        break;
                     }
                  }
               }
            }
         }

         var2.sort(Comparator.comparing(llIllI::lI, String.CASE_INSENSITIVE_ORDER));
         return var2;
      } else {
         return var2;
      }
   }

   @Override
   public void lllI(double var1, double var3) {
      double var5 = Double.MAX_VALUE;
      double var7 = Double.MAX_VALUE;
      class_310 var9 = class_310.method_1551();
      if (var9 != null && var9.method_22683() != null) {
         var5 = Math.max(0.0, var9.method_22683().method_4486() - this.IIllI());
         var7 = Math.max(0.0, var9.method_22683().method_4502() - this.IIIl());
      }

      this.lI.Ill(Math.max(0.0, Math.min(var1, var5)));
      this.II.Ill(Math.max(0.0, Math.min(var3, var7)));
   }

   @Override
   public void Illl(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.l(var1, var5);
   }

   @Override
   public boolean llII(double var1, double var3) {
      return var1 >= this.lll() && var1 <= this.lll() + this.IIllI() && var3 >= this.ll() && var3 <= this.ll() + this.IIIl();
   }

   public llIllI(Supplier<List<IlIIIIIIl>> var1, IIIlIIII var2) {
      int var3 = -575995371;
      super(
         IlIIllIII.Ill(II(IIl(1821061327, var3 ^ 538312737), IIl(1821061324, var3 ^ 728839728))),
         lllIIlIl.II,
         IlIIllIII.Ill(II(IIl(1821061325, var3 ^ -505433155), IIl(1821061330, var3 ^ -835172057)))
      );
      this.Il = this.IllIIll(new lllIIlII(IlIIllIII.Ill(II(IIl(1821061331, var3 ^ 1802030704), IIl(1821061328, var3 ^ 2124282744))), false));
      this.lI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(II(IIl(1821061329, var3 ^ -1772602973), IIl(1821061334, var3 ^ -673257748))), 24.0, 0.0, 4000.0, 1.0)
            .IIIl(IlIIllIII.Ill(II(IIl(1821061335, var3 ^ 606447740), IIl(1821061332, var3 ^ 606606384))))
      );
      this.II = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(II(IIl(1821061333, var3 ^ -684058715), IIl(1821061338, var3 ^ 843144578))), 120.0, 0.0, 4000.0, 1.0)
            .IIIl(IlIIllIII.Ill(II(IIl(1821061339, var3 ^ -252046177), IIl(1821061336, var3 ^ -1403073860))))
      );
      this.III = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(II(IIl(1821061337, var3 ^ -1854758012), IIl(1821061342, var3 ^ 754895023))), 100.0, 70.0, 180.0, 5.0)
            .IIIl(IlIIllIII.Ill(II(IIl(1821061343, var3 ^ -2123864547), IIl(1821061340, var3 ^ 1357307262))))
      );
      this.IlI = var1;
      this.ll = var2;
   }

   private void l(class_332 var1, boolean var2) {
      int var29 = 2133885959;
      String[] var10000 = IIllllIl.IIIIl();
      class_310 var4 = class_310.method_1551();
      String[] var3 = var10000;
      if (var4.field_1772 != null) {
         label48: {
            List var5 = this.I();
            IIIllIllI var6 = this.Il(var4, var5);
            double var7 = this.lll();
            double var9 = this.ll();
            double var11 = this.III();
            IlIIlllIl.IIllll(var1);
            IlIIlllIl.IlIIlI(var1, var7, var9);
            IlIIlllIl.llIIIl(var1, var11, var11);
            Color var13 = IIIlIllII.l();
            IlIIlllIl.llIl(
               var1, 0.0, 0.0, var6.l, var6.I, 7.0, IIIlIllII.lIII(var2 ? IIl(1821061341, var29 ^ -1108932226) : IIl(1821061346, var29 ^ -796597195))
            );
            double var14 = 16.0;
            double var16 = 18.0;
            double var18 = 7.0;
            double var20 = var18;
            if (var5.isEmpty()) {
               String var22 = IlIIllIII.lI(II(IIl(1821061347, var29 ^ 1433072222), IIl(1821061344, var29 ^ -444537645)));
               double var23 = IlIIlllIl.IIl(var4.field_1772, var22);
               double var25 = Math.max(8.0, (var6.l - var23) * 0.5);
               double var27 = (var6.I - IlIIlllIl.IlIlIl(var4.field_1772)) * 0.5;
               IlIIlllIl.IIll(var1, var4.field_1772, var22, var25, var27, IIIlIllII.ll(IIIlIllII.III(), IIl(1821061345, var29 ^ -1486957367)));
               if (var3 == null) {
                  break label48;
               }
            }

            for (lllIIIIl var31 : var5) {
               IlIIlllIl.llIl(var1, 6.0, var20, var6.l - 12.0, var14, 4.0, IIIlIllII.lIII(IIl(1821061350, var29 ^ 144918744)));
               double var24 = var20 + Math.max(0.0, (var14 - IlIIlllIl.IlIlIl(var4.field_1772)) * 0.5);
               int var26 = var31.l
                  ? IIIlIllII.ll(IIIlIllII.IlII(), IIl(1821061351, var29 ^ -120726293))
                  : IIIlIllII.ll(IIIlIllII.III(), IIl(1821061348, var29 ^ 1072565388));
               int var32 = var31.l
                  ? IIIlIllII.ll(var13, IIl(1821061349, var29 ^ -1474969004))
                  : IIIlIllII.ll(IIIlIllII.III(), IIl(1821061354, var29 ^ -716162182));
               IlIIlllIl.IIll(var1, var4.field_1772, var31.I, 12.0, var24, var26);
               IlIIlllIl.IlI(var1, var4.field_1772, var31.II, var6.l - 12.0, var24, var32);
               var20 += var16;
               if (var3 != null) {
                  break;
               }
            }
         }

         IlIIlllIl.lIIIll(var1);
      }
   }

   private static String II(int var0, int var1) {
      int var9 = -1873578153;
      int var2 = (var0 ^ IIl(1821061355, var9 ^ -1827233142)) & IIl(1821061352, var9 ^ 1023571779);
      if (IIl[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & IIl(1821061353, var9 ^ -393033879)) {
            case 0 -> IIl(1821061358, var9 ^ -820245954);
            case 1 -> IIl(1821061359, var9 ^ 1397013859);
            case 2 -> IIl(1821061356, var9 ^ -1211562587);
            case 3 -> 2;
            case 4 -> IIl(1821061357, var9 ^ 1589296588);
            case 5 -> IIl(1821061362, var9 ^ -1248143850);
            case 6 -> IIl(1821061363, var9 ^ 137734349);
            case 7 -> IIl(1821061360, var9 ^ -508090610);
            case 8 -> IIl(1821061361, var9 ^ 1167330233);
            case 9 -> IIl(1821061366, var9 ^ 1260481771);
            case 10 -> IIl(1821061367, var9 ^ 429586388);
            case 11 -> IIl(1821061364, var9 ^ 722144338);
            case 12 -> IIl(1821061365, var9 ^ -179228225);
            case 13 -> IIl(1821061370, var9 ^ 1632292679);
            case 14 -> IIl(1821061371, var9 ^ -458380432);
            case 15 -> IIl(1821061368, var9 ^ 245949332);
            case 16 -> IIl(1821061369, var9 ^ -664545157);
            case 17 -> IIl(1821061374, var9 ^ -1211477551);
            case 18 -> IIl(1821061375, var9 ^ 1542433113);
            case 19 -> IIl(1821061372, var9 ^ -1295964591);
            case 20 -> IIl(1821061373, var9 ^ 55762662);
            case 21 -> IIl(1821061250, var9 ^ -621872570);
            case 22 -> IIl(1821061251, var9 ^ 747474980);
            case 23 -> IIl(1821061248, var9 ^ -923374118);
            case 24 -> IIl(1821061249, var9 ^ 2050754659);
            case 25 -> IIl(1821061254, var9 ^ 403941007);
            case 26 -> IIl(1821061255, var9 ^ 1563852463);
            case 27 -> IIl(1821061252, var9 ^ 958902561);
            case 28 -> IIl(1821061253, var9 ^ -1013338307);
            case 29 -> IIl(1821061258, var9 ^ -1036553913);
            case 30 -> IIl(1821061259, var9 ^ 1395246234);
            case 31 -> IIl(1821061256, var9 ^ -1923568288);
            case 32 -> IIl(1821061257, var9 ^ 186534879);
            case 33 -> IIl(1821061262, var9 ^ -758945705);
            case 34 -> IIl(1821061263, var9 ^ -714601047);
            case 35 -> IIl(1821061260, var9 ^ 1826797021);
            case 36 -> IIl(1821061261, var9 ^ 1460190066);
            case 37 -> IIl(1821061266, var9 ^ 1180639057);
            case 38 -> IIl(1821061267, var9 ^ -456647222);
            case 39 -> IIl(1821061264, var9 ^ -1273885146);
            case 40 -> IIl(1821061265, var9 ^ -1639476264);
            case 41 -> IIl(1821061270, var9 ^ -526747620);
            case 42 -> IIl(1821061271, var9 ^ 416774075);
            case 43 -> IIl(1821061268, var9 ^ -1601551565);
            case 44 -> IIl(1821061269, var9 ^ 641359953);
            case 45 -> IIl(1821061274, var9 ^ -1814098369);
            case 46 -> IIl(1821061275, var9 ^ -1952115643);
            case 47 -> IIl(1821061272, var9 ^ 1181339364);
            case 48 -> IIl(1821061273, var9 ^ 1290335183);
            case 49 -> IIl(1821061278, var9 ^ 1579023054);
            case 50 -> IIl(1821061279, var9 ^ -136645251);
            case 51 -> IIl(1821061276, var9 ^ 1894286751);
            case 52 -> IIl(1821061277, var9 ^ 1616254386);
            case 53 -> IIl(1821061282, var9 ^ 1242238325);
            case 54 -> 5;
            case 55 -> IIl(1821061283, var9 ^ -478683629);
            case 56 -> IIl(1821061280, var9 ^ -397437244);
            case 57 -> IIl(1821061281, var9 ^ 1433513778);
            case 58 -> IIl(1821061286, var9 ^ 1771943244);
            case 59 -> IIl(1821061287, var9 ^ 106102256);
            case 60 -> IIl(1821061284, var9 ^ -1741463278);
            case 61 -> IIl(1821061285, var9 ^ 296437315);
            case 62 -> IIl(1821061290, var9 ^ 1758189836);
            case 63 -> IIl(1821061291, var9 ^ 1496635950);
            case 64 -> IIl(1821061288, var9 ^ -308078872);
            case 65 -> IIl(1821061289, var9 ^ 127009936);
            case 66 -> IIl(1821061294, var9 ^ -1384971254);
            case 67 -> IIl(1821061295, var9 ^ 1479664969);
            case 68 -> IIl(1821061292, var9 ^ -217820722);
            case 69 -> IIl(1821061293, var9 ^ 1610346037);
            case 70 -> IIl(1821061298, var9 ^ -1387154955);
            case 71 -> IIl(1821061299, var9 ^ -678383692);
            case 72 -> IIl(1821061296, var9 ^ -210360743);
            case 73 -> IIl(1821061297, var9 ^ -1917414109);
            case 74 -> IIl(1821061302, var9 ^ -1186216065);
            case 75 -> IIl(1821061303, var9 ^ 1889059584);
            case 76 -> IIl(1821061300, var9 ^ 619221794);
            case 77 -> IIl(1821061301, var9 ^ 1001822475);
            case 78 -> IIl(1821061306, var9 ^ 517781839);
            case 79 -> IIl(1821061307, var9 ^ -882088942);
            case 80 -> IIl(1821061304, var9 ^ -335726220);
            case 81 -> IIl(1821061305, var9 ^ -1257229137);
            case 82 -> 4;
            case 83 -> IIl(1821061310, var9 ^ 107053812);
            case 84 -> IIl(1821061311, var9 ^ 1741106445);
            case 85 -> IIl(1821061308, var9 ^ -2042735799);
            case 86 -> IIl(1821061309, var9 ^ 303995809);
            case 87 -> IIl(1821061186, var9 ^ -2044577319);
            case 88 -> IIl(1821061187, var9 ^ 2140935108);
            case 89 -> 0;
            case 90 -> IIl(1821061184, var9 ^ -2073812921);
            case 91 -> IIl(1821061185, var9 ^ -2069339661);
            case 92 -> IIl(1821061190, var9 ^ -1796817312);
            case 93 -> IIl(1821061191, var9 ^ 269363284);
            case 94 -> IIl(1821061188, var9 ^ -507905760);
            case 95 -> IIl(1821061189, var9 ^ -402174857);
            case 96 -> IIl(1821061194, var9 ^ 975852908);
            case 97 -> IIl(1821061195, var9 ^ -847732887);
            case 98 -> IIl(1821061192, var9 ^ -1414413747);
            case 99 -> IIl(1821061193, var9 ^ -1610297795);
            case 100 -> IIl(1821061198, var9 ^ 1229915144);
            case 101 -> IIl(1821061199, var9 ^ 2080408649);
            case 102 -> IIl(1821061196, var9 ^ -815266924);
            case 103 -> IIl(1821061197, var9 ^ 1413244244);
            case 104 -> IIl(1821061202, var9 ^ -730073290);
            case 105 -> IIl(1821061203, var9 ^ -649332358);
            case 106 -> IIl(1821061200, var9 ^ 1937166922);
            case 107 -> IIl(1821061201, var9 ^ -725927013);
            case 108 -> IIl(1821061206, var9 ^ -250167584);
            case 109 -> IIl(1821061207, var9 ^ 1003905267);
            case 110 -> IIl(1821061204, var9 ^ 585948175);
            case 111 -> IIl(1821061205, var9 ^ 229486993);
            case 112 -> IIl(1821061210, var9 ^ 2074735849);
            case 113 -> IIl(1821061211, var9 ^ 1037676988);
            case 114 -> IIl(1821061208, var9 ^ 1781241872);
            case 115 -> IIl(1821061209, var9 ^ -553752347);
            case 116 -> IIl(1821061214, var9 ^ -480378207);
            case 117 -> IIl(1821061215, var9 ^ -583228918);
            case 118 -> IIl(1821061212, var9 ^ -1363161543);
            case 119 -> IIl(1821061213, var9 ^ 765060808);
            case 120 -> IIl(1821061218, var9 ^ 1471010748);
            case 121 -> IIl(1821061219, var9 ^ -1092746644);
            case 122 -> IIl(1821061216, var9 ^ 1608445496);
            case 123 -> IIl(1821061217, var9 ^ -38975629);
            case 124 -> IIl(1821061222, var9 ^ 1062406615);
            case 125 -> IIl(1821061223, var9 ^ 1817094858);
            case 126 -> IIl(1821061220, var9 ^ -1043239377);
            case 127 -> IIl(1821061221, var9 ^ -1027240231);
            case 128 -> IIl(1821061226, var9 ^ -1075904552);
            case 129 -> IIl(1821061227, var9 ^ -610289422);
            case 130 -> IIl(1821061224, var9 ^ -1628780878);
            case 131 -> IIl(1821061225, var9 ^ 1754375369);
            case 132 -> IIl(1821061230, var9 ^ -812208678);
            case 133 -> IIl(1821061231, var9 ^ -567156546);
            case 134 -> IIl(1821061228, var9 ^ -2075929904);
            case 135 -> IIl(1821061229, var9 ^ -62728991);
            case 136 -> IIl(1821061234, var9 ^ 1609098130);
            case 137 -> IIl(1821061235, var9 ^ 403625972);
            case 138 -> IIl(1821061232, var9 ^ -310020697);
            case 139 -> IIl(1821061233, var9 ^ -1305504607);
            case 140 -> IIl(1821061238, var9 ^ 241138645);
            case 141 -> IIl(1821061239, var9 ^ -468235598);
            case 142 -> IIl(1821061236, var9 ^ 1571012191);
            case 143 -> IIl(1821061237, var9 ^ 950701310);
            case 144 -> IIl(1821061242, var9 ^ 1372936844);
            case 145 -> IIl(1821061243, var9 ^ -1506519685);
            case 146 -> IIl(1821061240, var9 ^ 1883338867);
            case 147 -> IIl(1821061241, var9 ^ -171792535);
            case 148 -> IIl(1821061246, var9 ^ -1785772320);
            case 149 -> IIl(1821061247, var9 ^ -1262318186);
            case 150 -> IIl(1821061244, var9 ^ 1644192850);
            case 151 -> IIl(1821061245, var9 ^ 1703953097);
            case 152 -> IIl(1821061122, var9 ^ -211579144);
            case 153 -> IIl(1821061123, var9 ^ -1351265314);
            case 154 -> IIl(1821061120, var9 ^ -154631426);
            case 155 -> IIl(1821061121, var9 ^ -373646906);
            case 156 -> IIl(1821061126, var9 ^ 2141617629);
            case 157 -> IIl(1821061127, var9 ^ -49157753);
            case 158 -> IIl(1821061124, var9 ^ 1466895308);
            case 159 -> IIl(1821061125, var9 ^ -1156352593);
            case 160 -> IIl(1821061130, var9 ^ 1628122311);
            case 161 -> IIl(1821061131, var9 ^ -690803228);
            case 162 -> IIl(1821061128, var9 ^ -838290860);
            case 163 -> IIl(1821061129, var9 ^ 35827021);
            case 164 -> IIl(1821061134, var9 ^ -895063898);
            case 165 -> IIl(1821061135, var9 ^ -328862257);
            case 166 -> IIl(1821061132, var9 ^ 1347854510);
            case 167 -> IIl(1821061133, var9 ^ -1085238519);
            case 168 -> IIl(1821061138, var9 ^ 2107473411);
            case 169 -> IIl(1821061139, var9 ^ -1265015887);
            case 170 -> IIl(1821061136, var9 ^ 2088333090);
            case 171 -> IIl(1821061137, var9 ^ -1798092168);
            case 172 -> IIl(1821061142, var9 ^ -397983715);
            case 173 -> IIl(1821061143, var9 ^ -169389333);
            case 174 -> IIl(1821061140, var9 ^ 813995483);
            case 175 -> IIl(1821061141, var9 ^ -235784262);
            case 176 -> IIl(1821061146, var9 ^ 1571669159);
            case 177 -> IIl(1821061147, var9 ^ -938870013);
            case 178 -> IIl(1821061144, var9 ^ 742819811);
            case 179 -> IIl(1821061145, var9 ^ -1079553336);
            case 180 -> IIl(1821061150, var9 ^ -314759892);
            case 181 -> IIl(1821061151, var9 ^ -1402593898);
            case 182 -> IIl(1821061148, var9 ^ -2002044492);
            case 183 -> IIl(1821061149, var9 ^ -347507684);
            case 184 -> IIl(1821061154, var9 ^ 1867653969);
            case 185 -> IIl(1821061155, var9 ^ -472690111);
            case 186 -> IIl(1821061152, var9 ^ 506350165);
            case 187 -> IIl(1821061153, var9 ^ -668977299);
            case 188 -> IIl(1821061158, var9 ^ 1420095870);
            case 189 -> IIl(1821061159, var9 ^ 324367410);
            case 190 -> IIl(1821061156, var9 ^ -1025388225);
            case 191 -> IIl(1821061157, var9 ^ -892152346);
            case 192 -> IIl(1821061162, var9 ^ 1261129916);
            case 193 -> IIl(1821061163, var9 ^ -413493095);
            case 194 -> IIl(1821061160, var9 ^ -1674172363);
            case 195 -> IIl(1821061161, var9 ^ 1113358136);
            case 196 -> IIl(1821061166, var9 ^ 9704108);
            case 197 -> IIl(1821061167, var9 ^ 950724185);
            case 198 -> IIl(1821061164, var9 ^ 1864811238);
            case 199 -> IIl(1821061165, var9 ^ -1984129241);
            case 200 -> IIl(1821061170, var9 ^ -1532346820);
            case 201 -> IIl(1821061171, var9 ^ -1821981640);
            case 202 -> IIl(1821061168, var9 ^ 1937500607);
            case 203 -> IIl(1821061169, var9 ^ 1783599036);
            case 204 -> IIl(1821061174, var9 ^ 900674617);
            case 205 -> IIl(1821061175, var9 ^ 1151388216);
            case 206 -> IIl(1821061172, var9 ^ -1316125581);
            case 207 -> IIl(1821061173, var9 ^ -943794567);
            case 208 -> IIl(1821061178, var9 ^ 479289394);
            case 209 -> IIl(1821061179, var9 ^ -2014085062);
            case 210 -> IIl(1821061176, var9 ^ 225503232);
            case 211 -> IIl(1821061177, var9 ^ 1227182074);
            case 212 -> IIl(1821061182, var9 ^ 65044000);
            case 213 -> IIl(1821061183, var9 ^ 427807213);
            case 214 -> IIl(1821061180, var9 ^ 341264577);
            case 215 -> 3;
            case 216 -> IIl(1821061181, var9 ^ -1664372027);
            case 217 -> IIl(1821061570, var9 ^ 1231917721);
            case 218 -> IIl(1821061571, var9 ^ -624112645);
            case 219 -> IIl(1821061568, var9 ^ -54716719);
            case 220 -> IIl(1821061569, var9 ^ 2066448110);
            case 221 -> IIl(1821061574, var9 ^ 921120599);
            case 222 -> IIl(1821061575, var9 ^ 1029247200);
            case 223 -> IIl(1821061572, var9 ^ 1434391078);
            case 224 -> IIl(1821061573, var9 ^ 921305978);
            case 225 -> IIl(1821061578, var9 ^ 1748596368);
            case 226 -> IIl(1821061579, var9 ^ 1246860368);
            case 227 -> IIl(1821061576, var9 ^ 760140262);
            case 228 -> IIl(1821061577, var9 ^ -2010611003);
            case 229 -> IIl(1821061582, var9 ^ -534064374);
            case 230 -> IIl(1821061583, var9 ^ 1173516898);
            case 231 -> IIl(1821061580, var9 ^ 305599757);
            case 232 -> IIl(1821061581, var9 ^ -1175295062);
            case 233 -> IIl(1821061586, var9 ^ -101850586);
            case 234 -> IIl(1821061587, var9 ^ -1745048379);
            case 235 -> IIl(1821061584, var9 ^ -220030081);
            case 236 -> IIl(1821061585, var9 ^ -966169573);
            case 237 -> IIl(1821061590, var9 ^ 1807773186);
            case 238 -> IIl(1821061591, var9 ^ -755714109);
            case 239 -> IIl(1821061588, var9 ^ 2140012276);
            case 240 -> IIl(1821061589, var9 ^ 1893511444);
            case 241 -> IIl(1821061594, var9 ^ 1207324966);
            case 242 -> IIl(1821061595, var9 ^ -549294887);
            case 243 -> IIl(1821061592, var9 ^ 1890503971);
            case 244 -> IIl(1821061593, var9 ^ -28780793);
            case 245 -> IIl(1821061598, var9 ^ -1811149960);
            case 246 -> IIl(1821061599, var9 ^ -1432707474);
            case 247 -> IIl(1821061596, var9 ^ -1642515815);
            case 248 -> 1;
            case 249 -> IIl(1821061597, var9 ^ -85724005);
            case 250 -> IIl(1821061602, var9 ^ 1458756261);
            case 251 -> IIl(1821061603, var9 ^ -1479069770);
            case 252 -> IIl(1821061600, var9 ^ -944947350);
            case 253 -> IIl(1821061601, var9 ^ 1153555288);
            case 254 -> IIl(1821061606, var9 ^ 2015741075);
            default -> IIl(1821061607, var9 ^ 1251429015);
         };
         int var5 = (var1 & IIl(1821061604, var9 ^ 110196282)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIl(1821061605, var9 ^ -1426688838)) >>> IIl(1821061610, var9 ^ -1491568680)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIl(1821061611, var9 ^ -747177390);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIl(1821061608, var9 ^ -617578589);
            }
         }

         IIl[var2] = new String(var3).intern();
      }

      return IIl[var2];
   }

   private IIIllIllI Il(class_310 var1, List<lllIIIIl> var2) {
      if (var1 != null && var1.field_1772 != null) {
         double var3 = 118.0;
         double var5 = 18.0;

         for (lllIIIIl var8 : var2) {
            double var9 = IlIIlllIl.IIl(var1.field_1772, var8.I) + IlIIlllIl.IIl(var1.field_1772, var8.II) + 42.0;
            var3 = Math.max(var3, var9);
         }

         double var11 = 14.0 + Math.max(1, var2.size()) * var5;
         return new IIIllIllI(Math.max(140.0, var3), Math.max(36.0, var11));
      } else {
         return new IIIllIllI(150.0, 42.0);
      }
   }

   @Override
   public void IIIII(class_332 var1, int var2, int var3, float var4) {
      this.l(var1, false);
   }

   private static String Ill(byte var0, byte var1, int var2) {
      int var7 = var2 ^ -716105558;
      char[] var6 = lII[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])lIl[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         lIl[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 11992;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ 7953 ^ var5 ^ var1 ^ var0 ^ var2 ^ var4);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   private static String lI(lllIIIIl var0) {
      return var0.I;
   }

   @Override
   public double lll() {
      return this.lI.IllI();
   }

   private double III() {
      return this.III.IllI() / 100.0;
   }
}
