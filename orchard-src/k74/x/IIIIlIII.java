package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIIIlIII {
   II,
   Il,
   lI;
   private static final IIIIlIII[] I;
   private final IIIlIlIl l;
   private static final Object[] IIl;
   private static final int[] ll;
   private static final String[] III;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 1041104618;
      short var18 = 7199;
      String[] var10001 = new String[2];
      int var17 = 0;
      String[] var15 = var10001;
      int var16 = 0;
      int var14 = "'⹃ಿ⹛겲⦛겢⸛Ⲫ⣛ಡ⫋결⿋貰ⱻ\uecb4⠳販ⷛ貹Ᵽ첥⮃貸⤣ಫ⾻\uecad⯻ⲹ⽋沿ⱻ䲮⮋貿⮃䲫⠻\u0011䜜\uf11b䟼ㄕ䀬턇䜔ㄌ䎤鄅䏌ᄖ䘤焔䖌\uf11b䉌".length();
      String var13 = "'⹃ಿ⹛겲⦛겢⸛Ⲫ⣛ಡ⫋결⿋貰ⱻ\uecb4⠳販ⷛ貹Ᵽ첥⮃貸⤣ಫ⾻\uecad⯻ⲹ⽋沿ⱻ䲮⮋貿⮃䲫⠻\u0011䜜\uf11b䟼ㄕ䀬턇䜔ㄌ䎤鄅䏌ᄖ䘤焔䖌\uf11b䉌";

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << '\r') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> '\r') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      III = var15;
      IIl = new Object[var15.length];
      int var9 = 1513883389;
      byte[] var7 = "³.¡\u0095@\u0080aË\u0092\u0000SÈ×±f\u0015\u0015ß@?\u0099\tô\u001cyq¼\u0090{!Éo\u0081û\u0093^ÕÏ\u00864kCÂØEkv\u007fvÙF©"
         .getBytes("ISO-8859-1");
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

      String[] var0 = new String[II(1240025780, var23 ^ 1628033667)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(-1520608133, (short)-20884, -1818317532, 57, -562246813)).length();
      int var2 = II(1240025781, var23 ^ -1834544426);
      int var25 = -1;

      label91:
      while (true) {
         int var10000 = II(1240025782, var23 ^ 1076306704);
         String var28 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label86: {
               char[] var43 = var28.toCharArray();
               int var10004 = var43.length;
               int var6 = 0;
               int var46 = var10000;
               var39 = var43;
               int var33 = var10004;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var43;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var46 = var10000;
                  var33 = var10004;
                  if (var10004 <= var6) {
                     break label86;
                  }

                  var55 = var43;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var55[var10006] = (char)(var55[var10006] ^ var10004 ^ switch (var6 % II(1240025777, var23 ^ 1261340430)) {
                     case 0 -> II(1240025778, var23 ^ -1420374968);
                     case 1 -> II(1240025779, var23 ^ -1459177040);
                     case 2 -> II(1240025788, var23 ^ 1406985000);
                     case 3 -> II(1240025789, var23 ^ 132708085);
                     case 4 -> II(1240025790, var23 ^ -1184582921);
                     case 5 -> II(1240025791, var23 ^ -1756625322);
                     default -> II(1240025784, var23 ^ -1526843784);
                  });
                  var6++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var55 = var39;
                     var10004 = var46;
                  } else {
                     if (var33 <= var6) {
                        break;
                     }

                     var55 = var39;
                     var10004 = var46;
                     var10006 = var6;
                  }
               }
            }

            String var48 = new String(var39).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var48;
                  if ((var25 += var2) >= var5) {
                     Il = new IIIIlIII(IlIIllIII.Ill(var0[5]));
                     lI = new IIIIlIII(IlIIllIII.Ill(var0[1]));
                     II = new IIIIlIII(IlIIllIII.Ill(var0[2]));
                     I = l();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var48;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label91;
                  }

                  var5 = (var3 = Il(1973418028, (short)21109, -2043025471, (byte)-8, -562246814)).length();
                  var2 = II(1240025783, var23 ^ 93721866);
                  var25 = -1;
            }

            var10000 = II(1240025776, var23 ^ -940035289);
            var28 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private static String Il(int var0, short var1, int var2, byte var3, int var4) {
      int var9 = var4 ^ -562246813;
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
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 12828;

      for (int var7 = 0; var7 < var8.length; var7++) {
         var8[var7] = (char)(var8[var7] ^ switch (var7 % 29) {
            default -> 152;
            case 1 -> 184;
            case 2 -> 185;
            case 3 -> 195;
            case 4 -> 4;
            case 5 -> 78;
            case 6 -> 153;
            case 7 -> 6;
            case 8 -> 6;
            case 9 -> 96;
            case 10 -> 112;
            case 11 -> 233;
            case 12 -> 183;
            case 13 -> 136;
            case 14 -> 232;
            case 15 -> 222;
            case 16 -> 80;
            case 17 -> 18;
            case 18 -> 251;
            case 19 -> 191;
            case 20 -> 207;
            case 21 -> 46;
            case 22 -> 5;
            case 23 -> 157;
            case 24 -> 67;
            case 25 -> 20;
            case 26 -> 237;
            case 27 -> 2;
            case 28 -> 51;
         } ^ var7 ^ var6 ^ var1 ^ var3 ^ var0 ^ var2 ^ var4);
      }

      return new String(var8).intern();
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private IIIIlIII(IIIlIlIl var3) {
      this.l = var3;
   }

   private static int II(int var0, int var1) {
      int var2 = ll[var0 ^ 1240025780] ^ var1 ^ var0;
      var2 -= 17121;
      var2 += 64637;
      var2 -= 27434;
      var2 ^= 61518;
      var2 -= 25206;
      var2 -= 44250;
      var2 ^= 25394;
      var2 += 21788;
      var2 += 59848;
      return var2 ^ 61705;
   }

   public static IIIIlIII I(String var0) {
      return Enum.valueOf(IIIIlIII.class, var0);
   }

   private static IIIIlIII[] l() {
      return new IIIIlIII[]{Il, lI, II};
   }
}
