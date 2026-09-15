package k74.x;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.IntConsumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IIIlIlIl {
   private static final Object[] ll;
   private static final int[] Il;
   private static final String[] lI;
   private final List<lIllIll> I;
   private static final String l;
   private static final IIIlIlIl II;

   public long I() {
      long[] var1 = new long[]{-3750763034362895579L};
      this.IIII(IIIlIlIl::IIIl);
      return var1[0];
   }

   private static void l(long[] var0, int var1) {
      int var2 = var1 == llll(-373173447, 778480213 ^ -1856376400) ? llll(-373173448, 778480213 ^ -1557697699) : Character.toLowerCase(var1);
      var0[0] ^= var2;
      var0[0] *= 1099511628211L;
   }

   private static void II(boolean[] var0, CharSequence var1, int[] var2, int var3) {
      if (var0[0]) {
         int var4 = Character.codePointAt(var1, var2[0]);
         if (!IlIIllIII.IIII(var3, var4)) {
            var0[0] = false;
         } else {
            var2[0] += Character.charCount(var4);
         }
      }
   }

   public static IIIlIlIl Il(String var0) {
      lIllIll var1 = lIII(var0);
      return var1 == null ? II : new IIIlIlIl(List.of(var1));
   }

   private IIIlIlIl(List<lIllIll> var1) {
      this.I = var1;
   }

   public boolean lI() {
      if (this.I.isEmpty()) {
         return true;
      } else {
         boolean[] var1 = new boolean[]{true};
         this.IIII(IIIlIlIl::IIl);
         return var1[0];
      }
   }

   private int[] ll() {
      int[] var1 = new int[this.llI()];
      int[] var2 = new int[]{0};
      this.IIII(IIIlIlIl::IIlI);
      return var1;
   }

   private static void III(int[] var0, int[] var1, int var2) {
      var0[var1[0]++] = var2;
   }

   private static void IIl(boolean[] var0, int var1) {
      if (!Character.isWhitespace(var1)) {
         var0[0] = false;
      }
   }

   public boolean IlI(CharSequence var1) {
      if (var1 != null && this.llI() == IlIIllIII.IlII(var1)) {
         int[] var2 = new int[]{0};
         boolean[] var3 = new boolean[]{true};
         this.IIII(IIIlIlIl::llII);
         return var3[0];
      } else {
         return false;
      }
   }

   private static void Ill(long[] var0, int var1) {
      var0[0] ^= Character.toLowerCase(var1);
      var0[0] *= 1099511628211L;
   }

   public IIIlIlIl lII(int var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 <= 0 || this.I.isEmpty()) {
         return II;
      } else if (var1 >= this.llI()) {
         return this;
      } else {
         ArrayList var3 = new ArrayList(this.I.size());
         int var4 = var1;

         for (lIllIll var6 : this.I) {
            if (var4 <= 0 && var2 == null) {
               break;
            }

            if (var4 >= var6.l) {
               var3.add(var6);
               var4 -= var6.l;
               if (var2 == null) {
                  continue;
               }
            }

            byte[] var7 = var6.Il();

            try {
               int var8 = IlIIllIII.lIl(var7, var4);
               if (var8 > 0) {
                  var3.add(lIllIll.l(var7, 0, var8));
               }
               break;
            } finally {
               Arrays.fill(var7, (byte)0);
            }
         }

         return var3.isEmpty() ? II : new IIIlIlIl(List.copyOf(var3));
      }
   }

   private static IIIlIlIl lIl(byte[] var0) {
      return var0.length == 0 ? II : new IIIlIlIl(List.of(lIllIll.l(var0, 0, var0.length)));
   }

   private static String IIIII(byte var0, int var1, char var2, int var3, byte var4, char var5) {
      int var10 = var3 ^ -1642165058;
      char[] var9 = lI[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])ll[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = new Throwable().getStackTrace();
         ll[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 33860;
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ var8 ^ 41575 ^ var3 ^ var5 ^ var4 ^ var1 ^ var7 ^ var0 ^ var2);
      } while (++var8 < var9.length);

      return new String(var9).intern();
   }

   public int llI() {
      int var1 = 0;

      for (lIllIll var3 : this.I) {
         var1 += var3.l;
      }

      return var1;
   }

   public boolean lll(IIIlIlIl var1) {
      if (var1 != null && this.llI() == var1.llI()) {
         int[] var2 = this.ll();
         int[] var3 = var1.ll();

         boolean var4;
         try {
            var4 = Arrays.equals(var2, var3);
         } finally {
            Arrays.fill(var2, 0);
            Arrays.fill(var3, 0);
         }

         return var4;
      } else {
         return false;
      }
   }

   public void IIII(IntConsumer var1) {
      if (!IlIIllIII.II && !this.I.isEmpty()) {
         Objects.requireNonNull(var1, l);

         for (lIllIll var3 : this.I) {
            byte[] var4 = var3.Il();

            try {
               IlIIllIII.III(var4, 0, var4.length, var1);
            } finally {
               Arrays.fill(var4, (byte)0);
            }
         }
      }
   }

   private static void IIIl(long[] var0, int var1) {
      var0[0] ^= var1;
      var0[0] *= 1099511628211L;
   }

   private static void IIlI(int[] var0, int[] var1, int var2) {
      var0[var1[0]++] = var2;
   }

   private static int llll(int var0, int var1) {
      int var2 = Il[var0 ^ -373173447] ^ var1 ^ var0;
      var2 ^= 54879;
      var2 += 42766;
      var2 += 62986;
      var2 ^= 26817;
      var2 -= 37543;
      var2 ^= 9571;
      var2 += 55518;
      return var2 - 25536;
   }

   public IIIlIlIl IIll(IIIlIlIl var1) {
      if (var1 == null || var1.lllI()) {
         return this;
      } else if (this.lllI()) {
         return var1;
      } else {
         ArrayList var2 = new ArrayList(this.I.size() + var1.I.size());
         var2.addAll(this.I);
         var2.addAll(var1.I);
         return new IIIlIlIl(List.copyOf(var2));
      }
   }

   public boolean IlII(IIIlIlIl var1) {
      if (var1 == null) {
         return false;
      } else {
         int var2 = this.llI();
         int var3 = var1.llI();
         if (var3 > var2) {
            return false;
         } else {
            int[] var4 = this.ll();
            int[] var5 = var1.ll();

            try {
               int var6 = var4.length - var5.length;

               for (int var7 = 0; var7 < var5.length; var7++) {
                  if (var4[var6 + var7] != var5[var7]) {
                     return false;
                  }
               }

               return true;
            } finally {
               Arrays.fill(var4, 0);
               Arrays.fill(var5, 0);
            }
         }
      }
   }

   public boolean IlIl(CharSequence var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 == null) {
         return false;
      } else {
         int var3 = this.llI();
         if (var3 == 0) {
            return true;
         } else if (var3 > IlIIllIII.IlII(var1)) {
            return false;
         } else {
            int[] var4 = new int[var3];
            int[] var5 = new int[]{0};
            this.IIII(IIIlIlIl::III);

            try {
               int var6 = 0;

               while (var6 < var1.length()) {
                  int var7 = var6;
                  int var8 = 0;

                  while (var8 < var4.length && var7 < var1.length()) {
                     int var9 = Character.codePointAt(var1, var7);
                     if (var4[var8] != var9 && var2 == null) {
                        break;
                     }

                     var7 += Character.charCount(var9);
                     var8++;
                     if (var2 != null) {
                        break;
                     }
                  }

                  if (var8 == var4.length) {
                     return true;
                  }

                  int var14 = Character.codePointAt(var1, var6);
                  var6 += Character.charCount(var14);
                  if (var2 != null) {
                     break;
                  }
               }

               return false;
            } finally {
               Arrays.fill(var4, 0);
            }
         }
      }
   }

   public long IllI() {
      long[] var1 = new long[]{-3750763034362895579L};
      this.IIII(IIIlIlIl::Ill);
      return var1[0];
   }

   public boolean Illl(CharSequence var1) {
      if (var1 != null && this.llI() == IlIIllIII.IlII(var1)) {
         int[] var2 = new int[]{0};
         boolean[] var3 = new boolean[]{true};
         this.IIII(IIIlIlIl::II);
         return var3[0];
      } else {
         return false;
      }
   }

   private static lIllIll lIII(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         byte[] var1 = var0.getBytes(StandardCharsets.UTF_8);

         lIllIll var2;
         try {
            var2 = lIllIll.l(var1, 0, var1.length);
         } finally {
            Arrays.fill(var1, (byte)0);
         }

         return var2;
      } else {
         return null;
      }
   }

   public List<String> lIIl() {
      if (!IlIIllIII.II && !this.I.isEmpty()) {
         ArrayList var1 = new ArrayList(this.I.size());

         for (lIllIll var3 : this.I) {
            var1.add(var3.ll());
         }

         return Collections.unmodifiableList(var1);
      } else {
         return List.of();
      }
   }

   public long lIlI() {
      long[] var1 = new long[]{-3750763034362895579L};
      this.IIII(IIIlIlIl::l);
      return var1[0];
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -2041170050;
      short var12 = 18391;
      int var10 = 0;
      int var10001 = "\b奄踼嬨䙃妨渫倲\uf689".length();
      String[] var9 = new String[1];
      int var11 = 0;
      int var8 = var10001;
      String var7 = "\b奄踼嬨䙃妨渫倲\uf689";

      do {
         char var13 = var7.charAt(var11);
         var10001 = var11 + 1;
         int var10002 = var11 + 1;
         int var15 = 0;
         char[] var14 = var7.substring(var10001, var10002 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 7) {
               default -> 95;
               case 1 -> 234;
               case 2 -> 211;
               case 3 -> 151;
               case 4 -> 211;
               case 5 -> 255;
               case 6 -> 233;
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

      lI = var9;
      ll = new Object[var9.length];
      int var3 = 626803622;
      byte[] var1 = "\u008c\\\u0091\u0094¾\"\r9Þ;\u0002©h D\u0003[ª\u0093ÿ\"¶\u0091Bèôj\u009aÛzêùÓP\u0010|½à0½iC[±".getBytes("ISO-8859-1");
      int var2 = var1.length / 4;
      Il = new int[var2];
      byte var4 = 0;
      int var5 = 0;

      do {
         int var6 = (var1[var4] & 255) << 24 | (var1[var4 + 1] & 255) << 16 | (var1[var4 + 2] & 255) << 8 | var1[var4 + 3] & 255;
         var6 ^= var3;
         Il[var5] = var6;
         var4 += 4;
      } while (++var5 < var2);

      int var20 = llll(-373173445, var17 ^ 1796143156);
      char[] var10003 = IIIII((byte)-109, -788841197, 29530, -1642165058, (byte)-88, (char)'ꃾ').toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      int var29 = var20;
      char[] var27 = var10003;
      var10001 = var10004;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10004 = var20;
         var10006 = var0;
      } else {
         var29 = var20;
         var10001 = var10004;
         if (var10004 <= var0) {
            String var32 = new String(var10003).intern();
            byte var26 = -1;
            l = var32;
            II = new IIIlIlIl(List.of());
            return;
         }

         var10005 = var10003;
         var10004 = var20;
         var10006 = var0;
      }

      while (true) {
         var10005[var10006] = (char)(var10005[var10006] ^ var10004 ^ switch (var0 % llll(-373173446, var17 ^ -585779098)) {
            case 0 -> llll(-373173443, var17 ^ -291542852);
            case 1 -> llll(-373173444, var17 ^ -1752994828);
            case 2 -> llll(-373173441, var17 ^ 1572966435);
            case 3 -> llll(-373173442, var17 ^ 1850677132);
            case 4 -> llll(-373173455, var17 ^ 1717955276);
            case 5 -> llll(-373173456, var17 ^ 148229553);
            default -> llll(-373173453, var17 ^ -596203842);
         });
         var0++;
         if (var29 == 0) {
            var10006 = var29;
            var10005 = var27;
            var10004 = var29;
         } else {
            if (var10001 <= var0) {
               String var31 = new String(var27).intern();
               byte var25 = -1;
               l = var31;
               II = new IIIlIlIl(List.of());
               return;
            }

            var10005 = var27;
            var10004 = var29;
            var10006 = var0;
         }
      }
   }

   public static IIIlIlIl lIll(List<String> var0) {
      if (var0 != null && !var0.isEmpty()) {
         ArrayList var1 = new ArrayList(var0.size());

         for (String var3 : var0) {
            lIllIll var4 = lIII(var3);
            if (var4 != null) {
               var1.add(var4);
            }
         }

         return var1.isEmpty() ? II : new IIIlIlIl(List.copyOf(var1));
      } else {
         return II;
      }
   }

   private static void llII(boolean[] var0, CharSequence var1, int[] var2, int var3) {
      if (var0[0]) {
         int var4 = Character.codePointAt(var1, var2[0]);
         if (var3 != var4) {
            var0[0] = false;
         } else {
            var2[0] += Character.charCount(var4);
         }
      }
   }

   public String llIl() {
      if (!IlIIllIII.II && !this.I.isEmpty()) {
         if (this.I.size() == 1) {
            return this.I.get(0).ll();
         } else {
            StringBuilder var1 = new StringBuilder();

            for (lIllIll var3 : this.I) {
               var1.append(var3.ll());
            }

            return var1.toString();
         }
      } else {
         return "";
      }
   }

   public boolean lllI() {
      return this.I.isEmpty();
   }
}
