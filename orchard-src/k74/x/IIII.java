package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_304;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class IIII extends IlIIIIIIl {
   private long I;
   private static final String[] IlI;
   private final IIlIII II;
   private static final String[] Il;
   private static final int[] IIl;
   private final lllIIlII lI;
   private static final Object[] Ill;
   private static final String[] ll;
   private boolean III;

   @Override
   public void IlIII() {
      this.III = true;
      this.I = 0L;
   }

   private void I(class_310 var1, IlIlIIII var2, class_304 var3, boolean var4) {
      String[] var5 = IIllllIl.IIIIl();
      if (var3 != null) {
         if (var2 != null) {
            var2.ll(this, var1, var3, var4);
            if (var5 == null) {
               return;
            }
         }

         var3.method_23481(var4);
      }
   }

   private void l(class_310 var1) {
      if (var1 != null && var1.field_1690 != null) {
         IlIlIIII var2 = IlIlIIII.llI();
         this.Il(var1, var2, var1.field_1690.field_1894);
         this.Il(var1, var2, var1.field_1690.field_1913);
         this.Il(var1, var2, var1.field_1690.field_1849);
      }
   }

   private static int ll(int var0, int var1) {
      int var2 = IIl[var0 ^ 17128905] ^ var1 ^ var0;
      var2 += 18266;
      var2 -= 34649;
      var2 -= 50699;
      var2 += 17356;
      var2 ^= 32866;
      var2 -= 21114;
      var2 += 19924;
      var2 += 47184;
      var2 ^= 13163;
      return var2 - 41117;
   }

   @Override
   public void llIl() {
      class_310 var1 = class_310.method_1551();
      this.l(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1503558554;
      String[] var15 = new String[2];
      short var18 = 28067;
      int var10001 = "2ヴ\uf3df㏁\uf390ㄭ献ㆹ珎ネ玵㋖獻ㆆ\uf3c7㍀㏞〝玂ㅭ댶㊩珄ㇽ\uf3a2㉊\uf377㏺㏰㋄珢ぉ뎹ㅽ猺㇁돺㌑㎰ヂ\uf370ザ\uf3ccヨ\uf3e9㈅㎪㌉献㇅珙]初\ue5c5兠ꖰ勸攖僰旭凴▱償╱决旡兡\ue5f9刔▵占\ue51e勘旮叐\ue5af偯\ue57a偃\ue5ef兑ꗶ冼斏倄攥僰旑厼\ue58c劧ꕿ剛◤刑\ue5f5僴斚又ꔦ剼◯刜斥口敾厣ꗃ僱ꗲ劐斬兠ꔉ卸旾単▿偧ꕵ卓◄偹\ue5ce儐斉厠ꔗ勔旾僼▂势╎儃\ue5e8厉◙劸ꖩ倸\ue51a凰◵勐"
         .length();
      int var17 = 0;
      int var14 = var10001;
      int var16 = 0;
      String var13 = "2ヴ\uf3df㏁\uf390ㄭ献ㆹ珎ネ玵㋖獻ㆆ\uf3c7㍀㏞〝玂ㅭ댶㊩珄ㇽ\uf3a2㉊\uf377㏺㏰㋄珢ぉ뎹ㅽ猺㇁돺㌑㎰ヂ\uf370ザ\uf3ccヨ\uf3e9㈅㎪㌉献㇅珙]初\ue5c5兠ꖰ勸攖僰旭凴▱償╱决旡兡\ue5f9刔▵占\ue51e勘旮叐\ue5af偯\ue57a偃\ue5ef兑ꗶ冼斏倄攥僰旑厼\ue58c劧ꕿ剛◤刑\ue5f5僴斚又ꔦ剼◯刜斥口敾厣ꗃ僱ꗲ劐斬兠ꔉ卸旾単▿偧ꕵ卓◄偹\ue5ce儐斉厠ꔗ勔旾僼▂势╎儃\ue5e8厉◙劸ꖩ倸\ue51a凰◵勐";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 251;
               case 1 -> 234;
               case 2 -> 146;
               case 3 -> 141;
               case 4 -> 66;
               case 5 -> 13;
               case 6 -> 246;
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

      IlI = var15;
      Ill = new Object[var15.length];
      int var9 = 1173830129;
      byte[] var7 = "Ë\u00938\u0087b$Í¥\u0085\u00885ôn÷1¥\u001f\\n1\u0091Ü\u008fd1N×@\u0018*í\u0001\u0083rã¶\u001asøãc\u008fU²6ÔFÍ\u0006?½\u0083i\u0010Û~\u0011`l%ºÂ¦\u0016pí\u0092Ï\u0091\u0016¨\u0002mI\u0004ÇL´¼¸ Lêî\u0016ýÕÙêª\u0002S6Õ¤èÖþÛR\u001cí\u0097ç\bªøT\u0019;è\u009e·Zñ\u0089d\u0085ã[VC°\u0094â'Ta\u0083\u001d0^Xì©9\u008fHÂÅ\u0099È-ÝúI\u0003Ý]á:v\u007f6§ë«CÑÒÑl\u0019([\u009c·\t!¥\u0005hJñþ\u001a/\u0005>G|U%\u0017úTW£<Y%ãn\u0086¼Ä\u0099p\u0010Z\tz{9Îy 2\u008f½\u00915 \"Ó.\u0080·\u009d\t\tøõK\u00ad~\u001döMÉü!ìZð\u0003É(\f\u008d\u0096\u0084÷£²\u0087Ì\u0080h\u0011·E\u0012ßt 4QHUo\u0019jÃYã;æB\u0081gÕ!Ë\u001d\u0010úÚðã;ëvÖlêoµâe¯!\u0006ÍF#q\u0084È~ë\u0019\u0006<\u0002ý\u0090`ÛÄ\u001aÈ5xå\u009c\u0084´¾22\u0091äÕ\u009dm\u0080£kÒ\u0012\u0013¿\u0080\u0096\u0084XÏã\u008bîÔµ¢<¶É\\\"T¼\u0088\u000eê)N~8%âzûvÍ#yá\u0015:\u0084ÂÙÕk\u0090\u009f \bit\u0000©\u008f\u001eÜ7\u0006á§:æVr°sùP\u009c\u0085Å\u009bó\\Ô\u0007mõeïÇ\u0010\rþ¨Åóf.\u0019]¼\u0085\t\u009a¥P ST/ø¡c\u0019K\u000f\u0016¸:}\u001f¥«MÞ9RSþ¯gé«LvóÃò ª\u0002ë\u000e)®´\u0093ö\u0012ç\u0080é·^\"c°\u0099ÕÜjl\u008bYÀ@û½^É;=Kk¥\u00982àö\u0089\u0003÷×\u008aû8øömèÈþaÃÊþÀ¾\u0085Þ¦C¶©A\u0080\f»\u008bµËØpÌNßî[\u001bV^Cæg6ª\u0081\u0019tAue:Æc\u0005Çã°±Ñ\u008ft%8®\u0081\u008d2Y=\u0080\u0014wk#ÞÀu0\b £\u000b~}Ú¾¼Û\u009eÎJªáíN\u0001éÐ\u0012½ö\u008ar\u0084þ/\r\fÄ\u0085\u009f\u00ad3jÃ\u009bõ¨ w\u000b²nòW!ÁOmïxá\u0091\u0089róµ\u0097¢Úµ\" R\u000f(\u009eX7N\u0086Ødõ¤Hôì³\u0094g%êÑ>ÚB\u0001\u0082Ôôo\u009aZ\u00ad{Ñ¦Bï\u001a\u009a´Û\u0016{Cß¦ :?pL*\u008fÆaxèé\u0016ÛÐwÜê\u000b\u0083Ì¢Ë\u0093ô3@xt\u0092ÑêV÷\u009e=\u009f.\u0096\u0094\u007f\u0083\u008f]ÊmÐ,¦Wø\u0011\u0087\u008f\u001c\u0096\u009c}û\u008cäÐm¨¬Û\u0018k[EJÄo\u000bÉ\u0083¾<\u0086µg±fi\u008a±\fWì\u0002\u0003%h\u008dÐËWx8p«6íGî;fE\u0082&mÆÓ\u0095×¶õ\u001dréL\u009eó\u001bRÇ\u0089ò\u00019¨\u0082\u0099D?a\u0080ð\u0015ö\u00ad\u009b3Üý\nÛÆt3ÍL\u0081NÉ\"\u0098UOBî¤\u009f\u000eêÈ\u008a'{Z÷À<r\u0093.q\u0018ÏÒ~uZm{\u0087ò\u0016_\u0001\u009f\u008bÔ7T\r?©\u0003WÈ\u0010ñ\u0011.®\u0093ËÔ[÷d§\u000ep[³È;i\u0091\u0097¢ån\u0084\u009f\u009b\u009f\u009d\u0085Î\u009a\u008aÝ1p\u008b\u00112õsy3]=\u0081ÁÜx\u0007üø|ã\u0095²Q\fhÄ\u00adëüÀû\u0092\u009c\u0013\u0010RT\u009c\u0007¢æ'wòÌÖT\u001d?ë\u0084õ\u00adÃ\u008c\u0087óFÐI\u0098;½Iô3\u0011Ü\u0006YäpOrI\u0014üm\u0014´ÎU^eK\u001dRùF \u007ft¥\u0011Fô)YÜ0'ï)*ñ\u0084s»\u008c}Û\u008fô\u008c\u0094PY\u00ad\u0004{R\u0019\u0005\u008c*\u0013\u0099Q\u0012\u0085%§\f\u008e\u0080\u008c\u001a¹Íº:\u0013mA»Æá&®ÞeînÚ¸v\u0013\u0019\u0084)¦ð\u0005þ\u008eT\u0090tü:ë]!UÊ\u0082¢=úê\u0087öÛ0` ¿ó\nb"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IIl = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IIl[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[5];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III((short)-27957, (byte)-33, -1240451710, (char)'陝')).length();
      int var1 = ll(17128651, var23 ^ -1859629159);
      int var25 = -1;

      label101:
      while (true) {
         int var28 = ll(17128650, var23 ^ 958149642);
         String var30 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label96: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var28;
               var41 = var45;
               var10001 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var48 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label96;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % ll(17128652, var23 ^ -420965945)) {
                     case 0 -> ll(17128655, var23 ^ -417338704);
                     case 1 -> ll(17128654, var23 ^ 2076365139);
                     case 2 -> ll(17128641, var23 ^ -952841186);
                     case 3 -> ll(17128640, var23 ^ 1646254838);
                     case 4 -> ll(17128643, var23 ^ 791280064);
                     case 5 -> ll(17128642, var23 ^ -1882031250);
                     default -> ll(17128645, var23 ^ 62222182);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var10001 <= var6) {
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
                     Il = var5;
                     ll = new String[5];
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label101;
                  }

                  var4 = (var2 = III((short)31136, (byte)-122, -1240451709, 9543)).length();
                  var1 = 4;
                  var25 = -1;
            }

            var28 = ll(17128653, var23 ^ 1992530535);
            var30 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private static String II(int var0, int var1) {
      int var9 = 1646462721;
      int var2 = (var0 ^ ll(17128905, var9 ^ -314374830)) & ll(17128904, var9 ^ 1156877552);
      if (ll[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & ll(17128907, var9 ^ -1554417758)) {
            case 0 -> ll(17128906, var9 ^ 1210478606);
            case 1 -> ll(17128909, var9 ^ 965553492);
            case 2 -> ll(17128908, var9 ^ -1223832195);
            case 3 -> ll(17128911, var9 ^ 396334082);
            case 4 -> ll(17128910, var9 ^ 1056681742);
            case 5 -> ll(17128897, var9 ^ -1516002813);
            case 6 -> ll(17128896, var9 ^ 1017297455);
            case 7 -> ll(17128899, var9 ^ 1163794264);
            case 8 -> ll(17128898, var9 ^ 268764551);
            case 9 -> ll(17128901, var9 ^ 552533011);
            case 10 -> ll(17128900, var9 ^ 1338088179);
            case 11 -> ll(17128903, var9 ^ 934358533);
            case 12 -> ll(17128902, var9 ^ -1676417804);
            case 13 -> ll(17128921, var9 ^ 1446826420);
            case 14 -> ll(17128920, var9 ^ -1211635302);
            case 15 -> ll(17128923, var9 ^ 1268270857);
            case 16 -> ll(17128922, var9 ^ 1785069484);
            case 17 -> ll(17128925, var9 ^ -2036488019);
            case 18 -> ll(17128924, var9 ^ 808227923);
            case 19 -> ll(17128927, var9 ^ -864336947);
            case 20 -> ll(17128926, var9 ^ 268756341);
            case 21 -> ll(17128913, var9 ^ -265315963);
            case 22 -> ll(17128912, var9 ^ 977065430);
            case 23 -> ll(17128915, var9 ^ 779860447);
            case 24 -> ll(17128914, var9 ^ 1072343589);
            case 25 -> ll(17128917, var9 ^ -1853115479);
            case 26 -> ll(17128916, var9 ^ 1112842388);
            case 27 -> ll(17128919, var9 ^ 1888678557);
            case 28 -> ll(17128918, var9 ^ -990505448);
            case 29 -> ll(17128937, var9 ^ -1513328143);
            case 30 -> ll(17128936, var9 ^ 2117987110);
            case 31 -> ll(17128939, var9 ^ -1449557828);
            case 32 -> ll(17128938, var9 ^ -1088852889);
            case 33 -> ll(17128941, var9 ^ -594001881);
            case 34 -> ll(17128940, var9 ^ 2066774320);
            case 35 -> ll(17128943, var9 ^ 1508370042);
            case 36 -> ll(17128942, var9 ^ -1919773727);
            case 37 -> ll(17128929, var9 ^ -138585483);
            case 38 -> ll(17128928, var9 ^ 2102261131);
            case 39 -> ll(17128931, var9 ^ 125061060);
            case 40 -> ll(17128930, var9 ^ 1814084805);
            case 41 -> ll(17128933, var9 ^ 164920427);
            case 42 -> ll(17128932, var9 ^ 1518625964);
            case 43 -> ll(17128935, var9 ^ -595258173);
            case 44 -> ll(17128934, var9 ^ 445146193);
            case 45 -> ll(17128953, var9 ^ 1213726599);
            case 46 -> ll(17128952, var9 ^ -1079946450);
            case 47 -> ll(17128955, var9 ^ 799750489);
            case 48 -> ll(17128954, var9 ^ -391585087);
            case 49 -> ll(17128957, var9 ^ -1452486077);
            case 50 -> ll(17128956, var9 ^ -2030857936);
            case 51 -> ll(17128959, var9 ^ -1503208328);
            case 52 -> 4;
            case 53 -> ll(17128958, var9 ^ 791263118);
            case 54 -> ll(17128945, var9 ^ -1951441148);
            case 55 -> ll(17128944, var9 ^ 1796784066);
            case 56 -> ll(17128947, var9 ^ -896814218);
            case 57 -> ll(17128946, var9 ^ -268874106);
            case 58 -> ll(17128949, var9 ^ -1336560410);
            case 59 -> ll(17128948, var9 ^ -1806266707);
            case 60 -> ll(17128951, var9 ^ 1321268666);
            case 61 -> ll(17128950, var9 ^ 873346308);
            case 62 -> ll(17128841, var9 ^ 310381133);
            case 63 -> ll(17128840, var9 ^ 1237854329);
            case 64 -> ll(17128843, var9 ^ 2134014076);
            case 65 -> ll(17128842, var9 ^ 1682974058);
            case 66 -> ll(17128845, var9 ^ 119168941);
            case 67 -> ll(17128844, var9 ^ -603213122);
            case 68 -> ll(17128847, var9 ^ 490354170);
            case 69 -> ll(17128846, var9 ^ 1245392176);
            case 70 -> 0;
            case 71 -> ll(17128833, var9 ^ -994775889);
            case 72 -> ll(17128832, var9 ^ 538707113);
            case 73 -> ll(17128835, var9 ^ 1465223693);
            case 74 -> ll(17128834, var9 ^ -842513133);
            case 75 -> ll(17128837, var9 ^ 606917044);
            case 76 -> ll(17128836, var9 ^ -48932039);
            case 77 -> ll(17128839, var9 ^ 329885663);
            case 78 -> ll(17128838, var9 ^ -1570374603);
            case 79 -> ll(17128857, var9 ^ 339781198);
            case 80 -> ll(17128856, var9 ^ -1145257235);
            case 81 -> ll(17128859, var9 ^ 1292062811);
            case 82 -> ll(17128858, var9 ^ -1722690139);
            case 83 -> ll(17128861, var9 ^ 2115936312);
            case 84 -> ll(17128860, var9 ^ -939133382);
            case 85 -> ll(17128863, var9 ^ 442993217);
            case 86 -> ll(17128862, var9 ^ 75890234);
            case 87 -> ll(17128849, var9 ^ 674982713);
            case 88 -> ll(17128848, var9 ^ 1491690540);
            case 89 -> ll(17128851, var9 ^ 1546270497);
            case 90 -> ll(17128850, var9 ^ 94937343);
            case 91 -> ll(17128853, var9 ^ 475365545);
            case 92 -> ll(17128852, var9 ^ -205860107);
            case 93 -> ll(17128855, var9 ^ -2032587812);
            case 94 -> ll(17128854, var9 ^ 645451181);
            case 95 -> ll(17128873, var9 ^ -85572124);
            case 96 -> ll(17128872, var9 ^ -2115263480);
            case 97 -> ll(17128875, var9 ^ 1415655499);
            case 98 -> 2;
            case 99 -> ll(17128874, var9 ^ 1984808668);
            case 100 -> ll(17128877, var9 ^ -1121837415);
            case 101 -> ll(17128876, var9 ^ 566015992);
            case 102 -> ll(17128879, var9 ^ -921283813);
            case 103 -> ll(17128878, var9 ^ -663124982);
            case 104 -> ll(17128865, var9 ^ 1090476188);
            case 105 -> ll(17128864, var9 ^ -1705752503);
            case 106 -> ll(17128867, var9 ^ -2088672613);
            case 107 -> ll(17128866, var9 ^ 1929296540);
            case 108 -> ll(17128869, var9 ^ 1170737475);
            case 109 -> ll(17128868, var9 ^ 812218733);
            case 110 -> ll(17128871, var9 ^ 963963163);
            case 111 -> ll(17128870, var9 ^ -119009273);
            case 112 -> ll(17128889, var9 ^ -662821812);
            case 113 -> ll(17128888, var9 ^ -1919076605);
            case 114 -> ll(17128891, var9 ^ -450665789);
            case 115 -> ll(17128890, var9 ^ 607800487);
            case 116 -> ll(17128893, var9 ^ -2006593129);
            case 117 -> 1;
            case 118 -> ll(17128892, var9 ^ 876004350);
            case 119 -> ll(17128895, var9 ^ -1852874717);
            case 120 -> ll(17128894, var9 ^ -1773627505);
            case 121 -> ll(17128881, var9 ^ 1287506224);
            case 122 -> ll(17128880, var9 ^ -426657469);
            case 123 -> ll(17128883, var9 ^ 2014870258);
            case 124 -> ll(17128882, var9 ^ 1840965283);
            case 125 -> ll(17128885, var9 ^ 338802510);
            case 126 -> 5;
            case 127 -> ll(17128884, var9 ^ 623285750);
            case 128 -> ll(17128887, var9 ^ -571885286);
            case 129 -> ll(17128886, var9 ^ 1262062186);
            case 130 -> ll(17128777, var9 ^ 1192396916);
            case 131 -> ll(17128776, var9 ^ -428882708);
            case 132 -> ll(17128779, var9 ^ -2137852699);
            case 133 -> ll(17128778, var9 ^ 1733381749);
            case 134 -> ll(17128781, var9 ^ -1385920168);
            case 135 -> ll(17128780, var9 ^ 1444744605);
            case 136 -> ll(17128783, var9 ^ -930457429);
            case 137 -> ll(17128782, var9 ^ 2022876164);
            case 138 -> ll(17128769, var9 ^ 276546287);
            case 139 -> ll(17128768, var9 ^ 1385182872);
            case 140 -> ll(17128771, var9 ^ 471278012);
            case 141 -> ll(17128770, var9 ^ -516754933);
            case 142 -> ll(17128773, var9 ^ -144820556);
            case 143 -> ll(17128772, var9 ^ 511689517);
            case 144 -> ll(17128775, var9 ^ 344489964);
            case 145 -> ll(17128774, var9 ^ 849750246);
            case 146 -> ll(17128793, var9 ^ -133089679);
            case 147 -> ll(17128792, var9 ^ 779215420);
            case 148 -> ll(17128795, var9 ^ 1487707042);
            case 149 -> ll(17128794, var9 ^ -1710563385);
            case 150 -> ll(17128797, var9 ^ 1820042120);
            case 151 -> ll(17128796, var9 ^ 1758505803);
            case 152 -> ll(17128799, var9 ^ 879539556);
            case 153 -> ll(17128798, var9 ^ 1414904923);
            case 154 -> ll(17128785, var9 ^ 735937936);
            case 155 -> ll(17128784, var9 ^ -1183026852);
            case 156 -> ll(17128787, var9 ^ -448088276);
            case 157 -> ll(17128786, var9 ^ -2035922270);
            case 158 -> ll(17128789, var9 ^ 1210258765);
            case 159 -> ll(17128788, var9 ^ -409063610);
            case 160 -> ll(17128791, var9 ^ 1580257467);
            case 161 -> ll(17128790, var9 ^ 1411577653);
            case 162 -> ll(17128809, var9 ^ -2079590823);
            case 163 -> ll(17128808, var9 ^ -2038215306);
            case 164 -> ll(17128811, var9 ^ -1198950967);
            case 165 -> ll(17128810, var9 ^ -1610013245);
            case 166 -> ll(17128813, var9 ^ -2103855349);
            case 167 -> ll(17128812, var9 ^ -1790630523);
            case 168 -> ll(17128815, var9 ^ -872382514);
            case 169 -> ll(17128814, var9 ^ 1691402336);
            case 170 -> ll(17128801, var9 ^ -759244799);
            case 171 -> ll(17128800, var9 ^ -1951755568);
            case 172 -> ll(17128803, var9 ^ 1681807481);
            case 173 -> ll(17128802, var9 ^ -1844816627);
            case 174 -> ll(17128805, var9 ^ 1695475170);
            case 175 -> ll(17128804, var9 ^ 485372416);
            case 176 -> ll(17128807, var9 ^ 207521673);
            case 177 -> ll(17128806, var9 ^ 1580836905);
            case 178 -> ll(17128825, var9 ^ -50252078);
            case 179 -> ll(17128824, var9 ^ -858078850);
            case 180 -> ll(17128827, var9 ^ -2078617322);
            case 181 -> ll(17128826, var9 ^ 361839151);
            case 182 -> ll(17128829, var9 ^ -1275025332);
            case 183 -> ll(17128828, var9 ^ -783319889);
            case 184 -> ll(17128831, var9 ^ 138925725);
            case 185 -> ll(17128830, var9 ^ -1520558415);
            case 186 -> ll(17128817, var9 ^ 1258385267);
            case 187 -> ll(17128816, var9 ^ 1898533609);
            case 188 -> ll(17128819, var9 ^ -1446128599);
            case 189 -> ll(17128818, var9 ^ 1529531868);
            case 190 -> ll(17128821, var9 ^ -155391438);
            case 191 -> ll(17128820, var9 ^ -37148388);
            case 192 -> ll(17128823, var9 ^ 1671137031);
            case 193 -> ll(17128822, var9 ^ 756596848);
            case 194 -> ll(17128713, var9 ^ 441972730);
            case 195 -> ll(17128712, var9 ^ -1749603694);
            case 196 -> ll(17128715, var9 ^ -1747118656);
            case 197 -> ll(17128714, var9 ^ 617768946);
            case 198 -> 3;
            case 199 -> ll(17128717, var9 ^ -1425962434);
            case 200 -> ll(17128716, var9 ^ 1592341064);
            case 201 -> ll(17128719, var9 ^ 272369110);
            case 202 -> ll(17128718, var9 ^ 498534316);
            case 203 -> ll(17128705, var9 ^ 12354916);
            case 204 -> ll(17128704, var9 ^ -1291389921);
            case 205 -> ll(17128707, var9 ^ 1000582068);
            case 206 -> ll(17128706, var9 ^ -1205708398);
            case 207 -> ll(17128709, var9 ^ -514281173);
            case 208 -> ll(17128708, var9 ^ 528072718);
            case 209 -> ll(17128711, var9 ^ 1659773857);
            case 210 -> ll(17128710, var9 ^ -691751848);
            case 211 -> ll(17128729, var9 ^ -1109221748);
            case 212 -> ll(17128728, var9 ^ 738887457);
            case 213 -> ll(17128731, var9 ^ 354160377);
            case 214 -> ll(17128730, var9 ^ 1746428001);
            case 215 -> ll(17128733, var9 ^ 1939734557);
            case 216 -> ll(17128732, var9 ^ -2108797056);
            case 217 -> ll(17128735, var9 ^ -296000303);
            case 218 -> ll(17128734, var9 ^ 2082898599);
            case 219 -> ll(17128721, var9 ^ 1413639521);
            case 220 -> ll(17128720, var9 ^ 1042190580);
            case 221 -> ll(17128723, var9 ^ 1401630637);
            case 222 -> ll(17128722, var9 ^ -1591519465);
            case 223 -> ll(17128725, var9 ^ 659474718);
            case 224 -> ll(17128724, var9 ^ 293949070);
            case 225 -> ll(17128727, var9 ^ -1882057505);
            case 226 -> ll(17128726, var9 ^ 908088224);
            case 227 -> ll(17128745, var9 ^ -2008905662);
            case 228 -> ll(17128744, var9 ^ 2099652226);
            case 229 -> ll(17128747, var9 ^ 681646403);
            case 230 -> ll(17128746, var9 ^ -286644030);
            case 231 -> ll(17128749, var9 ^ -1317820699);
            case 232 -> ll(17128748, var9 ^ -1571890467);
            case 233 -> ll(17128751, var9 ^ -1152086939);
            case 234 -> ll(17128750, var9 ^ -1408470032);
            case 235 -> ll(17128737, var9 ^ -1379896982);
            case 236 -> ll(17128736, var9 ^ 1437102401);
            case 237 -> ll(17128739, var9 ^ 458261395);
            case 238 -> ll(17128738, var9 ^ 1591131824);
            case 239 -> ll(17128741, var9 ^ 1513281530);
            case 240 -> ll(17128740, var9 ^ 2010983134);
            case 241 -> ll(17128743, var9 ^ -1959084500);
            case 242 -> ll(17128742, var9 ^ -582754794);
            case 243 -> ll(17128761, var9 ^ 914560472);
            case 244 -> ll(17128760, var9 ^ 561226975);
            case 245 -> ll(17128763, var9 ^ 1361284520);
            case 246 -> ll(17128762, var9 ^ 1926003916);
            case 247 -> ll(17128765, var9 ^ -1574637802);
            case 248 -> ll(17128764, var9 ^ -1437159206);
            case 249 -> ll(17128767, var9 ^ -157754735);
            case 250 -> ll(17128766, var9 ^ -1684490511);
            case 251 -> ll(17128753, var9 ^ 923616713);
            case 252 -> ll(17128752, var9 ^ -1029632883);
            case 253 -> ll(17128755, var9 ^ 1875229955);
            case 254 -> ll(17128754, var9 ^ 845516238);
            default -> ll(17128757, var9 ^ 2025064498);
         };
         int var5 = (var1 & ll(17128756, var9 ^ 1948779657)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(17128759, var9 ^ 1503978683)) >>> ll(17128758, var9 ^ 1613064219)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(17128649, var9 ^ -85891909);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(17128648, var9 ^ 268153553);
            }
         }

         ll[var2] = new String(var3).intern();
      }

      return ll[var2];
   }

   private static String III(short var0, byte var1, int var2, char var3) {
      int var8 = var2 ^ -1240451710;
      char[] var7 = IlI[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])Ill[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         Ill[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 48317;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 28) {
            default -> 228;
            case 1 -> 220;
            case 2 -> 138;
            case 3 -> 159;
            case 4 -> 237;
            case 5 -> 255;
            case 6 -> 72;
            case 7 -> 178;
            case 8 -> 252;
            case 9 -> 151;
            case 10 -> 46;
            case 11 -> 71;
            case 12 -> 68;
            case 13 -> 95;
            case 14 -> 216;
            case 15 -> 225;
            case 16 -> 170;
            case 17 -> 231;
            case 18 -> 176;
            case 19 -> 136;
            case 20 -> 250;
            case 21 -> 72;
            case 22 -> 173;
            case 23 -> 9;
            case 24 -> 76;
            case 25 -> 180;
            case 26 -> 233;
            case 27 -> 68;
         } ^ var3 ^ var2 ^ var0 ^ var5 ^ var1);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   private void Il(class_310 var1, IlIlIIII var2, class_304 var3) {
      String[] var4 = IIllllIl.IIIIl();
      if (var3 != null) {
         if (var2 != null) {
            var2.IIII(this, var1, var3);
            if (var4 == null) {
               return;
            }
         }

         var3.method_23481(false);
      }
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      this.lI(var1);
   }

   @Override
   public void llIIII(class_310 var1) {
      this.lI(var1);
   }

   private void lI(class_310 var1) {
      if (var1 != null) {
         if (var1.field_1724 != null && var1.field_1690 != null) {
            if (var1.field_1755 != null) {
               this.l(var1);
            } else {
               IlIlIIII var2 = IlIlIIII.llI();
               this.I(var1, var2, var1.field_1690.field_1894, true);
               if (!this.lI.IllI()) {
                  this.I(var1, var2, var1.field_1690.field_1913, false);
                  this.I(var1, var2, var1.field_1690.field_1849, false);
               } else {
                  long var3 = System.currentTimeMillis();
                  if (var3 >= this.I) {
                     this.III = !this.III;
                     this.I = var3 + Math.max(100L, Math.round(this.II.IllI() * 1000.0));
                  }

                  this.I(var1, var2, var1.field_1690.field_1913, this.III);
                  this.I(var1, var2, var1.field_1690.field_1849, !this.III);
               }
            }
         }
      }
   }

   public IIII() {
      int var1 = 1723386850;
      super(
         IlIIllIII.Ill(II(ll(17128644, var1 ^ 1202036449), ll(17128647, var1 ^ -1707297188))),
         lllIIlIl.III,
         IlIIllIII.Ill(II(ll(17128646, var1 ^ -1503504603), ll(17128665, var1 ^ 666216675)))
      );
      this.lI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(II(ll(17128664, var1 ^ -1304490985), ll(17128667, var1 ^ -921248883))), false));
      this.II = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(II(ll(17128666, var1 ^ -389459437), ll(17128669, var1 ^ -660542587))), 0.8, 0.1, 5.0, 0.1)
            .IIIl(IlIIllIII.Ill(II(ll(17128668, var1 ^ -109342226), ll(17128671, var1 ^ -1648828544))))
      );
      this.III = true;
      this.II.lIlI(this.lI::IllI);
   }
}
