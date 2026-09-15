package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIlIIIII implements lIllIIIl {
   I,
   l,
   ll;
   private static final int[] III;
   private final IIIlIlIl II;
   private static final String[] IIl;
   private final boolean Il;
   private static final Object[] IlI;
   private static final IlIlIIIII[] lI;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = 609853161;
      char[] var9 = "#\u000f".toCharArray();
      String var8 = "㽒㽉㿗㿜㾓㾶㿾㾄㿅㽄㼮㾕㽿㽪㾨㼋㿄㼷㽜㽅㼁㾉㿪㾖㾵㼯㿎㼍㿃㾑㽰㾆㾦㼄㽖ꡘꡈ\ua8df꣓ꢉꢪꢢꢷ\ua8ddꡪꠡꢺꡡꡎꢌ";
      byte var14 = -1;
      short var7 = 26654;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            IIl = var10;
            IlI = new Object[var10.length];
            int var22 = 0;
            III = new int[13];
            int var10001 = 0;
            byte[] var10002 = "\u008aú¤»\u008e0W\u001dÃp\u009a*\u0089ó\u008d-\u007f\u008a_/éu3¥\u008c6\u0098\u0088-ÌFY¤ØÜQüÖ\u0094\u0090¶ùH\u009bTrj\u0096â1O\u0004"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               III[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1388292821;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var0 = new String[lI(527830439, var18 ^ -479542845)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ll(2102082308, 1594063399, (short)-32284)).length();
            int var2 = lI(527830438, var18 ^ -408931740);
            int var20 = -1;

            label104:
            while (true) {
               var22 = lI(527830437, var18 ^ -1428095114);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var39 = -1;

               while (true) {
                  label99: {
                     char[] var57 = var27.toCharArray();
                     int var69 = var57.length;
                     int var6 = 0;
                     var55 = var22;
                     var44 = var57;
                     var10001 = var69;
                     char[] var81;
                     int var88;
                     if (var69 <= 1) {
                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     } else {
                        var55 = var22;
                        var10001 = var69;
                        if (var69 <= var6) {
                           break label99;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % lI(527830434, var18 ^ -2132453669)) {
                           case 0 -> lI(527830433, var18 ^ -442040839);
                           case 1 -> lI(527830432, var18 ^ 1146889044);
                           case 2 -> lI(527830447, var18 ^ -850872007);
                           case 3 -> lI(527830446, var18 ^ -1790512762);
                           case 4 -> lI(527830445, var18 ^ -546755110);
                           case 5 -> lI(527830444, var18 ^ 1038225378);
                           default -> lI(527830443, var18 ^ -1952372217);
                        });
                        var6++;
                        if (var55 == 0) {
                           var88 = var55;
                           var81 = var44;
                           var69 = var55;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var81 = var44;
                           var69 = var55;
                           var88 = var6;
                        }
                     }
                  }

                  String var62 = new String(var44).intern();
                  switch (var39) {
                     case 0:
                        var0[var4++] = var62;
                        if ((var20 += var2) >= var5) {
                           ll = new IlIlIIIII(IlIIllIII.Ill(var0[3]));
                           l = new IlIlIIIII(IlIIllIII.Ill(var0[5]), false);
                           I = new IlIlIIIII(IlIIllIII.Ill(var0[2]), false);
                           lI = I();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var62;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label104;
                        }

                        var5 = (var3 = ll(-1074676612, 1594063398, (short)-28209)).length();
                        var2 = lI(527830436, var18 ^ -530323370);
                        var20 = -1;
                  }

                  var22 = lI(527830435, var18 ^ 370817570);
                  var27 = var3.substring(++var20, var20 + var2);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 166;
                  case 1 -> 178;
                  case 2 -> 106;
                  case 3 -> 132;
                  case 4 -> 71;
                  case 5 -> 110;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static IlIlIIIII[] I() {
      return new IlIlIIIII[]{ll, l, I};
   }

   private IlIlIIIII(IIIlIlIl var3, boolean var4) {
      this.II = var3;
      this.Il = var4;
   }

   public static IlIlIIIII l(String var0) {
      return Enum.valueOf(IlIlIIIII.class, var0);
   }

   private static int lI(int var0, int var1) {
      int var2 = III[var0 ^ 527830439] ^ var1 ^ var0;
      var2 ^= 40034;
      var2 -= 48860;
      var2 -= 3817;
      var2 += 64931;
      var2 += 47369;
      var2 -= 46307;
      var2 += 38870;
      var2 -= 2010;
      var2 -= 41727;
      return var2 - 57724;
   }

   @Override
   public boolean II() {
      return this.Il;
   }

   private static String ll(int var0, int var1, short var2) {
      int var7 = var1 ^ 1594063399;
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
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 40370;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ var5 ^ switch (var5 % 14) {
            default -> 29;
            case 1 -> 122;
            case 2 -> 82;
            case 3 -> 194;
            case 4 -> 2;
            case 5 -> 47;
            case 6 -> 195;
            case 7 -> 217;
            case 8 -> 33;
            case 9 -> 49;
            case 10 -> 234;
            case 11 -> 57;
            case 12 -> 45;
            case 13 -> 66;
         } ^ var2 ^ var4 ^ var0 ^ var1);
      }

      return new String(var6).intern();
   }

   @Override
   public Enum<?> Il() {
      return this == ll ? this : ll;
   }

   private IlIlIIIII(IIIlIlIl var3) {
      this(var3, true);
   }

   @Override
   public String toString() {
      return this.II.llIl();
   }
}
