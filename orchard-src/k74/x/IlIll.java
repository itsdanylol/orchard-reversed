package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IlIll {
   l,
   Il,
   lI,
   ll,
   III;
   private static final IlIll[] I;
   private final IIIlIlIl II;
   private static final String[] IlI;
   private static final int[] IIl;
   private static final Object[] Ill;

   private static String II(char var0, char var1, int var2) {
      int var3 = var0 ^ 15473;
      char[] var4 = IlI[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])Ill[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         Ill[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 29050;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 'ﳣ';
         var10 += 41051;
         var10 += 56185;
         var10 ^= 64382;
         var10 -= 60377;
         var10 += 38096;
         var10 ^= 30514;
         var10 += 46590;
         var10 -= 27373;
         var10 += 6954;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private static int l(int var0, int var1) {
      int var2 = IIl[var0 ^ -1792319786] ^ var1 ^ var0;
      var2 -= 25030;
      var2 ^= 49638;
      var2 -= 35824;
      var2 -= 52041;
      var2 -= 4370;
      var2 -= 64306;
      var2 -= 25634;
      var2 += 8728;
      return var2 ^ 40847;
   }

   private static IlIll[] I() {
      return new IlIll[]{l, Il, ll, III, lI};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = 1131718313;
      short var7 = 15171;
      String var8 = "큟킮턴큵킂톹탨킼탐턶퇌큶탬탇턺타퀿탋큛퀛턻큲킓톝큘킿턐탅킁큹탡퇱탟탁탺톓탭퀂큢큶퀠큹퀱퇰탑탙킕탎탮퇱큣큵퇃탍큉퇚탔큧퀧톞턇퀕택퀑퀧톃큒킣큱턪킔탍턈킮큵턁퀣탟탯퀇턻탎杮晞曣枯村柦林枈枧枥枼晉来枙杞曰";
      byte var14 = -1;
      char[] var9 = "㬑㭓".toCharArray();
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            IlI = var10;
            Ill = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            byte[] var10002 = "Ø¼ªC÷Eú.(Ð\u000eà`^\u0086<u¦\u009dX-\u0017\u0001ä\u0017ÉÜ`Ù\u0013\u0015Nçè'£µ\u000096\u00021âß\nQ\u0099ûÊ\u008a¢TÏso£\u0004\u0092¡·M®O£·è\u00910"
               .getBytes("ISO-8859-1");
            IIl = new int[17];

            int var55;
            do {
               IIl[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 7112056;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var0 = new String[l(-1792319786, var18 ^ 244068852)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = II('㱱', '抝', var18 ^ -1290028189)).length();
            int var2 = l(-1792319785, var18 ^ 561340826);
            int var20 = -1;

            label105:
            while (true) {
               var22 = l(-1792319788, var18 ^ -18836118);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var39 = -1;

               while (true) {
                  label100: {
                     char[] var57 = var27.toCharArray();
                     int var69 = var57.length;
                     int var6 = 0;
                     var55 = var22;
                     var44 = var57;
                     var10001 = var69;
                     char[] var81;
                     int var88;
                     if (var69 <= 1) {
                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     } else {
                        var55 = var22;
                        var10001 = var69;
                        if (var69 <= var6) {
                           break label100;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % l(-1792319789, var18 ^ -81290679)) {
                           case 0 -> l(-1792319792, var18 ^ -1040627719);
                           case 1 -> l(-1792319791, var18 ^ 253988375);
                           case 2 -> l(-1792319778, var18 ^ 836287626);
                           case 3 -> l(-1792319777, var18 ^ 1664131764);
                           case 4 -> l(-1792319780, var18 ^ -738100902);
                           case 5 -> l(-1792319779, var18 ^ -597622183);
                           default -> l(-1792319782, var18 ^ 481966549);
                        });
                        var6++;
                        if (var55 == 0) {
                           var88 = var55;
                           var81 = var44;
                           var69 = var55;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var81 = var44;
                           var69 = var55;
                           var88 = var6;
                        }
                     }
                  }

                  String var62 = new String(var44).intern();
                  switch (var39) {
                     case 0:
                        var0[var4++] = var62;
                        if ((var20 += var2) >= var5) {
                           l = new IlIll(IlIIllIII.Ill(var0[l(-1792319784, var18 ^ -761120240)]));
                           Il = new IlIll(IlIIllIII.Ill(var0[2]));
                           ll = new IlIll(IlIIllIII.Ill(var0[0]));
                           III = new IlIll(IlIIllIII.Ill(var0[5]));
                           lI = new IlIll(IlIIllIII.Ill(var0[l(-1792319802, var18 ^ 1641548424)]));
                           I = I();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var62;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label105;
                        }

                        var5 = (var3 = II('㱰', '肹', var18 ^ -393699423)).length();
                        var2 = l(-1792319787, var18 ^ -1234297450);
                        var20 = -1;
                  }

                  var22 = l(-1792319790, var18 ^ -1550449146);
                  var27 = var3.substring(++var20, var20 + var2);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 228;
                  case 1 -> 18;
                  case 2 -> 216;
                  case 3 -> 201;
                  case 4 -> 47;
                  case 5 -> 113;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   @Override
   public String toString() {
      return this.II.llIl();
   }

   private IlIll(IIIlIlIl var3) {
      this.II = var3;
   }
}
