package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record lII(String id, String name, String bindLabel, int d) {
   private final String I;
   private final String l;
   private final String II;
   private final int Il;

   public String l() {
      return this.II;
   }

   public String II() {
      return this.l;
   }

   public lII(String id, String name, String bindLabel, int d) {
      this.II = id;
      this.I = name;
      this.l = bindLabel;
      this.Il = d;
   }
}
