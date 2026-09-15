package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum l {
   l,
   II;

   private static final Object[] III;
   private static final int[] lI;
   private final IIIlIlIl I;
   private static final l[] Il;
   private static final String[] ll;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 723111140;
      short var18 = 27945;
      int var17 = 0;
      int var14 = "\u000b䫸ꅡ妨\ue0dd㜨\ue129姈䅠㘐惝姐\u0011雛ຸ꾳溹걳칆꿳\ueeb1괃\uee5a긃溽괣湂꽋溼굛".length();
      int var16 = 0;
      String[] var15 = new String[2];
      String var13 = "\u000b䫸ꅡ妨\ue0dd㜨\ue129姈䅠㘐惝姐\u0011雛ຸ꾳溹걳칆꿳\ueeb1괃\uee5a긃溽괣湂꽋溼굛";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << '\r') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> '\r') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      ll = var15;
      III = new Object[var15.length];
      int var9 = -579473070;
      byte[] var7 = ";'\u009f\u0001!w\u0088¹%©_\u0017\u009e\u001f\u001d!Ð¾¨r°\u0089\u0013²\u0018tMEú\u0018åñ\u0003cÈ\u009b\u0092=\u008dºCi¦#"
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
      int var5 = (var3 = Il('쇂', 2193, var23 ^ 1839197256)).length();
      int var2 = 4;
      int var25 = -1;

      label90:
      while (true) {
         int var10000 = II(630303716, var23 ^ -388474408);
         String var10001 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label85: {
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
                     break label85;
                  }

                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % II(630303719, var23 ^ 1306581988)) {
                     case 0 -> II(630303712, var23 ^ 54619776);
                     case 1 -> II(630303713, var23 ^ 1668732233);
                     case 2 -> II(630303714, var23 ^ -880047150);
                     case 3 -> II(630303715, var23 ^ 703013664);
                     case 4 -> II(630303724, var23 ^ -795079147);
                     case 5 -> II(630303725, var23 ^ 1103252260);
                     default -> II(630303726, var23 ^ -1869193012);
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
                     II = new l(IlIIllIII.Ill(var0[2]));
                     l = new l(IlIIllIII.Ill(var0[3]));
                     Il = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var47;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label90;
                  }

                  var5 = (var3 = Il('쇃', 48187, var23 ^ 208718401)).length();
                  var2 = II(630303717, var23 ^ -225948063);
                  var25 = -1;
            }

            var10000 = II(630303718, var23 ^ -162096761);
            var10001 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private l(IIIlIlIl var3) {
      this.I = var3;
   }

   private static l[] I() {
      return new l[]{II, l};
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ 630303716] ^ var1 ^ var0;
      var2 -= 6288;
      var2 += 4393;
      var2 -= 50386;
      var2 -= 11620;
      var2 -= 55600;
      var2 += 3962;
      var2 -= 24448;
      var2 += 9323;
      return var2 ^ 21035;
   }

   private static String Il(char var0, int var1, int var2) {
      int var3 = var0 ^ '쇂';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 18333;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\ued26';
         var10 ^= 29008;
         var10 += 3512;
         var10 += 17206;
         var10 ^= 54608;
         var10 -= 42520;
         var10 -= 45396;
         var10 ^= 35647;
         var10 += 37557;
         var10 ^= 39162;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.I.llIl();
   }

   public static l l(String var0) {
      return Enum.valueOf(l.class, var0);
   }
}
