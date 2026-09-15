package k74.y;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2684;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_2684.class})
public interface IIlIIIIII {
   @Accessor("field_12310")
   int ilovcats$getEntityId();
}
