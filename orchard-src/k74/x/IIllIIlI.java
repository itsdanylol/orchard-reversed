package k74.x;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIllIIlI(Object a, ChannelPromise b, long c, int d, long e) {
   private final ChannelPromise I;
   private final int l;
   private final long II;
   private final Object Il;
   private final long lI;

   private IIllIIlI(Object a, ChannelPromise b, long c, int d, long e) {
      this.Il = a;
      this.I = b;
      this.II = c;
      this.l = d;
      this.lI = e;
   }

   public long I() {
      return this.lI;
   }

   public ChannelPromise II() {
      return this.I;
   }

   public long Il() {
      return this.II;
   }

   public Object lI() {
      return this.Il;
   }
}
