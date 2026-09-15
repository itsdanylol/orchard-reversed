package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IlIIlIll {
   I,
   l;

   private static final int[] lI;
   private static final Object[] III;
   private static final IlIIlIll[] II;
   private static final String[] ll;
   private final IIIlIlIl Il;

   private static IlIIlIll[] I() {
      return new IlIIlIll[]{I, l};
   }

   private IlIIlIll(IIIlIlIl var3) {
      this.Il = var3;
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 633046228;
      int var10001 = "\u001c㱢傉も㢊Ⰲ墊㌢炍㨂碍㢂뢏㸂肊⒂\ue88a⇢梉㶢\uf88a㋂ႋ⍢ႉ⚢ꂋ⇂₉\u000f\uef78瘼\ue358︾８긾\ue7b8⸹\ue1f8䘸\ue678츸\uefb8⸾\uf778".length();
      short var18 = 991;
      int var17 = 0;
      String[] var15 = new String[2];
      int var14 = var10001;
      String var13 = "\u001c㱢傉も㢊Ⰲ墊㌢炍㨂碍㢂뢏㸂肊⒂\ue88a⇢梉㶢\uf88a㋂ႋ⍢ႉ⚢ꂋ⇂₉\u000f\uef78瘼\ue358︾８긾\ue7b8⸹\ue1f8䘸\ue678츸\uefb8⸾\uf778";
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var10002 = var17 + 1 + var19;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002).toCharArray();

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

      ll = var15;
      III = new Object[var15.length];
      int var9 = 1091749650;
      byte[] var7 = "\u0019ø\u000f\u009a\u008bîüQÏâ\u0083*\u000b£Ø¨\\ñL\u008c\b¢a1§É\u0004\u009ev)SK)\u0004(ÿ\u001b\u0016\u007f\u0016Î\u0091X\u0081]\u008c\u009d\u008f"
         .getBytes("ISO-8859-1");
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
      int var5 = (var3 = II(507175203, var23 ^ 35638350)).length();
      int var2 = l(1681277822, var23 ^ 426245959);
      int var25 = -1;

      label85:
      while (true) {
         int var10000 = l(1681277823, var23 ^ -1955525523);
         String var29 = var3.substring(++var25, var25 + var2);
         byte var36 = -1;

         while (true) {
            label80: {
               char[] var45 = var29.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var10000;
               var41 = var45;
               var10001 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var48 = var10000;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label80;
                  }

                  var57 = var45;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % l(1681277818, var23 ^ 1550761036)) {
                     case 0 -> l(1681277819, var23 ^ 138252549);
                     case 1 -> l(1681277816, var23 ^ -1487473449);
                     case 2 -> l(1681277817, var23 ^ 1991680970);
                     case 3 -> l(1681277814, var23 ^ 698079276);
                     case 4 -> l(1681277815, var23 ^ 461999981);
                     case 5 -> l(1681277812, var23 ^ -837900086);
                     default -> l(1681277813, var23 ^ 1561554431);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var57 = var41;
                     var10004 = var48;
                     var10006 = var6;
                  }
               }
            }

            String var50 = new String(var41).intern();
            switch (var36) {
               case 0:
                  var0[var4++] = var50;
                  if ((var25 += var2) >= var5) {
                     I = new IlIIlIll(IlIIllIII.Ill(var0[2]));
                     l = new IlIIlIll(IlIIllIII.Ill(var0[0]));
                     II = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var50;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label85;
                  }

                  var5 = (var3 = II(507175202, var23 ^ -722029774)).length();
                  var2 = l(1681277820, var23 ^ -813861907);
                  var25 = -1;
            }

            var10000 = l(1681277821, var23 ^ 188491887);
            var29 = var3.substring(++var25, var25 + var2);
            var36 = 0;
         }
      }
   }

   private static String II(int var0, int var1) {
      int var3 = var0 ^ 507175203;
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])III[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         III[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1588148094;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 65;
            case 1 -> 206;
            case 2 -> 5;
            case 3 -> 188;
            case 4 -> 156;
            case 5 -> 185;
            case 6 -> 81;
            case 7 -> 9;
            case 8 -> 44;
            case 9 -> 8;
            case 10 -> 76;
            case 11 -> 32;
            case 12 -> 20;
            case 13 -> 139;
            case 14 -> 201;
            case 15 -> 206;
            case 16 -> 200;
            case 17 -> 169;
            case 18 -> 12;
            case 19 -> 254;
            case 20 -> 105;
            case 21 -> 190;
            case 22 -> 228;
            case 23 -> 255;
            case 24 -> 176;
            case 25 -> 155;
            case 26 -> 169;
            case 27 -> 218;
            case 28 -> 98;
            case 29 -> 113;
            case 30 -> 18;
            case 31 -> 63;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ 1681277822] ^ var1 ^ var0;
      var2 ^= 27893;
      var2 ^= 61606;
      var2 -= 57805;
      var2 += 16193;
      var2 += 51871;
      var2 ^= 15415;
      var2 += 51520;
      var2 -= 26780;
      var2 -= 14100;
      return var2 - 53758;
   }
}
