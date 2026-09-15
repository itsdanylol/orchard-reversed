package k74.x;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IIllllllI(Object a, ChannelPromise b, IlIllIIl c, long d, long e) {
   private final long I;
   private final long l;
   private final Object II;
   private final ChannelPromise Il;
   private final IlIllIIl lI;

   public IlIllIIl I() {
      return this.lI;
   }

   public ChannelPromise l() {
      return this.Il;
   }

   private IIllllllI(Object a, ChannelPromise b, IlIllIIl c, long d, long e) {
      this.II = a;
      this.Il = b;
      this.lI = c;
      this.l = d;
      this.I = e;
   }

   public long Il() {
      return this.l;
   }

   public long lI() {
      return this.I;
   }
}
