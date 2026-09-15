package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_12249;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4588;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public final class IIIII extends IlIIIIIIl {
   private static String[] I;
   private static final int II = 8;
   private static final String[] Ill;
   private static final double Il = 3.0;
   private static final int[] IlI;
   private static final Object[] lII;
   private static final String[] lI;
   private static final String[] ll;
   private static final int III = 72;
   private static final double IIl = 0.05;

   private Color I(Color var1, Color var2, double var3) {
      double var5 = Math.max(0.0, Math.min(1.0, var3));
      int var7 = (int)Math.round(var1.getRed() + (var2.getRed() - var1.getRed()) * var5);
      int var8 = (int)Math.round(var1.getGreen() + (var2.getGreen() - var1.getGreen()) * var5);
      int var9 = (int)Math.round(var1.getBlue() + (var2.getBlue() - var1.getBlue()) * var5);
      return new Color(var7, var8, var9);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 942394880;
      int var10001 = "eᜁ\ue880\uf715ヨ죮쪢ꬽ鐿掬ᇡ\uf573鏝陝\uda2b畭㯻烁\ue792\uec17㧖漐묂엛쿇鄈\ue759䫝팒病ᦱ꺩睇ଔ鶌嫊ଋ\uf5cf䣅蹏끹翃薋ꎅ툏㼵⟥\udf01\ufff3骕潒挰옎逗鿷뫦㢆㘒혋ܤ櫠듻Ꙉ섟ꕧ調偎禄Ҵ\u1cbc貿⹈쩘柿\ude1f쎪ỽ家倱李잝ꠊ㔯쨷ꏿ鈙肩㬄⟁茩\udc1a葎\u0adaⶥ\uf768\udea8璗郛繞탸\uf4d1蔦"
         .length();
      int var17 = 0;
      short var18 = 237;
      String[] var15 = new String[1];
      int var14 = var10001;
      String var13 = "eᜁ\ue880\uf715ヨ죮쪢ꬽ鐿掬ᇡ\uf573鏝陝\uda2b畭㯻烁\ue792\uec17㧖漐묂엛쿇鄈\ue759䫝팒病ᦱ꺩睇ଔ鶌嫊ଋ\uf5cf䣅蹏끹翃薋ꎅ툏㼵⟥\udf01\ufff3骕潒挰옎逗鿷뫦㢆㘒혋ܤ櫠듻Ꙉ섟ꕧ調偎禄Ҵ\u1cbc貿⹈쩘柿\ude1f쎪ỽ家倱李잝ꠊ㔯쨷ꏿ鈙肩㬄⟁茩\udc1a葎\u0adaⶥ\uf768\udea8璗郛繞탸\uf4d1蔦";
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         char[] var10000 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;
         char[] var20 = var10000;

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

      Ill = var15;
      lII = new Object[var15.length];
      int var9 = 1002165014;
      byte[] var7 = "\u008e \u0095\u0003ð×\u009a\u0003¶%o<Íð¯»\u0099#ý,yvVÔË_\u0002²¿\u008e\u001f|7\u008c\u0002ÿ¦}cs¼\u000e\u000e-\\\u0085W\u001d¨(°3>H\u00948\u0015Vê\nß`kR\u009d\u008fÁ\u0082È^ò)\u0000\u0085\b\u0085'b\u00121\u0012òòO( H»\u0088à'\u001fí/U\u000e\u009c\u0085\u0094ä\u0014÷ãi-rZµ\u009d¡®0Ë\u001fVfÔ\u009b_uÞ#\u0013¿YeC·M\u0016\u0007é¥!»W=\u0097Ô\u0019¥·\u009c\u007fI\u0098ê!\u007f\u0018å·ÂÈ\u001dLìO{\u001dDNÃL:ËZÅ-fr\f\u00962\u008eøö\u0089S*ñYî%¦ròè#c(î4´æloÏ=L3>\u0013=\u0087%7=\bá\u0013qDOþ\r\u0092\u009fße!î\u0016[½t\u0019ØAÛv\u000f'\u00adÙ{\u001eÊ@\u0094¿þÃ\u001e\u0017¸(\u0093\u000f2ÔÜ\u0010Õ\"\u0089Úû°;\u009d/c1LX\u008cûNiN¼|v\u0086ØÆì\u00833\u001bóÙH&±\u0086\u0098Ç\u0095%\u001e¯o9ÚdÓ«¹WÌA¶\"\u0093 ëÄ\u001cÂ[\u0082\u0003\u0097\u0017T\u00ad[Twp\u0003me>aµ$\u0016\u0012ñIavE\u0085\u0083l¨\u0000¼q\\ºLz¿0·Þ\u0091\u0083Ð\u009få\u008eÔº¤£'AÎº\u0006¾\u0083¨Îø½¨>Ð7XÑÅT¬)ºÏ\u000eÛq\u0014oS|\u0097\u008c# n·ý¦é}Sdð\u0087S_\u000b¸\u0084ç\u0088\u0084µÉ\u0019¤æ9\u001fÒ¼\u0087\u001dò~\u001azA\u0004OòKh¿º¯\u000f\u001f{\u0087@IB\u0087è$Ä¢ø¸\u0007éh\"=õµãöE0Q\rIï½h\u009fÅÎ².\u0013edÀ\u000e\b¡£h®Ä¿\u001e¯P\u001d7\u0013Ø\u0006Å¡C9ÄéÑ¹Ëá¶¨@\u001füÎ\u0083²?a\b£\u0003\nPo\u0086a\u0087ã\u008db\u00900\u0098¼\u0086æA\n\u0003F\u0006ÿQ\u0011´°\tt@Häa\u0002ËmÈ±\u0001 ±E \u0083ÿÌÚò\u000f\u0003\u0084·º®ê\u0091¤'\"«\u0094ÿ(\r1?Y\u0097\"/}Û\u0090\u0088ø\u0095|\rsú:(¼R\u008f\u009f×\u0094Ò,}kí]\u0011\u0091S%\u0015\u0017!eñPÕÚ\\\u0013\u009aiº\r¥\u00ad:tKH\u0096×Ã5Âõ\u0002²½æÐ~\u0000\u0018±F\u0011`ãðú\u001e\u0080DIÇ\u009eVÄ¢zý\u0014Jò\u0092ªÖO&m÷Î;ã \u0013ÔJÇâ*\røàWá¨6\u007f\u0087S\u007fê_Ðm¢ç¡þ\u009a\u0015xÕ\u0094w\u0091þM5\u0006¨\u0006\u0084;î\u0081\u008d<\u0000\u008aøç,\u0090üc\u008bÿÊW\u008fª\u00193²\u0098â¹\u000bÊf\bj¢´¦ú\u0010ÒåH§\u007fMr\u0095¶îõ\u009a\u0003Ävì:\u0086;hÞ+Ð§ê\u009d8é_ý3æÂô\u0019ÃÊ\u001föØ¬\u009aÝ÷Íï\u0097¥\u0012s\u001dM\u000bÕoI\u0011\u000fa\t^sü\u0019\u0083ÐÜsO_ªùæ©½=\u0083\"n)Þ\t\u008a?:\u0094<¾\n\u00991ãÚ%j'ø·AÙ\u001cs/\u009aÞÒ\u0013%4\u0094º¤\u008a\u001aì8ÿê\u0002\u00ad\u001dvd,XWZ¼\u0095Ü\u0090T\u0085àÂ2kj4q|2LÛß6`u\u0081\u0089ö9ø72\u0001X\u00adç×h{s\r@vg©^\u009aóN¹_6¦\u0096Ç\u00ad:r\u009d³ï\u0089 uvÕY\u0097b_ye¤¸\u0099ð\u0015\u0098s\u009b}å\u0010\u000fÍ\u008dN\u0090pd\u007f&¿Ñ\u0019Í;ï\\e\u0086\u0096\u0098:!\u00902ãs$~\u008cNòF¿¯Æ\u008b\u0005»\u000b¯Ô\u00121\u00adr2\u0087®\u0094jw,yÔm÷ø\u008f\u0016ÀfóÙ¿2\u009b7ò\u0005på\u000b\u009773#j\u000fÞ¢¹\u001dòÝ?\u0090Eö\u001eà-B;Öæe2®\u008bÆðwãÕN$\u009c\u001e\u0006Î\" ¨\u0097\bê\u009f×\u0011wéãÿgø\u0081sþÑ\"²\u0014\u0090\u009d\u0002°6%\u0094`ÞV;\u0082æHXð\u001b¦)\u0080!²\u0099Ò\u001cíFeÊ(Xô\u009d\u0085\u0015î\u0007ºl\u0080\u000bäûÁ¶\u009dñ÷ê\u009a\u008f\u0002ë ý÷\t\u0011DÂgß\u0014\u008fc*6Éj."
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

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lII(1807782942, (short)18458, 569987846, 262429139)).length();
      int var1 = Ill(-1601232512, var23 ^ -759158799);
      int var0 = -1;

      while (true) {
         char[] var10002;
         label74: {
            int var26 = Ill(-1601232511, var23 ^ -1405671402);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var33 = var26;
            var10002 = var10003;
            var10001 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var26;
               var10006 = var6;
            } else {
               var33 = var26;
               var10001 = var10004;
               if (var10004 <= var6) {
                  break label74;
               }

               var10005 = var10003;
               var10004 = var26;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % Ill(-1601232510, var23 ^ -356133121)) {
                  case 0 -> Ill(-1601232509, var23 ^ -1861214563);
                  case 1 -> Ill(-1601232508, var23 ^ -977055791);
                  case 2 -> Ill(-1601232507, var23 ^ 630646755);
                  case 3 -> Ill(-1601232506, var23 ^ -1749045088);
                  case 4 -> Ill(-1601232505, var23 ^ -479285706);
                  case 5 -> Ill(-1601232504, var23 ^ 1802286023);
                  default -> Ill(-1601232503, var23 ^ -90320340);
               });
               var6++;
               if (var33 == 0) {
                  var10006 = var33;
                  var10005 = var10002;
                  var10004 = var33;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var33;
                  var10006 = var6;
               }
            }
         }

         String var35 = new String(var10002).intern();
         byte var30 = -1;
         var5[var3++] = var35;
         if ((var0 += var1) >= var4) {
            lI = var5;
            ll = new String[2];
            I = new String[2];
            II();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static int Ill(int var0, int var1) {
      int var2 = IlI[var0 ^ -1601232512] ^ var1 ^ var0;
      var2 -= 25235;
      var2 ^= 17547;
      var2 -= 7808;
      var2 += 64427;
      var2 ^= 38017;
      var2 -= 44106;
      var2 -= 32768;
      return var2 + 21590;
   }

   private class_243 l(class_310 var1, class_1657 var2, class_243 var3) {
      class_243 var4 = var3.method_1031(0.0, 1.0, 0.0);
      class_243 var5 = new class_243(var3.field_1352, var1.field_1687.method_31607() - 1.0, var3.field_1350);
      class_3965 var6 = var1.field_1687.method_17742(new class_3959(var4, var5, class_3960.field_17558, class_242.field_1348, var2));
      if (var6 != null && var6.method_17783() == class_240.field_1332) {
         class_243 var7 = var6.method_17784();
         return new class_243(var3.field_1352, var7.field_1351 + 0.05, var3.field_1350);
      } else {
         return null;
      }
   }

   private static void II() {
      int var0 = 1207976892;
      I[0] = IIl(Il(Ill(-1601232502, var0 ^ 1866072776), Ill(-1601232501, var0 ^ 1884173726)).toCharArray(), 18808L, Ill(-1601232500, var0 ^ -363977969));
      I[1] = IIl(Il(Ill(-1601232499, var0 ^ -310601509), Ill(-1601232498, var0 ^ -966638779)).toCharArray(), 75353L, Ill(-1601232497, var0 ^ 782999850));
   }

   private static String lII(int var0, short var1, int var2, int var3) {
      int var8 = var0 ^ 1807782942;
      char[] var7 = Ill[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])lII[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         lII[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 59929;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 11) {
            default -> 245;
            case 1 -> 121;
            case 2 -> 238;
            case 3 -> 12;
            case 4 -> 220;
            case 5 -> 51;
            case 6 -> 181;
            case 7 -> 204;
            case 8 -> 50;
            case 9 -> 113;
            case 10 -> 213;
         } ^ var3 ^ var2 ^ var5 ^ var1 ^ var0);
      }

      return new String(var7).intern();
   }

   private static String Il(int var0, int var1) {
      int var9 = 1173636247;
      int var2 = (var0 ^ Ill(-1601232496, var9 ^ 1129302615)) & Ill(-1601232495, var9 ^ 379502950);
      if (ll[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & Ill(-1601232494, var9 ^ 565850313)) {
            case 0 -> Ill(-1601232493, var9 ^ 106768921);
            case 1 -> Ill(-1601232492, var9 ^ 869124529);
            case 2 -> Ill(-1601232491, var9 ^ 161444780);
            case 3 -> Ill(-1601232490, var9 ^ -1444996091);
            case 4 -> Ill(-1601232489, var9 ^ -871338703);
            case 5 -> Ill(-1601232488, var9 ^ -1111838735);
            case 6 -> Ill(-1601232487, var9 ^ 902355112);
            case 7 -> Ill(-1601232486, var9 ^ 206398090);
            case 8 -> Ill(-1601232485, var9 ^ -1130457432);
            case 9 -> Ill(-1601232484, var9 ^ -366973522);
            case 10 -> Ill(-1601232483, var9 ^ -173775460);
            case 11 -> Ill(-1601232482, var9 ^ -14931859);
            case 12 -> Ill(-1601232481, var9 ^ 2019195824);
            case 13 -> Ill(-1601232480, var9 ^ 1814642520);
            case 14 -> Ill(-1601232479, var9 ^ -2078375097);
            case 15 -> Ill(-1601232478, var9 ^ 480832519);
            case 16 -> Ill(-1601232477, var9 ^ -2071419844);
            case 17 -> Ill(-1601232476, var9 ^ 1755828657);
            case 18 -> Ill(-1601232475, var9 ^ 1579670978);
            case 19 -> Ill(-1601232474, var9 ^ -470341927);
            case 20 -> Ill(-1601232473, var9 ^ -848280762);
            case 21 -> Ill(-1601232472, var9 ^ 1701968665);
            case 22 -> Ill(-1601232471, var9 ^ 469000566);
            case 23 -> Ill(-1601232470, var9 ^ 207178208);
            case 24 -> Ill(-1601232469, var9 ^ -1223838440);
            case 25 -> Ill(-1601232468, var9 ^ -675911492);
            case 26 -> Ill(-1601232467, var9 ^ -798567001);
            case 27 -> Ill(-1601232466, var9 ^ -2024947275);
            case 28 -> Ill(-1601232465, var9 ^ 39588407);
            case 29 -> Ill(-1601232464, var9 ^ 361487992);
            case 30 -> Ill(-1601232463, var9 ^ 1324353236);
            case 31 -> Ill(-1601232462, var9 ^ 302066488);
            case 32 -> Ill(-1601232461, var9 ^ -1508242227);
            case 33 -> Ill(-1601232460, var9 ^ 702425167);
            case 34 -> Ill(-1601232459, var9 ^ 1701889653);
            case 35 -> Ill(-1601232458, var9 ^ -1281301085);
            case 36 -> Ill(-1601232457, var9 ^ 13708835);
            case 37 -> Ill(-1601232456, var9 ^ -1672797635);
            case 38 -> Ill(-1601232455, var9 ^ 1625574921);
            case 39 -> Ill(-1601232454, var9 ^ 110289248);
            case 40 -> 1;
            case 41 -> Ill(-1601232453, var9 ^ 1073052586);
            case 42 -> Ill(-1601232452, var9 ^ -1631454411);
            case 43 -> Ill(-1601232451, var9 ^ 914821713);
            case 44 -> Ill(-1601232450, var9 ^ 772665137);
            case 45 -> Ill(-1601232449, var9 ^ 837425441);
            case 46 -> Ill(-1601232448, var9 ^ -71005288);
            case 47 -> 4;
            case 48 -> Ill(-1601232447, var9 ^ -1139779375);
            case 49 -> 0;
            case 50 -> Ill(-1601232446, var9 ^ 1835513783);
            case 51 -> Ill(-1601232445, var9 ^ 1867937094);
            case 52 -> Ill(-1601232444, var9 ^ 1565113994);
            case 53 -> Ill(-1601232443, var9 ^ -405554179);
            case 54 -> Ill(-1601232442, var9 ^ 986506239);
            case 55 -> Ill(-1601232441, var9 ^ 126795497);
            case 56 -> Ill(-1601232440, var9 ^ -425058731);
            case 57 -> Ill(-1601232439, var9 ^ -1907359311);
            case 58 -> Ill(-1601232438, var9 ^ 1173131530);
            case 59 -> Ill(-1601232437, var9 ^ 1995668042);
            case 60 -> Ill(-1601232436, var9 ^ 61643583);
            case 61 -> Ill(-1601232435, var9 ^ -450627136);
            case 62 -> Ill(-1601232434, var9 ^ -1556304746);
            case 63 -> Ill(-1601232433, var9 ^ 1972527317);
            case 64 -> Ill(-1601232432, var9 ^ 1448033092);
            case 65 -> Ill(-1601232431, var9 ^ 1140939492);
            case 66 -> Ill(-1601232430, var9 ^ 86584042);
            case 67 -> Ill(-1601232429, var9 ^ 1751010896);
            case 68 -> Ill(-1601232428, var9 ^ -1531161460);
            case 69 -> Ill(-1601232427, var9 ^ 562252081);
            case 70 -> Ill(-1601232426, var9 ^ -1686945037);
            case 71 -> Ill(-1601232425, var9 ^ 294183988);
            case 72 -> Ill(-1601232424, var9 ^ -1561353118);
            case 73 -> Ill(-1601232423, var9 ^ -1343520060);
            case 74 -> Ill(-1601232422, var9 ^ -2112326917);
            case 75 -> Ill(-1601232421, var9 ^ -1690729015);
            case 76 -> Ill(-1601232420, var9 ^ -1980645210);
            case 77 -> Ill(-1601232419, var9 ^ -1996362756);
            case 78 -> Ill(-1601232418, var9 ^ 2045705889);
            case 79 -> Ill(-1601232417, var9 ^ -1927904564);
            case 80 -> Ill(-1601232416, var9 ^ 803490706);
            case 81 -> Ill(-1601232415, var9 ^ 1315718271);
            case 82 -> Ill(-1601232414, var9 ^ -1390667029);
            case 83 -> Ill(-1601232413, var9 ^ -1765630213);
            case 84 -> Ill(-1601232412, var9 ^ 1550606166);
            case 85 -> Ill(-1601232411, var9 ^ -1502844951);
            case 86 -> Ill(-1601232410, var9 ^ -1715741467);
            case 87 -> Ill(-1601232409, var9 ^ -1517620349);
            case 88 -> Ill(-1601232408, var9 ^ -2049375949);
            case 89 -> Ill(-1601232407, var9 ^ -209470247);
            case 90 -> 5;
            case 91 -> Ill(-1601232406, var9 ^ -750706028);
            case 92 -> Ill(-1601232405, var9 ^ 1614509176);
            case 93 -> Ill(-1601232404, var9 ^ 1784121175);
            case 94 -> Ill(-1601232403, var9 ^ -1909447186);
            case 95 -> Ill(-1601232402, var9 ^ -1501597374);
            case 96 -> Ill(-1601232401, var9 ^ -1495851252);
            case 97 -> Ill(-1601232400, var9 ^ -2084076590);
            case 98 -> Ill(-1601232399, var9 ^ -933815811);
            case 99 -> Ill(-1601232398, var9 ^ -729098213);
            case 100 -> Ill(-1601232397, var9 ^ 1678731574);
            case 101 -> Ill(-1601232396, var9 ^ 1758496099);
            case 102 -> Ill(-1601232395, var9 ^ -1090849201);
            case 103 -> Ill(-1601232394, var9 ^ 254563967);
            case 104 -> Ill(-1601232393, var9 ^ -516869964);
            case 105 -> Ill(-1601232392, var9 ^ -2108188972);
            case 106 -> Ill(-1601232391, var9 ^ -1641966436);
            case 107 -> Ill(-1601232390, var9 ^ 1007167566);
            case 108 -> Ill(-1601232389, var9 ^ 670734615);
            case 109 -> Ill(-1601232388, var9 ^ 419156404);
            case 110 -> Ill(-1601232387, var9 ^ -1728783846);
            case 111 -> Ill(-1601232386, var9 ^ -1988156350);
            case 112 -> Ill(-1601232385, var9 ^ -272856372);
            case 113 -> Ill(-1601232640, var9 ^ 1077386154);
            case 114 -> Ill(-1601232639, var9 ^ 728717173);
            case 115 -> Ill(-1601232638, var9 ^ 1085855967);
            case 116 -> Ill(-1601232637, var9 ^ 1135544381);
            case 117 -> Ill(-1601232636, var9 ^ -1648763166);
            case 118 -> Ill(-1601232635, var9 ^ 725384508);
            case 119 -> Ill(-1601232634, var9 ^ -563205490);
            case 120 -> Ill(-1601232633, var9 ^ -1858711697);
            case 121 -> Ill(-1601232632, var9 ^ 1775983039);
            case 122 -> Ill(-1601232631, var9 ^ -363662343);
            case 123 -> Ill(-1601232630, var9 ^ 538937981);
            case 124 -> Ill(-1601232629, var9 ^ -2118335241);
            case 125 -> Ill(-1601232628, var9 ^ -70436933);
            case 126 -> Ill(-1601232627, var9 ^ -1517780359);
            case 127 -> Ill(-1601232626, var9 ^ -877749093);
            case 128 -> Ill(-1601232625, var9 ^ 60076002);
            case 129 -> Ill(-1601232624, var9 ^ 154274234);
            case 130 -> Ill(-1601232623, var9 ^ 2024282410);
            case 131 -> Ill(-1601232622, var9 ^ 1558489212);
            case 132 -> Ill(-1601232621, var9 ^ -643152041);
            case 133 -> Ill(-1601232620, var9 ^ 1388642681);
            case 134 -> Ill(-1601232619, var9 ^ -1653754003);
            case 135 -> Ill(-1601232618, var9 ^ -156505352);
            case 136 -> Ill(-1601232617, var9 ^ 1549063563);
            case 137 -> Ill(-1601232616, var9 ^ 816737236);
            case 138 -> Ill(-1601232615, var9 ^ 875041450);
            case 139 -> Ill(-1601232614, var9 ^ -797971002);
            case 140 -> Ill(-1601232613, var9 ^ 2100077050);
            case 141 -> Ill(-1601232612, var9 ^ -1691181755);
            case 142 -> Ill(-1601232611, var9 ^ 457929701);
            case 143 -> Ill(-1601232610, var9 ^ -1209468829);
            case 144 -> Ill(-1601232609, var9 ^ -473286141);
            case 145 -> 3;
            case 146 -> Ill(-1601232608, var9 ^ -1663440053);
            case 147 -> Ill(-1601232607, var9 ^ 556239429);
            case 148 -> Ill(-1601232606, var9 ^ 811587791);
            case 149 -> Ill(-1601232605, var9 ^ -618546200);
            case 150 -> Ill(-1601232604, var9 ^ 1761126021);
            case 151 -> Ill(-1601232603, var9 ^ -442678859);
            case 152 -> Ill(-1601232602, var9 ^ 896911865);
            case 153 -> Ill(-1601232601, var9 ^ -1947633696);
            case 154 -> Ill(-1601232600, var9 ^ 1288238401);
            case 155 -> Ill(-1601232599, var9 ^ -1029756538);
            case 156 -> Ill(-1601232598, var9 ^ 1811471093);
            case 157 -> Ill(-1601232597, var9 ^ 751295485);
            case 158 -> Ill(-1601232596, var9 ^ -1063842459);
            case 159 -> Ill(-1601232595, var9 ^ -1502853986);
            case 160 -> Ill(-1601232594, var9 ^ 2129614347);
            case 161 -> Ill(-1601232593, var9 ^ -962673025);
            case 162 -> Ill(-1601232592, var9 ^ 877129075);
            case 163 -> Ill(-1601232591, var9 ^ 1454294687);
            case 164 -> Ill(-1601232590, var9 ^ 339316907);
            case 165 -> Ill(-1601232589, var9 ^ -1526409727);
            case 166 -> Ill(-1601232588, var9 ^ -1409075091);
            case 167 -> Ill(-1601232587, var9 ^ -640149558);
            case 168 -> Ill(-1601232586, var9 ^ -581127982);
            case 169 -> Ill(-1601232585, var9 ^ -345458785);
            case 170 -> Ill(-1601232584, var9 ^ 940345931);
            case 171 -> Ill(-1601232583, var9 ^ -1014615240);
            case 172 -> Ill(-1601232582, var9 ^ 1194807526);
            case 173 -> Ill(-1601232581, var9 ^ -1785085860);
            case 174 -> Ill(-1601232580, var9 ^ -203787339);
            case 175 -> Ill(-1601232579, var9 ^ 1584548245);
            case 176 -> Ill(-1601232578, var9 ^ -1747857886);
            case 177 -> Ill(-1601232577, var9 ^ 586894867);
            case 178 -> Ill(-1601232576, var9 ^ 465109164);
            case 179 -> Ill(-1601232575, var9 ^ -15406449);
            case 180 -> Ill(-1601232574, var9 ^ -878575432);
            case 181 -> Ill(-1601232573, var9 ^ 2126646081);
            case 182 -> Ill(-1601232572, var9 ^ -473226969);
            case 183 -> Ill(-1601232571, var9 ^ -350171593);
            case 184 -> Ill(-1601232570, var9 ^ -1918507692);
            case 185 -> Ill(-1601232569, var9 ^ -321868619);
            case 186 -> Ill(-1601232568, var9 ^ 860628863);
            case 187 -> Ill(-1601232567, var9 ^ 720001022);
            case 188 -> Ill(-1601232566, var9 ^ 808475347);
            case 189 -> Ill(-1601232565, var9 ^ 2135737551);
            case 190 -> Ill(-1601232564, var9 ^ -1561336233);
            case 191 -> Ill(-1601232563, var9 ^ 1851822616);
            case 192 -> Ill(-1601232562, var9 ^ -946436625);
            case 193 -> Ill(-1601232561, var9 ^ -1575135579);
            case 194 -> Ill(-1601232560, var9 ^ -13192607);
            case 195 -> Ill(-1601232559, var9 ^ 464192738);
            case 196 -> Ill(-1601232558, var9 ^ 732301997);
            case 197 -> Ill(-1601232557, var9 ^ -82161362);
            case 198 -> Ill(-1601232556, var9 ^ -645367521);
            case 199 -> Ill(-1601232555, var9 ^ 1028397002);
            case 200 -> Ill(-1601232554, var9 ^ -1234944);
            case 201 -> Ill(-1601232553, var9 ^ 363561112);
            case 202 -> Ill(-1601232552, var9 ^ -1423584002);
            case 203 -> Ill(-1601232551, var9 ^ -556451377);
            case 204 -> Ill(-1601232550, var9 ^ 1011441486);
            case 205 -> Ill(-1601232549, var9 ^ 2036883586);
            case 206 -> Ill(-1601232548, var9 ^ -1260147914);
            case 207 -> Ill(-1601232547, var9 ^ -1528825168);
            case 208 -> Ill(-1601232546, var9 ^ 1247087756);
            case 209 -> Ill(-1601232545, var9 ^ 1561163512);
            case 210 -> Ill(-1601232544, var9 ^ -32941248);
            case 211 -> Ill(-1601232543, var9 ^ -1598632900);
            case 212 -> Ill(-1601232542, var9 ^ -653784592);
            case 213 -> Ill(-1601232541, var9 ^ 2039668527);
            case 214 -> Ill(-1601232540, var9 ^ 1229212583);
            case 215 -> Ill(-1601232539, var9 ^ 1632198598);
            case 216 -> Ill(-1601232538, var9 ^ 2141571180);
            case 217 -> Ill(-1601232537, var9 ^ -1738537685);
            case 218 -> Ill(-1601232536, var9 ^ -1208445327);
            case 219 -> Ill(-1601232535, var9 ^ 1403160748);
            case 220 -> Ill(-1601232534, var9 ^ -1465954455);
            case 221 -> Ill(-1601232533, var9 ^ -194597865);
            case 222 -> Ill(-1601232532, var9 ^ 2118540943);
            case 223 -> Ill(-1601232531, var9 ^ -1717122861);
            case 224 -> Ill(-1601232530, var9 ^ -1186159698);
            case 225 -> Ill(-1601232529, var9 ^ -1003537330);
            case 226 -> Ill(-1601232528, var9 ^ -1401837346);
            case 227 -> Ill(-1601232527, var9 ^ 1161829536);
            case 228 -> Ill(-1601232526, var9 ^ -265881813);
            case 229 -> Ill(-1601232525, var9 ^ -832348461);
            case 230 -> Ill(-1601232524, var9 ^ -1213791947);
            case 231 -> Ill(-1601232523, var9 ^ -1324492766);
            case 232 -> Ill(-1601232522, var9 ^ 88192040);
            case 233 -> Ill(-1601232521, var9 ^ -747010202);
            case 234 -> Ill(-1601232520, var9 ^ -407618298);
            case 235 -> 2;
            case 236 -> Ill(-1601232519, var9 ^ 714140870);
            case 237 -> Ill(-1601232518, var9 ^ 278022809);
            case 238 -> Ill(-1601232517, var9 ^ -1500401843);
            case 239 -> Ill(-1601232516, var9 ^ 1444102418);
            case 240 -> Ill(-1601232515, var9 ^ 1288224776);
            case 241 -> Ill(-1601232514, var9 ^ 939482579);
            case 242 -> Ill(-1601232513, var9 ^ -125826642);
            case 243 -> Ill(-1601232768, var9 ^ 382549003);
            case 244 -> Ill(-1601232767, var9 ^ -1003180625);
            case 245 -> Ill(-1601232766, var9 ^ 303846224);
            case 246 -> Ill(-1601232765, var9 ^ -6455194);
            case 247 -> Ill(-1601232764, var9 ^ -740162248);
            case 248 -> Ill(-1601232763, var9 ^ 1690903788);
            case 249 -> Ill(-1601232762, var9 ^ 209519260);
            case 250 -> Ill(-1601232761, var9 ^ -950400215);
            case 251 -> Ill(-1601232760, var9 ^ -1426470236);
            case 252 -> Ill(-1601232759, var9 ^ -1024821413);
            case 253 -> Ill(-1601232758, var9 ^ -1121894581);
            case 254 -> Ill(-1601232757, var9 ^ 52400700);
            default -> Ill(-1601232756, var9 ^ 701867727);
         };
         int var5 = (var1 & Ill(-1601232755, var9 ^ 810078384)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Ill(-1601232754, var9 ^ 564644561)) >>> Ill(-1601232753, var9 ^ 1388438336)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Ill(-1601232752, var9 ^ -1825855021);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Ill(-1601232751, var9 ^ 596578154);
            }
         }

         ll[var2] = new String(var3).intern();
      }

      return ll[var2];
   }

   private class_243 lI(class_243 var1, double var2, int var4) {
      double var5 = (Math.PI * 2) * var4 / 72.0;
      return var1.method_1031(Math.cos(var5) * var2, 0.0, Math.sin(var5) * var2);
   }

   private void ll(lIIlIl var1, class_243 var2) {
      class_243 var4 = IlIII.Illll(var1);
      Matrix4f var5 = var1.I().method_23760().method_23761();
      String[] var10000 = IIllllIl.IIIIl();
      class_4588 var6 = IlIII.lIl(var1).method_73477(class_12249.method_76023());
      String[] var3 = var10000;
      int var7 = 0;

      while (var7 < Ill(-1601232750, 985045161 ^ -904056809)) {
         double var8 = 3.0 * var7 / 8.0;
         double var10 = 3.0 * (var7 + 1) / 8.0;
         double var12 = 1.0 - var7 / 8.0;
         double var14 = 1.0 - (var7 + 1) / 8.0;
         Color var16 = this.III(var12);
         Color var17 = this.III(var14);
         float var18 = var16.getRed() / 255.0F;
         float var19 = var16.getGreen() / 255.0F;
         float var20 = var16.getBlue() / 255.0F;
         float var21 = (float)((24.0 + var12 * 126.0) / 255.0);
         float var22 = var17.getRed() / 255.0F;
         float var23 = var17.getGreen() / 255.0F;
         float var24 = var17.getBlue() / 255.0F;
         float var25 = (float)((24.0 + var14 * 126.0) / 255.0);
         int var26 = 0;

         while (true) {
            if (var26 < Ill(-1601232749, 985045161 ^ 1711210696)) {
               label27: {
                  class_243 var27 = this.lI(var2, var10, var26);
                  class_243 var28 = this.lI(var2, var10, var26 + 1);
                  if (var7 == 0) {
                     Color var29 = this.III(1.0);
                     float var30 = var29.getRed() / 255.0F;
                     float var31 = var29.getGreen() / 255.0F;
                     float var32 = var29.getBlue() / 255.0F;
                     float var33 = 0.5882353F;
                     var6.method_22918(
                           var5,
                           (float)(var2.field_1352 - var4.field_1352),
                           (float)(var2.field_1351 - var4.field_1351),
                           (float)(var2.field_1350 - var4.field_1350)
                        )
                        .method_22915(var30, var31, var32, var33);
                     var6.method_22918(
                           var5,
                           (float)(var27.field_1352 - var4.field_1352),
                           (float)(var27.field_1351 - var4.field_1351),
                           (float)(var27.field_1350 - var4.field_1350)
                        )
                        .method_22915(var22, var23, var24, var25);
                     var6.method_22918(
                           var5,
                           (float)(var28.field_1352 - var4.field_1352),
                           (float)(var28.field_1351 - var4.field_1351),
                           (float)(var28.field_1350 - var4.field_1350)
                        )
                        .method_22915(var22, var23, var24, var25);
                     var6.method_22918(
                           var5,
                           (float)(var2.field_1352 - var4.field_1352),
                           (float)(var2.field_1351 - var4.field_1351),
                           (float)(var2.field_1350 - var4.field_1350)
                        )
                        .method_22915(var30, var31, var32, var33);
                     if (var3 == null) {
                        break label27;
                     }
                  }

                  class_243 var34 = this.lI(var2, var8, var26);
                  class_243 var35 = this.lI(var2, var8, var26 + 1);
                  var6.method_22918(
                        var5,
                        (float)(var34.field_1352 - var4.field_1352),
                        (float)(var34.field_1351 - var4.field_1351),
                        (float)(var34.field_1350 - var4.field_1350)
                     )
                     .method_22915(var18, var19, var20, var21);
                  var6.method_22918(
                        var5,
                        (float)(var27.field_1352 - var4.field_1352),
                        (float)(var27.field_1351 - var4.field_1351),
                        (float)(var27.field_1350 - var4.field_1350)
                     )
                     .method_22915(var22, var23, var24, var25);
                  var6.method_22918(
                        var5,
                        (float)(var28.field_1352 - var4.field_1352),
                        (float)(var28.field_1351 - var4.field_1351),
                        (float)(var28.field_1350 - var4.field_1350)
                     )
                     .method_22915(var22, var23, var24, var25);
                  var6.method_22918(
                        var5,
                        (float)(var34.field_1352 - var4.field_1352),
                        (float)(var34.field_1351 - var4.field_1351),
                        (float)(var34.field_1350 - var4.field_1350)
                     )
                     .method_22915(var18, var19, var20, var21);
                  var6.method_22918(
                        var5,
                        (float)(var34.field_1352 - var4.field_1352),
                        (float)(var34.field_1351 - var4.field_1351),
                        (float)(var34.field_1350 - var4.field_1350)
                     )
                     .method_22915(var18, var19, var20, var21);
                  var6.method_22918(
                        var5,
                        (float)(var28.field_1352 - var4.field_1352),
                        (float)(var28.field_1351 - var4.field_1351),
                        (float)(var28.field_1350 - var4.field_1350)
                     )
                     .method_22915(var22, var23, var24, var25);
                  var6.method_22918(
                        var5,
                        (float)(var35.field_1352 - var4.field_1352),
                        (float)(var35.field_1351 - var4.field_1351),
                        (float)(var35.field_1350 - var4.field_1350)
                     )
                     .method_22915(var18, var19, var20, var21);
                  var6.method_22918(
                        var5,
                        (float)(var34.field_1352 - var4.field_1352),
                        (float)(var34.field_1351 - var4.field_1351),
                        (float)(var34.field_1350 - var4.field_1350)
                     )
                     .method_22915(var18, var19, var20, var21);
               }

               var26++;
               if (var3 == null) {
                  continue;
               }
            }

            var7++;
            if (var3 != null) {
               return;
            }
            break;
         }
      }
   }

   public IIIII() {
      super(IlIIllIII.Ill(I[1]), lllIIlIl.IIl, IlIIllIII.Ill(I[0]));
   }

   private Color III(double var1) {
      int var5 = -2450270;
      if (var1 >= 0.5) {
         double var3 = (var1 - 0.5) * 2.0;
         return this.I(
            new Color(Ill(-1601232748, var5 ^ -1008600359), Ill(-1601232747, var5 ^ -1299070346), Ill(-1601232746, var5 ^ 46398887)),
            new Color(Ill(-1601232745, var5 ^ -579589292), Ill(-1601232744, var5 ^ -1008370470), Ill(-1601232743, var5 ^ -1895831816)),
            var3
         );
      } else {
         return this.I(
            new Color(Ill(-1601232742, var5 ^ -141432171), Ill(-1601232741, var5 ^ 1624266631), Ill(-1601232740, var5 ^ 1793461045)),
            new Color(Ill(-1601232739, var5 ^ 336792278), Ill(-1601232738, var5 ^ 1726409438), Ill(-1601232737, var5 ^ -539785572)),
            var1 * 2.0
         );
      }
   }

   @Override
   public void IlI(lIIlIl var1) {
      if (this.IIIIlIl() && IlIII.IIIIII(var1)) {
         class_310 var2 = class_310.method_1551();
         if (var2 != null && var2.field_1687 != null && var2.field_1724 != null) {
            float var3 = IIll.IlIIlI(var2);

            for (class_1657 var5 : var2.field_1687.method_18456()) {
               if (var5 != null && var5.method_5805() && !var5.method_31481() && !var5.method_7325() && var5 != var2.field_1724) {
                  class_243 var6 = IlIII.IIll(var5, var3);
                  class_243 var7 = this.l(var2, var5, var6);
                  if (var7 != null) {
                     this.ll(var1, var7);
                  }
               }
            }
         }
      }
   }

   private static String IIl(char[] var0, long var1, int var3) {
      int var4 = Ill(-1601232736, -56311850 ^ -1859062200) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & Ill(-1601232735, -56311850 ^ -1364809712);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
