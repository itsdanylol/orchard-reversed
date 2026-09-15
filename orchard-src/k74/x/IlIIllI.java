package k74.x;

import java.util.ArrayList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class IlIIllI {
   private final lllIIllI I;
   private static final Object[] IlI;
   private final int l;
   private static final String[] IIl;
   private static final String II;
   private final IllIlIl Il;
   private static final int[] III;
   private final boolean lI;
   private final boolean ll;

   private static int IlI(int var0, int var1) {
      int var2 = III[var0 ^ 5492672] ^ var1 ^ var0;
      var2 ^= 57886;
      var2 += 51379;
      var2 += 33971;
      var2 += 36763;
      var2 += 48448;
      var2 -= 64492;
      var2 += 14399;
      var2 -= 54296;
      return var2 - 50285;
   }

   boolean I(IllIlIl var1, int var2) {
      return this.Il == var1 && this.l == var2;
   }

   void l(String var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (this.I != null) {
         this.I.I(var1);
      } else {
         if (this.Il != null) {
            if (this.l >= 0) {
               if (this.l >= this.Il.IIlI().size()) {
                  this.Il.IlI(var1);
                  if (var2 == null) {
                     return;
                  }
               }

               this.Il.llI(this.l, var1);
               return;
            }

            ArrayList var3 = new ArrayList();

            for (String var7 : var1.split(IlIIllIII.lI(II))) {
               String var8 = var7.trim();
               if (!var8.isEmpty()) {
                  var3.add(var8);
               }

               if (var2 != null) {
                  break;
               }
            }

            this.Il.lII(var3);
         }
      }
   }

   static IlIIllI II(lllIIllI var0) {
      return new IlIIllI(var0, null, -1, false, false);
   }

   static IlIIllI Il(IllIlIl var0, int var1) {
      return new IlIIllI(null, var0, var1, false, false);
   }

   static IlIIllI lI() {
      return new IlIIllI(null, null, -1, true, false);
   }

   static IlIIllI ll() {
      return new IlIIllI(null, null, -1, false, true);
   }

   private IlIIllI(lllIIllI var1, IllIlIl var2, int var3, boolean var4, boolean var5) {
      this.I = var1;
      this.Il = var2;
      this.l = var3;
      this.lI = var4;
      this.ll = var5;
   }

   private static String Ill(byte var0, int var1, int var2, int var3, int var4) {
      int var9 = var3 ^ 104028168;
      char[] var8 = IIl[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])IlI[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         IlI[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 60009;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ var7 ^ var0 ^ var1 ^ var2 ^ var6 ^ var3 ^ var4);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var12 = 1739930366;
      String var2 = "㆑㇙㇛㇁ㅸ\u31e7ㆩ㆚";
      char[] var3 = "穟".toCharArray();
      short var1 = 31319;
      byte var8 = -1;
      String[] var4 = new String[var3.length];

      while (true) {
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         if (var8 == 0) {
            IIl = var4;
            IlI = new Object[var4.length];
            int var14 = 0;
            int var10001 = 0;
            byte[] var10002 = "É\u0016`\u009f\u0085p\u0083\u0003\u001bz\u0007V\u0015õ½ã9T\u0088[woåaç\u0003`ê¢ÒÝ\\ Z(²".getBytes("ISO-8859-1");
            III = new int[9];

            int var37;
            do {
               III[var14] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 724001952;
               var14 += 1;
               var37 = var10001 + 4;
               var10001 += 4;
            } while (var37 < var10002.length);

            var14 = IlI(5492672, var12 ^ 2049495340);
            char[] var38 = Ill((byte)-32, -539149661, 1073488077, 104028168, -1295084933).toCharArray();
            int var49 = var38.length;
            int var0 = 0;
            var37 = var14;
            char[] var28 = var38;
            var10001 = var49;
            char[] var58;
            int var65;
            if (var49 <= 1) {
               var58 = var38;
               var49 = var14;
               var65 = var0;
            } else {
               var37 = var14;
               var10001 = var49;
               if (var49 <= var0) {
                  String var42 = new String(var38).intern();
                  byte var22 = -1;
                  II = var42;
                  return;
               }

               var58 = var38;
               var49 = var14;
               var65 = var0;
            }

            while (true) {
               var58[var65] = (char)(var58[var65] ^ var49 ^ switch (var0 % IlI(5492673, var12 ^ 911094138)) {
                  case 0 -> IlI(5492674, var12 ^ -1471891757);
                  case 1 -> IlI(5492675, var12 ^ -1496642520);
                  case 2 -> IlI(5492676, var12 ^ -1972749888);
                  case 3 -> IlI(5492677, var12 ^ -1001302866);
                  case 4 -> IlI(5492678, var12 ^ 1413337454);
                  case 5 -> IlI(5492679, var12 ^ 300707054);
                  default -> IlI(5492680, var12 ^ -1822123695);
               });
               var0++;
               if (var37 == 0) {
                  var65 = var37;
                  var58 = var28;
                  var49 = var37;
               } else {
                  if (var10001 <= var0) {
                     String var41 = new String(var28).intern();
                     byte var21 = -1;
                     II = var41;
                     return;
                  }

                  var58 = var28;
                  var49 = var37;
                  var65 = var0;
               }
            }
         }

         do {
            var7 = var3[var5] ^ var1;
            char[] var9 = var2.substring(var6, var6 + var7).toCharArray();
            int var10 = 0;

            do {
               short var11 = switch (var10 % 6) {
                  default -> 16;
                  case 1 -> 78;
                  case 2 -> 104;
                  case 3 -> 51;
                  case 4 -> 250;
                  case 5 -> 15;
               };
               var9[var10] = (char)(var9[var10] ^ var11);
            } while (++var10 < var9.length);

            var4[var5] = new String(var9).intern();
            var6 += var7;
         } while (++var5 < var3.length);

         var8 = 0;
      }
   }

   static IlIIllI III(IllIlIl var0) {
      return new IlIIllI(null, var0, -1, false, false);
   }

   boolean IIl(IlIIllI var1) {
      return var1 != null && this.I == var1.I && this.Il == var1.Il && this.l == var1.l && this.lI == var1.lI && this.ll == var1.ll;
   }
}
