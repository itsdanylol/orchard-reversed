package k74.x;

import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class IIlIIlI extends IlIIIIIIl {
   private final IIlIII I;
   private static String[] II;
   private static final Object[] IlI;
   private static final int[] III;
   private static final String[] Il;
   private static final String[] lI;
   private static final String[] IIl;
   private final lllIIlII ll;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 801765923;
      int var17 = 0;
      int var16 = 0;
      int var14 = "/Ƽ뱽\uec0f尼뙗⒤\ue922贼\u2d74厗烪㳽塢좹鼹胞皧썮㮨䘁ꚧ\uead2ꙗꨶ䶍㊹ᄙ䔻需ဲ⪘\ueb56ꕸ융棍儵\uebd7삟\udedc굚ꎿ㼑᷆鰢뢇ᐝ䲽9喬硊巐씜粖\ue7a3㜿軖购ꊆ\udd63巂ḣ栙ꎞ\uf2d6\uedfe츧笄쒃\ud849㪗䯂甊㺪\u181d鵟뢃섅桧냯뼝嘸˃逮⤧⼛冃봯꾋俊ݰۨ᪡⇸ᾑ\ueb68ᖝ\u19ad⍮陇绊쏸驏뇼뜹컫"
         .length();
      String var13 = "/Ƽ뱽\uec0f尼뙗⒤\ue922贼\u2d74厗烪㳽塢좹鼹胞皧썮㮨䘁ꚧ\uead2ꙗꨶ䶍㊹ᄙ䔻需ဲ⪘\ueb56ꕸ융棍儵\uebd7삟\udedc굚ꎿ㼑᷆鰢뢇ᐝ䲽9喬硊巐씜粖\ue7a3㜿軖购ꊆ\udd63巂ḣ栙ꎞ\uf2d6\uedfe츧笄쒃\ud849㪗䯂甊㺪\u181d鵟뢃섅桧냯뼝嘸˃逮⤧⼛冃봯꾋俊ݰۨ᪡⇸ᾑ\ueb68ᖝ\u19ad⍮陇绊쏸驏뇼뜹컫";
      short var18 = 411;
      String[] var15 = new String[2];

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 242;
               case 1 -> 241;
               case 2 -> 217;
               case 3 -> 222;
               case 4 -> 177;
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

      IIl = var15;
      IlI = new Object[var15.length];
      int var9 = -2110288379;
      byte[] var7 = "\u0088\u001e£\u00020^t¡|f¤ÊT2\u001f\"¤\u0094·Cï (ÃWX\u008fø&=*´\u0092÷ñ\u0082xã\u0080\u001f,àÎv£Ìt<JC¢\u0014/Ù^]\u0014\u008d¬¾\u0092\u0019\u0014¼XõÞ.(X\u0090:1~<©\u00adaÓA¡å~k«·ÙÕºÜ\u0091¸\u008aR\u0099\u0002\u0098È\u000f\u0012º¶\u0086ñ¨ÆúÚu/\u0095È\u008cp]\u0080E\u008e\u0094o\u0003qéÜË\u000b\u0004vîø\u001bBÇ`ÆX-Am«\u0011\u0011'$¹N'\u0089\u0095Ö\u0019$iæ^mü\u0014?\u0000\u0083\u0097\u0012\u008e\r+´·WÔó±\b\u0089\u0015XjÎÅ\u0018|5µQÐI\\Nkd¤\u0083\u0083þ{>(_U0s\u0017ýçE9/\u0085JwkßÙ\u0088å»P\u0001ÿ¬÷¢\u0088\f\u00ad¡\u0086p³k\u0014\"KÔPîk¯ \u0004Ý¼\u007f{\u0011È\u0097èwí6ÝÜ®\n¯+\u0086YnI\u000e\u008dû$\u009d\u009aÂ\u001cd¦?Å\u0000(-7\u007f\u009e£w\u0014,\u007f<Y×\u0003K\u0088=®\"pm¹@¹Õ¼\u0085ÔäÁ«å\u008c¤ß¢\u00ad\u0096Wô\u0019t0G\u0014K;±g\u0093\u0004ªr\u0003iôGOíá;O\u001ciR)ò\u0010ÂO\u0084Oi\u009c\f\u0007\u000fsÀù\u0095doK6!È[{(E/,sV\u0084²\u000fs¤~»\u0099\u007f|è\u00adLê\u0094RÒ\u001a[Ü=}\u0012\u000eµD\u0087-Ö5\u0005\u0092~\u0082\u0012®=BÓ\u000b¶ç\u0086\u0097·Ó\u000e\u0083`'Íõá\u001c&Ti\u00014Ut\u009fw$/F5¬ã~\u0080ùçi½\u0091ÅÒ¶Ä|\u0098hK÷1×\u008a0éì\u0017LAÿ\u001a\týw¥BîqÉ\u0090DLJQ2æÃ\u0094¸ÿ\u0088\fà\u000b\u000f\u001dr¥ùÉ9S\u0017pº\u0017\u0085\u001eù'HÃ¶\u009cÓqXßT*? \u0017$s ÂIö\u0086Vr±\u0018¿àc!S\u0087\u0080\u0094\u0011\u0010ØÆ\t\u0086¾\u001b\u0002\\&q4ü¼DÝ0ðòþ&.Åí@\u0093ímÃ\u0091Ù\u001bË\u0080nSõ\u007f\u001a|ã\u000eèë\u0007Y !|»¼\u009fÅ¨I*\u0019\u001b\nâµVä\u0000-böeÖ½×ëñ0\b_\u001c>-\u0098ê\u0013Il!!\u0092¢\u008f\u0087ì\u008aM\u0013ÅkÌ¯¿eÀ\u0087eÆ\u000f×Û`H(U\u0084oá¶^ÂÍZ¿|÷\u0091Ã³$à\u0005\u0080\u0011\u0082Å\u0091ýû\u009cü#EBì'p\u0007KÁÿ\fú;r¤\u001a¯Oû*À$\u009f\u009dÔÅNÚîC3!:¸ráY\u0087\u0081ö\u009e~Sémä\u001e \u001cêq\u008eMó\u0096ñÐ\u0096\u007f¹ R«\tBm$%0\r\u0000ûógâ^± \u009cû:µ¶G\u0018ÖdC\u0018¶!]¢ËrÔ\u009a¸\u0085\u008d¬UÝm½Â¢\u0002\u0013\u0003V\u001a|\u0080ìP={Tç\u0083\u0096\u001c\u0082Mè\u0006ç\u0004Hï¦\u0091ï\u0010\u0016rO&i\u0013§Úåd\u0010Q\u001dÇL£\u0097Tºþ»UàÄ4ã\u008ep7='\u0087\u0080\u0005ôÜcD\u0092õQ*E\u001ed¶Lr\u001bÏ\u0015MÁ.D\u0019DaK*â\u0011\u001aÒî\\(]+\u0017Ó´}¬®\u0083ãÈ\u008béÂ\u001c\u0012B\u0096¼º\u0007¥\u0019m\u0007\u008a>\u008a4Âç4µD~¶Å\u009e.\u0096Uv:ä\u00840C\u001c\u009e¡dxQ@ì¸}¸\r»W²&S\t%8ò&Ý\u0001ÓÔmð×ç\u008a\u008c!f\u008bc±È\u0089¸ù\u00197\u0017OQoÙ¢ÜvX\u00800\u0080~\u009c :\u0095\fV3bD4<\u0093SÑÈÈ\u0001dQU²O?ñ\u0007}\u0088Â\u0011%¸\u0017\nÙ\u007f\u000eGì¹4çå[l¢\u0018\u0085Ê\u0098b\u000f\u000e\u0002Q^ôi\u0011ß7\u0011¸9\u0088ú\u0019|¦M\"Õ^1ZñL2ý\u0084 `BW²ªÅÁ\u0088N\rëØÉ\u001d0\u000f©\u00002_ÕÙ¦Ô8\u0006\u0096ïW\b\u007f\u008a°ðvé\u0081m\u0094¾8@ò\u0091lW¯{QÊ\u001a4\b®\u009f\u001b¢÷c\u0084è¶K¶V¸æçJ\u0010\u00885~\u0017W\u0000\u0019k*\u0092~åu¥Jvd*v\u001d©ÅÛGO\u0097\u0019ßj¡ìK\u001fÓ4û\u0080ÊK\u0082îI\u0087"
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

      String[] var5 = new String[ll(-1816471555, var23 ^ 1235613878)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III('ꏓ', '铱', var23 ^ 2116926073)).length();
      int var1 = ll(-1816471556, var23 ^ -236638454);
      int var25 = -1;

      label97:
      while (true) {
         int var28 = ll(-1816471553, var23 ^ -1109524574);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var37 = -1;

         while (true) {
            label92: {
               char[] var46 = var30.toCharArray();
               int var10004 = var46.length;
               int var6 = 0;
               int var49 = var28;
               var42 = var46;
               int var35 = var10004;
               char[] var58;
               int var10006;
               if (var10004 <= 1) {
                  var58 = var46;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var49 = var28;
                  var35 = var10004;
                  if (var10004 <= var6) {
                     break label92;
                  }

                  var58 = var46;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % ll(-1816471557, var23 ^ -1763453867)) {
                     case 0 -> ll(-1816471558, var23 ^ -410619485);
                     case 1 -> ll(-1816471563, var23 ^ 1397533367);
                     case 2 -> ll(-1816471564, var23 ^ -1185359002);
                     case 3 -> ll(-1816471561, var23 ^ -312765085);
                     case 4 -> ll(-1816471562, var23 ^ 1651978052);
                     case 5 -> ll(-1816471567, var23 ^ -1946617421);
                     default -> ll(-1816471568, var23 ^ -295566052);
                  });
                  var6++;
                  if (var49 == 0) {
                     var10006 = var49;
                     var58 = var42;
                     var10004 = var49;
                  } else {
                     if (var35 <= var6) {
                        break;
                     }

                     var58 = var42;
                     var10004 = var49;
                     var10006 = var6;
                  }
               }
            }

            String var51 = new String(var42).intern();
            switch (var37) {
               case 0:
                  var5[var3++] = var51;
                  if ((var25 += var1) >= var4) {
                     Il = var5;
                     lI = new String[ll(-1816471560, var23 ^ 773550962)];
                     II = new String[ll(-1816471565, var23 ^ -717818108)];
                     II();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var51;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label97;
                  }

                  var4 = (var2 = III('ꏒ', '摃', var23 ^ 2091036821)).length();
                  var1 = ll(-1816471554, var23 ^ -1786166133);
                  var25 = -1;
            }

            var28 = ll(-1816471559, var23 ^ 1697639650);
            var30 = var2.substring(++var25, var25 + var1);
            var37 = 0;
         }
      }
   }

   @Override
   public void IlIII() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1687 != null && var1.method_1562() != null) {
         double var2 = this.I.IllI();
         var1.execute(this::Il);
         this.IlIllIl(false);
      } else {
         this.IlIllIl(false);
      }
   }

   private static String III(char var0, char var1, int var2) {
      int var3 = var0 ^ 'ꏓ';
      char[] var4 = IIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 20514;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 6965;
         var10 -= 38528;
         var10 ^= 62518;
         var10 ^= 23627;
         var10 ^= 54906;
         var10 ^= 37943;
         var10 += 18852;
         var10 ^= 54901;
         var10 -= 4673;
         var10 += 34418;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public IIlIIlI() {
      super(IlIIllIII.Ill(II[0]), lllIIlIl.III, IlIIllIII.Ill(II[1]));
      this.I = this.IllIIll(new IIlIII(IlIIllIII.Ill(II[3]), 3.0, -10.0, 10.0, 1.0).IlII(IlIIllIII.lI(II[4])));
      this.ll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(II[2]), true));
   }

   private static int ll(int var0, int var1) {
      int var2 = III[var0 ^ -1816471555] ^ var1 ^ var0;
      var2 -= 25992;
      var2 += 27877;
      var2 -= 32495;
      var2 -= 56136;
      var2 += 34975;
      return var2 + 53714;
   }

   private static String I(int var0, int var1) {
      int var9 = -1332900319;
      int var2 = (var0 ^ ll(-1816471566, var9 ^ 857341092)) & ll(-1816471571, var9 ^ -101322353);
      if (lI[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & ll(-1816471572, var9 ^ 1990704794)) {
            case 0 -> ll(-1816471569, var9 ^ 1870730209);
            case 1 -> ll(-1816471570, var9 ^ -207684360);
            case 2 -> ll(-1816471575, var9 ^ -15052527);
            case 3 -> ll(-1816471576, var9 ^ -179767585);
            case 4 -> ll(-1816471573, var9 ^ -467419419);
            case 5 -> ll(-1816471574, var9 ^ -726812786);
            case 6 -> ll(-1816471579, var9 ^ -969465380);
            case 7 -> ll(-1816471580, var9 ^ -464934900);
            case 8 -> ll(-1816471577, var9 ^ -163981895);
            case 9 -> ll(-1816471578, var9 ^ 735099620);
            case 10 -> ll(-1816471583, var9 ^ -762350884);
            case 11 -> ll(-1816471584, var9 ^ 460438315);
            case 12 -> ll(-1816471581, var9 ^ 1569638143);
            case 13 -> ll(-1816471582, var9 ^ -1779160122);
            case 14 -> ll(-1816471587, var9 ^ -1341705153);
            case 15 -> ll(-1816471588, var9 ^ -1717573383);
            case 16 -> ll(-1816471585, var9 ^ 1941848735);
            case 17 -> ll(-1816471586, var9 ^ 1340999711);
            case 18 -> ll(-1816471591, var9 ^ -407828104);
            case 19 -> ll(-1816471592, var9 ^ -886491195);
            case 20 -> ll(-1816471589, var9 ^ 924414256);
            case 21 -> ll(-1816471590, var9 ^ -1561653220);
            case 22 -> ll(-1816471595, var9 ^ -580371377);
            case 23 -> ll(-1816471596, var9 ^ 1406442475);
            case 24 -> ll(-1816471593, var9 ^ 153869537);
            case 25 -> ll(-1816471594, var9 ^ 1450589076);
            case 26 -> ll(-1816471599, var9 ^ 875686469);
            case 27 -> ll(-1816471600, var9 ^ 583703052);
            case 28 -> ll(-1816471597, var9 ^ -1900645626);
            case 29 -> ll(-1816471598, var9 ^ 899386340);
            case 30 -> ll(-1816471603, var9 ^ -587115449);
            case 31 -> ll(-1816471604, var9 ^ 1990228522);
            case 32 -> ll(-1816471601, var9 ^ 770232993);
            case 33 -> ll(-1816471602, var9 ^ 465961127);
            case 34 -> ll(-1816471607, var9 ^ 344474939);
            case 35 -> ll(-1816471608, var9 ^ -2022192292);
            case 36 -> ll(-1816471605, var9 ^ 251580799);
            case 37 -> ll(-1816471606, var9 ^ -1453480207);
            case 38 -> ll(-1816471611, var9 ^ -211900213);
            case 39 -> ll(-1816471612, var9 ^ -309052559);
            case 40 -> ll(-1816471609, var9 ^ 355172301);
            case 41 -> ll(-1816471610, var9 ^ 894471964);
            case 42 -> ll(-1816471615, var9 ^ -2092740382);
            case 43 -> ll(-1816471616, var9 ^ 1329052010);
            case 44 -> ll(-1816471613, var9 ^ 689052070);
            case 45 -> ll(-1816471614, var9 ^ -2108611499);
            case 46 -> ll(-1816471619, var9 ^ 1970894428);
            case 47 -> ll(-1816471620, var9 ^ 401711633);
            case 48 -> ll(-1816471617, var9 ^ 2053289470);
            case 49 -> ll(-1816471618, var9 ^ 1117489335);
            case 50 -> ll(-1816471623, var9 ^ -1677785332);
            case 51 -> ll(-1816471624, var9 ^ 1770041399);
            case 52 -> ll(-1816471621, var9 ^ 703267530);
            case 53 -> ll(-1816471622, var9 ^ 1655109701);
            case 54 -> ll(-1816471627, var9 ^ 360125093);
            case 55 -> ll(-1816471628, var9 ^ 2089763557);
            case 56 -> ll(-1816471625, var9 ^ 507968278);
            case 57 -> ll(-1816471626, var9 ^ -617887114);
            case 58 -> ll(-1816471631, var9 ^ -182803464);
            case 59 -> ll(-1816471632, var9 ^ -2124578049);
            case 60 -> ll(-1816471629, var9 ^ 151730126);
            case 61 -> ll(-1816471630, var9 ^ 1857567554);
            case 62 -> ll(-1816471635, var9 ^ 1699629340);
            case 63 -> ll(-1816471636, var9 ^ 1515543691);
            case 64 -> ll(-1816471633, var9 ^ 923494891);
            case 65 -> ll(-1816471634, var9 ^ -1289874351);
            case 66 -> ll(-1816471639, var9 ^ 1117158696);
            case 67 -> ll(-1816471640, var9 ^ -1393562294);
            case 68 -> ll(-1816471637, var9 ^ -625981709);
            case 69 -> ll(-1816471638, var9 ^ 1391992923);
            case 70 -> ll(-1816471643, var9 ^ -1643726232);
            case 71 -> ll(-1816471644, var9 ^ 833886454);
            case 72 -> ll(-1816471641, var9 ^ -1767614993);
            case 73 -> ll(-1816471642, var9 ^ 466617206);
            case 74 -> ll(-1816471647, var9 ^ 142318974);
            case 75 -> ll(-1816471648, var9 ^ 760959312);
            case 76 -> ll(-1816471645, var9 ^ -947891306);
            case 77 -> ll(-1816471646, var9 ^ -206322235);
            case 78 -> ll(-1816471651, var9 ^ 204289276);
            case 79 -> 2;
            case 80 -> ll(-1816471652, var9 ^ -2101193794);
            case 81 -> ll(-1816471649, var9 ^ 1347054569);
            case 82 -> ll(-1816471650, var9 ^ 1932073671);
            case 83 -> ll(-1816471655, var9 ^ -863916806);
            case 84 -> ll(-1816471656, var9 ^ -255693753);
            case 85 -> ll(-1816471653, var9 ^ 1430898872);
            case 86 -> ll(-1816471654, var9 ^ -917963342);
            case 87 -> ll(-1816471659, var9 ^ -576779939);
            case 88 -> ll(-1816471660, var9 ^ -1424084097);
            case 89 -> ll(-1816471657, var9 ^ 177614730);
            case 90 -> ll(-1816471658, var9 ^ 193704043);
            case 91 -> ll(-1816471663, var9 ^ 2060478691);
            case 92 -> ll(-1816471664, var9 ^ -233025421);
            case 93 -> ll(-1816471661, var9 ^ -1491581256);
            case 94 -> ll(-1816471662, var9 ^ -818217506);
            case 95 -> ll(-1816471667, var9 ^ -1702643867);
            case 96 -> ll(-1816471668, var9 ^ 352853884);
            case 97 -> ll(-1816471665, var9 ^ -724580569);
            case 98 -> 1;
            case 99 -> ll(-1816471666, var9 ^ 1236496037);
            case 100 -> ll(-1816471671, var9 ^ 1157026768);
            case 101 -> ll(-1816471672, var9 ^ -71450474);
            case 102 -> ll(-1816471669, var9 ^ -1754305739);
            case 103 -> ll(-1816471670, var9 ^ 346955199);
            case 104 -> ll(-1816471675, var9 ^ -1653893527);
            case 105 -> ll(-1816471676, var9 ^ -688664772);
            case 106 -> ll(-1816471673, var9 ^ 1373789577);
            case 107 -> ll(-1816471674, var9 ^ -1489627588);
            case 108 -> ll(-1816471679, var9 ^ 1234146575);
            case 109 -> ll(-1816471680, var9 ^ -605956211);
            case 110 -> ll(-1816471677, var9 ^ 373070158);
            case 111 -> ll(-1816471678, var9 ^ -1920043021);
            case 112 -> ll(-1816471683, var9 ^ 181735714);
            case 113 -> ll(-1816471684, var9 ^ 1239112743);
            case 114 -> ll(-1816471681, var9 ^ -1665738424);
            case 115 -> ll(-1816471682, var9 ^ 143499128);
            case 116 -> 5;
            case 117 -> ll(-1816471687, var9 ^ -518042423);
            case 118 -> ll(-1816471688, var9 ^ 226012915);
            case 119 -> ll(-1816471685, var9 ^ 1341126435);
            case 120 -> ll(-1816471686, var9 ^ 1467584931);
            case 121 -> ll(-1816471691, var9 ^ 1554188673);
            case 122 -> ll(-1816471692, var9 ^ 1778618993);
            case 123 -> ll(-1816471689, var9 ^ -2083528944);
            case 124 -> ll(-1816471690, var9 ^ -1596391041);
            case 125 -> ll(-1816471695, var9 ^ -1279279687);
            case 126 -> ll(-1816471696, var9 ^ 859619292);
            case 127 -> ll(-1816471693, var9 ^ 1161080770);
            case 128 -> ll(-1816471694, var9 ^ 218779990);
            case 129 -> ll(-1816471699, var9 ^ 572268898);
            case 130 -> ll(-1816471700, var9 ^ -1242008044);
            case 131 -> ll(-1816471697, var9 ^ 2139329967);
            case 132 -> ll(-1816471698, var9 ^ -1053129149);
            case 133 -> ll(-1816471703, var9 ^ 1961243897);
            case 134 -> ll(-1816471704, var9 ^ -1135970146);
            case 135 -> ll(-1816471701, var9 ^ 1590840585);
            case 136 -> ll(-1816471702, var9 ^ 992580541);
            case 137 -> ll(-1816471707, var9 ^ -1257365708);
            case 138 -> ll(-1816471708, var9 ^ 31658063);
            case 139 -> ll(-1816471705, var9 ^ -971686657);
            case 140 -> ll(-1816471706, var9 ^ 853413397);
            case 141 -> ll(-1816471711, var9 ^ -59725414);
            case 142 -> ll(-1816471712, var9 ^ -726516657);
            case 143 -> ll(-1816471709, var9 ^ 892567587);
            case 144 -> ll(-1816471710, var9 ^ 994027693);
            case 145 -> ll(-1816471715, var9 ^ -1729037902);
            case 146 -> ll(-1816471716, var9 ^ 1052182451);
            case 147 -> ll(-1816471713, var9 ^ -628044184);
            case 148 -> ll(-1816471714, var9 ^ 4055745);
            case 149 -> ll(-1816471719, var9 ^ -511453038);
            case 150 -> ll(-1816471720, var9 ^ -1655960753);
            case 151 -> ll(-1816471717, var9 ^ 1535066105);
            case 152 -> ll(-1816471718, var9 ^ -1687235640);
            case 153 -> ll(-1816471723, var9 ^ -1039987645);
            case 154 -> ll(-1816471724, var9 ^ 471009392);
            case 155 -> ll(-1816471721, var9 ^ 1505029649);
            case 156 -> ll(-1816471722, var9 ^ 1376064729);
            case 157 -> ll(-1816471727, var9 ^ -85622514);
            case 158 -> ll(-1816471728, var9 ^ -1512706539);
            case 159 -> ll(-1816471725, var9 ^ -1050477726);
            case 160 -> ll(-1816471726, var9 ^ 270909912);
            case 161 -> ll(-1816471731, var9 ^ 1843271072);
            case 162 -> ll(-1816471732, var9 ^ 740194241);
            case 163 -> ll(-1816471729, var9 ^ -553013155);
            case 164 -> ll(-1816471730, var9 ^ 219562591);
            case 165 -> ll(-1816471735, var9 ^ 1079980753);
            case 166 -> ll(-1816471736, var9 ^ 795959918);
            case 167 -> ll(-1816471733, var9 ^ -938541386);
            case 168 -> ll(-1816471734, var9 ^ 558239258);
            case 169 -> ll(-1816471739, var9 ^ -168399457);
            case 170 -> ll(-1816471740, var9 ^ 2061115349);
            case 171 -> ll(-1816471737, var9 ^ 1577377059);
            case 172 -> ll(-1816471738, var9 ^ -1130258757);
            case 173 -> 3;
            case 174 -> ll(-1816471743, var9 ^ -1039919975);
            case 175 -> ll(-1816471744, var9 ^ -390580425);
            case 176 -> ll(-1816471741, var9 ^ 985413279);
            case 177 -> ll(-1816471742, var9 ^ 2141359245);
            case 178 -> ll(-1816471747, var9 ^ 741061945);
            case 179 -> ll(-1816471748, var9 ^ -613252201);
            case 180 -> ll(-1816471745, var9 ^ -2087546289);
            case 181 -> ll(-1816471746, var9 ^ -50512520);
            case 182 -> ll(-1816471751, var9 ^ 149246761);
            case 183 -> ll(-1816471752, var9 ^ -1297149295);
            case 184 -> ll(-1816471749, var9 ^ 169389468);
            case 185 -> ll(-1816471750, var9 ^ 1115513837);
            case 186 -> ll(-1816471755, var9 ^ 1477978716);
            case 187 -> ll(-1816471756, var9 ^ -1319518302);
            case 188 -> ll(-1816471753, var9 ^ 1323916706);
            case 189 -> ll(-1816471754, var9 ^ 2023111769);
            case 190 -> ll(-1816471759, var9 ^ -2078651517);
            case 191 -> ll(-1816471760, var9 ^ 266529087);
            case 192 -> ll(-1816471757, var9 ^ -43484314);
            case 193 -> ll(-1816471758, var9 ^ -1606125006);
            case 194 -> ll(-1816471763, var9 ^ -1697919757);
            case 195 -> ll(-1816471764, var9 ^ 784864062);
            case 196 -> ll(-1816471761, var9 ^ -645977114);
            case 197 -> ll(-1816471762, var9 ^ -2103678336);
            case 198 -> ll(-1816471767, var9 ^ -1414658985);
            case 199 -> ll(-1816471768, var9 ^ 1083939131);
            case 200 -> ll(-1816471765, var9 ^ 753197202);
            case 201 -> 4;
            case 202 -> ll(-1816471766, var9 ^ 322830438);
            case 203 -> ll(-1816471771, var9 ^ 1203457915);
            case 204 -> ll(-1816471772, var9 ^ 1948073624);
            case 205 -> ll(-1816471769, var9 ^ -1945013312);
            case 206 -> ll(-1816471770, var9 ^ 64239662);
            case 207 -> ll(-1816471775, var9 ^ -360545460);
            case 208 -> ll(-1816471776, var9 ^ -585308466);
            case 209 -> ll(-1816471773, var9 ^ -1220726147);
            case 210 -> ll(-1816471774, var9 ^ 476680970);
            case 211 -> ll(-1816471779, var9 ^ 1499084550);
            case 212 -> ll(-1816471780, var9 ^ 1500844280);
            case 213 -> ll(-1816471777, var9 ^ 1782434124);
            case 214 -> ll(-1816471778, var9 ^ -340045488);
            case 215 -> ll(-1816471783, var9 ^ -1688141471);
            case 216 -> ll(-1816471784, var9 ^ 193533210);
            case 217 -> ll(-1816471781, var9 ^ -623940251);
            case 218 -> ll(-1816471782, var9 ^ -1067562486);
            case 219 -> ll(-1816471787, var9 ^ 264225515);
            case 220 -> ll(-1816471788, var9 ^ 591864736);
            case 221 -> ll(-1816471785, var9 ^ 156043653);
            case 222 -> ll(-1816471786, var9 ^ 1473910546);
            case 223 -> ll(-1816471791, var9 ^ 2015506357);
            case 224 -> ll(-1816471792, var9 ^ -1970086054);
            case 225 -> ll(-1816471789, var9 ^ -1183473099);
            case 226 -> ll(-1816471790, var9 ^ 947146112);
            case 227 -> ll(-1816471795, var9 ^ -1770613009);
            case 228 -> ll(-1816471796, var9 ^ 1204304184);
            case 229 -> ll(-1816471793, var9 ^ 261158438);
            case 230 -> ll(-1816471794, var9 ^ -2104920430);
            case 231 -> ll(-1816471799, var9 ^ 1853837650);
            case 232 -> ll(-1816471800, var9 ^ 2126887677);
            case 233 -> ll(-1816471797, var9 ^ 147606804);
            case 234 -> ll(-1816471798, var9 ^ 1791212690);
            case 235 -> ll(-1816471803, var9 ^ -1892161924);
            case 236 -> ll(-1816471804, var9 ^ 984513413);
            case 237 -> ll(-1816471801, var9 ^ 297852722);
            case 238 -> ll(-1816471802, var9 ^ 595062169);
            case 239 -> ll(-1816471807, var9 ^ 2068265329);
            case 240 -> ll(-1816471808, var9 ^ -2021645897);
            case 241 -> ll(-1816471805, var9 ^ -1304028409);
            case 242 -> ll(-1816471806, var9 ^ -1146862922);
            case 243 -> ll(-1816471811, var9 ^ 1182458939);
            case 244 -> 0;
            case 245 -> ll(-1816471812, var9 ^ 1022369840);
            case 246 -> ll(-1816471809, var9 ^ 262265418);
            case 247 -> ll(-1816471810, var9 ^ 1327503728);
            case 248 -> ll(-1816471815, var9 ^ -423188621);
            case 249 -> ll(-1816471816, var9 ^ 1199802788);
            case 250 -> ll(-1816471813, var9 ^ 2083156414);
            case 251 -> ll(-1816471814, var9 ^ 68051848);
            case 252 -> ll(-1816471819, var9 ^ -1552183766);
            case 253 -> ll(-1816471820, var9 ^ 480812169);
            case 254 -> ll(-1816471817, var9 ^ -1690392652);
            default -> ll(-1816471818, var9 ^ 1393882768);
         };
         int var5 = (var1 & ll(-1816471823, var9 ^ 1137647636)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(-1816471824, var9 ^ -1590529687)) >>> ll(-1816471821, var9 ^ -2024146274)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(-1816471822, var9 ^ 1483325673);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(-1816471827, var9 ^ 1451271441);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   private void l(class_310 var1, class_746 var2, double var3) {
      if (var2 != null && !(Math.abs(var3) < 1.0E-4)) {
         double var5 = var2.method_23317();
         double var7 = var2.method_23318() + var3;
         double var9 = var2.method_23321();
         var2.method_5814(var5, var7, var9);
         IIlllIllI.IllI(var2, var5);
         IIlllIllI.IIIIl(var2, var7);
         IIlllIllI.IlIl(var2, var9);
         IIlllIllI.lI(var2, 0);
         IIll.IlllIlI(var1, var5, var7, var9, var2.method_24828());
         if (this.ll.IllI()) {
            var2.method_18800(0.0, 0.0, 0.0);
         }

         var2.field_6017 = 0.0;
      }
   }

   private static void II() {
      int var0 = -283356560;
      II[0] = lI(I(ll(-1816471828, var0 ^ 250076360), ll(-1816471825, var0 ^ -1828330612)).toCharArray(), 17914L, ll(-1816471826, var0 ^ -380655721));
      II[1] = lI(I(ll(-1816471831, var0 ^ -1455534588), ll(-1816471832, var0 ^ 881544328)).toCharArray(), 7748L, ll(-1816471829, var0 ^ 729966631));
      II[2] = lI(I(ll(-1816471830, var0 ^ 166900152), ll(-1816471835, var0 ^ -1222287061)).toCharArray(), 51357L, ll(-1816471836, var0 ^ -49724658));
      II[3] = lI(I(ll(-1816471833, var0 ^ -300351455), ll(-1816471834, var0 ^ 372880240)).toCharArray(), 81144L, ll(-1816471839, var0 ^ 562325909));
      II[4] = lI(I(ll(-1816471840, var0 ^ 467963925), ll(-1816471837, var0 ^ 1997183163)).toCharArray(), 11153L, ll(-1816471838, var0 ^ -89199428));
      II[5] = lI(I(ll(-1816471843, var0 ^ -1176591745), ll(-1816471844, var0 ^ -570154435)).toCharArray(), 67993L, ll(-1816471841, var0 ^ -2081650617));
   }

   @Override
   public String IlIIl() {
      return String.format(Locale.ROOT, IlIIllIII.lI(II[5]), this.I.IllI());
   }

   private void Il(class_310 var1, double var2) {
      this.l(var1, var1.field_1724, var2);
   }

   private static String lI(char[] var0, long var1, int var3) {
      int var4 = ll(-1816471842, -1470694099 ^ -635944606) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(-1816471847, -1470694099 ^ -993389282);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
