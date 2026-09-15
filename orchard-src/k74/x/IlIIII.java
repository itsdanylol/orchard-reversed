package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;

@Environment(EnvType.CLIENT)
public final class IlIIII {
   private final float I;
   private final IIIlIlIl l;
   private final float II;
   private final IIIlIlIl Il;
   private final int lI;
   private final IIIlIlIl ll;
   private final int III;
   private final float IIl;
   private final float IlI;

   private IlIIII(String var1, String var2, IIIlIlIl var3, int var4, int var5, float var6, float var7, float var8, float var9) {
      this.l = IlIIllIII.lII(var1);
      this.ll = IlIIllIII.lII(var2);
      this.Il = var3 == null ? IlIIllIII.lII("") : var3;
      this.lI = var4;
      this.III = var5;
      this.II = var6;
      this.IIl = var7;
      this.IlI = var8;
      this.I = var9;
   }

   public class_2960 I() {
      return class_2960.method_60655(llllIlII.l.llIl(), this.Il.llIl());
   }

   public String II() {
      return this.ll.llIl();
   }

   public int Il() {
      return Math.max(0, Math.round(this.II + 3.0F));
   }

   public long lI() {
      return this.ll.I();
   }

   public int ll() {
      return Math.max(0, Math.round(this.IlI + 2.0F));
   }

   public IIIlIlIl III() {
      return this.ll;
   }

   public int IIl() {
      return this.III;
   }

   public float IlI() {
      return this.IlI;
   }

   public String Ill() {
      return this.l.llIl();
   }

   public int lII() {
      return this.lI;
   }

   public IIIlIlIl lIl() {
      return this.l;
   }

   public float llI() {
      return this.IIl;
   }

   public float lll(float var1) {
      return var1 * ((float)this.lI / this.III);
   }

   private IlIIII IIII(String var1) {
      return new IlIIII(this.Ill(), var1, this.Il, this.lI, this.III, this.II, this.IIl, this.IlI, this.I);
   }

   public float IIIl() {
      return this.I;
   }

   public float l() {
      return this.II;
   }
}
