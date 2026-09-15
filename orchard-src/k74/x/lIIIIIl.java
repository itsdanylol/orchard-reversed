package k74.x;

import java.util.Iterator;
import java.util.NoSuchElementException;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class lIIIIIl implements Iterator<String> {
   final IlIlIlI I;
   final Iterator l;

   lIIIIIl(IlIlIlI var1, Iterator var2) {
      this.l = var2;
      this.I = var1;
   }

   public String I() {
      try {
         if (!this.l.hasNext()) {
            throw new NoSuchElementException();
         }
      } catch (NoSuchElementException var3) {
         throw l(var3);
      }

      lIllll var1 = this.I.II((Long)this.l.next());

      try {
         if (var1 == null) {
            throw new NoSuchElementException();
         }
      } catch (NoSuchElementException var2) {
         throw l(var2);
      }

      return var1.III();
   }

   @Override
   public boolean hasNext() {
      return this.l.hasNext();
   }

   private static NoSuchElementException l(NoSuchElementException var0) {
      return var0;
   }
}
