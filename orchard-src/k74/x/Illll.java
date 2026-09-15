package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum Illll {
   I,
   Il;

   final IIIlIlIl l;
   private static final Illll[] II;
   private static final Object[] IIl;
   private static final String[] III;
   private static final int[] ll;
   final IIIlIlIl lI;

   private static String II(int var0, int var1) {
      int var3 = var0 ^ -1973405880;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1979210435;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 238;
            case 1 -> 132;
            case 2 -> 194;
            case 3 -> 163;
            case 4 -> 58;
            case 5 -> 234;
            case 6 -> 151;
            case 7 -> 111;
            case 8 -> 51;
            case 9 -> 137;
            case 10 -> 169;
            case 11 -> 84;
            case 12 -> 197;
            case 13 -> 197;
            case 14 -> 112;
            case 15 -> 220;
            case 16 -> 167;
            case 17 -> 116;
            case 18 -> 174;
            case 19 -> 201;
            case 20 -> 157;
            case 21 -> 69;
            case 22 -> 212;
            case 23 -> 149;
            case 24 -> 241;
            case 25 -> 25;
            case 26 -> 21;
            case 27 -> 136;
            case 28 -> 189;
            case 29 -> 190;
            case 30 -> 75;
            case 31 -> 216;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int l(int var0, int var1) {
      int var2 = ll[var0 ^ -1724355042] ^ var1 ^ var0;
      var2 += 28313;
      var2 ^= 10247;
      var2 += 18260;
      var2 -= 7034;
      var2 += 41392;
      var2 += 40203;
      var2 -= 2183;
      var2 -= 16807;
      var2 ^= 13945;
      return var2 + 50632;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -1350156445;
      short var18 = 23201;
      int var16 = 0;
      String[] var15 = new String[2];
      int var14 = "$庸慴徠\ue174學\ue179岘腬塨ŵ很셪廈셹嫀䅼岈䅠崸셺屰\ue16f庰\ue177帰ũ壐셷岠慴娰\ue17c廘Ŵ巰셶\u0015蕊ꨛ葒⨛肊⨖蝪䨃莚쨚葺ਅ蚪⨐聢\u0a11蝲樋蛺⨐虒".length();
      String var13 = "$庸慴徠\ue174學\ue179岘腬塨ŵ很셪廈셹嫀䅼岈䅠崸셺屰\ue16f庰\ue177帰ũ壐셷岠慴娰\ue17c廘Ŵ巰셶\u0015蕊ꨛ葒⨛肊⨖蝪䨃莚쨚葺ਅ蚪⨐聢\u0a11蝲樋蛺⨐虒";
      int var17 = 0;

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

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
      int var9 = -138796197;
      byte[] var7 = "\u00158Mf\b·/\"¢\u009c÷L2¶8\u008f¶¿\u0082^¢ÐÁ\t¿\u001aå¬\u009fCF7l²\u0093Ü°ÔÄV\u00ad.i\b\u0012ïJ\u0080\u0014\u0014>j"
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

      String[] var0 = new String[l(-1724355042, var23 ^ 734095886)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(-1973405880, var23 ^ -1229626991)).length();
      int var2 = l(-1724355041, var23 ^ 911083581);
      int var25 = -1;

      label90:
      while (true) {
         int var10000 = l(-1724355044, var23 ^ -1671049033);
         String var28 = var3.substring(++var25, var25 + var2);
         byte var35 = -1;

         while (true) {
            label85: {
               char[] var44 = var28.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var10000;
               var40 = var44;
               int var33 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var47 = var10000;
                  var33 = var10004;
                  if (var10004 <= var6) {
                     break label85;
                  }

                  var56 = var44;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % l(-1724355045, var23 ^ -1674975723)) {
                     case 0 -> l(-1724355048, var23 ^ -2115779937);
                     case 1 -> l(-1724355047, var23 ^ -1581620957);
                     case 2 -> l(-1724355050, var23 ^ 1380693194);
                     case 3 -> l(-1724355049, var23 ^ -1909595308);
                     case 4 -> l(-1724355052, var23 ^ -1814606297);
                     case 5 -> l(-1724355051, var23 ^ 739667336);
                     default -> l(-1724355054, var23 ^ 720181578);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var33 <= var6) {
                        break;
                     }

                     var56 = var40;
                     var10004 = var47;
                     var10006 = var6;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var35) {
               case 0:
                  var0[var4++] = var49;
                  if ((var25 += var2) >= var5) {
                     Il = new Illll(IlIIllIII.Ill(var0[0]), IlIIllIII.Ill(var0[2]));
                     I = new Illll(IlIIllIII.Ill(var0[5]), IlIIllIII.Ill(var0[4]));
                     II = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var49;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label90;
                  }

                  var5 = (var3 = II(-1973405879, var23 ^ -306819969)).length();
                  var2 = l(-1724355043, var23 ^ 206512018);
                  var25 = -1;
            }

            var10000 = l(-1724355046, var23 ^ -2008636074);
            var28 = var3.substring(++var25, var25 + var2);
            var35 = 0;
         }
      }
   }

   private static Illll[] I() {
      return new Illll[]{Il, I};
   }

   private Illll(IIIlIlIl var3, IIIlIlIl var4) {
      this.lI = var3;
      this.l = var4;
   }
}
