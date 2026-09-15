package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum lIIllIll {
   l,
   II,
   Il,
   ll,
   III;
   private static final int[] IIl;
   private static final String[] IlI;
   private final IIIlIlIl I;
   private static final lIIllIll[] lI;
   private static final Object[] Ill;

   private lIIllIll(IIIlIlIl var3) {
      this.I = var3;
   }

   public static lIIllIll I(String var0) {
      return Enum.valueOf(lIIllIll.class, var0);
   }

   private static String Il(int var0, int var1) {
      int var3 = var0 ^ 1095460473;
      char[] var4 = IlI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])Ill[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         Ill[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1913717379;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 217;
            case 1 -> 98;
            case 2 -> 200;
            case 3 -> 236;
            case 4 -> 201;
            case 5 -> 32;
            case 6 -> 136;
            case 7 -> 22;
            case 8 -> 131;
            case 9 -> 192;
            case 10 -> 25;
            case 11 -> 8;
            case 12 -> 150;
            case 13 -> 127;
            case 14 -> 86;
            case 15 -> 162;
            case 16 -> 153;
            case 17 -> 244;
            case 18 -> 9;
            case 19 -> 158;
            case 20 -> 223;
            case 21 -> 59;
            case 22 -> 142;
            case 23 -> 118;
            case 24 -> 143;
            case 25 -> 194;
            case 26 -> 30;
            case 27 -> 64;
            case 28 -> 122;
            case 29 -> 190;
            case 30 -> 82;
            case 31 -> 172;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var17 = -536670417;
      String[] var10000 = new String[2];
      int var11 = 0;
      String[] var9 = var10000;
      short var12 = 1916;
      int var10 = 0;
      int var8 = "JᲬ敏Ὣથṛ諴ᯮઓᶔ\ufaffሌ橆ᶛ骩ᆫ⫽ᣎ㪟၄䫺Ἔ橀᧫쪪᷻\uaaf9ᕎ㪗ᖴ櫸ᕬᩊἋ\ueaa9Ά쫺\u18fe誐ᮔ髲ᨌ穌ቛ\udaabᢋ櫳ხઝᩔ髼ᐌ\uda48ᨫ몬᮫諴ᬾ媟ቤ⫷ᖌ⩌ቛ\ueaa2ᦋ\udaf2Ṿ몛ᵄ㫷\u192c橅ᷛ骢\u0016㮎ࡧ㠉\ud883㧹䣑㣌\ue8b7㴆\uf8d9㉾\uf867㽙碌ㅹᣟ㰜碻ユࣞ㡾\uf863"
         .length();
      String var7 = "JᲬ敏Ὣથṛ諴ᯮઓᶔ\ufaffሌ橆ᶛ骩ᆫ⫽ᣎ㪟၄䫺Ἔ橀᧫쪪᷻\uaaf9ᕎ㪗ᖴ櫸ᕬᩊἋ\ueaa9Ά쫺\u18fe誐ᮔ髲ᨌ穌ቛ\udaabᢋ櫳ხઝᩔ髼ᐌ\uda48ᨫ몬᮫諴ᬾ媟ቤ⫷ᖌ⩌ቛ\ueaa2ᦋ\udaf2Ṿ몛ᵄ㫷\u192c橅ᷛ骢\u0016㮎ࡧ㠉\ud883㧹䣑㣌\ue8b7㴆\uf8d9㉾\uf867㽙碌ㅹᣟ㰜碻ユࣞ㡾\uf863";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 230;
               case 1 -> 84;
               case 2 -> 129;
               case 3 -> 190;
               case 4 -> 225;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IlI = var9;
      Ill = new Object[var9.length];
      IIl = new int[16];
      byte var22 = 0;
      int var10001 = 0;
      byte[] var10002 = "ú(Éßjuu^¬h26\u0083¯Ï\u0089\"\u009cÄyÈÐ¬s]\u000f\u00ad\u009anöÙ\u001b¦W\u0086¦¬*\u0004:gùªHnüÂ½©\tÁ½iâk§\"¡\u0007\r\u0014Z\u0099£"
         .getBytes("ISO-8859-1");

      int var55;
      do {
         IIl[var22] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 726527404;
         var22 += 1;
         var55 = var10001 + 4;
         var10001 += 4;
      } while (var55 < var10002.length);

      String[] var0 = new String[II(492175615, var17 ^ 741419999)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = Il(1095460473, var17 ^ -1104196335)).length();
      int var2 = 4;
      int var19 = -1;

      label100:
      while (true) {
         int var23 = II(492175614, var17 ^ -1133734073);
         String var27 = var3.substring(++var19, var19 + var2);
         byte var39 = -1;

         while (true) {
            label95: {
               char[] var57 = var27.toCharArray();
               int var69 = var57.length;
               int var6 = 0;
               var55 = var23;
               var44 = var57;
               var10001 = var69;
               char[] var81;
               int var88;
               if (var69 <= 1) {
                  var81 = var57;
                  var69 = var23;
                  var88 = var6;
               } else {
                  var55 = var23;
                  var10001 = var69;
                  if (var69 <= var6) {
                     break label95;
                  }

                  var81 = var57;
                  var69 = var23;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % II(492175611, var17 ^ -192600502)) {
                     case 0 -> II(492175610, var17 ^ 516509286);
                     case 1 -> II(492175609, var17 ^ -1961472069);
                     case 2 -> II(492175608, var17 ^ -1192281141);
                     case 3 -> II(492175607, var17 ^ 1884186087);
                     case 4 -> II(492175606, var17 ^ 2050221573);
                     case 5 -> II(492175605, var17 ^ -1310701449);
                     default -> II(492175604, var17 ^ -1192943139);
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
                  if ((var19 += var2) >= var5) {
                     l = new lIIllIll(IlIIllIII.Ill(var0[3]));
                     III = new lIIllIll(IlIIllIII.Ill(var0[5]));
                     II = new lIIllIll(IlIIllIII.Ill(var0[II(492175602, var17 ^ -1074034282)]));
                     ll = new lIIllIll(IlIIllIII.Ill(var0[II(492175601, var17 ^ -189209292)]));
                     Il = new lIIllIll(IlIIllIII.Ill(var0[2]));
                     lI = l();
                     return;
                  }

                  var2 = var3.charAt(var19);
                  break;
               default:
                  var0[var4++] = var62;
                  if ((var19 += var2) < var5) {
                     var2 = var3.charAt(var19);
                     continue label100;
                  }

                  var5 = (var3 = Il(1095460472, var17 ^ -1674226987)).length();
                  var2 = II(492175613, var17 ^ 2054279231);
                  var19 = -1;
            }

            var23 = II(492175612, var17 ^ 1438002577);
            var27 = var3.substring(++var19, var19 + var2);
            var39 = 0;
         }
      }
   }

   private static int II(int var0, int var1) {
      int var2 = IIl[var0 ^ 492175615] ^ var1 ^ var0;
      var2 += 26604;
      var2 += 2588;
      var2 -= 1476;
      var2 += 40554;
      var2 -= 24107;
      var2 -= 59201;
      var2 ^= 63397;
      var2 += 48297;
      var2 -= 59890;
      return var2 ^ 1240;
   }

   @Override
   public String toString() {
      return this.I.llIl();
   }

   private static lIIllIll[] l() {
      return new lIIllIll[]{l, III, II, ll, Il};
   }
}
