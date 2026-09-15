package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum llllIIl implements lIllIIIl {
   I,
   II,
   ll;
   private static final Object[] IlI;
   private final boolean l;
   private static final String[] IIl;
   private final IIIlIlIl Il;
   private static final int[] III;
   private static final llllIIl[] lI;

   private static int lI(int var0, int var1) {
      int var2 = III[var0 ^ -87213007] ^ var1 ^ var0;
      var2 ^= 54224;
      var2 -= 1187;
      var2 += 62075;
      var2 ^= 37035;
      var2 -= 10301;
      return var2 - 28787;
   }

   @Override
   public Enum<?> Il() {
      return this;
   }

   private llllIIl(IIIlIlIl var3, boolean var4) {
      this.Il = var3;
      this.l = var4;
   }

   @Override
   public String toString() {
      return this.Il.llIl();
   }

   private llllIIl(IIIlIlIl var3) {
      this(var3, true);
   }

   private static String ll(int var0, int var1, short var2) {
      int var3 = var1 ^ 63962;
      char[] var4 = IIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 22466;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\ue704';
         var10 ^= 61889;
         var10 += 34313;
         var10 -= 49978;
         var10 ^= 56322;
         var10 -= 56839;
         var10 += 55877;
         var10 ^= 17379;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 466117570;
      int var10001 = "\u001b\udeac濆\udd70콝\uddcf⼲\uded4俙\uda98콝\uddcf༱\udf5c濆\udd68콒\udc27꼰\udf8c쿐\udc48轖\udcff⼺\udf84⿔\udcf8\u0019ꏯ茖\ue1bb⊭\ue144싁ꊷ∤\ue113掚\ue19c⏋\ue1e7舡\ue1f3쎥ꌌ\ue3c9ꏯꈥꈓ⎤\ueee4菊\ue157"
         .length();
      int var17 = 0;
      int var16 = 0;
      int var14 = var10001;
      short var18 = 13304;
      String var13 = "\u001b\udeac濆\udd70콝\uddcf⼲\uded4俙\uda98콝\uddcf༱\udf5c濆\udd68콒\udc27꼰\udf8c쿐\udc48轖\udcff⼺\udf84⿔\udcf8\u0019ꏯ茖\ue1bb⊭\ue144싁ꊷ∤\ue113掚\ue19c⏋\ue1e7舡\ue1f3쎥ꌌ\ue3c9ꏯꈥꈓ⎤\ueee4菊\ue157";
      String[] var15 = new String[2];

      do {
         int var21 = 0;
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 95;
               case 1 -> 174;
               case 2 -> 155;
               case 3 -> 34;
               case 4 -> 252;
               case 5 -> 79;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIl = var15;
      IlI = new Object[var15.length];
      int var9 = 1960530063;
      byte[] var7 = "hV1\u0098\u0099\u0080V\r\u0017F\u008a\u0081üS\\v\u009b\u009aý²qR¦\u0006\u008by/\u0005*\u008aHÆÉÖXùYø\u0015¶Ü°Ü\u008f\u0012xû\u0087"
         .getBytes("ISO-8859-1");
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

      String[] var0 = new String[lI(-87213007, var23 ^ 41416561)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ll(var23 ^ 1236107158, 63962, (short)'蘧')).length();
      int var2 = 5;
      int var25 = -1;

      label101:
      while (true) {
         int var28 = lI(-87213008, var23 ^ -207515604);
         String var30 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label96: {
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
                     break label96;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lI(-87213003, var23 ^ -239387810)) {
                     case 0 -> lI(-87213004, var23 ^ 460546379);
                     case 1 -> lI(-87213001, var23 ^ -514266645);
                     case 2 -> lI(-87213002, var23 ^ 1084985063);
                     case 3 -> lI(-87212999, var23 ^ -1544053216);
                     case 4 -> lI(-87213000, var23 ^ 869913441);
                     case 5 -> lI(-87212997, var23 ^ -1232004440);
                     default -> lI(-87212998, var23 ^ 2019114217);
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
                     ll = new llllIIl(IlIIllIII.Ill(var0[3]));
                     I = new llllIIl(IlIIllIII.Ill(var0[5]));
                     II = new llllIIl(IlIIllIII.Ill(var0[4]));
                     lI = l();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var50;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label101;
                  }

                  var5 = (var3 = ll(var23 ^ 352125702, 63963, (short)1720)).length();
                  var2 = lI(-87213005, var23 ^ 2103921680);
                  var25 = -1;
            }

            var28 = lI(-87213006, var23 ^ -1770874102);
            var30 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   public static llllIIl I(String var0) {
      return Enum.valueOf(llllIIl.class, var0);
   }

   private static llllIIl[] l() {
      return new llllIIl[]{ll, I, II};
   }

   @Override
   public boolean II() {
      return this.l;
   }
}
