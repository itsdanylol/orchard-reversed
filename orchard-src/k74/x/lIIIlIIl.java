package k74.x;

import com.mojang.authlib.GameProfile;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1294;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_640;

@Environment(EnvType.CLIENT)
public final class lIIIlIIl extends IlIIIIIIl {
   private static final int II = 200;
   private IIIllIlI Il;
   private Object lI;
   private final lllIIlII ll;
   private final IIlIII III;
   private static String[] IIl;
   private final lllIIlII IlI;
   private static final String[] lIII;
   private final lllIIlII Ill;
   private static final String[] lII;
   private final lllIIlII lIl;
   private static final int[] I;
   private final Map<Integer, IIIIlllII> llI;
   private final lllIIlII lll;
   private static final String[] IIII;
   private static final double IIIl = 144.0;
   private final IllIII<IlII> IIlI;
   private static final double IIll = 0.005;
   private final lllIIlII IlII;
   private static final Object[] lIIl;
   private final lllIIlII IlIl;
   private final lllIIlII IllI;
   private UUID Illl;

   public lIIIlIIl() {
      int var1 = -2018933722;
      super(IlIIllIII.Ill(IIl[3]), lllIIlIl.I, IlIIllIII.Ill(IIl[IIII(889732383, var1 ^ -1834158928)]));
      this.IIlI = this.IllIIll(new IllIII<>(IlIIllIII.Ill(IIl[IIII(889732382, var1 ^ 1443528713)]), IlII.class, k74.x.IlII.lII));
      this.IllI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl[0]), true));
      this.lIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl[2]), true));
      this.IlII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl[4]), true));
      this.lll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl[IIII(889732381, var1 ^ -143353766)]), true));
      this.Ill = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl[1]), true));
      this.IlIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl[IIII(889732380, var1 ^ 1351074412)]), true));
      this.IlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl[5]), true));
      this.ll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl[IIII(889732379, var1 ^ 2138725106)]), true));
      this.III = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIl[IIII(889732378, var1 ^ 921565256)]), 40.0, 0.0, 200.0, 10.0).IlII(IlIIllIII.lI(IIl[IIII(889732377, var1 ^ 797420670)]))
      );
      this.llI = new HashMap<>();
   }

   private static String I(char[] var0, long var1, int var3) {
      int var4 = IIII(889732376, 278230122 ^ 1906088062) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIII(889732375, 278230122 ^ 149498927);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private boolean l(class_310 var1, class_1657 var2, String var3) {
      String[] var4 = IIllllIl.IIIIl();
      GameProfile var5 = var2.method_7334();
      UUID var6 = var5 == null ? null : lIlIIIll.l(var5);

      for (class_1657 var8 : var1.field_1687.method_18456()) {
         if (var8 != var2 && !var8.method_31481() && var8.method_5805()) {
            GameProfile var9 = var8.method_7334();
            String var10 = var9 == null ? null : lIlIIIll.Ill(var9);
            UUID var11 = var9 == null ? null : lIlIIIll.l(var9);
            boolean var12 = var3 != null && var10 != null && var3.equalsIgnoreCase(var10);
            boolean var13 = var6 != null && var6.equals(var11);
            if (var12 || var13) {
               return true;
            }

            if (var4 != null) {
               break;
            }
         }
      }

      return false;
   }

   private void II() {
      IIIllIlI var1 = new IIIllIlI(
         this.IIlI.IllI(),
         this.IllI.IllI(),
         this.lIl.IllI(),
         this.IlII.IllI(),
         this.lll.IllI(),
         this.Ill.IllI(),
         this.IlIl.IllI(),
         this.IlI.IllI(),
         this.ll.IllI(),
         Double.doubleToLongBits(this.III.IllI())
      );
      if (!var1.equals(this.Il)) {
         this.llI.clear();
         this.Il = var1;
      }
   }

   private boolean Il(class_1657 var1) {
      return !var1.method_24828() && !this.lII(var1) && Math.abs(var1.method_18798().field_1351) <= 0.005 && var1.field_6017 <= 0.0;
   }

   private static boolean lI(long var0, Entry var2) {
      return IIlIIIII.III(var0, ((IIIIlllII)var2.getValue()).II, 200L);
   }

   private static String IIIl(int var0, short var1, char var2) {
      int var3 = var2 ^ '쥼';
      char[] var4 = lIII[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lIIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lIIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 31878;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 707;
         var10 += 54514;
         var10 ^= 54565;
         var10 += 11024;
         var10 -= 30282;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private boolean ll(class_310 var1) {
      if (var1 != null && var1.field_1687 != null && var1.field_1724 != null) {
         UUID var2 = var1.field_1724.method_5667();
         if (this.lI != var1.field_1687 || !var2.equals(this.Illl)) {
            this.llI.clear();
            this.lI = var1.field_1687;
            this.Illl = var2;
         }

         this.II();
         return true;
      } else {
         this.Ill();
         return false;
      }
   }

   private boolean III(class_310 var1, class_1657 var2) {
      if (var1.field_1724 != null && var2 != var1.field_1724) {
         double var3 = var2.method_5858(var1.field_1724);
         if (var3 > 144.0) {
            return false;
         } else {
            return this.lII(var2) ? false : !var2.method_24828() && Math.abs(var2.method_18798().field_1351) <= 0.005 && var2.field_6017 <= 0.0;
         }
      } else {
         return false;
      }
   }

   public boolean IIl(class_1657 var1) {
      int var12 = 1993318760;
      if (this.IIIIlIl() && var1 != null && !var1.method_31481() && var1.method_5805()) {
         class_310 var2 = class_310.method_1551();
         if (this.ll(var2) && var1 != var2.field_1724) {
            long var3 = var2.field_1687.method_75260();
            IIIIlllII var5 = this.lIl(var2, var1, var3);
            boolean var6 = var5 != null && var3 - var5.I >= this.III.IllI().longValue();
            if (var6 && this.IllI.IllI() && var2.method_1562() != null) {
               class_640 var7 = var2.method_1562().method_2871(var1.method_5667());
               if (var7 == null) {
                  return true;
               }

               GameProfile var8 = var7.method_2966();
               GameProfile var9 = var1.method_7334();
               String var10 = var8 == null ? null : lIlIIIll.Ill(var8);
               String var11 = var9 == null ? null : lIlIIIll.Ill(var9);
               if (var10 == null || var11 == null || !var10.equalsIgnoreCase(var11)) {
                  return true;
               }
            }

            if (this.IlII.IllI()) {
               GameProfile var13 = var1.method_7334();
               String var15 = var13 == null ? null : lIlIIIll.Ill(var13);
               UUID var17 = var13 == null ? null : lIlIIIll.l(var13);
               if (var15 == null
                  || var15.isEmpty()
                  || var15.length() < 2
                  || var15.length() > IIII(889732374, var12 ^ -15086754)
                  || var15.contains(IlIIllIII.lI(IIl[IIII(889732373, var12 ^ -1421105513)]))
                  || var15.contains(IlIIllIII.lI(IIl[IIII(889732372, var12 ^ 1358490806)]))
                  || var15.contains(IlIIllIII.lI(IIl[IIII(889732371, var12 ^ 1500270454)]))
                  || var15.contains(IlIIllIII.lI(IIl[IIII(889732370, var12 ^ 564102885)]))) {
                  return true;
               }

               if (var17 != null && var17.version() == 2) {
                  return true;
               }
            }

            if (this.lll.IllI() && var1.method_5767() && !var1.method_6059(class_1294.field_5905)) {
               return true;
            } else if (var6 && this.IlIl.IllI() && this.III(var2, var1)) {
               return true;
            } else {
               if (this.IlI.IllI()) {
                  GameProfile var14 = var1.method_7334();
                  String var16 = var14 == null ? null : lIlIIIll.Ill(var14);
                  if (this.l(var2, var1, var16)) {
                     return true;
                  }
               }

               return !this.ll.IllI() || var1.method_5628() >= 0 && var1.method_5628() < IIII(889732369, var12 ^ -2101008438)
                  ? var5 != null && var5.Il.llI(this.IIlI.IllI()).Il()
                  : true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -644960993;
      byte var14 = -1;
      char[] var9 = "Ĳ%".toCharArray();
      String var8 = "鎟禛옑묞ྩ捏셹尠\ue78a萈홖盂쓱䍌糷蟼␕ᦳ춱鷋ꇠﭞ懮\uf6e6쇨榹䤅絻㓇胭ꐡ鍪\u244d镍舠啳䷚\ue9f2訌\uda2e\udb8f詈푻\ue433좤疔⊫\udefa\ueed1餼凈㪊틖ᳪ띈lᡏ\udc69\udadb佭ᖛ\uedbb㒕郑號粘﹢\ue855ꄢ\ue1de뿹\ue80d槟떩牋ፃ\uf092᷌䰊뱏Ệ䵶⎑딠偖\uef74\uea76\u0015\uf2d4樧ⱄ볗퐨듢싒\u20cd鄬菲䘘\uf114␖ⰼ႓픏埓莬ⷪ鿐蘿솃㺵쎚\uf16e腧쇀ᷟ\ud92c〗顭容\uecdbⶶ覜勌䂺\uf69e䜾셟ᄿ৶Ⴐ빝\uf69a䴫\ue169濻솑\u2d78稈絃\ud8e9숀\udd22\uded8㢺\ueb1a染㭱\ue03e誚읅\uf29c捆ꯪ짧ఈ\ue980헬왮Ө筯솚瓄끃§⺃鞊눹鑼敷긾\udcb3嶡騫Ꝇ\uf61c␅Ꭷᑷ爣枂\uf3d9せ諼懂♬쇄䆍퓴哬ഀ뇏喆◧⒙솙粒㓯홗\ueb5c쇽㟒쥺↿Է败鵾岔ᢦ\uf8a2槤歚띭韈䩣⟯惠㴉\udf43\ue16d不쮧\ue47f臽⽆솩ᦵ㌚ﳬ阽䀱ᬺ뢍뙦菴\uf628䂡\uf3ea⪾쌹ꔌ뷓\uea2e厳单ꆍ섘\ue20d\udf26\udb09㆟솞낒⌍솂ﱞ꒟큀ﭖ캛\uec0b籾\ue36a\uea9a럐ꇆ\ue226\ue5d0嚫繪\u0ab4괃ᖘቾ喺\ufaf9ѓ\udc12聁ꆼ솝蔗\u0ad2岀\u0cd2솩稼湄궁웺띺\udd94歭\u2fe2뭽忨ֻّ랠᧕ჾ띦죥㾚蚤\ue6b2羳섔췡⭔觯숭럮ౢወ愥㚣ꔵꢳ鞣㨬릒\uf49c퐺櫮듯ઔ騦䯖뭌᱗웦헄怲㆙揶坚➡\udfd8䭘\uf82c猒ᓩ";
      short var7 = 30093;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            lIII = var10;
            lIIl = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            I = new int[350];
            byte[] var10002 = "ôjÛü0Ì¯V\u0091²·\u001b6AìÏ\u0019¼u´P+×\u0004IA\u0083=d\u0090\u008d\u0017ù\u0013ò6h¹À\u00ad<ë\u00adgÇXçTÎÌEy¶?\u008d\u0000Ñ\u0002ãÎíÔÃjj²Õ[+Ü¥\u0092þ¥³sÎ,1\u009bjýÆ\u0018Ý\u0012_\u0016\t\u001b&:\t°Í5Mú\u0017ã¬\u00981\u001aÑê\u008a(fðÚ3hãê%\u001e\u008e\u0015\u0092Ö\u001fy[S\u0019\n\u0081§÷\\îkr¡Ä\u0094dÝL\bgÛ>\u00982\u00027A\"\u001f\u0016c«\u0082>À^0\u000bGpÛqÃ\u0081\u0014ò\u0018¡Á±{MÒjÉPÁ\u0098ÑµYü\u0098Re\u008eù\u0002úWç\t÷\u0097÷\u0096ÎF=ÀërE¹þ&Ã¬ë³ûº\u007fÇ\u00953à»y\"[\u0091$z@\u0083\u0003DÜvã\u001b· ymÐi{\u0019êöQ\u008b¡fß¥ò6\u000bß\u001bÒIê\u0098\u0098/\u0001Y\u0019æ3\u001f\u001eT\u0084\u00135@\"Ñ\u007fÐC±G[¨ô'\u001aøS\tI\u0083@\u0091\u0000$ø\u0084àË78{\u001d\u0083ô\u0093s\u0014NÈ\u0084i\u009d\u0085à2<Þ½½f1õy¾\u001e\u0018\tã\u0014!c\u0084jxûÊ:Ç&%5(\n\u000f<úó,5Tpsô\u00191=\u0091\u0092\u0092ûí¹a\u001cl$+\u0002\u0080(\u001eà\u0016\u009dÏmÍ\u0001\u0083ïÂ\u0099\f:,\u0082\u0093f\u0017Ä¡røOÜA\u001d\u0006\u009fó\u0010JIÆôÀbÒ\u008e'êë\u008f@ô¶\u0087\u0086\u007fÓõMø\f¬\u0091K\u0019\u008c\t÷ßÍ\u0097Ú&*±røq\u000f÷m\u001bí`!\u0082\u0082v¹\u0015n\u0000Û:Ê\f±\u008f½1®ñ\u008d\u0082õ)²3M%\u0012\u001cM¸}ætÂÁ>!Fä\u001bg\u0086c¯\u008a7ÒúöÀiÉLî¬(×ÒÁ\u009f¥Rw6ÚZfC\u009d¿\u0002EÉõ{ä\u001f`\u009cEÌ\u0080/\u0015¬½F²\u001dRk¹Ã¤®¬ h\u0084Ýê¼_\u0087ô³\u00820Ô4l\u009d\u000b4ä^þÔ[f\u0016ù%Û4Ç\u001b$pEl\u008dÊ<f¶\u000e\u000e\u0091\u00ad\u0098~Þ\u0095åÃ\u0085\rkõ{v\u0081Ð>^©\u0012\u0017¤nÑ\ta\u001cb§ÊÓí§ðÕ\u008f\u0098#\u008f.»%Q\u0013-\u0096}\u0084DÚÍ@Î+Æ\u0007¨\u008bQ¨_:l¸Â)\u0013a¢o\u001cÖÛtÑ>¿\u0018\u000eª/\u001c»C\"¿dßÚl5|lº\u0011u$\u000b\u0010n³\u0093Î\u001cá;09·¼@V+zÎ=7n\u008bT\u000fÎ|\u0082ø\u0090¥\u0013`{Øh÷5$Ì\u000b!<\u00191\u00ad\u0092~¸N\u008d4³L÷;«|þ6Ú¦\u0088\u0080\u0083h\u0014wA\u0080LBd¢UÌ.\u008bÝ¡Zâ\u0082\u0089Óa]pýûj½a\t\u0007»CZúãuýuv\u0080Rý\u0000¥Ç¼#7öxÛ[Èz¸*\u0014Ô³ÊÊ\u0080Õe16æHë\u007f\u0088ÿ\u0017-Ä¯Ä\"\u0083Zdò´HXÚ\u008f0\u0080IøÒpÉ\u0007^F¿\u0084oÒqøì9<ÜêÞ¡Àfäô\u001b\u001a\u000b\u000bV;ÑT>\u0003\u00928î/\u0087\u009cÌÀÿ±\u0089é-¥S\u009f\u008f1vÅ%»w\u0011\r\u008aè1\u007f\\\u0000dæÌ®·ÛS¤\u0085\u0080n\u0011\"nû\u0089Ø\u009b[ö>Í>§Ø@\u0013Á\u001e\f7¬\u0004A£ò¶\u0097m½Ê\u0016J\u009d\n¢t:(\u0089©\u0092¡mó§ðÄÿ\u009c\u008fòî\u008c\u0082aE~OÙ¬TM\u0091\u000fã\"\u0019\r\u0093\u0082cÿÆÑRüûÂá\u008a3Ð\u0084>\n²Äæ\u0015l\u009dÞx\u009c±\u0085zúïÝ\u0011@ü\u0006î\u0004Ñ.<º\u0091=\u009dO¬X_d\u0016s?÷ú®`¾ý¿\u0016Ø1Ò\u008f2è¢\u001f\u0089\u00ad¼ÜóEÊ\u0004n\u001dÙ¹\u0005\u008e\u008cZ M\\\u009fþ\u0003\ry¡S\u0086i\u008dF\u0098á%Î<'\u001b\n\u0002Ï\u0001ôñ%\u001c\u001c\u0013a3XeÎ\u000fªí(4S\t\u008c°µ6\u008d+Ølô±ªYÈ¶\bk¾\u0090Cß\u0018\u008b4\u0094½¢Ý@TÆ2ÆÚ-B=\b\n\u008b\u0094Cþõ¿\u0010FªÝ\u001c;ÃóV\u00896;ë\u0081\u000ePbÕµjqJ\u0000îá\u001f\u009bÞBÔ1 \u007f&\u0013#Îáýþ×ÉtéT\u0014ÃÞ¿eÓ=]«Z~«ÌM>*\u0002/\u001fY.\u008fg¦º\u000b?´¨¦\u009dtM«\"Ü +\u0010¬\tó¹ø\u001c²E`S]\u009d\u0096=÷xA\u00125\u0081qÊª±\u0085``xÁèã\u0098\u0094$E\t¹ªÓ\u0019´\u0016\u0090¹R¯\u0005»·ÚÒúY\u00ad\u0098xäÏÑÉ\u000e\u009e\u001f\u0000\tÂ\u0003Ñ®ª\u0012\u009a%\u0096\u0017ûpQ_^ü».TC\u0005\u009eüNê<ú¾ì`a\u0006s\u0080\nD9ì\u0011à¯\u0014¨b½}<\u001fÕZ7yïflLZc\u00803Ñ^\u00009ÈÌ\u0018\u0091µaã½\u008dÆ7-yâÐ\"\u0080\u0003\u0094H÷Ú\u001e$¶\u00adóz\u0017\u00869ò\u0013ùÒ"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               I[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 731488096;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var5 = new String[IIII(889732176, var18 ^ -665971819)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IIIl(var18 ^ 2111291501, (short)'샋', '쥼')).length();
            int var1 = IIII(889732175, var18 ^ 1516010473);
            int var20 = -1;

            label104:
            while (true) {
               var22 = IIII(889732174, var18 ^ 657743209);
               String var27 = var2.substring(++var20, var20 + var1);
               byte var39 = -1;

               while (true) {
                  label99: {
                     char[] var57 = var27.toCharArray();
                     int var69 = var57.length;
                     int var6 = 0;
                     var55 = var22;
                     var44 = var57;
                     var10001 = var69;
                     char[] var81;
                     int var88;
                     if (var69 <= 1) {
                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     } else {
                        var55 = var22;
                        var10001 = var69;
                        if (var69 <= var6) {
                           break label99;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % IIII(889732170, var18 ^ 19516209)) {
                           case 0 -> IIII(889732169, var18 ^ -1454086362);
                           case 1 -> IIII(889732168, var18 ^ -2056470357);
                           case 2 -> IIII(889732167, var18 ^ 362341414);
                           case 3 -> IIII(889732166, var18 ^ 442565998);
                           case 4 -> IIII(889732165, var18 ^ 1880546595);
                           case 5 -> IIII(889732164, var18 ^ 475507476);
                           default -> IIII(889732163, var18 ^ 1123451109);
                        });
                        var6++;
                        if (var55 == 0) {
                           var88 = var55;
                           var81 = var44;
                           var69 = var55;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var81 = var44;
                           var69 = var55;
                           var88 = var6;
                        }
                     }
                  }

                  String var62 = new String(var44).intern();
                  switch (var39) {
                     case 0:
                        var5[var3++] = var62;
                        if ((var20 += var1) >= var4) {
                           lII = var5;
                           IIII = new String[IIII(889732171, var18 ^ 187717926)];
                           IIl = new String[IIII(889732162, var18 ^ -890044675)];
                           lll();
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var62;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label104;
                        }

                        var4 = (var2 = IIIl(var18 ^ 518841973, (short)'謁', '쥽')).length();
                        var1 = IIII(889732173, var18 ^ 1091461455);
                        var20 = -1;
                  }

                  var22 = IIII(889732172, var18 ^ 1958438155);
                  var27 = var2.substring(++var20, var20 + var1);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 3;
                  case 1 -> 152;
                  case 2 -> 234;
                  case 3 -> 130;
                  case 4 -> 134;
                  case 5 -> 141;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static int IIII(int var0, int var1) {
      int var2 = I[var0 ^ 889732383] ^ var1 ^ var0;
      var2 ^= 17389;
      var2 += 47303;
      var2 -= 26587;
      var2 += 54446;
      var2 ^= 49292;
      var2 -= 54499;
      var2 ^= 14347;
      var2 += 27875;
      return var2 + 45045;
   }

   private void Ill() {
      this.llI.clear();
      this.lI = null;
      this.Illl = null;
      this.Il = null;
   }

   @Override
   public void IlIII() {
      this.Ill();
   }

   private boolean lII(class_1657 var1) {
      return var1.method_6128()
         || var1.method_5765()
         || var1.method_7325()
         || var1.method_31549().field_7477 && var1.method_31549().field_7479
         || var1.method_31549().field_7479
         || var1.method_5799()
         || var1.method_5869()
         || var1.method_5771()
         || var1.method_6101()
         || var1.method_6059(class_1294.field_5902)
         || var1.method_6059(class_1294.field_5906)
         || var1.method_6123();
   }

   private IIIIlllII lIl(class_310 var1, class_1657 var2, long var3) {
      if (var2 != null && var2 != var1.field_1724) {
         int var5 = var2.method_5628();
         IIIIlllII var6 = this.llI.get(var5);
         if (var6 == null || var6.lI != var2) {
            var6 = new IIIIlllII(var2, var3);
            this.llI.put(var5, var6);
         }

         var6.II = var3;
         if (var6.l == var3) {
            return var6;
         } else {
            var6.l = var3;
            boolean var7 = var3 - var6.I >= this.III.IllI().longValue();
            boolean var8 = !this.IllI.IllI() || var1.method_1562() == null || var1.method_1562().method_2871(var2.method_5667()) != null;
            GameProfile var9 = var2.method_7334();
            String var10 = var9 == null ? null : lIlIIIll.Ill(var9);
            boolean var11 = !this.IlII.IllI() || IIlIIIII.l(var10);
            boolean var12 = this.IlI.IllI() && this.l(var1, var2, var10);
            boolean var13 = var2.method_5858(var1.field_1724) <= 144.0;
            boolean var14 = !this.Ill.IllI() || this.lII(var2);
            boolean var15 = this.IlIl.IllI() && var13 && this.Il(var2);
            double var16 = Math.hypot(var2.method_18798().field_1352, var2.method_18798().field_1350);
            var6.Il
               .lI(
                  new IllIlllI(
                     var3,
                     var7,
                     var8,
                     var11,
                     this.lll.IllI() && var13 && var2.method_5767() && !var2.method_6059(class_1294.field_5905),
                     var12,
                     var15,
                     var14,
                     var13,
                     var2.method_23317(),
                     var2.method_23318(),
                     var2.method_23321(),
                     var16
                  ),
                  this.IIlI.IllI()
               );
            return var6;
         }
      } else {
         return null;
      }
   }

   @Override
   public void IIlIl() {
      String[] var1 = IIllllIl.IIIIl();
      class_310 var2 = class_310.method_1551();
      if (this.ll(var2)) {
         long var3 = var2.field_1687.method_75260();

         for (class_1657 var6 : var2.field_1687.method_18456()) {
            this.lIl(var2, var6, var3);
            if (var1 != null) {
               break;
            }
         }

         this.llI.entrySet().removeIf(lIIIlIIl::lI);
      }
   }

   @Override
   public void llIl() {
      this.Ill();
   }

   private static String llI(int var0, int var1) {
      int var9 = -1709818959;
      int var2 = (var0 ^ IIII(889732368, var9 ^ -1767039400)) & IIII(889732367, var9 ^ 298468737);
      if (IIII[var2] == null) {
         char[] var3 = lII[var2].toCharArray();

         int var4 = switch (var3[0] & IIII(889732366, var9 ^ 1353004105)) {
            case 0 -> IIII(889732365, var9 ^ -2049170924);
            case 1 -> IIII(889732364, var9 ^ -1252679216);
            case 2 -> IIII(889732363, var9 ^ 293885665);
            case 3 -> IIII(889732362, var9 ^ -1502883954);
            case 4 -> IIII(889732361, var9 ^ 1919072022);
            case 5 -> IIII(889732360, var9 ^ 1925798950);
            case 6 -> IIII(889732359, var9 ^ 914589411);
            case 7 -> IIII(889732358, var9 ^ -673078822);
            case 8 -> IIII(889732357, var9 ^ -1433199981);
            case 9 -> IIII(889732356, var9 ^ 495536776);
            case 10 -> IIII(889732355, var9 ^ 328891083);
            case 11 -> IIII(889732354, var9 ^ 1710720273);
            case 12 -> IIII(889732353, var9 ^ -1385764415);
            case 13 -> IIII(889732352, var9 ^ 677419912);
            case 14 -> IIII(889732415, var9 ^ -594621314);
            case 15 -> IIII(889732414, var9 ^ 269169004);
            case 16 -> IIII(889732413, var9 ^ -283292574);
            case 17 -> IIII(889732412, var9 ^ 1931365270);
            case 18 -> IIII(889732411, var9 ^ -481586378);
            case 19 -> IIII(889732410, var9 ^ 979078683);
            case 20 -> IIII(889732409, var9 ^ 416420652);
            case 21 -> IIII(889732408, var9 ^ -1155030756);
            case 22 -> IIII(889732407, var9 ^ 1007242210);
            case 23 -> IIII(889732406, var9 ^ -1191672790);
            case 24 -> IIII(889732405, var9 ^ 1675120793);
            case 25 -> IIII(889732404, var9 ^ 3425096);
            case 26 -> IIII(889732403, var9 ^ -1305915146);
            case 27 -> IIII(889732402, var9 ^ -1429419649);
            case 28 -> IIII(889732401, var9 ^ -483658422);
            case 29 -> IIII(889732400, var9 ^ -2105840944);
            case 30 -> IIII(889732399, var9 ^ -1670355145);
            case 31 -> IIII(889732398, var9 ^ -1930471337);
            case 32 -> IIII(889732397, var9 ^ 1186560970);
            case 33 -> IIII(889732396, var9 ^ 1052798688);
            case 34 -> IIII(889732395, var9 ^ -1193968679);
            case 35 -> IIII(889732394, var9 ^ -2134642858);
            case 36 -> IIII(889732393, var9 ^ -297111052);
            case 37 -> IIII(889732392, var9 ^ 39570068);
            case 38 -> IIII(889732391, var9 ^ 1594085613);
            case 39 -> IIII(889732390, var9 ^ 2017283466);
            case 40 -> IIII(889732389, var9 ^ -1738398005);
            case 41 -> IIII(889732388, var9 ^ 34881867);
            case 42 -> IIII(889732387, var9 ^ 6323156);
            case 43 -> IIII(889732386, var9 ^ 720515144);
            case 44 -> IIII(889732385, var9 ^ -1529060560);
            case 45 -> IIII(889732384, var9 ^ 1889962738);
            case 46 -> IIII(889732447, var9 ^ 848496742);
            case 47 -> IIII(889732446, var9 ^ 1417202102);
            case 48 -> IIII(889732445, var9 ^ -1656057976);
            case 49 -> IIII(889732444, var9 ^ 805143218);
            case 50 -> IIII(889732443, var9 ^ 995836372);
            case 51 -> IIII(889732442, var9 ^ -1422253631);
            case 52 -> IIII(889732441, var9 ^ 550593731);
            case 53 -> IIII(889732440, var9 ^ 1635894206);
            case 54 -> IIII(889732439, var9 ^ 855298184);
            case 55 -> IIII(889732438, var9 ^ 2069719057);
            case 56 -> IIII(889732437, var9 ^ -1682790524);
            case 57 -> IIII(889732436, var9 ^ 6558528);
            case 58 -> IIII(889732435, var9 ^ -401963937);
            case 59 -> IIII(889732434, var9 ^ -1275201172);
            case 60 -> IIII(889732433, var9 ^ -23485776);
            case 61 -> IIII(889732432, var9 ^ -1513870271);
            case 62 -> IIII(889732431, var9 ^ 1250748563);
            case 63 -> IIII(889732430, var9 ^ 1700894991);
            case 64 -> 2;
            case 65 -> IIII(889732429, var9 ^ 1868100321);
            case 66 -> IIII(889732428, var9 ^ 285305820);
            case 67 -> IIII(889732427, var9 ^ 1103017510);
            case 68 -> IIII(889732426, var9 ^ 1313970986);
            case 69 -> IIII(889732425, var9 ^ 1199793111);
            case 70 -> IIII(889732424, var9 ^ 1311629614);
            case 71 -> IIII(889732423, var9 ^ -1889492967);
            case 72 -> IIII(889732422, var9 ^ -353696851);
            case 73 -> IIII(889732421, var9 ^ -1765740076);
            case 74 -> IIII(889732420, var9 ^ 392018490);
            case 75 -> IIII(889732419, var9 ^ -78541214);
            case 76 -> IIII(889732418, var9 ^ 1843683194);
            case 77 -> IIII(889732417, var9 ^ -1233644883);
            case 78 -> IIII(889732416, var9 ^ -1176462279);
            case 79 -> IIII(889732479, var9 ^ 1476068284);
            case 80 -> IIII(889732478, var9 ^ 1824338016);
            case 81 -> IIII(889732477, var9 ^ -2093593274);
            case 82 -> IIII(889732476, var9 ^ 1719602862);
            case 83 -> IIII(889732475, var9 ^ 1798560240);
            case 84 -> IIII(889732474, var9 ^ -1883638868);
            case 85 -> IIII(889732473, var9 ^ -178357261);
            case 86 -> IIII(889732472, var9 ^ -197565010);
            case 87 -> 4;
            case 88 -> IIII(889732471, var9 ^ -50335987);
            case 89 -> IIII(889732470, var9 ^ -1909168079);
            case 90 -> IIII(889732469, var9 ^ -672605292);
            case 91 -> IIII(889732468, var9 ^ -143628295);
            case 92 -> IIII(889732467, var9 ^ -1225897341);
            case 93 -> IIII(889732466, var9 ^ 1372119957);
            case 94 -> IIII(889732465, var9 ^ 175531905);
            case 95 -> IIII(889732464, var9 ^ 1620373813);
            case 96 -> 0;
            case 97 -> IIII(889732463, var9 ^ -100932059);
            case 98 -> IIII(889732462, var9 ^ 1847038032);
            case 99 -> IIII(889732461, var9 ^ 1102289996);
            case 100 -> IIII(889732460, var9 ^ -188440190);
            case 101 -> IIII(889732459, var9 ^ -1963715641);
            case 102 -> IIII(889732458, var9 ^ 1389077075);
            case 103 -> IIII(889732457, var9 ^ 1584106666);
            case 104 -> IIII(889732456, var9 ^ -1023117605);
            case 105 -> IIII(889732455, var9 ^ -1179078923);
            case 106 -> IIII(889732454, var9 ^ 1033735116);
            case 107 -> IIII(889732453, var9 ^ -48611421);
            case 108 -> IIII(889732452, var9 ^ 1286302633);
            case 109 -> IIII(889732451, var9 ^ -1156556424);
            case 110 -> IIII(889732450, var9 ^ -1781155365);
            case 111 -> IIII(889732449, var9 ^ -1447555235);
            case 112 -> IIII(889732448, var9 ^ 688826256);
            case 113 -> IIII(889732511, var9 ^ 555733909);
            case 114 -> IIII(889732510, var9 ^ -998517303);
            case 115 -> IIII(889732509, var9 ^ -1912441347);
            case 116 -> IIII(889732508, var9 ^ 468047288);
            case 117 -> IIII(889732507, var9 ^ -78216102);
            case 118 -> IIII(889732506, var9 ^ -968940619);
            case 119 -> IIII(889732505, var9 ^ 689056152);
            case 120 -> IIII(889732504, var9 ^ -539542208);
            case 121 -> IIII(889732503, var9 ^ 335367620);
            case 122 -> IIII(889732502, var9 ^ -953804907);
            case 123 -> IIII(889732501, var9 ^ -923033409);
            case 124 -> IIII(889732500, var9 ^ 1326779527);
            case 125 -> IIII(889732499, var9 ^ 1335742183);
            case 126 -> IIII(889732498, var9 ^ -1356663176);
            case 127 -> IIII(889732497, var9 ^ -2107880660);
            case 128 -> IIII(889732496, var9 ^ -1134381994);
            case 129 -> IIII(889732495, var9 ^ 1041570872);
            case 130 -> IIII(889732494, var9 ^ 1193223732);
            case 131 -> IIII(889732493, var9 ^ 1978154307);
            case 132 -> IIII(889732492, var9 ^ 94832092);
            case 133 -> IIII(889732491, var9 ^ -1191404232);
            case 134 -> IIII(889732490, var9 ^ -1912412537);
            case 135 -> IIII(889732489, var9 ^ -1421357254);
            case 136 -> IIII(889732488, var9 ^ 1768830042);
            case 137 -> IIII(889732487, var9 ^ -1435438752);
            case 138 -> IIII(889732486, var9 ^ 434002687);
            case 139 -> IIII(889732485, var9 ^ -1763811146);
            case 140 -> IIII(889732484, var9 ^ -186535361);
            case 141 -> IIII(889732483, var9 ^ 1438823649);
            case 142 -> IIII(889732482, var9 ^ 1750337503);
            case 143 -> IIII(889732481, var9 ^ -12760566);
            case 144 -> IIII(889732480, var9 ^ 1001896716);
            case 145 -> IIII(889732543, var9 ^ 2094078911);
            case 146 -> IIII(889732542, var9 ^ -752440325);
            case 147 -> IIII(889732541, var9 ^ -1011107685);
            case 148 -> IIII(889732540, var9 ^ 450625355);
            case 149 -> IIII(889732539, var9 ^ -1381833548);
            case 150 -> IIII(889732538, var9 ^ 1170638935);
            case 151 -> IIII(889732537, var9 ^ -782856857);
            case 152 -> IIII(889732536, var9 ^ 945500057);
            case 153 -> IIII(889732535, var9 ^ -1532757316);
            case 154 -> IIII(889732534, var9 ^ 118827921);
            case 155 -> IIII(889732533, var9 ^ 241015649);
            case 156 -> IIII(889732532, var9 ^ 365560356);
            case 157 -> IIII(889732531, var9 ^ 1738058468);
            case 158 -> IIII(889732530, var9 ^ 1120808253);
            case 159 -> IIII(889732529, var9 ^ 760408762);
            case 160 -> IIII(889732528, var9 ^ 1179582139);
            case 161 -> IIII(889732527, var9 ^ 796286550);
            case 162 -> IIII(889732526, var9 ^ -108986112);
            case 163 -> IIII(889732525, var9 ^ 1746528773);
            case 164 -> IIII(889732524, var9 ^ 328115476);
            case 165 -> IIII(889732523, var9 ^ -1217220237);
            case 166 -> IIII(889732522, var9 ^ 1648901357);
            case 167 -> IIII(889732521, var9 ^ 96591532);
            case 168 -> IIII(889732520, var9 ^ 1338695033);
            case 169 -> IIII(889732519, var9 ^ 1087565044);
            case 170 -> IIII(889732518, var9 ^ 1302542098);
            case 171 -> IIII(889732517, var9 ^ -67438546);
            case 172 -> IIII(889732516, var9 ^ 205000783);
            case 173 -> IIII(889732515, var9 ^ 958215110);
            case 174 -> IIII(889732514, var9 ^ -1219027993);
            case 175 -> IIII(889732513, var9 ^ -635211071);
            case 176 -> IIII(889732512, var9 ^ -223678322);
            case 177 -> IIII(889732575, var9 ^ 193227533);
            case 178 -> IIII(889732574, var9 ^ -971466449);
            case 179 -> IIII(889732573, var9 ^ -1069888787);
            case 180 -> IIII(889732572, var9 ^ -1744016243);
            case 181 -> IIII(889732571, var9 ^ 234472117);
            case 182 -> IIII(889732570, var9 ^ 2078037631);
            case 183 -> IIII(889732569, var9 ^ 1481533016);
            case 184 -> IIII(889732568, var9 ^ -1608361966);
            case 185 -> IIII(889732567, var9 ^ -1017936523);
            case 186 -> IIII(889732566, var9 ^ -927769794);
            case 187 -> IIII(889732565, var9 ^ -1373855421);
            case 188 -> IIII(889732564, var9 ^ -1657701707);
            case 189 -> IIII(889732563, var9 ^ -209287473);
            case 190 -> IIII(889732562, var9 ^ -1076472714);
            case 191 -> IIII(889732561, var9 ^ -131861343);
            case 192 -> IIII(889732560, var9 ^ -818820956);
            case 193 -> IIII(889732559, var9 ^ -196537964);
            case 194 -> IIII(889732558, var9 ^ -2085887722);
            case 195 -> IIII(889732557, var9 ^ 2082985891);
            case 196 -> IIII(889732556, var9 ^ -15318279);
            case 197 -> IIII(889732555, var9 ^ -2087343832);
            case 198 -> IIII(889732554, var9 ^ -1483518401);
            case 199 -> IIII(889732553, var9 ^ -1155566103);
            case 200 -> IIII(889732552, var9 ^ 1617140413);
            case 201 -> IIII(889732551, var9 ^ 759316759);
            case 202 -> 1;
            case 203 -> IIII(889732550, var9 ^ 1165623826);
            case 204 -> IIII(889732549, var9 ^ -1789520239);
            case 205 -> IIII(889732548, var9 ^ -1212584376);
            case 206 -> IIII(889732547, var9 ^ -225395321);
            case 207 -> IIII(889732546, var9 ^ 686169849);
            case 208 -> IIII(889732545, var9 ^ 230470694);
            case 209 -> IIII(889732544, var9 ^ 208182764);
            case 210 -> IIII(889732607, var9 ^ -1823936833);
            case 211 -> IIII(889732606, var9 ^ 2065528501);
            case 212 -> IIII(889732605, var9 ^ -707900682);
            case 213 -> IIII(889732604, var9 ^ -537128903);
            case 214 -> IIII(889732603, var9 ^ 1784414059);
            case 215 -> IIII(889732602, var9 ^ -224326853);
            case 216 -> IIII(889732601, var9 ^ -1924702890);
            case 217 -> IIII(889732600, var9 ^ -593375056);
            case 218 -> IIII(889732599, var9 ^ -1167614542);
            case 219 -> IIII(889732598, var9 ^ -679620487);
            case 220 -> IIII(889732597, var9 ^ -1982921076);
            case 221 -> IIII(889732596, var9 ^ -961313213);
            case 222 -> IIII(889732595, var9 ^ -428657782);
            case 223 -> IIII(889732594, var9 ^ 1095834044);
            case 224 -> IIII(889732593, var9 ^ -371655347);
            case 225 -> IIII(889732592, var9 ^ -594979659);
            case 226 -> IIII(889732591, var9 ^ -403283326);
            case 227 -> IIII(889732590, var9 ^ -134483705);
            case 228 -> IIII(889732589, var9 ^ 87443841);
            case 229 -> IIII(889732588, var9 ^ 791937217);
            case 230 -> IIII(889732587, var9 ^ -1738831645);
            case 231 -> IIII(889732586, var9 ^ -386141637);
            case 232 -> 5;
            case 233 -> IIII(889732585, var9 ^ -1113013526);
            case 234 -> IIII(889732584, var9 ^ -2135199255);
            case 235 -> IIII(889732583, var9 ^ 1219040762);
            case 236 -> IIII(889732582, var9 ^ 1909151099);
            case 237 -> IIII(889732581, var9 ^ 1846873188);
            case 238 -> IIII(889732580, var9 ^ 65347672);
            case 239 -> IIII(889732579, var9 ^ 25395146);
            case 240 -> IIII(889732578, var9 ^ 1782148279);
            case 241 -> IIII(889732577, var9 ^ -1786953542);
            case 242 -> IIII(889732576, var9 ^ 1203963877);
            case 243 -> IIII(889732127, var9 ^ -432652817);
            case 244 -> IIII(889732126, var9 ^ 605914735);
            case 245 -> IIII(889732125, var9 ^ 1150184124);
            case 246 -> IIII(889732124, var9 ^ 466054618);
            case 247 -> IIII(889732123, var9 ^ 1839308816);
            case 248 -> IIII(889732122, var9 ^ -196380496);
            case 249 -> IIII(889732121, var9 ^ 1693465695);
            case 250 -> IIII(889732120, var9 ^ -1484073508);
            case 251 -> 3;
            case 252 -> IIII(889732119, var9 ^ 2132249758);
            case 253 -> IIII(889732118, var9 ^ -1032053013);
            case 254 -> IIII(889732117, var9 ^ 567926048);
            default -> IIII(889732116, var9 ^ -460877042);
         };
         int var5 = (var1 & IIII(889732115, var9 ^ 47760192)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIII(889732114, var9 ^ 318101343)) >>> IIII(889732113, var9 ^ -1705222167)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIII(889732112, var9 ^ 1549966023);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIII(889732111, var9 ^ -1267178453);
            }
         }

         IIII[var2] = new String(var3).intern();
      }

      return IIII[var2];
   }

   private static void lll() {
      int var0 = 1192128805;
      IIl[0] = I(llI(IIII(889732110, var0 ^ -2088924515), IIII(889732109, var0 ^ -950892576)).toCharArray(), 53623L, IIII(889732108, var0 ^ 187108971));
      IIl[1] = I(llI(IIII(889732107, var0 ^ -1906981493), IIII(889732106, var0 ^ 718371876)).toCharArray(), 18311L, IIII(889732105, var0 ^ -1775725224));
      IIl[2] = I(llI(IIII(889732104, var0 ^ 1389378749), IIII(889732103, var0 ^ 1859519725)).toCharArray(), 58615L, IIII(889732102, var0 ^ 2121489747));
      IIl[3] = I(llI(IIII(889732101, var0 ^ -1091919322), IIII(889732100, var0 ^ 465779755)).toCharArray(), 18101L, IIII(889732099, var0 ^ 359600356));
      IIl[4] = I(llI(IIII(889732098, var0 ^ 2085409978), IIII(889732097, var0 ^ -1368675184)).toCharArray(), 48409L, IIII(889732096, var0 ^ 1501523538));
      IIl[5] = I(llI(IIII(889732159, var0 ^ -1238942634), IIII(889732158, var0 ^ -1168475148)).toCharArray(), 11761L, IIII(889732157, var0 ^ 1383186356));
      IIl[IIII(889732156, var0 ^ 1306580270)] = I(
         llI(IIII(889732155, var0 ^ -994827293), IIII(889732154, var0 ^ -685024547)).toCharArray(), 20631L, IIII(889732153, var0 ^ 611323527)
      );
      IIl[IIII(889732152, var0 ^ -457840063)] = I(
         llI(IIII(889732151, var0 ^ -649624153), IIII(889732150, var0 ^ 1753286039)).toCharArray(), 79182L, IIII(889732149, var0 ^ -613861056)
      );
      IIl[IIII(889732148, var0 ^ -227206982)] = I(
         llI(IIII(889732147, var0 ^ 419710339), IIII(889732146, var0 ^ -70595695)).toCharArray(), 95954L, IIII(889732145, var0 ^ -737361161)
      );
      IIl[IIII(889732144, var0 ^ -1939606416)] = I(
         llI(IIII(889732143, var0 ^ -11593310), IIII(889732142, var0 ^ 14391479)).toCharArray(), 23876L, IIII(889732141, var0 ^ -278231031)
      );
      IIl[IIII(889732140, var0 ^ -768839600)] = I(
         llI(IIII(889732139, var0 ^ 2059517392), IIII(889732138, var0 ^ 174824316)).toCharArray(), 40390L, IIII(889732137, var0 ^ -945687814)
      );
      IIl[IIII(889732136, var0 ^ -969767200)] = I(
         llI(IIII(889732135, var0 ^ 811360761), IIII(889732134, var0 ^ -411929852)).toCharArray(), 39165L, IIII(889732133, var0 ^ -160518454)
      );
      IIl[IIII(889732132, var0 ^ 587315936)] = I(
         llI(IIII(889732131, var0 ^ 1737061645), IIII(889732130, var0 ^ 843408041)).toCharArray(), 92153L, IIII(889732129, var0 ^ -1790440411)
      );
      IIl[IIII(889732128, var0 ^ 309807650)] = I(
         llI(IIII(889732191, var0 ^ -187788436), IIII(889732190, var0 ^ 297483607)).toCharArray(), 72407L, IIII(889732189, var0 ^ -435662782)
      );
      IIl[IIII(889732188, var0 ^ 1118702383)] = I(
         llI(IIII(889732187, var0 ^ -1459648038), IIII(889732186, var0 ^ -1348235605)).toCharArray(), 76608L, IIII(889732185, var0 ^ -419270716)
      );
      IIl[IIII(889732184, var0 ^ -2080912142)] = I(
         llI(IIII(889732183, var0 ^ -701445754), IIII(889732182, var0 ^ 1524238093)).toCharArray(), 64485L, IIII(889732181, var0 ^ -898756340)
      );
      IIl[IIII(889732180, var0 ^ -393484794)] = I(
         llI(IIII(889732179, var0 ^ 411956924), IIII(889732178, var0 ^ -1609420823)).toCharArray(), 51668L, IIII(889732177, var0 ^ -453116520)
      );
   }
}
