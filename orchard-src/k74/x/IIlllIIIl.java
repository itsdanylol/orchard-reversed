package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIlllIIIl {
   I,
   II,
   Il;

   private final IIIlIlIl l;
   private static final int[] ll;
   private static final Object[] IIl;
   private static final String[] III;
   private static final IIlllIIIl[] lI;

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var23 = 1494911970;
      String[] var15 = new String[2];
      int var10001 = "%译ؽ衑\ue626貹䘠辁䘼跩ظ赡옰跙蘾迉옩谙䘵襑ئ蠙蘨誁꘠辩\ua634輡䘩袉蘴褱옥襩\ua63b觹ث迱\bඏ\udc23ྷ\udc38ে尷টᰪ".length();
      int var16 = 0;
      int var14 = var10001;
      short var18 = 16141;
      String var13 = "%译ؽ衑\ue626貹䘠辁䘼跩ظ赡옰跙蘾迉옩谙䘵襑ئ蠙蘨誁꘠辩\ua634輡䘩袉蘴褱옥襩\ua63b觹ث迱\bඏ\udc23ྷ\udc38ে尷টᰪ";
      int var17 = 0;

      do {
         char var19 = var13.charAt(var17);
         int var21 = 0;
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << '\r') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> '\r') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      III = var15;
      IIl = new Object[var15.length];
      int var9 = 831092823;
      byte[] var7 = "@ëÒ\u0003Y\u0017\u007f\u0097ï¸¹ÇÂ\u0012Ò¡\u0019¸Õ\u0094I\u0017\nÒ\u007fiË*táòÝ`\r<¥B·\t\u0086®0Xv¬^\u0092{".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      ll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         ll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[l(371445198, var23 ^ -1046194736)];
      int var4 = 0;
      String var3;
      int var5 = (var3 = II(-1155129489, var23 ^ -312084342)).length();
      int var2 = l(371445199, var23 ^ -665257913);
      int var25 = -1;

      label89:
      while (true) {
         int var10000 = l(371445196, var23 ^ 1861697419);
         String var28 = var3.substring(++var25, var25 + var2);
         byte var10002 = -1;

         while (true) {
            label84: {
               char[] var43 = var28.toCharArray();
               int var10004 = var43.length;
               int var6 = 0;
               int var46 = var10000;
               var39 = var43;
               var10001 = var10004;
               char[] var55;
               int var10006;
               if (var10004 <= 1) {
                  var55 = var43;
                  var10004 = var10000;
                  var10006 = var6;
               } else {
                  var46 = var10000;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label84;
                  }

                  var55 = var43;
                  var10004 = var10000;
                  var10006 = var6;
               }

               while (true) {
                  var55[var10006] = (char)(var55[var10006] ^ var10004 ^ switch (var6 % l(371445194, var23 ^ -1728622004)) {
                     case 0 -> l(371445195, var23 ^ -933723306);
                     case 1 -> l(371445192, var23 ^ -31047034);
                     case 2 -> l(371445193, var23 ^ -173116265);
                     case 3 -> l(371445190, var23 ^ -515721924);
                     case 4 -> l(371445191, var23 ^ -1007120389);
                     case 5 -> l(371445188, var23 ^ 796909134);
                     default -> l(371445189, var23 ^ 756095999);
                  });
                  var6++;
                  if (var46 == 0) {
                     var10006 = var46;
                     var55 = var39;
                     var10004 = var46;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var55 = var39;
                     var10004 = var46;
                     var10006 = var6;
                  }
               }
            }

            String var48 = new String(var39).intern();
            switch (var10002) {
               case 0:
                  var0[var4++] = var48;
                  if ((var25 += var2) >= var5) {
                     Il = new IIlllIIIl(IlIIllIII.Ill(var0[4]));
                     I = new IIlllIIIl(IlIIllIII.Ill(var0[0]));
                     II = new IIlllIIIl(IlIIllIII.Ill(var0[1]));
                     lI = I();
                     return;
                  }

                  var2 = var3.charAt(var25);
                  break;
               default:
                  var0[var4++] = var48;
                  if ((var25 += var2) < var5) {
                     var2 = var3.charAt(var25);
                     continue label89;
                  }

                  var5 = (var3 = II(-1155129490, var23 ^ 1034485498)).length();
                  var2 = 4;
                  var25 = -1;
            }

            var10000 = l(371445197, var23 ^ 1130190049);
            var28 = var3.substring(++var25, var25 + var2);
            var10002 = 0;
         }
      }
   }

   private static IIlllIIIl[] I() {
      return new IIlllIIIl[]{Il, I, II};
   }

   private IIlllIIIl(IIIlIlIl var3) {
      this.l = var3;
   }

   private static int l(int var0, int var1) {
      int var2 = ll[var0 ^ 371445198] ^ var1 ^ var0;
      var2 += 60213;
      var2 ^= 45238;
      var2 -= 46969;
      var2 ^= 399;
      var2 -= 23588;
      var2 += 31329;
      var2 += 25694;
      var2 -= 33822;
      return var2 + 41996;
   }

   private static String II(int var0, int var1) {
      int var3 = var0 ^ -1155129489;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1340122649;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 189;
            case 1 -> 111;
            case 2 -> 180;
            case 3 -> 165;
            case 4 -> 15;
            case 5 -> 134;
            case 6 -> 127;
            case 7 -> 48;
            case 8 -> 72;
            case 9 -> 2;
            case 10 -> 43;
            case 11 -> 79;
            case 12 -> 55;
            case 13 -> 110;
            case 14 -> 126;
            case 15 -> 152;
            case 16 -> 109;
            case 17 -> 50;
            case 18 -> 170;
            case 19 -> 159;
            case 20 -> 205;
            case 21 -> 187;
            case 22 -> 172;
            case 23 -> 141;
            case 24 -> 76;
            case 25 -> 45;
            case 26 -> 67;
            case 27 -> 199;
            case 28 -> 224;
            case 29 -> 84;
            case 30 -> 162;
            case 31 -> 133;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   @Override
   public String toString() {
      return this.l.llIl();
   }
}
