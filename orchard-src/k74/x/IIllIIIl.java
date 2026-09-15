package k74.x;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_4081;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_9334;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_239.class_240;

@Environment(EnvType.CLIENT)
public final class IIllIIIl extends IlIIIIIIl {
   private static final long II = 1000L;
   private static final int Il = 40;
   private long lI;
   private float ll;
   private static final double III = 0.05;
   private static final long IIl = 250L;
   private static final int[] IIlIIl;
   private static final double IlI = 1.0E-4;
   private static final IIIlIlIl Ill;
   private long lII;
   private static final IIIlIlIl lIl;
   private final lllIIlII llI;
   private static final long lll = 2000L;
   private final IIlIII IIII;
   private static final long IIIl = 2500L;
   private final List<class_1799> IIlI;
   private final lIlllIl IIll;
   private static final IIIlIlIl IlII;
   private final lIIIIIlI IlIl;
   private static final String[] IIlIlI;
   private final IllIII<IlIIllll> IllI;
   private int Illl;
   private static final double lIII = 1.0;
   private float lIIl;
   private static final IIIlIlIl lIlI;
   private boolean lIll;
   private final lllIIlII llII;
   private final IlIIl llIl;
   private int lllI;
   private static final IIIlIlIl llll;
   private static final Object[] IIlIll;
   private static final String[] IIIII;
   private static final IIIlIlIl IIIIl;
   private static final long IIIlI = 1400L;
   private class_1799 IIIll;
   private class_243 IIlII;
   private long IIlIl;
   private static final IIIlIlIl IIllI;
   private long IIlll;
   private final IIlIII IlIII;
   private int IlIIl;
   private static final IIIlIlIl IlIlI;
   private IIlIIlIIl IlIll;
   private final lllIIlII IllII;
   private int IllIl;
   private int IlllI;
   private boolean Illll;
   private static final long lIIII = 700L;
   private final IIlIII lIIIl;
   private static final float lIIlI = 0.5F;
   private int lIIll;
   private static final IIIlIlIl lIlII;
   private static final IIIlIlIl lIlIl;
   private static final IIIlIlIl lIllI;
   private float lIlll;
   private long llIII;
   private static final int llIIl = 9;
   private static final IIIlIlIl llIlI;
   private static final List<lIllll> I;
   private static final String[] llIll;
   private static final IIIlIlIl lllII;
   private long lllIl;
   private static final double llllI = 0.5;
   private final IlIIIllll lllll;
   private final lIlllIl IIIIII;
   private long IIIIIl;
   private static final long IIIIlI = 500L;
   private final lllIIlII IIIIll;
   private final IIlIII IIIlII;
   private static final IIIlIlIl IIIlIl;
   private final lllIIlII IIIllI;
   private long IIIlll;
   private static final long IIlIII = 700L;

   private void I(class_310 var1, int var2) {
      k74.x.IIll.IlllIll(var1, this, var2);
   }

   private boolean II(class_310 var1, long var2) {
      if (this.IIIIl(var1) && this.llII(var1, var2)) {
         if (this.lIll) {
            if (!this.llII.IllI() || !this.lIllI(var1)) {
               return false;
            }
         } else if (var1.field_1724.method_36455() < this.IIIlII.IllI() || !this.llI(var1)) {
            return false;
         }

         boolean var4 = this.l(var1, var2);
         llIllIll var5 = this.III(var1.field_1724, var2, var4);
         if (var5 == null || var4 && var5.l() <= 0.0F) {
            return false;
         } else if (var2 < this.lII) {
            return true;
         } else {
            this.lllI = var5.Il();
            this.lIIl = var5.l();
            this.IIIll = var5.I();
            this.lIll(var1, this.lllI, var2);
            if (k74.x.IIll.IIlII(var1.field_1724.method_31548()) == this.lllI && var2 >= this.IIlll) {
               this.Il(var1, var2);
               return true;
            } else {
               this.IlIll = IIlIIlIIl.I;
               this.llIII = var2;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private void Il(class_310 var1, long var2) {
      if (this.lIll && !this.llII.IllI()) {
         this.IIlII();
      } else {
         boolean var4;
         if (this.lIll) {
            if (this.IllI.IllI() != IlIIllll.II) {
               var4 = this.IIl(var1);
               if (var4) {
                  this.lIlII(var1);
                  this.IlIll = IIlIIlIIl.Il;
                  this.llIII = var2;
                  this.IlIIl = var1.field_1724.field_6012 + 1;
               } else {
                  this.lIlI(var1);
               }

               return;
            }

            if (this.IlIll != IIlIIlIIl.ll) {
               class_746 var5 = var1.field_1724;
               this.IIlII = var5.method_33571().method_1031(0.0, -2.0, 0.0);
               this.IIIlll = var2;
               this.IlllI = 0;
               this.IlIll = IIlIIlIIl.ll;
               this.llIII = var2;
               return;
            }

            var4 = this.IlllI(var1);
         } else {
            var4 = this.lIlIl(var1);
         }

         this.lIIl(var1, var4);
      }
   }

   public IIllIIIl(IlIIl var1) {
      int var2 = -794435681;
      super(
         IlIIllIII.Ill(IIllI(llIIl(588996333, var2 ^ -1772661056), llIIl(588996332, var2 ^ 1464572177))),
         lllIIlIl.I,
         IlIIllIII.Ill(IIllI(llIIl(588996335, var2 ^ 1478059944), llIIl(588996334, var2 ^ 2081208278)))
      );
      this.llII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllI(llIIl(588996329, var2 ^ 1141825902), llIIl(588996328, var2 ^ -997869592))), false));
      this.IllI = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(IIllI(llIIl(588996331, var2 ^ 617857685), llIIl(588996330, var2 ^ 1139868883))), IlIIllll.class, IlIIllll.l)
            .lIlI(this.llII::IllI)
      );
      this.IIIlII = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIllI(llIIl(588996325, var2 ^ 484102648), llIIl(588996324, var2 ^ -1974188498))), 75.0, 30.0, 90.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIllI(llIIl(588996327, var2 ^ -1279525318), llIIl(588996326, var2 ^ 1334138984))))
            .lIlI(this::IIII)
      );
      this.IIIIII = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIllI(llIIl(588996321, var2 ^ -924983580), llIIl(588996320, var2 ^ 1037945044))), 55.0, 60.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(IIllI(llIIl(588996323, var2 ^ -613264034), llIIl(588996322, var2 ^ 791994494))))
      );
      this.IIll = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIllI(llIIl(588996349, var2 ^ 701352540), llIIl(588996348, var2 ^ 1579626340))), 0.0, 0.0, 0.0, 250.0, 1.0)
            .Ill(IlIIllIII.Ill(IIllI(llIIl(588996351, var2 ^ 1697901464), llIIl(588996350, var2 ^ 1037166266))))
            .lIlI(IIllIIIl::Illl)
      );
      this.IIII = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIllI(llIIl(588996345, var2 ^ 101449565), llIIl(588996344, var2 ^ -628379486))), 3.0, 0.0, 30.0, 0.5)
            .IIIl(IlIIllIII.Ill(IIllI(llIIl(588996347, var2 ^ 1050352131), llIIl(588996346, var2 ^ 1605649887))))
      );
      this.IIIIll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllI(llIIl(588996341, var2 ^ -602284066), llIIl(588996340, var2 ^ 179196478))), true));
      this.lIIIl = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIllI(llIIl(588996343, var2 ^ 283707991), llIIl(588996342, var2 ^ 1434620714))), 10.0, 1.0, 20.0, 0.5)
            .IIIl(IlIIllIII.Ill(IIllI(llIIl(588996337, var2 ^ -1565005501), llIIl(588996336, var2 ^ -690262268))))
            .lIlI(this.IIIIll::IllI)
      );
      this.IllII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllI(llIIl(588996339, var2 ^ -1108873352), llIIl(588996338, var2 ^ -1166189016))), false));
      this.llI = this.IllIIll(
         new lllIIlII(IlIIllIII.Ill(IIllI(llIIl(588996301, var2 ^ -1772288327), llIIl(588996300, var2 ^ -527749080))), false).lIlI(IIllIIIl::IIlI).lIIl()
      );
      this.IlIl = this.IllIIll(
         new lIIIIIlI(IlIIllIII.Ill(IIllI(llIIl(588996303, var2 ^ -1003179633), llIIl(588996302, var2 ^ 856244878))), I, Set.of(Ill, lIlI, llIlI))
      );
      this.IIIllI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIllI(llIIl(588996297, var2 ^ -206336637), llIIl(588996296, var2 ^ -326457332))), true));
      this.IlIII = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIllI(llIIl(588996299, var2 ^ -554206100), llIIl(588996298, var2 ^ 1927599407))), 50.0, 1.0, 100.0, 1.0).lIlI(this::lIII)
      );
      this.lllll = new IlIIIllll();
      this.IlIll = IIlIIlIIl.II;
      this.IIIll = class_1799.field_8037;
      this.lllI = -1;
      this.Illl = -1;
      this.IllIl = llIIl(588996293, var2 ^ 38160344);
      this.lIIll = -1;
      this.IlIIl = llIIl(588996292, var2 ^ -1729916602);
      this.IIlI = new ArrayList<>();
      this.llIl = var1;
   }

   @Override
   public void llIIII(class_310 var1) {
      if (this.IlIll != IIlIIlIIl.II) {
         if (!this.IIIII(var1)) {
            this.IIlII();
         } else if (lIIIllII.ll(var1)) {
            this.IIlII();
         } else if (!this.IIIIl(var1)) {
            this.IIlII();
         } else {
            this.IllIl(var1, System.currentTimeMillis());
         }
      }
   }

   private double lI(class_310 var1, class_1309 var2) {
      if (var1.field_1687 != null && var2 != null) {
         class_238 var3 = var2.method_5829();
         double var4 = var3.field_1322;
         double var6 = Math.min(var3.field_1323 + 0.05, (var3.field_1323 + var3.field_1320) * 0.5);
         double var8 = Math.max(var3.field_1320 - 0.05, (var3.field_1323 + var3.field_1320) * 0.5);
         double var10 = Math.min(var3.field_1321 + 0.05, (var3.field_1321 + var3.field_1324) * 0.5);
         double var12 = Math.max(var3.field_1324 - 0.05, (var3.field_1321 + var3.field_1324) * 0.5);
         double var14 = (var3.field_1323 + var3.field_1320) * 0.5;
         double var16 = (var3.field_1321 + var3.field_1324) * 0.5;
         double[] var18 = new double[]{var6, var14, var8};
         double[] var19 = new double[]{var10, var16, var12};
         int var20 = (int)Math.floor(var4 - 1.0E-4);
         int var21 = Math.max(var1.field_1687.method_31607(), (int)Math.floor(var4 - 1.0 - 1.0));
         double var22 = Double.POSITIVE_INFINITY;

         for (double var27 : var18) {
            for (double var32 : var19) {
               for (int var34 = var20; var34 >= var21; var34--) {
                  class_2338 var35 = class_2338.method_49637(var27, var34, var32);
                  class_2680 var36 = var1.field_1687.method_8320(var35);
                  if (!var36.method_26215()) {
                     class_265 var37 = var36.method_26220(var1.field_1687, var35);
                     if (!var37.method_1110()) {
                        double var38 = var35.method_10264() + var37.method_1105(class_2351.field_11052);
                        double var40 = Math.max(0.0, var4 - var38);
                        var22 = Math.min(var22, var40);
                        if (var22 < 1.0) {
                           return var22;
                        }
                     }
                  }
               }
            }
         }

         return var22;
      } else {
         return Double.POSITIVE_INFINITY;
      }
   }

   private float ll(class_1293 var1) {
      if (!var1.method_5579().equals(class_1294.field_5915)) {
         return 0.0F;
      } else {
         return var1.method_5578() >= 1 ? 7.0F : 3.0F;
      }
   }

   private llIllIll III(class_746 var1, long var2, boolean var4) {
      llIllIll var5 = null;

      for (int var6 = 0; var6 < llIIl(588996295, -321055537 ^ 203408161); var6++) {
         class_1799 var7 = var1.method_31548().method_5438(var6);
         llIllIll var8 = this.IllII(var1, var7, var6, var2, var4);
         if (var8 != null && var8.II() > 0 && (!(var8.l() <= 0.0F) || !this.IIlll(var8.I())) && (var5 == null || var8.II() > var5.II())) {
            var5 = var8;
         }
      }

      return var5;
   }

   private boolean IIl(class_310 var1) {
      if (!this.IIIII(var1)) {
         return false;
      } else {
         float var2 = this.Illll(var1);
         float var3 = this.IIIll(var1);
         long var4 = ++this.lI;
         return IlllIlII.llIlI(var1, llIIl(588996294, -1838654595 ^ -2116555109), var2, var3, this::lIIll);
      }
   }

   private void Ill(class_746 var1, long var2) {
      if (var1.method_6032() >= var1.method_6063() - 0.25F) {
         this.IlIl();
      } else if (this.lllIl > 0L && var2 - this.lllIl >= 700L && var1.method_6032() <= this.lIIIl.IllI() && this.lIlll <= this.lIIIl.IllI()) {
         this.IIIIIl = 0L;
         this.lIlll = 0.0F;
      } else {
         if (var2 > this.IIIIIl) {
            this.IIIIIl = 0L;
            this.lIlll = 0.0F;
         }
      }
   }

   public boolean lII() {
      if (!this.IIIIlIl()) {
         return false;
      } else {
         return this.IlIll != IIlIIlIIl.II ? true : this.lllIl > 0L && System.currentTimeMillis() - this.lllIl < 250L;
      }
   }

   private boolean lIl(class_310 var1, class_1309 var2) {
      return var1 != null && var1.field_1724 != null && var2 != null && var2 != var1.field_1724 && var2.method_5805() && !var2.method_31481();
   }

   private boolean llI(class_310 var1) {
      return var1.field_1765 instanceof class_3965 var2 && var2.method_17783() == class_240.field_1332;
   }

   public boolean lll() {
      return this.IIIIlIl() && this.IlIll != IIlIIlIIl.II;
   }

   private boolean IIII() {
      return !this.llII.IllI();
   }

   private boolean IIIl(long var1) {
      return this.IIIIIl == 0L || this.lllIl <= 0L || var1 - this.lllIl >= 700L;
   }

   private static boolean IIlI() {
      return false;
   }

   private float IIll(class_746 var1, long var2) {
      if (var2 <= this.IIIIIl) {
         return Math.max(var1.method_6032(), this.lIlll);
      } else {
         this.IIIIIl = 0L;
         this.lIlll = 0.0F;
         return var1.method_6032();
      }
   }

   private boolean IlII(class_746 var1) {
      return var1 != null && this.lIlll < var1.method_6063() - 0.25F;
   }

   @Override
   public void IlllII(JsonObject var1) {
      super.IlllII(var1);
      this.IIIlIIl(var1, IlIIllIII.lI(IIllI(llIIl(588996246, -699033549 ^ -1870119710), llIIl(588996241, -699033549 ^ -204587422))), new lIlllIl[]{this.IIll});
      this.IIIlIIl(var1, IlIIllIII.lI(IIllI(llIIl(588996240, -699033549 ^ 102129905), llIIl(588996243, -699033549 ^ 1053926668))), new lIlllIl[]{this.IIll});
   }

   private void IlIl() {
      this.IIIIIl = 0L;
      this.lIlll = 0.0F;
      this.IIlIl = 0L;
   }

   private void IllI(class_310 var1) {
      this.lIlI(var1);
   }

   private static boolean Illl() {
      return false;
   }

   private boolean lIII() {
      return this.llII.IllI() && this.IllI.IllI() == IlIIllll.II;
   }

   private void lIIl(class_310 var1, boolean var2) {
      this.IlIIl = llIIl(588996242, -35734046 ^ 789382649);
      if (var2 && this.IIIII(var1)) {
         class_746 var3 = var1.field_1724;
         long var4 = System.currentTimeMillis();
         this.lllIl = var4;
         if (this.lIIl <= 0.0F) {
            this.IIlI.add(this.IIIll.method_7972());
         }

         this.lII = var4 + this.lllI(this.IIll);
         if (this.lIIl > 0.0F) {
            this.lIlll = Math.min(var3.method_6063(), Math.max(var3.method_6032(), this.IIll(var3, var4)) + this.lIIl);
            this.IIIIIl = var4 + 1000L;
            this.IIlIl = var4 + 1400L;
            if (!this.IlII(var3)) {
               this.lII = Math.max(this.lII, var4 + 700L);
            }
         }

         this.IlIll = IIlIIlIIl.l;
         this.llIII = var4;
         this.IllIl = var3.field_6012 + 1;
      } else {
         this.lIlI(var1);
      }
   }

   private void lIlI(class_310 var1) {
      if (this.Illll && var1 != null && var1.field_1724 != null) {
         IlllIlII.I(var1, var1.field_1724.method_36454(), this.ll);
         this.Illll = false;
      }

      if (this.IIIllI.IllI() && this.Illl >= 0 && this.Illl < llIIl(588996205, -1729046533 ^ -576615014) && this.Illl != this.lllI) {
         this.I(var1, this.Illl);
      } else {
         k74.x.IIll.lllIl(var1, this, lllIII.I);
      }

      this.IIlII();
   }

   private boolean l(class_310 var1, long var2) {
      if (this.IIIIll.IllI() && this.IIIII(var1)) {
         float var4 = var1.field_1724.method_6032();
         float var5 = var1.field_1724.method_6063();
         if (var4 >= var5 - 0.25F) {
            this.IlIl();
            return false;
         } else {
            float var6 = this.IIll(var1.field_1724, var2);
            boolean var7 = var6 <= this.lIIIl.IllI();
            if (var7) {
               this.IIlIl = var2 + 1400L;
            }

            boolean var8 = var2 <= this.IIlIl;
            boolean var9 = var8 && var6 < var5 - 0.25F;
            return (var7 || var8) && this.IIIIIl > 0L && var6 > this.lIIIl.IllI() ? var9 : var7 || var9;
         }
      } else {
         return false;
      }
   }

   private void lIll(class_310 var1, int var2, long var3) {
      if (this.lIIll != var2) {
         boolean var5 = k74.x.IIll.lIIlI(var1) != var2;
         this.IIlll = var3 + (var5 ? this.lllI(this.IIIIII) : 0L);
         this.lIIll = var2;
      }

      this.I(var1, var2);
   }

   private boolean llII(class_310 var1, long var2) {
      class_1309 var4 = this.lIlll(var1, var2);
      return var4 == null || this.lI(var1, var4) < 1.0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 544096688;
      String[] var10002 = new String[2];
      short var12 = 4948;
      String[] var9 = var10002;
      int var8 = "̯᧼ꗊٶ씡༈궭ȼ贄ᘷ\uf5f9᯼鷉ᕶԠ҈ꖬ᭼紃ທ藸ጜ㗊ᚶ씢ᐈ㖪ജ씇ᓷ旸ଡ଼䷍\u0096┥Ѩ붨ᩜԃᘷ\ue5fdἜ緈ᵖ씡ᛨ喬ᔜ\udd06ᡗⷸͼ痏ᐶᔧ༈ⶬ᳜ᔂٷ䷹ཛྷ㗉ᗶ鴥ᕈ嶫ᮜ崆ᵷ\uf5fa൜旌፶\ue526Ԩ䶩জᴇȷ淿ᆼ◍ᗶ甤ႈ춪ნ괁ᗷ嗿\u171c痍ࡶ\uf523ᨈ\ue5abࠜԀ˗\ue5f8़巏ᚖ딢h\ue5a9\u181cᔄಗ\ue5f8\u173c헏ࣶ씧ᙈ\uedacǼ촆ᩗ闸ᡜ◊\u1776唠ᠨ춨\u18fc锄ഷ\uedf8\u139c䷊ᔶ\ue526ᤈ㶭\u1fdc촂·ⷽ᷼췍ჶ딣᳨붯Ɯ봀ᱷ淽ጜ旈ᘖ蔥ಈ薭ʜ촅ၷ痽᪼◈᎖货˨趮ቜᔂᗗ뷿᯼ᗌᙶ紡ᡨ涫ሼ씅ᩗ䷾\u139c\uf5cfᴖ씣ᬈ\ue5acǜ唇᪷\uf5fc᳜헎ᠶ䔥፨疨˜ꔃ\u0097\uddf8ᨼ᷎ז괣؈㶨ຼ锂\u1737\uf5ffʼා6ꔧɨ떩ଜ鴆᭗淾\u0adc◎ຖഥᆨ綨ᷜ䔀ŗ淽ᓜ뗉ö\uf527ై趯ᄼⴆ\u18f7\uf5faᤜⷋఖ㴠ᴈ閩μ甅ᗷ䗻ʜ뗈ᛖ\ue527ᮨඬ⁜\ue50e⺗ꗷ☼\uddc2㿶㔬⇨㶡㘼\ue508㍷◱⠼\uedc5⻖ᔬ∨関㮼\uf509\u2ef7䷴ⓜ췁≶\u2d2a⛈薤⤼蔏\u2d97\uf5f6⃜ꗃ\u2ef6蔯⼨떢\u2fdc촎㋗귳㢜㗂≖洭⊈䶣⸼\ued08ℷ엲㖜\uf5c2ぶﴪ␈ඤ㽜ᔉ⸗ᗵ㧼䗇㡖锫㷨햡㥜㴊㙷嗳⫝̸㗅㰶累⎈▢⧜ᴋ‗巷ぜ鷃⿶촯㹨\udda4➼촉㓗跱⡜藅▖㔮よ疦⼜ⴊ␗旰㉼ⷆ㛖ᴪㅈ붦⥼\uf50f⁗\ue5f0㣜跅〶촫⧈疢ⴼ崊㡷\ue5f5⑼巁㢖䴭㠨햢㼼ᔍ⹗闶⟜鷀⛶洬⹈綣㊼എ∗엱㦜헀㙖洩⊈얧⦜\ued0dプ\uedf3⡼藀㌶攩◨햤⺼ꔎ㧷뷲⬜\uf5c7㦖鴫\u2428ඤ㤼㴈㙷ꗴ⬜뗇〖\udd2d㸈ꖤ㰜\udd0c⢷旷㙜\ue5c1⧶ᴮ㈈薤⓼㔉⑷ײ㿼귃㧶䴬⥈ꖣ㼜ᔏ⮷痱⌼\ue5c6㟶ᔮ⽨ᖧ㡼ﴉ㲷ᗴ㩼헇㐖ﴩ␈涣㢼鴈\u2dd7뗴㺜跄⌖䴨⧨斢㡼ꔌⴗ귶㯼헆✶崬㶨趢⁜\ue509㱗䷳✼ⷆⶖ괫⢈ᶢ㗜┈ₗﷳ⬜췄埶蔵匈\uf5ba䭼唑䅗淭帼뗘喖攰䆈鶿䐼㔑䤗귭嘼㷙剖┵刨㶺吜㴑䧷ꗯ娼\ufdd8岶男䰈䶸䯼봔哗ꗪ䑜痞䬶唱嵨춸䷜ⴒ䇗旨䣼\ue5de䯖ꔲ妈\uddb9囜䴕哷痪唼跟䠶洱剨춸嫜촕䊗淬停◘世㴵䘨ᶹ仼\ued15亷䷫䬜痝剶㔰廈㶸喜\ued15䞗藬塜◙䋶ﴱ先ර䈼洗䔷뷯䫜\uf5da墖㔷储㖽兼봗䪷ⷬ䴼엝彶䴲孈薾剜딖呗緩䌼旛其蔷姨綸䆼픑䞷ᷨ䠼巙䡶씶䍨㶻亜唖勗\uede9䀜跚圖\ued32䎈▸䭜贐佗ᷭ䦼\ufdda俖┰䞈궾凼ⴑ䅗旯応\ufddc匶\u0530忈▽䟜\uf512南\ufde9䟼ᷞ䆶锶仈떽娜ഐ娷뗫嚼뷞嫶蔴唨䶸䭜鴑妷\ue5ec䟜巟䂶贰䖈\uf5b8䮼贑嚗◭寜\ueddc䦶\ued32䳈떸䑜┐囷㷯幜ᗙ唖딱嵨붺帼锗䇗ᷩ佼闝婶紶䢈䶻夜괔廗㗯䈜䗚峖锵忈㶸刜ⴑ䳗\u05ed䷼ᷚ伶촱壨\uddb8嗜洖婷헪䞼\ufdd9䈶攷坈綹䄼ഖ掗工惜藖犖鴿椨涵睼봛稗痠枼\uedd7柶촺紈喱沜ﴚ捗淢皜췗搶锹簨䶲碜攟糗巤撼痓漶픺湈鶲繼딜矗뷢獼귒甖괺焈\u0019繽閐沷絼杩헱淝쵞瓶疤睽喓旗䵿禉귴瞝ꕜ浶ᶢ疽鶒瞗ﵾ紩"
         .length();
      int var11 = 0;
      int var10 = 0;
      String var7 = "̯᧼ꗊٶ씡༈궭ȼ贄ᘷ\uf5f9᯼鷉ᕶԠ҈ꖬ᭼紃ທ藸ጜ㗊ᚶ씢ᐈ㖪ജ씇ᓷ旸ଡ଼䷍\u0096┥Ѩ붨ᩜԃᘷ\ue5fdἜ緈ᵖ씡ᛨ喬ᔜ\udd06ᡗⷸͼ痏ᐶᔧ༈ⶬ᳜ᔂٷ䷹ཛྷ㗉ᗶ鴥ᕈ嶫ᮜ崆ᵷ\uf5fa൜旌፶\ue526Ԩ䶩জᴇȷ淿ᆼ◍ᗶ甤ႈ춪ნ괁ᗷ嗿\u171c痍ࡶ\uf523ᨈ\ue5abࠜԀ˗\ue5f8़巏ᚖ딢h\ue5a9\u181cᔄಗ\ue5f8\u173c헏ࣶ씧ᙈ\uedacǼ촆ᩗ闸ᡜ◊\u1776唠ᠨ춨\u18fc锄ഷ\uedf8\u139c䷊ᔶ\ue526ᤈ㶭\u1fdc촂·ⷽ᷼췍ჶ딣᳨붯Ɯ봀ᱷ淽ጜ旈ᘖ蔥ಈ薭ʜ촅ၷ痽᪼◈᎖货˨趮ቜᔂᗗ뷿᯼ᗌᙶ紡ᡨ涫ሼ씅ᩗ䷾\u139c\uf5cfᴖ씣ᬈ\ue5acǜ唇᪷\uf5fc᳜헎ᠶ䔥፨疨˜ꔃ\u0097\uddf8ᨼ᷎ז괣؈㶨ຼ锂\u1737\uf5ffʼා6ꔧɨ떩ଜ鴆᭗淾\u0adc◎ຖഥᆨ綨ᷜ䔀ŗ淽ᓜ뗉ö\uf527ై趯ᄼⴆ\u18f7\uf5faᤜⷋఖ㴠ᴈ閩μ甅ᗷ䗻ʜ뗈ᛖ\ue527ᮨඬ⁜\ue50e⺗ꗷ☼\uddc2㿶㔬⇨㶡㘼\ue508㍷◱⠼\uedc5⻖ᔬ∨関㮼\uf509\u2ef7䷴ⓜ췁≶\u2d2a⛈薤⤼蔏\u2d97\uf5f6⃜ꗃ\u2ef6蔯⼨떢\u2fdc촎㋗귳㢜㗂≖洭⊈䶣⸼\ued08ℷ엲㖜\uf5c2ぶﴪ␈ඤ㽜ᔉ⸗ᗵ㧼䗇㡖锫㷨햡㥜㴊㙷嗳⫝̸㗅㰶累⎈▢⧜ᴋ‗巷ぜ鷃⿶촯㹨\udda4➼촉㓗跱⡜藅▖㔮よ疦⼜ⴊ␗旰㉼ⷆ㛖ᴪㅈ붦⥼\uf50f⁗\ue5f0㣜跅〶촫⧈疢ⴼ崊㡷\ue5f5⑼巁㢖䴭㠨햢㼼ᔍ⹗闶⟜鷀⛶洬⹈綣㊼എ∗엱㦜헀㙖洩⊈얧⦜\ued0dプ\uedf3⡼藀㌶攩◨햤⺼ꔎ㧷뷲⬜\uf5c7㦖鴫\u2428ඤ㤼㴈㙷ꗴ⬜뗇〖\udd2d㸈ꖤ㰜\udd0c⢷旷㙜\ue5c1⧶ᴮ㈈薤⓼㔉⑷ײ㿼귃㧶䴬⥈ꖣ㼜ᔏ⮷痱⌼\ue5c6㟶ᔮ⽨ᖧ㡼ﴉ㲷ᗴ㩼헇㐖ﴩ␈涣㢼鴈\u2dd7뗴㺜跄⌖䴨⧨斢㡼ꔌⴗ귶㯼헆✶崬㶨趢⁜\ue509㱗䷳✼ⷆⶖ괫⢈ᶢ㗜┈ₗﷳ⬜췄埶蔵匈\uf5ba䭼唑䅗淭帼뗘喖攰䆈鶿䐼㔑䤗귭嘼㷙剖┵刨㶺吜㴑䧷ꗯ娼\ufdd8岶男䰈䶸䯼봔哗ꗪ䑜痞䬶唱嵨춸䷜ⴒ䇗旨䣼\ue5de䯖ꔲ妈\uddb9囜䴕哷痪唼跟䠶洱剨춸嫜촕䊗淬停◘世㴵䘨ᶹ仼\ued15亷䷫䬜痝剶㔰廈㶸喜\ued15䞗藬塜◙䋶ﴱ先ර䈼洗䔷뷯䫜\uf5da墖㔷储㖽兼봗䪷ⷬ䴼엝彶䴲孈薾剜딖呗緩䌼旛其蔷姨綸䆼픑䞷ᷨ䠼巙䡶씶䍨㶻亜唖勗\uede9䀜跚圖\ued32䎈▸䭜贐佗ᷭ䦼\ufdda俖┰䞈궾凼ⴑ䅗旯応\ufddc匶\u0530忈▽䟜\uf512南\ufde9䟼ᷞ䆶锶仈떽娜ഐ娷뗫嚼뷞嫶蔴唨䶸䭜鴑妷\ue5ec䟜巟䂶贰䖈\uf5b8䮼贑嚗◭寜\ueddc䦶\ued32䳈떸䑜┐囷㷯幜ᗙ唖딱嵨붺帼锗䇗ᷩ佼闝婶紶䢈䶻夜괔廗㗯䈜䗚峖锵忈㶸刜ⴑ䳗\u05ed䷼ᷚ伶촱壨\uddb8嗜洖婷헪䞼\ufdd9䈶攷坈綹䄼ഖ掗工惜藖犖鴿椨涵睼봛稗痠枼\uedd7柶촺紈喱沜ﴚ捗淢皜췗搶锹簨䶲碜攟糗巤撼痓漶픺湈鶲繼딜矗뷢獼귒甖괺焈\u0019繽閐沷絼杩헱淝쵞瓶疤睽喓旗䵿禉귴瞝ꕜ浶ᶢ疽鶒瞗ﵾ紩";

      do {
         char var13 = var7.charAt(var11);
         String var10000 = var7.substring(var11 + 1, var11 + 1 + var13);
         int var15 = 0;
         char[] var14 = var10000.toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 107;
               case 1 -> 11;
               case 2 -> 193;
               case 3 -> 224;
               case 4 -> 63;
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

      IIlIlI = var9;
      IIlIll = new Object[var9.length];
      int var22 = 0;
      int var10001 = 0;
      IIlIIl = new int[394];
      byte[] var35 = "\bÊq\u0011É×\u0006EÆ\u0084@Bâ\u0091\u0006®Ú\u0093Æ\u0098Z\u0018ø\u0092ºNånÝmõ«\u0082Göø\u0014È¤\u0012-&Ù?Ñ\u0018Ñ\u0013V@ù\u001e£A7´Eïrª±©Ã+·PíHÀº¤ û®Ìf£LN\u009b\u0098\u0096Ø¸D\u0016\u0081i \u0006=êÁ)-ìB\u0084ø/\u00943 }\u008et-¦Ë\u001f§*<*ÎµHFØ\u008f#zÈ\u0098$áÂ7\bÀ!\u009a~\u0016<½Z©\u0096]\u00ad\u0095¶ùm.ª¦r\u0016Xk@j[ªìyï(\u001cÛE7\u0086~\u0093«®ú\n\u0096]\u0087iúé\u001eyx>íÐUà¦\u008dÙ\u009a\tëpFð\u0004ÿø\u0090!:v\u0085R¼Ø}Â£¯Oâü§J\u00adîÔ\u0017FÎ\u0098O³\u0010ðÚ\u0000àË\u009e:oý\tK¬ó,-1éðõo>\u0003\fÅ³[64µ\u009f3J\u00183'ÈÏ3Â\u008b-àÇ¢Eh4`V2ÚïCO\u0097¤,\u000b£]\u0082ä¬\u008bû`0ºA{T\u008d¼\u007fq87î.ÏÅêÍ¹\u000eU¹hê¢õDÂMY?ÔÜû~`ìv\u001eÂÑ\u0087}M\u0098é\u0015b\u00ad\u0006ê)\u009eÆ\u009f\u0016T\u009bÅ§§ÅI@\u007fa\n2\u0006\u000f+ªÊ\u008b\u008eJÔ&\u0099\u001cu8ïï2=\u008b¬L\u009a\u00123¹:ÌS\u0007H¿¬\u0006ÐüªV)\u008dÙ\u001f\u0004U|¬l!\u0000í?%¶\u009cM\nø\u0092D$OaTO\u001ap[\u00846ÃÕN7v!çJ3\u0095\u0081!]µ{¹j\u0095\u0012}UÁ¡Ó\u008eWÝ¾¹\n\u0010µ\u008eùÃ\nÌX'©LX©\u0010°©tø^E\u009d\u0091SÐÔ<0\u000eBqzÄÁÜ\u0087FB\bå\\Ôk¢«\u0098\u009e{\u0000Æ¦½u\u0014\u001cëe?\u000bi\u0087³Q\u0018'\u0016a^B\u001có\u0017=ë¤\u008fÝfÈXpÂÕ\u0015\u0082O\u0013\n3\u0098J\u0018\u0014ÉhKõ}T/t¯À\u0094!\u008fë\u0087áÏºaââ»\u009etÁÞÏ\u0017H÷YÓÏ¶\u0017â\u0011\u0083¾ß\u0081\u001e5\u0010¼\u008aW>\nQ\u0002\u008d\u0003õQ\u0003R\u0085Ü95\u0005\u0018ër¸ÏÄ¡\u0086\u0012\u0094?s\u0081\u0017T\u008b»l/\u0096.\u0010@\u0090ËFÐÜ\u009e7\u0016¿´h\u0006m\u008b\u0001\u0018>(\n\u0097\u00119¡\u0085Ñ\u0098\u0095\u0085\u0095\u0004kZ\u008fOéZ\u0098.JZZHT\u0089eÂÅ\b\u0095Þvf×ììI>\u0088\u0017\rÓu3féR²7¢¨ïÏ\b\u0006¨Qy;\u0006IòÜL(w Útá\u0098c\u0098Ã\u0080õÝ\u001ehGäÛ\u0007\u0014vò\u0090X\u0081({¬h\u0011d$Üfß\u009dä\u009c\u000b\u0082j\u001eÊ¶òà\u0083wYµ\u0081:\u00061¡TýOLµR±\u000bË\u0087\u009c_^\u001caÑ(*ºû\u009d\teE£Ä¥\u0083b2s$óJ(ãóàæ\u0011Ê@¨ ºÍý$@\u008e\u009e\u0015¯T\u0080\u0018ú\u001b;d(\\XNf\u0012\nmNªßgt\u0085\u0089b1B\u0097\u000f¦R\u0017:ÉF\u000fU\u0082Î\u0000<\u001dú¿I¡_\u0092\u009dó. pMÝ\u001ff½\u0091,>Q-²*HZPè3\t\u0089èK÷1T|2T©\u0014!0*\u0012õ\bþA©}#aK\u00838ök(Ù\u0089ù\u00adý½cm\u0010ç!&ÕgF\u007fõdC\u0005<6l\u008dë`\u008båC\u008f4~.w\u0006O@\u0019@(±ÍÀ\u0084\u008dW\u0083,éäö\t}\t\u0096\u001aQ)dË\u009bi°\u0081\u0001rÎ*[,\u0085K\u00977\u000fÀû»ìj¯gÁ\u0085÷qô\u007f\u0083C\u0005\u0099ñ¿É\u0097\u0011v\u0094-ãU&¬8\u001a6Ù\t\u0010:Ûùw\u0010£\u0081\u0085W\u0093}E°ÂòlO°ÙS\u0012Eû¥\u001a\u00862'_`s¯XbqÔ\u008aEÖuÚöPP\u0005tY»/\u008eZÄÍx\u0098\fÂ,yAÎ'a`\u0083oÃbç½À¢tg×Ûü\t\u0014ø\u0001m'gÂÖoJt=\fIA9?'´°£¨Á¡â\u0003RÑßäH\u000byÐøÀ\u0087Ã\u0081\"Ö\u0006z\u00980¼¢ö\bZ²÷\u008d\u0092\u000eÁ}\u0014,ý\u0087U@\u0081k93\u001f×ó5*ª\\g\u0083qéI¬S~Ø\u0088E\u0017w\u0087oèAQàwÃ$%a»´y\u0094uùYBoz\u001b+¨Û£rz\u0081ø\u0013Õ$jå\u0090sÄ\u0095k^,\u0086\u008c\u0016*¾\u0095mÙ\u007f\u008cn(Gª\u0089\u0081¨xbâ \u00ad\u008eGÇÐ9\ruõ\n÷ÉT\u00ad+%âL:\u0083å\u008f\u008a\\baª\u008d¾Ô\u0014|Yæ¢d3\u007föÈ\u009aù\u009d¡£¾\u001e\u0083g\u0000\u0005I]¤¥z&¤î--r¾\u008fN¸nL\u0085-t\u0096q,r8[Qqô\u009fè\u0016\u001bÄÏ´sB5ê\\¾}6\u0014\u000f½òLà§\u0013§\u009b\u0019¯÷ëçÆ§ZIn\f\u0003\u0017ü\u0001F~f\u009aÖH)8 S#]\u0080\u009e\u007f\\\ff%\\ôÛrÚòÞ÷8z¬\"\u009bW¨`G\u001e\u000b\u009e\u009eåd\u001d¡\u0083ôM\u0085e¡«\u0096\\o\u009f\u0001j4/Ã\u008d\u0085î3îD\u0090\u0090ê¿Ó¾3?\u0005`un\u0095` \u008f!\u0087Íw¹\u009a\u001dÊª&\u00ad5U4D³\u007f\tCt\u0088âÊiÂ×XÔcõ°\u0010×%\u009f\u008a\u0019·\u0013í2'é{\u0085·]ÄÁøJ\u0094Àn|Ëþ\u0005\u0018\u0018î\u001a\u0003\u0083,¾\u001eø¡\u0081\u0010T Yu~ç\u001d\u00148\u0097ô?u\u0099Þ \u0007\u000b»ShÁ¶^)W\u0016åÔ\u0096:0\u009cñµb\"¤\u009b¡s\u0080\r["
         .getBytes("ISO-8859-1");

      int var57;
      do {
         IIlIIl[var22] = ((var35[var10001] & 255) << 24 | (var35[var10001 + 1] & 255) << 16 | (var35[var10001 + 2] & 255) << 8 | var35[var10001 + 3] & 255)
            ^ 1830989572;
         var22 += 1;
         var57 = var10001 + 4;
         var10001 += 4;
      } while (var57 < var35.length);

      String[] var5 = new String[llIIl(588996289, var17 ^ -2025265687)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = llIlI('숩', -2140212676, 703303550, -2146611463, (char)'踯')).length();
      int var1 = llIIl(588996288, var17 ^ 1354452195);
      int var19 = -1;

      label101:
      while (true) {
         var22 = llIIl(588996291, var17 ^ -1896869616);
         String var28 = var2.substring(++var19, var19 + var1);
         byte var41 = -1;

         while (true) {
            label96: {
               char[] var59 = var28.toCharArray();
               int var71 = var59.length;
               int var6 = 0;
               var57 = var22;
               var46 = var59;
               var10001 = var71;
               char[] var83;
               int var90;
               if (var71 <= 1) {
                  var83 = var59;
                  var71 = var22;
                  var90 = var6;
               } else {
                  var57 = var22;
                  var10001 = var71;
                  if (var71 <= var6) {
                     break label96;
                  }

                  var83 = var59;
                  var71 = var22;
                  var90 = var6;
               }

               while (true) {
                  var83[var90] = (char)(var83[var90] ^ var71 ^ switch (var6 % llIIl(588996319, var17 ^ 416534126)) {
                     case 0 -> llIIl(588996318, var17 ^ -1238671861);
                     case 1 -> llIIl(588996313, var17 ^ -1055293548);
                     case 2 -> llIIl(588996312, var17 ^ -920899262);
                     case 3 -> llIIl(588996315, var17 ^ -1170089406);
                     case 4 -> llIIl(588996314, var17 ^ -166121894);
                     case 5 -> llIIl(588996309, var17 ^ -1634952079);
                     default -> llIIl(588996308, var17 ^ -1513576700);
                  });
                  var6++;
                  if (var57 == 0) {
                     var90 = var57;
                     var83 = var46;
                     var71 = var57;
                  } else {
                     if (var10001 <= var6) {
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
                  var5[var3++] = var64;
                  if ((var19 += var1) >= var4) {
                     IIIII = var5;
                     llIll = new String[llIIl(588996316, var17 ^ -1765360202)];
                     lIlIl = IlIIllIII.Ill(IIllI(llIIl(588996311, var17 ^ -1822428603), llIIl(588996310, var17 ^ -1652856604)));
                     Ill = IlIIllIII.Ill(IIllI(llIIl(588996305, var17 ^ -2019144561), llIIl(588996304, var17 ^ 1347793412)));
                     lIllI = IlIIllIII.Ill(IIllI(llIIl(588996307, var17 ^ -586313943), llIIl(588996306, var17 ^ -607622845)));
                     lIlI = IlIIllIII.Ill(IIllI(llIIl(588996269, var17 ^ 1986371185), llIIl(588996268, var17 ^ -1587151247)));
                     llIlI = IlIIllIII.Ill(IIllI(llIIl(588996271, var17 ^ 1136033320), llIIl(588996270, var17 ^ 725574209)));
                     IlII = IlIIllIII.Ill(IIllI(llIIl(588996265, var17 ^ 946103153), llIIl(588996264, var17 ^ 756657262)));
                     lIlII = IlIIllIII.Ill(IIllI(llIIl(588996267, var17 ^ 1113397814), llIIl(588996266, var17 ^ -323864691)));
                     IIIIl = IlIIllIII.Ill(IIllI(llIIl(588996261, var17 ^ -1791588055), llIIl(588996260, var17 ^ 791509669)));
                     llll = IlIIllIII.Ill(IIllI(llIIl(588996263, var17 ^ -769013582), llIIl(588996262, var17 ^ 1505265331)));
                     lIl = IlIIllIII.Ill(IIllI(llIIl(588996257, var17 ^ -1413712862), llIIl(588996256, var17 ^ 1610837223)));
                     IIIlIl = IlIIllIII.Ill(IIllI(llIIl(588996259, var17 ^ -2064364341), llIIl(588996258, var17 ^ -1407580114)));
                     IIllI = IlIIllIII.Ill(IIllI(llIIl(588996285, var17 ^ -1165344246), llIIl(588996284, var17 ^ 247136467)));
                     IlIlI = IlIIllIII.Ill(IIllI(llIIl(588996287, var17 ^ -1400422912), llIIl(588996286, var17 ^ 600730916)));
                     lllII = IlIIllIII.Ill(IIllI(llIIl(588996281, var17 ^ 217825128), llIIl(588996280, var17 ^ 1204344128)));
                     lIllll[] var25 = new lIllll[llIIl(588996283, var17 ^ 2013398794)];
                     var25[0] = new lIllll(lIlIl, IlIIllIII.Ill(IIllI(llIIl(588996282, var17 ^ -906920730), llIIl(588996277, var17 ^ 774487995))));
                     var25[1] = new lIllll(Ill, IlIIllIII.Ill(IIllI(llIIl(588996276, var17 ^ 1548793485), llIIl(588996279, var17 ^ -996396878))));
                     var25[2] = new lIllll(lIllI, IlIIllIII.Ill(IIllI(llIIl(588996278, var17 ^ 612540169), llIIl(588996273, var17 ^ 1914900515))));
                     var25[3] = new lIllll(lIlI, IlIIllIII.Ill(IIllI(llIIl(588996272, var17 ^ -2124119026), llIIl(588996275, var17 ^ -1038367450))));
                     var25[4] = new lIllll(llIlI, IlIIllIII.Ill(IIllI(llIIl(588996274, var17 ^ 1575977905), llIIl(588996237, var17 ^ 1028769660))));
                     var25[5] = new lIllll(IlII, IlIIllIII.Ill(IIllI(llIIl(588996236, var17 ^ -1034917552), llIIl(588996239, var17 ^ -1006579575))));
                     var25[llIIl(588996238, var17 ^ -1219913513)] = new lIllll(
                        lIlII, IlIIllIII.Ill(IIllI(llIIl(588996233, var17 ^ 318428561), llIIl(588996232, var17 ^ 1857760795)))
                     );
                     var25[llIIl(588996235, var17 ^ -657796724)] = new lIllll(
                        IIIIl, IlIIllIII.Ill(IIllI(llIIl(588996234, var17 ^ -1765474943), llIIl(588996229, var17 ^ 557313044)))
                     );
                     var25[llIIl(588996228, var17 ^ 1948698382)] = new lIllll(
                        llll, IlIIllIII.Ill(IIllI(llIIl(588996231, var17 ^ 1486187525), llIIl(588996230, var17 ^ 1495363739)))
                     );
                     var25[llIIl(588996225, var17 ^ 610601231)] = new lIllll(
                        lIl, IlIIllIII.Ill(IIllI(llIIl(588996224, var17 ^ 1326124092), llIIl(588996227, var17 ^ -683913467)))
                     );
                     var25[llIIl(588996226, var17 ^ 318987563)] = new lIllll(
                        IIIlIl, IlIIllIII.Ill(IIllI(llIIl(588996253, var17 ^ -1109856671), llIIl(588996252, var17 ^ -789678478)))
                     );
                     var25[llIIl(588996255, var17 ^ -606575275)] = new lIllll(
                        IIllI, IlIIllIII.Ill(IIllI(llIIl(588996254, var17 ^ 1687871902), llIIl(588996249, var17 ^ -954568604)))
                     );
                     var25[llIIl(588996248, var17 ^ 2129016294)] = new lIllll(
                        IlIlI, IlIIllIII.Ill(IIllI(llIIl(588996251, var17 ^ -1777795890), llIIl(588996250, var17 ^ -16468779)))
                     );
                     var25[llIIl(588996245, var17 ^ 1382453980)] = new lIllll(
                        lllII, IlIIllIII.Ill(IIllI(llIIl(588996244, var17 ^ 523009438), llIIl(588996247, var17 ^ -1294900743)))
                     );
                     I = List.of(var25);
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var64;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label101;
                  }

                  var4 = (var2 = llIlI(27343, -1818274871, 703303551, -1047274370, 'ở')).length();
                  var1 = llIIl(588996290, var17 ^ -195070024);
                  var19 = -1;
            }

            var22 = llIIl(588996317, var17 ^ 682006639);
            var28 = var2.substring(++var19, var19 + var1);
            var41 = 0;
         }
      }
   }

   private long lllI(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();
      return var2 == var4 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private boolean IIIII(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var1.field_1690 != null
         && var1.field_1690.field_1904 != null
         && var1.field_1755 == null
         && var1.field_1724.method_5805();
   }

   private boolean IIIIl(class_310 var1) {
      return !this.IllII.IllI() || var1.field_1724 != null && var1.field_1724.method_24828();
   }

   private IIIlIlIl IIIlI(class_6880<class_1291> var1, class_1293 var2) {
      int var3 = var2.method_5578();
      if (var1.equals(class_1294.field_5904)) {
         return var3 >= 1 ? Ill : lIlIl;
      } else if (var1.equals(class_1294.field_5910)) {
         return var3 >= 1 ? lIlI : lIllI;
      } else if (var1.equals(class_1294.field_5918)) {
         return llIlI;
      } else if (var1.equals(class_1294.field_5924)) {
         return var3 >= 1 ? lIlII : IlII;
      } else if (var1.equals(class_1294.field_5913)) {
         return var3 >= 1 ? llll : IIIIl;
      } else if (var1.equals(class_1294.field_5923)) {
         return lIl;
      } else if (var1.equals(class_1294.field_5925)) {
         return IIIlIl;
      } else if (var1.equals(class_1294.field_5905)) {
         return IIllI;
      } else if (var1.equals(class_1294.field_5906)) {
         return IlIlI;
      } else {
         return var1.equals(class_1294.field_5926) ? lllII : null;
      }
   }

   private float IIIll(class_310 var1) {
      return 90.0F;
   }

   private void IIlII() {
      this.lI++;
      this.IlIll = IIlIIlIIl.II;
      this.llIII = 0L;
      this.IIlll = 0L;
      this.IllIl = llIIl(588996204, 2097129065 ^ -471901018);
      this.lIIll = -1;
      this.lIIl = 0.0F;
      this.IIIll = class_1799.field_8037;
      this.lllI = -1;
      this.Illl = -1;
      this.IlIIl = llIIl(588996207, 2097129065 ^ -744932948);
      this.lIll = false;
      this.Illll = false;
      this.IIlI.clear();
      this.IIlII = null;
      this.IIIlll = 0L;
      this.IlllI = 0;
   }

   private static int llIIl(int var0, int var1) {
      int var2 = IIlIIl[var0 ^ 588996333] ^ var1 ^ var0;
      var2 += 58148;
      var2 -= 28258;
      var2 -= 64786;
      var2 += 30918;
      var2 -= 27827;
      var2 += 10286;
      var2 += 62488;
      var2 -= 56870;
      return var2 - 61077;
   }

   public IIllIIIl() {
      this(null);
   }

   private static String IIllI(int var0, int var1) {
      int var9 = -1303754003;
      int var2 = (var0 ^ llIIl(588996206, var9 ^ 258314011)) & llIIl(588996201, var9 ^ 1493060183);
      if (llIll[var2] == null) {
         char[] var3 = IIIII[var2].toCharArray();

         int var4 = switch (var3[0] & llIIl(588996200, var9 ^ 875226866)) {
            case 0 -> llIIl(588996203, var9 ^ 694621417);
            case 1 -> llIIl(588996202, var9 ^ -277306061);
            case 2 -> llIIl(588996197, var9 ^ -1234533377);
            case 3 -> llIIl(588996196, var9 ^ -1808178329);
            case 4 -> llIIl(588996199, var9 ^ -1470241837);
            case 5 -> llIIl(588996198, var9 ^ 1021753192);
            case 6 -> llIIl(588996193, var9 ^ 401962755);
            case 7 -> llIIl(588996192, var9 ^ 1175680432);
            case 8 -> llIIl(588996195, var9 ^ 1206707104);
            case 9 -> llIIl(588996194, var9 ^ 582844850);
            case 10 -> llIIl(588996221, var9 ^ 187385198);
            case 11 -> llIIl(588996220, var9 ^ 1248162860);
            case 12 -> llIIl(588996223, var9 ^ 2144094599);
            case 13 -> llIIl(588996222, var9 ^ -498629089);
            case 14 -> llIIl(588996217, var9 ^ 1982179666);
            case 15 -> llIIl(588996216, var9 ^ -1385161778);
            case 16 -> llIIl(588996219, var9 ^ 153326599);
            case 17 -> llIIl(588996218, var9 ^ 2041491203);
            case 18 -> llIIl(588996213, var9 ^ -110461513);
            case 19 -> llIIl(588996212, var9 ^ 1153258076);
            case 20 -> llIIl(588996215, var9 ^ 2053112328);
            case 21 -> llIIl(588996214, var9 ^ -1879866894);
            case 22 -> llIIl(588996209, var9 ^ 2009725791);
            case 23 -> llIIl(588996208, var9 ^ 1784448658);
            case 24 -> llIIl(588996211, var9 ^ 1824116780);
            case 25 -> llIIl(588996210, var9 ^ 552378879);
            case 26 -> llIIl(588996173, var9 ^ 1137114821);
            case 27 -> llIIl(588996172, var9 ^ -1845913644);
            case 28 -> llIIl(588996175, var9 ^ -1034249215);
            case 29 -> llIIl(588996174, var9 ^ -313837776);
            case 30 -> llIIl(588996169, var9 ^ 770310949);
            case 31 -> llIIl(588996168, var9 ^ 1769405777);
            case 32 -> llIIl(588996171, var9 ^ 1933410153);
            case 33 -> llIIl(588996170, var9 ^ 1683807409);
            case 34 -> llIIl(588996165, var9 ^ -1506098499);
            case 35 -> llIIl(588996164, var9 ^ -1716497500);
            case 36 -> llIIl(588996167, var9 ^ 1772937492);
            case 37 -> llIIl(588996166, var9 ^ 731806493);
            case 38 -> llIIl(588996161, var9 ^ -1023770190);
            case 39 -> llIIl(588996160, var9 ^ 789030320);
            case 40 -> llIIl(588996163, var9 ^ 354428236);
            case 41 -> llIIl(588996162, var9 ^ 1591376374);
            case 42 -> llIIl(588996189, var9 ^ -193708337);
            case 43 -> llIIl(588996188, var9 ^ -2058776329);
            case 44 -> llIIl(588996191, var9 ^ 246340473);
            case 45 -> llIIl(588996190, var9 ^ -1957540656);
            case 46 -> llIIl(588996185, var9 ^ 501937390);
            case 47 -> llIIl(588996184, var9 ^ 1072849777);
            case 48 -> llIIl(588996187, var9 ^ -501558980);
            case 49 -> llIIl(588996186, var9 ^ 662012667);
            case 50 -> llIIl(588996181, var9 ^ 249745070);
            case 51 -> llIIl(588996180, var9 ^ -737592469);
            case 52 -> llIIl(588996183, var9 ^ -317279543);
            case 53 -> llIIl(588996182, var9 ^ -1699935424);
            case 54 -> llIIl(588996177, var9 ^ 1618548073);
            case 55 -> llIIl(588996176, var9 ^ -491249622);
            case 56 -> llIIl(588996179, var9 ^ 485613889);
            case 57 -> llIIl(588996178, var9 ^ 1240706274);
            case 58 -> llIIl(588996141, var9 ^ -841759802);
            case 59 -> llIIl(588996140, var9 ^ -1287773649);
            case 60 -> llIIl(588996143, var9 ^ 1299799387);
            case 61 -> llIIl(588996142, var9 ^ 1613613339);
            case 62 -> llIIl(588996137, var9 ^ -1650213079);
            case 63 -> llIIl(588996136, var9 ^ 1183386596);
            case 64 -> llIIl(588996139, var9 ^ -1724435062);
            case 65 -> llIIl(588996138, var9 ^ 1509029011);
            case 66 -> llIIl(588996133, var9 ^ -1890163415);
            case 67 -> llIIl(588996132, var9 ^ -728668990);
            case 68 -> llIIl(588996135, var9 ^ 442719580);
            case 69 -> llIIl(588996134, var9 ^ 1423060437);
            case 70 -> llIIl(588996129, var9 ^ 22468515);
            case 71 -> llIIl(588996128, var9 ^ 1650931795);
            case 72 -> llIIl(588996131, var9 ^ 2087349455);
            case 73 -> llIIl(588996130, var9 ^ -954810653);
            case 74 -> llIIl(588996157, var9 ^ -1539509966);
            case 75 -> llIIl(588996156, var9 ^ -165685025);
            case 76 -> llIIl(588996159, var9 ^ 588636746);
            case 77 -> llIIl(588996158, var9 ^ 1964025448);
            case 78 -> llIIl(588996153, var9 ^ 1803366729);
            case 79 -> llIIl(588996152, var9 ^ -347578376);
            case 80 -> llIIl(588996155, var9 ^ -215542752);
            case 81 -> llIIl(588996154, var9 ^ -61961396);
            case 82 -> llIIl(588996149, var9 ^ 1127954366);
            case 83 -> llIIl(588996148, var9 ^ 1861182881);
            case 84 -> llIIl(588996151, var9 ^ 1543691078);
            case 85 -> llIIl(588996150, var9 ^ -485217642);
            case 86 -> llIIl(588996145, var9 ^ -800274868);
            case 87 -> llIIl(588996144, var9 ^ 1314447200);
            case 88 -> llIIl(588996147, var9 ^ -1399151143);
            case 89 -> 0;
            case 90 -> llIIl(588996146, var9 ^ 1973083570);
            case 91 -> llIIl(588996109, var9 ^ -853087448);
            case 92 -> llIIl(588996108, var9 ^ -1462009072);
            case 93 -> llIIl(588996111, var9 ^ -866613774);
            case 94 -> llIIl(588996110, var9 ^ -192096438);
            case 95 -> llIIl(588996105, var9 ^ -2125334547);
            case 96 -> llIIl(588996104, var9 ^ 2135580708);
            case 97 -> llIIl(588996107, var9 ^ -726982968);
            case 98 -> llIIl(588996106, var9 ^ 1368336975);
            case 99 -> llIIl(588996101, var9 ^ -1855819377);
            case 100 -> llIIl(588996100, var9 ^ -626527779);
            case 101 -> llIIl(588996103, var9 ^ -2088242344);
            case 102 -> llIIl(588996102, var9 ^ -112287525);
            case 103 -> llIIl(588996097, var9 ^ 1905915783);
            case 104 -> llIIl(588996096, var9 ^ 422648158);
            case 105 -> llIIl(588996099, var9 ^ -2107842200);
            case 106 -> llIIl(588996098, var9 ^ -1288532217);
            case 107 -> llIIl(588996125, var9 ^ -725394686);
            case 108 -> llIIl(588996124, var9 ^ 2030027261);
            case 109 -> llIIl(588996127, var9 ^ -795118596);
            case 110 -> llIIl(588996126, var9 ^ -183525513);
            case 111 -> llIIl(588996121, var9 ^ -433864907);
            case 112 -> 5;
            case 113 -> llIIl(588996120, var9 ^ 938082267);
            case 114 -> llIIl(588996123, var9 ^ 2104747070);
            case 115 -> llIIl(588996122, var9 ^ -701908267);
            case 116 -> llIIl(588996117, var9 ^ -1209687669);
            case 117 -> llIIl(588996116, var9 ^ 1015622962);
            case 118 -> llIIl(588996119, var9 ^ -1763839739);
            case 119 -> llIIl(588996118, var9 ^ 2038818698);
            case 120 -> llIIl(588996113, var9 ^ -2081303540);
            case 121 -> llIIl(588996112, var9 ^ 1703094657);
            case 122 -> llIIl(588996115, var9 ^ 1801707927);
            case 123 -> llIIl(588996114, var9 ^ -778976318);
            case 124 -> llIIl(588996589, var9 ^ 1347063157);
            case 125 -> llIIl(588996588, var9 ^ 628852535);
            case 126 -> llIIl(588996591, var9 ^ 663478738);
            case 127 -> llIIl(588996590, var9 ^ 1609765792);
            case 128 -> llIIl(588996585, var9 ^ 1863307905);
            case 129 -> llIIl(588996584, var9 ^ 1048640172);
            case 130 -> llIIl(588996587, var9 ^ 1286325372);
            case 131 -> llIIl(588996586, var9 ^ -1182190605);
            case 132 -> llIIl(588996581, var9 ^ 2051059929);
            case 133 -> llIIl(588996580, var9 ^ -1677641646);
            case 134 -> llIIl(588996583, var9 ^ -1643953269);
            case 135 -> llIIl(588996582, var9 ^ -1180376437);
            case 136 -> llIIl(588996577, var9 ^ 170051460);
            case 137 -> llIIl(588996576, var9 ^ -2010436587);
            case 138 -> llIIl(588996579, var9 ^ 1915245066);
            case 139 -> llIIl(588996578, var9 ^ -2064999925);
            case 140 -> llIIl(588996605, var9 ^ -804530544);
            case 141 -> llIIl(588996604, var9 ^ -619448549);
            case 142 -> llIIl(588996607, var9 ^ -1817053809);
            case 143 -> llIIl(588996606, var9 ^ 1102198060);
            case 144 -> llIIl(588996601, var9 ^ -1683665705);
            case 145 -> llIIl(588996600, var9 ^ -177836248);
            case 146 -> llIIl(588996603, var9 ^ -1856638860);
            case 147 -> llIIl(588996602, var9 ^ 706600311);
            case 148 -> llIIl(588996597, var9 ^ -1048649828);
            case 149 -> llIIl(588996596, var9 ^ -984764281);
            case 150 -> llIIl(588996599, var9 ^ 1288781823);
            case 151 -> llIIl(588996598, var9 ^ 1569756274);
            case 152 -> llIIl(588996593, var9 ^ 766342141);
            case 153 -> llIIl(588996592, var9 ^ -150256035);
            case 154 -> llIIl(588996595, var9 ^ 1022711010);
            case 155 -> llIIl(588996594, var9 ^ -559640217);
            case 156 -> llIIl(588996557, var9 ^ 1682057985);
            case 157 -> llIIl(588996556, var9 ^ 175819870);
            case 158 -> llIIl(588996559, var9 ^ 201262290);
            case 159 -> 3;
            case 160 -> llIIl(588996558, var9 ^ 1024426708);
            case 161 -> llIIl(588996553, var9 ^ 32883637);
            case 162 -> llIIl(588996552, var9 ^ 2098835010);
            case 163 -> llIIl(588996555, var9 ^ -475700197);
            case 164 -> llIIl(588996554, var9 ^ -690435406);
            case 165 -> 1;
            case 166 -> llIIl(588996549, var9 ^ 2130935403);
            case 167 -> llIIl(588996548, var9 ^ 1344399761);
            case 168 -> llIIl(588996551, var9 ^ 1949794414);
            case 169 -> llIIl(588996550, var9 ^ 2065530499);
            case 170 -> llIIl(588996545, var9 ^ -1382883013);
            case 171 -> llIIl(588996544, var9 ^ -665323821);
            case 172 -> llIIl(588996547, var9 ^ 1208681186);
            case 173 -> llIIl(588996546, var9 ^ 86758900);
            case 174 -> llIIl(588996573, var9 ^ -2039890943);
            case 175 -> llIIl(588996572, var9 ^ 668067125);
            case 176 -> llIIl(588996575, var9 ^ 2106229904);
            case 177 -> llIIl(588996574, var9 ^ -669486256);
            case 178 -> llIIl(588996569, var9 ^ -1883897305);
            case 179 -> llIIl(588996568, var9 ^ -1570893528);
            case 180 -> llIIl(588996571, var9 ^ -363320853);
            case 181 -> llIIl(588996570, var9 ^ -1851004692);
            case 182 -> llIIl(588996565, var9 ^ -1839541906);
            case 183 -> llIIl(588996564, var9 ^ 1978875520);
            case 184 -> llIIl(588996567, var9 ^ -1634682888);
            case 185 -> llIIl(588996566, var9 ^ 1916096652);
            case 186 -> llIIl(588996561, var9 ^ -981474684);
            case 187 -> llIIl(588996560, var9 ^ -159031688);
            case 188 -> llIIl(588996563, var9 ^ 1364832950);
            case 189 -> llIIl(588996562, var9 ^ -1337453308);
            case 190 -> llIIl(588996525, var9 ^ 1945684678);
            case 191 -> llIIl(588996524, var9 ^ -1646781852);
            case 192 -> 2;
            case 193 -> llIIl(588996527, var9 ^ 677833409);
            case 194 -> llIIl(588996526, var9 ^ 449901344);
            case 195 -> llIIl(588996521, var9 ^ -2088477168);
            case 196 -> llIIl(588996520, var9 ^ 99563211);
            case 197 -> llIIl(588996523, var9 ^ 1114379308);
            case 198 -> llIIl(588996522, var9 ^ -59253238);
            case 199 -> llIIl(588996517, var9 ^ 1490546146);
            case 200 -> llIIl(588996516, var9 ^ 1486666438);
            case 201 -> llIIl(588996519, var9 ^ -1899227055);
            case 202 -> llIIl(588996518, var9 ^ 1142741989);
            case 203 -> llIIl(588996513, var9 ^ -788135643);
            case 204 -> llIIl(588996512, var9 ^ -805261545);
            case 205 -> llIIl(588996515, var9 ^ -1392287229);
            case 206 -> llIIl(588996514, var9 ^ 342133775);
            case 207 -> llIIl(588996541, var9 ^ 868672653);
            case 208 -> llIIl(588996540, var9 ^ -912733330);
            case 209 -> llIIl(588996543, var9 ^ -2126216229);
            case 210 -> llIIl(588996542, var9 ^ 1098963769);
            case 211 -> llIIl(588996537, var9 ^ 1533096199);
            case 212 -> llIIl(588996536, var9 ^ -438476458);
            case 213 -> llIIl(588996539, var9 ^ 464793758);
            case 214 -> llIIl(588996538, var9 ^ -1256416483);
            case 215 -> llIIl(588996533, var9 ^ -342976535);
            case 216 -> llIIl(588996532, var9 ^ -2112614914);
            case 217 -> llIIl(588996535, var9 ^ -1269059676);
            case 218 -> llIIl(588996534, var9 ^ -1353594231);
            case 219 -> llIIl(588996529, var9 ^ 1645070985);
            case 220 -> llIIl(588996528, var9 ^ -1705522422);
            case 221 -> llIIl(588996531, var9 ^ 654331347);
            case 222 -> llIIl(588996530, var9 ^ 579186432);
            case 223 -> llIIl(588996493, var9 ^ 1347423262);
            case 224 -> llIIl(588996492, var9 ^ 1410519266);
            case 225 -> llIIl(588996495, var9 ^ -135525978);
            case 226 -> llIIl(588996494, var9 ^ -1737541980);
            case 227 -> llIIl(588996489, var9 ^ 138351143);
            case 228 -> llIIl(588996488, var9 ^ 1574502730);
            case 229 -> llIIl(588996491, var9 ^ -1813146011);
            case 230 -> llIIl(588996490, var9 ^ -933407563);
            case 231 -> llIIl(588996485, var9 ^ 2040308978);
            case 232 -> llIIl(588996484, var9 ^ -1193146597);
            case 233 -> llIIl(588996487, var9 ^ 1134635283);
            case 234 -> llIIl(588996486, var9 ^ -1015548071);
            case 235 -> llIIl(588996481, var9 ^ -1830291563);
            case 236 -> llIIl(588996480, var9 ^ 1934823665);
            case 237 -> llIIl(588996483, var9 ^ -1949627234);
            case 238 -> llIIl(588996482, var9 ^ 920170974);
            case 239 -> llIIl(588996509, var9 ^ -920149066);
            case 240 -> llIIl(588996508, var9 ^ 1326292665);
            case 241 -> llIIl(588996511, var9 ^ -1996851775);
            case 242 -> llIIl(588996510, var9 ^ -1783610943);
            case 243 -> llIIl(588996505, var9 ^ 672228071);
            case 244 -> llIIl(588996504, var9 ^ -324685115);
            case 245 -> llIIl(588996507, var9 ^ 1986732130);
            case 246 -> llIIl(588996506, var9 ^ 289452237);
            case 247 -> llIIl(588996501, var9 ^ -2013847504);
            case 248 -> llIIl(588996500, var9 ^ 951283473);
            case 249 -> llIIl(588996503, var9 ^ 1756559549);
            case 250 -> llIIl(588996502, var9 ^ 931959402);
            case 251 -> llIIl(588996497, var9 ^ -459502435);
            case 252 -> llIIl(588996496, var9 ^ 2136877246);
            case 253 -> llIIl(588996499, var9 ^ 80942680);
            case 254 -> llIIl(588996498, var9 ^ -1470968166);
            default -> 4;
         };
         int var5 = (var1 & llIIl(588996461, var9 ^ -2104128991)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & llIIl(588996460, var9 ^ -991534581)) >>> llIIl(588996463, var9 ^ -1981069284)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & llIIl(588996462, var9 ^ -75944859);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & llIIl(588996457, var9 ^ -1800199825);
            }
         }

         llIll[var2] = new String(var3).intern();
      }

      return llIll[var2];
   }

   private boolean IIlll(class_1799 var1) {
      for (class_1799 var3 : this.IIlI) {
         if (class_1799.method_31577(var3, var1)) {
            return true;
         }
      }

      return false;
   }

   private llIllIll IllII(class_746 var1, class_1799 var2, int var3, long var4, boolean var6) {
      String[] var7 = IIllllIl.IIIIl();
      if (!this.llIII(var2)) {
         return null;
      } else {
         class_1844 var8 = (class_1844)var2.method_58694(class_9334.field_49651);
         int var9 = 0;
         boolean var10 = false;
         float var11 = 0.0F;
         int var12 = Math.max(0, (int)Math.round(this.IIII.IllI() * 20.0));

         for (class_1293 var14 : var8.method_57397()) {
            class_6880 var15 = var14.method_5579();
            class_1291 var16 = (class_1291)var15.comp_349();
            if (var16.method_18792() == class_4081.field_18272) {
               return null;
            }

            if (var16.method_18792() == class_4081.field_18271 || var7 != null) {
               if (var16.method_5561()) {
                  float var17 = this.ll(var14);
                  if (!(var17 > 0.0F)) {
                     continue;
                  }

                  var11 += var17;
                  var10 = true;
                  if (var7 == null) {
                     continue;
                  }
               }

               if (this.lIIII(var15, var14) || var7 != null) {
                  var10 = true;
                  class_1293 var21 = var1.method_6112(var15);
                  if (var21 == null) {
                     var9 += 120;
                     if (var7 == null) {
                        continue;
                     }
                  }

                  if (var14.method_5578() > var21.method_5578()) {
                     var9 += llIIl(588996456, -214728396 ^ -1805890895)
                        + (var14.method_5578() - var21.method_5578()) * llIIl(588996459, -214728396 ^ 1771923409);
                     if (var7 == null) {
                        continue;
                     }
                  }

                  if (!var21.method_48559() && var21.method_5584() <= var12) {
                     var9 += 55;
                  }

                  if (var7 != null) {
                     break;
                  }
               }
            }
         }

         if (!var10) {
            return null;
         } else {
            if (var11 > 0.0F) {
               float var18 = this.IIll(var1, var4);
               boolean var19 = var18 <= this.lIIIl.IllI() && var18 < var1.method_6063() - 0.25F;
               if (!this.IIIIll.IllI() || !var6 && !var19) {
                  return var9 > 0 ? new llIllIll(var3, var9, 0.0F, var2.method_7972()) : null;
               }

               float var20 = Math.max(0.0F, var1.method_6063() - var18);
               if (var20 <= 0.25F) {
                  return var9 > 0 ? new llIllIll(var3, var9, 0.0F, var2.method_7972()) : null;
               }

               var9 += llIIl(588996458, -214728396 ^ 570071034) + Math.round(Math.min(var11, var20) * 20.0F);
            }

            return var9 > 0 ? new llIllIll(var3, var9, var11, var2.method_7972()) : null;
         }
      }
   }

   private void IllIl(class_310 var1, long var2) {
      if (this.IlIll == IIlIIlIIl.I) {
         if (this.lllI < 0 || this.lllI >= llIIl(588996453, 1495440523 ^ 901700592) || var2 - this.llIII > 500L) {
            this.IIlII();
         } else if (k74.x.IIll.IIlII(var1.field_1724.method_31548()) != this.lllI) {
            this.I(var1, this.lllI);
         } else if (var2 >= this.IIlll) {
            if (!this.llII.IllI() || this.lIllI(var1)) {
               this.Il(var1, var2);
            }
         }
      } else if (this.IlIll != IIlIIlIIl.ll) {
         if (this.IlIll == IIlIIlIIl.Il) {
            if (var1.field_1724.field_6012 >= this.IlIIl) {
               this.lI++;
               this.IllI(var1);
            }
         } else {
            if (this.IlIll == IIlIIlIIl.l && var1.field_1724.field_6012 >= this.IllIl) {
               if (this.II(var1, var2)) {
                  return;
               }

               this.lIlI(var1);
            }
         }
      } else if (var2 - this.IIIlll >= 2000L) {
         this.Il(var1, var2);
      } else if (this.IIlII == null) {
         this.Il(var1, var2);
      } else {
         float var4 = this.lllll.llllII(var1, this.IIlII, this.IlIII.IllI().floatValue());
         this.IlllI++;
         if (var4 <= 0.5F || this.IlllI >= llIIl(588996452, 1495440523 ^ 1687833962)) {
            this.Il(var1, var2);
         }
      }
   }

   private boolean IlllI(class_310 var1) {
      if (!this.IIIII(var1)) {
         return false;
      } else {
         if (!this.Illll) {
            this.ll = var1.field_1724.method_36455();
         }

         this.Illll = true;
         var1.field_1724.method_36457(90.0F);
         k74.x.IIll.IlIll(var1);
         class_1269 var2 = k74.x.IIll.IlIlIll(var1, class_1268.field_5808);
         boolean var3 = var2 != null && var2.method_23665();
         if (var3) {
            this.lIlII(var1);
         }

         return var3;
      }
   }

   @Override
   public void IllIll(class_310 var1) {
      if (!this.IIIII(var1)) {
         this.IIlII();
         this.IlIl();
      } else if (lIIIllII.ll(var1)) {
         this.IIlII();
      } else {
         long var2 = System.currentTimeMillis();
         this.Ill(var1.field_1724, var2);
         if (this.IlIll != IIlIIlIIl.II) {
            this.IllIl(var1, var2);
         } else if (this.IIIIl(var1)) {
            boolean var4 = var1.field_1724.method_36455() >= this.IIIlII.IllI() && this.llI(var1);
            boolean var5 = this.llII.IllI();
            boolean var6 = this.l(var1, var2);
            if (var2 >= this.lII || var6 && this.IIIl(var2)) {
               if (var4 || var5) {
                  if (!var5 || this.lIllI(var1)) {
                     if (this.llII(var1, var2)) {
                        llIllIll var7 = this.III(var1.field_1724, var2, var6);
                        if (var7 != null) {
                           if (!var6 || !(var7.l() <= 0.0F)) {
                              boolean var8 = !var4 && var5;
                              this.lIIlI(var1, var7, var2, var8);
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private float Illll(class_310 var1) {
      return var1.field_1724.method_36454();
   }

   private boolean lIIII(class_6880<class_1291> var1, class_1293 var2) {
      IIIlIlIl var3 = this.IIIlI(var1, var2);
      return var3 != null && this.IlIl.III(var3);
   }

   private void lIIIl(class_310 var1, long var2) {
      if (this.llII.IllI()) {
         if (var2 >= this.lII) {
            if (this.IIIIl(var1) && this.lIllI(var1) && this.llII(var1, var2)) {
               llIllIll var4 = this.III(var1.field_1724, var2, false);
               if (var4 != null && !(var4.l() > 0.0F)) {
                  this.lIIlI(var1, var4, var2, true);
               }
            }
         }
      }
   }

   @Override
   public void IlIII() {
      this.IIlII();
      this.IlIl();
      this.lII = 0L;
      this.IIlll = 0L;
      this.lllIl = 0L;
      this.lllll.IIIIIII();
   }

   private void lIIlI(class_310 var1, llIllIll var2, long var3, boolean var5) {
      if (var1.field_1690 != null && var1.field_1690.field_1904 != null) {
         if (this.IIIIl(var1)) {
            class_746 var6 = var1.field_1724;
            this.IIlI.clear();
            this.Illl = k74.x.IIll.IIlII(var6.method_31548());
            this.lllI = var2.Il();
            this.lIIl = var2.l();
            this.IIIll = var2.I();
            this.lIll = var5;
            this.lIll(var1, this.lllI, var3);
            if (k74.x.IIll.IIlII(var6.method_31548()) == this.lllI && var3 >= this.IIlll) {
               this.Il(var1, var3);
            } else {
               this.IlIll = IIlIIlIIl.I;
               this.llIII = var3;
            }
         }
      }
   }

   private boolean lIIll(long var1, class_310 var3) {
      if (this.IlIll == IIlIIlIIl.Il && var1 == this.lI) {
         k74.x.IIll.IlIll(var3);
         class_1269 var4 = k74.x.IIll.IlIlIll(var3, class_1268.field_5808);
         boolean var5 = var4 != null && var4.method_23665();
         this.lIIl(var3, var5);
         return var5;
      } else {
         return false;
      }
   }

   private static String llIlI(char var0, int var1, int var2, int var3, char var4) {
      int var9 = var2 ^ 703303550;
      char[] var8 = IIlIlI[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])IIlIll[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         IIlIll[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 51220;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ var7 ^ switch (var7 % 28) {
            default -> 119;
            case 1 -> 185;
            case 2 -> 37;
            case 3 -> 95;
            case 4 -> 26;
            case 5 -> 150;
            case 6 -> 160;
            case 7 -> 189;
            case 8 -> 115;
            case 9 -> 44;
            case 10 -> 151;
            case 11 -> 119;
            case 12 -> 90;
            case 13 -> 15;
            case 14 -> 129;
            case 15 -> 21;
            case 16 -> 204;
            case 17 -> 13;
            case 18 -> 179;
            case 19 -> 209;
            case 20 -> 7;
            case 21 -> 178;
            case 22 -> 131;
            case 23 -> 14;
            case 24 -> 214;
            case 25 -> 83;
            case 26 -> 161;
            case 27 -> 209;
         } ^ var3 ^ var0 ^ var6 ^ var2 ^ var1 ^ var4);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   @Override
   public void llIl() {
      this.IIlII();
      this.IlIl();
      this.lII = 0L;
      this.IIlll = 0L;
      this.lllIl = 0L;
      this.lllll.lIIl();
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      if (!this.IIIII(var1)) {
         this.IIlII();
         this.IlIl();
      } else if (lIIIllII.ll(var1)) {
         this.IIlII();
      } else {
         long var2 = System.currentTimeMillis();
         this.Ill(var1.field_1724, var2);
         if (this.IlIll == IIlIIlIIl.II) {
            this.lIIIl(var1, var2);
         } else if (!this.IIIIl(var1)) {
            if (this.IlIll != IIlIIlIIl.II) {
               this.IIlII();
            }
         } else if (this.IlIll != IIlIIlIIl.II) {
            this.IllIl(var1, var2);
         }
      }
   }

   private void lIlII(class_310 var1) {
      if (var1 != null && var1.field_1690 != null && var1.field_1690.field_1904 != null) {
         k74.x.IIll.lIIIIlI(var1.field_1690.field_1904);
         var1.field_1690.field_1904.method_23481(false);
      }
   }

   private boolean lIlIl(class_310 var1) {
      if (!this.IIIII(var1)) {
         return false;
      } else {
         k74.x.IIll.IlIll(var1);
         class_1269 var2 = k74.x.IIll.IlIlIll(var1, class_1268.field_5808);
         boolean var3 = var2 != null && var2.method_23665();
         if (var3) {
            this.lIlII(var1);
         }

         return var3;
      }
   }

   private boolean lIllI(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         class_746 var2 = var1.field_1724;
         return var2.method_24828() ? true : var2.method_18798().field_1351 < 0.0;
      } else {
         return false;
      }
   }

   private class_1309 lIlll(class_310 var1, long var2) {
      class_1309 var4 = this.llIl != null ? this.llIl.lIII() : null;
      if (this.lIl(var1, var4)) {
         return var4;
      } else {
         var4 = this.llIl != null ? this.llIl.l() : null;
         return this.llIl != null && this.llIl.I(var2) <= 2500L && this.lIl(var1, var4) ? var4 : null;
      }
   }

   private boolean llIII(class_1799 var1) {
      if (var1 != null && !var1.method_7960() && var1.method_31574(class_1802.field_8436)) {
         class_1844 var2 = (class_1844)var1.method_58694(class_9334.field_49651);
         if (var2 != null && var2.method_57405()) {
            for (class_1293 var4 : var2.method_57397()) {
               class_1291 var5 = (class_1291)var4.method_5579().comp_349();
               if (var5.method_18792() == class_4081.field_18272) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }
}
