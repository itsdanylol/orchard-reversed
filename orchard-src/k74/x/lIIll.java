package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_304;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class lIIll extends IlIIIIIIl {
   private final IllIII<llIlIlI> I;
   private final lIlllIll II;
   private static final int[] IlI;
   private static final String[] Il;
   private static String[] lI;
   private final lllIIlII ll;
   private final lIlllIl III;
   private static final Object[] lII;
   private static final String[] Ill;
   private static final String[] IIl;

   private class_304 I(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         return this.I.IllI() == llIlIlI.Il ? var1.field_1690.field_1904 : var1.field_1690.field_1886;
      } else {
         return null;
      }
   }

   private boolean l(class_310 var1) {
      if (this.I.IllI() == llIlIlI.Il) {
         IIll.IlIll(var1);
         IIll.IIllIl(var1);
         return true;
      } else if (IIll.lllI(var1, IIll.lIlII(var1))) {
         return false;
      } else {
         IIll.lllIIl(var1);
         IIll.lIIII(var1);
         return true;
      }
   }

   @Override
   public void IlIII() {
      this.lI();
   }

   private static String lII(byte var0, short var1, byte var2, char var3, int var4, byte var5, char var6) {
      int var11 = var4 ^ 963208279;
      char[] var10 = Ill[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])lII[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         lII[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 147;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 6) {
            default -> 88;
            case 1 -> 24;
            case 2 -> 142;
            case 3 -> 170;
            case 4 -> 16;
            case 5 -> 192;
         } ^ 53357 ^ var9 ^ var2 ^ var4 ^ var5 ^ var8 ^ var1 ^ var6 ^ var3 ^ var0);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   private static void II() {
      int var0 = -842005763;
      lI[0] = ll(III(Ill(1734103893, var0 ^ -944937174), Ill(1734103894, var0 ^ 895536071)).toCharArray(), 79285L, Ill(1734103895, var0 ^ 154841349));
      lI[1] = ll(III(Ill(1734103880, var0 ^ 1854061996), Ill(1734103881, var0 ^ -544987026)).toCharArray(), 65825L, Ill(1734103882, var0 ^ 735161381));
      lI[2] = ll(III(Ill(1734103883, var0 ^ -618679541), Ill(1734103884, var0 ^ -473249688)).toCharArray(), 66556L, Ill(1734103885, var0 ^ -499141142));
      lI[3] = ll(III(Ill(1734103886, var0 ^ -203877492), Ill(1734103887, var0 ^ -646898872)).toCharArray(), 12839L, Ill(1734103872, var0 ^ -283890949));
      lI[4] = ll(III(Ill(1734103873, var0 ^ 229583580), Ill(1734103874, var0 ^ -1795811022)).toCharArray(), 29963L, Ill(1734103875, var0 ^ 846319568));
      lI[5] = ll(III(Ill(1734103876, var0 ^ 405795293), Ill(1734103877, var0 ^ -1374536710)).toCharArray(), 78472L, Ill(1734103878, var0 ^ -1461267202));
      lI[Ill(1734103879, var0 ^ 2125880281)] = ll(
         III(Ill(1734103928, var0 ^ 1049650631), Ill(1734103929, var0 ^ 1632658565)).toCharArray(), 76433L, Ill(1734103930, var0 ^ -422902180)
      );
   }

   @Override
   public void IlllII(JsonObject var1) {
      super.IlllII(var1);
      if (var1 != null && var1.has(IlIIllIII.lI(lI[1]))) {
         JsonObject var2 = var1.getAsJsonObject(IlIIllIII.lI(lI[1]));
         if (var2 != null) {
            JsonElement var3 = var2.get(IlIIllIII.lI(lI[0]));
            if (var3 != null && var3.isJsonPrimitive() && var3.getAsJsonPrimitive().isNumber()) {
               double var4 = var3.getAsDouble();
               this.III.III(new double[]{var4, var4});
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1402981367;
      byte var20 = -1;
      char[] var15 = "h\u001d".toCharArray();
      String var14 = "쟄磍㰋퉥\ue6d6ඐ\ue98a嗪൘揔⾪꧟렀匿ґ蝺\\딱\ude9d㮝姽듣\uf4c1\u2fde摶뻾ఐ\u0e5e鶠销\ueb99匳ⱹ糁෦钝\ude75ǘ㊚劮㩥瞾\ue8ff䋰撐\uef38ꍚꀳ谆ᫍꠃ⽈\uf380絶Ὄ뮹㏗\uf4af顨ꥈ〢쪰㺎퍖텸\ue609\u2e6f䷡肜ꦑ狑㕞䜂ニ尮⨗\ue04fﻯ\ue675얞槆枠㙵ꛀ뢂䨳焲\ue6be䭞䯃\u0bff\ueace㈁㧂휵\uedd6\ua48dﯧ蟫즕\u1c8bᴃ軰퍣艦븚䂩貲㖈騒軺\ud940트㼑⸗ᑗ\ue60b\uf328䝨騩\uef52\uf188ﺤ帿瘌퍚ꋉ䢿㽙쩼廻卷Ầ";
      short var13 = 18735;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            Ill = var16;
            lII = new Object[var16.length];
            int var9 = 669084942;
            byte[] var7 = "~\u0095\u0091\u0089èB²ä\\v\u0084kÍ\u0006èC\u0094.\u0092Ä\\å®s(¯\u001dÅÛá\u0017;\u0087\rÂ-\u009bÄ÷ééÊÚ\u001cþ\u000e/®\u0086\\Í\u009cµ?ÅpGóFñ\u001câ\u001f\u0090\u001c\u0010\u001f×\u00ad\u0017ykx!\u0082.©\u008d\u0011M\u0091YcÎc\"×'\u0081K±ò«ãy¤\u0002äø÷\u007f=\u0088¬æeéâÝrø\u0099j½S¯Ü\u0080\tax_õ¢\f$P\u0016L\u0002Ç\u008b\u0013ÃÍ©WJ\u0080z<¤×lÍb\u000feð¤(TI@Lü:Ú\u0018\u0011!Ë«E\u0007ÒLsw<\u0013ûÕ\u001d\u009dòÿ\u0087\u009e»çÚ1*Ór\u0096ôrÝ¿\u0016\u009f±ª\u0081eÑ/\u0099á\u001eWSMò¶R%\u0084ßô§gó\u0089½ >W\u0003¦jÞa\u0097ór^D\u0084ù´\u0095ÿæ\u008c\u0010.\u0081Ð¿S'C\u0086KÿAª\u009b\u009aÝ\u0090xéÄý\u0081\u0095\u0002ýzA\u009bzÎØù<Ï¡ºKÕù5\u001dï\u0082\u000b\\ß«ÍÈ\u001e\u009fX:«0\u0081Ùs\tv¦\u008e%\u009f\u00807L\u0017\u0086¥ b_\u0086s\u008b\u0092WÆþqzp\u000f\u009c\bëpNî\u00adÞ¬\u0086Æw\u001aõÚ!ë\r)ñÅ\u001bC\u008aÉ@Ó\u009b½oJ\u0000Zá\u0088R\u0013t\u0019£\u000fÝ\u0095µ\u0081Ø\u0094÷ÝQP>\u000b\u009a\u0003«¹þwí*\r~Tý\u0003±YÛ§¯:½¦µÕ|Ã\u001cÎÄIö³\u001b!¨q¿2f\u0018Äh'\u0002r\u00027¥\u007fÔæ½Þ\u0085\u0080\u000f\u0015!±\u009cx{9ù\u0019\u0084\b\u001dÉ§?\u008eªÔcl\u0096¡\u0094$\u008c \u0019À·ÿ5\u0098´v\u009cU{°´D\u0001\u0085i\u0082\u0013^aìº%W\u0002¤º)g¹Ï6¼[zRf\u009b9\u0085\u0083ã\u008c)>é;êìý¿\u000b¤åRÇÖ/÷\u0093\u0016f\r\u0000ÞN\u0087\bó£$IbyösÄÓ½\u0095æ×@X×Ì½9\u001a\u001c\u00951\u0001¹RÝ\u00adÃa\u00103ù$ð\u0084ö\\\u0006\u008b\u0088\u001dÃ\u009bn\u0095,\u0085PÙ$\u0015\u0000òDyiI\u0096\u0099\u00141Ã¤ªùÂ)r¡ i¶Ö°\u009cíçü\u009e\u009dg;jF\u0006\u00896Ï\u0015\u0089\u0000J£Ó\u0018\r²\u001dóE¡\u0019¹\u0003\u0012«\u0016{FQuY`x´GÍ®`\u0007>Ô§5d\u009d\u000b´\u0018\u00067L½ô\u0086Ë£\u0005+\b1\u0097\u0001ã\u0006\u008fôvú\u0087AÛul\u0091êÄ\u0095Ð:u\u008aÀpÝx$\u0088ª\u008bw]}¶µ\u0089\u008a\u0080\u008bÇ_\u000f|\u0019Â>\u0003.:dNñÚ\"P\u0082\u0013`\u0017\u0098K\u00adfT\u008fðÒ\u0018q\u0017é\u00989\u0085PßrÆ\u0019ªÝ®µâ\u0004\u0092¦'\u0087û\u000f¾£;\u009fðò=H.ë\nÔ³È°ý<Ì\u0095á²\u0085\u0094ÞÕ®Ã\n\u0003ht}\u008f4©\u0004!â\u0087\u0081µ¯\u008b\u0098\u0015ÇÁ$Â ]¼AÊó\u0001§ÃÆ,×Ñhè\u0086\u008aøi\u0092Ü¶ýxËäOøö\u0016¿ê·x±E\u0014wàz\u0011\tÓz\u00975\u0097ª0òÛAq^6ïK\u000bÙ<X\u0094á\u0017\u0092Êô\b\u0005\u001eÚU3?ËbRÆ\u0091Þ\"\b\u008a¹ûRÑ\u0016\u0013%SfÛ>Ã, ¤híz\u0006&C\u0088\u000f\u0089=\u000bäú+`]\u0088\u001a/aÜ`\u008fBÊoeì\n\u0002«RßL«@ÃØ»\u0082\u0080\u0000!$1\u009fBý\u0083µI'\u0010sD\u008eg°ÔÞ=\u0012\u0087\u0013ÃµýK[Ë\u0099\u0001\u0098/5ÆÃ\u001c.\u009f\u001c\u008fQd/9DÂ&8`\u0013Åd;²\u0016´ gÐÕpIÄÅ\u008eã!n\u009aÇ\u001dôØ¤\u00007<[°õCk+\u0083wO\u001bí\u001d¨èS\u007f\u0001À\u008aZV\u009eÂ[ô\u0090\r[þ©`\rÒ\u0088fyV\u0002\u0019\u0093\t÷\u008fÅäBÇf\u009d\u0085\u0084\u0091ö~\u009fo\u008e¿ A\u0012Ò{J\u0017S\u0084yÁv\u0001÷3¿\u0005ZV¯Érò'\u001f\u0096\u000f.d¨\fI\u008dÛ.êv½ÃT\n2\u0080[\u0014´\u0096\u0096fÙ\u0005%\u009cFÒ«¤KBð`Q(®\u0010K«¶yâìóâ\u0080õl\u008f\u0003\u001f)oØ\u009f Åþ~cFå9\u0002w\u0092?#\u0093Y/8Geq"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            IlI = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               IlI[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var5 = new String[Ill(1734103896, var24 ^ 1840753824)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lII((byte)-35, (short)13878, (byte)85, (char)'顿', 963208279, (byte)12, '曋')).length();
            int var1 = 4;
            int var26 = -1;

            label95:
            while (true) {
               int var29 = Ill(1734103897, var24 ^ -77558195);
               String var10001 = var2.substring(++var26, var26 + var1);
               byte var10002 = -1;

               while (true) {
                  label90: {
                     char[] var45 = var10001.toCharArray();
                     int var10004 = var45.length;
                     int var6 = 0;
                     int var48 = var29;
                     var41 = var45;
                     int var35 = var10004;
                     char[] var57;
                     int var10006;
                     if (var10004 <= 1) {
                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     } else {
                        var48 = var29;
                        var35 = var10004;
                        if (var10004 <= var6) {
                           break label90;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % Ill(1734103901, var24 ^ 1338479455)) {
                           case 0 -> Ill(1734103902, var24 ^ 999105176);
                           case 1 -> Ill(1734103903, var24 ^ -926733754);
                           case 2 -> Ill(1734103888, var24 ^ -1808793822);
                           case 3 -> Ill(1734103889, var24 ^ -1998140693);
                           case 4 -> 4;
                           case 5 -> Ill(1734103890, var24 ^ -85399790);
                           default -> Ill(1734103891, var24 ^ -315878630);
                        });
                        var6++;
                        if (var48 == 0) {
                           var10006 = var48;
                           var57 = var41;
                           var10004 = var48;
                        } else {
                           if (var35 <= var6) {
                              break;
                           }

                           var57 = var41;
                           var10004 = var48;
                           var10006 = var6;
                        }
                     }
                  }

                  String var50 = new String(var41).intern();
                  switch (var10002) {
                     case 0:
                        var5[var3++] = var50;
                        if ((var26 += var1) >= var4) {
                           Il = var5;
                           IIl = new String[Ill(1734103900, var24 ^ -2029211671)];
                           lI = new String[Ill(1734103892, var24 ^ -1786842951)];
                           II();
                           return;
                        }

                        var1 = var2.charAt(var26);
                        break;
                     default:
                        var5[var3++] = var50;
                        if ((var26 += var1) < var4) {
                           var1 = var2.charAt(var26);
                           continue label95;
                        }

                        var4 = (var2 = lII(60, (short)31723, (byte)-78, 17917, 963208278, (byte)-30, (char)'퀋')).length();
                        var1 = Ill(1734103898, var24 ^ 1330952467);
                        var26 = -1;
                  }

                  var29 = Ill(1734103899, var24 ^ -568011458);
                  var10001 = var2.substring(++var26, var26 + var1);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 196;
                  case 1 -> 243;
                  case 2 -> 3;
                  case 3 -> 252;
                  case 4 -> 81;
                  case 5 -> 43;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   public lIIll() {
      super(IlIIllIII.Ill(lI[2]), lllIIlIl.I, IlIIllIII.Ill(lI[Ill(1734103931, -1588948316 ^ 581717190)]));
      this.III = this.IllIIll(new lIlllIl(IlIIllIII.Ill(lI[0]), 10.0, 14.0, 1.0, 20.0, 0.5).lI(IlIIllIII.lI(lI[4])));
      this.I = this.IllIIll(new IllIII<>(IlIIllIII.Ill(lI[5]), llIlIlI.class, llIlIlI.lI));
      this.ll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lI[3]), true));
      this.II = new lIlllIll();
   }

   private boolean Il(class_310 var1) {
      if (!this.IIIIlIl()
         || var1 == null
         || var1.field_1724 == null
         || var1.field_1687 == null
         || var1.field_1761 == null
         || var1.field_1755 != null
         || var1.field_1690 == null) {
         return false;
      } else if (var1.field_1724.method_6115()) {
         return false;
      } else if (!this.ll.IllI()) {
         return true;
      } else {
         class_304 var2 = this.I(var1);
         return var2 != null && (IIll.IlIllll(var1, var2) || var2.method_1434());
      }
   }

   private static int Ill(int var0, int var1) {
      int var2 = IlI[var0 ^ 1734103896] ^ var1 ^ var0;
      var2 ^= 5347;
      var2 -= 26581;
      var2 ^= 34976;
      var2 ^= 41406;
      var2 += 54670;
      var2 += 4026;
      return var2 + 34785;
   }

   private void lI() {
      this.II.l();
   }

   @Override
   public void llIIII(class_310 var1) {
      this.IIl(var1);
   }

   @Override
   public String IlIIl() {
      return this.I.IllI().toString();
   }

   private static String ll(char[] var0, long var1, int var3) {
      int var4 = Ill(1734103932, -668302595 ^ 1632869506) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & Ill(1734103933, -668302595 ^ -1748196700);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String III(int var0, int var1) {
      int var9 = -16354562;
      int var2 = (var0 ^ Ill(1734103934, var9 ^ 151297712)) & Ill(1734103935, var9 ^ -2057215008);
      if (IIl[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & Ill(1734103920, var9 ^ 1636815291)) {
            case 0 -> Ill(1734103921, var9 ^ 1201026989);
            case 1 -> Ill(1734103922, var9 ^ 930638228);
            case 2 -> Ill(1734103923, var9 ^ -1789270444);
            case 3 -> Ill(1734103924, var9 ^ -1077680909);
            case 4 -> Ill(1734103925, var9 ^ -1482798269);
            case 5 -> Ill(1734103926, var9 ^ -1825117020);
            case 6 -> Ill(1734103927, var9 ^ 848938272);
            case 7 -> Ill(1734103912, var9 ^ -537538227);
            case 8 -> Ill(1734103913, var9 ^ 630543791);
            case 9 -> Ill(1734103914, var9 ^ -1587925730);
            case 10 -> Ill(1734103915, var9 ^ 230083689);
            case 11 -> Ill(1734103916, var9 ^ 1707124316);
            case 12 -> Ill(1734103917, var9 ^ -417101415);
            case 13 -> Ill(1734103918, var9 ^ -35371017);
            case 14 -> Ill(1734103919, var9 ^ 1138889540);
            case 15 -> 0;
            case 16 -> Ill(1734103904, var9 ^ 567511771);
            case 17 -> Ill(1734103905, var9 ^ 503381739);
            case 18 -> Ill(1734103906, var9 ^ -187595688);
            case 19 -> Ill(1734103907, var9 ^ -866887921);
            case 20 -> 1;
            case 21 -> Ill(1734103908, var9 ^ -1862587947);
            case 22 -> Ill(1734103909, var9 ^ 63058325);
            case 23 -> Ill(1734103910, var9 ^ 32432622);
            case 24 -> Ill(1734103911, var9 ^ -1647049941);
            case 25 -> Ill(1734103832, var9 ^ -2068187036);
            case 26 -> Ill(1734103833, var9 ^ 1119421356);
            case 27 -> Ill(1734103834, var9 ^ -616647399);
            case 28 -> Ill(1734103835, var9 ^ -1183271444);
            case 29 -> Ill(1734103836, var9 ^ -99635316);
            case 30 -> Ill(1734103837, var9 ^ 1968805282);
            case 31 -> Ill(1734103838, var9 ^ 1259906498);
            case 32 -> Ill(1734103839, var9 ^ -1920178310);
            case 33 -> Ill(1734103824, var9 ^ 410964335);
            case 34 -> Ill(1734103825, var9 ^ -1046672663);
            case 35 -> Ill(1734103826, var9 ^ 920843438);
            case 36 -> Ill(1734103827, var9 ^ -540783308);
            case 37 -> Ill(1734103828, var9 ^ 1472388869);
            case 38 -> Ill(1734103829, var9 ^ 572260238);
            case 39 -> Ill(1734103830, var9 ^ -875156462);
            case 40 -> Ill(1734103831, var9 ^ -1103822820);
            case 41 -> Ill(1734103816, var9 ^ 1339585090);
            case 42 -> Ill(1734103817, var9 ^ 805999797);
            case 43 -> Ill(1734103818, var9 ^ -1628898146);
            case 44 -> Ill(1734103819, var9 ^ 928943623);
            case 45 -> Ill(1734103820, var9 ^ 1638889300);
            case 46 -> Ill(1734103821, var9 ^ -1316921036);
            case 47 -> Ill(1734103822, var9 ^ -896714460);
            case 48 -> Ill(1734103823, var9 ^ -604433033);
            case 49 -> Ill(1734103808, var9 ^ 1075747793);
            case 50 -> Ill(1734103809, var9 ^ 307695557);
            case 51 -> Ill(1734103810, var9 ^ -481581114);
            case 52 -> Ill(1734103811, var9 ^ -171597007);
            case 53 -> Ill(1734103812, var9 ^ -1214698550);
            case 54 -> Ill(1734103813, var9 ^ 2119163928);
            case 55 -> Ill(1734103814, var9 ^ -335707064);
            case 56 -> Ill(1734103815, var9 ^ -1385269385);
            case 57 -> Ill(1734103864, var9 ^ 347699641);
            case 58 -> Ill(1734103865, var9 ^ 429907346);
            case 59 -> Ill(1734103866, var9 ^ 2063195340);
            case 60 -> Ill(1734103867, var9 ^ -1791444580);
            case 61 -> Ill(1734103868, var9 ^ -1904200831);
            case 62 -> Ill(1734103869, var9 ^ -211854363);
            case 63 -> Ill(1734103870, var9 ^ 838551945);
            case 64 -> Ill(1734103871, var9 ^ 1484788242);
            case 65 -> Ill(1734103856, var9 ^ 1110865935);
            case 66 -> Ill(1734103857, var9 ^ -449073598);
            case 67 -> Ill(1734103858, var9 ^ -40173645);
            case 68 -> Ill(1734103859, var9 ^ 1330731124);
            case 69 -> Ill(1734103860, var9 ^ -600047239);
            case 70 -> Ill(1734103861, var9 ^ -1185022024);
            case 71 -> Ill(1734103862, var9 ^ 1569578334);
            case 72 -> Ill(1734103863, var9 ^ -823218763);
            case 73 -> Ill(1734103848, var9 ^ 752016262);
            case 74 -> Ill(1734103849, var9 ^ 1690884693);
            case 75 -> Ill(1734103850, var9 ^ -2131523845);
            case 76 -> Ill(1734103851, var9 ^ -655356692);
            case 77 -> Ill(1734103852, var9 ^ 356501871);
            case 78 -> Ill(1734103853, var9 ^ 71696251);
            case 79 -> Ill(1734103854, var9 ^ -1034476516);
            case 80 -> Ill(1734103855, var9 ^ -1392615434);
            case 81 -> Ill(1734103840, var9 ^ 1122025576);
            case 82 -> Ill(1734103841, var9 ^ 670938419);
            case 83 -> Ill(1734103842, var9 ^ -65076325);
            case 84 -> Ill(1734103843, var9 ^ 652166063);
            case 85 -> Ill(1734103844, var9 ^ -1012402706);
            case 86 -> Ill(1734103845, var9 ^ 2125283709);
            case 87 -> Ill(1734103846, var9 ^ -1397111551);
            case 88 -> Ill(1734103847, var9 ^ -459200298);
            case 89 -> Ill(1734104024, var9 ^ -1771336433);
            case 90 -> Ill(1734104025, var9 ^ 1445099339);
            case 91 -> Ill(1734104026, var9 ^ -1643447284);
            case 92 -> Ill(1734104027, var9 ^ -1276682540);
            case 93 -> Ill(1734104028, var9 ^ 574458932);
            case 94 -> Ill(1734104029, var9 ^ -2070427896);
            case 95 -> Ill(1734104030, var9 ^ -1500300501);
            case 96 -> Ill(1734104031, var9 ^ -1752643688);
            case 97 -> Ill(1734104016, var9 ^ 1515777887);
            case 98 -> Ill(1734104017, var9 ^ 1107109990);
            case 99 -> Ill(1734104018, var9 ^ -309913564);
            case 100 -> Ill(1734104019, var9 ^ 1941790157);
            case 101 -> Ill(1734104020, var9 ^ -994957690);
            case 102 -> Ill(1734104021, var9 ^ -875797272);
            case 103 -> Ill(1734104022, var9 ^ -617943080);
            case 104 -> Ill(1734104023, var9 ^ -988503504);
            case 105 -> Ill(1734104008, var9 ^ 1430554636);
            case 106 -> Ill(1734104009, var9 ^ 959263588);
            case 107 -> Ill(1734104010, var9 ^ -649049154);
            case 108 -> Ill(1734104011, var9 ^ -454131505);
            case 109 -> Ill(1734104012, var9 ^ 1765202502);
            case 110 -> Ill(1734104013, var9 ^ 703769726);
            case 111 -> Ill(1734104014, var9 ^ -592863854);
            case 112 -> Ill(1734104015, var9 ^ -556196436);
            case 113 -> Ill(1734104000, var9 ^ 704806786);
            case 114 -> Ill(1734104001, var9 ^ 1988849615);
            case 115 -> Ill(1734104002, var9 ^ 1074714969);
            case 116 -> Ill(1734104003, var9 ^ 1481230622);
            case 117 -> Ill(1734104004, var9 ^ -1291724171);
            case 118 -> Ill(1734104005, var9 ^ -112760757);
            case 119 -> Ill(1734104006, var9 ^ 1446984853);
            case 120 -> Ill(1734104007, var9 ^ 891099814);
            case 121 -> Ill(1734104056, var9 ^ -201082918);
            case 122 -> Ill(1734104057, var9 ^ 541279277);
            case 123 -> Ill(1734104058, var9 ^ -412017269);
            case 124 -> Ill(1734104059, var9 ^ 1274045112);
            case 125 -> Ill(1734104060, var9 ^ 1997064002);
            case 126 -> Ill(1734104061, var9 ^ -963651250);
            case 127 -> Ill(1734104062, var9 ^ 1800162170);
            case 128 -> Ill(1734104063, var9 ^ 1101495498);
            case 129 -> Ill(1734104048, var9 ^ -1271758603);
            case 130 -> Ill(1734104049, var9 ^ 27200632);
            case 131 -> Ill(1734104050, var9 ^ -777077170);
            case 132 -> Ill(1734104051, var9 ^ -1870786711);
            case 133 -> Ill(1734104052, var9 ^ -2144032975);
            case 134 -> Ill(1734104053, var9 ^ 1691144276);
            case 135 -> Ill(1734104054, var9 ^ 924386471);
            case 136 -> Ill(1734104055, var9 ^ -171052819);
            case 137 -> Ill(1734104040, var9 ^ -880597512);
            case 138 -> Ill(1734104041, var9 ^ 1012775029);
            case 139 -> Ill(1734104042, var9 ^ 1131036871);
            case 140 -> Ill(1734104043, var9 ^ 246784221);
            case 141 -> Ill(1734104044, var9 ^ 281438300);
            case 142 -> Ill(1734104045, var9 ^ 1474048153);
            case 143 -> Ill(1734104046, var9 ^ 638645586);
            case 144 -> Ill(1734104047, var9 ^ -1839461466);
            case 145 -> Ill(1734104032, var9 ^ -1445183319);
            case 146 -> Ill(1734104033, var9 ^ 278595615);
            case 147 -> Ill(1734104034, var9 ^ 1508811967);
            case 148 -> Ill(1734104035, var9 ^ -173638084);
            case 149 -> Ill(1734104036, var9 ^ -429654715);
            case 150 -> Ill(1734104037, var9 ^ 1341839870);
            case 151 -> Ill(1734104038, var9 ^ -541816600);
            case 152 -> Ill(1734104039, var9 ^ 141201819);
            case 153 -> 3;
            case 154 -> Ill(1734103960, var9 ^ -1795705949);
            case 155 -> Ill(1734103961, var9 ^ -1116162375);
            case 156 -> Ill(1734103962, var9 ^ -1577648225);
            case 157 -> Ill(1734103963, var9 ^ -1634609225);
            case 158 -> Ill(1734103964, var9 ^ 1246171869);
            case 159 -> Ill(1734103965, var9 ^ 1036733962);
            case 160 -> Ill(1734103966, var9 ^ 1147508878);
            case 161 -> Ill(1734103967, var9 ^ -1041115737);
            case 162 -> Ill(1734103952, var9 ^ -665731738);
            case 163 -> Ill(1734103953, var9 ^ 1686559036);
            case 164 -> Ill(1734103954, var9 ^ -66735191);
            case 165 -> Ill(1734103955, var9 ^ 1105443072);
            case 166 -> Ill(1734103956, var9 ^ 1821616135);
            case 167 -> Ill(1734103957, var9 ^ -1463619582);
            case 168 -> Ill(1734103958, var9 ^ 701933132);
            case 169 -> Ill(1734103959, var9 ^ -1120095906);
            case 170 -> Ill(1734103944, var9 ^ 264015177);
            case 171 -> Ill(1734103945, var9 ^ -5321635);
            case 172 -> Ill(1734103946, var9 ^ -251564251);
            case 173 -> Ill(1734103947, var9 ^ -1606522082);
            case 174 -> Ill(1734103948, var9 ^ -1824592582);
            case 175 -> Ill(1734103949, var9 ^ -672249146);
            case 176 -> Ill(1734103950, var9 ^ -1694169062);
            case 177 -> Ill(1734103951, var9 ^ 1990930833);
            case 178 -> Ill(1734103936, var9 ^ -1720180103);
            case 179 -> Ill(1734103937, var9 ^ -1588336597);
            case 180 -> Ill(1734103938, var9 ^ -1270054977);
            case 181 -> Ill(1734103939, var9 ^ -1710142882);
            case 182 -> Ill(1734103940, var9 ^ -1960433446);
            case 183 -> Ill(1734103941, var9 ^ -778413786);
            case 184 -> Ill(1734103942, var9 ^ -889356267);
            case 185 -> Ill(1734103943, var9 ^ -1856869948);
            case 186 -> Ill(1734103992, var9 ^ 321036908);
            case 187 -> Ill(1734103993, var9 ^ -2090313075);
            case 188 -> Ill(1734103994, var9 ^ 682164410);
            case 189 -> Ill(1734103995, var9 ^ 1711796913);
            case 190 -> Ill(1734103996, var9 ^ -914787991);
            case 191 -> Ill(1734103997, var9 ^ -1167123822);
            case 192 -> Ill(1734103998, var9 ^ -933341633);
            case 193 -> Ill(1734103999, var9 ^ -1675299494);
            case 194 -> Ill(1734103984, var9 ^ -1976885297);
            case 195 -> Ill(1734103985, var9 ^ 1246155246);
            case 196 -> Ill(1734103986, var9 ^ -1626812025);
            case 197 -> Ill(1734103987, var9 ^ -2086878903);
            case 198 -> Ill(1734103988, var9 ^ -1069262268);
            case 199 -> Ill(1734103989, var9 ^ 1910192329);
            case 200 -> Ill(1734103990, var9 ^ -1007602754);
            case 201 -> Ill(1734103991, var9 ^ 1345797679);
            case 202 -> 2;
            case 203 -> Ill(1734103976, var9 ^ 670346769);
            case 204 -> Ill(1734103977, var9 ^ 2102853112);
            case 205 -> Ill(1734103978, var9 ^ -2081323140);
            case 206 -> Ill(1734103979, var9 ^ 462414722);
            case 207 -> Ill(1734103980, var9 ^ -664056665);
            case 208 -> Ill(1734103981, var9 ^ -2091363288);
            case 209 -> Ill(1734103982, var9 ^ 1556817925);
            case 210 -> Ill(1734103983, var9 ^ 1870478950);
            case 211 -> Ill(1734103968, var9 ^ 1719409191);
            case 212 -> Ill(1734103969, var9 ^ -2061483657);
            case 213 -> Ill(1734103970, var9 ^ 1458592457);
            case 214 -> Ill(1734103971, var9 ^ -1869542600);
            case 215 -> Ill(1734103972, var9 ^ -2071858081);
            case 216 -> Ill(1734103973, var9 ^ 1630199909);
            case 217 -> Ill(1734103974, var9 ^ 1571856937);
            case 218 -> Ill(1734103975, var9 ^ 1081296530);
            case 219 -> Ill(1734103640, var9 ^ -256821230);
            case 220 -> Ill(1734103641, var9 ^ 1808207827);
            case 221 -> Ill(1734103642, var9 ^ 1537828461);
            case 222 -> Ill(1734103643, var9 ^ -1474886618);
            case 223 -> Ill(1734103644, var9 ^ -2133974900);
            case 224 -> Ill(1734103645, var9 ^ -561635090);
            case 225 -> Ill(1734103646, var9 ^ -800513192);
            case 226 -> Ill(1734103647, var9 ^ -383486418);
            case 227 -> Ill(1734103632, var9 ^ -937295174);
            case 228 -> Ill(1734103633, var9 ^ 1113450911);
            case 229 -> Ill(1734103634, var9 ^ -1211383959);
            case 230 -> Ill(1734103635, var9 ^ 42147249);
            case 231 -> Ill(1734103636, var9 ^ -977212692);
            case 232 -> 4;
            case 233 -> Ill(1734103637, var9 ^ 1054545703);
            case 234 -> Ill(1734103638, var9 ^ -1819916);
            case 235 -> Ill(1734103639, var9 ^ -1841352338);
            case 236 -> Ill(1734103624, var9 ^ 331350741);
            case 237 -> Ill(1734103625, var9 ^ 910527913);
            case 238 -> Ill(1734103626, var9 ^ -12508827);
            case 239 -> Ill(1734103627, var9 ^ -275969786);
            case 240 -> Ill(1734103628, var9 ^ 1734078129);
            case 241 -> Ill(1734103629, var9 ^ 1847644904);
            case 242 -> Ill(1734103630, var9 ^ 164208642);
            case 243 -> Ill(1734103631, var9 ^ -1439513229);
            case 244 -> Ill(1734103616, var9 ^ 340675035);
            case 245 -> Ill(1734103617, var9 ^ 458280815);
            case 246 -> Ill(1734103618, var9 ^ -702373329);
            case 247 -> Ill(1734103619, var9 ^ 1708670572);
            case 248 -> Ill(1734103620, var9 ^ -337629167);
            case 249 -> Ill(1734103621, var9 ^ -1339806781);
            case 250 -> Ill(1734103622, var9 ^ -296472400);
            case 251 -> Ill(1734103623, var9 ^ -163735137);
            case 252 -> 5;
            case 253 -> Ill(1734103672, var9 ^ -1280902343);
            case 254 -> Ill(1734103673, var9 ^ 751532037);
            default -> Ill(1734103674, var9 ^ 1764467263);
         };
         int var5 = (var1 & Ill(1734103675, var9 ^ -528382581)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Ill(1734103676, var9 ^ -587358261)) >>> Ill(1734103677, var9 ^ 1110698183)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Ill(1734103678, var9 ^ 1675043551);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Ill(1734103679, var9 ^ 2013470336);
            }
         }

         IIl[var2] = new String(var3).intern();
      }

      return IIl[var2];
   }

   @Override
   public void llIl() {
      this.lI();
   }

   private void IIl(class_310 var1) {
      if (var1 == null || !this.Il(var1)) {
         this.lI();
      } else if (this.II.II()) {
         if (this.l(var1)) {
            this.II.Il(this.III.IIlI(), this.III.IlI());
         }
      }
   }
}
