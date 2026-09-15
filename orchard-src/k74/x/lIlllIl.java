package k74.x;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class lIlllIl extends IIllllIl<double[]> {
   private final double I;
   private static final String[] IIII;
   private static final IIIlIlIl l;
   private static final int[] lll;
   private static final IIIlIlIl II;
   private static final Object[] IIIl;
   private IIIlIlIl Il = IlIIllIII.lII("");
   private final double lI;
   private final double ll;

   @Override
   public String llIl() {
      return this.IIII().llIl();
   }

   public lIlllIl(Object var1, double var2, double var4, double var6, double var8, double var10) {
      super(var1, new double[]{var2, var4});
      this.lI = var6;
      this.ll = var8;
      this.I = var10;
   }

   @Override
   public void ll(JsonElement var1) {
      if (var1 != null && var1.isJsonArray()) {
         JsonArray var4 = var1.getAsJsonArray();
         if (var4.size() >= 2) {
            this.III(new double[]{var4.get(0).getAsDouble(), var4.get(1).getAsDouble()});
         }
      } else {
         if (var1 != null && var1.isJsonPrimitive() && var1.getAsJsonPrimitive().isNumber()) {
            double var2 = var1.getAsDouble();
            this.III(new double[]{var2, var2});
         }
      }
   }

   private double I(double var1) {
      if (this.I <= 0.0) {
         return var1;
      } else {
         long var3 = Math.round(var1 / this.I);
         return BigDecimal.valueOf(this.I).multiply(BigDecimal.valueOf(var3)).setScale(this.lII(), RoundingMode.HALF_UP).doubleValue();
      }
   }

   public void II(double var1, double var3) {
      this.III(new double[]{var1, var3});
   }

   public lIlllIl lI(String var1) {
      return this.Ill(var1);
   }

   public void III(double[] var1) {
      if (var1 != null && var1.length >= 2) {
         double var2 = this.I(Math.max(this.lI, Math.min(this.ll, var1[0])));
         double var4 = this.I(Math.max(this.lI, Math.min(this.ll, var1[1])));
         if (var2 > var4) {
            double var6 = var2;
            var2 = var4;
            var4 = var6;
         }

         super.Il(new double[]{var2, var4});
      }
   }

   public double IlI() {
      return this.IllI()[1];
   }

   @Override
   public long l() {
      return this.IIII().I();
   }

   @Override
   public JsonElement IIl() {
      JsonArray var1 = new JsonArray();
      var1.add(new JsonPrimitive(this.IllI()[0]));
      var1.add(new JsonPrimitive(this.IllI()[1]));
      return var1;
   }

   public lIlllIl Ill(Object var1) {
      this.Il = IIlIII.lIl(var1);
      return this;
   }

   private int lII() {
      double var2 = Math.abs(this.I);
      String[] var10000 = IIllllIl.IIIIl();
      int var4 = 0;
      String[] var1 = var10000;

      while (var4 < IlII(-1722138002, -1843756866 ^ 1538746927) && Math.abs(var2 - Math.rint(var2)) > 1.0E-6) {
         var2 *= 10.0;
         var4++;
         if (var1 != null) {
            break;
         }
      }

      return var4;
   }

   private static String lIII(char var0, byte var1, short var2, int var3, int var4, int var5) {
      int var10 = var3 ^ 2068847824;
      char[] var9 = IIII[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])IIIl[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         IIIl[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 23759;

      for (int var8 = 0; var8 < var9.length; var8++) {
         var9[var8] = (char)(var9[var8] ^ switch (var8 % 4) {
            default -> 103;
            case 1 -> 51;
            case 2 -> 219;
            case 3 -> 133;
         } ^ 32983 ^ var5 ^ var3 ^ var0 ^ var4 ^ var7 ^ var1 ^ var2);
      }

      return new String(var9).intern();
   }

   private static int IlII(int var0, int var1) {
      int var2 = lll[var0 ^ -1722138002] ^ var1 ^ var0;
      var2 ^= 38441;
      var2 += 44011;
      var2 += 15864;
      var2 ^= 64783;
      var2 -= 28663;
      return var2 + 53746;
   }

   public IIIlIlIl lIl() {
      return this.Il;
   }

   public double llI() {
      return this.lI;
   }

   public String lll() {
      return this.Il.llIl();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var23 = -723004307;
      int var14 = "\u001d\ue647ᾖ\ue24f羃\ue61f\udf91\ue197㾈\ue7efᾓ\ue0e7ﾎ\ue517龓\ue2c7羂\ue65f\udf92\ue337ﾃ\ue56f\udf95\ue37fᾅ\ue657ﾔ\ue2d7龍\ue777".length();
      String var13 = "\u001d\ue647ᾖ\ue24f羃\ue61f\udf91\ue197㾈\ue7efᾓ\ue0e7ﾎ\ue517龓\ue2c7羂\ue65f\udf92\ue337ﾃ\ue56f\udf95\ue37fᾅ\ue657ﾔ\ue2d7龍\ue777";
      String[] var15 = new String[1];
      int var17 = 0;
      int var16 = 0;
      short var18 = 7731;

      do {
         char var19 = var13.charAt(var17);
         int var10001 = var17 + 1;
         int var21 = 0;
         char[] var20 = var13.substring(var10001, var10001 + var19).toCharArray();

         do {
            char var22 = var20[var21];
            if (var21 % 2 == 0) {
               var20[var21] = (char)((var22 >>> 3 | var22 << '\r') & 65535 ^ var18);
            } else {
               var20[var21] = (char)((var22 << 3 | var22 >>> '\r') & 65535 ^ var18);
            }
         } while (++var21 < var20.length);

         var15[var16] = new String(var20);
         var16++;
         var17 = var17 + var19 + 1;
      } while (var17 < var14);

      IIII = var15;
      IIIl = new Object[var15.length];
      int var9 = 2140089175;
      byte[] var7 = "Ð\u0086l \u0001ï\u0006ÝáÕ*\u0082E\u00035Û\u0096ç\u0017Zl-y^9\u008e\u0094°¥\u000f7öÝÛ4òØ\u0002¿!´£®×".getBytes("ISO-8859-1");
      int var8 = var7.length / 4;
      lll = new int[var8];
      byte var10 = 0;
      int var11 = 0;

      do {
         int var12 = (var7[var10] & 255) << 24 | (var7[var10 + 1] & 255) << 16 | (var7[var10 + 2] & 255) << 8 | var7[var10 + 3] & 255;
         var12 ^= var9;
         lll[var11] = var12;
         var10 += 4;
      } while (++var11 < var8);

      String[] var0 = new String[2];
      int var4 = 0;
      String var3;
      int var5 = (var3 = lIII(26741, (byte)-35, (short)21007, 2068847824, 133016106, 2128525379)).length();
      int var2 = IlII(-1722138001, var23 ^ -870099814);
      int var1 = -1;

      while (true) {
         char[] var10002;
         label75: {
            int var10000 = IlII(-1722138004, var23 ^ 739866761);
            char[] var10003 = var3.substring(++var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            int var32 = var10000;
            var10002 = var10003;
            int var27 = var10004;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            } else {
               var32 = var10000;
               var27 = var10004;
               if (var10004 <= var6) {
                  break label75;
               }

               var10005 = var10003;
               var10004 = var10000;
               var10006 = var6;
            }

            while (true) {
               var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var6 % IlII(-1722138003, var23 ^ -1999673467)) {
                  case 0 -> IlII(-1722138006, var23 ^ 1529562479);
                  case 1 -> IlII(-1722138005, var23 ^ -1579078817);
                  case 2 -> IlII(-1722138008, var23 ^ -196950362);
                  case 3 -> IlII(-1722138007, var23 ^ 1757635879);
                  case 4 -> IlII(-1722138010, var23 ^ 269969113);
                  case 5 -> IlII(-1722138009, var23 ^ 365882657);
                  default -> IlII(-1722138012, var23 ^ 2037382185);
               });
               var6++;
               if (var32 == 0) {
                  var10006 = var32;
                  var10005 = var10002;
                  var10004 = var32;
               } else {
                  if (var27 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var10004 = var32;
                  var10006 = var6;
               }
            }
         }

         String var34 = new String(var10002).intern();
         byte var29 = -1;
         var0[var4++] = var34;
         if ((var1 += var2) >= var5) {
            II = IlIIllIII.Ill(var0[1]);
            l = IlIIllIII.Ill(var0[0]);
            return;
         }

         var2 = var3.charAt(var1);
      }
   }

   private IIIlIlIl IIII() {
      IIIlIlIl var1 = this.IIIlI();
      if (var1.IlII(II)) {
         return var1.lII(var1.llI() - II.llI());
      } else {
         return var1.IlII(l) ? var1.lII(var1.llI() - l.llI()) : var1;
      }
   }

   public double IIIl() {
      return this.ll;
   }

   public double IIlI() {
      return this.IllI()[0];
   }

   public lIlllIl(String var1, double var2, double var4, double var6, double var8, double var10) {
      this((Object)var1, var2, var4, var6, var8, var10);
   }

   public double IIll() {
      return this.I;
   }
}
