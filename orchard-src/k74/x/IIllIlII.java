package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIllIlII {
   II,
   Il;
   private static final int[] lI;
   private static final IIllIlII[] I;
   private final IIIlIlIl l;
   private static final Object[] III;
   private static final String[] ll;

   private static IIllIlII[] I() {
      return new IIllIlII[]{Il, II};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 1972710160;
      int var17 = 0;
      int var14 = "\u000f\ue7d4锽\ue174촸\uf7d4鴹\ue894蔹\ue4d4촸ﱴ紻\ue3b4ഺ４\u0015᪁⡂ᦡ⁇ਁ\ud846ቁᡇᜡ䁅ء䡄ခE١⁅ቁ灄ځ\uf847ఁ".length();
      int var16 = 0;
      String[] var15 = new String[2];
      short var18 = 30707;
      String var13 = "\u000f\ue7d4锽\ue174촸\uf7d4鴹\ue894蔹\ue4d4촸ﱴ紻\ue3b4ഺ４\u0015᪁⡂ᦡ⁇ਁ\ud846ቁᡇᜡ䁅ء䡄ခE١⁅ቁ灄ځ\uf847ఁ";

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

         do {
            char var22 = var20[var21];
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

      ll = var15;
      III = new Object[var15.length];
      int var9 = 2065824934;
      byte[] var7 = " å\u000fdæá\nÞ®JÜ  \u0007\u0007¥\u0093óê\u0084\u0090ÌÊ¶{\u0005'[\t5f\u001a\u0087üÝã\"jCCÄý¿\u0090".getBytes("ISO-8859-1");
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
      int var5 = (var3 = Il(-1668423643, var23 ^ -1552732680)).length();
      int var2 = II(999938036, var23 ^ 365462269);
      int var25 = -1;

      label89:
      while (true) {
         int var10000 = II(999938037, var23 ^ -741571424);
         String var10001 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label84: {
               char[] var42 = var10001.toCharArray();
               int var10004 = var42.length;
               int var6 = 0;
               int var45 = var10000;
               var38 = var42;
               int var32 = var10004;
               char[] var54;
               int var10006;
               if (var10004 <= 1) {
                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var45 = var10000;
                  var32 = var10004;
                  if (var10004 <= var6) {
                     break label84;
                  }

                  var54 = var42;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var54[var10006] = (char)(var54[var10006] ^ var10004 ^ switch (var6 % II(999938032, var23 ^ -1495374056)) {
                     case 0 -> II(999938033, var23 ^ -1511963253);
                     case 1 -> 3;
                     case 2 -> II(999938034, var23 ^ 1311288004);
                     case 3 -> II(999938035, var23 ^ 1008266135);
                     case 4 -> II(999938044, var23 ^ -1294904619);
                     case 5 -> II(999938045, var23 ^ 390581577);
                     default -> II(999938046, var23 ^ -238013967);
                  });
                  var6++;
                  if (var45 == 0) {
                     var10006 = var45;
                     var54 = var38;
                     var10004 = var45;
                  } else {
                     if (var32 <= var6) {
                        break;
                     }

                     var54 = var38;
                     var10004 = var45;
                     var10006 = var6;
                  }
               }
            }

            String var47 = new String(var38).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var47;
                  if ((var25 += var2) >= var5) {
                     Il = new IIllIlII(IlIIllIII.Ill(var0[0]));
                     II = new IIllIlII(IlIIllIII.Ill(var0[2]));
                     I = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var47;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label89;
                  }

                  var5 = (var3 = Il(-1668423644, var23 ^ 211046661)).length();
                  var2 = II(999938038, var23 ^ -1687727409);
                  var25 = -1;
            }

            var10000 = II(999938039, var23 ^ 355109340);
            var10001 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private IIllIlII(IIIlIlIl var3) {
      this.l = var3;
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ 999938036] ^ var1 ^ var0;
      var2 += 45440;
      var2 -= 43704;
      var2 -= 18612;
      var2 += 3365;
      var2 ^= 28224;
      var2 ^= 44308;
      var2 += 53134;
      var2 -= 64874;
      var2 ^= 29140;
      return var2 ^ 7608;
   }

   public static IIllIlII l(String var0) {
      return Enum.valueOf(IIllIlII.class, var0);
   }

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ -1668423643;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1743133419;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 18;
            case 1 -> 254;
            case 2 -> 72;
            case 3 -> 116;
            case 4 -> 131;
            case 5 -> 96;
            case 6 -> 37;
            case 7 -> 10;
            case 8 -> 53;
            case 9 -> 15;
            case 10 -> 144;
            case 11 -> 10;
            case 12 -> 122;
            case 13 -> 86;
            case 14 -> 181;
            case 15 -> 62;
            case 16 -> 21;
            case 17 -> 124;
            case 18 -> 146;
            case 19 -> 81;
            case 20 -> 155;
            case 21 -> 50;
            case 22 -> 198;
            case 23 -> 239;
            case 24 -> 140;
            case 25 -> 234;
            case 26 -> 186;
            case 27 -> 181;
            case 28 -> 122;
            case 29 -> 79;
            case 30 -> 238;
            case 31 -> 246;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }
}
