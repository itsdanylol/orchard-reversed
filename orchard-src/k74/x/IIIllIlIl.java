package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IIIllIlIl extends IIllllIl<String> {
   private static final Object[] lll;
   private static String[] I;
   private static final String l;
   private static final int[] lI;
   private final List<String> II;
   private int Il;
   private static final String[] ll;

   private static String I(char[] var0, long var1, int var3) {
      int var4 = llI(1484490618, -451658425 ^ -1274217873) ^ var3;

      for (int var5 = 0; var5 < var0.length; var5++) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & llI(1484490619, -451658425 ^ -1026379342);
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= var6;
      }

      return new String(var0);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = 1773784312;
      String[] var9 = new String[1];
      int var10001 = "\bꄧ더㪊\uec19嚫옆엲좶".length();
      short var12 = 21847;
      int var8 = var10001;
      int var11 = 0;
      String var7 = "\bꄧ더㪊\uec19嚫옆엲좶";
      int var10 = 0;

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 5) {
               default -> 24;
               case 1 -> 93;
               case 2 -> 171;
               case 3 -> 73;
               case 4 -> 70;
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

      ll = var9;
      lll = new Object[var9.length];
      int var3 = -1958286592;
      byte[] var1 = "\u0081\u0011ª\u0097ôú×\u007fu\u001c#¦t=\u0084\u001b²Ïèzþ¬\u0081\u001bÎ%ÇWzÑï}íøSú¦Z¸\u0011åvÚ\u009f»ÇRÄ~ù:É".getBytes("ISO-8859-1");
      int var2 = var1.length / 4;
      lI = new int[var2];
      byte var4 = 0;
      int var5 = 0;

      do {
         int var6 = (var1[var4] & 255) << 24 | (var1[var4 + 1] & 255) << 16 | (var1[var4 + 2] & 255) << 8 | var1[var4 + 3] & 255;
         var6 ^= var3;
         lI[var5] = var6;
         var4 += 4;
      } while (++var5 < var2);

      int var20 = llI(1484490622, var17 ^ 139100065);
      char[] var10003 = lll(var17 ^ -222193738, '묠', (short)30703).toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      int var27 = var20;
      char[] var10002 = var10003;
      var10001 = var10004;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10004 = var20;
         var10006 = var0;
      } else {
         var27 = var20;
         var10001 = var10004;
         if (var10004 <= var0) {
            String var30 = new String(var10003).intern();
            byte var25 = -1;
            l = var30;
            I = new String[2];
            lII();
            return;
         }

         var10005 = var10003;
         var10004 = var20;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var0 % llI(1484490623, var17 ^ 1143543333)) {
            case 0 -> llI(1484490620, var17 ^ 1956663451);
            case 1 -> llI(1484490621, var17 ^ -1068205946);
            case 2 -> llI(1484490610, var17 ^ 1467860188);
            case 3 -> llI(1484490611, var17 ^ 484388650);
            case 4 -> llI(1484490608, var17 ^ 1609780547);
            case 5 -> llI(1484490609, var17 ^ 21153272);
            default -> llI(1484490614, var17 ^ -998461980);
         });
         var0++;
         if (var27 == 0) {
            var10006 = var27;
            var10005 = var10002;
            var10004 = var27;
         } else {
            if (var10001 <= var0) {
               String var29 = new String(var10002).intern();
               byte var24 = -1;
               l = var29;
               I = new String[2];
               lII();
               return;
            }

            var10005 = var10002;
            var10004 = var27;
            var10006 = var0;
         }
      }
   }

   @Override
   public void ll(JsonElement var1) {
      if (var1 != null && var1.isJsonPrimitive()) {
         this.lI(var1.getAsString());
      }
   }

   public int II() {
      return this.Il;
   }

   private static String lll(int var0, char var1, short var2) {
      int var3 = var1 ^ '묠';
      char[] var4 = ll[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])lll[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = new Throwable().getStackTrace();
         lll[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 5074;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 18259;
         var10 += 10880;
         var10 ^= 10368;
         var10 ^= 12442;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
      } while (++var9 < var4.length);

      return new String(var4).intern();
   }

   public void lI(String var1) {
      String[] var2 = IIllllIl.IIIIl();
      int var3 = this.II.indexOf(var1);
      if (var3 >= 0) {
         this.Il = var3;
         super.Il(var1);
         if (var2 == null) {
            return;
         }
      }

      this.Il = 0;
      super.Il(this.II.get(0));
   }

   public List<String> III() {
      return this.II;
   }

   private static int llI(int var0, int var1) {
      int var2 = lI[var0 ^ 1484490618] ^ var1 ^ var0;
      var2 ^= 50251;
      var2 += 7681;
      var2 ^= 41367;
      var2 -= 60737;
      var2 -= 61063;
      var2 ^= 7084;
      return var2 ^ 53047;
   }

   public IIIllIlIl(Object var1, List<String> var2) {
      super(var1, I[0]);
      this.II = var2;
      this.Il = 0;
   }

   public void IlI() {
      this.Il = (this.Il + 1) % this.II.size();
      super.Il(this.II.get(this.Il));
   }

   public void Ill() {
      this.Il = (this.Il - 1 + this.II.size()) % this.II.size();
      super.Il(this.II.get(this.Il));
   }

   @Override
   public JsonElement IIl() {
      return new JsonPrimitive(this.IllI());
   }

   private static void lII() {
      I[0] = I("".toCharArray(), 5833L, llI(1484490616, 1413310860 ^ 94560865));
      I[1] = I(l.toCharArray(), 34906L, llI(1484490617, 1413310860 ^ -1211790385));
   }

   public String lIl() {
      String var1 = this.IllI();
      return var1.isEmpty() ? IlIIllIII.lI(I[1]) : var1;
   }
}
