package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IllIIlII {
   I,
   II;

   private static final String[] ll;
   private static final int[] lI;
   private final IIIlIlIl l;
   private static final Object[] III;
   private static final IllIIlII[] Il;

   private IllIIlII(IIIlIlIl var3) {
      this.l = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 1212957848;
      short var12 = 25734;
      int var11 = 0;
      int var8 = "\u0013鑆嚒闦際鈆ړ騶暒领隓黦皒集\ue69f駆뚖龆\uf697鋖\u0017哼챐嗬㱘劌\udc50孼걒嬌뱐峼ⱕ儌챘妬䱓廌鱕喜屛倜걓堼".length();
      String[] var9 = new String[2];
      String var7 = "\u0013鑆嚒闦際鈆ړ騶暒领隓黦皒集\ue69f駆뚖龆\uf697鋖\u0017哼챐嗬㱘劌\udc50孼걒嬌뱐峼ⱕ儌챘妬䱓廌鱕喜屛倜걓堼";
      int var10 = 0;

      do {
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << '\f') & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> '\f') & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      int var10000 = 0;
      lI = new int[10];
      int var10001 = 0;
      byte[] var10002 = "\u000b$ð *ßA©\u0096_7\teGC2DÞZÀ\u0091ôÏYrFi\u0084WåçI$;3ÚDÇº\u0099".getBytes("ISO-8859-1");

      int var52;
      do {
         lI[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -435571713;
         var10000 += 1;
         var52 = var10001 + 4;
         var10001 += 4;
      } while (var52 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(566768002, var17 ^ -141080256)).length();
      int var2 = l(-1463369024, var17 ^ -229029789);
      int var19 = -1;

      label91:
      while (true) {
         var10000 = l(-1463369023, var17 ^ -744294023);
         String var24 = var3.substring(++var19, var19 + var2);
         byte var36 = -1;

         while (true) {
            label86: {
               char[] var54 = var24.toCharArray();
               int var66 = var54.length;
               int var6 = 0;
               var52 = var10000;
               var41 = var54;
               var10001 = var66;
               char[] var78;
               int var85;
               if (var66 <= 1) {
                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               } else {
                  var52 = var10000;
                  var10001 = var66;
                  if (var66 <= var6) {
                     break label86;
                  }

                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               }

               while (true) {
                  var78[var85] = (char)(var78[var85] ^ var66 ^ switch (var6 % l(-1463369020, var17 ^ -1113333114)) {
                     case 0 -> l(-1463369019, var17 ^ 1753839606);
                     case 1 -> l(-1463369018, var17 ^ -1959013992);
                     case 2 -> l(-1463369017, var17 ^ -1365745681);
                     case 3 -> 1;
                     case 4 -> 2;
                     case 5 -> l(-1463369016, var17 ^ -582579374);
                     default -> l(-1463369015, var17 ^ -1111883195);
                  });
                  var6++;
                  if (var52 == 0) {
                     var85 = var52;
                     var78 = var41;
                     var66 = var52;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var78 = var41;
                     var66 = var52;
                     var85 = var6;
                  }
               }
            }

            String var59 = new String(var41).intern();
            switch (var36) {
               case 0:
                  var0[var4++] = var59;
                  if ((var19 += var2) >= var5) {
                     I = new IllIIlII(IlIIllIII.Ill(var0[0]));
                     II = new IllIIlII(IlIIllIII.Ill(var0[3]));
                     Il = I();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var59;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label91;
                  }

                  var5 = (var3 = II(566768003, var17 ^ 1541739949)).length();
                  var2 = l(-1463369022, var17 ^ 1864535886);
                  var19 = -1;
            }

            var10000 = l(-1463369021, var17 ^ -1673919269);
            var24 = var3.substring(++var19, var19 + var2);
            var36 = 0;
         }
      }
   }

   private static IllIIlII[] I() {
      return new IllIIlII[]{I, II};
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private static String II(int var0, int var1) {
      int var3 = var0 ^ 566768002;
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])III[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         III[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1985285038;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 175;
            case 1 -> 145;
            case 2 -> 181;
            case 3 -> 13;
            case 4 -> 189;
            case 5 -> 193;
            case 6 -> 70;
            case 7 -> 253;
            case 8 -> 17;
            case 9 -> 225;
            case 10 -> 65;
            case 11 -> 240;
            case 12 -> 221;
            case 13 -> 65;
            case 14 -> 99;
            case 15 -> 131;
            case 16 -> 40;
            case 17 -> 221;
            case 18 -> 247;
            case 19 -> 111;
            case 20 -> 200;
            case 21 -> 166;
            case 22 -> 111;
            case 23 -> 214;
            case 24 -> 86;
            case 25 -> 16;
            case 26 -> 144;
            case 27 -> 131;
            case 28 -> 175;
            case 29 -> 190;
            case 30 -> 15;
            case 31 -> 18;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ -1463369024] ^ var1 ^ var0;
      var2 ^= 37501;
      var2 ^= 24627;
      var2 += 18390;
      var2 ^= 38467;
      var2 += 41760;
      var2 += 33943;
      var2 ^= 32104;
      return var2 + 64502;
   }
}
