package k74.x;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1703;
import net.minecraft.class_1707;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2480;
import net.minecraft.class_2588;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_465;
import net.minecraft.class_5134;
import net.minecraft.class_5321;
import net.minecraft.class_5537;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_9285;
import net.minecraft.class_9304;
import net.minecraft.class_9334;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import net.minecraft.class_9285.class_9287;

@Environment(EnvType.CLIENT)
public final class llIIII extends IlIIIIIIl {
   private final lllIIlII II;
   private static final int Il = 8;
   private static final int lI = 2;
   private static final int ll = 4;
   private final lIlllIl III;
   private boolean IIl;
   private final IIlIII IlI;
   private IIlIlIII Ill;
   private lIlII lII;
   private int I;
   private final lllIIlII lIl;
   private static final String[] lIIIl;
   private int llI;
   private int lll;
   private class_2338 IIII;
   private static final double IIIl = 0.0625;
   private long IIlI;
   private static final int IIll = 27;
   private final lllIIlII IlII;
   private static final int IlIl = 2;
   private long IllI;
   private final lllIIlII Illl;
   private class_2338 lIII;
   private boolean lIIl;
   private int lIlI;
   private boolean lIll;
   private static final Object[] lIIlI;
   private static final int[] lIIII;
   private static final String[] llII;
   private int llIl;
   private static final double lllI = 20.25;
   private static final String[] llll;
   private final IllIII<lIIlIlII> IIIII;
   private final lllIIlII IIIIl;
   private boolean IIIlI;
   private long IIIll;
   private final lllIIlII IIlII;
   private final Map<Integer, IIlllIlI> IIlIl;
   private final lIlllIl IIllI;
   private int IIlll;
   private final lllIIlII IlIII;
   private final lIlllIl IlIIl;
   private static final int IlIlI = 36;
   private static final int IlIll = 8;
   private class_2338 IllII;
   private final IlIIIllll IllIl;
   private final lllIIlII IlllI;
   private boolean Illll;

   private boolean I(class_310 var1, class_243 var2, class_2338 var3) {
      class_3965 var4 = var1.field_1687
         .method_17742(new class_3959(var1.field_1724.method_33571(), var2, class_3960.field_17559, class_242.field_1348, var1.field_1724));
      return var4 != null && var4.method_17783() != class_240.field_1333 && var4.method_17777().equals(var3);
   }

   private boolean II(class_746 var1, class_2338 var2) {
      return var1 != null && var1.method_5829().method_994(class_238.method_29968(class_243.method_24954(var2)).method_989(0.5, 0.5, 0.5).method_1014(0.49));
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean Il(class_310 var1, class_2338 var2, class_243 var3) {
      boolean var10 = false /* VF: Semaphore variable */;

      boolean var12;
      label55: {
         boolean var7;
         try {
            var10 = true;
            if (!this.IllII(var1, var2)) {
               this.IIII = null;
               var12 = false;
               var10 = false;
               break label55;
            }

            k74.x.IIll.IlIll(var1);
            class_3965 var4 = new class_3965(var3, class_2350.field_11036, var2, false);
            class_1269 var5 = k74.x.IIll.IlIIIl(var1, class_1268.field_5808, var4);
            boolean var6 = var5 != null && var5.method_23665();
            if (var6) {
               this.lll = var1.field_1724.field_6012 + 4;
               this.lIll = false;
            }

            var7 = var6;
            var10 = false;
         } finally {
            if (var10) {
               this.lIIl = false;
               this.lIlI = IIllIl(-320820387, 1927306174 ^ -2129219761);
               this.Ill();
            }
         }

         this.lIIl = false;
         this.lIlI = IIllIl(-320820386, 1927306174 ^ 996448032);
         this.Ill();
         return var7;
      }

      this.lIIl = false;
      this.lIlI = IIllIl(-320820385, 1927306174 ^ -1169889943);
      this.Ill();
      return var12;
   }

   private boolean lI(class_310 var1, int var2) {
      if (var1 != null && var1.field_1724 != null && var2 >= 0 && var2 < IIllIl(-320820388, -370389304 ^ 1441467987)) {
         if (this.Ill == null || this.Ill.III() != var2) {
            boolean var3 = k74.x.IIll.lIIlI(var1) != var2;
            int var4 = var3 ? this.lllIl(this.IIllI) : 0;
            this.Ill = k74.x.IIll.llII(var1, this, var2, var4, true);
         }

         return k74.x.IIll.IIIllII(var1, this.Ill);
      } else {
         return false;
      }
   }

   private void ll(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         int var2 = var1.field_1724.field_6012;
         if (this.IIl && this.llIl != IIllIl(-320820389, -1428592347 ^ 1108304697) && var2 >= this.llIl) {
            this.IIl = false;
            this.llIl = IIllIl(-320820390, -1428592347 ^ -1139242652);
         }

         if (this.lIIl && this.lIlI != IIllIl(-320820391, -1428592347 ^ -594124075) && var2 >= this.lIlI) {
            this.lIIl = false;
            this.lIlI = IIllIl(-320820392, -1428592347 ^ 605272760);
         }
      }
   }

   private boolean l(int var1, class_1703 var2, Entry var3) {
      if (var1 - ((IIlllIlI)var3.getValue()).l() >= IIllIl(-320820393, -1314086432 ^ -1070949078)) {
         return true;
      } else {
         class_1735 var4 = this.IIlIII(var2, (Integer)var3.getKey());
         if (var4 != null && var4.method_7681()) {
            class_1799 var5 = var4.method_7677();
            return var5 == null || var5.method_7960() || !((IIlllIlI)var3.getValue()).Il(var5);
         } else {
            return true;
         }
      }
   }

   private static double III(class_310 var0, class_2338 var1) {
      return var0.field_1724.method_33571().method_1025(class_243.method_24953(var1));
   }

   private boolean IIl(class_310 var1) {
      return this.IllIl(var1) && var1.field_1724.method_5805();
   }

   private void Ill() {
      this.lIII = null;
      this.IIIll = 0L;
      this.Ill = null;
   }

   private void lII(class_1703 var1, int var2, int var3) {
      class_1735 var4 = this.IIlIII(var1, var2);
      if (var4 != null && var4.method_7681()) {
         class_1799 var5 = var4.method_7677();
         if (var5 != null && !var5.method_7960()) {
            this.IIlIl.put(var2, new IIlllIlI(var5.method_7909().toString(), var5.method_7947(), var3));
         }
      }
   }

   private boolean lIl(class_310 var1) {
      if (this.Illl(var1.field_1724) && lIIIllII.III(var1)) {
         for (int var2 = 5; var2 <= IIllIl(-320820394, 2005885794 ^ 323157470); var2++) {
            class_1735 var3 = (class_1735)var1.field_1724.field_7498.field_7761.get(var2);
            if (var3 != null && var3.method_7681() && var3.method_7674(var1.field_1724)) {
               var1.field_1761.method_2906(var1.field_1724.field_7498.field_7763, var2, 0, class_1713.field_7794, var1.field_1724);
               lIIIllII.lII(var1);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean llI(class_746 var1) {
      if (var1 != null && var1.field_7498 != null) {
         for (int var2 = 5; var2 <= IIllIl(-320820395, -807896320 ^ -44992634); var2++) {
            class_1735 var3 = (class_1735)var1.field_7498.field_7761.get(var2);
            if (var3 != null && var3.method_7681()) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean lll(class_746 var1) {
      int var2 = Math.min(IIllIl(-320820396, 2112592553 ^ 122753803), var1.method_31548().method_5439());

      for (int var3 = 0; var3 < var2; var3++) {
         if (this.lIIll(var1.method_31548().method_5438(var3))) {
            return true;
         }
      }

      return false;
   }

   private static int IIllIl(int var0, int var1) {
      int var2 = lIIII[var0 ^ -320820385] ^ var1 ^ var0;
      var2 += 35655;
      var2 += 13783;
      var2 += 12687;
      var2 -= 5252;
      var2 ^= 38110;
      var2 -= 424;
      var2 += 31014;
      return var2 + 18962;
   }

   private boolean IIII(class_1799 var1) {
      return var1.method_57380().method_57845(class_9334.field_49637) != null || var1.method_57380().method_57845(class_9334.field_54199) != null;
   }

   private double IIIl(class_1799 var1) {
      double var2 = 0.0;
      class_9285 var4 = (class_9285)var1.method_58695(class_9334.field_49636, class_9285.field_49326);

      for (class_9287 var6 : var4.comp_2393()) {
         if (var6.comp_2395().equals(class_5134.field_23724)) {
            var2 += var6.comp_2396().comp_2449() * 80.0;
         } else if (var6.comp_2395().equals(class_5134.field_23725)) {
            var2 += var6.comp_2396().comp_2449() * 45.0;
         } else if (var6.comp_2395().equals(class_5134.field_23721)) {
            var2 += var6.comp_2396().comp_2449() * 65.0;
         } else if (var6.comp_2395().equals(class_5134.field_23723)) {
            var2 += var6.comp_2396().comp_2449() * 10.0;
         }
      }

      return var2;
   }

   private boolean IIlI(class_310 var1, lIlII var2, int var3) {
      return this.lIlll(var1, var2, var3);
   }

   private boolean IIll(class_1799 var1) {
      return var1.method_7909() instanceof class_1747 var2 && var2.method_7711() instanceof class_2480;
   }

   private boolean IlII(class_310 var1, class_2338 var2) {
      return var2 != null && IlllIlII.lIIII(var1, new class_3965(class_243.method_24953(var2), class_2350.field_11036, var2, false), false);
   }

   public boolean IlIl(class_310 var1) {
      return this.IIIIlIl() && this.lllll(var1);
   }

   private boolean IllI(class_310 var1, class_2338 var2, class_243 var3) {
      return this.Il(var1, var2, var3);
   }

   @Override
   public void llIl() {
      this.lIlII();
      this.IllIl.lIIl();
   }

   private boolean Illl(class_746 var1) {
      if (var1 == null) {
         return false;
      } else {
         for (int var2 = 0; var2 < IIllIl(-320820410, -696869526 ^ 214655001); var2++) {
            if (var1.method_31548().method_5438(var2).method_7960()) {
               return true;
            }
         }

         return false;
      }
   }

   private int lIII(class_1703 var1, List<Illlllll> var2) {
      int var3 = 0;
      int var4 = 0;

      for (int var5 = IIllIl(-320820411, 112429139 ^ 792021411); var5 < var1.field_7761.size(); var5++) {
         class_1735 var6 = (class_1735)var1.field_7761.get(var5);
         if (var6 != null && var6.field_7874 >= 0 && var6.method_7681()) {
            class_1799 var7 = var6.method_7677();
            lIlllIlI var8 = this.llIII(var7);
            if (var8 != null) {
               var3++;
               if (!this.IIlIl.containsKey(var6.field_7874)) {
                  var2.add(new Illlllll(var6.field_7874, var8, this.lIllI(var7, var8), var4));
               }

               var4++;
            }
         }
      }

      return var3;
   }

   private boolean lIIl(class_1799 var1) {
      int var3 = -1368762689;
      String var2 = class_7923.field_41178.method_10221(var1.method_7909()).method_12832();
      return var2.endsWith(IlIIllIII.lI(IIllII(IIllIl(-320820412, var3 ^ 1049280596), IIllIl(-320820413, var3 ^ -1451119323))))
         || var2.endsWith(IlIIllIII.lI(IIllII(IIllIl(-320820414, var3 ^ -1549105590), IIllIl(-320820415, var3 ^ 858261222))))
         || var2.endsWith(IlIIllIII.lI(IIllII(IIllIl(-320820416, var3 ^ -1055696075), IIllIl(-320820353, var3 ^ 462888729))))
         || var2.endsWith(IlIIllIII.lI(IIllII(IIllIl(-320820354, var3 ^ 1870480733), IIllIl(-320820355, var3 ^ 1612032628))))
         || var2.endsWith(IlIIllIII.lI(IIllII(IIllIl(-320820356, var3 ^ 10975670), IIllIl(-320820357, var3 ^ -239222650))))
         || var2.endsWith(IlIIllIII.lI(IIllII(IIllIl(-320820358, var3 ^ -601720345), IIllIl(-320820359, var3 ^ -1839864108))))
         || var2.equals(IlIIllIII.lI(IIllII(IIllIl(-320820360, var3 ^ 1568279643), IIllIl(-320820361, var3 ^ -1807121276))))
         || var2.equals(IlIIllIII.lI(IIllII(IIllIl(-320820362, var3 ^ -308113307), IIllIl(-320820363, var3 ^ -446617054))))
         || var2.equals(IlIIllIII.lI(IIllII(IIllIl(-320820364, var3 ^ 148560274), IIllIl(-320820365, var3 ^ 2004330328))))
         || var2.equals(IlIIllIII.lI(IIllII(IIllIl(-320820366, var3 ^ -122523977), IIllIl(-320820367, var3 ^ -346934969))))
         || var2.equals(IlIIllIII.lI(IIllII(IIllIl(-320820368, var3 ^ 1276429951), IIllIl(-320820369, var3 ^ 468402560))))
         || var2.equals(IlIIllIII.lI(IIllII(IIllIl(-320820370, var3 ^ 741842182), IIllIl(-320820371, var3 ^ 1087947632))))
         || var2.equals(IlIIllIII.lI(IIllII(IIllIl(-320820372, var3 ^ -1109419727), IIllIl(-320820373, var3 ^ -603334079))))
         || var2.equals(IlIIllIII.lI(IIllII(IIllIl(-320820374, var3 ^ -228204023), IIllIl(-320820375, var3 ^ 552506067))));
   }

   private static String IIlllI(short var0, int var1, int var2) {
      int var3 = var2 ^ 21898;
      char[] var4 = lIIIl[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lIIlI[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lIIlI[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 19478;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '벅';
         var10 -= 63261;
         var10 ^= 54318;
         var10 -= 60757;
         var10 += 31190;
         var10 -= 7746;
         var10 -= 36952;
         var10 += 57288;
         var10 ^= 3748;
         var10 -= 8415;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   private boolean lIlI(class_310 var1) {
      return this.lIlll(var1, this.lII, this.IIlll);
   }

   private Comparator<Illlllll> lIll() {
      return Comparator.comparingInt(llIIII::IIIll).thenComparing(llIIII::lllII).thenComparingInt(Illlllll::II);
   }

   private boolean llII(class_2338 var1) {
      long var2 = System.currentTimeMillis();
      if (var1 == null) {
         this.lIII = null;
         this.IIIll = 0L;
         return true;
      } else if (this.lIII == null || !this.lIII.equals(var1)) {
         this.lIII = var1.method_10062();
         this.IIIll = var2 + this.IIIllI(this.IIllI);
         return var2 >= this.IIIll;
      } else {
         return var2 >= this.IIIll;
      }
   }

   private int lllI(class_746 var1) {
      for (int var2 = 0; var2 < IIllIl(-320820376, 1615128413 ^ 1176842896); var2++) {
         if (var1.method_31548().method_5438(var2).method_31574(class_1802.field_8466)) {
            return var2;
         }
      }

      return -1;
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (!this.IIl(var1)) {
         this.lIlII();
      } else if (this.lllll(var1)) {
         this.IIl = false;
         this.llIl = IIllIl(-320820377, -1663957017 ^ 1239865421);
         this.lIIl = false;
         this.lIlI = IIllIl(-320820378, -1663957017 ^ 160604229);
         if (this.IlII.IllI() && this.llI(var1.field_1724)) {
            class_2338 var2 = this.IIIIl(var1);
            if (var2 != null && this.Illl(var1.field_1724)) {
               this.IIII = var2;
               this.lIll = true;
               var1.field_1724.method_7346();
               var1.method_1507(null);
               this.IIIIlI();
               return;
            }
         }

         this.lIll = false;
         this.IIlIIl(var1, (class_465<?>)var1.field_1755);
      } else {
         this.IIIIlI();
         if (var1.field_1755 == null && !lIIIllII.ll(var1) && var1.field_1724.field_6012 >= this.lll) {
            if (!this.IIIIl.IllI() && !this.lIll || !this.IlII.IllI() || !this.llI(var1.field_1724) || !this.Illl(var1.field_1724) || !this.lIl(var1)) {
               if (this.lll(var1.field_1724)) {
                  if (this.IIIIl.IllI() || this.lIll) {
                     this.IIllI(var1);
                  }
               }
            }
         }
      }
   }

   public llIIII() {
      int var1 = -1591572553;
      super(
         IlIIllIII.Ill(IIllII(IIllIl(-320820379, var1 ^ 1025016451), IIllIl(-320820380, var1 ^ 866411680))),
         lllIIlIl.IlI,
         IlIIllIII.Ill(IIllII(IIllIl(-320820381, var1 ^ 1246699458), IIllIl(-320820382, var1 ^ -1585341212)))
      );
      this.IIIIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllII(IIllIl(-320820383, var1 ^ -1440707090), IIllIl(-320820384, var1 ^ 1286451065))), false));
      this.IIIII = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllII(IIllIl(-320820449, var1 ^ 140926798), IIllIl(-320820450, var1 ^ -1418927876))), lIIlIlII.class, lIIlIlII.Il)
      );
      this.IlI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIllII(IIllIl(-320820451, var1 ^ -417694494), IIllIl(-320820452, var1 ^ -2066845841))), 50.0, 1.0, 100.0, 1.0)
            .lIlI(this::IIIlII)
      );
      this.IllIl = new IlIIIllll();
      this.IIlll = -1;
      this.IlllI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllII(IIllIl(-320820453, var1 ^ -603167506), IIllIl(-320820454, var1 ^ -2013643195))), true));
      this.IIllI = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIllII(IIllIl(-320820455, var1 ^ -2082239879), IIllIl(-320820456, var1 ^ -1463358146))), 25.0, 50.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(IIllII(IIllIl(-320820457, var1 ^ -499059426), IIllIl(-320820458, var1 ^ -634888567))))
      );
      this.III = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIllII(IIllIl(-320820459, var1 ^ 1613356663), IIllIl(-320820460, var1 ^ 1779312600))), 55.0, 60.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(IIllII(IIllIl(-320820461, var1 ^ 1218731814), IIllIl(-320820462, var1 ^ -837694903))))
            .lIlI(llIIII::Illll)
      );
      this.IlIIl = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIllII(IIllIl(-320820463, var1 ^ -101423590), IIllIl(-320820464, var1 ^ 1949577886))), 10.0, 25.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(IIllII(IIllIl(-320820465, var1 ^ -250974726), IIllIl(-320820466, var1 ^ 1588658278))))
            .lIlI(llIIII::lIlIl)
      );
      this.IlII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllII(IIllIl(-320820467, var1 ^ 1017278082), IIllIl(-320820468, var1 ^ -1268379534))), false));
      this.lIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllII(IIllIl(-320820469, var1 ^ -1134359024), IIllIl(-320820470, var1 ^ 1935455601))), true));
      this.II = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllII(IIllIl(-320820471, var1 ^ -1469904651), IIllIl(-320820472, var1 ^ 1856655315))), true));
      this.IIlII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllII(IIllIl(-320820473, var1 ^ 307068269), IIllIl(-320820474, var1 ^ 259218447))), true));
      this.Illl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllII(IIllIl(-320820475, var1 ^ -1406070029), IIllIl(-320820476, var1 ^ 1847547320))), true));
      this.IlIII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllII(IIllIl(-320820477, var1 ^ -1194535949), IIllIl(-320820478, var1 ^ -993930919))), true));
      this.IIlIl = new HashMap<>();
      this.llI = IIllIl(-320820479, var1 ^ -780480963);
      this.I = IIllIl(-320820480, var1 ^ 733102213);
      this.lll = IIllIl(-320820417, var1 ^ 1357101746);
      this.llIl = IIllIl(-320820418, var1 ^ -1968349695);
      this.lIlI = IIllIl(-320820419, var1 ^ 1615437731);
      this.IIIII.lIlI(this.IIIIl::IllI);
      this.IlllI.lIlI(this.IIIIl::IllI);
   }

   private void IIIII(class_310 var1, class_2338 var2) {
      if (!this.IllII(var1, var2)) {
         this.IIII = null;
      } else {
         class_243 var3 = class_243.method_24953(var2);
         float[] var4 = IlllIlII.lIII(var1, var3);
         if (var4 != null) {
            boolean var5;
            if (this.IIIII.IllI() == lIIlIlII.Il) {
               this.lIIl = true;
               this.lIlI = var1.field_1724.field_6012 + 2;
               var5 = IlllIlII.IlII(var1, IIllIl(-320820420, 1181398152 ^ 1908638402), var4[0], var4[1], this::IIIlI);
            } else if (this.IIIII.IllI() == lIIlIlII.II) {
               this.IllII = var2;
               this.Illll = true;
               this.IIIlI = true;
               this.IllI = System.currentTimeMillis();
               var5 = true;
            } else {
               this.lIIl = true;
               this.lIlI = var1.field_1724.field_6012 + 2;
               var5 = IlllIlII.IlII(var1, IIllIl(-320820421, 1181398152 ^ 1725995925), var4[0], var4[1], this::IllI);
            }

            if (!var5) {
               this.lIIl = false;
               this.lIlI = IIllIl(-320820422, 1181398152 ^ 481835657);
            }
         }
      }
   }

   private class_2338 IIIIl(class_310 var1) {
      class_2338 var2 = var1.field_1724.method_24515();
      class_2338 var3 = null;
      double var4 = Double.MAX_VALUE;

      for (int var6 = IIllIl(-320820423, -1139983144 ^ 193751566); var6 <= 2; var6++) {
         for (int var7 = IIllIl(-320820424, -1139983144 ^ -112248964); var7 <= 4; var7++) {
            for (int var8 = IIllIl(-320820425, -1139983144 ^ -252094812); var8 <= 4; var8++) {
               class_2338 var9 = var2.method_10069(var7, var6, var8);
               if (this.IllII(var1, var9)) {
                  double var10 = var1.field_1724.method_33571().method_1025(class_243.method_24953(var9));
                  if (var10 < var4) {
                     var4 = var10;
                     var3 = var9.method_10062();
                  }
               }
            }
         }
      }

      return var3;
   }

   private boolean IIIlI(class_310 var1, class_2338 var2, class_243 var3) {
      return this.Il(var1, var2, var3);
   }

   private static int IIIll(Illlllll var0) {
      return var0.Il().II;
   }

   private void IIlII(class_310 var1, int var2) {
      if (this.IllIl(var1) && var2 >= 0 && var2 < IIllIl(-320820426, 432520078 ^ -942434908)) {
         k74.x.IIll.llIllI(var1, this, var2);
      }

      this.Ill = null;
   }

   private void IIllI(class_310 var1) {
      int var9 = 1783393338;
      String[] var10000 = IIllllIl.IIIIl();
      this.ll(var1);
      String[] var2 = var10000;
      if (this.IIIlI) {
         if (this.Illll) {
            if (this.IllII == null) {
               this.IIIlI = false;
               return;
            }

            boolean var10 = this.IlII(var1, this.IllII);
            float var12 = var10 ? 0.0F : this.IllIl.llllII(var1, class_243.method_24953(this.IllII), this.IlI.IllI().floatValue());
            if (var10 || var12 <= 0.5F || System.currentTimeMillis() - this.IllI >= 1500L) {
               this.IIIlI = false;
               float[] var14 = var10
                  ? new float[]{var1.field_1724.method_36454(), var1.field_1724.method_36455()}
                  : IlllIlII.lIII(var1, class_243.method_24953(this.IllII));
               boolean var16 = false;
               if (var14 != null) {
                  this.lIIl = true;
                  this.lIlI = var1.field_1724.field_6012 + 2;
                  var16 = IlllIlII.IlII(var1, IIllIl(-320820427, var9 ^ 1919165516), var14[0], var14[1], this::IIlll);
               }

               if (!var16) {
                  this.lIIl = false;
                  this.lIlI = IIllIl(-320820428, var9 ^ 1888144264);
               }
            }

            if (var2 == null) {
               return;
            }
         }

         if (this.lII == null) {
            this.IIIlI = false;
         } else {
            boolean var11 = this.lIIIl(var1, this.lII);
            float var13 = var11 ? 0.0F : this.IllIl.IIIllII(var1, this.IIIIIl(this.lII), this.IlI.IllI().floatValue());
            if (var11 || var13 <= 0.5F || System.currentTimeMillis() - this.IllI >= 1500L) {
               this.IIIlI = false;
               float[] var15 = var11 ? new float[]{var1.field_1724.method_36454(), var1.field_1724.method_36455()} : IlllIlII.lIII(var1, this.lII.l());
               boolean var17 = false;
               if (var15 != null) {
                  this.IIl = true;
                  this.llIl = var1.field_1724.field_6012 + 2;
                  var17 = IlllIlII.IlII(var1, IIllIl(-320820429, var9 ^ -1165471226), var15[0], var15[1], this::lIlI);
               }

               if (!var17) {
                  this.IIl = false;
                  this.llIl = IIllIl(-320820430, var9 ^ -864190194);
               }
            }
         }
      } else if (!this.IIl && !this.lIIl) {
         if (this.IIII != null) {
            if (var1.field_1687.method_8320(this.IIII).method_27852(class_2246.field_10443)) {
               if (!this.llII(this.IIII)) {
                  return;
               }

               this.IIIII(var1, this.IIII);
               return;
            }

            this.IIII = null;
            this.lIII = null;
            this.IIIll = 0L;
         }

         class_2338 var3 = this.IIIIl(var1);
         if (var3 != null) {
            this.IIII = var3;
            if (this.llII(var3)) {
               this.IIIII(var1, var3);
            }
         } else if (this.IlllI.IllI()) {
            int var4 = this.lllI(var1.field_1724);
            lIlII var5 = this.IIIlIl(var1);
            if (var4 >= 0 && var5 != null) {
               int var6 = this.Ill != null ? this.Ill.l() : k74.x.IIll.IIlII(var1.field_1724.method_31548());
               if (this.lI(var1, var4)) {
                  if (this.llII(var5.II())) {
                     float[] var7 = IlllIlII.lIII(var1, var5.l());
                     if (var7 == null) {
                        this.IIlII(var1, var6);
                     } else {
                        boolean var8;
                        label192: {
                           if (this.IIIII.IllI() == lIIlIlII.Il) {
                              this.IIl = true;
                              this.llIl = var1.field_1724.field_6012 + 2;
                              var8 = IlllIlII.IlII(var1, IIllIl(-320820431, var9 ^ 1766901087), var7[0], var7[1], this::IIlI);
                              if (var2 == null) {
                                 break label192;
                              }
                           }

                           if (this.IIIII.IllI() == lIIlIlII.II) {
                              this.lII = var5;
                              this.IIlll = var6;
                              this.Illll = false;
                              this.IIIlI = true;
                              this.IllI = System.currentTimeMillis();
                              var8 = true;
                              if (var2 == null) {
                                 break label192;
                              }
                           }

                           this.IIl = true;
                           this.llIl = var1.field_1724.field_6012 + 2;
                           var8 = IlllIlII.IlII(var1, IIllIl(-320820432, var9 ^ -959461796), var7[0], var7[1], this::IIIIII);
                        }

                        if (!var8) {
                           this.IIl = false;
                           this.llIl = IIllIl(-320820433, var9 ^ 1770585048);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean IIlll(class_310 var1) {
      return this.Il(var1, this.IllII, class_243.method_24953(this.IllII));
   }

   private boolean IllII(class_310 var1, class_2338 var2) {
      if (this.IllIl(var1) && var2 != null && var1.field_1687.method_8320(var2).method_27852(class_2246.field_10443)) {
         class_243 var3 = class_243.method_24953(var2);
         return this.IIlIlI(var1.field_1724, var3) && this.I(var1, var3, var2);
      } else {
         return false;
      }
   }

   private boolean IllIl(class_310 var1) {
      return var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null;
   }

   private static String IlllI(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   private static boolean Illll() {
      return false;
   }

   private double lIIII(class_1799 var1) {
      class_9304 var2 = (class_9304)var1.method_58695(class_9334.field_49633, class_9304.field_49385);
      double var3 = 0.0;

      for (class_6880 var6 : var2.method_57534()) {
         String var7 = var6.method_40230().map(llIIII::IlllI).orElse("");
         int var8 = var2.method_57536(var6);
         var3 += var8 * this.llIlI(var7);
      }

      return var3;
   }

   private boolean lIIIl(class_310 var1, lIlII var2) {
      return IlllIlII.IIlIlI(var1, this.IIIIIl(var2));
   }

   private boolean lIIlI(class_310 var1, class_2338 var2) {
      if (this.IllIl(var1) && var2 != null) {
         class_2680 var3 = var1.field_1687.method_8320(var2);
         class_2338 var4 = var2.method_10074();
         class_2680 var5 = var1.field_1687.method_8320(var4);
         return (var3.method_26215() || var3.method_45474())
            && !this.II(var1.field_1724, var2)
            && var5 != null
            && !var5.method_26215()
            && var5.method_26227().method_15769()
            && !var5.method_26220(var1.field_1687, var4).method_1110();
      } else {
         return false;
      }
   }

   private boolean lIIll(class_1799 var1) {
      return this.llIII(var1) != null;
   }

   private void lIlII() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.field_1724 != null) {
         k74.x.IIll.lllIl(var1, this, lllIII.II);
      }

      this.IIIIlI();
      this.IIII = null;
      this.lIII = null;
      this.IIIll = 0L;
      this.lll = IIllIl(-320820434, -878226045 ^ 1177665898);
      this.IIl = false;
      this.llIl = IIllIl(-320820435, -878226045 ^ 1095647871);
      this.lIIl = false;
      this.lIlI = IIllIl(-320820436, -878226045 ^ -1467784171);
      this.lIll = false;
      this.IIIlI = false;
      this.Ill = null;
   }

   private static boolean lIlIl() {
      return false;
   }

   private double lIllI(class_1799 var1, lIlllIlI var2) {
      if (!var2.III) {
         return 0.0;
      } else {
         double var3 = this.llIIl(var1) + this.IIIl(var1) + this.lIIII(var1) + this.IIIIll(var1);
         if (var2 == lIlllIlI.Il) {
            if (var1.method_57380().method_57845(class_9334.field_49637) != null) {
               var3 += 180.0;
            }

            if (var1.method_57380().method_57845(class_9334.field_54199) != null) {
               var3 += 140.0;
            }

            var3 += Math.min(IIllIl(-320820437, 95591344 ^ -14091748), var1.method_7947());
         }

         return var3;
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean lIlll(class_310 var1, lIlII var2, int var3) {
      boolean var4 = false;
      boolean var9 = false /* VF: Semaphore variable */;

      boolean var12;
      label68: {
         boolean var13;
         label67: {
            try {
               var9 = true;
               if (!this.IllIl(var1) || !this.lIIlI(var1, var2.II())) {
                  var12 = false;
                  var9 = false;
                  break label68;
               }

               k74.x.IIll.IlIll(var1);
               class_1269 var5 = k74.x.IIll.IlIIIl(var1, class_1268.field_5808, this.IIIIIl(var2));
               var4 = var5 != null && var5.method_23665();
               if (var4) {
                  this.IIII = var2.II();
                  this.lll = var1.field_1724.field_6012 + 2;
                  var13 = true;
                  var9 = false;
                  break label67;
               }

               var13 = false;
               var9 = false;
            } finally {
               if (var9) {
                  this.IIl = false;
                  this.llIl = IIllIl(-320820441, 1079097334 ^ -286661919);
                  this.Ill();
                  this.IIlII(var1, var3);
               }
            }

            this.IIl = false;
            this.llIl = IIllIl(-320820440, 1079097334 ^ 147071784);
            this.Ill();
            this.IIlII(var1, var3);
            return var13;
         }

         this.IIl = false;
         this.llIl = IIllIl(-320820439, 1079097334 ^ 60490716);
         this.Ill();
         this.IIlII(var1, var3);
         return var13;
      }

      this.IIl = false;
      this.llIl = IIllIl(-320820438, 1079097334 ^ 1125186802);
      this.Ill();
      this.IIlII(var1, var3);
      return var12;
   }

   private lIlllIlI llIII(class_1799 var1) {
      if (var1 == null || var1.method_7960()) {
         return null;
      } else if (this.IIll(var1)) {
         return !this.Illl.IllI() && (!this.II.IllI() || !this.IIII(var1)) ? null : lIlllIlI.lI;
      } else if (this.IIlIll(var1)) {
         return this.IlIII.IllI() || this.II.IllI() && this.IIII(var1) ? lIlllIlI.l : null;
      } else if ((this.IIlII.IllI() || this.IlII.IllI()) && this.IIIlll(var1)) {
         return lIlllIlI.IIl;
      } else if (this.lIl.IllI() && this.lIIl(var1)) {
         return lIlllIlI.ll;
      } else {
         return this.II.IllI() && this.IIII(var1) ? lIlllIlI.Il : null;
      }
   }

   private double llIIl(class_1799 var1) {
      int var3 = -2084873061;
      String var2 = class_7923.field_41178.method_10221(var1.method_7909()).method_12832();
      if (var2.startsWith(IlIIllIII.lI(IIllII(IIllIl(-320820442, var3 ^ -1655749141), IIllIl(-320820443, var3 ^ -966461640))))) {
         return 700.0;
      } else if (var2.startsWith(IlIIllIII.lI(IIllII(IIllIl(-320820444, var3 ^ 465519626), IIllIl(-320820445, var3 ^ -642673367))))) {
         return 600.0;
      } else if (var2.startsWith(IlIIllIII.lI(IIllII(IIllIl(-320820446, var3 ^ 1790590318), IIllIl(-320820447, var3 ^ -1024523754))))) {
         return 500.0;
      } else if (var2.startsWith(IlIIllIII.lI(IIllII(IIllIl(-320820448, var3 ^ -812845667), IIllIl(-320820257, var3 ^ -2076008936))))) {
         return 440.0;
      } else if (var2.startsWith(IlIIllIII.lI(IIllII(IIllIl(-320820258, var3 ^ 245095245), IIllIl(-320820259, var3 ^ -98814137))))) {
         return 420.0;
      } else if (var2.startsWith(IlIIllIII.lI(IIllII(IIllIl(-320820260, var3 ^ -416556438), IIllIl(-320820261, var3 ^ 752284491))))) {
         return 350.0;
      } else if (var2.startsWith(IlIIllIII.lI(IIllII(IIllIl(-320820262, var3 ^ 336461428), IIllIl(-320820263, var3 ^ 256907265))))) {
         return 310.0;
      } else if (var2.startsWith(IlIIllIII.lI(IIllII(IIllIl(-320820264, var3 ^ -718266588), IIllIl(-320820265, var3 ^ 1308816049))))) {
         return 220.0;
      } else {
         return var2.startsWith(IlIIllIII.lI(IIllII(IIllIl(-320820266, var3 ^ 556951070), IIllIl(-320820267, var3 ^ -1345142499)))) ? 180.0 : 300.0;
      }
   }

   private double llIlI(String var1) {
      int var2 = 637238594;
      if (var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820268, var2 ^ -1260714686), IIllIl(-320820269, var2 ^ 1339268746))))) {
         return 36.0;
      } else if (var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820270, var2 ^ -1634436410), IIllIl(-320820271, var2 ^ 1128230736))))) {
         return 22.0;
      } else if (var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820272, var2 ^ 1498626097), IIllIl(-320820273, var2 ^ -2070190119))))) {
         return 26.0;
      } else if (var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820274, var2 ^ -1678908963), IIllIl(-320820275, var2 ^ -1875125460))))
         || var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820276, var2 ^ -1660527729), IIllIl(-320820277, var2 ^ 885787597))))
         || var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820278, var2 ^ 711190826), IIllIl(-320820279, var2 ^ -1474004338))))) {
         return 24.0;
      } else if (var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820280, var2 ^ -1623916498), IIllIl(-320820281, var2 ^ -1742507666))))
         || var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820282, var2 ^ -699977470), IIllIl(-320820283, var2 ^ 793788960))))
         || var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820284, var2 ^ 328992964), IIllIl(-320820285, var2 ^ -1406825836))))
         || var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820286, var2 ^ -1769474886), IIllIl(-320820287, var2 ^ 1870128942))))) {
         return 20.0;
      } else {
         return !var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820288, var2 ^ -1037258188), IIllIl(-320820225, var2 ^ -7061392))))
               && !var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820226, var2 ^ -1409651466), IIllIl(-320820227, var2 ^ 905946957))))
               && !var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820228, var2 ^ -1434427551), IIllIl(-320820229, var2 ^ 259268738))))
               && !var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820230, var2 ^ -1210191567), IIllIl(-320820231, var2 ^ -1963945341))))
               && !var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820232, var2 ^ -883799363), IIllIl(-320820233, var2 ^ 1669847894))))
               && !var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820234, var2 ^ 432892791), IIllIl(-320820235, var2 ^ 663980502))))
               && !var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820236, var2 ^ -262065011), IIllIl(-320820237, var2 ^ 131555360))))
               && !var1.equals(IlIIllIII.lI(IIllII(IIllIl(-320820238, var2 ^ -1327294700), IIllIl(-320820239, var2 ^ -1619334274))))
            ? 8.0
            : 14.0;
      }
   }

   private void llIll(class_310 var1) {
      if (!this.IIlIl.isEmpty()) {
         this.I = IIllIl(-320820240, 1998373094 ^ 746856224);
      } else if (this.I == IIllIl(-320820241, 1998373094 ^ 589986091)) {
         this.I = var1.field_1724.field_6012;
      } else {
         if (var1.field_1724.field_6012 - this.I >= 2) {
            var1.field_1724.method_7346();
            var1.method_1507(null);
            this.IIIIlI();
         }
      }
   }

   private static int lllII(Illlllll var0, Illlllll var1) {
      return var0.Il().III ? Double.compare(var1.l(), var0.l()) : 0;
   }

   private int lllIl(lIlllIl var1) {
      return Math.max(0, (int)Math.ceil(this.IIIllI(var1) / 50.0));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 820023242;
      String[] var10000 = new String[2];
      int var11 = 0;
      String[] var9 = var10000;
      int var10 = 0;
      short var12 = 19221;
      int var8 = "\u0379觸닟칺銑謻늿諅鋇鉲늺觀ኯ谂\uf383貛銻觵튦襲Ꭶ言ኳ칊犘캓\uf2c3諕튫鄲뎣谸狞춪鋾衃玦銭助쿚劾諠ዊ譢銑襃㊮袵厷캂㋟郸劫쿚펁衋ኬ쀍\uf2df銚㎦초\uf2a1캲닪谓劻鄕\uf2cb袚㊻谰님캚ኑ춃펞츽玷郊玪诐Ꮉ츺닩豣劼貕\u12b6覲닑谘\uf2ab鞲㊓讃닝讍鎱칒銥캰㊬춊㎀銳틂郕닀츪銳諀㎵谂ኙ霣㋝誝狂袂\uf2c8襐ኳ訚틾讋㎧讍펽쀊玕谘Ꮌ銪\uf2fe袣ኬ靭犯銊銥쿐뎷鉲銄춣鋅讵펳霊\uf3a1讠튬询玎쿃犻칽ኴ观劲需\uf2ae췺犟覣\u12bf覥እ쀪犽鉘늨銢㊚郋ኲ袭狙讲銰諸㋊覢勷춛㊶쀭ዘ襒犲雘Ꮀ칢펂觓ኻ谭ኪ靺늧춘ዊ쳲㎀鞛勅都\uf384襲厢雨銲谢鋨靻厧襝劢鄂\uf2df譸玶讒닯霫銮靥玲覚틋鄰늫캊\uf299衋Ꭻ鞕劢襒늽촘劤춪틾覫势鄽㋙貒鎯췐닉諊銒鄣犳貝㊥衪銺쀸鎺鉒㊅襳犵霕틎靲厬襀犭貪뎀訳狂鄅鋍靂\uf2be誀銤謒ዾ쳛銮袥펷삪튻츘犱袪ኜ靓뎧캵銵襲鋜觸勀诒\uf2f0謣犰諭펄鞒犰쳠\uf3b9袢玀촋ኮ鉍动襒厯譈鎰雚㊘谳勀雥\uf2b6诺뎭衘鋝面\uf29f靃厦雍ኴ쳂募謸\uf2b3謚率觃劳该틍霒玪譠ኳ譊㊟襓鎪靅튨袢狖襘厵캒劄銃튱캥銫鄚玕誀劯訲犓譛Ꭶ衅鋚鉪늧貀鋊變厇霣\uf3a4雍ው襪늳치\uf2ab칂㊛霣銬訽뎷춂펭譸\u12c7銢勪觫\uf2b0靍㎱쵢ኳ谸玻쵪王칃늯鉭ኪ论玕쳈鎺衂뎴譛\u12b1雽劦쀚틜诈\uf2ab面厇촣㋚銭ካ郂銧鉀鋊鉺鋰鉋㎫쀽狟쿺玪촘ኮ칚늓袃勔춽犪衲뎯銈玶칒늓캳틚鉵\uf2a3謚튲襘鋝襚ዾ電ኼ訕닇询튽츐厷칪銓靳勚쀕銴說\uf2b3襀\uf3bb誚犙칻勅訽\uf2ce診銤谸劫촂\uf291谻틀誝ኴ鞪狑醀\uf2b2쿢ኄ鏫厡쵅Ꮇ论玢쀠鋘襂厁銣늵鞭厱訲㎕칠銭췊뎃鞃닚諵努霂ኰ캰늯鉊뎁郣鎭雵늩袂튥需劬쀪厍쵻劵襅狂诂厭鉨㊦郲銖鉻㊮축犵離玣춀펼쳲銄衛닝鞭銢쀒\uf2b7쀠劢캂銜쳫㎧谅犵謚劤衸Ꮊ衒ᎎ쿛ኮ쀕㊣訂劺칰펃谪鎴谳㊵諥ኬ谊튤诈㊬诒犞鉫틀语ኴ襊뎪袸㊬췒鎋츣늯襅㎼쳒늲譠㊦訢㊄郋튿캭\uf2aa謒\uf2c9캈튳謺ኑ쿻뎦츥勎雲㊾칈㊫諲犘쵓뎭覅㋚询厭谸ክ谢ዷ雓玤쵍튫醪ዉ郰犦豢ኑ雋펩춵ዚ谢ኧ豘狟춺㊄貃ዅ讍劵谂펢谘Ꮀ霪狷读ኹ话\uf2a6칲銥郐튨鉊厍襳狂霕닚豪늤靰늭襂狪촣玫췽\uf2da칂\uf3a3쀈㎹谪ኑ謣ኻ쿍틘露銥謈㎰츊ዪ覛銶讕厳譲㋑靠늢谂펇쳃늸칝Ꮀ雊\uf2da貨銳襊㎎쳳劮袽厽諚銥췰ኢ銲狪襓犮霕鋟谢劷쀠\uf2a8謺뎎츃犱霭펻謢㎬쳠ኳ覒늛袓ኻ雅뎲霊勖襘鎴貒ᎁ쳻㋅霕鋍鞪ኳ覨銨譒튒豻ኮ鞵銴袺鎭銈鋟覲玴츛ኬ雅튵캪銤谸鎃貲\uf298촻\uf2b9칅튢觚Ꭿ衠鎷親銄鉛\uf2b9쳝㊣諺厡霈劥銲狩貳玞谥募쿺ኴ雐㎻諪펎鏫늼캅펽銊銰쀨犨鉚\uf2ef霻㎡츝\uf2a9쵂Ꭽ襨㊳誚厴쀳犬觥狂춚\u12b7谘玵칺\uf292註㎩谵动諒\u001d\uf461睏ﻛ睡\uf5c2흈\uf62c闭\uf503띌\uf5c9坁\uf48b띫＊\uf74f\uf29c\uf753\uf15bᝒ\uf441圣\uf043\uf749媲띄\uf5fc\u175b\uf4a3"
         .length();
      String var7 = "\u0379觸닟칺銑謻늿諅鋇鉲늺觀ኯ谂\uf383貛銻觵튦襲Ꭶ言ኳ칊犘캓\uf2c3諕튫鄲뎣谸狞춪鋾衃玦銭助쿚劾諠ዊ譢銑襃㊮袵厷캂㋟郸劫쿚펁衋ኬ쀍\uf2df銚㎦초\uf2a1캲닪谓劻鄕\uf2cb袚㊻谰님캚ኑ춃펞츽玷郊玪诐Ꮉ츺닩豣劼貕\u12b6覲닑谘\uf2ab鞲㊓讃닝讍鎱칒銥캰㊬춊㎀銳틂郕닀츪銳諀㎵谂ኙ霣㋝誝狂袂\uf2c8襐ኳ訚틾讋㎧讍펽쀊玕谘Ꮌ銪\uf2fe袣ኬ靭犯銊銥쿐뎷鉲銄춣鋅讵펳霊\uf3a1讠튬询玎쿃犻칽ኴ观劲需\uf2ae췺犟覣\u12bf覥እ쀪犽鉘늨銢㊚郋ኲ袭狙讲銰諸㋊覢勷춛㊶쀭ዘ襒犲雘Ꮀ칢펂觓ኻ谭ኪ靺늧춘ዊ쳲㎀鞛勅都\uf384襲厢雨銲谢鋨靻厧襝劢鄂\uf2df譸玶讒닯霫銮靥玲覚틋鄰늫캊\uf299衋Ꭻ鞕劢襒늽촘劤춪틾覫势鄽㋙貒鎯췐닉諊銒鄣犳貝㊥衪銺쀸鎺鉒㊅襳犵霕틎靲厬襀犭貪뎀訳狂鄅鋍靂\uf2be誀銤謒ዾ쳛銮袥펷삪튻츘犱袪ኜ靓뎧캵銵襲鋜觸勀诒\uf2f0謣犰諭펄鞒犰쳠\uf3b9袢玀촋ኮ鉍动襒厯譈鎰雚㊘谳勀雥\uf2b6诺뎭衘鋝面\uf29f靃厦雍ኴ쳂募謸\uf2b3謚率觃劳该틍霒玪譠ኳ譊㊟襓鎪靅튨袢狖襘厵캒劄銃튱캥銫鄚玕誀劯訲犓譛Ꭶ衅鋚鉪늧貀鋊變厇霣\uf3a4雍ው襪늳치\uf2ab칂㊛霣銬訽뎷춂펭譸\u12c7銢勪觫\uf2b0靍㎱쵢ኳ谸玻쵪王칃늯鉭ኪ论玕쳈鎺衂뎴譛\u12b1雽劦쀚틜诈\uf2ab面厇촣㋚銭ካ郂銧鉀鋊鉺鋰鉋㎫쀽狟쿺玪촘ኮ칚늓袃勔춽犪衲뎯銈玶칒늓캳틚鉵\uf2a3謚튲襘鋝襚ዾ電ኼ訕닇询튽츐厷칪銓靳勚쀕銴說\uf2b3襀\uf3bb誚犙칻勅訽\uf2ce診銤谸劫촂\uf291谻틀誝ኴ鞪狑醀\uf2b2쿢ኄ鏫厡쵅Ꮇ论玢쀠鋘襂厁銣늵鞭厱訲㎕칠銭췊뎃鞃닚諵努霂ኰ캰늯鉊뎁郣鎭雵늩袂튥需劬쀪厍쵻劵襅狂诂厭鉨㊦郲銖鉻㊮축犵離玣춀펼쳲銄衛닝鞭銢쀒\uf2b7쀠劢캂銜쳫㎧谅犵謚劤衸Ꮊ衒ᎎ쿛ኮ쀕㊣訂劺칰펃谪鎴谳㊵諥ኬ谊튤诈㊬诒犞鉫틀语ኴ襊뎪袸㊬췒鎋츣늯襅㎼쳒늲譠㊦訢㊄郋튿캭\uf2aa謒\uf2c9캈튳謺ኑ쿻뎦츥勎雲㊾칈㊫諲犘쵓뎭覅㋚询厭谸ክ谢ዷ雓玤쵍튫醪ዉ郰犦豢ኑ雋펩춵ዚ谢ኧ豘狟춺㊄貃ዅ讍劵谂펢谘Ꮀ霪狷读ኹ话\uf2a6칲銥郐튨鉊厍襳狂霕닚豪늤靰늭襂狪촣玫췽\uf2da칂\uf3a3쀈㎹谪ኑ謣ኻ쿍틘露銥謈㎰츊ዪ覛銶讕厳譲㋑靠늢谂펇쳃늸칝Ꮀ雊\uf2da貨銳襊㎎쳳劮袽厽諚銥췰ኢ銲狪襓犮霕鋟谢劷쀠\uf2a8謺뎎츃犱霭펻謢㎬쳠ኳ覒늛袓ኻ雅뎲霊勖襘鎴貒ᎁ쳻㋅霕鋍鞪ኳ覨銨譒튒豻ኮ鞵銴袺鎭銈鋟覲玴츛ኬ雅튵캪銤谸鎃貲\uf298촻\uf2b9칅튢觚Ꭿ衠鎷親銄鉛\uf2b9쳝㊣諺厡霈劥銲狩貳玞谥募쿺ኴ雐㎻諪펎鏫늼캅펽銊銰쀨犨鉚\uf2ef霻㎡츝\uf2a9쵂Ꭽ襨㊳誚厴쀳犬觥狂춚\u12b7谘玵칺\uf292註㎩谵动諒\u001d\uf461睏ﻛ睡\uf5c2흈\uf62c闭\uf503띌\uf5c9坁\uf48b띫＊\uf74f\uf29c\uf753\uf15bᝒ\uf441圣\uf043\uf749媲띄\uf5fc\u175b\uf4a3";

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 156;
               case 1 -> 129;
               case 2 -> 134;
               case 3 -> 182;
               case 4 -> 151;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 3 | var16 << 13) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 3 | var16 >>> 13) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      lIIIl = var9;
      lIIlI = new Object[var9.length];
      byte var22 = 0;
      int var10001 = 0;
      byte[] var10002 = "wå¹ßöÅË\u0097L·óû\u0083FGkW\u0097\r\u0010©\u0080çLÉ\u000e\fþ1\u008bÔ\u0092NÇ;2[\u008c\u0099E\rÈ\u000b|Eû\u008e\u0005@d¨Ïî\u001es\\É3í\u0014IàZê°\u008f\u009ac Áýþm\u0016\u0007\u0001\u007fdZêÏ®\u001fÔ\u0086\u007fÌE½h\bo\u0019\u008eWi¾T\u0004\u0001åüúÆ\u0016ÇÆK¯¡s#8©¢*2\u00815\u0010¢\u0003¾\u009fP8èC\u008a½\u0086\u008aþVöôñ>Ð«\u0091\u008cÊû`\u0096\u0013\u009fM\tÊ§\u0003}ÿAÌQ¿õ\u0005aw\u000e|\u0089#ötJ\u001f\"\u0099ñjâæ\\À:i\u0099ÝÇzyÌYÝ?u\u0001\u008aÃ¢¹½\u001c.vÑó\u0019·,ô*¼M!.fcNQ±±Ä\b+\u0019 Ò\tjuØ\u009a*\u0001 \u0093£{à:\u00adÄSéÔ,}C?á\u00ad\u00804Cï\u008bÒÍ{ß\u0096\u0005=÷5\u000fñ}yy\u001e\u0014\u001a\u00ad\u001bãBo\u0006,\u0019\u0099GN\u001d\u0080è¸6¥u]|#\u00976DKÉâþJ¼\u0092ôlgÅÖÇ=ÁPq\u001b\u0013g\u0097\u0004¯êW\u0083\u0085oi\u000f\u0001ÀÑÑ ¢Á\fx*\u0005¯¯\"\u0000l\u001eí?\u0010\u009d6\u0000j\tðÉð\u0002\u008c.\u001f\u0084\u0091\u0013n\u001b2RpÊð\u007f\u009eñ&¯±+Z¢ugÏ\u0019NÜ5ÑÀeN\u0080:m\u0094ÎÞß~*\u001f~\bè0<\u001fË)lå\u0093\u0089l\u0088ÀQºz\u0003\fÇsµm\u0010áU)°'iN\t¥\u0087 Ñï\u00858E\u0019pêQ<]¯\u001e\u0093Â¬\u001c¼\u0085\u0090\u009a2×\u0093\u00905¨\u0010\u0086Üe6íÅÛf\u0010¼\u0000Lyü\u008b³T÷Ô\u0093¡\u0011ùRg!µüöz\u009e\u0084*§Eý¢eKÏ\tÖ@\u0084g~\u0015¢ÛsvL~8»\u0087\u0099²ab±Fæìµ[ÑcG\u0090,G\u0095¨÷G\u0089³ª°¾iÊ¦Òòû\u001a\u0006\u009dÈßð\u0013(tÔ®a\u009dÀUh)&\u0084.âFY\u0085çJCé \u0007\u009e!\u0090§\u0081Wyî\u008a\u0081\u0093c\u0087¼Ã£.w\u009c\t0Ùq\u0004²\u009e+ô\u0085\u008f\u0098+\u0082\u009a¼üÌý©85êÊ¸\t&\u0090Ï¶\u009fn\u0094\u008c=l{uÍ°ôØ\u0096*\få/ãà±@ô\u0011/D\u001c0°:Çk\u0015ÎZ³\u00adgi?\u0090Jr`ÑèÒAy=×²\u0003wó\u009e=)m\u009aêÛ¬\u0083\u001dlÈfªY\u008f²\u0085Àè¥äÙØaëw¾u/ë¥Òÿ,Ã\u001e9I\u0004§Ð\u0095p0\u0092°ìæM\u0085Qò)òRotÞ4\n¬\u0018Ü\nµ\u008béµnÅ²]©%ó\tN¼ïf\u0014p#ø\u009eV¶i*º®G«$\u008e,Áæ4møÆ\u0088Ã?pßÐr\u0012\nZ\u009cÆßE° k\u0007ãÐpÖ:ÐE\u0080\u0004\u0018b\u0012\u0083ÀÒ?Ëä\t#ÐÔ\u0096\t\u009eGÓª\u0084£9\u0081D\u008eC¸Xù1`&\u0006p¹ßh#\u0088\u00938bÌN\u0094,Ì¼L×^\u008e±/\u000e«¹Êk®µûxe âøÀNÆ¡7ô\u0012:Î<]\u0003\u0085Ú3&üÇíì)»°Öá¾\u0018\u0088ó\u00adð\u0017;:l¦3çÛ¸pÅÑ<³<=çÂ\u0017¦\u00046\u0090\u009c\u0093¶«-9Q\nª#kêU\u0083L\u0084n\u0082>\u0098ÀÕ\u00146«3U\u0092ªì_\u0000§\u0011|»vûÜ`f\u008d_tp0c\u0089¦Ù\u001ePT\u001a\u0000X\u0017C÷á3ä\u0017:\u0000Yñ\u009b\u0013ÊsÏe\u009c%\u001c¼01\"äÝ÷Á\u0002^\u0085{\u00983%ÁòðÚ\u000fFäß6Þ\u0010\u007f\u0002÷~\u001f÷ç¨BÆÍÉ\u0083Èx1wTÕ\u001eð£/÷\u000e°¨Z\u0081K%Ö\u00079V1\u009fÆMZWcCÌóô|n\u0001\u009d:·,»£V\u0087kZ8R¼%\u0011Y]\u001e¸\u0007\u0094ÄûvivÃµj¥d×\u0095R\u009d\u0099Í\u0012A\u001fy×\u0013×b,Òg\u0011Õò\"m\u0087Ø\"£Å¶MMd\u0001,mÆ¹Øêý#\u0016¬>W\u009e\u0002u¡!\u0017õ)nr\u007fiùI\u0017êZ¤\u008bä\u00adfí\f\u0011½%Ö\u008f\u000bÜ\u0099J\u0017\u0092³¨F\u0085É¤Wß\u009fÕ¯\u001f Õ\u0018Á2ÇÞFùq<\u0013q&@r÷®B\u0098¶\u001bý\u001d¬·|ú5³îäEB\u000e\u00802JÖ\u0085ýÛV\u0086ÍýV\u0089\r\u0012\u009fUÓîæçÚ$¡Û\u0014\u0091¥¢§¤\u0085_\u00ad[\u0006æ¢Z±Æb\u0099_\u0018ù\u0093g\u0004q\u0012Îºü\u0019ä\u000e \u0096\u0080\u0093\tû\u009dXu'ÚÁ³\\\u00805§°¼\u0082\u0018?s\u0097U\u0011a¬ÐïQÒO G|û3T¨ì\u000e0§8\u0095rDÀæI=Ò²ø\tÂ^\"\u0003÷\u001f\n²=Ü2)W\u0010*\u00001Ýõ?},\u0090¯9\u0099ñ\u001d\u0016ç\u008cÎ\u001dÙ\u0082)Xy\u0002\u0084\u001dÖ¤\u0017\u0087\\ÄÄ\u0092úÝÀ2¥1\u008awöë\u008c\n\\Un¹Òâ\u0014V5|6%ÎÏçd1\u0004\u001cÑq\u0014ºîÃó\u000eD\u0090,tbj\u009cp³²¸LÖ\u0016Ûh\u008bæ\u0081?û\u008d\u0018%\u0018vBÞQxb¥~pôú\u008e\u0094Q×>Pª\u00856c#\u0090\u0015ÇN±@\u0098\u009efÓâ\u0003Ì&í\u009f\u0005o\f¥*Æ\u0083Zøµ¨\u009fë CØ@T\néÆs±/R9¬\u009a¿Jôbms\u0006qG\u009e*5é\u0016Q`Ñ\u009f@/Jì|ºçtW<F\u00805\u0085\u008cÆk\u0094H\u008a\u0080d\u001aj¼l\u00ad\u0006sTÒ8ÐGÒC¨«ylçÁq\u009bnc\u008b\u008e\u000b_ÅaIþÛ®Ô#\tG\u000b!\tF\u0017l\u0098taÊ®æ!|î8\u0082-\u0012\u0006±`\u0091\t3lðÊÂ\u0019ÅkEìÌEZ9§Wþ¢\u0094<ä\u0000Ý\u0006\u0014p×{\u0016:Á»\u009f\u0095\u009dWï\u0004££OÉÒøã@ë$¸¿=dÙ>\u00072MG\u008d(<*\u001c N0ñ\u009dÏL¥\u0004Ò\u0092\u008aìT4G~þ¿f\u0098\u0019\u008fí#rìÐíQÆëÕ}Êqþ\u0087¹tª\u007f¦\u009f\u009fHnÅqµ_µ¾¶íó.¯\nÔ\u0087!tÉ[i´l·Ä\u009a\u008aqí%×$ÉsLÞÄJî¢6\u008b\u0090EjÑ \u0019l\u001fåG9J\u0015K\b\u001dG\u0012ñ6Q\u0088LrÃC\u001b2S®c«ÞÀ"
         .getBytes("ISO-8859-1");
      lIIII = new int[454];

      int var55;
      do {
         lIIII[var22] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 744448210;
         var22 += 1;
         var55 = var10001 + 4;
         var10001 += 4;
      } while (var55 < var10002.length);

      String[] var5 = new String[IIllIl(-320820397, var17 ^ 1338319041)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIlllI((short)'\uea40', var17 ^ -1799640949, 21898)).length();
      int var1 = IIllIl(-320820398, var17 ^ -507511953);
      int var19 = -1;

      label99:
      while (true) {
         int var23 = IIllIl(-320820399, var17 ^ -963485011);
         String var27 = var2.substring(++var19, var19 + var1);
         byte var39 = -1;

         while (true) {
            label94: {
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
                     break label94;
                  }

                  var81 = var57;
                  var69 = var23;
                  var88 = var6;
               }

               while (true) {
                  var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % IIllIl(-320820403, var17 ^ 1656197076)) {
                     case 0 -> 1;
                     case 1 -> IIllIl(-320820404, var17 ^ 1892012780);
                     case 2 -> IIllIl(-320820405, var17 ^ -1072719986);
                     case 3 -> IIllIl(-320820406, var17 ^ -1981922357);
                     case 4 -> IIllIl(-320820407, var17 ^ -1295415319);
                     case 5 -> IIllIl(-320820408, var17 ^ 372236147);
                     default -> IIllIl(-320820409, var17 ^ -1309307896);
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
                  var5[var3++] = var62;
                  if ((var19 += var1) >= var4) {
                     llll = var5;
                     llII = new String[IIllIl(-320820402, var17 ^ 794850797)];
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var62;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label99;
                  }

                  var4 = (var2 = IIlllI((short)'ꆫ', var17 ^ 955886242, 21899)).length();
                  var1 = IIllIl(-320820400, var17 ^ 1178718939);
                  var19 = -1;
            }

            var23 = IIllIl(-320820401, var17 ^ -1087498798);
            var27 = var2.substring(++var19, var19 + var1);
            var39 = 0;
         }
      }
   }

   private void llllI(class_310 var1, class_1703 var2) {
      int var3 = var1.field_1724.field_6012;
      this.IIlIl.entrySet().removeIf(this::l);
   }

   private boolean lllll(class_310 var1) {
      return var1.field_1755 instanceof class_465 var2 && var2.method_17577() instanceof class_1707 var3 && var3.method_17388() == 3
         ? var2.method_25440().method_10851() instanceof class_2588 var7
            && IlIIllIII.lI(IIllII(IIllIl(-320820242, -504391313 ^ -247080487), IIllIl(-320820243, -504391313 ^ 562182498))).equals(var7.method_11022())
         : false;
   }

   private boolean IIIIII(class_310 var1, lIlII var2, int var3) {
      return this.lIlll(var1, var2, var3);
   }

   private class_3965 IIIIIl(lIlII var1) {
      return var1 == null ? null : new class_3965(var1.l(), class_2350.field_11036, var1.I(), false);
   }

   private void IIIIlI() {
      this.llI = IIllIl(-320820244, 407136666 ^ -1639159162);
      this.I = IIllIl(-320820245, 407136666 ^ 2005933590);
      this.IIlIl.clear();
   }

   private double IIIIll(class_1799 var1) {
      return var1.method_7963() && var1.method_7936() > 0 ? 100.0 * (var1.method_7936() - var1.method_7919()) / var1.method_7936() : 100.0;
   }

   private boolean IIIlII() {
      return this.IIIII.IllI() == lIIlIlII.II;
   }

   private lIlII IIIlIl(class_310 var1) {
      class_2338 var2 = var1.field_1724.method_24515();
      ArrayList var3 = new ArrayList();

      for (int var4 = -1; var4 <= 1; var4++) {
         for (int var5 = IIllIl(-320820246, 1715641731 ^ -877431078); var5 <= 2; var5++) {
            for (int var6 = IIllIl(-320820247, 1715641731 ^ 344378317); var6 <= 2; var6++) {
               if (var5 != 0 || var6 != 0) {
                  var3.add(var2.method_10069(var5, var4, var6));
               }
            }
         }
      }

      var3.sort(Comparator.comparingDouble(llIIII::III));

      for (class_2338 var9 : var3) {
         if (this.lIIlI(var1, var9)) {
            class_2338 var10 = var9.method_10074();
            class_243 var7 = class_243.method_24953(var10).method_1031(0.0, 0.4375, 0.0);
            if (this.IIlIlI(var1.field_1724, var7) && this.I(var1, var7, var10)) {
               return new lIlII(var9.method_10062(), var10.method_10062(), var7);
            }
         }
      }

      return null;
   }

   private long IIIllI(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();
      return var2 == var4 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private boolean IIIlll(class_1799 var1) {
      int var3 = -1250691941;
      String var2 = class_7923.field_41178.method_10221(var1.method_7909()).method_12832();
      return var2.endsWith(IlIIllIII.lI(IIllII(IIllIl(-320820248, var3 ^ -1547680853), IIllIl(-320820249, var3 ^ -17865811))))
         || var2.endsWith(IlIIllIII.lI(IIllII(IIllIl(-320820250, var3 ^ 640339218), IIllIl(-320820251, var3 ^ 1069090324))))
         || var2.endsWith(IlIIllIII.lI(IIllII(IIllIl(-320820252, var3 ^ -453532826), IIllIl(-320820253, var3 ^ 588699372))))
         || var2.endsWith(IlIIllIII.lI(IIllII(IIllIl(-320820254, var3 ^ -997261811), IIllIl(-320820255, var3 ^ -1639878636))))
         || var2.equals(IlIIllIII.lI(IIllII(IIllIl(-320820256, var3 ^ 342140749), IIllIl(-320820321, var3 ^ -1601499148))));
   }

   private class_1735 IIlIII(class_1703 var1, int var2) {
      for (class_1735 var4 : var1.field_7761) {
         if (var4 != null && var4.field_7874 == var2) {
            return var4;
         }
      }

      return null;
   }

   private void IIlIIl(class_310 var1, class_465<?> var2) {
      class_1703 var3 = var2.method_17577();
      if (var3 instanceof class_1707 var4 && var4.method_17388() == 3 && var3.method_34255() != null && var3.method_34255().method_7960()) {
         if (var3.field_7763 != this.llI) {
            this.llI = var3.field_7763;
            this.I = IIllIl(-320820322, -1884554042 ^ -1680968413);
            this.IIlIl.clear();
         }

         this.llllI(var1, var3);
         ArrayList var5 = new ArrayList();
         int var6 = this.lIII(var3, var5);
         if (var6 == 0) {
            this.llIll(var1);
         } else {
            this.I = IIllIl(-320820323, -1884554042 ^ -250818719);
            long var7 = System.currentTimeMillis();
            if (var7 - this.IIlI >= this.IIIllI(this.IIllI)) {
               if (!var5.isEmpty() && lIIIllII.III(var1)) {
                  this.IIlI = var7;
                  var5.sort(this.lIll());
                  int var9 = Math.min(IIllIl(-320820324, -1884554042 ^ 1210872630), var5.size());

                  for (int var10 = 0; var10 < var9; var10++) {
                     int var11 = ((Illlllll)var5.get(var10)).I();
                     this.lII(var3, var11, var1.field_1724.field_6012);
                     var1.field_1761.method_2906(var3.field_7763, var11, 0, class_1713.field_7794, var1.field_1724);
                  }

                  lIIIllII.lII(var1);
               }
            }
         }
      }
   }

   private boolean IIlIlI(class_746 var1, class_243 var2) {
      return var1 != null && var2 != null && var1.method_33571().method_1025(var2) <= 20.25;
   }

   private boolean IIlIll(class_1799 var1) {
      return var1 != null && var1.method_7909() instanceof class_5537;
   }

   @Override
   public void IlIII() {
      this.lIlII();
      this.IllIl.IIIIIII();
   }

   private static String IIllII(int var0, int var1) {
      int var9 = 901926817;
      int var2 = (var0 ^ IIllIl(-320820325, var9 ^ 905147741)) & IIllIl(-320820326, var9 ^ 2022720059);
      if (llII[var2] == null) {
         char[] var3 = llll[var2].toCharArray();

         int var4 = switch (var3[0] & IIllIl(-320820327, var9 ^ -1773824473)) {
            case 0 -> IIllIl(-320820328, var9 ^ -1172102148);
            case 1 -> IIllIl(-320820329, var9 ^ -380421755);
            case 2 -> IIllIl(-320820330, var9 ^ 810749139);
            case 3 -> IIllIl(-320820331, var9 ^ 245050075);
            case 4 -> IIllIl(-320820332, var9 ^ -1992058038);
            case 5 -> IIllIl(-320820333, var9 ^ -1050196421);
            case 6 -> IIllIl(-320820334, var9 ^ -631775502);
            case 7 -> IIllIl(-320820335, var9 ^ -1799054563);
            case 8 -> IIllIl(-320820336, var9 ^ -1910476500);
            case 9 -> IIllIl(-320820337, var9 ^ 1309477571);
            case 10 -> IIllIl(-320820338, var9 ^ 1383757857);
            case 11 -> IIllIl(-320820339, var9 ^ 746928142);
            case 12 -> IIllIl(-320820340, var9 ^ -705992189);
            case 13 -> IIllIl(-320820341, var9 ^ -1715786876);
            case 14 -> IIllIl(-320820342, var9 ^ 1142384062);
            case 15 -> IIllIl(-320820343, var9 ^ -1227907199);
            case 16 -> IIllIl(-320820344, var9 ^ -2077071788);
            case 17 -> IIllIl(-320820345, var9 ^ -1590000841);
            case 18 -> IIllIl(-320820346, var9 ^ -1539918938);
            case 19 -> IIllIl(-320820347, var9 ^ 1864608694);
            case 20 -> IIllIl(-320820348, var9 ^ -892499569);
            case 21 -> IIllIl(-320820349, var9 ^ 1031232265);
            case 22 -> IIllIl(-320820350, var9 ^ -994110290);
            case 23 -> IIllIl(-320820351, var9 ^ -1889961018);
            case 24 -> IIllIl(-320820352, var9 ^ -163274014);
            case 25 -> IIllIl(-320820289, var9 ^ 590936533);
            case 26 -> 2;
            case 27 -> IIllIl(-320820290, var9 ^ -348302864);
            case 28 -> IIllIl(-320820291, var9 ^ -114378362);
            case 29 -> IIllIl(-320820292, var9 ^ 834217379);
            case 30 -> IIllIl(-320820293, var9 ^ 962892952);
            case 31 -> IIllIl(-320820294, var9 ^ 2051448329);
            case 32 -> IIllIl(-320820295, var9 ^ -1178635123);
            case 33 -> IIllIl(-320820296, var9 ^ -929763554);
            case 34 -> IIllIl(-320820297, var9 ^ 1007932873);
            case 35 -> IIllIl(-320820298, var9 ^ -1138203500);
            case 36 -> IIllIl(-320820299, var9 ^ 1535763714);
            case 37 -> IIllIl(-320820300, var9 ^ 1634278605);
            case 38 -> IIllIl(-320820301, var9 ^ 1174873671);
            case 39 -> IIllIl(-320820302, var9 ^ 874219932);
            case 40 -> IIllIl(-320820303, var9 ^ 515236498);
            case 41 -> IIllIl(-320820304, var9 ^ 1595007837);
            case 42 -> IIllIl(-320820305, var9 ^ 1434709966);
            case 43 -> IIllIl(-320820306, var9 ^ 1983397418);
            case 44 -> IIllIl(-320820307, var9 ^ -689754558);
            case 45 -> IIllIl(-320820308, var9 ^ 1442266883);
            case 46 -> IIllIl(-320820309, var9 ^ 1762322920);
            case 47 -> IIllIl(-320820310, var9 ^ 349380012);
            case 48 -> IIllIl(-320820311, var9 ^ 182148647);
            case 49 -> IIllIl(-320820312, var9 ^ -43877810);
            case 50 -> IIllIl(-320820313, var9 ^ 498682005);
            case 51 -> IIllIl(-320820314, var9 ^ -82290012);
            case 52 -> IIllIl(-320820315, var9 ^ 2035035328);
            case 53 -> IIllIl(-320820316, var9 ^ 799012186);
            case 54 -> IIllIl(-320820317, var9 ^ 1000451428);
            case 55 -> IIllIl(-320820318, var9 ^ -45987160);
            case 56 -> IIllIl(-320820319, var9 ^ -1879519067);
            case 57 -> IIllIl(-320820320, var9 ^ 792902625);
            case 58 -> IIllIl(-320820641, var9 ^ -796127351);
            case 59 -> IIllIl(-320820642, var9 ^ -709519629);
            case 60 -> IIllIl(-320820643, var9 ^ 1971435942);
            case 61 -> IIllIl(-320820644, var9 ^ 359968429);
            case 62 -> IIllIl(-320820645, var9 ^ 1212515629);
            case 63 -> IIllIl(-320820646, var9 ^ -1991560865);
            case 64 -> IIllIl(-320820647, var9 ^ 2111282591);
            case 65 -> IIllIl(-320820648, var9 ^ -98539816);
            case 66 -> IIllIl(-320820649, var9 ^ 70508579);
            case 67 -> IIllIl(-320820650, var9 ^ -1949799015);
            case 68 -> IIllIl(-320820651, var9 ^ 230301441);
            case 69 -> IIllIl(-320820652, var9 ^ -1790638824);
            case 70 -> IIllIl(-320820653, var9 ^ 1574964103);
            case 71 -> 5;
            case 72 -> IIllIl(-320820654, var9 ^ -109628187);
            case 73 -> IIllIl(-320820655, var9 ^ 186544870);
            case 74 -> IIllIl(-320820656, var9 ^ 641264195);
            case 75 -> IIllIl(-320820657, var9 ^ -1914170498);
            case 76 -> IIllIl(-320820658, var9 ^ 1480551373);
            case 77 -> IIllIl(-320820659, var9 ^ 1407079972);
            case 78 -> IIllIl(-320820660, var9 ^ 219647072);
            case 79 -> IIllIl(-320820661, var9 ^ 2095726536);
            case 80 -> IIllIl(-320820662, var9 ^ -1075188701);
            case 81 -> IIllIl(-320820663, var9 ^ -585753919);
            case 82 -> IIllIl(-320820664, var9 ^ -1823581340);
            case 83 -> IIllIl(-320820665, var9 ^ 368746015);
            case 84 -> IIllIl(-320820666, var9 ^ -572431282);
            case 85 -> IIllIl(-320820667, var9 ^ 1838324804);
            case 86 -> IIllIl(-320820668, var9 ^ 686739272);
            case 87 -> IIllIl(-320820669, var9 ^ 673221886);
            case 88 -> IIllIl(-320820670, var9 ^ 1204694335);
            case 89 -> IIllIl(-320820671, var9 ^ 653168203);
            case 90 -> IIllIl(-320820672, var9 ^ -764824586);
            case 91 -> IIllIl(-320820609, var9 ^ 472872589);
            case 92 -> IIllIl(-320820610, var9 ^ -1803469448);
            case 93 -> IIllIl(-320820611, var9 ^ 731168064);
            case 94 -> IIllIl(-320820612, var9 ^ 1693529721);
            case 95 -> IIllIl(-320820613, var9 ^ -204842743);
            case 96 -> IIllIl(-320820614, var9 ^ 1344783089);
            case 97 -> IIllIl(-320820615, var9 ^ -1478122462);
            case 98 -> IIllIl(-320820616, var9 ^ 457075965);
            case 99 -> IIllIl(-320820617, var9 ^ -2054646529);
            case 100 -> IIllIl(-320820618, var9 ^ 1083497367);
            case 101 -> IIllIl(-320820619, var9 ^ -1564095345);
            case 102 -> IIllIl(-320820620, var9 ^ -1361799507);
            case 103 -> IIllIl(-320820621, var9 ^ -550742362);
            case 104 -> IIllIl(-320820622, var9 ^ -543454787);
            case 105 -> IIllIl(-320820623, var9 ^ -849539523);
            case 106 -> IIllIl(-320820624, var9 ^ 2076138079);
            case 107 -> IIllIl(-320820625, var9 ^ 750992333);
            case 108 -> 0;
            case 109 -> IIllIl(-320820626, var9 ^ -1530801688);
            case 110 -> IIllIl(-320820627, var9 ^ 293491967);
            case 111 -> IIllIl(-320820628, var9 ^ -1107315470);
            case 112 -> IIllIl(-320820629, var9 ^ -1183994540);
            case 113 -> IIllIl(-320820630, var9 ^ 1217251709);
            case 114 -> IIllIl(-320820631, var9 ^ 1079365040);
            case 115 -> IIllIl(-320820632, var9 ^ -774516844);
            case 116 -> IIllIl(-320820633, var9 ^ -136986180);
            case 117 -> IIllIl(-320820634, var9 ^ 404495547);
            case 118 -> IIllIl(-320820635, var9 ^ -463098045);
            case 119 -> IIllIl(-320820636, var9 ^ 774017934);
            case 120 -> IIllIl(-320820637, var9 ^ -1691948148);
            case 121 -> IIllIl(-320820638, var9 ^ -1375332404);
            case 122 -> IIllIl(-320820639, var9 ^ 1367715753);
            case 123 -> IIllIl(-320820640, var9 ^ 1345490776);
            case 124 -> IIllIl(-320820705, var9 ^ -1814277937);
            case 125 -> IIllIl(-320820706, var9 ^ -1713091904);
            case 126 -> IIllIl(-320820707, var9 ^ 407761841);
            case 127 -> IIllIl(-320820708, var9 ^ 325535515);
            case 128 -> IIllIl(-320820709, var9 ^ -1677468928);
            case 129 -> IIllIl(-320820710, var9 ^ -249687993);
            case 130 -> IIllIl(-320820711, var9 ^ 760842471);
            case 131 -> 1;
            case 132 -> IIllIl(-320820712, var9 ^ 1443069109);
            case 133 -> IIllIl(-320820713, var9 ^ -1170224330);
            case 134 -> IIllIl(-320820714, var9 ^ 904977959);
            case 135 -> IIllIl(-320820715, var9 ^ 467853889);
            case 136 -> IIllIl(-320820716, var9 ^ -439182531);
            case 137 -> IIllIl(-320820717, var9 ^ 717501851);
            case 138 -> IIllIl(-320820718, var9 ^ 970449120);
            case 139 -> IIllIl(-320820719, var9 ^ 78901194);
            case 140 -> IIllIl(-320820720, var9 ^ -1611592598);
            case 141 -> IIllIl(-320820721, var9 ^ -322276487);
            case 142 -> IIllIl(-320820722, var9 ^ -1199881870);
            case 143 -> IIllIl(-320820723, var9 ^ 1419856849);
            case 144 -> IIllIl(-320820724, var9 ^ 361364099);
            case 145 -> IIllIl(-320820725, var9 ^ -693018133);
            case 146 -> IIllIl(-320820726, var9 ^ 447301843);
            case 147 -> IIllIl(-320820727, var9 ^ -680102395);
            case 148 -> IIllIl(-320820728, var9 ^ 638838673);
            case 149 -> IIllIl(-320820729, var9 ^ -1821223891);
            case 150 -> IIllIl(-320820730, var9 ^ -317749541);
            case 151 -> IIllIl(-320820731, var9 ^ -754884173);
            case 152 -> IIllIl(-320820732, var9 ^ 1937886577);
            case 153 -> IIllIl(-320820733, var9 ^ -601399605);
            case 154 -> IIllIl(-320820734, var9 ^ 1447529515);
            case 155 -> IIllIl(-320820735, var9 ^ -262239982);
            case 156 -> IIllIl(-320820736, var9 ^ -1347239272);
            case 157 -> IIllIl(-320820673, var9 ^ -60242675);
            case 158 -> 3;
            case 159 -> IIllIl(-320820674, var9 ^ 1456875178);
            case 160 -> IIllIl(-320820675, var9 ^ -664708376);
            case 161 -> IIllIl(-320820676, var9 ^ 1073708730);
            case 162 -> IIllIl(-320820677, var9 ^ -1001607235);
            case 163 -> IIllIl(-320820678, var9 ^ 998725072);
            case 164 -> IIllIl(-320820679, var9 ^ 2073555887);
            case 165 -> IIllIl(-320820680, var9 ^ -915388778);
            case 166 -> IIllIl(-320820681, var9 ^ -1699791695);
            case 167 -> IIllIl(-320820682, var9 ^ 1612659142);
            case 168 -> IIllIl(-320820683, var9 ^ -1204091841);
            case 169 -> IIllIl(-320820684, var9 ^ 475537433);
            case 170 -> IIllIl(-320820685, var9 ^ -335382739);
            case 171 -> IIllIl(-320820686, var9 ^ -2019857362);
            case 172 -> IIllIl(-320820687, var9 ^ 2093061769);
            case 173 -> IIllIl(-320820688, var9 ^ 1927408710);
            case 174 -> IIllIl(-320820689, var9 ^ 2054664820);
            case 175 -> IIllIl(-320820690, var9 ^ -1630364071);
            case 176 -> IIllIl(-320820691, var9 ^ 1512688908);
            case 177 -> IIllIl(-320820692, var9 ^ 1772149086);
            case 178 -> IIllIl(-320820693, var9 ^ -842139554);
            case 179 -> IIllIl(-320820694, var9 ^ -1843582860);
            case 180 -> IIllIl(-320820695, var9 ^ -394230456);
            case 181 -> IIllIl(-320820696, var9 ^ -417575864);
            case 182 -> IIllIl(-320820697, var9 ^ 103179223);
            case 183 -> IIllIl(-320820698, var9 ^ -1982220738);
            case 184 -> IIllIl(-320820699, var9 ^ -1575181507);
            case 185 -> IIllIl(-320820700, var9 ^ 1230702691);
            case 186 -> IIllIl(-320820701, var9 ^ 6983310);
            case 187 -> IIllIl(-320820702, var9 ^ -1146348689);
            case 188 -> IIllIl(-320820703, var9 ^ -1508249119);
            case 189 -> IIllIl(-320820704, var9 ^ -18799602);
            case 190 -> IIllIl(-320820513, var9 ^ 217190278);
            case 191 -> IIllIl(-320820514, var9 ^ 548839703);
            case 192 -> IIllIl(-320820515, var9 ^ 1541642269);
            case 193 -> IIllIl(-320820516, var9 ^ 1252786903);
            case 194 -> IIllIl(-320820517, var9 ^ 1983490305);
            case 195 -> IIllIl(-320820518, var9 ^ 1572802339);
            case 196 -> IIllIl(-320820519, var9 ^ 1057408324);
            case 197 -> IIllIl(-320820520, var9 ^ 1628897566);
            case 198 -> IIllIl(-320820521, var9 ^ -1964551217);
            case 199 -> IIllIl(-320820522, var9 ^ -1225792695);
            case 200 -> IIllIl(-320820523, var9 ^ 2044173263);
            case 201 -> IIllIl(-320820524, var9 ^ -624649292);
            case 202 -> IIllIl(-320820525, var9 ^ -1574424448);
            case 203 -> IIllIl(-320820526, var9 ^ -314425399);
            case 204 -> IIllIl(-320820527, var9 ^ 1692452310);
            case 205 -> IIllIl(-320820528, var9 ^ 31230781);
            case 206 -> IIllIl(-320820529, var9 ^ 1132302895);
            case 207 -> IIllIl(-320820530, var9 ^ -559922781);
            case 208 -> IIllIl(-320820531, var9 ^ 27412233);
            case 209 -> IIllIl(-320820532, var9 ^ 502255737);
            case 210 -> IIllIl(-320820533, var9 ^ 1800003763);
            case 211 -> IIllIl(-320820534, var9 ^ 738174511);
            case 212 -> IIllIl(-320820535, var9 ^ -2001839575);
            case 213 -> IIllIl(-320820536, var9 ^ -1142695775);
            case 214 -> IIllIl(-320820537, var9 ^ 972011531);
            case 215 -> IIllIl(-320820538, var9 ^ -929395504);
            case 216 -> IIllIl(-320820539, var9 ^ 1332707841);
            case 217 -> IIllIl(-320820540, var9 ^ 1354428249);
            case 218 -> IIllIl(-320820541, var9 ^ -199107985);
            case 219 -> IIllIl(-320820542, var9 ^ -293366955);
            case 220 -> IIllIl(-320820543, var9 ^ 519282369);
            case 221 -> IIllIl(-320820544, var9 ^ 481923046);
            case 222 -> IIllIl(-320820481, var9 ^ -1793665822);
            case 223 -> IIllIl(-320820482, var9 ^ -444077167);
            case 224 -> IIllIl(-320820483, var9 ^ 1162517316);
            case 225 -> IIllIl(-320820484, var9 ^ -373054521);
            case 226 -> IIllIl(-320820485, var9 ^ -1304660786);
            case 227 -> IIllIl(-320820486, var9 ^ -742567979);
            case 228 -> IIllIl(-320820487, var9 ^ 1204077389);
            case 229 -> IIllIl(-320820488, var9 ^ 917066446);
            case 230 -> IIllIl(-320820489, var9 ^ 1152629212);
            case 231 -> IIllIl(-320820490, var9 ^ -976229072);
            case 232 -> IIllIl(-320820491, var9 ^ -669924515);
            case 233 -> IIllIl(-320820492, var9 ^ 1589053731);
            case 234 -> IIllIl(-320820493, var9 ^ -197382454);
            case 235 -> IIllIl(-320820494, var9 ^ 319595350);
            case 236 -> IIllIl(-320820495, var9 ^ 2020579682);
            case 237 -> IIllIl(-320820496, var9 ^ 1531290569);
            case 238 -> IIllIl(-320820497, var9 ^ 2001289090);
            case 239 -> IIllIl(-320820498, var9 ^ -1925563036);
            case 240 -> IIllIl(-320820499, var9 ^ 1965412852);
            case 241 -> IIllIl(-320820500, var9 ^ 1122863921);
            case 242 -> IIllIl(-320820501, var9 ^ -1076036171);
            case 243 -> IIllIl(-320820502, var9 ^ -1133593843);
            case 244 -> IIllIl(-320820503, var9 ^ -1517708070);
            case 245 -> IIllIl(-320820504, var9 ^ 737642276);
            case 246 -> IIllIl(-320820505, var9 ^ 1664558208);
            case 247 -> IIllIl(-320820506, var9 ^ -837172161);
            case 248 -> IIllIl(-320820507, var9 ^ -408510658);
            case 249 -> IIllIl(-320820508, var9 ^ -1007680202);
            case 250 -> IIllIl(-320820509, var9 ^ -825645500);
            case 251 -> IIllIl(-320820510, var9 ^ 1007213029);
            case 252 -> IIllIl(-320820511, var9 ^ 1616013718);
            case 253 -> 4;
            case 254 -> IIllIl(-320820512, var9 ^ 1721544012);
            default -> IIllIl(-320820577, var9 ^ 868834140);
         };
         int var5 = (var1 & IIllIl(-320820578, var9 ^ 43913079)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIllIl(-320820579, var9 ^ -72083218)) >>> IIllIl(-320820580, var9 ^ 1190234833)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIllIl(-320820581, var9 ^ 296819662);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIllIl(-320820582, var9 ^ 1764267681);
            }
         }

         llII[var2] = new String(var3).intern();
      }

      return llII[var2];
   }
}
