package k74.y;

import k74.x.IlIIllIII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_6396;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oshi.SystemInfo;

@Environment(EnvType.CLIENT)
@Mixin({class_6396.class})
public abstract class IlIIIII {
   @Shadow
   public abstract void method_37122(String var1, String var2);

   @Inject(
      method = {"method_37128"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void I(SystemInfo var1, CallbackInfo var2) {
      String var3 = System.getProperty(IlIIllIII.lI("l4cakhhaVQ=="), "").toLowerCase();
      if (var3.contains(IlIIllIII.lI("j51a"))) {
         this.method_37122(IlIIllIII.lI("qIZbnxxEQxOFSKlcAdfRjA=="), IlIIllIII.lI("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(IlIIllIII.lI("qIZbnxxEQxOFSLFYAtY="), IlIIllIII.lI("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(IlIIllIII.lI("sZBRkg1eVhWSGg=="), IlIIllIII.lI("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(IlIIllIII.lI("tZ1XjhZWQh+fAYtcDMfLjJ0="), IlIIllIII.lI("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(IlIIllIII.lI("voZRjQxSXh+OSNd+J8mX"), IlIIllIII.lI("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(IlIIllIII.lI("toFZnhxFEBORSI9RFsDXnZmYFIwYVFsdkA2M"), IlIIllIII.lI("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(IlIIllIII.lI("toFZnhxFEBORSI9RFsDXnZmYFL8pYkM="), IlIIllIII.lI("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         this.method_37122(IlIIllIII.lI("toFZnhxFEBORSJNWCNrdn5TUd6wsRA=="), IlIIllIII.lI("rZpVihheXB2VBJoZR9vfjJyDVY4cF0AOmAqaGRzY146IkVDV"));
         var2.cancel();
      }
   }
}
