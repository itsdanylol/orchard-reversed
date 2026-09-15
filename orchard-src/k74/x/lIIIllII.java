package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class lIIIllII {
   private static final double I = 0.01;
   private static final int[] lII = new int[26];
   private static int l;
   private static int II;
   private static int Il;
   private static int lI;
   private static int ll;
   private static int III;
   private static int IIl;
   private static int IlI;
   private static final int Ill = 4;

   public static boolean I(class_310 var0) {
      if (!lIII(var0)) {
         return false;
      } else if (l == var0.field_1724.field_6012) {
         return true;
      } else {
         IIll(var0);
         return false;
      }
   }

   static {
      int var0 = 1841604865;
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "\u0014Æ%z\u00ad\u0001ò\u008bJ\r@w\u0087]\u008aØ\u0094\u0092ÈÐ.YÎiÂÐ\u0080gû\u007fåM\u0015û\u009a°ì\u001a\u008fâ8[\u001bRZúzå\u009b1«j\u0099¸ö´\\\u0015°d`\u00005=\u0007\\Ð\\\u0093=¢)@\u0083\u0091±àP¸Å¹~cxâ\u009d\u0014åip\u0088á\u000bzñÝ\u0006ÂnÑgÚNá"
         .getBytes("ISO-8859-1");

      int var15;
      do {
         lII[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1378544432;
         var10000 += 1;
         var15 = var10001 + 4;
         var10001 += 4;
      } while (var15 < var10002.length);

      IlI = IIIIl(1742483664, var0 ^ 945988911);
      lI = IIIIl(1742483671, var0 ^ 1632403093);
      l = IIIIl(1742483670, var0 ^ 984549641);
      ll = IIIIl(1742483669, var0 ^ -1321036530);
      III = IIIIl(1742483668, var0 ^ -750195661);
      Il = IIIIl(1742483675, var0 ^ -554667216);
      II = IIIIl(1742483674, var0 ^ -1075293439);
      IIl = 0;
   }

   public static boolean II(class_310 var0) {
      IIIIIllII var1 = IIIIIllII.III();
      boolean var2 = var1 != null && var1.II() != null && var1.II().lI() != null && var1.II().lI().IIIll();
      boolean var3 = var1 != null && var1.II() != null && var1.II().lIIlll() != null && var1.II().lIIlll().Il();
      return lIII(var0) && (II != IIIIl(1742483651, -1065125139 ^ 1639181167) && var0.field_1724.field_6012 <= II || var2 || var3);
   }

   public static boolean Il(class_310 var0) {
      return lIII(var0) && ll != IIIIl(1742483650, -1781858873 ^ -1925334091) && var0.field_1724.field_6012 <= ll;
   }

   public static boolean lI(class_310 var0, int var1) {
      if (!lIII(var0)) {
         return false;
      } else if (!IIIII(var0)) {
         return false;
      } else {
         int var2 = var0.field_1724.field_6012;
         if (IlI == var2) {
            return false;
         } else {
            IlI = var2;
            lIIl(var0, var1);
            return true;
         }
      }
   }

   public static boolean ll(class_310 var0) {
      return lIII(var0) && Il != IIIIl(1742483649, -1863778521 ^ 1863519146) && var0.field_1724.field_6012 <= Il;
   }

   public static boolean III(class_310 var0) {
      if (!lIII(var0)) {
         return false;
      } else {
         return !IIIII(var0) ? false : !ll(var0);
      }
   }

   public static boolean IIl(class_310 var0) {
      return IlIl(var0);
   }

   public static void IlI(class_310 var0) {
      if (lIII(var0)) {
         int var1 = var0.field_1724.field_6012 + 1;
         lI = Math.max(lI, var1);
         if (ll == IIIIl(1742483648, -604475306 ^ -380416395) || ll < var1) {
            III = Math.max(III, var1);
         }
      }
   }

   public static void Ill(class_310 var0) {
   }

   public static void lII(class_310 var0) {
      if (lIII(var0)) {
         II = Math.max(II, var0.field_1724.field_6012);
      }
   }

   public static boolean lIl(class_310 var0, int var1) {
      if (!lIII(var0)) {
         return false;
      } else {
         int var2 = var0.field_1724.field_6012;
         if (IlI == var2) {
            return false;
         } else {
            IlI = var2;
            lIIl(var0, var1);
            return true;
         }
      }
   }

   public static boolean llI(class_310 var0) {
      return !lIII(var0) ? false : !ll(var0);
   }

   public static boolean l(class_310 var0) {
      if (!lIII(var0)) {
         return false;
      } else if (!IIIII(var0)) {
         return false;
      } else {
         int var1 = var0.field_1724.field_6012;
         if (IlI != var1 && !ll(var0)) {
            IlI = var1;
            return true;
         } else {
            return false;
         }
      }
   }

   public static boolean lll(class_310 var0) {
      return IIIl(var0);
   }

   private static int IIIIl(int var0, int var1) {
      int var2 = lII[var0 ^ 1742483651] ^ var1 ^ var0;
      var2 ^= 17870;
      var2 += 42947;
      var2 ^= 64146;
      var2 += 30386;
      var2 ^= 56663;
      var2 ^= 53634;
      var2 ^= 29415;
      return var2 ^ 33566;
   }

   public static boolean IIII(class_310 var0, int var1) {
      if (!lIII(var0)) {
         return false;
      } else if (!IIIII(var0)) {
         return false;
      } else {
         int var2 = var0.field_1724.field_6012;
         if (IlI == var2) {
            return false;
         } else {
            IlI = var2;
            lIIl(var0, var1);
            return true;
         }
      }
   }

   private static boolean IIIl(class_310 var0) {
      if (!lIII(var0)) {
         return false;
      } else {
         class_746 var1 = var0.field_1724;
         double var2 = var1.method_18798().field_1352;
         double var4 = var1.method_18798().field_1350;
         double var6 = Math.sqrt(var2 * var2 + var4 * var4);
         if (var6 > 0.01) {
            return false;
         } else {
            return var0.field_1690 == null
               ? true
               : !var0.field_1690.field_1894.method_1434()
                  && !var0.field_1690.field_1881.method_1434()
                  && !var0.field_1690.field_1913.method_1434()
                  && !var0.field_1690.field_1849.method_1434();
         }
      }
   }

   public static boolean IIlI(class_310 var0) {
      if (!lIII(var0)) {
         return false;
      } else {
         int var1 = var0.field_1724.field_6012;
         return IlI != var1;
      }
   }

   public static void IIll(class_310 var0) {
      if (lIII(var0)) {
         class_746 var1 = var0.field_1724;
         lI = Math.max(lI, var1.field_6012 + 1);
         ll = Math.max(ll, var1.field_6012 + 4);
         III = IIIIl(1742483655, 2112803194 ^ 1552592214);
      }
   }

   public static boolean IlII(class_310 var0) {
      if (!lIII(var0) || ll == IIIIl(1742483654, -974804004 ^ 1581961544)) {
         return false;
      } else if (var0.field_1724.field_6012 <= ll) {
         return false;
      } else {
         ll = IIIIl(1742483653, -974804004 ^ -1295802555);
         return true;
      }
   }

   public static boolean IlIl(class_310 var0) {
      if (!lIII(var0)) {
         return false;
      } else if (l == var0.field_1724.field_6012) {
         return true;
      } else {
         IIll(var0);
         return false;
      }
   }

   public static boolean IllI(class_310 var0) {
      return lIII(var0) && l == var0.field_1724.field_6012;
   }

   public static boolean Illl(class_310 var0) {
      int var3 = 2033981368;
      String[] var1 = IIllllIl.IIIIl();
      if (!lIII(var0)) {
         return false;
      } else if (lI == IIIIl(1742483652, var3 ^ 934626826)) {
         return false;
      } else if (var0.field_1724.field_6012 < lI) {
         return false;
      } else if (var0.field_1724.field_6012 >= lI) {
         label39: {
            boolean var2 = III == var0.field_1724.field_6012;
            lI = IIIIl(1742483659, var3 ^ -651085320);
            l = var0.field_1724.field_6012;
            if (var2 && (ll == IIIIl(1742483658, var3 ^ 550513835) || ll < var0.field_1724.field_6012)) {
               ll = IIIIl(1742483657, var3 ^ -191776744);
               if (var1 == null) {
                  break label39;
               }
            }

            ll = Math.max(ll, var0.field_1724.field_6012 + 4);
         }

         III = IIIIl(1742483656, var3 ^ -1775183442);
         return true;
      } else {
         return false;
      }
   }

   private static boolean lIII(class_310 var0) {
      if (var0 != null && var0.field_1724 != null && var0.field_1724.method_5805()) {
         int var1 = System.identityHashCode(var0.field_1724);
         if (IIl != var1) {
            IIl = var1;
            llIl();
         }

         return true;
      } else {
         llIl();
         IIl = 0;
         return false;
      }
   }

   public static void lIIl(class_310 var0, int var1) {
      if (lIII(var0)) {
         int var2 = Math.max(1, var1);
         Il = Math.max(Il, var0.field_1724.field_6012 + var2);
      }
   }

   public static void lIlI(class_310 var0) {
   }

   public static boolean lIll(class_310 var0) {
      if (!lIII(var0)) {
         return false;
      } else if (l == var0.field_1724.field_6012) {
         return true;
      } else {
         IlI(var0);
         return false;
      }
   }

   private static boolean llII(class_310 var0) {
      if (var0 == null || var0.field_1724 == null || var0.field_1690 == null) {
         return false;
      } else {
         return !var0.field_1690.field_1894.method_1434()
               && !var0.field_1690.field_1881.method_1434()
               && !var0.field_1690.field_1913.method_1434()
               && !var0.field_1690.field_1849.method_1434()
               && !var0.field_1690.field_1903.method_1434()
               && !var0.field_1690.field_1832.method_1434()
            ? IIll.llIl(var0)
            : true;
      }
   }

   private static void llIl() {
      int var0 = 627478629;
      IlI = IIIIl(1742483663, var0 ^ 195137531);
      lI = IIIIl(1742483662, var0 ^ 153670180);
      l = IIIIl(1742483661, var0 ^ -863660809);
      ll = IIIIl(1742483660, var0 ^ -258993745);
      III = IIIIl(1742483667, var0 ^ -1748175663);
      Il = IIIIl(1742483666, var0 ^ 61703845);
      II = IIIIl(1742483665, var0 ^ -804014786);
   }

   public static boolean lllI(class_310 var0) {
      return !lIII(var0) ? false : !ll(var0);
   }

   public static void llll(class_310 var0) {
   }

   private lIIIllII() {
   }

   private static boolean IIIII(class_310 var0) {
      if (!lIII(var0)) {
         return false;
      } else if (!llII(var0)) {
         return true;
      } else if (l == var0.field_1724.field_6012) {
         return true;
      } else {
         IIll(var0);
         return false;
      }
   }
}
