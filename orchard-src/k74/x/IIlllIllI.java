package k74.x;

import k74.y.IIlIIllI;
import k74.y.IIlllIlIl;
import k74.y.IIlllllll;
import k74.y.IlIllII;
import k74.y.lIlIlIll;
import k74.y.lIlIlllI;
import k74.y.lllIIl;
import k74.y.lllIlII;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_1661;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_2684;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_465;
import net.minecraft.class_636;
import net.minecraft.class_746;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
public final class IIlllIllI {
   public static void I(class_636 var0, class_1799 var1) {
      ((IlIllII)var0).q96_setSelectedStack(var1);
   }

   public static void l(class_636 var0, int var1) {
      ((IlIllII)var0).q96_setLastSelectedSlot(var1);
   }

   public static boolean II(class_310 var0) {
      return ((IIlIIllI)var0).q96_doAttack();
   }

   public static int Il(class_1661 var0) {
      return ((IIlllIlIl)var0).q96_getSelectedSlot();
   }

   public static void lI(class_746 var0, int var1) {
      ((IIlllllll)var0).m3x$setTicksSinceLastPositionPacketSent(var1);
   }

   public static int ll(class_310 var0) {
      return ((IIlIIllI)var0).q96_getAtkCd();
   }

   public static void III(class_746 var0, float var1) {
      ((IIlllllll)var0).m3x$setLastPitchClient(var1);
   }

   public static double IIl(class_746 var0) {
      return ((IIlllllll)var0).m3x$getLastXClient();
   }

   public static boolean IlI(class_636 var0) {
      return ((IlIllII)var0).q96_isBreakingBlock();
   }

   public static void Ill(class_310 var0, int var1) {
      ((IIlIIllI)var0).q96_setAtkCd(var1);
   }

   public static class_306 lII(class_304 var0) {
      return ((lllIIl)var0).m3x$getBoundKey();
   }

   public static float lIl(class_746 var0) {
      return ((IIlllllll)var0).m3x$getLastYawClient();
   }

   public static void llI(class_746 var0, float var1) {
      ((IIlllllll)var0).m3x$setLastYawClient(var1);
   }

   public static void lll(class_310 var0) {
      ((IIlIIllI)var0).q96_doItemUse();
   }

   public static float IIII(class_746 var0) {
      return ((IIlllllll)var0).m3x$getLastPitchClient();
   }

   private IIlllIllI() {
   }

   public static void IIIl(class_310 var0, int var1) {
      ((IIlIIllI)var0).q96_setUseCd(var1);
   }

   public static void IIlI(class_636 var0) {
      ((IlIllII)var0).q96_invokeSyncSelectedSlot();
   }

   public static int IIll(class_2684 var0) {
      return ((lIlIlIll)var0).ilovcats$getId();
   }

   public static void IlII(class_310 var0, int var1) {
      ((IIlIIllI)var0).q96_setUseCd(var1);
   }

   public static void IlIl(class_746 var0, double var1) {
      ((IIlllllll)var0).m3x$setLastZClient(var1);
   }

   public static void IllI(class_746 var0, double var1) {
      ((IIlllllll)var0).m3x$setLastXClient(var1);
   }

   public static int Illl(class_636 var0) {
      return ((IlIllII)var0).q96_getBbCooldown();
   }

   public static class_1799 lIII(class_636 var0) {
      return ((IlIllII)var0).q96_getSelectedStack();
   }

   public static double lIIl(class_746 var0) {
      return ((IIlllllll)var0).m3x$getLastZClient();
   }

   public static double lIlI(class_746 var0) {
      return ((IIlllllll)var0).m3x$getLastYClient();
   }

   public static void lIll(class_1309 var0, int var1) {
      ((lIlIlllI)var0).m3x$setJumpingCooldown(var1);
   }

   public static void llII(class_304 var0, int var1) {
      ((lllIIl)var0).m3x$setTimesPressed(var1);
   }

   public static void llIl(class_1661 var0, int var1) {
      ((IIlllIlIl)var0).q96_setSlot(var1);
   }

   public static void lllI(class_636 var0, int var1) {
      ((IlIllII)var0).q96_setBbCooldown(var1);
   }

   public static int llll(class_310 var0) {
      return ((IIlIIllI)var0).q96_getUseCd();
   }

   public static class_1735 IIIII(class_465<?> var0) {
      return ((lllIlII)var0).q96fbb2be();
   }

   public static void IIIIl(class_746 var0, double var1) {
      ((IIlllllll)var0).m3x$setLastYClient(var1);
   }

   public static int IIIlI(class_636 var0) {
      return ((IlIllII)var0).q96_getLastSelectedSlot();
   }

   public static int IIIll(class_304 var0) {
      return ((lllIIl)var0).m3x$getTimesPressed();
   }

   public static int IIlII(class_746 var0) {
      return ((IIlllllll)var0).m3x$getTicksSinceLastPositionPacketSent();
   }
}
