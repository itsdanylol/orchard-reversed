package k74.x;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_640;
import net.minecraft.class_745;
import net.minecraft.class_1297.class_5529;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public final class IIIIllll extends class_745 {
   private final int I;
   private static final class_310 l = class_310.method_1551();
   @Nullable
   private class_640 II;

   public void I() {
      if (l.field_1687 != null) {
         l.field_1687.method_2945(this.method_5628(), class_5529.field_26999);
         this.method_31745(class_5529.field_26999);
      }
   }

   @Nullable
   protected class_640 method_3123() {
      if (this.II == null && l.method_1562() != null && l.field_1724 != null) {
         this.II = l.method_1562().method_2871(l.field_1724.method_5667());
      }

      return this.II;
   }

   public IIIIllll(class_1657 var1, String var2, float var3, boolean var4, boolean var5) {
      String[] var6 = IIllllIl.IIIIl();
      super(l.field_1687, II(var1, var2));
      if (l.field_1687 != null && var1 != null) {
         label40: {
            this.method_5719(var1);
            this.field_6014 = var1.field_6014;
            this.field_6036 = var1.field_6036;
            this.field_5969 = var1.field_5969;
            this.field_6241 = var1.field_6241;
            this.field_6283 = var1.field_6283;
            this.method_18799(var1.method_18798());
            this.method_24830(var1.method_24828());
            this.method_5660(var1.method_5715());
            this.method_5728(var1.method_5624());
            this.method_5796(var1.method_5681());
            this.method_5855(var1.method_5669());
            this.method_20803(var1.method_20802());
            this.method_6127().method_26846(var1.method_6127());
            this.method_18380(var1.method_18376());
            this.field_5960 = false;
            if (var3 <= 20.0F) {
               this.method_6033(Math.max(1.0F, var3));
               if (var6 == null) {
                  break label40;
               }
            }

            this.method_6033(20.0F);
            this.method_6073(var3 - 20.0F);
         }

         if (var5) {
            this.method_5648(true);
         }

         if (var4) {
            this.method_31548().method_7377(var1.method_31548());
         }

         this.II = l.method_1562() == null ? null : l.method_1562().method_2871(var1.method_5667());
         this.I = this.II == null ? 0 : this.II.method_2959();
      } else {
         this.I = 0;
      }
   }

   public int l() {
      return this.I;
   }

   private static GameProfile II(class_1657 var0, String var1) {
      String var2 = var1 != null && !var1.isEmpty() ? var1 : var0.method_5477().getString();
      return new GameProfile(UUID.randomUUID(), var2);
   }

   public void Il() {
      if (l.field_1687 != null) {
         this.method_31482();
         this.field_5960 = false;
         l.field_1687.method_53875(this);
      }
   }
}
