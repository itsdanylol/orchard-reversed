package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lIIIlII {
   I,
   II,
   Il,
   lI;

   private static final Object[] IlI;
   private final IIIlIlIl l;
   private static final int[] III;
   private static final String[] IIl;
   private static final lIIIlII[] ll;

   private static int II(int var0, int var1) {
      int var2 = III[var0 ^ -4384078] ^ var1 ^ var0;
      var2 ^= 20176;
      var2 ^= 6239;
      var2 -= 9854;
      var2 ^= 26185;
      var2 ^= 2756;
      return var2 ^ 21616;
   }

   private lIIIlII(IIIlIlIl var3) {
      this.l = var3;
   }

   private static lIIIlII[] I() {
      return new lIIIlII[]{lI, Il, II, I};
   }

   private static String Il(int var0, char var1, int var2) {
      int var3 = var1 ^ '藯';
      char[] var4 = IIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])IlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         IlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 30673;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 'ꙸ';
         var10 -= 38003;
         var10 ^= 46461;
         var10 ^= 9634;
         var10 += 7639;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = -1849651355;
      short var13 = 26337;
      String var14 = "ꄠꂵꆾꂺꇰꃊꂰꇚꄆꇅꄳꄮꁠꄳꇷꅧꄓꀻꃋꆟꄂꅉꁝꄁꇶꄳꄩꀴꄋꇛꄶꅋꆉꅧꀿ閒霍闳閮鞦靵闛鞷闘镗霄震锧靎鞿霅関";
      byte var20 = -1;
      char[] var15 = "#\u0011".toCharArray();
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            IIl = var16;
            IlI = new Object[var16.length];
            int var9 = -1932039998;
            byte[] var7 = "µ\u0080nµ\u009fîìc\u00adá\u008eöî³uEY9Ò?4\u0015_'Ïª´ÈE+\u001f\u0098]\bû\u0012GV\u0013ÉÈ_c\u009a±L\u0003\u001b\bäqV\u0005\u001c\u0019%"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            III = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               III[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[II(-4384078, var24 ^ 1462409820)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il(44160, '藯', var24 ^ -882925385)).length();
            int var2 = 4;
            int var26 = -1;

            label99:
            while (true) {
               int var29 = II(-4384077, var24 ^ 2101614728);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label94: {
                     char[] var45 = var10001.toCharArray();
                     int var10004 = var45.length;
                     int var6 = 0;
                     int var48 = var29;
                     var41 = var45;
                     int var35 = var10004;
                     char[] var57;
                     int var10006;
                     if (var10004 <= 1) {
                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     } else {
                        var48 = var29;
                        var35 = var10004;
                        if (var10004 <= var6) {
                           break label94;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(-4384074, var24 ^ -1147984167)) {
                           case 0 -> II(-4384073, var24 ^ -692081780);
                           case 1 -> II(-4384076, var24 ^ 754991204);
                           case 2 -> II(-4384075, var24 ^ -1484657909);
                           case 3 -> II(-4384070, var24 ^ -1079898140);
                           case 4 -> II(-4384069, var24 ^ -1510152346);
                           case 5 -> II(-4384072, var24 ^ 720738083);
                           default -> II(-4384071, var24 ^ 1407645640);
                        });
                        var6++;
                        if (var48 == 0) {
                           var10006 = var48;
                           var57 = var41;
                           var10004 = var48;
                        } else {
                           if (var35 <= var6) {
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
                        if ((var26 += var2) >= var5) {
                           lI = new lIIIlII(IlIIllIII.Ill(var0[II(-4384066, var24 ^ -363952711)]));
                           Il = new lIIIlII(IlIIllIII.Ill(var0[0]));
                           II = new lIIIlII(IlIIllIII.Ill(var0[II(-4384065, var24 ^ -407441974)]));
                           I = new lIIIlII(IlIIllIII.Ill(var0[3]));
                           ll = I();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var50;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label99;
                        }

                        var5 = (var3 = Il(33467, '藮', var24 ^ -255593619)).length();
                        var2 = II(-4384080, var24 ^ 1330346525);
                        var26 = -1;
                  }

                  var29 = II(-4384079, var24 ^ 202998231);
                  var10001 = var3.substring(++var26, var26 + var2);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17];
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 5) {
                  default -> 171;
                  case 1 -> 210;
                  case 2 -> 21;
                  case 3 -> 154;
                  case 4 -> 110;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   public static lIIIlII l(String var0) {
      return Enum.valueOf(lIIIlII.class, var0);
   }
}
