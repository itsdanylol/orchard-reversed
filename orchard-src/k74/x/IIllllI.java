package k74.x;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3675;

@Environment(EnvType.CLIENT)
public final class IIllllI {
   private static final AtomicBoolean I = new AtomicBoolean();

   private static Throwable I(Throwable var0) {
      return var0;
   }

   private static void l(class_310 var0, lIIIlIlI var1) {
      String[] var10000 = IIllllIl.IIIIl();
      IIIIIllII var3 = IIIIIllII.III();
      String[] var2 = var10000;
      if (var0 != null) {
         try {
            IIll.lIlIII();
         } catch (Throwable var23) {
         }

         try {
            IIll.IlIIlll();
         } catch (Throwable var22) {
         }

         try {
            IlllIlII.lIIll();
         } catch (Throwable var21) {
         }

         try {
            IIIIlIIIl.IIlIl().lIll(true);
         } catch (Throwable var20) {
         }
      }

      if (var1 != null) {
         try {
            var1.lIIIl().I(var0);
         } catch (Throwable var19) {
         }

         try {
            var1.llIIlI().I();
         } catch (Throwable var18) {
         }

         try {
            var1.lIllII().Ill(var0);
         } catch (Throwable var17) {
         }

         for (IlIIIIIIl var5 : List.copyOf(var1.IIIlll())) {
            try {
               try {
                  if (var5.IIIIlIl()) {
                     var5.IlIllIl(false);
                  }
               } catch (Throwable var25) {
                  throw I(var25);
               }

               var5.IlIlIll(false);
               var5.IlIllll(class_3675.field_16237);
            } catch (Throwable var26) {
            }

            if (var2 != null) {
               break;
            }
         }
      }

      if (var0 != null) {
         try {
            var0.method_1507(null);
         } catch (Throwable var16) {
         }
      }

      try {
         IIllllll.ll();
      } catch (Throwable var15) {
      }

      try {
         IlIlIllII.l().lI();
      } catch (Throwable var14) {
      }

      try {
         llllIlII.I();
         IIIIlIlI.IlIl();
      } catch (Throwable var13) {
      }

      try {
         IIlIIlIl.IIIIIlI(IllIlII.l, true);
         IIlIIlIl.lIIIll();
         IIlIIlIl.IlIllI();
         IIlIIlIl.lIlI();
         IIlIIlIl.IIIIll();
         IIlIIlIl.IlIIll();
         IIlllllIl.lIIII();
         IIlIIlIl.lllII();
      } catch (Throwable var12) {
      }

      try {
         IlllI.IlII();
      } catch (Throwable var11) {
      }

      try {
         IlIIIlIll.II();
         IlIIIIII.IIIl();
         lllIIll.IlIl();
         IlIlIIlll.IlII();
         IIIIIIlI.ll();
      } catch (Throwable var10) {
      }

      if (var1 != null) {
         try {
            var1.lIlI();
         } catch (Throwable var9) {
         }
      }

      try {
         IIlllllII.IIIl();
         IlIlllII.lI();
         IIIlIlll.l();
         if (var3 != null) {
            var3.IllI();
         }
      } catch (Throwable var24) {
         throw I(var24);
      }

      try {
         IlIIllIII.llI();
      } catch (Throwable var8) {
      }

      try {
         System.gc();
      } catch (Throwable var7) {
      }
   }

   private IIllllI() {
   }

   public static boolean II() {
      return I.get();
   }

   public static boolean Il(class_310 var0, lIIIlIlI var1) {
      if (!I.compareAndSet(false, true)) {
         return false;
      } else {
         l(var0, var1);
         return true;
      }
   }
}
