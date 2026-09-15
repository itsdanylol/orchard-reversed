package k74.x;

import k74.y.lIlIlllI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1294;
import net.minecraft.class_310;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class IIlIlllI extends IlIIIIIIl {
   private static final String[] I;
   private static final double II = 1.0E-4;
   private boolean Il;
   private static final Object[] IIlI;
   private static final double lI = 0.09;
   private static final float ll = 45.0F;
   private static String[] III;
   private boolean IIl;
   private boolean IlI;
   private final IllIII<IIIIIlI> Ill;
   private static final String[] IIIl;
   private static final int[] IIII;
   private boolean lII;
   private final lllIIlII lIl;
   private static final String[] llI;
   private static final double lll = 1.0E-5;

   private static int IIlI(int var0, int var1) {
      int var2 = IIII[var0 ^ 968788297] ^ var1 ^ var0;
      var2 -= 52792;
      var2 += 57879;
      var2 ^= 55959;
      var2 ^= 2665;
      var2 -= 16705;
      var2 += 60968;
      var2 += 38900;
      var2 += 36067;
      return var2 - 51245;
   }

   private int I(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         int var2 = 0;
         if (var1.field_1690.field_1894.method_1434()) {
            var2++;
         }

         if (var1.field_1690.field_1881.method_1434()) {
            var2++;
         }

         if (var1.field_1690.field_1913.method_1434()) {
            var2++;
         }

         if (var1.field_1690.field_1849.method_1434()) {
            var2++;
         }

         return var2;
      } else {
         return 0;
      }
   }

   private void II(class_310 var1, double var2) {
      if (var1 != null && var1.field_1724 != null && var1.field_1690 != null && var2 != 0.0) {
         double var4 = this.Il(var1);
         if (!Double.isNaN(var4)) {
            var1.field_1724.method_18799(var1.field_1724.method_18798().method_1031(-Math.sin(var4) * var2, 0.0, Math.cos(var4) * var2));
         }
      }
   }

   private double Il(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      float var3 = 0.0F;
      if (var1.field_1690.field_1894.method_1434()) {
         var3++;
      }

      if (var1.field_1690.field_1881.method_1434()) {
         var3--;
      }

      float var4 = 0.0F;
      if (var1.field_1690.field_1913.method_1434()) {
         var4++;
      }

      if (var1.field_1690.field_1849.method_1434()) {
         var4--;
      }

      if (var3 == 0.0F && var4 == 0.0F) {
         return Double.NaN;
      } else {
         float var5 = var1.field_1724.method_36454();
         if (var3 < 0.0F) {
            var5 += 180.0F;
         }

         float var6;
         label50: {
            var6 = 1.0F;
            if (var3 < 0.0F) {
               var6 = -0.5F;
               if (var2 == null) {
                  break label50;
               }
            }

            if (var3 > 0.0F) {
               var6 = 0.5F;
            }
         }

         if (var4 > 0.0F) {
            var5 -= 90.0F * var6;
         }

         if (var4 < 0.0F) {
            var5 += 90.0F * var6;
         }

         return Math.toRadians(var5);
      }
   }

   public IIlIlllI() {
      super(IlIIllIII.Ill(III[1]), lllIIlIl.III, IlIIllIII.Ill(III[2]));
      this.Ill = this.IllIIll(new IllIII<>(IlIIllIII.Ill(III[3]), IIIIIlI.class, IIIIIlI.I));
      this.lIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(III[0]), true));
   }

   private static String lI(char[] var0, long var1, int var3) {
      int var4 = IIlI(968788297, 318681356 ^ -1719993101) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIlI(968788296, 318681356 ^ -481349478);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private boolean ll(class_310 var1) {
      return this.lII(var1)
         && var1.field_1724.method_7344().method_7586() >= IIlI(968788299, -276376836 ^ -118025830)
         && !var1.field_1724.method_6059(class_1294.field_5919);
   }

   private static void III() {
      int var0 = -431475762;
      III[0] = lI(IIII(IIlI(968788298, var0 ^ -1674125798), IIlI(968788301, var0 ^ -42343783)).toCharArray(), 8657L, IIlI(968788300, var0 ^ 585598541));
      III[1] = lI(IIII(IIlI(968788303, var0 ^ -1423625269), IIlI(968788302, var0 ^ 1516392189)).toCharArray(), 26597L, IIlI(968788289, var0 ^ 922365643));
      III[2] = lI(IIII(IIlI(968788288, var0 ^ 546160834), IIlI(968788291, var0 ^ 85175902)).toCharArray(), 36786L, IIlI(968788290, var0 ^ -1742212174));
      III[3] = lI(IIII(IIlI(968788293, var0 ^ 1752032009), IIlI(968788292, var0 ^ 567443031)).toCharArray(), 65513L, IIlI(968788295, var0 ^ 1490302173));
   }

   private static String IIll(char var0, byte var1, int var2, short var3, char var4, int var5, int var6) {
      int var11 = var5 ^ -2010806672;
      char[] var10 = IIIl[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])IIlI[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         IIlI[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 21633;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ var9 ^ 26510 ^ switch (var9 % 13) {
            default -> 169;
            case 1 -> 221;
            case 2 -> 156;
            case 3 -> 72;
            case 4 -> 84;
            case 5 -> 128;
            case 6 -> 89;
            case 7 -> 136;
            case 8 -> 216;
            case 9 -> 15;
            case 10 -> 118;
            case 11 -> 199;
            case 12 -> 89;
         } ^ var0 ^ var4 ^ var3 ^ var2 ^ var8 ^ var1 ^ var6 ^ var5);
      }

      return new String(var10).intern();
   }

   private void IIl() {
      this.IIl = false;
      this.lII = false;
      this.Il = false;
      this.IlI = false;
   }

   private boolean Ill() {
      this.Il = true;
      return true;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 1485493927;
      char[] var9 = "䕁䔵".toCharArray();
      byte var14 = -1;
      short var7 = 17752;
      String var8 = "靼咡㮊藂硃ḱ핝ﲱ艠\ud8f2押⯽ᦸ\uf441뺸ⲯ\ue28f뽃㮑꒧ꓡ堶溅병ꒈ襰䡰貚\u0dfa鈆\uf550\uf62a籿\uf73a类뚦뺷དᨧწ⭒\u0379韠ྛ\ue5a8虎ፀ\uf055鰦\udc4e㾝᛫괱虰嘋Ҕㅷ\ue1e3\ueaa2с源쐓\udc61톛훜ǿ\udc3b쏡郲˭ፅ䒇ೠ\uee87窉锴箢ኃ艦濲櫖\ue53e\ue4f0戼릖１衶뷗⧻\ud953㎝珣넩蘹㼄甮⏖篫ʋ扃钲\udcef‹姬构Ή\u0b59᧹ጀ㘁転凯냮ḕ\ue75f\u0cfa뗆\uec8f⚛揺颳钱즌㽳۽똈\ue4ca䄍㬬藇⾏屵摺祪";
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            IIIl = var10;
            IIlI = new Object[var10.length];
            int var22 = 0;
            IIII = new int[285];
            int var10001 = 0;
            byte[] var10002 = "i+£y©\u008av\u0012OJ5ü\"E6_C\u000b¤S\u0096\u00145í\u0015VÛ\u008cä\u0011\u0084^ùéP\r\u009eþ(\u0088»aÅaaV{ÒÖ\u001e\u000bA\u009f \u0017XÑ¨Q¼\u001f©Ür\u0085\u0084e¸\u0012\t\u0081u,ÆçAÀ©`ì4j³Bu¼Ë\u0096lXnÏ\u009e\u000b!º\u0010W\u001dÃ\u007f\u0095`Y«ø\u0080_\u0088\u000fD\u0011i\u001dûi\u000eu\u0019\u008cÿ\u001cû\u001e9|â¸úê\u0092¶/Üc\u00adü£,\u000f´ÐÎÿã\u009a7¨-?>)\u001d\u0084HÄ\u009b|r{V³G\u009a®*ñÊ¨\u0089\u0018K»¢\u0011XÃ½^\u001b@¥CÌ#\u0087ùÇþ\u000e\u0082ÆQþ\u0094$\u001e/E~Gi\u0082ÝZ\u0082ÁÄ1,\u001fêSÃaÄÐ=v\u0001Ô\u009að5\u0095×£Ë\u0092÷\u0018´$\u000bqù¶^Cµ®c\u0010mâ¢7\u0084·\u001e\ng\u0002\u009cÿ«&0WX2¡ô·P\u000f·b|Z¾ÚÎçÓzü#VUîOÀÄ\u001e¡_\u000eì¸9i;\u009d5Ìè³9¶h\u0016ã\u0084õy]x[\u00997ú\u0081\u009d\u0002\u008eÛfz'¯¥?m¿º0\u008b5×JQì\u007f\u0010ê´tÞ\u00ad\u0014Àu\u0092³om¹\u001die±ï5ÄBúÁ\u0015\u001a:\u0001m4Ç(\u0086\u0002OiÜ¸!{ï|d\u008dPÏM\u0088*)\u0013\"ì\u0094æ¡:dH¿¨\u00adËH\bæ\u009f£ý\u0010ÿìû\u0019\u008f\rt¯FtlO¹Í\u0088Ê¾\u001d%\u0004UA9\u000bG&9÷z0N\\Ô\u009a:\u0086\u009b\u0002'vo¤\u001fÌ\fJ<ö\u009c\u0007XÛ\u009dÌJ\u0011f\u009fñ\u0016*íeê+N÷\u001a\u001eg´\u009a\u009aÁä¢ö±E|R\u001aà\u0014\u001fpÿbaqa\u0018(´ZÀÿ5Ã\u0083*JVSo±÷\u0091Ák\r\u0005J6×¥ñäwYböÉivÿEbª#^«ï½\u007fº\u008f\u000eö§¯ù\"nÜ¡m'\u001eH?W\u0001lg¡\u000f\u0082Ö\u009e\u0000È:Ëù1\u009a\u0090\u000fõ \u0092\u001c»\u000bîq\u0081\u0018Cô\u008d\u0010åûø\u001e\u0098KÑì\u001b^ïÙ\u0019³¥\u0084åÖ³òÞó\u001czhnÕ\u001cg\u000f&ëñÚ\u0094»´¦\u0019\u0006\u001a\u0016bEêW=?\u0081;UÐè»\"æ`×\rÝÙ¯\u000eª~÷)«C3!\u001aØE\u0097G\u0093\u0081úF¥\u000b8\u0085\u0081\u001d\u0094oÆ\u0005\u0086\u0006$ÑyFó\u0095\u0018ý|ÐÔ¢Ó\t,¹\u0084\u0012\u0088Wkå£/y| øY\u009b·\u0004oóR,\u00ad³û\rãã½¡\"\u0002Ð\u0016\u0088U? (\u009aÃT½P$z0®éê²²øS\u009e\u0005\u009b}DG~Vø²9Û\u0095\f·\u001dáÈB\u0085E;<êÏ\u000fÄb%Ýe\u0015\u0002»^Îów½R\u009bÞr*\u001dN\u0018%ÂÙ®\u0002¶^\u001cøjß\"?\u000eµx«+N\u0000\u0089©¿\u0092ÄwÒ\u0096m\u0007´ÔúdÐ\u008e\u0013°ÕÝl ûî\u0011^ç\u0093AKëy]heà\u00998Wl{UA\u0083\u008f!º\u000f\u0013¸\u0004\tèæ\u009f\u0080\u0094\u0010oP¢©´=¤Jq\t\u0014Ò+`î9\u0081\u009c\u000eqÚá\u0080µË~WæÀ+\u0013\u000bí\u000e\u008eÞ\u0011OÏ\u0086ÆÅò8óÈ9\u0084\u001e\u0004:%îÞñ\u0013¤\u0019\u0011\u009a.\u000fØ\u0098?ÿ'\u0010}ô*£·>s\u009aP\u0093X;«M\\!o\u0018ZëBXê$:N\f\t@\u008b\u008aÒÆ\u0001N\b!¾\u00adÝK\u0004½ê÷Fí©0\u0004N\u0082(Ö¾^Ð]â\u0092b\u0099ðSl´ÔÀ\u0012mÊ8A(§\u0090tëî¦E-D\u0011½dÁÏ.9¢0ÝçÚ*\u0088$ÔöÁÌo j\u001d\u008dU\u001e\u0080Õ\u0092Ô¢®Ûe,ÀÆÜOïA\u0089S&-ã\u0017Wô\u0010\u0091Kî\u0094Ö¶åº·¾óõ Åàæµü\u000e×\u001d\u0006\u0081\u0085,\u0016¼b\u0011Y0J«Ì\u0091µ!¢p|p+á\u0084Ú\u0095|5ª5þLÊÀ\u0001\u008fö\u0096\u0011\u0086\u008f\\å` èv"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               IIII[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1636078211;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var5 = new String[4];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IIll((char)'\ue1e2', (byte)-5, -713597982, (short)30632, '꓅', -2010806672, 2135212624)).length();
            int var1 = IIlI(968788059, var18 ^ -2053294177);
            int var20 = -1;

            label104:
            while (true) {
               var22 = IIlI(968788058, var18 ^ 1654683903);
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
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % IIlI(968788063, var18 ^ 2093025997)) {
                           case 0 -> IIlI(968788062, var18 ^ -2073316176);
                           case 1 -> IIlI(968788049, var18 ^ 890967113);
                           case 2 -> 4;
                           case 3 -> IIlI(968788048, var18 ^ 1283187191);
                           case 4 -> IIlI(968788051, var18 ^ -1891125496);
                           case 5 -> IIlI(968788050, var18 ^ -2042725037);
                           default -> IIlI(968788053, var18 ^ 1620167102);
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
                           llI = var5;
                           I = new String[4];
                           III = new String[4];
                           III();
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

                        var4 = (var2 = IIll('㦴', (byte)-116, 1792346358, 31452, (char)'쌞', -2010806671, -1052817595)).length();
                        var1 = IIlI(968788061, var18 ^ 1243278728);
                        var20 = -1;
                  }

                  var22 = IIlI(968788060, var18 ^ -1248820369);
                  var27 = var2.substring(++var20, var20 + var1);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 6;
                  case 1 -> 185;
                  case 2 -> 180;
                  case 3 -> 62;
                  case 4 -> 111;
                  case 5 -> 246;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private boolean lII(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1690 != null
         && var1.method_1562() != null
         && var1.field_1724.method_5805()
         && !var1.field_1724.method_5715()
         && !var1.field_1724.method_6115()
         && !var1.field_1724.method_5799()
         && !var1.field_1724.method_5771()
         && !var1.field_1724.method_6101();
   }

   public boolean l(class_310 var1) {
      if (!this.IIIIlIl() || this.Ill.IllI() != IIIIIlI.IIl) {
         return false;
      } else {
         return var1 != null && var1.field_1724 != null && var1.field_1690 != null ? var1.field_1724.method_24828() && this.lIl(var1) && this.ll(var1) : false;
      }
   }

   private boolean lIl(class_310 var1) {
      return this.I(var1) > 0;
   }

   @Override
   public void IlIII() {
      this.IIl();
   }

   @Override
   public void llIl() {
      this.IIl();
   }

   private void llI(class_310 var1) {
      boolean var2 = var1.field_1724.method_24828();
      double var3 = var1.field_1724.method_18798().field_1351;
      if (var2) {
         this.lII = false;
         this.Il = false;
         this.IlI = true;
      } else {
         if (this.IlI && var3 > 0.09 && this.lIl(var1)) {
            this.lII = true;
         }

         this.IlI = false;
         if (this.lII && !this.Il && !IIll.lIllIl(var1.field_1724) && !(var3 < 1.0E-4) && !(var3 > 0.09)) {
            double var5 = this.Il(var1);
            if (!Double.isNaN(var5)) {
               float var7 = class_3532.method_15393((float)Math.toDegrees(var5) + 45.0F);
               IlllIlII.IIIll(var1, IIlI(968788294, 918328794 ^ 1898888979), var7, var1.field_1724.method_36455(), this::Ill);
            }
         }
      }
   }

   public boolean lll(class_310 var1) {
      if (!this.IIIIlIl() || this.Ill.IllI() != IIIIIlI.IIl) {
         return false;
      } else {
         return var1 != null && var1.field_1724 != null && var1.field_1690 != null ? var1.field_1690.field_1894.method_1434() && this.ll(var1) : false;
      }
   }

   private static String IIII(int var0, int var1) {
      int var9 = 1990436987;
      int var2 = (var0 ^ IIlI(968788313, var9 ^ -1424222631)) & IIlI(968788312, var9 ^ 1016127386);
      if (I[var2] == null) {
         char[] var3 = llI[var2].toCharArray();

         int var4 = switch (var3[0] & IIlI(968788315, var9 ^ 39762093)) {
            case 0 -> IIlI(968788314, var9 ^ -298762558);
            case 1 -> IIlI(968788317, var9 ^ 452127506);
            case 2 -> IIlI(968788316, var9 ^ 1529123955);
            case 3 -> IIlI(968788319, var9 ^ 1119891711);
            case 4 -> IIlI(968788318, var9 ^ -1332511137);
            case 5 -> IIlI(968788305, var9 ^ 1053770701);
            case 6 -> IIlI(968788304, var9 ^ 1359822443);
            case 7 -> IIlI(968788307, var9 ^ -2057249195);
            case 8 -> 4;
            case 9 -> IIlI(968788306, var9 ^ -1500046731);
            case 10 -> IIlI(968788309, var9 ^ 1199940968);
            case 11 -> IIlI(968788308, var9 ^ 552420864);
            case 12 -> IIlI(968788311, var9 ^ -779836598);
            case 13 -> IIlI(968788310, var9 ^ 400866563);
            case 14 -> IIlI(968788329, var9 ^ -730674050);
            case 15 -> IIlI(968788328, var9 ^ 21249524);
            case 16 -> IIlI(968788331, var9 ^ -767856121);
            case 17 -> IIlI(968788330, var9 ^ -1706520322);
            case 18 -> IIlI(968788333, var9 ^ -855479921);
            case 19 -> IIlI(968788332, var9 ^ 61302359);
            case 20 -> IIlI(968788335, var9 ^ 857478690);
            case 21 -> IIlI(968788334, var9 ^ -1243337611);
            case 22 -> IIlI(968788321, var9 ^ 2016090187);
            case 23 -> IIlI(968788320, var9 ^ -2135773205);
            case 24 -> IIlI(968788323, var9 ^ -2045687850);
            case 25 -> IIlI(968788322, var9 ^ -1791340829);
            case 26 -> IIlI(968788325, var9 ^ -316342237);
            case 27 -> 3;
            case 28 -> IIlI(968788324, var9 ^ 1849499105);
            case 29 -> IIlI(968788327, var9 ^ 220176804);
            case 30 -> IIlI(968788326, var9 ^ -795419282);
            case 31 -> IIlI(968788345, var9 ^ 2137443010);
            case 32 -> IIlI(968788344, var9 ^ 817306367);
            case 33 -> IIlI(968788347, var9 ^ 1777458420);
            case 34 -> IIlI(968788346, var9 ^ 1947901735);
            case 35 -> IIlI(968788349, var9 ^ 531906662);
            case 36 -> IIlI(968788348, var9 ^ 2103131938);
            case 37 -> IIlI(968788351, var9 ^ -22730498);
            case 38 -> IIlI(968788350, var9 ^ -100489134);
            case 39 -> IIlI(968788337, var9 ^ -1152385569);
            case 40 -> IIlI(968788336, var9 ^ -1133558188);
            case 41 -> IIlI(968788339, var9 ^ 177417821);
            case 42 -> IIlI(968788338, var9 ^ -1731846830);
            case 43 -> IIlI(968788341, var9 ^ -2131014100);
            case 44 -> IIlI(968788340, var9 ^ -868587477);
            case 45 -> IIlI(968788343, var9 ^ -1719249466);
            case 46 -> IIlI(968788342, var9 ^ 738500929);
            case 47 -> IIlI(968788233, var9 ^ 145230196);
            case 48 -> IIlI(968788232, var9 ^ 473541313);
            case 49 -> IIlI(968788235, var9 ^ 2123884692);
            case 50 -> IIlI(968788234, var9 ^ 1388503198);
            case 51 -> IIlI(968788237, var9 ^ -528512156);
            case 52 -> IIlI(968788236, var9 ^ -759494260);
            case 53 -> IIlI(968788239, var9 ^ -1059612451);
            case 54 -> IIlI(968788238, var9 ^ 809042170);
            case 55 -> IIlI(968788225, var9 ^ -1038063993);
            case 56 -> IIlI(968788224, var9 ^ 352676690);
            case 57 -> IIlI(968788227, var9 ^ -970233972);
            case 58 -> IIlI(968788226, var9 ^ 1183759457);
            case 59 -> IIlI(968788229, var9 ^ -606010391);
            case 60 -> IIlI(968788228, var9 ^ 1963026824);
            case 61 -> IIlI(968788231, var9 ^ -1358603260);
            case 62 -> IIlI(968788230, var9 ^ -167893850);
            case 63 -> IIlI(968788249, var9 ^ -2126683836);
            case 64 -> IIlI(968788248, var9 ^ -1860015996);
            case 65 -> IIlI(968788251, var9 ^ 458167532);
            case 66 -> IIlI(968788250, var9 ^ -1025028471);
            case 67 -> 5;
            case 68 -> IIlI(968788253, var9 ^ -1695776431);
            case 69 -> IIlI(968788252, var9 ^ 978856555);
            case 70 -> IIlI(968788255, var9 ^ -1644744094);
            case 71 -> IIlI(968788254, var9 ^ 871447157);
            case 72 -> IIlI(968788241, var9 ^ -1045586851);
            case 73 -> IIlI(968788240, var9 ^ -732345552);
            case 74 -> IIlI(968788243, var9 ^ 345584374);
            case 75 -> IIlI(968788242, var9 ^ -374286214);
            case 76 -> IIlI(968788245, var9 ^ 1643217546);
            case 77 -> IIlI(968788244, var9 ^ 266580253);
            case 78 -> IIlI(968788247, var9 ^ 1242893968);
            case 79 -> IIlI(968788246, var9 ^ 1662022841);
            case 80 -> IIlI(968788265, var9 ^ 1035646117);
            case 81 -> IIlI(968788264, var9 ^ -935762892);
            case 82 -> IIlI(968788267, var9 ^ 1713895241);
            case 83 -> IIlI(968788266, var9 ^ -439331084);
            case 84 -> IIlI(968788269, var9 ^ -1321491770);
            case 85 -> IIlI(968788268, var9 ^ -780884707);
            case 86 -> IIlI(968788271, var9 ^ -1584059540);
            case 87 -> IIlI(968788270, var9 ^ 1760309805);
            case 88 -> IIlI(968788257, var9 ^ -1755982167);
            case 89 -> IIlI(968788256, var9 ^ -1870300446);
            case 90 -> IIlI(968788259, var9 ^ 2077843744);
            case 91 -> IIlI(968788258, var9 ^ 1774084559);
            case 92 -> IIlI(968788261, var9 ^ 1420300372);
            case 93 -> IIlI(968788260, var9 ^ -100506968);
            case 94 -> IIlI(968788263, var9 ^ -1248167581);
            case 95 -> IIlI(968788262, var9 ^ 1094467616);
            case 96 -> IIlI(968788281, var9 ^ 584213726);
            case 97 -> IIlI(968788280, var9 ^ -1298201024);
            case 98 -> IIlI(968788283, var9 ^ -1286335391);
            case 99 -> IIlI(968788282, var9 ^ 1208463072);
            case 100 -> IIlI(968788285, var9 ^ 74791524);
            case 101 -> IIlI(968788284, var9 ^ 97955638);
            case 102 -> IIlI(968788287, var9 ^ 822078629);
            case 103 -> IIlI(968788286, var9 ^ -1269188086);
            case 104 -> IIlI(968788273, var9 ^ -668394525);
            case 105 -> IIlI(968788272, var9 ^ 2088943223);
            case 106 -> IIlI(968788275, var9 ^ 837329029);
            case 107 -> IIlI(968788274, var9 ^ 1340686045);
            case 108 -> IIlI(968788277, var9 ^ 103548039);
            case 109 -> IIlI(968788276, var9 ^ -777151419);
            case 110 -> IIlI(968788279, var9 ^ 80873701);
            case 111 -> IIlI(968788278, var9 ^ 1093249522);
            case 112 -> IIlI(968788425, var9 ^ -269266404);
            case 113 -> IIlI(968788424, var9 ^ 1689159981);
            case 114 -> IIlI(968788427, var9 ^ -545511145);
            case 115 -> IIlI(968788426, var9 ^ 1282316162);
            case 116 -> IIlI(968788429, var9 ^ 1483151996);
            case 117 -> IIlI(968788428, var9 ^ -2068119503);
            case 118 -> IIlI(968788431, var9 ^ -1054531097);
            case 119 -> IIlI(968788430, var9 ^ -1583961687);
            case 120 -> IIlI(968788417, var9 ^ -2124317417);
            case 121 -> IIlI(968788416, var9 ^ -231132634);
            case 122 -> IIlI(968788419, var9 ^ 818962472);
            case 123 -> IIlI(968788418, var9 ^ 804534584);
            case 124 -> IIlI(968788421, var9 ^ 555387288);
            case 125 -> IIlI(968788420, var9 ^ 777020514);
            case 126 -> IIlI(968788423, var9 ^ -676740542);
            case 127 -> IIlI(968788422, var9 ^ 560857004);
            case 128 -> IIlI(968788441, var9 ^ 841176197);
            case 129 -> IIlI(968788440, var9 ^ 1595492027);
            case 130 -> IIlI(968788443, var9 ^ -636137596);
            case 131 -> IIlI(968788442, var9 ^ -715110826);
            case 132 -> IIlI(968788445, var9 ^ 1699328657);
            case 133 -> IIlI(968788444, var9 ^ 1886881606);
            case 134 -> IIlI(968788447, var9 ^ -1656890394);
            case 135 -> IIlI(968788446, var9 ^ -131355476);
            case 136 -> IIlI(968788433, var9 ^ -578542448);
            case 137 -> IIlI(968788432, var9 ^ 1078805360);
            case 138 -> IIlI(968788435, var9 ^ 566146374);
            case 139 -> IIlI(968788434, var9 ^ -200481528);
            case 140 -> IIlI(968788437, var9 ^ -2004789085);
            case 141 -> IIlI(968788436, var9 ^ 955915171);
            case 142 -> IIlI(968788439, var9 ^ 2040881451);
            case 143 -> IIlI(968788438, var9 ^ 365793239);
            case 144 -> IIlI(968788457, var9 ^ -1782925129);
            case 145 -> IIlI(968788456, var9 ^ -107641995);
            case 146 -> IIlI(968788459, var9 ^ -2120813220);
            case 147 -> IIlI(968788458, var9 ^ -642648970);
            case 148 -> IIlI(968788461, var9 ^ 498680375);
            case 149 -> IIlI(968788460, var9 ^ 1796153188);
            case 150 -> IIlI(968788463, var9 ^ -1352525420);
            case 151 -> IIlI(968788462, var9 ^ 631299018);
            case 152 -> IIlI(968788449, var9 ^ 856437084);
            case 153 -> IIlI(968788448, var9 ^ 723409207);
            case 154 -> IIlI(968788451, var9 ^ -2025022);
            case 155 -> IIlI(968788450, var9 ^ -1149197313);
            case 156 -> IIlI(968788453, var9 ^ -28508674);
            case 157 -> IIlI(968788452, var9 ^ 666165631);
            case 158 -> IIlI(968788455, var9 ^ 1007683686);
            case 159 -> IIlI(968788454, var9 ^ -885296877);
            case 160 -> IIlI(968788473, var9 ^ 1387833062);
            case 161 -> IIlI(968788472, var9 ^ -1255187968);
            case 162 -> IIlI(968788475, var9 ^ -573934862);
            case 163 -> IIlI(968788474, var9 ^ -1654435162);
            case 164 -> IIlI(968788477, var9 ^ -853147722);
            case 165 -> IIlI(968788476, var9 ^ 742934782);
            case 166 -> IIlI(968788479, var9 ^ 2074574415);
            case 167 -> IIlI(968788478, var9 ^ -1269101496);
            case 168 -> IIlI(968788465, var9 ^ 2126259444);
            case 169 -> IIlI(968788464, var9 ^ -2140031798);
            case 170 -> IIlI(968788467, var9 ^ -1671427224);
            case 171 -> IIlI(968788466, var9 ^ 721625693);
            case 172 -> IIlI(968788469, var9 ^ 1776683132);
            case 173 -> IIlI(968788468, var9 ^ -1667136342);
            case 174 -> IIlI(968788471, var9 ^ 573522800);
            case 175 -> IIlI(968788470, var9 ^ -421864478);
            case 176 -> 0;
            case 177 -> 2;
            case 178 -> IIlI(968788361, var9 ^ 363115087);
            case 179 -> IIlI(968788360, var9 ^ 559692950);
            case 180 -> IIlI(968788363, var9 ^ -201503959);
            case 181 -> IIlI(968788362, var9 ^ -1782148869);
            case 182 -> IIlI(968788365, var9 ^ 1495600186);
            case 183 -> IIlI(968788364, var9 ^ -253070122);
            case 184 -> IIlI(968788367, var9 ^ 1619033033);
            case 185 -> IIlI(968788366, var9 ^ -147432302);
            case 186 -> IIlI(968788353, var9 ^ 1887741627);
            case 187 -> IIlI(968788352, var9 ^ -239443471);
            case 188 -> IIlI(968788355, var9 ^ -1679756377);
            case 189 -> IIlI(968788354, var9 ^ 1620629329);
            case 190 -> IIlI(968788357, var9 ^ -1861576001);
            case 191 -> IIlI(968788356, var9 ^ -66178069);
            case 192 -> 1;
            case 193 -> IIlI(968788359, var9 ^ -1706253089);
            case 194 -> IIlI(968788358, var9 ^ -32092962);
            case 195 -> IIlI(968788377, var9 ^ -79350950);
            case 196 -> IIlI(968788376, var9 ^ -713666658);
            case 197 -> IIlI(968788379, var9 ^ -922017821);
            case 198 -> IIlI(968788378, var9 ^ -975109199);
            case 199 -> IIlI(968788381, var9 ^ 1266206228);
            case 200 -> IIlI(968788380, var9 ^ 2046043543);
            case 201 -> IIlI(968788383, var9 ^ 1864093977);
            case 202 -> IIlI(968788382, var9 ^ -1802023675);
            case 203 -> IIlI(968788369, var9 ^ 714190955);
            case 204 -> IIlI(968788368, var9 ^ -1323774847);
            case 205 -> IIlI(968788371, var9 ^ 1103690300);
            case 206 -> IIlI(968788370, var9 ^ -1700398290);
            case 207 -> IIlI(968788373, var9 ^ 1603357216);
            case 208 -> IIlI(968788372, var9 ^ 100184311);
            case 209 -> IIlI(968788375, var9 ^ -1358671597);
            case 210 -> IIlI(968788374, var9 ^ -193339764);
            case 211 -> IIlI(968788393, var9 ^ -437909335);
            case 212 -> IIlI(968788392, var9 ^ -290239184);
            case 213 -> IIlI(968788395, var9 ^ -1013524888);
            case 214 -> IIlI(968788394, var9 ^ 1071093554);
            case 215 -> IIlI(968788397, var9 ^ -396514278);
            case 216 -> IIlI(968788396, var9 ^ -581933366);
            case 217 -> IIlI(968788399, var9 ^ 815555892);
            case 218 -> IIlI(968788398, var9 ^ -1069109298);
            case 219 -> IIlI(968788385, var9 ^ -1971236960);
            case 220 -> IIlI(968788384, var9 ^ 9930245);
            case 221 -> IIlI(968788387, var9 ^ 291993917);
            case 222 -> IIlI(968788386, var9 ^ 1399617009);
            case 223 -> IIlI(968788389, var9 ^ -1717162736);
            case 224 -> IIlI(968788388, var9 ^ 2114650264);
            case 225 -> IIlI(968788391, var9 ^ -2049637530);
            case 226 -> IIlI(968788390, var9 ^ 1098909168);
            case 227 -> IIlI(968788409, var9 ^ 1824568499);
            case 228 -> IIlI(968788408, var9 ^ 349590171);
            case 229 -> IIlI(968788411, var9 ^ 1846793282);
            case 230 -> IIlI(968788410, var9 ^ -392621712);
            case 231 -> IIlI(968788413, var9 ^ 254210773);
            case 232 -> IIlI(968788412, var9 ^ 1704780457);
            case 233 -> IIlI(968788415, var9 ^ -639716558);
            case 234 -> IIlI(968788414, var9 ^ 513544365);
            case 235 -> IIlI(968788401, var9 ^ 105832731);
            case 236 -> IIlI(968788400, var9 ^ -20595712);
            case 237 -> IIlI(968788403, var9 ^ 1275178647);
            case 238 -> IIlI(968788402, var9 ^ 1110215607);
            case 239 -> IIlI(968788405, var9 ^ 1022727529);
            case 240 -> IIlI(968788404, var9 ^ 1873869016);
            case 241 -> IIlI(968788407, var9 ^ 1517531245);
            case 242 -> IIlI(968788406, var9 ^ 1807031146);
            case 243 -> IIlI(968788041, var9 ^ -1812160664);
            case 244 -> IIlI(968788040, var9 ^ 10616143);
            case 245 -> IIlI(968788043, var9 ^ -209747129);
            case 246 -> IIlI(968788042, var9 ^ -1497592864);
            case 247 -> IIlI(968788045, var9 ^ -279695153);
            case 248 -> IIlI(968788044, var9 ^ 1149621188);
            case 249 -> IIlI(968788047, var9 ^ 806914712);
            case 250 -> IIlI(968788046, var9 ^ -96798823);
            case 251 -> IIlI(968788033, var9 ^ 1270128396);
            case 252 -> IIlI(968788032, var9 ^ -220745666);
            case 253 -> IIlI(968788035, var9 ^ -1479837410);
            case 254 -> IIlI(968788034, var9 ^ -846264071);
            default -> IIlI(968788037, var9 ^ 1040782620);
         };
         int var5 = (var1 & IIlI(968788036, var9 ^ -1169233898)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIlI(968788039, var9 ^ -1808867069)) >>> IIlI(968788038, var9 ^ -608658934)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIlI(968788057, var9 ^ -936533280);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIlI(968788056, var9 ^ -108701586);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }

   @Override
   public void IllIll(class_310 var1) {
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1690 != null && var1.method_1562() != null) {
         if (this.lIl.IllI()) {
            ((lIlIlllI)var1.field_1724).ilovcats$setJumpingCooldown(0);
         }

         if (this.lII(var1) && this.Ill.IllI() == IIIIIlI.I) {
            this.IIIl(var1);
            this.llI(var1);
         } else {
            this.IIl = false;
            this.lII = false;
            this.Il = false;
            this.IlI = var1.field_1724.method_24828();
         }
      } else {
         this.IIl();
      }
   }

   private void IIIl(class_310 var1) {
      if (!var1.field_1690.field_1903.method_1434() || !var1.field_1724.method_24828()) {
         this.IIl = false;
      } else if (!this.IIl && this.lIl(var1)) {
         this.II(var1, 1.0E-5);
         this.IIl = true;
      }
   }
}
