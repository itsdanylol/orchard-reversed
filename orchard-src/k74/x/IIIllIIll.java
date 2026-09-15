package k74.x;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1661;
import net.minecraft.class_1684;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

@Environment(EnvType.CLIENT)
public final class IIIllIIll extends IlIIIIIIl {
   private int II;
   private boolean I;
   private float Il;
   private int lI;
   private static final IIIlIlIl ll;
   private final lllIIlII III;
   private static final long IIl = 1000L;
   private static final int[] IIIll;
   private int IlI;
   private class_243 Ill;
   private long lII;
   private final boolean lIl;
   private class_243 llI;
   private final lIlllIl lll;
   private boolean IIII;
   private int IIIl;
   private static int IIlI;
   private IIlIlIII IIll;
   private static final long IlII = 3000L;
   private IlIlIIl IlIl;
   private static final Object[] IIlIl;
   private final lllIIlII IllI;
   private static final String[] Illl;
   private int lIII;
   private boolean lIIl;
   private static final String[] lIlI;
   private final lllIIlII lIll;
   private final IIlIII llII;
   private boolean llIl;
   private float lllI;
   private static final int llll = 9;
   private int IIIII;
   private int IIIIl;
   private boolean IIIlI;
   private static final String[] IIlII;

   public IIIllIIll(boolean var1) {
      int var2 = 2114865207;
      super(
         var1
            ? IlIIllIII.lI(IIlII(lIIIl(-853454264, var2 ^ 1335625845), lIIIl(-853454263, var2 ^ -993890186)))
            : IlIIllIII.lI(IIlII(lIIIl(-853454262, var2 ^ 879276031), lIIIl(-853454261, var2 ^ 1988580268))),
         lllIIlIl.I,
         var1
            ? IlIIllIII.lI(IIlII(lIIIl(-853454260, var2 ^ 1725351334), lIIIl(-853454259, var2 ^ 1099906966)))
            : IlIIllIII.lI(IIlII(lIIIl(-853454258, var2 ^ 1505514336), lIIIl(-853454257, var2 ^ 1603280321)))
      );
      this.IlIl = IlIlIIl.ll;
      this.II = -1;
      this.IlI = -1;
      this.IIIII = -1;
      this.lIII = lIIIl(-853454272, var2 ^ 1129066632);
      this.IIIIl = lIIIl(-853454271, var2 ^ -1836092093);
      this.IIIl = lIIIl(-853454270, var2 ^ -1662492013);
      this.lI = -1;
      this.lIl = var1;
      this.III = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIlII(lIIIl(-853454269, var2 ^ 1070321854), lIIIl(-853454268, var2 ^ 505900652))), false));
      this.lIll = this.IllIIll(
         new lllIIlII(IlIIllIII.Ill(IIlII(lIIIl(-853454267, var2 ^ 464429725), lIIIl(-853454266, var2 ^ -644865481))), true).lIlI(this::IlIl)
      );
      this.llII = this.IllIIll(
         new IIlIII(IlIIllIII.Ill(IIlII(lIIIl(-853454265, var2 ^ -84272207), lIIIl(-853454248, var2 ^ -1348232302))), 40.0, 5.0, 100.0, 1.0)
            .IIIl(IlIIllIII.Ill(IIlII(lIIIl(-853454247, var2 ^ 286310377), lIIIl(-853454246, var2 ^ 1773695695))))
            .lIlI(this::lIl)
      );
      this.lll = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(IIlII(lIIIl(-853454245, var2 ^ -1172811819), lIIIl(-853454244, var2 ^ 124681045))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .Ill(IlIIllIII.Ill(IIlII(lIIIl(-853454243, var2 ^ 342149378), lIIIl(-853454242, var2 ^ 1452852100))))
      );
      this.IllI = this.IllIIll(new lllIIlII(IlIIllIII.Ill(IIlII(lIIIl(-853454241, var2 ^ -1955087395), lIIIl(-853454256, var2 ^ 1986599546))), true));
   }

   private void I() {
      this.IlIl = IlIlIIl.ll;
      this.lII = 0L;
      this.II = -1;
      this.IlI = -1;
      this.IIIII = -1;
      this.llIl = false;
      this.IIll = null;
      this.lIII = lIIIl(-853454240, -1759264472 ^ -159570621);
      this.IIIIl = lIIIl(-853454239, -1759264472 ^ 963039112);
      this.IIIl = lIIIl(-853454238, -1759264472 ^ -1863935632);
      this.Ill = null;
      this.llI = null;
      this.I = false;
      this.lI = -1;
      this.lllI = 0.0F;
      this.Il = 0.0F;
   }

   private void II(class_310 var1) {
      this.lIII = lIIIl(-853454237, 867579699 ^ 1947719341);
      if (this.IlIl == IlIlIIl.II) {
         this.Illll(var1);
      }
   }

   public boolean Il() {
      return this.IlIl != IlIlIIl.ll;
   }

   @Override
   public void IlIII() {
      class_310 var1 = class_310.method_1551();
      k74.x.IIll.lllIl(var1, this, lllIII.II);
      this.IIIlI = false;
      this.lIIl = false;
      this.IIII = false;
      this.I();
   }

   public lllIIlII lI() {
      return this.lIll;
   }

   private void ll(class_310 var1, long var2) {
      if (var2 - this.lII > 3000L) {
         this.Illll(var1);
      } else {
         switch (this.IlIl) {
            case II:
               if (!this.llII(var1, this.II, var2)) {
                  return;
               }

               float var7 = var1.field_1724.method_36454();
               float var8 = this.III.IllI() ? -90.0F : var1.field_1724.method_36455();
               this.lllI = var7;
               this.Il = var8;
               this.l(var1, var7, var8);
               if (!this.IlllI(var1, this.II, class_1802.field_8634, var7, var8, this::IIIl)) {
                  return;
               }

               this.lIIII(IlIlIIl.Il, var2);
               break;
            case lI:
               if (var1.field_1724.field_6012 < this.IIIIl) {
                  return;
               }

               if (this.IIll(var1)) {
                  this.Illll(var1);
                  return;
               }

               if (var2 - this.lII > 1000L) {
                  this.Illll(var1);
                  return;
               }

               if (!this.llII(var1, this.IlI, var2)) {
                  return;
               }

               float var4 = var1.field_1724.method_36454();
               float var5 = this.III.IllI() ? -90.0F : var1.field_1724.method_36455();
               if (this.lIl) {
                  float[] var6 = this.lIlI(var1);
                  if (var6 != null) {
                     var4 = var6[0];
                     var5 = var6[1];
                  }
               }

               if (!this.IlllI(var1, this.IlI, class_1802.field_49098, var4, var5, this::Ill)) {
                  return;
               }

               this.lIIII(IlIlIIl.II, var2);
         }
      }
   }

   private void III() {
      this.lIII = lIIIl(-853454236, -1299857861 ^ -1431647492);
      if (this.IlIl == IlIlIIl.Il) {
         this.IlIl = IlIlIIl.l;
      } else if (this.IlIl == IlIlIIl.II) {
         this.IlIl = IlIlIIl.lI;
      }
   }

   public IIlIII IIl() {
      return this.llII;
   }

   private void Ill(class_310 var1) {
      this.II(var1);
   }

   private static double lII(double var0) {
      return 1.4849999999999999 * (1.0 - Math.pow(0.99, var0)) / 0.01;
   }

   private boolean lIl() {
      return this.lIl && this.lIll.IllI();
   }

   @Override
   public void IllIll(class_310 var1) {
      if (!this.IIlll(var1)) {
         this.Illll(var1);
         this.IIIlI = false;
         this.lIIl = false;
      } else {
         long var2 = System.currentTimeMillis();
         if (lIIIllII.ll(var1)) {
            if (this.IlIl != IlIlIIl.ll && var2 - this.lII > 3000L) {
               this.Illll(var1);
            }
         } else if (this.IlIl != IlIlIIl.ll) {
            this.IIIIl(var1);
            this.ll(var1, var2);
         } else if (this.IllII()) {
            this.Illll(var1);
         } else {
            if (this.lIl) {
               boolean var4 = this.IIllIII() && k74.x.IIll.IIIllll(var1, this.IlIIlII());
               boolean var5 = var4 && !this.lIIl;
               this.lIIl = var4;
               if (!var4) {
                  this.IIIlI = false;
               }

               if (!var5) {
                  return;
               }
            }

            if (!this.IIIlI) {
               this.IIIlI = true;
               if (!this.IIllI(var1, var2, this.lIl)) {
                  this.Illll(var1);
                  return;
               }

               this.ll(var1, var2);
            }
         }
      }
   }

   private void llI(class_310 var1, int var2) {
      boolean var3 = k74.x.IIll.lIIlI(var1) != var2;
      int var4 = var3 ? this.IIIlI(this.lll) : 0;
      this.IIll = k74.x.IIll.llII(var1, this, var2, var4, true);
   }

   private static float[] lll(class_243 var0) {
      class_243 var1 = var0.method_1029();
      double var2 = Math.sqrt(var1.field_1352 * var1.field_1352 + var1.field_1350 * var1.field_1350);
      float var4 = (float)(class_3532.method_15349(var1.field_1350, var1.field_1352) * (180.0 / Math.PI)) - 90.0F;
      float var5 = (float)(-(class_3532.method_15349(var1.field_1351, var2) * (180.0 / Math.PI)));
      return new float[]{class_3532.method_15393(var4), class_3532.method_15363(var5, -90.0F, 90.0F)};
   }

   public lllIIlII IIII() {
      return this.III;
   }

   private void IIIl(class_310 var1) {
      this.lIll(var1);
   }

   private static String lIIlI(char var0, short var1, byte var2, int var3, int var4, int var5, short var6) {
      int var11 = var4 ^ -1481649672;
      char[] var10 = IIlII[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])IIlIl[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = new Throwable().getStackTrace();
         IIlIl[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 29603;

      for (int var9 = 0; var9 < var10.length; var9++) {
         var10[var9] = (char)(var10[var9] ^ 'ꈠ' ^ switch (var9 % 21) {
            default -> 109;
            case 1 -> 169;
            case 2 -> 4;
            case 3 -> 141;
            case 4 -> 132;
            case 5 -> 70;
            case 6 -> 228;
            case 7 -> 203;
            case 8 -> 34;
            case 9 -> 231;
            case 10 -> 254;
            case 11 -> 159;
            case 12 -> 109;
            case 13 -> 45;
            case 14 -> 22;
            case 15 -> 11;
            case 16 -> 155;
            case 17 -> 106;
            case 18 -> 183;
            case 19 -> 124;
            case 20 -> 86;
         } ^ var9 ^ var2 ^ var4 ^ var3 ^ var0 ^ var1 ^ var6 ^ var5 ^ var8);
      }

      return new String(var10).intern();
   }

   private long IIlI(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();
      return var2 >= var4 ? Math.max(0L, Math.round(var2)) : Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private boolean IIll(class_310 var1) {
      return this.I && var1 != null && var1.field_1724 != null && var1.field_1724.field_6012 - this.IIIl > 5 && this.Illl(var1) == null;
   }

   @Override
   public void IlllII(JsonObject var1) {
      super.IlllII(var1);
      this.IIIIIIl(var1, ll.llIl());
      if (this.lll.IIlI() == 55.0 && this.lll.IlI() == 60.0) {
         this.lll.III(new double[]{0.0, 0.0});
      }
   }

   private static class_243 IlII(float var0, float var1) {
      float var2 = var0 * (float) (Math.PI / 180.0);
      float var3 = -var1 * (float) (Math.PI / 180.0);
      float var4 = class_3532.method_15362(var3);
      float var5 = class_3532.method_15374(var3);
      float var6 = class_3532.method_15362(var2);
      float var7 = class_3532.method_15374(var2);
      return new class_243(var5 * var6, -var7, var4 * var6);
   }

   private boolean IlIl() {
      return this.lIl;
   }

   private void IllI(class_310 var1) {
      this.lIII = lIIIl(-853454235, 618077736 ^ 1651109162);
      if (this.IlIl == IlIlIIl.Il || this.IlIl == IlIlIIl.II) {
         this.Illll(var1);
      }
   }

   private class_1684 Illl(class_310 var1) {
      if (var1 != null && var1.field_1687 != null && var1.field_1724 != null && this.I) {
         if (this.Ill != null && this.llI != null && this.IIIl != lIIIl(-853454234, 781068226 ^ -306140342)) {
            int var2 = var1.field_1724.field_6012 - this.IIIl;
            if (var2 >= 0 && var2 <= lIIIl(-853454233, 781068226 ^ 316566683)) {
               if (this.lI != -1) {
                  if (var1.field_1687.method_8469(this.lI) instanceof class_1684 var4 && !var4.method_31481() && var4.method_5805()) {
                     return var4;
                  }

                  this.lI = -1;
               }

               class_243 var17 = this.Ill;
               class_243 var18 = this.llI;

               for (int var5 = 0; var5 < var2; var5++) {
                  var18 = new class_243(var18.field_1352 * 0.99, (var18.field_1351 - 0.03) * 0.99, var18.field_1350 * 0.99);
                  var17 = var17.method_1019(var18);
               }

               class_1684 var19 = null;
               double var6 = 4.0;

               for (class_1297 var9 : var1.field_1687.method_18112()) {
                  if (var9 instanceof class_1684 var10 && !var10.method_31481() && var10.method_5805()) {
                     class_1297 var11 = var10.method_24921();
                     if ((var11 == null || var11.method_5667().equals(var1.field_1724.method_5667())) && var10.field_6012 <= var2 + 2) {
                        double var12 = var10.method_5707(var17);
                        if (var12 <= var6) {
                           class_243 var14 = var10.method_18798();
                           if (var18.method_1027() > 1.0E-4 && var14.method_1027() > 1.0E-4) {
                              double var15 = var14.method_1029().method_1026(var18.method_1029());
                              if (var15 < 0.75) {
                                 continue;
                              }
                           }

                           var6 = var12;
                           var19 = var10;
                        }
                     }
                  }
               }

               if (var19 != null) {
                  this.lI = var19.method_5628();
               }

               return var19;
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -2139233002;
      String[] var9 = new String[2];
      int var10 = 0;
      short var12 = 10819;
      int var10001 = "ı讽뽤蛝齠鴝㽧鲽띠騝\udf61閝罣鬝ᝦ脽来鉽\ue763鮽潥驽\ue766赝\udf61詝靧趝佧鰝靡針轢襝❢錝흥鐽蝧菽띥鬽❣肽齢蚽蝦赽䝢龝坡鞝潥脽睦钽齠騝\udf60顽꽢蒽罣鄝འ蝝䝡鍝佢餝읣蠝｢龝㽠魽齥韝\uef67鈝\uf764鶽靤逝⽧鬽읦蜝띥馽㽧赝ὥ躽㽦躝杣鉝㽥袝Ꝣ额齢辝轥锽罦馽轧鎝㽢鿝ὤ閽ｦ莝㽧麝꽢能轡諽坦腝꽡钝䝥齝ｦ貝\uf765鉽潣驝蝡菝ꝡ螽ὣ霝靣菽彠闽흠赝\ue764赝轤譝靧骽齥贝罥魽ᝠ肝䝦雝靧騽ᝡ蕝坠耽潢鿝\udf63褽㝢龽䝠臝꽢餽꽤麝坠鸽\uef63袝罥鲽ὧ蹝\ue763閝㝣耝읦聝杤镝꽥鎝㝥蓽ݥ蔝ｦ鱽ὦ鞝⽥蘝睦茝འ鴝蝧藝흤頝｠觝杧蒽ὦ蜝\ue762贽彥軝坡鐽你鏽ལ饽ὣ餝㝤鴽佥追읧霽㝣葝\uf765龝坦茽靤薽⽠莝띢蔝齤蝽읠跽佣陽ཤ묽ｮꀽὭ늽ꝫꝝꝫꢽ띮낽ｪꐝݩ\uaa3dᝫ깝杫ꪝᝨꯝ罨ꆝ뽭ꤝ潨땽蝩ꐝὭ\ua83d㝮껽띭뽝ᝫꁝὭ늽睩ꓽὩ룽潬뤝睪몝\uef69롽\u0011Ὲ䈇\u1ae8騄݈ꈆឈሄᄈሆᓨਇ֨䈃ወ稅\u0fe8"
         .length();
      int var11 = 0;
      int var8 = var10001;
      String var7 = "ı讽뽤蛝齠鴝㽧鲽띠騝\udf61閝罣鬝ᝦ脽来鉽\ue763鮽潥驽\ue766赝\udf61詝靧趝佧鰝靡針轢襝❢錝흥鐽蝧菽띥鬽❣肽齢蚽蝦赽䝢龝坡鞝潥脽睦钽齠騝\udf60顽꽢蒽罣鄝འ蝝䝡鍝佢餝읣蠝｢龝㽠魽齥韝\uef67鈝\uf764鶽靤逝⽧鬽읦蜝띥馽㽧赝ὥ躽㽦躝杣鉝㽥袝Ꝣ额齢辝轥锽罦馽轧鎝㽢鿝ὤ閽ｦ莝㽧麝꽢能轡諽坦腝꽡钝䝥齝ｦ貝\uf765鉽潣驝蝡菝ꝡ螽ὣ霝靣菽彠闽흠赝\ue764赝轤譝靧骽齥贝罥魽ᝠ肝䝦雝靧騽ᝡ蕝坠耽潢鿝\udf63褽㝢龽䝠臝꽢餽꽤麝坠鸽\uef63袝罥鲽ὧ蹝\ue763閝㝣耝읦聝杤镝꽥鎝㝥蓽ݥ蔝ｦ鱽ὦ鞝⽥蘝睦茝འ鴝蝧藝흤頝｠觝杧蒽ὦ蜝\ue762贽彥軝坡鐽你鏽ལ饽ὣ餝㝤鴽佥追읧霽㝣葝\uf765龝坦茽靤薽⽠莝띢蔝齤蝽읠跽佣陽ཤ묽ｮꀽὭ늽ꝫꝝꝫꢽ띮낽ｪꐝݩ\uaa3dᝫ깝杫ꪝᝨꯝ罨ꆝ뽭ꤝ潨땽蝩ꐝὭ\ua83d㝮껽띭뽝ᝫꁝὭ늽睩ꓽὩ룽潬뤝睪몝\uef69롽\u0011Ὲ䈇\u1ae8騄݈ꈆឈሄᄈሆᓨਇ֨䈃ወ稅\u0fe8";

      do {
         int var15 = 0;
         char var13 = var7.charAt(var11);
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            char var16 = var14[var15];
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

      IIlII = var9;
      IIlIl = new Object[var9.length];
      int var10000 = 0;
      int var22 = 0;
      IIIll = new int[315];
      byte[] var10002 = "÷ßó\u0014|\u0082\u0099H\u008c+T\u009bÎÅuÔÞ\u0095>ÂùÌ\\Uáÿ¨|çÓHð{\u000f\u0097\u0086ªÌÒL¤«Å\u009f\u0087\u0088+Ù¦d;Y£íY\u008baÓ§BB¹àÙ\u0017ãKj©SD\u009bÑûDD\u0002[´£¿-=\u000e¬'2zîØ\u0015É34@®Î)åÄÙ{©{\u0099\u000e¬F\u0082\u0080³¬s²\u001a¦\u009b\u008afÚqëWÇ\u0093Ýh¬:úENBÑíèn|\u0013\u001eu!¿}S\u000e\u008bïbc¥@\u0092dUX8ÛòX'\u0013\u000brè\bá¸A\u0088·C\u0001ì\u000e\u0084^b\u009bÚ\u0000ó\u001c\u001e\u0085\u0003c\u0097ú\u001dª±§aÝ\u0019þdë\u00adòÖÔæ\u008a%\u008cx\u0084' zõDG&ûå\u0013z\u0015ðjÖ¯ÑºÝ<Íã|ÒÚÃ]õò¦b8A\fr\u0093Æù\u001bm\u000b\u0085×\u0097ue\u0083ßeû\u0019S\u001fï^\u0091\f~1\u009byÅ\u0011\u0018*q\u001d¹g1v\u0086\u008fSåWò³\u000b;\u009d\u0015: âàCÖøo»ìv\u0099ª¬T>ü¬íßØ\u008e>æ©\u0096yh¥ÔÏB\u007f \u008d;\b²\u0007#ð\u0096\u009d_¼VmÄXáÑ\u000eÊ\u001co\u0011'¼Ð\u0015_FJöï\u008c®µ%§\u0099³&]·8\u0012yuJ©sÄ\u008f;ò \u0011\u0002¿\u0093ÿ½C\u008a}oV3ÿ\u001en\u008câZ\tÅ>»n¦f'ºj¤à\u0084ø¸\u00801\u0003Ð¡Ö\u0007\u001c\u0006\u009c÷ï\u0016\u0012XiF\u0099,çê\u0013½\u0016fD9[\u00188¥ú¶Í£Ç/dº»\u00011Þ\u0090\u000f¯\u0000¾r¥\u001c/ëAèy\\öz\u009aJ\"Æ\tRiV¥vL\u0014\u0095zzÁ\u00882@JÒ\u0018í/Â\u009dÛ^Ê\\á/#[¬q'\u008a\u0001Ò\u0011&\u0007¼åpa{ø2qµªÖ¾®DöÖÑZ÷ï1g\u0090IIÔ\u0090\u0087\u009a´X÷\u0092Zm\u0001=\u008a\u0015\u0086s\u0001©\u0096Ô_8\u0087\u0018¢|t\u0088L$Ì;L&{<q«\u001f¥ë\u0015\u0011\u0087òMK\u00863ª¥`9\u0091¸³J¹EåÐO(Ðb&ß\u009e+c'~Ðó\u0081LZKRi=Ó,¿7X5R¦»gá¸¬´×ÁU\u009a6ldr¢W\u0003?ò\u001c\u009bðÿi(²Á\u0001zz×¸\u00ad!\u0016)´°8\u001cv°\u0080h\u0080\u0017ë\u0082\u0001÷Ã24RúOeZm½²5m3¯P¢alôïÇi\u0098\u0012$\u007füça\u009e\u0003Åg2\u0090=Uóý\u008bLÉ ÌU¶ëÿ¶A\u001c{\u0097ë|å¸í¬.Yô:\u0088\r\u0086\u000fUL)y\u009d\u0096\u009e\u0099Æ\u0010ÛÉ\u0006\u009c¶\u001dÓ \u000bög$¢\u0019>\u001c^ßÆhõÑ£\u0098(\u001eL3\u0094Á\fhí÷.ñ\u0082ò\\Ê\f\b\u0085îX\f\u0018½â}R æ/\u0012\u0095SyzsU'~G\u000fj\u0085¬Snà0Üª¾}ZRl4P8\u0085\u008a;\u0011\u001c\u0014&ø$áêè\u0014ÕbË\f\rõa-\u00164\u001cLÚ~êU\u0083\u0002\u001cË©°¨zèF\u008akrg\u00ad\u0086U±£ª\u009fÄ\u0000£\u00016u \u0013/\u0089ù\u0005i¥&\u0000°(¡Y\u001dÝÞX\u0005¬\u0000uÛév+n\u0002bñ]\u0098á\u0099lØ}j\n\u001el\u000få\u0011Ïp7ÿ°yLÈ\u0004_§n,\bW\u0094\u0092Î¯\u0007;¿Pj\u0091(HAQ\u0094åò§i\u000b0±\u00ad\u0013\u008aË`¨\u009fH)\u0084êôÐ1ù=¢ñÁòè\u0080àõ\u0094ªL\u0000\u000b=ësI ®$u\u0095æ\u0011¼¹è]\\²U§©å\u008b+o\u0018ß\u009f#@Î¢ä\u008aSmlcI\u0013\u008f¹SÝòi\u007fMè^\u0016.\tÉ\u0095\u009a\u001aÅ\u0091¿Ú0'cî\r{\u0084ÔÆB\u0016ª\u0016)àlU\u001eà5z\u007f\u0016þÙÉ\u008a6 ö«/\u0083Q\u001b£Ä\nÓx\u0091W\u0012\\\u0083ä¹ÇÊ5(FýÊ\u001c·¢t)\u008eo\u0019³Å\u0014·Ês\u0095Ôv\\î\u008c\u0006Fç\u0093Gÿþn»\u008c\"y\u0015\u008b\u00046\u0096ú\u0093\u0012ÉýÛÖÙ.\u0006\u009a\u0000\u0080I\u0088d\u0085bá\u009d\u008a\u0089·Ä\" \u0093\tFçÍ\u0084BïÿW\u000f\u001d§ETõþ¹Å/\u0094F\u0085sDâu9ãV±¿ÕòþÛÈ\u0094Í\u0001é(+ØÐ {\u0012\u0095\u0004qI&]±z×,ò\fzÉ9vøî(çÃí6^¤Jg¹+ÇV\u0098"
         .getBytes("ISO-8859-1");

      int var53;
      do {
         IIIll[var10000] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255)
            ^ 191705082;
         var10000 += 1;
         var53 = var22 + 4;
         var22 += 4;
      } while (var53 < var10002.length);

      String[] var5 = new String[lIIIl(-853454255, var17 ^ -1622432959)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIIlI('亜', 1997, (byte)-109, -1844548402, -1481649672, 746304285, 30329)).length();
      int var1 = lIIIl(-853454254, var17 ^ -549542293);
      int var19 = -1;

      label89:
      while (true) {
         var10000 = lIIIl(-853454253, var17 ^ -995051711);
         String var25 = var2.substring(++var19, var19 + var1);
         byte var37 = -1;

         while (true) {
            label84: {
               char[] var55 = var25.toCharArray();
               int var67 = var55.length;
               int var6 = 0;
               var53 = var10000;
               var42 = var55;
               var22 = var67;
               char[] var79;
               int var86;
               if (var67 <= 1) {
                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               } else {
                  var53 = var10000;
                  var22 = var67;
                  if (var67 <= var6) {
                     break label84;
                  }

                  var79 = var55;
                  var67 = var10000;
                  var86 = var6;
               }

               while (true) {
                  var79[var86] = (char)(var79[var86] ^ var67 ^ switch (var6 % lIIIl(-853454250, var17 ^ 937123325)) {
                     case 0 -> 5;
                     case 1 -> lIIIl(-853454249, var17 ^ -705863026);
                     case 2 -> lIIIl(-853454232, var17 ^ 2093629868);
                     case 3 -> lIIIl(-853454231, var17 ^ 81914115);
                     case 4 -> lIIIl(-853454230, var17 ^ 676075794);
                     case 5 -> lIIIl(-853454229, var17 ^ 856800180);
                     default -> lIIIl(-853454228, var17 ^ 356418047);
                  });
                  var6++;
                  if (var53 == 0) {
                     var86 = var53;
                     var79 = var42;
                     var67 = var53;
                  } else {
                     if (var22 <= var6) {
                        break;
                     }

                     var79 = var42;
                     var67 = var53;
                     var86 = var6;
                  }
               }
            }

            String var60 = new String(var42).intern();
            switch (var37) {
               case 0:
                  var5[var3++] = var60;
                  if ((var19 += var1) >= var4) {
                     Illl = var5;
                     lIlI = new String[lIIIl(-853454251, var17 ^ -574984988)];
                     ll = IlIIllIII.Ill(IIlII(lIIIl(-853454227, var17 ^ 609481510), lIIIl(-853454226, var17 ^ -732481313)));
                     IIlI = lIIIl(-853454225, var17 ^ -18089896);
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var60;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label89;
                  }

                  var4 = (var2 = lIIlI('Н', (short)-30402, (byte)118, 459649369, -1481649671, 1447412310, 19913)).length();
                  var1 = 4;
                  var19 = -1;
            }

            var10000 = lIIIl(-853454252, var17 ^ 897719905);
            var25 = var2.substring(++var19, var19 + var1);
            var37 = 0;
         }
      }
   }

   @Override
   public boolean IIIlIII() {
      return this.lIl;
   }

   private int lIII(class_1661 var1, class_1792 var2) {
      if (var1 == null) {
         return -1;
      } else {
         for (int var3 = 0; var3 < lIIIl(-853454216, -431807519 ^ -2022764048); var3++) {
            if (var1.method_5438(var3).method_31574(var2)) {
               return var3;
            }
         }

         return -1;
      }
   }

   private boolean lIIl(class_310 var1, boolean var2) {
      if (var1 != null && var1.field_1724 != null) {
         boolean var3 = var1.field_1724.method_7357().method_7904(new class_1799(class_1802.field_8634));
         boolean var4 = var2 && var1.field_1724.method_7357().method_7904(new class_1799(class_1802.field_49098));
         return var3 || var4;
      } else {
         return true;
      }
   }

   private float[] lIlI(class_310 var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (!this.lIl || var1 == null || var1.field_1724 == null || var1.field_1687 == null) {
         return null;
      } else if (this.Il <= -88.0F) {
         return new float[]{class_3532.method_15393(var1.field_1724.method_36454()), -90.0F};
      } else if (this.I && this.Ill != null && this.llI != null && this.IIIl != lIIIl(-853454215, -823918151 ^ 1993147668)) {
         class_243 var7;
         class_243 var8;
         class_243 var9;
         class_243 var10;
         label184: {
            byte var35 = 2;
            int var36 = var1.field_1724.field_6012 + var35;
            int var5 = Math.max(0, var36 - this.IIIl);
            class_243 var6 = var1.field_1724.method_60478();
            var7 = new class_243(var6.field_1352, var1.field_1724.method_24828() ? 0.0 : var6.field_1351, var6.field_1350);
            var8 = var1.field_1724.method_33571().method_1019(var7.method_1021(var35));
            class_1684 var11 = this.Illl(var1);
            if (var11 != null) {
               var9 = new class_243(var11.method_23317(), var11.method_23318(), var11.method_23321());
               var10 = var11.method_18798();
               int var12 = 0;

               while (var12 < var35) {
                  var10 = new class_243(var10.field_1352 * 0.99, (var10.field_1351 - 0.03) * 0.99, var10.field_1350 * 0.99);
                  var9 = var9.method_1019(var10);
                  var12++;
                  if (var2 != null) {
                     break;
                  }
               }

               if (var2 == null) {
                  break label184;
               }
            }

            var9 = this.Ill;
            var10 = this.llI;
            int var37 = 0;

            while (var37 < var5) {
               var10 = new class_243(var10.field_1352 * 0.99, (var10.field_1351 - 0.03) * 0.99, var10.field_1350 * 0.99);
               var9 = var9.method_1019(var10);
               var37++;
               if (var2 != null) {
                  break;
               }
            }
         }

         int var38 = Math.max(lIIIl(-853454214, -823918151 ^ -92326742), (int)Math.round(this.llII.IllI()) + lIIIl(-853454213, -823918151 ^ -2104728881));
         ArrayList var13 = new ArrayList(var38 + 1);
         var13.add(var9);
         class_243 var14 = var9;
         class_243 var15 = var10;
         int var16 = 0;

         while (var16 < var38) {
            var15 = new class_243(var15.field_1352 * 0.99, (var15.field_1351 - 0.03) * 0.99, var15.field_1350 * 0.99);
            class_243 var17 = var14.method_1019(var15);
            class_3965 var18 = var1.field_1687.method_17742(new class_3959(var14, var17, class_3960.field_17558, class_242.field_1348, var1.field_1724));
            if (var18.method_17783() != class_240.field_1333) {
               var13.add(var18.method_17784());
               if (var2 == null) {
                  break;
               }
            }

            var14 = var17;
            var13.add(var17);
            var16++;
            if (var2 != null) {
               break;
            }
         }

         if (!this.lIll.IllI()) {
            class_243 var40 = (class_243)var13.get(0);
            class_243 var41 = var40.method_1020(var8);
            if (var41.method_1027() < 1.0E-5) {
               float var44 = var1.field_1724.method_36454();
               float var45 = this.III.IllI() ? -90.0F : var1.field_1724.method_36455();
               return new float[]{class_3532.method_15393(var44), class_3532.method_15363(var45, -90.0F, 90.0F)};
            } else {
               double var43 = Math.sqrt(var41.method_1027()) / 1.4;
               class_243 var20 = var40.method_1031(0.0, IIIII(var43), 0.0).method_1020(var8);
               float[] var47 = lll(var20);
               return new float[]{var47[0], var47[1]};
            }
         } else {
            double var39 = Double.MAX_VALUE;
            class_243 var42 = null;
            double var19 = var13.size() - 1;
            double var21 = 0.2;

            while (var21 <= var19) {
               int var23 = (int)Math.floor(var21);
               if (var23 >= 0 && (var23 < var13.size() - 1 || var2 != null)) {
                  double var24 = var21 - var23;
                  class_243 var26 = (class_243)var13.get(var23);
                  class_243 var27 = (class_243)var13.get(var23 + 1);
                  class_243 var28 = var26.method_35590(var27, var24);
                  class_243 var29 = var28.method_1031(0.0, IIIII(var21), 0.0).method_1020(var8).method_1020(var7.method_1021(var21));
                  double var30 = var29.method_1033();
                  if (!(var30 < 1.0E-5)) {
                     double var32 = Math.abs(var30 - lII(var21));
                     if (var32 < var39) {
                        class_3965 var34 = var1.field_1687
                           .method_17742(new class_3959(var8, var28, class_3960.field_17558, class_242.field_1348, var1.field_1724));
                        if (var34.method_17783() == class_240.field_1333 || var8.method_1022(var34.method_17784()) >= var28.method_1022(var8) - 0.3) {
                           var39 = var32;
                           var42 = var29;
                           if (var32 < 0.01 && var2 == null) {
                              break;
                           }
                        }
                     }
                  }
               }

               var21 += 0.05;
               if (var2 != null) {
                  break;
               }
            }

            class_243 var46;
            if (var42 != null) {
               var46 = var42.method_1029();
            } else {
               int var22 = Math.max(0, var13.size() - 1);
               var46 = ((class_243)var13.get(var22)).method_1020(var8);
               if (var46.method_1027() < 1.0E-5) {
                  var46 = this.llI != null && this.llI.method_1027() > 1.0E-5 ? this.llI : new class_243(0.0, 1.0, 0.0);
               }
            }

            float[] var48 = lll(var46);
            return new float[]{var48[0], var48[1]};
         }
      } else {
         float var3 = var1.field_1724.method_36454();
         float var4 = this.III.IllI() ? -90.0F : var1.field_1724.method_36455();
         return new float[]{class_3532.method_15393(var3), class_3532.method_15363(var4, -90.0F, 90.0F)};
      }
   }

   private void lIll(class_310 var1) {
      this.lIII = lIIIl(-853454212, -1116864679 ^ 2131210278);
      if (this.IlIl == IlIlIIl.Il) {
         if (!this.llIl) {
            this.Illll(var1);
         } else {
            this.l(var1, this.lllI, this.Il);
            long var2 = System.currentTimeMillis();
            this.IIIIl = var1.field_1724.field_6012 + 1;
            this.IIIl = var1.field_1724.field_6012;
            this.lIIII(IlIlIIl.lI, var2);
         }
      }
   }

   private boolean llII(class_310 var1, int var2, long var3) {
      if (this.IIll == null || this.IIll.III() != var2) {
         this.llI(var1, var2);
      }

      return this.IIll != null && this.IIll.IIl() && k74.x.IIll.IIIllII(var1, this.IIll) && k74.x.IIll.IIlII(var1.field_1724.method_31548()) == var2;
   }

   private static void lllI(int var0) {
      IIlI = var0;
   }

   private static double IIIII(double var0) {
      return 2.97 * (var0 - 99.0 * (1.0 - Math.pow(0.99, var0)));
   }

   private void IIIIl(class_310 var1) {
      if (var1 != null && var1.field_1724 != null && this.lIII != lIIIl(-853454211, 462888361 ^ -1465993845)) {
         if (var1.field_1724.field_6012 > this.lIII) {
            this.III();
         }
      }
   }

   private int IIIlI(lIlllIl var1) {
      return Math.max(0, (int)Math.ceil(this.IIlI(var1) / 50.0));
   }

   private void IIIll(class_310 var1) {
      int var2 = this.IIIII;
      if (this.IllI.IllI() && var2 >= 0 && var2 < lIIIl(-853454210, -1804559388 ^ -1445435504) && var1 != null && var1.field_1724 != null) {
         k74.x.IIll.llIllI(var1, this, var2);
      } else {
         k74.x.IIll.lllIl(var1, this, lllIII.I);
      }

      this.IIll = null;
      this.IIII = true;
   }

   private void l(class_310 var1, float var2, float var3) {
      if (var1 != null && var1.field_1724 != null) {
         this.IIIl = var1.field_1724.field_6012;
         this.Ill = var1.field_1724.method_33571().method_1023(0.0, 0.1F, 0.0);
         class_243 var4 = var1.field_1724.method_60478();
         class_243 var5 = new class_243(var4.field_1352, var1.field_1724.method_24828() ? 0.0 : var4.field_1351, var4.field_1350);
         class_243 var6 = IlII(var3, var2);
         this.llI = var6.method_1021(1.5).method_1019(var5);
         this.I = true;
         this.lI = -1;
      }
   }

   private static String IIlII(int var0, int var1) {
      int var9 = -1138364130;
      int var2 = (var0 ^ lIIIl(-853454209, var9 ^ 1872242899)) & lIIIl(-853454224, var9 ^ -709188367);
      if (lIlI[var2] == null) {
         char[] var3 = Illl[var2].toCharArray();

         int var4 = switch (var3[0] & lIIIl(-853454223, var9 ^ 1185280593)) {
            case 0 -> lIIIl(-853454222, var9 ^ -1464675777);
            case 1 -> lIIIl(-853454221, var9 ^ -1885686018);
            case 2 -> lIIIl(-853454220, var9 ^ 1109990780);
            case 3 -> lIIIl(-853454219, var9 ^ -374413550);
            case 4 -> lIIIl(-853454218, var9 ^ 392402161);
            case 5 -> lIIIl(-853454217, var9 ^ -316836674);
            case 6 -> lIIIl(-853454328, var9 ^ -1525814296);
            case 7 -> lIIIl(-853454327, var9 ^ 695730105);
            case 8 -> lIIIl(-853454326, var9 ^ -345739464);
            case 9 -> lIIIl(-853454325, var9 ^ -518924852);
            case 10 -> lIIIl(-853454324, var9 ^ 1648521070);
            case 11 -> lIIIl(-853454323, var9 ^ -1022418489);
            case 12 -> lIIIl(-853454322, var9 ^ -51952806);
            case 13 -> lIIIl(-853454321, var9 ^ 765109121);
            case 14 -> lIIIl(-853454336, var9 ^ 1106576863);
            case 15 -> lIIIl(-853454335, var9 ^ -628428543);
            case 16 -> lIIIl(-853454334, var9 ^ -1399816463);
            case 17 -> lIIIl(-853454333, var9 ^ -1776383692);
            case 18 -> lIIIl(-853454332, var9 ^ -700698710);
            case 19 -> lIIIl(-853454331, var9 ^ -695873839);
            case 20 -> lIIIl(-853454330, var9 ^ -195626788);
            case 21 -> lIIIl(-853454329, var9 ^ -334399084);
            case 22 -> lIIIl(-853454312, var9 ^ -1364763643);
            case 23 -> lIIIl(-853454311, var9 ^ -622515310);
            case 24 -> lIIIl(-853454310, var9 ^ -932236506);
            case 25 -> lIIIl(-853454309, var9 ^ -319467670);
            case 26 -> lIIIl(-853454308, var9 ^ 738579815);
            case 27 -> 1;
            case 28 -> lIIIl(-853454307, var9 ^ -1682366562);
            case 29 -> lIIIl(-853454306, var9 ^ 1711735210);
            case 30 -> lIIIl(-853454305, var9 ^ -961018375);
            case 31 -> lIIIl(-853454320, var9 ^ 1008920094);
            case 32 -> lIIIl(-853454319, var9 ^ -154753653);
            case 33 -> lIIIl(-853454318, var9 ^ -571366424);
            case 34 -> lIIIl(-853454317, var9 ^ 668936361);
            case 35 -> lIIIl(-853454316, var9 ^ 52255248);
            case 36 -> lIIIl(-853454315, var9 ^ 162307640);
            case 37 -> lIIIl(-853454314, var9 ^ -2008547266);
            case 38 -> lIIIl(-853454313, var9 ^ -973344920);
            case 39 -> lIIIl(-853454296, var9 ^ 971140513);
            case 40 -> lIIIl(-853454295, var9 ^ 744222708);
            case 41 -> lIIIl(-853454294, var9 ^ 350548782);
            case 42 -> lIIIl(-853454293, var9 ^ 1940729805);
            case 43 -> lIIIl(-853454292, var9 ^ 349075176);
            case 44 -> lIIIl(-853454291, var9 ^ -1073564273);
            case 45 -> lIIIl(-853454290, var9 ^ -24074166);
            case 46 -> lIIIl(-853454289, var9 ^ 1265352812);
            case 47 -> lIIIl(-853454304, var9 ^ -1402008363);
            case 48 -> lIIIl(-853454303, var9 ^ -425721949);
            case 49 -> lIIIl(-853454302, var9 ^ 1748007344);
            case 50 -> 0;
            case 51 -> lIIIl(-853454301, var9 ^ -482019635);
            case 52 -> lIIIl(-853454300, var9 ^ 1775568622);
            case 53 -> lIIIl(-853454299, var9 ^ 1045515181);
            case 54 -> lIIIl(-853454298, var9 ^ 1120791432);
            case 55 -> lIIIl(-853454297, var9 ^ -1211377777);
            case 56 -> lIIIl(-853454280, var9 ^ 517122945);
            case 57 -> lIIIl(-853454279, var9 ^ 1270255168);
            case 58 -> lIIIl(-853454278, var9 ^ -714559839);
            case 59 -> lIIIl(-853454277, var9 ^ -546029848);
            case 60 -> lIIIl(-853454276, var9 ^ 998271416);
            case 61 -> lIIIl(-853454275, var9 ^ -1944941791);
            case 62 -> lIIIl(-853454274, var9 ^ 1487804838);
            case 63 -> lIIIl(-853454273, var9 ^ 322876541);
            case 64 -> lIIIl(-853454288, var9 ^ 914129945);
            case 65 -> lIIIl(-853454287, var9 ^ 11114672);
            case 66 -> lIIIl(-853454286, var9 ^ 975356665);
            case 67 -> lIIIl(-853454285, var9 ^ -1756900805);
            case 68 -> lIIIl(-853454284, var9 ^ -1590240471);
            case 69 -> lIIIl(-853454283, var9 ^ -1689832939);
            case 70 -> lIIIl(-853454282, var9 ^ -702990520);
            case 71 -> lIIIl(-853454281, var9 ^ 2075791209);
            case 72 -> lIIIl(-853454136, var9 ^ 2111108412);
            case 73 -> lIIIl(-853454135, var9 ^ 454289488);
            case 74 -> lIIIl(-853454134, var9 ^ 199079009);
            case 75 -> lIIIl(-853454133, var9 ^ -993635036);
            case 76 -> lIIIl(-853454132, var9 ^ -1397142839);
            case 77 -> lIIIl(-853454131, var9 ^ -1789298792);
            case 78 -> lIIIl(-853454130, var9 ^ 857851146);
            case 79 -> lIIIl(-853454129, var9 ^ -34428162);
            case 80 -> lIIIl(-853454144, var9 ^ -1912976464);
            case 81 -> lIIIl(-853454143, var9 ^ 2069207556);
            case 82 -> lIIIl(-853454142, var9 ^ -65335238);
            case 83 -> lIIIl(-853454141, var9 ^ -323206764);
            case 84 -> lIIIl(-853454140, var9 ^ -42945658);
            case 85 -> lIIIl(-853454139, var9 ^ 249585094);
            case 86 -> lIIIl(-853454138, var9 ^ -1236053371);
            case 87 -> lIIIl(-853454137, var9 ^ 22306917);
            case 88 -> lIIIl(-853454120, var9 ^ 1707997997);
            case 89 -> lIIIl(-853454119, var9 ^ 1810883141);
            case 90 -> lIIIl(-853454118, var9 ^ 837690286);
            case 91 -> lIIIl(-853454117, var9 ^ -553113185);
            case 92 -> lIIIl(-853454116, var9 ^ -1025811766);
            case 93 -> lIIIl(-853454115, var9 ^ 1066254370);
            case 94 -> lIIIl(-853454114, var9 ^ 1387819589);
            case 95 -> lIIIl(-853454113, var9 ^ -1510589701);
            case 96 -> lIIIl(-853454128, var9 ^ 1561772390);
            case 97 -> lIIIl(-853454127, var9 ^ -81507427);
            case 98 -> lIIIl(-853454126, var9 ^ 671165933);
            case 99 -> lIIIl(-853454125, var9 ^ 1456940912);
            case 100 -> lIIIl(-853454124, var9 ^ 1329247965);
            case 101 -> lIIIl(-853454123, var9 ^ 495560923);
            case 102 -> lIIIl(-853454122, var9 ^ -826286089);
            case 103 -> lIIIl(-853454121, var9 ^ -530681128);
            case 104 -> lIIIl(-853454104, var9 ^ 147474157);
            case 105 -> lIIIl(-853454103, var9 ^ 1167723669);
            case 106 -> lIIIl(-853454102, var9 ^ -1969784901);
            case 107 -> lIIIl(-853454101, var9 ^ -928444374);
            case 108 -> lIIIl(-853454100, var9 ^ 12560758);
            case 109 -> lIIIl(-853454099, var9 ^ 1534998952);
            case 110 -> lIIIl(-853454098, var9 ^ -900726032);
            case 111 -> lIIIl(-853454097, var9 ^ -890734303);
            case 112 -> lIIIl(-853454112, var9 ^ 1837339204);
            case 113 -> lIIIl(-853454111, var9 ^ -1918164363);
            case 114 -> lIIIl(-853454110, var9 ^ 680681324);
            case 115 -> lIIIl(-853454109, var9 ^ 537242703);
            case 116 -> lIIIl(-853454108, var9 ^ 1325736550);
            case 117 -> lIIIl(-853454107, var9 ^ 717910165);
            case 118 -> lIIIl(-853454106, var9 ^ -1903700351);
            case 119 -> lIIIl(-853454105, var9 ^ -495307308);
            case 120 -> lIIIl(-853454088, var9 ^ -2037416172);
            case 121 -> lIIIl(-853454087, var9 ^ 2041411415);
            case 122 -> lIIIl(-853454086, var9 ^ -363510385);
            case 123 -> lIIIl(-853454085, var9 ^ -2015142631);
            case 124 -> lIIIl(-853454084, var9 ^ 1520715227);
            case 125 -> lIIIl(-853454083, var9 ^ -1852332513);
            case 126 -> lIIIl(-853454082, var9 ^ 1712555614);
            case 127 -> lIIIl(-853454081, var9 ^ 109947021);
            case 128 -> lIIIl(-853454096, var9 ^ -700037083);
            case 129 -> lIIIl(-853454095, var9 ^ 1088429502);
            case 130 -> lIIIl(-853454094, var9 ^ 1966955933);
            case 131 -> lIIIl(-853454093, var9 ^ 66422652);
            case 132 -> lIIIl(-853454092, var9 ^ -475135838);
            case 133 -> lIIIl(-853454091, var9 ^ -1284600564);
            case 134 -> lIIIl(-853454090, var9 ^ 1740353651);
            case 135 -> lIIIl(-853454089, var9 ^ -1945160462);
            case 136 -> lIIIl(-853454200, var9 ^ 1666583563);
            case 137 -> lIIIl(-853454199, var9 ^ -1515292441);
            case 138 -> lIIIl(-853454198, var9 ^ -1412724677);
            case 139 -> lIIIl(-853454197, var9 ^ 1680089645);
            case 140 -> lIIIl(-853454196, var9 ^ -1151043418);
            case 141 -> lIIIl(-853454195, var9 ^ -1924734931);
            case 142 -> lIIIl(-853454194, var9 ^ -2009803551);
            case 143 -> lIIIl(-853454193, var9 ^ 1928200184);
            case 144 -> lIIIl(-853454208, var9 ^ 1987093254);
            case 145 -> lIIIl(-853454207, var9 ^ 121254200);
            case 146 -> lIIIl(-853454206, var9 ^ 1434092799);
            case 147 -> lIIIl(-853454205, var9 ^ 51536581);
            case 148 -> lIIIl(-853454204, var9 ^ 1561745254);
            case 149 -> 4;
            case 150 -> lIIIl(-853454203, var9 ^ 284015651);
            case 151 -> lIIIl(-853454202, var9 ^ 344465578);
            case 152 -> lIIIl(-853454201, var9 ^ -791256144);
            case 153 -> lIIIl(-853454184, var9 ^ 671360098);
            case 154 -> lIIIl(-853454183, var9 ^ 1122868125);
            case 155 -> lIIIl(-853454182, var9 ^ 1802765314);
            case 156 -> lIIIl(-853454181, var9 ^ -2108886959);
            case 157 -> lIIIl(-853454180, var9 ^ -1837316790);
            case 158 -> lIIIl(-853454179, var9 ^ -1318838857);
            case 159 -> lIIIl(-853454178, var9 ^ 457509087);
            case 160 -> lIIIl(-853454177, var9 ^ 1713687150);
            case 161 -> lIIIl(-853454192, var9 ^ -1875010077);
            case 162 -> lIIIl(-853454191, var9 ^ 1722005896);
            case 163 -> lIIIl(-853454190, var9 ^ -770508415);
            case 164 -> 3;
            case 165 -> lIIIl(-853454189, var9 ^ -268213746);
            case 166 -> lIIIl(-853454188, var9 ^ -672250450);
            case 167 -> lIIIl(-853454187, var9 ^ -641560694);
            case 168 -> lIIIl(-853454186, var9 ^ 2060128562);
            case 169 -> lIIIl(-853454185, var9 ^ 264766200);
            case 170 -> lIIIl(-853454168, var9 ^ -208595657);
            case 171 -> lIIIl(-853454167, var9 ^ -548532077);
            case 172 -> lIIIl(-853454166, var9 ^ 1388922845);
            case 173 -> lIIIl(-853454165, var9 ^ -1481226151);
            case 174 -> lIIIl(-853454164, var9 ^ -697801670);
            case 175 -> lIIIl(-853454163, var9 ^ -1826735385);
            case 176 -> lIIIl(-853454162, var9 ^ 2013978941);
            case 177 -> 2;
            case 178 -> lIIIl(-853454161, var9 ^ -494302867);
            case 179 -> lIIIl(-853454176, var9 ^ -1575650384);
            case 180 -> lIIIl(-853454175, var9 ^ 1677991528);
            case 181 -> 5;
            case 182 -> lIIIl(-853454174, var9 ^ 1806131615);
            case 183 -> lIIIl(-853454173, var9 ^ -2049414871);
            case 184 -> lIIIl(-853454172, var9 ^ -1301524524);
            case 185 -> lIIIl(-853454171, var9 ^ 340006969);
            case 186 -> lIIIl(-853454170, var9 ^ -285548868);
            case 187 -> lIIIl(-853454169, var9 ^ 2102636342);
            case 188 -> lIIIl(-853454152, var9 ^ 284768362);
            case 189 -> lIIIl(-853454151, var9 ^ 993625309);
            case 190 -> lIIIl(-853454150, var9 ^ -1999668916);
            case 191 -> lIIIl(-853454149, var9 ^ 1255783566);
            case 192 -> lIIIl(-853454148, var9 ^ -257724264);
            case 193 -> lIIIl(-853454147, var9 ^ -450872853);
            case 194 -> lIIIl(-853454146, var9 ^ -1868775411);
            case 195 -> lIIIl(-853454145, var9 ^ -2091535738);
            case 196 -> lIIIl(-853454160, var9 ^ -1147471569);
            case 197 -> lIIIl(-853454159, var9 ^ -1700952861);
            case 198 -> lIIIl(-853454158, var9 ^ 912792252);
            case 199 -> lIIIl(-853454157, var9 ^ -1860478841);
            case 200 -> lIIIl(-853454156, var9 ^ -733191048);
            case 201 -> lIIIl(-853454155, var9 ^ -1669747580);
            case 202 -> lIIIl(-853454154, var9 ^ -1842000609);
            case 203 -> lIIIl(-853454153, var9 ^ 802142306);
            case 204 -> lIIIl(-853454008, var9 ^ -247234934);
            case 205 -> lIIIl(-853454007, var9 ^ -1510526256);
            case 206 -> lIIIl(-853454006, var9 ^ -1261767448);
            case 207 -> lIIIl(-853454005, var9 ^ 688225676);
            case 208 -> lIIIl(-853454004, var9 ^ 863739516);
            case 209 -> lIIIl(-853454003, var9 ^ 699786203);
            case 210 -> lIIIl(-853454002, var9 ^ 86374838);
            case 211 -> lIIIl(-853454001, var9 ^ 1816533022);
            case 212 -> lIIIl(-853454016, var9 ^ -269350108);
            case 213 -> lIIIl(-853454015, var9 ^ -338179173);
            case 214 -> lIIIl(-853454014, var9 ^ 1561067513);
            case 215 -> lIIIl(-853454013, var9 ^ 32295915);
            case 216 -> lIIIl(-853454012, var9 ^ 947829678);
            case 217 -> lIIIl(-853454011, var9 ^ 1401451360);
            case 218 -> lIIIl(-853454010, var9 ^ 1686644028);
            case 219 -> lIIIl(-853454009, var9 ^ 92204719);
            case 220 -> lIIIl(-853453992, var9 ^ -1277024531);
            case 221 -> lIIIl(-853453991, var9 ^ -1933361638);
            case 222 -> lIIIl(-853453990, var9 ^ 729002577);
            case 223 -> lIIIl(-853453989, var9 ^ 1891330294);
            case 224 -> lIIIl(-853453988, var9 ^ 762989703);
            case 225 -> lIIIl(-853453987, var9 ^ -1630415277);
            case 226 -> lIIIl(-853453986, var9 ^ 1329616536);
            case 227 -> lIIIl(-853453985, var9 ^ -1334532156);
            case 228 -> lIIIl(-853454000, var9 ^ 239181360);
            case 229 -> lIIIl(-853453999, var9 ^ 1675351282);
            case 230 -> lIIIl(-853453998, var9 ^ -844995638);
            case 231 -> lIIIl(-853453997, var9 ^ -1373745988);
            case 232 -> lIIIl(-853453996, var9 ^ -160541175);
            case 233 -> lIIIl(-853453995, var9 ^ -382734450);
            case 234 -> lIIIl(-853453994, var9 ^ 349412451);
            case 235 -> lIIIl(-853453993, var9 ^ 58563430);
            case 236 -> lIIIl(-853453976, var9 ^ 1291774739);
            case 237 -> lIIIl(-853453975, var9 ^ 1755439813);
            case 238 -> lIIIl(-853453974, var9 ^ -1397670319);
            case 239 -> lIIIl(-853453973, var9 ^ -530018263);
            case 240 -> lIIIl(-853453972, var9 ^ -234056374);
            case 241 -> lIIIl(-853453971, var9 ^ -1678402888);
            case 242 -> lIIIl(-853453970, var9 ^ -844352780);
            case 243 -> lIIIl(-853453969, var9 ^ -379496682);
            case 244 -> lIIIl(-853453984, var9 ^ -1209249145);
            case 245 -> lIIIl(-853453983, var9 ^ -2059460990);
            case 246 -> lIIIl(-853453982, var9 ^ -584235842);
            case 247 -> lIIIl(-853453981, var9 ^ -2066623284);
            case 248 -> lIIIl(-853453980, var9 ^ -298937083);
            case 249 -> lIIIl(-853453979, var9 ^ 1049258530);
            case 250 -> lIIIl(-853453978, var9 ^ -1723948977);
            case 251 -> lIIIl(-853453977, var9 ^ -1348800789);
            case 252 -> lIIIl(-853453960, var9 ^ -1292051076);
            case 253 -> lIIIl(-853453959, var9 ^ -1824508723);
            case 254 -> lIIIl(-853453958, var9 ^ -1429705985);
            default -> lIIIl(-853453957, var9 ^ -278109904);
         };
         int var5 = (var1 & lIIIl(-853453956, var9 ^ 1547018586)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIIIl(-853453955, var9 ^ -1387795155)) >>> lIIIl(-853453954, var9 ^ 10561127)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIIIl(-853453953, var9 ^ -2105132860);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIIIl(-853453968, var9 ^ -1182456206);
            }
         }

         lIlI[var2] = new String(var3).intern();
      }

      return lIlI[var2];
   }

   private boolean IIllI(class_310 var1, long var2, boolean var4) {
      class_1661 var5 = var1.field_1724.method_31548();
      int var6 = this.lIII(var5, class_1802.field_8634);
      int var7 = var4 ? this.lIII(var5, class_1802.field_49098) : -1;
      if (var6 >= 0 && (!var4 || var7 >= 0) && !this.lIIl(var1, var4)) {
         this.II = var6;
         this.IlI = var7;
         this.IIIII = k74.x.IIll.IIlII(var5);
         this.llIl = var4;
         this.IIII = false;
         this.llI(var1, var6);
         this.lIIII(IlIlIIl.l, var2);
         return true;
      } else {
         return false;
      }
   }

   private boolean IIlll(class_310 var1) {
      return var1 != null
         && var1.field_1724 != null
         && var1.field_1687 != null
         && var1.field_1761 != null
         && var1.field_1690 != null
         && var1.field_1755 == null
         && var1.field_1724.method_5805();
   }

   private boolean IllII() {
      IIIIIllII var1 = IIIIIllII.III();
      if (var1 != null && var1.II() != null) {
         for (IlIIIIIIl var3 : var1.II().IIIlll()) {
            if (var3 instanceof IIlIlllII var4 && var4.l()) {
               return true;
            }
         }
      }

      return false;
   }

   public IIIllIIll() {
      this(false);
   }

   private boolean IllIl(class_310 var1, int var2, class_1792 var3, Runnable var4) {
      if (var1.field_1724.method_31548().method_5438(var2).method_31574(var3) && k74.x.IIll.IIlII(var1.field_1724.method_31548()) == var2) {
         boolean var5 = k74.x.IIll.IIllIlI(var1, class_1268.field_5808);
         if (var5) {
            lllI(var1.field_1724.field_6012);
            var1.field_1724.method_6104(class_1268.field_5808);
            var4.run();
         } else {
            this.III();
         }

         return var5;
      } else {
         this.IllI(var1);
         return false;
      }
   }

   private boolean IlllI(class_310 var1, int var2, class_1792 var3, float var4, float var5, Runnable var6) {
      if (var1 != null
         && var1.field_1724 != null
         && var2 >= 0
         && var2 < lIIIl(-853453967, -1040685265 ^ -1543508329)
         && var1.field_1724.method_31548().method_5438(var2).method_31574(var3)
         && this.IIll != null
         && k74.x.IIll.IIIllII(var1, this.IIll)
         && var6 != null) {
         int var7 = var1.field_1724.field_6012;
         if (IIlI == var7) {
            return false;
         } else {
            boolean var8 = IlllIlII.IIllIl(var1, lIIIl(-853453966, -1040685265 ^ 745721986), var4, var5, this::IllIl);
            if (var8) {
               this.lIII = var7 + 2;
            }

            return var8;
         }
      } else {
         return false;
      }
   }

   private static int lIIIl(int var0, int var1) {
      int var2 = IIIll[var0 ^ -853454264] ^ var1 ^ var0;
      var2 ^= 64223;
      var2 -= 12930;
      var2 ^= 22842;
      var2 -= 55907;
      var2 -= 16296;
      var2 += 20705;
      return var2 - 41910;
   }

   private void Illll(class_310 var1) {
      if (!this.IIII) {
         this.IIIll(var1);
      }

      this.I();
      if (!this.lIl && this.IIIIlIl()) {
         this.IlIllIl(false);
      }
   }

   private void lIIII(IlIlIIl var1, long var2) {
      this.IlIl = var1;
      this.lII = var2;
   }

   @Override
   public void llIl() {
      class_310 var1 = class_310.method_1551();
      if (!this.IIII) {
         this.IIIll(var1);
      }

      this.I();
      this.IIIlI = false;
      this.lIIl = false;
   }
}
