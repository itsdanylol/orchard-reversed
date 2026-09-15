package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIlIIIIlI {
   II,
   Il;

   private static final int[] lI;
   private static final IIlIIIIlI[] I;
   private final IIIlIlIl l;
   private static final Object[] III;
   private static final String[] ll;

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ 929559242] ^ var1 ^ var0;
      var2 -= 31;
      var2 -= 22827;
      var2 += 6775;
      var2 += 2647;
      var2 += 5348;
      return var2 ^ 48356;
   }

   private IIlIIIIlI(IIIlIlIl var3) {
      this.l = var3;
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private static IIlIIIIlI[] I() {
      return new IIlIIIIlI[]{II, Il};
   }

   private static String II(int var0, char var1, short var2) {
      int var3 = var1 ^ 13259;
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])III[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         III[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 7451;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 492;
         var10 ^= 25505;
         var10 -= 44478;
         var10 += 40250;
         var10 -= 56366;
         var10 ^= 55801;
         var10 ^= 8942;
         var10 ^= 47285;
         var10 += 49138;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -1089280208;
      String[] var10000 = new String[2];
      short var12 = 30779;
      String[] var9 = var10000;
      int var11 = 0;
      int var10001 = "\u0010昳ᶩ淁ﷰ恦ᵄ掎緾愊紶怋嶤恹᷺挖ﵟ\u0013멨狞럺㊥뮵鈭룍务북퉨뗈틼먒煰䄵刚뢭늝둙".length();
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\u0010昳ᶩ淁ﷰ恦ᵄ掎緾愊紶怋嶤恹᷺挖ﵟ\u0013멨狞럺㊥뮵鈭룍务북퉨뗈틼먒煰䄵刚뢭늝둙";

      do {
         char var13 = var7.charAt(var11);
         char[] var21 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();
         int var15 = 0;
         char[] var14 = var21;

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 196;
               case 1 -> 41;
               case 2 -> 126;
               case 3 -> 117;
               case 4 -> 185;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      lI = new int[11];
      byte var23 = 0;
      int var26 = 0;
      byte[] var10002 = "H÷.©\u001frÓëG\u0093èã\u001b\u0089ø)Ñ³\n¯ýù(B\u0091àÈ\u0095ÐþsYÖ\u0093&·¿ö\u0093ËÄ\u0004gì".getBytes("ISO-8859-1");

      int var57;
      do {
         lI[var23] = ((var10002[var26] & 255) << 24 | (var10002[var26 + 1] & 255) << 16 | (var10002[var26 + 2] & 255) << 8 | var10002[var26 + 3] & 255)
            ^ -1039448137;
         var23 += 1;
         var57 = var26 + 4;
         var26 += 4;
      } while (var57 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(var17 ^ -594480128, '㏋', (short)'ꬺ')).length();
      int var2 = l(929559242, var17 ^ 42573983);
      int var19 = -1;

      label102:
      while (true) {
         int var24 = l(929559243, var17 ^ 1426873735);
         String var29 = var3.substring(++var19, var19 + var2);
         byte var41 = -1;

         while (true) {
            label97: {
               char[] var59 = var29.toCharArray();
               int var71 = var59.length;
               int var6 = 0;
               var57 = var24;
               var46 = var59;
               var26 = var71;
               char[] var83;
               int var90;
               if (var71 <= 1) {
                  var83 = var59;
                  var71 = var24;
                  var90 = var6;
               } else {
                  var57 = var24;
                  var26 = var71;
                  if (var71 <= var6) {
                     break label97;
                  }

                  var83 = var59;
                  var71 = var24;
                  var90 = var6;
               }

               while (true) {
                  var83[var90] = (char)(var83[var90] ^ var71 ^ switch (var6 % l(929559246, var17 ^ -1681029987)) {
                     case 0 -> l(929559247, var17 ^ -1215846837);
                     case 1 -> l(929559244, var17 ^ -610384204);
                     case 2 -> l(929559245, var17 ^ -1702822559);
                     case 3 -> l(929559234, var17 ^ -1662146361);
                     case 4 -> 1;
                     case 5 -> l(929559235, var17 ^ -175628843);
                     default -> l(929559232, var17 ^ -1904547425);
                  });
                  var6++;
                  if (var57 == 0) {
                     var90 = var57;
                     var83 = var46;
                     var71 = var57;
                  } else {
                     if (var26 <= var6) {
                        break;
                     }

                     var83 = var46;
                     var71 = var57;
                     var90 = var6;
                  }
               }
            }

            String var64 = new String(var46).intern();
            switch (var41) {
               case 0:
                  var0[var4++] = var64;
                  if ((var19 += var2) >= var5) {
                     II = new IIlIIIIlI(IlIIllIII.Ill(var0[1]));
                     Il = new IIlIIIIlI(IlIIllIII.Ill(var0[3]));
                     I = I();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var64;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label102;
                  }

                  var5 = (var3 = II(var17 ^ -159412094, '㏊', (short)12070)).length();
                  var2 = l(929559240, var17 ^ 233662166);
                  var19 = -1;
            }

            var24 = l(929559241, var17 ^ 1375172130);
            var29 = var3.substring(++var19, var19 + var2);
            var41 = 0;
         }
      }
   }
}
