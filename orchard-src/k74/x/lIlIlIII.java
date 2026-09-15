package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lIlIlIII {
   I,
   II;

   private static final String[] ll;
   private static final Object[] III;
   private static final int[] lI;
   private final IIIlIlIl l;
   private static final lIlIlIII[] Il;

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ 1230569561] ^ var1 ^ var0;
      var2 -= 48802;
      var2 -= 27649;
      var2 ^= 26250;
      var2 += 23308;
      var2 ^= 33663;
      var2 ^= 34011;
      var2 -= 27835;
      var2 ^= 56467;
      return var2 ^ 58954;
   }

   private static lIlIlIII[] I() {
      return new lIlIlIII[]{II, I};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 691054734;
      String[] var9 = new String[2];
      int var10 = 0;
      int var11 = 0;
      short var12 = 21509;
      int var8 = "\u001d賞\ued3e邮ⶣ货\ue5a8蕪\u2d98鉒ﵒ艾䴸萮떡齧薨釪\uf599蔒\ued50辞甿蒎\ueda4蘧\u2daf颪궙贒\u0010㍀劐ⷰ樍㆙눆㮴舶Ⱜ\udafd\u3040슕㖐税\u2fd9쨆".length();
      String var7 = "\u001d賞\ued3e邮ⶣ货\ue5a8蕪\u2d98鉒ﵒ艾䴸萮떡齧薨釪\uf599蔒\ued50辞甿蒎\ueda4蘧\u2daf颪궙贒\u0010㍀劐ⷰ樍㆙눆㮴舶Ⱜ\udafd\u3040슕㖐税\u2fd9쨆";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 203;
               case 1 -> 95;
               case 2 -> 251;
               case 3 -> 199;
               case 4 -> 50;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      int var21 = 0;
      int var10001 = 0;
      lI = new int[12];
      byte[] var10002 = "\u0084J+\u008f}G\u008bÜ±W~QìôÏJ\u008aà\u000f`8äóy\u008e\u001b\u0097\rÉ¼\u009a73ÿ¹d*\u0083Èþl\u0080t\u009d\u0085\u001dE8"
         .getBytes("ISO-8859-1");

      int var54;
      do {
         lI[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 370040015;
         var21 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(23116, -2003839675, (byte)-45, 'ﵧ', -554881867)).length();
      int var2 = l(1230569561, var17 ^ -231960106);
      int var19 = -1;

      label101:
      while (true) {
         var21 = l(1230569560, var17 ^ 186724902);
         String var26 = var3.substring(++var19, var19 + var2);
         byte var38 = -1;

         while (true) {
            label96: {
               char[] var56 = var26.toCharArray();
               int var68 = var56.length;
               int var6 = 0;
               var54 = var21;
               var43 = var56;
               var10001 = var68;
               char[] var80;
               int var87;
               if (var68 <= 1) {
                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               } else {
                  var54 = var21;
                  var10001 = var68;
                  if (var68 <= var6) {
                     break label96;
                  }

                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % l(1230569565, var17 ^ -58280670)) {
                     case 0 -> l(1230569564, var17 ^ 1317161337);
                     case 1 -> l(1230569567, var17 ^ -126013716);
                     case 2 -> l(1230569566, var17 ^ -1076223031);
                     case 3 -> l(1230569553, var17 ^ 1167655022);
                     case 4 -> l(1230569552, var17 ^ 1558541014);
                     case 5 -> l(1230569555, var17 ^ 451333503);
                     default -> l(1230569554, var17 ^ -209978228);
                  });
                  var6++;
                  if (var54 == 0) {
                     var87 = var54;
                     var80 = var43;
                     var68 = var54;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var80 = var43;
                     var68 = var54;
                     var87 = var6;
                  }
               }
            }

            String var61 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var0[var4++] = var61;
                  if ((var19 += var2) >= var5) {
                     II = new lIlIlIII(IlIIllIII.Ill(var0[0]));
                     I = new lIlIlIII(IlIIllIII.Ill(var0[1]));
                     Il = I();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var61;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label101;
                  }

                  var5 = (var3 = II(13172, -2003839676, (byte)102, '삂', -118787514)).length();
                  var2 = l(1230569563, var17 ^ -953039758);
                  var19 = -1;
            }

            var21 = l(1230569562, var17 ^ -1701677493);
            var26 = var3.substring(++var19, var19 + var2);
            var38 = 0;
         }
      }
   }

   private static String II(short var0, int var1, byte var2, char var3, int var4) {
      int var9 = var1 ^ -2003839675;
      char[] var8 = ll[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])III[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         III[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 5963;

      for (int var7 = 0; var7 < var8.length; var7++) {
         var8[var7] = (char)(var8[var7] ^ switch (var7 % 23) {
            default -> 129;
            case 1 -> 227;
            case 2 -> 84;
            case 3 -> 48;
            case 4 -> 223;
            case 5 -> 141;
            case 6 -> 205;
            case 7 -> 173;
            case 8 -> 66;
            case 9 -> 255;
            case 10 -> 145;
            case 11 -> 114;
            case 12 -> 221;
            case 13 -> 111;
            case 14 -> 93;
            case 15 -> 190;
            case 16 -> 57;
            case 17 -> 189;
            case 18 -> 227;
            case 19 -> 161;
            case 20 -> 213;
            case 21 -> 224;
            case 22 -> 193;
         } ^ var1 ^ var4 ^ var6 ^ var3 ^ var0 ^ var2);
      }

      return new String(var8).intern();
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private lIlIlIII(IIIlIlIl var3) {
      this.l = var3;
   }
}
