package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIlIIlll {
   I;

   private static final Object[] ll;
   private static final int[] Il;
   private static final String[] lI;
   private final IIIlIlIl l;
   private static final IIlIIlll[] II;

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private static String Il(byte var0, int var1, byte var2, char var3) {
      int var8 = var1 ^ -311037098;
      char[] var7 = lI[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])ll[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         ll[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 37281;

      for (int var6 = 0; var6 < var7.length; var6++) {
         var7[var6] = (char)(var7[var6] ^ switch (var6 % 8) {
            default -> 118;
            case 1 -> 91;
            case 2 -> 246;
            case 3 -> 170;
            case 4 -> 96;
            case 5 -> 222;
            case 6 -> 192;
            case 7 -> 64;
         } ^ 50364 ^ var0 ^ var5 ^ var3 ^ var2 ^ var1);
      }

      return new String(var7).intern();
   }

   public IIIlIlIl I() {
      return this.l;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 1454473125;
      int var10 = 0;
      int var8 = "\u0015렛缃견靭뷫꽍ꊛ뜀빌\uf769\ua4cb\uf74d낻\uf704ꡌ\uf76a묋齋\ua95b漄눬".length();
      int var11 = 0;
      String[] var10001 = new String[1];
      short var12 = 14453;
      String[] var9 = var10001;
      String var7 = "\u0015렛缃견靭뷫꽍ꊛ뜀빌\uf769\ua4cb\uf74d낻\uf704ꡌ\uf76a묋齋\ua95b漄눬";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 37;
               case 1 -> 175;
               case 2 -> 178;
               case 3 -> 199;
               case 4 -> 245;
               case 5 -> 231;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      lI = var9;
      ll = new Object[var9.length];
      int var20 = 0;
      Il = new int[9];
      byte var22 = 0;
      byte[] var10002 = "§¡à\u0011\u000bH\u000eÌõíD'Õ%'X×\"©\u000e\u0016\u0098·k£\u00ad½$\u0011fixñ$ {".getBytes("ISO-8859-1");

      int var44;
      do {
         Il[var20] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ -1236684743;
         var20 += 1;
         var44 = var22 + 4;
         var22 += 4;
      } while (var44 < var10002.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il((byte)-114, -311037098, (byte)-12, '棐')).length();
      int var2 = II(-520185638, var17 ^ 1482242655);
      int var1 = -1;

      while (true) {
         label86: {
            var20 = II(-520185637, var17 ^ -189738118);
            char[] var45 = var3.substring(++var1, var1 + var2).toCharArray();
            int var55 = var45.length;
            int var6 = 0;
            var44 = var20;
            var34 = var45;
            int var26 = var55;
            char[] var64;
            int var71;
            if (var55 <= 1) {
               var64 = var45;
               var55 = var20;
               var71 = var6;
            } else {
               var44 = var20;
               var26 = var55;
               if (var55 <= var6) {
                  break label86;
               }

               var64 = var45;
               var55 = var20;
               var71 = var6;
            }

            while (true) {
               var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % II(-520185640, var17 ^ 169188946)) {
                  case 0 -> II(-520185639, var17 ^ 719190758);
                  case 1 -> II(-520185634, var17 ^ 685405005);
                  case 2 -> II(-520185633, var17 ^ -379556575);
                  case 3 -> II(-520185636, var17 ^ 1549100914);
                  case 4 -> 3;
                  case 5 -> II(-520185635, var17 ^ -291589328);
                  default -> II(-520185646, var17 ^ 249330217);
               });
               var6++;
               if (var44 == 0) {
                  var71 = var44;
                  var64 = var34;
                  var55 = var44;
               } else {
                  if (var26 <= var6) {
                     break;
                  }

                  var64 = var34;
                  var55 = var44;
                  var71 = var6;
               }
            }
         }

         String var48 = new String(var34).intern();
         byte var28 = -1;
         var0[var4++] = var48;
         if ((var1 += var2) >= var5) {
            I = new IIlIIlll(IlIIllIII.Ill(var0[1]));
            II = l();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private IIlIIlll(IIIlIlIl var3) {
      this.l = var3;
   }

   private static IIlIIlll[] l() {
      return new IIlIIlll[]{I};
   }

   private static int II(int var0, int var1) {
      int var2 = Il[var0 ^ -520185638] ^ var1 ^ var0;
      var2 ^= 55018;
      var2 += 57760;
      var2 -= 2251;
      var2 ^= 33887;
      var2 ^= 50684;
      return var2 + 35572;
   }
}
