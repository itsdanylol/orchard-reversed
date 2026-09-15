package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIIIlII {
   I,
   l,
   III;
   private static String[] II;
   private static final String[] Il;
   private static final Object[] Ill;
   private static final IIIIlII[] lI;
   private static final String[] IlI;
   private static final String[] ll;
   private static final int[] IIl;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = ll(-822293402, -1510083153 ^ -1314138174) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(-822293401, -1510083153 ^ 630582911);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -1718056293;
      int var17 = 0;
      String[] var10001 = new String[1];
      int var16 = 0;
      String[] var15 = var10001;
      int var29 = "\u001a⩘잦㴎낍杈붲噙뇧鞌깮\uf1beꟾ舂蹶煎뎐쟦杳᳀齷쯇㼒㬷懡㣑\udbf5".length();
      short var18 = 8998;
      int var14 = var29;
      String var13 = "\u001a⩘잦㴎낍杈붲噙뇧鞌깮\uf1beꟾ舂蹶煎뎐쟦杳᳀齷쯇㼒㬷懡㣑\udbf5";

      do {
         char var19 = var13.charAt(var17);
         String var10000 = var13.substring(var17 + 1, var17 + 1 + var19);
         int var21 = 0;
         char[] var20 = var10000.toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 185;
               case 1 -> 48;
               case 2 -> 125;
               case 3 -> 158;
               case 4 -> 85;
               case 5 -> 201;
               case 6 -> 199;
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

      IlI = var15;
      Ill = new Object[var15.length];
      int var9 = 1023635594;
      byte[] var7 = "\"YåÂ\u008chì\u0007Ð¶\u0091Ø,ô¯Õ¦ãW¬ã±sp\u0004\u0094Ê`\u0085ðÈ7\u0000¡ô\u001fW\u0085\u0011\u0080yMr°]h\u000f2ÕÒÜ:ôðhæ;\u009e1Hê\u0099Õ´Ò]¦uõd\u000f\u0002bÒ@\u000e\u0019,ÿKË\u0086Âb´YÑ§Z\u0083ÒRÄä1ZÌN\u001c\tâC¤õÆ\u0001J6*@ÒEÔ\u0002Êð+\u0080ZVÈ¼r»#§=/×Æ\u0089\u008eõ$ÜÍ³S\u0010V±õ@\u0004t¯TPÖÅ!m\u009avk´V¥\u009d\n\u0087Ñ\u0001è\u0093²\u008bîÇIÌú«\u0096^qM\u001f¼AÈ\u008eµÊ)¿à\u001eUÃ]5Édç{Tn|Ä\u008fÔ\u0018ÊÚ\u001d6\u0011UùÔÒP\u0080»Vf\u001c²·.\u0012\u008bQËåcÔã¯1\u007f7OHZ8n\u00945\u001d~`_î\u0081\u0012oþ\u00883\u0000e®7\u0083Æ¤$n\u009csT\u0088\u0012\fWNÜ#Ý=\u0014/\u001b\u0089n¯§]ìÂ\fJ.82Ù\u0080@¯ \u0019¨\u001e\u0013·\u009d:ð¶Ç\u001f\u0091C¿^ÀÇ`\u0017#·ÇÍMÜ7û\u0099-¯\u0002DÑDå!¹ÿ\u000e\u0013u\u008cè\u0096z]tMµó\u008ciûp]pæa\u008a2òzÂ\u0003Vy\u0016õ\u0007\u0098%kGÎ\u0089V\u0091l¾\u0018KÓYÛ\u0014í©\u0098\u000fÕkò\u00917\u009b\u0014\u0094\u0004j\u0019\u0096f÷½T2\u0005ÉH\u000e\u0002¾Ï\u001cMÙ\u0019\u0017ÉUN\u000fÓ\u009d/ÒqÛ\u009e7Ó\u0012Hp0<vsö)î\u000e&ûx£ÂÐ~º\u008bæï\u007f(ò\u009dYãÏ±\u0001\u00029þ¢ã¯_\u0097Ë©L£~Jï§\u0093ð\u009d\u0015hà<\n\u009d\u0003»lCú\u001aHm?I\u0090\u0017\u0011êAÚ+Ú¥À\r+\u009fG,\u0016,á\u007f?4\u0082:\u001dÔ\u009b'Ã\u0003\u0002ù7\u008a6\"æz\u0015hUL}¿\"]\u0095FÛ2þv Im]£\u009f®\u008ciËÅ\u0003®GÉè\u0090/SwÑJ\u008cpö\u0004¢V[²\u009eâ\u008d\u0011±\u0004=Ej§êº\u0014\u0019ñ8~fø©P\u000b\u001e\u0089Cê1\u0004Bö1Ð;\u007fâ3Lk^.H\u0093Í\u0084Yãû\u009a\u0016\u0099O±ZêO·\u008a\u001eD\u0089\u0018\u0098\u0090?Ðë¦ßë\u0016\u008a²\u0096\u000e+\u0002âÏÐ¤~H_¹`++\u0005´\u0007[\\ï/\u0001Óp¶N\u007fæÿ\u0084³¨|Ã\u008cXIv¶P³Ô¼æFP\u009b¢N§®D¹¿9`ã¯\u009a\u008b-ç\u0094vpþ®\u008c=ns·\u0081¬t\u008e_:9\u0093Ø2^\u000f\u0093³¡F+<Ï5¬\u001d\u0095¥ï+»øA\u0098ñ\u0092TÊÙ\u008d÷'\u0005\u0090!ë@kÉá_\u008d±û·¨FýØ\u001dþ\u0097ÚceÝ\u001f÷¾\u0086[üP\u0096Â\u0016ÉWÐ©ì#¯chð\\\u008bö\u0086\u0007Êæ\u0096i»\u008f3a\u0014\u0083\"0ÛÐè¤\u0085\u009aæ·$76³¦Ìë¨\u0097MóüT{¬Ýf=l\u008bÿ\u008f¿&\u0018ãJ\u00109#ê\u0017\u0010ÙÞ¤\u0088\u00888VN,Ûzz\u001d\u009f¢\u001aèøðb=z\u009f-W&je\r\u009aú®Î_SÒT\u0097¡\u0002c\u000e\u0088Ý\u001bÑÙÕ»@q\u008fE²Ñ\u0090ý\u0004Å9\u008d\u0012Ùöò%Ò\u00902õÜjÅ³\u0092\u0002qÞ\u0095\u0090\u001f2\u0006L¯¤\u0010Xð\u001aQ\u0016ö2ç´Äç%\u001fI\u0017\u009f\u0007'¥Ê«'k¡\u009fz®V¶~éjð\u001b3-\u0088LÃuu\u0086pÚ\u0093\u009fÖ¼éÿ.Ð\u0012&k«¦h+[øOYq×*\u008c¦\\\u000b×Üw\\\u0089Ö¬³òÊ3biµu&+\"\u00939_\u0015M½\u0013Èha>\\ØÉ }K»Ô£\u008fW\u0098Ä\"!ÔöùÄ/h\u001dYß¬\u001a+\u009e\u0016\u0091\u009e7I|WÞV\u009d\f\u0014I\u0019\u0082ÛçÕåJb\u009atSh'&:xaÅoz_Ù/Âõð(\u0007Ó\u009e\u0089sq8"
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

      String[] var5 = new String[3];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III(1841538549, (byte)-111, '㼆', 14)).length();
      int var1 = ll(-822293404, var23 ^ 1160703323);
      int var0 = -1;

      while (true) {
         char[] var10002;
         label86: {
            int var28 = ll(-822293403, var23 ^ -1184050396);
            char[] var10003 = var2.substring(++var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var36 = var28;
            var10002 = var10003;
            int var31 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var28;
               var10006 = var6;
            } else {
               var36 = var28;
               var31 = var10004;
               if (var10004 <= var6) {
                  break label86;
               }

               var10005 = var10003;
               var10004 = var28;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % ll(-822293406, var23 ^ 863710189)) {
                  case 0 -> ll(-822293405, var23 ^ 1982402457);
                  case 1 -> ll(-822293408, var23 ^ -1861437879);
                  case 2 -> ll(-822293407, var23 ^ 275297499);
                  case 3 -> ll(-822293394, var23 ^ -1791391738);
                  case 4 -> ll(-822293393, var23 ^ -1038258944);
                  case 5 -> ll(-822293396, var23 ^ -321581439);
                  default -> ll(-822293395, var23 ^ -923765829);
               });
               var6++;
               if (var36 == 0) {
                  var10006 = var36;
                  var10005 = var10002;
                  var10004 = var36;
               } else {
                  if (var31 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var36;
                  var10006 = var6;
               }
            }
         }

         String var38 = new String(var10002).intern();
         byte var33 = -1;
         var5[var3++] = var38;
         if ((var0 += var1) >= var4) {
            Il = var5;
            ll = new String[3];
            II = new String[3];
            l();
            l = new IIIIlII();
            III = new IIIIlII();
            I = new IIIIlII();
            lI = II();
            return;
         }

         var1 = var2.charAt(var0);
      }
   }

   private static void l() {
      int var0 = -1612192997;
      II[0] = I(lI(ll(-822293398, var0 ^ 1177914439), ll(-822293397, var0 ^ 1729594977)).toCharArray(), 88812L, ll(-822293400, var0 ^ 633514737));
      II[1] = I(lI(ll(-822293399, var0 ^ 2038334925), ll(-822293386, var0 ^ 1102715061)).toCharArray(), 13146L, ll(-822293385, var0 ^ -901654318));
      II[2] = I(lI(ll(-822293388, var0 ^ -248180712), ll(-822293387, var0 ^ -1966391023)).toCharArray(), 52892L, ll(-822293390, var0 ^ -1359746023));
   }

   private static IIIIlII[] II() {
      return new IIIIlII[]{l, III, I};
   }

   private static String III(int var0, byte var1, char var2, byte var3) {
      int var8 = var0 ^ 1841538549;
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
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 20849;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ 21028 ^ var6 ^ var2 ^ var5 ^ var0 ^ var3 ^ var1);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   public static IIIIlII Il(String var0) {
      return Enum.valueOf(IIIIlII.class, var0);
   }

   private static int ll(int var0, int var1) {
      int var2 = IIl[var0 ^ -822293402] ^ var1 ^ var0;
      var2 ^= 29371;
      var2 -= 53386;
      var2 ^= 49241;
      var2 += 52390;
      var2 += 21347;
      var2 ^= 36888;
      return var2 + 43088;
   }

   private static String lI(int var0, int var1) {
      int var9 = 987259330;
      int var2 = (var0 ^ ll(-822293389, var9 ^ -2105474275)) & ll(-822293392, var9 ^ -1817950896);
      if (ll[var2] == null) {
         char[] var3 = Il[var2].toCharArray();

         int var4 = switch (var3[0] & ll(-822293391, var9 ^ -230906023)) {
            case 0 -> ll(-822293378, var9 ^ -90797314);
            case 1 -> ll(-822293377, var9 ^ -728026317);
            case 2 -> ll(-822293380, var9 ^ -254157320);
            case 3 -> ll(-822293379, var9 ^ 479741288);
            case 4 -> ll(-822293382, var9 ^ -489005954);
            case 5 -> ll(-822293381, var9 ^ 492359115);
            case 6 -> ll(-822293384, var9 ^ -26941988);
            case 7 -> ll(-822293383, var9 ^ 360688202);
            case 8 -> ll(-822293434, var9 ^ -518119807);
            case 9 -> ll(-822293433, var9 ^ -1006875831);
            case 10 -> ll(-822293436, var9 ^ -2054453464);
            case 11 -> ll(-822293435, var9 ^ -2027038881);
            case 12 -> 3;
            case 13 -> ll(-822293438, var9 ^ 1115145180);
            case 14 -> ll(-822293437, var9 ^ -534923710);
            case 15 -> ll(-822293440, var9 ^ -1397818190);
            case 16 -> ll(-822293439, var9 ^ 1618807369);
            case 17 -> ll(-822293426, var9 ^ -1324771598);
            case 18 -> ll(-822293425, var9 ^ -1519772654);
            case 19 -> ll(-822293428, var9 ^ -242132412);
            case 20 -> ll(-822293427, var9 ^ -1655781006);
            case 21 -> ll(-822293430, var9 ^ 2076650445);
            case 22 -> ll(-822293429, var9 ^ -27909608);
            case 23 -> ll(-822293432, var9 ^ 526874595);
            case 24 -> ll(-822293431, var9 ^ 1662766036);
            case 25 -> ll(-822293418, var9 ^ -4427299);
            case 26 -> ll(-822293417, var9 ^ 1656154895);
            case 27 -> ll(-822293420, var9 ^ -1190359534);
            case 28 -> ll(-822293419, var9 ^ -322592364);
            case 29 -> ll(-822293422, var9 ^ 1663124332);
            case 30 -> ll(-822293421, var9 ^ 1717054717);
            case 31 -> ll(-822293424, var9 ^ 1355031572);
            case 32 -> ll(-822293423, var9 ^ 415898648);
            case 33 -> ll(-822293410, var9 ^ -46271202);
            case 34 -> ll(-822293409, var9 ^ -713578756);
            case 35 -> ll(-822293412, var9 ^ 26730413);
            case 36 -> ll(-822293411, var9 ^ 246809430);
            case 37 -> ll(-822293414, var9 ^ 732362517);
            case 38 -> ll(-822293413, var9 ^ -665221884);
            case 39 -> ll(-822293416, var9 ^ -934239123);
            case 40 -> ll(-822293415, var9 ^ 1400283384);
            case 41 -> ll(-822293466, var9 ^ -260263199);
            case 42 -> ll(-822293465, var9 ^ -1431583864);
            case 43 -> ll(-822293468, var9 ^ 617922760);
            case 44 -> ll(-822293467, var9 ^ -352630248);
            case 45 -> ll(-822293470, var9 ^ 586648788);
            case 46 -> ll(-822293469, var9 ^ 1484206243);
            case 47 -> ll(-822293472, var9 ^ -635790831);
            case 48 -> ll(-822293471, var9 ^ 417375647);
            case 49 -> ll(-822293458, var9 ^ -1231537974);
            case 50 -> 0;
            case 51 -> ll(-822293457, var9 ^ 795904486);
            case 52 -> ll(-822293460, var9 ^ -2126139950);
            case 53 -> ll(-822293459, var9 ^ -2145416983);
            case 54 -> ll(-822293462, var9 ^ 1969736110);
            case 55 -> ll(-822293461, var9 ^ -239566664);
            case 56 -> ll(-822293464, var9 ^ -2128651590);
            case 57 -> ll(-822293463, var9 ^ -353407679);
            case 58 -> ll(-822293450, var9 ^ 460821875);
            case 59 -> ll(-822293449, var9 ^ -409177581);
            case 60 -> ll(-822293452, var9 ^ -1893230305);
            case 61 -> ll(-822293451, var9 ^ 1129611209);
            case 62 -> ll(-822293454, var9 ^ 1283842985);
            case 63 -> ll(-822293453, var9 ^ -2094326981);
            case 64 -> ll(-822293456, var9 ^ -844576248);
            case 65 -> ll(-822293455, var9 ^ -793174777);
            case 66 -> ll(-822293442, var9 ^ -995994128);
            case 67 -> ll(-822293441, var9 ^ 1621197059);
            case 68 -> ll(-822293444, var9 ^ 826323547);
            case 69 -> ll(-822293443, var9 ^ 1897275019);
            case 70 -> ll(-822293446, var9 ^ -1481365241);
            case 71 -> ll(-822293445, var9 ^ 2097925664);
            case 72 -> ll(-822293448, var9 ^ 573914697);
            case 73 -> ll(-822293447, var9 ^ 957217919);
            case 74 -> ll(-822293498, var9 ^ -1477505907);
            case 75 -> ll(-822293497, var9 ^ -1562575371);
            case 76 -> ll(-822293500, var9 ^ -1598136121);
            case 77 -> ll(-822293499, var9 ^ 1659540165);
            case 78 -> 4;
            case 79 -> ll(-822293502, var9 ^ 2127991824);
            case 80 -> ll(-822293501, var9 ^ -104539359);
            case 81 -> ll(-822293504, var9 ^ 802119170);
            case 82 -> ll(-822293503, var9 ^ 2027373767);
            case 83 -> ll(-822293490, var9 ^ 420144876);
            case 84 -> ll(-822293489, var9 ^ -1460714441);
            case 85 -> ll(-822293492, var9 ^ 2124981827);
            case 86 -> ll(-822293491, var9 ^ 1084973544);
            case 87 -> ll(-822293494, var9 ^ -657018588);
            case 88 -> ll(-822293493, var9 ^ 1316705353);
            case 89 -> ll(-822293496, var9 ^ 1214389390);
            case 90 -> ll(-822293495, var9 ^ -643317833);
            case 91 -> ll(-822293482, var9 ^ -1417579188);
            case 92 -> ll(-822293481, var9 ^ -2015783624);
            case 93 -> ll(-822293484, var9 ^ -931498900);
            case 94 -> 5;
            case 95 -> ll(-822293483, var9 ^ 1766808747);
            case 96 -> ll(-822293486, var9 ^ 2054941047);
            case 97 -> ll(-822293485, var9 ^ -645987005);
            case 98 -> ll(-822293488, var9 ^ -1412563031);
            case 99 -> ll(-822293487, var9 ^ 181537482);
            case 100 -> ll(-822293474, var9 ^ -1917528993);
            case 101 -> ll(-822293473, var9 ^ 747699077);
            case 102 -> ll(-822293476, var9 ^ 2135458219);
            case 103 -> ll(-822293475, var9 ^ -593932918);
            case 104 -> ll(-822293478, var9 ^ -327329974);
            case 105 -> ll(-822293477, var9 ^ 491245711);
            case 106 -> ll(-822293480, var9 ^ 552891953);
            case 107 -> ll(-822293479, var9 ^ 166466891);
            case 108 -> ll(-822293274, var9 ^ 722209994);
            case 109 -> ll(-822293273, var9 ^ -170158639);
            case 110 -> ll(-822293276, var9 ^ 22192388);
            case 111 -> ll(-822293275, var9 ^ -794656050);
            case 112 -> ll(-822293278, var9 ^ 1670703804);
            case 113 -> ll(-822293277, var9 ^ 344261409);
            case 114 -> ll(-822293280, var9 ^ -303404676);
            case 115 -> ll(-822293279, var9 ^ -1768818121);
            case 116 -> ll(-822293266, var9 ^ -1790494294);
            case 117 -> ll(-822293265, var9 ^ 1595101979);
            case 118 -> ll(-822293268, var9 ^ -1734386142);
            case 119 -> ll(-822293267, var9 ^ -1493711627);
            case 120 -> ll(-822293270, var9 ^ -409854984);
            case 121 -> ll(-822293269, var9 ^ -1059310189);
            case 122 -> ll(-822293272, var9 ^ 1835665710);
            case 123 -> ll(-822293271, var9 ^ -1144445193);
            case 124 -> ll(-822293258, var9 ^ 194903260);
            case 125 -> ll(-822293257, var9 ^ -597523900);
            case 126 -> ll(-822293260, var9 ^ -941561448);
            case 127 -> ll(-822293259, var9 ^ -831404100);
            case 128 -> ll(-822293262, var9 ^ 676451398);
            case 129 -> ll(-822293261, var9 ^ 131913191);
            case 130 -> ll(-822293264, var9 ^ 118008924);
            case 131 -> ll(-822293263, var9 ^ -722740253);
            case 132 -> ll(-822293250, var9 ^ 1761009417);
            case 133 -> ll(-822293249, var9 ^ -77804025);
            case 134 -> ll(-822293252, var9 ^ -851279534);
            case 135 -> ll(-822293251, var9 ^ 2036976955);
            case 136 -> ll(-822293254, var9 ^ 2037325147);
            case 137 -> ll(-822293253, var9 ^ 1917947787);
            case 138 -> ll(-822293256, var9 ^ -1494792398);
            case 139 -> 1;
            case 140 -> ll(-822293255, var9 ^ -1878557521);
            case 141 -> ll(-822293306, var9 ^ -1133903451);
            case 142 -> ll(-822293305, var9 ^ 500856117);
            case 143 -> ll(-822293308, var9 ^ -428021729);
            case 144 -> ll(-822293307, var9 ^ 1768027722);
            case 145 -> ll(-822293310, var9 ^ 501031921);
            case 146 -> ll(-822293309, var9 ^ 1837398257);
            case 147 -> ll(-822293312, var9 ^ 923527157);
            case 148 -> ll(-822293311, var9 ^ 2024239291);
            case 149 -> ll(-822293298, var9 ^ -1301594583);
            case 150 -> ll(-822293297, var9 ^ -178991218);
            case 151 -> ll(-822293300, var9 ^ 1081001820);
            case 152 -> ll(-822293299, var9 ^ -496733903);
            case 153 -> ll(-822293302, var9 ^ 1715680713);
            case 154 -> ll(-822293301, var9 ^ -1854483685);
            case 155 -> ll(-822293304, var9 ^ -1981679828);
            case 156 -> ll(-822293303, var9 ^ -1723720561);
            case 157 -> ll(-822293290, var9 ^ -783490580);
            case 158 -> ll(-822293289, var9 ^ -931783693);
            case 159 -> ll(-822293292, var9 ^ 1487609942);
            case 160 -> ll(-822293291, var9 ^ -1699997329);
            case 161 -> ll(-822293294, var9 ^ 216073636);
            case 162 -> ll(-822293293, var9 ^ 75929677);
            case 163 -> ll(-822293296, var9 ^ -2055614041);
            case 164 -> ll(-822293295, var9 ^ 169321040);
            case 165 -> ll(-822293282, var9 ^ 726479447);
            case 166 -> ll(-822293281, var9 ^ 493055925);
            case 167 -> ll(-822293284, var9 ^ -1373043211);
            case 168 -> ll(-822293283, var9 ^ -67036586);
            case 169 -> ll(-822293286, var9 ^ 299698084);
            case 170 -> ll(-822293285, var9 ^ -577176569);
            case 171 -> ll(-822293288, var9 ^ -679011823);
            case 172 -> ll(-822293287, var9 ^ -848347218);
            case 173 -> ll(-822293338, var9 ^ -889156822);
            case 174 -> ll(-822293337, var9 ^ -1593641847);
            case 175 -> ll(-822293340, var9 ^ -339255125);
            case 176 -> ll(-822293339, var9 ^ -1333564806);
            case 177 -> ll(-822293342, var9 ^ -1608875676);
            case 178 -> ll(-822293341, var9 ^ 1627930600);
            case 179 -> ll(-822293344, var9 ^ 360183143);
            case 180 -> ll(-822293343, var9 ^ -964420551);
            case 181 -> ll(-822293330, var9 ^ -1327539002);
            case 182 -> ll(-822293329, var9 ^ -1599001393);
            case 183 -> ll(-822293332, var9 ^ 96043738);
            case 184 -> ll(-822293331, var9 ^ 350768193);
            case 185 -> ll(-822293334, var9 ^ -562294145);
            case 186 -> ll(-822293333, var9 ^ -797985874);
            case 187 -> ll(-822293336, var9 ^ 7024876);
            case 188 -> ll(-822293335, var9 ^ -579862323);
            case 189 -> ll(-822293322, var9 ^ -987446377);
            case 190 -> ll(-822293321, var9 ^ -1710886498);
            case 191 -> ll(-822293324, var9 ^ 1515415592);
            case 192 -> ll(-822293323, var9 ^ -1979805843);
            case 193 -> ll(-822293326, var9 ^ 2093526844);
            case 194 -> ll(-822293325, var9 ^ -590379116);
            case 195 -> ll(-822293328, var9 ^ -394518865);
            case 196 -> ll(-822293327, var9 ^ 244242809);
            case 197 -> ll(-822293314, var9 ^ -308089496);
            case 198 -> ll(-822293313, var9 ^ -1451586118);
            case 199 -> 2;
            case 200 -> ll(-822293316, var9 ^ -836176889);
            case 201 -> ll(-822293315, var9 ^ 1279769107);
            case 202 -> ll(-822293318, var9 ^ 280162905);
            case 203 -> ll(-822293317, var9 ^ -1407043258);
            case 204 -> ll(-822293320, var9 ^ 1770734700);
            case 205 -> ll(-822293319, var9 ^ -1585867345);
            case 206 -> ll(-822293370, var9 ^ 944786101);
            case 207 -> ll(-822293369, var9 ^ -419347739);
            case 208 -> ll(-822293372, var9 ^ 1990793343);
            case 209 -> ll(-822293371, var9 ^ -2079783090);
            case 210 -> ll(-822293374, var9 ^ 840806094);
            case 211 -> ll(-822293373, var9 ^ 604070176);
            case 212 -> ll(-822293376, var9 ^ 319424298);
            case 213 -> ll(-822293375, var9 ^ -1023083241);
            case 214 -> ll(-822293362, var9 ^ -2058709523);
            case 215 -> ll(-822293361, var9 ^ -397605270);
            case 216 -> ll(-822293364, var9 ^ 81714069);
            case 217 -> ll(-822293363, var9 ^ -1832333502);
            case 218 -> ll(-822293366, var9 ^ 747209122);
            case 219 -> ll(-822293365, var9 ^ 71246686);
            case 220 -> ll(-822293368, var9 ^ -771913594);
            case 221 -> ll(-822293367, var9 ^ 558338366);
            case 222 -> ll(-822293354, var9 ^ -1827521489);
            case 223 -> ll(-822293353, var9 ^ 1568213227);
            case 224 -> ll(-822293356, var9 ^ -1735515817);
            case 225 -> ll(-822293355, var9 ^ -541956149);
            case 226 -> ll(-822293358, var9 ^ 99950169);
            case 227 -> ll(-822293357, var9 ^ -173153582);
            case 228 -> ll(-822293360, var9 ^ 1174537621);
            case 229 -> ll(-822293359, var9 ^ -530284648);
            case 230 -> ll(-822293346, var9 ^ 403211626);
            case 231 -> ll(-822293345, var9 ^ 1567830437);
            case 232 -> ll(-822293348, var9 ^ 495153042);
            case 233 -> ll(-822293347, var9 ^ 1873363019);
            case 234 -> ll(-822293350, var9 ^ -1166095578);
            case 235 -> ll(-822293349, var9 ^ -519774044);
            case 236 -> ll(-822293352, var9 ^ -1089586502);
            case 237 -> ll(-822293351, var9 ^ -1005411304);
            case 238 -> ll(-822293146, var9 ^ 1601037211);
            case 239 -> ll(-822293145, var9 ^ 502924705);
            case 240 -> ll(-822293148, var9 ^ 1775098873);
            case 241 -> ll(-822293147, var9 ^ 621870800);
            case 242 -> ll(-822293150, var9 ^ 142888746);
            case 243 -> ll(-822293149, var9 ^ -1767514843);
            case 244 -> ll(-822293152, var9 ^ -495248910);
            case 245 -> ll(-822293151, var9 ^ -1373850430);
            case 246 -> ll(-822293138, var9 ^ -500273604);
            case 247 -> ll(-822293137, var9 ^ 431000572);
            case 248 -> ll(-822293140, var9 ^ -378237921);
            case 249 -> ll(-822293139, var9 ^ -1462892780);
            case 250 -> ll(-822293142, var9 ^ 26340076);
            case 251 -> ll(-822293141, var9 ^ -393344254);
            case 252 -> ll(-822293144, var9 ^ 579964791);
            case 253 -> ll(-822293143, var9 ^ -314621395);
            case 254 -> ll(-822293130, var9 ^ 2092567944);
            default -> ll(-822293129, var9 ^ 1706078507);
         };
         int var5 = (var1 & ll(-822293132, var9 ^ 211875523)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(-822293131, var9 ^ -1503802914)) >>> ll(-822293134, var9 ^ 421159721)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(-822293133, var9 ^ 517948575);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(-822293136, var9 ^ -1079253446);
            }
         }

         ll[var2] = new String(var3).intern();
      }

      return ll[var2];
   }
}
