package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2540;
import net.minecraft.class_2960;
import net.minecraft.class_8710;
import net.minecraft.class_9139;
import net.minecraft.class_8710.class_9154;

@Environment(EnvType.CLIENT)
public record lIlIlIl(byte[] aX) implements class_8710 {
   private static final int[] Il;
   private final byte[] I;
   public static final class_9139<class_2540, lIlIlIl> l;
   private static final Object[] ll;
   private static final String[] lI;
   public static final class_9154<lIlIlIl> II;

   private static void I(lIlIlIl var0, class_2540 var1) {
      var1.method_52983(var0.l());
   }

   public lIlIlIl(byte[] aX) {
      this.I = aX;
   }

   public byte[] l() {
      return this.I;
   }

   private static String lI(short var0, int var1, short var2, int var3, int var4) {
      int var9 = var1 ^ -351643317;
      char[] var8 = lI[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])ll[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         ll[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 36189;

      for (int var7 = 0; var7 < var8.length; var7++) {
         var8[var7] = (char)(var8[var7] ^ var7 ^ var3 ^ var2 ^ var1 ^ var4 ^ var6 ^ var0);
      }

      return new String(var8).intern();
   }

   private static int Il(int var0, int var1) {
      int var2 = Il[var0 ^ -1995464555] ^ var1 ^ var0;
      var2 -= 61125;
      var2 ^= 6864;
      var2 ^= 58126;
      var2 ^= 50050;
      var2 -= 24939;
      var2 -= 51297;
      var2 += 28056;
      return var2 + 56937;
   }

   public class_9154<? extends class_8710> method_56479() {
      return II;
   }

   private static lIlIlIl II(class_2540 var0) {
      byte[] var1 = new byte[var0.readableBytes()];
      var0.method_52979(var1);
      return new lIlIlIl(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -1093056925;
      int var14 = "\u0011癊꧔盚䧙盂⧜璂\ue9d3矲⧘瘊짛眢\ua9da盺짒瞊".length();
      short var18 = 13669;
      int var16 = 0;
      String var13 = "\u0011癊꧔盚䧙盂⧜璂\ue9d3矲⧘瘊짛眢\ua9da盺짒瞊";
      int var17 = 0;
      String[] var15 = new String[1];

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << '\r') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> '\r') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lI = var15;
      ll = new Object[var15.length];
      int var9 = 968485832;
      byte[] var7 = "\u000e\u0018O\u0004\u001f_Fr×\u0014Ïq3>fË\u00ad\u009fà\u001b\rü\u009cäýÜt¦»\u009eÊ\u0006\"Å 3\u001e¬R%".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      Il = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         Il[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lI((short)-26571, -351643317, (short)-28342, -1359634615, -1389573045)).length();
      int var2 = Il(-1995464555, var23 ^ 7836782);
      int var1 = -1;

      while (true) {
         char[] var10002;
         label75: {
            int var10000 = Il(-1995464556, var23 ^ 288397437);
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var31 = var10000;
            var10002 = var10003;
            int var26 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            } else {
               var31 = var10000;
               var26 = var10004;
               if (var10004 <= var6) {
                  break label75;
               }

               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % Il(-1995464553, var23 ^ -646245346)) {
                  case 0 -> Il(-1995464554, var23 ^ 1028765909);
                  case 1 -> Il(-1995464559, var23 ^ -1544536559);
                  case 2 -> Il(-1995464560, var23 ^ 59983796);
                  case 3 -> Il(-1995464557, var23 ^ -206327836);
                  case 4 -> Il(-1995464558, var23 ^ -1242492596);
                  case 5 -> Il(-1995464547, var23 ^ 749402944);
                  default -> Il(-1995464548, var23 ^ 281250873);
               });
               var6++;
               if (var31 == 0) {
                  var10006 = var31;
                  var10005 = var10002;
                  var10004 = var31;
               } else {
                  if (var26 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var31;
                  var10006 = var6;
               }
            }
         }

         String var33 = new String(var10002).intern();
         byte var28 = -1;
         var0[var4++] = var33;
         if ((var1 += var2) >= var5) {
            II = new class_9154(class_2960.method_60655(IlIIllIII.lI(var0[0]), IlIIllIII.lI(var0[1])));
            l = class_8710.method_56484(lIlIlIl::I, lIlIlIl::II);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
