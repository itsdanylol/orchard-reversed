package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum llIIllI {
   I,
   Il;
   private static final Object[] III;
   private static final llIIllI[] l;
   private static final int[] lI;
   private static final String[] ll;
   private final IIIlIlIl II;

   private static String II(int var0, char var1, short var2) {
      int var3 = var1 ^ 12079;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 20189;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 14346;
         var10 -= 4112;
         var10 += 48438;
         var10 ^= 43311;
         var10 += 55073;
         var10 ^= 57488;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 590483243;
      short var12 = 21406;
      int var10 = 0;
      int var11 = 0;
      String[] var9 = new String[2];
      int var8 = "\u0014ꊕ쩽ꊮ⪖ꂟ\uea33ꀂગꗹ⨴ꗣૐꛝ\uea84ꔭ䩺ꉾઞꘇ訬\u000f侁ᧈ䳊㤶䵣릆䶞礷䷽列䢿\ud968侙拉䨁".length();
      String var7 = "\u0014ꊕ쩽ꊮ⪖ꂟ\uea33ꀂગꗹ⨴ꗣૐꛝ\uea84ꔭ䩺ꉾઞꘇ訬\u000f侁ᧈ䳊㤶䵣릆䶞礷䷽列䢿\ud968侙拉䨁";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 31;
               case 1 -> 235;
               case 2 -> 180;
               case 3 -> 9;
               case 4 -> 85;
               case 5 -> 175;
               case 6 -> 24;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      int var21 = 0;
      int var10001 = 0;
      lI = new int[12];
      byte[] var10002 = "ÙULaÝ\u0088jú\tÆ¨v\n\u001f£ÒRÃ#Ç©Òò\u008f°A¶èY\u0012µ²c\u001c¼\u0083<\u008b$<ÞZ¬#ÔÐÂ\r".getBytes("ISO-8859-1");

      int var54;
      do {
         lI[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 2091700694;
         var21 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(var17 ^ -888666371, '⼯', (short)25860)).length();
      int var2 = l(739675616, var17 ^ -1428367425);
      int var19 = -1;

      label103:
      while (true) {
         var21 = l(739675617, var17 ^ -1375604436);
         String var26 = var3.substring(++var19, var19 + var2);
         byte var38 = -1;

         while (true) {
            label98: {
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
                     break label98;
                  }

                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % l(739675620, var17 ^ 558544912)) {
                     case 0 -> l(739675621, var17 ^ -631543663);
                     case 1 -> l(739675622, var17 ^ -1010291385);
                     case 2 -> l(739675623, var17 ^ 714812957);
                     case 3 -> l(739675624, var17 ^ 278210425);
                     case 4 -> l(739675625, var17 ^ 1325580270);
                     case 5 -> l(739675626, var17 ^ -1378666548);
                     default -> l(739675627, var17 ^ -1487316529);
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
                     I = new llIIllI(IlIIllIII.Ill(var0[2]));
                     Il = new llIIllI(IlIIllIII.Ill(var0[0]));
                     l = I();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var61;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label103;
                  }

                  var5 = (var3 = II(var17 ^ 2015848581, '⼮', (short)30574)).length();
                  var2 = l(739675618, var17 ^ 2052010926);
                  var19 = -1;
            }

            var21 = l(739675619, var17 ^ 2039888358);
            var26 = var3.substring(++var19, var19 + var2);
            var38 = 0;
         }
      }
   }

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ 739675616] ^ var1 ^ var0;
      var2 -= 5161;
      var2 -= 56515;
      var2 -= 10635;
      var2 -= 60262;
      var2 -= 44928;
      var2 += 4227;
      var2 -= 6069;
      var2 ^= 31260;
      return var2 + 35300;
   }

   private llIIllI(IIIlIlIl var3) {
      this.II = var3;
   }

   private static llIIllI[] I() {
      return new llIIllI[]{I, Il};
   }

   @Override
   public String toString() {
      return this.II.llIl();
   }
}
