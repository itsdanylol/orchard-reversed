package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lIIllIl {
   I,
   l,
   Il,
   lI,
   ll;

   private static final String[] IlI;
   private static final lIIllIl[] II;
   private static final Object[] Ill;
   private static final int[] IIl;
   private final IIIlIlIl III;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = -1510293589;
      String var14 = "\udab6\uda95\uda8b\uda70\uda51\uda71\udac8\udaea\udaa3\udadd\uda12\udaba\udaf7\udaa0\uda4a\uda6f\uda9b\uda9e\udac8\udacd\uda79\uda46\uda6f\uda85\uda3a\uda61\uda33\udab0\uda13\udae5\udac0\udaae\udafa\uda46\uda1c\uda43\uda31\uda29\uda5a\uda41\udac6\udaa1\uda51\uda69\uda65\uda89\uda34\uda29\uda78\uda7f\uda95\udafe\uda67\udac6\udaea\uda88\uda68\uda3d\uda9d\uda48\uda45\uda83\udae5\uda0f\uda26\uda36\uda28\uda3b券刖刘勻勝劦别剉剘剼劈初剃别努";
      char[] var15 = "D\u000f".toCharArray();
      short var13 = 21652;
      String[] var16 = new String[var15.length];
      byte var20 = -1;

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            IlI = var16;
            Ill = new Object[var16.length];
            int var9 = 2089256681;
            byte[] var7 = "'%\u0000\u0081\u0015,\u0015O`¨\u0012\u0090Èë½,MN5\u0099mN\u0000£Q\bÕ,¡ï{'À¦ß(\u0098ëhÝM8Ò¤\rJ {\u009bk\u0004\u0085\u0093}äMÔ\u0085\u001brýÑ9D"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            IIl = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               IIl[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[II(-1179414208, var24 ^ 1206461576)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il(-1684432539, var24 ^ 1557191477)).length();
            int var2 = 5;
            int var26 = -1;

            label98:
            while (true) {
               int var29 = II(-1179414207, var24 ^ 1977627363);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label93: {
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
                           break label93;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(-1179414204, var24 ^ 763498891)) {
                           case 0 -> II(-1179414203, var24 ^ 226633548);
                           case 1 -> II(-1179414202, var24 ^ 834990447);
                           case 2 -> II(-1179414201, var24 ^ -1054646484);
                           case 3 -> II(-1179414200, var24 ^ -1603601557);
                           case 4 -> II(-1179414199, var24 ^ -131642213);
                           case 5 -> II(-1179414198, var24 ^ 771028248);
                           default -> II(-1179414197, var24 ^ 1837532280);
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
                           ll = new lIIllIl(IlIIllIII.Ill(var0[II(-1179414195, var24 ^ -206454698)]));
                           lI = new lIIllIl(IlIIllIII.Ill(var0[4]));
                           I = new lIIllIl(IlIIllIII.Ill(var0[5]));
                           Il = new lIIllIl(IlIIllIII.Ill(var0[II(-1179414194, var24 ^ -1270268055)]));
                           l = new lIIllIl(IlIIllIII.Ill(var0[2]));
                           II = I();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var50;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label98;
                        }

                        var5 = (var3 = Il(-1684432540, var24 ^ -733874708)).length();
                        var2 = II(-1179414206, var24 ^ 6567573);
                        var26 = -1;
                  }

                  var29 = II(-1179414205, var24 ^ -1473799544);
                  var10001 = var3.substring(++var26, var26 + var2);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 162;
                  case 1 -> 103;
                  case 2 -> 255;
                  case 3 -> 184;
                  case 4 -> 46;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static lIIllIl[] I() {
      return new lIIllIl[]{ll, lI, I, Il, l};
   }

   private lIIllIl(IIIlIlIl var3) {
      this.III = var3;
   }

   public static lIIllIl l(String var0) {
      return Enum.valueOf(lIIllIl.class, var0);
   }

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ -1684432539;
      char[] var4 = IlI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])Ill[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         Ill[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -614497451;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 249;
            case 1 -> 43;
            case 2 -> 228;
            case 3 -> 7;
            case 4 -> 177;
            case 5 -> 33;
            case 6 -> 93;
            case 7 -> 196;
            case 8 -> 131;
            case 9 -> 58;
            case 10 -> 126;
            case 11 -> 120;
            case 12 -> 240;
            case 13 -> 207;
            case 14 -> 162;
            case 15 -> 76;
            case 16 -> 50;
            case 17 -> 150;
            case 18 -> 203;
            case 19 -> 76;
            case 20 -> 78;
            case 21 -> 239;
            case 22 -> 22;
            case 23 -> 220;
            case 24 -> 179;
            case 25 -> 49;
            case 26 -> 185;
            case 27 -> 154;
            case 28 -> 50;
            case 29 -> 8;
            case 30 -> 185;
            case 31 -> 118;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int II(int var0, int var1) {
      int var2 = IIl[var0 ^ -1179414208] ^ var1 ^ var0;
      var2 ^= 19660;
      var2 ^= 40409;
      var2 ^= 55060;
      var2 -= 35556;
      var2 ^= 26623;
      var2 ^= 39476;
      var2 -= 50715;
      return var2 ^ 15576;
   }

   @Override
   public String toString() {
      return this.III.llIl();
   }
}
