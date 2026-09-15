package k74.x;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.BaseTSD.ULONG_PTR;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
interface IIIlllllI extends Library {
   String[] lI;
   int[] Il;
   Object[] ll;
   String I;
   IIIlllllI l;
   String[] II;

   static void I() {
      II[0] = II(I.toCharArray(), 48460L, Il(1118690950, -190287625 ^ -1290513968));
   }

   static int Il(int var0, int var1) {
      int var2 = Il[var0 ^ 1118690950] ^ var1 ^ var0;
      var2 -= 20347;
      var2 += 49272;
      var2 -= 64430;
      var2 -= 792;
      var2 -= 29964;
      return var2 + 3726;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var12 = 222601960;
      char[] var3 = "㱨".toCharArray();
      String var2 = "\ufae9ꨩᛎ쥶\ue0a9ꏞ榌騹";
      short var1 = 15456;
      byte var8 = -1;
      String[] var4 = new String[var3.length];

      while (true) {
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (var8 == 0) {
            lI = var4;
            ll = new Object[var4.length];
            Il = new int[12];
            int var14 = 0;
            int var10001 = 0;
            byte[] var10002 = "Âz\neLÖu8\u0012¾\u0084\u009fá4Wÿh\f;B\u000f²Ò\u001aP\u008f\u000bWzI\u0010(K\u001e\u001eçÂæ¯\u009eô\u0016¢â`ü'Þ"
               .getBytes("ISO-8859-1");

            int var37;
            do {
               Il[var14] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -677901088;
               var14 += 1;
               var37 = var10001 + 4;
               var10001 += 4;
            } while (var37 < var10002.length);

            var14 = Il(1118690951, var12 ^ -727191270);
            char[] var38 = lI(14688076, var12 ^ -1067399231).toCharArray();
            int var49 = var38.length;
            int var0 = 0;
            var37 = var14;
            char[] var28 = var38;
            var10001 = var49;
            char[] var58;
            int var65;
            if (var49 <= 1) {
               var58 = var38;
               var49 = var14;
               var65 = var0;
            } else {
               var37 = var14;
               var10001 = var49;
               if (var49 <= var0) {
                  String var42 = new String(var38).intern();
                  byte var22 = -1;
                  I = var42;
                  II = new String[1];
                  I();
                  l = (IIIlllllI)Native.load(IlIIllIII.lI(II[0]), IIIlllllI.class);
                  return;
               }

               var58 = var38;
               var49 = var14;
               var65 = var0;
            }

            while (true) {
               var58[var65] = (char)(var58[var65] ^ var49 ^ switch (var0 % Il(1118690948, var12 ^ -1966145443)) {
                  case 0 -> Il(1118690949, var12 ^ 2034619369);
                  case 1 -> Il(1118690946, var12 ^ -260194380);
                  case 2 -> Il(1118690947, var12 ^ -1748806114);
                  case 3 -> Il(1118690944, var12 ^ -922841241);
                  case 4 -> Il(1118690945, var12 ^ -499608369);
                  case 5 -> Il(1118690958, var12 ^ -747660561);
                  default -> Il(1118690959, var12 ^ 1519856543);
               });
               var0++;
               if (var37 == 0) {
                  var65 = var37;
                  var58 = var28;
                  var49 = var37;
               } else {
                  if (var10001 <= var0) {
                     String var41 = new String(var28).intern();
                     byte var21 = -1;
                     I = var41;
                     II = new String[1];
                     I();
                     l = (IIIlllllI)Native.load(IlIIllIII.lI(II[0]), IIIlllllI.class);
                     return;
                  }

                  var58 = var28;
                  var49 = var37;
                  var65 = var0;
               }
            }
         }

         do {
            var7 = var3[var5] ^ var1;
            char[] var9 = var2.substring(var6, var6 + var7).toCharArray();
            int var10 = 0;

            do {
               short var11 = switch (var10 % 6) {
                  default -> 24;
                  case 1 -> 219;
                  case 2 -> 39;
                  case 3 -> 242;
                  case 4 -> 78;
                  case 5 -> 115;
               };
               var9[var10] = (char)(var9[var10] ^ var11);
            } while (++var10 < var9.length);

            var4[var5] = new String(var9).intern();
            var6 += var7;
         } while (++var5 < var3.length);

         var8 = 0;
      }
   }

   void l(byte var1, byte var2, int var3, ULONG_PTR var4);

   private static String lI(int var0, int var1) {
      int var3 = var0 ^ 14688076;
      char[] var4 = lI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])ll[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         ll[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1095096845;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 76;
            case 1 -> 43;
            case 2 -> 75;
            case 3 -> 128;
            case 4 -> 242;
            case 5 -> 224;
            case 6 -> 158;
            case 7 -> 107;
            case 8 -> 246;
            case 9 -> 27;
            case 10 -> 144;
            case 11 -> 178;
            case 12 -> 9;
            case 13 -> 164;
            case 14 -> 68;
            case 15 -> 12;
            case 16 -> 21;
            case 17 -> 168;
            case 18 -> 87;
            case 19 -> 216;
            case 20 -> 160;
            case 21 -> 17;
            case 22 -> 210;
            case 23 -> 144;
            case 24 -> 16;
            case 25 -> 32;
            case 26 -> 88;
            case 27 -> 140;
            case 28 -> 105;
            case 29 -> 38;
            case 30 -> 3;
            case 31 -> 102;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   static String II(char[] var0, long var1, int var3) {
      int var4 = Il(1118690956, -1979608633 ^ -173678460) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & Il(1118690957, -1979608633 ^ 2143850802);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
