package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2540;
import net.minecraft.class_2960;
import net.minecraft.class_8710;
import net.minecraft.class_9139;
import net.minecraft.class_8710.class_9154;

@Environment(EnvType.CLIENT)
public record IIIllllII(byte[] aW) implements class_8710 {
   private static final String[] lI;
   private final byte[] I;
   private static final Object[] ll;
   private static final int[] Il;
   public static final class_9154<IIIllllII> l;
   public static final class_9139<class_2540, IIIllllII> II;

   public class_9154<? extends class_8710> method_56479() {
      return l;
   }

   private static String lI(int var0, short var1, char var2) {
      int var3 = var2 ^ '\ue7ec';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 3591;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 13816;
         var10 += 49472;
         var10 ^= 10736;
         var10 -= 21730;
         var10 += 26822;
         var10 += 49032;
         var10 -= 46121;
         var10 += 43124;
         var10 -= 52332;
         var10 -= 48886;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static void l(IIIllllII var0, class_2540 var1) {
      var1.method_52983(var0.I());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 1021031406;
      char[] var9 = "嗓".toCharArray();
      String var8 = "磫砟糳籟粌祑研糴砽磢碲秣糿砶磣糥籨碖秡磙糍";
      short var7 = 21958;
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            lI = var10;
            ll = new Object[var10.length];
            int var21 = 0;
            int var10001 = 0;
            Il = new int[10];
            byte[] var10002 = "N0'3\u0000ëÓ»¾.ã\u0099Fê\u0096Í»ZC¾SxZ×Ð\u0004\u008ec\u008e\u0090Â\u007fI¾þ!\u001b3±;".getBytes("ISO-8859-1");

            int var44;
            do {
               Il[var21] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 1659047375;
               var21 += 1;
               var44 = var10001 + 4;
               var10001 += 4;
            } while (var44 < var10002.length);

            String[] var0 = new String[2];
            int var4 = 0;
            String var3;
            int var5 = (var3 = lI(var18 ^ 274041979, (short)'釐', '\ue7ec')).length();
            int var2 = Il(65331508, var18 ^ 334411685);
            int var1 = -1;

            while (true) {
               label87: {
                  var21 = Il(65331509, var18 ^ 1563771737);
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
                        break label87;
                     }

                     var64 = var45;
                     var55 = var21;
                     var71 = var6;
                  }

                  while (true) {
                     var64[var71] = (char)(var64[var71] ^ var55 ^ switch (var6 % Il(65331510, var18 ^ -470780944)) {
                        case 0 -> Il(65331511, var18 ^ 456394331);
                        case 1 -> Il(65331504, var18 ^ -427502740);
                        case 2 -> Il(65331505, var18 ^ 245811795);
                        case 3 -> Il(65331506, var18 ^ -1915085076);
                        case 4 -> Il(65331507, var18 ^ -749841695);
                        case 5 -> Il(65331516, var18 ^ 341864142);
                        default -> Il(65331517, var18 ^ 1189945757);
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
                  l = new class_9154(class_2960.method_60655(IlIIllIII.lI(var0[0]), IlIIllIII.lI(var0[1])));
                  II = class_8710.method_56484(IIIllllII::l, IIIllllII::II);
                  return;
               }

               var2 = var3.charAt(var1);
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 84;
                  case 1 -> 245;
                  case 2 -> 80;
                  case 3 -> 244;
                  case 4 -> 38;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public IIIllllII(byte[] aW) {
      this.I = aW;
   }

   private static int Il(int var0, int var1) {
      int var2 = Il[var0 ^ 65331508] ^ var1 ^ var0;
      var2 -= 29264;
      var2 += 13943;
      var2 += 62541;
      var2 -= 38064;
      var2 -= 46942;
      var2 += 2384;
      var2 -= 25319;
      var2 -= 65471;
      var2 -= 50731;
      return var2 - 7260;
   }

   private static IIIllllII II(class_2540 var0) {
      byte[] var1 = new byte[var0.readableBytes()];
      var0.method_52979(var1);
      return new IIIllllII(var1);
   }
}
