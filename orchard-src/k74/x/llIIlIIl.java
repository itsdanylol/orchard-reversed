package k74.x;

import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_4604;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

@Environment(EnvType.CLIENT)
record llIIlIIl(class_4184 a, class_4604 b, class_757 c, Matrix4f viewMatrix, Matrix4f projectionMatrix) {
   private static String[] I;
   private final Matrix4f l;
   private static final String[] II;
   private static final int[] IlI;
   private static final String[] Il;
   private final Matrix4f lI;
   private final class_4184 ll;
   private static final Object[] lII;
   private final class_4604 III;
   private static final String[] Ill;
   private final class_757 IIl;

   private llIIlIIl(class_4184 a, class_4604 b, class_757 c, Matrix4f viewMatrix, Matrix4f projectionMatrix) {
      this.ll = a;
      this.III = b;
      this.IIl = c;
      this.l = viewMatrix;
      this.lI = projectionMatrix;
   }

   private static String I(char[] var0, long var1, int var3) {
      int var4 = lIl(862676687, -849730774 ^ -1755268623) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIl(862676686, -849730774 ^ 1878719566);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public Matrix4f l() {
      return this.lI;
   }

   public class_4604 II() {
      return this.III;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -2079601547;
      char[] var15 = "G%".toCharArray();
      byte var20 = -1;
      short var13 = 22497;
      String var14 = "⬒睥굮\uf3f5峤ļ텆惞⇞ﮜ릊\ue690煃吧\udb55\udb06贖̈́Ἓᓇ젍㒪⯁\ue919鏇껄퀡ꭃ\uf837ᝉ\uf828ﰅ禞蘃牅뎸⍍ㄱ\udee1\uf8d4\uf53f\u0bad謧ꐤ鐮赋頏頎\uf85c\uf8fcꄽ\udf69摓\u193f赼\ue937ㅽ窠䑠乵\uf6bb뉐肽\ueddf\uf39dᘯ鶇ꧡ饪䐠卉ᦳ獜볃駝径蓎\ue5d4ᣳ鰸흕¡併䏿꿌짼ꍳ\uf59fﳶ呮媃ጶ鸇뤼线㛣\uf6c5\u0bc5\uf424ꄮ䈌皲䠸馁虌\udc9e溭毶";
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            Ill = var16;
            lII = new Object[var16.length];
            int var9 = 1718326051;
            byte[] var7 = "/G\fò\b^ïª\u001c¢0Lî1\u001dÌ;³\u0086\r¢öµjn'1\u0006÷3\u0083sXòDã½¹!·\u001aY7¤\u0094Ø\u0088ºgH0ÿ\u0007Qþ87fl\u000b\u0014äNJdQ´»Oú]C\u0013uä.÷Y\u001bl[º\u0081\u0004¯W\u0013f`z]÷êñÎýÌxÞ½Þ\u0011\u0088,H¾Ý A\u00124\bÑl \u0085ªíäÝ±Ù}\u0086\u009b¾{6kóª8ÄÀºF\\\u0088ÌÔæfQ>Þþëùz»ô\u00997\u001a\u0014ùy\u0010z>\u001c.m«×4Õ4\u009f>\u001dßps\u0012ÞÐ\u0007M\u00880ü\u0099uÉLáQ\u0005\u008d \u008cy\tæ:«7¡ª¾@\u0083DRXW-×2\u009fÔÆá.÷\u0085¸\u0007*\u0080E`\u009bl\u0011\u0080\u0003²Öp\u0099¨\u0000áYwÝF³\u001a\u001dVU\u0001(ôî\u001bsÊÏwÆ\u001c\u0095¿!E\n#Àöb\u0092ª:P¼s98\u0097ÇM\u0019¬·)Vhµ±\u009cÀ³rty\u008aØúuç!4E\u001fSL°\u008cø\u0088çÜî*vù×LÛÅÚ\u0019%\u008dÄ·)ïM$q\u007fËA\u0082\u0084NÇ¡\u009d\u0098¢Uiÿ\u009e?s·æ\u0089Î\u0012 %8\u001bÉØÊ\u0084J÷:\u001eA1\u009aur1íéË¸\u0094!6¡\u0001(©\u008b÷ôM\u0084/ÐÝ\u009av\u001aÅY l\u0090£®\u0017gö\u0004Â©Ù×3|ÎÃo\u0004\r\n)Í\u008bëÀâP\u0017ª§\u0084Ü\u0088-Ç\u007f¤eW»ªÿíf\u00ad\u0003*½VÓÒÇj(z·\u000f8×\u0082\u007f¶\u001cÏ\rÀñ\u0083³¦ åml¿\u0012b\u0089\u009b;©Êdî\u000e×OyÑÈºQ<\u008f2t©D<\u0082\u0014\u0019Þ³\rõÂ\u007fîUë\u0000M´\u0000%]èS¨?\u0083ùM\u0005 dí&n&«Ù\\\n§LNû³0ÈLD®&\u0007ØÛ\u001dúªAn(:2Ç5<È1ÚqÞf6\u0003:\u0013ñ#\u0097\u008fóÞb°fî]\u000bá\u0004\u0002};ÙJ O\u0013h\u0011q\u0098#B\u0015\u008b<Æ9#8]«<Iºæ\b\u0017L¥©Î\u0085 \u0096\u0097\u0082 ø®-)ñâQþò¡(¿@uð\u0004~\u0012;EA\u001f_`ã\u0094ÐÙ?ô\u008a\u0098^wî\u0091èh'~\u0091\u0004ò¶Hýó½ÜÔ\u00adáR¶W.$g-hK¿KÐ\u001e:ÑòAÍÏ5E\u008f«¦U\u009eK\u009dÐ\u000e\u009a\u0097mÏÄQ à£§a\u0083\u0085'\u0002á¹ >O¥<\u001b6\u0010Ï\u0006G\u0014Ê`\u0090\u0000NZí\u0099Dù\u0010½\u009285\týå\u001dgï\u0018@p\u0099÷¶*V@{Kã\u0097\u0081Òø²5è®à¬çl/l4\u0010\u0006µO´\u0084ÄOÙö\u008dyg\u0017£ã\u0000t@&²\u008dpsvwã¡\u0095Âzì\u0092iîlR\u008c·Á\u008fV¾¯¡6\t\f%ú\u0010è\u0003þX\u000f\u000ffæ\u001bj,bãÛ¼\u0080\u009d\\Xä$ª\u0084v\u0090\u008d5L\u0091£)9A-ºx·\u0011}Àøýt¡@4.£e\u009f\u009eÿW\u0014Ù\u008a[Ü\u0085d0\u0084%ÑÇÝ¶ð\u0087±7¸rM/\u0085\u0013\u0012\u0081ß\u0013\u0005\u0014Çln[à±\u0090/Â\u0088Ù\u009dswd`(F7\u000e\u0090ÿ¨Ç\u001cJè9þ¿Vë\u0016>òý$5b\u0007ZH¼Å\u0086}\u0086\u008etÅ\u007f÷Ô?®#\u000e=\u000eçû\u0083ûü1Wf\t/\r@]èæ`õ\nzT\u0093óÒ\u0000\u0013\u0098Ï\u0001ö*¸\u0082êS\u009fÛ«j§?\\\u0000îÐ9À>\u0007Ò\\|~\u007fí1\u0002<4{\u008f\u008e[\u0002Ïð£h´&|¦1ÆuÚ\u0006\u009c \u0093Ä°V5yÖ\u0012ÚñKF\u0086qé\u0095\u001fçÐ2uhf®½Éx\u0083h-ÔC:öÞ\u001e6/ga9(ý\u0097\u001bJCr×Ï%¡æðaQ\u0082o>4Ä°\u0089ìÚµ\u0010\u0012/\u001eÍ¨\u0086\u0097Np¢\tNÅ\u0093]h8¥K®ö<\u0083±|rø\u0002°$±g.¸g\u000e\u0087l\f\u0088`ýÑ¥Yÿ³îè\f\bÎ\u008a\u0099_¢#3\u0006DÏñ"
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

            String[] var5 = new String[lIl(862676685, var24 ^ 844584809)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = llI(var24 ^ 287892458, '꒾', (short)'颼')).length();
            int var1 = lIl(862676684, var24 ^ -1060865310);
            int var26 = -1;

            label100:
            while (true) {
               int var29 = lIl(862676683, var24 ^ 356966741);
               String var10001 = var2.substring(++var26, var26 + var1);
               byte var10002 = -1;

               while (true) {
                  label95: {
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
                           break label95;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lIl(862676679, var24 ^ 1980179401)) {
                           case 0 -> lIl(862676678, var24 ^ -1823717659);
                           case 1 -> lIl(862676677, var24 ^ 883708123);
                           case 2 -> lIl(862676676, var24 ^ -1171425882);
                           case 3 -> lIl(862676675, var24 ^ 1237145525);
                           case 4 -> lIl(862676674, var24 ^ 698653047);
                           case 5 -> lIl(862676673, var24 ^ 429101375);
                           default -> lIl(862676672, var24 ^ 974238542);
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
                           II = new String[lIl(862676680, var24 ^ -641276845)];
                           I = new String[lIl(862676703, var24 ^ 1252316044)];
                           ll();
                           return;
                        }

                        var1 = var2.charAt(var26);
                        break;
                     default:
                        var5[var3++] = var50;
                        if ((var26 += var1) < var4) {
                           var1 = var2.charAt(var26);
                           continue label100;
                        }

                        var4 = (var2 = llI(var24 ^ -350322462, '꒿', (short)'렇')).length();
                        var1 = lIl(862676682, var24 ^ -1945906630);
                        var26 = -1;
                  }

                  var29 = lIl(862676681, var24 ^ 1087556615);
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
                  default -> 95;
                  case 1 -> 184;
                  case 2 -> 146;
                  case 3 -> 96;
                  case 4 -> 177;
                  case 5 -> 216;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static <T> T Il(Object var0, Class<T> var1, String... var2) {
      String[] var4 = var2;
      String[] var10000 = IIllllIl.IIIIl();
      int var5 = var2.length;
      String[] var3 = var10000;
      int var6 = 0;

      while (var6 < var5) {
         String var7 = var4[var6];

         try {
            Method var8 = var0.getClass().getMethod(var7);
            var8.setAccessible(true);
            Object var9 = var8.invoke(var0);
            if (var1.isInstance(var9)) {
               return (T)var1.cast(var9);
            }
         } catch (ReflectiveOperationException var10) {
         }

         var6++;
         if (var3 != null) {
            break;
         }
      }

      return null;
   }

   private static int lIl(int var0, int var1) {
      int var2 = IlI[var0 ^ 862676687] ^ var1 ^ var0;
      var2 -= 8574;
      var2 += 53775;
      var2 ^= 45950;
      var2 -= 10557;
      var2 ^= 4271;
      var2 ^= 21915;
      return var2 + 10310;
   }

   private static Matrix4f lI(Object var0, String... var1) {
      String[] var3 = var1;
      String[] var10000 = IIllllIl.IIIIl();
      int var4 = var1.length;
      int var5 = 0;
      String[] var2 = var10000;

      while (var5 < var4) {
         String var6 = var3[var5];

         try {
            Method var7 = var0.getClass().getMethod(var6);
            var7.setAccessible(true);
            if (var7.invoke(var0) instanceof Matrix4fc var9) {
               return new Matrix4f(var9);
            }
         } catch (ReflectiveOperationException var10) {
         }

         var5++;
         if (var2 != null) {
            break;
         }
      }

      return null;
   }

   private static void ll() {
      int var0 = -1686157151;
      I[0] = I(IlI(lIl(862676702, var0 ^ 2121951976), lIl(862676701, var0 ^ -586524913)).toCharArray(), 38311L, lIl(862676700, var0 ^ 1261757244));
      I[1] = I(IlI(lIl(862676699, var0 ^ 1782232744), lIl(862676698, var0 ^ -1630139324)).toCharArray(), 99168L, lIl(862676697, var0 ^ 2054100692));
      I[2] = I(IlI(lIl(862676696, var0 ^ -613287587), lIl(862676695, var0 ^ 34038910)).toCharArray(), 41076L, lIl(862676694, var0 ^ -1305908316));
      I[3] = I(IlI(lIl(862676693, var0 ^ 2034166403), lIl(862676692, var0 ^ 1888639916)).toCharArray(), 18390L, lIl(862676691, var0 ^ -94656017));
      I[4] = I(IlI(lIl(862676690, var0 ^ -1687301259), lIl(862676689, var0 ^ -2141694185)).toCharArray(), 45518L, lIl(862676688, var0 ^ -592062691));
      I[5] = I(IlI(lIl(862676719, var0 ^ 1517526436), lIl(862676718, var0 ^ -180238639)).toCharArray(), 14368L, lIl(862676717, var0 ^ -1843331836));
   }

   public Matrix4f III() {
      return this.l;
   }

   private static String llI(int var0, char var1, short var2) {
      int var3 = var1 ^ '꒾';
      char[] var4 = Ill[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lII[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lII[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 24347;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '됻';
         var10 += 21696;
         var10 -= 37946;
         var10 ^= 41790;
         var10 += 36841;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static String IlI(int var0, int var1) {
      int var9 = 765784279;
      int var2 = (var0 ^ lIl(862676716, var9 ^ 1631444690)) & lIl(862676715, var9 ^ 1504032453);
      if (II[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & lIl(862676714, var9 ^ -35572572)) {
            case 0 -> lIl(862676713, var9 ^ -1337928330);
            case 1 -> lIl(862676712, var9 ^ -28657029);
            case 2 -> lIl(862676711, var9 ^ -1686852119);
            case 3 -> lIl(862676710, var9 ^ 1349422822);
            case 4 -> lIl(862676709, var9 ^ 409263497);
            case 5 -> lIl(862676708, var9 ^ -148253995);
            case 6 -> lIl(862676707, var9 ^ 1465748706);
            case 7 -> lIl(862676706, var9 ^ -1213834966);
            case 8 -> lIl(862676705, var9 ^ 1310073034);
            case 9 -> lIl(862676704, var9 ^ -2099774597);
            case 10 -> lIl(862676735, var9 ^ -28066320);
            case 11 -> lIl(862676734, var9 ^ 745405050);
            case 12 -> lIl(862676733, var9 ^ 958022328);
            case 13 -> lIl(862676732, var9 ^ -721250549);
            case 14 -> lIl(862676731, var9 ^ 1349017260);
            case 15 -> lIl(862676730, var9 ^ 1102804254);
            case 16 -> lIl(862676729, var9 ^ 48416543);
            case 17 -> lIl(862676728, var9 ^ 119513238);
            case 18 -> lIl(862676727, var9 ^ -347350042);
            case 19 -> lIl(862676726, var9 ^ 898413035);
            case 20 -> lIl(862676725, var9 ^ 794435905);
            case 21 -> lIl(862676724, var9 ^ -259553338);
            case 22 -> lIl(862676723, var9 ^ -1656252431);
            case 23 -> lIl(862676722, var9 ^ -2039335796);
            case 24 -> 5;
            case 25 -> lIl(862676721, var9 ^ -1675031739);
            case 26 -> lIl(862676720, var9 ^ -258155243);
            case 27 -> lIl(862676623, var9 ^ 947619089);
            case 28 -> lIl(862676622, var9 ^ -1533397391);
            case 29 -> lIl(862676621, var9 ^ 368075248);
            case 30 -> lIl(862676620, var9 ^ 992567938);
            case 31 -> lIl(862676619, var9 ^ 278760476);
            case 32 -> lIl(862676618, var9 ^ 736981696);
            case 33 -> lIl(862676617, var9 ^ -269520508);
            case 34 -> lIl(862676616, var9 ^ 1206498294);
            case 35 -> lIl(862676615, var9 ^ -19916667);
            case 36 -> lIl(862676614, var9 ^ -222463239);
            case 37 -> lIl(862676613, var9 ^ -1035627720);
            case 38 -> lIl(862676612, var9 ^ 936786084);
            case 39 -> lIl(862676611, var9 ^ 1619406364);
            case 40 -> lIl(862676610, var9 ^ -240970089);
            case 41 -> lIl(862676609, var9 ^ 1553930874);
            case 42 -> lIl(862676608, var9 ^ -1562966897);
            case 43 -> lIl(862676639, var9 ^ -1363833676);
            case 44 -> lIl(862676638, var9 ^ -165344605);
            case 45 -> lIl(862676637, var9 ^ 98471621);
            case 46 -> lIl(862676636, var9 ^ 650625793);
            case 47 -> lIl(862676635, var9 ^ -768393714);
            case 48 -> lIl(862676634, var9 ^ -1205242360);
            case 49 -> lIl(862676633, var9 ^ 244599290);
            case 50 -> lIl(862676632, var9 ^ -1570619267);
            case 51 -> lIl(862676631, var9 ^ 1603290177);
            case 52 -> lIl(862676630, var9 ^ 1885357505);
            case 53 -> lIl(862676629, var9 ^ -1228884868);
            case 54 -> lIl(862676628, var9 ^ -1229510168);
            case 55 -> lIl(862676627, var9 ^ 1070522705);
            case 56 -> lIl(862676626, var9 ^ 643557817);
            case 57 -> lIl(862676625, var9 ^ 212677711);
            case 58 -> lIl(862676624, var9 ^ 58003589);
            case 59 -> lIl(862676655, var9 ^ 489478860);
            case 60 -> lIl(862676654, var9 ^ -553996958);
            case 61 -> lIl(862676653, var9 ^ 620025706);
            case 62 -> lIl(862676652, var9 ^ 1901986646);
            case 63 -> lIl(862676651, var9 ^ 1586361200);
            case 64 -> lIl(862676650, var9 ^ 1234808543);
            case 65 -> 1;
            case 66 -> lIl(862676649, var9 ^ -1974408755);
            case 67 -> lIl(862676648, var9 ^ 212926794);
            case 68 -> lIl(862676647, var9 ^ -682757862);
            case 69 -> lIl(862676646, var9 ^ 59131929);
            case 70 -> lIl(862676645, var9 ^ 1076192319);
            case 71 -> lIl(862676644, var9 ^ -790499054);
            case 72 -> lIl(862676643, var9 ^ 1782380190);
            case 73 -> lIl(862676642, var9 ^ -1377366717);
            case 74 -> lIl(862676641, var9 ^ 1436396105);
            case 75 -> lIl(862676640, var9 ^ -34746573);
            case 76 -> lIl(862676671, var9 ^ 1356381775);
            case 77 -> lIl(862676670, var9 ^ -1684711885);
            case 78 -> lIl(862676669, var9 ^ 1993992197);
            case 79 -> lIl(862676668, var9 ^ -1480640819);
            case 80 -> lIl(862676667, var9 ^ 944284389);
            case 81 -> lIl(862676666, var9 ^ 476146070);
            case 82 -> lIl(862676665, var9 ^ -474689846);
            case 83 -> 2;
            case 84 -> lIl(862676664, var9 ^ -937226216);
            case 85 -> 0;
            case 86 -> lIl(862676663, var9 ^ 1024195949);
            case 87 -> lIl(862676662, var9 ^ -1255214408);
            case 88 -> lIl(862676661, var9 ^ -1143417840);
            case 89 -> lIl(862676660, var9 ^ 1508494815);
            case 90 -> lIl(862676659, var9 ^ 1160064520);
            case 91 -> lIl(862676658, var9 ^ 1817873902);
            case 92 -> lIl(862676657, var9 ^ -2021680038);
            case 93 -> lIl(862676656, var9 ^ -722272262);
            case 94 -> lIl(862676559, var9 ^ 2115486731);
            case 95 -> lIl(862676558, var9 ^ -474486927);
            case 96 -> lIl(862676557, var9 ^ -1578034768);
            case 97 -> lIl(862676556, var9 ^ -1912793277);
            case 98 -> lIl(862676555, var9 ^ 2095706137);
            case 99 -> lIl(862676554, var9 ^ -887197716);
            case 100 -> lIl(862676553, var9 ^ -2138931174);
            case 101 -> lIl(862676552, var9 ^ 2112913506);
            case 102 -> lIl(862676551, var9 ^ -1352635977);
            case 103 -> lIl(862676550, var9 ^ -1301935854);
            case 104 -> lIl(862676549, var9 ^ 1563107070);
            case 105 -> lIl(862676548, var9 ^ -1319503229);
            case 106 -> lIl(862676547, var9 ^ 1987691978);
            case 107 -> lIl(862676546, var9 ^ 1954822601);
            case 108 -> lIl(862676545, var9 ^ -508256814);
            case 109 -> lIl(862676544, var9 ^ 1717459314);
            case 110 -> lIl(862676575, var9 ^ -1132229879);
            case 111 -> lIl(862676574, var9 ^ -934696659);
            case 112 -> lIl(862676573, var9 ^ -155027446);
            case 113 -> lIl(862676572, var9 ^ -1831732176);
            case 114 -> lIl(862676571, var9 ^ -1099302525);
            case 115 -> lIl(862676570, var9 ^ 744887005);
            case 116 -> lIl(862676569, var9 ^ 1632818791);
            case 117 -> lIl(862676568, var9 ^ 586354283);
            case 118 -> lIl(862676567, var9 ^ -1479750454);
            case 119 -> lIl(862676566, var9 ^ -1482527046);
            case 120 -> lIl(862676565, var9 ^ -1364516115);
            case 121 -> lIl(862676564, var9 ^ 2041078224);
            case 122 -> lIl(862676563, var9 ^ 941239943);
            case 123 -> lIl(862676562, var9 ^ -2094738802);
            case 124 -> lIl(862676561, var9 ^ -1038400466);
            case 125 -> lIl(862676560, var9 ^ -407284618);
            case 126 -> lIl(862676591, var9 ^ 1583691164);
            case 127 -> lIl(862676590, var9 ^ 520367271);
            case 128 -> lIl(862676589, var9 ^ 380807337);
            case 129 -> lIl(862676588, var9 ^ -104086459);
            case 130 -> lIl(862676587, var9 ^ 823278948);
            case 131 -> lIl(862676586, var9 ^ 981865593);
            case 132 -> lIl(862676585, var9 ^ 1711861030);
            case 133 -> lIl(862676584, var9 ^ -1451344793);
            case 134 -> lIl(862676583, var9 ^ -284066213);
            case 135 -> lIl(862676582, var9 ^ 1464138273);
            case 136 -> lIl(862676581, var9 ^ 1964707152);
            case 137 -> lIl(862676580, var9 ^ -1306571006);
            case 138 -> lIl(862676579, var9 ^ 554655600);
            case 139 -> lIl(862676578, var9 ^ 445304817);
            case 140 -> lIl(862676577, var9 ^ 272080289);
            case 141 -> lIl(862676576, var9 ^ -688211069);
            case 142 -> lIl(862676607, var9 ^ 540754689);
            case 143 -> lIl(862676606, var9 ^ -1604837002);
            case 144 -> lIl(862676605, var9 ^ -1486581988);
            case 145 -> lIl(862676604, var9 ^ -1153340124);
            case 146 -> lIl(862676603, var9 ^ 1214023272);
            case 147 -> lIl(862676602, var9 ^ 1295667482);
            case 148 -> lIl(862676601, var9 ^ -922700090);
            case 149 -> lIl(862676600, var9 ^ -1012674457);
            case 150 -> lIl(862676599, var9 ^ 358806919);
            case 151 -> lIl(862676598, var9 ^ 2059394530);
            case 152 -> 4;
            case 153 -> lIl(862676597, var9 ^ 1749188785);
            case 154 -> lIl(862676596, var9 ^ 514714997);
            case 155 -> lIl(862676595, var9 ^ -786777422);
            case 156 -> lIl(862676594, var9 ^ 1691172907);
            case 157 -> lIl(862676593, var9 ^ 2145973516);
            case 158 -> lIl(862676592, var9 ^ 700083314);
            case 159 -> lIl(862676495, var9 ^ -344609540);
            case 160 -> lIl(862676494, var9 ^ -1755548258);
            case 161 -> lIl(862676493, var9 ^ 870227818);
            case 162 -> lIl(862676492, var9 ^ 1588350380);
            case 163 -> lIl(862676491, var9 ^ -531799169);
            case 164 -> lIl(862676490, var9 ^ -2027021472);
            case 165 -> lIl(862676489, var9 ^ 903327936);
            case 166 -> lIl(862676488, var9 ^ -248700144);
            case 167 -> lIl(862676487, var9 ^ 311999056);
            case 168 -> lIl(862676486, var9 ^ 355675927);
            case 169 -> lIl(862676485, var9 ^ -707365109);
            case 170 -> lIl(862676484, var9 ^ 135036716);
            case 171 -> lIl(862676483, var9 ^ 644633110);
            case 172 -> lIl(862676482, var9 ^ -1566518912);
            case 173 -> lIl(862676481, var9 ^ -2069587611);
            case 174 -> lIl(862676480, var9 ^ -2009323823);
            case 175 -> lIl(862676511, var9 ^ -311019050);
            case 176 -> lIl(862676510, var9 ^ 1558594018);
            case 177 -> lIl(862676509, var9 ^ -620616364);
            case 178 -> lIl(862676508, var9 ^ 769570789);
            case 179 -> lIl(862676507, var9 ^ 175082564);
            case 180 -> lIl(862676506, var9 ^ 611579993);
            case 181 -> lIl(862676505, var9 ^ -1428112960);
            case 182 -> lIl(862676504, var9 ^ -1775828587);
            case 183 -> lIl(862676503, var9 ^ 2049899078);
            case 184 -> lIl(862676502, var9 ^ -1284218242);
            case 185 -> lIl(862676501, var9 ^ 415514172);
            case 186 -> lIl(862676500, var9 ^ -1820112080);
            case 187 -> lIl(862676499, var9 ^ 1541383549);
            case 188 -> lIl(862676498, var9 ^ 58690241);
            case 189 -> lIl(862676497, var9 ^ 1525428331);
            case 190 -> lIl(862676496, var9 ^ 913143977);
            case 191 -> lIl(862676527, var9 ^ -898284038);
            case 192 -> lIl(862676526, var9 ^ -1780801861);
            case 193 -> lIl(862676525, var9 ^ -2108777349);
            case 194 -> lIl(862676524, var9 ^ -385762419);
            case 195 -> lIl(862676523, var9 ^ 393544250);
            case 196 -> lIl(862676522, var9 ^ 1590110322);
            case 197 -> lIl(862676521, var9 ^ -482678505);
            case 198 -> lIl(862676520, var9 ^ -1336651356);
            case 199 -> lIl(862676519, var9 ^ 798874847);
            case 200 -> lIl(862676518, var9 ^ 1868774970);
            case 201 -> lIl(862676517, var9 ^ -776909528);
            case 202 -> lIl(862676516, var9 ^ 1973937326);
            case 203 -> lIl(862676515, var9 ^ -446889638);
            case 204 -> lIl(862676514, var9 ^ 1000332646);
            case 205 -> lIl(862676513, var9 ^ 30716943);
            case 206 -> lIl(862676512, var9 ^ -122874635);
            case 207 -> lIl(862676543, var9 ^ 695848656);
            case 208 -> lIl(862676542, var9 ^ -1984061282);
            case 209 -> lIl(862676541, var9 ^ 2091315604);
            case 210 -> lIl(862676540, var9 ^ -514592829);
            case 211 -> lIl(862676539, var9 ^ -955832259);
            case 212 -> lIl(862676538, var9 ^ -407909738);
            case 213 -> lIl(862676537, var9 ^ -741788860);
            case 214 -> lIl(862676536, var9 ^ -2025236458);
            case 215 -> lIl(862676535, var9 ^ -2035487779);
            case 216 -> lIl(862676534, var9 ^ 95457994);
            case 217 -> lIl(862676533, var9 ^ 1559342029);
            case 218 -> lIl(862676532, var9 ^ -1207516746);
            case 219 -> lIl(862676531, var9 ^ 1466145610);
            case 220 -> lIl(862676530, var9 ^ -2138530494);
            case 221 -> lIl(862676529, var9 ^ -115004280);
            case 222 -> lIl(862676528, var9 ^ -2056850265);
            case 223 -> lIl(862676943, var9 ^ 148111752);
            case 224 -> lIl(862676942, var9 ^ 1219126059);
            case 225 -> lIl(862676941, var9 ^ 863812718);
            case 226 -> lIl(862676940, var9 ^ -1231243919);
            case 227 -> lIl(862676939, var9 ^ -2117672946);
            case 228 -> lIl(862676938, var9 ^ 1139447440);
            case 229 -> lIl(862676937, var9 ^ -24325473);
            case 230 -> lIl(862676936, var9 ^ 1980832894);
            case 231 -> lIl(862676935, var9 ^ -156019594);
            case 232 -> lIl(862676934, var9 ^ 1619719024);
            case 233 -> lIl(862676933, var9 ^ -281217955);
            case 234 -> lIl(862676932, var9 ^ 1310906765);
            case 235 -> lIl(862676931, var9 ^ -1433501151);
            case 236 -> lIl(862676930, var9 ^ 1904533152);
            case 237 -> lIl(862676929, var9 ^ -1472355977);
            case 238 -> lIl(862676928, var9 ^ -1347957277);
            case 239 -> lIl(862676959, var9 ^ -853953966);
            case 240 -> lIl(862676958, var9 ^ 1216307450);
            case 241 -> lIl(862676957, var9 ^ 2000392535);
            case 242 -> lIl(862676956, var9 ^ -396037053);
            case 243 -> lIl(862676955, var9 ^ 936586321);
            case 244 -> lIl(862676954, var9 ^ 843764482);
            case 245 -> lIl(862676953, var9 ^ -1718095242);
            case 246 -> lIl(862676952, var9 ^ 269756984);
            case 247 -> lIl(862676951, var9 ^ -1911290751);
            case 248 -> lIl(862676950, var9 ^ -634193469);
            case 249 -> lIl(862676949, var9 ^ -856410355);
            case 250 -> 3;
            case 251 -> lIl(862676948, var9 ^ 82558120);
            case 252 -> lIl(862676947, var9 ^ 2136502535);
            case 253 -> lIl(862676946, var9 ^ 910028343);
            case 254 -> lIl(862676945, var9 ^ -531309183);
            default -> lIl(862676944, var9 ^ -1949158602);
         };
         int var5 = (var1 & lIl(862676975, var9 ^ 1459591367)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIl(862676974, var9 ^ 884323381)) >>> lIl(862676973, var9 ^ -1886072772)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIl(862676972, var9 ^ -654777848);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIl(862676971, var9 ^ -2128736563);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }

   public class_4184 Ill() {
      return this.ll;
   }

   private static llIIlIIl lII(Object var0) {
      if (var0 == null) {
         return new llIIlIIl(null, null, null, null, null);
      } else {
         class_4184 var1 = Il(var0, class_4184.class, IlIIllIII.lI(I[2]));
         class_4604 var2 = Il(var0, class_4604.class, IlIIllIII.lI(I[1]));
         class_757 var3 = Il(var0, class_757.class, IlIIllIII.lI(I[0]));
         Matrix4f var4 = lI(var0, IlIIllIII.lI(I[3]));
         Matrix4f var5 = lI(var0, IlIIllIII.lI(I[5]), IlIIllIII.lI(I[4]));
         return new llIIlIIl(var1, var2, var3, var4, var5);
      }
   }
}
