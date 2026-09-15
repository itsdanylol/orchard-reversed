package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIIIIIll {
   I,
   II,
   lI,
   ll,
   III,
   IIl;
   private final IIIlIlIl l;
   private static final int[] IlI;
   private static final Object[] lII;
   private static final String[] Ill;
   private static final IlIIIIIll[] Il;

   public static IlIIIIIll I(String var0) {
      return Enum.valueOf(IlIIIIIll.class, var0);
   }

   private IlIIIIIll(IIIlIlIl var3) {
      this.l = var3;
   }

   private static String lI(int var0, short var1, int var2) {
      int var3 = var0 ^ 45939;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 4315;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 7895;
         var10 += 5182;
         var10 -= 58077;
         var10 -= 8252;
         var10 ^= 16;
         var10 += 38710;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static IlIIIIIll[] l() {
      IlIIIIIll[] var10000 = new IlIIIIIll[Il(-790854604, -842795160 ^ 862997397)];
      var10000[0] = II;
      var10000[1] = I;
      var10000[2] = IIl;
      var10000[3] = lI;
      var10000[4] = ll;
      var10000[5] = III;
      return var10000;
   }

   private static int Il(int var0, int var1) {
      int var2 = IlI[var0 ^ -790854604] ^ var1 ^ var0;
      var2 ^= 7973;
      var2 += 15825;
      var2 ^= 35554;
      var2 += 4379;
      var2 ^= 43256;
      var2 -= 13035;
      var2 ^= 56792;
      var2 += 19900;
      var2 ^= 35660;
      return var2 - 35587;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -1213590588;
      int var10 = 0;
      int var11 = 0;
      int var10001 = "E័ꎁన\uf364ᚩ鏰በ\uf386\u1758썫ኹ䏭\u0cf0䎛ዘ\ue369ᛉϰᘠ\u0381ౘ鍳ᙹ䏭ᛰ掁ಈ썤ᙙᏳថ䎁ᄸ፪ᝉ䏭ర厛ౘ㍤\u16f9鏰᭰\u0381ለ捭ᘩ폳᭐\uf382መͮᯉ鏰ᖠ䎛ಈ䍳ᇙ\uf3f7ᛐ鎛ኸͩ\u1259菭ᚐ⎀ᙈ\u0011鵙⨏顱쫧龠\u1a7d齙쯴驱\udae1鶠\u0a7c髩ਊ飡\ueae2騰"
         .length();
      String[] var9 = new String[2];
      int var8 = var10001;
      String var7 = "E័ꎁన\uf364ᚩ鏰በ\uf386\u1758썫ኹ䏭\u0cf0䎛ዘ\ue369ᛉϰᘠ\u0381ౘ鍳ᙹ䏭ᛰ掁ಈ썤ᙙᏳថ䎁ᄸ፪ᝉ䏭ర厛ౘ㍤\u16f9鏰᭰\u0381ለ捭ᘩ폳᭐\uf382መͮᯉ鏰ᖠ䎛ಈ䍳ᇙ\uf3f7ᛐ鎛ኸͩ\u1259菭ᚐ⎀ᙈ\u0011鵙⨏顱쫧龠\u1a7d齙쯴驱\udae1鶠\u0a7c髩ਊ飡\ueae2騰";
      short var12 = 22976;

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 179;
               case 1 -> 151;
               case 2 -> 27;
               case 3 -> 127;
               case 4 -> 90;
               case 5 -> 225;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      Ill = var9;
      lII = new Object[var9.length];
      int var22 = 0;
      int var25 = 0;
      IlI = new int[19];
      byte[] var10002 = "A\u009f\u0016³9ï\u001a\u008c\u009a¸.z;1\u0015\u0099ÓÿÜf,È»Ö±»!ÿ«Me®\u0087â·ý¡ý#¶ÉèÓLýèû\u0081AS\u0000 \u0004È\u0088ÛÓE°¢à/\u009fóÀ\u0094ä¹\n\u0013\u0098EÁ1Ò³"
         .getBytes("ISO-8859-1");

      int var56;
      do {
         IlI[var22] = ((var10002[var25] & 255) << 24 | (var10002[var25 + 1] & 255) << 16 | (var10002[var25 + 2] & 255) << 8 | var10002[var25 + 3] & 255)
            ^ -1878129627;
         var22 += 1;
         var56 = var25 + 4;
         var25 += 4;
      } while (var56 < var10002.length);

      String[] var0 = new String[Il(-790854603, var17 ^ 829006809)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lI(45939, (short)24908, var17 ^ -210354324)).length();
      int var2 = Il(-790854602, var17 ^ -1841391617);
      int var19 = -1;

      label101:
      while (true) {
         var22 = Il(-790854601, var17 ^ 867675330);
         String var28 = var3.substring(++var19, var19 + var2);
         byte var40 = -1;

         while (true) {
            label96: {
               char[] var58 = var28.toCharArray();
               int var70 = var58.length;
               int var6 = 0;
               var56 = var22;
               var45 = var58;
               var25 = var70;
               char[] var82;
               int var89;
               if (var70 <= 1) {
                  var82 = var58;
                  var70 = var22;
                  var89 = var6;
               } else {
                  var56 = var22;
                  var25 = var70;
                  if (var70 <= var6) {
                     break label96;
                  }

                  var82 = var58;
                  var70 = var22;
                  var89 = var6;
               }

               while (true) {
                  var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % Il(-790854606, var17 ^ -1187145602)) {
                     case 0 -> Il(-790854605, var17 ^ -1546920732);
                     case 1 -> 4;
                     case 2 -> Il(-790854596, var17 ^ -1889268001);
                     case 3 -> Il(-790854595, var17 ^ -1451517385);
                     case 4 -> Il(-790854594, var17 ^ -1049728503);
                     case 5 -> Il(-790854593, var17 ^ -177323658);
                     default -> Il(-790854600, var17 ^ 1238743301);
                  });
                  var6++;
                  if (var56 == 0) {
                     var89 = var56;
                     var82 = var45;
                     var70 = var56;
                  } else {
                     if (var25 <= var6) {
                        break;
                     }

                     var82 = var45;
                     var70 = var56;
                     var89 = var6;
                  }
               }
            }

            String var63 = new String(var45).intern();
            switch (var40) {
               case 0:
                  var0[var4++] = var63;
                  if ((var19 += var2) >= var5) {
                     II = new IlIIIIIll(IlIIllIII.Ill(var0[Il(-790854599, var17 ^ 206451027)]));
                     I = new IlIIIIIll(IlIIllIII.Ill(var0[2]));
                     IIl = new IlIIIIIll(IlIIllIII.Ill(var0[Il(-790854597, var17 ^ -391567702)]));
                     lI = new IlIIIIIll(IlIIllIII.Ill(var0[5]));
                     ll = new IlIIIIIll(IlIIllIII.Ill(var0[3]));
                     III = new IlIIIIIll(IlIIllIII.Ill(var0[Il(-790854618, var17 ^ -910726359)]));
                     Il = l();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var63;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label101;
                  }

                  var5 = (var3 = lI(45938, (short)'\uf481', var17 ^ -317294597)).length();
                  var2 = Il(-790854608, var17 ^ -612801226);
                  var19 = -1;
            }

            var22 = Il(-790854607, var17 ^ 609092240);
            var28 = var3.substring(++var19, var19 + var2);
            var40 = 0;
         }
      }
   }

   IIIlIlIl II() {
      return this.l;
   }
}
