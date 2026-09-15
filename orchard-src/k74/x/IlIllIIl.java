package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IlIllIIl {
   I,
   l,
   II,
   Il;

   private static final Object[] IIl;
   private static final String[] III;
   private static final int[] ll;
   private static final IlIllIIl[] lI;

   private static String Il(byte var0, byte var1, int var2, int var3, char var4) {
      int var9 = var2 ^ -701116852;
      char[] var8 = III[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])IIl[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         IIl[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 10993;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ switch (var7 % 18) {
            default -> 62;
            case 1 -> 246;
            case 2 -> 27;
            case 3 -> 186;
            case 4 -> 74;
            case 5 -> 211;
            case 6 -> 152;
            case 7 -> 36;
            case 8 -> 159;
            case 9 -> 16;
            case 10 -> 27;
            case 11 -> 20;
            case 12 -> 237;
            case 13 -> 43;
            case 14 -> 56;
            case 15 -> 13;
            case 16 -> 100;
            case 17 -> 4;
         } ^ var7 ^ var2 ^ var4 ^ var6 ^ var0 ^ var3 ^ var1);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -1843002752;
      int var17 = 0;
      int var10001 = "\u0011髴楲魪椐鯎⦷顡⤍馆\ue9fa骼\ue953頞⤻骒\ue986髩\f脛壈胁ᢪ耥\ud808菶ᢷ舱\ud844腇飭".length();
      short var18 = 26407;
      String[] var15 = new String[2];
      int var14 = var10001;
      String var13 = "\u0011髴楲魪椐鯎⦷顡⤍馆\ue9fa骼\ue953頞⤻骒\ue986髩\f脛壈胁ᢪ耥\ud808菶ᢷ舱\ud844腇飭";
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 54;
               case 1 -> 255;
               case 2 -> 160;
               case 3 -> 144;
               case 4 -> 64;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      III = var15;
      IIl = new Object[var15.length];
      int var9 = -710005648;
      byte[] var7 = "6ÇÐJùè\u0087+R]\u008f×¿\u0092å:q´$x1ì\u0013é@ig ÌâÊÒÏÀÿQN9\u0092½«/«L".getBytes("ISO-8859-1");
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

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il((byte)-81, (byte)76, -701116852, -1940732309, '@')).length();
      int var2 = II(-1905922416, var23 ^ -13961013);
      int var25 = -1;

      label99:
      while (true) {
         int var28 = II(-1905922415, var23 ^ 805677944);
         String var31 = var3.substring(++var25, var25 + var2);
         byte var38 = -1;

         while (true) {
            label94: {
               char[] var47 = var31.toCharArray();
               int var10004 = var47.length;
               int var6 = 0;
               int var50 = var28;
               var43 = var47;
               var10001 = var10004;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var47;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var50 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label94;
                  }

                  var59 = var47;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var59[var10006] = (char)(var59[var10006] ^ var10004 ^ switch (var6 % II(-1905922412, var23 ^ -1202123521)) {
                     case 0 -> II(-1905922411, var23 ^ -134136004);
                     case 1 -> II(-1905922410, var23 ^ -1987818512);
                     case 2 -> II(-1905922409, var23 ^ 84928019);
                     case 3 -> 2;
                     case 4 -> II(-1905922408, var23 ^ 103666610);
                     case 5 -> II(-1905922407, var23 ^ -2016100720);
                     default -> II(-1905922406, var23 ^ 1656914882);
                  });
                  var6++;
                  if (var50 == 0) {
                     var10006 = var50;
                     var59 = var43;
                     var10004 = var50;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var59 = var43;
                     var10004 = var50;
                     var10006 = var6;
                  }
               }
            }

            String var52 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var0[var4++] = var52;
                  if ((var25 += var2) >= var5) {
                     II = new IlIllIIl();
                     I = new IlIllIIl();
                     l = new IlIllIIl();
                     Il = new IlIllIIl();
                     lI = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var52;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label99;
                  }

                  var5 = (var3 = Il((byte)-107, (byte)-11, -701116851, -1265063247, 21960)).length();
                  var2 = II(-1905922414, var23 ^ -1682921641);
                  var25 = -1;
            }

            var28 = II(-1905922413, var23 ^ 1988086221);
            var31 = var3.substring(++var25, var25 + var2);
            var38 = 0;
         }
      }
   }

   private static IlIllIIl[] I() {
      return new IlIllIIl[]{II, I, l, Il};
   }

   public static IlIllIIl l(String var0) {
      return Enum.valueOf(IlIllIIl.class, var0);
   }

   private static int II(int var0, int var1) {
      int var2 = ll[var0 ^ -1905922416] ^ var1 ^ var0;
      var2 += 41926;
      var2 -= 15433;
      var2 -= 64047;
      var2 ^= 12764;
      var2 += 18711;
      return var2 - 45309;
   }
}
