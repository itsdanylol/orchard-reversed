package k74.x;

import java.awt.event.InputEvent;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class IlllIIlI {
   private static final boolean I;
   private static final String[] l;
   private static final String[] IIl;
   private static final boolean II;
   private static final Object Il;
   private static final Object[] IlI;
   private static final int[] III;
   private static final String[] lI;
   private static final int ll;

   public static void I() {
      if (I) {
         lllllllI.II();
      }
   }

   private IlllIIlI() {
   }

   private static String lII(int var0, int var1) {
      int var3 = var0 ^ 1260926610;
      char[] var4 = IIl[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IlI[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IlI[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -102422946;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 137;
            case 1 -> 123;
            case 2 -> 158;
            case 3 -> 46;
            case 4 -> 37;
            case 5 -> 15;
            case 6 -> 137;
            case 7 -> 96;
            case 8 -> 115;
            case 9 -> 179;
            case 10 -> 33;
            case 11 -> 102;
            case 12 -> 120;
            case 13 -> 94;
            case 14 -> 75;
            case 15 -> 183;
            case 16 -> 148;
            case 17 -> 107;
            case 18 -> 11;
            case 19 -> 133;
            case 20 -> 208;
            case 21 -> 186;
            case 22 -> 27;
            case 23 -> 148;
            case 24 -> 237;
            case 25 -> 10;
            case 26 -> 50;
            case 27 -> 192;
            case 28 -> 158;
            case 29 -> 209;
            case 30 -> 140;
            case 31 -> 165;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static Throwable l(Throwable var0) {
      return var0;
   }

   private static int Ill(int var0, int var1) {
      int var2 = III[var0 ^ 1807158739] ^ var1 ^ var0;
      var2 ^= 35427;
      var2 ^= 43291;
      var2 += 41569;
      var2 += 60685;
      var2 -= 40150;
      return var2 - 46693;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 560395217;
      short var18 = 30985;
      int var16 = 0;
      int var17 = 0;
      String[] var15 = new String[2];
      int var14 = "\u001e\udc9c췗\udd2c䷁\udfd0跻\ude0c䷎\udf98췹\udc40췃\udd1c췥\udfc0跈\udf80\u0dce\uddb8跐\udd18췊\udd5c䷪\udd04\u0dc9\udd1c跒\udc1c跣\u0011䖄х䘨䑡䒌葜䖼䑿䔌쑥䑌ё䑐쑡䟀Ѭ䓼"
         .length();
      String var13 = "\u001e\udc9c췗\udd2c䷁\udfd0跻\ude0c䷎\udf98췹\udc40췃\udd1c췥\udfc0跈\udf80\u0dce\uddb8跐\udd18췊\udd5c䷪\udd04\u0dc9\udd1c跒\udc1c跣\u0011䖄х䘨䑡䒌葜䖼䑿䔌쑥䑌ё䑐쑡䟀Ѭ䓼";

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

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

      IIl = var15;
      IlI = new Object[var15.length];
      int var9 = 1002828652;
      byte[] var7 = ">\u009c\u0090³S\u0004ÉµM\n\u001dH¢Ëb¶ëc\u0088W)ìàÙ\u0081w\f÷\u0082D\u0093M.\u0099]\u001f{i¢\t\u00059ÿÖÅ\u0019¡t#\u0093«L&³\u001bÚ×tÃUg\u0000ô\u0018D1f\u009dõ6ÿ«d&%ô{\u001fi±©9\u0099Ã.$ÏÛÚv\u001e7k\u009dj?Uµ&$eµ3¡¨\u0016\u0097\u0097×Év<\u0001ÑøQIqö;À\"öUpÉ\u0017\u007f\u008bâ-\u008aÈµ1Â\u008b®þR1R0q5¾\u0081\u0089^&!\u009bæÛ\u0092Ô\u0001\u0006\b\u001bæ³´±ú\u000eíë\fê6\b¥\t\u0080Èýp2²T?½ý\u001aÄ¶.ÿ\u009cF\u008d\u00adÝ\u0002FÕ\u0010æ: \u0087\"ÙíÔ\u000eð{\u0001YÒÑ~«¶¡¤È{ába\u001bDZK{\u0019\u008eSñe¿©ê\u0080\u0010\u0016\u0001¯\u001fC\u0019ù\u0019\u0090-ÕÌ\u0012R9\u001fV\u0017\u0098\u009c\u0094U1A\u0016\u009b÷·\u0081\u0095ÂÐç\u0085\u0094ª\u009ck\\Iø\u0016LÇ\u0011FÍö2\u008eþª]2@÷ß/\f\u0097u!¤,y!å\nëÐ\u0095Ê,ì\u0082ß\u0093\u0086by\u0099höÚÚûY8¥ábÍk c\f=\u0093\u001atSÈ¦r2à\t\\¨T!ÄÌú\u007fvÈ¤AY\u0085\u0084øö\u0011C\fycd\u009d®+\u000f½ÙZ\u0096\u008fåÉGýæáR¶\u000e,ý\n\n\u0092YX}\u008b2·\u007f/\fÕ·\u0007a©NÎÈÉ\u0095\u000fW tæRi,p\u008böÅÛñ®W0Tå§\u00ad\u0016hx:woöa÷}´-\u008cÛ¡\u009fV\u009beÏ@\u0086`½¬Aa\u0087¡H¤È\u0080R!zþú\u0014Õ\u009c¨Â\n\t¯bÅ\u00162\u0099{õ@úlØ*á\u0098ûõ\u0097\u0082M\u008d$D\u008eÉúÕ2æFîÜ\"©¹ÉË\u007fá\tÍzZpÀ|\u0015:ë\u009a`\u000f·\u009c\u0082\u0010Ìð¦\u008asÊµçC\u0016¡yÚ\u0095\b\u0094<\u0083\u001dpòWK\u0000\u0096&vxìI\u0081\u009f®æ±\u007fàÜt\\\u0080\u0003ÚÑwrI°\u0086\u00ad±?ËÎÿkQ\u0081!Úå\rþ\u0096Éÿ*Örü\u0081³\u0015Y¦'\u00ad\u00972´¹èÞ\u001a&ÙÑ\u0083ÀÕï½sô*°þK\u0096Ù\u0010\u009dñ| C·ûüÔ&G\u0002n_\u008d\u00adÚð®·BÚó\u0003Tt1Ô6\u001a\u001b6ÙïÄÅ\u007f\u0006ñ[½\u0015É:Þb³ï4!\u001d¹dG\\E\u0084\\\u0094\u009dvC£Ãy\u008d\u008a÷4L®\u001c\u0007ê\u0093'\u009eKL\u0096\u001d¦µÍ\u0084¿GP«u§Ë RÓ1\u0010î\u0099ð\u008d\u009c*\\Â¶Æ7\u009a\u009båü\u0015\u00ad¾\u0088U*åï\\Õp\u0001q8\u0005\u0090n\u001a\u0006}X\t\u009ea ñ«Î\u001c\u0082\n¥\u0088\u008d%b[©\u009fkE\u0002ÆÏ¹zY~<g¼ÅæïÝôâ\u009fÐÉîûÑÌ©\u0080«\u001dP\u0092Ô\u001eßNs\u0001ð8\u000eP\u0002ýºX=ÒáÐ\u0089ë\u009ct!Ð>Âî\u0091®,]óõ\u001ag_¦\u0081X\u0097z\u0081<\u00adP£g\u0084}\u0019c\u009a!.*(¦È%TI\u0080õ\u0014î[\u001c\u0099q\u0087\u0084;?{ô'\u0011\t~¥þJì\u0003VR\u001b3C°Kä ¤\u0004Óü\u001fù?¸F$\u0017;7)\u0000^è\u0085\u0082\u001b\fê\rÓ\u0005pxÕcyöëu¬^¿²\u0012\u0095\u0007$C\u0005¥\u009e@*ÈYK\t1\u009d\r\u0010Y8¤ä(Vk#À\u0093\b©B¤ªÄU<¦s\u0089¶<µù!^VDòÙ;Õ'nk=¼Y\u0017sË\u0090#\u0089©Ú\u009c\u0094ÈÏ\u001d¢¨¾\u0011\u0090Ñ°ø_²Ï³<ü\u008bV\u0083p\u0099\u0098\u0089Ã£Ì\u0013²½Å\u000fìèeE\tù\u009e9\u009cÿ\u0004´njm\u0082\u0098Q\u0006×ûD<\u00ad@¹\u0098Â¾ª\u0095\b\u0003Ëç\u009dù\u0082Þ\u0086è¦ë@Áâ\u0096\u009a~;ÀVêÜ3ä@Ù[vØ~úùe%\u009d\u008d¨Sç|ûU÷\u0093\u0092Y^ÊdOA;\u0002\u009dµþãmþ\t(dçñ¨5?ª\u0098àm\u0088Ð¿\u0093ä¿\u0001\u0012\u0016Û\u009cÞ5³ªùË;\u009aÑ³\u00908±\u009cÈ.à\u0081±âÿG\u0094M\u008aÎìÌnó]\u008aÌ\u0017R*;ªt\u009bcWôPd\"ÓBY^ü`ª)\u0090´;À\u007f\u0019Jé)\u0094 ô·ÿÿã¦y\u0000\u0090\u00adñ&\u009bP3>qÌ`À¾\u0019QúìÅÕ¦\u0001xµØ\u0096Ý4³\u0090\f \u0013ð\u008e3Ú\u0018\u0093sT\bÊ\u0081YQZM\u009fU\u0007k7Óñ\u001aââNÁ\u0099\u008bõ\u001fLÀÄ\u0087[\u001fzy\u008fa?.:3~D\u0083ô÷\u0080\fJ\u0003w<\u009e7þª\u009d@\u001fÐ\u0014ë\u008bôìÒÂ\u0099ô\u000fz¡\u0006zFÊÙ\u009cÕvU«\u007f\u0082wÀf\u0017ö\u0088Þx\u0094«Ê\u0018\u0081Ær r"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      III = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         III[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[5];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lII(1260926610, var23 ^ 164136451)).length();
      int var1 = Ill(1807158739, var23 ^ -1334346384);
      int var25 = -1;

      label102:
      while (true) {
         int var10000 = Ill(1807158738, var23 ^ -571530113);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label97: {
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
                     break label97;
                  }

                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % Ill(1807158743, var23 ^ 1703437713)) {
                     case 0 -> Ill(1807158742, var23 ^ -1492710769);
                     case 1 -> Ill(1807158741, var23 ^ 261940953);
                     case 2 -> Ill(1807158740, var23 ^ 212826451);
                     case 3 -> Ill(1807158747, var23 ^ -1603094709);
                     case 4 -> Ill(1807158746, var23 ^ -176011219);
                     case 5 -> Ill(1807158745, var23 ^ -1949166117);
                     default -> Ill(1807158744, var23 ^ 1274170233);
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
                     lI = var5;
                     l = new String[5];
                     ll = III();
                     II = (ll & 1) != 0;
                     I = (ll & 2) != 0;
                     Il = new Object();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var47;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label102;
                  }

                  var4 = (var2 = lII(1260926611, var23 ^ 792327633)).length();
                  var1 = Ill(1807158737, var23 ^ -1008603003);
                  var25 = -1;
            }

            var10000 = Ill(1807158736, var23 ^ 740329624);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private static int II(int var0) {
      int var1 = 1571382263;
      if ((var0 < Ill(1807158751, var1 ^ -776481139) || var0 > Ill(1807158750, var1 ^ -728276511))
         && (var0 < Ill(1807158749, var1 ^ 626047333) || var0 > Ill(1807158748, var1 ^ -1792766464))) {
         if (var0 >= Ill(1807158723, var1 ^ -1240130478) && var0 <= Ill(1807158722, var1 ^ 118654320)) {
            return Ill(1807158721, var1 ^ -1778229269) + var0 - Ill(1807158720, var1 ^ -1992617091);
         } else if (var0 >= Ill(1807158727, var1 ^ 1528685340) && var0 <= Ill(1807158726, var1 ^ -603933448)) {
            return Ill(1807158725, var1 ^ -676523044) + var0 - Ill(1807158724, var1 ^ -1715924765);
         } else if (var0 >= Ill(1807158731, var1 ^ -1483645695) && var0 <= Ill(1807158730, var1 ^ -1752086370)) {
            return Ill(1807158729, var1 ^ 1513287056) + var0 - Ill(1807158728, var1 ^ 636292378);
         } else {
            return switch (var0) {
               case 32 -> Ill(1807158735, var1 ^ -202013296);
               case 39 -> Ill(1807158734, var1 ^ -1152021315);
               case 44 -> Ill(1807158733, var1 ^ 839289730);
               case 45 -> Ill(1807158732, var1 ^ -2098369878);
               case 46 -> Ill(1807158771, var1 ^ 2043039841);
               case 47 -> Ill(1807158770, var1 ^ 982600751);
               case 59 -> Ill(1807158769, var1 ^ 2039120968);
               case 61 -> Ill(1807158768, var1 ^ -1015657880);
               case 91 -> Ill(1807158775, var1 ^ -946144331);
               case 92 -> Ill(1807158774, var1 ^ -1409131609);
               case 93 -> Ill(1807158773, var1 ^ 352315624);
               case 96 -> Ill(1807158772, var1 ^ -215846271);
               case 256 -> Ill(1807158779, var1 ^ 345491777);
               case 257 -> Ill(1807158778, var1 ^ 137007141);
               case 258 -> Ill(1807158777, var1 ^ -20034620);
               case 259 -> Ill(1807158776, var1 ^ 1462631686);
               case 260 -> Ill(1807158783, var1 ^ 257181894);
               case 261 -> Ill(1807158782, var1 ^ -1508128852);
               case 262 -> Ill(1807158781, var1 ^ -387920956);
               case 263 -> Ill(1807158780, var1 ^ 230177632);
               case 264 -> Ill(1807158755, var1 ^ 1610186675);
               case 265 -> Ill(1807158754, var1 ^ 657759176);
               case 266 -> Ill(1807158753, var1 ^ -761045195);
               case 267 -> Ill(1807158752, var1 ^ 535851804);
               case 268 -> Ill(1807158759, var1 ^ -1994054617);
               case 269 -> Ill(1807158758, var1 ^ 593155651);
               case 280 -> Ill(1807158757, var1 ^ 1400944028);
               case 281 -> Ill(1807158756, var1 ^ 323361602);
               case 282 -> Ill(1807158763, var1 ^ -1233243858);
               case 283 -> Ill(1807158762, var1 ^ -341169761);
               case 284 -> Ill(1807158761, var1 ^ -1751395328);
               case 330 -> Ill(1807158760, var1 ^ 1916038193);
               case 331 -> Ill(1807158767, var1 ^ 1564162345);
               case 332 -> Ill(1807158766, var1 ^ 188606999);
               case 333 -> Ill(1807158765, var1 ^ 669542502);
               case 334 -> Ill(1807158764, var1 ^ -885314528);
               case 335 -> Ill(1807158675, var1 ^ 1790503410);
               case 336 -> Ill(1807158674, var1 ^ -1016763168);
               case 340, 344 -> Ill(1807158673, var1 ^ 93584442);
               case 341, 345 -> Ill(1807158672, var1 ^ 821336616);
               case 342, 346 -> Ill(1807158679, var1 ^ 1720639936);
               case 343, 347 -> Ill(1807158678, var1 ^ -1368554999);
               case 348 -> Ill(1807158677, var1 ^ -1092392214);
               default -> 0;
            };
         }
      } else {
         return var0;
      }
   }

   private static String Il(int var0, int var1) {
      int var9 = -1165273720;
      int var2 = (var0 ^ Ill(1807158676, var9 ^ 655333822)) & Ill(1807158683, var9 ^ 340989689);
      if (l[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & Ill(1807158682, var9 ^ 1441895397)) {
            case 0 -> Ill(1807158681, var9 ^ 428949185);
            case 1 -> 4;
            case 2 -> Ill(1807158680, var9 ^ -1322633895);
            case 3 -> Ill(1807158687, var9 ^ -267606168);
            case 4 -> Ill(1807158686, var9 ^ -2134087924);
            case 5 -> Ill(1807158685, var9 ^ -1747329073);
            case 6 -> Ill(1807158684, var9 ^ 2004866388);
            case 7 -> Ill(1807158659, var9 ^ -472082758);
            case 8 -> Ill(1807158658, var9 ^ 1279191516);
            case 9 -> Ill(1807158657, var9 ^ 2009802614);
            case 10 -> Ill(1807158656, var9 ^ 1980395904);
            case 11 -> Ill(1807158663, var9 ^ 259137436);
            case 12 -> Ill(1807158662, var9 ^ -1284211093);
            case 13 -> Ill(1807158661, var9 ^ 475718681);
            case 14 -> Ill(1807158660, var9 ^ 885162058);
            case 15 -> Ill(1807158667, var9 ^ 1785758914);
            case 16 -> Ill(1807158666, var9 ^ 1415563689);
            case 17 -> Ill(1807158665, var9 ^ -303014639);
            case 18 -> Ill(1807158664, var9 ^ 427763841);
            case 19 -> Ill(1807158671, var9 ^ -2002229352);
            case 20 -> Ill(1807158670, var9 ^ -1461774665);
            case 21 -> Ill(1807158669, var9 ^ -1696365292);
            case 22 -> Ill(1807158668, var9 ^ -387928579);
            case 23 -> Ill(1807158707, var9 ^ -1559732024);
            case 24 -> Ill(1807158706, var9 ^ 520937058);
            case 25 -> Ill(1807158705, var9 ^ 1299957543);
            case 26 -> Ill(1807158704, var9 ^ -1569103083);
            case 27 -> Ill(1807158711, var9 ^ -1062122629);
            case 28 -> Ill(1807158710, var9 ^ -1136098673);
            case 29 -> Ill(1807158709, var9 ^ -594328711);
            case 30 -> Ill(1807158708, var9 ^ -1250776525);
            case 31 -> Ill(1807158715, var9 ^ 2083142879);
            case 32 -> Ill(1807158714, var9 ^ -473722826);
            case 33 -> Ill(1807158713, var9 ^ -1152287700);
            case 34 -> Ill(1807158712, var9 ^ -257826376);
            case 35 -> Ill(1807158719, var9 ^ 2105439976);
            case 36 -> 0;
            case 37 -> Ill(1807158718, var9 ^ 2062559753);
            case 38 -> Ill(1807158717, var9 ^ 1756520747);
            case 39 -> Ill(1807158716, var9 ^ -827862154);
            case 40 -> Ill(1807158691, var9 ^ -1906080795);
            case 41 -> Ill(1807158690, var9 ^ -1821970145);
            case 42 -> Ill(1807158689, var9 ^ 1416088499);
            case 43 -> Ill(1807158688, var9 ^ 1570931872);
            case 44 -> Ill(1807158695, var9 ^ 1193752300);
            case 45 -> Ill(1807158694, var9 ^ -283993717);
            case 46 -> Ill(1807158693, var9 ^ -1111210367);
            case 47 -> Ill(1807158692, var9 ^ -1167816335);
            case 48 -> Ill(1807158699, var9 ^ 664745928);
            case 49 -> Ill(1807158698, var9 ^ 1442586816);
            case 50 -> Ill(1807158697, var9 ^ 1072157929);
            case 51 -> Ill(1807158696, var9 ^ -527315243);
            case 52 -> Ill(1807158703, var9 ^ -1742599987);
            case 53 -> Ill(1807158702, var9 ^ -587424022);
            case 54 -> Ill(1807158701, var9 ^ -213867949);
            case 55 -> Ill(1807158700, var9 ^ 934277677);
            case 56 -> Ill(1807158611, var9 ^ -562450984);
            case 57 -> Ill(1807158610, var9 ^ -662956512);
            case 58 -> Ill(1807158609, var9 ^ -713402038);
            case 59 -> Ill(1807158608, var9 ^ -23319299);
            case 60 -> 3;
            case 61 -> Ill(1807158615, var9 ^ -1566912919);
            case 62 -> Ill(1807158614, var9 ^ -638129427);
            case 63 -> Ill(1807158613, var9 ^ 1724709181);
            case 64 -> Ill(1807158612, var9 ^ 1443950039);
            case 65 -> Ill(1807158619, var9 ^ -812432182);
            case 66 -> Ill(1807158618, var9 ^ 696602933);
            case 67 -> Ill(1807158617, var9 ^ -414120126);
            case 68 -> Ill(1807158616, var9 ^ -2095039940);
            case 69 -> Ill(1807158623, var9 ^ -112210637);
            case 70 -> Ill(1807158622, var9 ^ -1142882937);
            case 71 -> Ill(1807158621, var9 ^ -170248008);
            case 72 -> Ill(1807158620, var9 ^ -1794796027);
            case 73 -> Ill(1807158595, var9 ^ 1651770750);
            case 74 -> Ill(1807158594, var9 ^ -1817444884);
            case 75 -> Ill(1807158593, var9 ^ -557272258);
            case 76 -> Ill(1807158592, var9 ^ 1149726027);
            case 77 -> Ill(1807158599, var9 ^ -267668927);
            case 78 -> Ill(1807158598, var9 ^ -587636262);
            case 79 -> Ill(1807158597, var9 ^ 1744489960);
            case 80 -> Ill(1807158596, var9 ^ 6285893);
            case 81 -> Ill(1807158603, var9 ^ -1198424409);
            case 82 -> Ill(1807158602, var9 ^ -1393650962);
            case 83 -> Ill(1807158601, var9 ^ 870292097);
            case 84 -> Ill(1807158600, var9 ^ -707550419);
            case 85 -> Ill(1807158607, var9 ^ 1727161910);
            case 86 -> Ill(1807158606, var9 ^ -347219335);
            case 87 -> Ill(1807158605, var9 ^ 94092648);
            case 88 -> Ill(1807158604, var9 ^ 893779159);
            case 89 -> Ill(1807158643, var9 ^ -372085389);
            case 90 -> Ill(1807158642, var9 ^ 392696587);
            case 91 -> Ill(1807158641, var9 ^ -1193493477);
            case 92 -> Ill(1807158640, var9 ^ -1572563284);
            case 93 -> Ill(1807158647, var9 ^ 374487274);
            case 94 -> Ill(1807158646, var9 ^ -1053798115);
            case 95 -> Ill(1807158645, var9 ^ 601858894);
            case 96 -> Ill(1807158644, var9 ^ -797357458);
            case 97 -> Ill(1807158651, var9 ^ 1320901031);
            case 98 -> Ill(1807158650, var9 ^ 802696831);
            case 99 -> Ill(1807158649, var9 ^ -97358414);
            case 100 -> Ill(1807158648, var9 ^ -1402860770);
            case 101 -> Ill(1807158655, var9 ^ 1350701308);
            case 102 -> Ill(1807158654, var9 ^ -2005921810);
            case 103 -> Ill(1807158653, var9 ^ -696270341);
            case 104 -> Ill(1807158652, var9 ^ -500039473);
            case 105 -> Ill(1807158627, var9 ^ 151103080);
            case 106 -> Ill(1807158626, var9 ^ 848824260);
            case 107 -> Ill(1807158625, var9 ^ -2095322411);
            case 108 -> Ill(1807158624, var9 ^ -662506697);
            case 109 -> Ill(1807158631, var9 ^ 1168980317);
            case 110 -> Ill(1807158630, var9 ^ -559539727);
            case 111 -> Ill(1807158629, var9 ^ 605463944);
            case 112 -> Ill(1807158628, var9 ^ -443820254);
            case 113 -> Ill(1807158635, var9 ^ 1237645972);
            case 114 -> Ill(1807158634, var9 ^ 580704177);
            case 115 -> Ill(1807158633, var9 ^ -384571733);
            case 116 -> Ill(1807158632, var9 ^ -1655478772);
            case 117 -> Ill(1807158639, var9 ^ -94725741);
            case 118 -> Ill(1807158638, var9 ^ 343372942);
            case 119 -> Ill(1807158637, var9 ^ -2056759599);
            case 120 -> Ill(1807158636, var9 ^ 1751008678);
            case 121 -> Ill(1807158547, var9 ^ 1948695241);
            case 122 -> Ill(1807158546, var9 ^ -619000081);
            case 123 -> Ill(1807158545, var9 ^ -1332821705);
            case 124 -> Ill(1807158544, var9 ^ 2002641641);
            case 125 -> Ill(1807158551, var9 ^ 2118340330);
            case 126 -> Ill(1807158550, var9 ^ -625004276);
            case 127 -> Ill(1807158549, var9 ^ 1798974694);
            case 128 -> Ill(1807158548, var9 ^ -790584483);
            case 129 -> Ill(1807158555, var9 ^ -505097349);
            case 130 -> Ill(1807158554, var9 ^ -588728322);
            case 131 -> Ill(1807158553, var9 ^ -642790377);
            case 132 -> Ill(1807158552, var9 ^ 139910713);
            case 133 -> Ill(1807158559, var9 ^ 198771419);
            case 134 -> Ill(1807158558, var9 ^ 351695932);
            case 135 -> Ill(1807158557, var9 ^ 1157936860);
            case 136 -> Ill(1807158556, var9 ^ 1295752796);
            case 137 -> Ill(1807158531, var9 ^ -980441263);
            case 138 -> Ill(1807158530, var9 ^ 1629985852);
            case 139 -> Ill(1807158529, var9 ^ -672604685);
            case 140 -> Ill(1807158528, var9 ^ 962314144);
            case 141 -> Ill(1807158535, var9 ^ 258020247);
            case 142 -> Ill(1807158534, var9 ^ -1805722668);
            case 143 -> Ill(1807158533, var9 ^ -1808080527);
            case 144 -> Ill(1807158532, var9 ^ -1235103940);
            case 145 -> Ill(1807158539, var9 ^ 208000741);
            case 146 -> Ill(1807158538, var9 ^ 992764979);
            case 147 -> Ill(1807158537, var9 ^ -584902403);
            case 148 -> Ill(1807158536, var9 ^ -1779212403);
            case 149 -> Ill(1807158543, var9 ^ 1310381557);
            case 150 -> Ill(1807158542, var9 ^ -1836943421);
            case 151 -> Ill(1807158541, var9 ^ 1861380907);
            case 152 -> Ill(1807158540, var9 ^ 477687443);
            case 153 -> Ill(1807158579, var9 ^ 1609191354);
            case 154 -> Ill(1807158578, var9 ^ 1193115647);
            case 155 -> Ill(1807158577, var9 ^ -1521637306);
            case 156 -> Ill(1807158576, var9 ^ -1325228216);
            case 157 -> Ill(1807158583, var9 ^ 184513786);
            case 158 -> Ill(1807158582, var9 ^ 1394760647);
            case 159 -> Ill(1807158581, var9 ^ 573524744);
            case 160 -> Ill(1807158580, var9 ^ -41693515);
            case 161 -> Ill(1807158587, var9 ^ 434913754);
            case 162 -> Ill(1807158586, var9 ^ 276182241);
            case 163 -> Ill(1807158585, var9 ^ 1988083104);
            case 164 -> Ill(1807158584, var9 ^ 1621758509);
            case 165 -> Ill(1807158591, var9 ^ -1491805724);
            case 166 -> Ill(1807158590, var9 ^ 826624392);
            case 167 -> Ill(1807158589, var9 ^ -1958321737);
            case 168 -> Ill(1807158588, var9 ^ 1280132362);
            case 169 -> Ill(1807158563, var9 ^ -2012521436);
            case 170 -> Ill(1807158562, var9 ^ 765634738);
            case 171 -> Ill(1807158561, var9 ^ 1131243666);
            case 172 -> Ill(1807158560, var9 ^ -2045844163);
            case 173 -> Ill(1807158567, var9 ^ -1314092858);
            case 174 -> Ill(1807158566, var9 ^ 698367862);
            case 175 -> Ill(1807158565, var9 ^ -1556416231);
            case 176 -> Ill(1807158564, var9 ^ 878189216);
            case 177 -> Ill(1807158571, var9 ^ -404785162);
            case 178 -> Ill(1807158570, var9 ^ 845684862);
            case 179 -> Ill(1807158569, var9 ^ -1453368272);
            case 180 -> Ill(1807158568, var9 ^ -560566435);
            case 181 -> Ill(1807158575, var9 ^ -1126379479);
            case 182 -> Ill(1807158574, var9 ^ -574007603);
            case 183 -> Ill(1807158573, var9 ^ -1111990892);
            case 184 -> Ill(1807158572, var9 ^ -994659147);
            case 185 -> Ill(1807158483, var9 ^ -1479934235);
            case 186 -> Ill(1807158482, var9 ^ -376628310);
            case 187 -> Ill(1807158481, var9 ^ 1704973811);
            case 188 -> Ill(1807158480, var9 ^ -693796455);
            case 189 -> Ill(1807158487, var9 ^ -1480882138);
            case 190 -> Ill(1807158486, var9 ^ -101832603);
            case 191 -> Ill(1807158485, var9 ^ 486527971);
            case 192 -> Ill(1807158484, var9 ^ -1980151483);
            case 193 -> Ill(1807158491, var9 ^ 2070683806);
            case 194 -> Ill(1807158490, var9 ^ -1923658866);
            case 195 -> Ill(1807158489, var9 ^ -297635512);
            case 196 -> Ill(1807158488, var9 ^ 1438635314);
            case 197 -> Ill(1807158495, var9 ^ -1414735619);
            case 198 -> Ill(1807158494, var9 ^ 382577176);
            case 199 -> Ill(1807158493, var9 ^ -326855751);
            case 200 -> Ill(1807158492, var9 ^ -39803305);
            case 201 -> Ill(1807158467, var9 ^ -723199157);
            case 202 -> Ill(1807158466, var9 ^ 1799196048);
            case 203 -> Ill(1807158465, var9 ^ -2459315);
            case 204 -> Ill(1807158464, var9 ^ 1440683590);
            case 205 -> Ill(1807158471, var9 ^ -847726691);
            case 206 -> Ill(1807158470, var9 ^ 1881397029);
            case 207 -> Ill(1807158469, var9 ^ -1118458426);
            case 208 -> Ill(1807158468, var9 ^ -296501968);
            case 209 -> Ill(1807158475, var9 ^ -2023812220);
            case 210 -> Ill(1807158474, var9 ^ 1900612858);
            case 211 -> Ill(1807158473, var9 ^ 396097767);
            case 212 -> Ill(1807158472, var9 ^ -160713914);
            case 213 -> Ill(1807158479, var9 ^ 1029876334);
            case 214 -> Ill(1807158478, var9 ^ -1120701702);
            case 215 -> Ill(1807158477, var9 ^ -1914296544);
            case 216 -> Ill(1807158476, var9 ^ -977674731);
            case 217 -> Ill(1807158515, var9 ^ -1442359133);
            case 218 -> Ill(1807158514, var9 ^ -828730614);
            case 219 -> Ill(1807158513, var9 ^ -1498631339);
            case 220 -> 5;
            case 221 -> Ill(1807158512, var9 ^ 782015265);
            case 222 -> Ill(1807158519, var9 ^ -2059469684);
            case 223 -> Ill(1807158518, var9 ^ -584536722);
            case 224 -> Ill(1807158517, var9 ^ -1528516082);
            case 225 -> 2;
            case 226 -> Ill(1807158516, var9 ^ -2125741986);
            case 227 -> Ill(1807158523, var9 ^ -104192959);
            case 228 -> Ill(1807158522, var9 ^ 1217167621);
            case 229 -> Ill(1807158521, var9 ^ 1194096270);
            case 230 -> Ill(1807158520, var9 ^ 1637690881);
            case 231 -> Ill(1807158527, var9 ^ -514445659);
            case 232 -> Ill(1807158526, var9 ^ -968616867);
            case 233 -> Ill(1807158525, var9 ^ -379132095);
            case 234 -> Ill(1807158524, var9 ^ -2051901731);
            case 235 -> Ill(1807158499, var9 ^ 1780418396);
            case 236 -> Ill(1807158498, var9 ^ 1016261217);
            case 237 -> Ill(1807158497, var9 ^ -1560694261);
            case 238 -> Ill(1807158496, var9 ^ -1283502698);
            case 239 -> Ill(1807158503, var9 ^ -1191744609);
            case 240 -> Ill(1807158502, var9 ^ 1161130867);
            case 241 -> Ill(1807158501, var9 ^ -647590494);
            case 242 -> Ill(1807158500, var9 ^ 207075312);
            case 243 -> Ill(1807158507, var9 ^ -791418016);
            case 244 -> Ill(1807158506, var9 ^ 1840485719);
            case 245 -> Ill(1807158505, var9 ^ -936182034);
            case 246 -> Ill(1807158504, var9 ^ 430333569);
            case 247 -> Ill(1807158511, var9 ^ -1690986715);
            case 248 -> Ill(1807158510, var9 ^ -2039146053);
            case 249 -> Ill(1807158509, var9 ^ -544795516);
            case 250 -> Ill(1807158508, var9 ^ 1330369158);
            case 251 -> Ill(1807158419, var9 ^ 309164698);
            case 252 -> Ill(1807158418, var9 ^ -467882087);
            case 253 -> Ill(1807158417, var9 ^ 1539822432);
            case 254 -> Ill(1807158416, var9 ^ -535232100);
            default -> 1;
         };
         int var5 = (var1 & Ill(1807158423, var9 ^ -780069160)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Ill(1807158422, var9 ^ -1870608985)) >>> Ill(1807158421, var9 ^ 707293423)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Ill(1807158420, var9 ^ 1799540272);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Ill(1807158427, var9 ^ -494517887);
            }
         }

         l[var2] = new String(var3).intern();
      }

      return l[var2];
   }

   private static boolean lI(class_310 var0) {
      return var0 != null && var0.field_1755 == null && var0.method_1569() && var0.method_22683() != null;
   }

   public static boolean ll(class_310 param0, class_306 param1, boolean param2, boolean param3) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: invokestatic k74/x/llIllIlI.IIlII ()[Ljava/lang/String;
      // 03: astore 4
      // 05: getstatic k74/x/IlllIIlI.II Z
      // 08: ifeq 17
      // 0b: aload 0
      // 0c: aload 1
      // 0d: iload 2
      // 0e: iload 3
      // 0f: invokestatic k74/x/lllIlI.l (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;ZZ)Z
      // 12: ireturn
      // 13: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 16: athrow
      // 17: getstatic k74/x/IlllIIlI.I Z
      // 1a: ifeq 4c
      // 1d: aload 1
      // 1e: ifnull 4c
      // 21: goto 28
      // 24: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 27: athrow
      // 28: iload 2
      // 29: ifne 3e
      // 2c: goto 33
      // 2f: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 32: athrow
      // 33: iload 3
      // 34: ifne 52
      // 37: goto 3e
      // 3a: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 3d: athrow
      // 3e: aload 0
      // 3f: invokestatic k74/x/IlllIIlI.lI (Lnet/minecraft/class_310;)Z
      // 42: ifne 52
      // 45: goto 4c
      // 48: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 4b: athrow
      // 4c: bipush 0
      // 4d: ireturn
      // 4e: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 51: athrow
      // 52: invokestatic k74/x/lllllllI.II ()Ljava/awt/Robot;
      // 55: astore 5
      // 57: aload 5
      // 59: ifnonnull 5e
      // 5c: bipush 0
      // 5d: ireturn
      // 5e: getstatic k74/x/IlllIIlI.Il Ljava/lang/Object;
      // 61: dup
      // 62: astore 6
      // 64: monitorenter
      // 65: aload 1
      // 66: invokevirtual net/minecraft/class_3675$class_306.method_1442 ()Lnet/minecraft/class_3675$class_307;
      // 69: getstatic net/minecraft/class_3675$class_307.field_1672 Lnet/minecraft/class_3675$class_307;
      // 6c: if_acmpne ac
      // 6f: aload 1
      // 70: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // 73: invokestatic k74/x/IlllIIlI.IIl (I)I
      // 76: istore 7
      // 78: iload 7
      // 7a: ifne 82
      // 7d: bipush 0
      // 7e: aload 6
      // 80: monitorexit
      // 81: ireturn
      // 82: iload 2
      // 83: ifeq 99
      // 86: aload 5
      // 88: iload 7
      // 8a: invokevirtual java/awt/Robot.mousePress (I)V
      // 8d: aload 4
      // 8f: ifnonnull a7
      // 92: goto 99
      // 95: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 98: athrow
      // 99: aload 5
      // 9b: iload 7
      // 9d: invokevirtual java/awt/Robot.mouseRelease (I)V
      // a0: goto a7
      // a3: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // a6: athrow
      // a7: bipush 1
      // a8: aload 6
      // aa: monitorexit
      // ab: ireturn
      // ac: aload 1
      // ad: invokevirtual net/minecraft/class_3675$class_306.method_1444 ()I
      // b0: invokestatic k74/x/IlllIIlI.II (I)I
      // b3: istore 7
      // b5: iload 7
      // b7: ifne bf
      // ba: bipush 0
      // bb: aload 6
      // bd: monitorexit
      // be: ireturn
      // bf: iload 2
      // c0: ifeq d6
      // c3: aload 5
      // c5: iload 7
      // c7: invokevirtual java/awt/Robot.keyPress (I)V
      // ca: aload 4
      // cc: ifnonnull e4
      // cf: goto d6
      // d2: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // d5: athrow
      // d6: aload 5
      // d8: iload 7
      // da: invokevirtual java/awt/Robot.keyRelease (I)V
      // dd: goto e4
      // e0: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // e3: athrow
      // e4: bipush 1
      // e5: aload 6
      // e7: monitorexit
      // e8: ireturn
      // e9: astore 8
      // eb: aload 6
      // ed: monitorexit
      // ee: aload 8
      // f0: athrow
      // f1: astore 5
      // f3: bipush 0
      // f4: ireturn
   }

   private static int III() {
      int var1 = 1291217282;
      String var0 = System.getProperty(IlIIllIII.lI(Il(Ill(1807158426, var1 ^ 536062631), Ill(1807158425, var1 ^ -729444614))), "").toLowerCase(Locale.ROOT);
      if (var0.startsWith(IlIIllIII.lI(Il(Ill(1807158424, var1 ^ 1553679917), Ill(1807158431, var1 ^ -149982486))))) {
         return 1;
      } else {
         return !var0.contains(IlIIllIII.lI(Il(Ill(1807158430, var1 ^ -834269238), Ill(1807158429, var1 ^ -335414210))))
               && !var0.contains(IlIIllIII.lI(Il(Ill(1807158428, var1 ^ 1724013807), Ill(1807158403, var1 ^ 2142152937))))
               && !var0.contains(IlIIllIII.lI(Il(Ill(1807158402, var1 ^ -1208282021), Ill(1807158401, var1 ^ 589124213))))
            ? 0
            : 2;
      }
   }

   private static int IIl(int var0) {
      int var1 = switch (var0) {
         case 0 -> 1;
         case 1 -> 3;
         case 2 -> 2;
         case 3 -> 4;
         case 4 -> 5;
         case 5 -> Ill(1807158400, 1465274827 ^ 1879389720);
         case 6 -> Ill(1807158407, 1465274827 ^ 1393645069);
         case 7 -> Ill(1807158406, 1465274827 ^ 1051324158);
         default -> 0;
      };
      return var1 == 0 ? 0 : InputEvent.getMaskForButton(var1);
   }

   public static boolean IlI() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: getstatic k74/x/IlllIIlI.II Z
      // 03: ifeq 0e
      // 06: invokestatic k74/x/lllIlI.II ()Z
      // 09: ireturn
      // 0a: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d: athrow
      // 0e: getstatic k74/x/IlllIIlI.I Z
      // 11: ifeq 36
      // 14: invokestatic java/awt/GraphicsEnvironment.isHeadless ()Z
      // 17: ifne 36
      // 1a: goto 21
      // 1d: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 20: athrow
      // 21: invokestatic k74/x/lllllllI.II ()Ljava/awt/Robot;
      // 24: ifnull 36
      // 27: goto 2e
      // 2a: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 2d: athrow
      // 2e: bipush 1
      // 2f: goto 37
      // 32: invokestatic k74/x/IlllIIlI.l (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 35: athrow
      // 36: bipush 0
      // 37: ireturn
      // 38: astore 0
      // 39: bipush 0
      // 3a: ireturn
   }
}
