package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IlIIlIlI {
   I,
   l;

   private static final Object[] III;
   private final IIIlIlIl II;
   private static final int[] lI;
   private static final String[] ll;
   private static final IlIIlIlI[] Il;

   @Override
   public String toString() {
      return this.II.llIl();
   }

   private IlIIlIlI(IIIlIlIl var3) {
      this.II = var3;
   }

   private static String II(char var0, int var1, char var2) {
      int var3 = var2 ^ 27147;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 19105;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '豸';
         var10 ^= 42563;
         var10 ^= 50898;
         var10 -= 16905;
         var10 -= 19789;
         var10 += 62664;
         var10 -= 47813;
         var10 ^= 40126;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = -1969107233;
      short var13 = 24016;
      byte var20 = -1;
      char[] var15 = "巟巟".toCharArray();
      String var14 = "\udd72\udf09\udd1a\udd4a\udf8b\udd76\udf48\udd18\udf95\udd7a\udd4f\udf52\udeed\udd48\udf99뚱뙜뛰뛏뛋뚉뒜뚉뚳뚲뛂뙐뛣둋뚊";
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            ll = var16;
            III = new Object[var16.length];
            int var9 = -217425848;
            byte[] var7 = "Ë-°ì¤tÂ¾è\u008aC5\u0091wð\u0002\u009fÑ\u0016\u0082y_¶(pü\\q\u00059»äû\u000e(t\u0099tj«µ¶}ªB\u009eQÓ".getBytes("ISO-8859-1");
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
            int var5 = (var3 = II('쪌', var24 ^ 557180824, '樋')).length();
            int var2 = l(-649426131, var24 ^ 1808541006);
            int var26 = -1;

            label100:
            while (true) {
               int var29 = l(-649426132, var24 ^ 76896089);
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
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % l(-649426135, var24 ^ 1060143897)) {
                           case 0 -> l(-649426136, var24 ^ -641850389);
                           case 1 -> l(-649426133, var24 ^ -803354214);
                           case 2 -> l(-649426134, var24 ^ -1512559028);
                           case 3 -> l(-649426139, var24 ^ 1542438220);
                           case 4 -> l(-649426140, var24 ^ 966131520);
                           case 5 -> l(-649426137, var24 ^ 358082619);
                           default -> l(-649426138, var24 ^ -494943005);
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
                           l = new IlIIlIlI(IlIIllIII.Ill(var0[0]));
                           I = new IlIIlIlI(IlIIllIII.Ill(var0[3]));
                           Il = I();
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

                        var5 = (var3 = II('㱄', var24 ^ -1366128364, '樊')).length();
                        var2 = l(-649426129, var24 ^ 1215026859);
                        var26 = -1;
                  }

                  var29 = l(-649426130, var24 ^ 831940067);
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
                  default -> 153;
                  case 1 -> 105;
                  case 2 -> 236;
                  case 3 -> 135;
                  case 4 -> 144;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static IlIIlIlI[] I() {
      return new IlIIlIlI[]{l, I};
   }

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ -649426131] ^ var1 ^ var0;
      var2 -= 3104;
      var2 += 21394;
      var2 -= 29699;
      var2 ^= 13787;
      var2 -= 49694;
      var2 += 45968;
      var2 ^= 34780;
      return var2 ^ 55322;
   }
}
