package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIIlIl {
   l,
   III,
   IIl;
   private static final String[] I;
   private static final Object[] lII;
   private static final int[] IlI;
   private final IIIlIlIl II;
   private static String[] Il;
   private static final String[] Ill;
   private static final IIIlIl[] lI;
   private static final String[] ll;

   private static void I() {
      int var0 = 1883213185;
      Il[0] = l(Il(ll(1408624968, var0 ^ -590569136), ll(1408624969, var0 ^ -294084264)).toCharArray(), 79270L, ll(1408624970, var0 ^ -467248268));
      Il[1] = l(Il(ll(1408624971, var0 ^ 975703501), ll(1408624972, var0 ^ 1424598234)).toCharArray(), 94387L, ll(1408624973, var0 ^ -1032850336));
      Il[2] = l(Il(ll(1408624974, var0 ^ -1808556020), ll(1408624975, var0 ^ -1500847604)).toCharArray(), 75546L, ll(1408624960, var0 ^ -490015637));
      Il[3] = l(Il(ll(1408624961, var0 ^ -1113054953), ll(1408624962, var0 ^ 542600191)).toCharArray(), 18320L, ll(1408624963, var0 ^ 206221159));
      Il[4] = l(Il(ll(1408624964, var0 ^ -1736528046), ll(1408624965, var0 ^ -497441492)).toCharArray(), 43303L, ll(1408624966, var0 ^ 1453243816));
      Il[5] = l(Il(ll(1408624967, var0 ^ -649248087), ll(1408624984, var0 ^ 128703843)).toCharArray(), 88538L, ll(1408624985, var0 ^ 1536839414));
   }

   private static String l(char[] var0, long var1, int var3) {
      int var4 = ll(1408624986, -107058673 ^ -1207215394) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(1408624987, -107058673 ^ -851025993);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -946053629;
      int var10001 = "\u0016뢅穠䴸왊ⓞ峨߆\ud8ac沲\ufdc8쎀쉡쮧릢義9☴왋罛써埇\ue0ef\u000e謙\ud910漯䊆뤇⻘⎵䙾̢龥둝\uf068흸䎜".length();
      short var12 = 21644;
      int var8 = var10001;
      String var7 = "\u0016뢅穠䴸왊ⓞ峨߆\ud8ac沲\ufdc8쎀쉡쮧릢義9☴왋罛써埇\ue0ef\u000e謙\ud910漯䊆뤇⻘⎵䙾̢龥둝\uf068흸䎜";
      int var11 = 0;
      String[] var10000 = new String[2];
      int var10 = 0;
      String[] var9 = var10000;

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 58;
               case 1 -> 38;
               case 2 -> 9;
               case 3 -> 133;
               case 4 -> 11;
               case 5 -> 199;
               case 6 -> 26;
            }) ^ var16;
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

      Ill = var9;
      lII = new Object[var9.length];
      byte var22 = 0;
      int var25 = 0;
      byte[] var10002 = "É\u0003]»û·d(È\u0092G\u0081/çñ&A&7±\u009a«¶\u009a\u0081ü\\æ³Esùs\u000f\u0003\b¨gÝ÷5\u0098ÉC'1\u0019T\u008d±S´÷\u0096\u0087\u0089u\u0017Å£Ì\u0082¾K\u0012dêãq³\f\u0096|*¤\u0002Q(Jî§\u0098íW´^ñ\u0010\u009c\u008fù\u0003Pº\u0018¾|>±ÆvàG\u008aã\u0007ÍLÍd<Ò\u008b»t}ÝÕ\u0012\u008bÜ]\u000b+·\f£.u¡µOÏ\u0014b9´ó±áë\u008a$\ruäV]´\u0011á½\u0088\ræ\u001evÓ\u0019³Å\u001bì&×3&Zf²c¬y\u0017n\b¦R8ñÚÌÒlÛ\u0019ÝJ\u009d»\u0002lìh\rÑfz\u0098ÒË*\u000b+]\n0¨Ü\u008b\u001c+a6Óv®,%\u0017»Þ\u0003#_\u009a\r\u00adß\u009e\u0014]Dý\u001d#Âç\u0087áøµÀ/A\u001b£ÃÃ\u009alü·¾3Ad§sÒ\u0098fØ¯/\u0006\u0087d`Ðó q\u0094ª\u0007u\u0098á¸\bt²&é/\u001d¸E/;aØ\u0000ø\bmSÎ[p\u0097å±Á\u000fr,eè\u008d»&Ã\u0017?#qH\u0082®sùÃ:';WA\u0094wâ«RgE\u000e\u009bRe\u0088\n<r9\u0011/\u0010\u0001K\u000fX'ïWØ\u0007ú\u0092&ªÒ\u0093)Ô©²Ûð·,ÎJ%Ô-ôÁ-Ì)W\u0004`üQ§z( 07Ô\u000b\u001e\u000eXÁ\u0099ÄO\u0081C·LØ\u00adv\u0095\u0082\u001aI\u0014âþ&àf\u0080PÒDAøêg\u000e\u0089åM.}ÖZÔO6üi9\u0016v\u008døqsñ\u001d\u008f\u0091ÆÛ%\u0099\u0004\u0093t\u008f\u0083\u000eí\u0015K2fúlOð\b`hþÞå\u0084°{\u0098}b\u008d\u009bê4ð\u0083\u001752\u0015Ç;ö4aöùvÓ*E¡k\u008fþ[Ëûp×på*\ti\u009bþO\u0000èÜÍU\u0002%ö\u0018îç·)H¦Ì\u0096A\u0099©\fÙ\u008cM\u0003zÛ3¸´\u0011q¡Ê\f?o}+\u0013#Ì\u0089èc\u0084gF\u001cÌ\u0017¹ý\u008eµTGR\bôÎP|ái1[ \u001aôÏ¯\u001cí}4`\u0010½=P;`0Ù\u0016ºÏ7ë£@ªU\u0097\f\n<ÔÂ\r4\u0000\u0082=*\u0001À\u008a¶Ã[ö%ÏÉÀØ\u009cDPï\u00949â\u001cþj\u000e8éÀ¸m\u008aº\u008dÊV\u0017âÂ cê\u0012émÚ\u001bêT8 ]p±Ó\u009b3²PGU\u007f\u0089dï\u009d¼\u0013%R-\u0099î\u0014\u0001x]¸üÄ}\u0017-\u009cà\u0007ûoà¶¯¶·ûªS\rB\u0091V\u0000»³\u0002×5A¼ÈÛnöã\fÂ\u0000ñö/É\u008an\u001a \u009f;ç51ÐÔÆõøÌ\u008dÆ¹µLïZç9\u0012wyÎ\u008d®áÄ\u009cÈÔ\u001fÊ\u009e\u0082'Í\u0087@H\\ ³¬oì»¸nfh?ÛM\u001f\u0017\u0092\u000eþ´¦\u0011®M¾%ìðôæb\u0093\u008eñ ý\u0018y¯\u0015j\rå\u0010\u0080\u009d\u0002ø±µÐÕ¹\u0086\u0088=F}\\©r\u0015\u0084\u0010âzsã~SN\u008d¿TÕA-\u000bLXí\u0098}5\r\u0080*\u0089ù!\u0011*\u000bî\u0012QnqJðÂ\u001e\u0094ÆMnOtbN\u0007X\u008b¼>FeZµ\u0093=åû{aË\u0015\u0000\u00175èÐ\u009a/ÁÀ½7¢_R\u009b\u001eW\u0097*Â\nÅØË¢\u0001b²Õ\u0007¯\u0089\u009fV«\u0085Vi\u0015!\u0000\u009aOÒ·º\u0019uE\u000e\u0090Ù\u009f×\t@7\tÚ\u0002Fkù\u0083\u0096\u0080Ð½\u0010\u001bÞ\u0084ýw\u0098}&âc{â/J\u009c]Y«2oÙ\u0085\u0083\u001e¬'¸Å\u009dF\u000e\u001a;»\u0082JTâþ\u0095¸=\u000bH±È7\u0010öá1C\u0099\u000f½\u009b\u0016\u00ad\u0084T\bô5jÉXR\u0097ÛJ^Éýpv»¼_Ý\u0002Ü\u0089\u001fLËÊ\u0095ø¡áÐ4à\u0015ðb\u0003b¹÷X\u0081¥KâK<g\u001d÷É\u009a¥öù\u0087U\u0097¸\u0005Üg1\u0092æ¦«FÑq\u0010õ\u0091x\u0084\u0082\u008c©NZ%\u0083G)ÍW6t6Zz¥°î}¬+\u0096\u001cí<¼ç¼?Jï\u00ad±î\u001c,1°É'úö\u001c_\u001d¡ËÓ¨\u008b"
         .getBytes("ISO-8859-1");
      IlI = new int[292];

      int var56;
      do {
         IlI[var22] = ((var10002[var25] & 255) << 24 | (var10002[var25 + 1] & 255) << 16 | (var10002[var25 + 2] & 255) << 8 | var10002[var25 + 3] & 255)
            ^ -906360070;
         var22 += 1;
         var56 = var25 + 4;
         var25 += 4;
      } while (var56 < var10002.length);

      String[] var5 = new String[ll(1408624734, var17 ^ -1298549215)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III((byte)-4, 73, 1774034161, 220879675, 21173, '㘅')).length();
      int var1 = 3;
      int var19 = -1;

      label103:
      while (true) {
         int var23 = ll(1408624735, var17 ^ 653175897);
         String var28 = var2.substring(++var19, var19 + var1);
         byte var40 = -1;

         while (true) {
            label98: {
               char[] var58 = var28.toCharArray();
               int var70 = var58.length;
               int var6 = 0;
               var56 = var23;
               var45 = var58;
               var25 = var70;
               char[] var82;
               int var89;
               if (var70 <= 1) {
                  var82 = var58;
                  var70 = var23;
                  var89 = var6;
               } else {
                  var56 = var23;
                  var25 = var70;
                  if (var70 <= var6) {
                     break label98;
                  }

                  var82 = var58;
                  var70 = var23;
                  var89 = var6;
               }

               while (true) {
                  var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % ll(1408624723, var17 ^ -657877061)) {
                     case 0 -> ll(1408624724, var17 ^ -541062359);
                     case 1 -> ll(1408624725, var17 ^ -1098834843);
                     case 2 -> ll(1408624726, var17 ^ 1171267568);
                     case 3 -> ll(1408624727, var17 ^ 1304531234);
                     case 4 -> ll(1408624744, var17 ^ -1103097552);
                     case 5 -> ll(1408624745, var17 ^ 1800133230);
                     default -> ll(1408624746, var17 ^ -1103938240);
                  });
                  var6++;
                  if (var56 == 0) {
                     var89 = var56;
                     var82 = var45;
                     var70 = var56;
                  } else {
                     if (var25 <= var6) {
                        break;
                     }

                     var82 = var45;
                     var70 = var56;
                     var89 = var6;
                  }
               }
            }

            String var63 = new String(var45).intern();
            switch (var40) {
               case 0:
                  var5[var3++] = var63;
                  if ((var19 += var1) >= var4) {
                     ll = var5;
                     I = new String[ll(1408624722, var17 ^ -1810362097)];
                     Il = new String[ll(1408624747, var17 ^ 1774161895)];
                     I();
                     l = new IIIlIl(IlIIllIII.lII(IlIIllIII.lI(Il[0])));
                     IIl = new IIIlIl(IlIIllIII.lII(IlIIllIII.lI(Il[4])));
                     III = new IIIlIl(IlIIllIII.lII(IlIIllIII.lI(Il[5])));
                     lI = II();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var63;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label103;
                  }

                  var4 = (var2 = III((byte)-4, 124, 1074248118, 220879674, (short)-27770, '즬')).length();
                  var1 = ll(1408624720, var17 ^ -332004054);
                  var19 = -1;
            }

            var23 = ll(1408624721, var17 ^ -448401964);
            var28 = var2.substring(++var19, var19 + var1);
            var40 = 0;
         }
      }
   }

   private static IIIlIl[] II() {
      return new IIIlIl[]{l, IIl, III};
   }

   private static String III(byte var0, byte var1, int var2, int var3, short var4, char var5) {
      int var10 = var3 ^ 220879675;
      char[] var9 = Ill[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])lII[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         lII[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 56018;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 30) {
            default -> 236;
            case 1 -> 54;
            case 2 -> 87;
            case 3 -> 2;
            case 4 -> 122;
            case 5 -> 228;
            case 6 -> 72;
            case 7 -> 123;
            case 8 -> 20;
            case 9 -> 155;
            case 10 -> 67;
            case 11 -> 135;
            case 12 -> 190;
            case 13 -> 137;
            case 14 -> 29;
            case 15 -> 42;
            case 16 -> 178;
            case 17 -> 6;
            case 18 -> 212;
            case 19 -> 236;
            case 20 -> 56;
            case 21 -> 10;
            case 22 -> 253;
            case 23 -> 44;
            case 24 -> 127;
            case 25 -> 41;
            case 26 -> 65;
            case 27 -> 242;
            case 28 -> 225;
            case 29 -> 174;
         } ^ 28288 ^ var3 ^ var2 ^ var5 ^ var4 ^ var1 ^ var7 ^ var0);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   private IIIlIl(IIIlIlIl var3) {
      this.II = var3;
   }

   @Override
   public String toString() {
      return this.II.llIl();
   }

   private static String Il(int var0, int var1) {
      int var9 = 773673839;
      int var2 = (var0 ^ ll(1408624988, var9 ^ -327823548)) & ll(1408624989, var9 ^ 5036591);
      if (I[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & ll(1408624990, var9 ^ -681388737)) {
            case 0 -> ll(1408624991, var9 ^ 458699948);
            case 1 -> ll(1408624976, var9 ^ 936615238);
            case 2 -> ll(1408624977, var9 ^ 1024289671);
            case 3 -> ll(1408624978, var9 ^ -1461001874);
            case 4 -> ll(1408624979, var9 ^ -2037837644);
            case 5 -> ll(1408624980, var9 ^ -1068083085);
            case 6 -> ll(1408624981, var9 ^ -1774698980);
            case 7 -> ll(1408624982, var9 ^ -1750063130);
            case 8 -> ll(1408624983, var9 ^ -52326406);
            case 9 -> ll(1408625000, var9 ^ 1045207426);
            case 10 -> ll(1408625001, var9 ^ -2064036140);
            case 11 -> ll(1408625002, var9 ^ -14770908);
            case 12 -> ll(1408625003, var9 ^ -1603860259);
            case 13 -> ll(1408625004, var9 ^ 1040808600);
            case 14 -> ll(1408625005, var9 ^ -209637);
            case 15 -> ll(1408625006, var9 ^ -1008678285);
            case 16 -> ll(1408625007, var9 ^ 1027487217);
            case 17 -> ll(1408624992, var9 ^ -1896431405);
            case 18 -> ll(1408624993, var9 ^ -1663169937);
            case 19 -> ll(1408624994, var9 ^ 761221107);
            case 20 -> ll(1408624995, var9 ^ 855261937);
            case 21 -> ll(1408624996, var9 ^ -306244567);
            case 22 -> ll(1408624997, var9 ^ -1860043064);
            case 23 -> ll(1408624998, var9 ^ -1862995670);
            case 24 -> ll(1408624999, var9 ^ -698994971);
            case 25 -> ll(1408625016, var9 ^ -1484447312);
            case 26 -> ll(1408625017, var9 ^ 764916786);
            case 27 -> ll(1408625018, var9 ^ -2134431994);
            case 28 -> ll(1408625019, var9 ^ 384244784);
            case 29 -> ll(1408625020, var9 ^ -1754910568);
            case 30 -> ll(1408625021, var9 ^ 719060782);
            case 31 -> ll(1408625022, var9 ^ -440334063);
            case 32 -> ll(1408625023, var9 ^ -265081084);
            case 33 -> ll(1408625008, var9 ^ 343351777);
            case 34 -> ll(1408625009, var9 ^ -1804388316);
            case 35 -> ll(1408625010, var9 ^ 252719490);
            case 36 -> ll(1408625011, var9 ^ -1995789490);
            case 37 -> ll(1408625012, var9 ^ -1286018027);
            case 38 -> ll(1408625013, var9 ^ 183930716);
            case 39 -> ll(1408625014, var9 ^ -2005450648);
            case 40 -> ll(1408625015, var9 ^ -61661336);
            case 41 -> ll(1408624904, var9 ^ 793403174);
            case 42 -> ll(1408624905, var9 ^ -745802575);
            case 43 -> ll(1408624906, var9 ^ 1693166397);
            case 44 -> 4;
            case 45 -> ll(1408624907, var9 ^ 725475299);
            case 46 -> ll(1408624908, var9 ^ 981042853);
            case 47 -> ll(1408624909, var9 ^ 1047907778);
            case 48 -> ll(1408624910, var9 ^ 1134141182);
            case 49 -> ll(1408624911, var9 ^ -1564331601);
            case 50 -> ll(1408624896, var9 ^ 247601068);
            case 51 -> ll(1408624897, var9 ^ -1813130229);
            case 52 -> ll(1408624898, var9 ^ 650044089);
            case 53 -> ll(1408624899, var9 ^ 997902597);
            case 54 -> ll(1408624900, var9 ^ -1964876042);
            case 55 -> ll(1408624901, var9 ^ 772120902);
            case 56 -> ll(1408624902, var9 ^ 1831746315);
            case 57 -> ll(1408624903, var9 ^ 1755079844);
            case 58 -> ll(1408624920, var9 ^ -442575543);
            case 59 -> ll(1408624921, var9 ^ 1909069715);
            case 60 -> ll(1408624922, var9 ^ 175725544);
            case 61 -> 0;
            case 62 -> ll(1408624923, var9 ^ -524334171);
            case 63 -> ll(1408624924, var9 ^ 1165393479);
            case 64 -> ll(1408624925, var9 ^ -1008267127);
            case 65 -> 5;
            case 66 -> ll(1408624926, var9 ^ 1929118597);
            case 67 -> ll(1408624927, var9 ^ 1252401991);
            case 68 -> ll(1408624912, var9 ^ 1812101906);
            case 69 -> ll(1408624913, var9 ^ 1276624511);
            case 70 -> ll(1408624914, var9 ^ -515915991);
            case 71 -> ll(1408624915, var9 ^ -1622892849);
            case 72 -> ll(1408624916, var9 ^ -1151729609);
            case 73 -> ll(1408624917, var9 ^ 29948040);
            case 74 -> ll(1408624918, var9 ^ -1087633743);
            case 75 -> ll(1408624919, var9 ^ 1656367270);
            case 76 -> ll(1408624936, var9 ^ -1212380174);
            case 77 -> ll(1408624937, var9 ^ 1674386620);
            case 78 -> ll(1408624938, var9 ^ -1612303866);
            case 79 -> ll(1408624939, var9 ^ 321697188);
            case 80 -> ll(1408624940, var9 ^ 74215420);
            case 81 -> ll(1408624941, var9 ^ 120946944);
            case 82 -> ll(1408624942, var9 ^ -563136774);
            case 83 -> ll(1408624943, var9 ^ 1594872325);
            case 84 -> ll(1408624928, var9 ^ -1416909696);
            case 85 -> ll(1408624929, var9 ^ -1716949549);
            case 86 -> ll(1408624930, var9 ^ -1584782673);
            case 87 -> ll(1408624931, var9 ^ -1365245410);
            case 88 -> ll(1408624932, var9 ^ -1648887580);
            case 89 -> ll(1408624933, var9 ^ 2098283942);
            case 90 -> ll(1408624934, var9 ^ 1570480552);
            case 91 -> ll(1408624935, var9 ^ 983490019);
            case 92 -> ll(1408624952, var9 ^ -998446491);
            case 93 -> ll(1408624953, var9 ^ 1853106253);
            case 94 -> ll(1408624954, var9 ^ 1063432120);
            case 95 -> ll(1408624955, var9 ^ -1493670081);
            case 96 -> ll(1408624956, var9 ^ 756498444);
            case 97 -> ll(1408624957, var9 ^ -1142600542);
            case 98 -> 3;
            case 99 -> ll(1408624958, var9 ^ -1254897307);
            case 100 -> ll(1408624959, var9 ^ -74009568);
            case 101 -> ll(1408624944, var9 ^ 694204173);
            case 102 -> ll(1408624945, var9 ^ 2132651863);
            case 103 -> ll(1408624946, var9 ^ 2128558340);
            case 104 -> ll(1408624947, var9 ^ 1880823900);
            case 105 -> ll(1408624948, var9 ^ -1122739554);
            case 106 -> ll(1408624949, var9 ^ 1638436341);
            case 107 -> ll(1408624950, var9 ^ -1005357087);
            case 108 -> ll(1408624951, var9 ^ -1331823765);
            case 109 -> ll(1408625096, var9 ^ -1362680465);
            case 110 -> ll(1408625097, var9 ^ -804035796);
            case 111 -> ll(1408625098, var9 ^ -1557012057);
            case 112 -> ll(1408625099, var9 ^ 1237899925);
            case 113 -> ll(1408625100, var9 ^ -1526031518);
            case 114 -> ll(1408625101, var9 ^ 55304229);
            case 115 -> ll(1408625102, var9 ^ 175408426);
            case 116 -> ll(1408625103, var9 ^ -1839111720);
            case 117 -> ll(1408625088, var9 ^ 825630522);
            case 118 -> ll(1408625089, var9 ^ -238219);
            case 119 -> ll(1408625090, var9 ^ -2115955931);
            case 120 -> ll(1408625091, var9 ^ 918961972);
            case 121 -> ll(1408625092, var9 ^ -2023439209);
            case 122 -> ll(1408625093, var9 ^ -813012365);
            case 123 -> ll(1408625094, var9 ^ -2013620842);
            case 124 -> ll(1408625095, var9 ^ -984057671);
            case 125 -> ll(1408625112, var9 ^ 434493582);
            case 126 -> ll(1408625113, var9 ^ 462540190);
            case 127 -> ll(1408625114, var9 ^ 2058783756);
            case 128 -> ll(1408625115, var9 ^ -1088257231);
            case 129 -> ll(1408625116, var9 ^ -1500505889);
            case 130 -> ll(1408625117, var9 ^ 1531973966);
            case 131 -> ll(1408625118, var9 ^ 1888296078);
            case 132 -> ll(1408625119, var9 ^ 1566040883);
            case 133 -> ll(1408625104, var9 ^ -1605473167);
            case 134 -> ll(1408625105, var9 ^ 511320191);
            case 135 -> ll(1408625106, var9 ^ 2000285322);
            case 136 -> ll(1408625107, var9 ^ 2146283122);
            case 137 -> ll(1408625108, var9 ^ 1642916951);
            case 138 -> ll(1408625109, var9 ^ -47286528);
            case 139 -> ll(1408625110, var9 ^ 1847780789);
            case 140 -> ll(1408625111, var9 ^ -1821284202);
            case 141 -> ll(1408625128, var9 ^ -1535568436);
            case 142 -> ll(1408625129, var9 ^ 1460881017);
            case 143 -> ll(1408625130, var9 ^ 1929702590);
            case 144 -> ll(1408625131, var9 ^ 644322975);
            case 145 -> ll(1408625132, var9 ^ -2118435917);
            case 146 -> ll(1408625133, var9 ^ -1983033501);
            case 147 -> ll(1408625134, var9 ^ 1493451251);
            case 148 -> ll(1408625135, var9 ^ 1342666970);
            case 149 -> ll(1408625120, var9 ^ 1806720219);
            case 150 -> ll(1408625121, var9 ^ -1737089092);
            case 151 -> ll(1408625122, var9 ^ 464157026);
            case 152 -> ll(1408625123, var9 ^ -1031159037);
            case 153 -> ll(1408625124, var9 ^ -134346340);
            case 154 -> ll(1408625125, var9 ^ 1718927938);
            case 155 -> ll(1408625126, var9 ^ 1251307783);
            case 156 -> ll(1408625127, var9 ^ -1222028984);
            case 157 -> ll(1408625144, var9 ^ 1718734036);
            case 158 -> ll(1408625145, var9 ^ -1333605202);
            case 159 -> 1;
            case 160 -> ll(1408625146, var9 ^ -463758423);
            case 161 -> ll(1408625147, var9 ^ -507633188);
            case 162 -> ll(1408625148, var9 ^ -625267608);
            case 163 -> ll(1408625149, var9 ^ -118490273);
            case 164 -> ll(1408625150, var9 ^ 173138995);
            case 165 -> ll(1408625151, var9 ^ 622579533);
            case 166 -> ll(1408625136, var9 ^ -1980900089);
            case 167 -> ll(1408625137, var9 ^ 1680123487);
            case 168 -> ll(1408625138, var9 ^ 1372435448);
            case 169 -> ll(1408625139, var9 ^ -1395122924);
            case 170 -> ll(1408625140, var9 ^ -1624516210);
            case 171 -> ll(1408625141, var9 ^ -2023691656);
            case 172 -> ll(1408625142, var9 ^ -22953057);
            case 173 -> ll(1408625143, var9 ^ -1395376436);
            case 174 -> ll(1408625032, var9 ^ 841195888);
            case 175 -> ll(1408625033, var9 ^ -1440108533);
            case 176 -> ll(1408625034, var9 ^ -1611471300);
            case 177 -> ll(1408625035, var9 ^ -909450867);
            case 178 -> ll(1408625036, var9 ^ 195391729);
            case 179 -> ll(1408625037, var9 ^ -129940717);
            case 180 -> ll(1408625038, var9 ^ -262847845);
            case 181 -> ll(1408625039, var9 ^ 601028561);
            case 182 -> ll(1408625024, var9 ^ 1425718876);
            case 183 -> ll(1408625025, var9 ^ -1252422986);
            case 184 -> ll(1408625026, var9 ^ -442461641);
            case 185 -> ll(1408625027, var9 ^ -1491216261);
            case 186 -> ll(1408625028, var9 ^ 696165000);
            case 187 -> ll(1408625029, var9 ^ 1796224014);
            case 188 -> ll(1408625030, var9 ^ -453491028);
            case 189 -> ll(1408625031, var9 ^ -1359106898);
            case 190 -> ll(1408625048, var9 ^ 1226153394);
            case 191 -> ll(1408625049, var9 ^ -1690790442);
            case 192 -> ll(1408625050, var9 ^ -1009751389);
            case 193 -> ll(1408625051, var9 ^ 390356539);
            case 194 -> ll(1408625052, var9 ^ -805450112);
            case 195 -> ll(1408625053, var9 ^ 940462659);
            case 196 -> ll(1408625054, var9 ^ 90215299);
            case 197 -> ll(1408625055, var9 ^ -1632894522);
            case 198 -> ll(1408625040, var9 ^ 129352070);
            case 199 -> ll(1408625041, var9 ^ 920134018);
            case 200 -> ll(1408625042, var9 ^ 1633998198);
            case 201 -> ll(1408625043, var9 ^ 1523001146);
            case 202 -> ll(1408625044, var9 ^ 1505510799);
            case 203 -> ll(1408625045, var9 ^ 18738771);
            case 204 -> ll(1408625046, var9 ^ -550805116);
            case 205 -> ll(1408625047, var9 ^ 77156070);
            case 206 -> ll(1408625064, var9 ^ 1286973409);
            case 207 -> ll(1408625065, var9 ^ 1974159711);
            case 208 -> ll(1408625066, var9 ^ -25292380);
            case 209 -> ll(1408625067, var9 ^ -1332326924);
            case 210 -> ll(1408625068, var9 ^ 1592605590);
            case 211 -> ll(1408625069, var9 ^ -1556236763);
            case 212 -> ll(1408625070, var9 ^ -1976725145);
            case 213 -> ll(1408625071, var9 ^ -374178284);
            case 214 -> ll(1408625056, var9 ^ 1438301125);
            case 215 -> ll(1408625057, var9 ^ -1981289991);
            case 216 -> ll(1408625058, var9 ^ -2142294663);
            case 217 -> ll(1408625059, var9 ^ -113759368);
            case 218 -> ll(1408625060, var9 ^ -1032684898);
            case 219 -> ll(1408625061, var9 ^ -826587723);
            case 220 -> ll(1408625062, var9 ^ 1793963539);
            case 221 -> ll(1408625063, var9 ^ -1722116596);
            case 222 -> ll(1408625080, var9 ^ 1051206217);
            case 223 -> ll(1408625081, var9 ^ -1837958299);
            case 224 -> ll(1408625082, var9 ^ 198845769);
            case 225 -> ll(1408625083, var9 ^ 1235961629);
            case 226 -> ll(1408625084, var9 ^ -931418934);
            case 227 -> ll(1408625085, var9 ^ -151177259);
            case 228 -> ll(1408625086, var9 ^ -821011611);
            case 229 -> ll(1408625087, var9 ^ 919326230);
            case 230 -> ll(1408625072, var9 ^ 806290185);
            case 231 -> ll(1408625073, var9 ^ -676301535);
            case 232 -> ll(1408625074, var9 ^ 2038625581);
            case 233 -> ll(1408625075, var9 ^ -923565943);
            case 234 -> ll(1408625076, var9 ^ -215436979);
            case 235 -> ll(1408625077, var9 ^ 1173821336);
            case 236 -> ll(1408625078, var9 ^ -911771573);
            case 237 -> ll(1408625079, var9 ^ -1250388816);
            case 238 -> ll(1408624712, var9 ^ 1084595300);
            case 239 -> ll(1408624713, var9 ^ 2097011481);
            case 240 -> ll(1408624714, var9 ^ 2058269793);
            case 241 -> ll(1408624715, var9 ^ -160023641);
            case 242 -> ll(1408624716, var9 ^ -809949927);
            case 243 -> ll(1408624717, var9 ^ 2122835169);
            case 244 -> ll(1408624718, var9 ^ 427488833);
            case 245 -> ll(1408624719, var9 ^ 354734148);
            case 246 -> ll(1408624704, var9 ^ 1029083519);
            case 247 -> ll(1408624705, var9 ^ -1762659944);
            case 248 -> ll(1408624706, var9 ^ 1419896333);
            case 249 -> ll(1408624707, var9 ^ -569013032);
            case 250 -> ll(1408624708, var9 ^ -1680224988);
            case 251 -> ll(1408624709, var9 ^ -1148244362);
            case 252 -> ll(1408624710, var9 ^ -233147090);
            case 253 -> ll(1408624711, var9 ^ -291057897);
            case 254 -> ll(1408624728, var9 ^ 2005545067);
            default -> 2;
         };
         int var5 = (var1 & ll(1408624729, var9 ^ -2106095411)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(1408624730, var9 ^ 1301643183)) >>> ll(1408624731, var9 ^ -202837591)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(1408624732, var9 ^ 2055195544);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(1408624733, var9 ^ -525599666);
            }
         }

         I[var2] = new String(var3).intern();
      }

      return I[var2];
   }

   private static int ll(int var0, int var1) {
      int var2 = IlI[var0 ^ 1408624968] ^ var1 ^ var0;
      var2 += 60509;
      var2 += 27890;
      var2 -= 23537;
      var2 -= 53455;
      var2 -= 20560;
      var2 += 37324;
      var2 -= 22319;
      return var2 + 19756;
   }

   public static IIIlIl lI(String var0) {
      return Enum.valueOf(IIIlIl.class, var0);
   }
}
