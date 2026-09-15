package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum llIllIII {
   l,
   II,
   Il;

   private final IIIlIlIl I;
   private static final Object[] IIl;
   private static final int[] ll;
   private static final llIllIII[] lI;
   private static final String[] III;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -396931775;
      short var18 = 18211;
      int var16 = 0;
      int var10001 = "\u001d㛪\ue411ㄾﰗ㙰\uec56㍪䰖㼞簕⫐둖⤪ꐑ⭾밒ㅰ᱐㗊됖㎞ఔ⤰᱑㝊琑㴞갗⮐\u000f楗㍆翣㭄狭鬁犗⭁縃㍇烍댃椗ፁ橣".length();
      String[] var15 = new String[2];
      int var14 = var10001;
      String var13 = "\u001d㛪\ue411ㄾﰗ㙰\uec56㍪䰖㼞簕⫐둖⤪ꐑ⭾밒ㅰ᱐㗊됖㎞ఔ⤰᱑㝊琑㴞갗⮐\u000f楗㍆翣㭄狭鬁犗⭁縃㍇烍댃椗ፁ橣";
      int var17 = 0;

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 58;
               case 1 -> 28;
               case 2 -> 110;
               case 3 -> 24;
               case 4 -> 224;
               case 5 -> 92;
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
      int var9 = 1761522990;
      byte[] var7 = "p+\u0096)\u00951cv\f\u008b\u00964îùtðéÆj\u009d!\u0083\bó\u009a©\u000f\u0013\u009daG\u001aÓ1KAà\u007fÆÀÒiM\u0006".getBytes("ISO-8859-1");
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

      String[] var0 = new String[II(67882706, var23 ^ -192397712)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(var23 ^ 1485441524, 22632, (short)'鋀')).length();
      int var2 = 4;
      int var25 = -1;

      label100:
      while (true) {
         int var28 = II(67882707, var23 ^ 294832918);
         String var30 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label95: {
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
                     break label95;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(67882710, var23 ^ 1835385539)) {
                     case 0 -> II(67882711, var23 ^ -1524588073);
                     case 1 -> II(67882708, var23 ^ 504014353);
                     case 2 -> II(67882709, var23 ^ 432205424);
                     case 3 -> II(67882714, var23 ^ 1469244166);
                     case 4 -> 4;
                     case 5 -> II(67882715, var23 ^ 1692168173);
                     default -> II(67882712, var23 ^ 1456137243);
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
                     Il = new llIllIII(IlIIllIII.Ill(var0[2]));
                     l = new llIllIII(IlIIllIII.Ill(var0[1]));
                     II = new llIllIII(IlIIllIII.Ill(var0[5]));
                     lI = l();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var50;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label100;
                  }

                  var5 = (var3 = Il(var23 ^ 212624403, 22633, (short)'벇')).length();
                  var2 = II(67882704, var23 ^ -2010628497);
                  var25 = -1;
            }

            var28 = II(67882705, var23 ^ 1784339945);
            var30 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private static int II(int var0, int var1) {
      int var2 = ll[var0 ^ 67882706] ^ var1 ^ var0;
      var2 -= 36875;
      var2 -= 28678;
      var2 -= 45643;
      var2 ^= 21737;
      var2 ^= 19588;
      var2 += 39151;
      var2 -= 55103;
      var2 += 16035;
      return var2 + 2766;
   }

   @Override
   public String toString() {
      return this.I.llIl();
   }

   public static llIllIII I(String var0) {
      return Enum.valueOf(llIllIII.class, var0);
   }

   private static llIllIII[] l() {
      return new llIllIII[]{Il, l, II};
   }

   private static String Il(int var0, int var1, short var2) {
      int var3 = var1 ^ 22632;
      char[] var4 = III[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IIl[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IIl[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 6527;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 'ꌐ';
         var10 -= 11696;
         var10 -= 16061;
         var10 -= 50766;
         var10 += 29337;
         var10 += 33736;
         var10 ^= 23239;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private llIllIII(IIIlIlIl var3) {
      this.I = var3;
   }
}
