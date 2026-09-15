package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIlIIl {
   l,
   II,
   Il,
   lI,
   ll;
   private static final IlIlIIl[] I;
   private static final String[] IIl;
   private static final Object[] IlI;
   private static final int[] III;

   private static IlIlIIl[] I() {
      return new IlIlIIl[]{ll, l, Il, lI, II};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -883433796;
      short var18 = 32543;
      int var16 = 0;
      int var10001 = "Iᘭ㻼ݲ雟ᣓ츶ᙍ\ua6f8ቲ\ue6dbᴳ昴ຍ㻸ਲ웚ᒓ븴ᴭ훾̲뛙\u09d3\ua630།㛻ᒲ仚ᤳ혷ᚍﻻᤒ廝ᜓ\ude33ᆍ\ue6f9ᱲ⻘\u09b3☲ᘭ웾\u0c52軝ᒳ瘵ᮭ웹ᓒ껙ၓ⸵Ǎ껻ฒ⻛ᾓ踷ᮭ컽ಒ盘\u0ef3渲ȭ㻹ᄲ\udedaẳ\ue634ᐭ\u0018⦐䦳㭏膐⒮\ue17a▐\ud9b6⯏熖⻮䥺㴰\ue9b4ㆯƔ⏮䥸▐㦲は冗㋎祽"
         .length();
      int var17 = 0;
      String[] var15 = new String[2];
      int var14 = var10001;
      String var13 = "Iᘭ㻼ݲ雟ᣓ츶ᙍ\ua6f8ቲ\ue6dbᴳ昴ຍ㻸ਲ웚ᒓ븴ᴭ훾̲뛙\u09d3\ua630།㛻ᒲ仚ᤳ혷ᚍﻻᤒ廝ᜓ\ude33ᆍ\ue6f9ᱲ⻘\u09b3☲ᘭ웾\u0c52軝ᒳ瘵ᮭ웹ᓒ껙ၓ⸵Ǎ껻ฒ⻛ᾓ踷ᮭ컽ಒ盘\u0ef3渲ȭ㻹ᄲ\udedaẳ\ue634ᐭ\u0018⦐䦳㭏膐⒮\ue17a▐\ud9b6⯏熖⻮䥺㴰\ue9b4ㆯƔ⏮䥸▐㦲は冗㋎祽";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 181;
               case 1 -> 254;
               case 2 -> 170;
               case 3 -> 220;
               case 4 -> 171;
               case 5 -> 49;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIl = var15;
      IlI = new Object[var15.length];
      int var9 = -1061082268;
      byte[] var7 = "]R®Òj\u008aÝa\u001e¤\u0016Eî\u0010Éý4öuì'K@ì²\u001e\u0001\"Hä2\u0081E¦\u0095\u0086\tðÙåw\u0016\fè".getBytes("ISO-8859-1");
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

      String[] var0 = new String[5];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il((byte)122, (char)'\udcc1', 440504759, -807288770, -1906083984, -91722994, (byte)93)).length();
      int var2 = II(-1269566922, var23 ^ -493384790);
      int var25 = -1;

      label96:
      while (true) {
         int var28 = II(-1269566921, var23 ^ -716179439);
         String var30 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label91: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var28;
               var41 = var45;
               var10001 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var48 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label91;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(-1269566923, var23 ^ 1372974231)) {
                     case 0 -> II(-1269566926, var23 ^ -1959567654);
                     case 1 -> II(-1269566925, var23 ^ -1735497149);
                     case 2 -> II(-1269566928, var23 ^ 232467339);
                     case 3 -> II(-1269566927, var23 ^ -148825675);
                     case 4 -> II(-1269566914, var23 ^ -94130023);
                     case 5 -> II(-1269566913, var23 ^ -1237975808);
                     default -> II(-1269566916, var23 ^ -925685353);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var10001 <= var6) {
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
                  if ((var25 += var2) >= var5) {
                     ll = new IlIlIIl();
                     l = new IlIlIIl();
                     Il = new IlIlIIl();
                     lI = new IlIlIIl();
                     II = new IlIlIIl();
                     I = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var50;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label96;
                  }

                  var5 = (var3 = Il(55, 22539, -1295284931, 681372806, 454763040, -91722993, 48)).length();
                  var2 = 4;
                  var25 = -1;
            }

            var28 = II(-1269566924, var23 ^ -1587463040);
            var30 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private static int II(int var0, int var1) {
      int var2 = III[var0 ^ -1269566922] ^ var1 ^ var0;
      var2 += 34874;
      var2 ^= 31275;
      var2 += 31456;
      var2 ^= 23300;
      var2 -= 43003;
      var2 += 5264;
      return var2 - 32092;
   }

   private static String Il(byte var0, char var1, int var2, int var3, int var4, int var5, byte var6) {
      int var11 = var5 ^ -91722994;
      char[] var10 = IIl[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])IlI[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         IlI[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 22699;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 21) {
            default -> 82;
            case 1 -> 135;
            case 2 -> 254;
            case 3 -> 132;
            case 4 -> 86;
            case 5 -> 126;
            case 6 -> 6;
            case 7 -> 55;
            case 8 -> 88;
            case 9 -> 55;
            case 10 -> 1;
            case 11 -> 59;
            case 12 -> 253;
            case 13 -> 99;
            case 14 -> 172;
            case 15 -> 30;
            case 16 -> 97;
            case 17 -> 90;
            case 18 -> 107;
            case 19 -> 128;
            case 20 -> 169;
         } ^ 33303 ^ var6 ^ var8 ^ var2 ^ var0 ^ var1 ^ var3 ^ var5 ^ var4);
      }

      return new String(var10).intern();
   }

   public static IlIlIIl l(String var0) {
      return Enum.valueOf(IlIlIIl.class, var0);
   }
}
