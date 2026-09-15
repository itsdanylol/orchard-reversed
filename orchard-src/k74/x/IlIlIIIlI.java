package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_757;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
record IlIlIIIlI(class_4184 a, class_757 b, Matrix4f viewMatrix, Matrix4f projectionMatrix) {
   private final class_757 I;
   private final Matrix4f l;
   private final Matrix4f II;
   private final class_4184 Il;

   private IlIlIIIlI(class_4184 a, class_757 b, Matrix4f viewMatrix, Matrix4f projectionMatrix) {
      this.Il = a;
      this.I = b;
      this.l = viewMatrix;
      this.II = projectionMatrix;
   }

   public class_4184 II() {
      return this.Il;
   }

   public Matrix4f Il() {
      return this.II;
   }
}
