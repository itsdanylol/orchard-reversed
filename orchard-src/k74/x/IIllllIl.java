package k74.x;

import com.google.gson.JsonElement;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public abstract class IIllllIl<T> {
   private static String[] III;
   private final T IIl;
   private boolean IlI;
   private T Ill;
   private final IIIlIlIl lII;
   private static final BooleanSupplier lIl = IIllllIl::llII;
   private BooleanSupplier llI = lIl;

   public <S extends IIllllIl<T>> S lIIl() {
      this.IlI = false;
      return (S)this;
   }

   public void Illl() {
      this.Il(this.IIl);
   }

   public abstract JsonElement IIl();

   public T IlIl() {
      return this.IIl;
   }

   public <S extends IIllllIl<T>> S lIlI(BooleanSupplier var1) {
      this.llI = var1 == null ? lIl : var1;
      return (S)this;
   }

   public boolean lIll() {
      return this.llI == null || this.llI.getAsBoolean();
   }

   static {
      IIIII(null);
   }

   protected IIllllIl(Object var1, T var2) {
      this.IlI = true;
      this.lII = IlIIllIII.l(var1);
      this.IIl = (T)var2;
      this.Ill = (T)var2;
   }

   private static boolean llII() {
      return true;
   }

   protected IIllllIl(String var1, T var2) {
      this((Object)var1, (T)var2);
   }

   public T IllI() {
      return this.Ill;
   }

   public long l() {
      return this.lII.I();
   }

   public String llIl() {
      return this.lII.llIl();
   }

   public void Il(T var1) {
      boolean var2 = !Objects.equals(this.Ill, var1);
      this.Ill = (T)var1;
      if (var2) {
         this.llll();
      }
   }

   public boolean lllI() {
      return this.IlI;
   }

   protected final void llll() {
      IIIIIllII var1 = IIIIIllII.III();
      if (var1 != null) {
         var1.lll();
      }
   }

   public static void IIIII(String[] var0) {
      III = var0;
   }

   public abstract void ll(JsonElement var1);

   public static String[] IIIIl() {
      return III;
   }

   public IIIlIlIl IIIlI() {
      return this.lII;
   }
}
