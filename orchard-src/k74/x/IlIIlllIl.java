package k74.x;

import java.awt.Color;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_5250;

@Environment(EnvType.CLIENT)
public class IlIIlllIl {
   private static final Object[] IIII;
   private static final ThreadLocal<Boolean> I;
   private static double II;
   private static final double Il = 2.0;
   private static final String[] lll;
   private static final String[] lI;
   private static final IlIllIIlI ll;
   private static final long III = 9600L;
   private static final String[] IIl;
   private static final float l = 0.0012F;
   private static final float IlI = 0.035F;
   private static final Method Ill;
   private static final Map<Long, IIIIIIlIl> lII;
   private static final int[] llI;
   private static final ThreadLocal<Deque<llllIl>> lIl;

   public static void I(class_332 var0, double var1) {
      IIlIlIlIl.IlI(var0, var1);
   }

   public static void l(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if ((var11 >>> llllII(868565026, 393019955 ^ -277613521) & llllII(868565027, 393019955 ^ 1814597736)) > 0) {
         IIllIIII var12 = llIIII(var1, var3, var5, var7, var9, 1.0);
         if (var12.II()) {
            IIlIlIlIl.IllII(var0, var12.Il(), var12.III(), var12.lI(), var12.l(), var12.ll(), var12.I(), var11);
         }
      }
   }

   public static void II(class_332 var0, class_327 var1, class_2561 var2, double var3, double var5, int var7) {
      IIIIll(var0, var1, IIIlIIII.lI(var2), var3, var5, var7, false);
   }

   public static void Il(class_332 var0, double var1, double var3, double var5, double var7, int var9) {
      int var10 = (int)Math.floor(Math.min(var1, var5));
      int var11 = (int)Math.floor(Math.min(var3, var7));
      int var12 = (int)Math.ceil(Math.max(var1, var5));
      int var13 = (int)Math.ceil(Math.max(var3, var7));
      if (var12 > var10 && var13 > var11) {
         var0.method_25294(var10, var11, var12, var13, var9);
      }
   }

   public static void lI(class_332 var0, class_327 var1, String var2, double var3, double var5, double var7, int var9) {
      IIII(var0, var1, var2, var3, var5 + (var7 - IlIlIl(var1)) / 2.0, var9);
   }

   public static void ll(class_332 var0, double var1, double var3, double var5, double var7, int var9) {
      llIl(var0, var1, var3, var5, var7, Math.min(Math.abs(var5), Math.abs(var7)) * 0.5, var9);
   }

   public static double III() {
      return IIllII() * 2.15;
   }

   public static int IIl(class_327 var0, String var1) {
      int var2 = IIIIlIlI.IIIl(var1);
      return var2 >= 0 ? var2 : var0.method_27525(IIIlIIII.Ill(var1));
   }

   public static void IlI(class_332 var0, class_327 var1, String var2, double var3, double var5, int var7) {
      if (IIIIlIlI.III()) {
         IIll(var0, var1, var2, var3 - IIl(var1, var2), var5, var7);
      } else {
         class_2561 var8 = IIIlIIII.Ill(var2);
         IIIIll(var0, var1, var8, var3 - llIlll(var1, var8), var5, var7, false);
      }
   }

   public static void Ill(class_332 var0, double var1, double var3, double var5, double var7, double var9) {
      if (var0 != null) {
         double var11 = Math.max(0.0, var9);
         llllIl var13 = llllIl.Il(var1 - var11, var3 - var11, var5 + var11, var7 + var11);
         Deque var14 = lIl.get();
         if (!var14.isEmpty()) {
            var13 = var13.ll((llllIl)var14.peek());
         }

         var14.push(var13);
         IllIl(var0, var13);
      }
   }

   public static void lII(class_332 var0, class_327 var1, class_2561 var2, double var3, double var5, double var7, int var9) {
      II(var0, var1, var2, var3, var5 + (var7 - IlIlIl(var1)) / 2.0, var9);
   }

   public static void lIl(class_332 var0, double var1, double var3, double var5, double var7, double var9, double var11, int var13) {
      if ((var13 >>> llllII(868565024, 859838495 ^ 1952304724) & llllII(868565025, 859838495 ^ 1182884644)) > 0 && !(var11 <= 0.0)) {
         IIllIIII var14 = llIIII(var1, var3, var5, var7, var9, Math.max(0.5, var11));
         if (var14.II()) {
            IIlIlIlIl.IllII(var0, var14.Il(), var14.III(), var14.lI(), var14.l(), var14.ll(), var14.I(), var13);
         }
      }
   }

   public static Boolean llI(Boolean var0) {
      Boolean var1 = I.get();
      if (var0 == null) {
         I.remove();
      } else {
         I.set(var0);
      }

      return var1;
   }

   public static void lll(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, double var12, int var14, double var15) {
      int var20 = 1619584458;
      if (var0 != null
         && !(var5 <= 0.0)
         && !(var7 <= 0.0)
         && !(var12 <= 0.0)
         && var14 > 0
         && !(var15 <= 0.0)
         && (var11 >>> llllII(868565030, var20 ^ -1687911825) & llllII(868565031, var20 ^ 245164845)) > 0) {
         int var17 = var11 >>> llllII(868565028, var20 ^ -293609593) & llllII(868565029, var20 ^ -704753);
         int var18 = (int)Math.round(var17 * IlllIII.ll(var15));
         if (var18 > 0) {
            int var19 = var18 << llllII(868565034, var20 ^ 845457170) | var11 & llllII(868565035, var20 ^ -1360462398);
            IIlIlIlIl.IlIll(var0, var1, var3, var5, var7, var9, var12, var19);
         }
      }
   }

   public static void IIII(class_332 var0, class_327 var1, String var2, double var3, double var5, int var7) {
      if (!IIIIlIlI.II(var0, var2, var3, var5, var7, true, IlllI(var7, var2))) {
         IIIIll(var0, var1, IIIlIIII.Ill(var2), var3, var5, var7, true);
      }
   }

   public static boolean IIIl(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, int var10) {
      return IIlIlIlIl.IIIII(var0, var1, var2, var4, var6, var8, var10);
   }

   public static void IIlI(class_332 var0) {
      IlllII(var0);
   }

   public static void IIll(class_332 var0, class_327 var1, String var2, double var3, double var5, int var7) {
      if (!IIIIlIlI.II(var0, var2, var3, var5, var7, false, IlllI(var7, var2))) {
         IIIIll(var0, var1, IIIlIIII.Ill(var2), var3, var5, var7, false);
      }
   }

   public static void IlII(class_332 var0, double var1, double var3, double var5, double var7, int var9, int var10) {
      Il(var0, var1, var3, var1 + var5, var3 + var7, var10);
      Il(var0, var1 + 1.0, var3 + 1.0, var1 + var5 - 1.0, var3 + var7 - 1.0, var9);
   }

   public static double IlIl() {
      return II;
   }

   public static IlIllIIlI IllI() {
      return ll;
   }

   public static void Illl(Boolean var0, Runnable var1) {
      Boolean var2 = llI(var0);

      try {
         if (var1 != null) {
            var1.run();
         }
      } finally {
         lIllIl(var2);
      }
   }

   public static void lIII(class_332 var0, double var1, double var3, double var5, int var7) {
      Il(var0, var1, var5, var3, var5 + 1.0, var7);
   }

   public static void lIIl(
      class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, int var10, int var11, int var12, int var13, int var14, int var15
   ) {
      lIllll(var0, var1, var2, var4, var6, var8, var10, var11, var12, var13, var14, var15, -1);
   }

   public static void lIlI(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8) {
      lIllI(var0, var1, var2, var4, var6, var8, -1);
   }

   public static void lIll(class_332 var0, class_327 var1, String var2, double var3, double var5, double var7, double var9, int var11) {
      llIIlI(var0, var1, var2, var3 + var7 / 2.0, var5 + var9 / 2.0, var11);
   }

   public static void llII(class_332 var0, double var1, double var3, double var5, double var7, int var9, int var10) {
      lIllII(var0, var1, var3, var5, var7, ll.I(), var9, var10);
   }

   public static void llIl(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if ((var11 >>> llllII(868565032, 773909001 ^ -522888914) & llllII(868565033, 773909001 ^ -2099090956)) > 0) {
         IIllIIII var12 = llIIII(var1, var3, var5, var7, var9, 0.0);
         if (var12.II()) {
            IIlIlIlIl.l(var0, var12.Il(), var12.III(), var12.lI(), var12.l(), var12.ll(), var11);
         }
      }
   }

   static int lllI(int var0, int var1, double var2) {
      int var10 = 1567421960;
      double var4 = Math.max(0.0, Math.min(1.0, var2));
      int var6 = (int)Math.round(
         (var0 >>> llllII(868565038, var10 ^ -1011250460) & llllII(868565039, var10 ^ -1024375900))
            + (
                  (var1 >>> llllII(868565036, var10 ^ 800952763) & llllII(868565037, var10 ^ -653380118))
                     - (var0 >>> llllII(868565042, var10 ^ 902545139) & llllII(868565043, var10 ^ -2100515087))
               )
               * var4
      );
      int var7 = (int)Math.round(
         (var0 >>> llllII(868565040, var10 ^ -1497298341) & llllII(868565041, var10 ^ 246495))
            + (
                  (var1 >>> llllII(868565046, var10 ^ -333938061) & llllII(868565047, var10 ^ -1772829104))
                     - (var0 >>> llllII(868565044, var10 ^ -1482513942) & llllII(868565045, var10 ^ 757503043))
               )
               * var4
      );
      int var8 = (int)Math.round(
         (var0 >>> llllII(868565050, var10 ^ -2019809453) & llllII(868565051, var10 ^ 138669930))
            + (
                  (var1 >>> llllII(868565048, var10 ^ -1554989070) & llllII(868565049, var10 ^ -2081895558))
                     - (var0 >>> llllII(868565054, var10 ^ -1622188834) & llllII(868565055, var10 ^ 44649150))
               )
               * var4
      );
      int var9 = (int)Math.round(
         (var0 & llllII(868565052, var10 ^ 1562558368))
            + ((var1 & llllII(868565053, var10 ^ 1123692682)) - (var0 & llllII(868564994, var10 ^ 1321454214))) * var4
      );
      return var6 << llllII(868564995, var10 ^ 573124104) | var7 << llllII(868564992, var10 ^ 1024888596) | var8 << llllII(868564993, var10 ^ -28824791) | var9;
   }

   public static void llll(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if (var0 != null
         && !(var5 <= 0.0)
         && !(var7 <= 0.0)
         && (var11 >>> llllII(868564998, 68726042 ^ -601927179) & llllII(868564999, 68726042 ^ -666991714)) > 0) {
         IIlIlIlIl.Ill(var0, var1, var3, var5, var7, var9, var11);
      }
   }

   public static void IIIII(class_332 var0, double var1, double var3, double var5, double var7) {
      IllIII(var0, var1, var3, var5, var7);
   }

   public static void IIIIl(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if ((var11 >>> llllII(868564996, -1476477027 ^ -1863888641) & llllII(868564997, -1476477027 ^ 2061705930)) > 0) {
         IIllIIII var12 = llIIII(var1, var3, var5, var7, var9, 0.0);
         if (var12.II()) {
            if (var12.ll() <= 0.0) {
               IIlII(var0, var12.Il(), var12.III(), var12.lI(), var12.l(), var11);
            } else {
               IIlIlIlIl.l(var0, var12.Il(), var12.III(), var12.lI(), var12.l(), var12.ll(), var11);
            }
         }
      }
   }

   public static void IIIlI(class_332 var0, class_327 var1, class_2561 var2, double var3, double var5, int var7) {
      IIIIll(var0, var1, IIIlIIII.lI(var2), var3, var5, var7, true);
   }

   private static Method IIIll() {
      for (Method var3 : class_332.class.getMethods()) {
         Class[] var4 = var3.getParameterTypes();
         if (var4.length == llllII(868565002, 523950704 ^ 793226984)
            && var4[0] == class_327.class
            && var4[1] == class_2561.class
            && var4[2] == int.class
            && var4[3] == int.class
            && var4[4] == int.class
            && var4[5] == boolean.class) {
            return var3;
         }
      }

      return null;
   }

   public static void IIlII(class_332 var0, double var1, double var3, double var5, double var7, int var9) {
      Il(var0, var1, var3, var1 + var5, var3 + var7, var9);
   }

   public static String IIlIl(String var0, String var1) {
      String var2 = var0 == null ? "" : var0;
      String var3 = var1 == null ? "" : var1.toUpperCase(Locale.ROOT);
      if (var3.contains(IlIIllIII.lI(IIIlII(llllII(868565003, -1261828823 ^ -2062863116), llllII(868565000, -1261828823 ^ -170416995))))) {
         return var2.toUpperCase(Locale.ROOT);
      } else {
         return var3.contains(IlIIllIII.lI(IIIlII(llllII(868565001, -1261828823 ^ 173452061), llllII(868565006, -1261828823 ^ -55467900))))
            ? var2.toLowerCase(Locale.ROOT)
            : var2;
      }
   }

   public static void IIllI(class_332 var0, double var1, double var3) {
      IIlIlIlIl.IIllI(var0, var1, var3);
   }

   public static void IIlll(class_332 var0, double var1, double var3, double var5, double var7, double var9) {
      lIllII(var0, var1, var3, var5, var7, var9, llllII(868565007, -1017946355 ^ 1100032977), llllII(868565004, -1017946355 ^ 194319116));
   }

   public static void IlIII(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, double var10, int var12) {
      IIlIlIlIl.lIlII(var0, var1, var2, var4, var6, var8, var10, var12);
   }

   public static double IlIIl(class_327 var0) {
      return Math.ceil(IlIlIl(var0) + 1.0);
   }

   public static void IlIlI(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12, int var13, int var14) {
      IIllIIII var15 = llIIII(var1, var3, var5, var7, var9, 0.0);
      if (var15.II()) {
         int var16 = var11;
         int var17 = var12;
         int var18 = var13;
         int var19 = var14;
         if (var5 < 0.0) {
            var16 = var12;
            var17 = var11;
            var19 = var13;
            var18 = var14;
         }

         if (var7 < 0.0) {
            int var20 = var16;
            var16 = var19;
            var19 = var20;
            var20 = var17;
            var17 = var18;
            var18 = var20;
         }

         IIlIlIlIl.llIl(var0, var15.Il(), var15.III(), var15.lI(), var15.l(), var15.ll(), var16, var17, var18, var19);
      }
   }

   public static void IlIll(class_332 var0, double var1, double var3, double var5, double var7, double var9) {
      double var11 = var7 * lIIII.ll(var9, 0.0, 1.0);
      IllIII(var0, var1, var3, var1 + var5, var3 + var11);
   }

   private static long IllII(double var0, double var2) {
      long var4 = Math.round(var0 * 4.0);
      long var6 = Math.round(var2 * 4.0);
      return var4 << llllII(868565005, 334764252 ^ -987379294) ^ var6 & 4294967295L;
   }

   private static void IllIl(class_332 var0, llllIl var1) {
      int var2 = (int)Math.floor(var1.II());
      int var3 = (int)Math.floor(var1.lI());
      int var4 = (int)Math.ceil(var1.l());
      int var5 = (int)Math.ceil(var1.I());
      var0.method_44379(var2, var3, Math.max(var2, var4), Math.max(var3, var5));
   }

   public static boolean IlllI(int var0, String var1) {
      int var2 = var0 >>> llllII(868565010, 1117751003 ^ -336659003) & llllII(868565011, 1117751003 ^ -509709782);
      if (var2 > 0 && (var0 & llllII(868565008, 1117751003 ^ 74107229)) != 0 && var1 != null && !var1.isEmpty()) {
         Boolean var3 = I.get();
         return var3 != null ? var3 && IIIlIIII.lllI() : false;
      } else {
         return false;
      }
   }

   private static int Illll(float var0) {
      int var11 = -1711530989;
      String[] var10000 = IIllllIl.IIIIl();
      IIIlIIII var2 = null;
      String[] var1 = var10000;
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null && var3.II() != null) {
         var2 = var3.II().IIlIIll();
      }

      Color var6;
      Color var7;
      float var8;
      label29: {
         Color var4 = var2 == null
            ? new Color(llllII(868565009, var11 ^ 2107014571), llllII(868565014, var11 ^ -449545901), llllII(868565015, var11 ^ 1523012742))
            : var2.lIlll();
         Color var5 = var2 == null
            ? new Color(llllII(868565012, var11 ^ 1753927952), llllII(868565013, var11 ^ -521416620), llllII(868565018, var11 ^ 883881392))
            : var2.lIIII();
         if (var0 < 0.5F) {
            var6 = var4;
            var7 = var5;
            var8 = var0 * 2.0F;
            if (var1 == null) {
               break label29;
            }
         }

         var6 = var5;
         var7 = var4;
         var8 = (var0 - 0.5F) * 2.0F;
      }

      double var9 = 0.5 - Math.cos(var8 * Math.PI) * 0.5;
      return llIIll(var6, var7, var9);
   }

   public static void lIIII(class_332 var0, class_327 var1, class_2561 var2, double var3, double var5, int var7) {
      class_2561 var8 = IIIlIIII.lI(var2);
      IIIIll(var0, var1, var8, var3 - llIlll(var1, var8), var5, var7, true);
   }

   public static int lIIIl(int var0, int var1, int var2, int var3) {
      long var4 = System.currentTimeMillis();
      float var6 = (float)(var4 % 9600L) / 9600.0F;
      float var7 = (var1 + var2) * 0.0012F;
      float var8 = (var6 + var3 * 0.035F + var7) % 1.0F;
      if (var8 < 0.0F) {
         var8++;
      }

      return var0 << llllII(868565019, -2079148755 ^ -1342939584) | Illll(var8) & llllII(868565016, -2079148755 ^ 396220849);
   }

   public static void lIIlI(class_332 var0, double var1, double var3, double var5, double var7, int var9) {
      lIIIIl(var0, var1, var3, var5, var7, 1.0, var9);
   }

   public static void lIIll(class_332 var0, class_327 var1, String var2, double var3, double var5, double var7, double var9, int var11) {
      IlIlII(var0, var1, var2, var3 + var7 / 2.0, var5 + var9 / 2.0, var11);
   }

   public static void lIlII(class_332 var0, class_327 var1, class_2561 var2, double var3, double var5, int var7) {
      class_2561 var8 = IIIlIIII.lI(var2);
      IIIIll(var0, var1, var8, var3 - llIlll(var1, var8) / 2.0, var5 - IlIlIl(var1) / 2.0, var7, false);
   }

   public static void lIlIl(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      llIl(var0, var1, var3, var5, var7, var9, var11);
   }

   public static void lIllI(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, int var10) {
      if ((var10 >>> llllII(868565017, -1533338004 ^ 731602042) & llllII(868565022, -1533338004 ^ 278023978)) > 0) {
         IIlIlIlIl.IllI(var0, var1, (int)Math.round(var2), (int)Math.round(var4), (int)Math.round(var6), (int)Math.round(var8), var10);
      }
   }

   public static void lIlll(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, int var10, int var11, int var12) {
      if ((var12 >>> llllII(868565023, 439998243 ^ -954751682) & llllII(868565020, 439998243 ^ 1558011078)) > 0 && var10 > 0 && var11 > 0) {
         IIlIlIlIl.IlIIl(var0, var1, (int)Math.round(var2), (int)Math.round(var4), (int)Math.round(var6), (int)Math.round(var8), var10, var11, var12);
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 2021003839;
      int var16 = 0;
      short var18 = 32552;
      String[] var10002 = new String[2];
      int var17 = 0;
      String[] var15 = var10002;
      int var14 = "\u000e\uf3f0뮠\uf071ﮀ\uf67f嬓\uf5f0묁\uf4dd宍\uf0c8\udbb0\uf6a9箒\u0011곹黀겠绨굾鹥꫱鹢ꢴ绸ꣁ廚ꭠ\udee7겞빼귱".length();
      String var13 = "\u000e\uf3f0뮠\uf071ﮀ\uf67f嬓\uf5f0묁\uf4dd宍\uf0c8\udbb0\uf6a9箒\u0011곹黀겠绨굾鹥꫱鹢ꢴ绸ꣁ廚ꭠ\udee7겞빼귱";

      do {
         char var19 = var13.charAt(var17);
         char[] var20 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 5) {
               default -> 214;
               case 1 -> 126;
               case 2 -> 215;
               case 3 -> 83;
               case 4 -> 65;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << 13) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> 13) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      lll = var15;
      IIII = new Object[var15.length];
      int var9 = 1658564309;
      byte[] var7 = "©\u0001äl*Z\u0081\u008f\u0016\u0002Ä9$ÞhíªóuÑ?\u000b\u001d7ßè(;ÎbÉ\u0017\u0003óP \u009e~bÔ\u009fê¡]ýÝ\u0090#ÏÊn\u0090Î\u0082¦t#ÎuÍÕ}Ð89¸Z\u009b\u008e¿K=ª²î9\fp'\u0011àkf\u0017\u009a'#\u0098«ÑE\u008c!Uq\u0089\u008bïÃÃ\u00040\n®¯#[`\u008f\u009b.¼\u0093<¸J\u000eÚ¯~QQZcN\u0089ÕHB°/{.ZÊQ1ekFò;Ï\u0082\u0089\u0018î»\u008d9=tf\u0006ý4\u008c\u0002\u008e¥abf>`Þ\u0012i\u0010\u0001N%ï\u0083\u008d\u0087\u0019gL\u0083\u000bÃF^þØ6ú\u0087ÎÃùøni^ò\u001eç\u0015\u0016ë5aµus\t-×wx\u0092$[u iß\u0001(\bßÊüMúNzùù$Ã\u0091\u0016sÞ\u001fP]å\u0016B¯\u008c1`P\u0017û\u0098\u000e\u001eJ²µ\u001eÅ\r\u0097±`\u0012ÀÍ\nj>]\u00adH99)\u009d5Ç¦ÿ\u0087\u008d\tüpD2\u000b8Uue]f\u0001n\u0083Þg~ùklö?\u009b\u001dbý[pþ\u0083?W\u007f\t||Â¤]\u0082ÐÇr\u000e¤î\u001cK \u0013úM-DL\u00811¯\u009b«¹`\u0003K9g]a\u0082ó©1y:mÝeýB7ë\\\u0016¿hcp4¹X\u0004¹\u007f<©©§öUÝ\u0094\u0082d\u0002xºh\u0096Ñb\u0014Ù»\u009c¿\u0094q\u008eF\u0018rÔ]\u0007\u0017®¶[k\u009b\u001bÔ®Ã¯ ÂU\u0007\u009bM6üý\u0016çJ¦\u0098å»¾%>QG#)v\u008cp¨¥\u0081zÐÚÊg¨Pìä\u000b\u009a\u0003\u0095ÕÍ\u001c=£\u0013cLD¨÷6\t´\u0002\u007f!;Y\u0099ïÚE\u000e£[7\u007fn#\u009bíì\u0000CçG\u008f~x\u0016\u0018ç\u009b×¿\u0004¢j,6©\u0013íy$G\u0097é\u001b\u0082Cð·±\u001d²ÜÎ\u0016ÝDò\u001e}\u0083³\u009cÚ¹{Ä\u001d ë²\u001a+ã¨\u001acª~]Ú(#ügñ\u0017\u0095w\u0084D¿ô©pÙ\u0093TKú~)ô\f¦|Ý\u00ad\u0011ÇÂôw\u0088\u0015\u0005Ó«\u0007 â&uÒ\u000fM1x\u0092+ bjxºí8Ë\u001e\u0082Ö\u0007Ø\u0083åÝð'þÛ\u0002|*uàof:Ñ\u0089Á;þ\u0092I\u009a0o§ë\u0089ç\u00ad\u0019Åp4\u0090\r\u00066niÝßÂ¬»\u001fþ´Ðô½y\u008fCy\u009b\u0086\\\u0014§pcP\u001ft<¹¾²ZýM\u0015ü+åtÅ\u009eÂ\u0012í\u009cè\u0005ê©\f8v\u0086|\u0094¼¶ÔÑ\u0093õ¼dWî$kà\r¦\u0006±\u008e\u0094ÖGÂ\u0012E\u0015\u008f\u000e\u0098\u0002\u00033\u0096ºï\u008f\u0084\u0089\u009b\u0087\u000eÕ\u008d¶\u0092.D\u0014ö£´+\t\u0087\u0015v`³v)è@O\u0089H\u00adýK\u0012H\u0092\u000f6ÿ\u0084¢9ú\u0094\u0001{H\fDñ\u0099\u0087\u0094Ê@J1\t'\u008ar$\u0090V¶qÐ\u0003ZGrz¾ÛFÄ\u0004¶9\u009elê\bà\u0081§ªG\u0089O*wMÏJz¨\u001fó\u001d\u008fý¦û3\u001c\u0096|~&4æ\fÀ]W\u0088ÅË\u0099zÎ\u00adGòY¥\u0003\u0099 ü)ÞZÅ\u001cñç\u001f\u0013ÕÍt¶%\u0094ô\u000f[:\u0011\u0007\u001d%ð¶3ÓV[\u0017Þå\u008e]2ÎÂ\u0097\u0098É¾\rt\u009f\u009b×Ö×\u00adÓf¾àxL%\b\u0081Q$³1¯:o\u001b\u0088+T°à\u0014x\\\u008ehi\u008d¸£\u0091P\u0085c9¹@Ë÷OÜ\u009a\u007fµ\u008bÎJVä\u0002HÕHÓu.¡ÇG=l×öÊ2ø\u001c\u00ad\r\u00189$\f¸®¢\fÛ\u0089Å\u009a4~ÈëÑ\u0082t\u00141Ì@[\u0086ÙNp£&\u001f\u00837Â\u0093\u001drë2À\r·\u0081K \u0000\u000e'ì¼ \u0083rÉ¸ºé\u001ctD-j@ÌÐ-PÃHáùÚ±ªca/\u0088\u000f-Î\u0097'%Ò\u008e\u00185Ël{q©Âb¯\u0000\u001fU?ðV\u008b\u008bw\u0007\u0007´\u0090Nk¥\u0012»¡\b/\u0085ð\"\u0080\f\u0088+x\u008a¥{\f8\u0081)È\\ÂUºå¶«eÀ\nrz«\u008d/u\u0090|^\u00adÈy£äÍº\u0096\u000b\u0002ÿ\u0017ûLïPN¢Ñ|9\u001b}¤º¶Ù1£»Lß|\f\u0016½Î\u001ePg\u008a\u000fc;\u0083ô$\u0004R\tê\u0099µC'ì\u0015\u0001i¶g6`\u0017\u0094=Ý¹´\u0097LÁ\b3\rNj×à\u0003\u008f\u0014Ü)oÁz\u001f\n\u0084\u009dOÜÙ¨ÆNk\u0088\u0019JfÒ=¿\u009d\u0010Eú\u0096°É\u009c\u000b+\u0091jDl\u0014\u0013Î°ÄW\u0084XsÜúc\u0012ï{ýO¤¬\u0005ÀÙÞöVR}\u0014/ú²Â\u0005n\u00804\u0010pjA¡L\u0017\u0083\u0006ã\u008e\f¼ÝG¨ó\u0082@Ç1V88\u0089^àAû¤Ñf\u0003Çñ5\u008c±\u0017°®®ëÛ¸\u0096\u0084\u0087«\u009b=\u0014\u000f\n/N\u0097àÓÞv\u0095Ð^PP¤\u0089\u0090bbÂÛ³¬#[Ôö)Ê/CQç\u001eh\u0084UÓ©|\u0093L¤°\u009e²èÈÃ\u008eC,\u0014\u0080½XÆ\u0004\u001c\u0093T\u00ad»jô®\u0089 C\u0001b\u0092òúðs¡\u0082º7û\u0088»\u0086å\u008aÞB¾\u0090öÑ\u009e#\u0095Rï¸¨Ëk1'Q6 #îo¿\u0017\u0002â\u0019¼$î;\u0091Ðc|I¦Y\u0096YÉ @¨pÒE\u0087 Á^$[\u008f\u008eÇÐæ\u00039H\u0018Í³7\u0087/2/$7äÆ\u0080²e\u0093é¸u\\ g7\u0094+N±ÈØ\u008dW\u0084Sª\u008fùÇ\u0015\u008a\u0089\u0092Ä~\u009bsaÃFb\tÏPaRVOY7\u0089tÑ\u001cNZ9´Í~Â\u0000\u0088M\u0095æ(ä^©\u009c\u0080:ú\u0092:\"Ê\u00160\t\u0080ª.ä(Í\b×f\u001c\u009f[Ò\u00989?UA²\u00846Ä(V\u0093\u0094"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      llI = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         llI[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[5];
      int var3 = 0;
      String var2;
      int var4 = (var2 = llllIl(-811295574, var23 ^ -1520235931)).length();
      int var1 = 4;
      int var25 = -1;

      label98:
      while (true) {
         int var28 = llllII(868565107, var23 ^ 1533519088);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var36 = -1;

         while (true) {
            label93: {
               char[] var45 = var10001.toCharArray();
               int var10004 = var45.length;
               int var6 = 0;
               int var48 = var28;
               var41 = var45;
               int var34 = var10004;
               char[] var57;
               int var10006;
               if (var10004 <= 1) {
                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var48 = var28;
                  var34 = var10004;
                  if (var10004 <= var6) {
                     break label93;
                  }

                  var57 = var45;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % llllII(868565110, var23 ^ 1709715785)) {
                     case 0 -> llllII(868565111, var23 ^ -1295861367);
                     case 1 -> llllII(868565108, var23 ^ 706885998);
                     case 2 -> llllII(868565109, var23 ^ 1946714674);
                     case 3 -> llllII(868565114, var23 ^ -2141685260);
                     case 4 -> llllII(868565115, var23 ^ 1152673253);
                     case 5 -> llllII(868565112, var23 ^ 1801382666);
                     default -> llllII(868565113, var23 ^ 1071016001);
                  });
                  var6++;
                  if (var48 == 0) {
                     var10006 = var48;
                     var57 = var41;
                     var10004 = var48;
                  } else {
                     if (var34 <= var6) {
                        break;
                     }

                     var57 = var41;
                     var10004 = var48;
                     var10006 = var6;
                  }
               }
            }

            String var50 = new String(var41).intern();
            switch (var36) {
               case 0:
                  var5[var3++] = var50;
                  if ((var25 += var1) >= var4) {
                     lI = var5;
                     IIl = new String[5];
                     II = 1.0;
                     Ill = IIIll();
                     lIl = ThreadLocal.withInitial(ArrayDeque::new);
                     I = new ThreadLocal<>();
                     lII = new HashMap<>();
                     ll = new IlIllIIlI(14.0, 4.0, 6.0);
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var50;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label98;
                  }

                  var4 = (var2 = llllIl(-811295573, var23 ^ -1911083425)).length();
                  var1 = llllII(868565104, var23 ^ 891429118);
                  var25 = -1;
            }

            var28 = llllII(868565105, var23 ^ -752603778);
            var10001 = var2.substring(++var25, var25 + var1);
            var36 = 0;
         }
      }
   }

   public static void llIII(class_332 var0, double var1, double var3, boolean var5, int var6, int var7) {
      double var8 = IIllII();
      double var10 = III();
      double var12 = lIlllI(lIlIIl(var1, var3, var5));
      double var14 = Math.max(4.0, var8 - 2.6);
      int var16 = IIIlllII.l(
         var6,
         Math.max(llllII(868565021, 1294273128 ^ 40938150), var6 >>> llllII(868565090, 1294273128 ^ 50271695) & llllII(868565091, 1294273128 ^ -1386607812))
      );
      int var17 = lllI(var16, var6, var12);
      llIl(var0, var1, var3, var10, var8, var8 * 0.5, var17);
      double var18 = 1.3;
      double var20 = Math.max(0.0, var10 - var14 - var18 * 2.0);
      double var22 = var1 + var18 + var20 * var12;
      lllIll(var0, var22 + var14 * 0.5, var3 + var8 * 0.5, var14 * 0.5, IIIlllII.l(var7, llllII(868565088, 1294273128 ^ -785353742)));
   }

   public static String llIIl(class_327 var0, String var1, double var2) {
      String[] var4 = IIllllIl.IIIIl();
      if (var0 != null && !(var2 <= 0.0)) {
         String var5 = var1 == null ? "" : var1;
         if (IIl(var0, var5) <= var2) {
            return var5;
         } else {
            String var6 = IlIIllIII.lI(IIIlII(llllII(868565089, -1470414845 ^ -1528222752), llllII(868565094, -1470414845 ^ -1066523595)));
            int var7 = IIl(var0, var6);
            if (var7 > var2) {
               return "";
            } else {
               String var8 = var0.method_27523(var5, Math.max(0, (int)Math.floor(var2 - var7))).trim();

               while (!var8.isEmpty() && IIl(var0, var8 + var6) > var2) {
                  var8 = var8.substring(0, var8.length() - 1).trim();
                  if (var4 != null) {
                     break;
                  }
               }

               return var8.isEmpty() ? var6 : var8 + var6;
            }
         }
      } else {
         return "";
      }
   }

   public static void llIlI(class_332 var0, double var1, double var3, double var5, double var7, int var9, int var10) {
      double var11 = Math.min(var1, var5);
      double var13 = Math.max(var1, var5);
      double var15 = Math.min(var3, var7);
      double var17 = Math.max(var3, var7);
      if (!(var13 <= var11) && !(var17 <= var15)) {
         IIlIlIlIl.llll(var0, var11, var15, var13 - var11, var17 - var15, 0.0, var9, var10);
      }
   }

   public static void llIll(class_332 var0, class_327 var1, String var2, double var3, double var5, double var7, double var9, double var11, int var13) {
      double var14 = Math.max(0.0, var7 - var11 * 2.0);
      lIIll(var0, var1, llIIl(var1, var2, var14), var3 + var11, var5, var14, var9, var13);
   }

   public static void lllII(class_332 var0, double var1, double var3, double var5, double var7, int var9, int var10, boolean var11) {
      double var12 = 12.0;
      l(var0, var1, var3, var5, var7, var12, var10);
      llIl(var0, var1 + 1.0, var3 + 1.0, var5 - 2.0, var7 - 2.0, Math.max(0.0, var12 - 1.0), var9);
      lllIlI(
         var0,
         var1 + 1.0,
         var3 + 1.0,
         var5 - 2.0,
         Math.max(12.0, var7 * 0.5),
         Math.max(0.0, var12 - 1.0),
         var11 ? llllII(868565095, -1469958004 ^ 635092379) : llllII(868565092, -1469958004 ^ 2071314031),
         llllII(868565093, -1469958004 ^ -1135720154)
      );
   }

   public static boolean lllIl(
      class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, float var10, float var11, float var12, float var13, int var14
   ) {
      return IIlIlIlIl.ll(var0, var1, var2, var4, var6, var8, var10, var11, var12, var13, var14);
   }

   public static void llllI(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12, int var13) {
      int var15 = 1089829568;
      if (var0 != null && !(var5 <= 0.0) && !(var7 <= 0.0)) {
         lll(var0, var1, var3, var5, var7, var9, llllII(868565098, var15 ^ -761328291), 10.0, llllII(868565099, var15 ^ 2011891338), 0.44);
         lIllII(var0, var1, var3, var5, var7, var9, var11, var12);
         int var14 = var13 >>> llllII(868565096, var15 ^ -812837373) & llllII(868565097, var15 ^ 2055642977);
         if (var14 > 0) {
            lllIlI(
               var0,
               var1 + 1.0,
               var3 + 1.0,
               var5 - 2.0,
               Math.min(30.0, var7 - 2.0),
               Math.max(0.0, var9 - 1.0),
               var13,
               var13 & llllII(868565102, var15 ^ -1946787164)
            );
         }
      }
   }

   public static String lllll(String var0, String var1) {
      String var2 = IIlIl(var0, var1).trim();
      String var10000;
      if (var2.isEmpty()) {
         var10000 = "";
      } else {
         var10000 = IlIIllIII.lI(IIIlII(llllII(868565103, -571418850 ^ -677442998), llllII(868565100, -571418850 ^ -1279659148)));
         String var5 = IlIIllIII.lI(IIIlII(llllII(868565101, -571418850 ^ -258787726), llllII(868565106, -571418850 ^ -781369827)));
         String var3 = var10000;
         var10000 = var3 + var2 + var5;
      }

      return var10000;
   }

   public static void IIIIII(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12) {
      IlIIll(var0, var1, var3, var5, var7, var9, var11, var12, true, true);
   }

   public static void IIIIIl(class_332 var0, double var1, double var3, double var5, double var7, int var9) {
      if ((var9 >>> llllII(868565118, 557758955 ^ 1381023) & llllII(868565119, 557758955 ^ 1956173151)) > 0 && !(var5 <= 0.0) && !(var7 <= 0.0)) {
         IIlIlIlIl.IllIl(var0, var1, var3, var5, var7, var9);
      }
   }

   private static void IIIIlI(class_332 var0, class_327 var1, class_2561 var2, int var3, int var4, int var5, boolean var6) {
      String[] var10000 = IIllllIl.IIIIl();
      String var8 = var2.getString();
      int var9 = var5 >>> llllII(868565116, 187836709 ^ -209412867) & llllII(868565117, 187836709 ^ 267431469);
      double var10 = var3;
      int var12 = 0;
      String[] var7 = var10000;
      int var13 = 0;

      while (var13 < var8.length()) {
         int var14 = var8.codePointAt(var13);
         String var15 = new String(Character.toChars(var14));
         class_5250 var16 = class_2561.method_43470(var15).method_10862(var2.method_10866());
         if (!Character.isWhitespace(var14)) {
            int var17 = lIIIl(var9, var3, var4, var12);
            lIlIII(var0, var1, var16, (int)Math.round(var10), var4, var17, var6);
         }

         var10 += var1.method_27525(var16);
         var13 += Character.charCount(var14);
         var12++;
         if (var7 != null) {
            break;
         }
      }
   }

   private static void IIIIll(class_332 var0, class_327 var1, class_2561 var2, double var3, double var5, int var7, boolean var8) {
      if (var0 != null && var1 != null && var2 != null && Double.isFinite(var3) && Double.isFinite(var5)) {
         int var9 = (int)Math.round(var3);
         int var10 = (int)Math.round(var5);
         if (IllIlI(var7, var2)) {
            IIIIlI(var0, var1, var2, var9, var10, var7, var8);
         } else {
            lIlIII(var0, var1, var2, var9, var10, var7, var8);
         }
      }
   }

   private static String IIIlII(int var0, int var1) {
      int var9 = 2108064892;
      int var2 = (var0 ^ llllII(868565058, var9 ^ 1220271935)) & llllII(868565059, var9 ^ 1143943082);
      if (IIl[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & llllII(868565056, var9 ^ 945826903)) {
            case 0 -> llllII(868565057, var9 ^ -1825708231);
            case 1 -> llllII(868565062, var9 ^ 1788994932);
            case 2 -> llllII(868565063, var9 ^ 1908310455);
            case 3 -> llllII(868565060, var9 ^ -1696399913);
            case 4 -> llllII(868565061, var9 ^ 929904905);
            case 5 -> llllII(868565066, var9 ^ -2095492041);
            case 6 -> llllII(868565067, var9 ^ 723704595);
            case 7 -> llllII(868565064, var9 ^ -800816879);
            case 8 -> llllII(868565065, var9 ^ 1713311379);
            case 9 -> llllII(868565070, var9 ^ -1761103032);
            case 10 -> llllII(868565071, var9 ^ 2113844664);
            case 11 -> llllII(868565068, var9 ^ 1513481982);
            case 12 -> llllII(868565069, var9 ^ -1992758041);
            case 13 -> llllII(868565074, var9 ^ -160173671);
            case 14 -> llllII(868565075, var9 ^ 2085974992);
            case 15 -> llllII(868565072, var9 ^ -1229323739);
            case 16 -> llllII(868565073, var9 ^ -509236336);
            case 17 -> llllII(868565078, var9 ^ 1071307329);
            case 18 -> llllII(868565079, var9 ^ -2075221510);
            case 19 -> llllII(868565076, var9 ^ -1732515408);
            case 20 -> llllII(868565077, var9 ^ 400559969);
            case 21 -> llllII(868565082, var9 ^ -151217957);
            case 22 -> llllII(868565083, var9 ^ 2005854483);
            case 23 -> llllII(868565080, var9 ^ 253918119);
            case 24 -> llllII(868565081, var9 ^ 754610428);
            case 25 -> llllII(868565086, var9 ^ -1547178017);
            case 26 -> llllII(868565087, var9 ^ 878579096);
            case 27 -> llllII(868565084, var9 ^ -1816316926);
            case 28 -> llllII(868565085, var9 ^ 9387739);
            case 29 -> llllII(868565154, var9 ^ -1044335999);
            case 30 -> llllII(868565155, var9 ^ -1152348896);
            case 31 -> llllII(868565152, var9 ^ 1867063442);
            case 32 -> llllII(868565153, var9 ^ 822823822);
            case 33 -> llllII(868565158, var9 ^ 979685975);
            case 34 -> llllII(868565159, var9 ^ 851711296);
            case 35 -> llllII(868565156, var9 ^ -1335677000);
            case 36 -> llllII(868565157, var9 ^ -391858641);
            case 37 -> llllII(868565162, var9 ^ -1633436468);
            case 38 -> llllII(868565163, var9 ^ -2069629635);
            case 39 -> llllII(868565160, var9 ^ 1390693514);
            case 40 -> llllII(868565161, var9 ^ 256242057);
            case 41 -> llllII(868565166, var9 ^ 992796988);
            case 42 -> llllII(868565167, var9 ^ 1745248883);
            case 43 -> llllII(868565164, var9 ^ 1549796462);
            case 44 -> llllII(868565165, var9 ^ 1732503919);
            case 45 -> llllII(868565170, var9 ^ -659214334);
            case 46 -> llllII(868565171, var9 ^ -250313058);
            case 47 -> llllII(868565168, var9 ^ -296885951);
            case 48 -> llllII(868565169, var9 ^ 968639797);
            case 49 -> llllII(868565174, var9 ^ 731477071);
            case 50 -> llllII(868565175, var9 ^ 1500223873);
            case 51 -> llllII(868565172, var9 ^ 499189045);
            case 52 -> llllII(868565173, var9 ^ -1931739781);
            case 53 -> llllII(868565178, var9 ^ -1772834845);
            case 54 -> llllII(868565179, var9 ^ 842743928);
            case 55 -> llllII(868565176, var9 ^ -197496007);
            case 56 -> llllII(868565177, var9 ^ -593598012);
            case 57 -> llllII(868565182, var9 ^ 784710789);
            case 58 -> llllII(868565183, var9 ^ -858329020);
            case 59 -> llllII(868565180, var9 ^ -47163532);
            case 60 -> llllII(868565181, var9 ^ -768876890);
            case 61 -> llllII(868565122, var9 ^ 483799281);
            case 62 -> llllII(868565123, var9 ^ -1520551402);
            case 63 -> llllII(868565120, var9 ^ -372661327);
            case 64 -> llllII(868565121, var9 ^ 566206728);
            case 65 -> llllII(868565126, var9 ^ 1164200197);
            case 66 -> llllII(868565127, var9 ^ -2147317554);
            case 67 -> llllII(868565124, var9 ^ -1737923983);
            case 68 -> llllII(868565125, var9 ^ 1429656665);
            case 69 -> llllII(868565130, var9 ^ -1220556006);
            case 70 -> llllII(868565131, var9 ^ -1949698965);
            case 71 -> llllII(868565128, var9 ^ 869116642);
            case 72 -> llllII(868565129, var9 ^ -1844720533);
            case 73 -> llllII(868565134, var9 ^ 1638689383);
            case 74 -> llllII(868565135, var9 ^ -909290679);
            case 75 -> llllII(868565132, var9 ^ -290751634);
            case 76 -> llllII(868565133, var9 ^ -994280210);
            case 77 -> llllII(868565138, var9 ^ 545382814);
            case 78 -> llllII(868565139, var9 ^ 1345137278);
            case 79 -> llllII(868565136, var9 ^ -127400691);
            case 80 -> llllII(868565137, var9 ^ -1864515255);
            case 81 -> llllII(868565142, var9 ^ 148010665);
            case 82 -> llllII(868565143, var9 ^ -1967184108);
            case 83 -> llllII(868565140, var9 ^ -1200631572);
            case 84 -> llllII(868565141, var9 ^ 1056736086);
            case 85 -> llllII(868565146, var9 ^ 572626069);
            case 86 -> llllII(868565147, var9 ^ 523185176);
            case 87 -> llllII(868565144, var9 ^ -1556275583);
            case 88 -> llllII(868565145, var9 ^ -1414053029);
            case 89 -> llllII(868565150, var9 ^ -1708410636);
            case 90 -> llllII(868565151, var9 ^ 944714896);
            case 91 -> llllII(868565148, var9 ^ 128979406);
            case 92 -> llllII(868565149, var9 ^ 1524180057);
            case 93 -> llllII(868565218, var9 ^ 89249390);
            case 94 -> 2;
            case 95 -> llllII(868565219, var9 ^ -1510917379);
            case 96 -> llllII(868565216, var9 ^ 1739316737);
            case 97 -> llllII(868565217, var9 ^ 596601184);
            case 98 -> llllII(868565222, var9 ^ -1904185870);
            case 99 -> llllII(868565223, var9 ^ 767745692);
            case 100 -> llllII(868565220, var9 ^ 1749552906);
            case 101 -> llllII(868565221, var9 ^ -1200367970);
            case 102 -> llllII(868565226, var9 ^ 498119026);
            case 103 -> llllII(868565227, var9 ^ 1587349101);
            case 104 -> llllII(868565224, var9 ^ -1698150710);
            case 105 -> llllII(868565225, var9 ^ 1996416135);
            case 106 -> llllII(868565230, var9 ^ -1839017547);
            case 107 -> llllII(868565231, var9 ^ 672116576);
            case 108 -> llllII(868565228, var9 ^ 1079221886);
            case 109 -> llllII(868565229, var9 ^ -1390527177);
            case 110 -> llllII(868565234, var9 ^ -1510556519);
            case 111 -> llllII(868565235, var9 ^ 1635179586);
            case 112 -> llllII(868565232, var9 ^ -2069469734);
            case 113 -> llllII(868565233, var9 ^ -1555812297);
            case 114 -> llllII(868565238, var9 ^ 530907306);
            case 115 -> llllII(868565239, var9 ^ 1386193916);
            case 116 -> llllII(868565236, var9 ^ 544852845);
            case 117 -> llllII(868565237, var9 ^ -1535353529);
            case 118 -> llllII(868565242, var9 ^ 1450654301);
            case 119 -> llllII(868565243, var9 ^ -555732399);
            case 120 -> llllII(868565240, var9 ^ -1256625492);
            case 121 -> llllII(868565241, var9 ^ -219983267);
            case 122 -> llllII(868565246, var9 ^ -581007075);
            case 123 -> llllII(868565247, var9 ^ -109780296);
            case 124 -> llllII(868565244, var9 ^ 153969524);
            case 125 -> llllII(868565245, var9 ^ 2005108719);
            case 126 -> llllII(868565186, var9 ^ 832333358);
            case 127 -> llllII(868565187, var9 ^ 527089792);
            case 128 -> llllII(868565184, var9 ^ 996635373);
            case 129 -> llllII(868565185, var9 ^ 1904957878);
            case 130 -> llllII(868565190, var9 ^ -1155440838);
            case 131 -> llllII(868565191, var9 ^ 567085381);
            case 132 -> llllII(868565188, var9 ^ -76594969);
            case 133 -> 1;
            case 134 -> llllII(868565189, var9 ^ -2152349);
            case 135 -> llllII(868565194, var9 ^ 1425388450);
            case 136 -> llllII(868565195, var9 ^ -1377258923);
            case 137 -> llllII(868565192, var9 ^ 488025338);
            case 138 -> llllII(868565193, var9 ^ 926006386);
            case 139 -> llllII(868565198, var9 ^ -1671855448);
            case 140 -> llllII(868565199, var9 ^ 1882717827);
            case 141 -> llllII(868565196, var9 ^ -1593756283);
            case 142 -> llllII(868565197, var9 ^ 2084369910);
            case 143 -> llllII(868565202, var9 ^ -1778819738);
            case 144 -> llllII(868565203, var9 ^ 1667566791);
            case 145 -> llllII(868565200, var9 ^ -1724753682);
            case 146 -> llllII(868565201, var9 ^ 2052953384);
            case 147 -> llllII(868565206, var9 ^ -101628871);
            case 148 -> llllII(868565207, var9 ^ 35148140);
            case 149 -> llllII(868565204, var9 ^ 299188719);
            case 150 -> llllII(868565205, var9 ^ -427069815);
            case 151 -> llllII(868565210, var9 ^ -2118873577);
            case 152 -> llllII(868565211, var9 ^ 146091655);
            case 153 -> llllII(868565208, var9 ^ -1900720971);
            case 154 -> llllII(868565209, var9 ^ -383540597);
            case 155 -> llllII(868565214, var9 ^ -464369947);
            case 156 -> llllII(868565215, var9 ^ 1487775556);
            case 157 -> llllII(868565212, var9 ^ 1826754572);
            case 158 -> llllII(868565213, var9 ^ 1657353663);
            case 159 -> llllII(868565282, var9 ^ 859480422);
            case 160 -> llllII(868565283, var9 ^ -1079712367);
            case 161 -> llllII(868565280, var9 ^ 511285924);
            case 162 -> llllII(868565281, var9 ^ -1376602151);
            case 163 -> llllII(868565286, var9 ^ 580811278);
            case 164 -> llllII(868565287, var9 ^ 205186526);
            case 165 -> llllII(868565284, var9 ^ -1811710427);
            case 166 -> llllII(868565285, var9 ^ 1493023651);
            case 167 -> llllII(868565290, var9 ^ 1819625434);
            case 168 -> llllII(868565291, var9 ^ 2088427501);
            case 169 -> llllII(868565288, var9 ^ -714922421);
            case 170 -> llllII(868565289, var9 ^ 1339603244);
            case 171 -> llllII(868565294, var9 ^ 596924421);
            case 172 -> llllII(868565295, var9 ^ 194790746);
            case 173 -> llllII(868565292, var9 ^ 881613846);
            case 174 -> llllII(868565293, var9 ^ 1472740904);
            case 175 -> llllII(868565298, var9 ^ 1310103537);
            case 176 -> llllII(868565299, var9 ^ 2038851273);
            case 177 -> 5;
            case 178 -> llllII(868565296, var9 ^ -1489837958);
            case 179 -> llllII(868565297, var9 ^ 722274164);
            case 180 -> llllII(868565302, var9 ^ 1193051235);
            case 181 -> llllII(868565303, var9 ^ -1917732686);
            case 182 -> llllII(868565300, var9 ^ -593815856);
            case 183 -> llllII(868565301, var9 ^ -1533874659);
            case 184 -> llllII(868565306, var9 ^ -1983734981);
            case 185 -> llllII(868565307, var9 ^ -1383047426);
            case 186 -> llllII(868565304, var9 ^ -286511838);
            case 187 -> llllII(868565305, var9 ^ -1710034177);
            case 188 -> llllII(868565310, var9 ^ 650898859);
            case 189 -> llllII(868565311, var9 ^ -1583946934);
            case 190 -> llllII(868565308, var9 ^ 1357331133);
            case 191 -> llllII(868565309, var9 ^ 1427796778);
            case 192 -> llllII(868565250, var9 ^ -1775264337);
            case 193 -> llllII(868565251, var9 ^ -743543804);
            case 194 -> llllII(868565248, var9 ^ -1008084941);
            case 195 -> llllII(868565249, var9 ^ -37376482);
            case 196 -> llllII(868565254, var9 ^ 1360866774);
            case 197 -> llllII(868565255, var9 ^ -175622895);
            case 198 -> llllII(868565252, var9 ^ 1617357619);
            case 199 -> llllII(868565253, var9 ^ 973363534);
            case 200 -> llllII(868565258, var9 ^ 2094931202);
            case 201 -> llllII(868565259, var9 ^ 1333924995);
            case 202 -> llllII(868565256, var9 ^ 146654486);
            case 203 -> llllII(868565257, var9 ^ -970972640);
            case 204 -> llllII(868565262, var9 ^ 190153335);
            case 205 -> llllII(868565263, var9 ^ 1158672579);
            case 206 -> llllII(868565260, var9 ^ 1286472367);
            case 207 -> llllII(868565261, var9 ^ -251649475);
            case 208 -> llllII(868565266, var9 ^ 1618517867);
            case 209 -> llllII(868565267, var9 ^ 569900290);
            case 210 -> llllII(868565264, var9 ^ -860218984);
            case 211 -> llllII(868565265, var9 ^ -258934561);
            case 212 -> llllII(868565270, var9 ^ 1453759971);
            case 213 -> llllII(868565271, var9 ^ -1309259142);
            case 214 -> llllII(868565268, var9 ^ -2071996170);
            case 215 -> llllII(868565269, var9 ^ -1532961565);
            case 216 -> llllII(868565274, var9 ^ -24893140);
            case 217 -> llllII(868565275, var9 ^ 1023176105);
            case 218 -> llllII(868565272, var9 ^ -1670378687);
            case 219 -> 3;
            case 220 -> llllII(868565273, var9 ^ 120126890);
            case 221 -> llllII(868565278, var9 ^ 1085113675);
            case 222 -> llllII(868565279, var9 ^ -1669480271);
            case 223 -> llllII(868565276, var9 ^ 1959414691);
            case 224 -> llllII(868565277, var9 ^ 1336637915);
            case 225 -> llllII(868565346, var9 ^ -772394189);
            case 226 -> llllII(868565347, var9 ^ 695815805);
            case 227 -> llllII(868565344, var9 ^ -621820560);
            case 228 -> llllII(868565345, var9 ^ 949382630);
            case 229 -> llllII(868565350, var9 ^ -289605601);
            case 230 -> llllII(868565351, var9 ^ 413787950);
            case 231 -> llllII(868565348, var9 ^ 1830345660);
            case 232 -> llllII(868565349, var9 ^ -1346407048);
            case 233 -> 0;
            case 234 -> llllII(868565354, var9 ^ 537217925);
            case 235 -> llllII(868565355, var9 ^ -2075519848);
            case 236 -> llllII(868565352, var9 ^ -343359269);
            case 237 -> llllII(868565353, var9 ^ 338741753);
            case 238 -> llllII(868565358, var9 ^ 1833055194);
            case 239 -> llllII(868565359, var9 ^ 1253724401);
            case 240 -> llllII(868565356, var9 ^ 422913669);
            case 241 -> llllII(868565357, var9 ^ -1676199466);
            case 242 -> llllII(868565362, var9 ^ -150929105);
            case 243 -> llllII(868565363, var9 ^ -1424880453);
            case 244 -> llllII(868565360, var9 ^ 951491825);
            case 245 -> llllII(868565361, var9 ^ 1647212440);
            case 246 -> llllII(868565366, var9 ^ -221314371);
            case 247 -> llllII(868565367, var9 ^ 1927923586);
            case 248 -> llllII(868565364, var9 ^ -1523976855);
            case 249 -> llllII(868565365, var9 ^ -295557969);
            case 250 -> llllII(868565370, var9 ^ 266486596);
            case 251 -> llllII(868565371, var9 ^ 91470289);
            case 252 -> llllII(868565368, var9 ^ 2103347375);
            case 253 -> llllII(868565369, var9 ^ -1460910961);
            case 254 -> 4;
            default -> llllII(868565374, var9 ^ 1344986068);
         };
         int var5 = (var1 & llllII(868565375, var9 ^ -1675156452)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & llllII(868565372, var9 ^ -461737548)) >>> llllII(868565373, var9 ^ 11343646)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & llllII(868565314, var9 ^ 1954517717);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & llllII(868565315, var9 ^ -1074971789);
            }
         }

         IIl[var2] = new String(var3).intern();
      }

      return IIl[var2];
   }

   public static void IIIlIl(class_332 var0, double var1, double var3, double var5, double var7, int var9, int var10) {
      int var11 = (int)Math.floor(Math.min(var1, var5));
      int var12 = (int)Math.floor(Math.min(var3, var7));
      int var13 = (int)Math.ceil(Math.max(var1, var5));
      int var14 = (int)Math.ceil(Math.max(var3, var7));
      if (var13 > var11 && var14 > var12) {
         var0.method_25296(var11, var12, var13, var14, var9, var10);
      }
   }

   public static double IIIllI() {
      return ll.l();
   }

   public static void IIIlll(class_332 var0, class_327 var1, String var2, double var3, double var5, int var7) {
      if (IIIIlIlI.III()) {
         IIII(var0, var1, var2, var3 - IIl(var1, var2), var5, var7);
      } else {
         class_2561 var8 = IIIlIIII.Ill(var2);
         IIIIll(var0, var1, var8, var3 - llIlll(var1, var8), var5, var7, true);
      }
   }

   public static void IIlIII(
      class_332 var0, class_327 var1, String var2, double var3, double var5, double var7, double var9, boolean var11, int var12, int var13, int var14
   ) {
      double var15 = Math.max(1.0, var9);
      double var17 = Math.min(ll.I(), var15 * 0.5);
      llIl(var0, var3, var5, var7, var15, var17, var12);
      if ((var13 >>> llllII(868565312, 1639861625 ^ 1515581666) & llllII(868565313, 1639861625 ^ 283270829)) > 0 || var11) {
         l(var0, var3, var5, var7, var15, var17, var13);
      }

      String var19 = llIIl(var1, var2, Math.max(0.0, var7 - ll.l() * 2.0));
      IIll(var0, var1, var19, var3 + (var7 - IIl(var1, var19)) * 0.5, var5 + (var15 - IlIlIl(var1)) * 0.5, var14);
   }

   public static void IIlIIl(class_332 var0, class_327 var1, String var2, double var3, double var5, double var7, int var9) {
      IIll(var0, var1, var2, var3, var5 + (var7 - IlIlIl(var1)) / 2.0, var9);
   }

   public static void IIlIlI(class_332 var0, class_327 var1, class_2561 var2, double var3, double var5, double var7, double var9, int var11) {
      lIlII(var0, var1, var2, var3 + var7 / 2.0, var5 + var9 / 2.0, var11);
   }

   public static void IIlIll(class_332 var0, double var1, double var3, double var5, double var7, int var9, int var10, double var11) {
      l(var0, var1, var3, var5, var7, var11, var10);
      llIl(var0, var1 + 1.0, var3 + 1.0, var5 - 2.0, var7 - 2.0, Math.max(0.0, var11 - 1.0), var9);
   }

   public static double IIllII() {
      return Math.max(6.0, ll.II() - ll.l());
   }

   public static void IIllIl(class_332 var0, double var1, double var3, double var5, double var7, int var9, int var10, boolean var11) {
      IlII(var0, var1, var3, var5, var7, var9, var10);
      IIIlIl(
         var0,
         var1 + 1.0,
         var3 + 1.0,
         var1 + var5 - 1.0,
         var3 + Math.max(12.0, var7 * 0.5),
         var11 ? llllII(868565318, 1278148075 ^ -1799193430) : llllII(868565319, 1278148075 ^ 1636893921),
         llllII(868565316, 1278148075 ^ 734727907)
      );
   }

   public static void IIlllI(class_332 var0, class_327 var1, String var2, double var3, double var5, double var7, boolean var9, int var10, int var11, int var12) {
      double var13 = ll.II();
      llIl(var0, var3, var5, var7, var13, ll.I(), var10);
      if ((var11 >>> llllII(868565317, -1541751676 ^ 1944069453) & llllII(868565322, -1541751676 ^ -1212465457)) > 0 || var9) {
         l(var0, var3, var5, var7, var13, ll.I(), var11);
      }

      llIll(var0, var1, var2, var3, var5, var7, var13, ll.l(), var12);
   }

   public static void IIllll(class_332 var0) {
      IIlIlIlIl.lll(var0);
   }

   public static void IlIIII(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, int var10, int var11) {
      lIlll(var0, var1, var2, var4, var6, var8, var10, var11, -1);
   }

   public static void IlIIIl(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if (var0 != null && (var11 >>> llllII(868565323, 1596089186 ^ -542944274) & llllII(868565320, 1596089186 ^ 1557318005)) > 0 && !(var9 <= 0.0)) {
         double var12 = var5 - var1;
         double var14 = var7 - var3;
         double var16 = Math.hypot(var12, var14);
         if (Double.isFinite(var16) && !(var16 < 0.001)) {
            IIllll(var0);

            try {
               IlIIlI(var0, var1, var3);
               I(var0, Math.toDegrees(Math.atan2(var14, var12)));
               IIlIlIlIl.l(var0, 0.0, var9 * -0.5, var16, var9, 0.0, var11);
            } finally {
               lIIIll(var0);
            }
         }
      }
   }

   public static void IlIIlI(class_332 var0, double var1, double var3) {
      IIlIlIlIl.Illll(var0, var1, var3);
   }

   private static void IlIIll(
      class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12, boolean var13, boolean var14
   ) {
      int var15 = var11 >>> llllII(868565321, 1069932203 ^ -1515062121) & llllII(868565326, 1069932203 ^ 1072491569);
      int var16 = var12 >>> llllII(868565327, 1069932203 ^ -2135592287) & llllII(868565324, 1069932203 ^ 1815664044);
      if (var15 > 0 || var16 > 0) {
         IIllIIII var17 = llIIII(var1, var3, var5, var7, var9, 0.0);
         if (var17.II()) {
            int var18 = var7 < 0.0 ? var12 : var11;
            int var19 = var7 < 0.0 ? var11 : var12;
            boolean var20 = var7 < 0.0 ? var14 : var13;
            boolean var21 = var7 < 0.0 ? var13 : var14;
            if (!var20 && !var21) {
               IIIlIl(var0, var17.Il(), var17.III(), var17.Il() + var17.lI(), var17.III() + var17.l(), var18, var19);
            } else {
               IIlIlIlIl.lIIll(var0, var17.Il(), var17.III(), var17.lI(), var17.l(), var17.ll(), var18, var19, var20, var21);
            }
         }
      }
   }

   public static void IlIlII(class_332 var0, class_327 var1, String var2, double var3, double var5, int var7) {
      if (IIIIlIlI.III()) {
         IIll(var0, var1, var2, var3 - IIl(var1, var2) / 2.0, var5 - IlIlIl(var1) / 2.0, var7);
      } else {
         class_2561 var8 = IIIlIIII.Ill(var2);
         IIIIll(var0, var1, var8, var3 - llIlll(var1, var8) / 2.0, var5 - IlIlIl(var1) / 2.0, var7, false);
      }
   }

   public static double IlIlIl(class_327 var0) {
      double var1 = IIIIlIlI.IIlI();
      if (var1 >= 0.0) {
         return var1;
      } else {
         return var0 == null ? 9.0 : 9.0;
      }
   }

   public static double IlIllI() {
      return ll.I();
   }

   public static void IlIlll(double var0) {
      II = Math.max(0.0, var0);
   }

   public static void IllIII(class_332 var0, double var1, double var3, double var5, double var7) {
      Ill(var0, var1, var3, var5, var7, 2.0);
   }

   public static boolean IllIIl(double var0, double var2, double var4, double var6, double var8, double var10) {
      return lIIII.lII(var0, var2, var4, var6, var8, var10);
   }

   private static boolean IllIlI(int var0, class_2561 var1) {
      int var2 = var0 >>> llllII(868565325, -1746300656 ^ -501696098) & llllII(868565330, -1746300656 ^ 378929148);
      if (var2 > 0 && (var0 & llllII(868565331, -1746300656 ^ 1638825197)) != 0 && var1 != null && !var1.getString().isEmpty()) {
         Boolean var3 = I.get();
         return var3 != null ? var3 && IIIlIIII.lllI() : false;
      } else {
         return false;
      }
   }

   public static void IllIll(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if ((var11 >>> llllII(868565328, 1526402438 ^ -1027318228) & llllII(868565329, 1526402438 ^ 2067159719)) > 0) {
         IIllIIII var12 = llIIII(var1, var3, var5, var7, var9, 1.0);
         if (var12.II()) {
            if (var12.ll() <= 0.0) {
               lIIIIl(var0, var12.Il(), var12.III(), var12.lI(), var12.l(), var12.I(), var11);
            } else {
               IIlIlIlIl.IllII(var0, var12.Il(), var12.III(), var12.lI(), var12.l(), var12.ll(), var12.I(), var11);
            }
         }
      }
   }

   public static void IlllII(class_332 var0) {
      if (var0 != null) {
         Deque var1 = lIl.get();
         if (!var1.isEmpty()) {
            var1.pop();
            var0.method_44380();
         }
      }
   }

   public static void IlllIl(class_332 var0, class_327 var1, class_2561 var2, double var3, double var5, int var7) {
      class_2561 var8 = IIIlIIII.lI(var2);
      IIIIll(var0, var1, var8, var3 - llIlll(var1, var8), var5, var7, false);
   }

   public static void IllllI(class_332 var0, class_327 var1, class_2561 var2, double var3, double var5, double var7, double var9, int var11) {
      Illlll(var0, var1, var2, var3 + var7 / 2.0, var5 + var9 / 2.0, var11);
   }

   public static void Illlll(class_332 var0, class_327 var1, class_2561 var2, double var3, double var5, int var7) {
      class_2561 var8 = IIIlIIII.lI(var2);
      IIIIll(var0, var1, var8, var3 - llIlll(var1, var8) / 2.0, var5 - IlIlIl(var1) / 2.0, var7, true);
   }

   private static int llllII(int var0, int var1) {
      int var2 = llI[var0 ^ 868565026] ^ var1 ^ var0;
      var2 -= 50431;
      var2 -= 40076;
      var2 -= 56310;
      var2 += 59791;
      var2 -= 54510;
      var2 += 45677;
      var2 -= 18945;
      var2 += 30755;
      var2 ^= 27754;
      return var2 ^ 55364;
   }

   public static void lIIIII(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12, int var13) {
      if (!(var5 <= 0.0) && !(var7 <= 0.0)) {
         l(var0, var1, var3, var5, var7, var9, var12);
         double var14 = Math.max(0.0, var9 - 1.0);
         llIl(var0, var1 + 1.0, var3 + 1.0, var5 - 2.0, var7 - 2.0, var14, var11);
         if (var13 != 0) {
            double var16 = Math.min(40.0, var7 - 2.0);
            lllIlI(
               var0,
               var1 + 1.0,
               var3 + 1.0,
               var5 - 2.0,
               var16,
               var14,
               llllII(868565334, -533530155 ^ 32289805) | var13 & llllII(868565335, -533530155 ^ -341635918),
               0 | var13 & llllII(868565332, -533530155 ^ 1623884111)
            );
         }
      }
   }

   public static void lIIIIl(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if ((var11 >>> llllII(868565333, -1425628282 ^ -1308525262) & llllII(868565338, -1425628282 ^ -845242855)) > 0
         && !(var5 <= 0.0)
         && !(var7 <= 0.0)
         && !(var9 <= 0.0)) {
         double var12 = Math.min(var9, Math.min(var5, var7) * 0.5);
         Il(var0, var1, var3, var1 + var5, var3 + var12, var11);
         Il(var0, var1, var3 + var7 - var12, var1 + var5, var3 + var7, var11);
         double var14 = var3 + var12;
         double var16 = var3 + var7 - var12;
         if (!(var16 <= var14)) {
            Il(var0, var1, var14, var1 + var12, var16, var11);
            Il(var0, var1 + var5 - var12, var14, var1 + var5, var16, var11);
         }
      }
   }

   public static void lIIIlI(class_332 var0, double var1, double var3, double var5, double var7, double var9, double var11, int var13) {
      if ((var13 >>> llllII(868565339, 601928874 ^ 1574670407) & llllII(868565336, 601928874 ^ -1266740128)) > 0 && !(var11 <= 0.0)) {
         IIllIIII var14 = llIIII(var1, var3, var5, var7, var9, var11);
         if (var14.II()) {
            IIlIlIlIl.lIlIl(var0, var14.Il(), var14.III(), var14.lI(), var14.l(), var14.ll(), var14.I(), var13);
         }
      }
   }

   public static void lIIIll(class_332 var0) {
      IIlIlIlIl.lI(var0);
   }

   public static void lIIlII(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      if ((var11 >>> llllII(868565337, 896962297 ^ -142596729) & llllII(868565342, 896962297 ^ 952761191)) > 0
         && !(var5 <= 0.0)
         && !(var7 <= 0.0)
         && !(var9 <= 0.0)) {
         IIlIlIlIl.IIIl(var0, var1, var3, var5, var7, var9, var11);
      }
   }

   public static void lIIlIl(class_332 var0, class_327 var1, class_2561 var2, double var3, double var5, double var7, int var9) {
      IIIlI(var0, var1, var2, var3, var5 + (var7 - IlIlIl(var1)) / 2.0, var9);
   }

   public static String lIIllI(class_327 var0, String var1, double var2) {
      return var0.method_27523(var1, (int)var2);
   }

   public static void lIIlll(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12, double var13) {
      int var24 = -1262919812;
      if (!(var5 <= 0.0) && !(var7 <= 0.0) && !(var13 <= 0.01)) {
         double var15 = Math.max(0.0, var9 - 0.5);
         llIl(var0, var1, var3, var5, var7, var9, var11);
         double var17 = Math.max(3.0, var7 * 0.45);
         llIl(
            var0,
            var1 + 0.5,
            var3 + 0.5,
            var5 - 1.0,
            var17,
            var15,
            (int)Math.round(10.0 * var13) << llllII(868565343, var24 ^ 1905066688) | llllII(868565340, var24 ^ 746563968)
         );
         double var19 = Math.max(2.0, var7 * 0.2);
         llIl(
            var0,
            var1 + 0.5,
            var3 + 0.5,
            var5 - 1.0,
            var19,
            var15,
            (int)Math.round(18.0 * var13) << llllII(868565341, var24 ^ 1643505404) | llllII(868565410, var24 ^ 492843427)
         );
         double var21 = Math.max(2.0, var7 * 0.25);
         llIl(var0, var1 + 0.5, var3 + var7 - var21, var5 - 1.0, var21, var15, (int)Math.round(12.0 * var13) << llllII(868565411, var24 ^ 1815382259));
         l(var0, var1, var3, var5, var7, var9, (int)Math.round(28.0 * var13) << llllII(868565408, var24 ^ 2127899981) | llllII(868565409, var24 ^ -1564135963));
         int var23 = (int)Math.round(14.0 * var13);
         if (var23 > 0) {
            llIl(
               var0,
               var1 + 1.0,
               var3 + 1.0,
               var5 - 2.0,
               var7 - 2.0,
               Math.max(0.0, var9 - 1.0),
               var23 << llllII(868565414, var24 ^ -1245241634) | var12 & llllII(868565415, var24 ^ -1409412187)
            );
         }
      }
   }

   private static void lIlIII(class_332 var0, class_327 var1, class_2561 var2, int var3, int var4, int var5, boolean var6) {
      if (Ill != null) {
         try {
            Method var10000 = Ill;
            Object[] var10002 = new Object[llllII(868565412, 398959034 ^ 839495420)];
            var10002[0] = var1;
            var10002[1] = var2;
            var10002[2] = var3;
            var10002[3] = var4;
            var10002[4] = var5;
            var10002[5] = var6;
            var10000.invoke(var0, var10002);
            return;
         } catch (ReflectiveOperationException var8) {
         }
      }
   }

   private static double lIlIIl(double var0, double var2, boolean var4) {
      long var5 = IllII(var0, var2);
      long var7 = System.nanoTime();
      double var9 = var4 ? 1.0 : 0.0;
      IIIIIIlIl var11 = lII.get(var5);
      if (var11 == null) {
         lII.put(var5, new IIIIIIlIl(var9, var7));
         return var9;
      } else {
         double var12 = Math.min(0.05, Math.max(0.0, (var7 - var11.l()) / 1.0E9));
         double var14 = 1.0 - Math.pow(0.001, var12 / 0.16);
         double var16 = var11.I() + (var9 - var11.I()) * Math.max(0.0, Math.min(1.0, var14));
         if (Math.abs(var16 - var9) < 0.002) {
            var16 = var9;
         }

         lII.put(var5, new IIIIIIlIl(var16, var7));
         return var16;
      }
   }

   private static String llllIl(int var0, int var1) {
      int var3 = var0 ^ -811295574;
      char[] var4 = lll[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIII[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIII[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -219824741;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 145;
            case 1 -> 62;
            case 2 -> 130;
            case 3 -> 129;
            case 4 -> 89;
            case 5 -> 24;
            case 6 -> 40;
            case 7 -> 28;
            case 8 -> 250;
            case 9 -> 252;
            case 10 -> 148;
            case 11 -> 170;
            case 12 -> 46;
            case 13 -> 42;
            case 14 -> 126;
            case 15 -> 98;
            case 16 -> 45;
            case 17 -> 246;
            case 18 -> 108;
            case 19 -> 164;
            case 20 -> 206;
            case 21 -> 21;
            case 22 -> 169;
            case 23 -> 84;
            case 24 -> 89;
            case 25 -> 203;
            case 26 -> 33;
            case 27 -> 57;
            case 28 -> 214;
            case 29 -> 9;
            case 30 -> 113;
            case 31 -> 51;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public static void lIlIlI(class_332 var0) {
      Deque var1 = lIl.get();
      if (var0 == null) {
         var1.clear();
      } else {
         while (!var1.isEmpty()) {
            var1.pop();
            var0.method_44380();
         }
      }
   }

   public static void lIlIll(class_332 var0, class_327 var1, String var2, double var3, double var5, double var7, double var9, double var11, int var13) {
      double var14 = Math.max(0.0, var7 - var11 * 2.0);
      lIll(var0, var1, llIIl(var1, var2, var14), var3 + var11, var5, var14, var9, var13);
   }

   public static void lIllII(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12) {
      IlIlI(
         var0,
         var1,
         var3,
         var5,
         var7,
         var9,
         IllllllI.III(IllllllI.IIlI(var11, -1, 0.06), 1.0),
         IllllllI.III(IllllllI.IIlI(var11, -1, 0.1), 1.0),
         IllllllI.III(var11, 0.92),
         IllllllI.III(var11, 0.96)
      );
      l(var0, var1, var3, var5, var7, var9, var12);
   }

   public static void lIllIl(Boolean var0) {
      if (var0 == null) {
         I.remove();
      } else {
         I.set(var0);
      }
   }

   private static double lIlllI(double var0) {
      double var2 = Math.max(0.0, Math.min(1.0, var0));
      return var2 * var2 * (3.0 - 2.0 * var2);
   }

   public static void lIllll(
      class_332 var0,
      class_2960 var1,
      double var2,
      double var4,
      double var6,
      double var8,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      int var16
   ) {
      if ((var16 >>> llllII(868565413, 1617871099 ^ 1799907265) & llllII(868565418, 1617871099 ^ 1337184814)) > 0
         && var12 > 0
         && var13 > 0
         && var14 > 0
         && var15 > 0) {
         IIlIlIlIl.IlIlI(
            var0,
            var1,
            (int)Math.round(var2),
            (int)Math.round(var4),
            (int)Math.round(var6),
            (int)Math.round(var8),
            var10,
            var11,
            var12,
            var13,
            var14,
            var15,
            var16
         );
      }
   }

   private static IIllIIII llIIII(double var0, double var2, double var4, double var6, double var8, double var10) {
      return lIIII.IIII(var0, var2, var4, var6, Math.max(0.0, var8 * II), Math.max(0.0, var10));
   }

   public static void llIIIl(class_332 var0, double var1, double var3) {
      IIlIlIlIl.Il(var0, var1, var3);
   }

   public static void llIIlI(class_332 var0, class_327 var1, String var2, double var3, double var5, int var7) {
      if (IIIIlIlI.III()) {
         IIII(var0, var1, var2, var3 - IIl(var1, var2) / 2.0, var5 - IlIlIl(var1) / 2.0, var7);
      } else {
         class_2561 var8 = IIIlIIII.Ill(var2);
         IIIIll(var0, var1, var8, var3 - llIlll(var1, var8) / 2.0, var5 - IlIlIl(var1) / 2.0, var7, true);
      }
   }

   private static int llIIll(Color var0, Color var1, double var2) {
      int var11 = 1388739280;
      Color var4 = var0 == null ? Color.WHITE : var0;
      Color var5 = var1 == null ? Color.WHITE : var1;
      double var6 = Math.max(0.0, Math.min(1.0, var2));
      int var8 = (int)Math.round(var4.getRed() + (var5.getRed() - var4.getRed()) * var6);
      int var9 = (int)Math.round(var4.getGreen() + (var5.getGreen() - var4.getGreen()) * var6);
      int var10 = (int)Math.round(var4.getBlue() + (var5.getBlue() - var4.getBlue()) * var6);
      return (var8 & llllII(868565419, var11 ^ 1313640100)) << llllII(868565416, var11 ^ -410533698)
         | (var9 & llllII(868565417, var11 ^ -2082237924)) << llllII(868565422, var11 ^ 972792778)
         | var10 & llllII(868565423, var11 ^ 869328930);
   }

   public static boolean llIlII(
      class_332 var0,
      class_2960 var1,
      double var2,
      double var4,
      double var6,
      double var8,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      float var15
   ) {
      return IIlIlIlIl.llII(var0, var1, var2, var4, var6, var8, var10, var11, var12, var13, var14, var15);
   }

   public static void llIlIl(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12) {
      if (var0 != null && !(var5 <= 0.0) && !(var7 <= 0.0)) {
         double var13 = Math.min(var5, var7) * 0.5;
         llIl(var0, var1, var3, var5, var7, var13, var11);
         double var15 = Math.max(0.0, Math.min(var5, var5 * IlllIII.ll(var9)));
         if (var15 > 0.0) {
            llIl(var0, var1, var3, var15, var7, Math.min(var13, var15 * 0.5), var12);
         }
      }
   }

   public static void llIllI(class_332 var0, class_327 var1, class_1799 var2, int var3, int var4) {
      if (var0 != null && var2 != null && !var2.method_7960()) {
         var0.method_51427(var2, var3, var4);
         if (var1 != null) {
            var0.method_51431(var1, var2, var3, var4);
         }
      }
   }

   public static int llIlll(class_327 var0, class_2561 var1) {
      return var0.method_27525(IIIlIIII.lI(var1));
   }

   public static void lllIII(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12) {
      int var13 = var11 >>> llllII(868565420, -1429102750 ^ -718625711) & llllII(868565421, -1429102750 ^ -216405212);
      int var14 = var12 >>> llllII(868565426, -1429102750 ^ 1687510554) & llllII(868565427, -1429102750 ^ -1024337817);
      if (var13 > 0 || var14 > 0) {
         IIllIIII var15 = llIIII(var1, var3, var5, var7, var9, 0.0);
         if (var15.II()) {
            int var16 = var5 < 0.0 ? var12 : var11;
            int var17 = var5 < 0.0 ? var11 : var12;
            IIlIlIlIl.llll(var0, var15.Il(), var15.III(), var15.lI(), var15.l(), var15.ll(), var16, var17);
         }
      }
   }

   public static double lllIIl() {
      return ll.II();
   }

   public static void lllIlI(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11, int var12) {
      IlIIll(var0, var1, var3, var5, var7, var9, var11, var12, true, false);
   }

   public static void lllIll(class_332 var0, double var1, double var3, double var5, int var7) {
      if ((var7 >>> llllII(868565424, -620767249 ^ 962917065) & llllII(868565425, -620767249 ^ -1548331459)) > 0 && !(var5 <= 0.0)) {
         IIlIlIlIl.IIlI(var0, var1, var3, var5, var7);
      }
   }
}
