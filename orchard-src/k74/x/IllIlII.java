package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IllIlII {
   l;

   private static final int[] II;
   private static final IllIlII[] I;
   private static final Object[] lI;
   private static final String[] Il;

   public static IllIlII I(String var0) {
      return Enum.valueOf(IllIlII.class, var0);
   }

   private static String Il(int var0, short var1, int var2, char var3, char var4, char var5, int var6) {
      int var11 = var2 ^ -1074641740;
      char[] var10 = Il[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])lI[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         lI[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 61336;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 20) {
            default -> 149;
            case 1 -> 161;
            case 2 -> 17;
            case 3 -> 22;
            case 4 -> 4;
            case 5 -> 131;
            case 6 -> 20;
            case 7 -> 65;
            case 8 -> 213;
            case 9 -> 73;
            case 10 -> 156;
            case 11 -> 12;
            case 12 -> 80;
            case 13 -> 224;
            case 14 -> 3;
            case 15 -> 29;
            case 16 -> 66;
            case 17 -> 69;
            case 18 -> 34;
            case 19 -> 72;
         } ^ 18059 ^ var9 ^ var0 ^ var6 ^ var4 ^ var8 ^ var1 ^ var3 ^ var2 ^ var5);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   private static int II(int var0, int var1) {
      int var2 = II[var0 ^ 1001853466] ^ var1 ^ var0;
      var2 ^= 65011;
      var2 += 7195;
      var2 -= 60694;
      var2 += 26663;
      var2 -= 32623;
      var2 -= 14179;
      var2 ^= 11542;
      var2 += 51543;
      var2 ^= 62198;
      return var2 - 13586;
   }

   private static IllIlII[] l() {
      return new IllIlII[]{l};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var19 = 1649960680;
      short var8 = 24725;
      char[] var10 = "\u000f".toCharArray();
      String var9 = "瑀璞瓑瑻瑣瑒瑙瓕瓓瑁琋琿瓟璋瑙";
      int var10000 = var10.length;
      byte var15 = -1;
      String[] var11 = new String[var10000];

      while (true) {
         int var12 = 0;
         char var13 = 0;
         char var14 = '\u0000';
         if (var15 == 0) {
            Il = var11;
            lI = new Object[var11.length];
            int var4 = -585589763;
            byte[] var2 = "K\u009aÖ\u001aü©ÊaÐ·\u008cDf\u0015«\u0089ÁsTéT ËÂQ:ÚÙHu(ü\u009d\u0086ºð".getBytes("ISO-8859-1");
            int var3 = var2.length / 4;
            II = new int[var3];
            byte var5 = 0;
            int var6 = 0;

            do {
               int var7 = (var2[var5] & 255) << 24 | (var2[var5 + 1] & 255) << 16 | (var2[var5 + 2] & 255) << 8 | var2[var5 + 3] & 255;
               var7 ^= var4;
               II[var6] = var7;
               var5 += 4;
            } while (++var6 < var3);

            var10000 = II(1001853466, var19 ^ -814925883);
            char[] var10003 = Il(2142124661, 25149, -1074641740, '㳠', (char)'\ue428', '㉚', -306266742).toCharArray();
            int var10004 = var10003.length;
            int var1 = 0;
            int var30 = var10000;
            char[] var10002 = var10003;
            int var25 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var10000;
               var10006 = var1;
            } else {
               var30 = var10000;
               var25 = var10004;
               if (var10004 <= var1) {
                  String var33 = new String(var10003).intern();
                  byte var28 = -1;
                  String var20 = var33;
                  l = new IllIlII();
                  I = l();
                  return;
               }

               var10005 = var10003;
               var10004 = var10000;
               var10006 = var1;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var1 % II(1001853467, var19 ^ 2019437480)) {
                  case 0 -> II(1001853464, var19 ^ 1413508193);
                  case 1 -> II(1001853465, var19 ^ -488486016);
                  case 2 -> II(1001853470, var19 ^ 1166325000);
                  case 3 -> II(1001853471, var19 ^ -791205338);
                  case 4 -> II(1001853468, var19 ^ -707970318);
                  case 5 -> II(1001853469, var19 ^ -863844121);
                  default -> II(1001853458, var19 ^ 426859259);
               });
               var1++;
               if (var30 == 0) {
                  var10006 = var30;
                  var10005 = var10002;
                  var10004 = var30;
               } else {
                  if (var25 <= var1) {
                     String var32 = new String(var10002).intern();
                     byte var27 = -1;
                     String var0 = var32;
                     l = new IllIlII();
                     I = l();
                     return;
                  }

                  var10005 = var10002;
                  var10004 = var30;
                  var10006 = var1;
               }
            }
         }

         do {
            var14 = var10[var12];
            char[] var16 = var9.substring(var13, var13 + var14).toCharArray();
            int var17 = 0;

            do {
               short var18 = switch (var17 % 5) {
                  default -> 151;
                  case 1 -> 86;
                  case 2 -> 214;
                  case 3 -> 101;
                  case 4 -> 9;
               };
               var16[var17] = (char)(var16[var17] ^ var18 ^ var8);
            } while (++var17 < var16.length);

            var11[var12] = new String(var16).intern();
            var13 += var14;
         } while (++var12 < var10.length);

         var15 = 0;
      }
   }
}
