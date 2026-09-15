package k74.y;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Path;
import java.util.Map;
import k74.x.IlIIIIII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3521;
import net.minecraft.class_3521.class_9034;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin({class_3521.class})
public abstract class IIlllllI {
   @Inject(
      method = {"method_55496"},
      at = {@At("HEAD")}
   )
   private static void I(
      Path var0, URL var1, Map<String, String> var2, HashFunction var3, HashCode var4, int var5, Proxy var6, class_9034 var7, CallbackInfoReturnable<Path> var8
   ) {
      if (IlIIIIII.llll()) {
         if (!IlIIIIII.IIlI(var1.toString())) {
            IlIIIIII.III(var1.toString());
            throw new IllegalArgumentException();
         }
      }
   }

   @ModifyArg(
      method = {"method_55496"},
      at = @At(
         value = "INVOKE",
         target = "Ljava/net/HttpURLConnection;setInstanceFollowRedirects(Z)V"
      ),
      index = 0
   )
   private static boolean l(boolean var0) {
      return IlIIIIII.llll() ? false : var0;
   }
}
