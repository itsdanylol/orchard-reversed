package k74.y;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1661;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_1661.class})
public interface IIlllIlIl {
   @Accessor("field_7545")
   void q96_setSlot(int var1);

   @Accessor("field_7545")
   int q96_getSelectedSlot();

   @Accessor("field_7545")
   int ilovcats$getSelectedSlot();

   @Accessor("field_7545")
   void ilovcats$setSlot(int var1);
}
