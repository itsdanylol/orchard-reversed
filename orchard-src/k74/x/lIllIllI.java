package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lIllIllI {
   I,
   lI;

   private static final int[] III;
   private final IIIlIlIl l;
   private static final String[] IIl;
   private static final Object[] IlI;
   private final double II;
   private final long Il;
   private static final lIllIllI[] ll;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -1363917225;
      int var8 = "\u0016㗉餲㳹ꤲ㗙㤸㧉餸㲹ꤿ㯹\ue939㹉\ue938㲉ा㯙ꤸ㿹뤶㨩夿\u0014鲶皛鋶횘鿖Ꚓ魦\uf69f鋶蚒餶\ue69b閆隙閆\uf692零暟魶ꚛ".length();
      int var11 = 0;
      short var12 = 27882;
      String[] var9 = new String[2];
      int var10 = 0;
      String var7 = "\u0016㗉餲㳹ꤲ㗙㤸㧉餸㲹ꤿ㯹\ue939㹉\ue938㲉ा㯙ꤸ㿹뤶㨩夿\u0014鲶皛鋶횘鿖Ꚓ魦\uf69f鋶蚒餶\ue69b閆隙閆\uf692零暟魶ꚛ";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

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

      IIl = var9;
      IlI = new Object[var9.length];
      III = new int[12];
      int var10000 = 0;
      int var10001 = 0;
      byte[] var10002 = "OÝúW_\u009bê<\tð\u0003\u0099o\rZ\u0005\u0086°V\u0099CS?pÐÌ\u0095\u001eN¯Öc\u0012h8#\u00934¶'´\tª(\fjÒe".getBytes("ISO-8859-1");

      int var52;
      do {
         III[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 2050202107;
         var10000 += 1;
         var52 = var10001 + 4;
         var10001 += 4;
      } while (var52 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ll(var17 ^ 1587556239, 38399, '蝑')).length();
      int var2 = lI(1846857964, var17 ^ -179415389);
      int var19 = -1;

      label92:
      while (true) {
         var10000 = lI(1846857965, var17 ^ -452442424);
         String var24 = var3.substring(++var19, var19 + var2);
         byte var36 = -1;

         while (true) {
            label87: {
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
                     break label87;
                  }

                  var78 = var54;
                  var66 = var10000;
                  var85 = var6;
               }

               while (true) {
                  var78[var85] = (char)(var78[var85] ^ var66 ^ switch (var6 % lI(1846857960, var17 ^ 1008991738)) {
                     case 0 -> lI(1846857961, var17 ^ -104819840);
                     case 1 -> lI(1846857962, var17 ^ 1784625581);
                     case 2 -> lI(1846857963, var17 ^ -197362363);
                     case 3 -> lI(1846857956, var17 ^ -1459907763);
                     case 4 -> lI(1846857957, var17 ^ 698817869);
                     case 5 -> lI(1846857958, var17 ^ 244975257);
                     default -> lI(1846857959, var17 ^ -1225164504);
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
                     lI = new lIllIllI(IlIIllIII.Ill(var0[2]), 250L, 2.0);
                     I = new lIllIllI(IlIIllIII.Ill(var0[0]), 200L, 2.0);
                     ll = l();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var59;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label92;
                  }

                  var5 = (var3 = ll(var17 ^ 760622604, 38398, '\ueac5')).length();
                  var2 = lI(1846857966, var17 ^ -1285312657);
                  var19 = -1;
            }

            var10000 = lI(1846857967, var17 ^ -711002391);
            var24 = var3.substring(++var19, var19 + var2);
            var36 = 0;
         }
      }
   }

   private static int lI(int var0, int var1) {
      int var2 = III[var0 ^ 1846857964] ^ var1 ^ var0;
      var2 += 5841;
      var2 ^= 13252;
      var2 += 7355;
      var2 += 34133;
      var2 -= 6196;
      var2 -= 23749;
      return var2 ^ 46676;
   }

   public long I() {
      return this.Il;
   }

   private lIllIllI(IIIlIlIl var3, long var4, double var6) {
      this.l = var3;
      this.Il = var4;
      this.II = var6;
   }

   private static String ll(int var0, int var1, char var2) {
      int var3 = var1 ^ 38399;
      char[] var4 = IIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 7348;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '\ueb06';
         var10 ^= 30505;
         var10 -= 16188;
         var10 -= 50902;
         var10 += 60664;
         var10 ^= 26927;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static lIllIllI[] l() {
      return new lIllIllI[]{lI, I};
   }

   public static lIllIllI II(String var0) {
      return Enum.valueOf(lIllIllI.class, var0);
   }

   public double Il() {
      return this.II;
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }
}
