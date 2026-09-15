package k74.y;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({class_310.class})
public interface IIlIIllI {
   @Accessor("field_1771")
   void ilovcats$setAttackCooldown(int var1);

   @Accessor("field_1771")
   int ilovcats$getAttackCooldown();

   @Invoker("method_1583")
   void q96_doItemUse();

   @Accessor("field_1771")
   int q96_getAtkCd();

   @Accessor("field_1752")
   int q96_getUseCd();

   @Accessor("field_1752")
   int ilovcats$getUseCd();

   @Accessor("field_1771")
   int ilovcats$getAtkCd();

   @Accessor("field_1771")
   void q96_setAttackCooldown(int var1);

   @Accessor("field_1752")
   void q96_setUseCd(int var1);

   @Accessor("field_1752")
   void ilovcats$setUseCd(int var1);

   @Accessor("field_1771")
   int q96_getAttackCooldown();

   @Accessor("field_1771")
   void q96_setAtkCd(int var1);

   @Invoker("method_1536")
   boolean q96_doAttack();

   @Accessor("field_1771")
   void ilovcats$setAtkCd(int var1);
}
