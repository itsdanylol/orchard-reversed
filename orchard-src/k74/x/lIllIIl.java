package k74.x;

import java.util.List;

public record lIllIIl(List<IlIlIlIl> a, double width, double height) {
   private final double I;
   private final double l;
   private final List<IlIlIlIl> II;

   public List<IlIlIlIl> l() {
      return this.II;
   }

   public double II() {
      return this.l;
   }

   public lIllIIl(List<IlIlIlIl> a, double width, double height) {
      this.II = a;
      this.I = width;
      this.l = height;
   }

   private static lIllIIl Il() {
      return new lIllIIl(List.of(), 0.0, 0.0);
   }
}
