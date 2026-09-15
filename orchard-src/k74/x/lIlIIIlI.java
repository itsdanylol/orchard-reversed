package k74.x;

public enum lIlIIIlI {
   I,
   l,
   lI,
   III;

   private static final String[] Ill;
   private static final int[] IlI;
   private static final String[] II;
   private static final lIlIIIlI[] Il;
   private static final Object[] lII;
   private static final String[] ll;
   private static String[] IIl;

   private static lIlIIIlI[] I() {
      return new lIlIIIlI[]{l, I, lI, III};
   }

   private static void l() {
      int var0 = -1810550415;
      IIl[0] = Il(lI(ll(-831244052, var0 ^ -594331301), ll(-831244051, var0 ^ -666664614)).toCharArray(), 29779L, ll(-831244050, var0 ^ 2006033996));
      IIl[1] = Il(lI(ll(-831244049, var0 ^ 735452330), ll(-831244056, var0 ^ 1440411733)).toCharArray(), 78279L, ll(-831244055, var0 ^ 1382742143));
      IIl[2] = Il(lI(ll(-831244054, var0 ^ -393111185), ll(-831244053, var0 ^ -1114288123)).toCharArray(), 78721L, ll(-831244060, var0 ^ -1866658751));
      IIl[3] = Il(lI(ll(-831244059, var0 ^ -1762808967), ll(-831244058, var0 ^ 171047870)).toCharArray(), 84910L, ll(-831244057, var0 ^ -1760800103));
   }

   private static int ll(int var0, int var1) {
      int var2 = IlI[var0 ^ -831244052] ^ var1 ^ var0;
      var2 -= 33393;
      var2 ^= 54239;
      var2 += 49181;
      var2 += 43826;
      var2 ^= 11930;
      var2 ^= 18626;
      var2 ^= 51522;
      return var2 + 64296;
   }

   public static lIlIIIlI II(String var0) {
      return Enum.valueOf(lIlIIIlI.class, var0);
   }

   private static String III(char var0, char var1, int var2) {
      int var7 = var2 ^ -1520686925;
      char[] var6 = Ill[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])lII[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         lII[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 44683;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ var5 ^ var2 ^ var1 ^ var0 ^ var4);
      }

      return new String(var6).intern();
   }

   private static String Il(char[] var0, long var1, int var3) {
      int var4 = ll(-831244044, 70610235 ^ -2070922746) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & ll(-831244043, 70610235 ^ -207049498);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -1689843509;
      String[] var10000 = new String[2];
      int var16 = 0;
      String[] var15 = var10000;
      short var18 = 19808;
      int var14 = "\u0013\ue189\uda30䋜a苊\udc83卡Ⅹ泩ꉡ껀ゝ㿾⸤\ue236竷쟡騿㠴\u0013왰꼦튩购̙䧆\ue001뛕ꛚ箹妲驹ᦳⱨ쉡\uda5e蘹첁片".length();
      String var13 = "\u0013\ue189\uda30䋜a苊\udc83卡Ⅹ泩ꉡ껀ゝ㿾⸤\ue236竷쟡騿㠴\u0013왰꼦튩购̙䧆\ue001뛕ꛚ箹妲驹ᦳⱨ쉡\uda5e蘹첁片";
      int var17 = 0;

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << '\f') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> '\f') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      Ill = var15;
      lII = new Object[var15.length];
      int var9 = 552183339;
      byte[] var7 = "Yç\u0011ï]45<@HTÒ®¢4\u001eÐ¬\u0087\u00ad\u0099\u0014ùhmå±Ü8á7\u000b!í+9\u0013\u0099\u0083Æ\u008fFIxIC\u0006WÚc\u0006\u0099v¢e\u0095\u001eM\u000bÆÖÕ'\n\u001c?]ÌÖ\u0084\rÖ© N¦\u0092ÙÔ¤îÌ!\u0090Y\u0099\u0095\u0092}éf\u0091\u000f\u0017á°§\u0097\u0015-æÿ0\u0011ü\u0089\u0012ÌD\u009e\u0094qüG[ÅÙqCZ-P\u000e\u0090ÃDâj\tß\u007f SàÇ\fÎ\u008b|+\u0018d.í¥,pÅ~:µZ¦gú\u008f¿cÍ\u0093ú+\u0084îÞÒZÛ\u0094Ckºÿ1ð¾Z;\u001dÐÓwÚcÐ/dìû\u0012¥RË\t0P.\u001eör\u0003(¬y\u0094éßY9\u000fXj\fö}«\u0018ÍÄ®\u0083\u0091üP|Â¦\u0089¾\u0011J\f\u001c\b¢\u0095Íå\u0090´\u0081²R\u0000Î\u009a¶\u0013\u009dåcÎ\u009bkç]\u0011\u0004\u001f/Î÷lz\u0015U!±SÉpD7§ýn\u0003Â·\u0084(\u0001_õ4Ókæ\u0087\u001es\u0013\u0083\u0099\u0087Xgd¡òU8 t;\u0090\u000e,ºÇÔA¬\u0013,' \u00ad\u0098\u009c}f\u0091óÎS¤/ó¼h¨Õk[¥\u0006\n¯X\u0012\u0013 `r#\u0094\u0093´{l3ú\u0007U\u0011~a«\u001b\u0007\u0011«fí\u0098\u0015\u0086B`\u0016üåwÄ*å,\u0001¬zÝ×\u009dÁe\u0090¶Q\u0011Ï\u0090N\u0015ÔS\tàx ËV\u0019\u0097E¯À¾!\u008b\u0080Ü,Ãê\u001bôÎO¡Å<(¸ }~ÆO\u0082ù\u00ad¤\u0000Å°\u0002lS$ÇÛ\u000b\u001f°\u0089i#ú#ô\u00ado_\u009dhå]Ï\rÙ\bVrô\u00974wy_\u0019¨\b\u001f\u000e\t|5ãÎ@½§Ï\u0003[NÂ.ÔN\u0092\u0081\u0012î~\u007f7\u001dF\u000eÏ\u0002\u001cày\u0012Xü/Hü\u009cüº)\u007f\u0012ßÁ\u0001ù\u000eX\bw\u0016Ù¢Z\u001bP\u009f\u0002I\u0082&Q¸ÔÌ~Â(iÛVÌÿ%æC×\u0094yÛ´¹\u0019:ß7\u0019Y)ø`\u0082¶/Ñö \"Y\u00073å\b½×\u0097¬&\u007fÏ±ä\u000b,\u008e-Äüè\u0099¿\\\u000e\u0095i\u0094Ç¥5÷7¢\u0086óé\u00adõý-\u0096x¡M\u0005î¼®\u0016y\u0005 ÿ\u0007\u0086ÐjnÓ1\u0084µ¡}jÒ5\f´\u0089Dyó¯Ú\u00ad\u001dûyÎ\u0091ð\u0095\u009bS\u0084ò\u0087Q\u0010Öå¶¤\u0095ì²<µ\u0003\b4Ê[k\u0014îvn\u0019Ö]\u008e÷qf\u008b,þ\u0019ô6ÛÉR5ãuíóuÇÇµ9¥E\u007fa0VÈf'±h¨¯kó\u0006mäjâ\u0013Û\u0086ðÈ8mC\u0013\u0018dãÅ\u0086Ò-\u0011æ\\/sÐÌÚ\u0018\u0095aâñ\u009a<â¡\u009b¸>¾|ºdÞÊ\u0006ÎØÌ4\u001dC\u0095\u001e0Ó½\u0096x\u0003Ï©¿Ä(\u0012Oãº\u0015lF]\nw\u0094Îð\u0086§<3Bk\u000b°{\u0004\"&aþ\u0089µmP\u0018UÎíd9©\u0019Ö'J¹ú\u0093EMØX¸)_\u0006\u0002\u0016\u007f\u000bT)SÉNº¾\u0092µ\u000fæã\u009cLÐ\u007f\u0012´ý\u0082\u0087\u009e\u0000©E}7Hi¡,\u008dÓyÔÅo3T^\u0003³\u0007oiý7h& a\u009bÔ±\bdpt¥G\u0083b9\u001e\fª$ø\u0013\u0089\tìû\u007fQ\rïå»YX'<\u0088N½:\u009d²0qÈ\u0097\u0080¤v\u008f<èJS;\u00110ÉW\u008e q¥h\u0084\u009ff\u001fí:ó«»SÀ\u0096ôÎûÏ\u0090«?êzðw\r:Äp^¢sï\u0006\u001f\u0088\u0000ßÈ\u0083Ã\u0000º\u0005X_Âu\u0017\u0091ìäaÃg\u0094Õ6£\"ÏÍ'Þ\\J-\u0018RÎ\u0092é\u0011\u009bÒ¬¦ªåe\u008f\u0019î\r\u001aÚ,\u0080ï6q§½¶\n\f\u008b~P]´Ö4\u0083Èy\u0094ÝìÏ\u009f»\"ú¢lº¹\u0010\u009c\u0097\u0081Ã'å@¢z|\u0099ñ\u0086äñZ@\u008c\u000b|syü\u009d^´Áë)°~Î}ñÏzqÜ\u0090¤1Â\u0007)\u009aØ=²ü²áT¨Ô.ÈQÀª"
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

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = III(11514, (char)'轶', -1520686925)).length();
      int var1 = ll(-831244064, var23 ^ 1346798973);
      int var25 = -1;

      label88:
      while (true) {
         int var27 = ll(-831244063, var23 ^ -58202585);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var10002 = -1;

         while (true) {
            label83: {
               char[] var43 = var10001.toCharArray();
               int var10004 = var43.length;
               int var6 = 0;
               int var46 = var27;
               var39 = var43;
               int var33 = var10004;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var43;
                  var10004 = var27;
                  var10006 = var6;
               } else {
                  var46 = var27;
                  var33 = var10004;
                  if (var10004 <= var6) {
                     break label83;
                  }

                  var55 = var43;
                  var10004 = var27;
                  var10006 = var6;
               }

               while (true) {
                  var55[var10006] = (char)(var55[var10006] ^ var10004 ^ switch (var6 % ll(-831244036, var23 ^ -1776624182)) {
                     case 0 -> ll(-831244035, var23 ^ 1554117740);
                     case 1 -> ll(-831244034, var23 ^ 595965744);
                     case 2 -> ll(-831244033, var23 ^ 419179877);
                     case 3 -> ll(-831244040, var23 ^ 1693033013);
                     case 4 -> ll(-831244039, var23 ^ -742648260);
                     case 5 -> ll(-831244038, var23 ^ -137584882);
                     default -> ll(-831244037, var23 ^ -2060295655);
                  });
                  var6++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var55 = var39;
                     var10004 = var46;
                  } else {
                     if (var33 <= var6) {
                        break;
                     }

                     var55 = var39;
                     var10004 = var46;
                     var10006 = var6;
                  }
               }
            }

            String var48 = new String(var39).intern();
            switch (var10002) {
               case 0:
                  var5[var3++] = var48;
                  if ((var25 += var1) >= var4) {
                     ll = var5;
                     II = new String[4];
                     IIl = new String[4];
                     l();
                     l = new lIlIIIlI();
                     I = new lIlIIIlI();
                     lI = new lIlIIIlI();
                     III = new lIlIIIlI();
                     Il = I();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var48;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label88;
                  }

                  var4 = (var2 = III('퐿', 29745, -1520686926)).length();
                  var1 = ll(-831244062, var23 ^ -1805088733);
                  var25 = -1;
            }

            var27 = ll(-831244061, var23 ^ 1559289415);
            var10001 = var2.substring(++var25, var25 + var1);
            var10002 = 0;
         }
      }
   }

   private static String lI(int var0, int var1) {
      int var9 = 1346783888;
      int var2 = (var0 ^ ll(-831244042, var9 ^ -1112653440)) & ll(-831244041, var9 ^ -96119249);
      if (II[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & ll(-831244048, var9 ^ -1117527908)) {
            case 0 -> ll(-831244047, var9 ^ -1739195951);
            case 1 -> ll(-831244046, var9 ^ 1819588059);
            case 2 -> ll(-831244045, var9 ^ -2107614785);
            case 3 -> ll(-831244084, var9 ^ 1224459430);
            case 4 -> ll(-831244083, var9 ^ 314836631);
            case 5 -> ll(-831244082, var9 ^ -1884305583);
            case 6 -> ll(-831244081, var9 ^ 1497404501);
            case 7 -> ll(-831244088, var9 ^ -469185682);
            case 8 -> ll(-831244087, var9 ^ 1058960586);
            case 9 -> ll(-831244086, var9 ^ -415022608);
            case 10 -> ll(-831244085, var9 ^ -28871010);
            case 11 -> ll(-831244092, var9 ^ -1156628673);
            case 12 -> ll(-831244091, var9 ^ -1611210475);
            case 13 -> ll(-831244090, var9 ^ -714616733);
            case 14 -> ll(-831244089, var9 ^ -1105900610);
            case 15 -> ll(-831244096, var9 ^ 455059196);
            case 16 -> ll(-831244095, var9 ^ -1840029235);
            case 17 -> ll(-831244094, var9 ^ -1861492965);
            case 18 -> ll(-831244093, var9 ^ -1170858464);
            case 19 -> ll(-831244068, var9 ^ -1976726721);
            case 20 -> ll(-831244067, var9 ^ 1866091899);
            case 21 -> ll(-831244066, var9 ^ 1108088645);
            case 22 -> ll(-831244065, var9 ^ -707977946);
            case 23 -> ll(-831244072, var9 ^ 2016123361);
            case 24 -> ll(-831244071, var9 ^ 1305659118);
            case 25 -> ll(-831244070, var9 ^ 1508474876);
            case 26 -> ll(-831244069, var9 ^ -1028307046);
            case 27 -> ll(-831244076, var9 ^ 1038490944);
            case 28 -> ll(-831244075, var9 ^ -13242065);
            case 29 -> ll(-831244074, var9 ^ 1563171197);
            case 30 -> ll(-831244073, var9 ^ -1933497469);
            case 31 -> ll(-831244080, var9 ^ -1063851747);
            case 32 -> ll(-831244079, var9 ^ -1883370014);
            case 33 -> ll(-831244078, var9 ^ -591275990);
            case 34 -> ll(-831244077, var9 ^ -632333215);
            case 35 -> ll(-831244116, var9 ^ 1344316473);
            case 36 -> ll(-831244115, var9 ^ -1881942036);
            case 37 -> ll(-831244114, var9 ^ 1416731182);
            case 38 -> ll(-831244113, var9 ^ 317574129);
            case 39 -> ll(-831244120, var9 ^ 1988314791);
            case 40 -> ll(-831244119, var9 ^ 1122372789);
            case 41 -> ll(-831244118, var9 ^ 1764091068);
            case 42 -> ll(-831244117, var9 ^ 1979165190);
            case 43 -> ll(-831244124, var9 ^ -969225730);
            case 44 -> ll(-831244123, var9 ^ -1027785715);
            case 45 -> ll(-831244122, var9 ^ 641735220);
            case 46 -> ll(-831244121, var9 ^ 337404368);
            case 47 -> ll(-831244128, var9 ^ 2058663153);
            case 48 -> ll(-831244127, var9 ^ -68980862);
            case 49 -> ll(-831244126, var9 ^ -315123980);
            case 50 -> ll(-831244125, var9 ^ 1636377505);
            case 51 -> ll(-831244100, var9 ^ 1010969347);
            case 52 -> ll(-831244099, var9 ^ -1888018583);
            case 53 -> ll(-831244098, var9 ^ -1298607311);
            case 54 -> ll(-831244097, var9 ^ -1806704302);
            case 55 -> ll(-831244104, var9 ^ 1194202254);
            case 56 -> ll(-831244103, var9 ^ 1396153293);
            case 57 -> ll(-831244102, var9 ^ 856109016);
            case 58 -> ll(-831244101, var9 ^ -178268422);
            case 59 -> ll(-831244108, var9 ^ -1155273079);
            case 60 -> ll(-831244107, var9 ^ 1061490813);
            case 61 -> ll(-831244106, var9 ^ 1177882744);
            case 62 -> ll(-831244105, var9 ^ -1396920632);
            case 63 -> ll(-831244112, var9 ^ 54832608);
            case 64 -> ll(-831244111, var9 ^ -1538031732);
            case 65 -> ll(-831244110, var9 ^ -1542931814);
            case 66 -> ll(-831244109, var9 ^ 1006201885);
            case 67 -> ll(-831244148, var9 ^ -2143212620);
            case 68 -> ll(-831244147, var9 ^ 271938738);
            case 69 -> ll(-831244146, var9 ^ 254897928);
            case 70 -> ll(-831244145, var9 ^ 1220854355);
            case 71 -> ll(-831244152, var9 ^ -1972198685);
            case 72 -> ll(-831244151, var9 ^ 76250053);
            case 73 -> ll(-831244150, var9 ^ 1622096857);
            case 74 -> ll(-831244149, var9 ^ 1843876202);
            case 75 -> ll(-831244156, var9 ^ -1242893129);
            case 76 -> ll(-831244155, var9 ^ -2078764141);
            case 77 -> ll(-831244154, var9 ^ -514210811);
            case 78 -> ll(-831244153, var9 ^ 245777068);
            case 79 -> ll(-831244160, var9 ^ -450624460);
            case 80 -> ll(-831244159, var9 ^ 1128829682);
            case 81 -> ll(-831244158, var9 ^ -2030063483);
            case 82 -> ll(-831244157, var9 ^ -240266630);
            case 83 -> ll(-831244132, var9 ^ -1157148889);
            case 84 -> ll(-831244131, var9 ^ 779822693);
            case 85 -> ll(-831244130, var9 ^ -1535544194);
            case 86 -> ll(-831244129, var9 ^ -1741908040);
            case 87 -> ll(-831244136, var9 ^ -1246497304);
            case 88 -> ll(-831244135, var9 ^ 947626831);
            case 89 -> ll(-831244134, var9 ^ 1228649807);
            case 90 -> ll(-831244133, var9 ^ 1024547110);
            case 91 -> ll(-831244140, var9 ^ 26811582);
            case 92 -> ll(-831244139, var9 ^ 1115682258);
            case 93 -> ll(-831244138, var9 ^ 1878062560);
            case 94 -> ll(-831244137, var9 ^ -1070180909);
            case 95 -> ll(-831244144, var9 ^ 1041475156);
            case 96 -> ll(-831244143, var9 ^ 1340848559);
            case 97 -> ll(-831244142, var9 ^ -1587697387);
            case 98 -> ll(-831244141, var9 ^ -1123317445);
            case 99 -> ll(-831244180, var9 ^ -573046320);
            case 100 -> ll(-831244179, var9 ^ 1043734179);
            case 101 -> ll(-831244178, var9 ^ 1088271626);
            case 102 -> ll(-831244177, var9 ^ 1230220700);
            case 103 -> ll(-831244184, var9 ^ -478225870);
            case 104 -> ll(-831244183, var9 ^ -567872941);
            case 105 -> ll(-831244182, var9 ^ 1735721720);
            case 106 -> ll(-831244181, var9 ^ -1923450520);
            case 107 -> ll(-831244188, var9 ^ 687861179);
            case 108 -> ll(-831244187, var9 ^ -1107206847);
            case 109 -> ll(-831244186, var9 ^ -1766803268);
            case 110 -> ll(-831244185, var9 ^ -174204845);
            case 111 -> ll(-831244192, var9 ^ -1642880350);
            case 112 -> ll(-831244191, var9 ^ 1759304343);
            case 113 -> ll(-831244190, var9 ^ -150246417);
            case 114 -> ll(-831244189, var9 ^ 1627841264);
            case 115 -> ll(-831244164, var9 ^ 1925296823);
            case 116 -> ll(-831244163, var9 ^ -1766648010);
            case 117 -> ll(-831244162, var9 ^ 1055590954);
            case 118 -> ll(-831244161, var9 ^ 1242051606);
            case 119 -> 2;
            case 120 -> ll(-831244168, var9 ^ -2049420529);
            case 121 -> ll(-831244167, var9 ^ -25643876);
            case 122 -> 1;
            case 123 -> ll(-831244166, var9 ^ 682654805);
            case 124 -> ll(-831244165, var9 ^ 1960021064);
            case 125 -> ll(-831244172, var9 ^ -942189980);
            case 126 -> ll(-831244171, var9 ^ -1260808664);
            case 127 -> ll(-831244170, var9 ^ 965053553);
            case 128 -> ll(-831244169, var9 ^ -1348987437);
            case 129 -> ll(-831244176, var9 ^ 941744527);
            case 130 -> ll(-831244175, var9 ^ 1185049457);
            case 131 -> ll(-831244174, var9 ^ 804778839);
            case 132 -> ll(-831244173, var9 ^ -192562110);
            case 133 -> ll(-831244212, var9 ^ -1827555549);
            case 134 -> 0;
            case 135 -> ll(-831244211, var9 ^ -933182892);
            case 136 -> ll(-831244210, var9 ^ -285337941);
            case 137 -> ll(-831244209, var9 ^ -1168280123);
            case 138 -> ll(-831244216, var9 ^ -1313791864);
            case 139 -> ll(-831244215, var9 ^ -975815487);
            case 140 -> ll(-831244214, var9 ^ 1374838493);
            case 141 -> ll(-831244213, var9 ^ -441362483);
            case 142 -> ll(-831244220, var9 ^ 2106702132);
            case 143 -> ll(-831244219, var9 ^ 1978589184);
            case 144 -> ll(-831244218, var9 ^ 1439354345);
            case 145 -> ll(-831244217, var9 ^ 1492313817);
            case 146 -> ll(-831244224, var9 ^ -1235900519);
            case 147 -> ll(-831244223, var9 ^ 1843058917);
            case 148 -> ll(-831244222, var9 ^ 2013229795);
            case 149 -> ll(-831244221, var9 ^ 1959251536);
            case 150 -> ll(-831244196, var9 ^ -1303312749);
            case 151 -> ll(-831244195, var9 ^ -199418156);
            case 152 -> ll(-831244194, var9 ^ 1044745015);
            case 153 -> ll(-831244193, var9 ^ -1992123193);
            case 154 -> ll(-831244200, var9 ^ 697046215);
            case 155 -> ll(-831244199, var9 ^ -1306339818);
            case 156 -> ll(-831244198, var9 ^ 734450317);
            case 157 -> ll(-831244197, var9 ^ -942378463);
            case 158 -> ll(-831244204, var9 ^ 745001494);
            case 159 -> ll(-831244203, var9 ^ 633831152);
            case 160 -> ll(-831244202, var9 ^ -1828083109);
            case 161 -> ll(-831244201, var9 ^ 487311447);
            case 162 -> ll(-831244208, var9 ^ -1912691941);
            case 163 -> ll(-831244207, var9 ^ 549859534);
            case 164 -> ll(-831244206, var9 ^ 2110134868);
            case 165 -> ll(-831244205, var9 ^ -115735455);
            case 166 -> ll(-831244244, var9 ^ -79665819);
            case 167 -> ll(-831244243, var9 ^ 1206543313);
            case 168 -> ll(-831244242, var9 ^ 1966733414);
            case 169 -> ll(-831244241, var9 ^ 1595172954);
            case 170 -> ll(-831244248, var9 ^ -681789245);
            case 171 -> ll(-831244247, var9 ^ -392462359);
            case 172 -> ll(-831244246, var9 ^ 1399543824);
            case 173 -> ll(-831244245, var9 ^ 1414069569);
            case 174 -> ll(-831244252, var9 ^ 1263752679);
            case 175 -> ll(-831244251, var9 ^ -1314775897);
            case 176 -> ll(-831244250, var9 ^ 1919340752);
            case 177 -> ll(-831244249, var9 ^ -245381876);
            case 178 -> ll(-831244256, var9 ^ 1732593003);
            case 179 -> ll(-831244255, var9 ^ -196482123);
            case 180 -> ll(-831244254, var9 ^ 350901935);
            case 181 -> ll(-831244253, var9 ^ 2022548125);
            case 182 -> ll(-831244228, var9 ^ 1718485615);
            case 183 -> ll(-831244227, var9 ^ -765331870);
            case 184 -> ll(-831244226, var9 ^ 429691626);
            case 185 -> ll(-831244225, var9 ^ 1193717084);
            case 186 -> ll(-831244232, var9 ^ 1248913461);
            case 187 -> ll(-831244231, var9 ^ -2006318728);
            case 188 -> ll(-831244230, var9 ^ -745425691);
            case 189 -> ll(-831244229, var9 ^ -1564963401);
            case 190 -> ll(-831244236, var9 ^ 1043730203);
            case 191 -> ll(-831244235, var9 ^ -1012718528);
            case 192 -> ll(-831244234, var9 ^ -396245308);
            case 193 -> ll(-831244233, var9 ^ 156048076);
            case 194 -> ll(-831244240, var9 ^ -856177975);
            case 195 -> ll(-831244239, var9 ^ -2075424694);
            case 196 -> ll(-831244238, var9 ^ 522651687);
            case 197 -> ll(-831244237, var9 ^ 776816275);
            case 198 -> ll(-831244276, var9 ^ 688003980);
            case 199 -> ll(-831244275, var9 ^ -621802947);
            case 200 -> ll(-831244274, var9 ^ 626315123);
            case 201 -> ll(-831244273, var9 ^ 111663489);
            case 202 -> ll(-831244280, var9 ^ 1596461515);
            case 203 -> ll(-831244279, var9 ^ -1187565026);
            case 204 -> ll(-831244278, var9 ^ -1377844069);
            case 205 -> ll(-831244277, var9 ^ 1288396791);
            case 206 -> ll(-831244284, var9 ^ 410819954);
            case 207 -> ll(-831244283, var9 ^ -915798290);
            case 208 -> ll(-831244282, var9 ^ -594113773);
            case 209 -> ll(-831244281, var9 ^ -1984742598);
            case 210 -> ll(-831244288, var9 ^ 933988009);
            case 211 -> ll(-831244287, var9 ^ 192412182);
            case 212 -> ll(-831244286, var9 ^ 1911417869);
            case 213 -> ll(-831244285, var9 ^ -514515370);
            case 214 -> ll(-831244260, var9 ^ -977543732);
            case 215 -> ll(-831244259, var9 ^ -1407301512);
            case 216 -> 4;
            case 217 -> ll(-831244258, var9 ^ -92864048);
            case 218 -> ll(-831244257, var9 ^ -1242938961);
            case 219 -> ll(-831244264, var9 ^ -779092307);
            case 220 -> ll(-831244263, var9 ^ 1003801713);
            case 221 -> ll(-831244262, var9 ^ 2078329762);
            case 222 -> 5;
            case 223 -> ll(-831244261, var9 ^ -480815916);
            case 224 -> ll(-831244268, var9 ^ 1588378461);
            case 225 -> ll(-831244267, var9 ^ -1985513303);
            case 226 -> ll(-831244266, var9 ^ -81684204);
            case 227 -> ll(-831244265, var9 ^ -2091799439);
            case 228 -> ll(-831244272, var9 ^ -1379870027);
            case 229 -> ll(-831244271, var9 ^ 649096874);
            case 230 -> ll(-831244270, var9 ^ -502893472);
            case 231 -> ll(-831244269, var9 ^ 1727719407);
            case 232 -> ll(-831243796, var9 ^ 1815931247);
            case 233 -> ll(-831243795, var9 ^ -741496038);
            case 234 -> ll(-831243794, var9 ^ -1819796383);
            case 235 -> ll(-831243793, var9 ^ -1539230356);
            case 236 -> ll(-831243800, var9 ^ -1356226361);
            case 237 -> ll(-831243799, var9 ^ 1839476622);
            case 238 -> ll(-831243798, var9 ^ 813893157);
            case 239 -> ll(-831243797, var9 ^ 1260925265);
            case 240 -> ll(-831243804, var9 ^ 293146481);
            case 241 -> ll(-831243803, var9 ^ 1973908148);
            case 242 -> ll(-831243802, var9 ^ -705079574);
            case 243 -> ll(-831243801, var9 ^ -559966204);
            case 244 -> ll(-831243808, var9 ^ -481820366);
            case 245 -> ll(-831243807, var9 ^ 1371024859);
            case 246 -> ll(-831243806, var9 ^ -2113708280);
            case 247 -> ll(-831243805, var9 ^ -480327883);
            case 248 -> ll(-831243780, var9 ^ -1331536321);
            case 249 -> ll(-831243779, var9 ^ 459552415);
            case 250 -> ll(-831243778, var9 ^ 1029161538);
            case 251 -> ll(-831243777, var9 ^ -595980653);
            case 252 -> ll(-831243784, var9 ^ -1441986033);
            case 253 -> ll(-831243783, var9 ^ -1889973335);
            case 254 -> 3;
            default -> ll(-831243782, var9 ^ 995452604);
         };
         int var5 = (var1 & ll(-831243781, var9 ^ -451577771)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & ll(-831243788, var9 ^ -1757340832)) >>> ll(-831243787, var9 ^ -203918774)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & ll(-831243786, var9 ^ 361524849);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & ll(-831243785, var9 ^ -1988789516);
            }
         }

         II[var2] = new String(var3).intern();
      }

      return II[var2];
   }
}
