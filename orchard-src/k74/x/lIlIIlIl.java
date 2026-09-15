package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum lIlIIlIl {
   I,
   II;

   private final IIIlIlIl l;
   private static final String[] ll;
   private static final int[] lI;
   private static final Object[] III;
   private static final lIlIIlIl[] Il;

   public static lIlIIlIl I(String var0) {
      return Enum.valueOf(lIlIIlIl.class, var0);
   }

   public IIIlIlIl l() {
      return this.l;
   }

   private static lIlIIlIl[] II() {
      return new lIlIIlIl[]{I, II};
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   private static String lI(int var0, int var1, short var2, char var3, int var4, int var5, short var6) {
      int var11 = var1 ^ -939603833;
      char[] var10 = ll[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])III[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         III[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 47949;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ var9 ^ 46942 ^ var2 ^ var4 ^ var1 ^ var5 ^ var0 ^ var8 ^ var3 ^ var6);
      }

      return new String(var10).intern();
   }

   private static int Il(int var0, int var1) {
      int var2 = lI[var0 ^ -1295416368] ^ var1 ^ var0;
      var2 += 22188;
      var2 += 65051;
      var2 -= 18885;
      var2 -= 50294;
      var2 ^= 48646;
      var2 -= 49443;
      var2 ^= 30871;
      var2 += 1323;
      var2 ^= 40244;
      return var2 ^ 42808;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = 789691515;
      int var10001 = "\u0010\uf4a2꽇\uf546꽖\uf42e\uef42\uf4e6⽖\uf556꽉\uf40a꽌\uf42e潖\uf542꽌\u001d뷑鯖밵\udbc4뷩寝뷕ᯜ밡ᯗ봹鯇벍\udbd2뷥ᯛ붝寓벩ᯞ뷭\udbdb밍\udbd1뵑\udbc1붝寝뱑".length();
      int var11 = 0;
      int var8 = var10001;
      String[] var22 = new String[2];
      int var10 = 0;
      short var12 = 15970;
      String[] var9 = var22;
      String var7 = "\u0010\uf4a2꽇\uf546꽖\uf42e\uef42\uf4e6⽖\uf556꽉\uf40a꽌\uf42e潖\uf542꽌\u001d뷑鯖밵\udbc4뷩寝뷕ᯜ밡ᯗ봹鯇벍\udbd2뷥ᯛ붝寓벩ᯞ뷭\udbdb밍\udbd1뵑\udbc1붝寝뱑";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      ll = var9;
      III = new Object[var9.length];
      int var10000 = 0;
      int var23 = 0;
      lI = new int[10];
      byte[] var10002 = "\u0000ôÄ\u009ag\u008aR´\u008eÎºí©û\u008d\u0098ÄÃ£ÅZÛ\u0093Âá¹\b\u009c¤q\u0098\u0003g\u00ad´\u009e\u009a¼!¯".getBytes("ISO-8859-1");

      int var54;
      do {
         lI[var10000] = ((var10002[var23] & 255) << 24 | (var10002[var23 + 1] & 255) << 16 | (var10002[var23 + 2] & 255) << 8 | var10002[var23 + 3] & 255)
            ^ -963814578;
         var10000 += 1;
         var54 = var23 + 4;
         var23 += 4;
      } while (var54 < var10002.length);

      String[] var0 = new String[4];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lI(-563507479, -939603833, 31616, (char)'迊', 507649459, -477689242, 25626)).length();
      int var2 = 3;
      int var19 = -1;

      label91:
      while (true) {
         var10000 = Il(-1295416368, var17 ^ 1537265010);
         String var26 = var3.substring(++var19, var19 + var2);
         byte var38 = -1;

         while (true) {
            label86: {
               char[] var56 = var26.toCharArray();
               int var68 = var56.length;
               int var6 = 0;
               var54 = var10000;
               var43 = var56;
               var23 = var68;
               char[] var80;
               int var87;
               if (var68 <= 1) {
                  var80 = var56;
                  var68 = var10000;
                  var87 = var6;
               } else {
                  var54 = var10000;
                  var23 = var68;
                  if (var68 <= var6) {
                     break label86;
                  }

                  var80 = var56;
                  var68 = var10000;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % Il(-1295416366, var17 ^ -711281894)) {
                     case 0 -> Il(-1295416365, var17 ^ -223378581);
                     case 1 -> Il(-1295416364, var17 ^ -1617450456);
                     case 2 -> Il(-1295416363, var17 ^ 26189064);
                     case 3 -> Il(-1295416362, var17 ^ -1158871478);
                     case 4 -> Il(-1295416361, var17 ^ -14313773);
                     case 5 -> Il(-1295416360, var17 ^ 1022999127);
                     default -> Il(-1295416359, var17 ^ -1041748125);
                  });
                  var6++;
                  if (var54 == 0) {
                     var87 = var54;
                     var80 = var43;
                     var68 = var54;
                  } else {
                     if (var23 <= var6) {
                        break;
                     }

                     var80 = var43;
                     var68 = var54;
                     var87 = var6;
                  }
               }
            }

            String var61 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var0[var4++] = var61;
                  if ((var19 += var2) >= var5) {
                     I = new lIlIIlIl(IlIIllIII.Ill(var0[1]));
                     II = new lIlIIlIl(IlIIllIII.Ill(var0[3]));
                     Il = II();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var61;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label91;
                  }

                  var5 = (var3 = lI(503533014, -939603834, 18709, 6231, 837676107, -1095184187, (short)-1226)).length();
                  var2 = Il(-1295416367, var17 ^ 1021205179);
                  var19 = -1;
            }

            var10000 = 2;
            var26 = var3.substring(++var19, var19 + var2);
            var38 = 0;
         }
      }
   }

   private lIlIIlIl(IIIlIlIl var3) {
      this.l = var3;
   }
}
