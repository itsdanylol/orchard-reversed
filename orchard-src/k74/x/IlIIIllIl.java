package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIIIllIl {
   I,
   II;
   private static final String[] lI;
   private static final int[] Il;
   private static final Object[] ll;
   private static final IlIIIllIl[] l;

   private static int l(int var0, int var1) {
      int var2 = Il[var0 ^ 1101149984] ^ var1 ^ var0;
      var2 ^= 54816;
      var2 += 27227;
      var2 -= 6501;
      var2 += 7867;
      var2 += 620;
      var2 ^= 43562;
      return var2 - 7559;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -580357558;
      short var18 = 28979;
      String[] var15 = new String[1];
      int var17 = 0;
      int var10001 = "\fṪ⇹ṎꇦἎꇫỞ懧ῒ⇥Ṯꇰ".length();
      int var16 = 0;
      int var14 = var10001;
      String var13 = "\fṪ⇹ṎꇦἎꇫỞ懧ῒ⇥Ṯꇰ";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
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

      lI = var15;
      ll = new Object[var15.length];
      int var9 = -1595516585;
      byte[] var7 = "\nr\u008ed[Qeäíwq2\u0016h\u0019èh,ÑÕ·.\n3bÆQ:&\u008f,s*ï;X\u009fI\u0013¾".getBytes("ISO-8859-1");
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
      int var5 = (var3 = II((short)9850, '齴', (short)-24006, -2031028384)).length();
      int var2 = l(1101149984, var23 ^ 912130547);
      int var1 = -1;

      while (true) {
         char[] var10002;
         label75: {
            int var10000 = l(1101149985, var23 ^ 1736305215);
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var32 = var10000;
            var10002 = var10003;
            var10001 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            } else {
               var32 = var10000;
               var10001 = var10004;
               if (var10004 <= var6) {
                  break label75;
               }

               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % l(1101149986, var23 ^ -782500182)) {
                  case 0 -> l(1101149987, var23 ^ 709138061);
                  case 1 -> l(1101149988, var23 ^ 1409310223);
                  case 2 -> l(1101149989, var23 ^ -1962769074);
                  case 3 -> l(1101149990, var23 ^ 1592450628);
                  case 4 -> l(1101149991, var23 ^ 446931932);
                  case 5 -> l(1101149992, var23 ^ 381924561);
                  default -> l(1101149993, var23 ^ -1553621965);
               });
               var6++;
               if (var32 == 0) {
                  var10006 = var32;
                  var10005 = var10002;
                  var10004 = var32;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var32;
                  var10006 = var6;
               }
            }
         }

         String var34 = new String(var10002).intern();
         byte var29 = -1;
         var0[var4++] = var34;
         if ((var1 += var2) >= var5) {
            I = new IlIIIllIl();
            II = new IlIIIllIl();
            l = I();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static String II(short var0, char var1, short var2, int var3) {
      int var8 = var3 ^ -2031028384;
      char[] var7 = lI[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])ll[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         ll[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 56824;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ var6 ^ var1 ^ var5 ^ var3 ^ var2 ^ var0);
      }

      return new String(var7).intern();
   }

   private static IlIIIllIl[] I() {
      return new IlIIIllIl[]{I, II};
   }
}
