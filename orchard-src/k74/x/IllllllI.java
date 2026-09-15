package k74.x;

import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class IllllllI {
   private static final Object[] ll;
   private static final String[] I;
   private static final String[] l;
   private static final int[] Il;
   private static String[] II;
   private static final String[] lI;

   private static String lIIl(int var0, int var1) {
      int var3 = var0 ^ -1391250545;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1191849158;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 61;
            case 1 -> 67;
            case 2 -> 106;
            case 3 -> 147;
            case 4 -> 241;
            case 5 -> 141;
            case 6 -> 57;
            case 7 -> 102;
            case 8 -> 25;
            case 9 -> 103;
            case 10 -> 11;
            case 11 -> 23;
            case 12 -> 78;
            case 13 -> 76;
            case 14 -> 85;
            case 15 -> 178;
            case 16 -> 51;
            case 17 -> 161;
            case 18 -> 211;
            case 19 -> 249;
            case 20 -> 146;
            case 21 -> 106;
            case 22 -> 191;
            case 23 -> 168;
            case 24 -> 33;
            case 25 -> 246;
            case 26 -> 156;
            case 27 -> 119;
            case 28 -> 110;
            case 29 -> 27;
            case 30 -> 104;
            case 31 -> 132;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 452801135;
      int var14 = "\t콓ꠦ후㾽잩쁡䟂鎥㘰\t쿜ⴇఎ꼮풪͈\ue3cf薥衰".length();
      String var13 = "\t콓ꠦ후㾽잩쁡䟂鎥㘰\t쿜ⴇఎ꼮풪͈\ue3cf薥衰";
      short var18 = 25811;
      int var17 = 0;
      int var16 = 0;
      String[] var15 = new String[2];

      do {
         char var10000 = var13.charAt(var17);
         int var21 = 0;
         char var19 = var10000;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 200;
               case 1 -> 106;
               case 2 -> 34;
               case 3 -> 137;
               case 4 -> 176;
               case 5 -> 177;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lI = var15;
      ll = new Object[var15.length];
      int var9 = -96996059;
      byte[] var7 = "ð\u009c¯F\u0010\u0007\u0011,l²Ûá\u001aÎà®fµ\u00915\u0095¦G@w\u001dÊ¢ü\u0087À\u0094¦?}8ó\u00164yï\f<\u0003ÚG3´¡í¿e3þ\u0019\u001fþ5ÊÙ\u0016\u0088ç\u0095\"ÆZ\u0005}F°\u0094æ^b¿÷ñ\u0014mUPPTn\u0082.\t\bÏz\u0088 i©ô¸2Má*~\u00129\u0097\u0083#°\u0082ø\u0090ÿ\u009cHÜõ\\\u0099Rí\u0092C\u008dÆ\u0090\u0096±¹\u00110°*4¹ô^§\u0089²xãC¦\u0087\u000bîqØ?6¿A\u0005Zä/»Cõ\u007f¢Ô@y\u009df4iýÆº_0\u0006|u<è\u0000L¬¦Zæþ¼ö)ÇzO`\u0002\u008aÈÕT\u009bf;ç\u0005\nj¯þõ(\u0099\u0083lC\u000b%\u0012¾F\u008båMZJ\næÆ¢¤\u008d!=\u008cïs\u008aU\u0097\u009cìØ¤` î÷\u009d$\"¸\u009f\u0011 Ó\u0098®OQ6¥ÝÑ¼ÆH\u00adtÂ»¸ÅT¸\u001cª\u008e¦#Þ\u0092\u0091Ø;ã\u0085Ç\u0004\u0083&DÀH\u009e\u0083ÂtÑ\u001e^£`ýëÉ©®\u0010¿¢eÃôñÂ½ª\u0006åÁ\u009a\u0016oH\u009e¥>V¦m\f¾¦WM \u0006/À\u00198MXK<\u0001?¾o\u0085\u001b/ÏRý\u009aº\u001bí¼îÍ\u000f\u0011\u00ad\u0099\u0095#v\rzáo|öö\u0000óQ¨û\bÅ\u00931Njk\u008c^0 ÛÔ\u001fSm\u001bÑF|¼\u0000\rm*c®PS\u0089ç\u0080ó\u001cS¡cDuÖ9ñ®\u0086ä\u0082Î\u001bñ#»9\u0090ci\u0082±´U½+\u009d\u0007\u0010½\u0003\u0012«\u008a\u0096ÍcæK\u00adõ]HHR@+K\u0080¦\u000bØ[ö2ò?\u0092oW6õnïØ\u008cSq\u008a\u0092}F1!Ì*W\u0011Àxé\u0010A\u0001\u0012B/9ãoÝÓ\u0012)xê\u0099¾2$x:\u007fj/9\u0013ÖÑtÞüÀ4P\u0082&½85~\u000e\u0012ý¾0]*H¿ÒKc\u0014EG´Ö¦vE²dÆD ¤-bøÿÚ±MÛRæþ¾\u0007a\u001d\fæ\tÏñ>\u0018\u0007â\u000fÎ\u0084xrh\u0001Cz\u0003íÁeÉ®ßß\u001bâ$\f\u0094¶[\u00816÷ä\u0000Õ\u0090\u0001\u009e>X\u0086*\u0081¦¼\u000fÌùU¹?ò4\u0007Ò«¢¯í¨\u0096\u0083ù~íTã*\u0017\u0017Rñ\u0017Å1Cx2\t\u0006]q\u000eI\t\u000f_¢~bÒQ\u0091\u0098þøvÕî ÒÂ²ôû\t\u0011ý\u000f¬jâO§\u0017\\¬\u0000\u000f\u0002\u001c\u0098\u0087Jó\u009fYî)8ëÍ\u0093É¢¸\u008b\u0092ä\u001e\u0092 \u0081\u009eÊ+½úë#¬\u0006bü\u0011píKù\u00adWcý÷Ë2ðÇ¿\u0090.%±Y\u0015ê \u001fã\u0007Cî\u0015}Þ·\u009a`,ÐB|Á©r[\u0096 \u0084`^L\u009d\u0096,$Ð\"¸\u0011z¥¸\\ÔV¼ÿQ\u0016ï\u009fMr\n@²øc¸\u0012¸\u0004rr\u0082q²%¯\nc\u0017Ë©òö\u0085\u0010\fÉ\u001e?\u0097\u00928 \bÿÓ¿tO«\u001f¦½Ì¢OOç÷\u008bª\u00029oYÀ6\u008f\u0016ÔÒ\u0085æo\u0081)Ò3\u001d\u0096\b7h!\u001d\u0096H5 8\u0013\u00904\u000eøp\u009fô\u008b\u0007õÊ\u0086ÌþXB£2Ö¸\u009aÛ\u000fáï\u001aþÅ`§3(T\u000b¿ñÈÐ<wÝ\u001fØJ\u0095\u00958ÛQ£\u001e¡\u008cIÁM|vû(Æc®Aed\u007fc#\\öö\\»ï\u008d£\u008c¡ \u000e«6x\n\u000borÅ>Ìi\u000f²íñ\u009dª\u001a\u0017RHÏ\u0094<\u0080\u0082øûb\u009eöæmv\u0098«Ê>+×ï\u0082xæüõ\u0004\u0089\u0084jÜJÏ°á\u0097Ñ½$\u008dj?\u0093V³Z\u0098-\u008e¿Å¡æ \u0003\u0088(_Æ\u001d§2q[Þ\u0004ü)öÌÑ\u0084êgnoÑæxr\u001b\u001eÀ\u0083\u009b¥ZO\u0095\u008eöaTÆ\u0011çA\u001c\u0080\u008c,äÈ©Ø«×¤+»\r\u00826öDÙSX8µÄüLÒ\u0095Üæ,/á\u0088ÇÌÈøäÅëì\u0080YJ^l\u001aA=úy>~øÐB°x\u0012\u009c\u0080\u0092Dü2ÂåÏ¼¹±«\u001et\u0093¬°@\r¹zHÆ\u0090>gcK\u007fZ³Ô\\·\u007f\u009558B\u0094E?fÛÚqÖVép]¿©N´6 pÕ\u0089Ä¸Ç(\u0007(ý(Äê.\u008f\u009d"
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

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIIl(-1391250545, var23 ^ 1895900541)).length();
      char var1 = 4;
      int var25 = -1;

      label98:
      while (true) {
         int var29 = lIII(-660666786, var23 ^ -1893061074);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label93: {
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
                     break label93;
                  }

                  var57 = var45;
                  var10004 = var29;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lIII(-660666785, var23 ^ 1518753)) {
                     case 0 -> lIII(-660666800, var23 ^ 120807635);
                     case 1 -> lIII(-660666799, var23 ^ 1233382958);
                     case 2 -> lIII(-660666798, var23 ^ 1208485714);
                     case 3 -> lIII(-660666797, var23 ^ 1994493632);
                     case 4 -> lIII(-660666796, var23 ^ 1216360707);
                     case 5 -> lIII(-660666795, var23 ^ -2137878278);
                     default -> lIII(-660666794, var23 ^ 279483354);
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
                  if ((var25 += var1) >= var4) {
                     l = var5;
                     I = new String[4];
                     II = new String[4];
                     II();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label98;
                  }

                  var4 = (var2 = lIIl(-1391250546, var23 ^ 1076978281)).length();
                  var1 = 4;
                  var25 = -1;
            }

            var29 = 2;
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private static String I(char[] var0, long var1, int var3) {
      int var4 = lIII(-660666504, -250718546 ^ -1835179886) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIII(-660666503, -250718546 ^ -1012805897);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   public static IIlIIllll l(IIlIIllll var0, Iterable<IIlIIllll> var1, double var2, double var4) {
      return IIIlllIll.IlI(var0, var1, var2, var4);
   }

   private static void II() {
      int var0 = -220582876;
      II[0] = I(IIl(lIII(-660666502, var0 ^ 1128211737), lIII(-660666501, var0 ^ 893589440)).toCharArray(), 67756L, lIII(-660666500, var0 ^ -1453910968));
      II[1] = I(IIl(lIII(-660666499, var0 ^ -1171539528), lIII(-660666498, var0 ^ -1485849424)).toCharArray(), 22178L, lIII(-660666497, var0 ^ 2023487314));
      II[2] = I(IIl(lIII(-660666512, var0 ^ -1984789553), lIII(-660666511, var0 ^ 593765637)).toCharArray(), 64655L, lIII(-660666510, var0 ^ 4607456));
      II[3] = I(IIl(lIII(-660666509, var0 ^ -171258545), lIII(-660666508, var0 ^ 1906298452)).toCharArray(), 33260L, lIII(-660666507, var0 ^ -459775792));
   }

   public static IIlIIllll Il(double var0, double var2, double var4, double var6, double var8, double var10) {
      return IIIlllIll.III(var0, var2, var4, var6, var8, var10);
   }

   public static double lI(double var0, double var2, double var4) {
      return IIIlllIll.IlII(var0, var2, var4);
   }

   public static double ll(double var0, double var2, double var4) {
      return IIIlllIll.ll(var0, var2, var4);
   }

   public static int III(int var0, double var1) {
      return IIIlllIll.IIll(var0, var1);
   }

   private static String IIl(int var0, int var1) {
      int var9 = 789567707;
      int var2 = (var0 ^ lIII(-660666506, var9 ^ 208519383)) & lIII(-660666505, var9 ^ 456046389);
      if (I[var2] == null) {
         char[] var3 = l[var2].toCharArray();

         int var4 = switch (var3[0] & lIII(-660666520, var9 ^ 794889146)) {
            case 0 -> lIII(-660666519, var9 ^ 1893851498);
            case 1 -> lIII(-660666518, var9 ^ -335990324);
            case 2 -> lIII(-660666517, var9 ^ -95008973);
            case 3 -> lIII(-660666516, var9 ^ 1492582888);
            case 4 -> lIII(-660666515, var9 ^ 1663401979);
            case 5 -> lIII(-660666514, var9 ^ 90712975);
            case 6 -> lIII(-660666513, var9 ^ 768539358);
            case 7 -> lIII(-660666528, var9 ^ -1248518454);
            case 8 -> lIII(-660666527, var9 ^ 668550112);
            case 9 -> lIII(-660666526, var9 ^ -1708887887);
            case 10 -> lIII(-660666525, var9 ^ -1889549439);
            case 11 -> lIII(-660666524, var9 ^ -1846571527);
            case 12 -> lIII(-660666523, var9 ^ 1363018277);
            case 13 -> lIII(-660666522, var9 ^ -1612390680);
            case 14 -> lIII(-660666521, var9 ^ -1657675046);
            case 15 -> lIII(-660666536, var9 ^ 479716112);
            case 16 -> lIII(-660666535, var9 ^ 958309796);
            case 17 -> lIII(-660666534, var9 ^ -1439768235);
            case 18 -> lIII(-660666533, var9 ^ -286984272);
            case 19 -> lIII(-660666532, var9 ^ 105456356);
            case 20 -> 4;
            case 21 -> lIII(-660666531, var9 ^ 848424667);
            case 22 -> lIII(-660666530, var9 ^ 150845272);
            case 23 -> lIII(-660666529, var9 ^ -1226529537);
            case 24 -> lIII(-660666544, var9 ^ -1351413543);
            case 25 -> lIII(-660666543, var9 ^ -1866373262);
            case 26 -> lIII(-660666542, var9 ^ -262018135);
            case 27 -> lIII(-660666541, var9 ^ 1033973620);
            case 28 -> lIII(-660666540, var9 ^ 827281648);
            case 29 -> lIII(-660666539, var9 ^ -1593767648);
            case 30 -> lIII(-660666538, var9 ^ -216291690);
            case 31 -> lIII(-660666537, var9 ^ -891479027);
            case 32 -> lIII(-660666552, var9 ^ 254647248);
            case 33 -> lIII(-660666551, var9 ^ 1497118653);
            case 34 -> lIII(-660666550, var9 ^ -358458675);
            case 35 -> lIII(-660666549, var9 ^ -1571183448);
            case 36 -> lIII(-660666548, var9 ^ -1809564195);
            case 37 -> lIII(-660666547, var9 ^ 109200177);
            case 38 -> lIII(-660666546, var9 ^ 1261221398);
            case 39 -> lIII(-660666545, var9 ^ 1475172944);
            case 40 -> lIII(-660666560, var9 ^ -888802206);
            case 41 -> lIII(-660666559, var9 ^ 748346456);
            case 42 -> lIII(-660666558, var9 ^ 2116879414);
            case 43 -> lIII(-660666557, var9 ^ -1857320665);
            case 44 -> lIII(-660666556, var9 ^ 1829223895);
            case 45 -> lIII(-660666555, var9 ^ -1870433919);
            case 46 -> lIII(-660666554, var9 ^ -1833504732);
            case 47 -> lIII(-660666553, var9 ^ -1794564985);
            case 48 -> lIII(-660666568, var9 ^ 990023364);
            case 49 -> lIII(-660666567, var9 ^ -1319035953);
            case 50 -> lIII(-660666566, var9 ^ 2036722266);
            case 51 -> lIII(-660666565, var9 ^ -923538522);
            case 52 -> lIII(-660666564, var9 ^ -1490422091);
            case 53 -> lIII(-660666563, var9 ^ -751451544);
            case 54 -> lIII(-660666562, var9 ^ 910480661);
            case 55 -> lIII(-660666561, var9 ^ 153384658);
            case 56 -> lIII(-660666576, var9 ^ -839922273);
            case 57 -> lIII(-660666575, var9 ^ -808222626);
            case 58 -> lIII(-660666574, var9 ^ 1392783412);
            case 59 -> lIII(-660666573, var9 ^ -428934494);
            case 60 -> 1;
            case 61 -> lIII(-660666572, var9 ^ 488174582);
            case 62 -> lIII(-660666571, var9 ^ -833379631);
            case 63 -> lIII(-660666570, var9 ^ -1341303457);
            case 64 -> lIII(-660666569, var9 ^ -868399652);
            case 65 -> lIII(-660666584, var9 ^ 1161426478);
            case 66 -> lIII(-660666583, var9 ^ 1526808130);
            case 67 -> lIII(-660666582, var9 ^ -1291778989);
            case 68 -> lIII(-660666581, var9 ^ -1381925289);
            case 69 -> lIII(-660666580, var9 ^ 345972233);
            case 70 -> lIII(-660666579, var9 ^ 1184584167);
            case 71 -> lIII(-660666578, var9 ^ -1278684069);
            case 72 -> lIII(-660666577, var9 ^ 577241676);
            case 73 -> lIII(-660666592, var9 ^ -1759688500);
            case 74 -> lIII(-660666591, var9 ^ -1320575813);
            case 75 -> lIII(-660666590, var9 ^ 470469304);
            case 76 -> lIII(-660666589, var9 ^ 785472696);
            case 77 -> lIII(-660666588, var9 ^ -322425599);
            case 78 -> lIII(-660666587, var9 ^ -72900540);
            case 79 -> lIII(-660666586, var9 ^ -1520673896);
            case 80 -> lIII(-660666585, var9 ^ -1634328684);
            case 81 -> lIII(-660666600, var9 ^ 1714097450);
            case 82 -> lIII(-660666599, var9 ^ -1384347874);
            case 83 -> lIII(-660666598, var9 ^ 1590315077);
            case 84 -> lIII(-660666597, var9 ^ 1272704469);
            case 85 -> lIII(-660666596, var9 ^ 13269340);
            case 86 -> lIII(-660666595, var9 ^ -1544093478);
            case 87 -> lIII(-660666594, var9 ^ -366501785);
            case 88 -> lIII(-660666593, var9 ^ 1577463834);
            case 89 -> lIII(-660666608, var9 ^ 2020698813);
            case 90 -> lIII(-660666607, var9 ^ -1558071393);
            case 91 -> lIII(-660666606, var9 ^ -1011047750);
            case 92 -> lIII(-660666605, var9 ^ -1231109687);
            case 93 -> lIII(-660666604, var9 ^ 1680203778);
            case 94 -> lIII(-660666603, var9 ^ 1478130284);
            case 95 -> lIII(-660666602, var9 ^ 179825826);
            case 96 -> lIII(-660666601, var9 ^ 520935686);
            case 97 -> lIII(-660666616, var9 ^ -1060849986);
            case 98 -> lIII(-660666615, var9 ^ -1605235558);
            case 99 -> 5;
            case 100 -> lIII(-660666614, var9 ^ 1173689205);
            case 101 -> lIII(-660666613, var9 ^ 1177023865);
            case 102 -> lIII(-660666612, var9 ^ -704862242);
            case 103 -> lIII(-660666611, var9 ^ -6766211);
            case 104 -> lIII(-660666610, var9 ^ 1519494749);
            case 105 -> lIII(-660666609, var9 ^ -494936698);
            case 106 -> lIII(-660666624, var9 ^ 2083373390);
            case 107 -> lIII(-660666623, var9 ^ 1268150630);
            case 108 -> lIII(-660666622, var9 ^ 670056749);
            case 109 -> lIII(-660666621, var9 ^ 1968063348);
            case 110 -> lIII(-660666620, var9 ^ 213193560);
            case 111 -> lIII(-660666619, var9 ^ 876887672);
            case 112 -> lIII(-660666618, var9 ^ -558532090);
            case 113 -> lIII(-660666617, var9 ^ -415306443);
            case 114 -> lIII(-660666376, var9 ^ 702507561);
            case 115 -> lIII(-660666375, var9 ^ 1736993468);
            case 116 -> 3;
            case 117 -> lIII(-660666374, var9 ^ -613014096);
            case 118 -> lIII(-660666373, var9 ^ -244881487);
            case 119 -> lIII(-660666372, var9 ^ -1887310550);
            case 120 -> lIII(-660666371, var9 ^ 953769858);
            case 121 -> lIII(-660666370, var9 ^ -266771571);
            case 122 -> lIII(-660666369, var9 ^ 670034966);
            case 123 -> lIII(-660666384, var9 ^ 1187268604);
            case 124 -> lIII(-660666383, var9 ^ 1242793767);
            case 125 -> lIII(-660666382, var9 ^ 2078466521);
            case 126 -> lIII(-660666381, var9 ^ -874286113);
            case 127 -> lIII(-660666380, var9 ^ 549824966);
            case 128 -> lIII(-660666379, var9 ^ -686416665);
            case 129 -> 0;
            case 130 -> lIII(-660666378, var9 ^ 1598140155);
            case 131 -> lIII(-660666377, var9 ^ 180768510);
            case 132 -> lIII(-660666392, var9 ^ -340877397);
            case 133 -> lIII(-660666391, var9 ^ 868176971);
            case 134 -> lIII(-660666390, var9 ^ 40490947);
            case 135 -> lIII(-660666389, var9 ^ 2144293514);
            case 136 -> lIII(-660666388, var9 ^ 2007285202);
            case 137 -> lIII(-660666387, var9 ^ 1752104873);
            case 138 -> lIII(-660666386, var9 ^ -759385322);
            case 139 -> lIII(-660666385, var9 ^ 20178314);
            case 140 -> lIII(-660666400, var9 ^ -1936611330);
            case 141 -> lIII(-660666399, var9 ^ 225624943);
            case 142 -> lIII(-660666398, var9 ^ -1818686494);
            case 143 -> lIII(-660666397, var9 ^ 656865225);
            case 144 -> lIII(-660666396, var9 ^ 40610474);
            case 145 -> lIII(-660666395, var9 ^ -1265065477);
            case 146 -> lIII(-660666394, var9 ^ 175504123);
            case 147 -> lIII(-660666393, var9 ^ -1572145019);
            case 148 -> lIII(-660666408, var9 ^ -1906430317);
            case 149 -> lIII(-660666407, var9 ^ 1497660325);
            case 150 -> lIII(-660666406, var9 ^ 452305372);
            case 151 -> lIII(-660666405, var9 ^ -929689551);
            case 152 -> lIII(-660666404, var9 ^ 1068390243);
            case 153 -> lIII(-660666403, var9 ^ 2091457013);
            case 154 -> lIII(-660666402, var9 ^ 49869296);
            case 155 -> lIII(-660666401, var9 ^ 1869938847);
            case 156 -> lIII(-660666416, var9 ^ -1789285407);
            case 157 -> lIII(-660666415, var9 ^ -666275418);
            case 158 -> lIII(-660666414, var9 ^ -820664546);
            case 159 -> lIII(-660666413, var9 ^ 79081189);
            case 160 -> lIII(-660666412, var9 ^ -1580355311);
            case 161 -> 2;
            case 162 -> lIII(-660666411, var9 ^ -1431302901);
            case 163 -> lIII(-660666410, var9 ^ 229135220);
            case 164 -> lIII(-660666409, var9 ^ -1793058437);
            case 165 -> lIII(-660666424, var9 ^ -1828798969);
            case 166 -> lIII(-660666423, var9 ^ 894213444);
            case 167 -> lIII(-660666422, var9 ^ -1006245589);
            case 168 -> lIII(-660666421, var9 ^ -1622979251);
            case 169 -> lIII(-660666420, var9 ^ -1389966012);
            case 170 -> lIII(-660666419, var9 ^ 639281799);
            case 171 -> lIII(-660666418, var9 ^ 772494727);
            case 172 -> lIII(-660666417, var9 ^ -239722041);
            case 173 -> lIII(-660666432, var9 ^ 1180630754);
            case 174 -> lIII(-660666431, var9 ^ 1851434717);
            case 175 -> lIII(-660666430, var9 ^ 1062704187);
            case 176 -> lIII(-660666429, var9 ^ -1651935702);
            case 177 -> lIII(-660666428, var9 ^ 1420999506);
            case 178 -> lIII(-660666427, var9 ^ 306468380);
            case 179 -> lIII(-660666426, var9 ^ -474862156);
            case 180 -> lIII(-660666425, var9 ^ -1170394748);
            case 181 -> lIII(-660666440, var9 ^ -572182551);
            case 182 -> lIII(-660666439, var9 ^ -1529542549);
            case 183 -> lIII(-660666438, var9 ^ -1390202503);
            case 184 -> lIII(-660666437, var9 ^ 1094371184);
            case 185 -> lIII(-660666436, var9 ^ 695693622);
            case 186 -> lIII(-660666435, var9 ^ 484308067);
            case 187 -> lIII(-660666434, var9 ^ 1366492926);
            case 188 -> lIII(-660666433, var9 ^ -218740755);
            case 189 -> lIII(-660666448, var9 ^ -1830149684);
            case 190 -> lIII(-660666447, var9 ^ 1293264994);
            case 191 -> lIII(-660666446, var9 ^ -1246368789);
            case 192 -> lIII(-660666445, var9 ^ 2144719246);
            case 193 -> lIII(-660666444, var9 ^ -1081933996);
            case 194 -> lIII(-660666443, var9 ^ 1857068002);
            case 195 -> lIII(-660666442, var9 ^ -11413817);
            case 196 -> lIII(-660666441, var9 ^ 24006485);
            case 197 -> lIII(-660666456, var9 ^ -1707775866);
            case 198 -> lIII(-660666455, var9 ^ 89686163);
            case 199 -> lIII(-660666454, var9 ^ 2045311489);
            case 200 -> lIII(-660666453, var9 ^ -1424319009);
            case 201 -> lIII(-660666452, var9 ^ 1122546700);
            case 202 -> lIII(-660666451, var9 ^ -2045947449);
            case 203 -> lIII(-660666450, var9 ^ 1660850961);
            case 204 -> lIII(-660666449, var9 ^ -2102294691);
            case 205 -> lIII(-660666464, var9 ^ -2008990665);
            case 206 -> lIII(-660666463, var9 ^ 611672127);
            case 207 -> lIII(-660666462, var9 ^ -1683003898);
            case 208 -> lIII(-660666461, var9 ^ 750438197);
            case 209 -> lIII(-660666460, var9 ^ 948399034);
            case 210 -> lIII(-660666459, var9 ^ -1651286698);
            case 211 -> lIII(-660666458, var9 ^ 2100864826);
            case 212 -> lIII(-660666457, var9 ^ 173186021);
            case 213 -> lIII(-660666472, var9 ^ -1051129489);
            case 214 -> lIII(-660666471, var9 ^ -1365932749);
            case 215 -> lIII(-660666470, var9 ^ -1753456752);
            case 216 -> lIII(-660666469, var9 ^ -490885802);
            case 217 -> lIII(-660666468, var9 ^ 1828741264);
            case 218 -> lIII(-660666467, var9 ^ 1504504889);
            case 219 -> lIII(-660666466, var9 ^ -982028365);
            case 220 -> lIII(-660666465, var9 ^ -793212889);
            case 221 -> lIII(-660666480, var9 ^ -1741526069);
            case 222 -> lIII(-660666479, var9 ^ 1543785740);
            case 223 -> lIII(-660666478, var9 ^ -2115071240);
            case 224 -> lIII(-660666477, var9 ^ 1909565497);
            case 225 -> lIII(-660666476, var9 ^ -876282092);
            case 226 -> lIII(-660666475, var9 ^ 1757621447);
            case 227 -> lIII(-660666474, var9 ^ 788243743);
            case 228 -> lIII(-660666473, var9 ^ 1360838304);
            case 229 -> lIII(-660666488, var9 ^ -1372851498);
            case 230 -> lIII(-660666487, var9 ^ 51144173);
            case 231 -> lIII(-660666486, var9 ^ 128728204);
            case 232 -> lIII(-660666485, var9 ^ -929456159);
            case 233 -> lIII(-660666484, var9 ^ 34978999);
            case 234 -> lIII(-660666483, var9 ^ -1878177182);
            case 235 -> lIII(-660666482, var9 ^ 1609539202);
            case 236 -> lIII(-660666481, var9 ^ 824693708);
            case 237 -> lIII(-660666496, var9 ^ -154809076);
            case 238 -> lIII(-660666495, var9 ^ -339073762);
            case 239 -> lIII(-660666494, var9 ^ -1502777949);
            case 240 -> lIII(-660666493, var9 ^ -632761900);
            case 241 -> lIII(-660666492, var9 ^ -346315751);
            case 242 -> lIII(-660666491, var9 ^ -2078066432);
            case 243 -> lIII(-660666490, var9 ^ 1198056271);
            case 244 -> lIII(-660666489, var9 ^ -1703482266);
            case 245 -> lIII(-660666760, var9 ^ -2134020584);
            case 246 -> lIII(-660666759, var9 ^ 1528040265);
            case 247 -> lIII(-660666758, var9 ^ 539618812);
            case 248 -> lIII(-660666757, var9 ^ -1404964674);
            case 249 -> lIII(-660666756, var9 ^ -2054222433);
            case 250 -> lIII(-660666755, var9 ^ 268460114);
            case 251 -> lIII(-660666754, var9 ^ 1450792309);
            case 252 -> lIII(-660666753, var9 ^ 609328237);
            case 253 -> lIII(-660666768, var9 ^ -1991428138);
            case 254 -> lIII(-660666767, var9 ^ 1651947512);
            default -> lIII(-660666766, var9 ^ 2143047214);
         };
         int var5 = (var1 & lIII(-660666765, var9 ^ -1908607490)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIII(-660666764, var9 ^ 1110695765)) >>> lIII(-660666763, var9 ^ 1827902568)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIII(-660666762, var9 ^ -354005983);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIII(-660666761, var9 ^ -2121550744);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }

   public static double IlI(double var0, double var2, double var4, double var6) {
      return IIIlllIll.Ill(var0, var2, var4, var6);
   }

   public static int Ill(int var0, int var1) {
      return IIIlllIll.IIII(var0, var1);
   }

   public static boolean lII(IIIIIlII var0, double var1, double var3) {
      if (var0 == null) {
         return false;
      } else {
         double var5 = var0.lll();
         double var7 = var0.ll();
         IIlIIllll var9 = Il(var5, var7, var0.IIllI(), var0.IIIl(), var1, var3);
         if (Double.compare(var5, var9.II()) == 0 && Double.compare(var7, var9.l()) == 0) {
            return false;
         } else {
            var0.lllI(var9.II(), var9.l());
            return true;
         }
      }
   }

   public static double lIl(double var0) {
      double var2 = ll(var0, 0.0, 1.0);
      double var4 = 1.0 - var2;
      return 1.0 - var4 * var4 * var4;
   }

   public static float llI(float var0, float var1, float var2) {
      return IIIlllIll.Il(var0, var1, var2);
   }

   public static double lll(double var0) {
      double var2 = ll(var0, 0.0, 1.0);
      return 1.0 - (1.0 - var2) * (1.0 - var2);
   }

   private IllllllI() {
   }

   public static double IIII(double var0, double var2, double var4) {
      return IIIlllIll.II(var0, var2, var4);
   }

   private static int lIII(int var0, int var1) {
      int var2 = Il[var0 ^ -660666504] ^ var1 ^ var0;
      var2 += 63892;
      var2 ^= 51167;
      var2 -= 1788;
      var2 -= 53751;
      var2 ^= 45518;
      var2 ^= 7798;
      var2 -= 20994;
      var2 ^= 6277;
      var2 -= 63380;
      return var2 + 48451;
   }

   private static int IIIl(double var0) {
      String[] var2 = IIllllIl.IIIIl();
      double var3 = Math.abs(var0);
      if (var3 <= 0.0) {
         return 0;
      } else {
         int var5 = 0;

         while (var5 < lIII(-660666776, -1074359350 ^ 881242812) && Math.abs(var3 - Math.rint(var3)) > 1.0E-6) {
            var3 *= 10.0;
            var5++;
            if (var2 != null) {
               break;
            }
         }

         return var5;
      }
   }

   public static int IIlI(int var0, int var1, double var2) {
      int var18 = 1250648655;
      double var4 = ll(var2, 0.0, 1.0);
      int var6 = var0 >>> lIII(-660666775, var18 ^ -871870452) & lIII(-660666774, var18 ^ -367715219);
      int var7 = var0 >>> lIII(-660666773, var18 ^ -1318014781) & lIII(-660666772, var18 ^ -572058013);
      int var8 = var0 >>> lIII(-660666771, var18 ^ -1162464237) & lIII(-660666770, var18 ^ 1141640101);
      int var9 = var0 & lIII(-660666769, var18 ^ -1343282476);
      int var10 = var1 >>> lIII(-660666784, var18 ^ -1931083548) & lIII(-660666783, var18 ^ -394616708);
      int var11 = var1 >>> lIII(-660666782, var18 ^ 70887887) & lIII(-660666781, var18 ^ -1839541154);
      int var12 = var1 >>> lIII(-660666780, var18 ^ -1863079348) & lIII(-660666779, var18 ^ 271677094);
      int var13 = var1 & lIII(-660666778, var18 ^ -93907433);
      int var14 = IlII((int)Math.round(IIII(var6, var10, var4)), 0, lIII(-660666777, var18 ^ -1429854824));
      int var15 = IlII((int)Math.round(IIII(var7, var11, var4)), 0, lIII(-660666792, var18 ^ -778944251));
      int var16 = IlII((int)Math.round(IIII(var8, var12, var4)), 0, lIII(-660666791, var18 ^ 481314474));
      int var17 = IlII((int)Math.round(IIII(var9, var13, var4)), 0, lIII(-660666790, var18 ^ 674124643));
      return var14 << lIII(-660666789, var18 ^ 551910157) | var15 << lIII(-660666788, var18 ^ 255894451) | var16 << lIII(-660666787, var18 ^ 848313497) | var17;
   }

   public static int IIll(int var0, int var1, double var2) {
      return IIIlllIll.IIlI(var0, var1, var2);
   }

   public static int IlII(int var0, int var1, int var2) {
      return IIIlllIll.lIl(var0, var1, var2);
   }

   public static boolean IlIl(double var0, double var2, double var4, double var6, double var8, double var10) {
      return IIIlllIll.I(var0, var2, var4, var6, var8, var10);
   }

   public static double IllI(double var0, double var2, double var4) {
      return var4 <= var2 ? 0.0 : ll((var0 - var2) / (var4 - var2), 0.0, 1.0);
   }

   public static String Illl(double var0, double var2, String var4) {
      String[] var5 = IIllllIl.IIIIl();
      int var6 = IIIl(var2);
      String var10000;
      if (var6 <= 0) {
         var10000 = Long.toString(Math.round(var0));
      } else {
         Locale var11 = Locale.US;
         String var10001 = IlIIllIII.lI(II[1]);
         String var10 = IlIIllIII.lI(II[0]);
         String var8 = var10001;
         var10000 = String.format(var11, var8 + var6 + var10, var0);
      }

      String var7 = var10000;
      if (var6 > 0 && var7.indexOf(lIII(-660666793, -457871051 ^ 741570446)) >= 0) {
         while (var7.endsWith(IlIIllIII.lI(II[3]))) {
            var7 = var7.substring(0, var7.length() - 1);
            if (var5 != null) {
               break;
            }
         }

         if (var7.endsWith(IlIIllIII.lI(II[2]))) {
            var7 = var7.substring(0, var7.length() - 1);
         }
      }

      return var4 != null && !var4.isBlank() ? var7 + var4 : var7;
   }
}
