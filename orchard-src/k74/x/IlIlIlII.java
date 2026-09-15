package k74.x;

import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class IlIlIlII extends IlIIIIIIl implements IIIIIlII {
   private final IIlIII I;
   private static final Object[] IIII;
   private final IIlIII II;
   private static final String[] Il;
   private static final String[] lI;
   private double ll;
   private static final int[] llI;
   private static final IIIllIIl III;
   private static String[] IIl;
   private static final String[] lll;
   private static final double IlI = 7.0;
   private static final double Ill = 4.0;
   private final IIlIII lII;
   private static final double lIl = 18.0;

   private static String lIl(int var0, int var1) {
      int var3 = var0 ^ 761358205;
      char[] var4 = lll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIII[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIII[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1146605941;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 140;
            case 1 -> 51;
            case 2 -> 230;
            case 3 -> 62;
            case 4 -> 9;
            case 5 -> 6;
            case 6 -> 40;
            case 7 -> 155;
            case 8 -> 143;
            case 9 -> 226;
            case 10 -> 7;
            case 11 -> 197;
            case 12 -> 244;
            case 13 -> 67;
            case 14 -> 150;
            case 15 -> 149;
            case 16 -> 30;
            case 17 -> 126;
            case 18 -> 174;
            case 19 -> 54;
            case 20 -> 250;
            case 21 -> 241;
            case 22 -> 236;
            case 23 -> 41;
            case 24 -> 155;
            case 25 -> 246;
            case 26 -> 173;
            case 27 -> 88;
            case 28 -> 252;
            case 29 -> 65;
            case 30 -> 131;
            case 31 -> 232;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static void I(class_332 var0, class_327 var1, String var2, double var3, double var5) {
      IlIIlllIl.IIll(var0, var1, var2, var3, var5, IIIlIllII.lII(lII(1687722897, 1372322536 ^ 2025062555)));
   }

   private static int lII(int var0, int var1) {
      int var2 = llI[var0 ^ 1687722897] ^ var1 ^ var0;
      var2 -= 46931;
      var2 ^= 52671;
      var2 ^= 7193;
      var2 -= 53499;
      var2 -= 20839;
      var2 ^= 43846;
      return var2 + 5256;
   }

   @Override
   public double lll() {
      return this.lII.IllI();
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      this.l(var1, false);
   }

   @Override
   public double ll() {
      return this.II.IllI();
   }

   @Override
   public void lllI(double var1, double var3) {
      this.lII.Ill(Math.max(0.0, var1));
      this.II.Ill(Math.max(0.0, var3));
   }

   @Override
   public void IIIII(class_332 var1, int var2, int var3, float var4) {
      this.l(var1, false);
   }

   private void l(class_332 var1, boolean var2) {
      class_310 var3 = class_310.method_1551();
      if (var1 != null && var3 != null && var3.field_1772 != null) {
         double var4 = this.III();
         double var6 = this.lll();
         double var8 = this.ll();
         class_327 var10 = var3.field_1772;
         String var11 = IlIIllIII.lI(IIl[lII(1687722896, -1393600066 ^ 386655932)]);
         String var12 = this.Ill();
         double var13 = this.IIl(var10, var12);
         IlIIlllIl.IIllll(var1);
         IlIIlllIl.IlIIlI(var1, var6, var8);
         IlIIlllIl.llIIIl(var1, var4, var4);

         try {
            IIIlIllII.llI(var1, III, 0.0, 0.0, var13, 18.0, var2);
            double var15 = 7.0;
            double var17 = var15 + IlIIlllIl.IIl(var10, var11) + 4.0;
            double var19 = (18.0 - 9.0) * 0.5;
            IlIIlllIl.Illl(true, IlIlIlII::I);
            IlIIlllIl.IIll(var1, var10, var12, var17, var19, IIIlIllII.lII(lII(1687722899, -1393600066 ^ 977657425)));
         } finally {
            IlIIlllIl.lIIIll(var1);
         }
      }
   }

   private static String II(char[] var0, long var1, int var3) {
      int var4 = lII(1687722898, -792469888 ^ -845193291) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lII(1687722901, -792469888 ^ -1501808966);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public double IIIl() {
      return 18.0 * this.III();
   }

   @Override
   public boolean llII(double var1, double var3) {
      return var1 >= this.lll() && var1 <= this.lll() + this.IIllI() && var3 >= this.ll() && var3 <= this.ll() + this.IIIl();
   }

   private static void Il() {
      int var0 = -244721453;
      IIl[0] = II(lI(lII(1687722882, var0 ^ -562818109), lII(1687722885, var0 ^ 1650179835)).toCharArray(), 74382L, lII(1687722884, var0 ^ 618210590));
      IIl[1] = II(lI(lII(1687722887, var0 ^ 1531671628), lII(1687722886, var0 ^ -1370876058)).toCharArray(), 65515L, lII(1687722889, var0 ^ 814983));
      IIl[2] = II(lI(lII(1687722888, var0 ^ -1441847163), lII(1687722891, var0 ^ 984020500)).toCharArray(), 85075L, lII(1687722890, var0 ^ -1487040965));
      IIl[3] = II(lI(lII(1687722893, var0 ^ 866899576), lII(1687722892, var0 ^ -2026515497)).toCharArray(), 29011L, lII(1687722895, var0 ^ -966495206));
      IIl[4] = II(lI(lII(1687722894, var0 ^ -486101661), lII(1687722929, var0 ^ -52762577)).toCharArray(), 53517L, lII(1687722928, var0 ^ -1282733099));
      IIl[5] = II(lI(lII(1687722931, var0 ^ 457670193), lII(1687722930, var0 ^ 2144187274)).toCharArray(), 79470L, lII(1687722933, var0 ^ 1919019088));
      IIl[lII(1687722932, var0 ^ -1307566268)] = II(
         lI(lII(1687722935, var0 ^ -1200008931), lII(1687722934, var0 ^ 1282631442)).toCharArray(), 75335L, lII(1687722937, var0 ^ 1642855829)
      );
      IIl[lII(1687722936, var0 ^ 578305808)] = II(
         lI(lII(1687722939, var0 ^ -1880677539), lII(1687722938, var0 ^ -123295133)).toCharArray(), 94095L, lII(1687722941, var0 ^ -1201962726)
      );
      IIl[lII(1687722940, var0 ^ -1938062227)] = II(
         lI(lII(1687722943, var0 ^ 648159523), lII(1687722942, var0 ^ 154885680)).toCharArray(), 9100L, lII(1687722913, var0 ^ -1768029118)
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -45142904;
      int var8 = "v洛᥈삽엖Ꭹ둍ᖥ⤂ಔ뉃\ue018횸\ue4ca⯽I逘㢤雳㰥鉇癅鑯憩苯뱌ⶬ\uf39bꥉ\uf18bẫ鍛沽舐ㄋտ\ue151庲危ᔓ\ue6b2\u177d饸飅밣ଶ聎뻵䷘鎧霊ꕇ䧠凁덬垆\uda94쐽廇\u1f47䁙쌂ꯒ틀\uf7e3螤弛퇨㖩홀솻⊟郙ᚴ\uf2bcﶨ⹏뾹痥ꢯ差\ue657鷅鉝僰\udd36⼋᳥톝鏵\uf1be\ud995뤋쭻㚵\uf39dꃇ븿楌\ue879叴ᇱ툏ዡ껩˩탫駘ඩ膲\uf003ᓃ鲽ꮦ則7빐뗪軌\r똝㯆ꄜ\u0b7a囗怌ഃ錶㗉稈界\uf512ゟ"
         .length();
      short var12 = 12284;
      String[] var10001 = new String[2];
      int var10 = 0;
      String[] var9 = var10001;
      int var11 = 0;
      String var7 = "v洛᥈삽엖Ꭹ둍ᖥ⤂ಔ뉃\ue018횸\ue4ca⯽I逘㢤雳㰥鉇癅鑯憩苯뱌ⶬ\uf39bꥉ\uf18bẫ鍛沽舐ㄋտ\ue151庲危ᔓ\ue6b2\u177d饸飅밣ଶ聎뻵䷘鎧霊ꕇ䧠凁덬垆\uda94쐽廇\u1f47䁙쌂ꯒ틀\uf7e3螤弛퇨㖩홀솻⊟郙ᚴ\uf2bcﶨ⹏뾹痥ꢯ差\ue657鷅鉝僰\udd36⼋᳥톝鏵\uf1be\ud995뤋쭻㚵\uf39dꃇ븿楌\ue879叴ᇱ툏ዡ껩˩탫駘ඩ膲\uf003ᓃ鲽ꮦ則7빐뗪軌\r똝㯆ꄜ\u0b7a囗怌ഃ錶㗉稈界\uf512ゟ";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
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

      lll = var9;
      IIII = new Object[var9.length];
      int var10000 = 0;
      byte var22 = 0;
      llI = new int[310];
      byte[] var10002 = "I/¸ýÛ´øcöúÅcz²],\u0016ïªF{@f¸¶hýt^\u00801%\r%H\u000f\u001aÞ\u0098ªÀÜ-ÙoÚý¨Õc²úIÛ\u0002!°Í[\u0092WüÜ\b!\u0016Ó\u0098¸úIV}\u0088ÅwOM3\u0089ób_ðûHê\u0086ÊrWR?pÖªyôp7;6\u000b\u0093«\u009f¹Â\u008aâ<\u0007¢\u0092ö>\u0016\u000f\u0005\u009b\t\u0091É}r?\u008eomà)\u0004Ú\"\fï\u008a~]\u001fîô\u0089ë2ñÁ\u0089#)\u0080Í)@r5ÝJÓk¯\u008fp\u0096³A \u008a\u001eÞ\u0003Õi\u009dÞ&\u0013¥,\u007f\u001dB\u0018\u0082·\u009b\u0002\u0000\u0098\u0002\u0011D\u0081\b\u0003ÉNK¸Ø?3>§\u009e\u0019d¯££Úìë\u0017vØ\u0015\u0017®ë\u0093cAëÀ~ò§\u007f\u001b\u008a{¯é¼àÒÖ\u0018×\u008e)&õ o\u008a°a³\u0098\u0098&õªò\u009bõöÃWêÙ\u009e,7\u0086\u008fë\\\u001a3ßcÇ\u0016\u0098ªu}\u0017<\u0010\u0099\b\u0082ËÍçFÒÔ\u0081\u008b»â\u0003ÿ\u0091\u0010Í0~\u0000Bô\u0012\u0015ÖÆ cêp\u008e\u000bùÜ¦òæâ'óT\u0004kª¡\u0097wø¹%Pý7\u001c³\u009a£?C\u00177\u0086Ò\u0016\u0091M\u0089nB\u008b÷¿\u0097?~Ô\u0019\u009f\u001eæ7\u0003jõ\u0012Éc¸\u00066ßúõ}\u001býWÃ¯þVÑÐGØ¹\u0001ìé£\u00119«|ÇÊÚ\u0006áY\u000f;BYÒu\u0018À\u009cI'åVïÄµø\u00869EsP\u0089íÀ¯H\u008b\r\u000f±fê\u000b\u008c·\u0004>\u001b÷\u000eÅ·»e\u0087\u0097âîûÑ\tY\u0098R.Ù\u008cò+fp\u008a\u0087KÒXlñR\u008a0\u0096\u008c\r\u0007¸\u009a\"æ\u001aÐFJ\u0002\u0097)Ma%\u0002\u009cj¡L\u0092A9\u0092ìwý=\u008a?á¸)Ò¼wÐ\u008b(I\u0016z½\u0083\u0081\u0089E\u008a\u0004\u0081³¸/P\u008c\u0096\u0004Î\u0019\u001a\u0015\u000f\u0080F·ð\u008b×\n¿L««fÅ=\u0099ê\u0092\u001b\u0002÷\u0097þm\u0080+?\u009d#Ú\u0010ßm0{\u001c A\u0005À\u009djµ¡\u0018´Ç\u000bí\u0094Ã\u0089{f+Oá\u0014x\b4E5vtÊ\u009a,n`rRÒ\u001aÐ·)ßN³Z/\u0098Ö&¤ÊAFZäÏ´IÂÑ\u009eük\u009cù*\u0094\u0007\u008a\u001aµ\u0017*CÈÇl³Ù\u0098ïPJgNê\u009b¿ãqê»\u0003\u0087¯v#\u0080£}íe¶\u0081JG]~\u0019ø\u009c§{NïóÄSþ\u001aYõÞ{k\u009aØw'ÍmÕ\u001b\\Ñ\u0018\u0014\u0001)5¢^\"\u009dòÝia Ç\u009aô&p 'ìauäs\u0091\u00043\u0093\u0011^<ß\u0081¹\u0014\u0083p[øÝ(Î\u0019Ð\u001e\f\u0091÷'õí\u001f\u0091G\u0080\u008e\u0093\u001c[mè:´\u009f\u0089êèK[±\u0086;ñz7Ôl\"òsV\u0000iãVrqÇ\u009aUâÈMö{o³<5eæBú?jÑÆ\u0095$µ?ú?Ó½h\u0001ïak#É\u001c|\u0099~õeövïU\u001a\nf°\u008c\u008a\u007fÂÐ3õý\u0000øé3\u009aêò·cR)Ï\u001dÂ\u009f\u0005TË\u009e8Sþ7\u0006Nö\u001e\u0090CI\u0012ì\u0087Æa\u0010h·Þ¾\u009eæ©Ø\u009e\b5\u000f\\Øå¿²\u00ad×n\u008e\u0018«C\u008a«Zò8×\u0082ý¸\u009a÷©Gå\u0087ùûQï\u001dÞ\tÙ5,q¼\u008aaÈêdIâÔõx=ÁüîÍfNÖ«80·dþ×¡Ðú\u0090O]ÛÂÇÏ*_\u0019\u009dÚÓ\u0002úÿëéºÀìJ¡¬ïP7Jê6ñ{\bÀõ\u0006\u008eT\u0080ï\u0096EíR×¾\u0007C\u001a\u0017\\6£¡Ö)\u009eo\u001fWº²ý\bL7n6×Ù\bJ\u0094hF\u0002\u0081â^Q\u001cÃ#}²\u009d)\u0004×ºôUçIUÂÿ\u009d\u0000{Ô\u001c0¿ä¡\u0006,Og\u0015\u00966o\u0013Ì\u001dþ³ºµ*(È§\u001b\u0003\u0016\u0099x+A1&'pà«_ZhP\\\u009a¥\u009dH\u0090\\YØÐ\u008cì7\u0080,Ñây¡È2\u008b¢QOëjò¶í+?Ì\u0015|¤ß¯ñç\u0011\u0080¨hQ\u0082ä\u001fL¾\u0098r\u00188~è\u008dÑÍO\u0084ªòÒN\u0097\u000e³±\u000fÈÑ\fà\u0093zÎÊ\u007fý)\u0019FEþ\u0011r0\u008d=\u0003\u0093ümÔk}å\u0001®v\u0019Gr¿!\nã\"u\u001a)¹·¹\u0015\u00ad\\!Ô£ð¨§£("
         .getBytes("ISO-8859-1");

      int var53;
      do {
         llI[var10000] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ 80328289;
         var10000 += 1;
         var53 = var22 + 4;
         var22 += 4;
      } while (var53 < var10002.length);

      String[] var5 = new String[lII(1687722900, var17 ^ -429978073)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIl(761358205, var17 ^ -1476170410)).length();
      int var1 = 4;
      int var19 = -1;

      label93:
      while (true) {
         var10000 = lII(1687722903, var17 ^ 729257442);
         String var25 = var2.substring(++var19, var19 + var1);
         byte var37 = -1;

         while (true) {
            label88: {
               char[] var55 = var25.toCharArray();
               int var67 = var55.length;
               int var6 = 0;
               var53 = var10000;
               var42 = var55;
               int var30 = var67;
               char[] var79;
               int var86;
               if (var67 <= 1) {
                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               } else {
                  var53 = var10000;
                  var30 = var67;
                  if (var67 <= var6) {
                     break label88;
                  }

                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               }

               while (true) {
                  var79[var86] = (char)(var79[var86] ^ var67 ^ switch (var6 % lII(1687722907, var17 ^ 1573078587)) {
                     case 0 -> lII(1687722906, var17 ^ -221931815);
                     case 1 -> lII(1687722909, var17 ^ 1216141757);
                     case 2 -> lII(1687722908, var17 ^ -725325549);
                     case 3 -> lII(1687722911, var17 ^ 768749633);
                     case 4 -> lII(1687722910, var17 ^ -891046751);
                     case 5 -> lII(1687722881, var17 ^ -1140213579);
                     default -> lII(1687722880, var17 ^ 635773388);
                  });
                  var6++;
                  if (var53 == 0) {
                     var86 = var53;
                     var79 = var42;
                     var67 = var53;
                  } else {
                     if (var30 <= var6) {
                        break;
                     }

                     var79 = var42;
                     var67 = var53;
                     var86 = var6;
                  }
               }
            }

            String var60 = new String(var42).intern();
            switch (var37) {
               case 0:
                  var5[var3++] = var60;
                  if ((var19 += var1) >= var4) {
                     lI = var5;
                     Il = new String[lII(1687722904, var17 ^ -2017333191)];
                     IIl = new String[lII(1687722883, var17 ^ -526930433)];
                     Il();
                     III = IIIllIIl.Ill;
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var60;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label93;
                  }

                  var4 = (var2 = lIl(761358204, var17 ^ -1447672218)).length();
                  var1 = lII(1687722902, var17 ^ -1012966981);
                  var19 = -1;
            }

            var10000 = lII(1687722905, var17 ^ -1875238023);
            var25 = var2.substring(++var19, var19 + var1);
            var37 = 0;
         }
      }
   }

   private static String lI(int var0, int var1) {
      int var9 = 1953083747;
      int var2 = (var0 ^ lII(1687722912, var9 ^ 1517482243)) & lII(1687722915, var9 ^ 722061454);
      if (Il[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & lII(1687722914, var9 ^ -1977575545)) {
            case 0 -> lII(1687722917, var9 ^ -1214632012);
            case 1 -> lII(1687722916, var9 ^ -13728314);
            case 2 -> lII(1687722919, var9 ^ 19815318);
            case 3 -> lII(1687722918, var9 ^ -2024098040);
            case 4 -> lII(1687722921, var9 ^ -733543347);
            case 5 -> lII(1687722920, var9 ^ 1797422895);
            case 6 -> lII(1687722923, var9 ^ -1143977247);
            case 7 -> lII(1687722922, var9 ^ -957354445);
            case 8 -> lII(1687722925, var9 ^ -1710174127);
            case 9 -> lII(1687722924, var9 ^ 878082401);
            case 10 -> lII(1687722927, var9 ^ 1972007953);
            case 11 -> lII(1687722926, var9 ^ 852248178);
            case 12 -> lII(1687722961, var9 ^ -1882455098);
            case 13 -> lII(1687722960, var9 ^ 1137912453);
            case 14 -> lII(1687722963, var9 ^ 940470516);
            case 15 -> lII(1687722962, var9 ^ -10098398);
            case 16 -> lII(1687722965, var9 ^ -883281348);
            case 17 -> lII(1687722964, var9 ^ -1936489715);
            case 18 -> lII(1687722967, var9 ^ 50717459);
            case 19 -> lII(1687722966, var9 ^ 482032941);
            case 20 -> lII(1687722969, var9 ^ -209772165);
            case 21 -> lII(1687722968, var9 ^ -1783476943);
            case 22 -> lII(1687722971, var9 ^ 398878551);
            case 23 -> lII(1687722970, var9 ^ -653685405);
            case 24 -> lII(1687722973, var9 ^ 1456334638);
            case 25 -> lII(1687722972, var9 ^ -1023421643);
            case 26 -> lII(1687722975, var9 ^ -28738781);
            case 27 -> lII(1687722974, var9 ^ -303740357);
            case 28 -> lII(1687722945, var9 ^ -220475020);
            case 29 -> lII(1687722944, var9 ^ 1077779967);
            case 30 -> lII(1687722947, var9 ^ -1246854440);
            case 31 -> lII(1687722946, var9 ^ -1390632087);
            case 32 -> lII(1687722949, var9 ^ 589651838);
            case 33 -> lII(1687722948, var9 ^ -1224297061);
            case 34 -> lII(1687722951, var9 ^ 599729282);
            case 35 -> lII(1687722950, var9 ^ -2055963584);
            case 36 -> lII(1687722953, var9 ^ 1454506630);
            case 37 -> lII(1687722952, var9 ^ -2096723008);
            case 38 -> lII(1687722955, var9 ^ 229043194);
            case 39 -> lII(1687722954, var9 ^ 591042913);
            case 40 -> lII(1687722957, var9 ^ 116430159);
            case 41 -> lII(1687722956, var9 ^ 302983891);
            case 42 -> lII(1687722959, var9 ^ -515576099);
            case 43 -> lII(1687722958, var9 ^ 1140480304);
            case 44 -> lII(1687722993, var9 ^ 1122509684);
            case 45 -> lII(1687722992, var9 ^ -863963214);
            case 46 -> lII(1687722995, var9 ^ -40181167);
            case 47 -> lII(1687722994, var9 ^ -1085984044);
            case 48 -> lII(1687722997, var9 ^ -834727175);
            case 49 -> lII(1687722996, var9 ^ 453162823);
            case 50 -> lII(1687722999, var9 ^ -968036690);
            case 51 -> lII(1687722998, var9 ^ -2005871926);
            case 52 -> lII(1687723001, var9 ^ 1121335091);
            case 53 -> lII(1687723000, var9 ^ -322972254);
            case 54 -> lII(1687723003, var9 ^ 1734960384);
            case 55 -> lII(1687723002, var9 ^ -728325038);
            case 56 -> lII(1687723005, var9 ^ 422987674);
            case 57 -> lII(1687723004, var9 ^ -30246284);
            case 58 -> lII(1687723007, var9 ^ 268953706);
            case 59 -> 3;
            case 60 -> lII(1687723006, var9 ^ 452740232);
            case 61 -> lII(1687722977, var9 ^ 1908302956);
            case 62 -> lII(1687722976, var9 ^ -87940470);
            case 63 -> lII(1687722979, var9 ^ 1302438146);
            case 64 -> lII(1687722978, var9 ^ -843774734);
            case 65 -> lII(1687722981, var9 ^ 1917417894);
            case 66 -> lII(1687722980, var9 ^ 1609280511);
            case 67 -> lII(1687722983, var9 ^ -445939956);
            case 68 -> lII(1687722982, var9 ^ -2102002879);
            case 69 -> lII(1687722985, var9 ^ -1398548518);
            case 70 -> lII(1687722984, var9 ^ 250196208);
            case 71 -> lII(1687722987, var9 ^ 380558034);
            case 72 -> lII(1687722986, var9 ^ 1964832667);
            case 73 -> lII(1687722989, var9 ^ 2123931734);
            case 74 -> lII(1687722988, var9 ^ 1426088379);
            case 75 -> lII(1687722991, var9 ^ 1673842176);
            case 76 -> lII(1687722990, var9 ^ 735596183);
            case 77 -> lII(1687722769, var9 ^ -964322331);
            case 78 -> lII(1687722768, var9 ^ -1626226774);
            case 79 -> lII(1687722771, var9 ^ 1854174512);
            case 80 -> lII(1687722770, var9 ^ -1652786037);
            case 81 -> lII(1687722773, var9 ^ -1786098837);
            case 82 -> lII(1687722772, var9 ^ 1152737280);
            case 83 -> lII(1687722775, var9 ^ -635375661);
            case 84 -> lII(1687722774, var9 ^ 465155366);
            case 85 -> lII(1687722777, var9 ^ -458088004);
            case 86 -> lII(1687722776, var9 ^ -1418371476);
            case 87 -> 5;
            case 88 -> lII(1687722779, var9 ^ 1929169019);
            case 89 -> lII(1687722778, var9 ^ -22288237);
            case 90 -> lII(1687722781, var9 ^ -475133879);
            case 91 -> lII(1687722780, var9 ^ -1810705503);
            case 92 -> lII(1687722783, var9 ^ 937688273);
            case 93 -> lII(1687722782, var9 ^ 2030669068);
            case 94 -> lII(1687722753, var9 ^ -1267141773);
            case 95 -> lII(1687722752, var9 ^ -1991031088);
            case 96 -> lII(1687722755, var9 ^ 210580578);
            case 97 -> 1;
            case 98 -> lII(1687722754, var9 ^ -106090266);
            case 99 -> lII(1687722757, var9 ^ 1868552434);
            case 100 -> lII(1687722756, var9 ^ -181563729);
            case 101 -> lII(1687722759, var9 ^ 545047421);
            case 102 -> lII(1687722758, var9 ^ 1626565019);
            case 103 -> lII(1687722761, var9 ^ 2052686139);
            case 104 -> lII(1687722760, var9 ^ -970775761);
            case 105 -> lII(1687722763, var9 ^ 1038525100);
            case 106 -> lII(1687722762, var9 ^ 1310092958);
            case 107 -> 2;
            case 108 -> lII(1687722765, var9 ^ 849159806);
            case 109 -> lII(1687722764, var9 ^ 1382225728);
            case 110 -> lII(1687722767, var9 ^ -1603259275);
            case 111 -> lII(1687722766, var9 ^ -1966766175);
            case 112 -> lII(1687722801, var9 ^ -317496770);
            case 113 -> lII(1687722800, var9 ^ -1641856823);
            case 114 -> lII(1687722803, var9 ^ 1048198028);
            case 115 -> lII(1687722802, var9 ^ 2022321226);
            case 116 -> lII(1687722805, var9 ^ -76956647);
            case 117 -> lII(1687722804, var9 ^ 1523805630);
            case 118 -> lII(1687722807, var9 ^ -146269183);
            case 119 -> lII(1687722806, var9 ^ 398351506);
            case 120 -> lII(1687722809, var9 ^ 934891651);
            case 121 -> lII(1687722808, var9 ^ -111393313);
            case 122 -> lII(1687722811, var9 ^ 1585360634);
            case 123 -> lII(1687722810, var9 ^ 230780921);
            case 124 -> lII(1687722813, var9 ^ 1870076409);
            case 125 -> lII(1687722812, var9 ^ -798357401);
            case 126 -> lII(1687722815, var9 ^ 1305226175);
            case 127 -> lII(1687722814, var9 ^ 2141400795);
            case 128 -> lII(1687722785, var9 ^ 871668565);
            case 129 -> lII(1687722784, var9 ^ 258286160);
            case 130 -> lII(1687722787, var9 ^ 3725972);
            case 131 -> lII(1687722786, var9 ^ -1234710155);
            case 132 -> lII(1687722789, var9 ^ -421225957);
            case 133 -> lII(1687722788, var9 ^ 889089260);
            case 134 -> lII(1687722791, var9 ^ 843699134);
            case 135 -> lII(1687722790, var9 ^ -128416085);
            case 136 -> lII(1687722793, var9 ^ 1739125436);
            case 137 -> lII(1687722792, var9 ^ -2027378651);
            case 138 -> lII(1687722795, var9 ^ -877114741);
            case 139 -> lII(1687722794, var9 ^ -1756779063);
            case 140 -> lII(1687722797, var9 ^ -921618393);
            case 141 -> lII(1687722796, var9 ^ -1004019548);
            case 142 -> lII(1687722799, var9 ^ -484572309);
            case 143 -> lII(1687722798, var9 ^ 195603331);
            case 144 -> lII(1687722833, var9 ^ -1700075022);
            case 145 -> lII(1687722832, var9 ^ 2043795198);
            case 146 -> lII(1687722835, var9 ^ -1951391911);
            case 147 -> lII(1687722834, var9 ^ 1600276288);
            case 148 -> lII(1687722837, var9 ^ 801672389);
            case 149 -> lII(1687722836, var9 ^ -1068117555);
            case 150 -> lII(1687722839, var9 ^ 1735390781);
            case 151 -> lII(1687722838, var9 ^ -143686505);
            case 152 -> lII(1687722841, var9 ^ -744249749);
            case 153 -> lII(1687722840, var9 ^ -596376085);
            case 154 -> 4;
            case 155 -> lII(1687722843, var9 ^ 2072693331);
            case 156 -> lII(1687722842, var9 ^ 1910484668);
            case 157 -> lII(1687722845, var9 ^ 726869764);
            case 158 -> lII(1687722844, var9 ^ -2128788530);
            case 159 -> lII(1687722847, var9 ^ -301587076);
            case 160 -> lII(1687722846, var9 ^ 2084051658);
            case 161 -> lII(1687722817, var9 ^ 2132425436);
            case 162 -> lII(1687722816, var9 ^ 1755351907);
            case 163 -> lII(1687722819, var9 ^ 1909425659);
            case 164 -> lII(1687722818, var9 ^ 1092878295);
            case 165 -> lII(1687722821, var9 ^ -1531610796);
            case 166 -> lII(1687722820, var9 ^ -689322709);
            case 167 -> lII(1687722823, var9 ^ -382137554);
            case 168 -> lII(1687722822, var9 ^ 665000392);
            case 169 -> lII(1687722825, var9 ^ -1554334139);
            case 170 -> lII(1687722824, var9 ^ -618385134);
            case 171 -> lII(1687722827, var9 ^ 292366330);
            case 172 -> lII(1687722826, var9 ^ 745147848);
            case 173 -> lII(1687722829, var9 ^ 309788737);
            case 174 -> lII(1687722828, var9 ^ -2072331557);
            case 175 -> lII(1687722831, var9 ^ -121752228);
            case 176 -> lII(1687722830, var9 ^ 72434733);
            case 177 -> lII(1687722865, var9 ^ -1431890517);
            case 178 -> lII(1687722864, var9 ^ -861405790);
            case 179 -> lII(1687722867, var9 ^ 459614990);
            case 180 -> lII(1687722866, var9 ^ -1416929692);
            case 181 -> lII(1687722869, var9 ^ 2058873730);
            case 182 -> lII(1687722868, var9 ^ 1471371416);
            case 183 -> lII(1687722871, var9 ^ -436126755);
            case 184 -> lII(1687722870, var9 ^ -377391439);
            case 185 -> lII(1687722873, var9 ^ -1115810893);
            case 186 -> lII(1687722872, var9 ^ -306004598);
            case 187 -> lII(1687722875, var9 ^ 166197868);
            case 188 -> lII(1687722874, var9 ^ 555057777);
            case 189 -> lII(1687722877, var9 ^ -1638390654);
            case 190 -> lII(1687722876, var9 ^ 1886393518);
            case 191 -> lII(1687722879, var9 ^ -515782577);
            case 192 -> lII(1687722878, var9 ^ -388547007);
            case 193 -> lII(1687722849, var9 ^ 1525635085);
            case 194 -> lII(1687722848, var9 ^ 613323112);
            case 195 -> lII(1687722851, var9 ^ -1013438759);
            case 196 -> lII(1687722850, var9 ^ -2072597581);
            case 197 -> lII(1687722853, var9 ^ -687987868);
            case 198 -> lII(1687722852, var9 ^ 1260415986);
            case 199 -> lII(1687722855, var9 ^ -952430750);
            case 200 -> lII(1687722854, var9 ^ -3126047);
            case 201 -> lII(1687722857, var9 ^ -126660010);
            case 202 -> lII(1687722856, var9 ^ -76955360);
            case 203 -> lII(1687722859, var9 ^ -32569554);
            case 204 -> lII(1687722858, var9 ^ 486087026);
            case 205 -> lII(1687722861, var9 ^ -1704102265);
            case 206 -> lII(1687722860, var9 ^ -2105796390);
            case 207 -> lII(1687722863, var9 ^ -1014500667);
            case 208 -> lII(1687722862, var9 ^ 237939228);
            case 209 -> lII(1687722641, var9 ^ -1214765973);
            case 210 -> lII(1687722640, var9 ^ -1974014535);
            case 211 -> lII(1687722643, var9 ^ -1366619638);
            case 212 -> lII(1687722642, var9 ^ 1477351918);
            case 213 -> lII(1687722645, var9 ^ -1008665548);
            case 214 -> lII(1687722644, var9 ^ -2142129767);
            case 215 -> lII(1687722647, var9 ^ -1780766270);
            case 216 -> lII(1687722646, var9 ^ 150655367);
            case 217 -> lII(1687722649, var9 ^ -1499145244);
            case 218 -> lII(1687722648, var9 ^ -1014824916);
            case 219 -> lII(1687722651, var9 ^ -210720980);
            case 220 -> lII(1687722650, var9 ^ -341510164);
            case 221 -> lII(1687722653, var9 ^ -1071260408);
            case 222 -> lII(1687722652, var9 ^ -258411922);
            case 223 -> lII(1687722655, var9 ^ 1532946286);
            case 224 -> lII(1687722654, var9 ^ 576119837);
            case 225 -> lII(1687722625, var9 ^ 164054189);
            case 226 -> lII(1687722624, var9 ^ -1592533872);
            case 227 -> lII(1687722627, var9 ^ -1289554073);
            case 228 -> 0;
            case 229 -> lII(1687722626, var9 ^ -1925063429);
            case 230 -> lII(1687722629, var9 ^ 622841926);
            case 231 -> lII(1687722628, var9 ^ -191713950);
            case 232 -> lII(1687722631, var9 ^ 2087299924);
            case 233 -> lII(1687722630, var9 ^ -1314609868);
            case 234 -> lII(1687722633, var9 ^ 1214261909);
            case 235 -> lII(1687722632, var9 ^ -1730820744);
            case 236 -> lII(1687722635, var9 ^ 954732660);
            case 237 -> lII(1687722634, var9 ^ -1242447672);
            case 238 -> lII(1687722637, var9 ^ -1234649827);
            case 239 -> lII(1687722636, var9 ^ 2127250432);
            case 240 -> lII(1687722639, var9 ^ 1057372941);
            case 241 -> lII(1687722638, var9 ^ 1755132429);
            case 242 -> lII(1687722673, var9 ^ -438377653);
            case 243 -> lII(1687722672, var9 ^ -1135494123);
            case 244 -> lII(1687722675, var9 ^ -265897195);
            case 245 -> lII(1687722674, var9 ^ -1941181876);
            case 246 -> lII(1687722677, var9 ^ 1792113040);
            case 247 -> lII(1687722676, var9 ^ -646548711);
            case 248 -> lII(1687722679, var9 ^ -420758304);
            case 249 -> lII(1687722678, var9 ^ 445269348);
            case 250 -> lII(1687722681, var9 ^ -588710916);
            case 251 -> lII(1687722680, var9 ^ -2025636614);
            case 252 -> lII(1687722683, var9 ^ 1808063480);
            case 253 -> lII(1687722682, var9 ^ 1383861295);
            case 254 -> lII(1687722685, var9 ^ 1711896958);
            default -> lII(1687722684, var9 ^ 397020133);
         };
         int var5 = (var1 & lII(1687722687, var9 ^ -1068331056)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lII(1687722686, var9 ^ 362053933)) >>> lII(1687722657, var9 ^ 1397443427)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lII(1687722656, var9 ^ 517656671);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lII(1687722659, var9 ^ 235948958);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }

   public IlIlIlII() {
      super(IlIIllIII.Ill(IIl[2]), lllIIlIl.II, IlIIllIII.Ill(IIl[lII(1687722658, -1485892922 ^ 2116745686)]));
      this.lII = this.IllIIll(new IIlIII(IlIIllIII.Ill(IIl[3]), 18.0, 0.0, 4000.0, 1.0).IlII(IlIIllIII.lI(IIl[0])));
      this.II = this.IllIIll(new IIlIII(IlIIllIII.Ill(IIl[5]), 99.0, 0.0, 4000.0, 1.0).IlII(IlIIllIII.lI(IIl[0])));
      this.I = this.IllIIll(new IIlIII(IlIIllIII.Ill(IIl[4]), 100.0, 75.0, 200.0, 5.0).IlII(IlIIllIII.lI(IIl[1])));
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1724 != null) {
         class_243 var2 = var1.field_1724.method_18798();
         this.ll = Math.hypot(var2.field_1352, var2.field_1350) * 20.0;
      } else {
         this.ll = 0.0;
      }
   }

   @Override
   public double IIllI() {
      class_310 var1 = class_310.method_1551();
      return var1 != null && var1.field_1772 != null ? this.IIl(var1.field_1772, this.Ill()) * this.III() : 48.0 * this.III();
   }

   private double III() {
      return this.I.IllI() / 100.0;
   }

   private double IIl(class_327 var1, String var2) {
      return 14.0 + IlIIlllIl.IIl(var1, IlIIllIII.lI(IIl[lII(1687722661, -482596415 ^ -1564947355)])) + 4.0 + IlIIlllIl.IIl(var1, var2);
   }

   @Override
   public void Illl(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.l(var1, var5);
   }

   private String Ill() {
      return String.format(Locale.ROOT, IlIIllIII.lI(IIl[lII(1687722660, 231352626 ^ -985804994)]), this.ll);
   }
}
