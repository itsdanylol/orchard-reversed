package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3298;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
final class IIIIlIlI {
   private static final Object[] IIlI;
   private static final IIIlIlIl I;
   private static final Map<Long, WeakReference<IlIIllIl>> II;
   private static final IIIlIlIl Il;
   private static volatile llIIll lI;
   private static final String[] l;
   private static final IIIlIlIl ll;
   private static final String[] III;
   private static final IIIlIlIl IIl;
   private static volatile IlIIllIl IlI;
   private static final int[] IIII;
   private static final IIIlIlIl Ill;
   private static final double lII = 11.0;
   private static final String[] IIIl;
   private static final double lIl = 9.0;
   private static final Map<llIIll, WeakReference<IlIIllIl>> llI;
   private static final float lll = 12.0F;

   private static IlIIllIl I(llIIll var0) {
      return l(var0.ll());
   }

   private static IlIIllIl l(IIIlIlIl var0) {
      int var34 = 185951072;
      class_2960 var2 = IIll(var0, Il);
      String[] var10000 = IIllllIl.IIIIl();
      class_2960 var3 = IIll(var0, ll);
      String[] var1 = var10000;

      try {
         InputStream var4 = null;

         try {
            label116: {
               class_310 var5 = class_310.method_1551();

               try {
                  if (var5 == null || var5.method_1478() == null) {
                     break label116;
                  }
               } catch (Exception var40) {
                  throw lIl(var40);
               }

               class_3298 var6 = (class_3298)var5.method_1478().method_14486(var2).orElse(null);
               if (var6 != null) {
                  var4 = var6.method_14482();
               }
            }
         } catch (Exception var41) {
         }

         if (var4 == null) {
            String var47 = IlIIllIII.lI(IIl(Illl(1503551864, var34 ^ -656666432), Illl(1503551865, var34 ^ 1776640149)));
            String var10001 = var2.method_12836();
            String var10002 = IlIIllIII.lI(IIl(Illl(1503551866, var34 ^ 1231843693), Illl(1503551867, var34 ^ -43031458)));
            String var33 = var2.method_12832();
            String var32 = var10002;
            String var31 = var10001;
            String var30 = var47;
            String var43 = var30 + var31 + var32 + var33;
            var4 = IIIIlIlI.class.getClassLoader().getResourceAsStream(var43);
         }

         if (var4 == null) {
            return null;
         } else {
            IlIIllIl var46;
            try (InputStreamReader var44 = new InputStreamReader(var4, StandardCharsets.UTF_8)) {
               JsonObject var45 = JsonParser.parseReader(var44).getAsJsonObject();
               JsonObject var7 = var45.getAsJsonObject(IlIIllIII.lI(IIl(Illl(1503551868, var34 ^ -762062825), Illl(1503551869, var34 ^ 940614042))));
               JsonObject var8 = var45.getAsJsonObject(IlIIllIII.lI(IIl(Illl(1503551870, var34 ^ -2127449582), Illl(1503551871, var34 ^ -629650932))));
               double var9 = var7.get(IlIIllIII.lI(IIl(Illl(1503551856, var34 ^ 1587631181), Illl(1503551857, var34 ^ -37796777)))).getAsDouble();
               double var11 = var7.get(IlIIllIII.lI(IIl(Illl(1503551858, var34 ^ 1456259625), Illl(1503551859, var34 ^ -688516033)))).getAsDouble();

               label70: {
                  try {
                     if (var7.has(Ill.llIl())) {
                        var48 = var7.get(Ill.llIl()).getAsFloat();
                        break label70;
                     }
                  } catch (Exception var36) {
                     throw lIl(var36);
                  }

                  var48 = 12.0F;
               }

               float var13 = var48;
               double var14 = var8.get(IlIIllIII.lI(IIl(Illl(1503551860, var34 ^ 1241915777), Illl(1503551861, var34 ^ 1089465132)))).getAsDouble();
               double var16 = var8.get(IlIIllIII.lI(IIl(Illl(1503551862, var34 ^ 1459691426), Illl(1503551863, var34 ^ -2144246149)))).getAsDouble();
               double var18 = var8.get(IlIIllIII.lI(IIl(Illl(1503551848, var34 ^ 2047942588), Illl(1503551849, var34 ^ -864426145)))).getAsDouble();
               HashMap var20 = new HashMap();

               for (JsonElement var23 : var45.getAsJsonArray(IlIIllIII.lI(IIl(Illl(1503551850, var34 ^ -1166109532), Illl(1503551851, var34 ^ -2053497104))))) {
                  JsonObject var24 = var23.getAsJsonObject();
                  int var25 = var24.get(IlIIllIII.lI(IIl(Illl(1503551852, var34 ^ 2017522517), Illl(1503551853, var34 ^ -692107892)))).getAsInt();
                  double var26 = var24.get(IlIIllIII.lI(IIl(Illl(1503551854, var34 ^ 459703778), Illl(1503551855, var34 ^ 553497615)))).getAsDouble();

                  label91: {
                     try {
                        if (var24.has(IlIIllIII.lI(IIl(Illl(1503551840, var34 ^ -55896911), Illl(1503551841, var34 ^ 450984311))))) {
                           var49 = var24.getAsJsonObject(IlIIllIII.lI(IIl(Illl(1503551842, var34 ^ 2040130288), Illl(1503551843, var34 ^ -391252710))));
                           break label91;
                        }
                     } catch (Exception var38) {
                        throw lIl(var38);
                     }

                     var49 = null;
                  }

                  JsonObject var28 = var49;

                  label83: {
                     try {
                        if (var24.has(IlIIllIII.lI(IIl(Illl(1503551844, var34 ^ 1514132117), Illl(1503551845, var34 ^ -34874344))))) {
                           var50 = var24.getAsJsonObject(IlIIllIII.lI(IIl(Illl(1503551846, var34 ^ 1694208029), Illl(1503551847, var34 ^ 642732253))));
                           break label83;
                        }
                     } catch (Exception var37) {
                        throw lIl(var37);
                     }

                     var50 = null;
                  }

                  JsonObject var29 = var50;
                  var20.put(var25, llI(var25, var26, var28, var29));
                  if (var1 != null) {
                     break;
                  }
               }

               var46 = new IlIIllIl(var3, var9, var11, var13, var14, var16, var18, var20, (Illlll)var20.get(Illl(1503551832, var34 ^ 1056537321)));
            }

            return var46;
         }
      } catch (Exception var42) {
         return null;
      }
   }

   private static String lIII(int var0, int var1) {
      int var3 = var0 ^ 1911571717;
      char[] var4 = IIIl[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IIlI[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IIlI[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1556001342;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 49;
            case 1 -> 173;
            case 2 -> 232;
            case 3 -> 20;
            case 4 -> 35;
            case 5 -> 128;
            case 6 -> 252;
            case 7 -> 139;
            case 8 -> 175;
            case 9 -> 193;
            case 10 -> 49;
            case 11 -> 200;
            case 12 -> 46;
            case 13 -> 42;
            case 14 -> 136;
            case 15 -> 245;
            case 16 -> 211;
            case 17 -> 8;
            case 18 -> 221;
            case 19 -> 208;
            case 20 -> 177;
            case 21 -> 120;
            case 22 -> 156;
            case 23 -> 143;
            case 24 -> 233;
            case 25 -> 93;
            case 26 -> 148;
            case 27 -> 169;
            case 28 -> 165;
            case 29 -> 97;
            case 30 -> 218;
            case 31 -> 129;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   static boolean II(class_332 var0, String var1, double var2, double var4, int var6, boolean var7, boolean var8) {
      IlIIllIl var9 = IIII();
      return ll(var9, var0, var1, var2, var4, var6, var7, var8);
   }

   static int Il(IIIlIlIl var0, String var1) {
      return IllI(Ill(var0), var1);
   }

   private static double lI(IlIIllIl var0) {
      double var1 = lIIII.lll(11.0, var0.II, var0.IlI, var0.l);
      return (9.0 - var1) * 0.5;
   }

   private static boolean ll(IlIIllIl var0, class_332 var1, String var2, double var3, double var5, int var7, boolean var8, boolean var9) {
      if (var0 == null) {
         return false;
      } else {
         String var10 = var2 == null ? "" : var2;
         if (var8) {
            int var11 = (var7 >>> Illl(1503551833, -47449310 ^ -1584511008) & Illl(1503551834, -47449310 ^ -624556084))
               << Illl(1503551835, -47449310 ^ -548102912);
            lII(var0, var1, var10, var3 + 1.0, var5 + 1.0 + lI(var0), var11, false);
         }

         lII(var0, var1, var10, var3, var5 + lI(var0), var7, var9);
         return true;
      }
   }

   static boolean III() {
      return !IIIlIIII.lIlII().ll().lllI();
   }

   private static String IIl(int var0, int var1) {
      int var9 = -355968610;
      int var2 = (var0 ^ Illl(1503551812, var9 ^ -1660495763)) & Illl(1503551813, var9 ^ 780007122);
      if (l[var2] == null) {
         char[] var3 = III[var2].toCharArray();

         int var4 = switch (var3[0] & Illl(1503551814, var9 ^ 81739278)) {
            case 0 -> Illl(1503551815, var9 ^ 2057761202);
            case 1 -> Illl(1503551800, var9 ^ 1664209388);
            case 2 -> Illl(1503551801, var9 ^ 1148716761);
            case 3 -> Illl(1503551802, var9 ^ -89848189);
            case 4 -> Illl(1503551803, var9 ^ -630766960);
            case 5 -> Illl(1503551804, var9 ^ 885718890);
            case 6 -> Illl(1503551805, var9 ^ -1503403549);
            case 7 -> Illl(1503551806, var9 ^ -382678132);
            case 8 -> Illl(1503551807, var9 ^ 1591199746);
            case 9 -> Illl(1503551792, var9 ^ -1895855751);
            case 10 -> Illl(1503551793, var9 ^ 1303556458);
            case 11 -> Illl(1503551794, var9 ^ 1968993779);
            case 12 -> Illl(1503551795, var9 ^ -717187391);
            case 13 -> Illl(1503551796, var9 ^ -1019231346);
            case 14 -> 0;
            case 15 -> Illl(1503551797, var9 ^ -851749844);
            case 16 -> Illl(1503551798, var9 ^ 1734150398);
            case 17 -> Illl(1503551799, var9 ^ 665223981);
            case 18 -> 1;
            case 19 -> Illl(1503551784, var9 ^ -671984593);
            case 20 -> Illl(1503551785, var9 ^ -2072713247);
            case 21 -> Illl(1503551786, var9 ^ -118831011);
            case 22 -> Illl(1503551787, var9 ^ 2086835449);
            case 23 -> Illl(1503551788, var9 ^ 1649005142);
            case 24 -> Illl(1503551789, var9 ^ 511420812);
            case 25 -> Illl(1503551790, var9 ^ -946761191);
            case 26 -> Illl(1503551791, var9 ^ 765970888);
            case 27 -> Illl(1503551776, var9 ^ 1419419639);
            case 28 -> Illl(1503551777, var9 ^ 1270384554);
            case 29 -> Illl(1503551778, var9 ^ 1557987983);
            case 30 -> Illl(1503551779, var9 ^ 866770784);
            case 31 -> Illl(1503551780, var9 ^ -1758476521);
            case 32 -> Illl(1503551781, var9 ^ -978926997);
            case 33 -> Illl(1503551782, var9 ^ 1616553068);
            case 34 -> Illl(1503551783, var9 ^ 1785367805);
            case 35 -> Illl(1503551768, var9 ^ -496544269);
            case 36 -> Illl(1503551769, var9 ^ 479640590);
            case 37 -> Illl(1503551770, var9 ^ 1109029182);
            case 38 -> Illl(1503551771, var9 ^ -1916377511);
            case 39 -> Illl(1503551772, var9 ^ -1884938020);
            case 40 -> Illl(1503551773, var9 ^ 1803189181);
            case 41 -> Illl(1503551774, var9 ^ 1186684686);
            case 42 -> Illl(1503551775, var9 ^ -446696528);
            case 43 -> 5;
            case 44 -> Illl(1503551760, var9 ^ -710542010);
            case 45 -> Illl(1503551761, var9 ^ 108899120);
            case 46 -> Illl(1503551762, var9 ^ 323071897);
            case 47 -> Illl(1503551763, var9 ^ -1260428584);
            case 48 -> Illl(1503551764, var9 ^ -373096860);
            case 49 -> Illl(1503551765, var9 ^ 1240408983);
            case 50 -> Illl(1503551766, var9 ^ 28989483);
            case 51 -> Illl(1503551767, var9 ^ 1352834204);
            case 52 -> Illl(1503551752, var9 ^ -573306338);
            case 53 -> Illl(1503551753, var9 ^ -490968613);
            case 54 -> Illl(1503551754, var9 ^ -335840308);
            case 55 -> Illl(1503551755, var9 ^ -2108478473);
            case 56 -> Illl(1503551756, var9 ^ -2056764170);
            case 57 -> Illl(1503551757, var9 ^ -749649983);
            case 58 -> Illl(1503551758, var9 ^ -526000289);
            case 59 -> Illl(1503551759, var9 ^ -1233896902);
            case 60 -> Illl(1503551744, var9 ^ -919325319);
            case 61 -> Illl(1503551745, var9 ^ 883461236);
            case 62 -> Illl(1503551746, var9 ^ -1520017628);
            case 63 -> Illl(1503551747, var9 ^ -405597788);
            case 64 -> Illl(1503551748, var9 ^ -606167607);
            case 65 -> Illl(1503551749, var9 ^ -763886026);
            case 66 -> Illl(1503551750, var9 ^ -1662909249);
            case 67 -> Illl(1503551751, var9 ^ -1369280208);
            case 68 -> 4;
            case 69 -> Illl(1503551992, var9 ^ -35225158);
            case 70 -> Illl(1503551993, var9 ^ 1254340766);
            case 71 -> Illl(1503551994, var9 ^ 129279270);
            case 72 -> Illl(1503551995, var9 ^ -922957964);
            case 73 -> Illl(1503551996, var9 ^ -2146854219);
            case 74 -> Illl(1503551997, var9 ^ -1100807232);
            case 75 -> Illl(1503551998, var9 ^ 906108261);
            case 76 -> Illl(1503551999, var9 ^ 419028911);
            case 77 -> Illl(1503551984, var9 ^ 1609544428);
            case 78 -> Illl(1503551985, var9 ^ 463704126);
            case 79 -> Illl(1503551986, var9 ^ -1429970022);
            case 80 -> Illl(1503551987, var9 ^ -838959503);
            case 81 -> Illl(1503551988, var9 ^ 870537059);
            case 82 -> Illl(1503551989, var9 ^ -2086177897);
            case 83 -> Illl(1503551990, var9 ^ 984411265);
            case 84 -> Illl(1503551991, var9 ^ -1910167310);
            case 85 -> 2;
            case 86 -> Illl(1503551976, var9 ^ -747223441);
            case 87 -> Illl(1503551977, var9 ^ 640084028);
            case 88 -> Illl(1503551978, var9 ^ 943594834);
            case 89 -> Illl(1503551979, var9 ^ 1057732890);
            case 90 -> 3;
            case 91 -> Illl(1503551980, var9 ^ 354284926);
            case 92 -> Illl(1503551981, var9 ^ 1679702311);
            case 93 -> Illl(1503551982, var9 ^ -52411217);
            case 94 -> Illl(1503551983, var9 ^ -1404715863);
            case 95 -> Illl(1503551968, var9 ^ -1404189704);
            case 96 -> Illl(1503551969, var9 ^ -280520802);
            case 97 -> Illl(1503551970, var9 ^ 111937834);
            case 98 -> Illl(1503551971, var9 ^ -630506213);
            case 99 -> Illl(1503551972, var9 ^ 1984490987);
            case 100 -> Illl(1503551973, var9 ^ -821253898);
            case 101 -> Illl(1503551974, var9 ^ -1944684710);
            case 102 -> Illl(1503551975, var9 ^ -814710438);
            case 103 -> Illl(1503551960, var9 ^ 1115606686);
            case 104 -> Illl(1503551961, var9 ^ -12028066);
            case 105 -> Illl(1503551962, var9 ^ 726271672);
            case 106 -> Illl(1503551963, var9 ^ 200071215);
            case 107 -> Illl(1503551964, var9 ^ 511159170);
            case 108 -> Illl(1503551965, var9 ^ 1456421794);
            case 109 -> Illl(1503551966, var9 ^ -597350616);
            case 110 -> Illl(1503551967, var9 ^ 1291182111);
            case 111 -> Illl(1503551952, var9 ^ -375546642);
            case 112 -> Illl(1503551953, var9 ^ 969786237);
            case 113 -> Illl(1503551954, var9 ^ 196816810);
            case 114 -> Illl(1503551955, var9 ^ -758597901);
            case 115 -> Illl(1503551956, var9 ^ -375781863);
            case 116 -> Illl(1503551957, var9 ^ -1440533839);
            case 117 -> Illl(1503551958, var9 ^ 515302675);
            case 118 -> Illl(1503551959, var9 ^ 579467069);
            case 119 -> Illl(1503551944, var9 ^ 1522815995);
            case 120 -> Illl(1503551945, var9 ^ -573756292);
            case 121 -> Illl(1503551946, var9 ^ 1947754882);
            case 122 -> Illl(1503551947, var9 ^ 565594508);
            case 123 -> Illl(1503551948, var9 ^ -667295483);
            case 124 -> Illl(1503551949, var9 ^ -1515298331);
            case 125 -> Illl(1503551950, var9 ^ -276009143);
            case 126 -> Illl(1503551951, var9 ^ -480554954);
            case 127 -> Illl(1503551936, var9 ^ 1990601199);
            case 128 -> Illl(1503551937, var9 ^ -1141566221);
            case 129 -> Illl(1503551938, var9 ^ -1901811304);
            case 130 -> Illl(1503551939, var9 ^ -1868803822);
            case 131 -> Illl(1503551940, var9 ^ 1527316979);
            case 132 -> Illl(1503551941, var9 ^ -1776968845);
            case 133 -> Illl(1503551942, var9 ^ -167361515);
            case 134 -> Illl(1503551943, var9 ^ -725698562);
            case 135 -> Illl(1503551928, var9 ^ 562930553);
            case 136 -> Illl(1503551929, var9 ^ -385395202);
            case 137 -> Illl(1503551930, var9 ^ -452797289);
            case 138 -> Illl(1503551931, var9 ^ -1126078378);
            case 139 -> Illl(1503551932, var9 ^ -1992135797);
            case 140 -> Illl(1503551933, var9 ^ -1621696677);
            case 141 -> Illl(1503551934, var9 ^ 1672868403);
            case 142 -> Illl(1503551935, var9 ^ -2070043375);
            case 143 -> Illl(1503551920, var9 ^ -1003485917);
            case 144 -> Illl(1503551921, var9 ^ -39518152);
            case 145 -> Illl(1503551922, var9 ^ 1731175314);
            case 146 -> Illl(1503551923, var9 ^ -822913409);
            case 147 -> Illl(1503551924, var9 ^ -1435402999);
            case 148 -> Illl(1503551925, var9 ^ -595523360);
            case 149 -> Illl(1503551926, var9 ^ 1222180704);
            case 150 -> Illl(1503551927, var9 ^ -1622497831);
            case 151 -> Illl(1503551912, var9 ^ 272759364);
            case 152 -> Illl(1503551913, var9 ^ 1149785013);
            case 153 -> Illl(1503551914, var9 ^ 218004642);
            case 154 -> Illl(1503551915, var9 ^ -310932702);
            case 155 -> Illl(1503551916, var9 ^ 597463324);
            case 156 -> Illl(1503551917, var9 ^ 945342801);
            case 157 -> Illl(1503551918, var9 ^ -614258937);
            case 158 -> Illl(1503551919, var9 ^ 551053863);
            case 159 -> Illl(1503551904, var9 ^ 1563218346);
            case 160 -> Illl(1503551905, var9 ^ -410247376);
            case 161 -> Illl(1503551906, var9 ^ 1461485370);
            case 162 -> Illl(1503551907, var9 ^ 265701161);
            case 163 -> Illl(1503551908, var9 ^ 1944620999);
            case 164 -> Illl(1503551909, var9 ^ 1694324368);
            case 165 -> Illl(1503551910, var9 ^ 81259414);
            case 166 -> Illl(1503551911, var9 ^ 770721408);
            case 167 -> Illl(1503551896, var9 ^ -1359150308);
            case 168 -> Illl(1503551897, var9 ^ -600092636);
            case 169 -> Illl(1503551898, var9 ^ 1747776387);
            case 170 -> Illl(1503551899, var9 ^ -1461592851);
            case 171 -> Illl(1503551900, var9 ^ -1679610081);
            case 172 -> Illl(1503551901, var9 ^ 556678068);
            case 173 -> Illl(1503551902, var9 ^ 1031658588);
            case 174 -> Illl(1503551903, var9 ^ -668509728);
            case 175 -> Illl(1503551888, var9 ^ -1963571480);
            case 176 -> Illl(1503551889, var9 ^ 1228148410);
            case 177 -> Illl(1503551890, var9 ^ -1519355215);
            case 178 -> Illl(1503551891, var9 ^ 645485402);
            case 179 -> Illl(1503551892, var9 ^ 1717560322);
            case 180 -> Illl(1503551893, var9 ^ 1778992463);
            case 181 -> Illl(1503551894, var9 ^ -641715348);
            case 182 -> Illl(1503551895, var9 ^ 1523771007);
            case 183 -> Illl(1503551880, var9 ^ -1804555637);
            case 184 -> Illl(1503551881, var9 ^ -274922052);
            case 185 -> Illl(1503551882, var9 ^ -1218027803);
            case 186 -> Illl(1503551883, var9 ^ 436487124);
            case 187 -> Illl(1503551884, var9 ^ -507313612);
            case 188 -> Illl(1503551885, var9 ^ 1029188269);
            case 189 -> Illl(1503551886, var9 ^ 1521557998);
            case 190 -> Illl(1503551887, var9 ^ 132783020);
            case 191 -> Illl(1503551872, var9 ^ 1961001888);
            case 192 -> Illl(1503551873, var9 ^ -1117298266);
            case 193 -> Illl(1503551874, var9 ^ -287049762);
            case 194 -> Illl(1503551875, var9 ^ -1631704822);
            case 195 -> Illl(1503551876, var9 ^ -777561709);
            case 196 -> Illl(1503551877, var9 ^ 129356313);
            case 197 -> Illl(1503551878, var9 ^ -561818796);
            case 198 -> Illl(1503551879, var9 ^ -322469538);
            case 199 -> Illl(1503551608, var9 ^ -790951469);
            case 200 -> Illl(1503551609, var9 ^ 1464724401);
            case 201 -> Illl(1503551610, var9 ^ -1023397357);
            case 202 -> Illl(1503551611, var9 ^ -166104765);
            case 203 -> Illl(1503551612, var9 ^ 1411427193);
            case 204 -> Illl(1503551613, var9 ^ 1665956528);
            case 205 -> Illl(1503551614, var9 ^ -1719902053);
            case 206 -> Illl(1503551615, var9 ^ -1509321881);
            case 207 -> Illl(1503551600, var9 ^ -1065174780);
            case 208 -> Illl(1503551601, var9 ^ 1873080572);
            case 209 -> Illl(1503551602, var9 ^ 1029755403);
            case 210 -> Illl(1503551603, var9 ^ 501898662);
            case 211 -> Illl(1503551604, var9 ^ -885209002);
            case 212 -> Illl(1503551605, var9 ^ 1115411426);
            case 213 -> Illl(1503551606, var9 ^ 1796332714);
            case 214 -> Illl(1503551607, var9 ^ 424331170);
            case 215 -> Illl(1503551592, var9 ^ -1556628360);
            case 216 -> Illl(1503551593, var9 ^ 1129304864);
            case 217 -> Illl(1503551594, var9 ^ 1916610261);
            case 218 -> Illl(1503551595, var9 ^ -1581075339);
            case 219 -> Illl(1503551596, var9 ^ -343238547);
            case 220 -> Illl(1503551597, var9 ^ -1010294334);
            case 221 -> Illl(1503551598, var9 ^ 1070422986);
            case 222 -> Illl(1503551599, var9 ^ -1343811108);
            case 223 -> Illl(1503551584, var9 ^ -995897164);
            case 224 -> Illl(1503551585, var9 ^ 1693061347);
            case 225 -> Illl(1503551586, var9 ^ -1594809358);
            case 226 -> Illl(1503551587, var9 ^ -1403475925);
            case 227 -> Illl(1503551588, var9 ^ -303746461);
            case 228 -> Illl(1503551589, var9 ^ -1915125635);
            case 229 -> Illl(1503551590, var9 ^ 736509376);
            case 230 -> Illl(1503551591, var9 ^ -685908050);
            case 231 -> Illl(1503551576, var9 ^ 819215528);
            case 232 -> Illl(1503551577, var9 ^ -1279997065);
            case 233 -> Illl(1503551578, var9 ^ 1657736692);
            case 234 -> Illl(1503551579, var9 ^ 1704644230);
            case 235 -> Illl(1503551580, var9 ^ 1300637386);
            case 236 -> Illl(1503551581, var9 ^ -1155188086);
            case 237 -> Illl(1503551582, var9 ^ -502584439);
            case 238 -> Illl(1503551583, var9 ^ 1559736427);
            case 239 -> Illl(1503551568, var9 ^ 88313131);
            case 240 -> Illl(1503551569, var9 ^ -1073812863);
            case 241 -> Illl(1503551570, var9 ^ 728680708);
            case 242 -> Illl(1503551571, var9 ^ 864471847);
            case 243 -> Illl(1503551572, var9 ^ 808262363);
            case 244 -> Illl(1503551573, var9 ^ 871249655);
            case 245 -> Illl(1503551574, var9 ^ -841239680);
            case 246 -> Illl(1503551575, var9 ^ -1468647576);
            case 247 -> Illl(1503551560, var9 ^ -2094916145);
            case 248 -> Illl(1503551561, var9 ^ 177605408);
            case 249 -> Illl(1503551562, var9 ^ -1434133657);
            case 250 -> Illl(1503551563, var9 ^ -1938297855);
            case 251 -> Illl(1503551564, var9 ^ 1952077623);
            case 252 -> Illl(1503551565, var9 ^ 602204889);
            case 253 -> Illl(1503551566, var9 ^ 2128502916);
            case 254 -> Illl(1503551567, var9 ^ 706864395);
            default -> Illl(1503551552, var9 ^ -2025195235);
         };
         int var5 = (var1 & Illl(1503551553, var9 ^ -1117890966)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & Illl(1503551554, var9 ^ -1693679474)) >>> Illl(1503551555, var9 ^ -688906218)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & Illl(1503551556, var9 ^ -69589275);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & Illl(1503551557, var9 ^ -716634241);
            }
         }

         l[var2] = new String(var3).intern();
      }

      return l[var2];
   }

   static boolean IlI(IIIlIlIl var0, class_332 var1, String var2, double var3, double var5, int var7, boolean var8, boolean var9) {
      return ll(Ill(var0), var1, var2, var3, var5, var7, var8, var9);
   }

   private static IlIIllIl Ill(IIIlIlIl var0) {
      if (var0 != null && !var0.lllI()) {
         long var1 = var0.I();
         synchronized (II) {
            WeakReference var4 = II.get(var1);
            IlIIllIl var5 = var4 == null ? null : (IlIIllIl)var4.get();
            if (var5 != null) {
               return var5;
            } else {
               IlIIllIl var6 = l(var0);
               if (var6 == null) {
                  II.remove(var1);
                  return null;
               } else {
                  II.put(var1, new WeakReference<>(var6));
                  return var6;
               }
            }
         }
      } else {
         return null;
      }
   }

   private static void lII(IlIIllIl var0, class_332 var1, String var2, double var3, double var5, int var7, boolean var8) {
      String[] var9 = IIllllIl.IIIIl();
      if (var1 != null && !var2.isEmpty() && (var7 >>> Illl(1503551558, 370730652 ^ -1561839556) & Illl(1503551559, 370730652 ^ -468992390)) > 0) {
         double var10 = var3;
         double var12 = var5 + lIIII.IlII(11.0, var0.II, var0.IlI, var0.l);
         int var14 = 0;
         int var15 = 0;

         while (var15 < var2.length()) {
            int var16 = var2.codePointAt(var15);
            Illlll var17 = var0.lI.getOrDefault(var16, var0.ll);
            if (var17 != null) {
               if (var17.III()) {
                  int var18 = var8
                     ? IlIIlllIl.lIIIl(
                        var7 >>> Illl(1503551544, 370730652 ^ -2032213049) & Illl(1503551545, 370730652 ^ -1589954959),
                        (int)Math.round(var3),
                        (int)Math.round(var5),
                        var14
                     )
                     : var7;
                  double var19 = var10 + var17.I * 11.0;
                  double var21 = var12 - var17.Ill * 11.0;
                  double var23 = (var17.II - var17.I) * 11.0;
                  double var25 = (var17.Ill - var17.l) * 11.0;
                  float var27 = (float)(var17.III / var0.III);
                  float var28 = (float)(1.0 - var17.IIl / var0.I);
                  float var29 = (float)(var17.Il / var0.III);
                  float var30 = (float)(1.0 - var17.ll / var0.I);
                  IlIIlllIl.llIlII(var1, var0.Il, var19, var21, var23, var25, var27, var28, var29, var30, var18, var0.IIl);
               }

               var10 += var17.IlI * 11.0;
            }

            var15 += Character.charCount(var16);
            var14++;
            if (var9 != null) {
               break;
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var24 = -1036933886;
      byte var20 = -1;
      char[] var15 = "䫼䯇".toCharArray();
      String var14 = "렜롭롈뢠뢼렲레렲뢥렾뢶료렄룫뢲롟렅롦뢞렘뢴룳룱룜뢢룾룶롒뢽룁롚렾뢅렍론뢸롪룣뢬룑뢘렵뢎렗렺뢏루롙롽룪롘룍렃뢇룖룠롶뢊렸렉롒룦롿뢱룣롪뢘롤렟룵롊레렘뢓룹롃롐뢤롞뢸뢅렎뢨롰렻룗롵렪롄렻롊뢓룵룏룓룙록뢑뢝뢇롬렼렪렿룤렛룟롐룾룋렅뢰롊룤룗렠뢺뢦뢝룦룺뢋룜렝뢧룐뢩롫롣룎롿룸룀뢲렔뢒렗롶뢮롏룕롱렯뢨롹롱렊뢟렏뢾뢣뢂로뢬뢻롾뢳롘렫렄렵롿렃롦룫료롖렐롪뢶뢶렆뢛롻렡룛뢅룴렭렋룖렚뢊롢뢕뢊롆뢗뢦뢉령룧뢷뢇렒룖뢞룛뢥뢟룻롭룾렁룄룑뢍렳룙렸롢룦롗뢍뢹뢒뢈롐롼룸롛렏루렳뢝뢞룭롖뢦룏렿롺령뢠롷렾롑렖롁롰렞롭뢁롴렃뢿룣뢱롵렽룱롸롯룦령뢆룂롧롋령롡롛롎롛렭룺력렌뢲뢐렚롲룤룯렔렛룉롯렌렟롗룳뢑룐뢵뢔룶로뢀롤룼료뢡렐\ueb6e\uebc2\uebce\ueb82\ueb7a\ueb95\ueb6e\ueb18\ueb9d\uebd6\ueb1b\ueb15\ueb5c\uebb2\ueb83\ueb18\ueb26\ueb83\ueb67\ueb9e\uebbc\ueb0f\ueb44\ueb41\ueb89\uebe3\ueb0d\ueb21\uebd5";
      short var13 = 19418;
      String[] var16 = new String[var15.length];

      while (true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            IIIl = var16;
            IIlI = new Object[var16.length];
            int var9 = -1622761172;
            byte[] var7 = "êï`\u0014[×}h{_\u0005\u008bÏ_Úçà ¬ð\n#ÖÞ³\u0002ÆóèHÔ;l\u0092$\u0085Ï\u008c\u0017\u001adÿ²óäÄ/sx5UorÜ¢\fe2or²\u0002\u0011\u0080H\"oCþIx7\u0088Mäk·©TyJs\u0083\u00adä\u008d\u0085è)Uõ!\u0012Í!oÎ\u0098d{(Ó\u0018«Kª\u009a\u0001Ú\u009de\u009eh\f¢UÏÙþKVÈàÕ\u0014}\u0083\\\fË\u0098Öe\u0082=¹\u001eÊas\u001bXç[Î\u001dK\fH\u0005\n\u00138°_\u001c\u0089\u0007t\u0083Q¾ÖF\u0099.éÐW\u000e(\u001a\u0082Bd\u008d\u0091ëô\u008c\u001a\u001dI6\u0089\u000f\u009dD¦$©\u0094¢÷\u0086\u0011ÇVþ¥\u0019?¥óaYý\u0018M\u008c~\u008f,%C\u0092Oé7\fÓÚ#23\u008dîÖ\u001et7=\u008f{¶\u0098ïj¬ÏNè\u0092t\u0002m/Î×0ú\u0011©I)½°Þ\u0015\u0083\u0097\u0097Þ3)JÞÜ\t\u0088\u009a½ç%'Yu\u008c9à:ß\u0013\u001c\u008d8\u0010\u0098]\u0010M\u0019\u009e]h\u0096¦³\u00ad\u0001\u0006¯Nm\u0010Ð\u001b«\u001eÔ\u008c7´²ÐÌôI[ \u0004\u001d\u008cJW\u009b?×+\u0005\u0010\u008c¯\u008dLW±¦\u000b°Í\u0094q_\u0014~JÆþH\u0011l\u0087uF\u001f\u0098W^B\u008f2Ú\u001aàF\u001b\u0011DÀ\u001fO\u0016I\u001aM³µ||¹\u0085Tó1\u0088\u008d§ÏydÁ\u0091õ©±^)¾\u008c\\IøÇ¸\u0095£\u0090\u0095T\u0087Ì6°+I\u0006J%vÕ\u0092sðÀ®kæg0¦\u0097:-&À\u009a\u0000û@ÒU\u0080\u0019\u0083MD\u0004\u000e;Ò¾1S±H8\u0014£\u001cQ¼óuV\u0087\u009cé\u0000¾çg3J\u001b\u0017e\u009bâ \u001aÛíäçGTmv\u0089\u009bI4<Éî\b1E2\u0001\u0097Þ\u0007O\rÜ\u0015}\u008d©:.\tY7\u0099,`\u008cÔ[}~\u001b\u0013\u001f4SæBsm\u008cÛ¼åíÅLË\u0016\u0007Ø\u008c\u0000j\u008eÈLH®y+§=\u001e\u0011¦µà\f\u008fCPH«\u0006éC4[]ÊðÝ\u0000\u0099\u009e-õÉ0\u0012ëÑÅPìäa×Æò-\u008e·ñá#/\u000f\u009c!\u007fªdé\u007f¢\u0007G<¨O\u009aÕCÑF\t\u0084å^¥§5\"\u001cãp;_ù¯;\u001c\u009fY \u0091\u0091\u0016z,§¯Íø¥Þ×Ø\u0003\u0000ãÍ\u0098s)\u0085 ãä\u000f\u008aÿ\u0015\u009f\u001a8¹:rD\u008aê\"\u001b\u001aØT÷ø\u0001'n¢:uÞõyÌê\u0091ÍY=üñf/ð\u0089+\u008bÙ\u000e\"ô3§÷¹\u0096òY\u0091f\u000bÖ9_vA¹\u0085<c«Ù0´\u0088ù¥Iñ¼h\u001aÍý]Kq\u0087Cs\u0095¸\u0088æÙ\u0093EúC\u0085%é\u009cK\u0007QoOòb{2:è\u0091\u001a6í\u0004±o\u000e°tZ\u00ad¯cL¹\u0007q°Z*\u009fWr}\u0095\u0017ßÝâ.JØ\u0080´À{\u0005\u001d\u001c\u008eªy\u009e¥D\u000fnÐ.\u009b7'ÜL¥}\u0016Ã®\"é\u0097g\u008b\u001dß\u0011¥I>\u0098S÷ðsUáë·\u0010²\b\u008cÿpó7³D\u008eÃ\tm4cÇa\u0084ó§dÜ9\u009f¿ \u0007W¶·\u0012\u008e¿×83Èþ\u001f\u009e¤}\u0012Û\u009d\u000fÔ\u0088\u0005»Ã+ß{\u000e\u0004\u0096H\f÷SòÁã\u008eî\u0092\u0004ý\u000bÈ\u0081\u00adY\u0019\u009eW\u009aÛÖ[v\u009f¢øõ\u0096\u0097¢µ°<t¹æ\u009d¸\n/ëK\u0089=>-G\u009frL<rÝ=d\u0089\u0086ÐÉë\u009bu2,Ú¾î·òÖ\u0089^å\bÔ\u0005Ã\\§\r[\u0092n\u0088¹³=\f/½MQñý\u0002H\u0081\fÔZ\n×\rl\u008bB?(Y-\u00034ÐL\u0084¢.\u0091\u0010ï÷:%ö¨Â\u0087Ïr¥°££dJ\u0093¹\tuæVt\u0013m`ê¼K)¼î\u008f\u000b\u0003Î\u0005\u0084l\u0018Ó\u0011A\u0091\u0094\u0016Í¸þ\u0005÷Ê¥\u001eËpØe\u0004\u0090 \n´¡Òÿ~r-mÚ8eAö\u0010'øÁì\"\u0082¦|\bÈ\u0081\u0017L\t¦·\u0005ÈIs\u001eú\u009e\u007f·qé>\në\u008a^6Y;ø\täÕ\u0004ò\u001a\u009fã;åû`[\u0012Ü± ÔJ¶u\u0017~\u009eiÿyhÊã:1äòk\u008f\u0018iÚÖ¬Tkl\u00113òø\u0081\u0010\u0089ài\u0012ÇãÂÃ1à\u0001ïa\u001e4jk{\u0099î³PÍØßÙyÒNyk\u0002P_\u00985w§µ\u008eÿð\u000b/þ\u00ad1¹ÆùÎ<ÕT¦<\u0006n±\u0093r·\u001cX\u0095\u0005\u001fù\u0019(5ãø\u0006¦Âc\u008d×^ÄË4Äf©á\u0085A\u008e\u0004L\u00131ù)wØ¸ÂÏ®Peè@\u001deWò¡\u0088\u00ad-]\u001c\u009fÔ©µÙ¾\u009d\u009cô¾+\u000f\u0085Ù\u0082d\u0089¶=Ùâ°n\u00adOÃ¶Ô\u0098EË2\u0082×\u001b,O@}0g"
               .getBytes("ISO-8859-1");
            int var8 = var7.length / 4;
            IIII = new int[var8];
            byte var10 = 0;
            int var11 = 0;

            do {
               int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
               var12 ^= var9;
               IIII[var11] = var12;
               var10 += 4;
            } while (++var11 < var8);

            String[] var5 = new String[Illl(1503551836, var24 ^ 889941879)];
            int var3 = 0;
            String var2;
            int var4 = (var2 = lIII(1911571717, var24 ^ 392353024)).length();
            int var1 = Illl(1503551837, var24 ^ -1290588518);
            int var26 = -1;

            label101:
            while (true) {
               int var29 = Illl(1503551838, var24 ^ -1012499627);
               String var10001 = var2.substring(++var26, var26 + var1);
               byte var10002 = -1;

               while (true) {
                  label96: {
                     char[] var45 = var10001.toCharArray();
                     int var10004 = var45.length;
                     int var6 = 0;
                     int var48 = var29;
                     var41 = var45;
                     int var35 = var10004;
                     char[] var57;
                     int var10006;
                     if (var10004 <= 1) {
                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     } else {
                        var48 = var29;
                        var35 = var10004;
                        if (var10004 <= var6) {
                           break label96;
                        }

                        var57 = var45;
                        var10004 = var29;
                        var10006 = var6;
                     }

                     while (true) {
                        var57[var10006] = (char)(var57[var10006] ^ var10004 ^ switch (var6 % Illl(1503551826, var24 ^ -1407709803)) {
                           case 0 -> Illl(1503551827, var24 ^ 2035564763);
                           case 1 -> Illl(1503551828, var24 ^ 1795018900);
                           case 2 -> Illl(1503551829, var24 ^ -519344826);
                           case 3 -> Illl(1503551830, var24 ^ 1914288489);
                           case 4 -> Illl(1503551831, var24 ^ 1563594198);
                           case 5 -> Illl(1503551816, var24 ^ 1507959420);
                           default -> Illl(1503551817, var24 ^ 1010883319);
                        });
                        var6++;
                        if (var48 == 0) {
                           var10006 = var48;
                           var57 = var41;
                           var10004 = var48;
                        } else {
                           if (var35 <= var6) {
                              break;
                           }

                           var57 = var41;
                           var10004 = var48;
                           var10006 = var6;
                        }
                     }
                  }

                  String var50 = new String(var41).intern();
                  switch (var10002) {
                     case 0:
                        var5[var3++] = var50;
                        if ((var26 += var1) >= var4) {
                           III = var5;
                           l = new String[Illl(1503551825, var24 ^ 1647889830)];
                           I = IlIIllIII.Ill(IIl(Illl(1503551818, var24 ^ -500690064), Illl(1503551819, var24 ^ -1706094839)));
                           IIl = IlIIllIII.Ill(IIl(Illl(1503551820, var24 ^ -1231304702), Illl(1503551821, var24 ^ -684465208)));
                           Il = IlIIllIII.Ill(IIl(Illl(1503551822, var24 ^ -1258389067), Illl(1503551823, var24 ^ 684569482)));
                           ll = IlIIllIII.Ill(IIl(Illl(1503551808, var24 ^ -929407891), Illl(1503551809, var24 ^ -446674118)));
                           Ill = IlIIllIII.Ill(IIl(Illl(1503551810, var24 ^ 1953234961), Illl(1503551811, var24 ^ 343857356)));
                           llI = new EnumMap<>(llIIll.class);
                           II = new HashMap<>();
                           return;
                        }

                        var1 = var2.charAt(var26);
                        break;
                     default:
                        var5[var3++] = var50;
                        if ((var26 += var1) < var4) {
                           var1 = var2.charAt(var26);
                           continue label101;
                        }

                        var4 = (var2 = lIII(1911571716, var24 ^ 1143065874)).length();
                        var1 = Illl(1503551839, var24 ^ 1913737460);
                        var26 = -1;
                  }

                  var29 = Illl(1503551824, var24 ^ -1431768549);
                  var10001 = var2.substring(++var26, var26 + var1);
                  var10002 = 0;
               }
            }
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var23 = switch (var22 % 6) {
                  default -> 36;
                  case 1 -> 145;
                  case 2 -> 70;
                  case 3 -> 227;
                  case 4 -> 164;
                  case 5 -> 182;
               };
               var21[var22] = (char)(var21[var22] ^ var23);
            } while (++var22 < var21.length);

            var16[var17] = new String(var21).intern();
            var18 += var19;
         } while (++var17 < var15.length);

         var20 = 0;
      }
   }

   private static Exception lIl(Exception var0) {
      return var0;
   }

   private static Illlll llI(int var0, double var1, JsonObject var3, JsonObject var4) {
      int var5 = -830168564;
      return var3 != null && var4 != null
         ? new Illlll(
            var0,
            var1,
            var3.get(IlIIllIII.lI(IIl(Illl(1503551546, var5 ^ -967075456), Illl(1503551547, var5 ^ 790314563)))).getAsDouble(),
            var3.get(IlIIllIII.lI(IIl(Illl(1503551548, var5 ^ 1509086490), Illl(1503551549, var5 ^ -1212233701)))).getAsDouble(),
            var3.get(IlIIllIII.lI(IIl(Illl(1503551550, var5 ^ 84097104), Illl(1503551551, var5 ^ -620992256)))).getAsDouble(),
            var3.get(IlIIllIII.lI(IIl(Illl(1503551536, var5 ^ 587924770), Illl(1503551537, var5 ^ 1228843661)))).getAsDouble(),
            var4.get(IlIIllIII.lI(IIl(Illl(1503551538, var5 ^ 1233764173), Illl(1503551539, var5 ^ 773959807)))).getAsDouble(),
            var4.get(IlIIllIII.lI(IIl(Illl(1503551540, var5 ^ 1100966187), Illl(1503551541, var5 ^ 1204659156)))).getAsDouble(),
            var4.get(IlIIllIII.lI(IIl(Illl(1503551542, var5 ^ 873751632), Illl(1503551543, var5 ^ -1301700456)))).getAsDouble(),
            var4.get(IlIIllIII.lI(IIl(Illl(1503551528, var5 ^ 549035179), Illl(1503551529, var5 ^ -1210185057)))).getAsDouble()
         )
         : new Illlll(var0, var1, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   }

   static double lll(String var0) {
      IlIIllIl var1 = IIII();
      return IlII(var1, var0);
   }

   private static IlIIllIl IIII() {
      String[] var10000 = IIllllIl.IIIIl();
      llIIll var1 = IIIlIIII.lIlII();
      String[] var0 = var10000;
      if (var1.ll().lllI()) {
         return null;
      } else if (lI == var1 && IlI != null) {
         return IlI;
      } else {
         synchronized (llI) {
            WeakReference var3 = llI.get(var1);
            IlIIllIl var4 = var3 == null ? null : (IlIIllIl)var3.get();
            if (var4 != null) {
               IlI = var4;
               lI = var1;
               return var4;
            } else {
               IlIIllIl var5 = I(var1);
               if (var5 != null) {
                  llI.put(var1, new WeakReference<>(var5));
                  IlI = var5;
                  lI = var1;
                  if (var0 == null) {
                     return var5;
                  }
               }

               llI.remove(var1);
               if (lI == var1) {
                  IlI = null;
                  lI = null;
               }

               return var5;
            }
         }
      }
   }

   static int IIIl(String var0) {
      IlIIllIl var1 = IIII();
      return IllI(var1, var0);
   }

   static double IIlI() {
      IlIIllIl var0 = IIII();
      return var0 == null ? -1.0 : 9.0;
   }

   private static class_2960 IIll(IIIlIlIl var0, IIIlIlIl var1) {
      return class_2960.method_60655(I.llIl(), IIl.IIll(var0).IIll(var1).llIl());
   }

   private static int Illl(int var0, int var1) {
      int var2 = IIII[var0 ^ 1503551864] ^ var1 ^ var0;
      var2 ^= 6276;
      var2 -= 3898;
      var2 += 38283;
      var2 += 34486;
      var2 ^= 65398;
      var2 -= 45856;
      var2 ^= 17101;
      var2 ^= 22629;
      var2 ^= 62303;
      return var2 + 61672;
   }

   private static double IlII(IlIIllIl var0, String var1) {
      if (var0 == null) {
         return -1.0;
      } else {
         double var2 = 0.0;
         String var4 = var1 == null ? "" : var1;
         int var5 = 0;

         while (var5 < var4.length()) {
            int var6 = var4.codePointAt(var5);
            Illlll var7 = var0.lI.getOrDefault(var6, var0.ll);
            if (var7 != null) {
               var2 += var7.IlI * 11.0;
            }

            var5 += Character.charCount(var6);
         }

         return var2;
      }
   }

   static void IlIl() {
      synchronized (llI) {
         IlI = null;
         lI = null;

         for (WeakReference var2 : llI.values()) {
            if (var2 != null) {
               var2.clear();
            }
         }

         llI.clear();
      }

      synchronized (II) {
         for (WeakReference var9 : II.values()) {
            if (var9 != null) {
               var9.clear();
            }
         }

         II.clear();
      }
   }

   private IIIIlIlI() {
   }

   private static int IllI(IlIIllIl var0, String var1) {
      if (var0 == null) {
         return -1;
      } else {
         double var2 = 0.0;
         String var4 = var1 == null ? "" : var1;
         int var5 = 0;

         while (var5 < var4.length()) {
            int var6 = var4.codePointAt(var5);
            Illlll var7 = var0.lI.getOrDefault(var6, var0.ll);
            if (var7 != null) {
               var2 += var7.IlI * 11.0;
            }

            var5 += Character.charCount(var6);
         }

         return (int)Math.ceil(var2);
      }
   }
}
