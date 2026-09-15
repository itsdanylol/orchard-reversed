package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IlIIIIlll {
   I,
   Il;

   private static final Object[] III;
   private final IIIlIlIl l;
   private static final int[] lI;
   private static final IlIIIIlll[] II;
   private static final String[] ll;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 230190830;
      int var16 = 0;
      int var17 = 0;
      String[] var15 = new String[2];
      int var14 = "\u000f㦠跂ѣ\udd0a㰽㷎㦰跂㮓\ued09㦝﷏㯠鷋㋣\u0015胵\ua878腦\ud8b7앹롱腕\ud87a蜶ᢰ脘\ue870암硻艖㢰苈褲聕⡾蚖".length();
      String var13 = "\u000f㦠跂ѣ\udd0a㰽㷎㦰跂㮓\ued09㦝﷏㯠鷋㋣\u0015胵\ua878腦\ud8b7앹롱腕\ud87a蜶ᢰ脘\ue870암硻艖㢰苈褲聕⡾蚖";
      short var18 = 445;

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 13;
               case 1 -> 249;
               case 2 -> 110;
               case 3 -> 49;
               case 4 -> 208;
               case 5 -> 246;
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
      int var9 = -684882611;
      byte[] var7 = "\u0015\f\u009cZ\u0099|Ïf&þ\u0007²\"|tvÙÿ×)K\u009bQP\u0017r\n¢º&>¤\neÓý¸\u0082ù\u0005\u0019Òt?±\u0084+\u009c".getBytes("ISO-8859-1");
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

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(var23 ^ -1458143551, 47549, (short)24970)).length();
      int var2 = II(-170033451, var23 ^ -977655339);
      int var25 = -1;

      label99:
      while (true) {
         int var28 = II(-170033452, var23 ^ 1238006487);
         String var10001 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label94: {
               char[] var44 = var10001.toCharArray();
               int var10004 = var44.length;
               int var6 = 0;
               int var47 = var28;
               var40 = var44;
               int var34 = var10004;
               char[] var56;
               int var10006;
               if (var10004 <= 1) {
                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var47 = var28;
                  var34 = var10004;
                  if (var10004 <= var6) {
                     break label94;
                  }

                  var56 = var44;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var56[var10006] = (char)(var56[var10006] ^ var10004 ^ switch (var6 % II(-170033455, var23 ^ 155804323)) {
                     case 0 -> II(-170033456, var23 ^ -1691491183);
                     case 1 -> II(-170033453, var23 ^ -943407249);
                     case 2 -> II(-170033454, var23 ^ 1787857742);
                     case 3 -> II(-170033443, var23 ^ -623679985);
                     case 4 -> II(-170033444, var23 ^ 1748257954);
                     case 5 -> II(-170033441, var23 ^ -916143721);
                     default -> II(-170033442, var23 ^ 1630707297);
                  });
                  var6++;
                  if (var47 == 0) {
                     var10006 = var47;
                     var56 = var40;
                     var10004 = var47;
                  } else {
                     if (var34 <= var6) {
                        break;
                     }

                     var56 = var40;
                     var10004 = var47;
                     var10006 = var6;
                  }
               }
            }

            String var49 = new String(var40).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var49;
                  if ((var25 += var2) >= var5) {
                     I = new IlIIIIlll(IlIIllIII.Ill(var0[0]));
                     Il = new IlIIIIlll(IlIIllIII.Ill(var0[2]));
                     II = l();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var49;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label99;
                  }

                  var5 = (var3 = Il(var23 ^ -608888079, 47548, (short)24573)).length();
                  var2 = II(-170033449, var23 ^ -163007949);
                  var25 = -1;
            }

            var28 = II(-170033450, var23 ^ -221593241);
            var10001 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ -170033451] ^ var1 ^ var0;
      var2 ^= 61422;
      var2 += 36942;
      var2 += 39241;
      var2 -= 12807;
      var2 += 65414;
      return var2 - 50725;
   }

   private static String Il(int var0, int var1, short var2) {
      int var3 = var1 ^ 47549;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 8603;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 7620;
         var10 += 18663;
         var10 += 31812;
         var10 += 14509;
         var10 += 14430;
         var10 += 61111;
         var10 += 15203;
         var10 -= 34404;
         var10 ^= 51737;
         var10 -= 8369;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static IlIIIIlll I(String var0) {
      return Enum.valueOf(IlIIIIlll.class, var0);
   }

   private IlIIIIlll(IIIlIlIl var3) {
      this.l = var3;
   }

   private static IlIIIIlll[] l() {
      return new IlIIIIlll[]{I, Il};
   }
}
