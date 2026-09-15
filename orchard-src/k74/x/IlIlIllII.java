package k74.x;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IlIlIllII {
   private static final int[] IIl;
   private long I;
   private final Deque<IIIlIlI> l = new ArrayDeque<>();
   private static final String[] IlI;
   private static final long II = 320L;
   private static final Object[] Ill;
   private static final IlIlIllII Il;
   private static final String[] lI;
   private static final String[] ll;
   private static final int III = 8;

   public synchronized void I(IIIIllI var1, IIIlIlIl var2, IIIlIlIl var3, long var4) {
      String[] var10000 = IIllllIl.IIIIl();
      IIIIIllII var7 = IIIIIllII.III();
      String[] var6 = var10000;
      if (var7 != null) {
         IIIlllIIl var8 = var7.II().lllII(IIIlllIIl.class);
         if (var8 == null || !var8.IIIIlIl()) {
            return;
         }
      }

      long var10 = System.currentTimeMillis();
      this.ll(var10);
      this.l
         .addFirst(
            new IIIlIlI(
               ++this.I,
               var1 == null ? IIIIllI.I : var1,
               var2 == null ? IlIIllIII.lII("") : var2,
               var3 == null ? IlIIllIII.lII("") : var3,
               var10,
               Math.max(250L, var4)
            )
         );

      while (this.l.size() > Ill(1848004813, -2026432545 ^ -1787045362)) {
         this.l.removeLast();
         if (var6 != null) {
            break;
         }
      }
   }

   public static IlIlIllII l() {
      return Il;
   }

   private static int Ill(int var0, int var1) {
      int var2 = IIl[var0 ^ 1848004813] ^ var1 ^ var0;
      var2 ^= 20117;
      var2 ^= 53517;
      var2 ^= 1325;
      var2 -= 43842;
      var2 ^= 23034;
      var2 ^= 53135;
      return var2 ^ 20467;
   }

   private static String II(int var0, int var1) {
      int var9 = -314038308;
      int var2 = (var0 ^ Ill(1848004812, var9 ^ 1792282115)) & Ill(1848004815, var9 ^ 331577760);
      if (lI[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & Ill(1848004814, var9 ^ 1829079804)) {
            case 0 -> Ill(1848004809, var9 ^ 885944021);
            case 1 -> Ill(1848004808, var9 ^ -754011157);
            case 2 -> Ill(1848004811, var9 ^ -277897035);
            case 3 -> Ill(1848004810, var9 ^ -1171310408);
            case 4 -> Ill(1848004805, var9 ^ 1272763185);
            case 5 -> Ill(1848004804, var9 ^ 1044383582);
            case 6 -> Ill(1848004807, var9 ^ 528794278);
            case 7 -> Ill(1848004806, var9 ^ 2016832987);
            case 8 -> Ill(1848004801, var9 ^ -1458868098);
            case 9 -> Ill(1848004800, var9 ^ -1838050295);
            case 10 -> Ill(1848004803, var9 ^ 699907162);
            case 11 -> Ill(1848004802, var9 ^ -1043991426);
            case 12 -> Ill(1848004829, var9 ^ 99462661);
            case 13 -> Ill(1848004828, var9 ^ 303787215);
            case 14 -> Ill(1848004831, var9 ^ 36042503);
            case 15 -> Ill(1848004830, var9 ^ 1429659221);
            case 16 -> Ill(1848004825, var9 ^ -1179075663);
            case 17 -> Ill(1848004824, var9 ^ -401021241);
            case 18 -> Ill(1848004827, var9 ^ 12482181);
            case 19 -> Ill(1848004826, var9 ^ 2061100679);
            case 20 -> Ill(1848004821, var9 ^ -293361101);
            case 21 -> Ill(1848004820, var9 ^ 1055211704);
            case 22 -> Ill(1848004823, var9 ^ -578258493);
            case 23 -> Ill(1848004822, var9 ^ 675217455);
            case 24 -> Ill(1848004817, var9 ^ 454623675);
            case 25 -> Ill(1848004816, var9 ^ 1918333678);
            case 26 -> Ill(1848004819, var9 ^ 701964133);
            case 27 -> Ill(1848004818, var9 ^ -1634530296);
            case 28 -> Ill(1848004845, var9 ^ -1448163857);
            case 29 -> Ill(1848004844, var9 ^ 1725344040);
            case 30 -> Ill(1848004847, var9 ^ 1311505851);
            case 31 -> Ill(1848004846, var9 ^ -1356234477);
            case 32 -> Ill(1848004841, var9 ^ -49677960);
            case 33 -> Ill(1848004840, var9 ^ -1095331182);
            case 34 -> Ill(1848004843, var9 ^ -1406083068);
            case 35 -> Ill(1848004842, var9 ^ 1296814574);
            case 36 -> Ill(1848004837, var9 ^ -841681819);
            case 37 -> Ill(1848004836, var9 ^ -528780467);
            case 38 -> Ill(1848004839, var9 ^ 2095319328);
            case 39 -> Ill(1848004838, var9 ^ 155595106);
            case 40 -> Ill(1848004833, var9 ^ 586110996);
            case 41 -> Ill(1848004832, var9 ^ 1937950305);
            case 42 -> Ill(1848004835, var9 ^ -107586979);
            case 43 -> Ill(1848004834, var9 ^ 373624090);
            case 44 -> Ill(1848004861, var9 ^ -290110415);
            case 45 -> Ill(1848004860, var9 ^ 1225005845);
            case 46 -> Ill(1848004863, var9 ^ 1288032259);
            case 47 -> Ill(1848004862, var9 ^ 231363563);
            case 48 -> Ill(1848004857, var9 ^ 171239627);
            case 49 -> Ill(1848004856, var9 ^ 1358786785);
            case 50 -> Ill(1848004859, var9 ^ -1910603496);
            case 51 -> Ill(1848004858, var9 ^ -833542400);
            case 52 -> Ill(1848004853, var9 ^ -639461871);
            case 53 -> Ill(1848004852, var9 ^ 458865022);
            case 54 -> Ill(1848004855, var9 ^ -239720923);
            case 55 -> Ill(1848004854, var9 ^ 552751815);
            case 56 -> Ill(1848004849, var9 ^ 139616225);
            case 57 -> Ill(1848004848, var9 ^ 127864915);
            case 58 -> Ill(1848004851, var9 ^ 2143508492);
            case 59 -> 3;
            case 60 -> Ill(1848004850, var9 ^ 628224001);
            case 61 -> 5;
            case 62 -> Ill(1848004749, var9 ^ 1598522913);
            case 63 -> Ill(1848004748, var9 ^ 464819872);
            case 64 -> Ill(1848004751, var9 ^ 1546090834);
            case 65 -> Ill(1848004750, var9 ^ -389279837);
            case 66 -> Ill(1848004745, var9 ^ -1057648414);
            case 67 -> Ill(1848004744, var9 ^ -887079294);
            case 68 -> Ill(1848004747, var9 ^ -586571468);
            case 69 -> Ill(1848004746, var9 ^ 1786040295);
            case 70 -> Ill(1848004741, var9 ^ 638526950);
            case 71 -> Ill(1848004740, var9 ^ -964659644);
            case 72 -> Ill(1848004743, var9 ^ -1751402448);
            case 73 -> Ill(1848004742, var9 ^ -30998941);
            case 74 -> Ill(1848004737, var9 ^ 567103920);
            case 75 -> Ill(1848004736, var9 ^ 1753003889);
            case 76 -> Ill(1848004739, var9 ^ -654885221);
            case 77 -> Ill(1848004738, var9 ^ 1894194691);
            case 78 -> Ill(1848004765, var9 ^ -1033759781);
            case 79 -> Ill(1848004764, var9 ^ -1743372792);
            case 80 -> Ill(1848004767, var9 ^ -2068443766);
            case 81 -> Ill(1848004766, var9 ^ -1144947169);
            case 82 -> Ill(1848004761, var9 ^ -1936552292);
            case 83 -> Ill(1848004760, var9 ^ 972991093);
            case 84 -> Ill(1848004763, var9 ^ -1910669369);
            case 85 -> Ill(1848004762, var9 ^ 1632465896);
            case 86 -> Ill(1848004757, var9 ^ 797491484);
            case 87 -> 0;
            case 88 -> Ill(1848004756, var9 ^ 580717388);
            case 89 -> Ill(1848004759, var9 ^ -594761241);
            case 90 -> Ill(1848004758, var9 ^ 1718455093);
            case 91 -> Ill(1848004753, var9 ^ 667756756);
            case 92 -> Ill(1848004752, var9 ^ 1773811756);
            case 93 -> Ill(1848004755, var9 ^ -1374613590);
            case 94 -> Ill(1848004754, var9 ^ -1962734576);
            case 95 -> Ill(1848004781, var9 ^ -1121284871);
            case 96 -> Ill(1848004780, var9 ^ -1859639302);
            case 97 -> Ill(1848004783, var9 ^ -1070416168);
            case 98 -> Ill(1848004782, var9 ^ -469305068);
            case 99 -> Ill(1848004777, var9 ^ -997023733);
            case 100 -> Ill(1848004776, var9 ^ -850203263);
            case 101 -> Ill(1848004779, var9 ^ 1379629731);
            case 102 -> Ill(1848004778, var9 ^ -394490487);
            case 103 -> Ill(1848004773, var9 ^ 1957426155);
            case 104 -> Ill(1848004772, var9 ^ 1909289360);
            case 105 -> Ill(1848004775, var9 ^ 2035597998);
            case 106 -> Ill(1848004774, var9 ^ -368174832);
            case 107 -> Ill(1848004769, var9 ^ 1854855776);
            case 108 -> Ill(1848004768, var9 ^ 1448112723);
            case 109 -> Ill(1848004771, var9 ^ 1755026749);
            case 110 -> Ill(1848004770, var9 ^ 1860463996);
            case 111 -> Ill(1848004797, var9 ^ -983713067);
            case 112 -> Ill(1848004796, var9 ^ 928997944);
            case 113 -> Ill(1848004799, var9 ^ -1431392126);
            case 114 -> Ill(1848004798, var9 ^ -1530719923);
            case 115 -> Ill(1848004793, var9 ^ -960240753);
            case 116 -> Ill(1848004792, var9 ^ 1391797940);
            case 117 -> Ill(1848004795, var9 ^ 1650643008);
            case 118 -> Ill(1848004794, var9 ^ 152663168);
            case 119 -> Ill(1848004789, var9 ^ 1172671011);
            case 120 -> Ill(1848004788, var9 ^ -1189048715);
            case 121 -> Ill(1848004791, var9 ^ -587787237);
            case 122 -> Ill(1848004790, var9 ^ -2099938599);
            case 123 -> Ill(1848004785, var9 ^ 1282734679);
            case 124 -> Ill(1848004784, var9 ^ -1223791309);
            case 125 -> Ill(1848004787, var9 ^ 1765079504);
            case 126 -> Ill(1848004786, var9 ^ -115637868);
            case 127 -> Ill(1848004685, var9 ^ 101282893);
            case 128 -> Ill(1848004684, var9 ^ -562220775);
            case 129 -> Ill(1848004687, var9 ^ -1197814272);
            case 130 -> Ill(1848004686, var9 ^ -929928199);
            case 131 -> Ill(1848004681, var9 ^ 1731438659);
            case 132 -> Ill(1848004680, var9 ^ -116368972);
            case 133 -> Ill(1848004683, var9 ^ 832718659);
            case 134 -> Ill(1848004682, var9 ^ -1767260907);
            case 135 -> Ill(1848004677, var9 ^ -2088601817);
            case 136 -> Ill(1848004676, var9 ^ -598280577);
            case 137 -> Ill(1848004679, var9 ^ -1980791954);
            case 138 -> Ill(1848004678, var9 ^ -1443674708);
            case 139 -> Ill(1848004673, var9 ^ 1208627116);
            case 140 -> Ill(1848004672, var9 ^ 1558976289);
            case 141 -> Ill(1848004675, var9 ^ 1845643135);
            case 142 -> Ill(1848004674, var9 ^ 641565500);
            case 143 -> Ill(1848004701, var9 ^ -54939916);
            case 144 -> Ill(1848004700, var9 ^ 808196359);
            case 145 -> Ill(1848004703, var9 ^ -1378439420);
            case 146 -> Ill(1848004702, var9 ^ -196635607);
            case 147 -> Ill(1848004697, var9 ^ 1243362287);
            case 148 -> Ill(1848004696, var9 ^ -196152224);
            case 149 -> Ill(1848004699, var9 ^ -929419937);
            case 150 -> Ill(1848004698, var9 ^ 21717362);
            case 151 -> Ill(1848004693, var9 ^ 280215563);
            case 152 -> Ill(1848004692, var9 ^ -737626187);
            case 153 -> Ill(1848004695, var9 ^ -1114560356);
            case 154 -> Ill(1848004694, var9 ^ -569196923);
            case 155 -> Ill(1848004689, var9 ^ 992746207);
            case 156 -> Ill(1848004688, var9 ^ -247861827);
            case 157 -> Ill(1848004691, var9 ^ 1615041738);
            case 158 -> Ill(1848004690, var9 ^ 750190350);
            case 159 -> Ill(1848004717, var9 ^ 1968665516);
            case 160 -> Ill(1848004716, var9 ^ -946818049);
            case 161 -> Ill(1848004719, var9 ^ -215735561);
            case 162 -> Ill(1848004718, var9 ^ -2018637869);
            case 163 -> Ill(1848004713, var9 ^ -876647632);
            case 164 -> 1;
            case 165 -> Ill(1848004712, var9 ^ -1081168484);
            case 166 -> Ill(1848004715, var9 ^ -876428941);
            case 167 -> Ill(1848004714, var9 ^ -1860874767);
            case 168 -> Ill(1848004709, var9 ^ -1201817508);
            case 169 -> Ill(1848004708, var9 ^ -1517369940);
            case 170 -> Ill(1848004711, var9 ^ -1236085565);
            case 171 -> Ill(1848004710, var9 ^ 1590091987);
            case 172 -> Ill(1848004705, var9 ^ 616817705);
            case 173 -> Ill(1848004704, var9 ^ 900721534);
            case 174 -> Ill(1848004707, var9 ^ -1050656982);
            case 175 -> Ill(1848004706, var9 ^ 1110681250);
            case 176 -> Ill(1848004733, var9 ^ -1137047965);
            case 177 -> Ill(1848004732, var9 ^ 427927946);
            case 178 -> Ill(1848004735, var9 ^ -2100329985);
            case 179 -> Ill(1848004734, var9 ^ -911909615);
            case 180 -> Ill(1848004729, var9 ^ -2012380698);
            case 181 -> Ill(1848004728, var9 ^ 1660913704);
            case 182 -> Ill(1848004731, var9 ^ -1844554205);
            case 183 -> 2;
            case 184 -> Ill(1848004730, var9 ^ 252080538);
            case 185 -> Ill(1848004725, var9 ^ -1866986940);
            case 186 -> Ill(1848004724, var9 ^ -696710949);
            case 187 -> Ill(1848004727, var9 ^ -1966013353);
            case 188 -> Ill(1848004726, var9 ^ 1885369899);
            case 189 -> Ill(1848004721, var9 ^ 591533452);
            case 190 -> Ill(1848004720, var9 ^ 1972410583);
            case 191 -> Ill(1848004723, var9 ^ 1422931001);
            case 192 -> Ill(1848004722, var9 ^ -850092812);
            case 193 -> Ill(1848004621, var9 ^ 627792889);
            case 194 -> Ill(1848004620, var9 ^ 1468502435);
            case 195 -> Ill(1848004623, var9 ^ -1046902463);
            case 196 -> Ill(1848004622, var9 ^ -379282667);
            case 197 -> 4;
            case 198 -> Ill(1848004617, var9 ^ -1978241495);
            case 199 -> Ill(1848004616, var9 ^ -1313913606);
            case 200 -> Ill(1848004619, var9 ^ -2024751437);
            case 201 -> Ill(1848004618, var9 ^ -130240922);
            case 202 -> Ill(1848004613, var9 ^ 1236967200);
            case 203 -> Ill(1848004612, var9 ^ 1666430007);
            case 204 -> Ill(1848004615, var9 ^ -879856698);
            case 205 -> Ill(1848004614, var9 ^ -391854737);
            case 206 -> Ill(1848004609, var9 ^ 965592993);
            case 207 -> Ill(1848004608, var9 ^ -1431224068);
            case 208 -> Ill(1848004611, var9 ^ -1960854222);
            case 209 -> Ill(1848004610, var9 ^ 891082513);
            case 210 -> Ill(1848004637, var9 ^ 597844309);
            case 211 -> Ill(1848004636, var9 ^ -934526204);
            case 212 -> Ill(1848004639, var9 ^ 1355302066);
            case 213 -> Ill(1848004638, var9 ^ 699816492);
            case 214 -> Ill(1848004633, var9 ^ 1433458788);
            case 215 -> Ill(1848004632, var9 ^ 684100488);
            case 216 -> Ill(1848004635, var9 ^ -739764496);
            case 217 -> Ill(1848004634, var9 ^ 227161428);
            case 218 -> Ill(1848004629, var9 ^ -1094863067);
            case 219 -> Ill(1848004628, var9 ^ 1040272615);
            case 220 -> Ill(1848004631, var9 ^ 1602059891);
            case 221 -> Ill(1848004630, var9 ^ 2067439304);
            case 222 -> Ill(1848004625, var9 ^ -1141703560);
            case 223 -> Ill(1848004624, var9 ^ 810384610);
            case 224 -> Ill(1848004627, var9 ^ 1039204422);
            case 225 -> Ill(1848004626, var9 ^ -2058415250);
            case 226 -> Ill(1848004653, var9 ^ 2129720733);
            case 227 -> Ill(1848004652, var9 ^ 1502852945);
            case 228 -> Ill(1848004655, var9 ^ -617755311);
            case 229 -> Ill(1848004654, var9 ^ 190762250);
            case 230 -> Ill(1848004649, var9 ^ 1796297542);
            case 231 -> Ill(1848004648, var9 ^ -666495764);
            case 232 -> Ill(1848004651, var9 ^ -271587900);
            case 233 -> Ill(1848004650, var9 ^ -1883303411);
            case 234 -> Ill(1848004645, var9 ^ -659564392);
            case 235 -> Ill(1848004644, var9 ^ 26341959);
            case 236 -> Ill(1848004647, var9 ^ -1394126873);
            case 237 -> Ill(1848004646, var9 ^ 1111112368);
            case 238 -> Ill(1848004641, var9 ^ -1792001922);
            case 239 -> Ill(1848004640, var9 ^ 2074352867);
            case 240 -> Ill(1848004643, var9 ^ -189806806);
            case 241 -> Ill(1848004642, var9 ^ -1994004470);
            case 242 -> Ill(1848004669, var9 ^ 37090144);
            case 243 -> Ill(1848004668, var9 ^ 443119256);
            case 244 -> Ill(1848004671, var9 ^ 1327551140);
            case 245 -> Ill(1848004670, var9 ^ -1516946123);
            case 246 -> Ill(1848004665, var9 ^ 1410982575);
            case 247 -> Ill(1848004664, var9 ^ -1918824056);
            case 248 -> Ill(1848004667, var9 ^ -706481257);
            case 249 -> Ill(1848004666, var9 ^ 1659610570);
            case 250 -> Ill(1848004661, var9 ^ 1011914693);
            case 251 -> Ill(1848004660, var9 ^ 1087109825);
            case 252 -> Ill(1848004663, var9 ^ 1412299022);
            case 253 -> Ill(1848004662, var9 ^ 1972529096);
            case 254 -> Ill(1848004657, var9 ^ 386565152);
            default -> Ill(1848004656, var9 ^ -195204297);
         };
         int var5 = (var1 & Ill(1848004659, var9 ^ 1608342155)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Ill(1848004658, var9 ^ -400077245)) >>> Ill(1848005069, var9 ^ 1434108917)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Ill(1848005068, var9 ^ 619227117);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Ill(1848005071, var9 ^ -491996789);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   public synchronized List<IIIlIlI> Il() {
      this.ll(System.currentTimeMillis());
      return List.copyOf(this.l);
   }

   private static String lII(int var0, int var1) {
      int var3 = var0 ^ -717420176;
      char[] var4 = IlI[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])Ill[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         Ill[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1886393452;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 74;
            case 1 -> 233;
            case 2 -> 106;
            case 3 -> 252;
            case 4 -> 128;
            case 5 -> 223;
            case 6 -> 135;
            case 7 -> 189;
            case 8 -> 140;
            case 9 -> 178;
            case 10 -> 176;
            case 11 -> 253;
            case 12 -> 10;
            case 13 -> 15;
            case 14 -> 6;
            case 15 -> 52;
            case 16 -> 95;
            case 17 -> 141;
            case 18 -> 11;
            case 19 -> 146;
            case 20 -> 108;
            case 21 -> 0;
            case 22 -> 91;
            case 23 -> 66;
            case 24 -> 35;
            case 25 -> 10;
            case 26 -> 118;
            case 27 -> 36;
            case 28 -> 66;
            case 29 -> 42;
            case 30 -> 89;
            case 31 -> 223;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   public synchronized void lI() {
      this.l.clear();
   }

   private void ll(long var1) {
      String[] var10000 = IIllllIl.IIIIl();
      ArrayList var4 = new ArrayList();
      Iterator var5 = this.l.iterator();
      String[] var3 = var10000;

      while (var5.hasNext()) {
         IIIlIlI var6 = (IIIlIlI)var5.next();
         if (var6.Il() + 320L <= var1) {
            var4.add(var6);
         }

         if (var3 != null) {
            break;
         }
      }

      if (!var4.isEmpty()) {
         this.l.removeAll(var4);
      }
   }

   public synchronized boolean III() {
      this.ll(System.currentTimeMillis());
      return !this.l.isEmpty();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -906750229;
      int var11 = 0;
      int var10001 = "\u0011屷㗹峝딹帀\uf5f2徎㗟幰\uf54f帷뗵嶅\uf51d帬뗌廞!⩶⊪⩌\ue247⦕抽⩋択⠹∲⣶\ue2a2⨘扡⤕\ue28d⥫抵⫑戗⮦\ue292⠀\ue24a⨡ꊹ⧛\ue2ae⨍\ue225⪞ꊘ⢬".length();
      String[] var9 = new String[2];
      short var12 = 2744;
      int var10 = 0;
      int var8 = var10001;
      String var7 = "\u0011屷㗹峝딹帀\uf5f2徎㗟幰\uf54f帷뗵嶅\uf51d帬뗌廞!⩶⊪⩌\ue247⦕抽⩋択⠹∲⣶\ue2a2⨘扡⤕\ue28d⥫抵⫑戗⮦\ue292⠀\ue24a⨡ꊹ⧛\ue2ae⨍\ue225⪞ꊘ⢬";

      do {
         char var10000 = var7.charAt(var11);
         int var15 = 0;
         char var13 = var10000;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 16;
               case 1 -> 49;
               case 2 -> 58;
               case 3 -> 199;
               case 4 -> 167;
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

      IlI = var9;
      Ill = new Object[var9.length];
      int var22 = 0;
      int var25 = 0;
      IIl = new int[278];
      byte[] var10002 = "§X\u0018È2\u0089\\ÃK\u009eÞ\f5YxQl\u0092\u009dÐ\u008bRA%·3RvâsÊ!\u0013\u0080!Qf\u001cô\u007fGØ0è j\u009fsñW\u0082\u000bÊ-fÐqëN\u0083\u0099\u0099\u0007J]±\\RJG\u009fîZy\u0005ë\rj-cáäIM°D\u0015øXâ\u0084+\"\u0085\u0014ê¶ßY7f¹³£\u0085Ô\u008b2pcó\u0016CEóÎ*\u000b\u0080\nq\u008bí\u001aÆÏþ\u0090ñò6Ð>\u008a[c\u0016w\u000e\u008a÷usü¥U\nYæê`ýôl\u0012Å\u0015\u0017#=\u0095\u0088\u0007W¸'\u0081×$¸û¨Q\u001aÂ[z³ªe+Þ4Á¡Ê¨ÕN\u0019ÿN¶é¶Þ\u0011Xè\u0013\u0014\u0099\"¤U\u0096¡\u0002Rh\u001a\u009f\b¡\u0082\u001eÖBs\\\u0096\rÕ`\u0081¾e\u0011C\u0005K\u0007©êÔ\u008cx® \nP\u000e\u00adv_Ãâÿ'\u009fª®}-\u0002Ë\u0007\u001bt2Cèd\u0019\u0004{\u008a4°\u0090üæ\u0098©b$\u0093|Ìq\u0085US\u00932(=n~S×'\u009eÜ\u0084VÏÇKZ¦z\r\"y\u0091£\u00800 D\u0017\u0080«Ì\u0085(»ì\u0088\u009a>à¾ÀJÍtÜêÿNã\u009d\u008cöÔÎ|da¢XÏÖA\u008c\u00809\u0011\u0081[wÔ3ázÁùJ\u0084Ð[->1xu\u007f\u0091Û²1æÊ\u0094öMýlÓ_þ\fåv~\u0016ÉtÔ\u0095\u0098nLë¼Z\u000b©\u009cÎR\u009c\u0095\u000e\u001f\u0016\ng\u0088 ° ~á,÷\u0000Ö)\u0091\u0083µ!\b0·²RêT6Ò(ê\u000e\f\u0080æ0Çfb6¸\u009f²\u009d\u0001H2o\u0003\u0090ÍòòB\u001cü\u009fã|\u009e\u009f\u0011¶\n©ÕÊ:>\"¤QE\u0086m\u001d¹yMá||¤\u0084«æ\u008bÚ\u0089\u0089µ\u0014(\bäïR\u009f\u009b1h\u000b ¡Gs\u009b^U\u0086}\u0086!ÃÎàÆ=´\u0090Î\u0099\u008d?oZ=¡L«ßiþµhÎõOÀÛÞ\u0085Ã\u0084\n\u0004\u0087Ñ³q\u0086ñ¯·æ\u0010VÝO\u0004°å\u00156^µ2~apç¤å]Whpë\u000fõ\u008a\\\u009f¬\u001bfõ\u0012@Á\u00ad¬\u0012\u0006A\u0090Æß\tY\u0017\u0093\u001eHï3\u008d\u008cTEÜåÍÚ\u0086\u0086NL}cpéD©e\u001f\u008e8\u001ffÞtê\f²-\u000b\u0081D\u009fÌAÁ«xÑXßòôh\u0093ã\u0099YçÒ_Ú\u0093\u009e3nÉI¿+à\u0001J\u0090ýÒ7[î\u000e&\u0094\u0006\u009a\u0012¡|\u009f\u0016\u0018mó\u0019\u0092\u0099<Í\u000f\u001aoTíäfôyAÝZ3Ú\u0093s\b\u0091ù®\u0084ÐQsì:£zÔÊR¥´WZ\u0082\u0012Èäø\u0097\u008e%û^Ò\u008döR(<\u0084R{\u001eæ\u0019-Ìkn\f\u008cÆò\u0095\bn¢}7©\u0096\u000fÛbb\u0099Å{?±8hÃÒJ\u009c\u008béó¶@ß\fMG `\\h\u0011æmi;\u000fGÃ\u0093Ò\u0081B°ø6¹aÑ5\u0015òí²ÍÓCO'm@$Ê{þ\u00938\u0090\u0010±r\b\u0094¶\u009fqê¨´\r,*\u0019p\u009ayÞ\u008b´å\u0018UÖÇ'æáE:f]¿=\u0007!\u008cï#fl\u0095ã®\u000eøh\u0011\u008e\u008ee\u00adò*Ý\u0013à\u009d&¬\u0007ñ\u0001ÏD\u0084\u0083q?ÍS\u0002>Ð3M¡*\u0080\u001aæP·\u0093\u0016\f×ãà°\u0080ó*\u001dYÍ\u0001·ô»½z\u001afÉKÍlÊT#øîã¬ó4ÈÑy\u001a\u0091Zi\u0001\u0004B5\u0084Þ\u0017| \u009eýÉÏs\fE\u0010<Õýã\u008c\u008d¿\u0001Á:·Wßd\feS\u0018\u0097\t\u001f\fq\u000bq-Î\u0095EOVv\u0084¬\u0001\u0099Q\u0007\u0081¨Û°zé\u0012\r&00|´TBºðJ'¤ÃÂ§ ö\u007f^¶k\u0010Q\u0001éÃ+áß±ï}X'¬-7Í\u0097\u001dÜ\u0091\u0081öãÙ>\u0093Õ1\u0019¬8?\u001a¨ì¢?K©àÌüý\u009bCÖ\u001fr²µñê\u000f\u008fkbÏT\u0018Ðò\"\u001aÇû"
         .getBytes("ISO-8859-1");

      int var56;
      do {
         IIl[var22] = ((var10002[var25] & 255) << 24 | (var10002[var25 + 1] & 255) << 16 | (var10002[var25 + 2] & 255) << 8 | var10002[var25 + 3] & 255)
            ^ -617374799;
         var22 += 1;
         var56 = var25 + 4;
         var25 += 4;
      } while (var56 < var10002.length);

      String[] var5 = new String[4];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lII(-717420176, var17 ^ -182698280)).length();
      int var1 = 4;
      int var19 = -1;

      label100:
      while (true) {
         var22 = Ill(1848005062, var17 ^ -1979508195);
         String var28 = var2.substring(++var19, var19 + var1);
         byte var40 = -1;

         while (true) {
            label95: {
               char[] var58 = var28.toCharArray();
               int var70 = var58.length;
               int var6 = 0;
               var56 = var22;
               var45 = var58;
               var25 = var70;
               char[] var82;
               int var89;
               if (var70 <= 1) {
                  var82 = var58;
                  var70 = var22;
                  var89 = var6;
               } else {
                  var56 = var22;
                  var25 = var70;
                  if (var70 <= var6) {
                     break label95;
                  }

                  var82 = var58;
                  var70 = var22;
                  var89 = var6;
               }

               while (true) {
                  var82[var89] = (char)(var82[var89] ^ var70 ^ switch (var6 % Ill(1848005059, var17 ^ -737386288)) {
                     case 0 -> Ill(1848005058, var17 ^ 927539734);
                     case 1 -> Ill(1848005085, var17 ^ -2145560153);
                     case 2 -> Ill(1848005084, var17 ^ -1426083751);
                     case 3 -> Ill(1848005087, var17 ^ -921622316);
                     case 4 -> Ill(1848005086, var17 ^ -208953322);
                     case 5 -> Ill(1848005081, var17 ^ 687346186);
                     default -> Ill(1848005080, var17 ^ 1593443634);
                  });
                  var6++;
                  if (var56 == 0) {
                     var89 = var56;
                     var82 = var45;
                     var70 = var56;
                  } else {
                     if (var25 <= var6) {
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
                  if ((var19 += var1) >= var4) {
                     ll = var5;
                     lI = new String[4];
                     Il = new IlIlIllII();
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var63;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label100;
                  }

                  var4 = (var2 = lII(-717420175, var17 ^ -1464907108)).length();
                  var1 = Ill(1848005057, var17 ^ -281676805);
                  var19 = -1;
            }

            var22 = Ill(1848005056, var17 ^ -791085627);
            var28 = var2.substring(++var19, var19 + var1);
            var40 = 0;
         }
      }
   }

   public synchronized void IIl(IlIIIIIIl var1, boolean var2) {
      int var5 = -750220001;
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null && var1 != null && var1.IIlIIll()) {
         if (var3.II().IIIlll().contains(var1)) {
            IIIlllIIl var4 = var3.II().lllII(IIIlllIIl.class);
            if (var4 != null && var4.IIIIlIl()) {
               if (var4.lIII()) {
                  this.I(
                     var2 ? IIIIllI.l : IIIIllI.II,
                     IlIIllIII.Ill(II(Ill(1848005070, var5 ^ -1029817439), Ill(1848005065, var5 ^ 1185609097))),
                     var1.IIllIIl()
                        .IIll(IlIIllIII.Ill(II(Ill(1848005064, var5 ^ -801707690), Ill(1848005067, var5 ^ 1739928476))))
                        .IIll(
                           var2
                              ? IlIIllIII.Ill(II(Ill(1848005066, var5 ^ -2021504789), Ill(1848005061, var5 ^ -453371470)))
                              : IlIIllIII.Ill(II(Ill(1848005060, var5 ^ 1265251482), Ill(1848005063, var5 ^ -2072077349)))
                        ),
                     var4.IlllI()
                  );
               }
            }
         }
      }
   }

   public synchronized void IlI(IIIIllI var1, String var2, String var3, long var4) {
      this.I(var1, IlIIllIII.lII(var2 == null ? "" : var2), IlIIllIII.lII(var3 == null ? "" : var3), var4);
   }
}
