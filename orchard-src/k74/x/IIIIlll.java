package k74.x;

import java.awt.image.BufferedImage;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record IIIIlll(BufferedImage a, int scaledWidth, int scaledHeight, long d) {
   private final int I;
   private final int l;
   private final BufferedImage II;
   private final long Il;

   public BufferedImage I() {
      return this.II;
   }

   public IIIIlll(BufferedImage a, int scaledWidth, int scaledHeight, long d) {
      this.II = a;
      this.I = scaledWidth;
      this.l = scaledHeight;
      this.Il = d;
   }

   public long II() {
      return this.Il;
   }

   public int Il() {
      return this.I;
   }
}
