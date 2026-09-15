package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lIllIlI {
   I,
   l,
   Il;
   private static final int[] lI;
   private static final Object[] III;
   private static final String[] ll;
   private static final lIllIlI[] II;

   private static lIllIlI[] I() {
      return new lIllIlI[]{l, I, Il};
   }

   private static String II(int var0, int var1) {
      int var3 = var0 ^ -54983000;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1032288591;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 37;
            case 1 -> 227;
            case 2 -> 230;
            case 3 -> 63;
            case 4 -> 244;
            case 5 -> 38;
            case 6 -> 110;
            case 7 -> 152;
            case 8 -> 191;
            case 9 -> 9;
            case 10 -> 122;
            case 11 -> 180;
            case 12 -> 125;
            case 13 -> 94;
            case 14 -> 124;
            case 15 -> 87;
            case 16 -> 45;
            case 17 -> 87;
            case 18 -> 210;
            case 19 -> 220;
            case 20 -> 102;
            case 21 -> 124;
            case 22 -> 42;
            case 23 -> 226;
            case 24 -> 234;
            case 25 -> 215;
            case 26 -> 242;
            case 27 -> 249;
            case 28 -> 36;
            case 29 -> 9;
            case 30 -> 150;
            case 31 -> 102;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -1034007202;
      String[] var15 = new String[1];
      int var10001 = "\u001f籹됄睢ӣ煞撬翹퐃焒瓧精撥礹퐎缢蓥縎钯猹\uf401磒쓣箎璦璉鐂痒퓪簎䒨燹".length();
      short var18 = 8559;
      int var16 = 0;
      int var17 = 0;
      int var14 = var10001;
      String var13 = "\u001f籹됄睢ӣ煞撬翹퐃焒瓧精撥礹퐎缢蓥縎钯猹\uf401磒쓣箎璦璉鐂痒퓪簎䒨燹";

      do {
         char var19 = var13.charAt(var17);
         String var10000 = var13.substring(var17 + 1, var17 + 1 + var19);
         int var21 = 0;
         char[] var20 = var10000.toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 205;
               case 1 -> 115;
               case 2 -> 6;
               case 3 -> 155;
               case 4 -> 250;
               case 5 -> 209;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      ll = var15;
      III = new Object[var15.length];
      int var9 = -445422633;
      byte[] var7 = "wKiã\u0083n^ô\u0097I\u009dr{\u0080o%\u0003\u0005c\u008c\u0080;Õ\u001b\u0003m©/¼è>2l\u001bc\u0095".getBytes("ISO-8859-1");
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

      String[] var0 = new String[3];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(-54983000, var23 ^ -679337861)).length();
      char var2 = 4;
      int var1 = -1;

      while (true) {
         char[] var10002;
         label84: {
            int var28 = l(-1431006890, var23 ^ 86978604);
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var35 = var28;
            var10002 = var10003;
            var10001 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var28;
               var10006 = var6;
            } else {
               var35 = var28;
               var10001 = var10004;
               if (var10004 <= var6) {
                  break label84;
               }

               var10005 = var10003;
               var10004 = var28;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % l(-1431006889, var23 ^ -251001013)) {
                  case 0 -> l(-1431006892, var23 ^ -449985287);
                  case 1 -> l(-1431006891, var23 ^ 165950724);
                  case 2 -> l(-1431006894, var23 ^ 1902197162);
                  case 3 -> l(-1431006893, var23 ^ -228619174);
                  case 4 -> l(-1431006896, var23 ^ 1896476726);
                  case 5 -> l(-1431006895, var23 ^ -829659168);
                  default -> l(-1431006882, var23 ^ 511654546);
               });
               var6++;
               if (var35 == 0) {
                  var10006 = var35;
                  var10005 = var10002;
                  var10004 = var35;
               } else {
                  if (var10001 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var35;
                  var10006 = var6;
               }
            }
         }

         String var37 = new String(var10002).intern();
         byte var32 = -1;
         var0[var4++] = var37;
         if ((var1 += var2) >= var5) {
            l = new lIllIlI();
            I = new lIllIlI();
            Il = new lIllIlI();
            II = I();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ -1431006890] ^ var1 ^ var0;
      var2 += 55982;
      var2 ^= 33068;
      var2 ^= 64658;
      var2 += 11834;
      var2 += 42229;
      return var2 + 28711;
   }
}
