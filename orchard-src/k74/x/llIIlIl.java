package k74.x;

import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public interface llIIlIl {
   Object[] IlIlllI;
   int[] IlIllII;
   IIIlIlIl l;
   String[] IlIllIl;

   static List<IIIIIlIl> IlI(boolean var0, boolean var1, boolean var2) {
      ArrayList var3 = new ArrayList(3);
      IlIlI(var3, IIIIIlIl.lI, var0);
      IlIlI(var3, IIIIIlIl.IIl, var1);
      IlIlI(var3, IIIIIlIl.ll, var2);
      if (var3.isEmpty()) {
         var3.add(IIIIIlIl.lI);
         var3.add(IIIIIlIl.IIl);
         var3.add(IIIIIlIl.ll);
      }

      return var3;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 266475437;
      int var12 = 0;
      String[] var10001 = new String[1];
      short var13 = 23680;
      String[] var10 = var10001;
      int var11 = 0;
      int var9 = "\f繿\uf7e6縛\uf7f0祿\uf79e禳矯繋㟷绣瞚".length();
      String var8 = "\f繿\uf7e6縛\uf7f0祿\uf79e禳矯繋㟷绣瞚";

      do {
         char var14 = var8.charAt(var12);
         char[] var10000 = var8.substring(var12 + 1, var12 + 1 + var14).toCharArray();
         int var16 = 0;
         char[] var15 = var10000;

         do {
            char var17 = var15[var16];
            if (var16 % 2 == 0) {
               var15[var16] = (char)((var17 >>> 2 | var17 << 14) & 65535 ^ var13);
            } else {
               var15[var16] = (char)((var17 << 2 | var17 >>> 14) & 65535 ^ var13);
            }
         } while (++var16 < var15.length);

         var10[var11] = new String(var15);
         var11++;
         var12 = var12 + var14 + 1;
      } while (var12 < var9);

      IlIllIl = var10;
      IlIlllI = new Object[var10.length];
      int var4 = 1803949748;
      byte[] var2 = "\u0016c\u008c\u0002Ö\u009b/}\u009f\u008f9\u008b\u007fÇ\u0011ÒÆÊZ\u009dÇÅÖóì\u008c¬\"\u001dU½U\u007f\u0080³\u008d".getBytes("ISO-8859-1");
      int var3 = var2.length / 4;
      IlIllII = new int[var3];
      byte var5 = 0;
      int var6 = 0;

      do {
         int var7 = (var2[var5] & 255) << 24 | (var2[var5 + 1] & 255) << 16 | (var2[var5 + 2] & 255) << 8 | var2[var5 + 3] & 255;
         var7 ^= var4;
         IlIllII[var6] = var7;
         var5 += 4;
      } while (++var6 < var3);

      int var21 = IllIlI(47536932, var18 ^ 1892916274);
      char[] var10003 = IllIll('톌', var18 ^ -772987975, 12535).toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      int var28 = var21;
      char[] var10002 = var10003;
      int var23 = var10004;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10004 = var21;
         var10006 = var1;
      } else {
         var28 = var21;
         var23 = var10004;
         if (var10004 <= var1) {
            String var31 = new String(var10003).intern();
            byte var26 = -1;
            String var19 = var31;
            l = IlIIllIII.Ill(var19);
            return;
         }

         var10005 = var10003;
         var10004 = var21;
         var10006 = var1;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var1 % IllIlI(47536933, var18 ^ -1339343083)) {
            case 0 -> IllIlI(47536934, var18 ^ -113301071);
            case 1 -> IllIlI(47536935, var18 ^ 427229626);
            case 2 -> IllIlI(47536928, var18 ^ -1602598266);
            case 3 -> IllIlI(47536929, var18 ^ -1586117323);
            case 4 -> IllIlI(47536930, var18 ^ -1975731170);
            case 5 -> IllIlI(47536931, var18 ^ 2078649652);
            default -> IllIlI(47536940, var18 ^ 422617985);
         });
         var1++;
         if (var28 == 0) {
            var10006 = var28;
            var10005 = var10002;
            var10004 = var28;
         } else {
            if (var23 <= var1) {
               String var30 = new String(var10002).intern();
               byte var25 = -1;
               String var0 = var30;
               l = IlIIllIII.Ill(var0);
               return;
            }

            var10005 = var10002;
            var10004 = var28;
            var10006 = var1;
         }
      }
   }

   boolean llIIl(IIIIIlIl var1);

   private static String IllIll(char var0, int var1, int var2) {
      int var3 = var2 ^ 12535;
      char[] var4 = IlIllIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlIlllI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlIlllI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 28296;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 31897;
         var10 -= 57147;
         var10 -= 25977;
         var10 += 20808;
         var10 -= 11850;
         var10 -= 59165;
         var10 -= 14556;
         var10 += 39403;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   static int IllIlI(int var0, int var1) {
      int var2 = IlIllII[var0 ^ 47536932] ^ var1 ^ var0;
      var2 -= 43030;
      var2 += 40468;
      var2 -= 25184;
      var2 -= 1175;
      var2 ^= 36356;
      var2 ^= 31841;
      var2 ^= 61236;
      var2 -= 53968;
      var2 -= 61688;
      return var2 + 65477;
   }

   static class_243 IlIIl(class_1309 var0, IIIIIlIl var1) {
      if (var0 == null) {
         return null;
      } else {
         class_238 var2 = var0.method_5829();
         class_243 var3 = var2.method_1005();
         IIIIIlIl var4 = var1 == null ? IIIIIlIl.IIl : var1;
         double var5 = var2.field_1325 - var2.field_1322;
         double var7 = var2.field_1322 + var5 * var4.l();
         return new class_243(var3.field_1352, var7, var3.field_1350);
      }
   }

   IIIIIlIl IllIl();

   private static void IlIlI(List<IIIIIlIl> var0, IIIIIlIl var1, boolean var2) {
      if (var2 && !var0.contains(var1)) {
         var0.add(var1);
      }
   }

   static class_238 IlIll(class_1309 var0, IIIIIlIl var1) {
      if (var0 == null) {
         return null;
      } else {
         class_238 var2 = var0.method_5829();
         IIIIIlIl var3 = var1 == null ? IIIIIlIl.IIl : var1;
         double var4 = var2.field_1325 - var2.field_1322;
         double var6 = var2.field_1322 + var4 * var3.lI();
         double var8 = var2.field_1322 + var4 * var3.Il();
         return new class_238(var2.field_1323, var6, var2.field_1321, var2.field_1320, Math.max(var6 + 0.01, var8), var2.field_1324);
      }
   }
}
