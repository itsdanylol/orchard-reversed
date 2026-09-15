package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public record IIIllIlll(int a, class_243 b, float c, double d, float e, boolean f, float g, float h, boolean i) {
   private final double I;
   private final class_243 l;
   private final float II;
   private final boolean Il;
   private final float lI;
   private final boolean ll;
   private final float III;
   private final int IIl;
   private final float IlI;

   public IIIllIlll(int a, class_243 b, float c, double d, float e, boolean f, float g, float h, boolean i) {
      this.IIl = a;
      this.l = b;
      this.IlI = c;
      this.I = d;
      this.lI = e;
      this.ll = f;
      this.II = g;
      this.III = h;
      this.Il = i;
   }

   public float I() {
      return this.II;
   }

   static IIIllIlll l(int var0, class_243 var1) {
      return var1 == null ? null : new IIIllIlll(var0, var1, 0.0F, 0.0, 360.0F, false, 0.0F, 0.0F, true);
   }

   public float II() {
      return this.lI;
   }

   public int Il() {
      return this.IIl;
   }

   public double lI() {
      return this.I;
   }

   public class_243 ll() {
      return this.l;
   }

   public boolean III() {
      return this.ll;
   }

   public float IIl() {
      return this.III;
   }

   public boolean IlI() {
      return this.Il;
   }

   IIIllIlll(int var1, class_243 var2, float var3, double var4, float var6, boolean var7) {
      this(var1, var2, var3, var4, var6, var7, 0.0F, 0.0F, false);
   }

   IIIllIlll(int var1, class_243 var2, float var3, double var4, float var6) {
      this(var1, var2, var3, var4, var6, false, 0.0F, 0.0F, false);
   }

   public float Ill() {
      return this.IlI;
   }
}
