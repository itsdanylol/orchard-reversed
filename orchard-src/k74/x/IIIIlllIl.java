package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIIIlllIl {
   I,
   II;

   private static final Object[] III;
   private static final String[] ll;
   private final IIIlIlIl l;
   private static final int[] lI;
   private static final IIIIlllIl[] Il;

   private IIIIlllIl(IIIlIlIl var3) {
      this.l = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -313013877;
      int var10 = 0;
      int var8 = "\u0015철鄉쭼\u31ee쬮鄠쨶↭죡\ue164좶녣쥄셬ᛰ鄌쮬ꇭ챞釾ᖖ\u0015㓔ꗲ㏨ꔕ㕪\uf50b㋒敔㏅閟㿂疑㑰䖖㽤ꗳ㛈\ue516㓚픊㻢".length();
      int var11 = 0;
      short var12 = 31065;
      String var7 = "\u0015철鄉쭼\u31ee쬮鄠쨶↭죡\ue164좶녣쥄셬ᛰ鄌쮬ꇭ챞釾ᖖ\u0015㓔ꗲ㏨ꔕ㕪\uf50b㋒敔㏅閟㿂疑㑰䖖㽤ꗳ㛈\ue516㓚픊㻢";
      String[] var9 = new String[2];

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 97;
               case 1 -> 192;
               case 2 -> 173;
               case 3 -> 39;
               case 4 -> 175;
               case 5 -> 53;
               case 6 -> 167;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      lI = new int[12];
      int var21 = 0;
      int var10001 = 0;
      byte[] var10002 = "\u0003\u0014ß/0z°K\u0092\u0015\u001aªÌ\u0017ërÑ·e\fóPúÙjº\t\u009e±ªßgÓ¾\u0019;ìâmuc¢i\u0094lÇä\u001d".getBytes("ISO-8859-1");

      int var54;
      do {
         lI[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1008093328;
         var21 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(60589, 'ꁁ', var17 ^ 737266284)).length();
      int var2 = II(-1281016370, var17 ^ -1643298726);
      int var19 = -1;

      label105:
      while (true) {
         var21 = II(-1281016369, var17 ^ -1386008809);
         String var26 = var3.substring(++var19, var19 + var2);
         byte var38 = -1;

         while (true) {
            label100: {
               char[] var56 = var26.toCharArray();
               int var68 = var56.length;
               int var6 = 0;
               var54 = var21;
               var43 = var56;
               var10001 = var68;
               char[] var80;
               int var87;
               if (var68 <= 1) {
                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               } else {
                  var54 = var21;
                  var10001 = var68;
                  if (var68 <= var6) {
                     break label100;
                  }

                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % II(-1281016374, var17 ^ 1286535804)) {
                     case 0 -> II(-1281016373, var17 ^ 1850303926);
                     case 1 -> II(-1281016376, var17 ^ -140273953);
                     case 2 -> II(-1281016375, var17 ^ 749944884);
                     case 3 -> II(-1281016378, var17 ^ 1319601782);
                     case 4 -> II(-1281016377, var17 ^ 1912336941);
                     case 5 -> II(-1281016380, var17 ^ -21236067);
                     default -> II(-1281016379, var17 ^ -237077678);
                  });
                  var6++;
                  if (var54 == 0) {
                     var87 = var54;
                     var80 = var43;
                     var68 = var54;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var80 = var43;
                     var68 = var54;
                     var87 = var6;
                  }
               }
            }

            String var61 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var0[var4++] = var61;
                  if ((var19 += var2) >= var5) {
                     II = new IIIIlllIl(IlIIllIII.Ill(var0[1]));
                     I = new IIIIlllIl(IlIIllIII.Ill(var0[3]));
                     Il = l();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var61;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label105;
                  }

                  var5 = (var3 = Il(60588, '嶨', var17 ^ -1815445093)).length();
                  var2 = II(-1281016372, var17 ^ 252478941);
                  var19 = -1;
            }

            var21 = II(-1281016371, var17 ^ 1359901787);
            var26 = var3.substring(++var19, var19 + var2);
            var38 = 0;
         }
      }
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ -1281016370] ^ var1 ^ var0;
      var2 -= 47513;
      var2 -= 32301;
      var2 -= 27130;
      var2 += 54091;
      var2 -= 38590;
      var2 -= 51928;
      var2 ^= 2623;
      return var2 - 42498;
   }

   private static String Il(int var0, char var1, int var2) {
      int var3 = var0 ^ 60589;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 13777;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '쳿';
         var10 ^= 22230;
         var10 -= 22945;
         var10 += 39615;
         var10 -= 54290;
         var10 += 23331;
         var10 ^= 20596;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static IIIIlllIl I(String var0) {
      return Enum.valueOf(IIIIlllIl.class, var0);
   }

   private static IIIIlllIl[] l() {
      return new IIIIlllIl[]{II, I};
   }
}
