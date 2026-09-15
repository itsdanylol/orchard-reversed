package k74.x;

import java.awt.Color;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class IlIllIlII extends IlIIIIIIl implements IIIIIlII {
   private static final double II = 14.0;
   private static final double Il = 240.0;
   private final IIlIII lI;
   private final IIlIII ll;
   private static final IlIIlIIl III;
   private static final int[] IlII;
   private static final double IIl = 5.0;
   private static final IIIllIIl IlI;
   private static final Object[] IllI;
   private final IIIllIIII Ill;
   private static final double lII = 158.0;
   private static final double lIl = 14.0;
   private static final double llI = 68.0;
   private static final String[] lll;
   private final IIlIII IIII;
   private static final String[] IlIl;
   private static final double IIIl = 76.0;
   private static final String[] IIlI;
   private static String[] I;
   private static final double IIll = 40.0;

   static String I(long var0) {
      long var2 = Math.max(0L, var0) / 1000L;
      return String.format(Locale.ROOT, IlIIllIII.lI(I[2]), var2 / 60L, var2 % 60L);
   }

   private void l(class_332 var1, class_310 var2, IlIIlIIl var3, long var4, boolean var6, boolean var7) {
      class_327 var8 = var2.field_1772;
      Color var9 = IIIlIllII.l();
      Color var10 = IIIlIllII.IIlI();
      int var11 = IIIlIllII.lII(lIl(1740270082, -979403798 ^ 1366660415));
      IIIlIllII.llI(var1, IlI, 0.0, 0.0, 240.0, 76.0, var7);
      if (!var6) {
         IlIIlllIl.llIl(var1, 13.0, 9.0, 42.0, 42.0, 6.0, IIIlllII.l(0, lIl(1740270083, -979403798 ^ -695174062)));
      }

      this.Ill(var1, var3.llI(), var6);
      IlIIlllIl.IIll(var1, var8, IlIIlllIl.llIIl(var8, lII(var3.IIIl(), IlIIllIII.lI(I[0])), 158.0), 68.0, 18.0, var11);
      IlIIlllIl.IIll(var1, var8, IlIIlllIl.llIIl(var8, lII(var3.II(), IlIIllIII.lI(I[1])), 158.0), 68.0, 31.0, var11);
      long var12 = var6 ? III.IIlI() : var3.Il(var4);
      IlIIlllIl.IIll(var1, var8, I(var12), 14.0, 52.0, var11);
      IlIIlllIl.IlI(var1, var8, I(var3.III()), 226.0, 52.0, var11);
      double var14 = 212.0;
      double var16 = var6 ? III.I(III.lI()) : var3.I(var4);
      IlIIlllIl.llIl(var1, 14.0, 65.0, var14, 4.0, 2.0, IIIlllII.l(0, lIl(1740270080, -979403798 ^ -2069719011)));
      if (var16 > 0.0) {
         IlIIlllIl.lllIII(var1, 14.0, 65.0, var14 * var16, 4.0, 2.0, var10.getRGB(), var9.getRGB());
      }
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      this.II(var1, false, false);
   }

   private void II(class_332 var1, boolean var2, boolean var3) {
      class_310 var4 = class_310.method_1551();
      if (var1 != null && var4 != null && var4.field_1772 != null) {
         IlIIlIIl var5 = var2 ? III : this.Ill.Ill();
         if (var5.Ill()) {
            long var6 = var2 ? III.lI() : System.currentTimeMillis();
            double var8 = this.III();
            IlIIlllIl.IIllll(var1);
            IlIIlllIl.IlIIlI(var1, this.lll(), this.ll());
            IlIIlllIl.llIIIl(var1, var8, var8);

            try {
               this.l(var1, var4, var5, var6, var2, var3);
            } finally {
               IlIIlllIl.lIIIll(var1);
            }
         }
      }
   }

   @Override
   public void lllI(double var1, double var3) {
      class_310 var5 = class_310.method_1551();
      double var6 = Double.MAX_VALUE;
      double var8 = Double.MAX_VALUE;
      if (var5 != null && var5.method_22683() != null) {
         var6 = Math.max(0.0, var5.method_22683().method_4486() - this.IIllI());
         var8 = Math.max(0.0, var5.method_22683().method_4502() - this.IIIl());
      }

      this.IIII.Ill(Math.max(0.0, Math.min(var1, var6)));
      this.ll.Ill(Math.max(0.0, Math.min(var3, var8)));
   }

   private static String llI(short var0, char var1, int var2, int var3, int var4) {
      int var9 = var3 ^ 667023449;
      char[] var8 = IlIl[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])IllI[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         IllI[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 49539;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ 28349 ^ var3 ^ var2 ^ var4 ^ var6 ^ var0 ^ var1);
      } while (++var7 < var8.length);

      return new String(var8).intern();
   }

   @Override
   public boolean llII(double var1, double var3) {
      return var1 >= this.lll() && var1 <= this.lll() + this.IIllI() && var3 >= this.ll() && var3 <= this.ll() + this.IIIl();
   }

   private static String Il(int var0, int var1) {
      int var9 = -1722684594;
      int var2 = (var0 ^ lIl(1740270097, var9 ^ -1620776524)) & lIl(1740270102, var9 ^ -1303188290);
      if (lll[var2] == null) {
         char[] var3 = IIlI[var2].toCharArray();

         int var4 = switch (var3[0] & lIl(1740270103, var9 ^ 978378420)) {
            case 0 -> lIl(1740270100, var9 ^ 1732151437);
            case 1 -> 2;
            case 2 -> lIl(1740270101, var9 ^ 656234810);
            case 3 -> lIl(1740270106, var9 ^ -45779476);
            case 4 -> lIl(1740270107, var9 ^ 1338505165);
            case 5 -> lIl(1740270104, var9 ^ -946012248);
            case 6 -> lIl(1740270105, var9 ^ 664484346);
            case 7 -> lIl(1740270110, var9 ^ 1804646525);
            case 8 -> lIl(1740270111, var9 ^ -1227987214);
            case 9 -> lIl(1740270108, var9 ^ 1206584709);
            case 10 -> lIl(1740270109, var9 ^ 1437923403);
            case 11 -> lIl(1740270114, var9 ^ 716694486);
            case 12 -> 0;
            case 13 -> lIl(1740270115, var9 ^ 975163056);
            case 14 -> lIl(1740270112, var9 ^ -821392298);
            case 15 -> lIl(1740270113, var9 ^ 216725264);
            case 16 -> lIl(1740270118, var9 ^ -1197880583);
            case 17 -> lIl(1740270119, var9 ^ 1147082040);
            case 18 -> lIl(1740270116, var9 ^ -143835925);
            case 19 -> lIl(1740270117, var9 ^ -1370112726);
            case 20 -> lIl(1740270122, var9 ^ 1214151187);
            case 21 -> lIl(1740270123, var9 ^ -953912738);
            case 22 -> lIl(1740270120, var9 ^ 729091339);
            case 23 -> lIl(1740270121, var9 ^ -167807929);
            case 24 -> lIl(1740270126, var9 ^ -2074670050);
            case 25 -> lIl(1740270127, var9 ^ -1939115813);
            case 26 -> lIl(1740270124, var9 ^ -819014236);
            case 27 -> lIl(1740270125, var9 ^ -672895555);
            case 28 -> lIl(1740270130, var9 ^ 1608295235);
            case 29 -> lIl(1740270131, var9 ^ -1859102425);
            case 30 -> lIl(1740270128, var9 ^ 1126590304);
            case 31 -> lIl(1740270129, var9 ^ -877876685);
            case 32 -> lIl(1740270134, var9 ^ 1567889469);
            case 33 -> lIl(1740270135, var9 ^ -923045941);
            case 34 -> lIl(1740270132, var9 ^ 732139847);
            case 35 -> lIl(1740270133, var9 ^ 1786586625);
            case 36 -> lIl(1740270138, var9 ^ -1854722039);
            case 37 -> lIl(1740270139, var9 ^ -442703988);
            case 38 -> lIl(1740270136, var9 ^ -556631287);
            case 39 -> lIl(1740270137, var9 ^ -1257918335);
            case 40 -> lIl(1740270142, var9 ^ -1303240706);
            case 41 -> lIl(1740270143, var9 ^ 479536101);
            case 42 -> lIl(1740270140, var9 ^ 352231099);
            case 43 -> lIl(1740270141, var9 ^ 1980099034);
            case 44 -> lIl(1740270146, var9 ^ -481674832);
            case 45 -> lIl(1740270147, var9 ^ -465879967);
            case 46 -> lIl(1740270144, var9 ^ -1260924696);
            case 47 -> lIl(1740270145, var9 ^ 23515362);
            case 48 -> lIl(1740270150, var9 ^ -1860570175);
            case 49 -> lIl(1740270151, var9 ^ 1329068675);
            case 50 -> lIl(1740270148, var9 ^ -1121427060);
            case 51 -> lIl(1740270149, var9 ^ 1032982158);
            case 52 -> lIl(1740270154, var9 ^ -130551715);
            case 53 -> lIl(1740270155, var9 ^ 1092653022);
            case 54 -> lIl(1740270152, var9 ^ 694411846);
            case 55 -> lIl(1740270153, var9 ^ -1244091370);
            case 56 -> lIl(1740270158, var9 ^ -1297083360);
            case 57 -> lIl(1740270159, var9 ^ -1208178630);
            case 58 -> lIl(1740270156, var9 ^ -227676681);
            case 59 -> lIl(1740270157, var9 ^ 590817114);
            case 60 -> lIl(1740270162, var9 ^ 1138696291);
            case 61 -> lIl(1740270163, var9 ^ 1095382087);
            case 62 -> lIl(1740270160, var9 ^ -11944742);
            case 63 -> lIl(1740270161, var9 ^ 379521435);
            case 64 -> lIl(1740270166, var9 ^ 1568935369);
            case 65 -> lIl(1740270167, var9 ^ 316653652);
            case 66 -> lIl(1740270164, var9 ^ -1338340422);
            case 67 -> lIl(1740270165, var9 ^ 711696836);
            case 68 -> lIl(1740270170, var9 ^ 952597185);
            case 69 -> lIl(1740270171, var9 ^ -1636803560);
            case 70 -> lIl(1740270168, var9 ^ -165744105);
            case 71 -> lIl(1740270169, var9 ^ -1427104359);
            case 72 -> lIl(1740270174, var9 ^ -422227077);
            case 73 -> lIl(1740270175, var9 ^ -487522541);
            case 74 -> lIl(1740270172, var9 ^ 1013369981);
            case 75 -> lIl(1740270173, var9 ^ 1222964359);
            case 76 -> 4;
            case 77 -> lIl(1740270178, var9 ^ 1147360321);
            case 78 -> lIl(1740270179, var9 ^ 1418802891);
            case 79 -> lIl(1740270176, var9 ^ -1100748913);
            case 80 -> lIl(1740270177, var9 ^ 704190456);
            case 81 -> lIl(1740270182, var9 ^ -368888110);
            case 82 -> lIl(1740270183, var9 ^ 1476512195);
            case 83 -> lIl(1740270180, var9 ^ -1213451228);
            case 84 -> lIl(1740270181, var9 ^ -1885443153);
            case 85 -> lIl(1740270186, var9 ^ 267250257);
            case 86 -> lIl(1740270187, var9 ^ -1852038259);
            case 87 -> lIl(1740270184, var9 ^ 169967741);
            case 88 -> lIl(1740270185, var9 ^ -1154530188);
            case 89 -> lIl(1740270190, var9 ^ 165286651);
            case 90 -> lIl(1740270191, var9 ^ -466715192);
            case 91 -> lIl(1740270188, var9 ^ 1172408566);
            case 92 -> lIl(1740270189, var9 ^ 1101801730);
            case 93 -> lIl(1740270194, var9 ^ 1448513679);
            case 94 -> lIl(1740270195, var9 ^ 204716179);
            case 95 -> lIl(1740270192, var9 ^ 1998273480);
            case 96 -> lIl(1740270193, var9 ^ -1433278619);
            case 97 -> lIl(1740270198, var9 ^ 971006448);
            case 98 -> lIl(1740270199, var9 ^ -87618193);
            case 99 -> lIl(1740270196, var9 ^ 1249792962);
            case 100 -> lIl(1740270197, var9 ^ -1818786341);
            case 101 -> 3;
            case 102 -> lIl(1740270202, var9 ^ -1312926475);
            case 103 -> lIl(1740270203, var9 ^ 1804418886);
            case 104 -> lIl(1740270200, var9 ^ 1151597263);
            case 105 -> lIl(1740270201, var9 ^ 122451119);
            case 106 -> lIl(1740270206, var9 ^ 852222187);
            case 107 -> lIl(1740270207, var9 ^ -533606096);
            case 108 -> lIl(1740270204, var9 ^ -1970071381);
            case 109 -> lIl(1740270205, var9 ^ -17478836);
            case 110 -> lIl(1740270210, var9 ^ -913286121);
            case 111 -> lIl(1740270211, var9 ^ -370694784);
            case 112 -> lIl(1740270208, var9 ^ -704769854);
            case 113 -> lIl(1740270209, var9 ^ -687490474);
            case 114 -> lIl(1740270214, var9 ^ 1046746734);
            case 115 -> lIl(1740270215, var9 ^ -494145337);
            case 116 -> lIl(1740270212, var9 ^ 304594822);
            case 117 -> lIl(1740270213, var9 ^ -2131528225);
            case 118 -> lIl(1740270218, var9 ^ -965310518);
            case 119 -> lIl(1740270219, var9 ^ 308445676);
            case 120 -> lIl(1740270216, var9 ^ -1652413664);
            case 121 -> lIl(1740270217, var9 ^ -941945132);
            case 122 -> lIl(1740270222, var9 ^ 742195479);
            case 123 -> lIl(1740270223, var9 ^ -941628424);
            case 124 -> lIl(1740270220, var9 ^ 1082543818);
            case 125 -> lIl(1740270221, var9 ^ -236622485);
            case 126 -> lIl(1740270226, var9 ^ 309663631);
            case 127 -> lIl(1740270227, var9 ^ 904854277);
            case 128 -> lIl(1740270224, var9 ^ 1181004840);
            case 129 -> lIl(1740270225, var9 ^ -1805828457);
            case 130 -> lIl(1740270230, var9 ^ -1873838236);
            case 131 -> lIl(1740270231, var9 ^ 225871794);
            case 132 -> lIl(1740270228, var9 ^ -1962321191);
            case 133 -> 1;
            case 134 -> lIl(1740270229, var9 ^ 870803017);
            case 135 -> lIl(1740270234, var9 ^ 501486839);
            case 136 -> lIl(1740270235, var9 ^ 1377322118);
            case 137 -> lIl(1740270232, var9 ^ -996805027);
            case 138 -> lIl(1740270233, var9 ^ -1546147304);
            case 139 -> lIl(1740270238, var9 ^ -295171208);
            case 140 -> lIl(1740270239, var9 ^ -1929772647);
            case 141 -> lIl(1740270236, var9 ^ -1468433134);
            case 142 -> lIl(1740270237, var9 ^ 1805314864);
            case 143 -> lIl(1740270242, var9 ^ 667821913);
            case 144 -> lIl(1740270243, var9 ^ 2094749335);
            case 145 -> lIl(1740270240, var9 ^ 681168646);
            case 146 -> lIl(1740270241, var9 ^ 1224222782);
            case 147 -> lIl(1740270246, var9 ^ 196521970);
            case 148 -> lIl(1740270247, var9 ^ 1460052908);
            case 149 -> lIl(1740270244, var9 ^ 1179051986);
            case 150 -> lIl(1740270245, var9 ^ -937025609);
            case 151 -> lIl(1740270250, var9 ^ -1635347136);
            case 152 -> lIl(1740270251, var9 ^ -2115725758);
            case 153 -> lIl(1740270248, var9 ^ -1046311429);
            case 154 -> lIl(1740270249, var9 ^ 2025480773);
            case 155 -> lIl(1740270254, var9 ^ -806401030);
            case 156 -> lIl(1740270255, var9 ^ -848134378);
            case 157 -> lIl(1740270252, var9 ^ -1033371654);
            case 158 -> lIl(1740270253, var9 ^ 1474873938);
            case 159 -> lIl(1740270258, var9 ^ -783045570);
            case 160 -> lIl(1740270259, var9 ^ 460788607);
            case 161 -> lIl(1740270256, var9 ^ 28050014);
            case 162 -> lIl(1740270257, var9 ^ -1625022789);
            case 163 -> lIl(1740270262, var9 ^ -2109616643);
            case 164 -> lIl(1740270263, var9 ^ 2077821221);
            case 165 -> lIl(1740270260, var9 ^ -1710649061);
            case 166 -> lIl(1740270261, var9 ^ -1165484226);
            case 167 -> lIl(1740270266, var9 ^ 707346150);
            case 168 -> lIl(1740270267, var9 ^ 1818883763);
            case 169 -> lIl(1740270264, var9 ^ 1180018094);
            case 170 -> lIl(1740270265, var9 ^ -1596332678);
            case 171 -> lIl(1740270270, var9 ^ -2117884890);
            case 172 -> lIl(1740270271, var9 ^ 1534930331);
            case 173 -> lIl(1740270268, var9 ^ 943349444);
            case 174 -> lIl(1740270269, var9 ^ -797834820);
            case 175 -> lIl(1740270274, var9 ^ -1775446973);
            case 176 -> lIl(1740270275, var9 ^ -1046280580);
            case 177 -> lIl(1740270272, var9 ^ 1119858596);
            case 178 -> lIl(1740270273, var9 ^ -781401670);
            case 179 -> lIl(1740270278, var9 ^ -981353605);
            case 180 -> lIl(1740270279, var9 ^ -1505855235);
            case 181 -> lIl(1740270276, var9 ^ -1702160221);
            case 182 -> lIl(1740270277, var9 ^ -1061303616);
            case 183 -> lIl(1740270282, var9 ^ 1744408491);
            case 184 -> lIl(1740270283, var9 ^ -1795784028);
            case 185 -> lIl(1740270280, var9 ^ -1072597393);
            case 186 -> lIl(1740270281, var9 ^ -1335706204);
            case 187 -> lIl(1740270286, var9 ^ 249447125);
            case 188 -> lIl(1740270287, var9 ^ 2141061849);
            case 189 -> lIl(1740270284, var9 ^ 1854675267);
            case 190 -> lIl(1740270285, var9 ^ -477441264);
            case 191 -> lIl(1740270290, var9 ^ 1329915920);
            case 192 -> 5;
            case 193 -> lIl(1740270291, var9 ^ 478280299);
            case 194 -> lIl(1740270288, var9 ^ 75529824);
            case 195 -> lIl(1740270289, var9 ^ 645836290);
            case 196 -> lIl(1740270294, var9 ^ -1611893732);
            case 197 -> lIl(1740270295, var9 ^ 594618063);
            case 198 -> lIl(1740270292, var9 ^ -601147130);
            case 199 -> lIl(1740270293, var9 ^ 453168758);
            case 200 -> lIl(1740270298, var9 ^ -1348579788);
            case 201 -> lIl(1740270299, var9 ^ 1795137698);
            case 202 -> lIl(1740270296, var9 ^ 1762772150);
            case 203 -> lIl(1740270297, var9 ^ 1353929643);
            case 204 -> lIl(1740270302, var9 ^ 586676005);
            case 205 -> lIl(1740270303, var9 ^ 433023106);
            case 206 -> lIl(1740270300, var9 ^ 1878598812);
            case 207 -> lIl(1740270301, var9 ^ 1496216228);
            case 208 -> lIl(1740270306, var9 ^ 188296285);
            case 209 -> lIl(1740270307, var9 ^ 1882008283);
            case 210 -> lIl(1740270304, var9 ^ 544732647);
            case 211 -> lIl(1740270305, var9 ^ 168546140);
            case 212 -> lIl(1740270310, var9 ^ -1477163203);
            case 213 -> lIl(1740270311, var9 ^ 617106637);
            case 214 -> lIl(1740270308, var9 ^ 362170059);
            case 215 -> lIl(1740270309, var9 ^ -2073941957);
            case 216 -> lIl(1740270314, var9 ^ -237351408);
            case 217 -> lIl(1740270315, var9 ^ -1229722655);
            case 218 -> lIl(1740270312, var9 ^ 1225763729);
            case 219 -> lIl(1740270313, var9 ^ -1674961469);
            case 220 -> lIl(1740270318, var9 ^ 1709400273);
            case 221 -> lIl(1740270319, var9 ^ 1022464115);
            case 222 -> lIl(1740270316, var9 ^ -852226086);
            case 223 -> lIl(1740270317, var9 ^ -1636755414);
            case 224 -> lIl(1740270322, var9 ^ 1609090775);
            case 225 -> lIl(1740270323, var9 ^ 1870132458);
            case 226 -> lIl(1740270320, var9 ^ -922247739);
            case 227 -> lIl(1740270321, var9 ^ -465046119);
            case 228 -> lIl(1740270326, var9 ^ 1341439922);
            case 229 -> lIl(1740270327, var9 ^ 1150445900);
            case 230 -> lIl(1740270324, var9 ^ -1279669533);
            case 231 -> lIl(1740270325, var9 ^ -1796674843);
            case 232 -> lIl(1740270330, var9 ^ 1096411999);
            case 233 -> lIl(1740270331, var9 ^ -1176161938);
            case 234 -> lIl(1740270328, var9 ^ 768250453);
            case 235 -> lIl(1740270329, var9 ^ -1265962938);
            case 236 -> lIl(1740270334, var9 ^ 2018236397);
            case 237 -> lIl(1740270335, var9 ^ -671439600);
            case 238 -> lIl(1740270332, var9 ^ -1044060385);
            case 239 -> lIl(1740270333, var9 ^ 742053632);
            case 240 -> lIl(1740270338, var9 ^ 2038857502);
            case 241 -> lIl(1740270339, var9 ^ -1907015353);
            case 242 -> lIl(1740270336, var9 ^ 998096768);
            case 243 -> lIl(1740270337, var9 ^ -1616498233);
            case 244 -> lIl(1740270342, var9 ^ -921928684);
            case 245 -> lIl(1740270343, var9 ^ -1704653946);
            case 246 -> lIl(1740270340, var9 ^ -2015056879);
            case 247 -> lIl(1740270341, var9 ^ 481436691);
            case 248 -> lIl(1740270346, var9 ^ 889342681);
            case 249 -> lIl(1740270347, var9 ^ 2012269363);
            case 250 -> lIl(1740270344, var9 ^ -607527449);
            case 251 -> lIl(1740270345, var9 ^ -829740374);
            case 252 -> lIl(1740270350, var9 ^ 1483448039);
            case 253 -> lIl(1740270351, var9 ^ 1472156679);
            case 254 -> lIl(1740270348, var9 ^ 1173105849);
            default -> lIl(1740270349, var9 ^ 142784284);
         };
         int var5 = (var1 & lIl(1740270354, var9 ^ -1156734059)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIl(1740270355, var9 ^ -1243191212)) >>> lIl(1740270352, var9 ^ -1676644479)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIl(1740270353, var9 ^ 1927308309);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIl(1740270358, var9 ^ 1825320035);
            }
         }

         lll[var2] = new String(var3).intern();
      }

      return lll[var2];
   }

   @Override
   public void IIlIl() {
      this.Ill.III(class_310.method_1551());
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 531705055;
      short var12 = 5430;
      int var11 = 0;
      int var8 = "r䯮\uf2adﴵꍲ닢躚ぽ녲౮\ud930哫㲧ⶐ셴纎恎尭↞๕\ue605쯡麜鼍朧颚\ue264촑呯䧉谥ꉛꬿ躚ⲙ쬷쵨펗賻ｑ谥ﾆ져鱤ꈛ쭷\uf3b7ၚᬂ螢굜想衭匑ࡵ됑濨暫렘㴲컃醍胔≙\uda42䪎賀攀뿻燎孭ű⸱࠱\u086e쬷烃쿃\ue0fc㬦谦懀ﰂ迃㒖윫츿莪ꈫ쯿䅵\ued0d궢⿑哟륅炰絉䒽⢜㉆⯲賍\uf3b7᯳汮言뱾승ⲁ괜꣮Ꞓ괊\ueedaq黎\u0be3ⲽᬘ殽\uf7d6騷뜧㜫ꄄ䢩맱䚵ូ䥭秠\uf41dṟ蕘\u206f聉\u0007⺬自㛲훖ﮓ擞莈挕㾪탣誊ဂ笤\uf081欬쫲赎홺奄꾚绩솨鱪礽ʬ醸ࡳ聴蓢\ud995䥴稗칕訂⒏쭓䪏櫶욂\ue059䡒䮬\uf0a3刯\uf60e똖軔ｻ\ue2fa柭팚擑\uf23b\ue80dߺ份\uda58㡦胳鴧\uf55f╏詆拕䑎ي⠈菶かᤑ钜朢\uddb2\ue841梺洽斴鵨蜺᳃蚧㳪\u0bcf篎綏䪄ꚵ煌\u074c驪짤"
         .length();
      String[] var10001 = new String[2];
      int var10 = 0;
      String[] var9 = var10001;
      String var7 = "r䯮\uf2adﴵꍲ닢躚ぽ녲౮\ud930哫㲧ⶐ셴纎恎尭↞๕\ue605쯡麜鼍朧颚\ue264촑呯䧉谥ꉛꬿ躚ⲙ쬷쵨펗賻ｑ谥ﾆ져鱤ꈛ쭷\uf3b7ၚᬂ螢굜想衭匑ࡵ됑濨暫렘㴲컃醍胔≙\uda42䪎賀攀뿻燎孭ű⸱࠱\u086e쬷烃쿃\ue0fc㬦谦懀ﰂ迃㒖윫츿莪ꈫ쯿䅵\ued0d궢⿑哟륅炰絉䒽⢜㉆⯲賍\uf3b7᯳汮言뱾승ⲁ괜꣮Ꞓ괊\ueedaq黎\u0be3ⲽᬘ殽\uf7d6騷뜧㜫ꄄ䢩맱䚵ូ䥭秠\uf41dṟ蕘\u206f聉\u0007⺬自㛲훖ﮓ擞莈挕㾪탣誊ဂ笤\uf081欬쫲赎홺奄꾚绩솨鱪礽ʬ醸ࡳ聴蓢\ud995䥴稗칕訂⒏쭓䪏櫶욂\ue059䡒䮬\uf0a3刯\uf60e똖軔ｻ\ue2fa柭팚擑\uf23b\ue80dߺ份\uda58㡦胳鴧\uf55f╏詆拕䑎ي⠈菶かᤑ钜朢\uddb2\ue841梺洽斴鵨蜺᳃蚧㳪\u0bcf篎綏䪄ꚵ煌\u074c驪짤";

      do {
         char var13 = var7.charAt(var11);
         int var24 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var24, var10002 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 121;
               case 1 -> 117;
               case 2 -> 91;
               case 3 -> 119;
               case 4 -> 159;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 2 | var16 << 14) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 2 | var16 >>> 14) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IlIl = var9;
      IllI = new Object[var9.length];
      int var21 = 0;
      byte var25 = 0;
      IlII = new int[334];
      byte[] var35 = "ý7\u0099ÜzÒ\u007fG(à\u009b\u0017¸vY-s\u0014ì\u008fe¶0!^YÌØ\u0082ûÛG\u0092\\dýè9(¶Å\u0014³³I\u0099«Ûk\u001b\u0099\u0089+¥\u009ee7XrÔG\u0081õ\"°Sä¼}\u001c«.Ýs`îoë§wBß\u007fíÊÜBæ\u0097²\u0015¼×\u0091Ê¾\rÉèç¿Kd_7\u0010cQ×\u0017ª\u008d\u009b\u001c$¢FBú ·g\u0099Ð¥8eTÚ;~ÿÊ\u0093Rz?\u0086\u001fõüfkÎH\u0015WÑ´Ó\u0086p\u0007á \u0011^Ù .¸Òæh7¨áòÛù\u009e\u009b\u0005sçÌtÛ\u0090ß|çãv?¢H\u008d'hþ\u000f¯P0ùa¼Ä\u0003³ªû\u000b; 6Æ\u00adø\u0085#8wüZÛ/\u0002è\u009añµ\u008aaÿ¬c\u0015\u0010CF.^ç{E\u0089#8BÞ\u008cqì\u0019¾Öär\u0003\u0081\u0086\u0089tÒ\u0013Æ¥o\u0014· ÅD[LÕñêM¤a\u0095od¿»i¶M¤ò\u00adÍ\u001e\u00922\b»ct±¬\u0012\u009dÙï\u007f\u000fET0\u0011B<\u0089IGp4\u0081\u0002áqtÓ»»W³S³\u0099±Æ¨B\u000fÅ Ðæ\u0013\u0095<\u00ad\b\u0091TâSSv@¶\u0017bÚç2ðÈKç\u0098nüÁx\u0006\u0092o|Z|\u0080Ä\u0016YÀ\u0091\u0012|lPÌêQ!¸hh'´ïÉ)¤\u001dªhNïtdÙu\u00846\u001a\u008f«\u0083¨\u008dZ\u0001G §Ô\u007f\u0012øgÿavVa\u0010°Jú\u00ad\u0013\u0090K£ØåùV\u008fª\u0014¢áqµm\u001b-± µ£¦Ú\rÄü¿$\n\u0087\u0097¨<Z\u001dz?Élü»\nK\u009e\u0099ºòÏ÷c\u001b\u0019JA2È\u007f\u009b\u0001¬\u008d´/iê÷Àç¾ÂGs*\u0010½Bîz\u001f\u008bl\u000ey×å9\u001cÁ³\u0019k9V%r\u0083ð'\u0089&\u0010Îè\u0085\u009e\u0012\u0007l\u0083â«,\u0090p\u007fæÉ6ú\u0014+âî\u001d\u0082m\u000e·ð7W\u009d;Ü±\u0092æ7Sp\u0004°\nÓd\u0001iðËâù\u008bDÅbhá¶è(kdÑ¢à`Ãã\u001fýú\u001bÉ{\u0085Æ\u0087Ãkú\u000eíh\u0087\u0007¢\u0094Ù%4\u0019j'S[9*\u001eä\u0098`|v\u009dÞXõà¤\u009b\u0016wr×BºÅ\u008cWÊcØ\u0015\\?¸t´\u0003û:2L§\u008a?õ¶ÊtÀ8ª\u008c«n\n\t¾qh\u0005w1.\u001eú\u00886þ®?cÖY=þãç2ëlå§dV\n!ß?Àëû\u008eåñ \u0091Jo¨\u0083$rÍQ¥\u008bU\u0094\u0086j\u0085\f¦J\u0004\u0083WÚ¥¢\u0013\u009cåej¶Ù6fPUy\u001aqO8P«ñ°>È¶Â\u008f þ\u009c.f G\u00191/\u009aT²33³!à\\W5\r'xV²äëj\u0007\u0084\u008f01W\u001b\u0097u\u0013ºdz\u001eº0\u009dê}@î!\u0097þRß-\u008f\u0012\u0091h\u009e\u0000\u0085_\u0013\u0006NÒ¿È{Hì\rg\u0084ô\fí\u001eÖò=Do`è\u008eÓýµ\u0097,§ª¦ë\u008eS¸_\u0012Ó÷\u009as=k\u0099\u009dYM ?ÀÑÒ{jîéCûú\u009fu·)©¢ïIûµ¿\n\u0080¡¶ËÐûh#ú\u0087SþWxÔªÔDß¿å\u001aÕOtî´\u0003\u0001VÝjF?v*¹\u00836ol¦\u00805\u0095oý,Ì}\fg=¸\u009c ný\u008b{¯dUA\u009fûh\\9\u008b\u000eR\u0014Ëi\u0014¿x#(´\u001eõóC5YZddy\u00ad±Õw(Ii\u00adÞÝF\u000f\u0099D\u0006lì\u0088ÇKÚ'v8Þ1HzÑÜ¶K3\u0089\nâà~ÙÓäËñ-:o*£H9\u0080áÐjé\u0096swh1Jì>¶\u000bÅ\u008e×\u0015\u0087|Yd+EOE>\u0007·ñ¨ç\u0002Ó§3È\u0018µ`±Uø\u000e%\u008bK\u0081>ÂEkú\u0002l\u009cýï\u0082lùA\u009c@±0ºr\u00874AO<rw¢\u0099±Ú¡¿øà\u0000÷.\u0099\u0016I\u0002ÈS¾GY¬=p\u000e\u0003Ù\u00ad\u000e\u0012Ý ä\u001dØætze3\u0003û\u0014ÔÍ´\u0002//Õ`xÕ¦\u001fëÈ§\u0088Br9T\u0086\u008fªÇ·\u0002L\u001aRÑI´^oO|°&{¹¦\rU¹È°\u0099\u0081ñ\nÞ¨\u009dõ\u0005É3/\u0097\u0013P{ð\u0014FPòR\u0096ÑýËýòE}~¤+ Æ\n\u009e\u0004\u0012!ür\u00930ìñÃzÚ\u0014C\u0007â©\u0086\u008b\u00adµ\u001cWV\u008fõ9c°/ds3\u009d3\u0011]\u001cÑÝZôÜóª½ð~5\u0099\u009c\u000eB),\u0091ý»²%å\u0007'Ñ¼S¾ó3K\u0015Ä~`\u0002 )n\nOÃ\u009d\u008c\bë\u0099v\u0012Á\u009bp\t\u001eo"
         .getBytes("ISO-8859-1");

      int var57;
      do {
         IlII[var21] = ((var35[var25] & 255) << 24 | (var35[var25 + 1] & 255) << 16 | (var35[var25 + 2] & 255) << 8 | var35[var25 + 3] & 255) ^ 241508346;
         var21 += 1;
         var57 = var25 + 4;
         var25 += 4;
      } while (var57 < var35.length);

      String[] var5 = new String[lIl(1740270081, var17 ^ -837153330)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = llI((short)-21773, '駼', -2078780426, 667023449, 507188356)).length();
      int var1 = lIl(1740270086, var17 ^ 91797618);
      int var19 = -1;

      label100:
      while (true) {
         var21 = lIl(1740270087, var17 ^ 333079767);
         String var28 = var2.substring(++var19, var19 + var1);
         byte var41 = -1;

         while (true) {
            label95: {
               char[] var59 = var28.toCharArray();
               int var71 = var59.length;
               int var6 = 0;
               var57 = var21;
               var46 = var59;
               int var33 = var71;
               char[] var83;
               int var90;
               if (var71 <= 1) {
                  var83 = var59;
                  var71 = var21;
                  var90 = var6;
               } else {
                  var57 = var21;
                  var33 = var71;
                  if (var71 <= var6) {
                     break label95;
                  }

                  var83 = var59;
                  var71 = var21;
                  var90 = var6;
               }

               while (true) {
                  var83[var90] = (char)(var83[var90] ^ var71 ^ switch (var6 % lIl(1740270091, var17 ^ -1638564815)) {
                     case 0 -> lIl(1740270088, var17 ^ -1283921990);
                     case 1 -> lIl(1740270089, var17 ^ 1073086402);
                     case 2 -> lIl(1740270094, var17 ^ 494387928);
                     case 3 -> lIl(1740270095, var17 ^ 1573504314);
                     case 4 -> lIl(1740270092, var17 ^ 1093936841);
                     case 5 -> lIl(1740270093, var17 ^ 837656850);
                     default -> lIl(1740270098, var17 ^ -968900627);
                  });
                  var6++;
                  if (var57 == 0) {
                     var90 = var57;
                     var83 = var46;
                     var71 = var57;
                  } else {
                     if (var33 <= var6) {
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
                     IIlI = var5;
                     lll = new String[lIl(1740270090, var17 ^ -466604011)];
                     I = new String[lIl(1740270099, var17 ^ 191954911)];
                     lI();
                     IlI = IIIllIIl.IlI;
                     III = new IlIIlIIl(
                        true,
                        IlIIllIII.lI(I[3]),
                        IlIIllIII.lI(I[5]),
                        IlIIllIII.lI(I[lIl(1740270096, var17 ^ -1424018317)]),
                        IlIIllIII.lI(I[4]),
                        232000L,
                        460000L,
                        true,
                        0L,
                        null,
                        IIIlII.III
                     );
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var64;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label100;
                  }

                  var4 = (var2 = llI((short)-12009, 7790, -916298413, 667023448, 1812757863)).length();
                  var1 = lIl(1740270084, var17 ^ 674601023);
                  var19 = -1;
            }

            var21 = lIl(1740270085, var17 ^ -191397410);
            var28 = var2.substring(++var19, var19 + var1);
            var41 = 0;
         }
      }
   }

   @Override
   public void llIl() {
      this.Ill.I(class_310.method_1551());
   }

   public IlIllIlII(IIIlIIII var1) {
      int var2 = 1119782204;
      super(IlIIllIII.Ill(I[1]), lllIIlIl.II, IlIIllIII.Ill(I[lIl(1740270359, var2 ^ -1861125330)]));
      this.Ill = new IIIllIIII();
      this.IIII = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(I[lIl(1740270356, var2 ^ 1781317734)]), 18.0, 0.0, 4000.0, 1.0).IlII(IlIIllIII.lI(I[lIl(1740270357, var2 ^ 1556178344)]))
      );
      this.ll = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(I[lIl(1740270362, var2 ^ -238926880)]), 132.0, 0.0, 4000.0, 1.0).IlII(IlIIllIII.lI(I[lIl(1740270363, var2 ^ -882701511)]))
      );
      this.lI = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(I[lIl(1740270360, var2 ^ -1300908683)]), 100.0, 60.0, 200.0, 5.0).IlII(IlIIllIII.lI(I[lIl(1740270361, var2 ^ -483376547)]))
      );
   }

   private static void lI() {
      int var0 = 1608052217;
      I[0] = IIl(Il(lIl(1740270366, var0 ^ 1873441803), lIl(1740270367, var0 ^ 939934150)).toCharArray(), 72567L, lIl(1740270364, var0 ^ -905293897));
      I[1] = IIl(Il(lIl(1740270365, var0 ^ -769945167), lIl(1740270370, var0 ^ 1115579074)).toCharArray(), 5171L, lIl(1740270371, var0 ^ -856400090));
      I[2] = IIl(Il(lIl(1740270368, var0 ^ -72201373), lIl(1740270369, var0 ^ 433250877)).toCharArray(), 82403L, lIl(1740270374, var0 ^ 66172878));
      I[3] = IIl(Il(lIl(1740270375, var0 ^ -22953682), lIl(1740270372, var0 ^ 1144922286)).toCharArray(), 37816L, lIl(1740270373, var0 ^ -1702856208));
      I[4] = IIl(Il(lIl(1740270378, var0 ^ 877286172), lIl(1740270379, var0 ^ -414305788)).toCharArray(), 93926L, lIl(1740270376, var0 ^ 980176171));
      I[5] = IIl(Il(lIl(1740270377, var0 ^ 276689122), lIl(1740270382, var0 ^ 995358698)).toCharArray(), 11320L, lIl(1740270383, var0 ^ -785915588));
      I[lIl(1740270380, var0 ^ 1021000730)] = IIl(
         Il(lIl(1740270381, var0 ^ -1023180682), lIl(1740270386, var0 ^ 429069648)).toCharArray(), 72311L, lIl(1740270387, var0 ^ -1641974831)
      );
      I[lIl(1740270384, var0 ^ 1727514124)] = IIl(
         Il(lIl(1740270385, var0 ^ -402947413), lIl(1740270390, var0 ^ -1002202015)).toCharArray(), 19802L, lIl(1740270391, var0 ^ -1269537520)
      );
      I[lIl(1740270388, var0 ^ 1016828143)] = IIl(
         Il(lIl(1740270389, var0 ^ 402275264), lIl(1740270394, var0 ^ 115934402)).toCharArray(), 72928L, lIl(1740270395, var0 ^ -1381765783)
      );
      I[lIl(1740270392, var0 ^ 837238134)] = IIl(
         Il(lIl(1740270393, var0 ^ -1112801484), lIl(1740270398, var0 ^ 1632674240)).toCharArray(), 12631L, lIl(1740270399, var0 ^ 1511498221)
      );
      I[lIl(1740270396, var0 ^ 1383507814)] = IIl(
         Il(lIl(1740270397, var0 ^ 85398594), lIl(1740270402, var0 ^ -405075252)).toCharArray(), 67770L, lIl(1740270403, var0 ^ 1706280929)
      );
      I[lIl(1740270400, var0 ^ -964976353)] = IIl(
         Il(lIl(1740270401, var0 ^ -1442313462), lIl(1740270406, var0 ^ 445927573)).toCharArray(), 49700L, lIl(1740270407, var0 ^ -379689481)
      );
      I[lIl(1740270404, var0 ^ 299116754)] = IIl(
         Il(lIl(1740270405, var0 ^ -1997178265), lIl(1740270410, var0 ^ 599982114)).toCharArray(), 62129L, lIl(1740270411, var0 ^ -1447267185)
      );
   }

   private static int lIl(int var0, int var1) {
      int var2 = IlII[var0 ^ 1740270082] ^ var1 ^ var0;
      var2 ^= 39785;
      var2 -= 2071;
      var2 -= 2475;
      var2 ^= 48881;
      var2 -= 7367;
      var2 -= 58497;
      var2 -= 25398;
      var2 ^= 36276;
      return var2 - 22558;
   }

   @Override
   public void IIIII(class_332 var1, int var2, int var3, float var4) {
      this.II(var1, false, false);
   }

   private double III() {
      return this.lI.IllI() / 100.0;
   }

   @Override
   public double ll() {
      return this.ll.IllI();
   }

   private static String IIl(char[] var0, long var1, int var3) {
      int var4 = lIl(1740270408, -597785548 ^ 1762987672) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & lIl(1740270409, -597785548 ^ 965417455);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   @Override
   public void Illl(class_332 var1, int var2, int var3, float var4, boolean var5) {
      this.II(var1, true, var5);
   }

   private void Ill(class_332 var1, class_2960 var2, boolean var3) {
      if (!var3 && var2 != null) {
         IlIIlllIl.lIlI(var1, var2, 14.0, 10.0, 40.0, 40.0);
      } else {
         IlIIlllIl.lIIll(
            var1,
            class_310.method_1551().field_1772,
            String.valueOf((char)lIl(1740270414, -1583300245 ^ -1099990667)),
            14.0,
            10.0,
            40.0,
            40.0,
            IIIlIllII.lII(lIl(1740270415, -1583300245 ^ -1200314048))
         );
      }
   }

   @Override
   public double IIIl() {
      return 76.0 * this.III();
   }

   private static String lII(String var0, String var1) {
      return var0 != null && !var0.isBlank() ? var0 : var1;
   }

   @Override
   public boolean IlIIllI() {
      return IIlII.IIl();
   }

   @Override
   public double lll() {
      return this.IIII.IllI();
   }

   @Override
   public double IIllI() {
      return 240.0 * this.III();
   }

   @Override
   public void IlIII() {
      this.Ill.III(class_310.method_1551());
   }
}
