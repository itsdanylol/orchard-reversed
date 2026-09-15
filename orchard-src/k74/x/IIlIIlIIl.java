package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIlIIlIIl {
   I,
   l,
   II,
   Il,
   ll;
   private static final int[] III;
   private static final Object[] IlI;
   private static final String[] IIl;
   private static final IIlIIlIIl[] lI;

   private static String Il(int var0, int var1, char var2) {
      int var3 = var2 ^ 23277;
      char[] var4 = IIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 6955;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '핓';
         var10 -= 33586;
         var10 ^= 21649;
         var10 += 43547;
         var10 += 49599;
         var10 -= 65180;
         var10 += 44859;
         var10 -= 31813;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static IIlIIlIIl I(String var0) {
      return Enum.valueOf(IIlIIlIIl.class, var0);
   }

   private static int II(int var0, int var1) {
      int var2 = III[var0 ^ -1330605213] ^ var1 ^ var0;
      var2 += 18877;
      var2 ^= 4657;
      var2 -= 39931;
      var2 ^= 48146;
      var2 ^= 42643;
      var2 -= 15138;
      return var2 + 4161;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 998906672;
      int var16 = 0;
      short var18 = 16033;
      String[] var15 = new String[2];
      int var14 = "!\u20fa\uf68bⅺ⚎㈚꺆⽺皈㊺\ue68c㚚ᚇ↺嚍ₚ꺌㎚꺍ⅺ뺌⇺꺋Ṻڎ㓚ꚍ᭚ﺆ㗺ᚇ㊚䚍ᩚ\u001e弩\ue3a3忩\uda59豎뉘撉\uf257醮꩗賎ﮢ棩쩗栉㉙逎橙賎ﮢ棩쩗旉뮢弩\ueba2豎㉚撉艗".length();
      int var17 = 0;
      String var13 = "!\u20fa\uf68bⅺ⚎㈚꺆⽺皈㊺\ue68c㚚ᚇ↺嚍ₚ꺌㎚꺍ⅺ뺌⇺꺋Ṻڎ㓚ꚍ᭚ﺆ㗺ᚇ㊚䚍ᩚ\u001e弩\ue3a3忩\uda59豎뉘撉\uf257醮꩗賎ﮢ棩쩗栉㉙逎橙賎ﮢ棩쩗旉뮢弩\ueba2豎㉚撉艗";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
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

      IIl = var15;
      IlI = new Object[var15.length];
      int var9 = -1295542129;
      byte[] var7 = "þ\u0019Çôì\u0002ìnµ,¥ö\u0092·(Î~\u0090Ïv\u0097¥ùëgärsBÑ\u0087\u0013:Ë×EXïÃî/ù\f\u0094".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      III = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         III[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[5];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(var23 ^ -1297337387, 53038, '嫭')).length();
      int var2 = 4;
      int var25 = -1;

      label89:
      while (true) {
         int var10000 = II(-1330605213, var23 ^ -941342451);
         String var10001 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label84: {
               char[] var42 = var10001.toCharArray();
               int var10004 = var42.length;
               int var6 = 0;
               int var45 = var10000;
               var38 = var42;
               int var32 = var10004;
               char[] var54;
               int var10006;
               if (var10004 <= 1) {
                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var45 = var10000;
                  var32 = var10004;
                  if (var10004 <= var6) {
                     break label84;
                  }

                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % II(-1330605216, var23 ^ -1421169527)) {
                     case 0 -> II(-1330605209, var23 ^ 1198344599);
                     case 1 -> II(-1330605210, var23 ^ -1369932361);
                     case 2 -> II(-1330605211, var23 ^ 1578759327);
                     case 3 -> II(-1330605212, var23 ^ 2066481608);
                     case 4 -> II(-1330605205, var23 ^ 53891853);
                     case 5 -> II(-1330605206, var23 ^ 1628587738);
                     default -> II(-1330605207, var23 ^ 369396346);
                  });
                  var6++;
                  if (var45 == 0) {
                     var10006 = var45;
                     var54 = var38;
                     var10004 = var45;
                  } else {
                     if (var32 <= var6) {
                        break;
                     }

                     var54 = var38;
                     var10004 = var45;
                     var10006 = var6;
                  }
               }
            }

            String var47 = new String(var38).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var47;
                  if ((var25 += var2) >= var5) {
                     II = new IIlIIlIIl();
                     I = new IIlIIlIIl();
                     ll = new IIlIIlIIl();
                     Il = new IIlIIlIIl();
                     l = new IIlIIlIIl();
                     lI = l();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var47;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label89;
                  }

                  var5 = (var3 = Il(var23 ^ 1071082572, 10436, '嫬')).length();
                  var2 = II(-1330605214, var23 ^ -704681944);
                  var25 = -1;
            }

            var10000 = II(-1330605215, var23 ^ -1932451413);
            var10001 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private static IIlIIlIIl[] l() {
      return new IIlIIlIIl[]{II, I, ll, Il, l};
   }
}
