package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIlIIlIlI {
   I,
   II,
   ll;
   private static final IIlIIlIlI[] l;
   private static final int[] III;
   private static final String[] IIl;
   private static final Object[] IlI;
   private final boolean Il;
   private final boolean lI;

   boolean I() {
      return this.lI;
   }

   private static String ll(int var0, int var1, byte var2) {
      int var7 = var0 ^ 945638796;
      char[] var6 = IIl[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])IlI[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         IlI[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 63365;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ switch (var5 % 27) {
            default -> 93;
            case 1 -> 205;
            case 2 -> 49;
            case 3 -> 2;
            case 4 -> 72;
            case 5 -> 216;
            case 6 -> 2;
            case 7 -> 15;
            case 8 -> 197;
            case 9 -> 76;
            case 10 -> 171;
            case 11 -> 232;
            case 12 -> 83;
            case 13 -> 99;
            case 14 -> 34;
            case 15 -> 12;
            case 16 -> 141;
            case 17 -> 70;
            case 18 -> 175;
            case 19 -> 143;
            case 20 -> 215;
            case 21 -> 195;
            case 22 -> 193;
            case 23 -> 248;
            case 24 -> 192;
            case 25 -> 221;
            case 26 -> 109;
         } ^ var5 ^ 37300 ^ var4 ^ var0 ^ var1 ^ var2);
      } while (++var5 < var6.length);

      return new String(var6).intern();
   }

   public static IIlIIlIlI l(String var0) {
      return Enum.valueOf(IIlIIlIlI.class, var0);
   }

   boolean II() {
      return this.Il;
   }

   private IIlIIlIlI(boolean var3, boolean var4) {
      this.lI = var3;
      this.Il = var4;
   }

   private static int lI(int var0, int var1) {
      int var2 = III[var0 ^ 53288058] ^ var1 ^ var0;
      var2 -= 17377;
      var2 -= 43991;
      var2 += 31324;
      var2 += 63844;
      var2 ^= 48897;
      var2 += 2054;
      var2 ^= 47240;
      var2 += 36132;
      var2 ^= 19224;
      return var2 + 39413;
   }

   private static IIlIIlIlI[] Il() {
      return new IIlIIlIlI[]{I, ll, II};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = -1531025070;
      short var13 = 23234;
      char[] var15 = "嫖".toCharArray();
      byte var20 = -1;
      String var14 = "ꨲꩋ\uaa3eꪄꫦ\uaad5꩹ꫝꪵ\uaad7ꨛꫮ꩓ꪸꩉꪀꨱ꩓ꪧꨒ";
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            IIl = var16;
            IlI = new Object[var16.length];
            int var9 = -730579475;
            byte[] var7 = ";\u0015:;ä¸õj%Ô\u0017©ùÖÍ\u001d\u0002ú\f\u0012ES÷ôqý\u0005¨Ïgç¸\u008a\u000eo2¢xî9".getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            III = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               III[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[3];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ll(945638796, 2133827618, (byte)-9)).length();
            int var2 = lI(53288058, var24 ^ -1223922017);
            int var1 = -1;

            while (true) {
               char[] var10002;
               label85: {
                  int var28 = lI(53288059, var24 ^ 1755420206);
                  char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
                  int var10004 = var10003.length;
                  int var6 = 0;
                  int var34 = var28;
                  var10002 = var10003;
                  int var29 = var10004;
                  char[] var10005;
                  int var10006;
                  if (var10004 <= 1) {
                     var10005 = var10003;
                     var10004 = var28;
                     var10006 = var6;
                  } else {
                     var34 = var28;
                     var29 = var10004;
                     if (var10004 <= var6) {
                        break label85;
                     }

                     var10005 = var10003;
                     var10004 = var28;
                     var10006 = var6;
                  }

                  while (true) {
                     var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % lI(53288056, var24 ^ -1446165745)) {
                        case 0 -> lI(53288057, var24 ^ 1976544850);
                        case 1 -> lI(53288062, var24 ^ -1897697368);
                        case 2 -> lI(53288063, var24 ^ -917859138);
                        case 3 -> lI(53288060, var24 ^ -35363121);
                        case 4 -> lI(53288061, var24 ^ 1132365022);
                        case 5 -> lI(53288050, var24 ^ 102173813);
                        default -> lI(53288051, var24 ^ 778145131);
                     });
                     var6++;
                     if (var34 == 0) {
                        var10006 = var34;
                        var10005 = var10002;
                        var10004 = var34;
                     } else {
                        if (var29 <= var6) {
                           break;
                        }

                        var10005 = var10002;
                        var10004 = var34;
                        var10006 = var6;
                     }
                  }
               }

               String var36 = new String(var10002).intern();
               byte var31 = -1;
               var0[var4++] = var36;
               if ((var1 += var2) >= var5) {
                  I = new IIlIIlIlI(false, false);
                  ll = new IIlIIlIlI(true, false);
                  II = new IIlIIlIlI(true, true);
                  l = Il();
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 205;
                  case 1 -> 64;
                  case 2 -> 220;
                  case 3 -> 79;
                  case 4 -> 97;
                  case 5 -> 197;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }
}
