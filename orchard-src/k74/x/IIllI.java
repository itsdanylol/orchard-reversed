package k74.x;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIllI(Object a, ChannelPromise b, long c, IIllIIlI d) {
   private final long I;
   private final IIllIIlI l;
   private final Object II;
   private final ChannelPromise Il;

   public IIllIIlI I() {
      return this.l;
   }

   public ChannelPromise l() {
      return this.Il;
   }

   private IIllI(Object a, ChannelPromise b, long c, IIllIIlI d) {
      this.II = a;
      this.Il = b;
      this.I = c;
      this.l = d;
   }

   public long II() {
      return this.I;
   }

   public Object Il() {
      return this.II;
   }
}
