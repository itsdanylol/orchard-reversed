package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IIlllIlII extends IlIIIIIIl {
   private static final Object[] III;
   private static final String[] ll;
   private static final String[] I;
   private static final String[] II;
   private static final int[] lI;
   private static String[] Il;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -532600392;
      int var17 = 0;
      int var16 = 0;
      int var10001 = "Q鞜律蓊媼ݓ爛⩍苤ቚ⠽蒚\uf543蔄汚旣\ued28稂酿\uf2a1狣\uf584\uee85蹑ഃ粃譐﹑稐뙿憼≸㱺⧃卜鎞\uf657숟\u0dfa\ua9dc\ud8c6뫈㍆쵟⇾ĩ멷웁ࠐ浠๐\u0a84ᗾﺽ䧦魊꾵殮ꞟ曧௱韌銝\ue54d㒊힕\ue1a3\u09e4휗ꂾԜ굓ꫳﲬ䡳뎍ꪸ῾\u18fa\ude7d듀ɗ"
         .length();
      String[] var15 = new String[1];
      int var14 = var10001;
      String var13 = "Q鞜律蓊媼ݓ爛⩍苤ቚ⠽蒚\uf543蔄汚旣\ued28稂酿\uf2a1狣\uf584\uee85蹑ഃ粃譐﹑稐뙿憼≸㱺⧃卜鎞\uf657숟\u0dfa\ua9dc\ud8c6뫈㍆쵟⇾ĩ멷웁ࠐ浠๐\u0a84ᗾﺽ䧦魊꾵殮ꞟ曧௱韌銝\ue54d㒊힕\ue1a3\u09e4휗ꂾԜ굓ꫳﲬ䡳뎍ꪸ῾\u18fa\ude7d듀ɗ";
      short var18 = 31489;

      do {
         char var19 = var13.charAt(var17);
         String var10000 = var13.substring(var17 + 1, var17 + 1 + var19);
         int var21 = 0;
         char[] var20 = var10000.toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 130;
               case 1 -> 83;
               case 2 -> 66;
               case 3 -> 75;
               case 4 -> 24;
               case 5 -> 138;
               case 6 -> 198;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      ll = var15;
      III = new Object[var15.length];
      int var9 = -549501290;
      byte[] var7 = " Vý[\u001b#\u0002\u0090\u0099nÈ´A_DE\u0018?Ü|\u0013\u001f¢\u0001^-ÄU[ËÃÖ©è1\"XX'\u0004öiÏ\u001e|\u008e\u0093\r\u0085ê¥-Ï1®\u008d\u009a]\u0001õrVë\u000b§Å^ð\u008e¬lØ+Ô\u001e\u0007 \u0014:\u008c¦ÌþÝ\u008c:\u001aO}Ä½^ÃêÄ¸\u0098Æù²tÎBm¼\u001e))ªT:I\b¿\u0093ê+Ïõîà¼±EÄ»:jn+6[\u0082Á~Í_\u009fÎÓ\u0085\u0095U_\u0018e\u0093w=<W\u0090%9\u009b\u0002\b/\u0095Ä\u000eÁ\t@«\u0089u|«ä\nßüíë \u009e<%\u00812&U<§g\u0018\u0098\\\u0081Uí©/>¸\u0089>,*VTWW¿Ç\u0097nvÿçÕ\u0080©z\u007f1E-©\u0010Êæb\u0018\u000eB2ö\r|\u008a/-\f.'w~\u0004Þ3áÆ\u0095Ø\u000f®´ÞM~¸w«+fUcð\u001dD\u0097ÅTE¹V$5r\u001cê·y?¶ä\u009fiM@ F·\u0096\u0096ÌÈúÄY¯q\\m£Ö'?qüá²\u008f¨\u0080æ\u0013IE,\u0019\u009b\u0080¬Ô9Ü\u0099¸dS(x\u0099Ô¢é\u0085\u0097\u009c\u0001î9\u0014\u0084\u00ad\u0088Z.\u0095SÝYlXË5\u0088½(\u008cÓ}!Ò«õ,\u0088°~F\u0080lëùþÜÆ-\u0095K¥\u0007\u0001\u0099\u0004p\u0095þ²ÿÚ¹Z\u0006*Îm$/·¡´¹Ý\n\u0006\u0082'-\u0004\u0099ÀQ|÷À o\u0000.f\u0085ÓýWÉ\u001b¸\u008f»\u0015\u008eküp1\u009d\u000fu\u0012¬\u0001>\u0080.ã×ø:2\u0084ª´¯MJÏ\u007fyeê-\u0085-¼j1x\u001eS\u0099éG|¾¡VÙ£\u008fóùn`*>hT}r\u009d4ÏG\u000b3\b-Zy¶\b'\u0098¥\tô³\u001b½\u001f7Ó±ùÉßó\u0011\u0086½à:MTkÐr0\u008fz±\u001fD\t\u0090\u009b¤Ä¹\u0099s£×\u0080TÇ}\u0003u\u009bö2µ\u0099Ó~\u0097@+\u001b:\u0091\u0007^Qü'p\u009dx\u0084zS½\u0012H¾+`<\u007f1zð\u0016ÕP\u009eCP\u009cY<v¸ôÑéR\u0091O\u0014¾uî-øs\u0084\u008aÈR$¯ª\u0014Él¶O¹\u0099\u0097Ñ8?Ô\u0018\n{\n^/[\u0098b\u0005¿ð\u00975\\\u001cJD\u009b\u000f\u0001vÉF9\u0099íW\u0094o\u001d\u001f>v\u008bÃ\\5¬\u0094¿}ÀyôÚZ&ö\rò`oh6DÎ9\u0081«kºH\u0093û{£\\\u00855É2(u\u0000Ó\u0014»DÁÎ\u0085o,eH÷3O¦û¾âv}jmóÊ·¸\u0086åQW©Õ;\u009a\u0001\t.²ZDÔÝ\tX\u0019\u0003¤ZÀ\u0005ØEÌ\u009e¡ÀVÆÑ»aÏÍ=\u0091(¢ò?$MO¡fx\f:S}bÊ\u009d\rI@\u0099Ç\u0012h\u0092Î¸À¦C¤ÚWû\u0080ÐpÅ\u0080(µø<\u0082È7\u001a\u001a\u0002Äô\u000f\u0007Æ{\u0001\u00833Æ ²\u0005í,õ(\u0087§d\u001cå}¿«ßnÓPàø\u0004\u0003¸\u0006#\u001bå\u008föè\u0098ÄÅìØvtÝ\u0010¢\u001f\u0013Î;\u0087«\u0006\u0089Ó\u001e54\f\u0082É\u008dx%Tä\u008dì*\u0003\u0002CÁ\u00ad\u0081Sáÿwÿ\u0015\u0095ù7âë\b\u009et\u000bçkÓÒÝ\u0010ps\u0083ê\u0094\u0080\u0014ëí\u0089\u000e\u0018Ä\u0003e¡d¤\u0088Y\u009d\u000e\u0098Q\u008f\n?R®0m£|\u009c\u0005\u0015þC\u0015´á\u009frÍ\u009fjßÑ¯fÄ»ta\u001d\u009f\u0083<\u000eyeÅú\u0010Ð\u008e\u009e\u000bk9,ò\u001bì5·Ô¼0\u0006Ó\u008b8$\u008c\t¦.TÜ!úÍJUW\u0014F\u0006÷ßZ73b1\u000b\u001cX ·¥Ø¼\u008d<\u0014¹4\u001c*¹é\u0090rìþMSr\u0001ë\\¦¬«'@ª·öö\u0017¨\u009c\nT¡ÞËr½ô6ÖK>\u0006É\u000e=9zE¶\"#0\u008c¾¢ñÏiJgK{\u0010´hêã\u0085\\è\u0014\u008e"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = ll(-1919737927, var23 ^ -316532963)).length();
      int var1 = lI(-889328556, var23 ^ 1440044461);
      int var0 = -1;

      while (true) {
         char[] var10002;
         label85: {
            int var28 = lI(-889328555, var23 ^ -291460449);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var35 = var28;
            var10002 = var10003;
            var10001 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var28;
               var10006 = var6;
            } else {
               var35 = var28;
               var10001 = var10004;
               if (var10004 <= var6) {
                  break label85;
               }

               var10005 = var10003;
               var10004 = var28;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % lI(-889328554, var23 ^ 1827496015)) {
                  case 0 -> lI(-889328553, var23 ^ -1260590057);
                  case 1 -> 1;
                  case 2 -> lI(-889328560, var23 ^ -306416604);
                  case 3 -> lI(-889328559, var23 ^ -425981405);
                  case 4 -> lI(-889328558, var23 ^ -1414632274);
                  case 5 -> lI(-889328557, var23 ^ -1370985530);
                  default -> lI(-889328548, var23 ^ 1550555448);
               });
               var6++;
               if (var35 == 0) {
                  var10006 = var35;
                  var10005 = var10002;
                  var10004 = var35;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var35;
                  var10006 = var6;
               }
            }
         }

         String var37 = new String(var10002).intern();
         byte var32 = -1;
         var5[var3++] = var37;
         if ((var0 += var1) >= var4) {
            I = var5;
            II = new String[2];
            Il = new String[2];
            II();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   public static boolean I() {
      IIIIIllII var0 = IIIIIllII.III();
      return var0 != null && var0.II() != null ? var0.II().IIllIII() != null && var0.II().IIllIII().IIIIlIl() : false;
   }

   private static String l(char[] var0, long var1, int var3) {
      int var4 = lI(-889328547, -850486297 ^ 1629023998) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lI(-889328546, -850486297 ^ 786814346);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static String ll(int var0, int var1) {
      int var3 = var0 ^ -1919737927;
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])III[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         III[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -785615845;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 47;
            case 1 -> 80;
            case 2 -> 254;
            case 3 -> 101;
            case 4 -> 215;
            case 5 -> 174;
            case 6 -> 219;
            case 7 -> 169;
            case 8 -> 118;
            case 9 -> 80;
            case 10 -> 71;
            case 11 -> 73;
            case 12 -> 37;
            case 13 -> 244;
            case 14 -> 53;
            case 15 -> 204;
            case 16 -> 58;
            case 17 -> 103;
            case 18 -> 36;
            case 19 -> 241;
            case 20 -> 114;
            case 21 -> 32;
            case 22 -> 164;
            case 23 -> 62;
            case 24 -> 250;
            case 25 -> 13;
            case 26 -> 103;
            case 27 -> 63;
            case 28 -> 63;
            case 29 -> 225;
            case 30 -> 102;
            case 31 -> 95;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public IIlllIlII() {
      super(IlIIllIII.Ill(Il[1]), lllIIlIl.IIl, IlIIllIII.Ill(Il[0]));
   }

   private static void II() {
      int var0 = 1190613355;
      Il[0] = l(Il(lI(-889328545, var0 ^ -800798896), lI(-889328552, var0 ^ 689996724)).toCharArray(), 98253L, lI(-889328551, var0 ^ 1507173382));
      Il[1] = l(Il(lI(-889328550, var0 ^ 915887532), lI(-889328549, var0 ^ -560153781)).toCharArray(), 53976L, lI(-889328572, var0 ^ -1780394724));
   }

   private static int lI(int var0, int var1) {
      int var2 = lI[var0 ^ -889328556] ^ var1 ^ var0;
      var2 -= 19418;
      var2 -= 10192;
      var2 += 14010;
      var2 += 18263;
      var2 -= 56876;
      var2 += 57769;
      var2 ^= 39162;
      return var2 ^ 41370;
   }

   private static String Il(int var0, int var1) {
      int var9 = -886263452;
      int var2 = (var0 ^ lI(-889328571, var9 ^ -1346512751)) & lI(-889328570, var9 ^ -180699896);
      if (II[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & lI(-889328569, var9 ^ -17167742)) {
            case 0 -> lI(-889328576, var9 ^ 2015546959);
            case 1 -> lI(-889328575, var9 ^ 1389636275);
            case 2 -> lI(-889328574, var9 ^ -1557493022);
            case 3 -> lI(-889328573, var9 ^ 486863973);
            case 4 -> lI(-889328564, var9 ^ 1177078092);
            case 5 -> lI(-889328563, var9 ^ -1440713992);
            case 6 -> lI(-889328562, var9 ^ 1659902244);
            case 7 -> lI(-889328561, var9 ^ 1958349496);
            case 8 -> lI(-889328568, var9 ^ -699292583);
            case 9 -> lI(-889328567, var9 ^ -182336092);
            case 10 -> 5;
            case 11 -> lI(-889328566, var9 ^ 1045594521);
            case 12 -> lI(-889328565, var9 ^ 441780968);
            case 13 -> lI(-889328524, var9 ^ -1329264925);
            case 14 -> lI(-889328523, var9 ^ 1546604143);
            case 15 -> lI(-889328522, var9 ^ -2123235647);
            case 16 -> lI(-889328521, var9 ^ 1534813486);
            case 17 -> lI(-889328528, var9 ^ -963927263);
            case 18 -> lI(-889328527, var9 ^ -472752123);
            case 19 -> lI(-889328526, var9 ^ -69751939);
            case 20 -> lI(-889328525, var9 ^ -691952144);
            case 21 -> lI(-889328516, var9 ^ -802211503);
            case 22 -> lI(-889328515, var9 ^ 1969702351);
            case 23 -> lI(-889328514, var9 ^ 1963604671);
            case 24 -> lI(-889328513, var9 ^ 570678142);
            case 25 -> lI(-889328520, var9 ^ 1087509009);
            case 26 -> lI(-889328519, var9 ^ -322411256);
            case 27 -> lI(-889328518, var9 ^ 2039033604);
            case 28 -> lI(-889328517, var9 ^ -2106629516);
            case 29 -> lI(-889328540, var9 ^ 2009139503);
            case 30 -> lI(-889328539, var9 ^ 1473256609);
            case 31 -> lI(-889328538, var9 ^ -2001049769);
            case 32 -> lI(-889328537, var9 ^ 1630119732);
            case 33 -> lI(-889328544, var9 ^ -1475225659);
            case 34 -> lI(-889328543, var9 ^ 1581730375);
            case 35 -> lI(-889328542, var9 ^ -273998364);
            case 36 -> lI(-889328541, var9 ^ -836447747);
            case 37 -> lI(-889328532, var9 ^ -958369225);
            case 38 -> lI(-889328531, var9 ^ 685984801);
            case 39 -> lI(-889328530, var9 ^ -238863292);
            case 40 -> lI(-889328529, var9 ^ -107393515);
            case 41 -> lI(-889328536, var9 ^ 14537080);
            case 42 -> lI(-889328535, var9 ^ 1261844518);
            case 43 -> lI(-889328534, var9 ^ 1781562846);
            case 44 -> lI(-889328533, var9 ^ 1721342895);
            case 45 -> lI(-889328620, var9 ^ -1195682798);
            case 46 -> lI(-889328619, var9 ^ -1012226201);
            case 47 -> lI(-889328618, var9 ^ -1968469632);
            case 48 -> lI(-889328617, var9 ^ -86293959);
            case 49 -> lI(-889328624, var9 ^ 878266737);
            case 50 -> lI(-889328623, var9 ^ 1745530694);
            case 51 -> lI(-889328622, var9 ^ -1817309105);
            case 52 -> lI(-889328621, var9 ^ 1769513270);
            case 53 -> lI(-889328612, var9 ^ 370471943);
            case 54 -> lI(-889328611, var9 ^ 1906273450);
            case 55 -> lI(-889328610, var9 ^ 2100827922);
            case 56 -> lI(-889328609, var9 ^ -1357721322);
            case 57 -> lI(-889328616, var9 ^ 1363587199);
            case 58 -> lI(-889328615, var9 ^ -844663451);
            case 59 -> lI(-889328614, var9 ^ -948588364);
            case 60 -> lI(-889328613, var9 ^ 181922870);
            case 61 -> lI(-889328636, var9 ^ 1720345500);
            case 62 -> lI(-889328635, var9 ^ -1502092461);
            case 63 -> lI(-889328634, var9 ^ 929802102);
            case 64 -> lI(-889328633, var9 ^ -553645806);
            case 65 -> lI(-889328640, var9 ^ 1514387664);
            case 66 -> lI(-889328639, var9 ^ -260349067);
            case 67 -> lI(-889328638, var9 ^ -2021494978);
            case 68 -> lI(-889328637, var9 ^ -345601344);
            case 69 -> lI(-889328628, var9 ^ 1379749372);
            case 70 -> lI(-889328627, var9 ^ 205899073);
            case 71 -> lI(-889328626, var9 ^ 1449020988);
            case 72 -> lI(-889328625, var9 ^ 1585634260);
            case 73 -> lI(-889328632, var9 ^ 540209606);
            case 74 -> lI(-889328631, var9 ^ 1269142809);
            case 75 -> lI(-889328630, var9 ^ -545835942);
            case 76 -> lI(-889328629, var9 ^ 1259373280);
            case 77 -> lI(-889328588, var9 ^ 72837885);
            case 78 -> lI(-889328587, var9 ^ -199205551);
            case 79 -> lI(-889328586, var9 ^ -245788410);
            case 80 -> lI(-889328585, var9 ^ 1731410581);
            case 81 -> lI(-889328592, var9 ^ 1556684081);
            case 82 -> lI(-889328591, var9 ^ 1194222031);
            case 83 -> lI(-889328590, var9 ^ 690917629);
            case 84 -> lI(-889328589, var9 ^ -557820288);
            case 85 -> lI(-889328580, var9 ^ 219375609);
            case 86 -> lI(-889328579, var9 ^ -984170573);
            case 87 -> lI(-889328578, var9 ^ -882877466);
            case 88 -> lI(-889328577, var9 ^ -1361072823);
            case 89 -> lI(-889328584, var9 ^ -1409508184);
            case 90 -> lI(-889328583, var9 ^ -529654174);
            case 91 -> lI(-889328582, var9 ^ 152439500);
            case 92 -> lI(-889328581, var9 ^ 1514439694);
            case 93 -> lI(-889328604, var9 ^ -1817903213);
            case 94 -> lI(-889328603, var9 ^ -1484006707);
            case 95 -> lI(-889328602, var9 ^ 1539542018);
            case 96 -> lI(-889328601, var9 ^ -275370457);
            case 97 -> lI(-889328608, var9 ^ 1191671803);
            case 98 -> lI(-889328607, var9 ^ 1615816335);
            case 99 -> lI(-889328606, var9 ^ 2103558991);
            case 100 -> lI(-889328605, var9 ^ -1332864336);
            case 101 -> lI(-889328596, var9 ^ -1229304509);
            case 102 -> lI(-889328595, var9 ^ 1138425803);
            case 103 -> lI(-889328594, var9 ^ -706922310);
            case 104 -> lI(-889328593, var9 ^ -2070444383);
            case 105 -> lI(-889328600, var9 ^ -109668999);
            case 106 -> lI(-889328599, var9 ^ 710749121);
            case 107 -> lI(-889328598, var9 ^ -1042685098);
            case 108 -> 0;
            case 109 -> lI(-889328597, var9 ^ 656928652);
            case 110 -> lI(-889328428, var9 ^ -815231685);
            case 111 -> lI(-889328427, var9 ^ -459054042);
            case 112 -> lI(-889328426, var9 ^ 245104700);
            case 113 -> lI(-889328425, var9 ^ -1537265777);
            case 114 -> lI(-889328432, var9 ^ -679564148);
            case 115 -> lI(-889328431, var9 ^ 441952750);
            case 116 -> lI(-889328430, var9 ^ 2100932791);
            case 117 -> lI(-889328429, var9 ^ 429077475);
            case 118 -> lI(-889328420, var9 ^ 1159201369);
            case 119 -> lI(-889328419, var9 ^ 1195200255);
            case 120 -> lI(-889328418, var9 ^ -1631245415);
            case 121 -> lI(-889328417, var9 ^ 1340698133);
            case 122 -> lI(-889328424, var9 ^ 583614613);
            case 123 -> lI(-889328423, var9 ^ -1502983533);
            case 124 -> lI(-889328422, var9 ^ 1677490188);
            case 125 -> lI(-889328421, var9 ^ -175240050);
            case 126 -> lI(-889328444, var9 ^ -275463993);
            case 127 -> lI(-889328443, var9 ^ 197045923);
            case 128 -> 3;
            case 129 -> lI(-889328442, var9 ^ -1905104400);
            case 130 -> lI(-889328441, var9 ^ -1470708740);
            case 131 -> lI(-889328448, var9 ^ 935108942);
            case 132 -> lI(-889328447, var9 ^ -900709680);
            case 133 -> lI(-889328446, var9 ^ -216644778);
            case 134 -> lI(-889328445, var9 ^ 1411801698);
            case 135 -> lI(-889328436, var9 ^ 1900291129);
            case 136 -> lI(-889328435, var9 ^ -1302823091);
            case 137 -> lI(-889328434, var9 ^ 1199171094);
            case 138 -> lI(-889328433, var9 ^ -516282241);
            case 139 -> lI(-889328440, var9 ^ -1511756100);
            case 140 -> lI(-889328439, var9 ^ -2055843192);
            case 141 -> lI(-889328438, var9 ^ 1629398826);
            case 142 -> lI(-889328437, var9 ^ -2098038237);
            case 143 -> lI(-889328396, var9 ^ 1172386090);
            case 144 -> lI(-889328395, var9 ^ 396889758);
            case 145 -> lI(-889328394, var9 ^ 867804311);
            case 146 -> lI(-889328393, var9 ^ -1007612179);
            case 147 -> lI(-889328400, var9 ^ 1429040366);
            case 148 -> lI(-889328399, var9 ^ 1920634759);
            case 149 -> lI(-889328398, var9 ^ 513262836);
            case 150 -> lI(-889328397, var9 ^ -2067216863);
            case 151 -> lI(-889328388, var9 ^ 747528120);
            case 152 -> lI(-889328387, var9 ^ -391447037);
            case 153 -> 4;
            case 154 -> lI(-889328386, var9 ^ 1598380814);
            case 155 -> lI(-889328385, var9 ^ -1770140773);
            case 156 -> lI(-889328392, var9 ^ 2108863990);
            case 157 -> lI(-889328391, var9 ^ 400301937);
            case 158 -> lI(-889328390, var9 ^ -566418205);
            case 159 -> lI(-889328389, var9 ^ -1708130763);
            case 160 -> lI(-889328412, var9 ^ -1312664140);
            case 161 -> lI(-889328411, var9 ^ 702381953);
            case 162 -> lI(-889328410, var9 ^ 626053862);
            case 163 -> lI(-889328409, var9 ^ -1551606389);
            case 164 -> lI(-889328416, var9 ^ 341412053);
            case 165 -> lI(-889328415, var9 ^ 1002397869);
            case 166 -> lI(-889328414, var9 ^ 198552267);
            case 167 -> lI(-889328413, var9 ^ -675249558);
            case 168 -> lI(-889328404, var9 ^ -1707415020);
            case 169 -> lI(-889328403, var9 ^ -2030619665);
            case 170 -> lI(-889328402, var9 ^ -2077346328);
            case 171 -> lI(-889328401, var9 ^ -1692225926);
            case 172 -> lI(-889328408, var9 ^ 515438150);
            case 173 -> lI(-889328407, var9 ^ 1703935751);
            case 174 -> lI(-889328406, var9 ^ -478210009);
            case 175 -> lI(-889328405, var9 ^ 751899828);
            case 176 -> lI(-889328492, var9 ^ -1857071490);
            case 177 -> lI(-889328491, var9 ^ -757832883);
            case 178 -> lI(-889328490, var9 ^ -1138446863);
            case 179 -> lI(-889328489, var9 ^ -1750159702);
            case 180 -> lI(-889328496, var9 ^ -863591842);
            case 181 -> lI(-889328495, var9 ^ 1714329157);
            case 182 -> lI(-889328494, var9 ^ 2050252956);
            case 183 -> lI(-889328493, var9 ^ 1581137950);
            case 184 -> lI(-889328484, var9 ^ 1590068537);
            case 185 -> lI(-889328483, var9 ^ -496175103);
            case 186 -> lI(-889328482, var9 ^ -990629177);
            case 187 -> lI(-889328481, var9 ^ 719402854);
            case 188 -> lI(-889328488, var9 ^ -1511017581);
            case 189 -> lI(-889328487, var9 ^ 407798438);
            case 190 -> lI(-889328486, var9 ^ 868402465);
            case 191 -> lI(-889328485, var9 ^ 1497978075);
            case 192 -> lI(-889328508, var9 ^ 999526312);
            case 193 -> lI(-889328507, var9 ^ 25224012);
            case 194 -> lI(-889328506, var9 ^ 1041642357);
            case 195 -> lI(-889328505, var9 ^ 1726485279);
            case 196 -> lI(-889328512, var9 ^ 996263651);
            case 197 -> lI(-889328511, var9 ^ 1177220580);
            case 198 -> lI(-889328510, var9 ^ 110642262);
            case 199 -> lI(-889328509, var9 ^ -833867865);
            case 200 -> lI(-889328500, var9 ^ 282441617);
            case 201 -> lI(-889328499, var9 ^ -664280293);
            case 202 -> lI(-889328498, var9 ^ -338019221);
            case 203 -> lI(-889328497, var9 ^ 392382665);
            case 204 -> 1;
            case 205 -> lI(-889328504, var9 ^ -1979007542);
            case 206 -> lI(-889328503, var9 ^ -185781555);
            case 207 -> lI(-889328502, var9 ^ 524530174);
            case 208 -> lI(-889328501, var9 ^ 1058097096);
            case 209 -> lI(-889328460, var9 ^ -881079954);
            case 210 -> lI(-889328459, var9 ^ 1006975011);
            case 211 -> lI(-889328458, var9 ^ -1427777588);
            case 212 -> lI(-889328457, var9 ^ 222096662);
            case 213 -> lI(-889328464, var9 ^ -1365396607);
            case 214 -> lI(-889328463, var9 ^ 1248732275);
            case 215 -> lI(-889328462, var9 ^ 862404228);
            case 216 -> lI(-889328461, var9 ^ 451760885);
            case 217 -> lI(-889328452, var9 ^ -1169508303);
            case 218 -> lI(-889328451, var9 ^ 1138796674);
            case 219 -> lI(-889328450, var9 ^ 1373900799);
            case 220 -> lI(-889328449, var9 ^ 1893621097);
            case 221 -> lI(-889328456, var9 ^ -1569573571);
            case 222 -> lI(-889328455, var9 ^ 548218310);
            case 223 -> lI(-889328454, var9 ^ 1064387272);
            case 224 -> lI(-889328453, var9 ^ 1099231155);
            case 225 -> lI(-889328476, var9 ^ 1904800988);
            case 226 -> 2;
            case 227 -> lI(-889328475, var9 ^ -1433457376);
            case 228 -> lI(-889328474, var9 ^ 1574059710);
            case 229 -> lI(-889328473, var9 ^ -1154757939);
            case 230 -> lI(-889328480, var9 ^ 241215826);
            case 231 -> lI(-889328479, var9 ^ -1244193758);
            case 232 -> lI(-889328478, var9 ^ -989723273);
            case 233 -> lI(-889328477, var9 ^ 173146291);
            case 234 -> lI(-889328468, var9 ^ 224725202);
            case 235 -> lI(-889328467, var9 ^ 1390909179);
            case 236 -> lI(-889328466, var9 ^ -1976430136);
            case 237 -> lI(-889328465, var9 ^ 329541031);
            case 238 -> lI(-889328472, var9 ^ -894945778);
            case 239 -> lI(-889328471, var9 ^ 28575701);
            case 240 -> lI(-889328470, var9 ^ -1126221031);
            case 241 -> lI(-889328469, var9 ^ -2033285212);
            case 242 -> lI(-889328300, var9 ^ 106085608);
            case 243 -> lI(-889328299, var9 ^ -900266532);
            case 244 -> lI(-889328298, var9 ^ -195569478);
            case 245 -> lI(-889328297, var9 ^ -1409102008);
            case 246 -> lI(-889328304, var9 ^ -1919143686);
            case 247 -> lI(-889328303, var9 ^ -2109170343);
            case 248 -> lI(-889328302, var9 ^ -105997512);
            case 249 -> lI(-889328301, var9 ^ 672671421);
            case 250 -> lI(-889328292, var9 ^ 1122264454);
            case 251 -> lI(-889328291, var9 ^ 2442166);
            case 252 -> lI(-889328290, var9 ^ 718858110);
            case 253 -> lI(-889328289, var9 ^ -521603048);
            case 254 -> lI(-889328296, var9 ^ -472429750);
            default -> lI(-889328295, var9 ^ 1758204484);
         };
         int var5 = (var1 & lI(-889328294, var9 ^ 1381012450)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lI(-889328293, var9 ^ 294119541)) >>> lI(-889328316, var9 ^ -1785388666)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lI(-889328315, var9 ^ -1241197943);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lI(-889328314, var9 ^ -2113526399);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }
}
