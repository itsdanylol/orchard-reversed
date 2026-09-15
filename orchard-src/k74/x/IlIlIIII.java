package k74.x;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10185;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_744;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class IlIlIIII {
   private final Map<class_304, Boolean> I;
   private final Map<class_304, Map<Object, Boolean>> l = new IdentityHashMap<>();
   private static final IlIlIIII II = new IlIlIIII();

   public void I(class_310 var1) {
      this.III(var1, true);
   }

   public void l(class_315 var1, class_744 var2) {
      if (lII(class_310.method_1551()) && var1 != null && var2 != null && !this.l.isEmpty()) {
         class_10185 var3 = var2.field_54155;
         boolean var4 = this.IIl(var1.field_1894, var3.comp_3159());
         boolean var5 = this.IIl(var1.field_1881, var3.comp_3160());
         boolean var6 = this.IIl(var1.field_1913, var3.comp_3161());
         boolean var7 = this.IIl(var1.field_1849, var3.comp_3162());
         boolean var8 = this.IIl(var1.field_1903, var3.comp_3163());
         boolean var9 = this.IIl(var1.field_1832, var3.comp_3164());
         boolean var10 = this.IIl(var1.field_1867, var3.comp_3165());
         var2.field_54155 = new class_10185(var4, var5, var6, var7, var8, var9, var10);
         float var11 = var4 == var5 ? 0.0F : (var4 ? 1.0F : -1.0F);
         float var12 = var6 == var7 ? 0.0F : (var6 ? 1.0F : -1.0F);
         if (var11 != 0.0F && var12 != 0.0F) {
            float var13 = 0.70710677F;
            var11 *= var13;
            var12 *= var13;
         }

         IIll.IllIlll(var2, var11, var12);
      }
   }

   private void II(class_310 var1, class_304 var2, boolean var3) {
      boolean var4 = this.I.getOrDefault(var2, false);
      boolean var5 = var3 && (var1 == null ? var4 : IIll.IlIllll(var1, var2));
      this.I.remove(var2);
      this.Il(var2, var5, false);
   }

   private void Il(class_304 var1, boolean var2, boolean var3) {
      var1.method_23481(var2);
      class_306 var4 = IIll.lllII(var1);
      if (!IIll.IIlll(var4)) {
         class_304.method_1416(var4, var2);
         if (var3) {
            class_304.method_1420(var4);
         }
      }
   }

   private static boolean lI(Map<Object, Boolean> var0) {
      return var0 != null && !var0.isEmpty() && !var0.containsValue(Boolean.FALSE) ? var0.containsValue(Boolean.TRUE) : false;
   }

   public IlIlIIII() {
      this.I = new IdentityHashMap<>();
   }

   public void ll(Object var1, class_310 var2, class_304 var3, boolean var4) {
      if (var1 != null && var3 != null) {
         if (!lII(var2)) {
            this.lIl(var1, var2, var3);
         } else {
            Map var5 = this.l.computeIfAbsent(var3, IlIlIIII::IIlI);
            boolean var6 = var5.isEmpty() ? IIll.IlIllll(var2, var3) : lI(var5);
            if (var5.isEmpty()) {
               this.I.put(var3, var6);
            }

            var5.put(var1, var4);
            boolean var7 = lI(var5);
            this.Il(var3, var7, !var6 && var7);
         }
      }
   }

   private void III(class_310 var1, boolean var2) {
      String[] var10000 = llIllIlI.IIlII();
      Iterator var4 = Set.copyOf(this.l.keySet()).iterator();
      String[] var3 = var10000;

      while (var4.hasNext()) {
         class_304 var5 = (class_304)var4.next();
         this.II(var1, var5, var2);
         if (var3 == null) {
            break;
         }
      }

      this.l.clear();
      this.I.clear();
   }

   private boolean IIl(class_304 var1, boolean var2) {
      Map var3 = this.l.get(var1);
      return var3 != null && !var3.isEmpty() ? lI(var3) : var2;
   }

   public void IlI(Object var1, class_310 var2) {
      String[] var3 = llIllIlI.IIlII();
      if (var1 != null) {
         for (class_304 var5 : Set.copyOf(this.l.keySet())) {
            this.lIl(var1, var2, var5);
            if (var3 == null) {
               break;
            }
         }
      }
   }

   public boolean Ill(class_306 var1) {
      String[] var2 = llIllIlI.IIlII();
      if (IIll.IIlll(var1)) {
         return false;
      } else {
         for (class_304 var4 : this.l.keySet()) {
            if (var1.equals(IIll.lllII(var4))) {
               return true;
            }

            if (var2 == null) {
               break;
            }
         }

         return false;
      }
   }

   private static boolean lII(class_310 var0) {
      return var0 != null && var0.field_1755 == null && var0.method_22683() != null && var0.method_1569();
   }

   private void lIl(Object var1, class_310 var2, class_304 var3) {
      Map var4 = this.l.get(var3);
      if (var4 != null && var4.remove(var1) != null) {
         if (!var4.isEmpty()) {
            this.Il(var3, lI(var4), false);
         } else {
            this.l.remove(var3);
            this.II(var2, var3, true);
         }
      }
   }

   public static IlIlIIII llI() {
      return II;
   }

   public boolean lll(class_310 var1, class_304 var2) {
      if (var2 == null) {
         return false;
      } else {
         Map var3 = this.l.get(var2);
         return var3 != null && !var3.isEmpty() ? lI(var3) : IIll.IlIllll(var1, var2);
      }
   }

   public void IIII(Object var1, class_310 var2, class_304 var3) {
      if (var1 != null && var3 != null) {
         this.lIl(var1, var2, var3);
      }
   }

   public void IIIl(class_310 var1) {
      if (!this.l.isEmpty() && !lII(var1)) {
         this.III(var1, false);
      }
   }

   private static Map IIlI(class_304 var0) {
      return new IdentityHashMap<>();
   }
}
