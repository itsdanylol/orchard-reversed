package k74.x;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.security.CodeSource;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

@Environment(EnvType.CLIENT)
public final class IIllllll {
   private static final URL I;
   private static final String[] l;
   private static final Object[] ll;
   private static final int[] Il;
   private static final String[] II;
   private static final String[] lI;

   private static void I(Object param0) throws ReflectiveOperationException {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: astore 1
      // 004: aload 0
      // 005: ifnonnull 00d
      // 008: return
      // 009: invokestatic k74/x/IIllllll.l (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 00c: athrow
      // 00d: aload 0
      // 00e: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 011: ldc -197246085
      // 013: ldc 763104847
      // 015: ldc -333911049
      // 017: ixor
      // 018: invokestatic k74/x/IIllllll.Ill (II)I
      // 01b: ldc -197246086
      // 01d: ldc 763104847
      // 01f: ldc -1264527385
      // 021: ixor
      // 022: invokestatic k74/x/IIllllll.Ill (II)I
      // 025: invokestatic k74/x/IIllllll.III (II)Ljava/lang/String;
      // 028: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 02b: invokestatic k74/x/IIllllll.Il (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
      // 02e: astore 2
      // 02f: aload 2
      // 030: ifnonnull 038
      // 033: return
      // 034: invokestatic k74/x/IIllllll.l (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 037: athrow
      // 038: aload 2
      // 039: bipush 1
      // 03a: invokevirtual java/lang/reflect/Field.setAccessible (Z)V
      // 03d: aload 2
      // 03e: aload 0
      // 03f: invokevirtual java/lang/reflect/Field.get (Ljava/lang/Object;)Ljava/lang/Object;
      // 042: astore 3
      // 043: aload 3
      // 044: instanceof [Ljava/lang/Object;
      // 047: ifeq 056
      // 04a: aload 3
      // 04b: checkcast [Ljava/lang/Object;
      // 04e: astore 4
      // 050: aload 4
      // 052: arraylength
      // 053: ifne 05b
      // 056: return
      // 057: invokestatic k74/x/IIllllll.l (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 05a: athrow
      // 05b: new java/util/ArrayList
      // 05e: dup
      // 05f: aload 4
      // 061: arraylength
      // 062: invokespecial java/util/ArrayList.<init> (I)V
      // 065: astore 5
      // 067: aload 4
      // 069: astore 6
      // 06b: aload 6
      // 06d: arraylength
      // 06e: istore 7
      // 070: bipush 0
      // 071: istore 8
      // 073: iload 8
      // 075: iload 7
      // 077: if_icmpge 0ad
      // 07a: aload 6
      // 07c: iload 8
      // 07e: aaload
      // 07f: astore 9
      // 081: aload 9
      // 083: ifnull 0a6
      // 086: aload 9
      // 088: invokestatic k74/x/IIllllll.IlI (Ljava/lang/Object;)Z
      // 08b: ifne 0a6
      // 08e: goto 095
      // 091: invokestatic k74/x/IIllllll.l (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 094: athrow
      // 095: aload 5
      // 097: aload 9
      // 099: invokeinterface java/util/List.add (Ljava/lang/Object;)Z 2
      // 09e: pop
      // 09f: goto 0a6
      // 0a2: invokestatic k74/x/IIllllll.l (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 0a5: athrow
      // 0a6: iinc 8 1
      // 0a9: aload 1
      // 0aa: ifnull 073
      // 0ad: aload 5
      // 0af: invokeinterface java/util/List.size ()I 1
      // 0b4: aload 4
      // 0b6: arraylength
      // 0b7: if_icmpne 0bf
      // 0ba: return
      // 0bb: invokestatic k74/x/IIllllll.l (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 0be: athrow
      // 0bf: aload 4
      // 0c1: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 0c4: invokevirtual java/lang/Class.getComponentType ()Ljava/lang/Class;
      // 0c7: aload 5
      // 0c9: invokeinterface java/util/List.size ()I 1
      // 0ce: invokestatic java/lang/reflect/Array.newInstance (Ljava/lang/Class;I)Ljava/lang/Object;
      // 0d1: astore 6
      // 0d3: bipush 0
      // 0d4: istore 7
      // 0d6: iload 7
      // 0d8: aload 5
      // 0da: invokeinterface java/util/List.size ()I 1
      // 0df: if_icmpge 0f9
      // 0e2: aload 6
      // 0e4: iload 7
      // 0e6: aload 5
      // 0e8: iload 7
      // 0ea: invokeinterface java/util/List.get (I)Ljava/lang/Object; 2
      // 0ef: invokestatic java/lang/reflect/Array.set (Ljava/lang/Object;ILjava/lang/Object;)V
      // 0f2: iinc 7 1
      // 0f5: aload 1
      // 0f6: ifnull 0d6
      // 0f9: aload 2
      // 0fa: aload 0
      // 0fb: aload 6
      // 0fd: invokevirtual java/lang/reflect/Field.set (Ljava/lang/Object;Ljava/lang/Object;)V
      // 100: aload 0
      // 101: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 104: ldc -197246087
      // 106: ldc 763104847
      // 108: ldc -1341113678
      // 10a: ixor
      // 10b: invokestatic k74/x/IIllllll.Ill (II)I
      // 10e: ldc -197246088
      // 110: ldc 763104847
      // 112: ldc 210458005
      // 114: ixor
      // 115: invokestatic k74/x/IIllllll.Ill (II)I
      // 118: invokestatic k74/x/IIllllll.III (II)Ljava/lang/String;
      // 11b: invokestatic k74/x/IlIIllIII.lI (Ljava/lang/String;)Ljava/lang/String;
      // 11e: invokestatic k74/x/IIllllll.II (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
      // 121: astore 7
      // 123: aload 7
      // 125: ifnull 140
      // 128: aload 7
      // 12a: bipush 1
      // 12b: invokevirtual java/lang/reflect/Method.setAccessible (Z)V
      // 12e: aload 7
      // 130: aload 0
      // 131: bipush 0
      // 132: anewarray 4
      // 135: invokevirtual java/lang/reflect/Method.invoke (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      // 138: pop
      // 139: goto 140
      // 13c: invokestatic k74/x/IIllllll.l (Ljava/lang/ReflectiveOperationException;)Ljava/lang/ReflectiveOperationException;
      // 13f: athrow
      // 140: return
   }

   private static ReflectiveOperationException l(ReflectiveOperationException var0) {
      return var0;
   }

   private static Method II(Class<?> var0, String var1) {
      String[] var10000 = IIllllIl.IIIIl();
      Class var3 = var0;
      String[] var2 = var10000;

      while (true) {
         try {
            if (var3 == null || var3 == Object.class) {
               break;
            }
         } catch (NoSuchMethodException var6) {
            throw l(var6);
         }

         try {
            return var3.getDeclaredMethod(var1);
         } catch (NoSuchMethodException var5) {
            var3 = var3.getSuperclass();
            if (var2 == null) {
               continue;
            }
            break;
         }
      }

      return null;
   }

   private static String lII(int var0, int var1) {
      int var3 = var0 ^ -749270565;
      char[] var4 = lI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])ll[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         ll[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 113070121;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 110;
            case 1 -> 101;
            case 2 -> 99;
            case 3 -> 114;
            case 4 -> 76;
            case 5 -> 185;
            case 6 -> 69;
            case 7 -> 136;
            case 8 -> 21;
            case 9 -> 0;
            case 10 -> 136;
            case 11 -> 233;
            case 12 -> 105;
            case 13 -> 47;
            case 14 -> 106;
            case 15 -> 75;
            case 16 -> 53;
            case 17 -> 226;
            case 18 -> 121;
            case 19 -> 34;
            case 20 -> 203;
            case 21 -> 201;
            case 22 -> 214;
            case 23 -> 255;
            case 24 -> 10;
            case 25 -> 51;
            case 26 -> 9;
            case 27 -> 101;
            case 28 -> 174;
            case 29 -> 49;
            case 30 -> 197;
            case 31 -> 250;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private IIllllll() {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1232537543;
      short var13 = 16676;
      char[] var15 = "\u0015".toCharArray();
      String var14 = "鄠釓酙鄑醢醝鄳里釥醌醪鄹醦醊釓酬配金醳酄酦";
      byte var20 = -1;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            lI = var16;
            ll = new Object[var16.length];
            int var9 = -339074459;
            byte[] var7 = "Þ\u0090k(yÖè¸\u0082\u0098µ\u008eÁüÄ\u0091§)atGáÙÐ)Ô0\u0095:ÆM!'\u0018ZÆoð-$\u009el~\u0002\u009b\u0014\t\u008eXÍ\u0085Û~\u0086\u0002r¡;s\u0095FA$þÂ\u0086ïm\u0000ó&~\u0088ìû\u0096\u0097\u0011Cº\u00adO\u0080¸[ÐÝÏ\u0015ÍôÑ\f\u0007xÕ\u0094G#YÕ8Ð\u001e\tB~Î®\u0016²\u0001/Jæb\u0095°\u0087ÒØL¿\u0091\u0080oµ\u0093E³t\\s\n\n\u0001ÁµÜËûÚÈe/;fut;\u0084±:\u0005Sª9Ö\r\u0006\u001cS\u0094ÿü\u0019`u¨êÂ\u0095@¸Td\u0087 \u0015\u009c[\u000fdx¿@$~fdg_»®\u008b¯\u00905~®\u00172\u0010÷>\u0085ÙÏ\u0097Ý\u0013\tä*õ äy`\u009eó\u0094ç3\u0007 ñ>µh\b«ª¿Q`praR[\u0087\u000bzÿ\"ý½¸\u0094\u0005n\u00077\u009dÂ<\u0005D®5DGw\u0016t\u0013î7£\u0015Ü?F\u0084Âà\u0093¤³èë»!s\u008bSÍ\u009cbô4×\u000bx©Y²\u008f83\u0012\u001d\\â\u000b\"\u0096\u008a\f\u0014\u0005Kô\u000e>\u009d\u0013\u0004X(Õ\u0006 ÞWïq\u009b½íS¸ÒÔ\u001b\u0093\u0088\u007fWA÷Çè:\u0090\u0003©ôËN\u0086\u0012®Ïù\u0013\n\u0081Ü\tCß'fØÂ»\u0089S\u009bg©Ù\u0090ôR\nHÒHX\u008bZ¤p¸ð\u0084Â\u008aÈTK\b\u008f=vum\u001cã\u0005\u008f)2E8\u00005\u001aáW\u008c¢\u0097 V¢+uØ\u0005po\u0019\\\u008e\tÔSÒä<\u0093'&Ù¸\u001c\u0006\u00ad\u008e\u0011À\u001de¼7/T¶dó'îP*Q6Öö\u008czêV\u0082@Îà ·<È£¨¬\u0089I\u0082W_°ÏÊ(¢\u0000úQ. Þd\u008cËåNw¿I[jÅG|KÂñrÎ\u0099<Ø\u009aHZ0õ\bêN¼¹©~\u0015»\tSgÊN\u009bM)\u0084H µ\u008e¬©¥f\u0099\u008f\u0000Z\u001c \u0007\u0011\u0013\u0095Äç\u0007JµVÆÝ\\\u0018\u009buízZïO££?Àk>þÆ\u0099¾ã7}\u008d\u008d\u001c{\u000eD\u0016\u008czï\u000b\u0017Û\u008c^!\u0004\u009fë\u0014L\u0015\u001fçÐþ(´ãF¿P¥ÊÎû=ùIa ¾Mp3cI\u0007½\u0081Í@Â°ª.»ñ\u001c&ÌÈê»æêzL\u001acôK_ª¹üA\f¦v){ \u000fÎ*7\u001aqÐ\u007fÙ¥Úî²s4\u0092TÝÆ\b|·\u0091?\u0016Ù\rKüî$G\u0084ú÷ÊB\u00907\u001ce}öôg7\u0019k}\u0015\u0081°bªÛµ\u0017´rH\u0094¬Û\u0011\u0015U9\u0099Ìÿã\\92f°º\u009bÕî\u009e@½Ó\u009aùâ¶\u00945ÐöG®\u009amÛÃ(xûx&\u008cÐÚ¡÷p»Ô¼7Okø\u008c#V \u001eÍ'8V:v\u0084ê¥ÕÇ¶ðKê\u001c·\u008e_¬ß~&\u0089òÔ\\ÝHÁ\u0005\u0007R\u008eLî\u009e\u0004£Ñäº\u0017UÛ\u0014\u0007jÂ\u009c·ºV\u0011\u0096§GAúÜ¡Xçð±EÆ\u000e/Î\u0005\u0090:'\u0080!r¶Â(Yjq¼\u009c¨\tq &ë*Ü\u0096F9\u0092«B.:×\u0011ÒW\t\u001c\u008cmu\u0013\u001ehd\u0002%\u008eÄ\u0006PÀs\u009a\u0097Ó\u0000FCe\u001dKË´³ú\b\u0018ô üÓ\"l\u0013v)>b.a\n[ÞÏ\u0086\u009fÂ`\u008d]qõ\u0004Á\u008cmù\u0018\u008eÑ1\u0007´»ÐpÅO\u0010¶9k8=2t¬n\u001b\u009d\u0087]2B\u0001º¦ëòlÂ¼5F.3yWz8£ö\u0013\u0014³ã\u0019q`Ó²Rª;KLö·éw×Ï\u0007»ÇY*8\u008e\u0006«\t\u0092Eùáe-?N×\f\u0098ÂaEXA>+¾$4\u001c\u008a\u0011-Äçcl\u001f\u0006sÎ\u009d\u0015x\u000f±[\u0092#\u0012@Á\u0010¢\u007f\u0088\u0010éæ\u0019\u009a\u0081YVY"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            Il = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               Il[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var5 = new String[2];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lII(-749270565, var24 ^ 727110590)).length();
            int var1 = Ill(-197246081, var24 ^ 240501408);
            int var0 = -1;

            while (true) {
               char[] var10002;
               label84: {
                  int var28 = Ill(-197246082, var24 ^ -291669304);
                  char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
                  int var10004 = var10003.length;
                  int var6 = 0;
                  int var34 = var28;
                  var10002 = var10003;
                  int var29 = var10004;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var10004 = var28;
                     var10006 = var6;
                  } else {
                     var34 = var28;
                     var29 = var10004;
                     if (var10004 <= var6) {
                        break label84;
                     }

                     var10005 = var10003;
                     var10004 = var28;
                     var10006 = var6;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % Ill(-197246083, var24 ^ -2136435900)) {
                        case 0 -> Ill(-197246084, var24 ^ -1816465880);
                        case 1 -> Ill(-197246093, var24 ^ -1905985485);
                        case 2 -> Ill(-197246094, var24 ^ -963867109);
                        case 3 -> Ill(-197246095, var24 ^ 923852242);
                        case 4 -> Ill(-197246096, var24 ^ 845720206);
                        case 5 -> Ill(-197246089, var24 ^ -240048439);
                        default -> Ill(-197246090, var24 ^ -671440470);
                     });
                     var6++;
                     if (var34 == 0) {
                        var10006 = var34;
                        var10005 = var10002;
                        var10004 = var34;
                     } else {
                        if (var29 <= var6) {
                           break;
                        }

                        var10005 = var10002;
                        var10004 = var34;
                        var10006 = var6;
                     }
                  }
               }

               String var36 = new String(var10002).intern();
               byte var31 = -1;
               var5[var3++] = var36;
               if ((var0 += var1) >= var4) {
                  l = var5;
                  II = new String[2];
                  I = IIl(IIllllll.class);
                  return;
               }

               var1 = var2.charAt(var0);
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 93;
                  case 1 -> 101;
                  case 2 -> 15;
                  case 3 -> 229;
                  case 4 -> 188;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static Field Il(Class<?> var0, String var1) {
      Class var2 = var0;

      while (true) {
         try {
            if (var2 == null || var2 == Object.class) {
               return null;
            }
         } catch (NoSuchFieldException var5) {
            throw l(var5);
         }

         try {
            return var2.getDeclaredField(var1);
         } catch (NoSuchFieldException var4) {
            var2 = var2.getSuperclass();
         }
      }
   }

   private static void lI(Object var0) {
      try {
         I(var0);
      } catch (Throwable var2) {
      }
   }

   public static void ll() {
      lI(ClientTickEvents.START_CLIENT_TICK);
      lI(ClientTickEvents.END_CLIENT_TICK);
      lI(HudRenderCallback.EVENT);
      lI(lllII.l);
      lI(ClientPlayConnectionEvents.JOIN);
   }

   private static String III(int var0, int var1) {
      int var9 = -1179336142;
      int var2 = (var0 ^ Ill(-197246091, var9 ^ 125517625)) & Ill(-197246092, var9 ^ -536797099);
      if (II[var2] == null) {
         char[] var3 = l[var2].toCharArray();

         int var4 = switch (var3[0] & Ill(-197246101, var9 ^ 1690728153)) {
            case 0 -> Ill(-197246102, var9 ^ -1498169411);
            case 1 -> Ill(-197246103, var9 ^ 783049391);
            case 2 -> Ill(-197246104, var9 ^ 827447974);
            case 3 -> Ill(-197246097, var9 ^ 185538988);
            case 4 -> Ill(-197246098, var9 ^ -40876750);
            case 5 -> Ill(-197246099, var9 ^ -1282576983);
            case 6 -> Ill(-197246100, var9 ^ -1438129884);
            case 7 -> 0;
            case 8 -> Ill(-197246109, var9 ^ 839367393);
            case 9 -> 4;
            case 10 -> Ill(-197246110, var9 ^ 1937262864);
            case 11 -> Ill(-197246111, var9 ^ -1358764179);
            case 12 -> Ill(-197246112, var9 ^ 139865007);
            case 13 -> Ill(-197246105, var9 ^ -1995800822);
            case 14 -> Ill(-197246106, var9 ^ 871374502);
            case 15 -> Ill(-197246107, var9 ^ 2114725513);
            case 16 -> Ill(-197246108, var9 ^ 640626117);
            case 17 -> Ill(-197246117, var9 ^ -470553266);
            case 18 -> Ill(-197246118, var9 ^ -716532830);
            case 19 -> Ill(-197246119, var9 ^ 1744127325);
            case 20 -> Ill(-197246120, var9 ^ 1570394491);
            case 21 -> Ill(-197246113, var9 ^ -1988362727);
            case 22 -> Ill(-197246114, var9 ^ -763683636);
            case 23 -> Ill(-197246115, var9 ^ -1673147815);
            case 24 -> 1;
            case 25 -> Ill(-197246116, var9 ^ -1617521635);
            case 26 -> Ill(-197246125, var9 ^ -1173156534);
            case 27 -> Ill(-197246126, var9 ^ 1515845640);
            case 28 -> Ill(-197246127, var9 ^ 246045567);
            case 29 -> Ill(-197246128, var9 ^ -419902055);
            case 30 -> Ill(-197246121, var9 ^ 568364363);
            case 31 -> Ill(-197246122, var9 ^ -45089473);
            case 32 -> Ill(-197246123, var9 ^ 419478826);
            case 33 -> Ill(-197246124, var9 ^ -1071317426);
            case 34 -> Ill(-197246133, var9 ^ 502141805);
            case 35 -> Ill(-197246134, var9 ^ 913696736);
            case 36 -> 3;
            case 37 -> Ill(-197246135, var9 ^ -1317894002);
            case 38 -> Ill(-197246136, var9 ^ -1731903345);
            case 39 -> Ill(-197246129, var9 ^ 832408442);
            case 40 -> Ill(-197246130, var9 ^ 1114270774);
            case 41 -> Ill(-197246131, var9 ^ 1111095384);
            case 42 -> Ill(-197246132, var9 ^ 1439989430);
            case 43 -> Ill(-197246141, var9 ^ -1579128493);
            case 44 -> Ill(-197246142, var9 ^ 321425630);
            case 45 -> Ill(-197246143, var9 ^ 218089548);
            case 46 -> Ill(-197246144, var9 ^ -701302591);
            case 47 -> Ill(-197246137, var9 ^ -37252452);
            case 48 -> Ill(-197246138, var9 ^ 1499620467);
            case 49 -> Ill(-197246139, var9 ^ 517250318);
            case 50 -> Ill(-197246140, var9 ^ -1586035569);
            case 51 -> Ill(-197246149, var9 ^ -1706697325);
            case 52 -> Ill(-197246150, var9 ^ -1828397524);
            case 53 -> Ill(-197246151, var9 ^ -1338734041);
            case 54 -> Ill(-197246152, var9 ^ -1847357990);
            case 55 -> Ill(-197246145, var9 ^ -1727652643);
            case 56 -> Ill(-197246146, var9 ^ 1188248590);
            case 57 -> Ill(-197246147, var9 ^ 1319838433);
            case 58 -> Ill(-197246148, var9 ^ -708064716);
            case 59 -> Ill(-197246157, var9 ^ 975334529);
            case 60 -> Ill(-197246158, var9 ^ 1900798285);
            case 61 -> Ill(-197246159, var9 ^ -911635);
            case 62 -> Ill(-197246160, var9 ^ -1789754147);
            case 63 -> Ill(-197246153, var9 ^ 1145813962);
            case 64 -> Ill(-197246154, var9 ^ 743214372);
            case 65 -> Ill(-197246155, var9 ^ -306931776);
            case 66 -> Ill(-197246156, var9 ^ 995335422);
            case 67 -> Ill(-197246165, var9 ^ -1902796967);
            case 68 -> Ill(-197246166, var9 ^ 2014803831);
            case 69 -> Ill(-197246167, var9 ^ 1040020647);
            case 70 -> Ill(-197246168, var9 ^ 512904514);
            case 71 -> Ill(-197246161, var9 ^ 902359033);
            case 72 -> Ill(-197246162, var9 ^ -407413127);
            case 73 -> Ill(-197246163, var9 ^ -1664050475);
            case 74 -> Ill(-197246164, var9 ^ 1384896002);
            case 75 -> Ill(-197246173, var9 ^ -1259448328);
            case 76 -> Ill(-197246174, var9 ^ -1253435024);
            case 77 -> Ill(-197246175, var9 ^ -1358739769);
            case 78 -> Ill(-197246176, var9 ^ -1063756831);
            case 79 -> Ill(-197246169, var9 ^ 789774905);
            case 80 -> Ill(-197246170, var9 ^ 261687607);
            case 81 -> Ill(-197246171, var9 ^ -196423423);
            case 82 -> Ill(-197246172, var9 ^ -300412238);
            case 83 -> Ill(-197246181, var9 ^ 36708616);
            case 84 -> Ill(-197246182, var9 ^ 578950062);
            case 85 -> Ill(-197246183, var9 ^ -234122948);
            case 86 -> Ill(-197246184, var9 ^ -1690898973);
            case 87 -> Ill(-197246177, var9 ^ -1163682587);
            case 88 -> Ill(-197246178, var9 ^ -1888297911);
            case 89 -> Ill(-197246179, var9 ^ -1502248097);
            case 90 -> Ill(-197246180, var9 ^ -238273539);
            case 91 -> Ill(-197246189, var9 ^ -2045363225);
            case 92 -> Ill(-197246190, var9 ^ -744973093);
            case 93 -> Ill(-197246191, var9 ^ -916863613);
            case 94 -> Ill(-197246192, var9 ^ -1349203412);
            case 95 -> Ill(-197246185, var9 ^ 1115425703);
            case 96 -> Ill(-197246186, var9 ^ -2137448006);
            case 97 -> Ill(-197246187, var9 ^ -1595074608);
            case 98 -> Ill(-197246188, var9 ^ 1717435571);
            case 99 -> Ill(-197246197, var9 ^ -1854943928);
            case 100 -> Ill(-197246198, var9 ^ -1028407436);
            case 101 -> Ill(-197246199, var9 ^ -160773710);
            case 102 -> Ill(-197246200, var9 ^ 1890981324);
            case 103 -> Ill(-197246193, var9 ^ 1276517257);
            case 104 -> Ill(-197246194, var9 ^ 1755363651);
            case 105 -> Ill(-197246195, var9 ^ -1702348283);
            case 106 -> Ill(-197246196, var9 ^ 180998238);
            case 107 -> Ill(-197246205, var9 ^ -249616041);
            case 108 -> Ill(-197246206, var9 ^ 1818770054);
            case 109 -> Ill(-197246207, var9 ^ 1544664998);
            case 110 -> Ill(-197246208, var9 ^ 2015630617);
            case 111 -> Ill(-197246201, var9 ^ 1125052125);
            case 112 -> Ill(-197246202, var9 ^ -283380957);
            case 113 -> Ill(-197246203, var9 ^ -516107661);
            case 114 -> Ill(-197246204, var9 ^ 1462916944);
            case 115 -> Ill(-197245957, var9 ^ -1701313619);
            case 116 -> Ill(-197245958, var9 ^ -59741032);
            case 117 -> Ill(-197245959, var9 ^ 1275995467);
            case 118 -> Ill(-197245960, var9 ^ 255757349);
            case 119 -> Ill(-197245953, var9 ^ -1357644064);
            case 120 -> Ill(-197245954, var9 ^ -388246432);
            case 121 -> Ill(-197245955, var9 ^ 570997236);
            case 122 -> Ill(-197245956, var9 ^ 686567608);
            case 123 -> Ill(-197245965, var9 ^ -1059514511);
            case 124 -> Ill(-197245966, var9 ^ -61064877);
            case 125 -> Ill(-197245967, var9 ^ -1219294131);
            case 126 -> Ill(-197245968, var9 ^ 1095226162);
            case 127 -> Ill(-197245961, var9 ^ -259635810);
            case 128 -> Ill(-197245962, var9 ^ -1092883380);
            case 129 -> Ill(-197245963, var9 ^ -602245448);
            case 130 -> Ill(-197245964, var9 ^ 98805351);
            case 131 -> Ill(-197245973, var9 ^ -847353878);
            case 132 -> Ill(-197245974, var9 ^ 1073642140);
            case 133 -> Ill(-197245975, var9 ^ -607316898);
            case 134 -> Ill(-197245976, var9 ^ -582034159);
            case 135 -> Ill(-197245969, var9 ^ 708474488);
            case 136 -> Ill(-197245970, var9 ^ -1315236391);
            case 137 -> Ill(-197245971, var9 ^ -2025584738);
            case 138 -> Ill(-197245972, var9 ^ -1307800114);
            case 139 -> Ill(-197245981, var9 ^ 1099982710);
            case 140 -> Ill(-197245982, var9 ^ 312729353);
            case 141 -> Ill(-197245983, var9 ^ -152743015);
            case 142 -> Ill(-197245984, var9 ^ 1568497901);
            case 143 -> Ill(-197245977, var9 ^ -941611200);
            case 144 -> Ill(-197245978, var9 ^ -697042361);
            case 145 -> Ill(-197245979, var9 ^ -1577248542);
            case 146 -> Ill(-197245980, var9 ^ -427677294);
            case 147 -> Ill(-197245989, var9 ^ -1996789429);
            case 148 -> Ill(-197245990, var9 ^ -2138287942);
            case 149 -> Ill(-197245991, var9 ^ 497447802);
            case 150 -> Ill(-197245992, var9 ^ -363136437);
            case 151 -> Ill(-197245985, var9 ^ -316722624);
            case 152 -> 5;
            case 153 -> Ill(-197245986, var9 ^ 1510053340);
            case 154 -> Ill(-197245987, var9 ^ -798367160);
            case 155 -> Ill(-197245988, var9 ^ -1450265701);
            case 156 -> Ill(-197245997, var9 ^ -1137620652);
            case 157 -> Ill(-197245998, var9 ^ 2145731240);
            case 158 -> Ill(-197245999, var9 ^ 338930802);
            case 159 -> Ill(-197246000, var9 ^ -224567312);
            case 160 -> Ill(-197245993, var9 ^ -621344617);
            case 161 -> Ill(-197245994, var9 ^ -1332112110);
            case 162 -> Ill(-197245995, var9 ^ 1521401284);
            case 163 -> Ill(-197245996, var9 ^ 582643204);
            case 164 -> Ill(-197246005, var9 ^ -456085678);
            case 165 -> Ill(-197246006, var9 ^ -1019384145);
            case 166 -> Ill(-197246007, var9 ^ -1049132647);
            case 167 -> Ill(-197246008, var9 ^ -615180260);
            case 168 -> Ill(-197246001, var9 ^ -991280155);
            case 169 -> Ill(-197246002, var9 ^ -1309349001);
            case 170 -> Ill(-197246003, var9 ^ 854344400);
            case 171 -> Ill(-197246004, var9 ^ -1290428286);
            case 172 -> Ill(-197246013, var9 ^ 1790933541);
            case 173 -> Ill(-197246014, var9 ^ -1619853550);
            case 174 -> Ill(-197246015, var9 ^ 484133943);
            case 175 -> Ill(-197246016, var9 ^ 939533407);
            case 176 -> Ill(-197246009, var9 ^ 1018788598);
            case 177 -> Ill(-197246010, var9 ^ 846546971);
            case 178 -> Ill(-197246011, var9 ^ -504495476);
            case 179 -> Ill(-197246012, var9 ^ 2105782775);
            case 180 -> Ill(-197246021, var9 ^ 1564000173);
            case 181 -> Ill(-197246022, var9 ^ 1989818375);
            case 182 -> Ill(-197246023, var9 ^ -688173612);
            case 183 -> Ill(-197246024, var9 ^ -1861225900);
            case 184 -> Ill(-197246017, var9 ^ 711184032);
            case 185 -> Ill(-197246018, var9 ^ -1198670248);
            case 186 -> Ill(-197246019, var9 ^ -260378757);
            case 187 -> Ill(-197246020, var9 ^ 1290095800);
            case 188 -> Ill(-197246029, var9 ^ 280023934);
            case 189 -> Ill(-197246030, var9 ^ -1158211840);
            case 190 -> Ill(-197246031, var9 ^ 178251662);
            case 191 -> Ill(-197246032, var9 ^ 800214277);
            case 192 -> Ill(-197246025, var9 ^ 2064144506);
            case 193 -> Ill(-197246026, var9 ^ -1592649960);
            case 194 -> Ill(-197246027, var9 ^ 1222548742);
            case 195 -> Ill(-197246028, var9 ^ 2007245803);
            case 196 -> Ill(-197246037, var9 ^ -207909557);
            case 197 -> Ill(-197246038, var9 ^ -863894098);
            case 198 -> Ill(-197246039, var9 ^ 471238822);
            case 199 -> Ill(-197246040, var9 ^ 17291424);
            case 200 -> Ill(-197246033, var9 ^ 2061615318);
            case 201 -> Ill(-197246034, var9 ^ 1458691127);
            case 202 -> Ill(-197246035, var9 ^ -1469098225);
            case 203 -> Ill(-197246036, var9 ^ 914013957);
            case 204 -> Ill(-197246045, var9 ^ -2026754098);
            case 205 -> Ill(-197246046, var9 ^ -1910901794);
            case 206 -> Ill(-197246047, var9 ^ 450638310);
            case 207 -> Ill(-197246048, var9 ^ -681525435);
            case 208 -> Ill(-197246041, var9 ^ -1935929587);
            case 209 -> Ill(-197246042, var9 ^ -1613614561);
            case 210 -> Ill(-197246043, var9 ^ -2005250465);
            case 211 -> Ill(-197246044, var9 ^ 1947701323);
            case 212 -> Ill(-197246053, var9 ^ 707653041);
            case 213 -> Ill(-197246054, var9 ^ -1205273189);
            case 214 -> Ill(-197246055, var9 ^ -2083627669);
            case 215 -> Ill(-197246056, var9 ^ -159323617);
            case 216 -> Ill(-197246049, var9 ^ 831756721);
            case 217 -> Ill(-197246050, var9 ^ -450526006);
            case 218 -> Ill(-197246051, var9 ^ 1844718183);
            case 219 -> Ill(-197246052, var9 ^ -1369936888);
            case 220 -> Ill(-197246061, var9 ^ 1519631194);
            case 221 -> Ill(-197246062, var9 ^ -1254706990);
            case 222 -> Ill(-197246063, var9 ^ -999360296);
            case 223 -> Ill(-197246064, var9 ^ -39954844);
            case 224 -> Ill(-197246057, var9 ^ 964884752);
            case 225 -> Ill(-197246058, var9 ^ -80647136);
            case 226 -> Ill(-197246059, var9 ^ 1741485228);
            case 227 -> Ill(-197246060, var9 ^ -1093777176);
            case 228 -> Ill(-197246069, var9 ^ -1577835979);
            case 229 -> Ill(-197246070, var9 ^ -695871898);
            case 230 -> Ill(-197246071, var9 ^ 276427503);
            case 231 -> Ill(-197246072, var9 ^ -1686967268);
            case 232 -> Ill(-197246065, var9 ^ -933558990);
            case 233 -> Ill(-197246066, var9 ^ -76358867);
            case 234 -> Ill(-197246067, var9 ^ 484864679);
            case 235 -> Ill(-197246068, var9 ^ -897440310);
            case 236 -> Ill(-197246077, var9 ^ -529617957);
            case 237 -> Ill(-197246078, var9 ^ -247815900);
            case 238 -> Ill(-197246079, var9 ^ 1347652639);
            case 239 -> Ill(-197246080, var9 ^ 1163520246);
            case 240 -> Ill(-197246073, var9 ^ 1978846050);
            case 241 -> Ill(-197246074, var9 ^ -1660168861);
            case 242 -> Ill(-197246075, var9 ^ 296349438);
            case 243 -> Ill(-197246076, var9 ^ 1766269620);
            case 244 -> Ill(-197246341, var9 ^ -9789259);
            case 245 -> Ill(-197246342, var9 ^ -1595174690);
            case 246 -> Ill(-197246343, var9 ^ -474383902);
            case 247 -> Ill(-197246344, var9 ^ -1954556027);
            case 248 -> Ill(-197246337, var9 ^ -1428661365);
            case 249 -> Ill(-197246338, var9 ^ -484910694);
            case 250 -> Ill(-197246339, var9 ^ -1912685525);
            case 251 -> Ill(-197246340, var9 ^ -1161131726);
            case 252 -> Ill(-197246349, var9 ^ 1655176155);
            case 253 -> Ill(-197246350, var9 ^ -1186534589);
            case 254 -> Ill(-197246351, var9 ^ 995483691);
            default -> 2;
         };
         int var5 = (var1 & Ill(-197246352, var9 ^ 387648140)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Ill(-197246345, var9 ^ -1275018056)) >>> Ill(-197246346, var9 ^ 71241922)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Ill(-197246347, var9 ^ 1336312112);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Ill(-197246348, var9 ^ 656002802);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }

   private static int Ill(int var0, int var1) {
      int var2 = Il[var0 ^ -197246085] ^ var1 ^ var0;
      var2 ^= 3301;
      var2 ^= 31773;
      var2 ^= 51047;
      var2 -= 21473;
      var2 ^= 64304;
      var2 ^= 60511;
      var2 += 37605;
      var2 ^= 52824;
      return var2 ^ 3993;
   }

   private static URL IIl(Class<?> var0) {
      if (var0 != null && var0.getProtectionDomain() != null) {
         CodeSource var1 = var0.getProtectionDomain().getCodeSource();
         return var1 == null ? null : var1.getLocation();
      } else {
         return null;
      }
   }

   private static boolean IlI(Object var0) {
      if (var0 == null) {
         return false;
      } else {
         Class var1 = var0.getClass();
         String var2 = var1.getName();
         String var3 = IIllllll.class.getPackageName();
         if (!var3.isEmpty() && var2.startsWith(var3)) {
            return true;
         } else {
            URL var4 = IIl(var1);
            return I != null && I.equals(var4);
         }
      }
   }
}
