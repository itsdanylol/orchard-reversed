package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import k74.y.IIlllllll;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1743;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_9362;

@Environment(EnvType.CLIENT)
public final class IIIIIIIll extends IlIIIIIIl {
   private boolean II;
   private Object Il;
   private final lllIIlII lI;
   private static final long ll = 325L;
   private lllIllI III;
   private final lIlllIl IIl;
   private final IllIII<IIlIIlll> IlI;
   private final lIlllIl Ill;
   private static final int[] IlIII;
   private final lllIIlII lII;
   private final IIlIII lIl;
   private long llI;
   private double lll;
   private final lllIIlII IIII;
   private boolean IIIl;
   private final lllIIlII IIlI;
   private final lllIIlII IIll;
   private static final String[] IlII;
   private final IllIII<IlIIIIlll> IlIl;
   private final lIllIlII IllI;
   private boolean Illl;
   private final lIlllIl lIII;
   private final lllIIlII lIIl;
   private static final String[] I;
   private final lllIIlII lIlI;
   private final IllIII<IIlIIIIlI> lIll;
   private final IIlIII llII;
   private final IIlIII llIl;
   private final IlIIl lllI;
   private final lllIIlII llll;
   private int IIIII;
   private double IIIIl;
   private double IIIlI;
   private final lllIIlII IIIll;
   private int IIlII;
   private final lIlllIl IIlIl;
   private int IIllI;
   private static final Object[] IlIlI;
   private static final String[] IlIIl;
   private long IIlll;

   private void I(class_310 var1) {
      class_638 var2 = var1 != null ? var1.field_1687 : null;
      if (!this.II || this.Il != var2) {
         this.IIIl();
         this.Il = var2;
         this.II = true;
      }
   }

   private double II(class_1799 var1) {
      return this.IllII(var1, this.Ill(class_310.method_1551(), null, var1));
   }

   private static boolean Il() {
      return false;
   }

   private boolean lI(class_310 var1, class_1309 var2) {
      if (var2 != var1.field_1724 && var2.method_5805()) {
         if (!var2.method_5767() || this.IIII.IllI() && var2 instanceof class_1657) {
            if (IIlllIlll.I(var2)) {
               return false;
            } else {
               return this.lIlI.IllI() && !(var2 instanceof class_1657) ? false : !this.IIll.IllI() || this.IIll(var1.field_1724.method_6047());
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public IIIIIIIll(IlIIl var1) {
      int var2 = 425169179;
      super(
         IlIIllIII.lI(lIlI(IIIIlI(-196576016, var2 ^ 1536635311), IIIIlI(-196576015, var2 ^ 1622170107))),
         lllIIlIl.I,
         IlIIllIII.lI(lIlI(IIIIlI(-196576014, var2 ^ -1760945367), IIIIlI(-196576013, var2 ^ 2024177703)))
      );
      this.IlIl = this.IllIIll(
         new IllIII<>(IlIIllIII.lI(lIlI(IIIIlI(-196576012, var2 ^ 1752001607), IIIIlI(-196576011, var2 ^ 683564727))), IlIIIIlll.class, IlIIIIlll.I)
      );
      this.lI = this.IllIIll(new lllIIlII(IlIIllIII.lI(lIlI(IIIIlI(-196576010, var2 ^ -540240818), IIIIlI(-196576009, var2 ^ 598647241))), false));
      this.lIl = this.IllIIll(
         new IIlIII(IlIIllIII.lI(lIlI(IIIIlI(-196576008, var2 ^ 168175985), IIIIlI(-196576007, var2 ^ 1721108744))), 3.0, 1.0, 3.0, 0.01)
            .IlII(IlIIllIII.lI(lIlI(IIIIlI(-196576006, var2 ^ 307461788), IIIIlI(-196576005, var2 ^ 899250373))))
      );
      this.IIl = this.IllIIll(
         new lIlllIl(IlIIllIII.lI(lIlI(IIIIlI(-196576004, var2 ^ 686865911), IIIIlI(-196576003, var2 ^ -396573381))), 2.7, 3.0, 1.0, 3.0, 0.01)
            .lI(IlIIllIII.lI(lIlI(IIIIlI(-196576002, var2 ^ -1203635248), IIIIlI(-196576001, var2 ^ -852473447))))
      );
      this.lIII = this.IllIIll(
         new lIlllIl(IlIIllIII.lI(lIlI(IIIIlI(-196576032, var2 ^ -878924628), IIIIlI(-196576031, var2 ^ -672070412))), 0.89, 0.93, 0.8, 1.0, 0.01)
      );
      this.Ill = this.IllIIll(
         new lIlllIl(IlIIllIII.lI(lIlI(IIIIlI(-196576030, var2 ^ -1316285061), IIIIlI(-196576029, var2 ^ -2104492114))), 0.89, 0.93, 0.8, 1.0, 0.01)
      );
      this.llIl = this.IllIIll(
         new IIlIII(IlIIllIII.lI(lIlI(IIIIlI(-196576028, var2 ^ -2013177859), IIIIlI(-196576027, var2 ^ -948167860))), 0.0, 0.0, 500.0, 5.0)
            .IlII(IlIIllIII.lI(lIlI(IIIIlI(-196576026, var2 ^ 1030170548), IIIIlI(-196576025, var2 ^ 1671156984))))
      );
      this.llII = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(lIlI(IIIIlI(-196576024, var2 ^ -724963440), IIIIlI(-196576023, var2 ^ -1782384753))), 0.0, 0.0, 50.0, 1.0)
            .IIIl(IlIIllIII.Ill(lIlI(IIIIlI(-196576022, var2 ^ -525951790), IIIIlI(-196576021, var2 ^ 477850432))))
      );
      this.IlI = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(lIlI(IIIIlI(-196576020, var2 ^ 551119317), IIIIlI(-196576019, var2 ^ 1088237462))), IIlIIlll.class, IIlIIlll.I)
            .lIlI(IIIIIIIll::IIII)
      );
      this.IIlIl = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(lIlI(IIIIlI(-196576018, var2 ^ 1369865330), IIIIlI(-196576017, var2 ^ 1546944780))), 3.0, 3.5, 3.0, 5.0, 0.05)
            .Ill(IlIIllIII.Ill(lIlI(IIIIlI(-196576048, var2 ^ -127774851), IIIIlI(-196576047, var2 ^ -1867151111))))
      );
      this.IIIll = this.IllIIll(new lllIIlII(IlIIllIII.lI(lIlI(IIIIlI(-196576046, var2 ^ -761717333), IIIIlI(-196576045, var2 ^ 685801841))), true));
      this.IIlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(lIlI(IIIIlI(-196576044, var2 ^ -1745308338), IIIIlI(-196576043, var2 ^ -475916949))), false));
      this.lIll = this.IllIIll(
         new IllIII<>(IlIIllIII.Ill(lIlI(IIIIlI(-196576042, var2 ^ 1007599641), IIIIlI(-196576041, var2 ^ 418343681))), IIlIIIIlI.class, IIlIIIIlI.II)
            .lIlI(this.IIlI::IllI)
      );
      this.lII = this.IllIIll(
         new lllIIlII(IlIIllIII.lI(lIlI(IIIIlI(-196576040, var2 ^ -1426178002), IIIIlI(-196576039, var2 ^ -580949124))), true).lIlI(IIIIIIIll::Il)
      );
      this.lIIl = this.IllIIll(new lllIIlII(IlIIllIII.lI(lIlI(IIIIlI(-196576038, var2 ^ -123524631), IIIIlI(-196576037, var2 ^ -388509734))), false));
      this.lIlI = this.IllIIll(new lllIIlII(IlIIllIII.lI(lIlI(IIIIlI(-196576036, var2 ^ 376687743), IIIIlI(-196576035, var2 ^ 252735433))), true));
      this.IIII = this.IllIIll(new lllIIlII(IlIIllIII.lI(lIlI(IIIIlI(-196576034, var2 ^ 1301357826), IIIIlI(-196576033, var2 ^ -2029215765))), false));
      this.IIll = this.IllIIll(new lllIIlII(IlIIllIII.lI(lIlI(IIIIlI(-196576064, var2 ^ 1285094849), IIIIlI(-196576063, var2 ^ 1697371105))), false));
      this.llll = this.IllIIll(new lllIIlII(IlIIllIII.lI(lIlI(IIIIlI(-196576062, var2 ^ -1014790767), IIIIlI(-196576061, var2 ^ -472637639))), false));
      this.IllI = this.IllIIll(new lIllIlII(IlIIllIII.lI(lIlI(IIIIlI(-196576060, var2 ^ -157622625), IIIIlI(-196576059, var2 ^ 1987925421)))));
      this.III = lllIllI.I;
      this.IIlII = IIIIlI(-196576058, var2 ^ 169817192);
      this.IIIII = -1;
      this.IIllI = IIIIlI(-196576057, var2 ^ 1692517345);
      this.lllI = var1;
      this.lIl.lIlI(this::lll);
      this.IIl.lIlI(this.lI::IllI);
      this.IllI.lIlI(this.llll::IllI);
      this.IIlIl.lIlI(this::llI);
   }

   private void ll() {
      if (!this.lI.IllI()) {
         this.lll = this.lIl.IllI();
      } else {
         double var1 = this.IIl.IIlI();
         double var3 = this.IIl.IlI();
         this.lll = var1 == var3 ? var1 : ThreadLocalRandom.current().nextDouble(var1, var3);
      }
   }

   private boolean III(class_746 var1) {
      return var1 != null && !var1.method_24828()
         ? !var1.method_5799()
            && !var1.method_5869()
            && !var1.method_5771()
            && !k74.x.IIll.lIllIl(var1)
            && !var1.method_5765()
            && !var1.method_6101()
            && !var1.method_5740()
            && !var1.method_6115()
            && !k74.x.IIll.IIlI(var1)
            && !k74.x.IIll.IllIllI(var1)
            && !var1.method_31549().field_7479
            && !var1.method_6059(class_1294.field_5902)
            && !var1.method_6059(class_1294.field_5919)
            && !var1.method_6059(class_1294.field_5906)
         : false;
   }

   private boolean IIl(class_1309 var1) {
      if (this.lllI != null && var1 != null) {
         class_1309 var2 = this.lllI.l();
         if (var2 == null) {
            return false;
         } else {
            return var2 != var1 && var2.method_5628() != var1.method_5628()
               ? var2.method_5667() != null && var2.method_5667().equals(var1.method_5667())
               : true;
         }
      } else {
         return false;
      }
   }

   private boolean Ill(class_310 var1, class_1309 var2, class_1799 var3) {
      if (this.IIlI.IllI() && this.lIlll(var3) && var1 != null && var1.field_1724 != null && var1.field_1724.method_24828() && !var1.field_1724.method_5624()) {
         if (this.lIll.IllI() == IIlIIIIlI.II) {
            return true;
         } else {
            boolean var4 = var1.field_1724.method_18798().method_37268() > 4.0E-4 || var2 != null && var2.method_18798().method_37268() > 4.0E-4;
            long var5 = var1.field_1724.field_6012 / 4L;
            long var7 = var2 == null ? 0L : var2.method_5628();
            long var9 = var5 * -7046029254386353131L + var7 * -4417276706812531889L + (var4 ? 1L : 0L);
            long var11 = var4 ? 5L : 3L;
            return Math.floorMod(var9, var11) != 0L;
         }
      } else {
         return false;
      }
   }

   private boolean lII(class_310 var1, class_3966 var2, class_1309 var3) {
      IIIIIllII var4 = IIIIIllII.III();
      if (var4 != null && var1 != null && var1.field_1724 != null && var3 != null) {
         IllIIIIl var5 = var4.II().Illl();
         if (var5 != null && var5.IIIIlIl()) {
            if (var5.lllI(var3)) {
               return true;
            }

            if (var5.IIlIII(var1, var3)) {
               return true;
            }
         }

         IIlIIlIII var6 = var4.II().lIIIIl();
         if (var6 != null && var6.IIIIlIl()) {
            if (var6.IIlII(var3)) {
               return true;
            }

            if (var6.lIIlI(var1, var3)) {
               if (var2 != null && var6.llIlI(var3) && var1.field_1724.method_33571().method_1025(var2.method_17784()) <= 9.0) {
                  this.l(var1, var2, var3);
               }

               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void llIIII(class_310 var1) {
      if (this.IIIIlIl() && this.IIIII(var1)) {
         this.IlIl(var1);
      }
   }

   private boolean lIl(class_310 var1, class_1309 var2) {
      if (k74.x.IIll.IllIl(var1) <= 0 && k74.x.IIll.lIllII(var1) <= 0) {
         class_1799 var3 = var1.field_1724.method_6047();
         float var4 = var1.field_1724.method_7261(0.5F);
         boolean var5 = this.Ill(var1, var2, var3);
         float var6 = (float)this.IllII(var3, var5);
         if (var4 < var6) {
            return false;
         } else if (var5
            && var1.field_1724.method_24828()
            && !var1.field_1724.method_5624()
            && (!(var1.field_1724.field_6017 > 0.0) || var1.field_1724.method_24828())
            && var4 > 0.9F) {
            return false;
         } else if (this.Illl(var3)) {
            return !this.lIll(var1, var4);
         } else {
            return this.IIIll.IllI() && !this.lIIl.IllI() && k74.x.IIll.IIIl(var2, var1.field_1724)
               ? !this.III(var1.field_1724) || llIllIlI.lIll(var1.field_1724.field_6017)
               : !this.Illll(var1, var2, var4);
         }
      } else {
         return false;
      }
   }

   private boolean llI() {
      return this.llII.IllI() > 0.0;
   }

   private boolean lll() {
      return !this.lI.IllI();
   }

   private static boolean IIII() {
      return false;
   }

   private void IIIl() {
      this.Il = null;
      this.II = false;
      this.IIIII = -1;
      this.llIII();
      this.IIllI();
      this.ll();
      this.llIll();
   }

   private void IIlI(class_310 var1) {
      this.ll();
      this.llIll();
   }

   private boolean IIll(class_1799 var1) {
      if (var1.method_7960()) {
         return false;
      } else if (!(var1.method_7909() instanceof class_1743) && !(var1.method_7909() instanceof class_9362)) {
         String var2 = class_7923.field_41178.method_10221(var1.method_7909()).method_12832();
         return var2.endsWith(IlIIllIII.lI(lIlI(IIIIlI(-196576056, -886814189 ^ 1007702231), IIIIlI(-196576055, -886814189 ^ -1912649248))));
      } else {
         return true;
      }
   }

   private void IlII(class_310 var1) {
      if (this.IIIl) {
         this.IIIl = false;
      }

      if (this.Illl && var1 != null && var1.field_1724 != null && this.lIIll(var1)) {
         this.llIIl(var1);
      }

      this.III = lllIllI.I;
      this.IIlII = IIIIlI(-196576054, 1826480350 ^ 957259438);
      this.llI = 0L;
      this.Illl = false;
   }

   private void IlIl(class_310 var1) {
      if (this.IIIIlIl()) {
         if (var1.field_1724 == null || var1.field_1687 == null || var1.field_1755 != null || var1.field_1761 == null) {
            this.IIllI();
         } else if (!this.lIIIl(var1)) {
            if (var1.field_1724.method_6115()) {
               this.llIII();
            } else if (this.llll.IllI() && !this.lllll(var1)) {
               this.llIII();
            } else {
               double var2 = this.IIIIl();
               double var4 = Math.max(var2, this.IIlIl.IIlI());
               double var6 = Math.max(var4, this.IIlIl.IlI());
               class_3966 var8 = var1.field_1765 instanceof class_3966 var9 ? var9 : null;
               if (var8 == null && var2 > 3.0) {
                  var8 = k74.x.IIll.lIlll(var1, var2);
               }

               if (var8 == null) {
                  if (this.llII.IllI() > 0.0 && this.IlI.IllI() == IIlIIlll.I) {
                     class_3966 var14 = k74.x.IIll.lIlll(var1, var6);
                     if (var14 != null) {
                        class_1309 var17 = k74.x.IIll.llIlll(var1, var14);
                        if (var17 != null && this.lI(var1, var17) && this.IllIl(var17)) {
                           double var11 = var1.field_1724.method_33571().method_1022(var14.method_17784());
                           if (var11 >= var4 && var11 <= var6 && this.IlllI(var17) && this.lIl(var1, var17)) {
                              if (ThreadLocalRandom.current().nextDouble(0.0, 100.0) < this.llII.IllI()) {
                                 this.IIIIIl(var1);
                                 return;
                              }

                              this.IIlI(var1);
                           }
                        }
                     }
                  }

                  this.llIII();
               } else {
                  class_1309 var13 = k74.x.IIll.llIlll(var1, var8);
                  if (var13 == null || !this.lI(var1, var13)) {
                     this.llIII();
                  } else if (!this.IllIl(var13)) {
                     this.llIII();
                  } else if (!this.IIlll(var1, var8, var13, var2)) {
                     if (this.llII.IllI() > 0.0 && this.IlI.IllI() == IIlIIlll.I) {
                        double var16 = var1.field_1724.method_33571().method_1022(var8.method_17784());
                        if (var16 >= var4 && var16 <= var6 && this.IlllI(var13) && this.lIl(var1, var13)) {
                           if (ThreadLocalRandom.current().nextDouble(0.0, 100.0) < this.llII.IllI()) {
                              this.IIIIIl(var1);
                              return;
                           }

                           this.IIlI(var1);
                        }
                     }

                     this.llIII();
                  } else if (!var1.field_1724.method_6115()) {
                     boolean var15 = k74.x.IIll.IIIl(var13, var1.field_1724);
                     if (var15 && !this.lIIl.IllI()) {
                        this.lII(var1, var8, var13);
                     } else if (this.IlllI(var13)) {
                        if (this.lIl(var1, var13)) {
                           if (!this.lllII(var1, var13)) {
                              if (!this.lIlIl(var1, var13)) {
                                 if (this.llII(var1, var13)) {
                                    this.IIlI(var1);
                                 } else {
                                    this.l(var1, var8, var13);
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private double IllI(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();
      return var2 == var4 ? var2 : ThreadLocalRandom.current().nextDouble(var2, var4);
   }

   private boolean Illl(class_1799 var1) {
      return var1 != null && !var1.method_7960() && var1.method_7909() instanceof class_9362;
   }

   public boolean lIII(class_310 var1, class_1309 var2) {
      return this.III == lllIllI.ll;
   }

   private void lIIl(class_310 var1, class_1309 var2) {
      if (var1.field_1724 != null && var1.field_1761 != null && var2 != null) {
         this.IIIl = true;
         this.Illl = this.llllI(var1) && this.lIIll(var1);
         k74.x.IIll.IIlIlI(var1, 3);
         this.lIlII(var1);
         var1.field_1761.method_2897(var1.field_1724);
         this.III = lllIllI.ll;
         this.IIlII = var2.method_5628();
         this.llI = System.currentTimeMillis() + 325L;
      }
   }

   private static String lIlI(int var0, int var1) {
      int var9 = 728002859;
      int var2 = (var0 ^ IIIIlI(-196576053, var9 ^ 1734454153)) & IIIIlI(-196576052, var9 ^ 149037922);
      if (IlII[var2] == null) {
         char[] var3 = I[var2].toCharArray();

         int var4 = switch (var3[0] & IIIIlI(-196576051, var9 ^ -842304690)) {
            case 0 -> IIIIlI(-196576050, var9 ^ 691089784);
            case 1 -> IIIIlI(-196576049, var9 ^ 1602757227);
            case 2 -> IIIIlI(-196576080, var9 ^ 1535441824);
            case 3 -> IIIIlI(-196576079, var9 ^ 956214995);
            case 4 -> IIIIlI(-196576078, var9 ^ 1689281451);
            case 5 -> IIIIlI(-196576077, var9 ^ 94376653);
            case 6 -> IIIIlI(-196576076, var9 ^ 359968405);
            case 7 -> IIIIlI(-196576075, var9 ^ -1222277805);
            case 8 -> IIIIlI(-196576074, var9 ^ -957546094);
            case 9 -> IIIIlI(-196576073, var9 ^ 1474362521);
            case 10 -> IIIIlI(-196576072, var9 ^ 306208132);
            case 11 -> IIIIlI(-196576071, var9 ^ -1357402386);
            case 12 -> IIIIlI(-196576070, var9 ^ 1489590628);
            case 13 -> IIIIlI(-196576069, var9 ^ 1132145134);
            case 14 -> IIIIlI(-196576068, var9 ^ 1657945970);
            case 15 -> IIIIlI(-196576067, var9 ^ 724193389);
            case 16 -> IIIIlI(-196576066, var9 ^ -86136767);
            case 17 -> IIIIlI(-196576065, var9 ^ 892879644);
            case 18 -> IIIIlI(-196576096, var9 ^ 331724222);
            case 19 -> IIIIlI(-196576095, var9 ^ 1124843100);
            case 20 -> IIIIlI(-196576094, var9 ^ -1973526549);
            case 21 -> IIIIlI(-196576093, var9 ^ -125001355);
            case 22 -> IIIIlI(-196576092, var9 ^ -356064684);
            case 23 -> IIIIlI(-196576091, var9 ^ -135397215);
            case 24 -> IIIIlI(-196576090, var9 ^ -2101602812);
            case 25 -> IIIIlI(-196576089, var9 ^ -1737668909);
            case 26 -> IIIIlI(-196576088, var9 ^ 1360909757);
            case 27 -> IIIIlI(-196576087, var9 ^ 435898723);
            case 28 -> IIIIlI(-196576086, var9 ^ -1634632902);
            case 29 -> IIIIlI(-196576085, var9 ^ 182049389);
            case 30 -> IIIIlI(-196576084, var9 ^ -1330987175);
            case 31 -> IIIIlI(-196576083, var9 ^ -1708321668);
            case 32 -> IIIIlI(-196576082, var9 ^ -1205035724);
            case 33 -> IIIIlI(-196576081, var9 ^ 987769504);
            case 34 -> IIIIlI(-196576112, var9 ^ -1180186090);
            case 35 -> IIIIlI(-196576111, var9 ^ 802533183);
            case 36 -> 1;
            case 37 -> IIIIlI(-196576110, var9 ^ -1395839981);
            case 38 -> IIIIlI(-196576109, var9 ^ -1954471996);
            case 39 -> IIIIlI(-196576108, var9 ^ 216439844);
            case 40 -> IIIIlI(-196576107, var9 ^ 550931862);
            case 41 -> IIIIlI(-196576106, var9 ^ -1461128487);
            case 42 -> IIIIlI(-196576105, var9 ^ -1698105577);
            case 43 -> IIIIlI(-196576104, var9 ^ -370789614);
            case 44 -> IIIIlI(-196576103, var9 ^ 94234541);
            case 45 -> IIIIlI(-196576102, var9 ^ -1759015355);
            case 46 -> IIIIlI(-196576101, var9 ^ 998864566);
            case 47 -> IIIIlI(-196576100, var9 ^ -1309517049);
            case 48 -> IIIIlI(-196576099, var9 ^ 143798547);
            case 49 -> IIIIlI(-196576098, var9 ^ 126279673);
            case 50 -> IIIIlI(-196576097, var9 ^ 641798762);
            case 51 -> IIIIlI(-196576128, var9 ^ 852927654);
            case 52 -> IIIIlI(-196576127, var9 ^ -1012994776);
            case 53 -> IIIIlI(-196576126, var9 ^ 1480903384);
            case 54 -> IIIIlI(-196576125, var9 ^ 979119297);
            case 55 -> IIIIlI(-196576124, var9 ^ 1757513031);
            case 56 -> IIIIlI(-196576123, var9 ^ -2115153260);
            case 57 -> IIIIlI(-196576122, var9 ^ 1437537655);
            case 58 -> IIIIlI(-196576121, var9 ^ 1693860510);
            case 59 -> IIIIlI(-196576120, var9 ^ -316135797);
            case 60 -> IIIIlI(-196576119, var9 ^ 1655163652);
            case 61 -> IIIIlI(-196576118, var9 ^ 1336756814);
            case 62 -> IIIIlI(-196576117, var9 ^ 1448540845);
            case 63 -> IIIIlI(-196576116, var9 ^ -840242653);
            case 64 -> IIIIlI(-196576115, var9 ^ -52166363);
            case 65 -> IIIIlI(-196576114, var9 ^ -441067647);
            case 66 -> IIIIlI(-196576113, var9 ^ 1786840287);
            case 67 -> IIIIlI(-196576144, var9 ^ 1584654385);
            case 68 -> IIIIlI(-196576143, var9 ^ -1987738627);
            case 69 -> IIIIlI(-196576142, var9 ^ -1535330770);
            case 70 -> IIIIlI(-196576141, var9 ^ -1856072567);
            case 71 -> IIIIlI(-196576140, var9 ^ -680478396);
            case 72 -> IIIIlI(-196576139, var9 ^ 320428880);
            case 73 -> IIIIlI(-196576138, var9 ^ -1078770812);
            case 74 -> IIIIlI(-196576137, var9 ^ 1489778899);
            case 75 -> IIIIlI(-196576136, var9 ^ 563369053);
            case 76 -> IIIIlI(-196576135, var9 ^ 171098708);
            case 77 -> IIIIlI(-196576134, var9 ^ 1815327975);
            case 78 -> IIIIlI(-196576133, var9 ^ -673945367);
            case 79 -> IIIIlI(-196576132, var9 ^ 697795866);
            case 80 -> IIIIlI(-196576131, var9 ^ -227323988);
            case 81 -> IIIIlI(-196576130, var9 ^ 287962912);
            case 82 -> IIIIlI(-196576129, var9 ^ -1775513502);
            case 83 -> IIIIlI(-196576160, var9 ^ 251607133);
            case 84 -> IIIIlI(-196576159, var9 ^ 651985373);
            case 85 -> IIIIlI(-196576158, var9 ^ -78098651);
            case 86 -> IIIIlI(-196576157, var9 ^ 131431636);
            case 87 -> IIIIlI(-196576156, var9 ^ -1384427144);
            case 88 -> IIIIlI(-196576155, var9 ^ 1775486440);
            case 89 -> IIIIlI(-196576154, var9 ^ -424629256);
            case 90 -> IIIIlI(-196576153, var9 ^ 1871028798);
            case 91 -> IIIIlI(-196576152, var9 ^ 734398104);
            case 92 -> IIIIlI(-196576151, var9 ^ 2143816778);
            case 93 -> IIIIlI(-196576150, var9 ^ 544974438);
            case 94 -> IIIIlI(-196576149, var9 ^ -1106990242);
            case 95 -> IIIIlI(-196576148, var9 ^ -499932164);
            case 96 -> IIIIlI(-196576147, var9 ^ 62728376);
            case 97 -> IIIIlI(-196576146, var9 ^ 1024885781);
            case 98 -> IIIIlI(-196576145, var9 ^ -383608307);
            case 99 -> IIIIlI(-196576176, var9 ^ 928105438);
            case 100 -> IIIIlI(-196576175, var9 ^ 324109321);
            case 101 -> 5;
            case 102 -> IIIIlI(-196576174, var9 ^ 1070563732);
            case 103 -> IIIIlI(-196576173, var9 ^ -188136447);
            case 104 -> IIIIlI(-196576172, var9 ^ -1555464370);
            case 105 -> IIIIlI(-196576171, var9 ^ 356779776);
            case 106 -> IIIIlI(-196576170, var9 ^ -1551624754);
            case 107 -> IIIIlI(-196576169, var9 ^ -51373293);
            case 108 -> IIIIlI(-196576168, var9 ^ 1700617569);
            case 109 -> IIIIlI(-196576167, var9 ^ -714946783);
            case 110 -> IIIIlI(-196576166, var9 ^ 1723545583);
            case 111 -> IIIIlI(-196576165, var9 ^ -1824737291);
            case 112 -> IIIIlI(-196576164, var9 ^ -1658392977);
            case 113 -> IIIIlI(-196576163, var9 ^ 971010931);
            case 114 -> IIIIlI(-196576162, var9 ^ -1738019883);
            case 115 -> IIIIlI(-196576161, var9 ^ -2058484886);
            case 116 -> IIIIlI(-196576192, var9 ^ -373610572);
            case 117 -> IIIIlI(-196576191, var9 ^ -1745463818);
            case 118 -> IIIIlI(-196576190, var9 ^ -625230820);
            case 119 -> IIIIlI(-196576189, var9 ^ -1653586037);
            case 120 -> IIIIlI(-196576188, var9 ^ -1719560777);
            case 121 -> IIIIlI(-196576187, var9 ^ 2100092217);
            case 122 -> IIIIlI(-196576186, var9 ^ 184384567);
            case 123 -> IIIIlI(-196576185, var9 ^ 1040372132);
            case 124 -> IIIIlI(-196576184, var9 ^ 1189899571);
            case 125 -> IIIIlI(-196576183, var9 ^ 1021673625);
            case 126 -> IIIIlI(-196576182, var9 ^ 1363831092);
            case 127 -> IIIIlI(-196576181, var9 ^ 1147528393);
            case 128 -> IIIIlI(-196576180, var9 ^ 998516262);
            case 129 -> IIIIlI(-196576179, var9 ^ -250848568);
            case 130 -> IIIIlI(-196576178, var9 ^ -347451396);
            case 131 -> IIIIlI(-196576177, var9 ^ -1397437555);
            case 132 -> IIIIlI(-196576208, var9 ^ 242697408);
            case 133 -> IIIIlI(-196576207, var9 ^ 1306303879);
            case 134 -> IIIIlI(-196576206, var9 ^ -790222904);
            case 135 -> IIIIlI(-196576205, var9 ^ 200506616);
            case 136 -> IIIIlI(-196576204, var9 ^ 1106907208);
            case 137 -> IIIIlI(-196576203, var9 ^ -278064185);
            case 138 -> IIIIlI(-196576202, var9 ^ -25721482);
            case 139 -> IIIIlI(-196576201, var9 ^ -1924815024);
            case 140 -> IIIIlI(-196576200, var9 ^ 1402419157);
            case 141 -> IIIIlI(-196576199, var9 ^ 1797782179);
            case 142 -> IIIIlI(-196576198, var9 ^ -575488758);
            case 143 -> IIIIlI(-196576197, var9 ^ -1110654870);
            case 144 -> IIIIlI(-196576196, var9 ^ 145600142);
            case 145 -> IIIIlI(-196576195, var9 ^ -1705606132);
            case 146 -> IIIIlI(-196576194, var9 ^ 1536291043);
            case 147 -> IIIIlI(-196576193, var9 ^ -1632036169);
            case 148 -> IIIIlI(-196576224, var9 ^ 555730967);
            case 149 -> IIIIlI(-196576223, var9 ^ 1111124374);
            case 150 -> IIIIlI(-196576222, var9 ^ -114317655);
            case 151 -> IIIIlI(-196576221, var9 ^ -35398575);
            case 152 -> IIIIlI(-196576220, var9 ^ 1219596998);
            case 153 -> IIIIlI(-196576219, var9 ^ -1807751491);
            case 154 -> IIIIlI(-196576218, var9 ^ -1242428574);
            case 155 -> IIIIlI(-196576217, var9 ^ 1652166875);
            case 156 -> IIIIlI(-196576216, var9 ^ -2095785435);
            case 157 -> IIIIlI(-196576215, var9 ^ 1462054480);
            case 158 -> IIIIlI(-196576214, var9 ^ 682440718);
            case 159 -> IIIIlI(-196576213, var9 ^ -1900289833);
            case 160 -> IIIIlI(-196576212, var9 ^ 313541641);
            case 161 -> 0;
            case 162 -> IIIIlI(-196576211, var9 ^ -765775272);
            case 163 -> IIIIlI(-196576210, var9 ^ -850139975);
            case 164 -> IIIIlI(-196576209, var9 ^ -1200592238);
            case 165 -> IIIIlI(-196576240, var9 ^ 1214065329);
            case 166 -> IIIIlI(-196576239, var9 ^ -544650065);
            case 167 -> IIIIlI(-196576238, var9 ^ 1909687346);
            case 168 -> 2;
            case 169 -> IIIIlI(-196576237, var9 ^ -1359850851);
            case 170 -> IIIIlI(-196576236, var9 ^ 1967224069);
            case 171 -> IIIIlI(-196576235, var9 ^ -1642562658);
            case 172 -> IIIIlI(-196576234, var9 ^ 669504748);
            case 173 -> IIIIlI(-196576233, var9 ^ -1931469608);
            case 174 -> IIIIlI(-196576232, var9 ^ -684950108);
            case 175 -> IIIIlI(-196576231, var9 ^ 352861348);
            case 176 -> IIIIlI(-196576230, var9 ^ 1398034588);
            case 177 -> IIIIlI(-196576229, var9 ^ 166181434);
            case 178 -> IIIIlI(-196576228, var9 ^ 1028663564);
            case 179 -> IIIIlI(-196576227, var9 ^ 285171579);
            case 180 -> IIIIlI(-196576226, var9 ^ 1896767036);
            case 181 -> IIIIlI(-196576225, var9 ^ 758143352);
            case 182 -> IIIIlI(-196576256, var9 ^ 626003615);
            case 183 -> IIIIlI(-196576255, var9 ^ 290128681);
            case 184 -> IIIIlI(-196576254, var9 ^ 1386830188);
            case 185 -> IIIIlI(-196576253, var9 ^ 371188941);
            case 186 -> IIIIlI(-196576252, var9 ^ 2146227183);
            case 187 -> IIIIlI(-196576251, var9 ^ 336913433);
            case 188 -> IIIIlI(-196576250, var9 ^ -109476720);
            case 189 -> IIIIlI(-196576249, var9 ^ 1295772628);
            case 190 -> IIIIlI(-196576248, var9 ^ -889911903);
            case 191 -> IIIIlI(-196576247, var9 ^ -416986313);
            case 192 -> IIIIlI(-196576246, var9 ^ -2108640032);
            case 193 -> IIIIlI(-196576245, var9 ^ 370964652);
            case 194 -> IIIIlI(-196576244, var9 ^ 932476921);
            case 195 -> IIIIlI(-196576243, var9 ^ -1522256661);
            case 196 -> IIIIlI(-196576242, var9 ^ 1452943569);
            case 197 -> IIIIlI(-196576241, var9 ^ -1439985800);
            case 198 -> IIIIlI(-196575760, var9 ^ -1633881591);
            case 199 -> IIIIlI(-196575759, var9 ^ 1671811439);
            case 200 -> 4;
            case 201 -> IIIIlI(-196575758, var9 ^ -2086798513);
            case 202 -> IIIIlI(-196575757, var9 ^ -1131348894);
            case 203 -> IIIIlI(-196575756, var9 ^ -48432531);
            case 204 -> IIIIlI(-196575755, var9 ^ 1339211529);
            case 205 -> IIIIlI(-196575754, var9 ^ -1044757583);
            case 206 -> IIIIlI(-196575753, var9 ^ 357021144);
            case 207 -> IIIIlI(-196575752, var9 ^ 296536729);
            case 208 -> IIIIlI(-196575751, var9 ^ -1470327426);
            case 209 -> IIIIlI(-196575750, var9 ^ -470207104);
            case 210 -> IIIIlI(-196575749, var9 ^ -1308731228);
            case 211 -> IIIIlI(-196575748, var9 ^ 1758414267);
            case 212 -> IIIIlI(-196575747, var9 ^ -1435735271);
            case 213 -> IIIIlI(-196575746, var9 ^ -179154469);
            case 214 -> IIIIlI(-196575745, var9 ^ -1440678400);
            case 215 -> IIIIlI(-196575776, var9 ^ 2016970710);
            case 216 -> IIIIlI(-196575775, var9 ^ 629302120);
            case 217 -> IIIIlI(-196575774, var9 ^ -707012399);
            case 218 -> IIIIlI(-196575773, var9 ^ -2751116);
            case 219 -> IIIIlI(-196575772, var9 ^ 1988630232);
            case 220 -> IIIIlI(-196575771, var9 ^ -82011881);
            case 221 -> IIIIlI(-196575770, var9 ^ -2134575660);
            case 222 -> IIIIlI(-196575769, var9 ^ -859260981);
            case 223 -> IIIIlI(-196575768, var9 ^ -575750889);
            case 224 -> IIIIlI(-196575767, var9 ^ -1043047829);
            case 225 -> IIIIlI(-196575766, var9 ^ -760883191);
            case 226 -> IIIIlI(-196575765, var9 ^ -1390844459);
            case 227 -> IIIIlI(-196575764, var9 ^ -1575538523);
            case 228 -> IIIIlI(-196575763, var9 ^ -1290306282);
            case 229 -> IIIIlI(-196575762, var9 ^ 1024700645);
            case 230 -> IIIIlI(-196575761, var9 ^ -468656886);
            case 231 -> IIIIlI(-196575792, var9 ^ 1709856956);
            case 232 -> IIIIlI(-196575791, var9 ^ -1151416789);
            case 233 -> IIIIlI(-196575790, var9 ^ 702796234);
            case 234 -> IIIIlI(-196575789, var9 ^ 2044094039);
            case 235 -> IIIIlI(-196575788, var9 ^ 2061692855);
            case 236 -> IIIIlI(-196575787, var9 ^ 1370189931);
            case 237 -> 3;
            case 238 -> IIIIlI(-196575786, var9 ^ -1296862109);
            case 239 -> IIIIlI(-196575785, var9 ^ 1486198347);
            case 240 -> IIIIlI(-196575784, var9 ^ 558538888);
            case 241 -> IIIIlI(-196575783, var9 ^ 1675486428);
            case 242 -> IIIIlI(-196575782, var9 ^ -1755810352);
            case 243 -> IIIIlI(-196575781, var9 ^ 1142548653);
            case 244 -> IIIIlI(-196575780, var9 ^ -1320324231);
            case 245 -> IIIIlI(-196575779, var9 ^ 1431654380);
            case 246 -> IIIIlI(-196575778, var9 ^ -204239482);
            case 247 -> IIIIlI(-196575777, var9 ^ -1237784365);
            case 248 -> IIIIlI(-196575808, var9 ^ -54798148);
            case 249 -> IIIIlI(-196575807, var9 ^ 1411060985);
            case 250 -> IIIIlI(-196575806, var9 ^ 564000400);
            case 251 -> IIIIlI(-196575805, var9 ^ -68751202);
            case 252 -> IIIIlI(-196575804, var9 ^ 1001945015);
            case 253 -> IIIIlI(-196575803, var9 ^ 875666507);
            case 254 -> IIIIlI(-196575802, var9 ^ -1977368235);
            default -> IIIIlI(-196575801, var9 ^ -314056727);
         };
         int var5 = (var1 & IIIIlI(-196575800, var9 ^ -470951570)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & IIIIlI(-196575799, var9 ^ -186337567)) >>> IIIIlI(-196575798, var9 ^ 744251584)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & IIIIlI(-196575797, var9 ^ -547184457);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & IIIIlI(-196575796, var9 ^ 1531636018);
            }
         }

         IlII[var2] = new String(var3).intern();
      }

      return IlII[var2];
   }

   private boolean lIll(class_310 var1, float var2) {
      if (this.IIIll.IllI() && var1 != null && var1.field_1724 != null) {
         class_746 var3 = var1.field_1724;
         if (var3.method_24828() || var3.method_6128()) {
            return false;
         } else {
            return class_9362.method_58659(var3) ? false : var3.field_6017 >= 1.5 && var3.method_18798().field_1351 < 0.0;
         }
      } else {
         return false;
      }
   }

   private boolean llII(class_310 var1, class_1309 var2) {
      return k74.x.IIll.IIIl(var2, var1.field_1724) && !this.lIIl.IllI() ? this.lII(var1, null, var2) : this.lIllI(var1, var2);
   }

   public boolean lllI() {
      return k74.x.IIll.IllIll();
   }

   private boolean IIIII(class_310 var1) {
      return var1 != null && var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null && var1.field_1690 != null;
   }

   @Override
   public void llIl() {
      this.IIIl();
   }

   public double IIIIl() {
      return this.lI.IllI() ? this.lll : this.lIl.IllI();
   }

   private boolean IIIlI() {
      IIIIIllII var1 = IIIIIllII.III();
      if (var1 == null) {
         return false;
      } else {
         IIlIIlIII var2 = var1.II().lIIIIl();
         return var2 != null && var2.IIIIlIl();
      }
   }

   public void IIIll(class_310 var1) {
      this.IllIll(var1);
   }

   public boolean IIlII() {
      return this.IIlI.IllI();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = 164382915;
      char[] var9 = "ǡ\u0015".toCharArray();
      short var7 = 25521;
      String var8 = "떉뗝딳딶뗐딸딌뗪땁땪딭딀떴딩땳땧땳뗕뗓뗰딢뗯딵딠떻뗻뗾떜딖뗧떴딿땭딟뗤딡딘떥떃땎딶뗽따딧떇떝땭딒땞떮딽떑땶딇뗯딛떼뗒땒떆떷뗕뗾딠딠뗨딿딜땒떡땙땞뗑떺딎떑땝땁딡뗟딁땅땕딨딃딯떬땄딯뗁딙땍땫딽딩땒땊땪땥딻떤떈땄뗮떍딜떲뗊뗭뗽떯떘떍떥딨땲떝땑떡땼땩땒땁떀떯딒땂딵땸떷떰땊땟땫떕떡딧뗏딍딳땷땨딦땤땆떕떷뗙딟뗏땾뗈뗕딳뗬딒딧뗀딀땧뗴뗹딥뗏땃땤떴딵땮뗿떻떖딘딃땆땹뗻떬딇땛떁떙떇땔뗤땂딂떭뗕떗딺뗴떵뗩뗟땳떽뗂딈뗹딂딺땸떚딻떏떕떱딇딼뗺뗼뗭땃떠뗓뗥땗떰딠땲땳땈뗉뗠딏딒딩딟뗔뗘뗡땋떖딖딟딆뗏떩딓딞딡딱땤딜떳땾딨떣떘떶땖떾땞땭땡뗆뗂떓뗄땙뗾떳땯딅딢떫떹떇뗞뗻땽뗆뗸딲뗸땱땸딬딟딻뗙뗵딶땵딩뗨뗏떗떊떪뗱딲땛떛뗛떚딆땦땗떗뗣땵딓떞딖떎딱딡뗄땙뗀떐뗍떨떄딸뗜딓땆뗮딵딣땯땬딱딸딈떐땲떸뗢딉딠땵뗂땜떠땜딲뗨땝땠딜딝때딧땨떼떢땨딢떱뗐뗎떶뗳땡떽떀뗁떆딉떅딢땛뗨땕따뗳떅뗳떆떎뗃떱떵뗾뗷딆땡딫떬뗲딸땴딨딬뗬딸뗅땱떭땾땦떥뗎딢땻땃땵떚땜떟땶딝뗅뗚떬떌떑땦떍땝뗎떷딐뗂뗄땋땠뗉딢딣뗤떒뗡땼딖떹떀땎뗐뗩떔뗭땐땱뗒떢떷뗵딠떶떵뗏딸땬땋딩땤딠딝뗌땿딵떅뗢딣따딫뗁떛떼떐딨뗾딗딶딟땢땔뗗뗤딓딪땥딿딚땧땿ׇ֕ոԄןך\u05edִֆԎלՠ֠ռԏ֩զ՝ׅ֟\u0590";
      int var10000 = var9.length;
      byte var14 = -1;
      String[] var10 = new String[var10000];

      while (true) {
         int var11 = 0;
         char var12 = 0;
         char var13 = '\u0000';
         if (var14 == 0) {
            IlIIl = var10;
            IlIlI = new Object[var10.length];
            int var23 = 0;
            int var10001 = 0;
            byte[] var10002 = "\u0098°ùò£\u0097àCT-Ób»\u00819°«J¤\të\u0099÷Ì\u001cë\\\u001fà\u0089\u00161É!á'¥±\u009b,Ñt¶Ñö¿¸¯ë×u¡+{ÎÕ{f3-\u000e\u0017¶\u0084\b»dý\u0014Ö¼\u009fr¬Ý-A©=zK&\u009f¢\u0004[Hºþ@ïþ ¼\u0097è\u0017î'ÀVå×'#\u0081T\u009cß\\Éøãþ¡\u0091\u0083ú¶k\u0092\u0081´7\u009f\u0013Kk;E\u0087®S\u0092wÊ\u0011¾ÕËëÇm\u0014Tß}$ \u0085\u001d\u0099ÿ)\bzÛÈüþiÙ\u0088F\u001ex]G;\u0084á\u009a+ðl\u009cÕT\u0004¢Ì7)ã\u008e¶ísD*F³\u008f¿5\u0001¦\f\u008cü\u0000¤Mö ó¨<5½\u0016íµZ\u0010pI8Ã\u0005'Æ4\u008d-DC\u0011\u009c«\u000fÇ\u000f£\u0018\n\u0096u\u0083Ûùõ4<<ß\u0003\u0011Ø%*a®\u009c:Ëª\u0090ì\u008dÉê¹P\u0095¤t\u009dô´\tÎä`¶=F1\u009dÉ7ùq×¦ôäzãTE(^\u0003¹Ò©ÝB\u0001²o2\u009b\u0093Æ$\u0016Ú>H\u0082\u000bÉ³_Ä,X\nâÑ®Þ²\u001f©a{JD\u0093\t\u0098Ñ?\u001bÒùE\u0006ú\u001b¾s¨\r\u001eiy6æ \t¥\u0099èïQ¸o\u0085c\u0099ûÍÁ\u001fA¾¨Ök9\u000fvI8\u0086\\Ëô1±H³ÑhÞÁ·\u0083]Ù\\dz\u0095o«ýòì ÑÂ\u0095_Yüå~kÜïã\u0018ò$¯ô\u0089ð\u001df3þ!Ê\u009dnb@æCÒù\u0086)\u0098ö\u0092Èï×U\tFÃÂ¿î2\u008a\u009dS©PÒ:ËH4C\u0099ÕõlpùIÄ¤»\r\u009b\u0095âZo\u001c<>^\u0093³Ð?¾¹:5§Bâ^<þñn\rð\u0019¯\u0014¡ÌÓ\u009b\u0095\u001c\u0012¯gó\u0085x\u0091\u0094\u0013Uh®C`J\u0083Ì&d¢ûâ\r+¨N§TÙ©Ø óÐ\u0080C\u0003û&Ù\u0099\u009d'¬\u009d&Àp¼Ø\u0083\u009d3\u0003gT<à=ï\bg?ÇÑÿë/·×È\u0099ø\nLX\u007föÁ\fG\\oF\u009a\u0098ÇÝÒ\u0017¤¼©\u009e\u0091µgÚÒ\u0011^\u008eÜ\u0017ÌÑo¾kO\u0010°å\u0013'Ó<ò©X?Ì\u0002\u0093@\u00186\u0082\u000eÆEØGâE\u009c\u001eÎÛ\u0099\u0087\u0005ÝShR]h%äP\u001f\rR\u0090\u0002º\räk¹\u0094IEW$vÜÃ\u0097¯/«b(¯àl2\u009eÄÈôhìisóõtZ\u0014µ\u0018¯W\u0002fâMÑ+¯¤Xld_\u0092h\u0095\u008d¾\u008c8Êòûéd\u0018Ï\u0016Éæ·ø\u001dÖÍñ\u0098\u009b ^q\tµqó¦Ê\u0090>\u0001\u0000\u0018*\u0016\u001a^Wß] Ðzÿc\\ô¼È\u0086\u0014!ò?íúçkø°î\u000b¢\u001eyc\u0007\u000fc\u009d%|Q°à¢\u0083/ÿ\u009a3á-,¦ª\u0018LØÛ½ù¹µ\u001akB\u009c>ª\u0085\u0080Ro\u00adjiÐ\u000bÓ\u0091³.r\u0013\b;½_\f÷Ä\u0001¹¥\u0089Te+þ\u0083Dæ\u0013^\u0093n\u0007Ûr\u0000Ât¦16hÙ¹ t\u007f¯÷Åã¤S¦#OB\u0092<Gó\u001eIdq\u0002¹I2Ý.\u009dW\u0015\u0080Ç\u0093¡_æI$\u0084Ub\u0093o\fcïÖóÏ,}ô\u0004²&8eÞä\u001c'w¢@H÷øó¡æÌD>0áëG%\u0080\u001aF2Ü$)\u009cÔD~\u007fà_sÃ£½)øç\u000b\u00946\u008eøËæå\u0000\u0094è\bm\u0093¢¼/óÐ;á\u001e\u0010\u00161;ÖsD¬èç\b`©Æ\u0080\u0007dTP,í§\u008e0ª[?ÿ\u0093o\u0088ë\u0091\u0092±Ë?r\u0089ánM\u0084å\u0082\f\bã\u0081¾Æ©Ì0®2¾äS¬~à¸»\u0087YH\u008cÔ\u0012í,\u0005@êA\u001a\u0099Û4¤[xq?\u0004FH_[4ä\"\u0089,\u0091¬Ô\u0096z¥$Ï©Ñ\u000eÂ\u001fE\u0087\u009c\u0000\t\n\bè\u0000qÐì:=Ü®9,º§:0À@?#±Á¯\\\rsµS\u0003)\tB\u0003gJÌ\u0007¦7\u0015\u0004Ä\u0095\u0094þBÏJJ·\u0005Ø÷Èy\u0088Â|!\u008böö~ ¿iùC§b\u0088©\u0081\u008fÅÐ^¶\u009d\u0092Éý\u001cfLc µ\rò§@Yjþ¤AY¤\u0002Ç\u0097\u009bG,ñF\r¯Á\u0007¥\u000f\r4Ð\u0089ïX\nòæ\u0092Ê¬n-Å%\u0085Æ{7×²\u001cSÆZ\u0012ù¨4\u0005ó ºÝHv\u0089.vÑîª^\u0098l\u0097´D\u007fø¹þ×Ã\u001c,3Üº¥9NÈæ\u001d\u0095µ3I\u001c×aý\f\u001eP\u0019@3òù\rÖïäôK´ñAÅÔçÃh·?ë\u008a\u008dTùç²\u000bw\u0081ñ¾"
               .getBytes("ISO-8859-1");
            IlIII = new int[333];

            int var56;
            do {
               IlIII[var23] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 775537509;
               var23 += 1;
               var56 = var10001 + 4;
               var10001 += 4;
            } while (var56 < var10002.length);

            String[] var5 = new String[IIIIlI(-196575795, var18 ^ 1141402517)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = IIIIll('뫏', 2111706945, 1270607748)).length();
            int var1 = IIIIlI(-196575794, var18 ^ 721801590);
            int var20 = -1;

            label103:
            while (true) {
               var23 = IIIIlI(-196575793, var18 ^ 278924290);
               String var28 = var2.substring(++var20, var20 + var1);
               byte var40 = -1;

               while (true) {
                  label98: {
                     char[] var58 = var28.toCharArray();
                     int var70 = var58.length;
                     int var6 = 0;
                     var56 = var23;
                     var45 = var58;
                     var10001 = var70;
                     char[] var82;
                     int var89;
                     if (var70 <= 1) {
                        var82 = var58;
                        var70 = var23;
                        var89 = var6;
                     } else {
                        var56 = var23;
                        var10001 = var70;
                        if (var70 <= var6) {
                           break label98;
                        }

                        var82 = var58;
                        var70 = var23;
                        var89 = var6;
                     }

                     while (true) {
                        var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % IIIIlI(-196575822, var18 ^ 1175002249)) {
                           case 0 -> IIIIlI(-196575821, var18 ^ -815054379);
                           case 1 -> IIIIlI(-196575820, var18 ^ -543001688);
                           case 2 -> 2;
                           case 3 -> IIIIlI(-196575819, var18 ^ -1819290922);
                           case 4 -> IIIIlI(-196575818, var18 ^ -563426200);
                           case 5 -> IIIIlI(-196575817, var18 ^ 670538650);
                           default -> 3;
                        });
                        var6++;
                        if (var56 == 0) {
                           var89 = var56;
                           var82 = var45;
                           var70 = var56;
                        } else {
                           if (var10001 <= var6) {
                              break;
                           }

                           var82 = var45;
                           var70 = var56;
                           var89 = var6;
                        }
                     }
                  }

                  String var63 = new String(var45).intern();
                  switch (var40) {
                     case 0:
                        var5[var3++] = var63;
                        if ((var20 += var1) >= var4) {
                           I = var5;
                           IlII = new String[IIIIlI(-196575823, var18 ^ -1653290613)];
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var63;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label103;
                        }

                        var4 = (var2 = IIIIll((char)'밌', 909943047, 1270607749)).length();
                        var1 = 4;
                        var20 = -1;
                  }

                  var23 = IIIIlI(-196575824, var18 ^ 252086879);
                  var28 = var2.substring(++var20, var20 + var1);
                  var40 = 0;
               }
            }
         }

         do {
            var13 = var9[var11];
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 237;
                  case 1 -> 34;
                  case 2 -> 235;
                  case 3 -> 115;
                  case 4 -> 100;
                  case 5 -> 46;
               };
               var15[var16] = (char)(var15[var16] ^ var17 ^ var7);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   private static int IIIIlI(int var0, int var1) {
      int var2 = IlIII[var0 ^ -196576016] ^ var1 ^ var0;
      var2 -= 29979;
      var2 -= 62793;
      var2 ^= 19388;
      var2 -= 4769;
      var2 ^= 50254;
      var2 ^= 55722;
      var2 -= 49492;
      var2 += 38039;
      return var2 + 7413;
   }

   private void IIllI() {
      this.IlII(class_310.method_1551());
   }

   private boolean IIlll(class_310 var1, class_3966 var2, class_1309 var3, double var4) {
      return var1 != null && var1.field_1724 != null && var2 != null && var3 != null
         ? var1.field_1724.method_33571().method_1022(var2.method_17784()) <= var4 + 1.0E-4
         : false;
   }

   private double IllII(class_1799 var1, boolean var2) {
      if (var1 != null && !var1.method_7960() && var1.method_7909() instanceof class_1743) {
         return this.IIIlI;
      } else {
         return var2 && this.lIlll(var1) ? Math.min(0.895, this.IIIIl) : this.IIIIl;
      }
   }

   private boolean IllIl(class_1309 var1) {
      if (this.IlIl.IllI() != IlIIIIlll.Il) {
         return true;
      } else if (this.lllI == null) {
         return true;
      } else {
         class_1309 var2 = this.lllI.l();
         if (var2 != null && var2.method_5805() && !var2.method_31481()) {
            return this.IIl(var1);
         } else {
            class_1309 var3 = this.lllI.lIII();
            return var2 == null && var3 != null && var3.method_5805() && !var3.method_31481()
               ? var3 == var1 || var3.method_5628() == var1.method_5628() || var3.method_5667() != null && var3.method_5667().equals(var1.method_5667())
               : false;
         }
      }
   }

   @Override
   public void IlIII() {
      this.IIIl();
   }

   private boolean IlllI(class_1309 var1) {
      long var2 = Math.max(0L, Math.round(this.llIl.IllI()));
      if (var2 <= 0L) {
         this.IIllI = var1 != null ? var1.method_5628() : IIIIlI(-196575816, -342110681 ^ -265388600);
         this.IIlll = System.currentTimeMillis();
         return true;
      } else if (var1 == null) {
         this.llIII();
         return false;
      } else {
         long var4 = System.currentTimeMillis();
         if (this.IIllI != var1.method_5628()) {
            this.IIllI = var1.method_5628();
            this.IIlll = var4;
            return false;
         } else {
            return var4 - this.IIlll >= var2;
         }
      }
   }

   private boolean Illll(class_310 var1, class_1309 var2, float var3) {
      if (this.IIIll.IllI() && var1 != null && var1.field_1724 != null) {
         class_746 var4 = var1.field_1724;
         return !this.III(var4)
            ? false
            : !llIllIlI.lIll(var4.field_6017)
               || !llIllIlI.llll(var4.method_18798().field_1351, var3, var4.method_5624(), ((IIlllllll)var4).m3x$getLastSprinting());
      } else {
         return false;
      }
   }

   private static boolean lIIII(IllIIIIl var0, class_310 var1, class_1309 var2) {
      return var0.IIlIII(var1, var2);
   }

   private boolean lIIIl(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (this.III == lllIllI.I) {
         return false;
      } else if (var1.field_1724 == null || var1.field_1687 == null || var1.field_1761 == null || var1.field_1755 != null) {
         this.IIllI();
         return true;
      } else if (this.llll.IllI() && !this.lllll(var1)) {
         this.IIllI();
         return true;
      } else {
         long var3 = System.currentTimeMillis();
         if (var3 > this.llI) {
            this.IIllI();
            return true;
         } else {
            class_1309 var5 = this.IIIIII(var1);
            if (var5 == null) {
               this.IlII(var1);
               return true;
            } else {
               switch (this.III) {
                  case l:
                     this.llIlI(var1);
                     if (!k74.x.IIll.IIlI(var1.field_1724) && !var1.field_1724.method_6115()) {
                        this.III = lllIllI.II;
                        this.llI = var3 + 325L;
                     }

                     return true;
                  case II:
                     if (!k74.x.IIll.IIlI(var1.field_1724) && !var1.field_1724.method_6115()) {
                        double var6 = this.IIIIl();
                        class_3966 var8 = var1.field_1765 instanceof class_3966 var9 ? var9 : null;
                        if (var8 == null && var6 > 3.0) {
                           var8 = k74.x.IIll.lIlll(var1, var6);
                        }

                        if (var8 == null || var8.method_17782() != var5) {
                           this.IIllI();
                           return true;
                        } else if (!this.IIlll(var1, var8, var5, var6)) {
                           this.IIllI();
                           return true;
                        } else {
                           boolean var11 = k74.x.IIll.IIIl(var5, var1.field_1724);
                           if (var11 && !this.lIIl.IllI()) {
                              this.lII(var1, var8, var5);
                              return true;
                           } else if (!this.lIl(var1, var5)) {
                              return true;
                           } else if (this.lllII(var1, var5)) {
                              return true;
                           } else if (this.lIlIl(var1, var5)) {
                              return true;
                           } else if (this.llII(var1, var5)) {
                              this.IIlI(var1);
                              if (this.Illl && this.lIIll(var1)) {
                                 this.III = lllIllI.lI;
                                 this.llI = var3 + 325L;
                                 if (var2 == null) {
                                    return true;
                                 }
                              }

                              this.IlII(var1);
                              return true;
                           } else {
                              this.l(var1, var8, var5);
                              if (this.Illl && this.lIIll(var1)) {
                                 this.III = lllIllI.lI;
                                 this.llI = var3 + 325L;
                                 if (var2 == null) {
                                    return true;
                                 }
                              }

                              this.IlII(var1);
                              return true;
                           }
                        }
                     } else {
                        this.llIlI(var1);
                        return true;
                     }
                  case lI:
                     this.IlII(var1);
                     return true;
                  default:
                     return true;
               }
            }
         }
      }
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      this.I(var1);
   }

   public boolean lIIlI(class_310 var1) {
      if (this.IIIIlIl()
         && this.IIIll.IllI()
         && this.IIIII(var1)
         && var1.field_1755 == null
         && this.III(var1.field_1724)
         && !lIIIllII.ll(var1)
         && !k74.x.IIll.IIlllll()
         && !lIIIllII.II(var1)
         && (!this.llll.IllI() || this.lllll(var1))) {
         class_746 var2 = var1.field_1724;
         class_1799 var3 = var2.method_6047();
         if (!this.Illl(var3)
            && k74.x.IIll.IllIl(var1) <= 0
            && k74.x.IIll.lIllII(var1) <= 0
            && llIllIlI.lll(var2.method_18798().field_1351, var2.method_7261(0.5F), this.II(var3))) {
            double var4 = this.IIIIl();
            class_3966 var6 = var1.field_1765 instanceof class_3966 var7 ? var7 : null;
            if (var6 == null && var4 > 3.0) {
               var6 = k74.x.IIll.lIlll(var1, var4);
            }

            class_1309 var10 = var6 == null ? null : k74.x.IIll.llIlll(var1, var6);
            if (var10 != null
               && this.lI(var1, var10)
               && this.IllIl(var10)
               && this.IIlll(var1, var6, var10, var4)
               && (this.lIIl.IllI() || !k74.x.IIll.IIIl(var10, var2))) {
               double var11 = this.llIl.IllI();
               return var11 <= 0.0 || this.IIllI == var10.method_5628() && System.currentTimeMillis() - this.IIlll >= var11;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean lIIll(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 != null && var1.field_1724 != null) {
         for (class_1268 var6 : class_1268.values()) {
            class_1799 var7 = var1.field_1724.method_5998(var6);
            if (!var7.method_7960() && k74.x.IIll.lIIIIl(var7)) {
               return true;
            }

            if (var2 != null) {
               break;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static String IIIIll(char var0, int var1, int var2) {
      int var7 = var2 ^ 1270607748;
      char[] var6 = IlIIl[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])IlIlI[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = new Throwable().getStackTrace();
         IlIlI[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 40377;

      for (int var5 = 0; var5 < var6.length; var5++) {
         var6[var5] = (char)(var6[var5] ^ '銡' ^ switch (var5 % 31) {
            default -> 192;
            case 1 -> 83;
            case 2 -> 233;
            case 3 -> 199;
            case 4 -> 254;
            case 5 -> 77;
            case 6 -> 193;
            case 7 -> 106;
            case 8 -> 176;
            case 9 -> 193;
            case 10 -> 171;
            case 11 -> 248;
            case 12 -> 59;
            case 13 -> 58;
            case 14 -> 206;
            case 15 -> 212;
            case 16 -> 22;
            case 17 -> 32;
            case 18 -> 244;
            case 19 -> 154;
            case 20 -> 16;
            case 21 -> 218;
            case 22 -> 39;
            case 23 -> 57;
            case 24 -> 224;
            case 25 -> 78;
            case 26 -> 199;
            case 27 -> 177;
            case 28 -> 97;
            case 29 -> 8;
            case 30 -> 30;
         } ^ var0 ^ var1 ^ var4 ^ var2);
      }

      return new String(var6).intern();
   }

   private void lIlII(class_310 var1) {
      if (var1 != null && var1.field_1690 != null && var1.field_1690.field_1904 != null) {
         var1.field_1690.field_1904.method_23481(false);
      }
   }

   private boolean lIlIl(class_310 var1, class_1309 var2) {
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null && var1 != null && var1.field_1724 != null && var2 != null) {
         IllllIIl var4 = var3.II().IIIIIII();
         return var4 != null && var4.IlIl(var1, var2);
      } else {
         return false;
      }
   }

   private boolean lIllI(class_310 var1, class_1309 var2) {
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null && var1 != null && var1.field_1724 != null && var2 != null) {
         IllIIIIl var4 = var3.II().Illl();
         if (var4 != null && var4.IIIIlIl() && lIlIIlII.llI(var4.lllI(var2), IIIIIIIll::lIIII)) {
            return true;
         } else {
            lIIlllII var5 = var3.II().llIl();
            if (var5 != null && var5.IIIIlIl()) {
               if (var5.IIll()) {
                  return true;
               }

               if (var5.llI(var1, var2)) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   private boolean lIlll(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         String var2 = class_7923.field_41178.method_10221(var1.method_7909()).method_12832();
         return var2.endsWith(IlIIllIII.lI(lIlI(IIIIlI(-196575815, -2086396407 ^ -1698893529), IIIIlI(-196575814, -2086396407 ^ -1302503150))));
      } else {
         return false;
      }
   }

   private void llIII() {
      this.IIllI = IIIIlI(-196575813, 696569687 ^ -1978459561);
      this.IIlll = 0L;
   }

   private void llIIl(class_310 var1) {
      if (var1 != null && var1.field_1724 != null && var1.field_1690 != null && var1.field_1690.field_1904 != null) {
         k74.x.IIll.IlIll(var1);
         k74.x.IIll.lIIIIlI(var1.field_1690.field_1904);
         if (!k74.x.IIll.IlIllll(var1, var1.field_1690.field_1904)) {
            var1.field_1690.field_1904.method_23481(false);
         } else {
            var1.field_1690.field_1904.method_23481(true);
            if (this.lIIll(var1)) {
               k74.x.IIll.IIllIl(var1);
            }
         }
      }
   }

   private void llIlI(class_310 var1) {
      if (var1 != null && var1.field_1724 != null && var1.field_1761 != null) {
         k74.x.IIll.IIlIlI(var1, 3);
         this.lIlII(var1);
         if (k74.x.IIll.IIlI(var1.field_1724) || var1.field_1724.method_6115()) {
            var1.field_1761.method_2897(var1.field_1724);
         }
      }
   }

   @Override
   public String IlIIl() {
      return "";
   }

   private void llIll() {
      this.IIIIl = this.IllI(this.lIII);
      this.IIIlI = this.IllI(this.Ill);
   }

   private boolean lllII(class_310 var1, class_1309 var2) {
      IIIIIllII var3 = IIIIIllII.III();
      return var3 != null && var3.II() != null && var3.II().IIII() != null ? var3.II().IIII().IIIlI(var1, var2) : false;
   }

   private void lllIl(class_310 var1, class_1309 var2, boolean var3) {
      if (this.lIl(var1, var2)) {
         if (!this.lllII(var1, var2)) {
            boolean var4 = k74.x.IIll.IIlI(var1.field_1724) || var1.field_1724.method_6115();
            boolean var5 = this.lII.IllI();
            if (var5 && var4) {
               this.lIIl(var1, var2);
            } else if (var3 && !this.lIIl.IllI()) {
               this.lII(var1, null, var2);
            }
         }
      }
   }

   @Override
   public void IllIll(class_310 var1) {
      if (this.IIIIlIl()) {
         this.I(var1);
      }
   }

   private boolean llllI(class_310 var1) {
      return var1 != null
         && var1.field_1690 != null
         && var1.field_1690.field_1904 != null
         && (k74.x.IIll.IlIllll(var1, var1.field_1690.field_1904) || var1.field_1690.field_1904.method_1434());
   }

   private boolean lllll(class_310 var1) {
      if (!this.llll.IllI() || var1 == null || var1.method_22683() == null) {
         return !this.llll.IllI();
      } else {
         return !this.IllI.II() ? false : k74.x.IIll.IIIllll(var1, this.IllI.IllI());
      }
   }

   private class_1309 IIIIII(class_310 var1) {
      if (var1.field_1687 != null && this.IIlII != IIIIlI(-196575812, 255805608 ^ 583982618)) {
         return var1.field_1687.method_8469(this.IIlII) instanceof class_1309 var3 && this.lI(var1, var3) && this.IllIl(var3) ? var3 : null;
      } else {
         return null;
      }
   }

   private void l(class_310 var1, class_3966 var2, class_1309 var3) {
      if (!k74.x.IIll.IIlllIl() && !lIIIllII.ll(var1)) {
         k74.x.IIll.IlIlI(true);

         label34: {
            try {
               if (k74.x.IIll.lIlIIl(var1, var2)) {
                  break label34;
               }
            } finally {
               k74.x.IIll.IlIlI(false);
            }

            return;
         }

         this.IIlI(var1);
      }
   }

   private void IIIIIl(class_310 var1) {
      if (var1 != null && var1.field_1724 != null) {
         if (!k74.x.IIll.IIlllIl() && !lIIIllII.ll(var1)) {
            k74.x.IIll.IlIlI(true);

            try {
               k74.x.IIll.IllIlIl(var1);
            } finally {
               k74.x.IIll.IlIlI(false);
            }

            this.IIlI(var1);
         }
      }
   }
}
