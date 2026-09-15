package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1282;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class IIIIllIII extends IlIIIIIIl {
   private static final String[] IIIl;
   private static final String[] I;
   private final lllIIlII II;
   private static final Object[] IIlI;
   private final IIlIII Il;
   private final IllIII<lllIllll> lI;
   private final IIlIII ll;
   private static final String[] III;
   private boolean IIl;
   private static final int IlI = 1;
   private int Ill;
   private class_1309 lII;
   private int lIl;
   private final lllIIlII llI;
   private static final int[] IIII;
   private boolean lll;

   public boolean I(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (this.IIIIlIl() && var1 != null && var1.field_1724 != null && var1.field_1755 == null && var1.method_1569()) {
         if (this.Ill > 0) {
            this.Ill--;
         }

         boolean var3;
         var3 = false;
         label62:
         if (this.IIl) {
            class_1309 var4 = this.lII;
            this.Il();
            if (this.Ill == 0 && this.II(var1, var4) && Math.random() * 100.0 < this.ll.IllI()) {
               this.Ill = this.Il.IllI().intValue();
               if (this.lI.IllI() == lllIllll.Il) {
                  this.lll = true;
                  this.lIl = 0;
                  var3 = true;
                  if (var2 == null) {
                     break label62;
                  }
               }

               this.lll = false;
               this.lIl = 1;
               if (var2 == null) {
                  break label62;
               }
            }

            this.lll = false;
            this.lIl = 0;
         }

         if (this.lll && !var3) {
            this.lll = false;
            this.lIl = 1;
         }

         boolean var5 = this.lIl > 0;
         if (this.lIl > 0) {
            this.lIl--;
         }

         return var5;
      } else {
         this.l(var1, false);
         this.III();
         return false;
      }
   }

   private static int Ill(int var0, int var1) {
      int var2 = IIII[var0 ^ -1116394775] ^ var1 ^ var0;
      var2 += 19961;
      var2 += 30179;
      var2 ^= 19368;
      var2 += 59274;
      var2 += 8822;
      var2 ^= 52986;
      var2 -= 56367;
      return var2 - 63190;
   }

   public void l(class_310 var1, boolean var2) {
      String[] var3 = IIllllIl.IIIIl();
      if (var1 != null && var1.field_1690 != null && var1.field_1690.field_1903 != null) {
         IlIlIIII var4 = IlIlIIII.llI();
         if (var4 != null) {
            if (var2) {
               var4.ll(this, var1, var1.field_1690.field_1903, true);
               if (var3 == null) {
                  return;
               }
            }

            var4.IIII(this, var1, var1.field_1690.field_1903);
            if (var3 == null) {
               return;
            }
         }

         var1.field_1690.field_1903.method_23481(var2 || IIll.IlIllll(var1, var1.field_1690.field_1903));
      }
   }

   private boolean II(class_310 var1, class_1309 var2) {
      if (var1.field_1724 == null || !var1.field_1724.method_24828() || var1.field_1724.method_6115()) {
         return false;
      } else if (var2 == var1.field_1724) {
         return false;
      } else if (this.llI.IllI() && !(var2 instanceof class_1657)) {
         return false;
      } else {
         return !this.II.IllI() ? true : var2 != null && this.ll(var1.field_1724, var2);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -1297620998;
      String var8 = "鞳鞇霡霵韦鞑霚霼霡韚靱韱韭靴鞎霥霨霄韪霂鞩霓鞢霓韜靮靶韻鞁韡韵靇韰靫韚音霰靆音霑靻鞄韹鞄鞴鞶靮霥霗霉霂鞶霁靭韷韘靟霙霧鞷霅霞靱韪霯霏靇靿鞔靅靅霕靥靝霨霱鞱靟鞑靥霺霍靛韝霤韖靰霺鞥鞫韪霭霂靟靵霄霜霉靄鞷韩霟靠靍霳面靨鞒鞧霔靖韻霬鞒霭霡霶霛鞅需鞩靫靱韚鞤鞓韯霂韜鞞鞉鞆霃靄靪霉靇鞉靆霱韌鞾靈靎韀靀霢韏鞢靱㻆㺧㹾㹬㻟㸖㺕㺜㹫㹳㸯㻟㺮";
      byte var14 = -1;
      short var7 = 31701;
      char[] var9 = "\u0096\r".toCharArray();
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            IIIl = var10;
            IIlI = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            IIII = new int[290];
            byte[] var10002 = "\u0010øÂ\u0083áLb,:é;IÀjQ@Á¦ùÙ{ñZ«öÓ_S1\u007fA\u0001²X7\u0004×x\u0091°:C\"·çór4\u0015-\u0098@Ü¼\u0018\u001fQµë¯\u0089Sé\u0015©\u009eïéê\u0095d\u0089ý\u0003¹±\"E\u00104Ç\u009e<÷ÚºÂ;Æ·ØØ\u0088º<\t\u0017\u0006\bÅ;¢Äp©F\u001a\u0005x×9ð\u00068í\u001ai·h¨a\u0099Ýw3ÉÔØòïä\u0006ÜqÉ¡\u008cbWë\u008c\u000e '\u009c#&j\u00025\u008c¼Ø §$ä\u0012¦\u0085\u0093\bÉgPS*´X\u0013&hî`îv\u0082\u0014ós\u0095i),\u0082gh!Ù\u0006öö°ósÒhøÉãX1:\u001a\u0017â\u009ei\u0088\u009e{jÐÀ¼\u0086#\u0014 \u0083ì\u0088¼\u0007¼>q\u008dÖ¹\u0092KG&ÅÞ!\u0096w\u0098õ«\u0090\\3 \u0016¥@òè\u001e¢\rrÚ\u0018(\u0086´N\u009að\u009b·\u0003×\u0091\u008aùÀöÊÌ¼6 \u0090\u008d\u008f\u009d\u001e¼\u0089}y\u0001p\u0081.Iè[SîJ\u0099#î\t\nî0\u0085^\u0012µ¸¾½ì²ïg½\u00adK\n\u00971©\u0002t\byÝêNR6jE\u0080oÇ\u0005Ü\"¨Ó|\u0013'\u0098\u0089sO\u009d5Íaó\u0007%j\u008e\u0080\u0090Ö#GzÊ¨ñ\u0005áëî\ny©¦îuè\u0098=Fe\u0081\u0019¶\u008bî\u009fnÅ\u0081ñ \u0012ty0[\u0005³¶@\u009cÉw\u00adFÖÀ\u008a\u0097\u000e+BõqrÙ¿\u0090É\u0011Æ\u001e\u009bä£Æ\u0018VÌj\u0091Z ëH}\u0013e\u0005ïW«\u008c}²TÏ×²,\rûÞXÆcDMRñì~\u0098XÓ©ÀZìe\u0012/ö\u0097¥\u009f\u0006F\u0097÷e\u009e´º2Áø3\u001fÇTÙ|Rß²\u008e\t³\u0081!\rF\u0088\u0096a\r\u0003ï° \r\u008d>ø¥6\u0011p}¸ØL1,éÒyåom\u0018|÷\u0082\u00151nª\u0002r\u0089\u0019\u00ad\u0099ZG\u0093RçÖP>k#²¬\u008aÄ©HxWm·\u0014#\u009d/±[\u0095»\u008a¦\u008aKád58äÌ\u0006§°A^Ô73´\u009a\u008c¾D©ïñ8Z?ìÜÈDÎý\u009c;W\u0096T[æ1O\u001bOX_M{xñV@Ø¡@\u0083\u0099&I\u001a\u0004ïÕ¼¾®\u0089;Ì\\V½ÝÙ\u0001SèÛ(nè{¥\u0099Ç¦WIOü\u00ad Í}×\u001fzÊ\u00ad(»\u008bQc1dN\u000b\n5ë\u0006¶\u008dS7µ\u008aô%ß\u0089\u0006Ù}S/ßfD×«#A\u0090\u0081+8ßt\u0087æO¼Ønsä\u0097N\b\u0082«\u0001>´çt::q§ m&ÐÚáôþ\u000eÎë¼\b´£ïú;·\u0085ïúT°Ãh_Ê=Ù\u00ad\u0006ÅÂ\u009cIá'~%\u009d¿,\u0088, r\u008eS¯\u0017Õ\u0081\u008e\u0099\u0004\u0019óñE\u0016ÿ<d\u0096abëüO:F\u0007¦¥Öú{ÛÒ§K\u0098w(\u001eõ\u00858Ñ\u001b*æv]þ\u0096\u0016¢¡éA¤\u0094Já\u0010¢aSÌ}`S$8/b\bUZ\u001f¿\u0090\u0011fl¾£\u0098¸ê(OX:HÅzÊò@A§_\u0094\u0012èã¢p²\bÝWÂ:\u009f¹ó~+$_ÎÙ\u0090#+4ªO`é\u008234î±¾\u0016\u0089\u0012iëDT/|\u009e÷Ã[4\u008f\u0005mëxG\u00ad\u009f ¦ß\u008d\u0087À°R1Fy¿LßÞ\u0098\u0096¸15¶\u001dØ³äOñ\rÄ¯éhÁ\rôLÖD\\Ye\u0085ét\u0097Ë3w_Ñ±@\u0093óØ\u001eßx¨ÔºXh©î\fÅ\u0093ÜÑ¤â,ujì²\u0081\u001fFï\u009f\u0086Ìªà3ÑhÌýÊ;¾\u0081M}Ð\u0013\u000e\u0000@ï:KÒã\t*Õ¤Â\u0086\u001bÓeHªNË<ªXÎ70\u001a5VâÜ\u0098Ý\u0084ó\u008dÝÆdBÆäM®¡w\u0096\u0089\u000b\u008b\u0089\u0018÷wO©<\u007feÝ7\u0088&.\u0084M\u0016`\u0094q\u0096ùê\u009e¾\u001cÍ\u0082\u0014j\u0017a\u009b\u0002ï>|\u0010\u009e\u008b\u0005±Ú=,ÐoK&\f\u0082\u0082ïz_¶ûÄ\u0090\u009dîx[,Ú\u0013\u0002©oÕÍ"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               IIII[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1952188265;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var5 = new String[Ill(-1116394517, var18 ^ 988818053)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lII(498258364, var18 ^ 754175198)).length();
            int var1 = Ill(-1116394518, var18 ^ 1415735570);
            int var20 = -1;

            label100:
            while (true) {
               var22 = Ill(-1116394515, var18 ^ -996254379);
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
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % Ill(-1116394527, var18 ^ 775924940)) {
                           case 0 -> Ill(-1116394528, var18 ^ 774482187);
                           case 1 -> Ill(-1116394525, var18 ^ -1268035060);
                           case 2 -> Ill(-1116394526, var18 ^ 1722679283);
                           case 3 -> Ill(-1116394523, var18 ^ 8579835);
                           case 4 -> Ill(-1116394524, var18 ^ 1108682052);
                           case 5 -> Ill(-1116394521, var18 ^ 1614596433);
                           default -> Ill(-1116394522, var18 ^ -202903992);
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
                           III = var5;
                           I = new String[Ill(-1116394514, var18 ^ -1616772427)];
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

                        var4 = (var2 = lII(498258365, var18 ^ -2060922906)).length();
                        var1 = Ill(-1116394516, var18 ^ 1452437206);
                        var20 = -1;
                  }

                  var22 = Ill(-1116394513, var18 ^ 1372956062);
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
                  default -> 219;
                  case 1 -> 110;
                  case 2 -> 230;
                  case 3 -> 65;
                  case 4 -> 169;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private void Il() {
      this.IIl = false;
      this.lII = null;
   }

   public void lI(class_1282 var1) {
      if (this.IIIIlIl()) {
         this.lII = (var1 == null ? null : var1.method_5529()) instanceof class_1309 var3 ? var3 : null;
         this.IIl = true;
      }
   }

   private boolean ll(class_1657 var1, class_1309 var2) {
      double var3 = var2.method_23317() - var1.method_23317();
      double var5 = var2.method_23321() - var1.method_23321();
      if (var3 * var3 + var5 * var5 < 1.0E-6) {
         return true;
      } else {
         float var7 = (float)(Math.toDegrees(Math.atan2(var5, var3)) - 90.0);
         return Math.abs(class_3532.method_15393(var7 - var1.method_36454())) <= 90.0F;
      }
   }

   private void III() {
      this.lIl = 0;
      this.lll = false;
      this.Ill = 0;
      this.Il();
   }

   private static String IIl(int var0, int var1) {
      int var9 = -1222909627;
      int var2 = (var0 ^ Ill(-1116394775, var9 ^ -1858773227)) & Ill(-1116394776, var9 ^ -1619117422);
      if (I[var2] == null) {
         char[] var3 = III[var2].toCharArray();

         int var4 = switch (var3[0] & Ill(-1116394773, var9 ^ -1155243788)) {
            case 0 -> Ill(-1116394774, var9 ^ 1101465742);
            case 1 -> Ill(-1116394771, var9 ^ 1080795424);
            case 2 -> Ill(-1116394772, var9 ^ -96730586);
            case 3 -> Ill(-1116394769, var9 ^ 1998456458);
            case 4 -> Ill(-1116394770, var9 ^ -1330505243);
            case 5 -> Ill(-1116394783, var9 ^ 865431453);
            case 6 -> 2;
            case 7 -> Ill(-1116394784, var9 ^ 1454753885);
            case 8 -> Ill(-1116394781, var9 ^ -1148290390);
            case 9 -> Ill(-1116394782, var9 ^ 1715350100);
            case 10 -> Ill(-1116394779, var9 ^ -1797209703);
            case 11 -> Ill(-1116394780, var9 ^ 1567703160);
            case 12 -> Ill(-1116394777, var9 ^ -797396203);
            case 13 -> Ill(-1116394778, var9 ^ 144617861);
            case 14 -> Ill(-1116394759, var9 ^ 676574763);
            case 15 -> Ill(-1116394760, var9 ^ 1800944747);
            case 16 -> Ill(-1116394757, var9 ^ 2093932865);
            case 17 -> Ill(-1116394758, var9 ^ -1551349702);
            case 18 -> Ill(-1116394755, var9 ^ 1179870357);
            case 19 -> Ill(-1116394756, var9 ^ 1534564969);
            case 20 -> Ill(-1116394753, var9 ^ 1199210529);
            case 21 -> Ill(-1116394754, var9 ^ 158819465);
            case 22 -> Ill(-1116394767, var9 ^ -1765060363);
            case 23 -> Ill(-1116394768, var9 ^ -1167090542);
            case 24 -> Ill(-1116394765, var9 ^ 680215097);
            case 25 -> Ill(-1116394766, var9 ^ -115711959);
            case 26 -> Ill(-1116394763, var9 ^ -2013940536);
            case 27 -> Ill(-1116394764, var9 ^ -394645316);
            case 28 -> Ill(-1116394761, var9 ^ -531331690);
            case 29 -> 1;
            case 30 -> Ill(-1116394762, var9 ^ -1308324763);
            case 31 -> Ill(-1116394807, var9 ^ 1931656359);
            case 32 -> Ill(-1116394808, var9 ^ 1572639295);
            case 33 -> Ill(-1116394805, var9 ^ 229576497);
            case 34 -> Ill(-1116394806, var9 ^ 230946928);
            case 35 -> Ill(-1116394803, var9 ^ 502169129);
            case 36 -> Ill(-1116394804, var9 ^ -2080844596);
            case 37 -> Ill(-1116394801, var9 ^ 1500381041);
            case 38 -> Ill(-1116394802, var9 ^ 1709178751);
            case 39 -> Ill(-1116394815, var9 ^ 314937645);
            case 40 -> Ill(-1116394816, var9 ^ -778145261);
            case 41 -> Ill(-1116394813, var9 ^ -639729980);
            case 42 -> Ill(-1116394814, var9 ^ 1873655465);
            case 43 -> Ill(-1116394811, var9 ^ 64596947);
            case 44 -> Ill(-1116394812, var9 ^ 346321190);
            case 45 -> Ill(-1116394809, var9 ^ 61485135);
            case 46 -> Ill(-1116394810, var9 ^ 1489743603);
            case 47 -> Ill(-1116394791, var9 ^ 826157999);
            case 48 -> Ill(-1116394792, var9 ^ -382365369);
            case 49 -> Ill(-1116394789, var9 ^ -637771092);
            case 50 -> Ill(-1116394790, var9 ^ -1775254011);
            case 51 -> Ill(-1116394787, var9 ^ 156443446);
            case 52 -> Ill(-1116394788, var9 ^ 1359865192);
            case 53 -> Ill(-1116394785, var9 ^ -1562773272);
            case 54 -> Ill(-1116394786, var9 ^ 1833297366);
            case 55 -> Ill(-1116394799, var9 ^ 1039346147);
            case 56 -> Ill(-1116394800, var9 ^ 1467271793);
            case 57 -> Ill(-1116394797, var9 ^ -957637305);
            case 58 -> Ill(-1116394798, var9 ^ -1604636746);
            case 59 -> Ill(-1116394795, var9 ^ 1952893086);
            case 60 -> Ill(-1116394796, var9 ^ -1293070728);
            case 61 -> Ill(-1116394793, var9 ^ -1052790299);
            case 62 -> Ill(-1116394794, var9 ^ 599796387);
            case 63 -> Ill(-1116394839, var9 ^ -1712988553);
            case 64 -> Ill(-1116394840, var9 ^ -816338816);
            case 65 -> Ill(-1116394837, var9 ^ 919506842);
            case 66 -> Ill(-1116394838, var9 ^ 187996533);
            case 67 -> Ill(-1116394835, var9 ^ 1258415509);
            case 68 -> Ill(-1116394836, var9 ^ -1587686017);
            case 69 -> Ill(-1116394833, var9 ^ 483648573);
            case 70 -> Ill(-1116394834, var9 ^ -55289541);
            case 71 -> Ill(-1116394847, var9 ^ 14881208);
            case 72 -> Ill(-1116394848, var9 ^ -627132855);
            case 73 -> Ill(-1116394845, var9 ^ 418297441);
            case 74 -> Ill(-1116394846, var9 ^ -1960613786);
            case 75 -> Ill(-1116394843, var9 ^ -538972727);
            case 76 -> Ill(-1116394844, var9 ^ 1064351566);
            case 77 -> Ill(-1116394841, var9 ^ 1856693712);
            case 78 -> Ill(-1116394842, var9 ^ -892875089);
            case 79 -> 4;
            case 80 -> Ill(-1116394823, var9 ^ 684665872);
            case 81 -> Ill(-1116394824, var9 ^ -133123584);
            case 82 -> Ill(-1116394821, var9 ^ -738512314);
            case 83 -> Ill(-1116394822, var9 ^ 27434792);
            case 84 -> Ill(-1116394819, var9 ^ 1576005828);
            case 85 -> Ill(-1116394820, var9 ^ -35749986);
            case 86 -> Ill(-1116394817, var9 ^ 146675514);
            case 87 -> Ill(-1116394818, var9 ^ -1275053655);
            case 88 -> Ill(-1116394831, var9 ^ -2031602915);
            case 89 -> Ill(-1116394832, var9 ^ 22908842);
            case 90 -> Ill(-1116394829, var9 ^ -961047755);
            case 91 -> Ill(-1116394830, var9 ^ 1892202938);
            case 92 -> Ill(-1116394827, var9 ^ 1875321229);
            case 93 -> Ill(-1116394828, var9 ^ 656616929);
            case 94 -> Ill(-1116394825, var9 ^ 435166891);
            case 95 -> Ill(-1116394826, var9 ^ 13954765);
            case 96 -> Ill(-1116394871, var9 ^ 1867658912);
            case 97 -> Ill(-1116394872, var9 ^ 3995651);
            case 98 -> Ill(-1116394869, var9 ^ -172726099);
            case 99 -> Ill(-1116394870, var9 ^ -2072056152);
            case 100 -> Ill(-1116394867, var9 ^ 486813634);
            case 101 -> Ill(-1116394868, var9 ^ -954492774);
            case 102 -> Ill(-1116394865, var9 ^ 381907727);
            case 103 -> Ill(-1116394866, var9 ^ 1958488775);
            case 104 -> Ill(-1116394879, var9 ^ 1046319381);
            case 105 -> Ill(-1116394880, var9 ^ 1205060511);
            case 106 -> Ill(-1116394877, var9 ^ 571162789);
            case 107 -> Ill(-1116394878, var9 ^ 1302841735);
            case 108 -> Ill(-1116394875, var9 ^ -1591340916);
            case 109 -> Ill(-1116394876, var9 ^ -1834459664);
            case 110 -> Ill(-1116394873, var9 ^ -697903975);
            case 111 -> Ill(-1116394874, var9 ^ 865703712);
            case 112 -> Ill(-1116394855, var9 ^ 870405525);
            case 113 -> Ill(-1116394856, var9 ^ 1603641310);
            case 114 -> Ill(-1116394853, var9 ^ -981464345);
            case 115 -> 3;
            case 116 -> Ill(-1116394854, var9 ^ 1840496720);
            case 117 -> 0;
            case 118 -> Ill(-1116394851, var9 ^ 1382324274);
            case 119 -> Ill(-1116394852, var9 ^ 1839745776);
            case 120 -> Ill(-1116394849, var9 ^ 2002451782);
            case 121 -> Ill(-1116394850, var9 ^ -2020880543);
            case 122 -> Ill(-1116394863, var9 ^ -464261939);
            case 123 -> Ill(-1116394864, var9 ^ -1291018192);
            case 124 -> Ill(-1116394861, var9 ^ -1643508587);
            case 125 -> Ill(-1116394862, var9 ^ -39876831);
            case 126 -> Ill(-1116394859, var9 ^ 264563540);
            case 127 -> Ill(-1116394860, var9 ^ -1598022060);
            case 128 -> Ill(-1116394857, var9 ^ 397169944);
            case 129 -> Ill(-1116394858, var9 ^ 1853749400);
            case 130 -> Ill(-1116394903, var9 ^ 217292849);
            case 131 -> Ill(-1116394904, var9 ^ -1210308597);
            case 132 -> Ill(-1116394901, var9 ^ 957682925);
            case 133 -> Ill(-1116394902, var9 ^ -1390114062);
            case 134 -> Ill(-1116394899, var9 ^ 1688351839);
            case 135 -> Ill(-1116394900, var9 ^ -46474584);
            case 136 -> 5;
            case 137 -> Ill(-1116394897, var9 ^ -1331432856);
            case 138 -> Ill(-1116394898, var9 ^ -213630547);
            case 139 -> Ill(-1116394911, var9 ^ 412557158);
            case 140 -> Ill(-1116394912, var9 ^ -752185812);
            case 141 -> Ill(-1116394909, var9 ^ -1079608410);
            case 142 -> Ill(-1116394910, var9 ^ 759667815);
            case 143 -> Ill(-1116394907, var9 ^ -910880830);
            case 144 -> Ill(-1116394908, var9 ^ 920222487);
            case 145 -> Ill(-1116394905, var9 ^ -1367604448);
            case 146 -> Ill(-1116394906, var9 ^ 977797083);
            case 147 -> Ill(-1116394887, var9 ^ -903070718);
            case 148 -> Ill(-1116394888, var9 ^ -1188457228);
            case 149 -> Ill(-1116394885, var9 ^ 645732763);
            case 150 -> Ill(-1116394886, var9 ^ 1442474785);
            case 151 -> Ill(-1116394883, var9 ^ 457303691);
            case 152 -> Ill(-1116394884, var9 ^ 673360256);
            case 153 -> Ill(-1116394881, var9 ^ -604851126);
            case 154 -> Ill(-1116394882, var9 ^ 1233754018);
            case 155 -> Ill(-1116394895, var9 ^ 502665131);
            case 156 -> Ill(-1116394896, var9 ^ -711541114);
            case 157 -> Ill(-1116394893, var9 ^ -824830158);
            case 158 -> Ill(-1116394894, var9 ^ -562027528);
            case 159 -> Ill(-1116394891, var9 ^ 1889212472);
            case 160 -> Ill(-1116394892, var9 ^ 546167686);
            case 161 -> Ill(-1116394889, var9 ^ -1484504339);
            case 162 -> Ill(-1116394890, var9 ^ 1847125480);
            case 163 -> Ill(-1116394935, var9 ^ 793011071);
            case 164 -> Ill(-1116394936, var9 ^ -576985767);
            case 165 -> Ill(-1116394933, var9 ^ 1489767344);
            case 166 -> Ill(-1116394934, var9 ^ 1524971127);
            case 167 -> Ill(-1116394931, var9 ^ -93798105);
            case 168 -> Ill(-1116394932, var9 ^ 664408107);
            case 169 -> Ill(-1116394929, var9 ^ 2103474402);
            case 170 -> Ill(-1116394930, var9 ^ -65386563);
            case 171 -> Ill(-1116394943, var9 ^ 1264611465);
            case 172 -> Ill(-1116394944, var9 ^ 178010901);
            case 173 -> Ill(-1116394941, var9 ^ -444378209);
            case 174 -> Ill(-1116394942, var9 ^ -1272553935);
            case 175 -> Ill(-1116394939, var9 ^ 211709728);
            case 176 -> Ill(-1116394940, var9 ^ 188317376);
            case 177 -> Ill(-1116394937, var9 ^ 147554689);
            case 178 -> Ill(-1116394938, var9 ^ -756906481);
            case 179 -> Ill(-1116394919, var9 ^ -988089777);
            case 180 -> Ill(-1116394920, var9 ^ -1067591173);
            case 181 -> Ill(-1116394917, var9 ^ -1189991271);
            case 182 -> Ill(-1116394918, var9 ^ 1736631397);
            case 183 -> Ill(-1116394915, var9 ^ -272712204);
            case 184 -> Ill(-1116394916, var9 ^ -809117106);
            case 185 -> Ill(-1116394913, var9 ^ -2131497922);
            case 186 -> Ill(-1116394914, var9 ^ -168337034);
            case 187 -> Ill(-1116394927, var9 ^ 644691298);
            case 188 -> Ill(-1116394928, var9 ^ 1360509065);
            case 189 -> Ill(-1116394925, var9 ^ 2143524738);
            case 190 -> Ill(-1116394926, var9 ^ 1036381287);
            case 191 -> Ill(-1116394923, var9 ^ 1849123671);
            case 192 -> Ill(-1116394924, var9 ^ 69378758);
            case 193 -> Ill(-1116394921, var9 ^ 823013551);
            case 194 -> Ill(-1116394922, var9 ^ 1274052915);
            case 195 -> Ill(-1116394967, var9 ^ -2029479314);
            case 196 -> Ill(-1116394968, var9 ^ -936607791);
            case 197 -> Ill(-1116394965, var9 ^ -1538201856);
            case 198 -> Ill(-1116394966, var9 ^ 165804175);
            case 199 -> Ill(-1116394963, var9 ^ 262076387);
            case 200 -> Ill(-1116394964, var9 ^ 1414321734);
            case 201 -> Ill(-1116394961, var9 ^ -2049660090);
            case 202 -> Ill(-1116394962, var9 ^ -992237674);
            case 203 -> Ill(-1116394975, var9 ^ -447006322);
            case 204 -> Ill(-1116394976, var9 ^ 1781602246);
            case 205 -> Ill(-1116394973, var9 ^ -942997882);
            case 206 -> Ill(-1116394974, var9 ^ 1463231408);
            case 207 -> Ill(-1116394971, var9 ^ 1399460621);
            case 208 -> Ill(-1116394972, var9 ^ -152746436);
            case 209 -> Ill(-1116394969, var9 ^ 83200012);
            case 210 -> Ill(-1116394970, var9 ^ -1423233499);
            case 211 -> Ill(-1116394951, var9 ^ 2136690388);
            case 212 -> Ill(-1116394952, var9 ^ 539236676);
            case 213 -> Ill(-1116394949, var9 ^ 361216308);
            case 214 -> Ill(-1116394950, var9 ^ 598477597);
            case 215 -> Ill(-1116394947, var9 ^ -55768536);
            case 216 -> Ill(-1116394948, var9 ^ -1176356148);
            case 217 -> Ill(-1116394945, var9 ^ -728283459);
            case 218 -> Ill(-1116394946, var9 ^ 299646829);
            case 219 -> Ill(-1116394959, var9 ^ 1064222729);
            case 220 -> Ill(-1116394960, var9 ^ 1810175758);
            case 221 -> Ill(-1116394957, var9 ^ -1148871296);
            case 222 -> Ill(-1116394958, var9 ^ 1262426118);
            case 223 -> Ill(-1116394955, var9 ^ 647154987);
            case 224 -> Ill(-1116394956, var9 ^ 1764686525);
            case 225 -> Ill(-1116394953, var9 ^ 868582668);
            case 226 -> Ill(-1116394954, var9 ^ 1140311967);
            case 227 -> Ill(-1116394999, var9 ^ 1924363103);
            case 228 -> Ill(-1116395000, var9 ^ -570195262);
            case 229 -> Ill(-1116394997, var9 ^ -1561957149);
            case 230 -> Ill(-1116394998, var9 ^ -827477688);
            case 231 -> Ill(-1116394995, var9 ^ -1292257767);
            case 232 -> Ill(-1116394996, var9 ^ 1071370296);
            case 233 -> Ill(-1116394993, var9 ^ -400155616);
            case 234 -> Ill(-1116394994, var9 ^ -1364080984);
            case 235 -> Ill(-1116395007, var9 ^ 1117154341);
            case 236 -> Ill(-1116395008, var9 ^ -2069843029);
            case 237 -> Ill(-1116395005, var9 ^ -966736256);
            case 238 -> Ill(-1116395006, var9 ^ 655545850);
            case 239 -> Ill(-1116395003, var9 ^ 1098713746);
            case 240 -> Ill(-1116395004, var9 ^ -944445547);
            case 241 -> Ill(-1116395001, var9 ^ 1578352719);
            case 242 -> Ill(-1116395002, var9 ^ 972844306);
            case 243 -> Ill(-1116394983, var9 ^ -1676285234);
            case 244 -> Ill(-1116394984, var9 ^ -834906725);
            case 245 -> Ill(-1116394981, var9 ^ 774123680);
            case 246 -> Ill(-1116394982, var9 ^ -1942416333);
            case 247 -> Ill(-1116394979, var9 ^ -980352708);
            case 248 -> Ill(-1116394980, var9 ^ 69479482);
            case 249 -> Ill(-1116394977, var9 ^ 1258172226);
            case 250 -> Ill(-1116394978, var9 ^ 1350309989);
            case 251 -> Ill(-1116394991, var9 ^ 1913996865);
            case 252 -> Ill(-1116394992, var9 ^ -110785305);
            case 253 -> Ill(-1116394989, var9 ^ -643436140);
            case 254 -> Ill(-1116394990, var9 ^ -1928803482);
            default -> Ill(-1116394987, var9 ^ 1349106237);
         };
         int var5 = (var1 & Ill(-1116394988, var9 ^ -190334992)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Ill(-1116394985, var9 ^ -13820242)) >>> Ill(-1116394986, var9 ^ 508269587)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Ill(-1116394519, var9 ^ 1644071895);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Ill(-1116394520, var9 ^ 1295028357);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }

   private static String lII(int var0, int var1) {
      int var3 = var0 ^ 498258364;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1036445472;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 58;
            case 1 -> 198;
            case 2 -> 24;
            case 3 -> 28;
            case 4 -> 3;
            case 5 -> 195;
            case 6 -> 92;
            case 7 -> 44;
            case 8 -> 35;
            case 9 -> 176;
            case 10 -> 24;
            case 11 -> 126;
            case 12 -> 3;
            case 13 -> 119;
            case 14 -> 251;
            case 15 -> 233;
            case 16 -> 172;
            case 17 -> 213;
            case 18 -> 184;
            case 19 -> 36;
            case 20 -> 152;
            case 21 -> 77;
            case 22 -> 104;
            case 23 -> 60;
            case 24 -> 38;
            case 25 -> 217;
            case 26 -> 47;
            case 27 -> 61;
            case 28 -> 211;
            case 29 -> 149;
            case 30 -> 84;
            case 31 -> 94;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public void llIl() {
      this.l(class_310.method_1551(), false);
      this.III();
   }

   public IIIIllIII() {
      int var1 = -316010987;
      super(
         IlIIllIII.Ill(IIl(Ill(-1116394503, var1 ^ 1349872519), Ill(-1116394504, var1 ^ 1397523345))),
         lllIIlIl.III,
         IlIIllIII.Ill(IIl(Ill(-1116394501, var1 ^ -1533432096), Ill(-1116394502, var1 ^ 1406840267)))
      );
      this.lI = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIl(Ill(-1116394499, var1 ^ -1763044369), Ill(-1116394500, var1 ^ -1435855480))), lllIllll.class, lllIllll.l)
      );
      this.llI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl(Ill(-1116394497, var1 ^ 1161981725), Ill(-1116394498, var1 ^ -1508423368))), true));
      this.II = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIl(Ill(-1116394511, var1 ^ -1167625933), Ill(-1116394512, var1 ^ -444569509))), true));
      this.ll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIl(Ill(-1116394509, var1 ^ 1358545569), Ill(-1116394510, var1 ^ 422563889))), 100.0, 0.0, 100.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIl(Ill(-1116394507, var1 ^ -1864728768), Ill(-1116394508, var1 ^ 1494467143))))
      );
      this.Il = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIl(Ill(-1116394505, var1 ^ 1829222381), Ill(-1116394506, var1 ^ -1175632368))), 10.0, 0.0, 20.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIl(Ill(-1116394551, var1 ^ -148479936), Ill(-1116394552, var1 ^ 1922272757))))
      );
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (var1 == null || var1.field_1724 == null || var1.field_1755 != null || !var1.method_1569()) {
         this.l(var1, false);
         this.III();
      }
   }
}
