package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIIlllI {
   II,
   Il,
   lI;
   private static final IIIlllI[] I;
   private final IIIlIlIl l;
   private static final Object[] IIl;
   private static final String[] III;
   private static final int[] ll;

   private static IIIlllI[] I() {
      return new IIIlllI[]{Il, II, lI};
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var18 = -2111256762;
      char[] var9 = ">\u001a".toCharArray();
      String var8 = "灗烀瀿灞烔灾灤瀂炉炇炥瀟灏烿炈炮炡灠炟炂炈炪瀵灶瀖灚烙烙灓灅炷炇瀀瀈烘灩炿灷烃炜炍炷烅炁烵炄烖烲瀠炳烌烀炌火烰灿灢瀞灓災瀴瀴媎娑嫻媘娉媼媾嫀婺婐娮媓媛婲娚婯婭嫜娃婵婗婐嫟媆媣媣";
      short var7 = 7684;
      byte var14 = -1;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            III = var10;
            IIl = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            ll = new int[12];
            byte[] var10002 = "äéh°¢Y`.QC|F\b¢³¢J\u007fWDP®ñ®$OlK\u0099\u009fÌ\u0011VS\u0092%hï÷y\u0000NÃÉ¸ò=\u0087".getBytes("ISO-8859-1");

            int var55;
            do {
               ll[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ -1327111208;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var0 = new String[Il(160217139, var18 ^ -542457577)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = lI(1992314011, var18 ^ -2063860105)).length();
            int var2 = Il(160217138, var18 ^ -1726297726);
            int var20 = -1;

            label99:
            while (true) {
               var22 = Il(160217137, var18 ^ 1778439306);
               String var27 = var3.substring(++var20, var20 + var2);
               byte var39 = -1;

               while (true) {
                  label94: {
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
                           break label94;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % Il(160217142, var18 ^ 1810716673)) {
                           case 0 -> Il(160217141, var18 ^ 520930435);
                           case 1 -> 5;
                           case 2 -> Il(160217140, var18 ^ -1562614739);
                           case 3 -> Il(160217147, var18 ^ 1829780173);
                           case 4 -> Il(160217146, var18 ^ 1403805488);
                           case 5 -> Il(160217145, var18 ^ 990735331);
                           default -> Il(160217144, var18 ^ -2085513958);
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
                           Il = new IIIlllI(IlIIllIII.Ill(var0[5]));
                           II = new IIIlllI(IlIIllIII.Ill(var0[2]));
                           lI = new IIIlllI(IlIIllIII.Ill(var0[3]));
                           I = I();
                           return;
                        }

                        var2 = var3.charAt(var20);
                        break;
                     default:
                        var0[var4++] = var62;
                        if ((var20 += var2) < var5) {
                           var2 = var3.charAt(var20);
                           continue label99;
                        }

                        var5 = (var3 = lI(1992314010, var18 ^ -1368806680)).length();
                        var2 = Il(160217136, var18 ^ 870390593);
                        var20 = -1;
                  }

                  var22 = Il(160217143, var18 ^ 1899822788);
                  var27 = var3.substring(++var20, var20 + var2);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 5) {
                  default -> 101;
                  case 1 -> 158;
                  case 2 -> 11;
                  case 3 -> 55;
                  case 4 -> 234;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static String lI(int var0, int var1) {
      int var3 = var0 ^ 1992314011;
      char[] var4 = III[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -54535980;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 248;
            case 1 -> 228;
            case 2 -> 207;
            case 3 -> 221;
            case 4 -> 183;
            case 5 -> 254;
            case 6 -> 26;
            case 7 -> 192;
            case 8 -> 39;
            case 9 -> 162;
            case 10 -> 103;
            case 11 -> 127;
            case 12 -> 198;
            case 13 -> 35;
            case 14 -> 199;
            case 15 -> 42;
            case 16 -> 180;
            case 17 -> 218;
            case 18 -> 74;
            case 19 -> 152;
            case 20 -> 36;
            case 21 -> 137;
            case 22 -> 242;
            case 23 -> 142;
            case 24 -> 100;
            case 25 -> 211;
            case 26 -> 191;
            case 27 -> 56;
            case 28 -> 238;
            case 29 -> 64;
            case 30 -> 65;
            case 31 -> 187;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private static int Il(int var0, int var1) {
      int var2 = ll[var0 ^ 160217139] ^ var1 ^ var0;
      var2 -= 46379;
      var2 ^= 5717;
      var2 -= 1958;
      var2 -= 16150;
      var2 ^= 47620;
      var2 -= 45565;
      return var2 ^ 59083;
   }

   private IIIlllI(IIIlIlIl var3) {
      this.l = var3;
   }

   public static IIIlllI l(String var0) {
      return Enum.valueOf(IIIlllI.class, var0);
   }

   public IIIlIlIl II() {
      return this.l;
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }
}
