package k74.x;

import net.fabricmc.api.ModInitializer;

public final class IIlIllIl implements ModInitializer {
   private static final int[] lI;
   private static final Object[] III;
   private static IlIIIIIIl[] I;
   private static String[] l;
   public static final String II;
   private static final String Il;
   private static final String[] ll;

   private static int lI(int var0, int var1) {
      int var2 = lI[var0 ^ 668804744] ^ var1 ^ var0;
      var2 -= 22731;
      var2 -= 45431;
      var2 -= 3039;
      var2 ^= 57097;
      var2 -= 7267;
      var2 += 32431;
      var2 ^= 54479;
      return var2 - 6200;
   }

   public static IlIIIIIIl[] I() {
      return I;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var11 = 1648961739;
      short var6 = 5777;
      String[] var10001 = new String[1];
      int var4 = 0;
      int var5 = 0;
      String[] var3 = var10001;
      int var2 = "\f穩멷纗糇嘖糮\uf1ac꤆춹⊋\u09da⛖".length();
      String var1 = "\f穩멷纗糇嘖糮\uf1ac꤆춹⊋\u09da⛖";

      do {
         char var7 = var1.charAt(var5);
         int var9 = 0;
         char[] var8 = var1.substring(var5 + 1, var5 + 1 + var7).toCharArray();

         do {
            int var10 = var8[var9];

            var10 = (char)(switch (var9 % 6) {
               default -> 22;
               case 1 -> 218;
               case 2 -> 214;
               case 3 -> 98;
               case 4 -> 156;
               case 5 -> 89;
            }) ^ var10;
            if (var9 % 2 == 0) {
               var8[var9] = (char)((var10 >>> 2 | var10 << 14) & 65535 ^ var6);
            } else {
               var8[var9] = (char)((var10 << 2 | var10 >>> 14) & 65535 ^ var6);
            }
         } while (++var9 < var8.length);

         var3[var4] = new String(var8);
         var4++;
         var5 = var5 + var7 + 1;
      } while (var5 < var2);

      ll = var3;
      III = new Object[var3.length];
      int var13 = 0;
      byte var15 = 0;
      lI = new int[12];
      byte[] var10002 = "\u00adºn±aS[òýÀ§M\u009a(¢\u0084Ë\u0005F\u0082G\u0001\u001e\u008a\u0089\u0095\u0012ý²Ø?\u00068?PÄP¿\u0001üf\\a¦T©ñ®"
         .getBytes("ISO-8859-1");

      int var37;
      do {
         lI[var13] = ((var10002[var15] & 255) << 24 | (var10002[var15 + 1] & 255) << 16 | (var10002[var15 + 2] & 255) << 8 | var10002[var15 + 3] & 255)
            ^ -2137264835;
         var13 += 1;
         var37 = var15 + 4;
         var15 += 4;
      } while (var37 < var10002.length);

      if (I() == null) {
         II(new IlIIIIIIl[1]);
      }

      var13 = lI(668804747, var11 ^ 1596361347);
      char[] var38 = ll((short)11644, '\uf4a1', var11 ^ 1303840119).toCharArray();
      int var49 = var38.length;
      int var0 = 0;
      var37 = var13;
      char[] var28 = var38;
      int var19 = var49;
      char[] var58;
      int var65;
      if (var49 <= 1) {
         var58 = var38;
         var49 = var13;
         var65 = var0;
      } else {
         var37 = var13;
         var19 = var49;
         if (var49 <= var0) {
            String var42 = new String(var38).intern();
            byte var22 = -1;
            Il = var42;
            l = new String[1];
            l();
            II = IlIIllIII.lI(l[0]);
            return;
         }

         var58 = var38;
         var49 = var13;
         var65 = var0;
      }

      while (true) {
         var58[var65] = (char)(var58[var65] ^ var49 ^ switch (var0 % lI(668804748, var11 ^ 235630134)) {
            case 0 -> lI(668804749, var11 ^ -2112932230);
            case 1 -> lI(668804750, var11 ^ 1285241582);
            case 2 -> lI(668804751, var11 ^ 2010519549);
            case 3 -> lI(668804736, var11 ^ -47089416);
            case 4 -> lI(668804737, var11 ^ -1783551553);
            case 5 -> lI(668804738, var11 ^ -1554888382);
            default -> lI(668804739, var11 ^ -1851270743);
         });
         var0++;
         if (var37 == 0) {
            var65 = var37;
            var58 = var28;
            var49 = var37;
         } else {
            if (var19 <= var0) {
               String var41 = new String(var28).intern();
               byte var21 = -1;
               Il = var41;
               l = new String[1];
               l();
               II = IlIIllIII.lI(l[0]);
               return;
            }

            var58 = var28;
            var49 = var37;
            var65 = var0;
         }
      }
   }

   public void onInitialize() {
   }

   private static String ll(short var0, char var1, int var2) {
      int var3 = var1 ^ '\uf4a1';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 15811;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '\uf375';
         var10 ^= 14100;
         var10 += 20132;
         var10 += 42048;
         var10 ^= 35834;
         var10 += 720;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static void l() {
      l[0] = Il(Il.toCharArray(), 97889L, lI(668804744, -110531975 ^ -1021894619));
   }

   public static void II(IlIIIIIIl[] var0) {
      I = var0;
   }

   private static String Il(char[] var0, long var1, int var3) {
      int var4 = lI(668804745, 1029743481 ^ 1073163320) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lI(668804746, 1029743481 ^ 1743193413);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }
}
