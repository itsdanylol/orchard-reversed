package k74.x;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIlIlllIl(Object a, ChannelPromise b, long c, long d) {
   private final long I;
   private final long l;
   private final ChannelPromise II;
   private final Object Il;

   public Object I() {
      return this.Il;
   }

   private IIlIlllIl(Object a, ChannelPromise b, long c, long d) {
      this.Il = a;
      this.II = b;
      this.I = c;
      this.l = d;
   }

   public long Il() {
      return this.I;
   }
}
