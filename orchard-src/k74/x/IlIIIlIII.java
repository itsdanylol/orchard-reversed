package k74.x;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class IlIIIlIII {
   private static final double I = 64.0;
   private static final String[] llI;
   public static final boolean l = true;
   private static final String[] II;
   public static final double Il = 0.01;
   public static final double lI = 0.01;
   private static final double ll = 32.0;
   private static final int[] lIl;
   private static final Object[] lll;
   private static final double III = 3.0;
   private static final String[] IIl;
   private static String[] IlI;
   private static final double Ill = 620.0;
   private static final double lII = 382.0;

   public static List<String> I(String var0, String var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var0 != null && !var0.isBlank()) {
         String var3 = var1 != null && !var1.isBlank() ? var1 : IlIIllIII.lI(IlI[1]);
         String[] var4 = var0.split(var3);
         ArrayList var5 = new ArrayList();

         for (String var9 : var4) {
            if (var9 != null) {
               String var10 = var9.trim();
               if (!var10.isEmpty()) {
                  var5.add(var10);
               }
            }

            if (var2 != null) {
               break;
            }
         }

         return List.copyOf(var5);
      } else {
         return List.of();
      }
   }

   public static boolean l(
      double var0,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      double var18,
      double var20,
      double var22
   ) {
      double[] var24 = new double[]{0.0, 1.0};
      return lII(var0, var6 - var0, Math.min(var12, var18), Math.max(var12, var18), var24)
            && lII(var2, var8 - var2, Math.min(var14, var20), Math.max(var14, var20), var24)
            && lII(var4, var10 - var4, Math.min(var16, var22), Math.max(var16, var22), var24)
         ? var24[0] < 0.999999 && var24[1] >= 0.0
         : false;
   }

   public static double II(double var0) {
      double var2 = Double.isFinite(var0) ? Math.max(0.0, var0) : 0.0;
      double var4 = Math.min(1.0, var2 / 30.0);
      double var6 = var4 * var4 * (3.0 - 2.0 * var4);
      return 0.14 + var6 * 0.86;
   }

   public static double Il(boolean var0, boolean var1) {
      if (var0 && !var1) {
         return 0.86;
      } else {
         return var1 && !var0 ? 0.58 : 0.73;
      }
   }

   public static double lI(double var0, double var2) {
      return Double.isFinite(var0) && Double.isFinite(var2) && !(Math.abs(var0) <= 1.0E-9) && Math.signum(var0) == Math.signum(var2)
         ? Math.copySign(Math.min(Math.abs(var2), Math.abs(var0)), var0)
         : 0.0;
   }

   private static String ll(char[] var0, long var1, int var3) {
      int var4 = IIlll(559261072, -1533515494 ^ -604223334) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & IIlll(559261073, -1533515494 ^ -89112276);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public static boolean III(boolean var0, boolean var1) {
      return var0 && var1;
   }

   public static boolean IIl(Object var0, Object var1) {
      return !Objects.deepEquals(var0, var1);
   }

   public static IlIllIIIl IlI(boolean var0, boolean var1, boolean var2, boolean var3, float var4, float var5) {
      String[] var6 = IIllllIl.IIIIl();
      float var7 = (var0 ? 1.0F : 0.0F) - (var1 ? 1.0F : 0.0F);
      float var8 = (var2 ? 1.0F : 0.0F) - (var3 ? 1.0F : 0.0F);
      if (var7 == 0.0F && var8 == 0.0F) {
         return new IlIllIIIl(0.0F, 0.0F);
      } else {
         float var9 = llIl(var5, var7, var8);
         float var10 = 0.0F;
         float var11 = 0.0F;
         float var12 = Float.MAX_VALUE;
         int var13 = -1;

         while (var13 <= 1) {
            int var14 = -1;

            while (true) {
               if (var14 <= 1) {
                  if (var13 != 0 || var14 != 0) {
                     float var15 = llIl(var4, var13, var14);
                     float var16 = Math.abs(IIlII(var9 - var15));
                     if (var16 < var12) {
                        var12 = var16;
                        var10 = var13;
                        var11 = var14;
                     }
                  }

                  var14++;
                  if (var6 == null) {
                     continue;
                  }
               }

               var13++;
               if (var6 != null) {
                  return new IlIllIIIl(var10, var11);
               }
               break;
            }
         }

         return new IlIllIIIl(var10, var11);
      }
   }

   public static boolean Ill(long var0, long var2) {
      return var0 < var2;
   }

   private IlIIIlIII() {
   }

   private static String IlIII(int var0, int var1, char var2) {
      int var3 = var2 ^ 'ꔢ';
      char[] var4 = llI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 27145;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 14263;
         var10 += 34447;
         var10 += 30838;
         var10 ^= 11773;
         var10 -= 42597;
         var10 -= 33615;
         var10 += 42437;
         var10 += 26444;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -919645104;
      String[] var10002 = new String[1];
      short var18 = 517;
      int var16 = 0;
      String[] var15 = var10002;
      int var14 = "\r\udc64锢畮㖻곩\uf879䈉Ỏ챪쉘\ue6ed侽抏".length();
      String var13 = "\r\udc64锢畮㖻곩\uf879䈉Ỏ챪쉘\ue6ed侽抏";
      int var17 = 0;

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 30;
               case 1 -> 50;
               case 2 -> 124;
               case 3 -> 63;
               case 4 -> 204;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      llI = var15;
      lll = new Object[var15.length];
      int var9 = -118096971;
      byte[] var7 = "Ü\u008asÚ\u0087\u0089åI¨÷Ë¼\u001bZ\u001a ^ë\u001fH<\u0087í«u\u0089m9î¹ç\u0093½[]ý¬õh1±»\t\\ýÓ\u0081á\u000fFJ1]²ÆR¹¾Mq×yÃ\u0087ÁE>M!'å¤G3¦6\u0082»kS¤\u0014Æ\u0015ÅÍ)ÚgX\u001a\u0005\u0084,\"LH¬.\tl\u008c¼ZÏþïS\u0001\u0091Sk\u001b¬\u0001&\u001aÂ¢ªüÓOÛX\u000f\u009eùo8\f¤¸ò\u0015¬V]î¯g\u009e«·\u0007´#]`ò\u0084öîàÐ\u0013T\u0080\u009cr\u007f\u009cÖ\u00adxÆ_]\u0093,øÑ¤¯\u009ev¦×Lî\u0092R¢»É\u008b°´\\Çâk8DÆ\u009d\u001ev6(SHÍ\u0091[&Ì\u001eº¾ _5UÑá\u008d°\u0096S\u009bÂF\u009b\u008fñ\u0095)½\u009dB\u0000f\u0019Oæ\u008d`I¸@\u007fFkôô#\u0095¨åøm23«Ñ\u0001°\t\u009cÚúvñ\u008dÛ¥kìfBíñ.À¹\u009eA\n\b\u00adÛ°YS°\u008e\u001fË\u0006\u0019ðKÕ\u0085{?î1\u008dÛÀAº(rT\u0005°$\u0088\\¢ÊVº@t\u0087\u0099gW\b>ì\u0018\u0007¸øB\u000f·ñ¤$J?Åó\u0095 µV\u0089\u0013gÊ<õ\u0080Ëÿä.µ{0ÀÚ/Ô\u0010¦\u0000³lïèäYÆ\u000bÐ4ó~%¡\u0006\u0087úI\u0002\u0090\t|ý\u0093\u0018w\u001d\u0083ê:GkÞIÄ´\u0006 =\u008f\u000f\u0091\u0019R\u0006iáþºÈ\u0082¾\u009e\u0094 ¢4 ôKfM\u00ad'm\b\u0085\u0014/÷²ÿ\rjDô\u0005^\râ\u007f\u0003¤TÄã.Ìv¡³\u0093\bJ2Êf\r\u0090-Â\u0098\u008a\\\u0000ÔwEn\u001bgPÆ9\u0005Êë£û\fe\u0095\u009d\u0014\u0081#m;öëÞ\u008cåG\u009c3:[\u008fÈ§\u009cJ2\u0016\t\u008e\u001apÂ\u0083\t\u0081û£*Mp²±¡>'©2\u0086\u008bªó\f/Ávtv\u00888\u0085ØÙT\u009a\u0086þÓ\u009fÒ$Â\u0006x½¬¾d\u0001\u000fýxpù\u0005f\u000e\u00020¨@á+?Ïãþ?¾KXy\u0004ù¡ªb\u0087Ô\u0088Ôõhª6ÜöW\u0097`\u0083¼P#¼ë2\u0003c¤ªÛÊã°R,V>ÜDZ§kRû\u0089\fß1*á\u0006ë\u0087\u001aã\t?/¥Ç.q¹£\u0019#ýð\u001c&\r¥#¾³~8\u007fX\u0092\u0086Ìï5gH\u0081ØÇ¿ØéÊ9'¸\u00823 lv\u008aqq9\u0010¬Tú?»Y3øH>O¦Í¼êGö?X\u009eÕÌ\u0015ÏÜvÙ¨PãuÐzÙ\u0018\u0015¼Éú½\u0010±\u009e\u0082þÚÍôÌ\u0007HBâ\u0010¿\u0011´ô_dH\u009f`¬\u0083\u0011¶pê\u0004\u0088À\u001b\\Ò\u0081Ð¼Ë§á\u008f\u0001:wû«L²\u001b\u0082Íò÷\u0092\u0002Â\u009f²ÄÓþE8g<¢:\u000fÈQ\\\u0099\fËV\u0091ø¬\u0013+Ð^\u0017TåQ®¹Ã6D$S\u008f\nq2ñ\u00871«øñÉý[æa/HúÜ \u0081)ôuë\u0090Q\u0089f0NOe¢Uy\u008f;ÍÞA;Ô\u0091û\u001c\u008bH\u0010fTãÐÀe\u0082¿ÆõOÊ\u0004Ûä\u0017äü\u008d¥\u008fÒD\u0013\u008a¼å~°¥\u0005åºÍz\u0084rY\u001eJ\u0096®\u0011*Lªâë\r¯xÙ\u0015&\u000bg\u0084\u001fìG\u0007ÜÔ\u0094¬\u0007\u00ad[ZûÀù²l\u009cu\u009c\u009dÖK\u0091\u0000d\u0015µoÒN\u0018Ì»W;_¼õ]¿Ó\u0092Y|\u001f,§Ôúÿ\u0097\u0086\u009d²\u00887[ç\u0083Òý\u0089ÚØÎ\u009b\u001eÏà\u0080ßÆ(ã\u0090\u00adfîç\u0082Öb\u0006ö]\u0007'\\r\u001aÕ\u0082[Q°¿ãs´j\u0086I Ù\u0005\u0089a\\ê'e\u0089JÖ\u001c\u0016Õ²\u001e\u008bÈ`vy\u0002ô\u0018ksôÛ79\u000f\nÌ5X¸,®\u0089¶\u0097L3gV·MÛmçó\u00ad\u0010\u0096ÏÃÏý· \u0081z\u0093û\u0006{\u0096\u009dÈ£ê"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lIl = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lIl[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IlIII(48904, var23 ^ -1700505097, 'ꔢ')).length();
      int var1 = IIlll(559260826, var23 ^ 440576619);
      int var0 = -1;

      while (true) {
         label83: {
            int var27 = IIlll(559260827, var23 ^ -1465764318);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var34 = var27;
            var31 = var10003;
            int var28 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var27;
               var10006 = var6;
            } else {
               var34 = var27;
               var28 = var10004;
               if (var10004 <= var6) {
                  break label83;
               }

               var10005 = var10003;
               var10004 = var27;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % IIlll(559260828, var23 ^ -1508256967)) {
                  case 0 -> IIlll(559260829, var23 ^ 2010656720);
                  case 1 -> IIlll(559260830, var23 ^ -874284925);
                  case 2 -> IIlll(559260831, var23 ^ -1113716303);
                  case 3 -> IIlll(559260800, var23 ^ -750689597);
                  case 4 -> IIlll(559260801, var23 ^ -1341135423);
                  case 5 -> IIlll(559260802, var23 ^ -343350018);
                  default -> IIlll(559260803, var23 ^ -1924776816);
               });
               var6++;
               if (var34 == 0) {
                  var10006 = var34;
                  var10005 = var31;
                  var10004 = var34;
               } else {
                  if (var28 <= var6) {
                     break;
                  }

                  var10005 = var31;
                  var10004 = var34;
                  var10006 = var6;
               }
            }
         }

         String var36 = new String(var31).intern();
         byte var30 = -1;
         var5[var3++] = var36;
         if ((var0 += var1) >= var4) {
            II = var5;
            IIl = new String[2];
            IlI = new String[2];
            IIIl();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static boolean lII(double var0, double var2, double var4, double var6, double[] var8) {
      if (!(Math.abs(var2) < 1.0E-9)) {
         double var9 = (var4 - var0) / var2;
         double var11 = (var6 - var0) / var2;
         if (var9 > var11) {
            double var13 = var9;
            var9 = var11;
            var11 = var13;
         }

         var8[0] = Math.max(var8[0], var9);
         var8[1] = Math.min(var8[1], var11);
         return var8[0] <= var8[1];
      } else {
         return var0 >= var4 && var0 <= var6;
      }
   }

   public static boolean lIl(long var0, long var2, long var4) {
      return var4 <= 0L || var0 >= var2;
   }

   public static double llI(double var0) {
      double var2 = Double.isFinite(var0) ? Math.max(0.0, var0) : 0.0;
      double var4 = Math.max(0.0, Math.min(1.0, (var2 - 0.5) / 11.5));
      return var4 * var4 * (3.0 - 2.0 * var4);
   }

   private static String lll(int var0, int var1) {
      int var9 = 320061204;
      int var2 = (var0 ^ IIlll(559261074, var9 ^ 1648750115)) & IIlll(559261075, var9 ^ -773066295);
      if (IIl[var2] == null) {
         char[] var3 = II[var2].toCharArray();

         int var4 = switch (var3[0] & IIlll(559261076, var9 ^ -1806078682)) {
            case 0 -> IIlll(559261077, var9 ^ -164257977);
            case 1 -> IIlll(559261078, var9 ^ -1086644587);
            case 2 -> IIlll(559261079, var9 ^ 604738935);
            case 3 -> IIlll(559261080, var9 ^ 2011769080);
            case 4 -> IIlll(559261081, var9 ^ 1715935930);
            case 5 -> IIlll(559261082, var9 ^ 2064219118);
            case 6 -> IIlll(559261083, var9 ^ 929166535);
            case 7 -> IIlll(559261084, var9 ^ -973849063);
            case 8 -> IIlll(559261085, var9 ^ -1761561828);
            case 9 -> IIlll(559261086, var9 ^ 1930182624);
            case 10 -> IIlll(559261087, var9 ^ 499888436);
            case 11 -> IIlll(559261056, var9 ^ 200756724);
            case 12 -> IIlll(559261057, var9 ^ -342517959);
            case 13 -> IIlll(559261058, var9 ^ -1920871588);
            case 14 -> IIlll(559261059, var9 ^ 1208557106);
            case 15 -> IIlll(559261060, var9 ^ 1856419069);
            case 16 -> IIlll(559261061, var9 ^ 260004689);
            case 17 -> IIlll(559261062, var9 ^ -1377146755);
            case 18 -> IIlll(559261063, var9 ^ 1318999862);
            case 19 -> IIlll(559261064, var9 ^ -2111939760);
            case 20 -> IIlll(559261065, var9 ^ -1505833276);
            case 21 -> IIlll(559261066, var9 ^ 88907229);
            case 22 -> IIlll(559261067, var9 ^ -886890090);
            case 23 -> IIlll(559261068, var9 ^ -786533463);
            case 24 -> IIlll(559261069, var9 ^ -797911112);
            case 25 -> IIlll(559261070, var9 ^ 912341972);
            case 26 -> IIlll(559261071, var9 ^ -1833047077);
            case 27 -> IIlll(559261104, var9 ^ -1517650333);
            case 28 -> IIlll(559261105, var9 ^ 1916821656);
            case 29 -> IIlll(559261106, var9 ^ -1662018609);
            case 30 -> IIlll(559261107, var9 ^ -1389569696);
            case 31 -> IIlll(559261108, var9 ^ -855222770);
            case 32 -> IIlll(559261109, var9 ^ -1438583207);
            case 33 -> IIlll(559261110, var9 ^ 609396043);
            case 34 -> IIlll(559261111, var9 ^ -1640829264);
            case 35 -> IIlll(559261112, var9 ^ -1255234634);
            case 36 -> IIlll(559261113, var9 ^ -1301008967);
            case 37 -> IIlll(559261114, var9 ^ 1503562331);
            case 38 -> IIlll(559261115, var9 ^ 1847454559);
            case 39 -> IIlll(559261116, var9 ^ 1818574381);
            case 40 -> IIlll(559261117, var9 ^ 1491130271);
            case 41 -> IIlll(559261118, var9 ^ 54116970);
            case 42 -> IIlll(559261119, var9 ^ -1770680137);
            case 43 -> IIlll(559261088, var9 ^ -218713183);
            case 44 -> IIlll(559261089, var9 ^ -725335190);
            case 45 -> IIlll(559261090, var9 ^ -1711620266);
            case 46 -> IIlll(559261091, var9 ^ -1852522609);
            case 47 -> IIlll(559261092, var9 ^ 1879888962);
            case 48 -> IIlll(559261093, var9 ^ -1596637);
            case 49 -> IIlll(559261094, var9 ^ 1191371947);
            case 50 -> IIlll(559261095, var9 ^ 1366307761);
            case 51 -> IIlll(559261096, var9 ^ 1162076475);
            case 52 -> IIlll(559261097, var9 ^ 1999581419);
            case 53 -> IIlll(559261098, var9 ^ -1398063690);
            case 54 -> IIlll(559261099, var9 ^ 1204960061);
            case 55 -> IIlll(559261100, var9 ^ -1966263477);
            case 56 -> IIlll(559261101, var9 ^ 1044795729);
            case 57 -> IIlll(559261102, var9 ^ 1649904976);
            case 58 -> IIlll(559261103, var9 ^ -125707911);
            case 59 -> IIlll(559261136, var9 ^ -889029397);
            case 60 -> IIlll(559261137, var9 ^ 273155131);
            case 61 -> IIlll(559261138, var9 ^ 1198116953);
            case 62 -> IIlll(559261139, var9 ^ 651440382);
            case 63 -> IIlll(559261140, var9 ^ 1000125007);
            case 64 -> IIlll(559261141, var9 ^ 1425242270);
            case 65 -> IIlll(559261142, var9 ^ 1734984433);
            case 66 -> IIlll(559261143, var9 ^ -1727857507);
            case 67 -> IIlll(559261144, var9 ^ 28601475);
            case 68 -> IIlll(559261145, var9 ^ -2123894679);
            case 69 -> IIlll(559261146, var9 ^ -178502763);
            case 70 -> 3;
            case 71 -> IIlll(559261147, var9 ^ 292697332);
            case 72 -> IIlll(559261148, var9 ^ -490723353);
            case 73 -> IIlll(559261149, var9 ^ 2056714872);
            case 74 -> IIlll(559261150, var9 ^ 1752704064);
            case 75 -> IIlll(559261151, var9 ^ -1966672588);
            case 76 -> IIlll(559261120, var9 ^ -1377469735);
            case 77 -> IIlll(559261121, var9 ^ 648704974);
            case 78 -> IIlll(559261122, var9 ^ 854621569);
            case 79 -> IIlll(559261123, var9 ^ 991319945);
            case 80 -> IIlll(559261124, var9 ^ -176717565);
            case 81 -> IIlll(559261125, var9 ^ 1778852877);
            case 82 -> IIlll(559261126, var9 ^ -640303252);
            case 83 -> IIlll(559261127, var9 ^ 1060288865);
            case 84 -> IIlll(559261128, var9 ^ 782026656);
            case 85 -> IIlll(559261129, var9 ^ -93148936);
            case 86 -> IIlll(559261130, var9 ^ 513987740);
            case 87 -> IIlll(559261131, var9 ^ 2044632434);
            case 88 -> IIlll(559261132, var9 ^ 787198809);
            case 89 -> IIlll(559261133, var9 ^ 445022618);
            case 90 -> IIlll(559261134, var9 ^ -283937811);
            case 91 -> IIlll(559261135, var9 ^ 821784579);
            case 92 -> IIlll(559261168, var9 ^ -1009873323);
            case 93 -> IIlll(559261169, var9 ^ -758812912);
            case 94 -> IIlll(559261170, var9 ^ 545796713);
            case 95 -> 0;
            case 96 -> IIlll(559261171, var9 ^ 352040457);
            case 97 -> IIlll(559261172, var9 ^ -871216900);
            case 98 -> IIlll(559261173, var9 ^ -987534353);
            case 99 -> IIlll(559261174, var9 ^ -858025136);
            case 100 -> IIlll(559261175, var9 ^ 1887105116);
            case 101 -> IIlll(559261176, var9 ^ 1411831260);
            case 102 -> IIlll(559261177, var9 ^ -32341699);
            case 103 -> IIlll(559261178, var9 ^ -1392517221);
            case 104 -> IIlll(559261179, var9 ^ -1480919138);
            case 105 -> IIlll(559261180, var9 ^ -448413681);
            case 106 -> IIlll(559261181, var9 ^ -942132826);
            case 107 -> IIlll(559261182, var9 ^ -806584572);
            case 108 -> IIlll(559261183, var9 ^ -1246636393);
            case 109 -> IIlll(559261152, var9 ^ 240213059);
            case 110 -> IIlll(559261153, var9 ^ -1139556007);
            case 111 -> IIlll(559261154, var9 ^ -1023917953);
            case 112 -> IIlll(559261155, var9 ^ -1396710722);
            case 113 -> IIlll(559261156, var9 ^ 137033841);
            case 114 -> IIlll(559261157, var9 ^ -899283578);
            case 115 -> IIlll(559261158, var9 ^ -1532422843);
            case 116 -> IIlll(559261159, var9 ^ 210464937);
            case 117 -> IIlll(559261160, var9 ^ 554798643);
            case 118 -> IIlll(559261161, var9 ^ -1356337398);
            case 119 -> IIlll(559261162, var9 ^ 1267801985);
            case 120 -> IIlll(559261163, var9 ^ 1012509669);
            case 121 -> IIlll(559261164, var9 ^ 804646618);
            case 122 -> IIlll(559261165, var9 ^ -253101433);
            case 123 -> 5;
            case 124 -> IIlll(559261166, var9 ^ 1831745749);
            case 125 -> IIlll(559261167, var9 ^ -591660029);
            case 126 -> IIlll(559260944, var9 ^ -1167003341);
            case 127 -> IIlll(559260945, var9 ^ 1263130314);
            case 128 -> IIlll(559260946, var9 ^ -2017278077);
            case 129 -> IIlll(559260947, var9 ^ 1804358166);
            case 130 -> IIlll(559260948, var9 ^ -130745862);
            case 131 -> IIlll(559260949, var9 ^ 968777165);
            case 132 -> IIlll(559260950, var9 ^ -1127873398);
            case 133 -> IIlll(559260951, var9 ^ -231232389);
            case 134 -> IIlll(559260952, var9 ^ -1641483478);
            case 135 -> IIlll(559260953, var9 ^ 422422452);
            case 136 -> IIlll(559260954, var9 ^ 146017611);
            case 137 -> IIlll(559260955, var9 ^ 1712068129);
            case 138 -> IIlll(559260956, var9 ^ -984675117);
            case 139 -> IIlll(559260957, var9 ^ 867636350);
            case 140 -> IIlll(559260958, var9 ^ -930948530);
            case 141 -> IIlll(559260959, var9 ^ 731466292);
            case 142 -> IIlll(559260928, var9 ^ 692866416);
            case 143 -> IIlll(559260929, var9 ^ -2115368387);
            case 144 -> IIlll(559260930, var9 ^ 856940256);
            case 145 -> IIlll(559260931, var9 ^ 1298594320);
            case 146 -> IIlll(559260932, var9 ^ 1071308761);
            case 147 -> IIlll(559260933, var9 ^ 373563970);
            case 148 -> IIlll(559260934, var9 ^ -1439576423);
            case 149 -> IIlll(559260935, var9 ^ -384919170);
            case 150 -> IIlll(559260936, var9 ^ -908996327);
            case 151 -> IIlll(559260937, var9 ^ 293114352);
            case 152 -> IIlll(559260938, var9 ^ -1734466656);
            case 153 -> IIlll(559260939, var9 ^ 385231073);
            case 154 -> IIlll(559260940, var9 ^ -1579119090);
            case 155 -> IIlll(559260941, var9 ^ -965917930);
            case 156 -> IIlll(559260942, var9 ^ 733257315);
            case 157 -> IIlll(559260943, var9 ^ -799966037);
            case 158 -> IIlll(559260976, var9 ^ -451431507);
            case 159 -> IIlll(559260977, var9 ^ -1156853271);
            case 160 -> IIlll(559260978, var9 ^ -380665112);
            case 161 -> IIlll(559260979, var9 ^ -322973561);
            case 162 -> IIlll(559260980, var9 ^ 1946225342);
            case 163 -> IIlll(559260981, var9 ^ -1242898245);
            case 164 -> IIlll(559260982, var9 ^ 106776460);
            case 165 -> IIlll(559260983, var9 ^ -2110543197);
            case 166 -> IIlll(559260984, var9 ^ 1969921053);
            case 167 -> IIlll(559260985, var9 ^ -208286434);
            case 168 -> IIlll(559260986, var9 ^ -107864554);
            case 169 -> IIlll(559260987, var9 ^ 1086522190);
            case 170 -> IIlll(559260988, var9 ^ -635559586);
            case 171 -> IIlll(559260989, var9 ^ -183948098);
            case 172 -> IIlll(559260990, var9 ^ 855264582);
            case 173 -> 4;
            case 174 -> IIlll(559260991, var9 ^ 1820313707);
            case 175 -> IIlll(559260960, var9 ^ -1924903658);
            case 176 -> IIlll(559260961, var9 ^ 1416085029);
            case 177 -> IIlll(559260962, var9 ^ 91096294);
            case 178 -> IIlll(559260963, var9 ^ 1659015598);
            case 179 -> IIlll(559260964, var9 ^ 449358641);
            case 180 -> 1;
            case 181 -> IIlll(559260965, var9 ^ -552682487);
            case 182 -> IIlll(559260966, var9 ^ 2007155806);
            case 183 -> IIlll(559260967, var9 ^ 1212983447);
            case 184 -> IIlll(559260968, var9 ^ 1048474973);
            case 185 -> IIlll(559260969, var9 ^ -2007997767);
            case 186 -> IIlll(559260970, var9 ^ -620329439);
            case 187 -> IIlll(559260971, var9 ^ -1359287582);
            case 188 -> IIlll(559260972, var9 ^ 1714512948);
            case 189 -> IIlll(559260973, var9 ^ -1168607570);
            case 190 -> IIlll(559260974, var9 ^ 178858294);
            case 191 -> IIlll(559260975, var9 ^ 1264766702);
            case 192 -> IIlll(559261008, var9 ^ 1834220820);
            case 193 -> IIlll(559261009, var9 ^ -255489556);
            case 194 -> IIlll(559261010, var9 ^ -2046793229);
            case 195 -> IIlll(559261011, var9 ^ 121669050);
            case 196 -> IIlll(559261012, var9 ^ -932123417);
            case 197 -> IIlll(559261013, var9 ^ 241273782);
            case 198 -> IIlll(559261014, var9 ^ -220901646);
            case 199 -> IIlll(559261015, var9 ^ -256001330);
            case 200 -> IIlll(559261016, var9 ^ -1775535856);
            case 201 -> IIlll(559261017, var9 ^ -1675391649);
            case 202 -> IIlll(559261018, var9 ^ -644242693);
            case 203 -> IIlll(559261019, var9 ^ -572090528);
            case 204 -> IIlll(559261020, var9 ^ 1678487861);
            case 205 -> IIlll(559261021, var9 ^ -1902763744);
            case 206 -> IIlll(559261022, var9 ^ -1060945719);
            case 207 -> IIlll(559261023, var9 ^ 1300486632);
            case 208 -> IIlll(559260992, var9 ^ 997953503);
            case 209 -> IIlll(559260993, var9 ^ 752049621);
            case 210 -> IIlll(559260994, var9 ^ 812536326);
            case 211 -> IIlll(559260995, var9 ^ -481949742);
            case 212 -> IIlll(559260996, var9 ^ 1524890627);
            case 213 -> IIlll(559260997, var9 ^ -84133206);
            case 214 -> IIlll(559260998, var9 ^ 1759972257);
            case 215 -> IIlll(559260999, var9 ^ -243290939);
            case 216 -> IIlll(559261000, var9 ^ -244915173);
            case 217 -> IIlll(559261001, var9 ^ -700892310);
            case 218 -> IIlll(559261002, var9 ^ -1394174405);
            case 219 -> IIlll(559261003, var9 ^ 181925701);
            case 220 -> IIlll(559261004, var9 ^ 205994518);
            case 221 -> IIlll(559261005, var9 ^ -831942150);
            case 222 -> IIlll(559261006, var9 ^ 776927246);
            case 223 -> IIlll(559261007, var9 ^ 1163932038);
            case 224 -> IIlll(559261040, var9 ^ 1074696419);
            case 225 -> IIlll(559261041, var9 ^ 2048356456);
            case 226 -> IIlll(559261042, var9 ^ 1887373489);
            case 227 -> IIlll(559261043, var9 ^ -1192531017);
            case 228 -> IIlll(559261044, var9 ^ 1545364687);
            case 229 -> IIlll(559261045, var9 ^ -2045210437);
            case 230 -> IIlll(559261046, var9 ^ -954397362);
            case 231 -> IIlll(559261047, var9 ^ -543917809);
            case 232 -> 2;
            case 233 -> IIlll(559261048, var9 ^ 1320001290);
            case 234 -> IIlll(559261049, var9 ^ -848387759);
            case 235 -> IIlll(559261050, var9 ^ 1723195200);
            case 236 -> IIlll(559261051, var9 ^ -1874217932);
            case 237 -> IIlll(559261052, var9 ^ 2027875922);
            case 238 -> IIlll(559261053, var9 ^ 1445962719);
            case 239 -> IIlll(559261054, var9 ^ 1538397696);
            case 240 -> IIlll(559261055, var9 ^ 2145230917);
            case 241 -> IIlll(559261024, var9 ^ -763442865);
            case 242 -> IIlll(559261025, var9 ^ -236074724);
            case 243 -> IIlll(559261026, var9 ^ -1760714356);
            case 244 -> IIlll(559261027, var9 ^ -1815188219);
            case 245 -> IIlll(559261028, var9 ^ 1835437920);
            case 246 -> IIlll(559261029, var9 ^ 1563748378);
            case 247 -> IIlll(559261030, var9 ^ 1116023171);
            case 248 -> IIlll(559261031, var9 ^ 1231064885);
            case 249 -> IIlll(559261032, var9 ^ 275429963);
            case 250 -> IIlll(559261033, var9 ^ -729967932);
            case 251 -> IIlll(559261034, var9 ^ 359947190);
            case 252 -> IIlll(559261035, var9 ^ 1511986288);
            case 253 -> IIlll(559261036, var9 ^ 758162324);
            case 254 -> IIlll(559261037, var9 ^ -867946914);
            default -> IIlll(559261038, var9 ^ -303169484);
         };
         int var5 = (var1 & IIlll(559261039, var9 ^ 523250116)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIlll(559260816, var9 ^ 2047740185)) >>> IIlll(559260817, var9 ^ 2128146997)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIlll(559260818, var9 ^ 1785427681);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIlll(559260819, var9 ^ -1410426546);
            }
         }

         IIl[var2] = new String(var3).intern();
      }

      return IIl[var2];
   }

   public static double IIII(double var0) {
      double var2 = Double.isFinite(var0) ? Math.max(0.0, var0) : 0.0;
      return 3.0 + var2 / 2.0;
   }

   private static void IIIl() {
      int var0 = 1521773139;
      IlI[0] = ll(lll(IIlll(559260820, var0 ^ -425936120), IIlll(559260821, var0 ^ -1627144667)).toCharArray(), 60005L, IIlll(559260822, var0 ^ 1111929246));
      IlI[1] = ll(lll(IIlll(559260823, var0 ^ -177409240), IIlll(559260824, var0 ^ -1686137616)).toCharArray(), 38851L, IIlll(559260825, var0 ^ -924278891));
   }

   public static double IIlI(double var0) {
      return IIIIl(var0, 0.85);
   }

   public static String IIll(long var0, long var2) {
      return Long.toString(var0 + Math.max(1L, var2));
   }

   public static double IlII(double var0, double var2, double var4) {
      double var6 = Double.isFinite(var0) ? var0 : 0.0;
      double var8 = Double.isFinite(var2) ? var2 : 0.0;
      double var10 = Double.isFinite(var4) ? Math.max(0.0, var4) : 0.0;
      return Math.max(var6 - var10, Math.min(var6 + var10, var8));
   }

   public static boolean IlIl(double var0, double var2, double var4, double var6, double var8, double var10, double var12) {
      double var14 = Math.max(0.0, var4);
      double var16 = Math.max(Math.min(var6, var10), Math.min(var0, Math.max(var6, var10)));
      double var18 = Math.max(Math.min(var8, var12), Math.min(var2, Math.max(var8, var12)));
      double var20 = var16 - var0;
      double var22 = var18 - var2;
      return var20 * var20 + var22 * var22 <= var14 * var14;
   }

   public static int IllI(int var0, int var1) {
      return var0 + 1 + Math.max(0, var1);
   }

   public static boolean Illl(double var0, double var2) {
      return var0 >= IIIlI(var2);
   }

   public static long lIII(long var0, long var2, long var4) {
      return Math.max(var0, var2 + Math.max(0L, var4));
   }

   public static boolean lIIl(boolean var0, boolean var1, double var2, double var4) {
      return var0 && !var1 && (var2 >= 0.0 || var4 <= 0.0);
   }

   public static double lIlI(double var0, int var2, int var3) {
      double var4 = Double.isFinite(var0) ? Math.max(1.0, var0) : 1.0;
      double var6 = Math.max(1, var2) / 652.0;
      double var8 = Math.max(1, var3) / 446.0;
      double var10 = Math.max(1.0, Math.min(var6, var8));
      return Math.min(var4, Math.min(3.0, var10));
   }

   public static String lIll(String var0, int var1) {
      String var2 = var0 != null && !var0.isBlank() ? var0.trim() : IlIIllIII.lI(IlI[0]);
      int var4 = Math.max(1, var1);
      return var2 + var4;
   }

   public static boolean llII(double var0, double var2) {
      return Double.isFinite(var0) && var0 >= 0.0 && var0 <= IIII(var2);
   }

   private static float llIl(float var0, float var1, float var2) {
      if (var1 < 0.0F) {
         var0 += 180.0F;
      }

      float var3 = 1.0F;
      if (var1 < 0.0F) {
         var3 = -0.5F;
      } else if (var1 > 0.0F) {
         var3 = 0.5F;
      }

      if (var2 > 0.0F) {
         var0 -= 90.0F * var3;
      }

      if (var2 < 0.0F) {
         var0 += 90.0F * var3;
      }

      return var0;
   }

   public static boolean lllI(boolean var0, int var1, boolean var2) {
      return !var2 && (var0 || var1 > 0);
   }

   public static boolean llll(double var0, double var2) {
      return var0 < IIIlI(var2);
   }

   public static boolean IIIII(boolean var0, String var1) {
      return var0 && var1 != null && !var1.isBlank();
   }

   private static int IIlll(int var0, int var1) {
      int var2 = lIl[var0 ^ 559261072] ^ var1 ^ var0;
      var2 -= 38466;
      var2 ^= 1194;
      var2 -= 46835;
      var2 ^= 23903;
      var2 -= 461;
      return var2 ^ 7469;
   }

   public static double IIIIl(double var0, double var2) {
      double var4 = Double.isFinite(var0) ? Math.max(0.0, Math.min(var0, 0.1)) : 0.0;
      double var6 = Double.isFinite(var2) ? Math.max(0.0, Math.min(var2, 1.0)) : 0.85;
      double var8 = 12.0 - var6 * 9.5;
      return 1.0 - Math.exp(-var4 * var8);
   }

   private static double IIIlI(double var0) {
      return Math.max(0.0, Math.min(100.0, var0));
   }

   public static IlIllIIIl IIIll(boolean var0, boolean var1, boolean var2, boolean var3) {
      return new IlIllIIIl((var0 ? 1.0F : 0.0F) - (var1 ? 1.0F : 0.0F), (var2 ? 1.0F : 0.0F) - (var3 ? 1.0F : 0.0F));
   }

   public static float IIlII(float var0) {
      float var1 = var0 % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   public static boolean IIlIl(double var0, double var2, double var4, double var6, double var8) {
      double var10 = Math.max(0.0, var4);
      double var12 = var6 - var0;
      double var14 = var8 - var2;
      return var12 * var12 + var14 * var14 <= var10 * var10;
   }

   public static double IIllI(int var0, int var1) {
      if (var0 <= 0) {
         return 100.0;
      } else {
         int var2 = Math.max(0, Math.min(var0, var1));
         return (var0 - var2) * 100.0 / var0;
      }
   }
}
