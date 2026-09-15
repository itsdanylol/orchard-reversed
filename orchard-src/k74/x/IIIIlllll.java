package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIIIlllll {
   I,
   l;

   private static final int[] lI;
   private static final IIIIlllll[] II;
   private static final String[] ll;
   private static final Object[] III;
   private final IIIlIlIl Il;

   private static String II(char var0, byte var1, int var2, int var3, short var4, char var5) {
      int var10 = var2 ^ 307561746;
      char[] var9 = ll[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])III[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         III[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 29519;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 19) {
            default -> 158;
            case 1 -> 210;
            case 2 -> 159;
            case 3 -> 61;
            case 4 -> 245;
            case 5 -> 101;
            case 6 -> 9;
            case 7 -> 211;
            case 8 -> 115;
            case 9 -> 2;
            case 10 -> 131;
            case 11 -> 206;
            case 12 -> 26;
            case 13 -> 147;
            case 14 -> 36;
            case 15 -> 66;
            case 16 -> 136;
            case 17 -> 80;
            case 18 -> 155;
         } ^ 60389 ^ var8 ^ var0 ^ var2 ^ var4 ^ var3 ^ var1 ^ var7 ^ var5);
      }

      return new String(var9).intern();
   }

   private static IIIIlllll[] I() {
      return new IIIIlllll[]{I, l};
   }

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ -1806539545] ^ var1 ^ var0;
      var2 += 63273;
      var2 -= 65385;
      var2 ^= 60476;
      var2 += 57174;
      var2 ^= 57775;
      return var2 - 42094;
   }

   private IIIIlllll(IIIlIlIl var3) {
      this.Il = var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = -874715814;
      byte var20 = -1;
      char[] var15 = "ጮጴ".toCharArray();
      short var13 = 4897;
      String var14 = "ꇚꄛꆃꅂꇆꅟꆨꆯꅌꅴꇃꅡꄙꇞꄥ౩ಂఁ\u0cd2౧ೀౖౘ\u0cff್ౢ೨ಇ\u0c73\u0cba೭ೝಯ\u0c50బల";
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            ll = var16;
            III = new Object[var16.length];
            int var9 = 630542902;
            byte[] var7 = "\u0089+|éï3K¬à7\u001d587fÜ¹èÈ®\u0005*¤äö@c2ç\u0003MÚL\u008f1&t¼àFÛÿoÍ3]\u001d\u009b".getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            lI = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               lI[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[4];
            int var4 = 0;
            String var3;
            int var5 = (var3 = II('埂', (byte)-2, 307561746, -2127006591, (short)9968, 21261)).length();
            int var2 = l(-1806539545, var24 ^ 214908317);
            int var26 = -1;

            label100:
            while (true) {
               int var29 = l(-1806539546, var24 ^ 1792477730);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label95: {
                     char[] var45 = var10001.toCharArray();
                     int var10004 = var45.length;
                     int var6 = 0;
                     int var48 = var29;
                     var41 = var45;
                     int var35 = var10004;
                     char[] var57;
                     int var10006;
                     if (var10004 <= 1) {
                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     } else {
                        var48 = var29;
                        var35 = var10004;
                        if (var10004 <= var6) {
                           break label95;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % l(-1806539549, var24 ^ 1007454681)) {
                           case 0 -> l(-1806539550, var24 ^ -2133924460);
                           case 1 -> l(-1806539551, var24 ^ 1940136510);
                           case 2 -> l(-1806539552, var24 ^ 1659309059);
                           case 3 -> l(-1806539537, var24 ^ -915705687);
                           case 4 -> l(-1806539538, var24 ^ -245849616);
                           case 5 -> l(-1806539539, var24 ^ 1578839616);
                           default -> l(-1806539540, var24 ^ -1229366264);
                        });
                        var6++;
                        if (var48 == 0) {
                           var10006 = var48;
                           var57 = var41;
                           var10004 = var48;
                        } else {
                           if (var35 <= var6) {
                              break;
                           }

                           var57 = var41;
                           var10004 = var48;
                           var10006 = var6;
                        }
                     }
                  }

                  String var50 = new String(var41).intern();
                  switch (var10002) {
                     case 0:
                        var0[var4++] = var50;
                        if ((var26 += var2) >= var5) {
                           I = new IIIIlllll(IlIIllIII.Ill(var0[2]));
                           l = new IIIIlllll(IlIIllIII.Ill(var0[3]));
                           II = I();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var50;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label100;
                        }

                        var5 = (var3 = II('矬', (byte)92, 307561747, -1443157124, (short)-22850, (char)'ﺊ')).length();
                        var2 = l(-1806539547, var24 ^ 1708350531);
                        var26 = -1;
                  }

                  var29 = l(-1806539548, var24 ^ -1110235288);
                  var10001 = var3.substring(++var26, var26 + var2);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 247;
                  case 1 -> 104;
                  case 2 -> 197;
                  case 3 -> 190;
                  case 4 -> 196;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }
}
