package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum llllllII {
   I,
   l,
   II,
   Il,
   lI,
   III;

   private static final int[] IIl;
   private static final llllllII[] ll;
   private static final Object[] Ill;
   private static final String[] IlI;

   private static String II(int var0, int var1) {
      int var3 = var0 ^ -462086576;
      char[] var4 = IlI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])Ill[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         Ill[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1146087770;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 214;
            case 1 -> 195;
            case 2 -> 127;
            case 3 -> 11;
            case 4 -> 142;
            case 5 -> 90;
            case 6 -> 104;
            case 7 -> 172;
            case 8 -> 102;
            case 9 -> 138;
            case 10 -> 239;
            case 11 -> 20;
            case 12 -> 68;
            case 13 -> 219;
            case 14 -> 133;
            case 15 -> 109;
            case 16 -> 135;
            case 17 -> 253;
            case 18 -> 57;
            case 19 -> 76;
            case 20 -> 134;
            case 21 -> 33;
            case 22 -> 51;
            case 23 -> 176;
            case 24 -> 152;
            case 25 -> 230;
            case 26 -> 123;
            case 27 -> 190;
            case 28 -> 152;
            case 29 -> 182;
            case 30 -> 96;
            case 31 -> 134;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static llllllII[] I() {
      llllllII[] var10000 = new llllllII[l(-1222193830, 1552860133 ^ 1402503195)];
      var10000[0] = II;
      var10000[1] = III;
      var10000[2] = Il;
      var10000[3] = I;
      var10000[4] = l;
      var10000[5] = lI;
      return var10000;
   }

   private static int l(int var0, int var1) {
      int var2 = IIl[var0 ^ -1222193830] ^ var1 ^ var0;
      var2 ^= 1478;
      var2 += 43882;
      var2 += 46673;
      var2 += 3591;
      var2 -= 13530;
      var2 += 4007;
      return var2 ^ 10322;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 888906930;
      short var12 = 30998;
      String[] var10002 = new String[2];
      int var10 = 0;
      int var11 = 0;
      String[] var9 = var10002;
      int var8 = "+웲汢쐺ⱍ욊ⱎ쓊汱앶\uec7e쟞汑쓚Ⱡ쟶걐쟂걺쑒\uec4f읪汖쑦\uec70왦汫쐞汿잒\uec63쑞Ⱬ욖\uec67쐞汈쟶\uec56쒎ⱴ쒦\uec7b읂\u0016⒫\uf241☣뉫▇㉷⚟㉗⛟뉚┻㉬⛣\uf247○㉲▣\uf25e⟛㉬┻\uf271".length();
      String var7 = "+웲汢쐺ⱍ욊ⱎ쓊汱앶\uec7e쟞汑쓚Ⱡ쟶걐쟂걺쑒\uec4f읪汖쑦\uec70왦汫쐞汿잒\uec63쑞Ⱬ욖\uec67쐞汈쟶\uec56쒎ⱴ쒦\uec7b읂\u0016⒫\uf241☣뉫▇㉷⚟㉗⛟뉚┻㉬⛣\uf247○㉲▣\uf25e⟛㉬┻\uf271";

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var32 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var32).toCharArray();

         do {
            char var16 = var14[var15];
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

      IlI = var9;
      Ill = new Object[var9.length];
      int var10000 = 0;
      IIl = new int[13];
      int var22 = 0;
      byte[] var33 = "ûòà\u0003\u0081h\u0011kíp+ÇÜ½YÓ@\u0007\u007f{â^c¦\u0096\nw\u001e©ü\u0018ÿ¾Ï®Ä'å\u009bµÅTBÚÁ°é%ù¬\u0017\u0003".getBytes("ISO-8859-1");

      int var55;
      do {
         IIl[var10000] = ((var33[var22] & 255) << 24 | (var33[var22 + 1] & 255) << 16 | (var33[var22 + 2] & 255) << 8 | var33[var22 + 3] & 255) ^ -1136871772;
         var10000 += 1;
         var55 = var22 + 4;
         var22 += 4;
      } while (var55 < var33.length);

      String[] var0 = new String[l(-1222193829, var17 ^ 1098323493)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(-462086576, var17 ^ -1714358210)).length();
      int var2 = 4;
      int var19 = -1;

      label92:
      while (true) {
         var10000 = l(-1222193832, var17 ^ 762260536);
         String var25 = var3.substring(++var19, var19 + var2);
         byte var39 = -1;

         while (true) {
            label87: {
               char[] var57 = var25.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var10000;
               var44 = var57;
               var22 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var10000;
                  var88 = var6;
               } else {
                  var55 = var10000;
                  var22 = var69;
                  if (var69 <= var6) {
                     break label87;
                  }

                  var81 = var57;
                  var69 = var10000;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % l(-1222193825, var17 ^ 574711023)) {
                     case 0 -> l(-1222193828, var17 ^ 1444245735);
                     case 1 -> l(-1222193827, var17 ^ 1776492520);
                     case 2 -> l(-1222193838, var17 ^ 2127604173);
                     case 3 -> l(-1222193837, var17 ^ -403006216);
                     case 4 -> l(-1222193840, var17 ^ 88819164);
                     case 5 -> l(-1222193839, var17 ^ 28307009);
                     default -> l(-1222193834, var17 ^ 968036383);
                  });
                  var6++;
                  if (var55 == 0) {
                     var88 = var55;
                     var81 = var44;
                     var69 = var55;
                  } else {
                     if (var22 <= var6) {
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
                     II = new llllllII();
                     III = new llllllII();
                     Il = new llllllII();
                     I = new llllllII();
                     l = new llllllII();
                     lI = new llllllII();
                     ll = I();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var62;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = II(-462086575, var17 ^ -513803327)).length();
                  var2 = l(-1222193831, var17 ^ 480403088);
                  var19 = -1;
            }

            var10000 = l(-1222193826, var17 ^ -2145879939);
            var25 = var3.substring(++var19, var19 + var2);
            var39 = 0;
         }
      }
   }
}
