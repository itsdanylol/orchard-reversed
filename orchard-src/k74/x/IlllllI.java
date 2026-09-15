package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IlllllI {
   I,
   Il,
   lI;
   private static final String[] III;
   private static final int[] ll;
   private final IIIlIlIl l;
   private static final Object[] IIl;
   private static final IlllllI[] II;

   private static String II(byte var0, byte var1, int var2, int var3, int var4) {
      int var9 = var3 ^ 443590596;
      char[] var8 = III[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])IIl[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         IIl[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 22706;

      for (int var7 = 0; var7 < var8.length; var7++) {
         var8[var7] = (char)(var8[var7] ^ var7 ^ var3 ^ var6 ^ var1 ^ var4 ^ var2 ^ var0);
      }

      return new String(var8).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = -2072096601;
      byte var20 = -1;
      String var14 = "䠫䡯䠦䡌䡪䠾䠻䠝䡤䠊䡃䡤䠭䡦䠣䡑䡝䡞䡠䡙䠁䡌䠇䡽參勞兩落盧若路勒殺寧菱肋弄索良索駱北喇累縷";
      short var13 = 15612;
      char[] var15 = "\u0018\u0015".toCharArray();
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            III = var16;
            IIl = new Object[var16.length];
            int var9 = 560885945;
            byte[] var7 = "fÞ\u001eX<@¾EÐÕ\"È¾M°1`±~\u008bÝäÞ÷ã\u0093\bh \u0014X&$Ã\u0019\u0084¼ü&«\u0018\u0007Õ\u00ad\u0099ø\u0001V".getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            ll = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               ll[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[l(-1976711144, var24 ^ 1239605171)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = II((byte)34, 106, 1269955665, 443590596, -2061532711)).length();
            int var2 = l(-1976711143, var24 ^ 326926255);
            int var26 = -1;

            label99:
            while (true) {
               int var29 = l(-1976711142, var24 ^ -1449041);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label94: {
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
                           break label94;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % l(-1976711139, var24 ^ -220717286)) {
                           case 0 -> l(-1976711138, var24 ^ -860894527);
                           case 1 -> l(-1976711137, var24 ^ -1893164729);
                           case 2 -> 3;
                           case 3 -> l(-1976711152, var24 ^ 201316554);
                           case 4 -> l(-1976711151, var24 ^ -1816074661);
                           case 5 -> l(-1976711150, var24 ^ 926618776);
                           default -> l(-1976711149, var24 ^ -1228619720);
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
                           I = new IlllllI(IlIIllIII.Ill(var0[3]));
                           lI = new IlllllI(IlIIllIII.Ill(var0[2]));
                           Il = new IlllllI(IlIIllIII.Ill(var0[5]));
                           II = I();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var50;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label99;
                        }

                        var5 = (var3 = II((byte)-107, (byte)81, 1434178155, 443590597, -1479286484)).length();
                        var2 = l(-1976711141, var24 ^ -1854836281);
                        var26 = -1;
                  }

                  var29 = l(-1976711140, var24 ^ 1334689748);
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
               byte var23 = switch (var22 % 5) {
                  default -> 40;
                  case 1 -> 87;
                  case 2 -> 23;
                  case 3 -> 95;
                  case 4 -> 39;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static int l(int var0, int var1) {
      int var2 = ll[var0 ^ -1976711144] ^ var1 ^ var0;
      var2 -= 14143;
      var2 += 40522;
      var2 ^= 12097;
      var2 ^= 59890;
      var2 -= 28946;
      var2 ^= 7749;
      return var2 - 64374;
   }

   private IlllllI(IIIlIlIl var3) {
      this.l = var3;
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private static IlllllI[] I() {
      return new IlllllI[]{I, lI, Il};
   }
}
