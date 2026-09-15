package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIIIlIll {
   l,
   Il,
   lI;
   private static final int[] ll;
   private final IIIlIlIl I;
   private static final Object[] IIl;
   private static final String[] III;
   private static final IIIIlIll[] II;

   private static IIIIlIll[] I() {
      return new IIIIlIll[]{l, Il, lI};
   }

   private static int l(int var0, int var1) {
      int var2 = ll[var0 ^ 1399084865] ^ var1 ^ var0;
      var2 += 16471;
      var2 ^= 57191;
      var2 += 1924;
      var2 -= 11212;
      var2 ^= 61758;
      var2 -= 48850;
      var2 += 22881;
      var2 -= 16510;
      var2 -= 38319;
      return var2 + 47819;
   }

   private static String II(int var0, int var1) {
      int var3 = var0 ^ 1018495416;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 855858938;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 7;
            case 1 -> 182;
            case 2 -> 166;
            case 3 -> 122;
            case 4 -> 252;
            case 5 -> 190;
            case 6 -> 82;
            case 7 -> 107;
            case 8 -> 212;
            case 9 -> 115;
            case 10 -> 142;
            case 11 -> 150;
            case 12 -> 71;
            case 13 -> 61;
            case 14 -> 18;
            case 15 -> 65;
            case 16 -> 98;
            case 17 -> 40;
            case 18 -> 151;
            case 19 -> 126;
            case 20 -> 95;
            case 21 -> 17;
            case 22 -> 136;
            case 23 -> 113;
            case 24 -> 74;
            case 25 -> 238;
            case 26 -> 157;
            case 27 -> 44;
            case 28 -> 92;
            case 29 -> 127;
            case 30 -> 80;
            case 31 -> 94;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.I.llIl();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 935327096;
      int var10001 = "&\uf1c6硬\ue371飜\ue989သ\uf374ꢍ\ued62\uf074\uec26聮\uf511壜\uf8a9ꠚﶴꂏ\ue482\uf076ﶦ\ue869\ue5b1壞\uf649ꀟ\uef14䂌ﶂ㡴\uf646졨ｱ\ue0d8\ued09ဘ\ue934邈\u0015ﰓᴭ\ue984춟\ue43c\uf55cﬁ췏\ue9b7唶\ue073괬︄▞\uf29c鵙ﷁ\ue5cc\ue517ഴ\uf013"
         .length();
      short var18 = 28452;
      int var14 = var10001;
      String var13 = "&\uf1c6硬\ue371飜\ue989သ\uf374ꢍ\ued62\uf074\uec26聮\uf511壜\uf8a9ꠚﶴꂏ\ue482\uf076ﶦ\ue869\ue5b1壞\uf649ꀟ\uef14䂌ﶂ㡴\uf646졨ｱ\ue0d8\ued09ဘ\ue934邈\u0015ﰓᴭ\ue984춟\ue43c\uf55cﬁ췏\ue9b7唶\ue073괬︄▞\uf29c鵙ﷁ\ue5cc\ue517ഴ\uf013";
      String[] var10000 = new String[2];
      int var17 = 0;
      String[] var15 = var10000;
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 229;
               case 1 -> 151;
               case 2 -> 114;
               case 3 -> 33;
               case 4 -> 138;
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

      III = var15;
      IIl = new Object[var15.length];
      int var9 = 862981853;
      byte[] var7 = "\u0095ñy:àÊ±%p2ðÄ!±ÅÓcï¥\\P\u000eØkL\u0080@Ü\u0096aý\u0080\u000bÒV=\" p\"K:|\u00126\u0095Ëb\u0011ñ\u0001Ý".getBytes("ISO-8859-1");
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

      String[] var0 = new String[l(1399084865, var23 ^ -1034232529)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(1018495416, var23 ^ -961884368)).length();
      int var2 = l(1399084864, var23 ^ -1218374349);
      int var25 = -1;

      label100:
      while (true) {
         int var29 = l(1399084867, var23 ^ 664360672);
         String var32 = var3.substring(++var25, var25 + var2);
         byte var39 = -1;

         while (true) {
            label95: {
               char[] var48 = var32.toCharArray();
               int var10004 = var48.length;
               int var6 = 0;
               int var51 = var29;
               var44 = var48;
               var10001 = var10004;
               char[] var60;
               int var10006;
               if (var10004 <= 1) {
                  var60 = var48;
                  var10004 = var29;
                  var10006 = var6;
               } else {
                  var51 = var29;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label95;
                  }

                  var60 = var48;
                  var10004 = var29;
                  var10006 = var6;
               }

               while (true) {
                  var60[var10006] = (char)(var60[var10006] ^ var10004 ^ switch (var6 % l(1399084868, var23 ^ 128285822)) {
                     case 0 -> l(1399084871, var23 ^ 455862131);
                     case 1 -> l(1399084870, var23 ^ -1043703684);
                     case 2 -> l(1399084873, var23 ^ 1551495171);
                     case 3 -> l(1399084872, var23 ^ 1963709917);
                     case 4 -> l(1399084875, var23 ^ 479320659);
                     case 5 -> l(1399084874, var23 ^ 1631481725);
                     default -> l(1399084877, var23 ^ 1180345360);
                  });
                  var6++;
                  if (var51 == 0) {
                     var10006 = var51;
                     var60 = var44;
                     var10004 = var51;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var60 = var44;
                     var10004 = var51;
                     var10006 = var6;
                  }
               }
            }

            String var53 = new String(var44).intern();
            switch (var39) {
               case 0:
                  var0[var4++] = var53;
                  if ((var25 += var2) >= var5) {
                     l = new IIIIlIll(IlIIllIII.Ill(var0[2]));
                     Il = new IIIIlIll(IlIIllIII.Ill(var0[4]));
                     lI = new IIIIlIll(IlIIllIII.Ill(var0[0]));
                     II = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var53;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label100;
                  }

                  var5 = (var3 = II(1018495417, var23 ^ 1856939508)).length();
                  var2 = l(1399084866, var23 ^ 1981440451);
                  var25 = -1;
            }

            var29 = l(1399084869, var23 ^ 876872543);
            var32 = var3.substring(++var25, var25 + var2);
            var39 = 0;
         }
      }
   }

   private IIIIlIll(IIIlIlIl var3) {
      this.I = var3;
   }
}
