package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lllIllIl {
   II,
   Il;
   private static final String[] ll;
   private static final lllIllIl[] I;
   private static final Object[] III;
   private final IIIlIlIl l;
   private static final int[] lI;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -564682684;
      int var10001 = "\u0011殶ᥩ濂\ud9aa汧\ud9d3潎奱滊馸殗秖栦\ud973淲ᦶ欏\r䔼퇔䀸鄔䉕ᅭ䋄\uf1c1䄰儌䗽酬䙼".length();
      int var10 = 0;
      int var8 = var10001;
      int var11 = 0;
      String var7 = "\u0011殶ᥩ濂\ud9aa汧\ud9d3潎奱滊馸殗秖栦\ud973淲ᦶ欏\r䔼퇔䀸鄔䉕ᅭ䋄\uf1c1䄰儌䗽酬䙼";
      short var12 = 22913;
      String[] var9 = new String[2];

      do {
         char var13 = var7.charAt(var11);
         var10001 = var11 + 1;
         int var10002 = var11 + 1 + var13;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 96;
               case 1 -> 197;
               case 2 -> 172;
               case 3 -> 13;
               case 4 -> 209;
               case 5 -> 113;
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
      int var21 = 0;
      lI = new int[12];
      int var25 = 0;
      byte[] var35 = "\u0084mÿC_'¤¿zÌñZà\u000b\u0090ù\u001e\u00060\u0099~u\u0082l\tÅnEMÝÐK\u008aj\u0094\u0012¦\"Ôt7\u009e4ø\u009f\u0089Ä©"
         .getBytes("ISO-8859-1");

      int var57;
      do {
         lI[var21] = ((var35[var25] & 255) << 24 | (var35[var25 + 1] & 255) << 16 | (var35[var25 + 2] & 255) << 8 | var35[var25 + 3] & 255) ^ 1516805045;
         var21 += 1;
         var57 = var25 + 4;
         var25 += 4;
      } while (var57 < var35.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(487029722, var17 ^ 1706289703)).length();
      int var2 = l(960962402, var17 ^ -957655955);
      int var19 = -1;

      label102:
      while (true) {
         var21 = l(960962403, var17 ^ 497094549);
         String var28 = var3.substring(++var19, var19 + var2);
         byte var41 = -1;

         while (true) {
            label97: {
               char[] var59 = var28.toCharArray();
               int var71 = var59.length;
               int var6 = 0;
               var57 = var21;
               var46 = var59;
               var25 = var71;
               char[] var83;
               int var90;
               if (var71 <= 1) {
                  var83 = var59;
                  var71 = var21;
                  var90 = var6;
               } else {
                  var57 = var21;
                  var25 = var71;
                  if (var71 <= var6) {
                     break label97;
                  }

                  var83 = var59;
                  var71 = var21;
                  var90 = var6;
               }

               while (true) {
                  var83[var90] = (char)(var83[var90] ^ var71 ^ switch (var6 % l(960962406, var17 ^ 1551932346)) {
                     case 0 -> l(960962407, var17 ^ 1022568711);
                     case 1 -> l(960962404, var17 ^ 1262738059);
                     case 2 -> l(960962405, var17 ^ 257653554);
                     case 3 -> l(960962410, var17 ^ -924041420);
                     case 4 -> l(960962411, var17 ^ -458989370);
                     case 5 -> l(960962408, var17 ^ 1964573555);
                     default -> l(960962409, var17 ^ -586190865);
                  });
                  var6++;
                  if (var57 == 0) {
                     var90 = var57;
                     var83 = var46;
                     var71 = var57;
                  } else {
                     if (var25 <= var6) {
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
                     II = new lllIllIl(IlIIllIII.Ill(var0[1]));
                     Il = new lllIllIl(IlIIllIII.Ill(var0[0]));
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

                  var5 = (var3 = II(487029723, var17 ^ 545180751)).length();
                  var2 = l(960962400, var17 ^ 944396920);
                  var19 = -1;
            }

            var21 = l(960962401, var17 ^ -1567802493);
            var28 = var3.substring(++var19, var19 + var2);
            var41 = 0;
         }
      }
   }

   private static int l(int var0, int var1) {
      int var2 = lI[var0 ^ 960962402] ^ var1 ^ var0;
      var2 += 58297;
      var2 -= 46391;
      var2 ^= 62137;
      var2 ^= 45877;
      var2 -= 7866;
      var2 += 60831;
      var2 ^= 9380;
      return var2 + 5580;
   }

   private static String II(int var0, int var1) {
      int var3 = var0 ^ 487029722;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2042471080;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 5;
            case 1 -> 55;
            case 2 -> 208;
            case 3 -> 33;
            case 4 -> 194;
            case 5 -> 33;
            case 6 -> 215;
            case 7 -> 148;
            case 8 -> 140;
            case 9 -> 214;
            case 10 -> 64;
            case 11 -> 113;
            case 12 -> 26;
            case 13 -> 227;
            case 14 -> 159;
            case 15 -> 190;
            case 16 -> 52;
            case 17 -> 235;
            case 18 -> 95;
            case 19 -> 109;
            case 20 -> 79;
            case 21 -> 216;
            case 22 -> 180;
            case 23 -> 68;
            case 24 -> 18;
            case 25 -> 149;
            case 26 -> 163;
            case 27 -> 86;
            case 28 -> 72;
            case 29 -> 143;
            case 30 -> 240;
            case 31 -> 191;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private lllIllIl(IIIlIlIl var3) {
      this.l = var3;
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private static lllIllIl[] I() {
      return new lllIllIl[]{II, Il};
   }
}
