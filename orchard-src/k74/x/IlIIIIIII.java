package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class IlIIIIIII extends IlIIIIIIl implements IIIIIlII {
   private static final IIIlIlIl II;
   private static final int Il = 1000;
   private static final IIIlIlIl lI;
   private final IIlIII ll;
   private double III;
   private static final String[] lIlI;
   private static final double IIl = 1.8;
   private static final double IlI = 0.62;
   private double Ill;
   private static final int lII = -1513240;
   private static final IIIlIlIl lIl;
   private final IIlIII llI;
   private static final Object[] lIll;
   private static final IIIlIlIl I;
   private static final IIIlIlIl lll;
   private class_2960 IIII;
   private static final double IIIl = 4.0;
   private static final String[] IIlI;
   private static final int[] lIIl;
   private static final String[] IIll;
   private final IIlIII IlII;
   private static final IIIlIlIl IlIl;
   private static final double IllI = 30.0;
   private static final double Illl = -0.36;
   private static final double lIII = 0.3;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1807330539;
      String[] var10000 = new String[2];
      short var12 = 18416;
      String[] var9 = var10000;
      int var8 = "¯\uf381㡾ﵡ倉論《ﻁ\uf87bŠ耈Ǡ頊⌀ဋﮁၿﵡ衿贈ꁼ\uee21怋≀\uf87d李选\uefe1塿⩀끼﨡ࠉ@쁼Ơ렊\uf221\ud807⎠栉\ueee1\ue87c☠遽\uf661ま⦠偾⨀퀊⥀\ua87b︡顾ﲁ⠋\uf561\uf87e視큾⭀ࠉ敏顾\uf8c1ဋ\ufae1\ue07dﵡ\ud87cῠ\uf80a\uf341\ue87e⡠䁼⫠\uf008\uf481롾␠硿\uf541ၼ﵁ၿ李〉Ⲡ䠀ﻡ㡼▀\uf808\uf3e1ညⶠ뀊ⴠ\ud87e⨠퀉⛀퀊☠⡾\uf861\ud80a\uf641᠋贈뀉\uf821堀⏀졾⑀堉﨡硾▀蠈▀\uf87d❠\ue80aⱀ塽\uee01塿嬨\u187c⨀쁾\uf121遽\ufde1\uf808⒠ꀉﬁ⠊\uef61렊度まà\ua87d視衽\uf3e1\ua87b⍀硿\uf0a1\ua87c\uf081젊\uf401䡼﨡\ue87dﵡ蠈ⓠ聻論 ὀ䁾\uef41䁽ﶡ䠉說\u0015綍荜瀭\uf35e滍쭛皭ﭜ甍鍪ꍍ筝纍卝ꉭﭝ瞭뭨갍歝疭"
         .length();
      String var7 = "¯\uf381㡾ﵡ倉論《ﻁ\uf87bŠ耈Ǡ頊⌀ဋﮁၿﵡ衿贈ꁼ\uee21怋≀\uf87d李选\uefe1塿⩀끼﨡ࠉ@쁼Ơ렊\uf221\ud807⎠栉\ueee1\ue87c☠遽\uf661ま⦠偾⨀퀊⥀\ua87b︡顾ﲁ⠋\uf561\uf87e視큾⭀ࠉ敏顾\uf8c1ဋ\ufae1\ue07dﵡ\ud87cῠ\uf80a\uf341\ue87e⡠䁼⫠\uf008\uf481롾␠硿\uf541ၼ﵁ၿ李〉Ⲡ䠀ﻡ㡼▀\uf808\uf3e1ညⶠ뀊ⴠ\ud87e⨠퀉⛀퀊☠⡾\uf861\ud80a\uf641᠋贈뀉\uf821堀⏀졾⑀堉﨡硾▀蠈▀\uf87d❠\ue80aⱀ塽\uee01塿嬨\u187c⨀쁾\uf121遽\ufde1\uf808⒠ꀉﬁ⠊\uef61렊度まà\ua87d視衽\uf3e1\ua87b⍀硿\uf0a1\ua87c\uf081젊\uf401䡼﨡\ue87dﵡ蠈ⓠ聻論 ὀ䁾\uef41䁽ﶡ䠉說\u0015綍荜瀭\uf35e滍쭛皭ﭜ甍鍪ꍍ筝纍卝ꉭﭝ瞭뭨갍歝疭";
      int var11 = 0;
      int var10 = 0;

      do {
         char var20 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var20;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      lIlI = var9;
      lIll = new Object[var9.length];
      byte var21 = 0;
      int var10001 = 0;
      lIIl = new int[302];
      byte[] var10002 = "Fk){ìjî_¨XlGA\u0089 \u0007Z\u0082ùt÷³&ÔÐT\u0098c\u0012t\u0001)¯\t^msÁ´\u009d½²ÍkNp\u0095\u0019ä®\u0018a\u009dg+×Ì\u009eP¹JÀt\"ý\u009eæ6g\u000fÕ2õp ïLü×ê:é\u001f\u0012\u0080ò\u001f>\u0003QÊ\u0007aYk\u001c\u009fM|z5¸ÿÌ\u001cTùP@2Ýé=ÿ\u0095\u0011©Õ\u000bó_±\b\u0011\u0003<deA\tÎÔ´\u00820F'\u000bè½ú\u0010G\u0093ßµåç{'+wÈÄL+ \u009a{\np²:ÞÄRc ¥!³T¤>ÿ\u008e)PþÆ\u001cg¯èm\u0005¨<£èçöÇ¬'\u0083ÿs[ß\u009eÖQì\u0011ê±\u0007\u0098/û\u0093Ä\r'ì\u0016Ñ~î2UóÍ«¯Æ7\u0092Ó<v;M6å½i\u0086!è{¾ñ\u0098´sÞÏV\u001bói²Æ\u0097ð©\u0019\u009eësÍ\u009dO^\u00ad\u007fç»\u0082à\u0018½Íâª\f\u008b§\u0013ó{þW}®ø\u0003ÞFþÖ/\f_Æa/\u007f\u0084\u0010\u008eô(M\u00828\u0017|'z¹¼\\ú\fìdÒÕ<\u008a#/\u008eÅè\u0087Y\u0087ì>\u009bÊÙ\u0013zÿ5Ací\u0097¾â\u0006\u008c\u008e\u001a¾£v@3k\u000fÌ:»«µÀ×\u008a\"´Q3ç*\u0011Wâ¯+\u0001\u001f\u0081ÿfÃf\u0010y\u0092\u000e6QÖs þþªà»\u0095\r·Ê9ã\u0002¬;W¾íG·\u008e\u000b>n\u0086#vqïnÇêèbætS-Ê=6\u0087=CH\u0011Lþe7\u001dÌ¸ó3AM½8\u000fRÓëåÝ\u0004ÀþÙ\u0094È½.Æ¬L\u0019@\u001fOÆ@ß\u008ck\u0098×ÒdBú)û¥q\u0016î=Ó\u0082\u0082\f\u001f\u008f»\u0080\u007f$1\u0000þ\b\u001e\u0094u\n±\u0019n\u0017\t\u001b\u008bd\f%\u008fÝö¤É?Î×[ÔH\u001c#Ñ\u009cúþzËiã\u0019-\u0004\u0098J/¦Í\u0088oðL:f\u001dÍ\u0004\u0096¢ô# ¿Jï\u0018¼\u009b\u0007ï\u0096pG\u001fM` \u009eJ\u0012\\²44\u0017ô\u009fÎ \u0017ã\u0003\u0090%x\u0002ûHå{]ðDÉ\u0001\u001f\u0001wî\u0098\u0090Qyt#\u001eú$¨\u008a,ù÷Æ´÷÷W2të\u0092Êÿ\u0018èW\bf*\u009e8Oº\u0016\u000f\u0011bÏCí9ÁÝk\u0082Í32\tC¤\u0004ð\u0018\u009fÎ±\u0094\u0080Æ#\u008eM\u0011qò{\u009fÊ£òe\u008eÜ:Lv\u0099û\u000e°ò.è9,©\u001f\u0099·V\u0011¨¢¢ØR\\t\u0013B1¡\u008f@¸ÿ\t\rAÞ&Wf9Z\u0006ö t\u0085\u0085#\u0007PÆ\u0095o\u0001\u0098ý\u0096\u0091jó\u001em\u001b\u001bå\u009dÄ\u001fAai,!oxüì¯\u001a\u0007Ö\u00931\u000f\u0092\u000e®?75÷f\bí\u0096v}þÉ\bö\u000b\u008b\"w{\u0012e\u008a88WÅ×àÕES ¤]\u0017\u0016¯àé\u001c\u009b¡Ð\u0090D(ÛUW\u0010»q·?ßË\u00adÒ\u009d(\u0096ñëéó'bÚYê\u001d\u001a£íýÛm\u009eî\u0095ë~\u0001\r<Ã\u001e©¬âîªö}ø\n+t½]éÉÕÔu]¼ýÐÿ~æm\u0096N¤÷a·:ç\u001bG±¿çT\u009c\u0007.\u0018õ]\u009e*x¤â£$\u0003$\u0089Gð\u0090Z°MÍÞ\r\u0099\u008a\u0001I\u0019Kñ+\u0005¼5\t];×îí)«f+p-£ \u000f\u0012P\u001cP*\u0091Í¼Í\u008f|\u00883\u0000éÈ\u0003\u0000H±Å\u00adßK\tÚn\u0090#r:L\u0095C2\u0001Ý§²\u0006ÚZh'\u008då&\u0082;µmV¾\u0094R°õÐ\u0002\u0016\u008d\u0087??rÓ«\u0085H]Î·\u001a\u008d\n>b\u001d\u0080¢Ò\u009aØÄþpÝ@ÉÎ\u009eXÛ\u0094o¨=×\u0094\u0090`sE\u009f&;ü\u0085²½§.xTìÚ>\u001e\u008d\u0083²ÄÐ\u009b\u0092~\u001bØ«òD8Gä\u0089T¦\róÇ#\u001e\u009bº2$¤Rp\u000b1Xüü<Ð \u009díë\u0082ípí\u000f\u0007|ó'kV\u001b\u0000\téÀä\u001a¬\u008b¨}Oï\u008aÎ\u000b\u007fÙjBJÊ\u00ad\u0094\u0084³´\u001a±ÌØ-\u008e\u007f\u0095s\u009f:òýõ\u001f\u001fUôm\"4jãdúãªfN÷7]\u0081~°¯è\u0001.\u0010Ãt\u0083ÌCq~àGq\u009f§ð¦\rk\u0019\u0090\u0097\u009d¼"
         .getBytes("ISO-8859-1");

      int var54;
      do {
         lIIl[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1349963865;
         var21 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var5 = new String[IIll(942496007, var17 ^ -1411432718)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IlII((short)25008, '뵵', var17 ^ 858702005)).length();
      int var1 = IIll(942496004, var17 ^ -1820157418);
      int var19 = -1;

      label91:
      while (true) {
         int var22 = IIll(942496005, var17 ^ -1664822429);
         String var26 = var2.substring(++var19, var19 + var1);
         byte var38 = -1;

         while (true) {
            label86: {
               char[] var56 = var26.toCharArray();
               int var68 = var56.length;
               int var6 = 0;
               var54 = var22;
               var43 = var56;
               var10001 = var68;
               char[] var80;
               int var87;
               if (var68 <= 1) {
                  var80 = var56;
                  var68 = var22;
                  var87 = var6;
               } else {
                  var54 = var22;
                  var10001 = var68;
                  if (var68 <= var6) {
                     break label86;
                  }

                  var80 = var56;
                  var68 = var22;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % IIll(942496008, var17 ^ -639830033)) {
                     case 0 -> IIll(942496009, var17 ^ -2142229432);
                     case 1 -> IIll(942496014, var17 ^ -1737451750);
                     case 2 -> IIll(942496015, var17 ^ -615965891);
                     case 3 -> IIll(942496012, var17 ^ 1000672761);
                     case 4 -> IIll(942496013, var17 ^ 1464132761);
                     case 5 -> IIll(942496018, var17 ^ -993921029);
                     default -> IIll(942496019, var17 ^ -1177498135);
                  });
                  var6++;
                  if (var54 == 0) {
                     var87 = var54;
                     var80 = var43;
                     var68 = var54;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var80 = var43;
                     var68 = var54;
                     var87 = var6;
                  }
               }
            }

            String var61 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var5[var3++] = var61;
                  if ((var19 += var1) >= var4) {
                     IIll = var5;
                     IIlI = new String[IIll(942496011, var17 ^ 765115782)];
                     lIl = IlIIllIII.Ill(lI(IIll(942496016, var17 ^ 1368601014), IIll(942496017, var17 ^ -1528743146)));
                     IlIl = IlIIllIII.Ill(lI(IIll(942496022, var17 ^ -742152359), IIll(942496023, var17 ^ -396361245)));
                     I = IlIIllIII.Ill(lI(IIll(942496020, var17 ^ -286507572), IIll(942496021, var17 ^ 255508374)));
                     II = IlIIllIII.Ill(lI(IIll(942496026, var17 ^ 417543002), IIll(942496027, var17 ^ -1022948751)));
                     lI = IlIIllIII.Ill(lI(IIll(942496024, var17 ^ -2008332298), IIll(942496025, var17 ^ 328663741)));
                     lll = IlIIllIII.Ill(lI(IIll(942496030, var17 ^ 2084196578), IIll(942496031, var17 ^ 1227469746)));
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var61;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label91;
                  }

                  var4 = (var2 = IlII((short)'ꃔ', '뵴', var17 ^ -956727042)).length();
                  var1 = 4;
                  var19 = -1;
            }

            var22 = IIll(942496010, var17 ^ -2041555718);
            var26 = var2.substring(++var19, var19 + var1);
            var38 = 0;
         }
      }
   }

   @Override
   public double lll() {
      return this.IlII.IllI();
   }

   private class_2960 I() {
      class_2960 var1 = this.IIII;
      if (var1 == null) {
         var1 = lII(IlIl);
         this.IIII = var1;
      }

      return var1;
   }

   private static double l(class_327 var0, String var1, IIIlIlIl var2) {
      int var3 = IIIIlIlI.Il(var2, var1);
      return var3 >= 0 ? var3 : (var0 == null ? 48.0 : var0.method_1727(var1));
   }

   private static void II(class_332 var0, class_327 var1, String var2, double var3, double var5, double var7, IIIlIlIl var9, int var10, boolean var11) {
      String[] var12 = IIllllIl.IIIIl();
      boolean var13 = var11 && IIIlIIII.lllI();
      IlIIlllIl.IIllll(var0);
      IlIIlllIl.IlIIlI(var0, var3, var5);
      IlIIlllIl.llIIIl(var0, var7, var7);
      label46:
      if (!IIIIlIlI.IlI(var9, var0, var2, 0.0, 0.0, var10, false, var13)) {
         if (var13) {
            Boolean var14 = IlIIlllIl.llI(true);

            try {
               IlIIlllIl.IIll(var0, var1, var2, 0.0, 0.0, var10);
            } finally {
               IlIIlllIl.lIllIl(var14);
            }

            if (var12 == null) {
               break label46;
            }
         }

         IlIIlllIl.IIll(var0, var1, var2, 0.0, 0.0, var10);
      }

      IlIIlllIl.lIIIll(var0);
   }

   private void Il(class_332 var1, boolean var2) {
      double var3 = this.lll();
      double var5 = this.ll();
      double var7 = this.IIl();
      double var9 = 30.0;
      double var11 = 2.0;
      double var13 = 4.0;
      double var15 = 4.0;
      double var17 = var13 + var9 + var11;
      class_310 var19 = class_310.method_1551();
      class_327 var20 = var19 == null ? null : var19.field_1772;
      String var21 = I.llIl();
      String var22 = II.llIl();
      double var23 = this.llI(var20, var21);
      double var25 = this.III(var20, var22);
      double var27 = Math.max(var23, var25);
      double var33 = 16.2;
      double var35 = 5.58;
      double var37 = var33 + 0.3 + var35;
      double var39 = var15 + (var9 - var37) * 0.5;
      double var41 = var39 + var33 + 0.3;
      IlIIlllIl.IIllll(var1);
      IlIIlllIl.IlIIlI(var1, var3, var5);
      IlIIlllIl.llIIIl(var1, var7, var7);
      IlIIlllIl.IlIIII(var1, this.I(), var13, var15, var9, var9, IIll(942495746, 1338418207 ^ 1643562426), IIll(942495747, 1338418207 ^ -873004385));
      if (var20 != null) {
         IIlI(var1, var20, var21, var17, var39, 1.8, -0.36, lI, -1);
         II(var1, var20, var22, var17, var41, 0.62, lll, IIll(942495744, 1338418207 ^ -1882057340), true);
      }

      IlIIlllIl.lIIIll(var1);
   }

   private static String lI(int var0, int var1) {
      int var9 = 1972061239;
      int var2 = (var0 ^ IIll(942495745, var9 ^ 1549300603)) & IIll(942495750, var9 ^ -1196600932);
      if (IIlI[var2] == null) {
         char[] var3 = IIll[var2].toCharArray();

         int var4 = switch (var3[0] & IIll(942495751, var9 ^ -362600643)) {
            case 0 -> IIll(942495748, var9 ^ -846947970);
            case 1 -> IIll(942495749, var9 ^ 262406158);
            case 2 -> 2;
            case 3 -> IIll(942495754, var9 ^ -1294377134);
            case 4 -> IIll(942495755, var9 ^ 1846653974);
            case 5 -> IIll(942495752, var9 ^ -1604137890);
            case 6 -> IIll(942495753, var9 ^ 1403032680);
            case 7 -> IIll(942495758, var9 ^ -109176464);
            case 8 -> IIll(942495759, var9 ^ -2135479479);
            case 9 -> IIll(942495756, var9 ^ -783396371);
            case 10 -> IIll(942495757, var9 ^ 1460696330);
            case 11 -> IIll(942495762, var9 ^ -531699959);
            case 12 -> IIll(942495763, var9 ^ 2061489663);
            case 13 -> IIll(942495760, var9 ^ -392126423);
            case 14 -> IIll(942495761, var9 ^ 1361892916);
            case 15 -> IIll(942495766, var9 ^ 658055045);
            case 16 -> IIll(942495767, var9 ^ -1658708041);
            case 17 -> IIll(942495764, var9 ^ 511822711);
            case 18 -> IIll(942495765, var9 ^ 2089380784);
            case 19 -> IIll(942495770, var9 ^ -2103608093);
            case 20 -> IIll(942495771, var9 ^ 677969453);
            case 21 -> IIll(942495768, var9 ^ 25491628);
            case 22 -> IIll(942495769, var9 ^ 1575148795);
            case 23 -> IIll(942495774, var9 ^ 539989028);
            case 24 -> IIll(942495775, var9 ^ -1274738151);
            case 25 -> IIll(942495772, var9 ^ 1113655651);
            case 26 -> IIll(942495773, var9 ^ 518808946);
            case 27 -> IIll(942495778, var9 ^ 1557778207);
            case 28 -> IIll(942495779, var9 ^ -1454231188);
            case 29 -> IIll(942495776, var9 ^ 987490365);
            case 30 -> IIll(942495777, var9 ^ -406829350);
            case 31 -> 3;
            case 32 -> IIll(942495782, var9 ^ -1033509837);
            case 33 -> IIll(942495783, var9 ^ 1727474564);
            case 34 -> IIll(942495780, var9 ^ -720089622);
            case 35 -> IIll(942495781, var9 ^ -1119192364);
            case 36 -> IIll(942495786, var9 ^ 1835154011);
            case 37 -> IIll(942495787, var9 ^ -645766226);
            case 38 -> IIll(942495784, var9 ^ -1192119783);
            case 39 -> IIll(942495785, var9 ^ -1175519492);
            case 40 -> IIll(942495790, var9 ^ 880869371);
            case 41 -> IIll(942495791, var9 ^ 28815044);
            case 42 -> IIll(942495788, var9 ^ 1893050698);
            case 43 -> IIll(942495789, var9 ^ -1103567141);
            case 44 -> IIll(942495794, var9 ^ -629397709);
            case 45 -> IIll(942495795, var9 ^ -492610916);
            case 46 -> IIll(942495792, var9 ^ -2096738049);
            case 47 -> IIll(942495793, var9 ^ 205172848);
            case 48 -> IIll(942495798, var9 ^ -2046821704);
            case 49 -> IIll(942495799, var9 ^ -639818191);
            case 50 -> IIll(942495796, var9 ^ 184647193);
            case 51 -> IIll(942495797, var9 ^ 797307607);
            case 52 -> IIll(942495802, var9 ^ -1233139909);
            case 53 -> IIll(942495803, var9 ^ -1895612999);
            case 54 -> IIll(942495800, var9 ^ 647837649);
            case 55 -> IIll(942495801, var9 ^ -1598453808);
            case 56 -> IIll(942495806, var9 ^ -173293761);
            case 57 -> IIll(942495807, var9 ^ -2057014434);
            case 58 -> IIll(942495804, var9 ^ -762963310);
            case 59 -> IIll(942495805, var9 ^ 1952630754);
            case 60 -> IIll(942495810, var9 ^ -310830780);
            case 61 -> IIll(942495811, var9 ^ -157037527);
            case 62 -> IIll(942495808, var9 ^ 1385082288);
            case 63 -> IIll(942495809, var9 ^ -93617316);
            case 64 -> IIll(942495814, var9 ^ 91081994);
            case 65 -> IIll(942495815, var9 ^ -1210283270);
            case 66 -> IIll(942495812, var9 ^ 237206271);
            case 67 -> IIll(942495813, var9 ^ 1252896720);
            case 68 -> IIll(942495818, var9 ^ 504252020);
            case 69 -> IIll(942495819, var9 ^ -872477526);
            case 70 -> IIll(942495816, var9 ^ -609145090);
            case 71 -> IIll(942495817, var9 ^ -1715433983);
            case 72 -> IIll(942495822, var9 ^ 899515820);
            case 73 -> IIll(942495823, var9 ^ 179054198);
            case 74 -> IIll(942495820, var9 ^ -1536401977);
            case 75 -> IIll(942495821, var9 ^ 289170802);
            case 76 -> IIll(942495826, var9 ^ -924021950);
            case 77 -> IIll(942495827, var9 ^ 845071561);
            case 78 -> IIll(942495824, var9 ^ -1702262991);
            case 79 -> IIll(942495825, var9 ^ 592169493);
            case 80 -> IIll(942495830, var9 ^ 246087282);
            case 81 -> IIll(942495831, var9 ^ 1555295464);
            case 82 -> IIll(942495828, var9 ^ -1557002745);
            case 83 -> IIll(942495829, var9 ^ -1815429139);
            case 84 -> IIll(942495834, var9 ^ 1804612525);
            case 85 -> IIll(942495835, var9 ^ 303839805);
            case 86 -> IIll(942495832, var9 ^ -1234845655);
            case 87 -> IIll(942495833, var9 ^ -1745701601);
            case 88 -> 0;
            case 89 -> IIll(942495838, var9 ^ 775367531);
            case 90 -> IIll(942495839, var9 ^ 1244835436);
            case 91 -> IIll(942495836, var9 ^ 483360976);
            case 92 -> IIll(942495837, var9 ^ 2064869111);
            case 93 -> IIll(942495842, var9 ^ 1682050788);
            case 94 -> IIll(942495843, var9 ^ 1275491317);
            case 95 -> IIll(942495840, var9 ^ -483480623);
            case 96 -> IIll(942495841, var9 ^ -1505424151);
            case 97 -> IIll(942495846, var9 ^ -672537950);
            case 98 -> IIll(942495847, var9 ^ -1309977051);
            case 99 -> IIll(942495844, var9 ^ -258492779);
            case 100 -> IIll(942495845, var9 ^ 384724889);
            case 101 -> IIll(942495850, var9 ^ 1051095322);
            case 102 -> IIll(942495851, var9 ^ 1930947138);
            case 103 -> IIll(942495848, var9 ^ 2134275433);
            case 104 -> IIll(942495849, var9 ^ 807025765);
            case 105 -> IIll(942495854, var9 ^ -1695726685);
            case 106 -> IIll(942495855, var9 ^ 211615723);
            case 107 -> IIll(942495852, var9 ^ 718130660);
            case 108 -> IIll(942495853, var9 ^ -287096594);
            case 109 -> IIll(942495858, var9 ^ -1595404572);
            case 110 -> IIll(942495859, var9 ^ -834935524);
            case 111 -> IIll(942495856, var9 ^ 420544501);
            case 112 -> IIll(942495857, var9 ^ -1994867209);
            case 113 -> IIll(942495862, var9 ^ -612610706);
            case 114 -> IIll(942495863, var9 ^ 1573867158);
            case 115 -> IIll(942495860, var9 ^ 1561300148);
            case 116 -> IIll(942495861, var9 ^ -2063084682);
            case 117 -> IIll(942495866, var9 ^ 1596598555);
            case 118 -> IIll(942495867, var9 ^ -1197402617);
            case 119 -> IIll(942495864, var9 ^ 537101228);
            case 120 -> IIll(942495865, var9 ^ 298815214);
            case 121 -> IIll(942495870, var9 ^ -1649466145);
            case 122 -> 5;
            case 123 -> IIll(942495871, var9 ^ 489556340);
            case 124 -> IIll(942495868, var9 ^ -1985672395);
            case 125 -> IIll(942495869, var9 ^ 79566336);
            case 126 -> IIll(942495874, var9 ^ 106653135);
            case 127 -> IIll(942495875, var9 ^ 945806361);
            case 128 -> IIll(942495872, var9 ^ -1189527611);
            case 129 -> IIll(942495873, var9 ^ -896805821);
            case 130 -> IIll(942495878, var9 ^ 32756129);
            case 131 -> IIll(942495879, var9 ^ -416384084);
            case 132 -> IIll(942495876, var9 ^ 1949505825);
            case 133 -> IIll(942495877, var9 ^ 424168061);
            case 134 -> IIll(942495882, var9 ^ -1155692155);
            case 135 -> IIll(942495883, var9 ^ -308528221);
            case 136 -> IIll(942495880, var9 ^ 1902066);
            case 137 -> IIll(942495881, var9 ^ -1088150722);
            case 138 -> IIll(942495886, var9 ^ -1566904608);
            case 139 -> IIll(942495887, var9 ^ -1588918731);
            case 140 -> IIll(942495884, var9 ^ -1952430344);
            case 141 -> IIll(942495885, var9 ^ 1353752903);
            case 142 -> IIll(942495890, var9 ^ 1472355594);
            case 143 -> IIll(942495891, var9 ^ 702814147);
            case 144 -> IIll(942495888, var9 ^ -2111921692);
            case 145 -> IIll(942495889, var9 ^ -19689427);
            case 146 -> IIll(942495894, var9 ^ 1708325602);
            case 147 -> IIll(942495895, var9 ^ -122987504);
            case 148 -> IIll(942495892, var9 ^ 1494810871);
            case 149 -> IIll(942495893, var9 ^ 480767979);
            case 150 -> IIll(942495898, var9 ^ -1920894832);
            case 151 -> IIll(942495899, var9 ^ 1053752277);
            case 152 -> IIll(942495896, var9 ^ -1252381303);
            case 153 -> IIll(942495897, var9 ^ -367610473);
            case 154 -> IIll(942495902, var9 ^ -360238169);
            case 155 -> IIll(942495903, var9 ^ -163394702);
            case 156 -> IIll(942495900, var9 ^ 87578363);
            case 157 -> IIll(942495901, var9 ^ 2080022518);
            case 158 -> IIll(942495906, var9 ^ 1382684193);
            case 159 -> IIll(942495907, var9 ^ 213044975);
            case 160 -> IIll(942495904, var9 ^ -253115969);
            case 161 -> IIll(942495905, var9 ^ 1985137761);
            case 162 -> IIll(942495910, var9 ^ 802767452);
            case 163 -> IIll(942495911, var9 ^ 421534195);
            case 164 -> IIll(942495908, var9 ^ -748579691);
            case 165 -> IIll(942495909, var9 ^ -604795334);
            case 166 -> IIll(942495914, var9 ^ 211939906);
            case 167 -> IIll(942495915, var9 ^ -2112183737);
            case 168 -> IIll(942495912, var9 ^ 2019482975);
            case 169 -> IIll(942495913, var9 ^ 1369872479);
            case 170 -> IIll(942495918, var9 ^ 325120958);
            case 171 -> IIll(942495919, var9 ^ -169267942);
            case 172 -> IIll(942495916, var9 ^ 38385405);
            case 173 -> IIll(942495917, var9 ^ 209232701);
            case 174 -> IIll(942495922, var9 ^ -981312046);
            case 175 -> IIll(942495923, var9 ^ 244461958);
            case 176 -> IIll(942495920, var9 ^ -1836009096);
            case 177 -> IIll(942495921, var9 ^ 350044225);
            case 178 -> IIll(942495926, var9 ^ 998729598);
            case 179 -> IIll(942495927, var9 ^ 1205270518);
            case 180 -> IIll(942495924, var9 ^ 1767212336);
            case 181 -> IIll(942495925, var9 ^ 444647206);
            case 182 -> IIll(942495930, var9 ^ 1926338903);
            case 183 -> IIll(942495931, var9 ^ -1958647023);
            case 184 -> IIll(942495928, var9 ^ 62724676);
            case 185 -> IIll(942495929, var9 ^ -129121269);
            case 186 -> IIll(942495934, var9 ^ 1555130522);
            case 187 -> IIll(942495935, var9 ^ 1019181310);
            case 188 -> IIll(942495932, var9 ^ -243328167);
            case 189 -> IIll(942495933, var9 ^ -884789102);
            case 190 -> IIll(942495938, var9 ^ -1881231433);
            case 191 -> IIll(942495939, var9 ^ 719714166);
            case 192 -> IIll(942495936, var9 ^ 356357731);
            case 193 -> IIll(942495937, var9 ^ 1613678940);
            case 194 -> IIll(942495942, var9 ^ -337933611);
            case 195 -> IIll(942495943, var9 ^ 1789596212);
            case 196 -> IIll(942495940, var9 ^ -1746388555);
            case 197 -> IIll(942495941, var9 ^ -670572196);
            case 198 -> IIll(942495946, var9 ^ 1484988607);
            case 199 -> 4;
            case 200 -> IIll(942495947, var9 ^ 1086789401);
            case 201 -> IIll(942495944, var9 ^ -46588614);
            case 202 -> IIll(942495945, var9 ^ -1140813324);
            case 203 -> IIll(942495950, var9 ^ 889934931);
            case 204 -> IIll(942495951, var9 ^ 225144982);
            case 205 -> IIll(942495948, var9 ^ 571460226);
            case 206 -> IIll(942495949, var9 ^ -817025152);
            case 207 -> IIll(942495954, var9 ^ -331618203);
            case 208 -> IIll(942495955, var9 ^ 984800205);
            case 209 -> IIll(942495952, var9 ^ -137553108);
            case 210 -> IIll(942495953, var9 ^ -265430281);
            case 211 -> IIll(942495958, var9 ^ -2093050755);
            case 212 -> IIll(942495959, var9 ^ 1674644480);
            case 213 -> IIll(942495956, var9 ^ -556881894);
            case 214 -> IIll(942495957, var9 ^ -12670139);
            case 215 -> IIll(942495962, var9 ^ 1613236804);
            case 216 -> IIll(942495963, var9 ^ 1768774666);
            case 217 -> IIll(942495960, var9 ^ -737815121);
            case 218 -> IIll(942495961, var9 ^ 1080884621);
            case 219 -> IIll(942495966, var9 ^ -491854336);
            case 220 -> IIll(942495967, var9 ^ -1952537107);
            case 221 -> 1;
            case 222 -> IIll(942495964, var9 ^ 2087140203);
            case 223 -> IIll(942495965, var9 ^ 110604404);
            case 224 -> IIll(942495970, var9 ^ -91972128);
            case 225 -> IIll(942495971, var9 ^ 868807801);
            case 226 -> IIll(942495968, var9 ^ -2080737086);
            case 227 -> IIll(942495969, var9 ^ -9231253);
            case 228 -> IIll(942495974, var9 ^ 962152394);
            case 229 -> IIll(942495975, var9 ^ -1920290491);
            case 230 -> IIll(942495972, var9 ^ -804385719);
            case 231 -> IIll(942495973, var9 ^ -1747892053);
            case 232 -> IIll(942495978, var9 ^ 1445014388);
            case 233 -> IIll(942495979, var9 ^ -1578825577);
            case 234 -> IIll(942495976, var9 ^ 638054060);
            case 235 -> IIll(942495977, var9 ^ 880502779);
            case 236 -> IIll(942495982, var9 ^ 1845338688);
            case 237 -> IIll(942495983, var9 ^ 314724742);
            case 238 -> IIll(942495980, var9 ^ 1308266533);
            case 239 -> IIll(942495981, var9 ^ -1591898402);
            case 240 -> IIll(942495986, var9 ^ -1780284969);
            case 241 -> IIll(942495987, var9 ^ -707592132);
            case 242 -> IIll(942495984, var9 ^ -1407865648);
            case 243 -> IIll(942495985, var9 ^ 1457118134);
            case 244 -> IIll(942495990, var9 ^ -1913425342);
            case 245 -> IIll(942495991, var9 ^ 1363493743);
            case 246 -> IIll(942495988, var9 ^ 470656926);
            case 247 -> IIll(942495989, var9 ^ 453663595);
            case 248 -> IIll(942495994, var9 ^ 979231237);
            case 249 -> IIll(942495995, var9 ^ -1611942808);
            case 250 -> IIll(942495992, var9 ^ 1265538449);
            case 251 -> IIll(942495993, var9 ^ -1390030414);
            case 252 -> IIll(942495998, var9 ^ 190678714);
            case 253 -> IIll(942495999, var9 ^ 581096324);
            case 254 -> IIll(942495996, var9 ^ -1734845026);
            default -> IIll(942495997, var9 ^ -1429566283);
         };
         int var5 = (var1 & IIll(942496002, var9 ^ 598875500)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIll(942496003, var9 ^ 1090335541)) >>> IIll(942496000, var9 ^ -651267754)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIll(942496001, var9 ^ 1561972337);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIll(942496006, var9 ^ 1158386823);
            }
         }

         IIlI[var2] = new String(var3).intern();
      }

      return IIlI[var2];
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

      this.IlII.Ill(Math.max(0.0, Math.min(var1, var5)));
      this.llI.Ill(Math.max(0.0, Math.min(var3, var7)));
   }

   private double III(class_327 var1, String var2) {
      if (this.Ill <= 0.0 && var1 != null) {
         this.Ill = l(var1, var2, lll) * 0.62;
      }

      return this.Ill > 0.0 ? this.Ill : l(var1, var2, lll) * 0.62;
   }

   private double IIl() {
      return this.ll.IllI() / 100.0;
   }

   private static String IlII(short var0, char var1, int var2) {
      int var3 = var1 ^ '뵵';
      char[] var4 = lIlI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lIll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lIll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 12229;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 21872;
         var10 ^= 18030;
         var10 ^= 7307;
         var10 += 43848;
         var10 += 17613;
         var10 += 39757;
         var10 += 32517;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private double Ill() {
      class_310 var1 = class_310.method_1551();
      class_327 var2 = var1 == null ? null : var1.field_1772;
      double var3 = this.llI(var2, I.llIl()) + Math.abs(-0.36) * 9.0 * 1.8;
      double var5 = this.III(var2, II.llIl());
      return 40.0 + Math.max(var3, var5);
   }

   private static class_2960 lII(IIIlIlIl var0) {
      return class_2960.method_60655(lIl.llIl(), var0.llIl());
   }

   @Override
   public double ll() {
      return this.llI.IllI();
   }

   @Override
   public void Illl(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.Il(var1, var5);
   }

   private static double lIl(class_327 var0, String var1) {
      return l(var0, var1, lI);
   }

   private static int IIll(int var0, int var1) {
      int var2 = lIIl[var0 ^ 942495746] ^ var1 ^ var0;
      var2 -= 12628;
      var2 ^= 30743;
      var2 ^= 3871;
      var2 += 46595;
      var2 ^= 47596;
      return var2 ^ 38198;
   }

   @Override
   public boolean llII(double var1, double var3) {
      return var1 >= this.lll() && var1 <= this.lll() + this.IIllI() && var3 >= this.ll() && var3 <= this.ll() + this.IIIl();
   }

   private double llI(class_327 var1, String var2) {
      if (this.III <= 0.0 && var1 != null) {
         this.III = l(var1, var2, lI) * 1.8;
      }

      return this.III > 0.0 ? this.III : l(var1, var2, lI) * 1.8;
   }

   @Override
   public double IIllI() {
      return this.Ill() * this.IIl();
   }

   public IlIIIIIII(IIIlIIII var1) {
      int var2 = 1493141347;
      super(
         IlIIllIII.Ill(lI(IIll(942496028, var2 ^ -1273584360), IIll(942496029, var2 ^ -2123759707))),
         lllIIlIl.II,
         IlIIllIII.Ill(lI(IIll(942496034, var2 ^ -1092975495), IIll(942496035, var2 ^ -1348568829)))
      );
      this.IlII = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lI(IIll(942496032, var2 ^ -977662400), IIll(942496033, var2 ^ -993411456))), 16.0, 0.0, 4000.0, 1.0)
            .IIIl(IlIIllIII.Ill(lI(IIll(942496038, var2 ^ 1514567159), IIll(942496039, var2 ^ 754029211))))
      );
      this.llI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lI(IIll(942496036, var2 ^ -946713465), IIll(942496037, var2 ^ 1309985229))), 16.0, 0.0, 4000.0, 1.0)
            .IIIl(IlIIllIII.Ill(lI(IIll(942496042, var2 ^ 831193588), IIll(942496043, var2 ^ 1143398567))))
      );
      this.ll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lI(IIll(942496040, var2 ^ 1104933196), IIll(942496041, var2 ^ -1094429874))), 155.0, 75.0, 300.0, 5.0)
            .IIIl(IlIIllIII.Ill(lI(IIll(942496046, var2 ^ -1767343613), IIll(942496047, var2 ^ -1607267126))))
      );
      this.III = -1.0;
      this.Ill = -1.0;
      this.IlIllIl(true);
   }

   @Override
   public double IIIl() {
      return this.IIII() * this.IIl();
   }

   private double IIII() {
      return 38.0;
   }

   private static void IIlI(class_332 var0, class_327 var1, String var2, double var3, double var5, double var7, double var9, IIIlIlIl var11, int var12) {
      IlIIlllIl.IIllll(var0);
      IlIIlllIl.IlIIlI(var0, var3, var5);
      IlIIlllIl.llIIIl(var0, var7, var7);
      if (var9 != 0.0) {
         IlIIlllIl.IIllI(var0, var9, 0.0);
      }

      if (!IIIIlIlI.IlI(var11, var0, var2, 0.0, 0.0, var12, false, false)) {
         IlIIlllIl.IIll(var0, var1, var2, 0.0, 0.0, var12);
      }

      IlIIlllIl.lIIIll(var0);
   }

   @Override
   public void IIIII(class_332 var1, int var2, int var3, float var4) {
      this.Il(var1, false);
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      this.Il(var1, false);
   }
}
