package k74.x;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record IllIlIII(List<IlIIII> b, Map<Long, IlIIII> c, IlIIII a) {
   private final IlIIII I;
   private final Map<Long, IlIIII> l;
   private final List<IlIIII> II;

   public List<IlIIII> I() {
      return this.II;
   }

   private List<String> l() {
      ArrayList var2 = new ArrayList(this.II.size() + 1);
      String[] var10000 = IIllllIl.IIIIl();
      var2.add("");
      String[] var1 = var10000;

      for (IlIIII var4 : this.II) {
         var2.add(var4.II());
         if (var1 != null) {
            break;
         }
      }

      return List.copyOf(var2);
   }

   public Map<Long, IlIIII> II() {
      return this.l;
   }

   public IlIIII Il() {
      return this.I;
   }

   private IlIIII lI(String var1) {
      String[] var2 = IIllllIl.IIIIl();
      if (var1 != null && !var1.isBlank()) {
         IlIIII var3 = this.l.get(IlIIllIII.IlIl(var1));
         if (var3 != null && var3.III().IlI(var1)) {
            return var3;
         } else {
            for (IlIIII var5 : this.II) {
               if (var5.III().IlI(var1)) {
                  return var5;
               }

               if (var2 != null) {
                  break;
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   private IllIlIII(List<IlIIII> b, Map<Long, IlIIII> c, IlIIII a) {
      this.II = b;
      this.l = c;
      this.I = a;
   }
}
