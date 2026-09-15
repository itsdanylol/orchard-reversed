package k74.x;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1536;
import net.minecraft.class_1665;
import net.minecraft.class_1667;
import net.minecraft.class_1671;
import net.minecraft.class_1674;
import net.minecraft.class_1676;
import net.minecraft.class_1679;
import net.minecraft.class_1680;
import net.minecraft.class_1681;
import net.minecraft.class_1683;
import net.minecraft.class_1684;
import net.minecraft.class_1685;
import net.minecraft.class_1686;
import net.minecraft.class_1753;
import net.minecraft.class_1764;
import net.minecraft.class_1771;
import net.minecraft.class_1776;
import net.minecraft.class_1779;
import net.minecraft.class_1787;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1823;
import net.minecraft.class_1828;
import net.minecraft.class_1835;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3486;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4184;
import net.minecraft.class_746;
import net.minecraft.class_8956;
import net.minecraft.class_9239;
import net.minecraft.class_9278;
import net.minecraft.class_9334;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

@Environment(EnvType.CLIENT)
public final class llIlIIlI extends IlIIIIIIl {
   private static String[] II;
   private final Map<Integer, IllIIIII> Il;
   private static final double lI = 4.0;
   private static final lIIIIIIl ll;
   private final IllIlI<String> III;
   private static final String[] IIl;
   private static final int[] Illl;
   private static final Object[] lIIl;
   private final lllIIlII IlI;
   private static final String[] lIII;
   private static final String[] Ill;
   private final IIIlIIlll lII;
   private final lllIIlII lIl;
   private final IIlIII llI;
   private static final double lll = 1.5;
   private static final double IIII = 0.18;
   private static final int IIIl = 10;
   private final List<IllIIll> IIlI;
   private static final double I = 1.35;
   private final List<IllIlIIl> IIll;
   private final IIIlIIlll IlII;
   private static final lIIIIIIl IlIl;
   private final List<lIIlIIl> IllI;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = lIlI(1385852492, 1412794178 ^ -364570183) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIlI(1385852493, 1412794178 ^ 1200656717);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private List<class_243> l(class_238 var1) {
      return List.of(
         new class_243(var1.field_1323, var1.field_1322, var1.field_1321),
         new class_243(var1.field_1320, var1.field_1322, var1.field_1321),
         new class_243(var1.field_1323, var1.field_1325, var1.field_1321),
         new class_243(var1.field_1320, var1.field_1325, var1.field_1321),
         new class_243(var1.field_1323, var1.field_1322, var1.field_1324),
         new class_243(var1.field_1320, var1.field_1322, var1.field_1324),
         new class_243(var1.field_1323, var1.field_1325, var1.field_1324),
         new class_243(var1.field_1320, var1.field_1325, var1.field_1324)
      );
   }

   private class_3965 II(class_1937 var1, class_1297 var2, class_243 var3, class_243 var4, class_242 var5) {
      return var1.method_17742(new class_3959(var3, var4, class_3960.field_17558, var5, var2));
   }

   private class_243 Il(float var1, float var2) {
      double var3 = Math.toRadians(var1);
      double var5 = Math.toRadians(-var2);
      double var7 = Math.cos(var3);
      class_243 var9 = new class_243(Math.sin(var5) * var7, -Math.sin(var3), Math.cos(var5) * var7);
      return var9.method_1027() > 1.0E-6 ? var9.method_1029() : class_243.field_1353;
   }

   private void lI(lIIlIl var1, List<class_243> var2, int var3) {
      IlIllIIII var4 = null;

      for (class_243 var6 : var2) {
         IlIllIIII var7 = IlIII.IlIll(var1, var6);
         if (var7 == null) {
            var4 = null;
         } else {
            if (var4 != null) {
               this.IIll.add(new IllIlIIl(var4.II(), var4.l(), var7.II(), var7.l(), var3));
            }

            var4 = var7;
         }
      }
   }

   private static boolean ll(class_310 var0, Integer var1) {
      return var0.field_1687.method_8469(var1) == null;
   }

   private List<IlIlIlIIl> III(class_1799 var1, class_746 var2, class_243 var3, class_243 var4, lIIlIl var5) {
      class_1792 var6 = var1.method_7909();
      ArrayList var7 = new ArrayList();
      if (var6 instanceof class_1753) {
         if (!var2.method_6115()) {
            return var7;
         } else {
            float var17 = class_1753.method_7722(var2.method_6048());
            if (var17 < 0.1F) {
               return var7;
            } else {
               var7.add(new IlIlIlIIl(var3, var4.method_1021(3.0 * var17), new IlIlllIl(0.05, 0.99, 0.6, 0.05, false, IlIl)));
               return var7;
            }
         }
      } else if (var6 instanceof class_1764) {
         if (!class_1764.method_7781(var1)) {
            return var7;
         } else {
            class_9278 var16 = (class_9278)var1.method_58694(class_9334.field_49649);
            class_243 var9 = var4.method_1021(3.15);
            double var10 = 0.05;
            double var12 = 0.6;
            if (var16 != null && var16.method_57438(class_1802.field_8639)) {
               var9 = var4.method_1021(1.6);
               var10 = 0.0;
               var12 = 0.99;
            }

            IlIlllIl var14 = new IlIlllIl(var10, 0.99, var12, var10, false, IlIl);
            var7.add(new IlIlIlIIl(var3, var9, var14));
            if (var16 != null && var16.method_57437().size() > 1) {
               var7.add(new IlIlIlIIl(var3, var9.method_1024((float)Math.toRadians(10.0)), var14));
               var7.add(new IlIlIlIIl(var3, var9.method_1024((float)Math.toRadians(-10.0)), var14));
            }

            return var7;
         }
      } else if (var6 instanceof class_1835) {
         if (var2.method_6115() && var2.method_6048() >= lIlI(1385852494, -662587588 ^ 302458399)) {
            var7.add(new IlIlIlIIl(var3, var4.method_1021(2.5), new IlIlllIl(0.05, 0.99, 0.99, 0.05, false, IlIl)));
            return var7;
         } else {
            return var7;
         }
      } else if (var6 instanceof class_1823) {
         var7.add(new IlIlIlIIl(var3, var4.method_1021(1.5), new IlIlllIl(0.03, 0.99, 0.8, 0.03, false, IlIl)));
         return var7;
      } else if (var6 instanceof class_1771) {
         var7.add(new IlIlIlIIl(var3, var4.method_1021(1.5), new IlIlllIl(0.03, 0.99, 0.8, 0.03, false, IlIl)));
         return var7;
      } else if (var6 instanceof class_1776) {
         var7.add(new IlIlIlIIl(var3, var4.method_1021(1.5), new IlIlllIl(0.03, 0.99, 0.8, 0.03, false, IlIl)));
         return var7;
      } else if (var6 instanceof class_9239) {
         var7.add(new IlIlIlIIl(var3, var4, new IlIlllIl(0.0, 0.95, 0.8, 0.0, false, IlIl)));
         return var7;
      } else if (var6 instanceof class_1828) {
         class_243 var15 = this.Ill(var5, -20.0F);
         var7.add(new IlIlIlIIl(var3, var15.method_1021(0.5), new IlIlllIl(0.05, 0.99, 0.8, 0.05, false, IlIl)));
         return var7;
      } else if (var6 instanceof class_1779) {
         class_243 var8 = this.Ill(var5, -20.0F);
         var7.add(new IlIlIlIIl(var3, var8.method_1029().method_1021(0.7), new IlIlllIl(0.07, 0.99, 0.8, 0.07, false, IlIl)));
         return var7;
      } else {
         if (var6 instanceof class_1787 && var2.field_7513 == null) {
            var7.add(this.lIIl(var3, var5));
         }

         return var7;
      }
   }

   private boolean IIl(class_1297 var1, class_1297 var2) {
      if (!var2.method_49108()) {
         return false;
      } else {
         class_1297 var3 = var1 instanceof class_1676 var4 ? var4.method_24921() : var1;
         return var3 == null || !var3.method_5794(var2);
      }
   }

   @Override
   public void llIl() {
      this.IIll.clear();
      this.IllI.clear();
      this.IIlI.clear();
      this.III.l();
      this.Il.clear();
   }

   private class_243 Ill(lIIlIl var1, float var2) {
      class_4184 var3 = var1.lIl() != null ? var1.lIl() : class_310.method_1551().field_1773.method_19418();
      return this.Il(var3.method_19329() + var2, var3.method_19330());
   }

   private IlIlllIl lII(class_1297 var1) {
      if (var1 instanceof class_1685) {
         return new IlIlllIl(0.05, 0.99, 0.99, 0.05, false, IlIl);
      } else if (var1 instanceof class_1665 || var1 instanceof class_1667 || var1 instanceof class_1679) {
         return new IlIlllIl(0.05, 0.99, 0.6, 0.05, false, IlIl);
      } else if (var1 instanceof class_1680 || var1 instanceof class_1681 || var1 instanceof class_1684) {
         return new IlIlllIl(0.03, 0.99, 0.8, 0.03, false, IlIl);
      } else if (var1 instanceof class_1683) {
         return new IlIlllIl(0.07, 0.99, 0.8, 0.07, false, IlIl);
      } else if (var1 instanceof class_1686) {
         return new IlIlllIl(0.05, 0.99, 0.8, 0.05, false, IlIl);
      } else if (var1 instanceof class_8956) {
         return new IlIlllIl(0.0, 0.95, 0.8, 0.0, false, IlIl);
      } else if (var1 instanceof class_1536) {
         return new IlIlllIl(0.03, 0.92, 0.92, 0.03, true, ll);
      } else if (var1 instanceof class_1674) {
         return new IlIlllIl(0.0, 1.0, 1.0, 0.0, false, IlIl);
      } else {
         return var1 instanceof class_1671 ? new IlIlllIl(0.07, 0.99, 0.8, 0.07, false, IlIl) : null;
      }
   }

   private void lIl(lIIlIl var1, List<class_243> var2, IlIIlllI var3, Color var4, boolean var5, String var6, Set<String> var7) {
      if (var2.size() >= 2) {
         var7.add(var6);
         List var8 = this.IlIl(var2);
         if (var5) {
            this.lI(var1, var8, var4.getRGB());
         }

         if (this.IlI.IllI() && var3.II()) {
            IlIllIIII var9 = IlIII.IlIll(var1, (class_243)var2.get(var2.size() - 1));
            if (var9 != null) {
               String var13 = IlIIllIII.lI(II[2]);
               String var10 = var6 + var13;
               var7.add(var10);
               lIllIIll var11 = this.III.IIl(var10, var9.II(), var9.l(), 1.0);
               this.IllI.add(new lIIlIIl(var11.I(), var11.II(), this.lIII(var4, 0.6)));
            }
         }

         if (var3.I() != null) {
            llIIIIll var15 = IlIII.IIlII(var1, this.l(var3.I().method_5829().method_1014(var3.I().method_5871())));
            if (var15 != null) {
               String var10000 = IlIIllIII.lI(II[3]);
               int var14 = var3.I().method_5628();
               String var18 = var10000;
               String var17 = var18 + var14;
               var7.add(var17);
               var15 = this.III.II(var17, var15, 1.0);
               this.IIlI.add(new IllIIll(var15.II(), var15.lI(), var15.IIl() - var15.II(), var15.III() - var15.lI(), this.lIII(var4, 0.9)));
            }
         }
      }
   }

   private boolean llI(class_1297 var1, class_1297 var2) {
      return this.IIl(var1, var2);
   }

   private void lll(lIIlIl var1, class_310 var2, Set<String> var3) {
      Color var5 = this.lII.IllI();
      String[] var10000 = IIllllIl.IIIIl();
      long var6 = var2.field_1687.method_75260();
      int var8 = (int)Math.round(this.llI.IllI());
      Iterator var9 = var2.field_1687.method_18112().iterator();
      String[] var4 = var10000;

      while (var9.hasNext()) {
         class_1297 var10 = (class_1297)var9.next();
         if ((var10 instanceof class_1676 || var10 instanceof class_1536) && var10.method_5805() && !var10.method_31481()) {
            class_243 var11 = var10.method_18798();
            if (!(var11.method_1027() < 1.0E-6)) {
               IlIlllIl var12 = this.lII(var10);
               if (var12 != null) {
                  IlIIlllI var15;
                  label52: {
                     class_243 var13 = new class_243(var10.method_23317(), var10.method_23318(), var10.method_23321());
                     IllIIIII var14 = this.Il.get(var10.method_5628());
                     if (var14 != null && var14.lI(var2.field_1687, var6, var13, var11, var12, var8)) {
                        var15 = var14.III();
                        if (var4 == null) {
                           break label52;
                        }
                     }

                     var15 = this.IIll(var2.field_1687, var10, var13, var11, var12, true);
                     this.Il.put(var10.method_5628(), new IllIIIII(var2.field_1687, var6, var13, var11, var12, var8, var15));
                  }

                  if (var15.l().size() >= 2) {
                     List var10002 = var15.l();
                     String var10006 = IlIIllIII.lI(II[0]);
                     int var17 = var10.method_5628();
                     String var16 = var10006;
                     this.lIl(var1, var10002, var15, var5, true, var16 + var17, var3);
                     if (var4 != null) {
                        break;
                     }
                  }
               }
            }
         }
      }

      this.Il.keySet().removeIf(llIlIIlI::ll);
   }

   private static void IIII() {
      int var0 = 1986695809;
      II[0] = I(IllI(lIlI(1385852508, var0 ^ 963925711), lIlI(1385852509, var0 ^ 146819663)).toCharArray(), 5516L, lIlI(1385852510, var0 ^ -915596202));
      II[1] = I(IllI(lIlI(1385852511, var0 ^ 60316462), lIlI(1385852504, var0 ^ -1782996821)).toCharArray(), 90126L, lIlI(1385852505, var0 ^ 1604293710));
      II[2] = I(IllI(lIlI(1385852506, var0 ^ 1917996047), lIlI(1385852507, var0 ^ 1503301578)).toCharArray(), 17995L, lIlI(1385852500, var0 ^ 1275514665));
      II[3] = I(IllI(lIlI(1385852501, var0 ^ -1344792474), lIlI(1385852502, var0 ^ -534035030)).toCharArray(), 10493L, lIlI(1385852503, var0 ^ -2043992562));
      II[4] = I(IllI(lIlI(1385852496, var0 ^ 2114186109), lIlI(1385852497, var0 ^ -770215059)).toCharArray(), 57483L, lIlI(1385852498, var0 ^ -1689424174));
      II[5] = I(IllI(lIlI(1385852499, var0 ^ 1916948089), lIlI(1385852524, var0 ^ -2143406716)).toCharArray(), 47101L, lIlI(1385852525, var0 ^ 1929309841));
      II[lIlI(1385852526, var0 ^ 1348763055)] = I(
         IllI(lIlI(1385852527, var0 ^ -829092921), lIlI(1385852520, var0 ^ -1987876505)).toCharArray(), 70345L, lIlI(1385852521, var0 ^ -177639463)
      );
      II[lIlI(1385852522, var0 ^ -1531912575)] = I(
         IllI(lIlI(1385852523, var0 ^ -657942022), lIlI(1385852516, var0 ^ -1019487994)).toCharArray(), 67935L, lIlI(1385852517, var0 ^ -1264610058)
      );
      II[lIlI(1385852518, var0 ^ 147557288)] = I(
         IllI(lIlI(1385852519, var0 ^ 730250305), lIlI(1385852512, var0 ^ -1367458176)).toCharArray(), 937L, lIlI(1385852513, var0 ^ 1250458974)
      );
      II[lIlI(1385852514, var0 ^ 2139496727)] = I(
         IllI(lIlI(1385852515, var0 ^ -1024001067), lIlI(1385852540, var0 ^ -608613935)).toCharArray(), 86092L, lIlI(1385852541, var0 ^ -1501477770)
      );
      II[lIlI(1385852542, var0 ^ 1106615832)] = I(
         IllI(lIlI(1385852543, var0 ^ -1918469600), lIlI(1385852536, var0 ^ 1629019116)).toCharArray(), 60053L, lIlI(1385852537, var0 ^ -2042163781)
      );
   }

   @Override
   public void IlI(lIIlIl var1) {
      this.IIll.clear();
      this.IllI.clear();
      this.IIlI.clear();
      if (this.IIIIlIl() && IlIII.IIIIII(var1)) {
         class_310 var2 = class_310.method_1551();
         if (var2.field_1724 != null && var2.field_1687 != null) {
            HashSet var3 = new HashSet();
            this.Illl(var1, var2, var3);
            if (this.lIl.IllI()) {
               this.lll(var1, var2, var3);
            }

            this.III.I(var3);
         } else {
            this.III.l();
            this.Il.clear();
         }
      } else {
         this.III.l();
         this.Il.clear();
      }
   }

   private static int lIlI(int var0, int var1) {
      int var2 = Illl[var0 ^ 1385852492] ^ var1 ^ var0;
      var2 -= 9154;
      var2 -= 23120;
      var2 += 62462;
      var2 ^= 43267;
      var2 -= 63223;
      return var2 + 9688;
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      if (this.IIIIlIl()) {
         for (IllIlIIl var6 : this.IIll) {
            IlIIlllIl.IlIIIl(var1, var6.lI(), var6.Il(), var6.II(), var6.l(), 1.35, var6.I());
         }

         for (lIIlIIl var9 : this.IllI) {
            IlIIlllIl.IIIIIl(var1, var9.l(), var9.II(), 4.0, 1.35, var9.I());
         }

         for (IllIIll var10 : this.IIlI) {
            IlIIlllIl.lIIIIl(var1, var10.l(), var10.II(), var10.Il(), var10.lI(), 1.5, var10.I());
         }
      }
   }

   private class_243 IIIl(class_243 var1, class_243 var2, class_243 var3, class_243 var4, double var5) {
      double var7 = var5 * var5;
      double var9 = var7 * var5;
      double var11 = 0.5
         * (
            2.0 * var2.field_1352
               + (-var1.field_1352 + var3.field_1352) * var5
               + (2.0 * var1.field_1352 - 5.0 * var2.field_1352 + 4.0 * var3.field_1352 - var4.field_1352) * var7
               + (-var1.field_1352 + 3.0 * var2.field_1352 - 3.0 * var3.field_1352 + var4.field_1352) * var9
         );
      double var13 = 0.5
         * (
            2.0 * var2.field_1351
               + (-var1.field_1351 + var3.field_1351) * var5
               + (2.0 * var1.field_1351 - 5.0 * var2.field_1351 + 4.0 * var3.field_1351 - var4.field_1351) * var7
               + (-var1.field_1351 + 3.0 * var2.field_1351 - 3.0 * var3.field_1351 + var4.field_1351) * var9
         );
      double var15 = 0.5
         * (
            2.0 * var2.field_1350
               + (-var1.field_1350 + var3.field_1350) * var5
               + (2.0 * var1.field_1350 - 5.0 * var2.field_1350 + 4.0 * var3.field_1350 - var4.field_1350) * var7
               + (-var1.field_1350 + 3.0 * var2.field_1350 - 3.0 * var3.field_1350 + var4.field_1350) * var9
         );
      return new class_243(
         class_3532.method_15350(var11, Math.min(var2.field_1352, var3.field_1352), Math.max(var2.field_1352, var3.field_1352)),
         class_3532.method_15350(var13, Math.min(var2.field_1351, var3.field_1351), Math.max(var2.field_1351, var3.field_1351)),
         class_3532.method_15350(var15, Math.min(var2.field_1350, var3.field_1350), Math.max(var2.field_1350, var3.field_1350))
      );
   }

   private lIIl IIlI(class_1937 var1, class_1297 var2, class_243 var3, class_243 var4, double var5) {
      class_238 var7 = new class_238(var3, var4).method_1014(1.0);
      class_1297 var8 = null;
      class_243 var9 = null;
      double var10 = Double.MAX_VALUE;

      for (class_1297 var13 : var1.method_8333(var2, var7, this::llI)) {
         class_243 var14 = (class_243)var13.method_5829().method_1014(var5).method_992(var3, var4).orElse(null);
         if (var14 != null) {
            double var15 = var3.method_1025(var14);
            if (!(var15 >= var10)) {
               var8 = var13;
               var9 = var14;
               var10 = var15;
            }
         }
      }

      return var8 != null && var9 != null ? new lIIl(var8, var9, var10) : null;
   }

   private IlIIlllI IIll(class_1937 var1, class_1297 var2, class_243 var3, class_243 var4, IlIlllIl var5, boolean var6) {
      int var8 = (int)Math.round(this.llI.IllI());
      String[] var10000 = IIllllIl.IIIIl();
      ArrayList var9 = new ArrayList(var8 + 1);
      class_243 var10 = var3;
      String[] var7 = var10000;
      boolean var12 = !var5.I() && var2 != null && var2.method_5799();
      var9.add(var3);

      for (int var13 = 0; var13 < var8; var13++) {
         double var14 = var12 ? var5.ll() : var5.Il();
         double var16 = var12 ? var5.lI() : var5.II();
         class_243 var18 = var10;
         switch (var5.l()) {
            case II:
               var18 = var10.method_1019(var4);
               class_243 var19 = new class_243(var4.field_1352 * var14, var4.field_1351 * var14 - var16, var4.field_1350 * var14);
               if (var7 == null) {
                  break;
               }
            case lI:
               class_243 var20 = var4.method_1023(0.0, var16, 0.0);
               var18 = var10.method_1019(var20);
               class_243 var32 = var20.method_1021(var14);
         }

         int var27 = var2 instanceof class_1676 var21 ? var21.field_6012 + var13 : var13;
         double var28 = Math.max(0.0, Math.min(0.3, (var27 - 2) / 20.0));
         lIIl var23 = var6 ? this.IIlI(var1, var2, var10, var18, var28) : null;
         class_3965 var24 = this.II(var1, var2, var10, var18, var5.I() ? class_242.field_1347 : class_242.field_1348);
         if (var24.method_17783() != class_240.field_1333) {
            double var25 = var10.method_1025(var24.method_17784());
            if (var23 == null || var25 < var23.II()) {
               var9.add(var24.method_17784());
               return new IlIIlllI(var9, true, null);
            }
         }

         if (var23 != null) {
            var9.add(var23.l());
            return new IlIIlllI(var9, true, var23.I());
         }

         if (!var5.I()) {
            class_2338 var29 = class_2338.method_49637(var18.field_1352, var18.field_1351, var18.field_1350);
            var12 = var1.method_8316(var29).method_15767(class_3486.field_15517);
         }

         var9.add(var18);
         if (!(var18.field_1351 < var1.method_31607() - lIlI(1385852538, -1533646365 ^ 285006553))) {
            ;
         }
         break;
      }

      return new IlIIlllI(var9, false, null);
   }

   private class_243 IlII(class_746 var1) {
      class_243 var2 = var1.method_18798();
      return new class_243(var2.field_1352, var1.method_24828() ? 0.0 : var2.field_1351, var2.field_1350);
   }

   private List<class_243> IlIl(List<class_243> var1) {
      if (var1.size() < 3) {
         return var1;
      } else {
         ArrayList var2 = new ArrayList(var1.size() * 4);
         var2.add((class_243)var1.get(0));

         for (int var3 = 0; var3 < var1.size() - 1; var3++) {
            class_243 var4 = (class_243)var1.get(Math.max(0, var3 - 1));
            class_243 var5 = (class_243)var1.get(var3);
            class_243 var6 = (class_243)var1.get(var3 + 1);
            class_243 var7 = (class_243)var1.get(Math.min(var1.size() - 1, var3 + 2));
            int var8 = Math.max(2, Math.min(lIlI(1385852539, -535457076 ^ -1084024081), (int)Math.ceil(var5.method_1022(var6) / 0.18)));

            for (int var9 = 1; var9 <= var8; var9++) {
               var2.add(this.IIIl(var4, var5, var6, var7, (double)var9 / var8));
            }
         }

         var2.set(var2.size() - 1, (class_243)var1.get(var1.size() - 1));
         return var2;
      }
   }

   private static String IllI(int var0, int var1) {
      int var9 = -436387661;
      int var2 = (var0 ^ lIlI(1385852532, var9 ^ 508514856)) & lIlI(1385852533, var9 ^ -1404309106);
      if (IIl[var2] == null) {
         char[] var3 = Ill[var2].toCharArray();

         int var4 = switch (var3[0] & lIlI(1385852534, var9 ^ -272657903)) {
            case 0 -> lIlI(1385852535, var9 ^ -509899277);
            case 1 -> lIlI(1385852528, var9 ^ -1001125073);
            case 2 -> lIlI(1385852529, var9 ^ -185587223);
            case 3 -> lIlI(1385852530, var9 ^ 151304400);
            case 4 -> lIlI(1385852531, var9 ^ 7666035);
            case 5 -> lIlI(1385852428, var9 ^ -841625215);
            case 6 -> lIlI(1385852429, var9 ^ 66982694);
            case 7 -> lIlI(1385852430, var9 ^ 2108202747);
            case 8 -> lIlI(1385852431, var9 ^ 770326658);
            case 9 -> lIlI(1385852424, var9 ^ -1806648629);
            case 10 -> lIlI(1385852425, var9 ^ 1403552132);
            case 11 -> lIlI(1385852426, var9 ^ -877291278);
            case 12 -> lIlI(1385852427, var9 ^ -1813072858);
            case 13 -> lIlI(1385852420, var9 ^ -1217478395);
            case 14 -> lIlI(1385852421, var9 ^ 275384274);
            case 15 -> lIlI(1385852422, var9 ^ 830587748);
            case 16 -> lIlI(1385852423, var9 ^ 125510734);
            case 17 -> lIlI(1385852416, var9 ^ -1911477289);
            case 18 -> lIlI(1385852417, var9 ^ -378439819);
            case 19 -> lIlI(1385852418, var9 ^ 351271422);
            case 20 -> lIlI(1385852419, var9 ^ 671291310);
            case 21 -> lIlI(1385852444, var9 ^ 1051706274);
            case 22 -> lIlI(1385852445, var9 ^ 972961904);
            case 23 -> lIlI(1385852446, var9 ^ -1074157176);
            case 24 -> 4;
            case 25 -> lIlI(1385852447, var9 ^ -1393649363);
            case 26 -> lIlI(1385852440, var9 ^ 1466598783);
            case 27 -> lIlI(1385852441, var9 ^ 1981594817);
            case 28 -> lIlI(1385852442, var9 ^ 821010065);
            case 29 -> lIlI(1385852443, var9 ^ 247120081);
            case 30 -> lIlI(1385852436, var9 ^ 611412569);
            case 31 -> lIlI(1385852437, var9 ^ -1423129583);
            case 32 -> lIlI(1385852438, var9 ^ -674877099);
            case 33 -> lIlI(1385852439, var9 ^ -1930187760);
            case 34 -> lIlI(1385852432, var9 ^ -1958713121);
            case 35 -> lIlI(1385852433, var9 ^ 896422274);
            case 36 -> lIlI(1385852434, var9 ^ 1182936222);
            case 37 -> lIlI(1385852435, var9 ^ 653103112);
            case 38 -> lIlI(1385852460, var9 ^ 1010340397);
            case 39 -> lIlI(1385852461, var9 ^ -1102942312);
            case 40 -> lIlI(1385852462, var9 ^ 2131479503);
            case 41 -> lIlI(1385852463, var9 ^ 921745117);
            case 42 -> lIlI(1385852456, var9 ^ 1081475811);
            case 43 -> lIlI(1385852457, var9 ^ -531010246);
            case 44 -> lIlI(1385852458, var9 ^ -1029108069);
            case 45 -> lIlI(1385852459, var9 ^ 114492628);
            case 46 -> lIlI(1385852452, var9 ^ 954894283);
            case 47 -> lIlI(1385852453, var9 ^ 227503213);
            case 48 -> lIlI(1385852454, var9 ^ -185386793);
            case 49 -> lIlI(1385852455, var9 ^ -1446564316);
            case 50 -> lIlI(1385852448, var9 ^ 1783386501);
            case 51 -> lIlI(1385852449, var9 ^ 1886967547);
            case 52 -> lIlI(1385852450, var9 ^ -530556903);
            case 53 -> lIlI(1385852451, var9 ^ -33736474);
            case 54 -> lIlI(1385852476, var9 ^ -212672402);
            case 55 -> lIlI(1385852477, var9 ^ -1469780559);
            case 56 -> lIlI(1385852478, var9 ^ 583973643);
            case 57 -> lIlI(1385852479, var9 ^ -1791939405);
            case 58 -> lIlI(1385852472, var9 ^ 1789883297);
            case 59 -> lIlI(1385852473, var9 ^ 1532458408);
            case 60 -> lIlI(1385852474, var9 ^ 825385003);
            case 61 -> lIlI(1385852475, var9 ^ 548812075);
            case 62 -> lIlI(1385852468, var9 ^ -1352561623);
            case 63 -> lIlI(1385852469, var9 ^ 1330129551);
            case 64 -> lIlI(1385852470, var9 ^ 281430250);
            case 65 -> lIlI(1385852471, var9 ^ -625592089);
            case 66 -> lIlI(1385852464, var9 ^ -385401816);
            case 67 -> lIlI(1385852465, var9 ^ 1905387021);
            case 68 -> lIlI(1385852466, var9 ^ -428364378);
            case 69 -> lIlI(1385852467, var9 ^ 297131257);
            case 70 -> lIlI(1385852620, var9 ^ 527318480);
            case 71 -> lIlI(1385852621, var9 ^ -57727651);
            case 72 -> lIlI(1385852622, var9 ^ -2120286260);
            case 73 -> lIlI(1385852623, var9 ^ 985058491);
            case 74 -> lIlI(1385852616, var9 ^ 1091183882);
            case 75 -> lIlI(1385852617, var9 ^ 1491726271);
            case 76 -> lIlI(1385852618, var9 ^ -2002037075);
            case 77 -> lIlI(1385852619, var9 ^ -1380207345);
            case 78 -> lIlI(1385852612, var9 ^ 1375709350);
            case 79 -> lIlI(1385852613, var9 ^ -1684131328);
            case 80 -> lIlI(1385852614, var9 ^ 610373079);
            case 81 -> lIlI(1385852615, var9 ^ 504278810);
            case 82 -> lIlI(1385852608, var9 ^ 204948212);
            case 83 -> lIlI(1385852609, var9 ^ 986515004);
            case 84 -> lIlI(1385852610, var9 ^ -1845534542);
            case 85 -> lIlI(1385852611, var9 ^ 731267868);
            case 86 -> lIlI(1385852636, var9 ^ -1601825012);
            case 87 -> lIlI(1385852637, var9 ^ -73811146);
            case 88 -> lIlI(1385852638, var9 ^ -1411964609);
            case 89 -> lIlI(1385852639, var9 ^ 1281396632);
            case 90 -> lIlI(1385852632, var9 ^ -373480269);
            case 91 -> lIlI(1385852633, var9 ^ 2090580934);
            case 92 -> lIlI(1385852634, var9 ^ -1888001004);
            case 93 -> lIlI(1385852635, var9 ^ 495321897);
            case 94 -> lIlI(1385852628, var9 ^ -784868061);
            case 95 -> lIlI(1385852629, var9 ^ -1817753059);
            case 96 -> lIlI(1385852630, var9 ^ 1154349442);
            case 97 -> lIlI(1385852631, var9 ^ -348818837);
            case 98 -> lIlI(1385852624, var9 ^ -891203826);
            case 99 -> lIlI(1385852625, var9 ^ 299290946);
            case 100 -> lIlI(1385852626, var9 ^ -497153698);
            case 101 -> lIlI(1385852627, var9 ^ 1160428424);
            case 102 -> lIlI(1385852652, var9 ^ 2117881379);
            case 103 -> lIlI(1385852653, var9 ^ 755608489);
            case 104 -> lIlI(1385852654, var9 ^ -1594464747);
            case 105 -> lIlI(1385852655, var9 ^ -2053593163);
            case 106 -> lIlI(1385852648, var9 ^ 820612867);
            case 107 -> lIlI(1385852649, var9 ^ 964554536);
            case 108 -> lIlI(1385852650, var9 ^ 1545805434);
            case 109 -> lIlI(1385852651, var9 ^ 917803944);
            case 110 -> lIlI(1385852644, var9 ^ -583350663);
            case 111 -> lIlI(1385852645, var9 ^ -193520407);
            case 112 -> lIlI(1385852646, var9 ^ -263419764);
            case 113 -> lIlI(1385852647, var9 ^ -2055838481);
            case 114 -> lIlI(1385852640, var9 ^ -2083851792);
            case 115 -> lIlI(1385852641, var9 ^ -1841259751);
            case 116 -> lIlI(1385852642, var9 ^ 707554696);
            case 117 -> lIlI(1385852643, var9 ^ -217508365);
            case 118 -> lIlI(1385852668, var9 ^ -635460517);
            case 119 -> lIlI(1385852669, var9 ^ 1935571858);
            case 120 -> lIlI(1385852670, var9 ^ -2026045440);
            case 121 -> 5;
            case 122 -> lIlI(1385852671, var9 ^ 1761426825);
            case 123 -> lIlI(1385852664, var9 ^ -1040075747);
            case 124 -> lIlI(1385852665, var9 ^ 1930799492);
            case 125 -> lIlI(1385852666, var9 ^ -2041141771);
            case 126 -> lIlI(1385852667, var9 ^ 1355270983);
            case 127 -> lIlI(1385852660, var9 ^ 581727509);
            case 128 -> lIlI(1385852661, var9 ^ 1355210907);
            case 129 -> lIlI(1385852662, var9 ^ -616174099);
            case 130 -> lIlI(1385852663, var9 ^ 820839989);
            case 131 -> lIlI(1385852656, var9 ^ -2087786081);
            case 132 -> lIlI(1385852657, var9 ^ 856487316);
            case 133 -> 1;
            case 134 -> lIlI(1385852658, var9 ^ 1535482026);
            case 135 -> lIlI(1385852659, var9 ^ -339763170);
            case 136 -> lIlI(1385852556, var9 ^ 1112868772);
            case 137 -> lIlI(1385852557, var9 ^ 111662635);
            case 138 -> lIlI(1385852558, var9 ^ -1096754802);
            case 139 -> lIlI(1385852559, var9 ^ 459387330);
            case 140 -> lIlI(1385852552, var9 ^ -1049856231);
            case 141 -> lIlI(1385852553, var9 ^ -1430763545);
            case 142 -> lIlI(1385852554, var9 ^ -593373953);
            case 143 -> lIlI(1385852555, var9 ^ 60016282);
            case 144 -> lIlI(1385852548, var9 ^ -2057505696);
            case 145 -> lIlI(1385852549, var9 ^ -779879854);
            case 146 -> lIlI(1385852550, var9 ^ 1918382749);
            case 147 -> lIlI(1385852551, var9 ^ -1492183441);
            case 148 -> lIlI(1385852544, var9 ^ 166182788);
            case 149 -> lIlI(1385852545, var9 ^ -1226916720);
            case 150 -> lIlI(1385852546, var9 ^ 1068448846);
            case 151 -> lIlI(1385852547, var9 ^ 1737933090);
            case 152 -> lIlI(1385852572, var9 ^ 174682025);
            case 153 -> lIlI(1385852573, var9 ^ -288346518);
            case 154 -> lIlI(1385852574, var9 ^ 311996352);
            case 155 -> lIlI(1385852575, var9 ^ -89289326);
            case 156 -> lIlI(1385852568, var9 ^ 1610804240);
            case 157 -> lIlI(1385852569, var9 ^ 1143208504);
            case 158 -> lIlI(1385852570, var9 ^ 136901687);
            case 159 -> lIlI(1385852571, var9 ^ 2102826239);
            case 160 -> lIlI(1385852564, var9 ^ -1805853116);
            case 161 -> lIlI(1385852565, var9 ^ 1678768699);
            case 162 -> lIlI(1385852566, var9 ^ 354420509);
            case 163 -> lIlI(1385852567, var9 ^ 658784976);
            case 164 -> lIlI(1385852560, var9 ^ -1147631767);
            case 165 -> lIlI(1385852561, var9 ^ -1469708687);
            case 166 -> lIlI(1385852562, var9 ^ -838899222);
            case 167 -> lIlI(1385852563, var9 ^ -970306939);
            case 168 -> lIlI(1385852588, var9 ^ 1267344367);
            case 169 -> lIlI(1385852589, var9 ^ 278806013);
            case 170 -> lIlI(1385852590, var9 ^ 598942578);
            case 171 -> lIlI(1385852591, var9 ^ -101228699);
            case 172 -> lIlI(1385852584, var9 ^ -1061657673);
            case 173 -> lIlI(1385852585, var9 ^ 2017179983);
            case 174 -> lIlI(1385852586, var9 ^ 1021295363);
            case 175 -> lIlI(1385852587, var9 ^ 992062847);
            case 176 -> lIlI(1385852580, var9 ^ -1572360140);
            case 177 -> lIlI(1385852581, var9 ^ 269305828);
            case 178 -> lIlI(1385852582, var9 ^ -1559879438);
            case 179 -> lIlI(1385852583, var9 ^ 1210266570);
            case 180 -> lIlI(1385852576, var9 ^ -1406742510);
            case 181 -> lIlI(1385852577, var9 ^ -879631891);
            case 182 -> lIlI(1385852578, var9 ^ -1949182948);
            case 183 -> lIlI(1385852579, var9 ^ -1858249440);
            case 184 -> lIlI(1385852604, var9 ^ -476254550);
            case 185 -> lIlI(1385852605, var9 ^ -554941063);
            case 186 -> lIlI(1385852606, var9 ^ 1712856779);
            case 187 -> lIlI(1385852607, var9 ^ 124002976);
            case 188 -> lIlI(1385852600, var9 ^ 167159585);
            case 189 -> lIlI(1385852601, var9 ^ -1580533506);
            case 190 -> lIlI(1385852602, var9 ^ -480333849);
            case 191 -> lIlI(1385852603, var9 ^ 454716034);
            case 192 -> 2;
            case 193 -> lIlI(1385852596, var9 ^ -907221086);
            case 194 -> lIlI(1385852597, var9 ^ -1786722734);
            case 195 -> lIlI(1385852598, var9 ^ 1136628486);
            case 196 -> lIlI(1385852599, var9 ^ 336699977);
            case 197 -> lIlI(1385852592, var9 ^ -576550554);
            case 198 -> lIlI(1385852593, var9 ^ 52642841);
            case 199 -> lIlI(1385852594, var9 ^ -2016478592);
            case 200 -> lIlI(1385852595, var9 ^ -160300131);
            case 201 -> lIlI(1385852748, var9 ^ -1851386606);
            case 202 -> lIlI(1385852749, var9 ^ -52595917);
            case 203 -> lIlI(1385852750, var9 ^ -1982835375);
            case 204 -> lIlI(1385852751, var9 ^ -1279206295);
            case 205 -> lIlI(1385852744, var9 ^ -1942392271);
            case 206 -> lIlI(1385852745, var9 ^ -275473669);
            case 207 -> lIlI(1385852746, var9 ^ 1494920749);
            case 208 -> 3;
            case 209 -> lIlI(1385852747, var9 ^ 1206266919);
            case 210 -> lIlI(1385852740, var9 ^ -1634291552);
            case 211 -> lIlI(1385852741, var9 ^ -522944995);
            case 212 -> lIlI(1385852742, var9 ^ 949224755);
            case 213 -> lIlI(1385852743, var9 ^ 667129003);
            case 214 -> lIlI(1385852736, var9 ^ -183062119);
            case 215 -> lIlI(1385852737, var9 ^ -158934397);
            case 216 -> lIlI(1385852738, var9 ^ -1478979459);
            case 217 -> lIlI(1385852739, var9 ^ 2067593706);
            case 218 -> lIlI(1385852764, var9 ^ -46899420);
            case 219 -> lIlI(1385852765, var9 ^ -1426293063);
            case 220 -> lIlI(1385852766, var9 ^ -1099079640);
            case 221 -> lIlI(1385852767, var9 ^ -308447458);
            case 222 -> lIlI(1385852760, var9 ^ 2134537372);
            case 223 -> lIlI(1385852761, var9 ^ -543458225);
            case 224 -> lIlI(1385852762, var9 ^ 1508741020);
            case 225 -> lIlI(1385852763, var9 ^ 49047081);
            case 226 -> lIlI(1385852756, var9 ^ -1492494388);
            case 227 -> lIlI(1385852757, var9 ^ 66388998);
            case 228 -> lIlI(1385852758, var9 ^ -31799888);
            case 229 -> lIlI(1385852759, var9 ^ -185972300);
            case 230 -> lIlI(1385852752, var9 ^ 1878772975);
            case 231 -> lIlI(1385852753, var9 ^ 1762693307);
            case 232 -> lIlI(1385852754, var9 ^ -1661904427);
            case 233 -> lIlI(1385852755, var9 ^ 682182386);
            case 234 -> lIlI(1385852780, var9 ^ 676090430);
            case 235 -> lIlI(1385852781, var9 ^ 1782343933);
            case 236 -> lIlI(1385852782, var9 ^ 1056097244);
            case 237 -> lIlI(1385852783, var9 ^ 450209353);
            case 238 -> lIlI(1385852776, var9 ^ 186302924);
            case 239 -> lIlI(1385852777, var9 ^ -1204794971);
            case 240 -> lIlI(1385852778, var9 ^ -38409094);
            case 241 -> lIlI(1385852779, var9 ^ 1490250281);
            case 242 -> lIlI(1385852772, var9 ^ 1062736844);
            case 243 -> lIlI(1385852773, var9 ^ 729452093);
            case 244 -> lIlI(1385852774, var9 ^ -461207568);
            case 245 -> lIlI(1385852775, var9 ^ 1662483035);
            case 246 -> lIlI(1385852768, var9 ^ 1750840887);
            case 247 -> lIlI(1385852769, var9 ^ 1784921584);
            case 248 -> lIlI(1385852770, var9 ^ 466418313);
            case 249 -> lIlI(1385852771, var9 ^ 1594443865);
            case 250 -> lIlI(1385852796, var9 ^ 234111687);
            case 251 -> lIlI(1385852797, var9 ^ -505315695);
            case 252 -> lIlI(1385852798, var9 ^ -394387473);
            case 253 -> lIlI(1385852799, var9 ^ -897074981);
            case 254 -> 0;
            default -> lIlI(1385852792, var9 ^ -642860635);
         };
         int var5 = (var1 & lIlI(1385852793, var9 ^ -170766763)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIlI(1385852794, var9 ^ -444135308)) >>> lIlI(1385852795, var9 ^ -507558160)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIlI(1385852788, var9 ^ -105531100);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIlI(1385852789, var9 ^ -2040558459);
            }
         }

         IIl[var2] = new String(var3).intern();
      }

      return IIl[var2];
   }

   private void Illl(lIIlIl var1, class_310 var2, Set<String> var3) {
      class_746 var4 = var2.field_1724;
      class_1799 var5 = var4.method_6047();
      class_243 var6 = var4.method_5828(1.0F);
      class_243 var7 = new class_243(var4.method_23317(), var4.method_23320() - 0.1, var4.method_23321());
      class_243 var8 = this.IlII(var4);
      List var9 = this.III(var5, var4, var7, var6, var1);
      if (var9.isEmpty()) {
         var5 = var4.method_6079();
         var9 = this.III(var5, var4, var7, var6, var1);
      }

      if (!var9.isEmpty()) {
         Color var10 = this.IlII.IllI();
         int var11 = 0;

         for (IlIlIlIIl var13 : var9) {
            IlIIlllI var14 = this.IIll(var2.field_1687, var4, var13.II(), var13.l().method_1019(var8), var13.I(), true);
            if (var14.l().size() >= 2) {
               List var10002 = var14.l();
               String var10006 = IlIIllIII.lI(II[1]);
               int var16 = var11++;
               String var15 = var10006;
               this.lIl(var1, var10002, var14, var10, true, var15 + var16, var3);
            }
         }
      }
   }

   private int lIII(Color var1, double var2) {
      int var4 = Math.max(0, Math.min(lIlI(1385852790, -1427782265 ^ -1894635565), (int)Math.round(var1.getAlpha() * var2)));
      return var4 << lIlI(1385852791, -1427782265 ^ -255958181) | var1.getRGB() & lIlI(1385852784, -1427782265 ^ -2007001724);
   }

   private static String lIll(byte var0, int var1, int var2, byte var3, int var4, char var5) {
      int var10 = var4 ^ 2086034536;
      char[] var9 = lIII[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])lIIl[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         lIIl[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 6668;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ '\ue939' ^ switch (var8 % 21) {
            default -> 211;
            case 1 -> 43;
            case 2 -> 189;
            case 3 -> 169;
            case 4 -> 169;
            case 5 -> 143;
            case 6 -> 67;
            case 7 -> 68;
            case 8 -> 112;
            case 9 -> 254;
            case 10 -> 68;
            case 11 -> 12;
            case 12 -> 247;
            case 13 -> 224;
            case 14 -> 47;
            case 15 -> 39;
            case 16 -> 41;
            case 17 -> 60;
            case 18 -> 206;
            case 19 -> 85;
            case 20 -> 81;
         } ^ var3 ^ var0 ^ var7 ^ var1 ^ var2 ^ var4 ^ var5);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   private IlIlIlIIl lIIl(class_243 var1, lIIlIl var2) {
      class_4184 var3 = var2.lIl() != null ? var2.lIl() : class_310.method_1551().field_1773.method_19418();
      float var4 = var3.method_19329();
      float var5 = var3.method_19330();
      float var6 = class_3532.method_15374((float)Math.toRadians(-var5) - (float) Math.PI);
      float var7 = class_3532.method_15362((float)Math.toRadians(-var5) - (float) Math.PI);
      float var8 = -class_3532.method_15362((float)Math.toRadians(-var4));
      float var9 = class_3532.method_15374((float)Math.toRadians(-var4));
      class_243 var10 = new class_243(-var7, class_3532.method_15363(-(var9 / var8), -5.0F, 5.0F), -var6);
      double var11 = var10.method_1033();
      if (var11 > 1.0E-6) {
         double var13 = 0.6 / var11 + 0.5;
         var10 = var10.method_1021(var13);
      }

      return new IlIlIlIIl(var1, var10, new IlIlllIl(0.03, 0.92, 0.92, 0.03, true, ll));
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var18 = -1407083290;
      String var8 = "뎚㋨\ue5cf粇험帒ኑ쮀譪浮棯\uf0c1쥷糒\uf3be䵺ឋ\uf0b2룥⁏ộ⼠㕎\uef34࣭៊洴뙈ꉽ녙⌔˱퍦技ᜪ駓划洛ᰱ缚ꀘ멟긴斐璫㾖\ue900͇ᨰ悏ﱯ쓪鶀\udd45᭸夢\ue6f9ȝ䰫焭됅圇\udd2b뎣ᗞ듼趝⯰끢菂첟姼ข뽵艷뼖锽㘼巉㼜ݫﭮ콿奛遘䷌뇒\ud90eᴹ\ue21b샕欮拗볰\uf85d峑䉛\ue8f1쉎鴙혪⩀\uf538豋䤉籜Ꭿ⣉ዕ춞\ud91dସ⩆栨팇⥡\u074c㥄\uef7c놋\uf334ꝡ惕\uf5bf䲴䧍ꮫ箖班溑罋ៗⷾℯ힞鐈\ue8e0轶瀚衎ヽ冫䦱缼ᰳ낪⥲짍ឍ⚌\uf6bc뤒瞸잚抶ᷫ≪ᗢﲺ䶫\uf2fdᝫ㱊崊憪鶽\ud84e丯슠㾛\udb86䣗鯆悧។\ueb02渣韁ᢐ链巊罘摚\udbc2䝈⾱礸猹욧쥴㞢맲럆마㞑\u177d᪼⍙\ue352졲䀽읖⪒５\uf799\udd42馔ᾓ偶틱㪁\ue070ꄾ䦋怽㉉餺尗ల倮ꩽ侻ퟯ\uedf2쌕⧼⫻揶芜";
      char[] var9 = "㭵㮠".toCharArray();
      byte var14 = -1;
      short var7 = 15289;
      String[] var10 = new String[var9.length];

      while (true) {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         if (var14 == 0) {
            lIII = var10;
            lIIl = new Object[var10.length];
            int var22 = 0;
            int var10001 = 0;
            Illl = new int[330];
            byte[] var10002 = "ç\u001fA\u0002P/-ô\u0089\f\u00adÔB\u0015°û\"\u0095\u0015l?ç¿\u0091\u0082¼»]\u008f\t\u0092\u0018\u0017Ó+(ü\u000b+¿c¶D\u009cí\u008fÖ\u001b\u008fxÌ©ê]YÒ½\u008cw´«\u0086\u0093y\f\u0095È~Âßx\tùï]M6yÅ\u0084 X\u001e¥\u001f\u0095ÅæG³Ò¼l{\r¼Üú\u00106\u009a9\u0086ÜÕÊÔÄ·\u0092\u0099ûKâuÚç÷¤Î\u009erÞ]G£ÐÄµß²Þß)á\u0003e\u0084Óýût\u0095C¼b÷ÉMÍ\u0091\u0083\u0091PpÔí)\u0007}öÛ;I\u0083\u0096æ¡=+%ð\u001eg\"Î\u009b\u009f·\u0016\u0016?J¤Jf\u008fL÷\u0017eB\u0011¦'årK\u000e\ft\u00150^¸Gäµ«\u0007\u0087\u008d}«t[÷à\u008f\u0083\u001cü´á¸9\u001e\u0099\n=\u008dþIÈébGìñób#wQR\u0087UÇ¯sÄ`¦\u0003\u0084=k¢¬·¥\u0089o\u0082Ûßåì\u008b\u009d;\u009f2'ÆtõßýDmÂãÙ5\u0099È\u008c\u0011\u0019½¬¶\u001d{/\u0097ö¿Û¡\fX\u008f(fPüO\u0006\u000bü²\u0098\u0085\u0017\u008etk§\u0098Ø¾\u009b\u009f\u0089D°\u0019\u008eÕ\u0014\n\u0099åóñ\u001dù'ÐkÀ¢\u0096\u0098ân¨Í¼d\u0082\u0006\u0011m\r[¸\u0083q±M\u0090*\u0084×\u001f-7\u0014I\u0093\u0019,ªàõP)\u0080\u009aì¯\u009aOî\u009d\u00185\u0013-Ù|·è\u0090\u0087Ê\ræ\u0001~EF.\u0011kdÞr\u001a ¤xp\u009e\u009dû\\«ø\u0010\u0018R\u0084DI\u000f°S$Ì;-DÖ\u000fª7F\u0017$û[\u008aD+U%\u009c\u001a\u000e\u0013\u0091Í\u0084¹ÇW3FP\u001fÌØ\b\u0085ý \u000e½\u0097E\u001cW\u0086ÁH.\t\u0016ñ&é?V\u0010¶±3Â|ÁD\u000eOp@é×æ\u009aì@\u0000ÑP·Â \u0089¹\u0019AÊZøYà'é\u0084\u0018\u009cÁ·bç}Y\u0098þ\u009e\u0093\u0096.Ü*\u001b\u000bÌÉr÷\u0088Ôë=éNW\u0082\u0016ñ\u009d¸yÔÀª@>\u007f\u009cº}ø7\u0088\u001c¿\u008dá?\u0091\u0006ñk¶]îÀÉ\r ]ìê\u0017ôhOÊXüÚìÇ¯)\u0000\u0018\u0006»ñ\u007fbw@¡ü5Ð6¦âº\u0085\u0002MB\u000e*l\u00963<·¡ª\u0088D)u+ã]Ç\u0081ØK2\u009e\u008b~×\t\u0006\u0081\u001bÄ#ïÛÛ\u0096\u009eôÁ\u009f\n\u0093\u007fúTb2\u0090Ãè\\{Mº\u0003R\u0000`ÉV;õ]#\u0001\u0019,%½\u008dZ47àÑ\u008c[\u0016yU~iÝ|hØ«Õ)\u0007\u009c!J|«Î\u008aAûdvÉÃÕbÕ\u0097 !Þ'ö°·`\u0084Û\t³ö±\u009c\u008d}2\u0091|\u0096\u009az¼%ù\u0095Ý\u0095{\u0089Æýòä4MÈÜ\u008dä\"{S Ðª\u000e\u0018×¥ù½\u0016Í4g\u001b\u000bÞ\fÏ<~zÖ¨Ù¥ä»'#+\u0088[wô\u0086¡Ô/O'\u0001xj\u00ad¯\u0090ÃC\u0010©ÀÆ\u0099Ø@GÁá½G¬\u001e\u0013^H§Rc´ïÓã\\ÚñÔÆu\u0090ZâT\u0086ý®_\u0088aÛ!éP2+¢\u0087Âx\u0086Á³W|\u008c\u00813>\u0014\u001dïû\u009a\u000e\u0011{Õk\u0088\u0015\u008a`]6cíý_¾¶éA«\u0085Ä_\t_\u0080#QfÏ\u001f\u008aÞLÅ\u000e\u009a¨ÇÍ\u009dVÑI\u00040Ìã¶z;ú\u0005q\\=îTHz\nQ¬Vmæ\u009c|-¦¨y7J!ÁEë\u0092\u008fx\u009b9kÀob(¡\u0013Y2¯\u0081Úª\u0007½\u0084 E)Ó)½m\u0016\u0088o\u009b\u009bÉ3÷»ÕåÈïD²fÞ/{Õòø¥T8Ú!¹\u0086:P\u0005\u007fQ7ÑhÞZª\u000eÂ/§(b\u0015·¡x*N\u000f·IãçEÿmÒ_á\u0091P]8áÊõF£\u0003Ý\u009eãx\u0014\u0081´é\u0012SaÌ\u0013Pñ§+\u0001¯íÓÝK\u00843[C\"Ø\f\u008b\u0004ð\u0018\n\u001déKê\n,ÙM\tµyì\u0001°ÿ\u009aòb¤\u009b\u001b&\u0001}*ð¥\u0082yæXm¸¯R\u009d4(É\u008c±kÏgí¦:\u0086$q\u008eÞ;Ä\u008e;/8ÌK\u0012\u0096\u0098\u0085¾ö¼¢Û¥\u00adm¼X\u001eG4\u0094[Â\u0096\u0005þ¤\u0017\u0099\u0099/nX\u008d\rô{Bõú\u0012Å`\u0007ÆÎ,Ë\u000eÌ\u0014ÀI½»\u0087\u001eù~5°«\u0083?àG\u0096\u0003/N\tb+lðÅ5\u007fÙÄ2S¥4)Cñu\u000bGÈ;\u0087_ÂÃU (öõf}Ø\u0094\u0019Ñ\u009bd`0mÅ\u0004´á¨\u0000 -\u001c\t¬|\u000eHä\u008c°\u0011¢\u0082%û\u001de«è\u0017³¬´éõÅâÍ1à[3Ç¦|íã5_(I\u0014G|ÐM"
               .getBytes("ISO-8859-1");

            int var55;
            do {
               Illl[var22] = (
                     (var10002[var10001] & 255) << 24
                        | (var10002[var10001 + 1] & 255) << 16
                        | (var10002[var10001 + 2] & 255) << 8
                        | var10002[var10001 + 3] & 255
                  )
                  ^ 286281863;
               var22 += 1;
               var55 = var10001 + 4;
               var10001 += 4;
            } while (var55 < var10002.length);

            String[] var5 = new String[lIlI(1385852495, var18 ^ -1380052760)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lIll((byte)-54, 499724574, 1533371816, (byte)-72, 2086034536, (char)'ꒂ')).length();
            int var1 = lIlI(1385852488, var18 ^ -851528443);
            int var20 = -1;

            label100:
            while (true) {
               var22 = lIlI(1385852489, var18 ^ -800317502);
               String var27 = var2.substring(++var20, var20 + var1);
               byte var39 = -1;

               while (true) {
                  label95: {
                     char[] var57 = var27.toCharArray();
                     int var69 = var57.length;
                     int var6 = 0;
                     var55 = var22;
                     var44 = var57;
                     var10001 = var69;
                     char[] var81;
                     int var88;
                     if (var69 <= 1) {
                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     } else {
                        var55 = var22;
                        var10001 = var69;
                        if (var69 <= var6) {
                           break label95;
                        }

                        var81 = var57;
                        var69 = var22;
                        var88 = var6;
                     }

                     while (true) {
                        var81[var88] = (char)(var81[var88] ^ var69 ^ switch (var6 % lIlI(1385852485, var18 ^ 329288610)) {
                           case 0 -> lIlI(1385852486, var18 ^ -1944197949);
                           case 1 -> lIlI(1385852487, var18 ^ 35944021);
                           case 2 -> lIlI(1385852480, var18 ^ 1624468506);
                           case 3 -> 1;
                           case 4 -> lIlI(1385852481, var18 ^ 100071802);
                           case 5 -> lIlI(1385852482, var18 ^ 1378342898);
                           default -> 4;
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
                        if ((var20 += var1) >= var4) {
                           Ill = var5;
                           IIl = new String[lIlI(1385852484, var18 ^ -126317776)];
                           II = new String[lIlI(1385852483, var18 ^ 1143812966)];
                           IIII();
                           IlIl = lIIIIIIl.lI;
                           ll = lIIIIIIl.II;
                           return;
                        }

                        var1 = var2.charAt(var20);
                        break;
                     default:
                        var5[var3++] = var62;
                        if ((var20 += var1) < var4) {
                           var1 = var2.charAt(var20);
                           continue label100;
                        }

                        var4 = (var2 = lIll(35, -301144926, -1535596348, (byte)29, 2086034537, '㉝')).length();
                        var1 = lIlI(1385852490, var18 ^ 1830230858);
                        var20 = -1;
                  }

                  var22 = lIlI(1385852491, var18 ^ 1621242455);
                  var27 = var2.substring(++var20, var20 + var1);
                  var39 = 0;
               }
            }
         }

         do {
            var13 = var9[var11] ^ var7;
            char[] var15 = var8.substring(var12, var12 + var13).toCharArray();
            int var16 = 0;

            do {
               short var17 = switch (var16 % 6) {
                  default -> 8;
                  case 1 -> 224;
                  case 2 -> 52;
                  case 3 -> 189;
                  case 4 -> 33;
                  case 5 -> 195;
               };
               var15[var16] = (char)(var15[var16] ^ var17);
            } while (++var16 < var15.length);

            var10[var11] = new String(var15).intern();
            var12 += var13;
         } while (++var11 < var9.length);

         var14 = 0;
      }
   }

   public llIlIIlI() {
      int var1 = 1609210810;
      super(IlIIllIII.Ill(II[lIlI(1385852785, var1 ^ 416565214)]), lllIIlIl.IIl, IlIIllIII.Ill(II[lIlI(1385852786, var1 ^ 482380653)]));
      this.llI = this.IllIIll(new IIlIII(IlIIllIII.Ill(II[lIlI(1385852787, var1 ^ 365746809)]), 120.0, 30.0, 300.0, 10.0));
      this.IlI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(II[4]), true));
      this.lIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(II[lIlI(1385852684, var1 ^ 1417947833)]), true));
      this.IlII = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(II[lIlI(1385852685, var1 ^ 230827050)]),
            new Color(
               lIlI(1385852686, var1 ^ -411188468),
               lIlI(1385852687, var1 ^ -193522330),
               lIlI(1385852680, var1 ^ -1467394879),
               lIlI(1385852681, var1 ^ -22178004)
            )
         )
      );
      this.lII = this.IllIIll(
         new IIIlIIlll(
            IlIIllIII.Ill(II[5]),
            new Color(
               lIlI(1385852682, var1 ^ 1196648096),
               lIlI(1385852683, var1 ^ 1619871187),
               lIlI(1385852676, var1 ^ 1128853421),
               lIlI(1385852677, var1 ^ 1528592017)
            )
         )
      );
      this.III = new IllIlI<>();
      this.IIll = new ArrayList<>();
      this.IllI = new ArrayList<>();
      this.IIlI = new ArrayList<>();
      this.Il = new HashMap<>();
   }
}
