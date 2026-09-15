package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIIlIll {
   I,
   l,
   II,
   Il,
   lI,
   III,
   IIl,
   IlI,
   Ill;
   private static final String[] lIl;
   private static final int[] lII;
   private static final IIIlIll[] ll;
   private static final Object[] llI;

   private static String Il(byte var0, char var1, int var2, char var3, int var4, short var5, int var6) {
      int var11 = var4 ^ 40385073;
      char[] var10 = lIl[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])llI[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         llI[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 9377;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ '뫒' ^ switch (var9 % 5) {
            default -> 42;
            case 1 -> 152;
            case 2 -> 36;
            case 3 -> 54;
            case 4 -> 1;
         } ^ var9 ^ var5 ^ var6 ^ var4 ^ var1 ^ var8 ^ var0 ^ var3 ^ var2);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = 232236777;
      char[] var10002 = "↉⇰".toCharArray();
      byte var14 = -1;
      char[] var9 = var10002;
      String var8 = "卻匟卽叏匝匮叉发卩厅卧叚包叄半叏厩卮卦厲匧卹卣卾匽叚叽古卸区匁卬单厒卿卶友叴匱厢匸厖匔变匑叻厕卜匰叛卉匮卌卼區叨厁厙匶匝匌卢匥叠占匭厉口卛取博叮占厤卼厃叧匯医叩匢匣南匾北叟受厇匿匂協医匌厬匈卟叒友卤뉮눉뉣닙눔눨닄닃뉾느뉢닲뉑닂눴닌늪뉭뉥늱눤뉺뉠뉮눣닏";
      short var7 = 8682;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            lIl = var10;
            llI = new Object[var10.length];
            int var22 = 0;
            lII = new int[22];
            int var10001 = 0;
            byte[] var34 = "Ù-àõ^Y¿Åí¨\u009f®\u0096\t\u0012BÊãðõ*\u0081\u0017f\u009d2\u0093g3Ó\u0088\u0000N\fDZ\u0090&ø÷}\u001c\u001dæ~T=f4á\u0010\u00adÎ²ß)AOÙæ\u001a_×H¢Õ\u001e\u0002;i3ÉÜÞúq\u001aÄ\u0085¨_®>\u009b\tÏÆÅ"
               .getBytes("ISO-8859-1");

            int var56;
            do {
               lII[var22] = ((var34[var10001] & 255) << 24 | (var34[var10001 + 1] & 255) << 16 | (var34[var10001 + 2] & 255) << 8 | var34[var10001 + 3] & 255)
                  ^ 592386259;
               var22 += 1;
               var56 = var10001 + 4;
               var10001 += 4;
            } while (var56 < var34.length);

            String[] var0 = new String[II(-892074527, var18 ^ 1029807715)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = Il((byte)-20, '꣮', 465937053, (char)'쐩', 40385073, (short)18862, -2142421183)).length();
            int var2 = II(-892074528, var18 ^ -1172979374);
            int var20 = -1;

            label105:
            while (true) {
               var22 = II(-892074525, var18 ^ 165994998);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var40 = -1;

               while (true) {
                  label100: {
                     char[] var58 = var27.toCharArray();
                     int var70 = var58.length;
                     int var6 = 0;
                     var56 = var22;
                     var10002 = var58;
                     var10001 = var70;
                     char[] var82;
                     int var89;
                     if (var70 <= 1) {
                        var82 = var58;
                        var70 = var22;
                        var89 = var6;
                     } else {
                        var56 = var22;
                        var10001 = var70;
                        if (var70 <= var6) {
                           break label100;
                        }

                        var82 = var58;
                        var70 = var22;
                        var89 = var6;
                     }

                     while (true) {
                        var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % II(-892074523, var18 ^ 783257189)) {
                           case 0 -> II(-892074524, var18 ^ -825398987);
                           case 1 -> II(-892074521, var18 ^ 2038361557);
                           case 2 -> II(-892074522, var18 ^ -677382496);
                           case 3 -> II(-892074519, var18 ^ -1438631394);
                           case 4 -> II(-892074520, var18 ^ 1953138181);
                           case 5 -> II(-892074517, var18 ^ -1722784877);
                           default -> II(-892074518, var18 ^ -1709685959);
                        });
                        var6++;
                        if (var56 == 0) {
                           var89 = var56;
                           var82 = var10002;
                           var70 = var56;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var82 = var10002;
                           var70 = var56;
                           var89 = var6;
                        }
                     }
                  }

                  String var63 = new String(var10002).intern();
                  switch (var40) {
                     case 0:
                        var0[var4++] = var63;
                        if ((var20 += var2) >= var5) {
                           Il = new IIIlIll();
                           Ill = new IIIlIll();
                           IlI = new IIIlIll();
                           l = new IIIlIll();
                           II = new IIIlIll();
                           lI = new IIIlIll();
                           III = new IIIlIll();
                           IIl = new IIIlIll();
                           I = new IIIlIll();
                           ll = l();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var63;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label105;
                        }

                        var5 = (var3 = Il((byte)35, 4885, -610014789, 4096, 40385072, (short)-25305, 16044424)).length();
                        var2 = II(-892074526, var18 ^ 1917152460);
                        var20 = -1;
                  }

                  var22 = 4;
                  var27 = var3.substring(++var20, var20 + var2);
                  var40 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 167;
                  case 1 -> 11;
                  case 2 -> 201;
                  case 3 -> 10;
                  case 4 -> 185;
                  case 5 -> 212;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public static IIIlIll I(String var0) {
      return Enum.valueOf(IIIlIll.class, var0);
   }

   private static int II(int var0, int var1) {
      int var2 = lII[var0 ^ -892074527] ^ var1 ^ var0;
      var2 ^= 4305;
      var2 ^= 6303;
      var2 ^= 55212;
      var2 -= 52797;
      var2 += 48159;
      var2 += 43825;
      var2 -= 8793;
      return var2 ^ 37216;
   }

   private static IIIlIll[] l() {
      IIIlIll[] var10000 = new IIIlIll[II(-892074509, -1189599689 ^ -1940061141)];
      var10000[0] = Il;
      var10000[1] = Ill;
      var10000[2] = IlI;
      var10000[3] = l;
      var10000[4] = II;
      var10000[5] = lI;
      var10000[II(-892074510, -1189599689 ^ 1246198768)] = III;
      var10000[II(-892074507, -1189599689 ^ 254656709)] = IIl;
      var10000[II(-892074508, -1189599689 ^ 1498167449)] = I;
      return var10000;
   }
}
