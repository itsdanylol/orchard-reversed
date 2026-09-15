package k74.x;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3675.class_306;

@Environment(EnvType.CLIENT)
record lIllII(IlIIIIIIl a, lIllIlII b, boolean c, IIIIIllII d, IlIIIIIl e, String f) {
   private final boolean I;
   private final IlIIIIIIl l;
   private final lIllIlII II;
   private final IlIIIIIl Il;
   private final String lI;
   private final IIIIIllII ll;

   public IlIIIIIl l() {
      return this.Il;
   }

   public IlIIIIIIl II() {
      return this.l;
   }

   private lIllII(IlIIIIIIl a, lIllIlII b, boolean c, IIIIIllII d, IlIIIIIl e, String f) {
      this.l = a;
      this.II = b;
      this.I = c;
      this.ll = d;
      this.Il = e;
      this.lI = f;
   }

   static lIllII Il(lIllIlII var0) {
      return new lIllII(null, var0, false, null, null, null);
   }

   void lI(class_306 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/lIllII.I Z
      // 04: ifeq 25
      // 07: aload 0
      // 08: getfield k74/x/lIllII.ll Lk74/x/IIIIIllII;
      // 0b: ifnull 25
      // 0e: goto 15
      // 11: invokestatic k74/x/lIllII.lII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 14: athrow
      // 15: aload 0
      // 16: getfield k74/x/lIllII.ll Lk74/x/IIIIIllII;
      // 19: invokevirtual k74/x/IIIIIllII.ll ()Lk74/x/IlllIlI;
      // 1c: aload 1
      // 1d: invokevirtual k74/x/IlllIlI.Illll (Lnet/minecraft/class_3675$class_306;)V
      // 20: return
      // 21: invokestatic k74/x/lIllII.lII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 24: athrow
      // 25: aload 0
      // 26: getfield k74/x/lIllII.l Lk74/x/IlIIIIIIl;
      // 29: ifnull 39
      // 2c: aload 0
      // 2d: getfield k74/x/lIllII.l Lk74/x/IlIIIIIIl;
      // 30: aload 1
      // 31: invokevirtual k74/x/IlIIIIIIl.IlIllll (Lnet/minecraft/class_3675$class_306;)V
      // 34: return
      // 35: invokestatic k74/x/lIllII.lII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 38: athrow
      // 39: aload 0
      // 3a: getfield k74/x/lIllII.II Lk74/x/lIllIlII;
      // 3d: ifnull 4d
      // 40: aload 0
      // 41: getfield k74/x/lIllII.II Lk74/x/lIllIlII;
      // 44: aload 1
      // 45: invokevirtual k74/x/lIllIlII.lI (Lnet/minecraft/class_3675$class_306;)V
      // 48: return
      // 49: invokestatic k74/x/lIllII.lII (Ljava/lang/Exception;)Ljava/lang/Exception;
      // 4c: athrow
      // 4d: aload 0
      // 4e: getfield k74/x/lIllII.Il Lk74/x/IlIIIIIl;
      // 51: ifnull 65
      // 54: aload 0
      // 55: getfield k74/x/lIllII.Il Lk74/x/IlIIIIIl;
      // 58: aload 0
      // 59: getfield k74/x/lIllII.lI Ljava/lang/String;
      // 5c: aload 1
      // 5d: invokevirtual k74/x/IlIIIIIl.lIl (Ljava/lang/String;Lnet/minecraft/class_3675$class_306;)Ljava/util/Map;
      // 60: pop
      // 61: goto 65
      // 64: astore 2
      // 65: return
   }

   static lIllII ll(IIIIIllII var0) {
      return new lIllII(null, null, true, var0, null, null);
   }

   public lIllIlII III() {
      return this.II;
   }

   public IIIIIllII IIl() {
      return this.ll;
   }

   static lIllII IlI(IlIIIIIIl var0) {
      return new lIllII(var0, null, false, null, null, null);
   }

   public String Ill() {
      return this.lI;
   }

   private static Exception lII(Exception var0) {
      return var0;
   }

   static lIllII lIl(IlIIIIIl var0, String var1) {
      return new lIllII(null, null, false, null, var0, var1);
   }
}
