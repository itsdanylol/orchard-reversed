package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class llIIIlII implements Runnable {
   final llIlIlIl I;
   final long l;

   @Override
   public void run() {
      this.I.lIl = System.currentTimeMillis() + this.l;
   }

   llIIIlII(llIlIlIl var1, long var2) {
      this.l = var2;
      this.I = var1;
   }
}
