package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIIlllll {
   I,
   II,
   lI;
   private static final Object[] IIl;
   private static final IlIIlllll[] l;
   private final IIIIIlIl Il;
   private static final int[] ll;
   private static final String[] III;

   private static String Il(short var0, char var1, short var2, int var3, byte var4, int var5) {
      int var10 = var3 ^ 1443329097;
      char[] var9 = III[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])IIl[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         IIl[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 59413;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ '\uf122' ^ var0 ^ var7 ^ var2 ^ var3 ^ var4 ^ var1 ^ var5);
      }

      return new String(var9).intern();
   }

   private static IlIIlllll[] I() {
      return new IlIIlllll[]{II, I, lI};
   }

   private IlIIlllll(IIIIIlIl var3) {
      this.Il = var3;
   }

   @Override
   public String toString() {
      return this.Il.toString();
   }

   public static IlIIlllll l(String var0) {
      return Enum.valueOf(IlIIlllll.class, var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -1916056287;
      short var12 = 6476;
      String[] var9 = new String[1];
      int var11 = 0;
      int var10001 = "\u000f꺸昫ꪸ个Ꞹ踫궘鸪ꯘ\ue629꿘ห\uaa38\uf62aꚸ".length();
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\u000f꺸昫ꪸ个Ꞹ踫궘鸪ꯘ\ue629꿘ห\uaa38\uf62aꚸ";

      do {
         char var13 = var7.charAt(var11);
         var10001 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002 + var13).toCharArray();

         do {
            char var16 = var14[var15];
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

      III = var9;
      IIl = new Object[var9.length];
      ll = new int[8];
      int var10000 = 0;
      int var21 = 0;
      byte[] var28 = "RqR\u001aß\u0018\u009eùÓ¥\rLQÏÁtwu<R\u0010\u0085aìoÆW\u0086ö\u001fmÄ".getBytes("ISO-8859-1");

      int var44;
      do {
         ll[var10000] = ((var28[var21] & 255) << 24 | (var28[var21 + 1] & 255) << 16 | (var28[var21 + 2] & 255) << 8 | var28[var21 + 3] & 255) ^ 477624039;
         var10000 += 1;
         var44 = var21 + 4;
         var21 += 4;
      } while (var44 < var28.length);

      String[] var0 = new String[3];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il((short)-6551, 4489, (short)16600, 1443329097, (byte)-95, -844220242)).length();
      char var2 = 4;
      int var1 = -1;

      while (true) {
         label77: {
            var10000 = II(1693043820, var17 ^ 1490715164);
            char[] var45 = var3.substring(++var1, var1 + var2).toCharArray();
            int var55 = var45.length;
            int var6 = 0;
            var44 = var10000;
            var34 = var45;
            var21 = var55;
            char[] var64;
            int var71;
            if (var55 <= 1) {
               var64 = var45;
               var55 = var10000;
               var71 = var6;
            } else {
               var44 = var10000;
               var21 = var55;
               if (var55 <= var6) {
                  break label77;
               }

               var64 = var45;
               var55 = var10000;
               var71 = var6;
            }

            while (true) {
               var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % II(1693043821, var17 ^ -709669133)) {
                  case 0 -> II(1693043822, var17 ^ -653337260);
                  case 1 -> 2;
                  case 2 -> II(1693043823, var17 ^ 1533284692);
                  case 3 -> II(1693043816, var17 ^ 2111761532);
                  case 4 -> II(1693043817, var17 ^ 439267607);
                  case 5 -> II(1693043818, var17 ^ 1701676817);
                  default -> II(1693043819, var17 ^ -55263771);
               });
               var6++;
               if (var44 == 0) {
                  var71 = var44;
                  var64 = var34;
                  var55 = var44;
               } else {
                  if (var21 <= var6) {
                     break;
                  }

                  var64 = var34;
                  var55 = var44;
                  var71 = var6;
               }
            }
         }

         String var48 = new String(var34).intern();
         byte var27 = -1;
         var0[var4++] = var48;
         if ((var1 += var2) >= var5) {
            II = new IlIIlllll(IIIIIlIl.lI);
            I = new IlIIlllll(IIIIIlIl.IIl);
            lI = new IlIIlllll(IIIIIlIl.ll);
            l = I();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static int II(int var0, int var1) {
      int var2 = ll[var0 ^ 1693043820] ^ var1 ^ var0;
      var2 += 41564;
      var2 += 48762;
      var2 += 21584;
      var2 -= 41353;
      var2 += 48799;
      var2 -= 17392;
      return var2 ^ 13802;
   }
}
