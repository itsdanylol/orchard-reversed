package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1937;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record IllIIIII(class_1937 a, long b, class_243 position, class_243 velocity, IlIlllIl e, int f, IlIIlllI g) {
   private final class_1937 I;
   private final class_243 l;
   private final long II;
   private final IlIlllIl Il;
   private final class_243 lI;
   private final IlIIlllI ll;
   private final int III;

   public IlIlllIl I() {
      return this.Il;
   }

   public class_243 l() {
      return this.lI;
   }

   public class_243 Il() {
      return this.l;
   }

   private boolean lI(class_1937 var1, long var2, class_243 var4, class_243 var5, IlIlllIl var6, int var7) {
      return this.I == var1 && this.II == var2 && this.III == var7 && this.l.equals(var4) && this.lI.equals(var5) && this.Il.equals(var6);
   }

   public class_1937 ll() {
      return this.I;
   }

   public IlIIlllI III() {
      return this.ll;
   }

   public int IIl() {
      return this.III;
   }

   private IllIIIII(class_1937 a, long b, class_243 position, class_243 velocity, IlIlllIl e, int f, IlIIlllI g) {
      this.I = a;
      this.II = b;
      this.l = position;
      this.lI = velocity;
      this.Il = e;
      this.III = f;
      this.ll = g;
   }
}
