package k74.x;

import com.mojang.authlib.GameProfile;
import java.lang.reflect.Field;
import java.util.List;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_5250;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_642;
import net.minecraft.class_7417;
import net.minecraft.class_8828;

@Environment(EnvType.CLIENT)
public final class IlIlIIlll {
   private static final String[] III;
   private static final String[] I;
   private static final Object[] IIl;
   private static final int[] ll;
   private static boolean l;
   private static Field II;
   private static final List<IIIlIlIl> Il;
   private static final String[] lI;

   private static int lIll(int var0, int var1) {
      int var2 = ll[var0 ^ 984162688] ^ var1 ^ var0;
      var2 ^= 34846;
      var2 += 49805;
      var2 ^= 30045;
      var2 ^= 1790;
      var2 += 53215;
      var2 ^= 30385;
      var2 += 36009;
      return var2 - 19029;
   }

   private static UUID I(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: ifnonnull 0a
      // 04: aconst_null
      // 05: areturn
      // 06: invokestatic k74/x/IlIlIIlll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 09: athrow
      // 0a: getstatic k74/x/IlIlIIlll.II Ljava/lang/reflect/Field;
      // 0d: ifnull 24
      // 10: getstatic k74/x/IlIlIIlll.II Ljava/lang/reflect/Field;
      // 13: invokevirtual java/lang/reflect/Field.getDeclaringClass ()Ljava/lang/Class;
      // 16: aload 0
      // 17: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 1a: if_acmpeq 56
      // 1d: goto 24
      // 20: invokestatic k74/x/IlIlIIlll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 23: athrow
      // 24: aload 0
      // 25: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 28: ldc 984162688
      // 2a: ldc -1028555010
      // 2c: ldc 1718789164
      // 2e: ixor
      // 2f: invokestatic k74/x/IlIlIIlll.lIll (II)I
      // 32: ldc 984162689
      // 34: ldc -1028555010
      // 36: ldc 89116292
      // 38: ixor
      // 39: invokestatic k74/x/IlIlIIlll.lIll (II)I
      // 3c: invokestatic k74/x/IlIlIIlll.IIIl (II)Ljava/lang/String;
      // 3f: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 42: invokevirtual java/lang/Class.getDeclaredField (Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 45: putstatic k74/x/IlIlIIlll.II Ljava/lang/reflect/Field;
      // 48: getstatic k74/x/IlIlIIlll.II Ljava/lang/reflect/Field;
      // 4b: bipush 1
      // 4c: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 4f: goto 56
      // 52: invokestatic k74/x/IlIlIIlll.ll (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 55: athrow
      // 56: getstatic k74/x/IlIlIIlll.II Ljava/lang/reflect/Field;
      // 59: aload 0
      // 5a: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 5d: astore 1
      // 5e: aload 1
      // 5f: instanceof net/minecraft/class_1297
      // 62: ifeq 71
      // 65: aload 1
      // 66: checkcast net/minecraft/class_1297
      // 69: astore 2
      // 6a: aload 2
      // 6b: invokevirtual net/minecraft/class_1297.method_5667 ()Ljava/util/UUID;
      // 6e: goto 72
      // 71: aconst_null
      // 72: areturn
      // 73: astore 1
      // 74: aconst_null
      // 75: areturn
   }

   public static class_2561 l(class_2561 var0) {
      if (var0 == null) {
         return null;
      } else {
         lllllIll var1 = IIlI(var0, true);
         return var1.I() ? var1.II() : var0;
      }
   }

   private static boolean II(String var0, String var1) {
      return var0.regionMatches(true, 0, var1, 0, var1.length());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1238071473;
      int var11 = 0;
      int var8 = "*蕨\uf226踈\uea25逨戧鬨ሠ胨㈧蒨∤轨爣騨ꈤ鉈ሤ誈숦蟈㨡蛈ᨤ麨ꈡ鄨\uda25骈\uea22艨숥铨䨣蚈騢鉨爥蔨騦銨ਦ\u0019횧맴숧ᇱ쏧藺\udfa7\ue9f1\udbe7쇷펇ꇴ옧⧰\uda87釳졧臷탇퇴\ud827臨쪇釴켇".length();
      String var7 = "*蕨\uf226踈\uea25逨戧鬨ሠ胨㈧蒨∤轨爣騨ꈤ鉈ሤ誈숦蟈㨡蛈ᨤ麨ꈡ鄨\uda25骈\uea22艨숥铨䨣蚈騢鉨爥蔨騦銨ਦ\u0019횧맴숧ᇱ쏧藺\udfa7\ue9f1\udbe7쇷펇ꇴ옧⧰\uda87釳졧臷탇퇴\ud827臨쪇釴켇";
      short var12 = 19978;
      int var10 = 0;
      String[] var9 = new String[2];

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
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

      III = var9;
      IIl = new Object[var9.length];
      int var20 = 0;
      int var10001 = 0;
      byte[] var10002 = "¸\n`XÛ4Ã9\u0086(<vS\u0012!¡0B\u009aÄÕ\u0010\u0003K.-ó\u001cIH\u00adj\u008bz\u009dTêRxYÝ\fü\u0096R\u0089\f@ÏJP\u009e¿\u009bï:\u000eb÷\u008få\u008dÒ\u001c.\u0088_©£%\u0088Nò=ñ\u0004ð4Í\u0086\u0099õ×Ð\u0084AF*¸S\u009e`Ê+\u00ad \u0081´\u0005ÈÒÖ#=å;ï\u0098â¿\u0013z'¨Í\u009dÛ]³xNSù\u0094-$ÂZ3\u0013©\u0017Qî\u0015rí+ngì^& ð¶í\u000bú\u0013\u009c\u008fâÒÿC ¶óC¯Bv\u001b©)\u0095£°¼âô¶\u0003Yæ\u001a\n\u0093IÖY¾H\u0094²Oß\u009c\u0081ð±Þ½\u0001ú\f¦ÅQ3\b8\n¶Æé\u0015Ù\u0083oq\u0085\u0090\u008c±ã¦_úÒLµ;\u008ctµ\r\u001fËòìÍ\u0088×Ö^\u0095H\u0086\u0089X\u0095Ú\u009a´â~\r_\u00017¬%í\u0010 [NeyàÛ\u009f*d\u00adþì\u0082\u0082~*¨M\u0092Éµ#OrÂÕ:\u000f1\u0014<%KÛzÙ2Îù\u009c\u0001õà\u008c]¤d÷¹*t.Ì\b\u000eY\u008eVN«?~ò©<¡/^\u00135Ê\u0087Ûm\u0018ÍoÆcm\u0017b\u0018VV\b¿lP#6æyÞÙÝXùÇ\u0088\u0010¥z¡ÃØ»\u0093\u0004edu(\u009a)óCrù¹;\u0089Ô%%¨äÙË|\u001fÅ·J\u008b¿ÉÇ¿{\u000eà\u0012úF\u009f/\fH\u0082\b\u0095ÍHÛ\u001c\u001b}\u009aF÷Óæµ+²õ\u009cfÏH×Ôj¡w\u001a´À\u0083o\u0015Î%}Ê\u0080Ù×/EA6r®OÉ\u009e\u009d\u0015\u0080Ì[Úð½o\u0081\u000e¯#\u00adÊ\u001e\u009aÀE6\u0092vceMbÅ¢.ZÃ\u0003\u0093)\u008d¼Y\u0017\u0093,ªPÞG\u000b\u0080ý»\fÈ+*áóö\u0084¥H¢E)K\u0096\u0094®\u0096ÇÑ8UH¤8Gðaè`n=|\u008a\u0098z^\u0019ð\u0091ò\u0086VMÂ%æ/v~ÆéCL\fØÖ\u0006¼j\u00adºÓsîYÛY\u009fíg\r;¡\u0013\u0090\u009f\u009dìð¼×X\u0099|Ó\u0011ÃØ9g3\u0013\u0012§@wáÅ\u009eÇÒîÖX\u0004\u0012Ö5\u009d%g\u0006\u0095JwSÏ2\u001e\u0086¥müA\u001b8\fÁ\u0000\u0081\"ù\u001eiAÚR²]\u008aë3W\u0011\u001d¶k°g}aü`ð\u0014/U\u0086÷½×6<|íD\u001a¶bwä²qAôX\u0091K÷z2õ1ã\u0000|9\u001c¤\u0087>åTKÑ²þ¬â¤Ü¢µ¿\r[ô»àæÒ\u0081Èf\u001e#é\u001eù>ÏÌ+ö\u0082\u0002KÛA\u0013fá¢1Ôóæ´µ\u008e\"aÌ½ÏnD\fNwïðÒÐd¹xfíG o\u001dÉ\u008eÞÛý\u0099Ýá¢YÅ¤÷æ?Âú{~d¸¶`s£Ø¬\u000bÛ\u009a@\u0099xðà\u0093M·;°Ö\u009d \u0099Ã©ºþ¸\u0097Ë¨A©\u0000\u0019\u0001Ôx\u0007ýë;\u0092ÔÀjs\tIê\u0006\u0092\u009c\u009c:pÃ§ ºSQÆa°Ã\u00ad¸i_\u0010µb\u000b9SêqÒ\u0084¶Tæ&\u00833\u0099§·4fU¹]´JÌ°4G=«\u0095Úú\u0083\u0084pD(^´\u009de@N\u0097½ýs\u001b\u0081ÑhÝ\u0019çH\\IÓ\u008cÌ\u0098xÇ\u008f~¯v\u000f\u0087>î¹ãf\u0007;Ê\u0093\\ß)AUí¸\u0004Viª\u0011~ù(\u0002}\u001eH\u0086/;\u0092ëÆTkïqej\u00945!ü)è#¯¨\u009dZÊIF\u008eï¸Ú\u009eá\u0085\u0005\u0089Å¶b\u0018¹¶üsfY4WÄöÆ©TÞRÃÒÖô'\u0084LÚ°¬\u0095À,£¡ì\u0016\u0001#¼\u001dâó\u0095ØSôÖ\u0085Øo\u0010bG\u008fUÑ1Ç\u009có ä\u0094`°Bè\u0095- \u009cb\u008f\nv,»\u0083MH\u0019Â\u00ad¿/Ñµ#bÎ÷}Eâ\u0092D2Q\u008dö!ï\u000bÆõ-(¿l}.\u007f×²·\f\n¼\u008f5ãþEÇ$W\u0019ªpú-±I·\u0004h.\u008a\u0007¹9Á÷i\u001dyÆ@âsÀ°Lð@~\u0089Uïô¹²±\u0088\u0099\t\u0019m:\u0082<"
         .getBytes("ISO-8859-1");
      ll = new int[291];

      int var53;
      do {
         ll[var20] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -643915773;
         var20 += 1;
         var53 = var10001 + 4;
         var10001 += 4;
      } while (var53 < var10002.length);

      String[] var5 = new String[5];
      int var3 = 0;
      String var2;
      int var4 = (var2 = llII((byte)-28, 1947979099, (short)-25731, 1641716544)).length();
      int var1 = lIll(984162445, var17 ^ -366058392);
      int var19 = -1;

      label93:
      while (true) {
         var20 = lIll(984162446, var17 ^ 1986230430);
         String var25 = var2.substring(++var19, var19 + var1);
         byte var37 = -1;

         while (true) {
            label88: {
               char[] var55 = var25.toCharArray();
               int var67 = var55.length;
               int var6 = 0;
               var53 = var20;
               var42 = var55;
               var10001 = var67;
               char[] var79;
               int var86;
               if (var67 <= 1) {
                  var79 = var55;
                  var67 = var20;
                  var86 = var6;
               } else {
                  var53 = var20;
                  var10001 = var67;
                  if (var67 <= var6) {
                     break label88;
                  }

                  var79 = var55;
                  var67 = var20;
                  var86 = var6;
               }

               while (true) {
                  var79[var86] = (char)(var79[var86] ^ var67 ^ switch (var6 % lIll(984162449, var17 ^ -1558160699)) {
                     case 0 -> lIll(984162450, var17 ^ -1812686662);
                     case 1 -> lIll(984162451, var17 ^ -361903326);
                     case 2 -> lIll(984162452, var17 ^ 718669601);
                     case 3 -> lIll(984162453, var17 ^ 1493895922);
                     case 4 -> lIll(984162454, var17 ^ 1625441939);
                     case 5 -> lIll(984162455, var17 ^ -1843007494);
                     default -> lIll(984162456, var17 ^ -9351235);
                  });
                  var6++;
                  if (var53 == 0) {
                     var86 = var53;
                     var79 = var42;
                     var67 = var53;
                  } else {
                     if (var10001 <= var6) {
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
                     I = new String[5];
                     Il = List.of(
                        IlIIllIII.Ill(IIIl(lIll(984162457, var17 ^ -464817133), lIll(984162458, var17 ^ 1026507859))),
                        IlIIllIII.Ill(IIIl(lIll(984162459, var17 ^ -331676962), lIll(984162460, var17 ^ 1008613598))),
                        IlIIllIII.Ill(IIIl(lIll(984162461, var17 ^ 367046888), lIll(984162462, var17 ^ -447881650)))
                     );
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

                  var4 = (var2 = llII((byte)-77, 1947979098, 8846, 1415927979)).length();
                  var1 = lIll(984162447, var17 ^ 675567437);
                  var19 = -1;
            }

            var20 = lIll(984162448, var17 ^ 288614276);
            var25 = var2.substring(++var19, var19 + var1);
            var37 = 0;
         }
      }
   }

   private static boolean Il(class_2561 var0) {
      return var0.method_10851() instanceof class_8828 var1 && var1.comp_737().isEmpty();
   }

   private static boolean lI(UUID var0) {
      if (var0 == null) {
         return false;
      } else {
         class_310 var1 = class_310.method_1551();
         if (var1.field_1724 == null) {
            return false;
         } else if (var0.equals(var1.field_1724.method_5667())) {
            return true;
         } else {
            UUID var2 = lIlIIIll.l(var1.field_1724.method_7334());
            return var2 != null && var0.equals(var2);
         }
      }
   }

   private static Exception ll(Exception var0) {
      return var0;
   }

   public static boolean III(Object var0) {
      return IllI(I(var0));
   }

   public static boolean IIl(UUID var0) {
      return lI(var0);
   }

   public static boolean IlI(class_1657 var0) {
      return var0 != null && lI(var0.method_5667());
   }

   private static String llII(byte var0, int var1, short var2, int var3) {
      int var8 = var1 ^ 1947979099;
      char[] var7 = III[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])IIl[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         IIl[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 43709;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ var6 ^ 39050 ^ switch (var6 % 31) {
            default -> 117;
            case 1 -> 225;
            case 2 -> 183;
            case 3 -> 121;
            case 4 -> 16;
            case 5 -> 233;
            case 6 -> 63;
            case 7 -> 86;
            case 8 -> 200;
            case 9 -> 184;
            case 10 -> 254;
            case 11 -> 47;
            case 12 -> 49;
            case 13 -> 35;
            case 14 -> 201;
            case 15 -> 134;
            case 16 -> 147;
            case 17 -> 98;
            case 18 -> 237;
            case 19 -> 229;
            case 20 -> 37;
            case 21 -> 104;
            case 22 -> 247;
            case 23 -> 243;
            case 24 -> 98;
            case 25 -> 94;
            case 26 -> 41;
            case 27 -> 41;
            case 28 -> 182;
            case 29 -> 27;
            case 30 -> 13;
         } ^ var1 ^ var3 ^ var5 ^ var0 ^ var2);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   public static void Ill(IIlIIIIll var0) {
   }

   private static boolean lII(int var0) {
      int var1 = -1724192377;
      return var0 == lIll(984162690, var1 ^ 64648574)
         || var0 == lIll(984162691, var1 ^ -689935960)
         || var0 >= lIll(984162692, var1 ^ -1246702901) && var0 <= lIll(984162693, var1 ^ 1357005996)
         || var0 >= lIll(984162694, var1 ^ -1411407856) && var0 <= lIll(984162695, var1 ^ -860160119)
         || var0 >= lIll(984162696, var1 ^ 243850070) && var0 <= lIll(984162697, var1 ^ 1872845121);
   }

   public static class_2561 lIl(Object var0, class_2561 var1) {
      IIlIIIIll var2 = IlIl();
      return var2 != null && var2.Il(I(var0)) ? l(var1) : var1;
   }

   private static String llI(String var0) {
      String var1 = var0;

      boolean var2;
      do {
         var2 = false;

         for (IIIlIlIl var4 : Il) {
            String var5 = var4.llIl();
            if (II(var1, var5)) {
               var1 = var1.substring(var5.length());

               while (!var1.isEmpty()) {
                  int var6 = var1.codePointAt(0);
                  if (!Character.isWhitespace(var6) && !Character.isSpaceChar(var6) && var6 != lIll(984162698, 1307655286 ^ -1942541170)) {
                     break;
                  }

                  var1 = var1.substring(Character.charCount(var6));
               }

               var2 = true;
            }
         }
      } while (var2);

      return var1;
   }

   private IlIlIIlll() {
   }

   public static class_2561 lll(class_640 var0, class_2561 var1) {
      IIlIIIIll var2 = IlIl();
      return var2 != null && var0 != null && var2.I(var0.method_2966()) ? l(var1) : var1;
   }

   public static class_2561 IIII(class_1657 var0, class_2561 var1) {
      IIlIIIIll var2 = IlIl();
      return var2 != null && var0 != null && var2.lI(var0) ? l(var1) : var1;
   }

   private static String IIIl(int var0, int var1) {
      int var9 = 1175462256;
      int var2 = (var0 ^ lIll(984162699, var9 ^ 139499448)) & lIll(984162700, var9 ^ -1785479564);
      if (I[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & lIll(984162701, var9 ^ -448721199)) {
            case 0 -> lIll(984162702, var9 ^ 1421350824);
            case 1 -> lIll(984162703, var9 ^ -1084804374);
            case 2 -> lIll(984162704, var9 ^ 1951576831);
            case 3 -> lIll(984162705, var9 ^ -100702146);
            case 4 -> lIll(984162706, var9 ^ -1461251604);
            case 5 -> lIll(984162707, var9 ^ -1427233991);
            case 6 -> lIll(984162708, var9 ^ -1020315717);
            case 7 -> lIll(984162709, var9 ^ -560224541);
            case 8 -> lIll(984162710, var9 ^ -494305715);
            case 9 -> lIll(984162711, var9 ^ -1863234480);
            case 10 -> lIll(984162712, var9 ^ -613488495);
            case 11 -> lIll(984162713, var9 ^ -2012429385);
            case 12 -> lIll(984162714, var9 ^ -1075769536);
            case 13 -> lIll(984162715, var9 ^ -1201278228);
            case 14 -> lIll(984162716, var9 ^ 2104634703);
            case 15 -> lIll(984162717, var9 ^ -2121835070);
            case 16 -> lIll(984162718, var9 ^ 344529217);
            case 17 -> lIll(984162719, var9 ^ 2013143568);
            case 18 -> lIll(984162720, var9 ^ 1774799158);
            case 19 -> lIll(984162721, var9 ^ 188021636);
            case 20 -> lIll(984162722, var9 ^ -1208906110);
            case 21 -> lIll(984162723, var9 ^ -1232812492);
            case 22 -> lIll(984162724, var9 ^ -1435762592);
            case 23 -> lIll(984162725, var9 ^ -1597408128);
            case 24 -> lIll(984162726, var9 ^ -1207427315);
            case 25 -> lIll(984162727, var9 ^ 2053903260);
            case 26 -> lIll(984162728, var9 ^ -174549485);
            case 27 -> lIll(984162729, var9 ^ -202147028);
            case 28 -> lIll(984162730, var9 ^ -362413212);
            case 29 -> lIll(984162731, var9 ^ -321275585);
            case 30 -> lIll(984162732, var9 ^ 1087405517);
            case 31 -> lIll(984162733, var9 ^ -1937547292);
            case 32 -> lIll(984162734, var9 ^ -832000107);
            case 33 -> lIll(984162735, var9 ^ -967110377);
            case 34 -> lIll(984162736, var9 ^ -2073566761);
            case 35 -> lIll(984162737, var9 ^ 1450978191);
            case 36 -> lIll(984162738, var9 ^ 1775426008);
            case 37 -> lIll(984162739, var9 ^ -333708182);
            case 38 -> lIll(984162740, var9 ^ -2091282585);
            case 39 -> lIll(984162741, var9 ^ -548773415);
            case 40 -> lIll(984162742, var9 ^ -1183006968);
            case 41 -> lIll(984162743, var9 ^ -2003413718);
            case 42 -> lIll(984162744, var9 ^ -693217888);
            case 43 -> lIll(984162745, var9 ^ 1158746974);
            case 44 -> lIll(984162746, var9 ^ -1756219802);
            case 45 -> lIll(984162747, var9 ^ 72328688);
            case 46 -> lIll(984162748, var9 ^ -746424891);
            case 47 -> lIll(984162749, var9 ^ -1066529561);
            case 48 -> lIll(984162750, var9 ^ 1468395479);
            case 49 -> lIll(984162751, var9 ^ -151059518);
            case 50 -> lIll(984162752, var9 ^ 2055319041);
            case 51 -> lIll(984162753, var9 ^ 591017343);
            case 52 -> lIll(984162754, var9 ^ 1891517184);
            case 53 -> lIll(984162755, var9 ^ -1235721474);
            case 54 -> lIll(984162756, var9 ^ 1886560413);
            case 55 -> lIll(984162757, var9 ^ -1821391929);
            case 56 -> lIll(984162758, var9 ^ 672675110);
            case 57 -> lIll(984162759, var9 ^ 1441528536);
            case 58 -> lIll(984162760, var9 ^ 2140224281);
            case 59 -> lIll(984162761, var9 ^ -2081935720);
            case 60 -> lIll(984162762, var9 ^ -958720998);
            case 61 -> lIll(984162763, var9 ^ -695777879);
            case 62 -> lIll(984162764, var9 ^ -1385970555);
            case 63 -> lIll(984162765, var9 ^ 1947657529);
            case 64 -> 0;
            case 65 -> lIll(984162766, var9 ^ 55883656);
            case 66 -> lIll(984162767, var9 ^ -236609871);
            case 67 -> lIll(984162768, var9 ^ -203013764);
            case 68 -> lIll(984162769, var9 ^ 80336138);
            case 69 -> lIll(984162770, var9 ^ -587100718);
            case 70 -> lIll(984162771, var9 ^ -1749734540);
            case 71 -> lIll(984162772, var9 ^ 936218382);
            case 72 -> lIll(984162773, var9 ^ 210561202);
            case 73 -> lIll(984162774, var9 ^ 915063561);
            case 74 -> lIll(984162775, var9 ^ -1130152261);
            case 75 -> lIll(984162776, var9 ^ -2021516815);
            case 76 -> 1;
            case 77 -> lIll(984162777, var9 ^ -758495998);
            case 78 -> 3;
            case 79 -> lIll(984162778, var9 ^ -82233951);
            case 80 -> lIll(984162779, var9 ^ -908163920);
            case 81 -> lIll(984162780, var9 ^ 804420161);
            case 82 -> lIll(984162781, var9 ^ -1449549894);
            case 83 -> lIll(984162782, var9 ^ -471766641);
            case 84 -> lIll(984162783, var9 ^ 2147436723);
            case 85 -> lIll(984162784, var9 ^ -2095997836);
            case 86 -> lIll(984162785, var9 ^ -1620202648);
            case 87 -> lIll(984162786, var9 ^ -451729480);
            case 88 -> lIll(984162787, var9 ^ 567545145);
            case 89 -> lIll(984162788, var9 ^ -1600359848);
            case 90 -> lIll(984162789, var9 ^ 1452434073);
            case 91 -> lIll(984162790, var9 ^ -820532908);
            case 92 -> lIll(984162791, var9 ^ 1187091236);
            case 93 -> lIll(984162792, var9 ^ 472724345);
            case 94 -> lIll(984162793, var9 ^ -269394876);
            case 95 -> lIll(984162794, var9 ^ -960745611);
            case 96 -> lIll(984162795, var9 ^ -1928426760);
            case 97 -> lIll(984162796, var9 ^ 767580675);
            case 98 -> lIll(984162797, var9 ^ -642386531);
            case 99 -> lIll(984162798, var9 ^ 2141661087);
            case 100 -> lIll(984162799, var9 ^ -2096250372);
            case 101 -> lIll(984162800, var9 ^ 468488930);
            case 102 -> lIll(984162801, var9 ^ 353599118);
            case 103 -> lIll(984162802, var9 ^ 1331309979);
            case 104 -> lIll(984162803, var9 ^ -2144710645);
            case 105 -> lIll(984162804, var9 ^ -606846488);
            case 106 -> lIll(984162805, var9 ^ -149881216);
            case 107 -> lIll(984162806, var9 ^ -1700800894);
            case 108 -> lIll(984162807, var9 ^ 750356558);
            case 109 -> lIll(984162808, var9 ^ 941572696);
            case 110 -> lIll(984162809, var9 ^ 1696361);
            case 111 -> lIll(984162810, var9 ^ 1935102263);
            case 112 -> lIll(984162811, var9 ^ 1296682239);
            case 113 -> lIll(984162812, var9 ^ 168077789);
            case 114 -> lIll(984162813, var9 ^ -634954915);
            case 115 -> lIll(984162814, var9 ^ -1829647712);
            case 116 -> lIll(984162815, var9 ^ -1456707136);
            case 117 -> lIll(984162560, var9 ^ 309896701);
            case 118 -> lIll(984162561, var9 ^ 290224446);
            case 119 -> lIll(984162562, var9 ^ -870501911);
            case 120 -> lIll(984162563, var9 ^ 261243951);
            case 121 -> lIll(984162564, var9 ^ 489328566);
            case 122 -> lIll(984162565, var9 ^ 984931404);
            case 123 -> lIll(984162566, var9 ^ -800941377);
            case 124 -> lIll(984162567, var9 ^ 1126855031);
            case 125 -> lIll(984162568, var9 ^ -594760409);
            case 126 -> lIll(984162569, var9 ^ 2134691782);
            case 127 -> lIll(984162570, var9 ^ 605817258);
            case 128 -> lIll(984162571, var9 ^ 383137047);
            case 129 -> lIll(984162572, var9 ^ 1550223159);
            case 130 -> lIll(984162573, var9 ^ -536243584);
            case 131 -> lIll(984162574, var9 ^ 50444618);
            case 132 -> lIll(984162575, var9 ^ -1212289645);
            case 133 -> lIll(984162576, var9 ^ -70681217);
            case 134 -> lIll(984162577, var9 ^ -952758044);
            case 135 -> lIll(984162578, var9 ^ -1920829637);
            case 136 -> lIll(984162579, var9 ^ -1983175950);
            case 137 -> lIll(984162580, var9 ^ 1673384828);
            case 138 -> lIll(984162581, var9 ^ 1216192551);
            case 139 -> lIll(984162582, var9 ^ -1155563546);
            case 140 -> lIll(984162583, var9 ^ -2009843901);
            case 141 -> lIll(984162584, var9 ^ 1590179499);
            case 142 -> lIll(984162585, var9 ^ -939554845);
            case 143 -> lIll(984162586, var9 ^ -812606788);
            case 144 -> lIll(984162587, var9 ^ -1779892659);
            case 145 -> lIll(984162588, var9 ^ -4779610);
            case 146 -> lIll(984162589, var9 ^ 1105390739);
            case 147 -> lIll(984162590, var9 ^ 1515963041);
            case 148 -> lIll(984162591, var9 ^ 1152623029);
            case 149 -> lIll(984162592, var9 ^ 141082082);
            case 150 -> lIll(984162593, var9 ^ -1310082787);
            case 151 -> lIll(984162594, var9 ^ 1198294467);
            case 152 -> lIll(984162595, var9 ^ 1034391439);
            case 153 -> lIll(984162596, var9 ^ 975893644);
            case 154 -> lIll(984162597, var9 ^ 257693652);
            case 155 -> lIll(984162598, var9 ^ -1913859775);
            case 156 -> lIll(984162599, var9 ^ -1214317861);
            case 157 -> lIll(984162600, var9 ^ 950862989);
            case 158 -> lIll(984162601, var9 ^ 731583655);
            case 159 -> lIll(984162602, var9 ^ -879683802);
            case 160 -> lIll(984162603, var9 ^ 1747964280);
            case 161 -> lIll(984162604, var9 ^ 1520883371);
            case 162 -> lIll(984162605, var9 ^ -27402242);
            case 163 -> lIll(984162606, var9 ^ 244396508);
            case 164 -> lIll(984162607, var9 ^ -1535767378);
            case 165 -> lIll(984162608, var9 ^ -2038933383);
            case 166 -> lIll(984162609, var9 ^ 1468078809);
            case 167 -> lIll(984162610, var9 ^ -1170460149);
            case 168 -> lIll(984162611, var9 ^ -1833107887);
            case 169 -> lIll(984162612, var9 ^ -1278995251);
            case 170 -> lIll(984162613, var9 ^ -1793668368);
            case 171 -> lIll(984162614, var9 ^ -656890328);
            case 172 -> lIll(984162615, var9 ^ 466192331);
            case 173 -> lIll(984162616, var9 ^ -118803272);
            case 174 -> lIll(984162617, var9 ^ -1133620041);
            case 175 -> lIll(984162618, var9 ^ 2025529727);
            case 176 -> lIll(984162619, var9 ^ -1783323344);
            case 177 -> lIll(984162620, var9 ^ 346886010);
            case 178 -> lIll(984162621, var9 ^ -2012576727);
            case 179 -> lIll(984162622, var9 ^ 582749693);
            case 180 -> lIll(984162623, var9 ^ -88736443);
            case 181 -> lIll(984162624, var9 ^ -737920195);
            case 182 -> lIll(984162625, var9 ^ -1022951159);
            case 183 -> lIll(984162626, var9 ^ 52380757);
            case 184 -> lIll(984162627, var9 ^ -1125834212);
            case 185 -> lIll(984162628, var9 ^ 564431154);
            case 186 -> lIll(984162629, var9 ^ -323314291);
            case 187 -> lIll(984162630, var9 ^ -2106137075);
            case 188 -> lIll(984162631, var9 ^ -1063619391);
            case 189 -> lIll(984162632, var9 ^ -1439007081);
            case 190 -> lIll(984162633, var9 ^ -304000895);
            case 191 -> lIll(984162634, var9 ^ -948274843);
            case 192 -> lIll(984162635, var9 ^ -211804213);
            case 193 -> lIll(984162636, var9 ^ -854505357);
            case 194 -> lIll(984162637, var9 ^ -203753620);
            case 195 -> lIll(984162638, var9 ^ -1901926487);
            case 196 -> lIll(984162639, var9 ^ -1310625262);
            case 197 -> lIll(984162640, var9 ^ -1699704250);
            case 198 -> lIll(984162641, var9 ^ 321972399);
            case 199 -> 5;
            case 200 -> lIll(984162642, var9 ^ -968436725);
            case 201 -> lIll(984162643, var9 ^ -1719844808);
            case 202 -> lIll(984162644, var9 ^ 160114411);
            case 203 -> lIll(984162645, var9 ^ -367440526);
            case 204 -> lIll(984162646, var9 ^ 864415852);
            case 205 -> lIll(984162647, var9 ^ 953276824);
            case 206 -> lIll(984162648, var9 ^ -1330954450);
            case 207 -> lIll(984162649, var9 ^ -326236658);
            case 208 -> lIll(984162650, var9 ^ -639010484);
            case 209 -> lIll(984162651, var9 ^ -303134876);
            case 210 -> lIll(984162652, var9 ^ -477670204);
            case 211 -> lIll(984162653, var9 ^ -1771383509);
            case 212 -> lIll(984162654, var9 ^ 1735490470);
            case 213 -> lIll(984162655, var9 ^ -1604754101);
            case 214 -> lIll(984162656, var9 ^ 519225266);
            case 215 -> lIll(984162657, var9 ^ -943742848);
            case 216 -> lIll(984162658, var9 ^ -848880619);
            case 217 -> lIll(984162659, var9 ^ 1096495214);
            case 218 -> lIll(984162660, var9 ^ -2017261615);
            case 219 -> lIll(984162661, var9 ^ 110310227);
            case 220 -> lIll(984162662, var9 ^ -1774020877);
            case 221 -> lIll(984162663, var9 ^ -710652152);
            case 222 -> lIll(984162664, var9 ^ 1432215432);
            case 223 -> lIll(984162665, var9 ^ -482769045);
            case 224 -> lIll(984162666, var9 ^ 1628468207);
            case 225 -> lIll(984162667, var9 ^ -2047628117);
            case 226 -> lIll(984162668, var9 ^ -1218254387);
            case 227 -> lIll(984162669, var9 ^ 863039745);
            case 228 -> lIll(984162670, var9 ^ -1544360889);
            case 229 -> lIll(984162671, var9 ^ 1150445345);
            case 230 -> lIll(984162672, var9 ^ 1632111555);
            case 231 -> 4;
            case 232 -> lIll(984162673, var9 ^ 246484829);
            case 233 -> lIll(984162674, var9 ^ 1068530100);
            case 234 -> lIll(984162675, var9 ^ 2066138210);
            case 235 -> lIll(984162676, var9 ^ 2037729282);
            case 236 -> lIll(984162677, var9 ^ 1091660);
            case 237 -> lIll(984162678, var9 ^ -734702221);
            case 238 -> lIll(984162679, var9 ^ -1002740666);
            case 239 -> lIll(984162680, var9 ^ -752919597);
            case 240 -> lIll(984162681, var9 ^ 1113806483);
            case 241 -> lIll(984162682, var9 ^ 700233568);
            case 242 -> lIll(984162683, var9 ^ 220075746);
            case 243 -> lIll(984162684, var9 ^ -208781677);
            case 244 -> 2;
            case 245 -> lIll(984162685, var9 ^ -1727514697);
            case 246 -> lIll(984162686, var9 ^ 2103356876);
            case 247 -> lIll(984162687, var9 ^ -361335377);
            case 248 -> lIll(984162432, var9 ^ 1987661232);
            case 249 -> lIll(984162433, var9 ^ 1289473046);
            case 250 -> lIll(984162434, var9 ^ 1194857114);
            case 251 -> lIll(984162435, var9 ^ -2104945591);
            case 252 -> lIll(984162436, var9 ^ -553480674);
            case 253 -> lIll(984162437, var9 ^ 949841803);
            case 254 -> lIll(984162438, var9 ^ -1947523212);
            default -> lIll(984162439, var9 ^ -1451620144);
         };
         int var5 = (var1 & lIll(984162440, var9 ^ 980066822)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIll(984162441, var9 ^ -806039693)) >>> lIll(984162442, var9 ^ 945153641)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIll(984162443, var9 ^ 1986093984);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIll(984162444, var9 ^ 314778183);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }

   private static lllllIll IIlI(class_2561 var0, boolean var1) {
      String[] var2;
      Object var3;
      boolean var4;
      boolean var5;
      label62: {
         String[] var10000 = IIllllIl.IIIIl();
         var3 = var0.method_10851();
         var2 = var10000;
         var4 = false;
         var5 = var1;
         if (var1 && lIlllll.I(var0.method_10866())) {
            var5 = false;
            if (var2 == null) {
               break label62;
            }
         }

         if (var5 && var3 instanceof class_8828 var6) {
            IIIllllll var7 = lIlI(var6.comp_737());
            if (var7.l()) {
               var3 = class_8828.method_54232(var7.II());
               var4 = true;
            }

            var5 = var7.I();
            if (var2 == null) {
               break label62;
            }
         }

         if (var5 && Il(var0)) {
            var5 = true;
            if (var2 == null) {
               break label62;
            }
         }

         var5 = false;
      }

      class_5250 var10 = class_5250.method_43477((class_7417)var3).method_10862(var0.method_10866());

      for (class_2561 var8 : var0.method_10855()) {
         lllllIll var9 = IIlI(var8, var5);
         var10.method_10852(var9.II());
         var4 |= var9.I();
         var5 = var9.l();
         if (var2 != null) {
            break;
         }
      }

      return new lllllIll((class_2561)(var4 ? var10 : var0), var4, var5);
   }

   public static void IIll() {
      if (!l) {
         l = true;
         ClientPlayConnectionEvents.JOIN.register(IlIlIIlll::lIIl);
      }
   }

   static void IlII() {
      II = null;
   }

   private static IIlIIIIll IlIl() {
      IIIIIllII var0 = IIIIIllII.III();
      if (var0 == null) {
         return null;
      } else {
         IIlIIIIll var1 = var0.II().lllll();
         return var1 != null && var1.IIIIlIl() ? var1 : null;
      }
   }

   public static boolean IllI(UUID var0) {
      return lIII(var0) && IlIl() != null;
   }

   public static boolean Illl(GameProfile var0) {
      return var0 != null && lI(lIlIIIll.l(var0));
   }

   private static boolean lIII(UUID var0) {
      return lI(var0);
   }

   private static void lIIl(class_634 var0, PacketSender var1, class_310 var2) {
      if (!IIllllI.II()) {
         class_642 var3 = var0.method_45734();
         if (var3 != null && llllIlll.IIl(var3.field_3761)) {
            var0.method_48296()
               .method_10747(class_2561.method_43470(IlIIllIII.lI(IIIl(lIll(984162463, 272844341 ^ 1912842304), lIll(984162464, 272844341 ^ -130810296)))));
         } else {
            Ill(IlIl());
         }
      }
   }

   private static IIIllllll lIlI(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         int var1 = 0;
         boolean var2 = false;

         while (var1 < var0.length()) {
            int var3 = var0.codePointAt(var1);
            if (!lII(var3)) {
               break;
            }

            var2 = true;
            var1 += Character.charCount(var3);

            while (var1 < var0.length()) {
               int var4 = var0.codePointAt(var1);
               if (!Character.isWhitespace(var4) && !Character.isSpaceChar(var4)) {
                  break;
               }

               var2 = true;
               var1 += Character.charCount(var4);
            }
         }

         String var7 = var0.substring(var1);
         String var8 = llI(var7);

         for (var2 |= !var8.equals(var7); !var8.isEmpty(); var2 = true) {
            int var5 = var8.codePointAt(0);
            if (!Character.isWhitespace(var5)
               && !Character.isSpaceChar(var5)
               && var5 != lIll(984162465, -680435404 ^ 1126335848)
               && var5 != lIll(984162466, -680435404 ^ -1501486201)) {
               break;
            }

            var8 = var8.substring(Character.charCount(var5));
         }

         return new IIIllllll(var8, var2, var8.isBlank());
      } else {
         return new IIIllllll("", false, true);
      }
   }
}
