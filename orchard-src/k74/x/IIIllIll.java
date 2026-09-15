package k74.x;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1269;
import net.minecraft.class_1792;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_2350.class_2351;

@Environment(EnvType.CLIENT)
public final class IIIllIll extends IlIIIIIIl {
   private static final double II = 20.25;
   private static final int Il = 1;
   private static final String[] lI;
   private static final String[] ll;
   private class_243 III;
   private int IIl;
   private static final double IlI = 2.9;
   private static final int[] IlIll;
   private int Ill;
   private class_2338 lII;
   private final IlIIIllll lIl;
   private final IllIII<IIlIllIlI> llI;
   private long lll;
   private final IllIII<lIIllIll> IIII;
   private static final int IIIl = 40;
   private static final double I = 1.5;
   private int IIlI;
   private boolean IIll;
   private IlIIlllII IlII;
   private static final String[] IllII;
   private float IlIl;
   private static final int IllI = 1;
   private float Illl;
   private static final double lIII = 3.0;
   private static final float lIIl = 0.5F;
   private static final int lIlI = 1;
   private IIllIllI lIll;
   private boolean llII;
   private static final Object[] IllIl;
   private static final int llIl = 80;
   private static final int lllI = 2;
   private static final double llll = 4.5;
   private final lIlllIl IIIII;
   private int IIIIl;
   private static final int IIIlI = 8;
   private IlIlIlllI IIIll;
   private static final double IIlII = 2.9;
   private IllIIl IIlIl;
   private final IIlIII IIllI;
   private final IIlIII IIlll;
   private static final int IlIII = 2;
   private static final int IlIIl = 9;
   private int IlIlI;

   private boolean I(class_310 param1, long param2, IlIIlllII param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIll.IIlIl Lk74/x/IllIIl;
      // 04: astore 5
      // 06: aload 5
      // 08: ifnull 1c
      // 0b: aload 5
      // 0d: invokevirtual k74/x/IllIIl.l ()J
      // 10: lload 2
      // 11: lcmp
      // 12: ifeq 22
      // 15: goto 1c
      // 18: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1b: athrow
      // 1c: bipush 0
      // 1d: ireturn
      // 1e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21: athrow
      // 22: aload 0
      // 23: aconst_null
      // 24: putfield k74/x/IIIllIll.IIlIl Lk74/x/IllIIl;
      // 27: aload 0
      // 28: aconst_null
      // 29: putfield k74/x/IIIllIll.IlII Lk74/x/IlIIlllII;
      // 2c: aload 4
      // 2e: invokevirtual k74/x/IlIIlllII.I ()Lk74/x/lIIIIII;
      // 31: getstatic k74/x/lIIIIII.l Lk74/x/lIIIIII;
      // 34: if_acmpne 43
      // 37: aload 0
      // 38: aload 1
      // 39: invokevirtual k74/x/IIIllIll.IllIl (Lnet/minecraft/class_310;)Z
      // 3c: goto 48
      // 3f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 42: athrow
      // 43: aload 0
      // 44: aload 1
      // 45: invokevirtual k74/x/IIIllIll.II (Lnet/minecraft/class_310;)Z
      // 48: istore 6
      // 4a: aload 1
      // 4b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4e: getfield net/minecraft/class_746.field_6012 I
      // 51: istore 7
      // 53: iload 6
      // 55: ifne 85
      // 58: aload 4
      // 5a: invokevirtual k74/x/IlIIlllII.I ()Lk74/x/lIIIIII;
      // 5d: getstatic k74/x/lIIIIII.l Lk74/x/lIIIIII;
      // 60: if_acmpne 76
      // 63: goto 6a
      // 66: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 69: athrow
      // 6a: aload 0
      // 6b: aload 1
      // 6c: invokevirtual k74/x/IIIllIll.lIIl (Lnet/minecraft/class_310;)V
      // 6f: goto 83
      // 72: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 75: athrow
      // 76: aload 0
      // 77: getstatic k74/x/IlIlIlllI.III Lk74/x/IlIlIlllI;
      // 7a: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 7d: aload 0
      // 7e: iload 7
      // 80: putfield k74/x/IIIllIll.IIIIl I
      // 83: bipush 0
      // 84: ireturn
      // 85: aload 0
      // 86: aload 4
      // 88: invokevirtual k74/x/IlIIlllII.I ()Lk74/x/lIIIIII;
      // 8b: getstatic k74/x/lIIIIII.l Lk74/x/lIIIIII;
      // 8e: if_acmpne 9b
      // 91: getstatic k74/x/IlIlIlllI.Il Lk74/x/IlIlIlllI;
      // 94: goto 9e
      // 97: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 9a: athrow
      // 9b: getstatic k74/x/IlIlIlllI.IIl Lk74/x/IlIlIlllI;
      // 9e: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // a1: aload 0
      // a2: iload 7
      // a4: putfield k74/x/IIIllIll.IIIIl I
      // a7: bipush 1
      // a8: ireturn
   }

   private boolean II(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokevirtual k74/x/IIIllIll.lIIIl (Lnet/minecraft/class_310;)Z
      // 05: ifeq 16
      // 08: aload 1
      // 09: invokestatic k74/x/IIll.IllIl (Lnet/minecraft/class_310;)I
      // 0c: ifle 1c
      // 0f: goto 16
      // 12: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15: athrow
      // 16: bipush 0
      // 17: ireturn
      // 18: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1b: athrow
      // 1c: aload 1
      // 1d: aload 0
      // 1e: aload 0
      // 1f: getfield k74/x/IIIllIll.Ill I
      // 22: aload 1
      // 23: invokedynamic getAsBoolean (Lnet/minecraft/class_310;)Ljava/util/function/BooleanSupplier; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIll.lIlII (Lnet/minecraft/class_310;)Z, ()Z ]
      // 28: invokestatic k74/x/IIll.lllIII (Lnet/minecraft/class_310;Ljava/lang/Object;ILjava/util/function/BooleanSupplier;)Z
      // 2b: ireturn
   }

   private boolean Il(class_746 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 4d
      // 04: aload 0
      // 05: getfield k74/x/IIIllIll.Ill I
      // 08: iflt 4d
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 0
      // 13: getfield k74/x/IIIllIll.Ill I
      // 16: ldc -1388593611
      // 18: ldc 199129635
      // 1a: ldc 164440892
      // 1c: ixor
      // 1d: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 20: if_icmpge 4d
      // 23: goto 2a
      // 26: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 29: athrow
      // 2a: aload 1
      // 2b: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 2e: aload 0
      // 2f: getfield k74/x/IIIllIll.Ill I
      // 32: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 35: getstatic net/minecraft/class_1802.field_8550 Lnet/minecraft/class_1792;
      // 38: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 3b: ifeq 4d
      // 3e: goto 45
      // 41: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 44: athrow
      // 45: bipush 1
      // 46: goto 4e
      // 49: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4c: athrow
      // 4d: bipush 0
      // 4e: ireturn
   }

   private boolean lI(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 04: getstatic k74/x/IIllIllI.II Lk74/x/IIllIllI;
      // 07: if_acmpeq 1b
      // 0a: aload 0
      // 0b: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 0e: getstatic k74/x/IIllIllI.l Lk74/x/IIllIllI;
      // 11: if_acmpne 29
      // 14: goto 1b
      // 17: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a: athrow
      // 1b: aload 1
      // 1c: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 1f: invokestatic k74/x/IIll.IlIlIll (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;
      // 22: goto 2e
      // 25: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: aload 0
      // 2a: aload 1
      // 2b: invokevirtual k74/x/IIIllIll.lII (Lnet/minecraft/class_310;)Lnet/minecraft/class_1269;
      // 2e: astore 2
      // 2f: aload 2
      // 30: ifnull 4b
      // 33: aload 2
      // 34: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 39: ifeq 4b
      // 3c: goto 43
      // 3f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 42: athrow
      // 43: bipush 1
      // 44: goto 4c
      // 47: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4a: athrow
      // 4b: bipush 0
      // 4c: ireturn
   }

   @Override
   public void IIlIl() {
      class_310 var1 = class_310.method_1551();
      this.IIIII(var1);
   }

   private void ll() {
      this.lll++;
      this.IIlIl = null;
      this.IlII = null;
      this.IIIll = IlIlIlllI.IlI;
      this.IIIIl = 0;
      this.Ill = -1;
      this.IIlI = -1;
      this.lIll = IIllIllI.II;
      this.lII = null;
      this.IIll = false;
      this.llII = false;
      this.IlIlI = 0;
      this.IIl = 0;
   }

   private int III(class_746 param1, class_1792 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: bipush 0
      // 01: istore 3
      // 02: iload 3
      // 03: ldc_w -1388593612
      // 06: ldc_w 1574966252
      // 09: ldc_w -1964493306
      // 0c: ixor
      // 0d: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 10: if_icmpge 3e
      // 13: aload 1
      // 14: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 17: iload 3
      // 18: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 1b: astore 4
      // 1d: aload 4
      // 1f: ifnull 38
      // 22: aload 4
      // 24: aload 2
      // 25: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 28: ifeq 38
      // 2b: goto 32
      // 2e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 31: athrow
      // 32: iload 3
      // 33: ireturn
      // 34: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 37: athrow
      // 38: iinc 3 1
      // 3b: goto 02
      // 3e: bipush -1
      // 3f: ireturn
   }

   private void IIl(class_310 var1, IlIlIlll var2, int var3) {
      class_746 var4 = var1.field_1724;
      this.IIlI = k74.x.IIll.IIlII(var4.method_31548());
      this.Ill = var2.l();
      this.lIll = var2.I();
      this.lII = var2.II();
      this.Illl = var4.method_36455();
      this.IlIl = var4.method_36454();
      this.IlIlI = var3 + this.IIllI(this.IIIII);
      this.IIIll = IlIlIlllI.lI;
      this.IIIIl = var3;
   }

   private IlIlIIII Ill() {
      return IlIlIIII.llI();
   }

   private class_1269 lII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 2e
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 2e
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 16: ifnull 2e
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 0
      // 21: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 24: ifnonnull 36
      // 27: goto 2e
      // 2a: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: getstatic net/minecraft/class_1269.field_5814 Lnet/minecraft/class_1269$class_9857;
      // 31: areturn
      // 32: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 35: athrow
      // 36: aload 0
      // 37: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 3a: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 3d: dconst_0
      // 3e: ldc2_w 0.5
      // 41: dconst_0
      // 42: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 45: astore 2
      // 46: new net/minecraft/class_3965
      // 49: dup
      // 4a: aload 2
      // 4b: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 4e: aload 0
      // 4f: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 52: bipush 0
      // 53: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
      // 56: astore 3
      // 57: aload 1
      // 58: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 5b: aload 3
      // 5c: invokestatic k74/x/IIll.IlIIIl (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;
      // 5f: areturn
   }

   private void lIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIll.IlII Lk74/x/IlIIlllII;
      // 04: astore 2
      // 05: aload 2
      // 06: ifnonnull 0e
      // 09: return
      // 0a: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d: athrow
      // 0e: aload 2
      // 0f: invokevirtual k74/x/IlIIlllII.I ()Lk74/x/lIIIIII;
      // 12: getstatic k74/x/lIIIIII.l Lk74/x/lIIIIII;
      // 15: if_acmpne 31
      // 18: aload 0
      // 19: aload 1
      // 1a: invokevirtual k74/x/IIIllIll.IIIl (Lnet/minecraft/class_310;)Z
      // 1d: ifne 31
      // 20: goto 27
      // 23: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: aload 0
      // 28: aload 1
      // 29: invokevirtual k74/x/IIIllIll.lIIl (Lnet/minecraft/class_310;)V
      // 2c: return
      // 2d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: aload 2
      // 32: invokevirtual k74/x/IlIIlllII.I ()Lk74/x/lIIIIII;
      // 35: getstatic k74/x/lIIIIII.II Lk74/x/lIIIIII;
      // 38: if_acmpne 66
      // 3b: aload 0
      // 3c: aload 1
      // 3d: invokevirtual k74/x/IIIllIll.lIIIl (Lnet/minecraft/class_310;)Z
      // 40: ifne 66
      // 43: goto 4a
      // 46: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 49: athrow
      // 4a: aload 0
      // 4b: aconst_null
      // 4c: putfield k74/x/IIIllIll.IlII Lk74/x/IlIIlllII;
      // 4f: aload 0
      // 50: getstatic k74/x/IlIlIlllI.III Lk74/x/IlIlIlllI;
      // 53: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 56: aload 0
      // 57: aload 1
      // 58: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 5b: getfield net/minecraft/class_746.field_6012 I
      // 5e: putfield k74/x/IIIllIll.IIIIl I
      // 61: return
      // 62: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 65: athrow
      // 66: aload 2
      // 67: invokevirtual k74/x/IlIIlllII.I ()Lk74/x/lIIIIII;
      // 6a: getstatic k74/x/lIIIIII.l Lk74/x/lIIIIII;
      // 6d: if_acmpne 94
      // 70: aload 2
      // 71: invokevirtual k74/x/IlIIlllII.l ()Z
      // 74: ifeq 8b
      // 77: goto 7e
      // 7a: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 7d: athrow
      // 7e: aload 0
      // 7f: aload 1
      // 80: aload 2
      // 81: invokevirtual k74/x/IIIllIll.IllII (Lnet/minecraft/class_310;Lk74/x/IlIIlllII;)Z
      // 84: goto 9a
      // 87: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 8a: athrow
      // 8b: aload 0
      // 8c: aload 1
      // 8d: aload 2
      // 8e: invokevirtual k74/x/IIIllIll.lIII (Lnet/minecraft/class_310;Lk74/x/IlIIlllII;)Z
      // 91: goto 9a
      // 94: aload 0
      // 95: aload 1
      // 96: aload 2
      // 97: invokevirtual k74/x/IIIllIll.llI (Lnet/minecraft/class_310;Lk74/x/IlIIlllII;)Z
      // 9a: istore 3
      // 9b: iload 3
      // 9c: ifeq ab
      // 9f: aload 0
      // a0: aconst_null
      // a1: putfield k74/x/IIIllIll.IlII Lk74/x/IlIIlllII;
      // a4: goto ab
      // a7: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // aa: athrow
      // ab: return
   }

   @Override
   public void IlIII() {
      this.ll();
      this.lIl.IIIIIII();
   }

   private static String l(int var0, int var1) {
      int var9 = -1027883462;
      int var2 = (var0 ^ lIllI(-1388593621, var9 ^ 476231894)) & lIllI(-1388593622, var9 ^ 568953231);
      if (lI[var2] == null) {
         char[] var3 = ll[var2].toCharArray();

         int var4 = switch (var3[0] & lIllI(-1388593623, var9 ^ 1723155251)) {
            case 0 -> lIllI(-1388593624, var9 ^ -1726730574);
            case 1 -> lIllI(-1388593617, var9 ^ 83048592);
            case 2 -> lIllI(-1388593618, var9 ^ -360626351);
            case 3 -> lIllI(-1388593619, var9 ^ 2137604088);
            case 4 -> lIllI(-1388593620, var9 ^ -1852933152);
            case 5 -> lIllI(-1388593629, var9 ^ 1303471024);
            case 6 -> lIllI(-1388593630, var9 ^ -1185515564);
            case 7 -> lIllI(-1388593631, var9 ^ 929791655);
            case 8 -> lIllI(-1388593632, var9 ^ 574762930);
            case 9 -> lIllI(-1388593625, var9 ^ -1304938738);
            case 10 -> lIllI(-1388593626, var9 ^ 304065351);
            case 11 -> lIllI(-1388593627, var9 ^ -593767305);
            case 12 -> lIllI(-1388593628, var9 ^ -2051639988);
            case 13 -> lIllI(-1388593637, var9 ^ 1963835803);
            case 14 -> lIllI(-1388593638, var9 ^ -1010527808);
            case 15 -> lIllI(-1388593639, var9 ^ -1170953392);
            case 16 -> lIllI(-1388593640, var9 ^ -1750518840);
            case 17 -> lIllI(-1388593633, var9 ^ 936269088);
            case 18 -> lIllI(-1388593634, var9 ^ -375088698);
            case 19 -> lIllI(-1388593635, var9 ^ 1231726970);
            case 20 -> lIllI(-1388593636, var9 ^ 1439530652);
            case 21 -> lIllI(-1388593645, var9 ^ -1052801198);
            case 22 -> lIllI(-1388593646, var9 ^ 2007723035);
            case 23 -> lIllI(-1388593647, var9 ^ 656955377);
            case 24 -> lIllI(-1388593648, var9 ^ -1580623348);
            case 25 -> lIllI(-1388593641, var9 ^ -1920733134);
            case 26 -> lIllI(-1388593642, var9 ^ 1312226517);
            case 27 -> lIllI(-1388593643, var9 ^ -2131009124);
            case 28 -> lIllI(-1388593644, var9 ^ 1133482658);
            case 29 -> lIllI(-1388593653, var9 ^ 1805455469);
            case 30 -> lIllI(-1388593654, var9 ^ 705534962);
            case 31 -> lIllI(-1388593655, var9 ^ 1926281221);
            case 32 -> lIllI(-1388593656, var9 ^ -1871808301);
            case 33 -> lIllI(-1388593649, var9 ^ 502399620);
            case 34 -> lIllI(-1388593650, var9 ^ 1158360647);
            case 35 -> lIllI(-1388593651, var9 ^ 1568478200);
            case 36 -> lIllI(-1388593652, var9 ^ -1120804365);
            case 37 -> lIllI(-1388593661, var9 ^ 384646914);
            case 38 -> lIllI(-1388593662, var9 ^ 813029844);
            case 39 -> lIllI(-1388593663, var9 ^ -1268008274);
            case 40 -> lIllI(-1388593664, var9 ^ -490329158);
            case 41 -> lIllI(-1388593657, var9 ^ -301218770);
            case 42 -> lIllI(-1388593658, var9 ^ 263030831);
            case 43 -> lIllI(-1388593659, var9 ^ 1069273076);
            case 44 -> lIllI(-1388593660, var9 ^ -1326167462);
            case 45 -> lIllI(-1388593541, var9 ^ 472120051);
            case 46 -> lIllI(-1388593542, var9 ^ -1084360546);
            case 47 -> lIllI(-1388593543, var9 ^ -289561308);
            case 48 -> lIllI(-1388593544, var9 ^ -683979296);
            case 49 -> lIllI(-1388593537, var9 ^ -838242867);
            case 50 -> lIllI(-1388593538, var9 ^ -2107042766);
            case 51 -> lIllI(-1388593539, var9 ^ 1717792683);
            case 52 -> 2;
            case 53 -> lIllI(-1388593540, var9 ^ -1033869641);
            case 54 -> lIllI(-1388593549, var9 ^ 462643431);
            case 55 -> lIllI(-1388593550, var9 ^ -421565510);
            case 56 -> lIllI(-1388593551, var9 ^ 730248198);
            case 57 -> lIllI(-1388593552, var9 ^ 1864970379);
            case 58 -> lIllI(-1388593545, var9 ^ -1092380381);
            case 59 -> lIllI(-1388593546, var9 ^ 1417884794);
            case 60 -> lIllI(-1388593547, var9 ^ 337169650);
            case 61 -> lIllI(-1388593548, var9 ^ -155042684);
            case 62 -> lIllI(-1388593557, var9 ^ -1737436633);
            case 63 -> lIllI(-1388593558, var9 ^ 1096456259);
            case 64 -> 1;
            case 65 -> lIllI(-1388593559, var9 ^ -1839326138);
            case 66 -> lIllI(-1388593560, var9 ^ -1916826586);
            case 67 -> lIllI(-1388593553, var9 ^ -1904921278);
            case 68 -> lIllI(-1388593554, var9 ^ 1737860365);
            case 69 -> lIllI(-1388593555, var9 ^ -1381928981);
            case 70 -> lIllI(-1388593556, var9 ^ 1958018661);
            case 71 -> lIllI(-1388593565, var9 ^ 1524950040);
            case 72 -> lIllI(-1388593566, var9 ^ 1439556667);
            case 73 -> lIllI(-1388593567, var9 ^ 1111320836);
            case 74 -> lIllI(-1388593568, var9 ^ 1116178539);
            case 75 -> lIllI(-1388593561, var9 ^ -452785481);
            case 76 -> lIllI(-1388593562, var9 ^ -1266189884);
            case 77 -> lIllI(-1388593563, var9 ^ 1597754452);
            case 78 -> lIllI(-1388593564, var9 ^ 759072559);
            case 79 -> lIllI(-1388593573, var9 ^ -366599904);
            case 80 -> lIllI(-1388593574, var9 ^ 842065083);
            case 81 -> lIllI(-1388593575, var9 ^ 2055844854);
            case 82 -> lIllI(-1388593576, var9 ^ 235478165);
            case 83 -> lIllI(-1388593569, var9 ^ -1422021728);
            case 84 -> lIllI(-1388593570, var9 ^ 232809036);
            case 85 -> lIllI(-1388593571, var9 ^ -1830741746);
            case 86 -> lIllI(-1388593572, var9 ^ 48423405);
            case 87 -> lIllI(-1388593581, var9 ^ 1323369893);
            case 88 -> lIllI(-1388593582, var9 ^ -1835008307);
            case 89 -> lIllI(-1388593583, var9 ^ -1498123245);
            case 90 -> lIllI(-1388593584, var9 ^ -764216937);
            case 91 -> lIllI(-1388593577, var9 ^ -253273572);
            case 92 -> lIllI(-1388593578, var9 ^ -1505589641);
            case 93 -> lIllI(-1388593579, var9 ^ 1527618043);
            case 94 -> lIllI(-1388593580, var9 ^ -1762198742);
            case 95 -> lIllI(-1388593589, var9 ^ -2137873138);
            case 96 -> lIllI(-1388593590, var9 ^ 2112148825);
            case 97 -> lIllI(-1388593591, var9 ^ -1666464785);
            case 98 -> lIllI(-1388593592, var9 ^ -587397277);
            case 99 -> lIllI(-1388593585, var9 ^ -1290031503);
            case 100 -> lIllI(-1388593586, var9 ^ -2037079438);
            case 101 -> lIllI(-1388593587, var9 ^ -96597368);
            case 102 -> lIllI(-1388593588, var9 ^ 1262121639);
            case 103 -> lIllI(-1388593597, var9 ^ -798243467);
            case 104 -> lIllI(-1388593598, var9 ^ -351251205);
            case 105 -> lIllI(-1388593599, var9 ^ 1371300845);
            case 106 -> lIllI(-1388593600, var9 ^ 929923883);
            case 107 -> lIllI(-1388593593, var9 ^ 1731595633);
            case 108 -> lIllI(-1388593594, var9 ^ 185218110);
            case 109 -> lIllI(-1388593595, var9 ^ -2043458232);
            case 110 -> lIllI(-1388593596, var9 ^ 2066070863);
            case 111 -> lIllI(-1388593477, var9 ^ 1042465099);
            case 112 -> lIllI(-1388593478, var9 ^ -1050353459);
            case 113 -> lIllI(-1388593479, var9 ^ -2006832858);
            case 114 -> lIllI(-1388593480, var9 ^ -1728520083);
            case 115 -> lIllI(-1388593473, var9 ^ -1337629689);
            case 116 -> lIllI(-1388593474, var9 ^ 1690818379);
            case 117 -> lIllI(-1388593475, var9 ^ 1166839782);
            case 118 -> lIllI(-1388593476, var9 ^ -756174282);
            case 119 -> lIllI(-1388593485, var9 ^ -169022052);
            case 120 -> lIllI(-1388593486, var9 ^ 126789552);
            case 121 -> lIllI(-1388593487, var9 ^ 551457596);
            case 122 -> 5;
            case 123 -> lIllI(-1388593488, var9 ^ 468998062);
            case 124 -> lIllI(-1388593481, var9 ^ -1256275437);
            case 125 -> lIllI(-1388593482, var9 ^ -1015699208);
            case 126 -> lIllI(-1388593483, var9 ^ -1020235902);
            case 127 -> lIllI(-1388593484, var9 ^ -910063291);
            case 128 -> lIllI(-1388593493, var9 ^ -921704503);
            case 129 -> lIllI(-1388593494, var9 ^ 885217304);
            case 130 -> lIllI(-1388593495, var9 ^ 622702082);
            case 131 -> lIllI(-1388593496, var9 ^ -473519988);
            case 132 -> lIllI(-1388593489, var9 ^ -1272311754);
            case 133 -> lIllI(-1388593490, var9 ^ -864088264);
            case 134 -> lIllI(-1388593491, var9 ^ -1035208287);
            case 135 -> lIllI(-1388593492, var9 ^ -1856401459);
            case 136 -> lIllI(-1388593501, var9 ^ 1400131885);
            case 137 -> lIllI(-1388593502, var9 ^ -1649187847);
            case 138 -> lIllI(-1388593503, var9 ^ -762102802);
            case 139 -> lIllI(-1388593504, var9 ^ 1930847578);
            case 140 -> lIllI(-1388593497, var9 ^ 449643726);
            case 141 -> lIllI(-1388593498, var9 ^ 113930062);
            case 142 -> lIllI(-1388593499, var9 ^ -1611652868);
            case 143 -> lIllI(-1388593500, var9 ^ 1461168300);
            case 144 -> lIllI(-1388593509, var9 ^ 757482464);
            case 145 -> lIllI(-1388593510, var9 ^ 1342650447);
            case 146 -> 0;
            case 147 -> lIllI(-1388593511, var9 ^ 46329706);
            case 148 -> lIllI(-1388593512, var9 ^ 1365583509);
            case 149 -> lIllI(-1388593505, var9 ^ 1585142445);
            case 150 -> lIllI(-1388593506, var9 ^ 2071625494);
            case 151 -> lIllI(-1388593507, var9 ^ -1484239710);
            case 152 -> lIllI(-1388593508, var9 ^ 241036029);
            case 153 -> lIllI(-1388593517, var9 ^ 1307523247);
            case 154 -> lIllI(-1388593518, var9 ^ -858151833);
            case 155 -> lIllI(-1388593519, var9 ^ 655842254);
            case 156 -> 3;
            case 157 -> lIllI(-1388593520, var9 ^ -220103254);
            case 158 -> lIllI(-1388593513, var9 ^ -1878565540);
            case 159 -> lIllI(-1388593514, var9 ^ 338910857);
            case 160 -> lIllI(-1388593515, var9 ^ 1512726013);
            case 161 -> lIllI(-1388593516, var9 ^ -72935307);
            case 162 -> lIllI(-1388593525, var9 ^ 775031834);
            case 163 -> lIllI(-1388593526, var9 ^ 716227006);
            case 164 -> lIllI(-1388593527, var9 ^ -1207760157);
            case 165 -> lIllI(-1388593528, var9 ^ -1318466428);
            case 166 -> lIllI(-1388593521, var9 ^ 1554515528);
            case 167 -> lIllI(-1388593522, var9 ^ -696408738);
            case 168 -> lIllI(-1388593523, var9 ^ 936123435);
            case 169 -> lIllI(-1388593524, var9 ^ 1048923563);
            case 170 -> lIllI(-1388593533, var9 ^ 1408179115);
            case 171 -> lIllI(-1388593534, var9 ^ -551964279);
            case 172 -> lIllI(-1388593535, var9 ^ 1600563051);
            case 173 -> lIllI(-1388593536, var9 ^ 1248708346);
            case 174 -> lIllI(-1388593529, var9 ^ 1669460541);
            case 175 -> lIllI(-1388593530, var9 ^ -1864070656);
            case 176 -> lIllI(-1388593531, var9 ^ 1855020890);
            case 177 -> lIllI(-1388593532, var9 ^ -1865308177);
            case 178 -> lIllI(-1388593413, var9 ^ 351365600);
            case 179 -> lIllI(-1388593414, var9 ^ -1791142025);
            case 180 -> lIllI(-1388593415, var9 ^ 1114730746);
            case 181 -> lIllI(-1388593416, var9 ^ -713237741);
            case 182 -> lIllI(-1388593409, var9 ^ 185933184);
            case 183 -> lIllI(-1388593410, var9 ^ -2130661097);
            case 184 -> lIllI(-1388593411, var9 ^ -359689994);
            case 185 -> lIllI(-1388593412, var9 ^ -1460338586);
            case 186 -> lIllI(-1388593421, var9 ^ 1228105944);
            case 187 -> lIllI(-1388593422, var9 ^ 465248301);
            case 188 -> lIllI(-1388593423, var9 ^ -847578891);
            case 189 -> lIllI(-1388593424, var9 ^ -665774921);
            case 190 -> lIllI(-1388593417, var9 ^ 2016406210);
            case 191 -> lIllI(-1388593418, var9 ^ -2074027422);
            case 192 -> lIllI(-1388593419, var9 ^ 1338884054);
            case 193 -> lIllI(-1388593420, var9 ^ 515372246);
            case 194 -> lIllI(-1388593429, var9 ^ -156993047);
            case 195 -> lIllI(-1388593430, var9 ^ -970890719);
            case 196 -> lIllI(-1388593431, var9 ^ -1094581802);
            case 197 -> lIllI(-1388593432, var9 ^ 648662843);
            case 198 -> lIllI(-1388593425, var9 ^ -1030685688);
            case 199 -> lIllI(-1388593426, var9 ^ 403990756);
            case 200 -> lIllI(-1388593427, var9 ^ -1387087445);
            case 201 -> lIllI(-1388593428, var9 ^ -1928372591);
            case 202 -> lIllI(-1388593437, var9 ^ -1071207609);
            case 203 -> lIllI(-1388593438, var9 ^ 2002578763);
            case 204 -> lIllI(-1388593439, var9 ^ -1261681274);
            case 205 -> lIllI(-1388593440, var9 ^ -1554793980);
            case 206 -> lIllI(-1388593433, var9 ^ -1840712475);
            case 207 -> lIllI(-1388593434, var9 ^ 809955006);
            case 208 -> lIllI(-1388593435, var9 ^ -196621662);
            case 209 -> lIllI(-1388593436, var9 ^ -2044772646);
            case 210 -> lIllI(-1388593445, var9 ^ 1623802623);
            case 211 -> lIllI(-1388593446, var9 ^ -952032461);
            case 212 -> lIllI(-1388593447, var9 ^ -1790930530);
            case 213 -> lIllI(-1388593448, var9 ^ -1633505361);
            case 214 -> lIllI(-1388593441, var9 ^ -675859412);
            case 215 -> lIllI(-1388593442, var9 ^ -2071422105);
            case 216 -> lIllI(-1388593443, var9 ^ -2049211393);
            case 217 -> lIllI(-1388593444, var9 ^ 2025867197);
            case 218 -> lIllI(-1388593453, var9 ^ 633115250);
            case 219 -> lIllI(-1388593454, var9 ^ 126032158);
            case 220 -> lIllI(-1388593455, var9 ^ 444194561);
            case 221 -> lIllI(-1388593456, var9 ^ -874884217);
            case 222 -> lIllI(-1388593449, var9 ^ 1648509277);
            case 223 -> lIllI(-1388593450, var9 ^ 1714822946);
            case 224 -> lIllI(-1388593451, var9 ^ 1617007331);
            case 225 -> lIllI(-1388593452, var9 ^ -630571142);
            case 226 -> lIllI(-1388593461, var9 ^ 925266507);
            case 227 -> lIllI(-1388593462, var9 ^ -381103826);
            case 228 -> lIllI(-1388593463, var9 ^ 51363907);
            case 229 -> lIllI(-1388593464, var9 ^ -2038041092);
            case 230 -> lIllI(-1388593457, var9 ^ 1688082246);
            case 231 -> lIllI(-1388593458, var9 ^ -1009071238);
            case 232 -> lIllI(-1388593459, var9 ^ 921554227);
            case 233 -> lIllI(-1388593460, var9 ^ 707773994);
            case 234 -> lIllI(-1388593469, var9 ^ -2117751473);
            case 235 -> lIllI(-1388593470, var9 ^ 175395049);
            case 236 -> lIllI(-1388593471, var9 ^ 552913656);
            case 237 -> lIllI(-1388593472, var9 ^ 393007713);
            case 238 -> lIllI(-1388593465, var9 ^ -135315610);
            case 239 -> lIllI(-1388593466, var9 ^ -1248464329);
            case 240 -> 4;
            case 241 -> lIllI(-1388593467, var9 ^ 215870862);
            case 242 -> lIllI(-1388593468, var9 ^ 2123107760);
            case 243 -> lIllI(-1388593349, var9 ^ -1267557576);
            case 244 -> lIllI(-1388593350, var9 ^ -447204619);
            case 245 -> lIllI(-1388593351, var9 ^ 2058178365);
            case 246 -> lIllI(-1388593352, var9 ^ -1966806028);
            case 247 -> lIllI(-1388593345, var9 ^ 1303636141);
            case 248 -> lIllI(-1388593346, var9 ^ 1457857360);
            case 249 -> lIllI(-1388593347, var9 ^ 1708141838);
            case 250 -> lIllI(-1388593348, var9 ^ -114017115);
            case 251 -> lIllI(-1388593357, var9 ^ 410826979);
            case 252 -> lIllI(-1388593358, var9 ^ -1543024262);
            case 253 -> lIllI(-1388593359, var9 ^ 1269271556);
            case 254 -> lIllI(-1388593360, var9 ^ -182276334);
            default -> lIllI(-1388593353, var9 ^ 2050699990);
         };
         int var5 = (var1 & lIllI(-1388593354, var9 ^ 1394614993)) - var4;
         if (var5 < 0) {
            var5 += 256;
         }

         int var6 = ((var1 & lIllI(-1388593355, var9 ^ 1425203127)) >>> lIllI(-1388593356, var9 ^ 1990985038)) - var4;
         if (var6 < 0) {
            var6 += 256;
         }

         for (int var7 = 0; var7 < var3.length; var7++) {
            int var8 = var7 % 2;
            char var10002 = var3[var7];
            if (var8 == 0) {
               var3[var7] = (char)(var10002 ^ var5);
               var5 = ((var5 >>> 3 | var5 << 5) ^ var3[var7]) & lIllI(-1388593365, var9 ^ 2009289210);
            } else {
               var3[var7] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var3[var7]) & lIllI(-1388593366, var9 ^ -55442659);
            }
         }

         lI[var2] = new String(var3).intern();
      }

      return lI[var2];
   }

   private static int lIllI(int var0, int var1) {
      int var2 = IlIll[var0 ^ -1388593605] ^ var1 ^ var0;
      var2 -= 16897;
      var2 += 42845;
      var2 += 55488;
      var2 += 54528;
      var2 += 61488;
      return var2 - 5507;
   }

   private boolean llI(class_310 param1, IlIIlllII param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 21
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual k74/x/IIIllIll.lIIIl (Lnet/minecraft/class_310;)Z
      // 09: ifeq 21
      // 0c: goto 13
      // 0f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 12: athrow
      // 13: aload 1
      // 14: invokestatic k74/x/IIll.IllIl (Lnet/minecraft/class_310;)I
      // 17: ifle 27
      // 1a: goto 21
      // 1d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 20: athrow
      // 21: bipush 0
      // 22: ireturn
      // 23: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 26: athrow
      // 27: aload 0
      // 28: dup
      // 29: getfield k74/x/IIIllIll.lll J
      // 2c: lconst_1
      // 2d: ladd
      // 2e: dup2_x1
      // 2f: putfield k74/x/IIIllIll.lll J
      // 32: lstore 3
      // 33: aload 1
      // 34: ldc_w -1388593367
      // 37: ldc_w -826912117
      // 3a: ldc_w 775172449
      // 3d: ixor
      // 3e: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 41: aload 1
      // 42: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 45: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 48: ldc_w 90.0
      // 4b: aload 0
      // 4c: aload 1
      // 4d: lload 3
      // 4e: aload 2
      // 4f: invokedynamic a (Lk74/x/IIIllIll;Lnet/minecraft/class_310;JLk74/x/IlIIlllII;)Lk74/x/IIIll; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIll.lIIll (Lnet/minecraft/class_310;JLk74/x/IlIIlllII;)Z, ()Z ]
      // 54: invokestatic k74/x/IlllIlII.IIIll (Lnet/minecraft/class_310;IFFLk74/x/IIIll;)Z
      // 57: istore 5
      // 59: iload 5
      // 5b: ifne 6e
      // 5e: aload 0
      // 5f: dup
      // 60: getfield k74/x/IIIllIll.lll J
      // 63: lconst_1
      // 64: ladd
      // 65: putfield k74/x/IIIllIll.lll J
      // 68: bipush 0
      // 69: ireturn
      // 6a: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 6d: athrow
      // 6e: aload 0
      // 6f: new k74/x/IllIIl
      // 72: dup
      // 73: lload 3
      // 74: aload 2
      // 75: aload 1
      // 76: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 79: getfield net/minecraft/class_746.field_6012 I
      // 7c: bipush 1
      // 7d: iadd
      // 7e: invokespecial k74/x/IllIIl.<init> (JLk74/x/IlIIlllII;I)V
      // 81: putfield k74/x/IIIllIll.IIlIl Lk74/x/IllIIl;
      // 84: bipush 1
      // 85: ireturn
   }

   private boolean lll(lIIllIll param1, lIIllIll param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: getstatic k74/x/lIIllIll.l Lk74/x/lIIllIll;
      // 04: if_acmpeq 13
      // 07: aload 1
      // 08: aload 2
      // 09: if_acmpne 1b
      // 0c: goto 13
      // 0f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 12: athrow
      // 13: bipush 1
      // 14: goto 1c
      // 17: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a: athrow
      // 1b: bipush 0
      // 1c: ireturn
   }

   private IlIlIlll IIII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 004: astore 2
      // 005: aload 2
      // 006: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 009: ifne 036
      // 00c: aload 2
      // 00d: invokevirtual net/minecraft/class_746.method_6101 ()Z
      // 010: ifne 036
      // 013: goto 01a
      // 016: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 019: athrow
      // 01a: aload 2
      // 01b: invokevirtual net/minecraft/class_746.method_5799 ()Z
      // 01e: ifne 036
      // 021: goto 028
      // 024: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 027: athrow
      // 028: aload 2
      // 029: invokevirtual net/minecraft/class_746.method_5771 ()Z
      // 02c: ifeq 03c
      // 02f: goto 036
      // 032: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 035: athrow
      // 036: aconst_null
      // 037: areturn
      // 038: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03b: athrow
      // 03c: aload 2
      // 03d: invokevirtual net/minecraft/class_746.method_18798 ()Lnet/minecraft/class_243;
      // 040: getfield net/minecraft/class_243.field_1351 D
      // 043: ldc2_w -0.08
      // 046: dcmpl
      // 047: iflt 050
      // 04a: aconst_null
      // 04b: areturn
      // 04c: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 04f: athrow
      // 050: aload 2
      // 051: getfield net/minecraft/class_746.field_6017 D
      // 054: aload 0
      // 055: getfield k74/x/IIIllIll.IIlll Lk74/x/IIlIII;
      // 058: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 05b: checkcast java/lang/Double
      // 05e: invokevirtual java/lang/Double.floatValue ()F
      // 061: f2d
      // 062: dcmpg
      // 063: ifge 06c
      // 066: aconst_null
      // 067: areturn
      // 068: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 06b: athrow
      // 06c: aload 0
      // 06d: aload 1
      // 06e: invokevirtual k74/x/IIIllIll.Illl (Lnet/minecraft/class_310;)Lk74/x/IIlIlIl;
      // 071: astore 3
      // 072: aload 3
      // 073: ifnull 087
      // 076: aload 3
      // 077: invokevirtual k74/x/IIlIlIl.I ()D
      // 07a: invokestatic java/lang/Double.isFinite (D)Z
      // 07d: ifne 08d
      // 080: goto 087
      // 083: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 086: athrow
      // 087: aconst_null
      // 088: areturn
      // 089: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 08c: athrow
      // 08d: aload 0
      // 08e: getfield k74/x/IIIllIll.IIII Lk74/x/IllIII;
      // 091: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 094: checkcast k74/x/lIIllIll
      // 097: astore 4
      // 099: aload 0
      // 09a: aload 4
      // 09c: getstatic k74/x/lIIllIll.III Lk74/x/lIIllIll;
      // 09f: invokevirtual k74/x/IIIllIll.lll (Lk74/x/lIIllIll;Lk74/x/lIIllIll;)Z
      // 0a2: ifeq 0b4
      // 0a5: aload 0
      // 0a6: aload 2
      // 0a7: getstatic net/minecraft/class_1802.field_8705 Lnet/minecraft/class_1792;
      // 0aa: invokevirtual k74/x/IIIllIll.III (Lnet/minecraft/class_746;Lnet/minecraft/class_1792;)I
      // 0ad: goto 0b5
      // 0b0: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b3: athrow
      // 0b4: bipush -1
      // 0b5: istore 5
      // 0b7: iload 5
      // 0b9: iflt 0e0
      // 0bc: aload 3
      // 0bd: invokevirtual k74/x/IIlIlIl.I ()D
      // 0c0: ldc2_w 1.5
      // 0c3: dcmpg
      // 0c4: ifgt 0e0
      // 0c7: goto 0ce
      // 0ca: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0cd: athrow
      // 0ce: new k74/x/IlIlIlll
      // 0d1: dup
      // 0d2: getstatic k74/x/IIllIllI.II Lk74/x/IIllIllI;
      // 0d5: iload 5
      // 0d7: aconst_null
      // 0d8: invokespecial k74/x/IlIlIlll.<init> (Lk74/x/IIllIllI;ILnet/minecraft/class_2338;)V
      // 0db: areturn
      // 0dc: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0df: athrow
      // 0e0: aload 0
      // 0e1: aload 4
      // 0e3: getstatic k74/x/lIIllIll.II Lk74/x/lIIllIll;
      // 0e6: invokevirtual k74/x/IIIllIll.lll (Lk74/x/lIIllIll;Lk74/x/lIIllIll;)Z
      // 0e9: ifeq 0fb
      // 0ec: aload 0
      // 0ed: aload 2
      // 0ee: getstatic net/minecraft/class_1802.field_49098 Lnet/minecraft/class_1792;
      // 0f1: invokevirtual k74/x/IIIllIll.III (Lnet/minecraft/class_746;Lnet/minecraft/class_1792;)I
      // 0f4: goto 0fc
      // 0f7: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0fa: athrow
      // 0fb: bipush -1
      // 0fc: istore 6
      // 0fe: iload 6
      // 100: iflt 127
      // 103: aload 3
      // 104: invokevirtual k74/x/IIlIlIl.I ()D
      // 107: ldc2_w 3.0
      // 10a: dcmpg
      // 10b: ifgt 127
      // 10e: goto 115
      // 111: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 114: athrow
      // 115: new k74/x/IlIlIlll
      // 118: dup
      // 119: getstatic k74/x/IIllIllI.l Lk74/x/IIllIllI;
      // 11c: iload 6
      // 11e: aconst_null
      // 11f: invokespecial k74/x/IlIlIlll.<init> (Lk74/x/IIllIllI;ILnet/minecraft/class_2338;)V
      // 122: areturn
      // 123: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 126: athrow
      // 127: aload 0
      // 128: aload 4
      // 12a: getstatic k74/x/lIIllIll.ll Lk74/x/lIIllIll;
      // 12d: invokevirtual k74/x/IIIllIll.lll (Lk74/x/lIIllIll;Lk74/x/lIIllIll;)Z
      // 130: ifeq 142
      // 133: aload 0
      // 134: aload 2
      // 135: getstatic net/minecraft/class_1802.field_8786 Lnet/minecraft/class_1792;
      // 138: invokevirtual k74/x/IIIllIll.III (Lnet/minecraft/class_746;Lnet/minecraft/class_1792;)I
      // 13b: goto 143
      // 13e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 141: athrow
      // 142: bipush -1
      // 143: istore 7
      // 145: iload 7
      // 147: iflt 19a
      // 14a: aload 3
      // 14b: invokevirtual k74/x/IIlIlIl.I ()D
      // 14e: ldc2_w 2.9
      // 151: dcmpg
      // 152: ifgt 19a
      // 155: goto 15c
      // 158: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15b: athrow
      // 15c: aload 0
      // 15d: aload 1
      // 15e: aload 3
      // 15f: invokevirtual k74/x/IIlIlIl.l ()Lnet/minecraft/class_2338;
      // 162: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 165: invokevirtual k74/x/IIIllIll.lllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 168: ifeq 19a
      // 16b: goto 172
      // 16e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 171: athrow
      // 172: aload 0
      // 173: aload 1
      // 174: aload 3
      // 175: invokevirtual k74/x/IIlIlIl.l ()Lnet/minecraft/class_2338;
      // 178: invokevirtual k74/x/IIIllIll.IllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 17b: ifeq 19a
      // 17e: goto 185
      // 181: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 184: athrow
      // 185: new k74/x/IlIlIlll
      // 188: dup
      // 189: getstatic k74/x/IIllIllI.I Lk74/x/IIllIllI;
      // 18c: iload 7
      // 18e: aload 3
      // 18f: invokevirtual k74/x/IIlIlIl.l ()Lnet/minecraft/class_2338;
      // 192: invokespecial k74/x/IlIlIlll.<init> (Lk74/x/IIllIllI;ILnet/minecraft/class_2338;)V
      // 195: areturn
      // 196: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 199: athrow
      // 19a: aload 0
      // 19b: aload 4
      // 19d: getstatic k74/x/lIIllIll.Il Lk74/x/lIIllIll;
      // 1a0: invokevirtual k74/x/IIIllIll.lll (Lk74/x/lIIllIll;Lk74/x/lIIllIll;)Z
      // 1a3: ifeq 1b5
      // 1a6: aload 0
      // 1a7: aload 2
      // 1a8: getstatic net/minecraft/class_1802.field_16482 Lnet/minecraft/class_1792;
      // 1ab: invokevirtual k74/x/IIIllIll.III (Lnet/minecraft/class_746;Lnet/minecraft/class_1792;)I
      // 1ae: goto 1b6
      // 1b1: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1b4: athrow
      // 1b5: bipush -1
      // 1b6: istore 8
      // 1b8: iload 8
      // 1ba: iflt 20d
      // 1bd: aload 3
      // 1be: invokevirtual k74/x/IIlIlIl.I ()D
      // 1c1: ldc2_w 2.9
      // 1c4: dcmpg
      // 1c5: ifgt 20d
      // 1c8: goto 1cf
      // 1cb: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1ce: athrow
      // 1cf: aload 0
      // 1d0: aload 1
      // 1d1: aload 3
      // 1d2: invokevirtual k74/x/IIlIlIl.l ()Lnet/minecraft/class_2338;
      // 1d5: invokevirtual net/minecraft/class_2338.method_10084 ()Lnet/minecraft/class_2338;
      // 1d8: invokevirtual k74/x/IIIllIll.lllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 1db: ifeq 20d
      // 1de: goto 1e5
      // 1e1: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e4: athrow
      // 1e5: aload 0
      // 1e6: aload 1
      // 1e7: aload 3
      // 1e8: invokevirtual k74/x/IIlIlIl.l ()Lnet/minecraft/class_2338;
      // 1eb: invokevirtual k74/x/IIIllIll.IllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 1ee: ifeq 20d
      // 1f1: goto 1f8
      // 1f4: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f7: athrow
      // 1f8: new k74/x/IlIlIlll
      // 1fb: dup
      // 1fc: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 1ff: iload 8
      // 201: aload 3
      // 202: invokevirtual k74/x/IIlIlIl.l ()Lnet/minecraft/class_2338;
      // 205: invokespecial k74/x/IlIlIlll.<init> (Lk74/x/IIllIllI;ILnet/minecraft/class_2338;)V
      // 208: areturn
      // 209: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 20c: athrow
      // 20d: aconst_null
      // 20e: areturn
   }

   private boolean IIIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ifnull 049
      // 004: aload 1
      // 005: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 008: ifnull 049
      // 00b: goto 012
      // 00e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 011: athrow
      // 012: aload 0
      // 013: getfield k74/x/IIIllIll.Ill I
      // 016: iflt 049
      // 019: goto 020
      // 01c: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 01f: athrow
      // 020: aload 0
      // 021: getfield k74/x/IIIllIll.Ill I
      // 024: ldc_w -1388593368
      // 027: ldc_w 1716274118
      // 02a: ldc_w -1813845623
      // 02d: ixor
      // 02e: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 031: if_icmpge 049
      // 034: goto 03b
      // 037: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 03a: athrow
      // 03b: aload 1
      // 03c: invokestatic k74/x/IIll.IllIl (Lnet/minecraft/class_310;)I
      // 03f: ifle 04f
      // 042: goto 049
      // 045: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 048: athrow
      // 049: bipush 0
      // 04a: ireturn
      // 04b: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 04e: athrow
      // 04f: aload 1
      // 050: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 053: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 056: aload 0
      // 057: getfield k74/x/IIIllIll.Ill I
      // 05a: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 05d: astore 2
      // 05e: aload 2
      // 05f: ifnonnull 068
      // 062: bipush 0
      // 063: ireturn
      // 064: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 067: athrow
      // 068: aload 0
      // 069: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 06c: invokevirtual k74/x/IIllIllI.ordinal ()I
      // 06f: tableswitch 29 0 3 43 53 63 118
      // 08c: new java/lang/MatchException
      // 08f: dup
      // 090: aconst_null
      // 091: aconst_null
      // 092: invokespecial java/lang/MatchException.<init> (Ljava/lang/String;Ljava/lang/Throwable;)V
      // 095: athrow
      // 096: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 099: athrow
      // 09a: aload 2
      // 09b: getstatic net/minecraft/class_1802.field_8705 Lnet/minecraft/class_1792;
      // 09e: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0a1: goto 119
      // 0a4: aload 2
      // 0a5: getstatic net/minecraft/class_1802.field_49098 Lnet/minecraft/class_1792;
      // 0a8: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0ab: goto 119
      // 0ae: aload 2
      // 0af: getstatic net/minecraft/class_1802.field_8786 Lnet/minecraft/class_1792;
      // 0b2: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0b5: ifeq 0e1
      // 0b8: aload 0
      // 0b9: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 0bc: ifnull 0e1
      // 0bf: goto 0c6
      // 0c2: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c5: athrow
      // 0c6: aload 0
      // 0c7: aload 1
      // 0c8: aload 0
      // 0c9: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 0cc: invokevirtual k74/x/IIIllIll.IllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 0cf: ifeq 0e1
      // 0d2: goto 0d9
      // 0d5: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d8: athrow
      // 0d9: bipush 1
      // 0da: goto 119
      // 0dd: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e0: athrow
      // 0e1: bipush 0
      // 0e2: goto 119
      // 0e5: aload 2
      // 0e6: getstatic net/minecraft/class_1802.field_16482 Lnet/minecraft/class_1792;
      // 0e9: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0ec: ifeq 118
      // 0ef: aload 0
      // 0f0: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 0f3: ifnull 118
      // 0f6: goto 0fd
      // 0f9: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0fc: athrow
      // 0fd: aload 0
      // 0fe: aload 1
      // 0ff: aload 0
      // 100: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 103: invokevirtual k74/x/IIIllIll.IllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 106: ifeq 118
      // 109: goto 110
      // 10c: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 10f: athrow
      // 110: bipush 1
      // 111: goto 119
      // 114: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 117: athrow
      // 118: bipush 0
      // 119: ireturn
   }

   private void IIlI(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIll.llII Z
      // 04: ifne 0c
      // 07: return
      // 08: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b: athrow
      // 0c: aload 0
      // 0d: invokevirtual k74/x/IIIllIll.Ill ()Lk74/x/IlIlIIII;
      // 10: astore 2
      // 11: aload 2
      // 12: ifnull 22
      // 15: aload 2
      // 16: aload 0
      // 17: aload 1
      // 18: invokevirtual k74/x/IlIlIIII.IlI (Ljava/lang/Object;Lnet/minecraft/class_310;)V
      // 1b: goto 61
      // 1e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 21: athrow
      // 22: aload 1
      // 23: ifnull 61
      // 26: aload 1
      // 27: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 2a: ifnull 61
      // 2d: goto 34
      // 30: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 33: athrow
      // 34: aload 1
      // 35: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 38: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 3b: ifnull 61
      // 3e: goto 45
      // 41: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 44: athrow
      // 45: aload 1
      // 46: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 49: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 4c: aload 1
      // 4d: aload 1
      // 4e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 51: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 54: invokestatic k74/x/IIll.IlIllll (Lnet/minecraft/class_310;Lnet/minecraft/class_304;)Z
      // 57: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 5a: goto 61
      // 5d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 60: athrow
      // 61: aload 0
      // 62: bipush 0
      // 63: putfield k74/x/IIIllIll.llII Z
      // 66: return
   }

   private boolean IIll(class_310 var1, long var2, IlIIlllII var4) {
      return this.I(var1, var2, var4);
   }

   private class_243 IlII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 04: getstatic k74/x/IIllIllI.I Lk74/x/IIllIllI;
      // 07: if_acmpeq 1b
      // 0a: aload 0
      // 0b: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 0e: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 11: if_acmpne 4d
      // 14: goto 1b
      // 17: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1a: athrow
      // 1b: aload 0
      // 1c: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 1f: ifnonnull 3d
      // 22: goto 29
      // 25: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28: athrow
      // 29: aload 1
      // 2a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 2d: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 30: dconst_0
      // 31: ldc2_w -1.0
      // 34: dconst_0
      // 35: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 38: areturn
      // 39: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3c: athrow
      // 3d: aload 0
      // 3e: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 41: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 44: dconst_0
      // 45: ldc2_w 0.5
      // 48: dconst_0
      // 49: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 4c: areturn
      // 4d: aload 1
      // 4e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 51: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 54: dconst_0
      // 55: ldc2_w -1.0
      // 58: dconst_0
      // 59: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 5c: areturn
   }

   private boolean IlIl() {
      try {
         if (this.llI.IllI() == IIlIllIlI.l) {
            return true;
         }
      } catch (MatchException var1) {
         throw IIIll(var1);
      }

      return false;
   }

   private boolean IllI(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 1d
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 1d
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 2
      // 13: ifnonnull 23
      // 16: goto 1d
      // 19: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: bipush 0
      // 1e: ireturn
      // 1f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: aload 2
      // 24: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 27: dconst_0
      // 28: ldc2_w 0.5
      // 2b: dconst_0
      // 2c: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 2f: astore 3
      // 30: aload 1
      // 31: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 34: invokevirtual net/minecraft/class_746.method_33571 ()Lnet/minecraft/class_243;
      // 37: aload 3
      // 38: invokevirtual net/minecraft/class_243.method_1025 (Lnet/minecraft/class_243;)D
      // 3b: ldc2_w 20.2501
      // 3e: dcmpg
      // 3f: ifgt 4a
      // 42: bipush 1
      // 43: goto 4b
      // 46: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 49: athrow
      // 4a: bipush 0
      // 4b: ireturn
   }

   private IIlIlIl Illl(class_310 var1) {
      class_746 var2 = var1.field_1724;
      double var3 = var2.method_5829().field_1322;
      int var5 = (int)Math.floor(var3 - 1.0E-4);
      int var6 = Math.max(var1.field_1687.method_31607(), var5 - lIllI(-1388593361, 1036430522 ^ 1568456427));
      double var7 = var2.method_23317();
      double var9 = var2.method_23321();
      int var11 = var5;

      while (var11 >= var6) {
         class_2338 var12 = class_2338.method_49637(var7, var11, var9);
         class_2680 var13 = var1.field_1687.method_8320(var12);

         class_265 var14;
         label30: {
            label38: {
               try {
                  if (k74.x.IIll.lIIlIl(var13)) {
                     break label38;
                  }
               } catch (MatchException var18) {
                  throw IIIll(var18);
               }

               var14 = var13.method_26220(var1.field_1687, var12);

               try {
                  if (!var14.method_1110()) {
                     break label30;
                  }
               } catch (MatchException var17) {
                  throw IIIll(var17);
               }
            }

            var11--;
            continue;
         }

         double var15 = var12.method_10264() + var14.method_1105(class_2351.field_11052);
         return new IIlIlIl(var12.method_10062(), Math.max(0.0, var3 - var15));
      }

      return new IIlIlIl(null, Double.POSITIVE_INFINITY);
   }

   private boolean lIII(class_310 param1, IlIIlllII param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 2
      // 001: ifnull 013
      // 004: aload 0
      // 005: aload 1
      // 006: invokevirtual k74/x/IIIllIll.IIIl (Lnet/minecraft/class_310;)Z
      // 009: ifne 019
      // 00c: goto 013
      // 00f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 012: athrow
      // 013: bipush 0
      // 014: ireturn
      // 015: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 018: athrow
      // 019: aload 1
      // 01a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01d: astore 3
      // 01e: aload 3
      // 01f: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 022: aload 0
      // 023: getfield k74/x/IIIllIll.Ill I
      // 026: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 029: astore 4
      // 02b: aload 0
      // 02c: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 02f: getstatic k74/x/IIllIllI.II Lk74/x/IIllIllI;
      // 032: if_acmpne 059
      // 035: aload 4
      // 037: ifnull 053
      // 03a: goto 041
      // 03d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 040: athrow
      // 041: aload 4
      // 043: getstatic net/minecraft/class_1802.field_8705 Lnet/minecraft/class_1792;
      // 046: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 049: ifne 059
      // 04c: goto 053
      // 04f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 052: athrow
      // 053: bipush 0
      // 054: ireturn
      // 055: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 058: athrow
      // 059: aload 0
      // 05a: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 05d: getstatic k74/x/IIllIllI.l Lk74/x/IIllIllI;
      // 060: if_acmpne 087
      // 063: aload 4
      // 065: ifnull 081
      // 068: goto 06f
      // 06b: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 06e: athrow
      // 06f: aload 4
      // 071: getstatic net/minecraft/class_1802.field_49098 Lnet/minecraft/class_1792;
      // 074: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 077: ifne 087
      // 07a: goto 081
      // 07d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 080: athrow
      // 081: bipush 0
      // 082: ireturn
      // 083: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 086: athrow
      // 087: aload 0
      // 088: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 08b: getstatic k74/x/IIllIllI.I Lk74/x/IIllIllI;
      // 08e: if_acmpne 0c3
      // 091: aload 4
      // 093: ifnull 0bd
      // 096: goto 09d
      // 099: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 09c: athrow
      // 09d: aload 4
      // 09f: getstatic net/minecraft/class_1802.field_8786 Lnet/minecraft/class_1792;
      // 0a2: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0a5: ifeq 0bd
      // 0a8: goto 0af
      // 0ab: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 0b3: ifnonnull 0c3
      // 0b6: goto 0bd
      // 0b9: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0bc: athrow
      // 0bd: bipush 0
      // 0be: ireturn
      // 0bf: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 0c7: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 0ca: if_acmpne 0ff
      // 0cd: aload 4
      // 0cf: ifnull 0f9
      // 0d2: goto 0d9
      // 0d5: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d8: athrow
      // 0d9: aload 4
      // 0db: getstatic net/minecraft/class_1802.field_16482 Lnet/minecraft/class_1792;
      // 0de: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0e1: ifeq 0f9
      // 0e4: goto 0eb
      // 0e7: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 0ef: ifnonnull 0ff
      // 0f2: goto 0f9
      // 0f5: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f8: athrow
      // 0f9: bipush 0
      // 0fa: ireturn
      // 0fb: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 103: getstatic k74/x/IIllIllI.I Lk74/x/IIllIllI;
      // 106: if_acmpeq 11a
      // 109: aload 0
      // 10a: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 10d: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 110: if_acmpne 133
      // 113: goto 11a
      // 116: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 119: athrow
      // 11a: aload 0
      // 11b: aload 1
      // 11c: aload 0
      // 11d: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 120: invokevirtual k74/x/IIIllIll.IllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 123: ifne 133
      // 126: goto 12d
      // 129: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 12c: athrow
      // 12d: bipush 0
      // 12e: ireturn
      // 12f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 132: athrow
      // 133: aload 1
      // 134: invokestatic k74/x/IIll.IllIl (Lnet/minecraft/class_310;)I
      // 137: ifle 140
      // 13a: bipush 0
      // 13b: ireturn
      // 13c: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 13f: athrow
      // 140: aload 0
      // 141: getfield k74/x/IIIllIll.llI Lk74/x/IllIII;
      // 144: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 147: getstatic k74/x/IIlIllIlI.II Lk74/x/IIlIllIlI;
      // 14a: if_acmpne 1cb
      // 14d: aload 0
      // 14e: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 151: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 154: if_acmpne 16a
      // 157: goto 15e
      // 15a: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 15d: athrow
      // 15e: aload 0
      // 15f: aload 1
      // 160: invokevirtual k74/x/IIIllIll.lIll (Lnet/minecraft/class_310;)V
      // 163: goto 16a
      // 166: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 169: athrow
      // 16a: aload 3
      // 16b: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 16e: fstore 5
      // 170: ldc_w 90.0
      // 173: fstore 6
      // 175: aload 0
      // 176: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 179: getstatic k74/x/IIllIllI.I Lk74/x/IIllIllI;
      // 17c: if_acmpeq 190
      // 17f: aload 0
      // 180: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 183: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 186: if_acmpne 1c0
      // 189: goto 190
      // 18c: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 18f: athrow
      // 190: aload 0
      // 191: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 194: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 197: dconst_0
      // 198: ldc2_w 0.5
      // 19b: dconst_0
      // 19c: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 19f: astore 7
      // 1a1: aload 1
      // 1a2: aload 7
      // 1a4: invokestatic k74/x/IlllIlII.lIII (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 1a7: astore 8
      // 1a9: aload 8
      // 1ab: ifnonnull 1b4
      // 1ae: bipush 0
      // 1af: ireturn
      // 1b0: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1b3: athrow
      // 1b4: aload 8
      // 1b6: bipush 0
      // 1b7: faload
      // 1b8: fstore 5
      // 1ba: aload 8
      // 1bc: bipush 1
      // 1bd: faload
      // 1be: fstore 6
      // 1c0: aload 0
      // 1c1: aload 1
      // 1c2: aload 2
      // 1c3: fload 5
      // 1c5: fload 6
      // 1c7: invokevirtual k74/x/IIIllIll.llII (Lnet/minecraft/class_310;Lk74/x/IlIIlllII;FF)Z
      // 1ca: ireturn
      // 1cb: aload 0
      // 1cc: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 1cf: getstatic k74/x/IIllIllI.I Lk74/x/IIllIllI;
      // 1d2: if_acmpeq 1e6
      // 1d5: aload 0
      // 1d6: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 1d9: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 1dc: if_acmpne 1ec
      // 1df: goto 1e6
      // 1e2: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e5: athrow
      // 1e6: bipush 0
      // 1e7: ireturn
      // 1e8: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1eb: athrow
      // 1ec: bipush 0
      // 1ed: ireturn
   }

   private void lIIl(class_310 var1) {
      this.lIIII(var1);
      this.IIlI(var1);
      k74.x.IIll.lllIl(var1, this, lllIII.II);
      this.ll();
   }

   private boolean lIlI(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIll.IIlIl Lk74/x/IllIIl;
      // 04: astore 3
      // 05: aload 3
      // 06: ifnonnull 0f
      // 09: bipush 0
      // 0a: ireturn
      // 0b: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0e: athrow
      // 0f: iload 2
      // 10: aload 3
      // 11: invokevirtual k74/x/IllIIl.II ()I
      // 14: if_icmpge 1d
      // 17: bipush 1
      // 18: ireturn
      // 19: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c: athrow
      // 1d: aload 0
      // 1e: aconst_null
      // 1f: putfield k74/x/IIIllIll.IIlIl Lk74/x/IllIIl;
      // 22: aload 0
      // 23: dup
      // 24: getfield k74/x/IIIllIll.lll J
      // 27: lconst_1
      // 28: ladd
      // 29: putfield k74/x/IIIllIll.lll J
      // 2c: aload 3
      // 2d: invokevirtual k74/x/IllIIl.I ()Lk74/x/IlIIlllII;
      // 30: astore 4
      // 32: aload 4
      // 34: invokevirtual k74/x/IlIIlllII.Il ()I
      // 37: bipush 2
      // 38: if_icmplt 67
      // 3b: aload 4
      // 3d: invokevirtual k74/x/IlIIlllII.I ()Lk74/x/lIIIIII;
      // 40: getstatic k74/x/lIIIIII.l Lk74/x/lIIIIII;
      // 43: if_acmpne 59
      // 46: goto 4d
      // 49: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4c: athrow
      // 4d: aload 0
      // 4e: aload 1
      // 4f: invokevirtual k74/x/IIIllIll.lIIl (Lnet/minecraft/class_310;)V
      // 52: goto 65
      // 55: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 58: athrow
      // 59: aload 0
      // 5a: getstatic k74/x/IlIlIlllI.III Lk74/x/IlIlIlllI;
      // 5d: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 60: aload 0
      // 61: iload 2
      // 62: putfield k74/x/IIIllIll.IIIIl I
      // 65: bipush 1
      // 66: ireturn
      // 67: aload 0
      // 68: aload 4
      // 6a: aload 4
      // 6c: invokevirtual k74/x/IlIIlllII.Il ()I
      // 6f: bipush 1
      // 70: iadd
      // 71: invokevirtual k74/x/IlIIlllII.II (I)Lk74/x/IlIIlllII;
      // 74: putfield k74/x/IIIllIll.IlII Lk74/x/IlIIlllII;
      // 77: bipush 0
      // 78: ireturn
   }

   @Override
   public void llIl() {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: invokestatic net/minecraft/class_310.method_1551 ()Lnet/minecraft/class_310;
      // 03: astore 1
      // 04: aload 0
      // 05: aload 1
      // 06: invokevirtual k74/x/IIIllIll.lIIII (Lnet/minecraft/class_310;)V
      // 09: aload 0
      // 0a: aload 1
      // 0b: invokevirtual k74/x/IIIllIll.IIlI (Lnet/minecraft/class_310;)V
      // 0e: aload 1
      // 0f: aload 0
      // 10: getstatic k74/x/lllIII.II Lk74/x/lllIII;
      // 13: invokestatic k74/x/IIll.lllIl (Lnet/minecraft/class_310;Ljava/lang/Object;Lk74/x/lllIII;)V
      // 16: aload 0
      // 17: getfield k74/x/IIIllIll.IIlI I
      // 1a: iflt 61
      // 1d: aload 0
      // 1e: getfield k74/x/IIIllIll.IIlI I
      // 21: ldc_w -1388593362
      // 24: ldc_w -1122492666
      // 27: ldc_w 1141647805
      // 2a: ixor
      // 2b: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 2e: if_icmpge 61
      // 31: goto 38
      // 34: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 37: athrow
      // 38: aload 1
      // 39: ifnull 61
      // 3c: goto 43
      // 3f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 42: athrow
      // 43: aload 1
      // 44: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 47: ifnull 61
      // 4a: goto 51
      // 4d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 50: athrow
      // 51: aload 1
      // 52: aload 0
      // 53: aload 0
      // 54: getfield k74/x/IIIllIll.IIlI I
      // 57: invokestatic k74/x/IIll.llIllI (Lnet/minecraft/class_310;Ljava/lang/Object;I)V
      // 5a: goto 61
      // 5d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 60: athrow
      // 61: aload 0
      // 62: getfield k74/x/IIIllIll.lIl Lk74/x/IlIIIllll;
      // 65: invokevirtual k74/x/IlIIIllll.lIIl ()V
      // 68: aload 0
      // 69: invokevirtual k74/x/IIIllIll.ll ()V
      // 6c: return
   }

   private void lIll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ifnull 012
      // 004: aload 1
      // 005: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 008: ifnonnull 017
      // 00b: goto 012
      // 00e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 011: athrow
      // 012: return
      // 013: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 016: athrow
      // 017: aload 0
      // 018: invokevirtual k74/x/IIIllIll.Ill ()Lk74/x/IlIlIIII;
      // 01b: astore 2
      // 01c: aload 2
      // 01d: ifnull 089
      // 020: aload 2
      // 021: aload 0
      // 022: aload 1
      // 023: aload 1
      // 024: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 027: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 02a: bipush 0
      // 02b: invokevirtual k74/x/IlIlIIII.ll (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 02e: aload 2
      // 02f: aload 0
      // 030: aload 1
      // 031: aload 1
      // 032: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 035: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 038: bipush 0
      // 039: invokevirtual k74/x/IlIlIIII.ll (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 03c: aload 2
      // 03d: aload 0
      // 03e: aload 1
      // 03f: aload 1
      // 040: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 043: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 046: bipush 0
      // 047: invokevirtual k74/x/IlIlIIII.ll (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 04a: aload 2
      // 04b: aload 0
      // 04c: aload 1
      // 04d: aload 1
      // 04e: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 051: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 054: bipush 0
      // 055: invokevirtual k74/x/IlIlIIII.ll (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 058: aload 2
      // 059: aload 0
      // 05a: aload 1
      // 05b: aload 1
      // 05c: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 05f: getfield net/minecraft/class_315.field_1867 Lnet/minecraft/class_304;
      // 062: bipush 0
      // 063: invokevirtual k74/x/IlIlIIII.ll (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 066: aload 2
      // 067: aload 0
      // 068: aload 1
      // 069: aload 1
      // 06a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 06d: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // 070: bipush 0
      // 071: invokevirtual k74/x/IlIlIIII.ll (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 074: aload 2
      // 075: aload 0
      // 076: aload 1
      // 077: aload 1
      // 078: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 07b: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 07e: bipush 1
      // 07f: invokevirtual k74/x/IlIlIIII.ll (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 082: goto 14d
      // 085: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 088: athrow
      // 089: aload 1
      // 08a: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 08d: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 090: ifnull 0a5
      // 093: aload 1
      // 094: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 097: getfield net/minecraft/class_315.field_1894 Lnet/minecraft/class_304;
      // 09a: bipush 0
      // 09b: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 09e: goto 0a5
      // 0a1: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0a4: athrow
      // 0a5: aload 1
      // 0a6: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0a9: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 0ac: ifnull 0c1
      // 0af: aload 1
      // 0b0: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0b3: getfield net/minecraft/class_315.field_1881 Lnet/minecraft/class_304;
      // 0b6: bipush 0
      // 0b7: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 0ba: goto 0c1
      // 0bd: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c0: athrow
      // 0c1: aload 1
      // 0c2: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0c5: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 0c8: ifnull 0dd
      // 0cb: aload 1
      // 0cc: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0cf: getfield net/minecraft/class_315.field_1913 Lnet/minecraft/class_304;
      // 0d2: bipush 0
      // 0d3: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 0d6: goto 0dd
      // 0d9: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0dc: athrow
      // 0dd: aload 1
      // 0de: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0e1: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 0e4: ifnull 0f9
      // 0e7: aload 1
      // 0e8: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0eb: getfield net/minecraft/class_315.field_1849 Lnet/minecraft/class_304;
      // 0ee: bipush 0
      // 0ef: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 0f2: goto 0f9
      // 0f5: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f8: athrow
      // 0f9: aload 1
      // 0fa: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 0fd: getfield net/minecraft/class_315.field_1867 Lnet/minecraft/class_304;
      // 100: ifnull 115
      // 103: aload 1
      // 104: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 107: getfield net/minecraft/class_315.field_1867 Lnet/minecraft/class_304;
      // 10a: bipush 0
      // 10b: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 10e: goto 115
      // 111: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 114: athrow
      // 115: aload 1
      // 116: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 119: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // 11c: ifnull 131
      // 11f: aload 1
      // 120: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 123: getfield net/minecraft/class_315.field_1903 Lnet/minecraft/class_304;
      // 126: bipush 0
      // 127: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 12a: goto 131
      // 12d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 130: athrow
      // 131: aload 1
      // 132: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 135: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 138: ifnull 14d
      // 13b: aload 1
      // 13c: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 13f: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 142: bipush 1
      // 143: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 146: goto 14d
      // 149: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 14c: athrow
      // 14d: return
   }

   private boolean llII(class_310 param1, IlIIlllII param2, float param3, float param4) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: dup
      // 02: getfield k74/x/IIIllIll.lll J
      // 05: lconst_1
      // 06: ladd
      // 07: dup2_x1
      // 08: putfield k74/x/IIIllIll.lll J
      // 0b: lstore 5
      // 0d: aload 0
      // 0e: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 11: getstatic k74/x/IIllIllI.II Lk74/x/IIllIllI;
      // 14: if_acmpeq 28
      // 17: aload 0
      // 18: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 1b: getstatic k74/x/IIllIllI.l Lk74/x/IIllIllI;
      // 1e: if_acmpne 4d
      // 21: goto 28
      // 24: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 27: athrow
      // 28: aload 1
      // 29: ldc_w -1388593363
      // 2c: ldc_w 695001018
      // 2f: ldc_w -778830304
      // 32: ixor
      // 33: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 36: fload 3
      // 37: fload 4
      // 39: aload 0
      // 3a: aload 1
      // 3b: lload 5
      // 3d: aload 2
      // 3e: invokedynamic a (Lk74/x/IIIllIll;Lnet/minecraft/class_310;JLk74/x/IlIIlllII;)Lk74/x/IIIll; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIll.IIll (Lnet/minecraft/class_310;JLk74/x/IlIIlllII;)Z, ()Z ]
      // 43: invokestatic k74/x/IlllIlII.IIIll (Lnet/minecraft/class_310;IFFLk74/x/IIIll;)Z
      // 46: goto 6b
      // 49: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4c: athrow
      // 4d: aload 1
      // 4e: ldc_w -1388593364
      // 51: ldc_w 695001018
      // 54: ldc_w 444053263
      // 57: ixor
      // 58: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 5b: fload 3
      // 5c: fload 4
      // 5e: aload 0
      // 5f: aload 1
      // 60: lload 5
      // 62: aload 2
      // 63: invokedynamic a (Lk74/x/IIIllIll;Lnet/minecraft/class_310;JLk74/x/IlIIlllII;)Lk74/x/IIIll; bsm=java/lang/invoke/LambdaMetafactory.metafactory (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite; args=[ ()Z, k74/x/IIIllIll.lIlIl (Lnet/minecraft/class_310;JLk74/x/IlIIlllII;)Z, ()Z ]
      // 68: invokestatic k74/x/IlllIlII.IlII (Lnet/minecraft/class_310;IFFLk74/x/IIIll;)Z
      // 6b: istore 7
      // 6d: iload 7
      // 6f: ifne 82
      // 72: aload 0
      // 73: dup
      // 74: getfield k74/x/IIIllIll.lll J
      // 77: lconst_1
      // 78: ladd
      // 79: putfield k74/x/IIIllIll.lll J
      // 7c: bipush 0
      // 7d: ireturn
      // 7e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 81: athrow
      // 82: aload 0
      // 83: new k74/x/IllIIl
      // 86: dup
      // 87: lload 5
      // 89: aload 2
      // 8a: aload 1
      // 8b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 8e: getfield net/minecraft/class_746.field_6012 I
      // 91: bipush 2
      // 92: iadd
      // 93: invokespecial k74/x/IllIIl.<init> (JLk74/x/IlIIlllII;I)V
      // 96: putfield k74/x/IIIllIll.IIlIl Lk74/x/IllIIl;
      // 99: bipush 1
      // 9a: ireturn
   }

   private boolean lllI(class_310 param1, class_2338 param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 2
      // 01: ifnull 44
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 08: aload 2
      // 09: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 0c: invokestatic k74/x/IIll.lIIlIl (Lnet/minecraft/class_2680;)Z
      // 0f: ifeq 44
      // 12: goto 19
      // 15: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 18: athrow
      // 19: aload 1
      // 1a: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 1d: aload 2
      // 1e: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 21: invokevirtual net/minecraft/class_638.method_8320 (Lnet/minecraft/class_2338;)Lnet/minecraft/class_2680;
      // 24: aload 1
      // 25: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 28: aload 2
      // 29: invokevirtual net/minecraft/class_2338.method_10074 ()Lnet/minecraft/class_2338;
      // 2c: invokevirtual net/minecraft/class_2680.method_26220 (Lnet/minecraft/class_1922;Lnet/minecraft/class_2338;)Lnet/minecraft/class_265;
      // 2f: invokevirtual net/minecraft/class_265.method_1110 ()Z
      // 32: ifne 44
      // 35: goto 3c
      // 38: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3b: athrow
      // 3c: bipush 1
      // 3d: goto 45
      // 40: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 43: athrow
      // 44: bipush 0
      // 45: ireturn
   }

   private void IIIII(class_310 var1) {
      try {
         if (!this.IIlII(var1)) {
            this.lIIl(var1);
            return;
         }
      } catch (MatchException var4) {
         throw IIIll(var4);
      }

      try {
         if (lIIIllII.ll(var1)) {
            this.lIIl(var1);
            return;
         }
      } catch (MatchException var7) {
         throw IIIll(var7);
      }

      int var2 = var1.field_1724.field_6012;

      try {
         if (this.IIIll != IlIlIlllI.IlI) {
            this.IIIlI(var1, var2);
            return;
         }
      } catch (MatchException var6) {
         throw IIIll(var6);
      }

      IlIlIlll var3 = this.IIII(var1);

      try {
         if (var3 == null) {
            return;
         }
      } catch (MatchException var5) {
         throw IIIll(var5);
      }

      this.IIl(var1, var3, var2);
   }

   private void IIIIl(class_310 var1, int var2) {
      try {
         if (this.llI.IllI() == IIlIllIlI.l) {
            this.IIll = true;
            this.III = this.IlII(var1);
            this.IIl = 0;
            this.IIIll = IlIlIlllI.ll;
            this.IIIIl = var2;
            return;
         }
      } catch (MatchException var5) {
         throw IIIll(var5);
      }

      IlIIlllII var3 = new IlIIlllII(k74.x.lIIIIII.l, false, 0);

      try {
         if (!this.lIII(var1, var3)) {
            this.IlII = var3;
         }
      } catch (MatchException var4) {
         throw IIIll(var4);
      }
   }

   private void IIIlI(class_310 param1, int param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: invokestatic k74/x/IIllllIl.IIIIl ()[Ljava/lang/String;
      // 003: aload 1
      // 004: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 007: astore 4
      // 009: astore 3
      // 00a: aload 0
      // 00b: aload 1
      // 00c: iload 2
      // 00d: invokevirtual k74/x/IIIllIll.lIlI (Lnet/minecraft/class_310;I)Z
      // 010: ifeq 018
      // 013: return
      // 014: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 017: athrow
      // 018: aload 0
      // 019: getfield k74/x/IIIllIll.IlII Lk74/x/IlIIlllII;
      // 01c: ifnull 029
      // 01f: aload 0
      // 020: aload 1
      // 021: invokevirtual k74/x/IIIllIll.lIl (Lnet/minecraft/class_310;)V
      // 024: return
      // 025: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 028: athrow
      // 029: aload 0
      // 02a: getfield k74/x/IIIllIll.IIll Z
      // 02d: ifeq 061
      // 030: aload 0
      // 031: getfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 034: getstatic k74/x/IlIlIlllI.III Lk74/x/IlIlIlllI;
      // 037: if_acmpeq 061
      // 03a: goto 041
      // 03d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 040: athrow
      // 041: aload 0
      // 042: getfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 045: getstatic k74/x/IlIlIlllI.ll Lk74/x/IlIlIlllI;
      // 048: if_acmpeq 061
      // 04b: goto 052
      // 04e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 051: athrow
      // 052: aload 4
      // 054: ldc_w 90.0
      // 057: invokevirtual net/minecraft/class_746.method_36457 (F)V
      // 05a: goto 061
      // 05d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 060: athrow
      // 061: aload 0
      // 062: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 065: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 068: if_acmpne 088
      // 06b: aload 0
      // 06c: getfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 06f: getstatic k74/x/IlIlIlllI.III Lk74/x/IlIlIlllI;
      // 072: if_acmpeq 088
      // 075: goto 07c
      // 078: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 07b: athrow
      // 07c: aload 0
      // 07d: aload 1
      // 07e: invokevirtual k74/x/IIIllIll.lIll (Lnet/minecraft/class_310;)V
      // 081: goto 088
      // 084: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 087: athrow
      // 088: aload 0
      // 089: getfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 08c: invokevirtual k74/x/IlIlIlllI.ordinal ()I
      // 08f: tableswitch 762 1 7 41 71 237 352 491 620 660
      // 0b8: iload 2
      // 0b9: aload 0
      // 0ba: getfield k74/x/IIIllIll.IlIlI I
      // 0bd: if_icmpge 0cc
      // 0c0: goto 0c7
      // 0c3: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c6: athrow
      // 0c7: return
      // 0c8: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0cb: athrow
      // 0cc: aload 0
      // 0cd: aload 1
      // 0ce: iload 2
      // 0cf: invokevirtual k74/x/IIIllIll.IIIIl (Lnet/minecraft/class_310;I)V
      // 0d2: aload 3
      // 0d3: ifnull 389
      // 0d6: iload 2
      // 0d7: aload 0
      // 0d8: getfield k74/x/IIIllIll.IIIIl I
      // 0db: isub
      // 0dc: ldc_w -1388593373
      // 0df: ldc_w 1327282553
      // 0e2: ldc_w 377037809
      // 0e5: ixor
      // 0e6: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 0e9: if_icmplt 0fe
      // 0ec: goto 0f3
      // 0ef: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f2: athrow
      // 0f3: aload 0
      // 0f4: aload 1
      // 0f5: iload 2
      // 0f6: invokevirtual k74/x/IIIllIll.Illll (Lnet/minecraft/class_310;I)V
      // 0f9: return
      // 0fa: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0fd: athrow
      // 0fe: aload 0
      // 0ff: getfield k74/x/IIIllIll.III Lnet/minecraft/class_243;
      // 102: ifnonnull 110
      // 105: aload 0
      // 106: aload 1
      // 107: iload 2
      // 108: invokevirtual k74/x/IIIllIll.Illll (Lnet/minecraft/class_310;I)V
      // 10b: return
      // 10c: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 10f: athrow
      // 110: new net/minecraft/class_3965
      // 113: dup
      // 114: aload 0
      // 115: getfield k74/x/IIIllIll.III Lnet/minecraft/class_243;
      // 118: getstatic net/minecraft/class_2350.field_11036 Lnet/minecraft/class_2350;
      // 11b: aload 0
      // 11c: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 11f: bipush 0
      // 120: invokespecial net/minecraft/class_3965.<init> (Lnet/minecraft/class_243;Lnet/minecraft/class_2350;Lnet/minecraft/class_2338;Z)V
      // 123: astore 5
      // 125: aload 0
      // 126: getfield k74/x/IIIllIll.lIl Lk74/x/IlIIIllll;
      // 129: aload 1
      // 12a: aload 5
      // 12c: aload 0
      // 12d: getfield k74/x/IIIllIll.IIllI Lk74/x/IIlIII;
      // 130: invokevirtual k74/x/IIlIII.IllI ()Ljava/lang/Object;
      // 133: checkcast java/lang/Double
      // 136: invokevirtual java/lang/Double.floatValue ()F
      // 139: invokevirtual k74/x/IlIIIllll.IIIllII (Lnet/minecraft/class_310;Lnet/minecraft/class_3965;F)F
      // 13c: fstore 6
      // 13e: aload 0
      // 13f: dup
      // 140: getfield k74/x/IIIllIll.IIl I
      // 143: bipush 1
      // 144: iadd
      // 145: putfield k74/x/IIIllIll.IIl I
      // 148: fload 6
      // 14a: ldc 0.5
      // 14c: fcmpg
      // 14d: ifle 16b
      // 150: aload 0
      // 151: getfield k74/x/IIIllIll.IIl I
      // 154: ldc_w -1388593374
      // 157: ldc_w 1327282553
      // 15a: ldc_w 2107496073
      // 15d: ixor
      // 15e: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 161: if_icmplt 178
      // 164: goto 16b
      // 167: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16a: athrow
      // 16b: aload 0
      // 16c: aload 1
      // 16d: iload 2
      // 16e: invokevirtual k74/x/IIIllIll.Illll (Lnet/minecraft/class_310;I)V
      // 171: goto 178
      // 174: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 177: athrow
      // 178: aload 3
      // 179: ifnull 389
      // 17c: iload 2
      // 17d: aload 0
      // 17e: getfield k74/x/IIIllIll.IIIIl I
      // 181: isub
      // 182: bipush 1
      // 183: if_icmplt 389
      // 186: goto 18d
      // 189: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 18c: athrow
      // 18d: aload 0
      // 18e: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 191: getstatic k74/x/IIllIllI.II Lk74/x/IIllIllI;
      // 194: if_acmpne 1b0
      // 197: goto 19e
      // 19a: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 19d: athrow
      // 19e: aload 0
      // 19f: getstatic k74/x/IlIlIlllI.I Lk74/x/IlIlIlllI;
      // 1a2: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 1a5: aload 3
      // 1a6: ifnull 1e6
      // 1a9: goto 1b0
      // 1ac: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1af: athrow
      // 1b0: aload 0
      // 1b1: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 1b4: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 1b7: if_acmpne 1d8
      // 1ba: goto 1c1
      // 1bd: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1c0: athrow
      // 1c1: aload 0
      // 1c2: aload 1
      // 1c3: invokevirtual k74/x/IIIllIll.IIlll (Lnet/minecraft/class_310;)V
      // 1c6: aload 0
      // 1c7: getstatic k74/x/IlIlIlllI.I Lk74/x/IlIlIlllI;
      // 1ca: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 1cd: aload 3
      // 1ce: ifnull 1e6
      // 1d1: goto 1d8
      // 1d4: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1d7: athrow
      // 1d8: aload 0
      // 1d9: getstatic k74/x/IlIlIlllI.III Lk74/x/IlIlIlllI;
      // 1dc: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 1df: goto 1e6
      // 1e2: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1e5: athrow
      // 1e6: aload 0
      // 1e7: iload 2
      // 1e8: putfield k74/x/IIIllIll.IIIIl I
      // 1eb: aload 3
      // 1ec: ifnull 389
      // 1ef: aload 0
      // 1f0: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 1f3: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 1f6: if_acmpne 20c
      // 1f9: goto 200
      // 1fc: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1ff: athrow
      // 200: aload 0
      // 201: aload 1
      // 202: invokevirtual k74/x/IIIllIll.IIlll (Lnet/minecraft/class_310;)V
      // 205: goto 20c
      // 208: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 20b: athrow
      // 20c: aload 4
      // 20e: invokevirtual net/minecraft/class_746.method_24828 ()Z
      // 211: ifeq 248
      // 214: aload 0
      // 215: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 218: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 21b: if_acmpne 23b
      // 21e: goto 225
      // 221: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 224: athrow
      // 225: aload 0
      // 226: aload 1
      // 227: invokevirtual k74/x/IIIllIll.IIlI (Lnet/minecraft/class_310;)V
      // 22a: aload 0
      // 22b: getstatic k74/x/IlIlIlllI.III Lk74/x/IlIlIlllI;
      // 22e: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 231: aload 0
      // 232: iload 2
      // 233: putfield k74/x/IIIllIll.IIIIl I
      // 236: return
      // 237: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 23a: athrow
      // 23b: aload 0
      // 23c: getstatic k74/x/IlIlIlllI.II Lk74/x/IlIlIlllI;
      // 23f: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 242: aload 0
      // 243: iload 2
      // 244: putfield k74/x/IIIllIll.IIIIl I
      // 247: return
      // 248: iload 2
      // 249: aload 0
      // 24a: getfield k74/x/IIIllIll.IIIIl I
      // 24d: isub
      // 24e: ldc_w -1388593375
      // 251: ldc_w 1327282553
      // 254: ldc_w -1397791862
      // 257: ixor
      // 258: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 25b: if_icmplt 389
      // 25e: aload 0
      // 25f: aload 1
      // 260: invokevirtual k74/x/IIIllIll.IIlI (Lnet/minecraft/class_310;)V
      // 263: aload 0
      // 264: getstatic k74/x/IlIlIlllI.III Lk74/x/IlIlIlllI;
      // 267: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 26a: aload 0
      // 26b: iload 2
      // 26c: putfield k74/x/IIIllIll.IIIIl I
      // 26f: aload 3
      // 270: ifnull 389
      // 273: goto 27a
      // 276: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 279: athrow
      // 27a: iload 2
      // 27b: aload 0
      // 27c: getfield k74/x/IIIllIll.IIIIl I
      // 27f: isub
      // 280: bipush 1
      // 281: if_icmplt 389
      // 284: goto 28b
      // 287: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 28a: athrow
      // 28b: aload 0
      // 28c: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 28f: getstatic k74/x/IIllIllI.II Lk74/x/IIllIllI;
      // 292: if_acmpne 2ac
      // 295: goto 29c
      // 298: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 29b: athrow
      // 29c: aload 0
      // 29d: aload 4
      // 29f: invokevirtual k74/x/IIIllIll.Il (Lnet/minecraft/class_746;)Z
      // 2a2: ifne 2bd
      // 2a5: goto 2ac
      // 2a8: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2ab: athrow
      // 2ac: aload 0
      // 2ad: getstatic k74/x/IlIlIlllI.III Lk74/x/IlIlIlllI;
      // 2b0: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 2b3: aload 0
      // 2b4: iload 2
      // 2b5: putfield k74/x/IIIllIll.IIIIl I
      // 2b8: return
      // 2b9: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2bc: athrow
      // 2bd: new k74/x/IlIIlllII
      // 2c0: dup
      // 2c1: getstatic k74/x/lIIIIII.II Lk74/x/lIIIIII;
      // 2c4: aload 0
      // 2c5: getfield k74/x/IIIllIll.llI Lk74/x/IllIII;
      // 2c8: invokevirtual k74/x/IllIII.IllI ()Ljava/lang/Object;
      // 2cb: getstatic k74/x/IIlIllIlI.l Lk74/x/IIlIllIlI;
      // 2ce: if_acmpne 2d9
      // 2d1: bipush 1
      // 2d2: goto 2da
      // 2d5: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d8: athrow
      // 2d9: bipush 0
      // 2da: bipush 0
      // 2db: invokespecial k74/x/IlIIlllII.<init> (Lk74/x/lIIIIII;ZI)V
      // 2de: astore 5
      // 2e0: aload 0
      // 2e1: aload 1
      // 2e2: aload 5
      // 2e4: invokevirtual k74/x/IIIllIll.llI (Lnet/minecraft/class_310;Lk74/x/IlIIlllII;)Z
      // 2e7: ifne 2f7
      // 2ea: aload 0
      // 2eb: aload 5
      // 2ed: putfield k74/x/IIIllIll.IlII Lk74/x/IlIIlllII;
      // 2f0: goto 2f7
      // 2f3: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2f6: athrow
      // 2f7: aload 3
      // 2f8: ifnull 389
      // 2fb: iload 2
      // 2fc: aload 0
      // 2fd: getfield k74/x/IIIllIll.IIIIl I
      // 300: isub
      // 301: bipush 1
      // 302: if_icmplt 389
      // 305: goto 30c
      // 308: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30b: athrow
      // 30c: aload 0
      // 30d: getstatic k74/x/IlIlIlllI.III Lk74/x/IlIlIlllI;
      // 310: putfield k74/x/IIIllIll.IIIll Lk74/x/IlIlIlllI;
      // 313: aload 0
      // 314: iload 2
      // 315: putfield k74/x/IIIllIll.IIIIl I
      // 318: aload 3
      // 319: ifnull 389
      // 31c: goto 323
      // 31f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 322: athrow
      // 323: aload 0
      // 324: aload 1
      // 325: invokevirtual k74/x/IIIllIll.lIIII (Lnet/minecraft/class_310;)V
      // 328: aload 0
      // 329: getfield k74/x/IIIllIll.IIlI I
      // 32c: iflt 365
      // 32f: goto 336
      // 332: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 335: athrow
      // 336: aload 0
      // 337: getfield k74/x/IIIllIll.IIlI I
      // 33a: ldc_w -1388593376
      // 33d: ldc_w 1327282553
      // 340: ldc_w 1900865716
      // 343: ixor
      // 344: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 347: if_icmpge 365
      // 34a: goto 351
      // 34d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 350: athrow
      // 351: aload 1
      // 352: aload 0
      // 353: aload 0
      // 354: getfield k74/x/IIIllIll.IIlI I
      // 357: invokestatic k74/x/IIll.llIllI (Lnet/minecraft/class_310;Ljava/lang/Object;I)V
      // 35a: aload 3
      // 35b: ifnull 374
      // 35e: goto 365
      // 361: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 364: athrow
      // 365: aload 1
      // 366: aload 0
      // 367: getstatic k74/x/lllIII.II Lk74/x/lllIII;
      // 36a: invokestatic k74/x/IIll.lllIl (Lnet/minecraft/class_310;Ljava/lang/Object;Lk74/x/lllIII;)V
      // 36d: goto 374
      // 370: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 373: athrow
      // 374: iload 2
      // 375: aload 0
      // 376: getfield k74/x/IIIllIll.IIIIl I
      // 379: isub
      // 37a: bipush 1
      // 37b: if_icmplt 389
      // 37e: aload 0
      // 37f: invokevirtual k74/x/IIIllIll.ll ()V
      // 382: goto 389
      // 385: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 388: athrow
      // 389: return
   }

   private static MatchException IIIll(MatchException var0) {
      return var0;
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      int var17 = -333514737;
      int var10 = 0;
      short var12 = 25641;
      int var8 = "¢Ɛ昨̀㛧ӄ嚀༰阤࣠⛬಄ᚃİ䘤\u0380盨಄욍ˠ䘮ޠꛮ\u0b34욎ΐ똠ˠ囥ൄꚁĠ阮Ӑ䛣໔횋\u0590옢ༀ\uf6ed\u0c64䚏ী\ue62b࿐ᛦ˄ᚆɀءՀ䛮фꚋࠀ꘦Ԑ\ue6eaޔᚍʰ阭߰\ue6e7ൄꚄΰ☠\u0b00훧৴蚋\u0890䘯ǀ蛤Д嚈ॐ蘨Đ囬\u0bc4횆А映ྠ⛧࠴ډര蘢࿐䛯༤욈\u0e80㘥\u0600ꛫ௴ᚌ༠ثӰ蛪Ҵ皂เ옧\u0090뛬Դᚆ௰\uf624\u0600۠ఄ\uf684ඐ☥ސ훠Ƅ욇Ơ☪̠\uf6ef܄嚁\u0090ئర蛮ݴ⚊ʐ혠ƀ\ue6ef¤\uf68dÐ똯ઠ뛧ࣴ皋୰嘯р뛥ࠔ暉\u0b00㘥\u0e70훢ͤ䚂\u0011ᄪ尿\u17fa᳷პᲐ\u181a谲᫊볽ᮮ벒᭪ﰸᏺ糼ᆾ"
         .length();
      String[] var9 = new String[2];
      String var7 = "¢Ɛ昨̀㛧ӄ嚀༰阤࣠⛬಄ᚃİ䘤\u0380盨಄욍ˠ䘮ޠꛮ\u0b34욎ΐ똠ˠ囥ൄꚁĠ阮Ӑ䛣໔횋\u0590옢ༀ\uf6ed\u0c64䚏ী\ue62b࿐ᛦ˄ᚆɀءՀ䛮фꚋࠀ꘦Ԑ\ue6eaޔᚍʰ阭߰\ue6e7ൄꚄΰ☠\u0b00훧৴蚋\u0890䘯ǀ蛤Д嚈ॐ蘨Đ囬\u0bc4횆А映ྠ⛧࠴ډര蘢࿐䛯༤욈\u0e80㘥\u0600ꛫ௴ᚌ༠ثӰ蛪Ҵ皂เ옧\u0090뛬Դᚆ௰\uf624\u0600۠ఄ\uf684ඐ☥ސ훠Ƅ욇Ơ☪̠\uf6ef܄嚁\u0090ئర蛮ݴ⚊ʐ혠ƀ\ue6ef¤\uf68dÐ똯ઠ뛧ࣴ皋୰嘯р뛥ࠔ暉\u0b00㘥\u0e70훢ͤ䚂\u0011ᄪ尿\u17fa᳷პᲐ\u181a谲᫊볽ᮮ벒᭪ﰸᏺ糼ᆾ";
      int var11 = 0;

      do {
         char var13 = var7.charAt(var11);
         int var15 = 0;
         char[] var14 = var7.substring(var11 + 1, var11 + 1 + var13).toCharArray();

         do {
            int var16 = var14[var15];

            var16 = (char)(switch (var15 % 6) {
               default -> 214;
               case 1 -> 34;
               case 2 -> 214;
               case 3 -> 225;
               case 4 -> 130;
               case 5 -> 135;
            }) ^ var16;
            if (var15 % 2 == 0) {
               var14[var15] = (char)((var16 >>> 4 | var16 << 12) & 65535 ^ var12);
            } else {
               var14[var15] = (char)((var16 << 4 | var16 >>> 12) & 65535 ^ var12);
            }
         } while (++var15 < var14.length);

         var9[var10] = new String(var14);
         var10++;
         var11 = var11 + var13 + 1;
      } while (var11 < var8);

      IllII = var9;
      IllIl = new Object[var9.length];
      int var21 = 0;
      IlIll = new int[303];
      int var10001 = 0;
      byte[] var10002 = ">l\u007fþñ\u0095§¦k±Ao4\u001c\tÆÈu\u008eÄ ùa\n£\u008cÑ§\u0017Vwê«±fAH\u0094\u0017\u001b\u008dB\u008fqÆÞ\u0084\u0007Y\u0084\u0004\u001a]\u0005HëWKy\u007f\u0082P\r\u008b\u008b\u0081hI¶\t\u001f¼ñVÔ\u0003\u000e÷¸w\u0093\u0010®Á}bÑ.è\u008a¨ì\u0006mí\u0083ÚRô§.µá\u0093 \u0088èDµ¡¹7%Û¡Û\u0085ü=\u000bKxB&\u0012Uã¦âîVªT'\u0007\u0086-×<a\u0000J¥\u0092 -ÃÀ~G\u000eýÞ\u0089>EÂ.è~VÜ\u0011´àHû °ËÁ]6*\f¼\u001a`fÍÙÕj;\u0017\u0018÷\rÔl\u0005\u0092ü~\u0086\u0092½î\fÀå3/=\u0007\u008dî\u0018\u008a\u0011\u0095°Òè¸%Ê\u009e\u0085{*Òwp\u0081\u000e¨\f§\u0096Oµ#\u0088-\u0089u%¼²yèR¥\u0098N\u001e\u0096¨XY['\u0017ÝE\u008bÀm\u008a(¾n\u0018y^3¬@ØÛ\u000eYêûe\u0015\u008a\u0082(ñ\u0080ù[U\u0083ð\u009c\u008cpöPq<ý,¼e\"ýøÊ¦&)\u0000\u000eWÃ`¢c\u0083ûZ;a!ª¼\u000f\u0093D\u001eÖ¹\u000en\u0005½\u008aå\u001a\\\u001a\u000b\u0019\u0096¢(ðv3\n:Bù?ãWhJÍ\u0007r%Â.sjÕÞÿ/Õd\u001f9rà\u009cg#dïcÈØZdºÝ\u0011<}Å¶{¥Ór\ríj$©\u0099ê\u008a$<Þ<à\u009a\u0003ô\u0003\u0005\u0002\u008fA\u0095\u0001wáÙ\u0002\u0092ú\u0005|h\u00171WãoE\u0091o±g\u0004Ì¸1¡\u0010ÏÌî\u000f×\u0001\u0015m#\u0017q3\u001fê\u0007CL\u000bHUtK\u001e\u0090\u0017$ø8ø\u0011w4ßmÝ\u009c·ÜÙåÌG\u0088S^|óÂYÆ_õß \u008e\u0015úðÕ\u009a\t\u009cé¢6\u0011ÐÚ\u0006ìÆ+\u0094©ÁW\u008dV\u0087v,\u001f\u0081¿\u0016\u000f\u001bv?'¦òñó$A¬Òo\u00199E\u000e$qb\u000f{\u008b\u0090m07·=\u0005É\u008c\u0017Á¨\"ýU\u0094T\u0096>\u0086TÓùQ^\"\u001fb^ìq4£ Î¢²þ8\u0000t%>¼#É\u0087¯[\u009c\u0098\u008aU¨o\u0098\u0006º\u0019\u001dÄ\u0097ÇÚ\nPõ<Ep\u00adúäõóK\u008d.\u0093n\u0091)ù0\b\u0013¶\u0088Àô>êºÅÕýÇä®U\u0095!y³Æ\u0086°ÑÉ\u0098Ìaì\u0099è£0kÛ%\u0099¾|üÚ\f¯\"[:28°ôÌ|e\u0002ëá\u0007äË\u001f\u0083ÐÈqÍÉËÏlD\u008e\u008a¹Ñ\u009a!½SWí/à\u009cË&\u008a[ ËK\u0090jA\u009e3R /\u008aP©fÚ\u001aÄ\f\u008dãHú'ñÈ\u00851%Ý\u008eP\u009dôbdû\u0007\u0007\u001cÍùrÉD\u000721à\u0083\u0012þ,\u0002ÞÀ¬Õ\u0092ærB\u009fM\u00ad\u009cö\u008aQ\u0016ã'|}l\u0006Õ?\u0016\u0097\u009eÞÐþF\u008cX·ÿZ\u0099ndO²\u0082äïÌ|\u008d\u0013\u0083L;Ø.)ï\u0089Tb\u008caGïéQÂôg)!\u0097G±JY5UsjY\u008f÷þq:±/Ö\u001aìÈãWÅ=\fà¿z #/Óä4°,a\u0005«b\u0090§¥xÄc¤\\·\u0011ü¨á÷*ÔTP¢´è\u0002£\u0007&\tA9¡@T¢:\u0013k\ri\u00128\u0015\u0096ï#Ñ)²_\u0004 \u0090`\u008eÑ\u008d\u009aHÉ\\9Å¶õ¡×õñÕ\u0089]÷\u0082\u0004öM\u0089¨  Åå¯~«G1\u0094ìV1\u0011fcÑó}\u0081~T9]g¡\u000e[L½ÌP|\u0016&:\u0086\u009d\u0097Æî·\u0017\\\u008a\u0080\u008fDÔ`\f©6\"vd\u001e\u009b>{íéo\u009a{#\u0091\f¡r»¥VíNØÃ\u001d'}öÚP\u007fÊÁ\u0006´Ôò3ºén×«`\u008f\u009f/\u009d3äÆÏÜD\u001bÈbÁ8XíØ¤ßÄÃ´þÃ\u0012H\u009báO\u0092jà ÇÈkQ\u0095.µÚKç ö\u008325â;T¬L\u001fÀ\u00ad§\t\u0093fC@½\f=³ágÙF\u0098¶ëó@k\bx¸\u0085»\u0088·Òë4M©KÔè»\u0004-¤±¿\u009b\u0089É}\u008dA\"±¬IY\u0017ó+É3»\u0092\u0081óp2íe³DÄ¼´î\u0086÷\u0011\u001a\u0013\u007f\u0083\u0085\u0003ÿæ]GÎÃ»;rtf\u009bXqe=[Øk"
         .getBytes("ISO-8859-1");

      int var54;
      do {
         IlIll[var21] = (
               (var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255
            )
            ^ 127829013;
         var21 += 1;
         var54 = var10001 + 4;
         var10001 += 4;
      } while (var54 < var10002.length);

      String[] var5 = new String[lIllI(-1388593605, var17 ^ -2027245665)];
      int var3 = 0;
      String var2;
      int var4 = (var2 = lIlll((byte)-54, (short)-27316, -1747340790, 32451, '㒻')).length();
      int var1 = lIllI(-1388593606, var17 ^ 1221818309);
      int var19 = -1;

      label102:
      while (true) {
         var21 = lIllI(-1388593607, var17 ^ -755527397);
         String var26 = var2.substring(++var19, var19 + var1);
         byte var38 = -1;

         while (true) {
            label97: {
               char[] var56 = var26.toCharArray();
               int var68 = var56.length;
               int var6 = 0;
               var54 = var21;
               var43 = var56;
               var10001 = var68;
               char[] var80;
               int var87;
               if (var68 <= 1) {
                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               } else {
                  var54 = var21;
                  var10001 = var68;
                  if (var68 <= var6) {
                     break label97;
                  }

                  var80 = var56;
                  var68 = var21;
                  var87 = var6;
               }

               while (true) {
                  var80[var87] = (char)(var80[var87] ^ var68 ^ switch (var6 % lIllI(-1388593603, var17 ^ 449446334)) {
                     case 0 -> lIllI(-1388593604, var17 ^ -1374640320);
                     case 1 -> lIllI(-1388593613, var17 ^ 318224088);
                     case 2 -> lIllI(-1388593614, var17 ^ -237844640);
                     case 3 -> lIllI(-1388593615, var17 ^ 872701911);
                     case 4 -> lIllI(-1388593616, var17 ^ 2140689581);
                     case 5 -> lIllI(-1388593609, var17 ^ -524102483);
                     default -> lIllI(-1388593610, var17 ^ -465332118);
                  });
                  var6++;
                  if (var54 == 0) {
                     var87 = var54;
                     var80 = var43;
                     var68 = var54;
                  } else {
                     if (var10001 <= var6) {
                        break;
                     }

                     var80 = var43;
                     var68 = var54;
                     var87 = var6;
                  }
               }
            }

            String var61 = new String(var43).intern();
            switch (var38) {
               case 0:
                  var5[var3++] = var61;
                  if ((var19 += var1) >= var4) {
                     ll = var5;
                     lI = new String[lIllI(-1388593602, var17 ^ 431993198)];
                     return;
                  }

                  var1 = var2.charAt(var19);
                  break;
               default:
                  var5[var3++] = var61;
                  if ((var19 += var1) < var4) {
                     var1 = var2.charAt(var19);
                     continue label102;
                  }

                  var4 = (var2 = lIlll((byte)-63, 1202, -1747340789, '㦵', 17288)).length();
                  var1 = lIllI(-1388593608, var17 ^ -1923425881);
                  var19 = -1;
            }

            var21 = lIllI(-1388593601, var17 ^ 1899192030);
            var26 = var2.substring(++var19, var19 + var1);
            var38 = 0;
         }
      }
   }

   private static String lIlll(byte var0, short var1, int var2, char var3, char var4) {
      int var9 = var2 ^ -1747340790;
      char[] var8 = IllII[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])IllIl[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = new Throwable().getStackTrace();
         IllIl[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 4107;

      for (int var7 = 0; var7 < var8.length; var7++) {
         var8[var7] = (char)(var8[var7] ^ var7 ^ 24441 ^ switch (var7 % 13) {
            default -> 136;
            case 1 -> 145;
            case 2 -> 177;
            case 3 -> 152;
            case 4 -> 14;
            case 5 -> 137;
            case 6 -> 120;
            case 7 -> 147;
            case 8 -> 36;
            case 9 -> 89;
            case 10 -> 189;
            case 11 -> 85;
            case 12 -> 233;
         } ^ var2 ^ var0 ^ var1 ^ var3 ^ var4 ^ var6);
      }

      return new String(var8).intern();
   }

   private boolean IIlII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 63
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 63
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1687 Lnet/minecraft/class_638;
      // 16: ifnull 63
      // 19: goto 20
      // 1c: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1f: athrow
      // 20: aload 1
      // 21: getfield net/minecraft/class_310.field_1761 Lnet/minecraft/class_636;
      // 24: ifnull 63
      // 27: goto 2e
      // 2a: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2d: athrow
      // 2e: aload 1
      // 2f: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 32: ifnull 63
      // 35: goto 3c
      // 38: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 3b: athrow
      // 3c: aload 1
      // 3d: getfield net/minecraft/class_310.field_1755 Lnet/minecraft/class_437;
      // 40: ifnonnull 63
      // 43: goto 4a
      // 46: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 49: athrow
      // 4a: aload 1
      // 4b: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 4e: invokevirtual net/minecraft/class_746.method_5805 ()Z
      // 51: ifeq 63
      // 54: goto 5b
      // 57: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5a: athrow
      // 5b: bipush 1
      // 5c: goto 64
      // 5f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 62: athrow
      // 63: bipush 0
      // 64: ireturn
   }

   private int IIllI(lIlllIl var1) {
      return Math.max(0, (int)Math.ceil(this.IlllI(var1) / 50.0));
   }

   private void IIlll(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 23
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 08: ifnull 23
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 1
      // 13: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 16: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 19: ifnonnull 28
      // 1c: goto 23
      // 1f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: return
      // 24: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 27: athrow
      // 28: aload 0
      // 29: aload 1
      // 2a: invokevirtual k74/x/IIIllIll.lIll (Lnet/minecraft/class_310;)V
      // 2d: aload 0
      // 2e: bipush 1
      // 2f: putfield k74/x/IIIllIll.llII Z
      // 32: return
   }

   private boolean IllII(class_310 param1, IlIIlllII param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      //
      // Bytecode:
      // 000: aload 2
      // 001: ifnull 013
      // 004: aload 0
      // 005: aload 1
      // 006: invokevirtual k74/x/IIIllIll.IIIl (Lnet/minecraft/class_310;)Z
      // 009: ifne 019
      // 00c: goto 013
      // 00f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 012: athrow
      // 013: bipush 0
      // 014: ireturn
      // 015: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 018: athrow
      // 019: aload 1
      // 01a: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 01d: astore 3
      // 01e: aload 3
      // 01f: invokevirtual net/minecraft/class_746.method_31548 ()Lnet/minecraft/class_1661;
      // 022: aload 0
      // 023: getfield k74/x/IIIllIll.Ill I
      // 026: invokevirtual net/minecraft/class_1661.method_5438 (I)Lnet/minecraft/class_1799;
      // 029: astore 4
      // 02b: aload 0
      // 02c: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 02f: getstatic k74/x/IIllIllI.II Lk74/x/IIllIllI;
      // 032: if_acmpne 059
      // 035: aload 4
      // 037: ifnull 053
      // 03a: goto 041
      // 03d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 040: athrow
      // 041: aload 4
      // 043: getstatic net/minecraft/class_1802.field_8705 Lnet/minecraft/class_1792;
      // 046: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 049: ifne 059
      // 04c: goto 053
      // 04f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 052: athrow
      // 053: bipush 0
      // 054: ireturn
      // 055: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 058: athrow
      // 059: aload 0
      // 05a: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 05d: getstatic k74/x/IIllIllI.l Lk74/x/IIllIllI;
      // 060: if_acmpne 087
      // 063: aload 4
      // 065: ifnull 081
      // 068: goto 06f
      // 06b: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 06e: athrow
      // 06f: aload 4
      // 071: getstatic net/minecraft/class_1802.field_49098 Lnet/minecraft/class_1792;
      // 074: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 077: ifne 087
      // 07a: goto 081
      // 07d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 080: athrow
      // 081: bipush 0
      // 082: ireturn
      // 083: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 086: athrow
      // 087: aload 0
      // 088: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 08b: getstatic k74/x/IIllIllI.I Lk74/x/IIllIllI;
      // 08e: if_acmpne 0c3
      // 091: aload 4
      // 093: ifnull 0bd
      // 096: goto 09d
      // 099: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 09c: athrow
      // 09d: aload 4
      // 09f: getstatic net/minecraft/class_1802.field_8786 Lnet/minecraft/class_1792;
      // 0a2: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0a5: ifeq 0bd
      // 0a8: goto 0af
      // 0ab: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ae: athrow
      // 0af: aload 0
      // 0b0: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 0b3: ifnonnull 0c3
      // 0b6: goto 0bd
      // 0b9: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0bc: athrow
      // 0bd: bipush 0
      // 0be: ireturn
      // 0bf: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0c2: athrow
      // 0c3: aload 0
      // 0c4: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 0c7: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 0ca: if_acmpne 0ff
      // 0cd: aload 4
      // 0cf: ifnull 0f9
      // 0d2: goto 0d9
      // 0d5: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0d8: athrow
      // 0d9: aload 4
      // 0db: getstatic net/minecraft/class_1802.field_16482 Lnet/minecraft/class_1792;
      // 0de: invokevirtual net/minecraft/class_1799.method_31574 (Lnet/minecraft/class_1792;)Z
      // 0e1: ifeq 0f9
      // 0e4: goto 0eb
      // 0e7: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0ea: athrow
      // 0eb: aload 0
      // 0ec: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 0ef: ifnonnull 0ff
      // 0f2: goto 0f9
      // 0f5: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0f8: athrow
      // 0f9: bipush 0
      // 0fa: ireturn
      // 0fb: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0fe: athrow
      // 0ff: aload 0
      // 100: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 103: getstatic k74/x/IIllIllI.I Lk74/x/IIllIllI;
      // 106: if_acmpeq 11a
      // 109: aload 0
      // 10a: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 10d: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 110: if_acmpne 133
      // 113: goto 11a
      // 116: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 119: athrow
      // 11a: aload 0
      // 11b: aload 1
      // 11c: aload 0
      // 11d: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 120: invokevirtual k74/x/IIIllIll.IllI (Lnet/minecraft/class_310;Lnet/minecraft/class_2338;)Z
      // 123: ifne 133
      // 126: goto 12d
      // 129: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 12c: athrow
      // 12d: bipush 0
      // 12e: ireturn
      // 12f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 132: athrow
      // 133: aload 1
      // 134: invokestatic k74/x/IIll.IllIl (Lnet/minecraft/class_310;)I
      // 137: ifle 140
      // 13a: bipush 0
      // 13b: ireturn
      // 13c: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 13f: athrow
      // 140: aload 3
      // 141: invokevirtual net/minecraft/class_746.method_36454 ()F
      // 144: fstore 5
      // 146: aload 3
      // 147: invokevirtual net/minecraft/class_746.method_36455 ()F
      // 14a: ldc_w -90.0
      // 14d: ldc_w 90.0
      // 150: invokestatic net/minecraft/class_3532.method_15363 (FFF)F
      // 153: fstore 6
      // 155: aload 0
      // 156: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 159: getstatic k74/x/IIllIllI.I Lk74/x/IIllIllI;
      // 15c: if_acmpeq 170
      // 15f: aload 0
      // 160: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 163: getstatic k74/x/IIllIllI.lI Lk74/x/IIllIllI;
      // 166: if_acmpne 1a3
      // 169: goto 170
      // 16c: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 16f: athrow
      // 170: aload 0
      // 171: getfield k74/x/IIIllIll.lII Lnet/minecraft/class_2338;
      // 174: invokestatic net/minecraft/class_243.method_24953 (Lnet/minecraft/class_2382;)Lnet/minecraft/class_243;
      // 177: dconst_0
      // 178: ldc2_w 0.5
      // 17b: dconst_0
      // 17c: invokevirtual net/minecraft/class_243.method_1031 (DDD)Lnet/minecraft/class_243;
      // 17f: astore 7
      // 181: aload 1
      // 182: aload 7
      // 184: invokestatic k74/x/IlllIlII.lIII (Lnet/minecraft/class_310;Lnet/minecraft/class_243;)[F
      // 187: astore 8
      // 189: aload 8
      // 18b: ifnonnull 194
      // 18e: bipush 0
      // 18f: ireturn
      // 190: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 193: athrow
      // 194: aload 8
      // 196: bipush 0
      // 197: faload
      // 198: fstore 5
      // 19a: aload 8
      // 19c: bipush 1
      // 19d: faload
      // 19e: fstore 6
      // 1a0: goto 1a8
      // 1a3: ldc_w 90.0
      // 1a6: fstore 6
      // 1a8: aload 0
      // 1a9: aload 1
      // 1aa: aload 2
      // 1ab: fload 5
      // 1ad: fload 6
      // 1af: invokevirtual k74/x/IIIllIll.llII (Lnet/minecraft/class_310;Lk74/x/IlIIlllII;FF)Z
      // 1b2: ireturn
   }

   private boolean IllIl(class_310 var1) {
      try {
         if (!this.IIIl(var1)) {
            return false;
         }
      } catch (MatchException var4) {
         throw IIIll(var4);
      }

      try {
         if (this.lIll == IIllIllI.lI) {
            this.lIll(var1);
         }
      } catch (MatchException var5) {
         throw IIIll(var5);
      }

      boolean var2 = k74.x.IIll.lllIII(var1, this, this.Ill, this::lI);

      try {
         if (var2) {
            k74.x.IIll.ll(this);
         }

         return var2;
      } catch (MatchException var3) {
         throw IIIll(var3);
      }
   }

   private long IlllI(lIlllIl var1) {
      double var2 = var1.IIlI();
      double var4 = var1.IlI();

      try {
         if (var2 == var4) {
            return Math.max(0L, Math.round(var2));
         }
      } catch (MatchException var6) {
         throw IIIll(var6);
      }

      return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(var2, var4)));
   }

   private void Illll(class_310 var1, int var2) {
      IlIIlllII var3 = new IlIIlllII(k74.x.lIIIIII.l, true, 0);

      try {
         if (!this.IllII(var1, var3)) {
            this.IlII = var3;
         }
      } catch (MatchException var4) {
         throw IIIll(var4);
      }
   }

   private void lIIII(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getfield k74/x/IIIllIll.IIll Z
      // 04: ifne 0c
      // 07: return
      // 08: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 0b: athrow
      // 0c: aload 1
      // 0d: ifnull 1e
      // 10: aload 1
      // 11: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 14: ifnonnull 23
      // 17: goto 1e
      // 1a: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1d: athrow
      // 1e: return
      // 1f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: aload 1
      // 24: aload 0
      // 25: getfield k74/x/IIIllIll.IlIl F
      // 28: aload 0
      // 29: getfield k74/x/IIIllIll.Illl F
      // 2c: invokestatic k74/x/IlllIlII.I (Lnet/minecraft/class_310;FF)V
      // 2f: aload 0
      // 30: bipush 0
      // 31: putfield k74/x/IIIllIll.IIll Z
      // 34: return
   }

   private boolean lIIIl(class_310 param1) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ifnull 66
      // 04: aload 1
      // 05: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 08: ifnull 66
      // 0b: goto 12
      // 0e: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 11: athrow
      // 12: aload 0
      // 13: getfield k74/x/IIIllIll.lIll Lk74/x/IIllIllI;
      // 16: getstatic k74/x/IIllIllI.II Lk74/x/IIllIllI;
      // 19: if_acmpne 66
      // 1c: goto 23
      // 1f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 22: athrow
      // 23: aload 0
      // 24: getfield k74/x/IIIllIll.Ill I
      // 27: iflt 66
      // 2a: goto 31
      // 2d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 30: athrow
      // 31: aload 0
      // 32: getfield k74/x/IIIllIll.Ill I
      // 35: ldc_w -1388593369
      // 38: ldc_w 4763530
      // 3b: ldc_w -794096049
      // 3e: ixor
      // 3f: invokestatic k74/x/IIIllIll.lIllI (II)I
      // 42: if_icmpge 66
      // 45: goto 4c
      // 48: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 4b: athrow
      // 4c: aload 0
      // 4d: aload 1
      // 4e: getfield net/minecraft/class_310.field_1724 Lnet/minecraft/class_746;
      // 51: invokevirtual k74/x/IIIllIll.Il (Lnet/minecraft/class_746;)Z
      // 54: ifeq 66
      // 57: goto 5e
      // 5a: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 5d: athrow
      // 5e: bipush 1
      // 5f: goto 67
      // 62: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 65: athrow
      // 66: bipush 0
      // 67: ireturn
   }

   @Override
   public void IllIll(class_310 var1) {
      this.IIIII(var1);
   }

   private void lIIlI(class_310 param1, boolean param2) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: invokevirtual k74/x/IIIllIll.Ill ()Lk74/x/IlIlIIII;
      // 04: astore 3
      // 05: aload 3
      // 06: ifnull 1e
      // 09: aload 3
      // 0a: aload 0
      // 0b: aload 1
      // 0c: aload 1
      // 0d: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 10: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 13: iload 2
      // 14: invokevirtual k74/x/IlIlIIII.ll (Ljava/lang/Object;Lnet/minecraft/class_310;Lnet/minecraft/class_304;Z)V
      // 17: goto 53
      // 1a: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1d: athrow
      // 1e: aload 1
      // 1f: ifnull 53
      // 22: aload 1
      // 23: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 26: ifnull 53
      // 29: goto 30
      // 2c: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 2f: athrow
      // 30: aload 1
      // 31: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 34: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 37: ifnull 53
      // 3a: goto 41
      // 3d: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 40: athrow
      // 41: aload 1
      // 42: getfield net/minecraft/class_310.field_1690 Lnet/minecraft/class_315;
      // 45: getfield net/minecraft/class_315.field_1832 Lnet/minecraft/class_304;
      // 48: iload 2
      // 49: invokevirtual net/minecraft/class_304.method_23481 (Z)V
      // 4c: goto 53
      // 4f: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 52: athrow
      // 53: return
   }

   private boolean lIIll(class_310 var1, long var2, IlIIlllII var4) {
      return this.I(var1, var2, var4);
   }

   private static boolean lIlII(class_310 param0) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.RuntimeException: parsing failure!
      //   at org.jetbrains.java.decompiler.modules.decompiler.decompose.DomHelper.parseGraph(DomHelper.java:211)
      //   at org.jetbrains.java.decompiler.main.rels.MethodProcessor.codeToJava(MethodProcessor.java:166)
      //
      // Bytecode:
      // 00: aload 0
      // 01: getstatic net/minecraft/class_1268.field_5808 Lnet/minecraft/class_1268;
      // 04: invokestatic k74/x/IIll.IlIlIll (Lnet/minecraft/class_310;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;
      // 07: astore 1
      // 08: aload 1
      // 09: ifnull 24
      // 0c: aload 1
      // 0d: invokeinterface net/minecraft/class_1269.method_23665 ()Z 1
      // 12: ifeq 24
      // 15: goto 1c
      // 18: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 1b: athrow
      // 1c: bipush 1
      // 1d: goto 25
      // 20: invokestatic k74/x/IIIllIll.IIIll (Ljava/lang/MatchException;)Ljava/lang/MatchException;
      // 23: athrow
      // 24: bipush 0
      // 25: ireturn
   }

   private boolean lIlIl(class_310 var1, long var2, IlIIlllII var4) {
      return this.I(var1, var2, var4);
   }

   public IIIllIll() {
      int var1 = -109004534;
      super(
         IlIIllIII.lI(l(lIllI(-1388593370, var1 ^ 2117329646), lIllI(-1388593371, var1 ^ 93515100))),
         lllIIlIl.III,
         IlIIllIII.lI(l(lIllI(-1388593372, var1 ^ 400358152), lIllI(-1388593381, var1 ^ 493274221)))
      );
      this.IIII = this.IllIIll(
         new IllIII<>(IlIIllIII.lI(l(lIllI(-1388593382, var1 ^ 1705335770), lIllI(-1388593383, var1 ^ -1905751473))), lIIllIll.class, lIIllIll.l)
      );
      this.llI = this.IllIIll(
         new IllIII<>(IlIIllIII.lI(l(lIllI(-1388593384, var1 ^ -170973771), lIllI(-1388593377, var1 ^ 1709869174))), IIlIllIlI.class, IIlIllIlI.II)
      );
      this.IIlll = this.IllIIll(
         new IIlIII(IlIIllIII.lI(l(lIllI(-1388593378, var1 ^ 757835435), lIllI(-1388593379, var1 ^ 1102889637))), 8.0, 4.0, 64.0, 1.0)
            .IlII(IlIIllIII.lI(l(lIllI(-1388593380, var1 ^ 1751409264), lIllI(-1388593389, var1 ^ 707758013))))
      );
      this.IIllI = this.IllIIll(
         new IIlIII(IlIIllIII.lI(l(lIllI(-1388593390, var1 ^ -1079552749), lIllI(-1388593391, var1 ^ -1356370526))), 50.0, 1.0, 100.0, 1.0).lIlI(this::IlIl)
      );
      this.IIIII = this.IllIIll(
         new lIlllIl(IlIIllIII.Ill(l(lIllI(-1388593392, var1 ^ -350874328), lIllI(-1388593385, var1 ^ -1750387292))), 0.0, 0.0, 0.0, 300.0, 5.0)
            .lI(IlIIllIII.lI(l(lIllI(-1388593386, var1 ^ 931178447), lIllI(-1388593387, var1 ^ -1853702897))))
      );
      this.lIl = new IlIIIllll();
      this.IIIll = IlIlIlllI.IlI;
      this.Ill = -1;
      this.IIlI = -1;
      this.lIll = IIllIllI.II;
   }
}
