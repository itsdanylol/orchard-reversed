package k74.x;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_5321;
import net.minecraft.class_640;
import net.minecraft.class_6880;
import net.minecraft.class_9304;
import net.minecraft.class_9334;

@Environment(EnvType.CLIENT)
public final class IlIIIlI extends IlIIIIIIl {
   private final IllIlI<Integer> II;
   private final IIlIII Il;
   private static final String[] lI;
   private static final Object[] IllI;
   private final lllIIlII I;
   private static final int ll = 2;
   private final IIlIII III;
   private final lllIIlII IIl;
   private static final int IlI = 3;
   private static final int Ill = 15;
   private static final String[] lII;
   private static final int lIl = 16;
   private final lllIIlII llI;
   private final lllIIlII lll;
   private final lllIIlII IIII;
   private static final int[] IlII;
   private final Map<UUID, Integer> IIIl;
   private static final String[] IlIl;
   private final List<IIllIlIIl> IIlI;
   private static final int IIll = 6;

   private IlIllIlI I(class_327 var1, class_1657 var2) {
      int var18 = -542339443;
      String var3 = "";
      int var4 = lllI(579683144, var18 ^ 294830088);
      if (this.IIl.IllI()) {
         int var5 = this.lIII(class_310.method_1551(), var2);
         if (var5 >= 0) {
            String var17 = IlIIllIII.lI(llII(lllI(579683145, var18 ^ -971024329), lllI(579683146, var18 ^ -1314455256)));
            var3 = var5 + var17;
            var4 = III(var5);
         }
      }

      String var19 = var2.method_5477().getString();
      StringBuilder var6 = new StringBuilder();
      var6.append(var19);
      if (this.llI.IllI()) {
         int var7 = this.IIIl.getOrDefault(var2.method_5667(), 0);
         if (var7 > 0) {
            var6.append(IlIIllIII.lI(llII(lllI(579683147, var18 ^ 994193483), lllI(579683148, var18 ^ -1477563856)))).append(var7);
         }
      }

      String var20 = var6.toString();
      int var8 = this.Illl(var1, IlIIllIII.lI(llII(lllI(579683149, var18 ^ 617028035), lllI(579683150, var18 ^ -1862713236))));
      int var9 = (var3.isEmpty() ? 0 : this.Illl(var1, var3) + var8) + this.Illl(var1, var20);
      double var10 = var9 + 12.0;
      double var12 = -var10 / 2.0;
      double var14 = -10.0;
      return new IlIllIlI(var3, var4, var20, var12, var14, var10, var12 + 6.0);
   }

   private static String l(String var0, int var1) {
      int var33 = -512319972;
      if (var0 != null && !var0.isEmpty()) {
         int var2 = var0.toLowerCase(Locale.ROOT).hashCode();

         return switch (var2) {
            case -1964679349 -> IlIIllIII.lI(llII(lllI(579683163, var33 ^ -1009401549), lllI(579683164, var33 ^ 656390887)));
            case -1924883326 -> {
               String var5 = IlIIllIII.lI(llII(lllI(579683139, var33 ^ 1462375715), lllI(579683140, var33 ^ -1302215938)));
               yield var5 + var1;
            }
            case -1684858151 -> {
               String var3 = IlIIllIII.lI(llII(lllI(579683151, var33 ^ -1224335114), lllI(579683136, var33 ^ 830322285)));
               yield var3 + var1;
            }
            case -1571105471 -> {
               String var15 = IlIIllIII.lI(llII(lllI(579683179, var33 ^ 1872618392), lllI(579683180, var33 ^ 745107982)));
               yield var15 + var1;
            }
            case -1393639857 -> {
               String var17 = IlIIllIII.lI(llII(lllI(579683183, var33 ^ -246104495), lllI(579683168, var33 ^ 858703112)));
               yield var17 + var1;
            }
            case -1380923823 -> {
               String var27 = IlIIllIII.lI(llII(lllI(579683081, var33 ^ -704053521), lllI(579683082, var33 ^ -14320984)));
               yield var27 + var1;
            }
            case -1242897082 -> {
               String var29 = IlIIllIII.lI(llII(lllI(579683087, var33 ^ 504953912), lllI(579683072, var33 ^ 1025740849)));
               yield var29 + var1;
            }
            case -1206031437 -> IlIIllIII.lI(llII(lllI(579683085, var33 ^ -869389718), lllI(579683086, var33 ^ -743700397)));
            case -1056264474 -> {
               String var21 = IlIIllIII.lI(llII(lllI(579683175, var33 ^ 334644869), lllI(579683192, var33 ^ -181883831)));
               yield var21 + var1;
            }
            case -874519716 -> {
               String var9 = IlIIllIII.lI(llII(lllI(579683165, var33 ^ 1967397667), lllI(579683166, var33 ^ 1194606214)));
               yield var9 + var1;
            }
            case -720514431 -> {
               String var19 = IlIIllIII.lI(llII(lllI(579683171, var33 ^ -1705772986), lllI(579683172, var33 ^ -1137618287)));
               yield var19 + var1;
            }
            case -677216191 -> {
               String var23 = IlIIllIII.lI(llII(lllI(579683197, var33 ^ 2009583645), lllI(579683198, var33 ^ -129217174)));
               yield var23 + var1;
            }
            case -675252731 -> {
               String var30 = IlIIllIII.lI(llII(lllI(579683073, var33 ^ -760587810), lllI(579683074, var33 ^ 1116807268)));
               yield var30 + var1;
            }
            case -161290517 -> {
               String var7 = IlIIllIII.lI(llII(lllI(579683143, var33 ^ 772055367), lllI(579683160, var33 ^ -1559889218)));
               yield var7 + var1;
            }
            case 97513267 -> IlIIllIII.lI(llII(lllI(579683187, var33 ^ -1316445774), lllI(579683188, var33 ^ -1749398151)));
            case 106858757 -> {
               String var24 = IlIIllIII.lI(llII(lllI(579683199, var33 ^ -1649098664), lllI(579683184, var33 ^ 1566064017)));
               yield var24 + var1;
            }
            case 107028782 -> {
               String var25 = IlIIllIII.lI(llII(lllI(579683185, var33 ^ 756201945), lllI(579683186, var33 ^ -226817570)));
               yield var25 + var1;
            }
            case 109556736 -> {
               String var16 = IlIIllIII.lI(llII(lllI(579683181, var33 ^ -576980100), lllI(579683182, var33 ^ 2030388527)));
               yield var16 + var1;
            }
            case 173173288 -> IlIIllIII.lI(llII(lllI(579683189, var33 ^ -725272382), lllI(579683190, var33 ^ 3588015)));
            case 350056506 -> {
               String var20 = IlIIllIII.lI(llII(lllI(579683173, var33 ^ 1260421453), lllI(579683174, var33 ^ 2051923048)));
               yield var20 + var1;
            }
            case 620514517 -> IlIIllIII.lI(llII(lllI(579683195, var33 ^ -1493476679), lllI(579683196, var33 ^ -1805479480)));
            case 686066415 -> {
               String var6 = IlIIllIII.lI(llII(lllI(579683141, var33 ^ 1512974538), lllI(579683142, var33 ^ -1170253864)));
               yield var6 + var1;
            }
            case 915847580 -> {
               String var8 = IlIIllIII.lI(llII(lllI(579683161, var33 ^ -149266231), lllI(579683162, var33 ^ -1485493495)));
               yield var8 + var1;
            }
            case 949868500 -> IlIIllIII.lI(llII(lllI(579683177, var33 ^ 1477616305), lllI(579683178, var33 ^ -60010198)));
            case 961218153 -> {
               String var22 = IlIIllIII.lI(llII(lllI(579683193, var33 ^ 632023050), lllI(579683194, var33 ^ 832806917)));
               yield var22 + var1;
            }
            case 976288699 -> {
               String var18 = IlIIllIII.lI(llII(lllI(579683169, var33 ^ 546601670), lllI(579683170, var33 ^ 760344644)));
               yield var18 + var1;
            }
            case 1168154088 -> {
               String var13 = IlIIllIII.lI(llII(lllI(579683157, var33 ^ 424718246), lllI(579683158, var33 ^ 1200838587)));
               yield var13 + var1;
            }
            case 1386075689 -> {
               String var28 = IlIIllIII.lI(llII(lllI(579683083, var33 ^ -943582742), lllI(579683084, var33 ^ -469215037)));
               yield var28 + var1;
            }
            case 1430090624 -> {
               String var4 = IlIIllIII.lI(llII(lllI(579683137, var33 ^ 302887260), lllI(579683138, var33 ^ 2001406188)));
               yield var4 + var1;
            }
            case 1552717032 -> {
               String var26 = IlIIllIII.lI(llII(lllI(579683191, var33 ^ -791530524), lllI(579683080, var33 ^ 1668988029)));
               yield var26 + var1;
            }
            case 1603571740 -> {
               String var14 = IlIIllIII.lI(llII(lllI(579683159, var33 ^ -1632445052), lllI(579683176, var33 ^ -2097799705)));
               yield var14 + var1;
            }
            case 1640856381 -> {
               String var10 = IlIIllIII.lI(llII(lllI(579683167, var33 ^ -594963789), lllI(579683152, var33 ^ -1068763860)));
               yield var10 + var1;
            }
            case 1766328849 -> {
               String var11 = IlIIllIII.lI(llII(lllI(579683153, var33 ^ 1600106745), lllI(579683154, var33 ^ -121399387)));
               yield var11 + var1;
            }
            case 2052708091 -> {
               String var12 = IlIIllIII.lI(llII(lllI(579683155, var33 ^ -1518872799), lllI(579683156, var33 ^ -1510890488)));
               yield var12 + var1;
            }
            default -> {
               String var31 = var0.length() <= 2 ? var0.toUpperCase(Locale.ROOT) : var0.substring(0, 2).toUpperCase(Locale.ROOT);
               yield var31 + var1;
            }
         };
      } else {
         return null;
      }
   }

   private static String II(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   private void Il(class_1657 var1, class_1304 var2, List<class_1799> var3) {
      class_1799 var4 = var1.method_6118(var2);
      if (!var4.method_7960()) {
         var3.add(var4);
      }
   }

   @Override
   public void lllIlI(class_1297 var1, byte var2) {
      if (var2 == lllI(579683075, -489072782 ^ 1195786094) && var1 instanceof class_1657 var3) {
         this.IIIl.merge(var3.method_5667(), 1, Integer::sum);
      }
   }

   private void lI(class_332 var1, IlIllIlI var2, double var3, int var5) {
      IlIIlllIl.llIl(
         var1,
         var2.I(),
         var2.II(),
         var2.Il(),
         15.0,
         3.0,
         IIIlllII.l(lllI(579683076, -439131277 ^ 1399682382), Math.min(lllI(579683077, -439131277 ^ -1835395370), var5))
      );
      int var6 = IIIlllII.l(IIIlllII.III(var3).getRGB(), var5);
      IlIIlllIl.IIlII(var1, var2.I() + 3.0, var2.II() + 15.0 - 2.0, (var2.Il() - 6.0) * var3, 1.0, var6);
   }

   private static String IIIII(int var0, int var1) {
      int var3 = var0 ^ 1510486056;
      char[] var4 = IlIl[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])IllI[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = new Throwable().getStackTrace();
         IllI[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1662242894;
      int var8 = 0;

      do {
         var4[var8] = (char)(var4[var8] ^ switch (var8 & 31) {
            default -> 159;
            case 1 -> 230;
            case 2 -> 133;
            case 3 -> 124;
            case 4 -> 207;
            case 5 -> 245;
            case 6 -> 189;
            case 7 -> 227;
            case 8 -> 247;
            case 9 -> 65;
            case 10 -> 45;
            case 11 -> 37;
            case 12 -> 30;
            case 13 -> 44;
            case 14 -> 94;
            case 15 -> 148;
            case 16 -> 181;
            case 17 -> 125;
            case 18 -> 194;
            case 19 -> 89;
            case 20 -> 179;
            case 21 -> 180;
            case 22 -> 16;
            case 23 -> 75;
            case 24 -> 139;
            case 25 -> 8;
            case 26 -> 188;
            case 27 -> 243;
            case 28 -> 163;
            case 29 -> 150;
            case 30 -> 124;
            case 31 -> 117;
         } ^ var1 >> 16 ^ var7);
      } while (++var8 < var4.length);

      return new String(var4).intern();
   }

   private List<String> ll(class_1799 var1) {
      if (var1 != null && !var1.method_7960()) {
         class_9304 var2 = (class_9304)var1.method_58695(class_9334.field_49633, class_9304.field_49385);
         if (var2.method_57543()) {
            return List.of();
         } else {
            ArrayList var3 = new ArrayList(4);

            for (class_6880 var5 : var2.method_57534()) {
               int var6 = var2.method_57536(var5);
               String var7 = var5.method_40230().map(IlIIIlI::II).orElse(null);
               String var8 = l(var7, var6);
               if (var8 != null && !var8.isEmpty()) {
                  var3.add(var8);
               }
            }

            return var3;
         }
      } else {
         return List.of();
      }
   }

   private static int III(int var0) {
      int var1 = -510686179;
      if (var0 < lllI(579683078, var1 ^ -1419817913)) {
         return lllI(579683079, var1 ^ -1849480546);
      } else if (var0 < lllI(579683096, var1 ^ -1681697061)) {
         return lllI(579683097, var1 ^ 1995236368);
      } else {
         return var0 < lllI(579683098, var1 ^ -12700785) ? lllI(579683099, var1 ^ 1749035533) : lllI(579683100, var1 ^ 2054047172);
      }
   }

   @Override
   public void IIlIl() {
      if (!this.IIIIlIl()) {
         this.II.l();
         this.IIIl.clear();
      }
   }

   private IIllIlIIl IIl(IIllIlIIl var1) {
      class_1657 var2 = var1.lI();
      if (var2 == null) {
         return var1;
      } else {
         lIllIIll var3 = this.II.IIl(var2.method_5628(), var1.I(), var1.II(), var1.Il());
         return new IIllIlIIl(var2, var3.I(), var3.II(), var1.Il(), var1.l());
      }
   }

   private void Ill(class_332 var1, class_327 var2, IlIllIlI var3, int var4) {
      double var5 = var3.II() + 3.0;
      double var7 = var3.III();
      if (var3.lI() != null && !var3.lI().isEmpty()) {
         int var9 = IIIlllII.l(var3.ll(), var4);
         IlIIlllIl.IIll(var1, var2, var3.lI(), var7, var5, var9);
         var7 += this.Illl(var2, var3.lI())
            + this.Illl(var2, IlIIllIII.lI(llII(lllI(579683112, -967670346 ^ -131306057), lllI(579683113, -967670346 ^ 2000665711))));
      }

      IlIIlllIl.IIll(var1, var2, var3.l(), var7, var5, IIIlllII.l(lllI(579683114, -967670346 ^ 1782131372), var4));
   }

   private void lII(class_332 var1, class_1799 var2, int var3, int var4, class_327 var5, int var6) {
      String[] var10000 = IIllllIl.IIIIl();
      List var8 = this.ll(var2);
      String[] var7 = var10000;
      if (!var8.isEmpty()) {
         double var9 = 0.75;
         double var11 = 7.0;
         double var13 = var4 - 2.0 - var8.size() * var11;
         int var15 = 0;

         while (var15 < var8.size()) {
            String var16 = (String)var8.get(var15);
            int var17 = var5.method_1727(var16);
            double var18 = var3 + 8.0 - var17 * var9 / 2.0;
            double var20 = var13 + var15 * var11;
            IlIIlllIl.IIllll(var1);
            IlIIlllIl.IlIIlI(var1, var18, var20);
            IlIIlllIl.llIIIl(var1, var9, var9);
            IlIIlllIl.IIII(var1, var5, var16, 0.0, 0.0, IIIlllII.l(lllI(579683115, -504268910 ^ 1375210747), var6));
            IlIIlllIl.lIIIll(var1);
            var15++;
            if (var7 != null) {
               break;
            }
         }
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -457522628;
      String[] var10002 = new String[2];
      int var17 = 0;
      String[] var15 = var10002;
      short var18 = 26658;
      int var14 = "Śḣ죙ធ\uf864᷁\ue85cᎳ\ud8d8ጢ硪ᵱ桖ჳ\ua8daᓒ\ue864Ⴑᡐᠣ\uf8daᢒ\ud860Ꮱ롛ᤓ㣒ᗢ顩፱ࡒᦣ\ud8d2Ტ硭ᥡ硞ᝣ壔ᦢ顠ẑ硗ᩳ꣐ᴢ硨ᴁ塒ᨳ\ue8d0ᒢ顤ᬡ衘ᄓ꣘ᑲ\ue86eጁ硟ᯓ棗ᛲ\ue86cᓁᡕᎳ꣘ᐢࡣ፱䡘ṓ䣜ᓒ\ud862ᡁ\uf851ἣ裚ᖲ㡩ᶱ類᠃⣔ᎂ㡬Ꭱᡗᩣ壖ᔲ롤᪡\uf85cፃ\ud8daᬲ롮ᵑ\u085dᛃ裔Ṃ㡩ᷡ衜ន\ua8ddᄒ㡤᠁ꡛᶃ\ud8deဒ硫ᠡ\ud85fᦣ룛ᡂꡮᬁ桓ᩳ棜ᾂࡠᒱࡕ᱃죑\u1ae2ꡡᶡ롟᭓㣝Ṳᡦ\u1ff1ࡐ\u1af3\uf8deᏂ⡥ᒡ⡐ឣ飓ᥢ㡭\u1af1硐ታ飙ᳲ㡩ᕡࡕ᠓룜ᵂ\uf867ᥱ術᠃棒Ḓ㡮ᯡᡚᒣ棒ᇒ롩ᢱ졖ᒃ\ue8d7ဲ桡ᒑ硐ና壐ᗲࡣᨁ䡒ᡓ룘ᓂ\uf86cᦱ㡔Ᏻᣟᔒ롢Ꮱ塐ᡓ䣖ᴂ⡧ᇑ롖᧓壞ᨂ\ue86bᆁ䡗Ꮓ\ua8deᠢ⡧ᝑ\ud858ᙳ\ue8d6ᩢ塮ᾑ\uf854ၣ\uf8ddᕢ㡣ᜑ\ud859ᜳ棐၂ᡤᜁ\ue859ᙃ\uf8d3ῂ硠ᤡ䡑ሓ\ue8d0Ḓ衣ᨱ\uf850Ꮣ⣒၂确ᨱ\uf857᳃\uf8d7ဂ졡ᡱ졗ኳ⣙ᇒ衡ᥑ桛ᧃ裑ᴲ롪ὁ㡗ḣᣟᯒ⡠ᳱ塒᱃棑ᑢ⡭Ბ⡔᪣㣗᳒\uf868᎑롒ᕓ裒ᦂᡣά㡙ᠣ\uf8dd᠒\uf867ᩡ\ud859ᬳ棐ἂ\ue865ሑ䡔ៃ⣞ᑢ㡩ᘱ졔ᙣ룛ᾂ㡡ႁꡜᇓ食ᵢ\ud860ề⡖ၳ壞ዂ㡭ᒡ롖ឳ룞᪒䡡ቑ⡐ᇃ\uf8db᠂\uf86e\t璬\u07bc睽眇窮㜸県랼糭"
         .length();
      String var13 = "Śḣ죙ធ\uf864᷁\ue85cᎳ\ud8d8ጢ硪ᵱ桖ჳ\ua8daᓒ\ue864Ⴑᡐᠣ\uf8daᢒ\ud860Ꮱ롛ᤓ㣒ᗢ顩፱ࡒᦣ\ud8d2Ტ硭ᥡ硞ᝣ壔ᦢ顠ẑ硗ᩳ꣐ᴢ硨ᴁ塒ᨳ\ue8d0ᒢ顤ᬡ衘ᄓ꣘ᑲ\ue86eጁ硟ᯓ棗ᛲ\ue86cᓁᡕᎳ꣘ᐢࡣ፱䡘ṓ䣜ᓒ\ud862ᡁ\uf851ἣ裚ᖲ㡩ᶱ類᠃⣔ᎂ㡬Ꭱᡗᩣ壖ᔲ롤᪡\uf85cፃ\ud8daᬲ롮ᵑ\u085dᛃ裔Ṃ㡩ᷡ衜ន\ua8ddᄒ㡤᠁ꡛᶃ\ud8deဒ硫ᠡ\ud85fᦣ룛ᡂꡮᬁ桓ᩳ棜ᾂࡠᒱࡕ᱃죑\u1ae2ꡡᶡ롟᭓㣝Ṳᡦ\u1ff1ࡐ\u1af3\uf8deᏂ⡥ᒡ⡐ឣ飓ᥢ㡭\u1af1硐ታ飙ᳲ㡩ᕡࡕ᠓룜ᵂ\uf867ᥱ術᠃棒Ḓ㡮ᯡᡚᒣ棒ᇒ롩ᢱ졖ᒃ\ue8d7ဲ桡ᒑ硐ና壐ᗲࡣᨁ䡒ᡓ룘ᓂ\uf86cᦱ㡔Ᏻᣟᔒ롢Ꮱ塐ᡓ䣖ᴂ⡧ᇑ롖᧓壞ᨂ\ue86bᆁ䡗Ꮓ\ua8deᠢ⡧ᝑ\ud858ᙳ\ue8d6ᩢ塮ᾑ\uf854ၣ\uf8ddᕢ㡣ᜑ\ud859ᜳ棐၂ᡤᜁ\ue859ᙃ\uf8d3ῂ硠ᤡ䡑ሓ\ue8d0Ḓ衣ᨱ\uf850Ꮣ⣒၂确ᨱ\uf857᳃\uf8d7ဂ졡ᡱ졗ኳ⣙ᇒ衡ᥑ桛ᧃ裑ᴲ롪ὁ㡗ḣᣟᯒ⡠ᳱ塒᱃棑ᑢ⡭Ბ⡔᪣㣗᳒\uf868᎑롒ᕓ裒ᦂᡣά㡙ᠣ\uf8dd᠒\uf867ᩡ\ud859ᬳ棐ἂ\ue865ሑ䡔ៃ⣞ᑢ㡩ᘱ졔ᙣ룛ᾂ㡡ႁꡜᇓ食ᵢ\ud860ề⡖ၳ壞ዂ㡭ᒡ롖ឳ룞᪒䡡ቑ⡐ᇃ\uf8db᠂\uf86e\t璬\u07bc睽眇窮㜸県랼糭";
      int var16 = 0;

      do {
         char var19 = var13.charAt(var17);
         char[] var10000 = var13.substring(var17 + 1, var17 + 1 + var19).toCharArray();
         int var21 = 0;
         char[] var20 = var10000;

         do {
            int var22 = var20[var21];

            var22 = (char)(switch (var21 % 6) {
               default -> 203;
               case 1 -> 206;
               case 2 -> 90;
               case 3 -> 127;
               case 4 -> 89;
               case 5 -> 74;
            }) ^ var22;
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 4 | var22 << 12) & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 4 | var22 >>> 12) & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IlIl = var15;
      IllI = new Object[var15.length];
      int var9 = -1158547633;
      byte[] var7 = "WC\u009c\u0087\u0081ÎSØöu\u009dk|\u0093;¯à?\u0089°c\u0016\u0012Æ×*m\u001dÎ\r;\u0088Ht\u00863k\u0006ª\u0013\u000e@\u000e\u009c.!\u000eRËi\u0011³#%3SÃ4\u0001#W\u000fº'Ú\u000e ú\u008e\u0011{©Þ}ÓèºÞÚ«^\u0014\b*\fO\u0000ª>=\n\r¥\u0082\u00892¹C\u001dÐ&T«¤\u0081È\u001f\u0094Ü|Ì²ÜúòL`[´Ò>\u0098èpç¹Æïûý¹È!\u0019¹î\u0085e~\u0099\u0016\u0096øøUa»½¤\u0090àÄ\u0000\f|¡\u0088_¥\u000eJ%jwY\u009faeTY\u0012|ãXã\u001aÅ8j\u00882+\u009a-\u0003E\u0004Êjù]?\u008c#Ê2\\ ó¬H«TgßðAáíi\u0019Ï\u000eÌËF\u0081D¢Ñä¿Û\u001a$S*ÊT\u0019¢i\u008bsÖ¢È\u0083ºúî³nï\u00adÎ#¾y=Ñô©Ù( \u001arkè¯\u0003åÜ\u0086-\u00969¾É\nÃ\u009d\u0000Þáµ%1mª§bRg\u0013çíD+s¿«¡Bò;\u009a4µ=á8\u0019.Ön0ï7$êÒ®\u0090+ègw\u0090â2\u008a\u001b\u000e\u001e¹\u0000\u0086Ïï[\u0010²(b\u0002\u009frÑ:âíÉû\u0089)\u0081!©o\u0092LôrrJ^\u0092ì\fqÖab\u0003¾Ç\n¨\u0006÷Hý=ÄéÃo¬\u0011ë\u0013\u001b¦\u0003mì)\u0012\u009aB5\u0016}z(tB+Ê\u0083ºS±Ø.Õ\u0014\u0083Ô\u0014ÆÕ\u0016\u00957°ôÜü\u0083x#\u0002V¯ÿ§æ½n\u0091|Wc°ã\u001d\u008eÂ\u001dã\u0011Ø\u0096ù*C\u0089Ñ\u001b\u001eÅ\u008d/Ñ1p\u001c\f\u0019Î\\õ¥Z¥¤\u0090s\r\u0018ä7Û¤%¸ûÆM\u001b\tW=\u0000Csvõ\u0095V~Û×¥:@Ï\u0005ì\u001a÷õ\u008eøa\u009c\u001eé\u0088\u008cÉ¿íÁ\u0086\u0018\u0018hñV\u001c\u000fæLiÙ0y\u001b_0§ã\u008fôR\u000eÕÅ\u0019¦8!'2¢£ô\u0011Njd\u0083Ø8\t\u0090\u008b\u009e\u0083\u009fmç\u0080]³Ñ\u0087\u0001\u0011\u0005\u009f\u0090\u0007\\\u0082\u0006\f²æ\u000fñ<>ju»\u008bÃ\u0082\u0019\u0003\u00134]\u001aAVý\u001fòkñ¤|%Î\u0003<ßIÙÓsð\u009cíÉMu|tk)äÎ\u0089yAç\u0090ÒÔ\u008a!2 ï\u0098l¨»\u00167ô,ÇK\u008cê\n^\u0003Ù!p±omBÛì&:·ÈÜ¬ÄY\u0003\u001dÑÓ\u0018æ\u00133\u0088W%>\u00978}á§s/\u0003)å\u008bæ\u008dö\u0018J46D\u008bRÞÊÛº\u0082?Ö\u0017e\u000e/\u009a2èøØ$Ô>Q¶?î\"W\u008a\u0001Zn&\u0011?ÈGÝÜ²\u0007éÃ¿â\u009aº÷§/ \u0001Jõ\u0099\b\u001b\u00113º¨S÷ÖPú\u0084;Ä6Ç\u001f:\u0090yqr\r©\u000eãÚ\u0012o&F]!n0\u0006D£N\u007fXº\t«Á¸,íÙÀI^iLæjÉG·@ý§®j?*{\u000fwÝ}UåZ\u0091Ããyn\u000b\u0005!\u001fGé^\u007få\u0090%¼d»Y4\u0092OÙg\u009cÃå×^¬/ðâíF.u1\u008f¼¹Ó©Ó\u0006_Ö_\u0007©7\u0084Y\u008b\u0082\u001bªÃéNüQX\t¤p+×wïz77\u0013ù§\u001dÞ°\u008f\u0091ñ\u00034µYôXVp>¶Òü\u009etýB¡pô\u000b\u0091mAa\u0092<a2ç£M3\u0010§µ°½G\u0082Ê\u009bC\u001a\u0082\t\u0017¹mèKÄ\u001aX\u008aõÞ\u009fs±fftýp\u0094\u0006\u0096O\u001fêüÝ\u008aZ®¾îI\u001c8\u0080Ë×ÆSÍ\u0011\u000f³\u001c\u00861\u009c\u0094\r\nãxÉ\u001fO¬¹ ZR¼\u0018 Ó`\u009e-Ç\u008d\"Ý¦´¿H|%\\\u001a>.Ò^bµ7Ya\u0013\u008c\u0080\u0014ûÕèÓïî6Ø\u008d\u0015ÀÉërÖM×\u001a\u008a?\b~·è\u009cãÍþOî\u009d\u0005ßUÄ÷BÃ\u0014æt\u001c!NÂÎ\u0092¯g?+Ë\u008e\u0003L9\u0019s\u0011\u0095$D17\u001d\b7ºÄ\u0094Ô\u009eb\u0087ìZ\r\u0016\u008388\u000eûÍWîôZ>î\u0005\nB¤ú@ã²¡á\\\u0095\n\u008d\u0016ê½\u0006¥#N¿4î¬-ÂÂ'_Dd\u0087\u0092Ñ\\aÚ4×Ó\u00901aH\u001e\u0088\u0001¾\\S&ô\u0005â\u0083dÉSF\tg\u009e\u001bÞ!+¨ÚUeºËÇYöï*ì\u000f\u008eâj\u0097<\u0095Å¦\u0003V§_<å1®§L\u0017õ\u0096÷4®íã|ÿô[¹\u0017^Ù\u009e+\u0096\u0094\u009au\u0099§\u009bÞÅ/ö\u0089\u007fó%z¶0\u0081Br\u00921^,µ¢\u009câê+JM\u008e]Âøú\u000e ,°\u000f1\u001f\u0010³õ¹Á\u000fn}5úÅ\u0007{w(+\u007fÓ&+éÉ\u0097\u009d\u0085\u0010@p\u0011¿\u0081\b\u0005ßÿ%÷\u000ee\u0092\\'ÌX\u009fÖªÎ\u0088ðrÈÎÇ\u0018¹BØ;\u0090Ò\u0086\u0007r\u008a| Õ\u0095õ¶ËcÔX^¾Xíø5ìEßÚ\u001a`c¥à\u000fÍd_õú\u001b¢ØÔq¶®Ñ\u009b\u0018\u0098;\u001d\u0093ñ\u000fx\u001ahD³Pxð\u0091q¥j¿Æ,A»\u0099' þ5¨)\u0005ÇR\u0002\u0085¨Ò\u0014\u0099«F³«¨\u0013\u0084Ñ\u008eÕRÂm¢L,9\u0096'Ðïò!¶\"é]O'\u000f»\u0096\u009aq\u0083z¹\u008ao3ÏïXtÂ\u0095j\u0095³x\u0099É;mB\u00ad\u0091\u009fëóÚ\tèMÍÐ3CfEÍí\b6´H\u0080xÎ\u00939ãt%>ûÎ"
         .getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      IlII = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         IlII[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var5 = new String[lllI(579683101, var23 ^ 1176928144)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = IIIII(1510486056, var23 ^ -703144582)).length();
      char var1 = 4;
      int var25 = -1;

      label98:
      while (true) {
         int var29 = lllI(579683102, var23 ^ -2024948815);
         String var10001 = var2.substring(++var25, var25 + var1);
         byte var37 = -1;

         while (true) {
            label93: {
               char[] var46 = var10001.toCharArray();
               int var10004 = var46.length;
               int var6 = 0;
               int var49 = var29;
               var42 = var46;
               int var35 = var10004;
               char[] var58;
               int var10006;
               if (var10004 <= 1) {
                  var58 = var46;
                  var10004 = var29;
                  var10006 = var6;
               } else {
                  var49 = var29;
                  var35 = var10004;
                  if (var10004 <= var6) {
                     break label93;
                  }

                  var58 = var46;
                  var10004 = var29;
                  var10006 = var6;
               }

               while (true) {
                  var58[var10006] = (char)(var58[var10006] ^ var10004 ^ switch (var6 % lllI(579683089, var23 ^ 916062371)) {
                     case 0 -> lllI(579683090, var23 ^ 1890927664);
                     case 1 -> lllI(579683091, var23 ^ 516369584);
                     case 2 -> lllI(579683092, var23 ^ 1986827462);
                     case 3 -> lllI(579683093, var23 ^ 876195772);
                     case 4 -> lllI(579683094, var23 ^ -1794638358);
                     case 5 -> lllI(579683095, var23 ^ 1831829792);
                     default -> 1;
                  });
                  var6++;
                  if (var49 == 0) {
                     var10006 = var49;
                     var58 = var42;
                     var10004 = var49;
                  } else {
                     if (var35 <= var6) {
                        break;
                     }

                     var58 = var42;
                     var10004 = var49;
                     var10006 = var6;
                  }
               }
            }

            String var51 = new String(var42).intern();
            switch (var37) {
               case 0:
                  var5[var3++] = var51;
                  if ((var25 += var1) >= var4) {
                     lI = var5;
                     lII = new String[lllI(579683088, var23 ^ 808509478)];
                     return;
                  }

                  var1 = var2.charAt(var25);
                  break;
               default:
                  var5[var3++] = var51;
                  if ((var25 += var1) < var4) {
                     var1 = var2.charAt(var25);
                     continue label98;
                  }

                  var4 = (var2 = IIIII(1510486057, var23 ^ 543213864)).length();
                  var1 = 4;
                  var25 = -1;
            }

            var29 = lllI(579683103, var23 ^ 1567489483);
            var10001 = var2.substring(++var25, var25 + var1);
            var37 = 0;
         }
      }
   }

   private List<class_1799> lIl(class_1657 var1) {
      ArrayList var2 = new ArrayList(lllI(579683116, -823938334 ^ -1675732738));
      class_1799 var3 = var1.method_6047();
      if (!var3.method_7960()) {
         var2.add(var3);
      }

      this.Il(var1, class_1304.field_6169, var2);
      this.Il(var1, class_1304.field_6174, var2);
      this.Il(var1, class_1304.field_6172, var2);
      this.Il(var1, class_1304.field_6166, var2);
      class_1799 var4 = var1.method_6079();
      if (!var4.method_7960()) {
         var2.add(var4);
      }

      return var2;
   }

   private double llI(class_1657 var1) {
      float var2 = var1.method_6063() + var1.method_6067();
      return var2 <= 0.0F ? 0.0 : Math.max(0.0, Math.min(1.0, (double)((var1.method_6032() + var1.method_6067()) / var2)));
   }

   private lllIIlll lll(lIIlIl var1, class_238 var2) {
      String[] var10000 = IIllllIl.IIIIl();
      double var4 = var2.field_1323;
      double var6 = (var2.field_1323 + var2.field_1320) * 0.5;
      double var8 = var2.field_1320;
      double var10 = var2.field_1321;
      double var12 = (var2.field_1321 + var2.field_1324) * 0.5;
      double var14 = var2.field_1324;
      double var16 = var2.field_1325 + 0.4;
      List var18 = List.of(
         new class_243(var6, var16, var12),
         new class_243(var4, var16, var10),
         new class_243(var4, var16, var12),
         new class_243(var4, var16, var14),
         new class_243(var6, var16, var10),
         new class_243(var6, var16, var14),
         new class_243(var8, var16, var10),
         new class_243(var8, var16, var12),
         new class_243(var8, var16, var14)
      );
      double var19 = 0.0;
      String[] var3 = var10000;
      double var21 = Double.POSITIVE_INFINITY;
      int var23 = 0;

      for (class_243 var25 : var18) {
         IlIllIIII var26 = IlIII.IlIll(var1, var25);
         if (var26 != null || var3 != null) {
            var19 += var26.II();
            var21 = Math.min(var21, var26.l());
            var23++;
            if (var3 != null) {
               break;
            }
         }
      }

      return var23 != 0 && Double.isFinite(var19) && Double.isFinite(var21) ? new lllIIlll(var19 / var23, var21) : null;
   }

   private void IIII(class_310 var1, List<class_1657> var2, class_1657 var3, boolean var4) {
      if (var3 != null) {
         if (var3 != var1.field_1724 || var4) {
            if (!var3.method_31481() && var3.method_5805()) {
               if (var3 == var1.field_1724 || !IIlllIlll.II(var3)) {
                  var2.add(var3);
               }
            }
         }
      }
   }

   @Override
   public void llll(class_332 var1, int var2, int var3, float var4) {
      if (!this.IIlI.isEmpty()) {
         class_310 var5 = class_310.method_1551();
         if (var5.field_1772 != null) {
            for (IIllIlIIl var7 : this.IIlI) {
               this.IlIl(var1, var5, var7);
            }
         }
      }
   }

   private static int lllI(int var0, int var1) {
      int var2 = IlII[var0 ^ 579683144] ^ var1 ^ var0;
      var2 -= 35587;
      var2 -= 49842;
      var2 -= 55137;
      var2 ^= 34142;
      var2 ^= 36647;
      return var2 ^ 46441;
   }

   private double IIIl(double var1) {
      double var3 = Math.sqrt(var1);
      return Math.max(0.6, Math.min(1.0, 1.0 - (var3 - 10.0) * 0.005));
   }

   @Override
   public void IlI(lIIlIl var1) {
      this.IIlI.clear();
      if (this.IIIIlIl() && IlIII.IIIIII(var1)) {
         class_310 var2 = class_310.method_1551();
         if (var2.field_1724 != null && var2.field_1687 != null) {
            float var3 = k74.x.IIll.IlIIlI(var2);
            boolean var4 = this.I.IllI();

            for (class_1657 var6 : this.IlII(var2, var4)) {
               IIllIlIIl var7 = this.IllI(var1, var2, var6, var3);
               if (var7 != null) {
                  this.IIlI.add(this.IIl(var7));
               }
            }
         }
      }
   }

   private String IIlI(class_310 var1, class_1657 var2) {
      int var6 = -1147626585;
      String var3 = var2.method_5477().getString();
      StringBuilder var4 = new StringBuilder();
      if (this.IIl.IllI()) {
         int var5 = this.lIII(var1, var2);
         if (var5 >= 0) {
            var4.append(var5)
               .append(IlIIllIII.lI(llII(lllI(579683117, var6 ^ -1841483700), lllI(579683118, var6 ^ 929365224))))
               .append(IlIIllIII.lI(llII(lllI(579683119, var6 ^ -449837051), lllI(579683104, var6 ^ 341148888))));
         }
      }

      var4.append(var3);
      if (this.llI.IllI()) {
         int var7 = this.IIIl.getOrDefault(var2.method_5667(), 0);
         if (var7 > 0) {
            var4.append(IlIIllIII.lI(llII(lllI(579683105, var6 ^ -546937191), lllI(579683106, var6 ^ 565422668)))).append(var7);
         }
      }

      return var4.toString();
   }

   private void IIll(class_332 var1, class_1799 var2, int var3, int var4, class_327 var5, int var6) {
      IlIIlllIl.llIllI(var1, var5, var2, var3, var4);
      if (this.lll.IllI()) {
         this.lII(var1, var2, var3, var4, var5, var6);
      }
   }

   private List<class_1657> IlII(class_310 var1, boolean var2) {
      ArrayList var3 = new ArrayList();

      for (class_1657 var5 : var1.field_1687.method_18456()) {
         this.IIII(var1, var3, var5, var2);
      }

      return var3;
   }

   private void IlIl(class_332 var1, class_310 var2, IIllIlIIl var3) {
      class_1657 var4 = var3.lI();
      class_327 var5 = var2.field_1772;
      double var6 = this.llI(var4);
      double var8 = this.Il.IllI() * this.IIIl(var3.Il());
      int var10 = (int)Math.round(this.III.IllI());
      IlIllIlI var11 = this.I(var5, var4);
      IlIIlllIl.IIllll(var1);
      IlIIlllIl.IlIIlI(var1, var3.I(), var3.II());
      IlIIlllIl.llIIIl(var1, var8, var8);
      this.lI(var1, var11, var6, var10);
      this.Ill(var1, var5, var11, var10);
      if (this.IIII.IllI()) {
         this.lIlI(var1, var4, var5, (int)(var11.II() - 3.0 - 16.0), var10);
      }

      IlIIlllIl.lIIIll(var1);
   }

   private IIllIlIIl IllI(lIIlIl var1, class_310 var2, class_1657 var3, float var4) {
      class_243 var5 = IlIII.IIll(var3, var4);
      class_238 var6 = var3.method_18377(var3.method_18376()).method_30757(var5);
      lllIIlll var7 = this.lll(var1, var6);
      if (var7 == null && !IlIII.IllII(var2, var1, var3, var5)) {
         return null;
      } else {
         return var7 == null ? null : new IIllIlIIl(var3, var7.I(), var7.l(), var2.field_1724.method_5707(var5), var7.l());
      }
   }

   public IlIIIlI() {
      int var1 = 90048900;
      super(
         IlIIllIII.Ill(llII(lllI(579683107, var1 ^ 986001677), lllI(579683108, var1 ^ 207582477))),
         lllIIlIl.IIl,
         IlIIllIII.Ill(llII(lllI(579683109, var1 ^ 767594997), lllI(579683110, var1 ^ 1597949512)))
      );
      this.Il = this.IllIIll(new IIlIII(IlIIllIII.Ill(llII(lllI(579683111, var1 ^ 1169520024), lllI(579683128, var1 ^ -559225305))), 1.0, 0.5, 2.0, 0.05));
      this.III = this.IllIIll(new IIlIII(IlIIllIII.Ill(llII(lllI(579683129, var1 ^ -2082078282), lllI(579683130, var1 ^ 1276294279))), 200.0, 0.0, 255.0, 5.0));
      this.IIII = this.IllIIll(new lllIIlII(IlIIllIII.Ill(llII(lllI(579683131, var1 ^ -1858452956), lllI(579683132, var1 ^ 1753552049))), true));
      this.lll = this.IllIIll(new lllIIlII(IlIIllIII.Ill(llII(lllI(579683133, var1 ^ 968097696), lllI(579683134, var1 ^ -2050554672))), true));
      this.llI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(llII(lllI(579683135, var1 ^ 956707995), lllI(579683120, var1 ^ 1533985128))), true));
      this.IIl = this.IllIIll(new lllIIlII(IlIIllIII.Ill(llII(lllI(579683121, var1 ^ -903967522), lllI(579683122, var1 ^ -296367768))), true));
      this.I = this.IllIIll(new lllIIlII(IlIIllIII.Ill(llII(lllI(579683123, var1 ^ -883075255), lllI(579683124, var1 ^ 941352525))), false));
      this.II = new IllIlI<>();
      this.IIlI = new ArrayList<>();
      this.IIIl = new ConcurrentHashMap<>();
   }

   private int Illl(class_327 var1, String var2) {
      int var3 = IIIIlIlI.IIIl(var2);
      return var3 >= 0 ? var3 : var1.method_1727(var2);
   }

   private int lIII(class_310 var1, class_1657 var2) {
      if (var1 != null && var1.method_1562() != null && var2 != null) {
         class_640 var3 = var1.method_1562().method_2871(var2.method_5667());
         return var3 != null ? var3.method_2959() : -1;
      } else {
         return -1;
      }
   }

   public static boolean lIIl(class_1297 var0) {
      return var0 instanceof class_1657 && lIll();
   }

   private void lIlI(class_332 var1, class_1657 var2, class_327 var3, int var4, int var5) {
      List var6 = this.lIl(var2);
      int var7 = var6.isEmpty() ? 0 : var6.size() * lllI(579683125, -1650916432 ^ 739627) + (var6.size() - 1) * 2;
      int var8 = -var7 / 2;

      for (class_1799 var10 : var6) {
         this.IIll(var1, var10, var8, var4, var3, var5);
         var8 += 18;
      }
   }

   public static boolean lIll() {
      IIIIIllII var0 = IIIIIllII.III();
      if (var0 != null && var0.II() != null) {
         IlIIIlI var1 = var0.II().IIlllIl();
         return var1 != null && var1.IIIIlIl();
      } else {
         return false;
      }
   }

   @Override
   public void llIl() {
      this.II.l();
      this.IIlI.clear();
      this.IIIl.clear();
   }

   private static String llII(int var0, int var1) {
      int var9 = -939342825;
      int var2 = (var0 ^ lllI(579683126, var9 ^ -1510885023)) & lllI(579683127, var9 ^ -865927198);
      if (lII[var2] == null) {
         char[] var3 = lI[var2].toCharArray();

         int var4 = switch (var3[0] & lllI(579683272, var9 ^ -592106888)) {
            case 0 -> lllI(579683273, var9 ^ -1845851074);
            case 1 -> lllI(579683274, var9 ^ 948814545);
            case 2 -> lllI(579683275, var9 ^ 1603983509);
            case 3 -> lllI(579683276, var9 ^ -1991447196);
            case 4 -> lllI(579683277, var9 ^ 256652097);
            case 5 -> lllI(579683278, var9 ^ -544684381);
            case 6 -> lllI(579683279, var9 ^ -2051437075);
            case 7 -> lllI(579683264, var9 ^ 1750971137);
            case 8 -> lllI(579683265, var9 ^ -220241859);
            case 9 -> lllI(579683266, var9 ^ 504819797);
            case 10 -> lllI(579683267, var9 ^ -2008769231);
            case 11 -> 2;
            case 12 -> lllI(579683268, var9 ^ -605939790);
            case 13 -> lllI(579683269, var9 ^ 1033573484);
            case 14 -> lllI(579683270, var9 ^ -475196663);
            case 15 -> lllI(579683271, var9 ^ 1098451462);
            case 16 -> lllI(579683288, var9 ^ 1461720782);
            case 17 -> lllI(579683289, var9 ^ 1557033865);
            case 18 -> lllI(579683290, var9 ^ -1589597651);
            case 19 -> lllI(579683291, var9 ^ 633806727);
            case 20 -> lllI(579683292, var9 ^ -765093950);
            case 21 -> lllI(579683293, var9 ^ 1679920813);
            case 22 -> lllI(579683294, var9 ^ 109153236);
            case 23 -> lllI(579683295, var9 ^ 999108723);
            case 24 -> lllI(579683280, var9 ^ 1974638372);
            case 25 -> lllI(579683281, var9 ^ -1892332120);
            case 26 -> lllI(579683282, var9 ^ 596379686);
            case 27 -> lllI(579683283, var9 ^ -1724784390);
            case 28 -> lllI(579683284, var9 ^ 605535666);
            case 29 -> lllI(579683285, var9 ^ -1628050147);
            case 30 -> lllI(579683286, var9 ^ -1209252295);
            case 31 -> lllI(579683287, var9 ^ -631396611);
            case 32 -> lllI(579683304, var9 ^ -1075513076);
            case 33 -> lllI(579683305, var9 ^ -345332937);
            case 34 -> lllI(579683306, var9 ^ 2092687246);
            case 35 -> lllI(579683307, var9 ^ -1166620112);
            case 36 -> lllI(579683308, var9 ^ -1990335464);
            case 37 -> lllI(579683309, var9 ^ 1058133654);
            case 38 -> lllI(579683310, var9 ^ -1134907830);
            case 39 -> lllI(579683311, var9 ^ -1734330162);
            case 40 -> lllI(579683296, var9 ^ 159353092);
            case 41 -> lllI(579683297, var9 ^ -2090569058);
            case 42 -> lllI(579683298, var9 ^ 1676984979);
            case 43 -> lllI(579683299, var9 ^ 1860938930);
            case 44 -> lllI(579683300, var9 ^ -1310988653);
            case 45 -> lllI(579683301, var9 ^ 1398108495);
            case 46 -> lllI(579683302, var9 ^ -1225694599);
            case 47 -> lllI(579683303, var9 ^ 440967688);
            case 48 -> lllI(579683320, var9 ^ -617723031);
            case 49 -> lllI(579683321, var9 ^ -1949952448);
            case 50 -> lllI(579683322, var9 ^ -2039746158);
            case 51 -> lllI(579683323, var9 ^ 2145822361);
            case 52 -> lllI(579683324, var9 ^ -1465601820);
            case 53 -> lllI(579683325, var9 ^ 1848451617);
            case 54 -> lllI(579683326, var9 ^ -1101085718);
            case 55 -> 1;
            case 56 -> lllI(579683327, var9 ^ 1361508910);
            case 57 -> lllI(579683312, var9 ^ 1094933516);
            case 58 -> lllI(579683313, var9 ^ -1918884265);
            case 59 -> lllI(579683314, var9 ^ -1178653815);
            case 60 -> lllI(579683315, var9 ^ -892968087);
            case 61 -> lllI(579683316, var9 ^ 2136774011);
            case 62 -> lllI(579683317, var9 ^ -1511678721);
            case 63 -> lllI(579683318, var9 ^ 1095708301);
            case 64 -> lllI(579683319, var9 ^ 59458273);
            case 65 -> lllI(579683208, var9 ^ -1426542737);
            case 66 -> lllI(579683209, var9 ^ 1723567060);
            case 67 -> lllI(579683210, var9 ^ -1073355300);
            case 68 -> lllI(579683211, var9 ^ 1574279920);
            case 69 -> lllI(579683212, var9 ^ -1972438152);
            case 70 -> lllI(579683213, var9 ^ 371307907);
            case 71 -> lllI(579683214, var9 ^ 1618661485);
            case 72 -> lllI(579683215, var9 ^ 503565328);
            case 73 -> lllI(579683200, var9 ^ 1507284375);
            case 74 -> lllI(579683201, var9 ^ 2089897377);
            case 75 -> lllI(579683202, var9 ^ 421723645);
            case 76 -> lllI(579683203, var9 ^ -1240048272);
            case 77 -> lllI(579683204, var9 ^ -415471205);
            case 78 -> lllI(579683205, var9 ^ -32068789);
            case 79 -> lllI(579683206, var9 ^ 729014801);
            case 80 -> lllI(579683207, var9 ^ 757690706);
            case 81 -> lllI(579683224, var9 ^ -1044416668);
            case 82 -> 4;
            case 83 -> lllI(579683225, var9 ^ 1048023379);
            case 84 -> lllI(579683226, var9 ^ 1329298884);
            case 85 -> lllI(579683227, var9 ^ 798557299);
            case 86 -> lllI(579683228, var9 ^ -333959209);
            case 87 -> lllI(579683229, var9 ^ 1693375436);
            case 88 -> lllI(579683230, var9 ^ 937449404);
            case 89 -> lllI(579683231, var9 ^ -2027800069);
            case 90 -> 5;
            case 91 -> lllI(579683216, var9 ^ -1600226985);
            case 92 -> lllI(579683217, var9 ^ 2114561479);
            case 93 -> lllI(579683218, var9 ^ -322615700);
            case 94 -> lllI(579683219, var9 ^ -2089104875);
            case 95 -> lllI(579683220, var9 ^ 259734900);
            case 96 -> lllI(579683221, var9 ^ -735764498);
            case 97 -> lllI(579683222, var9 ^ 1272338378);
            case 98 -> lllI(579683223, var9 ^ 511755629);
            case 99 -> lllI(579683240, var9 ^ 1507386386);
            case 100 -> lllI(579683241, var9 ^ -2029290499);
            case 101 -> lllI(579683242, var9 ^ 1733003149);
            case 102 -> lllI(579683243, var9 ^ -144618985);
            case 103 -> lllI(579683244, var9 ^ -538090064);
            case 104 -> lllI(579683245, var9 ^ 1690946937);
            case 105 -> lllI(579683246, var9 ^ 137028843);
            case 106 -> lllI(579683247, var9 ^ -424777576);
            case 107 -> lllI(579683232, var9 ^ 612488753);
            case 108 -> lllI(579683233, var9 ^ 545824674);
            case 109 -> lllI(579683234, var9 ^ 1027470461);
            case 110 -> lllI(579683235, var9 ^ 1813882514);
            case 111 -> lllI(579683236, var9 ^ -214849810);
            case 112 -> lllI(579683237, var9 ^ -137812851);
            case 113 -> lllI(579683238, var9 ^ 402546422);
            case 114 -> lllI(579683239, var9 ^ 325457593);
            case 115 -> lllI(579683256, var9 ^ 1204156734);
            case 116 -> lllI(579683257, var9 ^ 465079821);
            case 117 -> lllI(579683258, var9 ^ -628536695);
            case 118 -> lllI(579683259, var9 ^ 600699475);
            case 119 -> lllI(579683260, var9 ^ 612492466);
            case 120 -> lllI(579683261, var9 ^ 1458232255);
            case 121 -> lllI(579683262, var9 ^ -1165997790);
            case 122 -> lllI(579683263, var9 ^ 181545740);
            case 123 -> lllI(579683248, var9 ^ 425766045);
            case 124 -> lllI(579683249, var9 ^ -1683270937);
            case 125 -> lllI(579683250, var9 ^ -1653761028);
            case 126 -> lllI(579683251, var9 ^ 1291494900);
            case 127 -> lllI(579683252, var9 ^ -999186713);
            case 128 -> lllI(579683253, var9 ^ 682986436);
            case 129 -> lllI(579683254, var9 ^ -54152070);
            case 130 -> lllI(579683255, var9 ^ 46173334);
            case 131 -> lllI(579682888, var9 ^ -2095314029);
            case 132 -> lllI(579682889, var9 ^ -1745766641);
            case 133 -> lllI(579682890, var9 ^ -154653961);
            case 134 -> lllI(579682891, var9 ^ 744081738);
            case 135 -> lllI(579682892, var9 ^ 1850885710);
            case 136 -> lllI(579682893, var9 ^ 852075187);
            case 137 -> lllI(579682894, var9 ^ 829364665);
            case 138 -> lllI(579682895, var9 ^ 1149714565);
            case 139 -> lllI(579682880, var9 ^ -2087486588);
            case 140 -> lllI(579682881, var9 ^ -1997438898);
            case 141 -> lllI(579682882, var9 ^ -1718097939);
            case 142 -> lllI(579682883, var9 ^ 497782643);
            case 143 -> lllI(579682884, var9 ^ 1869933358);
            case 144 -> lllI(579682885, var9 ^ -1193249100);
            case 145 -> lllI(579682886, var9 ^ -1372357671);
            case 146 -> lllI(579682887, var9 ^ 1436795126);
            case 147 -> lllI(579682904, var9 ^ -1489086943);
            case 148 -> lllI(579682905, var9 ^ -1240954566);
            case 149 -> lllI(579682906, var9 ^ 515791756);
            case 150 -> lllI(579682907, var9 ^ -14964109);
            case 151 -> lllI(579682908, var9 ^ -1678600663);
            case 152 -> lllI(579682909, var9 ^ 1768285885);
            case 153 -> lllI(579682910, var9 ^ -984035045);
            case 154 -> lllI(579682911, var9 ^ 1734450606);
            case 155 -> lllI(579682896, var9 ^ -357039804);
            case 156 -> lllI(579682897, var9 ^ -836890007);
            case 157 -> 0;
            case 158 -> lllI(579682898, var9 ^ 175211449);
            case 159 -> lllI(579682899, var9 ^ 1749326614);
            case 160 -> lllI(579682900, var9 ^ -1658094702);
            case 161 -> lllI(579682901, var9 ^ 172128771);
            case 162 -> lllI(579682902, var9 ^ 1514025243);
            case 163 -> lllI(579682903, var9 ^ 278865583);
            case 164 -> lllI(579682920, var9 ^ -1323302839);
            case 165 -> lllI(579682921, var9 ^ -580223024);
            case 166 -> lllI(579682922, var9 ^ 1457108615);
            case 167 -> lllI(579682923, var9 ^ -280462388);
            case 168 -> lllI(579682924, var9 ^ 2109626312);
            case 169 -> lllI(579682925, var9 ^ 255390162);
            case 170 -> lllI(579682926, var9 ^ -1028797983);
            case 171 -> lllI(579682927, var9 ^ -1974975883);
            case 172 -> lllI(579682912, var9 ^ -1068632835);
            case 173 -> lllI(579682913, var9 ^ 1324651717);
            case 174 -> lllI(579682914, var9 ^ 204452659);
            case 175 -> lllI(579682915, var9 ^ 1436423819);
            case 176 -> lllI(579682916, var9 ^ -1724918958);
            case 177 -> lllI(579682917, var9 ^ 937594590);
            case 178 -> lllI(579682918, var9 ^ 1901542783);
            case 179 -> lllI(579682919, var9 ^ 85536516);
            case 180 -> lllI(579682936, var9 ^ -1759157401);
            case 181 -> lllI(579682937, var9 ^ 2056297168);
            case 182 -> lllI(579682938, var9 ^ -1307180393);
            case 183 -> lllI(579682939, var9 ^ -977718374);
            case 184 -> lllI(579682940, var9 ^ 115067465);
            case 185 -> lllI(579682941, var9 ^ -1253229788);
            case 186 -> lllI(579682942, var9 ^ 476799054);
            case 187 -> lllI(579682943, var9 ^ -1488438296);
            case 188 -> lllI(579682928, var9 ^ -1291818376);
            case 189 -> lllI(579682929, var9 ^ 197493485);
            case 190 -> lllI(579682930, var9 ^ -1981628702);
            case 191 -> lllI(579682931, var9 ^ -991502139);
            case 192 -> lllI(579682932, var9 ^ -135836816);
            case 193 -> lllI(579682933, var9 ^ 2139757692);
            case 194 -> lllI(579682934, var9 ^ -1554387069);
            case 195 -> lllI(579682935, var9 ^ 1627248215);
            case 196 -> lllI(579682824, var9 ^ -1035089110);
            case 197 -> lllI(579682825, var9 ^ -438433416);
            case 198 -> lllI(579682826, var9 ^ -1168646146);
            case 199 -> lllI(579682827, var9 ^ -568240231);
            case 200 -> lllI(579682828, var9 ^ -1435322963);
            case 201 -> lllI(579682829, var9 ^ -529292072);
            case 202 -> lllI(579682830, var9 ^ 1087332523);
            case 203 -> lllI(579682831, var9 ^ -1854670066);
            case 204 -> lllI(579682816, var9 ^ 1703301302);
            case 205 -> lllI(579682817, var9 ^ 722189813);
            case 206 -> lllI(579682818, var9 ^ 800043971);
            case 207 -> lllI(579682819, var9 ^ -1179319669);
            case 208 -> lllI(579682820, var9 ^ -714287860);
            case 209 -> lllI(579682821, var9 ^ 1103303825);
            case 210 -> lllI(579682822, var9 ^ 1436772930);
            case 211 -> lllI(579682823, var9 ^ -1485639492);
            case 212 -> lllI(579682840, var9 ^ 207313270);
            case 213 -> lllI(579682841, var9 ^ -810926166);
            case 214 -> lllI(579682842, var9 ^ -661854565);
            case 215 -> lllI(579682843, var9 ^ -1631875810);
            case 216 -> lllI(579682844, var9 ^ 312782482);
            case 217 -> lllI(579682845, var9 ^ -2097507692);
            case 218 -> lllI(579682846, var9 ^ -637487712);
            case 219 -> lllI(579682847, var9 ^ -980868110);
            case 220 -> lllI(579682832, var9 ^ 866700609);
            case 221 -> 3;
            case 222 -> lllI(579682833, var9 ^ -299599679);
            case 223 -> lllI(579682834, var9 ^ 1703989360);
            case 224 -> lllI(579682835, var9 ^ -1972964022);
            case 225 -> lllI(579682836, var9 ^ -174286147);
            case 226 -> lllI(579682837, var9 ^ 874733661);
            case 227 -> lllI(579682838, var9 ^ 1272859970);
            case 228 -> lllI(579682839, var9 ^ 566901390);
            case 229 -> lllI(579682856, var9 ^ -882635287);
            case 230 -> lllI(579682857, var9 ^ 1307534562);
            case 231 -> lllI(579682858, var9 ^ 677838289);
            case 232 -> lllI(579682859, var9 ^ -483594859);
            case 233 -> lllI(579682860, var9 ^ -1056100351);
            case 234 -> lllI(579682861, var9 ^ -272975434);
            case 235 -> lllI(579682862, var9 ^ -337268014);
            case 236 -> lllI(579682863, var9 ^ -1370931925);
            case 237 -> lllI(579682848, var9 ^ 1438369558);
            case 238 -> lllI(579682849, var9 ^ -707508358);
            case 239 -> lllI(579682850, var9 ^ -908602618);
            case 240 -> lllI(579682851, var9 ^ -69958100);
            case 241 -> lllI(579682852, var9 ^ -2114830191);
            case 242 -> lllI(579682853, var9 ^ -1844365761);
            case 243 -> lllI(579682854, var9 ^ 2084897545);
            case 244 -> lllI(579682855, var9 ^ -2137823656);
            case 245 -> lllI(579682872, var9 ^ -430015285);
            case 246 -> lllI(579682873, var9 ^ 526096914);
            case 247 -> lllI(579682874, var9 ^ -957946810);
            case 248 -> lllI(579682875, var9 ^ 717561781);
            case 249 -> lllI(579682876, var9 ^ 1672706690);
            case 250 -> lllI(579682877, var9 ^ 616431841);
            case 251 -> lllI(579682878, var9 ^ -976228929);
            case 252 -> lllI(579682879, var9 ^ -1723336644);
            case 253 -> lllI(579682864, var9 ^ -34796977);
            case 254 -> lllI(579682865, var9 ^ -1549362000);
            default -> lllI(579682866, var9 ^ 498156965);
         };
         int var5 = (var1 & lllI(579682867, var9 ^ 320524707)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lllI(579682868, var9 ^ -1116462627)) >>> lllI(579682869, var9 ^ 419229069)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lllI(579682870, var9 ^ -1018857697);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lllI(579682871, var9 ^ 1967288228);
            }
         }

         lII[var2] = new String(var3).intern();
      }

      return lII[var2];
   }
}
