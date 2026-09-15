package k74.x;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_9779;

@Environment(EnvType.CLIENT)
public final class IIIIIllII implements ClientModInitializer {
   private final IlIIl I;
   private static final String[] llI;
   private boolean l;
   private static final int[] lIl;
   private static final Object[] lll;
   private boolean II;
   private Thread Il;
   private final IlllIlI lI;
   private static final String[] ll;
   private static IIIIIllII III;
   private static final String[] IIl;
   private static IlIIIIIIl[] IlI;
   private final lIlIl Ill;
   private final lIIIlIlI lII;

   public void I() {
      this.lIIl();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -887034921;
      String[] var10001 = new String[3];
      int var11 = 0;
      String[] var9 = var10001;
      int var10 = 0;
      int var8 = "\u0005ｊ柳︗奫ﺅ1✥昕☈욻⑊뛳⾢ۈ₰ᘊ⑱\ue6a2♣蛍╅ᘗⰘ\uf6b2⃚⛳⊂曇∰똃⊑욡⏣\uf6cc➥㘘⭈暼▚国➒䛍⾀嘅⩁\uf6aa⠣㛁␥嘓♨⚶⸺꛰⭲\u0011먄枊먹\uf72c뎫\ue769볳睕뻡㞗놰㜽넲睟뒄鞂끹".length();
      short var12 = 8969;
      String var7 = "\u0005ｊ柳︗奫ﺅ1✥昕☈욻⑊뛳⾢ۈ₰ᘊ⑱\ue6a2♣蛍╅ᘗⰘ\uf6b2⃚⛳⊂曇∰똃⊑욡⏣\uf6cc➥㘘⭈暼▚国➒䛍⾀嘅⩁\uf6aa⠣㛁␥嘓♨⚶⸺꛰⭲\u0011먄枊먹\uf72c뎫\ue769볳睕뻡㞗놰㜽넲睟뒄鞂끹";

      do {
         char var13 = var7.charAt(var11);
         int var25 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var25, var10002 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 227;
               case 1 -> 54;
               case 2 -> 46;
               case 3 -> 151;
               case 4 -> 140;
               case 5 -> 213;
               case 6 -> 228;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      llI = var9;
      lll = new Object[var9.length];
      int var21 = 0;
      byte var26 = 0;
      lIl = new int[293];
      byte[] var36 = "À\u0003ÖV\\Ñ\u001f»«´o\u009cO\u007fçî63þ\u001ac1¦0q´aK ²\u001f\u0012Â¥ý÷|òP.ê\u009a\u001d&]\u0011¯o\u0082¥ño¿½½ÂrqÃO\u009f(¶_\u0088\u0011I\u0091ÑÆ\u001d¦\u009blk½E·¨\u008d\u000f\u000edõî¼í¼\u0018\u0083ÔF}äêe\b7\u008cðN\u0004 \u0001¦ê\u0081Ïd*f-\u0089\u001d¼ÑÆjõ¬\u001es\u0002ðÙdó¨H\u0084\u0081/Îk\u0098\u0098Ù\u0093ÓV[\u008a«vfüæÑÜÇB\u0092`+.\u0086õ\u0003?\u0081Qoë?³°I\u0082ÐOA¿\u000f=¡·*ïwË\u0010%\u001f¿\u0005Õ+¨8®tA\u000bÓN\u0005\u008a%\u0098X\u0088\u0089Åé¨¢}î\u0081\u009e\f\u0011c\u007fùw~D\rC\u0001\u0095\u009eù\u009e?¨ò ²T\u008bÌ\u0017Ø\u0081Ì\u0098\u0083ùwª\u008e\u0095w\f\u007f=\u0090\u0080ðB\u0081%X_0)/=\u0089.Ý\u0091a=\u001azê\u001dC\r\u0016¸\u000fîI®`´bÊ\u001f¤\u001dpõÍ9ÔäÃÏnÃÓNe\u0095«!Ë{\\ê\u0092Tîqã\u0089{ÿd\u0014»÷Â\u0091EmpÙp!AºÂ¬OÂáI\u0099w\u0002B§\u001f£7\u008aÁ\rË8\u008c\u008eNÂÌs\rwè«Q!ÕJ\u0095\u008fm\u009f6p¼ízÐ\u009d¬\u0018_ñC9çk¬//¢Y¤X\ff\u0094Û$S\u0086\u0007»I«\u0019 ×-\u0005gîÜ²%b&´y¢ê(Nó/\fè\u008eÊ®\u0005ä\u001f½àôü\u0098^²@\u0080íLæüòïËâÀÇH\"³Ýº(\u0083']a\nõ¨Zlx\u001b\u009c\u0080\u000fCv8tÓHÁ°:µÐ÷\u0098\u0081\u0084ºÁÏ@Nþ¤Ü«àØ\u0002\u009feøú\u0099Áîb@i9(IËK#xÞX9't7\u009dNz\u0088\u0005\u0094Ö\u0017/\u00adq\\Õo\u0092Óoø:qÅq®i!\u008eU©õ\u0080x\u0080xÙ\u0082ÈJ\u000f1!D©Ø\u0094//yéd1\u0006l5\"ÈÉ\u0010©x\u0098ôÒo¦¤©÷hï<ýCW©Ñ\u0087ß\u0013vRÞ}÷xVÝ\u0080\u008f\u0016\u001cÂx8\u0086ðâ\u0083\u0003²\u008b7\u0085P\u0088\u0097\u008e¾§k\u000bp²/\u001dö ¡±\u009eF\u0001\u0097õ\u0016C\b¥)\u008dn\u0017\u0004ü2ÁKÄ\u0081¿Cú^Lnb\u0088\u001b\u0014µ\u0010Gao¢ ;P\u0016\u000fM¼\nX\u008eh\u0004`\u0005{\u008f¾×\u001b\u008fÏïþV\u0096,¸x\u0091óz1ýWSÅgâD¹Pí$£Íá;nSv¯1?hî\u0085ìw|\f°I^5¯\u008dýå\u0089\u000fí\u0095Û\u009e\u001d¢#ì2\u0099\u0080e\u009dD)4¿\u009a'+³ÆÎ\u008f!d³Âä~\u0086>Ã\u0002Çô\u00930&Éz¡\u0082,ÈÚ~ÈÄ\u008c\u0010u1\u0005\"\u0006=N\u0086¬Î$\u0093æbÉù\u0085ì\u0006ð²=à\t}Ø¬æ\u0093\u009f{Ë\u0096\u0010åÃ\u001a5¢V¤\u008f>fè¿LWIQÎ\u00ad\u0092p\\J~Wàç\"Ïh\u001d\u0006ðZ\u00ad\u0099\u0015\u0081\u00881\u009b\u001f\u0014ø-ËJN)qK|\u001d\u0083ÿ!È&,qÉ\u0013ß\u0017ê\u0098W«ùôÈ \u0004Ôýf/¡Í´ù\u0093ypB|ºëAV\u00ad&â/ôa\u0011,f¿Éñé°RÔm\u0088(2\u009eÝ)ph\u0011ñÌó(\u0083ecsÇÂÒG9ZÃË\u0090$Ñ^\u0086æ\u0000U\u0018þ\u0081\u000eÉÿ\u008e\u0087:\u009fK¸ëæHÃ\\%¬¶@mc%Ú%Ýc¦08LêiÆ¹Þ(GPÏ\u009a\u0001¦Èà;\u001f\u008c\u001c\u009aLDÊ«øÁt!²2§Â|\b\u0083yº¤~Ô\u0092r\u0000äÕ\u009fÚ\u0014§\u0015Û9Ú\u00ad¶;üß\u0016\u008dÕ\u0092÷ñk:crb,ÁSbê=Q»\u001d§`\u00113\n/V\u0011¶\u000e×+V±\u001diÙþ¯1\u0098\u0011\u009eni\u00adËªÛ×#\u001fã¶Y~ð9\u0095\u001aæ\u009d\u009f\u009b\u0006}.\u009b$\u009bÄ«§\u0015\u0080óÅ\u0002\u009d~\u009b¸\u009fAúÓüÕã¥³c\u001fR\u00959\u0006ò\feôI\u0010¯ã.x×:ºPC³(5ô.Ê\u0093MÎ"
         .getBytes("ISO-8859-1");

      int var58;
      do {
         lIl[var21] = ((var36[var26] & 255) << 24 | (var36[var26 + 1] & 255) << 16 | (var36[var26 + 2] & 255) << 8 | var36[var26 + 3] & 255) ^ 527924183;
         var21 += 1;
         var58 = var26 + 4;
         var26 += 4;
      } while (var58 < var36.length);

      String[] var5 = new String[lIlI(821957661, var17 ^ 615208012)];
      IlIIIIIIl[] var22 = new IlIIIIIIl[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIll('㾞', (byte)16, -2094547571)).length();
      int var1 = 4;
      int var19 = -1;
      IlII(var22);

      label101:
      while (true) {
         var21 = lIlI(821957660, var17 ^ -1199989555);
         String var29 = var2.substring(++var19, var19 + var1);
         byte var42 = -1;

         while (true) {
            label96: {
               char[] var60 = var29.toCharArray();
               int var72 = var60.length;
               int var6 = 0;
               var58 = var21;
               var47 = var60;
               int var34 = var72;
               char[] var84;
               int var91;
               if (var72 <= 1) {
                  var84 = var60;
                  var72 = var21;
                  var91 = var6;
               } else {
                  var58 = var21;
                  var34 = var72;
                  if (var72 <= var6) {
                     break label96;
                  }

                  var84 = var60;
                  var72 = var21;
                  var91 = var6;
               }

               while (true) {
                  var84[var91] = (char)(var84[var91] ^ var72 ^ switch (var6 % lIlI(821957656, var17 ^ -2020006880)) {
                     case 0 -> lIlI(821957659, var17 ^ -1793268889);
                     case 1 -> lIlI(821957658, var17 ^ 1142594888);
                     case 2 -> lIlI(821957653, var17 ^ 638418848);
                     case 3 -> lIlI(821957652, var17 ^ -1738878135);
                     case 4 -> lIlI(821957655, var17 ^ 238198336);
                     case 5 -> lIlI(821957654, var17 ^ -1179046586);
                     default -> lIlI(821957649, var17 ^ 1712157508);
                  });
                  var6++;
                  if (var58 == 0) {
                     var91 = var58;
                     var84 = var47;
                     var72 = var58;
                  } else {
                     if (var34 <= var6) {
                        break;
                     }

                     var84 = var47;
                     var72 = var58;
                     var91 = var6;
                  }
               }
            }

            String var65 = new String(var47).intern();
            switch (var42) {
               case 0:
                  var5[var3++] = var65;
                  if ((var19 += var1) >= var4) {
                     IIl = var5;
                     ll = new String[lIlI(821957657, var17 ^ -761562108)];
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var65;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label101;
                  }

                  var4 = (var2 = lIll('☁', 45, -2094547570)).length();
                  var1 = lIlI(821957663, var17 ^ 1327295876);
                  var19 = -1;
            }

            var21 = lIlI(821957662, var17 ^ -1411947039);
            var29 = var2.substring(++var19, var19 + var1);
            var42 = 0;
         }
      }
   }

   public lIIIlIlI II() {
      return this.lII;
   }

   private void Il(lIIlIl var1) {
      try {
         if (IIllllI.II()) {
            return;
         }
      } catch (IllegalStateException var2) {
         throw IlIl(var2);
      }

      this.lII.lllIIl(var1);
   }

   public static IlIIIIIIl[] lI() {
      return IlI;
   }

   public IlllIlI ll() {
      return this.lI;
   }

   public static IIIIIllII III() {
      return III;
   }

   private static int lIlI(int var0, int var1) {
      int var2 = lIl[var0 ^ 821957661] ^ var1 ^ var0;
      var2 += 33274;
      var2 ^= 31635;
      var2 += 62085;
      var2 -= 52166;
      var2 -= 23935;
      var2 ^= 57492;
      var2 -= 54583;
      return var2 - 34567;
   }

   public void IIl() {
      this.IIll(IlIlll.III);
   }

   private void IlI() {
      try {
         if (!IIllllI.II()) {
            this.l();
         }
      } catch (IllegalStateException var1) {
         throw IlIl(var1);
      }
   }

   public lIlIl Ill() {
      return this.Ill;
   }

   public void lII() {
      this.IIll(IlIlll.lI);
   }

   public void onInitializeClient() {
      int var8 = -1275832274;
      IlIIIIIIl[] var10000 = lI();
      Illl(IlIIllIII.lI(IIII(lIlI(821957648, var8 ^ 599887311), lIlI(821957651, var8 ^ -301173108))));
      IlIIIIIIl[] var1 = var10000;

      try {
         III = this;
         int var14 = lIlI(821957650, var8 ^ 55871060);
         IIIlllll.lI();
         int var10001 = lIlI(821957645, var8 ^ 342698440);
         IlIlIIlll.IIll();
         String var3 = IlIIllIII.lI(IIII(var14, var10001));
         Illl(var3 + "1");
         int var15 = lIlI(821957644, var8 ^ 1304047027);
         this.lI.lIl(this.lII);
         String var16 = IlIIllIII.lI(IIII(var15, lIlI(821957647, var8 ^ 118492134)));
         String var18 = IlIIllIII.lI(IIII(lIlI(821957646, var8 ^ -640968532), lIlI(821957641, var8 ^ -1821222527)));
         String var12 = this.lI.IIlllI(this.lI.Il());
         String var5 = var18;
         String var4 = var16;
         Illl(var4 + "2" + var5 + var12);
         int var17 = lIlI(821957640, var8 ^ 1925242285);
         this.l();
         var5 = IlIIllIII.lI(IIII(var17, lIlI(821957643, var8 ^ -2063616999)));
         Illl(var5 + "3");
      } catch (Throwable var10) {
         String var13 = IlIIllIII.lI(IIII(lIlI(821957642, var8 ^ -510076301), lIlI(821957637, var8 ^ 1807038208)));
         String var7 = String.valueOf(var10);
         String var6 = var13;
         Illl(var6 + var7);
         throw var10;
      }

      try {
         ClientTickEvents.START_CLIENT_TICK.register(this::IIIl);
         HudRenderCallback.EVENT.register(this::llI);
         lllII.l.Il(this::Il);
         this.Il = new Thread(this::IlI);
         Runtime.getRuntime().addShutdownHook(this.Il);
         if (var1 == null) {
            IlIIIIIIl.IlIlIII(lIll('骞', 96, -2094547572));
         }
      } catch (Throwable var9) {
         throw IlIl(var9);
      }
   }

   public IlIIl lIl() {
      return this.I;
   }

   private void llI(class_332 var1, class_9779 var2) {
      try {
         if (IIllllI.II()) {
            return;
         }
      } catch (IllegalStateException var3) {
         throw IlIl(var3);
      }

      this.lII.IIlIIIl(var1, 0, 0, IIll.IIIlIIl(var2, true));
   }

   public IIIIIllII() {
      lI();
      this.I = new IlIIl();
      this.lII = new lIIIlIlI(this.I);
      this.lI = new IlllIlI();

      try {
         this.Ill = new lIlIl();
         if (IlIIIIIIl.IIIlllI() == null) {
            IlII(new IlIIIIIIl[2]);
         }
      } catch (IllegalStateException var2) {
         throw IlIl(var2);
      }
   }

   public void lll() {
   }

   private static String IIII(int var0, int var1) {
      int var9 = -705064165;
      int var2 = (var0 ^ lIlI(821957636, var9 ^ -1267344597)) & lIlI(821957639, var9 ^ 1553496580);
      if (ll[var2] == null) {
         char[] var3 = IIl[var2].toCharArray();

         int var4 = switch (var3[0] & lIlI(821957638, var9 ^ -1638165273)) {
            case 0 -> lIlI(821957633, var9 ^ 1936477654);
            case 1 -> lIlI(821957632, var9 ^ 1008406054);
            case 2 -> lIlI(821957635, var9 ^ -469567341);
            case 3 -> lIlI(821957634, var9 ^ 588581369);
            case 4 -> lIlI(821957693, var9 ^ -1292535165);
            case 5 -> lIlI(821957692, var9 ^ 874144476);
            case 6 -> lIlI(821957695, var9 ^ 602024378);
            case 7 -> lIlI(821957694, var9 ^ -1577365254);
            case 8 -> lIlI(821957689, var9 ^ -1668473683);
            case 9 -> lIlI(821957688, var9 ^ 649509181);
            case 10 -> lIlI(821957691, var9 ^ -1705320567);
            case 11 -> lIlI(821957690, var9 ^ 259179878);
            case 12 -> lIlI(821957685, var9 ^ -1424092853);
            case 13 -> lIlI(821957684, var9 ^ 1237431253);
            case 14 -> lIlI(821957687, var9 ^ 708754394);
            case 15 -> lIlI(821957686, var9 ^ -179547983);
            case 16 -> lIlI(821957681, var9 ^ -794917167);
            case 17 -> lIlI(821957680, var9 ^ -363535310);
            case 18 -> lIlI(821957683, var9 ^ -5975603);
            case 19 -> lIlI(821957682, var9 ^ -1025536498);
            case 20 -> lIlI(821957677, var9 ^ -240995127);
            case 21 -> lIlI(821957676, var9 ^ 1884578805);
            case 22 -> lIlI(821957679, var9 ^ 1928871537);
            case 23 -> lIlI(821957678, var9 ^ 1389594551);
            case 24 -> lIlI(821957673, var9 ^ 2079323774);
            case 25 -> lIlI(821957672, var9 ^ -1727134806);
            case 26 -> lIlI(821957675, var9 ^ -2076837967);
            case 27 -> lIlI(821957674, var9 ^ -68915239);
            case 28 -> lIlI(821957669, var9 ^ 1682856435);
            case 29 -> lIlI(821957668, var9 ^ -624710068);
            case 30 -> lIlI(821957671, var9 ^ 912663277);
            case 31 -> lIlI(821957670, var9 ^ 921270698);
            case 32 -> lIlI(821957665, var9 ^ -1914997693);
            case 33 -> lIlI(821957664, var9 ^ -1921153699);
            case 34 -> lIlI(821957667, var9 ^ 1794182083);
            case 35 -> lIlI(821957666, var9 ^ 2069144209);
            case 36 -> lIlI(821957725, var9 ^ -900147942);
            case 37 -> lIlI(821957724, var9 ^ 1935615921);
            case 38 -> lIlI(821957727, var9 ^ -1689460346);
            case 39 -> lIlI(821957726, var9 ^ 275559030);
            case 40 -> 4;
            case 41 -> lIlI(821957721, var9 ^ -322306412);
            case 42 -> lIlI(821957720, var9 ^ -1277191579);
            case 43 -> lIlI(821957723, var9 ^ -1732516458);
            case 44 -> lIlI(821957722, var9 ^ -419360779);
            case 45 -> 3;
            case 46 -> lIlI(821957717, var9 ^ -1012591193);
            case 47 -> lIlI(821957716, var9 ^ 891237014);
            case 48 -> 0;
            case 49 -> lIlI(821957719, var9 ^ -1273731875);
            case 50 -> lIlI(821957718, var9 ^ -608534051);
            case 51 -> lIlI(821957713, var9 ^ 283356760);
            case 52 -> lIlI(821957712, var9 ^ -1953335252);
            case 53 -> lIlI(821957715, var9 ^ 85323644);
            case 54 -> lIlI(821957714, var9 ^ 229862070);
            case 55 -> lIlI(821957709, var9 ^ -1761531867);
            case 56 -> lIlI(821957708, var9 ^ -617594612);
            case 57 -> lIlI(821957711, var9 ^ 1446918178);
            case 58 -> lIlI(821957710, var9 ^ -1276605050);
            case 59 -> lIlI(821957705, var9 ^ -1193873700);
            case 60 -> lIlI(821957704, var9 ^ -839173196);
            case 61 -> lIlI(821957707, var9 ^ 826898246);
            case 62 -> lIlI(821957706, var9 ^ -1263323566);
            case 63 -> lIlI(821957701, var9 ^ -150597062);
            case 64 -> lIlI(821957700, var9 ^ -1420808447);
            case 65 -> lIlI(821957703, var9 ^ 1878957255);
            case 66 -> lIlI(821957702, var9 ^ -872331560);
            case 67 -> lIlI(821957697, var9 ^ -2136905834);
            case 68 -> lIlI(821957696, var9 ^ -500299128);
            case 69 -> lIlI(821957699, var9 ^ -1013540115);
            case 70 -> lIlI(821957698, var9 ^ -715236942);
            case 71 -> lIlI(821957757, var9 ^ 1579808677);
            case 72 -> lIlI(821957756, var9 ^ 1856691917);
            case 73 -> lIlI(821957759, var9 ^ 2088124573);
            case 74 -> lIlI(821957758, var9 ^ 1365793551);
            case 75 -> lIlI(821957753, var9 ^ -680225133);
            case 76 -> lIlI(821957752, var9 ^ 650370885);
            case 77 -> lIlI(821957755, var9 ^ -591035622);
            case 78 -> lIlI(821957754, var9 ^ 274317236);
            case 79 -> lIlI(821957749, var9 ^ -713223317);
            case 80 -> lIlI(821957748, var9 ^ 819985923);
            case 81 -> lIlI(821957751, var9 ^ -439610988);
            case 82 -> lIlI(821957750, var9 ^ 115978194);
            case 83 -> lIlI(821957745, var9 ^ -1158605172);
            case 84 -> lIlI(821957744, var9 ^ 479004960);
            case 85 -> lIlI(821957747, var9 ^ 831732510);
            case 86 -> lIlI(821957746, var9 ^ -1303164920);
            case 87 -> lIlI(821957741, var9 ^ 1079605455);
            case 88 -> lIlI(821957740, var9 ^ -1492059240);
            case 89 -> 1;
            case 90 -> lIlI(821957743, var9 ^ 1378588546);
            case 91 -> lIlI(821957742, var9 ^ -504532621);
            case 92 -> lIlI(821957737, var9 ^ -1190673497);
            case 93 -> lIlI(821957736, var9 ^ 691616406);
            case 94 -> lIlI(821957739, var9 ^ -1060885719);
            case 95 -> lIlI(821957738, var9 ^ 1659928436);
            case 96 -> lIlI(821957733, var9 ^ 1002352942);
            case 97 -> lIlI(821957732, var9 ^ 81078144);
            case 98 -> lIlI(821957735, var9 ^ 447344693);
            case 99 -> lIlI(821957734, var9 ^ -1618408487);
            case 100 -> lIlI(821957729, var9 ^ 1000313630);
            case 101 -> lIlI(821957728, var9 ^ -1823941913);
            case 102 -> lIlI(821957731, var9 ^ 825940158);
            case 103 -> lIlI(821957730, var9 ^ 606718073);
            case 104 -> lIlI(821957789, var9 ^ -1907988676);
            case 105 -> lIlI(821957788, var9 ^ -2131099984);
            case 106 -> lIlI(821957791, var9 ^ 744936791);
            case 107 -> lIlI(821957790, var9 ^ -1959975702);
            case 108 -> lIlI(821957785, var9 ^ 1755487857);
            case 109 -> lIlI(821957784, var9 ^ -1073725554);
            case 110 -> lIlI(821957787, var9 ^ 1410915304);
            case 111 -> lIlI(821957786, var9 ^ -1344796718);
            case 112 -> lIlI(821957781, var9 ^ -2098101606);
            case 113 -> lIlI(821957780, var9 ^ 2025435250);
            case 114 -> lIlI(821957783, var9 ^ -883900536);
            case 115 -> lIlI(821957782, var9 ^ 585487369);
            case 116 -> lIlI(821957777, var9 ^ -2087149870);
            case 117 -> lIlI(821957776, var9 ^ -65155222);
            case 118 -> lIlI(821957779, var9 ^ 850979529);
            case 119 -> lIlI(821957778, var9 ^ -2098655579);
            case 120 -> lIlI(821957773, var9 ^ -1781047596);
            case 121 -> lIlI(821957772, var9 ^ 219747373);
            case 122 -> lIlI(821957775, var9 ^ 120761529);
            case 123 -> lIlI(821957774, var9 ^ 737551406);
            case 124 -> lIlI(821957769, var9 ^ -1943851030);
            case 125 -> lIlI(821957768, var9 ^ 218737827);
            case 126 -> lIlI(821957771, var9 ^ 2063526936);
            case 127 -> lIlI(821957770, var9 ^ 940163831);
            case 128 -> lIlI(821957765, var9 ^ 177436942);
            case 129 -> lIlI(821957764, var9 ^ 1224396142);
            case 130 -> lIlI(821957767, var9 ^ -1426494003);
            case 131 -> lIlI(821957766, var9 ^ 1154912301);
            case 132 -> lIlI(821957761, var9 ^ -1966874993);
            case 133 -> lIlI(821957760, var9 ^ 215047156);
            case 134 -> lIlI(821957763, var9 ^ 1681390400);
            case 135 -> lIlI(821957762, var9 ^ 258455892);
            case 136 -> lIlI(821957821, var9 ^ 1599633371);
            case 137 -> lIlI(821957820, var9 ^ -311095737);
            case 138 -> lIlI(821957823, var9 ^ 993673079);
            case 139 -> lIlI(821957822, var9 ^ 1160904894);
            case 140 -> lIlI(821957817, var9 ^ -1239443018);
            case 141 -> lIlI(821957816, var9 ^ -513454139);
            case 142 -> lIlI(821957819, var9 ^ -1122986843);
            case 143 -> lIlI(821957818, var9 ^ 1514842712);
            case 144 -> lIlI(821957813, var9 ^ -180597342);
            case 145 -> lIlI(821957812, var9 ^ -1560307318);
            case 146 -> lIlI(821957815, var9 ^ -1703640925);
            case 147 -> lIlI(821957814, var9 ^ 1151787317);
            case 148 -> lIlI(821957809, var9 ^ 899551183);
            case 149 -> lIlI(821957808, var9 ^ 1818051422);
            case 150 -> lIlI(821957811, var9 ^ 1803714682);
            case 151 -> lIlI(821957810, var9 ^ 119974147);
            case 152 -> lIlI(821957805, var9 ^ -1651261708);
            case 153 -> lIlI(821957804, var9 ^ -1432560053);
            case 154 -> lIlI(821957807, var9 ^ 932233515);
            case 155 -> lIlI(821957806, var9 ^ -1459137203);
            case 156 -> lIlI(821957801, var9 ^ -988209355);
            case 157 -> lIlI(821957800, var9 ^ 369526520);
            case 158 -> lIlI(821957803, var9 ^ 1245228938);
            case 159 -> lIlI(821957802, var9 ^ 1442580219);
            case 160 -> lIlI(821957797, var9 ^ 1937643466);
            case 161 -> lIlI(821957796, var9 ^ 569370476);
            case 162 -> lIlI(821957799, var9 ^ -643970859);
            case 163 -> lIlI(821957798, var9 ^ 2048157456);
            case 164 -> lIlI(821957793, var9 ^ -750434976);
            case 165 -> lIlI(821957792, var9 ^ -581285644);
            case 166 -> lIlI(821957795, var9 ^ 889117599);
            case 167 -> lIlI(821957794, var9 ^ 1236475712);
            case 168 -> lIlI(821957853, var9 ^ 2085566578);
            case 169 -> lIlI(821957852, var9 ^ 1032153529);
            case 170 -> lIlI(821957855, var9 ^ -591885493);
            case 171 -> lIlI(821957854, var9 ^ 2019375400);
            case 172 -> lIlI(821957849, var9 ^ -2068236646);
            case 173 -> lIlI(821957848, var9 ^ -368784478);
            case 174 -> lIlI(821957851, var9 ^ -663237444);
            case 175 -> lIlI(821957850, var9 ^ 2094871694);
            case 176 -> lIlI(821957845, var9 ^ 1771541285);
            case 177 -> lIlI(821957844, var9 ^ 66328446);
            case 178 -> lIlI(821957847, var9 ^ 180602827);
            case 179 -> lIlI(821957846, var9 ^ -217308206);
            case 180 -> lIlI(821957841, var9 ^ 484601482);
            case 181 -> lIlI(821957840, var9 ^ 837282404);
            case 182 -> lIlI(821957843, var9 ^ 963366776);
            case 183 -> lIlI(821957842, var9 ^ -1395296978);
            case 184 -> lIlI(821957837, var9 ^ -1667674461);
            case 185 -> lIlI(821957836, var9 ^ -1388794900);
            case 186 -> lIlI(821957839, var9 ^ 1474527677);
            case 187 -> lIlI(821957838, var9 ^ -1341149852);
            case 188 -> lIlI(821957833, var9 ^ 491992527);
            case 189 -> lIlI(821957832, var9 ^ -411631190);
            case 190 -> lIlI(821957835, var9 ^ 1474883483);
            case 191 -> lIlI(821957834, var9 ^ 1916821587);
            case 192 -> lIlI(821957829, var9 ^ -292956343);
            case 193 -> lIlI(821957828, var9 ^ -1337994413);
            case 194 -> lIlI(821957831, var9 ^ -1324488998);
            case 195 -> lIlI(821957830, var9 ^ 89141870);
            case 196 -> lIlI(821957825, var9 ^ -704629871);
            case 197 -> 5;
            case 198 -> lIlI(821957824, var9 ^ 627448693);
            case 199 -> lIlI(821957827, var9 ^ -1378221112);
            case 200 -> lIlI(821957826, var9 ^ 852622944);
            case 201 -> lIlI(821957885, var9 ^ 119002503);
            case 202 -> lIlI(821957884, var9 ^ 935658231);
            case 203 -> lIlI(821957887, var9 ^ -2097040460);
            case 204 -> lIlI(821957886, var9 ^ 1083882326);
            case 205 -> lIlI(821957881, var9 ^ 1465324520);
            case 206 -> lIlI(821957880, var9 ^ 235989897);
            case 207 -> lIlI(821957883, var9 ^ -1664206838);
            case 208 -> lIlI(821957882, var9 ^ 331458967);
            case 209 -> lIlI(821957877, var9 ^ -1745235266);
            case 210 -> lIlI(821957876, var9 ^ 1689048053);
            case 211 -> lIlI(821957879, var9 ^ -1839199257);
            case 212 -> lIlI(821957878, var9 ^ 156858697);
            case 213 -> lIlI(821957873, var9 ^ -1727906646);
            case 214 -> lIlI(821957872, var9 ^ 674677671);
            case 215 -> lIlI(821957875, var9 ^ 968518483);
            case 216 -> lIlI(821957874, var9 ^ 724530958);
            case 217 -> lIlI(821957869, var9 ^ -98246063);
            case 218 -> lIlI(821957868, var9 ^ 2071933725);
            case 219 -> lIlI(821957871, var9 ^ 1962328221);
            case 220 -> lIlI(821957870, var9 ^ -1312222760);
            case 221 -> lIlI(821957865, var9 ^ -1296914590);
            case 222 -> lIlI(821957864, var9 ^ 1455929965);
            case 223 -> lIlI(821957867, var9 ^ -1722539642);
            case 224 -> lIlI(821957866, var9 ^ 655513569);
            case 225 -> lIlI(821957861, var9 ^ -1036182640);
            case 226 -> lIlI(821957860, var9 ^ 1019749751);
            case 227 -> lIlI(821957863, var9 ^ -1121897034);
            case 228 -> lIlI(821957862, var9 ^ -69781204);
            case 229 -> lIlI(821957857, var9 ^ -1049725284);
            case 230 -> lIlI(821957856, var9 ^ 1614659317);
            case 231 -> lIlI(821957859, var9 ^ 1367948237);
            case 232 -> lIlI(821957858, var9 ^ -607927472);
            case 233 -> lIlI(821957917, var9 ^ 940438394);
            case 234 -> lIlI(821957916, var9 ^ -2083826611);
            case 235 -> lIlI(821957919, var9 ^ 786661843);
            case 236 -> lIlI(821957918, var9 ^ 514090131);
            case 237 -> lIlI(821957913, var9 ^ -287906331);
            case 238 -> lIlI(821957912, var9 ^ -1012181202);
            case 239 -> lIlI(821957915, var9 ^ -1047714701);
            case 240 -> lIlI(821957914, var9 ^ 2007263508);
            case 241 -> lIlI(821957909, var9 ^ 186302750);
            case 242 -> lIlI(821957908, var9 ^ -2011964194);
            case 243 -> lIlI(821957911, var9 ^ -1458368001);
            case 244 -> lIlI(821957910, var9 ^ -1412765922);
            case 245 -> lIlI(821957905, var9 ^ -1704933249);
            case 246 -> lIlI(821957904, var9 ^ -718804164);
            case 247 -> lIlI(821957907, var9 ^ -190391482);
            case 248 -> lIlI(821957906, var9 ^ 1265406619);
            case 249 -> lIlI(821957901, var9 ^ 81710040);
            case 250 -> lIlI(821957900, var9 ^ -336620279);
            case 251 -> lIlI(821957903, var9 ^ 1471828120);
            case 252 -> 2;
            case 253 -> lIlI(821957902, var9 ^ 760407136);
            case 254 -> lIlI(821957897, var9 ^ 1277724063);
            default -> lIlI(821957896, var9 ^ -1008410185);
         };
         int var5 = (var1 & lIlI(821957899, var9 ^ 1743677633)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIlI(821957898, var9 ^ -2023988766)) >>> lIlI(821957893, var9 ^ 1639272553)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIlI(821957892, var9 ^ -269418483);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIlI(821957895, var9 ^ -118715056);
            }
         }

         ll[var2] = new String(var3).intern();
      }

      return ll[var2];
   }

   private void IIIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIIIIllII.lI ()[Lk74/x/IlIIIIIIl;
      // 003: astore 2
      // 004: aload 0
      // 005: getfield k74/x/IIIIIllII.l Z
      // 008: ifne 089
      // 00b: aload 0
      // 00c: bipush 1
      // 00d: putfield k74/x/IIIIIllII.l Z
      // 010: ldc_w 821957894
      // 013: ldc_w 51838452
      // 016: ldc_w -1811819203
      // 019: ixor
      // 01a: invokestatic k74/x/IIIIIllII.lIlI (II)I
      // 01d: ldc_w 821957889
      // 020: ldc_w 51838452
      // 023: ldc_w -10319765
      // 026: ixor
      // 027: invokestatic k74/x/IIIIIllII.lIlI (II)I
      // 02a: invokestatic k74/x/IIIIIllII.IIII (II)Ljava/lang/String;
      // 02d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 030: ldc_w 821957888
      // 033: ldc_w 51838452
      // 036: ldc_w -1993476117
      // 039: ixor
      // 03a: invokestatic k74/x/IIIIIllII.lIlI (II)I
      // 03d: ldc_w 821957891
      // 040: ldc_w 51838452
      // 043: ldc_w 2114669426
      // 046: ixor
      // 047: invokestatic k74/x/IIIIIllII.lIlI (II)I
      // 04a: invokestatic k74/x/IIIIIllII.IIII (II)Ljava/lang/String;
      // 04d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 050: aload 0
      // 051: getfield k74/x/IIIIIllII.lI Lk74/x/IlllIlI;
      // 054: invokevirtual k74/x/IlllIlI.IllIII ()Lnet/minecraft/class_3675$class_306;
      // 057: invokestatic java/lang/String.valueOf (Ljava/lang/Object;)Ljava/lang/String;
      // 05a: astore 8
      // 05c: astore 7
      // 05e: astore 6
      // 060: new java/lang/StringBuilder
      // 063: dup
      // 064: invokespecial java/lang/StringBuilder.<init> ()V
      // 067: aload 6
      // 069: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 06c: ldc_w "4"
      // 06f: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 072: aload 7
      // 074: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 077: aload 8
      // 079: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 07c: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 07f: invokestatic k74/x/IIIIIllII.Illl (Ljava/lang/String;)V
      // 082: goto 089
      // 085: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 088: athrow
      // 089: invokestatic k74/x/IIllllI.II ()Z
      // 08c: ifeq 094
      // 08f: return
      // 090: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 093: athrow
      // 094: aload 0
      // 095: getfield k74/x/IIIIIllII.I Lk74/x/IlIIl;
      // 098: aload 1
      // 099: invokevirtual k74/x/IlIIl.III (Lnet/minecraft/class_310;)V
      // 09c: aload 0
      // 09d: getfield k74/x/IIIIIllII.lII Lk74/x/lIIIlIlI;
      // 0a0: aload 1
      // 0a1: invokevirtual k74/x/lIIIlIlI.IIlll (Lnet/minecraft/class_310;)V
      // 0a4: aload 0
      // 0a5: getfield k74/x/IIIIIllII.lII Lk74/x/lIIIlIlI;
      // 0a8: invokevirtual k74/x/lIIIlIlI.IlIlllI ()V
      // 0ab: bipush 0
      // 0ac: istore 3
      // 0ad: aload 1
      // 0ae: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0b1: ifnull 123
      // 0b4: aload 1
      // 0b5: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0b8: instanceof net/minecraft/class_408
      // 0bb: ifne 0e7
      // 0be: goto 0c5
      // 0c1: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c4: athrow
      // 0c5: aload 1
      // 0c6: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0c9: instanceof net/minecraft/class_7743
      // 0cc: ifne 0e7
      // 0cf: goto 0d6
      // 0d2: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0d5: athrow
      // 0d6: aload 1
      // 0d7: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0da: instanceof net/minecraft/class_473
      // 0dd: ifeq 0ed
      // 0e0: goto 0e7
      // 0e3: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0e6: athrow
      // 0e7: bipush 1
      // 0e8: istore 3
      // 0e9: aload 2
      // 0ea: ifnonnull 123
      // 0ed: aload 1
      // 0ee: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 0f1: astore 5
      // 0f3: aload 5
      // 0f5: instanceof k74/x/lIIlIllI
      // 0f8: ifeq 110
      // 0fb: aload 5
      // 0fd: checkcast k74/x/lIIlIllI
      // 100: astore 4
      // 102: aload 4
      // 104: invokevirtual k74/x/lIIlIllI.IIlllll ()Z
      // 107: ifne 110
      // 10a: bipush 1
      // 10b: istore 3
      // 10c: aload 2
      // 10d: ifnonnull 123
      // 110: aload 1
      // 111: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 114: invokevirtual net/minecraft/class_437.method_25399 ()Lnet/minecraft/class_364;
      // 117: astore 5
      // 119: aload 5
      // 11b: instanceof net/minecraft/class_342
      // 11e: ifeq 123
      // 121: bipush 1
      // 122: istore 3
      // 123: aload 0
      // 124: getfield k74/x/IIIIIllII.lI Lk74/x/IlllIlI;
      // 127: invokevirtual k74/x/IlllIlI.IllIII ()Lnet/minecraft/class_3675$class_306;
      // 12a: astore 4
      // 12c: iload 3
      // 12d: ifne 15b
      // 130: aload 0
      // 131: getfield k74/x/IIIIIllII.lII Lk74/x/lIIIlIlI;
      // 134: aload 4
      // 136: invokevirtual k74/x/lIIIlIlI.lIlIl (Lnet/minecraft/class_3675$class_306;)Z
      // 139: ifne 15b
      // 13c: goto 143
      // 13f: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 142: athrow
      // 143: aload 1
      // 144: aload 4
      // 146: invokestatic k74/x/IIll.IIIllll (Lnet/minecraft/class_310;Lnet/minecraft/class_3675$class_306;)Z
      // 149: ifeq 15b
      // 14c: goto 153
      // 14f: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 152: athrow
      // 153: bipush 1
      // 154: goto 15c
      // 157: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 15a: athrow
      // 15b: bipush 0
      // 15c: istore 5
      // 15e: iload 5
      // 160: ifeq 17c
      // 163: aload 0
      // 164: getfield k74/x/IIIIIllII.II Z
      // 167: ifne 17c
      // 16a: goto 171
      // 16d: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 170: athrow
      // 171: aload 0
      // 172: invokevirtual k74/x/IIIIIllII.IIlI ()V
      // 175: goto 17c
      // 178: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 17b: athrow
      // 17c: aload 0
      // 17d: iload 5
      // 17f: putfield k74/x/IIIIIllII.II Z
      // 182: return
   }

   public void IIlI() {
      this.IIll(IlIlll.I);
   }

   public void l() {
      try {
         if (IIllllI.II()) {
            return;
         }
      } catch (IllegalStateException var1) {
         throw IlIl(var1);
      }

      this.lI.llllI(this.lII);
   }

   private void IIll(IlIlll param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03: astore 2
      // 04: aload 2
      // 05: ifnonnull 0d
      // 08: return
      // 09: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 0c: athrow
      // 0d: aload 2
      // 0e: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 11: astore 4
      // 13: aload 4
      // 15: instanceof k74/x/lIIlIllI
      // 18: ifeq 49
      // 1b: aload 4
      // 1d: checkcast k74/x/lIIlIllI
      // 20: astore 3
      // 21: aload 3
      // 22: invokevirtual k74/x/lIIlIllI.llIlIll ()Z
      // 25: ifeq 31
      // 28: aload 3
      // 29: invokevirtual k74/x/lIIlIllI.IlIIllI ()V
      // 2c: return
      // 2d: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 30: athrow
      // 31: aload 3
      // 32: aload 1
      // 33: invokevirtual k74/x/lIIlIllI.llIl (Lk74/x/IlIlll;)V
      // 36: aload 1
      // 37: getstatic k74/x/IlIlll.I Lk74/x/IlIlll;
      // 3a: if_acmpne 48
      // 3d: aload 3
      // 3e: invokevirtual k74/x/lIIlIllI.method_25419 ()V
      // 41: goto 48
      // 44: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 47: athrow
      // 48: return
      // 49: aload 2
      // 4a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4d: ifnull 5e
      // 50: aload 2
      // 51: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 54: ifnonnull 63
      // 57: goto 5e
      // 5a: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 5d: athrow
      // 5e: return
      // 5f: invokestatic k74/x/IIIIIllII.IlIl (Ljava/lang/Throwable;)Ljava/lang/Throwable;
      // 62: athrow
      // 63: aload 0
      // 64: invokevirtual k74/x/IIIIIllII.lIIl ()V
      // 67: aload 2
      // 68: new k74/x/lIIlIllI
      // 6b: dup
      // 6c: aload 0
      // 6d: aload 1
      // 6e: invokespecial k74/x/lIIlIllI.<init> (Lk74/x/IIIIIllII;Lk74/x/IlIlll;)V
      // 71: invokevirtual net/minecraft/class_310.method_1507 (Lnet/minecraft/class_437;)V
      // 74: return
   }

   private static String lIll(char var0, byte var1, int var2) {
      int var7 = var2 ^ -2094547572;
      char[] var6 = llI[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])lll[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         lll[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 33587;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ '\udb17' ^ var5 ^ var1 ^ var0 ^ var4 ^ var2);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   public static void IlII(IlIIIIIIl[] var0) {
      IlI = var0;
   }

   private static Throwable IlIl(Throwable var0) {
      return var0;
   }

   public void IllI() {
      this.I.ll();
      Thread var1 = this.Il;
      this.Il = null;
      if (var1 != null) {
         try {
            Runtime.getRuntime().removeShutdownHook(var1);
         } catch (IllegalStateException var4) {
         }
      }

      try {
         if (III == this) {
            III = null;
         }
      } catch (IllegalStateException var3) {
         throw IlIl(var3);
      }
   }

   private static void Illl(String var0) {
      int var8 = 1708558976;

      try {
         Path var1 = FabricLoader.getInstance().getGameDir().resolve(IlIIllIII.lI(IIII(lIlI(821957890, var8 ^ -1202551232), lIlI(821957949, var8 ^ 55468240))));
         String var10001 = IlIIllIII.lI(IIII(lIlI(821957948, var8 ^ 1680225458), lIlI(821957951, var8 ^ -267501175)));
         long var10002 = System.currentTimeMillis();
         String var10003 = IlIIllIII.lI(IIII(lIlI(821957950, var8 ^ 1651185553), lIlI(821957945, var8 ^ -2134007004)));
         String var7 = System.lineSeparator();
         String var5 = var10003;
         long var3 = var10002;
         String var2 = var10001;
         Files.writeString(var1, var2 + var3 + var5 + var0 + var7, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
      } catch (Exception var9) {
      }
   }

   public void lIII() {
      this.IIll(IlIlll.ll);
   }

   public void lIIl() {
      this.II = true;
   }
}
