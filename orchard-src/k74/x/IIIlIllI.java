package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import k74.y.IIlIIllI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_3966;

@Environment(EnvType.CLIENT)
public final class IIIlIllI extends IlIIIIIIl {
   private boolean I;
   private static final Object[] Ill;
   private static final int[] IIl;
   private final IIlIII II;
   private static final String[] Il;
   private static final String[] lI;
   private int ll;
   private static String[] III;
   private static final String[] IlI;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -203056822;
      String[] var9 = new String[2];
      int var10001 = "Q渵㍰ᵔ쇭ก弗诌Ṕ⡼坝\udf4c徔諼൛\uecbe됼冡\udfbe藣幸㚕莓\ueea3࠾\uec3d\uf3b9\uf806⥘茳瘬㵔℥谚뒍傝岘\ue628ɫ万䡶싔１ớ믁ᰌ왋\udcf0䙥ါ吺菙媦礘\udb5a례锖椵\uf8b4\uda16Ж끋魫䵠\uea10们̩Ἃ浧텣߰鶺攳㹌쮷㢒鷋⒧徻뷂䖘䈯\u0015䯳昧俽싡㳯埳洫㌺품ሶ곽\udaa0臇葿濡豨崟飐邏놿夘"
         .length();
      int var11 = 0;
      int var8 = var10001;
      short var12 = 18812;
      int var10 = 0;
      String var7 = "Q渵㍰ᵔ쇭ก弗诌Ṕ⡼坝\udf4c徔諼൛\uecbe됼冡\udfbe藣幸㚕莓\ueea3࠾\uec3d\uf3b9\uf806⥘茳瘬㵔℥谚뒍傝岘\ue628ɫ万䡶싔１ớ믁ᰌ왋\udcf0䙥ါ吺菙媦礘\udb5a례锖椵\uf8b4\uda16Ж끋魫䵠\uea10们̩Ἃ浧텣߰鶺攳㹌쮷㢒鷋⒧徻뷂䖘䈯\u0015䯳昧俽싡㳯埳洫㌺품ሶ곽\udaa0臇葿濡豨崟飐邏놿夘";

      do {
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;

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

      IlI = var9;
      Ill = new Object[var9.length];
      int var10000 = 0;
      int var22 = 0;
      IIl = new int[284];
      byte[] var10002 = "\u0089g\u000fc\u009f¼¢û\u00927 \u0086ö:\u008eþô9N\u0082ãt\u0018\u0083?\u001fTÔ³\u0090@u\u009c\u0005µ\u0082ç¼Ýke\u007f\u0097X\u008aEp±§A=dÉ\u0099Ú\u009f«Ýr\u0019\u0010Vfñh¥þWJ0\u0089q6ÙÄ*\u0081Ò\u0082;\u000fc*I^aË*(½^%Y4\u0087¶£©\u0003\u000e»ã\u000b\u009ccS¹\u0088«Ê\u0004\u0019\u0004\r.®.\u0006Ôö\u001dVàð«Á\u008e\u0016&H¸>\u0010\u008bU7\u0007zó®\u001bz@ÎÚÛ¼4G¸f\u0082½o@aÖ»hH\u0096\u0006\u0004ÖGhã<\t\u0011¶3À(nÏçß\u0096AA.|ß\u000f%ã\u0096´þ\u0019oÉ\u0083¢oË55\u008aäá«è\u009dp2_-+7\u009b|JéF0fÅ\u000f60l¬Y\u001câ\u0082f¾ö+\u0091 \u0089¤mò\u0090\u008dm\"´\u0014\u009f·Ë\u008d\u000e\u0018\u008fÁ\u009d\u0090\u000b\u0089¢y\u0000f\u0085¥¢8Æø\u0094Ä\u00adÅ(\u001dÔ§V¤\u001b=«³C\b^\u0086ú\u0094nO\u0093\u009a\u0016\u0094\u0086N]ÓÁ×¯X\u001cÔ\u0098?a\u0097½°\u0003\u001eÒ¾Q`\u009a\u009fxoò\u0004¸4´¹á=6áÃ´\u0089\u0005ÜhåX¹\u0093\u001e\u008eýY\u001b\u008c\";\u0013´L9/\u001béF6Ì,JÍ\u0004\u0018Xc¢u= /ëª§0üH \u0017lù\u001a #?\u0003ÆËo6m\fó¡\u0093Wµ\u0016í\u0001B{\u009d©Í\u000fk\u0011FÛ=\u000e\u008e2¸ÿ\u0084ô°°\u0090\u001c\u008606a&äÊ3¸&\u008c\u0003\u008féÖ'JÆã7éA³)pÜsÖ¦NA¼|\u009dê\\i\u008d\u0003\u00adÃ\u0004a¬>\u0003c\u009eùùº\u0000í\u00191\u0017\u008c&or3¥¥eâz\u007f\u000b\u0081R(¬®³FÿsM.*Q\u009fÊ\u009b\u009f\u007f.~¿°B°&\u0097¾¿\u0019\u009eq¿´\u0091\u0012k¢\u0085O¼l\u0097\u008f\u0003\u0006\u0007ÞÙB\rÙw¨ôÒ@*Ê¼\u007fVË\u001f\u0083EïYX\u0005JÚ.|#é$:\u000f|û©ÅF$ËØ2Bçkþ\u0084~ IÚÊ7\u009ea\tR\u0084ðÇÿ\u0006Ê¡Mi\u009fDôÝ1\r\u0090W\u009d7kJ\u00adXÛ/N\u0013\u0002\u001fÓÙå£nEÞ¼r9E¥ð1]óW4\u0089\u0088=ã'ç@êt\u0012\u009cû\u009b6\u0098ð!\u001ej²\u008d3³RºlØ*\u0096ÃÁRþ\u0093|ÖA`oO\u007fòÞÃÓn\rùÈ?Ü·è¸/ý3çvYp\u0003W%Xäg\u0014\u0007Î¡h\tà\u0019ç{kçb\u008bG\u0006Òx1Mÿ\u0097+5>þoC¬÷´Þ¯\u0097õ¤j%¢®½Cv?\u0017ÐºAa·\u0081d\u0084\u0084¶½¦\t\f \u0007P\u0096Ø0g\u001d\u0011Ûý¥\u0087î²\u0082\u0019\u008fq«ã\u001a»+_EBôîÌ\u007fD\u0007Þ©\u0088+öó\\¦ËC;Â)ûæ!\u008b¢\u0081\u0082>\u0007 \u0016Ù\u0087;àçø\u0081 U3îE\u0097U®{-\u009aB\u0082âfÝ¨\u008a\u009dýý\u0082 :¤ûª8\u009cw¨\u000b;\u0017\n¦Ñû\u0092Tf½6Ò_Ó\u0084È®¸E\u0085P¾\u0013y\u000bÇ\u0082®\u0014ý8ò\u009dH¢«\u001b¯Ä\u0010[}X\u008a\u0097Ò±?ÝãÃør5Þù ®8©Þ\u009cñ\u0084\rÐ=OÝÜ\u0092¦½\u0095\u000f\u0096\f\u001aW\u0089\u0081(j¡\u0001rº\u0091©Úíè0ÐL·£g\u0015ìr\u007fßmô\u0000.ü©f\u001b´Ê|9ù\u0080í+«Õö·\u001e\u0003ëBö\u000bp\u009eÅÀ{\u009b\u0093<Á\u0088§\t1¶t¨\u0000\u0004¸°ñ/\u0097X\u0084ó²\u0002\u0096T·M\u0004ü\t\u008cÁmØ¸ÛWc\\ROióçÓäl9ë\u001d\u0099Il¢¢\u0089|\u0001yE\u008e§\u001a\rH\n2\u0088¹\u008a(<\u000el¬º]%=\u00016ªÃØ\u0017\u0095\bXdÜTB2ÈþBü·Ê^ù0\u001fûf¥\u0002bw\u0084x\u0006\u00114ð0Ï\u009dß_\u008e\u0018:\"§g\u0094\r÷1 \u0085Jª1iðã\u009fÓGljV"
         .getBytes("ISO-8859-1");

      int var53;
      do {
         IIl[var10000] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ -1387054423;
         var10000 += 1;
         var53 = var22 + 4;
         var22 += 4;
      } while (var53 < var10002.length);

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III(30158, (char)'돃', -454880424, (short)12408, 'ﭒ', -2112250669, 7332)).length();
      int var1 = ll(-669557867, var17 ^ 568519413);
      int var19 = -1;

      label87:
      while (true) {
         var10000 = ll(-669557868, var17 ^ 1329205375);
         String var25 = var2.substring(++var19, var19 + var1);
         byte var37 = -1;

         while (true) {
            label82: {
               char[] var55 = var25.toCharArray();
               int var67 = var55.length;
               int var6 = 0;
               var53 = var10000;
               var42 = var55;
               var22 = var67;
               char[] var79;
               int var86;
               if (var67 <= 1) {
                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               } else {
                  var53 = var10000;
                  var22 = var67;
                  if (var67 <= var6) {
                     break label82;
                  }

                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               }

               while (true) {
                  var79[var86] = (char)(var79[var86] ^ var67 ^ switch (var6 % ll(-669557879, var17 ^ -301585961)) {
                     case 0 -> ll(-669557880, var17 ^ -862757182);
                     case 1 -> ll(-669557877, var17 ^ -1334178104);
                     case 2 -> ll(-669557878, var17 ^ 124868077);
                     case 3 -> ll(-669557875, var17 ^ -1983840870);
                     case 4 -> ll(-669557876, var17 ^ -658367347);
                     case 5 -> ll(-669557873, var17 ^ -1373730425);
                     default -> ll(-669557874, var17 ^ -543732411);
                  });
                  var6++;
                  if (var53 == 0) {
                     var86 = var53;
                     var79 = var42;
                     var67 = var53;
                  } else {
                     if (var22 <= var6) {
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
                     Il = new String[4];
                     III = new String[4];
                     I();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var60;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label87;
                  }

                  var4 = (var2 = III((short)-17584, 9425, -454880423, (short)23632, 29590, -609733719, (char)'펳')).length();
                  var1 = ll(-669557865, var17 ^ 763274658);
                  var19 = -1;
            }

            var10000 = ll(-669557866, var17 ^ -1762283208);
            var25 = var2.substring(++var19, var19 + var1);
            var37 = 0;
         }
      }
   }

   private static void I() {
      int var0 = 2141057531;
      III[0] = Il(II(ll(-669557863, var0 ^ -2084798480), ll(-669557864, var0 ^ -1788583467)).toCharArray(), 22346L, ll(-669557861, var0 ^ 1231966833));
      III[1] = Il(II(ll(-669557862, var0 ^ -52298157), ll(-669557859, var0 ^ -18715963)).toCharArray(), 50727L, ll(-669557860, var0 ^ 127174946));
      III[2] = Il(II(ll(-669557857, var0 ^ 902046798), ll(-669557858, var0 ^ -1186249760)).toCharArray(), 41809L, ll(-669557871, var0 ^ 1734774309));
      III[3] = Il(II(ll(-669557872, var0 ^ -311972401), ll(-669557869, var0 ^ 1873222173)).toCharArray(), 54158L, ll(-669557870, var0 ^ -2074652831));
   }

   public IIIlIllI() {
      super(IlIIllIII.Ill(III[1]), lllIIlIl.I, IlIIllIII.Ill(III[0]));
      this.II = this.IllIIll(new IIlIII(IlIIllIII.Ill(III[2]), 100.0, 0.0, 100.0, 1.0).IlII(IlIIllIII.lI(III[3])));
   }

   private boolean l() {
      double var1 = this.II.IllI();
      if (var1 <= 0.0) {
         return false;
      } else {
         return var1 >= 100.0 ? true : ThreadLocalRandom.current().nextDouble(100.0) < var1;
      }
   }

   @Override
   public void lllllI(class_1297 var1) {
      this.I = var1 != null;
   }

   @Override
   public void IlIII() {
      this.ll = 0;
      this.I = false;
   }

   @Override
   public void llIl() {
      this.ll = 0;
      this.I = false;
   }

   @Override
   public void IIlIl() {
      String[] var1 = IIllllIl.IIIIl();
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 != null) {
         int var4;
         label33: {
            IIlIIllI var3 = (IIlIIllI)var2;
            var4 = var3.ilovcats$getAttackCooldown();
            if (var4 > 0 && this.ll <= 0) {
               if (!this.I && this.l()) {
                  var3.ilovcats$setAttackCooldown(0);
                  var4 = 0;
               }

               this.I = false;
               if (var1 == null) {
                  break label33;
               }
            }

            if (var4 <= 0 && this.ll <= 0) {
               this.I = false;
            }
         }

         this.ll = var4;
      } else {
         this.ll = 0;
         this.I = false;
      }
   }

   private static String II(int var0, int var1) {
      int var9 = -462337005;
      int var2 = (var0 ^ ll(-669557887, var9 ^ 849268322)) & ll(-669557888, var9 ^ 718562724);
      if (Il[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & ll(-669557885, var9 ^ -228285261)) {
            case 0 -> ll(-669557886, var9 ^ 989666224);
            case 1 -> ll(-669557883, var9 ^ -1791349543);
            case 2 -> ll(-669557884, var9 ^ -1087255627);
            case 3 -> ll(-669557881, var9 ^ -1939735061);
            case 4 -> ll(-669557882, var9 ^ 989238024);
            case 5 -> ll(-669557831, var9 ^ -1216370792);
            case 6 -> ll(-669557832, var9 ^ -2118367169);
            case 7 -> ll(-669557829, var9 ^ -1773277560);
            case 8 -> ll(-669557830, var9 ^ -1974648071);
            case 9 -> 2;
            case 10 -> ll(-669557827, var9 ^ 1273806441);
            case 11 -> ll(-669557828, var9 ^ -695245736);
            case 12 -> ll(-669557825, var9 ^ 743981600);
            case 13 -> 1;
            case 14 -> ll(-669557826, var9 ^ 1200384681);
            case 15 -> ll(-669557839, var9 ^ 120658805);
            case 16 -> 4;
            case 17 -> ll(-669557840, var9 ^ -698352101);
            case 18 -> ll(-669557837, var9 ^ -1742296267);
            case 19 -> ll(-669557838, var9 ^ 1361013816);
            case 20 -> ll(-669557835, var9 ^ 1994953894);
            case 21 -> ll(-669557836, var9 ^ -803635658);
            case 22 -> ll(-669557833, var9 ^ -1642929751);
            case 23 -> ll(-669557834, var9 ^ 633931513);
            case 24 -> ll(-669557847, var9 ^ 1488240107);
            case 25 -> ll(-669557848, var9 ^ 1510094847);
            case 26 -> ll(-669557845, var9 ^ 1977002419);
            case 27 -> ll(-669557846, var9 ^ 205992160);
            case 28 -> ll(-669557843, var9 ^ -1139005412);
            case 29 -> ll(-669557844, var9 ^ -310511923);
            case 30 -> ll(-669557841, var9 ^ -1588471143);
            case 31 -> ll(-669557842, var9 ^ -1492685234);
            case 32 -> ll(-669557855, var9 ^ -936641223);
            case 33 -> ll(-669557856, var9 ^ -141956300);
            case 34 -> ll(-669557853, var9 ^ 9931653);
            case 35 -> ll(-669557854, var9 ^ -54160721);
            case 36 -> ll(-669557851, var9 ^ -65685836);
            case 37 -> ll(-669557852, var9 ^ 243324130);
            case 38 -> ll(-669557849, var9 ^ -1624272191);
            case 39 -> ll(-669557850, var9 ^ 212276894);
            case 40 -> ll(-669557799, var9 ^ 860750394);
            case 41 -> ll(-669557800, var9 ^ 345153683);
            case 42 -> ll(-669557797, var9 ^ 1473222269);
            case 43 -> ll(-669557798, var9 ^ 1022507002);
            case 44 -> ll(-669557795, var9 ^ 1167084482);
            case 45 -> ll(-669557796, var9 ^ -1979009344);
            case 46 -> ll(-669557793, var9 ^ -767606378);
            case 47 -> ll(-669557794, var9 ^ 1805872232);
            case 48 -> ll(-669557807, var9 ^ 44897336);
            case 49 -> ll(-669557808, var9 ^ 393822382);
            case 50 -> ll(-669557805, var9 ^ 1356902563);
            case 51 -> ll(-669557806, var9 ^ -1914463574);
            case 52 -> ll(-669557803, var9 ^ -257900703);
            case 53 -> ll(-669557804, var9 ^ -1842753526);
            case 54 -> ll(-669557801, var9 ^ -1068006024);
            case 55 -> ll(-669557802, var9 ^ -380047206);
            case 56 -> ll(-669557815, var9 ^ 688109061);
            case 57 -> ll(-669557816, var9 ^ 1879717114);
            case 58 -> ll(-669557813, var9 ^ 1384354941);
            case 59 -> ll(-669557814, var9 ^ 1298130718);
            case 60 -> ll(-669557811, var9 ^ 681843777);
            case 61 -> ll(-669557812, var9 ^ 1819154867);
            case 62 -> ll(-669557809, var9 ^ -1291056064);
            case 63 -> ll(-669557810, var9 ^ -586273482);
            case 64 -> ll(-669557823, var9 ^ 2020682209);
            case 65 -> ll(-669557824, var9 ^ -1115828138);
            case 66 -> ll(-669557821, var9 ^ -1989189359);
            case 67 -> ll(-669557822, var9 ^ -469065043);
            case 68 -> ll(-669557819, var9 ^ 2057151928);
            case 69 -> ll(-669557820, var9 ^ 1837048356);
            case 70 -> ll(-669557817, var9 ^ -36829885);
            case 71 -> ll(-669557818, var9 ^ -1308098088);
            case 72 -> ll(-669557767, var9 ^ 1515730074);
            case 73 -> ll(-669557768, var9 ^ -1648050604);
            case 74 -> ll(-669557765, var9 ^ -964556321);
            case 75 -> ll(-669557766, var9 ^ -1871354116);
            case 76 -> ll(-669557763, var9 ^ 955912359);
            case 77 -> ll(-669557764, var9 ^ -2140022468);
            case 78 -> ll(-669557761, var9 ^ -1615253549);
            case 79 -> ll(-669557762, var9 ^ 1857287732);
            case 80 -> ll(-669557775, var9 ^ 564593476);
            case 81 -> ll(-669557776, var9 ^ -1593744588);
            case 82 -> ll(-669557773, var9 ^ 1979526227);
            case 83 -> ll(-669557774, var9 ^ -1212481242);
            case 84 -> ll(-669557771, var9 ^ 2028021171);
            case 85 -> ll(-669557772, var9 ^ 1473522366);
            case 86 -> ll(-669557769, var9 ^ -796644368);
            case 87 -> ll(-669557770, var9 ^ 1296353657);
            case 88 -> ll(-669557783, var9 ^ -545866162);
            case 89 -> ll(-669557784, var9 ^ 215827265);
            case 90 -> ll(-669557781, var9 ^ 473215116);
            case 91 -> ll(-669557782, var9 ^ -1789481382);
            case 92 -> ll(-669557779, var9 ^ -1839948692);
            case 93 -> ll(-669557780, var9 ^ 1754071763);
            case 94 -> ll(-669557777, var9 ^ -2012870536);
            case 95 -> ll(-669557778, var9 ^ -1218940786);
            case 96 -> ll(-669557791, var9 ^ 882009942);
            case 97 -> ll(-669557792, var9 ^ -347600534);
            case 98 -> ll(-669557789, var9 ^ -1021333970);
            case 99 -> ll(-669557790, var9 ^ 577895804);
            case 100 -> ll(-669557787, var9 ^ -602330920);
            case 101 -> ll(-669557788, var9 ^ 251500813);
            case 102 -> ll(-669557785, var9 ^ -300325895);
            case 103 -> ll(-669557786, var9 ^ 561361575);
            case 104 -> ll(-669557991, var9 ^ 109683362);
            case 105 -> ll(-669557992, var9 ^ 256287259);
            case 106 -> ll(-669557989, var9 ^ 2455075);
            case 107 -> ll(-669557990, var9 ^ 343457318);
            case 108 -> ll(-669557987, var9 ^ 112722279);
            case 109 -> ll(-669557988, var9 ^ -1763064241);
            case 110 -> ll(-669557985, var9 ^ -1662094018);
            case 111 -> ll(-669557986, var9 ^ 1709523659);
            case 112 -> ll(-669557999, var9 ^ 1535868356);
            case 113 -> ll(-669558000, var9 ^ 1512604082);
            case 114 -> ll(-669557997, var9 ^ 2121161241);
            case 115 -> ll(-669557998, var9 ^ -605211664);
            case 116 -> ll(-669557995, var9 ^ -1294058725);
            case 117 -> ll(-669557996, var9 ^ -1639193043);
            case 118 -> ll(-669557993, var9 ^ 1416706420);
            case 119 -> ll(-669557994, var9 ^ 1225081074);
            case 120 -> ll(-669558007, var9 ^ -87450780);
            case 121 -> ll(-669558008, var9 ^ 830391594);
            case 122 -> ll(-669558005, var9 ^ -1498848501);
            case 123 -> ll(-669558006, var9 ^ -1011618469);
            case 124 -> ll(-669558003, var9 ^ 1848756308);
            case 125 -> ll(-669558004, var9 ^ -597779131);
            case 126 -> ll(-669558001, var9 ^ 1709847301);
            case 127 -> ll(-669558002, var9 ^ 23101984);
            case 128 -> ll(-669558015, var9 ^ -92425993);
            case 129 -> ll(-669558016, var9 ^ 1243106396);
            case 130 -> ll(-669558013, var9 ^ -1826041429);
            case 131 -> ll(-669558014, var9 ^ 1955884176);
            case 132 -> ll(-669558011, var9 ^ 1334537515);
            case 133 -> ll(-669558012, var9 ^ -728567118);
            case 134 -> ll(-669558009, var9 ^ -859548203);
            case 135 -> ll(-669558010, var9 ^ 415186829);
            case 136 -> ll(-669557959, var9 ^ -1227865546);
            case 137 -> ll(-669557960, var9 ^ -450519481);
            case 138 -> ll(-669557957, var9 ^ 167871863);
            case 139 -> ll(-669557958, var9 ^ -1339460163);
            case 140 -> ll(-669557955, var9 ^ 470069659);
            case 141 -> ll(-669557956, var9 ^ 727439951);
            case 142 -> ll(-669557953, var9 ^ 133488243);
            case 143 -> ll(-669557954, var9 ^ 1873044472);
            case 144 -> ll(-669557967, var9 ^ -799576714);
            case 145 -> ll(-669557968, var9 ^ -289029691);
            case 146 -> ll(-669557965, var9 ^ 1113133002);
            case 147 -> ll(-669557966, var9 ^ 1493753433);
            case 148 -> ll(-669557963, var9 ^ 2039427081);
            case 149 -> ll(-669557964, var9 ^ -1563399857);
            case 150 -> ll(-669557961, var9 ^ -516663957);
            case 151 -> ll(-669557962, var9 ^ -908887408);
            case 152 -> ll(-669557975, var9 ^ -1762024552);
            case 153 -> ll(-669557976, var9 ^ -1730739082);
            case 154 -> ll(-669557973, var9 ^ -363010781);
            case 155 -> ll(-669557974, var9 ^ 443548921);
            case 156 -> ll(-669557971, var9 ^ -385462168);
            case 157 -> ll(-669557972, var9 ^ 102512467);
            case 158 -> ll(-669557969, var9 ^ 1868055032);
            case 159 -> ll(-669557970, var9 ^ 1719910823);
            case 160 -> ll(-669557983, var9 ^ 113419998);
            case 161 -> ll(-669557984, var9 ^ -1265259497);
            case 162 -> ll(-669557981, var9 ^ -767476391);
            case 163 -> ll(-669557982, var9 ^ 1099783819);
            case 164 -> ll(-669557979, var9 ^ 649487936);
            case 165 -> ll(-669557980, var9 ^ 360824772);
            case 166 -> ll(-669557977, var9 ^ -1740914914);
            case 167 -> ll(-669557978, var9 ^ -1046362747);
            case 168 -> ll(-669557927, var9 ^ -165014532);
            case 169 -> 0;
            case 170 -> ll(-669557928, var9 ^ 1821541864);
            case 171 -> ll(-669557925, var9 ^ 599071675);
            case 172 -> ll(-669557926, var9 ^ -526589685);
            case 173 -> ll(-669557923, var9 ^ 706494678);
            case 174 -> ll(-669557924, var9 ^ -742133418);
            case 175 -> ll(-669557921, var9 ^ -294451874);
            case 176 -> ll(-669557922, var9 ^ 952055299);
            case 177 -> ll(-669557935, var9 ^ 1651227455);
            case 178 -> ll(-669557936, var9 ^ -770908205);
            case 179 -> ll(-669557933, var9 ^ 1792091068);
            case 180 -> ll(-669557934, var9 ^ 867598438);
            case 181 -> ll(-669557931, var9 ^ -1776872241);
            case 182 -> ll(-669557932, var9 ^ 369943244);
            case 183 -> ll(-669557929, var9 ^ 1773551422);
            case 184 -> ll(-669557930, var9 ^ -1562818680);
            case 185 -> ll(-669557943, var9 ^ -996574934);
            case 186 -> ll(-669557944, var9 ^ 192257795);
            case 187 -> ll(-669557941, var9 ^ -135612659);
            case 188 -> ll(-669557942, var9 ^ 214622332);
            case 189 -> ll(-669557939, var9 ^ 822978242);
            case 190 -> ll(-669557940, var9 ^ 990872528);
            case 191 -> ll(-669557937, var9 ^ 960243454);
            case 192 -> ll(-669557938, var9 ^ -1684943847);
            case 193 -> ll(-669557951, var9 ^ 56851309);
            case 194 -> ll(-669557952, var9 ^ -1478147954);
            case 195 -> ll(-669557949, var9 ^ 369078585);
            case 196 -> ll(-669557950, var9 ^ -726511664);
            case 197 -> ll(-669557947, var9 ^ -2108814912);
            case 198 -> ll(-669557948, var9 ^ 328797070);
            case 199 -> ll(-669557945, var9 ^ -1446666364);
            case 200 -> ll(-669557946, var9 ^ 865862865);
            case 201 -> ll(-669557895, var9 ^ 1428642112);
            case 202 -> ll(-669557896, var9 ^ -910325657);
            case 203 -> ll(-669557893, var9 ^ 537452480);
            case 204 -> ll(-669557894, var9 ^ 1389325706);
            case 205 -> ll(-669557891, var9 ^ 1338941989);
            case 206 -> ll(-669557892, var9 ^ -1449206687);
            case 207 -> ll(-669557889, var9 ^ 1622347763);
            case 208 -> ll(-669557890, var9 ^ -1401364533);
            case 209 -> ll(-669557903, var9 ^ 59875872);
            case 210 -> ll(-669557904, var9 ^ -1633610817);
            case 211 -> ll(-669557901, var9 ^ -960586161);
            case 212 -> ll(-669557902, var9 ^ -74054678);
            case 213 -> ll(-669557899, var9 ^ 732345984);
            case 214 -> ll(-669557900, var9 ^ 2095001494);
            case 215 -> ll(-669557897, var9 ^ -578772540);
            case 216 -> ll(-669557898, var9 ^ -2065994452);
            case 217 -> ll(-669557911, var9 ^ 1314584210);
            case 218 -> ll(-669557912, var9 ^ -1077171244);
            case 219 -> ll(-669557909, var9 ^ -1971071532);
            case 220 -> ll(-669557910, var9 ^ -1462854376);
            case 221 -> ll(-669557907, var9 ^ -1164129608);
            case 222 -> ll(-669557908, var9 ^ 640228894);
            case 223 -> ll(-669557905, var9 ^ -742321115);
            case 224 -> ll(-669557906, var9 ^ 267575099);
            case 225 -> ll(-669557919, var9 ^ 178536017);
            case 226 -> ll(-669557920, var9 ^ 428870581);
            case 227 -> ll(-669557917, var9 ^ 658749322);
            case 228 -> ll(-669557918, var9 ^ -1785745575);
            case 229 -> ll(-669557915, var9 ^ -1096787407);
            case 230 -> ll(-669557916, var9 ^ 1652890908);
            case 231 -> ll(-669557913, var9 ^ -981446762);
            case 232 -> ll(-669557914, var9 ^ 1832816921);
            case 233 -> 3;
            case 234 -> ll(-669558119, var9 ^ -51403526);
            case 235 -> ll(-669558120, var9 ^ -967556394);
            case 236 -> ll(-669558117, var9 ^ -564203347);
            case 237 -> ll(-669558118, var9 ^ 1121152962);
            case 238 -> ll(-669558115, var9 ^ 2049612379);
            case 239 -> ll(-669558116, var9 ^ -40518604);
            case 240 -> ll(-669558113, var9 ^ -315202201);
            case 241 -> ll(-669558114, var9 ^ 529537391);
            case 242 -> 5;
            case 243 -> ll(-669558127, var9 ^ -650300985);
            case 244 -> ll(-669558128, var9 ^ 683486074);
            case 245 -> ll(-669558125, var9 ^ -1621380410);
            case 246 -> ll(-669558126, var9 ^ -871226491);
            case 247 -> ll(-669558123, var9 ^ -1482825733);
            case 248 -> ll(-669558124, var9 ^ -2036200502);
            case 249 -> ll(-669558121, var9 ^ -169126061);
            case 250 -> ll(-669558122, var9 ^ -1543511436);
            case 251 -> ll(-669558135, var9 ^ 1837156653);
            case 252 -> ll(-669558136, var9 ^ 1745296385);
            case 253 -> ll(-669558133, var9 ^ -141426297);
            case 254 -> ll(-669558134, var9 ^ -424444986);
            default -> ll(-669558131, var9 ^ -2147224618);
         };
         int var5 = (var1 & ll(-669558132, var9 ^ 1588249451)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(-669558129, var9 ^ 523195669)) >>> ll(-669558130, var9 ^ 911251422)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(-669558143, var9 ^ 1711717564);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(-669558144, var9 ^ -610456239);
            }
         }

         Il[var2] = new String(var3).intern();
      }

      return Il[var2];
   }

   private static int ll(int var0, int var1) {
      int var2 = IIl[var0 ^ -669557863] ^ var1 ^ var0;
      var2 -= 48239;
      var2 -= 9507;
      var2 -= 33181;
      var2 ^= 13977;
      var2 -= 29114;
      var2 ^= 21443;
      var2 ^= 5918;
      return var2 ^ 52402;
   }

   private static String III(short var0, char var1, int var2, short var3, char var4, int var5, char var6) {
      int var11 = var2 ^ -454880424;
      char[] var10 = IlI[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])Ill[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         Ill[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 41773;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ 'ꝓ' ^ var9 ^ var6 ^ var8 ^ var3 ^ var4 ^ var2 ^ var1 ^ var0 ^ var5);
      }

      return new String(var10).intern();
   }

   private static String Il(char[] var0, long var1, int var3) {
      int var4 = ll(-669558141, -222448828 ^ 1284944301) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(-669558142, -222448828 ^ -1063810757);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public boolean lI(class_310 var1) {
      if (this.IIIIlIl() && var1 != null && var1.field_1724 != null) {
         if (var1.field_1765 instanceof class_3966 var2) {
            class_1297 var4 = var2.method_17782();
            if (var4 != null && var4 != var1.field_1724 && var4.method_5805() && !var4.method_31481() && !var4.method_7325() && !IIlllIlll.l(var4)) {
               return false;
            }
         }

         return this.l();
      } else {
         return false;
      }
   }
}
