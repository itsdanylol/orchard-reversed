package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum IIlIlIlll {
   I,
   l,
   II,
   Il,
   ll,
   III,
   IIl,
   IlI,
   Ill;
   private static final IIlIlIlll[] lI;
   private static final int[] lII;
   private static final String[] lIl;
   private static final Object[] llI;

   public static IIlIlIlll I(String var0) {
      return Enum.valueOf(IIlIlIlll.class, var0);
   }

   private static IIlIlIlll[] l() {
      IIlIlIlll[] var10000 = new IIlIlIlll[II(-1229693123, -103487954 ^ 611926183)];
      var10000[0] = I;
      var10000[1] = II;
      var10000[2] = Il;
      var10000[3] = IIl;
      var10000[4] = l;
      var10000[5] = III;
      var10000[II(-1229693124, -103487954 ^ 433290317)] = Ill;
      var10000[II(-1229693125, -103487954 ^ -138762629)] = IlI;
      var10000[II(-1229693126, -103487954 ^ 391732092)] = ll;
      return var10000;
   }

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ 220995772;
      char[] var4 = lIl[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])llI[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         llI[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 706065551;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 22;
            case 1 -> 41;
            case 2 -> 213;
            case 3 -> 143;
            case 4 -> 172;
            case 5 -> 255;
            case 6 -> 231;
            case 7 -> 89;
            case 8 -> 140;
            case 9 -> 85;
            case 10 -> 223;
            case 11 -> 72;
            case 12 -> 211;
            case 13 -> 92;
            case 14 -> 46;
            case 15 -> 171;
            case 16 -> 213;
            case 17 -> 185;
            case 18 -> 184;
            case 19 -> 214;
            case 20 -> 241;
            case 21 -> 205;
            case 22 -> 91;
            case 23 -> 70;
            case 24 -> 191;
            case 25 -> 76;
            case 26 -> 5;
            case 27 -> 210;
            case 28 -> 113;
            case 29 -> 35;
            case 30 -> 99;
            case 31 -> 76;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 1854497618;
      int var17 = 0;
      short var18 = 16036;
      String[] var15 = new String[2];
      int var14 = "@웩᳄엳鲷쓻\udcdf씽峟얛\u1c8f쒛ᳳ얹\udcda옃\u1cbc쐓鳙쑥\udcf7앯岱잳鳢쒁鳝웿\udcb0옛鳷쟕鳝욗岌쒣鳜씽\udcf6씛岖쓣\udce7쐩鳐얋岕옛鳝쐑鳱쐳\udcb8씫᳕쟑\udcce얏鲅욃峕읡᳀왋\u1c8f\u000b틄趁톮췲퇂춉큠춘킾䷒킎"
         .length();
      String var13 = "@웩᳄엳鲷쓻\udcdf씽峟얛\u1c8f쒛ᳳ얹\udcda옃\u1cbc쐓鳙쑥\udcf7앯岱잳鳢쒁鳝웿\udcb0옛鳷쟕鳝욗岌쒣鳜씽\udcf6씛岖쓣\udce7쐩鳐얋岕옛鳝쐑鳱쐳\udcb8씫᳕쟑\udcce얏鲅욃峕읡᳀왋\u1c8f\u000b틄趁톮췲퇂춉큠춘킾䷒킎";
      int var16 = 0;

      do {
         char var10000 = var13.charAt(var17);
         int var21 = 0;
         char var19 = var10000;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 92;
               case 1 -> 160;
               case 2 -> 42;
               case 3 -> 237;
               case 4 -> 70;
               case 5 -> 136;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 2 | var22 << 14) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 2 | var22 >>> 14) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lIl = var15;
      llI = new Object[var15.length];
      int var9 = 470479074;
      byte[] var7 = "Á\u0006À-Î\u0093u^rª/\u00066lkïÃ\u0002`\u0016\u009d\u0013\u001b-\u0087J,\u001c9T^\u0014\u0016f<Ù\u0082\u008bÖ\u0000X ¥ô\u0001\u0019x\u000e¼y\fÜ\u0083æ*yr+@\u0010ù$µZ¶±l\tÄ\u0087ø;\u0088ì»ËµF\u0087%[/]\u001f»Ì \u0010"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lII = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lII[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[II(-1229693137, var23 ^ -87114193)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(220995772, var23 ^ 1307732634)).length();
      int var2 = 4;
      int var25 = -1;

      label100:
      while (true) {
         int var29 = II(-1229693138, var23 ^ -178582892);
         String var10001 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label95: {
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
                     break label95;
                  }

                  var57 = var45;
                  var10004 = var29;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % II(-1229693141, var23 ^ -120971746)) {
                     case 0 -> II(-1229693142, var23 ^ -1495571185);
                     case 1 -> II(-1229693143, var23 ^ -1132309978);
                     case 2 -> II(-1229693144, var23 ^ 43786293);
                     case 3 -> II(-1229693145, var23 ^ 766395190);
                     case 4 -> II(-1229693146, var23 ^ -1186747954);
                     case 5 -> II(-1229693147, var23 ^ 1676204565);
                     default -> II(-1229693148, var23 ^ 986777148);
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
                  if ((var25 += var2) >= var5) {
                     I = new IIlIlIlll();
                     II = new IIlIlIlll();
                     Il = new IIlIlIlll();
                     IIl = new IIlIlIlll();
                     l = new IIlIlIlll();
                     III = new IIlIlIlll();
                     Ill = new IIlIlIlll();
                     IlI = new IIlIlIlll();
                     ll = new IIlIlIlll();
                     lI = l();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var50;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label100;
                  }

                  var5 = (var3 = Il(220995773, var23 ^ 143856059)).length();
                  var2 = II(-1229693139, var23 ^ 1231180035);
                  var25 = -1;
            }

            var29 = II(-1229693140, var23 ^ 228857324);
            var10001 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private static int II(int var0, int var1) {
      int var2 = lII[var0 ^ -1229693137] ^ var1 ^ var0;
      var2 -= 18247;
      var2 += 40933;
      var2 += 12004;
      var2 ^= 44717;
      var2 += 41155;
      var2 -= 42242;
      var2 -= 46450;
      var2 ^= 41980;
      var2 -= 20520;
      return var2 + 55092;
   }
}
