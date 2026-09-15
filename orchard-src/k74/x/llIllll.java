package k74.x;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1109;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2791;
import net.minecraft.class_2806;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_7923;
import net.minecraft.class_2338.class_2339;

@Environment(EnvType.CLIENT)
public final class llIllll extends IlIIIIIIl {
   private static final int I = 40;
   private static final String[] IIIl;
   private static final int II = 36;
   private static final int[] IIII;
   private static final int Il = 64;
   private static String[] lI;
   private static final int ll = 2048;
   private static final Object[] IIlI;
   private final IIlIII III;
   private static final int IIl = 64;
   private static final String[] IlI;
   private final IllIlIl Ill;
   private int lII;
   private final Set<String> lIl;
   private static final int llI = 4;
   private static final String[] lll;

   private void I() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.method_1483() != null) {
         var1.method_1483().method_4873(class_1109.method_4757((class_3414)class_3417.field_14793.comp_349(), 1.25F, 0.9F));
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1247374489;
      int var11 = 0;
      int var8 = "Â͈\ue313뗍浺\uf3d9챜遞\udd91ꃎ\udd99ﯾ莽ꚯನ촼滖虚緖㣾薊䮸뵙ᅸ㛦⋖ゥ\uea26璛\uf15a癖演\uf58fᾑꡬ䀧碼찻쾡⯲\uaace죈╁蒲Ԅ㏸係䋦\ue863ൡ\u20c9\uf5dc飼萮\uf7a8륷盆\ue0e6䔶㰟死萞扟훅\uea52褨낛\ufb1c鲴塊ꯨ㟠\udaea肴녲詴崸➏ᑭ밚〡\udd23␚횀耧⏤历哨\udfa3荲෦堬\udab0郧꾂烳᪪ⴺ᠄阋⟴锘쏯ꦖ蚟漀\uecb7댪\ue61a᪱썼毚텤쓖桟ᣬ碉˔纛蚶Ġ쪞Ȋ牂\ue8a6꠱䴢䙴ꖭ瘵㶠ꕧ쳌쀩羏巯\ud83c觷ሣ⸲ꡁ\uea23截푩蚧锆춿ᐎ눅贫\uda53ꬼ渝\uf66b施ᷖ瑊蛲럟䫆詐莖␇㿟뮺⣘╖㱴妯糵\ue0b4\uf751礆ű\ue87cਚ獔旙\uf6be⠒郵ꝺ࣏慑崄砪㨲્템唜㲆廂齬舅崽\r齯䨐忿彠励딣\ue324䳨ﳦ걤쎓偈\uf268"
         .length();
      String var7 = "Â͈\ue313뗍浺\uf3d9챜遞\udd91ꃎ\udd99ﯾ莽ꚯನ촼滖虚緖㣾薊䮸뵙ᅸ㛦⋖ゥ\uea26璛\uf15a癖演\uf58fᾑꡬ䀧碼찻쾡⯲\uaace죈╁蒲Ԅ㏸係䋦\ue863ൡ\u20c9\uf5dc飼萮\uf7a8륷盆\ue0e6䔶㰟死萞扟훅\uea52褨낛\ufb1c鲴塊ꯨ㟠\udaea肴녲詴崸➏ᑭ밚〡\udd23␚횀耧⏤历哨\udfa3荲෦堬\udab0郧꾂烳᪪ⴺ᠄阋⟴锘쏯ꦖ蚟漀\uecb7댪\ue61a᪱썼毚텤쓖桟ᣬ碉˔纛蚶Ġ쪞Ȋ牂\ue8a6꠱䴢䙴ꖭ瘵㶠ꕧ쳌쀩羏巯\ud83c觷ሣ⸲ꡁ\uea23截푩蚧锆춿ᐎ눅贫\uda53ꬼ渝\uf66b施ᷖ瑊蛲럟䫆詐莖␇㿟뮺⣘╖㱴妯糵\ue0b4\uf751礆ű\ue87cਚ獔旙\uf6be⠒郵ꝺ࣏慑崄砪㨲્템唜㲆廂齬舅崽\r齯䨐忿彠励딣\ue324䳨ﳦ걤쎓偈\uf268";
      int var10 = 0;
      String[] var9 = new String[2];
      short var12 = 20641;

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIIl = var9;
      IIlI = new Object[var9.length];
      int var10000 = 0;
      int var22 = 0;
      byte[] var32 = "\u0007ùIþÔÐ\u007fÚcpé\u0012É}¢Y\u0007\u0095ÍÆýÊ\u001c\u0080çÅ|Ñ¸oâ\u001cyø@h>Ô)Ú¾ª7\u009d\u007f§7\u001f05Hr!] Ö_\u009d\u001f§¢U£ýû\u008fpéL\t\u0000\u0090Íx\u009dt dåÛå\u0003éG<\tÁö]zÍÖÙB\u000b8¥LjF7^N¯dõr\u0000´07\u000b%H\u0086\u001a½\u0018×\u0010U¦hâS c¢§hgA\r&\u008b¾¾.ºYþ\u0007(ìÓóÐÓÓ$A;]É<Þàð-KÜþd-\u0098\u001fS\u0098ýÂá«xë?û'§\u007f\t\u009cQQÏ¸%)ë] \u0005¢\u0087PÍ®\u0097¡õéå\u009dÅ!xê¢\u0014\u0002\"âäù\u001aÀdò©\u0087ù7\u008cf\u0016mÉ}G.Á\u007f¬·ý\u000bÌ\u000eh\u000b÷\u0007Ü\tæ\u0089\u0089mÿ\u001d\u0017k\u001cê4\u001eXÌ+\u000e\r\tµ\u0003?Kl|\u0000pÎK\b\u009eË0*Ðbþ»Ñè|áª1AÆÇ#\u0088\u0098½aîÇ\u008fú\u009f\u000fUÄù¦\u00ad¤V÷ÒÃ\u009f(\u008d]\u0091õQ\u0013I\u0092¤Ìör/g¹ªØÂ{ç\u0086\u0091`h6uÕô\u0085¸÷¶OÓ\u000eïçÔ)P\u0092sñÐ¾Ó\u0015´ø\u008b\u0080v«\\ËV\u009e\u0094Ê[H\u0015Ò\u0017\u0002×\u0099±ofT\u001b\u0010<*\u0000´¼X!\u0095ÔÝ\u0097pÑª\u001cáü¬²8m9h\u0093t<õç\u009f\\g¹a..ç\u0084\u008b1\u0087{\n¹Åv¿].\u008enw®\u0085URªÒÅ¦{\u0090Í:§B,òIÑÚ\u0011vv 4²f;g²ÄWDß¤\u001e\u009e\u008c\u0019QÎL\u0099Åê+w\u0015i\u0005\u009fr\u009bÙö\u0085JNñ:*-X%×e\"§\u0087\u0085\u000b\u0080ÓË4\u001c\u001e\u0006/³ëî\u008fìI\u0096\"\u008b\u001fÛ\"Ð*í[)|\u0091¿\u0017:r9øì\bÇîòEg&\u007fxZúÚÈ\u008aâI\u0090/`ïýÕg\u001f\u0092@\u0087\u008e:§?bî!\u009b4æ\u000e¾2\u0093\\>\u0016¯`\"ÕÇ°\nÂ`ÝõHZÊû\u0015}¯\u000f\u0089SòoãA&¸v±\u0003\u0089\u0014\bðiîPFUAcµpê«çÀ/\u001b\u009fí¦®'?¥W8\u008e\u009e¥·P\u0002°ø\b¨´µ\u0083Çìn.áNåêùO\u008c\u0083\u0002$\u0011:Õ¨¯±Ëõ³>\t6Aup et\u00840>è\"8\u0088|\u008dÎ~ç\u0011\u0090çø\u009bÞ\u0015\u00169Ôê¹\u0080\u001cú\u0000&Ù:nß-\u0093\u009cÆ\u009e\u0006ïÐ\u0089ÃÓé\u0016ºeå(ß¹2£\u000bZy\u0083·}\u001c[àÆ;Í`;\u001bâ\u008coðvVäEüe[A\u009cc\u0097ÿq\u009b\u0004Ãó¹\u008cË0¤\t\u0085Úàð\u001aHGW!\u0097\u0005¤\u00adÈÊ{8ª\u009e\u0016T\u001cX\u001b\u001aç9så\u008aC\u0080\u0090]õT÷dRx+©½OÓb·Û:Ø\u0012\u0018y.\u0004ºp\u0017®){\u009e\u001bõÕ:öæÎ§Ãr{øÄÛ:µjãUÖ÷\u0093\u0016¶öB)ï4µj\u0016gÐdÊ8D²\u0087aS\u001atºn~ûbpõ]\u0084'\u009f\n\u0015NóW²öÀÚ¿\u0085Ã\u001e\u0091»û>¢;àeì¦Zâ\u0089\u0015ÄêFxâèF\u001eæH\u0007%\u008eòù`B³eÆ\u001drI\u009e½=5Í\u0006\u0010?Æc\rM»¦^\u001cg\u000b8ç\u0099\u0013\u0082*\u0005,\u0082½ç;\u001dÚ:ÕÂ®ZÁñ\u008eÀ\u0087\u000e5}~Ë¢\u0002é[!¢¾£X\u001açM^\u0086s¢O;°\u007fx?Ë\u001bÏun?\u0089\u0011·dpÍ#\u009c;\u0089\u008dô}ÀÐP´2\f<¥\u008f1@Òs°\u000fÈ0<\u001ffÃÏÞ>¡Ú\u0094ÐôKä\u001fù¡}¸$º'èº\u0016¼1Ã\u0018b\bE;%%ú\u001b@ì\u0018úg!\u0011ºo`ñiU#Éá¶\u0090\u0083§ø\u000fkãõÈ¸\u0004Ö½Òï\u008eÏ}@\u0018Û©/®\u0096¸\u00025dx\u0014\u0082\u0081þa¶.>:\u0085ï%\u0094ð0\u009dZ\u009aHó\u0095XÑ½\u0080ãË:\u008cp¤ÕÂ(T\u008c¢-¯:G\u00adna\u0000»]\u000bÐs\u009eRBÚ\u008cü \b\r\u0099Ì\u0002\u0015\u008d\u0088èPKªÎ8{ì}FTÐ\u0092Gß\u008dLÿ\u0016®\u0018ìùÁÿ\thA\u0097u(c\u0004\u0081s=Rb?Öÿ¹yâ\u0002êqH\u008d¦%fC\u0088\u008c»\u0084ÒÂ«\b\u009eIáÜ~¶lq±wtpyOñ,\u008d5\u0096\u007f\"]\u0006W»¤Ó}Ô¤\u0007\u000bæÔ.úyØ26\u0098\u001aYçd\u0089m\u0098\u0000åº¼kF2^\u008aaïá\u009bÒï³B§.3c\u00adäÆc{0\\+\u0014´µí \u0005ß¡çÂ\u0086\u0019#V!\bä\\VÞzò"
         .getBytes("ISO-8859-1");
      IIII = new int[341];

      int var54;
      do {
         IIII[var10000] = ((var32[var22] & 255) << 24 | (var32[var22 + 1] & 255) << 16 | (var32[var22 + 2] & 255) << 8 | var32[var22 + 3] & 255) ^ 916881988;
         var10000 += 1;
         var54 = var22 + 4;
         var22 += 4;
      } while (var54 < var32.length);

      String[] var5 = new String[l(-1410454712, var17 ^ 456913044)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lll(-1250482645, var17 ^ 1491103065)).length();
      int var1 = l(-1410454711, var17 ^ -559546974);
      int var19 = -1;

      label93:
      while (true) {
         var10000 = l(-1410454710, var17 ^ -1669558581);
         String var25 = var2.substring(++var19, var19 + var1);
         byte var38 = -1;

         while (true) {
            label88: {
               char[] var56 = var25.toCharArray();
               int var68 = var56.length;
               int var6 = 0;
               var54 = var10000;
               var43 = var56;
               var22 = var68;
               char[] var80;
               int var87;
               if (var68 <= 1) {
                  var80 = var56;
                  var68 = var10000;
                  var87 = var6;
               } else {
                  var54 = var10000;
                  var22 = var68;
                  if (var68 <= var6) {
                     break label88;
                  }

                  var80 = var56;
                  var68 = var10000;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % l(-1410454707, var17 ^ 124911657)) {
                     case 0 -> l(-1410454706, var17 ^ 116949620);
                     case 1 -> l(-1410454705, var17 ^ 2099360616);
                     case 2 -> l(-1410454720, var17 ^ 271808002);
                     case 3 -> l(-1410454719, var17 ^ 1785794654);
                     case 4 -> l(-1410454718, var17 ^ 1491758533);
                     case 5 -> l(-1410454717, var17 ^ -2100032762);
                     default -> l(-1410454716, var17 ^ 2058659942);
                  });
                  var6++;
                  if (var54 == 0) {
                     var87 = var54;
                     var80 = var43;
                     var68 = var54;
                  } else {
                     if (var22 <= var6) {
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
                     IlI = var5;
                     lll = new String[l(-1410454708, var17 ^ 1239142071)];
                     lI = new String[l(-1410454715, var17 ^ 97739195)];
                     ll();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var61;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label93;
                  }

                  var4 = (var2 = lll(-1250482646, var17 ^ -1392364543)).length();
                  var1 = 4;
                  var19 = -1;
            }

            var10000 = l(-1410454709, var17 ^ -1478576741);
            var25 = var2.substring(++var19, var19 + var1);
            var38 = 0;
         }
      }
   }

   private static String II(char[] var0, long var1, int var3) {
      int var4 = l(-1410454776, -413966146 ^ 1151443512) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & l(-1410454775, -413966146 ^ -1362460205);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private String Il(String var1) {
      if (var1 == null) {
         return lI[0];
      } else {
         String[] var2 = var1.trim().split(IlIIllIII.lI(lI[2]));
         if (var2.length < 3) {
            return lI[0];
         } else {
            String var10000 = var2[0];
            String var10001 = IlIIllIII.lI(lI[1]);
            String var10002 = var2[1];
            String var10003 = IlIIllIII.lI(lI[1]);
            String var7 = var2[2];
            String var6 = var10003;
            String var5 = var10002;
            String var4 = var10001;
            String var3 = var10000;
            return var3 + var4 + var5 + var6 + var7;
         }
      }
   }

   private static int l(int var0, int var1) {
      int var2 = IIII[var0 ^ -1410454776] ^ var1 ^ var0;
      var2 -= 5119;
      var2 -= 5229;
      var2 -= 37561;
      var2 ^= 53763;
      var2 -= 56372;
      return var2 + 11869;
   }

   private static String lll(int var0, int var1) {
      int var3 = var0 ^ -1250482645;
      char[] var4 = IIIl[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIlI[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIlI[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 696638544;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 122;
            case 1 -> 38;
            case 2 -> 48;
            case 3 -> 7;
            case 4 -> 218;
            case 5 -> 128;
            case 6 -> 39;
            case 7 -> 237;
            case 8 -> 65;
            case 9 -> 178;
            case 10 -> 180;
            case 11 -> 138;
            case 12 -> 255;
            case 13 -> 123;
            case 14 -> 48;
            case 15 -> 23;
            case 16 -> 26;
            case 17 -> 229;
            case 18 -> 215;
            case 19 -> 186;
            case 20 -> 171;
            case 21 -> 168;
            case 22 -> 37;
            case 23 -> 142;
            case 24 -> 146;
            case 25 -> 166;
            case 26 -> 167;
            case 27 -> 4;
            case 28 -> 48;
            case 29 -> 10;
            case 30 -> 156;
            case 31 -> 111;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private List<class_2338> lI(class_310 var1, class_1937 var2, class_2338 var3) {
      int var23 = 86783496;
      ArrayList var5 = new ArrayList();
      int var6 = var3.method_10263() >> 4;
      String[] var10000 = IIllllIl.IIIIl();
      int var7 = var3.method_10260() >> 4;
      int var8 = Math.max(var2.method_31607(), var3.method_10264() - l(-1410454774, var23 ^ -82493075));
      int var9 = Math.min(var2.method_31600(), var3.method_10264() + l(-1410454773, var23 ^ 1360529959));
      class_2339 var10 = new class_2339();
      String[] var4 = var10000;
      int var11 = l(-1410454772, var23 ^ -1611634573);

      while (var11 <= 4) {
         int var12 = l(-1410454771, var23 ^ 1706015028);

         while (true) {
            if (var12 <= 4) {
               int var13 = var6 + var11;
               int var14 = var7 + var12;
               class_2791 var15 = var2.method_8402(var13, var14, class_2806.field_12803, false);
               if (var15 != null) {
                  int var16 = var13 << 4;
                  int var17 = var14 << 4;
                  int var18 = 0;

                  while (var18 < l(-1410454770, var23 ^ 2141247642)) {
                     int var19 = var16 + var18;
                     int var20 = 0;

                     while (var20 < l(-1410454769, var23 ^ 537544278)) {
                        int var21 = var17 + var20;
                        int var22 = var8;

                        while (var22 <= var9) {
                           var10.method_10103(var19, var22, var21);
                           if (this.IIl(var15.method_8320(var10))) {
                              var5.add(var10.method_10062());
                              if (var5.size() >= l(-1410454784, var23 ^ -509739555)) {
                                 return var5;
                              }
                           }

                           var22++;
                           if (var4 != null) {
                              break;
                           }
                        }

                        var20++;
                        if (var4 != null) {
                           break;
                        }
                     }

                     var18++;
                     if (var4 != null) {
                        break;
                     }
                  }
               }

               var12++;
               if (var4 == null) {
                  continue;
               }
            }

            var11++;
            if (var4 != null) {
               return var5;
            }
            break;
         }
      }

      return var5;
   }

   private static void ll() {
      int var0 = 1714865611;
      lI[0] = II("".toCharArray(), 13163L, l(-1410454783, var0 ^ -434926076));
      lI[1] = II(lIl(l(-1410454782, var0 ^ 1171564496), l(-1410454781, var0 ^ -2066204059)).toCharArray(), 4474L, l(-1410454780, var0 ^ 3311618));
      lI[2] = II(lIl(l(-1410454779, var0 ^ -635228007), l(-1410454778, var0 ^ -1528676373)).toCharArray(), 11080L, l(-1410454777, var0 ^ -1380985946));
      lI[3] = II(lIl(l(-1410454760, var0 ^ 15851711), l(-1410454759, var0 ^ -1216975423)).toCharArray(), 17668L, l(-1410454758, var0 ^ 114039834));
      lI[4] = II(lIl(l(-1410454757, var0 ^ -619022964), l(-1410454756, var0 ^ 511641741)).toCharArray(), 18656L, l(-1410454755, var0 ^ 375046348));
      lI[5] = II(lIl(l(-1410454754, var0 ^ -1509663240), l(-1410454753, var0 ^ 574431996)).toCharArray(), 20649L, l(-1410454768, var0 ^ -2127017491));
      lI[l(-1410454767, var0 ^ -870246094)] = II(
         lIl(l(-1410454766, var0 ^ -1618222502), l(-1410454765, var0 ^ 1330437260)).toCharArray(), 70382L, l(-1410454764, var0 ^ -309136644)
      );
      lI[l(-1410454763, var0 ^ 1181188232)] = II(
         lIl(l(-1410454762, var0 ^ -1361512269), l(-1410454761, var0 ^ -1470162601)).toCharArray(), 14957L, l(-1410454744, var0 ^ -1713068275)
      );
      lI[l(-1410454743, var0 ^ -161883111)] = II(
         lIl(l(-1410454742, var0 ^ 1162881602), l(-1410454741, var0 ^ 91770148)).toCharArray(), 93133L, l(-1410454740, var0 ^ -1928958325)
      );
      lI[l(-1410454739, var0 ^ 677058193)] = II(
         lIl(l(-1410454738, var0 ^ -1497912140), l(-1410454737, var0 ^ 462328801)).toCharArray(), 3173L, l(-1410454752, var0 ^ 1445336307)
      );
      lI[l(-1410454751, var0 ^ 1667236913)] = II(
         lIl(l(-1410454750, var0 ^ 113013183), l(-1410454749, var0 ^ -2087347385)).toCharArray(), 47933L, l(-1410454748, var0 ^ 572279428)
      );
      lI[l(-1410454747, var0 ^ 1731069539)] = II(
         lIl(l(-1410454746, var0 ^ 1130084740), l(-1410454745, var0 ^ -1495364899)).toCharArray(), 60517L, l(-1410454728, var0 ^ 1927052468)
      );
      lI[l(-1410454727, var0 ^ 1826529882)] = II(
         lIl(l(-1410454726, var0 ^ 518215000), l(-1410454725, var0 ^ -2087276474)).toCharArray(), 14718L, l(-1410454724, var0 ^ -1397947543)
      );
      lI[l(-1410454723, var0 ^ 40212442)] = II(
         lIl(l(-1410454722, var0 ^ 165091202), l(-1410454721, var0 ^ -856638686)).toCharArray(), 11127L, l(-1410454736, var0 ^ 482765770)
      );
   }

   @Override
   public void IlIII() {
      this.lII = 0;
      this.lIl.clear();

      for (String var2 : (List)this.Ill.IllI()) {
         String var3 = this.Il(var2);
         if (!var3.isEmpty()) {
            this.lIl.add(var3);
         }
      }
   }

   private void III(List<class_2338> var1) {
      int var15 = -1678244928;
      class_2338 var2 = this.llI(var1);
      int var10000 = var2.method_10263();
      String var10001 = IlIIllIII.lI(lI[1]);
      int var10002 = var2.method_10264();
      String var10003 = IlIIllIII.lI(lI[1]);
      int var10 = var2.method_10260();
      String var9 = var10003;
      int var8 = var10002;
      String var7 = var10001;
      int var6 = var10000;
      String var3 = var6 + var7 + var8 + var9 + var10;
      if (this.lIl.add(var3)) {
         var10000 = var2.method_10263();
         var10001 = IlIIllIII.lI(lI[l(-1410454735, var15 ^ 678489627)]);
         var10002 = var2.method_10264();
         var10003 = IlIIllIII.lI(lI[l(-1410454734, var15 ^ -1320379784)]);
         int var10004 = var2.method_10260();
         String var10005 = IlIIllIII.lI(lI[l(-1410454733, var15 ^ 148478536)]);
         int var10006 = var1.size();
         String var14 = IlIIllIII.lI(lI[l(-1410454732, var15 ^ 23959637)]);
         int var13 = var10006;
         String var12 = var10005;
         int var11 = var10004;
         String var21 = var10003;
         int var19 = var10002;
         String var17 = var10001;
         int var16 = var10000;
         String var4 = var16 + var17 + var19 + var21 + var11 + var12 + var13 + var14;
         ArrayList var5 = new ArrayList((Collection)this.Ill.IllI());
         var5.add(0, var4);

         while (var5.size() > l(-1410454731, var15 ^ -1892093833)) {
            var5.remove(var5.size() - 1);
         }

         this.Ill.lII(var5);
         IlIlIllII var23 = IlIlIllII.l();
         IIIIllI var25 = IIIIllI.I;
         String var27 = IlIIllIII.lI(lI[l(-1410454730, var15 ^ 463927983)]);
         int var29 = var1.size();
         var9 = IlIIllIII.lI(lI[l(-1410454729, var15 ^ -326791192)]);
         var8 = var29;
         var23.IlI(var25, var27, var8 + var9, 4500L);
         this.I();
      }
   }

   @Override
   public void llIl() {
      this.lII = 0;
   }

   private boolean IIl(class_2680 var1) {
      if (var1 != null && !var1.method_26215()) {
         class_2248 var2 = var1.method_26204();
         String var3 = class_7923.field_41175.method_10221(var2).method_12832().toLowerCase(Locale.ROOT);
         return var3.endsWith(IlIIllIII.lI(lI[3])) || var3.endsWith(IlIIllIII.lI(lI[4])) || var3.endsWith(IlIIllIII.lI(lI[5]));
      } else {
         return false;
      }
   }

   private void Ill(List<class_2338> var1) {
      HashSet var2 = new HashSet(var1);
      int var3 = Math.max(1, (int)Math.round(this.III.IllI()));

      while (!var2.isEmpty()) {
         class_2338 var4 = (class_2338)var2.iterator().next();
         List var5 = this.lII(var4, var2);
         if (var5.size() >= var3) {
            this.III(var5);
         }
      }
   }

   private List<class_2338> lII(class_2338 var1, Set<class_2338> var2) {
      ArrayList var3 = new ArrayList();
      ArrayDeque var4 = new ArrayDeque();
      var2.remove(var1);
      var4.add(var1);

      while (!var4.isEmpty()) {
         class_2338 var5 = (class_2338)var4.remove();
         var3.add(var5);
         ArrayList var6 = new ArrayList();

         for (class_2338 var8 : var2) {
            if (var5.method_10262(var8) <= 36.0) {
               var6.add(var8);
            }
         }

         for (class_2338 var10 : var6) {
            var2.remove(var10);
            var4.add(var10);
         }
      }

      return var3;
   }

   private static String lIl(int var0, int var1) {
      int var9 = -247194636;
      int var2 = (var0 ^ l(-1410454714, var9 ^ -514727996)) & l(-1410454713, var9 ^ 1025360287);
      if (lll[var2] == null) {
         char[] var3 = IlI[var2].toCharArray();

         int var4 = switch (var3[0] & l(-1410454696, var9 ^ -926846112)) {
            case 0 -> l(-1410454695, var9 ^ 1131035802);
            case 1 -> l(-1410454694, var9 ^ -1261437407);
            case 2 -> l(-1410454693, var9 ^ -358816499);
            case 3 -> l(-1410454692, var9 ^ 1517837370);
            case 4 -> l(-1410454691, var9 ^ -373984759);
            case 5 -> l(-1410454690, var9 ^ 601787325);
            case 6 -> l(-1410454689, var9 ^ -1948671832);
            case 7 -> l(-1410454704, var9 ^ -25267040);
            case 8 -> l(-1410454703, var9 ^ -757165873);
            case 9 -> l(-1410454702, var9 ^ -1803156213);
            case 10 -> l(-1410454701, var9 ^ -950972805);
            case 11 -> l(-1410454700, var9 ^ -224833564);
            case 12 -> l(-1410454699, var9 ^ 605574997);
            case 13 -> l(-1410454698, var9 ^ 1859787983);
            case 14 -> l(-1410454697, var9 ^ 57400830);
            case 15 -> l(-1410454680, var9 ^ 2083630896);
            case 16 -> l(-1410454679, var9 ^ -659435018);
            case 17 -> l(-1410454678, var9 ^ -103196653);
            case 18 -> l(-1410454677, var9 ^ 484189140);
            case 19 -> l(-1410454676, var9 ^ -1913574994);
            case 20 -> l(-1410454675, var9 ^ 1415625958);
            case 21 -> l(-1410454674, var9 ^ -8799998);
            case 22 -> l(-1410454673, var9 ^ -1953311310);
            case 23 -> l(-1410454688, var9 ^ -714298557);
            case 24 -> l(-1410454687, var9 ^ -1953955079);
            case 25 -> l(-1410454686, var9 ^ -344551658);
            case 26 -> l(-1410454685, var9 ^ -1451541924);
            case 27 -> l(-1410454684, var9 ^ 1115941751);
            case 28 -> l(-1410454683, var9 ^ -1031221017);
            case 29 -> l(-1410454682, var9 ^ -958447413);
            case 30 -> l(-1410454681, var9 ^ 396183715);
            case 31 -> l(-1410454664, var9 ^ -883971715);
            case 32 -> l(-1410454663, var9 ^ 635199241);
            case 33 -> l(-1410454662, var9 ^ 444279286);
            case 34 -> l(-1410454661, var9 ^ -563364133);
            case 35 -> l(-1410454660, var9 ^ -557198784);
            case 36 -> l(-1410454659, var9 ^ -1280730160);
            case 37 -> l(-1410454658, var9 ^ -535505830);
            case 38 -> l(-1410454657, var9 ^ 546586850);
            case 39 -> l(-1410454672, var9 ^ 1199214650);
            case 40 -> l(-1410454671, var9 ^ 1771239343);
            case 41 -> 5;
            case 42 -> l(-1410454670, var9 ^ -1241838423);
            case 43 -> l(-1410454669, var9 ^ 586989380);
            case 44 -> l(-1410454668, var9 ^ 1096130709);
            case 45 -> l(-1410454667, var9 ^ 154083948);
            case 46 -> l(-1410454666, var9 ^ -385481367);
            case 47 -> l(-1410454665, var9 ^ -1489397484);
            case 48 -> l(-1410454648, var9 ^ 1780626955);
            case 49 -> l(-1410454647, var9 ^ -2105382456);
            case 50 -> l(-1410454646, var9 ^ -97579456);
            case 51 -> l(-1410454645, var9 ^ -1221633743);
            case 52 -> l(-1410454644, var9 ^ -2125026149);
            case 53 -> l(-1410454643, var9 ^ -38628613);
            case 54 -> l(-1410454642, var9 ^ 506756413);
            case 55 -> l(-1410454641, var9 ^ 1690987287);
            case 56 -> l(-1410454656, var9 ^ 694854590);
            case 57 -> l(-1410454655, var9 ^ 341278625);
            case 58 -> l(-1410454654, var9 ^ -1534630101);
            case 59 -> l(-1410454653, var9 ^ -64820779);
            case 60 -> l(-1410454652, var9 ^ -1848057239);
            case 61 -> l(-1410454651, var9 ^ -28507508);
            case 62 -> l(-1410454650, var9 ^ 1454029539);
            case 63 -> l(-1410454649, var9 ^ -2111037835);
            case 64 -> l(-1410454632, var9 ^ -1979499672);
            case 65 -> l(-1410454631, var9 ^ -11421919);
            case 66 -> l(-1410454630, var9 ^ -1016223845);
            case 67 -> l(-1410454629, var9 ^ -1413640288);
            case 68 -> l(-1410454628, var9 ^ 214986896);
            case 69 -> l(-1410454627, var9 ^ 919040546);
            case 70 -> l(-1410454626, var9 ^ 295865042);
            case 71 -> l(-1410454625, var9 ^ 1073736335);
            case 72 -> l(-1410454640, var9 ^ 757808565);
            case 73 -> l(-1410454639, var9 ^ -586281839);
            case 74 -> l(-1410454638, var9 ^ 1694362656);
            case 75 -> l(-1410454637, var9 ^ 1011601471);
            case 76 -> l(-1410454636, var9 ^ 263779756);
            case 77 -> l(-1410454635, var9 ^ -940948032);
            case 78 -> l(-1410454634, var9 ^ 2006083750);
            case 79 -> l(-1410454633, var9 ^ -1037387237);
            case 80 -> l(-1410454616, var9 ^ 993331991);
            case 81 -> l(-1410454615, var9 ^ -910502617);
            case 82 -> l(-1410454614, var9 ^ -587890269);
            case 83 -> l(-1410454613, var9 ^ -659028386);
            case 84 -> l(-1410454612, var9 ^ -2140951661);
            case 85 -> l(-1410454611, var9 ^ 585658335);
            case 86 -> l(-1410454610, var9 ^ 595658453);
            case 87 -> l(-1410454609, var9 ^ 1209843682);
            case 88 -> l(-1410454624, var9 ^ -996002665);
            case 89 -> l(-1410454623, var9 ^ -1715553438);
            case 90 -> l(-1410454622, var9 ^ 1514991643);
            case 91 -> l(-1410454621, var9 ^ -865537704);
            case 92 -> l(-1410454620, var9 ^ 1546874235);
            case 93 -> l(-1410454619, var9 ^ 1418066409);
            case 94 -> l(-1410454618, var9 ^ -1569496410);
            case 95 -> l(-1410454617, var9 ^ -51741357);
            case 96 -> l(-1410454600, var9 ^ -1307012230);
            case 97 -> l(-1410454599, var9 ^ -1192805278);
            case 98 -> l(-1410454598, var9 ^ 1895269847);
            case 99 -> l(-1410454597, var9 ^ -1254626544);
            case 100 -> l(-1410454596, var9 ^ 1100880266);
            case 101 -> l(-1410454595, var9 ^ -234132856);
            case 102 -> l(-1410454594, var9 ^ -439461141);
            case 103 -> l(-1410454593, var9 ^ 2058874087);
            case 104 -> l(-1410454608, var9 ^ 1154628678);
            case 105 -> l(-1410454607, var9 ^ -821633134);
            case 106 -> l(-1410454606, var9 ^ -272959267);
            case 107 -> l(-1410454605, var9 ^ 938296258);
            case 108 -> l(-1410454604, var9 ^ -1586643362);
            case 109 -> l(-1410454603, var9 ^ -1904088535);
            case 110 -> l(-1410454602, var9 ^ 442196447);
            case 111 -> l(-1410454601, var9 ^ -1872175599);
            case 112 -> l(-1410454584, var9 ^ -261221839);
            case 113 -> l(-1410454583, var9 ^ 496402847);
            case 114 -> l(-1410454582, var9 ^ -1615591103);
            case 115 -> l(-1410454581, var9 ^ 1554615390);
            case 116 -> l(-1410454580, var9 ^ -1225951976);
            case 117 -> l(-1410454579, var9 ^ 608886345);
            case 118 -> l(-1410454578, var9 ^ -83353295);
            case 119 -> 4;
            case 120 -> l(-1410454577, var9 ^ -1530396980);
            case 121 -> l(-1410454592, var9 ^ -963406968);
            case 122 -> l(-1410454591, var9 ^ 1884659417);
            case 123 -> l(-1410454590, var9 ^ -1959463351);
            case 124 -> l(-1410454589, var9 ^ -431094430);
            case 125 -> l(-1410454588, var9 ^ 838390197);
            case 126 -> l(-1410454587, var9 ^ 140505420);
            case 127 -> l(-1410454586, var9 ^ -978270557);
            case 128 -> l(-1410454585, var9 ^ 247091786);
            case 129 -> l(-1410454568, var9 ^ -1272996382);
            case 130 -> l(-1410454567, var9 ^ 1107902365);
            case 131 -> l(-1410454566, var9 ^ 2074324100);
            case 132 -> l(-1410454565, var9 ^ -233410422);
            case 133 -> l(-1410454564, var9 ^ 1459315690);
            case 134 -> l(-1410454563, var9 ^ -875628757);
            case 135 -> l(-1410454562, var9 ^ -1798745534);
            case 136 -> l(-1410454561, var9 ^ -647534858);
            case 137 -> l(-1410454576, var9 ^ -1158015418);
            case 138 -> l(-1410454575, var9 ^ -621033477);
            case 139 -> l(-1410454574, var9 ^ -2093404059);
            case 140 -> l(-1410454573, var9 ^ 2053788968);
            case 141 -> l(-1410454572, var9 ^ -1506426543);
            case 142 -> l(-1410454571, var9 ^ -345188629);
            case 143 -> l(-1410454570, var9 ^ 414706666);
            case 144 -> l(-1410454569, var9 ^ -1754269302);
            case 145 -> l(-1410454552, var9 ^ 831103562);
            case 146 -> l(-1410454551, var9 ^ 1712900983);
            case 147 -> 3;
            case 148 -> l(-1410454550, var9 ^ 1002402679);
            case 149 -> l(-1410454549, var9 ^ -1229848501);
            case 150 -> l(-1410454548, var9 ^ 1922842260);
            case 151 -> l(-1410454547, var9 ^ 1387249187);
            case 152 -> l(-1410454546, var9 ^ 165749566);
            case 153 -> l(-1410454545, var9 ^ -1903914786);
            case 154 -> l(-1410454560, var9 ^ -2041840175);
            case 155 -> l(-1410454559, var9 ^ -2075419747);
            case 156 -> l(-1410454558, var9 ^ 604676237);
            case 157 -> l(-1410454557, var9 ^ -1628117700);
            case 158 -> l(-1410454556, var9 ^ -546815203);
            case 159 -> l(-1410454555, var9 ^ 507779933);
            case 160 -> l(-1410454554, var9 ^ 1362643167);
            case 161 -> l(-1410454553, var9 ^ 2083671863);
            case 162 -> l(-1410454536, var9 ^ 1631600171);
            case 163 -> l(-1410454535, var9 ^ 840032932);
            case 164 -> l(-1410454534, var9 ^ 1424628850);
            case 165 -> l(-1410454533, var9 ^ -299400979);
            case 166 -> l(-1410454532, var9 ^ -290430266);
            case 167 -> l(-1410454531, var9 ^ 1909964771);
            case 168 -> l(-1410454530, var9 ^ -1364992223);
            case 169 -> l(-1410454529, var9 ^ -1652341359);
            case 170 -> l(-1410454544, var9 ^ 1647899685);
            case 171 -> l(-1410454543, var9 ^ -1481668707);
            case 172 -> 1;
            case 173 -> l(-1410454542, var9 ^ 925641695);
            case 174 -> l(-1410454541, var9 ^ -816472085);
            case 175 -> l(-1410454540, var9 ^ 559091475);
            case 176 -> l(-1410454539, var9 ^ -834486607);
            case 177 -> l(-1410454538, var9 ^ 326482686);
            case 178 -> l(-1410454537, var9 ^ 2009267253);
            case 179 -> l(-1410455032, var9 ^ 1401197879);
            case 180 -> l(-1410455031, var9 ^ 142427534);
            case 181 -> l(-1410455030, var9 ^ -264896217);
            case 182 -> l(-1410455029, var9 ^ -1737472948);
            case 183 -> l(-1410455028, var9 ^ 1018803737);
            case 184 -> l(-1410455027, var9 ^ 1353190251);
            case 185 -> l(-1410455026, var9 ^ 752875413);
            case 186 -> l(-1410455025, var9 ^ 1673901139);
            case 187 -> l(-1410455040, var9 ^ 1936410407);
            case 188 -> l(-1410455039, var9 ^ -1305270814);
            case 189 -> 0;
            case 190 -> l(-1410455038, var9 ^ -119705508);
            case 191 -> l(-1410455037, var9 ^ -2012054174);
            case 192 -> l(-1410455036, var9 ^ 297115787);
            case 193 -> l(-1410455035, var9 ^ 1273314839);
            case 194 -> l(-1410455034, var9 ^ -801355946);
            case 195 -> l(-1410455033, var9 ^ 235258183);
            case 196 -> l(-1410455016, var9 ^ 1227390497);
            case 197 -> l(-1410455015, var9 ^ 752983099);
            case 198 -> l(-1410455014, var9 ^ 187471183);
            case 199 -> l(-1410455013, var9 ^ 57506271);
            case 200 -> l(-1410455012, var9 ^ 959335796);
            case 201 -> l(-1410455011, var9 ^ -627243102);
            case 202 -> l(-1410455010, var9 ^ -1811746830);
            case 203 -> l(-1410455009, var9 ^ -1715127217);
            case 204 -> l(-1410455024, var9 ^ -1162848614);
            case 205 -> l(-1410455023, var9 ^ -490538751);
            case 206 -> l(-1410455022, var9 ^ 1960193380);
            case 207 -> l(-1410455021, var9 ^ -1030013705);
            case 208 -> l(-1410455020, var9 ^ 1500118236);
            case 209 -> l(-1410455019, var9 ^ -292783509);
            case 210 -> l(-1410455018, var9 ^ -635192585);
            case 211 -> l(-1410455017, var9 ^ -371023463);
            case 212 -> l(-1410455000, var9 ^ -1673717426);
            case 213 -> l(-1410454999, var9 ^ -163219572);
            case 214 -> l(-1410454998, var9 ^ 886847949);
            case 215 -> l(-1410454997, var9 ^ -1882800473);
            case 216 -> l(-1410454996, var9 ^ 480858417);
            case 217 -> l(-1410454995, var9 ^ 1146685641);
            case 218 -> l(-1410454994, var9 ^ 1101184572);
            case 219 -> l(-1410454993, var9 ^ -1050417671);
            case 220 -> l(-1410455008, var9 ^ -682586142);
            case 221 -> l(-1410455007, var9 ^ 529782458);
            case 222 -> l(-1410455006, var9 ^ -1233028923);
            case 223 -> l(-1410455005, var9 ^ 1677729181);
            case 224 -> l(-1410455004, var9 ^ 1847068974);
            case 225 -> l(-1410455003, var9 ^ -2074226859);
            case 226 -> l(-1410455002, var9 ^ -1573519424);
            case 227 -> l(-1410455001, var9 ^ 290181147);
            case 228 -> l(-1410454984, var9 ^ -28681285);
            case 229 -> l(-1410454983, var9 ^ 552771128);
            case 230 -> l(-1410454982, var9 ^ 1960934851);
            case 231 -> l(-1410454981, var9 ^ -1828393887);
            case 232 -> l(-1410454980, var9 ^ -75977520);
            case 233 -> l(-1410454979, var9 ^ 1754068838);
            case 234 -> l(-1410454978, var9 ^ 1047509862);
            case 235 -> l(-1410454977, var9 ^ -1816855284);
            case 236 -> l(-1410454992, var9 ^ 1860695545);
            case 237 -> l(-1410454991, var9 ^ -508845818);
            case 238 -> l(-1410454990, var9 ^ 797247553);
            case 239 -> l(-1410454989, var9 ^ -388020649);
            case 240 -> l(-1410454988, var9 ^ 1687408120);
            case 241 -> l(-1410454987, var9 ^ -1334624536);
            case 242 -> l(-1410454986, var9 ^ 498925561);
            case 243 -> l(-1410454985, var9 ^ 477416375);
            case 244 -> l(-1410454968, var9 ^ 1082175959);
            case 245 -> 2;
            case 246 -> l(-1410454967, var9 ^ 321902074);
            case 247 -> l(-1410454966, var9 ^ 1001791687);
            case 248 -> l(-1410454965, var9 ^ 299442234);
            case 249 -> l(-1410454964, var9 ^ 1743474757);
            case 250 -> l(-1410454963, var9 ^ -1770759031);
            case 251 -> l(-1410454962, var9 ^ 1519754756);
            case 252 -> l(-1410454961, var9 ^ -1956049419);
            case 253 -> l(-1410454976, var9 ^ -200449572);
            case 254 -> l(-1410454975, var9 ^ -798571931);
            default -> l(-1410454974, var9 ^ 847767826);
         };
         int var5 = (var1 & l(-1410454973, var9 ^ -1919527194)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & l(-1410454972, var9 ^ -548655584)) >>> l(-1410454971, var9 ^ 1601053968)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & l(-1410454970, var9 ^ -1435566276);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & l(-1410454969, var9 ^ 807833785);
            }
         }

         lll[var2] = new String(var3).intern();
      }

      return lll[var2];
   }

   public llIllll() {
      super(IlIIllIII.Ill(lI[l(-1410454952, 1579117062 ^ 1992022297)]), lllIIlIl.IIl, IlIIllIII.Ill(lI[l(-1410454951, 1579117062 ^ 485957333)]));
      this.III = this.IllIIll(new IIlIII(IlIIllIII.Ill(lI[l(-1410454950, 1579117062 ^ 1162861131)]), 5.0, 2.0, 32.0, 1.0));
      this.Ill = this.IllIIll(new IllIlIl(IlIIllIII.Ill(lI[l(-1410454949, 1579117062 ^ -497148606)]), List.of()));
      this.lIl = new HashSet<>();
   }

   private class_2338 llI(List<class_2338> var1) {
      long var2 = 0L;
      long var4 = 0L;
      long var6 = 0L;

      for (class_2338 var9 : var1) {
         var2 += var9.method_10263();
         var4 += var9.method_10264();
         var6 += var9.method_10260();
      }

      int var10 = Math.max(1, var1.size());
      return new class_2338(Math.round((float)var2 / var10), Math.round((float)var4 / var10), Math.round((float)var6 / var10));
   }

   @Override
   public void IIlIl() {
      if (++this.lII >= l(-1410454948, 1501019507 ^ -1830792008)) {
         this.lII = 0;
         class_310 var1 = class_310.method_1551();
         if (var1 != null && var1.field_1724 != null && var1.field_1687 != null) {
            List var2 = this.lI(var1, var1.field_1687, var1.field_1724.method_24515());
            if (!var2.isEmpty()) {
               this.Ill(var2);
            }
         }
      }
   }
}
