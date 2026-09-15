package k74.x;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import k74.y.IIlIIllI;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

@Environment(EnvType.CLIENT)
public final class llIlIlIl extends IlIIIIIIl {
   private int II;
   private static final int[] lIll;
   private int Il;
   private static String[] I;
   private static final String[] lI;
   private Runnable ll;
   private long III;
   private class_746 IIl;
   private boolean IlI;
   private boolean Ill;
   private final IIlIII lII;
   private long lIl;
   private static final int llI = 9;
   private static final int lll = 1;
   private long IIII;
   private final lIlllIl IIIl;
   private IIlIlIII IIlI;
   private static final Object[] llIl;
   private boolean IIll;
   private final lllIIlII IlII;
   private int IlIl;
   private final lIlllIl IllI;
   private Runnable Illl;
   private int lIII;
   private final IIlIII lIIl;
   private static final String[] llII;
   private static final String[] lIlI;

   private boolean I(class_746 var1) {
      return var1 != null && (this.ll(var1.method_6047()) || this.ll(var1.method_6079()));
   }

   private int II(class_746 var1) {
      if (var1 == null) {
         return 0;
      } else {
         int var2 = this.ll(var1.method_6047()) ? var1.method_6047().method_7947() : 0;
         if (this.ll(var1.method_6079())) {
            var2 += var1.method_6079().method_7947();
         }

         return var2;
      }
   }

   private void Il(class_310 var1) {
      if (!this.Ill()) {
         this.llII(var1);
         this.IIlI();
      } else if (!this.lIlI(var1)) {
         this.llII(var1);
         this.IIlI();
      } else if (!lIIIllII.ll(var1)) {
         class_746 var2 = var1.field_1724;
         if (this.Ill && this.IIl != var2) {
            this.IIlI();
         }

         double var3 = this.IIll(var2);
         double var5 = Math.max(this.lIIl.IllI(), this.lII.IllI());
         if (!this.Ill) {
            if (!IlIIIlIII.llll(var3, this.lIIl.IllI())) {
               return;
            }

            this.lIII = this.Illl(var2);
            if (this.lIII < 0) {
               return;
            }

            this.IlIl = k74.x.IIll.IIlII(var2.method_31548());
            this.IIl = var2;
            this.Ill = true;
         }

         if (IlIIIlIII.Illl(var3, var5)) {
            this.llII(var1);
            this.IIlI();
         } else {
            if (!this.ll(var2.method_31548().method_5438(this.lIII))) {
               this.lIII = this.Illl(var2);
               if (this.lIII < 0) {
                  this.llII(var1);
                  this.IIlI();
                  return;
               }
            }

            if (this.IIlI == null || !this.IIlI.IIl() || !k74.x.IIll.IIIII(var1, this.IIlI) || this.IIlI.III() != this.lIII) {
               boolean var7 = k74.x.IIll.lIIlI(var1) != this.lIII;
               int var8 = var7 ? this.lIl(this.IIIl) : 0;
               this.IIlI = k74.x.IIll.llII(var1, this, this.lIII, var8, true);
               if (this.IIlI == null || !this.IIlI.IIl()) {
                  this.IIlI = null;
                  this.lIl = 0L;
                  return;
               }

               this.lIl = Long.MAX_VALUE;
            }

            if (k74.x.IIll.IIIllII(var1, this.IIlI)) {
               long var11 = System.currentTimeMillis();
               if (this.IIll) {
                  if (var2.field_6012 > this.II) {
                     this.IIII++;
                     this.IIll = false;
                     this.II = l(-211922687, 1218401017 ^ -891747323);
                     this.Illl = null;
                     this.lIl = 0L;
                  }
               } else {
                  if (this.lIl == Long.MAX_VALUE) {
                     this.lIl = var11;
                  }

                  if (var11 >= this.lIl) {
                     long var9 = this.IIIl() * 50L;
                     if (this.lIll(var1)) {
                        this.IIll = true;
                        this.II = var2.field_6012 + 1;
                        this.Illl = new llIIIlII(this, var9);
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public void IIlIl() {
      this.IlII(class_310.method_1551(), false);
      this.Il(class_310.method_1551());
   }

   @Override
   public void IllIll(class_310 var1) {
      this.IlII(var1, false);
      if (!this.lIlI(var1) || var1.field_1690 == null || var1.field_1690.field_1904 == null) {
         this.III = 0L;
         this.lll();
      } else if (!var1.field_1690.field_1904.method_1434() || !this.I(var1.field_1724)) {
         this.lll();
      } else if (!this.IlI) {
         long var2 = System.currentTimeMillis();
         if (var2 < this.III) {
            IIlllIllI.IIIl(var1, 1);
         } else {
            this.Il = this.II(var1.field_1724);
            this.IlI = true;
            long var4 = this.IIIl() * 50L;
            this.ll = new lIlIllI(this, var4);
            k74.x.IIll.IlIll(var1);
         }
      }
   }

   @Override
   public void llIIII(class_310 var1) {
      if (this.IlI) {
         boolean var2 = this.lIlI(var1) && (k74.x.IIll.IllIl(var1) > 0 || this.II(var1.field_1724) < this.Il);
         Runnable var3 = this.ll;
         this.lll();
         if (var2 && var3 != null) {
            var3.run();
         }
      }
   }

   public void lI(class_310 var1) {
      if (this.IlI) {
         this.IlII(var1, false);
      }
   }

   private boolean ll(class_1799 var1) {
      return var1 != null && !var1.method_7960() && var1.method_31574(class_1802.field_8287);
   }

   private boolean III(class_1799 var1) {
      class_9304 var3 = (class_9304)var1.method_58695(class_9334.field_49633, class_9304.field_49385);
      String[] var10000 = IIllllIl.IIIIl();
      Iterator var4 = var3.method_57534().iterator();
      String[] var2 = var10000;

      while (var4.hasNext()) {
         class_6880 var5 = (class_6880)var4.next();
         String var6 = var5.method_40230().map(llIlIlIl::IlIl).orElse(I[1]);
         if (IlIIllIII.lI(I[0]).equals(var6)) {
            return true;
         }

         if (var2 != null) {
            break;
         }
      }

      return false;
   }

   @Override
   public String IlIIl() {
      int var1 = (int)Math.round(this.IllI.IIlI());
      int var2 = (int)Math.round(this.IllI.IlI());
      String var10000;
      if (var1 == var2) {
         var10000 = Integer.toString(var1);
      } else {
         String var5 = IlIIllIII.lI(I[3]);
         var10000 = var1 + var5 + var2;
      }

      String var3 = var10000;
      if (this.IlII.IllI()) {
         var10000 = IlIIllIII.lI(I[4]);
         String var7 = IlIIllIII.lI(I[5]);
         String var8 = var10000;
         var10000 = var8 + var3 + var7;
      } else {
         String var9 = IlIIllIII.lI(I[2]);
         var10000 = var3 + var9;
      }

      return var10000;
   }

   private static int l(int var0, int var1) {
      int var2 = lIll[var0 ^ -211922687] ^ var1 ^ var0;
      var2 += 21914;
      var2 ^= 31587;
      var2 ^= 32205;
      var2 += 32347;
      var2 -= 51817;
      var2 += 9384;
      var2 += 38920;
      return var2 ^ 35689;
   }

   private boolean IIl(class_310 var1) {
      return var1 != null && var1.field_1724 != null && this.lIII >= 0 && this.lIII < l(-211922688, 628371999 ^ 445223179)
         ? k74.x.IIll.IIlII(var1.field_1724.method_31548()) == this.lIII && this.ll(var1.field_1724.method_31548().method_5438(this.lIII))
         : false;
   }

   private static String lllI(int var0, int var1) {
      int var3 = var0 ^ 447339373;
      char[] var4 = llII[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])llIl[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         llIl[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 967619130;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 218;
            case 1 -> 170;
            case 2 -> 142;
            case 3 -> 155;
            case 4 -> 44;
            case 5 -> 106;
            case 6 -> 123;
            case 7 -> 0;
            case 8 -> 75;
            case 9 -> 186;
            case 10 -> 78;
            case 11 -> 216;
            case 12 -> 203;
            case 13 -> 28;
            case 14 -> 8;
            case 15 -> 58;
            case 16 -> 207;
            case 17 -> 124;
            case 18 -> 35;
            case 19 -> 60;
            case 20 -> 79;
            case 21 -> 189;
            case 22 -> 100;
            case 23 -> 98;
            case 24 -> 53;
            case 25 -> 216;
            case 26 -> 226;
            case 27 -> 255;
            case 28 -> 159;
            case 29 -> 94;
            case 30 -> 153;
            case 31 -> 63;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public llIlIlIl() {
      int var1 = 1867056786;
      super(IlIIllIII.Ill(I[l(-211922685, var1 ^ -335105911)]), lllIIlIl.IlI, IlIIllIII.Ill(I[l(-211922686, var1 ^ 1893886541)]));
      this.IlII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(I[l(-211922683, var1 ^ -1585219740)]), false));
      this.IllI = this.IllIIll(new lIlllIl(IlIIllIII.Ill(I[l(-211922684, var1 ^ 2087866634)]), 1.0, 4.0, 1.0, 4.0, 1.0).lI(IlIIllIII.lI(I[2])));
      this.lIIl = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(I[l(-211922681, var1 ^ -988908521)]), 65.0, 1.0, 100.0, 1.0).IlII(IlIIllIII.lI(I[l(-211922682, var1 ^ -1174162495)]))
      );
      this.lII = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(I[l(-211922679, var1 ^ -620139056)]), 95.0, 1.0, 100.0, 1.0).IlII(IlIIllIII.lI(I[l(-211922680, var1 ^ -20311861)]))
      );
      this.IIIl = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(I[l(-211922677, var1 ^ -2069442114)]), 55.0, 60.0, 0.0, 300.0, 5.0).lI(IlIIllIII.lI(I[l(-211922678, var1 ^ -1696800174)]))
      );
      this.IlIl = -1;
      this.lIII = -1;
      this.IIlI = null;
      this.II = l(-211922675, var1 ^ 624804434);
      this.lIIl.lIlI(this::Ill);
      this.lII.lIlI(this::Ill);
   }

   private boolean Ill() {
      return this.IlII.IllI();
   }

   private static String lII(int var0, int var1) {
      int var9 = 2090166280;
      int var2 = (var0 ^ l(-211922676, var9 ^ 1028133272)) & l(-211922673, var9 ^ 1808774651);
      if (lIlI[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & l(-211922674, var9 ^ 1068794708)) {
            case 0 -> l(-211922671, var9 ^ -1403212482);
            case 1 -> l(-211922672, var9 ^ 1379818897);
            case 2 -> l(-211922669, var9 ^ 1745312395);
            case 3 -> l(-211922670, var9 ^ -1709089025);
            case 4 -> l(-211922667, var9 ^ -1950316817);
            case 5 -> l(-211922668, var9 ^ -43509176);
            case 6 -> l(-211922665, var9 ^ -925284029);
            case 7 -> l(-211922666, var9 ^ 902374107);
            case 8 -> l(-211922663, var9 ^ 1317312193);
            case 9 -> l(-211922664, var9 ^ 1662126558);
            case 10 -> l(-211922661, var9 ^ -6775768);
            case 11 -> l(-211922662, var9 ^ -1803973062);
            case 12 -> l(-211922659, var9 ^ -437720170);
            case 13 -> l(-211922660, var9 ^ -380340074);
            case 14 -> l(-211922657, var9 ^ 1415594487);
            case 15 -> l(-211922658, var9 ^ -903628115);
            case 16 -> l(-211922655, var9 ^ 523837529);
            case 17 -> l(-211922656, var9 ^ 1160602962);
            case 18 -> l(-211922653, var9 ^ 1046488227);
            case 19 -> l(-211922654, var9 ^ -1466790660);
            case 20 -> l(-211922651, var9 ^ -443589294);
            case 21 -> l(-211922652, var9 ^ -244085370);
            case 22 -> l(-211922649, var9 ^ 1942008393);
            case 23 -> l(-211922650, var9 ^ -289438822);
            case 24 -> l(-211922647, var9 ^ 443095997);
            case 25 -> l(-211922648, var9 ^ -1007543548);
            case 26 -> l(-211922645, var9 ^ -23083639);
            case 27 -> l(-211922646, var9 ^ 706575432);
            case 28 -> l(-211922643, var9 ^ 1742532353);
            case 29 -> l(-211922644, var9 ^ 1481540656);
            case 30 -> l(-211922641, var9 ^ 1022395487);
            case 31 -> l(-211922642, var9 ^ 1343959954);
            case 32 -> l(-211922639, var9 ^ 806046436);
            case 33 -> l(-211922640, var9 ^ 241370763);
            case 34 -> l(-211922637, var9 ^ 172994112);
            case 35 -> l(-211922638, var9 ^ 571382727);
            case 36 -> l(-211922635, var9 ^ -145990255);
            case 37 -> l(-211922636, var9 ^ -1069400229);
            case 38 -> l(-211922633, var9 ^ 263804401);
            case 39 -> l(-211922634, var9 ^ -210615566);
            case 40 -> l(-211922631, var9 ^ 1361707642);
            case 41 -> l(-211922632, var9 ^ -818017838);
            case 42 -> l(-211922629, var9 ^ -918787738);
            case 43 -> l(-211922630, var9 ^ -761046670);
            case 44 -> l(-211922627, var9 ^ -887467753);
            case 45 -> l(-211922628, var9 ^ -2076665242);
            case 46 -> l(-211922625, var9 ^ 123914807);
            case 47 -> l(-211922626, var9 ^ 239777764);
            case 48 -> l(-211922623, var9 ^ 1574470569);
            case 49 -> l(-211922624, var9 ^ -138346718);
            case 50 -> l(-211922621, var9 ^ 933630249);
            case 51 -> l(-211922622, var9 ^ -760509354);
            case 52 -> l(-211922619, var9 ^ -1254624082);
            case 53 -> l(-211922620, var9 ^ 1832765832);
            case 54 -> l(-211922617, var9 ^ -928640627);
            case 55 -> l(-211922618, var9 ^ 1912489848);
            case 56 -> l(-211922615, var9 ^ 1212344433);
            case 57 -> l(-211922616, var9 ^ -1250055023);
            case 58 -> l(-211922613, var9 ^ -1223160753);
            case 59 -> l(-211922614, var9 ^ 282230268);
            case 60 -> l(-211922611, var9 ^ -2066005809);
            case 61 -> l(-211922612, var9 ^ -308439879);
            case 62 -> l(-211922609, var9 ^ -1009127996);
            case 63 -> l(-211922610, var9 ^ -1564611422);
            case 64 -> l(-211922607, var9 ^ 1284342785);
            case 65 -> l(-211922608, var9 ^ -293161661);
            case 66 -> l(-211922605, var9 ^ -1870849825);
            case 67 -> l(-211922606, var9 ^ 1183396398);
            case 68 -> l(-211922603, var9 ^ 1635125049);
            case 69 -> l(-211922604, var9 ^ 1066674119);
            case 70 -> l(-211922601, var9 ^ -1454908744);
            case 71 -> l(-211922602, var9 ^ -1567406817);
            case 72 -> l(-211922599, var9 ^ 478465938);
            case 73 -> l(-211922600, var9 ^ 1091424803);
            case 74 -> l(-211922597, var9 ^ -1016265216);
            case 75 -> l(-211922598, var9 ^ 264063133);
            case 76 -> l(-211922595, var9 ^ -1223902684);
            case 77 -> l(-211922596, var9 ^ 591336712);
            case 78 -> l(-211922593, var9 ^ -1052787540);
            case 79 -> l(-211922594, var9 ^ -1046182127);
            case 80 -> l(-211922591, var9 ^ 1225315937);
            case 81 -> l(-211922592, var9 ^ -157784327);
            case 82 -> l(-211922589, var9 ^ -213085689);
            case 83 -> l(-211922590, var9 ^ -1330233659);
            case 84 -> l(-211922587, var9 ^ -443873366);
            case 85 -> l(-211922588, var9 ^ 945329);
            case 86 -> l(-211922585, var9 ^ 995898089);
            case 87 -> l(-211922586, var9 ^ -999995645);
            case 88 -> l(-211922583, var9 ^ -2145934589);
            case 89 -> l(-211922584, var9 ^ 1159444889);
            case 90 -> l(-211922581, var9 ^ -1761544139);
            case 91 -> l(-211922582, var9 ^ 2062155850);
            case 92 -> 1;
            case 93 -> l(-211922579, var9 ^ 1639394641);
            case 94 -> l(-211922580, var9 ^ 1124415452);
            case 95 -> l(-211922577, var9 ^ 1112430917);
            case 96 -> l(-211922578, var9 ^ -1901979726);
            case 97 -> l(-211922575, var9 ^ -501582979);
            case 98 -> l(-211922576, var9 ^ 1896893619);
            case 99 -> l(-211922573, var9 ^ -1342619613);
            case 100 -> l(-211922574, var9 ^ 1163985412);
            case 101 -> l(-211922571, var9 ^ -419148678);
            case 102 -> l(-211922572, var9 ^ 2016641898);
            case 103 -> l(-211922569, var9 ^ -2036182716);
            case 104 -> l(-211922570, var9 ^ -1772851049);
            case 105 -> l(-211922567, var9 ^ -633825840);
            case 106 -> l(-211922568, var9 ^ -1180156387);
            case 107 -> l(-211922565, var9 ^ 1262167055);
            case 108 -> l(-211922566, var9 ^ -1882400395);
            case 109 -> l(-211922563, var9 ^ -1071246976);
            case 110 -> l(-211922564, var9 ^ -1522429393);
            case 111 -> l(-211922561, var9 ^ 387147280);
            case 112 -> l(-211922562, var9 ^ 63116439);
            case 113 -> l(-211922559, var9 ^ 677550896);
            case 114 -> l(-211922560, var9 ^ -1646207045);
            case 115 -> l(-211922557, var9 ^ 1297641);
            case 116 -> l(-211922558, var9 ^ -1711789167);
            case 117 -> l(-211922555, var9 ^ -1374995867);
            case 118 -> l(-211922556, var9 ^ 989733587);
            case 119 -> l(-211922553, var9 ^ -53797060);
            case 120 -> l(-211922554, var9 ^ -442934971);
            case 121 -> l(-211922551, var9 ^ 1863463103);
            case 122 -> l(-211922552, var9 ^ 792993032);
            case 123 -> l(-211922549, var9 ^ -100979974);
            case 124 -> l(-211922550, var9 ^ 1430117214);
            case 125 -> l(-211922547, var9 ^ -423840723);
            case 126 -> 5;
            case 127 -> l(-211922548, var9 ^ -1671405876);
            case 128 -> l(-211922545, var9 ^ -457527305);
            case 129 -> l(-211922546, var9 ^ -2123241854);
            case 130 -> l(-211922543, var9 ^ -1954735773);
            case 131 -> l(-211922544, var9 ^ -1228997314);
            case 132 -> l(-211922541, var9 ^ -353962723);
            case 133 -> l(-211922542, var9 ^ 1271633026);
            case 134 -> l(-211922539, var9 ^ -973111828);
            case 135 -> l(-211922540, var9 ^ -1048836163);
            case 136 -> l(-211922537, var9 ^ -419184956);
            case 137 -> l(-211922538, var9 ^ -455205286);
            case 138 -> l(-211922535, var9 ^ 1773341326);
            case 139 -> l(-211922536, var9 ^ -120712033);
            case 140 -> l(-211922533, var9 ^ 1651455590);
            case 141 -> l(-211922534, var9 ^ 1958919469);
            case 142 -> l(-211922531, var9 ^ -1976858013);
            case 143 -> l(-211922532, var9 ^ -13908470);
            case 144 -> l(-211922529, var9 ^ -1793950304);
            case 145 -> l(-211922530, var9 ^ -1383996716);
            case 146 -> l(-211922527, var9 ^ -1079715465);
            case 147 -> l(-211922528, var9 ^ 1571736777);
            case 148 -> l(-211922525, var9 ^ 2011565567);
            case 149 -> l(-211922526, var9 ^ 2132490585);
            case 150 -> l(-211922523, var9 ^ 1659389263);
            case 151 -> l(-211922524, var9 ^ -255766847);
            case 152 -> l(-211922521, var9 ^ 1905768942);
            case 153 -> l(-211922522, var9 ^ 1605553707);
            case 154 -> l(-211922519, var9 ^ 2119466253);
            case 155 -> l(-211922520, var9 ^ 1060927935);
            case 156 -> l(-211922517, var9 ^ -775922967);
            case 157 -> l(-211922518, var9 ^ -397771707);
            case 158 -> l(-211922515, var9 ^ -888516177);
            case 159 -> l(-211922516, var9 ^ 287871618);
            case 160 -> l(-211922513, var9 ^ -1262977211);
            case 161 -> l(-211922514, var9 ^ 1985657465);
            case 162 -> l(-211922511, var9 ^ 836033428);
            case 163 -> l(-211922512, var9 ^ -760303117);
            case 164 -> 2;
            case 165 -> l(-211922509, var9 ^ 1609076961);
            case 166 -> l(-211922510, var9 ^ -1282351578);
            case 167 -> l(-211922507, var9 ^ -19258536);
            case 168 -> l(-211922508, var9 ^ -1447439506);
            case 169 -> l(-211922505, var9 ^ 1780674928);
            case 170 -> l(-211922506, var9 ^ 855933991);
            case 171 -> l(-211922503, var9 ^ -1944226710);
            case 172 -> l(-211922504, var9 ^ 1227265042);
            case 173 -> l(-211922501, var9 ^ -843183743);
            case 174 -> l(-211922502, var9 ^ -15992114);
            case 175 -> l(-211922499, var9 ^ -1406827279);
            case 176 -> l(-211922500, var9 ^ 828544866);
            case 177 -> l(-211922497, var9 ^ 1405519247);
            case 178 -> l(-211922498, var9 ^ 2089692050);
            case 179 -> l(-211922495, var9 ^ 686750202);
            case 180 -> l(-211922496, var9 ^ 876418703);
            case 181 -> l(-211922493, var9 ^ 610809610);
            case 182 -> l(-211922494, var9 ^ 1646969042);
            case 183 -> l(-211922491, var9 ^ -1687364238);
            case 184 -> l(-211922492, var9 ^ 343495928);
            case 185 -> l(-211922489, var9 ^ 1606672657);
            case 186 -> l(-211922490, var9 ^ -1647979775);
            case 187 -> l(-211922487, var9 ^ 628857045);
            case 188 -> l(-211922488, var9 ^ 1338801240);
            case 189 -> l(-211922485, var9 ^ -1959526210);
            case 190 -> l(-211922486, var9 ^ -450846654);
            case 191 -> l(-211922483, var9 ^ 1054150465);
            case 192 -> 3;
            case 193 -> l(-211922484, var9 ^ -256357853);
            case 194 -> l(-211922481, var9 ^ 797370579);
            case 195 -> l(-211922482, var9 ^ -1690410730);
            case 196 -> l(-211922479, var9 ^ 1009615674);
            case 197 -> l(-211922480, var9 ^ -648566125);
            case 198 -> l(-211922477, var9 ^ 1544457234);
            case 199 -> l(-211922478, var9 ^ 1997329531);
            case 200 -> l(-211922475, var9 ^ -1481432392);
            case 201 -> l(-211922476, var9 ^ -1251134800);
            case 202 -> l(-211922473, var9 ^ -355016215);
            case 203 -> l(-211922474, var9 ^ 87107015);
            case 204 -> l(-211922471, var9 ^ 588380409);
            case 205 -> l(-211922472, var9 ^ 1783319227);
            case 206 -> l(-211922469, var9 ^ 195528567);
            case 207 -> l(-211922470, var9 ^ 1723064435);
            case 208 -> l(-211922467, var9 ^ -2128023279);
            case 209 -> l(-211922468, var9 ^ 1861526868);
            case 210 -> l(-211922465, var9 ^ 1543235770);
            case 211 -> l(-211922466, var9 ^ -58470824);
            case 212 -> l(-211922463, var9 ^ -462312405);
            case 213 -> l(-211922464, var9 ^ -1088184042);
            case 214 -> l(-211922461, var9 ^ 1441046502);
            case 215 -> l(-211922462, var9 ^ 1021886245);
            case 216 -> l(-211922459, var9 ^ 1348243172);
            case 217 -> l(-211922460, var9 ^ -955763668);
            case 218 -> l(-211922457, var9 ^ -586571887);
            case 219 -> l(-211922458, var9 ^ -1348221367);
            case 220 -> l(-211922455, var9 ^ -1003436003);
            case 221 -> l(-211922456, var9 ^ -1378880956);
            case 222 -> l(-211922453, var9 ^ -73767746);
            case 223 -> l(-211922454, var9 ^ 2103551396);
            case 224 -> l(-211922451, var9 ^ 1219979984);
            case 225 -> l(-211922452, var9 ^ 498798616);
            case 226 -> l(-211922449, var9 ^ -250413561);
            case 227 -> l(-211922450, var9 ^ -1068100759);
            case 228 -> l(-211922447, var9 ^ -1629416957);
            case 229 -> l(-211922448, var9 ^ -390636816);
            case 230 -> l(-211922445, var9 ^ 1434723967);
            case 231 -> l(-211922446, var9 ^ 1110933499);
            case 232 -> l(-211922443, var9 ^ -492376134);
            case 233 -> l(-211922444, var9 ^ 2077663249);
            case 234 -> l(-211922441, var9 ^ -1784329976);
            case 235 -> l(-211922442, var9 ^ -904104729);
            case 236 -> l(-211922439, var9 ^ -1177230272);
            case 237 -> l(-211922440, var9 ^ 1173838332);
            case 238 -> l(-211922437, var9 ^ 410313130);
            case 239 -> 4;
            case 240 -> l(-211922438, var9 ^ 1303627515);
            case 241 -> l(-211922435, var9 ^ 810333780);
            case 242 -> l(-211922436, var9 ^ 92327057);
            case 243 -> l(-211922433, var9 ^ -467205679);
            case 244 -> l(-211922434, var9 ^ 1600903362);
            case 245 -> 0;
            case 246 -> l(-211922943, var9 ^ -1968634580);
            case 247 -> l(-211922944, var9 ^ 374937547);
            case 248 -> l(-211922941, var9 ^ 1680081076);
            case 249 -> l(-211922942, var9 ^ -613189110);
            case 250 -> l(-211922939, var9 ^ 787808385);
            case 251 -> l(-211922940, var9 ^ 522251423);
            case 252 -> l(-211922937, var9 ^ 1119520791);
            case 253 -> l(-211922938, var9 ^ -270251915);
            case 254 -> l(-211922935, var9 ^ 1417744250);
            default -> l(-211922936, var9 ^ -673802671);
         };
         int var5 = (var1 & l(-211922933, var9 ^ 1052919301)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & l(-211922934, var9 ^ -771748537)) >>> l(-211922931, var9 ^ 48385068)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & l(-211922932, var9 ^ 850480827);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & l(-211922929, var9 ^ 444852783);
            }
         }

         lIlI[var2] = new String(var3).intern();
      }

      return lIlI[var2];
   }

   private int lIl(lIlllIl var1) {
      return Math.max(0, (int)Math.ceil(this.IllI(var1) / 50.0));
   }

   private static String llI(char[] var0, long var1, int var3) {
      int var4 = l(-211922930, 1127953802 ^ 839847138) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & l(-211922927, 1127953802 ^ 1856362382);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   private void lll() {
      this.IlI = false;
      this.Il = 0;
      this.ll = null;
   }

   private static void IIII() {
      int var0 = 68826851;
      I[0] = llI(lII(l(-211922913, var0 ^ -744477228), l(-211922914, var0 ^ 666583803)).toCharArray(), 2548L, l(-211922911, var0 ^ 1950306663));
      I[1] = llI("".toCharArray(), 48613L, l(-211922912, var0 ^ -406995416));
      I[2] = llI(lII(l(-211922909, var0 ^ 300438709), l(-211922910, var0 ^ -989662534)).toCharArray(), 93025L, l(-211922907, var0 ^ -1303569770));
      I[3] = llI(lII(l(-211922908, var0 ^ -1869252671), l(-211922905, var0 ^ 816931905)).toCharArray(), 2704L, l(-211922906, var0 ^ -290609517));
      I[4] = llI(lII(l(-211922903, var0 ^ -1858267269), l(-211922904, var0 ^ 462948361)).toCharArray(), 24901L, l(-211922901, var0 ^ -68432165));
      I[5] = llI(lII(l(-211922902, var0 ^ -1249579666), l(-211922899, var0 ^ -1382120851)).toCharArray(), 58432L, l(-211922900, var0 ^ 1250533478));
      I[l(-211922897, var0 ^ -1855289395)] = llI(
         lII(l(-211922898, var0 ^ -1481535289), l(-211922895, var0 ^ -1618826775)).toCharArray(), 94278L, l(-211922896, var0 ^ -1894262784)
      );
      I[l(-211922893, var0 ^ -685035103)] = llI(
         lII(l(-211922894, var0 ^ -1127454449), l(-211922891, var0 ^ -977623869)).toCharArray(), 51680L, l(-211922892, var0 ^ 77527074)
      );
      I[l(-211922889, var0 ^ 1087434070)] = llI(
         lII(l(-211922890, var0 ^ -1666993694), l(-211922887, var0 ^ -964508918)).toCharArray(), 98439L, l(-211922888, var0 ^ -1502283627)
      );
      I[l(-211922885, var0 ^ -649025943)] = llI(
         lII(l(-211922886, var0 ^ 769277826), l(-211922883, var0 ^ -161779877)).toCharArray(), 98089L, l(-211922884, var0 ^ 1378921586)
      );
      I[l(-211922881, var0 ^ 1368047558)] = llI(
         lII(l(-211922882, var0 ^ -1313769230), l(-211922879, var0 ^ 1794167327)).toCharArray(), 88297L, l(-211922880, var0 ^ 828423679)
      );
      I[l(-211922877, var0 ^ 2138409034)] = llI(
         lII(l(-211922878, var0 ^ -601898973), l(-211922875, var0 ^ -629777421)).toCharArray(), 17655L, l(-211922876, var0 ^ 1217677535)
      );
      I[l(-211922873, var0 ^ -587121982)] = llI(
         lII(l(-211922874, var0 ^ 1683669935), l(-211922871, var0 ^ -1385856041)).toCharArray(), 60529L, l(-211922872, var0 ^ 697817004)
      );
      I[l(-211922869, var0 ^ 1556759081)] = llI(
         lII(l(-211922870, var0 ^ 87565709), l(-211922867, var0 ^ -1123318741)).toCharArray(), 29202L, l(-211922868, var0 ^ -807992561)
      );
      I[l(-211922865, var0 ^ 1531657767)] = llI(
         lII(l(-211922866, var0 ^ 1781992074), l(-211922863, var0 ^ 1113814686)).toCharArray(), 49934L, l(-211922864, var0 ^ 409915307)
      );
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = 976924313;
      short var18 = 29049;
      String[] var15 = new String[2];
      int var10001 = "Û쭍た㛤贈\ufdd4蛣殎Ⴭ\uf28c잨殜쵾\udb86袼\ufae4䰬鈚ॹⶤ\udc1b쏓㈿ሕ䢜節쵽\udb42ᓳ徢៥姥⟫㰭䪮\ueca1ሗ映ꚙﱔ瞴僳鏧뇌༇貒䱷ਛ뼗\ue379喸ᯪ䗝䄬\ueb04\uda45뱴帥篦\ueeba\ueba0䓹子匰鎩읋ި\ue8e7с褊덐ᵔ谝傴⺇䗯᳔㣵梐黎ꔝ䦷㎌䃈៸嗲⪺陂\ue67e誚蝊灞䊻轖ᦩ䵆탬迯ⷲ댞쁖势载珬흫ѡဥ쾗폏\ue0b8檟Ⅾݽ菡쓝\ufffb⛄᧧Ἢ\u2d2fԥ쑯ㆶ妒怖ꛃ\ud9f0褁\ue2b4쒰ꌺ巖\uee7e쒩\uee7e凃穇\u07bf\ue0e5䴕\ue739\u192f⧐賟䎹ꎿ逅㒞饟䶥耶ﱮꭤ܊\ueca2羌\uef1dբለ盱\udf2b婇켃숎湾웕㽪캊㗶罺癏\udb9b୭\ue70f祎ઌ위闫啚峻屙쾵\ue34aꎕ湀钽楛⼭섻◮ѕ孌꾵࡞ꪽ䆒\uf6b2뫷懣涸ۑ玬൪鰚獬퀚ꟃ\uf858苴鱩頶直쒰ꓛႋ冉ぐﾑ\uf67a➀\rῂ쏎ꀉ靇\ude4dﴅவઘ韏ﬥ곭\udc30읹"
         .length();
      int var17 = 0;
      int var14 = var10001;
      int var16 = 0;
      String var13 = "Û쭍た㛤贈\ufdd4蛣殎Ⴭ\uf28c잨殜쵾\udb86袼\ufae4䰬鈚ॹⶤ\udc1b쏓㈿ሕ䢜節쵽\udb42ᓳ徢៥姥⟫㰭䪮\ueca1ሗ映ꚙﱔ瞴僳鏧뇌༇貒䱷ਛ뼗\ue379喸ᯪ䗝䄬\ueb04\uda45뱴帥篦\ueeba\ueba0䓹子匰鎩읋ި\ue8e7с褊덐ᵔ谝傴⺇䗯᳔㣵梐黎ꔝ䦷㎌䃈៸嗲⪺陂\ue67e誚蝊灞䊻轖ᦩ䵆탬迯ⷲ댞쁖势载珬흫ѡဥ쾗폏\ue0b8檟Ⅾݽ菡쓝\ufffb⛄᧧Ἢ\u2d2fԥ쑯ㆶ妒怖ꛃ\ud9f0褁\ue2b4쒰ꌺ巖\uee7e쒩\uee7e凃穇\u07bf\ue0e5䴕\ue739\u192f⧐賟䎹ꎿ逅㒞饟䶥耶ﱮꭤ܊\ueca2羌\uef1dբለ盱\udf2b婇켃숎湾웕㽪캊㗶罺癏\udb9b୭\ue70f祎ઌ위闫啚峻屙쾵\ue34aꎕ湀钽楛⼭섻◮ѕ孌꾵࡞ꪽ䆒\uf6b2뫷懣涸ۑ玬൪鰚獬퀚ꟃ\uf858苴鱩頶直쒰ꓛႋ冉ぐﾑ\uf67a➀\rῂ쏎ꀉ靇\ude4dﴅவઘ韏ﬥ곭\udc30읹";

      do {
         char var19 = var13.charAt(var17);
         var10001 = var17 + 1;
         int var10002 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10002 + var19).toCharArray();

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 7) {
               default -> 58;
               case 1 -> 215;
               case 2 -> 19;
               case 3 -> 6;
               case 4 -> 10;
               case 5 -> 147;
               case 6 -> 71;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 5 | var22 << 11) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 5 | var22 >>> 11) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      llII = var15;
      llIl = new Object[var15.length];
      int var9 = 405521728;
      byte[] var7 = "\u0016Ì\u0004r+wñ\"\u0097Åä\u008b\u000b!>ëÚ@#z\u0007±\u0005\r¾Í µÁÀçÀ Ê9ß\u0085\tDÄÿe\u0085µá\u001f¶BÞþ\u0096BUVnÄ\u0003Ðæ|W«¹ÒÄC\u0097Þ:!i\u008e\u0000\u0018`Xò>jÿãß½H\u0095w È Æ}W]Ö\u0019®&\u009b\u00ad¯\u000b\r=\u0099\u0097\u0087¨rüfµ\u0093\u008d÷Ñf\u0081KBh<\u007f{`¢<\u0080zw&\u0014\u0011-2_ïV\u007f\u0010íÀ\u008d¶ñ\u008d\u0090i4\u0099l¹ò\u001bß\u0088ç\u0086 ¹]rv/þ«í/f\u0096\u0080ÿDB\u0002F\u0097\u000fÃÕ\u00170Q°ETï¾\u00998\u0004\tiX\u0014p9f|<\u0095bP\u0094±J\u0011¯ó\u009fSg\u0086¨]\u0004\u000eg¦o\"\u009bmx\u0003958Ð§!3>¡#]\u0003º¼bæ£\u0005jYì'¡#o}ð+fU\u008d\n5Ç¹B\u009fßÅ¯_¹+Ãº´¶¼Ý(Î\u0000\u0005\"ý\u009b ¹+E\u0019á}¾ ]ÜnÝb\u0096Nß\u00076\u0092xÍG*ìÄz\u0017\u0085\u0082 ð«Æ×»Ê¢Ø÷$\u0092°\u0004\u0086\u0099\u008fÖøb\"|.\u0096\u00062\ti=£W\u008b\u0013¾ÁXàÚÊ\u008cq\\t\u009bô®)\u0012ée«r<\u009fg¢s±ß\u0013\u008e;K /j© \u0086*©»¼ù!\u0017í{\u009e\u0087\\k\u009bS¨\u0084Ø©\u0005\u001f\u008d\u0094=\u001dh\u0011XÔSC\bu¬z|\u001fè\b\u0098Ú-\u0004\u0082\u0097ÿ\u001fÂ¨\u0012õ41\t¨\u00165+\u001a\u0003´*Qmnæ½#\u009c\u008a\u0005I8\u0019\u000fx\u0085Çæ{X-~8µ\u008f\u001bx@\u0010,¸¸î½kªþKD´²'¡µÑ·\u0004è#$\u001fÎçÓãÕ¨9*\u0083Í^¦\u001b\u007f\f]\u0001kÜ.\u000e@}¡põÿä\u0082h\f÷uñç\u0011\u0082Æ\u0014\u000e¥Rá\u0018È\u0094Ô+Ó\u008d\u0086c0\u0007\r\nêG[& \u0091ä\u0010P=\"ïÚ\u008e£\u0080óô\u007feä\u008c¥\u0094uénÒ`ãb-ÚÞ¡ÇT\u0082ùÏ´#Ô¯a\u00adàG@©c3{\u008f\u001c\u0084§\u008cÁ%r\u0001¬0\u0087\u0090Ñ.Ù\np\u0002î\u001cÝ\u0086\u0006â4°É\u00974üyý\rG\fÅ\u009eÙA×»ã85±ö²\u001fù7¤\u0017\u0004\u0003z\n÷\u007fÎ\u0098Þt\u0099\u0019\u0088\u0083\u00877\u00adô²\u0016KF\u0001W#B¶¹ßaá\u0080UF7£\u0015jey7¨ Ü§E \u001eE\u0080=YËá\u0002º±\u008be7÷¤UÛ\u008få!\u0096Å\u0018\u008dÁ¦éë\u0002=ÊË[\u001b¿6ä\u0002@\u008b!9®W¥¡3Ä\u0097\u0014À£Ä:¾\u0093Y}\u00adE;Ù±\u001c\u0014\u0091\u001f\u0005@ñÃ\u001e\\\",ÕLw\r\u0002\n5û¯ósç\u008b|fn\n7ÜÚ®õÚç\u009dMd¬P'ÓH\u0092ã+:\u0082\u008d?\u0094\u0092VÊ;\u009a\u0098§~³G\u0099Ó¨ó!UÅT2¹6±H\u0090¦4\u0011¸Ù\u001f\u0013ïÜÏ¬\u0019\u001fÝr\t\u0014\u0082ÉÛøm.\u001fºK\u000eÂ\u008c\u0002Tp\u009cc¸³¸\u000e¬ÚPé7Å\u0087\u0006ë\u0091\u00983äÒ©\u0094\u009cô\f\u008cn\u0096\u0019×<\u009a\u008b=û¥\u009dT÷\u0085U8C´3¯\u0017\u000e\u0000µ\u0016¤ÔÇ¼ý¥¬/òÉÅÐÉÈ\u0093\u0085_:\u0015~\u009f¦ ¨P£u¤+C\u0099\rÄÐ¨I(åöþ)\u008e\u0080¨nQ=\u009b\u001c¬*(D}\u008a¹ÕÃ\u0013É\u0094Ïýº}Ô¢\u0003O\u00adÑËÐ®-èm_pkÛÚ%¬ò\u0018XS\u0082îm\u009fö\u008e\u008c8;\u00837tìWâ¶?\u0090~F\"\u0082\f;:\f³lOUFê:+w?Ù\u009b*¥½]\u0087ûs¢<\u009e5\f¿É\u00ad\u008fVÝ}\u0086º\u001f_Åjýw\u001eZ®u?r\u009cÑ¨eÿ\u0094K9\u0014±\u0095Õ¿[§¨Ûôß\u0083\u0091V\u0091±j\u0012ÎFÝÌB\u0088Ý\u0087¬Êº,l¡AÜ»Ç'\u001b\u0003\u0006¥\u0091#¶åFô\u0085úõ]\u0099ºMBÃ1\rK7*¢\u0004jÏ¥êÞK\u0018f\u0001yt,Õ\u0093\u0015l\u0090&sp\u0080\u0004W\\ßÞîY@ú\u001a5\u0081¬7Ð\u000b\tÆÅ¤D\u0086Ý¥\u0015ÍÃBñ:\u001cúuqÌ\u0081úâ\u0088· °T\u008f\u0012Ø\u0085Æ[\u0097ÇÇ»Tù¬]I\u0081Õ+\u0095Lez\u001b\u009aP@\u0088µ\u008c2\u0091lÖ\u0013&ýH½ÏëÉÀÃ\u0087=K\u001f9æÊð5böB\u0001A\u001aÚ\u008f¡ Xwza\u0012W¸+\u0013Àoåí~Ì\u008eàâÊæ\u000e¼\u001ej\u0003ñÍ\u0091_õtËãoB\n7\n!\u008a\u0080\u0011LZ'\u0013\u0015©\u0005yRd2ªöÙ\u008f\u0080KÛ[\u001az¦*{RòêÅÉ\u0006ö\u0005\u0006ØÕ\u0081o\u0080ÚJ »oÔ\u009c\u001dÉ\u009aK\u0081Ü\u000f"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lIll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lIll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[l(-211922928, var23 ^ -82860353)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lllI(447339373, var23 ^ 1177521612)).length();
      char var1 = 4;
      int var25 = -1;

      label100:
      while (true) {
         int var28 = l(-211922925, var23 ^ -2039805574);
         String var31 = var2.substring(++var25, var25 + var1);
         byte var38 = -1;

         while (true) {
            label95: {
               char[] var47 = var31.toCharArray();
               int var10004 = var47.length;
               int var6 = 0;
               int var50 = var28;
               var43 = var47;
               var10001 = var10004;
               char[] var59;
               int var10006;
               if (var10004 <= 1) {
                  var59 = var47;
                  var10004 = var28;
                  var10006 = var6;
               } else {
                  var50 = var28;
                  var10001 = var10004;
                  if (var10004 <= var6) {
                     break label95;
                  }

                  var59 = var47;
                  var10004 = var28;
                  var10006 = var6;
               }

               while (true) {
                  var59[var10006] = (char)(var59[var10006] ^ var10004 ^ switch (var6 % l(-211922924, var23 ^ 1751986503)) {
                     case 0 -> l(-211922921, var23 ^ -1502774438);
                     case 1 -> l(-211922922, var23 ^ -469053129);
                     case 2 -> l(-211922919, var23 ^ -1880022609);
                     case 3 -> l(-211922920, var23 ^ -375921114);
                     case 4 -> l(-211922917, var23 ^ 672492601);
                     case 5 -> l(-211922918, var23 ^ -1739212272);
                     default -> l(-211922915, var23 ^ -1421211579);
                  });
                  var6++;
                  if (var50 == 0) {
                     var10006 = var50;
                     var59 = var43;
                     var10004 = var50;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var59 = var43;
                     var10004 = var50;
                     var10006 = var6;
                  }
               }
            }

            String var52 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var5[var3++] = var52;
                  if ((var25 += var1) >= var4) {
                     lI = var5;
                     lIlI = new String[l(-211922923, var23 ^ -1613041709)];
                     I = new String[l(-211922916, var23 ^ -1224036265)];
                     IIII();
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var52;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label100;
                  }

                  var4 = (var2 = lllI(447339372, var23 ^ -1891632049)).length();
                  var1 = 4;
                  var25 = -1;
            }

            var28 = l(-211922926, var23 ^ -1390302256);
            var31 = var2.substring(++var25, var25 + var1);
            var38 = 0;
         }
      }
   }

   private int IIIl() {
      double var1 = Math.min(this.IllI.IIlI(), this.IllI.IlI());
      double var3 = Math.max(this.IllI.IIlI(), this.IllI.IlI());
      int var5 = (int)Math.round(var1);
      int var6 = (int)Math.round(var3);
      return var5 >= var6 ? Math.max(0, var5) : ThreadLocalRandom.current().nextInt(var5, var6 + 1);
   }

   private void IIlI() {
      this.IIII++;
      this.Ill = false;
      this.IIl = null;
      this.IlIl = -1;
      this.lIII = -1;
      this.lIl = 0L;
      this.IIlI = null;
      this.IIll = false;
      this.II = l(-211922861, -347933665 ^ 2031120962);
      this.Illl = null;
   }

   private double IIll(class_746 var1) {
      double var3 = 100.0;
      boolean var5 = false;
      String[] var10000 = IIllllIl.IIIIl();
      class_1304[] var6 = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
      int var7 = var6.length;
      String[] var2 = var10000;
      int var8 = 0;

      while (var8 < var7) {
         class_1304 var9 = var6[var8];
         class_1799 var10 = var1.method_6118(var9);
         if (var10 != null && !var10.method_7960() && IlIIIlIII.III(var10.method_7963(), this.III(var10))) {
            var5 = true;
            var3 = Math.min(var3, IlIIIlIII.IIllI(var10.method_7936(), var10.method_7919()));
         }

         var8++;
         if (var2 != null) {
            break;
         }
      }

      return var5 ? var3 : 100.0;
   }

   private void IlII(class_310 var1, boolean var2) {
      if (this.IIIIlIl() && var1 != null && var1.field_1724 != null && this.I(var1.field_1724)) {
         IIlIIllI var3 = (IIlIIllI)var1;
         int var4 = this.IIIl();
         if (var2 || var3.ilovcats$getUseCd() > var4) {
            var3.ilovcats$setUseCd(var4);
         }
      }
   }

   private static String IlIl(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   @Override
   public void llIl() {
      this.III = 0L;
      this.lll();
      this.llII(class_310.method_1551());
      this.IIlI();
   }

   private long IllI(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();
      return var2 == var4 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private int Illl(class_746 var1) {
      if (var1 == null) {
         return -1;
      } else {
         for (int var2 = 0; var2 < l(-211922862, -1503552414 ^ -580184756); var2++) {
            if (this.ll(var1.method_31548().method_5438(var2))) {
               return var2;
            }
         }

         return -1;
      }
   }

   private void lIII(long var1, boolean var3) {
      String[] var4 = IIllllIl.IIIIl();
      if (var1 == this.IIII && this.IIll) {
         Runnable var5 = this.Illl;
         this.IIll = false;
         this.II = l(-211922859, -1671594860 ^ 678183066);
         this.Illl = null;
         if (var3 && var5 != null) {
            var5.run();
            if (var4 == null) {
               return;
            }
         }

         this.lIl = 0L;
      }
   }

   private boolean lIIl(long var1, class_310 var3) {
      if (this.IIll && var1 == this.IIII && this.IIl(var3)) {
         class_1269 var4 = var3.field_1761.method_2919(var3.field_1724, class_1268.field_5808);
         boolean var5 = var4 != null && var4.method_23665();
         this.lIII(var1, var5);
         return var5;
      } else {
         return false;
      }
   }

   private boolean lIlI(class_310 var1) {
      return this.IIIIlIl()
         && var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var1.field_1755 == null
         && var1.field_1724.method_5805();
   }

   private boolean lIll(class_310 var1) {
      if (this.lIlI(var1) && this.IIl(var1) && k74.x.IIll.IllIl(var1) <= 0) {
         float var2 = var1.field_1724.method_36454();
         long var3 = ++this.IIII;
         return IlllIlII.llIlI(var1, l(-211922860, -1714932773 ^ 291481121), var2, 90.0F, this::lIIl);
      } else {
         return false;
      }
   }

   private void llII(class_310 var1) {
      if (var1 != null && var1.field_1724 != null && var1.field_1724 == this.IIl && this.IlIl >= 0 && this.IlIl < l(-211922857, 732331534 ^ 1957556576)) {
         if (this.IlIl != k74.x.IIll.IIlII(var1.field_1724.method_31548())) {
            k74.x.IIll.llIllI(var1, this, this.IlIl);
         }
      }
   }
}
