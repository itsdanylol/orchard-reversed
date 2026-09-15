package k74.y;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public interface IlIllII {
   @Accessor("field_3718")
   class_1799 q96_getSelectedStack();

   @Invoker("method_2911")
   void q96_invokeSyncSelectedSlot();

   @Accessor("field_3718")
   void q96_setSelectedStack(class_1799 var1);

   @Accessor("field_3721")
   void q96_setLastSelectedSlot(int var1);

   @Accessor("field_3716")
   int q96_getBbCooldown();

   @Accessor("field_3716")
   void q96_setBbCooldown(int var1);

   @Accessor("field_3717")
   boolean q96_isBreakingBlock();

   @Accessor("field_3721")
   int q96_getLastSelectedSlot();
}
