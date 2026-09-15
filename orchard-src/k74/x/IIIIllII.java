package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2540;
import net.minecraft.class_2960;
import net.minecraft.class_8710;
import net.minecraft.class_9139;
import net.minecraft.class_8710.class_9154;

@Environment(EnvType.CLIENT)
public record IIIIllII(byte[] aV) implements class_8710 {
   private static final String[] lI;
   private static final int[] Il;
   private final byte[] I;
   public static final class_9139<class_2540, IIIIllII> l;
   private static final Object[] ll;
   public static final class_9154<IIIIllII> II;

   public IIIIllII(byte[] aV) {
      this.I = aV;
   }

   private static String lI(short var0, char var1, int var2) {
      int var3 = var1 ^ 25820;
      char[] var4 = lI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])ll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         ll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 450;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 31439;
         var10 ^= 3290;
         var10 ^= 29080;
         var10 ^= 29059;
         var10 ^= 15180;
         var10 += 35925;
         var10 ^= 15391;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int Il(int var0, int var1) {
      int var2 = Il[var0 ^ -876614810] ^ var1 ^ var0;
      var2 += 57365;
      var2 += 47817;
      var2 ^= 2843;
      var2 += 41029;
      var2 += 28591;
      return var2 ^ 61981;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -446852354;
      short var12 = 21462;
      int var11 = 0;
      int var10001 = "\u0011ﱗ옒ﷁ䙳復雽ﶼ蘉匿⚜ﱷ噥袱\ue674\ufde6相琉".length();
      int var10 = 0;
      String[] var9 = new String[1];
      int var8 = var10001;
      String var7 = "\u0011ﱗ옒ﷁ䙳復雽ﶼ蘉匿⚜ﱷ噥袱\ue674\ufde6相琉";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 1;
               case 1 -> 154;
               case 2 -> 247;
               case 3 -> 141;
               case 4 -> 96;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      lI = var9;
      ll = new Object[var9.length];
      int var20 = 0;
      Il = new int[10];
      int var22 = 0;
      byte[] var10002 = "£«æó\r ¦\u0013òÃ<\u009f\u008a£\b^»·²\u000e3\u001fÊ\u0097\u0088vBò+é\u008dT\u0019ü4#?\u0091\b\u009c".getBytes("ISO-8859-1");

      int var44;
      do {
         Il[var20] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ -2024058990;
         var20 += 1;
         var44 = var22 + 4;
         var22 += 4;
      } while (var44 < var10002.length);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lI((short)'\uf272', '擜', var17 ^ 1994105620)).length();
      int var2 = Il(-876614810, var17 ^ -169042267);
      int var1 = -1;

      while (true) {
         label86: {
            var20 = Il(-876614809, var17 ^ 1533533813);
            char[] var45 = var3.substring(++var1, var1 + var2).toCharArray();
            int var55 = var45.length;
            int var6 = 0;
            var44 = var20;
            var34 = var45;
            var22 = var55;
            char[] var64;
            int var71;
            if (var55 <= 1) {
               var64 = var45;
               var55 = var20;
               var71 = var6;
            } else {
               var44 = var20;
               var22 = var55;
               if (var55 <= var6) {
                  break label86;
               }

               var64 = var45;
               var55 = var20;
               var71 = var6;
            }

            while (true) {
               var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % Il(-876614812, var17 ^ -1534835512)) {
                  case 0 -> Il(-876614811, var17 ^ -589008684);
                  case 1 -> Il(-876614814, var17 ^ -302986618);
                  case 2 -> Il(-876614813, var17 ^ 1700311572);
                  case 3 -> Il(-876614816, var17 ^ -567199103);
                  case 4 -> Il(-876614815, var17 ^ 2108618027);
                  case 5 -> Il(-876614802, var17 ^ 1337674901);
                  default -> Il(-876614801, var17 ^ 1775661090);
               });
               var6++;
               if (var44 == 0) {
                  var71 = var44;
                  var64 = var34;
                  var55 = var44;
               } else {
                  if (var22 <= var6) {
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
            II = new class_9154(class_2960.method_60655(IlIIllIII.lI(var0[1]), IlIIllIII.lI(var0[0])));
            l = class_8710.method_56484(IIIIllII::II, IIIIllII::l);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private static IIIIllII l(class_2540 var0) {
      byte[] var1 = new byte[var0.readableBytes()];
      var0.method_52979(var1);
      return new IIIIllII(var1);
   }

   public class_9154<? extends class_8710> method_56479() {
      return II;
   }

   private static void II(IIIIllII var0, class_2540 var1) {
      var1.method_52983(var0.I());
   }
}
