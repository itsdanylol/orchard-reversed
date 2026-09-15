package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class IlIllIll extends IlIIIIIIl implements IIIIIlII {
   private static final Object[] lll;
   private final IIlIII I;
   private static final int[] lIl;
   private static final String[] llI;
   private final IIlIII II;
   private final IIlIII Il;
   private static final String[] lI;
   private static final IIIllIIl ll;
   private static final String[] III;
   private static final double IIl = 18.0;
   private static String[] IlI;
   private static final double Ill = 4.0;
   private static final double lII = 7.0;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = lII(-722894001, -2057381809 ^ 1937658477) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lII(-722894004, -2057381809 ^ -1718946524);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public double IIIl() {
      return 18.0 * this.lI();
   }

   private double l(class_327 var1, String var2) {
      return 14.0 + IlIIlllIl.IIl(var1, IlIIllIII.lI(IlI[0])) + 4.0 + IlIIlllIl.IIl(var1, var2);
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      this.II(var1, false);
   }

   @Override
   public double IIllI() {
      class_310 var1 = class_310.method_1551();
      return var1 != null && var1.field_1772 != null ? this.l(var1.field_1772, this.Il()) * this.lI() : 42.0 * this.lI();
   }

   @Override
   public void IIIII(class_332 var1, int var2, int var3, float var4) {
      this.II(var1, false);
   }

   private void II(class_332 var1, boolean var2) {
      class_310 var3 = class_310.method_1551();
      if (var1 != null && var3 != null && var3.field_1772 != null) {
         double var4 = this.lI();
         double var6 = this.lll();
         double var8 = this.ll();
         class_327 var10 = var3.field_1772;
         String var11 = IlIIllIII.lI(IlI[0]);
         String var12 = this.Il();
         double var13 = this.l(var10, var12);
         IlIIlllIl.IIllll(var1);
         IlIIlllIl.IlIIlI(var1, var6, var8);
         IlIIlllIl.llIIIl(var1, var4, var4);

         try {
            IIIlIllII.llI(var1, ll, 0.0, 0.0, var13, 18.0, var2);
            double var15 = 7.0;
            double var17 = var15 + IlIIlllIl.IIl(var10, var11) + 4.0;
            double var19 = (18.0 - 9.0) * 0.5;
            IlIIlllIl.Illl(true, IlIllIll::III);
            IlIIlllIl.IIll(var1, var10, var12, var17, var19, IIIlIllII.lII(lII(-722894003, 2014011029 ^ -1145705561)));
         } finally {
            IlIIlllIl.lIIIll(var1);
         }
      }
   }

   private static String lIl(int var0, char var1, char var2) {
      int var3 = var1 ^ 12631;
      char[] var4 = llI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 30193;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 18721;
         var10 += 4656;
         var10 ^= 53596;
         var10 ^= 55326;
         var10 ^= 12018;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public boolean llII(double var1, double var3) {
      return var1 >= this.lll() && var1 <= this.lll() + this.IIllI() && var3 >= this.ll() && var3 <= this.ll() + this.IIIl();
   }

   private String Il() {
      return String.valueOf(class_310.method_1551().method_47599());
   }

   public IlIllIll() {
      super(IlIIllIII.Ill(IlI[1]), lllIIlIl.II, IlIIllIII.Ill(IlI[5]));
      this.Il = this.IllIIll(new IIlIII(IlIIllIII.Ill(IlI[2]), 18.0, 0.0, 4000.0, 1.0).IlII(IlIIllIII.lI(IlI[3])));
      this.I = this.IllIIll(new IIlIII(IlIIllIII.Ill(IlI[4]), 72.0, 0.0, 4000.0, 1.0).IlII(IlIIllIII.lI(IlI[3])));
      this.II = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IlI[lII(-722893998, -282193582 ^ 1556007992)]), 100.0, 75.0, 200.0, 5.0)
            .IlII(IlIIllIII.lI(IlI[lII(-722893997, -282193582 ^ -952733968)]))
      );
   }

   private double lI() {
      return this.II.IllI() / 100.0;
   }

   @Override
   public double lll() {
      return this.Il.IllI();
   }

   private static void III(class_332 var0, class_327 var1, String var2, double var3, double var5) {
      IlIIlllIl.IIll(var0, var1, var2, var3, var5, IIIlIllII.lII(lII(-722894000, -16878002 ^ 30437861)));
   }

   private static void IIl() {
      int var0 = -924109580;
      IlI[0] = I(Ill(lII(-722893999, var0 ^ 712221326), lII(-722893994, var0 ^ -200400030)).toCharArray(), 15547L, lII(-722893993, var0 ^ 921839977));
      IlI[1] = I(Ill(lII(-722893996, var0 ^ -634292865), lII(-722893995, var0 ^ -1824876754)).toCharArray(), 48960L, lII(-722893990, var0 ^ -1745465141));
      IlI[2] = I(Ill(lII(-722893989, var0 ^ 1467857382), lII(-722893992, var0 ^ 1540484741)).toCharArray(), 71342L, lII(-722893991, var0 ^ 1484534224));
      IlI[3] = I(Ill(lII(-722893986, var0 ^ -1192804462), lII(-722893985, var0 ^ -455953644)).toCharArray(), 91490L, lII(-722893988, var0 ^ 1266132219));
      IlI[4] = I(Ill(lII(-722893987, var0 ^ -1637755723), lII(-722893982, var0 ^ -1439724783)).toCharArray(), 705L, lII(-722893981, var0 ^ 155713165));
      IlI[5] = I(Ill(lII(-722893984, var0 ^ 1845536115), lII(-722893983, var0 ^ 1805764612)).toCharArray(), 55969L, lII(-722893978, var0 ^ -2104177422));
      IlI[lII(-722893977, var0 ^ 18967075)] = I(
         Ill(lII(-722893980, var0 ^ -1602232797), lII(-722893979, var0 ^ 1687304251)).toCharArray(), 19520L, lII(-722893974, var0 ^ -1859805924)
      );
      IlI[lII(-722893973, var0 ^ -72717341)] = I(
         Ill(lII(-722893976, var0 ^ -1901493953), lII(-722893975, var0 ^ 937316805)).toCharArray(), 76025L, lII(-722893970, var0 ^ 380725637)
      );
   }

   @Override
   public void lllI(double var1, double var3) {
      this.Il.Ill(Math.max(0.0, var1));
      this.I.Ill(Math.max(0.0, var3));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1468916807;
      int var14 = "Q幵延ꁖⅽ㢉㊘꺘寴戰硉솋佥ᓇ屩\ued17컂浿ᇽគ챦譕䴤윁䞧墎徠뷣͢﨏釆\uedda출\u05ee䝢\ued92䏅\udc51∔窙Яꚿ\ue7ae\uf3c5\uf464樭ࣻ㭣ṣ\ud9b9還褛匷끈耚偼\ufbc8ﳝ暘搢鑵\ue85bꤑ倊䣝터\uee22㴢鹕啍ᷨ兜ꦣ\uf89a\udd75℡僒㴢쏌ね竝즘\rꠧꔕ\udc1b珑﹁\ue7f6곈浧뀍ᴡᑀꍘ㈥"
         .length();
      String var13 = "Q幵延ꁖⅽ㢉㊘꺘寴戰硉솋佥ᓇ屩\ued17컂浿ᇽគ챦譕䴤윁䞧墎徠뷣͢﨏釆\uedda출\u05ee䝢\ued92䏅\udc51∔窙Яꚿ\ue7ae\uf3c5\uf464樭ࣻ㭣ṣ\ud9b9還褛匷끈耚偼\ufbc8ﳝ暘搢鑵\ue85bꤑ倊䣝터\uee22㴢鹕啍ᷨ兜ꦣ\uf89a\udd75℡僒㴢쏌ね竝즘\rꠧꔕ\udc1b珑﹁\ue7f6곈浧뀍ᴡᑀꍘ㈥";
      int var17 = 0;
      int var16 = 0;
      short var18 = 22718;
      String[] var15 = new String[2];

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 54;
               case 1 -> 158;
               case 2 -> 138;
               case 3 -> 139;
               case 4 -> 224;
               case 5 -> 44;
               case 6 -> 139;
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

      llI = var15;
      lll = new Object[var15.length];
      int var9 = 493878446;
      byte[] var7 = "R$\u001e\u0084ö\u0006\u0085\u008fÙE÷¯tK\u001eí\u0004Ôoôc\u009e\u0086\u0014´³¶µqòI\u0090.ÜÚ]%øxw\u009f \u008d\u0083²Ó\u0092\u009bàóÑÞRþZ#*¯q\"õÅép\u0085ë\u0080%\u001ec\"íÉU[ôÔã\u0080>\n\u009e`\u00adèµ|é$¡WÉm«\u0006öp\"VU©í\u009b^¥AÒ5Ù\u0015_'Fw\u001d#\u001aBÛ\u001c\u008fqZ|`ñö\u0005T¿ÿ¸Ã?ÂÎ\u0090\u0090\u0087ý\u00950]s§¶Iuÿ±\u0003¬^ïü«\u009a\u0002iyi²µÐ\u0005:\u0002ap9£·ÉO´\u0005QxßeN?ÐFú`(\u0098ý\u008fO¤T\u0017\u0088ç-¤È\u007fåÇºÉÖ\u001fÄ»¢\u0093D·R\u008f¿~C\\PS°ÇÜwHÑ\u000eG·ÞÔ\u0091#R\u0096[¤3-Ôbm\u009dÕ?\u0013~tÎÀg\u0086\u0087Õ\u0096~ßÈò±\u0084\u008a\u0007a\u000f\u0010_ñ\u009f\u001f Ï\u008b=[Ü3æ\u001a@û\u00032°\u0094Xõ8'#Å\u0087¤aõÊ¼90kp\u008b\u0000ü^÷¤ºÉÜ)\tæ=\u0012\u0004Y;SrùA\u009bEÓt\b$\";äd\u0087\u0098\u0012\u0015Kû¡BÙ@þ\u0088\u0091û\u0018ò\u0013mù%ÓÉÏÕã\u0014}\u0006\u0015>\u008bvà'ÇGÝ\u001aÓ2¸2¯2\u007f\u008fj¤\u001aIÁ\\ÚÃÌ¾¤Çu'û\u0096\u008bÕ0\u0092\u009eBbNo\b\u0018³µ\u0092Ðôü\u009f£1\u008b\u009faª?´\u009d¸öG³æh(. §\u008cÏì\u0098²\u008eY©<+0\u0010îøïd\u001f¥kF*1¹\u0088\t\u0005\"ªõe\u0018fqú\u0018ÿÁÖõ\u0000f\u008eÙ\u0096v\b`\u0083ó\u001aÏº\u000fE\u007fÂûýõÂ\u0080\u0006Ò³hQ:nÓ·¯5Ó0R\u0094üZ\u00009Gg\u0012Öy]Õ\t7S\u0083A\u007f\\}ÍFôë,\u0091åÜÁ\u001e=!\u001d\u0089jC5\u0010om~N9\u0013Úp¥\u0019T\u0091Êïÿx¯²4£ðÄ\n£\u0010\u0019ç2[\u009cÞ3\r\u000b\u00062lØ\u0092ö\u001c\u0092ÃP.¿á\u0017\u0005Ô\u0006²ç¶DÉ;¥WàULã.·gøût\u009bJZ,¾ªñÿG° S\u0003uy\"äð\u008e¦Ñ\u001f\u0088xÖ\u001f¿×ËN\u0096(\u0095^ø\u0096¢®îº°~\u0010\u009f¢H`Ù÷¡âtJ¹\u0005âû/\u008bý6l]\u009cl\u0004Ù5\nÅ}\u0095÷\u0001.Ì+õöÔ\u009c ë\u0017Ü$\u0001f\u0095õf\u0090¤ãÏõex\u0014`\u0086§ù< N\"D\u0082ó(n2h!\u0087\u0000ýd·\u0098\u00adÆ.ÅÏ\u000brÙ¾YsAã@\u0081X\u0097¤\u0006í\\¾+  UÏ32\u0019m&ow\u009c>\u007f9\u0095®QÔP/í\u0000DÞlRÊ\u0095´\rvó\n\t\u0006\u000eI\u0006Ææ\u0080\u009béI\u0013õ¼4º\u00944jeý\u0081¬Dx\\c\u008a\u001f5ÑiÞ\u0012\u0084M\u0093HÑB\u0084$ä«åg=j\u0087\u0096<wB§êM\u0089Î\u0012\u008a\u0083½\u001fÄË\f\u0003£%:E)\u0003³PNl2G\u0006O\u0084è5)`PªÝ8\u0014+i;D4c\u0086¡È\u0003y\u000e¸ê\u0005T\u0006ÙK¿Ýø\u0091\u0088\u009eF\u001f\u0091®c_Ö\u0088\u0006bQËEU\u001a\u0085lühSúhM\u0007#`\u007fm¨\"\u0090·Û0ÆÃ\u0092dv\u0018¢\u0083\u0015è\u0091\u009dd£µ\u0014\u0014\u0086jY\u008fnÓø\u0002Bà'´7ÊÞ>~Ì:ÙWH¼[sà\u0082\u0095¢+Ä¸u«\u0085¿ü±L\u0080ÄP\u000fÚ\u0080å\u0018¸:ä\u008dâÎXÓ¹ÖÀ\u008f&.;ó\u0097\u0093â\t~6¶\u0080\u0081=;ÚeöoÍ|Ø$é\u009f@\u00110\u0016©aãÑUØE°\u009d\u0014\u0005ÑÔ\u0086A,\u0001\u0086\u0092[Ìv\u0085\u0000\u009dø®ákÜ°=¹\u0082\u0084lM¥ó&\u0007áÀJi®ñXÔoQ9¥9Yy\u008c\u000b\u008b\u0091ýèÿ<å\u0013W\u008bXý&0\u0005C\u0007\u008c\u0087Ô\u000by\u0091Ã\u0010±Ê\u0015S\u0087\u0091\u0089ûk7·ô\u000f\u009cüÓ4<\u0006¾#êYæÞõ£Wå4\u001a¸·{\u0001\u009d\u000b\u001a¸\u0093á\u001cÊ\u0084¤Ç\u009e\u0091»å9\u0085\u0089VÄ\u0097\u0014A\\NL>ÎÿìÔ³®§\u0088È¹Ù~\u009b;C\u0094\u0084\u0007\u0003Ý4"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lIl = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lIl[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lII(-722894014, var23 ^ -869443483)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIl(var23 ^ 689649309, 'ㅗ', '\ue942')).length();
      char var1 = 4;
      int var25 = -1;

      label99:
      while (true) {
         int var28 = lII(-722894013, var23 ^ 1745863480);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label94: {
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
                     break label94;
                  }

                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % lII(-722894010, var23 ^ -1696782058)) {
                     case 0 -> lII(-722894009, var23 ^ -40386223);
                     case 1 -> lII(-722894012, var23 ^ 716894247);
                     case 2 -> lII(-722894011, var23 ^ -268759242);
                     case 3 -> lII(-722894006, var23 ^ -1328177994);
                     case 4 -> lII(-722894005, var23 ^ -1141817645);
                     case 5 -> lII(-722894008, var23 ^ 19516270);
                     default -> lII(-722894007, var23 ^ 752538625);
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
                     III = var5;
                     lI = new String[lII(-722894015, var23 ^ -364750833)];
                     IlI = new String[lII(-722894002, var23 ^ 2130351923)];
                     IIl();
                     ll = IIIllIIl.Ill;
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var49;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label99;
                  }

                  var4 = (var2 = lIl(var23 ^ 529612126, 'ㅖ', '寔')).length();
                  var1 = 4;
                  var25 = -1;
            }

            var28 = lII(-722894016, var23 ^ 1196208459);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private static int lII(int var0, int var1) {
      int var2 = lIl[var0 ^ -722894014] ^ var1 ^ var0;
      var2 += 16382;
      var2 += 35378;
      var2 -= 6207;
      var2 += 37543;
      var2 += 55450;
      return var2 + 49186;
   }

   @Override
   public double ll() {
      return this.I.IllI();
   }

   private static String Ill(int var0, int var1) {
      int var9 = 1490297378;
      int var2 = (var0 ^ lII(-722893969, var9 ^ 546366480)) & lII(-722893972, var9 ^ -1798547501);
      if (lI[var2] == null) {
         char[] var3 = III[var2].toCharArray();

         int var4 = switch (var3[0] & lII(-722893971, var9 ^ -1826606610)) {
            case 0 -> lII(-722893966, var9 ^ 985200188);
            case 1 -> lII(-722893965, var9 ^ 1124841289);
            case 2 -> lII(-722893968, var9 ^ -1956067841);
            case 3 -> lII(-722893967, var9 ^ -1196377392);
            case 4 -> lII(-722893962, var9 ^ -868468126);
            case 5 -> lII(-722893961, var9 ^ 1008779530);
            case 6 -> 2;
            case 7 -> lII(-722893964, var9 ^ 770911757);
            case 8 -> lII(-722893963, var9 ^ -563567986);
            case 9 -> lII(-722893958, var9 ^ 645820652);
            case 10 -> lII(-722893957, var9 ^ -646862221);
            case 11 -> lII(-722893960, var9 ^ 1308485971);
            case 12 -> lII(-722893959, var9 ^ -895724819);
            case 13 -> lII(-722893954, var9 ^ 214098589);
            case 14 -> lII(-722893953, var9 ^ 1371275586);
            case 15 -> lII(-722893956, var9 ^ -1603331775);
            case 16 -> lII(-722893955, var9 ^ -377820809);
            case 17 -> lII(-722894078, var9 ^ -1318613897);
            case 18 -> lII(-722894077, var9 ^ -366642818);
            case 19 -> lII(-722894080, var9 ^ 1639915878);
            case 20 -> lII(-722894079, var9 ^ -240099427);
            case 21 -> lII(-722894074, var9 ^ -443407055);
            case 22 -> lII(-722894073, var9 ^ 1565091101);
            case 23 -> 0;
            case 24 -> lII(-722894076, var9 ^ -1783870370);
            case 25 -> lII(-722894075, var9 ^ -84440497);
            case 26 -> lII(-722894070, var9 ^ 1233959621);
            case 27 -> lII(-722894069, var9 ^ -892433650);
            case 28 -> lII(-722894072, var9 ^ -761901353);
            case 29 -> lII(-722894071, var9 ^ 505708458);
            case 30 -> lII(-722894066, var9 ^ 811129816);
            case 31 -> lII(-722894065, var9 ^ -1485613125);
            case 32 -> 4;
            case 33 -> lII(-722894068, var9 ^ -2003669969);
            case 34 -> lII(-722894067, var9 ^ 932457959);
            case 35 -> lII(-722894062, var9 ^ -1745951704);
            case 36 -> lII(-722894061, var9 ^ -1109690626);
            case 37 -> lII(-722894064, var9 ^ 1284807347);
            case 38 -> lII(-722894063, var9 ^ -382243832);
            case 39 -> lII(-722894058, var9 ^ 626319173);
            case 40 -> lII(-722894057, var9 ^ -1209040746);
            case 41 -> lII(-722894060, var9 ^ -11246009);
            case 42 -> lII(-722894059, var9 ^ 2109900371);
            case 43 -> lII(-722894054, var9 ^ -1117343295);
            case 44 -> lII(-722894053, var9 ^ -1917123996);
            case 45 -> lII(-722894056, var9 ^ 2073163151);
            case 46 -> lII(-722894055, var9 ^ -1903642571);
            case 47 -> lII(-722894050, var9 ^ -1279939155);
            case 48 -> lII(-722894049, var9 ^ -694300591);
            case 49 -> lII(-722894052, var9 ^ 287315407);
            case 50 -> lII(-722894051, var9 ^ 1961279461);
            case 51 -> lII(-722894046, var9 ^ -1267944908);
            case 52 -> lII(-722894045, var9 ^ -899151282);
            case 53 -> lII(-722894048, var9 ^ -1791363911);
            case 54 -> lII(-722894047, var9 ^ 1581113614);
            case 55 -> lII(-722894042, var9 ^ 216076579);
            case 56 -> lII(-722894041, var9 ^ 1981598513);
            case 57 -> lII(-722894044, var9 ^ -1101298806);
            case 58 -> lII(-722894043, var9 ^ -845220497);
            case 59 -> lII(-722894038, var9 ^ 252002739);
            case 60 -> lII(-722894037, var9 ^ -216561492);
            case 61 -> lII(-722894040, var9 ^ -582412657);
            case 62 -> lII(-722894039, var9 ^ 1083169203);
            case 63 -> lII(-722894034, var9 ^ -1589385624);
            case 64 -> lII(-722894033, var9 ^ -520693770);
            case 65 -> lII(-722894036, var9 ^ 1168076523);
            case 66 -> lII(-722894035, var9 ^ -1774183758);
            case 67 -> lII(-722894030, var9 ^ -876333005);
            case 68 -> lII(-722894029, var9 ^ 1595340553);
            case 69 -> lII(-722894032, var9 ^ 1804457071);
            case 70 -> lII(-722894031, var9 ^ 196548853);
            case 71 -> lII(-722894026, var9 ^ -1799913201);
            case 72 -> lII(-722894025, var9 ^ -1202028768);
            case 73 -> lII(-722894028, var9 ^ -529078028);
            case 74 -> lII(-722894027, var9 ^ 1724906837);
            case 75 -> lII(-722894022, var9 ^ 1952498727);
            case 76 -> lII(-722894021, var9 ^ 735100120);
            case 77 -> lII(-722894024, var9 ^ -1822770155);
            case 78 -> lII(-722894023, var9 ^ 1753074718);
            case 79 -> lII(-722894018, var9 ^ 1066733669);
            case 80 -> lII(-722894017, var9 ^ -654291979);
            case 81 -> lII(-722894020, var9 ^ 1593699008);
            case 82 -> lII(-722894019, var9 ^ 883902009);
            case 83 -> lII(-722893886, var9 ^ 163424289);
            case 84 -> lII(-722893885, var9 ^ 863664111);
            case 85 -> lII(-722893888, var9 ^ 1026309964);
            case 86 -> 1;
            case 87 -> lII(-722893887, var9 ^ 852669280);
            case 88 -> lII(-722893882, var9 ^ -1706798405);
            case 89 -> lII(-722893881, var9 ^ -1955348645);
            case 90 -> lII(-722893884, var9 ^ 1401840539);
            case 91 -> lII(-722893883, var9 ^ 82594455);
            case 92 -> lII(-722893878, var9 ^ 29491657);
            case 93 -> lII(-722893877, var9 ^ 1471980642);
            case 94 -> lII(-722893880, var9 ^ -877254052);
            case 95 -> lII(-722893879, var9 ^ -1539276604);
            case 96 -> lII(-722893874, var9 ^ -1055044780);
            case 97 -> lII(-722893873, var9 ^ -1637124842);
            case 98 -> lII(-722893876, var9 ^ 2125896037);
            case 99 -> lII(-722893875, var9 ^ 892575755);
            case 100 -> lII(-722893870, var9 ^ 1671723262);
            case 101 -> lII(-722893869, var9 ^ 41413803);
            case 102 -> lII(-722893872, var9 ^ 1916648848);
            case 103 -> lII(-722893871, var9 ^ 1074831130);
            case 104 -> lII(-722893866, var9 ^ 1803253943);
            case 105 -> lII(-722893865, var9 ^ -1994835445);
            case 106 -> lII(-722893868, var9 ^ 1426729412);
            case 107 -> lII(-722893867, var9 ^ 1004772821);
            case 108 -> lII(-722893862, var9 ^ -641169595);
            case 109 -> lII(-722893861, var9 ^ 439628821);
            case 110 -> lII(-722893864, var9 ^ 1108465000);
            case 111 -> lII(-722893863, var9 ^ -1847013754);
            case 112 -> lII(-722893858, var9 ^ 1034685186);
            case 113 -> lII(-722893857, var9 ^ 1280020221);
            case 114 -> lII(-722893860, var9 ^ -931241874);
            case 115 -> lII(-722893859, var9 ^ 377053546);
            case 116 -> lII(-722893854, var9 ^ -1184616117);
            case 117 -> lII(-722893853, var9 ^ 1178214646);
            case 118 -> lII(-722893856, var9 ^ -133312301);
            case 119 -> lII(-722893855, var9 ^ -736165798);
            case 120 -> lII(-722893850, var9 ^ -250792313);
            case 121 -> lII(-722893849, var9 ^ -1218912686);
            case 122 -> lII(-722893852, var9 ^ 451266416);
            case 123 -> lII(-722893851, var9 ^ -1940631149);
            case 124 -> lII(-722893846, var9 ^ -1818684876);
            case 125 -> lII(-722893845, var9 ^ -222070046);
            case 126 -> lII(-722893848, var9 ^ 1537587965);
            case 127 -> lII(-722893847, var9 ^ -78086303);
            case 128 -> lII(-722893842, var9 ^ -1568371957);
            case 129 -> lII(-722893841, var9 ^ -1171038390);
            case 130 -> lII(-722893844, var9 ^ 2037603295);
            case 131 -> lII(-722893843, var9 ^ 138054369);
            case 132 -> lII(-722893838, var9 ^ -32793214);
            case 133 -> lII(-722893837, var9 ^ -1681258981);
            case 134 -> lII(-722893840, var9 ^ 237623721);
            case 135 -> lII(-722893839, var9 ^ 1376727475);
            case 136 -> lII(-722893834, var9 ^ 707628165);
            case 137 -> lII(-722893833, var9 ^ 10294904);
            case 138 -> 5;
            case 139 -> lII(-722893836, var9 ^ -374373593);
            case 140 -> lII(-722893835, var9 ^ -650652728);
            case 141 -> lII(-722893830, var9 ^ 1080733971);
            case 142 -> lII(-722893829, var9 ^ 477544913);
            case 143 -> lII(-722893832, var9 ^ 502177033);
            case 144 -> lII(-722893831, var9 ^ -268965832);
            case 145 -> lII(-722893826, var9 ^ 1749164807);
            case 146 -> lII(-722893825, var9 ^ 1158667869);
            case 147 -> lII(-722893828, var9 ^ -1583592356);
            case 148 -> lII(-722893827, var9 ^ 59314533);
            case 149 -> lII(-722893950, var9 ^ -225377933);
            case 150 -> lII(-722893949, var9 ^ -83808726);
            case 151 -> lII(-722893952, var9 ^ 1048613692);
            case 152 -> lII(-722893951, var9 ^ 712053279);
            case 153 -> lII(-722893946, var9 ^ -1539650935);
            case 154 -> lII(-722893945, var9 ^ 408712671);
            case 155 -> lII(-722893948, var9 ^ 1755395938);
            case 156 -> lII(-722893947, var9 ^ -1471545798);
            case 157 -> lII(-722893942, var9 ^ -2014941787);
            case 158 -> lII(-722893941, var9 ^ -761543381);
            case 159 -> lII(-722893944, var9 ^ 1522867131);
            case 160 -> lII(-722893943, var9 ^ -285000791);
            case 161 -> lII(-722893938, var9 ^ 852292655);
            case 162 -> lII(-722893937, var9 ^ 1534990285);
            case 163 -> lII(-722893940, var9 ^ 2083205737);
            case 164 -> lII(-722893939, var9 ^ 645807410);
            case 165 -> lII(-722893934, var9 ^ 1246483887);
            case 166 -> lII(-722893933, var9 ^ 160568484);
            case 167 -> lII(-722893936, var9 ^ -124581716);
            case 168 -> lII(-722893935, var9 ^ -918211633);
            case 169 -> lII(-722893930, var9 ^ -1598163837);
            case 170 -> lII(-722893929, var9 ^ -743392618);
            case 171 -> lII(-722893932, var9 ^ 1655495945);
            case 172 -> 3;
            case 173 -> lII(-722893931, var9 ^ 1424643831);
            case 174 -> lII(-722893926, var9 ^ -570478552);
            case 175 -> lII(-722893925, var9 ^ 1558739033);
            case 176 -> lII(-722893928, var9 ^ -364426330);
            case 177 -> lII(-722893927, var9 ^ 251647065);
            case 178 -> lII(-722893922, var9 ^ 1455117470);
            case 179 -> lII(-722893921, var9 ^ 1441483321);
            case 180 -> lII(-722893924, var9 ^ -401688979);
            case 181 -> lII(-722893923, var9 ^ 396478251);
            case 182 -> lII(-722893918, var9 ^ 1811642479);
            case 183 -> lII(-722893917, var9 ^ 621847505);
            case 184 -> lII(-722893920, var9 ^ -14163859);
            case 185 -> lII(-722893919, var9 ^ 1899942316);
            case 186 -> lII(-722893914, var9 ^ 830076525);
            case 187 -> lII(-722893913, var9 ^ 218019003);
            case 188 -> lII(-722893916, var9 ^ 1001781936);
            case 189 -> lII(-722893915, var9 ^ -1832440823);
            case 190 -> lII(-722893910, var9 ^ 115505431);
            case 191 -> lII(-722893909, var9 ^ 248517419);
            case 192 -> lII(-722893912, var9 ^ 1279248761);
            case 193 -> lII(-722893911, var9 ^ 1583988004);
            case 194 -> lII(-722893906, var9 ^ 182019774);
            case 195 -> lII(-722893905, var9 ^ -306538816);
            case 196 -> lII(-722893908, var9 ^ -204743177);
            case 197 -> lII(-722893907, var9 ^ 2059139479);
            case 198 -> lII(-722893902, var9 ^ 924848279);
            case 199 -> lII(-722893901, var9 ^ -1767031613);
            case 200 -> lII(-722893904, var9 ^ 1226524734);
            case 201 -> lII(-722893903, var9 ^ -1332674227);
            case 202 -> lII(-722893898, var9 ^ 1417030009);
            case 203 -> lII(-722893897, var9 ^ -755757969);
            case 204 -> lII(-722893900, var9 ^ -331686408);
            case 205 -> lII(-722893899, var9 ^ -1441330281);
            case 206 -> lII(-722893894, var9 ^ -351239457);
            case 207 -> lII(-722893893, var9 ^ 573553540);
            case 208 -> lII(-722893896, var9 ^ 1635122873);
            case 209 -> lII(-722893895, var9 ^ 1981236388);
            case 210 -> lII(-722893890, var9 ^ -481447741);
            case 211 -> lII(-722893889, var9 ^ -1122588551);
            case 212 -> lII(-722893892, var9 ^ -511094696);
            case 213 -> lII(-722893891, var9 ^ -1657213539);
            case 214 -> lII(-722894270, var9 ^ 1741769200);
            case 215 -> lII(-722894269, var9 ^ -298958083);
            case 216 -> lII(-722894272, var9 ^ -1261795251);
            case 217 -> lII(-722894271, var9 ^ -1546410173);
            case 218 -> lII(-722894266, var9 ^ -2026881089);
            case 219 -> lII(-722894265, var9 ^ 1589237613);
            case 220 -> lII(-722894268, var9 ^ -1921111397);
            case 221 -> lII(-722894267, var9 ^ 723510058);
            case 222 -> lII(-722894262, var9 ^ 1803463531);
            case 223 -> lII(-722894261, var9 ^ 797146660);
            case 224 -> lII(-722894264, var9 ^ -51072416);
            case 225 -> lII(-722894263, var9 ^ -340794492);
            case 226 -> lII(-722894258, var9 ^ -1068624706);
            case 227 -> lII(-722894257, var9 ^ -560806388);
            case 228 -> lII(-722894260, var9 ^ -356306342);
            case 229 -> lII(-722894259, var9 ^ -1651935181);
            case 230 -> lII(-722894254, var9 ^ -1360718273);
            case 231 -> lII(-722894253, var9 ^ -1611158765);
            case 232 -> lII(-722894256, var9 ^ 1066851067);
            case 233 -> lII(-722894255, var9 ^ 936834040);
            case 234 -> lII(-722894250, var9 ^ -448887848);
            case 235 -> lII(-722894249, var9 ^ -1852597570);
            case 236 -> lII(-722894252, var9 ^ 958670487);
            case 237 -> lII(-722894251, var9 ^ 1218411033);
            case 238 -> lII(-722894246, var9 ^ 1763965061);
            case 239 -> lII(-722894245, var9 ^ 1708584574);
            case 240 -> lII(-722894248, var9 ^ 2115941782);
            case 241 -> lII(-722894247, var9 ^ 1026092932);
            case 242 -> lII(-722894242, var9 ^ -1782298146);
            case 243 -> lII(-722894241, var9 ^ -1700732162);
            case 244 -> lII(-722894244, var9 ^ -1113898020);
            case 245 -> lII(-722894243, var9 ^ -796092990);
            case 246 -> lII(-722894238, var9 ^ -2005824620);
            case 247 -> lII(-722894237, var9 ^ 961170412);
            case 248 -> lII(-722894240, var9 ^ -703069014);
            case 249 -> lII(-722894239, var9 ^ -207329990);
            case 250 -> lII(-722894234, var9 ^ -45194447);
            case 251 -> lII(-722894233, var9 ^ -368330666);
            case 252 -> lII(-722894236, var9 ^ -15426929);
            case 253 -> lII(-722894235, var9 ^ -349820645);
            case 254 -> lII(-722894230, var9 ^ -105169052);
            default -> lII(-722894229, var9 ^ 551764308);
         };
         int var5 = (var1 & lII(-722894232, var9 ^ -1857836036)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lII(-722894231, var9 ^ -1072957818)) >>> lII(-722894226, var9 ^ -680132403)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lII(-722894225, var9 ^ 1441590220);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lII(-722894228, var9 ^ 1772921471);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   @Override
   public void Illl(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.II(var1, var5);
   }
}
