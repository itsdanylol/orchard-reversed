package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1657;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_638;
import net.minecraft.class_239.class_240;

@Environment(EnvType.CLIENT)
public final class IIllIIIII extends IlIIIIIIl {
   private static final String[] I;
   private class_2338 II;
   private class_3965 Il;
   private boolean lI;
   private static final String[] lll;
   private final IIlIII ll;
   private static final int III = 20;
   private class_2338 IIl;
   private int IlI;
   private static final int Ill = 4;
   private int lII;
   private static final Object[] IIII;
   private static final int[] llI;
   private static final String[] lIl;

   private boolean I(class_310 var1, class_2338 var2, class_2680 var3) {
      return var2 != null && var3 != null && !var3.method_26215()
         ? var3.method_26212(var1.field_1687, var2) && var3.method_26227().method_15769() && !var3.method_26220(var1.field_1687, var2).method_1110()
         : false;
   }

   public boolean l() {
      return this.lI;
   }

   private boolean II(class_310 var1, class_2338 var2, class_3965 var3) {
      if (this.IIl(var1) && var2 != null) {
         class_2680 var4 = var1.field_1687.method_8320(var2);
         if (!var4.method_26215() && !var4.method_45474()) {
            return false;
         } else {
            int var5 = var1.field_1724.method_6047().method_31574(class_1802.field_23141)
               ? IIll.IIlII(var1.field_1724.method_31548())
               : this.lI(var1.field_1724, class_1802.field_23141);
            if (var5 >= 0 && var5 < IlII(181561862, -207454855 ^ -770263907)) {
               class_3965 var6 = this.lII(var1, var2, var3);
               if (var6 == null) {
                  return false;
               } else {
                  return var5 == IIll.IIlII(var1.field_1724.method_31548()) ? this.IIIl(var1, var6) : IIll.lllIII(var1, this, var5, this::IIlI);
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void Il() {
      this.II = null;
      this.Il = null;
      this.IlI = IlII(181561863, -1544816395 ^ -1170441577);
      this.lII = IlII(181561860, -1544816395 ^ -721937386);
   }

   private int lI(class_1657 var1, class_1792 var2) {
      String[] var3 = IIllllIl.IIIIl();
      if (var1 != null && var1.method_31548() != null) {
         int var4 = 0;

         while (var4 < IlII(181561861, 1180096693 ^ 487112677)) {
            if (var1.method_31548().method_5438(var4).method_31574(var2)) {
               return var4;
            }

            var4++;
            if (var3 != null) {
               break;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private static String IlIl(char var0, char var1, int var2) {
      int var3 = var1 ^ 32663;
      char[] var4 = lll[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIII[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIII[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 22132;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '胋';
         var10 += 58144;
         var10 -= 14421;
         var10 -= 44639;
         var10 -= 25191;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public void ll(class_310 var1, class_3965 var2) {
      this.lll(var1, class_1268.field_5808, var2);
   }

   public void III(class_310 var1, class_1268 var2, class_3965 var3, class_1269 var4) {
      class_2338 var5 = this.IIl;
      this.IIl = null;
      if (var5 != null && var3 != null && var5.equals(var3.method_17777()) && var4 != null && (var4.method_23665() || var4 == class_1269.field_5812)) {
         this.lll(var1, var2, var3);
      }
   }

   private boolean IIl(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var1.method_1562() != null
         && var1.field_1755 == null
         && var1.field_1724.method_5805()
         && !lIIIllII.ll(var1);
   }

   public void Ill(class_310 var1, class_1268 var2, class_3965 var3) {
      this.IIl = null;
      if (!this.lI
         && this.IIIIlIl()
         && this.IIl(var1)
         && var2 != null
         && var3 != null
         && var3.method_17783() == class_240.field_1332
         && !var1.field_1687.method_27983().equals(class_1937.field_25180)
         && !this.llI()) {
         class_2338 var4 = var3.method_17777();
         class_2680 var5 = var1.field_1687.method_8320(var4);
         if (var5.method_27852(class_2246.field_23152)
            && (Integer)var5.method_11654(class_4969.field_23153) > 0
            && !var1.field_1724.method_5998(var2).method_31574(class_1802.field_8801)) {
            this.IIl = var4.method_10062();
         }
      }
   }

   private class_3965 lII(class_310 var1, class_2338 var2, class_3965 var3) {
      String[] var4 = IIllllIl.IIIIl();
      if (var1 != null && var1.field_1687 != null && var2 != null) {
         class_638 var5 = var1.field_1687;
         class_2338 var6 = var2.method_10074();
         class_2680 var7 = var5.method_8320(var6);
         if (this.I(var1, var6, var7)) {
            class_243 var17 = new class_243(var2.method_10263() + 0.5, var2.method_10264(), var2.method_10260() + 0.5);
            return new class_3965(var17, class_2350.field_11036, var6, false);
         } else {
            class_2350[] var8 = new class_2350[]{
               class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034, class_2350.field_11036
            };

            for (class_2350 var12 : var8) {
               class_2338 var13 = var2.method_10093(var12);
               class_2680 var14 = var5.method_8320(var13);
               class_2350 var15 = var12.method_10153();
               if (this.I(var1, var13, var14)) {
                  class_243 var16 = new class_243(
                     var2.method_10263() + 0.5 + var12.method_10148() * 0.5,
                     var2.method_10264() + 0.5 + var12.method_10164() * 0.5,
                     var2.method_10260() + 0.5 + var12.method_10165() * 0.5
                  );
                  return new class_3965(var16, var15, var13, false);
               }

               if (var4 != null) {
                  break;
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   private boolean lIl() {
      double var1 = Math.max(0.0, Math.min(100.0, this.ll.IllI()));
      return var1 >= 100.0 || var1 > 0.0 && ThreadLocalRandom.current().nextDouble(100.0) < var1;
   }

   @Override
   public void llIl() {
      this.IIl = null;
      this.Il();
      this.lI = false;
   }

   private boolean llI() {
      IIIIIllII var1 = IIIIIllII.III();
      llIlII var2 = var1 != null && var1.II() != null ? var1.II().IIIlllI() : null;
      return var2 != null && var2.IIII();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1831021511;
      int var16 = 0;
      int var17 = 0;
      short var18 = 14183;
      int var14 = "i鎙릙静覛鳩禑錩㦟鍩즛鰩妓餉릕陉禜鷙\ue999鶉覓騩\ue995鈙妜鈉\ue996酉䦚鯙馝鎉ছ鞩馜鈙㦐雩ꦒ髩⦖顙⦥铉\u0992骹榒韩\ud991鶙ᦑ鲹\ud994钩漣鿩ᦗ鋹妗頉榖项ᦗ馩㦖雉禞騹\ud990鋙\ue99c郉榔鵉馟遙列鑙榐銉䦕隙증顩\ud990鱹禑鴹⦖鱉⦥餩覑鹹榗邙鍊闩\u0991鑹ꦒ鸙\ue996銹妖這\u0015ᕧ眔႗霖ቷ윞ᦗ眑ᛧ霛ዷ꜐᷇圖ᘗ윖ᭇ眥ᇗ\u171dᛇ"
         .length();
      String[] var15 = new String[2];
      String var13 = "i鎙릙静覛鳩禑錩㦟鍩즛鰩妓餉릕陉禜鷙\ue999鶉覓騩\ue995鈙妜鈉\ue996酉䦚鯙馝鎉ছ鞩馜鈙㦐雩ꦒ髩⦖顙⦥铉\u0992骹榒韩\ud991鶙ᦑ鲹\ud994钩漣鿩ᦗ鋹妗頉榖项ᦗ馩㦖雉禞騹\ud990鋙\ue99c郉榔鵉馟遙列鑙榐銉䦕隙증顩\ud990鱹禑鴹⦖鱉⦥餩覑鹹榗邙鍊闩\u0991鑹ꦒ鸙\ue996銹妖這\u0015ᕧ眔႗霖ቷ윞ᦗ眑ᛧ霛ዷ꜐᷇圖ᘗ윖ᭇ眥ᇗ\u171dᛇ";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << '\f') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> '\f') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lll = var15;
      IIII = new Object[var15.length];
      int var9 = 820620524;
      byte[] var7 = "äp3I\\\u0013xÇ2×\u001eE\u009e\u009a\u009dþH\u0014\u0095\u0005íÆ0SK\u0092C\fO\u0012¼ç{\u0085\u0099º\u009caL\u0089ëBÊm¿~Ý\u0099\u0089\u0016Á\u00945JÀÎ·cv\u0085#§m\u009f?P2âúj%\u0087Æ`%G\u0007³\u007f hâÍ\u0099ÀP%´c\u009bIhQýª¥îs}@¬ßð?0ûc\u0084\u009c-¨\u008fÝP\u0010z³ð,\u0087_}\u0004ío k\\\u0012Û\u009cÔÀ\u008a¥a-TnÌS%\u0093\u0017Ô\u0016+<\u009dz\u0090¶ºe\tN°íM\u0000s%æ\u0097\u0018*A\\QévqOrÒ\u0095úâèÂéOsÛ~þwØ\u001fNq·M¨þù\u0090Á\ne\u009e;k¢#z\u001aÓ \u0002\u0093kÕ\u0016\u0084\u001eôé\u0006^máq¼«ÿë\u009eÅþ\t\u0096\u000f\u000bÊäÏn>U\u0096²4í£µM\u008dµÍ%½Ùx·ÍÆ\u0087-\u0010ðôßz5£ë\u0096Û¨f\u0004\u0011#_tq [~¾¿Ð±÷'\u0000çõ\u0017\u001cÑa\u000eì\u0005 +\u0006¾þ+\u0086\u0016\u007fiç\rÄ^Øý·¨\u0095Ö¼8N7Fp\u009b!!.LÖ=\t>³Âe|\u0016ó¦#Pª\u001dó \u0015¡xý(D\fw:H\u001bü¿°%Â\u000eÈ?nKiþÓuL¢\\5Ð\u0012îÈ×\u0085<°Rb\u0084y\u0097Ê$ò\u0081Ý\u0003ô\u000b\u0083CWX;-\u000bb\u007f³\u0096\u0093·Ì0ëR|ÎÇàßàE\u0001¥\u0099\u0012Ø\u00034\u0019\bý·\u008f\u0018\u0098\u009bgÕ\u009cm\u008f\u000fÑ\u0015v\u000e\u009akS\u001bñ&#FwÏëm\u0005\u0018§¨ñ£\u001a\u00035&22Âp\u0086©+êËàzàöéVñ\u0092\\H<ºk(\u001cÃo\b\u0007\u0088«\u0013u\u009ffA3G\u0098EÏ³\u0017ú(ÞÉ³UûÕÉÕ®\u009f\u0081ð¢dy¶³Çc½ýßn\u008cè\u008dcfh·(c\u009a¯,.Ô|6\u000b\u0005Z¶ð\u0018èE|HdØ\u0093CÀt\u0095òö\u0017_\u0098\u0019,\u009ecâ«ô¹ýÛ5üi)Ý^o6»Í\u009fÉ4\"w½Át\u008aèóuM\nÍô\u0095Ö\u00adÀ\u0092ÇÅ\u00ad/ã\u009aÑË?Þ·ÁK1\u0014ùÓ»\u009aÖ3tÁø\u0010\u0098\u0010\u008aj\u0019áãöWÁ^ñ\r\u0004\u0015\u008aø\u009b¸Dûd\u0098\u008b\u0091,\u0084EË\u0007Ú¬|\u0013\u0086I\u001e\u009d\u0017\u0005R¯Ú\u0002\u0016DÒ(ôT£[\u0091%_æÃº]H\u0097ÃÁ~æ\u009fE¸oTf\u009b\u0099²é\u0086~÷`st>|6Ï\u0080¨s£þ*~\u0003xú\u0019h§¿û\u001bûýBÕ+7\u0080$&\u0087Ú0² [\u00104¨þ\u0003Øz»Ò~J\u00ad~\u0014:¸D\u009eßN\u008bÆ\u001e\u0002¨\u0011Ð§4q¨üÕ=9ÃÉ--\u00955\u001ah±|\u0089zÓÉ\u0017¿»E-6/\u009a\u00010^¦O¤ëÐ+5¸ã\u0094\u0005o`h2w¦ft\u009f{]Á\u009b>^\\\u0015\u001ec[VZµ#\u001cô\u007f\u008e\u000b#s\u0080uÂ\fF´Æ9~\u001câ¬\u001b\u0006\u0084±f\u008f¯öC| S\u0019çÌ8ªÄ\u0017{õ~\u0097zL\u0089æÅ\u009c\u0087ëF¢\u008f&L\u0014ù¹Ø£dÆ.\u00927ä¿\u009dÙ~sEd\u008dëõªÊÂöaº]\u001dM`rê\rÔ°vFñÝ\u008b¼¬×yÆ\u0015\u0007Ë\u0081·¿â ùÝ\u0001Ü\u009b|ã\u0090ô\u0099\u0019WÉí\u00ad\u0095ë¿âEGîç¥ì\u0013\u0010Ü\u0096nC\u000f´\u0015×Nù,?b^Q*óø}\u001e.\u008bÛ\u0011\u0014µdÕó$s¶\u0098{\u008fÚ\u008d\u0090))Ù¤zÂ\u0002u]Õnÿ\u0011#ý\u0010\u0085ÆÜ\\©òµ çN,p»\t\b±Tu\"±\u0012T ñ^9,±ïÍ9\u0017\u00110r\u0094}øÙ\u0007$\u0086¶ÌOTY[©ª\u0006Pó\u0002uy\u009b! Ö_W\u0010Ãý\"®\u0013S\u0011_\u0081ñ'v\u0088@fÅß,¼\u0018M©jìQh\nE.\u0019×Í;úÒ!éq¼s"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      llI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         llI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IlIl('炄', '羗', var23 ^ 2125396028)).length();
      int var1 = 4;
      int var25 = -1;

      label90:
      while (true) {
         int var10000 = IlII(181561858, var23 ^ 520927805);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label85: {
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
                     break label85;
                  }

                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % IlII(181561857, var23 ^ 403346042)) {
                     case 0 -> IlII(181561870, var23 ^ 748533584);
                     case 1 -> IlII(181561871, var23 ^ -881237485);
                     case 2 -> IlII(181561868, var23 ^ -1134893930);
                     case 3 -> IlII(181561869, var23 ^ -395906184);
                     case 4 -> IlII(181561866, var23 ^ -569446576);
                     case 5 -> IlII(181561867, var23 ^ 1649602541);
                     default -> IlII(181561864, var23 ^ -528787332);
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
                     I = var5;
                     lIl = new String[4];
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var47;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label90;
                  }

                  var4 = (var2 = IlIl('\u1775', '羖', var23 ^ -1323187479)).length();
                  var1 = IlII(181561859, var23 ^ -1159848249);
                  var25 = -1;
            }

            var10000 = IlII(181561856, var23 ^ 478834136);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private void lll(class_310 var1, class_1268 var2, class_3965 var3) {
      if (!this.lI
         && this.IIIIlIl()
         && this.IIl(var1)
         && var3 != null
         && var3.method_17783() == class_240.field_1332
         && !var1.field_1687.method_27983().equals(class_1937.field_25180)) {
         int var4 = var1.field_1724.method_6047().method_31574(class_1802.field_23141)
            ? IIll.IIlII(var1.field_1724.method_31548())
            : this.lI(var1.field_1724, class_1802.field_23141);
         if (var4 >= 0 && var4 < IlII(181561865, 1904518605 ^ -1746455824)) {
            class_2338 var5 = var3.method_17777();
            class_2680 var6 = var1.field_1687.method_8320(var5);
            if (!var6.method_27852(class_2246.field_23152) || (Integer)var6.method_11654(class_4969.field_23153) > 0) {
               if (this.lIl()) {
                  this.II = var5;
                  this.Il = var3;
                  this.IlI = var1.field_1724.field_6012 + 1;
                  this.lII = var1.field_1724.field_6012 + IlII(181561878, 1904518605 ^ -1961857649);
               }
            }
         }
      }
   }

   public void IIII(class_310 var1, class_1268 var2, class_3965 var3) {
   }

   private boolean IIIl(class_310 var1, class_3965 var2) {
      int var3 = IIll.IllIl(var1);
      this.lI = true;
      boolean var4 = false;

      boolean var5;
      try {
         var4 = IIll.IlIIII(var1, var2);
         var5 = var4;
      } finally {
         IIlllIllI.IlII(var1, var4 ? Math.max(var3, 4) : var3);
         this.lI = false;
      }

      return var5;
   }

   private static int IlII(int var0, int var1) {
      int var2 = llI[var0 ^ 181561862] ^ var1 ^ var0;
      var2 ^= 15679;
      var2 ^= 52390;
      var2 ^= 25959;
      var2 += 20650;
      var2 += 18472;
      var2 += 47758;
      var2 ^= 24261;
      return var2 ^ 41685;
   }

   @Override
   public String IlIIl() {
      return String.valueOf(Math.round(this.ll.IllI()));
   }

   public IIllIIIII() {
      int var1 = -815384505;
      super(
         IlIIllIII.Ill(IIll(IlII(181561879, var1 ^ -255313411), IlII(181561876, var1 ^ -859640691))),
         lllIIlIl.I,
         IlIIllIII.Ill(IIll(IlII(181561877, var1 ^ 219243483), IlII(181561874, var1 ^ 1648415715)))
      );
      this.ll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIll(IlII(181561875, var1 ^ -890095157), IlII(181561872, var1 ^ 1765528845))), 100.0, 0.0, 100.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIll(IlII(181561873, var1 ^ 1532999387), IlII(181561886, var1 ^ -455889256))))
      );
      this.IlI = IlII(181561887, var1 ^ 645739205);
      this.lII = IlII(181561884, var1 ^ -1168531075);
   }

   private boolean IIlI(class_310 var1, class_3965 var2) {
      return this.IIIl(var1, var2);
   }

   @Override
   public void IIlIl() {
      String[] var10000 = IIllllIl.IIIIl();
      class_310 var2 = class_310.method_1551();
      String[] var1 = var10000;
      if (this.IIIIlIl() && this.IIl(var2)) {
         if (this.Il != null) {
            if (var2.field_1724.field_6012 > this.lII) {
               this.Il();
               return;
            }

            if (var2.field_1724.field_6012 >= this.IlI) {
               class_2338 var3 = this.II;
               class_3965 var4 = this.Il;
               if (this.II(var2, var3, var4)) {
                  this.Il();
                  if (var1 == null) {
                     return;
                  }
               }

               this.IlI = var2.field_1724.field_6012 + 1;
            }
         }
      } else {
         this.Il();
      }
   }

   private static String IIll(int var0, int var1) {
      int var9 = -1637210129;
      int var2 = (var0 ^ IlII(181561885, var9 ^ -947672235)) & IlII(181561882, var9 ^ -2030054126);
      if (lIl[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & IlII(181561883, var9 ^ -396431122)) {
            case 0 -> IlII(181561880, var9 ^ 80992364);
            case 1 -> IlII(181561881, var9 ^ 873379830);
            case 2 -> IlII(181561894, var9 ^ 1232420994);
            case 3 -> IlII(181561895, var9 ^ -1692108491);
            case 4 -> IlII(181561892, var9 ^ 1996141509);
            case 5 -> IlII(181561893, var9 ^ 143347530);
            case 6 -> IlII(181561890, var9 ^ -1883703310);
            case 7 -> IlII(181561891, var9 ^ -959165433);
            case 8 -> IlII(181561888, var9 ^ -506735161);
            case 9 -> IlII(181561889, var9 ^ -347893756);
            case 10 -> IlII(181561902, var9 ^ 680213087);
            case 11 -> IlII(181561903, var9 ^ 1132764576);
            case 12 -> IlII(181561900, var9 ^ 172468772);
            case 13 -> IlII(181561901, var9 ^ 349965886);
            case 14 -> IlII(181561898, var9 ^ -1588841419);
            case 15 -> IlII(181561899, var9 ^ -1293832415);
            case 16 -> IlII(181561896, var9 ^ 626043718);
            case 17 -> IlII(181561897, var9 ^ 1155574976);
            case 18 -> IlII(181561910, var9 ^ 369500791);
            case 19 -> IlII(181561911, var9 ^ -881862786);
            case 20 -> IlII(181561908, var9 ^ -980043990);
            case 21 -> IlII(181561909, var9 ^ 2027210376);
            case 22 -> IlII(181561906, var9 ^ 2074890033);
            case 23 -> IlII(181561907, var9 ^ -1900521235);
            case 24 -> IlII(181561904, var9 ^ -1354245455);
            case 25 -> IlII(181561905, var9 ^ 911191366);
            case 26 -> IlII(181561918, var9 ^ -263112912);
            case 27 -> IlII(181561919, var9 ^ -1638869790);
            case 28 -> IlII(181561916, var9 ^ 1420105254);
            case 29 -> IlII(181561917, var9 ^ -1799298382);
            case 30 -> IlII(181561914, var9 ^ -853743447);
            case 31 -> IlII(181561915, var9 ^ -132411084);
            case 32 -> IlII(181561912, var9 ^ -295437842);
            case 33 -> IlII(181561913, var9 ^ -2099877098);
            case 34 -> IlII(181561926, var9 ^ -1658195678);
            case 35 -> IlII(181561927, var9 ^ -1420164562);
            case 36 -> IlII(181561924, var9 ^ 1846359975);
            case 37 -> IlII(181561925, var9 ^ -2147042673);
            case 38 -> IlII(181561922, var9 ^ 1250787939);
            case 39 -> IlII(181561923, var9 ^ 713983506);
            case 40 -> IlII(181561920, var9 ^ -451867572);
            case 41 -> IlII(181561921, var9 ^ -1400251266);
            case 42 -> IlII(181561934, var9 ^ -1363558287);
            case 43 -> IlII(181561935, var9 ^ 983576774);
            case 44 -> IlII(181561932, var9 ^ -75113852);
            case 45 -> IlII(181561933, var9 ^ -1517987059);
            case 46 -> IlII(181561930, var9 ^ 617036796);
            case 47 -> IlII(181561931, var9 ^ -1611659802);
            case 48 -> IlII(181561928, var9 ^ -335132383);
            case 49 -> IlII(181561929, var9 ^ -409562385);
            case 50 -> IlII(181561942, var9 ^ 501106586);
            case 51 -> IlII(181561943, var9 ^ 2055245911);
            case 52 -> IlII(181561940, var9 ^ 1722278556);
            case 53 -> IlII(181561941, var9 ^ -1714708136);
            case 54 -> IlII(181561938, var9 ^ -1475805655);
            case 55 -> IlII(181561939, var9 ^ -239915301);
            case 56 -> IlII(181561936, var9 ^ 1309648361);
            case 57 -> IlII(181561937, var9 ^ 1944768794);
            case 58 -> IlII(181561950, var9 ^ 1642514261);
            case 59 -> IlII(181561951, var9 ^ -467732182);
            case 60 -> IlII(181561948, var9 ^ 1432806392);
            case 61 -> IlII(181561949, var9 ^ 281486256);
            case 62 -> IlII(181561946, var9 ^ 786595631);
            case 63 -> IlII(181561947, var9 ^ 1853804456);
            case 64 -> IlII(181561944, var9 ^ -1820763761);
            case 65 -> IlII(181561945, var9 ^ -335757425);
            case 66 -> IlII(181561958, var9 ^ 574166726);
            case 67 -> IlII(181561959, var9 ^ -1456537191);
            case 68 -> IlII(181561956, var9 ^ -1348116525);
            case 69 -> IlII(181561957, var9 ^ 217507423);
            case 70 -> IlII(181561954, var9 ^ 1355588242);
            case 71 -> IlII(181561955, var9 ^ -851612829);
            case 72 -> IlII(181561952, var9 ^ 1799720790);
            case 73 -> IlII(181561953, var9 ^ -1788265033);
            case 74 -> IlII(181561966, var9 ^ -1142170476);
            case 75 -> IlII(181561967, var9 ^ -1027865230);
            case 76 -> IlII(181561964, var9 ^ 1874318768);
            case 77 -> IlII(181561965, var9 ^ -333331453);
            case 78 -> IlII(181561962, var9 ^ -1060566804);
            case 79 -> IlII(181561963, var9 ^ 908186416);
            case 80 -> IlII(181561960, var9 ^ 1322832401);
            case 81 -> IlII(181561961, var9 ^ 821937942);
            case 82 -> IlII(181561974, var9 ^ 2106432268);
            case 83 -> IlII(181561975, var9 ^ -1807371801);
            case 84 -> IlII(181561972, var9 ^ 1124693081);
            case 85 -> IlII(181561973, var9 ^ -122364111);
            case 86 -> IlII(181561970, var9 ^ 2107436575);
            case 87 -> IlII(181561971, var9 ^ 724071851);
            case 88 -> IlII(181561968, var9 ^ -1318765237);
            case 89 -> IlII(181561969, var9 ^ -1151847300);
            case 90 -> IlII(181561982, var9 ^ -1438875376);
            case 91 -> IlII(181561983, var9 ^ 1729410573);
            case 92 -> IlII(181561980, var9 ^ 1198371600);
            case 93 -> IlII(181561981, var9 ^ 1546024942);
            case 94 -> IlII(181561978, var9 ^ 775011062);
            case 95 -> IlII(181561979, var9 ^ 1760118115);
            case 96 -> IlII(181561976, var9 ^ -1809986709);
            case 97 -> IlII(181561977, var9 ^ 1936725259);
            case 98 -> IlII(181561990, var9 ^ 240453743);
            case 99 -> IlII(181561991, var9 ^ -1912585708);
            case 100 -> IlII(181561988, var9 ^ -1425229681);
            case 101 -> IlII(181561989, var9 ^ -316859619);
            case 102 -> IlII(181561986, var9 ^ -430767364);
            case 103 -> IlII(181561987, var9 ^ -683257478);
            case 104 -> IlII(181561984, var9 ^ 1036413598);
            case 105 -> IlII(181561985, var9 ^ 942961493);
            case 106 -> IlII(181561998, var9 ^ 1970970632);
            case 107 -> IlII(181561999, var9 ^ 1353418541);
            case 108 -> IlII(181561996, var9 ^ -1414122103);
            case 109 -> IlII(181561997, var9 ^ 669431938);
            case 110 -> IlII(181561994, var9 ^ -923984857);
            case 111 -> IlII(181561995, var9 ^ -832820334);
            case 112 -> IlII(181561992, var9 ^ 70698162);
            case 113 -> IlII(181561993, var9 ^ -976404926);
            case 114 -> IlII(181562006, var9 ^ -1357438524);
            case 115 -> IlII(181562007, var9 ^ 1850914114);
            case 116 -> IlII(181562004, var9 ^ -2031045817);
            case 117 -> IlII(181562005, var9 ^ -530365458);
            case 118 -> IlII(181562002, var9 ^ 1871490043);
            case 119 -> IlII(181562003, var9 ^ -1696966842);
            case 120 -> IlII(181562000, var9 ^ -1462005487);
            case 121 -> IlII(181562001, var9 ^ -1772468147);
            case 122 -> IlII(181562014, var9 ^ -160542874);
            case 123 -> IlII(181562015, var9 ^ -1643908118);
            case 124 -> IlII(181562012, var9 ^ -1048635577);
            case 125 -> 4;
            case 126 -> IlII(181562013, var9 ^ -2061951792);
            case 127 -> IlII(181562010, var9 ^ 1790583907);
            case 128 -> IlII(181562011, var9 ^ -533460429);
            case 129 -> IlII(181562008, var9 ^ 795813340);
            case 130 -> IlII(181562009, var9 ^ -1010936319);
            case 131 -> 1;
            case 132 -> IlII(181562022, var9 ^ 1112489475);
            case 133 -> IlII(181562023, var9 ^ 208634697);
            case 134 -> IlII(181562020, var9 ^ 1454033397);
            case 135 -> IlII(181562021, var9 ^ -1556782011);
            case 136 -> IlII(181562018, var9 ^ -1597356820);
            case 137 -> IlII(181562019, var9 ^ -897426963);
            case 138 -> IlII(181562016, var9 ^ -1867970791);
            case 139 -> IlII(181562017, var9 ^ 666720846);
            case 140 -> IlII(181562030, var9 ^ 1161022111);
            case 141 -> IlII(181562031, var9 ^ 151062516);
            case 142 -> IlII(181562028, var9 ^ 1307185107);
            case 143 -> IlII(181562029, var9 ^ -1342538042);
            case 144 -> IlII(181562026, var9 ^ -896826803);
            case 145 -> IlII(181562027, var9 ^ -1743486596);
            case 146 -> IlII(181562024, var9 ^ -865264265);
            case 147 -> IlII(181562025, var9 ^ -1120822920);
            case 148 -> IlII(181562038, var9 ^ 888846920);
            case 149 -> IlII(181562039, var9 ^ -1038339063);
            case 150 -> IlII(181562036, var9 ^ 626637885);
            case 151 -> IlII(181562037, var9 ^ 798007737);
            case 152 -> IlII(181562034, var9 ^ -1808894894);
            case 153 -> IlII(181562035, var9 ^ -128911696);
            case 154 -> IlII(181562032, var9 ^ 1490429834);
            case 155 -> IlII(181562033, var9 ^ 856253321);
            case 156 -> IlII(181562046, var9 ^ 1079320905);
            case 157 -> IlII(181562047, var9 ^ -1903826025);
            case 158 -> IlII(181562044, var9 ^ 2139642404);
            case 159 -> IlII(181562045, var9 ^ 1797029353);
            case 160 -> IlII(181562042, var9 ^ 1268413479);
            case 161 -> IlII(181562043, var9 ^ 1484170991);
            case 162 -> IlII(181562040, var9 ^ -1982818624);
            case 163 -> 2;
            case 164 -> IlII(181562041, var9 ^ 633005875);
            case 165 -> IlII(181562054, var9 ^ 523240232);
            case 166 -> IlII(181562055, var9 ^ -798440855);
            case 167 -> IlII(181562052, var9 ^ -205583130);
            case 168 -> IlII(181562053, var9 ^ 1876915351);
            case 169 -> 0;
            case 170 -> IlII(181562050, var9 ^ -1902910037);
            case 171 -> IlII(181562051, var9 ^ -1836846806);
            case 172 -> 5;
            case 173 -> IlII(181562048, var9 ^ 1857336672);
            case 174 -> IlII(181562049, var9 ^ 656910119);
            case 175 -> IlII(181562062, var9 ^ -1833344003);
            case 176 -> IlII(181562063, var9 ^ 511962087);
            case 177 -> IlII(181562060, var9 ^ -1045435312);
            case 178 -> IlII(181562061, var9 ^ -35555089);
            case 179 -> IlII(181562058, var9 ^ -1954158206);
            case 180 -> IlII(181562059, var9 ^ -1204102796);
            case 181 -> IlII(181562056, var9 ^ 1002893000);
            case 182 -> IlII(181562057, var9 ^ -37181382);
            case 183 -> IlII(181562070, var9 ^ 552803768);
            case 184 -> IlII(181562071, var9 ^ 1710260387);
            case 185 -> IlII(181562068, var9 ^ 1171097275);
            case 186 -> IlII(181562069, var9 ^ 18611983);
            case 187 -> IlII(181562066, var9 ^ -1345236371);
            case 188 -> IlII(181562067, var9 ^ 2027773349);
            case 189 -> IlII(181562064, var9 ^ -1717396978);
            case 190 -> IlII(181562065, var9 ^ -1651006806);
            case 191 -> IlII(181562078, var9 ^ -1191000289);
            case 192 -> IlII(181562079, var9 ^ -551568849);
            case 193 -> IlII(181562076, var9 ^ -195518502);
            case 194 -> IlII(181562077, var9 ^ -67254876);
            case 195 -> IlII(181562074, var9 ^ -1751746935);
            case 196 -> IlII(181562075, var9 ^ 1289038086);
            case 197 -> IlII(181562072, var9 ^ -858484458);
            case 198 -> IlII(181562073, var9 ^ -1117044465);
            case 199 -> IlII(181562086, var9 ^ -1326940661);
            case 200 -> IlII(181562087, var9 ^ 2112014610);
            case 201 -> IlII(181562084, var9 ^ -495550671);
            case 202 -> IlII(181562085, var9 ^ -1652535796);
            case 203 -> IlII(181562082, var9 ^ -1089388070);
            case 204 -> IlII(181562083, var9 ^ 635279648);
            case 205 -> IlII(181562080, var9 ^ -700110382);
            case 206 -> IlII(181562081, var9 ^ -1855181882);
            case 207 -> IlII(181562094, var9 ^ -504118933);
            case 208 -> IlII(181562095, var9 ^ 1004287597);
            case 209 -> IlII(181562092, var9 ^ -1893815313);
            case 210 -> IlII(181562093, var9 ^ -1435281414);
            case 211 -> IlII(181562090, var9 ^ -143023096);
            case 212 -> IlII(181562091, var9 ^ 1319704566);
            case 213 -> IlII(181562088, var9 ^ -334414003);
            case 214 -> IlII(181562089, var9 ^ -1569464908);
            case 215 -> IlII(181562102, var9 ^ -1059963327);
            case 216 -> IlII(181562103, var9 ^ -1355299685);
            case 217 -> IlII(181562100, var9 ^ -1841074077);
            case 218 -> IlII(181562101, var9 ^ -1341047245);
            case 219 -> IlII(181562098, var9 ^ 473971647);
            case 220 -> IlII(181562099, var9 ^ -1212298033);
            case 221 -> IlII(181562096, var9 ^ -843014254);
            case 222 -> IlII(181562097, var9 ^ -272954416);
            case 223 -> IlII(181562110, var9 ^ -1568480389);
            case 224 -> IlII(181562111, var9 ^ 100660918);
            case 225 -> IlII(181562108, var9 ^ -1546403293);
            case 226 -> IlII(181562109, var9 ^ -797586251);
            case 227 -> IlII(181562106, var9 ^ -288749547);
            case 228 -> IlII(181562107, var9 ^ 2145217402);
            case 229 -> 3;
            case 230 -> IlII(181562104, var9 ^ 539035483);
            case 231 -> IlII(181562105, var9 ^ -880282145);
            case 232 -> IlII(181562118, var9 ^ -2875434);
            case 233 -> IlII(181562119, var9 ^ 787679398);
            case 234 -> IlII(181562116, var9 ^ -1530920975);
            case 235 -> IlII(181562117, var9 ^ 1261116125);
            case 236 -> IlII(181562114, var9 ^ 117911411);
            case 237 -> IlII(181562115, var9 ^ -79064175);
            case 238 -> IlII(181562112, var9 ^ 722851088);
            case 239 -> IlII(181562113, var9 ^ -352671543);
            case 240 -> IlII(181562126, var9 ^ -356742772);
            case 241 -> IlII(181562127, var9 ^ -1427053378);
            case 242 -> IlII(181562124, var9 ^ -364834612);
            case 243 -> IlII(181562125, var9 ^ 1287646286);
            case 244 -> IlII(181562122, var9 ^ -808245910);
            case 245 -> IlII(181562123, var9 ^ 1552571109);
            case 246 -> IlII(181562120, var9 ^ -1746827162);
            case 247 -> IlII(181562121, var9 ^ 489386);
            case 248 -> IlII(181562134, var9 ^ 190701317);
            case 249 -> IlII(181562135, var9 ^ 573963299);
            case 250 -> IlII(181562132, var9 ^ -1913550042);
            case 251 -> IlII(181562133, var9 ^ -1739325642);
            case 252 -> IlII(181562130, var9 ^ 1224592608);
            case 253 -> IlII(181562131, var9 ^ -631243946);
            case 254 -> IlII(181562128, var9 ^ -739329198);
            default -> IlII(181562129, var9 ^ -2071830519);
         };
         int var5 = (var1 & IlII(181562142, var9 ^ 369604480)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IlII(181562143, var9 ^ 180866600)) >>> IlII(181562140, var9 ^ 1974930324)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IlII(181562141, var9 ^ 1616121678);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IlII(181562138, var9 ^ -1293983461);
            }
         }

         lIl[var2] = new String(var3).intern();
      }

      return lIl[var2];
   }
}
