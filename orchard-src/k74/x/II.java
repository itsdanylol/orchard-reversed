package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record II(int chunkX, int chunkZ, int distanceSq) {
   private final int I;
   private final int l;
   private final int II;

   public int I() {
      return this.l;
   }

   public int l() {
      return this.II;
   }

   public int II() {
      return this.I;
   }

   private II(int chunkX, int chunkZ, int distanceSq) {
      this.I = chunkX;
      this.l = chunkZ;
      this.II = distanceSq;
   }
}
