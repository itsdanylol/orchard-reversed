package k74.y;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_304;
import net.minecraft.class_3675.class_306;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_304.class})
public interface lllIIl {
   @Accessor("field_1661")
   int m3x$getTimesPressed();

   @Accessor("field_1661")
   void m3x$setTimesPressed(int var1);

   @Accessor("field_1655")
   class_306 m3x$getBoundKey();
}
