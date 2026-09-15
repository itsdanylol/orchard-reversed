package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;

@Environment(EnvType.CLIENT)
public final class Ill extends IlIIIIIIl {
   private final IIlIII II;
   private long Il;
   private static final double lI = 4.0;
   private volatile boolean ll;
   private volatile long III;
   private static final int[] IlIl;
   private static String[] IIl;
   private double I;
   private double IlI;
   private final IllIII<IIlIIII> Ill;
   private static final String[] IllI;
   private static final String[] lII;
   private volatile int lIl;
   private volatile int llI;
   private boolean lll;
   private static final Object[] Illl;
   private static final double IIII = 0.35;
   private volatile long IIIl;
   private final IlIIl IIlI;
   private static final String[] IIll;
   private volatile int IlII;

   private static String Illl(int var0, int var1) {
      int var3 = var0 ^ 1510554921;
      char[] var4 = IllI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])Illl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         Illl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 489148864;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 22;
            case 1 -> 51;
            case 2 -> 223;
            case 3 -> 191;
            case 4 -> 234;
            case 5 -> 219;
            case 6 -> 214;
            case 7 -> 16;
            case 8 -> 171;
            case 9 -> 232;
            case 10 -> 135;
            case 11 -> 236;
            case 12 -> 41;
            case 13 -> 147;
            case 14 -> 173;
            case 15 -> 242;
            case 16 -> 26;
            case 17 -> 191;
            case 18 -> 160;
            case 19 -> 145;
            case 20 -> 248;
            case 21 -> 174;
            case 22 -> 134;
            case 23 -> 108;
            case 24 -> 127;
            case 25 -> 214;
            case 26 -> 10;
            case 27 -> 36;
            case 28 -> 36;
            case 29 -> 255;
            case 30 -> 144;
            case 31 -> 80;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public int I() {
      return this.IlII;
   }

   private static MatchException l(MatchException var0) {
      return var0;
   }

   public long II() {
      try {
         if (this.ll) {
            return this.IIIl;
         }
      } catch (MatchException var1) {
         throw l(var1);
      }

      return 0L;
   }

   public int Il() {
      return this.llI;
   }

   public long lI() {
      try {
         if (this.ll) {
            return this.III;
         }
      } catch (MatchException var1) {
         throw l(var1);
      }

      return 0L;
   }

   private void ll(int var1) {
      try {
         if (var1 <= 0) {
            return;
         }
      } catch (MatchException var5) {
         throw l(var5);
      }

      double var2 = Math.max(0.0, (double)(var1 - this.Il));

      try {
         if (!this.lll) {
            this.IlI = var2;
            this.lll = true;
            return;
         }
      } catch (MatchException var4) {
         throw l(var4);
      }

      this.IlI = this.IlI + (var2 - this.IlI) * 0.35;
   }

   @Override
   public String IlIIl() {
      try {
         switch ((IIlIIII)this.Ill.IllI()) {
            case Il:
               return this.IIlI(this.II.IllI());
            case III:
               return IlIIllIII.lI(IIl[0]);
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var1) {
         throw l(var1);
      }
   }

   private static String III(char[] var0, long var1, int var3) {
      int var4 = IllI(1527918042, 1814253232 ^ 723881802) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IllI(1527918043, 1814253232 ^ 1351641907);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public void llIl() {
      this.lII();
      IIlIIlIl.lIIlI();
   }

   private int IIl(int var1) {
      int var2 = this.IIII(this.I);
      return Math.max(var1, var2);
   }

   private int Ill(int var1) {
      try {
         if (this.lll) {
            return this.IIII(this.IlI);
         }
      } catch (MatchException var2) {
         throw l(var2);
      }

      return Math.max(0, var1);
   }

   private void lII() {
      this.IlII = 0;
      this.llI = 0;
      this.lIl = 0;
      this.III = 0L;
      this.IIIl = 0L;
      this.ll = false;
      this.I = 0.0;
      this.IlI = 0.0;
      this.lll = false;
      this.Il = 0L;
   }

   private static void lIl() {
      int var0 = -2095443823;
      IIl[0] = III(IlIl(IllI(1527918040, var0 ^ 318624927), IllI(1527918041, var0 ^ -1813541112)).toCharArray(), 77643L, IllI(1527918046, var0 ^ -1894700840));
      IIl[1] = III(IlIl(IllI(1527918047, var0 ^ -1623760771), IllI(1527918044, var0 ^ -577070129)).toCharArray(), 47542L, IllI(1527918045, var0 ^ 481639432));
      IIl[2] = III(IlIl(IllI(1527918034, var0 ^ -402728660), IllI(1527918035, var0 ^ -1224019307)).toCharArray(), 34926L, IllI(1527918032, var0 ^ 1269674127));
      IIl[3] = III(IlIl(IllI(1527918033, var0 ^ 1849863277), IllI(1527918038, var0 ^ 169750367)).toCharArray(), 51758L, IllI(1527918039, var0 ^ 1162417710));
      IIl[4] = III(IlIl(IllI(1527918036, var0 ^ 1043371104), IllI(1527918037, var0 ^ -1723874941)).toCharArray(), 51585L, IllI(1527918026, var0 ^ 1334757151));
      IIl[5] = III(IlIl(IllI(1527918027, var0 ^ -1626498356), IllI(1527918024, var0 ^ -785053939)).toCharArray(), 24169L, IllI(1527918025, var0 ^ 1392141914));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -615099264;
      byte var14 = -1;
      short var7 = 8967;
      char[] var9 = "s\r".toCharArray();
      String var8 = "襼㮳ꏰӥ䁕䟸䝞떈剌톧ꖿꞑ빣鈹欝I熺曄쵿餔旓㊔굤負ཁ㻞ܘᣍﬓ\ue3f3쌆\udf3b屮\ud88eᠷ욅붮燿꾤䷠筄塠뭽⾩ꄙཱ\ud900쐗囨㮂捠ไ焞沴ᱤ괴\ue392竑㲴慺趐뽑\uf6e0䠦푰ⲗ뼐튷濪⇻⸕\uf68c풘ᬼ\ue443釁⦨쑁坵汐禞ㆊ\u0e77癅럘܊親伡ꚩ쒼⸩\uf090\uf5bd뻫\u0896込邅퇑⒓Ꮊ킑갯뻀\ue6aa燝ﮌ끲\ueb30ᢞ⎋蔮⺋\udb37\uf15bǺ쉱阈녩藕Țꚼ嬷㬀፮旒⺇錳␠";
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            IllI = var10;
            Illl = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            byte[] var10002 = "Zµ=\u001b\u0085#üw(t\u0087É©n\u00144\u0013«L°¥¾3bç\u0013-\u0002Å¨\u0096|Ýw\u008ajr~ÚiJÊ¼\u0001TËÿ+0\u0097Úâ\u009dü0o\u0004¹Ç-£¶9V\u0090Y£p¥\u0084É\u0094ë¼Ç,Ä\u0083é\u0005U\u0097Ëi}ì\u00995×4I*\u0081ú¶ÒÛ¢X\\¨ü2Ô<m\u008d} \u001a\u0014*:²å¤\u0090#Gýe2\u0096\u0018îðC\u009dS ¿@S \u009cÝ\u0083çÆd\f\u0090\u000f\u009bJi\u0013:@= ÞY\u009d]\u0006YÅ[µ\u00957\u0005°\u001a<\u0092þ<ýïß,\u0083ï7Õ]\u0092\u0001AéÃ\\?AäU\"MCZ\u0089\u0019:ñ÷ÿ¤QéB\u0010F×\u0016 Ñª\u008e=±^µ\tRÁ\"n.\u0007Àc%C04VL>ôt@¹£ªE¿\u0015\u008bëîÞs&åãu\u0083ô1\u0007\u0084\r\u009c£\"ãå°>xÝ¶h×A\u000eT\u0091Ï\"\u000b¿9>ÞØI\u000fI61\u0017À);-ç¡\u0094\u009a\u0091Ù\u0092Ââ\u0082¸\"Ó\u0094ð\u008f\u009ct\u0092#\u0094«\u0001á0 ZÂ·Næa,sÍh#ðûÚV!Å³Ñ\u00978»ô]pW\u001eoc×±¦îé¨?íy\u009b\u007f>°úbD^aã/ª¶ÒéÐÄ\fpL%x7\u000b·ì]cN§¶Ê\u0085¡\u0081¹*rÓþK\u0011\u0088\u0080ºÊ.Ñã¹õ\u000b?\u0014¨\u0099±È4ÁãRGlÜÍ¤Þ\u0089|¨*Æé\u0094ôGd\u0086\f¬EÙûöE¼\u0083£\u0086\u0093øê\u000fvDMó\u001b»KTÛù-{\u0098g]Ýiâ\u0002ùz\u0092W\beît\u0091\u0086\u0086VYB¹\u0000\u0007ÊÀQÈ¦o\t,ã\u0001ôÔv\u008b\u0081\u0004\u0087Êîïj[bk´\u009f\u0085(îlÎO6úZíµ\u0000s\rhÞï´n ý\u009eFwI\u0086Cý\u0004\u009e¸ÿ9¿¨ß\u0086!1<.Ñ\u0084¬å\u0086a\u0085xZÖYòë3Ãk%¨ä\u0093\u008a\u0081\u0086®'aëpýy³\u008c\n¶\u0019ç\t\u0006¤ß¡\u0017jëú\u0089\u0099n z(\u0082¦D÷L_ZøsÚ\u001a-àÆ÷ÌÕ\f|\u0099\u0010l¼ý_®äâÖ}®´@ê\u0013@\u0099=ù\u0019»ÐÞ×ý\u0003-#d ~íV\u0006ªZ=\u0000(P\u008c\u000b§ßè\u009e¬-.\u0000äé\u0005(\u008f¬G\bOkÐÖCÍ\u000f_Z\u0005lA\u0082p\u0094\u0095gÌÖ\u000eçX\u0086ÕpC/Ó9\u0081áÍÉ\u0095ÆÁ\u0089{[e\u0098)÷\u0088\u009cÆ\u0001=\u001c\u0004(åÔ&\f\u009c#\bp¶O¼¥Bòg Í\u009aFý?^}Ë®\u0012Ú®\u000f\u0006Íb\bLî¯ïÅ²#\u0016F8o¹\u001a\u0082û#Ê\u0082JlXné\u009fþß2í%\u001b\u0084\u001e¬å|ÕvÞ\u0013=\u0087D\u0017ò\u00adÝ\u0090;fo¶S{4è(\\Õm2\u0098YA\u0010¿(]\u0098GæD@í\tGYÙ¶wÜxgZXy\\¡«É\u0093 4Ø¨êúÈ¹øèÏÃ!¾\u0002p\u000b\u001f\u0092ü<tlXÊ\u001dv³\u008cÁ{\u0083Ý9Z\u008d\u0088\"\u0086\u008d+\u001eøA\u008agöÃ.iÈxÍ<;Âñúsé·\u00008ý/o|ZÐE.·³«Þ\u001dÎaóòÂÈÿ¢ ØïØÒ°åÅµãØC*D\u001c®Þ\u0091\u0006,@!\u009a\u00ad¼?8O\u0082À\u0000¢LÐÅ>\n0\u009f\u0089W\u0085\u008f]8SV\u0080ô\u0098l%ìä²¾ßa\u008fÊ`\u008f$5õÇÍe¡\u0003\u0019blYb\u0017\u000eÒ¤ðÅ¾½î\u0015LµtEÏw\f¢Æ2\r\u001eî\u0099_h-~\fz\u0081_×\u009fJ\u0003ò;âl\ryßB³\u001c!\u0090F\u0006\u008foÆö\u0019\u0096KËû\u000b$`^\u0085»þl\u0091ü?\u0090wëâá\u009c¤°\u0088\f¸\u0083\u009d\u0002EµÚ\u001c\t\u0093u\tÉê¹}7«F\rÉT(æ\"æiv\rá)\u0017è\u0096\u0081_Mä\u0014fKqMeÁ94P\u0083é¡¯\u0012ÚmF \u0082\u001f\u0014å^s´K\u0004\np×¦Bl\u0001\u0099ZI¸f§¢&"
               .getBytes("ISO-8859-1");
            IlIl = new int[293];

            int var55;
            do {
               IlIl[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 494670097;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var5 = new String[IllI(1527918030, var18 ^ 928073223)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = Illl(1510554921, var18 ^ 1184633352)).length();
            int var1 = IllI(1527918031, var18 ^ 522851452);
            int var20 = -1;

            label102:
            while (true) {
               var22 = IllI(1527918028, var18 ^ -1242366831);
               String var27 = var2.substring(++var20, var20 + var1);
               byte var39 = -1;

               while (true) {
                  label97: {
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
                           break label97;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % IllI(1527918016, var18 ^ 1588265066)) {
                           case 0 -> IllI(1527918017, var18 ^ -1025730221);
                           case 1 -> IllI(1527918022, var18 ^ 1484017686);
                           case 2 -> IllI(1527918023, var18 ^ -219811223);
                           case 3 -> IllI(1527918020, var18 ^ 133438271);
                           case 4 -> IllI(1527918021, var18 ^ -1942555112);
                           case 5 -> IllI(1527918074, var18 ^ 837159619);
                           default -> IllI(1527918075, var18 ^ 828778764);
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
                           lII = var5;
                           IIll = new String[IllI(1527918019, var18 ^ -902119497)];
                           IIl = new String[IllI(1527918072, var18 ^ -517911748)];
                           lIl();
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var62;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label102;
                        }

                        var4 = (var2 = Illl(1510554920, var18 ^ -348035389)).length();
                        var1 = IllI(1527918029, var18 ^ -482591843);
                        var20 = -1;
                  }

                  var22 = IllI(1527918018, var18 ^ -1184567796);
                  var27 = var2.substring(++var20, var20 + var1);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 198;
                  case 1 -> 53;
                  case 2 -> 238;
                  case 3 -> 232;
                  case 4 -> 86;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public int llI() {
      return this.lIl;
   }

   private static int IllI(int var0, int var1) {
      int var2 = IlIl[var0 ^ 1527918042] ^ var1 ^ var0;
      var2 -= 15023;
      var2 -= 17116;
      var2 ^= 39851;
      var2 += 49675;
      var2 -= 19152;
      var2 += 29240;
      var2 ^= 6349;
      var2 += 45363;
      return var2 ^ 44678;
   }

   private boolean lll() {
      try {
         if (this.Ill.IllI() == IIlIIII.III) {
            return true;
         }
      } catch (MatchException var1) {
         throw l(var1);
      }

      return false;
   }

   private int IIII(double var1) {
      return (int)Math.round(Math.max(0.0, Math.min(1000.0, var1)));
   }

   public boolean IIIl() {
      return this.ll;
   }

   @Override
   public void IlIlI(class_1297 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/Ill.Ill Lk74/x/IllIII;
      // 04: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 07: getstatic k74/x/IIlIIII.Il Lk74/x/IIlIIII;
      // 0a: if_acmpne 1b
      // 0d: aload 1
      // 0e: instanceof net/minecraft/class_1309
      // 11: ifne 20
      // 14: goto 1b
      // 17: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a: athrow
      // 1b: return
      // 1c: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 23: astore 2
      // 24: aload 2
      // 25: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 28: ifnull 39
      // 2b: aload 2
      // 2c: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 2f: ifnonnull 3e
      // 32: goto 39
      // 35: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 38: athrow
      // 39: return
      // 3a: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3d: athrow
      // 3e: bipush 0
      // 3f: aload 0
      // 40: getfield k74/x/Ill.IIlI Lk74/x/IlIIl;
      // 43: aload 2
      // 44: invokevirtual k74/x/IlIIl.IlIl (Lnet/minecraft/class_310;)I
      // 47: invokestatic java/lang/Math.max (II)I
      // 4a: istore 3
      // 4b: iload 3
      // 4c: ifle 5c
      // 4f: aload 0
      // 50: iload 3
      // 51: i2d
      // 52: putfield k74/x/Ill.I D
      // 55: goto 5c
      // 58: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5b: athrow
      // 5c: return
   }

   public Ill(IlIIl var1) {
      super(IlIIllIII.Ill(IIl[3]), lllIIlIl.IlI, IlIIllIII.Ill(IIl[2]));
      this.Ill = this.IllIIll(new IllIII<>(IlIIllIII.Ill(IIl[5]), IIlIIII.class, IIlIIII.III));
      this.II = this.IllIIll(new IIlIII(IlIIllIII.Ill(IIl[4]), 150.0, 0.0, 1000.0, 5.0).IlII(IlIIllIII.lI(IIl[1])));
      this.IIlI = var1;
      this.II.lIlI(this::lll);
   }

   private String IIlI(double var1) {
      int var10000 = (int)Math.round(var1);
      String var4 = IlIIllIII.lI(IIl[1]);
      int var3 = var10000;
      return var3 + var4;
   }

   @Override
   public void IIlIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 003: astore 1
      // 004: aload 1
      // 005: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 008: ifnull 027
      // 00b: aload 1
      // 00c: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 00f: ifnull 027
      // 012: goto 019
      // 015: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 018: athrow
      // 019: aload 1
      // 01a: invokevirtual net/minecraft/class_310.method_1562 ()Lnet/minecraft/class_634;
      // 01d: ifnonnull 030
      // 020: goto 027
      // 023: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 026: athrow
      // 027: aload 0
      // 028: invokevirtual k74/x/Ill.IIll ()V
      // 02b: return
      // 02c: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 02f: athrow
      // 030: aload 0
      // 031: getfield k74/x/Ill.IIlI Lk74/x/IlIIl;
      // 034: aload 1
      // 035: ldc2_w 4.0
      // 038: invokevirtual k74/x/IlIIl.lIl (Lnet/minecraft/class_310;D)Z
      // 03b: ifne 047
      // 03e: aload 0
      // 03f: invokevirtual k74/x/Ill.IIll ()V
      // 042: return
      // 043: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 046: athrow
      // 047: bipush 0
      // 048: aload 0
      // 049: getfield k74/x/Ill.IIlI Lk74/x/IlIIl;
      // 04c: aload 1
      // 04d: invokevirtual k74/x/IlIIl.lI (Lnet/minecraft/class_310;)I
      // 050: invokestatic java/lang/Math.max (II)I
      // 053: istore 2
      // 054: bipush 0
      // 055: aload 0
      // 056: getfield k74/x/Ill.IIlI Lk74/x/IlIIl;
      // 059: aload 1
      // 05a: invokevirtual k74/x/IlIIl.IlIl (Lnet/minecraft/class_310;)I
      // 05d: invokestatic java/lang/Math.max (II)I
      // 060: istore 3
      // 061: aload 0
      // 062: iload 2
      // 063: invokevirtual k74/x/Ill.ll (I)V
      // 066: aload 0
      // 067: aload 0
      // 068: iload 2
      // 069: iload 3
      // 06a: invokevirtual k74/x/Ill.IlII (II)D
      // 06d: putfield k74/x/Ill.I D
      // 070: aload 0
      // 071: iload 2
      // 072: invokevirtual k74/x/Ill.Ill (I)I
      // 075: istore 4
      // 077: aload 0
      // 078: iload 4
      // 07a: invokevirtual k74/x/Ill.IIl (I)I
      // 07d: istore 5
      // 07f: lconst_0
      // 080: iload 5
      // 082: iload 4
      // 084: isub
      // 085: i2l
      // 086: invokestatic java/lang/Math.max (JJ)J
      // 089: lstore 6
      // 08b: lconst_0
      // 08c: lstore 8
      // 08e: lload 6
      // 090: lstore 10
      // 092: lload 6
      // 094: lconst_0
      // 095: lcmp
      // 096: ifle 0a1
      // 099: bipush 1
      // 09a: goto 0a2
      // 09d: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a0: athrow
      // 0a1: bipush 0
      // 0a2: istore 12
      // 0a4: aload 0
      // 0a5: getfield k74/x/Ill.III J
      // 0a8: lload 8
      // 0aa: lcmp
      // 0ab: ifne 0cf
      // 0ae: aload 0
      // 0af: getfield k74/x/Ill.IIIl J
      // 0b2: lload 10
      // 0b4: lcmp
      // 0b5: ifne 0cf
      // 0b8: goto 0bf
      // 0bb: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0be: athrow
      // 0bf: aload 0
      // 0c0: getfield k74/x/Ill.ll Z
      // 0c3: iload 12
      // 0c5: if_icmpeq 0d7
      // 0c8: goto 0cf
      // 0cb: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ce: athrow
      // 0cf: bipush 1
      // 0d0: goto 0d8
      // 0d3: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d6: athrow
      // 0d7: bipush 0
      // 0d8: istore 13
      // 0da: aload 0
      // 0db: iload 2
      // 0dc: putfield k74/x/Ill.IlII I
      // 0df: aload 0
      // 0e0: iload 3
      // 0e1: putfield k74/x/Ill.llI I
      // 0e4: aload 0
      // 0e5: iload 5
      // 0e7: putfield k74/x/Ill.lIl I
      // 0ea: aload 0
      // 0eb: lload 8
      // 0ed: putfield k74/x/Ill.III J
      // 0f0: aload 0
      // 0f1: lload 10
      // 0f3: putfield k74/x/Ill.IIIl J
      // 0f6: aload 0
      // 0f7: iload 12
      // 0f9: putfield k74/x/Ill.ll Z
      // 0fc: aload 0
      // 0fd: lload 6
      // 0ff: putfield k74/x/Ill.Il J
      // 102: iload 13
      // 104: ifeq 111
      // 107: invokestatic k74/x/IIlIIlIl.lIIlI ()V
      // 10a: goto 111
      // 10d: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 110: athrow
      // 111: return
   }

   private void IIll() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/Ill.ll Z
      // 04: ifne 27
      // 07: aload 0
      // 08: getfield k74/x/Ill.III J
      // 0b: lconst_0
      // 0c: lcmp
      // 0d: ifne 27
      // 10: goto 17
      // 13: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16: athrow
      // 17: aload 0
      // 18: getfield k74/x/Ill.IIIl J
      // 1b: lconst_0
      // 1c: lcmp
      // 1d: ifeq 2f
      // 20: goto 27
      // 23: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: bipush 1
      // 28: goto 30
      // 2b: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2e: athrow
      // 2f: bipush 0
      // 30: istore 1
      // 31: aload 0
      // 32: invokevirtual k74/x/Ill.lII ()V
      // 35: iload 1
      // 36: ifeq 43
      // 39: invokestatic k74/x/IIlIIlIl.lIIlI ()V
      // 3c: goto 43
      // 3f: invokestatic k74/x/Ill.l (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 42: athrow
      // 43: return
   }

   private double IlII(int var1, int var2) {
      try {
         switch ((IIlIIII)this.Ill.IllI()) {
            case Il:
               return this.IIII(this.II.IllI());
            case III:
               break;
            default:
               throw new MatchException(null, null);
         }
      } catch (MatchException var4) {
         throw l(var4);
      }

      try {
         if (var2 > 0) {
            return var2;
         }
      } catch (MatchException var3) {
         throw l(var3);
      }

      return Math.max(var1, this.Ill(var1));
   }

   private static String IlIl(int var0, int var1) {
      int var9 = -2127785262;
      int var2 = (var0 ^ IllI(1527918073, var9 ^ 875552438)) & IllI(1527918078, var9 ^ 1926590265);
      if (IIll[var2] == null) {
         char[] var3 = lII[var2].toCharArray();

         int var4 = switch (var3[0] & IllI(1527918079, var9 ^ 2021747676)) {
            case 0 -> IllI(1527918076, var9 ^ 1629558336);
            case 1 -> IllI(1527918077, var9 ^ 1635324127);
            case 2 -> IllI(1527918066, var9 ^ -1383379252);
            case 3 -> IllI(1527918067, var9 ^ 578869733);
            case 4 -> IllI(1527918064, var9 ^ 71408656);
            case 5 -> 5;
            case 6 -> IllI(1527918065, var9 ^ 339715088);
            case 7 -> IllI(1527918070, var9 ^ -303965872);
            case 8 -> IllI(1527918071, var9 ^ 2035659737);
            case 9 -> IllI(1527918068, var9 ^ 134066146);
            case 10 -> IllI(1527918069, var9 ^ 452003876);
            case 11 -> IllI(1527918058, var9 ^ -1314567636);
            case 12 -> IllI(1527918059, var9 ^ -817631237);
            case 13 -> IllI(1527918056, var9 ^ -771858192);
            case 14 -> IllI(1527918057, var9 ^ -274044344);
            case 15 -> IllI(1527918062, var9 ^ -1842197187);
            case 16 -> IllI(1527918063, var9 ^ 1711883211);
            case 17 -> IllI(1527918060, var9 ^ -107077975);
            case 18 -> IllI(1527918061, var9 ^ 1065101355);
            case 19 -> IllI(1527918050, var9 ^ 2072790242);
            case 20 -> IllI(1527918051, var9 ^ 1954710614);
            case 21 -> IllI(1527918048, var9 ^ 2013647662);
            case 22 -> IllI(1527918049, var9 ^ 2097372863);
            case 23 -> IllI(1527918054, var9 ^ -749556325);
            case 24 -> IllI(1527918055, var9 ^ 509192310);
            case 25 -> IllI(1527918052, var9 ^ -1152892469);
            case 26 -> IllI(1527918053, var9 ^ -1129189558);
            case 27 -> IllI(1527917978, var9 ^ 442471710);
            case 28 -> IllI(1527917979, var9 ^ 113547001);
            case 29 -> IllI(1527917976, var9 ^ 1349202398);
            case 30 -> IllI(1527917977, var9 ^ 1814922340);
            case 31 -> IllI(1527917982, var9 ^ 855853560);
            case 32 -> IllI(1527917983, var9 ^ -429653480);
            case 33 -> IllI(1527917980, var9 ^ 1904900617);
            case 34 -> IllI(1527917981, var9 ^ -124433542);
            case 35 -> IllI(1527917970, var9 ^ -551689145);
            case 36 -> IllI(1527917971, var9 ^ -1452943085);
            case 37 -> IllI(1527917968, var9 ^ -633418859);
            case 38 -> IllI(1527917969, var9 ^ -349666451);
            case 39 -> IllI(1527917974, var9 ^ -1530338892);
            case 40 -> IllI(1527917975, var9 ^ -1407759674);
            case 41 -> IllI(1527917972, var9 ^ 144445828);
            case 42 -> IllI(1527917973, var9 ^ -1879921394);
            case 43 -> IllI(1527917962, var9 ^ 349144598);
            case 44 -> IllI(1527917963, var9 ^ 458010851);
            case 45 -> IllI(1527917960, var9 ^ 1855819441);
            case 46 -> IllI(1527917961, var9 ^ -383028330);
            case 47 -> IllI(1527917966, var9 ^ -857669494);
            case 48 -> IllI(1527917967, var9 ^ 651372844);
            case 49 -> IllI(1527917964, var9 ^ -1994742397);
            case 50 -> IllI(1527917965, var9 ^ -1870422566);
            case 51 -> IllI(1527917954, var9 ^ -1547471410);
            case 52 -> IllI(1527917955, var9 ^ -1025634456);
            case 53 -> IllI(1527917952, var9 ^ 1499423890);
            case 54 -> IllI(1527917953, var9 ^ -1905354150);
            case 55 -> IllI(1527917958, var9 ^ -55573516);
            case 56 -> IllI(1527917959, var9 ^ 499402718);
            case 57 -> IllI(1527917956, var9 ^ -1890570529);
            case 58 -> IllI(1527917957, var9 ^ 1981531492);
            case 59 -> IllI(1527918010, var9 ^ -1122111144);
            case 60 -> IllI(1527918011, var9 ^ 315529398);
            case 61 -> IllI(1527918008, var9 ^ 1940781309);
            case 62 -> IllI(1527918009, var9 ^ -2106169883);
            case 63 -> IllI(1527918014, var9 ^ -620380604);
            case 64 -> IllI(1527918015, var9 ^ 128508922);
            case 65 -> IllI(1527918012, var9 ^ -1988868236);
            case 66 -> IllI(1527918013, var9 ^ -605156240);
            case 67 -> IllI(1527918002, var9 ^ -462301371);
            case 68 -> 1;
            case 69 -> IllI(1527918003, var9 ^ -1312758920);
            case 70 -> IllI(1527918000, var9 ^ -27924653);
            case 71 -> IllI(1527918001, var9 ^ 2144914717);
            case 72 -> IllI(1527918006, var9 ^ -1795583284);
            case 73 -> IllI(1527918007, var9 ^ -822478943);
            case 74 -> IllI(1527918004, var9 ^ -1690642244);
            case 75 -> IllI(1527918005, var9 ^ -760019290);
            case 76 -> IllI(1527917994, var9 ^ 1968132328);
            case 77 -> IllI(1527917995, var9 ^ 1944621196);
            case 78 -> IllI(1527917992, var9 ^ 365422742);
            case 79 -> IllI(1527917993, var9 ^ 1700864712);
            case 80 -> IllI(1527917998, var9 ^ 977613209);
            case 81 -> IllI(1527917999, var9 ^ 1874072898);
            case 82 -> IllI(1527917996, var9 ^ 1278080271);
            case 83 -> IllI(1527917997, var9 ^ 1860514075);
            case 84 -> IllI(1527917986, var9 ^ 951826807);
            case 85 -> IllI(1527917987, var9 ^ 1769270590);
            case 86 -> IllI(1527917984, var9 ^ 831563778);
            case 87 -> IllI(1527917985, var9 ^ -865598157);
            case 88 -> IllI(1527917990, var9 ^ -1179071355);
            case 89 -> IllI(1527917991, var9 ^ -699195072);
            case 90 -> IllI(1527917988, var9 ^ 1524105206);
            case 91 -> IllI(1527917989, var9 ^ -1114331797);
            case 92 -> IllI(1527917914, var9 ^ -151829070);
            case 93 -> IllI(1527917915, var9 ^ 1649540847);
            case 94 -> IllI(1527917912, var9 ^ 1269900155);
            case 95 -> IllI(1527917913, var9 ^ -687333674);
            case 96 -> IllI(1527917918, var9 ^ -987613891);
            case 97 -> IllI(1527917919, var9 ^ 1899639807);
            case 98 -> IllI(1527917916, var9 ^ 1008913337);
            case 99 -> IllI(1527917917, var9 ^ 17029195);
            case 100 -> IllI(1527917906, var9 ^ -1096990116);
            case 101 -> IllI(1527917907, var9 ^ 376304796);
            case 102 -> IllI(1527917904, var9 ^ -583396668);
            case 103 -> IllI(1527917905, var9 ^ 1088855363);
            case 104 -> IllI(1527917910, var9 ^ -900237203);
            case 105 -> IllI(1527917911, var9 ^ 1402592175);
            case 106 -> IllI(1527917908, var9 ^ -1422472556);
            case 107 -> IllI(1527917909, var9 ^ -1768222040);
            case 108 -> IllI(1527917898, var9 ^ 1212232212);
            case 109 -> IllI(1527917899, var9 ^ -1263075893);
            case 110 -> IllI(1527917896, var9 ^ -541766393);
            case 111 -> IllI(1527917897, var9 ^ -417506084);
            case 112 -> IllI(1527917902, var9 ^ -750337096);
            case 113 -> IllI(1527917903, var9 ^ 1453066586);
            case 114 -> IllI(1527917900, var9 ^ -1172697283);
            case 115 -> IllI(1527917901, var9 ^ 1961044692);
            case 116 -> IllI(1527917890, var9 ^ 1264996744);
            case 117 -> IllI(1527917891, var9 ^ -663045095);
            case 118 -> IllI(1527917888, var9 ^ -307218629);
            case 119 -> 0;
            case 120 -> IllI(1527917889, var9 ^ 684783416);
            case 121 -> IllI(1527917894, var9 ^ 1729277651);
            case 122 -> IllI(1527917895, var9 ^ -289282630);
            case 123 -> IllI(1527917892, var9 ^ 2018924766);
            case 124 -> IllI(1527917893, var9 ^ -1585345960);
            case 125 -> IllI(1527917946, var9 ^ -2090029327);
            case 126 -> IllI(1527917947, var9 ^ -977312040);
            case 127 -> IllI(1527917944, var9 ^ 1553731050);
            case 128 -> IllI(1527917945, var9 ^ 1857741212);
            case 129 -> IllI(1527917950, var9 ^ 96232000);
            case 130 -> IllI(1527917951, var9 ^ -1263020143);
            case 131 -> IllI(1527917948, var9 ^ -803021673);
            case 132 -> IllI(1527917949, var9 ^ 381457661);
            case 133 -> IllI(1527917938, var9 ^ 1033159783);
            case 134 -> IllI(1527917939, var9 ^ 2142518324);
            case 135 -> IllI(1527917936, var9 ^ -395693891);
            case 136 -> IllI(1527917937, var9 ^ 937627653);
            case 137 -> IllI(1527917942, var9 ^ 1425928462);
            case 138 -> IllI(1527917943, var9 ^ -1406587649);
            case 139 -> IllI(1527917940, var9 ^ -290286582);
            case 140 -> IllI(1527917941, var9 ^ -1100399754);
            case 141 -> IllI(1527917930, var9 ^ 393169292);
            case 142 -> IllI(1527917931, var9 ^ -646872499);
            case 143 -> IllI(1527917928, var9 ^ -25312531);
            case 144 -> IllI(1527917929, var9 ^ 1675225119);
            case 145 -> IllI(1527917934, var9 ^ -818614354);
            case 146 -> IllI(1527917935, var9 ^ 964777761);
            case 147 -> IllI(1527917932, var9 ^ 274309017);
            case 148 -> IllI(1527917933, var9 ^ 874539232);
            case 149 -> IllI(1527917922, var9 ^ 1208615943);
            case 150 -> IllI(1527917923, var9 ^ -1644251010);
            case 151 -> IllI(1527917920, var9 ^ 410118491);
            case 152 -> IllI(1527917921, var9 ^ -981258703);
            case 153 -> IllI(1527917926, var9 ^ -216898939);
            case 154 -> IllI(1527917927, var9 ^ -1766623493);
            case 155 -> IllI(1527917924, var9 ^ 1521747742);
            case 156 -> IllI(1527917925, var9 ^ -1756131716);
            case 157 -> IllI(1527917850, var9 ^ 464139557);
            case 158 -> IllI(1527917851, var9 ^ 1459972486);
            case 159 -> IllI(1527917848, var9 ^ -1012956918);
            case 160 -> IllI(1527917849, var9 ^ 1926245231);
            case 161 -> IllI(1527917854, var9 ^ -786199043);
            case 162 -> IllI(1527917855, var9 ^ 173109119);
            case 163 -> IllI(1527917852, var9 ^ -1130177284);
            case 164 -> IllI(1527917853, var9 ^ 1147747704);
            case 165 -> IllI(1527917842, var9 ^ 729926857);
            case 166 -> IllI(1527917843, var9 ^ 793698000);
            case 167 -> IllI(1527917840, var9 ^ -1467535917);
            case 168 -> IllI(1527917841, var9 ^ -1896937381);
            case 169 -> IllI(1527917846, var9 ^ -795595583);
            case 170 -> IllI(1527917847, var9 ^ 1435423701);
            case 171 -> IllI(1527917844, var9 ^ 2041378132);
            case 172 -> IllI(1527917845, var9 ^ 1696861190);
            case 173 -> IllI(1527917834, var9 ^ 2096930345);
            case 174 -> IllI(1527917835, var9 ^ 2145757872);
            case 175 -> IllI(1527917832, var9 ^ 1331694413);
            case 176 -> IllI(1527917833, var9 ^ 1659111731);
            case 177 -> IllI(1527917838, var9 ^ -1726512424);
            case 178 -> IllI(1527917839, var9 ^ -1735873657);
            case 179 -> IllI(1527917836, var9 ^ -767116394);
            case 180 -> 4;
            case 181 -> IllI(1527917837, var9 ^ -1068202943);
            case 182 -> IllI(1527917826, var9 ^ 419579915);
            case 183 -> IllI(1527917827, var9 ^ 866376022);
            case 184 -> IllI(1527917824, var9 ^ 80223240);
            case 185 -> IllI(1527917825, var9 ^ -224314108);
            case 186 -> IllI(1527917830, var9 ^ -1266864078);
            case 187 -> IllI(1527917831, var9 ^ -444264102);
            case 188 -> IllI(1527917828, var9 ^ -1331759389);
            case 189 -> IllI(1527917829, var9 ^ 329430005);
            case 190 -> IllI(1527917882, var9 ^ -1294222057);
            case 191 -> IllI(1527917883, var9 ^ 383105047);
            case 192 -> IllI(1527917880, var9 ^ -176131981);
            case 193 -> IllI(1527917881, var9 ^ -918159155);
            case 194 -> IllI(1527917886, var9 ^ -1883486045);
            case 195 -> IllI(1527917887, var9 ^ 399707990);
            case 196 -> IllI(1527917884, var9 ^ -386310469);
            case 197 -> IllI(1527917885, var9 ^ -1961388616);
            case 198 -> IllI(1527917874, var9 ^ -153254918);
            case 199 -> IllI(1527917875, var9 ^ -93024316);
            case 200 -> IllI(1527917872, var9 ^ 409248775);
            case 201 -> IllI(1527917873, var9 ^ -368274125);
            case 202 -> IllI(1527917878, var9 ^ -1923110855);
            case 203 -> IllI(1527917879, var9 ^ 318265156);
            case 204 -> IllI(1527917876, var9 ^ -433238536);
            case 205 -> IllI(1527917877, var9 ^ 2023615064);
            case 206 -> IllI(1527917866, var9 ^ -2071759895);
            case 207 -> IllI(1527917867, var9 ^ -1166259375);
            case 208 -> IllI(1527917864, var9 ^ 1953281371);
            case 209 -> IllI(1527917865, var9 ^ 848090172);
            case 210 -> IllI(1527917870, var9 ^ 1866071830);
            case 211 -> IllI(1527917871, var9 ^ 15670535);
            case 212 -> IllI(1527917868, var9 ^ -870045777);
            case 213 -> IllI(1527917869, var9 ^ -732380591);
            case 214 -> IllI(1527917858, var9 ^ -404896699);
            case 215 -> IllI(1527917859, var9 ^ 1479758954);
            case 216 -> IllI(1527917856, var9 ^ -847528354);
            case 217 -> IllI(1527917857, var9 ^ -1715514711);
            case 218 -> IllI(1527917862, var9 ^ 1424298503);
            case 219 -> IllI(1527917863, var9 ^ 913239914);
            case 220 -> IllI(1527917860, var9 ^ -50137459);
            case 221 -> IllI(1527917861, var9 ^ 770753892);
            case 222 -> IllI(1527917786, var9 ^ 2104704328);
            case 223 -> IllI(1527917787, var9 ^ -1703249844);
            case 224 -> 3;
            case 225 -> IllI(1527917784, var9 ^ 642962202);
            case 226 -> IllI(1527917785, var9 ^ 1351693360);
            case 227 -> IllI(1527917790, var9 ^ 1111299172);
            case 228 -> IllI(1527917791, var9 ^ -1477021355);
            case 229 -> IllI(1527917788, var9 ^ 56499957);
            case 230 -> IllI(1527917789, var9 ^ 1097020192);
            case 231 -> IllI(1527917778, var9 ^ 614324794);
            case 232 -> IllI(1527917779, var9 ^ 1043537183);
            case 233 -> IllI(1527917776, var9 ^ -827991032);
            case 234 -> 2;
            case 235 -> IllI(1527917777, var9 ^ -213434022);
            case 236 -> IllI(1527917782, var9 ^ 1491259370);
            case 237 -> IllI(1527917783, var9 ^ -959391138);
            case 238 -> IllI(1527917780, var9 ^ 120325733);
            case 239 -> IllI(1527917781, var9 ^ -631384387);
            case 240 -> IllI(1527917770, var9 ^ -2009839991);
            case 241 -> IllI(1527917771, var9 ^ -1155446756);
            case 242 -> IllI(1527917768, var9 ^ -1922667014);
            case 243 -> IllI(1527917769, var9 ^ -1412859709);
            case 244 -> IllI(1527917774, var9 ^ -771410072);
            case 245 -> IllI(1527917775, var9 ^ -1812299993);
            case 246 -> IllI(1527917772, var9 ^ 1821682768);
            case 247 -> IllI(1527917773, var9 ^ -556464944);
            case 248 -> IllI(1527917762, var9 ^ -644522532);
            case 249 -> IllI(1527917763, var9 ^ -1371728551);
            case 250 -> IllI(1527917760, var9 ^ -592963609);
            case 251 -> IllI(1527917761, var9 ^ 1240536267);
            case 252 -> IllI(1527917766, var9 ^ 25698689);
            case 253 -> IllI(1527917767, var9 ^ -786569857);
            case 254 -> IllI(1527917764, var9 ^ -489616365);
            default -> IllI(1527917765, var9 ^ -1163696589);
         };
         int var5 = (var1 & IllI(1527917818, var9 ^ 1724907084)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IllI(1527917819, var9 ^ 1018564049)) >>> IllI(1527917816, var9 ^ -1627511255)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IllI(1527917817, var9 ^ -1578761284);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IllI(1527917822, var9 ^ 1578887205);
            }
         }

         IIll[var2] = new String(var3).intern();
      }

      return IIll[var2];
   }
}
