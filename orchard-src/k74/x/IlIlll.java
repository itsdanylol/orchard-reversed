package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IlIlll {
   I,
   l,
   lI,
   ll,
   III,
   IIl;
   private static final IlIlll[] II;
   private final IIIlIlIl Il;
   private static final Object[] lII;
   private static final String[] Ill;
   private static final int[] IlI;

   private IlIlll(IIIlIlIl var3) {
      this.Il = var3;
   }

   private static int lI(int var0, int var1) {
      int var2 = IlI[var0 ^ 1604694951] ^ var1 ^ var0;
      var2 -= 46468;
      var2 += 60388;
      var2 -= 45756;
      var2 += 22847;
      var2 += 48318;
      var2 ^= 48646;
      var2 ^= 25839;
      var2 += 59399;
      return var2 ^ 52883;
   }

   public String I() {
      return this.Il.llIl();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -560047525;
      int var10001 = "k잴\uebf1윈㬫쁚\ufbc9얌ଵ읠묖섄௶욨\ueb28쓚寈올ᬱ슰䬖열믱쉘⬭잪\uebc9소鬳유ﬔ숴㯰쑸笮썪诌씜鬲씰謕암믴쌨鬯옺ꯎ옌ꬰ자䬑쀔\uebf0욈쬮쒪㯈씬ꬶ쀰笖쑤꯰썈謫쎪每슬⬰샠쬓쉔鯰쏘\u0b29쎪믊쐬⬵샐ꬔ셴䯱욨笨쏊䯌시⬱잰鬗쏄௶싘\ueb2a숚쯈쀌鬴연鬓샤\uebf5웸⬮섪\u0bcf셌\f凲뵦兞궼劼굜嚊\udda6喦ⶁ冲ᵡ"
         .length();
      short var18 = 5779;
      int var17 = 0;
      int var14 = var10001;
      int var16 = 0;
      String var13 = "k잴\uebf1윈㬫쁚\ufbc9얌ଵ읠묖섄௶욨\ueb28쓚寈올ᬱ슰䬖열믱쉘⬭잪\uebc9소鬳유ﬔ숴㯰쑸笮썪诌씜鬲씰謕암믴쌨鬯옺ꯎ옌ꬰ자䬑쀔\uebf0욈쬮쒪㯈씬ꬶ쀰笖쑤꯰썈謫쎪每슬⬰샠쬓쉔鯰쏘\u0b29쎪믊쐬⬵샐ꬔ셴䯱욨笨쏊䯌시⬱잰鬗쏄௶싘\ueb2a숚쯈쀌鬴연鬓샤\uebf5웸⬮섪\u0bcf셌\f凲뵦兞궼劼굜嚊\udda6喦ⶁ冲ᵡ";
      String[] var15 = new String[2];

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 15;
               case 1 -> 55;
               case 2 -> 243;
               case 3 -> 235;
               case 4 -> 209;
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

      Ill = var15;
      lII = new Object[var15.length];
      int var9 = 1413087601;
      byte[] var7 = "Þë\u0006\u0095ó\u00ad\u000bÍÖÙ\u0084Úeàì,µ:ÿ\u0014\u0005\u0087ª2__´\b0Ö\u007ftJ,w¯K\u000e\u0083æpx\u009a\u001eÃ\u0094\u001as\u0017.I\u0099®\u001e¸9\rÄô§&¢4àø\u0086\u0082êÛ¯\u0091:"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IlI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IlI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[lI(1604694951, var23 ^ -199996216)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = ll(-559538048, 331548708, 1583418465, -1164105676)).length();
      int var2 = lI(1604694950, var23 ^ -648920676);
      int var25 = -1;

      label99:
      while (true) {
         int var28 = lI(1604694949, var23 ^ -64565525);
         String var30 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label94: {
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
                     break label94;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % lI(1604694947, var23 ^ -1614432930)) {
                     case 0 -> lI(1604694946, var23 ^ 796450823);
                     case 1 -> lI(1604694945, var23 ^ 1973485142);
                     case 2 -> lI(1604694944, var23 ^ 438908248);
                     case 3 -> lI(1604694959, var23 ^ 1624456619);
                     case 4 -> lI(1604694958, var23 ^ 1643235829);
                     case 5 -> lI(1604694957, var23 ^ 1518850125);
                     default -> 4;
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
                     I = new IlIlll(IlIIllIII.Ill(var0[lI(1604694956, var23 ^ -378843085)]));
                     l = new IlIlll(IlIIllIII.Ill(var0[lI(1604694955, var23 ^ 1037108164)]));
                     III = new IlIlll(IlIIllIII.Ill(var0[1]));
                     ll = new IlIlll(IlIIllIII.Ill(var0[5]));
                     lI = new IlIlll(IlIIllIII.Ill(var0[lI(1604694952, var23 ^ 207453877)]));
                     IIl = new IlIlll(IlIIllIII.Ill(var0[lI(1604694967, var23 ^ -763770706)]));
                     II = l();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var50;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label99;
                  }

                  var5 = (var3 = ll(492503364, 331548709, -1886798926, 605869928)).length();
                  var2 = 3;
                  var25 = -1;
            }

            var28 = lI(1604694948, var23 ^ 1327474293);
            var30 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private static String ll(int var0, int var1, int var2, int var3) {
      int var8 = var1 ^ 331548708;
      char[] var7 = Ill[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])lII[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = new Throwable().getStackTrace();
         lII[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 58440;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ '\ue32c' ^ var6 ^ var1 ^ var2 ^ var3 ^ var5 ^ var0);
      } while (++var6 < var7.length);

      return new String(var7).intern();
   }

   private static IlIlll[] l() {
      IlIlll[] var10000 = new IlIlll[lI(1604694966, 210390446 ^ 591711381)];
      var10000[0] = I;
      var10000[1] = l;
      var10000[2] = III;
      var10000[3] = ll;
      var10000[4] = lI;
      var10000[5] = IIl;
      return var10000;
   }

   public IIIlIlIl II() {
      return this.Il;
   }

   public static IlIlll Il(String var0) {
      return Enum.valueOf(IlIlll.class, var0);
   }
}
