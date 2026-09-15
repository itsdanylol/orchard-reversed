package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIlllll(String a, int b, int c, String d, String e, String f) {
   private final String I;
   private final int l;
   private final String II;
   private final int Il;
   private final String lI;
   private final String ll;

   public String I() {
      return this.ll;
   }

   public String l() {
      return this.lI;
   }

   public int II() {
      return this.Il;
   }

   public String Il() {
      return this.II;
   }

   public int lI() {
      return this.l;
   }

   public String ll() {
      return this.I;
   }

   IIlllll(String a, int b, int c, String d, String e, String f) {
      this.lI = a;
      this.Il = b;
      this.l = c;
      this.ll = d;
      this.II = e;
      this.I = f;
   }
}
