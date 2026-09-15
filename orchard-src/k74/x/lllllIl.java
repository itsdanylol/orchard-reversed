package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lllllIl {
   l,
   II,
   lI;
   private static final Object[] IIl;
   private final IIIlIlIl I;
   private static final int[] ll;
   private static final lllllIl[] Il;
   private static final String[] III;

   private static lllllIl[] I() {
      return new lllllIl[]{l, II, lI};
   }

   @Override
   public String toString() {
      return this.I.llIl();
   }

   private static String Il(int var0, byte var1, char var2) {
      int var7 = var0 ^ -1833744753;
      char[] var6 = III[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])IIl[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         IIl[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 39216;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ switch (var5 % 9) {
            default -> 120;
            case 1 -> 33;
            case 2 -> 37;
            case 3 -> 99;
            case 4 -> 230;
            case 5 -> 51;
            case 6 -> 122;
            case 7 -> 62;
            case 8 -> 40;
         } ^ var0 ^ var2 ^ var4 ^ var1);
      }

      return new String(var6).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 664035309;
      short var12 = 23199;
      int var8 = "\u0017쓰‛섷䂌콉傍쌀ꁗ인僓읏透쏟\uf04c쏀倜웗\uf08a싹䂍쑰聗쩸#㊌䳭㝫\uec7a㹅\udc7a㞬鲦㔄㰥ビ賺ぃ岾㇌곩㗻걻㗕౾㗌ತ㩔찣㋃\udcff㊓겱㉬賨〛䱴ゥ屻㊼".length();
      int var11 = 0;
      int var10 = 0;
      String[] var9 = new String[2];
      String var7 = "\u0017쓰‛섷䂌콉傍쌀ꁗ인僓읏透쏟\uf04c쏀倜웗\uf08a싹䂍쑰聗쩸#㊌䳭㝫\uec7a㹅\udc7a㞬鲦㔄㰥ビ賺ぃ岾㇌곩㗻걻㗕౾㗌ತ㩔찣㋃\udcff㊓겱㉬賨〛䱴ゥ屻㊼";

      do {
         char var13 = var7.charAt(var11);
         int var10001 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 144;
               case 1 -> 216;
               case 2 -> 23;
               case 3 -> 79;
               case 4 -> 201;
               case 5 -> 79;
               case 6 -> 128;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      III = var9;
      IIl = new Object[var9.length];
      int var21 = 0;
      int var24 = 0;
      ll = new int[12];
      byte[] var34 = "Éßm¥;\u009bÖ¢«1Y(ãí\u0093<4ó\u0092¹,r\u0089qø\u0089Ý\u0092 O\u0014\u001b\u0004{3ëÛ\u0006Í\u0003k\"öR\u000eæQM".getBytes("ISO-8859-1");

      int var56;
      do {
         ll[var21] = ((var34[var24] & 255) << 24 | (var34[var24 + 1] & 255) << 16 | (var34[var24 + 2] & 255) << 8 | var34[var24 + 3] & 255) ^ -1817431940;
         var21 += 1;
         var56 = var24 + 4;
         var24 += 4;
      } while (var56 < var34.length);

      String[] var0 = new String[II(120953923, var17 ^ -2060497702)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(-1833744753, 105, (char)'낯')).length();
      int var2 = 3;
      int var19 = -1;

      label105:
      while (true) {
         var21 = II(120953922, var17 ^ 2003564461);
         String var27 = var3.substring(++var19, var19 + var2);
         byte var40 = -1;

         while (true) {
            label100: {
               char[] var58 = var27.toCharArray();
               int var70 = var58.length;
               int var6 = 0;
               var56 = var21;
               var45 = var58;
               var24 = var70;
               char[] var82;
               int var89;
               if (var70 <= 1) {
                  var82 = var58;
                  var70 = var21;
                  var89 = var6;
               } else {
                  var56 = var21;
                  var24 = var70;
                  if (var70 <= var6) {
                     break label100;
                  }

                  var82 = var58;
                  var70 = var21;
                  var89 = var6;
               }

               while (true) {
                  var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % II(120953927, var17 ^ 2013508335)) {
                     case 0 -> II(120953926, var17 ^ 1619175516);
                     case 1 -> II(120953925, var17 ^ -1267073894);
                     case 2 -> II(120953924, var17 ^ 1824471526);
                     case 3 -> II(120953931, var17 ^ 1217073839);
                     case 4 -> II(120953930, var17 ^ -1745425382);
                     case 5 -> II(120953929, var17 ^ 668129100);
                     default -> II(120953928, var17 ^ 1108766785);
                  });
                  var6++;
                  if (var56 == 0) {
                     var89 = var56;
                     var82 = var45;
                     var70 = var56;
                  } else {
                     if (var24 <= var6) {
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
                  var0[var4++] = var63;
                  if ((var19 += var2) >= var5) {
                     l = new lllllIl(IlIIllIII.Ill(var0[1]));
                     II = new lllllIl(IlIIllIII.Ill(var0[3]));
                     lI = new lllllIl(IlIIllIII.Ill(var0[5]));
                     Il = I();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var63;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label105;
                  }

                  var5 = (var3 = Il(-1833744754, 38, '羌')).length();
                  var2 = II(120953921, var17 ^ -406750851);
                  var19 = -1;
            }

            var21 = II(120953920, var17 ^ -1357008359);
            var27 = var3.substring(++var19, var19 + var2);
            var40 = 0;
         }
      }
   }

   private static int II(int var0, int var1) {
      int var2 = ll[var0 ^ 120953923] ^ var1 ^ var0;
      var2 -= 12440;
      var2 ^= 51821;
      var2 -= 5426;
      var2 += 40741;
      var2 += 28118;
      var2 += 8386;
      var2 += 59264;
      var2 += 54462;
      var2 ^= 13814;
      return var2 - 2225;
   }

   public static lllllIl l(String var0) {
      return Enum.valueOf(lllllIl.class, var0);
   }

   private lllllIl(IIIlIlIl var3) {
      this.I = var3;
   }
}
