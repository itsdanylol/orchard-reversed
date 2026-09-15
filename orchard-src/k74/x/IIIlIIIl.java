package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIIlIIIl {
   I,
   l,
   II,
   Il,
   lI,
   III,
   IIl,
   Ill,
   lII,
   lIl,
   llI;
   private static final String[] IIII;
   private static final IIIlIIIl[] ll;
   private static final Object[] IIIl;
   private final IIIlIlIl IlI;
   private static final int[] lll;

   @Override
   public String toString() {
      return this.IlI.llIl();
   }

   private static String lI(int var0, int var1) {
      int var3 = var0 ^ -1855871880;
      char[] var4 = IIII[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -420907301;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 168;
            case 1 -> 102;
            case 2 -> 63;
            case 3 -> 46;
            case 4 -> 10;
            case 5 -> 242;
            case 6 -> 27;
            case 7 -> 0;
            case 8 -> 118;
            case 9 -> 173;
            case 10 -> 238;
            case 11 -> 155;
            case 12 -> 159;
            case 13 -> 52;
            case 14 -> 0;
            case 15 -> 249;
            case 16 -> 126;
            case 17 -> 226;
            case 18 -> 244;
            case 19 -> 41;
            case 20 -> 220;
            case 21 -> 65;
            case 22 -> 129;
            case 23 -> 7;
            case 24 -> 61;
            case 25 -> 26;
            case 26 -> 37;
            case 27 -> 216;
            case 28 -> 63;
            case 29 -> 183;
            case 30 -> 124;
            case 31 -> 139;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = 1655978792;
      short var13 = 5561;
      char[] var15 = "ᗧᖱ".toCharArray();
      String var14 = "쮧쯉쮤쮽쯕쮻쭸쮛쮾쬒쬫쮐쮟쮟쯔쭼쯕쮘쯿쮆쭆쯒쭞쭎쭙쮆쯕쭸쮊쯊쭌쬻쭆쮎쯫쭣쬡쭸쮜쮔쮒쯻쯿쭹쭠쮐쯿쮕쬈쭹쬼쮖쬙쭀쮆쮓쯶쯬쯱쮒쬔쬽쯻쬘쭷쬯쭝쮹쯂쭶쯫쬢쬮쭽쬗쭱쭋쭾쬫쭳쯸쭱쬫쭠쮽쯝쭱쮧쮌쭧쬨쭬쯞쭘盧皮皩皽盖相癗皀";
      String[] var10000 = new String[var15.length];
      byte var20 = -1;
      String[] var16 = var10000;

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            IIII = var16;
            IIIl = new Object[var16.length];
            int var9 = -209453996;
            byte[] var7 = "\u0095¦çòKQ£%\u0095¡n²\u009c*\"Én\b\r\u0011c¤\u0012l¯\u0098+*ÌÜiË\bÂÒ\u0097Á¾\u0096\u0019ÚÙY&W9µgà\u0011ïÔu$\u0086\u0090í*DÈ3\u0013ÏT\u001bo\u0084½O\u007f¤\u000f¤³µ\u0085\u0081Ù\u008dÿ\u000bìÊ¿\u009d·X\u0004\u0096Q\u0095Òõ\b¦µj\u0086²\u009b^\u001dvg²z\u0094ä3â\u0089³\u0019\u008bÙ\u001aIh\"\u0083i,ë.!«÷õ é\u008c\u000e@\u0006·Wõ¤Lõ\\\u001f\u0097\u0018\u001cf\u0081\"µ<B2"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            lll = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               lll[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[Il(-925561660, var24 ^ 159767702)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = lI(-1855871880, var24 ^ 111870092)).length();
            char var2 = 3;
            int var26 = -1;

            label98:
            while (true) {
               int var30 = Il(-925561659, var24 ^ 1791073883);
               String var10001 = var3.substring(++var26, var26 + var2);
               byte var10002 = -1;

               while (true) {
                  label93: {
                     char[] var46 = var10001.toCharArray();
                     int var10004 = var46.length;
                     int var6 = 0;
                     int var49 = var30;
                     var42 = var46;
                     int var36 = var10004;
                     char[] var58;
                     int var10006;
                     if (var10004 <= 1) {
                        var58 = var46;
                        var10004 = var30;
                        var10006 = var6;
                     } else {
                        var49 = var30;
                        var36 = var10004;
                        if (var10004 <= var6) {
                           break label93;
                        }

                        var58 = var46;
                        var10004 = var30;
                        var10006 = var6;
                     }

                     while (true) {
                        var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % Il(-925561653, var24 ^ 1738706331)) {
                           case 0 -> Il(-925561656, var24 ^ 2093264580);
                           case 1 -> Il(-925561655, var24 ^ -249281881);
                           case 2 -> Il(-925561650, var24 ^ 1175197891);
                           case 3 -> Il(-925561649, var24 ^ -751210208);
                           case 4 -> Il(-925561652, var24 ^ 1261854384);
                           case 5 -> Il(-925561651, var24 ^ -1794230118);
                           default -> Il(-925561646, var24 ^ -1116572915);
                        });
                        var6++;
                        if (var49 == 0) {
                           var10006 = var49;
                           var58 = var42;
                           var10004 = var49;
                        } else {
                           if (var36 <= var6) {
                              break;
                           }

                           var58 = var42;
                           var10004 = var49;
                           var10006 = var6;
                        }
                     }
                  }

                  String var51 = new String(var42).intern();
                  switch (var10002) {
                     case 0:
                        var0[var4++] = var51;
                        if ((var26 += var2) >= var5) {
                           I = new IIIlIIIl(IlIIllIII.Ill(var0[Il(-925561648, var24 ^ 45068260)]));
                           lIl = new IIIlIIIl(IlIIllIII.Ill(var0[Il(-925561642, var24 ^ -1376726745)]));
                           IIl = new IIIlIIIl(IlIIllIII.Ill(var0[Il(-925561644, var24 ^ 810389429)]));
                           III = new IIIlIIIl(IlIIllIII.Ill(var0[Il(-925561638, var24 ^ -862279410)]));
                           lII = new IIIlIIIl(IlIIllIII.Ill(var0[Il(-925561640, var24 ^ 342265482)]));
                           l = new IIIlIIIl(IlIIllIII.Ill(var0[Il(-925561639, var24 ^ -1778478554)]));
                           Il = new IIIlIIIl(IlIIllIII.Ill(var0[2]));
                           II = new IIIlIIIl(IlIIllIII.Ill(var0[3]));
                           llI = new IIIlIIIl(IlIIllIII.Ill(var0[Il(-925561630, var24 ^ -2030797930)]));
                           lI = new IIIlIIIl(IlIIllIII.Ill(var0[Il(-925561632, var24 ^ 1404589916)]));
                           Ill = new IIIlIIIl(IlIIllIII.Ill(var0[Il(-925561625, var24 ^ 320886888)]));
                           ll = I();
                           return;
                        }

                        var2 = var3.charAt(var26);
                        break;
                     default:
                        var0[var4++] = var51;
                        if ((var26 += var2) < var5) {
                           var2 = var3.charAt(var26);
                           continue label98;
                        }

                        var5 = (var3 = lI(-1855871879, var24 ^ -1146849096)).length();
                        var2 = 4;
                        var26 = -1;
                  }

                  var30 = Il(-925561654, var24 ^ -1361107609);
                  var10001 = var3.substring(++var26, var26 + var2);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 149;
                  case 1 -> 14;
                  case 2 -> 106;
                  case 3 -> 1;
                  case 4 -> 65;
                  case 5 -> 232;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static IIIlIIIl[] I() {
      int var0 = 552604229;
      IIIlIIIl[] var10000 = new IIIlIIIl[Il(-925561662, var0 ^ 1912526048)];
      var10000[0] = I;
      var10000[1] = lIl;
      var10000[2] = IIl;
      var10000[3] = III;
      var10000[4] = lII;
      var10000[5] = l;
      var10000[Il(-925561661, var0 ^ -1358327357)] = Il;
      var10000[Il(-925561664, var0 ^ 1912167510)] = II;
      var10000[Il(-925561663, var0 ^ 2020741163)] = llI;
      var10000[Il(-925561658, var0 ^ -1974452235)] = lI;
      var10000[Il(-925561657, var0 ^ -2013519734)] = Ill;
      return var10000;
   }

   private IIIlIIIl(IIIlIlIl var3) {
      this.IlI = var3;
   }

   private static int Il(int var0, int var1) {
      int var2 = lll[var0 ^ -925561662] ^ var1 ^ var0;
      var2 ^= 16585;
      var2 += 55566;
      var2 += 8201;
      var2 ^= 30183;
      var2 -= 16969;
      return var2 + 16988;
   }

   public IIIlIlIl l() {
      return this.IlI;
   }

   public static IIIlIIIl II(String var0) {
      return Enum.valueOf(IIIlIIIl.class, var0);
   }
}
