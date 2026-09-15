package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_9362;

@Environment(EnvType.CLIENT)
public final class lIIlllII extends IlIIIIIIl {
   private static final float I = 4.0F;
   private static final int II = 2;
   private static final int[] lll;
   private boolean Il;
   private static final int lI = 9;
   private final IIlIII ll;
   private static final double III = 6.0;
   private static final String[] IIl;
   private int IlI;
   private class_1309 Ill;
   private long lII;
   private static final Object[] IIIl;
   private int lIl;
   private static final String[] IIII;
   private static final String[] llI;

   private boolean I(class_310 var1) {
      return var1 != null
         && var1.field_1690 != null
         && var1.field_1690.field_1886 != null
         && (var1.field_1690.field_1886.method_1434() || IIll.IIIIIlI(var1.field_1690.field_1886) > 0);
   }

   public boolean II(class_310 var1, class_1309 var2) {
      if (!this.IIIIlIl() || var2 == null) {
         return false;
      } else if (this.Ill != null) {
         return this.Ill == var2;
      } else {
         return !this.lI(var1, var2) ? false : this.IIl(var1, var2);
      }
   }

   private boolean Il(class_1799 var1) {
      return var1 != null && !var1.method_7960() && var1.method_7909() instanceof class_9362 && this.IIII(var1);
   }

   private boolean lI(class_310 var1, class_1297 var2) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var1.field_1755 == null
         && var1.field_1724.method_5805()
         && !var1.field_1724.method_6115()
         && var1.field_1724.field_6017 <= 4.0
         && this.lII(var1)
         && !lIIIllII.ll(var1)
         && var2 instanceof class_1309 var3
         && var3 != var1.field_1724
         && var3.method_5805()
         && var3.method_5858(var1.field_1724) <= 36.0;
   }

   @Override
   public void llIl() {
      this.Illl(class_310.method_1551());
   }

   private static String lIIl(int var0, int var1) {
      int var3 = var0 ^ 337555842;
      char[] var4 = IIII[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1415027935;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 14;
            case 1 -> 19;
            case 2 -> 80;
            case 3 -> 126;
            case 4 -> 209;
            case 5 -> 160;
            case 6 -> 160;
            case 7 -> 89;
            case 8 -> 27;
            case 9 -> 170;
            case 10 -> 144;
            case 11 -> 111;
            case 12 -> 224;
            case 13 -> 88;
            case 14 -> 29;
            case 15 -> 197;
            case 16 -> 242;
            case 17 -> 11;
            case 18 -> 76;
            case 19 -> 254;
            case 20 -> 19;
            case 21 -> 141;
            case 22 -> 33;
            case 23 -> 26;
            case 24 -> 241;
            case 25 -> 19;
            case 26 -> 229;
            case 27 -> 159;
            case 28 -> 216;
            case 29 -> 25;
            case 30 -> 53;
            case 31 -> 22;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public int lIllll() {
      return lIII(-1786129133, -295072205 ^ 1425848249);
   }

   private boolean ll(class_310 var1) {
      return this.IIlI(var1);
   }

   private static boolean III(class_310 var0, class_3966 var1) {
      IIll.IlI();

      boolean var2;
      try {
         IIll.IIlIlIl(var0);
         var2 = IIll.lIlIIl(var0, var1);
      } finally {
         IIll.lIl();
      }

      return var2;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 797168015;
      String[] var10000 = new String[2];
      short var18 = 1999;
      int var16 = 0;
      String[] var15 = var10000;
      int var17 = 0;
      int var14 = "'⥯䈻⧦쉂⧋ȟ⠋舗⫆Ɇ⣿ȹ⫇ȟ⮢䉾⯓ȣ⬇숪⩎䉞⨋ș⥗䈓⣶䉌⥧舂⭓숔⧚ɸ⩓䈕⡇舁⦖qވヨЁ낫߈\uf0eaߴム۩낿ք\uf0dbل냛ԝケߜフ\u0558냚ץ\uf084ݨ\uf0c2Ӹ\uf0dfەウ݈냮ڼヴљ\u3097߀ブߔ\uf0deѕ炲Ր\uf0daӸ냌ߥカט烧ְ\uf0f7ұ낋\u0558ワ܀냥Ѝ\uf0bbټ냾ش\uf0eeە炖Ԁ냱Ԩ\uf0e3ҕ炦ؔ냱ݨバ҅낁ؠ烀И냿١炀׀ニ\u07bc냂ܹ炮Ԍ냼ިナک\uf080ߜ\uf0f1Ҥ\uf0e5܍낤Ґダِ烻ݵ낪Ф\uf0d8҄ハڥゐݐ"
         .length();
      String var13 = "'⥯䈻⧦쉂⧋ȟ⠋舗⫆Ɇ⣿ȹ⫇ȟ⮢䉾⯓ȣ⬇숪⩎䉞⨋ș⥗䈓⣶䉌⥧舂⭓숔⧚ɸ⩓䈕⡇舁⦖qވヨЁ낫߈\uf0eaߴム۩낿ք\uf0dbل냛ԝケߜフ\u0558냚ץ\uf084ݨ\uf0c2Ӹ\uf0dfەウ݈냮ڼヴљ\u3097߀ブߔ\uf0deѕ炲Ր\uf0daӸ냌ߥカט烧ְ\uf0f7ұ낋\u0558ワ܀냥Ѝ\uf0bbټ냾ش\uf0eeە炖Ԁ냱Ԩ\uf0e3ҕ炦ؔ냱ݨバ҅낁ؠ烀И냿١炀׀ニ\u07bc냂ܹ炮Ԍ냼ިナک\uf080ߜ\uf0f1Ҥ\uf0e5܍낤Ґダِ烻ݵ낪Ф\uf0d8҄ハڥゐݐ";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 195;
               case 1 -> 169;
               case 2 -> 154;
               case 3 -> 221;
               case 4 -> 239;
               case 5 -> 154;
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

      IIII = var15;
      IIIl = new Object[var15.length];
      int var9 = -907525848;
      byte[] var7 = "tbÒ·yL\u009a\u0018l\u0003¤^ºoôvã\u0013ßd\u0007q%Ü5à\u0017º\u009eÒ(¬\u009b3u©\u00adøÁ\u009f~áÎÀní{\u00adÚ¢î7\r\u0007Êx\u0019\nIH\u0095å\u000fcU\u0011ä\u001bA\u0090\u00924 ù³èI\u008d\u0089H\u0013Ü\u008eÜ½ta;\u0015R\u008eß÷b\u007f=è#å\n¬\u001fCq/É\r¢Å5\u008fÒC 7v\u008c`ÏÚÀ<Ò\u008bUGî\u009f!\u0096¾s¶yO\u0094Þ²J\u0011£>YûÅÛcÄÙô~£g&:¤\u001dÂ\u0001\t¶VÒ\"dpÊ\u001d\u001b\u0005Ójú\u0017Ù\fÞù\u0098cÁ|Yã)iÇÀ=²ýsÙÙ\\ìA\u001c2âæÆþ¾Ù¥ë¦'â^Î4o\u0089½C¦ù \u0093¹\\2[\u0007Àµ\u001eó\u000f\u008fÎËÚ\u001fþ\t4÷WÜ\u0010\"êÉËxÃÉ\u0098!¢(Õ«l\u0081\u0013\u0089¯õ\u0017#\u0010FÎå\u0094ò,0\u009d$ê,\u009e\u0017\u0082\u008aR9µ \u0003\u0091Í©\u0003Yá\u008eáö£~\u0080Æu½d5¯væÛµd¸ûÜ\u0097Ç9m2\u0007°\u0006Àx`\u0086ö\u000e\u0007Òe´\u0001¶+¼\u000evQ\u009f\u008eç\u0001éJ¢eî Ät¸Þ¶\u0084\u0018ÿ\u0005M©¡Ö\u00131ÑG\u009dÚ¬%\t0_ç6øÇÊ1\u0017¯/á\u0016\fÁæ\u009b.C\u0002\u001d+\u0087\u008a\u0018uù¦8lõ#\u0014\u001ecc\"°\u0011\u0092\u0080[(\n\fýê\u008aLrÅ\u0084×;LÆ¼ÿ]\u0018\u0019Qä3TGg\u0098¹\u001f8\u008d5ä\u0099¶ç£ÈKnus'Ë\u009e\t2B\u008dÞ8\u0096Þ3\u0086Ö\u008a?¡Ç\\\u008cú\r!K\u0013ýÅÐ¡¢üÜ\u0004ÒÐB(\u0087\u001d>\u0011¿\u001fk*\u001e«)\u0017\u001e\u0091£É6( ½yÒìÑrË^´¥ÂîL9ÑþÚ±öZ\u009eÈA\u0098\u009b\nRo\u001b\u0092\u00062¼ü>ßß\u0095KQy÷ñ».CÍ:\b^\u0090ÊCw\u0093\u009fþ\u008d\u0080KW3+ÆB8\u007fÝ¢£»æTMË°0\u001e>ÿ\"\u009f5\u00150æ\u008d©\u000f\u0081ç\u0084\u009a´\u0083²ÎHþö\u001c\b~Ù¬æ·\u009cåæÄ\u0010ðÂ\u008c\u0090=\u0017\u0091\bç \u008f]\u008e\u001fô<¹\u0098N@H¯y=O!å\u0080ä\u0014\u008d2Q*5\b t?\u0016\u009a\u0082cà[\u0014ü|\u008bTÐ\u008c\u0098.\u008c\u0003Æ\u0003Õ\u008ff_ï\u0007¿½\u0001ÇE\u0084%×«\u001d]¡ìn¿\\ª×\u001dÖú\u009e±Wy\u0085ýò0ccf´\b°à\u0096¥\u0093\u0005\t\u0001Ö¡\u0095i\u0090\u0082µ\f\fdÈñ\u008fXï×§KNþ\u0013e\u0099kræ\u0093,)}ºîðNuZ¢\u0092~©P0£o\u001cÐe³¸©\u008ef\u0092ò÷6\u009aÁ97\u009d@\u001c\r\u008c)\u0096h[W¬ùëSµ\u001f/\u0002³7ó\u001cÍ\u0014\u0002\u0089ì\u0093Õ¦è\u008e(n/x\u009e®Ö\u0012©\u0082\n°&öd8js\u00907w\u001fÆâ÷\u001c\u0006*\u0006=KH$úV\u0013Çx1åFÄ\u0093\u0086À\u0080\u000f\u0099\u0098OÍj\u0082PÜ1\u001b\u001b\u001a·\u009aÛ\u0019W\u009d,QïÒ\u008c\u00978\tÐñ\u0087'Mà\u001bÎ÷°\u001f\u0098¾Ú¤O³\u001ei%\u009a'ØÁEÁ*:ü\u0094EÞ\u0013\u0086õ ;úacm\u0085j$\u001dã\u0099°\u0015Í\u0007\u000füc:÷\u0087\u0018ZºÐ\u0000\u0099vùµ/ÎL\u0001wè\u009d\u001f\u001f\u008dWY%f\u001cö~8ñ\u0002r\u009c%¾\u00ad³öuï¢O\u008cÓ«¬ô\u0091\u0002ê\u0015K\u0001T$Ò\u009aVµ\u001966\u001c\u009fÌZ\u0091fò&ã5¸\tZ,v[9\u0084óçí|\u000fÒE@\u0086[Ç\u0087ôü\u0099Åù¶\u0091a.B¢\u0014gÌ!\u007f7\u001f\u0017ËA\u008cu\u000bmä?ÊA!t©Q\u0001\u0081'\u008c¹\u0000B\u001e°dÓ\"øâä\u00897\u009eç¨\u0019\u008a\u0087\u009d\u0000\u0084ó\u008bè\u0006Vä\u0013\u0094Í\u0099}\u0002Þ\u001f\tÓ\u0081Æ\u00adÙª)O©:\u0081\u001c©\u008aâqg¾T\u0004;lÒË\u0081½aÕº\u0012à\u0004þö'\u0001BôÙs¥\u0002*jêãOµ\u0007¤µ(#\u0003\u0011 ¸\u008c\u001aÂÝ@ðÞO"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lIII(-1786129123, var23 ^ -125928529)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIIl(337555842, var23 ^ 1156554399)).length();
      int var1 = lIII(-1786129124, var23 ^ -179293969);
      int var25 = -1;

      label99:
      while (true) {
         int var29 = lIII(-1786129121, var23 ^ -534835507);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label94: {
               char[] var45 = var10001.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var29;
               var41 = var45;
               int var35 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var29;
                  var10006 = var6;
               } else {
                  var48 = var29;
                  var35 = var10004;
                  if (var10004 <= var6) {
                     break label94;
                  }

                  var57 = var45;
                  var10004 = var29;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lIII(-1786129125, var23 ^ -1174618435)) {
                     case 0 -> lIII(-1786129126, var23 ^ 315523593);
                     case 1 -> lIII(-1786129131, var23 ^ 389013248);
                     case 2 -> lIII(-1786129132, var23 ^ 568617214);
                     case 3 -> lIII(-1786129129, var23 ^ -218274772);
                     case 4 -> lIII(-1786129130, var23 ^ -487468348);
                     case 5 -> lIII(-1786129135, var23 ^ 1455309953);
                     default -> lIII(-1786129136, var23 ^ -2128912161);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var35 <= var6) {
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
                     llI = var5;
                     IIl = new String[lIII(-1786129128, var23 ^ -1955754815)];
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label99;
                  }

                  var4 = (var2 = lIIl(337555843, var23 ^ -1886418222)).length();
                  var1 = lIII(-1786129122, var23 ^ 913530147);
                  var25 = -1;
            }

            var29 = lIII(-1786129127, var23 ^ 1863284172);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private boolean IIl(class_310 var1, class_1297 var2) {
      if (this.Ill != null) {
         return this.Ill == var2;
      } else {
         int var3 = this.IIIl(var1);
         if (var3 < 0) {
            return false;
         } else {
            this.lIl = var3;
            this.Ill = (class_1309)var2;
            this.Il = false;
            this.IlI = lIII(-1786129134, 662849043 ^ -1846005266);
            this.lII = System.currentTimeMillis() + Math.round(Math.max(0.0, this.ll.IllI()));
            return true;
         }
      }
   }

   private boolean Ill(class_310 var1, class_3966 var2) {
      return var1 != null
         && var1.field_1724 != null
         && this.Ill != null
         && var2 != null
         && var2.method_17782() == this.Ill
         && var2.method_17784() != null
         && var1.field_1724.method_33571().method_1022(var2.method_17784()) <= 3.0001;
   }

   private boolean lII(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         class_1799 var2 = var1.field_1724.method_6047();
         return var2 != null && !var2.method_7960()
            ? class_7923.field_41178
               .method_10221(var2.method_7909())
               .method_12832()
               .endsWith(IlIIllIII.lI(l(lIII(-1786129139, -1119747079 ^ 1271693825), lIII(-1786129140, -1119747079 ^ 1598927927))))
            : false;
      } else {
         return false;
      }
   }

   private static String l(int var0, int var1) {
      int var9 = 724394123;
      int var2 = (var0 ^ lIII(-1786129137, var9 ^ 676050562)) & lIII(-1786129138, var9 ^ -1052850314);
      if (IIl[var2] == null) {
         char[] var3 = llI[var2].toCharArray();

         int var4 = switch (var3[0] & lIII(-1786129143, var9 ^ -1687251483)) {
            case 0 -> lIII(-1786129144, var9 ^ 902199936);
            case 1 -> lIII(-1786129141, var9 ^ -1646225780);
            case 2 -> lIII(-1786129142, var9 ^ 2144364054);
            case 3 -> lIII(-1786129147, var9 ^ 1620180293);
            case 4 -> lIII(-1786129148, var9 ^ 615340055);
            case 5 -> lIII(-1786129145, var9 ^ -1485105593);
            case 6 -> lIII(-1786129146, var9 ^ 1300730988);
            case 7 -> lIII(-1786129151, var9 ^ -879612377);
            case 8 -> lIII(-1786129152, var9 ^ 80926624);
            case 9 -> lIII(-1786129149, var9 ^ 1217317297);
            case 10 -> lIII(-1786129150, var9 ^ -571083410);
            case 11 -> lIII(-1786129091, var9 ^ -1457215630);
            case 12 -> lIII(-1786129092, var9 ^ 1053513695);
            case 13 -> lIII(-1786129089, var9 ^ 1442861658);
            case 14 -> lIII(-1786129090, var9 ^ 730611939);
            case 15 -> lIII(-1786129095, var9 ^ 1298758576);
            case 16 -> lIII(-1786129096, var9 ^ 1363568340);
            case 17 -> lIII(-1786129093, var9 ^ -275504773);
            case 18 -> lIII(-1786129094, var9 ^ -1787815245);
            case 19 -> lIII(-1786129099, var9 ^ 1055181317);
            case 20 -> lIII(-1786129100, var9 ^ -322776670);
            case 21 -> lIII(-1786129097, var9 ^ -1816671459);
            case 22 -> lIII(-1786129098, var9 ^ 1923465897);
            case 23 -> lIII(-1786129103, var9 ^ 1447789545);
            case 24 -> lIII(-1786129104, var9 ^ 1238253964);
            case 25 -> lIII(-1786129101, var9 ^ -1579426769);
            case 26 -> lIII(-1786129102, var9 ^ -1258232089);
            case 27 -> lIII(-1786129107, var9 ^ 1365984659);
            case 28 -> lIII(-1786129108, var9 ^ -911333034);
            case 29 -> lIII(-1786129105, var9 ^ 1853154676);
            case 30 -> lIII(-1786129106, var9 ^ 1360524239);
            case 31 -> lIII(-1786129111, var9 ^ -1353693811);
            case 32 -> lIII(-1786129112, var9 ^ -1126329846);
            case 33 -> lIII(-1786129109, var9 ^ -887823801);
            case 34 -> lIII(-1786129110, var9 ^ 453724113);
            case 35 -> lIII(-1786129115, var9 ^ -743056515);
            case 36 -> lIII(-1786129116, var9 ^ -1774119860);
            case 37 -> lIII(-1786129113, var9 ^ 1182384516);
            case 38 -> 5;
            case 39 -> 1;
            case 40 -> lIII(-1786129114, var9 ^ 1991978379);
            case 41 -> lIII(-1786129119, var9 ^ -546436784);
            case 42 -> lIII(-1786129120, var9 ^ 1652281513);
            case 43 -> lIII(-1786129117, var9 ^ 1266385882);
            case 44 -> lIII(-1786129118, var9 ^ 714788255);
            case 45 -> lIII(-1786129059, var9 ^ -466417663);
            case 46 -> lIII(-1786129060, var9 ^ 658967778);
            case 47 -> lIII(-1786129057, var9 ^ -1728784733);
            case 48 -> lIII(-1786129058, var9 ^ 473969791);
            case 49 -> lIII(-1786129063, var9 ^ 362214001);
            case 50 -> 0;
            case 51 -> lIII(-1786129064, var9 ^ 379951584);
            case 52 -> lIII(-1786129061, var9 ^ -628380080);
            case 53 -> lIII(-1786129062, var9 ^ -1960586028);
            case 54 -> lIII(-1786129067, var9 ^ -1947469198);
            case 55 -> lIII(-1786129068, var9 ^ 1766111248);
            case 56 -> lIII(-1786129065, var9 ^ 141848092);
            case 57 -> lIII(-1786129066, var9 ^ -326650670);
            case 58 -> lIII(-1786129071, var9 ^ 1852419795);
            case 59 -> lIII(-1786129072, var9 ^ 810141521);
            case 60 -> lIII(-1786129069, var9 ^ 1334539322);
            case 61 -> lIII(-1786129070, var9 ^ -1895686526);
            case 62 -> lIII(-1786129075, var9 ^ -254632591);
            case 63 -> lIII(-1786129076, var9 ^ -2034906625);
            case 64 -> lIII(-1786129073, var9 ^ 1018408794);
            case 65 -> lIII(-1786129074, var9 ^ 884764037);
            case 66 -> lIII(-1786129079, var9 ^ 389873479);
            case 67 -> lIII(-1786129080, var9 ^ 1643690412);
            case 68 -> lIII(-1786129077, var9 ^ 1720900723);
            case 69 -> lIII(-1786129078, var9 ^ 812428936);
            case 70 -> lIII(-1786129083, var9 ^ -1873993998);
            case 71 -> lIII(-1786129084, var9 ^ 554946010);
            case 72 -> lIII(-1786129081, var9 ^ -1184669791);
            case 73 -> lIII(-1786129082, var9 ^ 1377713867);
            case 74 -> lIII(-1786129087, var9 ^ -1192362997);
            case 75 -> lIII(-1786129088, var9 ^ 1886769663);
            case 76 -> lIII(-1786129085, var9 ^ -1625476039);
            case 77 -> lIII(-1786129086, var9 ^ -1631659897);
            case 78 -> lIII(-1786129027, var9 ^ 329014031);
            case 79 -> lIII(-1786129028, var9 ^ -1785094230);
            case 80 -> lIII(-1786129025, var9 ^ -1865948555);
            case 81 -> lIII(-1786129026, var9 ^ -1327567147);
            case 82 -> lIII(-1786129031, var9 ^ -1666417836);
            case 83 -> lIII(-1786129032, var9 ^ -1442706885);
            case 84 -> lIII(-1786129029, var9 ^ 149500827);
            case 85 -> lIII(-1786129030, var9 ^ -2075135601);
            case 86 -> lIII(-1786129035, var9 ^ -993993516);
            case 87 -> lIII(-1786129036, var9 ^ 1602836345);
            case 88 -> lIII(-1786129033, var9 ^ 877479574);
            case 89 -> lIII(-1786129034, var9 ^ -1847328825);
            case 90 -> lIII(-1786129039, var9 ^ -587891672);
            case 91 -> lIII(-1786129040, var9 ^ 833430366);
            case 92 -> lIII(-1786129037, var9 ^ -1118403974);
            case 93 -> lIII(-1786129038, var9 ^ 1863439184);
            case 94 -> lIII(-1786129043, var9 ^ -423138465);
            case 95 -> lIII(-1786129044, var9 ^ 1126961725);
            case 96 -> lIII(-1786129041, var9 ^ -901790305);
            case 97 -> lIII(-1786129042, var9 ^ 510404718);
            case 98 -> lIII(-1786129047, var9 ^ 1580738534);
            case 99 -> lIII(-1786129048, var9 ^ 1341035654);
            case 100 -> lIII(-1786129045, var9 ^ -2053943156);
            case 101 -> 3;
            case 102 -> lIII(-1786129046, var9 ^ 1970785141);
            case 103 -> lIII(-1786129051, var9 ^ 709805953);
            case 104 -> lIII(-1786129052, var9 ^ 1516394879);
            case 105 -> lIII(-1786129049, var9 ^ 263136819);
            case 106 -> lIII(-1786129050, var9 ^ 934113456);
            case 107 -> lIII(-1786129055, var9 ^ -1776733889);
            case 108 -> lIII(-1786129056, var9 ^ -1776044002);
            case 109 -> lIII(-1786129053, var9 ^ -1097156395);
            case 110 -> lIII(-1786129054, var9 ^ -245303446);
            case 111 -> lIII(-1786128995, var9 ^ -92715591);
            case 112 -> lIII(-1786128996, var9 ^ 762377890);
            case 113 -> lIII(-1786128993, var9 ^ -1318853343);
            case 114 -> lIII(-1786128994, var9 ^ 960774728);
            case 115 -> lIII(-1786128999, var9 ^ 1089700815);
            case 116 -> lIII(-1786129000, var9 ^ -2099219364);
            case 117 -> lIII(-1786128997, var9 ^ 448014807);
            case 118 -> lIII(-1786128998, var9 ^ 1955382418);
            case 119 -> lIII(-1786129003, var9 ^ 502876893);
            case 120 -> lIII(-1786129004, var9 ^ 2135138395);
            case 121 -> lIII(-1786129001, var9 ^ -880860799);
            case 122 -> lIII(-1786129002, var9 ^ -702360875);
            case 123 -> lIII(-1786129007, var9 ^ -14580558);
            case 124 -> lIII(-1786129008, var9 ^ 87183438);
            case 125 -> lIII(-1786129005, var9 ^ -1147544252);
            case 126 -> lIII(-1786129006, var9 ^ -1328692211);
            case 127 -> lIII(-1786129011, var9 ^ 722075293);
            case 128 -> lIII(-1786129012, var9 ^ -981882713);
            case 129 -> lIII(-1786129009, var9 ^ -1769151476);
            case 130 -> lIII(-1786129010, var9 ^ 394726859);
            case 131 -> lIII(-1786129015, var9 ^ 1849668056);
            case 132 -> lIII(-1786129016, var9 ^ 156605540);
            case 133 -> lIII(-1786129013, var9 ^ 1009887525);
            case 134 -> lIII(-1786129014, var9 ^ -1068700384);
            case 135 -> lIII(-1786129019, var9 ^ -2134064508);
            case 136 -> lIII(-1786129020, var9 ^ 1845856087);
            case 137 -> lIII(-1786129017, var9 ^ 1853229928);
            case 138 -> lIII(-1786129018, var9 ^ 1245612834);
            case 139 -> lIII(-1786129023, var9 ^ -1625091101);
            case 140 -> lIII(-1786129024, var9 ^ -1472379867);
            case 141 -> lIII(-1786129021, var9 ^ -1757010010);
            case 142 -> lIII(-1786129022, var9 ^ 284974079);
            case 143 -> lIII(-1786128963, var9 ^ 667624992);
            case 144 -> lIII(-1786128964, var9 ^ -1453876341);
            case 145 -> lIII(-1786128961, var9 ^ -1673582294);
            case 146 -> lIII(-1786128962, var9 ^ -1568206071);
            case 147 -> lIII(-1786128967, var9 ^ -57864885);
            case 148 -> lIII(-1786128968, var9 ^ 181533598);
            case 149 -> lIII(-1786128965, var9 ^ -1672583238);
            case 150 -> lIII(-1786128966, var9 ^ -597518459);
            case 151 -> lIII(-1786128971, var9 ^ -1505879170);
            case 152 -> lIII(-1786128972, var9 ^ -1956145958);
            case 153 -> lIII(-1786128969, var9 ^ -681763056);
            case 154 -> lIII(-1786128970, var9 ^ 900979752);
            case 155 -> lIII(-1786128975, var9 ^ 211274927);
            case 156 -> lIII(-1786128976, var9 ^ -1779451209);
            case 157 -> lIII(-1786128973, var9 ^ -435338152);
            case 158 -> lIII(-1786128974, var9 ^ 1605356943);
            case 159 -> 2;
            case 160 -> lIII(-1786128979, var9 ^ 369315805);
            case 161 -> lIII(-1786128980, var9 ^ 223340897);
            case 162 -> lIII(-1786128977, var9 ^ -338592356);
            case 163 -> lIII(-1786128978, var9 ^ -2147288088);
            case 164 -> lIII(-1786128983, var9 ^ 757145175);
            case 165 -> lIII(-1786128984, var9 ^ -1989887234);
            case 166 -> lIII(-1786128981, var9 ^ -517826075);
            case 167 -> lIII(-1786128982, var9 ^ -2067891101);
            case 168 -> lIII(-1786128987, var9 ^ 2034058200);
            case 169 -> lIII(-1786128988, var9 ^ 1595232296);
            case 170 -> lIII(-1786128985, var9 ^ 1990295210);
            case 171 -> lIII(-1786128986, var9 ^ -473891494);
            case 172 -> lIII(-1786128991, var9 ^ -1533319674);
            case 173 -> lIII(-1786128992, var9 ^ 1715623279);
            case 174 -> lIII(-1786128989, var9 ^ -770668173);
            case 175 -> lIII(-1786128990, var9 ^ 568470498);
            case 176 -> lIII(-1786128931, var9 ^ -407975032);
            case 177 -> lIII(-1786128932, var9 ^ 990556918);
            case 178 -> lIII(-1786128929, var9 ^ -299832851);
            case 179 -> lIII(-1786128930, var9 ^ -1104618969);
            case 180 -> lIII(-1786128935, var9 ^ -1087415446);
            case 181 -> lIII(-1786128936, var9 ^ -2059521502);
            case 182 -> lIII(-1786128933, var9 ^ -521581504);
            case 183 -> lIII(-1786128934, var9 ^ 1901676749);
            case 184 -> lIII(-1786128939, var9 ^ -1751311975);
            case 185 -> lIII(-1786128940, var9 ^ -1086257244);
            case 186 -> lIII(-1786128937, var9 ^ -1666150382);
            case 187 -> lIII(-1786128938, var9 ^ 459783513);
            case 188 -> lIII(-1786128943, var9 ^ 110785803);
            case 189 -> lIII(-1786128944, var9 ^ -265505189);
            case 190 -> lIII(-1786128941, var9 ^ -1709466941);
            case 191 -> lIII(-1786128942, var9 ^ 949284764);
            case 192 -> lIII(-1786128947, var9 ^ -1327994821);
            case 193 -> lIII(-1786128948, var9 ^ -1077606821);
            case 194 -> lIII(-1786128945, var9 ^ 1782908795);
            case 195 -> lIII(-1786128946, var9 ^ -1565252439);
            case 196 -> lIII(-1786128951, var9 ^ -1063853805);
            case 197 -> lIII(-1786128952, var9 ^ -1686806079);
            case 198 -> lIII(-1786128949, var9 ^ 1844763767);
            case 199 -> lIII(-1786128950, var9 ^ 242391525);
            case 200 -> lIII(-1786128955, var9 ^ 287987462);
            case 201 -> lIII(-1786128956, var9 ^ -500151311);
            case 202 -> lIII(-1786128953, var9 ^ -1180106647);
            case 203 -> lIII(-1786128954, var9 ^ 1059635251);
            case 204 -> lIII(-1786128959, var9 ^ -550554167);
            case 205 -> lIII(-1786128960, var9 ^ 1734382620);
            case 206 -> lIII(-1786128957, var9 ^ -1329869908);
            case 207 -> lIII(-1786128958, var9 ^ 261445348);
            case 208 -> lIII(-1786128899, var9 ^ -1820529411);
            case 209 -> lIII(-1786128900, var9 ^ -1758812797);
            case 210 -> lIII(-1786128897, var9 ^ 754821232);
            case 211 -> lIII(-1786128898, var9 ^ -510164274);
            case 212 -> lIII(-1786128903, var9 ^ 1349738054);
            case 213 -> lIII(-1786128904, var9 ^ -1568086994);
            case 214 -> lIII(-1786128901, var9 ^ -848557527);
            case 215 -> lIII(-1786128902, var9 ^ 2106729023);
            case 216 -> lIII(-1786128907, var9 ^ -372148983);
            case 217 -> lIII(-1786128908, var9 ^ -493484517);
            case 218 -> lIII(-1786128905, var9 ^ 285347566);
            case 219 -> lIII(-1786128906, var9 ^ -1883379724);
            case 220 -> lIII(-1786128911, var9 ^ -1304060905);
            case 221 -> lIII(-1786128912, var9 ^ -771176027);
            case 222 -> lIII(-1786128909, var9 ^ 298115413);
            case 223 -> lIII(-1786128910, var9 ^ -1485023405);
            case 224 -> lIII(-1786128915, var9 ^ -10844516);
            case 225 -> lIII(-1786128916, var9 ^ -1757459363);
            case 226 -> lIII(-1786128913, var9 ^ -1378613354);
            case 227 -> lIII(-1786128914, var9 ^ -158668153);
            case 228 -> lIII(-1786128919, var9 ^ -97632615);
            case 229 -> lIII(-1786128920, var9 ^ 620883903);
            case 230 -> lIII(-1786128917, var9 ^ 1729124132);
            case 231 -> lIII(-1786128918, var9 ^ 1528412096);
            case 232 -> lIII(-1786128923, var9 ^ 431026474);
            case 233 -> lIII(-1786128924, var9 ^ -1011658843);
            case 234 -> lIII(-1786128921, var9 ^ 1512590840);
            case 235 -> lIII(-1786128922, var9 ^ -1853608683);
            case 236 -> lIII(-1786128927, var9 ^ 394150403);
            case 237 -> lIII(-1786128928, var9 ^ -297779371);
            case 238 -> lIII(-1786128925, var9 ^ -1123413504);
            case 239 -> lIII(-1786128926, var9 ^ -1530642269);
            case 240 -> lIII(-1786129379, var9 ^ 205651924);
            case 241 -> lIII(-1786129380, var9 ^ -188888562);
            case 242 -> lIII(-1786129377, var9 ^ -936099159);
            case 243 -> lIII(-1786129378, var9 ^ 256304687);
            case 244 -> lIII(-1786129383, var9 ^ 1296805043);
            case 245 -> lIII(-1786129384, var9 ^ -375629767);
            case 246 -> lIII(-1786129381, var9 ^ -1663707881);
            case 247 -> lIII(-1786129382, var9 ^ -142277149);
            case 248 -> lIII(-1786129387, var9 ^ 1140037329);
            case 249 -> lIII(-1786129388, var9 ^ -2082472671);
            case 250 -> lIII(-1786129385, var9 ^ 1123236763);
            case 251 -> 4;
            case 252 -> lIII(-1786129386, var9 ^ 568531962);
            case 253 -> lIII(-1786129391, var9 ^ -1354849499);
            case 254 -> lIII(-1786129392, var9 ^ -894654372);
            default -> lIII(-1786129389, var9 ^ 1536221758);
         };
         int var5 = (var1 & lIII(-1786129390, var9 ^ 1815817660)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIII(-1786129395, var9 ^ 1864062647)) >>> lIII(-1786129396, var9 ^ 254745191)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIII(-1786129393, var9 ^ 2067395129);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIII(-1786129394, var9 ^ -564786774);
            }
         }

         IIl[var2] = new String(var3).intern();
      }

      return IIl[var2];
   }

   public boolean lIl(class_1309 var1) {
      return this.Ill != null && var1 != null && this.Ill == var1;
   }

   @Override
   public void IllIll(class_310 var1) {
      this.IllI(var1);
   }

   public boolean llI(class_310 var1, class_1309 var2) {
      if (this.Ill != null) {
         return this.Ill == var2;
      } else {
         return !this.lI(var1, var2) ? false : this.IIl(var1, var2);
      }
   }

   private class_3966 lll(class_310 var1) {
      if (var1 != null && var1.field_1724 != null && this.Ill != null) {
         class_3966 var2 = var1.field_1765 instanceof class_3966 var3 ? var3 : null;
         if (this.Ill(var1, var2)) {
            return var2;
         } else {
            class_3966 var5 = IIll.lIlll(var1, 3.0);
            if (this.Ill(var1, var5)) {
               return var5;
            } else {
               return IlllIlII.l(var1, this.Ill, 3.0) ? new class_3966(this.Ill) : null;
            }
         }
      } else {
         return null;
      }
   }

   private boolean IIII(class_1799 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 != null && !var1.method_7960()) {
         class_9304 var3 = (class_9304)var1.method_58695(class_9334.field_49633, class_9304.field_49385);

         for (class_6880 var5 : var3.method_57534()) {
            if (var5 != null) {
               String var6 = var5.method_40230().map(lIIlllII::IlIl).orElse("");
               if (IlIIllIII.lI(l(lIII(-1786129399, 1543043044 ^ 905899548), lIII(-1786129400, 1543043044 ^ -645446540))).equals(var6)
                  && var3.method_57536(var5) > 0) {
                  return true;
               }

               if (var2 != null) {
                  break;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private int IIIl(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 != null && var1.field_1724 != null) {
         int var3 = IIll.IIlII(var1.field_1724.method_31548());
         if (var3 >= 0 && var3 < lIII(-1786129397, -1671720863 ^ -1107146794) && this.Il(var1.field_1724.method_31548().method_5438(var3))) {
            return var3;
         } else {
            int var4 = 0;

            while (var4 < lIII(-1786129398, -1671720863 ^ -1779587673)) {
               class_1799 var5 = var1.field_1724.method_31548().method_5438(var4);
               if (this.Il(var5)) {
                  return var4;
               }

               var4++;
               if (var2 != null) {
                  break;
               }
            }

            return -1;
         }
      } else {
         return -1;
      }
   }

   private static int lIII(int var0, int var1) {
      int var2 = lll[var0 ^ -1786129123] ^ var1 ^ var0;
      var2 ^= 11599;
      var2 += 48579;
      var2 -= 7768;
      var2 ^= 55500;
      var2 += 24349;
      var2 ^= 63320;
      var2 -= 54512;
      return var2 ^ 6911;
   }

   private boolean IIlI(class_310 var1) {
      class_3966 var2 = this.lll(var1);
      if (!this.IIIIlIl() || this.Ill == null || var2 == null || var2.method_17782() != this.Ill) {
         this.Illl(var1);
         return false;
      } else if (IIll.lIIIll(var1, this.Ill)) {
         this.Il = false;
         this.IlI = lIII(-1786129403, -1920303006 ^ -1802181310);
         return false;
      } else {
         int var3 = this.lIl;
         boolean var4 = false;
         IIll.IlIlI(true);

         try {
            var4 = IIll.lllIII(var1, this, var3, lIIlllII::III);
         } finally {
            IIll.IlIlI(false);
            this.Illl(var1);
         }

         return var4;
      }
   }

   @Override
   public void IIIlIll(class_1297 var1, int var2) {
      if (var2 == 0 || var2 == 3) {
         class_310 var3 = class_310.method_1551();
         if (this.I(var3) && this.IlII(var3, var1)) {
            if (this.lI(var3, var1)) {
               this.IIl(var3, var1);
            }
         }
      }
   }

   public boolean IIll() {
      return this.Ill != null;
   }

   private boolean IlII(class_310 var1, class_1297 var2) {
      return var1 != null && var2 != null && var1.field_1765 instanceof class_3966 var3 && var3.method_17782() == var2;
   }

   private static String IlIl(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   private void IllI(class_310 var1) {
      if (this.Ill != null) {
         if (this.Il) {
            if (var1 != null && var1.field_1724 != null && var1.field_1724.field_6012 <= this.IlI) {
               return;
            }

            this.Il = false;
            this.IlI = lIII(-1786129404, 1560965634 ^ -193496339);
         }

         if (var1 != null
            && var1.field_1724 != null
            && var1.field_1687 != null
            && var1.field_1761 != null
            && var1.field_1755 == null
            && this.Ill.method_5805()
            && var1.field_1687.method_8469(this.Ill.method_5628()) == this.Ill) {
            class_3966 var2 = this.lll(var1);
            if (var2 == null) {
               this.Illl(var1);
            } else if (System.currentTimeMillis() >= this.lII) {
               float[] var3 = IlllIlII.lIII(var1, var2.method_17784());
               if (var3 == null) {
                  this.Illl(var1);
               } else {
                  this.Il = IlllIlII.IIII(var1, lIII(-1786129401, 1560965634 ^ 1086393512), var3[0], var3[1], this::ll);
                  this.IlI = this.Il ? var1.field_1724.field_6012 + 2 : lIII(-1786129402, 1560965634 ^ 306692105);
               }
            }
         } else {
            this.Illl(var1);
         }
      }
   }

   public lIIlllII() {
      int var1 = -257209868;
      super(
         IlIIllIII.Ill(l(lIII(-1786129407, var1 ^ -296355678), lIII(-1786129408, var1 ^ -1104500885))),
         lllIIlIl.I,
         IlIIllIII.Ill(l(lIII(-1786129405, var1 ^ -1525470113), lIII(-1786129406, var1 ^ 1477610543)))
      );
      this.ll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(l(lIII(-1786129347, var1 ^ 1360938959), lIII(-1786129348, var1 ^ -1334108134))), 0.0, 0.0, 500.0, 5.0)
            .IIIl(IlIIllIII.Ill(l(lIII(-1786129345, var1 ^ -142539489), lIII(-1786129346, var1 ^ -1344610636))))
      );
      this.lIl = -1;
      this.IlI = lIII(-1786129351, var1 ^ 1596912284);
   }

   private void Illl(class_310 var1) {
      IIll.lllIl(var1, this, lllIII.II);
      this.Ill = null;
      this.lIl = -1;
      this.Il = false;
      this.IlI = lIII(-1786129352, -2089756983 ^ -534810318);
      this.lII = 0L;
   }
}
