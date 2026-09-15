package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum llIlIIl {
   I,
   II,
   Il,
   lI;

   private static final String[] IIl;
   private final IIIlIlIl l;
   private static final int[] III;
   private static final Object[] IlI;
   private static final llIlIIl[] ll;

   private llIlIIl(IIIlIlIl var3) {
      this.l = var3;
   }

   public static llIlIIl I(String var0) {
      return Enum.valueOf(llIlIIl.class, var0);
   }

   private static llIlIIl[] l() {
      return new llIlIIl[]{lI, II, I, Il};
   }

   private static int II(int var0, int var1) {
      int var2 = III[var0 ^ -1232883667] ^ var1 ^ var0;
      var2 += 11648;
      var2 -= 36741;
      var2 -= 35542;
      var2 += 34941;
      var2 += 16116;
      return var2 - 16468;
   }

   private static String Il(short var0, int var1, char var2) {
      int var3 = var2 ^ 13411;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 21209;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '詂';
         var10 -= 61163;
         var10 ^= 30545;
         var10 -= 43128;
         var10 ^= 42697;
         var10 -= 16904;
         var10 -= 19627;
         var10 ^= 9735;
         var10 += 62858;
         var10 -= 8815;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -2083034215;
      int var11 = 0;
      String[] var9 = new String[2];
      int var10001 = "1㵦༊䴀垼䢠\ue7d5䟯轋䡅霎䈒࿎䝛윻⇆\uef08䡀\u07b2熀࿕侏ｈ㲅\uf70f瀲鿌䡻⼡䉦鼈䛠龼炠쟕䦏⽆煅霌䡲\ue7ce䘛꜠但鼋䜀ﾦ䞠㟈䫏\u0011嘼ㆊ堺섢垺態坕\ue9cd䴿\u218f堈륊䰡榥巜릏〺".length();
      short var12 = 3377;
      int var10 = 0;
      int var8 = var10001;
      String var7 = "1㵦༊䴀垼䢠\ue7d5䟯轋䡅霎䈒࿎䝛윻⇆\uef08䡀\u07b2熀࿕侏ｈ㲅\uf70f瀲鿌䡻⼡䉦鼈䛠龼炠쟕䦏⽆煅霌䡲\ue7ce䘛꜠但鼋䜀ﾦ䞠㟈䫏\u0011嘼ㆊ堺섢垺態坕\ue9cd䴿\u218f堈륊䰡榥巜릏〺";

      do {
         char var13 = var7.charAt(var11);
         var10001 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 90;
               case 1 -> 25;
               case 2 -> 28;
               case 3 -> 174;
               case 4 -> 220;
               case 5 -> 199;
               case 6 -> 51;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 5 | var16 << 11) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 5 | var16 >>> 11) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IIl = var9;
      IlI = new Object[var9.length];
      int var21 = 0;
      int var25 = 0;
      III = new int[14];
      byte[] var35 = "w]. Z\b\u0091\u001aÂk*±Tº\u0016Ë\u0084s\u000eÔï\u0015Maá\u0087k5íL6\u009fü¦þ[\rèb\u001aýxE\u009cþâLp\u0001(BÆ\"\u0094Ù:"
         .getBytes("ISO-8859-1");

      int var57;
      do {
         III[var21] = ((var35[var25] & 255) << 24 | (var35[var25 + 1] & 255) << 16 | (var35[var25 + 2] & 255) << 8 | var35[var25 + 3] & 255) ^ 3381497;
         var21 += 1;
         var57 = var25 + 4;
         var25 += 4;
      } while (var57 < var35.length);

      String[] var0 = new String[II(-1232883667, var17 ^ 1111099435)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il((short)'藙', var17 ^ 2008029986, '㑣')).length();
      int var2 = II(-1232883668, var17 ^ 1869592464);
      int var19 = -1;

      label102:
      while (true) {
         var21 = II(-1232883665, var17 ^ -150205426);
         String var28 = var3.substring(++var19, var19 + var2);
         byte var41 = -1;

         while (true) {
            label97: {
               char[] var59 = var28.toCharArray();
               int var71 = var59.length;
               int var6 = 0;
               var57 = var21;
               var46 = var59;
               var25 = var71;
               char[] var83;
               int var90;
               if (var71 <= 1) {
                  var83 = var59;
                  var71 = var21;
                  var90 = var6;
               } else {
                  var57 = var21;
                  var25 = var71;
                  if (var71 <= var6) {
                     break label97;
                  }

                  var83 = var59;
                  var71 = var21;
                  var90 = var6;
               }

               while (true) {
                  var83[var90] = (char)(var83[var90] ^ var71 ^ switch (var6 % II(-1232883672, var17 ^ -630035476)) {
                     case 0 -> II(-1232883669, var17 ^ -723497401);
                     case 1 -> II(-1232883670, var17 ^ -668265527);
                     case 2 -> II(-1232883675, var17 ^ -910042357);
                     case 3 -> 2;
                     case 4 -> II(-1232883676, var17 ^ 948913282);
                     case 5 -> II(-1232883673, var17 ^ -937467107);
                     default -> II(-1232883674, var17 ^ -880448785);
                  });
                  var6++;
                  if (var57 == 0) {
                     var90 = var57;
                     var83 = var46;
                     var71 = var57;
                  } else {
                     if (var25 <= var6) {
                        break;
                     }

                     var83 = var46;
                     var71 = var57;
                     var90 = var6;
                  }
               }
            }

            String var64 = new String(var46).intern();
            switch (var41) {
               case 0:
                  var0[var4++] = var64;
                  if ((var19 += var2) >= var5) {
                     lI = new llIlIIl(IlIIllIII.Ill(var0[II(-1232883679, var17 ^ 877618242)]));
                     II = new llIlIIl(IlIIllIII.Ill(var0[1]));
                     I = new llIlIIl(IlIIllIII.Ill(var0[5]));
                     Il = new llIlIIl(IlIIllIII.Ill(var0[II(-1232883680, var17 ^ 401866686)]));
                     ll = l();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var64;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label102;
                  }

                  var5 = (var3 = Il((short)'醘', var17 ^ -1519765771, '㑢')).length();
                  var2 = II(-1232883666, var17 ^ 1641885775);
                  var19 = -1;
            }

            var21 = II(-1232883671, var17 ^ -1324079032);
            var28 = var3.substring(++var19, var19 + var2);
            var41 = 0;
         }
      }
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }
}
