package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lIIlIlII {
   II,
   Il;
   private static final Object[] III;
   private static final lIIlIlII[] I;
   private static final int[] lI;
   private final IIIlIlIl l;
   private static final String[] ll;

   private lIIlIlII(IIIlIlIl var3) {
      this.l = var3;
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ 60072542] ^ var1 ^ var0;
      var2 ^= 57229;
      var2 -= 62893;
      var2 ^= 45329;
      var2 -= 22043;
      var2 ^= 18964;
      var2 -= 17564;
      var2 -= 46543;
      var2 ^= 30048;
      var2 ^= 61177;
      return var2 + 15754;
   }

   private static lIIlIlII[] I() {
      return new lIIlIlII[]{II, Il};
   }

   private static String Il(int var0, short var1, char var2) {
      int var3 = var2 ^ 27590;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 11467;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '륵';
         var10 -= 38134;
         var10 -= 2331;
         var10 += 18637;
         var10 += 56817;
         var10 += 54547;
         var10 += 41592;
         var10 += 33265;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = -373568789;
      short var7 = 20399;
      byte var14 = -1;
      char[] var9 = "\u000f\u000f".toCharArray();
      String var8 = "ㅹ㋫㉃\u3100㈉㈖㊈ㄥㆻ\u3102㇆㈝㊳㋷ㆌ얔쑚쒋엃쓙쓩얗쐣쒙에쓅쓦쑤쑞쒍";
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            ll = var10;
            III = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            byte[] var10002 = "\u008bý¾µ4ùf\u00ad\u001b\u0007\u0005h\u0013Ä\u0085àS\u0082-\u0006\u0098ugw¬\u0089é@\u0003C\u0015\u0095){êjÆ#}\u009fy~`ú'7\u0095²"
               .getBytes("ISO-8859-1");
            lI = new int[12];

            int var55;
            do {
               lI[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 782833917;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il(var18 ^ -1342063016, (short)14019, '毆')).length();
            int var2 = II(60072542, var18 ^ 1333439371);
            int var20 = -1;

            label103:
            while (true) {
               var22 = II(60072543, var18 ^ -260170454);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var39 = -1;

               while (true) {
                  label98: {
                     char[] var57 = var27.toCharArray();
                     int var69 = var57.length;
                     int var6 = 0;
                     var55 = var22;
                     var44 = var57;
                     var10001 = var69;
                     char[] var81;
                     int var88;
                     if (var69 <= 1) {
                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     } else {
                        var55 = var22;
                        var10001 = var69;
                        if (var69 <= var6) {
                           break label98;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % II(60072538, var18 ^ -1761265197)) {
                           case 0 -> II(60072539, var18 ^ 1559370966);
                           case 1 -> II(60072536, var18 ^ 1745785556);
                           case 2 -> II(60072537, var18 ^ -943452953);
                           case 3 -> II(60072534, var18 ^ -302214723);
                           case 4 -> II(60072535, var18 ^ 44303881);
                           case 5 -> II(60072532, var18 ^ -1107723783);
                           default -> II(60072533, var18 ^ -474943788);
                        });
                        var6++;
                        if (var55 == 0) {
                           var88 = var55;
                           var81 = var44;
                           var69 = var55;
                        } else {
                           if (var10001 <= var6) {
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
                        if ((var20 += var2) >= var5) {
                           II = new lIIlIlII(IlIIllIII.Ill(var0[2]));
                           Il = new lIIlIlII(IlIIllIII.Ill(var0[1]));
                           I = I();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var62;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label103;
                        }

                        var5 = (var3 = Il(var18 ^ -1331983267, (short)9036, '毇')).length();
                        var2 = II(60072540, var18 ^ -545254990);
                        var20 = -1;
                  }

                  var22 = II(60072541, var18 ^ -683409752);
                  var27 = var3.substring(++var20, var20 + var2);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 203;
                  case 1 -> 181;
                  case 2 -> 49;
                  case 3 -> 149;
                  case 4 -> 87;
                  case 5 -> 96;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public static lIIlIlII l(String var0) {
      return Enum.valueOf(lIIlIlII.class, var0);
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }
}
