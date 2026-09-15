package k74.y;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public interface lIlIlllI {
   @Accessor("field_6228")
   void m3x$setJumpingCooldown(int var1);

   @Accessor("field_6228")
   void ilovcats$setJumpingCooldown(int var1);
}
