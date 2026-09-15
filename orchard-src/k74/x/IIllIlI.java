package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IIllIlI extends IllllI {
   private static final String[] II;
   private static final int[] lllI;
   private static String[] Il;
   private static final String[] IIIII;
   private static final Object[] IIIIl;
   private static final String[] lI;

   public IIllIlI() {
      super(IlIIllIII.Ill(Il[0]), IlIIllIII.Ill(Il[1]), IllIIIll.lI, false);
   }

   private static String I(char[] var0, long var1, int var3) {
      int var4 = lIIIl(843342872, -2130623943 ^ -850023459) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIIIl(843342873, -2130623943 ^ -100286643);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private static void l() {
      int var0 = -782949319;
      Il[0] = I(II(lIIIl(843342874, var0 ^ -32728692), lIIIl(843342875, var0 ^ -1637814011)).toCharArray(), 71706L, lIIIl(843342876, var0 ^ 414198596));
      Il[1] = I(II(lIIIl(843342877, var0 ^ 1774688845), lIIIl(843342878, var0 ^ -1377089914)).toCharArray(), 53670L, lIIIl(843342879, var0 ^ -262384381));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 888694942;
      String[] var9 = new String[1];
      short var12 = 23859;
      int var10001 = "I椝偁䐳\ueebb钚ᥳ涕◣穒\ue4dc覲ଆ䋔빂畨ﻞ㔑ꐱ꼀\uef97띉\udcf3\uf69a䋏␜빼灁鶘퓶\uec62\uf8ed\ueafbꞪ惃ᬛ\u31ef뱪慻坜ꢯ\ue902ⶔ僬\uf84dㄼ⺬渧⎣㟔줄약逃쇢踶ｅ渕⠦\u12bf辞䨪پ峠晘\ud9b3䆘玸쟜⊏裉\ud882瑩拘仩"
         .length();
      int var11 = 0;
      int var8 = var10001;
      String var7 = "I椝偁䐳\ueebb钚ᥳ涕◣穒\ue4dc覲ଆ䋔빂畨ﻞ㔑ꐱ꼀\uef97띉\udcf3\uf69a䋏␜빼灁鶘퓶\uec62\uf8ed\ueafbꞪ惃ᬛ\u31ef뱪慻坜ꢯ\ue902ⶔ僬\uf84dㄼ⺬渧⎣㟔줄약逃쇢踶ｅ渕⠦\u12bf辞䨪پ峠晘\ud9b3䆘玸쟜⊏裉\ud882瑩拘仩";
      int var10 = 0;

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << '\r') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> '\r') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIIII = var9;
      IIIIl = new Object[var9.length];
      int var10000 = 0;
      int var20 = 0;
      lllI = new int[276];
      byte[] var10002 = "Ô+Zò\u009aí[\u008dÎ±¥\u008b®ÞþûöôEÄYz¦N\u009dV\fBZñm¬\u009aÍxß\u0089¿âçë¬Æ\u00175{±\b`4\u0086êAj\u0087¡\u0082y^}co\u0098Ò6i5\u007f\u008eCR@\u009c\t7Fâ\u001f\u001dN&ð£eêÔ½t¼\u0084µ¸!\u008dÂTpÛ<\u0099¦.ÁâK\u0007\u0089óE½Ê\u0013\rÃý}5Ø\u0088î-ÇýÂ~\u0093\u008dé*Ò¾åü-ªÙ80û{\u0092³Õ»\u0087;únû-Ö?RÛgS©}\\\u000fNãñý\u0011~´áø«æap¥Æ\u0083\u0093ºÞ¸bÿî?Õ6KN93\"7c2§\u0082\u0014\"\u0000>\u009c@\u001e¯iË\u0017\u001e¥v\u0014©¹Ê\u0088ÿ'\u009f`Í¢Ço¸;\u0080¸\u0093l±ÀÖ>JÌÇ\u008d©SÊ¶x[µ\u007fÅ«äöb\u0007o3^Õ\u001a(Ï\u009co D7Y¸Æ5ß-^¯ÇÀ|§'ÝÍµ¾>XÚ¢\u0003ºàòE¤\u001f s`?57\u0002\u001d\u0090\u009cH\rì=¿?ÓÌË·Ñ6H\tG)\u009d¹\u0083\u0088:\u0006Ûa\u0012áÚqN\u00adÙ\rN%¾\u0093Q\u0097¾ô¹\u0003åê=0Vº\u001dªS\u0015¸\u0019Ä$')\u008c\u0094@\u001dë\u0015\u0015À^\u0085âgYCO¥v+\u0086slÛB\u000fäÇý\u0084TÖ\u0007V\u0088\u00808\u001dzf\u0083F\fk\r`\ni\u0087(B!}¥w¡¯\u000b\n\u00149GXhÙh¢\u0081WNQ\u008d³ M\u0086I\u001fð+µ\u0015\u0080\u009d,º-\u0099\b³¨ìúôz~/ÄÔ¦ç\u0091¼À³\u0085\u0018ó\u009a}wªË?ánYÏµP\nBuâ#BÀrT\u008cqV\u0088r\u009aÙ\n\u0094ÄõHSÐDaÉv\u0085v\u0083øzÑ%\u009b9&©ìÓôÅ\u0007\u009cüBÃ?\u008d/´\u007fGÝ\u0095\u0098Å\u0085éÍ¼ë\bðaÙÌ\u0007°q\u001c\u0017ebe!Þ-R\u0088öý\u0084s±J ÊaØZÇ\u0096\u001f\u0016\rBYß\u000fôâêZ\u0092}:\u0012\u009e!\u008aÌÉ¡\u0087×¹WñQïj~M\u001eu/*©\u001ae%;\u008b\u0003olùºbn\u001e\u008bÊ\u0099òg÷Ñ¡\t.Eæ\u0015kB/W+Á`\u001dð\u0005*9\f¾_\u0016çGúû\u0090âc-ß¥\u0094\u0004²\u0019Â<Æ\u00968\u009b\u0012ðÉ\u0086÷M\u001b\u009e©ãúTe°¦7)!ÐÛ\u0090¶ýâ&§3ã.hJ½ú\fÂ\\\u009a¢lF¹Ë\u0098\\êí'¦\n@C«Û\u0095N\u001b\rÖ$û%\u0006à\u0012qVñ\u0095\u0001¯LØ&\u0084µÁ\u0007.Ï{9\u0011¹\u009eÚ \u0097\u00189\u00846)\u0089¨&\u0014ó\u0018`\u0084üØ\bU\u0098®ûC²Â}JNQ\u00147ºr\nü\u0087Õyt\u008dØ=Ï0\u0083Èc±@±wMß\u00ad${\u0015l/¬UÉ2\u001a\u0018\u0011²ãV#3y¿oP\r³ËFÅ`jhp\u0087í3m\u0010xÖpvølAb8\u001a©¢(øã?»Æ\u0015G\b3ÝÃ\u001b.vf«[\u008e\u00971_\u0081\u0018u\u009f\u009au\u009axm\u009b\u000f\u0090ò\u0083\u001a\u0089\u0006\u001f¸]ð\u0002Ç\u009b\u0080 :Øîß\u000e°¨~úªH\u0092Ûr¾¸Å[\u001cÈ^\u0014\"Ð@\u00adw]\u0095.çß\tæÍ2\b\fècËoz_\u001a\u001dõSÇ³tä\u0018µy%\r-\t\u001e¸ÖdG\u0011'\u0095\u0001)S\u0092Y\u0012ANAítV\u0080\u0018\u009a>±^ÄO<\u008c\u0087\u0083´D\u0096>:\n\u0018[´\rª\u009f³Uú\u000fî\u0016%A\u0010Ñ\u0082µ\u0086²@\u001dj\u0089\u000f\u0088z/}ú\u0006]ä\u0088®â\u0006Ñi\u0095cÞ\u0099$\u001e¸ô\u0089W¶\u0000Î«FÔ4lV\u008b\u0005(f\\\u0013î\u0015ÚöÔ«Nð<=y<þ\nø´öjÌ¦¨Øs\bSøóiD\u008càp°m§~6À c\r"
         .getBytes("ISO-8859-1");

      int var42;
      do {
         lllI[var10000] = ((var10002[var20] & 255) << 24 | (var10002[var20 + 1] & 255) << 16 | (var10002[var20 + 2] & 255) << 8 | var10002[var20 + 3] & 255)
            ^ -743505491;
         var10000 += 1;
         var42 = var20 + 4;
         var20 += 4;
      } while (var42 < var10002.length);

      String[] var5 = new String[2];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIIll((char)'Ꞔ', 1167573728, -1766321683, (short)-1534, 557629949, 31248)).length();
      int var1 = lIIIl(843343122, var17 ^ -1060470691);
      int var0 = -1;

      while (true) {
         label78: {
            var10000 = lIIIl(843343123, var17 ^ 2120123948);
            char[] var43 = var2.substring(++var0, var0 + var1).toCharArray();
            int var53 = var43.length;
            int var6 = 0;
            var42 = var10000;
            var32 = var43;
            var20 = var53;
            char[] var62;
            int var69;
            if (var53 <= 1) {
               var62 = var43;
               var53 = var10000;
               var69 = var6;
            } else {
               var42 = var10000;
               var20 = var53;
               if (var53 <= var6) {
                  break label78;
               }

               var62 = var43;
               var53 = var10000;
               var69 = var6;
            }

            while (true) {
               var62[var69] = (char)(var62[var69] ^ var53 ^ switch (var6 % lIIIl(843343124, var17 ^ -395752836)) {
                  case 0 -> lIIIl(843343125, var17 ^ -538394030);
                  case 1 -> lIIIl(843343126, var17 ^ -1076044736);
                  case 2 -> lIIIl(843343127, var17 ^ 224621249);
                  case 3 -> lIIIl(843343112, var17 ^ 769856446);
                  case 4 -> lIIIl(843343113, var17 ^ 1508903830);
                  case 5 -> lIIIl(843343114, var17 ^ -1195964355);
                  default -> lIIIl(843343115, var17 ^ 363862487);
               });
               var6++;
               if (var42 == 0) {
                  var69 = var42;
                  var62 = var32;
                  var53 = var42;
               } else {
                  if (var20 <= var6) {
                     break;
                  }

                  var62 = var32;
                  var53 = var42;
                  var69 = var6;
               }
            }
         }

         String var46 = new String(var32).intern();
         byte var26 = -1;
         var5[var3++] = var46;
         if ((var0 += var1) >= var4) {
            lI = var5;
            II = new String[2];
            Il = new String[2];
            l();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static String II(int var0, int var1) {
      int var9 = -77309642;
      int var2 = (var0 ^ lIIIl(843342864, var9 ^ -2143208995)) & lIIIl(843342865, var9 ^ -1825327072);
      if (II[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & lIIIl(843342866, var9 ^ -249480749)) {
            case 0 -> lIIIl(843342867, var9 ^ 804780014);
            case 1 -> lIIIl(843342868, var9 ^ 2058928322);
            case 2 -> lIIIl(843342869, var9 ^ 1541849506);
            case 3 -> lIIIl(843342870, var9 ^ -1728768518);
            case 4 -> lIIIl(843342871, var9 ^ 2044976680);
            case 5 -> lIIIl(843342856, var9 ^ 753237755);
            case 6 -> lIIIl(843342857, var9 ^ -1798368017);
            case 7 -> lIIIl(843342858, var9 ^ -2038074888);
            case 8 -> lIIIl(843342859, var9 ^ -124561728);
            case 9 -> lIIIl(843342860, var9 ^ 1014819072);
            case 10 -> lIIIl(843342861, var9 ^ -262604976);
            case 11 -> lIIIl(843342862, var9 ^ -1509362850);
            case 12 -> lIIIl(843342863, var9 ^ 989871598);
            case 13 -> lIIIl(843342848, var9 ^ 1784117902);
            case 14 -> lIIIl(843342849, var9 ^ -1130199294);
            case 15 -> lIIIl(843342850, var9 ^ 1368114103);
            case 16 -> lIIIl(843342851, var9 ^ 1597082809);
            case 17 -> lIIIl(843342852, var9 ^ 391100207);
            case 18 -> lIIIl(843342853, var9 ^ 794084036);
            case 19 -> lIIIl(843342854, var9 ^ 927708742);
            case 20 -> lIIIl(843342855, var9 ^ 1679716902);
            case 21 -> lIIIl(843342904, var9 ^ 811548947);
            case 22 -> lIIIl(843342905, var9 ^ -425598621);
            case 23 -> lIIIl(843342906, var9 ^ 582791424);
            case 24 -> lIIIl(843342907, var9 ^ -2009096275);
            case 25 -> lIIIl(843342908, var9 ^ -1649015415);
            case 26 -> lIIIl(843342909, var9 ^ -509502346);
            case 27 -> lIIIl(843342910, var9 ^ 1213634717);
            case 28 -> lIIIl(843342911, var9 ^ -1276044744);
            case 29 -> lIIIl(843342896, var9 ^ 1416608699);
            case 30 -> lIIIl(843342897, var9 ^ 200471090);
            case 31 -> lIIIl(843342898, var9 ^ -500716049);
            case 32 -> lIIIl(843342899, var9 ^ 1781107976);
            case 33 -> lIIIl(843342900, var9 ^ -1992910671);
            case 34 -> lIIIl(843342901, var9 ^ 2020741576);
            case 35 -> lIIIl(843342902, var9 ^ -809890420);
            case 36 -> lIIIl(843342903, var9 ^ 599711188);
            case 37 -> lIIIl(843342888, var9 ^ 2042583151);
            case 38 -> lIIIl(843342889, var9 ^ 246303646);
            case 39 -> lIIIl(843342890, var9 ^ -2033428293);
            case 40 -> lIIIl(843342891, var9 ^ 1934053780);
            case 41 -> lIIIl(843342892, var9 ^ -1074110739);
            case 42 -> lIIIl(843342893, var9 ^ -1555643606);
            case 43 -> lIIIl(843342894, var9 ^ 1024666284);
            case 44 -> lIIIl(843342895, var9 ^ -1203033733);
            case 45 -> lIIIl(843342880, var9 ^ 554499612);
            case 46 -> lIIIl(843342881, var9 ^ 1983743714);
            case 47 -> 4;
            case 48 -> lIIIl(843342882, var9 ^ 616991251);
            case 49 -> lIIIl(843342883, var9 ^ -1759177236);
            case 50 -> lIIIl(843342884, var9 ^ -1393287809);
            case 51 -> 2;
            case 52 -> lIIIl(843342885, var9 ^ 1699340410);
            case 53 -> lIIIl(843342886, var9 ^ -319927039);
            case 54 -> lIIIl(843342887, var9 ^ 701669026);
            case 55 -> lIIIl(843342936, var9 ^ 843306914);
            case 56 -> lIIIl(843342937, var9 ^ 986302707);
            case 57 -> lIIIl(843342938, var9 ^ -1572175900);
            case 58 -> lIIIl(843342939, var9 ^ 936567835);
            case 59 -> lIIIl(843342940, var9 ^ -621744809);
            case 60 -> lIIIl(843342941, var9 ^ -951975979);
            case 61 -> lIIIl(843342942, var9 ^ 617913551);
            case 62 -> lIIIl(843342943, var9 ^ 423012011);
            case 63 -> lIIIl(843342928, var9 ^ 1596478928);
            case 64 -> lIIIl(843342929, var9 ^ 1777104105);
            case 65 -> lIIIl(843342930, var9 ^ 764303256);
            case 66 -> lIIIl(843342931, var9 ^ -2033955923);
            case 67 -> lIIIl(843342932, var9 ^ 657637453);
            case 68 -> lIIIl(843342933, var9 ^ -699928172);
            case 69 -> lIIIl(843342934, var9 ^ 751059805);
            case 70 -> 1;
            case 71 -> lIIIl(843342935, var9 ^ 856814508);
            case 72 -> lIIIl(843342920, var9 ^ -1833546576);
            case 73 -> lIIIl(843342921, var9 ^ 2073995803);
            case 74 -> lIIIl(843342922, var9 ^ 1807935082);
            case 75 -> lIIIl(843342923, var9 ^ 398618549);
            case 76 -> lIIIl(843342924, var9 ^ -1981948539);
            case 77 -> lIIIl(843342925, var9 ^ -298497581);
            case 78 -> 0;
            case 79 -> lIIIl(843342926, var9 ^ -256804281);
            case 80 -> lIIIl(843342927, var9 ^ -1601049408);
            case 81 -> lIIIl(843342912, var9 ^ 255087109);
            case 82 -> lIIIl(843342913, var9 ^ 1051422498);
            case 83 -> lIIIl(843342914, var9 ^ -1899210877);
            case 84 -> lIIIl(843342915, var9 ^ 261720685);
            case 85 -> lIIIl(843342916, var9 ^ -1620169589);
            case 86 -> lIIIl(843342917, var9 ^ 1506009914);
            case 87 -> lIIIl(843342918, var9 ^ 822753622);
            case 88 -> lIIIl(843342919, var9 ^ -1043445484);
            case 89 -> lIIIl(843342968, var9 ^ -579744180);
            case 90 -> lIIIl(843342969, var9 ^ -863301380);
            case 91 -> lIIIl(843342970, var9 ^ -1699355987);
            case 92 -> lIIIl(843342971, var9 ^ 2081361389);
            case 93 -> lIIIl(843342972, var9 ^ 1904290308);
            case 94 -> lIIIl(843342973, var9 ^ 1930128933);
            case 95 -> lIIIl(843342974, var9 ^ 1005710978);
            case 96 -> lIIIl(843342975, var9 ^ -1155317510);
            case 97 -> lIIIl(843342960, var9 ^ 246743427);
            case 98 -> lIIIl(843342961, var9 ^ 1918146332);
            case 99 -> lIIIl(843342962, var9 ^ -1680145304);
            case 100 -> lIIIl(843342963, var9 ^ -1757419819);
            case 101 -> lIIIl(843342964, var9 ^ -1664789445);
            case 102 -> 5;
            case 103 -> lIIIl(843342965, var9 ^ 825843323);
            case 104 -> lIIIl(843342966, var9 ^ -2019495905);
            case 105 -> lIIIl(843342967, var9 ^ -2088416040);
            case 106 -> lIIIl(843342952, var9 ^ -159970518);
            case 107 -> lIIIl(843342953, var9 ^ 1688437278);
            case 108 -> lIIIl(843342954, var9 ^ -1133782018);
            case 109 -> lIIIl(843342955, var9 ^ -633352417);
            case 110 -> lIIIl(843342956, var9 ^ -384335145);
            case 111 -> lIIIl(843342957, var9 ^ -1337494064);
            case 112 -> lIIIl(843342958, var9 ^ 1960062979);
            case 113 -> lIIIl(843342959, var9 ^ 1250296869);
            case 114 -> lIIIl(843342944, var9 ^ -122746598);
            case 115 -> lIIIl(843342945, var9 ^ 1759036999);
            case 116 -> lIIIl(843342946, var9 ^ 1275432241);
            case 117 -> lIIIl(843342947, var9 ^ -1014571216);
            case 118 -> lIIIl(843342948, var9 ^ -272361432);
            case 119 -> lIIIl(843342949, var9 ^ 1592623937);
            case 120 -> lIIIl(843342950, var9 ^ -1610954309);
            case 121 -> lIIIl(843342951, var9 ^ 1616733022);
            case 122 -> lIIIl(843343000, var9 ^ 598431394);
            case 123 -> lIIIl(843343001, var9 ^ -914848898);
            case 124 -> lIIIl(843343002, var9 ^ -2039479055);
            case 125 -> lIIIl(843343003, var9 ^ 620849460);
            case 126 -> lIIIl(843343004, var9 ^ 1707841395);
            case 127 -> lIIIl(843343005, var9 ^ -2109179176);
            case 128 -> lIIIl(843343006, var9 ^ -684678689);
            case 129 -> 3;
            case 130 -> lIIIl(843343007, var9 ^ -353525836);
            case 131 -> lIIIl(843342992, var9 ^ 490485544);
            case 132 -> lIIIl(843342993, var9 ^ 233383147);
            case 133 -> lIIIl(843342994, var9 ^ 995257292);
            case 134 -> lIIIl(843342995, var9 ^ -1837451471);
            case 135 -> lIIIl(843342996, var9 ^ 1765586421);
            case 136 -> lIIIl(843342997, var9 ^ -789736652);
            case 137 -> lIIIl(843342998, var9 ^ -585475708);
            case 138 -> lIIIl(843342999, var9 ^ 399384482);
            case 139 -> lIIIl(843342984, var9 ^ 360229346);
            case 140 -> lIIIl(843342985, var9 ^ 1075722230);
            case 141 -> lIIIl(843342986, var9 ^ 135423773);
            case 142 -> lIIIl(843342987, var9 ^ -700162398);
            case 143 -> lIIIl(843342988, var9 ^ -852157094);
            case 144 -> lIIIl(843342989, var9 ^ 1264787601);
            case 145 -> lIIIl(843342990, var9 ^ 1469202431);
            case 146 -> lIIIl(843342991, var9 ^ 807751902);
            case 147 -> lIIIl(843342976, var9 ^ 1069006899);
            case 148 -> lIIIl(843342977, var9 ^ 1977660252);
            case 149 -> lIIIl(843342978, var9 ^ 2028200388);
            case 150 -> lIIIl(843342979, var9 ^ -803882640);
            case 151 -> lIIIl(843342980, var9 ^ -312612336);
            case 152 -> lIIIl(843342981, var9 ^ 885632246);
            case 153 -> lIIIl(843342982, var9 ^ 1909351818);
            case 154 -> lIIIl(843342983, var9 ^ 827140835);
            case 155 -> lIIIl(843343032, var9 ^ -360092574);
            case 156 -> lIIIl(843343033, var9 ^ 372382022);
            case 157 -> lIIIl(843343034, var9 ^ -36982280);
            case 158 -> lIIIl(843343035, var9 ^ -1972492921);
            case 159 -> lIIIl(843343036, var9 ^ -987114844);
            case 160 -> lIIIl(843343037, var9 ^ -1466679937);
            case 161 -> lIIIl(843343038, var9 ^ -602246250);
            case 162 -> lIIIl(843343039, var9 ^ 142377632);
            case 163 -> lIIIl(843343024, var9 ^ -306097852);
            case 164 -> lIIIl(843343025, var9 ^ -1284635309);
            case 165 -> lIIIl(843343026, var9 ^ 2134699216);
            case 166 -> lIIIl(843343027, var9 ^ 866922447);
            case 167 -> lIIIl(843343028, var9 ^ -1975863495);
            case 168 -> lIIIl(843343029, var9 ^ 1009481048);
            case 169 -> lIIIl(843343030, var9 ^ 887357877);
            case 170 -> lIIIl(843343031, var9 ^ -528447109);
            case 171 -> lIIIl(843343016, var9 ^ -2144458011);
            case 172 -> lIIIl(843343017, var9 ^ -1555574138);
            case 173 -> lIIIl(843343018, var9 ^ -262053570);
            case 174 -> lIIIl(843343019, var9 ^ 281807185);
            case 175 -> lIIIl(843343020, var9 ^ -1055346362);
            case 176 -> lIIIl(843343021, var9 ^ 391802855);
            case 177 -> lIIIl(843343022, var9 ^ 1066082126);
            case 178 -> lIIIl(843343023, var9 ^ 1809496737);
            case 179 -> lIIIl(843343008, var9 ^ 455281319);
            case 180 -> lIIIl(843343009, var9 ^ 1007222606);
            case 181 -> lIIIl(843343010, var9 ^ 497191229);
            case 182 -> lIIIl(843343011, var9 ^ 597554016);
            case 183 -> lIIIl(843343012, var9 ^ -1062412861);
            case 184 -> lIIIl(843343013, var9 ^ 587755708);
            case 185 -> lIIIl(843343014, var9 ^ -1826329450);
            case 186 -> lIIIl(843343015, var9 ^ -376166775);
            case 187 -> lIIIl(843343064, var9 ^ -430685484);
            case 188 -> lIIIl(843343065, var9 ^ -2111655441);
            case 189 -> lIIIl(843343066, var9 ^ -1471268048);
            case 190 -> lIIIl(843343067, var9 ^ 1423790813);
            case 191 -> lIIIl(843343068, var9 ^ -1593946896);
            case 192 -> lIIIl(843343069, var9 ^ -1655098428);
            case 193 -> lIIIl(843343070, var9 ^ -1756071153);
            case 194 -> lIIIl(843343071, var9 ^ 705659550);
            case 195 -> lIIIl(843343056, var9 ^ -1412629990);
            case 196 -> lIIIl(843343057, var9 ^ 1465012787);
            case 197 -> lIIIl(843343058, var9 ^ 1637426853);
            case 198 -> lIIIl(843343059, var9 ^ -1227255822);
            case 199 -> lIIIl(843343060, var9 ^ 9825969);
            case 200 -> lIIIl(843343061, var9 ^ -103127753);
            case 201 -> lIIIl(843343062, var9 ^ 1664297375);
            case 202 -> lIIIl(843343063, var9 ^ 389952580);
            case 203 -> lIIIl(843343048, var9 ^ -538173301);
            case 204 -> lIIIl(843343049, var9 ^ 1779148414);
            case 205 -> lIIIl(843343050, var9 ^ 2006728427);
            case 206 -> lIIIl(843343051, var9 ^ 1794814698);
            case 207 -> lIIIl(843343052, var9 ^ 1542353557);
            case 208 -> lIIIl(843343053, var9 ^ -1288805765);
            case 209 -> lIIIl(843343054, var9 ^ -105647942);
            case 210 -> lIIIl(843343055, var9 ^ 264979259);
            case 211 -> lIIIl(843343040, var9 ^ -951100099);
            case 212 -> lIIIl(843343041, var9 ^ 1827332098);
            case 213 -> lIIIl(843343042, var9 ^ -1810138120);
            case 214 -> lIIIl(843343043, var9 ^ -1684786246);
            case 215 -> lIIIl(843343044, var9 ^ -2131111634);
            case 216 -> lIIIl(843343045, var9 ^ 1998013643);
            case 217 -> lIIIl(843343046, var9 ^ -401649656);
            case 218 -> lIIIl(843343047, var9 ^ 479460991);
            case 219 -> lIIIl(843343096, var9 ^ -359712679);
            case 220 -> lIIIl(843343097, var9 ^ -1699887846);
            case 221 -> lIIIl(843343098, var9 ^ -195869236);
            case 222 -> lIIIl(843343099, var9 ^ -1292718048);
            case 223 -> lIIIl(843343100, var9 ^ 1377735130);
            case 224 -> lIIIl(843343101, var9 ^ -1540059595);
            case 225 -> lIIIl(843343102, var9 ^ 105125001);
            case 226 -> lIIIl(843343103, var9 ^ 945555191);
            case 227 -> lIIIl(843343088, var9 ^ 1842375203);
            case 228 -> lIIIl(843343089, var9 ^ -44874893);
            case 229 -> lIIIl(843343090, var9 ^ -675396917);
            case 230 -> lIIIl(843343091, var9 ^ -219184692);
            case 231 -> lIIIl(843343092, var9 ^ 1624433941);
            case 232 -> lIIIl(843343093, var9 ^ -270562003);
            case 233 -> lIIIl(843343094, var9 ^ 1852330558);
            case 234 -> lIIIl(843343095, var9 ^ 1672016387);
            case 235 -> lIIIl(843343080, var9 ^ 328419322);
            case 236 -> lIIIl(843343081, var9 ^ 2127255315);
            case 237 -> lIIIl(843343082, var9 ^ -1886556255);
            case 238 -> lIIIl(843343083, var9 ^ -1999284085);
            case 239 -> lIIIl(843343084, var9 ^ 1422660162);
            case 240 -> lIIIl(843343085, var9 ^ 1275979598);
            case 241 -> lIIIl(843343086, var9 ^ 607953386);
            case 242 -> lIIIl(843343087, var9 ^ 1437648390);
            case 243 -> lIIIl(843343072, var9 ^ -1724382556);
            case 244 -> lIIIl(843343073, var9 ^ 615924083);
            case 245 -> lIIIl(843343074, var9 ^ 1094207259);
            case 246 -> lIIIl(843343075, var9 ^ -2059460781);
            case 247 -> lIIIl(843343076, var9 ^ 358869310);
            case 248 -> lIIIl(843343077, var9 ^ 1537027756);
            case 249 -> lIIIl(843343078, var9 ^ -1358235300);
            case 250 -> lIIIl(843343079, var9 ^ 132566838);
            case 251 -> lIIIl(843343128, var9 ^ -1829252698);
            case 252 -> lIIIl(843343129, var9 ^ -527821181);
            case 253 -> lIIIl(843343130, var9 ^ -1843223274);
            case 254 -> lIIIl(843343131, var9 ^ -874127793);
            default -> lIIIl(843343132, var9 ^ -1005228224);
         };
         int var5 = (var1 & lIIIl(843343133, var9 ^ -1569097828)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIIl(843343134, var9 ^ -1400072861)) >>> lIIIl(843343135, var9 ^ 1549300600)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIIl(843343120, var9 ^ 1275526126);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIIl(843343121, var9 ^ 2094132521);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }

   private static String lIIll(char var0, int var1, int var2, short var3, int var4, short var5) {
      int var10 = var1 ^ 1167573728;
      char[] var9 = IIIII[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])IIIIl[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         IIIIl[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 64750;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 9) {
            default -> 172;
            case 1 -> 152;
            case 2 -> 72;
            case 3 -> 198;
            case 4 -> 148;
            case 5 -> 35;
            case 6 -> 89;
            case 7 -> 12;
            case 8 -> 122;
         } ^ var4 ^ var1 ^ var5 ^ var2 ^ var7 ^ var0 ^ var3);
      }

      return new String(var9).intern();
   }

   private static int lIIIl(int var0, int var1) {
      int var2 = lllI[var0 ^ 843342872] ^ var1 ^ var0;
      var2 -= 40620;
      var2 ^= 20939;
      var2 -= 17631;
      var2 += 1068;
      var2 -= 32456;
      var2 ^= 28356;
      var2 ^= 39715;
      var2 -= 45354;
      return var2 ^ 36385;
   }
}
