package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIlIlIll implements lIllIIIl {
   l,
   II,
   ll,
   III,
   IIl;
   private final boolean I;
   private static final Object[] lII;
   private final IIIlIlIl Il;
   private static final IIlIlIll[] lI;
   private static final String[] Ill;
   private static final int[] IlI;

   private static IIlIlIll[] I() {
      return new IIlIlIll[]{IIl, l, ll, II, III};
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }

   @Override
   public boolean II() {
      return this.I;
   }

   private static int lI(int var0, int var1) {
      int var2 = IlI[var0 ^ 417565248] ^ var1 ^ var0;
      var2 ^= 7634;
      var2 ^= 2655;
      var2 ^= 38065;
      var2 += 13318;
      var2 += 24146;
      var2 -= 49851;
      var2 ^= 37023;
      var2 -= 37076;
      var2 += 9874;
      return var2 ^ 41375;
   }

   private IIlIlIll(IIIlIlIl var3) {
      this(var3, true);
   }

   private IIlIlIll(IIIlIlIl var3, boolean var4) {
      this.Il = var3;
      this.I = var4;
   }

   @Override
   public Enum<?> Il() {
      return this == III ? II : this;
   }

   private static String ll(char var0, int var1, int var2) {
      int var3 = var0 ^ '\ue85e';
      char[] var4 = Ill[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lII[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lII[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 16574;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 13353;
         var10 += 29420;
         var10 -= 36820;
         var10 ^= 49163;
         var10 += 10431;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = -744775250;
      char[] var9 = "䰔䱙".toCharArray();
      String var8 = "岮峦屓岽尊屇岘岯岹岂屫屃岪屵岆岨居岤屘峣岐屗屇尳就尊岸岫屣峌屾岣屈岎峈岗峷尙尨岇岐居屴屸尉岑层岹屘峍岖屏岷屜尽屲岂岿岃峖岾峰岠履峑岭岟岧屧尧尜屌屈岃峉岔峮尀岖尯属岐屉岊\uefb8\uefa3\uef70\uef63\uef25\uefaa\uef81\uef5f\uef7f\uefe6\uefbc\uef80\uef5e\uefb9\uef9f\uef70\uefa7\uefb9\uef97\uefd9\uefa8\uef82\uef08\uef6c\uef29";
      short var7 = 19520;
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            Ill = var10;
            lII = new Object[var10.length];
            IlI = new int[16];
            int var22 = 0;
            int var10001 = 0;
            byte[] var10002 = "z®±±±\u009fb·7\u000b\u0088jøÏ^\u008cõÇß\u008c\u0087û÷»:õ`-pµmB3+\u0005õ\u0011\u009dö\u0081^,ÙéDæ´\u0096)6\r²¦\u0098\u009dtf\\ìTÇ¹\u000b\u008e"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               IlI[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1740769998;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var0 = new String[lI(417565248, var18 ^ -703211514)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = ll('\ue85e', 21429, var18 ^ 2011756618)).length();
            int var2 = lI(417565249, var18 ^ 488901378);
            int var20 = -1;

            label103:
            while (true) {
               var22 = lI(417565250, var18 ^ -1682905444);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var39 = -1;

               while (true) {
                  label98: {
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
                           break label98;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % lI(417565253, var18 ^ 725655050)) {
                           case 0 -> lI(417565254, var18 ^ -1773270648);
                           case 1 -> lI(417565255, var18 ^ -603061677);
                           case 2 -> lI(417565256, var18 ^ -1617925366);
                           case 3 -> lI(417565257, var18 ^ -1121542344);
                           case 4 -> 1;
                           case 5 -> lI(417565258, var18 ^ -224939994);
                           default -> lI(417565259, var18 ^ -396502125);
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
                           IIl = new IIlIlIll(IlIIllIII.Ill(var0[lI(417565260, var18 ^ -2054331382)]));
                           l = new IIlIlIll(IlIIllIII.Ill(var0[lI(417565261, var18 ^ 170128578)]));
                           ll = new IIlIlIll(IlIIllIII.Ill(var0[lI(417565262, var18 ^ -890796561)]));
                           II = new IIlIlIll(IlIIllIII.Ill(var0[lI(417565263, var18 ^ 1795318327)]));
                           III = new IIlIlIll(IlIIllIII.Ill(var0[3]), false);
                           lI = I();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var62;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label103;
                        }

                        var5 = (var3 = ll('\ue85f', 8687, var18 ^ 377878471)).length();
                        var2 = lI(417565251, var18 ^ 1416902462);
                        var20 = -1;
                  }

                  var22 = lI(417565252, var18 ^ 1501344119);
                  var27 = var3.substring(++var20, var20 + var2);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 31;
                  case 1 -> 243;
                  case 2 -> 31;
                  case 3 -> 51;
                  case 4 -> 134;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public static IIlIlIll l(String var0) {
      return Enum.valueOf(IIlIlIll.class, var0);
   }
}
