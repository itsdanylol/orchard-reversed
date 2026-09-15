package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IlIIll {
   I,
   l,
   II,
   ll;
   private static final String[] IIl;
   private static final Object[] IlI;
   private static final int[] III;
   private static final IlIIll[] Il;
   private final IIIlIlIl lI;

   private IlIIll(IIIlIlIl var3) {
      this.lI = var3;
   }

   private static String lI(int var0, int var1) {
      int var3 = var0 ^ -655150257;
      char[] var4 = IIl[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IlI[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IlI[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 648133332;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 48;
            case 1 -> 171;
            case 2 -> 41;
            case 3 -> 130;
            case 4 -> 74;
            case 5 -> 88;
            case 6 -> 31;
            case 7 -> 32;
            case 8 -> 6;
            case 9 -> 199;
            case 10 -> 186;
            case 11 -> 50;
            case 12 -> 187;
            case 13 -> 242;
            case 14 -> 221;
            case 15 -> 34;
            case 16 -> 237;
            case 17 -> 160;
            case 18 -> 125;
            case 19 -> 230;
            case 20 -> 18;
            case 21 -> 92;
            case 22 -> 51;
            case 23 -> 230;
            case 24 -> 110;
            case 25 -> 233;
            case 26 -> 80;
            case 27 -> 249;
            case 28 -> 204;
            case 29 -> 180;
            case 30 -> 180;
            case 31 -> 116;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = -1852308820;
      int var16 = 0;
      int var17 = 0;
      String[] var10001 = new String[2];
      short var18 = 13485;
      String[] var15 = var10001;
      int var14 = "?咒䨺冞誏呰媉吊樳公뫆徲許塞窍墀몊幊騿刼竀哂\uda30剎ઈ嗀媅傊먼巬쫀姲騶匾᪉倰誅刊訶囜韛傂騿崾\uda80婠몄妊ᨳ寬\uaac6埲騹傾몃兰檁咺\uaa3f僼嫅尒塀塎\r\udc50䢰\ud89c蠇\udd52蠆\udfb8碼\uda0e桏폐⢻휌".length();
      String var13 = "?咒䨺冞誏呰媉吊樳公뫆徲許塞窍墀몊幊騿刼竀哂\uda30剎ઈ嗀媅傊먼巬쫀姲騶匾᪉倰誅刊訶囜韛傂騿崾\uda80婠몄妊ᨳ寬\uaac6埲騹傾몃兰檁咺\uaa3f僼嫅尒塀塎\r\udc50䢰\ud89c蠇\udd52蠆\udfb8碼\uda0e桏폐⢻휌";

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 216;
               case 1 -> 96;
               case 2 -> 100;
               case 3 -> 214;
               case 4 -> 154;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIl = var15;
      IlI = new Object[var15.length];
      int var9 = -1259344645;
      byte[] var7 = "½\u0006X\u0095\u001c×ÑAás\u001dt;_Í\u009bA$&<=\u0006Î%L\u001f\u009c\t\u0089K¤\bgÇ\u00015\u0086Þ\u0083¶Ü]·äÊ%z\\6\u0089 ªùáô1"
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

      String[] var0 = new String[Il(281867572, var23 ^ -2000902231)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lI(-655150257, var23 ^ 462032287)).length();
      int var2 = Il(281867573, var23 ^ 695021120);
      int var25 = -1;

      label100:
      while (true) {
         int var28 = Il(281867574, var23 ^ -724966875);
         String var30 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label95: {
               char[] var45 = var30.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var28;
               var41 = var45;
               int var35 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var48 = var28;
                  var35 = var10004;
                  if (var10004 <= var6) {
                     break label95;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % Il(281867568, var23 ^ 1956567301)) {
                     case 0 -> Il(281867569, var23 ^ 146551099);
                     case 1 -> Il(281867570, var23 ^ 2040881965);
                     case 2 -> Il(281867571, var23 ^ -1125033180);
                     case 3 -> Il(281867580, var23 ^ 1383988742);
                     case 4 -> Il(281867581, var23 ^ -1285260108);
                     case 5 -> Il(281867582, var23 ^ -370718505);
                     default -> Il(281867583, var23 ^ -6322523);
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
                     I = new IlIIll(IlIIllIII.Ill(var0[3]));
                     II = new IlIIll(IlIIllIII.Ill(var0[2]));
                     ll = new IlIIll(IlIIllIII.Ill(var0[4]));
                     l = new IlIIll(IlIIllIII.Ill(var0[0]));
                     Il = I();
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

                  var5 = (var3 = lI(-655150258, var23 ^ 862681280)).length();
                  var2 = 5;
                  var25 = -1;
            }

            var28 = Il(281867575, var23 ^ 249901697);
            var30 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private static IlIIll[] I() {
      return new IlIIll[]{I, II, ll, l};
   }

   private static int Il(int var0, int var1) {
      int var2 = III[var0 ^ 281867572] ^ var1 ^ var0;
      var2 ^= 4083;
      var2 ^= 29909;
      var2 ^= 17851;
      var2 ^= 47897;
      var2 += 6093;
      var2 -= 52352;
      return var2 ^ 44320;
   }

   public String l() {
      return this.lI.llIl();
   }

   public IIIlIlIl II() {
      return this.lI;
   }
}
