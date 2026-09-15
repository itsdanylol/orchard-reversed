package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lIIIIIll {
   I,
   l,
   II,
   Il,
   ll,
   III,
   IIl;

   private static final int[] IlI;
   private static final lIIIIIll[] lI;
   private static final Object[] lII;
   private static final String[] Ill;

   public static lIIIIIll I(String var0) {
      return Enum.valueOf(lIIIIIll.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -1103608631;
      short var12 = 27123;
      int var10001 = "T躩뼦輚繌\uf007ﺒ\uf14b\ude13\uf13d\udeeb輳鼭軰ὕ踹弥迚Ṍ\uf1b7ẕ\uf193㸑軽뼖輋\udf2f还罻辙ở\uf1b2繍\uf12f\ude97\uf153\ude11瘟ữ\uf15b㻗躰뽿轁鼦蹺徳迷纕\uf063鿪蹥뼑辻绐\uf040ﺁ\uf1d9\udedf\uf10a\ude4a辯齪軣￩蹅㼑\uf12bỒ\uf180㺃踱뼡踊\udfbd蹏뽨辋Ḕ\uf05d黯\uf17b廒\uf170뺀\u001a゛吣ㅠ钴ㄅᑬパ㓨〿럯どퟔお랂㉛ᐡ츨钷ゥ鑪켁铨ハ\uf7edヱ\uf7d7"
         .length();
      int var10 = 0;
      int var11 = 0;
      String[] var9 = new String[2];
      int var8 = var10001;
      String var7 = "T躩뼦輚繌\uf007ﺒ\uf14b\ude13\uf13d\udeeb輳鼭軰ὕ踹弥迚Ṍ\uf1b7ẕ\uf193㸑軽뼖輋\udf2f还罻辙ở\uf1b2繍\uf12f\ude97\uf153\ude11瘟ữ\uf15b㻗躰뽿轁鼦蹺徳迷纕\uf063鿪蹥뼑辻绐\uf040ﺁ\uf1d9\udedf\uf10a\ude4a辯齪軣￩蹅㼑\uf12bỒ\uf180㺃踱뼡踊\udfbd蹏뽨辋Ḕ\uf05d黯\uf17b廒\uf170뺀\u001a゛吣ㅠ钴ㄅᑬパ㓨〿럯どퟔお랂㉛ᐡ츨钷ゥ鑪켁铨ハ\uf7edヱ\uf7d7";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 46;
               case 1 -> 226;
               case 2 -> 213;
               case 3 -> 116;
               case 4 -> 232;
               case 5 -> 175;
               case 6 -> 188;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      Ill = var9;
      lII = new Object[var9.length];
      int var21 = 0;
      int var24 = 0;
      IlI = new int[16];
      byte[] var10002 = "ÍÕd\n[\u008e>MCõIü\u0093\u0012´¨Âþ\b¶µä·Â\u009c\u0086N2`Z¯ªzè¢¦á\u0001Ã6¶Vq4 \u009f2+\u008e\u0019\u007fâN\u0017>\u008dd\u0013C\u008eG\u0088TD"
         .getBytes("ISO-8859-1");

      int var55;
      do {
         IlI[var21] = ((var10002[var24] & 255) << 24 | (var10002[var24 + 1] & 255) << 16 | (var10002[var24 + 2] & 255) << 8 | var10002[var24 + 3] & 255)
            ^ -593071841;
         var21 += 1;
         var55 = var24 + 4;
         var24 += 4;
      } while (var55 < var10002.length);

      String[] var0 = new String[II(632598116, var17 ^ -1963037532)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(var17 ^ 480786015, '㑥', 'ꦪ')).length();
      int var2 = II(632598117, var17 ^ 480589547);
      int var19 = -1;

      label103:
      while (true) {
         var21 = II(632598118, var17 ^ 81675024);
         String var27 = var3.substring(++var19, var19 + var2);
         byte var39 = -1;

         while (true) {
            label98: {
               char[] var57 = var27.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var21;
               var44 = var57;
               var24 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               } else {
                  var55 = var21;
                  var24 = var69;
                  if (var69 <= var6) {
                     break label98;
                  }

                  var81 = var57;
                  var69 = var21;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % II(632598112, var17 ^ -2049638372)) {
                     case 0 -> II(632598113, var17 ^ -221266094);
                     case 1 -> II(632598114, var17 ^ -609401204);
                     case 2 -> II(632598115, var17 ^ 661759817);
                     case 3 -> II(632598124, var17 ^ 1036233249);
                     case 4 -> II(632598125, var17 ^ -1507145099);
                     case 5 -> II(632598126, var17 ^ -243435086);
                     default -> II(632598127, var17 ^ -407618906);
                  });
                  var6++;
                  if (var55 == 0) {
                     var88 = var55;
                     var81 = var44;
                     var69 = var55;
                  } else {
                     if (var24 <= var6) {
                        break;
                     }

                     var81 = var44;
                     var69 = var55;
                     var88 = var6;
                  }
               }
            }

            String var62 = new String(var44).intern();
            switch (var39) {
               case 0:
                  var0[var4++] = var62;
                  if ((var19 += var2) >= var5) {
                     l = new lIIIIIll();
                     II = new lIIIIIll();
                     Il = new lIIIIIll();
                     I = new lIIIIIll();
                     ll = new lIIIIIll();
                     III = new lIIIIIll();
                     IIl = new lIIIIIll();
                     lI = l();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var62;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label103;
                  }

                  var5 = (var3 = Il(var17 ^ -38512612, '鵷', 'ꦫ')).length();
                  var2 = 4;
                  var19 = -1;
            }

            var21 = II(632598119, var17 ^ -734413809);
            var27 = var3.substring(++var19, var19 + var2);
            var39 = 0;
         }
      }
   }

   private static String Il(int var0, char var1, char var2) {
      int var3 = var2 ^ 'ꦪ';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 9969;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '쀍';
         var10 -= 25930;
         var10 ^= 25471;
         var10 += 2432;
         var10 -= 19716;
         var10 ^= 21146;
         var10 ^= 42983;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static lIIIIIll[] l() {
      lIIIIIll[] var10000 = new lIIIIIll[II(632598122, 413922476 ^ -2052326581)];
      var10000[0] = l;
      var10000[1] = II;
      var10000[2] = Il;
      var10000[3] = I;
      var10000[4] = ll;
      var10000[5] = III;
      var10000[II(632598123, 413922476 ^ -1506743163)] = IIl;
      return var10000;
   }

   private static int II(int var0, int var1) {
      int var2 = IlI[var0 ^ 632598116] ^ var1 ^ var0;
      var2 += 46439;
      var2 -= 24766;
      var2 ^= 49398;
      var2 += 29956;
      var2 -= 43628;
      var2 -= 28675;
      return var2 ^ 33231;
   }
}
