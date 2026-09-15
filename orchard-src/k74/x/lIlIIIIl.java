package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lIlIIIIl {
   I,
   Il;
   private static final int[] lI;
   private static final String[] ll;
   private static final Object[] III;
   private final IIIlIlIl l;
   private static final lIlIIIIl[] II;

   private lIlIIIIl(IIIlIlIl var3) {
      this.l = var3;
   }

   private static int Il(int var0, int var1) {
      int var2 = lI[var0 ^ -721304773] ^ var1 ^ var0;
      var2 -= 2781;
      var2 += 43809;
      var2 ^= 41542;
      var2 -= 12056;
      var2 ^= 48987;
      var2 ^= 40167;
      var2 ^= 20195;
      return var2 ^ 50334;
   }

   private static lIlIIIIl[] I() {
      return new lIlIIIIl[]{Il, I};
   }

   private static String lI(char var0, int var1, char var2) {
      int var3 = var2 ^ '덀';
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])III[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         III[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 20836;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 16422;
         var10 += 44296;
         var10 += 43008;
         var10 ^= 59209;
         var10 -= 59967;
         var10 += 46201;
         var10 -= 49525;
         var10 ^= 51221;
         var10 -= 7683;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = 1756616650;
      String var14 = "鞇霙階隢革韂鞃霴韀鞅韅韲韷靃隄隠队鞀韢靉随韲霋韃韡霼韃霏靜韥韒陻隘ᗬᖀᗯᒢᕛᗹᖍᔟᗣᔎᕔᗨᗣᑐᗟᗯᖫᕗᕉᔧ";
      char[] var15 = "!\u0014".toCharArray();
      short var13 = 21247;
      byte var20 = -1;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            ll = var16;
            III = new Object[var16.length];
            int var9 = -2122680140;
            byte[] var7 = "7r{¼\u0006m\u008b2cì\u00ad\u0018\u0095Ü\u009a·²°\u009bÁaZ«BÌ\\\u000eÙî\n\u008fûûê¨,\nà\u0083¢Ö\u001c\u0099\u0088|´o\u0083"
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

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = lI('䤭', var24 ^ -834809918, '덀')).length();
            int var2 = Il(-721304773, var24 ^ -196751982);
            int var26 = -1;

            label101:
            while (true) {
               int var29 = Il(-721304774, var24 ^ -983941887);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label96: {
                     char[] var45 = var10001.toCharArray();
                     int var10004 = var45.length;
                     int var6 = 0;
                     int var48 = var29;
                     var41 = var45;
                     int var35 = var10004;
                     char[] var57;
                     int var10006;
                     if (var10004 <= 1) {
                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     } else {
                        var48 = var29;
                        var35 = var10004;
                        if (var10004 <= var6) {
                           break label96;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % Il(-721304769, var24 ^ 1904684500)) {
                           case 0 -> Il(-721304770, var24 ^ -1569907698);
                           case 1 -> Il(-721304771, var24 ^ 258718103);
                           case 2 -> Il(-721304772, var24 ^ 758987202);
                           case 3 -> Il(-721304781, var24 ^ 954015277);
                           case 4 -> Il(-721304782, var24 ^ -908643095);
                           case 5 -> Il(-721304783, var24 ^ 355151797);
                           default -> Il(-721304784, var24 ^ -1081878107);
                        });
                        var6++;
                        if (var48 == 0) {
                           var10006 = var48;
                           var57 = var41;
                           var10004 = var48;
                        } else {
                           if (var35 <= var6) {
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
                        var0[var4++] = var50;
                        if ((var26 += var2) >= var5) {
                           Il = new lIlIIIIl(IlIIllIII.Ill(var0[0]));
                           I = new lIlIIIIl(IlIIllIII.Ill(var0[1]));
                           II = I();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var50;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label101;
                        }

                        var5 = (var3 = lI('猿', var24 ^ 1782103894, '덁')).length();
                        var2 = Il(-721304775, var24 ^ -1596253379);
                        var26 = -1;
                  }

                  var29 = Il(-721304776, var24 ^ 1458253301);
                  var10001 = var3.substring(++var26, var26 + var2);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 178;
                  case 1 -> 121;
                  case 2 -> 143;
                  case 3 -> 183;
                  case 4 -> 63;
                  case 5 -> 175;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   public IIIlIlIl l() {
      return this.l;
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   public static lIlIIIIl II(String var0) {
      return Enum.valueOf(lIlIIIIl.class, var0);
   }
}
