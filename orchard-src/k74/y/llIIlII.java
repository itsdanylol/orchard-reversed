package k74.y;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import k74.x.IIIIIllII;
import k74.x.IIlIIlIl;
import k74.x.IIllIll;
import k74.x.IIlllI;
import k74.x.IlIIIIl;
import k74.x.IlIIllIII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_2815;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_2535.class})
public abstract class llIIlII {
   @Shadow
   @Final
   private class_2598 field_11643;
   @Unique
   private static final String I = IlIIllIII.lI("kZhbihpWRA+oGJZXCOzNjpebUg==");
   @Unique
   private IIlIIlIl l;
   @Shadow
   private Channel field_11651;

   @Inject(
      method = {"method_10743"},
      at = {@At("TAIL")}
   )
   private void I(class_2596<?> var1, CallbackInfo var2) {
      IIIIIllII var3 = IIIIIllII.III();
      if (var3 != null && var3.II() != null) {
         var3.II().llllI(var1);
      }
   }

   private void l(Channel var1, ChannelPipeline var2) {
      if (this.field_11651 == var1 && var1.isOpen()) {
         ChannelHandler var3 = var2.get(I);
         if (var3 instanceof IIlIIlIl var6) {
            this.l = var6;
         } else if (var3 == null) {
            ChannelHandlerContext var4 = var2.context((ChannelHandler)this);
            IIlIIlIl var5 = new IIlIIlIl();
            if (var4 != null) {
               var2.addBefore(var4.name(), I, var5);
            } else {
               var2.addLast(I, var5);
            }

            this.l = var5;
         }
      }
   }

   @Inject(
      method = {"method_10743"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void II(class_2596<?> var1, CallbackInfo var2) {
      IIIIIllII var3 = IIIIIllII.III();
      if (this.Il()) {
         this.lI(this.field_11651.pipeline());
      }

      if (var3 != null && var3.II() != null) {
         IlIIIIl var4 = var3.II().IIlIlIl();
         if (var4 != null && var4.IIlI(var1)) {
            var2.cancel();
            return;
         }
      }

      if (var3 != null && var1 instanceof class_2815 var6) {
         IIllIll var5 = var3.II().IIl();
         if (var5 != null && var5.ll(var6)) {
            var2.cancel();
            return;
         }
      }

      if (var3 != null && var3.II() != null && var3.II().IlIlIlI() != null) {
         var3.II().IlIlIlI().I(var1);
      }

      if (var3 != null && var3.II() != null) {
         var3.II().IlIlll(var1);
      }

      IIlIIlIl.IIllI(var1);
   }

   @Unique
   private boolean Il() {
      return this.field_11643 == class_2598.field_11942 && this.field_11651 != null;
   }

   @Unique
   private void lI(ChannelPipeline var1) {
      IIlllI.Ill().ll();
      Channel var2 = var1.channel();
      Runnable var3 = this::l;
      if (var2.eventLoop().inEventLoop()) {
         var3.run();
      } else {
         try {
            var2.eventLoop().execute(var3);
         } catch (RuntimeException var5) {
         }
      }
   }

   @Inject(
      method = {"method_53859"},
      at = {@At("RETURN")}
   )
   private void ll(ChannelPipeline var1, CallbackInfo var2) {
      if (this.Il()) {
         this.lI(var1);
      }
   }

   @Inject(
      method = {"channelInactive"},
      at = {@At("HEAD")}
   )
   private void III(ChannelHandlerContext var1, CallbackInfo var2) {
      IIlllI.Ill().IIl();
      if (this.l != null) {
         this.l.lIllIl();
         this.l = null;
      }
   }

   @Inject(
      method = {"channelActive"},
      at = {@At("TAIL")}
   )
   private void IIl(ChannelHandlerContext var1, CallbackInfo var2) {
      if (this.Il()) {
         this.lI(var1.pipeline());
      }
   }
}
