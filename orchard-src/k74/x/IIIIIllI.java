package k74.x;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class IIIIIllI extends IlIIIIIIl {
   private static final String[] I;
   private final List<lllll> II;
   private final lllIIlII Il;
   private static final double lI = 4.0;
   private static final int[] IIlI;
   private static String[] ll;
   private final IllIII<lIlIllIl> III;
   private static final double IIl = 1.0;
   private final IllIlI<UUID> IlI;
   private static final String[] Ill;
   private static final String[] IIll;
   private static final int lII = 190;
   private long lIl;
   private static final int llI = 255;
   private static final double lll = 1.0;
   private static final Object[] IlII;
   private static final double IIII = 2.0;
   private static final int IIIl = -436207616;

   private double I(double var1, double var3) {
      return Math.max(2.0, Math.min(var1 * 0.28, Math.min(var3 * 0.22, 10.0)));
   }

   @Override
   public void llIl() {
      this.II.clear();
      this.IlI.l();
      this.lIl = 0L;
   }

   private void l(class_332 var1, lllll var2, double var3, double var5, double var7, double var9) {
      double var11 = var3 - 1.0 - 3.0;
      if (var11 < 1.0) {
         var11 = var3 + var7 + 3.0;
      }

      double var13 = Math.max(0.0, Math.min(1.0, var2.II()));
      double var15 = Math.max(1.0, (double)Math.round(var9 * var13));
      int var17 = IIIlllII.III(var13).getRGB();
      IlIIlllIl.Il(var1, var11 - 1.0, var5 - 1.0, var11 + 1.0 + 1.0, var5 + var9 + 1.0, lIIl(-531452734, 1967478479 ^ 768856137));
      IlIIlllIl.Il(var1, var11, var5 + var9 - var15, var11 + 1.0, var5 + var9, var17);
   }

   private static String lIlI(int var0, byte var1, int var2, char var3, byte var4, char var5, byte var6) {
      int var11 = var0 ^ -602486899;
      char[] var10 = IIll[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])IlII[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         IlII[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 54828;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 15) {
            default -> 204;
            case 1 -> 175;
            case 2 -> 16;
            case 3 -> 150;
            case 4 -> 97;
            case 5 -> 184;
            case 6 -> 120;
            case 7 -> 58;
            case 8 -> 149;
            case 9 -> 111;
            case 10 -> 219;
            case 11 -> 144;
            case 12 -> 158;
            case 13 -> 186;
            case 14 -> 111;
         } ^ var9 ^ 448 ^ var8 ^ var5 ^ var2 ^ var3 ^ var0 ^ var1 ^ var4 ^ var6);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   private static String II(char[] var0, long var1, int var3) {
      int var4 = lIIl(-531452733, -1801925373 ^ 1493027408) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIIl(-531452736, -1801925373 ^ 312265831);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static void Il() {
      int var0 = 1271473803;
      ll[0] = II(IIlI(lIIl(-531452735, var0 ^ 497467550), lIIl(-531452730, var0 ^ 1220147815)).toCharArray(), 49131L, lIIl(-531452729, var0 ^ 1694398064));
      ll[1] = II(IIlI(lIIl(-531452732, var0 ^ 1454514043), lIIl(-531452731, var0 ^ -681887680)).toCharArray(), 44790L, lIIl(-531452726, var0 ^ -1834744619));
      ll[2] = II(IIlI(lIIl(-531452725, var0 ^ -1195429152), lIIl(-531452728, var0 ^ -1888467045)).toCharArray(), 88433L, lIIl(-531452727, var0 ^ -1078859432));
      ll[3] = II(IIlI(lIIl(-531452722, var0 ^ 1443562279), lIIl(-531452721, var0 ^ -1833488209)).toCharArray(), 52857L, lIIl(-531452724, var0 ^ -408378146));
   }

   public IIIIIllI() {
      super(IlIIllIII.Ill(ll[2]), lllIIlIl.IIl, IlIIllIII.Ill(ll[1]));
      this.III = this.IllIIll(new IllIII<>(IlIIllIII.Ill(ll[3]), lIlIllIl.class, lIlIllIl.ll));
      this.Il = this.IllIIll(new lllIIlII(IlIIllIII.Ill(ll[0]), true));
      this.IlI = new IllIlI<>();
      this.II = new ArrayList<>();
   }

   private double lI(class_1657 var1) {
      double var2 = Math.max(0.0F, var1.method_6067());
      double var4 = Math.max(0.0F, var1.method_6032()) + var2;
      double var6 = Math.max(1.0F, var1.method_6063() + var1.method_6067());
      return Math.max(0.0, Math.min(1.0, var4 / var6));
   }

   private Color ll(int var1) {
      Color var2 = Color.WHITE;
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null && var3.II() != null && var3.II().IlIIll() != null) {
         var2 = var3.II().IlIIll().lIlll();
      }

      int var4 = Math.max(0, Math.min(lIIl(-531452723, 481388366 ^ -181067369), var1));
      return new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), var4);
   }

   private double III(double var1) {
      return Math.round(var1);
   }

   private void IIl(class_332 var1, double var2, double var4, double var6, double var8, int var10) {
      double var11 = this.I(var6, var8);
      double var13 = this.IIII(var6, var8);
      this.IlIl(IIIIIllI::llI, var2, var4, var6, var8, var11, var13, 3.0, 1.0);
      this.IlIl(IIIIIllI::lll, var2, var4, var6, var8, var11, var13, 1.0, 0.0);
   }

   private static int lIIl(int var0, int var1) {
      int var2 = IIlI[var0 ^ -531452734] ^ var1 ^ var0;
      var2 ^= 32476;
      var2 += 28552;
      var2 -= 59229;
      var2 ^= 56444;
      var2 ^= 1459;
      var2 ^= 23544;
      var2 += 40683;
      var2 ^= 33572;
      return var2 - 24127;
   }

   @Override
   public void IlI(lIIlIl var1) {
      this.II.clear();
      if (this.IIIIlIl() && IlIII.IIIIII(var1)) {
         class_310 var2 = class_310.method_1551();
         if (var2.field_1724 != null && var2.field_1687 != null && var2.method_22683() != null) {
            float var3 = k74.x.IIll.IlIIlI(var2);
            HashSet var4 = new HashSet();

            for (class_1657 var6 : var2.field_1687.method_18456()) {
               if (IlIII.lIlll(var2, var6)) {
                  lllll var7 = this.IlII(var1, var6, var3);
                  if (var7 != null) {
                     UUID var8 = var6.method_5667();
                     var4.add(var8);
                     llIIIIll var9 = this.IlI.II(var8, new llIIIIll(var7.lI(), var7.l(), var7.lI() + var7.IIl(), var7.l() + var7.ll()), var7.I());
                     this.II.add(var7.Il(var9.II(), var9.lI(), Math.max(2.0, var9.Il()), Math.max(4.0, var9.ll())));
                  }
               }
            }

            this.IlI.I(var4);
            this.IIll();
            this.II.sort(Comparator.comparingDouble(lllll::I).reversed());
         } else {
            this.IlI.l();
            this.IIll();
         }
      } else {
         this.IlI.l();
         this.IIll();
      }
   }

   private llIlI Ill(lIIlIl var1, class_238 var2) {
      double var3 = (var2.field_1323 + var2.field_1320) * 0.5;
      double var5 = (var2.field_1321 + var2.field_1324) * 0.5;
      class_243 var7 = new class_243(var3, var2.field_1322, var5);
      class_243 var8 = new class_243(var3, var2.field_1325, var5);
      class_243 var9 = new class_243(var3, (var2.field_1322 + var2.field_1325) * 0.5, var5);
      IlIllIIII var10 = IlIII.IlIll(var1, var7);
      IlIllIIII var11 = IlIII.IlIll(var1, var8);
      if (var10 != null && var11 != null) {
         double var22 = (var10.II() + var11.II()) * 0.5;
         double var14 = Math.min(var10.l(), var11.l());
         double var16 = Math.max(var10.l(), var11.l());
         double var18 = Math.max(4.0, var16 - var14);
         double var20 = Math.max(2.0, var18 * 0.36);
         return new llIlI(var22 - var20 * 0.5, var14, var22 + var20 * 0.5, var16);
      } else {
         IlIllIIII var12 = IlIII.IlIll(var1, var9);
         return var12 == null ? null : new llIlI(var12.II() - 1.0, var12.l() - 2.0, var12.II() + 1.0, var12.l() + 2.0);
      }
   }

   private void lII(class_332 var1, double var2, double var4, double var6, double var8, int var10, double var11) {
      IlIIlllIl.Il(var1, var2, var4, var2 + var6, var4 + var11, var10);
      IlIIlllIl.Il(var1, var2, var4 + var8 - var11, var2 + var6, var4 + var8, var10);
      IlIIlllIl.Il(var1, var2, var4, var2 + var11, var4 + var8, var10);
      IlIIlllIl.Il(var1, var2 + var6 - var11, var4, var2 + var6, var4 + var8, var10);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1972697943;
      int var16 = 0;
      String[] var10001 = new String[2];
      int var17 = 0;
      String[] var15 = var10001;
      short var18 = 17146;
      int var14 = "A궇䖓괠퉸\uf04d젏\ue2a1ꊔ鋼鿐⤃˧攕\uf459딻띪뿱䥾䮍騱ŧ銱雳\uf87cḏ咟碶䐙ꇆ욢빖ꓩ뇢豰\uf10fฝ慣蹢䧮䞲ᢩ求\uef1a鏳覑\uf431\ue5ca輟\uecbe䱡\udfa6\uf171딆☫뼩䩌隩ผႛ\uf6adꂟ浔塘\uf1f6㭋\u0019糣꒫᪈퐶븨쾱᜶溜\ud9e3朄צּ䱿螞ﰁ嬒쫵鸙놻矚윍맞鸑ݏ䤹謢"
         .length();
      String var13 = "A궇䖓괠퉸\uf04d젏\ue2a1ꊔ鋼鿐⤃˧攕\uf459딻띪뿱䥾䮍騱ŧ銱雳\uf87cḏ咟碶䐙ꇆ욢빖ꓩ뇢豰\uf10fฝ慣蹢䧮䞲ᢩ求\uef1a鏳覑\uf431\ue5ca輟\uecbe䱡\udfa6\uf171딆☫뼩䩌隩ผႛ\uf6adꂟ浔塘\uf1f6㭋\u0019糣꒫᪈퐶븨쾱᜶溜\ud9e3朄צּ䱿螞ﰁ嬒쫵鸙놻矚윍맞鸑ݏ䤹謢";

      do {
         char var10000 = var13.charAt(var17);
         int var21 = 0;
         char var19 = var10000;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 37;
               case 1 -> 88;
               case 2 -> 6;
               case 3 -> 164;
               case 4 -> 192;
            }) ^ var22;
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

      IIll = var15;
      IlII = new Object[var15.length];
      int var9 = -1054064148;
      byte[] var7 = "\u009fé&¨Ôðv\u008a§{¤yw\u0010z\u0015ÝñÃ=ù\u0085\u0080\u0081<\u0004¥÷B\u0012W¹Éfy½Ò\t\u0088båÆÛ\u001f\u0096}òü<½¹¾\u0007þB\u001b%\u0080ÄôÈûãÉi¸y^\u007f5v\u0087°ÀÌ-\u001d^JpO¼õõ÷\u00003ùùïØÄù8Å:y\u009d+su\u000e×Òb\u0002¢áb\u007föô@§©R\u00979«h\u0007m¬dë\u0096ØÊ.\u0090Vs¯\u0083ÎëÿÐg\u0011õ®ô\u0011{\u0080\u0099Ù\u009aK\u009b$s/\u008a\u0001\f\u0086\u0098L,,\u000fà.¯ÀßiÑðM¤àÂHÌaí6\u0085Ð\u0017¶ú\u008e(Xº©¡¥P°Ø\u009e´ð\u0006\u009e\u0095èB½ÏÊm´Ç¹!íqBB\u0018\u0014t¸´ÑÐ|öÜÓ\\<\u0082±WP?PvÙ{^â\\wåÀ\u008cãr\u001eTmzÑoÌÕS¥ÒÈ¸Ð%\u0017FhÌâ\u0004ý¡Ñã¿I\u001a¨\u001f0mé\u001dbi¦|Ã\\\u0000\u0010Ö<Ø^×âÒ\u001e\b\u0003Å#\u0095ê lì\u001cm\u009b\u0091HÿyGØ\u009e\u0085\u0016õH\u0013Q¹í!\u0082\u0016!(?r*rtFGJ\u0005¿\u0085\u0013\u0018¼c½wäµseÚÓ¶Ñ|^¤Ê\u0007·\r1Â\u00953Õ\t\u0007Ú9\t»\u00ad\u0091\u008b2í\u0085á1a2\u0004¾\u0086%\r*\u0084\u0010\u0086Ò\u008fÒ\u008e6\u0018©\f9lÚòkÞoæçÅv\u0081\u0010ÓÖ©\u0019Öïë½(\u0093L\u0095¿ùáq\u00133K0\u0016û>øëW¬î£+\u000b|=Q÷Þ~®\u0098N³\u009c%\u0093ËòD¬+\u00ad\u0095(\u0091¿gîn\u009cË\u0082P\u008fJ\tA·\u009b\u000ef\u0084\u0004g\u007f\u009e+¢?\u009a¦Ø®N\rË8\nÅ\fþBí\u008enÑ\u000b¶¸{ãú\u0082 :_\u00adr¥Ñµ\r\u0010ÏÿäÖ\u0012à>ñµxãÜ\u0001\nø/Ý\u0087óï¢q«cýÌ`c*ÓÜñóH\u0007\u0096\u008b¤\u001e\u0015yµ\u009cp\u001b \u009c)åjm\u0085eö\u0092r\u0097\u0000\u009eÝîÃEw\u0094MlÃ^N OÆ\u0007ú\u009dQ5»\u0014Ç,,êì¦\u00adW\u0092±wVü\u0097Å\u0012è\fu~&^\u008a£÷$\u0091'\u001a\f!?£?ÃÌf\u001a[\u000b\u009fë¯\u0015ç»®\u0010e`û)\bW\u007f°\u008có\u0007¬Z·\t¯A\u0086S!ï?r¨\u001b\u0014î\u008a\u0016Õ4Zé\u0087\u008dô»5\u008dQaF®çÔq×øÍ0w,Ô\u0018(¶3\u0016%?|\bÆ|\"¬îv\u008er\u0015\u008d\u0083°ÑAÚL\u0002\u0004ö¡\u0089OØ\u0098,\u0081¿« ½ÿ\u009c¡aß\u0012i¸\u0084Pmuø¾p+\u0004x±\u0098Æl+0Ï\u001cwS-9ü';ñH\u0081ß´\u0099\u00869o<yÄ3H7µ\u008fyÈu\u0090±èÇ\u0084ô©ÔEÙi\u0083W\u008cÉ}né¶h¥,\t\u0002\u0015\u0001u\u0014¼£c¢ûz@Ì'r\u008dÖD-±è\u008ejQì1×àò|\u0092\u0084Õ\u0002\u0087Lß,\b!ý\u0093ý\u008e'ï/È\tbû\u0090>\u0082\u001a!âbÒ Ñûâ\u0003\u0083¾ÈqÂ\u007f\u0007u\u008b\u0090muÁcL\u0090ç\u00ad\u0012Áhâ~ E1q\tÊ\u0094\u009bÇ\u009eÈÿ/¸<:\u00adiÿÃI\u001br\u0018×¯á4$éöy®{¢jQâ\u009b\u008a}_`v\u0093Ü¶Um§*u|Ëet\u007f½(-\u0004Û¼*C,3ÌõoÕ\u008c0Y\u008cäÙáÿ\u0085hß\u0007\u0010Þ\f´µ\u0005ÑÈø§\u0085\bÜ\fÆ¨à\u000eÃlh\u0083ý\u0085®\u000b\u0095Åi°\u001aÈn»À>\u0080\u00996 v\fNHãFøA\u0013§(À'\fa/\u008bjúÈ¨{ô@ß\u0093<´\u000bò\"«É<:.\u0004õ\u000bÙ]\u009d¯¨wI½1>q³@\u008c.\u0095\u0011.PU +\u008b°\u001cµç?àÞ\u007f\u009b´#HG\u007fÝâÂ;í\u0014_\u0014rßÿ(´§ÉÌ\r¶3\u0015\u0096°UJ\u00ad.âhy\u0097r¬ZÜ*¬\u009aê»t\u008d\u000eýVo¦\u0087á\u0088X;\u0005Mr\u001f°}\u0098Q\\ç¢\u0091Óâým§{ë\u008akcX\u0001u"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IIlI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IIlI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIlI(-602486899, (byte)4, 1619116389, '腋', (byte)70, (char)'ꢨ', (byte)3)).length();
      int var1 = lIIl(-531452720, var23 ^ 466906960);
      int var25 = -1;

      label98:
      while (true) {
         int var29 = lIIl(-531452719, var23 ^ -1236604660);
         String var31 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label93: {
               char[] var46 = var31.toCharArray();
               int var10004 = var46.length;
               int var6 = 0;
               int var49 = var29;
               var42 = var46;
               int var36 = var10004;
               char[] var58;
               int var10006;
               if (var10004 <= 1) {
                  var58 = var46;
                  var10004 = var29;
                  var10006 = var6;
               } else {
                  var49 = var29;
                  var36 = var10004;
                  if (var10004 <= var6) {
                     break label93;
                  }

                  var58 = var46;
                  var10004 = var29;
                  var10006 = var6;
               }

               while (true) {
                  var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % lIIl(-531452716, var23 ^ 1392212892)) {
                     case 0 -> lIIl(-531452715, var23 ^ 1378641434);
                     case 1 -> lIIl(-531452710, var23 ^ -762738600);
                     case 2 -> lIIl(-531452709, var23 ^ -568691624);
                     case 3 -> lIIl(-531452712, var23 ^ -921304673);
                     case 4 -> lIIl(-531452711, var23 ^ -915712672);
                     case 5 -> lIIl(-531452706, var23 ^ -340587919);
                     default -> lIIl(-531452705, var23 ^ 1009584303);
                  });
                  var6++;
                  if (var49 == 0) {
                     var10006 = var49;
                     var58 = var42;
                     var10004 = var49;
                  } else {
                     if (var36 <= var6) {
                        break;
                     }

                     var58 = var42;
                     var10004 = var49;
                     var10006 = var6;
                  }
               }
            }

            String var51 = new String(var42).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var51;
                  if ((var25 += var1) >= var4) {
                     Ill = var5;
                     I = new String[4];
                     ll = new String[4];
                     Il();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var51;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label98;
                  }

                  var4 = (var2 = lIlI(-602486900, 59, 677831952, '恘', (byte)-5, '遢', 23)).length();
                  var1 = lIIl(-531452714, var23 ^ -458729930);
                  var25 = -1;
            }

            var29 = lIIl(-531452713, var23 ^ 1544851594);
            var31 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private lllll lIl(class_310 var1, class_1657 var2, llIlI var3, int var4, int var5) {
      if (var3 == null) {
         return null;
      } else {
         double var6 = var3.II() - var3.l();
         double var8 = var3.Il() - var3.I();
         if (Double.isFinite(var6) && Double.isFinite(var8) && !(var6 < 0.0) && !(var8 < 0.0)) {
            double var10 = Math.max(0.35, Math.min(2.0, Math.max(var6, var8) * 0.006));
            double var12 = var3.l() - var10;
            double var14 = var3.I() - var10;
            double var16 = var3.II() + var10;
            double var18 = var3.Il() + var10;
            if (!(var16 < 0.0) && !(var12 > var4) && !(var18 < 0.0) && !(var14 > var5)) {
               var12 = Math.max(0.0, var12);
               var14 = Math.max(0.0, var14);
               var16 = Math.min((double)var4, var16);
               var18 = Math.min((double)var5, var18);
               if (!(var16 <= var12) && !(var18 <= var14)) {
                  double var20 = (var12 + var16) * 0.5;
                  double var22 = (var14 + var18) * 0.5;
                  double var24 = Math.min((double)var4, Math.max(2.0, var16 - var12));
                  double var26 = Math.min((double)var5, Math.max(4.0, var18 - var14));
                  double var28 = Math.max(0.0, Math.min(var4 - var24, var20 - var24 * 0.5));
                  double var30 = Math.max(0.0, Math.min(var5 - var26, var22 - var26 * 0.5));
                  return new lllll(var28, var30, var24, var26, var2.method_5858(var1.field_1724), this.lI(var2), 1.0);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   private static void llI(class_332 var0, double var1, double var3, double var5, double var7) {
      IlIIlllIl.Il(var0, var1, var3, var1 + var5, var3 + var7, lIIl(-531452718, -2034300242 ^ 679007182));
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      if (this.IIIIlIl() && !this.II.isEmpty()) {
         for (lllll var6 : this.II) {
            this.lIII(var1, var6);
         }
      }
   }

   private static void lll(class_332 var0, int var1, double var2, double var4, double var6, double var8) {
      IlIIlllIl.Il(var0, var2, var4, var2 + var6, var4 + var8, var1);
   }

   private double IIII(double var1, double var3) {
      return Math.max(2.0, Math.min(var3 * 0.22, Math.min(var1 * 0.28, 10.0)));
   }

   private List<class_243> IIIl(class_238 var1) {
      ArrayList var3 = new ArrayList(lIIl(-531452717, 1878902350 ^ 834082612));
      String[] var10000 = IIllllIl.IIIIl();
      double[] var4 = new double[]{var1.field_1323, var1.field_1320};
      int var5 = var4.length;
      String[] var2 = var10000;
      int var6 = 0;

      label36:
      while (var6 < var5) {
         double var7 = var4[var6];
         double[] var9 = new double[]{var1.field_1322, var1.field_1325};
         int var10 = var9.length;
         int var11 = 0;

         while (true) {
            if (var11 < var10) {
               double var12 = var9[var11];

               for (double var17 : new double[]{var1.field_1321, var1.field_1324}) {
                  var3.add(new class_243(var7, var12, var17));
                  if (var2 != null) {
                     break;
                  }
               }

               var11++;
               if (var2 == null) {
                  continue;
               }
            }

            var6++;
            if (var2 != null) {
               break label36;
            }
            break;
         }
      }

      double var19 = (var1.field_1323 + var1.field_1320) * 0.5;
      double var20 = (var1.field_1322 + var1.field_1325) * 0.5;
      double var8 = (var1.field_1321 + var1.field_1324) * 0.5;
      var3.add(new class_243(var19, var1.field_1322, var8));
      var3.add(new class_243(var19, var1.field_1325, var8));
      var3.add(new class_243(var19, var20, var1.field_1321));
      var3.add(new class_243(var19, var20, var1.field_1324));
      var3.add(new class_243(var1.field_1323, var20, var8));
      var3.add(new class_243(var1.field_1320, var20, var8));
      return var3;
   }

   private static String IIlI(int var0, int var1) {
      int var9 = 1959209650;
      int var2 = (var0 ^ lIIl(-531452708, var9 ^ 1389697737)) & lIIl(-531452707, var9 ^ -1104326024);
      if (I[var2] == null) {
         char[] var3 = Ill[var2].toCharArray();

         int var4 = switch (var3[0] & lIIl(-531452702, var9 ^ 2066274814)) {
            case 0 -> lIIl(-531452701, var9 ^ -96779520);
            case 1 -> lIIl(-531452704, var9 ^ -1435964711);
            case 2 -> lIIl(-531452703, var9 ^ -1609140100);
            case 3 -> 2;
            case 4 -> lIIl(-531452698, var9 ^ 775428029);
            case 5 -> lIIl(-531452697, var9 ^ -806152609);
            case 6 -> lIIl(-531452700, var9 ^ 647431956);
            case 7 -> lIIl(-531452699, var9 ^ 1497241017);
            case 8 -> lIIl(-531452694, var9 ^ 2039775680);
            case 9 -> lIIl(-531452693, var9 ^ 2065124747);
            case 10 -> lIIl(-531452696, var9 ^ 1013546296);
            case 11 -> lIIl(-531452695, var9 ^ -245870726);
            case 12 -> lIIl(-531452690, var9 ^ -1713807312);
            case 13 -> lIIl(-531452689, var9 ^ -798451136);
            case 14 -> lIIl(-531452692, var9 ^ -1355373177);
            case 15 -> lIIl(-531452691, var9 ^ -284087041);
            case 16 -> lIIl(-531452686, var9 ^ 84432251);
            case 17 -> lIIl(-531452685, var9 ^ -515339406);
            case 18 -> lIIl(-531452688, var9 ^ -1068445864);
            case 19 -> lIIl(-531452687, var9 ^ -1703746666);
            case 20 -> lIIl(-531452682, var9 ^ -1845383939);
            case 21 -> lIIl(-531452681, var9 ^ 620416858);
            case 22 -> lIIl(-531452684, var9 ^ 1103901955);
            case 23 -> lIIl(-531452683, var9 ^ -2073497335);
            case 24 -> lIIl(-531452678, var9 ^ -1989422633);
            case 25 -> lIIl(-531452677, var9 ^ -687219975);
            case 26 -> lIIl(-531452680, var9 ^ 1793653546);
            case 27 -> lIIl(-531452679, var9 ^ 786853326);
            case 28 -> lIIl(-531452674, var9 ^ 576540346);
            case 29 -> lIIl(-531452673, var9 ^ -1228237907);
            case 30 -> 1;
            case 31 -> lIIl(-531452676, var9 ^ 952261758);
            case 32 -> lIIl(-531452675, var9 ^ -1720852877);
            case 33 -> lIIl(-531452798, var9 ^ -2022688974);
            case 34 -> lIIl(-531452797, var9 ^ 1890569132);
            case 35 -> lIIl(-531452800, var9 ^ -1722119825);
            case 36 -> lIIl(-531452799, var9 ^ -194417081);
            case 37 -> lIIl(-531452794, var9 ^ 480388495);
            case 38 -> lIIl(-531452793, var9 ^ 1708483743);
            case 39 -> lIIl(-531452796, var9 ^ 936455094);
            case 40 -> lIIl(-531452795, var9 ^ -1763406582);
            case 41 -> lIIl(-531452790, var9 ^ -2088479487);
            case 42 -> lIIl(-531452789, var9 ^ -2108006644);
            case 43 -> lIIl(-531452792, var9 ^ 1572555642);
            case 44 -> lIIl(-531452791, var9 ^ -1068356157);
            case 45 -> lIIl(-531452786, var9 ^ -1180376512);
            case 46 -> lIIl(-531452785, var9 ^ -990874950);
            case 47 -> lIIl(-531452788, var9 ^ 308285821);
            case 48 -> lIIl(-531452787, var9 ^ 1129170284);
            case 49 -> lIIl(-531452782, var9 ^ 67199105);
            case 50 -> lIIl(-531452781, var9 ^ -676418377);
            case 51 -> lIIl(-531452784, var9 ^ 1791665543);
            case 52 -> lIIl(-531452783, var9 ^ 570345986);
            case 53 -> lIIl(-531452778, var9 ^ 1342638814);
            case 54 -> lIIl(-531452777, var9 ^ 1292168844);
            case 55 -> lIIl(-531452780, var9 ^ 576469226);
            case 56 -> lIIl(-531452779, var9 ^ 811753048);
            case 57 -> lIIl(-531452774, var9 ^ -2067475675);
            case 58 -> lIIl(-531452773, var9 ^ -1614857569);
            case 59 -> lIIl(-531452776, var9 ^ 1685723151);
            case 60 -> lIIl(-531452775, var9 ^ -2135848220);
            case 61 -> lIIl(-531452770, var9 ^ 1823552602);
            case 62 -> lIIl(-531452769, var9 ^ -1003241642);
            case 63 -> lIIl(-531452772, var9 ^ -799425282);
            case 64 -> lIIl(-531452771, var9 ^ 1740387092);
            case 65 -> lIIl(-531452766, var9 ^ 1890952574);
            case 66 -> lIIl(-531452765, var9 ^ 1161715390);
            case 67 -> lIIl(-531452768, var9 ^ -2026456178);
            case 68 -> lIIl(-531452767, var9 ^ -55266217);
            case 69 -> lIIl(-531452762, var9 ^ -1890917356);
            case 70 -> lIIl(-531452761, var9 ^ 979266161);
            case 71 -> lIIl(-531452764, var9 ^ 590978290);
            case 72 -> lIIl(-531452763, var9 ^ -2095999763);
            case 73 -> lIIl(-531452758, var9 ^ -1168952598);
            case 74 -> lIIl(-531452757, var9 ^ -957081200);
            case 75 -> lIIl(-531452760, var9 ^ -1403388034);
            case 76 -> lIIl(-531452759, var9 ^ 1727249736);
            case 77 -> lIIl(-531452754, var9 ^ -1366919485);
            case 78 -> lIIl(-531452753, var9 ^ 34890751);
            case 79 -> lIIl(-531452756, var9 ^ 2125722604);
            case 80 -> lIIl(-531452755, var9 ^ 72307683);
            case 81 -> lIIl(-531452750, var9 ^ -81738832);
            case 82 -> lIIl(-531452749, var9 ^ -912449844);
            case 83 -> lIIl(-531452752, var9 ^ -1476648550);
            case 84 -> lIIl(-531452751, var9 ^ -131226224);
            case 85 -> lIIl(-531452746, var9 ^ -354458855);
            case 86 -> lIIl(-531452745, var9 ^ -915206247);
            case 87 -> lIIl(-531452748, var9 ^ -621640490);
            case 88 -> lIIl(-531452747, var9 ^ -500989123);
            case 89 -> lIIl(-531452742, var9 ^ -776148449);
            case 90 -> lIIl(-531452741, var9 ^ -879546568);
            case 91 -> lIIl(-531452744, var9 ^ -820095542);
            case 92 -> lIIl(-531452743, var9 ^ 464865042);
            case 93 -> lIIl(-531452738, var9 ^ 1602060657);
            case 94 -> lIIl(-531452737, var9 ^ 391447329);
            case 95 -> lIIl(-531452740, var9 ^ -2068628516);
            case 96 -> lIIl(-531452739, var9 ^ 777746373);
            case 97 -> lIIl(-531452862, var9 ^ -175976319);
            case 98 -> lIIl(-531452861, var9 ^ 656235725);
            case 99 -> lIIl(-531452864, var9 ^ 1487421660);
            case 100 -> lIIl(-531452863, var9 ^ -1318150171);
            case 101 -> lIIl(-531452858, var9 ^ 1799960638);
            case 102 -> lIIl(-531452857, var9 ^ -1234924360);
            case 103 -> lIIl(-531452860, var9 ^ -1382591821);
            case 104 -> lIIl(-531452859, var9 ^ -1504235557);
            case 105 -> lIIl(-531452854, var9 ^ -19173212);
            case 106 -> lIIl(-531452853, var9 ^ 903587268);
            case 107 -> lIIl(-531452856, var9 ^ -1991672086);
            case 108 -> lIIl(-531452855, var9 ^ 1378747995);
            case 109 -> lIIl(-531452850, var9 ^ 1269692054);
            case 110 -> lIIl(-531452849, var9 ^ -909601163);
            case 111 -> lIIl(-531452852, var9 ^ -913217313);
            case 112 -> lIIl(-531452851, var9 ^ 943581326);
            case 113 -> lIIl(-531452846, var9 ^ -943056182);
            case 114 -> lIIl(-531452845, var9 ^ -882548201);
            case 115 -> lIIl(-531452848, var9 ^ 282008276);
            case 116 -> lIIl(-531452847, var9 ^ 964416395);
            case 117 -> lIIl(-531452842, var9 ^ 1979140937);
            case 118 -> lIIl(-531452841, var9 ^ -1356473258);
            case 119 -> lIIl(-531452844, var9 ^ -290698258);
            case 120 -> lIIl(-531452843, var9 ^ 2035442238);
            case 121 -> lIIl(-531452838, var9 ^ -118547350);
            case 122 -> lIIl(-531452837, var9 ^ 586052056);
            case 123 -> lIIl(-531452840, var9 ^ -1867881037);
            case 124 -> lIIl(-531452839, var9 ^ 549891015);
            case 125 -> lIIl(-531452834, var9 ^ -551847931);
            case 126 -> lIIl(-531452833, var9 ^ -996173974);
            case 127 -> lIIl(-531452836, var9 ^ 1955015696);
            case 128 -> lIIl(-531452835, var9 ^ -1770722388);
            case 129 -> lIIl(-531452830, var9 ^ 246616278);
            case 130 -> lIIl(-531452829, var9 ^ -89298657);
            case 131 -> lIIl(-531452832, var9 ^ -72816561);
            case 132 -> lIIl(-531452831, var9 ^ -1366194738);
            case 133 -> lIIl(-531452826, var9 ^ 705167784);
            case 134 -> lIIl(-531452825, var9 ^ 1377097606);
            case 135 -> lIIl(-531452828, var9 ^ 1545064290);
            case 136 -> lIIl(-531452827, var9 ^ 110714883);
            case 137 -> lIIl(-531452822, var9 ^ 655397900);
            case 138 -> lIIl(-531452821, var9 ^ -1154311406);
            case 139 -> lIIl(-531452824, var9 ^ 1642227353);
            case 140 -> lIIl(-531452823, var9 ^ -666093912);
            case 141 -> lIIl(-531452818, var9 ^ -655757332);
            case 142 -> lIIl(-531452817, var9 ^ -77637344);
            case 143 -> lIIl(-531452820, var9 ^ -2109718325);
            case 144 -> lIIl(-531452819, var9 ^ 580147548);
            case 145 -> lIIl(-531452814, var9 ^ 2098117632);
            case 146 -> lIIl(-531452813, var9 ^ 1887957680);
            case 147 -> lIIl(-531452816, var9 ^ -1815826862);
            case 148 -> lIIl(-531452815, var9 ^ -1144126599);
            case 149 -> lIIl(-531452810, var9 ^ 1077218473);
            case 150 -> lIIl(-531452809, var9 ^ -2064033818);
            case 151 -> lIIl(-531452812, var9 ^ 1471970103);
            case 152 -> lIIl(-531452811, var9 ^ -587770424);
            case 153 -> lIIl(-531452806, var9 ^ 2033791338);
            case 154 -> lIIl(-531452805, var9 ^ -184192147);
            case 155 -> lIIl(-531452808, var9 ^ -187084245);
            case 156 -> lIIl(-531452807, var9 ^ 1006635442);
            case 157 -> lIIl(-531452802, var9 ^ 952988990);
            case 158 -> lIIl(-531452801, var9 ^ 630426244);
            case 159 -> lIIl(-531452804, var9 ^ -467645459);
            case 160 -> lIIl(-531452803, var9 ^ 2122859050);
            case 161 -> lIIl(-531452926, var9 ^ 585867698);
            case 162 -> lIIl(-531452925, var9 ^ -1449151346);
            case 163 -> lIIl(-531452928, var9 ^ 490295948);
            case 164 -> lIIl(-531452927, var9 ^ -868305744);
            case 165 -> lIIl(-531452922, var9 ^ 1774275396);
            case 166 -> lIIl(-531452921, var9 ^ 495925382);
            case 167 -> lIIl(-531452924, var9 ^ 745601062);
            case 168 -> lIIl(-531452923, var9 ^ -464500099);
            case 169 -> lIIl(-531452918, var9 ^ -1592698569);
            case 170 -> lIIl(-531452917, var9 ^ -1932456309);
            case 171 -> lIIl(-531452920, var9 ^ -646843432);
            case 172 -> lIIl(-531452919, var9 ^ -1139873829);
            case 173 -> lIIl(-531452914, var9 ^ 2041679796);
            case 174 -> lIIl(-531452913, var9 ^ 1422760917);
            case 175 -> lIIl(-531452916, var9 ^ -153407561);
            case 176 -> lIIl(-531452915, var9 ^ 804799309);
            case 177 -> lIIl(-531452910, var9 ^ 657808314);
            case 178 -> lIIl(-531452909, var9 ^ 2013882359);
            case 179 -> lIIl(-531452912, var9 ^ 1072259242);
            case 180 -> lIIl(-531452911, var9 ^ -2108130033);
            case 181 -> lIIl(-531452906, var9 ^ -952346608);
            case 182 -> lIIl(-531452905, var9 ^ -755740123);
            case 183 -> lIIl(-531452908, var9 ^ 1570336881);
            case 184 -> lIIl(-531452907, var9 ^ -1472812758);
            case 185 -> lIIl(-531452902, var9 ^ 2054195118);
            case 186 -> lIIl(-531452901, var9 ^ -1373065183);
            case 187 -> lIIl(-531452904, var9 ^ 1335454901);
            case 188 -> lIIl(-531452903, var9 ^ -2028446645);
            case 189 -> lIIl(-531452898, var9 ^ -1212477715);
            case 190 -> lIIl(-531452897, var9 ^ -1647751386);
            case 191 -> lIIl(-531452900, var9 ^ 1389168307);
            case 192 -> lIIl(-531452899, var9 ^ 952978975);
            case 193 -> lIIl(-531452894, var9 ^ 422079232);
            case 194 -> lIIl(-531452893, var9 ^ 1199171053);
            case 195 -> lIIl(-531452896, var9 ^ 723044596);
            case 196 -> 5;
            case 197 -> lIIl(-531452895, var9 ^ 615597978);
            case 198 -> lIIl(-531452890, var9 ^ -830533600);
            case 199 -> lIIl(-531452889, var9 ^ -1432931065);
            case 200 -> lIIl(-531452892, var9 ^ 1863705624);
            case 201 -> lIIl(-531452891, var9 ^ -1762552829);
            case 202 -> lIIl(-531452886, var9 ^ 1299128934);
            case 203 -> lIIl(-531452885, var9 ^ 1637639848);
            case 204 -> lIIl(-531452888, var9 ^ 739702377);
            case 205 -> lIIl(-531452887, var9 ^ 1072263024);
            case 206 -> lIIl(-531452882, var9 ^ -540683772);
            case 207 -> lIIl(-531452881, var9 ^ 590041399);
            case 208 -> lIIl(-531452884, var9 ^ 13969963);
            case 209 -> lIIl(-531452883, var9 ^ 549733764);
            case 210 -> lIIl(-531452878, var9 ^ 566702300);
            case 211 -> lIIl(-531452877, var9 ^ 2025608795);
            case 212 -> lIIl(-531452880, var9 ^ 2147197214);
            case 213 -> lIIl(-531452879, var9 ^ -1722948939);
            case 214 -> lIIl(-531452874, var9 ^ -645343957);
            case 215 -> lIIl(-531452873, var9 ^ -1319015104);
            case 216 -> lIIl(-531452876, var9 ^ -791653873);
            case 217 -> lIIl(-531452875, var9 ^ 1164345643);
            case 218 -> lIIl(-531452870, var9 ^ -524461029);
            case 219 -> lIIl(-531452869, var9 ^ -1390475122);
            case 220 -> lIIl(-531452872, var9 ^ -1984672811);
            case 221 -> lIIl(-531452871, var9 ^ -1246343801);
            case 222 -> lIIl(-531452866, var9 ^ 1027305627);
            case 223 -> lIIl(-531452865, var9 ^ -72148813);
            case 224 -> lIIl(-531452868, var9 ^ 1007196150);
            case 225 -> lIIl(-531452867, var9 ^ 990072105);
            case 226 -> lIIl(-531452478, var9 ^ -719209614);
            case 227 -> 3;
            case 228 -> lIIl(-531452477, var9 ^ 599048816);
            case 229 -> lIIl(-531452480, var9 ^ -1224837969);
            case 230 -> lIIl(-531452479, var9 ^ 1176478802);
            case 231 -> lIIl(-531452474, var9 ^ 1924459976);
            case 232 -> lIIl(-531452473, var9 ^ -556632568);
            case 233 -> 4;
            case 234 -> lIIl(-531452476, var9 ^ -37520679);
            case 235 -> lIIl(-531452475, var9 ^ -1976848210);
            case 236 -> lIIl(-531452470, var9 ^ 1581952722);
            case 237 -> lIIl(-531452469, var9 ^ -1669024252);
            case 238 -> lIIl(-531452472, var9 ^ 1364035411);
            case 239 -> 0;
            case 240 -> lIIl(-531452471, var9 ^ 136651606);
            case 241 -> lIIl(-531452466, var9 ^ 586232744);
            case 242 -> lIIl(-531452465, var9 ^ 1808351015);
            case 243 -> lIIl(-531452468, var9 ^ -644474374);
            case 244 -> lIIl(-531452467, var9 ^ 2078857943);
            case 245 -> lIIl(-531452462, var9 ^ 2117287046);
            case 246 -> lIIl(-531452461, var9 ^ -530598964);
            case 247 -> lIIl(-531452464, var9 ^ -1949886588);
            case 248 -> lIIl(-531452463, var9 ^ 1995491351);
            case 249 -> lIIl(-531452458, var9 ^ -2007347360);
            case 250 -> lIIl(-531452457, var9 ^ -1196633240);
            case 251 -> lIIl(-531452460, var9 ^ 661091270);
            case 252 -> lIIl(-531452459, var9 ^ -518044163);
            case 253 -> lIIl(-531452454, var9 ^ 1477361045);
            case 254 -> lIIl(-531452453, var9 ^ -1022830284);
            default -> lIIl(-531452456, var9 ^ -124358944);
         };
         int var5 = (var1 & lIIl(-531452455, var9 ^ 741342234)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIl(-531452450, var9 ^ 258449693)) >>> lIIl(-531452449, var9 ^ -816695539)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIl(-531452452, var9 ^ -659131419);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIl(-531452451, var9 ^ 975046995);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }

   private double IIll() {
      long var1 = System.nanoTime();
      if (this.lIl <= 0L) {
         this.lIl = var1;
         return 0.016666666666666666;
      } else {
         double var3 = (var1 - this.lIl) / 1.0E9;
         this.lIl = var1;
         return Math.max(0.004166666666666667, Math.min(0.06666666666666667, var3));
      }
   }

   private lllll IlII(lIIlIl var1, class_1657 var2, float var3) {
      class_310 var4 = class_310.method_1551();
      if (var4.field_1724 != null && var4.method_22683() != null) {
         int var5 = var4.method_22683().method_4486();
         int var6 = var4.method_22683().method_4502();
         if (var5 > 0 && var6 > 0) {
            class_243 var7 = IlIII.IIll(var2, var3);
            class_238 var8 = var2.method_5829()
               .method_989(var7.field_1352 - var2.method_23317(), var7.field_1351 - var2.method_23318(), var7.field_1350 - var2.method_23321());
            llIlI var9 = this.IllI(var1, this.IIIl(var8));
            if (var9 == null) {
               var9 = this.Ill(var1, var8);
            }

            return this.lIl(var4, var2, var9, var5, var6);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void IlIl(lIlllI var1, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16) {
      double var18 = var2 - var16;
      double var20 = var4 - var16;
      double var22 = var2 + var6 + var16;
      double var24 = var4 + var8 + var16;
      double var26 = var10 + var16;
      double var28 = var12 + var16;
      var1.a(var18, var20, var26, var14);
      var1.a(var18, var20, var14, var28);
      var1.a(var22 - var26, var20, var26, var14);
      var1.a(var22 - var14, var20, var14, var28);
      var1.a(var18, var24 - var14, var26, var14);
      var1.a(var18, var24 - var28, var14, var28);
      var1.a(var22 - var26, var24 - var14, var26, var14);
      var1.a(var22 - var14, var24 - var28, var14, var28);
   }

   private llIlI IllI(lIIlIl var1, List<class_243> var2) {
      llIIIIll var3 = IlIII.IIlII(var1, var2);
      return var3 == null ? null : new llIlI(var3.II(), var3.lI(), var3.IIl(), var3.III());
   }

   private int Illl(int var1) {
      Color var2 = this.ll(var1);
      return var2.getAlpha() << lIIl(-531452446, -1149252016 ^ 307778323)
         | var2.getRed() << lIIl(-531452445, -1149252016 ^ -680364097)
         | var2.getGreen() << lIIl(-531452448, -1149252016 ^ -409454088)
         | var2.getBlue();
   }

   private void lIII(class_332 var1, lllll var2) {
      double var3 = this.III(var2.lI());
      double var5 = this.III(var2.l());
      double var7 = Math.max(2.0, this.III(var2.IIl()));
      double var9 = Math.max(4.0, this.III(var2.ll()));
      lIlIllIl var11 = this.III.IllI();
      int var12 = this.Illl(lIIl(-531452447, -462250833 ^ 581937923));
      int var13 = this.Illl(lIIl(-531452442, -462250833 ^ 670061875));
      if (var11 == lIlIllIl.ll) {
         this.lII(var1, var3 - 1.0, var5 - 1.0, var7 + 2.0, var9 + 2.0, lIIl(-531452441, -462250833 ^ 1491515343), 1.0);
         if (var7 > 2.0 && var9 > 2.0) {
            this.lII(var1, var3 + 1.0, var5 + 1.0, var7 - 2.0, var9 - 2.0, lIIl(-531452444, -462250833 ^ 1079327954), 1.0);
         }

         this.lII(var1, var3, var5, var7, var9, var12, 1.0);
      }

      if (var11 == lIlIllIl.l) {
         this.IIl(var1, var3, var5, var7, var9, var13);
      }

      if (this.Il.IllI()) {
         this.l(var1, var2, var3, var5, var7, var9);
      }
   }
}
