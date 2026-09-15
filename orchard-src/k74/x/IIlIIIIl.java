package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIlIIIIl {
   I,
   II,
   Il;
   private static final Object[] III;
   private static final String[] ll;
   private static final int[] lI;
   private static final IIlIIIIl[] l;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = -2087305696;
      String var8 = "亴丬䴆仦䴼亚亊丟仩亴亄亞䵚且䴂亝仄䴧仏䷔亻亣价仈亝乬䴂仲仞以亇並䴛亝仄䴧仏䷔亻亣价仈亝乬亹䵳仼";
      char[] var9 = "/".toCharArray();
      short var7 = 19212;
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            ll = var10;
            III = new Object[var10.length];
            int var21 = 0;
            lI = new int[9];
            int var10001 = 0;
            byte[] var10002 = ";Ãjú?P\u008b×UD\u0085`õ£x³\u0096~ÿ$\u008dJ\u0004\u008f\u009aócW:\u0017½]¼\u009fØ+".getBytes("ISO-8859-1");

            int var44;
            do {
               lI[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 896452335;
               var21 += 1;
               var44 = var10001 + 4;
               var10001 += 4;
            } while (var44 < var10002.length);

            String[] var0 = new String[3];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il('퇈', var18 ^ -433963078, 59694)).length();
            int var2 = II(-552844609, var18 ^ -1379332505);
            int var1 = -1;

            while (true) {
               label88: {
                  var21 = II(-552844610, var18 ^ -1453658615);
                  char[] var45 = var3.substring(++var1, var1 + var2).toCharArray();
                  int var55 = var45.length;
                  int var6 = 0;
                  var44 = var21;
                  var34 = var45;
                  var10001 = var55;
                  char[] var64;
                  int var71;
                  if (var55 <= 1) {
                     var64 = var45;
                     var55 = var21;
                     var71 = var6;
                  } else {
                     var44 = var21;
                     var10001 = var55;
                     if (var55 <= var6) {
                        break label88;
                     }

                     var64 = var45;
                     var55 = var21;
                     var71 = var6;
                  }

                  while (true) {
                     var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % II(-552844611, var18 ^ -1018240528)) {
                        case 0 -> II(-552844612, var18 ^ 1672027417);
                        case 1 -> II(-552844613, var18 ^ 7642038);
                        case 2 -> 4;
                        case 3 -> II(-552844614, var18 ^ 457204038);
                        case 4 -> II(-552844615, var18 ^ 217646647);
                        case 5 -> II(-552844616, var18 ^ -1407330158);
                        default -> II(-552844617, var18 ^ 714456250);
                     });
                     var6++;
                     if (var44 == 0) {
                        var71 = var44;
                        var64 = var34;
                        var55 = var44;
                     } else {
                        if (var10001 <= var6) {
                           break;
                        }

                        var64 = var34;
                        var55 = var44;
                        var71 = var6;
                     }
                  }
               }

               String var48 = new String(var34).intern();
               byte var28 = -1;
               var0[var4++] = var48;
               if ((var1 += var2) >= var5) {
                  Il = new IIlIIIIl();
                  I = new IIlIIIIl();
                  II = new IIlIIIIl();
                  l = l();
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 118;
                  case 1 -> 213;
                  case 2 -> 10;
                  case 3 -> 95;
                  case 4 -> 61;
                  case 5 -> 43;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static int II(int var0, int var1) {
      int var2 = lI[var0 ^ -552844609] ^ var1 ^ var0;
      var2 += 20002;
      var2 ^= 34130;
      var2 ^= 31646;
      var2 ^= 46846;
      var2 += 648;
      var2 += 19586;
      var2 ^= 32120;
      return var2 + 14031;
   }

   private static String Il(char var0, int var1, int var2) {
      int var3 = var0 ^ '퇈';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 6062;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 8766;
         var10 -= 52210;
         var10 += 33299;
         var10 ^= 18015;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public static IIlIIIIl I(String var0) {
      return Enum.valueOf(IIlIIIIl.class, var0);
   }

   private static IIlIIIIl[] l() {
      return new IIlIIIIl[]{Il, I, II};
   }
}
