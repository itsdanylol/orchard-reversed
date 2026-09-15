package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum IIIIllI {
   I,
   l,
   II,
   Il;

   private static final String[] IlI;
   private static final int[] IIl;
   private static final IIIIllI[] lI;
   private static final Object[] Ill;
   private final IIIlIlIl ll;
   private final Color III;

   private IIIIllI(Color var3, IIIlIlIl var4) {
      this.III = var3;
      this.ll = var4;
   }

   public Color I() {
      return this.III;
   }

   public String l() {
      return this.ll.llIl();
   }

   public static IIIIllI II(String var0) {
      return Enum.valueOf(IIIIllI.class, var0);
   }

   private static int ll(int var0, int var1) {
      int var2 = IIl[var0 ^ -939101658] ^ var1 ^ var0;
      var2 ^= 27372;
      var2 ^= 14050;
      var2 += 50439;
      var2 += 54033;
      var2 += 34867;
      var2 -= 15282;
      return var2 + 53201;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   // $VF: Failed to inline enum fields
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static {
      int var24 = 1233609973;
      char[] var15 = "#\f".toCharArray();
      String var14 = "\ud8c1\ud85e\ud897\ud85c\ud82c\ud8f3\ud8b4\ud87c\ud8e0\ud85d\ud829\ud8fd\ud848\ud809\ud81e\ud8ba\ud857\ud824\ud871\ud863\ud8a5\ud88e\ud8b3\ud8df\ud8ff\ud817\ud824\ud882\ud867\ud818\ud883\ud874\ud889\ud874\ud836逵郣遂邈邡遦逍郗遌郑邿遰";
      short var13 = 14130;
      byte var20 = -1;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         char var18 = 0;
         char var19 = '\u0000';
         if (var20 == 0) {
            IlI = var16;
            Ill = new Object[var16.length];
            int var9 = 609475007;
            byte[] var7 = "áá\u00965m\u0090\u008c\u001a\bcðU°Ç\u009aÙ»AµÔ8 .;NB1é\tHôß\u00ad'Ýé\u0010\u001cÏPK ·È³qÄ\u007f\b\u009c*ñ\u0001±x¥Ìí\u0004\u001eáªøþæ\u0081eÕ\u0099\u0010wªh`\u0018\u0097"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            IIl = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               IIl[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var0 = new String[ll(-939101658, var24 ^ -1144107319)];
            int var4 = 0;
            String var3;
            int var5 = (var3 = III(-1568478367, -530391562, '\ufae3', (short)-481, (byte)-44, (short)21530, (char)'蔾')).length();
            char var2 = 4;
            int var26 = -1;

            label99:
            while (true) {
               int var29 = ll(-939101657, var24 ^ 935285966);
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
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % ll(-939101659, var24 ^ -353877467)) {
                           case 0 -> ll(-939101662, var24 ^ -512856830);
                           case 1 -> ll(-939101661, var24 ^ 1645213314);
                           case 2 -> ll(-939101664, var24 ^ 342747441);
                           case 3 -> ll(-939101663, var24 ^ 1399270467);
                           case 4 -> ll(-939101650, var24 ^ -150470009);
                           case 5 -> ll(-939101649, var24 ^ 1244862347);
                           default -> ll(-939101652, var24 ^ 286224212);
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
                           l = new IIIIllI(
                              new Color(ll(-939101654, var24 ^ 1387524661), ll(-939101653, var24 ^ 1537124186), ll(-939101656, var24 ^ -1765614462)),
                              IlIIllIII.Ill(var0[1])
                           );
                           II = new IIIIllI(
                              new Color(ll(-939101655, var24 ^ -1148901626), ll(-939101642, var24 ^ -1129399021), ll(-939101641, var24 ^ -1019236499)),
                              IlIIllIII.Ill(var0[ll(-939101644, var24 ^ 844087419)])
                           );
                           I = new IIIIllI(Color.WHITE, IlIIllIII.Ill(var0[3]));
                           Il = new IIIIllI(Color.YELLOW, IlIIllIII.Ill(var0[0]));
                           lI = Il();
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

                        var5 = (var3 = III(1524701764, -530391561, '䗶', (short)-29523, 77, (short)24746, 14874)).length();
                        var2 = 4;
                        var26 = -1;
                  }

                  var29 = ll(-939101660, var24 ^ 1380722929);
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
                  default -> 95;
                  case 1 -> 221;
                  case 2 -> 30;
                  case 3 -> 60;
                  case 4 -> 133;
               };
               var21[var22] = (char)(var21[var22] ^ var23 ^ var13);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static String III(int var0, int var1, char var2, short var3, byte var4, short var5, char var6) {
      int var11 = var1 ^ -530391562;
      char[] var10 = IlI[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])Ill[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         Ill[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 39061;
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ switch (var9 % 30) {
            default -> 150;
            case 1 -> 187;
            case 2 -> 176;
            case 3 -> 29;
            case 4 -> 168;
            case 5 -> 212;
            case 6 -> 106;
            case 7 -> 10;
            case 8 -> 249;
            case 9 -> 215;
            case 10 -> 2;
            case 11 -> 10;
            case 12 -> 15;
            case 13 -> 58;
            case 14 -> 153;
            case 15 -> 156;
            case 16 -> 161;
            case 17 -> 46;
            case 18 -> 14;
            case 19 -> 204;
            case 20 -> 213;
            case 21 -> 56;
            case 22 -> 190;
            case 23 -> 135;
            case 24 -> 68;
            case 25 -> 17;
            case 26 -> 239;
            case 27 -> 129;
            case 28 -> 42;
            case 29 -> 169;
         } ^ 56148 ^ var9 ^ var6 ^ var0 ^ var1 ^ var5 ^ var8 ^ var2 ^ var3 ^ var4);
      } while (++var9 < var10.length);

      return new String(var10).intern();
   }

   private static IIIIllI[] Il() {
      return new IIIIllI[]{l, II, I, Il};
   }

   public IIIlIlIl lI() {
      return this.ll;
   }
}
