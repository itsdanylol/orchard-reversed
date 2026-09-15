package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10185;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_744;

@Environment(EnvType.CLIENT)
public final class lIIIllIl extends IlIIIIIIl {
   private long I;
   private final lllIIlII II;
   private boolean Il;
   private static final String[] lI;
   private static final String[] ll;
   private lIIIIllI III;
   private final IIlIII IIl;
   private int IlI;
   private static final String[] IIll;
   private static final int[] IIlI;
   private final lIlllIl Ill;
   private int lII;
   private final lIlllIl lIl;
   private long llI;
   private class_1297 lll;
   private final IllIII<IlllIll> IIII;
   private static final Object[] IlII;
   private boolean IIIl;

   private static int IIll(int var0, int var1) {
      int var2 = IIlI[var0 ^ -1080390905] ^ var1 ^ var0;
      var2 -= 14745;
      var2 += 58625;
      var2 -= 46298;
      var2 ^= 43223;
      var2 ^= 30668;
      var2 -= 49516;
      var2 += 2987;
      var2 += 54261;
      return var2 + 62257;
   }

   private boolean I(class_310 var1, class_1297 var2) {
      if (var2 instanceof class_1309 var3
         && var1 != null
         && var1.field_1724 != null
         && var1.field_1690 != null
         && var1.field_1755 == null
         && (this.II.IllI() || var1.field_1724.method_24828())
         && var3 != var1.field_1724
         && var3.method_5805()
         && !var3.method_31481()) {
         if (!var1.field_1724.method_5624()) {
         }

         if (this.Il()) {
            return true;
         }
      }

      return false;
   }

   private void l(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         IlIlIIII var2 = IlIlIIII.llI();
         this.ll(var1, var2, var1.field_1690.field_1894, false);
         if (this.IIII.IllI() == k74.x.IlllIll.l) {
            this.ll(var1, var2, var1.field_1690.field_1881, true);
         } else {
            this.IIl(var1, var2, var1.field_1690.field_1881);
         }
      }
   }

   private void II(class_310 var1, class_744 var2) {
      this.l(var1);
      class_10185 var3 = var2.field_54155;
      boolean var4 = this.IIII.IllI() == k74.x.IlllIll.l;
      boolean var5 = false;
      boolean var6 = var4 ? true : var3.comp_3160();
      boolean var7 = var3.comp_3161();
      boolean var8 = var3.comp_3162();
      boolean var9 = var3.comp_3163();
      boolean var10 = var3.comp_3164();
      var2.field_54155 = new class_10185(var5, var6, var7, var8, var9, var10, false);
      float var11 = var4 ? -1.0F : (var6 ? -1.0F : 0.0F);
      float var12 = var7 == var8 ? 0.0F : (var7 ? 1.0F : -1.0F);
      if (var11 != 0.0F && var12 != 0.0F) {
         float var13 = 0.70710677F;
         var11 *= var13;
         var12 *= var13;
      }

      k74.x.IIll.IllIlll(var2, var11, var12);
   }

   @Override
   public void llIIII(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 != null && var1.field_1724 != null && var1.field_1690 != null && this.III != lIIIIllI.Il) {
         long var3 = System.currentTimeMillis();
         if (this.III == lIIIIllI.II) {
            if (var3 < this.llI) {
               return;
            }

            this.III = lIIIIllI.I;
            this.IIIl = false;
            var1.field_1724.method_5728(false);
            this.l(var1);
            if (var2 == null) {
               return;
            }
         }

         if (this.III == lIIIIllI.I) {
            if (var3 >= this.I) {
               this.lI(var1);
               if (var2 == null) {
                  return;
               }
            }

            var1.field_1724.method_5728(false);
            this.l(var1);
         }
      }
   }

   @Override
   public String IlIIl() {
      return this.IIII.IllI().toString();
   }

   @Override
   public void IIlIl() {
      String[] var10000 = IIllllIl.IIIIl();
      class_310 var2 = class_310.method_1551();
      String[] var1 = var10000;
      if (var2 != null && var2.field_1724 != null && var2.field_1690 != null && this.III != lIIIIllI.Il) {
         long var3 = System.currentTimeMillis();
         if (this.III == lIIIIllI.II) {
            if (var3 < this.llI || var2.field_1724.field_6012 < this.lII) {
               return;
            }

            this.III = lIIIIllI.I;
            this.IIIl = false;
            var2.field_1724.method_5728(false);
            this.l(var2);
            if (var1 == null) {
               return;
            }
         }

         if (this.III == lIIIIllI.I) {
            if (var3 >= this.I && var2.field_1724.field_6012 >= this.IlI) {
               this.lI(var2);
               if (var1 == null) {
                  return;
               }
            }

            var2.field_1724.method_5728(false);
            this.l(var2);
         }
      }
   }

   private boolean Il() {
      double var1 = this.IIl.IllI();
      if (var1 >= 100.0) {
         return true;
      } else {
         return var1 <= 0.0 ? false : ThreadLocalRandom.current().nextDouble(100.0) < var1;
      }
   }

   private void lI(class_310 var1) {
      this.Ill(var1);
      if (this.IIIl && this.lIl(var1)) {
         var1.field_1724.method_5728(true);
      }

      this.lII();
   }

   private void ll(class_310 var1, IlIlIIII var2, class_304 var3, boolean var4) {
      if (var3 != null) {
         if (var2 != null) {
            var2.ll(this, var1, var3, var4);
         } else {
            var3.method_23481(var4);
         }
      }
   }

   private void III() {
      this.lll = null;
      this.Il = false;
   }

   @Override
   public void llIl() {
      class_310 var1 = class_310.method_1551();
      this.lI(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1492635719;
      char[] var15 = "£\u0011".toCharArray();
      String var14 = "蚕蚱蘐虥虿蛠蚬蘃虯蛨蚵蘍蛘蛿蘡蛙蚄蘢虲蛯蚳蚰蚄蘗蚍蘺蛿虿虼蛶蛿蛩虦虬蚱蚔蘉蚥蛕蘓虢虥蘠蘺蘣蛊蚬蚆蘂蚠蘲虪虂蚝蚨虇蚧蚤蛦蚖蚲虙蘇蚱虐蘁蛮虆蛹虍蘉蚲蛟蛺蛫蛊蚆蘱蛆虠蚰蘤虃虼蛕虠蚽蘃虧蚜虆蘗蛑虵虠蚦蛙蘳蚀虚蘑蚰蘫蛗蛪虥蛑蘳虈蛤蚽蘯蚖蘛蚂蛓虛蛚蘅蚇蘄蛈虵蛵蛼蛘號虖虑蛂蘥蚙蚀蘱蛢虎蛛蚞蘂蛯蘄蛹虀蚭蛰蛌蛪蚁蚢蘀虒蚕蘪蛶蘧蛇蚡蚯虤蛎蘈虔蛪\ueede\ueefe\ueec3\uee22\uee5f\uee8e\ueedd\uee25\uee0f\uee75\ueede\ueee4\uee4d\uee03\uee57\ueed9\uee11";
      short var13 = 25556;
      String[] var10000 = new String[var15.length];
      byte var20 = -1;
      String[] var16 = var10000;

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            IIll = var16;
            IlII = new Object[var16.length];
            int var9 = -119175483;
            byte[] var7 = "\fyN×\u0082\u009eÇÕ#\u009d{FÊ+ÎÐÆJ\u008fîÌ\u001fS}\u0088©Â\u0014w§Ø\u007f\u001c¨\u008d\b!u\u007f¶\u0002X¶4¨!N\u0099´3\u0006\\ ü\u0011<ùßßô?¹\u0011>¨{à!aÆõ:ß¢9]£>¥vÎö\u0090GÖ\"º\u0095÷Æ\u0083Î\u008fC\u009d¢æ*\u009a\u001a°W \u0089]\u001c\u0092R\u0099\u001c}\u000bÕïÔ\u009dläú*Þë\u008eÑxLûå]wÍá17í\u0089f\u0015cÿA \u0002\u0090ð_\u0099\u0092ÝÂ|=6£êL\u0017\u009clÍ8x\u008c\u0017×ñ\u0081ö÷¹¨oÕtã¢Ãx/ñµ\u001e!Ë!\u000bo\u0084½î³\u0093ù·]ym1v\u0089»õ>m¦\u0017²Ê|ÌKÚ\u0014\u0094L\bÇ\u0017\u000b\u0004\u009eÝ×eÛ\u0005µ¾\u0087N\u0012`\u001fÉwÃ\u001eÁ\u0096¥'vÜE%\n \u001f¸\u0086O[:_×ÜÎ)ÔÜsG&¦@°ºÄ{«\u0090\fGº½å\u0003ºFÞ .R\u0016y{ñ³\u00ad£ÌN\u0000ÔëFÆ\u001e Ù_G\u008f¿\u0084ô_Y\u008fÞÛÆ|\u0084Þ±á\u0098P\u001cü¨b\u001byp>«{ÄÄ\u00127X½Ðç\"QÝ+\u001fpÊ=Hm·\u0010\u008d\u0082\u009aã¬x8o'\u001fÙ\u0082\u0098Ã8\u001dµ\u001evjBH[\u0014¯l ¢ÂÃ3X\u0006ÝðS-sõ\u0090Mõ,\u0014ø´ä@¿e)\u0095ÚúÍkaÎÕyJ\nð¾l\u0088,úÿkÏ\u000bû\u0081[è·ø-/Ù'Ë¥\u0011)ø\u0012û\u001e ^I)ËÎ\u0089Ã\u001e7J\u0085\u00adÖ0ð sóÝÎÞ»\b\u0017\\ A&Ü·(ÇñK\u009b\rnK'}%\u009a,ÞxàV,ÚÄ\u001d»Õ4E\u00842U+ç\u0002÷Ç±ô+\u0082èr:ÕH¾ÏÅ ¨ý<*÷;¨U(¨\u0092\u0003ùÂ×²ª\u0017\u008f'|ÿÈË\u0001´L?\u001b\u0013|6°È-\u0085CÈ¿\u009b\u008c}ß@\u000b\u0006e5¸Æ\u0011\u0087\u0019$\u0003\u0004N·+\u008d6\b®\u0083\u0017G&\u0092\u0010VzPØ\u0013o´þø\u008b\u0018\u0087ÂöMIª/²Nô&*ç\u0018§ø:¤a(Q¦ý\u0094¾û\u0087\u0097u\u00adÌ/Ë\u0090+º5íà5Â]Ä\u009f%üÊæfGøbI\u0081Iäi\n%E¾¸\u0095\u0093\u00031\u0099ÏÉ2<\u001de9¢¼Ç\u0007Àãÿ+\u0012\u000b¯ã*\u0007aáÍµ]Á\u008c¢RÜ\u0083-\\\u0003tá¨\u009d\u0089C\rp.t'`´S{|ºÆSÎÉ\u0084\u0010é\u0083Ë\u009cÆU¼í\u000fbf\br|Wöj¦ô0µg-«`\u0095\u009eY*\u0093\nÒ%\u001f°\u009f8\u0091.a\u0013^ó\u0005\u0080[\u0004\u0090´µ$2!H\u0000cÖg\u0090g°´«4©Èa\u001d2£Kû¿©&\u0091\u0017âÕX{ü n¦Û¥Ub¿¶\u0000ÛQ½\bEè%\u0084î3\u008aßþw?×\u001c\u0095\rÒÀú\u008cEÚ\u0013\r¹ApÖèôçe\u0084g§\u0007/oÄ»'ú1z¦\u0019hï\u0001ÎÉ\u00adá\u0012\u0010\u009d\u0092\u009bF5ør\u008fñä6R\u00adÒ`0¶\u0085Üª±wi%\u009f\u0000\u0089Ò\u009eFs\u000f\u0014Î\u001e\u00ad\u0088óë\u0005î\u0091±Z\u0017\\\bø\u0015\u0080Ì9æ\u0013¾ää3J\u008bª\u001f#®q¤»_Þ\u008d%\u001a\u0096g\u001e1\\i.`a0\u0091Y\u0088´¬Y\u0017DaÕÚ&\u009aØF@²ôxÎº#«ºê\u008dçÿ¿ØV\u001e½j\u008cî8Í\u008dù\u001d£Ö!\u001d\u0012\u001fS\u0018g\u009eÖë\u000enc\u0091g3¹vNVÂÂJna©ø¶\fôb\u0089\u0084]\"cô\u0005sñÁ7U&àÐ\n\u0087Z7A.\u0019]k.È^/c±ç\u009d\u0000÷\u0012_D\u0005Íµ\u0014û\u001d[&\u009dY\u0080¼¡Àý\u0086\u0082AÉ#þ\u00005·\u0085)UXMãIWÁî#¦?\u008f¬ÿc\u0087ÓfÁ\u009c©VÐÍH¸ÙÓÄ\u0006\u008fÁEÈZRÞãRó?ÿVròp¸\u00156Ï\u0004áM\u001bÏ(¯=ý!Ê8\u0002\u0095z²2ËY\u0004¾¶ÒW3¢P?/YiÂºGÙÉ¾Qè<"
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

            String[] var5 = new String[IIll(-1080390907, var24 ^ 1007968783)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IlII(-867991486, var24 ^ 1375408761)).length();
            int var1 = 4;
            int var26 = -1;

            label100:
            while (true) {
               int var30 = IIll(-1080390908, var24 ^ -710748177);
               String var10001 = var2.substring(++var26, var26 + var1);
               byte var10002 = -1;

               while (true) {
                  label95: {
                     char[] var46 = var10001.toCharArray();
                     int var10004 = var46.length;
                     int var6 = 0;
                     int var49 = var30;
                     var42 = var46;
                     int var36 = var10004;
                     char[] var58;
                     int var10006;
                     if (var10004 <= 1) {
                        var58 = var46;
                        var10004 = var30;
                        var10006 = var6;
                     } else {
                        var49 = var30;
                        var36 = var10004;
                        if (var10004 <= var6) {
                           break label95;
                        }

                        var58 = var46;
                        var10004 = var30;
                        var10006 = var6;
                     }

                     while (true) {
                        var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % IIll(-1080390912, var24 ^ 1747894568)) {
                           case 0 -> IIll(-1080390897, var24 ^ 52532303);
                           case 1 -> IIll(-1080390898, var24 ^ 1056728712);
                           case 2 -> IIll(-1080390899, var24 ^ 500281203);
                           case 3 -> IIll(-1080390900, var24 ^ -1213704283);
                           case 4 -> IIll(-1080390901, var24 ^ -1413865622);
                           case 5 -> IIll(-1080390902, var24 ^ 1064635099);
                           default -> IIll(-1080390903, var24 ^ -430520643);
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
                        if ((var26 += var1) >= var4) {
                           lI = var5;
                           ll = new String[IIll(-1080390911, var24 ^ -1759454375)];
                           return;
                        }

                        var1 = var2.charAt(var26);
                        break;
                     default:
                        var5[var3++] = var51;
                        if ((var26 += var1) < var4) {
                           var1 = var2.charAt(var26);
                           continue label100;
                        }

                        var4 = (var2 = IlII(-867991485, var24 ^ 962623242)).length();
                        var1 = IIll(-1080390909, var24 ^ -641493313);
                        var26 = -1;
                  }

                  var30 = IIll(-1080390910, var24 ^ -745125270);
                  var10001 = var2.substring(++var26, var26 + var1);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 129;
                  case 1 -> 156;
                  case 2 -> 217;
                  case 3 -> 164;
                  case 4 -> 27;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private void IIl(class_310 var1, IlIlIIII var2, class_304 var3) {
      if (var3 != null) {
         if (var2 != null) {
            var2.IIII(this, var1, var3);
         } else {
            var3.method_23481(var1 != null && k74.x.IIll.IlIllll(var1, var3));
         }
      }
   }

   private void Ill(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         IlIlIIII var2 = IlIlIIII.llI();
         if (var2 != null) {
            var2.IlI(this, var1);
         } else {
            this.IIl(var1, null, var1.field_1690.field_1894);
            this.IIl(var1, null, var1.field_1690.field_1881);
         }
      }
   }

   @Override
   public void lllllI(class_1297 var1) {
      this.III();
      class_310 var2 = class_310.method_1551();
      this.lll = var1;
      if (this.I(var2, var1)) {
         this.Il = true;
      }
   }

   @Override
   public void IlIlI(class_1297 var1) {
      class_310 var2 = class_310.method_1551();
      boolean var3 = this.Il && var1 == this.lll;
      if (!var3 && this.lll == null && this.I(var2, var1)) {
         var3 = true;
      }

      this.III();
      if (var3
         && var1 instanceof class_1309 var4
         && var2 != null
         && var2.field_1724 != null
         && var2.field_1690 != null
         && var2.field_1755 == null
         && var4 != var2.field_1724
         && var4.method_5805()
         && !var4.method_31481()) {
         long var5 = System.currentTimeMillis();
         long var7 = this.lll(this.Ill);
         this.llI = var5 + var7;
         this.lII = var2.field_1724.field_6012 + (var7 <= 0L ? 0 : (int)Math.ceil(var7 / 50.0));
         long var9 = Math.max(1L, this.lll(this.lIl));
         this.I = this.llI + var9;
         this.IlI = this.lII + Math.max(2, (int)Math.ceil(var9 / 50.0));
         this.IIIl = false;
         this.III = var7 <= 0L ? lIIIIllI.I : lIIIIllI.II;
         if (this.III == lIIIIllI.I) {
            var2.field_1724.method_5728(false);
            this.IIIl = true;
            this.l(var2);
         }
      }
   }

   private void lII() {
      this.III = lIIIIllI.Il;
      this.llI = 0L;
      this.I = 0L;
      this.lII = IIll(-1080390905, 126267767 ^ 863946896);
      this.IlI = IIll(-1080390906, 126267767 ^ -1114029677);
      this.IIIl = false;
      this.III();
   }

   private boolean lIl(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1690 != null
         && var1.field_1755 == null
         && (k74.x.IIll.IlIllll(var1, var1.field_1690.field_1894) || var1.field_1690.field_1894.method_1434())
         && !k74.x.IIll.IlIllll(var1, var1.field_1690.field_1881)
         && !var1.field_1724.method_5715()
         && !var1.field_1724.method_6115();
   }

   private static String IlII(int var0, int var1) {
      int var3 = var0 ^ -867991486;
      char[] var4 = IIll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IlII[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IlII[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 639113449;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 101;
            case 1 -> 144;
            case 2 -> 186;
            case 3 -> 135;
            case 4 -> 155;
            case 5 -> 230;
            case 6 -> 163;
            case 7 -> 86;
            case 8 -> 194;
            case 9 -> 147;
            case 10 -> 16;
            case 11 -> 166;
            case 12 -> 252;
            case 13 -> 188;
            case 14 -> 91;
            case 15 -> 160;
            case 16 -> 88;
            case 17 -> 18;
            case 18 -> 61;
            case 19 -> 61;
            case 20 -> 48;
            case 21 -> 155;
            case 22 -> 118;
            case 23 -> 155;
            case 24 -> 200;
            case 25 -> 19;
            case 26 -> 215;
            case 27 -> 247;
            case 28 -> 121;
            case 29 -> 38;
            case 30 -> 153;
            case 31 -> 33;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public boolean llI() {
      return this.IIIIlIl() && this.III == lIIIIllI.I;
   }

   private long lll(lIlllIl var1) {
      double var2 = Math.min(var1.IIlI(), var1.IlI());
      double var4 = Math.max(var1.IIlI(), var1.IlI());
      return var4 <= var2 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   public lIIIllIl() {
      int var1 = -1484829946;
      super(
         IlIIllIII.Ill(IIlI(IIll(-1080390904, var1 ^ 541496098), IIll(-1080390889, var1 ^ -1216073035))),
         lllIIlIl.III,
         IlIIllIII.Ill(IIlI(IIll(-1080390890, var1 ^ 2117695204), IIll(-1080390891, var1 ^ -1067694468)))
      );
      this.IIII = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIlI(IIll(-1080390892, var1 ^ -1128192137), IIll(-1080390893, var1 ^ -787929766))), IlllIll.class, k74.x.IlllIll.Il)
      );
      this.lIl = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIlI(IIll(-1080390894, var1 ^ -908248754), IIll(-1080390895, var1 ^ -398914819))), 100.0, 150.0, 20.0, 500.0, 5.0)
            .Ill(IlIIllIII.Ill(IIlI(IIll(-1080390896, var1 ^ -1866719325), IIll(-1080390881, var1 ^ -103504545))))
      );
      this.Ill = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIlI(IIll(-1080390882, var1 ^ -1347935400), IIll(-1080390883, var1 ^ 1122204919))), 0.0, 15.0, 0.0, 200.0, 1.0)
            .Ill(IlIIllIII.Ill(IIlI(IIll(-1080390884, var1 ^ -2031878459), IIll(-1080390885, var1 ^ -904918218))))
      );
      this.II = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIlI(IIll(-1080390886, var1 ^ 1931180075), IIll(-1080390887, var1 ^ -1055638013))), true));
      this.IIl = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIlI(IIll(-1080390888, var1 ^ 1739815399), IIll(-1080390873, var1 ^ 1116216399))), 100.0, 0.0, 100.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIlI(IIll(-1080390874, var1 ^ 784887393), IIll(-1080390875, var1 ^ 2045475597))))
      );
      this.III = lIIIIllI.Il;
      this.lII = IIll(-1080390876, var1 ^ -564232571);
      this.IlI = IIll(-1080390877, var1 ^ 1872881024);
   }

   public boolean IIII(class_310 var1, class_744 var2) {
      if (this.III == lIIIIllI.Il) {
         return false;
      } else if (this.IIIIlIl()
         && var1 != null
         && var1.field_1724 != null
         && var1.field_1690 != null
         && var2 != null
         && var2.field_54155 != null
         && var1.field_1755 == null) {
         long var3 = System.currentTimeMillis();
         if (this.III == lIIIIllI.II) {
            if (var3 < this.llI || var1.field_1724.field_6012 < this.lII) {
               return false;
            }

            this.III = lIIIIllI.I;
            this.IIIl = false;
         }

         if (var3 >= this.I && var1.field_1724.field_6012 >= this.IlI) {
            this.lI(var1);
            return false;
         } else {
            var1.field_1724.method_5728(false);
            this.IIIl = true;
            this.II(var1, var2);
            return true;
         }
      } else {
         this.lI(var1);
         return false;
      }
   }

   public IlllIll IIIl() {
      return this.IIII.IllI();
   }

   private static String IIlI(int var0, int var1) {
      int var9 = 550086637;
      int var2 = (var0 ^ IIll(-1080390878, var9 ^ 1166742245)) & IIll(-1080390879, var9 ^ -1360364874);
      if (ll[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & IIll(-1080390880, var9 ^ -1881866442)) {
            case 0 -> IIll(-1080390865, var9 ^ -1607458927);
            case 1 -> IIll(-1080390866, var9 ^ 1337528929);
            case 2 -> IIll(-1080390867, var9 ^ 1878079862);
            case 3 -> IIll(-1080390868, var9 ^ 1295806686);
            case 4 -> IIll(-1080390869, var9 ^ 1529921231);
            case 5 -> IIll(-1080390870, var9 ^ 760656092);
            case 6 -> IIll(-1080390871, var9 ^ -1186726804);
            case 7 -> IIll(-1080390872, var9 ^ 631644389);
            case 8 -> IIll(-1080390857, var9 ^ 1644153863);
            case 9 -> IIll(-1080390858, var9 ^ -176560818);
            case 10 -> IIll(-1080390859, var9 ^ 599633680);
            case 11 -> IIll(-1080390860, var9 ^ 1046421771);
            case 12 -> IIll(-1080390861, var9 ^ -461055240);
            case 13 -> IIll(-1080390862, var9 ^ -1931682447);
            case 14 -> IIll(-1080390863, var9 ^ 1600100565);
            case 15 -> IIll(-1080390864, var9 ^ 110445725);
            case 16 -> 3;
            case 17 -> 2;
            case 18 -> IIll(-1080390849, var9 ^ 1129129472);
            case 19 -> IIll(-1080390850, var9 ^ 520520147);
            case 20 -> IIll(-1080390851, var9 ^ -2021529644);
            case 21 -> IIll(-1080390852, var9 ^ -2037839983);
            case 22 -> IIll(-1080390853, var9 ^ -1086435388);
            case 23 -> IIll(-1080390854, var9 ^ -1119702050);
            case 24 -> IIll(-1080390855, var9 ^ 550428261);
            case 25 -> IIll(-1080390856, var9 ^ -1575532892);
            case 26 -> IIll(-1080390841, var9 ^ 1449215362);
            case 27 -> IIll(-1080390842, var9 ^ -351291426);
            case 28 -> IIll(-1080390843, var9 ^ -654824465);
            case 29 -> IIll(-1080390844, var9 ^ -471661569);
            case 30 -> IIll(-1080390845, var9 ^ -537776541);
            case 31 -> IIll(-1080390846, var9 ^ -1678584535);
            case 32 -> IIll(-1080390847, var9 ^ -1201224905);
            case 33 -> IIll(-1080390848, var9 ^ -516726157);
            case 34 -> IIll(-1080390833, var9 ^ 904617006);
            case 35 -> IIll(-1080390834, var9 ^ -1734575559);
            case 36 -> IIll(-1080390835, var9 ^ 1582740351);
            case 37 -> IIll(-1080390836, var9 ^ -955310407);
            case 38 -> IIll(-1080390837, var9 ^ 482135260);
            case 39 -> IIll(-1080390838, var9 ^ 395724909);
            case 40 -> IIll(-1080390839, var9 ^ -456372969);
            case 41 -> IIll(-1080390840, var9 ^ 2043724098);
            case 42 -> IIll(-1080390825, var9 ^ 1692463544);
            case 43 -> IIll(-1080390826, var9 ^ -516379319);
            case 44 -> IIll(-1080390827, var9 ^ -477341793);
            case 45 -> 5;
            case 46 -> IIll(-1080390828, var9 ^ -1357894479);
            case 47 -> IIll(-1080390829, var9 ^ 2137703036);
            case 48 -> IIll(-1080390830, var9 ^ -1286086157);
            case 49 -> IIll(-1080390831, var9 ^ -1526661689);
            case 50 -> IIll(-1080390832, var9 ^ -2000350280);
            case 51 -> IIll(-1080390817, var9 ^ 2078599527);
            case 52 -> IIll(-1080390818, var9 ^ -143683909);
            case 53 -> IIll(-1080390819, var9 ^ 449859774);
            case 54 -> IIll(-1080390820, var9 ^ -2046980279);
            case 55 -> IIll(-1080390821, var9 ^ -234169418);
            case 56 -> IIll(-1080390822, var9 ^ -1930952785);
            case 57 -> IIll(-1080390823, var9 ^ 982143218);
            case 58 -> IIll(-1080390824, var9 ^ -1068609993);
            case 59 -> IIll(-1080390809, var9 ^ -882515844);
            case 60 -> IIll(-1080390810, var9 ^ 134571743);
            case 61 -> IIll(-1080390811, var9 ^ -1934612654);
            case 62 -> IIll(-1080390812, var9 ^ -654838417);
            case 63 -> IIll(-1080390813, var9 ^ 227699650);
            case 64 -> IIll(-1080390814, var9 ^ -215392798);
            case 65 -> IIll(-1080390815, var9 ^ -519923032);
            case 66 -> IIll(-1080390816, var9 ^ 639899913);
            case 67 -> IIll(-1080390801, var9 ^ 1656223801);
            case 68 -> IIll(-1080390802, var9 ^ -1816980858);
            case 69 -> IIll(-1080390803, var9 ^ 1895786835);
            case 70 -> IIll(-1080390804, var9 ^ -1215187256);
            case 71 -> IIll(-1080390805, var9 ^ 1029290496);
            case 72 -> IIll(-1080390806, var9 ^ -1967944426);
            case 73 -> IIll(-1080390807, var9 ^ -972965253);
            case 74 -> IIll(-1080390808, var9 ^ 1455509710);
            case 75 -> IIll(-1080390793, var9 ^ -1358818129);
            case 76 -> IIll(-1080390794, var9 ^ 1316512588);
            case 77 -> IIll(-1080390795, var9 ^ -340046673);
            case 78 -> IIll(-1080390796, var9 ^ 1190370248);
            case 79 -> IIll(-1080390797, var9 ^ -999763951);
            case 80 -> IIll(-1080390798, var9 ^ 1157609616);
            case 81 -> IIll(-1080390799, var9 ^ 1761807195);
            case 82 -> IIll(-1080390800, var9 ^ -167529263);
            case 83 -> IIll(-1080390785, var9 ^ -1110262332);
            case 84 -> IIll(-1080390786, var9 ^ -525810275);
            case 85 -> IIll(-1080390787, var9 ^ 1116507715);
            case 86 -> IIll(-1080390788, var9 ^ 1300026613);
            case 87 -> IIll(-1080390789, var9 ^ -1440892882);
            case 88 -> IIll(-1080390790, var9 ^ -1698737130);
            case 89 -> IIll(-1080390791, var9 ^ 1818432493);
            case 90 -> IIll(-1080390792, var9 ^ -361609488);
            case 91 -> IIll(-1080390777, var9 ^ 646403777);
            case 92 -> IIll(-1080390778, var9 ^ 817212554);
            case 93 -> IIll(-1080390779, var9 ^ 1869822828);
            case 94 -> IIll(-1080390780, var9 ^ -1327496740);
            case 95 -> IIll(-1080390781, var9 ^ 1636451498);
            case 96 -> IIll(-1080390782, var9 ^ 845094587);
            case 97 -> IIll(-1080390783, var9 ^ -457745476);
            case 98 -> IIll(-1080390784, var9 ^ -1711481054);
            case 99 -> IIll(-1080390769, var9 ^ -2091126960);
            case 100 -> IIll(-1080390770, var9 ^ 679526025);
            case 101 -> IIll(-1080390771, var9 ^ -612356932);
            case 102 -> IIll(-1080390772, var9 ^ 339037233);
            case 103 -> IIll(-1080390773, var9 ^ -1823541742);
            case 104 -> IIll(-1080390774, var9 ^ 546210460);
            case 105 -> IIll(-1080390775, var9 ^ -2123590976);
            case 106 -> IIll(-1080390776, var9 ^ -687883705);
            case 107 -> IIll(-1080390761, var9 ^ -1371521661);
            case 108 -> IIll(-1080390762, var9 ^ -1894795861);
            case 109 -> IIll(-1080390763, var9 ^ -2011240160);
            case 110 -> IIll(-1080390764, var9 ^ 1079770247);
            case 111 -> IIll(-1080390765, var9 ^ 1722816601);
            case 112 -> IIll(-1080390766, var9 ^ 529164007);
            case 113 -> IIll(-1080390767, var9 ^ -773669319);
            case 114 -> IIll(-1080390768, var9 ^ -692275855);
            case 115 -> IIll(-1080390753, var9 ^ 2135962818);
            case 116 -> IIll(-1080390754, var9 ^ -1561529771);
            case 117 -> IIll(-1080390755, var9 ^ -907121369);
            case 118 -> IIll(-1080390756, var9 ^ 649270365);
            case 119 -> IIll(-1080390757, var9 ^ -303734914);
            case 120 -> IIll(-1080390758, var9 ^ 1406712381);
            case 121 -> IIll(-1080390759, var9 ^ -1381666398);
            case 122 -> IIll(-1080390760, var9 ^ 1511348135);
            case 123 -> IIll(-1080390745, var9 ^ -1112254067);
            case 124 -> IIll(-1080390746, var9 ^ -32544529);
            case 125 -> IIll(-1080390747, var9 ^ -775300997);
            case 126 -> IIll(-1080390748, var9 ^ -247286530);
            case 127 -> IIll(-1080390749, var9 ^ 653263875);
            case 128 -> IIll(-1080390750, var9 ^ -1686566345);
            case 129 -> IIll(-1080390751, var9 ^ 1366994913);
            case 130 -> IIll(-1080390752, var9 ^ -42913013);
            case 131 -> IIll(-1080390737, var9 ^ 1599034340);
            case 132 -> IIll(-1080390738, var9 ^ 1734575011);
            case 133 -> IIll(-1080390739, var9 ^ 934000919);
            case 134 -> IIll(-1080390740, var9 ^ -106340787);
            case 135 -> IIll(-1080390741, var9 ^ -980869788);
            case 136 -> IIll(-1080390742, var9 ^ -896266124);
            case 137 -> IIll(-1080390743, var9 ^ -1001658430);
            case 138 -> IIll(-1080390744, var9 ^ 819272282);
            case 139 -> IIll(-1080390729, var9 ^ -1791443669);
            case 140 -> IIll(-1080390730, var9 ^ -1087887438);
            case 141 -> IIll(-1080390731, var9 ^ -483120696);
            case 142 -> IIll(-1080390732, var9 ^ -880388044);
            case 143 -> IIll(-1080390733, var9 ^ -2002710396);
            case 144 -> IIll(-1080390734, var9 ^ 76465157);
            case 145 -> IIll(-1080390735, var9 ^ 1967649684);
            case 146 -> IIll(-1080390736, var9 ^ -1875185736);
            case 147 -> IIll(-1080390721, var9 ^ 1847736111);
            case 148 -> IIll(-1080390722, var9 ^ -1459751744);
            case 149 -> IIll(-1080390723, var9 ^ 858261226);
            case 150 -> IIll(-1080390724, var9 ^ -1050541374);
            case 151 -> IIll(-1080390725, var9 ^ 1248693885);
            case 152 -> IIll(-1080390726, var9 ^ 124780715);
            case 153 -> IIll(-1080390727, var9 ^ -111424012);
            case 154 -> IIll(-1080390728, var9 ^ -1647785858);
            case 155 -> 4;
            case 156 -> IIll(-1080390713, var9 ^ 150742478);
            case 157 -> IIll(-1080390714, var9 ^ -1435903563);
            case 158 -> IIll(-1080390715, var9 ^ -73468709);
            case 159 -> IIll(-1080390716, var9 ^ -514802);
            case 160 -> IIll(-1080390717, var9 ^ -1394517524);
            case 161 -> IIll(-1080390718, var9 ^ -2055589136);
            case 162 -> IIll(-1080390719, var9 ^ 1677146241);
            case 163 -> IIll(-1080390720, var9 ^ 157249939);
            case 164 -> IIll(-1080390705, var9 ^ -1070371552);
            case 165 -> IIll(-1080390706, var9 ^ -152156026);
            case 166 -> IIll(-1080390707, var9 ^ -852873632);
            case 167 -> IIll(-1080390708, var9 ^ -1735147495);
            case 168 -> IIll(-1080390709, var9 ^ -1878165302);
            case 169 -> IIll(-1080390710, var9 ^ 480682174);
            case 170 -> IIll(-1080390711, var9 ^ 1203168315);
            case 171 -> IIll(-1080390712, var9 ^ 1330906698);
            case 172 -> IIll(-1080390697, var9 ^ 1250454136);
            case 173 -> IIll(-1080390698, var9 ^ -577601415);
            case 174 -> IIll(-1080390699, var9 ^ 554295668);
            case 175 -> IIll(-1080390700, var9 ^ 1891398731);
            case 176 -> IIll(-1080390701, var9 ^ 472855647);
            case 177 -> IIll(-1080390702, var9 ^ -1222158396);
            case 178 -> IIll(-1080390703, var9 ^ -1078812489);
            case 179 -> IIll(-1080390704, var9 ^ 1045559606);
            case 180 -> IIll(-1080390689, var9 ^ -1719248172);
            case 181 -> IIll(-1080390690, var9 ^ 2035975133);
            case 182 -> IIll(-1080390691, var9 ^ 181655507);
            case 183 -> IIll(-1080390692, var9 ^ 1614421169);
            case 184 -> IIll(-1080390693, var9 ^ 2088681969);
            case 185 -> IIll(-1080390694, var9 ^ 1244177214);
            case 186 -> IIll(-1080390695, var9 ^ 496253714);
            case 187 -> IIll(-1080390696, var9 ^ -283003208);
            case 188 -> IIll(-1080390681, var9 ^ -1732164845);
            case 189 -> IIll(-1080390682, var9 ^ -566518763);
            case 190 -> IIll(-1080390683, var9 ^ 1448492750);
            case 191 -> IIll(-1080390684, var9 ^ 1805882490);
            case 192 -> IIll(-1080390685, var9 ^ 167364888);
            case 193 -> IIll(-1080390686, var9 ^ -1002411817);
            case 194 -> IIll(-1080390687, var9 ^ 411347619);
            case 195 -> IIll(-1080390688, var9 ^ -1946782347);
            case 196 -> IIll(-1080390673, var9 ^ -1425925588);
            case 197 -> IIll(-1080390674, var9 ^ -2023014403);
            case 198 -> IIll(-1080390675, var9 ^ 1022611226);
            case 199 -> IIll(-1080390676, var9 ^ 359500222);
            case 200 -> IIll(-1080390677, var9 ^ -11099920);
            case 201 -> IIll(-1080390678, var9 ^ -244911736);
            case 202 -> IIll(-1080390679, var9 ^ -1462122163);
            case 203 -> IIll(-1080390680, var9 ^ 753191539);
            case 204 -> IIll(-1080390665, var9 ^ -601274734);
            case 205 -> IIll(-1080390666, var9 ^ -1093514423);
            case 206 -> IIll(-1080390667, var9 ^ -654678167);
            case 207 -> IIll(-1080390668, var9 ^ 1458745939);
            case 208 -> IIll(-1080390669, var9 ^ 581049426);
            case 209 -> IIll(-1080390670, var9 ^ 1744259894);
            case 210 -> IIll(-1080390671, var9 ^ -2030699702);
            case 211 -> IIll(-1080390672, var9 ^ 1987075121);
            case 212 -> IIll(-1080390657, var9 ^ 1632973038);
            case 213 -> IIll(-1080390658, var9 ^ -1185578718);
            case 214 -> IIll(-1080390659, var9 ^ -883886869);
            case 215 -> IIll(-1080390660, var9 ^ 1319345476);
            case 216 -> IIll(-1080390661, var9 ^ -69602256);
            case 217 -> IIll(-1080390662, var9 ^ 557767976);
            case 218 -> IIll(-1080390663, var9 ^ 1519049711);
            case 219 -> IIll(-1080390664, var9 ^ -102667981);
            case 220 -> IIll(-1080391161, var9 ^ -1799557048);
            case 221 -> IIll(-1080391162, var9 ^ 471183506);
            case 222 -> IIll(-1080391163, var9 ^ 1817043958);
            case 223 -> IIll(-1080391164, var9 ^ 1501545482);
            case 224 -> IIll(-1080391165, var9 ^ 2023266322);
            case 225 -> IIll(-1080391166, var9 ^ -1031810788);
            case 226 -> IIll(-1080391167, var9 ^ -2129265848);
            case 227 -> 0;
            case 228 -> IIll(-1080391168, var9 ^ 1343667661);
            case 229 -> IIll(-1080391153, var9 ^ 699338062);
            case 230 -> IIll(-1080391154, var9 ^ 1868221891);
            case 231 -> IIll(-1080391155, var9 ^ -1652217907);
            case 232 -> IIll(-1080391156, var9 ^ 1666566554);
            case 233 -> IIll(-1080391157, var9 ^ 85004896);
            case 234 -> IIll(-1080391158, var9 ^ 965242359);
            case 235 -> IIll(-1080391159, var9 ^ 436820252);
            case 236 -> IIll(-1080391160, var9 ^ 1716037469);
            case 237 -> IIll(-1080391145, var9 ^ 492946737);
            case 238 -> IIll(-1080391146, var9 ^ -710158018);
            case 239 -> IIll(-1080391147, var9 ^ 1504097212);
            case 240 -> IIll(-1080391148, var9 ^ -1480114502);
            case 241 -> IIll(-1080391149, var9 ^ -70303355);
            case 242 -> IIll(-1080391150, var9 ^ 1507080476);
            case 243 -> 1;
            case 244 -> IIll(-1080391151, var9 ^ 1216731299);
            case 245 -> IIll(-1080391152, var9 ^ 1100698628);
            case 246 -> IIll(-1080391137, var9 ^ 394909507);
            case 247 -> IIll(-1080391138, var9 ^ -1038463908);
            case 248 -> IIll(-1080391139, var9 ^ -893669382);
            case 249 -> IIll(-1080391140, var9 ^ -835034500);
            case 250 -> IIll(-1080391141, var9 ^ 543008486);
            case 251 -> IIll(-1080391142, var9 ^ -1666588693);
            case 252 -> IIll(-1080391143, var9 ^ 1465925413);
            case 253 -> IIll(-1080391144, var9 ^ 1701403257);
            case 254 -> IIll(-1080391129, var9 ^ -1696733179);
            default -> IIll(-1080391130, var9 ^ -1434203231);
         };
         int var5 = (var1 & IIll(-1080391131, var9 ^ 654196905)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIll(-1080391132, var9 ^ -1410612800)) >>> IIll(-1080391133, var9 ^ -1223558685)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIll(-1080391134, var9 ^ 571427632);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIll(-1080391135, var9 ^ 639204038);
            }
         }

         ll[var2] = new String(var3).intern();
      }

      return ll[var2];
   }
}
