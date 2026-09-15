package k74.x;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class lIIIIIlI extends IIllllIl<Set<String>> {
   private final List<lIllll> I;

   public Set<String> I() {
      return IlI(IlII(this.IlIl(), this.I));
   }

   public void II(Set<String> var1) {
      this.llI(var1);
   }

   private IlIlIlI lI() {
      return IlII((Set<String>)super.IllI(), this.I);
   }

   public boolean III(IIIlIlIl var1) {
      return var1 != null && this.lI().l(var1.I());
   }

   private static Set<String> IlI(IlIlIlI var0) {
      LinkedHashSet var1 = new LinkedHashSet();

      for (String var3 : var0) {
         var1.add(var3);
      }

      return Collections.unmodifiableSet(var1);
   }

   @Override
   public JsonElement IIl() {
      JsonArray var1 = new JsonArray();

      for (String var3 : this.lI()) {
         var1.add(var3);
      }

      return var1;
   }

   public boolean Ill(String var1) {
      return var1 != null && this.lI().l(IlIIllIII.IlIl(var1));
   }

   private static Long lII(Object var0) {
      if (var0 instanceof String var3) {
         return IlIIllIII.IlIl(var3);
      } else if (var0 instanceof IIIlIlIl var2) {
         return var2.I();
      } else {
         return var0 instanceof lIllll var1 ? var1.ll() : null;
      }
   }

   @Override
   public void ll(JsonElement var1) {
      if (var1 != null && !var1.isJsonNull()) {
         ArrayList var2 = new ArrayList();
         if (var1.isJsonArray()) {
            for (JsonElement var4 : var1.getAsJsonArray()) {
               if (var4 != null && var4.isJsonPrimitive()) {
                  var2.add(var4.getAsString());
               }
            }
         } else if (var1.isJsonPrimitive()) {
            var2.add(var1.getAsString());
         }

         this.IIII(var2);
      }
   }

   public void lIl(lIllll var1) {
      if (var1 != null && this.I.contains(var1)) {
         LinkedHashSet var2 = new LinkedHashSet<>(this.lI().I());
         if (!var2.remove(var1.ll())) {
            var2.add(var1.ll());
         }

         super.Il(new IlIlIlI(this.I, var2));
      }
   }

   private void llI(Collection<?> var1) {
      super.Il(lll(var1, this.I));
   }

   private static IlIlIlI lll(Collection<?> var0, List<lIllll> var1) {
      List var3 = List.copyOf(var1);
      String[] var10000 = IIllllIl.IIIIl();
      LinkedHashSet var4 = new LinkedHashSet();
      String[] var2 = var10000;

      for (lIllll var6 : var3) {
         var4.add(var6.ll());
         if (var2 != null) {
            break;
         }
      }

      LinkedHashSet var10 = new LinkedHashSet();
      if (var0 instanceof IlIlIlI var11) {
         for (long var8 : var11.I()) {
            if (var4.contains(var8)) {
               var10.add(var8);
            }

            if (var2 != null) {
               break;
            }
         }

         if (var2 == null) {
            return new IlIlIlI(var3, var10);
         }
      }

      if (var0 != null) {
         for (Object var13 : var0) {
            Long var9 = lII(var13);
            if (var9 != null && var4.contains(var9)) {
               var10.add(var9);
            }

            if (var2 != null) {
               break;
            }
         }
      }

      return new IlIlIlI(var3, var10);
   }

   public void IIII(Collection<String> var1) {
      this.llI(var1);
   }

   public Set<String> IIIl() {
      return IlI(this.lI());
   }

   public boolean IIlI(lIllll var1) {
      return var1 != null && this.lI().l(var1.ll());
   }

   public lIIIIIlI(String var1, List var2, Collection var3) {
      this((Object)var1, var2, var3);
   }

   public List<lIllll> IIll() {
      return this.I;
   }

   private static IlIlIlI IlII(Set<String> var0, List<lIllll> var1) {
      return var0 instanceof IlIlIlI var2 ? var2 : lll(var0, var1);
   }

   public lIIIIIlI(Object var1, List<lIllll> var2, Collection<?> var3) {
      super(var1, lll(var3, var2));
      this.I = List.copyOf(var2);
      this.llI(var3);
   }
}
