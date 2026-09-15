package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum llIIIII {
   I,
   II,
   Il;

   private static final String[] III;
   private static final int[] ll;
   private final IIIlIlIl l;
   private static final Object[] IIl;
   private static final llIIIII[] lI;

   private static int II(int var0, int var1) {
      int var2 = ll[var0 ^ 1117782511] ^ var1 ^ var0;
      var2 += 30510;
      var2 ^= 23612;
      var2 ^= 31711;
      var2 += 11155;
      var2 ^= 33356;
      var2 ^= 41700;
      return var2 - 50348;
   }

   private static llIIIII[] I() {
      return new llIIIII[]{I, II, Il};
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private static String Il(char var0, short var1, int var2) {
      int var3 = var0 ^ 22358;
      char[] var4 = III[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 27859;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 5034;
         var10 += 24851;
         var10 += 37865;
         var10 -= 794;
         var10 ^= 49046;
         var10 += 35928;
         var10 += 19106;
         var10 -= 26431;
         var10 += 29245;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private llIIIII(IIIlIlIl var3) {
      this.l = var3;
   }

   public static llIIIII l(String var0) {
      return Enum.valueOf(llIIIII.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -977511290;
      String[] var15 = new String[2];
      short var18 = 1519;
      int var16 = 0;
      int var17 = 0;
      int var14 = "\u001c膼ﲼ볬첸虼䲆멌첾멼粻뢌ﲿ뮜岁묌벁볌岿虼䲆멌벁腜\uecb8뢌沺뽌첸\u000f歞깨樎칯熾\uee6a熞\ude6d沎깨百빫潞\u0e6c皮".length();
      String var13 = "\u001c膼ﲼ볬첸虼䲆멌첾멼粻뢌ﲿ뮜岁묌벁볌岿虼䲆멌벁腜\uecb8뢌沺뽌첸\u000f歞깨樎칯熾\uee6a熞\ude6d沎깨百빫潞\u0e6c皮";

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

      III = var15;
      IIl = new Object[var15.length];
      int var9 = 1776442801;
      byte[] var7 = "\u0018\u0089\u0097³@fÚ\u008c\u0006\u008ecÿ@¬\u00059³ \u001f»F²5\u009d`\u0092\u0095\u0019µB^\u0093Ô_4jHXéÛ*Èôòó\u0095\u0014\u008a"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      ll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         ll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[II(1117782511, var23 ^ -159924387)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il('坖', (short)'靓', var23 ^ 1340689352)).length();
      int var2 = 5;
      int var25 = -1;

      label89:
      while (true) {
         int var10000 = II(1117782510, var23 ^ -1365708197);
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
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % II(1117782507, var23 ^ 1566455642)) {
                     case 0 -> II(1117782506, var23 ^ -1471406727);
                     case 1 -> II(1117782505, var23 ^ -1905476156);
                     case 2 -> II(1117782504, var23 ^ 1539077701);
                     case 3 -> II(1117782503, var23 ^ 983634549);
                     case 4 -> II(1117782502, var23 ^ -1499017276);
                     case 5 -> II(1117782501, var23 ^ -1003039753);
                     default -> II(1117782500, var23 ^ 493567064);
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
                     I = new llIIIII(IlIIllIII.Ill(var0[1]));
                     II = new llIIIII(IlIIllIII.Ill(var0[4]));
                     Il = new llIIIII(IlIIllIII.Ill(var0[3]));
                     lI = I();
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

                  var5 = (var3 = Il('块', (short)15661, var23 ^ -1828901764)).length();
                  var2 = II(1117782509, var23 ^ -395293927);
                  var25 = -1;
            }

            var10000 = II(1117782508, var23 ^ -1370346011);
            var10001 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }
}
