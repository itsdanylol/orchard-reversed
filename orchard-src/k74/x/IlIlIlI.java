package k74.x;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class IlIlIlI extends AbstractSet<String> {
   private final Set<Long> I;
   private final List<lIllll> l;

   @Override
   public int size() {
      return this.I.size();
   }

   @Override
   public boolean contains(Object var1) {
      Long var2 = lIIIIIlI.lII(var1);
      return var2 != null && this.l(var2);
   }

   @Override
   public int hashCode() {
      String[] var10000 = IIllllIl.IIIIl();
      int var2 = 0;
      String[] var1 = var10000;

      for (long var4 : this.I) {
         lIllll var6 = this.II(var4);
         if (var6 != null) {
            var2 += var6.Il;
         }

         if (var1 != null) {
            break;
         }
      }

      return var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return var1 instanceof IlIlIlI var2 ? this.I.equals(var2.I) : super.equals(var1);
      }
   }

   private Set<Long> I() {
      return this.I;
   }

   private boolean l(long var1) {
      return this.I.contains(var1);
   }

   @Override
   public Iterator<String> iterator() {
      Iterator var1 = this.I.iterator();
      return new lIIIIIl(this, var1);
   }

   private IlIlIlI(List<lIllll> var1, Collection<Long> var2) {
      this.l = List.copyOf(var1);
      this.I = Collections.unmodifiableSet(new LinkedHashSet<>(var2));
   }

   private lIllll II(long var1) {
      String[] var10000 = IIllllIl.IIIIl();
      Iterator var4 = this.l.iterator();
      String[] var3 = var10000;

      while (var4.hasNext()) {
         lIllll var5 = (lIllll)var4.next();
         if (var5.ll() == var1) {
            return var5;
         }

         if (var3 != null) {
            break;
         }
      }

      return null;
   }
}
