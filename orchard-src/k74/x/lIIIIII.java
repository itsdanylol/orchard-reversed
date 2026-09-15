package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lIIIIII {
   l,
   II;
   private static final lIIIIII[] I;
   private static final Object[] ll;
   private static final String[] lI;
   private static final int[] Il;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 256714343;
      int var10001 = "\f鋍魥鲍\udb67酭筤鋍덥鳍魧鍭㭧".length();
      int var17 = 0;
      String[] var15 = new String[1];
      short var18 = 30441;
      int var16 = 0;
      int var14 = var10001;
      String var13 = "\f鋍魥鲍\udb67酭筤鋍덥鳍魧鍭㭧";

      do {
         char var19 = var13.charAt(var17);
         char[] var10000 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;
         char[] var20 = var10000;

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

      lI = var15;
      ll = new Object[var15.length];
      int var9 = -769527721;
      byte[] var7 = "\\\u0096B\u001cÏ©ë\u0016TíÄÇ\u0099\u0002¾I\u0019¥\u0083åW>0\u0098©§S\u009fý\u0019|S".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      Il = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         Il[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il((byte)-25, (short)-29874, '㙽', -900640944, (short)-30017, (short)-21521, (short)14650)).length();
      char var2 = 5;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label74: {
            int var26 = II(-1080547237, var23 ^ -1046684140);
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var33 = var26;
            var10002 = var10003;
            var10001 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var26;
               var10006 = var6;
            } else {
               var33 = var26;
               var10001 = var10004;
               if (var10004 <= var6) {
                  break label74;
               }

               var10005 = var10003;
               var10004 = var26;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % II(-1080547238, var23 ^ 1386449880)) {
                  case 0 -> II(-1080547239, var23 ^ -907565244);
                  case 1 -> II(-1080547240, var23 ^ 67642240);
                  case 2 -> II(-1080547233, var23 ^ -2068897843);
                  case 3 -> II(-1080547234, var23 ^ -902517598);
                  case 4 -> 1;
                  case 5 -> II(-1080547235, var23 ^ 883806123);
                  default -> II(-1080547236, var23 ^ 1611915653);
               });
               var6++;
               if (var33 == 0) {
                  var10006 = var33;
                  var10005 = var10002;
                  var10004 = var33;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var33;
                  var10006 = var6;
               }
            }
         }

         String var35 = new String(var10002).intern();
         byte var30 = -1;
         var0[var4++] = var35;
         if ((var1 += var2) >= var5) {
            l = new lIIIIII();
            II = new lIIIIII();
            I = l();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static int II(int var0, int var1) {
      int var2 = Il[var0 ^ -1080547237] ^ var1 ^ var0;
      var2 ^= 6976;
      var2 -= 49686;
      var2 += 45115;
      var2 -= 23788;
      var2 ^= 18273;
      var2 += 37272;
      var2 += 10604;
      var2 ^= 33387;
      return var2 + 30236;
   }

   private static String Il(byte var0, short var1, char var2, int var3, short var4, short var5, short var6) {
      int var11 = var3 ^ -900640944;
      char[] var10 = lI[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])ll[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         ll[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 26714;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ '鰺' ^ var2 ^ var8 ^ var5 ^ var3 ^ var6 ^ var4 ^ var1 ^ var0);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   public static lIIIIII I(String var0) {
      return Enum.valueOf(lIIIIII.class, var0);
   }

   private static lIIIIII[] l() {
      return new lIIIIII[]{l, II};
   }
}
