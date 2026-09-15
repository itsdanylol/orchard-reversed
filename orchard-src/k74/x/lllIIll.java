package k74.x;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_640;
import net.minecraft.class_327.class_6415;
import org.joml.Matrix4f;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(EnvType.CLIENT)
public final class lllIIll {
   private static final float I = 3.0F;
   private static Method II;
   private static Field Il;
   private static Method l;
   private static final String[] lI;
   private static boolean ll;
   private static final int[] lIII;
   private static final Logger III;
   private static Field IIl;
   private static final String[] IlI;
   private static Method Ill;
   private static Class<?> lII;
   private static final float lIl = 2.0F;
   private static Method llI;
   private static boolean lll;
   private static Field IIII;
   private static final Object[] lIlI;
   private static final String[] lIIl;
   private static final float IIIl = -0.1F;
   private static Field IIlI;
   private static Field IIll;
   private static Class<?> IlII;
   private static Method IlIl;
   private static Method IllI;
   private static Class<?> Illl;

   private static void I(String var0, Exception var1) {
      if (!lll) {
         lll = true;
         III.warn(IlIIllIII.lI(IIII(llll(-1553933573, -1149810289 ^ 192678089), llll(-1553933574, -1149810289 ^ -53063422))), var0, var1);
      }
   }

   private static boolean l(UUID var0) {
      return IlIlIIlll.IIl(var0);
   }

   public static boolean II() {
      return lIII() != null;
   }

   public static IlIIII Il(UUID var0) {
      IIlIIIIll var1 = lIII();
      return var1 != null && var1.Il(var0) ? var1.III() : null;
   }

   private static boolean lI(UUID var0) {
      IIlIIIIll var1 = lIII();
      return var1 != null && var1.Il(var0);
   }

   private static Exception ll(Exception var0) {
      return var0;
   }

   private static String III(class_2561 var0) {
      return var0 == null ? "" : var0.getString().trim();
   }

   public static lIlll IIl(UUID var0) {
      return lI(var0) ? new lIlll(true, null) : lIlll.I;
   }

   public static int IlI(class_2561 var0) {
      IlIIII var1 = llI(var0);
      return var1 == null ? 0 : var1.ll();
   }

   public static void Ill(Object param0, class_2561 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 1d
      // 04: aload 1
      // 05: ifnull 1d
      // 08: goto 0f
      // 0b: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 0e: athrow
      // 0f: aload 0
      // 10: invokestatic k74/x/lllIIll.lll (Ljava/lang/Object;)Z
      // 13: ifne 22
      // 16: goto 1d
      // 19: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 1c: athrow
      // 1d: return
      // 1e: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 21: athrow
      // 22: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 25: astore 2
      // 26: aload 2
      // 27: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 2a: ifnonnull 32
      // 2d: return
      // 2e: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 31: athrow
      // 32: aload 2
      // 33: getfield net/minecraft/class_310.field_1772 Lnet/minecraft/class_327;
      // 36: aload 1
      // 37: invokevirtual net/minecraft/class_327.method_27525 (Lnet/minecraft/class_5348;)I
      // 3a: istore 3
      // 3b: aload 0
      // 3c: invokestatic k74/x/lllIIll.lIIl (Ljava/lang/Object;)Ljava/util/UUID;
      // 3f: invokestatic k74/x/lllIIll.Il (Ljava/util/UUID;)Lk74/x/IlIIII;
      // 42: astore 4
      // 44: aload 4
      // 46: ifnull 51
      // 49: iload 3
      // 4a: aload 4
      // 4c: invokevirtual k74/x/IlIIII.ll ()I
      // 4f: iadd
      // 50: istore 3
      // 51: getstatic k74/x/lllIIll.IIlI Ljava/lang/reflect/Field;
      // 54: aload 0
      // 55: iload 3
      // 56: invokevirtual java/lang/reflect/Field.setInt (Ljava/lang/Object;I)V
      // 59: goto 7b
      // 5c: astore 3
      // 5d: ldc -1553933575
      // 5f: ldc 1381457657
      // 61: ldc -1728941876
      // 63: ixor
      // 64: invokestatic k74/x/lllIIll.llll (II)I
      // 67: ldc -1553933576
      // 69: ldc 1381457657
      // 6b: ldc -661960907
      // 6d: ixor
      // 6e: invokestatic k74/x/lllIIll.llll (II)I
      // 71: invokestatic k74/x/lllIIll.IIII (II)Ljava/lang/String;
      // 74: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 77: aload 3
      // 78: invokestatic k74/x/lllIIll.I (Ljava/lang/String;Ljava/lang/Exception;)V
      // 7b: return
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 2142227015;
      short var7 = 11386;
      byte var14 = -1;
      char[] var9 = "ⴐⰷ".toCharArray();
      String var8 = "䂲㼴䃟䁐䂠䁛䃀䃝䂘䂧䃝䁇䀫䂟䂒䁒䂎䃫䁈䂥㿭䂌䁕䀗䀂䀓㾨䃋䃖䀮䀈䂇䃼䀬䂋㿦䁣䁌䂝䁇䀨䂽㾓㼿䂼䂐䂽䂴㾺㽢䁬䃏䁈䀢䀝䀏䁟䁆䂄䁓䀨䁼䃆䂈䂝㿭㼹䁇䁷䁓䃋䀒䁊䃮㽴䀕㼦䃪㾼䁛䀂㾪䀦䂃䀔䁫㼭㾑㼺䁓䂛䁸䀁䁠䀗䃛䂹䀴㼹䂕䀶㼤䃲䃼䂪䃉䀟䁀㼰䂺䂐䂖㾜䃀䀉䀻䂹㼝㼾䁜䁌䃈䁴䀜䂖䁄䁣䀯䁙䁝䂺䁏䁘㼧䃼䃀䁪㾕䃴䀬䀈䀌䁣䂘䂜䀺䃖䀂䀁䂚䀇䃢䀂䃍䁝䀙䃼䂡䀅䀐䃁㾱䀈䀣䂵䂷䂗㼆㾯䁒䀜䃡䂸㾧䂕䂂䀙䃦䃞䃶䃙䁗䃷䀛䂰䂟䃣䁾䀎䀯䃲䀀䀀䁼䃥䁩䃋䁯䂵䀬䁋㼩䁕䂍䃆㿬䃖㼚䀟䁝䂍䃍䀼䃠㿱䁖䂽䃠䁩䂗䀄䀉㼘䀒㽹䂔䁋䁔䂂䃓䂜䃴䁉䀚䀁㿾䁚䃘䁕䂕䃟䃔䃖䂍䀷㿠䁺㾊䁂䂙䀥䂻䁎䃖䁂䀏䃀䁶䂅䃘㿫䃮㾛䀘㿫䀆䃳䃷䀢䁉䃘䃀䃒䃣䁘䀌䁑䁊䀶䂩㿠䂆䃟䃇䂤䂎䁣䁁䀝䃀㽹䀌䁥䀩䀈䀚䃫䁌䀛䁖䁦䃾䁾㾫䂻㿹䂖䁘䃷䀔䂜䃘䀒䁗䁓䀬䀅䀧䃯㽢䁜㼲䂣䀓䂏㿢㾲䃓㼻䁕㿺㼰䃼䃁䂅䀭䁹䃿㾬䂇䀉䀐䃡䃦䀦䂫䃁䃐䃂䃥䁔䁀䀒䀏䁏䁗䀘䁅䁒䂍䂯䂅뗹뙻뚖뛦뛍뚘뚾뙻뛞똕뙔뛮떀뙘땦똸뙟뛵뛪땻뚋뙅뙰뛒뙉뙨뛠뚪뙅뛲뚤떨뚯뛮뚮뛘뛈뚵뚏똽뛌뚢떄뙳뙞뙛똂뛭뙀뚤뙃뚧똉똕땨뗧뙢뛺뙣뙏뚾떤뛁뛬똵똣딵뙮뚍똟뚀딻똓또뛗뛑똟";
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            lIIl = var10;
            lIlI = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            lIII = new int[308];
            byte[] var10002 = "¬¦'`[\fF\u0088Ö\bH\u0006\u0096rÃK½\u0001\u0010\u0092\u009c\u0014eC[\u0014k\u0011&'Û²\u0002Xl\u0001áé\u000b\u00ad\u0005\u008e\u0096\u00111§c ë\u0080\u000e\u008fFÔ\u007f1é\u0095ó\u008cP.6\u0001S$!`]O,iM\u0018õ*k\u009fb«ZÜ)-\u0000³¢±¿@ýa_\u0010ü\u0088i\u008dÔ\u0082\u0007Ìæ\u0015\f\u0092ñä\u000bJÅ\n ê°GH\u00945Îþßq-\u0005aª´\"ãjm\u00adWj\u007fK´É\u0082a\u0004?$[\u009a]¥ºû°_TÉÑjø³/\u0001Ä.Ð¤ÎI\u0014\u0087\f3ù?@AKýTëó\u0099nÃòm\u0094±µÜb\u000fý\u007fr3\u008cÕy\"i¬\u0089s\u0006\u0081ïÀÈÔ¢¸ð%¹mn¸y ¦\u008bðúrÁW5,\u0006åôþw\u0004üÓÏß_Ún\b ¡%!§\u009cra|·oP?H\u0081«ùè5â ÿà\u0017\u0004\u0017\u0018RÖWÃ\t¢\u0097Vfüñ~üý£'C®§\u0006¤¤Í\u008bo\u0000¯¬ý\u0083\u009b»Ï\"Ù$@=Ù\u0086ÔN\u0094û¤èq\u0017½÷.ïvÿ\f\u000el\u0013\u009fb\u0016\u0084kÎéê\u009aÎ²\f_±ùÒ\u009ezç²\u0012\u001a\u0093Ô\u0017W]\u001c@\u009a9åj!]#Ý»\u001c¢gì§è¶Q\u0093ã\u008c\u008c?ó¤µóèÀÎ¾Ég\u0093r\u009e\u0013¸bq\u0094\u0088ßhÙc¥´8[\u000b`\u0085]]<\u009cIfue\u0011ïDïúkSè\u0010k1\u0001\u0084ý·\u0016\u009c\u009f\u0016µõÜ÷Ð³],J$\u008eQÑÃ\b\u0007¥\u0091>`%Ì¸<uîÖû£Õ\u001dyãì»K8Êm\u009c´³£¦~pù*\u0088´\u001a#mÌù\u0010\u00adC¼¨\u0081Ë&\u0081¹c7ó\u001b:kùSµ\u00ad\u0010é£¬EÕEm%Ýá@\nÃjî\u009a:\u0083\u001bT\u0086ñ§\u000bÊË\u0011¡Á\u009d£ö\u001e4lÂI¬ØL\u0011ûC@Âtõ\u00ad\u0013À°¼¤¸dg\u0018\u00893sÉ¼âF \u009dÄ\u008eÁ\u0082ßu<®°ä\u008b+I\u0081\u001e\u009bX\u0019¯ì\u0084NÐ4o(O&U'ß¥û®Ô¼aO£0Üq\u001aqXhÕJNöp\u009dø×vo\u0091\u007f2\u009e¦³2g\u009fÀþ\u0099ÂT¿\u000e]å\u0086L%û¥ÀZ·\u0010ÃÊc\u0092eô\nGÐ×\u007f\u007fD\u001f\u008e=ÐÉ8üÌiwaÝH\u0000Nè¯9r}q\u000fã\u0093K¶\u0087nÅ¾8X\u0012\u0003saÌG\u007fÓÄ^Éé]÷'÷Îmø\u0005Önû\u0001\u0085\u0012bÀ\"+¦eäwÒ{T\u008eK`uQû\u009dãÿ\u001að \u0007 ýyf\u0019ª]\u0011\u0093³7¢c\u0090½ÅJ\u009f\u0017+`\u0012óH# .ÍçÝ_\u000fBÐF\u008e\u009cÆo30éÝ¯ÞËÑÁÅD²\u001c\u001d\u0086<è5r\u0018\u0001\u0014\u0006\"ÕÏ&Ôi\u001b\u0086\u0087\u0085±zó\\Ì\u0087¨¨¸6õ\u000f8\u0097ñzJô¹0X\" mþ\u0084\u001bbØ3n0[û±&Ö[[ïç\u008b\fï\u0017¡\u0005Úæ\u0093j±\u001a}¼0ðR!¡°\u001fång~èí¨Î/Ëj¯;Óéü£\u0019ù8\u000eZ\u0095\u0097\u008dÂo\u0093øè\u0017\u0015f¢\u0099×í\u0098,n\u00ad\\\u0091¹\u001dY\u0092/SÂz\u0097\u0092\u0012ÐT)\u0015bJrÄÎÆ¼\u0089;-\u0097b\u0089KØ+\u001aµë\u0002Ù¾õ¾\u0093\u0004¦ü\u001a\u0018Ã\u0090¿Àý\u0017ÊøÍ¥ý\u0098\u001búBU\r®ØÛÌ\u00ad\u008eD\r\u001aµ\u000b¿ÕE\u007fã\u0092ðk½o\u0088\u0003ô×\u0000\u0091\u001b\"\u0006a\u009c#2|\u001cM¹3wPî\u0096<ìÉs¥MÚ}?\u009b\u0096J][^§bMþTD\u009a[`Y\u0099.\u009dªJ\u0097òUHhT\b\u009b\rûc\u0082ýÖ\u0089ììe{\u0015l¿u\u0097¢\u000b\u0015áÐ\u001bîÆ^Oõ\u009a®}¢ÔCÄ(Ôàè®å×\u008ejb\u0086²D_ìÃ!IQRñKc&g|¶T\u0001ãbmgvVö2\u0094\u001bö\u0006zaQ\u0011_¾@\u0010\u00987v\u009aG6\u0002\u0091ÎS\u008a\"\u0019.ËÞ\u0091àÒ8¤g\u009ai8ñ\u001ah)Æ¥j?ÍË\u0016\u009f{\u008bà^» h¢\u0001µ?éK\u0018Ì4\u009dq\u0099jz\u0002'<XÍ\t\u0003Óþ}Ô\u0002Æ¯\u0095OP"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               lIII[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1077149061;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var5 = new String[llll(-1553933325, var18 ^ 664287842)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IIIII('猨', 9950, var18 ^ -764628568)).length();
            int var1 = llll(-1553933326, var18 ^ 983256629);
            int var20 = -1;

            label100:
            while (true) {
               var22 = llll(-1553933327, var18 ^ -917964866);
               String var27 = var2.substring(++var20, var20 + var1);
               byte var39 = -1;

               while (true) {
                  label95: {
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
                           break label95;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % llll(-1553933323, var18 ^ -353464961)) {
                           case 0 -> 1;
                           case 1 -> llll(-1553933324, var18 ^ 404163828);
                           case 2 -> llll(-1553933333, var18 ^ 378913548);
                           case 3 -> llll(-1553933334, var18 ^ 1994633462);
                           case 4 -> llll(-1553933335, var18 ^ -1916518695);
                           case 5 -> llll(-1553933336, var18 ^ -1768370490);
                           default -> llll(-1553933329, var18 ^ -1042930859);
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
                           lI = var5;
                           IlI = new String[llll(-1553933322, var18 ^ 8428753)];
                           III = LoggerFactory.getLogger(lllIIll.class);
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var62;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label100;
                        }

                        var4 = (var2 = IIIII('猩', 43338, var18 ^ -407194779)).length();
                        var1 = llll(-1553933328, var18 ^ 910821610);
                        var20 = -1;
                  }

                  var22 = llll(-1553933321, var18 ^ 1805217093);
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
               short var17 = switch (var16 % 5) {
                  default -> 18;
                  case 1 -> 195;
                  case 2 -> 118;
                  case 3 -> 87;
                  case 4 -> 129;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static boolean lII(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 12
      // 04: aload 0
      // 05: invokestatic k74/x/lllIIll.lll (Ljava/lang/Object;)Z
      // 08: ifne 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11: athrow
      // 12: bipush 0
      // 13: ireturn
      // 14: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: getstatic k74/x/lllIIll.IIll Ljava/lang/reflect/Field;
      // 1b: aload 0
      // 1c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1f: astore 1
      // 20: aload 1
      // 21: instanceof net/minecraft/class_1297
      // 24: ifne 29
      // 27: bipush 0
      // 28: ireturn
      // 29: getstatic k74/x/lllIIll.Il Ljava/lang/reflect/Field;
      // 2c: aload 0
      // 2d: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 30: ifne 5d
      // 33: getstatic k74/x/lllIIll.IIl Ljava/lang/reflect/Field;
      // 36: aload 0
      // 37: invokevirtual java/lang/reflect/Field.getBoolean (Ljava/lang/Object;)Z
      // 3a: ifeq 5d
      // 3d: goto 44
      // 40: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 43: athrow
      // 44: getstatic k74/x/lllIIll.IIII Ljava/lang/reflect/Field;
      // 47: aload 0
      // 48: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 4b: ifnonnull 5d
      // 4e: goto 55
      // 51: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 54: athrow
      // 55: bipush 1
      // 56: goto 5e
      // 59: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 5c: athrow
      // 5d: bipush 0
      // 5e: ireturn
      // 5f: astore 1
      // 60: ldc_w -1553933569
      // 63: ldc_w -484493799
      // 66: ldc_w 1119043744
      // 69: ixor
      // 6a: invokestatic k74/x/lllIIll.llll (II)I
      // 6d: ldc_w -1553933570
      // 70: ldc_w -484493799
      // 73: ldc_w 1671836444
      // 76: ixor
      // 77: invokestatic k74/x/lllIIll.llll (II)I
      // 7a: invokestatic k74/x/lllIIll.IIII (II)Ljava/lang/String;
      // 7d: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 80: aload 1
      // 81: invokestatic k74/x/lllIIll.I (Ljava/lang/String;Ljava/lang/Exception;)V
      // 84: bipush 0
      // 85: ireturn
   }

   private static boolean lIl(class_2561 var0) {
      IIlIIIIll var1 = lIII();
      class_310 var2 = class_310.method_1551();
      if (var1 != null && var2.field_1724 != null && var0 != null) {
         String var3 = III(IlIlIIlll.l(var0));
         if (var3.isBlank()) {
            return false;
         } else {
            String var4 = III(IlIlIIlll.l(var2.field_1724.method_5476()));
            if (!var4.isBlank() && var3.equalsIgnoreCase(var4)) {
               return true;
            } else {
               String var5 = lIlIIIll.Ill(var2.field_1724.method_7334());
               return var5 != null && var3.equalsIgnoreCase(var5);
            }
         }
      } else {
         return false;
      }
   }

   public static IlIIII llI(class_2561 var0) {
      return lIl(var0) ? lIll() : null;
   }

   private static boolean lll(Object var0) {
      return false;
   }

   private static String IIII(int var0, int var1) {
      int var9 = 1162660170;
      int var2 = (var0 ^ llll(-1553933571, var9 ^ 49661045)) & llll(-1553933572, var9 ^ 2143795380);
      if (IlI[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & llll(-1553933581, var9 ^ 1538854408)) {
            case 0 -> llll(-1553933582, var9 ^ -1207408353);
            case 1 -> llll(-1553933583, var9 ^ 1550840880);
            case 2 -> llll(-1553933584, var9 ^ 1749418430);
            case 3 -> llll(-1553933577, var9 ^ -1302238012);
            case 4 -> llll(-1553933578, var9 ^ 523574728);
            case 5 -> llll(-1553933579, var9 ^ -1334537938);
            case 6 -> llll(-1553933580, var9 ^ 164582460);
            case 7 -> llll(-1553933589, var9 ^ 180700149);
            case 8 -> llll(-1553933590, var9 ^ 78532293);
            case 9 -> llll(-1553933591, var9 ^ 351899903);
            case 10 -> llll(-1553933592, var9 ^ 847118387);
            case 11 -> llll(-1553933585, var9 ^ 54348627);
            case 12 -> llll(-1553933586, var9 ^ 1498595351);
            case 13 -> llll(-1553933587, var9 ^ -425616994);
            case 14 -> llll(-1553933588, var9 ^ 116498330);
            case 15 -> llll(-1553933597, var9 ^ 812429653);
            case 16 -> llll(-1553933598, var9 ^ 1580041355);
            case 17 -> llll(-1553933599, var9 ^ 1433637745);
            case 18 -> 2;
            case 19 -> llll(-1553933600, var9 ^ 1386981210);
            case 20 -> llll(-1553933593, var9 ^ 2030817985);
            case 21 -> llll(-1553933594, var9 ^ 292900878);
            case 22 -> llll(-1553933595, var9 ^ -1489103400);
            case 23 -> llll(-1553933596, var9 ^ 1551943899);
            case 24 -> llll(-1553933605, var9 ^ 2063730809);
            case 25 -> llll(-1553933606, var9 ^ -189396988);
            case 26 -> llll(-1553933607, var9 ^ 307604464);
            case 27 -> llll(-1553933608, var9 ^ 954555660);
            case 28 -> llll(-1553933601, var9 ^ 41631743);
            case 29 -> llll(-1553933602, var9 ^ -484781549);
            case 30 -> llll(-1553933603, var9 ^ 220771121);
            case 31 -> llll(-1553933604, var9 ^ -1588441676);
            case 32 -> llll(-1553933613, var9 ^ -1647332819);
            case 33 -> llll(-1553933614, var9 ^ -1750567412);
            case 34 -> llll(-1553933615, var9 ^ 1439865739);
            case 35 -> llll(-1553933616, var9 ^ 429926886);
            case 36 -> llll(-1553933609, var9 ^ 218797687);
            case 37 -> llll(-1553933610, var9 ^ 925013919);
            case 38 -> llll(-1553933611, var9 ^ -850339942);
            case 39 -> llll(-1553933612, var9 ^ 1005492671);
            case 40 -> llll(-1553933621, var9 ^ 735243868);
            case 41 -> llll(-1553933622, var9 ^ 549653879);
            case 42 -> 3;
            case 43 -> llll(-1553933623, var9 ^ -795712480);
            case 44 -> llll(-1553933624, var9 ^ -1239307693);
            case 45 -> llll(-1553933617, var9 ^ -78015929);
            case 46 -> llll(-1553933618, var9 ^ -527692554);
            case 47 -> llll(-1553933619, var9 ^ 549569544);
            case 48 -> llll(-1553933620, var9 ^ -1457844016);
            case 49 -> llll(-1553933629, var9 ^ 248794830);
            case 50 -> llll(-1553933630, var9 ^ -1139434376);
            case 51 -> llll(-1553933631, var9 ^ 1562227078);
            case 52 -> llll(-1553933632, var9 ^ -2034321288);
            case 53 -> llll(-1553933625, var9 ^ 1363264328);
            case 54 -> llll(-1553933626, var9 ^ 2017918700);
            case 55 -> llll(-1553933627, var9 ^ 949867807);
            case 56 -> llll(-1553933628, var9 ^ 165554925);
            case 57 -> llll(-1553933637, var9 ^ -233272808);
            case 58 -> llll(-1553933638, var9 ^ -1153328518);
            case 59 -> llll(-1553933639, var9 ^ 1323660216);
            case 60 -> llll(-1553933640, var9 ^ 188167609);
            case 61 -> llll(-1553933633, var9 ^ 1346631058);
            case 62 -> llll(-1553933634, var9 ^ 1058902801);
            case 63 -> llll(-1553933635, var9 ^ -1524840792);
            case 64 -> llll(-1553933636, var9 ^ 441435609);
            case 65 -> llll(-1553933645, var9 ^ -45764620);
            case 66 -> llll(-1553933646, var9 ^ 920767986);
            case 67 -> llll(-1553933647, var9 ^ -1537017512);
            case 68 -> llll(-1553933648, var9 ^ -1765556836);
            case 69 -> llll(-1553933641, var9 ^ 433896458);
            case 70 -> llll(-1553933642, var9 ^ -1917848012);
            case 71 -> llll(-1553933643, var9 ^ -49736265);
            case 72 -> llll(-1553933644, var9 ^ -468300632);
            case 73 -> llll(-1553933653, var9 ^ 790523404);
            case 74 -> llll(-1553933654, var9 ^ 905117091);
            case 75 -> llll(-1553933655, var9 ^ 1332021759);
            case 76 -> 0;
            case 77 -> llll(-1553933656, var9 ^ -1341391029);
            case 78 -> llll(-1553933649, var9 ^ -336774394);
            case 79 -> llll(-1553933650, var9 ^ -1607205870);
            case 80 -> llll(-1553933651, var9 ^ -1101827899);
            case 81 -> llll(-1553933652, var9 ^ -902466866);
            case 82 -> llll(-1553933661, var9 ^ 83698355);
            case 83 -> llll(-1553933662, var9 ^ 1610877174);
            case 84 -> llll(-1553933663, var9 ^ 79870214);
            case 85 -> llll(-1553933664, var9 ^ 1162020161);
            case 86 -> llll(-1553933657, var9 ^ -32910168);
            case 87 -> llll(-1553933658, var9 ^ -905777467);
            case 88 -> llll(-1553933659, var9 ^ 1712506495);
            case 89 -> llll(-1553933660, var9 ^ -1442208657);
            case 90 -> llll(-1553933669, var9 ^ -416807548);
            case 91 -> llll(-1553933670, var9 ^ 729772518);
            case 92 -> llll(-1553933671, var9 ^ 999354672);
            case 93 -> llll(-1553933672, var9 ^ -2037793576);
            case 94 -> llll(-1553933665, var9 ^ -61514530);
            case 95 -> 1;
            case 96 -> llll(-1553933666, var9 ^ 1384245056);
            case 97 -> llll(-1553933667, var9 ^ 81657449);
            case 98 -> llll(-1553933668, var9 ^ 1066664350);
            case 99 -> llll(-1553933677, var9 ^ -1230664854);
            case 100 -> llll(-1553933678, var9 ^ 850561547);
            case 101 -> llll(-1553933679, var9 ^ 852517609);
            case 102 -> llll(-1553933680, var9 ^ -1537837901);
            case 103 -> llll(-1553933673, var9 ^ -956835986);
            case 104 -> llll(-1553933674, var9 ^ -2062109422);
            case 105 -> llll(-1553933675, var9 ^ 80554235);
            case 106 -> llll(-1553933676, var9 ^ -676285343);
            case 107 -> llll(-1553933685, var9 ^ 1374078740);
            case 108 -> llll(-1553933686, var9 ^ 1736525777);
            case 109 -> llll(-1553933687, var9 ^ -505604478);
            case 110 -> llll(-1553933688, var9 ^ -1894070676);
            case 111 -> llll(-1553933681, var9 ^ 1150845427);
            case 112 -> llll(-1553933682, var9 ^ -492152102);
            case 113 -> llll(-1553933683, var9 ^ 880662081);
            case 114 -> llll(-1553933684, var9 ^ -96003071);
            case 115 -> llll(-1553933693, var9 ^ -1597248902);
            case 116 -> llll(-1553933694, var9 ^ 1136791338);
            case 117 -> llll(-1553933695, var9 ^ -1594765456);
            case 118 -> 4;
            case 119 -> llll(-1553933696, var9 ^ -448142675);
            case 120 -> llll(-1553933689, var9 ^ 2137054077);
            case 121 -> llll(-1553933690, var9 ^ 1846704423);
            case 122 -> llll(-1553933691, var9 ^ 840446441);
            case 123 -> llll(-1553933692, var9 ^ -185496688);
            case 124 -> llll(-1553933701, var9 ^ -173754380);
            case 125 -> llll(-1553933702, var9 ^ 885309263);
            case 126 -> llll(-1553933703, var9 ^ 434872654);
            case 127 -> llll(-1553933704, var9 ^ -1216653215);
            case 128 -> llll(-1553933697, var9 ^ 1119216680);
            case 129 -> llll(-1553933698, var9 ^ -18175967);
            case 130 -> llll(-1553933699, var9 ^ 1212195639);
            case 131 -> llll(-1553933700, var9 ^ -99123806);
            case 132 -> llll(-1553933709, var9 ^ 891497364);
            case 133 -> llll(-1553933710, var9 ^ -2119339059);
            case 134 -> llll(-1553933711, var9 ^ 446801703);
            case 135 -> llll(-1553933712, var9 ^ -1404274770);
            case 136 -> llll(-1553933705, var9 ^ -379730366);
            case 137 -> llll(-1553933706, var9 ^ 1032223407);
            case 138 -> llll(-1553933707, var9 ^ 1787997645);
            case 139 -> llll(-1553933708, var9 ^ -1146665522);
            case 140 -> llll(-1553933717, var9 ^ -1653628079);
            case 141 -> llll(-1553933718, var9 ^ -2037096943);
            case 142 -> llll(-1553933719, var9 ^ -385488397);
            case 143 -> llll(-1553933720, var9 ^ 274758816);
            case 144 -> llll(-1553933713, var9 ^ 33082464);
            case 145 -> llll(-1553933714, var9 ^ -575687309);
            case 146 -> llll(-1553933715, var9 ^ 919154135);
            case 147 -> llll(-1553933716, var9 ^ 214351112);
            case 148 -> llll(-1553933725, var9 ^ -1571834230);
            case 149 -> llll(-1553933726, var9 ^ 950976936);
            case 150 -> llll(-1553933727, var9 ^ -2054129462);
            case 151 -> llll(-1553933728, var9 ^ 25802669);
            case 152 -> llll(-1553933721, var9 ^ 387388630);
            case 153 -> llll(-1553933722, var9 ^ -1590291341);
            case 154 -> llll(-1553933723, var9 ^ -929148768);
            case 155 -> llll(-1553933724, var9 ^ -11382620);
            case 156 -> llll(-1553933733, var9 ^ -970875773);
            case 157 -> llll(-1553933734, var9 ^ -1682580884);
            case 158 -> llll(-1553933735, var9 ^ 67428922);
            case 159 -> llll(-1553933736, var9 ^ 2082129750);
            case 160 -> llll(-1553933729, var9 ^ 55997300);
            case 161 -> llll(-1553933730, var9 ^ -1820133602);
            case 162 -> llll(-1553933731, var9 ^ -1377098251);
            case 163 -> llll(-1553933732, var9 ^ -1902240317);
            case 164 -> llll(-1553933741, var9 ^ 1181704164);
            case 165 -> llll(-1553933742, var9 ^ -1864787551);
            case 166 -> llll(-1553933743, var9 ^ 815137599);
            case 167 -> llll(-1553933744, var9 ^ 299969875);
            case 168 -> llll(-1553933737, var9 ^ -153612186);
            case 169 -> llll(-1553933738, var9 ^ 686719009);
            case 170 -> llll(-1553933739, var9 ^ 307750233);
            case 171 -> llll(-1553933740, var9 ^ -1671472123);
            case 172 -> llll(-1553933749, var9 ^ 1273107991);
            case 173 -> llll(-1553933750, var9 ^ -1784275657);
            case 174 -> llll(-1553933751, var9 ^ -1648383206);
            case 175 -> llll(-1553933752, var9 ^ 68567977);
            case 176 -> llll(-1553933745, var9 ^ -1752392787);
            case 177 -> llll(-1553933746, var9 ^ -1886412979);
            case 178 -> llll(-1553933747, var9 ^ -588054176);
            case 179 -> llll(-1553933748, var9 ^ 2076886183);
            case 180 -> llll(-1553933757, var9 ^ -1114196423);
            case 181 -> llll(-1553933758, var9 ^ 225390090);
            case 182 -> llll(-1553933759, var9 ^ 749770812);
            case 183 -> llll(-1553933760, var9 ^ -1172408292);
            case 184 -> llll(-1553933753, var9 ^ 2045133412);
            case 185 -> llll(-1553933754, var9 ^ 545749946);
            case 186 -> llll(-1553933755, var9 ^ 82899272);
            case 187 -> llll(-1553933756, var9 ^ 1849885044);
            case 188 -> llll(-1553933765, var9 ^ -467392404);
            case 189 -> llll(-1553933766, var9 ^ 1321861872);
            case 190 -> llll(-1553933767, var9 ^ -1431748357);
            case 191 -> llll(-1553933768, var9 ^ 1999406513);
            case 192 -> llll(-1553933761, var9 ^ 116269133);
            case 193 -> llll(-1553933762, var9 ^ 527433309);
            case 194 -> llll(-1553933763, var9 ^ 919753931);
            case 195 -> llll(-1553933764, var9 ^ -2075215143);
            case 196 -> llll(-1553933773, var9 ^ -2011126015);
            case 197 -> llll(-1553933774, var9 ^ -335708206);
            case 198 -> llll(-1553933775, var9 ^ 1695110962);
            case 199 -> llll(-1553933776, var9 ^ 1105227825);
            case 200 -> llll(-1553933769, var9 ^ 2067049836);
            case 201 -> llll(-1553933770, var9 ^ -1920434557);
            case 202 -> llll(-1553933771, var9 ^ -563817668);
            case 203 -> llll(-1553933772, var9 ^ -1430409631);
            case 204 -> llll(-1553933781, var9 ^ -246818119);
            case 205 -> llll(-1553933782, var9 ^ -1393665321);
            case 206 -> llll(-1553933783, var9 ^ -1466226380);
            case 207 -> llll(-1553933784, var9 ^ -523158955);
            case 208 -> llll(-1553933777, var9 ^ 2039258216);
            case 209 -> llll(-1553933778, var9 ^ 1115929241);
            case 210 -> llll(-1553933779, var9 ^ 936460237);
            case 211 -> llll(-1553933780, var9 ^ -389565236);
            case 212 -> llll(-1553933789, var9 ^ 34506100);
            case 213 -> llll(-1553933790, var9 ^ 1427010886);
            case 214 -> llll(-1553933791, var9 ^ 1547404402);
            case 215 -> llll(-1553933792, var9 ^ 860911703);
            case 216 -> llll(-1553933785, var9 ^ -439250262);
            case 217 -> llll(-1553933786, var9 ^ 2017514096);
            case 218 -> llll(-1553933787, var9 ^ -1131477701);
            case 219 -> llll(-1553933788, var9 ^ -1324561155);
            case 220 -> llll(-1553933797, var9 ^ 1982466265);
            case 221 -> llll(-1553933798, var9 ^ 1647479560);
            case 222 -> llll(-1553933799, var9 ^ -84370498);
            case 223 -> llll(-1553933800, var9 ^ 1471936300);
            case 224 -> llll(-1553933793, var9 ^ -735900291);
            case 225 -> llll(-1553933794, var9 ^ -1593216463);
            case 226 -> llll(-1553933795, var9 ^ 1061419573);
            case 227 -> llll(-1553933796, var9 ^ -1267118389);
            case 228 -> llll(-1553933805, var9 ^ -188878075);
            case 229 -> llll(-1553933806, var9 ^ 1152971228);
            case 230 -> llll(-1553933807, var9 ^ 170074029);
            case 231 -> llll(-1553933808, var9 ^ -873221608);
            case 232 -> llll(-1553933801, var9 ^ 1895040576);
            case 233 -> llll(-1553933802, var9 ^ 723889229);
            case 234 -> llll(-1553933803, var9 ^ -446145016);
            case 235 -> llll(-1553933804, var9 ^ -830215189);
            case 236 -> llll(-1553933813, var9 ^ -2117435714);
            case 237 -> llll(-1553933814, var9 ^ -1293698061);
            case 238 -> llll(-1553933815, var9 ^ -1402998406);
            case 239 -> llll(-1553933816, var9 ^ -14845793);
            case 240 -> 5;
            case 241 -> llll(-1553933809, var9 ^ -1703813798);
            case 242 -> llll(-1553933810, var9 ^ -1527337232);
            case 243 -> llll(-1553933811, var9 ^ -1807441968);
            case 244 -> llll(-1553933812, var9 ^ 1109075827);
            case 245 -> llll(-1553933821, var9 ^ 1414511194);
            case 246 -> llll(-1553933822, var9 ^ -1790120937);
            case 247 -> llll(-1553933823, var9 ^ 1425790859);
            case 248 -> llll(-1553933824, var9 ^ -432789588);
            case 249 -> llll(-1553933817, var9 ^ -1166830886);
            case 250 -> llll(-1553933818, var9 ^ -460395785);
            case 251 -> llll(-1553933819, var9 ^ -1388944813);
            case 252 -> llll(-1553933820, var9 ^ 1120101520);
            case 253 -> llll(-1553933317, var9 ^ -977119559);
            case 254 -> llll(-1553933318, var9 ^ 1168956042);
            default -> llll(-1553933319, var9 ^ 783387907);
         };
         int var5 = (var1 & llll(-1553933320, var9 ^ 1695394417)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & llll(-1553933313, var9 ^ -55723912)) >>> llll(-1553933314, var9 ^ 1719333975)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & llll(-1553933315, var9 ^ 79314336);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & llll(-1553933316, var9 ^ 1001168210);
            }
         }

         IlI[var2] = new String(var3).intern();
      }

      return IlI[var2];
   }

   private static int llll(int var0, int var1) {
      int var2 = lIII[var0 ^ -1553933573] ^ var1 ^ var0;
      var2 += 56480;
      var2 -= 12514;
      var2 += 9946;
      var2 += 12962;
      var2 ^= 47358;
      var2 += 58653;
      var2 ^= 35655;
      return var2 - 34026;
   }

   private static boolean IIIl() {
      return false;
   }

   private lllIIll() {
   }

   public static int IIlI(class_332 var0, class_640 var1, class_327 var2, int var3, int var4) {
      if (var0 != null && var1 != null) {
         IlIIII var5 = Il(lIlIIIll.l(var1.method_2966()));
         if (var5 == null) {
            return 0;
         } else {
            float var6 = var5.llI();
            float var7 = var5.l();
            float var8 = var4 + (9.0F - var6) / 2.0F;
            IlIIlllIl.IlIIII(var0, var5.I(), var3, var8, var7, var6, var5.lII(), var5.IIl());
            return var5.Il();
         }
      } else {
         return 0;
      }
   }

   public static class_2561 IIll(class_2561 var0) {
      return lIl(var0) ? IlIlIIlll.l(var0) : var0;
   }

   private static class_1921 IlII(class_2960 var0) {
      int var7 = 2061701882;
      String[] var1 = IIllllIl.IIIIl();
      if (IlIl != null) {
         try {
            return (class_1921)IlIl.invoke(null, var0);
         } catch (Exception var8) {
            I(IlIIllIII.lI(IIII(llll(-1553933330, var7 ^ 1318753583), llll(-1553933331, var7 ^ -928257482))), var8);
            return null;
         }
      } else {
         String[] var2 = new String[]{
            IlIIllIII.lI(IIII(llll(-1553933332, var7 ^ 204272495), llll(-1553933341, var7 ^ 571558886))),
            IlIIllIII.lI(IIII(llll(-1553933342, var7 ^ 1191650435), llll(-1553933343, var7 ^ -1761272721))),
            IlIIllIII.lI(IIII(llll(-1553933344, var7 ^ 20104065), llll(-1553933337, var7 ^ 1739440491))),
            IlIIllIII.lI(IIII(llll(-1553933338, var7 ^ 20456226), llll(-1553933339, var7 ^ 1423602580)))
         };
         int var3 = var2.length;
         int var4 = 0;

         while (var4 < var3) {
            String var5 = var2[var4];

            try {
               Method var6 = class_1921.class.getMethod(var5, class_2960.class);
               IlIl = var6;
               return (class_1921)var6.invoke(null, var0);
            } catch (NoSuchMethodException var9) {
               var4++;
               if (var1 == null) {
                  continue;
               }
               break;
            } catch (Exception var10) {
               I(IlIIllIII.lI(IIII(llll(-1553933340, var7 ^ 1614025864), llll(-1553933349, var7 ^ 1997603823))), var10);
               return null;
            }
         }

         return null;
      }
   }

   static void IlIl() {
      II = null;
      IllI = null;
      l = null;
      Ill = null;
      llI = null;
      IlIl = null;
      IIll = null;
      Il = null;
      IIl = null;
      IIII = null;
      IIlI = null;
      lII = null;
      IlII = null;
      Illl = null;
      ll = false;
      lll = false;
   }

   public static void IllI(class_2561 var0, class_327 var1, class_4587 var2, class_4597 var3, float var4, float var5, class_6415 var6, int var7) {
      IlIIII var8 = lIl(var0) ? lIll() : null;
      if (var8 != null && var1 != null && var2 != null && var3 != null) {
         float var9 = var4 - var8.ll();
         float var10 = var5 + (9.0F - var8.IIIl()) / 2.0F;
         Illl(var8, var2, var3, var9, var10, var6 == class_6415.field_33994, var7);
      }
   }

   private static void Illl(IlIIII var0, class_4587 var1, class_4597 var2, float var3, float var4, boolean var5, int var6) {
      Matrix4f var7 = var1.method_23760().method_23761();
      class_1921 var8 = IlII(var0.I());
      if (var8 != null) {
         class_4588 var9 = var2.method_73477(var8);
         float var10 = var0.IlI();
         float var11 = var0.IIIl();
         var9.method_22918(var7, var3, var4 + var11, 0.0F).method_22913(0.0F, 1.0F).method_39415(-1).method_60803(var6);
         var9.method_22918(var7, var3 + var10, var4 + var11, 0.0F).method_22913(1.0F, 1.0F).method_39415(-1).method_60803(var6);
         var9.method_22918(var7, var3 + var10, var4, 0.0F).method_22913(1.0F, 0.0F).method_39415(-1).method_60803(var6);
         var9.method_22918(var7, var3, var4, 0.0F).method_22913(0.0F, 0.0F).method_39415(-1).method_60803(var6);
      }
   }

   private static IIlIIIIll lIII() {
      IIIIIllII var0 = IIIIIllII.III();
      if (var0 == null) {
         return null;
      } else {
         IIlIIIIll var1 = var0.II().lllll();
         return var1 != null && var1.IIIIlIl() ? var1 : null;
      }
   }

   private static UUID lIIl(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 12
      // 04: aload 0
      // 05: invokestatic k74/x/lllIIll.lll (Ljava/lang/Object;)Z
      // 08: ifne 18
      // 0b: goto 12
      // 0e: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 11: athrow
      // 12: aconst_null
      // 13: areturn
      // 14: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 17: athrow
      // 18: getstatic k74/x/lllIIll.IIll Ljava/lang/reflect/Field;
      // 1b: aload 0
      // 1c: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 1f: astore 1
      // 20: aload 1
      // 21: instanceof net/minecraft/class_1297
      // 24: ifeq 33
      // 27: aload 1
      // 28: checkcast net/minecraft/class_1297
      // 2b: astore 2
      // 2c: aload 2
      // 2d: invokevirtual net/minecraft/class_1297.method_5667 ()Ljava/util/UUID;
      // 30: goto 34
      // 33: aconst_null
      // 34: areturn
      // 35: astore 1
      // 36: ldc_w -1553933350
      // 39: ldc_w 1632608386
      // 3c: ldc_w 1836773631
      // 3f: ixor
      // 40: invokestatic k74/x/lllIIll.llll (II)I
      // 43: ldc_w -1553933351
      // 46: ldc_w 1632608386
      // 49: ldc_w -408554854
      // 4c: ixor
      // 4d: invokestatic k74/x/lllIIll.llll (II)I
      // 50: invokestatic k74/x/lllIIll.IIII (II)Ljava/lang/String;
      // 53: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 56: aload 1
      // 57: invokestatic k74/x/lllIIll.I (Ljava/lang/String;Ljava/lang/Exception;)V
      // 5a: aconst_null
      // 5b: areturn
   }

   private static boolean lIlI(Object var0, Object var1, Object var2) {
      return false;
   }

   private static IlIIII lIll() {
      IIlIIIIll var0 = lIII();
      return var0 == null ? null : var0.III();
   }

   private static String IIIII(char var0, int var1, int var2) {
      int var3 = var0 ^ 29480;
      char[] var4 = lIIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lIlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lIlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 194;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 18023;
         var10 -= 18250;
         var10 ^= 60545;
         var10 ^= 2664;
         var10 ^= 30564;
         var10 += 2840;
         var10 += 10688;
         var10 += 28;
         var10 ^= 20826;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static IlIIII llII(class_1657 var0) {
      return var0 == null ? null : Il(var0.method_5667());
   }

   public static lIIIlIII llIl(UUID param0, int param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w 1366592590
      // 003: istore 5
      // 005: aload 0
      // 006: invokestatic k74/x/lllIIll.Il (Ljava/util/UUID;)Lk74/x/IlIIII;
      // 009: astore 3
      // 00a: aload 3
      // 00b: ifnull 01b
      // 00e: invokestatic k74/x/lllIIll.IIIl ()Z
      // 011: ifne 023
      // 014: goto 01b
      // 017: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 01a: athrow
      // 01b: getstatic k74/x/lIIIlIII.I Lk74/x/lIIIlIII;
      // 01e: areturn
      // 01f: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 022: athrow
      // 023: getstatic k74/x/lllIIll.II Ljava/lang/reflect/Method;
      // 026: aconst_null
      // 027: ldc_w -1553933352
      // 02a: iload 5
      // 02c: ldc_w -602442583
      // 02f: ixor
      // 030: invokestatic k74/x/lllIIll.llll (II)I
      // 033: anewarray 4
      // 036: dup
      // 037: bipush 0
      // 038: aload 3
      // 039: invokevirtual k74/x/IlIIII.I ()Lnet/minecraft/class_2960;
      // 03c: aastore
      // 03d: dup
      // 03e: bipush 1
      // 03f: iload 1
      // 040: i2f
      // 041: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 044: aastore
      // 045: dup
      // 046: bipush 2
      // 047: iload 2
      // 048: i2f
      // 049: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 04c: aastore
      // 04d: dup
      // 04e: bipush 3
      // 04f: aload 3
      // 050: invokevirtual k74/x/IlIIII.l ()F
      // 053: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 056: aastore
      // 057: dup
      // 058: bipush 4
      // 059: aload 3
      // 05a: invokevirtual k74/x/IlIIII.llI ()F
      // 05d: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 060: aastore
      // 061: dup
      // 062: bipush 5
      // 063: bipush 0
      // 064: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 067: aastore
      // 068: dup
      // 069: ldc_w -1553933345
      // 06c: iload 5
      // 06e: ldc_w 1874856437
      // 071: ixor
      // 072: invokestatic k74/x/lllIIll.llll (II)I
      // 075: bipush 0
      // 076: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 079: aastore
      // 07a: dup
      // 07b: ldc_w -1553933346
      // 07e: iload 5
      // 080: ldc_w -1823946774
      // 083: ixor
      // 084: invokestatic k74/x/lllIIll.llll (II)I
      // 087: aload 3
      // 088: invokevirtual k74/x/IlIIII.lII ()I
      // 08b: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08e: aastore
      // 08f: dup
      // 090: ldc_w -1553933347
      // 093: iload 5
      // 095: ldc_w 1971142816
      // 098: ixor
      // 099: invokestatic k74/x/lllIIll.llll (II)I
      // 09c: aload 3
      // 09d: invokevirtual k74/x/IlIIII.IIl ()I
      // 0a0: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0a3: aastore
      // 0a4: dup
      // 0a5: ldc_w -1553933348
      // 0a8: iload 5
      // 0aa: ldc_w 618780194
      // 0ad: ixor
      // 0ae: invokestatic k74/x/lllIIll.llll (II)I
      // 0b1: aload 3
      // 0b2: invokevirtual k74/x/IlIIII.lII ()I
      // 0b5: i2f
      // 0b6: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0b9: aastore
      // 0ba: dup
      // 0bb: ldc_w -1553933357
      // 0be: iload 5
      // 0c0: ldc_w 636543379
      // 0c3: ixor
      // 0c4: invokestatic k74/x/lllIIll.llll (II)I
      // 0c7: aload 3
      // 0c8: invokevirtual k74/x/IlIIII.IIl ()I
      // 0cb: i2f
      // 0cc: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0cf: aastore
      // 0d0: dup
      // 0d1: ldc_w -1553933358
      // 0d4: iload 5
      // 0d6: ldc_w 669444835
      // 0d9: ixor
      // 0da: invokestatic k74/x/lllIIll.llll (II)I
      // 0dd: bipush -1
      // 0de: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 0e1: aastore
      // 0e2: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 0e5: pop
      // 0e6: new k74/x/lIIIlIII
      // 0e9: dup
      // 0ea: bipush 1
      // 0eb: aload 3
      // 0ec: invokevirtual k74/x/IlIIII.Il ()I
      // 0ef: invokespecial k74/x/lIIIlIII.<init> (ZI)V
      // 0f2: areturn
      // 0f3: astore 4
      // 0f5: ldc_w -1553933359
      // 0f8: iload 5
      // 0fa: ldc_w 1531351242
      // 0fd: ixor
      // 0fe: invokestatic k74/x/lllIIll.llll (II)I
      // 101: ldc_w -1553933360
      // 104: iload 5
      // 106: ldc_w -1383602497
      // 109: ixor
      // 10a: invokestatic k74/x/lllIIll.llll (II)I
      // 10d: invokestatic k74/x/lllIIll.IIII (II)Ljava/lang/String;
      // 110: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 113: aload 4
      // 115: invokestatic k74/x/lllIIll.I (Ljava/lang/String;Ljava/lang/Exception;)V
      // 118: getstatic k74/x/lIIIlIII.I Lk74/x/lIIIlIII;
      // 11b: areturn
   }

   public static boolean lllI(Object param0, Object param1, float param2, float param3, Object param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: ldc_w -1460949704
      // 003: istore 10
      // 005: aload 1
      // 006: invokestatic k74/x/lllIIll.lIIl (Ljava/lang/Object;)Ljava/util/UUID;
      // 009: invokestatic k74/x/lllIIll.Il (Ljava/util/UUID;)Lk74/x/IlIIII;
      // 00c: astore 5
      // 00e: aload 5
      // 010: ifnull 032
      // 013: aload 1
      // 014: invokestatic k74/x/lllIIll.lII (Ljava/lang/Object;)Z
      // 017: ifeq 032
      // 01a: goto 021
      // 01d: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 020: athrow
      // 021: aload 0
      // 022: aload 1
      // 023: aload 4
      // 025: invokestatic k74/x/lllIIll.lIlI (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
      // 028: ifne 038
      // 02b: goto 032
      // 02e: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 031: athrow
      // 032: bipush 0
      // 033: ireturn
      // 034: invokestatic k74/x/lllIIll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 037: athrow
      // 038: getstatic k74/x/lllIIll.l Ljava/lang/reflect/Method;
      // 03b: getstatic k74/x/lllIIll.Ill Ljava/lang/reflect/Method;
      // 03e: aload 0
      // 03f: bipush 0
      // 040: anewarray 4
      // 043: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 046: bipush 3
      // 047: anewarray 4
      // 04a: dup
      // 04b: bipush 0
      // 04c: ldc_w -1553933353
      // 04f: iload 10
      // 051: ldc_w -588985464
      // 054: ixor
      // 055: invokestatic k74/x/lllIIll.llll (II)I
      // 058: ldc_w -1553933354
      // 05b: iload 10
      // 05d: ldc_w -1951433614
      // 060: ixor
      // 061: invokestatic k74/x/lllIIll.llll (II)I
      // 064: invokestatic k74/x/lllIIll.IIII (II)Ljava/lang/String;
      // 067: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 06a: aastore
      // 06b: dup
      // 06c: bipush 1
      // 06d: aload 5
      // 06f: invokevirtual k74/x/IlIIII.I ()Lnet/minecraft/class_2960;
      // 072: aastore
      // 073: dup
      // 074: bipush 2
      // 075: aload 4
      // 077: aastore
      // 078: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 07b: astore 6
      // 07d: getstatic k74/x/lllIIll.llI Ljava/lang/reflect/Method;
      // 080: aload 0
      // 081: bipush 2
      // 082: anewarray 4
      // 085: dup
      // 086: bipush 0
      // 087: bipush -1
      // 088: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 08b: aastore
      // 08c: dup
      // 08d: bipush 1
      // 08e: aload 1
      // 08f: aastore
      // 090: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 093: checkcast java/lang/Integer
      // 096: invokevirtual java/lang/Integer.intValue ()I
      // 099: istore 7
      // 09b: getstatic k74/x/lllIIll.IIlI Ljava/lang/reflect/Field;
      // 09e: aload 1
      // 09f: invokevirtual java/lang/reflect/Field.getInt (Ljava/lang/Object;)I
      // 0a2: ineg
      // 0a3: i2f
      // 0a4: fconst_2
      // 0a5: fdiv
      // 0a6: fload 2
      // 0a7: fadd
      // 0a8: fstore 8
      // 0aa: fload 3
      // 0ab: aload 5
      // 0ad: invokevirtual k74/x/IlIIII.IIIl ()F
      // 0b0: fconst_2
      // 0b1: fdiv
      // 0b2: fsub
      // 0b3: fstore 9
      // 0b5: getstatic k74/x/lllIIll.IllI Ljava/lang/reflect/Method;
      // 0b8: aconst_null
      // 0b9: ldc_w -1553933355
      // 0bc: iload 10
      // 0be: ldc_w 2020776758
      // 0c1: ixor
      // 0c2: invokestatic k74/x/lllIIll.llll (II)I
      // 0c5: anewarray 4
      // 0c8: dup
      // 0c9: bipush 0
      // 0ca: aload 6
      // 0cc: aastore
      // 0cd: dup
      // 0ce: bipush 1
      // 0cf: fload 8
      // 0d1: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0d4: aastore
      // 0d5: dup
      // 0d6: bipush 2
      // 0d7: fload 9
      // 0d9: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0dc: aastore
      // 0dd: dup
      // 0de: bipush 3
      // 0df: ldc -0.1
      // 0e1: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0e4: aastore
      // 0e5: dup
      // 0e6: bipush 4
      // 0e7: aload 5
      // 0e9: invokevirtual k74/x/IlIIII.IlI ()F
      // 0ec: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0ef: aastore
      // 0f0: dup
      // 0f1: bipush 5
      // 0f2: aload 5
      // 0f4: invokevirtual k74/x/IlIIII.IIIl ()F
      // 0f7: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 0fa: aastore
      // 0fb: dup
      // 0fc: ldc_w -1553933356
      // 0ff: iload 10
      // 101: ldc_w 757890113
      // 104: ixor
      // 105: invokestatic k74/x/lllIIll.llll (II)I
      // 108: aload 5
      // 10a: invokevirtual k74/x/IlIIII.lII ()I
      // 10d: i2f
      // 10e: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 111: aastore
      // 112: dup
      // 113: ldc_w -1553933365
      // 116: iload 10
      // 118: ldc_w -1820696938
      // 11b: ixor
      // 11c: invokestatic k74/x/lllIIll.llll (II)I
      // 11f: aload 5
      // 121: invokevirtual k74/x/IlIIII.IIl ()I
      // 124: i2f
      // 125: invokestatic java/lang/Float.valueOf (F)Ljava/lang/Float;
      // 128: aastore
      // 129: dup
      // 12a: ldc_w -1553933366
      // 12d: iload 10
      // 12f: ldc_w -1119496795
      // 132: ixor
      // 133: invokestatic k74/x/lllIIll.llll (II)I
      // 136: iload 7
      // 138: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
      // 13b: aastore
      // 13c: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 13f: pop
      // 140: bipush 1
      // 141: ireturn
      // 142: astore 6
      // 144: ldc_w -1553933367
      // 147: iload 10
      // 149: ldc_w -913127189
      // 14c: ixor
      // 14d: invokestatic k74/x/lllIIll.llll (II)I
      // 150: ldc_w -1553933368
      // 153: iload 10
      // 155: ldc_w 466830731
      // 158: ixor
      // 159: invokestatic k74/x/lllIIll.llll (II)I
      // 15c: invokestatic k74/x/lllIIll.IIII (II)Ljava/lang/String;
      // 15f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 162: aload 6
      // 164: invokestatic k74/x/lllIIll.I (Ljava/lang/String;Ljava/lang/Exception;)V
      // 167: bipush 0
      // 168: ireturn
   }
}
