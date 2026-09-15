package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum llIIll implements lIllIIIl {
   I,
   II;

   private static final llIIll[] l;
   private static final String[] III;
   private static final Object[] IIl;
   private static final int[] ll;
   private final IIIlIlIl Il;
   private final IIIlIlIl lI;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = 746749119;
      char[] var9 = "浪洒".toCharArray();
      byte var14 = -1;
      String var8 = "\ue31f\ue33f\ue366\ue388\ue37f\ue32f\ue385\ue3e3\ue3b6\ue34d\ue313\ue39c\ue32e\ue367\ue313\ue39c\ue368\ue3aa\ue359\ue3fb\ue3d8\ue3dd\ue32a\ue35a\ue3d0\ue349\ue31f\ue385\ue385\ue391\ue321\ue34b\ue3c7\ue3f6\ue3d4\ue388\ue3e1\ue3c7\ue363\ue35a\ue38c\ue3e2\ue3c9\ue369\ue396\ue363\ue3c4\ue319\ue3b1\ue363\ue330\ue30b\ue312\ue352\ue3fa\ue32d\ue305\ue3d5\ue3a4\ue320\ue3d1\ue35f\ue387\ue3e6\ue34c\ue3b3\ue378\ue330\ue306\ue306\ue333\ue3de\ue31f\ue333\ue337\ue34d\ue340\ue3cf\ue355\ue3ff\ue3d4\ue3af\ue3b9\ue3c8\ue3c8\ue337\ue35b\ue3cc\ue3cf\ue36375U\u0082K\u000b\u009bÐ\u009ci/²\u0015%\u001d¼GÖ\u001f\u0083ìß',\u009c\u0011p \u0096Þzh\u008f\u009d";
      short var7 = 27952;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            III = var10;
            IIl = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            byte[] var10002 = "\u008c\u0087!(\u0096\u000f\u001c²ßÍ&\u0003Ã¥\u0098èT\u001d\u0013Þ\u0005È~\u009ba4ò\u009fs°±Sq{¨aSZu)\u0005*ãc\u001fRO\u0005(¥ É"
               .getBytes("ISO-8859-1");
            ll = new int[13];

            int var55;
            do {
               ll[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 875992717;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var0 = new String[IIl(-1890963534, var18 ^ 460890955)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = IlI(-2126520984, var18 ^ -879883498)).length();
            int var2 = IIl(-1890963533, var18 ^ 32546658);
            int var20 = -1;

            label101:
            while (true) {
               var22 = IIl(-1890963536, var18 ^ 1211278613);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var39 = -1;

               while (true) {
                  label96: {
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
                           break label96;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % IIl(-1890963529, var18 ^ -1841824356)) {
                           case 0 -> IIl(-1890963532, var18 ^ -154439251);
                           case 1 -> IIl(-1890963531, var18 ^ -464571761);
                           case 2 -> IIl(-1890963526, var18 ^ -427545730);
                           case 3 -> IIl(-1890963525, var18 ^ -995756493);
                           case 4 -> IIl(-1890963528, var18 ^ -1831509922);
                           case 5 -> IIl(-1890963527, var18 ^ -2001878340);
                           default -> IIl(-1890963522, var18 ^ -1084611591);
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
                           II = new llIIll(IlIIllIII.Ill(var0[3]), IlIIllIII.Ill(var0[4]));
                           I = new llIIll(IlIIllIII.Ill(var0[0]), IlIIllIII.Ill(var0[2]));
                           l = I();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var62;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label101;
                        }

                        var5 = (var3 = IlI(-2126520983, var18 ^ 685974186)).length();
                        var2 = IIl(-1890963535, var18 ^ 1415191314);
                        var20 = -1;
                  }

                  var22 = IIl(-1890963530, var18 ^ -1008558485);
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
                  default -> 179;
                  case 1 -> 76;
                  case 2 -> 69;
                  case 3 -> 159;
                  case 4 -> 236;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static String IlI(int var0, int var1) {
      int var3 = var0 ^ -2126520984;
      char[] var4 = III[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1264197485;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 144;
            case 1 -> 12;
            case 2 -> 19;
            case 3 -> 27;
            case 4 -> 180;
            case 5 -> 242;
            case 6 -> 228;
            case 7 -> 190;
            case 8 -> 77;
            case 9 -> 141;
            case 10 -> 183;
            case 11 -> 241;
            case 12 -> 7;
            case 13 -> 247;
            case 14 -> 244;
            case 15 -> 82;
            case 16 -> 26;
            case 17 -> 174;
            case 18 -> 196;
            case 19 -> 106;
            case 20 -> 85;
            case 21 -> 172;
            case 22 -> 46;
            case 23 -> 146;
            case 24 -> 66;
            case 25 -> 231;
            case 26 -> 55;
            case 27 -> 229;
            case 28 -> 48;
            case 29 -> 98;
            case 30 -> 254;
            case 31 -> 6;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static llIIll[] I() {
      return new llIIll[]{II, I};
   }

   public IIIlIlIl l() {
      return this.lI;
   }

   @Override
   public String toString() {
      return this.lI.llIl();
   }

   public String lI() {
      return this.Il.llIl();
   }

   private static int IIl(int var0, int var1) {
      int var2 = ll[var0 ^ -1890963534] ^ var1 ^ var0;
      var2 += 24509;
      var2 ^= 57623;
      var2 -= 38576;
      var2 ^= 61782;
      var2 ^= 3438;
      return var2 - 19513;
   }

   public IIIlIlIl ll() {
      return this.Il;
   }

   public static llIIll III(String var0) {
      return Enum.valueOf(llIIll.class, var0);
   }

   private llIIll(IIIlIlIl var3, IIIlIlIl var4) {
      this.lI = var3;
      this.Il = var4;
   }
}
