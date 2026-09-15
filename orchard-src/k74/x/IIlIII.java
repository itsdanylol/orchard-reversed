package k74.x;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class IIlIII extends IIllllIl<Double> {
   private double I;
   private final double l;
   private IIIlIlIl II = IlIIllIII.lII("");
   private static final int[] lI = new int[1];
   private double Il;

   public IIlIII(Object var1, double var2, double var4, double var6, double var8) {
      super(var1, var2);
      this.Il = var4;
      this.I = var6;
      this.l = var8;
   }

   static {
      byte var10000 = 0;
      byte var10001 = 0;
      byte[] var10002 = "üº\u009a7".getBytes("ISO-8859-1");

      int var14;
      do {
         lI[var10000] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ -1450171864;
         var10000 += 1;
         var14 = var10001 + 4;
         var10001 += 4;
      } while (var14 < var10002.length);
   }

   public String I() {
      return this.II.llIl();
   }

   public double II() {
      return this.l;
   }

   public double lI() {
      return this.I;
   }

   public IIlIII(String var1, double var2, double var4, double var6, double var8) {
      this((Object)var1, var2, var4, var6, var8);
   }

   public IIlIII III(double var1, double var3) {
      this.Il = var1;
      this.I = var3;
      this.Ill(this.IllI());
      return this;
   }

   private double IlI(double var1) {
      try {
         if (this.l <= 0.0) {
            return var1;
         }
      } catch (IllegalArgumentException var5) {
         throw IIII(var5);
      }

      long var3 = Math.round(var1 / this.l);
      return BigDecimal.valueOf(this.l).multiply(BigDecimal.valueOf(var3)).setScale(this.IIll(), RoundingMode.HALF_UP).doubleValue();
   }

   public void Ill(Double var1) {
      double var2 = Math.max(this.Il, Math.min(this.I, var1));
      super.Il(this.IlI(var2));
   }

   public IIlIII lII(double var1) {
      this.I = var1;
      this.Ill(this.IllI());
      return this;
   }

   static IIIlIlIl lIl(Object param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: instanceof k74/x/IIIlIlIl
      // 04: ifeq 0e
      // 07: aload 0
      // 08: checkcast k74/x/IIIlIlIl
      // 0b: astore 1
      // 0c: aload 1
      // 0d: areturn
      // 0e: aload 0
      // 0f: ifnonnull 1b
      // 12: ldc ""
      // 14: goto 1f
      // 17: invokestatic k74/x/IIlIII.IIII (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: invokevirtual java/lang/Object.toString ()Ljava/lang/String;
      // 1f: astore 1
      // 20: aload 1
      // 21: invokevirtual java/lang/String.length ()I
      // 24: bipush 4
      // 25: irem
      // 26: ifne 4b
      // 29: aload 1
      // 2a: invokevirtual java/lang/String.isEmpty ()Z
      // 2d: ifne 4b
      // 30: goto 37
      // 33: invokestatic k74/x/IIlIII.IIII (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 36: athrow
      // 37: aload 1
      // 38: invokestatic k74/x/IlIIllIII.II (Ljava/lang/String;)Z
      // 3b: ifeq 4b
      // 3e: goto 45
      // 41: invokestatic k74/x/IIlIII.IIII (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 44: athrow
      // 45: aload 1
      // 46: invokestatic k74/x/IlIIllIII.Ill (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 49: areturn
      // 4a: astore 2
      // 4b: aload 1
      // 4c: invokestatic k74/x/IlIIllIII.lII (Ljava/lang/String;)Lk74/x/IIIlIlIl;
      // 4f: areturn
   }

   public double llI() {
      return this.Il;
   }

   public IIIlIlIl lll() {
      return this.II;
   }

   private static IllegalArgumentException IIII(IllegalArgumentException var0) {
      return var0;
   }

   public IIlIII IIIl(Object var1) {
      this.II = lIl(var1);
      return this;
   }

   public IIlIII IIlI(double var1) {
      this.Il = var1;
      this.Ill(this.IllI());
      return this;
   }

   @Override
   public void ll(JsonElement param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 24
      // 04: aload 1
      // 05: invokevirtual com/google/gson/JsonElement.isJsonPrimitive ()Z
      // 08: ifeq 24
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIlIII.IIII (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 11: athrow
      // 12: aload 0
      // 13: aload 1
      // 14: invokevirtual com/google/gson/JsonElement.getAsDouble ()D
      // 17: invokestatic java/lang/Double.valueOf (D)Ljava/lang/Double;
      // 1a: invokevirtual k74/x/IIlIII.Ill (Ljava/lang/Double;)V
      // 1d: goto 24
      // 20: invokestatic k74/x/IIlIII.IIII (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
      // 23: athrow
      // 24: return
   }

   private int IIll() {
      double var2 = Math.abs(this.l);
      String[] var10000 = IIllllIl.IIIIl();
      int var4 = 0;
      String[] var1 = var10000;

      while (var4 < lIII(1339869662, -1398564840 ^ -1235952383) && Math.abs(var2 - Math.rint(var2)) > 1.0E-6) {
         var2 *= 10.0;
         var4++;
         if (var1 != null) {
            break;
         }
      }

      return var4;
   }

   public IIlIII IlII(String var1) {
      return this.IIIl(var1);
   }

   private static int lIII(int var0, int var1) {
      int var2 = lI[var0 ^ 1339869662] ^ var1 ^ var0;
      var2 -= 18820;
      var2 ^= 29906;
      var2 += 1877;
      var2 ^= 35063;
      var2 ^= 50263;
      return var2 - 60021;
   }

   @Override
   public JsonElement IIl() {
      return new JsonPrimitive(this.IllI());
   }
}
