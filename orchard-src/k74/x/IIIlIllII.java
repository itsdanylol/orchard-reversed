package k74.x;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class IIIlIllII {
   private static final Color I;
   private static final int[] lll = new int[35];
   public static final double II = 7.0;
   public static final double Il = 8.0;
   private static final Color lI;
   private static final Color ll;
   private static final Color III;
   public static final double IIl = 10.0;
   public static final double IlI = 6.0;
   private static final Color Ill;
   public static final double l = 999.0;
   private static final Color lII;
   public static final double lIl = 5.0;
   private static final Color llI;

   static {
      int var0 = 567375045;
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "uA!DàË\u0081=ÈÄ°´¼\u0088)\u0081\u0091ª\u0012Øýèn+è£KÄÇ°1ìL2VÅ\u0014BÝ\u0001h¾Ú\u0095åT\u000f:ÎHÄãî\u0000µó\u0002¹(¥ìnÑ\u007fïN\u009fà-\u009cÈ\u00adj§}k\u0091',¸5X`Ä\u009c¤xúBwÚã \u000b)\tÙ\"gÃ¬£\u0018d\t«5\u009d`\u009bf´§Q\t\u009f§eIóï\u0002\u0015aÃ\u0087òÞS´Ï\u0011[h\u0084ÓÇ\u0011\u0085º"
         .getBytes("ISO-8859-1");

      int var15;
      do {
         lll[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 143165595;
         var10000 += 1;
         var15 = var10001 + 4;
         var10001 += 4;
      } while (var15 < var10002.length);

      llI = new Color(lIlI(4700265, var0 ^ 1044565844), 0, lIlI(4700264, var0 ^ 290567565), lIlI(4700263, var0 ^ -1697394005));
      I = new Color(lIlI(4700262, var0 ^ -1029482402), lIlI(4700261, var0 ^ -1101045813), lIlI(4700260, var0 ^ 867535471), lIlI(4700259, var0 ^ 413745180));
      lI = new Color(lIlI(4700258, var0 ^ 954282130), lIlI(4700257, var0 ^ -732385852), lIlI(4700256, var0 ^ 982471721), lIlI(4700287, var0 ^ 967777033));
      III = new Color(lIlI(4700286, var0 ^ -75674412), lIlI(4700285, var0 ^ -1136199271), lIlI(4700284, var0 ^ 1204201677), lIlI(4700283, var0 ^ -474356554));
      lII = new Color(lIlI(4700282, var0 ^ 1246100943), lIlI(4700281, var0 ^ -1802084403), lIlI(4700280, var0 ^ 1995091377), lIlI(4700279, var0 ^ 264496061));
      Ill = new Color(lIlI(4700278, var0 ^ 2051185952), lIlI(4700277, var0 ^ -548753204), lIlI(4700276, var0 ^ -1233460246), lIlI(4700275, var0 ^ 1907396069));
      ll = new Color(lIlI(4700274, var0 ^ 1904528594), lIlI(4700273, var0 ^ 971214914), lIlI(4700272, var0 ^ 359036518), lIlI(4700239, var0 ^ -2058007721));
   }

   public static void I(class_332 var0, double var1, double var3, double var5, double var7, double var9) {
      IlIIlllIl.llIl(var0, var1, var3, var5, var7, var9, IlI());
   }

   public static int II(int var0) {
      IIIlIIII var1 = IIll();
      Color var2 = var1 == null ? llI : var1.lIlI();
      return ll(var2, var0);
   }

   public static int Il(Color var0) {
      Color var1 = var0 == null ? Color.WHITE : var0;
      return var1.getRGB();
   }

   public static Color lI() {
      IIIlIIII var0 = IIll();
      return var0 == null ? lI : var0.IIIl();
   }

   public static int ll(Color var0, int var1) {
      Color var2 = var0 == null ? Color.WHITE : var0;
      return IIIlllII.l(var2.getRGB(), var1);
   }

   public static Color III() {
      IIIlIIII var0 = IIll();
      return var0 == null ? lII : var0.llII();
   }

   private static int lIlI(int var0, int var1) {
      int var2 = lll[var0 ^ 4700271] ^ var1 ^ var0;
      var2 += 40518;
      var2 -= 10502;
      var2 -= 654;
      var2 += 56187;
      var2 ^= 41604;
      var2 ^= 52421;
      var2 ^= 53639;
      var2 -= 59318;
      return var2 - 51341;
   }

   public static Color IIl() {
      IIIlIIII var0 = IIll();
      return var0 == null ? I : var0.IIl();
   }

   private IIIlIllII() {
   }

   public static int IlI() {
      return ll(ll, lIlI(4700271, -354696392 ^ 1755976694));
   }

   public static void Ill(class_332 var0, IIIllIIl var1, double var2, double var4, double var6, double var8, boolean var10, double var11) {
      if (var0 != null && !(var6 <= 0.0) && !(var8 <= 0.0)) {
         IIIllIIl var13 = var1 == null ? IIIllIIl.II : var1;
         double var14 = IlllIII.ll(var11);
         if (!(var14 <= 0.0)) {
            double var16 = Math.min(var13.Il, Math.min(var6, var8) * 0.5);
            int var18 = var13.III + (var10 ? lIlI(4700270, -467427174 ^ -203894770) : 0);
            if (var10) {
               var18 = Math.min(lIlI(4700269, -467427174 ^ -606609265), var18);
            }

            IlIIlllIl.llIl(var0, var2, var4, var6, var8, var16, IllllllI.III(Illl(var18), var14));
         }
      }
   }

   public static int lII(int var0) {
      return ll(IlII(), var0);
   }

   public static int lIl() {
      return ll(ll, lIlI(4700268, -1916391182 ^ -964761376));
   }

   public static void llI(class_332 var0, IIIllIIl var1, double var2, double var4, double var6, double var8, boolean var10) {
      Ill(var0, var1, var2, var4, var6, var8, var10, 1.0);
   }

   public static int lll() {
      return ll(ll, lIlI(4700267, 1996936610 ^ 295450358));
   }

   public static Color l() {
      IIIlIIII var0 = IIll();
      return var0 == null ? llI : var0.llIlI();
   }

   public static int IIII(int var0) {
      return ll(III(), var0);
   }

   public static int IIIl() {
      return ll(ll, lIlI(4700266, -1277413570 ^ -1190877054));
   }

   public static Color IIlI() {
      IIIlIIII var0 = IIll();
      return var0 == null ? IIIlllII.I(llI, 0.18) : var0.IIII();
   }

   private static IIIlIIII IIll() {
      IIIIIllII var0 = IIIIIllII.III();
      return var0 != null && var0.II() != null ? var0.II().IlIIll() : null;
   }

   public static Color IlII() {
      IIIlIIII var0 = IIll();
      return var0 == null ? III : var0.lllll();
   }

   public static int IlIl(int var0) {
      return ll(l(), var0);
   }

   public static int IllI() {
      return Illl(lIlI(4700238, 951630844 ^ -1797206350));
   }

   public static int Illl(int var0) {
      return ll(Ill, var0);
   }

   public static int lIII(int var0) {
      return ll(lI(), var0);
   }

   public static int lIIl() {
      return ll(ll, lIlI(4700237, 1651550807 ^ 1381097037));
   }
}
