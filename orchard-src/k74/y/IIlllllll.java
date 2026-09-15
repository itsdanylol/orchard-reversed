package k74.y;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_746.class})
public interface IIlllllll {
   @Accessor("field_3923")
   void m3x$setTicksSinceLastPositionPacketSent(int var1);

   @Accessor("field_3919")
   boolean m3x$getLastSprinting();

   @Accessor("field_3926")
   void m3x$setLastXClient(double var1);

   @Accessor("field_3924")
   double m3x$getLastZClient();

   @Accessor("field_3941")
   float m3x$getLastYawClient();

   @Accessor("field_3924")
   void m3x$setLastZClient(double var1);

   @Accessor("field_3926")
   double m3x$getLastXClient();

   @Accessor("field_3940")
   void m3x$setLastYClient(double var1);

   @Accessor("field_3925")
   float m3x$getLastPitchClient();

   @Accessor("field_3919")
   void m3x$setLastSprinting(boolean var1);

   @Accessor("field_3941")
   void m3x$setLastYawClient(float var1);

   @Accessor("field_3925")
   void m3x$setLastPitchClient(float var1);

   @Accessor("field_3923")
   int m3x$getTicksSinceLastPositionPacketSent();

   @Accessor("field_3940")
   double m3x$getLastYClient();
}
