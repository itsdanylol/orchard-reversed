package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class lIlIllI implements Runnable {
   final llIlIlIl I;
   final long l;

   lIlIllI(llIlIlIl var1, long var2) {
      this.l = var2;
      this.I = var1;
   }

   @Override
   public void run() {
      this.I.III = System.currentTimeMillis() + this.l;
   }
}
