package k74.x;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.http.HttpClient.Redirect;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModMetadata;

@Environment(EnvType.CLIENT)
public final class lIlIl {
   private static final Duration I;
   private static final int[] IIll;
   static final IIIlIlIl II;
   private volatile IlIlIllIl Il;
   private static final Object[] IlIl;
   private volatile long lI;
   static final IIIlIlIl ll;
   private static final HttpClient III;
   static final boolean IIl = false;
   private static final IIIlIlIl IlI;
   private static final IIIlIlIl Ill;
   private static final String[] lII;
   private static final String[] IlII;
   private final IIllIIIll lIl = lI();
   static final IIIlIlIl l;
   private static final int llI = 16384;
   private static final long lll = 1800000L;
   private static final String[] IIII;
   static final IIIlIlIl IIIl;
   private volatile CompletableFuture<Void> IIlI;

   private static int I(ModMetadata param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 20
      // 04: aload 1
      // 05: ifnull 20
      // 08: goto 0f
      // 0b: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: aload 0
      // 10: aload 1
      // 11: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.containsCustomValue (Ljava/lang/String;)Z 2
      // 16: ifne 26
      // 19: goto 20
      // 1c: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 1f: athrow
      // 20: bipush 0
      // 21: ireturn
      // 22: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 25: athrow
      // 26: aload 0
      // 27: aload 1
      // 28: invokeinterface net/fabricmc/loader/api/metadata/ModMetadata.getCustomValue (Ljava/lang/String;)Lnet/fabricmc/loader/api/metadata/CustomValue; 2
      // 2d: astore 2
      // 2e: aload 2
      // 2f: ifnonnull 38
      // 32: bipush 0
      // 33: ireturn
      // 34: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 37: athrow
      // 38: aload 2
      // 39: invokeinterface net/fabricmc/loader/api/metadata/CustomValue.getAsNumber ()Ljava/lang/Number; 1
      // 3e: astore 3
      // 3f: aload 3
      // 40: ifnonnull 4b
      // 43: bipush 0
      // 44: goto 4f
      // 47: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 4a: athrow
      // 4b: aload 3
      // 4c: invokevirtual java/lang/Number.intValue ()I
      // 4f: ireturn
      // 50: astore 3
      // 51: aload 2
      // 52: invokeinterface net/fabricmc/loader/api/metadata/CustomValue.getAsString ()Ljava/lang/String; 1
      // 57: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 5a: ireturn
      // 5b: astore 4
      // 5d: bipush 0
      // 5e: ireturn
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1600450502;
      int var16 = 0;
      int var14 = "½\udf8f齺\ud907齫\ud94f\udf60\udfb7\udf6b\udf2f\udf6d\udee7ｷ\udd87罤\udd6f뽦\ude47뽫\ud8cfύ\ud897彪\udf7f彼\udccf뽴\ud8e7罡\ud94f뽷\udd97뽤\udd7fὧ\udc5f齸\udd2fｷ\udea7\udf76\uda0fά\ud937彵\udfc7､\udf1f㽩\ud907ὤ\uddff㽩\udcc7罼\udc17\u1f7f\ud88f罺\udfbf뽻\udcd7ｶ\ud987뽢\udbbf罳\udc6f齮\uda37\udf78\udf7f뽺\uda2fὴ\ud9af､\ud937｢\udb57彺\uddc7뽿\ude97㽽\udca7㽬\udb5f彽\uda07罤\udcaf彧\uda1f､\udcd7㽡\udaff罪\ud917㽣\udb1f㽬\ud96f㽮\ude7fὤ\udde7έ\udaffｧ\udcaf罦\ud94f뽤\ude17彦\ud8bf㽢\udaef罩\udee7\udf68\udad7ｵ\ud9f7齻\uda67彼\udaa7\udf62\ud8df뽡\uddbfὶ\ud917彻\udba7彥\uded7\u1f7f\ude8f罴\udff7ｽ\udb77㽩\ude3f\udf79\uda4f｣\udf0f㽡\udd6f彸\udc4f彾\udacf齲\udfafｪ\ud8a7뽧\ud91f뽫\ude6f뽠\ud997齼\udee7㽡\udfc7㽽\udc3f罠\udfff㽽\uda0fｶ\udd4f｢\ud97f彮\udf4f\udf67\udeb7ｨ\udd7f㽳\ude0f\u0019\u18acへḬ끱Ṅၵ\u1af4끱ᣴてᡴ\uf071Ễ끾\u1ae4偵᥄끮ᴬ큠ᰄ끴ῴみṬ"
         .length();
      String var13 = "½\udf8f齺\ud907齫\ud94f\udf60\udfb7\udf6b\udf2f\udf6d\udee7ｷ\udd87罤\udd6f뽦\ude47뽫\ud8cfύ\ud897彪\udf7f彼\udccf뽴\ud8e7罡\ud94f뽷\udd97뽤\udd7fὧ\udc5f齸\udd2fｷ\udea7\udf76\uda0fά\ud937彵\udfc7､\udf1f㽩\ud907ὤ\uddff㽩\udcc7罼\udc17\u1f7f\ud88f罺\udfbf뽻\udcd7ｶ\ud987뽢\udbbf罳\udc6f齮\uda37\udf78\udf7f뽺\uda2fὴ\ud9af､\ud937｢\udb57彺\uddc7뽿\ude97㽽\udca7㽬\udb5f彽\uda07罤\udcaf彧\uda1f､\udcd7㽡\udaff罪\ud917㽣\udb1f㽬\ud96f㽮\ude7fὤ\udde7έ\udaffｧ\udcaf罦\ud94f뽤\ude17彦\ud8bf㽢\udaef罩\udee7\udf68\udad7ｵ\ud9f7齻\uda67彼\udaa7\udf62\ud8df뽡\uddbfὶ\ud917彻\udba7彥\uded7\u1f7f\ude8f罴\udff7ｽ\udb77㽩\ude3f\udf79\uda4f｣\udf0f㽡\udd6f彸\udc4f彾\udacf齲\udfafｪ\ud8a7뽧\ud91f뽫\ude6f뽠\ud997齼\udee7㽡\udfc7㽽\udc3f罠\udfff㽽\uda0fｶ\udd4f｢\ud97f彮\udf4f\udf67\udeb7ｨ\udd7f㽳\ude0f\u0019\u18acへḬ끱Ṅၵ\u1af4끱ᣴてᡴ\uf071Ễ끾\u1ae4偵᥄끮ᴬ큠ᰄ끴ῴみṬ";
      int var17 = 0;
      short var18 = 9134;
      String[] var15 = new String[2];

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << '\r') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> '\r') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IlII = var15;
      IlIl = new Object[var15.length];
      int var9 = 1071095477;
      byte[] var7 = "ªPþÕÞ\u0011Ãr\u0089È¦z\u0003Nê[\u007f§ÞÒb+Ý4aÕÛm>_w\u0000£9V\u0093$=\u0019Õ½Y\u00ad\u009dÁ\u008coÜ\u00822\u0003m·Rhò\u0011bâQ=WõOy&m\u0006bápÂ§2\u008coC3/\u0018ý6CÎZ¦7\u0088°Æ*\u0005þmþßÈ\u0087íl\u001a\u0005î\u0018d4¹³>%È3P÷éß\u0018\t\u0004\u0085TQ²\u0099¯z3öÆýI±AzòU\u0001@ð\u0084üøK}`ý$ÍñÇ\u009f²ü\u0013\u0003Î\u0019\u0089±%«\u0006ÆRª\u008fÛÜÆ^}\u0005\u000eH7Ãÿ\u0018\u001d!_íU\\@\u00970 \u0091:ãfµ1\u009c è%\u0001Lç\u009eE\u009e¨B]\u0088\u001f\u0083Í\u001aµ¯\u0012Êv¼\u0081 \u001c\u0017/\u007fR\u000b\u0010Êy\u0084òÉ\u0086«u\n\u0006\u0013Î\u0091ßØ*\u0089\u009a)jÙ¬\u008an'Í\";Û\u001bO|sNy\u0083c\\c¶Ô\u001e¬Û\u0095E\u009eÆ\u0010ìí\u008c³é\u0085Ãë®çv(wF\u007fb*»`\u0013*%\u0083ìq^Kr\u0095n+-ë'C\u0087¨\u00074\u0083\u0013-û§\":T§¼\u0096_«Ä»\u0082A\u001c\u0001Æ&$+lI\u001b»\u0098_\f\u0082\u001e*od\u0001lY\u001fÁ×9Oi±#2áþ²9\u0005Sl ×~\u0006G¯lÂ(¬QÏ\u00145¨ót´O\u0019RÉ\u0093/îÌtIU\u007foM{¸àÏ®\u008f\"ÁtÆ'b\u0001\u0095EÅ\u0015\u0018Ð¢s \u00ad²\\üMk)C'3½àÙZ¿±\u0018Ü8áL\u0003:Ü\u001f£,\u0010³ðj0G\u0082Qëþí9\u0018\u007fµ\u009bK/¥\r\fÙ¡é\u0095\tû\u008aÃ\u00825&\u009b\u008c\u009dGå\u001bp\u000f@ØißMO8+\u000f?õõ®p.®[\u0096½\u007fxrÆ\u0007åûc  (Ú¨ ÑÐ\u0097ó\u001c{ÄZp}|r\u0005\u001bµeÔLo\u0007\u008b\u00192ÏµY:jËÛÿ\tÝ\u008eB\u0088\u0015ø¼cãQ×jÆ|®±&jÚ'`ÿÙ\u0083ÇÒ\u001aúLßà\u0016®ô[-·\u0006ýÆ¢s\u0098\u0092?ù\u0090íT\u008aG\u009f\u0099lJ!×ÉØe÷U£Ã\u0093\u000b¬{Á\u0097\u0090ÎÀ'ô\u0014Âi7\u009aÃ\u001a+Dhë¨±·z*\to>êÑ³k6²©Ð\u009fµ>\"\t|ÒBg®;·)¶å\u0016d!Ò\u0086Ò¦°=G\u009fU¸Â@!\u000e7Æò\u0095¡º©<¨\u0096\u0098\u001cÄ¶_\u009ab\u007f\t\u000f[ÆÅ0\u001a1Á²ï¶Ï0à\u009e\u001b\rn\u00ad}Êh\n=\u0001¬·¨Ï¡$#8^\u0015[ú\u0090ìRðýLÜQ*\u0082\u008c¬0;\u0087R\u0096¶\u0088}Âå¬Ð\u0001¶\u0096i\u008ej\u007f#È4=FfwAVÈéæ.\u001aX]ô\u0006r'Ù¹»Ñ\u009b\u0014T\"Vðe©sH\u001f\u0011(í\u0096êz;-\\âíÆ§ÐñåÕ<Ï.f²§h]åZ^Þuí\u0083H\u001eÃ§Z\u00064ð\u009a\u0099°ì÷%»\u0016§\u0002\u00adÜ\u0019·ë§Â\u0006Á}z·w\t\u000b}¬*ãD®²q%ôùë\u00969 \u001b\u0098§wÔ\u008f@\u0083AL\u001djPÚI0ä0n>OÓµúN\u00854pi¤ú\u001e9ñ\u000e\u000fâÕ°\u0091Lh\u000f%ôÕÈ\u000fV\u009a\u007fñ¶Â\u009a¿Í\u0017\u0095\u00862ÐXb\t\u000b\u008a\u0093ôð.ßù\u0088'yM«·|E\u0014LFO^\f*E-\u0087\u0005X»\"ãþz¤\u00ad¦\f»às\u0005\u008f»uf\u0000§\u0005´,\u0002F²Ûx\u0000Øi\u009fVóµß\u00ad\u00136÷k4Qõ\u0091·Îu\u0089\u000bà*°KK\u008fAæ\fÕæOÃÛ\\Æ>'±\t3³\u0003\u000bN\u0005\u007f¸*·\u0011\u008f2à\u009cKa^³´e\u0087\u0082óU¨\u00976\u009cç\u0087\u001aÚw\\ØÈq¯éú4\u009e?\u0005Y\u0080Ä\u0081\u008f\u009e.V©u¡\"¿6\u008f3|\u0013\n¼±ê\u0015\u0006\u009aÅ4MI\u001a\u001eíWÍPª¨ÌøËÊ¾OÐË\u0010\u008b\u0098ö¨Zéýj\u0006Ý=lT4O\u009b2Î\u0011oÉúfE®\u0002±\u009bÁ\u009djB\u0099°à]®\\p\u00155©ìA8ÞÑÄGã\u007f]>÷\u0087[}Ð\u0084æÌ>Åd½Ú \u008d\u0017\u0097\\¥\u0091d\u0087¹Üë\u0091¥\u0007\u0011\u0096,_\u0017\u000b\u001c"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IIll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IIll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[IIII(1589181098, var23 ^ 1806026947)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIIl(2098842898, var23 ^ -523697200)).length();
      int var1 = 4;
      int var25 = -1;

      label89:
      while (true) {
         int var10000 = IIII(1589181099, var23 ^ 535071308);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label84: {
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
                     break label84;
                  }

                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % IIII(1589181103, var23 ^ -1545672552)) {
                     case 0 -> IIII(1589181100, var23 ^ -1608454464);
                     case 1 -> IIII(1589181101, var23 ^ -5619980);
                     case 2 -> IIII(1589181090, var23 ^ 1657544602);
                     case 3 -> IIII(1589181091, var23 ^ -439865448);
                     case 4 -> IIII(1589181088, var23 ^ 2091685977);
                     case 5 -> IIII(1589181089, var23 ^ 7939616);
                     default -> 5;
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
                     IIII = var5;
                     lII = new String[IIII(1589181102, var23 ^ -1101862720)];
                     ll = IlIIllIII.Ill(Il(IIII(1589181094, var23 ^ 1136934058), IIII(1589181095, var23 ^ 1990682027)));
                     IIIl = IlIIllIII.Ill(Il(IIII(1589181092, var23 ^ -795550317), IIII(1589181093, var23 ^ -56549394)));
                     II = IlIIllIII.Ill(Il(IIII(1589181114, var23 ^ -1194306256), IIII(1589181115, var23 ^ -1558949444)));
                     l = IlIIllIII.Ill(Il(IIII(1589181112, var23 ^ 1724167084), IIII(1589181113, var23 ^ -2100955011)));
                     IlI = IlIIllIII.Ill(Il(IIII(1589181118, var23 ^ 1019247639), IIII(1589181119, var23 ^ -1689041628)));
                     Ill = IlIIllIII.Ill(Il(IIII(1589181116, var23 ^ 1898975795), IIII(1589181117, var23 ^ 1066990599)));
                     I = Duration.ofSeconds(2L);
                     III = HttpClient.newBuilder().connectTimeout(I).followRedirects(Redirect.NORMAL).build();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var47;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label89;
                  }

                  var4 = (var2 = IIIl(2098842899, var23 ^ -1741206721)).length();
                  var1 = IIII(1589181096, var23 ^ 1211995130);
                  var25 = -1;
            }

            var10000 = IIII(1589181097, var23 ^ -1027875807);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private static RuntimeException l(RuntimeException var0) {
      return var0;
   }

   private static String II(String param0) {
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
      // 05: invokevirtual java/lang/String.isBlank ()Z
      // 08: ifeq 37
      // 0b: goto 12
      // 0e: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: ldc_w 1589181106
      // 15: ldc_w 1872749915
      // 18: ldc_w -965402574
      // 1b: ixor
      // 1c: invokestatic k74/x/lIlIl.IIII (II)I
      // 1f: ldc_w 1589181107
      // 22: ldc_w 1872749915
      // 25: ldc_w 351794906
      // 28: ixor
      // 29: invokestatic k74/x/lIlIl.IIII (II)I
      // 2c: invokestatic k74/x/lIlIl.Il (II)Ljava/lang/String;
      // 2f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 32: areturn
      // 33: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 36: athrow
      // 37: aload 0
      // 38: ldc_w 1589181104
      // 3b: ldc_w 1872749915
      // 3e: ldc_w 1791326469
      // 41: ixor
      // 42: invokestatic k74/x/lIlIl.IIII (II)I
      // 45: invokevirtual java/lang/String.indexOf (I)I
      // 48: istore 1
      // 49: iload 1
      // 4a: iflt 5a
      // 4d: aload 0
      // 4e: bipush 0
      // 4f: iload 1
      // 50: invokevirtual java/lang/String.substring (II)Ljava/lang/String;
      // 53: goto 5b
      // 56: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 59: athrow
      // 5a: aload 0
      // 5b: areturn
   }

   private static String Il(int var0, int var1) {
      int var9 = -236741119;
      int var2 = (var0 ^ IIII(1589181105, var9 ^ -1364492752)) & IIII(1589181110, var9 ^ -1065791015);
      if (lII[var2] == null) {
         char[] var3 = IIII[var2].toCharArray();

         int var4 = switch (var3[0] & IIII(1589181111, var9 ^ -2004565118)) {
            case 0 -> IIII(1589181108, var9 ^ -992185337);
            case 1 -> IIII(1589181109, var9 ^ 1073187828);
            case 2 -> IIII(1589181066, var9 ^ 1450242800);
            case 3 -> IIII(1589181067, var9 ^ -772327994);
            case 4 -> IIII(1589181064, var9 ^ -1848822005);
            case 5 -> IIII(1589181065, var9 ^ 1819669317);
            case 6 -> IIII(1589181070, var9 ^ -261054714);
            case 7 -> IIII(1589181071, var9 ^ 1632248834);
            case 8 -> IIII(1589181068, var9 ^ 1822341238);
            case 9 -> IIII(1589181069, var9 ^ -1996196148);
            case 10 -> IIII(1589181058, var9 ^ 998965581);
            case 11 -> IIII(1589181059, var9 ^ 973217015);
            case 12 -> IIII(1589181056, var9 ^ 1456719573);
            case 13 -> IIII(1589181057, var9 ^ -1631220712);
            case 14 -> IIII(1589181062, var9 ^ 1872091856);
            case 15 -> IIII(1589181063, var9 ^ -815731062);
            case 16 -> IIII(1589181060, var9 ^ -803566752);
            case 17 -> IIII(1589181061, var9 ^ 28779976);
            case 18 -> IIII(1589181082, var9 ^ 633087025);
            case 19 -> IIII(1589181083, var9 ^ 2024323611);
            case 20 -> IIII(1589181080, var9 ^ 1997798963);
            case 21 -> IIII(1589181081, var9 ^ 953129644);
            case 22 -> IIII(1589181086, var9 ^ -1894877630);
            case 23 -> IIII(1589181087, var9 ^ 623028588);
            case 24 -> IIII(1589181084, var9 ^ -432978262);
            case 25 -> IIII(1589181085, var9 ^ -1936026562);
            case 26 -> IIII(1589181074, var9 ^ -1031361736);
            case 27 -> IIII(1589181075, var9 ^ -385267302);
            case 28 -> IIII(1589181072, var9 ^ 371642080);
            case 29 -> IIII(1589181073, var9 ^ -1768027745);
            case 30 -> IIII(1589181078, var9 ^ 1331008201);
            case 31 -> IIII(1589181079, var9 ^ 178574014);
            case 32 -> IIII(1589181076, var9 ^ 1007135000);
            case 33 -> IIII(1589181077, var9 ^ 1571782787);
            case 34 -> IIII(1589181162, var9 ^ -1950169158);
            case 35 -> IIII(1589181163, var9 ^ -554419358);
            case 36 -> IIII(1589181160, var9 ^ -856813891);
            case 37 -> IIII(1589181161, var9 ^ -1910415272);
            case 38 -> IIII(1589181166, var9 ^ -720142604);
            case 39 -> IIII(1589181167, var9 ^ 2086685504);
            case 40 -> IIII(1589181164, var9 ^ 2030568478);
            case 41 -> IIII(1589181165, var9 ^ 1047179554);
            case 42 -> IIII(1589181154, var9 ^ -406076229);
            case 43 -> IIII(1589181155, var9 ^ -1170810853);
            case 44 -> IIII(1589181152, var9 ^ -1163380542);
            case 45 -> IIII(1589181153, var9 ^ -506204073);
            case 46 -> IIII(1589181158, var9 ^ 98823559);
            case 47 -> IIII(1589181159, var9 ^ 2074772682);
            case 48 -> IIII(1589181156, var9 ^ 948604680);
            case 49 -> IIII(1589181157, var9 ^ -2086650638);
            case 50 -> IIII(1589181178, var9 ^ -1296568543);
            case 51 -> IIII(1589181179, var9 ^ 740025442);
            case 52 -> IIII(1589181176, var9 ^ 1412839917);
            case 53 -> 1;
            case 54 -> IIII(1589181177, var9 ^ -1936949992);
            case 55 -> IIII(1589181182, var9 ^ -1264134181);
            case 56 -> IIII(1589181183, var9 ^ -1959371027);
            case 57 -> IIII(1589181180, var9 ^ -1676682881);
            case 58 -> IIII(1589181181, var9 ^ -1456523);
            case 59 -> IIII(1589181170, var9 ^ -913147379);
            case 60 -> IIII(1589181171, var9 ^ -1446849949);
            case 61 -> IIII(1589181168, var9 ^ -1279305116);
            case 62 -> IIII(1589181169, var9 ^ 582271490);
            case 63 -> IIII(1589181174, var9 ^ -64132032);
            case 64 -> IIII(1589181175, var9 ^ -1765141436);
            case 65 -> IIII(1589181172, var9 ^ 1386550347);
            case 66 -> IIII(1589181173, var9 ^ 1603924546);
            case 67 -> IIII(1589181130, var9 ^ 1677265953);
            case 68 -> IIII(1589181131, var9 ^ -1981845064);
            case 69 -> IIII(1589181128, var9 ^ -1084000274);
            case 70 -> IIII(1589181129, var9 ^ -640104490);
            case 71 -> IIII(1589181134, var9 ^ -571080567);
            case 72 -> IIII(1589181135, var9 ^ 1596143456);
            case 73 -> IIII(1589181132, var9 ^ 1375273335);
            case 74 -> IIII(1589181133, var9 ^ -225684940);
            case 75 -> IIII(1589181122, var9 ^ 1436082037);
            case 76 -> IIII(1589181123, var9 ^ 855533552);
            case 77 -> IIII(1589181120, var9 ^ 584137522);
            case 78 -> IIII(1589181121, var9 ^ -73103956);
            case 79 -> IIII(1589181126, var9 ^ -1557112603);
            case 80 -> IIII(1589181127, var9 ^ -902662462);
            case 81 -> IIII(1589181124, var9 ^ 1286953261);
            case 82 -> IIII(1589181125, var9 ^ -1816716553);
            case 83 -> IIII(1589181146, var9 ^ 866244563);
            case 84 -> IIII(1589181147, var9 ^ 1625787356);
            case 85 -> IIII(1589181144, var9 ^ 316428389);
            case 86 -> IIII(1589181145, var9 ^ 2108990389);
            case 87 -> IIII(1589181150, var9 ^ 622261240);
            case 88 -> IIII(1589181151, var9 ^ 897627279);
            case 89 -> IIII(1589181148, var9 ^ 828649200);
            case 90 -> IIII(1589181149, var9 ^ 1795651734);
            case 91 -> IIII(1589181138, var9 ^ -1515496245);
            case 92 -> IIII(1589181139, var9 ^ 231366389);
            case 93 -> 3;
            case 94 -> 2;
            case 95 -> IIII(1589181136, var9 ^ -528316420);
            case 96 -> IIII(1589181137, var9 ^ -112031000);
            case 97 -> IIII(1589181142, var9 ^ -1465469914);
            case 98 -> IIII(1589181143, var9 ^ 1702390077);
            case 99 -> IIII(1589181140, var9 ^ -1104945131);
            case 100 -> IIII(1589181141, var9 ^ 770883540);
            case 101 -> IIII(1589180970, var9 ^ 1451908572);
            case 102 -> IIII(1589180971, var9 ^ -215148361);
            case 103 -> IIII(1589180968, var9 ^ 1243965425);
            case 104 -> IIII(1589180969, var9 ^ 1075459280);
            case 105 -> IIII(1589180974, var9 ^ -347479797);
            case 106 -> IIII(1589180975, var9 ^ -302926552);
            case 107 -> IIII(1589180972, var9 ^ -1959207564);
            case 108 -> IIII(1589180973, var9 ^ -589119728);
            case 109 -> IIII(1589180962, var9 ^ -1983940737);
            case 110 -> IIII(1589180963, var9 ^ -910709384);
            case 111 -> IIII(1589180960, var9 ^ 1265815180);
            case 112 -> IIII(1589180961, var9 ^ 516894778);
            case 113 -> IIII(1589180966, var9 ^ 1748097195);
            case 114 -> IIII(1589180967, var9 ^ -1051012647);
            case 115 -> IIII(1589180964, var9 ^ -333248031);
            case 116 -> IIII(1589180965, var9 ^ -94921572);
            case 117 -> IIII(1589180986, var9 ^ 1867791108);
            case 118 -> IIII(1589180987, var9 ^ 1117209243);
            case 119 -> IIII(1589180984, var9 ^ 1332588029);
            case 120 -> IIII(1589180985, var9 ^ 1691784448);
            case 121 -> IIII(1589180990, var9 ^ -1771012505);
            case 122 -> IIII(1589180991, var9 ^ -485152389);
            case 123 -> IIII(1589180988, var9 ^ 1763530282);
            case 124 -> IIII(1589180989, var9 ^ 449455351);
            case 125 -> IIII(1589180978, var9 ^ -54028003);
            case 126 -> IIII(1589180979, var9 ^ 1498799825);
            case 127 -> IIII(1589180976, var9 ^ -986839902);
            case 128 -> IIII(1589180977, var9 ^ -1692286923);
            case 129 -> IIII(1589180982, var9 ^ 119343602);
            case 130 -> IIII(1589180983, var9 ^ -1216761934);
            case 131 -> IIII(1589180980, var9 ^ -105242196);
            case 132 -> IIII(1589180981, var9 ^ -1968767824);
            case 133 -> IIII(1589180938, var9 ^ 2066052655);
            case 134 -> IIII(1589180939, var9 ^ -358101268);
            case 135 -> IIII(1589180936, var9 ^ -1368954555);
            case 136 -> IIII(1589180937, var9 ^ -71628291);
            case 137 -> IIII(1589180942, var9 ^ 1074951033);
            case 138 -> IIII(1589180943, var9 ^ -1299924334);
            case 139 -> IIII(1589180940, var9 ^ -756410890);
            case 140 -> IIII(1589180941, var9 ^ 665062832);
            case 141 -> IIII(1589180930, var9 ^ -2031511291);
            case 142 -> IIII(1589180931, var9 ^ 375332227);
            case 143 -> IIII(1589180928, var9 ^ -1379260457);
            case 144 -> IIII(1589180929, var9 ^ 676330317);
            case 145 -> 0;
            case 146 -> IIII(1589180934, var9 ^ -1631945277);
            case 147 -> IIII(1589180935, var9 ^ 86770191);
            case 148 -> IIII(1589180932, var9 ^ -1406840622);
            case 149 -> IIII(1589180933, var9 ^ -1941369205);
            case 150 -> IIII(1589180954, var9 ^ 183485546);
            case 151 -> IIII(1589180955, var9 ^ -1613365042);
            case 152 -> IIII(1589180952, var9 ^ -1600681719);
            case 153 -> IIII(1589180953, var9 ^ 576876904);
            case 154 -> IIII(1589180958, var9 ^ -1603459335);
            case 155 -> IIII(1589180959, var9 ^ -1646040431);
            case 156 -> IIII(1589180956, var9 ^ 1525009846);
            case 157 -> IIII(1589180957, var9 ^ -1860105011);
            case 158 -> IIII(1589180946, var9 ^ 1596776989);
            case 159 -> IIII(1589180947, var9 ^ -1462522463);
            case 160 -> IIII(1589180944, var9 ^ 1780307191);
            case 161 -> IIII(1589180945, var9 ^ 1618016015);
            case 162 -> IIII(1589180950, var9 ^ -1046005338);
            case 163 -> IIII(1589180951, var9 ^ 1019052826);
            case 164 -> IIII(1589180948, var9 ^ -1038414524);
            case 165 -> IIII(1589180949, var9 ^ -313580837);
            case 166 -> IIII(1589181034, var9 ^ 1082920231);
            case 167 -> IIII(1589181035, var9 ^ -117189949);
            case 168 -> IIII(1589181032, var9 ^ -1287261278);
            case 169 -> IIII(1589181033, var9 ^ -689196835);
            case 170 -> IIII(1589181038, var9 ^ -968535351);
            case 171 -> IIII(1589181039, var9 ^ -1097359567);
            case 172 -> IIII(1589181036, var9 ^ 1686882680);
            case 173 -> IIII(1589181037, var9 ^ 1228144853);
            case 174 -> IIII(1589181026, var9 ^ 194637694);
            case 175 -> IIII(1589181027, var9 ^ -964844943);
            case 176 -> IIII(1589181024, var9 ^ -473585762);
            case 177 -> IIII(1589181025, var9 ^ -1201656088);
            case 178 -> IIII(1589181030, var9 ^ -357111135);
            case 179 -> IIII(1589181031, var9 ^ 1918894528);
            case 180 -> 4;
            case 181 -> IIII(1589181028, var9 ^ 1081877163);
            case 182 -> IIII(1589181029, var9 ^ -1404900875);
            case 183 -> IIII(1589181050, var9 ^ 573231877);
            case 184 -> IIII(1589181051, var9 ^ 1977083387);
            case 185 -> IIII(1589181048, var9 ^ -446678962);
            case 186 -> IIII(1589181049, var9 ^ -1907466174);
            case 187 -> IIII(1589181054, var9 ^ -1766246582);
            case 188 -> IIII(1589181055, var9 ^ 155003691);
            case 189 -> IIII(1589181052, var9 ^ -1254707608);
            case 190 -> IIII(1589181053, var9 ^ -1843370228);
            case 191 -> IIII(1589181042, var9 ^ 661020680);
            case 192 -> IIII(1589181043, var9 ^ -1773356436);
            case 193 -> IIII(1589181040, var9 ^ 670748286);
            case 194 -> IIII(1589181041, var9 ^ -316567215);
            case 195 -> IIII(1589181046, var9 ^ -735901386);
            case 196 -> IIII(1589181047, var9 ^ -1250345444);
            case 197 -> IIII(1589181044, var9 ^ 112486257);
            case 198 -> IIII(1589181045, var9 ^ 137015352);
            case 199 -> IIII(1589181002, var9 ^ 533546233);
            case 200 -> IIII(1589181003, var9 ^ -594498168);
            case 201 -> IIII(1589181000, var9 ^ 1254422365);
            case 202 -> IIII(1589181001, var9 ^ -1595701800);
            case 203 -> IIII(1589181006, var9 ^ 1127759221);
            case 204 -> IIII(1589181007, var9 ^ 364497900);
            case 205 -> IIII(1589181004, var9 ^ 880269678);
            case 206 -> IIII(1589181005, var9 ^ 1636026412);
            case 207 -> IIII(1589180994, var9 ^ 1161647775);
            case 208 -> IIII(1589180995, var9 ^ -125657796);
            case 209 -> IIII(1589180992, var9 ^ 1162201104);
            case 210 -> IIII(1589180993, var9 ^ 183645786);
            case 211 -> IIII(1589180998, var9 ^ 1377240889);
            case 212 -> IIII(1589180999, var9 ^ -2028454150);
            case 213 -> IIII(1589180996, var9 ^ 1087757039);
            case 214 -> IIII(1589180997, var9 ^ -1694029593);
            case 215 -> IIII(1589181018, var9 ^ 1621320939);
            case 216 -> IIII(1589181019, var9 ^ 413844000);
            case 217 -> IIII(1589181016, var9 ^ 993704500);
            case 218 -> IIII(1589181017, var9 ^ -2067661514);
            case 219 -> IIII(1589181022, var9 ^ -830369124);
            case 220 -> IIII(1589181023, var9 ^ -1123369350);
            case 221 -> IIII(1589181020, var9 ^ 732898362);
            case 222 -> IIII(1589181021, var9 ^ -366384556);
            case 223 -> IIII(1589181010, var9 ^ -1674159883);
            case 224 -> IIII(1589181011, var9 ^ -1795030110);
            case 225 -> IIII(1589181008, var9 ^ -158506629);
            case 226 -> IIII(1589181009, var9 ^ 614578885);
            case 227 -> IIII(1589181014, var9 ^ 576110761);
            case 228 -> IIII(1589181015, var9 ^ 1222911064);
            case 229 -> IIII(1589181012, var9 ^ 1664640166);
            case 230 -> IIII(1589181013, var9 ^ -2084877308);
            case 231 -> IIII(1589181354, var9 ^ -1529072803);
            case 232 -> IIII(1589181355, var9 ^ 658755454);
            case 233 -> IIII(1589181352, var9 ^ -1687317740);
            case 234 -> IIII(1589181353, var9 ^ -607762162);
            case 235 -> IIII(1589181358, var9 ^ 1988194194);
            case 236 -> IIII(1589181359, var9 ^ -548528801);
            case 237 -> IIII(1589181356, var9 ^ 1454629375);
            case 238 -> IIII(1589181357, var9 ^ -1715598723);
            case 239 -> IIII(1589181346, var9 ^ -1681670958);
            case 240 -> IIII(1589181347, var9 ^ 682036724);
            case 241 -> IIII(1589181344, var9 ^ 532634010);
            case 242 -> IIII(1589181345, var9 ^ -605231921);
            case 243 -> IIII(1589181350, var9 ^ 619200925);
            case 244 -> 5;
            case 245 -> IIII(1589181351, var9 ^ 1675104694);
            case 246 -> IIII(1589181348, var9 ^ -1508811516);
            case 247 -> IIII(1589181349, var9 ^ -1973956996);
            case 248 -> IIII(1589181370, var9 ^ 1212528481);
            case 249 -> IIII(1589181371, var9 ^ 2037903959);
            case 250 -> IIII(1589181368, var9 ^ -1350000724);
            case 251 -> IIII(1589181369, var9 ^ 1410091016);
            case 252 -> IIII(1589181374, var9 ^ -1092938771);
            case 253 -> IIII(1589181375, var9 ^ 833554036);
            case 254 -> IIII(1589181372, var9 ^ 532596432);
            default -> IIII(1589181373, var9 ^ -1708034122);
         };
         int var5 = (var1 & IIII(1589181362, var9 ^ -2054464313)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIII(1589181363, var9 ^ -1530662887)) >>> IIII(1589181360, var9 ^ -1906250430)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIII(1589181361, var9 ^ -1071157555);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIII(1589181366, var9 ^ 1749421240);
            }
         }

         lII[var2] = new String(var3).intern();
      }

      return lII[var2];
   }

   private static IIllIIIll lI() {
      try {
         Optional var0 = FabricLoader.getInstance().getModContainer(II.llIl());
         if (var0.isPresent()) {
            ModMetadata var1 = ((ModContainer)var0.get()).getMetadata();
            return new IIllIIIll(II(var1.getVersion().getFriendlyString()), I(var1, IlI.llIl()), I(var1, Ill.llIl()));
         }
      } catch (RuntimeException var2) {
      }

      return new IIllIIIll(IlIIllIII.lI(Il(IIII(1589181367, 80507774 ^ 712085811), IIII(1589181364, 80507774 ^ -298125289))), 0, 0);
   }

   private static String IIIl(int var0, int var1) {
      int var3 = var0 ^ 2098842898;
      char[] var4 = IlII[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IlIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IlIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1136768191;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 54;
            case 1 -> 65;
            case 2 -> 248;
            case 3 -> 68;
            case 4 -> 74;
            case 5 -> 203;
            case 6 -> 70;
            case 7 -> 131;
            case 8 -> 156;
            case 9 -> 110;
            case 10 -> 124;
            case 11 -> 255;
            case 12 -> 69;
            case 13 -> 162;
            case 14 -> 229;
            case 15 -> 57;
            case 16 -> 34;
            case 17 -> 34;
            case 18 -> 138;
            case 19 -> 58;
            case 20 -> 104;
            case 21 -> 247;
            case 22 -> 240;
            case 23 -> 74;
            case 24 -> 50;
            case 25 -> 64;
            case 26 -> 234;
            case 27 -> 75;
            case 28 -> 199;
            case 29 -> 44;
            case 30 -> 89;
            case 31 -> 118;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   static IIlllll ll(String var0) {
      int var2 = -963461817;
      JsonObject var1 = JsonParser.parseString(var0).getAsJsonObject();
      return new IIlllll(
         lIl(var1, IlIIllIII.lI(Il(IIII(1589181365, var2 ^ -48861503), IIII(1589181322, var2 ^ -1591586450)))),
         llI(var1, IlIIllIII.lI(Il(IIII(1589181323, var2 ^ -204743672), IIII(1589181320, var2 ^ -1791930183))), -1),
         llI(var1, IlIIllIII.lI(Il(IIII(1589181321, var2 ^ 1845883454), IIII(1589181326, var2 ^ 167563617))), 0),
         lIl(var1, IlIIllIII.lI(Il(IIII(1589181327, var2 ^ 1717762514), IIII(1589181324, var2 ^ 1045287834)))),
         lIl(var1, IlIIllIII.lI(Il(IIII(1589181325, var2 ^ 161735553), IIII(1589181314, var2 ^ -1839826196)))),
         lIl(var1, IlIIllIII.lI(Il(IIII(1589181315, var2 ^ -1625209422), IIII(1589181312, var2 ^ -534804485))))
      );
   }

   IlIlIllIl III() {
      return this.Il;
   }

   static String IIl(String param0, int param1) {
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
      // 05: invokevirtual java/lang/String.isBlank ()Z
      // 08: ifeq 39
      // 0b: goto 12
      // 0e: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 11: athrow
      // 12: ldc_w 1589181313
      // 15: ldc_w 1474603642
      // 18: ldc_w 142476311
      // 1b: ixor
      // 1c: invokestatic k74/x/lIlIl.IIII (II)I
      // 1f: ldc_w 1589181318
      // 22: ldc_w 1474603642
      // 25: ldc_w 1264177712
      // 28: ixor
      // 29: invokestatic k74/x/lIlIl.IIII (II)I
      // 2c: invokestatic k74/x/lIlIl.Il (II)Ljava/lang/String;
      // 2f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 32: goto 3d
      // 35: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 38: athrow
      // 39: aload 0
      // 3a: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 3d: astore 2
      // 3e: iload 1
      // 3f: ifle 88
      // 42: aload 2
      // 43: ldc_w 1589181319
      // 46: ldc_w 1474603642
      // 49: ldc_w -88652246
      // 4c: ixor
      // 4d: invokestatic k74/x/lIlIl.IIII (II)I
      // 50: ldc_w 1589181316
      // 53: ldc_w 1474603642
      // 56: ldc_w -1957653277
      // 59: ixor
      // 5a: invokestatic k74/x/lIlIl.IIII (II)I
      // 5d: invokestatic k74/x/lIlIl.Il (II)Ljava/lang/String;
      // 60: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 63: iload 1
      // 64: istore 5
      // 66: astore 4
      // 68: astore 3
      // 69: new java/lang/StringBuilder
      // 6c: dup
      // 6d: invokespecial java/lang/StringBuilder.<init> ()V
      // 70: aload 3
      // 71: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 74: aload 4
      // 76: invokevirtual java/lang/StringBuilder.append (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      // 79: iload 5
      // 7b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 7e: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 81: goto 89
      // 84: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 87: athrow
      // 88: aload 2
      // 89: areturn
   }

   public lIlIl() {
      this.Il = IlIlIllIl.lI(this.lIl);
   }

   void IlI() {
      this.IIlI = null;
      this.Il = IlIlIllIl.lI(this.lIl);
   }

   static boolean Ill(IIllIIIll param0, IIlllll param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnull 0f
      // 04: aload 1
      // 05: ifnonnull 15
      // 08: goto 0f
      // 0b: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: bipush 0
      // 10: ireturn
      // 11: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 14: athrow
      // 15: aload 1
      // 16: invokevirtual k74/x/IIlllll.I ()Ljava/lang/String;
      // 19: astore 2
      // 1a: aload 2
      // 1b: ifnull 46
      // 1e: aload 2
      // 1f: invokevirtual java/lang/String.isBlank ()Z
      // 22: ifne 46
      // 25: goto 2c
      // 28: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: getstatic k74/x/lIlIl.l Lk74/x/IIIlIlIl;
      // 2f: aload 2
      // 30: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 33: invokevirtual k74/x/IIIlIlIl.IlI (Ljava/lang/CharSequence;)Z
      // 36: ifne 46
      // 39: goto 40
      // 3c: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 3f: athrow
      // 40: bipush 0
      // 41: ireturn
      // 42: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 45: athrow
      // 46: aload 1
      // 47: invokevirtual k74/x/IIlllll.II ()I
      // 4a: aload 0
      // 4b: invokevirtual k74/x/IIllIIIll.I ()I
      // 4e: if_icmple 57
      // 51: bipush 1
      // 52: ireturn
      // 53: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 56: athrow
      // 57: aload 1
      // 58: invokevirtual k74/x/IIlllll.II ()I
      // 5b: aload 0
      // 5c: invokevirtual k74/x/IIllIIIll.I ()I
      // 5f: if_icmpne 7c
      // 62: aload 1
      // 63: invokevirtual k74/x/IIlllll.lI ()I
      // 66: aload 0
      // 67: invokevirtual k74/x/IIllIIIll.II ()I
      // 6a: if_icmple 7c
      // 6d: goto 74
      // 70: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 73: athrow
      // 74: bipush 1
      // 75: goto 7d
      // 78: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 7b: athrow
      // 7c: bipush 0
      // 7d: ireturn
   }

   String lII() {
      String var10000 = IlIIllIII.Ill(Il(IIII(1589181317, 252931629 ^ 2045320121), IIII(1589181338, 252931629 ^ -15085415))).llIl();
      String var2 = ll.llIl();
      String var1 = var10000;
      return var1 + var2;
   }

   private static String lIl(JsonObject param0, String param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnonnull 0c
      // 04: aconst_null
      // 05: goto 11
      // 08: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b: athrow
      // 0c: aload 0
      // 0d: aload 1
      // 0e: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 11: astore 2
      // 12: aload 2
      // 13: ifnull 24
      // 16: aload 2
      // 17: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 1a: ifeq 2e
      // 1d: goto 24
      // 20: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: ldc_w ""
      // 27: goto 35
      // 2a: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2d: athrow
      // 2e: aload 2
      // 2f: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 32: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 35: areturn
   }

   private static int llI(JsonObject param0, String param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnonnull 0c
      // 04: aconst_null
      // 05: goto 11
      // 08: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0b: athrow
      // 0c: aload 0
      // 0d: aload 1
      // 0e: invokevirtual com/google/gson/JsonObject.get (Ljava/lang/String;)Lcom/google/gson/JsonElement;
      // 11: astore 3
      // 12: aload 3
      // 13: ifnull 24
      // 16: aload 3
      // 17: invokevirtual com/google/gson/JsonElement.isJsonNull ()Z
      // 1a: ifeq 2a
      // 1d: goto 24
      // 20: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 23: athrow
      // 24: iload 2
      // 25: ireturn
      // 26: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 29: athrow
      // 2a: aload 3
      // 2b: invokevirtual com/google/gson/JsonElement.getAsInt ()I
      // 2e: ireturn
      // 2f: astore 4
      // 31: aload 3
      // 32: invokevirtual com/google/gson/JsonElement.getAsString ()Ljava/lang/String;
      // 35: invokevirtual java/lang/String.trim ()Ljava/lang/String;
      // 38: invokestatic java/lang/Integer.parseInt (Ljava/lang/String;)I
      // 3b: ireturn
      // 3c: astore 5
      // 3e: iload 2
      // 3f: ireturn
   }

   private static int IIII(int var0, int var1) {
      int var2 = IIll[var0 ^ 1589181098] ^ var1 ^ var0;
      var2 -= 49896;
      var2 ^= 51275;
      var2 -= 12455;
      var2 ^= 1482;
      var2 -= 4436;
      var2 -= 26354;
      var2 -= 17094;
      var2 += 40533;
      var2 ^= 60516;
      return var2 - 35496;
   }

   private Void lll(HttpResponse param1, Throwable param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnonnull 49
      // 04: aload 1
      // 05: ifnull 49
      // 08: goto 0f
      // 0b: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 0e: athrow
      // 0f: aload 1
      // 10: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 15: ldc_w 1589181339
      // 18: ldc_w -1487416186
      // 1b: ldc_w 449995206
      // 1e: ixor
      // 1f: invokestatic k74/x/lIlIl.IIII (II)I
      // 22: if_icmplt 49
      // 25: goto 2c
      // 28: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 2b: athrow
      // 2c: aload 1
      // 2d: invokeinterface java/net/http/HttpResponse.statusCode ()I 1
      // 32: ldc_w 1589181336
      // 35: ldc_w -1487416186
      // 38: ldc_w -1054336384
      // 3b: ixor
      // 3c: invokestatic k74/x/lIlIl.IIII (II)I
      // 3f: if_icmplt 5a
      // 42: goto 49
      // 45: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 48: athrow
      // 49: aload 0
      // 4a: aload 0
      // 4b: getfield k74/x/lIlIl.lIl Lk74/x/IIllIIIll;
      // 4e: invokestatic k74/x/IlIlIllIl.I (Lk74/x/IIllIIIll;)Lk74/x/IlIlIllIl;
      // 51: putfield k74/x/lIlIl.Il Lk74/x/IlIlIllIl;
      // 54: aconst_null
      // 55: areturn
      // 56: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 59: athrow
      // 5a: aload 1
      // 5b: invokeinterface java/net/http/HttpResponse.body ()Ljava/lang/Object; 1
      // 60: checkcast java/lang/String
      // 63: astore 3
      // 64: aload 3
      // 65: ifnull 91
      // 68: aload 3
      // 69: invokevirtual java/lang/String.isBlank ()Z
      // 6c: ifne 91
      // 6f: goto 76
      // 72: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 75: athrow
      // 76: aload 3
      // 77: invokevirtual java/lang/String.length ()I
      // 7a: ldc_w 1589181337
      // 7d: ldc_w -1487416186
      // 80: ldc_w -1725023467
      // 83: ixor
      // 84: invokestatic k74/x/lIlIl.IIII (II)I
      // 87: if_icmple a2
      // 8a: goto 91
      // 8d: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // 90: athrow
      // 91: aload 0
      // 92: aload 0
      // 93: getfield k74/x/lIlIl.lIl Lk74/x/IIllIIIll;
      // 96: invokestatic k74/x/IlIlIllIl.I (Lk74/x/IIllIIIll;)Lk74/x/IlIlIllIl;
      // 99: putfield k74/x/lIlIl.Il Lk74/x/IlIlIllIl;
      // 9c: aconst_null
      // 9d: areturn
      // 9e: invokestatic k74/x/lIlIl.l (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
      // a1: athrow
      // a2: aload 3
      // a3: invokestatic k74/x/lIlIl.ll (Ljava/lang/String;)Lk74/x/IIlllll;
      // a6: astore 4
      // a8: aload 0
      // a9: aload 0
      // aa: getfield k74/x/lIlIl.lIl Lk74/x/IIllIIIll;
      // ad: aload 4
      // af: aload 0
      // b0: getfield k74/x/lIlIl.lIl Lk74/x/IIllIIIll;
      // b3: aload 4
      // b5: invokestatic k74/x/lIlIl.Ill (Lk74/x/IIllIIIll;Lk74/x/IIlllll;)Z
      // b8: invokestatic k74/x/IlIlIllIl.ll (Lk74/x/IIllIIIll;Lk74/x/IIlllll;Z)Lk74/x/IlIlIllIl;
      // bb: putfield k74/x/lIlIl.Il Lk74/x/IlIlIllIl;
      // be: goto ce
      // c1: astore 4
      // c3: aload 0
      // c4: aload 0
      // c5: getfield k74/x/lIlIl.lIl Lk74/x/IIllIIIll;
      // c8: invokestatic k74/x/IlIlIllIl.I (Lk74/x/IIllIIIll;)Lk74/x/IlIlIllIl;
      // cb: putfield k74/x/lIlIl.Il Lk74/x/IlIlIllIl;
      // ce: aconst_null
      // cf: areturn
   }
}
